package Yue;

import Yue.C5256;
import java.io.IOException;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5257 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0689 f12536 = new C0689(null);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f12537 = 262144;

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final InterfaceC3604 f1372;

    /* JADX INFO: renamed from: ۥ۟ */
    public long f1373;

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۤۢ$ۥ */
    public static final class C0689 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣ۠ۤۢ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0689(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0689() {
        }
    }

    public C5257(@InterfaceC6399 InterfaceC3604 interfaceC3604) {
        C5499.m17103(interfaceC3604, "source");
        this.f1372 = interfaceC3604;
        this.f1373 = 262144L;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public final InterfaceC3604 m2025() {
        return this.f1372;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public final C5256 m2026() throws IOException {
        C5256.C0687 c0687 = new C5256.C0687();
        while (true) {
            String strM16141 = m16141();
            if (strM16141.length() == 0) {
                return c0687.m16126();
            }
            c0687.m16123(strM16141);
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final String m16141() throws IOException {
        String strMo9634 = this.f1372.mo9634(this.f1373);
        this.f1373 -= (long) strMo9634.length();
        return strMo9634;
    }
}
