package p000;

/* JADX INFO: renamed from: gi */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0241gi {
    public static final C0204fi Companion = new C0204fi();

    /* JADX INFO: renamed from: a */
    public final boolean f3529a;

    /* JADX INFO: renamed from: b */
    public final String f3530b;

    public /* synthetic */ C0241gi(int i, String str, boolean z) {
        this.f3529a = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.f3530b = "";
        } else {
            this.f3530b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0241gi)) {
            return false;
        }
        C0241gi c0241gi = (C0241gi) obj;
        return this.f3529a == c0241gi.f3529a && t11.m5086l(this.f3530b, c0241gi.f3530b);
    }

    public final int hashCode() {
        return this.f3530b.hashCode() + (Boolean.hashCode(this.f3529a) * 31);
    }

    public final String toString() {
        return "TransferAutoReplyConf(isEnabled=" + this.f3529a + ", replyContent=" + this.f3530b + ")";
    }

    public C0241gi(String str, boolean z) {
        str.getClass();
        this.f3529a = z;
        this.f3530b = str;
    }

    public /* synthetic */ C0241gi() {
        this("", false);
    }
}
