package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۤۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nPreconditions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Preconditions.kt\nkotlin/PreconditionsKt__PreconditionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n1#2:145\n*E\n"})
public class C6743 extends C6742 {
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m21422(boolean z) {
        if (!z) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m21423(boolean z, InterfaceC5122<? extends Object> interfaceC5122) {
        C5499.m17103(interfaceC5122, "lazyMessage");
        if (!z) {
            throw new IllegalStateException(interfaceC5122.invoke().toString());
        }
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> T m21424(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T> T m21425(T t, InterfaceC5122<? extends Object> interfaceC5122) {
        C5499.m17103(interfaceC5122, "lazyMessage");
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(interfaceC5122.invoke().toString());
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final Void m21426(Object obj) {
        C5499.m17103(obj, "message");
        throw new IllegalStateException(obj.toString());
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final void m21427(boolean z) {
        if (!z) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final void m21428(boolean z, InterfaceC5122<? extends Object> interfaceC5122) {
        C5499.m17103(interfaceC5122, "lazyMessage");
        if (!z) {
            throw new IllegalArgumentException(interfaceC5122.invoke().toString());
        }
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final <T> T m21429(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final <T> T m21430(T t, InterfaceC5122<? extends Object> interfaceC5122) {
        C5499.m17103(interfaceC5122, "lazyMessage");
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(interfaceC5122.invoke().toString());
    }
}
