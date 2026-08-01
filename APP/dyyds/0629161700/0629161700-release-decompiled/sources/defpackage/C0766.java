package defpackage;

/* JADX INFO: renamed from: ᛴᲁᛶᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0766 {

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static final java.lang.Object f3560 = null;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static volatile defpackage.C0766 f3561;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final defpackage.C2318 f3562;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C0281 f3563;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final android.os.Handler f3564;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public volatile int f3565;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.concurrent.locks.ReentrantReadWriteLock f3566;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C2048 f3567;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.InterfaceC1991 f3568;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final int f3569;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.C0766.f3560 = r0
            return
    }

    public C0766(defpackage.C1164 r5) {
            r4 = this;
            r4.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r4.f3566 = r0
            r1 = 3
            r4.f3565 = r1
            java.lang.Object r1 = r5.f9097
            ᲇᛱᲈᛲ r1 = (defpackage.InterfaceC1991) r1
            r4.f3568 = r1
            int r2 = r5.f9096
            r4.f3569 = r2
            java.lang.Object r5 = r5.f9095
            ᲈᲀᛲᛴ r5 = (defpackage.C2318) r5
            r4.f3562 = r5
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r5.<init>(r3)
            r4.f3564 = r5
            ᲇᛵᛲᛲ r5 = new ᲇᛵᛲᛲ
            r5.<init>()
            r4.f3567 = r5
            ᛲᛴᛴᛵ r5 = new ᛲᛴᛴᛵ
            r5.<init>(r4)
            r4.f3563 = r5
            java.util.concurrent.locks.Lock r3 = r0.writeLock()
            r3.lock()
            if (r2 != 0) goto L4e
            r2 = 0
            r4.f3565 = r2     // Catch: java.lang.Throwable -> L43
            goto L4e
        L43:
            r5 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r4.f3566
            java.util.concurrent.locks.Lock r4 = r4.writeLock()
            r4.unlock()
            throw r5
        L4e:
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            int r0 = r4.m1700()
            if (r0 != 0) goto L68
            ᛵᛶᛵᛲ r0 = new ᛵᛶᛵᛲ     // Catch: java.lang.Throwable -> L64
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L64
            r1.mo2284(r0)     // Catch: java.lang.Throwable -> L64
            return
        L64:
            r5 = move-exception
            r4.m1698(r5)
        L68:
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static defpackage.C0766 m1696() {
            java.lang.Object r0 = defpackage.C0766.f3560
            monitor-enter(r0)
            ᛴᲁᛶᲈ r1 = defpackage.C0766.f3561     // Catch: java.lang.Throwable -> L10
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

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.CharSequence m1697(java.lang.CharSequence r11, int r12, int r13) {
            r10 = this;
            int r0 = r10.m1700()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r1
        Lb:
            r3 = 0
            if (r0 == 0) goto L196
            if (r12 < 0) goto L190
            if (r13 < 0) goto L18a
            if (r12 > r13) goto L16
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            if (r0 == 0) goto L184
            if (r11 != 0) goto L1c
            return r3
        L1c:
            int r0 = r11.length()
            if (r12 > r0) goto L24
            r0 = r2
            goto L25
        L24:
            r0 = r1
        L25:
            if (r0 == 0) goto L17e
            int r0 = r11.length()
            if (r13 > r0) goto L2f
            r0 = r2
            goto L30
        L2f:
            r0 = r1
        L30:
            if (r0 == 0) goto L178
            int r0 = r11.length()
            if (r0 == 0) goto L177
            if (r12 != r13) goto L3c
            goto L177
        L3c:
            ᛲᛴᛴᛵ r10 = r10.f3563
            java.lang.Object r10 = r10.f1564
            ᛴᛵᲇᲇ r10 = (defpackage.C0682) r10
            r10.getClass()
            boolean r0 = r11 instanceof defpackage.C0713
            if (r0 == 0) goto L4f
            r4 = r11
            ᛴᛷᲁᛱ r4 = (defpackage.C0713) r4
            r4.m1617()
        L4f:
            java.lang.Class<ᛶᲈᛵᛱ> r4 = defpackage.C1183.class
            if (r0 != 0) goto L72
            boolean r5 = r11 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> L6f
            if (r5 == 0) goto L58
            goto L72
        L58:
            boolean r5 = r11 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> L6f
            if (r5 == 0) goto L7a
            r5 = r11
            android.text.Spanned r5 = (android.text.Spanned) r5     // Catch: java.lang.Throwable -> L6f
            int r6 = r12 + (-1)
            int r7 = r13 + 1
            int r5 = r5.nextSpanTransition(r6, r7, r4)     // Catch: java.lang.Throwable -> L6f
            if (r5 > r13) goto L7a
            ᛷᛸᲇᛶ r3 = new ᛷᛸᲇᛶ     // Catch: java.lang.Throwable -> L6f
            r3.<init>(r11)     // Catch: java.lang.Throwable -> L6f
            goto L7a
        L6f:
            r10 = move-exception
            goto L16f
        L72:
            ᛷᛸᲇᛶ r3 = new ᛷᛸᲇᛶ     // Catch: java.lang.Throwable -> L6f
            r5 = r11
            android.text.Spannable r5 = (android.text.Spannable) r5     // Catch: java.lang.Throwable -> L6f
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L6f
        L7a:
            if (r3 == 0) goto Lab
            android.text.Spannable r5 = r3.f5921     // Catch: java.lang.Throwable -> L6f
            java.lang.Object[] r4 = r5.getSpans(r12, r13, r4)     // Catch: java.lang.Throwable -> L6f
            ᛶᲈᛵᛱ[] r4 = (defpackage.C1183[]) r4     // Catch: java.lang.Throwable -> L6f
            if (r4 == 0) goto Lab
            int r5 = r4.length     // Catch: java.lang.Throwable -> L6f
            if (r5 <= 0) goto Lab
            int r5 = r4.length     // Catch: java.lang.Throwable -> L6f
            r6 = r1
        L8b:
            if (r6 >= r5) goto Lab
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L6f
            android.text.Spannable r8 = r3.f5921     // Catch: java.lang.Throwable -> L6f
            int r8 = r8.getSpanStart(r7)     // Catch: java.lang.Throwable -> L6f
            android.text.Spannable r9 = r3.f5921     // Catch: java.lang.Throwable -> L6f
            int r9 = r9.getSpanEnd(r7)     // Catch: java.lang.Throwable -> L6f
            if (r8 == r13) goto La0
            r3.removeSpan(r7)     // Catch: java.lang.Throwable -> L6f
        La0:
            int r12 = java.lang.Math.min(r8, r12)     // Catch: java.lang.Throwable -> L6f
            int r13 = java.lang.Math.max(r9, r13)     // Catch: java.lang.Throwable -> L6f
            int r6 = r6 + 1
            goto L8b
        Lab:
            if (r12 == r13) goto L16c
            int r4 = r11.length()     // Catch: java.lang.Throwable -> L6f
            if (r12 < r4) goto Lb5
            goto L16c
        Lb5:
            ᛲᛶᛵ r4 = new ᛲᛶᛵ     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r5 = r10.f3286     // Catch: java.lang.Throwable -> L6f
            ᛲᛶᛲᲁ r5 = (defpackage.C0302) r5     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r5 = r5.f1618     // Catch: java.lang.Throwable -> L6f
            ᲇᛵᲁᛲ r5 = (defpackage.C2055) r5     // Catch: java.lang.Throwable -> L6f
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L6f
            int r5 = java.lang.Character.codePointAt(r11, r12)     // Catch: java.lang.Throwable -> L6f
            r6 = r5
            r5 = r3
            r3 = r1
        Lc9:
            r1 = r12
        Lca:
            r7 = 33
            r8 = 2
            r9 = 2147483647(0x7fffffff, float:NaN)
            if (r12 >= r13) goto L123
            if (r3 >= r9) goto L123
            int r9 = r4.m984(r6)     // Catch: java.lang.Throwable -> L6f
            if (r9 == r2) goto L111
            if (r9 == r8) goto L105
            r8 = 3
            if (r9 == r8) goto Le0
            goto Lca
        Le0:
            ᲇᛵᲁᛲ r8 = r4.f1630     // Catch: java.lang.Throwable -> L6f
            ᛵᛸᛸᛳ r8 = r8.f8850     // Catch: java.lang.Throwable -> L6f
            boolean r8 = r10.m1547(r11, r1, r12, r8)     // Catch: java.lang.Throwable -> L6f
            if (r8 != 0) goto Lc9
            if (r5 != 0) goto Lf6
            ᛷᛸᲇᛶ r5 = new ᛷᛸᲇᛶ     // Catch: java.lang.Throwable -> L6f
            android.text.SpannableString r8 = new android.text.SpannableString     // Catch: java.lang.Throwable -> L6f
            r8.<init>(r11)     // Catch: java.lang.Throwable -> L6f
            r5.<init>(r8)     // Catch: java.lang.Throwable -> L6f
        Lf6:
            ᲇᛵᲁᛲ r8 = r4.f1630     // Catch: java.lang.Throwable -> L6f
            ᛵᛸᛸᛳ r8 = r8.f8850     // Catch: java.lang.Throwable -> L6f
            ᛶᲈᛵᛱ r9 = new ᛶᲈᛵᛱ     // Catch: java.lang.Throwable -> L6f
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L6f
            r5.setSpan(r9, r1, r12, r7)     // Catch: java.lang.Throwable -> L6f
            int r3 = r3 + 1
            goto Lc9
        L105:
            int r7 = java.lang.Character.charCount(r6)     // Catch: java.lang.Throwable -> L6f
            int r12 = r12 + r7
            if (r12 >= r13) goto Lca
            int r6 = java.lang.Character.codePointAt(r11, r12)     // Catch: java.lang.Throwable -> L6f
            goto Lca
        L111:
            int r12 = java.lang.Character.codePointAt(r11, r1)     // Catch: java.lang.Throwable -> L6f
            int r12 = java.lang.Character.charCount(r12)     // Catch: java.lang.Throwable -> L6f
            int r1 = r1 + r12
            if (r1 >= r13) goto L121
            int r12 = java.lang.Character.codePointAt(r11, r1)     // Catch: java.lang.Throwable -> L6f
            r6 = r12
        L121:
            r12 = r1
            goto Lca
        L123:
            int r13 = r4.f1632     // Catch: java.lang.Throwable -> L6f
            if (r13 != r8) goto L157
            ᲇᛵᲁᛲ r13 = r4.f1631     // Catch: java.lang.Throwable -> L6f
            ᛵᛸᛸᛳ r13 = r13.f8850     // Catch: java.lang.Throwable -> L6f
            if (r13 == 0) goto L157
            int r13 = r4.f1634     // Catch: java.lang.Throwable -> L6f
            if (r13 > r2) goto L137
            boolean r13 = r4.m983()     // Catch: java.lang.Throwable -> L6f
            if (r13 == 0) goto L157
        L137:
            if (r3 >= r9) goto L157
            ᲇᛵᲁᛲ r13 = r4.f1631     // Catch: java.lang.Throwable -> L6f
            ᛵᛸᛸᛳ r13 = r13.f8850     // Catch: java.lang.Throwable -> L6f
            boolean r10 = r10.m1547(r11, r1, r12, r13)     // Catch: java.lang.Throwable -> L6f
            if (r10 != 0) goto L157
            if (r5 != 0) goto L14b
            ᛷᛸᲇᛶ r10 = new ᛷᛸᲇᛶ     // Catch: java.lang.Throwable -> L6f
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L6f
            r5 = r10
        L14b:
            ᲇᛵᲁᛲ r10 = r4.f1631     // Catch: java.lang.Throwable -> L6f
            ᛵᛸᛸᛳ r10 = r10.f8850     // Catch: java.lang.Throwable -> L6f
            ᛶᲈᛵᛱ r13 = new ᛶᲈᛵᛱ     // Catch: java.lang.Throwable -> L6f
            r13.<init>(r10)     // Catch: java.lang.Throwable -> L6f
            r5.setSpan(r13, r1, r12, r7)     // Catch: java.lang.Throwable -> L6f
        L157:
            if (r5 == 0) goto L163
            android.text.Spannable r10 = r5.f5921     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L162
            ᛴᛷᲁᛱ r11 = (defpackage.C0713) r11
            r11.m1618()
        L162:
            return r10
        L163:
            if (r0 == 0) goto L177
        L165:
            r10 = r11
            ᛴᛷᲁᛱ r10 = (defpackage.C0713) r10
            r10.m1618()
            return r11
        L16c:
            if (r0 == 0) goto L177
            goto L165
        L16f:
            if (r0 == 0) goto L176
            ᛴᛷᲁᛱ r11 = (defpackage.C0713) r11
            r11.m1618()
        L176:
            throw r10
        L177:
            return r11
        L178:
            java.lang.String r10 = "end should be < than charSequence length"
            defpackage.C2264.m3684(r10)
            return r3
        L17e:
            java.lang.String r10 = "start should be < than charSequence length"
            defpackage.C2264.m3684(r10)
            return r3
        L184:
            java.lang.String r10 = "start should be <= than end"
            defpackage.C2264.m3684(r10)
            return r3
        L18a:
            java.lang.String r10 = "end cannot be negative"
            defpackage.C2264.m3684(r10)
            return r3
        L190:
            java.lang.String r10 = "start cannot be negative"
            defpackage.C2264.m3684(r10)
            return r3
        L196:
            java.lang.String r10 = "Not initialized yet"
            defpackage.C2264.m3676(r10)
            return r3
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m1698(java.lang.Throwable r4) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r3.f3566
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.lock()
            r1 = 2
            r3.f3565 = r1     // Catch: java.lang.Throwable -> L31
            ᲇᛵᛲᛲ r1 = r3.f3567     // Catch: java.lang.Throwable -> L31
            r0.addAll(r1)     // Catch: java.lang.Throwable -> L31
            ᲇᛵᛲᛲ r1 = r3.f3567     // Catch: java.lang.Throwable -> L31
            r1.clear()     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r3.f3566
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            android.os.Handler r1 = r3.f3564
            ᛵᛵᛱᛸ r2 = new ᛵᛵᛱᛸ
            int r3 = r3.f3565
            r2.<init>(r0, r3, r4)
            r1.post(r2)
            return
        L31:
            r4 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r3.f3566
            java.util.concurrent.locks.Lock r3 = r3.writeLock()
            r3.unlock()
            throw r4
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m1699() {
            r3 = this;
            int r0 = r3.f3569
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            if (r0 == 0) goto L55
            int r0 = r3.m1700()
            if (r0 != r2) goto L12
            return
        L12:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r3.f3566
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            int r0 = r3.f3565     // Catch: java.lang.Throwable -> L4a
            if (r0 != 0) goto L29
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r3.f3566
            java.util.concurrent.locks.Lock r3 = r3.writeLock()
            r3.unlock()
            return
        L29:
            r3.f3565 = r1     // Catch: java.lang.Throwable -> L4a
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r3.f3566
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            ᛲᛴᛴᛵ r3 = r3.f3563
            java.lang.Object r0 = r3.f1563
            ᛴᲁᛶᲈ r0 = (defpackage.C0766) r0
            ᛵᛶᛵᛲ r1 = new ᛵᛶᛵᛲ     // Catch: java.lang.Throwable -> L45
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L45
            ᲇᛱᲈᛲ r3 = r0.f3568     // Catch: java.lang.Throwable -> L45
            r3.mo2284(r1)     // Catch: java.lang.Throwable -> L45
            return
        L45:
            r3 = move-exception
            r0.m1698(r3)
            return
        L4a:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r3.f3566
            java.util.concurrent.locks.Lock r3 = r3.writeLock()
            r3.unlock()
            throw r0
        L55:
            java.lang.String r3 = "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading"
            defpackage.C2264.m3676(r3)
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int m1700() {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r1.f3566
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            int r0 = r1.f3565     // Catch: java.lang.Throwable -> L15
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r1.f3566
            java.util.concurrent.locks.Lock r1 = r1.readLock()
            r1.unlock()
            return r0
        L15:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r1.f3566
            java.util.concurrent.locks.Lock r1 = r1.readLock()
            r1.unlock()
            throw r0
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final void m1701(defpackage.AbstractC1148 r5) {
            r4 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r4.f3566
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            int r0 = r4.f3565     // Catch: java.lang.Throwable -> L1a
            r1 = 1
            if (r0 == r1) goto L1c
            int r0 = r4.f3565     // Catch: java.lang.Throwable -> L1a
            r1 = 2
            if (r0 != r1) goto L14
            goto L1c
        L14:
            ᲇᛵᛲᛲ r0 = r4.f3567     // Catch: java.lang.Throwable -> L1a
            r0.add(r5)     // Catch: java.lang.Throwable -> L1a
            goto L31
        L1a:
            r5 = move-exception
            goto L3b
        L1c:
            android.os.Handler r0 = r4.f3564     // Catch: java.lang.Throwable -> L1a
            ᛵᛵᛱᛸ r1 = new ᛵᛵᛱᛸ     // Catch: java.lang.Throwable -> L1a
            int r2 = r4.f3565     // Catch: java.lang.Throwable -> L1a
            ᛶᲁᛲᛸ[] r5 = new defpackage.AbstractC1148[]{r5}     // Catch: java.lang.Throwable -> L1a
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch: java.lang.Throwable -> L1a
            r3 = 0
            r1.<init>(r5, r2, r3)     // Catch: java.lang.Throwable -> L1a
            r0.post(r1)     // Catch: java.lang.Throwable -> L1a
        L31:
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r4.f3566
            java.util.concurrent.locks.Lock r4 = r4.writeLock()
            r4.unlock()
            return
        L3b:
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r4.f3566
            java.util.concurrent.locks.Lock r4 = r4.writeLock()
            r4.unlock()
            throw r5
    }
}
