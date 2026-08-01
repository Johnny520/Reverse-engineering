package p212o9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1052o0;
import p024b9.AbstractC1061t;
import p024b9.C1038h0;
import p082fb.AbstractC2411m;
import p082fb.InterfaceC2407i;
import p082fb.InterfaceC2412n;
import p098g9.InterfaceC2557k;
import p185m8.AbstractC5065a1;
import p185m8.AbstractC5068b1;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5112w;
import p186m9.C5135p;
import p186m9.InterfaceC5122c;
import p213oa.C5691b;
import p213oa.C5692c;
import p213oa.C5693d;
import p213oa.C5695f;
import p229p9.EnumC5996e0;
import p229p9.EnumC5998f;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6003g1;
import p229p9.InterfaceC6005h0;
import p229p9.InterfaceC6019m;
import p258r9.InterfaceC6546b;
import p273s9.C7221k;

/* JADX INFO: renamed from: o9.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5671g implements InterfaceC6546b {

    /* JADX INFO: renamed from: g */
    public static final C5695f f17823g;

    /* JADX INFO: renamed from: h */
    public static final C5691b f17824h;

    /* JADX INFO: renamed from: a */
    public final InterfaceC6005h0 f17825a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0184l f17826b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2407i f17827c;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ InterfaceC2557k[] f17821e = {AbstractC1052o0.m3814i(new C1038h0(C5671g.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0))};

    /* JADX INFO: renamed from: d */
    public static final a f17820d = new a(null);

    /* JADX INFO: renamed from: f */
    public static final C5692c f17822f = C5135p.f15488A;

    static {
        C5693d c5693d = C5135p.a.f15578d;
        f17823g = c5693d.m23013j();
        f17824h = C5691b.f17894d.m22993c(c5693d.m23016m());
    }

    public C5671g(InterfaceC2412n interfaceC2412n, InterfaceC6005h0 interfaceC6005h0, InterfaceC0184l interfaceC0184l) {
        interfaceC2412n.getClass();
        interfaceC6005h0.getClass();
        interfaceC0184l.getClass();
        this.f17825a = interfaceC6005h0;
        this.f17826b = interfaceC0184l;
        this.f17827c = interfaceC2412n.mo8663f(new C5669e(this, interfaceC2412n));
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC5122c m22907d(InterfaceC6005h0 interfaceC6005h0) {
        interfaceC6005h0.getClass();
        List listMo24096O = interfaceC6005h0.mo12666e0(f17822f).mo24096O();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMo24096O) {
            if (obj instanceof InterfaceC5122c) {
                arrayList.add(obj);
            }
        }
        return (InterfaceC5122c) AbstractC5081g0.m20576j0(arrayList);
    }

    /* JADX INFO: renamed from: h */
    public static final C7221k m22911h(C5671g c5671g, InterfaceC2412n interfaceC2412n) {
        C7221k c7221k = new C7221k((InterfaceC6019m) c5671g.f17826b.mo27m(c5671g.f17825a), f17823g, EnumC5996e0.f18939u, EnumC5998f.f18949s, AbstractC5112w.m20789e(c5671g.f17825a.mo12669t().m20920i()), InterfaceC6003g1.f18958a, false, interfaceC2412n);
        c7221k.m28512Q0(new C5665a(interfaceC2412n, c7221k), AbstractC5068b1.m20483e(), null);
        return c7221k;
    }

    @Override // p258r9.InterfaceC6546b
    /* JADX INFO: renamed from: a */
    public boolean mo22488a(C5692c c5692c, C5695f c5695f) {
        c5692c.getClass();
        c5695f.getClass();
        return AbstractC1061t.m3842c(c5695f, f17823g) && AbstractC1061t.m3842c(c5692c, f17822f);
    }

    @Override // p258r9.InterfaceC6546b
    /* JADX INFO: renamed from: b */
    public InterfaceC5995e mo22489b(C5691b c5691b) {
        c5691b.getClass();
        if (AbstractC1061t.m3842c(c5691b, f17824h)) {
            return m22912i();
        }
        return null;
    }

    @Override // p258r9.InterfaceC6546b
    /* JADX INFO: renamed from: c */
    public Collection mo22490c(C5692c c5692c) {
        c5692c.getClass();
        return AbstractC1061t.m3842c(c5692c, f17822f) ? AbstractC5065a1.m20479d(m22912i()) : AbstractC5068b1.m20483e();
    }

    /* JADX INFO: renamed from: i */
    public final C7221k m22912i() {
        return (C7221k) AbstractC2411m.m8702a(this.f17827c, this, f17821e[0]);
    }

    /* JADX INFO: renamed from: o9.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C5691b m22913a() {
            return C5671g.f17824h;
        }

        public a() {
        }
    }

    public /* synthetic */ C5671g(InterfaceC2412n interfaceC2412n, InterfaceC6005h0 interfaceC6005h0, InterfaceC0184l interfaceC0184l, int i10, AbstractC1043k abstractC1043k) {
        this(interfaceC2412n, interfaceC6005h0, (i10 & 4) != 0 ? C5670f.f17819q : interfaceC0184l);
    }
}
