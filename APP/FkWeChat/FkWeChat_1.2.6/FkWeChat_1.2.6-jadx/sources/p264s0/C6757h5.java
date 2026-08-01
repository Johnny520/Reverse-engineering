package p264s0;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;
import p024b9.AbstractC1043k;
import p121i3.AbstractC3180j;
import p121i3.C3179i;
import p265s1.C7128q1;
import p265s1.InterfaceC7090i3;
import p317w0.C9005g0;
import p317w0.C9007h0;

/* JADX INFO: renamed from: s0.h5 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6757h5 {

    /* JADX INFO: renamed from: a */
    public static final C6757h5 f21504a = new C6757h5();

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ long m26812e(C6757h5 c6757h5, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = a.f21505a.m26823b();
        }
        return c6757h5.m26816d(i10);
    }

    /* JADX INFO: renamed from: a */
    public final C6741g5 m26813a(C6753h1 c6753h1, long j10) {
        C6741g5 c6741g5M26771f = c6753h1.m26771f();
        if (c6741g5M26771f != null) {
            return c6741g5M26771f;
        }
        C7128q1.a aVar = C7128q1.f23644b;
        C6741g5 c6741g5 = new C6741g5(aVar.m28146g(), j10, aVar.m28146g(), C7128q1.m28129o(j10, C9007h0.f30042a.m34547a(), 0.0f, 0.0f, 0.0f, 14, null), null);
        c6753h1.m26788n0(c6741g5);
        return c6741g5;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC7090i3 m26814b(InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-377108005, i10, -1, "androidx.compose.material3.IconButtonDefaults.<get-standardShape> (IconButtonDefaults.kt:849)");
        }
        InterfaceC7090i3 interfaceC7090i3M27563h = AbstractC6965u8.m27563h(C9005g0.f30015a.m34535b(), interfaceC0572r, 6);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return interfaceC7090i3M27563h;
    }

    /* JADX INFO: renamed from: c */
    public final C6741g5 m26815c(InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-1037266503, i10, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButtonDefaults.kt:42)");
        }
        long jM28139y = ((C7128q1) interfaceC0572r.mo2142A(AbstractC6865o1.m27265a())).m28139y();
        C6741g5 c6741g5M26813a = m26813a(C6977v5.f22996a.m27579a(interfaceC0572r, 6), jM28139y);
        if (!C7128q1.m28131q(c6741g5M26813a.m26711e(), jM28139y)) {
            c6741g5M26813a = C6741g5.m26707d(c6741g5M26813a, 0L, jM28139y, 0L, C7128q1.m28129o(jM28139y, C9007h0.f30042a.m34547a(), 0.0f, 0.0f, 0.0f, 14, null), 5, null);
        }
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return c6741g5M26813a;
    }

    /* JADX INFO: renamed from: d */
    public final long m26816d(int i10) {
        float fM12003k;
        a.C10200a c10200a = a.f21505a;
        if (a.m26821e(i10, c10200a.m26822a())) {
            C9005g0 c9005g0 = C9005g0.f30015a;
            fM12003k = C3179i.m12003k(c9005g0.m34538e() + c9005g0.m34539f());
        } else if (a.m26821e(i10, c10200a.m26823b())) {
            C9005g0 c9005g02 = C9005g0.f30015a;
            fM12003k = C3179i.m12003k(c9005g02.m34536c() + c9005g02.m34536c());
        } else if (a.m26821e(i10, c10200a.m26824c())) {
            C9005g0 c9005g03 = C9005g0.f30015a;
            fM12003k = C3179i.m12003k(c9005g03.m34540g() + c9005g03.m34541h());
        } else {
            fM12003k = C3179i.m12003k(0);
        }
        C9005g0 c9005g04 = C9005g0.f30015a;
        return AbstractC3180j.m12013a(C3179i.m12003k(c9005g04.m34537d() + fM12003k), c9005g04.m34534a());
    }

    /* JADX INFO: renamed from: s0.h5$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C10200a f21505a = new C10200a(null);

        /* JADX INFO: renamed from: b */
        public static final int f21506b = m26820d(0);

        /* JADX INFO: renamed from: c */
        public static final int f21507c = m26820d(1);

        /* JADX INFO: renamed from: d */
        public static final int f21508d = m26820d(2);

        /* JADX INFO: renamed from: e */
        public static final boolean m26821e(int i10, int i11) {
            return i10 == i11;
        }

        /* JADX INFO: renamed from: s0.h5$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10200a {
            public /* synthetic */ C10200a(AbstractC1043k abstractC1043k) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final int m26822a() {
                return a.f21506b;
            }

            /* JADX INFO: renamed from: b */
            public final int m26823b() {
                return a.f21507c;
            }

            /* JADX INFO: renamed from: c */
            public final int m26824c() {
                return a.f21508d;
            }

            public C10200a() {
            }
        }

        /* JADX INFO: renamed from: d */
        public static int m26820d(int i10) {
            return i10;
        }
    }
}
