public class bandMemberLinks {
    private long band_id;
    private long member_id;
    private bandMemberLinks(long band_id, long member_id) {
        this.band_id=band_id;
        this.member_id=member_id;
    }
    public long getBand_id() {
        return band_id;
    }
    public void setBand_id(long band_id) {
        this.band_id = band_id;
    }
    public long getMember_id() {
        return member_id;
    }
    public void setMember_id(long member_id) {
        this.member_id = member_id;
    }
}
