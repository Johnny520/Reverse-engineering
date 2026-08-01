package p255r6;

import java.util.Map;
import p010a9.InterfaceC0184l;
import p086ff.InterfaceC2436d;
import p086ff.InterfaceC2440h;
import p147jf.InterfaceC3860b;
import p209o6.C5645h;
import p209o6.EnumC5647j;
import p209o6.InterfaceC5644g;
import p209o6.InterfaceC5648k;
import p215oc.C5729x;
import p240q6.AbstractC6276a;

/* JADX INFO: renamed from: r6.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6522a extends AbstractC6523b implements InterfaceC5644g {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2436d f20447a;

    /* JADX INFO: renamed from: r6.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f20448a;

        static {
            int[] iArr = new int[EnumC5647j.values().length];
            try {
                iArr[EnumC5647j.f17767s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5647j.f17768t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5647j.f17769u.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC5647j.f17770v.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC5647j.f17771w.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC5647j.f17772x.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f20448a = iArr;
        }
    }

    public C6522a(InterfaceC2436d interfaceC2436d) {
        interfaceC2436d.getClass();
        this.f20447a = interfaceC2436d;
    }

    /* JADX INFO: renamed from: k */
    private final void m25817k(C5645h c5645h, EnumC5647j enumC5647j, InterfaceC5648k interfaceC5648k) {
        InterfaceC2440h interfaceC2440hM24862a;
        InterfaceC3860b interfaceC3860bMo8824v = m25819i().mo8824v(AbstractC6276a.m24863b(enumC5647j));
        if (interfaceC5648k != null && (interfaceC2440hM24862a = AbstractC6276a.m24862a(interfaceC5648k)) != null) {
            interfaceC3860bMo8824v.mo15297a(interfaceC2440hM24862a);
        }
        Map mapM22843d = c5645h.m22843d();
        if (mapM22843d != null) {
            for (Map.Entry entry : mapM22843d.entrySet()) {
                interfaceC3860bMo8824v.mo15301e((String) entry.getKey(), entry.getValue());
            }
        }
        Object[] objArrM22840a = c5645h.m22840a();
        if (objArrM22840a != null) {
            for (Object obj : objArrM22840a) {
                interfaceC3860bMo8824v.mo15300d(obj);
            }
        }
        interfaceC3860bMo8824v.mo15299c(c5645h.m22841b());
        interfaceC3860bMo8824v.mo15298b(c5645h.m22842c());
    }

    /* JADX INFO: renamed from: l */
    private final void m25818l(C5645h c5645h, EnumC5647j enumC5647j, InterfaceC5648k interfaceC5648k) {
        InterfaceC2440h interfaceC2440hM24862a = interfaceC5648k != null ? AbstractC6276a.m24862a(interfaceC5648k) : null;
        String strM22842c = c5645h.m22842c();
        Throwable thM22841b = c5645h.m22841b();
        switch (a.f20448a[enumC5647j.ordinal()]) {
            case 1:
                m25819i().mo8799C(interfaceC2440hM24862a, strM22842c, thM22841b);
                break;
            case 2:
                m25819i().mo8818p(interfaceC2440hM24862a, strM22842c, thM22841b);
                break;
            case 3:
                m25819i().mo8819q(interfaceC2440hM24862a, strM22842c, thM22841b);
                break;
            case 4:
                m25819i().mo8800D(interfaceC2440hM24862a, strM22842c, thM22841b);
                break;
            case 5:
                m25819i().mo8802F(interfaceC2440hM24862a, strM22842c, thM22841b);
                break;
            case 6:
                break;
            default:
                C5729x.m23182a();
                break;
        }
    }

    @Override // p209o6.InterfaceC5644g
    /* JADX INFO: renamed from: e */
    public void mo22824e(EnumC5647j enumC5647j, InterfaceC5648k interfaceC5648k, InterfaceC0184l interfaceC0184l) {
        enumC5647j.getClass();
        interfaceC0184l.getClass();
        if (m25820j(enumC5647j, interfaceC5648k)) {
            C5645h c5645h = new C5645h();
            interfaceC0184l.mo27m(c5645h);
            if (c5645h.m22843d() != null) {
                m25817k(c5645h, enumC5647j, interfaceC5648k);
            } else {
                m25818l(c5645h, enumC5647j, interfaceC5648k);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public InterfaceC2436d m25819i() {
        return this.f20447a;
    }

    /* JADX INFO: renamed from: j */
    public boolean m25820j(EnumC5647j enumC5647j, InterfaceC5648k interfaceC5648k) {
        enumC5647j.getClass();
        return m25821h(m25819i(), enumC5647j, interfaceC5648k);
    }
}
