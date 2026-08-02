package p000;

/* JADX INFO: renamed from: fh */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0203fh {
    public static final C0166eh Companion = new C0166eh();

    /* JADX INFO: renamed from: a */
    public final boolean f2998a;

    /* JADX INFO: renamed from: b */
    public final String f2999b;

    public /* synthetic */ C0203fh(int i, String str, boolean z) {
        this.f2998a = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.f2999b = "";
        } else {
            this.f2999b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0203fh)) {
            return false;
        }
        C0203fh c0203fh = (C0203fh) obj;
        return this.f2998a == c0203fh.f2998a && t11.m5086l(this.f2999b, c0203fh.f2999b);
    }

    public final int hashCode() {
        return this.f2999b.hashCode() + (Boolean.hashCode(this.f2998a) * 31);
    }

    public final String toString() {
        return "RedPacketAutoReplyConf(isEnabled=" + this.f2998a + ", replyContent=" + this.f2999b + ")";
    }

    public C0203fh(String str, boolean z) {
        str.getClass();
        this.f2998a = z;
        this.f2999b = str;
    }

    public /* synthetic */ C0203fh() {
        this("", false);
    }
}
