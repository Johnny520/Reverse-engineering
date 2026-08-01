package p135j2;

import androidx.compose.runtime.AbstractC0482e0;
import androidx.compose.runtime.InterfaceC0521j4;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1067w;
import p121i3.C3189s;
import p166l2.C4554j0;
import p172l8.C4700i0;
import p376zd.C9987e;

/* JADX INFO: renamed from: j2.b2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3506b2 {

    /* JADX INFO: renamed from: f */
    public static final int f9725f = 8;

    /* JADX INFO: renamed from: a */
    public final InterfaceC3514d2 f9726a;

    /* JADX INFO: renamed from: b */
    public C3536j0 f9727b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0188p f9728c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0188p f9729d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0188p f9730e;

    /* JADX INFO: renamed from: j2.b2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo13061a(InterfaceC0521j4 interfaceC0521j4);

        b apply();

        /* JADX INFO: renamed from: b */
        boolean mo13062b();

        void cancel();
    }

    /* JADX INFO: renamed from: j2.b2$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC1067w implements InterfaceC0188p {
        public c() {
            super(2);
        }

        /* JADX INFO: renamed from: a */
        public final void m13068a(C4554j0 c4554j0, AbstractC0482e0 abstractC0482e0) {
            C3506b2.this.m13059i().m13186R(abstractC0482e0);
        }

        @Override // p010a9.InterfaceC0188p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m13068a((C4554j0) obj, (AbstractC0482e0) obj2);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: j2.b2$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC1067w implements InterfaceC0188p {
        public d() {
            super(2);
        }

        /* JADX INFO: renamed from: a */
        public final void m13069a(C4554j0 c4554j0, InterfaceC0188p interfaceC0188p) {
            c4554j0.mo17768k(C3506b2.this.m13059i().m13195w(interfaceC0188p));
        }

        @Override // p010a9.InterfaceC0188p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m13069a((C4554j0) obj, (InterfaceC0188p) obj2);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: j2.b2$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e extends AbstractC1067w implements InterfaceC0188p {
        public e() {
            super(2);
        }

        /* JADX INFO: renamed from: a */
        public final void m13070a(C4554j0 c4554j0, C3506b2 c3506b2) {
            C3506b2 c3506b22 = C3506b2.this;
            C3536j0 c3536j0M17854D0 = c4554j0.m17854D0();
            if (c3536j0M17854D0 == null) {
                c3536j0M17854D0 = new C3536j0(c4554j0, C3506b2.this.f9726a);
                c4554j0.m17931f2(c3536j0M17854D0);
            }
            c3506b22.f9727b = c3536j0M17854D0;
            C3506b2.this.m13059i().m13177H();
            C3506b2.this.m13059i().m13187S(C3506b2.this.f9726a);
        }

        @Override // p010a9.InterfaceC0188p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m13070a((C4554j0) obj, (C3506b2) obj2);
            return C4700i0.f13910a;
        }
    }

    public C3506b2(InterfaceC3514d2 interfaceC3514d2) {
        this.f9726a = interfaceC3514d2;
        this.f9728c = new e();
        this.f9729d = new c();
        this.f9730e = new d();
    }

    /* JADX INFO: renamed from: d */
    public final a m13054d(Object obj, InterfaceC0188p interfaceC0188p) {
        return m13059i().m13183O(obj, interfaceC0188p);
    }

    /* JADX INFO: renamed from: e */
    public final void m13055e() {
        m13059i().m13174E();
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC0188p m13056f() {
        return this.f9729d;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC0188p m13057g() {
        return this.f9730e;
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC0188p m13058h() {
        return this.f9728c;
    }

    /* JADX INFO: renamed from: i */
    public final C3536j0 m13059i() {
        C3536j0 c3536j0 = this.f9727b;
        if (c3536j0 != null) {
            return c3536j0;
        }
        C9987e.m38645a("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final b m13060j(Object obj, InterfaceC0188p interfaceC0188p) {
        return m13059i().m13181M(obj, interfaceC0188p);
    }

    public C3506b2() {
        this(C3579w0.f9942a);
    }

    /* JADX INFO: renamed from: j2.b2$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo13063a();

        /* JADX INFO: renamed from: b */
        default int mo13064b() {
            return 0;
        }

        /* JADX INFO: renamed from: c */
        default long mo13065c(int i10) {
            return C3189s.f8481b.m12088a();
        }

        /* JADX INFO: renamed from: d */
        default void mo13066d(Object obj, InterfaceC0184l interfaceC0184l) {
        }

        /* JADX INFO: renamed from: e */
        default void mo13067e(int i10, long j10) {
        }
    }
}
