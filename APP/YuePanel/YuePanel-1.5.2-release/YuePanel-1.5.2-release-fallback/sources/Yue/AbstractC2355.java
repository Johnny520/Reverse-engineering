package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n+ 2 -JvmPlatform.kt\nokio/_JvmPlatformKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 5 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 6 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,444:1\n33#2:445\n33#2:447\n33#2:448\n33#2:449\n33#2:450\n33#2:451\n33#2:452\n33#2:453\n33#2:457\n33#2:459\n1#3:446\n62#4:454\n62#4:455\n62#4:456\n51#5:458\n86#6:460\n86#6:461\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n*L\n69#1:445\n81#1:447\n92#1:448\n105#1:449\n119#1:450\n129#1:451\n139#1:452\n151#1:453\n221#1:457\n287#1:459\n169#1:454\n195#1:455\n202#1:456\n248#1:458\n345#1:460\n374#1:461\n*E\n"})
public abstract class AbstractC2355 implements java.io.Closeable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean f7704;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean f7705;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f7706;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.concurrent.locks.ReentrantLock f7707;

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۧۧ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -JvmPlatform.kt\nokio/_JvmPlatformKt\n*L\n1#1,444:1\n1#2:445\n33#3:446\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSink\n*L\n410#1:446\n*E\n"})
    public static final class C2356 implements Yue.InterfaceC5794 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final Yue.AbstractC2355 f7708;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public long f7709;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f7710;

        public C2356(@Yue.InterfaceC4418 Yue.AbstractC2355 r2, long r3) {
                r1 = this;
                java.lang.String r0 = "fileHandle"
                Yue.C3329.m13906(r2, r0)
                r1.<init>()
                r1.f7708 = r2
                r1.f7709 = r3
                return
        }

        @Override // Yue.InterfaceC5794, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r3 = this;
                boolean r0 = r3.f7710
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r3.f7710 = r0
                Yue.ۥ۠ۡۧۧ r0 = r3.f7708
                java.util.concurrent.locks.ReentrantLock r0 = r0.m10813()
                r0.lock()
                Yue.ۥ۠ۡۧۧ r1 = r3.f7708     // Catch: java.lang.Throwable -> L38
                int r2 = Yue.AbstractC2355.m10806(r1)     // Catch: java.lang.Throwable -> L38
                int r2 = r2 + (-1)
                Yue.AbstractC2355.m10808(r1, r2)     // Catch: java.lang.Throwable -> L38
                Yue.ۥ۠ۡۧۧ r1 = r3.f7708     // Catch: java.lang.Throwable -> L38
                int r1 = Yue.AbstractC2355.m10806(r1)     // Catch: java.lang.Throwable -> L38
                if (r1 != 0) goto L3a
                Yue.ۥ۠ۡۧۧ r1 = r3.f7708     // Catch: java.lang.Throwable -> L38
                boolean r1 = Yue.AbstractC2355.m10805(r1)     // Catch: java.lang.Throwable -> L38
                if (r1 != 0) goto L2d
                goto L3a
            L2d:
                Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L38
                r0.unlock()
                Yue.ۥ۠ۡۧۧ r0 = r3.f7708
                r0.mo10817()
                return
            L38:
                r1 = move-exception
                goto L3e
            L3a:
                r0.unlock()
                return
            L3e:
                r0.unlock()
                throw r1
        }

        @Override // Yue.InterfaceC5794, java.io.Flushable
        public void flush() {
                r2 = this;
                boolean r0 = r2.f7710
                r0 = r0 ^ 1
                if (r0 == 0) goto Lc
                Yue.ۥ۠ۡۧۧ r0 = r2.f7708
                r0.mo10818()
                return
            Lc:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "closed"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // Yue.InterfaceC5794
        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ */
        public Yue.C6250 mo4174() {
                r1 = this;
                Yue.ۥۢۡۤۧ r0 = Yue.C6250.f22300
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final boolean m10835() {
                r1 = this;
                boolean r0 = r1.f7710
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Yue.AbstractC2355 m10836() {
                r1 = this;
                Yue.ۥ۠ۡۧۧ r0 = r1.f7708
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final long m10837() {
                r2 = this;
                long r0 = r2.f7709
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final void m10838(boolean r1) {
                r0 = this;
                r0.f7710 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final void m10839(long r1) {
                r0 = this;
                r0.f7709 = r1
                return
        }

        @Override // Yue.InterfaceC5794
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public void mo4176(@Yue.InterfaceC4418 Yue.C0843 r8, long r9) {
                r7 = this;
                java.lang.String r0 = "source"
                Yue.C3329.m13906(r8, r0)
                boolean r0 = r7.f7710
                r0 = r0 ^ 1
                if (r0 == 0) goto L1a
                Yue.ۥ۠ۡۧۧ r1 = r7.f7708
                long r2 = r7.f7709
                r4 = r8
                r5 = r9
                Yue.AbstractC2355.m10809(r1, r2, r4, r5)
                long r0 = r7.f7709
                long r0 = r0 + r9
                r7.f7709 = r0
                return
            L1a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "closed"
                java.lang.String r9 = r9.toString()
                r8.<init>(r9)
                throw r8
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۧۧ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -JvmPlatform.kt\nokio/_JvmPlatformKt\n*L\n1#1,444:1\n1#2:445\n33#3:446\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSource\n*L\n436#1:446\n*E\n"})
    public static final class C2357 implements Yue.InterfaceC5839 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final Yue.AbstractC2355 f7711;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public long f7712;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f7713;

        public C2357(@Yue.InterfaceC4418 Yue.AbstractC2355 r2, long r3) {
                r1 = this;
                java.lang.String r0 = "fileHandle"
                Yue.C3329.m13906(r2, r0)
                r1.<init>()
                r1.f7711 = r2
                r1.f7712 = r3
                return
        }

        @Override // Yue.InterfaceC5839, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r3 = this;
                boolean r0 = r3.f7713
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r3.f7713 = r0
                Yue.ۥ۠ۡۧۧ r0 = r3.f7711
                java.util.concurrent.locks.ReentrantLock r0 = r0.m10813()
                r0.lock()
                Yue.ۥ۠ۡۧۧ r1 = r3.f7711     // Catch: java.lang.Throwable -> L38
                int r2 = Yue.AbstractC2355.m10806(r1)     // Catch: java.lang.Throwable -> L38
                int r2 = r2 + (-1)
                Yue.AbstractC2355.m10808(r1, r2)     // Catch: java.lang.Throwable -> L38
                Yue.ۥ۠ۡۧۧ r1 = r3.f7711     // Catch: java.lang.Throwable -> L38
                int r1 = Yue.AbstractC2355.m10806(r1)     // Catch: java.lang.Throwable -> L38
                if (r1 != 0) goto L3a
                Yue.ۥ۠ۡۧۧ r1 = r3.f7711     // Catch: java.lang.Throwable -> L38
                boolean r1 = Yue.AbstractC2355.m10805(r1)     // Catch: java.lang.Throwable -> L38
                if (r1 != 0) goto L2d
                goto L3a
            L2d:
                Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L38
                r0.unlock()
                Yue.ۥ۠ۡۧۧ r0 = r3.f7711
                r0.mo10817()
                return
            L38:
                r1 = move-exception
                goto L3e
            L3a:
                r0.unlock()
                return
            L3e:
                r0.unlock()
                throw r1
        }

        @Override // Yue.InterfaceC5839
        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ */
        public Yue.C6250 mo4177() {
                r1 = this;
                Yue.ۥۢۡۤۧ r0 = Yue.C6250.f22300
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final boolean m10840() {
                r1 = this;
                boolean r0 = r1.f7713
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Yue.AbstractC2355 m10841() {
                r1 = this;
                Yue.ۥ۠ۡۧۧ r0 = r1.f7711
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final long m10842() {
                r2 = this;
                long r0 = r2.f7712
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final void m10843(boolean r1) {
                r0 = this;
                r0.f7713 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final void m10844(long r1) {
                r0 = this;
                r0.f7712 = r1
                return
        }

        @Override // Yue.InterfaceC5839
        /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
        public long mo4179(@Yue.InterfaceC4418 Yue.C0843 r8, long r9) {
                r7 = this;
                java.lang.String r0 = "sink"
                Yue.C3329.m13906(r8, r0)
                boolean r0 = r7.f7713
                r0 = r0 ^ 1
                if (r0 == 0) goto L21
                Yue.ۥ۠ۡۧۧ r1 = r7.f7711
                long r2 = r7.f7712
                r4 = r8
                r5 = r9
                long r8 = Yue.AbstractC2355.m10807(r1, r2, r4, r5)
                r0 = -1
                int r10 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r10 == 0) goto L20
                long r0 = r7.f7712
                long r0 = r0 + r8
                r7.f7712 = r0
            L20:
                return r8
            L21:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "closed"
                java.lang.String r9 = r9.toString()
                r8.<init>(r9)
                throw r8
        }
    }

    public AbstractC2355(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.f7704 = r1
            java.util.concurrent.locks.ReentrantLock r1 = Yue.C7189.m27675()
            r0.f7707 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final /* synthetic */ boolean m10805(Yue.AbstractC2355 r0) {
            boolean r0 = r0.f7705
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ int m10806(Yue.AbstractC2355 r0) {
            int r0 = r0.f7706
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ long m10807(Yue.AbstractC2355 r0, long r1, Yue.C0843 r3, long r4) {
            long r0 = r0.m10825(r1, r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ void m10808(Yue.AbstractC2355 r0, int r1) {
            r0.f7706 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final /* synthetic */ void m10809(Yue.AbstractC2355 r0, long r1, Yue.C0843 r3, long r4) {
            r0.m10834(r1, r3, r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static /* synthetic */ Yue.InterfaceC5794 m10810(Yue.AbstractC2355 r0, long r1, int r3, java.lang.Object r4) throws java.io.IOException {
            if (r4 != 0) goto Ld
            r3 = r3 & 1
            if (r3 == 0) goto L8
            r1 = 0
        L8:
            Yue.ۥۣۢ۟ۡ r0 = r0.m10829(r1)
            return r0
        Ld:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: sink"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static /* synthetic */ Yue.InterfaceC5839 m10811(Yue.AbstractC2355 r0, long r1, int r3, java.lang.Object r4) throws java.io.IOException {
            if (r4 != 0) goto Ld
            r3 = r3 & 1
            if (r3 == 0) goto L8
            r1 = 0
        L8:
            Yue.ۥۣۢ۟ۦ r0 = r0.m10831(r1)
            return r0
        Ld:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: source"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.f7707
            r0.lock()
            boolean r1 = r2.f7705     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto Ld
            r0.unlock()
            return
        Ld:
            r1 = 1
            r2.f7705 = r1     // Catch: java.lang.Throwable -> L21
            int r1 = r2.f7706     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L18
            r0.unlock()
            return
        L18:
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L21
            r0.unlock()
            r2.mo10817()
            return
        L21:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    public final void flush() throws java.io.IOException {
            r3 = this;
            boolean r0 = r3.f7704
            if (r0 == 0) goto L2a
            java.util.concurrent.locks.ReentrantLock r0 = r3.f7707
            r0.lock()
            boolean r1 = r3.f7705     // Catch: java.lang.Throwable -> L18
            r1 = r1 ^ 1
            if (r1 == 0) goto L1a
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L18
            r0.unlock()
            r3.mo10818()
            return
        L18:
            r1 = move-exception
            goto L26
        L1a:
            java.lang.String r1 = "closed"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L18
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L18
            throw r2     // Catch: java.lang.Throwable -> L18
        L26:
            r0.unlock()
            throw r1
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "file handle is read-only"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final Yue.InterfaceC5794 m10812() throws java.io.IOException {
            r2 = this;
            long r0 = r2.m10830()
            Yue.ۥۣۢ۟ۡ r0 = r2.m10829(r0)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final java.util.concurrent.locks.ReentrantLock m10813() {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.f7707
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final boolean m10814() {
            r1 = this;
            boolean r0 = r1.f7704
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final long m10815(@Yue.InterfaceC4418 Yue.InterfaceC5794 r5) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r5, r0)
            boolean r0 = r5 instanceof Yue.C5211
            if (r0 == 0) goto L14
            Yue.ۥۡۦ۠ۢ r5 = (Yue.C5211) r5
            Yue.ۥۣ۟ۢۨ r0 = r5.f19557
            long r0 = r0.m4889()
            Yue.ۥۣۢ۟ۡ r5 = r5.f19556
            goto L16
        L14:
            r0 = 0
        L16:
            boolean r2 = r5 instanceof Yue.AbstractC2355.C2356
            if (r2 == 0) goto L3f
            r2 = r5
            Yue.ۥ۠ۡۧۧ$ۥ r2 = (Yue.AbstractC2355.C2356) r2
            Yue.ۥ۠ۡۧۧ r2 = r2.m10836()
            if (r2 != r4) goto L3f
            Yue.ۥ۠ۡۧۧ$ۥ r5 = (Yue.AbstractC2355.C2356) r5
            boolean r2 = r5.m10835()
            r2 = r2 ^ 1
            if (r2 == 0) goto L33
            long r2 = r5.m10837()
            long r2 = r2 + r0
            return r2
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L3f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "sink was not created by this FileHandle"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final long m10816(@Yue.InterfaceC4418 Yue.InterfaceC5839 r5) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r5, r0)
            boolean r0 = r5 instanceof Yue.C5213
            if (r0 == 0) goto L14
            Yue.ۥۡۦۣ۠ r5 = (Yue.C5213) r5
            Yue.ۥۣ۟ۢۨ r0 = r5.f19561
            long r0 = r0.m4889()
            Yue.ۥۣۢ۟ۦ r5 = r5.f19560
            goto L16
        L14:
            r0 = 0
        L16:
            boolean r2 = r5 instanceof Yue.AbstractC2355.C2357
            if (r2 == 0) goto L3f
            r2 = r5
            Yue.ۥ۠ۡۧۧ$ۥ۟ r2 = (Yue.AbstractC2355.C2357) r2
            Yue.ۥ۠ۡۧۧ r2 = r2.m10841()
            if (r2 != r4) goto L3f
            Yue.ۥ۠ۡۧۧ$ۥ۟ r5 = (Yue.AbstractC2355.C2357) r5
            boolean r2 = r5.m10840()
            r2 = r2 ^ 1
            if (r2 == 0) goto L33
            long r2 = r5.m10842()
            long r2 = r2 - r0
            return r2
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L3f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "source was not created by this FileHandle"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public abstract void mo10817() throws java.io.IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public abstract void mo10818() throws java.io.IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public abstract int mo10819(long r1, @Yue.InterfaceC4418 byte[] r3, int r4, int r5) throws java.io.IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public abstract void mo10820(long r1) throws java.io.IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public abstract long mo10821() throws java.io.IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public abstract void mo10822(long r1, @Yue.InterfaceC4418 byte[] r3, int r4, int r5) throws java.io.IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final int m10823(long r3, @Yue.InterfaceC4418 byte[] r5, int r6, int r7) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "array"
            Yue.C3329.m13906(r5, r0)
            java.util.concurrent.locks.ReentrantLock r0 = r2.f7707
            r0.lock()
            boolean r1 = r2.f7705     // Catch: java.lang.Throwable -> L1a
            r1 = r1 ^ 1
            if (r1 == 0) goto L1c
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L1a
            r0.unlock()
            int r3 = r2.mo10819(r3, r5, r6, r7)
            return r3
        L1a:
            r3 = move-exception
            goto L28
        L1c:
            java.lang.String r3 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1a
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L1a
            throw r4     // Catch: java.lang.Throwable -> L1a
        L28:
            r0.unlock()
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final long m10824(long r3, @Yue.InterfaceC4418 Yue.C0843 r5, long r6) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r5, r0)
            java.util.concurrent.locks.ReentrantLock r0 = r2.f7707
            r0.lock()
            boolean r1 = r2.f7705     // Catch: java.lang.Throwable -> L1a
            r1 = r1 ^ 1
            if (r1 == 0) goto L1c
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L1a
            r0.unlock()
            long r3 = r2.m10825(r3, r5, r6)
            return r3
        L1a:
            r3 = move-exception
            goto L28
        L1c:
            java.lang.String r3 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1a
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L1a
            throw r4     // Catch: java.lang.Throwable -> L1a
        L28:
            r0.unlock()
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public final long m10825(long r15, Yue.C0843 r17, long r18) {
            r14 = this;
            r0 = r17
            r1 = r18
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L54
            long r1 = r1 + r15
            r9 = r15
        Lc:
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 >= 0) goto L52
            r3 = 1
            Yue.ۥۡۧۨ r11 = r0.m4892(r3)
            byte[] r6 = r11.f20490
            int r7 = r11.f20492
            long r3 = r1 - r9
            int r5 = 8192 - r7
            long r12 = (long) r5
            long r3 = java.lang.Math.min(r3, r12)
            int r8 = (int) r3
            r3 = r14
            r4 = r9
            int r3 = r3.mo10819(r4, r6, r7, r8)
            r4 = -1
            if (r3 != r4) goto L42
            int r1 = r11.f20491
            int r2 = r11.f20492
            if (r1 != r2) goto L3b
            Yue.ۥۡۧۨ r1 = r11.m20804()
            r0.f2378 = r1
            Yue.C5550.m20825(r11)
        L3b:
            int r0 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r0 != 0) goto L52
            r0 = -1
            return r0
        L42:
            int r4 = r11.f20492
            int r4 = r4 + r3
            r11.f20492 = r4
            long r3 = (long) r3
            long r9 = r9 + r3
            long r5 = r17.m4889()
            long r5 = r5 + r3
            r0.m4885(r5)
            goto Lc
        L52:
            long r9 = r9 - r15
            return r9
        L54:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "byteCount < 0: "
            r0.append(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public final void m10826(@Yue.InterfaceC4418 Yue.InterfaceC5794 r5, long r6) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r5, r0)
            boolean r0 = r5 instanceof Yue.C5211
            java.lang.String r1 = "closed"
            java.lang.String r2 = "sink was not created by this FileHandle"
            if (r0 == 0) goto L43
            Yue.ۥۡۦ۠ۢ r5 = (Yue.C5211) r5
            Yue.ۥۣۢ۟ۡ r0 = r5.f19556
            boolean r3 = r0 instanceof Yue.AbstractC2355.C2356
            if (r3 == 0) goto L39
            r3 = r0
            Yue.ۥ۠ۡۧۧ$ۥ r3 = (Yue.AbstractC2355.C2356) r3
            Yue.ۥ۠ۡۧۧ r3 = r3.m10836()
            if (r3 != r4) goto L39
            Yue.ۥ۠ۡۧۧ$ۥ r0 = (Yue.AbstractC2355.C2356) r0
            boolean r2 = r0.m10835()
            r2 = r2 ^ 1
            if (r2 == 0) goto L2f
            r5.mo4819()
            r0.m10839(r6)
            goto L5d
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = r1.toString()
            r5.<init>(r6)
            throw r5
        L39:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r2.toString()
            r5.<init>(r6)
            throw r5
        L43:
            boolean r0 = r5 instanceof Yue.AbstractC2355.C2356
            if (r0 == 0) goto L68
            r0 = r5
            Yue.ۥ۠ۡۧۧ$ۥ r0 = (Yue.AbstractC2355.C2356) r0
            Yue.ۥ۠ۡۧۧ r0 = r0.m10836()
            if (r0 != r4) goto L68
            Yue.ۥ۠ۡۧۧ$ۥ r5 = (Yue.AbstractC2355.C2356) r5
            boolean r0 = r5.m10835()
            r0 = r0 ^ 1
            if (r0 == 0) goto L5e
            r5.m10839(r6)
        L5d:
            return
        L5e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = r1.toString()
            r5.<init>(r6)
            throw r5
        L68:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r2.toString()
            r5.<init>(r6)
            throw r5
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final void m10827(@Yue.InterfaceC4418 Yue.InterfaceC5839 r8, long r9) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r8, r0)
            boolean r0 = r8 instanceof Yue.C5213
            java.lang.String r1 = "closed"
            java.lang.String r2 = "source was not created by this FileHandle"
            if (r0 == 0) goto L60
            Yue.ۥۡۦۣ۠ r8 = (Yue.C5213) r8
            Yue.ۥۣۢ۟ۦ r0 = r8.f19560
            boolean r3 = r0 instanceof Yue.AbstractC2355.C2357
            if (r3 == 0) goto L56
            r3 = r0
            Yue.ۥ۠ۡۧۧ$ۥ۟ r3 = (Yue.AbstractC2355.C2357) r3
            Yue.ۥ۠ۡۧۧ r3 = r3.m10841()
            if (r3 != r7) goto L56
            Yue.ۥ۠ۡۧۧ$ۥ۟ r0 = (Yue.AbstractC2355.C2357) r0
            boolean r2 = r0.m10840()
            r2 = r2 ^ 1
            if (r2 == 0) goto L4c
            Yue.ۥۣ۟ۢۨ r1 = r8.f19561
            long r1 = r1.m4889()
            long r3 = r0.m10842()
            long r3 = r3 - r1
            long r3 = r9 - r3
            r5 = 0
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 > 0) goto L43
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto L43
            r8.skip(r3)
            goto L7a
        L43:
            Yue.ۥۣ۟ۢۨ r8 = r8.f19561
            r8.m4808()
            r0.m10844(r9)
            goto L7a
        L4c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = r1.toString()
            r8.<init>(r9)
            throw r8
        L56:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r2.toString()
            r8.<init>(r9)
            throw r8
        L60:
            boolean r0 = r8 instanceof Yue.AbstractC2355.C2357
            if (r0 == 0) goto L85
            r0 = r8
            Yue.ۥ۠ۡۧۧ$ۥ۟ r0 = (Yue.AbstractC2355.C2357) r0
            Yue.ۥ۠ۡۧۧ r0 = r0.m10841()
            if (r0 != r7) goto L85
            Yue.ۥ۠ۡۧۧ$ۥ۟ r8 = (Yue.AbstractC2355.C2357) r8
            boolean r0 = r8.m10840()
            r0 = r0 ^ 1
            if (r0 == 0) goto L7b
            r8.m10844(r9)
        L7a:
            return
        L7b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = r1.toString()
            r8.<init>(r9)
            throw r8
        L85:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r2.toString()
            r8.<init>(r9)
            throw r8
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m10828(long r3) throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.f7704
            if (r0 == 0) goto L2a
            java.util.concurrent.locks.ReentrantLock r0 = r2.f7707
            r0.lock()
            boolean r1 = r2.f7705     // Catch: java.lang.Throwable -> L18
            r1 = r1 ^ 1
            if (r1 == 0) goto L1a
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L18
            r0.unlock()
            r2.mo10820(r3)
            return
        L18:
            r3 = move-exception
            goto L26
        L1a:
            java.lang.String r3 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L18
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L18
            throw r4     // Catch: java.lang.Throwable -> L18
        L26:
            r0.unlock()
            throw r3
        L2a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "file handle is read-only"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public final Yue.InterfaceC5794 m10829(long r3) throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.f7704
            if (r0 == 0) goto L30
            java.util.concurrent.locks.ReentrantLock r0 = r2.f7707
            r0.lock()
            boolean r1 = r2.f7705     // Catch: java.lang.Throwable -> L1e
            r1 = r1 ^ 1
            if (r1 == 0) goto L20
            int r1 = r2.f7706     // Catch: java.lang.Throwable -> L1e
            int r1 = r1 + 1
            r2.f7706 = r1     // Catch: java.lang.Throwable -> L1e
            r0.unlock()
            Yue.ۥ۠ۡۧۧ$ۥ r0 = new Yue.ۥ۠ۡۧۧ$ۥ
            r0.<init>(r2, r3)
            return r0
        L1e:
            r3 = move-exception
            goto L2c
        L20:
            java.lang.String r3 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1e
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L1e
            throw r4     // Catch: java.lang.Throwable -> L1e
        L2c:
            r0.unlock()
            throw r3
        L30:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "file handle is read-only"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public final long m10830() throws java.io.IOException {
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.f7707
            r0.lock()
            boolean r1 = r3.f7705     // Catch: java.lang.Throwable -> L15
            r1 = r1 ^ 1
            if (r1 == 0) goto L17
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L15
            r0.unlock()
            long r0 = r3.mo10821()
            return r0
        L15:
            r1 = move-exception
            goto L23
        L17:
            java.lang.String r1 = "closed"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L15
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L15
            throw r2     // Catch: java.lang.Throwable -> L15
        L23:
            r0.unlock()
            throw r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public final Yue.InterfaceC5839 m10831(long r3) throws java.io.IOException {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.f7707
            r0.lock()
            boolean r1 = r2.f7705     // Catch: java.lang.Throwable -> L1a
            r1 = r1 ^ 1
            if (r1 == 0) goto L1c
            int r1 = r2.f7706     // Catch: java.lang.Throwable -> L1a
            int r1 = r1 + 1
            r2.f7706 = r1     // Catch: java.lang.Throwable -> L1a
            r0.unlock()
            Yue.ۥ۠ۡۧۧ$ۥ۟ r0 = new Yue.ۥ۠ۡۧۧ$ۥ۟
            r0.<init>(r2, r3)
            return r0
        L1a:
            r3 = move-exception
            goto L28
        L1c:
            java.lang.String r3 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1a
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L1a
            throw r4     // Catch: java.lang.Throwable -> L1a
        L28:
            r0.unlock()
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public final void m10832(long r3, @Yue.InterfaceC4418 Yue.C0843 r5, long r6) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r5, r0)
            boolean r0 = r2.f7704
            if (r0 == 0) goto L2f
            java.util.concurrent.locks.ReentrantLock r0 = r2.f7707
            r0.lock()
            boolean r1 = r2.f7705     // Catch: java.lang.Throwable -> L1d
            r1 = r1 ^ 1
            if (r1 == 0) goto L1f
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L1d
            r0.unlock()
            r2.m10834(r3, r5, r6)
            return
        L1d:
            r3 = move-exception
            goto L2b
        L1f:
            java.lang.String r3 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1d
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L1d
            throw r4     // Catch: java.lang.Throwable -> L1d
        L2b:
            r0.unlock()
            throw r3
        L2f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "file handle is read-only"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public final void m10833(long r3, @Yue.InterfaceC4418 byte[] r5, int r6, int r7) {
            r2 = this;
            java.lang.String r0 = "array"
            Yue.C3329.m13906(r5, r0)
            boolean r0 = r2.f7704
            if (r0 == 0) goto L2f
            java.util.concurrent.locks.ReentrantLock r0 = r2.f7707
            r0.lock()
            boolean r1 = r2.f7705     // Catch: java.lang.Throwable -> L1d
            r1 = r1 ^ 1
            if (r1 == 0) goto L1f
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L1d
            r0.unlock()
            r2.mo10822(r3, r5, r6, r7)
            return
        L1d:
            r3 = move-exception
            goto L2b
        L1f:
            java.lang.String r3 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1d
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L1d
            throw r4     // Catch: java.lang.Throwable -> L1d
        L2b:
            r0.unlock()
            throw r3
        L2f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "file handle is read-only"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public final void m10834(long r9, Yue.C0843 r11, long r12) {
            r8 = this;
            long r0 = r11.m4889()
            r2 = 0
            r4 = r12
            Yue.C0018.m264(r0, r2, r4)
            long r12 = r12 + r9
        Lb:
            int r0 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r0 >= 0) goto L4a
            Yue.ۥۡۧۨ r6 = r11.f2378
            Yue.C3329.m13903(r6)
            long r0 = r12 - r9
            int r2 = r6.f20492
            int r3 = r6.f20491
            int r2 = r2 - r3
            long r2 = (long) r2
            long r0 = java.lang.Math.min(r0, r2)
            int r7 = (int) r0
            byte[] r3 = r6.f20490
            int r4 = r6.f20491
            r0 = r8
            r1 = r9
            r5 = r7
            r0.mo10822(r1, r3, r4, r5)
            int r0 = r6.f20491
            int r0 = r0 + r7
            r6.f20491 = r0
            long r0 = (long) r7
            long r9 = r9 + r0
            long r2 = r11.m4889()
            long r2 = r2 - r0
            r11.m4885(r2)
            int r0 = r6.f20491
            int r1 = r6.f20492
            if (r0 != r1) goto Lb
            Yue.ۥۡۧۨ r0 = r6.m20804()
            r11.f2378 = r0
            Yue.C5550.m20825(r6)
            goto Lb
        L4a:
            return
    }
}
