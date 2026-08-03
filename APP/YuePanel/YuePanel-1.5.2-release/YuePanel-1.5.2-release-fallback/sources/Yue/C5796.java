package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5796 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final float f21288;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final float f21289;

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۡۥ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(21)
    public static final class C5797 {
        public C5797() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4410
        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.util.SizeF m21641(@Yue.InterfaceC4410 Yue.C5796 r2) {
                Yue.C4868.m19181(r2)
                android.util.SizeF r0 = new android.util.SizeF
                float r1 = r2.m21639()
                float r2 = r2.m21638()
                r0.<init>(r1, r2)
                return r0
        }

        @Yue.InterfaceC4410
        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static Yue.C5796 m21642(@Yue.InterfaceC4410 android.util.SizeF r2) {
                Yue.C4868.m19181(r2)
                Yue.ۥۢ۟ۡۥ r0 = new Yue.ۥۢ۟ۡۥ
                float r1 = r2.getWidth()
                float r2 = r2.getHeight()
                r0.<init>(r1, r2)
                return r0
        }
    }

    public C5796(float r2, float r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "width"
            float r2 = Yue.C4868.m19173(r2, r0)
            r1.f21288 = r2
            java.lang.String r2 = "height"
            float r2 = Yue.C4868.m19173(r3, r2)
            r1.f21289 = r2
            return
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5336(21)
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Yue.C5796 m21637(@Yue.InterfaceC4410 android.util.SizeF r0) {
            Yue.ۥۢ۟ۡۥ r0 = Yue.C5796.C5797.m21642(r0)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof Yue.C5796
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Yue.ۥۢ۟ۡۥ r5 = (Yue.C5796) r5
            float r1 = r5.f21288
            float r3 = r4.f21288
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L1d
            float r5 = r5.f21289
            float r1 = r4.f21289
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L1d
            goto L1e
        L1d:
            r0 = r2
        L1e:
            return r0
    }

    public int hashCode() {
            r2 = this;
            float r0 = r2.f21288
            int r0 = java.lang.Float.floatToIntBits(r0)
            float r1 = r2.f21289
            int r1 = java.lang.Float.floatToIntBits(r1)
            r0 = r0 ^ r1
            return r0
    }

    @Yue.InterfaceC4410
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            float r1 = r2.f21288
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            float r1 = r2.f21289
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public float m21638() {
            r1 = this;
            float r0 = r1.f21289
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public float m21639() {
            r1 = this;
            float r0 = r1.f21288
            return r0
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5336(21)
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public android.util.SizeF m21640() {
            r1 = this;
            android.util.SizeF r0 = Yue.C5796.C5797.m21641(r1)
            return r0
    }
}
