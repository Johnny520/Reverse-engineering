package fun.box001.internal.dexformat.writer.code;

import fun.box001.internal.dexformat.writer.data.C0195c;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: k.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0191u extends AbstractC0192v {

    /* JADX INFO: renamed from: c */
    private static final ConcurrentHashMap f699c = null;

    /* JADX INFO: renamed from: d */
    public static final C0191u f700d = null;

    /* JADX INFO: renamed from: e */
    public static final C0191u f701e = null;

    /* JADX INFO: renamed from: f */
    public static final C0191u f702f = null;

    /* JADX INFO: renamed from: a */
    private final C0195c f703a;

    /* JADX INFO: renamed from: b */
    private C0190t f704b;

    static {
        f699c = new ConcurrentHashMap(1000, 0.75f);
        C0191u r0 = new C0191u(C0195c.f776u);
        f700d = r0;
        C0191u r1 = new C0191u(C0195c.f779x);
        C0191u r2 = new C0191u(C0195c.f780y);
        C0191u r3 = new C0191u(C0195c.f781z);
        C0191u r4 = new C0191u(C0195c.f746A);
        C0191u r5 = new C0191u(C0195c.f747B);
        C0191u r6 = new C0191u(C0195c.f749D);
        C0191u r7 = new C0191u(C0195c.f748C);
        C0191u r8 = new C0191u(C0195c.f750E);
        C0191u r9 = new C0191u(C0195c.f751F);
        C0191u r10 = new C0191u(C0195c.f752G);
        C0191u r11 = new C0191u(C0195c.f753H);
        C0191u r12 = new C0191u(C0195c.f754I);
        C0191u r13 = new C0191u(C0195c.f755J);
        C0191u r14 = new C0191u(C0195c.f756K);
        C0191u r15 = new C0191u(C0195c.f758M);
        C0191u r142 = new C0191u(C0195c.f757L);
        C0191u r152 = new C0191u(C0195c.f760O);
        C0191u r143 = new C0191u(C0195c.f774s);
        f701e = r143;
        f702f = new C0191u(C0195c.f775t);
        m450j(r0);
        m450j(r1);
        m450j(r2);
        m450j(r3);
        m450j(r4);
        m450j(r5);
        m450j(r6);
        m450j(r7);
        m450j(r8);
        m450j(r9);
        m450j(r10);
        m450j(r11);
        m450j(r12);
        m450j(r13);
        m450j(r14);
        m450j(r15);
        m450j(r142);
        m450j(r152);
        m450j(r143);
    }

    public C0191u(C0195c r2) {
        if (r2 == null) goto L11;
        if (r2 == C0195c.f771p) goto L9;
        this.f703a = r2;
        this.f704b = null;
        return;
    L9:
        throw new UnsupportedOperationException("KNOWN_NULL is not representable");
    L11:
        throw new NullPointerException("type == null");
    }

    /* JADX INFO: renamed from: i */
    public static C0191u m449i(C0195c r2) {
        C0191u r0 = new C0191u(r2);
        C0191u r22 = (C0191u) f699c.putIfAbsent(r2, r0);
        if (r22 != null) goto L5;
        return r0;
    L5:
        return r22;
    }

    /* JADX INFO: renamed from: j */
    private static void m450j(C0191u r3) {
        if (f699c.putIfAbsent(r3.f703a, r3) != null) goto L6;
        return;
    L6:
        throw new IllegalStateException("Attempted re-init of " + r3);
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
    protected final int mo426e(AbstractC0171a r2) {
        return this.f703a.m471h().compareTo(((C0191u) r2).f703a.m471h());
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof C0191u) == true) goto L5;
        return false;
    L5:
        C0195c r32 = ((C0191u) r3).f703a;
        if (this.f703a != r32) goto L9;
        return true;
    L9:
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
        if (this.f704b != null) goto L6;
        this.f704b = new C0190t(this.f703a.m471h());
    L6:
        return this.f704b;
    }

    public final int hashCode() {
        return this.f703a.hashCode();
    }

    public final String toString() {
        return "type{" + mo107a() + '}';
    }
}
