package fun.box001.internal.dexformat.writer.code;

import fun.box001.internal.dexformat.writer.data.C0195c;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: k.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0191u extends AbstractC0192v {

    /* JADX INFO: renamed from: c */
    private static final ConcurrentHashMap f699c = new ConcurrentHashMap(1000, 0.75f);

    /* JADX INFO: renamed from: d */
    public static final C0191u f700d;

    /* JADX INFO: renamed from: e */
    public static final C0191u f701e;

    /* JADX INFO: renamed from: f */
    public static final C0191u f702f;

    /* JADX INFO: renamed from: a */
    private final C0195c f703a;

    /* JADX INFO: renamed from: b */
    private C0190t f704b;

    static {
        C0191u c0191u = new C0191u(C0195c.f776u);
        f700d = c0191u;
        C0191u c0191u2 = new C0191u(C0195c.f779x);
        C0191u c0191u3 = new C0191u(C0195c.f780y);
        C0191u c0191u4 = new C0191u(C0195c.f781z);
        C0191u c0191u5 = new C0191u(C0195c.f746A);
        C0191u c0191u6 = new C0191u(C0195c.f747B);
        C0191u c0191u7 = new C0191u(C0195c.f749D);
        C0191u c0191u8 = new C0191u(C0195c.f748C);
        C0191u c0191u9 = new C0191u(C0195c.f750E);
        C0191u c0191u10 = new C0191u(C0195c.f751F);
        C0191u c0191u11 = new C0191u(C0195c.f752G);
        C0191u c0191u12 = new C0191u(C0195c.f753H);
        C0191u c0191u13 = new C0191u(C0195c.f754I);
        C0191u c0191u14 = new C0191u(C0195c.f755J);
        C0191u c0191u15 = new C0191u(C0195c.f756K);
        C0191u c0191u16 = new C0191u(C0195c.f758M);
        C0191u c0191u17 = new C0191u(C0195c.f757L);
        C0191u c0191u18 = new C0191u(C0195c.f760O);
        C0191u c0191u19 = new C0191u(C0195c.f774s);
        f701e = c0191u19;
        f702f = new C0191u(C0195c.f775t);
        m450j(c0191u);
        m450j(c0191u2);
        m450j(c0191u3);
        m450j(c0191u4);
        m450j(c0191u5);
        m450j(c0191u6);
        m450j(c0191u7);
        m450j(c0191u8);
        m450j(c0191u9);
        m450j(c0191u10);
        m450j(c0191u11);
        m450j(c0191u12);
        m450j(c0191u13);
        m450j(c0191u14);
        m450j(c0191u15);
        m450j(c0191u16);
        m450j(c0191u17);
        m450j(c0191u18);
        m450j(c0191u19);
    }

    public C0191u(C0195c c0195c) {
        if (c0195c == null) {
            throw new NullPointerException("type == null");
        }
        if (c0195c == C0195c.f771p) {
            throw new UnsupportedOperationException("KNOWN_NULL is not representable");
        }
        this.f703a = c0195c;
        this.f704b = null;
    }

    /* JADX INFO: renamed from: i */
    public static C0191u m449i(C0195c c0195c) {
        C0191u c0191u = new C0191u(c0195c);
        C0191u c0191u2 = (C0191u) f699c.putIfAbsent(c0195c, c0191u);
        return c0191u2 != null ? c0191u2 : c0191u;
    }

    /* JADX INFO: renamed from: j */
    private static void m450j(C0191u c0191u) {
        if (f699c.putIfAbsent(c0191u.f703a, c0191u) == null) {
            return;
        }
        throw new IllegalStateException("Attempted re-init of " + c0191u);
    }

    @Override // fun.box001.internal.dexformat.output.InterfaceC0209k
    /* JADX INFO: renamed from: a */
    public final String mo107a() {
        return this.f703a.mo107a();
    }

    @Override // fun.box001.internal.dexformat.writer.data.InterfaceC0196d
    /* JADX INFO: renamed from: c */
    public final C0195c mo379c() {
        return C0195c.f773r;
    }

    @Override // fun.box001.internal.dexformat.writer.code.AbstractC0171a
    /* JADX INFO: renamed from: e */
    protected final int mo426e(AbstractC0171a abstractC0171a) {
        return this.f703a.m471h().compareTo(((C0191u) abstractC0171a).f703a.m471h());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0191u) {
            return this.f703a == ((C0191u) obj).f703a;
        }
        return false;
    }

    @Override // fun.box001.internal.dexformat.writer.code.AbstractC0171a
    /* JADX INFO: renamed from: f */
    public final String mo427f() {
        return "type";
    }

    /* JADX INFO: renamed from: g */
    public final C0195c m451g() {
        return this.f703a;
    }

    /* JADX INFO: renamed from: h */
    public final C0190t m452h() {
        if (this.f704b == null) {
            this.f704b = new C0190t(this.f703a.m471h());
        }
        return this.f704b;
    }

    public final int hashCode() {
        return this.f703a.hashCode();
    }

    public final String toString() {
        return "type{" + mo107a() + '}';
    }
}
