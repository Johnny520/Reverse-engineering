package p166l2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p135j2.AbstractC3499a;
import p135j2.AbstractC3503b;
import p135j2.C3547m;
import p172l8.C4700i0;
import p185m8.AbstractC5109u0;
import p250r1.C6455e;

/* JADX INFO: renamed from: l2.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4517a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4521b f13166a;

    /* JADX INFO: renamed from: b */
    public boolean f13167b;

    /* JADX INFO: renamed from: c */
    public boolean f13168c;

    /* JADX INFO: renamed from: d */
    public boolean f13169d;

    /* JADX INFO: renamed from: e */
    public boolean f13170e;

    /* JADX INFO: renamed from: f */
    public boolean f13171f;

    /* JADX INFO: renamed from: g */
    public boolean f13172g;

    /* JADX INFO: renamed from: h */
    public InterfaceC4521b f13173h;

    /* JADX INFO: renamed from: i */
    public final Map f13174i;

    /* JADX INFO: renamed from: l2.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {
        public a() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m17511a(InterfaceC4521b interfaceC4521b) {
            if (interfaceC4521b.mo17530T() == Integer.MAX_VALUE) {
                return;
            }
            if (interfaceC4521b.mo17532l().m17496g()) {
                interfaceC4521b.mo17533q0();
            }
            Map map = interfaceC4521b.mo17532l().f13174i;
            AbstractC4517a abstractC4517a = AbstractC4517a.this;
            for (Map.Entry entry : map.entrySet()) {
                abstractC4517a.m17492c((AbstractC3499a) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC4521b.mo17536z());
            }
            AbstractC4539f1 abstractC4539f1M17716X2 = interfaceC4521b.mo17536z().m17716X2();
            abstractC4539f1M17716X2.getClass();
            while (!AbstractC1061t.m3842c(abstractC4539f1M17716X2, AbstractC4517a.this.m17495f().mo17536z())) {
                Set<AbstractC3499a> setKeySet = AbstractC4517a.this.mo17494e(abstractC4539f1M17716X2).keySet();
                AbstractC4517a abstractC4517a2 = AbstractC4517a.this;
                for (AbstractC3499a abstractC3499a : setKeySet) {
                    abstractC4517a2.m17492c(abstractC3499a, abstractC4517a2.mo17498i(abstractC4539f1M17716X2, abstractC3499a), abstractC4539f1M17716X2);
                }
                abstractC4539f1M17716X2 = abstractC4539f1M17716X2.m17716X2();
                abstractC4539f1M17716X2.getClass();
            }
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m17511a((InterfaceC4521b) obj);
            return C4700i0.f13910a;
        }
    }

    public AbstractC4517a(InterfaceC4521b interfaceC4521b) {
        this.f13166a = interfaceC4521b;
        this.f13167b = true;
        this.f13174i = new HashMap();
    }

    /* JADX INFO: renamed from: c */
    public final void m17492c(AbstractC3499a abstractC3499a, int i10, AbstractC4539f1 abstractC4539f1) {
        float f10 = i10;
        long jM25551e = C6455e.m25551e((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L));
        while (true) {
            jM25551e = mo17493d(abstractC4539f1, jM25551e);
            abstractC4539f1 = abstractC4539f1.m17716X2();
            abstractC4539f1.getClass();
            if (AbstractC1061t.m3842c(abstractC4539f1, this.f13166a.mo17536z())) {
                break;
            } else if (mo17494e(abstractC4539f1).containsKey(abstractC3499a)) {
                float fMo17498i = mo17498i(abstractC4539f1, abstractC3499a);
                jM25551e = C6455e.m25551e((((long) Float.floatToRawIntBits(fMo17498i)) << 32) | (((long) Float.floatToRawIntBits(fMo17498i)) & 4294967295L));
            }
        }
        int iRound = Math.round(abstractC3499a instanceof C3547m ? Float.intBitsToFloat((int) (jM25551e & 4294967295L)) : Float.intBitsToFloat((int) (jM25551e >> 32)));
        Map map = this.f13174i;
        if (map.containsKey(abstractC3499a)) {
            iRound = AbstractC3503b.m13043c(abstractC3499a, ((Number) AbstractC5109u0.m20769j(this.f13174i, abstractC3499a)).intValue(), iRound);
        }
        map.put(abstractC3499a, Integer.valueOf(iRound));
    }

    /* JADX INFO: renamed from: d */
    public abstract long mo17493d(AbstractC4539f1 abstractC4539f1, long j10);

    /* JADX INFO: renamed from: e */
    public abstract Map mo17494e(AbstractC4539f1 abstractC4539f1);

    /* JADX INFO: renamed from: f */
    public final InterfaceC4521b m17495f() {
        return this.f13166a;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m17496g() {
        return this.f13167b;
    }

    /* JADX INFO: renamed from: h */
    public final Map m17497h() {
        return this.f13174i;
    }

    /* JADX INFO: renamed from: i */
    public abstract int mo17498i(AbstractC4539f1 abstractC4539f1, AbstractC3499a abstractC3499a);

    /* JADX INFO: renamed from: j */
    public final boolean m17499j() {
        return this.f13168c || this.f13170e || this.f13171f || this.f13172g;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m17500k() {
        m17504o();
        return this.f13173h != null;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m17501l() {
        return this.f13169d;
    }

    /* JADX INFO: renamed from: m */
    public final void m17502m() {
        this.f13167b = true;
        InterfaceC4521b interfaceC4521bMo17529O = this.f13166a.mo17529O();
        if (interfaceC4521bMo17529O == null) {
            return;
        }
        if (this.f13168c) {
            interfaceC4521bMo17529O.mo17535w0();
        } else if (this.f13170e || this.f13169d) {
            interfaceC4521bMo17529O.requestLayout();
        }
        if (this.f13171f) {
            this.f13166a.mo17535w0();
        }
        if (this.f13172g) {
            this.f13166a.requestLayout();
        }
        interfaceC4521bMo17529O.mo17532l().m17502m();
    }

    /* JADX INFO: renamed from: n */
    public final void m17503n() {
        this.f13174i.clear();
        this.f13166a.mo17531d0(new a());
        this.f13174i.putAll(mo17494e(this.f13166a.mo17536z()));
        this.f13167b = false;
    }

    /* JADX INFO: renamed from: o */
    public final void m17504o() {
        AbstractC4517a abstractC4517aMo17532l;
        AbstractC4517a abstractC4517aMo17532l2;
        boolean zM17499j = m17499j();
        InterfaceC4521b interfaceC4521b = this.f13166a;
        if (!zM17499j) {
            InterfaceC4521b interfaceC4521bMo17529O = interfaceC4521b.mo17529O();
            if (interfaceC4521bMo17529O == null) {
                return;
            }
            interfaceC4521b = interfaceC4521bMo17529O.mo17532l().f13173h;
            if (interfaceC4521b == null || !interfaceC4521b.mo17532l().m17499j()) {
                InterfaceC4521b interfaceC4521b2 = this.f13173h;
                if (interfaceC4521b2 == null || interfaceC4521b2.mo17532l().m17499j()) {
                    return;
                }
                InterfaceC4521b interfaceC4521bMo17529O2 = interfaceC4521b2.mo17529O();
                if (interfaceC4521bMo17529O2 != null && (abstractC4517aMo17532l2 = interfaceC4521bMo17529O2.mo17532l()) != null) {
                    abstractC4517aMo17532l2.m17504o();
                }
                InterfaceC4521b interfaceC4521bMo17529O3 = interfaceC4521b2.mo17529O();
                interfaceC4521b = (interfaceC4521bMo17529O3 == null || (abstractC4517aMo17532l = interfaceC4521bMo17529O3.mo17532l()) == null) ? null : abstractC4517aMo17532l.f13173h;
            }
        }
        this.f13173h = interfaceC4521b;
    }

    /* JADX INFO: renamed from: p */
    public final void m17505p() {
        this.f13167b = true;
        this.f13168c = false;
        this.f13170e = false;
        this.f13169d = false;
        this.f13171f = false;
        this.f13172g = false;
        this.f13173h = null;
    }

    /* JADX INFO: renamed from: q */
    public final void m17506q(boolean z10) {
        this.f13170e = z10;
    }

    /* JADX INFO: renamed from: r */
    public final void m17507r(boolean z10) {
        this.f13172g = z10;
    }

    /* JADX INFO: renamed from: s */
    public final void m17508s(boolean z10) {
        this.f13171f = z10;
    }

    /* JADX INFO: renamed from: t */
    public final void m17509t(boolean z10) {
        this.f13169d = z10;
    }

    /* JADX INFO: renamed from: u */
    public final void m17510u(boolean z10) {
        this.f13168c = z10;
    }

    public /* synthetic */ AbstractC4517a(InterfaceC4521b interfaceC4521b, AbstractC1043k abstractC1043k) {
        this(interfaceC4521b);
    }
}
