package p245;

/* JADX INFO: renamed from: 飘花落叶言楪兰哲子苏世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8152 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f22481;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Long f22482;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f22483;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f22484;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22485;

    public C8152(String str, String str2, String str3, Long l, String str4) {
        this.f22485 = str;
        this.f22484 = str2;
        this.f22483 = str3;
        this.f22482 = l;
        this.f22481 = str4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        AbstractC8151.m13575(this.f22485, "data", sb);
        AbstractC8151.m13575(this.f22484, "event", sb);
        AbstractC8151.m13575(this.f22483, "id", sb);
        AbstractC8151.m13575(this.f22482, "retry", sb);
        AbstractC8151.m13575(this.f22481, "", sb);
        return sb.toString();
    }
}
