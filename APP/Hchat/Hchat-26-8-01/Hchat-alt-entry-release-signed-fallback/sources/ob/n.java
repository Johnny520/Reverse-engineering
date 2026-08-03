package ob;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f9737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ia.t f9738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.content.SharedPreferences f9739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.os.Handler f9740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ob.d f9741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b5.c f9742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f9743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f9744h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.Set f9745i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.util.Map f9746j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.ThreadPoolExecutor f9747k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public android.media.MediaPlayer f9748l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public java.io.File f9749m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f9750n;

    public n(r8.g r10, ia.t r11) {
            r9 = this;
            r10.getClass()
            r9.<init>()
            r9.f9737a = r10
            r9.f9738b = r11
            java.util.List r11 = ob.p.f9754a
            android.content.Context r10 = r10.f11620a
            java.lang.String r11 = "Hchat_text_voice_config"
            android.content.SharedPreferences r11 = ub.b.c(r10, r11)
            r9.f9739c = r11
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r9.f9740d = r0
            ob.d r0 = new ob.d
            r0.<init>()
            r9.f9741e = r0
            b5.c r0 = new b5.c
            r1 = 13
            r0.<init>(r10, r1)
            r9.f9742f = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 1
            r0.<init>(r1)
            r9.f9743g = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r9.f9744h = r0
            java.util.Set r0 = j8.b.o()
            r9.f9745i = r0
            java.util.Map r0 = p.a.p()
            r9.f9746j = r0
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.ArrayBlockingQueue r7 = new java.util.concurrent.ArrayBlockingQueue
            r0 = 8
            r7.<init>(r0)
            c9.q r8 = new c9.q
            r0 = 21
            r8.<init>(r0)
            r2 = 1
            r3 = 1
            r4 = 0
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1.<init>(r2, r3, r4, r6, r7, r8)
            r9.f9747k = r1
            b9.b r0 = new b9.b
            r1 = 9
            r0.<init>(r9, r1)
            r11.registerOnSharedPreferenceChangeListener(r0)
            java.io.File r11 = new java.io.File
            java.io.File r10 = r10.getCacheDir()
            java.lang.String r0 = "hchat_text_voice"
            r11.<init>(r10, r0)
            boolean r10 = r11.isDirectory()
            if (r10 != 0) goto L85
            r11.mkdirs()
        L85:
            java.io.File[] r10 = r11.listFiles()
            if (r10 == 0) goto La7
            int r11 = r10.length
            r0 = 0
            r1 = r0
        L8e:
            if (r1 >= r11) goto La7
            r2 = r10[r1]
            java.lang.String r3 = r2.getName()
            r3.getClass()
            java.lang.String r4 = "hchat_text_voice_"
            boolean r3 = og.t.d0(r3, r4, r0)
            if (r3 == 0) goto La4
            r2.delete()
        La4:
            int r1 = r1 + 1
            goto L8e
        La7:
            return
    }

    public static void b(java.lang.Object r9, android.view.MenuItem r10) {
            java.lang.Class r0 = r9.getClass()
        L4:
            if (r0 == 0) goto L7b
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L7b
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredFields(r0)
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L76
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.Class<java.util.List> r3 = java.util.List.class
            java.lang.Class r4 = r2.getType()
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 != 0) goto L2f
            goto L16
        L2f:
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r2, r9)
            boolean r3 = gg.x.e(r2)
            r4 = 0
            if (r3 == 0) goto L3d
            java.util.List r2 = (java.util.List) r2
            goto L3e
        L3d:
            r2 = r4
        L3e:
            if (r2 == 0) goto L16
            java.util.Iterator r3 = r2.iterator()
            r5 = 0
            r6 = r5
        L46:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L69
            java.lang.Object r7 = r3.next()
            if (r7 == r10) goto L6a
            boolean r8 = r7 instanceof android.view.MenuItem
            if (r8 == 0) goto L59
            android.view.MenuItem r7 = (android.view.MenuItem) r7
            goto L5a
        L59:
            r7 = r4
        L5a:
            if (r7 == 0) goto L66
            int r7 = r7.getItemId()
            r8 = 1212372054(0x48435456, float:200017.34)
            if (r7 != r8) goto L66
            goto L6a
        L66:
            int r6 = r6 + 1
            goto L46
        L69:
            r6 = -1
        L6a:
            if (r6 <= 0) goto L73
            java.lang.Object r3 = r2.remove(r6)     // Catch: java.lang.Throwable -> L73
            r2.add(r5, r3)     // Catch: java.lang.Throwable -> L73
        L73:
            if (r6 < 0) goto L16
            goto L7b
        L76:
            java.lang.Class r0 = r0.getSuperclass()
            goto L4
        L7b:
            return
    }

    public static java.lang.Number e(java.lang.Object r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.invokeMethod(r2, r3, r0)
            boolean r0 = r3 instanceof java.lang.Number
            r1 = 0
            if (r0 == 0) goto Lf
            java.lang.Number r3 = (java.lang.Number) r3
            goto L10
        Lf:
            r3 = r1
        L10:
            if (r3 == 0) goto L13
            return r3
        L13:
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r2, r4)
            boolean r4 = r3 instanceof java.lang.Number
            if (r4 == 0) goto L1e
            java.lang.Number r3 = (java.lang.Number) r3
            goto L1f
        L1e:
            r3 = r1
        L1f:
            if (r3 == 0) goto L22
            return r3
        L22:
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r2, r5)
            boolean r3 = r2 instanceof java.lang.Number
            if (r3 == 0) goto L2d
            java.lang.Number r2 = (java.lang.Number) r2
            return r2
        L2d:
            return r1
    }

    public static java.lang.String f(java.lang.Object r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invokeMethod(r1, r2, r0)
            if (r2 == 0) goto L10
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L10
            return r2
        L10:
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r1, r3)
            if (r2 == 0) goto L1b
            java.lang.String r1 = r2.toString()
            return r1
        L1b:
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r1, r4)
            if (r1 == 0) goto L26
            java.lang.String r1 = r1.toString()
            goto L27
        L26:
            r1 = 0
        L27:
            if (r1 == 0) goto L2a
            return r1
        L2a:
            java.lang.String r1 = ""
            return r1
    }

    public static java.lang.Object h(int r9, java.lang.Object r10, java.util.Set r11) {
            r0 = 0
            if (r10 == 0) goto Lf1
            r1 = 5
            if (r9 > r1) goto Lf1
            boolean r1 = r11.add(r10)
            if (r1 != 0) goto Le
            goto Lf1
        Le:
            java.lang.String r1 = "field_msgId"
            java.lang.String r2 = "msgId"
            java.lang.String r3 = "getMsgId"
            java.lang.Number r1 = e(r10, r3, r1, r2)
            r2 = 0
            if (r1 == 0) goto L1c
            goto L2c
        L1c:
            java.lang.String r1 = "getMsgID"
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invokeMethod(r10, r1, r3)
            boolean r3 = r1 instanceof java.lang.Number
            if (r3 == 0) goto L2b
            java.lang.Number r1 = (java.lang.Number) r1
            goto L2c
        L2b:
            r1 = r0
        L2c:
            java.lang.String r3 = "com.tencent.mm.storage."
            boolean r3 = eh.a.z(r3, r10, r2)
            r4 = 1
            if (r3 == 0) goto L47
            if (r1 == 0) goto L47
            long r5 = r1.longValue()
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L43
            r1 = r4
            goto L44
        L43:
            r1 = r2
        L44:
            if (r1 != r4) goto L47
            return r10
        L47:
            boolean r1 = r10 instanceof android.view.View
            if (r1 == 0) goto L57
            android.view.View r10 = (android.view.View) r10
            java.lang.Object r10 = r10.getTag()
            int r9 = r9 + r4
            java.lang.Object r9 = h(r9, r10, r11)
            return r9
        L57:
            boolean r1 = r10 instanceof java.lang.Object[]
            if (r1 == 0) goto L6e
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            int r1 = r10.length
        L5e:
            if (r2 >= r1) goto Lf1
            r3 = r10[r2]
            int r5 = r9 + 1
            java.lang.Object r3 = h(r5, r3, r11)
            if (r3 == 0) goto L6b
            return r3
        L6b:
            int r2 = r2 + 1
            goto L5e
        L6e:
            boolean r1 = r10 instanceof java.util.Collection
            if (r1 == 0) goto L8b
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L78:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto Lf1
            java.lang.Object r1 = r10.next()
            int r2 = r9 + 1
            java.lang.Object r1 = h(r2, r1, r11)
            if (r1 == 0) goto L78
            return r1
        L8b:
            java.lang.Class r1 = r10.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r3 = "java."
            boolean r3 = og.t.d0(r1, r3, r2)
            if (r3 != 0) goto Lf1
            java.lang.String r3 = "android."
            boolean r1 = og.t.d0(r1, r3, r2)
            if (r1 == 0) goto La4
            goto Lf1
        La4:
            java.lang.Class r1 = r10.getClass()
        La8:
            if (r1 == 0) goto Lf1
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto Lf1
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredFields(r1)
            java.util.Iterator r2 = r2.iterator()
        Lba:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lec
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.Class r5 = r3.getType()
            boolean r5 = r5.isPrimitive()
            if (r5 != 0) goto Lba
            java.lang.Class r5 = r3.getType()
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            boolean r5 = gg.l.a(r5, r6)
            if (r5 == 0) goto Ldd
            goto Lba
        Ldd:
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r3, r10)
            if (r3 == 0) goto Lba
            int r5 = r9 + 1
            java.lang.Object r3 = h(r5, r3, r11)
            if (r3 == 0) goto Lba
            return r3
        Lec:
            java.lang.Class r1 = r1.getSuperclass()
            goto La8
        Lf1:
            return r0
    }

    public static java.lang.String m(java.lang.String r1, java.lang.Throwable r2) {
            boolean r0 = r2 instanceof java.lang.InterruptedException
            if (r0 == 0) goto L7
            java.lang.String r1 = "操作已取消"
            return r1
        L7:
            java.lang.String r2 = r2.getMessage()
            if (r2 == 0) goto L27
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L27
            int r0 = r2.length()
            if (r0 <= 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            if (r0 == 0) goto L23
            goto L24
        L23:
            r2 = 0
        L24:
            if (r2 == 0) goto L27
            return r2
        L27:
            return r1
    }

    public final boolean a(java.lang.reflect.Method r4, de.robv.android.xposed.XC_MethodHook r5) {
            r3 = this;
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 != 0) goto L60
            java.lang.Class r0 = r4.getDeclaringClass()
            boolean r0 = r0.isInterface()
            if (r0 == 0) goto L15
            goto L60
        L15:
            java.util.Set r0 = r3.f9745i
            boolean r1 = r0.add(r4)
            if (r1 != 0) goto L1f
            r4 = 1
            return r4
        L1f:
            r8.i r1 = r8.i.f11631b     // Catch: java.lang.Throwable -> L2f
            java.lang.reflect.Method r2 = h.Hchat.utils.KavaReflector.accessible(r4)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L28
            goto L29
        L28:
            r2 = r4
        L29:
            r1.b(r2, r5)     // Catch: java.lang.Throwable -> L2f
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2f
            goto L36
        L2f:
            r5 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r5)
            r5 = r1
        L36:
            java.lang.Throwable r1 = sf.g.b(r5)
            if (r1 != 0) goto L3d
            goto L59
        L3d:
            r0.remove(r4)
            java.lang.String r4 = r4.toGenericString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "文本转语音菜单 Hook 安装失败: "
            r5.<init>(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            ia.t r5 = r3.f9738b
            r5.invoke(r4, r1)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
        L59:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            return r4
        L60:
            r4 = 0
            return r4
    }

    public final java.io.File c(ob.k r6) {
            r5 = this;
            java.util.List r0 = ob.p.f9754a
            java.lang.String r6 = r6.f9729a
            java.lang.String r0 = "tts:"
            r1 = 0
            boolean r6 = og.t.d0(r6, r0, r1)
            if (r6 == 0) goto L10
            java.lang.String r6 = ".wav"
            goto L12
        L10:
            java.lang.String r6 = ".mp3"
        L12:
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            r8.g r2 = r5.f9737a
            android.content.Context r2 = r2.f11620a
            java.io.File r2 = r2.getCacheDir()
            java.lang.String r3 = "hchat_text_voice"
            r1.<init>(r2, r3)
            boolean r2 = r1.isDirectory()
            if (r2 != 0) goto L2c
            r1.mkdirs()
        L2c:
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "hchat_text_voice_"
            r3.<init>(r4)
            r3.append(r2)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r0.<init>(r1, r6)
            return r0
    }

    public final boolean d() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f9743g
            boolean r0 = r0.get()
            r1 = 0
            if (r0 == 0) goto L15
            android.content.SharedPreferences r0 = r3.f9739c
            java.lang.String r2 = "text_voice_play_enable"
            boolean r0 = r0.getBoolean(r2, r1)
            if (r0 == 0) goto L15
            r0 = 1
            return r0
        L15:
            return r1
    }

    public final void g() {
            r4 = this;
            long r0 = r4.f9750n
            r2 = 1
            long r0 = r0 + r2
            r4.f9750n = r0
            android.media.MediaPlayer r0 = r4.f9748l
            java.io.File r1 = r4.f9749m
            r2 = 0
            r4.f9748l = r2
            r4.f9749m = r2
            if (r0 == 0) goto L15
            r0.stop()     // Catch: java.lang.Throwable -> L15
        L15:
            if (r0 == 0) goto L1a
            r0.reset()     // Catch: java.lang.Throwable -> L1a
        L1a:
            if (r0 == 0) goto L1f
            r0.release()     // Catch: java.lang.Throwable -> L1f
        L1f:
            if (r1 == 0) goto L24
            r1.delete()
        L24:
            return
    }

    public final boolean i() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f9743g
            boolean r0 = r0.get()
            r1 = 0
            if (r0 == 0) goto L15
            android.content.SharedPreferences r0 = r3.f9739c
            java.lang.String r2 = "text_voice_send_enable"
            boolean r0 = r0.getBoolean(r2, r1)
            if (r0 == 0) goto L15
            r0 = 1
            return r0
        L15:
            return r1
    }

    public final ob.k j(ob.j r13) {
            r12 = this;
            java.util.List r0 = ob.p.f9754a
            r8.g r0 = r12.f9737a
            android.content.Context r1 = r0.f11620a
            android.content.Context r0 = r0.f11620a
            java.lang.String r2 = "Hchat_text_voice_config"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            java.lang.String r3 = "text_voice_engine"
            java.lang.String r4 = "online"
            java.lang.String r1 = r1.getString(r3, r4)
            java.lang.String r3 = ""
            if (r1 != 0) goto L1b
            r1 = r3
        L1b:
            boolean r5 = og.m.t0(r1)
            if (r5 == 0) goto L23
            r7 = r4
            goto L24
        L23:
            r7 = r1
        L24:
            ob.j r1 = ob.j.f9727h
            if (r13 != r1) goto L2c
            java.lang.String r4 = "v50"
        L2a:
            r8 = r4
            goto L5d
        L2c:
            java.lang.String r4 = ob.p.b(r0)
            java.util.List r5 = ob.p.f9754a
            java.util.Iterator r6 = r5.iterator()
        L36:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L4c
            java.lang.Object r8 = r6.next()
            r9 = r8
            ob.o r9 = (ob.o) r9
            java.lang.String r9 = r9.f9751a
            boolean r9 = r9.equals(r4)
            if (r9 == 0) goto L36
            goto L4d
        L4c:
            r8 = 0
        L4d:
            ob.o r8 = (ob.o) r8
            if (r8 == 0) goto L54
            java.lang.String r4 = r8.f9753c
            goto L2a
        L54:
            java.lang.Object r4 = tf.m.t1(r5)
            ob.o r4 = (ob.o) r4
            java.lang.String r4 = r4.f9753c
            goto L2a
        L5d:
            ob.k r6 = new ob.k
            android.content.SharedPreferences r4 = r12.f9739c
            java.lang.String r5 = "text_voice_tts_voice"
            java.lang.String r4 = r4.getString(r5, r3)
            if (r4 != 0) goto L6b
            r9 = r3
            goto L6c
        L6b:
            r9 = r4
        L6c:
            java.util.List r3 = ob.p.f9754a
            android.content.SharedPreferences r0 = ub.b.c(r0, r2)
            java.lang.String r2 = "text_voice_speech_rate"
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0.getFloat(r2, r3)
            float r10 = ob.p.a(r0)
            if (r13 != r1) goto L83
            r13 = 1
        L81:
            r11 = r13
            goto L85
        L83:
            r13 = 0
            goto L81
        L85:
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
    }

    public final void k(java.lang.String r17, ob.k r18, java.io.File r19) {
            r16 = this;
            r1 = r16
            r0 = r18
            java.util.List r2 = ob.p.f9754a
            java.lang.String r2 = r0.f9729a
            java.lang.String r3 = "tts:"
            r4 = 0
            boolean r3 = og.t.d0(r2, r3, r4)
            java.lang.String r12 = ""
            if (r3 == 0) goto Lba
            java.lang.String r13 = ob.p.c(r2)
            java.lang.String r6 = r0.f9731c
            float r7 = r0.f9732d
            boolean r8 = r0.f9733e
            b5.c r2 = r1.f9742f
            r2.getClass()
            r17.getClass()
            java.lang.Object r0 = r2.f469a
            android.content.Context r0 = (android.content.Context) r0
            android.content.Context r3 = r0.getApplicationContext()
            if (r3 == 0) goto L30
            goto L31
        L30:
            r3 = r0
        L31:
            java.lang.Object r0 = r2.f471c
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0
            long r10 = r0.get()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.List r0 = nb.c.a(r3, r13)
            java.util.Iterator r15 = r0.iterator()
            r5 = 0
        L47:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L93
            java.lang.Object r0 = r15.next()
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            r2.k(r10)
            r4 = r17
            r9 = r19
            r2.V(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: ob.b -> L60
            goto L305
        L60:
            r0 = move-exception
            boolean r4 = og.m.t0(r5)
            if (r4 == 0) goto L69
            java.lang.String r5 = "系统默认"
        L69:
            java.lang.String r4 = r0.getMessage()
            if (r4 != 0) goto L70
            r4 = r12
        L70:
            r18 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = "："
            r0.append(r5)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r14.add(r0)
            boolean r0 = og.m.t0(r13)
            if (r0 == 0) goto L92
            r5 = r18
            goto L47
        L92:
            throw r18
        L93:
            r0 = 3
            java.util.List r6 = tf.m.M1(r0, r14)
            r10 = 0
            r11 = 62
            java.lang.String r7 = "；"
            r8 = 0
            r9 = 0
            java.lang.String r0 = tf.m.A1(r6, r7, r8, r9, r10, r11)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            boolean r3 = og.m.t0(r0)
            if (r3 == 0) goto Lae
            java.lang.String r0 = "TTS 引擎初始化失败"
            goto Lb6
        Lae:
            java.lang.String r3 = "可用 TTS 引擎均初始化失败（"
            java.lang.String r4 = "）"
            java.lang.String r0 = eh.a.n(r3, r0, r4)
        Lb6:
            r2.<init>(r0, r5)
            throw r2
        Lba:
            r9 = r19
            java.lang.String r2 = r0.f9730b
            float r0 = r0.f9732d
            float r0 = ob.p.a(r0)
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r3
            r3 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 * r3
            int r0 = ig.a.X(r0)
            r3 = -9
            r6 = 20
            int r0 = r9.e0.r(r0, r3, r6)
            ob.d r7 = r1.f9741e
            okhttp3.OkHttpClient r7 = r7.f9717a
            java.lang.String r8 = "在线语音服务返回错误: "
            java.lang.String r10 = "在线语音请求失败: HTTP "
            r17.getClass()
            r2.getClass()
            java.lang.CharSequence r11 = og.m.R0(r17)
            java.lang.String r11 = r11.toString()
            int r13 = r11.length()
            if (r13 <= 0) goto L3a2
            int r13 = r11.length()
            r14 = 2000(0x7d0, float:2.803E-42)
            if (r13 > r14) goto L39c
            long r13 = java.lang.System.currentTimeMillis()
            java.lang.String r15 = "platform"
            java.lang.String r5 = "Android"
            java.lang.String r3 = "model_id"
            java.lang.String r6 = "tts_bcut"
            org.json.JSONObject r3 = wb.en.l(r3, r6, r15, r5)
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            org.json.JSONArray r5 = r5.put(r11)
            java.lang.String r6 = "raw_data"
            r3.put(r6, r5)
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r6 = "format"
            java.lang.String r11 = "mp3"
            r5.put(r6, r11)
            java.util.UUID r6 = java.util.UUID.randomUUID()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            java.lang.String r6 = "_"
            r11.append(r6)
            r11.append(r13)
            java.lang.String r6 = r11.toString()
            java.lang.String r11 = "logid"
            r5.put(r11, r6)
            java.lang.String r6 = "method"
            r5.put(r6, r4)
            java.lang.String r6 = "pitch_rate"
            r5.put(r6, r4)
            java.lang.String r6 = "sample_rate"
            r11 = 16000(0x3e80, float:2.2421E-41)
            r5.put(r6, r11)
            java.lang.String r6 = "speech_rate"
            r11 = 20
            r15 = -9
            int r0 = r9.e0.r(r0, r15, r11)
            r5.put(r6, r0)
            java.lang.String r0 = "voice"
            r5.put(r0, r2)
            java.lang.String r0 = "voice_engine"
            java.lang.String r2 = "bili"
            r5.put(r0, r2)
            java.lang.String r0 = "volume"
            r2 = 50
            r5.put(r0, r2)
            java.lang.String r0 = "raw_params"
            r3.put(r0, r5)
            okhttp3.Request$Builder r0 = new okhttp3.Request$Builder
            r0.<init>()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 / r5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "https://member.bilibili.com/x/material/rubick-interface/sync-task?aurora_version=2.33.0&montage_version=1.36.1.3&sdk_type=mon&ts="
            r2.<init>(r5)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            okhttp3.Request$Builder r0 = r0.url(r2)
            java.lang.String r2 = "env"
            java.lang.String r5 = "prod"
            okhttp3.Request$Builder r0 = r0.header(r2, r5)
            java.lang.String r2 = "APP-KEY"
            java.lang.String r5 = "bilistudio"
            okhttp3.Request$Builder r0 = r0.header(r2, r5)
            java.lang.String r2 = "bili-http-engine"
            java.lang.String r5 = "cronet"
            okhttp3.Request$Builder r0 = r0.header(r2, r5)
            java.lang.String r2 = "User-Agent"
            java.lang.String r5 = "com.bilibili.studio/2740030 (Linux; U; Android 13; zh_CN; 21121210C; Build/TKQ1.220807.001; Cronet/88.0.4324.188)"
            okhttp3.Request$Builder r0 = r0.header(r2, r5)
            okhttp3.RequestBody$Companion r2 = okhttp3.RequestBody.Companion
            java.lang.String r3 = r3.toString()
            r3.getClass()
            okhttp3.MediaType r5 = ob.d.f9716b
            okhttp3.RequestBody r2 = r2.create(r3, r5)
            okhttp3.Request$Builder r0 = r0.post(r2)
            okhttp3.Request r0 = r0.build()
            okhttp3.Call r0 = r7.newCall(r0)
            okhttp3.Response r2 = r0.execute()
            okhttp3.ResponseBody r0 = r2.body()     // Catch: java.lang.Throwable -> L1db
            if (r0 == 0) goto L1df
            java.lang.String r0 = r0.string()     // Catch: java.lang.Throwable -> L1db
            goto L1e0
        L1db:
            r0 = move-exception
            r3 = r0
            goto L396
        L1df:
            r0 = 0
        L1e0:
            if (r0 != 0) goto L1e3
            r0 = r12
        L1e3:
            boolean r3 = r2.isSuccessful()     // Catch: java.lang.Throwable -> L1db
            if (r3 == 0) goto L37c
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1ef
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1ef
            goto L1f5
        L1ef:
            r0 = move-exception
            sf.f r3 = new sf.f     // Catch: java.lang.Throwable -> L1db
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1db
        L1f5:
            java.lang.Throwable r0 = sf.g.b(r3)     // Catch: java.lang.Throwable -> L1db
            if (r0 != 0) goto L374
            org.json.JSONObject r3 = (org.json.JSONObject) r3     // Catch: java.lang.Throwable -> L1db
            java.lang.String r0 = "code"
            r5 = -1
            int r0 = r3.optInt(r0, r5)     // Catch: java.lang.Throwable -> L1db
            if (r0 == 0) goto L228
            java.lang.String r4 = "message"
            java.lang.String r3 = r3.optString(r4)     // Catch: java.lang.Throwable -> L1db
            boolean r4 = og.m.t0(r3)     // Catch: java.lang.Throwable -> L1db
            if (r4 == 0) goto L21e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1db
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L1db
            r3.append(r0)     // Catch: java.lang.Throwable -> L1db
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1db
        L21e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1db
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1db
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1db
            throw r0     // Catch: java.lang.Throwable -> L1db
        L228:
            java.lang.String r0 = "data"
            org.json.JSONObject r0 = r3.optJSONObject(r0)     // Catch: java.lang.Throwable -> L1db
            if (r0 == 0) goto L24d
            java.lang.String r3 = "result"
            org.json.JSONObject r0 = r0.optJSONObject(r3)     // Catch: java.lang.Throwable -> L1db
            if (r0 == 0) goto L24d
            java.lang.String r3 = "results"
            org.json.JSONArray r0 = r0.optJSONArray(r3)     // Catch: java.lang.Throwable -> L1db
            if (r0 == 0) goto L24d
            org.json.JSONObject r0 = r0.optJSONObject(r4)     // Catch: java.lang.Throwable -> L1db
            if (r0 == 0) goto L24d
            java.lang.String r3 = "url"
            java.lang.String r0 = r0.optString(r3)     // Catch: java.lang.Throwable -> L1db
            goto L24e
        L24d:
            r0 = 0
        L24e:
            if (r0 != 0) goto L251
            goto L252
        L251:
            r12 = r0
        L252:
            java.lang.String r0 = "https://"
            r3 = 1
            boolean r0 = og.t.d0(r12, r0, r3)     // Catch: java.lang.Throwable -> L1db
            if (r0 == 0) goto L25d
            r5 = r12
            goto L25e
        L25d:
            r5 = 0
        L25e:
            if (r5 == 0) goto L36c
            r2.close()
            java.lang.String r0 = "下载语音失败: HTTP "
            java.io.File r2 = r9.getParentFile()
            if (r2 == 0) goto L27e
            boolean r3 = r2.isDirectory()
            if (r3 != 0) goto L27e
            boolean r2 = r2.mkdirs()
            if (r2 == 0) goto L278
            goto L27e
        L278:
            java.lang.String r0 = "无法创建语音缓存目录"
            j8.o.A(r0)
            return
        L27e:
            java.io.File r2 = new java.io.File
            java.io.File r3 = r9.getParentFile()
            java.lang.String r6 = r9.getName()
            java.lang.String r8 = ".part"
            java.lang.String r6 = bc.e.i(r6, r8)
            r2.<init>(r3, r6)
            r2.delete()
            r9.delete()
            okhttp3.Request$Builder r3 = new okhttp3.Request$Builder     // Catch: java.lang.Throwable -> L303
            r3.<init>()     // Catch: java.lang.Throwable -> L303
            okhttp3.Request$Builder r3 = r3.url(r5)     // Catch: java.lang.Throwable -> L303
            okhttp3.Request$Builder r3 = r3.get()     // Catch: java.lang.Throwable -> L303
            okhttp3.Request r3 = r3.build()     // Catch: java.lang.Throwable -> L303
            okhttp3.Call r3 = r7.newCall(r3)     // Catch: java.lang.Throwable -> L303
            okhttp3.Response r3 = r3.execute()     // Catch: java.lang.Throwable -> L303
            boolean r5 = r3.isSuccessful()     // Catch: java.lang.Throwable -> L30e
            if (r5 == 0) goto L345
            okhttp3.ResponseBody r0 = r3.body()     // Catch: java.lang.Throwable -> L30e
            if (r0 == 0) goto L33d
            long r5 = r0.contentLength()     // Catch: java.lang.Throwable -> L30e
            r7 = 16777216(0x1000000, double:8.289046E-317)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            java.lang.String r6 = "语音文件超过 16 MiB"
            if (r5 > 0) goto L337
            java.io.InputStream r5 = r0.byteStream()     // Catch: java.lang.Throwable -> L30e
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L311
            r10.<init>(r2, r4)     // Catch: java.lang.Throwable -> L311
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L322
            r11 = 0
            r13 = r11
        L2d9:
            int r15 = r5.read(r0)     // Catch: java.lang.Throwable -> L322
            if (r15 >= 0) goto L314
            r10.close()     // Catch: java.lang.Throwable -> L311
            r5.close()     // Catch: java.lang.Throwable -> L30e
            r3.close()     // Catch: java.lang.Throwable -> L303
            boolean r0 = r2.isFile()     // Catch: java.lang.Throwable -> L303
            if (r0 == 0) goto L306
            long r3 = r2.length()     // Catch: java.lang.Throwable -> L303
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 <= 0) goto L306
            boolean r0 = r2.renameTo(r9)     // Catch: java.lang.Throwable -> L303
            if (r0 != 0) goto L305
            dg.l.a0(r2, r9)     // Catch: java.lang.Throwable -> L303
            r2.delete()     // Catch: java.lang.Throwable -> L303
            goto L305
        L303:
            r0 = move-exception
            goto L365
        L305:
            return
        L306:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L303
            java.lang.String r3 = "下载到的语音文件为空"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L303
            throw r0     // Catch: java.lang.Throwable -> L303
        L30e:
            r0 = move-exception
            r4 = r0
            goto L35f
        L311:
            r0 = move-exception
            r4 = r0
            goto L331
        L314:
            r17 = r7
            long r7 = (long) r15
            long r13 = r13 + r7
            int r7 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r7 > 0) goto L325
            r10.write(r0, r4, r15)     // Catch: java.lang.Throwable -> L322
            r7 = r17
            goto L2d9
        L322:
            r0 = move-exception
            r4 = r0
            goto L32b
        L325:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L322
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L322
            throw r0     // Catch: java.lang.Throwable -> L322
        L32b:
            throw r4     // Catch: java.lang.Throwable -> L32c
        L32c:
            r0 = move-exception
            ig.a.i(r10, r4)     // Catch: java.lang.Throwable -> L311
            throw r0     // Catch: java.lang.Throwable -> L311
        L331:
            throw r4     // Catch: java.lang.Throwable -> L332
        L332:
            r0 = move-exception
            ig.a.i(r5, r4)     // Catch: java.lang.Throwable -> L30e
            throw r0     // Catch: java.lang.Throwable -> L30e
        L337:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L30e
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L30e
            throw r0     // Catch: java.lang.Throwable -> L30e
        L33d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L30e
            java.lang.String r4 = "下载语音失败: 返回内容为空"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L30e
            throw r0     // Catch: java.lang.Throwable -> L30e
        L345:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L30e
            int r5 = r3.code()     // Catch: java.lang.Throwable -> L30e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30e
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L30e
            r6.append(r5)     // Catch: java.lang.Throwable -> L30e
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L30e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L30e
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L30e
            throw r4     // Catch: java.lang.Throwable -> L30e
        L35f:
            throw r4     // Catch: java.lang.Throwable -> L360
        L360:
            r0 = move-exception
            ig.a.i(r3, r4)     // Catch: java.lang.Throwable -> L303
            throw r0     // Catch: java.lang.Throwable -> L303
        L365:
            r2.delete()
            r9.delete()
            throw r0
        L36c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1db
            java.lang.String r3 = "在线语音未返回安全的音频地址"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1db
            throw r0     // Catch: java.lang.Throwable -> L1db
        L374:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1db
            java.lang.String r3 = "在线语音返回内容无法解析"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1db
            throw r0     // Catch: java.lang.Throwable -> L1db
        L37c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1db
            int r3 = r2.code()     // Catch: java.lang.Throwable -> L1db
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1db
            r4.<init>(r10)     // Catch: java.lang.Throwable -> L1db
            r4.append(r3)     // Catch: java.lang.Throwable -> L1db
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L1db
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1db
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1db
            throw r0     // Catch: java.lang.Throwable -> L1db
        L396:
            throw r3     // Catch: java.lang.Throwable -> L397
        L397:
            r0 = move-exception
            ig.a.i(r2, r3)
            throw r0
        L39c:
            java.lang.String r0 = "文字不能超过 2000 个字符"
            j8.o.t(r0)
            return
        L3a2:
            java.lang.String r0 = "文字不能为空"
            j8.o.t(r0)
            return
    }

    public final void l(java.lang.String r4) {
            r3 = this;
            q8.o r0 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r0 == 0) goto Lb
            android.app.Activity r0 = r0.a()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            ac.l r1 = new ac.l
            r2 = 23
            r1.<init>(r0, r3, r4, r2)
            android.os.Handler r4 = r3.f9740d
            r4.post(r1)
            return
    }
}
