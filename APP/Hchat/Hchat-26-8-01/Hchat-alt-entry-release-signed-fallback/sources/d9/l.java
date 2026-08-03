package d9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d9.m f2119b;

    public /* synthetic */ l(d9.m r1, int r2) {
            r0 = this;
            r0.f2118a = r2
            r0.f2119b = r1
            r0.<init>()
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r14) {
            r13 = this;
            int r0 = r13.f2118a
            switch(r0) {
                case 0: goto L30f;
                case 2: goto L267;
                case 5: goto L9;
                default: goto L5;
            }
        L5:
            super.afterHookedMethod(r14)
            return
        L9:
            r14.getClass()
            d9.m r0 = r13.f2119b
            r8.g r1 = r0.f2121a
            android.content.Context r1 = r1.f11620a
            java.lang.String r2 = "Hchat_custom_friend_avatar_config"
            android.content.SharedPreferences r3 = ub.b.c(r1, r2)
            java.lang.String r4 = "enable"
            r5 = 0
            boolean r3 = r3.getBoolean(r4, r5)
            if (r3 == 0) goto L266
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            java.lang.String r2 = "conversation_menu"
            r3 = 1
            boolean r1 = r1.getBoolean(r2, r3)
            if (r1 == 0) goto L266
            java.lang.Object[] r1 = r14.args
            r1.getClass()
            java.lang.Object r1 = tf.l.C0(r5, r1)
            boolean r2 = r1 instanceof android.view.ContextMenu
            r4 = 0
            if (r2 == 0) goto L3f
            android.view.ContextMenu r1 = (android.view.ContextMenu) r1
            goto L40
        L3f:
            r1 = r4
        L40:
            if (r1 == 0) goto L266
            java.lang.Object r2 = r14.thisObject
            if (r2 == 0) goto Lbb
            g8.i r6 = h.Hchat.hooks.api.core.WeChatApis.contacts()
            if (r6 == 0) goto Lbb
            java.lang.Class r7 = r2.getClass()
            java.util.List r7 = h.Hchat.utils.KavaReflector.declaredFields(r7)
            dg.n r7 = tf.m.m1(r7)
            b4.b r8 = new b4.b
            r9 = 20
            r8.<init>(r9)
            ng.i r9 = new ng.i
            r9.<init>(r7, r3, r8)
            c9.k1 r7 = new c9.k1
            r8 = 5
            r7.<init>(r2, r8)
            ng.i r2 = ng.m.X(r9, r7)
            b4.b r7 = new b4.b
            r8 = 21
            r7.<init>(r8)
            ng.t r2 = ng.m.W(r2, r7)
            b4.b r7 = new b4.b
            r8 = 22
            r7.<init>(r8)
            ng.i r8 = new ng.i
            r8.<init>(r2, r3, r7)
            ng.h r2 = new ng.h
            r2.<init>(r8)
        L8a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lb7
            java.lang.Object r3 = r2.next()
            r7 = r3
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = r6.H(r7)     // Catch: java.lang.Throwable -> La0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> La0
            goto La7
        La0:
            r7 = move-exception
            sf.f r8 = new sf.f
            r8.<init>(r7)
            r7 = r8
        La7:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            boolean r9 = r7 instanceof sf.f
            if (r9 == 0) goto Lae
            r7 = r8
        Lae:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L8a
            goto Lb8
        Lb7:
            r3 = r4
        Lb8:
            java.lang.String r3 = (java.lang.String) r3
            goto Lbc
        Lbb:
            r3 = r4
        Lbc:
            if (r3 == 0) goto L266
            r2 = 7999489(0x7a1001, float:1.1209672E-38)
            r1.removeItem(r2)
            android.view.MenuItem r6 = r1.getItem(r5)     // Catch: java.lang.Throwable -> Ld1
            int r6 = r6.getGroupId()     // Catch: java.lang.Throwable -> Ld1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Ld1
            goto Ld8
        Ld1:
            r6 = move-exception
            sf.f r7 = new sf.f
            r7.<init>(r6)
            r6 = r7
        Ld8:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            boolean r8 = r6 instanceof sf.f
            if (r8 == 0) goto Le1
            r6 = r7
        Le1:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.String r7 = "设置自定义头像"
            android.view.MenuItem r2 = r1.add(r6, r2, r5, r7)
            r2.getClass()
            java.lang.Class r6 = r1.getClass()
        Lf4:
            if (r6 == 0) goto L16a
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L16a
            java.util.List r7 = h.Hchat.utils.KavaReflector.declaredFields(r6)
            java.util.Iterator r7 = r7.iterator()
        L106:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L165
            java.lang.Object r8 = r7.next()
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            java.lang.Class<java.util.List> r9 = java.util.List.class
            java.lang.Class r10 = r8.getType()
            boolean r9 = r9.isAssignableFrom(r10)
            if (r9 != 0) goto L11f
            goto L106
        L11f:
            java.lang.Object r8 = h.Hchat.utils.KavaReflector.readField(r8, r1)
            boolean r9 = gg.x.e(r8)
            if (r9 == 0) goto L12c
            java.util.List r8 = (java.util.List) r8
            goto L12d
        L12c:
            r8 = r4
        L12d:
            if (r8 == 0) goto L106
            java.util.Iterator r9 = r8.iterator()
            r10 = r5
        L134:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L158
            java.lang.Object r11 = r9.next()
            if (r11 == r2) goto L159
            boolean r12 = r11 instanceof android.view.MenuItem
            if (r12 == 0) goto L147
            android.view.MenuItem r11 = (android.view.MenuItem) r11
            goto L148
        L147:
            r11 = r4
        L148:
            if (r11 == 0) goto L155
            int r11 = r11.getItemId()
            int r12 = r2.getItemId()
            if (r11 != r12) goto L155
            goto L159
        L155:
            int r10 = r10 + 1
            goto L134
        L158:
            r10 = -1
        L159:
            if (r10 <= 0) goto L162
            java.lang.Object r9 = r8.remove(r10)     // Catch: java.lang.Throwable -> L162
            r8.add(r5, r9)     // Catch: java.lang.Throwable -> L162
        L162:
            if (r10 < 0) goto L106
            goto L16a
        L165:
            java.lang.Class r6 = r6.getSuperclass()
            goto Lf4
        L16a:
            java.lang.Object r1 = r14.thisObject
            java.lang.String r6 = "getActivity"
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.invokeMethod(r1, r6, r7)
            boolean r7 = r6 instanceof android.app.Activity
            if (r7 == 0) goto L17b
            android.app.Activity r6 = (android.app.Activity) r6
            goto L17c
        L17b:
            r6 = r4
        L17c:
            if (r6 == 0) goto L180
            goto L1f0
        L180:
            java.lang.String r6 = "getContext"
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.invokeMethod(r1, r6, r7)
            boolean r7 = r6 instanceof android.app.Activity
            if (r7 == 0) goto L18f
            android.app.Activity r6 = (android.app.Activity) r6
            goto L190
        L18f:
            r6 = r4
        L190:
            if (r6 == 0) goto L193
            goto L1f0
        L193:
            gg.u r6 = new gg.u
            r6.<init>()
            r6.f4564g = r1
            r1 = r5
        L19b:
            r7 = 4
            if (r1 >= r7) goto L1ef
            java.lang.Object r7 = r6.f4564g
            boolean r8 = r7 instanceof android.app.Activity
            if (r8 == 0) goto L1a8
            r6 = r7
            android.app.Activity r6 = (android.app.Activity) r6
            goto L1f0
        L1a8:
            boolean r8 = r7 instanceof android.content.ContextWrapper
            if (r8 == 0) goto L1b5
            android.content.ContextWrapper r7 = (android.content.ContextWrapper) r7
            android.content.Context r7 = r7.getBaseContext()
            r6.f4564g = r7
            goto L1ec
        L1b5:
            if (r7 == 0) goto L1bc
            java.lang.Class r7 = r7.getClass()
            goto L1bd
        L1bc:
            r7 = r4
        L1bd:
            d9.k r8 = new d9.k
            r9 = 0
            r8.<init>(r7, r4, r9)
            dg.n r7 = new dg.n
            r7.<init>(r8)
            d9.g r8 = new d9.g
            r8.<init>(r6, r9)
            ng.i r7 = ng.m.X(r7, r8)
            ng.h r8 = new ng.h
            r8.<init>(r7)
        L1d6:
            boolean r7 = r8.hasNext()
            if (r7 == 0) goto L1e9
            java.lang.Object r7 = r8.next()
            boolean r9 = r7 instanceof android.app.Activity
            if (r9 != 0) goto L1ea
            boolean r9 = r7 instanceof android.content.ContextWrapper
            if (r9 == 0) goto L1d6
            goto L1ea
        L1e9:
            r7 = r4
        L1ea:
            r6.f4564g = r7
        L1ec:
            int r1 = r1 + 1
            goto L19b
        L1ef:
            r6 = r4
        L1f0:
            if (r6 == 0) goto L266
            java.util.Map r1 = r0.f2127g
            r1.getClass()
            java.util.Map r1 = (java.util.Map) r1
            sf.e r7 = new sf.e
            r7.<init>(r6, r3)
            r1.put(r2, r7)
            java.lang.Object r14 = r14.thisObject
            if (r14 == 0) goto L266
            java.lang.Class r1 = r14.getClass()
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredFields(r1)
            dg.n r1 = tf.m.m1(r1)
            b4.b r2 = new b4.b
            r3 = 18
            r2.<init>(r3)
            ng.i r3 = new ng.i
            r3.<init>(r1, r5, r2)
            c9.k1 r1 = new c9.k1
            r2 = 4
            r1.<init>(r14, r2)
            ng.i r14 = ng.m.X(r3, r1)
            b4.b r1 = new b4.b
            r2 = 19
            r1.<init>(r2)
            ng.i r14 = ng.m.X(r14, r1)
            ng.h r1 = new ng.h
            r1.<init>(r14)
        L237:
            boolean r14 = r1.hasNext()
            if (r14 == 0) goto L259
            java.lang.Object r14 = r1.next()
            r2 = r14
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Class r3 = r2.getReturnType()
            java.lang.Class r6 = java.lang.Void.TYPE
            boolean r3 = gg.l.a(r3, r6)
            if (r3 == 0) goto L237
            java.lang.String r3 = "com.tencent.mm.ui.conversation."
            boolean r2 = eh.a.A(r2, r5, r3)
            if (r2 == 0) goto L237
            r4 = r14
        L259:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            if (r4 == 0) goto L266
            d9.l r14 = new d9.l
            r1 = 4
            r14.<init>(r0, r1)
            r0.e(r4, r14)
        L266:
            return
        L267:
            r14.getClass()
            java.lang.Object[] r0 = r14.args
            r0.getClass()
            r1 = 0
            java.lang.Object r0 = tf.l.C0(r1, r0)
            boolean r2 = r0 instanceof android.widget.ImageView
            r3 = 0
            if (r2 == 0) goto L27c
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            goto L27d
        L27c:
            r0 = r3
        L27d:
            if (r0 == 0) goto L30e
            java.lang.Object[] r2 = r14.args
            r2.getClass()
            r4 = 1
            java.lang.Object r2 = tf.l.C0(r4, r2)
            boolean r4 = r2 instanceof java.lang.String
            if (r4 == 0) goto L290
            java.lang.String r2 = (java.lang.String) r2
            goto L291
        L290:
            r2 = r3
        L291:
            if (r2 == 0) goto L30e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getName()
            r4.add(r5)
            android.view.ViewParent r5 = r0.getParent()
        L2a7:
            r6 = 8
            if (r1 >= r6) goto L2c0
            if (r5 != 0) goto L2ae
            goto L2bd
        L2ae:
            java.lang.Class r6 = r5.getClass()
            java.lang.String r6 = r6.getName()
            r4.add(r6)
            android.view.ViewParent r5 = r5.getParent()
        L2bd:
            int r1 = r1 + 1
            goto L2a7
        L2c0:
            android.content.Context r1 = r0.getContext()
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r4.add(r1)
            d9.a r1 = a7.a.h(r4)
            d9.m r4 = r13.f2119b
            boolean r1 = d9.m.a(r4, r2, r1)
            if (r1 != 0) goto L2dc
            goto L30e
        L2dc:
            r8.g r1 = r4.f2121a
            android.content.Context r1 = r1.f11620a
            android.graphics.Bitmap r1 = d9.o.e(r1, r2)
            if (r1 == 0) goto L30e
            java.lang.Object[] r2 = r14.args
            r2.getClass()
            r5 = 2
            java.lang.Object r2 = tf.l.C0(r5, r2)
            boolean r5 = r2 instanceof java.lang.Number
            if (r5 == 0) goto L2f7
            java.lang.Number r2 = (java.lang.Number) r2
            goto L2f8
        L2f7:
            r2 = r3
        L2f8:
            if (r2 == 0) goto L303
            float r2 = r2.floatValue()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            goto L304
        L303:
            r2 = r3
        L304:
            android.graphics.Bitmap r1 = d9.m.c(r4, r1, r2)
            r0.setImageBitmap(r1)
            r14.setResult(r3)
        L30e:
            return
        L30f:
            r14.getClass()
            java.lang.Object[] r0 = r14.args
            r0.getClass()
            r1 = 1
            java.lang.Object r0 = tf.l.C0(r1, r0)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L323
            java.lang.String r0 = (java.lang.String) r0
            goto L324
        L323:
            r0 = 0
        L324:
            if (r0 == 0) goto L36f
            boolean r1 = og.m.t0(r0)
            if (r1 != 0) goto L36f
            d9.m r1 = r13.f2119b
            java.util.Map r2 = r1.f2124d
            r2.getClass()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r3 = r14.thisObject
            r2.put(r3, r0)
            java.util.Map r0 = r1.f2125e
            r0.getClass()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r2 = r14.thisObject
            java.lang.Object[] r3 = r14.args
            r3.getClass()
            r4 = 0
            java.lang.Object r3 = tf.l.C0(r4, r3)
            d9.a r3 = a7.a.t(r3)
            r0.put(r2, r3)
            java.util.Map r0 = r1.f2126f
            r0.getClass()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r2 = r14.thisObject
            java.lang.Object[] r14 = r14.args
            r14.getClass()
            r3 = 2
            r4 = 5
            float r14 = d9.m.b(r1, r14, r3, r4)
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            r0.put(r2, r14)
        L36f:
            return
    }

    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r23) {
            r22 = this;
            r1 = r22
            r0 = r23
            int r2 = r1.f2118a
            java.lang.String r3 = "enable"
            java.lang.String r4 = "Hchat_custom_friend_avatar_config"
            r5 = 1
            java.lang.String r6 = ""
            d9.m r7 = r1.f2119b
            r8 = 0
            r9 = 0
            switch(r2) {
                case 1: goto L1b5;
                case 2: goto L14;
                case 3: goto L153;
                case 4: goto L91;
                case 5: goto L14;
                case 6: goto L18;
                default: goto L14;
            }
        L14:
            super.beforeHookedMethod(r23)
            return
        L18:
            r0.getClass()
            r8.g r2 = r7.f2121a
            android.content.Context r10 = r2.f11620a
            android.content.SharedPreferences r11 = ub.b.c(r10, r4)
            boolean r3 = r11.getBoolean(r3, r8)
            if (r3 == 0) goto L90
            android.content.SharedPreferences r3 = ub.b.c(r10, r4)
            java.lang.String r4 = "scope_notifications"
            boolean r3 = r3.getBoolean(r4, r5)
            if (r3 == 0) goto L90
            java.lang.Object[] r0 = r0.args
            r0.getClass()
            int r3 = r0.length
            if (r3 != 0) goto L3f
            r0 = r9
            goto L43
        L3f:
            int r3 = r0.length
            int r3 = r3 - r5
            r0 = r0[r3]
        L43:
            boolean r3 = r0 instanceof android.app.Notification
            if (r3 == 0) goto L4a
            android.app.Notification r0 = (android.app.Notification) r0
            goto L4b
        L4a:
            r0 = r9
        L4b:
            if (r0 == 0) goto L90
            java.util.concurrent.atomic.AtomicBoolean r3 = e9.q.f2460a
            android.os.Bundle r3 = r0.extras
            if (r3 == 0) goto L59
            java.lang.String r4 = "hchat_custom_notification_talker"
            java.lang.String r9 = r3.getString(r4)
        L59:
            if (r9 != 0) goto L5c
            goto L5d
        L5c:
            r6 = r9
        L5d:
            android.content.Context r2 = r2.f11620a
            android.graphics.Bitmap r2 = d9.o.e(r2, r6)
            if (r2 == 0) goto L90
            r3 = 1036831949(0x3dcccccd, float:0.1)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            android.graphics.Bitmap r2 = d9.m.c(r7, r2, r3)
            r0.largeIcon = r2     // Catch: java.lang.Throwable -> L72
        L72:
            android.graphics.drawable.Icon r2 = android.graphics.drawable.Icon.createWithBitmap(r2)
            r2.getClass()
            java.lang.String r3 = "mLargeIcon"
            h.Hchat.utils.KavaReflector.writeField(r0, r3, r2)
            android.os.Bundle r3 = r0.extras
            if (r3 != 0) goto L89
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r0.extras = r3
        L89:
            android.os.Bundle r0 = r0.extras
            java.lang.String r3 = "android.largeIcon"
            r0.putParcelable(r3, r2)
        L90:
            return
        L91:
            r0.getClass()
            java.lang.Object[] r2 = r0.args
            r2.getClass()
            java.lang.Object r2 = tf.l.C0(r8, r2)
            boolean r5 = r2 instanceof android.view.MenuItem
            if (r5 == 0) goto La4
            android.view.MenuItem r2 = (android.view.MenuItem) r2
            goto La5
        La4:
            r2 = r9
        La5:
            if (r2 == 0) goto L152
            int r5 = r2.getItemId()
            r7 = 7999489(0x7a1001, float:1.1209672E-38)
            if (r5 == r7) goto Lb2
            goto L152
        Lb2:
            d9.m r14 = r1.f2119b
            java.util.Map r5 = r14.f2127g
            java.lang.Object r2 = r5.remove(r2)
            sf.e r2 = (sf.e) r2
            if (r2 == 0) goto L152
            r0.setResult(r9)
            java.lang.Object r0 = r2.f12418g
            r15 = r0
            android.app.Activity r15 = (android.app.Activity) r15
            java.lang.Object r0 = r2.f12419h
            r12 = r0
            java.lang.String r12 = (java.lang.String) r12
            r8.g r0 = r14.f2121a
            if (r15 == 0) goto L152
            android.content.Context r2 = r0.f11620a
            android.content.SharedPreferences r2 = ub.b.c(r2, r4)
            boolean r2 = r2.getBoolean(r3, r8)
            if (r2 != 0) goto Ldd
            goto L152
        Ldd:
            android.content.Context r0 = r0.f11620a
            boolean r13 = d9.o.d(r0, r12)
            g8.i r0 = h.Hchat.hooks.api.core.WeChatApis.contacts()     // Catch: java.lang.Throwable -> Lf4
            if (r0 == 0) goto Lf6
            h.Hchat.hooks.api.model.WeChatContact r0 = r0.n(r12)     // Catch: java.lang.Throwable -> Lf4
            if (r0 == 0) goto Lf6
            java.lang.String r0 = r0.displayName()     // Catch: java.lang.Throwable -> Lf4
            goto Lfe
        Lf4:
            r0 = move-exception
            goto Lf8
        Lf6:
            r0 = r9
            goto Lfe
        Lf8:
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        Lfe:
            boolean r2 = r0 instanceof sf.f
            if (r2 == 0) goto L104
            goto L105
        L104:
            r9 = r0
        L105:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L10a
            goto L10b
        L10a:
            r6 = r9
        L10b:
            boolean r0 = og.m.t0(r6)
            if (r0 == 0) goto L114
            r17 = r12
            goto L116
        L114:
            r17 = r6
        L116:
            uf.c r0 = a.a.E()
            sf.e r2 = new sf.e
            java.lang.String r3 = "设置或更换头像"
            java.lang.String r4 = "从系统相册或文件中选择图片"
            r2.<init>(r3, r4)
            r0.add(r2)
            if (r13 == 0) goto L134
            sf.e r2 = new sf.e
            java.lang.String r3 = "恢复微信头像"
            java.lang.String r4 = "移除本地自定义头像"
            r2.<init>(r3, r4)
            r0.add(r2)
        L134:
            uf.c r18 = a.a.t(r0)
            d9.h r19 = new d9.h
            r11 = r15
            r15 = 0
            r10 = r19
            r10.<init>(r11, r12, r13, r14, r15)
            bi.c r0 = new bi.c
            r2 = 13
            r0.<init>(r2)
            wb.lv r21 = wb.lv.f17583j
            java.lang.String r16 = "设置自定义头像"
            r20 = r0
            r15 = r11
            wb.y2.Q1(r15, r16, r17, r18, r19, r20, r21)
        L152:
            return
        L153:
            r0.getClass()
            java.lang.Object[] r2 = r0.args
            r2.getClass()
            java.lang.Object r2 = tf.l.C0(r8, r2)
            if (r2 == 0) goto L1b4
            java.lang.Object[] r3 = r0.args
            r3.getClass()
            r4 = 2
            java.lang.Object r3 = tf.l.C0(r4, r3)
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L172
            r9 = r3
            java.lang.String r9 = (java.lang.String) r9
        L172:
            if (r9 == 0) goto L1b4
            boolean r3 = og.m.t0(r9)
            if (r3 != 0) goto L1b4
            java.util.Map r3 = r7.f2124d
            r3.getClass()
            java.util.Map r3 = (java.util.Map) r3
            r3.put(r2, r9)
            java.util.Map r3 = r7.f2125e
            r3.getClass()
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object[] r4 = r0.args
            r4.getClass()
            java.lang.Object r4 = tf.l.C0(r5, r4)
            d9.a r4 = a7.a.t(r4)
            r3.put(r2, r4)
            java.util.Map r3 = r7.f2126f
            r3.getClass()
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object[] r0 = r0.args
            r0.getClass()
            r4 = 3
            r5 = 6
            float r0 = d9.m.b(r7, r0, r4, r5)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r3.put(r2, r0)
        L1b4:
            return
        L1b5:
            r0.getClass()
            java.util.Map r2 = r7.f2124d
            java.lang.Object r3 = r0.thisObject
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L1c5
            goto L1c6
        L1c5:
            r6 = r2
        L1c6:
            boolean r2 = og.m.t0(r6)
            if (r2 == 0) goto L1cd
            goto L225
        L1cd:
            java.util.Map r2 = r7.f2125e
            java.lang.Object r3 = r0.thisObject
            java.lang.Object r2 = r2.get(r3)
            d9.a r2 = (d9.a) r2
            if (r2 == 0) goto L1da
            goto L1dc
        L1da:
            d9.a r2 = d9.a.f2085l
        L1dc:
            boolean r2 = d9.m.a(r7, r6, r2)
            if (r2 != 0) goto L1e3
            goto L225
        L1e3:
            r8.g r2 = r7.f2121a
            android.content.Context r2 = r2.f11620a
            android.graphics.Bitmap r2 = d9.o.e(r2, r6)
            if (r2 == 0) goto L225
            java.lang.Object[] r3 = r0.args
            r3.getClass()
            java.lang.Object r3 = tf.l.C0(r8, r3)
            boolean r4 = r3 instanceof android.graphics.Canvas
            if (r4 == 0) goto L1fd
            android.graphics.Canvas r3 = (android.graphics.Canvas) r3
            goto L1fe
        L1fd:
            r3 = r9
        L1fe:
            if (r3 == 0) goto L225
            java.lang.Object r4 = r0.thisObject
            boolean r5 = r4 instanceof android.graphics.drawable.Drawable
            if (r5 == 0) goto L20a
            r5 = r4
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
            goto L20b
        L20a:
            r5 = r9
        L20b:
            if (r5 == 0) goto L225
            java.util.Map r6 = r7.f2126f
            java.lang.Object r4 = r6.get(r4)
            java.lang.Float r4 = (java.lang.Float) r4
            android.graphics.Bitmap r2 = d9.m.c(r7, r2, r4)
            android.graphics.Rect r4 = r5.getBounds()
            android.graphics.Paint r5 = d9.m.f2120j
            r3.drawBitmap(r2, r9, r4, r5)
            r0.setResult(r9)
        L225:
            return
    }
}
