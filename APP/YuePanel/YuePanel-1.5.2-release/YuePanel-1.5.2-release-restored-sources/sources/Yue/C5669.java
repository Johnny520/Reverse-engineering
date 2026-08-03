package Yue;

import java.util.Random;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5669 extends Random {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0834 f13966 = new C0834(null);

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final long f13967 = 0;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final AbstractC7000 f13968;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean f13969;

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۧۦ$ۥ */
    public static final class C0834 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۠ۦۧۦ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0834(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0834() {
        }
    }

    public C5669(@InterfaceC6399 AbstractC7000 abstractC7000) {
        C5499.m17103(abstractC7000, "impl");
        this.f13968 = abstractC7000;
    }

    @Override // java.util.Random
    public int next(int i) {
        return this.f13968.mo67(i);
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return this.f13968.mo5812();
    }

    @Override // java.util.Random
    public void nextBytes(@InterfaceC6399 byte[] bArr) {
        C5499.m17103(bArr, "bytes");
        this.f13968.mo5813(bArr);
    }

    @Override // java.util.Random
    public double nextDouble() {
        return this.f13968.mo5814();
    }

    @Override // java.util.Random
    public float nextFloat() {
        return this.f13968.mo5815();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Random
    public int nextInt() {
        return this.f13968.mo5816();
    }

    @Override // java.util.Random
    public long nextLong() {
        return this.f13968.mo5818();
    }

    @Override // java.util.Random
    public void setSeed(long j) {
        if (this.f13969) {
            throw new UnsupportedOperationException("Setting seed is not supported.");
        }
        this.f13969 = true;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public final AbstractC7000 m2359() {
        return this.f13968;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.Random
    public int nextInt(int i) {
        return this.f13968.mo5817(i);
    }
}
