package androidx.compose.foundation.lazy.layout;

import ec.AbstractC2148k;
import ec.InterfaceC2165o0;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1061t;
import p165l1.InterfaceC4507m;
import p166l2.AbstractC4528c2;
import p166l2.InterfaceC4524b2;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p219p.EnumC5898w0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6544m;
import p263s.AbstractC6635e;
import p277t2.AbstractC8070f0;
import p277t2.C8065d;
import p277t2.C8083m;
import p277t2.InterfaceC8074h0;
import p376zd.C10010p0;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.k1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0392k1 extends InterfaceC4507m.c implements InterfaceC4524b2 {

    /* JADX INFO: renamed from: F */
    public InterfaceC0173a f1123F;

    /* JADX INFO: renamed from: G */
    public InterfaceC0360c1 f1124G;

    /* JADX INFO: renamed from: H */
    public EnumC5898w0 f1125H;

    /* JADX INFO: renamed from: I */
    public boolean f1126I;

    /* JADX INFO: renamed from: J */
    public boolean f1127J;

    /* JADX INFO: renamed from: K */
    public C8083m f1128K;

    /* JADX INFO: renamed from: L */
    public final InterfaceC0184l f1129L = new InterfaceC0184l() { // from class: androidx.compose.foundation.lazy.layout.f1
        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public final Object mo27m(Object obj) {
            return Integer.valueOf(C0392k1.m1254K2(this.f1097q, obj));
        }
    };

    /* JADX INFO: renamed from: M */
    public InterfaceC0184l f1130M;

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.k1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f1131q;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ int f1133s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f1133s = i10;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return C0392k1.this.new a(this.f1133s, interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((a) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f1131q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                InterfaceC0360c1 interfaceC0360c1 = C0392k1.this.f1124G;
                int i11 = this.f1133s;
                this.f1131q = 1;
                if (interfaceC0360c1.mo1151f(i11, this) == objM24992g) {
                    return objM24992g;
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
            }
            return C4700i0.f13910a;
        }
    }

    public C0392k1(InterfaceC0173a interfaceC0173a, InterfaceC0360c1 interfaceC0360c1, EnumC5898w0 enumC5898w0, boolean z10, boolean z11) {
        this.f1123F = interfaceC0173a;
        this.f1124G = interfaceC0360c1;
        this.f1125H = enumC5898w0;
        this.f1126I = z10;
        this.f1127J = z11;
        m1259P2();
    }

    /* JADX INFO: renamed from: G2 */
    public static float m1250G2(C0392k1 c0392k1) {
        return c0392k1.f1124G.mo1147b();
    }

    /* JADX INFO: renamed from: H2 */
    public static Float m1251H2(C0392k1 c0392k1) {
        return Float.valueOf(c0392k1.f1124G.mo1146a() - c0392k1.f1124G.mo1148c());
    }

    /* JADX INFO: renamed from: I2 */
    public static boolean m1252I2(C0392k1 c0392k1, int i10) {
        InterfaceC0437y interfaceC0437y = (InterfaceC0437y) c0392k1.f1123F.invoke();
        if (i10 < 0 || i10 >= interfaceC0437y.mo1451a()) {
            AbstractC6635e.m26318a("Can't scroll to index " + i10 + ", it is out of bounds [0, " + interfaceC0437y.mo1451a() + ')');
        }
        AbstractC2148k.m7817d(c0392k1.m17455f2(), null, null, c0392k1.new a(i10, null), 3, null);
        return true;
    }

    /* JADX INFO: renamed from: J2 */
    public static float m1253J2(C0392k1 c0392k1) {
        return c0392k1.f1124G.mo1149d();
    }

    /* JADX INFO: renamed from: K2 */
    public static int m1254K2(C0392k1 c0392k1, Object obj) {
        InterfaceC0437y interfaceC0437y = (InterfaceC0437y) c0392k1.f1123F.invoke();
        int iMo1451a = interfaceC0437y.mo1451a();
        for (int i10 = 0; i10 < iMo1451a; i10++) {
            if (AbstractC1061t.m3842c(interfaceC0437y.mo1452b(i10), obj)) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: M2 */
    public final C8065d m1256M2() {
        return this.f1124G.mo1150e();
    }

    /* JADX INFO: renamed from: N2 */
    public final boolean m1257N2() {
        return this.f1125H == EnumC5898w0.f18786q;
    }

    /* JADX INFO: renamed from: O2 */
    public final void m1258O2(InterfaceC0173a interfaceC0173a, InterfaceC0360c1 interfaceC0360c1, EnumC5898w0 enumC5898w0, boolean z10, boolean z11) {
        this.f1123F = interfaceC0173a;
        this.f1124G = interfaceC0360c1;
        if (this.f1125H != enumC5898w0) {
            this.f1125H = enumC5898w0;
            AbstractC4528c2.m17573b(this);
        }
        if (this.f1126I == z10 && this.f1127J == z11) {
            return;
        }
        this.f1126I = z10;
        this.f1127J = z11;
        m1259P2();
        AbstractC4528c2.m17573b(this);
    }

    /* JADX INFO: renamed from: P2 */
    public final void m1259P2() {
        this.f1128K = new C8083m(new InterfaceC0173a() { // from class: androidx.compose.foundation.lazy.layout.g1
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return Float.valueOf(C0392k1.m1250G2(this.f1103q));
            }
        }, new InterfaceC0173a() { // from class: androidx.compose.foundation.lazy.layout.h1
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return Float.valueOf(C0392k1.m1253J2(this.f1106q));
            }
        }, this.f1127J);
        this.f1130M = this.f1126I ? new InterfaceC0184l() { // from class: androidx.compose.foundation.lazy.layout.i1
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return Boolean.valueOf(C0392k1.m1252I2(this.f1107q, ((Integer) obj).intValue()));
            }
        } : null;
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: k2 */
    public boolean mo1260k2() {
        return false;
    }

    @Override // p166l2.InterfaceC4524b2
    /* JADX INFO: renamed from: z0 */
    public void mo1261z0(InterfaceC8074h0 interfaceC8074h0) {
        AbstractC8070f0.m31147x0(interfaceC8074h0, true);
        AbstractC8070f0.m31128o(interfaceC8074h0, this.f1129L);
        boolean zM1257N2 = m1257N2();
        C8083m c8083m = this.f1128K;
        if (zM1257N2) {
            if (c8083m == null) {
                AbstractC1061t.m3851l("scrollAxisRange");
                c8083m = null;
            }
            AbstractC8070f0.m31151z0(interfaceC8074h0, c8083m);
        } else {
            if (c8083m == null) {
                AbstractC1061t.m3851l("scrollAxisRange");
                c8083m = null;
            }
            AbstractC8070f0.m31103b0(interfaceC8074h0, c8083m);
        }
        InterfaceC0184l interfaceC0184l = this.f1130M;
        if (interfaceC0184l != null) {
            AbstractC8070f0.m31091R(interfaceC8074h0, null, interfaceC0184l, 1, null);
        }
        AbstractC8070f0.m31120k(interfaceC8074h0, null, new InterfaceC0173a() { // from class: androidx.compose.foundation.lazy.layout.j1
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C0392k1.m1251H2(this.f1118q);
            }
        }, 1, null);
        AbstractC8070f0.m31093T(interfaceC8074h0, m1256M2());
    }
}
