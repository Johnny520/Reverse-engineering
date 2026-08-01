package p182m5;

import bsh.C1193i2;
import bsh.C1259t2;
import p020b5.C0996b;
import p215oc.C5725t;
import p309v5.InterfaceC8819a;
import p376zd.C9987e;

/* JADX INFO: renamed from: m5.m0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5004m0 extends AbstractC4982b0 implements Comparable {

    /* JADX INFO: renamed from: q */
    public final int f15225q;

    /* JADX INFO: renamed from: r */
    public int f15226r;

    /* JADX INFO: renamed from: s */
    public AbstractC5012q0 f15227s;

    /* JADX INFO: renamed from: t */
    public int f15228t;

    public AbstractC5004m0(int i10, int i11) {
        AbstractC5012q0.m20270m(i10);
        if (i11 < -1) {
            C9987e.m38645a("writeSize < -1");
            throw null;
        }
        this.f15225q = i10;
        this.f15226r = i11;
        this.f15227s = null;
        this.f15228t = -1;
    }

    /* JADX INFO: renamed from: m */
    public static int m20199m(AbstractC5004m0 abstractC5004m0) {
        if (abstractC5004m0 == null) {
            return 0;
        }
        return abstractC5004m0.m20201l();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AbstractC5004m0 abstractC5004m0 = (AbstractC5004m0) obj;
        return mo20091c() == abstractC5004m0.mo20091c() && mo20092k(abstractC5004m0) == 0;
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: h */
    public final int mo20111h() {
        int i10 = this.f15226r;
        if (i10 >= 0) {
            return i10;
        }
        C5725t.m23179a("writeSize is unknown");
        return 0;
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: i */
    public final void mo20112i(C5009p c5009p, InterfaceC8819a interfaceC8819a) {
        interfaceC8819a.mo33869l(this.f15225q);
        try {
            if (this.f15226r < 0) {
                throw new UnsupportedOperationException("writeSize is unknown");
            }
            interfaceC8819a.mo33866f(m20201l());
            mo20095v(c5009p, interfaceC8819a);
        } catch (RuntimeException e10) {
            throw C0996b.m3684b(e10, "...while writing " + this);
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AbstractC5004m0 abstractC5004m0) {
        if (this == abstractC5004m0) {
            return 0;
        }
        EnumC4984c0 enumC4984c0Mo20091c = mo20091c();
        EnumC4984c0 enumC4984c0Mo20091c2 = abstractC5004m0.mo20091c();
        return enumC4984c0Mo20091c != enumC4984c0Mo20091c2 ? enumC4984c0Mo20091c.compareTo(enumC4984c0Mo20091c2) : mo20092k(abstractC5004m0);
    }

    /* JADX INFO: renamed from: k */
    public int mo20092k(AbstractC5004m0 abstractC5004m0) {
        throw new UnsupportedOperationException("unsupported");
    }

    /* JADX INFO: renamed from: l */
    public final int m20201l() {
        int i10 = this.f15228t;
        if (i10 >= 0) {
            return this.f15227s.m20272c(i10);
        }
        C1193i2.m4438a("offset not yet known");
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public final int m20202n() {
        return this.f15225q;
    }

    /* JADX INFO: renamed from: p */
    public final String m20203p() {
        return "[" + Integer.toHexString(m20201l()) + ']';
    }

    /* JADX INFO: renamed from: r */
    public final int m20204r(AbstractC5012q0 abstractC5012q0, int i10) {
        if (abstractC5012q0 == null) {
            C1259t2.m5095a("addedTo == null");
            return 0;
        }
        if (i10 < 0) {
            C9987e.m38645a("offset < 0");
            return 0;
        }
        if (this.f15227s != null) {
            C1193i2.m4438a("already written");
            return 0;
        }
        int i11 = this.f15225q - 1;
        int i12 = (i10 + i11) & (~i11);
        this.f15227s = abstractC5012q0;
        this.f15228t = i12;
        mo20093s(abstractC5012q0, i12);
        return i12;
    }

    /* JADX INFO: renamed from: t */
    public final void m20205t(int i10) {
        if (i10 < 0) {
            C9987e.m38645a("writeSize < 0");
        } else if (this.f15226r < 0) {
            this.f15226r = i10;
        } else {
            C5725t.m23179a("writeSize already set");
        }
    }

    /* JADX INFO: renamed from: u */
    public abstract String mo20094u();

    /* JADX INFO: renamed from: v */
    public abstract void mo20095v(C5009p c5009p, InterfaceC8819a interfaceC8819a);

    /* JADX INFO: renamed from: s */
    public void mo20093s(AbstractC5012q0 abstractC5012q0, int i10) {
    }
}
