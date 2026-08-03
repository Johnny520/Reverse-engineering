package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5460<T> extends Yue.AbstractC1600 implements Yue.InterfaceC2466<T>, Yue.InterfaceC1665 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public final Yue.InterfaceC2466<T> f20262;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public final Yue.InterfaceC1632 f20263;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC3417
    public final int f20264;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.InterfaceC1632 f20265;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.InterfaceC1598<? super Yue.C6593> f20266;

    /* JADX INFO: renamed from: Yue.ۥۡۧۢ۠$ۥ, reason: contains not printable characters */
    public static final class C5461 extends Yue.AbstractC3560 implements Yue.InterfaceC2839<java.lang.Integer, Yue.InterfaceC1632.InterfaceC1635, java.lang.Integer> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final Yue.C5460.C5461 f20267 = null;

        static {
                Yue.ۥۡۧۢ۠$ۥ r0 = new Yue.ۥۡۧۢ۠$ۥ
                r0.<init>()
                Yue.C5460.C5461.f20267 = r0
                return
        }

        public C5461() {
                r1 = this;
                r0 = 2
                r1.<init>(r0)
                return
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Integer r1, Yue.InterfaceC1632.InterfaceC1635 r2) {
                r0 = this;
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                Yue.ۥ۟ۧۦۥ$ۥ۟ r2 = (Yue.InterfaceC1632.InterfaceC1635) r2
                java.lang.Integer r1 = r0.m20615(r1, r2)
                return r1
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.lang.Integer m20615(int r1, @Yue.InterfaceC4418 Yue.InterfaceC1632.InterfaceC1635 r2) {
                r0 = this;
                int r1 = r1 + 1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                return r1
        }
    }

    public C5460(@Yue.InterfaceC4418 Yue.InterfaceC2466<? super T> r3, @Yue.InterfaceC4418 Yue.InterfaceC1632 r4) {
            r2 = this;
            Yue.ۥۣۡۢۡ r0 = Yue.C4395.f13954
            Yue.ۥ۠۠ۧۦ r1 = Yue.C2141.f6728
            r2.<init>(r0, r1)
            r2.f20262 = r3
            r2.f20263 = r4
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            Yue.ۥۡۧۢ۠$ۥ r0 = Yue.C5460.C5461.f20267
            java.lang.Object r3 = r4.fold(r3, r0)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r2.f20264 = r3
            return
    }

    @Override // Yue.AbstractC0730, Yue.InterfaceC1665
    @Yue.InterfaceC4543
    public Yue.InterfaceC1665 getCallerFrame() {
            r2 = this;
            Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ> r0 = r2.f20266
            boolean r1 = r0 instanceof Yue.InterfaceC1665
            if (r1 == 0) goto L9
            Yue.ۥ۟ۧۧۨ r0 = (Yue.InterfaceC1665) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // Yue.AbstractC1600, Yue.InterfaceC1598
    @Yue.InterfaceC4418
    public Yue.InterfaceC1632 getContext() {
            r1 = this;
            Yue.ۥ۟ۧۦۥ r0 = r1.f20265
            if (r0 != 0) goto L6
            Yue.ۥ۠۠ۧۦ r0 = Yue.C2141.f6728
        L6:
            return r0
    }

    @Override // Yue.AbstractC0730, Yue.InterfaceC1665
    @Yue.InterfaceC4543
    public java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.AbstractC0730
    @Yue.InterfaceC4418
    public java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r4) {
            r3 = this;
            java.lang.Throwable r0 = Yue.C5388.m20380(r4)
            if (r0 == 0) goto L11
            Yue.ۥ۠۠۠ r1 = new Yue.ۥ۠۠۠
            Yue.ۥ۟ۧۦۥ r2 = r3.getContext()
            r1.<init>(r0, r2)
            r3.f20265 = r1
        L11:
            Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ> r0 = r3.f20266
            if (r0 == 0) goto L18
            r0.resumeWith(r4)
        L18:
            java.lang.Object r4 = Yue.C3341.m13947()
            return r4
    }

    @Override // Yue.AbstractC1600, Yue.AbstractC0730
    public void releaseIntercepted() {
            r0 = this;
            super.releaseIntercepted()
            return
    }

    @Override // Yue.InterfaceC2466
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public java.lang.Object mo5352(T r2, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r3) {
            r1 = this;
            java.lang.Object r2 = r1.m20613(r3, r2)     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = Yue.C3341.m13947()
            if (r2 != r0) goto Ld
            Yue.C1757.m8349(r3)
        Ld:
            java.lang.Object r3 = Yue.C3341.m13947()
            if (r2 != r3) goto L14
            return r2
        L14:
            Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
            return r2
        L17:
            r2 = move-exception
            Yue.ۥ۠۠۠ r0 = new Yue.ۥ۠۠۠
            Yue.ۥ۟ۧۦۥ r3 = r3.getContext()
            r0.<init>(r2, r3)
            r1.f20265 = r0
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final void m20612(Yue.InterfaceC1632 r2, Yue.InterfaceC1632 r3, T r4) {
            r1 = this;
            boolean r0 = r3 instanceof Yue.C1985
            if (r0 == 0) goto L9
            Yue.ۥ۠۠۠ r3 = (Yue.C1985) r3
            r1.m20614(r3, r4)
        L9:
            Yue.C5464.m20619(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final java.lang.Object m20613(Yue.InterfaceC1598<? super Yue.C6593> r3, T r4) {
            r2 = this;
            Yue.ۥ۟ۧۦۥ r0 = r3.getContext()
            Yue.C3399.m14045(r0)
            Yue.ۥ۟ۧۦۥ r1 = r2.f20265
            if (r1 == r0) goto L10
            r2.m20612(r0, r1, r4)
            r2.f20265 = r0
        L10:
            r2.f20266 = r3
            Yue.ۥۣ۠ۢۤ r3 = Yue.C5462.m20616()
            Yue.ۥۣۣ۠ۢ<T> r0 = r2.f20262
            java.lang.Object r3 = r3.mo11720(r0, r4, r2)
            java.lang.Object r4 = Yue.C3341.m13947()
            boolean r4 = Yue.C3329.m13897(r3, r4)
            if (r4 != 0) goto L29
            r4 = 0
            r2.f20266 = r4
        L29:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final void m20614(Yue.C1985 r4, java.lang.Object r5) {
            r3 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception "
            r1.append(r2)
            java.lang.Throwable r4 = r4.f6301
            r1.append(r4)
            java.lang.String r4 = ", but then emission attempt of value '"
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = Yue.C5978.m22153(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }
}
