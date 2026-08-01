package p245;

/* JADX INFO: renamed from: 飘花落叶言楪兰哲子苏世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8153 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f22479;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Long f22480;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f22481;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f22482;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22483;

    public C8153(String str, String str2, String str3, Long l, String str4) {
        this.f22483 = str;
        this.f22482 = str2;
        this.f22481 = str3;
        this.f22480 = l;
        this.f22479 = str4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        AbstractC8152.m13604(this.f22483, "data", sb);
        AbstractC8152.m13604(this.f22482, "event", sb);
        AbstractC8152.m13604(this.f22481, "id", sb);
        AbstractC8152.m13604(this.f22480, "retry", sb);
        AbstractC8152.m13604(this.f22479, "", sb);
        return sb.toString();
    }
}
