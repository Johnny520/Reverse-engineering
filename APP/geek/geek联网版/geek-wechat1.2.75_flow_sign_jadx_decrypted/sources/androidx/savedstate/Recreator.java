package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.C0036a;
import androidx.lifecycle.SavedStateHandleController;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import p000.AbstractC0493mp;
import p000.C0004a3;
import p000.C0383jq;
import p000.C0692s2;
import p000.EnumC0494mq;
import p000.InterfaceC0642qq;
import p000.InterfaceC0716sq;
import p000.b20;
import p000.g40;
import p000.ua0;
import p000.wa0;
import p000.xa0;
import p000.z10;

/* JADX INFO: loaded from: classes.dex */
public final class Recreator implements InterfaceC0642qq {

    /* JADX INFO: renamed from: a */
    public final b20 f612a;

    public Recreator(b20 b20Var) {
        this.f612a = b20Var;
    }

    @Override // p000.InterfaceC0642qq
    /* JADX INFO: renamed from: b */
    public final void mo109b(InterfaceC0716sq interfaceC0716sq, EnumC0494mq enumC0494mq) {
        Object obj;
        boolean z;
        if (enumC0494mq != EnumC0494mq.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC0716sq.mo105e().m264f(this);
        Bundle bundleM20c = this.f612a.mo103b().m20c("androidx.savedstate.Restarter");
        if (bundleM20c == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleM20c.getStringArrayList("classes_to_restore");
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
                Class<? extends U> clsAsSubclass = Class.forName(str2, false, Recreator.class.getClassLoader()).asSubclass(z10.class);
                AbstractC0493mp.m1856f("{\n                Class.…class.java)\n            }", clsAsSubclass);
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        AbstractC0493mp.m1856f("{\n                constr…wInstance()\n            }", objNewInstance);
                        b20 b20Var = this.f612a;
                        if (!(b20Var instanceof xa0)) {
                            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                        }
                        wa0 wa0VarMo104d = ((xa0) b20Var).mo104d();
                        C0004a3 c0004a3Mo103b = b20Var.mo103b();
                        wa0VarMo104d.getClass();
                        for (String str3 : new HashSet(wa0VarMo104d.f5077a.keySet())) {
                            AbstractC0493mp.m1857g("key", str3);
                            ua0 ua0Var = (ua0) wa0VarMo104d.f5077a.get(str3);
                            AbstractC0493mp.m1854d(ua0Var);
                            C0036a c0036aMo105e = b20Var.mo105e();
                            AbstractC0493mp.m1857g("registry", c0004a3Mo103b);
                            AbstractC0493mp.m1857g("lifecycle", c0036aMo105e);
                            HashMap map = ua0Var.f4673a;
                            if (map == null) {
                                obj = null;
                            } else {
                                synchronized (map) {
                                    obj = ua0Var.f4673a.get("androidx.lifecycle.savedstate.vm.tag");
                                }
                            }
                            SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                            if (savedStateHandleController != null && !(z = savedStateHandleController.f478a)) {
                                if (z) {
                                    throw new IllegalStateException("Already attached to lifecycleOwner");
                                }
                                savedStateHandleController.f478a = true;
                                c0036aMo105e.m259a(savedStateHandleController);
                                throw null;
                            }
                        }
                        if (!new HashSet(wa0VarMo104d.f5077a.keySet()).isEmpty()) {
                            if (!c0004a3Mo103b.f17e) {
                                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                            }
                            C0692s2 c0692s2 = (C0692s2) c0004a3Mo103b.f14b;
                            if (c0692s2 == null) {
                                c0692s2 = new C0692s2(c0004a3Mo103b);
                            }
                            c0004a3Mo103b.f14b = c0692s2;
                            try {
                                C0383jq.class.getDeclaredConstructor(null);
                                C0692s2 c0692s22 = (C0692s2) c0004a3Mo103b.f14b;
                                if (c0692s22 != null) {
                                    ((LinkedHashSet) c0692s22.f4192b).add(C0383jq.class.getName());
                                }
                            } catch (NoSuchMethodException e) {
                                throw new IllegalArgumentException("Class " + C0383jq.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
                            }
                        }
                    } catch (Exception e2) {
                        throw new RuntimeException(g40.m1155r("Failed to instantiate ", str2), e2);
                    }
                } catch (NoSuchMethodException e3) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
                }
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException(g40.m1147j("Class ", str2, " wasn't found"), e4);
            }
        }
    }
}
