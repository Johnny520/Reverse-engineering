package androidx.savedstate;

import Yue.C5499;
import Yue.C6411;
import Yue.InterfaceC6399;
import Yue.InterfaceC7235;
import android.os.Bundle;
import android.view.Lifecycle;
import android.view.LifecycleEventObserver;
import android.view.LifecycleOwner;
import androidx.savedstate.C1794;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0002\u000f\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/LifecycleEventObserver;", "LYue/ۥۡۧۤۢ;", "owner", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(LYue/ۥۡۧۤۢ;)V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", C6411.f16276, "LYue/ۥۣۢ۠ۤ;", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "", "className", "ۥ", "(Ljava/lang/String;)V", "ۥۣ۟۟۠", "LYue/ۥۡۧۤۢ;", "ۥ۟۟۠ۤ", "ۥ۟", "savedstate_release"}, k = 1, mv = {1, 8, 0})
public final class Recreator implements LifecycleEventObserver {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f30373 = "classes_to_restore";

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f30374 = "androidx.savedstate.Restarter";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters and from kotlin metadata */
    @InterfaceC6399
    public final InterfaceC7235 owner;

    /* JADX INFO: renamed from: androidx.savedstate.Recreator$ۥ۟ */
    public static final class C1793 implements C1794.InterfaceC9000 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public final Set<String> f4001;

        public C1793(@InterfaceC6399 C1794 c1794) {
            C5499.m17103(c1794, "registry");
            this.f4001 = new LinkedHashSet();
            c1794.m30806(Recreator.f30374, this);
        }

        @Override // androidx.savedstate.C1794.InterfaceC9000
        @InterfaceC6399
        public Bundle saveState() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(Recreator.f30373, new ArrayList<>(this.f4001));
            return bundle;
        }

        /* JADX INFO: renamed from: ۥ */
        public final void m5020(@InterfaceC6399 String str) {
            C5499.m17103(str, "className");
            this.f4001.add(str);
        }
    }

    public Recreator(@InterfaceC6399 InterfaceC7235 interfaceC7235) {
        C5499.m17103(interfaceC7235, "owner");
        this.owner = interfaceC7235;
    }

    @Override // android.view.LifecycleEventObserver
    public void onStateChanged(@InterfaceC6399 LifecycleOwner source, @InterfaceC6399 Lifecycle.Event event) {
        C5499.m17103(source, "source");
        C5499.m17103(event, C6411.f16276);
        if (event != Lifecycle.Event.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().removeObserver(this);
        Bundle bundleM5022 = this.owner.getSavedStateRegistry().m5022(f30374);
        if (bundleM5022 == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleM5022.getStringArrayList(f30373);
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            m5019(it.next());
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m5019(String className) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(className, false, Recreator.class.getClassLoader()).asSubclass(C1794.InterfaceC8998.class);
            C5499.m17102(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    C5499.m17102(objNewInstance, "{\n                constr…wInstance()\n            }");
                    ((C1794.InterfaceC8998) objNewInstance).onRecreated(this.owner);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + className, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + className + " wasn't found", e3);
        }
    }
}
