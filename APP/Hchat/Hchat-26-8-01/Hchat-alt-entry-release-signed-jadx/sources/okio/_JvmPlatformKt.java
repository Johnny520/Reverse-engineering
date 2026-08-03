package okio;

import java.util.concurrent.locks.ReentrantLock;
import p085fg.InterfaceC1220a;
import p218og.AbstractC3137a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class _JvmPlatformKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final byte[] asUtf8ToByteArray(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(AbstractC3137a.f10177a);
        bytes.getClass();
        return bytes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ReentrantLock newLock() {
        return new ReentrantLock();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String toUtf8String(byte[] bArr) {
        bArr.getClass();
        return new String(bArr, AbstractC3137a.f10177a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final <T> T withLock(ReentrantLock reentrantLock, InterfaceC1220a interfaceC1220a) {
        reentrantLock.getClass();
        interfaceC1220a.getClass();
        reentrantLock.lock();
        try {
            return (T) interfaceC1220a.invoke();
        } finally {
            reentrantLock.unlock();
        }
    }
}
