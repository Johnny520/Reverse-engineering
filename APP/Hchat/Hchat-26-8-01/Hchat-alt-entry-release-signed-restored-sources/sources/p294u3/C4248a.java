package p294u3;

import android.os.Bundle;
import androidx.lifecycle.EnumC0106k;
import androidx.lifecycle.InterfaceC0103h;
import androidx.lifecycle.InterfaceC0110o;
import androidx.lifecycle.InterfaceC0112q;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p012ah.C0086a;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: u3.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4248a implements InterfaceC0110o {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f13928g = 0;

    /* JADX INFO: renamed from: h */
    public final Object f13929h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4248a(InterfaceC4250c interfaceC4250c) {
        interfaceC4250c.getClass();
        this.f13929h = interfaceC4250c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0110o
    /* JADX INFO: renamed from: b */
    public final void mo548b(InterfaceC0112q interfaceC0112q, EnumC0106k enumC0106k) {
        switch (this.f13928g) {
            case 0:
                if (enumC0106k != EnumC0106k.ON_CREATE) {
                    C2104o.m5281f("Next event must be ON_CREATE");
                    return;
                }
                interfaceC0112q.mo550f().m557f(this);
                Bundle bundleM6031l = ((InterfaceC4250c) this.f13929h).mo1402b().m6031l("androidx.savedstate.Restarter");
                if (bundleM6031l == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleM6031l.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    C2104o.m5276A("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                Iterator<String> it = stringArrayList.iterator();
                if (it.hasNext()) {
                    String next = it.next();
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(next, false, C4248a.class.getClassLoader()).asSubclass(InterfaceC4249b.class);
                        clsAsSubclass.getClass();
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                declaredConstructor.newInstance(null).getClass();
                                throw new ClassCastException();
                            } catch (Exception e6) {
                                C0086a.m457p(AbstractC4855en.m9263g("Failed to instantiate ", next), e6);
                                return;
                            }
                        } catch (NoSuchMethodException e7) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
                        }
                    } catch (ClassNotFoundException e10) {
                        C0086a.m457p(AbstractC0921a.m2251n("Class ", next, " wasn't found"), e10);
                        return;
                    }
                }
                return;
            default:
                new HashMap();
                InterfaceC0103h[] interfaceC0103hArr = (InterfaceC0103h[]) this.f13929h;
                if (interfaceC0103hArr.length > 0) {
                    InterfaceC0103h interfaceC0103h = interfaceC0103hArr[0];
                    throw null;
                }
                if (interfaceC0103hArr.length <= 0) {
                    return;
                }
                InterfaceC0103h interfaceC0103h2 = interfaceC0103hArr[0];
                throw null;
        }
    }

    public C4248a(InterfaceC0103h[] interfaceC0103hArr) {
        this.f13929h = interfaceC0103hArr;
    }
}
