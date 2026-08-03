package p116i;

import gg.AbstractC1416l;
import p014b.C0126e;
import p036c9.C0446i;
import p085fg.InterfaceC1231l;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1837h1;
import p117i0.C1845j1;
import p117i0.C1851l;
import p117i0.C1876r1;
import p117i0.InterfaceC1854l2;
import p249qg.InterfaceC3599t;
import p322w0.C4665p;

/* JADX INFO: renamed from: i.k1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1765k1 {

    /* JADX INFO: renamed from: a */
    public final C0126e f5889a;

    /* JADX INFO: renamed from: b */
    public final C1765k1 f5890b;

    /* JADX INFO: renamed from: c */
    public final String f5891c;

    /* JADX INFO: renamed from: d */
    public final C1845j1 f5892d = AbstractC1874r.m4639u(m4414c());

    /* JADX INFO: renamed from: e */
    public final C1845j1 f5893e = AbstractC1874r.m4639u(new C1750f1(m4414c(), m4414c()));

    /* JADX INFO: renamed from: f */
    public final C1837h1 f5894f = new C1837h1(0);

    /* JADX INFO: renamed from: g */
    public final C1837h1 f5895g = new C1837h1(Long.MIN_VALUE);

    /* JADX INFO: renamed from: h */
    public final C1845j1 f5896h;

    /* JADX INFO: renamed from: i */
    public final C4665p f5897i;

    /* JADX INFO: renamed from: j */
    public final C4665p f5898j;

    /* JADX INFO: renamed from: k */
    public final C1845j1 f5899k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1765k1(C0126e c0126e, C1765k1 c1765k1, String str) {
        this.f5889a = c0126e;
        this.f5890b = c1765k1;
        this.f5891c = str;
        Boolean bool = Boolean.FALSE;
        this.f5896h = AbstractC1874r.m4639u(bool);
        this.f5897i = new C4665p();
        this.f5898j = new C4665p();
        this.f5899k = AbstractC1874r.m4639u(bool);
        AbstractC1874r.m4634p(new C1735a1(this, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4412a(Object obj, C1836h0 c1836h0, int i9) {
        int i10;
        c1836h0.m4527b0(-1493585151);
        if ((i9 & 6) == 0) {
            i10 = ((i9 & 8) == 0 ? c1836h0.m4534f(obj) : c1836h0.m4538h(obj) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= c1836h0.m4534f(this) ? 32 : 16;
        }
        if (!c1836h0.m4516S(i10 & 1, (i10 & 19) != 18)) {
            c1836h0.m4519V();
        } else if (m4418g()) {
            c1836h0.m4525a0(467722849);
            c1836h0.m4553p(false);
        } else {
            c1836h0.m4525a0(466062241);
            m4422k(obj);
            int i11 = i10 & 112;
            boolean z9 = i11 == 32;
            Object objM4514P = c1836h0.m4514P();
            C1823e c1823e = C1851l.f6155a;
            if (z9 || objM4514P == c1823e) {
                objM4514P = AbstractC1874r.m4634p(new C1735a1(this, 0));
                c1836h0.m4545k0(objM4514P);
            }
            if (((Boolean) ((InterfaceC1854l2) objM4514P).getValue()).booleanValue()) {
                c1836h0.m4525a0(466470356);
                Object objM4514P2 = c1836h0.m4514P();
                if (objM4514P2 == c1823e) {
                    objM4514P2 = AbstractC1874r.m4632n(c1836h0);
                    c1836h0.m4545k0(objM4514P2);
                }
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) objM4514P2;
                boolean zM4538h = c1836h0.m4538h(interfaceC3599t) | (i11 == 32);
                Object objM4514P3 = c1836h0.m4514P();
                if (zM4538h || objM4514P3 == c1823e) {
                    objM4514P3 = new C0446i(interfaceC3599t, 15, this);
                    c1836h0.m4545k0(objM4514P3);
                }
                AbstractC1874r.m4622d(interfaceC3599t, this, (InterfaceC1231l) objM4514P3, c1836h0);
                c1836h0.m4553p(false);
            } else {
                c1836h0.m4525a0(467712929);
                c1836h0.m4553p(false);
            }
            c1836h0.m4553p(false);
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C1738b1(this, obj, i9, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final long m4413b() {
        C4665p c4665p = this.f5897i;
        int size = c4665p.size();
        long jMax = 0;
        for (int i9 = 0; i9 < size; i9++) {
            jMax = Math.max(jMax, ((C1753g1) c4665p.get(i9)).f5857p.m4564g());
        }
        C4665p c4665p2 = this.f5898j;
        int size2 = c4665p2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            jMax = Math.max(jMax, ((C1765k1) c4665p2.get(i10)).m4413b());
        }
        return jMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final Object m4414c() {
        return ((C1845j1) this.f5889a.f333i).getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m4415d() {
        C4665p c4665p = this.f5897i;
        int size = c4665p.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((C1753g1) c4665p.get(i9)).getClass();
        }
        C4665p c4665p2 = this.f5898j;
        int size2 = c4665p2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            if (((C1765k1) c4665p2.get(i10)).m4415d()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final long m4416e() {
        C1765k1 c1765k1 = this.f5890b;
        return c1765k1 != null ? c1765k1.m4416e() : this.f5894f.m4564g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final InterfaceC1747e1 m4417f() {
        return (InterfaceC1747e1) this.f5893e.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m4418g() {
        return ((Boolean) this.f5899k.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m4419h(long j3, boolean z9) {
        C0126e c0126e = this.f5889a;
        C1845j1 c1845j1 = (C1845j1) c0126e.f332h;
        C1837h1 c1837h1 = this.f5895g;
        if (c1837h1.m4564g() == Long.MIN_VALUE) {
            c1837h1.m4565h(j3);
            ((C1845j1) c0126e.f332h).setValue(Boolean.TRUE);
        } else if (!((Boolean) c1845j1.getValue()).booleanValue()) {
            c1845j1.setValue(Boolean.TRUE);
        }
        this.f5896h.setValue(Boolean.FALSE);
        C4665p c4665p = this.f5897i;
        int size = c4665p.size();
        boolean z10 = true;
        for (int i9 = 0; i9 < size; i9++) {
            C1753g1 c1753g1 = (C1753g1) c4665p.get(i9);
            C1845j1 c1845j12 = c1753g1.f5852k;
            C1845j1 c1845j13 = c1753g1.f5852k;
            if (!((Boolean) c1845j12.getValue()).booleanValue()) {
                long jMo4395b = z9 ? c1753g1.m4402a().mo4395b() : j3;
                c1753g1.f5855n.setValue(c1753g1.m4402a().mo4399f(jMo4395b));
                c1753g1.f5856o = c1753g1.m4402a().mo4397d(jMo4395b);
                if (c1753g1.m4402a().m4398e(jMo4395b)) {
                    c1845j13.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) c1845j13.getValue()).booleanValue()) {
                z10 = false;
            }
        }
        C4665p c4665p2 = this.f5898j;
        int size2 = c4665p2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            C1765k1 c1765k1 = (C1765k1) c4665p2.get(i10);
            if (!AbstractC1416l.m3825a(c1765k1.f5892d.getValue(), c1765k1.m4414c())) {
                c1765k1.m4419h(j3, z9);
            }
            if (!AbstractC1416l.m3825a(c1765k1.f5892d.getValue(), c1765k1.m4414c())) {
                z10 = false;
            }
        }
        if (z10) {
            m4420i();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m4420i() {
        this.f5895g.m4565h(Long.MIN_VALUE);
        Object value = this.f5892d.getValue();
        C0126e c0126e = this.f5889a;
        ((C1845j1) c0126e.f333i).setValue(value);
        if (this.f5890b == null) {
            this.f5894f.m4565h(0L);
        }
        ((C1845j1) c0126e.f332h).setValue(Boolean.FALSE);
        C4665p c4665p = this.f5898j;
        int size = c4665p.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((C1765k1) c4665p.get(i9)).m4420i();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m4421j(Object obj, Object obj2) {
        this.f5895g.m4565h(Long.MIN_VALUE);
        C0126e c0126e = this.f5889a;
        ((C1845j1) c0126e.f332h).setValue(Boolean.FALSE);
        boolean zM4418g = m4418g();
        C1845j1 c1845j1 = this.f5892d;
        if (!zM4418g || !AbstractC1416l.m3825a(m4414c(), obj) || !AbstractC1416l.m3825a(c1845j1.getValue(), obj2)) {
            if (!AbstractC1416l.m3825a(m4414c(), obj)) {
                ((C1845j1) c0126e.f333i).setValue(obj);
            }
            c1845j1.setValue(obj2);
            this.f5899k.setValue(Boolean.TRUE);
            this.f5893e.setValue(new C1750f1(obj, obj2));
        }
        C4665p c4665p = this.f5898j;
        int size = c4665p.size();
        for (int i9 = 0; i9 < size; i9++) {
            C1765k1 c1765k1 = (C1765k1) c4665p.get(i9);
            c1765k1.getClass();
            if (c1765k1.m4418g()) {
                c1765k1.m4421j(c1765k1.m4414c(), c1765k1.f5892d.getValue());
            }
        }
        C4665p c4665p2 = this.f5897i;
        int size2 = c4665p2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((C1753g1) c4665p2.get(i10)).m4404d();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m4422k(Object obj) {
        C1845j1 c1845j1 = this.f5892d;
        if (AbstractC1416l.m3825a(c1845j1.getValue(), obj)) {
            return;
        }
        this.f5893e.setValue(new C1750f1(c1845j1.getValue(), obj));
        if (!AbstractC1416l.m3825a(m4414c(), c1845j1.getValue())) {
            ((C1845j1) this.f5889a.f333i).setValue(c1845j1.getValue());
        }
        c1845j1.setValue(obj);
        if (this.f5895g.m4564g() == Long.MIN_VALUE) {
            this.f5896h.setValue(Boolean.TRUE);
        }
        C4665p c4665p = this.f5897i;
        int size = c4665p.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((C1753g1) c4665p.get(i9)).f5853l.m4489h(-2.0f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        C4665p c4665p = this.f5897i;
        int size = c4665p.size();
        String str = "Transition animation values: ";
        for (int i9 = 0; i9 < size; i9++) {
            str = str + ((C1753g1) c4665p.get(i9)) + ", ";
        }
        return str;
    }
}
