package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.C0036a;
import androidx.lifecycle.SavedStateHandleController;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import p000.AbstractC0346ip;
import p000.C0004a3;
import p000.C0233fq;
import p000.C0693s2;
import p000.EnumC0347iq;
import p000.InterfaceC0494mq;
import p000.InterfaceC0568oq;
import p000.pa0;
import p000.ra0;
import p000.s10;
import p000.sa0;
import p000.u10;
import p000.z30;

/* JADX INFO: loaded from: classes.dex */
public final class Recreator implements InterfaceC0494mq {

    /* JADX INFO: renamed from: a */
    public final u10 f649a;

    public Recreator(u10 u10Var) {
        this.f649a = u10Var;
    }

    @Override // p000.InterfaceC0494mq
    /* JADX INFO: renamed from: b */
    public final void mo124b(InterfaceC0568oq interfaceC0568oq, EnumC0347iq enumC0347iq) {
        Object obj;
        boolean z;
        if (enumC0347iq != EnumC0347iq.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC0568oq.mo120e().m279f(this);
        Bundle bundleM7c = this.f649a.mo118b().m7c("androidx.savedstate.Restarter");
        if (bundleM7c == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleM7c.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        int size = stringArrayList.size();
        int i = 0;
        while (i < size) {
            String str = stringArrayList.get(i);
            i++;
            String str2 = str;
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str2, false, Recreator.class.getClassLoader()).asSubclass(s10.class);
                AbstractC0346ip.m1502n("{\n                Class.…class.java)\n            }", clsAsSubclass);
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        AbstractC0346ip.m1502n("{\n                constr…wInstance()\n            }", objNewInstance);
                        u10 u10Var = this.f649a;
                        if (!(u10Var instanceof sa0)) {
                            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                        }
                        ra0 ra0VarMo119d = ((sa0) u10Var).mo119d();
                        C0004a3 c0004a3Mo118b = u10Var.mo118b();
                        ra0VarMo119d.getClass();
                        for (String str3 : new HashSet(ra0VarMo119d.f4257a.keySet())) {
                            AbstractC0346ip.m1503o("key", str3);
                            pa0 pa0Var = (pa0) ra0VarMo119d.f4257a.get(str3);
                            AbstractC0346ip.m1500l(pa0Var);
                            C0036a c0036aMo120e = u10Var.mo120e();
                            AbstractC0346ip.m1503o("registry", c0004a3Mo118b);
                            AbstractC0346ip.m1503o("lifecycle", c0036aMo120e);
                            HashMap map = pa0Var.f3689a;
                            if (map == null) {
                                obj = null;
                            } else {
                                synchronized (map) {
                                    obj = pa0Var.f3689a.get("androidx.lifecycle.savedstate.vm.tag");
                                }
                            }
                            SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                            if (savedStateHandleController != null && !(z = savedStateHandleController.f515a)) {
                                if (z) {
                                    throw new IllegalStateException("Already attached to lifecycleOwner");
                                }
                                savedStateHandleController.f515a = true;
                                c0036aMo120e.m274a(savedStateHandleController);
                                throw null;
                            }
                        }
                        if (!new HashSet(ra0VarMo119d.f4257a.keySet()).isEmpty()) {
                            if (!c0004a3Mo118b.f20e) {
                                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                            }
                            C0693s2 c0693s2 = (C0693s2) c0004a3Mo118b.f17b;
                            if (c0693s2 == null) {
                                c0693s2 = new C0693s2(c0004a3Mo118b);
                            }
                            c0004a3Mo118b.f17b = c0693s2;
                            try {
                                C0233fq.class.getDeclaredConstructor(null);
                                C0693s2 c0693s22 = (C0693s2) c0004a3Mo118b.f17b;
                                if (c0693s22 != null) {
                                    ((LinkedHashSet) c0693s22.f4377b).add(C0233fq.class.getName());
                                }
                            } catch (NoSuchMethodException e) {
                                throw new IllegalArgumentException("Class " + C0233fq.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
                            }
                        }
                    } catch (Exception e2) {
                        throw new RuntimeException("Failed to instantiate " + str2, e2);
                    }
                } catch (NoSuchMethodException e3) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
                }
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException(z30.m2765j("Class ", str2, " wasn't found"), e4);
            }
        }
    }
}
