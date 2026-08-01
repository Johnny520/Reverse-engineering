package p000;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import top.anjao2024.xp1whs.MainActivity;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class rt0 implements v90 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5553d;

    /* JADX INFO: renamed from: e */
    public final Object f5554e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ rt0(int i, Object obj) {
        this.f5553d = i;
        this.f5554e = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.v90
    /* JADX INFO: renamed from: e */
    public final void mo350e(x90 x90Var, q90 q90Var) {
        int i = this.f5553d;
        Object obj = this.f5554e;
        switch (i) {
            case 0:
                nx0 nx0Var = (nx0) obj;
                if (q90Var != q90.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                x90Var.getLifecycle().mo4015b(this);
                Bundle bundleM1960a = nx0Var.getSavedStateRegistry().m1960a("androidx.savedstate.Restarter");
                if (bundleM1960a == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleM1960a.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    C0921xc.m5134o("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, rt0.class.getClassLoader()).asSubclass(ix0.class);
                        clsAsSubclass.getClass();
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                objNewInstance.getClass();
                                if (!(nx0Var instanceof wc1)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + nx0Var).toString());
                                }
                                vc1 viewModelStore = ((wc1) nx0Var).getViewModelStore();
                                kx0 savedStateRegistry = nx0Var.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.f6661a;
                                for (String str2 : new HashSet(linkedHashMap.keySet())) {
                                    str2.getClass();
                                    qc1 qc1Var = (qc1) linkedHashMap.get(str2);
                                    if (qc1Var != null) {
                                        g60.m1207f(qc1Var, savedStateRegistry, nx0Var.getLifecycle());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.m1963d();
                                }
                            } catch (Exception e) {
                                C0921xc.m5128i("Failed to instantiate ", str, e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException("Class " + str + " wasn't found", e3);
                    }
                }
                return;
            case 1:
                MainActivity mainActivity = (MainActivity) obj;
                AbstractActivityC0246gh.access$ensureViewModelStore(mainActivity);
                mainActivity.getLifecycle().mo4015b(this);
                return;
            case 2:
                new HashMap();
                InterfaceC0371jx[] interfaceC0371jxArr = (InterfaceC0371jx[]) obj;
                if (interfaceC0371jxArr.length > 0) {
                    InterfaceC0371jx interfaceC0371jx = interfaceC0371jxArr[0];
                    throw null;
                }
                if (interfaceC0371jxArr.length <= 0) {
                    return;
                }
                InterfaceC0371jx interfaceC0371jx2 = interfaceC0371jxArr[0];
                throw null;
            default:
                if (q90Var != q90.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + q90Var).toString());
                }
                x90Var.getLifecycle().mo4015b(this);
                ((gx0) obj).m1265b();
                return;
        }
    }
}
