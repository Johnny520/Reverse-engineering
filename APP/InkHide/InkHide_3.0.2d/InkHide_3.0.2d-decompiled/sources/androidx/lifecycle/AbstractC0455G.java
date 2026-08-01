package androidx.lifecycle;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import p004C.C0064h;
import p004C.C0066j;
import p018J.C0156a;
import p018J.C0158c;
import p018J.C0159d;
import p024M.C0190d;
import p024M.InterfaceC0189c;
import p024M.InterfaceC0192f;
import p027N0.AbstractC0223g;
import p027N0.AbstractC0229m;
import p027N0.C0220d;

/* JADX INFO: renamed from: androidx.lifecycle.G */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0455G {

    /* JADX INFO: renamed from: a */
    public static final C0461M f1476a = new C0461M();

    /* JADX INFO: renamed from: b */
    public static final C0461M f1477b = new C0461M();

    /* JADX INFO: renamed from: c */
    public static final C0461M f1478c = new C0461M();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m909a(AbstractC0460L abstractC0460L, C0190d c0190d, C0486u c0486u) {
        Object obj;
        AbstractC0223g.m418e(c0190d, "registry");
        AbstractC0223g.m418e(c0486u, "lifecycle");
        HashMap map = abstractC0460L.f1491a;
        if (map == null) {
            obj = null;
        } else {
            synchronized (map) {
                obj = abstractC0460L.f1491a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController == null || savedStateHandleController.f1507c) {
            return;
        }
        savedStateHandleController.m920d(c0190d, c0486u);
        EnumC0479n enumC0479n = c0486u.f1528c;
        if (enumC0479n == EnumC0479n.f1518b || enumC0479n.compareTo(EnumC0479n.f1520d) >= 0) {
            c0190d.m399g();
        } else {
            c0486u.m927a(new LegacySavedStateHandleController$tryToAddRecreator$1(c0190d, c0486u));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C0454F m910b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new C0454F();
            }
            HashMap map = new HashMap();
            for (String str : bundle2.keySet()) {
                AbstractC0223g.m417d(str, "key");
                map.put(str, bundle2.get(str));
            }
            return new C0454F(map);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = parcelableArrayList.get(i2);
            AbstractC0223g.m416c(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i2));
        }
        return new C0454F(linkedHashMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final C0454F m911c(C0158c c0158c) {
        C0461M c0461m = f1476a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0158c.f470a;
        InterfaceC0192f interfaceC0192f = (InterfaceC0192f) linkedHashMap.get(c0461m);
        if (interfaceC0192f == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        InterfaceC0465Q interfaceC0465Q = (InterfaceC0465Q) linkedHashMap.get(f1477b);
        if (interfaceC0465Q == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f1478c);
        String str = (String) linkedHashMap.get(C0461M.f1497c);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        InterfaceC0189c interfaceC0189cM396d = interfaceC0192f.mo405b().m396d();
        C0456H c0456h = interfaceC0189cM396d instanceof C0456H ? (C0456H) interfaceC0189cM396d : null;
        if (c0456h == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = m912d(interfaceC0465Q).f1483d;
        C0454F c0454f = (C0454F) linkedHashMap2.get(str);
        if (c0454f != null) {
            return c0454f;
        }
        Class[] clsArr = C0454F.f1470f;
        c0456h.m913b();
        Bundle bundle2 = c0456h.f1481c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = c0456h.f1481c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = c0456h.f1481c;
        if (bundle5 != null && bundle5.isEmpty()) {
            c0456h.f1481c = null;
        }
        C0454F c0454fM910b = m910b(bundle3, bundle);
        linkedHashMap2.put(str, c0454fM910b);
        return c0454fM910b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final C0457I m912d(InterfaceC0465Q interfaceC0465Q) {
        ArrayList arrayList = new ArrayList();
        AbstractC0229m.f569a.getClass();
        Class clsMo413a = new C0220d(C0457I.class).mo413a();
        AbstractC0223g.m416c(clsMo413a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        arrayList.add(new C0159d(clsMo413a));
        C0159d[] c0159dArr = (C0159d[]) arrayList.toArray(new C0159d[0]);
        return (C0457I) new C0064h(interfaceC0465Q.getViewModelStore(), (InterfaceC0463O) new C0066j((C0159d[]) Arrays.copyOf(c0159dArr, c0159dArr.length)), interfaceC0465Q instanceof InterfaceC0474i ? ((InterfaceC0474i) interfaceC0465Q).mo635a() : C0156a.f469b).m120j(C0457I.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
