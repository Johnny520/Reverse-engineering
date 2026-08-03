package f0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2945i;

    public /* synthetic */ d(int r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f2943g = r2
            r0.f2945i = r3
            r0.f2944h = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            int r0 = r7.f2943g
            r1 = 0
            r2 = 0
            r3 = 1
            int r4 = r7.f2944h
            java.lang.Object r5 = r7.f2945i
            switch(r0) {
                case 0: goto L165;
                case 1: goto Lf5;
                case 2: goto Lef;
                case 3: goto L4b;
                default: goto Lc;
            }
        Lc:
            ua.k r5 = (ua.k) r5
            if (r4 != 0) goto L11
            r2 = r3
        L11:
            r5.f13666h = r2
            java.util.ArrayDeque r0 = r5.f13667i
            if (r2 != 0) goto L2e
            ia.t r2 = r5.f13660b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "自动收款播报初始化失败: "
            r3.<init>(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.invoke(r3, r1)
            r0.clear()
            goto L4a
        L2e:
            android.speech.tts.TextToSpeech r1 = r5.f13665g
            if (r1 == 0) goto L37
            java.util.Locale r2 = java.util.Locale.CHINA
            r1.setLanguage(r2)
        L37:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L4a
            java.lang.Object r1 = r0.removeFirst()
            r1.getClass()
            java.lang.String r1 = (java.lang.String) r1
            r5.d(r1)
            goto L37
        L4a:
            return
        L4b:
            ra.c r5 = (ra.c) r5
            java.lang.Object r0 = r5.f11838e
            na.b r0 = (na.b) r0
            r5.f11835b = r2
            if (r4 != 0) goto Lcb
            java.lang.Object r6 = r5.f11843j
            android.speech.tts.TextToSpeech r6 = (android.speech.tts.TextToSpeech) r6
            if (r6 != 0) goto L5c
            goto Lcb
        L5c:
            r5.f11834a = r3
            java.lang.String r1 = "ERROR 红包播报中文语音不可用: "
            java.util.Locale r2 = java.util.Locale.CHINA     // Catch: java.lang.Throwable -> L7e
            int r2 = r6.setLanguage(r2)     // Catch: java.lang.Throwable -> L7e
            r4 = -1
            if (r2 == r4) goto L6c
            r4 = -2
            if (r2 != r4) goto L96
        L6c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7e
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L7e
            r4.append(r2)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L96
            r0.a(r1)     // Catch: java.lang.Throwable -> L7e
            goto L96
        L7e:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "ERROR 红包播报语言设置失败: "
            r2.<init>(r4)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r0 == 0) goto L96
            r0.a(r1)
        L96:
            java.lang.Object r1 = r5.f11843j     // Catch: java.lang.Throwable -> Laf
            android.speech.tts.TextToSpeech r1 = (android.speech.tts.TextToSpeech) r1     // Catch: java.lang.Throwable -> Laf
            android.media.AudioAttributes$Builder r2 = new android.media.AudioAttributes$Builder     // Catch: java.lang.Throwable -> Laf
            r2.<init>()     // Catch: java.lang.Throwable -> Laf
            android.media.AudioAttributes$Builder r2 = r2.setUsage(r3)     // Catch: java.lang.Throwable -> Laf
            android.media.AudioAttributes$Builder r2 = r2.setContentType(r3)     // Catch: java.lang.Throwable -> Laf
            android.media.AudioAttributes r2 = r2.build()     // Catch: java.lang.Throwable -> Laf
            r1.setAudioAttributes(r2)     // Catch: java.lang.Throwable -> Laf
            goto Lc7
        Laf:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "ERROR 红包播报音频通道设置失败: "
            r2.<init>(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r0 == 0) goto Lc7
            r0.a(r1)
        Lc7:
            r5.e()
            goto Lee
        Lcb:
            java.lang.Object r0 = r5.f11843j     // Catch: java.lang.Throwable -> Ld4
            android.speech.tts.TextToSpeech r0 = (android.speech.tts.TextToSpeech) r0     // Catch: java.lang.Throwable -> Ld4
            if (r0 == 0) goto Ld4
            r0.shutdown()     // Catch: java.lang.Throwable -> Ld4
        Ld4:
            r5.f11843j = r1
            r5.f11834a = r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "红包播报初始化失败: status="
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r5.k(r0, r1)
            java.lang.String r0 = "初始化失败"
            r5.q(r0)
        Lee:
            return
        Lef:
            android.widget.EditText r5 = (android.widget.EditText) r5
            r5.scrollTo(r2, r4)
            return
        Lf5:
            nb.w r5 = (nb.w) r5
            og.k r0 = nb.w.A
            nb.z r0 = r5.y()
            java.lang.String r2 = "text_speech_enable"
            boolean r2 = r0.b(r2)
            if (r2 == 0) goto L161
            java.lang.String r2 = "text_speech_volume_control"
            boolean r0 = r0.b(r2)
            if (r0 == 0) goto L161
            nb.l r0 = r5.f9325o
            if (r0 != 0) goto L112
            goto L161
        L112:
            if (r4 >= 0) goto L11c
            boolean r0 = r5.f9328r
            if (r0 == 0) goto L11c
            r5.z()
            goto L164
        L11c:
            if (r4 >= 0) goto L122
            r5.m()
            goto L164
        L122:
            if (r4 <= 0) goto L12c
            boolean r0 = r5.f9328r
            if (r0 == 0) goto L12c
            r5.u()
            goto L164
        L12c:
            if (r4 <= 0) goto L164
            android.content.Context r0 = r5.f9311a
            java.lang.String r2 = "audio"
            java.lang.Object r0 = r0.getSystemService(r2)
            boolean r2 = r0 instanceof android.media.AudioManager
            if (r2 == 0) goto L13d
            r1 = r0
            android.media.AudioManager r1 = (android.media.AudioManager) r1
        L13d:
            if (r1 == 0) goto L164
            r0 = 3
            int r2 = r1.getStreamMaxVolume(r0)
            if (r2 >= r3) goto L147
            r2 = r3
        L147:
            int r4 = r1.getStreamVolume(r0)
            int r4 = r4 + r3
            if (r4 <= r2) goto L14f
            goto L150
        L14f:
            r2 = r4
        L150:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L164
            r5.f9334x = r4     // Catch: java.lang.Throwable -> L164
            r1.setStreamVolume(r0, r2, r3)     // Catch: java.lang.Throwable -> L164
            nb.q r0 = r5.f9332v     // Catch: java.lang.Throwable -> L164
            if (r0 == 0) goto L164
            r0.setCurrentVolume(r2)     // Catch: java.lang.Throwable -> L164
            goto L164
        L161:
            r5.o()
        L164:
            return
        L165:
            java.util.function.IntConsumer r5 = (java.util.function.IntConsumer) r5
            r5.accept(r4)
            return
    }
}
