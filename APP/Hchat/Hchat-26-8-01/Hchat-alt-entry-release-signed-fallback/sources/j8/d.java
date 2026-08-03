package j8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f6777a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f6778b = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            j8.d.f6777a = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            j8.d.f6778b = r0
            return
    }

    public static void a(java.lang.ClassLoader r10, java.lang.Object r11, java.lang.String r12, java.util.ArrayList r13, java.util.Set r14, int r15) {
            if (r11 == 0) goto L1af
            r1 = 4
            if (r15 > r1) goto L1af
            boolean r1 = r14.add(r11)
            if (r1 != 0) goto Ld
            goto L1af
        Ld:
            boolean r1 = r11 instanceof java.lang.String
            r8 = 1
            r2 = 0
            if (r1 == 0) goto L116
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = og.m.t0(r0)
            r3 = -1
            if (r1 == 0) goto L1f
            goto Lf7
        L1f:
            r1 = 47
            boolean r1 = og.m.i0(r0, r1)
            if (r1 != 0) goto L31
            java.lang.String r1 = "://"
            boolean r1 = og.m.h0(r0, r1, r2)
            if (r1 != 0) goto L31
            goto Lf7
        L31:
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r10 = l(r10, r0)
            if (r10 != 0) goto L3e
            goto Lf7
        L3e:
            java.util.Locale r10 = java.util.Locale.US
            java.lang.String r3 = j8.b.l(r10, r0, r10)
            java.lang.String r4 = r1.getName()
            r4.getClass()
            java.lang.String r10 = r4.toLowerCase(r10)
            r10.getClass()
            boolean r4 = og.m.t0(r12)
            if (r4 != 0) goto L65
            java.lang.String r4 = r1.getName()
            boolean r4 = gg.l.a(r4, r12)
            if (r4 == 0) goto L65
            r4 = 30
            goto L66
        L65:
            r4 = r2
        L66:
            boolean r5 = og.m.t0(r12)
            if (r5 != 0) goto L7b
            java.lang.String r5 = r1.getName()
            r5.getClass()
            boolean r5 = og.t.d0(r5, r12, r2)
            if (r5 == 0) goto L7b
            int r4 = r4 + 24
        L7b:
            boolean r5 = og.m.t0(r12)
            if (r5 != 0) goto L89
            boolean r12 = og.m.h0(r0, r12, r2)
            if (r12 == 0) goto L89
            int r4 = r4 + 18
        L89:
            java.lang.String r12 = "_t"
            boolean r12 = og.t.W(r10, r12, r2)
            if (r12 != 0) goto L94
            int r4 = r4 + 12
            goto L96
        L94:
            int r4 = r4 + (-30)
        L96:
            java.lang.String r12 = ".silk"
            boolean r12 = og.t.W(r10, r12, r2)
            if (r12 != 0) goto Lc6
            java.lang.String r12 = ".slk"
            boolean r12 = og.t.W(r10, r12, r2)
            if (r12 != 0) goto Lc6
            java.lang.String r12 = ".amr"
            boolean r12 = og.t.W(r10, r12, r2)
            if (r12 != 0) goto Lc6
            java.lang.String r12 = ".spx"
            boolean r12 = og.t.W(r10, r12, r2)
            if (r12 != 0) goto Lc6
            java.lang.String r12 = ".speex"
            boolean r12 = og.t.W(r10, r12, r2)
            if (r12 != 0) goto Lc6
            java.lang.String r12 = ".mp3"
            boolean r10 = og.t.W(r10, r12, r2)
            if (r10 == 0) goto Lc8
        Lc6:
            int r4 = r4 + 16
        Lc8:
            java.lang.String r10 = "/favorite"
            boolean r10 = og.m.h0(r3, r10, r2)
            if (r10 != 0) goto Ld8
            java.lang.String r10 = "/fav/"
            boolean r10 = og.m.h0(r3, r10, r2)
            if (r10 == 0) goto Lda
        Ld8:
            int r4 = r4 + 4
        Lda:
            java.lang.String r10 = "voice"
            boolean r10 = og.m.h0(r3, r10, r2)
            if (r10 == 0) goto Le4
            int r4 = r4 + 4
        Le4:
            r3 = r4
            boolean r10 = r1.isFile()
            if (r10 == 0) goto Lf7
            long r0 = r1.length()
            r4 = 0
            int r10 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r10 <= 0) goto Lf7
            int r3 = r3 + 2
        Lf7:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            if (r3 < 0) goto Lfe
            goto Lff
        Lfe:
            r8 = r2
        Lff:
            if (r8 == 0) goto L102
            goto L103
        L102:
            r10 = 0
        L103:
            if (r10 == 0) goto L1af
            int r10 = r10.intValue()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            sf.e r12 = new sf.e
            r12.<init>(r11, r10)
            r13.add(r12)
            return
        L116:
            boolean r1 = r11 instanceof java.lang.Object[]
            if (r1 == 0) goto L12e
            java.lang.Object[] r11 = (java.lang.Object[]) r11
            int r1 = r11.length
            r9 = r2
        L11e:
            if (r9 >= r1) goto L1af
            r3 = r11[r9]
            int r7 = r15 + 1
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            a(r2, r3, r4, r5, r6, r7)
            int r9 = r9 + 1
            goto L11e
        L12e:
            boolean r1 = r11 instanceof java.util.Collection
            if (r1 == 0) goto L14c
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
        L138:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L1af
            java.lang.Object r3 = r11.next()
            int r7 = r15 + 1
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            a(r2, r3, r4, r5, r6, r7)
            goto L138
        L14c:
            java.lang.Class r1 = r11.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r3 = "android."
            boolean r3 = og.t.d0(r1, r3, r2)
            if (r3 != 0) goto L1af
            java.lang.String r3 = "java.lang."
            boolean r3 = og.t.d0(r1, r3, r2)
            if (r3 != 0) goto L1af
            java.lang.String r3 = "java.io."
            boolean r1 = og.t.d0(r1, r3, r2)
            if (r1 == 0) goto L16d
            goto L1af
        L16d:
            java.lang.Class r1 = r11.getClass()
        L171:
            if (r1 == 0) goto L1af
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L1af
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredFields(r1)
            java.util.Iterator r9 = r2.iterator()
        L183:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L1aa
            java.lang.Object r2 = r9.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.Class r3 = r2.getType()
            boolean r3 = r3.isPrimitive()
            if (r3 == 0) goto L19a
            goto L183
        L19a:
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r2, r11)
            if (r3 == 0) goto L183
            int r7 = r15 + 1
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            a(r2, r3, r4, r5, r6, r7)
            goto L183
        L1aa:
            java.lang.Class r1 = r1.getSuperclass()
            goto L171
        L1af:
            return
    }

    public static java.lang.String b(java.lang.Object r5) {
            java.lang.String r0 = "T"
            java.lang.String r1 = "Z"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            r1 = 0
        L9:
            r2 = 2
            if (r1 < r2) goto Lf
            java.lang.String r5 = ""
            return r5
        Lf:
            r2 = r0[r1]
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r5, r2)
            boolean r3 = r2 instanceof java.lang.String
            r4 = 0
            if (r3 == 0) goto L1d
            java.lang.String r2 = (java.lang.String) r2
            goto L1e
        L1d:
            r2 = r4
        L1e:
            if (r2 == 0) goto L2a
            boolean r3 = og.m.t0(r2)
            if (r3 != 0) goto L27
            r4 = r2
        L27:
            if (r4 == 0) goto L2a
            return r4
        L2a:
            int r1 = r1 + 1
            goto L9
    }

    public static int c(java.lang.ClassLoader r6, java.lang.String r7, java.lang.String r8, java.lang.reflect.Method r9) {
            boolean r0 = og.m.t0(r7)
            if (r0 != 0) goto Ld6
            r0 = 47
            boolean r0 = og.m.i0(r7, r0)
            r1 = 0
            if (r0 != 0) goto L19
            java.lang.String r0 = "://"
            boolean r0 = og.m.h0(r7, r0, r1)
            if (r0 != 0) goto L19
            goto Ld6
        L19:
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r3 = j8.b.l(r2, r7, r2)
            java.lang.String r4 = r0.getName()
            r4.getClass()
            java.lang.String r2 = r4.toLowerCase(r2)
            r2.getClass()
            if (r9 == 0) goto L39
            java.lang.String r9 = r9.getName()
            goto L3a
        L39:
            r9 = 0
        L3a:
            if (r9 == 0) goto L6e
            int r4 = r9.hashCode()
            r5 = 88
            if (r4 == r5) goto L62
            r5 = 119(0x77, float:1.67E-43)
            if (r4 == r5) goto L56
            r5 = 120(0x78, float:1.68E-43)
            if (r4 == r5) goto L4d
            goto L6e
        L4d:
            java.lang.String r4 = "x"
            boolean r9 = r9.equals(r4)
            if (r9 != 0) goto L5f
            goto L6e
        L56:
            java.lang.String r4 = "w"
            boolean r9 = r9.equals(r4)
            if (r9 != 0) goto L5f
            goto L6e
        L5f:
            r9 = 80
            goto L6f
        L62:
            java.lang.String r4 = "X"
            boolean r9 = r9.equals(r4)
            if (r9 != 0) goto L6b
            goto L6e
        L6b:
            r9 = -20
            goto L6f
        L6e:
            r9 = r1
        L6f:
            boolean r4 = og.m.t0(r8)
            if (r4 != 0) goto L81
            java.lang.String r4 = r0.getName()
            boolean r4 = gg.l.a(r4, r8)
            if (r4 == 0) goto L81
            int r9 = r9 + 40
        L81:
            boolean r4 = og.m.t0(r8)
            if (r4 != 0) goto L96
            java.lang.String r0 = r0.getName()
            r0.getClass()
            boolean r0 = og.t.d0(r0, r8, r1)
            if (r0 == 0) goto L96
            int r9 = r9 + 30
        L96:
            boolean r0 = og.m.t0(r8)
            if (r0 != 0) goto La4
            boolean r8 = og.m.h0(r7, r8, r1)
            if (r8 == 0) goto La4
            int r9 = r9 + 20
        La4:
            java.lang.String r8 = "_t"
            boolean r8 = og.t.W(r2, r8, r1)
            if (r8 != 0) goto Laf
            int r9 = r9 + 10
            goto Lb1
        Laf:
            int r9 = r9 + (-30)
        Lb1:
            java.lang.String r8 = "/favorite"
            boolean r8 = og.m.h0(r3, r8, r1)
            if (r8 != 0) goto Lc1
            java.lang.String r8 = "/fav/"
            boolean r8 = og.m.h0(r3, r8, r1)
            if (r8 == 0) goto Lc3
        Lc1:
            int r9 = r9 + 8
        Lc3:
            java.lang.String r8 = "voice"
            boolean r8 = og.m.h0(r3, r8, r1)
            if (r8 == 0) goto Lcd
            int r9 = r9 + 6
        Lcd:
            boolean r6 = l(r6, r7)
            if (r6 == 0) goto Ld5
            int r9 = r9 + 24
        Ld5:
            return r9
        Ld6:
            r6 = -1
            return r6
    }

    public static java.util.List d(android.content.Context r14, java.lang.ClassLoader r15, org.luckypray.dexkit.DexKitBridge r16, java.lang.Object r17, fg.p r18) {
            r0 = r16
            java.lang.Class r2 = r17.getClass()
            java.lang.String r3 = b(r17)
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            java.util.concurrent.ConcurrentHashMap r5 = j8.d.f6777a
            java.lang.Object r6 = r5.get(r2)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            r7 = 0
            r8 = 1
            r9 = 0
            if (r6 == 0) goto L40
            java.lang.Object[] r10 = new java.lang.Object[]{r17}
            java.lang.Object r10 = h.Hchat.utils.KavaReflector.invoke(r6, r9, r10)
            boolean r11 = r10 instanceof java.lang.String
            if (r11 == 0) goto L2b
            java.lang.String r10 = (java.lang.String) r10
            goto L2c
        L2b:
            r10 = r9
        L2c:
            if (r10 == 0) goto L40
            int r6 = c(r15, r10, r3, r6)
            if (r6 < 0) goto L36
            r6 = r8
            goto L37
        L36:
            r6 = r7
        L37:
            if (r6 == 0) goto L3a
            goto L3b
        L3a:
            r10 = r9
        L3b:
            if (r10 == 0) goto L40
            r4.add(r10)
        L40:
            java.lang.String r6 = "Hchat_favorite_voice_method_cache"
            android.content.SharedPreferences r6 = ub.b.c(r14, r6)
            java.lang.String r10 = r2.getName()
            java.lang.String r11 = "fav_data_path_v2_"
            java.lang.String r10 = r11.concat(r10)
            java.lang.String r14 = e8.b.g(r14, r15)
            java.lang.reflect.Method r11 = e8.b.c(r6, r14, r15, r10)
            if (r11 == 0) goto L85
            boolean r12 = h(r2, r11)
            if (r12 == 0) goto L85
            r5.put(r2, r11)
            java.lang.Object[] r12 = new java.lang.Object[]{r17}
            java.lang.Object r12 = h.Hchat.utils.KavaReflector.invoke(r11, r9, r12)
            boolean r13 = r12 instanceof java.lang.String
            if (r13 == 0) goto L72
            java.lang.String r12 = (java.lang.String) r12
            goto L73
        L72:
            r12 = r9
        L73:
            if (r12 == 0) goto L85
            int r11 = c(r15, r12, r3, r11)
            if (r11 < 0) goto L7c
            r7 = r8
        L7c:
            if (r7 == 0) goto L7f
            goto L80
        L7f:
            r12 = r9
        L80:
            if (r12 == 0) goto L85
            r4.add(r12)
        L85:
            tf.t r7 = tf.t.f13167g
            if (r0 != 0) goto L8b
            goto L142
        L8b:
            ch.e r8 = new ch.e     // Catch: java.lang.Throwable -> Le1
            r8.<init>()     // Catch: java.lang.Throwable -> Le1
            fh.k r11 = new fh.k     // Catch: java.lang.Throwable -> Le1
            r11.<init>()     // Catch: java.lang.Throwable -> Le1
            java.lang.String r12 = "java.lang.String"
            fh.k.q0(r11, r12)     // Catch: java.lang.Throwable -> Le1
            java.lang.String r12 = r2.getName()     // Catch: java.lang.Throwable -> Le1
            java.lang.String[] r12 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> Le1
            r11.o0(r12)     // Catch: java.lang.Throwable -> Le1
            r8.f1666h = r11     // Catch: java.lang.Throwable -> Le1
            hh.p r0 = r0.findMethod(r8)     // Catch: java.lang.Throwable -> Le1
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le1
            r8.<init>()     // Catch: java.lang.Throwable -> Le1
            java.util.Iterator r11 = r0.iterator()     // Catch: java.lang.Throwable -> Le1
        Lb4:
            boolean r0 = r11.hasNext()     // Catch: java.lang.Throwable -> Le1
            if (r0 == 0) goto Le3
            java.lang.Object r0 = r11.next()     // Catch: java.lang.Throwable -> Le1
            hh.o r0 = (hh.o) r0     // Catch: java.lang.Throwable -> Le1
            r0.getClass()     // Catch: java.lang.Throwable -> Lcc
            lh.d r0 = r0.p()     // Catch: java.lang.Throwable -> Lcc
            java.lang.reflect.Method r0 = r0.b(r15)     // Catch: java.lang.Throwable -> Lcc
            goto Ld3
        Lcc:
            r0 = move-exception
            sf.f r12 = new sf.f     // Catch: java.lang.Throwable -> Le1
            r12.<init>(r0)     // Catch: java.lang.Throwable -> Le1
            r0 = r12
        Ld3:
            boolean r12 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> Le1
            if (r12 == 0) goto Ld9
            r0 = r9
        Ld9:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> Le1
            if (r0 == 0) goto Lb4
            r8.add(r0)     // Catch: java.lang.Throwable -> Le1
            goto Lb4
        Le1:
            r0 = move-exception
            goto L12c
        Le3:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le1
            r0.<init>()     // Catch: java.lang.Throwable -> Le1
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Le1
        Lec:
            boolean r11 = r8.hasNext()     // Catch: java.lang.Throwable -> Le1
            if (r11 == 0) goto L103
            java.lang.Object r11 = r8.next()     // Catch: java.lang.Throwable -> Le1
            r12 = r11
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12     // Catch: java.lang.Throwable -> Le1
            boolean r12 = h(r2, r12)     // Catch: java.lang.Throwable -> Le1
            if (r12 == 0) goto Lec
            r0.add(r11)     // Catch: java.lang.Throwable -> Le1
            goto Lec
        L103:
            java.util.HashSet r8 = new java.util.HashSet     // Catch: java.lang.Throwable -> Le1
            r8.<init>()     // Catch: java.lang.Throwable -> Le1
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le1
            r11.<init>()     // Catch: java.lang.Throwable -> Le1
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Le1
        L111:
            boolean r12 = r0.hasNext()     // Catch: java.lang.Throwable -> Le1
            if (r12 == 0) goto L131
            java.lang.Object r12 = r0.next()     // Catch: java.lang.Throwable -> Le1
            r13 = r12
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13     // Catch: java.lang.Throwable -> Le1
            java.lang.String r13 = r13.toGenericString()     // Catch: java.lang.Throwable -> Le1
            boolean r13 = r8.add(r13)     // Catch: java.lang.Throwable -> Le1
            if (r13 == 0) goto L111
            r11.add(r12)     // Catch: java.lang.Throwable -> Le1
            goto L111
        L12c:
            sf.f r11 = new sf.f
            r11.<init>(r0)
        L131:
            java.lang.Throwable r0 = sf.g.b(r11)
            if (r0 != 0) goto L139
            r7 = r11
            goto L140
        L139:
            java.lang.String r8 = "收藏媒体定位文件路径方法失败"
            r11 = r18
            r11.invoke(r8, r0)
        L140:
            java.util.List r7 = (java.util.List) r7
        L142:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L14b:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L180
            java.lang.Object r8 = r7.next()
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            java.lang.Object[] r11 = new java.lang.Object[]{r17}
            java.lang.Object r11 = h.Hchat.utils.KavaReflector.invoke(r8, r9, r11)
            boolean r12 = r11 instanceof java.lang.String
            if (r12 == 0) goto L166
            java.lang.String r11 = (java.lang.String) r11
            goto L167
        L166:
            r11 = r9
        L167:
            if (r11 == 0) goto L16f
            int r12 = c(r15, r11, r3, r8)
            if (r12 >= 0) goto L171
        L16f:
            r13 = r9
            goto L17a
        L171:
            sf.j r13 = new sf.j
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13.<init>(r8, r11, r12)
        L17a:
            if (r13 == 0) goto L14b
            r0.add(r13)
            goto L14b
        L180:
            a9.h r1 = new a9.h
            r3 = 22
            r1.<init>(r3)
            java.util.List r0 = tf.m.K1(r0, r1)
            java.lang.Object r1 = tf.m.v1(r0)
            sf.j r1 = (sf.j) r1
            if (r1 == 0) goto L19d
            java.lang.Object r1 = r1.f12428g
            r5.put(r2, r1)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            e8.b.h(r6, r14, r10, r1)
        L19d:
            java.util.Iterator r14 = r0.iterator()
        L1a1:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L1b3
            java.lang.Object r0 = r14.next()
            sf.j r0 = (sf.j) r0
            java.lang.Object r0 = r0.f12429h
            r4.add(r0)
            goto L1a1
        L1b3:
            java.util.List r14 = tf.m.P1(r4)
            return r14
    }

    public static int e(java.lang.Object r2) {
            java.lang.String r0 = "field_type"
            java.lang.String r1 = "type"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.lang.Number r2 = g(r2, r0)
            if (r2 == 0) goto L13
            int r2 = r2.intValue()
            return r2
        L13:
            r2 = 0
            return r2
    }

    public static java.lang.Object f(java.lang.Object r6) {
            java.lang.String r0 = "field_favProto"
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.readField(r6, r0)
            r0 = 0
            if (r6 == 0) goto L67
            java.lang.Class r1 = r6.getClass()
        Ld:
            if (r1 == 0) goto L67
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L67
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredFields(r1)
            java.util.Iterator r2 = r2.iterator()
        L1f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L62
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.Class<java.util.Collection> r4 = java.util.Collection.class
            java.lang.Class r5 = r3.getType()
            boolean r4 = r4.isAssignableFrom(r5)
            if (r4 != 0) goto L38
            goto L1f
        L38:
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r3, r6)
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L43
            java.util.Collection r3 = (java.util.Collection) r3
            goto L44
        L43:
            r3 = r0
        L44:
            if (r3 == 0) goto L5e
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L4c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5e
            java.lang.Object r4 = r3.next()
            if (r4 == 0) goto L5a
            r5 = 1
            goto L5b
        L5a:
            r5 = 0
        L5b:
            if (r5 == 0) goto L4c
            goto L5f
        L5e:
            r4 = r0
        L5f:
            if (r4 == 0) goto L1f
            return r4
        L62:
            java.lang.Class r1 = r1.getSuperclass()
            goto Ld
        L67:
            return r0
    }

    public static java.lang.Number g(java.lang.Object r4, java.lang.String... r5) {
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 < r0) goto L6
            r4 = 0
            return r4
        L6:
            r2 = r5[r1]
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r4, r2)
            boolean r3 = r2 instanceof java.lang.Number
            if (r3 == 0) goto L13
            java.lang.Number r2 = (java.lang.Number) r2
            return r2
        L13:
            int r1 = r1 + 1
            goto L2
    }

    public static boolean h(java.lang.Class r3, java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            int r1 = r4.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            r2 = 0
            if (r1 == 0) goto L28
            java.lang.Class r4 = r4.getReturnType()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r4 = gg.l.a(r4, r1)
            if (r4 == 0) goto L28
            int r4 = r0.length
            r1 = 1
            if (r4 != r1) goto L28
            r4 = r0[r2]
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 == 0) goto L28
            return r1
        L28:
            return r2
    }

    public static boolean i(java.lang.Class r3, java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            int r1 = r4.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            r2 = 0
            if (r1 == 0) goto L3d
            java.lang.Class r4 = r4.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r4 = gg.l.a(r4, r1)
            if (r4 == 0) goto L3d
            int r4 = r0.length
            r1 = 2
            if (r4 != r1) goto L3d
            r4 = r0[r2]
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 == 0) goto L3d
            r3 = 1
            r4 = r0[r3]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            boolean r4 = gg.l.a(r4, r1)
            if (r4 != 0) goto L3c
            r4 = r0[r3]
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            boolean r4 = gg.l.a(r4, r0)
            if (r4 == 0) goto L3d
        L3c:
            return r3
        L3d:
            return r2
    }

    public static java.lang.String j(android.content.Context r11, java.lang.ClassLoader r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
            boolean r0 = eh.a.y(r13)
            if (r0 == 0) goto L7
            return r13
        L7:
            boolean r0 = og.m.t0(r13)
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L13
        L10:
            r6 = r3
            goto La3
        L13:
            java.lang.String r0 = "com.tencent.mm.vfs.w6"
            java.lang.String r4 = "com.tencent.mm.vfs.p6"
            java.lang.String[] r0 = new java.lang.String[]{r0, r4}
            r4 = r2
        L1c:
            r5 = 2
            if (r4 < r5) goto L20
            goto L10
        L20:
            r6 = r0[r4]
            java.lang.Class r6 = h.Hchat.utils.KavaReflector.loadClass(r6, r12)
            if (r6 == 0) goto L14f
            java.lang.String r7 = "E"
            java.lang.String r8 = "F"
            java.lang.String[] r7 = new java.lang.String[]{r7, r8}
            r8 = r2
        L31:
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            if (r8 < r5) goto L84
            java.util.List r5 = h.Hchat.utils.KavaReflector.declaredMethods(r6)
            java.util.Iterator r5 = r5.iterator()
        L3d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L14f
            java.lang.Object r6 = r5.next()
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            int r7 = r6.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)
            if (r7 != 0) goto L54
            goto L3d
        L54:
            java.lang.Class r7 = r6.getReturnType()
            java.lang.Class<java.io.InputStream> r8 = java.io.InputStream.class
            boolean r7 = gg.l.a(r7, r8)
            if (r7 != 0) goto L61
            goto L3d
        L61:
            java.lang.Class[] r7 = r6.getParameterTypes()
            int r8 = r7.length
            if (r8 != r1) goto L3d
            r7 = r7[r2]
            boolean r7 = gg.l.a(r7, r9)
            if (r7 != 0) goto L71
            goto L3d
        L71:
            java.lang.Object[] r7 = new java.lang.Object[]{r13}
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.invoke(r6, r3, r7)
            boolean r7 = r6 instanceof java.io.InputStream
            if (r7 == 0) goto L80
            java.io.InputStream r6 = (java.io.InputStream) r6
            goto L81
        L80:
            r6 = r3
        L81:
            if (r6 == 0) goto L3d
            goto La3
        L84:
            r10 = r7[r8]
            java.lang.Class[] r9 = new java.lang.Class[]{r9}
            java.lang.reflect.Method r9 = h.Hchat.utils.KavaReflector.findMethod(r6, r10, r9)
            if (r9 == 0) goto L14b
            java.lang.Object[] r10 = new java.lang.Object[]{r13}
            java.lang.Object r9 = h.Hchat.utils.KavaReflector.invoke(r9, r3, r10)
            boolean r10 = r9 instanceof java.io.InputStream
            if (r10 == 0) goto L9f
            java.io.InputStream r9 = (java.io.InputStream) r9
            goto La0
        L9f:
            r9 = r3
        La0:
            if (r9 == 0) goto L14b
            r6 = r9
        La3:
            if (r6 == 0) goto L14a
            java.io.File r12 = new java.io.File
            r12.<init>(r13)
            java.lang.String r12 = dg.l.c0(r12)
            boolean r0 = og.m.t0(r12)
            if (r0 != 0) goto Lbe
            int r0 = r12.length()
            r4 = 8
            if (r0 > r4) goto Lbe
            r0 = r1
            goto Lbf
        Lbe:
            r0 = r2
        Lbf:
            if (r0 == 0) goto Lc2
            goto Lc3
        Lc2:
            r12 = r3
        Lc3:
            if (r12 == 0) goto Lc6
            r15 = r12
        Lc6:
            java.io.File r12 = new java.io.File
            java.io.File r11 = r11.getCacheDir()
            r12.<init>(r11, r14)
            boolean r11 = r12.isDirectory()
            if (r11 != 0) goto Ldd
            boolean r11 = r12.mkdirs()
            if (r11 != 0) goto Ldd
            goto L14a
        Ldd:
            java.io.File r11 = new java.io.File
            int r13 = r13.hashCode()
            java.lang.String r13 = java.lang.Integer.toHexString(r13)
            java.lang.String r14 = "fav_"
            java.lang.String r0 = "."
            java.lang.String r13 = bc.e.j(r14, r13, r0, r15)
            r11.<init>(r12, r13)
            java.io.FileOutputStream r12 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L128
            r12.<init>(r11, r2)     // Catch: java.lang.Throwable -> L128
            r13 = 8192(0x2000, float:1.148E-41)
            byte[] r13 = new byte[r13]     // Catch: java.lang.Throwable -> L12e
        Lfb:
            int r14 = r6.read(r13)     // Catch: java.lang.Throwable -> L12e
            if (r14 > 0) goto L12a
            r12.close()     // Catch: java.lang.Throwable -> L128
            r6.close()     // Catch: java.lang.Throwable -> L118
            boolean r12 = r11.isFile()     // Catch: java.lang.Throwable -> L118
            if (r12 == 0) goto L11a
            long r12 = r11.length()     // Catch: java.lang.Throwable -> L118
            r14 = 0
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 <= 0) goto L11a
            goto L11b
        L118:
            r11 = move-exception
            goto L13b
        L11a:
            r1 = r2
        L11b:
            if (r1 == 0) goto L11e
            goto L11f
        L11e:
            r11 = r3
        L11f:
            if (r11 == 0) goto L126
            java.lang.String r11 = r11.getAbsolutePath()     // Catch: java.lang.Throwable -> L118
            goto L141
        L126:
            r11 = r3
            goto L141
        L128:
            r11 = move-exception
            goto L135
        L12a:
            r12.write(r13, r2, r14)     // Catch: java.lang.Throwable -> L12e
            goto Lfb
        L12e:
            r11 = move-exception
            throw r11     // Catch: java.lang.Throwable -> L130
        L130:
            r13 = move-exception
            ig.a.i(r12, r11)     // Catch: java.lang.Throwable -> L128
            throw r13     // Catch: java.lang.Throwable -> L128
        L135:
            throw r11     // Catch: java.lang.Throwable -> L136
        L136:
            r12 = move-exception
            ig.a.i(r6, r11)     // Catch: java.lang.Throwable -> L118
            throw r12     // Catch: java.lang.Throwable -> L118
        L13b:
            sf.f r12 = new sf.f
            r12.<init>(r11)
            r11 = r12
        L141:
            boolean r12 = r11 instanceof sf.f
            if (r12 == 0) goto L147
            goto L148
        L147:
            r3 = r11
        L148:
            java.lang.String r3 = (java.lang.String) r3
        L14a:
            return r3
        L14b:
            int r8 = r8 + 1
            goto L31
        L14f:
            int r4 = r4 + 1
            goto L1c
    }

    public static java.lang.Integer k(java.lang.Long r6) {
            if (r6 == 0) goto L30
            long r0 = r6.longValue()
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 > 0) goto Ld
            goto L30
        Ld:
            r2 = 1
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 > 0) goto L1c
            r4 = 601(0x259, double:2.97E-321)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L1c
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r4
        L1c:
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L21
            goto L22
        L21:
            r2 = r0
        L22:
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 <= 0) goto L2a
            r2 = r0
        L2a:
            int r6 = (int) r2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            return r6
        L30:
            r6 = 0
            return r6
    }

    public static boolean l(java.lang.ClassLoader r10, java.lang.String r11) {
            boolean r0 = og.m.t0(r11)
            r1 = 0
            if (r0 == 0) goto L8
            goto L25
        L8:
            boolean r0 = eh.a.y(r11)
            r2 = 1
            if (r0 == 0) goto L11
            goto L8c
        L11:
            java.lang.String r0 = "j"
            java.lang.String r3 = "k"
            java.lang.String[] r0 = new java.lang.String[]{r0, r3}
            java.lang.String r3 = "com.tencent.mm.vfs.w6"
            java.lang.String r4 = "com.tencent.mm.vfs.p6"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            r4 = r1
        L22:
            r5 = 2
            if (r4 < r5) goto L26
        L25:
            return r1
        L26:
            r5 = r3[r4]
            java.lang.Class r5 = h.Hchat.utils.KavaReflector.loadClass(r5, r10)
            if (r5 == 0) goto L8d
            java.util.List r5 = h.Hchat.utils.KavaReflector.declaredMethods(r5)
            java.util.Iterator r5 = r5.iterator()
        L36:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L8d
            java.lang.Object r6 = r5.next()
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.String r7 = r6.getName()
            boolean r7 = tf.l.m0(r0, r7)
            if (r7 != 0) goto L4d
            goto L36
        L4d:
            int r7 = r6.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)
            if (r7 != 0) goto L58
            goto L36
        L58:
            java.lang.Class[] r7 = r6.getParameterTypes()
            int r8 = r7.length
            if (r8 != r2) goto L36
            r7 = r7[r1]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            boolean r7 = gg.l.a(r7, r8)
            if (r7 != 0) goto L6a
            goto L36
        L6a:
            r7 = 0
            java.lang.Object[] r8 = new java.lang.Object[]{r11}
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.invoke(r6, r7, r8)
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            boolean r7 = gg.l.a(r6, r7)
            if (r7 == 0) goto L7c
            goto L8c
        L7c:
            boolean r7 = r6 instanceof java.lang.Number
            if (r7 == 0) goto L36
            java.lang.Number r6 = (java.lang.Number) r6
            long r6 = r6.longValue()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L36
        L8c:
            return r2
        L8d:
            int r4 = r4 + 1
            goto L22
    }

    public static java.lang.String m(java.lang.ClassLoader r6, java.lang.Object r7) {
            java.lang.String r2 = b(r7)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r0.getClass()
            r4 = r0
            java.util.Set r4 = (java.util.Set) r4
            r5 = 0
            r0 = r6
            r1 = r7
            a(r0, r1, r2, r3, r4, r5)
            java.util.Iterator r6 = r3.iterator()
            boolean r7 = r6.hasNext()
            r0 = 0
            if (r7 != 0) goto L2b
            r7 = r0
            goto L66
        L2b:
            java.lang.Object r7 = r6.next()
            boolean r1 = r6.hasNext()
            if (r1 != 0) goto L36
            goto L66
        L36:
            r1 = r7
            sf.e r1 = (sf.e) r1
            java.lang.Object r1 = r1.f12419h
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L45:
            java.lang.Object r2 = r6.next()
            r3 = r2
            sf.e r3 = (sf.e) r3
            java.lang.Object r3 = r3.f12419h
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r1.compareTo(r3)
            if (r4 >= 0) goto L60
            r7 = r2
            r1 = r3
        L60:
            boolean r2 = r6.hasNext()
            if (r2 != 0) goto L45
        L66:
            sf.e r7 = (sf.e) r7
            if (r7 == 0) goto L6f
            java.lang.Object r6 = r7.f12418g
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L6f:
            return r0
    }
}
