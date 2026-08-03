package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0028<E> extends Yue.AbstractC0085<E> implements Yue.InterfaceC0996<E> {

    /* JADX INFO: renamed from: Yue.ۥ۟۟۠ۤ$ۥ, reason: contains not printable characters */
    public static final class C0029<E> implements Yue.InterfaceC1018<E> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        @Yue.InterfaceC3417
        public final Yue.AbstractC0028<E> f73;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC4543
        public java.lang.Object f74;

        public C0029(@Yue.InterfaceC4418 Yue.AbstractC0028<E> r1) {
                r0 = this;
                r0.<init>()
                r0.f73 = r1
                Yue.ۥۢ۠ۦۢ r1 = Yue.C0040.f97
                r0.f74 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final /* synthetic */ java.lang.Object m340(Yue.AbstractC0028.C0029 r0, Yue.InterfaceC1598 r1) {
                java.lang.Object r0 = r0.m345(r1)
                return r0
        }

        @Override // Yue.InterfaceC1018
        public E next() {
                r2 = this;
                java.lang.Object r0 = r2.f74
                boolean r1 = r0 instanceof Yue.C1174
                if (r1 != 0) goto L15
                Yue.ۥۢ۠ۦۢ r1 = Yue.C0040.f97
                if (r0 == r1) goto Ld
                r2.f74 = r1
                return r0
            Ld:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "'hasNext' should be called prior to 'next' invocation"
                r0.<init>(r1)
                throw r0
            L15:
                Yue.ۥ۟ۥ r0 = (Yue.C1174) r0
                java.lang.Throwable r0 = r0.m6119()
                java.lang.Throwable r0 = Yue.C5912.m21959(r0)
                throw r0
        }

        @Override // Yue.InterfaceC1018
        @Yue.InterfaceC1816(level = Yue.EnumC1819.f5582, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        @Yue.InterfaceC3421(name = "next")
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object mo341(Yue.InterfaceC1598 r1) {
                r0 = this;
                java.lang.Object r1 = Yue.InterfaceC1018.C1019.m5551(r0, r1)
                return r1
        }

        @Override // Yue.InterfaceC1018
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public java.lang.Object mo342(@Yue.InterfaceC4418 Yue.InterfaceC1598<? super java.lang.Boolean> r3) {
                r2 = this;
                java.lang.Object r0 = r2.f74
                Yue.ۥۢ۠ۦۢ r1 = Yue.C0040.f97
                if (r0 == r1) goto Lf
                boolean r3 = r2.m344(r0)
                java.lang.Boolean r3 = Yue.C0828.m4773(r3)
                return r3
            Lf:
                Yue.ۥ۟۟۠ۤ<E> r0 = r2.f73
                java.lang.Object r0 = r0.mo334()
                r2.f74 = r0
                if (r0 == r1) goto L22
                boolean r3 = r2.m344(r0)
                java.lang.Boolean r3 = Yue.C0828.m4773(r3)
                return r3
            L22:
                java.lang.Object r3 = r2.m345(r3)
                return r3
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final java.lang.Object m343() {
                r1 = this;
                java.lang.Object r0 = r1.f74
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final boolean m344(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof Yue.C1174
                if (r0 == 0) goto L15
                Yue.ۥ۟ۥ r2 = (Yue.C1174) r2
                java.lang.Throwable r0 = r2.f3661
                if (r0 != 0) goto Lc
                r2 = 0
                return r2
            Lc:
                java.lang.Throwable r2 = r2.m6119()
                java.lang.Throwable r2 = Yue.C5912.m21959(r2)
                throw r2
            L15:
                r2 = 1
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final java.lang.Object m345(Yue.InterfaceC1598<? super java.lang.Boolean> r6) {
                r5 = this;
                Yue.ۥ۟ۧۤۢ r0 = Yue.C3332.m13940(r6)
                Yue.ۥۣ۟ۨ۠ r0 = Yue.C0936.m5346(r0)
                Yue.ۥ۟۟۠ۤ$ۥ۟۟۟ r1 = new Yue.ۥ۟۟۠ۤ$ۥ۟۟۟
                r1.<init>(r5, r0)
            Ld:
                Yue.ۥ۟۟۠ۤ<E> r2 = r5.f73
                boolean r2 = Yue.AbstractC0028.m306(r2, r1)
                if (r2 == 0) goto L1b
                Yue.ۥ۟۟۠ۤ<E> r2 = r5.f73
                Yue.AbstractC0028.m309(r2, r0, r1)
                goto L6b
            L1b:
                Yue.ۥ۟۟۠ۤ<E> r2 = r5.f73
                java.lang.Object r2 = r2.mo334()
                r5.m346(r2)
                boolean r3 = r2 instanceof Yue.C1174
                if (r3 == 0) goto L4f
                Yue.ۥ۟ۥ r2 = (Yue.C1174) r2
                java.lang.Throwable r1 = r2.f3661
                if (r1 != 0) goto L3d
                Yue.ۥۡۦۧۤ$ۥ r1 = Yue.C5388.f20029
                r1 = 0
                java.lang.Boolean r1 = Yue.C0828.m4773(r1)
                java.lang.Object r1 = Yue.C5388.m20377(r1)
                r0.resumeWith(r1)
                goto L6b
            L3d:
                Yue.ۥۡۦۧۤ$ۥ r1 = Yue.C5388.f20029
                java.lang.Throwable r1 = r2.m6119()
                java.lang.Object r1 = Yue.C5391.m20390(r1)
                java.lang.Object r1 = Yue.C5388.m20377(r1)
                r0.resumeWith(r1)
                goto L6b
            L4f:
                Yue.ۥۢ۠ۦۢ r3 = Yue.C0040.f97
                if (r2 == r3) goto Ld
                r1 = 1
                java.lang.Boolean r1 = Yue.C0828.m4773(r1)
                Yue.ۥ۟۟۠ۤ<E> r3 = r5.f73
                Yue.ۥۣ۠ۡ۟<E, Yue.ۥۣۢ۠ۤ> r3 = r3.f165
                if (r3 == 0) goto L67
                Yue.ۥ۟ۧۦۥ r4 = r0.getContext()
                Yue.ۥۣ۠ۡ۟ r2 = Yue.C4622.m18432(r3, r2, r4)
                goto L68
            L67:
                r2 = 0
            L68:
                r0.mo5301(r1, r2)
            L6b:
                java.lang.Object r0 = r0.m5329()
                java.lang.Object r1 = Yue.C3341.m13947()
                if (r0 != r1) goto L78
                Yue.C1757.m8349(r6)
            L78:
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final void m346(@Yue.InterfaceC4543 java.lang.Object r1) {
                r0 = this;
                r0.f74 = r1
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟۠ۤ$ۥ۟, reason: contains not printable characters */
    public static class C0030<E> extends Yue.AbstractC5241<E> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        @Yue.InterfaceC3417
        public final Yue.InterfaceC0932<java.lang.Object> f75;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        @Yue.InterfaceC3417
        public final int f76;

        public C0030(@Yue.InterfaceC4418 Yue.InterfaceC0932<java.lang.Object> r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.f75 = r1
                r0.f76 = r2
                return
        }

        @Override // Yue.C3783
        @Yue.InterfaceC4418
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ReceiveElement@"
                r0.append(r1)
                java.lang.String r1 = Yue.C1758.m8351(r2)
                r0.append(r1)
                java.lang.String r1 = "[receiveMode="
                r0.append(r1)
                int r1 = r2.f76
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // Yue.InterfaceC5247
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Yue.C6075 mo347(E r5, @Yue.InterfaceC4543 Yue.C3783.C3787 r6) {
                r4 = this;
                Yue.ۥۣ۟ۨ۟<java.lang.Object> r0 = r4.f75
                java.lang.Object r1 = r4.m350(r5)
                r2 = 0
                if (r6 == 0) goto Lc
                Yue.ۥ۠ۨ۠ۥ$ۥ r3 = r6.f12003
                goto Ld
            Lc:
                r3 = r2
            Ld:
                Yue.ۥۣ۠ۡ۟ r5 = r4.mo351(r5)
                java.lang.Object r5 = r0.mo5306(r1, r3, r5)
                if (r5 != 0) goto L18
                return r2
            L18:
                if (r6 == 0) goto L1d
                r6.m15190()
            L1d:
                Yue.ۥۢ۠ۦۢ r5 = Yue.C0935.f2703
                return r5
        }

        @Override // Yue.InterfaceC5247
        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public void mo348(E r2) {
                r1 = this;
                Yue.ۥۣ۟ۨ۟<java.lang.Object> r2 = r1.f75
                Yue.ۥۢ۠ۦۢ r0 = Yue.C0935.f2703
                r2.mo5309(r0)
                return
        }

        @Override // Yue.AbstractC5241
        /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
        public void mo349(@Yue.InterfaceC4418 Yue.C1174<?> r3) {
                r2 = this;
                int r0 = r2.f76
                r1 = 1
                if (r0 != r1) goto L1d
                Yue.ۥۣ۟ۨ۟<java.lang.Object> r0 = r2.f75
                Yue.ۥ۟ۤۢ۟$ۥ۟ r1 = Yue.C1024.f2933
                java.lang.Throwable r3 = r3.f3661
                java.lang.Object r3 = r1.m5575(r3)
                Yue.ۥ۟ۤۢ۟ r3 = Yue.C1024.m5561(r3)
                Yue.ۥۡۦۧۤ$ۥ r1 = Yue.C5388.f20029
                java.lang.Object r3 = Yue.C5388.m20377(r3)
                r0.resumeWith(r3)
                goto L30
            L1d:
                Yue.ۥۣ۟ۨ۟<java.lang.Object> r0 = r2.f75
                Yue.ۥۡۦۧۤ$ۥ r1 = Yue.C5388.f20029
                java.lang.Throwable r3 = r3.m6119()
                java.lang.Object r3 = Yue.C5391.m20390(r3)
                java.lang.Object r3 = Yue.C5388.m20377(r3)
                r0.resumeWith(r3)
            L30:
                return
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
        public final java.lang.Object m350(E r3) {
                r2 = this;
                int r0 = r2.f76
                r1 = 1
                if (r0 != r1) goto Lf
                Yue.ۥ۟ۤۢ۟$ۥ۟ r0 = Yue.C1024.f2933
                java.lang.Object r3 = r0.m5577(r3)
                Yue.ۥ۟ۤۢ۟ r3 = Yue.C1024.m5561(r3)
            Lf:
                return r3
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟۠ۤ$ۥ۟۟, reason: contains not printable characters */
    public static final class C0031<E> extends Yue.AbstractC0028.C0030<E> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        @Yue.InterfaceC3417
        public final Yue.InterfaceC2825<E, Yue.C6593> f77;

        public C0031(@Yue.InterfaceC4418 Yue.InterfaceC0932<java.lang.Object> r1, int r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super E, Yue.C6593> r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.f77 = r3
                return
        }

        @Override // Yue.AbstractC5241
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
        public Yue.InterfaceC2825<java.lang.Throwable, Yue.C6593> mo351(E r3) {
                r2 = this;
                Yue.ۥۣ۠ۡ۟<E, Yue.ۥۣۢ۠ۤ> r0 = r2.f77
                Yue.ۥۣ۟ۨ۟<java.lang.Object> r1 = r2.f75
                Yue.ۥ۟ۧۦۥ r1 = r1.getContext()
                Yue.ۥۣ۠ۡ۟ r3 = Yue.C4622.m18432(r0, r3, r1)
                return r3
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟۠ۤ$ۥ۟۟۟, reason: contains not printable characters */
    public static class C0032<E> extends Yue.AbstractC5241<E> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        @Yue.InterfaceC3417
        public final Yue.AbstractC0028.C0029<E> f78;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        @Yue.InterfaceC3417
        public final Yue.InterfaceC0932<java.lang.Boolean> f79;

        public C0032(@Yue.InterfaceC4418 Yue.AbstractC0028.C0029<E> r1, @Yue.InterfaceC4418 Yue.InterfaceC0932<? super java.lang.Boolean> r2) {
                r0 = this;
                r0.<init>()
                r0.f78 = r1
                r0.f79 = r2
                return
        }

        @Override // Yue.C3783
        @Yue.InterfaceC4418
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ReceiveHasNext@"
                r0.append(r1)
                java.lang.String r1 = Yue.C1758.m8351(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // Yue.InterfaceC5247
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
        public Yue.C6075 mo347(E r5, @Yue.InterfaceC4543 Yue.C3783.C3787 r6) {
                r4 = this;
                Yue.ۥۣ۟ۨ۟<java.lang.Boolean> r0 = r4.f79
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                r2 = 0
                if (r6 == 0) goto La
                Yue.ۥ۠ۨ۠ۥ$ۥ r3 = r6.f12003
                goto Lb
            La:
                r3 = r2
            Lb:
                Yue.ۥۣ۠ۡ۟ r5 = r4.mo351(r5)
                java.lang.Object r5 = r0.mo5306(r1, r3, r5)
                if (r5 != 0) goto L16
                return r2
            L16:
                if (r6 == 0) goto L1b
                r6.m15190()
            L1b:
                Yue.ۥۢ۠ۦۢ r5 = Yue.C0935.f2703
                return r5
        }

        @Override // Yue.InterfaceC5247
        /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
        public void mo348(E r2) {
                r1 = this;
                Yue.ۥ۟۟۠ۤ$ۥ<E> r0 = r1.f78
                r0.m346(r2)
                Yue.ۥۣ۟ۨ۟<java.lang.Boolean> r2 = r1.f79
                Yue.ۥۢ۠ۦۢ r0 = Yue.C0935.f2703
                r2.mo5309(r0)
                return
        }

        @Override // Yue.AbstractC5241
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟ۦۥ */
        public Yue.InterfaceC2825<java.lang.Throwable, Yue.C6593> mo351(E r3) {
                r2 = this;
                Yue.ۥ۟۟۠ۤ$ۥ<E> r0 = r2.f78
                Yue.ۥ۟۟۠ۤ<E> r0 = r0.f73
                Yue.ۥۣ۠ۡ۟<E, Yue.ۥۣۢ۠ۤ> r0 = r0.f165
                if (r0 == 0) goto L13
                Yue.ۥۣ۟ۨ۟<java.lang.Boolean> r1 = r2.f79
                Yue.ۥ۟ۧۦۥ r1 = r1.getContext()
                Yue.ۥۣ۠ۡ۟ r3 = Yue.C4622.m18432(r0, r3, r1)
                goto L14
            L13:
                r3 = 0
            L14:
                return r3
        }

        @Override // Yue.AbstractC5241
        /* JADX INFO: renamed from: ۥ۟۟ۦۦ */
        public void mo349(@Yue.InterfaceC4418 Yue.C1174<?> r5) {
                r4 = this;
                java.lang.Throwable r0 = r5.f3661
                if (r0 != 0) goto Lf
                Yue.ۥۣ۟ۨ۟<java.lang.Boolean> r0 = r4.f79
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                r2 = 2
                r3 = 0
                java.lang.Object r0 = Yue.InterfaceC0932.C0933.m5311(r0, r1, r3, r2, r3)
                goto L19
            Lf:
                Yue.ۥۣ۟ۨ۟<java.lang.Boolean> r0 = r4.f79
                java.lang.Throwable r1 = r5.m6119()
                java.lang.Object r0 = r0.mo5305(r1)
            L19:
                if (r0 == 0) goto L25
                Yue.ۥ۟۟۠ۤ$ۥ<E> r1 = r4.f78
                r1.m346(r5)
                Yue.ۥۣ۟ۨ۟<java.lang.Boolean> r5 = r4.f79
                r5.mo5309(r0)
            L25:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟۠ۤ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C0033<R, E> extends Yue.AbstractC5241<E> implements Yue.InterfaceC1892 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        @Yue.InterfaceC3417
        public final Yue.AbstractC0028<E> f80;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        @Yue.InterfaceC3417
        public final Yue.InterfaceC5564<R> f81;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        @Yue.InterfaceC3417
        public final Yue.InterfaceC2839<java.lang.Object, Yue.InterfaceC1598<? super R>, java.lang.Object> f82;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        @Yue.InterfaceC3417
        public final int f83;

        public C0033(@Yue.InterfaceC4418 Yue.AbstractC0028<E> r1, @Yue.InterfaceC4418 Yue.InterfaceC5564<? super R> r2, @Yue.InterfaceC4418 Yue.InterfaceC2839<java.lang.Object, ? super Yue.InterfaceC1598<? super R>, ? extends java.lang.Object> r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.f80 = r1
                r0.f81 = r2
                r0.f82 = r3
                r0.f83 = r4
                return
        }

        @Override // Yue.C3783
        @Yue.InterfaceC4418
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ReceiveSelect@"
                r0.append(r1)
                java.lang.String r1 = Yue.C1758.m8351(r2)
                r0.append(r1)
                r1 = 91
                r0.append(r1)
                Yue.ۥۡۨ<R> r1 = r2.f81
                r0.append(r1)
                java.lang.String r1 = ",receiveMode="
                r0.append(r1)
                int r1 = r2.f83
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // Yue.InterfaceC5247
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
        public Yue.C6075 mo347(E r1, @Yue.InterfaceC4543 Yue.C3783.C3787 r2) {
                r0 = this;
                Yue.ۥۡۨ<R> r1 = r0.f81
                java.lang.Object r1 = r1.mo20842(r2)
                Yue.ۥۢ۠ۦۢ r1 = (Yue.C6075) r1
                return r1
        }

        @Override // Yue.InterfaceC1892
        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public void mo352() {
                r1 = this;
                boolean r0 = r1.mo15143()
                if (r0 == 0) goto Lb
                Yue.ۥ۟۟۠ۤ<E> r0 = r1.f80
                r0.m332()
            Lb:
                return
        }

        @Override // Yue.InterfaceC5247
        /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
        public void mo348(E r4) {
                r3 = this;
                Yue.ۥۣ۠ۢۢ<java.lang.Object, Yue.ۥ۟ۧۤۢ<? super R>, java.lang.Object> r0 = r3.f82
                int r1 = r3.f83
                r2 = 1
                if (r1 != r2) goto L12
                Yue.ۥ۟ۤۢ۟$ۥ۟ r1 = Yue.C1024.f2933
                java.lang.Object r1 = r1.m5577(r4)
                Yue.ۥ۟ۤۢ۟ r1 = Yue.C1024.m5561(r1)
                goto L13
            L12:
                r1 = r4
            L13:
                Yue.ۥۡۨ<R> r2 = r3.f81
                Yue.ۥ۟ۧۤۢ r2 = r2.mo20846()
                Yue.ۥۣ۠ۡ۟ r4 = r3.mo351(r4)
                Yue.C0941.m5357(r0, r1, r2, r4)
                return
        }

        @Override // Yue.AbstractC5241
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟ۦۥ */
        public Yue.InterfaceC2825<java.lang.Throwable, Yue.C6593> mo351(E r3) {
                r2 = this;
                Yue.ۥ۟۟۠ۤ<E> r0 = r2.f80
                Yue.ۥۣ۠ۡ۟<E, Yue.ۥۣۢ۠ۤ> r0 = r0.f165
                if (r0 == 0) goto L15
                Yue.ۥۡۨ<R> r1 = r2.f81
                Yue.ۥ۟ۧۤۢ r1 = r1.mo20846()
                Yue.ۥ۟ۧۦۥ r1 = r1.getContext()
                Yue.ۥۣ۠ۡ۟ r3 = Yue.C4622.m18432(r0, r3, r1)
                goto L16
            L15:
                r3 = 0
            L16:
                return r3
        }

        @Override // Yue.AbstractC5241
        /* JADX INFO: renamed from: ۥ۟۟ۦۦ */
        public void mo349(@Yue.InterfaceC4418 Yue.C1174<?> r9) {
                r8 = this;
                Yue.ۥۡۨ<R> r0 = r8.f81
                boolean r0 = r0.mo20844()
                if (r0 != 0) goto L9
                return
            L9:
                int r0 = r8.f83
                if (r0 == 0) goto L2c
                r1 = 1
                if (r0 == r1) goto L11
                goto L35
            L11:
                Yue.ۥۣ۠ۢۢ<java.lang.Object, Yue.ۥ۟ۧۤۢ<? super R>, java.lang.Object> r2 = r8.f82
                Yue.ۥ۟ۤۢ۟$ۥ۟ r0 = Yue.C1024.f2933
                java.lang.Throwable r9 = r9.f3661
                java.lang.Object r9 = r0.m5575(r9)
                Yue.ۥ۟ۤۢ۟ r3 = Yue.C1024.m5561(r9)
                Yue.ۥۡۨ<R> r9 = r8.f81
                Yue.ۥ۟ۧۤۢ r4 = r9.mo20846()
                r6 = 4
                r7 = 0
                r5 = 0
                Yue.C0941.m5358(r2, r3, r4, r5, r6, r7)
                goto L35
            L2c:
                Yue.ۥۡۨ<R> r0 = r8.f81
                java.lang.Throwable r9 = r9.m6119()
                r0.mo20847(r9)
            L35:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟۠ۤ$ۥ۟۟۟۠, reason: contains not printable characters */
    public final class C0034 extends Yue.AbstractC0751 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final Yue.AbstractC5241<?> f84;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC0028<E> f85;

        public C0034(@Yue.InterfaceC4418 Yue.AbstractC0028 r1, Yue.AbstractC5241<?> r2) {
                r0 = this;
                r0.f85 = r1
                r0.<init>()
                r0.f84 = r2
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ Yue.C6593 invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.mo353(r1)
                Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
                return r1
        }

        @Yue.InterfaceC4418
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "RemoveReceiveOnCancel["
                r0.append(r1)
                Yue.ۥۡۦۡ۠<?> r1 = r2.f84
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // Yue.AbstractC0929
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void mo353(@Yue.InterfaceC4543 java.lang.Throwable r1) {
                r0 = this;
                Yue.ۥۡۦۡ۠<?> r1 = r0.f84
                boolean r1 = r1.mo15143()
                if (r1 == 0) goto Ld
                Yue.ۥ۟۟۠ۤ<E> r1 = r0.f85
                r1.m332()
            Ld:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟۠ۤ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final class C0035<E> extends Yue.C3783.C3788<Yue.AbstractC5593> {
        public C0035(@Yue.InterfaceC4418 Yue.C3781 r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // Yue.C3783.C3788, Yue.C3783.AbstractC3784
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public java.lang.Object mo354(@Yue.InterfaceC4418 Yue.C3783 r2) {
                r1 = this;
                boolean r0 = r2 instanceof Yue.C1174
                if (r0 == 0) goto L5
                goto Ld
            L5:
                boolean r2 = r2 instanceof Yue.AbstractC5593
                if (r2 != 0) goto Lc
                Yue.ۥۢ۠ۦۢ r2 = Yue.C0040.f97
                goto Ld
            Lc:
                r2 = 0
            Ld:
                return r2
        }

        @Override // Yue.C3783.AbstractC3784
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public java.lang.Object mo355(@Yue.InterfaceC4418 Yue.C3783.C3787 r2) {
                r1 = this;
                Yue.ۥ۠ۨ۠ۥ r0 = r2.f12001
                Yue.ۥۡۨ۠ۦ r0 = (Yue.AbstractC5593) r0
                Yue.ۥۢ۠ۦۢ r2 = r0.mo509(r2)
                if (r2 != 0) goto Ld
                java.lang.Object r2 = Yue.C3791.f12008
                return r2
            Ld:
                java.lang.Object r0 = Yue.C0640.f1626
                if (r2 != r0) goto L12
                return r0
            L12:
                r2 = 0
                return r2
        }

        @Override // Yue.C3783.AbstractC3784
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public void mo356(@Yue.InterfaceC4418 Yue.C3783 r1) {
                r0 = this;
                Yue.ۥۡۨ۠ۦ r1 = (Yue.AbstractC5593) r1
                r1.mo510()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟۠ۤ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final class C0036 extends Yue.C3783.AbstractC3786 {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC0028 f86;

        public C0036(Yue.C3783 r1, Yue.AbstractC0028 r2) {
                r0 = this;
                r0.f86 = r2
                r0.<init>(r1)
                return
        }

        @Override // Yue.AbstractC0641
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public /* bridge */ /* synthetic */ java.lang.Object mo357(Yue.C3783 r1) {
                r0 = this;
                Yue.ۥ۠ۨ۠ۥ r1 = (Yue.C3783) r1
                java.lang.Object r1 = r0.m358(r1)
                return r1
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public java.lang.Object m358(@Yue.InterfaceC4418 Yue.C3783 r1) {
                r0 = this;
                Yue.ۥ۟۟۠ۤ r1 = r0.f86
                boolean r1 = r1.mo328()
                if (r1 == 0) goto La
                r1 = 0
                goto Le
            La:
                java.lang.Object r1 = Yue.C3782.m15148()
            Le:
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟۠ۤ$ۥۣ۟۟۟, reason: contains not printable characters */
    public static final class C0037 implements Yue.InterfaceC5562<E> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC0028<E> f87;

        public C0037(Yue.AbstractC0028<E> r1) {
                r0 = this;
                r0.f87 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC5562
        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public <R> void mo359(@Yue.InterfaceC4418 Yue.InterfaceC5564<? super R> r3, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super E, ? super Yue.InterfaceC1598<? super R>, ? extends java.lang.Object> r4) {
                r2 = this;
                Yue.ۥ۟۟۠ۤ<E> r0 = r2.f87
                r1 = 0
                Yue.AbstractC0028.m308(r0, r3, r1, r4)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟۠ۤ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final class C0038 implements Yue.InterfaceC5562<Yue.C1024<? extends E>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC0028<E> f88;

        public C0038(Yue.AbstractC0028<E> r1) {
                r0 = this;
                r0.f88 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC5562
        /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
        public <R> void mo359(@Yue.InterfaceC4418 Yue.InterfaceC5564<? super R> r3, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super Yue.C1024<? extends E>, ? super Yue.InterfaceC1598<? super R>, ? extends java.lang.Object> r4) {
                r2 = this;
                Yue.ۥ۟۟۠ۤ<E> r0 = r2.f88
                r1 = 1
                Yue.AbstractC0028.m308(r0, r3, r1, r4)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟۠ۤ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.channels.AbstractChannel", f = "AbstractChannel.kt", i = {}, l = {633}, m = "receiveCatching-JP2dKIU", n = {}, s = {})
    public static final class C0039 extends Yue.AbstractC1600 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f89;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC0028<E> f90;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f91;

        public C0039(Yue.AbstractC0028<E> r1, Yue.InterfaceC1598<? super Yue.AbstractC0028.C0039> r2) {
                r0 = this;
                r0.f90 = r1
                r0.<init>(r2)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                r1 = this;
                r1.f89 = r2
                int r2 = r1.f91
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f91 = r2
                Yue.ۥ۟۟۠ۤ<E> r2 = r1.f90
                java.lang.Object r2 = r2.mo319(r1)
                java.lang.Object r0 = Yue.C3341.m13947()
                if (r2 != r0) goto L16
                return r2
            L16:
                Yue.ۥ۟ۤۢ۟ r2 = Yue.C1024.m5561(r2)
                return r2
        }
    }

    public AbstractC0028(@Yue.InterfaceC4543 Yue.InterfaceC2825<? super E, Yue.C6593> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ boolean m306(Yue.AbstractC0028 r0, Yue.AbstractC5241 r1) {
            boolean r0 = r0.m323(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Object m307(Yue.AbstractC0028 r0, int r1, Yue.InterfaceC1598 r2) {
            java.lang.Object r0 = r0.m336(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ void m308(Yue.AbstractC0028 r0, Yue.InterfaceC5564 r1, int r2, Yue.InterfaceC2839 r3) {
            r0.m337(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final /* synthetic */ void m309(Yue.AbstractC0028 r0, Yue.InterfaceC0932 r1, Yue.AbstractC5241 r2) {
            r0.m338(r1, r2)
            return
    }

    @Override // Yue.InterfaceC5242
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5582, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
            r0 = this;
            Yue.InterfaceC0996.C0997.m5520(r0)
            return
    }

    @Override // Yue.InterfaceC5242
    public boolean isEmpty() {
            r1 = this;
            boolean r0 = r1.m329()
            return r0
    }

    @Override // Yue.InterfaceC5242
    @Yue.InterfaceC4418
    public final Yue.InterfaceC1018<E> iterator() {
            r1 = this;
            Yue.ۥ۟۟۠ۤ$ۥ r0 = new Yue.ۥ۟۟۠ۤ$ۥ
            r0.<init>(r1)
            return r0
    }

    @Override // Yue.InterfaceC5242
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @Yue.InterfaceC5313(expression = "tryReceive().getOrNull()", imports = {}))
    @Yue.InterfaceC4543
    public E poll() {
            r1 = this;
            java.lang.Object r0 = Yue.InterfaceC0996.C0997.m5523(r1)
            return r0
    }

    @Override // Yue.InterfaceC5242
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5582, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final /* synthetic */ boolean mo310(java.lang.Throwable r1) {
            r0 = this;
            boolean r1 = r0.m321(r1)
            return r1
    }

    @Override // Yue.InterfaceC5242
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void mo311(@Yue.InterfaceC4543 java.util.concurrent.CancellationException r3) {
            r2 = this;
            boolean r0 = r2.mo313()
            if (r0 == 0) goto L7
            return
        L7:
            if (r3 != 0) goto L23
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = Yue.C1758.m8350(r2)
            r0.append(r1)
            java.lang.String r1 = " was cancelled"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
        L23:
            r2.m321(r3)
            return
    }

    @Override // Yue.InterfaceC5242
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final java.lang.Object mo312(@Yue.InterfaceC4418 Yue.InterfaceC1598<? super E> r3) {
            r2 = this;
            java.lang.Object r0 = r2.mo334()
            Yue.ۥۢ۠ۦۢ r1 = Yue.C0040.f97
            if (r0 == r1) goto Ld
            boolean r1 = r0 instanceof Yue.C1174
            if (r1 != 0) goto Ld
            return r0
        Ld:
            r0 = 0
            java.lang.Object r3 = r2.m336(r0, r3)
            return r3
    }

    @Override // Yue.InterfaceC5242
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean mo313() {
            r1 = this;
            Yue.ۥ۟ۥ r0 = r1.m482()
            if (r0 == 0) goto Le
            boolean r0 = r1.mo328()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // Yue.InterfaceC5242
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final Yue.InterfaceC5562<E> mo314() {
            r1 = this;
            Yue.ۥ۟۟۠ۤ$ۥۣ۟۟۟ r0 = new Yue.ۥ۟۟۠ۤ$ۥۣ۟۟۟
            r0.<init>(r1)
            return r0
    }

    @Override // Yue.InterfaceC5242
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final Yue.InterfaceC5562<Yue.C1024<E>> mo315() {
            r1 = this;
            Yue.ۥ۟۟۠ۤ$ۥ۟۟۟ۤ r0 = new Yue.ۥ۟۟۠ۤ$ۥ۟۟۟ۤ
            r0.<init>(r1)
            return r0
    }

    @Override // Yue.InterfaceC5242
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public Yue.InterfaceC5562<E> mo316() {
            r1 = this;
            Yue.ۥۡۧۨۧ r0 = Yue.InterfaceC0996.C0997.m5521(r1)
            return r0
    }

    @Override // Yue.InterfaceC5242
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final java.lang.Object mo317() {
            r2 = this;
            java.lang.Object r0 = r2.mo334()
            Yue.ۥۢ۠ۦۢ r1 = Yue.C0040.f97
            if (r0 != r1) goto Lf
            Yue.ۥ۟ۤۢ۟$ۥ۟ r0 = Yue.C1024.f2933
            java.lang.Object r0 = r0.m5576()
            return r0
        Lf:
            boolean r1 = r0 instanceof Yue.C1174
            if (r1 == 0) goto L1e
            Yue.ۥ۟ۤۢ۟$ۥ۟ r1 = Yue.C1024.f2933
            Yue.ۥ۟ۥ r0 = (Yue.C1174) r0
            java.lang.Throwable r0 = r0.f3661
            java.lang.Object r0 = r1.m5575(r0)
            return r0
        L1e:
            Yue.ۥ۟ۤۢ۟$ۥ۟ r1 = Yue.C1024.f2933
            java.lang.Object r0 = r1.m5577(r0)
            return r0
    }

    @Override // Yue.InterfaceC5242
    @Yue.InterfaceC3834
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @Yue.InterfaceC5313(expression = "receiveCatching().getOrNull()", imports = {}))
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public java.lang.Object mo318(@Yue.InterfaceC4418 Yue.InterfaceC1598<? super E> r1) {
            r0 = this;
            java.lang.Object r1 = Yue.InterfaceC0996.C0997.m5524(r0, r1)
            return r1
    }

    @Override // Yue.InterfaceC5242
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final java.lang.Object mo319(@Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C1024<? extends E>> r5) {
            r4 = this;
            boolean r0 = r5 instanceof Yue.AbstractC0028.C0039
            if (r0 == 0) goto L13
            r0 = r5
            Yue.ۥ۟۟۠ۤ$ۥ۟۟۟ۥ r0 = (Yue.AbstractC0028.C0039) r0
            int r1 = r0.f91
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f91 = r1
            goto L18
        L13:
            Yue.ۥ۟۟۠ۤ$ۥ۟۟۟ۥ r0 = new Yue.ۥ۟۟۠ۤ$ۥ۟۟۟ۥ
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f89
            java.lang.Object r1 = Yue.C3341.m13947()
            int r2 = r0.f91
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Yue.C5391.m20403(r5)
            goto L5b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            Yue.C5391.m20403(r5)
            java.lang.Object r5 = r4.mo334()
            Yue.ۥۢ۠ۦۢ r2 = Yue.C0040.f97
            if (r5 == r2) goto L52
            boolean r0 = r5 instanceof Yue.C1174
            if (r0 == 0) goto L4b
            Yue.ۥ۟ۤۢ۟$ۥ۟ r0 = Yue.C1024.f2933
            Yue.ۥ۟ۥ r5 = (Yue.C1174) r5
            java.lang.Throwable r5 = r5.f3661
            java.lang.Object r5 = r0.m5575(r5)
            goto L51
        L4b:
            Yue.ۥ۟ۤۢ۟$ۥ۟ r0 = Yue.C1024.f2933
            java.lang.Object r5 = r0.m5577(r5)
        L51:
            return r5
        L52:
            r0.f91 = r3
            java.lang.Object r5 = r4.m336(r3, r0)
            if (r5 != r1) goto L5b
            return r1
        L5b:
            Yue.ۥ۟ۤۢ۟ r5 = (Yue.C1024) r5
            java.lang.Object r5 = r5.m5574()
            return r5
    }

    @Override // Yue.AbstractC0085
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public Yue.InterfaceC5247<E> mo320() {
            r2 = this;
            Yue.ۥۡۦۡۢ r0 = super.mo320()
            if (r0 == 0) goto Ld
            boolean r1 = r0 instanceof Yue.C1174
            if (r1 != 0) goto Ld
            r2.m332()
        Ld:
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final boolean m321(@Yue.InterfaceC4543 java.lang.Throwable r1) {
            r0 = this;
            boolean r1 = r0.mo492(r1)
            r0.mo330(r1)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public final Yue.AbstractC0028.C0035<E> m322() {
            r2 = this;
            Yue.ۥ۟۟۠ۤ$ۥ۟۟۟ۡ r0 = new Yue.ۥ۟۟۠ۤ$ۥ۟۟۟ۡ
            Yue.ۥۣ۠ۨ۠ r1 = r2.m484()
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public final boolean m323(Yue.AbstractC5241<? super E> r1) {
            r0 = this;
            boolean r1 = r0.mo324(r1)
            if (r1 == 0) goto L9
            r0.m333()
        L9:
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public boolean mo324(@Yue.InterfaceC4418 Yue.AbstractC5241<? super E> r7) {
            r6 = this;
            boolean r0 = r6.mo327()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1e
            Yue.ۥۣ۠ۨ۠ r0 = r6.m484()
        Lc:
            Yue.ۥ۠ۨ۠ۥ r3 = r0.m15172()
            boolean r4 = r3 instanceof Yue.AbstractC5593
            r4 = r4 ^ r2
            if (r4 != 0) goto L16
            goto L3b
        L16:
            boolean r3 = r3.m15163(r7, r0)
            if (r3 == 0) goto Lc
        L1c:
            r1 = r2
            goto L3b
        L1e:
            Yue.ۥۣ۠ۨ۠ r0 = r6.m484()
            Yue.ۥ۟۟۠ۤ$ۥ۟۟۟ۢ r3 = new Yue.ۥ۟۟۠ۤ$ۥ۟۟۟ۢ
            r3.<init>(r7, r6)
        L27:
            Yue.ۥ۠ۨ۠ۥ r4 = r0.m15172()
            boolean r5 = r4 instanceof Yue.AbstractC5593
            r5 = r5 ^ r2
            if (r5 != 0) goto L31
            goto L3b
        L31:
            int r4 = r4.m15180(r7, r0, r3)
            if (r4 == r2) goto L1c
            r5 = 2
            if (r4 == r5) goto L3b
            goto L27
        L3b:
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public final <R> boolean m325(Yue.InterfaceC5564<? super R> r2, Yue.InterfaceC2839<java.lang.Object, ? super Yue.InterfaceC1598<? super R>, ? extends java.lang.Object> r3, int r4) {
            r1 = this;
            Yue.ۥ۟۟۠ۤ$ۥ۟۟۟۟ r0 = new Yue.ۥ۟۟۠ۤ$ۥ۟۟۟۟
            r0.<init>(r1, r2, r3, r4)
            boolean r3 = r1.m323(r0)
            if (r3 == 0) goto Le
            r2.mo20848(r0)
        Le:
            return r3
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public final boolean m326() {
            r1 = this;
            Yue.ۥۣ۠ۨ۠ r0 = r1.m484()
            Yue.ۥ۠ۨ۠ۥ r0 = r0.m15171()
            boolean r0 = r0 instanceof Yue.InterfaceC5247
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public abstract boolean mo327();

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public abstract boolean mo328();

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public final boolean m329() {
            r1 = this;
            Yue.ۥۣ۠ۨ۠ r0 = r1.m484()
            Yue.ۥ۠ۨ۠ۥ r0 = r0.m15171()
            boolean r0 = r0 instanceof Yue.AbstractC5593
            if (r0 != 0) goto L14
            boolean r0 = r1.mo328()
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public void mo330(boolean r4) {
            r3 = this;
            Yue.ۥ۟ۥ r4 = r3.m483()
            if (r4 == 0) goto L29
            r0 = 1
            r1 = 0
            java.lang.Object r0 = Yue.C3248.m13676(r1, r0, r1)
        Lc:
            Yue.ۥ۠ۨ۠ۥ r1 = r4.m15172()
            boolean r2 = r1 instanceof Yue.C3781
            if (r2 == 0) goto L18
            r3.mo331(r0, r4)
            return
        L18:
            boolean r2 = r1.mo15143()
            if (r2 != 0) goto L22
            r1.m15173()
            goto Lc
        L22:
            Yue.ۥۡۨ۠ۦ r1 = (Yue.AbstractC5593) r1
            java.lang.Object r0 = Yue.C3248.m13681(r0, r1)
            goto Lc
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot happen"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public void mo331(@Yue.InterfaceC4418 java.lang.Object r3, @Yue.InterfaceC4418 Yue.C1174<?> r4) {
            r2 = this;
            if (r3 == 0) goto L23
            boolean r0 = r3 instanceof java.util.ArrayList
            if (r0 != 0) goto Lc
            Yue.ۥۡۨ۠ۦ r3 = (Yue.AbstractC5593) r3
            r3.mo508(r4)
            goto L23
        Lc:
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r0 = r3.size()
            int r0 = r0 + (-1)
        L14:
            r1 = -1
            if (r1 >= r0) goto L23
            java.lang.Object r1 = r3.get(r0)
            Yue.ۥۡۨ۠ۦ r1 = (Yue.AbstractC5593) r1
            r1.mo508(r4)
            int r0 = r0 + (-1)
            goto L14
        L23:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public void m332() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public void m333() {
            r0 = this;
            return
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public java.lang.Object mo334() {
            r2 = this;
        L0:
            Yue.ۥۡۨ۠ۦ r0 = r2.m505()
            if (r0 != 0) goto L9
            Yue.ۥۢ۠ۦۢ r0 = Yue.C0040.f97
            return r0
        L9:
            r1 = 0
            Yue.ۥۢ۠ۦۢ r1 = r0.mo509(r1)
            if (r1 == 0) goto L18
            r0.mo506()
            java.lang.Object r0 = r0.mo507()
            return r0
        L18:
            r0.mo510()
            goto L0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public java.lang.Object mo335(@Yue.InterfaceC4418 Yue.InterfaceC5564<?> r2) {
            r1 = this;
            Yue.ۥ۟۟۠ۤ$ۥ۟۟۟ۡ r0 = r1.m322()
            java.lang.Object r2 = r2.mo20843(r0)
            if (r2 == 0) goto Lb
            return r2
        Lb:
            java.lang.Object r2 = r0.m15192()
            Yue.ۥۡۨ۠ۦ r2 = (Yue.AbstractC5593) r2
            r2.mo506()
            java.lang.Object r2 = r0.m15192()
            Yue.ۥۡۨ۠ۦ r2 = (Yue.AbstractC5593) r2
            java.lang.Object r2 = r2.mo507()
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public final <R> java.lang.Object m336(int r4, Yue.InterfaceC1598<? super R> r5) {
            r3 = this;
            Yue.ۥ۟ۧۤۢ r0 = Yue.C3332.m13940(r5)
            Yue.ۥۣ۟ۨ۠ r0 = Yue.C0936.m5346(r0)
            Yue.ۥۣ۠ۡ۟<E, Yue.ۥۣۢ۠ۤ> r1 = r3.f165
            if (r1 != 0) goto L12
            Yue.ۥ۟۟۠ۤ$ۥ۟ r1 = new Yue.ۥ۟۟۠ۤ$ۥ۟
            r1.<init>(r0, r4)
            goto L19
        L12:
            Yue.ۥ۟۟۠ۤ$ۥ۟۟ r1 = new Yue.ۥ۟۟۠ۤ$ۥ۟۟
            Yue.ۥۣ۠ۡ۟<E, Yue.ۥۣۢ۠ۤ> r2 = r3.f165
            r1.<init>(r0, r4, r2)
        L19:
            boolean r4 = m306(r3, r1)
            if (r4 == 0) goto L23
            m309(r3, r0, r1)
            goto L40
        L23:
            java.lang.Object r4 = r3.mo334()
            boolean r2 = r4 instanceof Yue.C1174
            if (r2 == 0) goto L31
            Yue.ۥ۟ۥ r4 = (Yue.C1174) r4
            r1.mo349(r4)
            goto L40
        L31:
            Yue.ۥۢ۠ۦۢ r2 = Yue.C0040.f97
            if (r4 == r2) goto L19
            java.lang.Object r2 = r1.m350(r4)
            Yue.ۥۣ۠ۡ۟ r4 = r1.mo351(r4)
            r0.mo5301(r2, r4)
        L40:
            java.lang.Object r4 = r0.m5329()
            java.lang.Object r0 = Yue.C3341.m13947()
            if (r4 != r0) goto L4d
            Yue.C1757.m8349(r5)
        L4d:
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public final <R> void m337(Yue.InterfaceC5564<? super R> r3, int r4, Yue.InterfaceC2839<java.lang.Object, ? super Yue.InterfaceC1598<? super R>, ? extends java.lang.Object> r5) {
            r2 = this;
        L0:
            boolean r0 = r3.mo20845()
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r2.m329()
            if (r0 == 0) goto L14
            boolean r0 = r2.m325(r3, r5, r4)
            if (r0 == 0) goto L0
            return
        L14:
            java.lang.Object r0 = r2.mo335(r3)
            java.lang.Object r1 = Yue.C5566.m20861()
            if (r0 != r1) goto L1f
            return
        L1f:
            Yue.ۥۢ۠ۦۢ r1 = Yue.C0040.f97
            if (r0 == r1) goto L0
            java.lang.Object r1 = Yue.C0640.f1626
            if (r0 == r1) goto L0
            r2.m339(r5, r3, r4, r0)
            goto L0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public final void m338(Yue.InterfaceC0932<?> r2, Yue.AbstractC5241<?> r3) {
            r1 = this;
            Yue.ۥ۟۟۠ۤ$ۥ۟۟۟۠ r0 = new Yue.ۥ۟۟۠ۤ$ۥ۟۟۟۠
            r0.<init>(r1, r3)
            r2.mo5308(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public final <R> void m339(Yue.InterfaceC2839<java.lang.Object, ? super Yue.InterfaceC1598<? super R>, ? extends java.lang.Object> r3, Yue.InterfaceC5564<? super R> r4, int r5, java.lang.Object r6) {
            r2 = this;
            boolean r0 = r6 instanceof Yue.C1174
            r1 = 1
            if (r0 == 0) goto L32
            if (r5 == 0) goto L27
            if (r5 == r1) goto La
            goto L58
        La:
            boolean r5 = r4.mo20844()
            if (r5 != 0) goto L11
            return
        L11:
            Yue.ۥ۟ۤۢ۟$ۥ۟ r5 = Yue.C1024.f2933
            Yue.ۥ۟ۥ r6 = (Yue.C1174) r6
            java.lang.Throwable r6 = r6.f3661
            java.lang.Object r5 = r5.m5575(r6)
            Yue.ۥ۟ۤۢ۟ r5 = Yue.C1024.m5561(r5)
            Yue.ۥ۟ۧۤۢ r4 = r4.mo20846()
            Yue.C6589.m25378(r3, r5, r4)
            goto L58
        L27:
            Yue.ۥ۟ۥ r6 = (Yue.C1174) r6
            java.lang.Throwable r3 = r6.m6119()
            java.lang.Throwable r3 = Yue.C5912.m21959(r3)
            throw r3
        L32:
            if (r5 != r1) goto L51
            Yue.ۥ۟ۤۢ۟$ۥ۟ r5 = Yue.C1024.f2933
            if (r0 == 0) goto L41
            Yue.ۥ۟ۥ r6 = (Yue.C1174) r6
            java.lang.Throwable r6 = r6.f3661
            java.lang.Object r5 = r5.m5575(r6)
            goto L45
        L41:
            java.lang.Object r5 = r5.m5577(r6)
        L45:
            Yue.ۥ۟ۤۢ۟ r5 = Yue.C1024.m5561(r5)
            Yue.ۥ۟ۧۤۢ r4 = r4.mo20846()
            Yue.C6589.m25378(r3, r5, r4)
            goto L58
        L51:
            Yue.ۥ۟ۧۤۢ r4 = r4.mo20846()
            Yue.C6589.m25378(r3, r6, r4)
        L58:
            return
    }
}
