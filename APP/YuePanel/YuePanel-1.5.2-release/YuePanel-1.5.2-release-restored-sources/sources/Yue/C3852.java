package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۥ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3852 implements InterfaceC3853<Float> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final float f7352;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final float f7353;

    public C3852(float f, float f2) {
        this.f7352 = f;
        this.f7353 = f2;
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj instanceof C3852) {
            if (!isEmpty() || !((C3852) obj).isEmpty()) {
                C3852 c3852 = (C3852) obj;
                if (this.f7352 != c3852.f7352 || this.f7353 != c3852.f7353) {
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
        return (Float.hashCode(this.f7352) * 31) + Float.hashCode(this.f7353);
    }

    @Override // Yue.InterfaceC3853, Yue.InterfaceC3854, Yue.InterfaceC6571
    public boolean isEmpty() {
        return this.f7352 > this.f7353;
    }

    @InterfaceC6399
    public String toString() {
        return this.f7352 + ".." + this.f7353;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Comparable */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Yue.InterfaceC3853, Yue.InterfaceC3854, Yue.InterfaceC6571
    /* JADX INFO: renamed from: ۥ */
    public /* bridge */ /* synthetic */ boolean mo829(Comparable comparable) {
        return m10664(((Number) comparable).floatValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Comparable */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Comparable */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Yue.InterfaceC3853
    /* JADX INFO: renamed from: ۥ۟۟ */
    public /* bridge */ /* synthetic */ boolean mo10659(Comparable comparable, Comparable comparable2) {
        return m10667(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m10664(float f) {
        return f >= this.f7352 && f <= this.f7353;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟۟()Ljava/lang/Comparable; */
    @Override // Yue.InterfaceC3854
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Float mo10384() {
        return Float.valueOf(this.f7353);
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟()Ljava/lang/Comparable; */
    @Override // Yue.InterfaceC3854, Yue.InterfaceC6571
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Float mo830() {
        return Float.valueOf(this.f7352);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean m10667(float f, float f2) {
        return f <= f2;
    }
}
