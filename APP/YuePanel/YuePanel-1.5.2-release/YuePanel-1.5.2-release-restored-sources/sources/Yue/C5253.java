package Yue;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nHashingSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HashingSink.kt\nokio/HashingSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,148:1\n86#2:149\n*S KotlinDebug\n*F\n+ 1 HashingSink.kt\nokio/HashingSink\n*L\n75#1:149\n*E\n"})
public final class C5253 extends AbstractC5067 implements InterfaceC7472 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0684 f12515 = new C0684(null);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6489
    public final MessageDigest f12516;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6489
    public final Mac f12517;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۢ۟$ۥ */
    public static final class C0684 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۠ۤۢ۟.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0684(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ */
        public final C5253 m2013(@InterfaceC6399 InterfaceC7472 interfaceC7472, @InterfaceC6399 C3630 c3630) {
            C5499.m17103(interfaceC7472, "sink");
            C5499.m17103(c3630, C6659.f17103);
            return new C5253(interfaceC7472, c3630, "HmacSHA1");
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟ */
        public final C5253 m2014(@InterfaceC6399 InterfaceC7472 interfaceC7472, @InterfaceC6399 C3630 c3630) {
            C5499.m17103(interfaceC7472, "sink");
            C5499.m17103(c3630, C6659.f17103);
            return new C5253(interfaceC7472, c3630, "HmacSHA256");
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C5253 m16088(@InterfaceC6399 InterfaceC7472 interfaceC7472, @InterfaceC6399 C3630 c3630) {
            C5499.m17103(interfaceC7472, "sink");
            C5499.m17103(c3630, C6659.f17103);
            return new C5253(interfaceC7472, c3630, "HmacSHA512");
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final C5253 m16089(@InterfaceC6399 InterfaceC7472 interfaceC7472) {
            C5499.m17103(interfaceC7472, "sink");
            return new C5253(interfaceC7472, "MD5");
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final C5253 m16090(@InterfaceC6399 InterfaceC7472 interfaceC7472) {
            C5499.m17103(interfaceC7472, "sink");
            return new C5253(interfaceC7472, "SHA-1");
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final C5253 m16091(@InterfaceC6399 InterfaceC7472 interfaceC7472) {
            C5499.m17103(interfaceC7472, "sink");
            return new C5253(interfaceC7472, "SHA-256");
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final C5253 m16092(@InterfaceC6399 InterfaceC7472 interfaceC7472) {
            C5499.m17103(interfaceC7472, "sink");
            return new C5253(interfaceC7472, "SHA-512");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0684() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5253(@InterfaceC6399 InterfaceC7472 interfaceC7472, @InterfaceC6399 MessageDigest messageDigest) {
        super(interfaceC7472);
        C5499.m17103(interfaceC7472, "sink");
        C5499.m17103(messageDigest, "digest");
        this.f12516 = messageDigest;
        this.f12517 = null;
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final C5253 m16079(@InterfaceC6399 InterfaceC7472 interfaceC7472, @InterfaceC6399 C3630 c3630) {
        return f12515.m2013(interfaceC7472, c3630);
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final C5253 m16080(@InterfaceC6399 InterfaceC7472 interfaceC7472, @InterfaceC6399 C3630 c3630) {
        return f12515.m2014(interfaceC7472, c3630);
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final C5253 m16081(@InterfaceC6399 InterfaceC7472 interfaceC7472, @InterfaceC6399 C3630 c3630) {
        return f12515.m16088(interfaceC7472, c3630);
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final C5253 m16082(@InterfaceC6399 InterfaceC7472 interfaceC7472) {
        return f12515.m16089(interfaceC7472);
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final C5253 m16083(@InterfaceC6399 InterfaceC7472 interfaceC7472) {
        return f12515.m16090(interfaceC7472);
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final C5253 m16084(@InterfaceC6399 InterfaceC7472 interfaceC7472) {
        return f12515.m16091(interfaceC7472);
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final C5253 m16085(@InterfaceC6399 InterfaceC7472 interfaceC7472) {
        return f12515.m16092(interfaceC7472);
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "hash", imports = {}))
    @InterfaceC5572(name = "-deprecated_hash")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final C3630 m16086() {
        return m16087();
    }

    @InterfaceC6399
    @InterfaceC5572(name = "hash")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final C3630 m16087() {
        byte[] bArrDoFinal;
        MessageDigest messageDigest = this.f12516;
        if (messageDigest != null) {
            bArrDoFinal = messageDigest.digest();
        } else {
            Mac mac = this.f12517;
            C5499.m17100(mac);
            bArrDoFinal = mac.doFinal();
        }
        C5499.m17100(bArrDoFinal);
        return new C3630(bArrDoFinal);
    }

    @Override // Yue.AbstractC5067, Yue.InterfaceC7472
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo9102(@InterfaceC6399 C3600 c3600, long j) throws IOException {
        C5499.m17103(c3600, "source");
        C2963.m5677(c3600.m9684(), 0L, j);
        C7275 c7275 = c3600.f6209;
        C5499.m17100(c7275);
        long j2 = 0;
        while (j2 < j) {
            int iMin = (int) Math.min(j - j2, c7275.f21950 - c7275.f2779);
            MessageDigest messageDigest = this.f12516;
            if (messageDigest != null) {
                messageDigest.update(c7275.f2778, c7275.f2779, iMin);
            } else {
                Mac mac = this.f12517;
                C5499.m17100(mac);
                mac.update(c7275.f2778, c7275.f2779, iMin);
            }
            j2 += (long) iMin;
            c7275 = c7275.f21953;
            C5499.m17100(c7275);
        }
        super.mo9102(c3600, j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5253(@InterfaceC6399 InterfaceC7472 interfaceC7472, @InterfaceC6399 String str) throws NoSuchAlgorithmException {
        C5499.m17103(interfaceC7472, "sink");
        C5499.m17103(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        C5499.m17102(messageDigest, "getInstance(...)");
        this(interfaceC7472, messageDigest);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5253(@InterfaceC6399 InterfaceC7472 interfaceC7472, @InterfaceC6399 Mac mac) {
        super(interfaceC7472);
        C5499.m17103(interfaceC7472, "sink");
        C5499.m17103(mac, "mac");
        this.f12517 = mac;
        this.f12516 = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5253(@InterfaceC6399 InterfaceC7472 interfaceC7472, @InterfaceC6399 C3630 c3630, @InterfaceC6399 String str) throws NoSuchAlgorithmException {
        C5499.m17103(interfaceC7472, "sink");
        C5499.m17103(c3630, C6659.f17103);
        C5499.m17103(str, "algorithm");
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(c3630.mo9861(), str));
            C8107 c8107 = C8107.f3222;
            C5499.m17100(mac);
            this(interfaceC7472, mac);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
