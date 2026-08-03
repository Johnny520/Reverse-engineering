package ca;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ca.e0 f1475b;

    public /* synthetic */ d0(ca.e0 r1, int r2) {
            r0 = this;
            r0.f1474a = r2
            r0.f1475b = r1
            r0.<init>()
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r18) {
            r17 = this;
            r1 = r17
            r0 = r18
            int r2 = r1.f1474a
            switch(r2) {
                case 1: goto L143;
                case 2: goto L9;
                case 3: goto Lba;
                case 4: goto Ld;
                default: goto L9;
            }
        L9:
            super.afterHookedMethod(r18)
            return
        Ld:
            r0.getClass()
            ca.e0 r2 = r1.f1475b
            android.content.SharedPreferences r2 = r2.f1485e
            java.lang.String r3 = "message_forward_multi_moments_enable"
            r4 = 0
            boolean r2 = r2.getBoolean(r3, r4)
            if (r2 != 0) goto L1f
            goto Lb9
        L1f:
            java.lang.Object r2 = r0.thisObject
            java.util.List r2 = k8.b.b(r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r5 = r2.iterator()
        L2e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L42
            java.lang.Object r6 = r5.next()
            java.lang.Integer r6 = ca.e0.i(r6)
            if (r6 == 0) goto L2e
            r3.add(r6)
            goto L2e
        L42:
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto Lb9
            int r5 = r3.size()
            int r2 = r2.size()
            if (r5 != r2) goto Lb9
            java.lang.String r2 = ca.e0.h(r3)
            if (r2 == 0) goto L59
            goto Lb9
        L59:
            java.lang.Object[] r0 = r0.args
            if (r0 == 0) goto Lb9
            java.lang.Object r0 = tf.l.C0(r4, r0)
            if (r0 == 0) goto Lb9
            java.lang.String r2 = "转发到朋友圈[H]"
            java.lang.String r3 = "f"
            java.lang.String r5 = "add"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r6 = "findItem"
            r7 = 1212370256(0x48434d50, float:199989.25)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.invokeMethod(r0, r6, r8)
            if (r6 == 0) goto L81
            goto Lb9
        L81:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r6 = new java.lang.Object[]{r4, r6, r4, r2}
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.invokeMethod(r0, r5, r6)
            if (r6 == 0) goto L90
            goto L9c
        L90:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r6, r4, r2}
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.invokeMethod(r0, r5, r4)
        L9c:
            if (r6 == 0) goto L9f
            goto Lb9
        L9f:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r2}
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.invokeMethod(r0, r3, r4)
            if (r4 == 0) goto Lae
            goto Lb9
        Lae:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r2 = new java.lang.Object[]{r4, r2}
            h.Hchat.utils.KavaReflector.invokeMethod(r0, r3, r2)
        Lb9:
            return
        Lba:
            r0.getClass()
            ca.e0 r2 = r1.f1475b
            android.content.SharedPreferences r3 = r2.f1485e
            java.lang.String r4 = "message_forward_favorite_enable"
            r5 = 0
            boolean r3 = r3.getBoolean(r4, r5)
            if (r3 != 0) goto Lcc
            goto L142
        Lcc:
            java.lang.Object[] r3 = r0.args
            if (r3 == 0) goto L142
            r4 = 1
            java.lang.Object r6 = tf.l.C0(r4, r3)
            boolean r7 = r6 instanceof android.view.View
            r8 = 0
            if (r7 == 0) goto Ldd
            android.view.View r6 = (android.view.View) r6
            goto Lde
        Ldd:
            r6 = r8
        Lde:
            java.lang.Object r6 = g4.a.J(r6)
            if (r6 == 0) goto Le5
            goto Lf4
        Le5:
            java.lang.Object r6 = g4.a.J(r3)
            if (r6 == 0) goto Lec
            goto Lf4
        Lec:
            java.lang.Object r0 = r0.thisObject
            java.lang.Object r6 = g4.a.J(r0)
            if (r6 == 0) goto L142
        Lf4:
            long r6 = g4.a.B(r6)
            r9 = 0
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 > 0) goto Lff
            goto L142
        Lff:
            java.lang.Object r0 = tf.l.C0(r5, r3)
            if (r0 == 0) goto L142
            java.lang.Object r3 = tf.l.C0(r4, r3)
            boolean r4 = r3 instanceof android.view.View
            if (r4 == 0) goto L110
            r8 = r3
            android.view.View r8 = (android.view.View) r8
        L110:
            int r3 = ca.e0.m(r0)
            r4 = 1212368449(0x48434641, float:199961.02)
            android.view.MenuItem r0 = ca.e0.a(r0, r8, r3, r4)
            if (r0 == 0) goto L142
            java.util.Map r3 = r2.f1489i
            r3.getClass()
            monitor-enter(r3)
            java.util.Map r4 = r2.f1489i     // Catch: java.lang.Throwable -> L13c
            boolean r4 = r4.containsKey(r0)     // Catch: java.lang.Throwable -> L13c
            if (r4 != 0) goto L13e
            java.util.Map r4 = r2.f1489i     // Catch: java.lang.Throwable -> L13c
            r4.getClass()     // Catch: java.lang.Throwable -> L13c
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Throwable -> L13c
            java.lang.Long r5 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L13c
            r4.put(r0, r5)     // Catch: java.lang.Throwable -> L13c
            r2.f1490j = r6     // Catch: java.lang.Throwable -> L13c
            goto L13e
        L13c:
            r0 = move-exception
            goto L140
        L13e:
            monitor-exit(r3)
            goto L142
        L140:
            monitor-exit(r3)
            throw r0
        L142:
            return
        L143:
            java.lang.String r2 = "com.tencent.mm.storage."
            r0.getClass()
            ca.e0 r3 = r1.f1475b
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            java.util.Map r5 = r3.f1487g
            r5.clear()
            java.util.concurrent.ConcurrentHashMap r5 = r3.f1488h
            r5.clear()
            android.content.SharedPreferences r6 = r3.f1485e
            java.lang.String r7 = "message_forward_enable"
            r8 = 0
            boolean r6 = r6.getBoolean(r7, r8)
            if (r6 != 0) goto L163
            goto L32d
        L163:
            java.lang.Object[] r0 = r0.args
            if (r0 == 0) goto L32d
            java.lang.Object r6 = tf.l.C0(r8, r0)
            if (r6 == 0) goto L32d
            r7 = 1
            java.lang.Object r0 = tf.l.C0(r7, r0)
            boolean r9 = r0 instanceof android.view.View
            if (r9 == 0) goto L179
            android.view.View r0 = (android.view.View) r0
            goto L17a
        L179:
            r0 = 0
        L17a:
            if (r0 == 0) goto L32d
            java.lang.Object r9 = r0.getTag()
            boolean r11 = r9 instanceof android.view.View
            if (r11 == 0) goto L18a
            android.view.View r9 = (android.view.View) r9
            java.lang.Object r9 = r9.getTag()
        L18a:
            if (r9 != 0) goto L18f
        L18c:
            r9 = 0
            goto L247
        L18f:
            boolean r11 = eh.a.z(r2, r9, r8)
            r12 = 0
            if (r11 == 0) goto L1a1
            long r14 = r3.g(r9)
            int r11 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r11 <= 0) goto L1a1
            goto L247
        L1a1:
            java.lang.Class r11 = r9.getClass()
        L1a5:
            if (r11 == 0) goto L1ee
            boolean r14 = r11.equals(r4)
            if (r14 != 0) goto L1ee
            java.util.List r14 = h.Hchat.utils.KavaReflector.declaredFields(r11)
            java.util.Iterator r14 = r14.iterator()
        L1b5:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L1e9
            java.lang.Object r15 = r14.next()
            java.lang.reflect.Field r15 = (java.lang.reflect.Field) r15
            boolean r16 = h.Hchat.utils.KavaReflector.isStatic(r15)
            if (r16 != 0) goto L1b5
            java.lang.Class r16 = r15.getType()
            r16.getClass()
            java.lang.String r10 = r16.getName()
            boolean r10 = og.t.d0(r10, r2, r8)
            if (r10 != 0) goto L1d9
            goto L1b5
        L1d9:
            java.lang.Object r10 = h.Hchat.utils.KavaReflector.readField(r15, r9)
            if (r10 == 0) goto L1b5
            long r15 = r3.g(r10)
            int r15 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r15 <= 0) goto L1b5
            r9 = r10
            goto L247
        L1e9:
            java.lang.Class r11 = r11.getSuperclass()
            goto L1a5
        L1ee:
            java.lang.Class r10 = r9.getClass()
        L1f2:
            if (r10 == 0) goto L18c
            boolean r11 = r10.equals(r4)
            if (r11 != 0) goto L18c
            java.util.List r11 = h.Hchat.utils.KavaReflector.declaredMethods(r10)
            java.util.Iterator r11 = r11.iterator()
        L202:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L242
            java.lang.Object r14 = r11.next()
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            boolean r15 = h.Hchat.utils.KavaReflector.isStatic(r14)
            if (r15 != 0) goto L202
            java.lang.Class[] r15 = r14.getParameterTypes()
            r15.getClass()
            int r15 = r15.length
            if (r15 != 0) goto L202
            java.lang.Class r15 = r14.getReturnType()
            r15.getClass()
            java.lang.String r15 = r15.getName()
            boolean r15 = og.t.d0(r15, r2, r8)
            if (r15 != 0) goto L230
            goto L202
        L230:
            java.lang.Object[] r15 = new java.lang.Object[r8]
            java.lang.Object r14 = h.Hchat.utils.KavaReflector.invoke(r14, r9, r15)
            if (r14 == 0) goto L202
            long r15 = r3.g(r14)
            int r15 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r15 <= 0) goto L202
            r9 = r14
            goto L247
        L242:
            java.lang.Class r10 = r10.getSuperclass()
            goto L1f2
        L247:
            if (r9 == 0) goto L32d
            java.lang.Integer r2 = ca.e0.i(r9)
            if (r2 == 0) goto L32d
            int r2 = r2.intValue()
            java.util.Set r10 = ca.e0.f1480s
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r10.contains(r2)
            if (r2 != r7) goto L32d
            int r2 = ca.e0.m(r6)
            r10 = 1212368471(0x48434657, float:199961.36)
            android.view.MenuItem r0 = ca.e0.a(r6, r0, r2, r10)
            if (r0 == 0) goto L32d
            ca.b0 r2 = new ca.b0
            r2.<init>(r9)
            java.util.Map r3 = r3.f1487g
            r3.getClass()
            java.util.Map r3 = (java.util.Map) r3
            r3.put(r0, r2)
            int r3 = r0.getGroupId()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5.put(r3, r2)
            java.lang.Class r2 = r6.getClass()
        L28a:
            if (r2 == 0) goto L32d
            boolean r3 = r2.equals(r4)
            if (r3 != 0) goto L32d
            java.util.List r3 = h.Hchat.utils.KavaReflector.declaredFields(r2)
            java.util.Iterator r3 = r3.iterator()
        L29a:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L327
            java.lang.Object r5 = r3.next()
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            java.lang.Class<java.util.List> r9 = java.util.List.class
            java.lang.Class r11 = r5.getType()
            boolean r9 = r9.isAssignableFrom(r11)
            if (r9 != 0) goto L2b3
            goto L29a
        L2b3:
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.readField(r5, r6)
            boolean r9 = gg.x.e(r5)
            if (r9 == 0) goto L2c0
            java.util.List r5 = (java.util.List) r5
            goto L2c1
        L2c0:
            r5 = 0
        L2c1:
            if (r5 == 0) goto L29a
            java.util.Iterator r9 = r5.iterator()
            r11 = r8
        L2c8:
            boolean r12 = r9.hasNext()
            r13 = -1
            if (r12 == 0) goto L2e9
            java.lang.Object r12 = r9.next()
            if (r12 == r0) goto L2ea
            boolean r14 = r12 instanceof android.view.MenuItem
            if (r14 == 0) goto L2dc
            android.view.MenuItem r12 = (android.view.MenuItem) r12
            goto L2dd
        L2dc:
            r12 = 0
        L2dd:
            if (r12 == 0) goto L2e6
            int r12 = r12.getItemId()
            if (r12 != r10) goto L2e6
            goto L2ea
        L2e6:
            int r11 = r11 + 1
            goto L2c8
        L2e9:
            r11 = r13
        L2ea:
            if (r11 >= 0) goto L2ed
            goto L29a
        L2ed:
            java.lang.Object r0 = r5.remove(r11)
            java.util.Iterator r2 = r5.iterator()
            r3 = r8
        L2f6:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L318
            java.lang.Object r4 = r2.next()
            boolean r6 = r4 instanceof android.view.MenuItem
            if (r6 == 0) goto L307
            android.view.MenuItem r4 = (android.view.MenuItem) r4
            goto L308
        L307:
            r4 = 0
        L308:
            if (r4 == 0) goto L315
            int r4 = r4.getItemId()
            r6 = 1212371536(0x48435250, float:200009.25)
            if (r4 != r6) goto L315
            r13 = r3
            goto L318
        L315:
            int r3 = r3 + 1
            goto L2f6
        L318:
            if (r13 < 0) goto L31c
            int r8 = r13 + 1
        L31c:
            int r2 = r5.size()
            if (r8 <= r2) goto L323
            r8 = r2
        L323:
            r5.add(r8, r0)
            goto L32d
        L327:
            java.lang.Class r2 = r2.getSuperclass()
            goto L28a
        L32d:
            return
    }

    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r12) {
            r11 = this;
            int r0 = r11.f1474a
            switch(r0) {
                case 0: goto Lcb;
                case 1: goto L5;
                case 2: goto L9;
                default: goto L5;
            }
        L5:
            super.beforeHookedMethod(r12)
            return
        L9:
            r12.getClass()
            ca.e0 r3 = r11.f1475b
            monitor-enter(r3)
            android.content.SharedPreferences r0 = r3.f1485e     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "message_forward_favorite_enable"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L1d
            monitor-exit(r3)
            goto Lc8
        L1d:
            java.lang.Object[] r0 = r12.args     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto Lc7
            int r1 = r0.length     // Catch: java.lang.Throwable -> L2e
        L22:
            r4 = 0
            if (r2 >= r1) goto L39
            r5 = r0[r2]     // Catch: java.lang.Throwable -> L2e
            boolean r6 = r5 instanceof android.view.MenuItem     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto L32
            android.view.MenuItem r5 = (android.view.MenuItem) r5     // Catch: java.lang.Throwable -> L2e
            goto L33
        L2e:
            r0 = move-exception
            r12 = r0
            goto Lc9
        L32:
            r5 = r4
        L33:
            if (r5 == 0) goto L36
            goto L3a
        L36:
            int r2 = r2 + 1
            goto L22
        L39:
            r5 = r4
        L3a:
            if (r5 == 0) goto Lc7
            int r0 = r5.getItemId()     // Catch: java.lang.Throwable -> L2e
            r1 = 1212368449(0x48434641, float:199961.02)
            if (r0 == r1) goto L48
            monitor-exit(r3)
            goto Lc8
        L48:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L2e
            java.lang.ref.WeakReference r2 = r3.f1491k     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L57
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L2e
            android.view.MenuItem r2 = (android.view.MenuItem) r2     // Catch: java.lang.Throwable -> L2e
            goto L58
        L57:
            r2 = r4
        L58:
            if (r2 != r5) goto L66
            long r6 = r3.f1492l     // Catch: java.lang.Throwable -> L2e
            long r6 = r0 - r6
            r8 = 1500(0x5dc, double:7.41E-321)
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 >= 0) goto L66
            monitor-exit(r3)
            goto Lc8
        L66:
            r12.setResult(r4)     // Catch: java.lang.Throwable -> L2e
            android.app.Activity r2 = ca.e0.b()     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto Lc5
            java.util.Map r6 = r3.f1489i     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r6 = r6.remove(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r6 = (java.lang.Long) r6     // Catch: java.lang.Throwable -> L2e
            r7 = 0
            if (r6 == 0) goto L80
            long r9 = r6.longValue()     // Catch: java.lang.Throwable -> L2e
            goto L9c
        L80:
            long r9 = r3.f1490j     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r6 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> L2e
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 <= 0) goto L8b
            r4 = r6
        L8b:
            if (r4 == 0) goto L92
            long r9 = r4.longValue()     // Catch: java.lang.Throwable -> L2e
            goto L9c
        L92:
            java.lang.Object[] r12 = r12.args     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r12 = g4.a.J(r12)     // Catch: java.lang.Throwable -> L2e
            long r9 = g4.a.B(r12)     // Catch: java.lang.Throwable -> L2e
        L9c:
            java.util.Map r12 = r3.f1489i     // Catch: java.lang.Throwable -> L2e
            r12.clear()     // Catch: java.lang.Throwable -> L2e
            r3.f1490j = r7     // Catch: java.lang.Throwable -> L2e
            int r12 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r12 > 0) goto Lae
            java.lang.String r12 = "当前收藏不可用"
            r3.r(r2, r12)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r3)
            goto Lc8
        Lae:
            java.lang.ref.WeakReference r12 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L2e
            r12.<init>(r5)     // Catch: java.lang.Throwable -> L2e
            r3.f1491k = r12     // Catch: java.lang.Throwable -> L2e
            r3.f1492l = r0     // Catch: java.lang.Throwable -> L2e
            android.os.Handler r12 = r3.f1484d     // Catch: java.lang.Throwable -> L2e
            ca.r r1 = new ca.r     // Catch: java.lang.Throwable -> L2e
            r6 = 0
            r4 = r9
            r1.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L2e
            r12.post(r1)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r3)
            goto Lc8
        Lc5:
            monitor-exit(r3)
            goto Lc8
        Lc7:
            monitor-exit(r3)
        Lc8:
            return
        Lc9:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2e
            throw r12
        Lcb:
            r12.getClass()
            ca.e0 r0 = r11.f1475b
            android.content.SharedPreferences r1 = r0.f1485e
            java.util.concurrent.ConcurrentHashMap r2 = r0.f1488h
            java.util.Map r3 = r0.f1487g
            java.lang.String r4 = "message_forward_enable"
            r5 = 0
            boolean r1 = r1.getBoolean(r4, r5)
            if (r1 != 0) goto Le1
            goto L149
        Le1:
            java.lang.Object[] r12 = r12.args
            if (r12 == 0) goto L149
            int r1 = r12.length
        Le6:
            r4 = 0
            if (r5 >= r1) goto Lf8
            r6 = r12[r5]
            boolean r7 = r6 instanceof android.view.MenuItem
            if (r7 == 0) goto Lf2
            r4 = r6
            android.view.MenuItem r4 = (android.view.MenuItem) r4
        Lf2:
            if (r4 == 0) goto Lf5
            goto Lf8
        Lf5:
            int r5 = r5 + 1
            goto Le6
        Lf8:
            if (r4 == 0) goto L149
            int r12 = r4.getItemId()
            r1 = 1212368471(0x48434657, float:199961.36)
            if (r12 == r1) goto L104
            goto L149
        L104:
            java.lang.Object r12 = r3.remove(r4)
            ca.b0 r12 = (ca.b0) r12
            if (r12 == 0) goto L10d
            goto L11b
        L10d:
            int r12 = r4.getGroupId()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object r12 = r2.remove(r12)
            ca.b0 r12 = (ca.b0) r12
        L11b:
            r3.clear()
            r2.clear()
            android.app.Activity r1 = ca.e0.b()
            if (r12 == 0) goto L144
            if (r1 != 0) goto L12a
            goto L144
        L12a:
            java.lang.Object r12 = r12.f1465a
            hb.t r12 = x6.d.y(r12)
            if (r12 != 0) goto L138
            java.lang.String r12 = "该消息暂不支持转发"
            r0.r(r1, r12)
            goto L149
        L138:
            android.os.Handler r2 = r0.f1484d
            ac.l r3 = new ac.l
            r4 = 7
            r3.<init>(r1, r0, r12, r4)
            r2.post(r3)
            goto L149
        L144:
            java.lang.String r12 = "消息不可转发"
            r0.r(r1, r12)
        L149:
            return
    }
}
