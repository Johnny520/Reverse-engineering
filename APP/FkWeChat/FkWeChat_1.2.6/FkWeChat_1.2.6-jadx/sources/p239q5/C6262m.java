package p239q5;

import bsh.C1259t2;
import java.util.HashMap;
import p309v5.AbstractC8834p;
import p376zd.C9987e;

/* JADX INFO: renamed from: q5.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6262m extends AbstractC8834p {

    /* JADX INFO: renamed from: r */
    public final int f19433r;

    /* JADX INFO: renamed from: s */
    public final C6269t f19434s;

    /* JADX INFO: renamed from: t */
    public final C6269t[] f19435t;

    /* JADX INFO: renamed from: u */
    public final HashMap f19436u;

    public C6262m(C6271v c6271v) {
        if (c6271v == null) {
            C1259t2.m5095a("method == null");
            throw null;
        }
        C6251c c6251cM24804b = c6271v.m24804b();
        int iM33922F = c6251cM24804b.m33922F();
        int iM24677P = c6251cM24804b.m24677P();
        this.f19433r = iM24677P;
        C6269t c6269t = new C6269t(iM24677P);
        this.f19434s = c6269t;
        this.f19435t = new C6269t[iM33922F];
        this.f19436u = new HashMap(c6251cM24804b.m24675N());
        c6269t.mo6829t();
    }

    /* JADX INFO: renamed from: A */
    public C6269t m24720A(C6249b c6249b) {
        return m24728z(c6249b.mo6715a());
    }

    /* JADX INFO: renamed from: B */
    public final C6269t m24721B(int i10) {
        try {
            return this.f19435t[i10];
        } catch (ArrayIndexOutOfBoundsException unused) {
            C9987e.m38645a("bogus label");
            return null;
        }
    }

    /* JADX INFO: renamed from: C */
    public boolean m24722C(int i10, C6269t c6269t) {
        C6269t c6269tM24721B = m24721B(i10);
        if (c6269tM24721B == null) {
            m24724E(i10, c6269t);
            return true;
        }
        C6269t c6269tM24786C = c6269tM24721B.m24786C();
        if (c6269tM24721B.size() != 0) {
            c6269tM24786C.m24784A(c6269t, true);
        } else {
            c6269tM24786C = c6269t.m24786C();
        }
        if (c6269tM24721B.equals(c6269tM24786C)) {
            return false;
        }
        c6269tM24786C.mo6829t();
        m24724E(i10, c6269tM24786C);
        return true;
    }

    /* JADX INFO: renamed from: D */
    public C6269t m24723D(int i10) {
        C6269t c6269tM24721B = m24721B(i10);
        return c6269tM24721B != null ? c6269tM24721B.m24786C() : new C6269t(this.f19433r);
    }

    /* JADX INFO: renamed from: E */
    public void m24724E(int i10, C6269t c6269t) {
        m33929u();
        if (c6269t == null) {
            C1259t2.m5095a("specs == null");
            return;
        }
        try {
            this.f19435t[i10] = c6269t;
        } catch (ArrayIndexOutOfBoundsException unused) {
            C9987e.m38645a("bogus label");
        }
    }

    /* JADX INFO: renamed from: w */
    public void m24725w(AbstractC6257h abstractC6257h, C6267r c6267r) {
        m33929u();
        if (abstractC6257h == null) {
            C1259t2.m5095a("insn == null");
        } else if (c6267r != null) {
            this.f19436u.put(abstractC6257h, c6267r);
        } else {
            C1259t2.m5095a("spec == null");
        }
    }

    /* JADX INFO: renamed from: x */
    public C6267r m24726x(AbstractC6257h abstractC6257h) {
        return (C6267r) this.f19436u.get(abstractC6257h);
    }

    /* JADX INFO: renamed from: y */
    public int m24727y() {
        return this.f19436u.size();
    }

    /* JADX INFO: renamed from: z */
    public C6269t m24728z(int i10) {
        C6269t c6269tM24721B = m24721B(i10);
        return c6269tM24721B != null ? c6269tM24721B : this.f19434s;
    }
}
