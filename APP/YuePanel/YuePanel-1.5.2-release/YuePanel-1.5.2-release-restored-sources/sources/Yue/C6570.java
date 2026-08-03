package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۣۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6570 implements InterfaceC6571<Float> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final float f16874;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final float f16875;

    public C6570(float f, float f2) {
        this.f16874 = f;
        this.f16875 = f2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    private final boolean m20891(float f, float f2) {
        return f <= f2;
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj instanceof C6570) {
            if (!isEmpty() || !((C6570) obj).isEmpty()) {
                C6570 c6570 = (C6570) obj;
                if (this.f16874 != c6570.f16874 || this.f16875 != c6570.f16875) {
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
        return (Float.hashCode(this.f16874) * 31) + Float.hashCode(this.f16875);
    }

    @Override // Yue.InterfaceC6571
    public boolean isEmpty() {
        return this.f16874 >= this.f16875;
    }

    @InterfaceC6399
    public String toString() {
        return this.f16874 + "..<" + this.f16875;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Comparable */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Yue.InterfaceC6571
    /* JADX INFO: renamed from: ۥ */
    public /* bridge */ /* synthetic */ boolean mo829(Comparable comparable) {
        return m20892(((Number) comparable).floatValue());
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m20892(float f) {
        return f >= this.f16874 && f < this.f16875;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟()Ljava/lang/Comparable; */
    @Override // Yue.InterfaceC6571
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Float mo10383() {
        return Float.valueOf(this.f16875);
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟()Ljava/lang/Comparable; */
    @Override // Yue.InterfaceC6571
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Float mo830() {
        return Float.valueOf(this.f16874);
    }
}
