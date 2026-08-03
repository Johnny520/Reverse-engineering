package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۦ۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public abstract class AbstractServiceC3389 extends android.app.Service {

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final java.lang.String f10828 = "JobIntentService";

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final boolean f10829 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final java.lang.Object f10830 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final java.util.HashMap<android.content.ComponentName, Yue.AbstractServiceC3389.AbstractC3398> f10831 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Yue.AbstractServiceC3389.InterfaceC3391 f10832;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public Yue.AbstractServiceC3389.AbstractC3398 f10833;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public Yue.AbstractServiceC3389.AsyncTaskC3390 f10834;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean f10835;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean f10836;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean f10837;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final java.util.ArrayList<Yue.AbstractServiceC3389.C3393> f10838;

    /* JADX INFO: renamed from: Yue.ۥ۠ۦ۟ۥ$ۥ, reason: contains not printable characters */
    public final class AsyncTaskC3390 extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractServiceC3389 f10839;

        public AsyncTaskC3390(Yue.AbstractServiceC3389 r1) {
                r0 = this;
                r0.f10839 = r1
                r0.<init>()
                return
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ java.lang.Void doInBackground(java.lang.Void[] r1) {
                r0 = this;
                java.lang.Void[] r1 = (java.lang.Void[]) r1
                java.lang.Void r1 = r0.m14010(r1)
                return r1
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onCancelled(java.lang.Void r1) {
                r0 = this;
                java.lang.Void r1 = (java.lang.Void) r1
                r0.m14011(r1)
                return
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(java.lang.Void r1) {
                r0 = this;
                java.lang.Void r1 = (java.lang.Void) r1
                r0.m14012(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public java.lang.Void m14010(java.lang.Void... r3) {
                r2 = this;
            L0:
                Yue.ۥ۠ۦ۟ۥ r3 = r2.f10839
                Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟۟ r3 = r3.m14002()
                if (r3 == 0) goto L15
                Yue.ۥ۠ۦ۟ۥ r0 = r2.f10839
                android.content.Intent r1 = r3.getIntent()
                r0.m14006(r1)
                r3.complete()
                goto L0
            L15:
                r3 = 0
                return r3
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void m14011(java.lang.Void r1) {
                r0 = this;
                Yue.ۥ۠ۦ۟ۥ r1 = r0.f10839
                r1.m14008()
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m14012(java.lang.Void r1) {
                r0 = this;
                Yue.ۥ۠ۦ۟ۥ r1 = r0.f10839
                r1.m14008()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦ۟ۥ$ۥ۟, reason: contains not printable characters */
    public interface InterfaceC3391 {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        android.os.IBinder mo14013();

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        Yue.AbstractServiceC3389.InterfaceC3394 mo14014();
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦ۟ۥ$ۥ۟۟, reason: contains not printable characters */
    public static final class C3392 extends Yue.AbstractServiceC3389.AbstractC3398 {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final android.content.Context f10840;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final android.os.PowerManager.WakeLock f10841;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final android.os.PowerManager.WakeLock f10842;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public boolean f10843;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public boolean f10844;

        public C3392(android.content.Context r4, android.content.ComponentName r5) {
                r3 = this;
                r3.<init>(r5)
                android.content.Context r0 = r4.getApplicationContext()
                r3.f10840 = r0
                java.lang.String r0 = "power"
                java.lang.Object r4 = r4.getSystemService(r0)
                android.os.PowerManager r4 = (android.os.PowerManager) r4
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r5.getClassName()
                r0.append(r1)
                java.lang.String r1 = ":launch"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 1
                android.os.PowerManager$WakeLock r0 = r4.newWakeLock(r1, r0)
                r3.f10841 = r0
                r2 = 0
                r0.setReferenceCounted(r2)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r5 = r5.getClassName()
                r0.append(r5)
                java.lang.String r5 = ":run"
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                android.os.PowerManager$WakeLock r4 = r4.newWakeLock(r1, r5)
                r3.f10842 = r4
                r4.setReferenceCounted(r2)
                return
        }

        @Override // Yue.AbstractServiceC3389.AbstractC3398
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void mo14015(android.content.Intent r3) {
                r2 = this;
                android.content.Intent r0 = new android.content.Intent
                r0.<init>(r3)
                android.content.ComponentName r3 = r2.f10857
                r0.setComponent(r3)
                android.content.Context r3 = r2.f10840
                android.content.ComponentName r3 = r3.startService(r0)
                if (r3 == 0) goto L2d
                monitor-enter(r2)
                boolean r3 = r2.f10843     // Catch: java.lang.Throwable -> L27
                if (r3 != 0) goto L29
                r3 = 1
                r2.f10843 = r3     // Catch: java.lang.Throwable -> L27
                boolean r3 = r2.f10844     // Catch: java.lang.Throwable -> L27
                if (r3 != 0) goto L29
                android.os.PowerManager$WakeLock r3 = r2.f10841     // Catch: java.lang.Throwable -> L27
                r0 = 60000(0xea60, double:2.9644E-319)
                r3.acquire(r0)     // Catch: java.lang.Throwable -> L27
                goto L29
            L27:
                r3 = move-exception
                goto L2b
            L29:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
                goto L2d
            L2b:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
                throw r3
            L2d:
                return
        }

        @Override // Yue.AbstractServiceC3389.AbstractC3398
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void mo14016() {
                r3 = this;
                monitor-enter(r3)
                boolean r0 = r3.f10844     // Catch: java.lang.Throwable -> L12
                if (r0 == 0) goto L1c
                boolean r0 = r3.f10843     // Catch: java.lang.Throwable -> L12
                if (r0 == 0) goto L14
                android.os.PowerManager$WakeLock r0 = r3.f10841     // Catch: java.lang.Throwable -> L12
                r1 = 60000(0xea60, double:2.9644E-319)
                r0.acquire(r1)     // Catch: java.lang.Throwable -> L12
                goto L14
            L12:
                r0 = move-exception
                goto L1e
            L14:
                r0 = 0
                r3.f10844 = r0     // Catch: java.lang.Throwable -> L12
                android.os.PowerManager$WakeLock r0 = r3.f10842     // Catch: java.lang.Throwable -> L12
                r0.release()     // Catch: java.lang.Throwable -> L12
            L1c:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
                return
            L1e:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
                throw r0
        }

        @Override // Yue.AbstractServiceC3389.AbstractC3398
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void mo14017() {
                r3 = this;
                monitor-enter(r3)
                boolean r0 = r3.f10844     // Catch: java.lang.Throwable -> L16
                if (r0 != 0) goto L18
                r0 = 1
                r3.f10844 = r0     // Catch: java.lang.Throwable -> L16
                android.os.PowerManager$WakeLock r0 = r3.f10842     // Catch: java.lang.Throwable -> L16
                r1 = 600000(0x927c0, double:2.964394E-318)
                r0.acquire(r1)     // Catch: java.lang.Throwable -> L16
                android.os.PowerManager$WakeLock r0 = r3.f10841     // Catch: java.lang.Throwable -> L16
                r0.release()     // Catch: java.lang.Throwable -> L16
                goto L18
            L16:
                r0 = move-exception
                goto L1a
            L18:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L16
                return
            L1a:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L16
                throw r0
        }

        @Override // Yue.AbstractServiceC3389.AbstractC3398
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void mo14018() {
                r1 = this;
                monitor-enter(r1)
                r0 = 0
                r1.f10843 = r0     // Catch: java.lang.Throwable -> L6
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
                return
            L6:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
                throw r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟, reason: contains not printable characters */
    public final class C3393 implements Yue.AbstractServiceC3389.InterfaceC3394 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.content.Intent f10845;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final int f10846;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractServiceC3389 f10847;

        public C3393(Yue.AbstractServiceC3389 r1, android.content.Intent r2, int r3) {
                r0 = this;
                r0.f10847 = r1
                r0.<init>()
                r0.f10845 = r2
                r0.f10846 = r3
                return
        }

        @Override // Yue.AbstractServiceC3389.InterfaceC3394
        public void complete() {
                r2 = this;
                Yue.ۥ۠ۦ۟ۥ r0 = r2.f10847
                int r1 = r2.f10846
                r0.stopSelf(r1)
                return
        }

        @Override // Yue.AbstractServiceC3389.InterfaceC3394
        public android.content.Intent getIntent() {
                r1 = this;
                android.content.Intent r0 = r1.f10845
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟۟, reason: contains not printable characters */
    public interface InterfaceC3394 {
        void complete();

        android.content.Intent getIntent();
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC5336(26)
    public static final class JobServiceEngineC3395 extends android.app.job.JobServiceEngine implements Yue.AbstractServiceC3389.InterfaceC3391 {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final java.lang.String f10848 = "JobServiceEngineImpl";

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final boolean f10849 = false;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.AbstractServiceC3389 f10850;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.lang.Object f10851;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public android.app.job.JobParameters f10852;

        /* JADX INFO: renamed from: Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟۠$ۥ, reason: contains not printable characters */
        public final class C3396 implements Yue.AbstractServiceC3389.InterfaceC3394 {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public final android.app.job.JobWorkItem f10853;

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public final /* synthetic */ Yue.AbstractServiceC3389.JobServiceEngineC3395 f10854;

            public C3396(Yue.AbstractServiceC3389.JobServiceEngineC3395 r1, android.app.job.JobWorkItem r2) {
                    r0 = this;
                    r0.f10854 = r1
                    r0.<init>()
                    r0.f10853 = r2
                    return
            }

            @Override // Yue.AbstractServiceC3389.InterfaceC3394
            public void complete() {
                    r3 = this;
                    Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟۠ r0 = r3.f10854
                    java.lang.Object r0 = r0.f10851
                    monitor-enter(r0)
                    Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟۠ r1 = r3.f10854     // Catch: java.lang.Throwable -> L11
                    android.app.job.JobParameters r1 = r1.f10852     // Catch: java.lang.Throwable -> L11
                    if (r1 == 0) goto L13
                    android.app.job.JobWorkItem r2 = r3.f10853     // Catch: java.lang.Throwable -> L11
                    r1.completeWork(r2)     // Catch: java.lang.Throwable -> L11
                    goto L13
                L11:
                    r1 = move-exception
                    goto L15
                L13:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                    return
                L15:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                    throw r1
            }

            @Override // Yue.AbstractServiceC3389.InterfaceC3394
            public android.content.Intent getIntent() {
                    r1 = this;
                    android.app.job.JobWorkItem r0 = r1.f10853
                    android.content.Intent r0 = r0.getIntent()
                    return r0
            }
        }

        public JobServiceEngineC3395(Yue.AbstractServiceC3389 r2) {
                r1 = this;
                r1.<init>(r2)
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r1.f10851 = r0
                r1.f10850 = r2
                return
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(android.app.job.JobParameters r2) {
                r1 = this;
                r1.f10852 = r2
                Yue.ۥ۠ۦ۟ۥ r2 = r1.f10850
                r0 = 0
                r2.m14004(r0)
                r2 = 1
                return r2
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(android.app.job.JobParameters r3) {
                r2 = this;
                Yue.ۥ۠ۦ۟ۥ r3 = r2.f10850
                boolean r3 = r3.m14003()
                java.lang.Object r0 = r2.f10851
                monitor-enter(r0)
                r1 = 0
                r2.f10852 = r1     // Catch: java.lang.Throwable -> Le
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
                return r3
            Le:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
                throw r3
        }

        @Override // Yue.AbstractServiceC3389.InterfaceC3391
        /* JADX INFO: renamed from: ۥ */
        public android.os.IBinder mo14013() {
                r1 = this;
                android.os.IBinder r0 = r1.getBinder()
                return r0
        }

        @Override // Yue.AbstractServiceC3389.InterfaceC3391
        /* JADX INFO: renamed from: ۥ۟ */
        public Yue.AbstractServiceC3389.InterfaceC3394 mo14014() {
                r3 = this;
                java.lang.Object r0 = r3.f10851
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.f10852     // Catch: java.lang.Throwable -> La
                r2 = 0
                if (r1 != 0) goto Lc
                monitor-exit(r0)     // Catch: java.lang.Throwable -> La
                return r2
            La:
                r1 = move-exception
                goto L27
            Lc:
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch: java.lang.Throwable -> La
                monitor-exit(r0)     // Catch: java.lang.Throwable -> La
                if (r1 == 0) goto L26
                android.content.Intent r0 = r1.getIntent()
                Yue.ۥ۠ۦ۟ۥ r2 = r3.f10850
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟۠$ۥ r0 = new Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟۠$ۥ
                r0.<init>(r3, r1)
                return r0
            L26:
                return r2
            L27:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> La
                throw r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC5336(26)
    public static final class C3397 extends Yue.AbstractServiceC3389.AbstractC3398 {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final android.app.job.JobInfo f10855;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final android.app.job.JobScheduler f10856;

        public C3397(android.content.Context r3, android.content.ComponentName r4, int r5) {
                r2 = this;
                r2.<init>(r4)
                r2.m14019(r5)
                android.app.job.JobInfo$Builder r4 = new android.app.job.JobInfo$Builder
                android.content.ComponentName r0 = r2.f10857
                r4.<init>(r5, r0)
                r0 = 0
                android.app.job.JobInfo$Builder r4 = r4.setOverrideDeadline(r0)
                android.app.job.JobInfo r4 = r4.build()
                r2.f10855 = r4
                android.content.Context r3 = r3.getApplicationContext()
                java.lang.String r4 = "jobscheduler"
                java.lang.Object r3 = r3.getSystemService(r4)
                android.app.job.JobScheduler r3 = (android.app.job.JobScheduler) r3
                r2.f10856 = r3
                return
        }

        @Override // Yue.AbstractServiceC3389.AbstractC3398
        /* JADX INFO: renamed from: ۥ */
        public void mo14015(android.content.Intent r4) {
                r3 = this;
                android.app.job.JobScheduler r0 = r3.f10856
                android.app.job.JobInfo r1 = r3.f10855
                android.app.job.JobWorkItem r2 = new android.app.job.JobWorkItem
                r2.<init>(r4)
                r0.enqueue(r1, r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static abstract class AbstractC3398 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.content.ComponentName f10857;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public boolean f10858;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f10859;

        public AbstractC3398(android.content.ComponentName r1) {
                r0 = this;
                r0.<init>()
                r0.f10857 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ */
        public abstract void mo14015(android.content.Intent r1);

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void m14019(int r4) {
                r3 = this;
                boolean r0 = r3.f10858
                if (r0 != 0) goto La
                r0 = 1
                r3.f10858 = r0
                r3.f10859 = r4
                goto Le
            La:
                int r0 = r3.f10859
                if (r0 != r4) goto Lf
            Le:
                return
            Lf:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Given job ID "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = " is different than previous "
                r1.append(r4)
                int r4 = r3.f10859
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo14016() {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo14017() {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo14018() {
                r0 = this;
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            Yue.AbstractServiceC3389.f10830 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            Yue.AbstractServiceC3389.f10831 = r0
            return
    }

    public AbstractServiceC3389() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f10835 = r0
            r1.f10836 = r0
            r1.f10837 = r0
            r0 = 0
            r1.f10838 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m13999(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 android.content.ComponentName r3, int r4, @Yue.InterfaceC4410 android.content.Intent r5) {
            if (r5 == 0) goto L15
            java.lang.Object r0 = Yue.AbstractServiceC3389.f10830
            monitor-enter(r0)
            r1 = 1
            Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟ۢ r2 = m14001(r2, r3, r1, r4)     // Catch: java.lang.Throwable -> L12
            r2.m14019(r4)     // Catch: java.lang.Throwable -> L12
            r2.mo14015(r5)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r2
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "work must not be null"
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m14000(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 java.lang.Class<?> r2, int r3, @Yue.InterfaceC4410 android.content.Intent r4) {
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r1, r2)
            m13999(r1, r0, r3, r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static Yue.AbstractServiceC3389.AbstractC3398 m14001(android.content.Context r2, android.content.ComponentName r3, boolean r4, int r5) {
            java.util.HashMap<android.content.ComponentName, Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟ۢ> r0 = Yue.AbstractServiceC3389.f10831
            java.lang.Object r1 = r0.get(r3)
            Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟ۢ r1 = (Yue.AbstractServiceC3389.AbstractC3398) r1
            if (r1 != 0) goto L1d
            if (r4 == 0) goto L15
            Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟ۡ r1 = new Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟ۡ
            r1.<init>(r2, r3, r5)
            r0.put(r3, r1)
            goto L1d
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Can't be here without a job id"
            r2.<init>(r3)
            throw r2
        L1d:
            return r1
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(@Yue.InterfaceC4410 android.content.Intent r1) {
            r0 = this;
            Yue.ۥ۠ۦ۟ۥ$ۥ۟ r1 = r0.f10832
            if (r1 == 0) goto L9
            android.os.IBinder r1 = r1.mo14013()
            return r1
        L9:
            r1 = 0
            return r1
    }

    @Override // android.app.Service
    public void onCreate() {
            r1 = this;
            super.onCreate()
            Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟۠ r0 = new Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟۠
            r0.<init>(r1)
            r1.f10832 = r0
            r0 = 0
            r1.f10833 = r0
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r2 = this;
            super.onDestroy()
            java.util.ArrayList<Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟> r0 = r2.f10838
            if (r0 == 0) goto L15
            monitor-enter(r0)
            r1 = 1
            r2.f10837 = r1     // Catch: java.lang.Throwable -> L12
            Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟ۢ r1 = r2.f10833     // Catch: java.lang.Throwable -> L12
            r1.mo14016()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
        L15:
            return
    }

    @Override // android.app.Service
    public int onStartCommand(@Yue.InterfaceC4544 android.content.Intent r3, int r4, int r5) {
            r2 = this;
            java.util.ArrayList<Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟> r4 = r2.f10838
            if (r4 == 0) goto L28
            Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟ۢ r4 = r2.f10833
            r4.mo14018()
            java.util.ArrayList<Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟> r4 = r2.f10838
            monitor-enter(r4)
            java.util.ArrayList<Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟> r0 = r2.f10838     // Catch: java.lang.Throwable -> L25
            Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟ r1 = new Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L13
            goto L18
        L13:
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L25
            r3.<init>()     // Catch: java.lang.Throwable -> L25
        L18:
            r1.<init>(r2, r3, r5)     // Catch: java.lang.Throwable -> L25
            r0.add(r1)     // Catch: java.lang.Throwable -> L25
            r3 = 1
            r2.m14004(r3)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L25
            r3 = 3
            return r3
        L25:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L25
            throw r3
        L28:
            r3 = 2
            return r3
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.AbstractServiceC3389.InterfaceC3394 m14002() {
            r3 = this;
            Yue.ۥ۠ۦ۟ۥ$ۥ۟ r0 = r3.f10832
            if (r0 == 0) goto L9
            Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟۟ r0 = r0.mo14014()
            return r0
        L9:
            java.util.ArrayList<Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟> r0 = r3.f10838
            monitor-enter(r0)
            java.util.ArrayList<Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟> r1 = r3.f10838     // Catch: java.lang.Throwable -> L1f
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L1f
            if (r1 <= 0) goto L21
            java.util.ArrayList<Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟> r1 = r3.f10838     // Catch: java.lang.Throwable -> L1f
            r2 = 0
            java.lang.Object r1 = r1.remove(r2)     // Catch: java.lang.Throwable -> L1f
            Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟۟ r1 = (Yue.AbstractServiceC3389.InterfaceC3394) r1     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            return r1
        L1f:
            r1 = move-exception
            goto L24
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            r0 = 0
            return r0
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean m14003() {
            r2 = this;
            Yue.ۥ۠ۦ۟ۥ$ۥ r0 = r2.f10834
            if (r0 == 0) goto L9
            boolean r1 = r2.f10835
            r0.cancel(r1)
        L9:
            r0 = 1
            r2.f10836 = r0
            boolean r0 = r2.m14007()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m14004(boolean r3) {
            r2 = this;
            Yue.ۥ۠ۦ۟ۥ$ۥ r0 = r2.f10834
            if (r0 != 0) goto L1e
            Yue.ۥ۠ۦ۟ۥ$ۥ r0 = new Yue.ۥ۠ۦ۟ۥ$ۥ
            r0.<init>(r2)
            r2.f10834 = r0
            Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟ۢ r0 = r2.f10833
            if (r0 == 0) goto L14
            if (r3 == 0) goto L14
            r0.mo14017()
        L14:
            Yue.ۥ۠ۦ۟ۥ$ۥ r3 = r2.f10834
            java.util.concurrent.Executor r0 = android.os.AsyncTask.THREAD_POOL_EXECUTOR
            r1 = 0
            java.lang.Void[] r1 = new java.lang.Void[r1]
            r3.executeOnExecutor(r0, r1)
        L1e:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m14005() {
            r1 = this;
            boolean r0 = r1.f10836
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public abstract void m14006(@Yue.InterfaceC4410 android.content.Intent r1);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m14007() {
            r1 = this;
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m14008() {
            r2 = this;
            java.util.ArrayList<Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟> r0 = r2.f10838
            if (r0 == 0) goto L26
            monitor-enter(r0)
            r1 = 0
            r2.f10834 = r1     // Catch: java.lang.Throwable -> L17
            java.util.ArrayList<Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟> r1 = r2.f10838     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L17
            if (r1 <= 0) goto L19
            r1 = 0
            r2.m14004(r1)     // Catch: java.lang.Throwable -> L17
            goto L22
        L17:
            r1 = move-exception
            goto L24
        L19:
            boolean r1 = r2.f10837     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L22
            Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟ۢ r1 = r2.f10833     // Catch: java.lang.Throwable -> L17
            r1.mo14016()     // Catch: java.lang.Throwable -> L17
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            goto L26
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
        L26:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m14009(boolean r1) {
            r0 = this;
            r0.f10835 = r1
            return
    }
}
