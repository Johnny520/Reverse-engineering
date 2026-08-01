package p261;

/* JADX INFO: renamed from: 飘花落叶言楪兰哲子苏世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8982 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f22824;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Long f22825;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f22826;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f22827;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22828;

    public C8982(String str, String str2, String str3, Long l, String str4) {
        this.f22828 = str;
        this.f22827 = str2;
        this.f22826 = str3;
        this.f22825 = l;
        this.f22824 = str4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        AbstractC8981.m14163(this.f22828, "data", sb);
        AbstractC8981.m14163(this.f22827, "event", sb);
        AbstractC8981.m14163(this.f22826, "id", sb);
        AbstractC8981.m14163(this.f22825, "retry", sb);
        AbstractC8981.m14163(this.f22824, "", sb);
        return sb.toString();
    }
}
