package Yue;

import Yue.InterfaceC4225;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4238 extends AbstractC2981 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0365 f8592 = new C0365(null);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final String f8593;

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۧۢ$ۥ */
    public static final class C0365 implements InterfaceC4225.InterfaceC4228<C4238> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۟ۧۧۢ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0365(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0365() {
        }
    }

    public C4238(@InterfaceC6399 String str) {
        super(f8592);
        this.f8593 = str;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static /* synthetic */ C4238 m12185(C4238 c4238, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4238.f8593;
        }
        return c4238.m12187(str);
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4238) && C5499.m17094(this.f8593, ((C4238) obj).f8593);
    }

    public int hashCode() {
        return this.f8593.hashCode();
    }

    @InterfaceC6399
    public String toString() {
        return "CoroutineName(" + this.f8593 + ')';
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public final String m12186() {
        return this.f8593;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public final C4238 m12187(@InterfaceC6399 String str) {
        return new C4238(str);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public final String m12188() {
        return this.f8593;
    }
}
