package p280t5;

import bsh.C1259t2;
import java.util.ArrayList;
import java.util.HashMap;
import p239q5.C6267r;
import p239q5.C6269t;
import p309v5.AbstractC8834p;
import p376zd.C9987e;

/* JADX INFO: renamed from: t5.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C8119j extends AbstractC8834p {

    /* JADX INFO: renamed from: r */
    public final int f27120r;

    /* JADX INFO: renamed from: s */
    public final C6269t f27121s;

    /* JADX INFO: renamed from: t */
    public final C6269t[] f27122t;

    /* JADX INFO: renamed from: u */
    public final HashMap f27123u;

    public C8119j(C8132w c8132w) {
        if (c8132w == null) {
            C1259t2.m5095a("method == null");
            throw null;
        }
        ArrayList arrayListM31549m = c8132w.m31549m();
        int iM31556u = c8132w.m31556u();
        this.f27120r = iM31556u;
        C6269t c6269t = new C6269t(iM31556u);
        this.f27121s = c6269t;
        this.f27122t = new C6269t[arrayListM31549m.size()];
        this.f27123u = new HashMap();
        c6269t.mo6829t();
    }

    /* JADX INFO: renamed from: y */
    private C6269t m31396y(int i10) {
        try {
            return this.f27122t[i10];
        } catch (ArrayIndexOutOfBoundsException unused) {
            C9987e.m38645a("bogus index");
            return null;
        }
    }

    /* JADX INFO: renamed from: A */
    public C6269t m31397A(int i10) {
        C6269t c6269tM31396y = m31396y(i10);
        return c6269tM31396y != null ? c6269tM31396y.m24786C() : new C6269t(this.f27120r);
    }

    /* JADX INFO: renamed from: B */
    public void m31398B(int i10, C6269t c6269t) {
        m33929u();
        if (c6269t == null) {
            C1259t2.m5095a("specs == null");
            return;
        }
        try {
            this.f27122t[i10] = c6269t;
        } catch (ArrayIndexOutOfBoundsException unused) {
            C9987e.m38645a("bogus index");
        }
    }

    /* JADX INFO: renamed from: w */
    public void m31399w(AbstractC8131v abstractC8131v, C6267r c6267r) {
        m33929u();
        if (abstractC8131v == null) {
            C1259t2.m5095a("insn == null");
        } else if (c6267r != null) {
            this.f27123u.put(abstractC8131v, c6267r);
        } else {
            C1259t2.m5095a("spec == null");
        }
    }

    /* JADX INFO: renamed from: x */
    public C6269t m31400x(int i10) {
        C6269t c6269tM31396y = m31396y(i10);
        return c6269tM31396y != null ? c6269tM31396y : this.f27121s;
    }

    /* JADX INFO: renamed from: z */
    public boolean m31401z(int i10, C6269t c6269t) {
        C6269t c6269tM31396y = m31396y(i10);
        if (c6269tM31396y == null) {
            m31398B(i10, c6269t);
            return true;
        }
        C6269t c6269tM24786C = c6269tM31396y.m24786C();
        c6269tM24786C.m24784A(c6269t, true);
        if (c6269tM31396y.equals(c6269tM24786C)) {
            return false;
        }
        c6269tM24786C.mo6829t();
        m31398B(i10, c6269tM24786C);
        return true;
    }
}
