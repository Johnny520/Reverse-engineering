package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final java.lang.Object j = null;
    public static volatile androidx.emoji2.text.c k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock f892a;
    public final a.L1 b;
    public volatile int c;
    public final android.os.Handler d;
    public final androidx.emoji2.text.c.a e;
    public final androidx.emoji2.text.c.g f;
    public final androidx.emoji2.text.c.d g;
    public final int h;
    public final a.P4 i;

    public static final class a extends androidx.emoji2.text.c.b {
        public volatile a.Q5 b;
        public volatile a.C0230kb c;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.emoji2.text.c f893a;

        public b(androidx.emoji2.text.c r1) {
                r0 = this;
                r0.<init>()
                r0.f893a = r1
                return
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0014c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.emoji2.text.c.g f894a;
        public int b;
        public final a.P4 c;

        public AbstractC0014c(androidx.emoji2.text.c.g r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.b = r0
                a.P4 r0 = new a.P4
                r0.<init>()
                r1.c = r0
                r1.f894a = r2
                return
        }
    }

    public static class d {
    }

    public static abstract class e {
        public e() {
                r0 = this;
                r0.<init>()
                return
        }

        public void a() {
                r0 = this;
                return
        }

        public void b() {
                r0 = this;
                return
        }
    }

    public static class f implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.util.ArrayList f895a;
        public final int b;

        public f(java.util.List r1, int r2, java.lang.Throwable r3) {
                r0 = this;
                r0.<init>()
                java.lang.String r3 = "initCallbacks cannot be null"
                a.C0282n9.h(r1, r3)
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>(r1)
                r0.f895a = r3
                r0.b = r2
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r5 = this;
                java.util.ArrayList r0 = r5.f895a
                int r1 = r0.size()
                int r2 = r5.b
                r3 = 1
                r4 = 0
                if (r2 == r3) goto L1a
            Lc:
                if (r4 >= r1) goto L28
                java.lang.Object r2 = r0.get(r4)
                androidx.emoji2.text.c$e r2 = (androidx.emoji2.text.c.e) r2
                r2.a()
                int r4 = r4 + 1
                goto Lc
            L1a:
                if (r4 >= r1) goto L28
                java.lang.Object r2 = r0.get(r4)
                androidx.emoji2.text.c$e r2 = (androidx.emoji2.text.c.e) r2
                r2.b()
                int r4 = r4 + 1
                goto L1a
            L28:
                return
        }
    }

    public interface g {
        void a(androidx.emoji2.text.c.h r1);
    }

    public static abstract class h {
        public abstract void a(java.lang.Throwable r1);

        public abstract void b(a.C0230kb r1);
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.emoji2.text.c.j = r0
            return
    }

    public c(androidx.emoji2.text.EmojiCompatInitializer.a r5) {
            r4 = this;
            r4.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r4.f892a = r0
            r1 = 3
            r4.c = r1
            androidx.emoji2.text.c$g r1 = r5.f894a
            r4.f = r1
            int r2 = r5.b
            r4.h = r2
            a.P4 r5 = r5.c
            r4.i = r5
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r5.<init>(r3)
            r4.d = r5
            a.L1 r5 = new a.L1
            r5.<init>()
            r4.b = r5
            androidx.emoji2.text.c$d r5 = new androidx.emoji2.text.c$d
            r5.<init>()
            r4.g = r5
            androidx.emoji2.text.c$a r5 = new androidx.emoji2.text.c$a
            r5.<init>(r4)
            r4.e = r5
            java.util.concurrent.locks.Lock r3 = r0.writeLock()
            r3.lock()
            if (r2 != 0) goto L51
            r2 = 0
            r4.c = r2     // Catch: java.lang.Throwable -> L46
            goto L51
        L46:
            r5 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r4.f892a
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            throw r5
        L51:
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            int r0 = r4.b()
            if (r0 != 0) goto L6b
            androidx.emoji2.text.b r0 = new androidx.emoji2.text.b     // Catch: java.lang.Throwable -> L67
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L67
            r1.a(r0)     // Catch: java.lang.Throwable -> L67
            return
        L67:
            r5 = move-exception
            r4.d(r5)
        L6b:
            return
    }

    public static androidx.emoji2.text.c a() {
            java.lang.Object r0 = androidx.emoji2.text.c.j
            monitor-enter(r0)
            androidx.emoji2.text.c r1 = androidx.emoji2.text.c.k     // Catch: java.lang.Throwable -> L10
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

    public final int b() {
            r2 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r2.f892a
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            int r0 = r2.c     // Catch: java.lang.Throwable -> L15
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r2.f892a
            java.util.concurrent.locks.Lock r1 = r1.readLock()
            r1.unlock()
            return r0
        L15:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r2.f892a
            java.util.concurrent.locks.Lock r1 = r1.readLock()
            r1.unlock()
            throw r0
    }

    public final void c() {
            r3 = this;
            int r0 = r3.h
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            if (r0 == 0) goto L53
            int r0 = r3.b()
            if (r0 != r2) goto L12
            goto L47
        L12:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r3.f892a
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            int r0 = r3.c     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto L29
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r3.f892a
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            return
        L29:
            r3.c = r1     // Catch: java.lang.Throwable -> L48
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r3.f892a
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            androidx.emoji2.text.c$a r0 = r3.e
            androidx.emoji2.text.c r1 = r0.f893a
            androidx.emoji2.text.b r2 = new androidx.emoji2.text.b     // Catch: java.lang.Throwable -> L43
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L43
            androidx.emoji2.text.c$g r0 = r1.f     // Catch: java.lang.Throwable -> L43
            r0.a(r2)     // Catch: java.lang.Throwable -> L43
            return
        L43:
            r0 = move-exception
            r1.d(r0)
        L47:
            return
        L48:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r3.f892a
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            throw r0
        L53:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading"
            r0.<init>(r1)
            throw r0
    }

    public final void d(java.lang.Throwable r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r4.f892a
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.lock()
            r1 = 2
            r4.c = r1     // Catch: java.lang.Throwable -> L31
            a.L1 r1 = r4.b     // Catch: java.lang.Throwable -> L31
            r0.addAll(r1)     // Catch: java.lang.Throwable -> L31
            a.L1 r1 = r4.b     // Catch: java.lang.Throwable -> L31
            r1.clear()     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r4.f892a
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            android.os.Handler r1 = r4.d
            androidx.emoji2.text.c$f r2 = new androidx.emoji2.text.c$f
            int r3 = r4.c
            r2.<init>(r0, r3, r5)
            r1.post(r2)
            return
        L31:
            r5 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r4.f892a
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            throw r5
    }

    public final java.lang.CharSequence e(java.lang.CharSequence r11, int r12, int r13) {
            r10 = this;
            int r0 = r10.b()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r0 == 0) goto L114
            if (r12 < 0) goto L10c
            if (r13 < 0) goto L104
            if (r12 > r13) goto L15
            r0 = r2
            goto L16
        L15:
            r0 = r1
        L16:
            java.lang.String r3 = "start should be <= than end"
            a.C0282n9.f(r3, r0)
            r0 = 0
            if (r11 != 0) goto L1f
            return r0
        L1f:
            int r3 = r11.length()
            if (r12 > r3) goto L27
            r3 = r2
            goto L28
        L27:
            r3 = r1
        L28:
            java.lang.String r4 = "start should be < than charSequence length"
            a.C0282n9.f(r4, r3)
            int r3 = r11.length()
            if (r13 > r3) goto L34
            goto L35
        L34:
            r2 = r1
        L35:
            java.lang.String r3 = "end should be < than charSequence length"
            a.C0282n9.f(r3, r2)
            int r2 = r11.length()
            if (r2 == 0) goto L42
            if (r12 != r13) goto L45
        L42:
            r4 = r11
            goto L103
        L45:
            androidx.emoji2.text.c$a r2 = r10.e
            a.Q5 r3 = r2.b
            r3.getClass()
            boolean r2 = r11 instanceof a.C0287ne
            if (r2 == 0) goto L56
            r4 = r11
            a.ne r4 = (a.C0287ne) r4
            r4.a()
        L56:
            java.lang.Class<a.R5> r4 = a.R5.class
            if (r2 != 0) goto L85
            boolean r5 = r11 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> L82
            if (r5 == 0) goto L5f
            goto L85
        L5f:
            boolean r5 = r11 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> L82
            if (r5 == 0) goto L8d
            r5 = r11
            android.text.Spanned r5 = (android.text.Spanned) r5     // Catch: java.lang.Throwable -> L82
            int r6 = r12 + (-1)
            int r7 = r13 + 1
            int r5 = r5.nextSpanTransition(r6, r7, r4)     // Catch: java.lang.Throwable -> L82
            if (r5 > r13) goto L8d
            a.Xf r0 = new a.Xf     // Catch: java.lang.Throwable -> L82
            r0.<init>()     // Catch: java.lang.Throwable -> L82
            r0.f344a = r1     // Catch: java.lang.Throwable -> L82
            android.text.SpannableString r5 = new android.text.SpannableString     // Catch: java.lang.Throwable -> L82
            r5.<init>(r11)     // Catch: java.lang.Throwable -> L82
            r0.b = r5     // Catch: java.lang.Throwable -> L82
            goto L8d
        L7f:
            r4 = r11
            goto Lfa
        L82:
            r0 = move-exception
            r12 = r0
            goto L7f
        L85:
            a.Xf r0 = new a.Xf     // Catch: java.lang.Throwable -> Lf4
            r5 = r11
            android.text.Spannable r5 = (android.text.Spannable) r5     // Catch: java.lang.Throwable -> Lf4
            r0.<init>(r5)     // Catch: java.lang.Throwable -> Lf4
        L8d:
            if (r0 == 0) goto Lbd
            android.text.Spannable r5 = r0.b     // Catch: java.lang.Throwable -> L82
            java.lang.Object[] r4 = r5.getSpans(r12, r13, r4)     // Catch: java.lang.Throwable -> L82
            a.R5[] r4 = (a.R5[]) r4     // Catch: java.lang.Throwable -> L82
            if (r4 == 0) goto Lbd
            int r5 = r4.length     // Catch: java.lang.Throwable -> L82
            if (r5 <= 0) goto Lbd
            int r5 = r4.length     // Catch: java.lang.Throwable -> L82
        L9d:
            if (r1 >= r5) goto Lbd
            r6 = r4[r1]     // Catch: java.lang.Throwable -> L82
            android.text.Spannable r7 = r0.b     // Catch: java.lang.Throwable -> L82
            int r7 = r7.getSpanStart(r6)     // Catch: java.lang.Throwable -> L82
            android.text.Spannable r8 = r0.b     // Catch: java.lang.Throwable -> L82
            int r8 = r8.getSpanEnd(r6)     // Catch: java.lang.Throwable -> L82
            if (r7 == r13) goto Lb2
            r0.removeSpan(r6)     // Catch: java.lang.Throwable -> L82
        Lb2:
            int r12 = java.lang.Math.min(r7, r12)     // Catch: java.lang.Throwable -> L82
            int r13 = java.lang.Math.max(r8, r13)     // Catch: java.lang.Throwable -> L82
            int r1 = r1 + 1
            goto L9d
        Lbd:
            r5 = r12
            r6 = r13
            if (r5 == r6) goto Lc7
            int r12 = r11.length()     // Catch: java.lang.Throwable -> Lf4
            if (r5 < r12) goto Lc9
        Lc7:
            r4 = r11
            goto Lf7
        Lc9:
            a.Q5$a r9 = new a.Q5$a     // Catch: java.lang.Throwable -> Lf4
            androidx.emoji2.text.c$d r12 = r3.f223a     // Catch: java.lang.Throwable -> Lf4
            r9.<init>(r0, r12)     // Catch: java.lang.Throwable -> Lf4
            r8 = 0
            r7 = 2147483647(0x7fffffff, float:NaN)
            r4 = r11
            java.lang.Object r11 = r3.c(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lf1
            a.Xf r11 = (a.Xf) r11     // Catch: java.lang.Throwable -> Lf1
            if (r11 == 0) goto Le8
            android.text.Spannable r11 = r11.b     // Catch: java.lang.Throwable -> Lf1
            if (r2 == 0) goto Le7
            r12 = r4
            a.ne r12 = (a.C0287ne) r12
            r12.b()
        Le7:
            return r11
        Le8:
            if (r2 == 0) goto L103
        Lea:
            r11 = r4
            a.ne r11 = (a.C0287ne) r11
            r11.b()
            return r4
        Lf1:
            r0 = move-exception
        Lf2:
            r12 = r0
            goto Lfa
        Lf4:
            r0 = move-exception
            r4 = r11
            goto Lf2
        Lf7:
            if (r2 == 0) goto L103
            goto Lea
        Lfa:
            if (r2 == 0) goto L102
            r11 = r4
            a.ne r11 = (a.C0287ne) r11
            r11.b()
        L102:
            throw r12
        L103:
            return r4
        L104:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "end cannot be negative"
            r11.<init>(r12)
            throw r11
        L10c:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "start cannot be negative"
            r11.<init>(r12)
            throw r11
        L114:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Not initialized yet"
            r11.<init>(r12)
            throw r11
    }

    public final void f(androidx.emoji2.text.c.e r5) {
            r4 = this;
            java.lang.String r0 = "initCallback cannot be null"
            a.C0282n9.h(r5, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r4.f892a
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            int r0 = r4.c     // Catch: java.lang.Throwable -> L1f
            r1 = 1
            if (r0 == r1) goto L21
            int r0 = r4.c     // Catch: java.lang.Throwable -> L1f
            r1 = 2
            if (r0 != r1) goto L19
            goto L21
        L19:
            a.L1 r0 = r4.b     // Catch: java.lang.Throwable -> L1f
            r0.add(r5)     // Catch: java.lang.Throwable -> L1f
            goto L36
        L1f:
            r5 = move-exception
            goto L40
        L21:
            android.os.Handler r0 = r4.d     // Catch: java.lang.Throwable -> L1f
            androidx.emoji2.text.c$f r1 = new androidx.emoji2.text.c$f     // Catch: java.lang.Throwable -> L1f
            int r2 = r4.c     // Catch: java.lang.Throwable -> L1f
            androidx.emoji2.text.c$e[] r5 = new androidx.emoji2.text.c.e[]{r5}     // Catch: java.lang.Throwable -> L1f
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch: java.lang.Throwable -> L1f
            r3 = 0
            r1.<init>(r5, r2, r3)     // Catch: java.lang.Throwable -> L1f
            r0.post(r1)     // Catch: java.lang.Throwable -> L1f
        L36:
            java.util.concurrent.locks.ReentrantReadWriteLock r5 = r4.f892a
            java.util.concurrent.locks.Lock r5 = r5.writeLock()
            r5.unlock()
            return
        L40:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r4.f892a
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            throw r5
    }
}
