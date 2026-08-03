package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nPlatformRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformRandom.kt\nkotlin/random/AbstractPlatformRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
public abstract class AbstractC0072 extends Yue.AbstractC5185 {
    public AbstractC0072() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // Yue.AbstractC5185
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int mo435(int r2) {
            r1 = this;
            java.util.Random r0 = r1.mo443()
            int r0 = r0.nextInt()
            int r2 = Yue.C5188.m19471(r0, r2)
            return r2
    }

    @Override // Yue.AbstractC5185
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean mo436() {
            r1 = this;
            java.util.Random r0 = r1.mo443()
            boolean r0 = r0.nextBoolean()
            return r0
    }

    @Override // Yue.AbstractC5185
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public byte[] mo437(@Yue.InterfaceC4418 byte[] r2) {
            r1 = this;
            java.lang.String r0 = "array"
            Yue.C3329.m13906(r2, r0)
            java.util.Random r0 = r1.mo443()
            r0.nextBytes(r2)
            return r2
    }

    @Override // Yue.AbstractC5185
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public double mo438() {
            r2 = this;
            java.util.Random r0 = r2.mo443()
            double r0 = r0.nextDouble()
            return r0
    }

    @Override // Yue.AbstractC5185
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public float mo439() {
            r1 = this;
            java.util.Random r0 = r1.mo443()
            float r0 = r0.nextFloat()
            return r0
    }

    @Override // Yue.AbstractC5185
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int mo440() {
            r1 = this;
            java.util.Random r0 = r1.mo443()
            int r0 = r0.nextInt()
            return r0
    }

    @Override // Yue.AbstractC5185
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int mo441(int r2) {
            r1 = this;
            java.util.Random r0 = r1.mo443()
            int r2 = r0.nextInt(r2)
            return r2
    }

    @Override // Yue.AbstractC5185
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public long mo442() {
            r2 = this;
            java.util.Random r0 = r2.mo443()
            long r0 = r0.nextLong()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public abstract java.util.Random mo443();
}
