package p280t5;

import java.util.BitSet;
import java.util.List;
import p045d5.AbstractC1897s;
import p154k5.C3991y;
import p239q5.C6260k;
import p239q5.C6267r;
import p239q5.C6268s;
import p269s5.InterfaceC7189d;

/* JADX INFO: renamed from: t5.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C8124o {

    /* JADX INFO: renamed from: a */
    public C8132w f27146a;

    /* JADX INFO: renamed from: b */
    public final BitSet f27147b;

    public C8124o(C8132w c8132w) {
        this.f27146a = c8132w;
        this.f27147b = new BitSet(c8132w.m31556u());
    }

    /* JADX INFO: renamed from: a */
    public static boolean m31440a(C6260k c6260k, C6260k c6260k2) {
        if (c6260k != c6260k2) {
            return c6260k != null && c6260k.equals(c6260k2);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static void m31441b(C8132w c8132w) {
        new C8124o(c8132w).m31443d();
    }

    /* JADX INFO: renamed from: c */
    public boolean m31442c(C8123n c8123n) {
        c8123n.m31438J(this.f27146a);
        C6268s c6268sMo31418o = c8123n.mo31418o();
        int size = c6268sMo31418o.size();
        int i10 = -1;
        C6267r c6267r = null;
        for (int i11 = 0; i11 < size; i11++) {
            C6267r c6267rM24769G = c6268sMo31418o.m24769G(i11);
            if (c6267rM24769G.mo6841i() != 0) {
                i10 = i11;
                c6267r = c6267rM24769G;
            }
        }
        if (c6267r == null) {
            return false;
        }
        C6260k c6260kM24752p = c6267r.m24752p();
        InterfaceC7189d type = c6267r.getType();
        boolean z10 = true;
        for (int i12 = 0; i12 < size; i12++) {
            if (i12 != i10) {
                C6267r c6267rM24769G2 = c6268sMo31418o.m24769G(i12);
                if (c6267rM24769G2.mo6841i() != 0) {
                    z10 = z10 && m31440a(c6260kM24752p, c6267rM24769G2.m24752p());
                    type = AbstractC1897s.m6833d(type, c6267rM24769G2.getType());
                }
            }
        }
        if (type != null) {
            C6260k c6260k = z10 ? c6260kM24752p : null;
            C6267r c6267rM31516n = c8123n.m31516n();
            if (c6267rM31516n.m24755u() == type && m31440a(c6260k, c6267rM31516n.m24752p())) {
                return false;
            }
            c8123n.m31431C(type, c6260k);
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i13 = 0; i13 < size; i13++) {
            sb2.append(c6268sMo31418o.m24769G(i13).toString());
            sb2.append(' ');
        }
        C3991y.m15914a("Couldn't map types in phi insn:", sb2);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m31443d() {
        int iM31556u = this.f27146a.m31556u();
        for (int i10 = 0; i10 < iM31556u; i10++) {
            AbstractC8131v abstractC8131vM31550n = this.f27146a.m31550n(i10);
            if (abstractC8131vM31550n != null && abstractC8131vM31550n.m31516n().mo6841i() == 0) {
                this.f27147b.set(i10);
            }
        }
        while (true) {
            int iNextSetBit = this.f27147b.nextSetBit(0);
            if (iNextSetBit < 0) {
                return;
            }
            this.f27147b.clear(iNextSetBit);
            if (m31442c((C8123n) this.f27146a.m31550n(iNextSetBit))) {
                List listM31558w = this.f27146a.m31558w(iNextSetBit);
                int size = listM31558w.size();
                for (int i11 = 0; i11 < size; i11++) {
                    AbstractC8131v abstractC8131v = (AbstractC8131v) listM31558w.get(i11);
                    C6267r c6267rM31516n = abstractC8131v.m31516n();
                    if (c6267rM31516n != null && (abstractC8131v instanceof C8123n)) {
                        this.f27147b.set(c6267rM31516n.m24754t());
                    }
                }
            }
        }
    }
}
