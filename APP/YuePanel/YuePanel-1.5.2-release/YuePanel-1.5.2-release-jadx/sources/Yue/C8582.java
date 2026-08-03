package Yue;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: Yue.ۥۢۦۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C8582 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final byte[] m4551(@InterfaceC6399 String str) {
        C5499.m17103(str, "<this>");
        byte[] bytes = str.getBytes(C3794.f505);
        C5499.m17102(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final ReentrantLock m4552() {
        return new ReentrantLock();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String m28586(@InterfaceC6399 byte[] bArr) {
        C5499.m17103(bArr, "<this>");
        return new String(bArr, C3794.f505);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> T m28587(@InterfaceC6399 ReentrantLock reentrantLock, @InterfaceC6399 InterfaceC5122<? extends T> interfaceC5122) {
        C5499.m17103(reentrantLock, "<this>");
        C5499.m17103(interfaceC5122, "action");
        reentrantLock.lock();
        try {
            return interfaceC5122.invoke();
        } finally {
            C5437.m16930(1);
            reentrantLock.unlock();
            C5437.m16929(1);
        }
    }
}
