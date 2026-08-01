package p265s1;

import p215oc.C5725t;
import p250r1.C6455e;
import p250r1.C6457g;
import p250r1.C6459i;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX INFO: renamed from: s1.t2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7144t2 {

    /* JADX INFO: renamed from: a */
    public static final a f23674a = a.f23675a;

    /* JADX INFO: renamed from: s1.t2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a f23675a = new a();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: s1.t2$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {

        /* JADX INFO: renamed from: q */
        public static final b f23676q = new b("CounterClockwise", 0);

        /* JADX INFO: renamed from: r */
        public static final b f23677r = new b("Clockwise", 1);

        /* JADX INFO: renamed from: s */
        public static final /* synthetic */ b[] f23678s;

        /* JADX INFO: renamed from: t */
        public static final /* synthetic */ InterfaceC7197a f23679t;

        static {
            b[] bVarArrM28221a = m28221a();
            f23678s = bVarArrM28221a;
            f23679t = AbstractC7198b.m28437a(bVarArrM28221a);
        }

        public b(String str, int i10) {
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ b[] m28221a() {
            return new b[]{f23676q, f23677r};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f23678s.clone();
        }
    }

    /* JADX INFO: renamed from: e */
    static /* synthetic */ void m28218e(InterfaceC7144t2 interfaceC7144t2, InterfaceC7144t2 interfaceC7144t22, long j10, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
            return;
        }
        if ((i10 & 2) != 0) {
            j10 = C6455e.f20314b.m25569c();
        }
        interfaceC7144t2.mo28173d(interfaceC7144t22, j10);
    }

    /* JADX INFO: renamed from: i */
    static /* synthetic */ void m28219i(InterfaceC7144t2 interfaceC7144t2, C6459i c6459i, b bVar, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: addRoundRect");
            return;
        }
        if ((i10 & 2) != 0) {
            bVar = b.f23676q;
        }
        interfaceC7144t2.mo28187u(c6459i, bVar);
    }

    /* JADX INFO: renamed from: t */
    static /* synthetic */ void m28220t(InterfaceC7144t2 interfaceC7144t2, C6457g c6457g, b bVar, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: addRect");
            return;
        }
        if ((i10 & 2) != 0) {
            bVar = b.f23676q;
        }
        interfaceC7144t2.mo28175g(c6457g, bVar);
    }

    /* JADX INFO: renamed from: a */
    void mo28170a(float[] fArr);

    /* JADX INFO: renamed from: b */
    void mo28171b(float f10, float f11, float f12, float f13);

    /* JADX INFO: renamed from: c */
    boolean mo28172c();

    void close();

    /* JADX INFO: renamed from: d */
    void mo28173d(InterfaceC7144t2 interfaceC7144t2, long j10);

    /* JADX INFO: renamed from: f */
    void mo28174f(float f10, float f11);

    /* JADX INFO: renamed from: g */
    void mo28175g(C6457g c6457g, b bVar);

    C6457g getBounds();

    /* JADX INFO: renamed from: h */
    void mo28176h(float f10, float f11, float f12, float f13, float f14, float f15);

    boolean isEmpty();

    /* JADX INFO: renamed from: j */
    void mo28177j(int i10);

    /* JADX INFO: renamed from: k */
    void mo28178k(float f10, float f11, float f12, float f13);

    /* JADX INFO: renamed from: l */
    int mo28179l();

    /* JADX INFO: renamed from: m */
    void mo28180m(float f10, float f11);

    /* JADX INFO: renamed from: n */
    void mo28181n(float f10, float f11, float f12, float f13, float f14, float f15);

    /* JADX INFO: renamed from: o */
    boolean mo28182o(InterfaceC7144t2 interfaceC7144t2, InterfaceC7144t2 interfaceC7144t22, int i10);

    /* JADX INFO: renamed from: p */
    void mo28183p();

    /* JADX INFO: renamed from: q */
    void mo28184q(long j10);

    /* JADX INFO: renamed from: r */
    void mo28185r(float f10, float f11);

    void reset();

    /* JADX INFO: renamed from: s */
    void mo28186s(float f10, float f11);

    /* JADX INFO: renamed from: u */
    void mo28187u(C6459i c6459i, b bVar);
}
