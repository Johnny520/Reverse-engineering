package p000;

import java.util.List;

/* JADX INFO: renamed from: wo */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2682wo implements InterfaceC0126Cx {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0126Cx f9242a;

    public AbstractC2682wo(InterfaceC0126Cx interfaceC0126Cx) {
        this.f9242a = interfaceC0126Cx;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: a */
    public final int mo202a(String str) {
        Integer numM61H = AbstractC0042Az.m61H(str);
        if (numM61H != null) {
            return numM61H.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
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
    public final String mo206e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC2682wo)) {
            return false;
        }
        AbstractC2682wo abstractC2682wo = (AbstractC2682wo) obj;
        return AbstractC0585Nj.m1134a(this.f9242a, abstractC2682wo.f9242a) && AbstractC0585Nj.m1134a(mo203b(), abstractC2682wo.mo203b());
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
        return mo203b().hashCode() + (this.f9242a.hashCode() * 31);
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: i */
    public final List mo209i(int i) {
        if (i >= 0) {
            return C0452Kf.f1484a;
        }
        StringBuilder sbM4816m = AbstractC2374ph.m4816m(i, "Illegal index ", ", ");
        sbM4816m.append(mo203b());
        sbM4816m.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM4816m.toString().toString());
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: j */
    public final InterfaceC0126Cx mo210j(int i) {
        if (i >= 0) {
            return this.f9242a;
        }
        StringBuilder sbM4816m = AbstractC2374ph.m4816m(i, "Illegal index ", ", ");
        sbM4816m.append(mo203b());
        sbM4816m.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM4816m.toString().toString());
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: k */
    public final boolean mo211k(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder sbM4816m = AbstractC2374ph.m4816m(i, "Illegal index ", ", ");
        sbM4816m.append(mo203b());
        sbM4816m.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM4816m.toString().toString());
    }

    public final String toString() {
        return mo203b() + '(' + this.f9242a + ')';
    }
}
