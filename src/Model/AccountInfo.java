package Model;

public class AccountInfo {
    private Long id;
    private String accountName;
    private String address;
    private String
            mobileNo;
    private String uniqueIdType;

    private long accountInfoId;

    public AccountInfo() {
    }

    public AccountInfo(Long id, String accountName, String address, String mpbile_no, String uniqueIdType) {
        this.id = id;
        this.accountName = accountName;
        this.address = address;
        this.mobileNo = mpbile_no;
        this.uniqueIdType = uniqueIdType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMpbile_no() {
        return mobileNo;
    }

    public void setMpbile_no(String mpbile_no) {
        this.mobileNo = mpbile_no;
    }

    public String getUniqueIdType() {
        return uniqueIdType;
    }

    public void setUniqueIdType(String uniqueIdType) {
        this.uniqueIdType = uniqueIdType;
    }

    @Override
    public String toString() {
        return "AccountInfo{" +
                "id=" + id +
                ", accountName='" + accountName + '\'' +
                ", address='" + address + '\'' +
                ", mpbile_no='" + mobileNo + '\'' +
                ", uniqueIdType=" + uniqueIdType +
                '}';
    }
}
