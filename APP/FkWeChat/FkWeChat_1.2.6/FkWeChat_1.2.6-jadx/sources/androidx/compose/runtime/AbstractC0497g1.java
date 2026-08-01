package androidx.compose.runtime;

import ec.AbstractC2108a2;
import ec.AbstractC2169p0;
import ec.InterfaceC2165o0;
import ec.InterfaceC2198w1;
import ec.InterfaceC2208z;
import java.util.Arrays;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: androidx.compose.runtime.g1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0497g1 {

    /* JADX INFO: renamed from: a */
    public static final C0476d1 f1376a = new C0476d1();

    /* JADX INFO: renamed from: a */
    public static final void m1677a(Object obj, InterfaceC0184l interfaceC0184l, InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-1371986847, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:153)");
        }
        boolean zMo2162U = interfaceC0572r.mo2162U(obj);
        Object objMo2170f = interfaceC0572r.mo2170f();
        if (zMo2162U || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
            objMo2170f = new C0462b1(interfaceC0184l);
            interfaceC0572r.mo2153L(objMo2170f);
        }
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m1678b(Object obj, Object obj2, InterfaceC0184l interfaceC0184l, InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(1429097729, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:190)");
        }
        boolean zMo2162U = interfaceC0572r.mo2162U(obj) | interfaceC0572r.mo2162U(obj2);
        Object objMo2170f = interfaceC0572r.mo2170f();
        if (zMo2162U || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
            objMo2170f = new C0462b1(interfaceC0184l);
            interfaceC0572r.mo2153L(objMo2170f);
        }
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m1679c(Object[] objArr, InterfaceC0184l interfaceC0184l, InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-1307627122, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:264)");
        }
        boolean zMo2162U = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zMo2162U |= interfaceC0572r.mo2162U(obj);
        }
        Object objMo2170f = interfaceC0572r.mo2170f();
        if (zMo2162U || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
            interfaceC0572r.mo2153L(new C0462b1(interfaceC0184l));
        }
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m1680d(Object obj, InterfaceC0188p interfaceC0188p, InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(1179185413, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:333)");
        }
        InterfaceC5980j interfaceC5980jMo2145D = interfaceC0572r.mo2145D();
        boolean zMo2162U = interfaceC0572r.mo2162U(obj);
        Object objMo2170f = interfaceC0572r.mo2170f();
        if (zMo2162U || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
            objMo2170f = new C0599u1(interfaceC5980jMo2145D, interfaceC0188p);
            interfaceC0572r.mo2153L(objMo2170f);
        }
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m1681e(Object obj, Object obj2, InterfaceC0188p interfaceC0188p, InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(590241125, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:352)");
        }
        InterfaceC5980j interfaceC5980jMo2145D = interfaceC0572r.mo2145D();
        boolean zMo2162U = interfaceC0572r.mo2162U(obj) | interfaceC0572r.mo2162U(obj2);
        Object objMo2170f = interfaceC0572r.mo2170f();
        if (zMo2162U || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
            objMo2170f = new C0599u1(interfaceC5980jMo2145D, interfaceC0188p);
            interfaceC0572r.mo2153L(objMo2170f);
        }
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m1682f(Object[] objArr, InterfaceC0188p interfaceC0188p, InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-139560008, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:399)");
        }
        InterfaceC5980j interfaceC5980jMo2145D = interfaceC0572r.mo2145D();
        boolean zMo2162U = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zMo2162U |= interfaceC0572r.mo2162U(obj);
        }
        Object objMo2170f = interfaceC0572r.mo2170f();
        if (zMo2162U || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
            interfaceC0572r.mo2153L(new C0599u1(interfaceC5980jMo2145D, interfaceC0188p));
        }
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m1683g(InterfaceC0173a interfaceC0173a, InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-1288466761, i10, -1, "androidx.compose.runtime.SideEffect (Effects.kt:51)");
        }
        interfaceC0572r.mo2178n(interfaceC0173a);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
    }

    /* JADX INFO: renamed from: i */
    public static final InterfaceC2165o0 m1685i(InterfaceC5980j interfaceC5980j, InterfaceC0572r interfaceC0572r) {
        if (interfaceC5980j.mo1654h(InterfaceC2198w1.f6022g) == null) {
            return new C0486e4(interfaceC0572r.mo2145D(), interfaceC5980j);
        }
        InterfaceC2208z interfaceC2208zM7602b = AbstractC2108a2.m7602b(null, 1, null);
        interfaceC2208zM7602b.mo7942j(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return AbstractC2169p0.m7878a(interfaceC2208zM7602b);
    }
}
