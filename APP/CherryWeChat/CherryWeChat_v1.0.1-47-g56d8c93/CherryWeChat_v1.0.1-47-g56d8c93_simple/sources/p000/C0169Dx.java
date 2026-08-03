package p000;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: Dx */
/* JADX INFO: loaded from: classes.dex */
public final class C0169Dx implements InterfaceC0126Cx, InterfaceC0050B6 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0126Cx f450a;

    /* JADX INFO: renamed from: b */
    public final String f451b;

    /* JADX INFO: renamed from: c */
    public final Set f452c;

    public C0169Dx(InterfaceC0126Cx r3) {
        this.f450a = r3;
        this.f451b = r3.mo203b() + '?';
        this.f452c = AbstractC1293cr.m2544c(r3);
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: a */
    public final int mo202a(String r2) {
        return this.f450a.mo202a(r2);
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: b */
    public final String mo203b() {
        return this.f451b;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: c */
    public final AbstractC1406fG mo204c() {
        return this.f450a.mo204c();
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: d */
    public final int mo205d() {
        return this.f450a.mo205d();
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: e */
    public final String mo206e(int r2) {
        return this.f450a.mo206e(r2);
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C0169Dx) == true) goto L8;
        return false;
    L8:
        InterfaceC0126Cx r42 = ((C0169Dx) r4).f450a;
        if (AbstractC0585Nj.m1134a(this.f450a, r42) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: f */
    public final boolean mo207f() {
        return this.f450a.mo207f();
    }

    @Override // p000.InterfaceC0050B6
    /* JADX INFO: renamed from: g */
    public final Set mo89g() {
        return this.f452c;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: h */
    public final boolean mo208h() {
        return true;
    }

    public final int hashCode() {
        return this.f450a.hashCode() * 31;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: i */
    public final List mo209i(int r2) {
        return this.f450a.mo209i(r2);
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: j */
    public final InterfaceC0126Cx mo210j(int r2) {
        return this.f450a.mo210j(r2);
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: k */
    public final boolean mo211k(int r2) {
        return this.f450a.mo211k(r2);
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(this.f450a);
        r0.append('?');
        return r0.toString();
    }
}
