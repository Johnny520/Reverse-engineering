package p275t0;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0497g1;
import androidx.compose.runtime.AbstractC0541m3;
import androidx.compose.runtime.C0476d1;
import androidx.compose.runtime.InterfaceC0469c1;
import androidx.compose.runtime.InterfaceC0514i4;
import androidx.compose.runtime.InterfaceC0564p5;
import androidx.compose.runtime.InterfaceC0572r;
import androidx.lifecycle.AbstractC0668k;
import androidx.lifecycle.InterfaceC0672m;
import androidx.lifecycle.InterfaceC0676o;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p093g4.AbstractC2517b;
import p172l8.C4700i0;
import p179m2.AbstractC4854i0;

/* JADX INFO: renamed from: t0.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7962h {

    /* JADX INFO: renamed from: t0.h$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0469c1 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0173a f26528a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0676o f26529b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC0672m f26530c;

        public a(InterfaceC0173a interfaceC0173a, InterfaceC0676o interfaceC0676o, InterfaceC0672m interfaceC0672m) {
            this.f26528a = interfaceC0173a;
            this.f26529b = interfaceC0676o;
            this.f26530c = interfaceC0672m;
        }

        @Override // androidx.compose.runtime.InterfaceC0469c1
        /* JADX INFO: renamed from: a */
        public void mo1209a() {
            this.f26528a.invoke();
            this.f26529b.getLifecycle().mo2630c(this.f26530c);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m30722a(InterfaceC0676o interfaceC0676o, InterfaceC0184l interfaceC0184l, InterfaceC0173a interfaceC0173a, int i10, int i11, InterfaceC0572r interfaceC0572r, int i12) {
        m30729h(interfaceC0676o, interfaceC0184l, interfaceC0173a, interfaceC0572r, AbstractC0541m3.m1929a(i10 | 1), i11);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC0469c1 m30723b(InterfaceC0676o interfaceC0676o, final InterfaceC0184l interfaceC0184l, InterfaceC0173a interfaceC0173a, C0476d1 c0476d1) {
        InterfaceC0672m interfaceC0672m = new InterfaceC0672m() { // from class: t0.g
            @Override // androidx.lifecycle.InterfaceC0672m
            /* JADX INFO: renamed from: j */
            public final void mo2593j(InterfaceC0676o interfaceC0676o2, AbstractC0668k.a aVar) {
                AbstractC7962h.m30727f(interfaceC0184l, interfaceC0676o2, aVar);
            }
        };
        interfaceC0676o.getLifecycle().mo2628a(interfaceC0672m);
        return new a(interfaceC0173a, interfaceC0676o, interfaceC0672m);
    }

    /* JADX INFO: renamed from: c */
    public static C4700i0 m30724c(AbstractC0668k.a aVar) {
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: d */
    public static C4700i0 m30725d() {
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: e */
    public static C4700i0 m30726e(AccessibilityManagerAccessibilityStateChangeListenerC7944c1 accessibilityManagerAccessibilityStateChangeListenerC7944c1, AccessibilityManager accessibilityManager, AbstractC0668k.a aVar) {
        if (aVar == AbstractC0668k.a.ON_RESUME) {
            accessibilityManagerAccessibilityStateChangeListenerC7944c1.m30664v(accessibilityManager);
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: f */
    public static void m30727f(InterfaceC0184l interfaceC0184l, InterfaceC0676o interfaceC0676o, AbstractC0668k.a aVar) {
        interfaceC0184l.mo27m(aVar);
    }

    /* JADX INFO: renamed from: g */
    public static C4700i0 m30728g(AccessibilityManagerAccessibilityStateChangeListenerC7944c1 accessibilityManagerAccessibilityStateChangeListenerC7944c1, AccessibilityManager accessibilityManager) {
        accessibilityManagerAccessibilityStateChangeListenerC7944c1.m30666x(accessibilityManager);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: h */
    public static final void m30729h(final InterfaceC0676o interfaceC0676o, final InterfaceC0184l interfaceC0184l, final InterfaceC0173a interfaceC0173a, InterfaceC0572r interfaceC0572r, final int i10, final int i11) {
        int i12;
        InterfaceC0572r interfaceC0572rMo2181q = interfaceC0572r.mo2181q(-1868327245);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC0572rMo2181q.mo2175k(interfaceC0676o) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC0572rMo2181q.mo2175k(interfaceC0184l) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC0572rMo2181q.mo2175k(interfaceC0173a) ? 256 : 128;
        }
        if (interfaceC0572rMo2181q.mo2144C((i12 & Opcodes.I2S) != 146, i12 & 1)) {
            if (i13 != 0) {
                Object objMo2170f = interfaceC0572rMo2181q.mo2170f();
                if (objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
                    objMo2170f = new InterfaceC0184l() { // from class: t0.c
                        @Override // p010a9.InterfaceC0184l
                        /* JADX INFO: renamed from: m */
                        public final Object mo27m(Object obj) {
                            return AbstractC7962h.m30724c((AbstractC0668k.a) obj);
                        }
                    };
                    interfaceC0572rMo2181q.mo2153L(objMo2170f);
                }
                interfaceC0184l = (InterfaceC0184l) objMo2170f;
            }
            if (i14 != 0) {
                Object objMo2170f2 = interfaceC0572rMo2181q.mo2170f();
                if (objMo2170f2 == InterfaceC0572r.f1573a.m2191a()) {
                    objMo2170f2 = new InterfaceC0173a() { // from class: t0.d
                        @Override // p010a9.InterfaceC0173a
                        public final Object invoke() {
                            return AbstractC7962h.m30725d();
                        }
                    };
                    interfaceC0572rMo2181q.mo2153L(objMo2170f2);
                }
                interfaceC0173a = (InterfaceC0173a) objMo2170f2;
            }
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(-1868327245, i12, -1, "androidx.compose.material3.internal.ObserveState (AccessibilityServiceStateProvider.android.kt:82)");
            }
            boolean zMo2175k = ((i12 & Opcodes.IREM) == 32) | interfaceC0572rMo2181q.mo2175k(interfaceC0676o) | ((i12 & 896) == 256);
            Object objMo2170f3 = interfaceC0572rMo2181q.mo2170f();
            if (zMo2175k || objMo2170f3 == InterfaceC0572r.f1573a.m2191a()) {
                objMo2170f3 = new InterfaceC0184l() { // from class: t0.e
                    @Override // p010a9.InterfaceC0184l
                    /* JADX INFO: renamed from: m */
                    public final Object mo27m(Object obj) {
                        return AbstractC7962h.m30723b(interfaceC0676o, interfaceC0184l, interfaceC0173a, (C0476d1) obj);
                    }
                };
                interfaceC0572rMo2181q.mo2153L(objMo2170f3);
            }
            AbstractC0497g1.m1677a(interfaceC0676o, (InterfaceC0184l) objMo2170f3, interfaceC0572rMo2181q, i12 & 14);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        } else {
            interfaceC0572rMo2181q.mo2190z();
        }
        final InterfaceC0184l interfaceC0184l2 = interfaceC0184l;
        final InterfaceC0173a interfaceC0173a2 = interfaceC0173a;
        InterfaceC0514i4 interfaceC0514i4Mo2188x = interfaceC0572rMo2181q.mo2188x();
        if (interfaceC0514i4Mo2188x != null) {
            interfaceC0514i4Mo2188x.mo1756a(new InterfaceC0188p() { // from class: t0.f
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7962h.m30722a(interfaceC0676o, interfaceC0184l2, interfaceC0173a2, i10, i11, (InterfaceC0572r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: i */
    public static final InterfaceC0564p5 m30730i(boolean z10, boolean z11, boolean z12, InterfaceC0572r interfaceC0572r, int i10, int i11) {
        boolean z13 = true;
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            z12 = true;
        }
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(432241692, i10, -1, "androidx.compose.material3.internal.rememberAccessibilityServiceState (AccessibilityServiceStateProvider.android.kt:46)");
        }
        Object systemService = ((Context) interfaceC0572r.mo2142A(AbstractC4854i0.m19379d())).getSystemService("accessibility");
        systemService.getClass();
        final AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        boolean z14 = ((((i10 & 14) ^ 6) > 4 && interfaceC0572r.mo2167c(z10)) || (i10 & 6) == 4) | ((((i10 & Opcodes.IREM) ^ 48) > 32 && interfaceC0572r.mo2167c(z11)) || (i10 & 48) == 32);
        if ((((i10 & 896) ^ 384) <= 256 || !interfaceC0572r.mo2167c(z12)) && (i10 & 384) != 256) {
            z13 = false;
        }
        boolean z15 = z14 | z13;
        Object objMo2170f = interfaceC0572r.mo2170f();
        if (z15 || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
            objMo2170f = new AccessibilityManagerAccessibilityStateChangeListenerC7944c1(z10, z11, z12);
            interfaceC0572r.mo2153L(objMo2170f);
        }
        final AccessibilityManagerAccessibilityStateChangeListenerC7944c1 accessibilityManagerAccessibilityStateChangeListenerC7944c1 = (AccessibilityManagerAccessibilityStateChangeListenerC7944c1) objMo2170f;
        InterfaceC0676o interfaceC0676o = (InterfaceC0676o) interfaceC0572r.mo2142A(AbstractC2517b.m9025b());
        boolean zMo2162U = interfaceC0572r.mo2162U(accessibilityManagerAccessibilityStateChangeListenerC7944c1) | interfaceC0572r.mo2175k(accessibilityManager);
        Object objMo2170f2 = interfaceC0572r.mo2170f();
        if (zMo2162U || objMo2170f2 == InterfaceC0572r.f1573a.m2191a()) {
            objMo2170f2 = new InterfaceC0184l() { // from class: t0.a
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return AbstractC7962h.m30726e(accessibilityManagerAccessibilityStateChangeListenerC7944c1, accessibilityManager, (AbstractC0668k.a) obj);
                }
            };
            interfaceC0572r.mo2153L(objMo2170f2);
        }
        InterfaceC0184l interfaceC0184l = (InterfaceC0184l) objMo2170f2;
        boolean zMo2162U2 = interfaceC0572r.mo2162U(accessibilityManagerAccessibilityStateChangeListenerC7944c1) | interfaceC0572r.mo2175k(accessibilityManager);
        Object objMo2170f3 = interfaceC0572r.mo2170f();
        if (zMo2162U2 || objMo2170f3 == InterfaceC0572r.f1573a.m2191a()) {
            objMo2170f3 = new InterfaceC0173a() { // from class: t0.b
                @Override // p010a9.InterfaceC0173a
                public final Object invoke() {
                    return AbstractC7962h.m30728g(accessibilityManagerAccessibilityStateChangeListenerC7944c1, accessibilityManager);
                }
            };
            interfaceC0572r.mo2153L(objMo2170f3);
        }
        m30729h(interfaceC0676o, interfaceC0184l, (InterfaceC0173a) objMo2170f3, interfaceC0572r, 0, 0);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return accessibilityManagerAccessibilityStateChangeListenerC7944c1;
    }
}
