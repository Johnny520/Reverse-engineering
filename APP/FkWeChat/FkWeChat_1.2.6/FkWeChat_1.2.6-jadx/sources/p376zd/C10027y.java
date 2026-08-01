package p376zd;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: zd.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10027y extends AbstractC10015s implements InterfaceC10020u0 {

    /* JADX INFO: renamed from: s */
    public static final a f33641s = new a(null);

    /* JADX INFO: renamed from: q */
    public final MessageDigest f33642q;

    /* JADX INFO: renamed from: r */
    public final Mac f33643r;

    /* JADX WARN: Illegal instructions before constructor call */
    public C10027y(InterfaceC10020u0 interfaceC10020u0, String str) throws NoSuchAlgorithmException {
        interfaceC10020u0.getClass();
        str.getClass();
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.getClass();
        this(interfaceC10020u0, messageDigest);
    }

    /* JADX INFO: renamed from: c */
    public final C10003m m38847c() {
        byte[] bArrDoFinal;
        MessageDigest messageDigest = this.f33642q;
        if (messageDigest != null) {
            bArrDoFinal = messageDigest.digest();
        } else {
            Mac mac = this.f33643r;
            mac.getClass();
            bArrDoFinal = mac.doFinal();
        }
        bArrDoFinal.getClass();
        return new C10003m(bArrDoFinal);
    }

    @Override // p376zd.AbstractC10015s, p376zd.InterfaceC10020u0
    public void write(C9995i c9995i, long j10) {
        c9995i.getClass();
        AbstractC9978b.m38615b(c9995i.size(), 0L, j10);
        C10012q0 c10012q0 = c9995i.f33561q;
        c10012q0.getClass();
        long j11 = 0;
        while (j11 < j10) {
            int iMin = (int) Math.min(j10 - j11, c10012q0.f33618c - c10012q0.f33617b);
            MessageDigest messageDigest = this.f33642q;
            if (messageDigest != null) {
                messageDigest.update(c10012q0.f33616a, c10012q0.f33617b, iMin);
            } else {
                Mac mac = this.f33643r;
                mac.getClass();
                mac.update(c10012q0.f33616a, c10012q0.f33617b, iMin);
            }
            j11 += (long) iMin;
            c10012q0 = c10012q0.f33621f;
            c10012q0.getClass();
        }
        super.write(c9995i, j10);
    }

    /* JADX INFO: renamed from: zd.y$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C10027y m38848a(InterfaceC10020u0 interfaceC10020u0) {
            interfaceC10020u0.getClass();
            return new C10027y(interfaceC10020u0, "SHA-256");
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10027y(InterfaceC10020u0 interfaceC10020u0, MessageDigest messageDigest) {
        super(interfaceC10020u0);
        interfaceC10020u0.getClass();
        messageDigest.getClass();
        this.f33642q = messageDigest;
        this.f33643r = null;
    }
}
