package pro.file_manager;

public class FileDataview {


    public String id;
    public String file_name;
    public String file_type;
    public String location;

    public FileDataview(String id, String file_name, String file_type, String location) {
        this.id = id;
        this.file_name = file_name;
        this.file_type = file_type;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public String getFile_type() {
        return file_type;
    }

    public void setFile_type(String file_type) {
        this.file_type = file_type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}