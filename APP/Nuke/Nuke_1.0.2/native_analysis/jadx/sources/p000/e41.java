package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class e41 extends k31 {

    /* JADX INFO: renamed from: h */
    public final mb1 f2304h;

    public e41() {
        sl0 sl0Var = mb1.f6542p;
        this.f2304h = new mb1(false);
    }

    /* JADX INFO: renamed from: b */
    public final void m1248b(String str, Boolean bool) {
        this.f2304h.put(str, bool == null ? a41.f49h : new j41(bool));
    }

    /* JADX INFO: renamed from: c */
    public final void m1249c(String str, Integer num) {
        this.f2304h.put(str, new j41(num));
    }

    /* JADX INFO: renamed from: d */
    public final void m1250d(String str, String str2) {
        this.f2304h.put(str, str2 == null ? a41.f49h : new j41(str2));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof e41) && ((e41) obj).f2304h.equals(this.f2304h);
        }
        return true;
    }

    public final int hashCode() {
        return this.f2304h.hashCode();
    }
}
