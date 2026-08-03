package p099h.Hchat.hooks.api.model;

import java.util.List;
import okhttp3.HttpUrl;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatChatroom {
    public static final int $stable = 8;
    public final String chatroomId;
    public final List<String> memberIds;
    public final String name;
    public final String owner;
    public final String rawDisplayNames;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WeChatChatroom(String str, String str2, String str3, List<String> list, String str4) {
        this.chatroomId = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        this.name = str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
        this.owner = str3 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str3;
        List<String> listM8407P1 = list != null ? AbstractC4166m.m8407P1(list) : null;
        this.memberIds = listM8407P1 == null ? C4173t.f13710g : listM8407P1;
        this.rawDisplayNames = str4 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getChatroomId() {
        return this.chatroomId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getMemberCount() {
        return memberCount();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<String> getMemberList() {
        return this.memberIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getOwner() {
        return this.owner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getRawDisplayNames() {
        return this.rawDisplayNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getRoomId() {
        return this.chatroomId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int memberCount() {
        return this.memberIds.size();
    }
}
