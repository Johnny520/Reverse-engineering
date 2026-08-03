package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4046 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final <T> InterfaceC4044<T> m995(@InterfaceC6489 InterfaceC5542 interfaceC5542) {
        return new C4045(interfaceC5542);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <T> InterfaceC4044<T> m996(T t) {
        C4045 c4045 = new C4045(null);
        c4045.mo11461(t);
        return c4045;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC4044 m11470(InterfaceC5542 interfaceC5542, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC5542 = null;
        }
        return m995(interfaceC5542);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> boolean m11471(@InterfaceC6399 InterfaceC4044<T> interfaceC4044, @InterfaceC6399 Object obj) {
        Throwable thM22403 = C7148.m22403(obj);
        return thM22403 == null ? interfaceC4044.mo11461(obj) : interfaceC4044.mo992(thM22403);
    }
}
