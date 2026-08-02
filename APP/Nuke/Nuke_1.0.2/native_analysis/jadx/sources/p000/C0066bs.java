package p000;

/* JADX INFO: renamed from: bs */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0066bs {
    public static final C0029as Companion = new C0029as();

    /* JADX INFO: renamed from: a */
    public final long f1000a;

    public /* synthetic */ C0066bs(long j, int i) {
        if ((i & 1) == 0) {
            this.f1000a = 1000L;
        } else {
            this.f1000a = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0066bs) && this.f1000a == ((C0066bs) obj).f1000a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1000a);
    }

    public final String toString() {
        return "ChatAvatarRotatorConf(duration=" + this.f1000a + ")";
    }

    public C0066bs(long j) {
        this.f1000a = j;
    }

    public /* synthetic */ C0066bs() {
        this(1000L);
    }
}
