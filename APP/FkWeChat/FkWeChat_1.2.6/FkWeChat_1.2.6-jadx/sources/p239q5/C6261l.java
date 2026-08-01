package p239q5;

import bsh.C1259t2;
import p309v5.AbstractC8821c;
import p309v5.C8829k;

/* JADX INFO: renamed from: q5.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6261l {

    /* JADX INFO: renamed from: a */
    public final C6271v f19429a;

    /* JADX INFO: renamed from: b */
    public final C6251c f19430b;

    /* JADX INFO: renamed from: c */
    public final C6262m f19431c;

    /* JADX INFO: renamed from: d */
    public final int[] f19432d;

    public C6261l(C6271v c6271v) {
        if (c6271v == null) {
            C1259t2.m5095a("method == null");
            throw null;
        }
        C6251c c6251cM24804b = c6271v.m24804b();
        int iM33922F = c6251cM24804b.m33922F();
        this.f19429a = c6271v;
        this.f19430b = c6251cM24804b;
        this.f19431c = new C6262m(c6271v);
        this.f19432d = AbstractC8821c.m33841i(iM33922F);
    }

    /* JADX INFO: renamed from: b */
    public static C6262m m24717b(C6271v c6271v) {
        return new C6261l(c6271v).m24718a();
    }

    /* JADX INFO: renamed from: a */
    public final C6262m m24718a() {
        int iM24805c = this.f19429a.m24805c();
        while (iM24805c >= 0) {
            AbstractC8821c.m33835c(this.f19432d, iM24805c);
            m24719c(iM24805c);
            iM24805c = AbstractC8821c.m33837e(this.f19432d, 0);
        }
        this.f19431c.mo6829t();
        return this.f19431c;
    }

    /* JADX INFO: renamed from: c */
    public final void m24719c(int i10) {
        C6269t c6269tM24723D = this.f19431c.m24723D(i10);
        C6249b c6249bM24678Q = this.f19430b.m24678Q(i10);
        C6258i c6258iM24665d = c6249bM24678Q.m24665d();
        int size = c6258iM24665d.size();
        boolean z10 = c6249bM24678Q.m24670i() && c6258iM24665d.m24705H().m24697n() != null;
        int i11 = size - 1;
        C6269t c6269tM24786C = c6269tM24723D;
        for (int i12 = 0; i12 < size; i12++) {
            if (z10 && i12 == i11) {
                c6269tM24786C.mo6829t();
                c6269tM24786C = c6269tM24786C.m24786C();
            }
            AbstractC6257h abstractC6257hM24704G = c6258iM24665d.m24704G(i12);
            C6267r c6267rM24694h = abstractC6257hM24704G.m24694h();
            if (c6267rM24694h == null) {
                C6267r c6267rM24697n = abstractC6257hM24704G.m24697n();
                if (c6267rM24697n != null && c6269tM24786C.m24792x(c6267rM24697n.m24754t()) != null) {
                    c6269tM24786C.m24789F(c6269tM24786C.m24792x(c6267rM24697n.m24754t()));
                }
            } else {
                C6267r c6267rM24746K = c6267rM24694h.m24746K();
                if (!c6267rM24746K.equals(c6269tM24786C.m24793y(c6267rM24746K))) {
                    C6267r c6267rM24785B = c6269tM24786C.m24785B(c6267rM24746K.m24752p());
                    if (c6267rM24785B != null && c6267rM24785B.m24754t() != c6267rM24746K.m24754t()) {
                        c6269tM24786C.m24789F(c6267rM24785B);
                    }
                    this.f19431c.m24725w(abstractC6257hM24704G, c6267rM24746K);
                    c6269tM24786C.m24787D(c6267rM24746K);
                }
            }
        }
        c6269tM24786C.mo6829t();
        C8829k c8829kM24669h = c6249bM24678Q.m24669h();
        int size2 = c8829kM24669h.size();
        int iM24667f = c6249bM24678Q.m24667f();
        for (int i13 = 0; i13 < size2; i13++) {
            int iM33920z = c8829kM24669h.m33920z(i13);
            if (this.f19431c.m24722C(iM33920z, iM33920z == iM24667f ? c6269tM24786C : c6269tM24723D)) {
                AbstractC8821c.m33843k(this.f19432d, iM33920z);
            }
        }
    }
}
