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

    public C0169Dx(InterfaceC0126Cx interfaceC0126Cx) {
        this.f450a = interfaceC0126Cx;
        this.f451b = interfaceC0126Cx.mo203b() + '?';
        this.f452c = AbstractC1293cr.m2544c(interfaceC0126Cx);
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: a */
    public final int mo202a(String str) {
        return this.f450a.mo202a(str);
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
    public final String mo206e(int i) {
        return this.f450a.mo206e(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0169Dx) {
            return AbstractC0585Nj.m1134a(this.f450a, ((C0169Dx) obj).f450a);
        }
        return false;
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
    public final List mo209i(int i) {
        return this.f450a.mo209i(i);
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: j */
    public final InterfaceC0126Cx mo210j(int i) {
        return this.f450a.mo210j(i);
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: k */
    public final boolean mo211k(int i) {
        return this.f450a.mo211k(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f450a);
        sb.append('?');
        return sb.toString();
    }
}
