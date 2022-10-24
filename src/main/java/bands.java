public class bands {
    private long id;
    private short isSingle;
    private long user_id;
    private bands (long id,short isSingle,long user_id) {
        this.id=id;
        this.user_id=user_id;
        this.isSingle=isSingle;
    }
    public long getId() {
        return id;
    }
    public void setId(long user_id) {
        this.id = id;
    }
    public long getUser_id () {
        return user_id;
    }
    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }
    public short getIsSingle () {
        return isSingle;
    }
    public void setIsSingle (short isSingle) {
        this.isSingle = isSingle;
    }
}
