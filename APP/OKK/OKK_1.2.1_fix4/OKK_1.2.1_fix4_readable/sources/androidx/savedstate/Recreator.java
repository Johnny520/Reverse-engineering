package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0517F;
import androidx.lifecycle.EnumC0535l;
import androidx.lifecycle.InterfaceC0522K;
import androidx.lifecycle.InterfaceC0539p;
import androidx.lifecycle.InterfaceC0541r;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;
import p039V.InterfaceC0394c;
import p039V.InterfaceC0397f;

/* JADX INFO: loaded from: classes.dex */
public final class Recreator implements InterfaceC0539p {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0397f f1614a;

    public Recreator(InterfaceC0397f interfaceC0397f) {
        AbstractC0307g.m703e(interfaceC0397f, "owner");
        this.f1614a = interfaceC0397f;
    }

    @Override // androidx.lifecycle.InterfaceC0539p
    /* JADX INFO: renamed from: b */
    public final void mo981b(InterfaceC0541r interfaceC0541r, EnumC0535l enumC0535l) {
        if (enumC0535l != EnumC0535l.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC0541r.mo1231d().m1258e(this);
        Bundle bundleM982a = this.f1614a.mo985b().m982a("androidx.savedstate.Restarter");
        if (bundleM982a == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleM982a.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        if (it.hasNext()) {
            String next = it.next();
            try {
                Class<? extends U> clsAsSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(InterfaceC0394c.class);
                AbstractC0307g.m702d(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        AbstractC0307g.m702d(objNewInstance, "{\n                constr…wInstance()\n            }");
                        InterfaceC0397f interfaceC0397f = this.f1614a;
                        AbstractC0307g.m703e(interfaceC0397f, "owner");
                        if (!(interfaceC0397f instanceof InterfaceC0522K)) {
                            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
                        }
                        AbstractC0517F abstractC0517FMo1230c = ((InterfaceC0522K) interfaceC0397f).mo1230c();
                        interfaceC0397f.mo985b();
                        abstractC0517FMo1230c.getClass();
                        abstractC0517FMo1230c.getClass();
                        throw null;
                    } catch (Exception e2) {
                        throw new RuntimeException(AbstractC0324d.m725h("Failed to instantiate ", next), e2);
                    }
                } catch (NoSuchMethodException e3) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
                }
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException(AbstractC0324d.m723f("Class ", next, " wasn't found"), e4);
            }
        }
    }
}
