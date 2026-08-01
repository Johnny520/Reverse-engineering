package p385;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import p267.InterfaceC8265;

/* JADX INFO: renamed from: 飘花落叶言苏楪兰世哲子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u000bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0003\u0010\u000b¨\u0006\u0012"}, d2 = {"L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;", "", "", "飘花落叶言子楪世苏哲兰", "Ljava/lang/Integer;", "getCommentId", "()Ljava/lang/Integer;", "commentId", "", "飘花落叶言子楪世苏兰哲", "Ljava/lang/String;", "()Ljava/lang/String;", "nickname", "飘花落叶言子楪世哲苏兰", "getUin", "uin", "飘花落叶言子楪世哲兰苏", "content", "online-plugin-sdk_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class C9071 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8265("content")
    private final String content;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8265("uin")
    private final String uin;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8265("nickname")
    private final String nickname;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8265("commentId")
    private final Integer commentId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9071)) {
            return false;
        }
        C9071 c9071 = (C9071) obj;
        return AbstractC4395.m8907(this.commentId, c9071.commentId) && AbstractC4395.m8907(this.nickname, c9071.nickname) && AbstractC4395.m8907(this.uin, c9071.uin) && AbstractC4395.m8907(this.content, c9071.content);
    }

    public final int hashCode() {
        Integer num = this.commentId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.nickname;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.uin;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.content;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "CommentInfo(commentId=" + this.commentId + ", nickname=" + this.nickname + ", uin=" + this.uin + ", content=" + this.content + ")";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters and from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and from getter */
    public final String getContent() {
        return this.content;
    }
}
