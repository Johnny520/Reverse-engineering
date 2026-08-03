package xa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xa.m f21444b;

    public /* synthetic */ k(xa.m r1, int r2) {
            r0 = this;
            r0.f21443a = r2
            r0.f21444b = r1
            r0.<init>()
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r15) {
            r14 = this;
            int r0 = r14.f21443a
            switch(r0) {
                case 0: goto L1b4;
                case 1: goto L5;
                case 2: goto L92;
                case 3: goto L9;
                default: goto L5;
            }
        L5:
            super.afterHookedMethod(r15)
            return
        L9:
            r15.getClass()
            xa.m r0 = r14.f21444b
            boolean r1 = r0.b()
            if (r1 != 0) goto L16
            goto L91
        L16:
            java.lang.Object[] r1 = r15.args
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L21
            java.lang.Object r1 = tf.l.C0(r2, r1)
            goto L22
        L21:
            r1 = r3
        L22:
            boolean r4 = r1 instanceof android.view.ContextMenu
            if (r4 == 0) goto L29
            android.view.ContextMenu r1 = (android.view.ContextMenu) r1
            goto L2a
        L29:
            r1 = r3
        L2a:
            if (r1 == 0) goto L91
            java.lang.Object[] r4 = r15.args
            r5 = 1
            if (r4 == 0) goto L36
            java.lang.Object r4 = tf.l.C0(r5, r4)
            goto L37
        L36:
            r4 = r3
        L37:
            boolean r6 = r4 instanceof android.view.View
            if (r6 == 0) goto L3e
            android.view.View r4 = (android.view.View) r4
            goto L3f
        L3e:
            r4 = r3
        L3f:
            if (r4 == 0) goto L91
            android.content.Context r4 = r4.getContext()
            android.app.Activity r4 = xa.m.c(r4)
            if (r4 == 0) goto L91
            java.lang.Object r15 = r15.thisObject
            java.util.IdentityHashMap r6 = new java.util.IdentityHashMap
            r6.<init>()
            java.util.Set r6 = java.util.Collections.newSetFromMap(r6)
            r6.getClass()
            java.lang.String r15 = xa.m.d(r2, r15, r6)
            if (r15 == 0) goto L66
            boolean r6 = xa.m.f(r15)
            if (r6 == 0) goto L66
            goto L67
        L66:
            r15 = r3
        L67:
            if (r15 == 0) goto L91
            r6 = 1212371539(0x48435253, float:200009.3)
            r1.removeItem(r6)
            java.util.Map r7 = r0.f21451g
            r7.clear()
            r0.f21452h = r3
            xa.i r3 = new xa.i
            r3.<init>(r4, r15, r5)
            int r15 = r1.size()
            java.lang.String r4 = "设置备注和标签"
            android.view.MenuItem r15 = r1.add(r2, r6, r15, r4)
            java.util.Map r1 = r0.f21451g
            r1.getClass()
            java.util.Map r1 = (java.util.Map) r1
            r1.put(r15, r3)
            r0.f21452h = r3
        L91:
            return
        L92:
            r15.getClass()
            xa.m r0 = r14.f21444b
            java.lang.Object r1 = r15.thisObject
            java.lang.Object[] r15 = r15.args
            r2 = 0
            r3 = 0
            if (r15 == 0) goto La4
            java.lang.Object r15 = tf.l.C0(r2, r15)
            goto La5
        La4:
            r15 = r3
        La5:
            boolean r4 = r15 instanceof android.view.View.OnClickListener
            if (r4 == 0) goto Lac
            android.view.View$OnClickListener r15 = (android.view.View.OnClickListener) r15
            goto Lad
        Lac:
            r15 = r3
        Lad:
            if (r1 == 0) goto L1b3
            if (r15 != 0) goto Lb3
            goto L1b3
        Lb3:
            java.lang.String r4 = "getViewHeader"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invokeMethod(r1, r4, r2)
            if (r1 == 0) goto L1b3
            java.lang.Class r2 = r1.getClass()
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredFields(r2)
            dg.n r2 = tf.m.m1(r2)
            wb.sr r4 = new wb.sr
            r5 = 27
            r4.<init>(r5)
            ng.i r5 = new ng.i
            r6 = 1
            r5.<init>(r2, r6, r4)
            c9.k1 r2 = new c9.k1
            r4 = 26
            r2.<init>(r1, r4)
            ng.i r1 = ng.m.X(r5, r2)
            ng.h r2 = new ng.h
            r2.<init>(r1)
        Le6:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L10e
            java.lang.Object r1 = r2.next()
            r4 = r1
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            java.lang.String r5 = "mListenerInfo"
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r4, r5)
            if (r4 == 0) goto L102
            java.lang.String r5 = "mOnClickListener"
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r4, r5)
            goto L103
        L102:
            r4 = r3
        L103:
            boolean r5 = r4 instanceof android.view.View.OnClickListener
            if (r5 == 0) goto L10a
            android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
            goto L10b
        L10a:
            r4 = r3
        L10b:
            if (r4 != r15) goto Le6
            goto L10f
        L10e:
            r1 = r3
        L10f:
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            if (r1 == 0) goto L1b3
            android.content.Context r15 = r1.getContext()
            android.app.Activity r15 = xa.m.c(r15)
            if (r15 == 0) goto L1b3
            java.lang.Class r2 = r15.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.SnsUserUI"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L12f
            goto L1b3
        L12f:
            android.content.Intent r2 = r15.getIntent()
            if (r2 == 0) goto L146
            java.lang.String r4 = "sns_userName"
            java.lang.String r2 = r2.getStringExtra(r4)
            if (r2 == 0) goto L146
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            goto L147
        L146:
            r2 = r3
        L147:
            if (r2 != 0) goto L14b
            java.lang.String r2 = ""
        L14b:
            boolean r4 = xa.m.f(r2)
            if (r4 != 0) goto L152
            goto L1b3
        L152:
            boolean r4 = r0.b()
            if (r4 != 0) goto L15c
            r0.h(r1)
            goto L1b3
        L15c:
            java.util.Map r4 = r0.f21453i
            r4.getClass()
            monitor-enter(r4)
            java.util.Map r5 = r0.f21453i     // Catch: java.lang.Throwable -> L177
            java.lang.Object r5 = r5.get(r1)     // Catch: java.lang.Throwable -> L177
            xa.h r5 = (xa.h) r5     // Catch: java.lang.Throwable -> L177
            if (r5 == 0) goto L179
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L177
            r0.<init>(r15)     // Catch: java.lang.Throwable -> L177
            r5.f21434a = r0     // Catch: java.lang.Throwable -> L177
            r5.f21435b = r2     // Catch: java.lang.Throwable -> L177
        L175:
            monitor-exit(r4)
            goto L1b3
        L177:
            r15 = move-exception
            goto L1b1
        L179:
            java.lang.String r5 = "mListenerInfo"
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.readField(r1, r5)     // Catch: java.lang.Throwable -> L177
            if (r5 == 0) goto L188
            java.lang.String r6 = "mOnLongClickListener"
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.readField(r5, r6)     // Catch: java.lang.Throwable -> L177
            goto L189
        L188:
            r5 = r3
        L189:
            boolean r6 = r5 instanceof android.view.View.OnLongClickListener     // Catch: java.lang.Throwable -> L177
            if (r6 == 0) goto L190
            r3 = r5
            android.view.View$OnLongClickListener r3 = (android.view.View.OnLongClickListener) r3     // Catch: java.lang.Throwable -> L177
        L190:
            java.util.Map r5 = r0.f21453i     // Catch: java.lang.Throwable -> L177
            r5.getClass()     // Catch: java.lang.Throwable -> L177
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Throwable -> L177
            xa.h r6 = new xa.h     // Catch: java.lang.Throwable -> L177
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L177
            r7.<init>(r15)     // Catch: java.lang.Throwable -> L177
            boolean r15 = r1.isLongClickable()     // Catch: java.lang.Throwable -> L177
            r6.<init>(r7, r2, r3, r15)     // Catch: java.lang.Throwable -> L177
            r5.put(r1, r6)     // Catch: java.lang.Throwable -> L177
            xa.g r15 = new xa.g     // Catch: java.lang.Throwable -> L177
            r15.<init>(r0)     // Catch: java.lang.Throwable -> L177
            r1.setOnLongClickListener(r15)     // Catch: java.lang.Throwable -> L177
            goto L175
        L1b1:
            monitor-exit(r4)
            throw r15
        L1b3:
            return
        L1b4:
            r15.getClass()
            xa.m r0 = r14.f21444b
            boolean r1 = r0.b()
            if (r1 != 0) goto L1c1
            goto L3a5
        L1c1:
            java.lang.Object[] r1 = r15.args
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L1cc
            java.lang.Object r1 = tf.l.C0(r3, r1)
            goto L1cd
        L1cc:
            r1 = r2
        L1cd:
            boolean r4 = r1 instanceof android.view.ContextMenu
            if (r4 == 0) goto L1d4
            android.view.ContextMenu r1 = (android.view.ContextMenu) r1
            goto L1d5
        L1d4:
            r1 = r2
        L1d5:
            if (r1 == 0) goto L3a5
            java.lang.Object r4 = r15.thisObject
            if (r4 == 0) goto L240
            java.lang.Class r5 = r4.getClass()
            java.util.List r5 = h.Hchat.utils.KavaReflector.declaredFields(r5)
            dg.n r5 = tf.m.m1(r5)
            wb.sr r6 = new wb.sr
            r7 = 28
            r6.<init>(r7)
            ng.i r7 = new ng.i
            r7.<init>(r5, r3, r6)
            c9.k1 r5 = new c9.k1
            r6 = 27
            r5.<init>(r4, r6)
            ng.i r4 = ng.m.X(r7, r5)
            wb.sr r5 = new wb.sr
            r6 = 22
            r5.<init>(r6)
            ng.i r4 = ng.m.X(r4, r5)
            ng.h r5 = new ng.h
            r5.<init>(r4)
        L20e:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L230
            java.lang.Object r4 = r5.next()
            r6 = r4
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.Class r7 = r6.getReturnType()
            java.lang.Class r8 = java.lang.Void.TYPE
            boolean r7 = gg.l.a(r7, r8)
            if (r7 == 0) goto L20e
            java.lang.String r7 = "com.tencent.mm.ui.conversation."
            boolean r6 = eh.a.A(r6, r3, r7)
            if (r6 == 0) goto L20e
            goto L231
        L230:
            r4 = r2
        L231:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            if (r4 == 0) goto L240
            xa.k r5 = new xa.k
            r6 = 1
            r5.<init>(r0, r6)
            boolean r4 = r0.e(r4, r5)
            goto L241
        L240:
            r4 = r3
        L241:
            if (r4 != 0) goto L245
            goto L3a5
        L245:
            java.lang.Object r15 = r15.thisObject
            r4 = 1
            if (r15 == 0) goto L2ea
            java.lang.Class r5 = r15.getClass()
            java.util.List r5 = h.Hchat.utils.KavaReflector.declaredFields(r5)
            dg.n r6 = tf.m.m1(r5)
            wb.sr r7 = new wb.sr
            r8 = 23
            r7.<init>(r8)
            ng.i r8 = new ng.i
            r8.<init>(r6, r4, r7)
            c9.k1 r6 = new c9.k1
            r7 = 24
            r6.<init>(r15, r7)
            ng.i r6 = ng.m.X(r8, r6)
            java.lang.Object r6 = ng.m.U(r6)
            android.app.Activity r6 = (android.app.Activity) r6
            if (r6 == 0) goto L2ea
            g8.i r7 = h.Hchat.hooks.api.core.WeChatApis.contacts()
            if (r7 == 0) goto L2ea
            dg.n r8 = new dg.n
            r9 = 6
            r8.<init>(r5, r9)
            wb.sr r5 = new wb.sr
            r9 = 24
            r5.<init>(r9)
            ng.i r9 = new ng.i
            r9.<init>(r8, r4, r5)
            c9.k1 r5 = new c9.k1
            r8 = 25
            r5.<init>(r15, r8)
            ng.i r15 = ng.m.X(r9, r5)
            wb.sr r5 = new wb.sr
            r5.<init>(r8)
            ng.t r15 = ng.m.W(r15, r5)
            wb.sr r5 = new wb.sr
            r8 = 26
            r5.<init>(r8)
            ng.i r8 = new ng.i
            r8.<init>(r15, r4, r5)
            ng.h r15 = new ng.h
            r15.<init>(r8)
        L2b2:
            boolean r5 = r15.hasNext()
            if (r5 == 0) goto L2df
            java.lang.Object r5 = r15.next()
            r8 = r5
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r7.H(r8)     // Catch: java.lang.Throwable -> L2c8
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L2c8
            goto L2cf
        L2c8:
            r8 = move-exception
            sf.f r9 = new sf.f
            r9.<init>(r8)
            r8 = r9
        L2cf:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            boolean r10 = r8 instanceof sf.f
            if (r10 == 0) goto L2d6
            r8 = r9
        L2d6:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L2b2
            goto L2e0
        L2df:
            r5 = r2
        L2e0:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L2ea
            xa.i r15 = new xa.i
            r15.<init>(r6, r5, r3)
            goto L2eb
        L2ea:
            r15 = r2
        L2eb:
            if (r15 == 0) goto L3a5
            r5 = 1212371533(0x4843524d, float:200009.2)
            r1.removeItem(r5)
            android.view.MenuItem r6 = r1.getItem(r3)     // Catch: java.lang.Throwable -> L300
            int r6 = r6.getGroupId()     // Catch: java.lang.Throwable -> L300
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L300
            goto L307
        L300:
            r6 = move-exception
            sf.f r7 = new sf.f
            r7.<init>(r6)
            r6 = r7
        L307:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r8 = r6 instanceof sf.f
            if (r8 == 0) goto L310
            r6 = r7
        L310:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.String r7 = "设置备注和标签"
            android.view.MenuItem r6 = r1.add(r6, r5, r3, r7)
            r6.getClass()
            java.lang.Class r7 = r1.getClass()
        L323:
            if (r7 == 0) goto L39b
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L39b
            java.util.List r8 = h.Hchat.utils.KavaReflector.declaredFields(r7)
            java.util.Iterator r8 = r8.iterator()
        L335:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L396
            java.lang.Object r9 = r8.next()
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            java.lang.Class<java.util.List> r10 = java.util.List.class
            java.lang.Class r11 = r9.getType()
            boolean r10 = r10.isAssignableFrom(r11)
            if (r10 != 0) goto L34e
            goto L335
        L34e:
            java.lang.Object r9 = h.Hchat.utils.KavaReflector.readField(r9, r1)
            boolean r10 = gg.x.e(r9)
            if (r10 == 0) goto L35b
            java.util.List r9 = (java.util.List) r9
            goto L35c
        L35b:
            r9 = r2
        L35c:
            if (r9 == 0) goto L335
            java.util.Iterator r10 = r9.iterator()
            r11 = r3
        L363:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L389
            java.lang.Object r12 = r10.next()
            if (r12 == r6) goto L382
            boolean r13 = r12 instanceof android.view.MenuItem
            if (r13 == 0) goto L376
            android.view.MenuItem r12 = (android.view.MenuItem) r12
            goto L377
        L376:
            r12 = r2
        L377:
            if (r12 == 0) goto L380
            int r12 = r12.getItemId()
            if (r12 != r5) goto L380
            goto L382
        L380:
            r12 = r3
            goto L383
        L382:
            r12 = r4
        L383:
            if (r12 == 0) goto L386
            goto L38a
        L386:
            int r11 = r11 + 1
            goto L363
        L389:
            r11 = -1
        L38a:
            if (r11 <= 0) goto L393
            java.lang.Object r10 = r9.remove(r11)     // Catch: java.lang.Throwable -> L393
            r9.add(r3, r10)     // Catch: java.lang.Throwable -> L393
        L393:
            if (r11 < 0) goto L335
            goto L39b
        L396:
            java.lang.Class r7 = r7.getSuperclass()
            goto L323
        L39b:
            java.util.Map r0 = r0.f21450f
            r0.getClass()
            java.util.Map r0 = (java.util.Map) r0
            r0.put(r6, r15)
        L3a5:
            return
    }

    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r6) {
            r5 = this;
            int r0 = r5.f21443a
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.beforeHookedMethod(r6)
            return
        L9:
            r6.getClass()
            xa.m r0 = r5.f21444b
            boolean r1 = r0.b()
            if (r1 != 0) goto L15
            goto L4d
        L15:
            java.lang.Object[] r1 = r6.args
            r2 = 0
            if (r1 == 0) goto L20
            r3 = 0
            java.lang.Object r1 = tf.l.C0(r3, r1)
            goto L21
        L20:
            r1 = r2
        L21:
            boolean r3 = r1 instanceof android.view.MenuItem
            if (r3 == 0) goto L28
            android.view.MenuItem r1 = (android.view.MenuItem) r1
            goto L29
        L28:
            r1 = r2
        L29:
            if (r1 == 0) goto L4d
            int r3 = r1.getItemId()
            r4 = 1212371533(0x4843524d, float:200009.2)
            if (r3 == r4) goto L35
            goto L4d
        L35:
            java.util.Map r3 = r0.f21450f
            java.lang.Object r1 = r3.remove(r1)
            xa.i r1 = (xa.i) r1
            if (r1 == 0) goto L4d
            r6.setResult(r2)
            android.os.Handler r6 = r0.f21448d
            xa.d r2 = new xa.d
            r3 = 0
            r2.<init>(r0, r1, r3)
            r6.post(r2)
        L4d:
            return
    }
}
