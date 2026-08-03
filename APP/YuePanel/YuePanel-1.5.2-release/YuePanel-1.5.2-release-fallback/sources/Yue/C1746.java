package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1746 {
    private static volatile int installations = 0;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C1746 f5439 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.lang.String f5440 = "Coroutine creation stacktrace";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.text.SimpleDateFormat f5441 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public static java.lang.Thread f5442;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C1450<Yue.C1746.C1747<?>, java.lang.Boolean> f5443 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final /* synthetic */ Yue.C1755 f5444 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f5445 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.util.concurrent.locks.ReentrantReadWriteLock f5446 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean f5447;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean f5448;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public static final Yue.InterfaceC2825<java.lang.Boolean, Yue.C6593> f5449 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C1450<Yue.InterfaceC1665, Yue.C1739> f5450 = null;

    /* JADX INFO: renamed from: Yue.ۥ۟ۨۤ۟$ۥ, reason: contains not printable characters */
    public static final class C1747<T> implements Yue.InterfaceC1598<T>, Yue.InterfaceC1665 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        @Yue.InterfaceC3417
        public final Yue.InterfaceC1598<T> f5451;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        @Yue.InterfaceC3417
        public final Yue.C1739 f5452;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4543
        public final Yue.InterfaceC1665 f5453;

        public C1747(@Yue.InterfaceC4418 Yue.InterfaceC1598<? super T> r1, @Yue.InterfaceC4418 Yue.C1739 r2, @Yue.InterfaceC4543 Yue.InterfaceC1665 r3) {
                r0 = this;
                r0.<init>()
                r0.f5451 = r1
                r0.f5452 = r2
                r0.f5453 = r3
                return
        }

        @Override // Yue.InterfaceC1665
        @Yue.InterfaceC4543
        public Yue.InterfaceC1665 getCallerFrame() {
                r1 = this;
                Yue.ۥ۟ۧۧۨ r0 = r1.f5453
                if (r0 == 0) goto L9
                Yue.ۥ۟ۧۧۨ r0 = r0.getCallerFrame()
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @Override // Yue.InterfaceC1598
        @Yue.InterfaceC4418
        public Yue.InterfaceC1632 getContext() {
                r1 = this;
                Yue.ۥ۟ۧۤۢ<T> r0 = r1.f5451
                Yue.ۥ۟ۧۦۥ r0 = r0.getContext()
                return r0
        }

        @Override // Yue.InterfaceC1665
        @Yue.InterfaceC4543
        public java.lang.StackTraceElement getStackTraceElement() {
                r1 = this;
                Yue.ۥ۟ۧۧۨ r0 = r1.f5453
                if (r0 == 0) goto L9
                java.lang.StackTraceElement r0 = r0.getStackTraceElement()
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @Override // Yue.InterfaceC1598
        public void resumeWith(@Yue.InterfaceC4418 java.lang.Object r2) {
                r1 = this;
                Yue.ۥ۟ۨۤ۟ r0 = Yue.C1746.f5439
                Yue.C1746.m8296(r0, r1)
                Yue.ۥ۟ۧۤۢ<T> r0 = r1.f5451
                r0.resumeWith(r2)
                return
        }

        @Yue.InterfaceC4418
        public java.lang.String toString() {
                r1 = this;
                Yue.ۥ۟ۧۤۢ<T> r0 = r1.f5451
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۨۤ۟$ۥ۟, reason: contains not printable characters */
    public static final class C1748 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<Yue.C1746.C1747<?>, Yue.C1738> {
        public C1748() {
                r1 = this;
                r0 = 1
                r1.<init>(r0)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ Yue.C1738 invoke(Yue.C1746.C1747<?> r1) {
                r0 = this;
                Yue.ۥ۟ۨۤ۟$ۥ r1 = (Yue.C1746.C1747) r1
                java.lang.Object r1 = r0.m8340(r1)
                return r1
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Yue.C1738 m8340(@Yue.InterfaceC4418 Yue.C1746.C1747<?> r3) {
                r2 = this;
                Yue.ۥ۟ۨۤ۟ r0 = Yue.C1746.f5439
                boolean r0 = Yue.C1746.m8295(r0, r3)
                r1 = 0
                if (r0 == 0) goto La
                goto L19
            La:
                Yue.ۥۣ۟ۨۥ r0 = r3.f5452
                Yue.ۥ۟ۧۦۥ r0 = r0.m8273()
                if (r0 == 0) goto L19
                Yue.ۥۣ۟ۨۤ r1 = new Yue.ۥۣ۟ۨۤ
                Yue.ۥۣ۟ۨۥ r3 = r3.f5452
                r1.<init>(r3, r0)
            L19:
                return r1
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: Yue.ۥ۟ۨۤ۟$ۥ۟۟, reason: contains not printable characters */
    public static final class C1749<R> extends Yue.AbstractC3560 implements Yue.InterfaceC2825<Yue.C1746.C1747<?>, R> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2839<Yue.C1746.C1747<?>, Yue.InterfaceC1632, R> f5454;

        public C1749(Yue.InterfaceC2839<? super Yue.C1746.C1747<?>, ? super Yue.InterfaceC1632, ? extends R> r1) {
                r0 = this;
                r0.f5454 = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ java.lang.Object invoke(Yue.C1746.C1747<?> r1) {
                r0 = this;
                Yue.ۥ۟ۨۤ۟$ۥ r1 = (Yue.C1746.C1747) r1
                java.lang.Object r1 = r0.m8341(r1)
                return r1
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final R m8341(@Yue.InterfaceC4418 Yue.C1746.C1747<?> r3) {
                r2 = this;
                Yue.ۥ۟ۨۤ۟ r0 = Yue.C1746.f5439
                boolean r0 = Yue.C1746.m8295(r0, r3)
                r1 = 0
                if (r0 == 0) goto La
                goto L18
            La:
                Yue.ۥۣ۟ۨۥ r0 = r3.f5452
                Yue.ۥ۟ۧۦۥ r0 = r0.m8273()
                if (r0 == 0) goto L18
                Yue.ۥۣ۠ۢۢ<Yue.ۥ۟ۨۤ۟$ۥ<?>, Yue.ۥ۟ۧۦۥ, R> r1 = r2.f5454
                java.lang.Object r1 = r1.invoke(r3, r0)
            L18:
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۨۤ۟$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C1750<T> implements java.util.Comparator {
        public C1750() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public final int compare(T r3, T r4) {
                r2 = this;
                Yue.ۥ۟ۨۤ۟$ۥ r3 = (Yue.C1746.C1747) r3
                Yue.ۥۣ۟ۨۥ r3 = r3.f5452
                long r0 = r3.f5411
                java.lang.Long r3 = java.lang.Long.valueOf(r0)
                Yue.ۥ۟ۨۤ۟$ۥ r4 = (Yue.C1746.C1747) r4
                Yue.ۥۣ۟ۨۥ r4 = r4.f5452
                long r0 = r4.f5411
                java.lang.Long r4 = java.lang.Long.valueOf(r0)
                int r3 = Yue.C1395.m6935(r3, r4)
                return r3
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۨۤ۟$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C1751 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<Yue.C1746.C1747<?>, java.lang.Boolean> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final Yue.C1746.C1751 f5455 = null;

        static {
                Yue.ۥ۟ۨۤ۟$ۥ۟۟۟۟ r0 = new Yue.ۥ۟ۨۤ۟$ۥ۟۟۟۟
                r0.<init>()
                Yue.C1746.C1751.f5455 = r0
                return
        }

        public C1751() {
                r1 = this;
                r0 = 1
                r1.<init>(r0)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(Yue.C1746.C1747<?> r1) {
                r0 = this;
                Yue.ۥ۟ۨۤ۟$ۥ r1 = (Yue.C1746.C1747) r1
                java.lang.Boolean r1 = r0.m8342(r1)
                return r1
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.lang.Boolean m8342(@Yue.InterfaceC4418 Yue.C1746.C1747<?> r2) {
                r1 = this;
                Yue.ۥ۟ۨۤ۟ r0 = Yue.C1746.f5439
                boolean r2 = Yue.C1746.m8295(r0, r2)
                r2 = r2 ^ 1
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۨۤ۟$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C1752<T> implements java.util.Comparator {
        public C1752() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public final int compare(T r3, T r4) {
                r2 = this;
                Yue.ۥ۟ۨۤ۟$ۥ r3 = (Yue.C1746.C1747) r3
                Yue.ۥۣ۟ۨۥ r3 = r3.f5452
                long r0 = r3.f5411
                java.lang.Long r3 = java.lang.Long.valueOf(r0)
                Yue.ۥ۟ۨۤ۟$ۥ r4 = (Yue.C1746.C1747) r4
                Yue.ۥۣ۟ۨۥ r4 = r4.f5452
                long r0 = r4.f5411
                java.lang.Long r4 = java.lang.Long.valueOf(r0)
                int r3 = Yue.C1395.m6935(r3, r4)
                return r3
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۨۤ۟$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final class C1753 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<Yue.C1746.C1747<?>, Yue.C1760> {
        public C1753() {
                r1 = this;
                r0 = 1
                r1.<init>(r0)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ Yue.C1760 invoke(Yue.C1746.C1747<?> r1) {
                r0 = this;
                Yue.ۥ۟ۨۤ۟$ۥ r1 = (Yue.C1746.C1747) r1
                java.lang.Object r1 = r0.m8343(r1)
                return r1
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Yue.C1760 m8343(@Yue.InterfaceC4418 Yue.C1746.C1747<?> r3) {
                r2 = this;
                Yue.ۥ۟ۨۤ۟ r0 = Yue.C1746.f5439
                boolean r0 = Yue.C1746.m8295(r0, r3)
                r1 = 0
                if (r0 == 0) goto La
                goto L19
            La:
                Yue.ۥۣ۟ۨۥ r0 = r3.f5452
                Yue.ۥ۟ۧۦۥ r0 = r0.m8273()
                if (r0 == 0) goto L19
                Yue.ۥ۟ۨۤۥ r1 = new Yue.ۥ۟ۨۤۥ
                Yue.ۥۣ۟ۨۥ r3 = r3.f5452
                r1.<init>(r3, r0)
            L19:
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۨۤ۟$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final class C1754 extends Yue.AbstractC3560 implements Yue.InterfaceC2823<Yue.C6593> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final Yue.C1746.C1754 f5456 = null;

        static {
                Yue.ۥ۟ۨۤ۟$ۥ۟۟۟ۢ r0 = new Yue.ۥ۟ۨۤ۟$ۥ۟۟۟ۢ
                r0.<init>()
                Yue.C1746.C1754.f5456 = r0
                return
        }

        public C1754() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        @Override // Yue.InterfaceC2823
        public /* bridge */ /* synthetic */ Yue.C6593 invoke() {
                r1 = this;
                r1.invoke2()
                Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
                r1 = this;
                Yue.ۥ۟ۦۦ۟ r0 = Yue.C1746.m8294()
                r0.m7124()
                return
        }
    }

    static {
            Yue.ۥ۟ۨۤ۟ r0 = new Yue.ۥ۟ۨۤ۟
            r0.<init>()
            Yue.C1746.f5439 = r0
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyy/MM/dd HH:mm:ss"
            r1.<init>(r2)
            Yue.C1746.f5441 = r1
            Yue.ۥ۟ۦۦ۟ r1 = new Yue.ۥ۟ۦۦ۟
            r2 = 0
            r3 = 0
            r4 = 1
            r1.<init>(r3, r4, r2)
            Yue.C1746.f5443 = r1
            Yue.ۥ۟ۨۤ۠ r1 = new Yue.ۥ۟ۨۤ۠
            r2 = 0
            r1.<init>(r2)
            Yue.C1746.f5444 = r1
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r1.<init>()
            Yue.C1746.f5446 = r1
            Yue.C1746.f5447 = r4
            Yue.C1746.f5448 = r4
            Yue.ۥۣ۠ۡ۟ r0 = r0.m8313()
            Yue.C1746.f5449 = r0
            Yue.ۥ۟ۦۦ۟ r0 = new Yue.ۥ۟ۦۦ۟
            r0.<init>(r4)
            Yue.C1746.f5450 = r0
            java.lang.Class<Yue.ۥ۟ۨۤ۠> r0 = Yue.C1755.class
            java.lang.String r1 = "sequenceNumber"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r0, r1)
            Yue.C1746.f5445 = r0
            return
    }

    public C1746() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ Yue.C1450 m8294() {
            Yue.ۥ۟ۦۦ۟<Yue.ۥ۟ۧۧۨ, Yue.ۥۣ۟ۨۥ> r0 = Yue.C1746.f5450
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final /* synthetic */ boolean m8295(Yue.C1746 r0, Yue.C1746.C1747 r1) {
            boolean r0 = r0.m8318(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ void m8296(Yue.C1746 r0, Yue.C1746.C1747 r1) {
            r0.m8324(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m8297(Yue.InterfaceC3383 r0) {
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m8298(Yue.InterfaceC3383 r7, java.util.Map<Yue.InterfaceC3383, Yue.C1739> r8, java.lang.StringBuilder r9, java.lang.String r10) {
            r6 = this;
            java.lang.Object r0 = r8.get(r7)
            Yue.ۥۣ۟ۨۥ r0 = (Yue.C1739) r0
            r1 = 9
            r2 = 10
            if (r0 != 0) goto L39
            boolean r0 = r7 instanceof Yue.C5512
            if (r0 != 0) goto L7f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r3 = r6.m8312(r7)
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r9.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r1)
            java.lang.String r10 = r0.toString()
            goto L7f
        L39:
            java.util.List r3 = r0.m8278()
            java.lang.Object r3 = Yue.C1219.m6366(r3)
            java.lang.StackTraceElement r3 = (java.lang.StackTraceElement) r3
            java.lang.String r0 = r0.m8277()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r10)
            java.lang.String r5 = r6.m8312(r7)
            r4.append(r5)
            java.lang.String r5 = ", continuation is "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = " at line "
            r4.append(r0)
            r4.append(r3)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            r9.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r1)
            java.lang.String r10 = r0.toString()
        L7f:
            Yue.ۥۡۨۢ r7 = r7.mo13980()
            java.util.Iterator r7 = r7.iterator()
        L87:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L97
            java.lang.Object r0 = r7.next()
            Yue.ۥ۠ۦ۟ۡ r0 = (Yue.InterfaceC3383) r0
            r6.m8298(r0, r8, r9, r10)
            goto L87
        L97:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final <T> Yue.InterfaceC1598<T> m8299(Yue.InterfaceC1598<? super T> r5, Yue.C5911 r6) {
            r4 = this;
            boolean r0 = r4.m8319()
            if (r0 != 0) goto L7
            return r5
        L7:
            Yue.ۥۣ۟ۨۥ r0 = new Yue.ۥۣ۟ۨۥ
            Yue.ۥ۟ۧۦۥ r1 = r5.getContext()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = Yue.C1746.f5445
            Yue.ۥ۟ۨۤ۠ r3 = Yue.C1746.f5444
            long r2 = r2.incrementAndGet(r3)
            r0.<init>(r1, r6, r2)
            Yue.ۥ۟ۨۤ۟$ۥ r1 = new Yue.ۥ۟ۨۤ۟$ۥ
            r1.<init>(r5, r0, r6)
            Yue.ۥ۟ۦۦ۟<Yue.ۥ۟ۨۤ۟$ۥ<?>, java.lang.Boolean> r5 = Yue.C1746.f5443
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.put(r1, r6)
            boolean r6 = r4.m8319()
            if (r6 != 0) goto L2d
            r5.clear()
        L2d:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m8300(@Yue.InterfaceC4418 java.io.PrintStream r2) {
            r1 = this;
            monitor-enter(r2)
            Yue.ۥ۟ۨۤ۟ r0 = Yue.C1746.f5439     // Catch: java.lang.Throwable -> La
            r0.m8304(r2)     // Catch: java.lang.Throwable -> La
            Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> La
            monitor-exit(r2)
            return
        La:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final java.util.List<Yue.C1738> m8301() {
            r6 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = Yue.C1746.f5446
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L12
            int r2 = r0.getReadHoldCount()
            goto L13
        L12:
            r2 = r3
        L13:
            r4 = r3
        L14:
            if (r4 >= r2) goto L1c
            r1.unlock()
            int r4 = r4 + 1
            goto L14
        L1c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            Yue.ۥ۟ۨۤ۟ r4 = Yue.C1746.f5439     // Catch: java.lang.Throwable -> L55
            boolean r5 = r4.m8319()     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L57
            java.util.Set r4 = r4.m8311()     // Catch: java.lang.Throwable -> L55
            Yue.ۥۡۨۢ r4 = Yue.C1219.m6308(r4)     // Catch: java.lang.Throwable -> L55
            Yue.ۥ۟ۨۤ۟$ۥ۟۟۟ r5 = new Yue.ۥ۟ۨۤ۟$ۥ۟۟۟     // Catch: java.lang.Throwable -> L55
            r5.<init>()     // Catch: java.lang.Throwable -> L55
            Yue.ۥۡۨۢ r4 = Yue.C5629.m21179(r4, r5)     // Catch: java.lang.Throwable -> L55
            Yue.ۥ۟ۨۤ۟$ۥ۟ r5 = new Yue.ۥ۟ۨۤ۟$ۥ۟     // Catch: java.lang.Throwable -> L55
            r5.<init>()     // Catch: java.lang.Throwable -> L55
            Yue.ۥۡۨۢ r4 = Yue.C5629.m21106(r4, r5)     // Catch: java.lang.Throwable -> L55
            java.util.List r4 = Yue.C5629.m21197(r4)     // Catch: java.lang.Throwable -> L55
        L49:
            if (r3 >= r2) goto L51
            r1.lock()
            int r3 = r3 + 1
            goto L49
        L51:
            r0.unlock()
            return r4
        L55:
            r4 = move-exception
            goto L63
        L57:
            java.lang.String r4 = "Debug probes are not installed"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L55
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L55
            throw r5     // Catch: java.lang.Throwable -> L55
        L63:
            if (r3 >= r2) goto L6b
            r1.lock()
            int r3 = r3 + 1
            goto L63
        L6b:
            r0.unlock()
            throw r4
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final java.lang.Object[] m8302() {
            r13 = this;
            java.util.List r0 = r13.m8301()
            int r1 = r0.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            java.util.Iterator r1 = r0.iterator()
        L1b:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto Lb9
            java.lang.Object r5 = r1.next()
            Yue.ۥۣ۟ۨۤ r5 = (Yue.C1738) r5
            Yue.ۥ۟ۧۦۥ r6 = r5.m8263()
            Yue.ۥ۟ۧۧۢ$ۥ r7 = Yue.C1654.f5105
            Yue.ۥ۟ۧۦۥ$ۥ۟ r7 = r6.get(r7)
            Yue.ۥ۟ۧۧۢ r7 = (Yue.C1654) r7
            r8 = 0
            if (r7 == 0) goto L41
            java.lang.String r7 = r7.m7946()
            if (r7 == 0) goto L41
            java.lang.String r7 = r13.m8335(r7)
            goto L42
        L41:
            r7 = r8
        L42:
            Yue.ۥ۟ۧۦۨ$ۥ r9 = Yue.AbstractC1643.Key
            Yue.ۥ۟ۧۦۥ$ۥ۟ r9 = r6.get(r9)
            Yue.ۥ۟ۧۦۨ r9 = (Yue.AbstractC1643) r9
            if (r9 == 0) goto L51
            java.lang.String r9 = r13.m8335(r9)
            goto L52
        L51:
            r9 = r8
        L52:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "\n                {\n                    \"name\": "
            r10.append(r11)
            r10.append(r7)
            java.lang.String r7 = ",\n                    \"id\": "
            r10.append(r7)
            Yue.ۥ۟ۧۧۡ$ۥ r7 = Yue.C1652.f5103
            Yue.ۥ۟ۧۦۥ$ۥ۟ r6 = r6.get(r7)
            Yue.ۥ۟ۧۧۡ r6 = (Yue.C1652) r6
            if (r6 == 0) goto L76
            long r6 = r6.m7940()
            java.lang.Long r8 = java.lang.Long.valueOf(r6)
        L76:
            r10.append(r8)
            java.lang.String r6 = ",\n                    \"dispatcher\": "
            r10.append(r6)
            r10.append(r9)
            java.lang.String r6 = ",\n                    \"sequenceNumber\": "
            r10.append(r6)
            long r6 = r5.m8268()
            r10.append(r6)
            java.lang.String r6 = ",\n                    \"state\": \""
            r10.append(r6)
            java.lang.String r6 = r5.m8269()
            r10.append(r6)
            java.lang.String r6 = "\"\n                } \n                "
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            java.lang.String r6 = Yue.C5978.m22153(r6)
            r4.add(r6)
            Yue.ۥ۟ۧۧۨ r6 = r5.m8266()
            r3.add(r6)
            java.lang.Thread r5 = r5.m8267()
            r2.add(r5)
            goto L1b
        Lb9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r5 = 91
            r1.append(r5)
            r11 = 63
            r12 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r4 = Yue.C1219.m6398(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1.append(r4)
            r4 = 93
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r4 = 0
            java.lang.Thread[] r5 = new java.lang.Thread[r4]
            java.lang.Object[] r2 = r2.toArray(r5)
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            if (r2 == 0) goto L108
            Yue.ۥ۟ۧۧۨ[] r6 = new Yue.InterfaceC1665[r4]
            java.lang.Object[] r3 = r3.toArray(r6)
            if (r3 == 0) goto L102
            Yue.ۥۣ۟ۨۤ[] r4 = new Yue.C1738[r4]
            java.lang.Object[] r0 = r0.toArray(r4)
            if (r0 == 0) goto Lfc
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r2, r3, r0}
            return r0
        Lfc:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r5)
            throw r0
        L102:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r5)
            throw r0
        L108:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r5)
            throw r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final <R> java.util.List<R> m8303(Yue.InterfaceC2839<? super Yue.C1746.C1747<?>, ? super Yue.InterfaceC1632, ? extends R> r8) {
            r7 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = Yue.C1746.f5446
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L12
            int r2 = r0.getReadHoldCount()
            goto L13
        L12:
            r2 = r3
        L13:
            r4 = r3
        L14:
            if (r4 >= r2) goto L1c
            r1.unlock()
            int r4 = r4 + 1
            goto L14
        L1c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            r4 = 1
            Yue.ۥ۟ۨۤ۟ r5 = Yue.C1746.f5439     // Catch: java.lang.Throwable -> L5c
            boolean r6 = r5.m8319()     // Catch: java.lang.Throwable -> L5c
            if (r6 == 0) goto L5e
            java.util.Set r5 = r5.m8311()     // Catch: java.lang.Throwable -> L5c
            Yue.ۥۡۨۢ r5 = Yue.C1219.m6308(r5)     // Catch: java.lang.Throwable -> L5c
            Yue.ۥ۟ۨۤ۟$ۥ۟۟۟ r6 = new Yue.ۥ۟ۨۤ۟$ۥ۟۟۟     // Catch: java.lang.Throwable -> L5c
            r6.<init>()     // Catch: java.lang.Throwable -> L5c
            Yue.ۥۡۨۢ r5 = Yue.C5629.m21179(r5, r6)     // Catch: java.lang.Throwable -> L5c
            Yue.ۥ۟ۨۤ۟$ۥ۟۟ r6 = new Yue.ۥ۟ۨۤ۟$ۥ۟۟     // Catch: java.lang.Throwable -> L5c
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L5c
            Yue.ۥۡۨۢ r8 = Yue.C5629.m21106(r5, r6)     // Catch: java.lang.Throwable -> L5c
            java.util.List r8 = Yue.C5629.m21197(r8)     // Catch: java.lang.Throwable -> L5c
            Yue.C3249.m13687(r4)
        L4d:
            if (r3 >= r2) goto L55
            r1.lock()
            int r3 = r3 + 1
            goto L4d
        L55:
            r0.unlock()
            Yue.C3249.m13686(r4)
            return r8
        L5c:
            r8 = move-exception
            goto L6a
        L5e:
            java.lang.String r8 = "Debug probes are not installed"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L5c
            r5.<init>(r8)     // Catch: java.lang.Throwable -> L5c
            throw r5     // Catch: java.lang.Throwable -> L5c
        L6a:
            Yue.C3249.m13687(r4)
        L6d:
            if (r3 >= r2) goto L75
            r1.lock()
            int r3 = r3 + 1
            goto L6d
        L75:
            r0.unlock()
            Yue.C3249.m13686(r4)
            throw r8
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m8304(java.io.PrintStream r14) {
            r13 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = Yue.C1746.f5446
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L12
            int r2 = r0.getReadHoldCount()
            goto L13
        L12:
            r2 = r3
        L13:
            r4 = r3
        L14:
            if (r4 >= r2) goto L1c
            r1.unlock()
            int r4 = r4 + 1
            goto L14
        L1c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            Yue.ۥ۟ۨۤ۟ r4 = Yue.C1746.f5439     // Catch: java.lang.Throwable -> Laa
            boolean r5 = r4.m8319()     // Catch: java.lang.Throwable -> Laa
            if (r5 == 0) goto L10a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laa
            r5.<init>()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r6 = "Coroutines dump "
            r5.append(r6)     // Catch: java.lang.Throwable -> Laa
            java.text.SimpleDateFormat r6 = Yue.C1746.f5441     // Catch: java.lang.Throwable -> Laa
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Laa
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r6 = r6.format(r7)     // Catch: java.lang.Throwable -> Laa
            r5.append(r6)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Laa
            r14.print(r5)     // Catch: java.lang.Throwable -> Laa
            java.util.Set r4 = r4.m8311()     // Catch: java.lang.Throwable -> Laa
            Yue.ۥۡۨۢ r4 = Yue.C1219.m6308(r4)     // Catch: java.lang.Throwable -> Laa
            Yue.ۥ۟ۨۤ۟$ۥ۟۟۟۟ r5 = Yue.C1746.C1751.f5455     // Catch: java.lang.Throwable -> Laa
            Yue.ۥۡۨۢ r4 = Yue.C5629.m21054(r4, r5)     // Catch: java.lang.Throwable -> Laa
            Yue.ۥ۟ۨۤ۟$ۥ۟۟۟۠ r5 = new Yue.ۥ۟ۨۤ۟$ۥ۟۟۟۠     // Catch: java.lang.Throwable -> Laa
            r5.<init>()     // Catch: java.lang.Throwable -> Laa
            Yue.ۥۡۨۢ r4 = Yue.C5629.m21179(r4, r5)     // Catch: java.lang.Throwable -> Laa
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> Laa
        L68:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> Laa
            if (r5 == 0) goto Lfc
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> Laa
            Yue.ۥ۟ۨۤ۟$ۥ r5 = (Yue.C1746.C1747) r5     // Catch: java.lang.Throwable -> Laa
            Yue.ۥۣ۟ۨۥ r6 = r5.f5452     // Catch: java.lang.Throwable -> Laa
            java.util.List r7 = r6.m8278()     // Catch: java.lang.Throwable -> Laa
            Yue.ۥ۟ۨۤ۟ r8 = Yue.C1746.f5439     // Catch: java.lang.Throwable -> Laa
            java.lang.String r9 = r6.m8277()     // Catch: java.lang.Throwable -> Laa
            java.lang.Thread r10 = r6.f5414     // Catch: java.lang.Throwable -> Laa
            java.util.List r9 = r8.m8308(r9, r10, r7)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r10 = r6.m8277()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r11 = "RUNNING"
            boolean r10 = Yue.C3329.m13897(r10, r11)     // Catch: java.lang.Throwable -> Laa
            if (r10 == 0) goto Lac
            if (r9 != r7) goto Lac
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laa
            r10.<init>()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r11 = r6.m8277()     // Catch: java.lang.Throwable -> Laa
            r10.append(r11)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r11 = " (Last suspension stacktrace, not an actual stacktrace)"
            r10.append(r11)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> Laa
            goto Lb0
        Laa:
            r14 = move-exception
            goto L116
        Lac:
            java.lang.String r10 = r6.m8277()     // Catch: java.lang.Throwable -> Laa
        Lb0:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laa
            r11.<init>()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r12 = "\n\nCoroutine "
            r11.append(r12)     // Catch: java.lang.Throwable -> Laa
            Yue.ۥ۟ۧۤۢ<T> r5 = r5.f5451     // Catch: java.lang.Throwable -> Laa
            r11.append(r5)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r5 = ", state: "
            r11.append(r5)     // Catch: java.lang.Throwable -> Laa
            r11.append(r10)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r5 = r11.toString()     // Catch: java.lang.Throwable -> Laa
            r14.print(r5)     // Catch: java.lang.Throwable -> Laa
            boolean r5 = r7.isEmpty()     // Catch: java.lang.Throwable -> Laa
            if (r5 == 0) goto Lf7
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laa
            r5.<init>()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r7 = "\n\tat "
            r5.append(r7)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r7 = "Coroutine creation stacktrace"
            java.lang.StackTraceElement r7 = Yue.C5912.m21947(r7)     // Catch: java.lang.Throwable -> Laa
            r5.append(r7)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Laa
            r14.print(r5)     // Catch: java.lang.Throwable -> Laa
            java.util.List r5 = r6.m8275()     // Catch: java.lang.Throwable -> Laa
            r8.m8323(r14, r5)     // Catch: java.lang.Throwable -> Laa
            goto L68
        Lf7:
            r8.m8323(r14, r9)     // Catch: java.lang.Throwable -> Laa
            goto L68
        Lfc:
            Yue.ۥۣۢ۠ۤ r14 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> Laa
        Lfe:
            if (r3 >= r2) goto L106
            r1.lock()
            int r3 = r3 + 1
            goto Lfe
        L106:
            r0.unlock()
            return
        L10a:
            java.lang.String r14 = "Debug probes are not installed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Laa
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> Laa
            r4.<init>(r14)     // Catch: java.lang.Throwable -> Laa
            throw r4     // Catch: java.lang.Throwable -> Laa
        L116:
            if (r3 >= r2) goto L11e
            r1.lock()
            int r3 = r3 + 1
            goto L116
        L11e:
            r0.unlock()
            throw r14
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final java.util.List<Yue.C1760> m8305() {
            r6 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = Yue.C1746.f5446
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L12
            int r2 = r0.getReadHoldCount()
            goto L13
        L12:
            r2 = r3
        L13:
            r4 = r3
        L14:
            if (r4 >= r2) goto L1c
            r1.unlock()
            int r4 = r4 + 1
            goto L14
        L1c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            Yue.ۥ۟ۨۤ۟ r4 = Yue.C1746.f5439     // Catch: java.lang.Throwable -> L55
            boolean r5 = r4.m8319()     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L57
            java.util.Set r4 = r4.m8311()     // Catch: java.lang.Throwable -> L55
            Yue.ۥۡۨۢ r4 = Yue.C1219.m6308(r4)     // Catch: java.lang.Throwable -> L55
            Yue.ۥ۟ۨۤ۟$ۥ۟۟۟ r5 = new Yue.ۥ۟ۨۤ۟$ۥ۟۟۟     // Catch: java.lang.Throwable -> L55
            r5.<init>()     // Catch: java.lang.Throwable -> L55
            Yue.ۥۡۨۢ r4 = Yue.C5629.m21179(r4, r5)     // Catch: java.lang.Throwable -> L55
            Yue.ۥ۟ۨۤ۟$ۥ۟۟۟ۡ r5 = new Yue.ۥ۟ۨۤ۟$ۥ۟۟۟ۡ     // Catch: java.lang.Throwable -> L55
            r5.<init>()     // Catch: java.lang.Throwable -> L55
            Yue.ۥۡۨۢ r4 = Yue.C5629.m21106(r4, r5)     // Catch: java.lang.Throwable -> L55
            java.util.List r4 = Yue.C5629.m21197(r4)     // Catch: java.lang.Throwable -> L55
        L49:
            if (r3 >= r2) goto L51
            r1.lock()
            int r3 = r3 + 1
            goto L49
        L51:
            r0.unlock()
            return r4
        L55:
            r4 = move-exception
            goto L63
        L57:
            java.lang.String r4 = "Debug probes are not installed"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L55
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L55
            throw r5     // Catch: java.lang.Throwable -> L55
        L63:
            if (r3 >= r2) goto L6b
            r1.lock()
            int r3 = r3 + 1
            goto L63
        L6b:
            r0.unlock()
            throw r4
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final java.util.List<java.lang.StackTraceElement> m8306(@Yue.InterfaceC4418 Yue.C1738 r2, @Yue.InterfaceC4418 java.util.List<java.lang.StackTraceElement> r3) {
            r1 = this;
            java.lang.String r0 = r2.m8269()
            java.lang.Thread r2 = r2.m8267()
            java.util.List r2 = r1.m8308(r0, r2, r3)
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final java.lang.String m8307(@Yue.InterfaceC4418 Yue.C1738 r10) {
            r9 = this;
            java.util.List r0 = r10.m8270()
            java.util.List r10 = r9.m8306(r10, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
        L11:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L6b
            java.lang.Object r1 = r10.next()
            java.lang.StackTraceElement r1 = (java.lang.StackTraceElement) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "\n                {\n                    \"declaringClass\": \""
            r2.append(r3)
            java.lang.String r3 = r1.getClassName()
            r2.append(r3)
            java.lang.String r3 = "\",\n                    \"methodName\": \""
            r2.append(r3)
            java.lang.String r3 = r1.getMethodName()
            r2.append(r3)
            java.lang.String r3 = "\",\n                    \"fileName\": "
            r2.append(r3)
            java.lang.String r3 = r1.getFileName()
            if (r3 == 0) goto L4a
            java.lang.String r3 = r9.m8335(r3)
            goto L4b
        L4a:
            r3 = 0
        L4b:
            r2.append(r3)
            java.lang.String r3 = ",\n                    \"lineNumber\": "
            r2.append(r3)
            int r1 = r1.getLineNumber()
            r2.append(r1)
            java.lang.String r1 = "\n                }\n                "
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r1 = Yue.C5978.m22153(r1)
            r0.add(r1)
            goto L11
        L6b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r1 = 91
            r10.append(r1)
            r7 = 63
            r8 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r0 = Yue.C1219.m6398(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r10.append(r0)
            r0 = 93
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            return r10
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final java.util.List<java.lang.StackTraceElement> m8308(java.lang.String r7, java.lang.Thread r8, java.util.List<java.lang.StackTraceElement> r9) {
            r6 = this;
            java.lang.String r0 = "RUNNING"
            boolean r7 = Yue.C3329.m13897(r7, r0)
            if (r7 == 0) goto La6
            if (r8 != 0) goto Lc
            goto La6
        Lc:
            Yue.ۥۡۦۧۤ$ۥ r7 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L17
            java.lang.StackTraceElement[] r7 = r8.getStackTrace()     // Catch: java.lang.Throwable -> L17
            java.lang.Object r7 = Yue.C5388.m20377(r7)     // Catch: java.lang.Throwable -> L17
            goto L22
        L17:
            r7 = move-exception
            Yue.ۥۡۦۧۤ$ۥ r8 = Yue.C5388.f20029
            java.lang.Object r7 = Yue.C5391.m20390(r7)
            java.lang.Object r7 = Yue.C5388.m20377(r7)
        L22:
            boolean r8 = Yue.C5388.m20384(r7)
            if (r8 == 0) goto L29
            r7 = 0
        L29:
            java.lang.StackTraceElement[] r7 = (java.lang.StackTraceElement[]) r7
            if (r7 != 0) goto L2e
            return r9
        L2e:
            int r8 = r7.length
            r0 = 0
            r1 = r0
        L31:
            r2 = -1
            if (r1 >= r8) goto L5e
            r3 = r7[r1]
            java.lang.String r4 = r3.getClassName()
            java.lang.String r5 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl"
            boolean r4 = Yue.C3329.m13897(r4, r5)
            if (r4 == 0) goto L5b
            java.lang.String r4 = r3.getMethodName()
            java.lang.String r5 = "resumeWith"
            boolean r4 = Yue.C3329.m13897(r4, r5)
            if (r4 == 0) goto L5b
            java.lang.String r3 = r3.getFileName()
            java.lang.String r4 = "ContinuationImpl.kt"
            boolean r3 = Yue.C3329.m13897(r3, r4)
            if (r3 == 0) goto L5b
            goto L5f
        L5b:
            int r1 = r1 + 1
            goto L31
        L5e:
            r1 = r2
        L5f:
            Yue.ۥۣۡۦ۠ r8 = r6.m8309(r1, r7, r9)
            java.lang.Object r3 = r8.m18537()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.Object r8 = r8.m18538()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r3 != r2) goto L7a
            return r9
        L7a:
            int r2 = r9.size()
            int r2 = r2 + r1
            int r2 = r2 - r3
            int r2 = r2 + (-1)
            int r2 = r2 - r8
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r2)
            int r1 = r1 - r8
        L89:
            if (r0 >= r1) goto L93
            r8 = r7[r0]
            r4.add(r8)
            int r0 = r0 + 1
            goto L89
        L93:
            int r3 = r3 + 1
            int r7 = r9.size()
        L99:
            if (r3 >= r7) goto La5
            java.lang.Object r8 = r9.get(r3)
            r4.add(r8)
            int r3 = r3 + 1
            goto L99
        La5:
            return r4
        La6:
            return r9
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final Yue.C4677<java.lang.Integer, java.lang.Integer> m8309(int r6, java.lang.StackTraceElement[] r7, java.util.List<java.lang.StackTraceElement> r8) {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            r2 = -1
            r3 = 3
            if (r1 >= r3) goto L21
            Yue.ۥ۟ۨۤ۟ r3 = Yue.C1746.f5439
            int r4 = r6 + (-1)
            int r4 = r4 - r1
            int r3 = r3.m8310(r4, r7, r8)
            if (r3 == r2) goto L1e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            Yue.ۥۣۡۦ۠ r6 = Yue.C6456.m23777(r6, r7)
            return r6
        L1e:
            int r1 = r1 + 1
            goto L2
        L21:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            Yue.ۥۣۡۦ۠ r6 = Yue.C6456.m23777(r6, r7)
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final int m8310(int r5, java.lang.StackTraceElement[] r6, java.util.List<java.lang.StackTraceElement> r7) {
            r4 = this;
            java.lang.Object r5 = Yue.C0595.m2950(r6, r5)
            java.lang.StackTraceElement r5 = (java.lang.StackTraceElement) r5
            r6 = -1
            if (r5 != 0) goto La
            return r6
        La:
            java.util.Iterator r7 = r7.iterator()
            r0 = 0
        Lf:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r7.next()
            java.lang.StackTraceElement r1 = (java.lang.StackTraceElement) r1
            java.lang.String r2 = r1.getFileName()
            java.lang.String r3 = r5.getFileName()
            boolean r2 = Yue.C3329.m13897(r2, r3)
            if (r2 == 0) goto L47
            java.lang.String r2 = r1.getClassName()
            java.lang.String r3 = r5.getClassName()
            boolean r2 = Yue.C3329.m13897(r2, r3)
            if (r2 == 0) goto L47
            java.lang.String r1 = r1.getMethodName()
            java.lang.String r2 = r5.getMethodName()
            boolean r1 = Yue.C3329.m13897(r1, r2)
            if (r1 == 0) goto L47
            r6 = r0
            goto L4a
        L47:
            int r0 = r0 + 1
            goto Lf
        L4a:
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final java.util.Set<Yue.C1746.C1747<?>> m8311() {
            r1 = this;
            Yue.ۥ۟ۦۦ۟<Yue.ۥ۟ۨۤ۟$ۥ<?>, java.lang.Boolean> r0 = Yue.C1746.f5443
            java.util.Set r0 = r0.keySet()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final java.lang.String m8312(Yue.InterfaceC3383 r2) {
            r1 = this;
            boolean r0 = r2 instanceof Yue.C3403
            if (r0 == 0) goto Lb
            Yue.ۥ۠ۦ۠۟ r2 = (Yue.C3403) r2
            java.lang.String r2 = r2.m14136()
            goto Lf
        Lb:
            java.lang.String r2 = r2.toString()
        Lf:
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final Yue.InterfaceC2825<java.lang.Boolean, Yue.C6593> m8313() {
            r3 = this;
            r0 = 0
            Yue.ۥۡۦۧۤ$ۥ r1 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = "kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L22
            java.lang.reflect.Constructor[] r1 = r1.getConstructors()     // Catch: java.lang.Throwable -> L22
            r2 = 0
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L22
            java.lang.Object r1 = r1.newInstance(r0)     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L24
            r2 = 1
            java.lang.Object r1 = Yue.C6466.m23830(r1, r2)     // Catch: java.lang.Throwable -> L22
            Yue.ۥۣ۠ۡ۟ r1 = (Yue.InterfaceC2825) r1     // Catch: java.lang.Throwable -> L22
            java.lang.Object r1 = Yue.C5388.m20377(r1)     // Catch: java.lang.Throwable -> L22
            goto L36
        L22:
            r1 = move-exception
            goto L2c
        L24:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L22
            throw r1     // Catch: java.lang.Throwable -> L22
        L2c:
            Yue.ۥۡۦۧۤ$ۥ r2 = Yue.C5388.f20029
            java.lang.Object r1 = Yue.C5391.m20390(r1)
            java.lang.Object r1 = Yue.C5388.m20377(r1)
        L36:
            boolean r2 = Yue.C5388.m20384(r1)
            if (r2 == 0) goto L3d
            goto L3e
        L3d:
            r0 = r1
        L3e:
            Yue.ۥۣ۠ۡ۟ r0 = (Yue.InterfaceC2825) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final boolean m8314() {
            r1 = this;
            boolean r0 = Yue.C1746.f5448
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final boolean m8315() {
            r1 = this;
            boolean r0 = Yue.C1746.f5447
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final java.lang.String m8316(@Yue.InterfaceC4418 Yue.InterfaceC3383 r10) {
            r9 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = Yue.C1746.f5446
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L12
            int r2 = r0.getReadHoldCount()
            goto L13
        L12:
            r2 = r3
        L13:
            r4 = r3
        L14:
            if (r4 >= r2) goto L1c
            r1.unlock()
            int r4 = r4 + 1
            goto L14
        L1c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            Yue.ۥ۟ۨۤ۟ r4 = Yue.C1746.f5439     // Catch: java.lang.Throwable -> L57
            boolean r5 = r4.m8319()     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto Lb2
            java.util.Set r4 = r4.m8311()     // Catch: java.lang.Throwable -> L57
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L57
            r5.<init>()     // Catch: java.lang.Throwable -> L57
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L57
        L38:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> L57
            if (r6 == 0) goto L59
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> L57
            r7 = r6
            Yue.ۥ۟ۨۤ۟$ۥ r7 = (Yue.C1746.C1747) r7     // Catch: java.lang.Throwable -> L57
            Yue.ۥ۟ۧۤۢ<T> r7 = r7.f5451     // Catch: java.lang.Throwable -> L57
            Yue.ۥ۟ۧۦۥ r7 = r7.getContext()     // Catch: java.lang.Throwable -> L57
            Yue.ۥ۠ۦ۟ۡ$ۥ۟ r8 = Yue.InterfaceC3383.f10824     // Catch: java.lang.Throwable -> L57
            Yue.ۥ۟ۧۦۥ$ۥ۟ r7 = r7.get(r8)     // Catch: java.lang.Throwable -> L57
            if (r7 == 0) goto L38
            r5.add(r6)     // Catch: java.lang.Throwable -> L57
            goto L38
        L57:
            r10 = move-exception
            goto Lbe
        L59:
            r4 = 10
            int r4 = Yue.C1210.m6231(r5, r4)     // Catch: java.lang.Throwable -> L57
            int r4 = Yue.C3900.m15722(r4)     // Catch: java.lang.Throwable -> L57
            r6 = 16
            int r4 = Yue.C5196.m19514(r4, r6)     // Catch: java.lang.Throwable -> L57
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L57
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L57
            java.util.Iterator r4 = r5.iterator()     // Catch: java.lang.Throwable -> L57
        L72:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L91
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L57
            r7 = r5
            Yue.ۥ۟ۨۤ۟$ۥ r7 = (Yue.C1746.C1747) r7     // Catch: java.lang.Throwable -> L57
            Yue.ۥ۟ۧۤۢ<T> r7 = r7.f5451     // Catch: java.lang.Throwable -> L57
            Yue.ۥ۟ۧۦۥ r7 = r7.getContext()     // Catch: java.lang.Throwable -> L57
            Yue.ۥ۠ۦ۟ۡ r7 = Yue.C3399.m14047(r7)     // Catch: java.lang.Throwable -> L57
            Yue.ۥ۟ۨۤ۟$ۥ r5 = (Yue.C1746.C1747) r5     // Catch: java.lang.Throwable -> L57
            Yue.ۥۣ۟ۨۥ r5 = r5.f5452     // Catch: java.lang.Throwable -> L57
            r6.put(r7, r5)     // Catch: java.lang.Throwable -> L57
            goto L72
        L91:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r4.<init>()     // Catch: java.lang.Throwable -> L57
            Yue.ۥ۟ۨۤ۟ r5 = Yue.C1746.f5439     // Catch: java.lang.Throwable -> L57
            java.lang.String r7 = ""
            r5.m8298(r10, r6, r4, r7)     // Catch: java.lang.Throwable -> L57
            java.lang.String r10 = r4.toString()     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = "StringBuilder().apply(builderAction).toString()"
            Yue.C3329.m13905(r10, r4)     // Catch: java.lang.Throwable -> L57
        La6:
            if (r3 >= r2) goto Lae
            r1.lock()
            int r3 = r3 + 1
            goto La6
        Lae:
            r0.unlock()
            return r10
        Lb2:
            java.lang.String r10 = "Debug probes are not installed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L57
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L57
            r4.<init>(r10)     // Catch: java.lang.Throwable -> L57
            throw r4     // Catch: java.lang.Throwable -> L57
        Lbe:
            if (r3 >= r2) goto Lc6
            r1.lock()
            int r3 = r3 + 1
            goto Lbe
        Lc6:
            r0.unlock()
            throw r10
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final void m8317() {
            r6 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = Yue.C1746.f5446
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L12
            int r2 = r0.getReadHoldCount()
            goto L13
        L12:
            r2 = r3
        L13:
            r4 = r3
        L14:
            if (r4 >= r2) goto L1c
            r1.unlock()
            int r4 = r4 + 1
            goto L14
        L1c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            int r4 = Yue.C1746.installations     // Catch: java.lang.Throwable -> L5c
            r5 = 1
            int r4 = r4 + r5
            Yue.C1746.installations = r4     // Catch: java.lang.Throwable -> L5c
            int r4 = Yue.C1746.installations     // Catch: java.lang.Throwable -> L5c
            if (r4 <= r5) goto L39
        L2d:
            if (r3 >= r2) goto L35
            r1.lock()
            int r3 = r3 + 1
            goto L2d
        L35:
            r0.unlock()
            return
        L39:
            Yue.ۥ۟ۨۤ۟ r4 = Yue.C1746.f5439     // Catch: java.lang.Throwable -> L5c
            r4.m8332()     // Catch: java.lang.Throwable -> L5c
            Yue.ۥ۟۠ۢ۠ r4 = Yue.C0298.f632     // Catch: java.lang.Throwable -> L5c
            boolean r4 = r4.m1321()     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L52
        L46:
            if (r3 >= r2) goto L4e
            r1.lock()
            int r3 = r3 + 1
            goto L46
        L4e:
            r0.unlock()
            return
        L52:
            Yue.ۥۣ۠ۡ۟<java.lang.Boolean, Yue.ۥۣۢ۠ۤ> r4 = Yue.C1746.f5449     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L5e
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L5c
            r4.invoke(r5)     // Catch: java.lang.Throwable -> L5c
            goto L5e
        L5c:
            r4 = move-exception
            goto L6c
        L5e:
            Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L5c
        L60:
            if (r3 >= r2) goto L68
            r1.lock()
            int r3 = r3 + 1
            goto L60
        L68:
            r0.unlock()
            return
        L6c:
            if (r3 >= r2) goto L74
            r1.lock()
            int r3 = r3 + 1
            goto L6c
        L74:
            r0.unlock()
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final boolean m8318(Yue.C1746.C1747<?> r4) {
            r3 = this;
            Yue.ۥۣ۟ۨۥ r0 = r4.f5452
            Yue.ۥ۟ۧۦۥ r0 = r0.m8273()
            r1 = 0
            if (r0 == 0) goto L22
            Yue.ۥ۠ۦ۟ۡ$ۥ۟ r2 = Yue.InterfaceC3383.f10824
            Yue.ۥ۟ۧۦۥ$ۥ۟ r0 = r0.get(r2)
            Yue.ۥ۠ۦ۟ۡ r0 = (Yue.InterfaceC3383) r0
            if (r0 != 0) goto L14
            goto L22
        L14:
            boolean r0 = r0.mo13978()
            if (r0 != 0) goto L1b
            return r1
        L1b:
            Yue.ۥ۟ۦۦ۟<Yue.ۥ۟ۨۤ۟$ۥ<?>, java.lang.Boolean> r0 = Yue.C1746.f5443
            r0.remove(r4)
            r4 = 1
            return r4
        L22:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final boolean m8319() {
            r1 = this;
            int r0 = Yue.C1746.installations
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final boolean m8320(java.lang.StackTraceElement r5) {
            r4 = this;
            java.lang.String r5 = r5.getClassName()
            r0 = 2
            r1 = 0
            java.lang.String r2 = "kotlinx.coroutines"
            r3 = 0
            boolean r5 = Yue.C5988.m22315(r5, r2, r3, r0, r1)
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final Yue.C1746.C1747<?> m8321(Yue.InterfaceC1598<?> r3) {
            r2 = this;
            boolean r0 = r3 instanceof Yue.InterfaceC1665
            r1 = 0
            if (r0 == 0) goto L8
            Yue.ۥ۟ۧۧۨ r3 = (Yue.InterfaceC1665) r3
            goto L9
        L8:
            r3 = r1
        L9:
            if (r3 == 0) goto Lf
            Yue.ۥ۟ۨۤ۟$ۥ r1 = r2.m8322(r3)
        Lf:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final Yue.C1746.C1747<?> m8322(Yue.InterfaceC1665 r2) {
            r1 = this;
        L0:
            boolean r0 = r2 instanceof Yue.C1746.C1747
            if (r0 == 0) goto L7
            Yue.ۥ۟ۨۤ۟$ۥ r2 = (Yue.C1746.C1747) r2
            goto Lf
        L7:
            Yue.ۥ۟ۧۧۨ r2 = r2.getCallerFrame()
            if (r2 == 0) goto Le
            goto L0
        Le:
            r2 = 0
        Lf:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final void m8323(java.io.PrintStream r4, java.util.List<java.lang.StackTraceElement> r5) {
            r3 = this;
            java.util.Iterator r5 = r5.iterator()
        L4:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r5.next()
            java.lang.StackTraceElement r0 = (java.lang.StackTraceElement) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "\n\tat "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.print(r0)
            goto L4
        L25:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m8324(Yue.C1746.C1747<?> r2) {
            r1 = this;
            Yue.ۥ۟ۦۦ۟<Yue.ۥ۟ۨۤ۟$ۥ<?>, java.lang.Boolean> r0 = Yue.C1746.f5443
            r0.remove(r2)
            Yue.ۥۣ۟ۨۥ r2 = r2.f5452
            Yue.ۥ۟ۧۧۨ r2 = r2.m8276()
            if (r2 == 0) goto L19
            Yue.ۥ۟ۧۧۨ r2 = r1.m8328(r2)
            if (r2 != 0) goto L14
            goto L19
        L14:
            Yue.ۥ۟ۦۦ۟<Yue.ۥ۟ۧۧۨ, Yue.ۥۣ۟ۨۥ> r0 = Yue.C1746.f5450
            r0.remove(r2)
        L19:
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final <T> Yue.InterfaceC1598<T> m8325(@Yue.InterfaceC4418 Yue.InterfaceC1598<? super T> r2) {
            r1 = this;
            boolean r0 = r1.m8319()
            if (r0 != 0) goto L7
            return r2
        L7:
            Yue.ۥ۟ۨۤ۟$ۥ r0 = r1.m8321(r2)
            if (r0 == 0) goto Le
            return r2
        Le:
            boolean r0 = Yue.C1746.f5448
            if (r0 == 0) goto L20
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.util.List r0 = r1.m8329(r0)
            Yue.ۥۢ۟ۧۥ r0 = r1.m8334(r0)
            goto L21
        L20:
            r0 = 0
        L21:
            Yue.ۥ۟ۧۤۢ r2 = r1.m8299(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final void m8326(@Yue.InterfaceC4418 Yue.InterfaceC1598<?> r2) {
            r1 = this;
            java.lang.String r0 = "RUNNING"
            r1.m8338(r2, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final void m8327(@Yue.InterfaceC4418 Yue.InterfaceC1598<?> r2) {
            r1 = this;
            java.lang.String r0 = "SUSPENDED"
            r1.m8338(r2, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final Yue.InterfaceC1665 m8328(Yue.InterfaceC1665 r2) {
            r1 = this;
        L0:
            Yue.ۥ۟ۧۧۨ r2 = r2.getCallerFrame()
            if (r2 != 0) goto L8
            r2 = 0
            return r2
        L8:
            java.lang.StackTraceElement r0 = r2.getStackTraceElement()
            if (r0 == 0) goto L0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final <T extends java.lang.Throwable> java.util.List<java.lang.StackTraceElement> m8329(T r8) {
            r7 = this;
            java.lang.StackTraceElement[] r8 = r8.getStackTrace()
            int r0 = r8.length
            int r1 = r8.length
            r2 = -1
            int r1 = r1 + r2
            if (r1 < 0) goto L21
        La:
            int r3 = r1 + (-1)
            r4 = r8[r1]
            java.lang.String r4 = r4.getClassName()
            java.lang.String r5 = "kotlin.coroutines.jvm.internal.DebugProbesKt"
            boolean r4 = Yue.C3329.m13897(r4, r5)
            if (r4 == 0) goto L1c
            r2 = r1
            goto L21
        L1c:
            if (r3 >= 0) goto L1f
            goto L21
        L1f:
            r1 = r3
            goto La
        L21:
            boolean r1 = Yue.C1746.f5447
            java.lang.String r3 = "Coroutine creation stacktrace"
            if (r1 != 0) goto L42
            int r0 = r0 - r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r4 = 0
        L2e:
            if (r4 >= r0) goto L41
            if (r4 != 0) goto L37
            java.lang.StackTraceElement r5 = Yue.C5912.m21947(r3)
            goto L3b
        L37:
            int r5 = r4 + r2
            r5 = r8[r5]
        L3b:
            r1.add(r5)
            int r4 = r4 + 1
            goto L2e
        L41:
            return r1
        L42:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r4 = r0 - r2
            int r4 = r4 + 1
            r1.<init>(r4)
            java.lang.StackTraceElement r3 = Yue.C5912.m21947(r3)
            r1.add(r3)
        L52:
            int r2 = r2 + 1
        L54:
            if (r2 >= r0) goto L98
            r3 = r8[r2]
            boolean r3 = r7.m8320(r3)
            if (r3 == 0) goto L92
            r3 = r8[r2]
            r1.add(r3)
            int r3 = r2 + 1
        L65:
            if (r3 >= r0) goto L72
            r4 = r8[r3]
            boolean r4 = r7.m8320(r4)
            if (r4 == 0) goto L72
            int r3 = r3 + 1
            goto L65
        L72:
            int r4 = r3 + (-1)
            r5 = r4
        L75:
            if (r5 <= r2) goto L82
            r6 = r8[r5]
            java.lang.String r6 = r6.getFileName()
            if (r6 != 0) goto L82
            int r5 = r5 + (-1)
            goto L75
        L82:
            if (r5 <= r2) goto L8b
            if (r5 >= r4) goto L8b
            r2 = r8[r5]
            r1.add(r2)
        L8b:
            r2 = r8[r4]
            r1.add(r2)
            r2 = r3
            goto L54
        L92:
            r3 = r8[r2]
            r1.add(r3)
            goto L52
        L98:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final void m8330(boolean r1) {
            r0 = this;
            Yue.C1746.f5448 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public final void m8331(boolean r1) {
            r0 = this;
            Yue.C1746.f5447 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public final void m8332() {
            r8 = this;
            Yue.ۥ۟ۨۤ۟$ۥ۟۟۟ۢ r5 = Yue.C1746.C1754.f5456
            r6 = 21
            r7 = 0
            r0 = 0
            r1 = 1
            r2 = 0
            java.lang.String r3 = "Coroutines Debugger Cleaner"
            r4 = 0
            java.lang.Thread r0 = Yue.C6196.m23173(r0, r1, r2, r3, r4, r5, r6, r7)
            Yue.C1746.f5442 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public final void m8333() {
            r2 = this;
            java.lang.Thread r0 = Yue.C1746.f5442
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            Yue.C1746.f5442 = r1
            r0.interrupt()
            r0.join()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public final Yue.C5911 m8334(java.util.List<java.lang.StackTraceElement> r4) {
            r3 = this;
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 != 0) goto L22
            int r0 = r4.size()
            java.util.ListIterator r4 = r4.listIterator(r0)
        Lf:
            boolean r0 = r4.hasPrevious()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r4.previous()
            java.lang.StackTraceElement r0 = (java.lang.StackTraceElement) r0
            Yue.ۥۢ۟ۧۥ r2 = new Yue.ۥۢ۟ۧۥ
            r2.<init>(r1, r0)
            r1 = r2
            goto Lf
        L22:
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final java.lang.String m8335(java.lang.Object r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 34
            r0.append(r1)
            r0.append(r3)
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public final void m8336() {
            r6 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = Yue.C1746.f5446
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L12
            int r2 = r0.getReadHoldCount()
            goto L13
        L12:
            r2 = r3
        L13:
            r4 = r3
        L14:
            if (r4 >= r2) goto L1c
            r1.unlock()
            int r4 = r4 + 1
            goto L14
        L1c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            Yue.ۥ۟ۨۤ۟ r4 = Yue.C1746.f5439     // Catch: java.lang.Throwable -> L6c
            boolean r5 = r4.m8319()     // Catch: java.lang.Throwable -> L6c
            if (r5 == 0) goto L7c
            int r5 = Yue.C1746.installations     // Catch: java.lang.Throwable -> L6c
            int r5 = r5 + (-1)
            Yue.C1746.installations = r5     // Catch: java.lang.Throwable -> L6c
            int r5 = Yue.C1746.installations     // Catch: java.lang.Throwable -> L6c
            if (r5 == 0) goto L41
        L35:
            if (r3 >= r2) goto L3d
            r1.lock()
            int r3 = r3 + 1
            goto L35
        L3d:
            r0.unlock()
            return
        L41:
            r4.m8333()     // Catch: java.lang.Throwable -> L6c
            Yue.ۥ۟ۦۦ۟<Yue.ۥ۟ۨۤ۟$ۥ<?>, java.lang.Boolean> r4 = Yue.C1746.f5443     // Catch: java.lang.Throwable -> L6c
            r4.clear()     // Catch: java.lang.Throwable -> L6c
            Yue.ۥ۟ۦۦ۟<Yue.ۥ۟ۧۧۨ, Yue.ۥۣ۟ۨۥ> r4 = Yue.C1746.f5450     // Catch: java.lang.Throwable -> L6c
            r4.clear()     // Catch: java.lang.Throwable -> L6c
            Yue.ۥ۟۠ۢ۠ r4 = Yue.C0298.f632     // Catch: java.lang.Throwable -> L6c
            boolean r4 = r4.m1321()     // Catch: java.lang.Throwable -> L6c
            if (r4 == 0) goto L62
        L56:
            if (r3 >= r2) goto L5e
            r1.lock()
            int r3 = r3 + 1
            goto L56
        L5e:
            r0.unlock()
            return
        L62:
            Yue.ۥۣ۠ۡ۟<java.lang.Boolean, Yue.ۥۣۢ۠ۤ> r4 = Yue.C1746.f5449     // Catch: java.lang.Throwable -> L6c
            if (r4 == 0) goto L6e
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L6c
            r4.invoke(r5)     // Catch: java.lang.Throwable -> L6c
            goto L6e
        L6c:
            r4 = move-exception
            goto L88
        L6e:
            Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L6c
        L70:
            if (r3 >= r2) goto L78
            r1.lock()
            int r3 = r3 + 1
            goto L70
        L78:
            r0.unlock()
            return
        L7c:
            java.lang.String r4 = "Agent was not installed"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6c
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L6c
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L6c
            throw r5     // Catch: java.lang.Throwable -> L6c
        L88:
            if (r3 >= r2) goto L90
            r1.lock()
            int r3 = r3 + 1
            goto L88
        L90:
            r0.unlock()
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final void m8337(Yue.InterfaceC1665 r6, java.lang.String r7) {
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = Yue.C1746.f5446
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            Yue.ۥ۟ۨۤ۟ r1 = Yue.C1746.f5439     // Catch: java.lang.Throwable -> L36
            boolean r2 = r1.m8319()     // Catch: java.lang.Throwable -> L36
            if (r2 != 0) goto L15
            r0.unlock()
            return
        L15:
            Yue.ۥ۟ۦۦ۟<Yue.ۥ۟ۧۧۨ, Yue.ۥۣ۟ۨۥ> r2 = Yue.C1746.f5450     // Catch: java.lang.Throwable -> L36
            java.lang.Object r3 = r2.remove(r6)     // Catch: java.lang.Throwable -> L36
            Yue.ۥۣ۟ۨۥ r3 = (Yue.C1739) r3     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L20
            goto L3e
        L20:
            Yue.ۥ۟ۨۤ۟$ۥ r3 = r1.m8322(r6)     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L57
            Yue.ۥۣ۟ۨۥ r3 = r3.f5452     // Catch: java.lang.Throwable -> L36
            if (r3 != 0) goto L2b
            goto L57
        L2b:
            Yue.ۥ۟ۧۧۨ r4 = r3.m8276()     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L38
            Yue.ۥ۟ۧۧۨ r4 = r1.m8328(r4)     // Catch: java.lang.Throwable -> L36
            goto L39
        L36:
            r6 = move-exception
            goto L5b
        L38:
            r4 = 0
        L39:
            if (r4 == 0) goto L3e
            r2.remove(r4)     // Catch: java.lang.Throwable -> L36
        L3e:
            r4 = r6
            Yue.ۥ۟ۧۤۢ r4 = (Yue.InterfaceC1598) r4     // Catch: java.lang.Throwable -> L36
            r3.m8280(r7, r4)     // Catch: java.lang.Throwable -> L36
            Yue.ۥ۟ۧۧۨ r6 = r1.m8328(r6)     // Catch: java.lang.Throwable -> L36
            if (r6 != 0) goto L4e
            r0.unlock()
            return
        L4e:
            r2.put(r6, r3)     // Catch: java.lang.Throwable -> L36
            Yue.ۥۣۢ۠ۤ r6 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L36
            r0.unlock()
            return
        L57:
            r0.unlock()
            return
        L5b:
            r0.unlock()
            throw r6
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public final void m8338(Yue.InterfaceC1598<?> r5, java.lang.String r6) {
            r4 = this;
            boolean r0 = r4.m8319()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = "RUNNING"
            boolean r0 = Yue.C3329.m13897(r6, r0)
            if (r0 == 0) goto L2a
            Yue.ۥ۠ۦۧۨ r0 = Yue.C3557.f11344
            r1 = 3
            r2 = 30
            r3 = 1
            boolean r0 = r0.m14484(r3, r1, r2)
            if (r0 == 0) goto L2a
            boolean r0 = r5 instanceof Yue.InterfaceC1665
            if (r0 == 0) goto L22
            Yue.ۥ۟ۧۧۨ r5 = (Yue.InterfaceC1665) r5
            goto L23
        L22:
            r5 = 0
        L23:
            if (r5 != 0) goto L26
            return
        L26:
            r4.m8337(r5, r6)
            return
        L2a:
            Yue.ۥ۟ۨۤ۟$ۥ r0 = r4.m8321(r5)
            if (r0 != 0) goto L31
            return
        L31:
            r4.m8339(r0, r5, r6)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public final void m8339(Yue.C1746.C1747<?> r3, Yue.InterfaceC1598<?> r4, java.lang.String r5) {
            r2 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = Yue.C1746.f5446
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            Yue.ۥ۟ۨۤ۟ r1 = Yue.C1746.f5439     // Catch: java.lang.Throwable -> L20
            boolean r1 = r1.m8319()     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L15
            r0.unlock()
            return
        L15:
            Yue.ۥۣ۟ۨۥ r3 = r3.f5452     // Catch: java.lang.Throwable -> L20
            r3.m8280(r5, r4)     // Catch: java.lang.Throwable -> L20
            Yue.ۥۣۢ۠ۤ r3 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L20
            r0.unlock()
            return
        L20:
            r3 = move-exception
            r0.unlock()
            throw r3
    }
}
