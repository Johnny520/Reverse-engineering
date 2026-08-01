package p024M;

import android.os.Bundle;
import androidx.lifecycle.C0486u;
import androidx.lifecycle.EnumC0478m;
import androidx.lifecycle.EnumC0479n;
import androidx.lifecycle.InterfaceC0482q;
import androidx.lifecycle.InterfaceC0484s;
import androidx.savedstate.Recreator;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import p004C.C0066j;
import p006D.AbstractC0079h;
import p012G.C0140d;
import p027N0.AbstractC0223g;
import p041V.AbstractC0311d;
import p041V.C0312e;
import p041V.C0313f;
import p041V.InterfaceC0323p;
import p045Y.AbstractC0357c;
import p049a0.C0367a;
import p073k.C0738d;
import p073k.C0740f;

/* JADX INFO: renamed from: M.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0191e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f544a;

    /* JADX INFO: renamed from: b */
    public boolean f545b;

    /* JADX INFO: renamed from: c */
    public final Object f546c;

    /* JADX INFO: renamed from: d */
    public final Object f547d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0191e(InterfaceC0192f interfaceC0192f) {
        this.f544a = 0;
        this.f546c = interfaceC0192f;
        this.f547d = new C0190d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m400a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(cls.getName());
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0127  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InterfaceC0323p m401b(C0367a c0367a) {
        String str;
        InterfaceC0323p c0312e;
        int i2 = 8;
        HashMap map = (HashMap) this.f546c;
        Type type = c0367a.f861b;
        if (map.get(type) != null) {
            throw new ClassCastException();
        }
        Class cls = c0367a.f860a;
        if (map.get(cls) != null) {
            throw new ClassCastException();
        }
        C0140d c0140d = null;
        C0313f c0313f = EnumSet.class.isAssignableFrom(cls) ? new C0313f(type, 0) : cls == EnumMap.class ? new C0313f(type, 1) : null;
        if (c0313f != null) {
            return c0313f;
        }
        AbstractC0311d.m543e((ArrayList) this.f547d);
        if (Modifier.isAbstract(cls.getModifiers())) {
            c0312e = null;
        } else {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                AbstractC0079h abstractC0079h = AbstractC0357c.f834a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e2) {
                    str = "Failed making constructor '" + AbstractC0357c.m613b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e2.getMessage();
                }
                c0312e = str != null ? new C0312e(2, str) : new C0066j(i2, declaredConstructor);
            } catch (NoSuchMethodException unused) {
                c0312e = null;
            }
        }
        if (c0312e != null) {
            return c0312e;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            c0140d = SortedSet.class.isAssignableFrom(cls) ? new C0140d(8) : Set.class.isAssignableFrom(cls) ? new C0140d(9) : Queue.class.isAssignableFrom(cls) ? new C0140d(10) : new C0140d(11);
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                c0140d = new C0140d(12);
            } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
                c0140d = new C0140d(13);
            } else if (SortedMap.class.isAssignableFrom(cls)) {
                c0140d = new C0140d(14);
            } else if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                Objects.requireNonNull(type2);
                Type typeM539a = AbstractC0311d.m539a(type2);
                Class clsM545g = AbstractC0311d.m545g(typeM539a);
                typeM539a.hashCode();
                c0140d = !String.class.isAssignableFrom(clsM545g) ? new C0140d(15) : new C0140d(16);
            }
        }
        if (c0140d != null) {
            return c0140d;
        }
        String strM400a = m400a(cls);
        if (strM400a != null) {
            return new C0312e(1, strM400a);
        }
        if (this.f545b) {
            return new C0066j(7, cls);
        }
        return new C0312e(0, "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v0, types: [M.f, androidx.lifecycle.s, java.lang.Object] */
    /* JADX INFO: renamed from: c */
    public void m402c() {
        ?? r02 = this.f546c;
        C0486u c0486uMo636c = r02.mo636c();
        if (c0486uMo636c.f1528c != EnumC0479n.f1518b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        c0486uMo636c.m927a(new Recreator(r02));
        final C0190d c0190d = (C0190d) this.f547d;
        c0190d.getClass();
        if (c0190d.f538a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        c0486uMo636c.m927a(new InterfaceC0482q() { // from class: M.a
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.lifecycle.InterfaceC0482q
            /* JADX INFO: renamed from: c */
            public final void mo391c(InterfaceC0484s interfaceC0484s, EnumC0478m enumC0478m) {
                C0190d c0190d2 = c0190d;
                AbstractC0223g.m418e(c0190d2, "this$0");
                if (enumC0478m == EnumC0478m.ON_START) {
                    c0190d2.f540c = true;
                } else if (enumC0478m == EnumC0478m.ON_STOP) {
                    c0190d2.f540c = false;
                }
            }
        });
        c0190d.f538a = true;
        this.f545b = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.s, java.lang.Object] */
    /* JADX INFO: renamed from: d */
    public void m403d(Bundle bundle) {
        if (!this.f545b) {
            m402c();
        }
        C0486u c0486uMo636c = this.f546c.mo636c();
        if (c0486uMo636c.f1528c.compareTo(EnumC0479n.f1520d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c0486uMo636c.f1528c).toString());
        }
        C0190d c0190d = (C0190d) this.f547d;
        if (!c0190d.f538a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c0190d.f539b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c0190d.f542e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c0190d.f539b = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public void m404e(Bundle bundle) {
        C0190d c0190d = (C0190d) this.f547d;
        c0190d.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) c0190d.f542e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C0740f c0740f = (C0740f) c0190d.f541d;
        c0740f.getClass();
        C0738d c0738d = new C0738d(c0740f);
        c0740f.f2503c.put(c0738d, Boolean.FALSE);
        while (c0738d.hasNext()) {
            Map.Entry entry = (Map.Entry) c0738d.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC0189c) entry.getValue()).mo392a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f544a) {
            case 1:
                return ((HashMap) this.f546c).toString();
            default:
                return super.toString();
        }
    }

    public C0191e(HashMap map, boolean z2, ArrayList arrayList) {
        this.f544a = 1;
        this.f546c = map;
        this.f545b = z2;
        this.f547d = arrayList;
    }
}
