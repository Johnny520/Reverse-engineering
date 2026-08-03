package Yue;

import Yue.C3630;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5255 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0686 f12521 = new C0686(null);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final C3630 f12522;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f12523 = ":status";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f12524 = ":method";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f12525 = ":path";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f12526 = ":scheme";

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f12527 = ":authority";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final C3630 f12528;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final C3630 f12529;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final C3630 f12530;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final C3630 f12531;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final C3630 f12532;

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    @InterfaceC5568
    public final C3630 f1369;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    @InterfaceC5568
    public final C3630 f1370;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC5568
    public final int f12533;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۢۡ$ۥ */
    public static final class C0686 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۠ۤۢۡ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0686(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0686() {
        }
    }

    static {
        C3630.C0198 c0198 = C3630.f6370;
        f12522 = c0198.m9876(":");
        f12528 = c0198.m9876(f12523);
        f12529 = c0198.m9876(f12524);
        f12530 = c0198.m9876(f12525);
        f12531 = c0198.m9876(f12526);
        f12532 = c0198.m9876(f12527);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5255(@InterfaceC6399 C3630 c3630, @InterfaceC6399 C3630 c36302) {
        C5499.m17103(c3630, "name");
        C5499.m17103(c36302, "value");
        this.f1369 = c3630;
        this.f1370 = c36302;
        this.f12533 = c3630.m9852() + 32 + c36302.m9852();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ C5255 m16107(C5255 c5255, C3630 c3630, C3630 c36302, int i, Object obj) {
        if ((i & 1) != 0) {
            c3630 = c5255.f1369;
        }
        if ((i & 2) != 0) {
            c36302 = c5255.f1370;
        }
        return c5255.m16108(c3630, c36302);
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5255)) {
            return false;
        }
        C5255 c5255 = (C5255) obj;
        return C5499.m17094(this.f1369, c5255.f1369) && C5499.m17094(this.f1370, c5255.f1370);
    }

    public int hashCode() {
        return (this.f1369.hashCode() * 31) + this.f1370.hashCode();
    }

    @InterfaceC6399
    public String toString() {
        return this.f1369.m9862() + ": " + this.f1370.m9862();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public final C3630 m2017() {
        return this.f1369;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public final C3630 m2018() {
        return this.f1370;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C5255 m16108(@InterfaceC6399 C3630 c3630, @InterfaceC6399 C3630 c36302) {
        C5499.m17103(c3630, "name");
        C5499.m17103(c36302, "value");
        return new C5255(c3630, c36302);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5255(@InterfaceC6399 String str, @InterfaceC6399 String str2) {
        C5499.m17103(str, "name");
        C5499.m17103(str2, "value");
        C3630.C0198 c0198 = C3630.f6370;
        this(c0198.m9876(str), c0198.m9876(str2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5255(@InterfaceC6399 C3630 c3630, @InterfaceC6399 String str) {
        this(c3630, C3630.f6370.m9876(str));
        C5499.m17103(c3630, "name");
        C5499.m17103(str, "value");
    }
}
