package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C2451 extends Yue.AbstractC2058<Yue.C2451> {

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final Yue.C2451.C2452 f8196;

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۢۢ$ۥ, reason: contains not printable characters */
    public static final class C2452 implements Yue.InterfaceC2742 {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final float f8197 = -4.2f;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final float f8198 = 62.5f;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public float f8199;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public float f8200;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Yue.AbstractC2058.C2074 f8201;

        public C2452() {
                r1 = this;
                r1.<init>()
                r0 = -1064933786(0xffffffffc0866666, float:-4.2)
                r1.f8199 = r0
                Yue.ۥۣ۠۠ۤ$ۥ۟۟۠۟ r0 = new Yue.ۥۣ۠۠ۤ$ۥ۟۟۠۟
                r0.<init>()
                r1.f8201 = r0
                return
        }

        @Override // Yue.InterfaceC2742
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public boolean mo11411(float r1, float r2) {
                r0 = this;
                float r1 = java.lang.Math.abs(r2)
                float r2 = r0.f8200
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 >= 0) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                return r1
        }

        @Override // Yue.InterfaceC2742
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public float mo11412(float r1, float r2) {
                r0 = this;
                float r1 = r0.f8199
                float r2 = r2 * r1
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public float m11413() {
                r2 = this;
                float r0 = r2.f8199
                r1 = -1064933786(0xffffffffc0866666, float:-4.2)
                float r0 = r0 / r1
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m11414(float r2) {
                r1 = this;
                r0 = -1064933786(0xffffffffc0866666, float:-4.2)
                float r2 = r2 * r0
                r1.f8199 = r2
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m11415(float r2) {
                r1 = this;
                r0 = 1115291648(0x427a0000, float:62.5)
                float r2 = r2 * r0
                r1.f8200 = r2
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public Yue.AbstractC2058.C2074 m11416(float r6, float r7, long r8) {
                r5 = this;
                Yue.ۥۣ۠۠ۤ$ۥ۟۟۠۟ r0 = r5.f8201
                double r1 = (double) r7
                float r8 = (float) r8
                r9 = 1148846080(0x447a0000, float:1000.0)
                float r3 = r8 / r9
                float r4 = r5.f8199
                float r3 = r3 * r4
                double r3 = (double) r3
                double r3 = java.lang.Math.exp(r3)
                double r1 = r1 * r3
                float r1 = (float) r1
                r0.f6597 = r1
                Yue.ۥۣ۠۠ۤ$ۥ۟۟۠۟ r0 = r5.f8201
                float r1 = r5.f8199
                float r2 = r7 / r1
                float r6 = r6 - r2
                double r2 = (double) r6
                float r7 = r7 / r1
                double r6 = (double) r7
                float r1 = r1 * r8
                float r1 = r1 / r9
                double r8 = (double) r1
                double r8 = java.lang.Math.exp(r8)
                double r6 = r6 * r8
                double r2 = r2 + r6
                float r6 = (float) r2
                r0.f6596 = r6
                Yue.ۥۣ۠۠ۤ$ۥ۟۟۠۟ r6 = r5.f8201
                float r7 = r6.f6596
                float r6 = r6.f6597
                boolean r6 = r5.mo11411(r7, r6)
                if (r6 == 0) goto L3b
                Yue.ۥۣ۠۠ۤ$ۥ۟۟۠۟ r6 = r5.f8201
                r7 = 0
                r6.f6597 = r7
            L3b:
                Yue.ۥۣ۠۠ۤ$ۥ۟۟۠۟ r6 = r5.f8201
                return r6
        }
    }

    public C2451(Yue.C2460 r2) {
            r1 = this;
            r1.<init>(r2)
            Yue.ۥ۠ۢۢۢ$ۥ r2 = new Yue.ۥ۠ۢۢۢ$ۥ
            r2.<init>()
            r1.f8196 = r2
            float r0 = r1.m9678()
            r2.m11415(r0)
            return
    }

    public <K> C2451(K r1, Yue.AbstractC2456<K> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            Yue.ۥ۠ۢۢۢ$ۥ r1 = new Yue.ۥ۠ۢۢۢ$ۥ
            r1.<init>()
            r0.f8196 = r1
            float r2 = r0.m9678()
            r1.m11415(r2)
            return
    }

    @Override // Yue.AbstractC2058
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public float mo9675(float r2, float r3) {
            r1 = this;
            Yue.ۥ۠ۢۢۢ$ۥ r0 = r1.f8196
            float r2 = r0.mo11412(r2, r3)
            return r2
    }

    @Override // Yue.AbstractC2058
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public boolean mo9679(float r2, float r3) {
            r1 = this;
            float r0 = r1.f6588
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L17
            float r0 = r1.f6589
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L17
            Yue.ۥ۠ۢۢۢ$ۥ r0 = r1.f8196
            boolean r2 = r0.mo11411(r2, r3)
            if (r2 == 0) goto L15
            goto L17
        L15:
            r2 = 0
            goto L18
        L17:
            r2 = 1
        L18:
            return r2
    }

    @Override // Yue.AbstractC2058
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public /* bridge */ /* synthetic */ Yue.AbstractC2058 mo9683(float r1) {
            r0 = this;
            Yue.ۥ۠ۢۢۢ r1 = r0.m11408(r1)
            return r1
    }

    @Override // Yue.AbstractC2058
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public /* bridge */ /* synthetic */ Yue.AbstractC2058 mo9684(float r1) {
            r0 = this;
            Yue.ۥ۠ۢۢۢ r1 = r0.m11409(r1)
            return r1
    }

    @Override // Yue.AbstractC2058
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public /* bridge */ /* synthetic */ Yue.AbstractC2058 mo9688(float r1) {
            r0 = this;
            Yue.ۥ۠ۢۢۢ r1 = r0.m11410(r1)
            return r1
    }

    @Override // Yue.AbstractC2058
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public void mo9689(float r2) {
            r1 = this;
            Yue.ۥ۠ۢۢۢ$ۥ r0 = r1.f8196
            r0.m11415(r2)
            return
    }

    @Override // Yue.AbstractC2058
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public boolean mo9692(long r4) {
            r3 = this;
            Yue.ۥ۠ۢۢۢ$ۥ r0 = r3.f8196
            float r1 = r3.f6583
            float r2 = r3.f6582
            Yue.ۥۣ۠۠ۤ$ۥ۟۟۠۟ r4 = r0.m11416(r1, r2, r4)
            float r5 = r4.f6596
            r3.f6583 = r5
            float r4 = r4.f6597
            r3.f6582 = r4
            float r0 = r3.f6589
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r2 = 1
            if (r1 >= 0) goto L1c
            r3.f6583 = r0
            return r2
        L1c:
            float r0 = r3.f6588
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 <= 0) goto L25
            r3.f6583 = r0
            return r2
        L25:
            boolean r4 = r3.mo9679(r5, r4)
            if (r4 == 0) goto L2c
            return r2
        L2c:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public float m11406() {
            r1 = this;
            Yue.ۥ۠ۢۢۢ$ۥ r0 = r1.f8196
            float r0 = r0.m11413()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public Yue.C2451 m11407(@Yue.InterfaceC2458(from = 0.0d, fromInclusive = false) float r2) {
            r1 = this;
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lb
            Yue.ۥ۠ۢۢۢ$ۥ r0 = r1.f8196
            r0.m11414(r2)
            return r1
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Friction must be positive"
            r2.<init>(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public Yue.C2451 m11408(float r1) {
            r0 = this;
            super.mo9683(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public Yue.C2451 m11409(float r1) {
            r0 = this;
            super.mo9684(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public Yue.C2451 m11410(float r1) {
            r0 = this;
            super.mo9688(r1)
            return r0
    }
}
