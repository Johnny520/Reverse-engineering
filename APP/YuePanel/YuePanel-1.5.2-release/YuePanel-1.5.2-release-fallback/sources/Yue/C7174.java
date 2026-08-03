package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۦۣۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nXorWowRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XorWowRandom.kt\nkotlin/random/XorWowRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
public final class C7174 extends Yue.AbstractC5185 implements java.io.Serializable {

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C7174.C7175 f24756 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final long f24757 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f24758;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f24759;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f24760;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public int f24761;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f24762;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int f24763;

    /* JADX INFO: renamed from: Yue.ۥۢۦۣۢ$ۥ, reason: contains not printable characters */
    public static final class C7175 {
        public C7175() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C7175(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            Yue.ۥۢۦۣۢ$ۥ r0 = new Yue.ۥۢۦۣۢ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C7174.f24756 = r0
            return
    }

    public C7174(int r8, int r9) {
            r7 = this;
            int r5 = ~r8
            int r0 = r8 << 10
            int r1 = r9 >>> 4
            r6 = r0 ^ r1
            r3 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public C7174(int r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.f24758 = r1
            r0.f24759 = r2
            r0.f24760 = r3
            r0.f24761 = r4
            r0.f24762 = r5
            r0.f24763 = r6
            r1 = r1 | r2
            r1 = r1 | r3
            r1 = r1 | r4
            r1 = r1 | r5
            if (r1 == 0) goto L21
            r1 = 0
        L16:
            r2 = 64
            if (r1 >= r2) goto L20
            r0.mo440()
            int r1 = r1 + 1
            goto L16
        L20:
            return
        L21:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Initial state must have at least one non-zero element."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Override // Yue.AbstractC5185
    /* JADX INFO: renamed from: ۥ۟ */
    public int mo435(int r2) {
            r1 = this;
            int r0 = r1.mo440()
            int r2 = Yue.C5188.m19471(r0, r2)
            return r2
    }

    @Override // Yue.AbstractC5185
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public int mo440() {
            r3 = this;
            int r0 = r3.f24758
            int r1 = r0 >>> 2
            r0 = r0 ^ r1
            int r1 = r3.f24759
            r3.f24758 = r1
            int r1 = r3.f24760
            r3.f24759 = r1
            int r1 = r3.f24761
            r3.f24760 = r1
            int r1 = r3.f24762
            r3.f24761 = r1
            int r2 = r0 << 1
            r0 = r0 ^ r2
            r0 = r0 ^ r1
            int r1 = r1 << 4
            r0 = r0 ^ r1
            r3.f24762 = r0
            int r1 = r3.f24763
            r2 = 362437(0x587c5, float:5.07882E-40)
            int r1 = r1 + r2
            r3.f24763 = r1
            int r0 = r0 + r1
            return r0
    }
}
