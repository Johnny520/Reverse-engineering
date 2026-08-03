package Yue;

import java.io.Serializable;

/* JADX INFO: renamed from: Yue.ۥۢۦۣۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nXorWowRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XorWowRandom.kt\nkotlin/random/XorWowRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
public final class C8572 extends AbstractC7000 implements Serializable {

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1551 f25435 = new C1551(null);

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final long f25436 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f25437;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f25438;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f25439;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public int f25440;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f25441;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int f25442;

    /* JADX INFO: renamed from: Yue.ۥۢۦۣۢ$ۥ */
    public static final class C1551 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۢۦۣۢ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1551(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1551() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8572(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f25437 = i;
        this.f25438 = i2;
        this.f25439 = i3;
        this.f25440 = i4;
        this.f25441 = i5;
        this.f25442 = i6;
        if ((i | i2 | i3 | i4 | i5) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
        }
        for (int i7 = 0; i7 < 64; i7++) {
            mo5816();
        }
    }

    @Override // Yue.AbstractC7000
    /* JADX INFO: renamed from: ۥ۟ */
    public int mo67(int i) {
        return C7002.m21628(mo5816(), i);
    }

    @Override // Yue.AbstractC7000
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public int mo5816() {
        int i = this.f25437;
        int i2 = i ^ (i >>> 2);
        this.f25437 = this.f25438;
        this.f25438 = this.f25439;
        this.f25439 = this.f25440;
        int i3 = this.f25441;
        this.f25440 = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.f25441 = i4;
        int i5 = this.f25442 + 362437;
        this.f25442 = i5;
        return i4 + i5;
    }

    public C8572(int i, int i2) {
        this(i, i2, 0, 0, ~i, (i << 10) ^ (i2 >>> 4));
    }
}
