package p350y1;

import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1067w;
import p172l8.C4700i0;
import p265s1.AbstractC7078g1;
import p265s1.AbstractC7147u0;
import p265s1.C7100k3;
import p265s1.C7114n2;
import p265s1.C7128q1;
import p265s1.InterfaceC7144t2;
import p290u1.InterfaceC8485d;
import p290u1.InterfaceC8487f;
import p290u1.InterfaceC8489h;

/* JADX INFO: renamed from: y1.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9515c extends AbstractC9524l {

    /* JADX INFO: renamed from: b */
    public float[] f32328b;

    /* JADX INFO: renamed from: c */
    public final List f32329c;

    /* JADX INFO: renamed from: d */
    public boolean f32330d;

    /* JADX INFO: renamed from: e */
    public long f32331e;

    /* JADX INFO: renamed from: f */
    public List f32332f;

    /* JADX INFO: renamed from: g */
    public boolean f32333g;

    /* JADX INFO: renamed from: h */
    public InterfaceC7144t2 f32334h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0184l f32335i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC0184l f32336j;

    /* JADX INFO: renamed from: k */
    public String f32337k;

    /* JADX INFO: renamed from: l */
    public float f32338l;

    /* JADX INFO: renamed from: m */
    public float f32339m;

    /* JADX INFO: renamed from: n */
    public float f32340n;

    /* JADX INFO: renamed from: o */
    public float f32341o;

    /* JADX INFO: renamed from: p */
    public float f32342p;

    /* JADX INFO: renamed from: q */
    public float f32343q;

    /* JADX INFO: renamed from: r */
    public float f32344r;

    /* JADX INFO: renamed from: s */
    public boolean f32345s;

    /* JADX INFO: renamed from: y1.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {
        public a() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m37105a(AbstractC9524l abstractC9524l) {
            C9515c.this.m37093n(abstractC9524l);
            InterfaceC0184l interfaceC0184lMo37083b = C9515c.this.mo37083b();
            if (interfaceC0184lMo37083b != null) {
                interfaceC0184lMo37083b.mo27m(abstractC9524l);
            }
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m37105a((AbstractC9524l) obj);
            return C4700i0.f13910a;
        }
    }

    public C9515c() {
        super(null);
        this.f32329c = new ArrayList();
        this.f32330d = true;
        this.f32331e = C7128q1.f23644b.m28147h();
        this.f32332f = AbstractC9527o.m37282d();
        this.f32333g = true;
        this.f32336j = new a();
        this.f32337k = _UrlKt.FRAGMENT_ENCODE_SET;
        this.f32341o = 1.0f;
        this.f32342p = 1.0f;
        this.f32345s = true;
    }

    @Override // p350y1.AbstractC9524l
    /* JADX INFO: renamed from: a */
    public void mo37082a(InterfaceC8487f interfaceC8487f) {
        if (this.f32345s) {
            m37104y();
            this.f32345s = false;
        }
        if (this.f32333g) {
            m37103x();
            this.f32333g = false;
        }
        InterfaceC8485d interfaceC8485dMo18044n1 = interfaceC8487f.mo18044n1();
        long jMo32628b = interfaceC8485dMo18044n1.mo32628b();
        interfaceC8485dMo18044n1.mo32635i().mo27841n();
        try {
            InterfaceC8489h interfaceC8489hMo32632f = interfaceC8485dMo18044n1.mo32632f();
            float[] fArr = this.f32328b;
            if (fArr != null) {
                interfaceC8489hMo32632f.mo32638a(C7114n2.m28019a(fArr).m28036r());
            }
            InterfaceC7144t2 interfaceC7144t2 = this.f32334h;
            if (m37087h() && interfaceC7144t2 != null) {
                InterfaceC8489h.m32663e(interfaceC8489hMo32632f, interfaceC7144t2, 0, 2, null);
            }
            List list = this.f32329c;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC9524l) list.get(i10)).mo37082a(interfaceC8487f);
            }
            interfaceC8485dMo18044n1.mo32635i().mo27847w();
            interfaceC8485dMo18044n1.mo32633g(jMo32628b);
        } catch (Throwable th) {
            interfaceC8485dMo18044n1.mo32635i().mo27847w();
            interfaceC8485dMo18044n1.mo32633g(jMo32628b);
            throw th;
        }
    }

    @Override // p350y1.AbstractC9524l
    /* JADX INFO: renamed from: b */
    public InterfaceC0184l mo37083b() {
        return this.f32335i;
    }

    @Override // p350y1.AbstractC9524l
    /* JADX INFO: renamed from: d */
    public void mo37084d(InterfaceC0184l interfaceC0184l) {
        this.f32335i = interfaceC0184l;
    }

    /* JADX INFO: renamed from: f */
    public final int m37085f() {
        return this.f32329c.size();
    }

    /* JADX INFO: renamed from: g */
    public final long m37086g() {
        return this.f32331e;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m37087h() {
        return !this.f32332f.isEmpty();
    }

    /* JADX INFO: renamed from: i */
    public final void m37088i(int i10, AbstractC9524l abstractC9524l) {
        int iM37085f = m37085f();
        List list = this.f32329c;
        if (i10 < iM37085f) {
            list.set(i10, abstractC9524l);
        } else {
            list.add(abstractC9524l);
        }
        m37093n(abstractC9524l);
        abstractC9524l.mo37084d(this.f32336j);
        m37249c();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m37089j() {
        return this.f32330d;
    }

    /* JADX INFO: renamed from: k */
    public final void m37090k() {
        this.f32330d = false;
        this.f32331e = C7128q1.f23644b.m28147h();
    }

    /* JADX INFO: renamed from: l */
    public final void m37091l(AbstractC7078g1 abstractC7078g1) {
        if (this.f32330d && abstractC7078g1 != null) {
            if (abstractC7078g1 instanceof C7100k3) {
                m37092m(((C7100k3) abstractC7078g1).m27984b());
            } else {
                m37090k();
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m37092m(long j10) {
        if (this.f32330d && j10 != 16) {
            long j11 = this.f32331e;
            if (j11 == 16) {
                this.f32331e = j10;
            } else {
                if (AbstractC9527o.m37283e(j11, j10)) {
                    return;
                }
                m37090k();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m37093n(AbstractC9524l abstractC9524l) {
        if (abstractC9524l instanceof C9519g) {
            C9519g c9519g = (C9519g) abstractC9524l;
            m37091l(c9519g.m37160e());
            m37091l(c9519g.m37162g());
        } else if (abstractC9524l instanceof C9515c) {
            C9515c c9515c = (C9515c) abstractC9524l;
            if (c9515c.f32330d && this.f32330d) {
                m37092m(c9515c.f32331e);
            } else {
                m37090k();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m37094o(List list) {
        this.f32332f = list;
        this.f32333g = true;
        m37249c();
    }

    /* JADX INFO: renamed from: p */
    public final void m37095p(String str) {
        this.f32337k = str;
        m37249c();
    }

    /* JADX INFO: renamed from: q */
    public final void m37096q(float f10) {
        this.f32339m = f10;
        this.f32345s = true;
        m37249c();
    }

    /* JADX INFO: renamed from: r */
    public final void m37097r(float f10) {
        this.f32340n = f10;
        this.f32345s = true;
        m37249c();
    }

    /* JADX INFO: renamed from: s */
    public final void m37098s(float f10) {
        this.f32338l = f10;
        this.f32345s = true;
        m37249c();
    }

    /* JADX INFO: renamed from: t */
    public final void m37099t(float f10) {
        this.f32341o = f10;
        this.f32345s = true;
        m37249c();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VGroup: ");
        sb2.append(this.f32337k);
        List list = this.f32329c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC9524l abstractC9524l = (AbstractC9524l) list.get(i10);
            sb2.append("\t");
            sb2.append(abstractC9524l.toString());
            sb2.append("\n");
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m37100u(float f10) {
        this.f32342p = f10;
        this.f32345s = true;
        m37249c();
    }

    /* JADX INFO: renamed from: v */
    public final void m37101v(float f10) {
        this.f32343q = f10;
        this.f32345s = true;
        m37249c();
    }

    /* JADX INFO: renamed from: w */
    public final void m37102w(float f10) {
        this.f32344r = f10;
        this.f32345s = true;
        m37249c();
    }

    /* JADX INFO: renamed from: x */
    public final void m37103x() {
        if (m37087h()) {
            InterfaceC7144t2 interfaceC7144t2M28224a = this.f32334h;
            if (interfaceC7144t2M28224a == null) {
                interfaceC7144t2M28224a = AbstractC7147u0.m28224a();
                this.f32334h = interfaceC7144t2M28224a;
            }
            AbstractC9523k.m37248c(this.f32332f, interfaceC7144t2M28224a);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m37104y() {
        float[] fArrM28021c = this.f32328b;
        if (fArrM28021c == null) {
            fArrM28021c = C7114n2.m28021c(null, 1, null);
            this.f32328b = fArrM28021c;
        } else {
            C7114n2.m28026h(fArrM28021c);
        }
        float[] fArr = fArrM28021c;
        C7114n2.m28035q(fArr, this.f32339m + this.f32343q, this.f32340n + this.f32344r, 0.0f, 4, null);
        C7114n2.m28030l(fArr, this.f32338l);
        C7114n2.m28031m(fArr, this.f32341o, this.f32342p, 1.0f);
        C7114n2.m28035q(fArr, -this.f32339m, -this.f32340n, 0.0f, 4, null);
    }
}
