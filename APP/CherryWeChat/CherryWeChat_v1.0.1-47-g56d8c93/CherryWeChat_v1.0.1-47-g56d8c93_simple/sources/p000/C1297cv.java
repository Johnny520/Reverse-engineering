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

    public /* synthetic */ C1297cv(int r1, Object r2) {
        this.f4733a = r1;
        this.f4734b = r2;
    }

    @Override // p000.InterfaceC0889Un
    public final void onStateChanged(InterfaceC1061Yn r6, EnumC0632On r7) {
        switch(this.f4733a) {
            case 0: goto L27;
            case 1: goto L25;
            case 2: goto L16;
            case 3: goto L11;
            default: goto L5;
        };
    L16:
        new HashMap();
        InterfaceC2462rj[] r62 = (InterfaceC2462rj[]) this.f4734b;
        if (r62.length <= 0) goto L19;
        InterfaceC2462rj r63 = r62[0];
        throw null;
    L19:
        if (r62.length > 0) goto L21;
        return;
    L21:
        InterfaceC2462rj r64 = r62[0];
        throw null;
    L25:
        AbstractActivityC2148ki r65 = (AbstractActivityC2148ki) this.f4734b;
        AbstractActivityC0833Ta.access$ensureViewModelStore(r65);
        r65.getLifecycle().mo1556b(this);
        return;
    L27:
        InterfaceC2075ix r0 = (InterfaceC2075ix) this.f4734b;
        if (r7 != EnumC0632On.ON_CREATE) goto L67;
        r6.getLifecycle().mo1556b(this);
        Bundle r66 = r0.getSavedStateRegistry().m2896a("androidx.savedstate.Restarter");
        if (r66 == null) goto L63;
        ArrayList<String> r67 = r66.getStringArrayList("classes_to_restore");
        if (r67 == null) goto L65;
        Iterator<String> r68 = r67.iterator();
    L36:
        if (r68.hasNext() == false) goto L83;
        String r72 = r68.next();
        Class<? extends U> r2 = Class.forName(r72, false, C1297cv.class.getClassLoader()).asSubclass(InterfaceC1430fx.class);     // Catch: ClassNotFoundException -> L60
        Constructor r1 = r2.getDeclaredConstructor(null);     // Catch: NoSuchMethodException -> L57
        r1.setAccessible(true);
        InterfaceC1430fx r12 = (InterfaceC1430fx) r1.newInstance(null);     // Catch: Exception -> L54
        if ((r0 instanceof InterfaceC2752yE) == false) goto L53;
        C2709xE r73 = ((InterfaceC2752yE) r0).getViewModelStore();
        C1518hx r13 = r0.getSavedStateRegistry();
        r73.getClass();
        LinkedHashMap r74 = r73.f9284a;
        Iterator r22 = new HashSet(r74.keySet()).iterator();
    L47:
        if (r22.hasNext() == false) goto L50;
        AbstractC0585Nj.m1135b((AbstractC2580uE) r74.get((String) r22.next()), r13, r0.getLifecycle());
        goto L47
    L50:
        if (new HashSet(r74.keySet()).isEmpty() == true) goto L36;
        r13.m2899d();
        goto L36
    L53:
        throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
    L54:
        e = move-exception;
        throw new RuntimeException(AbstractC0213Ey.m420r("Failed to instantiate ", r72), e);
    L57:
        e = move-exception;
        throw new IllegalStateException("Class " + r2.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
    L60:
        e = move-exception;
        throw new RuntimeException(AbstractC2374ph.m4814k("Class ", r72, " wasn't found"), e);
    L83:
        return;
    L65:
        throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
    L63:
        return;
    L67:
        throw new AssertionError("Next event must be ON_CREATE");
    L5:
        if (r7 != EnumC0632On.ON_CREATE) goto L9;
        r6.getLifecycle().mo1556b(this);
        ((C1342dx) this.f4734b).m2598a();
        return;
    L9:
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + r7).toString());
    L11:
        if (r7 != EnumC0632On.ON_STOP) goto L81;
        View r69 = ((AbstractComponentCallbacksC1503hi) this.f4734b).f5296E;
        if (r69 == null) goto L82;
        r69.cancelPendingInputEvents();
        return;
    L82:
        return;
    }
}
