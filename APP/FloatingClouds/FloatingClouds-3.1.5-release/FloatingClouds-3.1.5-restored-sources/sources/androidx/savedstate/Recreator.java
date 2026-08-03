package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1116e;
import androidx.lifecycle.InterfaceC1118g;
import androidx.savedstate.C1224a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import p000a.C0631i9;
import p000a.C0944z;
import p000a.InterfaceC0214Ld;
import p000a.InterfaceC0935y9;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m3302d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m3303d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/g;", "a", "savedstate_release"}, m3304k = 1, m3305mv = {1, 8, 0}, m3307xi = 48)
public final class Recreator implements InterfaceC1118g {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0214Ld f5204a;

    /* JADX INFO: renamed from: androidx.savedstate.Recreator$a */
    public static final class C1223a implements C1224a.b {

        /* JADX INFO: renamed from: a */
        public final LinkedHashSet f5205a;

        public C1223a(C1224a c1224a) {
            C0631i9.m1482e(c1224a, "registry");
            this.f5205a = new LinkedHashSet();
            c1224a.m3009c("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.C1224a.b
        /* JADX INFO: renamed from: a */
        public final Bundle mo57a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f5205a));
            return bundle;
        }
    }

    public Recreator(InterfaceC0214Ld interfaceC0214Ld) {
        this.f5204a = interfaceC0214Ld;
    }

    @Override // androidx.lifecycle.InterfaceC1118g
    /* JADX INFO: renamed from: a */
    public final void mo485a(InterfaceC0935y9 interfaceC0935y9, AbstractC1116e.a aVar) {
        if (aVar != AbstractC1116e.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC0935y9.getLifecycle().mo2594c(this);
        InterfaceC0214Ld interfaceC0214Ld = this.f5204a;
        Bundle bundleM3007a = interfaceC0214Ld.getSavedStateRegistry().m3007a("androidx.savedstate.Restarter");
        if (bundleM3007a == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleM3007a.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(C1224a.a.class);
                C0631i9.m1481d(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        C0631i9.m1481d(objNewInstance, "{\n                constr…wInstance()\n            }");
                        ((C1224a.a) objNewInstance).mo2591a(interfaceC0214Ld);
                    } catch (Exception e) {
                        throw new RuntimeException(C0944z.m2231k("Failed to instantiate ", str), e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(C0944z.m2227g("Class ", str, " wasn't found"), e3);
            }
        }
    }
}
