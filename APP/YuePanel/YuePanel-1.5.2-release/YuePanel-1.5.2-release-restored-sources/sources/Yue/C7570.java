package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7570 {
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ */
    public static final Void m3737() {
        throw new C6398(null, 1, null);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ */
    public static final Void m3738(String str) {
        C5499.m17103(str, "reason");
        throw new C6398("An operation is not implemented: " + str);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T> T m23696(T t, InterfaceC5124<? super T, C8107> interfaceC5124) {
        C5499.m17103(interfaceC5124, "block");
        interfaceC5124.invoke(t);
        return t;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> T m23697(T t, InterfaceC5124<? super T, C8107> interfaceC5124) {
        C5499.m17103(interfaceC5124, "block");
        interfaceC5124.invoke(t);
        return t;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T, R> R m23698(T t, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC5124, "block");
        return interfaceC5124.invoke(t);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final void m23699(int i, InterfaceC5124<? super Integer, C8107> interfaceC5124) {
        C5499.m17103(interfaceC5124, "action");
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC5124.invoke(Integer.valueOf(i2));
        }
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <R> R m23700(InterfaceC5122<? extends R> interfaceC5122) {
        C5499.m17103(interfaceC5122, "block");
        return interfaceC5122.invoke();
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T, R> R m23701(T t, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC5124, "block");
        return interfaceC5124.invoke(t);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <T> T m23702(T t, InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(interfaceC5124, "predicate");
        if (interfaceC5124.invoke(t).booleanValue()) {
            return t;
        }
        return null;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final <T> T m23703(T t, InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(interfaceC5124, "predicate");
        if (interfaceC5124.invoke(t).booleanValue()) {
            return null;
        }
        return t;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final <T, R> R m23704(T t, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC5124, "block");
        return interfaceC5124.invoke(t);
    }
}
