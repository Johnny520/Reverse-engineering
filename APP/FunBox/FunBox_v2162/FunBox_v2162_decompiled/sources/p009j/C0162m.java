package p009j;

import java.util.concurrent.ConcurrentHashMap;
import p010k.AbstractC0171a;
import p010k.C0190t;
import p011l.C0195c;
import p011l.InterfaceC0196d;
import p013n.InterfaceC0209k;

/* JADX INFO: renamed from: j.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0162m implements InterfaceC0196d, InterfaceC0209k, Comparable {

    /* JADX INFO: renamed from: c */
    private static final ConcurrentHashMap f503c = new ConcurrentHashMap(10000, 0.75f);

    /* JADX INFO: renamed from: d */
    private static final ThreadLocal f504d = new C0160k();

    /* JADX INFO: renamed from: a */
    private final int f505a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0196d f506b;

    C0162m(int i2, InterfaceC0196d interfaceC0196d) {
        if (i2 < 0) {
            throw new IllegalArgumentException("reg < 0");
        }
        if (interfaceC0196d == null) {
            throw new NullPointerException("type == null");
        }
        this.f505a = i2;
        this.f506b = interfaceC0196d;
    }

    /* JADX INFO: renamed from: b */
    static boolean m374b(C0162m c0162m, int i2, InterfaceC0196d interfaceC0196d) {
        return c0162m.f505a == i2 && c0162m.f506b.equals(interfaceC0196d);
    }

    /* JADX INFO: renamed from: e */
    static int m375e(int i2, InterfaceC0196d interfaceC0196d) {
        return ((interfaceC0196d.hashCode() + 0) * 31) + i2;
    }

    /* JADX INFO: renamed from: j */
    private static C0162m m376j(int i2, InterfaceC0196d interfaceC0196d) {
        C0161l c0161l = (C0161l) f504d.get();
        c0161l.m372c(i2, interfaceC0196d);
        ConcurrentHashMap concurrentHashMap = f503c;
        C0162m c0162mM373d = (C0162m) concurrentHashMap.get(c0161l);
        if (c0162mM373d == null) {
            c0162mM373d = c0161l.m373d();
            C0162m c0162m = (C0162m) concurrentHashMap.putIfAbsent(c0162mM373d, c0162mM373d);
            if (c0162m != null) {
                return c0162m;
            }
        }
        return c0162mM373d;
    }

    /* JADX INFO: renamed from: m */
    public static C0162m m377m(int i2, C0195c c0195c) {
        return m376j(i2, c0195c);
    }

    /* JADX INFO: renamed from: p */
    private String m378p(boolean z) {
        String strMo107a;
        StringBuilder sb = new StringBuilder(40);
        sb.append(m388o());
        sb.append(":");
        InterfaceC0196d interfaceC0196d = this.f506b;
        C0195c c0195cMo379c = interfaceC0196d.mo379c();
        sb.append(c0195cMo379c);
        if (c0195cMo379c != interfaceC0196d) {
            sb.append("=");
            if (z && (interfaceC0196d instanceof C0190t)) {
                strMo107a = ((C0190t) interfaceC0196d).m448k();
            } else if (z && (interfaceC0196d instanceof AbstractC0171a)) {
                strMo107a = interfaceC0196d.mo107a();
            } else {
                sb.append(interfaceC0196d);
            }
            sb.append(strMo107a);
        }
        return sb.toString();
    }

    @Override // p013n.InterfaceC0209k
    /* JADX INFO: renamed from: a */
    public final String mo107a() {
        return m378p(true);
    }

    @Override // p011l.InterfaceC0196d
    /* JADX INFO: renamed from: c */
    public final C0195c mo379c() {
        return this.f506b.mo379c();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iCompareTo;
        C0162m c0162m = (C0162m) obj;
        int i2 = c0162m.f505a;
        int i3 = this.f505a;
        if (i3 < i2) {
            return -1;
        }
        if (i3 > i2) {
            return 1;
        }
        if (this == c0162m || (iCompareTo = this.f506b.mo379c().compareTo(c0162m.f506b.mo379c())) == 0) {
            return 0;
        }
        return iCompareTo;
    }

    @Override // p011l.InterfaceC0196d
    /* JADX INFO: renamed from: d */
    public final int mo380d() {
        return this.f506b.mo380d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean z = obj instanceof C0162m;
        InterfaceC0196d interfaceC0196d = this.f506b;
        int i2 = this.f505a;
        if (z) {
            C0162m c0162m = (C0162m) obj;
            return i2 == c0162m.f505a && interfaceC0196d.equals(c0162m.f506b);
        }
        if (!(obj instanceof C0161l)) {
            return false;
        }
        C0161l c0161l = (C0161l) obj;
        return i2 == c0161l.f501a && interfaceC0196d.equals(c0161l.f502b);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m381f(C0162m c0162m) {
        return m387n(c0162m) && this.f505a == c0162m.f505a;
    }

    /* JADX INFO: renamed from: g */
    public final int m382g() {
        return this.f506b.mo379c().m469f();
    }

    /* JADX INFO: renamed from: h */
    public final int m383h() {
        return m382g() + this.f505a;
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
        return (this.f505a & 1) == 0;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m387n(C0162m c0162m) {
        return c0162m != null && this.f506b.mo379c().equals(c0162m.f506b.mo379c());
    }

    /* JADX INFO: renamed from: o */
    public final String m388o() {
        return "v" + this.f505a;
    }

    /* JADX INFO: renamed from: q */
    public final C0162m m389q(int i2) {
        return i2 == 0 ? this : m390r(this.f505a + i2);
    }

    /* JADX INFO: renamed from: r */
    public final C0162m m390r(int i2) {
        return this.f505a == i2 ? this : m376j(i2, this.f506b);
    }

    /* JADX INFO: renamed from: s */
    public final C0162m m391s(C0195c c0195c) {
        return m376j(this.f505a, c0195c);
    }

    public final String toString() {
        return m378p(false);
    }
}
