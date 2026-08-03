package p000;

import java.util.List;

/* JADX INFO: renamed from: ru */
/* JADX INFO: loaded from: classes.dex */
public final class C2473ru implements InterfaceC0126Cx {

    /* JADX INFO: renamed from: a */
    public final String f8697a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2293nu f8698b;

    public C2473ru(String r1, AbstractC2293nu r2) {
        this.f8697a = r1;
        this.f8698b = r2;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: a */
    public final int mo202a(String r2) {
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
    public final String mo206e(int r2) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C2473ru) == true) goto L8;
        return false;
    L8:
        C2473ru r52 = (C2473ru) r5;
        String r1 = r52.f8697a;
        if (AbstractC0585Nj.m1134a(this.f8697a, r1) == true) goto L11;
    L13:
        return false;
    L11:
        if (AbstractC0585Nj.m1134a(this.f8698b, r52.f8698b) == false) goto L13;
        return true;
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
        int r0 = this.f8697a.hashCode();
        return (this.f8698b.hashCode() * 31) + r0;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: i */
    public final List mo209i(int r2) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: j */
    public final InterfaceC0126Cx mo210j(int r2) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: k */
    public final boolean mo211k(int r2) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return AbstractC2374ph.m4815l(new StringBuilder("PrimitiveDescriptor("), this.f8697a, ')');
    }
}
