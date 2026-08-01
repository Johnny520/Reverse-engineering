package p229p9;

import gb.InterfaceC2716u1;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1052o0;
import p024b9.C1038h0;
import p082fb.AbstractC2411m;
import p082fb.InterfaceC2407i;
import p082fb.InterfaceC2412n;
import p098g9.InterfaceC2557k;
import p112hb.AbstractC2949h;
import p327wa.AbstractC9211e;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: p9.e1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5997e1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5995e f18944a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0184l f18945b;

    /* JADX INFO: renamed from: c */
    public final AbstractC2949h f18946c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2407i f18947d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ InterfaceC2557k[] f18943f = {AbstractC1052o0.m3814i(new C1038h0(C5997e1.class, "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};

    /* JADX INFO: renamed from: e */
    public static final a f18942e = new a(null);

    public C5997e1(InterfaceC5995e interfaceC5995e, InterfaceC2412n interfaceC2412n, InterfaceC0184l interfaceC0184l, AbstractC2949h abstractC2949h) {
        this.f18944a = interfaceC5995e;
        this.f18945b = interfaceC0184l;
        this.f18946c = abstractC2949h;
        this.f18947d = interfaceC2412n.mo8663f(new C5991c1(this));
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC9913k m24004d(C5997e1 c5997e1, AbstractC2949h abstractC2949h) {
        return (InterfaceC9913k) c5997e1.f18945b.mo27m(abstractC2949h);
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC9913k m24005f(C5997e1 c5997e1) {
        return (InterfaceC9913k) c5997e1.f18945b.mo27m(c5997e1.f18946c);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC9913k m24006c(AbstractC2949h abstractC2949h) {
        abstractC2949h.getClass();
        if (!abstractC2949h.mo10848d(AbstractC9211e.m35864s(this.f18944a))) {
            return m24007e();
        }
        InterfaceC2716u1 interfaceC2716u1Mo5591o = this.f18944a.mo5591o();
        interfaceC2716u1Mo5591o.getClass();
        return !abstractC2949h.mo10849e(interfaceC2716u1Mo5591o) ? m24007e() : abstractC2949h.mo10847c(this.f18944a, new C5994d1(this, abstractC2949h));
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC9913k m24007e() {
        return (InterfaceC9913k) AbstractC2411m.m8702a(this.f18947d, this, f18943f[0]);
    }

    /* JADX INFO: renamed from: p9.e1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C5997e1 m24008a(InterfaceC5995e interfaceC5995e, InterfaceC2412n interfaceC2412n, AbstractC2949h abstractC2949h, InterfaceC0184l interfaceC0184l) {
            interfaceC5995e.getClass();
            interfaceC2412n.getClass();
            abstractC2949h.getClass();
            interfaceC0184l.getClass();
            return new C5997e1(interfaceC5995e, interfaceC2412n, interfaceC0184l, abstractC2949h, null);
        }

        public a() {
        }
    }

    public /* synthetic */ C5997e1(InterfaceC5995e interfaceC5995e, InterfaceC2412n interfaceC2412n, InterfaceC0184l interfaceC0184l, AbstractC2949h abstractC2949h, AbstractC1043k abstractC1043k) {
        this(interfaceC5995e, interfaceC2412n, interfaceC0184l, abstractC2949h);
    }
}
