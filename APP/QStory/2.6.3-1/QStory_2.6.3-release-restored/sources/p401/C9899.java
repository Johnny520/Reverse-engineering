package p401;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p283.InterfaceC9094;

/* JADX INFO: renamed from: 飘花落叶言苏楪兰世哲子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\b\u0010\u0014R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014¨\u0006\u001a"}, m151d2 = {"L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲苏兰;", "", "", "飘花落叶言子楪世苏哲兰", "Ljava/lang/String;", "getPluginId", "()Ljava/lang/String;", "pluginId", "飘花落叶言子楪世苏兰哲", "飘花落叶言子楪世哲苏兰", "pluginName", "getCloudId", "cloudId", "飘花落叶言子楪世哲兰苏", "processor", "飘花落叶言子楪世兰苏哲", "reason", "L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;", "飘花落叶言子楪世兰哲苏", "L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;", "()L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;", "myComment", "飘花落叶言子楪苏世哲兰", "replyComment", "飘花落叶言子楪苏世兰哲", "comment", "online-plugin-sdk_release"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public final /* data */ class C9899 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC9094("myComment")
    private final C9900 myComment;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC9094("reason")
    private final String reason;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC9094("processor")
    private final String processor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC9094("cloudId")
    private final String cloudId;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC9094("pluginName")
    private final String pluginName;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC9094("pluginId")
    private final String pluginId;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC9094("comment")
    private final C9900 comment;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC9094("replyComment")
    private final C9900 replyComment;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9899)) {
            return false;
        }
        C9899 c9899 = (C9899) obj;
        return AbstractC5227.m9466(this.pluginId, c9899.pluginId) && AbstractC5227.m9466(this.pluginName, c9899.pluginName) && AbstractC5227.m9466(this.cloudId, c9899.cloudId) && AbstractC5227.m9466(this.processor, c9899.processor) && AbstractC5227.m9466(this.reason, c9899.reason) && AbstractC5227.m9466(this.myComment, c9899.myComment) && AbstractC5227.m9466(this.replyComment, c9899.replyComment) && AbstractC5227.m9466(this.comment, c9899.comment);
    }

    public final int hashCode() {
        String str = this.pluginId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pluginName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cloudId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.processor;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.reason;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        C9900 c9900 = this.myComment;
        int iHashCode6 = (iHashCode5 + (c9900 == null ? 0 : c9900.hashCode())) * 31;
        C9900 c99002 = this.replyComment;
        int iHashCode7 = (iHashCode6 + (c99002 == null ? 0 : c99002.hashCode())) * 31;
        C9900 c99003 = this.comment;
        return iHashCode7 + (c99003 != null ? c99003.hashCode() : 0);
    }

    public final String toString() {
        String str = this.pluginId;
        String str2 = this.pluginName;
        String str3 = this.cloudId;
        String str4 = this.processor;
        String str5 = this.reason;
        C9900 c9900 = this.myComment;
        C9900 c99002 = this.replyComment;
        C9900 c99003 = this.comment;
        StringBuilder sbM12141 = AbstractC7012.m12141("ExtraData(pluginId=", str, ", pluginName=", str2, ", cloudId=");
        AbstractC7012.m12136(sbM12141, str3, ", processor=", str4, ", reason=");
        sbM12141.append(str5);
        sbM12141.append(", myComment=");
        sbM12141.append(c9900);
        sbM12141.append(", replyComment=");
        sbM12141.append(c99002);
        sbM12141.append(", comment=");
        sbM12141.append(c99003);
        sbM12141.append(")");
        return sbM12141.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters and from getter */
    public final C9900 getReplyComment() {
        return this.replyComment;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters and from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters and from getter */
    public final String getProcessor() {
        return this.processor;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters and from getter */
    public final String getPluginName() {
        return this.pluginName;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters and from getter */
    public final C9900 getMyComment() {
        return this.myComment;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and from getter */
    public final C9900 getComment() {
        return this.comment;
    }
}
