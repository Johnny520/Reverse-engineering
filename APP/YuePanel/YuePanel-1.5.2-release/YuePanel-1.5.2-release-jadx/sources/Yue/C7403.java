package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۨۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7403 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1251 f22353 = new C1251(null);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f22354 = 65535;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f22355 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f22356 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f22357 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f22358 = 5;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f22359 = 6;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f22360 = 7;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f22361 = 10;

    /* JADX INFO: renamed from: ۥ */
    public int f2851;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final int[] f2852 = new int[10];

    /* JADX INFO: renamed from: Yue.ۥۡۨۥۦ$ۥ */
    public static final class C1251 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۡۨۥۦ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1251(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1251() {
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m3604() {
        this.f2851 = 0;
        C3404.m7199(this.f2852, 0, 0, 0, 6, null);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final int m3605(int i) {
        return this.f2852[i];
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m23174(boolean z) {
        return (this.f2851 & 4) != 0 ? this.f2852[2] == 1 : z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final int m23175() {
        if ((this.f2851 & 2) != 0) {
            return this.f2852[1];
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int m23176() {
        if ((this.f2851 & 128) != 0) {
            return this.f2852[7];
        }
        return 65535;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int m23177() {
        if ((this.f2851 & 16) != 0) {
            return this.f2852[4];
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final int m23178(int i) {
        return (this.f2851 & 32) != 0 ? this.f2852[5] : i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final int m23179(int i) {
        return (this.f2851 & 64) != 0 ? this.f2852[6] : i;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final boolean m23180(int i) {
        return ((1 << i) & this.f2851) != 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m23181(@InterfaceC6399 C7403 c7403) {
        C5499.m17103(c7403, "other");
        for (int i = 0; i < 10; i++) {
            if (c7403.m23180(i)) {
                m23182(i, c7403.m3605(i));
            }
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final C7403 m23182(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f2852;
            if (i < iArr.length) {
                this.f2851 = (1 << i) | this.f2851;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final int m23183() {
        return Integer.bitCount(this.f2851);
    }
}
