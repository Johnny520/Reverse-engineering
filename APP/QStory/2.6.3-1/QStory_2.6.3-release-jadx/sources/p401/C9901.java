package p401;

import androidx.activity.AbstractC0900;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p283.InterfaceC9094;

/* JADX INFO: renamed from: 飘花落叶言苏楪兰世哲子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R\u001a\u0010\u0019\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0015\u0010\u000b¨\u0006\u001a"}, m151d2 = {"L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏哲兰;", "", "", "飘花落叶言子楪世苏哲兰", "I", "飘花落叶言子楪世苏兰哲", "()I", "commentId", "", "Ljava/lang/String;", "飘花落叶言子楪世哲苏兰", "()Ljava/lang/String;", "content", "飘花落叶言子楪世哲兰苏", "createdAt", "飘花落叶言子楪世兰苏哲", "nickname", "getPluginId", "pluginId", "飘花落叶言子楪世兰哲苏", "replyId", "飘花落叶言子楪苏世哲兰", "getStatus", "status", "飘花落叶言子楪苏世兰哲", "uin", "online-plugin-sdk_release"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public final /* data */ class C9901 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC9094("replyId")
    private final int replyId;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC9094("pluginId")
    private final String pluginId;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC9094("nickname")
    private final String nickname;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC9094("createdAt")
    private final String createdAt;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC9094("content")
    private final String content;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC9094("commentId")
    private final int commentId;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC9094("uin")
    private final String uin;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC9094("status")
    private final int status;

    public C9901(int i, String str, String str2, String str3, String str4, int i2, int i3, String str5) {
        this.commentId = i;
        this.content = str;
        this.createdAt = str2;
        this.nickname = str3;
        this.pluginId = str4;
        this.replyId = i2;
        this.status = i3;
        this.uin = str5;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C9901 m15202(C9901 c9901, String str) {
        int i = c9901.commentId;
        String str2 = c9901.createdAt;
        String str3 = c9901.nickname;
        String str4 = c9901.pluginId;
        int i2 = c9901.replyId;
        int i3 = c9901.status;
        String str5 = c9901.uin;
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        return new C9901(i, str, str2, str3, str4, i2, i3, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9901)) {
            return false;
        }
        C9901 c9901 = (C9901) obj;
        return this.commentId == c9901.commentId && AbstractC5227.m9466(this.content, c9901.content) && AbstractC5227.m9466(this.createdAt, c9901.createdAt) && AbstractC5227.m9466(this.nickname, c9901.nickname) && AbstractC5227.m9466(this.pluginId, c9901.pluginId) && this.replyId == c9901.replyId && this.status == c9901.status && AbstractC5227.m9466(this.uin, c9901.uin);
    }

    public final int hashCode() {
        return this.uin.hashCode() + AbstractC0900.m704(this.status, AbstractC0900.m704(this.replyId, AbstractC7012.m12131(AbstractC7012.m12131(AbstractC7012.m12131(AbstractC7012.m12131(Integer.hashCode(this.commentId) * 31, 31, this.content), 31, this.createdAt), 31, this.nickname), 31, this.pluginId), 31), 31);
    }

    public final String toString() {
        int i = this.commentId;
        String str = this.content;
        String str2 = this.createdAt;
        String str3 = this.nickname;
        String str4 = this.pluginId;
        int i2 = this.replyId;
        int i3 = this.status;
        String str5 = this.uin;
        StringBuilder sb = new StringBuilder("Comment(commentId=");
        sb.append(i);
        sb.append(", content=");
        sb.append(str);
        sb.append(", createdAt=");
        AbstractC7012.m12136(sb, str2, ", nickname=", str3, ", pluginId=");
        sb.append(str4);
        sb.append(", replyId=");
        sb.append(i2);
        sb.append(", status=");
        sb.append(i3);
        sb.append(", uin=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters and from getter */
    public final int getReplyId() {
        return this.replyId;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters and from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters and from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters and from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters and from getter */
    public final int getCommentId() {
        return this.commentId;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters and from getter */
    public final String getUin() {
        return this.uin;
    }
}
