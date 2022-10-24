public class members {
    private long id;
    private long user_id;
    private members(long id, long user_id) {
        this.user_id=user_id;
        this.id=id;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getUser_id() {
        return user_id;
    }
    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }
}
