package p000;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n62 implements fa1 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f7024h;

    /* JADX INFO: renamed from: i */
    public final Object f7025i;

    public /* synthetic */ n62(int i, Object obj) {
        this.f7024h = i;
        this.f7025i = obj;
    }

    @Override // p000.fa1
    /* JADX INFO: renamed from: g */
    public final void mo533g(ia1 ia1Var, z91 z91Var) {
        int i = this.f7024h;
        Object obj = this.f7025i;
        switch (i) {
            case 0:
                tc2 tc2Var = (tc2) obj;
                if (z91Var != z91.ON_CREATE) {
                    C0676s.m4650i("Next event must be ON_CREATE");
                    return;
                }
                ia1Var.getLifecycle().mo506b(this);
                Bundle bundleM4133a = tc2Var.getSavedStateRegistry().m4133a("androidx.savedstate.Restarter");
                if (bundleM4133a == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleM4133a.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    C0676s.m4653l("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, n62.class.getClassLoader()).asSubclass(oc2.class);
                        clsAsSubclass.getClass();
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                objNewInstance.getClass();
                                if (!(tc2Var instanceof lb3)) {
                                    c80.m681y("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ", tc2Var);
                                    return;
                                }
                                kb3 viewModelStore = ((lb3) tc2Var).getViewModelStore();
                                qc2 savedStateRegistry = tc2Var.getSavedStateRegistry();
                                LinkedHashMap linkedHashMap = viewModelStore.f5447a;
                                LinkedHashMap linkedHashMap2 = viewModelStore.f5447a;
                                Iterator it = AbstractC0142du.m1153K0(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    fb3 fb3Var = (fb3) linkedHashMap2.get(it.next());
                                    if (fb3Var != null) {
                                        rp0.m4534T(fb3Var, savedStateRegistry, tc2Var.getLifecycle());
                                    }
                                }
                                if (!AbstractC0142du.m1153K0(linkedHashMap2.keySet()).isEmpty()) {
                                    savedStateRegistry.m4136d();
                                }
                            } catch (Exception e) {
                                throw new RuntimeException(vi0.m5690i("Failed to instantiate ", str), e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(vi0.m5691j("Class ", str, " wasn't found"), e3);
                    }
                }
                return;
            case 1:
                AbstractActivityC0144dw abstractActivityC0144dw = (AbstractActivityC0144dw) obj;
                AbstractActivityC0144dw.access$ensureViewModelStore(abstractActivityC0144dw);
                abstractActivityC0144dw.getLifecycle().mo506b(this);
                return;
            case 2:
                new HashMap();
                mo0[] mo0VarArr = (mo0[]) obj;
                if (mo0VarArr.length > 0) {
                    mo0 mo0Var = mo0VarArr[0];
                    throw null;
                }
                if (mo0VarArr.length <= 0) {
                    return;
                }
                mo0 mo0Var2 = mo0VarArr[0];
                throw null;
            default:
                if (z91Var != z91.ON_CREATE) {
                    c80.m681y("Next event must be ON_CREATE, it was ", z91Var);
                    return;
                } else {
                    ia1Var.getLifecycle().mo506b(this);
                    ((mc2) obj).m3058b();
                    return;
                }
        }
    }
}
