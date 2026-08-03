package z8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final java.util.List f22646g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f22647h = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f22648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y9.b f22649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.content.SharedPreferences f22650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.content.SharedPreferences f22651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap.KeySetView f22652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f22653f;

    static {
            java.lang.String r0 = "scene"
            java.lang.String r1 = "start"
            java.lang.String r2 = "MicroMsg.VoIP.VoIPAudioManager"
            java.lang.String r3 = "continuePlayStartRing username:"
            java.lang.String r4 = "isOutCall"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r0, r1}
            java.lang.String r5 = "scene"
            java.lang.String r6 = "start"
            java.lang.String r1 = "startRing() called with: username = "
            java.lang.String r2 = "isOutCall"
            java.lang.String r3 = "isSpeakOn"
            java.lang.String r4 = "seekStartMs"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6}
            java.lang.String[][] r0 = new java.lang.String[][]{r0, r1}
            java.util.List r0 = a.a.y0(r0)
            z8.g.f22646g = r0
            java.lang.String r0 = ", roomType = "
            java.lang.String r1 = ", roomRole = "
            java.lang.String r2 = "MicroMsg.VoIPMP.CoreV2"
            java.lang.String r3 = "startRing() called with: username = "
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            z8.g.f22647h = r0
            return
    }

    public g(r8.g r1, y9.b r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f22648a = r1
            r0.f22649b = r2
            android.content.Context r1 = r1.f11620a
            java.lang.String r2 = "Hchat_call_media_limit_config"
            android.content.SharedPreferences r2 = ub.b.c(r1, r2)
            r0.f22650c = r2
            java.lang.String r2 = "Hchat_call_ringtone_block_method_cache"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            r0.f22651d = r1
            java.util.concurrent.ConcurrentHashMap$KeySetView r1 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            r0.f22652e = r1
            return
    }

    public static boolean a(java.lang.reflect.Method r3, java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r3.getParameterTypes()
            java.lang.Class r1 = r3.getDeclaringClass()
            java.lang.Class r4 = r4.getDeclaringClass()
            boolean r4 = gg.l.a(r1, r4)
            r1 = 0
            if (r4 == 0) goto L3a
            int r4 = r0.length
            r2 = 1
            if (r4 != r2) goto L3a
            r4 = r0[r1]
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r4 = gg.l.a(r4, r0)
            if (r4 == 0) goto L3a
            java.lang.Class r4 = r3.getReturnType()
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r4 = gg.l.a(r4, r0)
            if (r4 == 0) goto L3a
            boolean r4 = h.Hchat.utils.KavaReflector.isStatic(r3)
            if (r4 != 0) goto L3a
            boolean r3 = h.Hchat.utils.KavaReflector.isAbstract(r3)
            if (r3 != 0) goto L3a
            return r2
        L3a:
            return r1
    }

    public static boolean b(java.lang.reflect.Method r5) {
            java.lang.Class[] r0 = r5.getParameterTypes()
            int r1 = r0.length
            r2 = 4
            r3 = 0
            if (r1 != r2) goto L4d
            r1 = r0[r3]
            java.lang.Class r2 = java.lang.Long.TYPE
            boolean r1 = gg.l.a(r1, r2)
            if (r1 == 0) goto L4d
            r1 = 1
            r2 = r0[r1]
            java.lang.Class<byte[]> r4 = byte[].class
            boolean r2 = gg.l.a(r2, r4)
            if (r2 == 0) goto L4d
            r2 = 2
            r2 = r0[r2]
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r2 = gg.l.a(r2, r4)
            if (r2 == 0) goto L4d
            r2 = 3
            r0 = r0[r2]
            java.lang.Class r2 = java.lang.Boolean.TYPE
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L4d
            java.lang.Class r0 = r5.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L4d
            boolean r0 = h.Hchat.utils.KavaReflector.isStatic(r5)
            if (r0 != 0) goto L4d
            boolean r5 = h.Hchat.utils.KavaReflector.isAbstract(r5)
            if (r5 != 0) goto L4d
            return r1
        L4d:
            return r3
    }

    public static boolean c(java.lang.reflect.Method r10) {
            java.lang.Class[] r0 = r10.getParameterTypes()
            int r1 = r0.length
            r2 = 2
            java.lang.Class r3 = java.lang.Boolean.TYPE
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 1
            r6 = 0
            r7 = 3
            if (r1 != r7) goto L29
            r1 = r0[r6]
            boolean r1 = gg.l.a(r1, r4)
            if (r1 == 0) goto L29
            r1 = r0[r5]
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L29
            r1 = r0[r2]
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L29
            r1 = r5
            goto L2a
        L29:
            r1 = r6
        L2a:
            int r8 = r0.length
            r9 = 5
            if (r8 != r9) goto L5b
            r8 = r0[r6]
            boolean r4 = gg.l.a(r8, r4)
            if (r4 == 0) goto L5b
            r4 = r0[r5]
            boolean r4 = gg.l.a(r4, r3)
            if (r4 == 0) goto L5b
            r2 = r0[r2]
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto L5b
            r2 = r0[r7]
            java.lang.Class r4 = java.lang.Long.TYPE
            boolean r2 = gg.l.a(r2, r4)
            if (r2 == 0) goto L5b
            r2 = 4
            r0 = r0[r2]
            boolean r0 = gg.l.a(r0, r3)
            if (r0 == 0) goto L5b
            r0 = r5
            goto L5c
        L5b:
            r0 = r6
        L5c:
            if (r1 != 0) goto L60
            if (r0 == 0) goto L79
        L60:
            java.lang.Class r0 = r10.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L79
            boolean r0 = h.Hchat.utils.KavaReflector.isStatic(r10)
            if (r0 != 0) goto L79
            boolean r10 = h.Hchat.utils.KavaReflector.isAbstract(r10)
            if (r10 != 0) goto L79
            return r5
        L79:
            return r6
    }

    public final java.util.List d() {
            r17 = this;
            r1 = r17
            r8.g r0 = r1.f22648a
            android.content.Context r2 = r0.f11620a
            java.lang.ClassLoader r3 = r0.f11622c
            r3.getClass()
            l8.i r2 = o8.k.a(r2, r3)
            java.lang.String r2 = r2.f7933h
            java.lang.ClassLoader r3 = r0.f11622c
            android.content.SharedPreferences r4 = r1.f22651d
            java.lang.String r5 = "core_start_methods_v1"
            java.util.List r3 = e8.b.f(r4, r2, r3, r5)
            java.lang.ClassLoader r6 = r0.f11622c
            java.lang.String r7 = "core_ack_methods_v1"
            java.util.List r8 = e8.b.f(r4, r2, r6, r7)
            int r9 = r3.size()
            int r10 = r8.size()
            if (r9 != r10) goto Lc3
            boolean r9 = r3.isEmpty()
            if (r9 != 0) goto Lc3
            java.util.Iterator r9 = r3.iterator()
            java.util.Iterator r10 = r8.iterator()
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = tf.n.e1(r3)
            int r13 = tf.n.e1(r8)
            int r12 = java.lang.Math.min(r12, r13)
            r11.<init>(r12)
        L4c:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L69
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L69
            java.lang.Object r12 = r9.next()
            java.lang.Object r13 = r10.next()
            sf.e r14 = new sf.e
            r14.<init>(r12, r13)
            r11.add(r14)
            goto L4c
        L69:
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = tf.n.e1(r11)
            r9.<init>(r10)
            java.util.Iterator r10 = r11.iterator()
        L76:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L93
            java.lang.Object r11 = r10.next()
            sf.e r11 = (sf.e) r11
            java.lang.Object r12 = r11.f12418g
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            java.lang.Object r11 = r11.f12419h
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            z8.f r13 = new z8.f
            r13.<init>(r12, r11)
            r9.add(r13)
            goto L76
        L93:
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L9a
            goto Lc2
        L9a:
            java.util.Iterator r10 = r9.iterator()
        L9e:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lc2
            java.lang.Object r11 = r10.next()
            z8.f r11 = (z8.f) r11
            java.lang.reflect.Method r12 = r11.f22644a
            boolean r12 = b(r12)
            if (r12 == 0) goto Lbe
            java.lang.reflect.Method r12 = r11.f22645b
            java.lang.reflect.Method r11 = r11.f22644a
            boolean r11 = a(r12, r11)
            if (r11 == 0) goto Lbe
            r11 = 1
            goto Lbf
        Lbe:
            r11 = 0
        Lbf:
            if (r11 != 0) goto L9e
            goto Lc3
        Lc2:
            return r9
        Lc3:
            boolean r3 = r3.isEmpty()
            java.lang.String r9 = "core_scan_runtime_v1"
            if (r3 == 0) goto Ld1
            boolean r3 = r8.isEmpty()
            if (r3 != 0) goto Ldc
        Ld1:
            android.content.SharedPreferences$Editor r3 = r4.edit()
            android.content.SharedPreferences$Editor r3 = r3.remove(r9)
            r3.apply()
        Ldc:
            e8.b.a(r4, r2, r5)
            e8.b.a(r4, r2, r7)
            java.lang.String r3 = ""
            java.lang.String r3 = r4.getString(r9, r3)
            boolean r3 = gg.l.a(r3, r2)
            tf.t r8 = tf.t.f13167g
            if (r3 == 0) goto Lf1
            return r8
        Lf1:
            org.luckypray.dexkit.DexKitBridge r0 = r0.f11623d     // Catch: java.lang.Throwable -> L110
            ch.e r3 = new ch.e     // Catch: java.lang.Throwable -> L110
            r3.<init>()     // Catch: java.lang.Throwable -> L110
            fh.k r10 = new fh.k     // Catch: java.lang.Throwable -> L110
            r10.<init>()     // Catch: java.lang.Throwable -> L110
            java.lang.String[] r11 = z8.g.f22647h     // Catch: java.lang.Throwable -> L110
            int r12 = r11.length     // Catch: java.lang.Throwable -> L110
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r12)     // Catch: java.lang.Throwable -> L110
            java.lang.String[] r11 = (java.lang.String[]) r11     // Catch: java.lang.Throwable -> L110
            r10.r0(r11)     // Catch: java.lang.Throwable -> L110
            r3.f1666h = r10     // Catch: java.lang.Throwable -> L110
            hh.p r0 = r0.findMethod(r3)     // Catch: java.lang.Throwable -> L110
            goto L117
        L110:
            r0 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r0)
            r0 = r3
        L117:
            java.lang.Throwable r3 = sf.g.b(r0)
            if (r3 != 0) goto L27c
            hh.p r0 = (hh.p) r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r10 = r0.iterator()
        L128:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L1f9
            java.lang.Object r0 = r10.next()
            r11 = r0
            hh.o r11 = (hh.o) r11
            java.lang.reflect.Method r0 = r11.r(r6)     // Catch: java.lang.Throwable -> L13a
            goto L141
        L13a:
            r0 = move-exception
            sf.f r12 = new sf.f
            r12.<init>(r0)
            r0 = r12
        L141:
            boolean r12 = r0 instanceof sf.f
            if (r12 == 0) goto L147
            r0 = 0
        L147:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto L1f1
            boolean r12 = b(r0)
            if (r12 == 0) goto L153
            r12 = r0
            goto L154
        L153:
            r12 = 0
        L154:
            if (r12 == 0) goto L1f1
            hh.p r0 = r11.q()     // Catch: java.lang.Throwable -> L15b
            goto L162
        L15b:
            r0 = move-exception
            sf.f r11 = new sf.f
            r11.<init>(r0)
            r0 = r11
        L162:
            boolean r11 = r0 instanceof sf.f
            if (r11 == 0) goto L168
            r0 = r8
        L168:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r14 = r0.iterator()
        L173:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L199
            java.lang.Object r0 = r14.next()
            hh.o r0 = (hh.o) r0
            java.lang.reflect.Method r0 = r0.r(r6)     // Catch: java.lang.Throwable -> L184
            goto L18b
        L184:
            r0 = move-exception
            sf.f r15 = new sf.f
            r15.<init>(r0)
            r0 = r15
        L18b:
            boolean r15 = r0 instanceof sf.f
            if (r15 == 0) goto L191
            r0 = 0
        L191:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto L173
            r11.add(r0)
            goto L173
        L199:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        L1a2:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L1b9
            java.lang.Object r14 = r11.next()
            r15 = r14
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            boolean r15 = a(r15, r12)
            if (r15 == 0) goto L1a2
            r0.add(r14)
            goto L1a2
        L1b9:
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1c7:
            boolean r15 = r0.hasNext()
            if (r15 == 0) goto L1e3
            java.lang.Object r15 = r0.next()
            r16 = r15
            java.lang.reflect.Method r16 = (java.lang.reflect.Method) r16
            java.lang.String r13 = r16.toGenericString()
            boolean r13 = r11.add(r13)
            if (r13 == 0) goto L1c7
            r14.add(r15)
            goto L1c7
        L1e3:
            java.lang.Object r0 = tf.m.I1(r14)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto L1f1
            z8.f r13 = new z8.f
            r13.<init>(r12, r0)
            goto L1f2
        L1f1:
            r13 = 0
        L1f2:
            if (r13 == 0) goto L128
            r3.add(r13)
            goto L128
        L1f9:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r3 = r3.iterator()
        L207:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L224
            java.lang.Object r8 = r3.next()
            r10 = r8
            z8.f r10 = (z8.f) r10
            java.lang.reflect.Method r10 = r10.f22644a
            java.lang.String r10 = r10.toGenericString()
            boolean r10 = r0.add(r10)
            if (r10 == 0) goto L207
            r6.add(r8)
            goto L207
        L224:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L270
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = tf.n.e1(r6)
            r0.<init>(r3)
            java.util.Iterator r3 = r6.iterator()
        L237:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L249
            java.lang.Object r8 = r3.next()
            z8.f r8 = (z8.f) r8
            java.lang.reflect.Method r8 = r8.f22644a
            r0.add(r8)
            goto L237
        L249:
            e8.b r3 = e8.b.f2358a
            r3.j(r4, r2, r5, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r5 = tf.n.e1(r6)
            r0.<init>(r5)
            java.util.Iterator r5 = r6.iterator()
        L25b:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L26d
            java.lang.Object r8 = r5.next()
            z8.f r8 = (z8.f) r8
            java.lang.reflect.Method r8 = r8.f22645b
            r0.add(r8)
            goto L25b
        L26d:
            r3.j(r4, r2, r7, r0)
        L270:
            android.content.SharedPreferences$Editor r0 = r4.edit()
            android.content.SharedPreferences$Editor r0 = r0.putString(r9, r2)
            r0.apply()
            return r6
        L27c:
            y9.b r0 = r1.f22649b
            java.lang.String r2 = "定位微信 CoreV2 通话铃声入口失败"
            r0.invoke(r2, r3)
            return r8
    }

    public final java.util.List e() {
            r14 = this;
            r8.g r0 = r14.f22648a
            android.content.Context r1 = r0.f11620a
            java.lang.ClassLoader r2 = r0.f11622c
            r2.getClass()
            l8.i r1 = o8.k.a(r1, r2)
            java.lang.String r1 = r1.f7933h
            java.lang.ClassLoader r2 = r0.f11622c
            android.content.SharedPreferences r3 = r14.f22651d
            java.lang.String r4 = "direction_methods_v1"
            java.util.List r2 = e8.b.f(r3, r1, r2, r4)
            boolean r5 = r2.isEmpty()
            r6 = 0
            if (r5 != 0) goto L3d
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L27
            goto L3e
        L27:
            java.util.Iterator r5 = r2.iterator()
        L2b:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L3e
            java.lang.Object r7 = r5.next()
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            boolean r7 = c(r7)
            if (r7 != 0) goto L2b
        L3d:
            r2 = r6
        L3e:
            if (r2 == 0) goto L41
            return r2
        L41:
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.List r5 = z8.g.f22646g
            java.util.Iterator r5 = r5.iterator()
        L4c:
            boolean r7 = r5.hasNext()
            java.lang.String r8 = ""
            y9.b r9 = r14.f22649b
            if (r7 == 0) goto Le8
            java.lang.Object r7 = r5.next()
            java.lang.String[] r7 = (java.lang.String[]) r7
            org.luckypray.dexkit.DexKitBridge r10 = r0.f11623d     // Catch: java.lang.Throwable -> La9
            ch.e r11 = new ch.e     // Catch: java.lang.Throwable -> La9
            r11.<init>()     // Catch: java.lang.Throwable -> La9
            fh.k r12 = new fh.k     // Catch: java.lang.Throwable -> La9
            r12.<init>()     // Catch: java.lang.Throwable -> La9
            int r13 = r7.length     // Catch: java.lang.Throwable -> La9
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r7, r13)     // Catch: java.lang.Throwable -> La9
            java.lang.String[] r13 = (java.lang.String[]) r13     // Catch: java.lang.Throwable -> La9
            r12.r0(r13)     // Catch: java.lang.Throwable -> La9
            r11.f1666h = r12     // Catch: java.lang.Throwable -> La9
            hh.p r10 = r10.findMethod(r11)     // Catch: java.lang.Throwable -> La9
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La9
            r11.<init>()     // Catch: java.lang.Throwable -> La9
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> La9
        L81:
            boolean r12 = r10.hasNext()     // Catch: java.lang.Throwable -> La9
            if (r12 == 0) goto Laf
            java.lang.Object r12 = r10.next()     // Catch: java.lang.Throwable -> La9
            hh.o r12 = (hh.o) r12     // Catch: java.lang.Throwable -> La9
            java.lang.ClassLoader r13 = r0.f11622c     // Catch: java.lang.Throwable -> L94
            java.lang.reflect.Method r12 = r12.r(r13)     // Catch: java.lang.Throwable -> L94
            goto L9b
        L94:
            r12 = move-exception
            sf.f r13 = new sf.f     // Catch: java.lang.Throwable -> La9
            r13.<init>(r12)     // Catch: java.lang.Throwable -> La9
            r12 = r13
        L9b:
            boolean r13 = r12 instanceof sf.f     // Catch: java.lang.Throwable -> La9
            if (r13 == 0) goto La1
            r12 = r6
        La1:
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12     // Catch: java.lang.Throwable -> La9
            if (r12 == 0) goto L81
            r11.add(r12)     // Catch: java.lang.Throwable -> La9
            goto L81
        La9:
            r10 = move-exception
            sf.f r11 = new sf.f
            r11.<init>(r10)
        Laf:
            java.lang.Throwable r10 = sf.g.b(r11)
            if (r10 != 0) goto Lb6
            goto Lcb
        Lb6:
            java.lang.Object r7 = tf.l.z0(r7)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto Lbf
            goto Lc0
        Lbf:
            r8 = r7
        Lc0:
            java.lang.String r7 = "定位微信通话铃声入口失败: "
            java.lang.String r7 = r7.concat(r8)
            r9.invoke(r7, r10)
            tf.t r11 = tf.t.f13167g
        Lcb:
            java.util.List r11 = (java.util.List) r11
            java.util.Iterator r7 = r11.iterator()
        Ld1:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L4c
            java.lang.Object r8 = r7.next()
            r9 = r8
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            boolean r9 = c(r9)
            if (r9 == 0) goto Ld1
            r2.add(r8)
            goto Ld1
        Le8:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
        Lf6:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L111
            java.lang.Object r7 = r2.next()
            r10 = r7
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            java.lang.String r10 = r10.toGenericString()
            boolean r10 = r0.add(r10)
            if (r10 == 0) goto Lf6
            r5.add(r7)
            goto Lf6
        L111:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L13b
            java.lang.String r0 = "cache.key"
            android.content.SharedPreferences$Editor r2 = r3.edit()     // Catch: java.lang.Throwable -> L135
            java.lang.String r3 = r3.getString(r0, r8)     // Catch: java.lang.Throwable -> L135
            boolean r3 = gg.l.a(r3, r1)     // Catch: java.lang.Throwable -> L135
            if (r3 != 0) goto L12e
            android.content.SharedPreferences$Editor r3 = r2.clear()     // Catch: java.lang.Throwable -> L135
            r3.putString(r0, r1)     // Catch: java.lang.Throwable -> L135
        L12e:
            android.content.SharedPreferences$Editor r0 = r2.remove(r4)     // Catch: java.lang.Throwable -> L135
            r0.apply()     // Catch: java.lang.Throwable -> L135
        L135:
            java.lang.String r0 = "未定位微信通话铃声入口"
            r9.invoke(r0, r6)
            goto L140
        L13b:
            e8.b r0 = e8.b.f2358a
            r0.j(r3, r1, r4, r5)
        L140:
            return r5
    }
}
