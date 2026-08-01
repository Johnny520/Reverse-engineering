package p002A1;

import android.os.Bundle;
import android.view.View;
import com.bumptech.glide.AbstractC1924f;
import java.util.Arrays;
import java.util.LinkedHashMap;
import me.dartcv.nuke.R;
import p007B0.C0173F;
import p014C1.C0240b;
import p019D1.AbstractC0261b;
import p019D1.C0260a;
import p019D1.C0262c;
import p024E1.C0280a;
import p048I1.C0780e;
import p048I1.InterfaceC0779d;
import p048I1.InterfaceC0782g;
import p056K2.C0882h;
import p061L2.C0982v;
import p065M2.C1002e;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1676u;
import p127Z2.AbstractC1784a;

/* JADX INFO: renamed from: A1.E */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0116E {

    /* JADX INFO: renamed from: a */
    public static final C0115D f495a = new C0115D(0);

    /* JADX INFO: renamed from: b */
    public static final C0115D f496b = new C0115D(1);

    /* JADX INFO: renamed from: c */
    public static final C0115D f497c = new C0115D(2);

    /* JADX INFO: renamed from: d */
    public static final C0115D f498d = new C0115D(4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m159a(AbstractC0122K abstractC0122K, C0780e c0780e, AbstractC0142o abstractC0142o) {
        AutoCloseable autoCloseable;
        AbstractC1665j.m2985e(c0780e, "registry");
        AbstractC1665j.m2985e(abstractC0142o, "lifecycle");
        C0280a c0280a = abstractC0122K.f513a;
        if (c0280a != null) {
            synchronized (c0280a.f902a) {
                autoCloseable = (AutoCloseable) c0280a.f903b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        C0113B c0113b = (C0113B) autoCloseable;
        if (c0113b == null || c0113b.f493f) {
            return;
        }
        c0113b.m148h(abstractC0142o, c0780e);
        EnumC0141n enumC0141n = ((C0147t) abstractC0142o).f541c;
        if (enumC0141n == EnumC0141n.f532e || enumC0141n.compareTo(EnumC0141n.f534g) >= 0) {
            c0780e.m1328d();
        } else {
            abstractC0142o.mo184a(new C0134g(abstractC0142o, c0780e));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C0112A m160b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            C0112A c0112a = new C0112A();
            new LinkedHashMap();
            c0112a.f490a = new C0240b(C0982v.f3048d);
            return c0112a;
        }
        ClassLoader classLoader = C0112A.class.getClassLoader();
        AbstractC1665j.m2982b(classLoader);
        bundle.setClassLoader(classLoader);
        C1002e c1002e = new C1002e(bundle.size());
        for (String str : bundle.keySet()) {
            AbstractC1665j.m2982b(str);
            c1002e.put(str, bundle.get(str));
        }
        c1002e.m2069b();
        c1002e.f3112p = true;
        if (c1002e.f3108l <= 0) {
            c1002e = C1002e.f3099q;
            AbstractC1665j.m2983c(c1002e, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        }
        C0112A c0112a2 = new C0112A();
        new LinkedHashMap();
        c0112a2.f490a = new C0240b(c1002e);
        return c0112a2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final C0112A m161c(C0262c c0262c) {
        LinkedHashMap linkedHashMap = c0262c.f854a;
        InterfaceC0782g interfaceC0782g = (InterfaceC0782g) linkedHashMap.get(f495a);
        if (interfaceC0782g == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        InterfaceC0127P interfaceC0127P = (InterfaceC0127P) linkedHashMap.get(f496b);
        if (interfaceC0127P == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f497c);
        String str = (String) linkedHashMap.get(f498d);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        InterfaceC0779d interfaceC0779dM1326b = interfaceC0782g.getSavedStateRegistry().m1326b();
        Bundle bundle2 = null;
        C0118G c0118g = interfaceC0779dM1326b instanceof C0118G ? (C0118G) interfaceC0779dM1326b : null;
        if (c0118g == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = m164f(interfaceC0127P).f505b;
        C0112A c0112a = (C0112A) linkedHashMap2.get(str);
        if (c0112a != null) {
            return c0112a;
        }
        c0118g.m167b();
        Bundle bundle3 = c0118g.f503c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = AbstractC1784a.m3224j((C0882h[]) Arrays.copyOf(new C0882h[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                c0118g.f503c = null;
            }
            bundle2 = bundle4;
        }
        C0112A c0112aM160b = m160b(bundle2, bundle);
        linkedHashMap2.put(str, c0112aM160b);
        return c0112aM160b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final InterfaceC0145r m162d(View view) {
        AbstractC1665j.m2985e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            InterfaceC0145r interfaceC0145r = tag instanceof InterfaceC0145r ? (InterfaceC0145r) tag : null;
            if (interfaceC0145r != null) {
                return interfaceC0145r;
            }
            Object objM3501m = AbstractC1924f.m3501m(view);
            view = objM3501m instanceof View ? (View) objM3501m : null;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final InterfaceC0127P m163e(View view) {
        AbstractC1665j.m2985e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            InterfaceC0127P interfaceC0127P = tag instanceof InterfaceC0127P ? (InterfaceC0127P) tag : null;
            if (interfaceC0127P != null) {
                return interfaceC0127P;
            }
            Object objM3501m = AbstractC1924f.m3501m(view);
            view = objM3501m instanceof View ? (View) objM3501m : null;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final C0119H m164f(InterfaceC0127P interfaceC0127P) {
        C0114C c0114c = new C0114C();
        AbstractC0261b defaultViewModelCreationExtras = interfaceC0127P instanceof InterfaceC0136i ? ((InterfaceC0136i) interfaceC0127P).getDefaultViewModelCreationExtras() : C0260a.f853b;
        AbstractC1665j.m2985e(defaultViewModelCreationExtras, "extras");
        C0126O viewModelStore = interfaceC0127P.getViewModelStore();
        AbstractC1665j.m2985e(viewModelStore, "store");
        return (C0119H) new C0173F(viewModelStore, c0114c, defaultViewModelCreationExtras).m255j(AbstractC1676u.m2995a(C0119H.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final void m165g(View view, InterfaceC0145r interfaceC0145r) {
        AbstractC1665j.m2985e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC0145r);
    }
}
