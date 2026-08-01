package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0668k;
import androidx.lifecycle.C0673m0;
import p024b9.AbstractC1052o0;
import p098g9.InterfaceC2549c;
import p137j4.AbstractC3594a;
import p181m4.C4970g;
import p181m4.InterfaceC4973j;
import p376zd.C10010p0;
import p376zd.C9987e;

/* JADX INFO: renamed from: androidx.lifecycle.e0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0657e0 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC3594a.c f1943a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC3594a.c f1944b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC3594a.c f1945c;

    /* JADX INFO: renamed from: androidx.lifecycle.e0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements C0673m0.c {
        @Override // androidx.lifecycle.C0673m0.c
        /* JADX INFO: renamed from: b */
        public AbstractC0671l0 mo2607b(InterfaceC2549c interfaceC2549c, AbstractC3594a abstractC3594a) {
            interfaceC2549c.getClass();
            abstractC3594a.getClass();
            return new C0663h0();
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.e0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements AbstractC3594a.c {
    }

    /* JADX INFO: renamed from: androidx.lifecycle.e0$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements AbstractC3594a.c {
    }

    /* JADX INFO: renamed from: androidx.lifecycle.e0$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d implements AbstractC3594a.c {
    }

    static {
        AbstractC3594a.a aVar = AbstractC3594a.f9989b;
        f1943a = new b();
        f1944b = new c();
        f1945c = new d();
    }

    /* JADX INFO: renamed from: a */
    public static final C0651b0 m2602a(AbstractC3594a abstractC3594a) {
        abstractC3594a.getClass();
        InterfaceC4973j interfaceC4973j = (InterfaceC4973j) abstractC3594a.mo13448a(f1943a);
        if (interfaceC4973j == null) {
            C9987e.m38645a("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        InterfaceC0677o0 interfaceC0677o0 = (InterfaceC0677o0) abstractC3594a.mo13448a(f1944b);
        if (interfaceC0677o0 == null) {
            C9987e.m38645a("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle = (Bundle) abstractC3594a.mo13448a(f1945c);
        String str = (String) abstractC3594a.mo13448a(C0673m0.f1979c);
        if (str != null) {
            return m2603b(interfaceC4973j, interfaceC0677o0, str, bundle);
        }
        C9987e.m38645a("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final C0651b0 m2603b(InterfaceC4973j interfaceC4973j, InterfaceC0677o0 interfaceC0677o0, String str, Bundle bundle) {
        C0661g0 c0661g0M2605d = m2605d(interfaceC4973j);
        C0663h0 c0663h0M2606e = m2606e(interfaceC0677o0);
        C0651b0 c0651b0 = (C0651b0) c0663h0M2606e.m2613e().get(str);
        if (c0651b0 != null) {
            return c0651b0;
        }
        C0651b0 c0651b0M2584a = C0651b0.f1928c.m2584a(c0661g0M2605d.m2610c(str), bundle);
        c0663h0M2606e.m2613e().put(str, c0651b0M2584a);
        return c0651b0M2584a;
    }

    /* JADX INFO: renamed from: c */
    public static final void m2604c(InterfaceC4973j interfaceC4973j) {
        interfaceC4973j.getClass();
        AbstractC0668k.b bVarMo2629b = interfaceC4973j.getLifecycle().mo2629b();
        if (bVarMo2629b != AbstractC0668k.b.f1969r && bVarMo2629b != AbstractC0668k.b.f1970s) {
            C9987e.m38645a("Failed requirement.");
        } else if (interfaceC4973j.getSavedStateRegistry().m20068b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            C0661g0 c0661g0 = new C0661g0(interfaceC4973j.getSavedStateRegistry(), (InterfaceC0677o0) interfaceC4973j);
            interfaceC4973j.getSavedStateRegistry().m20069c("androidx.lifecycle.internal.SavedStateHandlesProvider", c0661g0);
            interfaceC4973j.getLifecycle().mo2628a(new C0653c0(c0661g0));
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C0661g0 m2605d(InterfaceC4973j interfaceC4973j) {
        interfaceC4973j.getClass();
        C4970g.b bVarM20068b = interfaceC4973j.getSavedStateRegistry().m20068b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        C0661g0 c0661g0 = bVarM20068b instanceof C0661g0 ? (C0661g0) bVarM20068b : null;
        if (c0661g0 != null) {
            return c0661g0;
        }
        C10010p0.m38820a("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final C0663h0 m2606e(InterfaceC0677o0 interfaceC0677o0) {
        interfaceC0677o0.getClass();
        return (C0663h0) C0673m0.b.m2649d(C0673m0.f1978b, interfaceC0677o0, new a(), null, 4, null).m2643b("androidx.lifecycle.internal.SavedStateHandlesVM", AbstractC1052o0.m3807b(C0663h0.class));
    }
}
