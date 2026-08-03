package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۦۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7189 {
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final byte[] m27674(@Yue.InterfaceC4418 java.lang.String r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.nio.charset.Charset r0 = Yue.C1099.f3261
            byte[] r1 = r1.getBytes(r0)
            java.lang.String r0 = "this as java.lang.String).getBytes(charset)"
            Yue.C3329.m13905(r1, r0)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.util.concurrent.locks.ReentrantLock m27675() {
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String m27676(@Yue.InterfaceC4418 byte[] r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = Yue.C1099.f3261
            r0.<init>(r2, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> T m27677(@Yue.InterfaceC4418 java.util.concurrent.locks.ReentrantLock r1, @Yue.InterfaceC4418 Yue.InterfaceC2823<? extends T> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "action"
            Yue.C3329.m13906(r2, r0)
            r1.lock()
            r0 = 1
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L1c
            Yue.C3249.m13687(r0)
            r1.unlock()
            Yue.C3249.m13686(r0)
            return r2
        L1c:
            r2 = move-exception
            Yue.C3249.m13687(r0)
            r1.unlock()
            Yue.C3249.m13686(r0)
            throw r2
    }
}
