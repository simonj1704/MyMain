package mygroup;

public class GroupMember {
    private String name;
    private String phoneNumber;
    private String eMail;
    private Gender gender;

    public GroupMember(String name, String phoneNumber, String eMail, Gender gender){
        setName(name);
        setPhoneNumber(phoneNumber);
        seteMail(eMail);
        setGender(gender);
    }

    public void print(){

    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void seteMail(String eMail){
        this.eMail = eMail;
    }

    public String geteMail(){
        return eMail;
    }

    public void setGender(Gender gender){
        this.gender = gender;
    }

    public Gender getGender(){
        return gender;
    }
}
