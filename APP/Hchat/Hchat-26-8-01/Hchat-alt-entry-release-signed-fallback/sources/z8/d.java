package z8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final java.util.List f22635h = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f22636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y9.b f22637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.content.SharedPreferences f22638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.ThreadLocal f22639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f22640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap.KeySetView f22641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f22642g;

    static {
            java.lang.String r0 = "isVoiceUsing"
            java.lang.String r1 = "checkAppBrandVoiceUsingAndShowToast isVoiceUsing:%b, isCameraUsing:%b"
            java.lang.String r2 = "isMultiTalking"
            java.lang.String r3 = "isCameraUsing"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            java.util.List r0 = a.a.y0(r0)
            z8.d.f22635h = r0
            return
    }

    public d(r8.g r1, y9.b r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f22636a = r1
            r0.f22637b = r2
            android.content.Context r1 = r1.f11620a
            java.lang.String r2 = "Hchat_call_media_limit_method_cache"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            r0.f22638c = r1
            java.lang.ThreadLocal r1 = new java.lang.ThreadLocal
            r1.<init>()
            r0.f22639d = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f22640e = r1
            java.util.concurrent.ConcurrentHashMap$KeySetView r1 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            r0.f22641f = r1
            return
    }

    public static boolean a(java.lang.reflect.Method r2) {
            boolean r0 = h.Hchat.utils.KavaReflector.isStatic(r2)
            if (r0 == 0) goto L28
            java.lang.Class r0 = r2.getReturnType()
            java.lang.Class r1 = java.lang.Boolean.TYPE
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L1e
            java.lang.Class r0 = r2.getReturnType()
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L28
        L1e:
            java.lang.Class[] r2 = r2.getParameterTypes()
            int r2 = r2.length
            r0 = 3
            if (r2 > r0) goto L28
            r2 = 1
            return r2
        L28:
            r2 = 0
            return r2
    }

    public static boolean b(java.util.List r3) {
            int r0 = r3.size()
            r1 = 7
            if (r0 >= r1) goto L8
            goto L56
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r3)
            r0.<init>(r1)
            java.util.Iterator r1 = r3.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Class r2 = r2.getDeclaringClass()
            r0.add(r2)
            goto L15
        L29:
            java.util.Set r0 = tf.m.T1(r0)
            java.util.List r0 = tf.m.P1(r0)
            int r0 = r0.size()
            r1 = 1
            if (r0 == r1) goto L39
            goto L56
        L39:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L40
            goto L58
        L40:
            java.util.Iterator r3 = r3.iterator()
        L44:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L58
            java.lang.Object r0 = r3.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            boolean r0 = a(r0)
            if (r0 != 0) goto L44
        L56:
            r3 = 0
            return r3
        L58:
            return r1
    }

    public static boolean c(java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r4)
            r2 = 0
            if (r1 == 0) goto L40
            java.lang.String r1 = "com.tencent.mm.ui.chatting.viewitems."
            boolean r1 = eh.a.A(r4, r2, r1)
            if (r1 == 0) goto L40
            int r1 = r0.length
            r3 = 3
            if (r1 != r3) goto L40
            r1 = 2
            r0 = r0[r1]
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "com.tencent.mm.plugin.msgquote.model.MsgQuoteItem"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            java.lang.Class r0 = r4.getReturnType()
            java.lang.Class r1 = java.lang.Boolean.TYPE
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L3e
            java.lang.Class r4 = r4.getReturnType()
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r4 = gg.l.a(r4, r0)
            if (r4 == 0) goto L40
        L3e:
            r4 = 1
            return r4
        L40:
            return r2
    }

    public final java.util.List d() {
            r18 = this;
            r1 = r18
            r8.g r2 = r1.f22636a
            android.content.Context r0 = r2.f11620a
            java.lang.ClassLoader r3 = r2.f11622c
            r3.getClass()
            l8.i r0 = o8.k.a(r0, r3)
            java.lang.String r3 = r0.f7933h
            java.lang.ClassLoader r0 = r2.f11622c
            java.lang.ClassLoader r4 = r2.f11622c
            android.content.SharedPreferences r5 = r1.f22638c
            java.lang.String r6 = "device_occupy_methods_v1"
            java.util.List r0 = e8.b.f(r5, r3, r0, r6)
            boolean r7 = b(r0)
            if (r7 == 0) goto L24
            goto L25
        L24:
            r0 = 0
        L25:
            if (r0 == 0) goto L28
            return r0
        L28:
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            java.util.List r0 = z8.d.f22635h
            java.util.Iterator r10 = r0.iterator()
            r0 = 0
            r11 = r0
        L3a:
            boolean r0 = r10.hasNext()
            y9.b r12 = r1.f22637b
            tf.t r13 = tf.t.f13167g
            if (r0 == 0) goto L156
            java.lang.Object r0 = r10.next()
            int r14 = r11 + 1
            if (r11 < 0) goto L150
            r15 = r0
            java.lang.String r15 = (java.lang.String) r15
            org.luckypray.dexkit.DexKitBridge r0 = r2.f11623d     // Catch: java.lang.Throwable -> L75
            r16 = 0
            ch.e r8 = new ch.e     // Catch: java.lang.Throwable -> L71
            r8.<init>()     // Catch: java.lang.Throwable -> L71
            fh.k r1 = new fh.k     // Catch: java.lang.Throwable -> L71
            r1.<init>()     // Catch: java.lang.Throwable -> L71
            r17 = r2
            java.lang.String r2 = "MicroMsg.DeviceOccupy"
            java.lang.String[] r2 = new java.lang.String[]{r2, r15}     // Catch: java.lang.Throwable -> L6f
            r1.r0(r2)     // Catch: java.lang.Throwable -> L6f
            r8.f1666h = r1     // Catch: java.lang.Throwable -> L6f
            hh.p r0 = r0.findMethod(r8)     // Catch: java.lang.Throwable -> L6f
            goto L80
        L6f:
            r0 = move-exception
            goto L7a
        L71:
            r0 = move-exception
            r17 = r2
            goto L7a
        L75:
            r0 = move-exception
            r17 = r2
            r16 = 0
        L7a:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L80:
            java.lang.Throwable r1 = sf.g.b(r0)
            if (r1 != 0) goto L87
            goto L99
        L87:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "定位通话占用方法失败: "
            r0.<init>(r2)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r12.invoke(r0, r1)
            r0 = r13
        L99:
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r1 = r0.iterator()
        L9f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L149
            java.lang.Object r0 = r1.next()
            r2 = r0
            hh.o r2 = (hh.o) r2
            java.lang.reflect.Method r0 = r2.r(r4)     // Catch: java.lang.Throwable -> Lb1
            goto Lb8
        Lb1:
            r0 = move-exception
            sf.f r8 = new sf.f
            r8.<init>(r0)
            r0 = r8
        Lb8:
            boolean r8 = r0 instanceof sf.f
            if (r8 == 0) goto Lbf
            r0 = r16
        Lbf:
            r8 = r0
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            if (r8 == 0) goto L9f
            boolean r0 = a(r8)
            if (r0 != 0) goto Lcb
            goto L9f
        Lcb:
            r7.add(r8)
            if (r11 == 0) goto Ld1
            goto L9f
        Ld1:
            hh.p r0 = r2.q()     // Catch: java.lang.Throwable -> Ld6
            goto Ldd
        Ld6:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        Ldd:
            boolean r2 = r0 instanceof sf.f
            if (r2 == 0) goto Le3
            r0 = r13
        Le3:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r2 = r0.iterator()
        Le9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L9f
            java.lang.Object r0 = r2.next()
            hh.o r0 = (hh.o) r0
            java.lang.reflect.Method r0 = r0.r(r4)     // Catch: java.lang.Throwable -> Lfa
            goto L101
        Lfa:
            r0 = move-exception
            sf.f r12 = new sf.f
            r12.<init>(r0)
            r0 = r12
        L101:
            boolean r12 = r0 instanceof sf.f
            if (r12 == 0) goto L108
            r0 = r16
        L108:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto Le9
            java.lang.Class r12 = r8.getDeclaringClass()
            r12.getClass()
            java.lang.Class r15 = r0.getDeclaringClass()
            boolean r12 = gg.l.a(r15, r12)
            if (r12 == 0) goto Le9
            boolean r12 = h.Hchat.utils.KavaReflector.isStatic(r0)
            if (r12 == 0) goto Le9
            java.lang.Class[] r12 = r0.getParameterTypes()
            r12.getClass()
            int r12 = r12.length
            if (r12 != 0) goto Le9
            java.lang.Class r12 = r0.getReturnType()
            java.lang.Class r15 = java.lang.Boolean.TYPE
            boolean r12 = gg.l.a(r12, r15)
            if (r12 != 0) goto L145
            java.lang.Class r12 = r0.getReturnType()
            java.lang.Class<java.lang.Boolean> r15 = java.lang.Boolean.class
            boolean r12 = gg.l.a(r12, r15)
            if (r12 == 0) goto Le9
        L145:
            r9.add(r0)
            goto Le9
        L149:
            r1 = r18
            r11 = r14
            r2 = r17
            goto L3a
        L150:
            r16 = 0
            a.a.Q0()
            throw r16
        L156:
            r16 = 0
            r7.addAll(r9)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r1 = r7.iterator()
        L164:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L189
            java.lang.Object r2 = r1.next()
            r4 = r2
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.Class r4 = r4.getDeclaringClass()
            java.lang.Object r7 = r0.get(r4)
            if (r7 != 0) goto L183
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r0.put(r4, r7)
        L183:
            java.util.List r7 = (java.util.List) r7
            r7.add(r2)
            goto L164
        L189:
            java.util.Collection r0 = r0.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L198:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1af
            java.lang.Object r2 = r0.next()
            r4 = r2
            java.util.List r4 = (java.util.List) r4
            boolean r4 = b(r4)
            if (r4 == 0) goto L198
            r1.add(r2)
            goto L198
        L1af:
            java.lang.Object r0 = tf.m.I1(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L1e0
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1c5:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L1e2
            java.lang.Object r4 = r0.next()
            r7 = r4
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.String r7 = r7.toGenericString()
            boolean r7 = r1.add(r7)
            if (r7 == 0) goto L1c5
            r2.add(r4)
            goto L1c5
        L1e0:
            r2 = r16
        L1e2:
            if (r2 != 0) goto L1e5
            goto L1e6
        L1e5:
            r13 = r2
        L1e6:
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L214
            java.lang.String r0 = "cache.key"
            android.content.SharedPreferences$Editor r1 = r5.edit()     // Catch: java.lang.Throwable -> L20c
            java.lang.String r2 = ""
            java.lang.String r2 = r5.getString(r0, r2)     // Catch: java.lang.Throwable -> L20c
            boolean r2 = gg.l.a(r2, r3)     // Catch: java.lang.Throwable -> L20c
            if (r2 != 0) goto L205
            android.content.SharedPreferences$Editor r2 = r1.clear()     // Catch: java.lang.Throwable -> L20c
            r2.putString(r0, r3)     // Catch: java.lang.Throwable -> L20c
        L205:
            android.content.SharedPreferences$Editor r0 = r1.remove(r6)     // Catch: java.lang.Throwable -> L20c
            r0.apply()     // Catch: java.lang.Throwable -> L20c
        L20c:
            java.lang.String r0 = "通话占用方法组不完整或候选不唯一"
            r1 = r16
            r12.invoke(r0, r1)
            goto L219
        L214:
            e8.b r0 = e8.b.f2358a
            r0.j(r5, r3, r6, r13)
        L219:
            return r13
    }

    public final java.lang.reflect.Method e() {
            r13 = this;
            tf.t r0 = tf.t.f13167g
            r8.g r1 = r13.f22636a
            android.content.Context r2 = r1.f11620a
            java.lang.ClassLoader r3 = r1.f11622c
            r3.getClass()
            l8.i r2 = o8.k.a(r2, r3)
            java.lang.String r2 = r2.f7933h
            java.lang.ClassLoader r3 = r1.f11622c
            android.content.SharedPreferences r4 = r13.f22638c
            java.lang.String r5 = "voice_playback_guard_v1"
            java.lang.reflect.Method r3 = e8.b.c(r4, r2, r3, r5)
            r6 = 0
            if (r3 == 0) goto L29
            boolean r7 = c(r3)
            if (r7 == 0) goto L25
            goto L26
        L25:
            r3 = r6
        L26:
            if (r3 == 0) goto L29
            return r3
        L29:
            org.luckypray.dexkit.DexKitBridge r3 = r1.f11623d     // Catch: java.lang.Throwable -> La3
            ch.e r7 = new ch.e     // Catch: java.lang.Throwable -> La3
            r7.<init>()     // Catch: java.lang.Throwable -> La3
            fh.k r8 = new fh.k     // Catch: java.lang.Throwable -> La3
            r8.<init>()     // Catch: java.lang.Throwable -> La3
            java.lang.String r9 = "com.tencent.mm.ui.chatting.viewitems."
            r10 = 2
            r8.l0(r10, r9)     // Catch: java.lang.Throwable -> La3
            fh.k r9 = new fh.k     // Catch: java.lang.Throwable -> La3
            r9.<init>()     // Catch: java.lang.Throwable -> La3
            java.lang.String r10 = "com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent"
            r11 = 5
            r9.l0(r11, r10)     // Catch: java.lang.Throwable -> La3
            java.lang.String r10 = "<init>"
            gh.c r12 = new gh.c     // Catch: java.lang.Throwable -> La3
            r12.<init>(r10, r11)     // Catch: java.lang.Throwable -> La3
            r9.f3950g = r12     // Catch: java.lang.Throwable -> La3
            fh.j r10 = new fh.j     // Catch: java.lang.Throwable -> La3
            r11 = 1
            r10.<init>(r11)     // Catch: java.lang.Throwable -> La3
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La3
            r11.<init>(r0)     // Catch: java.lang.Throwable -> La3
            r10.f3948h = r11     // Catch: java.lang.Throwable -> La3
            r9.f3953j = r10     // Catch: java.lang.Throwable -> La3
            fh.l r10 = r8.f3956m     // Catch: java.lang.Throwable -> La3
            if (r10 != 0) goto L67
            fh.l r10 = new fh.l     // Catch: java.lang.Throwable -> La3
            r10.<init>()     // Catch: java.lang.Throwable -> La3
        L67:
            r8.f3956m = r10     // Catch: java.lang.Throwable -> La3
            r10.k0(r9)     // Catch: java.lang.Throwable -> La3
            r7.f1666h = r8     // Catch: java.lang.Throwable -> La3
            hh.p r3 = r3.findMethod(r7)     // Catch: java.lang.Throwable -> La3
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La3
            r7.<init>()     // Catch: java.lang.Throwable -> La3
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> La3
        L7b:
            boolean r8 = r3.hasNext()     // Catch: java.lang.Throwable -> La3
            if (r8 == 0) goto La5
            java.lang.Object r8 = r3.next()     // Catch: java.lang.Throwable -> La3
            hh.o r8 = (hh.o) r8     // Catch: java.lang.Throwable -> La3
            java.lang.ClassLoader r9 = r1.f11622c     // Catch: java.lang.Throwable -> L8e
            java.lang.reflect.Method r8 = r8.r(r9)     // Catch: java.lang.Throwable -> L8e
            goto L95
        L8e:
            r8 = move-exception
            sf.f r9 = new sf.f     // Catch: java.lang.Throwable -> La3
            r9.<init>(r8)     // Catch: java.lang.Throwable -> La3
            r8 = r9
        L95:
            boolean r9 = r8 instanceof sf.f     // Catch: java.lang.Throwable -> La3
            if (r9 == 0) goto L9b
            r8 = r6
        L9b:
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch: java.lang.Throwable -> La3
            if (r8 == 0) goto L7b
            r7.add(r8)     // Catch: java.lang.Throwable -> La3
            goto L7b
        La3:
            r1 = move-exception
            goto Lee
        La5:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La3
            r1.<init>()     // Catch: java.lang.Throwable -> La3
            java.util.Iterator r3 = r7.iterator()     // Catch: java.lang.Throwable -> La3
        Lae:
            boolean r7 = r3.hasNext()     // Catch: java.lang.Throwable -> La3
            if (r7 == 0) goto Lc5
            java.lang.Object r7 = r3.next()     // Catch: java.lang.Throwable -> La3
            r8 = r7
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch: java.lang.Throwable -> La3
            boolean r8 = c(r8)     // Catch: java.lang.Throwable -> La3
            if (r8 == 0) goto Lae
            r1.add(r7)     // Catch: java.lang.Throwable -> La3
            goto Lae
        Lc5:
            java.util.HashSet r3 = new java.util.HashSet     // Catch: java.lang.Throwable -> La3
            r3.<init>()     // Catch: java.lang.Throwable -> La3
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La3
            r7.<init>()     // Catch: java.lang.Throwable -> La3
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La3
        Ld3:
            boolean r8 = r1.hasNext()     // Catch: java.lang.Throwable -> La3
            if (r8 == 0) goto Lf3
            java.lang.Object r8 = r1.next()     // Catch: java.lang.Throwable -> La3
            r9 = r8
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9     // Catch: java.lang.Throwable -> La3
            java.lang.String r9 = r9.toGenericString()     // Catch: java.lang.Throwable -> La3
            boolean r9 = r3.add(r9)     // Catch: java.lang.Throwable -> La3
            if (r9 == 0) goto Ld3
            r7.add(r8)     // Catch: java.lang.Throwable -> La3
            goto Ld3
        Lee:
            sf.f r7 = new sf.f
            r7.<init>(r1)
        Lf3:
            java.lang.Throwable r1 = sf.g.b(r7)
            y9.b r3 = r13.f22637b
            if (r1 != 0) goto Lfd
            r0 = r7
            goto L102
        Lfd:
            java.lang.String r7 = "定位语音消息通话检查方法失败"
            r3.invoke(r7, r1)
        L102:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = tf.m.I1(r0)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 != 0) goto L132
            java.lang.String r1 = "cache.key"
            android.content.SharedPreferences$Editor r7 = r4.edit()     // Catch: java.lang.Throwable -> L12c
            java.lang.String r8 = ""
            java.lang.String r4 = r4.getString(r1, r8)     // Catch: java.lang.Throwable -> L12c
            boolean r4 = gg.l.a(r4, r2)     // Catch: java.lang.Throwable -> L12c
            if (r4 != 0) goto L125
            android.content.SharedPreferences$Editor r4 = r7.clear()     // Catch: java.lang.Throwable -> L12c
            r4.putString(r1, r2)     // Catch: java.lang.Throwable -> L12c
        L125:
            android.content.SharedPreferences$Editor r1 = r7.remove(r5)     // Catch: java.lang.Throwable -> L12c
            r1.apply()     // Catch: java.lang.Throwable -> L12c
        L12c:
            java.lang.String r1 = "语音消息通话检查方法缺失或候选不唯一"
            r3.invoke(r1, r6)
            goto L135
        L132:
            e8.b.h(r4, r2, r5, r0)
        L135:
            return r0
    }

    public final z8.b f() {
            r12 = this;
            r8.g r0 = r12.f22636a
            java.lang.ClassLoader r0 = r0.f11622c
            java.lang.String r1 = "com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent"
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r1, r0)
            y9.b r1 = r12.f22637b
            r2 = 0
            if (r0 == 0) goto Lf2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = r0
        L15:
            if (r4 == 0) goto L5c
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L5c
            java.util.List r5 = h.Hchat.utils.KavaReflector.declaredMethods(r4)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L2c:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L43
            java.lang.Object r7 = r5.next()
            r8 = r7
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            boolean r8 = h.Hchat.utils.KavaReflector.isStatic(r8)
            if (r8 != 0) goto L2c
            r6.add(r7)
            goto L2c
        L43:
            java.util.Iterator r5 = r6.iterator()
        L47:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L57
            java.lang.Object r6 = r5.next()
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            r3.add(r6)
            goto L47
        L57:
            java.lang.Class r4 = r4.getSuperclass()
            goto L15
        L5c:
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
            r6 = r2
            r5 = r4
        L63:
            boolean r7 = r3.hasNext()
            r8 = 1
            if (r7 == 0) goto L9f
            java.lang.Object r7 = r3.next()
            r9 = r7
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            java.lang.Class[] r10 = r9.getParameterTypes()
            r10.getClass()
            int r10 = r10.length
            if (r10 != 0) goto L95
            java.lang.Class r10 = r9.getReturnType()
            java.lang.Class r11 = java.lang.Boolean.TYPE
            boolean r10 = gg.l.a(r10, r11)
            if (r10 == 0) goto L95
            boolean r10 = h.Hchat.utils.KavaReflector.isStatic(r9)
            if (r10 != 0) goto L95
            boolean r9 = h.Hchat.utils.KavaReflector.isAbstract(r9)
            if (r9 != 0) goto L95
            r9 = r8
            goto L96
        L95:
            r9 = r4
        L96:
            if (r9 == 0) goto L63
            if (r5 == 0) goto L9c
        L9a:
            r6 = r2
            goto La2
        L9c:
            r6 = r7
            r5 = r8
            goto L63
        L9f:
            if (r5 != 0) goto La2
            goto L9a
        La2:
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto Lec
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredFields(r0)
            java.util.Iterator r0 = r0.iterator()
            r5 = r2
            r3 = r4
        Lb0:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto Ld9
            java.lang.Object r7 = r0.next()
            r9 = r7
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            boolean r10 = h.Hchat.utils.KavaReflector.isStatic(r9)
            if (r10 != 0) goto Lcf
            java.lang.Class r9 = r9.getType()
            boolean r9 = r9.isPrimitive()
            if (r9 != 0) goto Lcf
            r9 = r8
            goto Ld0
        Lcf:
            r9 = r4
        Ld0:
            if (r9 == 0) goto Lb0
            if (r3 == 0) goto Ld6
        Ld4:
            r5 = r2
            goto Ldc
        Ld6:
            r5 = r7
            r3 = r8
            goto Lb0
        Ld9:
            if (r3 != 0) goto Ldc
            goto Ld4
        Ldc:
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            if (r5 == 0) goto Le6
            z8.b r0 = new z8.b
            r0.<init>(r6, r5)
            return r0
        Le6:
            java.lang.String r0 = "微信通话状态事件结果字段缺失或候选不唯一"
            r1.invoke(r0, r2)
            return r2
        Lec:
            java.lang.String r0 = "微信通话状态事件派发方法缺失或候选不唯一"
            r1.invoke(r0, r2)
            return r2
        Lf2:
            java.lang.String r0 = "微信通话状态事件类缺失"
            r1.invoke(r0, r2)
            return r2
    }
}
