package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1088 extends Yue.C1085 implements Yue.InterfaceC1179<java.lang.Character>, Yue.InterfaceC4636<java.lang.Character> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C1088.C1089 f3232 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C1088 f3233 = null;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۡ$ۥ, reason: contains not printable characters */
    public static final class C1089 {
        public C1089() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C1089(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C1088 m5776() {
                r1 = this;
                Yue.ۥۣ۟ۤۡ r0 = Yue.C1088.m5766()
                return r0
        }
    }

    static {
            Yue.ۥۣ۟ۤۡ$ۥ r0 = new Yue.ۥۣ۟ۤۡ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C1088.f3232 = r0
            Yue.ۥۣ۟ۤۡ r0 = new Yue.ۥۣ۟ۤۡ
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2)
            Yue.C1088.f3233 = r0
            return
    }

    public C1088(char r2, char r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final /* synthetic */ Yue.C1088 m5766() {
            Yue.ۥۣ۟ۤۡ r0 = Yue.C1088.f3233
            return r0
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC1816(message = "Can throw an exception when it's impossible to represent the value with Char type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @Yue.InterfaceC5792(version = "1.9")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ void m5767() {
            return
    }

    @Override // Yue.C1085
    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof Yue.C1088
            if (r0 == 0) goto L2b
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            Yue.ۥۣ۟ۤۡ r0 = (Yue.C1088) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L29
        L13:
            char r0 = r2.m5760()
            Yue.ۥۣ۟ۤۡ r3 = (Yue.C1088) r3
            char r1 = r3.m5760()
            if (r0 != r1) goto L2b
            char r0 = r2.m5761()
            char r3 = r3.m5761()
            if (r0 != r3) goto L2b
        L29:
            r3 = 1
            goto L2c
        L2b:
            r3 = 0
        L2c:
            return r3
    }

    @Override // Yue.C1085
    public int hashCode() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto L13
        L8:
            char r0 = r2.m5760()
            int r0 = r0 * 31
            char r1 = r2.m5761()
            int r0 = r0 + r1
        L13:
            return r0
    }

    @Override // Yue.C1085, Yue.InterfaceC1179, Yue.InterfaceC4636
    public boolean isEmpty() {
            r2 = this;
            char r0 = r2.m5760()
            char r1 = r2.m5761()
            int r0 = Yue.C3329.m13910(r0, r1)
            if (r0 <= 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Override // Yue.C1085
    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = r2.m5760()
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            char r1 = r2.m5761()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC1179, Yue.InterfaceC4636
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ boolean mo5768(java.lang.Comparable r1) {
            r0 = this;
            java.lang.Character r1 = (java.lang.Character) r1
            char r1 = r1.charValue()
            boolean r1 = r0.m5772(r1)
            return r1
    }

    @Override // Yue.InterfaceC1179, Yue.InterfaceC4636
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ java.lang.Comparable mo5769() {
            r1 = this;
            java.lang.Character r0 = r1.m5775()
            return r0
    }

    @Override // Yue.InterfaceC4636
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ java.lang.Comparable mo5770() {
            r1 = this;
            java.lang.Character r0 = r1.m5773()
            return r0
    }

    @Override // Yue.InterfaceC1179
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ java.lang.Comparable mo5771() {
            r1 = this;
            java.lang.Character r0 = r1.m5774()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean m5772(char r2) {
            r1 = this;
            char r0 = r1.m5760()
            int r0 = Yue.C3329.m13910(r0, r2)
            if (r0 > 0) goto L16
            char r0 = r1.m5761()
            int r2 = Yue.C3329.m13910(r2, r0)
            if (r2 > 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public java.lang.Character m5773() {
            r2 = this;
            char r0 = r2.m5761()
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r0 == r1) goto L15
            char r0 = r2.m5761()
            int r0 = r0 + 1
            char r0 = (char) r0
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            return r0
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot return the exclusive upper bound of a range that includes MAX_VALUE."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public java.lang.Character m5774() {
            r1 = this;
            char r0 = r1.m5761()
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public java.lang.Character m5775() {
            r1 = this;
            char r0 = r1.m5760()
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            return r0
    }
}
