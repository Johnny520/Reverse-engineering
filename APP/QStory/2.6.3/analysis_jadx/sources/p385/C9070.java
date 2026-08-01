package p385;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p267.InterfaceC8265;

/* JADX INFO: renamed from: 飘花落叶言苏楪兰世哲子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\b\u0010\u0014R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014¨\u0006\u001a"}, d2 = {"L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲苏兰;", "", "", "飘花落叶言子楪世苏哲兰", "Ljava/lang/String;", "getPluginId", "()Ljava/lang/String;", "pluginId", "飘花落叶言子楪世苏兰哲", "飘花落叶言子楪世哲苏兰", "pluginName", "getCloudId", "cloudId", "飘花落叶言子楪世哲兰苏", "processor", "飘花落叶言子楪世兰苏哲", "reason", "L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;", "飘花落叶言子楪世兰哲苏", "L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;", "()L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;", "myComment", "飘花落叶言子楪苏世哲兰", "replyComment", "飘花落叶言子楪苏世兰哲", "comment", "online-plugin-sdk_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class C9070 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8265("myComment")
    private final C9071 myComment;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8265("reason")
    private final String reason;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8265("processor")
    private final String processor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8265("cloudId")
    private final String cloudId;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8265("pluginName")
    private final String pluginName;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8265("pluginId")
    private final String pluginId;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8265("comment")
    private final C9071 comment;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC8265("replyComment")
    private final C9071 replyComment;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9070)) {
            return false;
        }
        C9070 c9070 = (C9070) obj;
        return AbstractC4395.m8907(this.pluginId, c9070.pluginId) && AbstractC4395.m8907(this.pluginName, c9070.pluginName) && AbstractC4395.m8907(this.cloudId, c9070.cloudId) && AbstractC4395.m8907(this.processor, c9070.processor) && AbstractC4395.m8907(this.reason, c9070.reason) && AbstractC4395.m8907(this.myComment, c9070.myComment) && AbstractC4395.m8907(this.replyComment, c9070.replyComment) && AbstractC4395.m8907(this.comment, c9070.comment);
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
        C9071 c9071 = this.myComment;
        int iHashCode6 = (iHashCode5 + (c9071 == null ? 0 : c9071.hashCode())) * 31;
        C9071 c90712 = this.replyComment;
        int iHashCode7 = (iHashCode6 + (c90712 == null ? 0 : c90712.hashCode())) * 31;
        C9071 c90713 = this.comment;
        return iHashCode7 + (c90713 != null ? c90713.hashCode() : 0);
    }

    public final String toString() {
        String str = this.pluginId;
        String str2 = this.pluginName;
        String str3 = this.cloudId;
        String str4 = this.processor;
        String str5 = this.reason;
        C9071 c9071 = this.myComment;
        C9071 c90712 = this.replyComment;
        C9071 c90713 = this.comment;
        StringBuilder sbM11582 = AbstractC6183.m11582("ExtraData(pluginId=", str, ", pluginName=", str2, ", cloudId=");
        AbstractC6183.m11577(sbM11582, str3, ", processor=", str4, ", reason=");
        sbM11582.append(str5);
        sbM11582.append(", myComment=");
        sbM11582.append(c9071);
        sbM11582.append(", replyComment=");
        sbM11582.append(c90712);
        sbM11582.append(", comment=");
        sbM11582.append(c90713);
        sbM11582.append(")");
        return sbM11582.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters and from getter */
    public final C9071 getReplyComment() {
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
    public final C9071 getMyComment() {
        return this.myComment;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and from getter */
    public final C9071 getComment() {
        return this.comment;
    }
}
