package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0085<E> implements Yue.InterfaceC5599<E> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f164 = null;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ java.lang.Object onCloseHandler;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC3417
    @Yue.InterfaceC4543
    public final Yue.InterfaceC2825<E, Yue.C6593> f165;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C3781 f166;

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۢۢ$ۥ, reason: contains not printable characters */
    public static final class C0086<E> extends Yue.AbstractC5593 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        @Yue.InterfaceC3417
        public final E f167;

        public C0086(E r1) {
                r0 = this;
                r0.<init>()
                r0.f167 = r1
                return
        }

        @Override // Yue.C3783
        @Yue.InterfaceC4418
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "SendBuffered@"
                r0.append(r1)
                java.lang.String r1 = Yue.C1758.m8351(r2)
                r0.append(r1)
                r1 = 40
                r0.append(r1)
                E r1 = r2.f167
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // Yue.AbstractC5593
        /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
        public void mo506() {
                r0 = this;
                return
        }

        @Override // Yue.AbstractC5593
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
        public java.lang.Object mo507() {
                r1 = this;
                E r0 = r1.f167
                return r0
        }

        @Override // Yue.AbstractC5593
        /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
        public void mo508(@Yue.InterfaceC4418 Yue.C1174<?> r1) {
                r0 = this;
                return
        }

        @Override // Yue.AbstractC5593
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
        public Yue.C6075 mo509(@Yue.InterfaceC4543 Yue.C3783.C3787 r2) {
                r1 = this;
                Yue.ۥۢ۠ۦۢ r0 = Yue.C0935.f2703
                if (r2 == 0) goto L7
                r2.m15190()
            L7:
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۢۢ$ۥ۟, reason: contains not printable characters */
    public static class C0087<E> extends Yue.C3783.C3785<Yue.AbstractC0085.C0086<? extends E>> {
        public C0087(@Yue.InterfaceC4418 Yue.C3781 r2, E r3) {
                r1 = this;
                Yue.ۥ۟۟ۢۢ$ۥ r0 = new Yue.ۥ۟۟ۢۢ$ۥ
                r0.<init>(r3)
                r1.<init>(r2, r0)
                return
        }

        @Override // Yue.C3783.AbstractC3784
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public java.lang.Object mo354(@Yue.InterfaceC4418 Yue.C3783 r2) {
                r1 = this;
                boolean r0 = r2 instanceof Yue.C1174
                if (r0 == 0) goto L5
                goto Ld
            L5:
                boolean r2 = r2 instanceof Yue.InterfaceC5247
                if (r2 == 0) goto Lc
                Yue.ۥۢ۠ۦۢ r2 = Yue.C0040.f96
                goto Ld
            Lc:
                r2 = 0
            Ld:
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۢۢ$ۥ۟۟, reason: contains not printable characters */
    public static final class C0088<E, R> extends Yue.AbstractC5593 implements Yue.InterfaceC1892 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final E f168;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        @Yue.InterfaceC3417
        public final Yue.AbstractC0085<E> f169;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        @Yue.InterfaceC3417
        public final Yue.InterfaceC5564<R> f170;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        @Yue.InterfaceC3417
        public final Yue.InterfaceC2839<Yue.InterfaceC5599<? super E>, Yue.InterfaceC1598<? super R>, java.lang.Object> f171;

        public C0088(E r1, @Yue.InterfaceC4418 Yue.AbstractC0085<E> r2, @Yue.InterfaceC4418 Yue.InterfaceC5564<? super R> r3, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super Yue.InterfaceC5599<? super E>, ? super Yue.InterfaceC1598<? super R>, ? extends java.lang.Object> r4) {
                r0 = this;
                r0.<init>()
                r0.f168 = r1
                r0.f169 = r2
                r0.f170 = r3
                r0.f171 = r4
                return
        }

        @Override // Yue.C3783
        @Yue.InterfaceC4418
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "SendSelect@"
                r0.append(r1)
                java.lang.String r1 = Yue.C1758.m8351(r2)
                r0.append(r1)
                r1 = 40
                r0.append(r1)
                java.lang.Object r1 = r2.mo507()
                r0.append(r1)
                java.lang.String r1 = ")["
                r0.append(r1)
                Yue.ۥ۟۟ۢۢ<E> r1 = r2.f169
                r0.append(r1)
                java.lang.String r1 = ", "
                r0.append(r1)
                Yue.ۥۡۨ<R> r1 = r2.f170
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // Yue.InterfaceC1892
        /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
        public void mo352() {
                r1 = this;
                boolean r0 = r1.mo15143()
                if (r0 != 0) goto L7
                return
            L7:
                r1.mo510()
                return
        }

        @Override // Yue.AbstractC5593
        /* JADX INFO: renamed from: ۥ۟۟ۦۤ */
        public void mo506() {
                r6 = this;
                Yue.ۥۣ۠ۢۢ<Yue.ۥۡۨۡ۠<? super E>, Yue.ۥ۟ۧۤۢ<? super R>, java.lang.Object> r0 = r6.f171
                Yue.ۥ۟۟ۢۢ<E> r1 = r6.f169
                Yue.ۥۡۨ<R> r2 = r6.f170
                Yue.ۥ۟ۧۤۢ r2 = r2.mo20846()
                r4 = 4
                r5 = 0
                r3 = 0
                Yue.C0941.m5358(r0, r1, r2, r3, r4, r5)
                return
        }

        @Override // Yue.AbstractC5593
        /* JADX INFO: renamed from: ۥ۟۟ۦۥ */
        public E mo507() {
                r1 = this;
                E r0 = r1.f168
                return r0
        }

        @Override // Yue.AbstractC5593
        /* JADX INFO: renamed from: ۥ۟۟ۦۦ */
        public void mo508(@Yue.InterfaceC4418 Yue.C1174<?> r2) {
                r1 = this;
                Yue.ۥۡۨ<R> r0 = r1.f170
                boolean r0 = r0.mo20844()
                if (r0 == 0) goto L11
                Yue.ۥۡۨ<R> r0 = r1.f170
                java.lang.Throwable r2 = r2.m6120()
                r0.mo20847(r2)
            L11:
                return
        }

        @Override // Yue.AbstractC5593
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟ۦۧ */
        public Yue.C6075 mo509(@Yue.InterfaceC4543 Yue.C3783.C3787 r2) {
                r1 = this;
                Yue.ۥۡۨ<R> r0 = r1.f170
                java.lang.Object r2 = r0.mo20842(r2)
                Yue.ۥۢ۠ۦۢ r2 = (Yue.C6075) r2
                return r2
        }

        @Override // Yue.AbstractC5593
        /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
        public void mo510() {
                r3 = this;
                Yue.ۥ۟۟ۢۢ<E> r0 = r3.f169
                Yue.ۥۣ۠ۡ۟<E, Yue.ۥۣۢ۠ۤ> r0 = r0.f165
                if (r0 == 0) goto L17
                java.lang.Object r1 = r3.mo507()
                Yue.ۥۡۨ<R> r2 = r3.f170
                Yue.ۥ۟ۧۤۢ r2 = r2.mo20846()
                Yue.ۥ۟ۧۦۥ r2 = r2.getContext()
                Yue.C4622.m18433(r0, r1, r2)
            L17:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۢۢ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C0089<E> extends Yue.C3783.C3788<Yue.InterfaceC5247<? super E>> {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @Yue.InterfaceC3417
        public final E f172;

        public C0089(E r1, @Yue.InterfaceC4418 Yue.C3781 r2) {
                r0 = this;
                r0.<init>(r2)
                r0.f172 = r1
                return
        }

        @Override // Yue.C3783.C3788, Yue.C3783.AbstractC3784
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public java.lang.Object mo354(@Yue.InterfaceC4418 Yue.C3783 r2) {
                r1 = this;
                boolean r0 = r2 instanceof Yue.C1174
                if (r0 == 0) goto L5
                goto Ld
            L5:
                boolean r2 = r2 instanceof Yue.InterfaceC5247
                if (r2 != 0) goto Lc
                Yue.ۥۢ۠ۦۢ r2 = Yue.C0040.f96
                goto Ld
            Lc:
                r2 = 0
            Ld:
                return r2
        }

        @Override // Yue.C3783.AbstractC3784
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public java.lang.Object mo355(@Yue.InterfaceC4418 Yue.C3783.C3787 r3) {
                r2 = this;
                Yue.ۥ۠ۨ۠ۥ r0 = r3.f12001
                Yue.ۥۡۦۡۢ r0 = (Yue.InterfaceC5247) r0
                E r1 = r2.f172
                Yue.ۥۢ۠ۦۢ r3 = r0.mo347(r1, r3)
                if (r3 != 0) goto Lf
                java.lang.Object r3 = Yue.C3791.f12008
                return r3
            Lf:
                java.lang.Object r0 = Yue.C0640.f1626
                if (r3 != r0) goto L14
                return r0
            L14:
                r3 = 0
                return r3
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۢۢ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C0090 extends Yue.C3783.AbstractC3786 {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC0085 f173;

        public C0090(Yue.C3783 r1, Yue.AbstractC0085 r2) {
                r0 = this;
                r0.f173 = r2
                r0.<init>(r1)
                return
        }

        @Override // Yue.AbstractC0641
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public /* bridge */ /* synthetic */ java.lang.Object mo357(Yue.C3783 r1) {
                r0 = this;
                Yue.ۥ۠ۨ۠ۥ r1 = (Yue.C3783) r1
                java.lang.Object r1 = r0.m511(r1)
                return r1
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public java.lang.Object m511(@Yue.InterfaceC4418 Yue.C3783 r1) {
                r0 = this;
                Yue.ۥ۟۟ۢۢ r1 = r0.f173
                boolean r1 = r1.mo494()
                if (r1 == 0) goto La
                r1 = 0
                goto Le
            La:
                java.lang.Object r1 = Yue.C3782.m15148()
            Le:
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۢۢ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C0091 implements Yue.InterfaceC5563<E, Yue.InterfaceC5599<? super E>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC0085<E> f174;

        public C0091(Yue.AbstractC0085<E> r1) {
                r0 = this;
                r0.f174 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC5563
        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public <R> void mo512(@Yue.InterfaceC4418 Yue.InterfaceC5564<? super R> r2, E r3, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super Yue.InterfaceC5599<? super E>, ? super Yue.InterfaceC1598<? super R>, ? extends java.lang.Object> r4) {
                r1 = this;
                Yue.ۥ۟۟ۢۢ<E> r0 = r1.f174
                Yue.AbstractC0085.m474(r0, r2, r3, r4)
                return
        }
    }

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "onCloseHandler"
            java.lang.Class<Yue.ۥ۟۟ۢۢ> r2 = Yue.AbstractC0085.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            Yue.AbstractC0085.f164 = r0
            return
    }

    public AbstractC0085(@Yue.InterfaceC4543 Yue.InterfaceC2825<? super E, Yue.C6593> r1) {
            r0 = this;
            r0.<init>()
            r0.f165 = r1
            Yue.ۥۣ۠ۨ۠ r1 = new Yue.ۥۣ۠ۨ۠
            r1.<init>()
            r0.f166 = r1
            r1 = 0
            r0.onCloseHandler = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final /* synthetic */ void m472(Yue.AbstractC0085 r0, Yue.InterfaceC1598 r1, java.lang.Object r2, Yue.C1174 r3) {
            r0.m490(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ boolean m473(Yue.AbstractC0085 r0) {
            boolean r0 = r0.m496()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final /* synthetic */ void m474(Yue.AbstractC0085 r0, Yue.InterfaceC5564 r1, java.lang.Object r2, Yue.InterfaceC2839 r3) {
            r0.m502(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Object m475(Yue.AbstractC0085 r0, java.lang.Object r1, Yue.InterfaceC1598 r2) {
            java.lang.Object r0 = r0.m504(r1, r2)
            return r0
    }

    @Override // Yue.InterfaceC5599
    public boolean offer(E r5) {
            r4 = this;
            boolean r5 = Yue.InterfaceC5599.C5600.m20961(r4, r5)     // Catch: java.lang.Throwable -> L5
            return r5
        L5:
            r0 = move-exception
            Yue.ۥۣ۠ۡ۟<E, Yue.ۥۣۢ۠ۤ> r1 = r4.f165
            if (r1 == 0) goto L16
            r2 = 2
            r3 = 0
            Yue.ۥۣۢ۟ۨ r5 = Yue.C4622.m18435(r1, r5, r3, r2, r3)
            if (r5 == 0) goto L16
            Yue.C2268.m10468(r5, r0)
            throw r5
        L16:
            throw r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = Yue.C1758.m8350(r2)
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = Yue.C1758.m8351(r2)
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            java.lang.String r1 = r2.m485()
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r1 = r2.mo481()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC5599
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final java.lang.Object mo476(E r3, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r4) {
            r2 = this;
            java.lang.Object r0 = r2.mo497(r3)
            Yue.ۥۢ۠ۦۢ r1 = Yue.C0040.f95
            if (r0 != r1) goto Lb
            Yue.ۥۣۢ۠ۤ r3 = Yue.C6593.f23016
            return r3
        Lb:
            java.lang.Object r3 = r2.m504(r3, r4)
            java.lang.Object r4 = Yue.C3341.m13947()
            if (r3 != r4) goto L16
            return r3
        L16:
            Yue.ۥۣۢ۠ۤ r3 = Yue.C6593.f23016
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final int m477() {
            r4 = this;
            Yue.ۥۣ۠ۨ۠ r0 = r4.f166
            java.lang.Object r1 = r0.m15170()
            Yue.ۥ۠ۨ۠ۥ r1 = (Yue.C3783) r1
            r2 = 0
        L9:
            boolean r3 = Yue.C3329.m13897(r1, r0)
            if (r3 != 0) goto L1a
            boolean r3 = r1 instanceof Yue.C3783
            if (r3 == 0) goto L15
            int r2 = r2 + 1
        L15:
            Yue.ۥ۠ۨ۠ۥ r1 = r1.m15171()
            goto L9
        L1a:
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final Yue.C3783.C3785<?> m478(E r3) {
            r2 = this;
            Yue.ۥ۟۟ۢۢ$ۥ۟ r0 = new Yue.ۥ۟۟ۢۢ$ۥ۟
            Yue.ۥۣ۠ۨ۠ r1 = r2.f166
            r0.<init>(r1, r3)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final Yue.AbstractC0085.C0089<E> m479(E r3) {
            r2 = this;
            Yue.ۥ۟۟ۢۢ$ۥ۟۟۟ r0 = new Yue.ۥ۟۟ۢۢ$ۥ۟۟۟
            Yue.ۥۣ۠ۨ۠ r1 = r2.f166
            r0.<init>(r3, r1)
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public java.lang.Object mo480(@Yue.InterfaceC4418 Yue.AbstractC5593 r5) {
            r4 = this;
            boolean r0 = r4.mo493()
            if (r0 == 0) goto L18
            Yue.ۥۣ۠ۨ۠ r0 = r4.f166
        L8:
            Yue.ۥ۠ۨ۠ۥ r1 = r0.m15172()
            boolean r2 = r1 instanceof Yue.InterfaceC5247
            if (r2 == 0) goto L11
            return r1
        L11:
            boolean r1 = r1.m15163(r5, r0)
            if (r1 == 0) goto L8
            goto L36
        L18:
            Yue.ۥۣ۠ۨ۠ r0 = r4.f166
            Yue.ۥ۟۟ۢۢ$ۥ۟۟۟۟ r1 = new Yue.ۥ۟۟ۢۢ$ۥ۟۟۟۟
            r1.<init>(r5, r4)
        L1f:
            Yue.ۥ۠ۨ۠ۥ r2 = r0.m15172()
            boolean r3 = r2 instanceof Yue.InterfaceC5247
            if (r3 == 0) goto L28
            return r2
        L28:
            int r2 = r2.m15180(r5, r0, r1)
            r3 = 1
            if (r2 == r3) goto L36
            r3 = 2
            if (r2 == r3) goto L33
            goto L1f
        L33:
            Yue.ۥۢ۠ۦۢ r5 = Yue.C0040.f98
            return r5
        L36:
            r5 = 0
            return r5
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public java.lang.String mo481() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final Yue.C1174<?> m482() {
            r3 = this;
            Yue.ۥۣ۠ۨ۠ r0 = r3.f166
            Yue.ۥ۠ۨ۠ۥ r0 = r0.m15171()
            boolean r1 = r0 instanceof Yue.C1174
            r2 = 0
            if (r1 == 0) goto Le
            Yue.ۥ۟ۥ r0 = (Yue.C1174) r0
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 == 0) goto L15
            r3.m486(r0)
            r2 = r0
        L15:
            return r2
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final Yue.C1174<?> m483() {
            r3 = this;
            Yue.ۥۣ۠ۨ۠ r0 = r3.f166
            Yue.ۥ۠ۨ۠ۥ r0 = r0.m15172()
            boolean r1 = r0 instanceof Yue.C1174
            r2 = 0
            if (r1 == 0) goto Le
            Yue.ۥ۟ۥ r0 = (Yue.C1174) r0
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 == 0) goto L15
            r3.m486(r0)
            r2 = r0
        L15:
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final Yue.C3781 m484() {
            r1 = this;
            Yue.ۥۣ۠ۨ۠ r0 = r1.f166
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final java.lang.String m485() {
            r3 = this;
            Yue.ۥۣ۠ۨ۠ r0 = r3.f166
            Yue.ۥ۠ۨ۠ۥ r0 = r0.m15171()
            Yue.ۥۣ۠ۨ۠ r1 = r3.f166
            if (r0 != r1) goto Ld
            java.lang.String r0 = "EmptyQueue"
            return r0
        Ld:
            boolean r1 = r0 instanceof Yue.C1174
            if (r1 == 0) goto L16
            java.lang.String r1 = r0.toString()
            goto L35
        L16:
            boolean r1 = r0 instanceof Yue.AbstractC5241
            if (r1 == 0) goto L1d
            java.lang.String r1 = "ReceiveQueued"
            goto L35
        L1d:
            boolean r1 = r0 instanceof Yue.AbstractC5593
            if (r1 == 0) goto L24
            java.lang.String r1 = "SendQueued"
            goto L35
        L24:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "UNEXPECTED:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
        L35:
            Yue.ۥۣ۠ۨ۠ r2 = r3.f166
            Yue.ۥ۠ۨ۠ۥ r2 = r2.m15172()
            if (r2 == r0) goto L6d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = ",queueSize="
            r0.append(r1)
            int r1 = r3.m477()
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            boolean r0 = r2 instanceof Yue.C1174
            if (r0 == 0) goto L6d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = ",closedForSend="
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
        L6d:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final void m486(Yue.C1174<?> r6) {
            r5 = this;
            r0 = 0
            r1 = 1
            java.lang.Object r2 = Yue.C3248.m13676(r0, r1, r0)
        L6:
            Yue.ۥ۠ۨ۠ۥ r3 = r6.m15172()
            boolean r4 = r3 instanceof Yue.AbstractC5241
            if (r4 == 0) goto L11
            Yue.ۥۡۦۡ۠ r3 = (Yue.AbstractC5241) r3
            goto L12
        L11:
            r3 = r0
        L12:
            if (r3 != 0) goto L3a
            if (r2 == 0) goto L36
            boolean r0 = r2 instanceof java.util.ArrayList
            if (r0 != 0) goto L20
            Yue.ۥۡۦۡ۠ r2 = (Yue.AbstractC5241) r2
            r2.mo349(r6)
            goto L36
        L20:
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r0 = r2.size()
            int r0 = r0 - r1
        L27:
            r1 = -1
            if (r1 >= r0) goto L36
            java.lang.Object r1 = r2.get(r0)
            Yue.ۥۡۦۡ۠ r1 = (Yue.AbstractC5241) r1
            r1.mo349(r6)
            int r0 = r0 + (-1)
            goto L27
        L36:
            r5.m501(r6)
            return
        L3a:
            boolean r4 = r3.mo15143()
            if (r4 != 0) goto L44
            r3.m15173()
            goto L6
        L44:
            java.lang.Object r2 = Yue.C3248.m13681(r2, r3)
            goto L6
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final java.lang.Throwable m487(Yue.C1174<?> r1) {
            r0 = this;
            r0.m486(r1)
            java.lang.Throwable r1 = r1.m6120()
            return r1
    }

    @Override // Yue.InterfaceC5599
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final Yue.InterfaceC5563<E, Yue.InterfaceC5599<E>> mo488() {
            r1 = this;
            Yue.ۥ۟۟ۢۢ$ۥ۟۟۟۠ r0 = new Yue.ۥ۟۟ۢۢ$ۥ۟۟۟۠
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final java.lang.Throwable m489(E r4, Yue.C1174<?> r5) {
            r3 = this;
            r3.m486(r5)
            Yue.ۥۣ۠ۡ۟<E, Yue.ۥۣۢ۠ۤ> r0 = r3.f165
            if (r0 == 0) goto L18
            r1 = 2
            r2 = 0
            Yue.ۥۣۢ۟ۨ r4 = Yue.C4622.m18435(r0, r4, r2, r1, r2)
            if (r4 != 0) goto L10
            goto L18
        L10:
            java.lang.Throwable r5 = r5.m6120()
            Yue.C2268.m10468(r4, r5)
            throw r4
        L18:
            java.lang.Throwable r4 = r5.m6120()
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final void m490(Yue.InterfaceC1598<?> r4, E r5, Yue.C1174<?> r6) {
            r3 = this;
            r3.m486(r6)
            java.lang.Throwable r6 = r6.m6120()
            Yue.ۥۣ۠ۡ۟<E, Yue.ۥۣۢ۠ۤ> r0 = r3.f165
            if (r0 == 0) goto L24
            r1 = 2
            r2 = 0
            Yue.ۥۣۢ۟ۨ r5 = Yue.C4622.m18435(r0, r5, r2, r1, r2)
            if (r5 == 0) goto L24
            Yue.C2268.m10468(r5, r6)
            Yue.ۥۡۦۧۤ$ۥ r6 = Yue.C5388.f20029
            java.lang.Object r5 = Yue.C5391.m20390(r5)
            java.lang.Object r5 = Yue.C5388.m20377(r5)
            r4.resumeWith(r5)
            return
        L24:
            Yue.ۥۡۦۧۤ$ۥ r5 = Yue.C5388.f20029
            java.lang.Object r5 = Yue.C5391.m20390(r6)
            java.lang.Object r5 = Yue.C5388.m20377(r5)
            r4.resumeWith(r5)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m491(java.lang.Throwable r4) {
            r3 = this;
            java.lang.Object r0 = r3.onCloseHandler
            if (r0 == 0) goto L1a
            Yue.ۥۢ۠ۦۢ r1 = Yue.C0040.f99
            if (r0 == r1) goto L1a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = Yue.AbstractC0085.f164
            boolean r1 = Yue.C0084.m471(r2, r3, r0, r1)
            if (r1 == 0) goto L1a
            r1 = 1
            java.lang.Object r0 = Yue.C6466.m23830(r0, r1)
            Yue.ۥۣ۠ۡ۟ r0 = (Yue.InterfaceC2825) r0
            r0.invoke(r4)
        L1a:
            return
    }

    @Override // Yue.InterfaceC5599
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public boolean mo492(@Yue.InterfaceC4543 java.lang.Throwable r6) {
            r5 = this;
            Yue.ۥ۟ۥ r0 = new Yue.ۥ۟ۥ
            r0.<init>(r6)
            Yue.ۥۣ۠ۨ۠ r1 = r5.f166
        L7:
            Yue.ۥ۠ۨ۠ۥ r2 = r1.m15172()
            boolean r3 = r2 instanceof Yue.C1174
            r4 = 1
            r3 = r3 ^ r4
            if (r3 != 0) goto L13
            r4 = 0
            goto L19
        L13:
            boolean r2 = r2.m15163(r0, r1)
            if (r2 == 0) goto L7
        L19:
            if (r4 == 0) goto L1c
            goto L24
        L1c:
            Yue.ۥۣ۠ۨ۠ r0 = r5.f166
            Yue.ۥ۠ۨ۠ۥ r0 = r0.m15172()
            Yue.ۥ۟ۥ r0 = (Yue.C1174) r0
        L24:
            r5.m486(r0)
            if (r4 == 0) goto L2c
            r5.m491(r6)
        L2c:
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public abstract boolean mo493();

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public abstract boolean mo494();

    @Override // Yue.InterfaceC5599
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final java.lang.Object mo495(E r4) {
            r3 = this;
            java.lang.Object r4 = r3.mo497(r4)
            Yue.ۥۢ۠ۦۢ r0 = Yue.C0040.f95
            if (r4 != r0) goto L11
            Yue.ۥ۟ۤۢ۟$ۥ۟ r4 = Yue.C1024.f2933
            Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016
            java.lang.Object r4 = r4.m5577(r0)
            goto L3d
        L11:
            Yue.ۥۢ۠ۦۢ r0 = Yue.C0040.f96
            if (r4 != r0) goto L2d
            Yue.ۥ۟ۥ r4 = r3.m483()
            if (r4 != 0) goto L22
            Yue.ۥ۟ۤۢ۟$ۥ۟ r4 = Yue.C1024.f2933
            java.lang.Object r4 = r4.m5576()
            return r4
        L22:
            Yue.ۥ۟ۤۢ۟$ۥ۟ r0 = Yue.C1024.f2933
            java.lang.Throwable r4 = r3.m487(r4)
            java.lang.Object r4 = r0.m5575(r4)
            goto L3d
        L2d:
            boolean r0 = r4 instanceof Yue.C1174
            if (r0 == 0) goto L3e
            Yue.ۥ۟ۤۢ۟$ۥ۟ r0 = Yue.C1024.f2933
            Yue.ۥ۟ۥ r4 = (Yue.C1174) r4
            java.lang.Throwable r4 = r3.m487(r4)
            java.lang.Object r4 = r0.m5575(r4)
        L3d:
            return r4
        L3e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "trySend returned "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final boolean m496() {
            r1 = this;
            Yue.ۥۣ۠ۨ۠ r0 = r1.f166
            Yue.ۥ۠ۨ۠ۥ r0 = r0.m15171()
            boolean r0 = r0 instanceof Yue.InterfaceC5247
            if (r0 != 0) goto L12
            boolean r0 = r1.mo494()
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public java.lang.Object mo497(E r3) {
            r2 = this;
        L0:
            Yue.ۥۡۦۡۢ r0 = r2.mo320()
            if (r0 != 0) goto L9
            Yue.ۥۢ۠ۦۢ r3 = Yue.C0040.f96
            return r3
        L9:
            r1 = 0
            Yue.ۥۢ۠ۦۢ r1 = r0.mo347(r3, r1)
            if (r1 == 0) goto L0
            r0.mo348(r3)
            java.lang.Object r3 = r0.mo6116()
            return r3
    }

    @Override // Yue.InterfaceC5599
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public void mo498(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.AbstractC0085.f164
            r1 = 0
            boolean r1 = Yue.C0084.m471(r0, r3, r1, r4)
            if (r1 != 0) goto L2e
            java.lang.Object r4 = r3.onCloseHandler
            Yue.ۥۢ۠ۦۢ r0 = Yue.C0040.f99
            if (r4 != r0) goto L17
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Another handler was already registered and successfully invoked"
            r4.<init>(r0)
            throw r4
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Another handler was already registered: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L2e:
            Yue.ۥ۟ۥ r1 = r3.m483()
            if (r1 == 0) goto L41
            Yue.ۥۢ۠ۦۢ r2 = Yue.C0040.f99
            boolean r0 = Yue.C0084.m471(r0, r3, r4, r2)
            if (r0 == 0) goto L41
            java.lang.Throwable r0 = r1.f3661
            r4.invoke(r0)
        L41:
            return
    }

    @Override // Yue.InterfaceC5599
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public final boolean mo499() {
            r1 = this;
            Yue.ۥ۟ۥ r0 = r1.m483()
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public java.lang.Object mo500(E r2, @Yue.InterfaceC4418 Yue.InterfaceC5564<?> r3) {
            r1 = this;
            Yue.ۥ۟۟ۢۢ$ۥ۟۟۟ r0 = r1.m479(r2)
            java.lang.Object r3 = r3.mo20843(r0)
            if (r3 == 0) goto Lb
            return r3
        Lb:
            java.lang.Object r3 = r0.m15192()
            Yue.ۥۡۦۡۢ r3 = (Yue.InterfaceC5247) r3
            r3.mo348(r2)
            java.lang.Object r2 = r3.mo6116()
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void m501(@Yue.InterfaceC4418 Yue.C3783 r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public final <R> void m502(Yue.InterfaceC5564<? super R> r3, E r4, Yue.InterfaceC2839<? super Yue.InterfaceC5599<? super E>, ? super Yue.InterfaceC1598<? super R>, ? extends java.lang.Object> r5) {
            r2 = this;
        L0:
            boolean r0 = r3.mo20845()
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r2.m496()
            if (r0 == 0) goto L54
            Yue.ۥ۟۟ۢۢ$ۥ۟۟ r0 = new Yue.ۥ۟۟ۢۢ$ۥ۟۟
            r0.<init>(r4, r2, r3, r5)
            java.lang.Object r1 = r2.mo480(r0)
            if (r1 != 0) goto L1c
            r3.mo20848(r0)
            return
        L1c:
            boolean r0 = r1 instanceof Yue.C1174
            if (r0 != 0) goto L49
            Yue.ۥۢ۠ۦۢ r0 = Yue.C0040.f98
            if (r1 == r0) goto L54
            boolean r0 = r1 instanceof Yue.AbstractC5241
            if (r0 == 0) goto L29
            goto L54
        L29:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "enqueueSend returned "
            r4.append(r5)
            r4.append(r1)
            r5 = 32
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L49:
            Yue.ۥ۟ۥ r1 = (Yue.C1174) r1
            java.lang.Throwable r3 = r2.m489(r4, r1)
            java.lang.Throwable r3 = Yue.C5912.m21959(r3)
            throw r3
        L54:
            java.lang.Object r0 = r2.mo500(r4, r3)
            java.lang.Object r1 = Yue.C5566.m20861()
            if (r0 != r1) goto L5f
            return
        L5f:
            Yue.ۥۢ۠ۦۢ r1 = Yue.C0040.f96
            if (r0 == r1) goto L0
            java.lang.Object r1 = Yue.C0640.f1626
            if (r0 == r1) goto L0
            Yue.ۥۢ۠ۦۢ r1 = Yue.C0040.f95
            if (r0 != r1) goto L73
            Yue.ۥ۟ۧۤۢ r3 = r3.mo20846()
            Yue.C6589.m25378(r5, r2, r3)
            return
        L73:
            boolean r3 = r0 instanceof Yue.C1174
            if (r3 == 0) goto L82
            Yue.ۥ۟ۥ r0 = (Yue.C1174) r0
            java.lang.Throwable r3 = r2.m489(r4, r0)
            java.lang.Throwable r3 = Yue.C5912.m21959(r3)
            throw r3
        L82:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "offerSelectInternal returned "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final Yue.InterfaceC5247<?> m503(E r4) {
            r3 = this;
            Yue.ۥۣ۠ۨ۠ r0 = r3.f166
            Yue.ۥ۟۟ۢۢ$ۥ r1 = new Yue.ۥ۟۟ۢۢ$ۥ
            r1.<init>(r4)
        L7:
            Yue.ۥ۠ۨ۠ۥ r4 = r0.m15172()
            boolean r2 = r4 instanceof Yue.InterfaceC5247
            if (r2 == 0) goto L12
            Yue.ۥۡۦۡۢ r4 = (Yue.InterfaceC5247) r4
            return r4
        L12:
            boolean r4 = r4.m15163(r1, r0)
            if (r4 == 0) goto L7
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public final java.lang.Object m504(E r4, Yue.InterfaceC1598<? super Yue.C6593> r5) {
            r3 = this;
            Yue.ۥ۟ۧۤۢ r0 = Yue.C3332.m13940(r5)
            Yue.ۥۣ۟ۨ۠ r0 = Yue.C0936.m5346(r0)
        L8:
            boolean r1 = m473(r3)
            if (r1 == 0) goto L57
            Yue.ۥۣ۠ۡ۟<E, Yue.ۥۣۢ۠ۤ> r1 = r3.f165
            if (r1 != 0) goto L18
            Yue.ۥۡۨۡۡ r1 = new Yue.ۥۡۨۡۡ
            r1.<init>(r4, r0)
            goto L1f
        L18:
            Yue.ۥۡۨۡۢ r1 = new Yue.ۥۡۨۡۢ
            Yue.ۥۣ۠ۡ۟<E, Yue.ۥۣۢ۠ۤ> r2 = r3.f165
            r1.<init>(r4, r0, r2)
        L1f:
            java.lang.Object r2 = r3.mo480(r1)
            if (r2 != 0) goto L29
            Yue.C0936.m5347(r0, r1)
            goto L78
        L29:
            boolean r1 = r2 instanceof Yue.C1174
            if (r1 == 0) goto L33
            Yue.ۥ۟ۥ r2 = (Yue.C1174) r2
            m472(r3, r0, r4, r2)
            goto L78
        L33:
            Yue.ۥۢ۠ۦۢ r1 = Yue.C0040.f98
            if (r2 == r1) goto L57
            boolean r1 = r2 instanceof Yue.AbstractC5241
            if (r1 == 0) goto L3c
            goto L57
        L3c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "enqueueSend returned "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L57:
            java.lang.Object r1 = r3.mo497(r4)
            Yue.ۥۢ۠ۦۢ r2 = Yue.C0040.f95
            if (r1 != r2) goto L6b
            Yue.ۥۡۦۧۤ$ۥ r4 = Yue.C5388.f20029
            Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016
            java.lang.Object r4 = Yue.C5388.m20377(r4)
            r0.resumeWith(r4)
            goto L78
        L6b:
            Yue.ۥۢ۠ۦۢ r2 = Yue.C0040.f96
            if (r1 == r2) goto L8
            boolean r2 = r1 instanceof Yue.C1174
            if (r2 == 0) goto L8f
            Yue.ۥ۟ۥ r1 = (Yue.C1174) r1
            m472(r3, r0, r4, r1)
        L78:
            java.lang.Object r4 = r0.m5329()
            java.lang.Object r0 = Yue.C3341.m13947()
            if (r4 != r0) goto L85
            Yue.C1757.m8349(r5)
        L85:
            java.lang.Object r5 = Yue.C3341.m13947()
            if (r4 != r5) goto L8c
            return r4
        L8c:
            Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016
            return r4
        L8f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "offerInternal returned "
            r5.append(r0)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
    public Yue.InterfaceC5247<E> mo320() {
            r4 = this;
            Yue.ۥۣ۠ۨ۠ r0 = r4.f166
        L2:
            java.lang.Object r1 = r0.m15170()
            Yue.ۥ۠ۨ۠ۥ r1 = (Yue.C3783) r1
            r2 = 0
            if (r1 != r0) goto Ld
        Lb:
            r1 = r2
            goto L26
        Ld:
            boolean r3 = r1 instanceof Yue.InterfaceC5247
            if (r3 != 0) goto L12
            goto Lb
        L12:
            r2 = r1
            Yue.ۥۡۦۡۢ r2 = (Yue.InterfaceC5247) r2
            boolean r2 = r2 instanceof Yue.C1174
            if (r2 == 0) goto L20
            boolean r2 = r1.mo15141()
            if (r2 != 0) goto L20
            goto L26
        L20:
            Yue.ۥ۠ۨ۠ۥ r2 = r1.m15178()
            if (r2 != 0) goto L29
        L26:
            Yue.ۥۡۦۡۢ r1 = (Yue.InterfaceC5247) r1
            return r1
        L29:
            r2.m15174()
            goto L2
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public final Yue.AbstractC5593 m505() {
            r4 = this;
            Yue.ۥۣ۠ۨ۠ r0 = r4.f166
        L2:
            java.lang.Object r1 = r0.m15170()
            Yue.ۥ۠ۨ۠ۥ r1 = (Yue.C3783) r1
            r2 = 0
            if (r1 != r0) goto Ld
        Lb:
            r1 = r2
            goto L26
        Ld:
            boolean r3 = r1 instanceof Yue.AbstractC5593
            if (r3 != 0) goto L12
            goto Lb
        L12:
            r2 = r1
            Yue.ۥۡۨ۠ۦ r2 = (Yue.AbstractC5593) r2
            boolean r2 = r2 instanceof Yue.C1174
            if (r2 == 0) goto L20
            boolean r2 = r1.mo15141()
            if (r2 != 0) goto L20
            goto L26
        L20:
            Yue.ۥ۠ۨ۠ۥ r2 = r1.m15178()
            if (r2 != 0) goto L29
        L26:
            Yue.ۥۡۨ۠ۦ r1 = (Yue.AbstractC5593) r1
            return r1
        L29:
            r2.m15174()
            goto L2
    }
}
