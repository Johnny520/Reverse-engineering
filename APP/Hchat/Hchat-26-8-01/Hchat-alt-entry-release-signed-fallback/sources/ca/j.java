package ca;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1517h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1518i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1519j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1520k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1521l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1522m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1523n;

    public /* synthetic */ j(java.lang.Object r1, java.lang.Object r2, java.io.Serializable r3, java.io.Serializable r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, int r8) {
            r0 = this;
            r0.f1516g = r8
            r0.f1521l = r1
            r0.f1522m = r2
            r0.f1517h = r3
            r0.f1518i = r4
            r0.f1519j = r5
            r0.f1520k = r6
            r0.f1523n = r7
            r0.<init>()
            return
    }

    public /* synthetic */ j(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, fg.l r5, java.lang.String r6, java.util.List r7, int r8) {
            r0 = this;
            r0.f1516g = r8
            r0.f1521l = r1
            r0.f1522m = r2
            r0.f1517h = r3
            r0.f1518i = r4
            r0.f1523n = r5
            r0.f1519j = r6
            r0.f1520k = r7
            r0.<init>()
            return
    }

    public /* synthetic */ j(java.util.concurrent.atomic.AtomicBoolean r2, java.util.concurrent.atomic.AtomicBoolean r3, android.content.Context r4, java.lang.String r5, okhttp3.WebSocket r6, java.lang.String r7, x8.t r8) {
            r1 = this;
            r0 = 7
            r1.f1516g = r0
            r1.<init>()
            r1.f1517h = r2
            r1.f1518i = r3
            r1.f1521l = r4
            r1.f1522m = r5
            r1.f1519j = r6
            r1.f1520k = r7
            r1.f1523n = r8
            return
    }

    public /* synthetic */ j(java.util.concurrent.atomic.AtomicBoolean r2, java.util.concurrent.atomic.AtomicBoolean r3, wb.kv r4, android.app.Activity r5, java.lang.Object r6, ca.l r7, ca.e0 r8) {
            r1 = this;
            r0 = 1
            r1.f1516g = r0
            r1.<init>()
            r1.f1517h = r2
            r1.f1518i = r3
            r1.f1519j = r4
            r1.f1520k = r5
            r1.f1522m = r6
            r1.f1523n = r7
            r1.f1521l = r8
            return
    }

    public /* synthetic */ j(java.util.concurrent.atomic.AtomicBoolean r2, java.util.concurrent.atomic.AtomicBoolean r3, wb.kv r4, android.app.Activity r5, java.lang.Object r6, hb.x r7, hb.i0 r8) {
            r1 = this;
            r0 = 3
            r1.f1516g = r0
            r1.<init>()
            r1.f1517h = r2
            r1.f1518i = r3
            r1.f1519j = r4
            r1.f1520k = r5
            r1.f1521l = r6
            r1.f1522m = r7
            r1.f1523n = r8
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r21 = this;
            r1 = r21
            int r0 = r1.f1516g
            r2 = 0
            r3 = 1
            java.lang.Object r4 = r1.f1522m
            java.lang.Object r5 = r1.f1521l
            java.lang.Object r6 = r1.f1523n
            java.lang.Object r7 = r1.f1520k
            java.lang.Object r8 = r1.f1519j
            java.lang.Object r9 = r1.f1518i
            java.lang.Object r10 = r1.f1517h
            switch(r0) {
                case 0: goto L2f5;
                case 1: goto L2c1;
                case 2: goto L2a6;
                case 3: goto L25f;
                case 4: goto L215;
                case 5: goto L156;
                case 6: goto L11e;
                default: goto L17;
            }
        L17:
            java.util.concurrent.atomic.AtomicBoolean r10 = (java.util.concurrent.atomic.AtomicBoolean) r10
            java.util.concurrent.atomic.AtomicBoolean r9 = (java.util.concurrent.atomic.AtomicBoolean) r9
            android.content.Context r5 = (android.content.Context) r5
            java.lang.String r4 = (java.lang.String) r4
            okhttp3.WebSocket r8 = (okhttp3.WebSocket) r8
            java.lang.String r7 = (java.lang.String) r7
            x8.t r6 = (x8.t) r6
            java.util.concurrent.ExecutorService r0 = x8.q.f21329a
            boolean r0 = r10.get()
            if (r0 != 0) goto L11d
            boolean r0 = r9.get()
            if (r0 == 0) goto L35
            goto L11d
        L35:
            tf.t r2 = tf.t.f13167g
            java.lang.String r3 = "[Hchat:AutoReply] 小智AI文本转音频失败: "
            java.lang.String r0 = "[Hchat:AutoReply] 小智AI输入PCM为空: wavLen="
            java.lang.String r9 = "[Hchat:AutoReply] 小智AI文本转WAV失败: questionLen="
            java.io.File r10 = new java.io.File
            java.io.File r11 = r5.getCacheDir()
            java.lang.String r12 = "hchat_xiaozhi_question"
            r10.<init>(r11, r12)
            r10.mkdirs()
            java.lang.String r11 = "question_"
            java.lang.String r12 = ".wav"
            java.io.File r10 = java.io.File.createTempFile(r11, r12, r10)
            android.content.Context r5 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L7a
            r5.getClass()     // Catch: java.lang.Throwable -> L7a
            r10.getClass()     // Catch: java.lang.Throwable -> L7a
            boolean r5 = x8.q.Q(r5, r4, r10)     // Catch: java.lang.Throwable -> L7a
            if (r5 != 0) goto L7c
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L7a
            r5.append(r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L7a
            fb.v0.m(r0)     // Catch: java.lang.Throwable -> L7a
        L76:
            r10.delete()     // Catch: java.lang.Throwable -> Lbc
            goto Lbc
        L7a:
            r0 = move-exception
            goto La8
        L7c:
            byte[] r5 = x8.q.S(r10)     // Catch: java.lang.Throwable -> L7a
            int r9 = r5.length     // Catch: java.lang.Throwable -> L7a
            if (r9 != 0) goto La3
            long r11 = r10.length()     // Catch: java.lang.Throwable -> L7a
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L7a
            r9.append(r11)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = " questionLen="
            r9.append(r0)     // Catch: java.lang.Throwable -> L7a
            r9.append(r5)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = r9.toString()     // Catch: java.lang.Throwable -> L7a
            fb.v0.m(r0)     // Catch: java.lang.Throwable -> L7a
            goto L76
        La3:
            java.util.List r2 = x8.q.j(r5)     // Catch: java.lang.Throwable -> L7a
            goto L76
        La8:
            java.lang.String r5 = r0.getMessage()     // Catch: java.lang.Throwable -> L118
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L118
            r9.<init>(r3)     // Catch: java.lang.Throwable -> L118
            r9.append(r5)     // Catch: java.lang.Throwable -> L118
            java.lang.String r3 = r9.toString()     // Catch: java.lang.Throwable -> L118
            fb.v0.n(r3, r0)     // Catch: java.lang.Throwable -> L118
            goto L76
        Lbc:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Ld8
            int r0 = r4.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[Hchat:AutoReply] 小智AI长文本输入音频为空: questionLen="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            fb.v0.m(r0)
            goto L11d
        Ld8:
            java.lang.String r0 = "start"
            org.json.JSONObject r0 = x8.q.Y(r7, r0, r6)
            java.lang.String r0 = r0.toString()
            r0.getClass()
            r8.send(r0)
            java.util.Iterator r0 = r2.iterator()
        Lec:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L107
            java.lang.Object r2 = r0.next()
            byte[] r2 = (byte[]) r2
            okio.ByteString$Companion r3 = okio.ByteString.Companion
            int r4 = r2.length
            byte[] r2 = java.util.Arrays.copyOf(r2, r4)
            okio.ByteString r2 = r3.of(r2)
            r8.send(r2)
            goto Lec
        L107:
            java.lang.String r0 = "stop"
            org.json.JSONObject r0 = x8.q.Y(r7, r0, r6)
            java.lang.String r0 = r0.toString()
            r0.getClass()
            r8.send(r0)
            goto L11d
        L118:
            r0 = move-exception
            r10.delete()     // Catch: java.lang.Throwable -> L11c
        L11c:
            throw r0
        L11d:
            return
        L11e:
            java.util.List r5 = (java.util.List) r5
            r14 = r4
            android.content.Context r14 = (android.content.Context) r14
            r12 = r10
            wb.yt r12 = (wb.yt) r12
            r13 = r9
            java.util.List r13 = (java.util.List) r13
            r16 = r6
            fg.l r16 = (fg.l) r16
            r17 = r8
            java.lang.String r17 = (java.lang.String) r17
            r18 = r7
            java.util.List r18 = (java.util.List) r18
            java.lang.String r0 = r9.e0.f0(r14, r5)     // Catch: java.lang.Throwable -> L13b
            r15 = r0
            goto L142
        L13b:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r15 = r2
        L142:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            ca.j r11 = new ca.j
            r19 = 5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r0.post(r11)
            return
        L156:
            wb.yt r5 = (wb.yt) r5
            java.util.List r4 = (java.util.List) r4
            r14 = r10
            android.content.Context r14 = (android.content.Context) r14
            java.io.Serializable r9 = (java.io.Serializable) r9
            fg.l r6 = (fg.l) r6
            java.lang.String r8 = (java.lang.String) r8
            r15 = r7
            java.util.List r15 = (java.util.List) r15
            i0.j1 r0 = r5.f20476d
            i0.j1 r3 = r5.A
            java.lang.Object r0 = r0.getValue()
            if (r0 == r4) goto L180
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.setValue(r0)
            java.lang.String r0 = "会话内容已变化，请重试"
            android.widget.Toast r0 = android.widget.Toast.makeText(r14, r0, r2)
            r0.show()
            goto L214
        L180:
            java.lang.Throwable r0 = sf.g.b(r9)
            java.lang.String r4 = "失败，请重试"
            java.lang.String r7 = "[Hchat:ScriptAgent] "
            if (r0 != 0) goto L1f0
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.setValue(r0)
            java.lang.Object r0 = r6.invoke(r9)     // Catch: java.lang.Throwable -> L19b
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L19b
            r0.getClass()     // Catch: java.lang.Throwable -> L19b
            goto L1a2
        L19b:
            r0 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r0)
            r0 = r3
        L1a2:
            java.lang.Throwable r3 = sf.g.b(r0)
            if (r3 == 0) goto L1c7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r7)
            r6.append(r8)
            java.lang.String r7 = "失败"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            fb.v0.n(r6, r3)
            java.lang.String r3 = r8.concat(r4)
            android.widget.Toast r2 = android.widget.Toast.makeText(r14, r3, r2)
            r2.show()
        L1c7:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r3 = r0 instanceof sf.f
            if (r3 == 0) goto L1ce
            r0 = r2
        L1ce:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L214
            fb.d1 r12 = wb.yt.N(r5)
            java.lang.String r13 = r5.f20473a
            java.lang.Thread r0 = new java.lang.Thread
            ca.x r11 = new ca.x
            r17 = 19
            r16 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17)
            java.lang.String r2 = "Hchat-Agent-History-Save"
            r0.<init>(r11, r2)
            r0.start()
            goto L214
        L1f0:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r3.setValue(r5)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r7)
            r3.append(r8)
            java.lang.String r5 = "重建历史失败"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            fb.v0.n(r3, r0)
            java.lang.String r0 = r8.concat(r4)
            android.widget.Toast r0 = android.widget.Toast.makeText(r14, r0, r2)
            r0.show()
        L214:
            return
        L215:
            android.os.Handler r5 = (android.os.Handler) r5
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r10 = (java.lang.String) r10
            r13 = r9
            java.lang.String r13 = (java.lang.String) r13
            r14 = r8
            i0.a1 r14 = (i0.a1) r14
            r15 = r7
            android.content.Context r15 = (android.content.Context) r15
            r16 = r6
            i0.a1 r16 = (i0.a1) r16
            j8.p r0 = h.Hchat.hooks.api.core.WeChatApis.media()     // Catch: java.lang.Throwable -> L23a
            if (r0 == 0) goto L23c
            j8.y r0 = r0.f6816b     // Catch: java.lang.Throwable -> L23a
            if (r0 == 0) goto L23c
            boolean r0 = r0.t(r4, r10)     // Catch: java.lang.Throwable -> L23a
            if (r0 != r3) goto L23c
            r2 = r3
            goto L23c
        L23a:
            r0 = move-exception
            goto L241
        L23c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L23a
            goto L247
        L241:
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L247:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r3 = r0 instanceof sf.f
            if (r3 == 0) goto L24e
            r0 = r2
        L24e:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r12 = r0.booleanValue()
            ia.l r11 = new ia.l
            r17 = 2
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r5.post(r11)
            return
        L25f:
            r13 = r10
            java.util.concurrent.atomic.AtomicBoolean r13 = (java.util.concurrent.atomic.AtomicBoolean) r13
            java.util.concurrent.atomic.AtomicBoolean r9 = (java.util.concurrent.atomic.AtomicBoolean) r9
            wb.kv r8 = (wb.kv) r8
            r14 = r7
            android.app.Activity r14 = (android.app.Activity) r14
            r16 = r4
            hb.x r16 = (hb.x) r16
            r17 = r6
            hb.i0 r17 = (hb.i0) r17
            boolean r0 = r13.get()
            if (r0 == 0) goto L278
            goto L2a5
        L278:
            r9.set(r3)
            r8.close()
            android.view.Window r0 = r14.getWindow()
            if (r0 == 0) goto L289
            android.view.View r0 = r0.getDecorView()
            goto L28a
        L289:
            r0 = 0
        L28a:
            boolean r2 = r14.isFinishing()
            if (r2 != 0) goto L2a5
            boolean r2 = r14.isDestroyed()
            if (r2 != 0) goto L2a5
            if (r0 != 0) goto L299
            goto L2a5
        L299:
            ca.x r12 = new ca.x
            r18 = 6
            java.lang.Object r15 = r1.f1521l
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r0.postOnAnimation(r12)
        L2a5:
            return
        L2a6:
            r2 = r5
            p8.d0 r2 = (p8.d0) r2
            r3 = r4
            java.lang.String r3 = (java.lang.String) r3
            r4 = r10
            java.util.concurrent.atomic.AtomicBoolean r4 = (java.util.concurrent.atomic.AtomicBoolean) r4
            r5 = r9
            java.lang.String r5 = (java.lang.String) r5
            bsh.Interpreter r8 = (bsh.Interpreter) r8
            java.lang.String r7 = (java.lang.String) r7
            java.util.function.Consumer r6 = (java.util.function.Consumer) r6
            r20 = r8
            r8 = r6
            r6 = r20
            h.Hchat.hooks.items.script.ScriptPluginRuntime.s(r2, r3, r4, r5, r6, r7, r8)
            return
        L2c1:
            java.util.concurrent.atomic.AtomicBoolean r10 = (java.util.concurrent.atomic.AtomicBoolean) r10
            java.util.concurrent.atomic.AtomicBoolean r9 = (java.util.concurrent.atomic.AtomicBoolean) r9
            wb.kv r8 = (wb.kv) r8
            r11 = r7
            android.app.Activity r11 = (android.app.Activity) r11
            r13 = r6
            ca.l r13 = (ca.l) r13
            r14 = r5
            ca.e0 r14 = (ca.e0) r14
            boolean r0 = r10.get()
            if (r0 == 0) goto L2d7
            goto L2f4
        L2d7:
            r9.set(r3)
            r8.close()
            android.view.Window r0 = r11.getWindow()
            if (r0 == 0) goto L2f4
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L2f4
            ca.x r9 = new ca.x
            r15 = 0
            java.lang.Object r12 = r1.f1522m
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0.postOnAnimation(r9)
        L2f4:
            return
        L2f5:
            ca.e0 r5 = (ca.e0) r5
            p8.v r4 = (p8.v) r4
            r11 = r10
            java.util.concurrent.atomic.AtomicBoolean r11 = (java.util.concurrent.atomic.AtomicBoolean) r11
            r12 = r9
            java.util.concurrent.atomic.AtomicBoolean r12 = (java.util.concurrent.atomic.AtomicBoolean) r12
            r13 = r8
            wb.kv r13 = (wb.kv) r13
            r14 = r7
            android.app.Activity r14 = (android.app.Activity) r14
            r16 = r6
            fg.l r16 = (fg.l) r16
            p8.o r0 = r5.f1482b     // Catch: java.lang.Throwable -> L311
            p8.c r0 = r0.q(r4, r11)     // Catch: java.lang.Throwable -> L311
            r15 = r0
            goto L318
        L311:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r15 = r2
        L318:
            android.os.Handler r0 = r5.f1484d
            ca.n r10 = new ca.n
            r19 = 0
            r18 = r4
            r17 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0.post(r10)
            return
    }
}
