package g9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g9.d f4394b;

    public /* synthetic */ c(g9.d r1, int r2) {
            r0 = this;
            r0.f4393a = r2
            r0.f4394b = r1
            r0.<init>()
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r19) {
            r18 = this;
            r0 = r18
            int r1 = r0.f4393a
            switch(r1) {
                case 1: goto Lb;
                default: goto L7;
            }
        L7:
            super.afterHookedMethod(r19)
            return
        Lb:
            r19.getClass()
            g9.d r1 = r0.f4394b
            android.content.SharedPreferences r2 = r1.f4399c
            java.lang.String r3 = "emoji_save_enable"
            r4 = 0
            boolean r2 = r2.getBoolean(r3, r4)
            if (r2 != 0) goto L1d
            goto L207
        L1d:
            r2 = r19
            java.lang.Object[] r2 = r2.args
            if (r2 == 0) goto L207
            java.lang.Object r3 = tf.l.C0(r4, r2)
            if (r3 == 0) goto L207
            r5 = 1
            java.lang.Object r6 = tf.l.C0(r5, r2)
            boolean r7 = r6 instanceof android.view.View
            if (r7 == 0) goto L35
            android.view.View r6 = (android.view.View) r6
            goto L36
        L35:
            r6 = 0
        L36:
            if (r6 == 0) goto L207
            java.lang.Object r7 = r6.getTag()
            java.util.IdentityHashMap r9 = new java.util.IdentityHashMap
            r9.<init>()
            java.util.Set r9 = java.util.Collections.newSetFromMap(r9)
            r9.getClass()
            java.lang.Object r7 = g9.d.e(r4, r7, r9)
            if (r7 == 0) goto L4f
            goto L61
        L4f:
            java.util.IdentityHashMap r7 = new java.util.IdentityHashMap
            r7.<init>()
            java.util.Set r7 = java.util.Collections.newSetFromMap(r7)
            r7.getClass()
            java.lang.Object r7 = g9.d.e(r4, r2, r7)
            if (r7 == 0) goto L207
        L61:
            java.lang.String r2 = "field_type"
            java.lang.String r9 = "type"
            java.lang.String r10 = "getType"
            java.lang.Number r2 = g9.d.c(r7, r10, r2, r9)
            if (r2 == 0) goto L207
            int r2 = r2.intValue()
            r9 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r9
            r9 = 47
            if (r2 != r9) goto L207
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r9 = 1212368211(0x48434553, float:199957.3)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r10 = new java.lang.Object[]{r9}
            java.lang.String r11 = "findItem"
            java.lang.Object r10 = h.Hchat.utils.KavaReflector.invokeMethod(r3, r11, r10)
            boolean r12 = r10 instanceof android.view.MenuItem
            if (r12 == 0) goto L95
            android.view.MenuItem r10 = (android.view.MenuItem) r10
            goto L96
        L95:
            r10 = 0
        L96:
            if (r10 == 0) goto L9b
            r8 = r10
            goto L1ea
        L9b:
            java.lang.String r10 = "size"
            java.lang.Object[] r12 = new java.lang.Object[r4]
            java.lang.Object r10 = h.Hchat.utils.KavaReflector.invokeMethod(r3, r10, r12)
            boolean r12 = r10 instanceof java.lang.Number
            if (r12 == 0) goto Laa
            java.lang.Number r10 = (java.lang.Number) r10
            goto Lab
        Laa:
            r10 = 0
        Lab:
            if (r10 == 0) goto Lb2
            int r10 = r10.intValue()
            goto Lb3
        Lb2:
            r10 = r4
        Lb3:
            r12 = r4
        Lb4:
            if (r12 < r10) goto Lb8
            r13 = r4
            goto Ld5
        Lb8:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r14 = "getItem"
            java.lang.Object r13 = h.Hchat.utils.KavaReflector.invokeMethod(r3, r14, r13)
            boolean r14 = r13 instanceof android.view.MenuItem
            if (r14 == 0) goto Lcd
            android.view.MenuItem r13 = (android.view.MenuItem) r13
            goto Lce
        Lcd:
            r13 = 0
        Lce:
            if (r13 == 0) goto L1ff
            int r10 = r13.getGroupId()
            r13 = r10
        Ld5:
            android.content.Context r10 = r6.getContext()
            android.content.res.Resources r14 = r10.getResources()
            android.content.Context r6 = r6.getContext()
            java.lang.String r15 = r6.getPackageName()
            java.lang.String r6 = "raw"
            java.lang.String r10 = "drawable"
            java.lang.String[] r16 = new java.lang.String[]{r6, r10}
            r6 = r4
        Lee:
            r10 = 2
            if (r6 < r10) goto Lf4
            r17 = r4
            goto L100
        Lf4:
            r12 = r16[r6]
            r17 = r4
            java.lang.String r4 = "icons_filled_download"
            int r4 = r14.getIdentifier(r4, r12, r15)
            if (r4 == 0) goto L1f7
        L100:
            java.lang.String r6 = "保存[H]"
            if (r4 == 0) goto L18d
            java.lang.Class r12 = r3.getClass()
            java.util.List r12 = h.Hchat.utils.KavaReflector.declaredMethods(r12)
            java.util.Iterator r12 = r12.iterator()
        L110:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L166
            java.lang.Object r14 = r12.next()
            r15 = r14
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            r19 = r5
            java.lang.Class[] r5 = r15.getParameterTypes()
            java.lang.String r15 = r15.getName()
            java.lang.String r8 = "c"
            boolean r8 = gg.l.a(r15, r8)
            if (r8 == 0) goto L162
            int r8 = r5.length
            r15 = 5
            if (r8 != r15) goto L162
            r8 = r5[r17]
            java.lang.Class r15 = java.lang.Integer.TYPE
            boolean r8 = gg.l.a(r8, r15)
            if (r8 == 0) goto L162
            r8 = r5[r19]
            boolean r8 = gg.l.a(r8, r15)
            if (r8 == 0) goto L162
            r8 = r5[r10]
            boolean r8 = gg.l.a(r8, r15)
            if (r8 == 0) goto L162
            r8 = 3
            r8 = r5[r8]
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            boolean r8 = r8.isAssignableFrom(r10)
            if (r8 == 0) goto L162
            r8 = 4
            r5 = r5[r8]
            boolean r5 = gg.l.a(r5, r15)
            if (r5 == 0) goto L162
            goto L167
        L162:
            r5 = r19
            r10 = 2
            goto L110
        L166:
            r14 = 0
        L167:
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r9, r2, r6, r8}
            boolean r5 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r14, r3, r5)
            if (r5 == 0) goto L18d
            java.lang.Object[] r2 = new java.lang.Object[]{r9}
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invokeMethod(r3, r11, r2)
            boolean r3 = r2 instanceof android.view.MenuItem
            if (r3 == 0) goto L18b
            r8 = r2
            android.view.MenuItem r8 = (android.view.MenuItem) r8
            goto L1ea
        L18b:
            r8 = 0
            goto L1ea
        L18d:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r9, r2, r6}
            java.lang.String r8 = "add"
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invokeMethod(r3, r8, r5)
            if (r5 == 0) goto L19e
            goto L1aa
        L19e:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r2 = new java.lang.Object[]{r5, r9, r2, r6}
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invokeMethod(r3, r8, r2)
        L1aa:
            boolean r2 = r5 instanceof android.view.MenuItem
            if (r2 == 0) goto L1ba
            if (r4 == 0) goto L1b6
            r2 = r5
            android.view.MenuItem r2 = (android.view.MenuItem) r2     // Catch: java.lang.Throwable -> L1b6
            r2.setIcon(r4)     // Catch: java.lang.Throwable -> L1b6
        L1b6:
            r8 = r5
            android.view.MenuItem r8 = (android.view.MenuItem) r8
            goto L1ea
        L1ba:
            java.lang.Object[] r2 = new java.lang.Object[]{r9, r6}
            java.lang.String r4 = "f"
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invokeMethod(r3, r4, r2)
            if (r2 == 0) goto L1c7
            goto L1cf
        L1c7:
            java.lang.Object[] r2 = new java.lang.Object[]{r9, r6}
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invokeMethod(r3, r4, r2)
        L1cf:
            boolean r4 = r2 instanceof android.view.MenuItem
            if (r4 == 0) goto L1d6
            android.view.MenuItem r2 = (android.view.MenuItem) r2
            goto L1d7
        L1d6:
            r2 = 0
        L1d7:
            if (r2 == 0) goto L1db
            r8 = r2
            goto L1ea
        L1db:
            java.lang.Object[] r2 = new java.lang.Object[]{r9}
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invokeMethod(r3, r11, r2)
            boolean r3 = r2 instanceof android.view.MenuItem
            if (r3 == 0) goto L18b
            r8 = r2
            android.view.MenuItem r8 = (android.view.MenuItem) r8
        L1ea:
            if (r8 == 0) goto L207
            java.util.Map r1 = r1.f4402f
            r1.getClass()
            java.util.Map r1 = (java.util.Map) r1
            r1.put(r8, r7)
            goto L207
        L1f7:
            r19 = r5
            int r6 = r6 + 1
            r4 = r17
            goto Lee
        L1ff:
            r17 = r4
            r19 = r5
            int r12 = r12 + 1
            goto Lb4
        L207:
            return
    }

    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r10) {
            r9 = this;
            int r0 = r9.f4393a
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.beforeHookedMethod(r10)
            return
        L9:
            r10.getClass()
            g9.d r0 = r9.f4394b
            android.content.SharedPreferences r1 = r0.f4399c
            java.lang.String r2 = "emoji_save_enable"
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            if (r1 != 0) goto L1b
            goto Lf6
        L1b:
            java.lang.Object[] r1 = r10.args
            if (r1 == 0) goto Lf6
            int r2 = r1.length
            r4 = r3
        L21:
            r5 = 0
            if (r4 >= r2) goto L34
            r6 = r1[r4]
            boolean r7 = r6 instanceof android.view.MenuItem
            if (r7 == 0) goto L2d
            android.view.MenuItem r6 = (android.view.MenuItem) r6
            goto L2e
        L2d:
            r6 = r5
        L2e:
            if (r6 == 0) goto L31
            goto L35
        L31:
            int r4 = r4 + 1
            goto L21
        L34:
            r6 = r5
        L35:
            if (r6 == 0) goto Lf6
            int r1 = r6.getItemId()
            r2 = 1212368211(0x48434553, float:199957.3)
            if (r1 == r2) goto L42
            goto Lf6
        L42:
            q8.o r1 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r1 == 0) goto L4d
            android.app.Activity r1 = r1.a()
            goto L4e
        L4d:
            r1 = r5
        L4e:
            java.util.Map r2 = r0.f4402f
            java.lang.Object r2 = r2.remove(r6)
            if (r2 == 0) goto L57
            goto L69
        L57:
            java.lang.Object[] r10 = r10.args
            java.util.IdentityHashMap r2 = new java.util.IdentityHashMap
            r2.<init>()
            java.util.Set r2 = java.util.Collections.newSetFromMap(r2)
            r2.getClass()
            java.lang.Object r2 = g9.d.e(r3, r10, r2)
        L69:
            java.lang.String r10 = ""
            if (r2 == 0) goto Lcd
            java.lang.String r3 = "field_imgPath"
            java.lang.String r4 = "imgPath"
            java.lang.String r6 = "getImgPath"
            java.lang.String r3 = g9.d.d(r2, r6, r3, r4)
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            og.k r4 = g9.d.f4395g
            boolean r6 = r4.d(r3)
            if (r6 == 0) goto L89
            r5 = r3
            goto Lcd
        L89:
            java.lang.String r6 = "field_content"
            java.lang.String r7 = "content"
            java.lang.String r8 = "getContent"
            java.lang.String r2 = g9.d.d(r2, r8, r6, r7)
            l8.d r6 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r6.getClass()
            java.lang.String r6 = "md5"
            java.lang.String r7 = l8.d.m(r2, r6)
            boolean r8 = og.m.t0(r7)
            if (r8 == 0) goto La8
            java.lang.String r7 = l8.d.o(r2, r6)
        La8:
            java.lang.CharSequence r2 = og.m.R0(r7)
            java.lang.String r2 = r2.toString()
            boolean r4 = r4.d(r2)
            if (r4 == 0) goto Lb7
            goto Lb8
        Lb7:
            r2 = r5
        Lb8:
            if (r2 != 0) goto Lbb
            r2 = r10
        Lbb:
            boolean r4 = og.m.t0(r2)
            if (r4 == 0) goto Lcc
            boolean r2 = eh.a.y(r3)
            if (r2 == 0) goto Lc8
            r5 = r3
        Lc8:
            if (r5 != 0) goto Lcd
            r5 = r10
            goto Lcd
        Lcc:
            r5 = r2
        Lcd:
            if (r5 != 0) goto Ld0
            goto Ld1
        Ld0:
            r10 = r5
        Ld1:
            boolean r2 = og.m.t0(r10)
            if (r2 == 0) goto Le5
            android.os.Handler r10 = r0.f4400d
            c9.t r0 = new c9.t
            r2 = 5
            java.lang.String r3 = "表情消息不可用"
            r0.<init>(r1, r3, r2)
            r10.post(r0)
            goto Lf6
        Le5:
            java.lang.Thread r2 = new java.lang.Thread
            ac.l r3 = new ac.l
            r4 = 14
            r3.<init>(r0, r1, r10, r4)
            java.lang.String r10 = "Hchat-EmojiSave"
            r2.<init>(r3, r10)
            r2.start()
        Lf6:
            return
    }
}
