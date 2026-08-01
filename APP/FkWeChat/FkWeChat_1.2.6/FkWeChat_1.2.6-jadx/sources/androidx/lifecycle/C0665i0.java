package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.C0673m0;
import java.lang.reflect.Constructor;
import p098g9.InterfaceC2549c;
import p137j4.AbstractC3594a;
import p181m4.C4970g;
import p181m4.InterfaceC4973j;
import p215oc.C5725t;
import p372z8.AbstractC9886a;
import p376zd.C10010p0;
import p376zd.C9987e;

/* JADX INFO: renamed from: androidx.lifecycle.i0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0665i0 extends C0673m0.e implements C0673m0.c {

    /* JADX INFO: renamed from: b */
    public Application f1955b;

    /* JADX INFO: renamed from: c */
    public final C0673m0.c f1956c;

    /* JADX INFO: renamed from: d */
    public Bundle f1957d;

    /* JADX INFO: renamed from: e */
    public AbstractC0668k f1958e;

    /* JADX INFO: renamed from: f */
    public C4970g f1959f;

    public C0665i0(Application application, InterfaceC4973j interfaceC4973j, Bundle bundle) {
        interfaceC4973j.getClass();
        this.f1959f = interfaceC4973j.getSavedStateRegistry();
        this.f1958e = interfaceC4973j.getLifecycle();
        this.f1957d = bundle;
        this.f1955b = application;
        this.f1956c = application != null ? C0673m0.a.f1981f.m2647a(application) : new C0673m0.a();
    }

    @Override // androidx.lifecycle.C0673m0.c
    /* JADX INFO: renamed from: a */
    public AbstractC0671l0 mo2616a(Class cls) {
        cls.getClass();
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m2619e(canonicalName, cls);
        }
        C9987e.m38645a("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // androidx.lifecycle.C0673m0.c
    /* JADX INFO: renamed from: b */
    public AbstractC0671l0 mo2607b(InterfaceC2549c interfaceC2549c, AbstractC3594a abstractC3594a) {
        interfaceC2549c.getClass();
        abstractC3594a.getClass();
        return mo2617c(AbstractC9886a.m38367b(interfaceC2549c), abstractC3594a);
    }

    @Override // androidx.lifecycle.C0673m0.c
    /* JADX INFO: renamed from: c */
    public AbstractC0671l0 mo2617c(Class cls, AbstractC3594a abstractC3594a) {
        cls.getClass();
        abstractC3594a.getClass();
        String str = (String) abstractC3594a.mo13448a(C0673m0.f1979c);
        if (str == null) {
            C10010p0.m38820a("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (abstractC3594a.mo13448a(AbstractC0657e0.f1943a) == null || abstractC3594a.mo13448a(AbstractC0657e0.f1944b) == null) {
            if (this.f1958e != null) {
                return m2619e(str, cls);
            }
            C10010p0.m38820a("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) abstractC3594a.mo13448a(C0673m0.a.f1983h);
        boolean zIsAssignableFrom = AbstractC0648a.class.isAssignableFrom(cls);
        Constructor constructorM2626c = (!zIsAssignableFrom || application == null) ? AbstractC0667j0.m2626c(cls, AbstractC0667j0.f1964b) : AbstractC0667j0.m2626c(cls, AbstractC0667j0.f1963a);
        return constructorM2626c == null ? this.f1956c.mo2617c(cls, abstractC3594a) : (!zIsAssignableFrom || application == null) ? AbstractC0667j0.m2627d(cls, constructorM2626c, AbstractC0657e0.m2602a(abstractC3594a)) : AbstractC0667j0.m2627d(cls, constructorM2626c, application, AbstractC0657e0.m2602a(abstractC3594a));
    }

    @Override // androidx.lifecycle.C0673m0.e
    /* JADX INFO: renamed from: d */
    public void mo2618d(AbstractC0671l0 abstractC0671l0) {
        abstractC0671l0.getClass();
        if (this.f1958e != null) {
            C4970g c4970g = this.f1959f;
            c4970g.getClass();
            AbstractC0668k abstractC0668k = this.f1958e;
            abstractC0668k.getClass();
            C0666j.m2620a(abstractC0671l0, c4970g, abstractC0668k);
        }
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC0671l0 m2619e(String str, Class cls) {
        AbstractC0671l0 abstractC0671l0M2627d;
        Application application;
        str.getClass();
        cls.getClass();
        AbstractC0668k abstractC0668k = this.f1958e;
        if (abstractC0668k == null) {
            C5725t.m23179a("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = AbstractC0648a.class.isAssignableFrom(cls);
        Constructor constructorM2626c = (!zIsAssignableFrom || this.f1955b == null) ? AbstractC0667j0.m2626c(cls, AbstractC0667j0.f1964b) : AbstractC0667j0.m2626c(cls, AbstractC0667j0.f1963a);
        if (constructorM2626c == null) {
            return this.f1955b != null ? this.f1956c.mo2616a(cls) : C0673m0.d.f1987b.m2654a().mo2616a(cls);
        }
        C4970g c4970g = this.f1959f;
        c4970g.getClass();
        C0655d0 c0655d0M2621b = C0666j.m2621b(c4970g, abstractC0668k, str, this.f1957d);
        if (!zIsAssignableFrom || (application = this.f1955b) == null) {
            abstractC0671l0M2627d = AbstractC0667j0.m2627d(cls, constructorM2626c, c0655d0M2621b.m2595d());
        } else {
            application.getClass();
            abstractC0671l0M2627d = AbstractC0667j0.m2627d(cls, constructorM2626c, application, c0655d0M2621b.m2595d());
        }
        abstractC0671l0M2627d.m2638a("androidx.lifecycle.savedstate.vm.tag", c0655d0M2621b);
        return abstractC0671l0M2627d;
    }
}
