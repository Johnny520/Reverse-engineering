package nb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final android.os.Handler f9261a = null;

    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            nb.f0.f9261a = r0
            return
    }

    public static m.a a(android.content.Context r14, java.lang.String r15, fg.l r16) {
            r14.getClass()
            r15.getClass()
            android.content.Context r0 = r14.getApplicationContext()
            if (r0 == 0) goto Le
            r8 = r0
            goto Lf
        Le:
            r8 = r14
        Lf:
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r14 = 0
            r1.<init>(r14)
            java.util.List r3 = nb.c.a(r8, r15)
            java.lang.String r12 = nb.c.c(r8)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            gg.u r4 = new gg.u
            r4.<init>()
            r6 = r4
            gg.s r4 = new gg.s
            r4.<init>()
            gg.t r2 = new gg.t
            r2.<init>()
            gg.u r11 = new gg.u
            r11.<init>()
            gg.u r13 = new gg.u
            r13.<init>()
            r5 = r2
            r2 = r1
            nb.a0 r1 = new nb.a0
            r7 = r15
            r10 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r3 = r11
            r13.f4564g = r1
            nb.b0 r14 = new nb.b0
            r15 = 0
            r14.<init>(r13, r15)
            android.os.Handler r15 = nb.f0.f9261a
            r15.post(r14)
            m.a r14 = new m.a
            c9.n0 r0 = new c9.n0
            r1 = r2
            r2 = r5
            r5 = 6
            r4 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r15 = 6
            r14.<init>(r0, r15)
            return r14
    }

    public static final void b(long r8, android.content.Context r10, fg.l r11, gg.s r12, gg.t r13, gg.u r14, gg.u r15, gg.u r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.util.ArrayList r20, java.util.List r21, java.util.concurrent.atomic.AtomicBoolean r22) {
            long r0 = r13.f4563g
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 != 0) goto L61
            boolean r8 = r22.get()
            if (r8 == 0) goto Ld
            goto L61
        Ld:
            long r8 = r13.f4563g
            r0 = 1
            long r8 = r8 + r0
            r13.f4563g = r8
            boolean r8 = og.m.t0(r18)
            if (r8 == 0) goto L1d
            java.lang.String r8 = "系统默认"
            goto L1f
        L1d:
            r8 = r18
        L1f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = "："
            r9.append(r8)
            r8 = r19
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r2 = r20
            r2.add(r8)
            d(r14, r15)
            int r8 = r12.f4562g
            int r9 = r21.size()
            if (r8 >= r9) goto L55
            nb.b0 r8 = new nb.b0
            r9 = 1
            r10 = r16
            r8.<init>(r10, r9)
            r9 = 300(0x12c, double:1.48E-321)
            android.os.Handler r11 = nb.f0.f9261a
            r11.postDelayed(r8, r9)
            return
        L55:
            r1 = r10
            r5 = r11
            r3 = r13
            r6 = r14
            r7 = r15
            r0 = r17
            r4 = r22
            c(r0, r1, r2, r3, r4, r5, r6, r7)
        L61:
            return
    }

    public static final void c(java.lang.String r6, android.content.Context r7, java.util.ArrayList r8, gg.t r9, java.util.concurrent.atomic.AtomicBoolean r10, fg.l r11, gg.u r12, gg.u r13) {
            boolean r0 = og.m.t0(r6)
            if (r0 != 0) goto Ld
            java.lang.String r7 = "所选 TTS 引擎初始化失败："
            java.lang.String r6 = r7.concat(r6)
            goto L1e
        Ld:
            nb.c r6 = nb.c.f9211a
            java.util.List r6 = r6.b(r7)
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L1c
            java.lang.String r6 = "系统默认 TTS 初始化失败，未发现其它可用引擎"
            goto L1e
        L1c:
            java.lang.String r6 = "系统默认及其它可用 TTS 引擎均初始化失败"
        L1e:
            r7 = 3
            java.util.List r0 = tf.m.M1(r7, r8)
            r4 = 0
            r5 = 62
            java.lang.String r1 = "；"
            r2 = 0
            r3 = 0
            java.lang.String r7 = tf.m.A1(r0, r1, r2, r3, r4, r5)
            nb.g0 r0 = new nb.g0
            boolean r8 = og.m.t0(r7)
            if (r8 == 0) goto L38
        L36:
            r2 = r6
            goto L41
        L38:
            java.lang.String r8 = "（"
            java.lang.String r1 = "）"
            java.lang.String r6 = wb.en.i(r6, r8, r7, r1)
            goto L36
        L41:
            r4 = 0
            r5 = 12
            tf.t r1 = tf.t.f13167g
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            long r6 = r9.f4563g
            r1 = 1
            long r6 = r6 + r1
            r9.f4563g = r6
            d(r12, r13)
            boolean r6 = r10.get()
            if (r6 != 0) goto L5d
            r11.invoke(r0)
        L5d:
            return
    }

    public static final void d(gg.u r2, gg.u r3) {
            java.lang.Object r0 = r2.f4564g
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto Lb
            android.os.Handler r1 = nb.f0.f9261a
            r1.removeCallbacks(r0)
        Lb:
            r0 = 0
            r2.f4564g = r0
            java.lang.Object r2 = r3.f4564g
            android.speech.tts.TextToSpeech r2 = (android.speech.tts.TextToSpeech) r2
            r3.f4564g = r0
            if (r2 == 0) goto L19
            r2.shutdown()     // Catch: java.lang.Throwable -> L19
        L19:
            return
    }

    public static java.util.ArrayList e(android.speech.tts.TextToSpeech r10) {
            java.util.Set r10 = r10.getVoices()
            if (r10 != 0) goto L8
            tf.v r10 = tf.v.f13169g
        L8:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            dg.n r0 = new dg.n
            r1 = 6
            r0.<init>(r10, r1)
            i2.z r10 = new i2.z
            r1 = 26
            r10.<init>(r1)
            ng.i r1 = new ng.i
            r2 = 1
            r1.<init>(r0, r2, r10)
            i2.z r10 = new i2.z
            r0 = 27
            r10.<init>(r0)
            ng.b r0 = new ng.b
            java.util.Iterator r1 = r1.iterator()
            r0.<init>(r1, r10)
            boolean r10 = r0.hasNext()
            if (r10 != 0) goto L36
            tf.t r10 = tf.t.f13167g
            goto L5c
        L36:
            java.lang.Object r10 = r0.next()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L45
            java.util.List r10 = a.a.x0(r10)
            goto L5c
        L45:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r10)
        L4d:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L5b
            java.lang.Object r10 = r0.next()
            r1.add(r10)
            goto L4d
        L5b:
            r10 = r1
        L5c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r10.iterator()
        L65:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L8d
            java.lang.Object r2 = r1.next()
            r4 = r2
            android.speech.tts.Voice r4 = (android.speech.tts.Voice) r4
            java.util.Locale r4 = r4.getLocale()
            if (r4 == 0) goto L7d
            java.lang.String r3 = r4.getLanguage()
        L7d:
            java.util.Locale r4 = java.util.Locale.CHINESE
            java.lang.String r4 = r4.getLanguage()
            boolean r3 = og.t.X(r3, r4)
            if (r3 == 0) goto L65
            r0.add(r2)
            goto L65
        L8d:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L94
            goto L95
        L94:
            r10 = r0
        L95:
            b8.c r0 = new b8.c
            r1 = 8
            r0.<init>(r1)
            java.util.List r10 = tf.m.K1(r10, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r10)
            r0.<init>(r1)
            java.util.Iterator r10 = r10.iterator()
        Lad:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L148
            java.lang.Object r1 = r10.next()
            android.speech.tts.Voice r1 = (android.speech.tts.Voice) r1
            java.util.Locale r2 = r1.getLocale()
            if (r2 == 0) goto Lc6
            java.util.Locale r4 = java.util.Locale.SIMPLIFIED_CHINESE
            java.lang.String r2 = r2.getDisplayName(r4)
            goto Lc7
        Lc6:
            r2 = r3
        Lc7:
            java.lang.String r4 = ""
            if (r2 != 0) goto Lcc
            r2 = r4
        Lcc:
            boolean r5 = og.m.t0(r2)
            if (r5 == 0) goto Le3
            java.util.Locale r2 = r1.getLocale()
            if (r2 == 0) goto Ldd
            java.lang.String r2 = r2.toLanguageTag()
            goto Lde
        Ldd:
            r2 = r3
        Lde:
            if (r2 != 0) goto Le1
            goto Le2
        Le1:
            r4 = r2
        Le2:
            r2 = r4
        Le3:
            boolean r4 = r1.isNetworkConnectionRequired()
            if (r4 == 0) goto Lec
            java.lang.String r4 = "联网"
            goto Lee
        Lec:
            java.lang.String r4 = "本地"
        Lee:
            java.lang.String[] r2 = new java.lang.String[]{r2, r4}
            java.util.List r2 = a.a.y0(r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        Lff:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L116
            java.lang.Object r5 = r2.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = og.m.t0(r6)
            if (r6 != 0) goto Lff
            r4.add(r5)
            goto Lff
        L116:
            r8 = 0
            r9 = 62
            java.lang.String r5 = " · "
            r6 = 0
            r7 = 0
            java.lang.String r2 = tf.m.A1(r4, r5, r6, r7, r8, r9)
            nb.h0 r4 = new nb.h0
            java.lang.String r5 = r1.getName()
            r5.getClass()
            int r6 = r2.length()
            java.lang.String r1 = r1.getName()
            if (r6 != 0) goto L135
            goto L13d
        L135:
            java.lang.String r6 = "（"
            java.lang.String r7 = "）"
            java.lang.String r1 = wb.en.i(r1, r6, r2, r7)
        L13d:
            r1.getClass()
            r4.<init>(r5, r1)
            r0.add(r4)
            goto Lad
        L148:
            return r0
    }
}
