package p000;

import android.os.Bundle;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: cv */
/* JADX INFO: loaded from: classes.dex */
public final class C1297cv implements InterfaceC0889Un {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4733a;

    /* JADX INFO: renamed from: b */
    public final Object f4734b;

    public /* synthetic */ C1297cv(int i, Object obj) {
        this.f4733a = i;
        this.f4734b = obj;
    }

    @Override // p000.InterfaceC0889Un
    public final void onStateChanged(InterfaceC1061Yn interfaceC1061Yn, EnumC0632On enumC0632On) {
        View view;
        switch (this.f4733a) {
            case 0:
                InterfaceC2075ix interfaceC2075ix = (InterfaceC2075ix) this.f4734b;
                if (enumC0632On != EnumC0632On.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC1061Yn.getLifecycle().mo1556b(this);
                Bundle bundleM2896a = interfaceC2075ix.getSavedStateRegistry().m2896a("androidx.savedstate.Restarter");
                if (bundleM2896a == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleM2896a.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, C1297cv.class.getClassLoader()).asSubclass(InterfaceC1430fx.class);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                if (!(interfaceC2075ix instanceof InterfaceC2752yE)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                C2709xE viewModelStore = ((InterfaceC2752yE) interfaceC2075ix).getViewModelStore();
                                C1518hx savedStateRegistry = interfaceC2075ix.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.f9284a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    AbstractC0585Nj.m1135b((AbstractC2580uE) linkedHashMap.get((String) it.next()), savedStateRegistry, interfaceC2075ix.getLifecycle());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.m2899d();
                                }
                            } catch (Exception e) {
                                throw new RuntimeException(AbstractC0213Ey.m420r("Failed to instantiate ", str), e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(AbstractC2374ph.m4814k("Class ", str, " wasn't found"), e3);
                    }
                }
                return;
            case 1:
                AbstractActivityC2148ki abstractActivityC2148ki = (AbstractActivityC2148ki) this.f4734b;
                AbstractActivityC0833Ta.access$ensureViewModelStore(abstractActivityC2148ki);
                abstractActivityC2148ki.getLifecycle().mo1556b(this);
                return;
            case 2:
                new HashMap();
                InterfaceC2462rj[] interfaceC2462rjArr = (InterfaceC2462rj[]) this.f4734b;
                if (interfaceC2462rjArr.length > 0) {
                    InterfaceC2462rj interfaceC2462rj = interfaceC2462rjArr[0];
                    throw null;
                }
                if (interfaceC2462rjArr.length <= 0) {
                    return;
                }
                InterfaceC2462rj interfaceC2462rj2 = interfaceC2462rjArr[0];
                throw null;
            case 3:
                if (enumC0632On != EnumC0632On.ON_STOP || (view = ((AbstractComponentCallbacksC1503hi) this.f4734b).f5296E) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            default:
                if (enumC0632On != EnumC0632On.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0632On).toString());
                }
                interfaceC1061Yn.getLifecycle().mo1556b(this);
                ((C1342dx) this.f4734b).m2598a();
                return;
        }
    }
}
