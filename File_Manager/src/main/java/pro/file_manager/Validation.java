package pro.file_manager;

public class Validation {
    public  static  boolean isEmpty(String val){
        val = val.trim();
        return val.isBlank();
    }
}
