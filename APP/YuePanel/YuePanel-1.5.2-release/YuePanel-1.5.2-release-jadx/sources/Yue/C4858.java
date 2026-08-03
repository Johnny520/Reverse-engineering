package Yue;

import Yue.InterfaceC7144;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
@Deprecated
public class C4858 {

    /* JADX INFO: renamed from: ۥ */
    public final Context f1182;

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۡۤ$ۥ */
    public class C0511 extends FingerprintManager.AuthenticationCallback {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ AbstractC4859 f1183;

        public C0511(AbstractC4859 abstractC4859) {
            this.f1183 = abstractC4859;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i, CharSequence charSequence) {
            this.f1183.m1761(i, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.f1183.m1762();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            this.f1183.m14869(i, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f1183.m14870(new C4860(C4858.m14859(C0512.m1760(authenticationResult))));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۡۤ$ۥ۟ */
    @InterfaceC7113(23)
    public static class C0512 {
        @InterfaceC4482
        @InterfaceC7118("android.permission.USE_FINGERPRINT")
        /* JADX INFO: renamed from: ۥ */
        public static void m1759(Object obj, Object obj2, CancellationSignal cancellationSignal, int i, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static FingerprintManager.CryptoObject m1760(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static FingerprintManager m14864(Context context) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            return null;
        }

        @InterfaceC4482
        @InterfaceC7118("android.permission.USE_FINGERPRINT")
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static boolean m14865(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        @InterfaceC4482
        @InterfaceC7118("android.permission.USE_FINGERPRINT")
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static boolean m14866(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static C4861 m14867(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new C4861(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new C4861(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new C4861(cryptoObject.getMac());
            }
            return null;
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static FingerprintManager.CryptoObject m14868(C4861 c4861) {
            if (c4861 == null) {
                return null;
            }
            if (c4861.m1764() != null) {
                return new FingerprintManager.CryptoObject(c4861.m1764());
            }
            if (c4861.m14871() != null) {
                return new FingerprintManager.CryptoObject(c4861.m14871());
            }
            if (c4861.m1765() != null) {
                return new FingerprintManager.CryptoObject(c4861.m1765());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۡۤ$ۥ۟۟, reason: contains not printable characters */
    public static abstract class AbstractC4859 {
        /* JADX INFO: renamed from: ۥ */
        public void m1761(int i, @InterfaceC6391 CharSequence charSequence) {
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m1762() {
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m14869(int i, @InterfaceC6391 CharSequence charSequence) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m14870(@InterfaceC6391 C4860 c4860) {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۡۤ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C4860 {

        /* JADX INFO: renamed from: ۥ */
        public final C4861 f1184;

        public C4860(@InterfaceC6391 C4861 c4861) {
            this.f1184 = c4861;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public C4861 m1763() {
            return this.f1184;
        }
    }

    public C4858(Context context) {
        this.f1182 = context;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C4858 m14857(@InterfaceC6391 Context context) {
        return new C4858(context);
    }

    @InterfaceC6490
    @InterfaceC7113(23)
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static FingerprintManager m14858(@InterfaceC6391 Context context) {
        return C0512.m14864(context);
    }

    @InterfaceC7113(23)
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static C4861 m14859(FingerprintManager.CryptoObject cryptoObject) {
        return C0512.m14867(cryptoObject);
    }

    @InterfaceC7113(23)
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static FingerprintManager.AuthenticationCallback m14860(AbstractC4859 abstractC4859) {
        return new C0511(abstractC4859);
    }

    @InterfaceC7113(23)
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static FingerprintManager.CryptoObject m14861(C4861 c4861) {
        return C0512.m14868(c4861);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC7118("android.permission.USE_FINGERPRINT")
    @Deprecated
    /* JADX INFO: renamed from: ۥ */
    public void m1757(@InterfaceC6490 C4861 c4861, int i, @InterfaceC6490 C3674 c3674, @InterfaceC6391 AbstractC4859 abstractC4859, @InterfaceC6490 Handler handler) {
        m1758(c4861, i, c3674 != null ? (CancellationSignal) c3674.m742() : null, abstractC4859, handler);
    }

    @InterfaceC7118("android.permission.USE_FINGERPRINT")
    /* JADX INFO: renamed from: ۥ۟ */
    public void m1758(@InterfaceC6490 C4861 c4861, int i, @InterfaceC6490 CancellationSignal cancellationSignal, @InterfaceC6391 AbstractC4859 abstractC4859, @InterfaceC6490 Handler handler) {
        FingerprintManager fingerprintManagerM14858 = m14858(this.f1182);
        if (fingerprintManagerM14858 != null) {
            C0512.m1759(fingerprintManagerM14858, m14861(c4861), cancellationSignal, i, m14860(abstractC4859), handler);
        }
    }

    @InterfaceC7118("android.permission.USE_FINGERPRINT")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean m14862() {
        FingerprintManager fingerprintManagerM14858 = m14858(this.f1182);
        return fingerprintManagerM14858 != null && C0512.m14865(fingerprintManagerM14858);
    }

    @InterfaceC7118("android.permission.USE_FINGERPRINT")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m14863() {
        FingerprintManager fingerprintManagerM14858 = m14858(this.f1182);
        return fingerprintManagerM14858 != null && C0512.m14866(fingerprintManagerM14858);
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۡۤ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C4861 {

        /* JADX INFO: renamed from: ۥ */
        public final Signature f1185;

        /* JADX INFO: renamed from: ۥ۟ */
        public final Cipher f1186;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Mac f11136;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C4861(@InterfaceC6391 Signature signature) {
            this.f1185 = signature;
            this.f1186 = null;
            this.f11136 = null;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ */
        public Cipher m1764() {
            return this.f1186;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟ */
        public Mac m1765() {
            return this.f11136;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Signature m14871() {
            return this.f1185;
        }

        public C4861(@InterfaceC6391 Cipher cipher) {
            this.f1186 = cipher;
            this.f1185 = null;
            this.f11136 = null;
        }

        public C4861(@InterfaceC6391 Mac mac) {
            this.f11136 = mac;
            this.f1186 = null;
            this.f1185 = null;
        }
    }
}
