package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nThread.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Thread.kt\nkotlin/concurrent/ThreadsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
@InterfaceC5572(name = "ThreadsKt")
public final class C7789 {

    /* JADX INFO: renamed from: Yue.ۥۢۡۢۧ$ۥ */
    public static final class C1356 extends Thread {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5122<C8107> f23331;

        public C1356(InterfaceC5122<C8107> interfaceC5122) {
            this.f23331 = interfaceC5122;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f23331.invoke();
        }
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ */
    public static final <T> T m3887(ThreadLocal<T> threadLocal, InterfaceC5122<? extends T> interfaceC5122) {
        C5499.m17103(threadLocal, "<this>");
        C5499.m17103(interfaceC5122, "default");
        T t = threadLocal.get();
        if (t != null) {
            return t;
        }
        T tInvoke = interfaceC5122.invoke();
        threadLocal.set(tInvoke);
        return tInvoke;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final Thread m3888(boolean z, boolean z2, @InterfaceC6489 ClassLoader classLoader, @InterfaceC6489 String str, int i, @InterfaceC6399 InterfaceC5122<C8107> interfaceC5122) {
        C5499.m17103(interfaceC5122, "block");
        C1356 c1356 = new C1356(interfaceC5122);
        if (z2) {
            c1356.setDaemon(true);
        }
        if (i > 0) {
            c1356.setPriority(i);
        }
        if (str != null) {
            c1356.setName(str);
        }
        if (classLoader != null) {
            c1356.setContextClassLoader(classLoader);
        }
        if (z) {
            c1356.start();
        }
        return c1356;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ Thread m24747(boolean z, boolean z2, ClassLoader classLoader, String str, int i, InterfaceC5122 interfaceC5122, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        boolean z4 = z2;
        ClassLoader classLoader2 = (i2 & 4) != 0 ? null : classLoader;
        String str2 = (i2 & 8) != 0 ? null : str;
        if ((i2 & 16) != 0) {
            i = -1;
        }
        return m3888(z3, z4, classLoader2, str2, i, interfaceC5122);
    }
}
