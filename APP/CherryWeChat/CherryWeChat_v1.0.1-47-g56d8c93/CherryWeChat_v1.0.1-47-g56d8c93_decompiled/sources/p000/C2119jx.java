package p000;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: jx */
/* JADX INFO: loaded from: classes.dex */
public final class C2119jx implements InterfaceC2666wE {

    /* JADX INFO: renamed from: a */
    public final Application f7444a;

    /* JADX INFO: renamed from: b */
    public final C2623vE f7445b;

    /* JADX INFO: renamed from: c */
    public final Bundle f7446c;

    /* JADX INFO: renamed from: d */
    public final AbstractC0760Rn f7447d;

    /* JADX INFO: renamed from: e */
    public final C1518hx f7448e;

    public C2119jx(Application application, AbstractActivityC2148ki abstractActivityC2148ki, Bundle bundle) {
        C2623vE c2623vE;
        this.f7448e = abstractActivityC2148ki.getSavedStateRegistry();
        this.f7447d = abstractActivityC2148ki.getLifecycle();
        this.f7446c = bundle;
        this.f7444a = application;
        if (application != null) {
            if (C2623vE.f9107d == null) {
                C2623vE.f9107d = new C2623vE(application);
            }
            c2623vE = C2623vE.f9107d;
        } else {
            c2623vE = new C2623vE(null);
        }
        this.f7445b = c2623vE;
    }

    @Override // p000.InterfaceC2666wE
    /* JADX INFO: renamed from: a */
    public final AbstractC2580uE mo171a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m4310c(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // p000.InterfaceC2666wE
    /* JADX INFO: renamed from: b */
    public final AbstractC2580uE mo2563b(Class cls, C2557ts c2557ts) {
        C1456gf c1456gf = C1456gf.f5170n;
        LinkedHashMap linkedHashMap = c2557ts.f7638a;
        String str = (String) linkedHashMap.get(c1456gf);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(AbstractC0628Oj.f2014h) == null || linkedHashMap.get(AbstractC0628Oj.f2015i) == null) {
            if (this.f7447d != null) {
                return m4310c(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(C1456gf.f5169m);
        boolean zIsAssignableFrom = AbstractC0218F2.class.isAssignableFrom(cls);
        Constructor constructorM4368a = (!zIsAssignableFrom || application == null) ? AbstractC2167kx.m4368a(cls, AbstractC2167kx.f7552b) : AbstractC2167kx.m4368a(cls, AbstractC2167kx.f7551a);
        return constructorM4368a == null ? this.f7445b.mo2563b(cls, c2557ts) : (!zIsAssignableFrom || application == null) ? AbstractC2167kx.m4369b(cls, constructorM4368a, AbstractC0628Oj.m1243l(c2557ts)) : AbstractC2167kx.m4369b(cls, constructorM4368a, application, AbstractC0628Oj.m1243l(c2557ts));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: c */
    public final AbstractC2580uE m4310c(Class cls, String str) {
        Object obj;
        Application application;
        AbstractC0760Rn abstractC0760Rn = this.f7447d;
        if (abstractC0760Rn == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC0218F2.class.isAssignableFrom(cls);
        Constructor constructorM4368a = (!zIsAssignableFrom || this.f7444a == null) ? AbstractC2167kx.m4368a(cls, AbstractC2167kx.f7552b) : AbstractC2167kx.m4368a(cls, AbstractC2167kx.f7551a);
        if (constructorM4368a == null) {
            if (this.f7444a != null) {
                return this.f7445b.mo171a(cls);
            }
            if (C0111Ci.f271b == null) {
                C0111Ci.f271b = new C0111Ci(2);
            }
            return C0111Ci.f271b.mo171a(cls);
        }
        C1518hx c1518hx = this.f7448e;
        Bundle bundle = this.f7446c;
        Bundle bundleM2896a = c1518hx.m2896a(str);
        Class[] clsArr = C1194ax.f4091f;
        C1194ax c1194axM1491m = AbstractC0714Qj.m1491m(bundleM2896a, bundle);
        C1238bx c1238bx = new C1238bx(str, c1194axM1491m);
        if (c1238bx.f4209c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        int i = 1;
        c1238bx.f4209c = true;
        abstractC0760Rn.mo1555a(c1238bx);
        c1518hx.m2898c(str, c1194axM1491m.f4096e);
        EnumC0675Pn enumC0675Pn = ((C1185ao) abstractC0760Rn).f4064c;
        if (enumC0675Pn == EnumC0675Pn.f2148b || enumC0675Pn.m1371a(EnumC0675Pn.f2150d)) {
            c1518hx.m2899d();
        } else {
            abstractC0760Rn.mo1555a(new C1366ed(i, abstractC0760Rn, c1518hx));
        }
        AbstractC2580uE abstractC2580uEM4369b = (!zIsAssignableFrom || (application = this.f7444a) == null) ? AbstractC2167kx.m4369b(cls, constructorM4368a, c1194axM1491m) : AbstractC2167kx.m4369b(cls, constructorM4368a, application, c1194axM1491m);
        synchronized (abstractC2580uEM4369b.f8938a) {
            try {
                obj = abstractC2580uEM4369b.f8938a.get("androidx.lifecycle.savedstate.vm.tag");
                if (obj == null) {
                    abstractC2580uEM4369b.f8938a.put("androidx.lifecycle.savedstate.vm.tag", c1238bx);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            c1238bx = obj;
        }
        if (abstractC2580uEM4369b.f8940c) {
            AbstractC2580uE.m5082a(c1238bx);
        }
        return abstractC2580uEM4369b;
    }
}
