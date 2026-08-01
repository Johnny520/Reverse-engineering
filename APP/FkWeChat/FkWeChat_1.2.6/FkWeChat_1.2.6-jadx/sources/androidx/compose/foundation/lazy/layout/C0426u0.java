package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;
import java.util.List;
import p010a9.InterfaceC0184l;
import p185m8.AbstractC5114x;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.u0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0426u0 {

    /* JADX INFO: renamed from: a */
    public InterfaceC0381h2 f1231a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0184l f1232b;

    /* JADX INFO: renamed from: c */
    public final C0369e2 f1233c;

    /* JADX INFO: renamed from: d */
    public C0365d2 f1234d;

    /* JADX INFO: renamed from: e */
    public int f1235e;

    /* JADX INFO: renamed from: f */
    public int f1236f;

    /* JADX INFO: renamed from: g */
    public int f1237g;

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.u0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class a implements InterfaceC0442z1 {

        /* JADX INFO: renamed from: a */
        public final int f1238a;

        /* JADX INFO: renamed from: b */
        public final List f1239b = new ArrayList();

        public a(int i10) {
            this.f1238a = i10;
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0442z1
        /* JADX INFO: renamed from: a */
        public void mo1416a(int i10) {
            C0365d2 c0365d2M1409e = C0426u0.this.m1409e();
            if (c0365d2M1409e == null) {
                return;
            }
            this.f1239b.add(c0365d2M1409e.m1162d(i10, C0426u0.this.f1233c));
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0442z1
        /* JADX INFO: renamed from: b */
        public int mo1417b() {
            return this.f1238a;
        }

        /* JADX INFO: renamed from: c */
        public final List m1418c() {
            return this.f1239b;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.u0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo1170a();

        void cancel();
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.u0$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface c {
        /* JADX INFO: renamed from: b */
        int mo1171b();

        /* JADX INFO: renamed from: c */
        long mo1172c(int i10);
    }

    public C0426u0() {
        this.f1233c = new C0369e2();
        this.f1235e = -1;
        this.f1236f = -1;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ b m1405h(C0426u0 c0426u0, int i10, long j10, InterfaceC0184l interfaceC0184l, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            interfaceC0184l = null;
        }
        return c0426u0.m1411g(i10, j10, interfaceC0184l);
    }

    /* JADX INFO: renamed from: b */
    public final List m1406b() {
        InterfaceC0184l interfaceC0184l = this.f1232b;
        if (interfaceC0184l == null) {
            return AbstractC5114x.m20800o();
        }
        a aVar = new a(this.f1235e);
        interfaceC0184l.mo27m(aVar);
        List listM1418c = aVar.m1418c();
        this.f1237g = listM1418c.size();
        return listM1418c;
    }

    /* JADX INFO: renamed from: c */
    public final int m1407c() {
        return this.f1236f;
    }

    /* JADX INFO: renamed from: d */
    public final int m1408d() {
        return this.f1237g;
    }

    /* JADX INFO: renamed from: e */
    public final C0365d2 m1409e() {
        return this.f1234d;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC0381h2 m1410f() {
        return this.f1231a;
    }

    /* JADX INFO: renamed from: g */
    public final b m1411g(int i10, long j10, InterfaceC0184l interfaceC0184l) {
        return m1412i(i10, j10, true, interfaceC0184l);
    }

    /* JADX INFO: renamed from: i */
    public final b m1412i(int i10, long j10, boolean z10, InterfaceC0184l interfaceC0184l) {
        b bVarM1166h;
        C0365d2 c0365d2 = this.f1234d;
        return (c0365d2 == null || (bVarM1166h = c0365d2.m1166h(i10, j10, this.f1233c, z10, interfaceC0184l)) == null) ? C0366e.f1079a : bVarM1166h;
    }

    /* JADX INFO: renamed from: j */
    public final void m1413j(int i10) {
        this.f1236f = i10;
    }

    /* JADX INFO: renamed from: k */
    public final void m1414k(C0365d2 c0365d2) {
        this.f1234d = c0365d2;
    }

    /* JADX INFO: renamed from: l */
    public final void m1415l(int i10) {
        this.f1235e = i10;
    }

    public C0426u0(InterfaceC0381h2 interfaceC0381h2, InterfaceC0184l interfaceC0184l) {
        this();
        this.f1231a = interfaceC0381h2;
        this.f1232b = interfaceC0184l;
    }
}
