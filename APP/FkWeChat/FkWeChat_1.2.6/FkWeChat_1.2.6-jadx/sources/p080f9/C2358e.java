package p080f9;

/* JADX INFO: renamed from: f9.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2358e implements InterfaceC2359f {

    /* JADX INFO: renamed from: q */
    public final float f6485q;

    /* JADX INFO: renamed from: r */
    public final float f6486r;

    public C2358e(float f10, float f11) {
        this.f6485q = f10;
        this.f6486r = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p080f9.InterfaceC2359f
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo8552a(Comparable comparable, Comparable comparable2) {
        return m8558g(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    /* JADX INFO: renamed from: b */
    public boolean m8553b(float f10) {
        return f10 >= this.f6485q && f10 <= this.f6486r;
    }

    @Override // p080f9.InterfaceC2360g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Float mo8559l() {
        return Float.valueOf(this.f6486r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p080f9.InterfaceC2359f
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ boolean mo8556e(Comparable comparable) {
        return m8553b(((Number) comparable).floatValue());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2358e)) {
            return false;
        }
        if (isEmpty() && ((C2358e) obj).isEmpty()) {
            return true;
        }
        C2358e c2358e = (C2358e) obj;
        return this.f6485q == c2358e.f6485q && this.f6486r == c2358e.f6486r;
    }

    @Override // p080f9.InterfaceC2360g
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Float mo8554c() {
        return Float.valueOf(this.f6485q);
    }

    /* JADX INFO: renamed from: g */
    public boolean m8558g(float f10, float f11) {
        return f10 <= f11;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f6485q) * 31) + Float.hashCode(this.f6486r);
    }

    @Override // p080f9.InterfaceC2359f
    public boolean isEmpty() {
        return this.f6485q > this.f6486r;
    }

    public String toString() {
        return this.f6485q + ".." + this.f6486r;
    }
}
