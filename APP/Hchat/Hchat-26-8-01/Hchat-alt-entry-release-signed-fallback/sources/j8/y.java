package j8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final android.os.Handler f6840h = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h.Hchat.dexkit.DexFinder f6841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.Context f6842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile java.lang.reflect.Method f6843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f6844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.Object f6845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b.e f6846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f6847g;

    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            j8.y.f6840h = r0
            return
    }

    public y(android.content.Context r1, h.Hchat.dexkit.DexFinder r2, i8.f r3) {
            r0 = this;
            r0.<init>()
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r0.f6844d = r3
            r0.f6842b = r1
            r0.f6841a = r2
            return
    }

    public static java.lang.Object g(java.lang.Class r2) {
            boolean r0 = r2.isPrimitive()
            if (r0 != 0) goto L7
            goto L53
        L7:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r2 != r0) goto Le
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            return r2
        Le:
            java.lang.Class r0 = java.lang.Byte.TYPE
            r1 = 0
            if (r2 != r0) goto L18
            java.lang.Byte r2 = java.lang.Byte.valueOf(r1)
            return r2
        L18:
            java.lang.Class r0 = java.lang.Short.TYPE
            if (r2 != r0) goto L21
            java.lang.Short r2 = java.lang.Short.valueOf(r1)
            return r2
        L21:
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r2 != r0) goto L2a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            return r2
        L2a:
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r2 != r0) goto L35
            r0 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
        L35:
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r2 != r0) goto L3f
            r2 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            return r2
        L3f:
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r2 != r0) goto L4a
            r0 = 0
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        L4a:
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r2 != r0) goto L53
            java.lang.Character r2 = java.lang.Character.valueOf(r1)
            return r2
        L53:
            r2 = 0
            return r2
    }

    public static int h(java.lang.String r7) {
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r2 = 0
            me.yun.silk.SilkCodec r3 = new me.yun.silk.SilkCodec     // Catch: java.lang.Throwable -> L19
            r3.<init>()     // Catch: java.lang.Throwable -> L19
            long r3 = r3.getDuration(r7)     // Catch: java.lang.Throwable -> L19
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 > 0) goto L14
            goto L19
        L14:
            long r2 = java.lang.Math.min(r0, r3)     // Catch: java.lang.Throwable -> L19
            int r2 = (int) r2
        L19:
            if (r2 <= 0) goto L1c
            return r2
        L1c:
            android.media.MediaMetadataRetriever r2 = new android.media.MediaMetadataRetriever
            r2.<init>()
            r2.setDataSource(r7)     // Catch: java.lang.Throwable -> L30
            r7 = 9
            java.lang.String r7 = r2.extractMetadata(r7)     // Catch: java.lang.Throwable -> L30
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L34
        L30:
            r2.release()     // Catch: java.lang.Throwable -> L47
            goto L47
        L34:
            long r3 = java.lang.Long.parseLong(r7)     // Catch: java.lang.Throwable -> L30
            r5 = 1
            long r3 = java.lang.Math.max(r5, r3)     // Catch: java.lang.Throwable -> L30
            long r0 = java.lang.Math.min(r0, r3)     // Catch: java.lang.Throwable -> L30
            int r7 = (int) r0
            r2.release()     // Catch: java.lang.Throwable -> L46
        L46:
            return r7
        L47:
            r7 = 1000(0x3e8, float:1.401E-42)
            return r7
    }

    public static java.lang.String x(int r1, java.lang.String r2) {
            r0 = 1
            if (r1 != r0) goto L4
            goto L35
        L4:
            if (r2 == 0) goto Lb
            java.lang.String r1 = r2.toLowerCase()
            goto Ld
        Lb:
            java.lang.String r1 = ""
        Ld:
            java.lang.String r2 = ".silk"
            boolean r2 = r1.endsWith(r2)
            if (r2 != 0) goto L35
            java.lang.String r2 = ".slk"
            boolean r2 = r1.endsWith(r2)
            if (r2 == 0) goto L1e
            goto L35
        L1e:
            java.lang.String r2 = ".spx"
            boolean r2 = r1.endsWith(r2)
            if (r2 != 0) goto L32
            java.lang.String r2 = ".speex"
            boolean r1 = r1.endsWith(r2)
            if (r1 == 0) goto L2f
            goto L32
        L2f:
            java.lang.String r1 = "amr_"
            return r1
        L32:
            java.lang.String r1 = "spx_"
            return r1
        L35:
            java.lang.String r1 = "silk_"
            return r1
    }

    public final boolean a() {
            r2 = this;
            h.Hchat.dexkit.DexFinder r0 = r2.f6841a
            java.lang.reflect.Method r1 = r0.voiceStartRecordMethod
            if (r1 == 0) goto L10
            java.lang.reflect.Method r1 = r0.voiceFullPathMethod
            if (r1 == 0) goto L10
            java.lang.reflect.Method r0 = r0.voiceFinishRecordMethod
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public final boolean b() {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 == 0) goto Le
            h.Hchat.dexkit.DexFinder r0 = r1.f6841a
            java.lang.Class<?> r0 = r0.voiceUploadClass
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public final b.e c(long r4) {
            r3 = this;
            java.lang.Object r0 = r3.f6844d
            monitor-enter(r0)
            long r1 = r3.f6847g     // Catch: java.lang.Throwable -> Lc
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r5 = 0
            if (r4 == 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r5
        Lc:
            r4 = move-exception
            goto L16
        Le:
            b.e r4 = r3.f6846f     // Catch: java.lang.Throwable -> Lc
            r3.f6845e = r5     // Catch: java.lang.Throwable -> Lc
            r3.f6846f = r5     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r4
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r4
    }

    public final int d(java.io.File r5, java.io.File r6) {
            r4 = this;
            me.yun.silk.SilkCodec r0 = new me.yun.silk.SilkCodec     // Catch: java.lang.Throwable -> L3e
            r0.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L3e
            int r1 = r0.getFileType(r1)     // Catch: java.lang.Throwable -> L3e
            r2 = 2
            r3 = 24000(0x5dc0, float:3.3631E-41)
            if (r1 == r2) goto L4d
            r2 = 3
            if (r1 == r2) goto L4d
            r2 = 4
            if (r1 == r2) goto L4d
            r2 = 5
            if (r1 == r2) goto L4d
            r2 = 7
            if (r1 == r2) goto L40
            r2 = 8
            if (r1 == r2) goto L40
            java.lang.String r1 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L3e
            int r1 = me.yun.silk.AacCodec.autoToSilkCompat(r1, r2, r0, r3)     // Catch: java.lang.Throwable -> L3e
            if (r1 != 0) goto L31
            return r1
        L31:
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L3e
            int r5 = me.yun.silk.AacCodec.mp4ToSilk(r5, r6, r0, r3)     // Catch: java.lang.Throwable -> L3e
            return r5
        L3e:
            r5 = move-exception
            goto L5a
        L40:
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L3e
            int r5 = me.yun.silk.AacCodec.mp4ToSilk(r5, r6, r0, r3)     // Catch: java.lang.Throwable -> L3e
            return r5
        L4d:
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L3e
            int r5 = me.yun.silk.AacCodec.autoToSilkCompat(r5, r6, r0, r3)     // Catch: java.lang.Throwable -> L3e
            return r5
        L5a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "音频转 Silk 异常: "
            r6.<init>(r0)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.m(r5)
            r5 = -1
            return r5
    }

    public final boolean e(java.io.File r5, java.io.File r6) {
            r4 = this;
            r0 = 0
            r1 = 0
            java.io.File r2 = r6.getParentFile()     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L18
            boolean r3 = r2.isDirectory()     // Catch: java.lang.Throwable -> L15
            if (r3 != 0) goto L18
            boolean r2 = r2.mkdirs()     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L18
            goto L66
        L15:
            r5 = move-exception
            r6 = r1
            goto L44
        L18:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L15
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L15
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L41
            r5.<init>(r6, r0)     // Catch: java.lang.Throwable -> L41
            r6 = 8192(0x2000, float:1.148E-41)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L30
        L26:
            int r1 = r2.read(r6)     // Catch: java.lang.Throwable -> L30
            if (r1 <= 0) goto L36
            r5.write(r6, r0, r1)     // Catch: java.lang.Throwable -> L30
            goto L26
        L30:
            r6 = move-exception
            r1 = r6
            r6 = r5
            r5 = r1
        L34:
            r1 = r2
            goto L44
        L36:
            r5.flush()     // Catch: java.lang.Throwable -> L30
            r2.close()     // Catch: java.lang.Throwable -> L3c
        L3c:
            r5.close()     // Catch: java.lang.Throwable -> L3f
        L3f:
            r5 = 1
            return r5
        L41:
            r5 = move-exception
            r6 = r1
            goto L34
        L44:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r2.<init>()     // Catch: java.lang.Throwable -> L67
            java.lang.String r3 = "复制语音文件异常: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L67
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L67
            r2.append(r5)     // Catch: java.lang.Throwable -> L67
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L67
            r4.m(r5)     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L61
            r1.close()     // Catch: java.lang.Throwable -> L61
        L61:
            if (r6 == 0) goto L66
            r6.close()     // Catch: java.lang.Throwable -> L66
        L66:
            return r0
        L67:
            r5 = move-exception
            if (r1 == 0) goto L6d
            r1.close()     // Catch: java.lang.Throwable -> L6d
        L6d:
            if (r6 == 0) goto L72
            r6.close()     // Catch: java.lang.Throwable -> L72
        L72:
            throw r5
    }

    public final java.io.File f(java.io.File r4) {
            r3 = this;
            r0 = 0
            java.io.File r4 = r4.getParentFile()     // Catch: java.lang.Throwable -> L14
            if (r4 == 0) goto L16
            boolean r1 = r4.isDirectory()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            boolean r1 = r4.canWrite()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            goto L17
        L14:
            r4 = move-exception
            goto L27
        L16:
            r4 = r0
        L17:
            java.lang.String r1 = ".silk"
            java.lang.String r2 = "hchat_voice_"
            if (r4 == 0) goto L22
            java.io.File r4 = java.io.File.createTempFile(r2, r1, r4)     // Catch: java.lang.Throwable -> L14
            return r4
        L22:
            java.io.File r4 = java.io.File.createTempFile(r2, r1)     // Catch: java.lang.Throwable -> L14
            return r4
        L27:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "创建临时 Silk 文件失败: "
            r1.<init>(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r3.m(r4)
            return r0
    }

    public final int i(int r6) {
            r5 = this;
            android.content.Context r0 = r5.f6842b
            java.lang.String r1 = "Hchat_fake_voice_duration_config"
            android.content.SharedPreferences r2 = ub.b.c(r0, r1)
            java.lang.String r3 = "fake_voice_duration_enable"
            r4 = 0
            boolean r2 = r2.getBoolean(r3, r4)
            r3 = 1
            if (r2 == 0) goto L26
            android.content.SharedPreferences r6 = ub.b.c(r0, r1)
            java.lang.String r0 = "fake_voice_duration_seconds"
            r1 = 5
            int r6 = r6.getInt(r0, r1)
            r0 = 60
            int r6 = r9.e0.r(r6, r3, r0)
            int r6 = r6 * 1000
            return r6
        L26:
            r0 = 60000(0xea60, float:8.4078E-41)
            int r6 = java.lang.Math.max(r3, r6)
            int r6 = java.lang.Math.min(r0, r6)
            return r6
    }

    public final boolean j(int r7, java.lang.String r8) {
            r6 = this;
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            h.Hchat.dexkit.DexFinder r2 = r6.f6841a
            java.lang.reflect.Method r2 = r2.voiceFinishRecordMethod
            java.lang.Class[] r3 = r2.getParameterTypes()
            int r3 = r3.length
            r4 = 3
            r5 = 0
            if (r3 != r4) goto L2b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r8, r7, r1}
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.invoke(r2, r5, r7)
            boolean r8 = r7 instanceof java.lang.Boolean
            if (r8 == 0) goto L45
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L45
            goto L43
        L2b:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r8, r7, r1, r5}
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.invoke(r2, r5, r7)
            boolean r8 = r7 instanceof java.lang.Boolean
            if (r8 == 0) goto L45
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L45
        L43:
            r7 = 1
            return r7
        L45:
            return r0
    }

    public final java.lang.String k(java.lang.String r9, boolean r10) {
            r8 = this;
            h.Hchat.dexkit.DexFinder r0 = r8.f6841a
            java.lang.reflect.Method r1 = r0.voiceFullPathMethod
            r2 = 0
            if (r1 == 0) goto L17
            boolean r3 = h.Hchat.utils.KavaReflector.isStatic(r1)
            if (r3 == 0) goto Le
            goto L17
        Le:
            java.lang.Class r3 = r1.getDeclaringClass()
            java.lang.Object r0 = ig.a.A(r0, r3)
            goto L18
        L17:
            r0 = r2
        L18:
            boolean r3 = h.Hchat.utils.KavaReflector.isStatic(r1)
            java.lang.String r4 = ""
            if (r3 != 0) goto L34
            if (r0 != 0) goto L34
            java.lang.Class r9 = r1.getDeclaringClass()
            java.lang.String r9 = r9.getName()
            java.lang.String r10 = "发送语音失败: 获取语音路径服务失败 "
            java.lang.String r9 = r10.concat(r9)
            r8.m(r9)
            return r4
        L34:
            java.lang.Class[] r3 = r1.getParameterTypes()
            int r5 = r3.length
            r6 = 2
            if (r5 != r6) goto L4b
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r10}
            java.lang.Object r9 = h.Hchat.utils.KavaReflector.invoke(r1, r0, r9)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L4b:
            r5 = 0
            r3 = r3[r5]
            java.lang.String r5 = "j"
            java.lang.reflect.Field r5 = h.Hchat.utils.KavaReflector.findDeclaredField(r3, r5)     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.readField(r5, r2)     // Catch: java.lang.Throwable -> L5c
            if (r5 == 0) goto L5c
            r2 = r5
            goto L89
        L5c:
            java.util.List r5 = h.Hchat.utils.KavaReflector.declaredFields(r3)     // Catch: java.lang.Throwable -> L89
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L89
        L64:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L89
            if (r6 == 0) goto L89
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L89
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6     // Catch: java.lang.Throwable -> L89
            boolean r7 = h.Hchat.utils.KavaReflector.isStatic(r6)     // Catch: java.lang.Throwable -> L89
            if (r7 != 0) goto L77
            goto L64
        L77:
            java.lang.Class r7 = r6.getType()     // Catch: java.lang.Throwable -> L89
            boolean r7 = r3.isAssignableFrom(r7)     // Catch: java.lang.Throwable -> L89
            if (r7 != 0) goto L82
            goto L64
        L82:
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.readField(r6, r2)     // Catch: java.lang.Throwable -> L89
            if (r6 == 0) goto L64
            r2 = r6
        L89:
            if (r2 != 0) goto L8c
            return r4
        L8c:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            java.lang.Object[] r9 = new java.lang.Object[]{r2, r9, r10}
            java.lang.Object r9 = h.Hchat.utils.KavaReflector.invoke(r1, r0, r9)
            java.lang.String r9 = (java.lang.String) r9
            return r9
    }

    public final boolean l(java.lang.reflect.Method r5, java.lang.Object... r6) {
            r4 = this;
            java.lang.Object r0 = r4.f6844d
            monitor-enter(r0)
            java.lang.Object r1 = r4.f6845e     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            r0 = 0
            if (r1 == 0) goto L3e
            if (r5 == 0) goto L3e
            java.lang.Class r2 = r5.getDeclaringClass()
            java.lang.Class r3 = r1.getClass()
            if (r2 == r3) goto L16
            goto L3e
        L16:
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invokeOrThrow(r5, r1, r6)     // Catch: java.lang.Throwable -> L28
            boolean r6 = r5 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L28
            if (r6 == 0) goto L3e
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L28
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L28
            if (r5 == 0) goto L3e
            r5 = 1
            return r5
        L28:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "控制原语音播放失败: "
            r6.<init>(r1)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.m(r5)
        L3e:
            return r0
        L3f:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r5
    }

    public final void m(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "[WeChatVoiceApi] "
            java.lang.String r2 = r0.concat(r2)
            i8.i.f(r2)
            return
    }

    public final java.lang.Object n(java.lang.String r4, boolean r5) {
            r3 = this;
            h.Hchat.dexkit.DexFinder r0 = r3.f6841a
            if (r5 == 0) goto L9
            java.lang.reflect.Constructor<?> r1 = r0.voiceUploadCdnCtor     // Catch: java.lang.Throwable -> L7
            goto Lb
        L7:
            r5 = move-exception
            goto L40
        L9:
            java.lang.reflect.Constructor<?> r1 = r0.voiceUploadCtor     // Catch: java.lang.Throwable -> L7
        Lb:
            r2 = 0
            if (r1 != 0) goto L13
            if (r5 == 0) goto L13
            java.lang.reflect.Constructor<?> r1 = r0.voiceUploadCtor     // Catch: java.lang.Throwable -> L7
            r5 = r2
        L13:
            if (r1 != 0) goto L18
            java.lang.reflect.Constructor<?> r1 = r0.voiceUploadCdnCtor     // Catch: java.lang.Throwable -> L7
            r5 = 1
        L18:
            if (r1 != 0) goto L1f
            java.lang.Object r4 = r3.o(r4)     // Catch: java.lang.Throwable -> L7
            return r4
        L1f:
            if (r5 == 0) goto L2c
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L7
            java.lang.Object[] r5 = new java.lang.Object[]{r4, r5}     // Catch: java.lang.Throwable -> L7
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.newInstance(r1, r5)     // Catch: java.lang.Throwable -> L7
            return r4
        L2c:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L7
            java.lang.Object[] r5 = new java.lang.Object[]{r4, r5}     // Catch: java.lang.Throwable -> L7
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.newInstance(r1, r5)     // Catch: java.lang.Throwable -> L7
            if (r5 == 0) goto L3b
            return r5
        L3b:
            java.lang.Object r4 = r3.o(r4)     // Catch: java.lang.Throwable -> L7
            return r4
        L40:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "创建语音上传请求异常: "
            r0.<init>(r1)
            java.lang.String r5 = r5.getMessage()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r3.m(r5)
            java.lang.Object r4 = r3.o(r4)
            return r4
    }

    public final java.lang.Object o(java.lang.String r10) {
            r9 = this;
            h.Hchat.dexkit.DexFinder r0 = r9.f6841a
            java.lang.Class<?> r0 = r0.voiceUploadClass
            if (r0 != 0) goto L7
            goto L70
        L7:
            java.lang.reflect.Constructor[] r0 = r0.getDeclaredConstructors()
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Le:
            if (r3 >= r1) goto L70
            r4 = r0[r3]
            java.lang.Class[] r5 = r4.getParameterTypes()     // Catch: java.lang.Throwable -> L6d
            int r6 = r5.length     // Catch: java.lang.Throwable -> L6d
            if (r6 == 0) goto L6d
            r6 = r5[r2]     // Catch: java.lang.Throwable -> L6d
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            if (r6 == r7) goto L20
            goto L6d
        L20:
            h.Hchat.utils.KavaReflector.accessible(r4)     // Catch: java.lang.Throwable -> L6d
            int r6 = r5.length     // Catch: java.lang.Throwable -> L6d
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L6d
            r6[r2] = r10     // Catch: java.lang.Throwable -> L6d
            r7 = 1
        L29:
            int r8 = r5.length     // Catch: java.lang.Throwable -> L6d
            if (r7 >= r8) goto L37
            r8 = r5[r7]     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r8 = g(r8)     // Catch: java.lang.Throwable -> L6d
            r6[r7] = r8     // Catch: java.lang.Throwable -> L6d
            int r7 = r7 + 1
            goto L29
        L37:
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.newInstance(r4, r6)     // Catch: java.lang.Throwable -> L6d
            if (r5 == 0) goto L6d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            r6.<init>()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r7 = "语音上传请求使用兜底构造: "
            r6.append(r7)     // Catch: java.lang.Throwable -> L6d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            r7.<init>()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r8 = r4.getName()     // Catch: java.lang.Throwable -> L6d
            r7.append(r8)     // Catch: java.lang.Throwable -> L6d
            java.lang.Class[] r4 = r4.getParameterTypes()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r4 = java.util.Arrays.toString(r4)     // Catch: java.lang.Throwable -> L6d
            r7.append(r4)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r4 = r7.toString()     // Catch: java.lang.Throwable -> L6d
            r6.append(r4)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L6d
            r9.m(r4)     // Catch: java.lang.Throwable -> L6d
            return r5
        L6d:
            int r3 = r3 + 1
            goto Le
        L70:
            r10 = 0
            return r10
    }

    public final ac.k p(java.io.File r11) {
            r10 = this;
            java.lang.String r0 = r11.getAbsolutePath()
            r1 = 0
            me.yun.silk.SilkCodec r2 = new me.yun.silk.SilkCodec     // Catch: java.lang.Throwable -> Lf
            r2.<init>()     // Catch: java.lang.Throwable -> Lf
            int r0 = r2.getFileType(r0)     // Catch: java.lang.Throwable -> Lf
            goto L10
        Lf:
            r0 = r1
        L10:
            r2 = 1
            r3 = 0
            if (r0 != r2) goto L1a
            ac.k r1 = new ac.k
            r1.<init>(r11, r0, r3)
            return r1
        L1a:
            r4 = 0
            if (r0 <= r2) goto L5a
            java.io.File r0 = r10.f(r11)
            if (r0 != 0) goto L25
            goto L88
        L25:
            int r11 = r10.d(r11, r0)
            if (r11 != 0) goto L3f
            boolean r1 = r0.isFile()
            if (r1 == 0) goto L3f
            long r6 = r0.length()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 <= 0) goto L3f
            ac.k r11 = new ac.k
            r11.<init>(r0, r2, r0)
            return r11
        L3f:
            boolean r1 = r0.delete()
            if (r1 != 0) goto L48
            r0.deleteOnExit()
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "发送语音失败: 转 Silk 失败 code="
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r10.m(r11)
            return r3
        L5a:
            if (r0 != 0) goto Lbe
            java.lang.String r6 = r11.getAbsolutePath()
            android.media.MediaMetadataRetriever r7 = new android.media.MediaMetadataRetriever
            r7.<init>()
            r7.setDataSource(r6)     // Catch: java.lang.Throwable -> L7d
            r6 = 9
            java.lang.String r6 = r7.extractMetadata(r6)     // Catch: java.lang.Throwable -> L7d
            boolean r8 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L7d
            if (r8 != 0) goto L7d
            long r8 = java.lang.Long.parseLong(r6)     // Catch: java.lang.Throwable -> L7d
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 <= 0) goto L7d
            r1 = r2
        L7d:
            r7.release()     // Catch: java.lang.Throwable -> L80
        L80:
            if (r1 == 0) goto Lbe
            java.io.File r0 = r10.f(r11)
            if (r0 != 0) goto L89
        L88:
            return r3
        L89:
            int r11 = r10.d(r11, r0)
            if (r11 != 0) goto La3
            boolean r1 = r0.isFile()
            if (r1 == 0) goto La3
            long r6 = r0.length()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 <= 0) goto La3
            ac.k r11 = new ac.k
            r11.<init>(r0, r2, r0)
            return r11
        La3:
            boolean r1 = r0.delete()
            if (r1 != 0) goto Lac
            r0.deleteOnExit()
        Lac:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "发送语音失败: 未知音频转 Silk 失败 code="
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r10.m(r11)
            return r3
        Lbe:
            ac.k r1 = new ac.k
            r1.<init>(r11, r0, r3)
            return r1
    }

    public final java.lang.String q(java.lang.String r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = ""
            if (r0 != 0) goto L2b
            h.Hchat.dexkit.DexFinder r0 = r3.f6841a
            java.lang.reflect.Method r0 = r0.voiceFullPathMethod
            if (r0 != 0) goto Lf
            goto L2b
        Lf:
            r0 = 0
            java.lang.String r4 = r3.k(r4, r0)     // Catch: java.lang.Throwable -> L15
            return r4
        L15:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "解析语音路径异常: "
            r0.<init>(r2)
            java.lang.String r4 = r4.getMessage()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.m(r4)
        L2b:
            return r1
    }

    public final boolean r(j8.w r10) {
            r9 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto Lf
            boolean r10 = r10.run()
            return r10
        Lf:
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.<init>(r0)
            java.util.concurrent.CountDownLatch r4 = new java.util.concurrent.CountDownLatch
            r6 = 1
            r4.<init>(r6)
            b9.c r0 = new b9.c
            r5 = 9
            r1 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            android.os.Handler r10 = j8.y.f6840h
            boolean r10 = r10.post(r0)
            r0 = 0
            if (r10 != 0) goto L34
            java.lang.String r10 = "语音主线程任务投递失败"
            r9.m(r10)
            return r0
        L34:
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L54
            r7 = 90
            boolean r10 = r4.await(r7, r10)     // Catch: java.lang.InterruptedException -> L54
            if (r10 != 0) goto L44
            java.lang.String r10 = "语音主线程任务执行超时"
            r9.m(r10)     // Catch: java.lang.InterruptedException -> L54
            return r0
        L44:
            java.lang.Object r10 = r2.get()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            if (r10 == 0) goto L53
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L53
            return r6
        L53:
            return r0
        L54:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
            java.lang.String r10 = "语音主线程任务等待被中断"
            r9.m(r10)
            return r0
    }

    public final boolean s(int r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 != 0) goto L6c
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto Le
            goto L6c
        Le:
            java.io.File r0 = new java.io.File
            r0.<init>(r6)
            boolean r2 = r0.isFile()
            if (r2 != 0) goto L2b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "发送语音失败: 文件不存在 "
            r4.<init>(r5)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.m(r4)
            return r1
        L2b:
            boolean r2 = r3.b()
            if (r2 != 0) goto L37
            java.lang.String r4 = "发送语音失败: API未就绪"
            r3.m(r4)
            return r1
        L37:
            ac.k r0 = r3.p(r0)
            if (r0 == 0) goto L5a
            java.lang.Object r2 = r0.f178i
            java.io.File r2 = (java.io.File) r2
            boolean r2 = r2.isFile()
            if (r2 != 0) goto L48
            goto L5a
        L48:
            j8.t r6 = new j8.t     // Catch: java.lang.Throwable -> L55
            r6.<init>(r3, r5, r0, r4)     // Catch: java.lang.Throwable -> L55
            boolean r4 = r3.r(r6)     // Catch: java.lang.Throwable -> L55
            r0.i()
            return r4
        L55:
            r4 = move-exception
            r0.i()
            throw r4
        L5a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "发送语音失败: 音频转换失败 "
            r4.<init>(r5)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.m(r4)
            return r1
        L6c:
            java.lang.String r4 = "发送语音失败: talker/voicePath为空"
            r3.m(r4)
            return r1
    }

    public final boolean t(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L8
            r0 = 0
            goto Lc
        L8:
            int r0 = h(r3)
        Lc:
            boolean r2 = r1.s(r0, r2, r3)
            return r2
    }

    public final void u() {
            r6 = this;
            h.Hchat.dexkit.DexFinder r0 = r6.f6841a
            java.lang.reflect.Method r0 = r0.voicePlaybackStopMethod
            java.lang.Object r1 = r6.f6844d
            monitor-enter(r1)
            long r2 = r6.f6847g     // Catch: java.lang.Throwable -> L29
            r4 = 1
            long r2 = r2 + r4
            r6.f6847g = r2     // Catch: java.lang.Throwable -> L29
            java.lang.Object r2 = r6.f6845e     // Catch: java.lang.Throwable -> L29
            r3 = 0
            r6.f6845e = r3     // Catch: java.lang.Throwable -> L29
            r6.f6846f = r3     // Catch: java.lang.Throwable -> L29
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L28
            if (r0 == 0) goto L28
            java.lang.Class r0 = r0.getDeclaringClass()
            java.lang.Class r1 = r2.getClass()
            if (r0 == r1) goto L25
            goto L28
        L25:
            r6.v(r2)
        L28:
            return
        L29:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L29
            throw r0
    }

    public final void v(java.lang.Object r4) {
            r3 = this;
            h.Hchat.dexkit.DexFinder r0 = r3.f6841a
            java.lang.reflect.Method r0 = r0.voicePlaybackStopMethod
            if (r4 == 0) goto L33
            if (r0 == 0) goto L33
            java.lang.Class r1 = r0.getDeclaringClass()
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto L13
            goto L33
        L13:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1d
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L1d
            h.Hchat.utils.KavaReflector.invokeOrThrow(r0, r4, r1)     // Catch: java.lang.Throwable -> L1d
            return
        L1d:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "停止原语音播放失败: "
            r0.<init>(r1)
            java.lang.String r4 = r4.getMessage()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.m(r4)
        L33:
            return
    }

    public final java.lang.reflect.Method w(java.lang.Class r4) {
            r3 = this;
            java.lang.reflect.Method r0 = r3.f6843c
            if (r0 == 0) goto Lf
            java.lang.Class r1 = r0.getDeclaringClass()
            boolean r1 = r1.isAssignableFrom(r4)
            if (r1 == 0) goto Lf
            return r0
        Lf:
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredMethods(r4)
            java.util.Iterator r4 = r4.iterator()
        L17:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r4.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.Class[] r1 = r0.getParameterTypes()
            int r1 = r1.length
            if (r1 != 0) goto L17
            java.lang.Class r1 = r0.getReturnType()
            java.lang.Class<android.content.ContentValues> r2 = android.content.ContentValues.class
            if (r1 == r2) goto L33
            goto L17
        L33:
            java.lang.reflect.Method r4 = h.Hchat.utils.KavaReflector.accessible(r0)
            r3.f6843c = r4
            java.lang.reflect.Method r4 = r3.f6843c
            return r4
        L3c:
            r4 = 0
            return r4
    }

    public final java.lang.String y() {
            r6 = this;
            h.Hchat.dexkit.DexFinder r0 = r6.f6841a
            java.lang.Class<?> r0 = r0.voiceUploadClass
            if (r0 != 0) goto L9
            java.lang.String r0 = "[]"
            return r0
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "["
            r1.<init>(r2)
            java.lang.reflect.Constructor[] r0 = r0.getDeclaredConstructors()
            r2 = 0
        L15:
            int r3 = r0.length
            if (r2 >= r3) goto L47
            if (r2 <= 0) goto L1f
            java.lang.String r3 = ", "
            r1.append(r3)
        L1f:
            r3 = r0[r2]
            if (r3 != 0) goto L26
            java.lang.String r3 = "null"
            goto L41
        L26:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r3.getName()
            r4.append(r5)
            java.lang.Class[] r3 = r3.getParameterTypes()
            java.lang.String r3 = java.util.Arrays.toString(r3)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        L41:
            r1.append(r3)
            int r2 = r2 + 1
            goto L15
        L47:
            r0 = 93
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
