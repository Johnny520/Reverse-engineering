package p000;

/* JADX INFO: renamed from: A6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0007A6 extends C0521M4 {

    /* JADX INFO: renamed from: g */
    public int f4g;

    @Override // p000.C2520sy, java.util.Map
    public final void clear() {
        this.f4g = 0;
        super.clear();
    }

    @Override // p000.C2520sy
    /* JADX INFO: renamed from: g */
    public final void mo3g(C0521M4 r2) {
        this.f4g = 0;
        super.mo3g(r2);
    }

    @Override // p000.C2520sy
    /* JADX INFO: renamed from: h */
    public final Object mo4h(int r2) {
        this.f4g = 0;
        return super.mo4h(r2);
    }

    @Override // p000.C2520sy, java.util.Map
    public final int hashCode() {
        if (this.f4g != 0) goto L6;
        this.f4g = super.hashCode();
    L6:
        return this.f4g;
    }

    @Override // p000.C2520sy
    /* JADX INFO: renamed from: i */
    public final Object mo5i(int r2, Object r3) {
        this.f4g = 0;
        return super.mo5i(r2, r3);
    }

    @Override // p000.C2520sy, java.util.Map
    public final Object put(Object r2, Object r3) {
        this.f4g = 0;
        return super.put(r2, r3);
    }
}
