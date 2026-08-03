package Yue;

import Yue.C7148;

/* JADX INFO: renamed from: Yue.ۥۡۦۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Result.kt\nkotlin/ResultKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,340:1\n1#2:341\n*E\n"})
public final class C7149 {
    @InterfaceC6399
    @InterfaceC6839
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ */
    public static final Object m3441(@InterfaceC6399 Throwable th) {
        C5499.m17103(th, "exception");
        return new C7148.C1190(th);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <R, T> R m3442(Object obj, InterfaceC5124<? super T, ? extends R> interfaceC5124, InterfaceC5124<? super Throwable, ? extends R> interfaceC51242) {
        C5499.m17103(interfaceC5124, "onSuccess");
        C5499.m17103(interfaceC51242, "onFailure");
        Throwable thM22403 = C7148.m22403(obj);
        return thM22403 == null ? interfaceC5124.invoke(obj) : interfaceC51242.invoke(thM22403);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <R, T extends R> R m22411(Object obj, R r) {
        return C7148.m22407(obj) ? r : obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <R, T extends R> R m22412(Object obj, InterfaceC5124<? super Throwable, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC5124, "onFailure");
        Throwable thM22403 = C7148.m22403(obj);
        return thM22403 == null ? obj : interfaceC5124.invoke(thM22403);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> T m22413(Object obj) {
        m22422(obj);
        return obj;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <R, T> Object m22414(Object obj, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC5124, "transform");
        if (!C7148.m22408(obj)) {
            return C7148.m3438(obj);
        }
        C7148.C1189 c1189 = C7148.f21560;
        return C7148.m3438(interfaceC5124.invoke(obj));
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <R, T> Object m22415(Object obj, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC5124, "transform");
        if (!C7148.m22408(obj)) {
            return C7148.m3438(obj);
        }
        try {
            C7148.C1189 c1189 = C7148.f21560;
            return C7148.m3438(interfaceC5124.invoke(obj));
        } catch (Throwable th) {
            C7148.C1189 c11892 = C7148.f21560;
            return C7148.m3438(m3441(th));
        }
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T> Object m22416(Object obj, InterfaceC5124<? super Throwable, C8107> interfaceC5124) {
        C5499.m17103(interfaceC5124, "action");
        Throwable thM22403 = C7148.m22403(obj);
        if (thM22403 != null) {
            interfaceC5124.invoke(thM22403);
        }
        return obj;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <T> Object m22417(Object obj, InterfaceC5124<? super T, C8107> interfaceC5124) {
        C5499.m17103(interfaceC5124, "action");
        if (C7148.m22408(obj)) {
            interfaceC5124.invoke(obj);
        }
        return obj;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final <R, T extends R> Object m22418(Object obj, InterfaceC5124<? super Throwable, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC5124, "transform");
        Throwable thM22403 = C7148.m22403(obj);
        if (thM22403 == null) {
            return obj;
        }
        C7148.C1189 c1189 = C7148.f21560;
        return C7148.m3438(interfaceC5124.invoke(thM22403));
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final <R, T extends R> Object m22419(Object obj, InterfaceC5124<? super Throwable, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC5124, "transform");
        Throwable thM22403 = C7148.m22403(obj);
        if (thM22403 == null) {
            return obj;
        }
        try {
            C7148.C1189 c1189 = C7148.f21560;
            return C7148.m3438(interfaceC5124.invoke(thM22403));
        } catch (Throwable th) {
            C7148.C1189 c11892 = C7148.f21560;
            return C7148.m3438(m3441(th));
        }
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final <R> Object m22420(InterfaceC5122<? extends R> interfaceC5122) {
        C5499.m17103(interfaceC5122, "block");
        try {
            C7148.C1189 c1189 = C7148.f21560;
            return C7148.m3438(interfaceC5122.invoke());
        } catch (Throwable th) {
            C7148.C1189 c11892 = C7148.f21560;
            return C7148.m3438(m3441(th));
        }
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final <T, R> Object m22421(T t, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC5124, "block");
        try {
            C7148.C1189 c1189 = C7148.f21560;
            return C7148.m3438(interfaceC5124.invoke(t));
        } catch (Throwable th) {
            C7148.C1189 c11892 = C7148.f21560;
            return C7148.m3438(m3441(th));
        }
    }

    @InterfaceC6839
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final void m22422(@InterfaceC6399 Object obj) {
        if (obj instanceof C7148.C1190) {
            throw ((C7148.C1190) obj).f21562;
        }
    }
}
