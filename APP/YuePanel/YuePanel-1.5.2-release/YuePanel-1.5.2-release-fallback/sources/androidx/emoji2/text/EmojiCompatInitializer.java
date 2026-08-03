package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements Yue.InterfaceC3247<java.lang.Boolean> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final long f29005 = 500;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String f29006 = "EmojiCompatInitializer";


    /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(19)
    public static class C7517 extends androidx.emoji2.text.C7527.AbstractC7532 {
        public C7517(android.content.Context r2) {
                r1 = this;
                androidx.emoji2.text.EmojiCompatInitializer$ۥ۟ r0 = new androidx.emoji2.text.EmojiCompatInitializer$ۥ۟
                r0.<init>(r2)
                r1.<init>(r0)
                r2 = 1
                r1.m28983(r2)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(19)
    public static class C7518 implements androidx.emoji2.text.C7527.InterfaceC7538 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.content.Context f29009;

        /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$ۥ۟$ۥ, reason: contains not printable characters */
        public class C7519 extends androidx.emoji2.text.C7527.AbstractC7539 {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public final /* synthetic */ androidx.emoji2.text.C7527.AbstractC7539 f29010;

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public final /* synthetic */ java.util.concurrent.ThreadPoolExecutor f29011;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public final /* synthetic */ androidx.emoji2.text.EmojiCompatInitializer.C7518 f29012;

            public C7519(androidx.emoji2.text.EmojiCompatInitializer.C7518 r1, androidx.emoji2.text.C7527.AbstractC7539 r2, java.util.concurrent.ThreadPoolExecutor r3) {
                    r0 = this;
                    r0.f29012 = r1
                    r0.f29010 = r2
                    r0.f29011 = r3
                    r0.<init>()
                    return
            }

            @Override // androidx.emoji2.text.C7527.AbstractC7539
            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public void mo28919(@Yue.InterfaceC4544 java.lang.Throwable r2) {
                    r1 = this;
                    androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۥ r0 = r1.f29010     // Catch: java.lang.Throwable -> Lb
                    r0.mo28919(r2)     // Catch: java.lang.Throwable -> Lb
                    java.util.concurrent.ThreadPoolExecutor r2 = r1.f29011
                    r2.shutdown()
                    return
                Lb:
                    r2 = move-exception
                    java.util.concurrent.ThreadPoolExecutor r0 = r1.f29011
                    r0.shutdown()
                    throw r2
            }

            @Override // androidx.emoji2.text.C7527.AbstractC7539
            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public void mo28920(@Yue.InterfaceC4410 androidx.emoji2.text.C7555 r2) {
                    r1 = this;
                    androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۥ r0 = r1.f29010     // Catch: java.lang.Throwable -> Lb
                    r0.mo28920(r2)     // Catch: java.lang.Throwable -> Lb
                    java.util.concurrent.ThreadPoolExecutor r2 = r1.f29011
                    r2.shutdown()
                    return
                Lb:
                    r2 = move-exception
                    java.util.concurrent.ThreadPoolExecutor r0 = r1.f29011
                    r0.shutdown()
                    throw r2
            }
        }

        public C7518(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                android.content.Context r1 = r1.getApplicationContext()
                r0.f29009 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static /* synthetic */ void m28915(androidx.emoji2.text.EmojiCompatInitializer.C7518 r0, androidx.emoji2.text.C7527.AbstractC7539 r1, java.util.concurrent.ThreadPoolExecutor r2) {
                r0.m28918(r1, r2)
                return
        }

        @Override // androidx.emoji2.text.C7527.InterfaceC7538
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void mo28916(@Yue.InterfaceC4410 androidx.emoji2.text.C7527.AbstractC7539 r3) {
                r2 = this;
                java.lang.String r0 = "EmojiCompatInitializer"
                java.util.concurrent.ThreadPoolExecutor r0 = Yue.C1444.m7092(r0)
                Yue.ۥ۠۠ۦ r1 = new Yue.ۥ۠۠ۦ
                r1.<init>(r2, r3, r0)
                r0.execute(r1)
                return
        }

        @Yue.InterfaceC7131
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m28917(@Yue.InterfaceC4410 androidx.emoji2.text.C7527.AbstractC7539 r3, @Yue.InterfaceC4410 java.util.concurrent.ThreadPoolExecutor r4) {
                r2 = this;
                android.content.Context r0 = r2.f29009     // Catch: java.lang.Throwable -> L18
                androidx.emoji2.text.ۥ۟۟۟۟ r0 = androidx.emoji2.text.C7521.m28921(r0)     // Catch: java.lang.Throwable -> L18
                if (r0 == 0) goto L1a
                r0.m29019(r4)     // Catch: java.lang.Throwable -> L18
                androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۤ r0 = r0.m28978()     // Catch: java.lang.Throwable -> L18
                androidx.emoji2.text.EmojiCompatInitializer$ۥ۟$ۥ r1 = new androidx.emoji2.text.EmojiCompatInitializer$ۥ۟$ۥ     // Catch: java.lang.Throwable -> L18
                r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L18
                r0.mo28916(r1)     // Catch: java.lang.Throwable -> L18
                goto L28
            L18:
                r0 = move-exception
                goto L22
            L1a:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L18
                java.lang.String r1 = "EmojiCompat font provider not available on this device."
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L18
                throw r0     // Catch: java.lang.Throwable -> L18
            L22:
                r3.mo28919(r0)
                r4.shutdown()
            L28:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ void m28918(androidx.emoji2.text.C7527.AbstractC7539 r1, java.util.concurrent.ThreadPoolExecutor r2) {
                r0 = this;
                r0.m28917(r1, r2)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompatInitializer$ۥ۟۟, reason: contains not printable characters */
    public static class RunnableC7520 implements java.lang.Runnable {
        public RunnableC7520() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                java.lang.String r0 = "EmojiCompat.EmojiCompatInitializer.run"
                Yue.C6388.m23593(r0)     // Catch: java.lang.Throwable -> L13
                boolean r0 = androidx.emoji2.text.C7527.m28943()     // Catch: java.lang.Throwable -> L13
                if (r0 == 0) goto L15
                androidx.emoji2.text.ۥ۟۟ r0 = androidx.emoji2.text.C7527.m28937()     // Catch: java.lang.Throwable -> L13
                r0.m28957()     // Catch: java.lang.Throwable -> L13
                goto L15
            L13:
                r0 = move-exception
                goto L19
            L15:
                Yue.C6388.m23595()
                return
            L19:
                Yue.C6388.m23595()
                throw r0
        }
    }

    public EmojiCompatInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // Yue.InterfaceC3247
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ java.lang.Boolean create(@Yue.InterfaceC4410 android.content.Context r1) {
            r0 = this;
            java.lang.Boolean r1 = r0.m28912(r1)
            return r1
    }

    @Override // Yue.InterfaceC3247
    @Yue.InterfaceC4410
    public java.util.List<java.lang.Class<? extends Yue.InterfaceC3247<?>>> dependencies() {
            r1 = this;
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r0 = androidx.lifecycle.ProcessLifecycleInitializer.class
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.lang.Boolean m28912(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            androidx.emoji2.text.EmojiCompatInitializer$ۥ r0 = new androidx.emoji2.text.EmojiCompatInitializer$ۥ
            r0.<init>(r2)
            androidx.emoji2.text.C7527.m28942(r0)
            r1.m28913(r2)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            return r2
    }

    @Yue.InterfaceC5336(19)
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m28913(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            Yue.ۥ۟ۡۥۢ r2 = Yue.C0532.m1881(r2)
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r0 = androidx.lifecycle.ProcessLifecycleInitializer.class
            java.lang.Object r2 = r2.m1887(r0)
            androidx.lifecycle.LifecycleOwner r2 = (androidx.lifecycle.LifecycleOwner) r2
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            androidx.emoji2.text.EmojiCompatInitializer$1 r0 = new androidx.emoji2.text.EmojiCompatInitializer$1
            r0.<init>(r1, r2)
            r2.addObserver(r0)
            return
    }

    @Yue.InterfaceC5336(19)
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m28914() {
            r4 = this;
            android.os.Handler r0 = Yue.C1444.m7094()
            androidx.emoji2.text.EmojiCompatInitializer$ۥ۟۟ r1 = new androidx.emoji2.text.EmojiCompatInitializer$ۥ۟۟
            r1.<init>()
            r2 = 500(0x1f4, double:2.47E-321)
            r0.postDelayed(r1, r2)
            return
    }
}
