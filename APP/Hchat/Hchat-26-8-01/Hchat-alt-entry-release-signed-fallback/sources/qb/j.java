package qb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qb.k f10833b;

    public /* synthetic */ j(qb.k r1, int r2) {
            r0 = this;
            r0.f10832a = r2
            r0.f10833b = r1
            r0.<init>()
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r13) {
            r12 = this;
            int r0 = r12.f10832a
            switch(r0) {
                case 1: goto L86;
                case 2: goto L5;
                case 3: goto L9;
                default: goto L5;
            }
        L5:
            super.afterHookedMethod(r13)
            return
        L9:
            r13.getClass()
            qb.k r0 = r12.f10833b
            boolean r1 = r0.p()
            android.content.SharedPreferences r2 = r0.f10836c
            if (r1 == 0) goto L85
            java.lang.String r1 = "voice_forward_chat_multi_forward_enable"
            boolean r3 = r0.O(r1)
            java.lang.String r4 = "voice_forward_chat_multi_merge_enable"
            r5 = 0
            if (r3 != 0) goto L28
            boolean r3 = r2.getBoolean(r4, r5)
            if (r3 != 0) goto L28
            goto L85
        L28:
            java.lang.Object r3 = r13.thisObject
            java.util.List r3 = k8.b.b(r3)
            boolean r6 = r3.isEmpty()
            if (r6 != 0) goto L85
            boolean r6 = r3.isEmpty()
            if (r6 == 0) goto L3b
            goto L50
        L3b:
            java.util.Iterator r6 = r3.iterator()
        L3f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L50
            java.lang.Object r7 = r6.next()
            boolean r7 = qb.k.u(r7)
            if (r7 != 0) goto L3f
            goto L85
        L50:
            java.lang.Object[] r13 = r13.args
            if (r13 == 0) goto L85
            java.lang.Object r6 = tf.l.C0(r5, r13)
            if (r6 == 0) goto L85
            boolean r13 = r0.O(r1)
            if (r13 == 0) goto L6c
            java.lang.String r10 = "逐条转发语音[H]"
            java.lang.String r11 = "icons_filled_share"
            r7 = 0
            r8 = 0
            r9 = 1212372557(0x4843564d, float:200025.2)
            qb.k.a(r6, r7, r8, r9, r10, r11)
        L6c:
            boolean r13 = r2.getBoolean(r4, r5)
            if (r13 == 0) goto L85
            int r13 = r3.size()
            r0 = 2
            if (r13 < r0) goto L85
            java.lang.String r10 = "合并语音[H]"
            java.lang.String r11 = "icons_filled_share"
            r7 = 0
            r8 = 0
            r9 = 1212372558(0x4843564e, float:200025.22)
            qb.k.a(r6, r7, r8, r9, r10, r11)
        L85:
            return
        L86:
            r13.getClass()
            qb.k r0 = r12.f10833b
            boolean r1 = r0.p()
            if (r1 != 0) goto L93
            goto L191
        L93:
            java.lang.String r1 = "voice_forward_favorite_forward_enable"
            boolean r1 = r0.O(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto La9
            android.content.SharedPreferences r1 = r0.f10837d
            java.lang.String r4 = "message_forward_favorite_enable"
            boolean r1 = r1.getBoolean(r4, r3)
            if (r1 != 0) goto La9
            r1 = r2
            goto Laa
        La9:
            r1 = r3
        Laa:
            java.lang.String r4 = "voice_forward_favorite_save_enable"
            boolean r4 = r0.O(r4)
            if (r1 != 0) goto Lb6
            if (r4 != 0) goto Lb6
            goto L191
        Lb6:
            java.lang.Object[] r5 = r13.args
            if (r5 == 0) goto L191
            java.lang.Object r6 = tf.l.C0(r3, r5)
            if (r6 == 0) goto L191
            java.lang.Object r3 = r13.thisObject
            java.lang.Object r3 = g4.a.J(r3)
            if (r3 == 0) goto Lc9
            goto Lcf
        Lc9:
            java.lang.Object r3 = g4.a.J(r5)
            if (r3 == 0) goto L191
        Lcf:
            boolean r7 = qb.k.r(r3)
            if (r7 != 0) goto Ld7
            goto L191
        Ld7:
            java.lang.Object r2 = tf.l.C0(r2, r5)
            boolean r5 = r2 instanceof android.view.View
            r7 = 0
            if (r5 == 0) goto Le3
            android.view.View r2 = (android.view.View) r2
            goto Le4
        Le3:
            r2 = r7
        Le4:
            java.lang.Object r5 = r13.thisObject
            if (r5 == 0) goto Lf2
            java.util.Map r8 = r0.f10846m
            r8.getClass()
            java.util.Map r8 = (java.util.Map) r8
            r8.put(r5, r3)
        Lf2:
            if (r2 == 0) goto Lf9
            android.content.Context r5 = r2.getContext()
            goto Lfa
        Lf9:
            r5 = r7
        Lfa:
            boolean r8 = r5 instanceof android.app.Activity
            if (r8 == 0) goto L101
            android.app.Activity r5 = (android.app.Activity) r5
            goto L102
        L101:
            r5 = r7
        L102:
            if (r5 == 0) goto L105
            goto L115
        L105:
            q8.o r5 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r5 == 0) goto L110
            android.app.Activity r5 = r5.a()
            goto L111
        L110:
            r5 = r7
        L111:
            if (r5 == 0) goto L114
            goto L115
        L114:
            r5 = r7
        L115:
            if (r5 == 0) goto L127
            boolean r8 = r5.isFinishing()
            if (r8 != 0) goto L127
            java.util.Map r8 = r0.f10847n
            r8.getClass()
            java.util.Map r8 = (java.util.Map) r8
            r8.put(r5, r3)
        L127:
            r0.f10852s = r3
            qb.i r3 = r0.B(r3)
            if (r3 == 0) goto L174
            java.lang.Object r13 = r13.thisObject
            if (r13 == 0) goto L13d
            java.util.Map r5 = r0.f10848o
            r5.getClass()
            java.util.Map r5 = (java.util.Map) r5
            r5.put(r13, r3)
        L13d:
            if (r2 == 0) goto L144
            android.content.Context r13 = r2.getContext()
            goto L145
        L144:
            r13 = r7
        L145:
            boolean r5 = r13 instanceof android.app.Activity
            if (r5 == 0) goto L14c
            android.app.Activity r13 = (android.app.Activity) r13
            goto L14d
        L14c:
            r13 = r7
        L14d:
            if (r13 == 0) goto L151
        L14f:
            r7 = r13
            goto L160
        L151:
            q8.o r13 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r13 == 0) goto L15c
            android.app.Activity r13 = r13.a()
            goto L15d
        L15c:
            r13 = r7
        L15d:
            if (r13 == 0) goto L160
            goto L14f
        L160:
            if (r7 == 0) goto L172
            boolean r13 = r7.isFinishing()
            if (r13 != 0) goto L172
            java.util.Map r13 = r0.f10849p
            r13.getClass()
            java.util.Map r13 = (java.util.Map) r13
            r13.put(r7, r3)
        L172:
            r0.f10853t = r3
        L174:
            if (r1 == 0) goto L183
            java.lang.String r10 = "转发[H]"
            java.lang.String r11 = "icons_filled_share"
            r8 = 0
            r9 = 1212372550(0x48435646, float:200025.1)
            r7 = r2
            qb.k.a(r6, r7, r8, r9, r10, r11)
            goto L184
        L183:
            r7 = r2
        L184:
            if (r4 == 0) goto L191
            java.lang.String r10 = "保存[H]"
            java.lang.String r11 = "icons_filled_download"
            r8 = 0
            r9 = 1212372563(0x48435653, float:200025.3)
            qb.k.a(r6, r7, r8, r9, r10, r11)
        L191:
            return
    }

    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r15) {
            r14 = this;
            int r0 = r14.f10832a
            switch(r0) {
                case 0: goto L187;
                case 1: goto L5;
                case 2: goto L9;
                default: goto L5;
            }
        L5:
            super.beforeHookedMethod(r15)
            return
        L9:
            r15.getClass()
            qb.k r0 = r14.f10833b
            java.util.Set r1 = r0.f10845l
            boolean r2 = r0.p()
            if (r2 == 0) goto L186
            java.lang.String r2 = "voice_forward_favorite_forward_enable"
            boolean r2 = r0.O(r2)
            if (r2 != 0) goto L20
            goto L186
        L20:
            java.lang.Object[] r2 = r15.args
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L2b
            java.lang.Object r2 = tf.l.C0(r3, r2)
            goto L2c
        L2b:
            r2 = r4
        L2c:
            boolean r5 = r2 instanceof android.view.View
            if (r5 == 0) goto L33
            android.view.View r2 = (android.view.View) r2
            goto L34
        L33:
            r2 = r4
        L34:
            if (r2 == 0) goto L186
            java.lang.Object r2 = g4.a.J(r2)
            if (r2 == 0) goto L186
            boolean r5 = qb.k.r(r2)
            if (r5 != 0) goto L44
            goto L186
        L44:
            java.lang.Object r5 = r15.thisObject
            boolean r6 = r5 instanceof android.app.Activity
            if (r6 == 0) goto L4d
            android.app.Activity r5 = (android.app.Activity) r5
            goto L4e
        L4d:
            r5 = r4
        L4e:
            if (r5 == 0) goto L51
            goto L61
        L51:
            q8.o r5 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r5 == 0) goto L5c
            android.app.Activity r5 = r5.a()
            goto L5d
        L5c:
            r5 = r4
        L5d:
            if (r5 == 0) goto L60
            goto L61
        L60:
            r5 = r4
        L61:
            java.lang.Object r6 = r15.thisObject
            java.lang.String r7 = "S"
            java.lang.String r8 = "Q"
            java.lang.String r9 = "T"
            java.lang.String r10 = "P"
            java.lang.String[] r7 = new java.lang.String[]{r9, r10, r7, r8}
            r8 = 0
            r9 = r8
        L71:
            r10 = 4
            if (r9 < r10) goto L10b
            q8.m r7 = h.Hchat.hooks.api.core.WeChatApis.chatPage()
            if (r7 == 0) goto L8c
            java.lang.String r7 = r7.a()
            if (r7 == 0) goto L8c
            boolean r9 = qb.k.s(r7)
            if (r9 == 0) goto L87
            goto L88
        L87:
            r7 = r4
        L88:
            if (r7 == 0) goto L8c
            goto L126
        L8c:
            java.lang.String r7 = ""
            if (r6 != 0) goto L92
            goto L126
        L92:
            java.lang.Class r9 = r6.getClass()
        L96:
            if (r9 == 0) goto L126
            java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto L126
            java.util.List r10 = h.Hchat.utils.KavaReflector.declaredFields(r9)
            java.util.Iterator r10 = r10.iterator()
        La8:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L106
            java.lang.Object r11 = r10.next()
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
            java.lang.Class r12 = r11.getType()
            java.lang.Class<java.lang.String> r13 = java.lang.String.class
            boolean r12 = gg.l.a(r12, r13)
            if (r12 != 0) goto Lc1
            goto La8
        Lc1:
            java.lang.Object r11 = h.Hchat.utils.KavaReflector.readField(r11, r6)
            boolean r12 = r11 instanceof java.lang.String
            if (r12 == 0) goto Lcc
            java.lang.String r11 = (java.lang.String) r11
            goto Lcd
        Lcc:
            r11 = r4
        Lcd:
            if (r11 == 0) goto La8
            java.lang.CharSequence r12 = og.m.R0(r11)
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = "filehelper"
            boolean r13 = gg.l.a(r12, r13)
            if (r13 == 0) goto Le1
        Ldf:
            r12 = r3
            goto Lfe
        Le1:
            java.lang.String r13 = "@chatroom"
            boolean r13 = og.t.W(r12, r13, r8)
            if (r13 != 0) goto Ldf
            java.lang.String r13 = "@im.chatroom"
            boolean r13 = og.t.W(r12, r13, r8)
            if (r13 != 0) goto Ldf
            java.lang.String r13 = "@openim"
            boolean r13 = og.t.W(r12, r13, r8)
            if (r13 == 0) goto Lfa
            goto Ldf
        Lfa:
            boolean r12 = zb.c.b(r12)
        Lfe:
            if (r12 == 0) goto L101
            goto L102
        L101:
            r11 = r4
        L102:
            if (r11 == 0) goto La8
            r7 = r11
            goto L126
        L106:
            java.lang.Class r9 = r9.getSuperclass()
            goto L96
        L10b:
            r10 = r7[r9]
            java.lang.Object r10 = h.Hchat.utils.KavaReflector.readField(r6, r10)
            boolean r11 = r10 instanceof java.lang.String
            if (r11 == 0) goto L118
            java.lang.String r10 = (java.lang.String) r10
            goto L119
        L118:
            r10 = r4
        L119:
            if (r10 == 0) goto L182
            boolean r11 = qb.k.s(r10)
            if (r11 == 0) goto L122
            goto L123
        L122:
            r10 = r4
        L123:
            if (r10 == 0) goto L182
            r7 = r10
        L126:
            boolean r6 = og.m.t0(r7)
            if (r6 == 0) goto L135
            java.lang.String r0 = "当前聊天不可用"
            qb.k.N(r5, r0)
            r15.setResult(r4)
            goto L186
        L135:
            qb.i r2 = r0.B(r2)
            if (r2 != 0) goto L144
            java.lang.String r0 = "收藏语音文件不存在"
            qb.k.N(r5, r0)
            r15.setResult(r4)
            goto L186
        L144:
            if (r5 == 0) goto L17e
            boolean r6 = r5.isFinishing()
            if (r6 == 0) goto L14d
            goto L17e
        L14d:
            boolean r6 = r1.contains(r5)
            if (r6 != 0) goto L17a
            r1.add(r5)
            aa.c r1 = new aa.c
            r6 = 26
            r1.<init>(r0, r6, r2)
            c9.n0 r6 = new c9.n0
            r6.<init>(r0, r2, r7, r5)
            qb.c r2 = new qb.c
            r7 = 1
            r2.<init>(r0, r5, r7)
            db.f r0 = new db.f
            r7 = 21
            r0.<init>(r1, r7, r6)
            s0.d r1 = new s0.d
            r6 = 1484979892(0x5882feb4, float:1.1522436E15)
            r1.<init>(r6, r0, r3)
            wb.y2.P1(r5, r2, r1)
        L17a:
            r15.setResult(r4)
            goto L186
        L17e:
            r15.setResult(r4)
            goto L186
        L182:
            int r9 = r9 + 1
            goto L71
        L186:
            return
        L187:
            r15.getClass()
            qb.k r0 = r14.f10833b
            boolean r1 = r0.p()
            if (r1 != 0) goto L194
            goto L27b
        L194:
            java.lang.Object[] r1 = r15.args
            if (r1 == 0) goto L27b
            r2 = 0
            java.lang.Object r3 = tf.l.C0(r2, r1)
            boolean r4 = r3 instanceof android.view.MenuItem
            r5 = 0
            if (r4 == 0) goto L1a5
            android.view.MenuItem r3 = (android.view.MenuItem) r3
            goto L1a6
        L1a5:
            r3 = r5
        L1a6:
            if (r3 == 0) goto L27b
            int r4 = r3.getItemId()
            r6 = 1212372550(0x48435646, float:200025.1)
            r7 = 1212372563(0x48435653, float:200025.3)
            if (r4 == r6) goto L1bc
            int r4 = r3.getItemId()
            if (r4 == r7) goto L1bc
            goto L27b
        L1bc:
            int r4 = r3.getItemId()
            if (r4 != r6) goto L1d4
            java.lang.String r4 = "voice_forward_favorite_forward_enable"
            boolean r4 = r0.O(r4)
            if (r4 == 0) goto L27b
            android.content.SharedPreferences r4 = r0.f10837d
            java.lang.String r6 = "message_forward_favorite_enable"
            boolean r2 = r4.getBoolean(r6, r2)
            if (r2 != 0) goto L27b
        L1d4:
            int r2 = r3.getItemId()
            if (r2 != r7) goto L1e4
            java.lang.String r2 = "voice_forward_favorite_save_enable"
            boolean r2 = r0.O(r2)
            if (r2 != 0) goto L1e4
            goto L27b
        L1e4:
            q8.o r2 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r2 == 0) goto L1ef
            android.app.Activity r2 = r2.a()
            goto L1f0
        L1ef:
            r2 = r5
        L1f0:
            if (r2 == 0) goto L1f3
            goto L1f4
        L1f3:
            r2 = r5
        L1f4:
            java.lang.Object r4 = r15.thisObject
            java.lang.Object r4 = g4.a.J(r4)
            if (r4 == 0) goto L1fd
            goto L220
        L1fd:
            java.lang.Object r4 = g4.a.J(r1)
            if (r4 == 0) goto L204
            goto L220
        L204:
            java.lang.Object r1 = r15.thisObject
            if (r1 == 0) goto L212
            java.util.Map r4 = r0.f10846m
            java.lang.Object r1 = r4.get(r1)
            if (r1 == 0) goto L212
        L210:
            r4 = r1
            goto L220
        L212:
            if (r2 == 0) goto L21d
            java.util.Map r1 = r0.f10847n
            java.lang.Object r1 = r1.get(r2)
            if (r1 == 0) goto L21d
            goto L210
        L21d:
            java.lang.Object r1 = r0.f10852s
            goto L210
        L220:
            if (r4 == 0) goto L229
            qb.i r1 = r0.B(r4)
            if (r1 == 0) goto L229
            goto L247
        L229:
            java.lang.Object r1 = r15.thisObject
            if (r1 == 0) goto L238
            java.util.Map r6 = r0.f10848o
            java.lang.Object r1 = r6.get(r1)
            qb.i r1 = (qb.i) r1
            if (r1 == 0) goto L238
            goto L247
        L238:
            if (r2 == 0) goto L245
            java.util.Map r1 = r0.f10849p
            java.lang.Object r1 = r1.get(r2)
            qb.i r1 = (qb.i) r1
            if (r1 == 0) goto L245
            goto L247
        L245:
            qb.i r1 = r0.f10853t
        L247:
            if (r1 != 0) goto L257
            if (r4 != 0) goto L24e
            java.lang.String r0 = "收藏语音不可用"
            goto L250
        L24e:
            java.lang.String r0 = "收藏语音文件不存在"
        L250:
            qb.k.N(r2, r0)
            r15.setResult(r5)
            goto L27b
        L257:
            if (r2 != 0) goto L25d
            r15.setResult(r5)
            goto L27b
        L25d:
            int r3 = r3.getItemId()
            if (r3 != r7) goto L275
            java.lang.Thread r3 = new java.lang.Thread
            ac.l r4 = new ac.l
            r6 = 29
            r4.<init>(r0, r2, r1, r6)
            java.lang.String r0 = "Hchat-VoiceSave"
            r3.<init>(r4, r0)
            r3.start()
            goto L278
        L275:
            r0.J(r2, r1)
        L278:
            r15.setResult(r5)
        L27b:
            return
    }
}
