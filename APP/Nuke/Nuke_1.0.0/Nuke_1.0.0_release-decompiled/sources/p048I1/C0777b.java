package p048I1;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import me.dartcv.nuke.BuildConfig;
import p002A1.AbstractC0116E;
import p002A1.AbstractC0122K;
import p002A1.C0118G;
import p002A1.C0126O;
import p002A1.EnumC0140m;
import p002A1.InterfaceC0127P;
import p002A1.InterfaceC0135h;
import p002A1.InterfaceC0143p;
import p002A1.InterfaceC0145r;
import p010B3.AbstractActivityC0224c;
import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;
import p135b.AbstractActivityC1823k;

/* JADX INFO: renamed from: I1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0777b implements InterfaceC0143p {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2520d;

    /* JADX INFO: renamed from: e */
    public final Object f2521e;

    public /* synthetic */ C0777b(int i5, Object obj) {
        this.f2520d = i5;
        this.f2521e = obj;
    }

    @Override // p002A1.InterfaceC0143p
    /* JADX INFO: renamed from: d */
    public final void mo147d(InterfaceC0145r interfaceC0145r, EnumC0140m enumC0140m) {
        switch (this.f2520d) {
            case 0:
                InterfaceC0782g interfaceC0782g = (InterfaceC0782g) this.f2521e;
                if (enumC0140m != EnumC0140m.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC0145r.getLifecycle().mo185b(this);
                Bundle bundleM1325a = interfaceC0782g.getSavedStateRegistry().m1325a("androidx.savedstate.Restarter");
                if (bundleM1325a == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleM1325a.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, C0777b.class.getClassLoader()).asSubclass(InterfaceC0778c.class);
                        AbstractC1665j.m2982b(clsAsSubclass);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                AbstractC1665j.m2982b(objNewInstance);
                                if (!(interfaceC0782g instanceof InterfaceC0127P)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + interfaceC0782g).toString());
                                }
                                C0126O viewModelStore = ((InterfaceC0127P) interfaceC0782g).getViewModelStore();
                                C0780e savedStateRegistry = interfaceC0782g.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.f518a;
                                for (String str2 : new HashSet(linkedHashMap.keySet())) {
                                    AbstractC1665j.m2985e(str2, "key");
                                    AbstractC0122K abstractC0122K = (AbstractC0122K) linkedHashMap.get(str2);
                                    if (abstractC0122K != null) {
                                        AbstractC0116E.m159a(abstractC0122K, savedStateRegistry, interfaceC0782g.getLifecycle());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.m1328d();
                                }
                            } catch (Exception e5) {
                                throw new RuntimeException("Failed to instantiate " + str, e5);
                            }
                        } catch (NoSuchMethodException e6) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e6);
                        }
                    } catch (ClassNotFoundException e7) {
                        throw new RuntimeException(AbstractC0231b.m400k("Class ", str, " wasn't found"), e7);
                    }
                }
                return;
            case BuildConfig.VERSION_CODE /* 1 */:
                new HashMap();
                InterfaceC0135h[] interfaceC0135hArr = (InterfaceC0135h[]) this.f2521e;
                if (interfaceC0135hArr.length > 0) {
                    InterfaceC0135h interfaceC0135h = interfaceC0135hArr[0];
                    throw null;
                }
                if (interfaceC0135hArr.length <= 0) {
                    return;
                }
                InterfaceC0135h interfaceC0135h2 = interfaceC0135hArr[0];
                throw null;
            case 2:
                if (enumC0140m != EnumC0140m.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0140m).toString());
                }
                interfaceC0145r.getLifecycle().mo185b(this);
                ((C0118G) this.f2521e).m167b();
                return;
            default:
                AbstractActivityC0224c abstractActivityC0224c = (AbstractActivityC0224c) this.f2521e;
                AbstractActivityC1823k.access$ensureViewModelStore(abstractActivityC0224c);
                abstractActivityC0224c.getLifecycle().mo185b(this);
                return;
        }
    }
}
