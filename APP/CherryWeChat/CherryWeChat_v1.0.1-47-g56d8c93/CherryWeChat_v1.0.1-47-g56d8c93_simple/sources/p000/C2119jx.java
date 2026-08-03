package p000;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.HashMap;
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

    public C2119jx(Application r2, AbstractActivityC2148ki r3, Bundle r4) {
        this.f7448e = r3.getSavedStateRegistry();
        this.f7447d = r3.getLifecycle();
        this.f7446c = r4;
        this.f7444a = r2;
        if (r2 != null) goto L5;
        C2623vE r22 = new C2623vE(null);
    L9:
        this.f7445b = r22;
        return;
    L5:
        if (C2623vE.f9107d != null) goto L7;
        C2623vE.f9107d = new C2623vE(r2);
    L7:
        r22 = C2623vE.f9107d;
        goto L9
    }

    @Override // p000.InterfaceC2666wE
    /* JADX INFO: renamed from: a */
    public final AbstractC2580uE mo171a(Class r2) {
        String r0 = r2.getCanonicalName();
        if (r0 == null) goto L7;
        return m4310c(r2, r0);
    L7:
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // p000.InterfaceC2666wE
    /* JADX INFO: renamed from: b */
    public final AbstractC2580uE mo2563b(Class r4, C2557ts r5) {
        C1456gf r0 = C1456gf.f5170n;
        LinkedHashMap r1 = r5.f7638a;
        String r02 = (String) r1.get(r0);
        if (r02 == null) goto L29;
        if (r1.get(AbstractC0628Oj.f2014h) == null) goto L23;
        if (r1.get(AbstractC0628Oj.f2015i) == null) goto L23;
        Application r03 = (Application) r1.get(C1456gf.f5169m);
        boolean r12 = AbstractC0218F2.class.isAssignableFrom(r4);
        if (r12 == false) goto L12;
        if (r03 == null) goto L12;
        Constructor r2 = AbstractC2167kx.m4368a(r4, AbstractC2167kx.f7551a);
    L13:
        if (r2 == null) goto L15;
        if (r12 == false) goto L21;
        if (r03 == null) goto L21;
        return AbstractC2167kx.m4369b(r4, r2, new Object[]{r03, AbstractC0628Oj.m1243l(r5)});
    L21:
        return AbstractC2167kx.m4369b(r4, r2, new Object[]{AbstractC0628Oj.m1243l(r5)});
    L15:
        return this.f7445b.mo2563b(r4, r5);
    L12:
        r2 = AbstractC2167kx.m4368a(r4, AbstractC2167kx.f7552b);
    L23:
        if (this.f7447d == null) goto L27;
        return m4310c(r4, r02);
    L27:
        throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
    L29:
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
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
    public final AbstractC2580uE m4310c(Class r9, String r10) {
        AbstractC0760Rn r0 = this.f7447d;
        if (r0 == null) goto L54;
        boolean r1 = AbstractC0218F2.class.isAssignableFrom(r9);
        if (r1 == true) goto L7;
    L9:
        Constructor r2 = AbstractC2167kx.m4368a(r9, AbstractC2167kx.f7552b);
    L10:
        if (r2 == null) goto L12;
        C1518hx r3 = this.f7448e;
        Bundle r4 = this.f7446c;
        Bundle r5 = r3.m2896a(r10);
        Class[] r6 = C1194ax.f4091f;
        C1194ax r42 = AbstractC0714Qj.m1491m(r5, r4);
        C1238bx r52 = new C1238bx(r10, r42);
        if (r52.f4209c == true) goto L52;
        int r62 = 1;
        r52.f4209c = true;
        r0.mo1555a(r52);
        r3.m2898c(r10, r42.f4096e);
        EnumC0675Pn r102 = ((C1185ao) r0).f4064c;
        if (r102 != EnumC0675Pn.f2148b) goto L25;
    L28:
        r3.m2899d();
    L29:
        if (r1 == false) goto L33;
        Application r103 = this.f7444a;
        if (r103 == null) goto L33;
        AbstractC2580uE r92 = AbstractC2167kx.m4369b(r9, r2, new Object[]{r103, r42});
    L34:
        HashMap r02 = r92.f8938a;
        monitor-enter(r02);
        Object r12 = r92.f8938a.get("androidx.lifecycle.savedstate.vm.tag");     // Catch: Throwable -> L39
        if (r12 != null) goto L41;
        r92.f8938a.put("androidx.lifecycle.savedstate.vm.tag", r52);     // Catch: Throwable -> L39
    L41:
        monitor-exit(r02);     // Catch: Throwable -> L39
        if (r12 == null) goto L46;
        r52 = r12;
    L46:
        if (r92.f8940c == false) goto L48;
        AbstractC2580uE.m5082a(r52);
    L48:
        return r92;
    L39:
        th = move-exception;
        throw th;
    L33:
        r92 = AbstractC2167kx.m4369b(r9, r2, new Object[]{r42});
        goto L34
    L25:
        if (r102.m1371a(EnumC0675Pn.f2150d) == true) goto L28;
        r0.mo1555a(new C1366ed(r62, r0, r3));
        goto L29
    L52:
        throw new IllegalStateException("Already attached to lifecycleOwner");
    L12:
        if (this.f7444a == null) goto L16;
        return this.f7445b.mo171a(r9);
    L16:
        if (C0111Ci.f271b != null) goto L19;
        C0111Ci.f271b = new C0111Ci(2);
    L19:
        return C0111Ci.f271b.mo171a(r9);
    L7:
        if (this.f7444a == null) goto L9;
        r2 = AbstractC2167kx.m4368a(r9, AbstractC2167kx.f7551a);
        goto L10
    L54:
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
