package pro.file_manager;

public class UserDataview {
    public String id;
    public String initial;
    public  String f_name;
    public String l_name;
    public String birth_d;
    public String gender;
    public  String nic;
    public String mobile;
    public String email;
    public String address;

    public UserDataview(String id, String initial, String f_name, String l_name, String birth_d, String gender, String nic, String mobile, String email, String address) {
        this.id = id;
        this.initial = initial;
        this.f_name = f_name;
        this.l_name = l_name;
        this.birth_d = birth_d;
        this.gender = gender;
        this.nic = nic;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getBirth_d() {
        return birth_d;
    }

    public void setBirth_d(String birth_d) {
        this.birth_d = birth_d;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

