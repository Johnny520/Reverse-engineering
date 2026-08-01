package p002A1;

import android.app.Application;
import android.os.Bundle;
import com.bumptech.glide.AbstractC1924f;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import p010B3.AbstractActivityC0224c;
import p019D1.C0262c;
import p024E1.C0280a;
import p048I1.C0780e;
import p117X2.AbstractC1665j;
import p117X2.C1660e;
import p127Z2.AbstractC1784a;

/* JADX INFO: renamed from: A1.I */
/* JADX INFO: loaded from: classes.dex */
public final class C0120I implements InterfaceC0124M {

    /* JADX INFO: renamed from: a */
    public final Application f506a;

    /* JADX INFO: renamed from: b */
    public final C0123L f507b;

    /* JADX INFO: renamed from: c */
    public final Bundle f508c;

    /* JADX INFO: renamed from: d */
    public final AbstractC0142o f509d;

    /* JADX INFO: renamed from: e */
    public final C0780e f510e;

    public C0120I(Application application, AbstractActivityC0224c abstractActivityC0224c, Bundle bundle) {
        C0123L c0123l;
        this.f510e = abstractActivityC0224c.getSavedStateRegistry();
        this.f509d = abstractActivityC0224c.getLifecycle();
        this.f508c = bundle;
        this.f506a = application;
        if (application != null) {
            if (C0123L.f514c == null) {
                C0123L.f514c = new C0123L(application);
            }
            c0123l = C0123L.f514c;
            AbstractC1665j.m2982b(c0123l);
        } else {
            c0123l = new C0123L(null);
        }
        this.f507b = c0123l;
    }

    @Override // p002A1.InterfaceC0124M
    /* JADX INFO: renamed from: a */
    public final AbstractC0122K mo168a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m170d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // p002A1.InterfaceC0124M
    /* JADX INFO: renamed from: b */
    public final AbstractC0122K mo149b(C1660e c1660e, C0262c c0262c) {
        return mo169c(AbstractC1784a.m3238x(c1660e), c0262c);
    }

    @Override // p002A1.InterfaceC0124M
    /* JADX INFO: renamed from: c */
    public final AbstractC0122K mo169c(Class cls, C0262c c0262c) {
        C0115D c0115d = AbstractC0116E.f498d;
        LinkedHashMap linkedHashMap = c0262c.f854a;
        String str = (String) linkedHashMap.get(c0115d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(AbstractC0116E.f495a) == null || linkedHashMap.get(AbstractC0116E.f496b) == null) {
            if (this.f509d != null) {
                return m170d(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(C0123L.f515d);
        boolean zIsAssignableFrom = AbstractC0128a.class.isAssignableFrom(cls);
        Constructor constructorM171a = (!zIsAssignableFrom || application == null) ? AbstractC0121J.m171a(cls, AbstractC0121J.f512b) : AbstractC0121J.m171a(cls, AbstractC0121J.f511a);
        return constructorM171a == null ? this.f507b.mo169c(cls, c0262c) : (!zIsAssignableFrom || application == null) ? AbstractC0121J.m172b(cls, constructorM171a, AbstractC0116E.m161c(c0262c)) : AbstractC0121J.m172b(cls, constructorM171a, application, AbstractC0116E.m161c(c0262c));
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC0122K m170d(String str, Class cls) {
        AutoCloseable autoCloseable;
        Application application;
        AbstractC0142o abstractC0142o = this.f509d;
        if (abstractC0142o == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC0128a.class.isAssignableFrom(cls);
        Constructor constructorM171a = (!zIsAssignableFrom || this.f506a == null) ? AbstractC0121J.m171a(cls, AbstractC0121J.f512b) : AbstractC0121J.m171a(cls, AbstractC0121J.f511a);
        if (constructorM171a == null) {
            if (this.f506a != null) {
                return this.f507b.mo168a(cls);
            }
            if (C0125N.f517a == null) {
                C0125N.f517a = new C0125N();
            }
            AbstractC1665j.m2982b(C0125N.f517a);
            return AbstractC1924f.m3498j(cls);
        }
        C0780e c0780e = this.f510e;
        AbstractC1665j.m2982b(c0780e);
        C0112A c0112aM160b = AbstractC0116E.m160b(c0780e.m1325a(str), this.f508c);
        C0113B c0113b = new C0113B(str, c0112aM160b);
        c0113b.m148h(abstractC0142o, c0780e);
        EnumC0141n enumC0141n = ((C0147t) abstractC0142o).f541c;
        if (enumC0141n == EnumC0141n.f532e || enumC0141n.compareTo(EnumC0141n.f534g) >= 0) {
            c0780e.m1328d();
        } else {
            abstractC0142o.mo184a(new C0134g(abstractC0142o, c0780e));
        }
        AbstractC0122K abstractC0122KM172b = (!zIsAssignableFrom || (application = this.f506a) == null) ? AbstractC0121J.m172b(cls, constructorM171a, c0112aM160b) : AbstractC0121J.m172b(cls, constructorM171a, application, c0112aM160b);
        abstractC0122KM172b.getClass();
        C0280a c0280a = abstractC0122KM172b.f513a;
        if (c0280a == null) {
            return abstractC0122KM172b;
        }
        if (c0280a.f905d) {
            C0280a.m486a(c0113b);
            return abstractC0122KM172b;
        }
        synchronized (c0280a.f902a) {
            autoCloseable = (AutoCloseable) c0280a.f903b.put("androidx.lifecycle.savedstate.vm.tag", c0113b);
        }
        C0280a.m486a(autoCloseable);
        return abstractC0122KM172b;
    }
}
