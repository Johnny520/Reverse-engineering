package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3851 implements InterfaceC3853<Double> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final double f7350;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final double f7351;

    public C3851(double d, double d2) {
        this.f7350 = d;
        this.f7351 = d2;
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj instanceof C3851) {
            if (!isEmpty() || !((C3851) obj).isEmpty()) {
                C3851 c3851 = (C3851) obj;
                if (this.f7350 != c3851.f7350 || this.f7351 != c3851.f7351) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.hashCode(this.f7350) * 31) + Double.hashCode(this.f7351);
    }

    @Override // Yue.InterfaceC3853, Yue.InterfaceC3854, Yue.InterfaceC6571
    public boolean isEmpty() {
        return this.f7350 > this.f7351;
    }

    @InterfaceC6399
    public String toString() {
        return this.f7350 + ".." + this.f7351;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Comparable */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Yue.InterfaceC3853, Yue.InterfaceC3854, Yue.InterfaceC6571
    /* JADX INFO: renamed from: ۥ */
    public /* bridge */ /* synthetic */ boolean mo829(Comparable comparable) {
        return m10660(((Number) comparable).doubleValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Comparable */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.lang.Comparable */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Yue.InterfaceC3853
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ boolean mo10659(Comparable comparable, Comparable comparable2) {
        return m10663(((Number) comparable).doubleValue(), ((Number) comparable2).doubleValue());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m10660(double d) {
        return d >= this.f7350 && d <= this.f7351;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟۟()Ljava/lang/Comparable; */
    @Override // Yue.InterfaceC3854
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Double mo10384() {
        return Double.valueOf(this.f7351);
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟()Ljava/lang/Comparable; */
    @Override // Yue.InterfaceC3854, Yue.InterfaceC6571
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Double mo830() {
        return Double.valueOf(this.f7350);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean m10663(double d, double d2) {
        return d <= d2;
    }
}
