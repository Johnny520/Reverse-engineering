package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ei {
    public static final java.lang.Object i = null;
    public static volatile defpackage.ei j;
    public final java.util.concurrent.locks.ReentrantReadWriteLock a;
    public final defpackage.q6 b;
    public volatile int c;
    public final android.os.Handler d;
    public final defpackage.zh e;
    public final defpackage.di f;
    public final int g;
    public final defpackage.mf h;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.ei.i = r0
            return
    }

    public ei(defpackage.wk r5) {
            r4 = this;
            r4.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r4.a = r0
            r1 = 3
            r4.c = r1
            java.lang.Object r1 = r5.b
            di r1 = (defpackage.di) r1
            r4.f = r1
            int r2 = r5.a
            r4.g = r2
            java.lang.Object r5 = r5.c
            mf r5 = (defpackage.mf) r5
            r4.h = r5
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r5.<init>(r3)
            r4.d = r5
            q6 r5 = new q6
            r5.<init>()
            r4.b = r5
            zh r5 = new zh
            r5.<init>(r4)
            r4.e = r5
            java.util.concurrent.locks.Lock r3 = r0.writeLock()
            r3.lock()
            if (r2 != 0) goto L4e
            r2 = 0
            r4.c = r2     // Catch: java.lang.Throwable -> L43
            goto L4e
        L43:
            r5 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r4.a
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            throw r5
        L4e:
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            int r0 = r4.b()
            if (r0 != 0) goto L68
            yh r0 = new yh     // Catch: java.lang.Throwable -> L64
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L64
            r1.e(r0)     // Catch: java.lang.Throwable -> L64
            return
        L64:
            r5 = move-exception
            r4.d(r5)
        L68:
            return
    }

    public static defpackage.ei a() {
            java.lang.Object r0 = defpackage.ei.i
            monitor-enter(r0)
            ei r1 = defpackage.ei.j     // Catch: java.lang.Throwable -> L10
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
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r2.a
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            int r0 = r2.c     // Catch: java.lang.Throwable -> L15
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r2.a
            java.util.concurrent.locks.Lock r1 = r1.readLock()
            r1.unlock()
            return r0
        L15:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r2.a
            java.util.concurrent.locks.Lock r1 = r1.readLock()
            r1.unlock()
            throw r0
    }

    public final void c() {
            r3 = this;
            int r0 = r3.g
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
            return
        L12:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r3.a
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            int r0 = r3.c     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto L29
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r3.a
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            return
        L29:
            r3.c = r1     // Catch: java.lang.Throwable -> L48
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r3.a
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            zh r0 = r3.e
            ei r1 = r0.a
            yh r2 = new yh     // Catch: java.lang.Throwable -> L43
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L43
            di r0 = r1.f     // Catch: java.lang.Throwable -> L43
            r0.e(r2)     // Catch: java.lang.Throwable -> L43
            return
        L43:
            r0 = move-exception
            r1.d(r0)
            return
        L48:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r3.a
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
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r4.a
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.lock()
            r1 = 2
            r4.c = r1     // Catch: java.lang.Throwable -> L31
            q6 r1 = r4.b     // Catch: java.lang.Throwable -> L31
            r0.addAll(r1)     // Catch: java.lang.Throwable -> L31
            q6 r1 = r4.b     // Catch: java.lang.Throwable -> L31
            r1.clear()     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r4.a
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            android.os.Handler r1 = r4.d
            e8 r2 = new e8
            int r3 = r4.c
            r2.<init>(r0, r3, r5)
            r1.post(r2)
            return
        L31:
            r5 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r4.a
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            throw r5
    }

    public final java.lang.CharSequence e(java.lang.CharSequence r12, int r13, int r14) {
            r11 = this;
            int r0 = r11.b()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r0 == 0) goto L18e
            if (r13 < 0) goto L186
            if (r14 < 0) goto L17e
            if (r13 > r14) goto L15
            r0 = r2
            goto L16
        L15:
            r0 = r1
        L16:
            java.lang.String r3 = "start should be <= than end"
            defpackage.zt.d(r3, r0)
            r0 = 0
            if (r12 != 0) goto L1f
            return r0
        L1f:
            int r3 = r12.length()
            if (r13 > r3) goto L27
            r3 = r2
            goto L28
        L27:
            r3 = r1
        L28:
            java.lang.String r4 = "start should be < than charSequence length"
            defpackage.zt.d(r4, r3)
            int r3 = r12.length()
            if (r14 > r3) goto L35
            r3 = r2
            goto L36
        L35:
            r3 = r1
        L36:
            java.lang.String r4 = "end should be < than charSequence length"
            defpackage.zt.d(r4, r3)
            int r3 = r12.length()
            if (r3 == 0) goto L17d
            if (r13 != r14) goto L45
            goto L17d
        L45:
            zh r3 = r11.e
            d4 r3 = r3.b
            r3.getClass()
            boolean r4 = r12 instanceof defpackage.d40
            if (r4 == 0) goto L56
            r5 = r12
            d40 r5 = (defpackage.d40) r5
            r5.a()
        L56:
            java.lang.Class<g80> r5 = defpackage.g80.class
            if (r4 != 0) goto L79
            boolean r6 = r12 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> L76
            if (r6 == 0) goto L5f
            goto L79
        L5f:
            boolean r6 = r12 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> L76
            if (r6 == 0) goto L81
            r6 = r12
            android.text.Spanned r6 = (android.text.Spanned) r6     // Catch: java.lang.Throwable -> L76
            int r7 = r13 + (-1)
            int r8 = r14 + 1
            int r6 = r6.nextSpanTransition(r7, r8, r5)     // Catch: java.lang.Throwable -> L76
            if (r6 > r14) goto L81
            s80 r0 = new s80     // Catch: java.lang.Throwable -> L76
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L76
            goto L81
        L76:
            r13 = move-exception
            goto L175
        L79:
            s80 r0 = new s80     // Catch: java.lang.Throwable -> L76
            r6 = r12
            android.text.Spannable r6 = (android.text.Spannable) r6     // Catch: java.lang.Throwable -> L76
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L76
        L81:
            if (r0 == 0) goto Lb2
            android.text.Spannable r6 = r0.b     // Catch: java.lang.Throwable -> L76
            java.lang.Object[] r5 = r6.getSpans(r13, r14, r5)     // Catch: java.lang.Throwable -> L76
            g80[] r5 = (defpackage.g80[]) r5     // Catch: java.lang.Throwable -> L76
            if (r5 == 0) goto Lb2
            int r6 = r5.length     // Catch: java.lang.Throwable -> L76
            if (r6 <= 0) goto Lb2
            int r6 = r5.length     // Catch: java.lang.Throwable -> L76
            r7 = r1
        L92:
            if (r7 >= r6) goto Lb2
            r8 = r5[r7]     // Catch: java.lang.Throwable -> L76
            android.text.Spannable r9 = r0.b     // Catch: java.lang.Throwable -> L76
            int r9 = r9.getSpanStart(r8)     // Catch: java.lang.Throwable -> L76
            android.text.Spannable r10 = r0.b     // Catch: java.lang.Throwable -> L76
            int r10 = r10.getSpanEnd(r8)     // Catch: java.lang.Throwable -> L76
            if (r9 == r14) goto La7
            r0.removeSpan(r8)     // Catch: java.lang.Throwable -> L76
        La7:
            int r13 = java.lang.Math.min(r9, r13)     // Catch: java.lang.Throwable -> L76
            int r14 = java.lang.Math.max(r10, r14)     // Catch: java.lang.Throwable -> L76
            int r7 = r7 + 1
            goto L92
        Lb2:
            if (r13 == r14) goto L172
            int r5 = r12.length()     // Catch: java.lang.Throwable -> L76
            if (r13 < r5) goto Lbc
            goto L172
        Lbc:
            oi r5 = new oi     // Catch: java.lang.Throwable -> L76
            java.lang.Object r6 = r3.b     // Catch: java.lang.Throwable -> L76
            a8 r6 = (defpackage.a8) r6     // Catch: java.lang.Throwable -> L76
            java.lang.Object r6 = r6.c     // Catch: java.lang.Throwable -> L76
            xv r6 = (defpackage.xv) r6     // Catch: java.lang.Throwable -> L76
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L76
            int r6 = java.lang.Character.codePointAt(r12, r13)     // Catch: java.lang.Throwable -> L76
            r7 = r6
            r6 = r1
            r1 = r0
        Ld0:
            r0 = r13
        Ld1:
            r8 = 33
            r9 = 2
            r10 = 2147483647(0x7fffffff, float:NaN)
            if (r13 >= r14) goto L12a
            if (r6 >= r10) goto L12a
            int r10 = r5.a(r7)     // Catch: java.lang.Throwable -> L76
            if (r10 == r2) goto L118
            if (r10 == r9) goto L10c
            r9 = 3
            if (r10 == r9) goto Le7
            goto Ld1
        Le7:
            xv r9 = r5.d     // Catch: java.lang.Throwable -> L76
            ni r9 = r9.b     // Catch: java.lang.Throwable -> L76
            boolean r9 = r3.w(r12, r0, r13, r9)     // Catch: java.lang.Throwable -> L76
            if (r9 != 0) goto Ld0
            if (r1 != 0) goto Lfd
            s80 r1 = new s80     // Catch: java.lang.Throwable -> L76
            android.text.SpannableString r9 = new android.text.SpannableString     // Catch: java.lang.Throwable -> L76
            r9.<init>(r12)     // Catch: java.lang.Throwable -> L76
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L76
        Lfd:
            xv r9 = r5.d     // Catch: java.lang.Throwable -> L76
            ni r9 = r9.b     // Catch: java.lang.Throwable -> L76
            g80 r10 = new g80     // Catch: java.lang.Throwable -> L76
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L76
            r1.setSpan(r10, r0, r13, r8)     // Catch: java.lang.Throwable -> L76
            int r6 = r6 + 1
            goto Ld0
        L10c:
            int r8 = java.lang.Character.charCount(r7)     // Catch: java.lang.Throwable -> L76
            int r13 = r13 + r8
            if (r13 >= r14) goto Ld1
            int r7 = java.lang.Character.codePointAt(r12, r13)     // Catch: java.lang.Throwable -> L76
            goto Ld1
        L118:
            int r13 = java.lang.Character.codePointAt(r12, r0)     // Catch: java.lang.Throwable -> L76
            int r13 = java.lang.Character.charCount(r13)     // Catch: java.lang.Throwable -> L76
            int r0 = r0 + r13
            if (r0 >= r14) goto L128
            int r13 = java.lang.Character.codePointAt(r12, r0)     // Catch: java.lang.Throwable -> L76
            r7 = r13
        L128:
            r13 = r0
            goto Ld1
        L12a:
            int r14 = r5.a     // Catch: java.lang.Throwable -> L76
            if (r14 != r9) goto L15d
            xv r14 = r5.c     // Catch: java.lang.Throwable -> L76
            ni r14 = r14.b     // Catch: java.lang.Throwable -> L76
            if (r14 == 0) goto L15d
            int r14 = r5.f     // Catch: java.lang.Throwable -> L76
            if (r14 > r2) goto L13e
            boolean r14 = r5.c()     // Catch: java.lang.Throwable -> L76
            if (r14 == 0) goto L15d
        L13e:
            if (r6 >= r10) goto L15d
            xv r14 = r5.c     // Catch: java.lang.Throwable -> L76
            ni r14 = r14.b     // Catch: java.lang.Throwable -> L76
            boolean r14 = r3.w(r12, r0, r13, r14)     // Catch: java.lang.Throwable -> L76
            if (r14 != 0) goto L15d
            if (r1 != 0) goto L151
            s80 r1 = new s80     // Catch: java.lang.Throwable -> L76
            r1.<init>(r12)     // Catch: java.lang.Throwable -> L76
        L151:
            xv r14 = r5.c     // Catch: java.lang.Throwable -> L76
            ni r14 = r14.b     // Catch: java.lang.Throwable -> L76
            g80 r2 = new g80     // Catch: java.lang.Throwable -> L76
            r2.<init>(r14)     // Catch: java.lang.Throwable -> L76
            r1.setSpan(r2, r0, r13, r8)     // Catch: java.lang.Throwable -> L76
        L15d:
            if (r1 == 0) goto L169
            android.text.Spannable r13 = r1.b     // Catch: java.lang.Throwable -> L76
            if (r4 == 0) goto L168
            d40 r12 = (defpackage.d40) r12
            r12.b()
        L168:
            return r13
        L169:
            if (r4 == 0) goto L17d
        L16b:
            r13 = r12
            d40 r13 = (defpackage.d40) r13
            r13.b()
            return r12
        L172:
            if (r4 == 0) goto L17d
            goto L16b
        L175:
            if (r4 == 0) goto L17c
            d40 r12 = (defpackage.d40) r12
            r12.b()
        L17c:
            throw r13
        L17d:
            return r12
        L17e:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "end cannot be negative"
            r12.<init>(r13)
            throw r12
        L186:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "start cannot be negative"
            r12.<init>(r13)
            throw r12
        L18e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Not initialized yet"
            r12.<init>(r13)
            throw r12
    }

    public final void f(defpackage.ci r5) {
            r4 = this;
            java.lang.String r0 = "initCallback cannot be null"
            defpackage.zt.f(r0, r5)
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r4.a
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
            q6 r0 = r4.b     // Catch: java.lang.Throwable -> L1f
            r0.add(r5)     // Catch: java.lang.Throwable -> L1f
            goto L36
        L1f:
            r5 = move-exception
            goto L40
        L21:
            android.os.Handler r0 = r4.d     // Catch: java.lang.Throwable -> L1f
            e8 r1 = new e8     // Catch: java.lang.Throwable -> L1f
            int r2 = r4.c     // Catch: java.lang.Throwable -> L1f
            ci[] r5 = new defpackage.ci[]{r5}     // Catch: java.lang.Throwable -> L1f
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch: java.lang.Throwable -> L1f
            r3 = 0
            r1.<init>(r5, r2, r3)     // Catch: java.lang.Throwable -> L1f
            r0.post(r1)     // Catch: java.lang.Throwable -> L1f
        L36:
            java.util.concurrent.locks.ReentrantReadWriteLock r5 = r4.a
            java.util.concurrent.locks.Lock r5 = r5.writeLock()
            r5.unlock()
            return
        L40:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r4.a
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            throw r5
    }
}
