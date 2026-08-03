package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۣۣۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6569 implements InterfaceC6571<Double> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final double f16872;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final double f16873;

    public C6569(double d, double d2) {
        this.f16872 = d;
        this.f16873 = d2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    private final boolean m20887(double d, double d2) {
        return d <= d2;
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj instanceof C6569) {
            if (!isEmpty() || !((C6569) obj).isEmpty()) {
                C6569 c6569 = (C6569) obj;
                if (this.f16872 != c6569.f16872 || this.f16873 != c6569.f16873) {
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
        return (Double.hashCode(this.f16872) * 31) + Double.hashCode(this.f16873);
    }

    @Override // Yue.InterfaceC6571
    public boolean isEmpty() {
        return this.f16872 >= this.f16873;
    }

    @InterfaceC6399
    public String toString() {
        return this.f16872 + "..<" + this.f16873;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Comparable */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Yue.InterfaceC6571
    /* JADX INFO: renamed from: ۥ */
    public /* bridge */ /* synthetic */ boolean mo829(Comparable comparable) {
        return m20888(((Number) comparable).doubleValue());
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m20888(double d) {
        return d >= this.f16872 && d < this.f16873;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟()Ljava/lang/Comparable; */
    @Override // Yue.InterfaceC6571
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Double mo10383() {
        return Double.valueOf(this.f16873);
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟()Ljava/lang/Comparable; */
    @Override // Yue.InterfaceC6571
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Double mo830() {
        return Double.valueOf(this.f16872);
    }
}
