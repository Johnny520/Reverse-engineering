package p233pd;

import gf.C1402a;
import java.util.List;
import mh.InterfaceC2844b;
import p000a.AbstractC0000a;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;
import p222p.AbstractC3199a;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3504h;
import p246qd.C3510n;
import p246qd.C3514r;
import p246qd.EnumC3513q;
import p302ud.C4305a;
import p302ud.C4320p;
import p351xe.AbstractC5792m;

/* JADX INFO: renamed from: pd.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3398i extends C3397h {

    /* JADX INFO: renamed from: s */
    public static final C3504h f10943s;

    /* JADX INFO: renamed from: t */
    public static final C3504h f10944t;

    /* JADX INFO: renamed from: p */
    public int f10945p;

    /* JADX INFO: renamed from: q */
    public C4305a f10946q;

    /* JADX INFO: renamed from: r */
    public C4305a f10947r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC3513q enumC3513q = EnumC3513q.INT;
        EnumC3513q enumC3513q2 = EnumC3513q.BOOLEAN;
        EnumC3513q enumC3513q3 = EnumC3513q.OBJECT;
        EnumC3513q enumC3513q4 = EnumC3513q.ARRAY;
        EnumC3513q enumC3513q5 = EnumC3513q.BYTE;
        EnumC3513q enumC3513q6 = EnumC3513q.SHORT;
        EnumC3513q enumC3513q7 = EnumC3513q.CHAR;
        f10943s = new C3504h(new EnumC3513q[]{enumC3513q, enumC3513q2, enumC3513q3, enumC3513q4, enumC3513q5, enumC3513q6, enumC3513q7});
        f10944t = new C3504h(new EnumC3513q[]{enumC3513q, enumC3513q5, enumC3513q6, enumC3513q7});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3398i(C1402a c1402a, int i9) {
        super(EnumC3400k.f10992v, c1402a.f4670l, 2);
        this.f10945p = i9;
        C3504h c3504h = (i9 == 1 || i9 == 2) ? f10943s : f10944t;
        InterfaceC2844b interfaceC2844b = AbstractC3508l.f11418k;
        mo7178I(new C3514r(c1402a.f4667i[0], c3504h));
        if (c1402a.f4668j == 1) {
            mo7178I(AbstractC3508l.m7368S(0L, c3504h));
        } else {
            mo7178I(new C3514r(c1402a.f4667i[1], c3504h));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p233pd.C3397h, p302ud.C4320p
    /* JADX INFO: renamed from: O */
    public final C4320p mo7167O() {
        C3398i c3398i = new C3398i(this.f10945p, this.f10942o);
        c3398i.f10946q = this.f10946q;
        c3398i.f10947r = this.f10947r;
        m8681P(c3398i);
        return c3398i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: Y */
    public final boolean mo7168Y(C4320p c4320p) {
        if (this == c4320p) {
            return true;
        }
        return (c4320p instanceof C3398i) && super.mo7168Y(c4320p) && this.f10945p == ((C3398i) c4320p).f10945p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p233pd.AbstractC3409t
    /* JADX INFO: renamed from: i0 */
    public final void mo7174i0(C4305a c4305a) {
        List list = c4305a.f14353n;
        this.f10946q = AbstractC0000a.m37T(this.f10942o, list);
        int size = list.size();
        C4305a c4305a2 = this.f10946q;
        if (size == 1) {
            this.f10947r = c4305a2;
        } else {
            this.f10947r = AbstractC0000a.m26N0(list, c4305a2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p233pd.AbstractC3409t
    /* JADX INFO: renamed from: j0 */
    public final void mo7175j0(C4305a c4305a, C4305a c4305a2) {
        if (this.f10946q == c4305a) {
            this.f10946q = c4305a2;
        }
        if (this.f10947r == c4305a) {
            this.f10947r = c4305a2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p233pd.C3397h
    /* JADX INFO: renamed from: k0 */
    public final int mo7173k0() {
        C4305a c4305a = this.f10946q;
        return c4305a == null ? this.f10942o : c4305a.f14350k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    public final void m7176l0() {
        this.f10945p = AbstractC3199a.m6828a(this.f10945p);
        C4305a c4305a = this.f10946q;
        this.f10946q = this.f10947r;
        this.f10947r = c4305a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m0 */
    public final void m7177m0() {
        if (this.f10945p == 2 && mo7179S(1).m7378L()) {
            AbstractC3508l abstractC3508lMo7179S = mo7179S(0);
            C3510n c3510n = new C3510n(1L, AbstractC3506j.f11386c);
            this.f10945p = 1;
            mo7182c0(0, abstractC3508lMo7179S);
            mo7182c0(1, c3510n);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p233pd.C3397h, p302ud.C4320p
    public final String toString() {
        String strM10487d = AbstractC5792m.m10487d(this.f14399n);
        String strConcat = String.valueOf(this.f14396k).concat("  ");
        String strValueOf = String.valueOf(mo7179S(0));
        String strM6833f = AbstractC3199a.m6833f(this.f10945p);
        String strValueOf2 = String.valueOf(mo7179S(1));
        Object objM10487d = this.f10946q;
        if (objM10487d == null) {
            objM10487d = AbstractC5792m.m10487d(this.f10942o);
        }
        String strValueOf3 = String.valueOf(objM10487d);
        String strM8679M = m8679M();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strM10487d);
        sb2.append(": ");
        sb2.append(strConcat);
        sb2.append(strValueOf);
        sb2.append(" ");
        AbstractC2091b.m5173t(sb2, strM6833f, " ", strValueOf2, "  -> ");
        return AbstractC0921a.m2255r(sb2, strValueOf3, strM8679M);
    }

    public C3398i(int i9, int i10) {
        super(EnumC3400k.f10992v, i10, 2);
        this.f10945p = i9;
    }

    public C3398i(int i9, AbstractC3508l abstractC3508l, C3510n c3510n) {
        this(i9, -1);
        mo7178I(abstractC3508l);
        mo7178I(c3510n);
    }
}
