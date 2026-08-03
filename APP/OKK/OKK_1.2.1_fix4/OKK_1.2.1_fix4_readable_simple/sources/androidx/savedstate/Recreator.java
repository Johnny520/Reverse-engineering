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

    public Recreator(InterfaceC0397f r2) {
        AbstractC0307g.m703e(r2, "owner");
        this.f1614a = r2;
    }

    @Override // androidx.lifecycle.InterfaceC0539p
    /* JADX INFO: renamed from: b */
    public final void mo981b(InterfaceC0541r r4, EnumC0535l r5) {
        if (r5 != EnumC0535l.ON_CREATE) goto L36;
        r4.mo1231d().m1258e(this);
        Bundle r42 = this.f1614a.mo985b().m982a("androidx.savedstate.Restarter");
        if (r42 != null) goto L7;
        return;
    L7:
        ArrayList<String> r43 = r42.getStringArrayList("classes_to_restore");
        if (r43 == null) goto L34;
        Iterator<String> r44 = r43.iterator();
        if (r44.hasNext() == false) goto L32;
        String r45 = r44.next();
        Class<? extends U> r52 = Class.forName(r45, false, Recreator.class.getClassLoader()).asSubclass(InterfaceC0394c.class);     // Catch: ClassNotFoundException -> L29
        AbstractC0307g.m702d(r52, "{\n                Class.…class.java)\n            }");     // Catch: ClassNotFoundException -> L29
        Constructor r53 = r52.getDeclaredConstructor(null);     // Catch: NoSuchMethodException -> L26
        r53.setAccessible(true);
        Object r54 = r53.newInstance(null);     // Catch: Exception -> L23
        AbstractC0307g.m702d(r54, "{\n                constr…wInstance()\n            }");     // Catch: Exception -> L23
        InterfaceC0394c r55 = (InterfaceC0394c) r54;     // Catch: Exception -> L23
        InterfaceC0397f r46 = this.f1614a;
        AbstractC0307g.m703e(r46, "owner");
        if ((r46 instanceof InterfaceC0522K) == false) goto L22;
        AbstractC0517F r56 = ((InterfaceC0522K) r46).mo1230c();
        r46.mo985b();
        r56.getClass();
        r56.getClass();
        throw null;
    L22:
        throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
    L23:
        e = move-exception;
        throw new RuntimeException(AbstractC0324d.m725h("Failed to instantiate ", r45), e);
    L26:
        e = move-exception;
        throw new IllegalStateException("Class " + r52.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
    L29:
        e = move-exception;
        throw new RuntimeException(AbstractC0324d.m723f("Class ", r45, " wasn't found"), e);
    L32:
        return;
    L34:
        throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
    L36:
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
