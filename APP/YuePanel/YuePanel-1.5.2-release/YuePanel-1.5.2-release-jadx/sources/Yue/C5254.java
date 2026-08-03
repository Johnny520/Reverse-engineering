package Yue;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5254 extends AbstractC5068 implements InterfaceC7506 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0685 f12518 = new C0685(null);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6489
    public final MessageDigest f12519;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6489
    public final Mac f12520;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۢ۠$ۥ */
    public static final class C0685 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۠ۤۢ۠.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0685(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ */
        public final C5254 m2015(@InterfaceC6399 InterfaceC7506 interfaceC7506, @InterfaceC6399 C3630 c3630) {
            C5499.m17103(interfaceC7506, "source");
            C5499.m17103(c3630, C6659.f17103);
            return new C5254(interfaceC7506, c3630, "HmacSHA1");
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟ */
        public final C5254 m2016(@InterfaceC6399 InterfaceC7506 interfaceC7506, @InterfaceC6399 C3630 c3630) {
            C5499.m17103(interfaceC7506, "source");
            C5499.m17103(c3630, C6659.f17103);
            return new C5254(interfaceC7506, c3630, "HmacSHA256");
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C5254 m16102(@InterfaceC6399 InterfaceC7506 interfaceC7506, @InterfaceC6399 C3630 c3630) {
            C5499.m17103(interfaceC7506, "source");
            C5499.m17103(c3630, C6659.f17103);
            return new C5254(interfaceC7506, c3630, "HmacSHA512");
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final C5254 m16103(@InterfaceC6399 InterfaceC7506 interfaceC7506) {
            C5499.m17103(interfaceC7506, "source");
            return new C5254(interfaceC7506, "MD5");
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final C5254 m16104(@InterfaceC6399 InterfaceC7506 interfaceC7506) {
            C5499.m17103(interfaceC7506, "source");
            return new C5254(interfaceC7506, "SHA-1");
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final C5254 m16105(@InterfaceC6399 InterfaceC7506 interfaceC7506) {
            C5499.m17103(interfaceC7506, "source");
            return new C5254(interfaceC7506, "SHA-256");
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final C5254 m16106(@InterfaceC6399 InterfaceC7506 interfaceC7506) {
            C5499.m17103(interfaceC7506, "source");
            return new C5254(interfaceC7506, "SHA-512");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0685() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5254(@InterfaceC6399 InterfaceC7506 interfaceC7506, @InterfaceC6399 MessageDigest messageDigest) {
        super(interfaceC7506);
        C5499.m17103(interfaceC7506, "source");
        C5499.m17103(messageDigest, "digest");
        this.f12519 = messageDigest;
        this.f12520 = null;
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final C5254 m16093(@InterfaceC6399 InterfaceC7506 interfaceC7506, @InterfaceC6399 C3630 c3630) {
        return f12518.m2015(interfaceC7506, c3630);
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final C5254 m16094(@InterfaceC6399 InterfaceC7506 interfaceC7506, @InterfaceC6399 C3630 c3630) {
        return f12518.m2016(interfaceC7506, c3630);
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final C5254 m16095(@InterfaceC6399 InterfaceC7506 interfaceC7506, @InterfaceC6399 C3630 c3630) {
        return f12518.m16102(interfaceC7506, c3630);
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final C5254 m16096(@InterfaceC6399 InterfaceC7506 interfaceC7506) {
        return f12518.m16103(interfaceC7506);
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final C5254 m16097(@InterfaceC6399 InterfaceC7506 interfaceC7506) {
        return f12518.m16104(interfaceC7506);
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final C5254 m16098(@InterfaceC6399 InterfaceC7506 interfaceC7506) {
        return f12518.m16105(interfaceC7506);
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final C5254 m16099(@InterfaceC6399 InterfaceC7506 interfaceC7506) {
        return f12518.m16106(interfaceC7506);
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "hash", imports = {}))
    @InterfaceC5572(name = "-deprecated_hash")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final C3630 m16100() {
        return m16101();
    }

    @InterfaceC6399
    @InterfaceC5572(name = "hash")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final C3630 m16101() {
        byte[] bArrDoFinal;
        MessageDigest messageDigest = this.f12519;
        if (messageDigest != null) {
            bArrDoFinal = messageDigest.digest();
        } else {
            Mac mac = this.f12520;
            C5499.m17100(mac);
            bArrDoFinal = mac.doFinal();
        }
        C5499.m17100(bArrDoFinal);
        return new C3630(bArrDoFinal);
    }

    @Override // Yue.AbstractC5068, Yue.InterfaceC7506
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public long mo9103(@InterfaceC6399 C3600 c3600, long j) throws IOException {
        C5499.m17103(c3600, "sink");
        long jMo9103 = super.mo9103(c3600, j);
        if (jMo9103 != -1) {
            long jM9684 = c3600.m9684() - jMo9103;
            long jM96842 = c3600.m9684();
            C7275 c7275 = c3600.f6209;
            C5499.m17100(c7275);
            while (jM96842 > jM9684) {
                c7275 = c7275.f21954;
                C5499.m17100(c7275);
                jM96842 -= (long) (c7275.f21950 - c7275.f2779);
            }
            while (jM96842 < c3600.m9684()) {
                int i = (int) ((((long) c7275.f2779) + jM9684) - jM96842);
                MessageDigest messageDigest = this.f12519;
                if (messageDigest != null) {
                    messageDigest.update(c7275.f2778, i, c7275.f21950 - i);
                } else {
                    Mac mac = this.f12520;
                    C5499.m17100(mac);
                    mac.update(c7275.f2778, i, c7275.f21950 - i);
                }
                jM96842 += (long) (c7275.f21950 - c7275.f2779);
                c7275 = c7275.f21953;
                C5499.m17100(c7275);
                jM9684 = jM96842;
            }
        }
        return jMo9103;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5254(@InterfaceC6399 InterfaceC7506 interfaceC7506, @InterfaceC6399 String str) throws NoSuchAlgorithmException {
        C5499.m17103(interfaceC7506, "source");
        C5499.m17103(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        C5499.m17102(messageDigest, "getInstance(...)");
        this(interfaceC7506, messageDigest);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5254(@InterfaceC6399 InterfaceC7506 interfaceC7506, @InterfaceC6399 Mac mac) {
        super(interfaceC7506);
        C5499.m17103(interfaceC7506, "source");
        C5499.m17103(mac, "mac");
        this.f12520 = mac;
        this.f12519 = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5254(@InterfaceC6399 InterfaceC7506 interfaceC7506, @InterfaceC6399 C3630 c3630, @InterfaceC6399 String str) throws NoSuchAlgorithmException {
        C5499.m17103(interfaceC7506, "source");
        C5499.m17103(c3630, C6659.f17103);
        C5499.m17103(str, "algorithm");
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(c3630.mo9861(), str));
            C8107 c8107 = C8107.f3222;
            C5499.m17100(mac);
            this(interfaceC7506, mac);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
