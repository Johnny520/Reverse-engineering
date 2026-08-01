package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0455G;
import androidx.lifecycle.AbstractC0460L;
import androidx.lifecycle.C0464P;
import androidx.lifecycle.EnumC0478m;
import androidx.lifecycle.InterfaceC0465Q;
import androidx.lifecycle.InterfaceC0482q;
import androidx.lifecycle.InterfaceC0484s;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import p022L.AbstractC0174d;
import p024M.C0190d;
import p024M.InterfaceC0188b;
import p024M.InterfaceC0192f;
import p027N0.AbstractC0223g;

/* JADX INFO: loaded from: classes.dex */
public final class Recreator implements InterfaceC0482q {

    /* JADX INFO: renamed from: a */
    public final Object f1543a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Recreator(InterfaceC0192f interfaceC0192f) {
        this.f1543a = interfaceC0192f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r6v3, types: [M.f, androidx.lifecycle.s, java.lang.Object] */
    @Override // androidx.lifecycle.InterfaceC0482q
    /* JADX INFO: renamed from: c */
    public final void mo391c(InterfaceC0484s interfaceC0484s, EnumC0478m enumC0478m) {
        if (enumC0478m != EnumC0478m.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC0484s.mo636c().m932f(this);
        ?? r6 = this.f1543a;
        Bundle bundleM395c = r6.mo405b().m395c("androidx.savedstate.Restarter");
        if (bundleM395c == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleM395c.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(InterfaceC0188b.class);
                AbstractC0223g.m417d(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        AbstractC0223g.m417d(objNewInstance, "{\n                constr…wInstance()\n            }");
                        C0464P viewModelStore = ((InterfaceC0465Q) r6).getViewModelStore();
                        C0190d c0190dMo405b = r6.mo405b();
                        viewModelStore.getClass();
                        LinkedHashMap linkedHashMap = viewModelStore.f1501a;
                        for (String str2 : new HashSet(linkedHashMap.keySet())) {
                            AbstractC0223g.m418e(str2, "key");
                            AbstractC0460L abstractC0460L = (AbstractC0460L) linkedHashMap.get(str2);
                            AbstractC0223g.m415b(abstractC0460L);
                            AbstractC0455G.m909a(abstractC0460L, c0190dMo405b, r6.mo636c());
                        }
                        if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                            c0190dMo405b.m399g();
                        }
                    } catch (Exception e2) {
                        throw new RuntimeException(AbstractC0174d.m352h("Failed to instantiate ", str), e2);
                    }
                } catch (NoSuchMethodException e3) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
                }
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException(AbstractC0174d.m353i("Class ", str, " wasn't found"), e4);
            }
        }
    }
}
