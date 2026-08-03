package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7775 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final <T> InterfaceC7774<T> m3872(@InterfaceC6399 ThreadLocal<T> threadLocal, T t) {
        return new C7778(t, threadLocal);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static /* synthetic */ InterfaceC7774 m3873(ThreadLocal threadLocal, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = threadLocal.get();
        }
        return m3872(threadLocal, obj);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Object m24714(@InterfaceC6399 ThreadLocal<?> threadLocal, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        if (interfaceC4199.getContext().get(new C7780(threadLocal)) != null) {
            return C8107.f3222;
        }
        throw new IllegalStateException(("ThreadLocal " + threadLocal + " is missing from context " + interfaceC4199.getContext()).toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final Object m24715(ThreadLocal<?> threadLocal, InterfaceC4199<? super C8107> interfaceC4199) {
        C5437.m16931(3);
        throw null;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Object m24716(@InterfaceC6399 ThreadLocal<?> threadLocal, @InterfaceC6399 InterfaceC4199<? super Boolean> interfaceC4199) {
        return C3590.m636(interfaceC4199.getContext().get(new C7780(threadLocal)) != null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Object m24717(ThreadLocal<?> threadLocal, InterfaceC4199<? super Boolean> interfaceC4199) {
        C5437.m16931(3);
        throw null;
    }
}
