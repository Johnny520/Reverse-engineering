package p000;

import java.util.List;

/* JADX INFO: renamed from: qo */
/* JADX INFO: loaded from: classes.dex */
public final class C2424qo implements InterfaceC0126Cx {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0126Cx f8485a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0126Cx f8486b;

    public C2424qo(InterfaceC0126Cx r1, InterfaceC0126Cx r2) {
        this.f8485a = r1;
        this.f8486b = r2;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: a */
    public final int mo202a(String r3) {
        Integer r0 = AbstractC0042Az.m61H(r3);
        if (r0 == null) goto L7;
        return r0.intValue();
    L7:
        throw new IllegalArgumentException(r3.concat(" is not a valid map index"));
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: b */
    public final String mo203b() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: c */
    public final AbstractC1406fG mo204c() {
        return C0128Cz.f300i;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: d */
    public final int mo205d() {
        return 2;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: e */
    public final String mo206e(int r1) {
        return String.valueOf(r1);
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof C2424qo) == false) goto L16;
        C2424qo r32 = (C2424qo) r3;
        if (AbstractC0585Nj.m1134a(this.f8485a, r32.f8485a) == true) goto L11;
        return false;
    L11:
        if (AbstractC0585Nj.m1134a(this.f8486b, r32.f8486b) == true) goto L14;
        return false;
    L14:
        return true;
    L16:
        return false;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: f */
    public final boolean mo207f() {
        return false;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: h */
    public final boolean mo208h() {
        return false;
    }

    public final int hashCode() {
        int r0 = (this.f8485a.hashCode() + 710441009) * 31;
        return this.f8486b.hashCode() + r0;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: i */
    public final List mo209i(int r3) {
        if (r3 < 0) goto L6;
        return C0452Kf.f1484a;
    L6:
        throw new IllegalArgumentException(AbstractC2374ph.m4813j(r3, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: j */
    public final InterfaceC0126Cx mo210j(int r3) {
        if (r3 < 0) goto L14;
        int r32 = r3 % 2;
        if (r32 == 0) goto L12;
        if (r32 != 1) goto L10;
        return this.f8486b;
    L10:
        throw new IllegalStateException("Unreached");
    L12:
        return this.f8485a;
    L14:
        throw new IllegalArgumentException(AbstractC2374ph.m4813j(r3, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: k */
    public final boolean mo211k(int r3) {
        if (r3 < 0) goto L6;
        return false;
    L6:
        throw new IllegalArgumentException(AbstractC2374ph.m4813j(r3, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f8485a + ", " + this.f8486b + ')';
    }
}
