package xhss;

/* JADX INFO: renamed from: xhss.ᛵᲁᛱᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0514 {

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public static final java.lang.Object f1868 = null;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public static volatile xhss.C0514 f1869;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0339 f1870;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public volatile int f1871;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final xhss.C0220 f1872;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.util.concurrent.locks.ReentrantReadWriteLock f1873;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final xhss.C0586 f1874;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final int f1875;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final xhss.C0263 f1876;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final android.os.Handler f1877;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final xhss.InterfaceC0285 f1878;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            xhss.C0514.f1868 = r0
            return
    }

    public C0514(xhss.C0774 r5) {
            r4 = this;
            r4.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r4.f1873 = r0
            r1 = 3
            r4.f1871 = r1
            xhss.ᛳᛶᛸᛷ r1 = r5.f2555
            r4.f1878 = r1
            int r2 = r5.f2553
            r4.f1875 = r2
            xhss.ᛶᛸᲀᲁ r5 = r5.f2554
            r4.f1874 = r5
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r5.<init>(r3)
            r4.f1877 = r5
            xhss.ᛴᛲᛴᲇ r5 = new xhss.ᛴᛲᛴᲇ
            r5.<init>()
            int[] r3 = xhss.AbstractC0473.f1705
            r5.f1262 = r3
            java.lang.Object[] r3 = xhss.AbstractC0473.f1702
            r5.f1263 = r3
            r4.f1870 = r5
            xhss.ᛳᛴᲀᲁ r5 = new xhss.ᛳᛴᲀᲁ
            r3 = 23
            r5.<init>(r3)
            r4.f1876 = r5
            xhss.ᛲᲈᛱᛳ r5 = new xhss.ᛲᲈᛱᛳ
            r5.<init>(r4)
            r4.f1872 = r5
            java.util.concurrent.locks.Lock r3 = r0.writeLock()
            r3.lock()
            if (r2 != 0) goto L5b
            r2 = 0
            r4.f1871 = r2     // Catch: java.lang.Throwable -> L50
            goto L5b
        L50:
            r5 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r4.f1873
            java.util.concurrent.locks.Lock r4 = r4.writeLock()
            r4.unlock()
            throw r5
        L5b:
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            int r0 = r4.m922()
            if (r0 != 0) goto L75
            xhss.ᛴᛲᲀᛶ r0 = new xhss.ᛴᛲᲀᛶ     // Catch: java.lang.Throwable -> L71
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L71
            r1.mo372(r0)     // Catch: java.lang.Throwable -> L71
            return
        L71:
            r5 = move-exception
            r4.m925(r5)
        L75:
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static xhss.C0514 m921() {
            java.lang.Object r0 = xhss.C0514.f1868
            monitor-enter(r0)
            xhss.ᛵᲁᛱᲁ r1 = xhss.C0514.f1869     // Catch: java.lang.Throwable -> L10
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

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final int m922() {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r1.f1873
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            int r0 = r1.f1871     // Catch: java.lang.Throwable -> L15
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r1.f1873
            java.util.concurrent.locks.Lock r1 = r1.readLock()
            r1.unlock()
            return r0
        L15:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r1.f1873
            java.util.concurrent.locks.Lock r1 = r1.readLock()
            r1.unlock()
            throw r0
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final void m923() {
            r3 = this;
            int r0 = r3.f1875
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            if (r0 == 0) goto L55
            int r0 = r3.m922()
            if (r0 != r2) goto L12
            return
        L12:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r3.f1873
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            int r0 = r3.f1871     // Catch: java.lang.Throwable -> L4a
            if (r0 != 0) goto L29
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r3.f1873
            java.util.concurrent.locks.Lock r3 = r3.writeLock()
            r3.unlock()
            return
        L29:
            r3.f1871 = r1     // Catch: java.lang.Throwable -> L4a
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r3.f1873
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            xhss.ᛲᲈᛱᛳ r3 = r3.f1872
            java.lang.Object r0 = r3.f807
            xhss.ᛵᲁᛱᲁ r0 = (xhss.C0514) r0
            xhss.ᛴᛲᲀᛶ r1 = new xhss.ᛴᛲᲀᛶ     // Catch: java.lang.Throwable -> L45
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L45
            xhss.ᛳᛶᛸᛷ r3 = r0.f1878     // Catch: java.lang.Throwable -> L45
            r3.mo372(r1)     // Catch: java.lang.Throwable -> L45
            return
        L45:
            r3 = move-exception
            r0.m925(r3)
            return
        L4a:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r3.f1873
            java.util.concurrent.locks.Lock r3 = r3.writeLock()
            r3.unlock()
            throw r0
        L55:
            java.lang.String r3 = "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading"
            xhss.C0532.m950(r3)
            return
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final java.lang.CharSequence m924(java.lang.CharSequence r12, int r13, int r14) {
            r11 = this;
            int r0 = r11.m922()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r1
        Lb:
            r3 = 0
            if (r0 == 0) goto L124
            if (r13 < 0) goto L11e
            if (r14 < 0) goto L118
            if (r13 > r14) goto L16
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            if (r0 == 0) goto L112
            if (r12 != 0) goto L1c
            return r3
        L1c:
            int r0 = r12.length()
            if (r13 > r0) goto L24
            r0 = r2
            goto L25
        L24:
            r0 = r1
        L25:
            if (r0 == 0) goto L10c
            int r0 = r12.length()
            if (r14 > r0) goto L2e
            goto L2f
        L2e:
            r2 = r1
        L2f:
            if (r2 == 0) goto L106
            int r0 = r12.length()
            if (r0 == 0) goto L39
            if (r13 != r14) goto L3c
        L39:
            r5 = r12
            goto L105
        L3c:
            xhss.ᛲᲈᛱᛳ r11 = r11.f1872
            java.lang.Object r11 = r11.f805
            r4 = r11
            xhss.ᛷᛱᛳᲁ r4 = (xhss.C0623) r4
            r4.getClass()
            boolean r11 = r12 instanceof xhss.C0302
            if (r11 == 0) goto L50
            r0 = r12
            xhss.ᛳᛸᛷᛸ r0 = (xhss.C0302) r0
            r0.m629()
        L50:
            java.lang.Class<xhss.ᛴᛸᛵᛵ> r0 = xhss.C0396.class
            if (r11 != 0) goto L7f
            boolean r2 = r12 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> L7c
            if (r2 == 0) goto L59
            goto L7f
        L59:
            boolean r2 = r12 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> L7c
            if (r2 == 0) goto L87
            r2 = r12
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch: java.lang.Throwable -> L7c
            int r5 = r13 + (-1)
            int r6 = r14 + 1
            int r2 = r2.nextSpanTransition(r5, r6, r0)     // Catch: java.lang.Throwable -> L7c
            if (r2 > r14) goto L87
            xhss.ᛴᲈᛱᛲ r3 = new xhss.ᛴᲈᛱᛲ     // Catch: java.lang.Throwable -> L7c
            r3.<init>()     // Catch: java.lang.Throwable -> L7c
            r3.f1497 = r1     // Catch: java.lang.Throwable -> L7c
            android.text.SpannableString r2 = new android.text.SpannableString     // Catch: java.lang.Throwable -> L7c
            r2.<init>(r12)     // Catch: java.lang.Throwable -> L7c
            r3.f1498 = r2     // Catch: java.lang.Throwable -> L7c
            goto L87
        L79:
            r5 = r12
            goto Lfc
        L7c:
            r0 = move-exception
            r13 = r0
            goto L79
        L7f:
            xhss.ᛴᲈᛱᛲ r3 = new xhss.ᛴᲈᛱᛲ     // Catch: java.lang.Throwable -> Lf1
            r2 = r12
            android.text.Spannable r2 = (android.text.Spannable) r2     // Catch: java.lang.Throwable -> Lf1
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Lf1
        L87:
            if (r3 == 0) goto Lb7
            android.text.Spannable r2 = r3.f1498     // Catch: java.lang.Throwable -> L7c
            java.lang.Object[] r0 = r2.getSpans(r13, r14, r0)     // Catch: java.lang.Throwable -> L7c
            xhss.ᛴᛸᛵᛵ[] r0 = (xhss.C0396[]) r0     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto Lb7
            int r2 = r0.length     // Catch: java.lang.Throwable -> L7c
            if (r2 <= 0) goto Lb7
            int r2 = r0.length     // Catch: java.lang.Throwable -> L7c
        L97:
            if (r1 >= r2) goto Lb7
            r5 = r0[r1]     // Catch: java.lang.Throwable -> L7c
            android.text.Spannable r6 = r3.f1498     // Catch: java.lang.Throwable -> L7c
            int r6 = r6.getSpanStart(r5)     // Catch: java.lang.Throwable -> L7c
            android.text.Spannable r7 = r3.f1498     // Catch: java.lang.Throwable -> L7c
            int r7 = r7.getSpanEnd(r5)     // Catch: java.lang.Throwable -> L7c
            if (r6 == r14) goto Lac
            r3.removeSpan(r5)     // Catch: java.lang.Throwable -> L7c
        Lac:
            int r13 = java.lang.Math.min(r6, r13)     // Catch: java.lang.Throwable -> L7c
            int r14 = java.lang.Math.max(r7, r14)     // Catch: java.lang.Throwable -> L7c
            int r1 = r1 + 1
            goto L97
        Lb7:
            r6 = r13
            r7 = r14
            if (r6 == r7) goto Lc1
            int r13 = r12.length()     // Catch: java.lang.Throwable -> Lf1
            if (r6 < r13) goto Lc3
        Lc1:
            r5 = r12
            goto Lf9
        Lc3:
            xhss.ᛳᛱᛲᲀ r10 = new xhss.ᛳᛱᛲᲀ     // Catch: java.lang.Throwable -> Lf1
            java.lang.Object r13 = r4.f2151     // Catch: java.lang.Throwable -> Lf4
            xhss.ᛳᛴᲀᲁ r13 = (xhss.C0263) r13     // Catch: java.lang.Throwable -> Lf4
            r14 = 7
            r10.<init>(r14, r3, r13)     // Catch: java.lang.Throwable -> Lf1
            r9 = 0
            r8 = 2147483647(0x7fffffff, float:NaN)
            r5 = r12
            java.lang.Object r12 = r4.m1095(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Le5
            xhss.ᛴᲈᛱᛲ r12 = (xhss.C0423) r12     // Catch: java.lang.Throwable -> Le5
            if (r12 == 0) goto Le8
            android.text.Spannable r12 = r12.f1498     // Catch: java.lang.Throwable -> Le5
            if (r11 == 0) goto Le4
            r11 = r5
            xhss.ᛳᛸᛷᛸ r11 = (xhss.C0302) r11
            r11.m626()
        Le4:
            return r12
        Le5:
            r0 = move-exception
        Le6:
            r13 = r0
            goto Lfc
        Le8:
            if (r11 == 0) goto L105
        Lea:
            r12 = r5
            xhss.ᛳᛸᛷᛸ r12 = (xhss.C0302) r12
            r12.m626()
            return r5
        Lf1:
            r0 = move-exception
            r5 = r12
            goto Le6
        Lf4:
            r0 = move-exception
            r5 = r12
            r12 = r0
            r13 = r12
            goto Lfc
        Lf9:
            if (r11 == 0) goto L105
            goto Lea
        Lfc:
            if (r11 == 0) goto L104
            r12 = r5
            xhss.ᛳᛸᛷᛸ r12 = (xhss.C0302) r12
            r12.m626()
        L104:
            throw r13
        L105:
            return r5
        L106:
            java.lang.String r11 = "end should be < than charSequence length"
            xhss.C0532.m959(r11)
            return r3
        L10c:
            java.lang.String r11 = "start should be < than charSequence length"
            xhss.C0532.m959(r11)
            return r3
        L112:
            java.lang.String r11 = "start should be <= than end"
            xhss.C0532.m959(r11)
            return r3
        L118:
            java.lang.String r11 = "end cannot be negative"
            xhss.C0532.m959(r11)
            return r3
        L11e:
            java.lang.String r11 = "start cannot be negative"
            xhss.C0532.m959(r11)
            return r3
        L124:
            java.lang.String r11 = "Not initialized yet"
            xhss.C0532.m950(r11)
            return r3
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final void m925(java.lang.Throwable r4) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r3.f1873
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.lock()
            r1 = 2
            r3.f1871 = r1     // Catch: java.lang.Throwable -> L31
            xhss.ᛴᛲᛴᲇ r1 = r3.f1870     // Catch: java.lang.Throwable -> L31
            r0.addAll(r1)     // Catch: java.lang.Throwable -> L31
            xhss.ᛴᛲᛴᲇ r1 = r3.f1870     // Catch: java.lang.Throwable -> L31
            r1.clear()     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r3.f1873
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            android.os.Handler r1 = r3.f1877
            xhss.ᛵᛶᛲᛳ r2 = new xhss.ᛵᛶᛲᛳ
            int r3 = r3.f1871
            r2.<init>(r0, r3, r4)
            r1.post(r2)
            return
        L31:
            r4 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r3.f1873
            java.util.concurrent.locks.Lock r3 = r3.writeLock()
            r3.unlock()
            throw r4
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final void m926(xhss.AbstractC0231 r5) {
            r4 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r4.f1873
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            int r0 = r4.f1871     // Catch: java.lang.Throwable -> L1a
            r1 = 1
            if (r0 == r1) goto L1c
            int r0 = r4.f1871     // Catch: java.lang.Throwable -> L1a
            r1 = 2
            if (r0 != r1) goto L14
            goto L1c
        L14:
            xhss.ᛴᛲᛴᲇ r0 = r4.f1870     // Catch: java.lang.Throwable -> L1a
            r0.add(r5)     // Catch: java.lang.Throwable -> L1a
            goto L31
        L1a:
            r5 = move-exception
            goto L3b
        L1c:
            android.os.Handler r0 = r4.f1877     // Catch: java.lang.Throwable -> L1a
            xhss.ᛵᛶᛲᛳ r1 = new xhss.ᛵᛶᛲᛳ     // Catch: java.lang.Throwable -> L1a
            int r2 = r4.f1871     // Catch: java.lang.Throwable -> L1a
            xhss.ᛳᛱᛲᲈ[] r5 = new xhss.AbstractC0231[]{r5}     // Catch: java.lang.Throwable -> L1a
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch: java.lang.Throwable -> L1a
            r3 = 0
            r1.<init>(r5, r2, r3)     // Catch: java.lang.Throwable -> L1a
            r0.post(r1)     // Catch: java.lang.Throwable -> L1a
        L31:
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r4.f1873
            java.util.concurrent.locks.Lock r4 = r4.writeLock()
            r4.unlock()
            return
        L3b:
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r4.f1873
            java.util.concurrent.locks.Lock r4 = r4.writeLock()
            r4.unlock()
            throw r5
    }
}
