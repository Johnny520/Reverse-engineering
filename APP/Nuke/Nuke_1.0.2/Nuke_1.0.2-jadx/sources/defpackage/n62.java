package defpackage;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n62 implements fa1 {
    public final /* synthetic */ int h;
    public final Object i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ n62(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fa1
    public final void g(ia1 ia1Var, z91 z91Var) {
        int i = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                tc2 tc2Var = (tc2) obj;
                if (z91Var != z91.ON_CREATE) {
                    s.i("Next event must be ON_CREATE");
                    return;
                }
                ia1Var.getLifecycle().b(this);
                Bundle bundleA = tc2Var.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (bundleA == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    s.l("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
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
                                    c80.y("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ", tc2Var);
                                    return;
                                }
                                kb3 viewModelStore = ((lb3) tc2Var).getViewModelStore();
                                qc2 savedStateRegistry = tc2Var.getSavedStateRegistry();
                                LinkedHashMap linkedHashMap = viewModelStore.a;
                                LinkedHashMap linkedHashMap2 = viewModelStore.a;
                                Iterator it = du.K0(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    fb3 fb3Var = (fb3) linkedHashMap2.get(it.next());
                                    if (fb3Var != null) {
                                        rp0.T(fb3Var, savedStateRegistry, tc2Var.getLifecycle());
                                    }
                                }
                                if (!du.K0(linkedHashMap2.keySet()).isEmpty()) {
                                    savedStateRegistry.d();
                                }
                            } catch (Exception e) {
                                throw new RuntimeException(vi0.i("Failed to instantiate ", str), e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(vi0.j("Class ", str, " wasn't found"), e3);
                    }
                }
                return;
            case 1:
                dw dwVar = (dw) obj;
                dw.access$ensureViewModelStore(dwVar);
                dwVar.getLifecycle().b(this);
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
                    c80.y("Next event must be ON_CREATE, it was ", z91Var);
                    return;
                } else {
                    ia1Var.getLifecycle().b(this);
                    ((mc2) obj).b();
                    return;
                }
        }
    }
}
