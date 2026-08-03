package fun.box001.internal.dexformat.writer;

import fun.box001.internal.dexformat.output.InterfaceC0209k;
import fun.box001.internal.dexformat.writer.code.AbstractC0171a;
import fun.box001.internal.dexformat.writer.code.C0190t;
import fun.box001.internal.dexformat.writer.data.C0195c;
import fun.box001.internal.dexformat.writer.data.InterfaceC0196d;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: j.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0162m implements InterfaceC0196d, InterfaceC0209k, Comparable {

    /* JADX INFO: renamed from: c */
    private static final ConcurrentHashMap f503c = null;

    /* JADX INFO: renamed from: d */
    private static final ThreadLocal f504d = null;

    /* JADX INFO: renamed from: a */
    private final int f505a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0196d f506b;

    static {
        f503c = new ConcurrentHashMap(10000, 0.75f);
        f504d = new C0160k();
    }

    C0162m(int r1, InterfaceC0196d r2) {
        if (r1 < 0) goto L10;
        if (r2 == null) goto L8;
        this.f505a = r1;
        this.f506b = r2;
        return;
    L8:
        throw new NullPointerException("type == null");
    L10:
        throw new IllegalArgumentException("reg < 0");
    }

    /* JADX INFO: renamed from: b */
    static boolean m374b(C0162m r1, int r2, InterfaceC0196d r3) {
        if (r1.f505a == r2) goto L5;
    L7:
        return false;
    L5:
        if (r1.f506b.equals(r3) == false) goto L7;
        return true;
    }

    /* JADX INFO: renamed from: e */
    static int m375e(int r0, InterfaceC0196d r1) {
        return ((r1.hashCode() + 0) * 31) + r0;
    }

    /* JADX INFO: renamed from: j */
    private static C0162m m376j(int r1, InterfaceC0196d r2) {
        C0161l r0 = (C0161l) f504d.get();
        r0.m372c(r1, r2);
        ConcurrentHashMap r12 = f503c;
        C0162m r22 = (C0162m) r12.get(r0);
        if (r22 != null) goto L7;
        r22 = r0.m373d();
        C0162m r13 = (C0162m) r12.putIfAbsent(r22, r22);
        if (r13 == null) goto L7;
        return r13;
    L7:
        return r22;
    }

    /* JADX INFO: renamed from: m */
    public static C0162m m377m(int r0, C0195c r1) {
        return m376j(r0, r1);
    }

    /* JADX INFO: renamed from: p */
    private String m378p(boolean r4) {
        StringBuilder r0 = new StringBuilder(40);
        r0.append(m388o());
        r0.append(":");
        InterfaceC0196d r1 = this.f506b;
        C0195c r2 = r1.mo379c();
        r0.append(r2);
        if (r2 == r1) goto L16;
        r0.append("=");
        if (r4 == true) goto L7;
    L10:
        if (r4 == true) goto L12;
    L14:
        r0.append(r1);
        goto L16
    L12:
        if ((r1 instanceof AbstractC0171a) == false) goto L14;
        String r42 = r1.mo107a();
    L9:
        r0.append(r42);
        goto L16
    L7:
        if ((r1 instanceof C0190t) == false) goto L10;
        r42 = ((C0190t) r1).m448k();
    L16:
        return r0.toString();
    }

    @Override // fun.box001.internal.dexformat.output.InterfaceC0209k
    /* JADX INFO: renamed from: a */
    public final String mo107a() {
        return m378p(true);
    }

    @Override // fun.box001.internal.dexformat.writer.data.InterfaceC0196d
    /* JADX INFO: renamed from: c */
    public final C0195c mo379c() {
        return this.f506b.mo379c();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r3) {
        C0162m r32 = (C0162m) r3;
        int r0 = r32.f505a;
        int r1 = this.f505a;
        if (r1 >= r0) goto L5;
        return -1;
    L5:
        if (r1 <= r0) goto L8;
        return 1;
    L8:
        if (this == r32) goto L14;
        int r33 = this.f506b.mo379c().m467b(r32.f506b.mo379c());
        if (r33 == 0) goto L14;
        return r33;
    L14:
        return 0;
    }

    @Override // fun.box001.internal.dexformat.writer.data.InterfaceC0196d
    /* JADX INFO: renamed from: d */
    public final int mo380d() {
        return this.f506b.mo380d();
    }

    public final boolean equals(Object r6) {
        if (this != r6) goto L5;
        return true;
    L5:
        boolean r1 = r6 instanceof C0162m;
        InterfaceC0196d r2 = this.f506b;
        int r3 = this.f505a;
        if (r1 == false) goto L8;
        C0162m r62 = (C0162m) r6;
        if (r3 != r62.f505a) goto L23;
        if (r2.equals(r62.f506b) == false) goto L23;
        return true;
    L23:
        return false;
    L8:
        if ((r6 instanceof C0161l) == false) goto L16;
        C0161l r63 = (C0161l) r6;
        int r12 = C0161l.m370a(r63);
        InterfaceC0196d r64 = C0161l.m371b(r63);
        if (r3 != r12) goto L15;
        if (r2.equals(r64) == false) goto L15;
        return true;
    L15:
        return false;
    L16:
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m381f(C0162m r3) {
        if (m387n(r3) == true) goto L6;
        return false;
    L6:
        if (this.f505a != r3.f505a) goto L9;
        return true;
    L9:
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final int m382g() {
        return this.f506b.mo379c().m469f();
    }

    /* JADX INFO: renamed from: h */
    public final int m383h() {
        int r0 = this.f505a;
        return m382g() + r0;
    }

    public final int hashCode() {
        return ((this.f506b.hashCode() + 0) * 31) + this.f505a;
    }

    /* JADX INFO: renamed from: i */
    public final int m384i() {
        return this.f505a;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m385k() {
        return this.f506b.mo379c().m472j();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m386l() {
        if ((this.f505a & 1) == 0) goto L7;
        return false;
    L7:
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m387n(C0162m r3) {
        if (r3 != null) goto L6;
        return false;
    L6:
        if (this.f506b.mo379c().equals(r3.f506b.mo379c()) == false) goto L9;
        return true;
    L9:
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final String m388o() {
        return "v" + this.f505a;
    }

    /* JADX INFO: renamed from: q */
    public final C0162m m389q(int r2) {
        if (r2 != 0) goto L5;
        return this;
    L5:
        return m390r(this.f505a + r2);
    }

    /* JADX INFO: renamed from: r */
    public final C0162m m390r(int r2) {
        if (this.f505a != r2) goto L6;
        return this;
    L6:
        return m376j(r2, this.f506b);
    }

    /* JADX INFO: renamed from: s */
    public final C0162m m391s(C0195c r2) {
        return m376j(this.f505a, r2);
    }

    public final String toString() {
        return m378p(false);
    }
}
