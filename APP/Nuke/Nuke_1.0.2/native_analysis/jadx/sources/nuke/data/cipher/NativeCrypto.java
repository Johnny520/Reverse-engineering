package nuke.data.cipher;

import android.os.Looper;
import java.util.concurrent.locks.ReentrantLock;
import p000.C0385kf;
import p000.C0676s;
import p000.C0727ta;
import p000.RunnableC0446m2;
import p000.am1;
import p000.n31;
import p000.t11;
import p000.tp0;
import p000.wv2;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class NativeCrypto {
    public static final int $stable = 0;
    public static final NativeCrypto INSTANCE = new NativeCrypto();

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

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean warmUpAsync$lambda$0() {
        return nativeIsConfigured() && nativeKid().length() > 0;
    }

    public final boolean activateEngineDirect$app(int i, String str, long j, String str2, byte[] bArr) {
        str.getClass();
        str2.getClass();
        return nativeActivateEngine(i, str, j, str2, bArr);
    }

    public final boolean attestModuleFromRuntime$app() {
        byte[] bArr = tp0.m5370r().f7214a;
        if (bArr == null) {
            bArr = new byte[0];
        }
        return nativeAttestModule(bArr);
    }

    public final String confDecrypt(String str) {
        str.getClass();
        ThreadLocal threadLocal = am1.f250a;
        return (String) am1.m202b("confDecrypt", new C0385kf(str, 2));
    }

    public final String confEncrypt(String str) {
        str.getClass();
        ThreadLocal threadLocal = am1.f250a;
        return (String) am1.m202b("confEncrypt", new C0385kf(str, 3));
    }

    public final String confKeyName(String str) {
        str.getClass();
        ThreadLocal threadLocal = am1.f250a;
        return (String) am1.m202b("confKeyName", new C0385kf(str, 1));
    }

    public final long engineGenerationDirect$app() {
        return nativeEngineGeneration();
    }

    public final boolean isConfigured() {
        ThreadLocal threadLocal = am1.f250a;
        return ((Boolean) am1.m202b("isConfigured", new n31(19))).booleanValue();
    }

    public final String kid() {
        ThreadLocal threadLocal = am1.f250a;
        return (String) am1.m202b("kid", new n31(21));
    }

    public final byte[] prepareActivationDirect$app(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        return nativePrepareActivation(bArr, bArr2);
    }

    public final void prepareModuleAttestationForActivation$app() {
        byte[] bArr = tp0.m5370r().f7214a;
        if (bArr == null) {
            bArr = new byte[0];
        }
        nativeAttestModule(bArr);
    }

    public final boolean selfTest() {
        ThreadLocal threadLocal = am1.f250a;
        return ((Boolean) am1.m202b("selfTest", new n31(20))).booleanValue();
    }

    public final String syncClient(String str) {
        String strNativeSignClientPayload;
        str.getClass();
        ThreadLocal threadLocal = am1.f250a;
        ThreadLocal threadLocal2 = am1.f250a;
        if (t11.m5086l(Looper.myLooper(), Looper.getMainLooper())) {
            C0676s.m4653l("Native call 'syncClient' attempted on main thread");
            return null;
        }
        ReentrantLock reentrantLock = am1.f252c;
        reentrantLock.lock();
        try {
            Boolean bool = (Boolean) threadLocal2.get();
            threadLocal2.set(Boolean.TRUE);
            try {
                am1.m203c();
                am1.m204d(false, null);
                try {
                    strNativeSignClientPayload = nativeSignClientPayload(str);
                } catch (IllegalStateException e) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    if (!wv2.m6012d0(message, "NATIVE_UPDATE_REQUIRED:", false)) {
                        throw e;
                    }
                    am1.m204d(true, null);
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

    public final void warmUpAsync() {
        am1.f253d.submit(new RunnableC0446m2(8, new C0727ta(15, new n31(18)))).getClass();
    }
}
