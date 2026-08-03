package ob;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ob.n f9736b;

    public /* synthetic */ m(ob.n r1, int r2) {
            r0 = this;
            r0.f9735a = r2
            r0.f9736b = r1
            r0.<init>()
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r19) {
            r18 = this;
            r0 = r18
            int r1 = r0.f9735a
            switch(r1) {
                case 1: goto Lb;
                default: goto L7;
            }
        L7:
            super.afterHookedMethod(r19)
            return
        Lb:
            r19.getClass()
            ob.n r1 = r0.f9736b
            boolean r2 = r1.d()
            if (r2 != 0) goto L18
            goto L264
        L18:
            r2 = r19
            java.lang.Object[] r2 = r2.args
            if (r2 == 0) goto L264
            r3 = 0
            java.lang.Object r4 = tf.l.C0(r3, r2)
            if (r4 == 0) goto L264
            r5 = 1
            java.lang.Object r6 = tf.l.C0(r5, r2)
            boolean r7 = r6 instanceof android.view.View
            if (r7 == 0) goto L31
            android.view.View r6 = (android.view.View) r6
            goto L32
        L31:
            r6 = 0
        L32:
            if (r6 == 0) goto L264
            java.lang.Object r7 = r6.getTag()
            java.util.IdentityHashMap r9 = new java.util.IdentityHashMap
            r9.<init>()
            java.util.Set r9 = java.util.Collections.newSetFromMap(r9)
            r9.getClass()
            java.lang.Object r7 = ob.n.h(r3, r7, r9)
            if (r7 == 0) goto L4b
            goto L5d
        L4b:
            java.util.IdentityHashMap r7 = new java.util.IdentityHashMap
            r7.<init>()
            java.util.Set r7 = java.util.Collections.newSetFromMap(r7)
            r7.getClass()
            java.lang.Object r7 = ob.n.h(r3, r2, r7)
            if (r7 == 0) goto L264
        L5d:
            java.lang.String r2 = "field_type"
            java.lang.String r9 = "type"
            java.lang.String r10 = "getType"
            java.lang.Number r2 = ob.n.e(r7, r10, r2, r9)
            r9 = 2
            if (r2 == 0) goto L74
            int r2 = r2.intValue()
            r10 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r10
            if (r2 == r5) goto L76
        L74:
            r7 = 0
            goto Lbf
        L76:
            java.lang.String r2 = "field_talker"
            java.lang.String r10 = "talker"
            java.lang.String r11 = "getTalker"
            java.lang.String r2 = ob.n.f(r7, r11, r2, r10)
            java.lang.String r10 = "field_content"
            java.lang.String r11 = "content"
            java.lang.String r12 = "getContent"
            java.lang.String r7 = ob.n.f(r7, r12, r10, r11)
            java.lang.String r10 = "@chatroom"
            boolean r10 = og.t.W(r2, r10, r3)
            if (r10 != 0) goto L9a
            java.lang.String r10 = "@im.chatroom"
            boolean r2 = og.t.W(r2, r10, r3)
            if (r2 == 0) goto La8
        L9a:
            java.lang.String r2 = ":\n"
            r10 = 6
            int r2 = og.m.r0(r7, r2, r3, r3, r10)
            if (r2 <= 0) goto La8
            int r2 = r2 + r9
            java.lang.String r7 = r7.substring(r2)
        La8:
            java.lang.CharSequence r2 = og.m.R0(r7)
            java.lang.String r2 = r2.toString()
            int r7 = r2.length()
            if (r7 <= 0) goto Lb7
            goto Lb8
        Lb7:
            r2 = 0
        Lb8:
            if (r2 == 0) goto L74
            ob.l r7 = new ob.l
            r7.<init>(r2)
        Lbf:
            if (r7 == 0) goto L264
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r10 = 1212372054(0x48435456, float:200017.34)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r11 = new java.lang.Object[]{r10}
            java.lang.String r12 = "findItem"
            java.lang.Object r11 = h.Hchat.utils.KavaReflector.invokeMethod(r4, r12, r11)
            boolean r13 = r11 instanceof android.view.MenuItem
            if (r13 == 0) goto Ldd
            android.view.MenuItem r11 = (android.view.MenuItem) r11
            goto Lde
        Ldd:
            r11 = 0
        Lde:
            if (r11 == 0) goto Le6
            ob.n.b(r4, r11)
            r8 = r11
            goto L245
        Le6:
            java.lang.String r11 = "size"
            java.lang.Object[] r13 = new java.lang.Object[r3]
            java.lang.Object r11 = h.Hchat.utils.KavaReflector.invokeMethod(r4, r11, r13)
            boolean r13 = r11 instanceof java.lang.Number
            if (r13 == 0) goto Lf5
            java.lang.Number r11 = (java.lang.Number) r11
            goto Lf6
        Lf5:
            r11 = 0
        Lf6:
            if (r11 == 0) goto Lfd
            int r11 = r11.intValue()
            goto Lfe
        Lfd:
            r11 = r3
        Lfe:
            r13 = r3
        Lff:
            if (r13 < r11) goto L103
            r14 = r3
            goto L120
        L103:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r14 = new java.lang.Object[]{r14}
            java.lang.String r15 = "getItem"
            java.lang.Object r14 = h.Hchat.utils.KavaReflector.invokeMethod(r4, r15, r14)
            boolean r15 = r14 instanceof android.view.MenuItem
            if (r15 == 0) goto L118
            android.view.MenuItem r14 = (android.view.MenuItem) r14
            goto L119
        L118:
            r14 = 0
        L119:
            if (r14 == 0) goto L25b
            int r11 = r14.getGroupId()
            r14 = r11
        L120:
            android.content.Context r11 = r6.getContext()
            android.content.res.Resources r15 = r11.getResources()
            android.content.Context r6 = r6.getContext()
            java.lang.String r6 = r6.getPackageName()
            java.lang.String r11 = "raw"
            java.lang.String r13 = "drawable"
            java.lang.String[] r16 = new java.lang.String[]{r11, r13}
            r11 = r3
        L139:
            if (r11 < r9) goto L13e
            r19 = r3
            goto L14a
        L13e:
            r13 = r16[r11]
            r19 = r3
            java.lang.String r3 = "icons_filled_volume_up"
            int r3 = r15.getIdentifier(r3, r13, r6)
            if (r3 == 0) goto L252
        L14a:
            java.lang.String r6 = "转语音播放[H]"
            if (r3 == 0) goto L1df
            java.lang.Class r11 = r4.getClass()
            java.util.List r11 = h.Hchat.utils.KavaReflector.declaredMethods(r11)
            java.util.Iterator r11 = r11.iterator()
        L15a:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L1b0
            java.lang.Object r13 = r11.next()
            r15 = r13
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            r17 = r5
            java.lang.Class[] r5 = r15.getParameterTypes()
            java.lang.String r15 = r15.getName()
            java.lang.String r8 = "c"
            boolean r8 = gg.l.a(r15, r8)
            if (r8 == 0) goto L1ac
            int r8 = r5.length
            r15 = 5
            if (r8 != r15) goto L1ac
            r8 = r5[r19]
            java.lang.Class r15 = java.lang.Integer.TYPE
            boolean r8 = gg.l.a(r8, r15)
            if (r8 == 0) goto L1ac
            r8 = r5[r17]
            boolean r8 = gg.l.a(r8, r15)
            if (r8 == 0) goto L1ac
            r8 = r5[r9]
            boolean r8 = gg.l.a(r8, r15)
            if (r8 == 0) goto L1ac
            r8 = 3
            r8 = r5[r8]
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            boolean r8 = r8.isAssignableFrom(r9)
            if (r8 == 0) goto L1ac
            r8 = 4
            r5 = r5[r8]
            boolean r5 = gg.l.a(r5, r15)
            if (r5 == 0) goto L1ac
            goto L1b1
        L1ac:
            r5 = r17
            r9 = 2
            goto L15a
        L1b0:
            r13 = 0
        L1b1:
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            java.lang.Integer r5 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r10, r2, r6, r8}
            boolean r5 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r13, r4, r5)
            if (r5 == 0) goto L1df
            java.lang.Object[] r2 = new java.lang.Object[]{r10}
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invokeMethod(r4, r12, r2)
            boolean r3 = r2 instanceof android.view.MenuItem
            if (r3 == 0) goto L1d4
            android.view.MenuItem r2 = (android.view.MenuItem) r2
            goto L1d5
        L1d4:
            r2 = 0
        L1d5:
            if (r2 == 0) goto L1dd
            ob.n.b(r4, r2)
        L1da:
            r8 = r2
            goto L245
        L1dd:
            r8 = 0
            goto L245
        L1df:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r10, r2, r6}
            java.lang.String r8 = "add"
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invokeMethod(r4, r8, r5)
            if (r5 == 0) goto L1f0
            goto L1fc
        L1f0:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r2 = new java.lang.Object[]{r5, r10, r2, r6}
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invokeMethod(r4, r8, r2)
        L1fc:
            boolean r2 = r5 instanceof android.view.MenuItem
            if (r2 == 0) goto L20f
            if (r3 == 0) goto L208
            r2 = r5
            android.view.MenuItem r2 = (android.view.MenuItem) r2     // Catch: java.lang.Throwable -> L208
            r2.setIcon(r3)     // Catch: java.lang.Throwable -> L208
        L208:
            r8 = r5
            android.view.MenuItem r8 = (android.view.MenuItem) r8
            ob.n.b(r4, r8)
            goto L245
        L20f:
            java.lang.Object[] r2 = new java.lang.Object[]{r10, r6}
            java.lang.String r3 = "f"
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invokeMethod(r4, r3, r2)
            if (r2 == 0) goto L21c
            goto L224
        L21c:
            java.lang.Object[] r2 = new java.lang.Object[]{r10, r6}
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invokeMethod(r4, r3, r2)
        L224:
            boolean r3 = r2 instanceof android.view.MenuItem
            if (r3 == 0) goto L22b
            android.view.MenuItem r2 = (android.view.MenuItem) r2
            goto L22c
        L22b:
            r2 = 0
        L22c:
            if (r2 == 0) goto L22f
            goto L23f
        L22f:
            java.lang.Object[] r2 = new java.lang.Object[]{r10}
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invokeMethod(r4, r12, r2)
            boolean r3 = r2 instanceof android.view.MenuItem
            if (r3 == 0) goto L23e
            android.view.MenuItem r2 = (android.view.MenuItem) r2
            goto L23f
        L23e:
            r2 = 0
        L23f:
            if (r2 == 0) goto L1dd
            ob.n.b(r4, r2)
            goto L1da
        L245:
            if (r8 == 0) goto L264
            java.util.Map r1 = r1.f9746j
            r1.getClass()
            java.util.Map r1 = (java.util.Map) r1
            r1.put(r8, r7)
            goto L264
        L252:
            r17 = r5
            int r11 = r11 + 1
            r3 = r19
            r9 = 2
            goto L139
        L25b:
            r19 = r3
            r17 = r5
            int r13 = r13 + 1
            r9 = 2
            goto Lff
        L264:
            return
    }

    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r7) {
            r6 = this;
            int r0 = r6.f9735a
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.beforeHookedMethod(r7)
            return
        L9:
            r7.getClass()
            ob.n r0 = r6.f9736b
            boolean r1 = r0.d()
            if (r1 != 0) goto L15
            goto L62
        L15:
            java.lang.Object[] r7 = r7.args
            if (r7 == 0) goto L62
            int r1 = r7.length
            r2 = 0
        L1b:
            r3 = 0
            if (r2 >= r1) goto L2d
            r4 = r7[r2]
            boolean r5 = r4 instanceof android.view.MenuItem
            if (r5 == 0) goto L27
            r3 = r4
            android.view.MenuItem r3 = (android.view.MenuItem) r3
        L27:
            if (r3 == 0) goto L2a
            goto L2d
        L2a:
            int r2 = r2 + 1
            goto L1b
        L2d:
            if (r3 == 0) goto L62
            int r7 = r3.getItemId()
            r1 = 1212372054(0x48435456, float:200017.34)
            if (r7 == r1) goto L39
            goto L62
        L39:
            java.util.Map r7 = r0.f9746j
            java.lang.Object r7 = r7.remove(r3)
            ob.l r7 = (ob.l) r7
            if (r7 != 0) goto L49
            java.lang.String r7 = "文字消息不可用"
            r0.l(r7)
            goto L62
        L49:
            java.lang.String r1 = "正在生成语音"
            r0.l(r1)
            java.lang.String r7 = r7.f9734a
            java.util.concurrent.ThreadPoolExecutor r1 = r0.f9747k     // Catch: java.util.concurrent.RejectedExecutionException -> L5d
            a1.d r2 = new a1.d     // Catch: java.util.concurrent.RejectedExecutionException -> L5d
            r3 = 25
            r2.<init>(r0, r3, r7)     // Catch: java.util.concurrent.RejectedExecutionException -> L5d
            r1.execute(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L5d
            goto L62
        L5d:
            java.lang.String r7 = "待处理语音过多，请稍后重试"
            r0.l(r7)
        L62:
            return
    }
}
