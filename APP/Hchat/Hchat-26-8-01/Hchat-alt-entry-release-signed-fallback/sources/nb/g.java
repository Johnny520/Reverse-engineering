package nb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nb.w f9263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f9264i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f9265j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f9266k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f9267l;

    public /* synthetic */ g(nb.w r2, long r3, java.lang.String r5, java.lang.String r6, int r7) {
            r1 = this;
            r0 = 0
            r1.f9262g = r0
            r1.<init>()
            r1.f9263h = r2
            r1.f9264i = r3
            r1.f9266k = r5
            r1.f9267l = r6
            r1.f9265j = r7
            return
    }

    public /* synthetic */ g(nb.w r2, nb.k r3, long r4, nb.m r6, int r7) {
            r1 = this;
            r0 = 1
            r1.f9262g = r0
            r1.<init>()
            r1.f9263h = r2
            r1.f9266k = r3
            r1.f9264i = r4
            r1.f9267l = r6
            r1.f9265j = r7
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r9 = this;
            int r0 = r9.f9262g
            switch(r0) {
                case 0: goto L7f;
                default: goto L5;
            }
        L5:
            nb.w r2 = r9.f9263h
            java.lang.Object r0 = r9.f9266k
            r3 = r0
            nb.k r3 = (nb.k) r3
            long r4 = r9.f9264i
            java.lang.Object r0 = r9.f9267l
            nb.m r0 = (nb.m) r0
            int r1 = r9.f9265j
            boolean r6 = r2.f(r3, r4)
            if (r6 != 0) goto L1b
            goto L7e
        L1b:
            if (r0 == 0) goto L43
            java.util.concurrent.ConcurrentHashMap$KeySetView r1 = r2.f9314d
            java.lang.String r3 = r3.f9285a
            r1.remove(r3)
            nb.o r1 = new nb.o
            java.lang.String r3 = r0.f9295a
            int r0 = r0.f9296b
            r1.<init>(r3, r0)
            nb.z r0 = r2.y()
            java.lang.String r3 = "text_speech_enable"
            boolean r0 = r0.b(r3)
            if (r0 != 0) goto L3a
            goto L7e
        L3a:
            java.util.ArrayDeque r0 = r2.f9313c
            r0.addLast(r1)
            r2.n()
            goto L7e
        L43:
            int r6 = r1 + 1
            r0 = 120(0x78, float:1.68E-43)
            if (r6 >= r0) goto L56
            android.os.Handler r0 = r2.f9312b
            nb.h r1 = new nb.h
            r1.<init>(r2, r3, r4, r6)
            r2 = 500(0x1f4, double:2.47E-321)
            r0.postDelayed(r1, r2)
            goto L7e
        L56:
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = r2.f9314d
            java.lang.String r1 = r3.f9285a
            r0.remove(r1)
            java.lang.String r0 = r3.f9286b
            long r1 = r3.f9287c
            long r4 = r3.f9288d
            java.lang.String r3 = r3.f9294j
            java.lang.String r6 = "[Hchat:TextSpeech] 等待语音文件超时: talker="
            java.lang.String r7 = " msgId="
            java.lang.StringBuilder r0 = eh.a.v(r6, r0, r7, r1)
            java.lang.String r1 = " msgSvrId="
            java.lang.String r2 = " "
            j8.b.s(r0, r1, r4, r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            fb.v0.m(r0)
        L7e:
            return
        L7f:
            nb.w r1 = r9.f9263h
            android.os.Handler r2 = r1.f9312b
            long r3 = r9.f9264i
            java.lang.Object r0 = r9.f9266k
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r5 = r9.f9267l
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r9.f9265j
            long r7 = r1.f9319i
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 == 0) goto L97
            goto L23f
        L97:
            ca.r r3 = r1.f9320j
            if (r3 == 0) goto L9e
            r2.removeCallbacks(r3)
        L9e:
            r3 = 0
            r1.f9320j = r3
            r4 = 0
            r1.f9318h = r4
            nb.z r7 = r1.y()
            java.lang.String r8 = "text_speech_enable"
            boolean r7 = r7.b(r8)
            if (r7 != 0) goto Lb5
            r1.w()
            goto L23f
        Lb5:
            nb.z r7 = r1.y()
            java.lang.String r7 = r7.c()
            boolean r0 = gg.l.a(r0, r7)
            if (r0 != 0) goto Lc8
            r1.t()
            goto L23f
        Lc8:
            if (r6 != 0) goto L23c
            android.speech.tts.TextToSpeech r0 = r1.f9316f
            if (r0 != 0) goto Ld0
            goto L23c
        Ld0:
            java.lang.String r6 = "mCurrentEngine"
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r0, r6)
            boolean r6 = r0 instanceof java.lang.String
            if (r6 == 0) goto Ldd
            java.lang.String r0 = (java.lang.String) r0
            goto Lde
        Ldd:
            r0 = r3
        Lde:
            boolean r6 = og.m.t0(r5)
            if (r6 != 0) goto L105
            if (r0 == 0) goto L105
            boolean r6 = og.m.t0(r0)
            if (r6 == 0) goto Led
            goto L105
        Led:
            boolean r6 = r0.equals(r5)
            if (r6 != 0) goto L105
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "引擎 "
            java.lang.String r4 = " 连接失败，系统回退到 "
            java.lang.String r0 = bc.e.j(r3, r5, r4, r0)
            r2.<init>(r0)
            r1.v(r2)
            goto L23f
        L105:
            r1.f9321k = r4
            android.speech.tts.TextToSpeech r4 = r1.f9316f
            r5 = 1
            if (r4 == 0) goto L1ed
            java.util.Locale r0 = java.util.Locale.CHINA     // Catch: java.lang.Throwable -> L117
            int r0 = r4.setLanguage(r0)     // Catch: java.lang.Throwable -> L117
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L117
            goto L11e
        L117:
            r0 = move-exception
            sf.f r6 = new sf.f
            r6.<init>(r0)
            r0 = r6
        L11e:
            java.lang.Throwable r6 = sf.g.b(r0)
            if (r6 != 0) goto L1e1
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r6 = -2
            if (r0 == r6) goto L1de
            r6 = -1
            if (r0 == r6) goto L1de
            nb.z r0 = r1.y()
            java.lang.String r6 = "text_speech_tts_voice"
            java.lang.String r7 = ""
            java.lang.String r0 = r0.d(r6, r7)
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r6 = r0.toString()
            boolean r0 = og.m.t0(r6)
            if (r0 != 0) goto L1c1
            java.util.Set r0 = r4.getVoices()     // Catch: java.lang.Throwable -> L153
            if (r0 != 0) goto L155
            tf.v r0 = tf.v.f13169g     // Catch: java.lang.Throwable -> L153
            goto L155
        L153:
            r0 = move-exception
            goto L177
        L155:
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L153
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L153
        L15b:
            boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L153
            if (r7 == 0) goto L173
            java.lang.Object r7 = r0.next()     // Catch: java.lang.Throwable -> L153
            r8 = r7
            android.speech.tts.Voice r8 = (android.speech.tts.Voice) r8     // Catch: java.lang.Throwable -> L153
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Throwable -> L153
            boolean r8 = gg.l.a(r8, r6)     // Catch: java.lang.Throwable -> L153
            if (r8 == 0) goto L15b
            goto L174
        L173:
            r7 = r3
        L174:
            android.speech.tts.Voice r7 = (android.speech.tts.Voice) r7     // Catch: java.lang.Throwable -> L153
            goto L17c
        L177:
            sf.f r7 = new sf.f
            r7.<init>(r0)
        L17c:
            boolean r0 = r7 instanceof sf.f
            if (r0 == 0) goto L181
            r7 = r3
        L181:
            android.speech.tts.Voice r7 = (android.speech.tts.Voice) r7
            if (r7 == 0) goto L1ba
            int r0 = r4.setVoice(r7)     // Catch: java.lang.Throwable -> L18e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L18e
            goto L195
        L18e:
            r0 = move-exception
            sf.f r7 = new sf.f
            r7.<init>(r0)
            r0 = r7
        L195:
            java.lang.Throwable r7 = sf.g.b(r0)
            java.lang.String r8 = "所选播报角色设置失败: "
            if (r7 != 0) goto L1aa
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L1c1
            java.lang.String r3 = r8.concat(r6)
            goto L1ef
        L1aa:
            java.lang.String r0 = r7.getMessage()
            java.lang.String r3 = "[Hchat:TextSpeech] 设置播报角色失败: voice="
            java.lang.String r4 = ", error="
            eh.a.w(r3, r6, r4, r0, r7)
            java.lang.String r3 = r8.concat(r6)
            goto L1ef
        L1ba:
            java.lang.String r0 = "所选播报角色已不可用: "
            java.lang.String r3 = r0.concat(r6)
            goto L1ef
        L1c1:
            android.media.AudioAttributes$Builder r0 = new android.media.AudioAttributes$Builder     // Catch: java.lang.Throwable -> L1d5
            r0.<init>()     // Catch: java.lang.Throwable -> L1d5
            android.media.AudioAttributes$Builder r0 = r0.setUsage(r5)     // Catch: java.lang.Throwable -> L1d5
            android.media.AudioAttributes$Builder r0 = r0.setContentType(r5)     // Catch: java.lang.Throwable -> L1d5
            android.media.AudioAttributes r0 = r0.build()     // Catch: java.lang.Throwable -> L1d5
            r4.setAudioAttributes(r0)     // Catch: java.lang.Throwable -> L1d5
        L1d5:
            nb.r r0 = new nb.r
            r0.<init>(r1)
            r4.setOnUtteranceProgressListener(r0)
            goto L1ef
        L1de:
            java.lang.String r3 = "所选文字转语音引擎缺少中文语音数据或不支持中文"
            goto L1ef
        L1e1:
            java.lang.String r0 = r6.getMessage()
            java.lang.String r3 = "[Hchat:TextSpeech] 设置中文语音失败: "
            eh.a.x(r3, r0, r6)
            java.lang.String r3 = "所选文字转语音引擎设置中文语音失败"
            goto L1ef
        L1ed:
            java.lang.String r3 = "文字转语音引擎未初始化"
        L1ef:
            if (r3 == 0) goto L236
            r1.w()
            boolean r0 = r1.e()
            if (r0 == 0) goto L206
            nb.e r0 = new nb.e
            r3 = 3
            r0.<init>(r1, r3)
            r3 = 800(0x320, double:3.953E-321)
            r2.postDelayed(r0, r3)
            goto L23f
        L206:
            nb.z r0 = r1.y()
            java.lang.String r0 = r0.c()
            boolean r2 = og.m.t0(r0)
            if (r2 == 0) goto L216
            java.lang.String r0 = "系统默认"
        L216:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "[Hchat:TextSpeech] "
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r3 = ", engine="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            fb.v0.m(r0)
            r1.p()
            r1.i()
            goto L23f
        L236:
            r1.f9317g = r5
            r1.n()
            goto L23f
        L23c:
            r1.v(r3)
        L23f:
            return
    }
}
