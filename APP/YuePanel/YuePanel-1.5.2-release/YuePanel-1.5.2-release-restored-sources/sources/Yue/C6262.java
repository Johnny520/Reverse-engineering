package Yue;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: Yue.ۥۣۡۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/ModuleNameRetriever\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
public final class C6262 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C6262 f1949 = new C6262();

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public static final C0948 f1950 = new C0948(null, null, null);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public static C0948 f15442;

    /* JADX INFO: renamed from: Yue.ۥۣۡۡۤ$ۥ */
    public static final class C0948 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC5568
        @InterfaceC6489
        public final Method f1951;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC5568
        @InterfaceC6489
        public final Method f1952;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC5568
        @InterfaceC6489
        public final Method f15443;

        public C0948(@InterfaceC6489 Method method, @InterfaceC6489 Method method2, @InterfaceC6489 Method method3) {
            this.f1951 = method;
            this.f1952 = method2;
            this.f15443 = method3;
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public final C0948 m2727(AbstractC3513 abstractC3513) {
        try {
            C0948 c0948 = new C0948(Class.class.getDeclaredMethod("getModule", null), abstractC3513.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), abstractC3513.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            f15442 = c0948;
            return c0948;
        } catch (Exception unused) {
            C0948 c09482 = f1950;
            f15442 = c09482;
            return c09482;
        }
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public final String m2728(@InterfaceC6399 AbstractC3513 abstractC3513) {
        C5499.m17103(abstractC3513, "continuation");
        C0948 c0948M2727 = f15442;
        if (c0948M2727 == null) {
            c0948M2727 = m2727(abstractC3513);
        }
        if (c0948M2727 == f1950) {
            return null;
        }
        Method method = c0948M2727.f1951;
        Object objInvoke = method != null ? method.invoke(abstractC3513.getClass(), null) : null;
        if (objInvoke == null) {
            return null;
        }
        Method method2 = c0948M2727.f1952;
        Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, null) : null;
        if (objInvoke2 == null) {
            return null;
        }
        Method method3 = c0948M2727.f15443;
        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
        if (objInvoke3 instanceof String) {
            return (String) objInvoke3;
        }
        return null;
    }
}
