package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import androidx.lifecycle.a;
import defpackage.a3;
import defpackage.fq;
import defpackage.ip;
import defpackage.iq;
import defpackage.mq;
import defpackage.oq;
import defpackage.pa0;
import defpackage.ra0;
import defpackage.s10;
import defpackage.s2;
import defpackage.sa0;
import defpackage.u10;
import defpackage.z30;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class Recreator implements mq {
    public final u10 a;

    public Recreator(u10 r1) {
        this.a = r1;
    }

    @Override // defpackage.mq
    public final void b(oq r13, iq r14) {
        if (r14 != iq.ON_CREATE) goto L72;
        r13.e().f(this);
        Bundle r132 = this.a.b().c("androidx.savedstate.Restarter");
        if (r132 == null) goto L68;
        ArrayList<String> r133 = r132.getStringArrayList("classes_to_restore");
        if (r133 == null) goto L70;
        int r142 = r133.size();
        int r1 = 0;
    L10:
        if (r1 >= r142) goto L98;
        String r2 = r133.get(r1);
        r1 = r1 + 1;
        String r22 = r2;
        Class<? extends U> r3 = Class.forName(r22, false, Recreator.class.getClassLoader()).asSubclass(s10.class);     // Catch: ClassNotFoundException -> L65
        ip.n("{\n                Class.…class.java)\n            }", r3);     // Catch: ClassNotFoundException -> L65
        Constructor r32 = r3.getDeclaredConstructor(null);     // Catch: NoSuchMethodException -> L62
        r32.setAccessible(true);
        Object r33 = r32.newInstance(null);     // Catch: Exception -> L59
        ip.n("{\n                constr…wInstance()\n            }", r33);     // Catch: Exception -> L59
        s10 r34 = (s10) r33;     // Catch: Exception -> L59
        u10 r23 = this.a;
        if ((r23 instanceof sa0) == false) goto L58;
        ra0 r35 = ((sa0) r23).d();
        a3 r6 = r23.b();
        r35.getClass();
        Iterator r7 = new HashSet(r35.a.keySet()).iterator();
    L21:
        if (r7.hasNext() == false) goto L41;
        String r8 = (String) r7.next();
        ip.o("key", r8);
        pa0 r82 = (pa0) r35.a.get(r8);
        ip.l(r82);
        a r9 = r23.e();
        ip.o("registry", r6);
        ip.o("lifecycle", r9);
        HashMap r11 = r82.a;
        if (r11 != null) goto L25;
        Object r83 = null;
    L28:
        SavedStateHandleController r84 = (SavedStateHandleController) r83;
        if (r84 == null) goto L21;
        boolean r10 = r84.a;
        if (r10 == true) goto L21;
        if (r10 == true) goto L34;
        r84.a = true;
        r9.a(r84);
        throw null;
    L34:
        throw new IllegalStateException("Already attached to lifecycleOwner");
    L25:
        monitor-enter(r11);
        r83 = r82.a.get("androidx.lifecycle.savedstate.vm.tag");     // Catch: Throwable -> L37
        monitor-exit(r11);     // Catch: Throwable -> L37
    L37:
        th = move-exception;
        throw th;
    L41:
        if (new HashSet(r35.a.keySet()).isEmpty() == true) goto L10;
        if (r6.e == false) goto L56;
        s2 r36 = (s2) r6.b;
        if (r36 != null) goto L47;
        r36 = new s2(r6);
    L47:
        r6.b = r36;
        fq.class.getDeclaredConstructor(null);     // Catch: NoSuchMethodException -> L52
        s2 r37 = (s2) r6.b;
        if (r37 == null) goto L10;
        ((LinkedHashSet) r37.b).add(fq.class.getName());
    L52:
        e = move-exception;
        throw new IllegalArgumentException("Class " + fq.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
    L56:
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    L58:
        throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
    L59:
        e = move-exception;
        throw new RuntimeException("Failed to instantiate " + r22, e);
    L62:
        e = move-exception;
        throw new IllegalStateException("Class " + r3.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
    L65:
        e = move-exception;
        throw new RuntimeException(z30.j("Class ", r22, " wasn't found"), e);
    L98:
        return;
    L70:
        throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
    L68:
        return;
    L72:
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
