package p000;

import java.util.List;

/* JADX INFO: renamed from: qo */
/* JADX INFO: loaded from: classes.dex */
public final class C2424qo implements InterfaceC0126Cx {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0126Cx f8485a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0126Cx f8486b;

    public C2424qo(InterfaceC0126Cx interfaceC0126Cx, InterfaceC0126Cx interfaceC0126Cx2) {
        this.f8485a = interfaceC0126Cx;
        this.f8486b = interfaceC0126Cx2;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: a */
    public final int mo202a(String str) {
        Integer numM61H = AbstractC0042Az.m61H(str);
        if (numM61H != null) {
            return numM61H.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid map index"));
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
    public final String mo206e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2424qo)) {
            return false;
        }
        C2424qo c2424qo = (C2424qo) obj;
        return AbstractC0585Nj.m1134a(this.f8485a, c2424qo.f8485a) && AbstractC0585Nj.m1134a(this.f8486b, c2424qo.f8486b);
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
        return this.f8486b.hashCode() + ((this.f8485a.hashCode() + 710441009) * 31);
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: i */
    public final List mo209i(int i) {
        if (i >= 0) {
            return C0452Kf.f1484a;
        }
        throw new IllegalArgumentException(AbstractC2374ph.m4813j(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: j */
    public final InterfaceC0126Cx mo210j(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC2374ph.m4813j(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.f8485a;
        }
        if (i2 == 1) {
            return this.f8486b;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: k */
    public final boolean mo211k(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(AbstractC2374ph.m4813j(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f8485a + ", " + this.f8486b + ')';
    }
}
