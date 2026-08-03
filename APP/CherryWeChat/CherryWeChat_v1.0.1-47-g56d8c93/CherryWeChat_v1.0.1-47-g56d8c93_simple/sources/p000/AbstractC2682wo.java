package p000;

import java.util.List;

/* JADX INFO: renamed from: wo */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2682wo implements InterfaceC0126Cx {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0126Cx f9242a;

    public AbstractC2682wo(InterfaceC0126Cx r1) {
        this.f9242a = r1;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: a */
    public final int mo202a(String r3) {
        Integer r0 = AbstractC0042Az.m61H(r3);
        if (r0 == null) goto L7;
        return r0.intValue();
    L7:
        throw new IllegalArgumentException(r3.concat(" is not a valid list index"));
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: c */
    public final AbstractC1406fG mo204c() {
        return C0128Cz.f299h;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: d */
    public final int mo205d() {
        return 1;
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
        if ((r3 instanceof AbstractC2682wo) == false) goto L17;
        AbstractC2682wo r32 = (AbstractC2682wo) r3;
        InterfaceC0126Cx r0 = r32.f9242a;
        if (AbstractC0585Nj.m1134a(this.f9242a, r0) == true) goto L10;
        return false;
    L10:
        if (AbstractC0585Nj.m1134a(mo203b(), r32.mo203b()) == false) goto L16;
        return true;
    L16:
        return false;
    L17:
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
        int r0 = this.f9242a.hashCode() * 31;
        return mo203b().hashCode() + r0;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: i */
    public final List mo209i(int r3) {
        if (r3 >= 0) goto L4;
        StringBuilder r32 = AbstractC2374ph.m4816m(r3, "Illegal index ", ", ");
        r32.append(mo203b());
        r32.append(" expects only non-negative indices");
        throw new IllegalArgumentException(r32.toString().toString());
    L4:
        return C0452Kf.f1484a;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: j */
    public final InterfaceC0126Cx mo210j(int r3) {
        if (r3 >= 0) goto L4;
        StringBuilder r32 = AbstractC2374ph.m4816m(r3, "Illegal index ", ", ");
        r32.append(mo203b());
        r32.append(" expects only non-negative indices");
        throw new IllegalArgumentException(r32.toString().toString());
    L4:
        return this.f9242a;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: k */
    public final boolean mo211k(int r3) {
        if (r3 < 0) goto L5;
        return false;
    L5:
        StringBuilder r32 = AbstractC2374ph.m4816m(r3, "Illegal index ", ", ");
        r32.append(mo203b());
        r32.append(" expects only non-negative indices");
        throw new IllegalArgumentException(r32.toString().toString());
    }

    public final String toString() {
        return mo203b() + '(' + this.f9242a + ')';
    }
}
