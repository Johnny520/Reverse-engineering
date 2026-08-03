package androidx.lifecycle;

import androidx.lifecycle.AbstractC1116e;
import androidx.savedstate.C1224a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import p000a.AbstractC0073Dg;
import p000a.C0109Fg;
import p000a.C0631i9;
import p000a.InterfaceC0127Gg;
import p000a.InterfaceC0214Ld;

/* JADX INFO: renamed from: androidx.lifecycle.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1115d {

    /* JADX INFO: renamed from: androidx.lifecycle.d$a */
    @Metadata(m3302d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3303d2 = {"Landroidx/lifecycle/d$a;", "Landroidx/savedstate/a$a;", "<init>", "()V", "lifecycle-viewmodel-savedstate_release"}, m3304k = 1, m3305mv = {1, 8, 0}, m3307xi = 48)
    public static final class a implements C1224a.a {
        @Override // androidx.savedstate.C1224a.a
        /* JADX INFO: renamed from: a */
        public final void mo2591a(InterfaceC0214Ld interfaceC0214Ld) {
            if (!(interfaceC0214Ld instanceof InterfaceC0127Gg)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            C0109Fg viewModelStore = ((InterfaceC0127Gg) interfaceC0214Ld).getViewModelStore();
            C1224a savedStateRegistry = interfaceC0214Ld.getSavedStateRegistry();
            viewModelStore.getClass();
            LinkedHashMap linkedHashMap = viewModelStore.f369a;
            for (String str : new HashSet(linkedHashMap.keySet())) {
                C0631i9.m1482e(str, "key");
                AbstractC0073Dg abstractC0073Dg = (AbstractC0073Dg) linkedHashMap.get(str);
                C0631i9.m1479b(abstractC0073Dg);
                C1115d.m2590a(abstractC0073Dg, savedStateRegistry, interfaceC0214Ld.getLifecycle());
            }
            if (new HashSet(linkedHashMap.keySet()).isEmpty()) {
                return;
            }
            savedStateRegistry.m3010d();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m2590a(AbstractC0073Dg abstractC0073Dg, C1224a c1224a, AbstractC1116e abstractC1116e) {
        Object obj;
        C0631i9.m1482e(c1224a, "registry");
        C0631i9.m1482e(abstractC1116e, "lifecycle");
        HashMap map = abstractC0073Dg.f243a;
        if (map == null) {
            obj = null;
        } else {
            synchronized (map) {
                obj = abstractC0073Dg.f243a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController == null || savedStateHandleController.f4663c) {
            return;
        }
        savedStateHandleController.m2585c(abstractC1116e, c1224a);
        AbstractC1116e.b bVarMo2593b = abstractC1116e.mo2593b();
        if (bVarMo2593b == AbstractC1116e.b.f4673b || bVarMo2593b.compareTo(AbstractC1116e.b.f4675d) >= 0) {
            c1224a.m3010d();
        } else {
            abstractC1116e.mo2592a(new LegacySavedStateHandleController$tryToAddRecreator$1(abstractC1116e, c1224a));
        }
    }
}
