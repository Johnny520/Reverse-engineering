package Yue;

import java.util.Arrays;

/* JADX INFO: renamed from: Yue.ۥۡۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nSegment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Segment.kt\nokio/Segment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
public final class C7275 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1220 f21947 = new C1220(null);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f21948 = 8192;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f21949 = 1024;

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    @InterfaceC5568
    public final byte[] f2778;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC5568
    public int f2779;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC5568
    public int f21950;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC5568
    public boolean f21951;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC5568
    public boolean f21952;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC5568
    @InterfaceC6489
    public C7275 f21953;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC5568
    @InterfaceC6489
    public C7275 f21954;

    /* JADX INFO: renamed from: Yue.ۥۡۧۨ$ۥ */
    public static final class C1220 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۡۧۨ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1220(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1220() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7275() {
        this.f2778 = new byte[8192];
        this.f21952 = true;
        this.f21951 = false;
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m3539() {
        int i;
        C7275 c7275 = this.f21954;
        if (c7275 == this) {
            throw new IllegalStateException("cannot compact".toString());
        }
        C5499.m17100(c7275);
        if (c7275.f21952) {
            int i2 = this.f21950 - this.f2779;
            C7275 c72752 = this.f21954;
            C5499.m17100(c72752);
            int i3 = 8192 - c72752.f21950;
            C7275 c72753 = this.f21954;
            C5499.m17100(c72753);
            if (c72753.f21951) {
                i = 0;
            } else {
                C7275 c72754 = this.f21954;
                C5499.m17100(c72754);
                i = c72754.f2779;
            }
            if (i2 > i3 + i) {
                return;
            }
            C7275 c72755 = this.f21954;
            C5499.m17100(c72755);
            m22730(c72755, i2);
            m3540();
            C7278.m22744(this);
        }
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public final C7275 m3540() {
        C7275 c7275 = this.f21953;
        if (c7275 == this) {
            c7275 = null;
        }
        C7275 c72752 = this.f21954;
        C5499.m17100(c72752);
        c72752.f21953 = this.f21953;
        C7275 c72753 = this.f21953;
        C5499.m17100(c72753);
        c72753.f21954 = this.f21954;
        this.f21953 = null;
        this.f21954 = null;
        return c7275;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C7275 m22726(@InterfaceC6399 C7275 c7275) {
        C5499.m17103(c7275, "segment");
        c7275.f21954 = this;
        c7275.f21953 = this.f21953;
        C7275 c72752 = this.f21953;
        C5499.m17100(c72752);
        c72752.f21954 = c7275;
        this.f21953 = c7275;
        return c7275;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final C7275 m22727() {
        this.f21951 = true;
        return new C7275(this.f2778, this.f2779, this.f21950, true, false);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final C7275 m22728(int i) {
        C7275 c7275M22745;
        if (i <= 0 || i > this.f21950 - this.f2779) {
            throw new IllegalArgumentException("byteCount out of range".toString());
        }
        if (i >= 1024) {
            c7275M22745 = m22727();
        } else {
            c7275M22745 = C7278.m22745();
            byte[] bArr = this.f2778;
            byte[] bArr2 = c7275M22745.f2778;
            int i2 = this.f2779;
            C3404.m7132(bArr, bArr2, 0, i2, i2 + i, 2, null);
        }
        c7275M22745.f21950 = c7275M22745.f2779 + i;
        this.f2779 += i;
        C7275 c7275 = this.f21954;
        C5499.m17100(c7275);
        c7275.m22726(c7275M22745);
        return c7275M22745;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final C7275 m22729() {
        byte[] bArr = this.f2778;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        C5499.m17102(bArrCopyOf, "copyOf(this, size)");
        return new C7275(bArrCopyOf, this.f2779, this.f21950, false, true);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m22730(@InterfaceC6399 C7275 c7275, int i) {
        C5499.m17103(c7275, "sink");
        if (!c7275.f21952) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i2 = c7275.f21950;
        if (i2 + i > 8192) {
            if (c7275.f21951) {
                throw new IllegalArgumentException();
            }
            int i3 = c7275.f2779;
            if ((i2 + i) - i3 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = c7275.f2778;
            C3404.m7132(bArr, bArr, 0, i3, i2, 2, null);
            c7275.f21950 -= c7275.f2779;
            c7275.f2779 = 0;
        }
        byte[] bArr2 = this.f2778;
        byte[] bArr3 = c7275.f2778;
        int i4 = c7275.f21950;
        int i5 = this.f2779;
        C3404.m7123(bArr2, bArr3, i4, i5, i5 + i);
        c7275.f21950 += i;
        this.f2779 += i;
    }

    public C7275(@InterfaceC6399 byte[] bArr, int i, int i2, boolean z, boolean z2) {
        C5499.m17103(bArr, "data");
        this.f2778 = bArr;
        this.f2779 = i;
        this.f21950 = i2;
        this.f21951 = z;
        this.f21952 = z2;
    }
}
