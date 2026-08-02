package nuke.data.cipher;

import android.os.Looper;
import defpackage.am1;
import defpackage.kf;
import defpackage.m2;
import defpackage.n31;
import defpackage.s;
import defpackage.t11;
import defpackage.ta;
import defpackage.tp0;
import defpackage.wv2;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class NativeCrypto {
    public static final int $stable = 0;
    public static final NativeCrypto INSTANCE = new NativeCrypto();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private NativeCrypto() {
    }

    private static final native boolean nativeActivateEngine(int i, String str, long j, String str2, byte[] bArr);

    private static final native boolean nativeAttestModule(byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native String nativeConfDecrypt(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native String nativeConfEncrypt(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native String nativeConfKeyName(String str);

    private static final native long nativeEngineGeneration();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean nativeIsConfigured();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native String nativeKid();

    private static final native byte[] nativePrepareActivation(byte[] bArr, byte[] bArr2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean nativeSelfTest();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native String nativeSignClientPayload(String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean warmUpAsync$lambda$0() {
        return nativeIsConfigured() && nativeKid().length() > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean activateEngineDirect$app(int i, String str, long j, String str2, byte[] bArr) {
        str.getClass();
        str2.getClass();
        return nativeActivateEngine(i, str, j, str2, bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean attestModuleFromRuntime$app() {
        byte[] bArr = tp0.r().a;
        if (bArr == null) {
            bArr = new byte[0];
        }
        return nativeAttestModule(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String confDecrypt(String str) {
        str.getClass();
        ThreadLocal threadLocal = am1.a;
        return (String) am1.b("confDecrypt", new kf(str, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String confEncrypt(String str) {
        str.getClass();
        ThreadLocal threadLocal = am1.a;
        return (String) am1.b("confEncrypt", new kf(str, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String confKeyName(String str) {
        str.getClass();
        ThreadLocal threadLocal = am1.a;
        return (String) am1.b("confKeyName", new kf(str, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long engineGenerationDirect$app() {
        return nativeEngineGeneration();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isConfigured() {
        ThreadLocal threadLocal = am1.a;
        return ((Boolean) am1.b("isConfigured", new n31(19))).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String kid() {
        ThreadLocal threadLocal = am1.a;
        return (String) am1.b("kid", new n31(21));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte[] prepareActivationDirect$app(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        return nativePrepareActivation(bArr, bArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void prepareModuleAttestationForActivation$app() {
        byte[] bArr = tp0.r().a;
        if (bArr == null) {
            bArr = new byte[0];
        }
        nativeAttestModule(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean selfTest() {
        ThreadLocal threadLocal = am1.a;
        return ((Boolean) am1.b("selfTest", new n31(20))).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String syncClient(String str) {
        String strNativeSignClientPayload;
        str.getClass();
        ThreadLocal threadLocal = am1.a;
        ThreadLocal threadLocal2 = am1.a;
        if (t11.l(Looper.myLooper(), Looper.getMainLooper())) {
            s.l("Native call 'syncClient' attempted on main thread");
            return null;
        }
        ReentrantLock reentrantLock = am1.c;
        reentrantLock.lock();
        try {
            Boolean bool = (Boolean) threadLocal2.get();
            threadLocal2.set(Boolean.TRUE);
            try {
                am1.c();
                am1.d(false, null);
                try {
                    strNativeSignClientPayload = nativeSignClientPayload(str);
                } catch (IllegalStateException e) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    if (!wv2.d0(message, "NATIVE_UPDATE_REQUIRED:", false)) {
                        throw e;
                    }
                    am1.d(true, null);
                    strNativeSignClientPayload = nativeSignClientPayload(str);
                }
                return strNativeSignClientPayload;
            } finally {
                threadLocal2.set(bool);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void warmUpAsync() {
        am1.d.submit(new m2(8, new ta(15, new n31(18)))).getClass();
    }
}
