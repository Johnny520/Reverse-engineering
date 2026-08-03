package me.p186hd.wauxv.data.bean.info;

import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;
import p332wb.AbstractC4855en;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class GroupInfo {
    private final String displayName;
    private final List<String> memberList;
    private final String name;
    private final String nickname;
    private final String owner;
    private final String rawDisplayNames;
    private final String remarkName;
    private final String roomId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public GroupInfo(String str, String str2, String str3, String str4, String str5, List<String> list, String str6) {
        str = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        this.roomId = str;
        str2 = str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
        this.name = str2;
        this.nickname = str3 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str3;
        str4 = str4 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str4;
        this.remarkName = str4;
        this.displayName = buildDisplayName(str, str2, str4);
        this.owner = str5 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str5;
        this.memberList = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
        this.rawDisplayNames = str6 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String buildDisplayName(String str, String str2, String str3) {
        return (isEmpty(str3) || str3.equals(str2)) ? !isEmpty(str2) ? str2 : !isEmpty(str3) ? str3 : str : isEmpty(str2) ? str3 : AbstractC4855en.m9265i(str3, " (", str2, ")");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getChatroomId() {
        return this.roomId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getMemberCount() {
        return this.memberList.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public List<String> getMemberList() {
        return this.memberList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getNickName() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getNickname() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getOwner() {
        return this.owner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getRawDisplayNames() {
        return this.rawDisplayNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getRemark() {
        return this.remarkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getRemarkName() {
        return this.remarkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getRoomId() {
        return this.roomId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getUserName() {
        return this.roomId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getWxId() {
        return this.roomId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getWxid() {
        return this.roomId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int memberCount() {
        return this.memberList.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "GroupInfo(roomId=" + this.roomId + ", name=" + this.name + ", remarkName=" + this.remarkName + ", memberCount=" + this.memberList.size() + ")";
    }

    public GroupInfo(String str, String str2, String str3, List<String> list, String str4) {
        this(str, str2, str2, HttpUrl.FRAGMENT_ENCODE_SET, str3, list, str4);
    }
}
