package l3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final java.lang.Object f7791j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile l3.i f7792k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock f7793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f.f f7794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f7795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.os.Handler f7796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l3.f f7797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l3.h f7798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a2.a f7799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l3.d f7801i;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            l3.i.f7791j = r0
            return
    }

    public i(l3.s r5) {
            r4 = this;
            r4.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r4.f7793a = r0
            r1 = 3
            r4.f7795c = r1
            l3.h r1 = r5.f7820a
            r4.f7798f = r1
            int r2 = r5.f7821b
            r4.f7800h = r2
            l3.d r5 = r5.f7822c
            r4.f7801i = r5
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r5.<init>(r3)
            r4.f7796d = r5
            f.f r5 = new f.f
            r5.<init>()
            r4.f7794b = r5
            a2.a r5 = new a2.a
            r3 = 28
            r5.<init>(r3)
            r4.f7799g = r5
            l3.f r5 = new l3.f
            r5.<init>(r4)
            r4.f7797e = r5
            java.util.concurrent.locks.Lock r3 = r0.writeLock()
            r3.lock()
            if (r2 != 0) goto L53
            r2 = 0
            r4.f7795c = r2     // Catch: java.lang.Throwable -> L48
            goto L53
        L48:
            r5 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r4.f7793a
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            throw r5
        L53:
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            int r0 = r4.c()
            if (r0 != 0) goto L6d
            l3.e r0 = new l3.e     // Catch: java.lang.Throwable -> L69
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L69
            r1.a(r0)     // Catch: java.lang.Throwable -> L69
            return
        L69:
            r5 = move-exception
            r4.f(r5)
        L6d:
            return
    }

    public static l3.i a() {
            java.lang.Object r0 = l3.i.f7791j
            monitor-enter(r0)
            l3.i r1 = l3.i.f7792k     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            java.lang.String r3 = "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message."
            if (r2 == 0) goto L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return r1
        L10:
            r1 = move-exception
            goto L18
        L12:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L10
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L10
            throw r1     // Catch: java.lang.Throwable -> L10
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    public static boolean d() {
            l3.i r0 = l3.i.f7792k
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final int b(java.lang.CharSequence r10, int r11) {
            r9 = this;
            int r0 = r9.c()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L9
            goto La
        L9:
            r2 = r1
        La:
            if (r2 == 0) goto L61
            java.lang.String r0 = "charSequence cannot be null"
            ac.p.k(r10, r0)
            l3.f r0 = r9.f7797e
            b5.c r2 = r0.f7787b
            r2.getClass()
            if (r11 < 0) goto L5f
            int r0 = r10.length()
            if (r11 < r0) goto L21
            goto L5f
        L21:
            boolean r0 = r10 instanceof android.text.Spanned
            if (r0 == 0) goto L3c
            r0 = r10
            android.text.Spanned r0 = (android.text.Spanned) r0
            int r3 = r11 + 1
            java.lang.Class<l3.v> r4 = l3.v.class
            java.lang.Object[] r3 = r0.getSpans(r11, r3, r4)
            l3.v[] r3 = (l3.v[]) r3
            int r4 = r3.length
            if (r4 <= 0) goto L3c
            r10 = r3[r1]
            int r10 = r0.getSpanStart(r10)
            return r10
        L3c:
            int r0 = r11 + (-16)
            int r4 = java.lang.Math.max(r1, r0)
            int r0 = r10.length()
            int r1 = r11 + 16
            int r5 = java.lang.Math.min(r0, r1)
            l3.p r8 = new l3.p
            r8.<init>(r11)
            r6 = 2147483647(0x7fffffff, float:NaN)
            r7 = 1
            r3 = r10
            java.lang.Object r10 = r2.G(r3, r4, r5, r6, r7, r8)
            l3.p r10 = (l3.p) r10
            int r10 = r10.f7807h
            return r10
        L5f:
            r10 = -1
            return r10
        L61:
            java.lang.String r10 = "Not initialized yet"
            j8.o.A(r10)
            r10 = 0
            return r10
    }

    public final int c() {
            r2 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r2.f7793a
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            int r0 = r2.f7795c     // Catch: java.lang.Throwable -> L15
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r2.f7793a
            java.util.concurrent.locks.Lock r1 = r1.readLock()
            r1.unlock()
            return r0
        L15:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r2.f7793a
            java.util.concurrent.locks.Lock r1 = r1.readLock()
            r1.unlock()
            throw r0
    }

    public final void e() {
            r3 = this;
            int r0 = r3.f7800h
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            if (r0 == 0) goto L53
            int r0 = r3.c()
            if (r0 != r2) goto L12
            return
        L12:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r3.f7793a
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            int r0 = r3.f7795c     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto L29
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r3.f7793a
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            return
        L29:
            r3.f7795c = r1     // Catch: java.lang.Throwable -> L48
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r3.f7793a
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            l3.f r0 = r3.f7797e
            l3.i r1 = r0.f7786a
            l3.e r2 = new l3.e     // Catch: java.lang.Throwable -> L43
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L43
            l3.h r0 = r1.f7798f     // Catch: java.lang.Throwable -> L43
            r0.a(r2)     // Catch: java.lang.Throwable -> L43
            return
        L43:
            r0 = move-exception
            r1.f(r0)
            return
        L48:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r3.f7793a
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            throw r0
        L53:
            java.lang.String r0 = "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading"
            j8.o.A(r0)
            return
    }

    public final void f(java.lang.Throwable r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r4.f7793a
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.lock()
            r1 = 2
            r4.f7795c = r1     // Catch: java.lang.Throwable -> L31
            f.f r1 = r4.f7794b     // Catch: java.lang.Throwable -> L31
            r0.addAll(r1)     // Catch: java.lang.Throwable -> L31
            f.f r1 = r4.f7794b     // Catch: java.lang.Throwable -> L31
            r1.clear()     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r4.f7793a
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            android.os.Handler r1 = r4.f7796d
            l3.g r2 = new l3.g
            int r3 = r4.f7795c
            r2.<init>(r0, r3, r5)
            r1.post(r2)
            return
        L31:
            r5 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r4.f7793a
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            throw r5
    }

    public final void g(android.view.inputmethod.EditorInfo r6) {
            r5 = this;
            int r0 = r5.c()
            r1 = 1
            if (r0 != r1) goto L43
            if (r6 != 0) goto La
            return
        La:
            android.os.Bundle r0 = r6.extras
            if (r0 != 0) goto L15
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r6.extras = r0
        L15:
            l3.f r0 = r5.f7797e
            r0.getClass()
            android.os.Bundle r1 = r6.extras
            hb.c r0 = r0.f7788c
            java.lang.Object r0 = r0.f5338g
            m3.b r0 = (m3.b) r0
            r2 = 4
            int r2 = r0.a(r2)
            r3 = 0
            if (r2 == 0) goto L36
            java.lang.Object r4 = r0.f8716j
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            int r0 = r0.f8713g
            int r2 = r2 + r0
            int r0 = r4.getInt(r2)
            goto L37
        L36:
            r0 = r3
        L37:
            java.lang.String r2 = "android.support.text.emoji.emojiCompat_metadataVersion"
            r1.putInt(r2, r0)
            android.os.Bundle r6 = r6.extras
            java.lang.String r0 = "android.support.text.emoji.emojiCompat_replaceAll"
            r6.putBoolean(r0, r3)
        L43:
            return
    }
}
