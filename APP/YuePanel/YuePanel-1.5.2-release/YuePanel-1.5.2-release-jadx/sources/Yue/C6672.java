package Yue;

import java.io.Serializable;
import java.util.Random;

/* JADX INFO: renamed from: Yue.ۥۡۤۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6672 extends AbstractC2999 implements Serializable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1056 f17139 = new C1056(null);

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final long f17140 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public final Random f17141;

    /* JADX INFO: renamed from: Yue.ۥۡۤۡۦ$ۥ */
    public static final class C1056 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۡۤۡۦ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1056(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1056() {
        }
    }

    public C6672(@InterfaceC6399 Random random) {
        C5499.m17103(random, "impl");
        this.f17141 = random;
    }

    @Override // Yue.AbstractC2999
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public Random mo5819() {
        return this.f17141;
    }
}
