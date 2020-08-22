
package Lesson07_Hw;

import java.util.ArrayList;
import java.util.List;

public class BookManagement {
    ArrayList<Book> library = new ArrayList<>();
    ArrayList<String> type = new ArrayList<>();
    
    public void showLib(){
        for (int i = 0; i < library.size(); i++) {
            System.out.println(library.get(i).toString());
        }
    }
    
    public boolean addBook(Book book){
        try{
            library.add(book);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean isExistBook(String nameOfBook){
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).getName().equals(nameOfBook)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean deleteBook(String nameBook){     //1 xoa thanh cong, 0 khong tim thay sach
        BookManagement bm = new BookManagement();
        
//        if (bm.isExistBook(nameBook)) {
            for (int i = 0; i < library.size(); i++) {
                if (library.get(i).getName().equals(nameBook)) {
                    library.remove(library.get(i));
                    return true;
                }
            }
//        }
        return false;
    }
    
    public boolean updateBook(String nameOldBook, Book newbook){
        BookManagement bm = new BookManagement();
        
//        if (bm.isExistBook(nameOldBook)) {
            for (int i = 0; i < library.size(); i++) {
                if (library.get(i).getName().equals(nameOldBook)) {
                    library.set(i, newbook);
                    return true;
                }
            }
//        }
        return false;
    }
    
    
    public ArrayList<String> filterBook() {
        for (int i = 0; i < library.size(); i++) {
            String currentBookType = library.get(i).getType();
            boolean isNewType = true;
            for (int j = 0; j < type.size(); j++) {
                if (currentBookType.equals(type.get(j))) {
                    isNewType = false;
                }
            }
            if (isNewType) {
                type.add(currentBookType);
            }
        }
        return type;
    }
    
    public ArrayList<Book> orderByPrice() {
        Book temp = new Book();
        temp.setPrice(0);
        for (int j = 0; j < library.size() - 1; j++) {
        for (int i = 0; i < library.size() - 1 - j; i++) {
            if(library.get(i).getPrice() > library.get(i+1).getPrice()){
                temp.setName(library.get(i).getName());
                temp.setPrice(library.get(i).getPrice());
                temp.setOrigin(library.get(i).getOrigin());
                temp.setType(library.get(i).getType());
                temp.setNumberOfPage(library.get(i).getNumberOfPage());
                
                library.get(i).setName(library.get(i+1).getName());
                library.get(i).setPrice(library.get(i+1).getPrice());
                library.get(i).setOrigin(library.get(i+1).getOrigin());
                library.get(i).setType(library.get(i+1).getType());
                library.get(i).setNumberOfPage(library.get(i+1).getNumberOfPage());
                
                library.get(i+1).setName(temp.getName());
                library.get(i+1).setPrice(temp.getPrice());
                library.get(i+1).setOrigin(temp.getOrigin());
                library.get(i+1).setType(temp.getType());
                library.get(i+1).setNumberOfPage(temp.getNumberOfPage());
            }
        }
        }
        return library;
    }
    
}
