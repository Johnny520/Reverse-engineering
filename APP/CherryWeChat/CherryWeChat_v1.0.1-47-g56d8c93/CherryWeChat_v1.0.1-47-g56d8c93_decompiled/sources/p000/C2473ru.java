package p000;

import java.util.List;

/* JADX INFO: renamed from: ru */
/* JADX INFO: loaded from: classes.dex */
public final class C2473ru implements InterfaceC0126Cx {

    /* JADX INFO: renamed from: a */
    public final String f8697a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2293nu f8698b;

    public C2473ru(String str, AbstractC2293nu abstractC2293nu) {
        this.f8697a = str;
        this.f8698b = abstractC2293nu;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: a */
    public final int mo202a(String str) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: b */
    public final String mo203b() {
        return this.f8697a;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: c */
    public final AbstractC1406fG mo204c() {
        return this.f8698b;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: d */
    public final int mo205d() {
        return 0;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: e */
    public final String mo206e(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2473ru)) {
            return false;
        }
        C2473ru c2473ru = (C2473ru) obj;
        return AbstractC0585Nj.m1134a(this.f8697a, c2473ru.f8697a) && AbstractC0585Nj.m1134a(this.f8698b, c2473ru.f8698b);
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
        return (this.f8698b.hashCode() * 31) + this.f8697a.hashCode();
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: i */
    public final List mo209i(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: j */
    public final InterfaceC0126Cx mo210j(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: k */
    public final boolean mo211k(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return AbstractC2374ph.m4815l(new StringBuilder("PrimitiveDescriptor("), this.f8697a, ')');
    }
}
