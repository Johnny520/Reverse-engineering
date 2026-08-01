package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0668k;
import java.util.Iterator;
import okhttp3.C5753h;
import p181m4.C4970g;
import p181m4.InterfaceC4973j;

/* JADX INFO: renamed from: androidx.lifecycle.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0666j {

    /* JADX INFO: renamed from: a */
    public static final C0666j f1960a = new C0666j();

    /* JADX INFO: renamed from: androidx.lifecycle.j$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements C4970g.a {
        @Override // p181m4.C4970g.a
        /* JADX INFO: renamed from: a */
        public void mo2623a(InterfaceC4973j interfaceC4973j) {
            interfaceC4973j.getClass();
            if (!(interfaceC4973j instanceof InterfaceC0677o0)) {
                C5753h.m23254a("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ", interfaceC4973j);
                return;
            }
            C0675n0 c0675n0Mo2659c = ((InterfaceC0677o0) interfaceC4973j).mo2659c();
            C4970g savedStateRegistry = interfaceC4973j.getSavedStateRegistry();
            Iterator it = c0675n0Mo2659c.m2657c().iterator();
            while (it.hasNext()) {
                AbstractC0671l0 abstractC0671l0M2656b = c0675n0Mo2659c.m2656b((String) it.next());
                if (abstractC0671l0M2656b != null) {
                    C0666j.m2620a(abstractC0671l0M2656b, savedStateRegistry, interfaceC4973j.getLifecycle());
                }
            }
            if (c0675n0Mo2659c.m2657c().isEmpty()) {
                return;
            }
            savedStateRegistry.m20070d(a.class);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.j$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC0672m {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ AbstractC0668k f1961q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C4970g f1962r;

        public b(AbstractC0668k abstractC0668k, C4970g c4970g) {
            this.f1961q = abstractC0668k;
            this.f1962r = c4970g;
        }

        @Override // androidx.lifecycle.InterfaceC0672m
        /* JADX INFO: renamed from: j */
        public void mo2593j(InterfaceC0676o interfaceC0676o, AbstractC0668k.a aVar) {
            interfaceC0676o.getClass();
            aVar.getClass();
            if (aVar == AbstractC0668k.a.ON_START) {
                this.f1961q.mo2630c(this);
                this.f1962r.m20070d(a.class);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m2620a(AbstractC0671l0 abstractC0671l0, C4970g c4970g, AbstractC0668k abstractC0668k) {
        abstractC0671l0.getClass();
        c4970g.getClass();
        abstractC0668k.getClass();
        C0655d0 c0655d0 = (C0655d0) abstractC0671l0.m2640c("androidx.lifecycle.savedstate.vm.tag");
        if (c0655d0 == null || c0655d0.m2596e()) {
            return;
        }
        c0655d0.m2594c(c4970g, abstractC0668k);
        f1960a.m2622c(c4970g, abstractC0668k);
    }

    /* JADX INFO: renamed from: b */
    public static final C0655d0 m2621b(C4970g c4970g, AbstractC0668k abstractC0668k, String str, Bundle bundle) {
        c4970g.getClass();
        abstractC0668k.getClass();
        str.getClass();
        C0655d0 c0655d0 = new C0655d0(str, C0651b0.f1928c.m2584a(c4970g.m20067a(str), bundle));
        c0655d0.m2594c(c4970g, abstractC0668k);
        f1960a.m2622c(c4970g, abstractC0668k);
        return c0655d0;
    }

    /* JADX INFO: renamed from: c */
    public final void m2622c(C4970g c4970g, AbstractC0668k abstractC0668k) {
        AbstractC0668k.b bVarMo2629b = abstractC0668k.mo2629b();
        if (bVarMo2629b == AbstractC0668k.b.f1969r || bVarMo2629b.m2636c(AbstractC0668k.b.f1971t)) {
            c4970g.m20070d(a.class);
        } else {
            abstractC0668k.mo2628a(new b(abstractC0668k, c4970g));
        }
    }
}
