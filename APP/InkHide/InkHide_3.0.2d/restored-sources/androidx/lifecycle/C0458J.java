package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import p018J.C0158c;
import p024M.C0190d;
import p024M.InterfaceC0192f;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: androidx.lifecycle.J */
/* JADX INFO: loaded from: classes.dex */
public final class C0458J implements InterfaceC0463O {

    /* JADX INFO: renamed from: b */
    public final Application f1484b;

    /* JADX INFO: renamed from: c */
    public final C0462N f1485c;

    /* JADX INFO: renamed from: d */
    public final Bundle f1486d;

    /* JADX INFO: renamed from: e */
    public final C0486u f1487e;

    /* JADX INFO: renamed from: f */
    public final C0190d f1488f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0458J(Application application, InterfaceC0192f interfaceC0192f, Bundle bundle) {
        C0462N c0462n;
        this.f1488f = interfaceC0192f.mo405b();
        this.f1487e = interfaceC0192f.mo636c();
        this.f1486d = bundle;
        this.f1484b = application;
        if (application != null) {
            if (C0462N.f1499f == null) {
                C0462N.f1499f = new C0462N(application);
            }
            c0462n = C0462N.f1499f;
            AbstractC0223g.m415b(c0462n);
        } else {
            c0462n = new C0462N(null);
        }
        this.f1485c = c0462n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:40:0x00a0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: androidx.lifecycle.SavedStateHandleController */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: androidx.lifecycle.SavedStateHandleController */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final AbstractC0460L m914a(Class cls, String str) {
        Object obj;
        Application application;
        C0486u c0486u = this.f1487e;
        if (c0486u == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC0466a.class.isAssignableFrom(cls);
        Constructor constructorM915a = (!zIsAssignableFrom || this.f1484b == null) ? AbstractC0459K.m915a(cls, AbstractC0459K.f1490b) : AbstractC0459K.m915a(cls, AbstractC0459K.f1489a);
        if (constructorM915a == null) {
            if (this.f1484b != null) {
                return this.f1485c.mo313e(cls);
            }
            if (C0461M.f1498d == null) {
                C0461M.f1498d = new C0461M();
            }
            C0461M c0461m = C0461M.f1498d;
            AbstractC0223g.m415b(c0461m);
            return c0461m.mo313e(cls);
        }
        C0190d c0190d = this.f1488f;
        AbstractC0223g.m415b(c0190d);
        Bundle bundle = this.f1486d;
        Bundle bundleM395c = c0190d.m395c(str);
        Class[] clsArr = C0454F.f1470f;
        C0454F c0454fM910b = AbstractC0455G.m910b(bundleM395c, bundle);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, c0454fM910b);
        savedStateHandleController.m920d(c0190d, c0486u);
        EnumC0479n enumC0479n = c0486u.f1528c;
        if (enumC0479n == EnumC0479n.f1518b || enumC0479n.compareTo(EnumC0479n.f1520d) >= 0) {
            c0190d.m399g();
        } else {
            c0486u.m927a(new LegacySavedStateHandleController$tryToAddRecreator$1(c0190d, c0486u));
        }
        AbstractC0460L abstractC0460LM916b = (!zIsAssignableFrom || (application = this.f1484b) == null) ? AbstractC0459K.m916b(cls, constructorM915a, c0454fM910b) : AbstractC0459K.m916b(cls, constructorM915a, application, c0454fM910b);
        synchronized (abstractC0460LM916b.f1491a) {
            try {
                obj = abstractC0460LM916b.f1491a.get("androidx.lifecycle.savedstate.vm.tag");
                if (obj == null) {
                    abstractC0460LM916b.f1491a.put("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            savedStateHandleController = obj;
        }
        if (abstractC0460LM916b.f1493c) {
            AbstractC0460L.m917a(savedStateHandleController);
        }
        return abstractC0460LM916b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0463O
    /* JADX INFO: renamed from: e */
    public final AbstractC0460L mo313e(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m914a(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0463O
    /* JADX INFO: renamed from: h */
    public final AbstractC0460L mo137h(Class cls, C0158c c0158c) {
        C0461M c0461m = C0461M.f1497c;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0158c.f470a;
        String str = (String) linkedHashMap.get(c0461m);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(AbstractC0455G.f1476a) == null || linkedHashMap.get(AbstractC0455G.f1477b) == null) {
            if (this.f1487e != null) {
                return m914a(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(C0461M.f1496b);
        boolean zIsAssignableFrom = AbstractC0466a.class.isAssignableFrom(cls);
        Constructor constructorM915a = (!zIsAssignableFrom || application == null) ? AbstractC0459K.m915a(cls, AbstractC0459K.f1490b) : AbstractC0459K.m915a(cls, AbstractC0459K.f1489a);
        return constructorM915a == null ? this.f1485c.mo137h(cls, c0158c) : (!zIsAssignableFrom || application == null) ? AbstractC0459K.m916b(cls, constructorM915a, AbstractC0455G.m911c(c0158c)) : AbstractC0459K.m916b(cls, constructorM915a, application, AbstractC0455G.m911c(c0158c));
    }
}
