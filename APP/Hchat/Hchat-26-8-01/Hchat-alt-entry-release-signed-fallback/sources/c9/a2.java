package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r8.g f1102b;

    public /* synthetic */ a2(r8.g r1, int r2) {
            r0 = this;
            r0.f1101a = r2
            r0.f1102b = r1
            r0.<init>()
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r21) {
            r20 = this;
            r1 = r20
            r0 = r21
            int r2 = r1.f1101a
            r4 = 0
            r5 = 1
            switch(r2) {
                case 0: goto L160;
                case 1: goto L3e;
                case 2: goto Lb;
                case 3: goto L1e;
                case 4: goto Lb;
                case 5: goto Lf;
                default: goto Lb;
            }
        Lb:
            super.afterHookedMethod(r21)
            return
        Lf:
            r0.getClass()
            java.util.concurrent.atomic.AtomicBoolean r2 = e9.q.f2460a
            java.lang.Object r0 = r0.thisObject
            r8.g r2 = r1.f1102b
            android.content.Context r2 = r2.f11620a
            e9.q.b(r0, r2)
            return
        L1e:
            r0.getClass()
            java.lang.ThreadLocal r0 = e9.q.f2471l
            java.lang.Object r2 = r0.get()
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2
            if (r2 == 0) goto L3d
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L34
            r2.removeLast()
        L34:
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L3d
            r0.remove()
        L3d:
            return
        L3e:
            r0.getClass()
            c9.d2 r2 = c9.d2.f1137a
            java.lang.Object r0 = r0.thisObject
            r8.g r2 = r1.f1102b
            android.content.Context r2 = r2.f11620a
            if (r0 == 0) goto L15f
            java.lang.String r6 = c9.d2.v(r0)
            if (r6 != 0) goto L53
            goto L15f
        L53:
            java.util.List r7 = c9.o2.i(r2)
            java.util.Iterator r7 = r7.iterator()
        L5b:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L75
            java.lang.Object r8 = r7.next()
            r9 = r8
            c9.a r9 = (c9.a) r9
            java.lang.String r9 = r9.f1081a
            java.lang.String r9 = c9.d2.F(r9)
            boolean r9 = r9.equals(r6)
            if (r9 == 0) goto L5b
            goto L76
        L75:
            r8 = 0
        L76:
            c9.a r8 = (c9.a) r8
            if (r8 != 0) goto L7c
            goto L15f
        L7c:
            java.lang.String r7 = "adapter"
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.readField(r0, r7)
            if (r7 == 0) goto L8e
            java.util.Map r9 = c9.d2.f1144h
            r9.getClass()
            java.util.Map r9 = (java.util.Map) r9
            r9.put(r7, r6)
        L8e:
            java.lang.String r9 = "emptyTipTv"
            java.lang.Object r9 = h.Hchat.utils.KavaReflector.readField(r0, r9)
            boolean r10 = r9 instanceof android.widget.TextView
            if (r10 == 0) goto L9b
            android.widget.TextView r9 = (android.widget.TextView) r9
            goto L9c
        L9b:
            r9 = 0
        L9c:
            if (r9 == 0) goto La3
            java.lang.String r10 = "当前分组没有会话"
            r9.setText(r10)
        La3:
            java.lang.String r9 = "appbrandMessageLV"
            java.lang.Object r9 = h.Hchat.utils.KavaReflector.readField(r0, r9)
            boolean r10 = r9 instanceof android.widget.AdapterView
            if (r10 == 0) goto Lb0
            android.widget.AdapterView r9 = (android.widget.AdapterView) r9
            goto Lb1
        Lb0:
            r9 = 0
        Lb1:
            if (r9 == 0) goto Lda
            java.lang.String r10 = r8.f1081a
            java.util.Map r11 = c9.d2.f1145i
            r11.getClass()
            monitor-enter(r11)
            boolean r12 = r11.containsKey(r9)     // Catch: java.lang.Throwable -> Ld7
            if (r12 == 0) goto Lc3
            monitor-exit(r11)
            goto Lda
        Lc3:
            android.widget.AdapterView$OnItemLongClickListener r12 = r9.getOnItemLongClickListener()     // Catch: java.lang.Throwable -> Ld7
            r13 = r11
            java.util.Map r13 = (java.util.Map) r13     // Catch: java.lang.Throwable -> Ld7
            r13.put(r9, r12)     // Catch: java.lang.Throwable -> Ld7
            monitor-exit(r11)
            c9.m1 r11 = new c9.m1
            r11.<init>(r10, r0, r12, r2)
            r9.setOnItemLongClickListener(r11)
            goto Lda
        Ld7:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        Lda:
            if (r7 == 0) goto Le7
            java.lang.reflect.Method r9 = c9.d2.f1152p
            java.lang.Object[] r10 = new java.lang.Object[r4]
            boolean r9 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r9, r7, r10)
            if (r9 == 0) goto Le7
            r4 = r5
        Le7:
            if (r7 == 0) goto Lfc
            if (r4 != 0) goto Lfc
            java.lang.Class r4 = r7.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = "[Hchat:ConversationGroup] 刷新微信原生分组列表失败: adapter="
            java.lang.String r4 = r5.concat(r4)
            fb.v0.m(r4)
        Lfc:
            java.lang.String r4 = r8.f1082b
            c9.d2.x(r6, r0, r4, r7)
            java.lang.String r4 = r8.f1081a
            java.lang.Class r5 = r0.getClass()
            java.lang.String r6 = "addTextOptionMenu"
            java.lang.Class r7 = java.lang.Integer.TYPE
            r7.getClass()
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.Class<android.view.MenuItem$OnMenuItemClickListener> r9 = android.view.MenuItem.OnMenuItemClickListener.class
            java.lang.Class[] r7 = new java.lang.Class[]{r7, r8, r9}
            java.lang.reflect.Method r5 = h.Hchat.utils.KavaReflector.findMethodRecursive(r5, r6, r7)
            c9.l1 r6 = new c9.l1
            r6.<init>(r0, r4, r2)
            r2 = 1212368717(0x4843474d, float:199965.2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r4 = "菜单"
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r4, r6}
            boolean r2 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r5, r0, r2)
            if (r2 != 0) goto L15f
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            if (r5 == 0) goto L141
            java.lang.String r3 = r5.toGenericString()
            goto L142
        L141:
            r3 = 0
        L142:
            if (r3 != 0) goto L146
            java.lang.String r3 = ""
        L146:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "[Hchat:ConversationGroup] 添加微信原生分组页菜单失败: fragment="
            r2.<init>(r4)
            r2.append(r0)
            java.lang.String r0 = " method="
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            fb.v0.m(r0)
        L15f:
            return
        L160:
            r0.getClass()
            java.lang.ThreadLocal r2 = c9.d2.f1146j
            java.lang.Object r2 = r2.get()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L2e8
            boolean r6 = c9.d2.q(r2)
            if (r6 == 0) goto L174
            goto L175
        L174:
            r2 = 0
        L175:
            if (r2 == 0) goto L2e8
            java.lang.Object r6 = r0.getResult()
            boolean r7 = r6 instanceof android.database.Cursor
            if (r7 == 0) goto L182
            android.database.Cursor r6 = (android.database.Cursor) r6
            goto L183
        L182:
            r6 = 0
        L183:
            if (r6 == 0) goto L2e8
            r8.g r7 = r1.f1102b
            android.content.Context r7 = r7.f11620a
            java.util.List r7 = c9.o2.i(r7)
            java.util.Iterator r7 = r7.iterator()
        L191:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L1ab
            java.lang.Object r8 = r7.next()
            r9 = r8
            c9.a r9 = (c9.a) r9
            java.lang.String r9 = r9.f1081a
            java.lang.String r9 = c9.d2.F(r9)
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L191
            goto L1ac
        L1ab:
            r8 = 0
        L1ac:
            c9.a r8 = (c9.a) r8
            if (r8 == 0) goto L1b3
            java.util.List r2 = r8.f1086f
            goto L1b4
        L1b3:
            r2 = 0
        L1b4:
            if (r2 != 0) goto L1b8
            tf.t r2 = tf.t.f13167g
        L1b8:
            int r7 = r6.getCount()
            if (r7 > 0) goto L1c0
            goto L2e5
        L1c0:
            java.lang.String r7 = "username"
            int r7 = r6.getColumnIndex(r7)
            if (r7 >= 0) goto L1ca
            goto L2e5
        L1ca:
            java.lang.String r8 = "flag"
            int r8 = r6.getColumnIndex(r8)
            ng.p r9 = new ng.p
            i.e0 r10 = new i.e0
            r11 = 25
            r10.<init>(r2, r11)
            r11 = 2
            r9.<init>(r10, r11)
            int r10 = tf.n.e1(r9)
            int r10 = tf.y.a0(r10)
            r12 = 16
            if (r10 >= r12) goto L1ea
            r10 = r12
        L1ea:
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>(r10)
            java.util.Iterator r9 = r9.iterator()
        L1f3:
            r10 = r9
            ng.d r10 = (ng.d) r10
            java.util.Iterator r13 = r10.f9432i
            boolean r13 = r13.hasNext()
            if (r13 == 0) goto L212
            java.lang.Object r10 = r10.next()
            tf.w r10 = (tf.w) r10
            int r13 = r10.f13170a
            java.lang.Object r10 = r10.f13171b
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.put(r10, r13)
            goto L1f3
        L212:
            java.lang.String[] r9 = r6.getColumnNames()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r13 = r4
        L21c:
            boolean r14 = r6.moveToNext()
            if (r14 == 0) goto L2b8
            int r14 = r9.length
            java.lang.Object[] r15 = new java.lang.Object[r14]
            r3 = r4
        L226:
            if (r3 >= r14) goto L259
            int r4 = r6.getType(r3)
            if (r4 == 0) goto L251
            if (r4 == r5) goto L248
            if (r4 == r11) goto L23f
            r11 = 4
            if (r4 == r11) goto L23a
            java.lang.String r4 = r6.getString(r3)
            goto L252
        L23a:
            byte[] r4 = r6.getBlob(r3)
            goto L252
        L23f:
            double r16 = r6.getDouble(r3)
            java.lang.Double r4 = java.lang.Double.valueOf(r16)
            goto L252
        L248:
            long r16 = r6.getLong(r3)
            java.lang.Long r4 = java.lang.Long.valueOf(r16)
            goto L252
        L251:
            r4 = 0
        L252:
            r15[r3] = r4
            int r3 = r3 + 1
            r4 = 0
            r11 = 2
            goto L226
        L259:
            r3 = r15[r7]
            if (r3 == 0) goto L262
            java.lang.String r3 = r3.toString()
            goto L263
        L262:
            r3 = 0
        L263:
            if (r3 != 0) goto L267
            java.lang.String r3 = ""
        L267:
            if (r8 < 0) goto L294
            r4 = r15[r8]
            boolean r11 = r4 instanceof java.lang.Number
            if (r11 == 0) goto L272
            java.lang.Number r4 = (java.lang.Number) r4
            goto L273
        L272:
            r4 = 0
        L273:
            if (r4 == 0) goto L27a
            long r16 = r4.longValue()
            goto L27c
        L27a:
            r16 = 0
        L27c:
            boolean r4 = r12.containsKey(r3)
            if (r4 == 0) goto L287
            r18 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r16 = r16 | r18
            goto L28e
        L287:
            r18 = -4611686018427387905(0xbfffffffffffffff, double:-1.9999999999999998)
            long r16 = r16 & r18
        L28e:
            java.lang.Long r4 = java.lang.Long.valueOf(r16)
            r15[r8] = r4
        L294:
            java.lang.Object r3 = r12.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L2a1
            int r3 = r3.intValue()
            goto L2a6
        L2a1:
            int r3 = r2.size()
            int r3 = r3 + r13
        L2a6:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            sf.e r4 = new sf.e
            r4.<init>(r3, r15)
            r10.add(r4)
            int r13 = r13 + 1
            r4 = 0
            r11 = 2
            goto L21c
        L2b8:
            r6.close()     // Catch: java.lang.Throwable -> L2bb
        L2bb:
            android.database.MatrixCursor r6 = new android.database.MatrixCursor
            int r2 = r10.size()
            r6.<init>(r9, r2)
            c9.h1 r2 = new c9.h1
            r2.<init>(r5)
            java.util.List r2 = tf.m.K1(r10, r2)
            java.util.Iterator r2 = r2.iterator()
        L2d1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2e5
            java.lang.Object r3 = r2.next()
            sf.e r3 = (sf.e) r3
            java.lang.Object r3 = r3.f12419h
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r6.addRow(r3)
            goto L2d1
        L2e5:
            r0.setResult(r6)
        L2e8:
            return
    }

    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r37) {
            r36 = this;
            r1 = r36
            r0 = r37
            int r2 = r1.f1101a
            java.lang.String r3 = "msgSvrId"
            java.lang.String r4 = "field_msgSvrId"
            java.lang.String r5 = "talker"
            java.lang.String r6 = "field_talker"
            java.lang.String r8 = "block_at_all_notification_enable"
            java.lang.String r9 = "Hchat_block_at_all_notification_config"
            java.lang.String r10 = ""
            java.lang.String r11 = "custom_notification_enable"
            r12 = 0
            r14 = 1
            r15 = 0
            r8.g r7 = r1.f1102b
            switch(r2) {
                case 0: goto L61e;
                case 1: goto L1f;
                case 2: goto L3b5;
                case 3: goto L2fd;
                case 4: goto L2f0;
                case 5: goto L1f;
                case 6: goto L52;
                case 7: goto L23;
                default: goto L1f;
            }
        L1f:
            super.beforeHookedMethod(r37)
            return
        L23:
            r0.getClass()
            java.lang.Object[] r0 = r0.args
            r0.getClass()
            java.lang.Object r0 = tf.l.z0(r0)
            boolean r2 = r0 instanceof org.json.JSONObject
            if (r2 == 0) goto L36
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            goto L37
        L36:
            r0 = 0
        L37:
            if (r0 == 0) goto L51
            android.content.Context r2 = r7.f11620a
            java.util.List r0 = ua.g.i(r0)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L46
            goto L51
        L46:
            java.util.List r3 = ua.g.g(r2)
            java.util.ArrayList r0 = tf.m.F1(r3, r0)
            ua.g.j(r2, r0)
        L51:
            return
        L52:
            r0.getClass()
            java.lang.Object[] r2 = r0.args
            if (r2 == 0) goto L62
            int r3 = r2.length
            if (r3 != 0) goto L5d
            goto L62
        L5d:
            int r3 = r2.length
            int r3 = r3 - r14
            r2 = r2[r3]
            goto L63
        L62:
            r2 = 0
        L63:
            boolean r3 = r2 instanceof android.app.Notification
            if (r3 == 0) goto L6a
            android.app.Notification r2 = (android.app.Notification) r2
            goto L6b
        L6a:
            r2 = 0
        L6b:
            if (r2 == 0) goto L2ef
            android.content.Context r3 = r7.f11620a
            java.util.concurrent.atomic.AtomicBoolean r4 = e9.q.f2460a
            android.os.Bundle r4 = r2.extras
            if (r4 == 0) goto L7e
            java.lang.String r5 = "hchat_custom_notification"
            boolean r5 = r4.getBoolean(r5, r15)
            if (r5 != r14) goto L7e
            goto La6
        L7e:
            if (r4 == 0) goto L89
            java.lang.String r5 = "hchat_keyword_notification"
            boolean r4 = r4.getBoolean(r5, r15)
            if (r4 != r14) goto L89
            goto La6
        L89:
            java.lang.String r4 = r2.getChannelId()
            if (r4 == 0) goto L98
            java.lang.String r5 = "Hchat_custom_notification_"
            boolean r4 = og.t.d0(r4, r5, r15)
            if (r4 != r14) goto L98
            goto La6
        L98:
            java.lang.String r4 = r2.getChannelId()
            if (r4 == 0) goto La8
            java.lang.String r5 = "Hchat_keyword_notification_"
            boolean r4 = og.t.d0(r4, r5, r15)
            if (r4 != r14) goto La8
        La6:
            r4 = r14
            goto La9
        La8:
            r4 = r15
        La9:
            android.os.Bundle r5 = r2.extras
            if (r5 == 0) goto Lb4
            java.lang.String r6 = "hchat_custom_notification_talker"
            java.lang.String r5 = r5.getString(r6)
            goto Lb5
        Lb4:
            r5 = 0
        Lb5:
            if (r5 != 0) goto Lb8
            r5 = r10
        Lb8:
            android.os.Bundle r6 = r2.extras
            java.lang.String r7 = "hchat_custom_notification_native_msg_svr_id"
            if (r6 == 0) goto Lc9
            long r16 = r6.getLong(r7, r12)
            r34 = r16
            r16 = r12
            r12 = r34
            goto Lcb
        Lc9:
            r16 = r12
        Lcb:
            if (r4 == 0) goto Lcf
            goto L2ef
        Lcf:
            boolean r4 = og.m.t0(r5)
            if (r4 == 0) goto Ld7
            goto L2ef
        Ld7:
            java.util.concurrent.ConcurrentHashMap r4 = t8.b.f13089a
            android.content.SharedPreferences r6 = ub.b.c(r3, r9)
            boolean r6 = r6.getBoolean(r8, r15)
            if (r6 != 0) goto Le9
            r4.clear()
        Le6:
            r18 = 15000(0x3a98, double:7.411E-320)
            goto L136
        Le9:
            java.lang.CharSequence r6 = og.m.R0(r5)
            java.lang.String r6 = r6.toString()
            if (r6 != 0) goto Lf4
            r6 = r10
        Lf4:
            boolean r18 = t8.b.b(r6)
            if (r18 == 0) goto Le6
            int r18 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r18 > 0) goto Lff
            goto Le6
        Lff:
            boolean r18 = oh.h.i(r3, r6)
            if (r18 != 0) goto L110
            r18 = 15000(0x3a98, double:7.411E-320)
            t8.a r8 = new t8.a
            r8.<init>(r6, r12)
            r4.remove(r8)
            goto L136
        L110:
            r18 = 15000(0x3a98, double:7.411E-320)
            t8.a r8 = new t8.a
            r8.<init>(r6, r12)
            java.lang.Object r6 = r4.get(r8)
            java.lang.Long r6 = (java.lang.Long) r6
            if (r6 == 0) goto L136
            long r20 = r6.longValue()
            long r22 = java.lang.System.currentTimeMillis()
            long r22 = r22 - r20
            int r9 = (r22 > r18 ? 1 : (r22 == r18 ? 0 : -1))
            if (r9 > 0) goto L133
            r9 = 0
            r0.setResult(r9)
            goto L2ef
        L133:
            r4.remove(r8, r6)
        L136:
            e9.s r4 = new e9.s
            r4.<init>(r3)
            boolean r6 = r4.b(r11)
            if (r6 != 0) goto L143
            goto L2ef
        L143:
            e9.c r4 = r4.a(r5)
            if (r4 == 0) goto L2ef
            boolean r6 = r4.f2395f
            if (r6 != 0) goto L14f
            goto L2ef
        L14f:
            java.util.concurrent.ConcurrentHashMap r6 = e9.q.f2467h
            long r8 = java.lang.System.currentTimeMillis()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r6.put(r5, r8)
            int r8 = r6.size()
            r9 = 128(0x80, float:1.8E-43)
            if (r8 <= r9) goto L17c
            long r8 = java.lang.System.currentTimeMillis()
            java.util.Set r6 = r6.entrySet()
            ca.c r11 = new ca.c
            r15 = 2
            r11.<init>(r8, r15)
            be.i r8 = new be.i
            r9 = 8
            r8.<init>(r11, r9)
            r6.removeIf(r8)
        L17c:
            int r6 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r6 > 0) goto L182
            goto L2ef
        L182:
            boolean r8 = e9.q.A(r4, r5)
            if (r8 == 0) goto L18e
            r9 = 0
            r0.setResult(r9)
            goto L2ef
        L18e:
            boolean r8 = r4.f2393d
            if (r8 == 0) goto L1b2
            if (r6 > 0) goto L195
            goto L1b2
        L195:
            e9.j r6 = new e9.j
            r6.<init>(r5, r12)
            java.util.concurrent.ConcurrentHashMap r5 = e9.q.f2468i
            java.lang.Object r8 = r5.get(r6)
            e9.i r8 = (e9.i) r8
            if (r8 == 0) goto L1b2
            long r11 = java.lang.System.currentTimeMillis()
            long r14 = r8.f2429b
            long r11 = r11 - r14
            int r9 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r9 <= 0) goto L1b4
            r5.remove(r6, r8)
        L1b2:
            r5 = 0
            goto L1c6
        L1b4:
            l8.c r5 = r8.f2428a
            int r5 = r5.ordinal()
            r13 = 1
            if (r5 == r13) goto L1c4
            r15 = 2
            if (r5 == r15) goto L1c1
            goto L1b2
        L1c1:
            boolean r5 = r4.f2409t
            goto L1c6
        L1c4:
            boolean r5 = r4.f2410u
        L1c6:
            if (r5 == 0) goto L1ce
            r12 = 0
            r0.setResult(r12)
            goto L2ef
        L1ce:
            r12 = 0
            r0.setResult(r12)
            int r0 = r4.f2396g
            if (r0 == 0) goto L2ef
            boolean r0 = e9.q.k(r4)
            if (r0 == 0) goto L1de
            goto L2ef
        L1de:
            java.lang.String r0 = r4.f2391b
            java.lang.String r5 = g4.a.k(r0)
            boolean r6 = og.m.t0(r5)
            if (r6 == 0) goto L1f3
            java.lang.String r5 = r4.f2392c
            boolean r6 = og.m.t0(r5)
            if (r6 == 0) goto L1f3
            r5 = r0
        L1f3:
            r22 = r5
            java.lang.String r5 = "hchat_custom_notification_native_text"
            java.lang.String r23 = e9.q.t(r2, r5)
            java.lang.String r5 = "hchat_custom_notification_native_summary"
            java.lang.String r24 = e9.q.t(r2, r5)
            java.lang.String r5 = "android.bigText"
            java.lang.String r25 = e9.q.t(r2, r5)
            java.lang.String r5 = "android.text"
            java.lang.String r26 = e9.q.t(r2, r5)
            android.os.Bundle r5 = r2.extras
            if (r5 == 0) goto L218
            java.lang.String r6 = "android.textLines"
            java.lang.CharSequence[] r9 = r5.getCharSequenceArray(r6)
            goto L219
        L218:
            r9 = r12
        L219:
            if (r9 != 0) goto L21e
            r5 = 0
            java.lang.CharSequence[] r9 = new java.lang.CharSequence[r5]
        L21e:
            java.lang.CharSequence[] r9 = (java.lang.CharSequence[]) r9
            int r5 = r9.length
            int r5 = r5 + (-1)
            if (r5 < 0) goto L239
        L225:
            int r6 = r5 + (-1)
            r5 = r9[r5]
            if (r5 == 0) goto L234
            boolean r8 = og.m.t0(r5)
            if (r8 == 0) goto L232
            goto L234
        L232:
            r9 = r5
            goto L23a
        L234:
            if (r6 >= 0) goto L237
            goto L239
        L237:
            r5 = r6
            goto L225
        L239:
            r9 = r12
        L23a:
            if (r9 == 0) goto L241
            java.lang.String r9 = r9.toString()
            goto L242
        L241:
            r9 = r12
        L242:
            if (r9 != 0) goto L247
            r27 = r10
            goto L249
        L247:
            r27 = r9
        L249:
            java.lang.String r5 = "android.summaryText"
            java.lang.String r28 = e9.q.t(r2, r5)
            java.lang.CharSequence r5 = r2.tickerText
            if (r5 == 0) goto L25a
            java.lang.String r9 = r5.toString()
            r29 = r9
            goto L25c
        L25a:
            r29 = r12
        L25c:
            java.lang.String[] r5 = new java.lang.String[]{r23, r24, r25, r26, r27, r28, r29}
            java.lang.String r5 = e9.q.g(r5)
            boolean r6 = r4.f2403n
            java.lang.String r8 = "[收到一条新消息]"
            if (r6 == 0) goto L276
            java.lang.String r5 = e9.q.y(r5)
            boolean r6 = og.m.t0(r5)
            if (r6 == 0) goto L275
            goto L276
        L275:
            r8 = r5
        L276:
            r23 = r8
            android.os.Bundle r5 = r2.extras
            if (r5 == 0) goto L299
            java.lang.String r6 = "hchat_custom_notification_unread_count"
            r8 = 0
            int r5 = r5.getInt(r6, r8)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            if (r5 <= 0) goto L28b
            r5 = 1
            goto L28c
        L28b:
            r5 = 0
        L28c:
            if (r5 == 0) goto L28f
            goto L290
        L28f:
            r9 = r12
        L290:
            if (r9 == 0) goto L299
            int r5 = r9.intValue()
        L296:
            r24 = r5
            goto L2a0
        L299:
            int r5 = e9.q.d(r3, r0)
            r13 = 1
            int r5 = r5 + r13
            goto L296
        L2a0:
            android.graphics.Bitmap r25 = e9.q.p(r3, r0)
            long r5 = r2.when
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 <= 0) goto L2b0
            r14 = 1
            goto L2b1
        L2b0:
            r14 = 0
        L2b1:
            if (r14 == 0) goto L2b4
            goto L2b5
        L2b4:
            r0 = r12
        L2b5:
            if (r0 == 0) goto L2be
            long r5 = r0.longValue()
        L2bb:
            r26 = r5
            goto L2c3
        L2be:
            long r5 = java.lang.System.currentTimeMillis()
            goto L2bb
        L2c3:
            android.os.Bundle r0 = r2.extras
            if (r0 == 0) goto L2d0
            r5 = r16
            long r12 = r0.getLong(r7, r5)
            r30 = r12
            goto L2d2
        L2d0:
            r30 = 0
        L2d2:
            android.app.PendingIntent r0 = r2.contentIntent
            e9.l r21 = new e9.l
            r28 = 0
            r33 = 32
            r32 = r0
            r21.<init>(r22, r23, r24, r25, r26, r28, r30, r32, r33)
            java.util.concurrent.ExecutorService r6 = e9.q.f2463d
            ac.l r0 = new ac.l
            r5 = 11
            r2 = r3
            r3 = r4
            r4 = r21
            r0.<init>(r1, r2, r3, r4, r5)
            r6.execute(r0)
        L2ef:
            return
        L2f0:
            r0.getClass()
            java.util.concurrent.atomic.AtomicBoolean r1 = e9.q.f2460a
            java.lang.Object r0 = r0.thisObject
            android.content.Context r1 = r7.f11620a
            e9.q.b(r0, r1)
            return
        L2fd:
            r0.getClass()
            java.lang.ThreadLocal r1 = e9.q.f2471l
            java.lang.Object r2 = r1.get()
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2
            if (r2 == 0) goto L30b
            goto L313
        L30b:
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r1.set(r2)
        L313:
            java.util.concurrent.atomic.AtomicBoolean r1 = e9.q.f2460a
            android.content.Context r1 = r7.f11620a
            java.lang.Object[] r0 = r0.args
            if (r0 == 0) goto L31c
            goto L31f
        L31c:
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
        L31f:
            e9.s r7 = new e9.s
            r7.<init>(r1)
            boolean r1 = r7.b(r11)
            if (r1 != 0) goto L32c
            goto L3ac
        L32c:
            java.lang.Object r0 = e9.q.f(r0)
            if (r0 == 0) goto L3ac
            java.lang.String[] r1 = new java.lang.String[]{r6, r5}
            java.lang.String r1 = e9.q.w(r0, r1)
            java.lang.String[] r3 = new java.lang.String[]{r4, r3}
            long r3 = e9.q.v(r0, r3)
            java.lang.String r5 = "field_type"
            java.lang.String r6 = "type"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}
            int r5 = e9.q.u(r0, r5)
            java.lang.String r6 = "field_isSend"
            java.lang.String r8 = "isSend"
            java.lang.String[] r6 = new java.lang.String[]{r6, r8}
            int r0 = e9.q.u(r0, r6)
            r13 = 1
            if (r0 != r13) goto L35f
            r0 = 1
            goto L360
        L35f:
            r0 = 0
        L360:
            boolean r6 = og.m.t0(r1)
            if (r6 != 0) goto L3ac
            r16 = 0
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 <= 0) goto L3ac
            if (r0 != 0) goto L3ac
            r0 = 10002(0x2712, float:1.4016E-41)
            r3 = 10000(0x2710, float:1.4013E-41)
            if (r5 > 0) goto L375
            goto L38b
        L375:
            r4 = r5 & 255(0xff, float:3.57E-43)
            r6 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r5
            int r8 = r5 >>> 16
            if (r8 != 0) goto L380
            goto L38b
        L380:
            if (r6 == r3) goto L38a
            if (r6 == r0) goto L38a
            if (r4 == 0) goto L38b
            if (r6 != r4) goto L38b
            r5 = r4
            goto L38b
        L38a:
            r5 = r6
        L38b:
            if (r5 == r3) goto L3ac
            if (r5 != r0) goto L390
            goto L3ac
        L390:
            e9.c r0 = r7.a(r1)
            if (r0 == 0) goto L3ac
            boolean r3 = r0.f2395f
            if (r3 == 0) goto L3ac
            int r3 = r0.f2396g
            if (r3 == 0) goto L3ac
            boolean r3 = e9.q.k(r0)
            if (r3 != 0) goto L3ac
            boolean r0 = e9.q.A(r0, r1)
            if (r0 != 0) goto L3ac
            r14 = 1
            goto L3ad
        L3ac:
            r14 = 0
        L3ad:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)
            r2.addLast(r0)
            return
        L3b5:
            r12 = 0
            r0.getClass()
            java.util.concurrent.atomic.AtomicBoolean r1 = e9.q.f2460a
            android.content.Context r1 = r7.f11620a
            java.lang.Object[] r0 = r0.args
            if (r0 == 0) goto L3c4
            r2 = r0
            r0 = 0
            goto L3c7
        L3c4:
            r0 = 0
            java.lang.Object[] r2 = new java.lang.Object[r0]
        L3c7:
            android.content.SharedPreferences r7 = ub.b.c(r1, r9)
            boolean r7 = r7.getBoolean(r8, r0)
            e9.s r0 = new e9.s
            r0.<init>(r1)
            boolean r8 = r0.b(r11)
            if (r7 != 0) goto L3de
            if (r8 != 0) goto L3de
            goto L61d
        L3de:
            java.lang.Object r9 = e9.q.f(r2)
            if (r9 == 0) goto L61d
            ng.j r11 = tf.l.k0(r2)
            e9.m r14 = e9.m.f2444h
            ng.i r15 = new ng.i
            r13 = 1
            r15.<init>(r11, r13, r14)
            e9.h r11 = new e9.h
            r14 = 2
            r11.<init>(r14)
            ng.t r11 = ng.m.W(r15, r11)
            ng.j r14 = r11.f9459a
            java.util.Iterator r14 = r14.iterator()
        L400:
            boolean r15 = r14.hasNext()
            java.lang.String r12 = "@im.chatroom"
            java.lang.String r13 = "@chatroom"
            if (r15 == 0) goto L42d
            fg.l r15 = r11.f9460b
            r18 = r2
            java.lang.Object r2 = r14.next()
            java.lang.Object r2 = r15.invoke(r2)
            r15 = r2
            java.lang.String r15 = (java.lang.String) r15
            r19 = r2
            r2 = 0
            boolean r20 = og.t.W(r15, r13, r2)
            if (r20 != 0) goto L431
            boolean r15 = og.t.W(r15, r12, r2)
            if (r15 == 0) goto L429
            goto L431
        L429:
            r2 = r18
            r12 = 0
            goto L400
        L42d:
            r18 = r2
            r19 = 0
        L431:
            java.lang.String r19 = (java.lang.String) r19
            if (r19 == 0) goto L439
        L435:
            r2 = r19
            r5 = 0
            goto L442
        L439:
            java.lang.String[] r2 = new java.lang.String[]{r6, r5}
            java.lang.String r19 = e9.q.w(r9, r2)
            goto L435
        L442:
            boolean r6 = og.t.W(r2, r13, r5)
            if (r6 != 0) goto L44e
            boolean r6 = og.t.W(r2, r12, r5)
            if (r6 == 0) goto L61d
        L44e:
            if (r7 == 0) goto L458
            boolean r5 = oh.h.i(r1, r2)
            if (r5 == 0) goto L458
            r5 = 1
            goto L459
        L458:
            r5 = 0
        L459:
            if (r8 == 0) goto L460
            e9.c r0 = r0.a(r2)
            goto L461
        L460:
            r0 = 0
        L461:
            if (r0 == 0) goto L478
            boolean r6 = r0.f2395f
            if (r6 == 0) goto L475
            boolean r6 = r0.f2393d
            if (r6 == 0) goto L475
            boolean r6 = r0.f2409t
            if (r6 != 0) goto L473
            boolean r0 = r0.f2410u
            if (r0 == 0) goto L475
        L473:
            r13 = 1
            goto L476
        L475:
            r13 = 0
        L476:
            r0 = r13
            goto L479
        L478:
            r0 = 0
        L479:
            if (r5 != 0) goto L47f
            if (r0 != 0) goto L47f
            goto L61d
        L47f:
            java.lang.Class r6 = r9.getClass()
            java.util.List r6 = e9.q.j(r6)
            dg.n r7 = new dg.n
            r8 = 6
            r7.<init>(r6, r8)
            e9.h r6 = new e9.h
            r11 = 3
            r6.<init>(r11)
            ng.i r11 = new ng.i
            r13 = 1
            r11.<init>(r7, r13, r6)
            c9.k1 r6 = new c9.k1
            r6.<init>(r9, r8)
            ng.i r6 = ng.m.X(r11, r6)
            java.util.List r6 = ng.m.b0(r6)
            java.util.Iterator r7 = r6.iterator()
        L4aa:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L4c9
            java.lang.Object r11 = r7.next()
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r14 = "<msgsource"
            r13 = 1
            boolean r14 = og.m.h0(r12, r14, r13)
            if (r14 != 0) goto L4ca
            java.lang.String r14 = "atuserlist"
            boolean r12 = og.m.h0(r12, r14, r13)
            if (r12 == 0) goto L4aa
            goto L4ca
        L4c9:
            r11 = 0
        L4ca:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L4cf
            r11 = r10
        L4cf:
            java.lang.String r7 = "field_content"
            java.lang.String r12 = "content"
            java.lang.String[] r7 = new java.lang.String[]{r7, r12}
            r12 = 0
        L4d8:
            r15 = 2
            if (r12 < r15) goto L4dd
            r14 = r10
            goto L4f3
        L4dd:
            r14 = r7[r12]
            java.lang.Object r14 = h.Hchat.utils.KavaReflector.readField(r9, r14)
            boolean r15 = r14 instanceof java.lang.String
            if (r15 == 0) goto L4ea
            java.lang.String r14 = (java.lang.String) r14
            goto L4eb
        L4ea:
            r14 = 0
        L4eb:
            if (r14 == 0) goto L614
            int r15 = r14.length()
            if (r15 <= 0) goto L614
        L4f3:
            ng.j r7 = tf.l.k0(r18)
            e9.m r12 = e9.m.f2445i
            ng.i r15 = new ng.i
            r13 = 1
            r15.<init>(r7, r13, r12)
            dg.n r7 = new dg.n
            r7.<init>(r6, r8)
            dg.j r6 = ng.m.Y(r15, r7)
            java.util.List r6 = ng.m.b0(r6)
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L514
        L512:
            r7 = 0
            goto L52e
        L514:
            java.util.Iterator r7 = r6.iterator()
        L518:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L512
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r12 = "announcement@all"
            r13 = 1
            boolean r8 = og.m.h0(r8, r12, r13)
            if (r8 == 0) goto L518
            r7 = 1
        L52e:
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto L536
        L534:
            r6 = 0
            goto L550
        L536:
            java.util.Iterator r6 = r6.iterator()
        L53a:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L534
            java.lang.Object r8 = r6.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r12 = "notify@all"
            r13 = 1
            boolean r8 = og.m.h0(r8, r12, r13)
            if (r8 == 0) goto L53a
            r6 = 1
        L550:
            java.util.concurrent.ConcurrentHashMap r8 = t8.b.f13089a
            g8.a r8 = h.Hchat.hooks.api.core.WeChatApis.account()
            if (r8 == 0) goto L55d
            java.lang.String r8 = r8.c()
            goto L55e
        L55d:
            r8 = 0
        L55e:
            if (r8 != 0) goto L561
            r8 = r10
        L561:
            l8.d r12 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r12.getClass()
            l8.c r8 = l8.d.c(r11, r14, r8)
            l8.c r12 = l8.c.f7901i
            if (r8 != r12) goto L570
            r15 = 1
            goto L571
        L570:
            r15 = 0
        L571:
            if (r7 == 0) goto L576
            l8.c r6 = l8.c.f7902j
            goto L591
        L576:
            if (r6 != 0) goto L590
            if (r15 == 0) goto L57b
            goto L590
        L57b:
            g8.a r6 = h.Hchat.hooks.api.core.WeChatApis.account()
            if (r6 == 0) goto L586
            java.lang.String r6 = r6.c()
            goto L587
        L586:
            r6 = 0
        L587:
            if (r6 != 0) goto L58a
            goto L58b
        L58a:
            r10 = r6
        L58b:
            l8.c r6 = l8.d.c(r11, r14, r10)
            goto L591
        L590:
            r6 = r12
        L591:
            ng.j r7 = tf.l.k0(r18)
            e9.m r8 = e9.m.f2446j
            ng.i r10 = new ng.i
            r13 = 1
            r10.<init>(r7, r13, r8)
            ng.h r7 = new ng.h
            r7.<init>(r10)
        L5a2:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L5bb
            java.lang.Object r8 = r7.next()
            r10 = r8
            java.lang.Number r10 = (java.lang.Number) r10
            long r10 = r10.longValue()
            r16 = 0
            int r10 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r10 <= 0) goto L5a2
            r7 = r8
            goto L5bc
        L5bb:
            r7 = 0
        L5bc:
            java.lang.Long r7 = (java.lang.Long) r7
            if (r7 == 0) goto L5c5
            long r3 = r7.longValue()
            goto L5cd
        L5c5:
            java.lang.String[] r3 = new java.lang.String[]{r4, r3}
            long r3 = e9.q.v(r9, r3)
        L5cd:
            if (r0 == 0) goto L60c
            r16 = 0
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 <= 0) goto L60c
            l8.c r0 = l8.c.f7899g
            if (r6 == r0) goto L60c
            l8.c r0 = l8.c.f7903k
            if (r6 != r0) goto L5de
            goto L60c
        L5de:
            long r7 = java.lang.System.currentTimeMillis()
            java.util.concurrent.ConcurrentHashMap r0 = e9.q.f2468i
            e9.j r9 = new e9.j
            r9.<init>(r2, r3)
            e9.i r10 = new e9.i
            r10.<init>(r6, r7)
            r0.put(r9, r10)
            int r9 = r0.size()
            r14 = 128(0x80, float:1.8E-43)
            if (r9 < r14) goto L60c
            java.util.Set r0 = r0.entrySet()
            ca.c r9 = new ca.c
            r13 = 1
            r9.<init>(r7, r13)
            be.i r7 = new be.i
            r8 = 7
            r7.<init>(r9, r8)
            r0.removeIf(r7)
        L60c:
            if (r5 == 0) goto L61d
            if (r6 != r12) goto L61d
            t8.b.c(r1, r2, r3)
            goto L61d
        L614:
            r13 = 1
            r14 = 128(0x80, float:1.8E-43)
            r16 = 0
            int r12 = r12 + 1
            goto L4d8
        L61d:
            return
        L61e:
            r0.getClass()
            java.lang.ThreadLocal r1 = c9.d2.f1146j
            java.lang.Object r1 = r1.get()
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L65f
            boolean r1 = c9.d2.q(r9)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L63b
            goto L63c
        L63b:
            r9 = 0
        L63c:
            if (r9 == 0) goto L65f
            java.lang.Object[] r1 = r0.args
            r15 = 2
            if (r1 == 0) goto L648
            java.lang.Object r7 = tf.l.C0(r15, r1)
            goto L649
        L648:
            r7 = 0
        L649:
            java.lang.String r1 = "conversationboxservice"
            boolean r1 = gg.l.a(r7, r1)
            if (r1 == 0) goto L65f
            java.lang.Object[] r1 = r0.args
            r20 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r1[r20] = r2
            java.lang.Object[] r0 = r0.args
            r0[r15] = r9
        L65f:
            return
    }
}
