package p280t5;

import bsh.C1259t2;
import java.util.ArrayList;
import java.util.BitSet;
import p239q5.C6267r;
import p239q5.C6269t;
import p309v5.C8829k;

/* JADX INFO: renamed from: t5.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C8118i {

    /* JADX INFO: renamed from: a */
    public final C8132w f27116a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f27117b;

    /* JADX INFO: renamed from: c */
    public final C8119j f27118c;

    /* JADX INFO: renamed from: d */
    public final BitSet f27119d;

    public C8118i(C8132w c8132w) {
        if (c8132w == null) {
            C1259t2.m5095a("method == null");
            throw null;
        }
        ArrayList arrayListM31549m = c8132w.m31549m();
        this.f27116a = c8132w;
        this.f27117b = arrayListM31549m;
        this.f27118c = new C8119j(c8132w);
        this.f27119d = new BitSet(arrayListM31549m.size());
    }

    /* JADX INFO: renamed from: b */
    public static C8119j m31393b(C8132w c8132w) {
        return new C8118i(c8132w).m31394a();
    }

    /* JADX INFO: renamed from: a */
    public final C8119j m31394a() {
        if (this.f27116a.m31556u() > 0) {
            int iM31552p = this.f27116a.m31552p();
            while (iM31552p >= 0) {
                this.f27119d.clear(iM31552p);
                m31395c(iM31552p);
                iM31552p = this.f27119d.nextSetBit(0);
            }
        }
        this.f27118c.mo6829t();
        return this.f27118c;
    }

    /* JADX INFO: renamed from: c */
    public final void m31395c(int i10) {
        C6269t c6269tM31397A = this.f27118c.m31397A(i10);
        C8128s c8128s = (C8128s) this.f27117b.get(i10);
        ArrayList arrayListM31492q = c8128s.m31492q();
        int size = arrayListM31492q.size();
        if (i10 == this.f27116a.m31554r()) {
            return;
        }
        int i11 = size - 1;
        AbstractC8131v abstractC8131v = (AbstractC8131v) arrayListM31492q.get(i11);
        boolean z10 = (abstractC8131v.mo31417k().mo24659e().size() == 0 || abstractC8131v.m31516n() == null) ? false : true;
        C6269t c6269tM24786C = c6269tM31397A;
        for (int i12 = 0; i12 < size; i12++) {
            if (z10 && i12 == i11) {
                c6269tM24786C.mo6829t();
                c6269tM24786C = c6269tM24786C.m24786C();
            }
            AbstractC8131v abstractC8131v2 = (AbstractC8131v) arrayListM31492q.get(i12);
            C6267r c6267rMo31415h = abstractC8131v2.mo31415h();
            if (c6267rMo31415h == null) {
                C6267r c6267rM31516n = abstractC8131v2.m31516n();
                if (c6267rM31516n != null && c6269tM24786C.m24792x(c6267rM31516n.m24754t()) != null) {
                    c6269tM24786C.m24789F(c6269tM24786C.m24792x(c6267rM31516n.m24754t()));
                }
            } else {
                C6267r c6267rM24746K = c6267rMo31415h.m24746K();
                if (!c6267rM24746K.equals(c6269tM24786C.m24793y(c6267rM24746K))) {
                    C6267r c6267rM24785B = c6269tM24786C.m24785B(c6267rM24746K.m24752p());
                    if (c6267rM24785B != null && c6267rM24785B.m24754t() != c6267rM24746K.m24754t()) {
                        c6269tM24786C.m24789F(c6267rM24785B);
                    }
                    this.f27118c.m31399w(abstractC8131v2, c6267rM24746K);
                    c6269tM24786C.m24787D(c6267rM24746K);
                }
            }
        }
        c6269tM24786C.mo6829t();
        C8829k c8829kM31467B = c8128s.m31467B();
        int size2 = c8829kM31467B.size();
        int iM31498w = c8128s.m31498w();
        for (int i13 = 0; i13 < size2; i13++) {
            int iM33920z = c8829kM31467B.m33920z(i13);
            if (this.f27118c.m31401z(iM33920z, iM33920z == iM31498w ? c6269tM24786C : c6269tM31397A)) {
                this.f27119d.set(iM33920z);
            }
        }
    }
}
