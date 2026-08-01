package p057e1;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.C0534l3;
import androidx.compose.runtime.InterfaceC0520j3;
import androidx.compose.runtime.InterfaceC0572r;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: e1.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1984l {

    /* JADX INFO: renamed from: a */
    public static final Object f5518a = new Object();

    /* JADX INFO: renamed from: a */
    public static final int m7161a(int i10, int i11) {
        return i10 << (((i11 % 10) * 3) + 1);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC1978f m7162b(int i10, boolean z10, Object obj) {
        return new C1983k(i10, z10, obj);
    }

    /* JADX INFO: renamed from: c */
    public static final int m7163c(int i10) {
        return m7161a(2, i10);
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC1978f m7164d(int i10, boolean z10, Object obj, InterfaceC0572r interfaceC0572r, int i11) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-1573003438, i11, -1, "androidx.compose.runtime.internal.rememberComposableLambda (ComposableLambda.kt:1372)");
        }
        Object objMo2170f = interfaceC0572r.mo2170f();
        if (objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
            objMo2170f = new C1983k(i10, z10, obj);
            interfaceC0572r.mo2153L(objMo2170f);
        }
        C1983k c1983k = (C1983k) objMo2170f;
        c1983k.m7159x(obj);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return c1983k;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m7165e(InterfaceC0520j3 interfaceC0520j3, InterfaceC0520j3 interfaceC0520j32) {
        if (interfaceC0520j3 == null) {
            return true;
        }
        if (!(interfaceC0520j3 instanceof C0534l3) || !(interfaceC0520j32 instanceof C0534l3)) {
            return false;
        }
        C0534l3 c0534l3 = (C0534l3) interfaceC0520j3;
        return !c0534l3.m1883u() || AbstractC1061t.m3842c(interfaceC0520j3, interfaceC0520j32) || AbstractC1061t.m3842c(c0534l3.m1870h(), ((C0534l3) interfaceC0520j32).m1870h());
    }

    /* JADX INFO: renamed from: f */
    public static final int m7166f(int i10) {
        return m7161a(1, i10);
    }
}
