package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.C0038;
import androidx.lifecycle.SavedStateHandleController;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import yyds.AbstractC2104;
import yyds.C0188;
import yyds.C0328;
import yyds.C0419;
import yyds.C1029;
import yyds.C1173;
import yyds.C1693;
import yyds.C2225;
import yyds.EnumC0637;
import yyds.InterfaceC0458;
import yyds.InterfaceC0538;
import yyds.InterfaceC0657;
import yyds.InterfaceC2164;
import yyds.InterfaceC2345;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class Recreator implements InterfaceC0657 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final InterfaceC2164 f371;

    public Recreator(InterfaceC2164 interfaceC2164) {
        this.f371 = interfaceC2164;
    }

    @Override // yyds.InterfaceC0657
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo20(InterfaceC2345 interfaceC2345, EnumC0637 enumC0637) {
        Object obj;
        boolean z;
        if (enumC0637 != EnumC0637.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC2345.mo14().m126(this);
        Bundle bundleM998 = this.f371.mo16().m998("androidx.savedstate.Restarter");
        if (bundleM998 == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleM998.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            C0188.m800("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            return;
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(InterfaceC0458.class);
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        InterfaceC2164 interfaceC2164 = this.f371;
                        if (!(interfaceC2164 instanceof InterfaceC0538)) {
                            C0188.m800("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                            return;
                        }
                        C2225 c2225Mo19 = ((InterfaceC0538) interfaceC2164).mo19();
                        C0328 c0328Mo16 = interfaceC2164.mo16();
                        c2225Mo19.getClass();
                        Iterator it = new HashSet(c2225Mo19.f10988.keySet()).iterator();
                        while (it.hasNext()) {
                            C0419 c0419 = (C0419) c2225Mo19.f10988.get((String) it.next());
                            C0038 c0038Mo14 = interfaceC2164.mo14();
                            synchronized (c0419.f2155) {
                                obj = c0419.f2155.get("androidx.lifecycle.savedstate.vm.tag");
                            }
                            SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                            if (savedStateHandleController != null && !(z = savedStateHandleController.f310)) {
                                if (z) {
                                    C0188.m800("Already attached to lifecycleOwner");
                                    return;
                                } else {
                                    savedStateHandleController.f310 = true;
                                    c0038Mo14.m122(savedStateHandleController);
                                    throw null;
                                }
                            }
                        }
                        if (!new HashSet(c2225Mo19.f10988.keySet()).isEmpty()) {
                            if (!c0328Mo16.f1717) {
                                C0188.m800("Can not perform this action after onSaveInstanceState");
                                return;
                            }
                            C1173 c1173 = (C1173) c0328Mo16.f1719;
                            if (c1173 == null) {
                                c1173 = new C1173(c0328Mo16);
                            }
                            c0328Mo16.f1719 = c1173;
                            try {
                                C1029.class.getDeclaredConstructor(null);
                                C1173 c11732 = (C1173) c0328Mo16.f1719;
                                if (c11732 != null) {
                                    c11732.f5381.add(C1029.class.getName());
                                }
                            } catch (NoSuchMethodException e) {
                                throw new IllegalArgumentException("Class " + C1029.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
                            }
                        }
                    } catch (Exception e2) {
                        throw new RuntimeException("Failed to instantiate " + str, e2);
                    }
                } catch (NoSuchMethodException e3) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
                }
            } catch (ClassNotFoundException e4) {
                C1693.m3442(AbstractC2104.m4014("Class ", str, " wasn't found"), e4);
                return;
            }
        }
    }
}
