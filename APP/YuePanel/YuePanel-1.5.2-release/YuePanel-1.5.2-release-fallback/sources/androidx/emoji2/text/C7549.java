package androidx.emoji2.text;

/* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7549 extends androidx.emoji2.text.C7527.AbstractC7532 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final androidx.emoji2.text.C7549.C7551 f29097 = null;

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟۟۟$ۥ, reason: contains not printable characters */
    public static class C7550 extends androidx.emoji2.text.C7549.AbstractC7554 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final long f29098;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public long f29099;

        public C7550(long r1) {
                r0 = this;
                r0.<init>()
                r0.f29098 = r1
                return
        }

        @Override // androidx.emoji2.text.C7549.AbstractC7554
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public long mo29021() {
                r6 = this;
                long r0 = r6.f29099
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto Lf
                long r0 = android.os.SystemClock.uptimeMillis()
                r6.f29099 = r0
                return r2
            Lf:
                long r0 = android.os.SystemClock.uptimeMillis()
                long r2 = r6.f29099
                long r0 = r0 - r2
                long r2 = r6.f29098
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 <= 0) goto L1f
                r0 = -1
                return r0
            L1f:
                r2 = 1000(0x3e8, double:4.94E-321)
                long r2 = java.lang.Math.max(r0, r2)
                long r4 = r6.f29098
                long r4 = r4 - r0
                long r0 = java.lang.Math.min(r2, r4)
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟۟۟$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    public static class C7551 {
        public C7551() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public android.graphics.Typeface m29022(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 Yue.C2736.C2739 r3) throws android.content.pm.PackageManager.NameNotFoundException {
                r1 = this;
                r0 = 0
                Yue.ۥ۠ۢۦۢ$ۥ۟۟[] r3 = new Yue.C2736.C2739[]{r3}
                android.graphics.Typeface r2 = Yue.C2736.m11999(r2, r0, r3)
                return r2
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.C2736.C2738 m29023(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 Yue.C2719 r3) throws android.content.pm.PackageManager.NameNotFoundException {
                r1 = this;
                r0 = 0
                Yue.ۥ۠ۢۦۢ$ۥ۟ r2 = Yue.C2736.m12000(r2, r0, r3)
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m29024(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 android.net.Uri r3, @Yue.InterfaceC4410 android.database.ContentObserver r4) {
                r1 = this;
                android.content.ContentResolver r2 = r2.getContentResolver()
                r0 = 0
                r2.registerContentObserver(r3, r0, r4)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m29025(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 android.database.ContentObserver r2) {
                r0 = this;
                android.content.ContentResolver r1 = r1.getContentResolver()
                r1.unregisterContentObserver(r2)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟۟۟$ۥ۟۟, reason: contains not printable characters */
    public static class C7552 implements androidx.emoji2.text.C7527.InterfaceC7538 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static final java.lang.String f29100 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface";

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final android.content.Context f29101;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final Yue.C2719 f29102;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final androidx.emoji2.text.C7549.C7551 f29103;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final java.lang.Object f29104;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @Yue.InterfaceC2947("mLock")
        @Yue.InterfaceC4544
        public android.os.Handler f29105;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC2947("mLock")
        @Yue.InterfaceC4544
        public java.util.concurrent.Executor f29106;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        @Yue.InterfaceC2947("mLock")
        @Yue.InterfaceC4544
        public java.util.concurrent.ThreadPoolExecutor f29107;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        @Yue.InterfaceC2947("mLock")
        @Yue.InterfaceC4544
        public androidx.emoji2.text.C7549.AbstractC7554 f29108;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        @Yue.InterfaceC2947("mLock")
        @Yue.InterfaceC4544
        public androidx.emoji2.text.C7527.AbstractC7539 f29109;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        @Yue.InterfaceC2947("mLock")
        @Yue.InterfaceC4544
        public android.database.ContentObserver f29110;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        @Yue.InterfaceC2947("mLock")
        @Yue.InterfaceC4544
        public java.lang.Runnable f29111;

        /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟۟۟$ۥ۟۟$ۥ, reason: contains not printable characters */
        public class C7553 extends android.database.ContentObserver {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public final /* synthetic */ androidx.emoji2.text.C7549.C7552 f29112;

            public C7553(androidx.emoji2.text.C7549.C7552 r1, android.os.Handler r2) {
                    r0 = this;
                    r0.f29112 = r1
                    r0.<init>(r2)
                    return
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean r1, android.net.Uri r2) {
                    r0 = this;
                    androidx.emoji2.text.ۥ۟۟۟۟$ۥ۟۟ r1 = r0.f29112
                    r1.m29028()
                    return
            }
        }

        public C7552(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 Yue.C2719 r3, @Yue.InterfaceC4410 androidx.emoji2.text.C7549.C7551 r4) {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r1.f29104 = r0
                java.lang.String r0 = "Context cannot be null"
                Yue.C4868.m19182(r2, r0)
                java.lang.String r0 = "FontRequest cannot be null"
                Yue.C4868.m19182(r3, r0)
                android.content.Context r2 = r2.getApplicationContext()
                r1.f29101 = r2
                r1.f29102 = r3
                r1.f29103 = r4
                return
        }

        @Override // androidx.emoji2.text.C7527.InterfaceC7538
        @Yue.InterfaceC5336(19)
        /* JADX INFO: renamed from: ۥ */
        public void mo28916(@Yue.InterfaceC4410 androidx.emoji2.text.C7527.AbstractC7539 r2) {
                r1 = this;
                java.lang.String r0 = "LoaderCallback cannot be null"
                Yue.C4868.m19182(r2, r0)
                java.lang.Object r0 = r1.f29104
                monitor-enter(r0)
                r1.f29109 = r2     // Catch: java.lang.Throwable -> Lf
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
                r1.m29028()
                return
            Lf:
                r2 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
                throw r2
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final void m29026() {
                r5 = this;
                java.lang.Object r0 = r5.f29104
                monitor-enter(r0)
                r1 = 0
                r5.f29109 = r1     // Catch: java.lang.Throwable -> L14
                android.database.ContentObserver r2 = r5.f29110     // Catch: java.lang.Throwable -> L14
                if (r2 == 0) goto L16
                androidx.emoji2.text.ۥ۟۟۟۟$ۥ۟ r3 = r5.f29103     // Catch: java.lang.Throwable -> L14
                android.content.Context r4 = r5.f29101     // Catch: java.lang.Throwable -> L14
                r3.m29025(r4, r2)     // Catch: java.lang.Throwable -> L14
                r5.f29110 = r1     // Catch: java.lang.Throwable -> L14
                goto L16
            L14:
                r1 = move-exception
                goto L2e
            L16:
                android.os.Handler r2 = r5.f29105     // Catch: java.lang.Throwable -> L14
                if (r2 == 0) goto L1f
                java.lang.Runnable r3 = r5.f29111     // Catch: java.lang.Throwable -> L14
                r2.removeCallbacks(r3)     // Catch: java.lang.Throwable -> L14
            L1f:
                r5.f29105 = r1     // Catch: java.lang.Throwable -> L14
                java.util.concurrent.ThreadPoolExecutor r2 = r5.f29107     // Catch: java.lang.Throwable -> L14
                if (r2 == 0) goto L28
                r2.shutdown()     // Catch: java.lang.Throwable -> L14
            L28:
                r5.f29106 = r1     // Catch: java.lang.Throwable -> L14
                r5.f29107 = r1     // Catch: java.lang.Throwable -> L14
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
                return
            L2e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
                throw r1
        }

        @Yue.InterfaceC5336(19)
        @Yue.InterfaceC7131
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m29027() {
                r7 = this;
                java.lang.Object r0 = r7.f29104
                monitor-enter(r0)
                androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۥ r1 = r7.f29109     // Catch: java.lang.Throwable -> L9
                if (r1 != 0) goto Lc
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                return
            L9:
                r1 = move-exception
                goto Lb1
            Lc:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                Yue.ۥ۠ۢۦۢ$ۥ۟۟ r0 = r7.m29029()     // Catch: java.lang.Throwable -> L38
                int r1 = r0.m12012()     // Catch: java.lang.Throwable -> L38
                r2 = 2
                if (r1 != r2) goto L3a
                java.lang.Object r2 = r7.f29104     // Catch: java.lang.Throwable -> L38
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L38
                androidx.emoji2.text.ۥ۟۟۟۟$ۥ۟۟۟ r3 = r7.f29108     // Catch: java.lang.Throwable -> L32
                if (r3 == 0) goto L34
                long r3 = r3.mo29021()     // Catch: java.lang.Throwable -> L32
                r5 = 0
                int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r5 < 0) goto L34
                android.net.Uri r0 = r0.m12014()     // Catch: java.lang.Throwable -> L32
                r7.m29030(r0, r3)     // Catch: java.lang.Throwable -> L32
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L32
                return
            L32:
                r0 = move-exception
                goto L36
            L34:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L32
                goto L3a
            L36:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L32
                throw r0     // Catch: java.lang.Throwable -> L38
            L38:
                r0 = move-exception
                goto L9d
            L3a:
                if (r1 != 0) goto L81
                java.lang.String r1 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
                Yue.C6388.m23593(r1)     // Catch: java.lang.Throwable -> L73
                androidx.emoji2.text.ۥ۟۟۟۟$ۥ۟ r1 = r7.f29103     // Catch: java.lang.Throwable -> L73
                android.content.Context r2 = r7.f29101     // Catch: java.lang.Throwable -> L73
                android.graphics.Typeface r1 = r1.m29022(r2, r0)     // Catch: java.lang.Throwable -> L73
                android.content.Context r2 = r7.f29101     // Catch: java.lang.Throwable -> L73
                android.net.Uri r0 = r0.m12014()     // Catch: java.lang.Throwable -> L73
                r3 = 0
                java.nio.ByteBuffer r0 = Yue.C6494.m23980(r2, r3, r0)     // Catch: java.lang.Throwable -> L73
                if (r0 == 0) goto L75
                if (r1 == 0) goto L75
                androidx.emoji2.text.ۥ۟۟۟۠ r0 = androidx.emoji2.text.C7555.m29036(r1, r0)     // Catch: java.lang.Throwable -> L73
                Yue.C6388.m23595()     // Catch: java.lang.Throwable -> L38
                java.lang.Object r1 = r7.f29104     // Catch: java.lang.Throwable -> L38
                monitor-enter(r1)     // Catch: java.lang.Throwable -> L38
                androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۥ r2 = r7.f29109     // Catch: java.lang.Throwable -> L6a
                if (r2 == 0) goto L6c
                r2.mo28920(r0)     // Catch: java.lang.Throwable -> L6a
                goto L6c
            L6a:
                r0 = move-exception
                goto L71
            L6c:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L6a
                r7.m29026()     // Catch: java.lang.Throwable -> L38
                goto Lae
            L71:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L6a
                throw r0     // Catch: java.lang.Throwable -> L38
            L73:
                r0 = move-exception
                goto L7d
            L75:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L73
                java.lang.String r1 = "Unable to open file."
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L73
                throw r0     // Catch: java.lang.Throwable -> L73
            L7d:
                Yue.C6388.m23595()     // Catch: java.lang.Throwable -> L38
                throw r0     // Catch: java.lang.Throwable -> L38
            L81:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L38
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
                r2.<init>()     // Catch: java.lang.Throwable -> L38
                java.lang.String r3 = "fetchFonts result is not OK. ("
                r2.append(r3)     // Catch: java.lang.Throwable -> L38
                r2.append(r1)     // Catch: java.lang.Throwable -> L38
                java.lang.String r1 = ")"
                r2.append(r1)     // Catch: java.lang.Throwable -> L38
                java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L38
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L38
                throw r0     // Catch: java.lang.Throwable -> L38
            L9d:
                java.lang.Object r1 = r7.f29104
                monitor-enter(r1)
                androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۥ r2 = r7.f29109     // Catch: java.lang.Throwable -> La8
                if (r2 == 0) goto Laa
                r2.mo28919(r0)     // Catch: java.lang.Throwable -> La8
                goto Laa
            La8:
                r0 = move-exception
                goto Laf
            Laa:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> La8
                r7.m29026()
            Lae:
                return
            Laf:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> La8
                throw r0
            Lb1:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                throw r1
        }

        @Yue.InterfaceC5336(19)
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m29028() {
                r3 = this;
                java.lang.Object r0 = r3.f29104
                monitor-enter(r0)
                androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۥ r1 = r3.f29109     // Catch: java.lang.Throwable -> L9
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                return
            L9:
                r1 = move-exception
                goto L25
            Lb:
                java.util.concurrent.Executor r1 = r3.f29106     // Catch: java.lang.Throwable -> L9
                if (r1 != 0) goto L19
                java.lang.String r1 = "emojiCompat"
                java.util.concurrent.ThreadPoolExecutor r1 = Yue.C1444.m7092(r1)     // Catch: java.lang.Throwable -> L9
                r3.f29107 = r1     // Catch: java.lang.Throwable -> L9
                r3.f29106 = r1     // Catch: java.lang.Throwable -> L9
            L19:
                java.util.concurrent.Executor r1 = r3.f29106     // Catch: java.lang.Throwable -> L9
                Yue.ۥ۠ۢۥۨ r2 = new Yue.ۥ۠ۢۥۨ     // Catch: java.lang.Throwable -> L9
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L9
                r1.execute(r2)     // Catch: java.lang.Throwable -> L9
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                return
            L25:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                throw r1
        }

        @Yue.InterfaceC7131
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final Yue.C2736.C2739 m29029() {
                r4 = this;
                androidx.emoji2.text.ۥ۟۟۟۟$ۥ۟ r0 = r4.f29103     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
                android.content.Context r1 = r4.f29101     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
                Yue.ۥ۠ۢۥۧ r2 = r4.f29102     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
                Yue.ۥ۠ۢۦۢ$ۥ۟ r0 = r0.m29023(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
                int r1 = r0.m12010()
                if (r1 != 0) goto L25
                Yue.ۥ۠ۢۦۢ$ۥ۟۟[] r0 = r0.m12009()
                if (r0 == 0) goto L1d
                int r1 = r0.length
                if (r1 == 0) goto L1d
                r1 = 0
                r0 = r0[r1]
                return r0
            L1d:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "fetchFonts failed (empty result)"
                r0.<init>(r1)
                throw r0
            L25:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "fetchFonts failed ("
                r2.append(r3)
                int r0 = r0.m12010()
                r2.append(r0)
                java.lang.String r0 = ")"
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L45:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "provider not found"
                r1.<init>(r2, r0)
                throw r1
        }

        @Yue.InterfaceC5336(19)
        @Yue.InterfaceC7131
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final void m29030(android.net.Uri r6, long r7) {
                r5 = this;
                java.lang.Object r0 = r5.f29104
                monitor-enter(r0)
                android.os.Handler r1 = r5.f29105     // Catch: java.lang.Throwable -> Le
                if (r1 != 0) goto L10
                android.os.Handler r1 = Yue.C1444.m7094()     // Catch: java.lang.Throwable -> Le
                r5.f29105 = r1     // Catch: java.lang.Throwable -> Le
                goto L10
            Le:
                r6 = move-exception
                goto L34
            L10:
                android.database.ContentObserver r2 = r5.f29110     // Catch: java.lang.Throwable -> Le
                if (r2 != 0) goto L22
                androidx.emoji2.text.ۥ۟۟۟۟$ۥ۟۟$ۥ r2 = new androidx.emoji2.text.ۥ۟۟۟۟$ۥ۟۟$ۥ     // Catch: java.lang.Throwable -> Le
                r2.<init>(r5, r1)     // Catch: java.lang.Throwable -> Le
                r5.f29110 = r2     // Catch: java.lang.Throwable -> Le
                androidx.emoji2.text.ۥ۟۟۟۟$ۥ۟ r3 = r5.f29103     // Catch: java.lang.Throwable -> Le
                android.content.Context r4 = r5.f29101     // Catch: java.lang.Throwable -> Le
                r3.m29024(r4, r6, r2)     // Catch: java.lang.Throwable -> Le
            L22:
                java.lang.Runnable r6 = r5.f29111     // Catch: java.lang.Throwable -> Le
                if (r6 != 0) goto L2d
                Yue.ۥ۠ۢۦ r6 = new Yue.ۥ۠ۢۦ     // Catch: java.lang.Throwable -> Le
                r6.<init>(r5)     // Catch: java.lang.Throwable -> Le
                r5.f29111 = r6     // Catch: java.lang.Throwable -> Le
            L2d:
                java.lang.Runnable r6 = r5.f29111     // Catch: java.lang.Throwable -> Le
                r1.postDelayed(r6, r7)     // Catch: java.lang.Throwable -> Le
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
                return
            L34:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
                throw r6
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void m29031(@Yue.InterfaceC4410 java.util.concurrent.Executor r2) {
                r1 = this;
                java.lang.Object r0 = r1.f29104
                monitor-enter(r0)
                r1.f29106 = r2     // Catch: java.lang.Throwable -> L7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r2 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                throw r2
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void m29032(@Yue.InterfaceC4544 androidx.emoji2.text.C7549.AbstractC7554 r2) {
                r1 = this;
                java.lang.Object r0 = r1.f29104
                monitor-enter(r0)
                r1.f29108 = r2     // Catch: java.lang.Throwable -> L7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r2 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                throw r2
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟۟۟$ۥ۟۟۟, reason: contains not printable characters */
    public static abstract class AbstractC7554 {
        public AbstractC7554() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ */
        public abstract long mo29021();
    }

    static {
            androidx.emoji2.text.ۥ۟۟۟۟$ۥ۟ r0 = new androidx.emoji2.text.ۥ۟۟۟۟$ۥ۟
            r0.<init>()
            androidx.emoji2.text.C7549.f29097 = r0
            return
    }

    public C7549(@Yue.InterfaceC4410 android.content.Context r3, @Yue.InterfaceC4410 Yue.C2719 r4) {
            r2 = this;
            androidx.emoji2.text.ۥ۟۟۟۟$ۥ۟۟ r0 = new androidx.emoji2.text.ۥ۟۟۟۟$ۥ۟۟
            androidx.emoji2.text.ۥ۟۟۟۟$ۥ۟ r1 = androidx.emoji2.text.C7549.f29097
            r0.<init>(r3, r4, r1)
            r2.<init>(r0)
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    public C7549(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 Yue.C2719 r3, @Yue.InterfaceC4410 androidx.emoji2.text.C7549.C7551 r4) {
            r1 = this;
            androidx.emoji2.text.ۥ۟۟۟۟$ۥ۟۟ r0 = new androidx.emoji2.text.ۥ۟۟۟۟$ۥ۟۟
            r0.<init>(r2, r3, r4)
            r1.<init>(r0)
            return
    }

    @Yue.InterfaceC4410
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public androidx.emoji2.text.C7549 m29018(@Yue.InterfaceC4544 android.os.Handler r1) {
            r0 = this;
            if (r1 != 0) goto L3
            return r0
        L3:
            java.util.concurrent.Executor r1 = Yue.C1444.m7091(r1)
            r0.m29019(r1)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public androidx.emoji2.text.C7549 m29019(@Yue.InterfaceC4410 java.util.concurrent.Executor r2) {
            r1 = this;
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۤ r0 = r1.m28978()
            androidx.emoji2.text.ۥ۟۟۟۟$ۥ۟۟ r0 = (androidx.emoji2.text.C7549.C7552) r0
            r0.m29031(r2)
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public androidx.emoji2.text.C7549 m29020(@Yue.InterfaceC4544 androidx.emoji2.text.C7549.AbstractC7554 r2) {
            r1 = this;
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۤ r0 = r1.m28978()
            androidx.emoji2.text.ۥ۟۟۟۟$ۥ۟۟ r0 = (androidx.emoji2.text.C7549.C7552) r0
            r0.m29032(r2)
            return r1
    }
}
