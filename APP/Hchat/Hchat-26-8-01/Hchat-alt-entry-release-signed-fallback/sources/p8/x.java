package p8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f10432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.ClassLoader f10433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final org.luckypray.dexkit.DexKitBridge f10434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p8.p f10435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final android.content.SharedPreferences f10436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile java.lang.reflect.Method f10437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile java.lang.reflect.Method f10438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile java.lang.Object f10439h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile java.lang.reflect.Constructor f10440i;

    public x(android.content.Context r1, java.lang.ClassLoader r2, org.luckypray.dexkit.DexKitBridge r3, p8.p r4) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f10432a = r1
            r0.f10433b = r2
            r0.f10434c = r3
            r0.f10435d = r4
            java.lang.String r2 = "Hchat_sns_interaction_method_cache"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            r0.f10436e = r1
            tf.t r1 = tf.t.f13167g
            r0.f10439h = r1
            return
    }

    public static boolean a(java.util.List r2) {
            if (r2 == 0) goto L9
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L9
            goto L3e
        L9:
            java.util.Iterator r0 = r2.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r1 = b(r1)
            if (r1 == 0) goto Ld
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L26
            goto L3e
        L26:
            java.util.Iterator r2 = r2.iterator()
        L2a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r2.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            boolean r0 = c(r0)
            if (r0 == 0) goto L2a
            r2 = 1
            return r2
        L3e:
            r2 = 0
            return r2
    }

    public static boolean b(java.lang.reflect.Method r6) {
            java.lang.Class[] r0 = r6.getParameterTypes()
            int r1 = r6.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            r2 = 0
            if (r1 == 0) goto L6c
            java.lang.Class r6 = r6.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r6 = gg.l.a(r6, r1)
            if (r6 != 0) goto L6c
            int r6 = r0.length
            r1 = 7
            if (r6 != r1) goto L6c
            r6 = r0[r2]
            java.lang.String r6 = r6.getName()
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.SnsInfo"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L6c
            r6 = 1
            r1 = r0[r6]
            java.lang.Class r3 = java.lang.Integer.TYPE
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L6c
            r1 = 2
            r1 = r0[r1]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            boolean r1 = gg.l.a(r1, r4)
            if (r1 == 0) goto L6c
            r1 = 3
            r1 = r0[r1]
            java.lang.Class r5 = java.lang.Long.TYPE
            boolean r1 = gg.l.a(r1, r5)
            if (r1 == 0) goto L6c
            r1 = 4
            r1 = r0[r1]
            boolean r1 = gg.l.a(r1, r4)
            if (r1 == 0) goto L6c
            r1 = 5
            r1 = r0[r1]
            java.lang.Class r4 = java.lang.Boolean.TYPE
            boolean r1 = gg.l.a(r1, r4)
            if (r1 == 0) goto L6c
            r1 = 6
            r0 = r0[r1]
            boolean r0 = gg.l.a(r0, r3)
            if (r0 == 0) goto L6c
            return r6
        L6c:
            return r2
    }

    public static boolean c(java.lang.reflect.Method r7) {
            java.lang.Class[] r0 = r7.getParameterTypes()
            int r1 = r7.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            r2 = 0
            if (r1 == 0) goto L86
            java.lang.Class r1 = r7.getReturnType()
            java.lang.Class r3 = java.lang.Void.TYPE
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L86
            int r1 = r0.length
            r3 = 7
            if (r1 == r3) goto L24
            int r1 = r0.length
            r4 = 8
            if (r1 != r4) goto L86
        L24:
            r1 = r0[r2]
            java.lang.String r1 = r1.getName()
            java.lang.String r4 = "com.tencent.mm.plugin.sns.storage.SnsInfo"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L86
            r1 = 1
            r4 = r0[r1]
            java.lang.Class r5 = java.lang.Integer.TYPE
            boolean r4 = gg.l.a(r4, r5)
            if (r4 == 0) goto L86
            r4 = 2
            r4 = r0[r4]
            boolean r4 = r4.isPrimitive()
            if (r4 != 0) goto L86
            r4 = 3
            r6 = r0[r4]
            boolean r6 = r6.isPrimitive()
            if (r6 != 0) goto L86
            r4 = r0[r4]
            java.lang.Class r7 = r7.getReturnType()
            boolean r7 = gg.l.a(r4, r7)
            if (r7 == 0) goto L86
            r7 = 4
            r7 = r0[r7]
            java.lang.Class r4 = java.lang.Boolean.TYPE
            boolean r7 = gg.l.a(r7, r4)
            if (r7 == 0) goto L86
            r7 = 5
            r7 = r0[r7]
            boolean r7 = gg.l.a(r7, r5)
            if (r7 == 0) goto L86
            r7 = 6
            r7 = r0[r7]
            boolean r7 = gg.l.a(r7, r5)
            if (r7 == 0) goto L86
            int r7 = r0.length
            if (r7 == r3) goto L85
            r7 = r0[r3]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r7 = gg.l.a(r7, r0)
            if (r7 == 0) goto L86
        L85:
            return r1
        L86:
            return r2
    }

    public static boolean d(java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            int r1 = r4.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            r2 = 0
            if (r1 == 0) goto L4b
            java.lang.Class r4 = r4.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r4 = gg.l.a(r4, r1)
            if (r4 != 0) goto L4b
            int r4 = r0.length
            r1 = 4
            if (r4 != r1) goto L4b
            r4 = r0[r2]
            java.lang.String r4 = r4.getName()
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.SnsInfo"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L4b
            r4 = 1
            r1 = r0[r4]
            java.lang.Class r3 = java.lang.Integer.TYPE
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L4b
            r1 = 2
            r1 = r0[r1]
            boolean r1 = r1.isPrimitive()
            if (r1 != 0) goto L4b
            r1 = 3
            r0 = r0[r1]
            boolean r0 = gg.l.a(r0, r3)
            if (r0 == 0) goto L4b
            return r4
        L4b:
            return r2
    }

    public static boolean e(java.lang.reflect.Constructor r4) {
            java.lang.Class[] r4 = r4.getParameterTypes()
            int r0 = r4.length
            r1 = 3
            r2 = 0
            if (r0 != r1) goto L28
            r0 = r4[r2]
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L28
            r0 = 1
            r3 = r4[r0]
            boolean r1 = gg.l.a(r3, r1)
            if (r1 == 0) goto L28
            r1 = 2
            r4 = r4[r1]
            java.lang.Class r1 = java.lang.Integer.TYPE
            boolean r4 = gg.l.a(r4, r1)
            if (r4 == 0) goto L28
            return r0
        L28:
            return r2
    }

    public final synchronized java.lang.reflect.Method f() {
            r7 = this;
            monitor-enter(r7)
            java.lang.reflect.Method r0 = r7.f10438g     // Catch: java.lang.Throwable -> L12
            r1 = 0
            if (r0 == 0) goto L15
            boolean r2 = b(r0)     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto Ld
            goto Le
        Ld:
            r0 = r1
        Le:
            if (r0 == 0) goto L15
            monitor-exit(r7)
            return r0
        L12:
            r0 = move-exception
            goto Lcf
        L15:
            android.content.Context r0 = r7.f10432a     // Catch: java.lang.Throwable -> L12
            java.lang.ClassLoader r2 = r7.f10433b     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = e8.b.g(r0, r2)     // Catch: java.lang.Throwable -> L12
            android.content.SharedPreferences r2 = r7.f10436e     // Catch: java.lang.Throwable -> L12
            java.lang.ClassLoader r3 = r7.f10433b     // Catch: java.lang.Throwable -> L12
            java.lang.String r4 = "native_comment_v1"
            java.lang.reflect.Method r2 = e8.b.c(r2, r0, r3, r4)     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto L37
            boolean r3 = b(r2)     // Catch: java.lang.Throwable -> L12
            if (r3 == 0) goto L30
            goto L31
        L30:
            r2 = r1
        L31:
            if (r2 == 0) goto L37
            r7.f10438g = r2     // Catch: java.lang.Throwable -> L12
            monitor-exit(r7)
            return r2
        L37:
            org.luckypray.dexkit.DexKitBridge r2 = r7.f10434c     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto Lcd
            ch.c r3 = new ch.c     // Catch: java.lang.Throwable -> L8b
            r3.<init>()     // Catch: java.lang.Throwable -> L8b
            fh.a r4 = new fh.a     // Catch: java.lang.Throwable -> L8b
            r4.<init>()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r5 = "MicroMsg.SnsService"
            java.lang.String r6 = "can not add Comment"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}     // Catch: java.lang.Throwable -> L8b
            r4.p0(r5)     // Catch: java.lang.Throwable -> L8b
            r3.f1664h = r4     // Catch: java.lang.Throwable -> L8b
            hh.j r2 = r2.findClass(r3)     // Catch: java.lang.Throwable -> L8b
            dg.n r2 = tf.m.m1(r2)     // Catch: java.lang.Throwable -> L8b
            p8.w r3 = new p8.w     // Catch: java.lang.Throwable -> L8b
            r4 = 1
            r3.<init>(r7, r4)     // Catch: java.lang.Throwable -> L8b
            ng.i r2 = ng.m.X(r2, r3)     // Catch: java.lang.Throwable -> L8b
            o9.e r3 = new o9.e     // Catch: java.lang.Throwable -> L8b
            r4 = 14
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L8b
            dg.j r4 = new dg.j     // Catch: java.lang.Throwable -> L8b
            ng.q r5 = ng.q.f9453n     // Catch: java.lang.Throwable -> L8b
            r4.<init>(r2, r3, r5)     // Catch: java.lang.Throwable -> L8b
            ng.h r2 = new ng.h     // Catch: java.lang.Throwable -> L8b
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L8b
        L77:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L8b
            if (r3 == 0) goto L8d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L8b
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch: java.lang.Throwable -> L8b
            boolean r4 = b(r4)     // Catch: java.lang.Throwable -> L8b
            if (r4 == 0) goto L77
            goto L8e
        L8b:
            r0 = move-exception
            goto L9e
        L8d:
            r3 = r1
        L8e:
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L8b
            if (r3 == 0) goto L9c
            r7.f10438g = r3     // Catch: java.lang.Throwable -> L8b
            android.content.SharedPreferences r2 = r7.f10436e     // Catch: java.lang.Throwable -> L8b
            java.lang.String r4 = "native_comment_v1"
            e8.b.h(r2, r0, r4, r3)     // Catch: java.lang.Throwable -> L8b
            goto La3
        L9c:
            r3 = r1
            goto La3
        L9e:
            sf.f r3 = new sf.f     // Catch: java.lang.Throwable -> L12
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L12
        La3:
            java.lang.Throwable r0 = sf.g.b(r3)     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto Lc3
            p8.p r2 = r7.f10435d     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r4.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.String r5 = "定位朋友圈原生评论方法失败: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L12
            r4.append(r0)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L12
            r2.invoke(r0)     // Catch: java.lang.Throwable -> L12
        Lc3:
            boolean r0 = r3 instanceof sf.f     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto Lc8
            goto Lc9
        Lc8:
            r1 = r3
        Lc9:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L12
            monitor-exit(r7)
            return r1
        Lcd:
            monitor-exit(r7)
            return r1
        Lcf:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L12
            throw r0
    }

    public final synchronized java.lang.reflect.Method g() {
            r7 = this;
            monitor-enter(r7)
            java.lang.reflect.Method r0 = r7.f10437f     // Catch: java.lang.Throwable -> L12
            r1 = 0
            if (r0 == 0) goto L15
            boolean r2 = d(r0)     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto Ld
            goto Le
        Ld:
            r0 = r1
        Le:
            if (r0 == 0) goto L15
            monitor-exit(r7)
            return r0
        L12:
            r0 = move-exception
            goto Lcf
        L15:
            android.content.Context r0 = r7.f10432a     // Catch: java.lang.Throwable -> L12
            java.lang.ClassLoader r2 = r7.f10433b     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = e8.b.g(r0, r2)     // Catch: java.lang.Throwable -> L12
            android.content.SharedPreferences r2 = r7.f10436e     // Catch: java.lang.Throwable -> L12
            java.lang.ClassLoader r3 = r7.f10433b     // Catch: java.lang.Throwable -> L12
            java.lang.String r4 = "native_like_v1"
            java.lang.reflect.Method r2 = e8.b.c(r2, r0, r3, r4)     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto L37
            boolean r3 = d(r2)     // Catch: java.lang.Throwable -> L12
            if (r3 == 0) goto L30
            goto L31
        L30:
            r2 = r1
        L31:
            if (r2 == 0) goto L37
            r7.f10437f = r2     // Catch: java.lang.Throwable -> L12
            monitor-exit(r7)
            return r2
        L37:
            org.luckypray.dexkit.DexKitBridge r2 = r7.f10434c     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto Lcd
            ch.c r3 = new ch.c     // Catch: java.lang.Throwable -> L8b
            r3.<init>()     // Catch: java.lang.Throwable -> L8b
            fh.a r4 = new fh.a     // Catch: java.lang.Throwable -> L8b
            r4.<init>()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r5 = "MicroMsg.SnsService"
            java.lang.String r6 = "can not add Comment"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}     // Catch: java.lang.Throwable -> L8b
            r4.p0(r5)     // Catch: java.lang.Throwable -> L8b
            r3.f1664h = r4     // Catch: java.lang.Throwable -> L8b
            hh.j r2 = r2.findClass(r3)     // Catch: java.lang.Throwable -> L8b
            dg.n r2 = tf.m.m1(r2)     // Catch: java.lang.Throwable -> L8b
            p8.w r3 = new p8.w     // Catch: java.lang.Throwable -> L8b
            r4 = 0
            r3.<init>(r7, r4)     // Catch: java.lang.Throwable -> L8b
            ng.i r2 = ng.m.X(r2, r3)     // Catch: java.lang.Throwable -> L8b
            o9.e r3 = new o9.e     // Catch: java.lang.Throwable -> L8b
            r4 = 13
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L8b
            dg.j r4 = new dg.j     // Catch: java.lang.Throwable -> L8b
            ng.q r5 = ng.q.f9453n     // Catch: java.lang.Throwable -> L8b
            r4.<init>(r2, r3, r5)     // Catch: java.lang.Throwable -> L8b
            ng.h r2 = new ng.h     // Catch: java.lang.Throwable -> L8b
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L8b
        L77:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L8b
            if (r3 == 0) goto L8d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L8b
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch: java.lang.Throwable -> L8b
            boolean r4 = d(r4)     // Catch: java.lang.Throwable -> L8b
            if (r4 == 0) goto L77
            goto L8e
        L8b:
            r0 = move-exception
            goto L9e
        L8d:
            r3 = r1
        L8e:
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L8b
            if (r3 == 0) goto L9c
            r7.f10437f = r3     // Catch: java.lang.Throwable -> L8b
            android.content.SharedPreferences r2 = r7.f10436e     // Catch: java.lang.Throwable -> L8b
            java.lang.String r4 = "native_like_v1"
            e8.b.h(r2, r0, r4, r3)     // Catch: java.lang.Throwable -> L8b
            goto La3
        L9c:
            r3 = r1
            goto La3
        L9e:
            sf.f r3 = new sf.f     // Catch: java.lang.Throwable -> L12
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L12
        La3:
            java.lang.Throwable r0 = sf.g.b(r3)     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto Lc3
            p8.p r2 = r7.f10435d     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r4.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.String r5 = "定位朋友圈原生点赞方法失败: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L12
            r4.append(r0)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L12
            r2.invoke(r0)     // Catch: java.lang.Throwable -> L12
        Lc3:
            boolean r0 = r3 instanceof sf.f     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto Lc8
            goto Lc9
        Lc8:
            r1 = r3
        Lc9:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L12
            monitor-exit(r7)
            return r1
        Lcd:
            monitor-exit(r7)
            return r1
        Lcf:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L12
            throw r0
    }

    public final synchronized java.lang.reflect.Constructor h() {
            r6 = this;
            monitor-enter(r6)
            java.lang.reflect.Constructor r0 = r6.f10440i     // Catch: java.lang.Throwable -> L12
            r1 = 0
            if (r0 == 0) goto L15
            boolean r2 = e(r0)     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto Ld
            goto Le
        Ld:
            r0 = r1
        Le:
            if (r0 == 0) goto L15
            monitor-exit(r6)
            return r0
        L12:
            r0 = move-exception
            goto Lcd
        L15:
            android.content.Context r0 = r6.f10432a     // Catch: java.lang.Throwable -> L12
            java.lang.ClassLoader r2 = r6.f10433b     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = e8.b.g(r0, r2)     // Catch: java.lang.Throwable -> L12
            android.content.SharedPreferences r2 = r6.f10436e     // Catch: java.lang.Throwable -> L12
            java.lang.ClassLoader r3 = r6.f10433b     // Catch: java.lang.Throwable -> L12
            java.lang.String r4 = "timeline_refresh_v1"
            java.lang.reflect.Constructor r2 = e8.b.d(r2, r0, r3, r4)     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto L37
            boolean r3 = e(r2)     // Catch: java.lang.Throwable -> L12
            if (r3 == 0) goto L30
            goto L31
        L30:
            r2 = r1
        L31:
            if (r2 == 0) goto L37
            r6.f10440i = r2     // Catch: java.lang.Throwable -> L12
            monitor-exit(r6)
            return r2
        L37:
            org.luckypray.dexkit.DexKitBridge r2 = r6.f10434c     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto Lcb
            ch.c r3 = new ch.c     // Catch: java.lang.Throwable -> L89
            r3.<init>()     // Catch: java.lang.Throwable -> L89
            fh.a r4 = new fh.a     // Catch: java.lang.Throwable -> L89
            r4.<init>()     // Catch: java.lang.Throwable -> L89
            java.lang.String r5 = "MicroMsg.NetSceneSnsTimeLine"
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch: java.lang.Throwable -> L89
            r4.p0(r5)     // Catch: java.lang.Throwable -> L89
            r3.f1664h = r4     // Catch: java.lang.Throwable -> L89
            hh.j r2 = r2.findClass(r3)     // Catch: java.lang.Throwable -> L89
            dg.n r2 = tf.m.m1(r2)     // Catch: java.lang.Throwable -> L89
            p8.w r3 = new p8.w     // Catch: java.lang.Throwable -> L89
            r4 = 2
            r3.<init>(r6, r4)     // Catch: java.lang.Throwable -> L89
            ng.i r2 = ng.m.X(r2, r3)     // Catch: java.lang.Throwable -> L89
            o9.e r3 = new o9.e     // Catch: java.lang.Throwable -> L89
            r4 = 15
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L89
            dg.j r4 = new dg.j     // Catch: java.lang.Throwable -> L89
            ng.q r5 = ng.q.f9453n     // Catch: java.lang.Throwable -> L89
            r4.<init>(r2, r3, r5)     // Catch: java.lang.Throwable -> L89
            ng.h r2 = new ng.h     // Catch: java.lang.Throwable -> L89
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L89
        L75:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L89
            if (r3 == 0) goto L8b
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L89
            r4 = r3
            java.lang.reflect.Constructor r4 = (java.lang.reflect.Constructor) r4     // Catch: java.lang.Throwable -> L89
            boolean r4 = e(r4)     // Catch: java.lang.Throwable -> L89
            if (r4 == 0) goto L75
            goto L8c
        L89:
            r0 = move-exception
            goto L9c
        L8b:
            r3 = r1
        L8c:
            java.lang.reflect.Constructor r3 = (java.lang.reflect.Constructor) r3     // Catch: java.lang.Throwable -> L89
            if (r3 == 0) goto L9a
            r6.f10440i = r3     // Catch: java.lang.Throwable -> L89
            android.content.SharedPreferences r2 = r6.f10436e     // Catch: java.lang.Throwable -> L89
            java.lang.String r4 = "timeline_refresh_v1"
            e8.b.i(r2, r0, r4, r3)     // Catch: java.lang.Throwable -> L89
            goto La1
        L9a:
            r3 = r1
            goto La1
        L9c:
            sf.f r3 = new sf.f     // Catch: java.lang.Throwable -> L12
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L12
        La1:
            java.lang.Throwable r0 = sf.g.b(r3)     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto Lc1
            p8.p r2 = r6.f10435d     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r4.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.String r5 = "定位朋友圈原生刷新请求失败: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L12
            r4.append(r0)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L12
            r2.invoke(r0)     // Catch: java.lang.Throwable -> L12
        Lc1:
            boolean r0 = r3 instanceof sf.f     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto Lc6
            goto Lc7
        Lc6:
            r1 = r3
        Lc7:
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1     // Catch: java.lang.Throwable -> L12
            monitor-exit(r6)
            return r1
        Lcb:
            monitor-exit(r6)
            return r1
        Lcd:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L12
            throw r0
    }
}
