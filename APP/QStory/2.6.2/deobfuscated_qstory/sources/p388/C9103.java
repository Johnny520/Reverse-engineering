package p388;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p267.InterfaceC8264;

/* JADX INFO: renamed from: 飘花落叶言苏楪兰哲子世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\b\u0010\u0014R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014¨\u0006\u001a"}, d2 = {"L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世哲苏兰;", "", "", "飘花落叶言子楪世苏哲兰", "Ljava/lang/String;", "getPluginId", "()Ljava/lang/String;", "pluginId", "飘花落叶言子楪世苏兰哲", "飘花落叶言子楪世哲苏兰", "pluginName", "getCloudId", "cloudId", "飘花落叶言子楪世哲兰苏", "processor", "飘花落叶言子楪世兰苏哲", "reason", "L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世苏兰哲;", "飘花落叶言子楪世兰哲苏", "L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世苏兰哲;", "()L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世苏兰哲;", "myComment", "飘花落叶言子楪苏世哲兰", "replyComment", "飘花落叶言子楪苏世兰哲", "comment", "online-plugin-sdk_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class C9103 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8264("myComment")
    private final C9104 myComment;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8264("reason")
    private final String reason;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8264("processor")
    private final String processor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8264("cloudId")
    private final String cloudId;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8264("pluginName")
    private final String pluginName;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8264("pluginId")
    private final String pluginId;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8264("comment")
    private final C9104 comment;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8264("replyComment")
    private final C9104 replyComment;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9103)) {
            return false;
        }
        C9103 c9103 = (C9103) obj;
        return AbstractC4394.m8917(this.pluginId, c9103.pluginId) && AbstractC4394.m8917(this.pluginName, c9103.pluginName) && AbstractC4394.m8917(this.cloudId, c9103.cloudId) && AbstractC4394.m8917(this.processor, c9103.processor) && AbstractC4394.m8917(this.reason, c9103.reason) && AbstractC4394.m8917(this.myComment, c9103.myComment) && AbstractC4394.m8917(this.replyComment, c9103.replyComment) && AbstractC4394.m8917(this.comment, c9103.comment);
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
        C9104 c9104 = this.myComment;
        int iHashCode6 = (iHashCode5 + (c9104 == null ? 0 : c9104.hashCode())) * 31;
        C9104 c91042 = this.replyComment;
        int iHashCode7 = (iHashCode6 + (c91042 == null ? 0 : c91042.hashCode())) * 31;
        C9104 c91043 = this.comment;
        return iHashCode7 + (c91043 != null ? c91043.hashCode() : 0);
    }

    public final String toString() {
        String str = this.pluginId;
        String str2 = this.pluginName;
        String str3 = this.cloudId;
        String str4 = this.processor;
        String str5 = this.reason;
        C9104 c9104 = this.myComment;
        C9104 c91042 = this.replyComment;
        C9104 c91043 = this.comment;
        StringBuilder sbM11551 = AbstractC6136.m11551("ExtraData(pluginId=", str, ", pluginName=", str2, ", cloudId=");
        AbstractC6136.m11530(sbM11551, str3, ", processor=", str4, ", reason=");
        sbM11551.append(str5);
        sbM11551.append(", myComment=");
        sbM11551.append(c9104);
        sbM11551.append(", replyComment=");
        sbM11551.append(c91042);
        sbM11551.append(", comment=");
        sbM11551.append(c91043);
        sbM11551.append(")");
        return sbM11551.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters and from getter */
    public final C9104 getReplyComment() {
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
    public final C9104 getMyComment() {
        return this.myComment;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and from getter */
    public final C9104 getComment() {
        return this.comment;
    }
}
