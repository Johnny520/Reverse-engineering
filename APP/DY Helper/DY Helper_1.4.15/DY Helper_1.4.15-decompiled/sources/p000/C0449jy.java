package p000;

/* JADX INFO: renamed from: jy */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0449jy {

    /* JADX INFO: renamed from: κ */
    public static final java.lang.Object f5648 = null;

    /* JADX INFO: renamed from: λ */
    public static volatile p000.C0449jy f5649;

    /* JADX INFO: renamed from: α */
    public final java.util.concurrent.locks.ReentrantReadWriteLock f5650;

    /* JADX INFO: renamed from: β */
    public final p000.C0202d7 f5651;

    /* JADX INFO: renamed from: γ */
    public volatile int f5652;

    /* JADX INFO: renamed from: δ */
    public final android.os.Handler f5653;

    /* JADX INFO: renamed from: ε */
    public final p000.C0302fy f5654;

    /* JADX INFO: renamed from: ζ */
    public final p000.InterfaceC0411iy f5655;

    /* JADX INFO: renamed from: η */
    public final p000.C0381i2 f5656;

    /* JADX INFO: renamed from: θ */
    public final int f5657;

    /* JADX INFO: renamed from: ι */
    public final p000.C0185cr f5658;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.C0449jy.f5648 = r0
            return
    }

    public C0449jy(p000.p50 r6) {
            r5 = this;
            r5.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r5.f5650 = r0
            r1 = 3
            r5.f5652 = r1
            iy r1 = r6.f8424
            r5.f5655 = r1
            int r2 = r6.f8425
            r5.f5657 = r2
            cr r6 = r6.f8426
            r5.f5658 = r6
            android.os.Handler r6 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r6.<init>(r3)
            r5.f5653 = r6
            d7 r6 = new d7
            r3 = 0
            r6.<init>(r3)
            r5.f5651 = r6
            i2 r6 = new i2
            r4 = 20
            r6.<init>(r4)
            r5.f5656 = r6
            fy r6 = new fy
            r6.<init>(r5)
            r5.f5654 = r6
            java.util.concurrent.locks.Lock r4 = r0.writeLock()
            r4.lock()
            if (r2 != 0) goto L53
            r5.f5652 = r3     // Catch: java.lang.Throwable -> L48
            goto L53
        L48:
            r6 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r5 = r5.f5650
            java.util.concurrent.locks.Lock r5 = r5.writeLock()
            r5.unlock()
            throw r6
        L53:
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            int r0 = r5.m3073()
            if (r0 != 0) goto L6d
            ey r0 = new ey     // Catch: java.lang.Throwable -> L69
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L69
            r1.mo2828(r0)     // Catch: java.lang.Throwable -> L69
            return
        L69:
            r6 = move-exception
            r5.m3075(r6)
        L6d:
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.C0449jy m3071() {
            java.lang.Object r0 = p000.C0449jy.f5648
            monitor-enter(r0)
            jy r1 = p000.C0449jy.f5649     // Catch: java.lang.Throwable -> L10
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

    /* JADX INFO: renamed from: γ */
    public static boolean m3072() {
            jy r0 = p000.C0449jy.f5649
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final int m3073() {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r1.f5650
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            int r0 = r1.f5652     // Catch: java.lang.Throwable -> L15
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r1.f5650
            java.util.concurrent.locks.Lock r1 = r1.readLock()
            r1.unlock()
            return r0
        L15:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r1.f5650
            java.util.concurrent.locks.Lock r1 = r1.readLock()
            r1.unlock()
            throw r0
    }

    /* JADX INFO: renamed from: δ */
    public final void m3074() {
            r3 = this;
            int r0 = r3.f5657
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            if (r0 == 0) goto L53
            int r0 = r3.m3073()
            if (r0 != r2) goto L12
            return
        L12:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r3.f5650
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            int r0 = r3.f5652     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto L29
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r3.f5650
            java.util.concurrent.locks.Lock r3 = r3.writeLock()
            r3.unlock()
            return
        L29:
            r3.f5652 = r1     // Catch: java.lang.Throwable -> L48
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r3.f5650
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            fy r3 = r3.f5654
            jy r0 = r3.f4165
            ey r1 = new ey     // Catch: java.lang.Throwable -> L43
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L43
            iy r3 = r0.f5655     // Catch: java.lang.Throwable -> L43
            r3.mo2828(r1)     // Catch: java.lang.Throwable -> L43
            return
        L43:
            r3 = move-exception
            r0.m3075(r3)
            return
        L48:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r3.f5650
            java.util.concurrent.locks.Lock r3 = r3.writeLock()
            r3.unlock()
            throw r0
        L53:
            java.lang.String r3 = "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading"
            p000.C1080.m7279(r3)
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m3075(java.lang.Throwable r4) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r3.f5650
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.lock()
            r1 = 2
            r3.f5652 = r1     // Catch: java.lang.Throwable -> L31
            d7 r1 = r3.f5651     // Catch: java.lang.Throwable -> L31
            r0.addAll(r1)     // Catch: java.lang.Throwable -> L31
            d7 r1 = r3.f5651     // Catch: java.lang.Throwable -> L31
            r1.clear()     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r3.f5650
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            android.os.Handler r1 = r3.f5653
            hy r2 = new hy
            int r3 = r3.f5652
            r2.<init>(r0, r3, r4)
            r1.post(r2)
            return
        L31:
            r4 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r3.f5650
            java.util.concurrent.locks.Lock r3 = r3.writeLock()
            r3.unlock()
            throw r4
    }

    /* JADX INFO: renamed from: ζ */
    public final java.lang.CharSequence m3076(int r12, int r13, int r14, java.lang.CharSequence r15) {
            r11 = this;
            int r0 = r11.m3073()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r0 == 0) goto L124
            if (r12 < 0) goto L11e
            if (r13 < 0) goto L118
            if (r12 > r13) goto L15
            r0 = r2
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 == 0) goto L112
            r0 = 0
            if (r15 != 0) goto L1c
            return r0
        L1c:
            int r3 = r15.length()
            if (r12 > r3) goto L24
            r3 = r2
            goto L25
        L24:
            r3 = r1
        L25:
            if (r3 == 0) goto L10c
            int r3 = r15.length()
            if (r13 > r3) goto L2f
            r3 = r2
            goto L30
        L2f:
            r3 = r1
        L30:
            if (r3 == 0) goto L105
            int r3 = r15.length()
            if (r3 == 0) goto L3a
            if (r12 != r13) goto L3d
        L3a:
            r5 = r15
            goto L104
        L3d:
            if (r14 == r2) goto L41
            r9 = r1
            goto L42
        L41:
            r9 = r2
        L42:
            fy r11 = r11.f5654
            m6 r4 = r11.f4166
            r4.getClass()
            boolean r11 = r15 instanceof p000.xx1
            if (r11 == 0) goto L53
            r14 = r15
            xx1 r14 = (p000.xx1) r14
            r14.m6794()
        L53:
            java.lang.Class<l62> r14 = p000.l62.class
            if (r11 != 0) goto L82
            boolean r2 = r15 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> L7f
            if (r2 == 0) goto L5c
            goto L82
        L5c:
            boolean r2 = r15 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> L7f
            if (r2 == 0) goto L8a
            r2 = r15
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch: java.lang.Throwable -> L7f
            int r3 = r12 + (-1)
            int r5 = r13 + 1
            int r2 = r2.nextSpanTransition(r3, r5, r14)     // Catch: java.lang.Throwable -> L7f
            if (r2 > r13) goto L8a
            u62 r0 = new u62     // Catch: java.lang.Throwable -> L7f
            r0.<init>()     // Catch: java.lang.Throwable -> L7f
            r0.f10614 = r1     // Catch: java.lang.Throwable -> L7f
            android.text.SpannableString r2 = new android.text.SpannableString     // Catch: java.lang.Throwable -> L7f
            r2.<init>(r15)     // Catch: java.lang.Throwable -> L7f
            r0.f10615 = r2     // Catch: java.lang.Throwable -> L7f
            goto L8a
        L7c:
            r5 = r15
            goto Lfb
        L7f:
            r0 = move-exception
            r12 = r0
            goto L7c
        L82:
            u62 r0 = new u62     // Catch: java.lang.Throwable -> Lf5
            r2 = r15
            android.text.Spannable r2 = (android.text.Spannable) r2     // Catch: java.lang.Throwable -> Lf5
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf5
        L8a:
            if (r0 == 0) goto Lba
            android.text.Spannable r2 = r0.f10615     // Catch: java.lang.Throwable -> L7f
            java.lang.Object[] r14 = r2.getSpans(r12, r13, r14)     // Catch: java.lang.Throwable -> L7f
            l62[] r14 = (p000.l62[]) r14     // Catch: java.lang.Throwable -> L7f
            if (r14 == 0) goto Lba
            int r2 = r14.length     // Catch: java.lang.Throwable -> L7f
            if (r2 <= 0) goto Lba
            int r2 = r14.length     // Catch: java.lang.Throwable -> L7f
        L9a:
            if (r1 >= r2) goto Lba
            r3 = r14[r1]     // Catch: java.lang.Throwable -> L7f
            android.text.Spannable r5 = r0.f10615     // Catch: java.lang.Throwable -> L7f
            int r5 = r5.getSpanStart(r3)     // Catch: java.lang.Throwable -> L7f
            android.text.Spannable r6 = r0.f10615     // Catch: java.lang.Throwable -> L7f
            int r6 = r6.getSpanEnd(r3)     // Catch: java.lang.Throwable -> L7f
            if (r5 == r13) goto Laf
            r0.removeSpan(r3)     // Catch: java.lang.Throwable -> L7f
        Laf:
            int r12 = java.lang.Math.min(r5, r12)     // Catch: java.lang.Throwable -> L7f
            int r13 = java.lang.Math.max(r6, r13)     // Catch: java.lang.Throwable -> L7f
            int r1 = r1 + 1
            goto L9a
        Lba:
            r6 = r12
            r7 = r13
            if (r6 == r7) goto Lc4
            int r12 = r15.length()     // Catch: java.lang.Throwable -> Lf5
            if (r6 < r12) goto Lc6
        Lc4:
            r5 = r15
            goto Lf8
        Lc6:
            n5 r10 = new n5     // Catch: java.lang.Throwable -> Lf5
            java.lang.Object r12 = r4.f6967     // Catch: java.lang.Throwable -> Lf5
            i2 r12 = (p000.C0381i2) r12     // Catch: java.lang.Throwable -> Lf5
            r13 = 10
            r14 = 0
            r10.<init>(r13, r0, r12, r14)     // Catch: java.lang.Throwable -> Lf5
            r8 = 2147483647(0x7fffffff, float:NaN)
            r5 = r15
            java.lang.Object r12 = r4.m3764(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Le9
            u62 r12 = (p000.u62) r12     // Catch: java.lang.Throwable -> Le9
            if (r12 == 0) goto Lec
            android.text.Spannable r12 = r12.f10615     // Catch: java.lang.Throwable -> Le9
            if (r11 == 0) goto Le8
            r15 = r5
            xx1 r15 = (p000.xx1) r15
            r15.m6795()
        Le8:
            return r12
        Le9:
            r0 = move-exception
        Lea:
            r12 = r0
            goto Lfb
        Lec:
            if (r11 == 0) goto L104
        Lee:
            r15 = r5
            xx1 r15 = (p000.xx1) r15
            r15.m6795()
            return r5
        Lf5:
            r0 = move-exception
            r5 = r15
            goto Lea
        Lf8:
            if (r11 == 0) goto L104
            goto Lee
        Lfb:
            if (r11 == 0) goto L103
            r15 = r5
            xx1 r15 = (p000.xx1) r15
            r15.m6795()
        L103:
            throw r12
        L104:
            return r5
        L105:
            java.lang.String r11 = "end should be < than charSequence length"
            p000.C1080.m7275(r11)
        L10a:
            r11 = 0
            return r11
        L10c:
            java.lang.String r11 = "start should be < than charSequence length"
            p000.C1080.m7275(r11)
            goto L10a
        L112:
            java.lang.String r11 = "start should be <= than end"
            p000.C1080.m7275(r11)
            goto L10a
        L118:
            java.lang.String r11 = "end cannot be negative"
            p000.C1080.m7275(r11)
            goto L10a
        L11e:
            java.lang.String r11 = "start cannot be negative"
            p000.C1080.m7275(r11)
            goto L10a
        L124:
            java.lang.String r11 = "Not initialized yet"
            p000.C1080.m7279(r11)
            goto L10a
    }

    /* JADX INFO: renamed from: η */
    public final void m3077(p000.AbstractC0339gy r5) {
            r4 = this;
            java.lang.String r0 = "initCallback cannot be null"
            p000.p91.m4418(r5, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r4.f5650
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            int r0 = r4.f5652     // Catch: java.lang.Throwable -> L1f
            r1 = 1
            if (r0 == r1) goto L21
            int r0 = r4.f5652     // Catch: java.lang.Throwable -> L1f
            r1 = 2
            if (r0 != r1) goto L19
            goto L21
        L19:
            d7 r0 = r4.f5651     // Catch: java.lang.Throwable -> L1f
            r0.add(r5)     // Catch: java.lang.Throwable -> L1f
            goto L36
        L1f:
            r5 = move-exception
            goto L40
        L21:
            android.os.Handler r0 = r4.f5653     // Catch: java.lang.Throwable -> L1f
            hy r1 = new hy     // Catch: java.lang.Throwable -> L1f
            int r2 = r4.f5652     // Catch: java.lang.Throwable -> L1f
            gy[] r5 = new p000.AbstractC0339gy[]{r5}     // Catch: java.lang.Throwable -> L1f
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch: java.lang.Throwable -> L1f
            r3 = 0
            r1.<init>(r5, r2, r3)     // Catch: java.lang.Throwable -> L1f
            r0.post(r1)     // Catch: java.lang.Throwable -> L1f
        L36:
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r4.f5650
            java.util.concurrent.locks.Lock r4 = r4.writeLock()
            r4.unlock()
            return
        L40:
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r4.f5650
            java.util.concurrent.locks.Lock r4 = r4.writeLock()
            r4.unlock()
            throw r5
    }
}
