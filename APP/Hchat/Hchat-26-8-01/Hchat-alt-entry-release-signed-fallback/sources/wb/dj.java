package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dj implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15729h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15730i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15731j;

    public /* synthetic */ dj(java.lang.Object r1, fg.p r2, r6.c r3, java.lang.String r4) {
            r0 = this;
            r4 = 10
            r0.f15728g = r4
            r0.<init>()
            r0.f15729h = r1
            r0.f15730i = r2
            r0.f15731j = r3
            return
    }

    public /* synthetic */ dj(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f15728g = r4
            r0.f15729h = r1
            r0.f15730i = r2
            r0.f15731j = r3
            r0.<init>()
            return
    }

    public /* synthetic */ dj(java.util.List r2, i0.a1 r3, i0.a1 r4) {
            r1 = this;
            r0 = 8
            r1.f15728g = r0
            r1.<init>()
            r1.f15731j = r2
            r1.f15729h = r3
            r1.f15730i = r4
            return
    }

    public /* synthetic */ dj(x8.s r2, fg.l r3, android.content.Context r4) {
            r1 = this;
            r0 = 2
            r1.f15728g = r0
            r1.<init>()
            r1.f15730i = r2
            r1.f15729h = r3
            r1.f15731j = r4
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            int r2 = r0.f15728g
            switch(r2) {
                case 0: goto L3f0;
                case 1: goto L3ae;
                case 2: goto L320;
                case 3: goto L2ec;
                case 4: goto L2bf;
                case 5: goto L297;
                case 6: goto L274;
                case 7: goto L224;
                case 8: goto L1f0;
                case 9: goto L163;
                case 10: goto L109;
                case 11: goto L6a;
                default: goto L9;
            }
        L9:
            java.lang.Object r2 = r0.f15729h
            xa.m r2 = (xa.m) r2
            java.lang.Object r3 = r0.f15730i
            xa.i r3 = (xa.i) r3
            java.lang.Object r4 = r0.f15731j
            java.util.List r4 = (java.util.List) r4
            java.util.Set r1 = (java.util.Set) r1
            r1.getClass()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        L25:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L59
            java.lang.Object r6 = r1.next()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.Object r6 = tf.m.w1(r6, r4)
            h.Hchat.hooks.api.model.ContactLabelBean r6 = (h.Hchat.hooks.api.model.ContactLabelBean) r6
            r7 = 0
            if (r6 == 0) goto L53
            java.lang.String r6 = r6.labelName
            if (r6 == 0) goto L53
            java.lang.CharSequence r6 = og.m.R0(r6)
            java.lang.String r6 = r6.toString()
            if (r6 == 0) goto L53
            int r8 = r6.length()
            if (r8 <= 0) goto L53
            r7 = r6
        L53:
            if (r7 == 0) goto L25
            r5.add(r7)
            goto L25
        L59:
            android.app.Activity r1 = r3.f21438a
            wb.xi r4 = new wb.xi
            r6 = 25
            r4.<init>(r3, r6, r5)
            java.lang.String r3 = "正在更新好友标签..."
            r2.g(r1, r3, r4)
            sf.n r1 = sf.n.f12433a
            return r1
        L6a:
            java.lang.Object r2 = r0.f15729h
            r4 = r2
            xa.m r4 = (xa.m) r4
            java.lang.Object r2 = r0.f15730i
            r7 = r2
            xa.i r7 = (xa.i) r7
            android.app.Activity r8 = r7.f21438a
            java.lang.Object r2 = r0.f15731j
            h.Hchat.hooks.api.model.WeChatContact r2 = (h.Hchat.hooks.api.model.WeChatContact) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 == 0) goto Lde
            r2 = 1
            if (r1 == r2) goto Lb3
            r2 = 2
            if (r1 == r2) goto L8a
            goto L106
        L8a:
            r4.getClass()
            boolean r1 = xa.m.a(r8)
            if (r1 != 0) goto L95
            goto L106
        L95:
            xa.e r15 = new xa.e
            r1 = 0
            r15.<init>(r4, r7, r1)
            k.s1 r1 = new k.s1
            r2 = 7
            r1.<init>(r2)
            r17 = 520(0x208, float:7.29E-43)
            java.lang.String r9 = "新建并添加标签"
            java.lang.String r10 = "标签创建后会自动添加给当前好友"
            r11 = 0
            java.lang.String r12 = "输入标签名称"
            r13 = 32
            r14 = 0
            r16 = r1
            wb.y2.c2(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L106
        Lb3:
            r4.getClass()
            boolean r1 = xa.m.a(r8)
            if (r1 != 0) goto Lbd
            goto L106
        Lbd:
            k.s1 r1 = new k.s1
            r2 = 7
            r1.<init>(r2)
            java.lang.String r2 = "设置好友标签"
            java.lang.String r3 = "正在载入好友标签..."
            wb.kv r5 = wb.y2.X1(r8, r1, r2, r3)
            java.lang.Thread r1 = new java.lang.Thread
            b9.c r3 = new b9.c
            r6 = r8
            r8 = 26
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.String r2 = "Hchat-QuickContactLabels"
            r1.<init>(r3, r2)
            r1.start()
            goto L106
        Lde:
            java.lang.String r11 = r2.remarkName
            r4.getClass()
            boolean r1 = xa.m.a(r8)
            if (r1 != 0) goto Lea
            goto L106
        Lea:
            xa.e r15 = new xa.e
            r1 = 1
            r15.<init>(r4, r7, r1)
            k.s1 r1 = new k.s1
            r2 = 7
            r1.<init>(r2)
            r17 = 512(0x200, float:7.17E-43)
            java.lang.String r9 = "修改好友备注"
            java.lang.String r10 = "留空并确定可清除备注"
            java.lang.String r12 = "输入好友备注"
            r13 = 100
            r14 = 1
            r16 = r1
            wb.y2.c2(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L106:
            sf.n r1 = sf.n.f12433a
            return r1
        L109:
            java.lang.Object r2 = r0.f15730i
            fg.p r2 = (fg.p) r2
            java.lang.Object r3 = r0.f15731j
            r6.c r3 = (r6.c) r3
            java.lang.Object r4 = r0.f15729h
            boolean r5 = r4 instanceof java.util.Collection
            if (r5 == 0) goto L122
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L121
            goto L122
        L121:
            r4 = 0
        L122:
            if (r4 == 0) goto L15d
            java.lang.Object r2 = r2.invoke(r4, r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r6.b r3 = r3.f11542b
            r6.b r5 = r6.b.f11539i
            if (r3 == r5) goto L15e
            y6.a r3 = y6.b.f22306a
            int r3 = r3.ordinal()
            if (r3 > 0) goto L15e
            java.lang.String r3 = s6.b.a(r4)
            r4 = 0
            java.lang.String r5 = ""
            java.lang.String r6 = " (Kotlin reflection is not available)"
            if (r3 == 0) goto L14e
            java.lang.String r3 = r3.toString()
            og.t.a0(r3, r6, r5, r4)
        L14e:
            if (r1 == 0) goto L157
            java.lang.String r1 = r1.toString()
            og.t.a0(r1, r6, r5, r4)
        L157:
            y6.a r1 = y6.b.f22306a
            r1.ordinal()
            goto L15e
        L15d:
            r2 = 1
        L15e:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            return r1
        L163:
            java.lang.Object r2 = r0.f15729h
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r0.f15730i
            androidx.lifecycle.q r3 = (androidx.lifecycle.q) r3
            java.lang.Object r4 = r0.f15731j
            r13 = r4
            i0.a1 r13 = (i0.a1) r13
            i0.a0 r1 = (i0.a0) r1
            r1.getClass()
            java.lang.String r1 = "sensor"
            java.lang.Object r1 = r2.getSystemService(r1)
            boolean r2 = r1 instanceof android.hardware.SensorManager
            r4 = 0
            if (r2 == 0) goto L183
            android.hardware.SensorManager r1 = (android.hardware.SensorManager) r1
            goto L184
        L183:
            r1 = r4
        L184:
            if (r1 == 0) goto L191
            r2 = 15
            android.hardware.Sensor r2 = r1.getDefaultSensor(r2)
            if (r2 != 0) goto L18f
            goto L191
        L18f:
            r4 = r2
            goto L199
        L191:
            if (r1 == 0) goto L199
            r2 = 11
            android.hardware.Sensor r4 = r1.getDefaultSensor(r2)
        L199:
            if (r1 == 0) goto L1e9
            if (r4 != 0) goto L19e
            goto L1e9
        L19e:
            r2 = 9
            float[] r6 = new float[r2]
            r2 = 3
            float[] r7 = new float[r2]
            gg.r r9 = new gg.r
            r9.<init>()
            gg.r r10 = new gg.r
            r10.<init>()
            gg.r r11 = new gg.r
            r11.<init>()
            gg.r r12 = new gg.r
            r12.<init>()
            gg.q r8 = new gg.q
            r8.<init>()
            gg.q r2 = new gg.q
            r2.<init>()
            wh.d r5 = new wh.d
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            wh.b r7 = new wh.b
            r6 = r2
            r9 = r4
            r10 = r8
            r8 = r5
            r5 = r7
            r7 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            r1 = r5
            r5 = r8
            r8 = r10
            androidx.lifecycle.s r2 = r3.f()
            r2.a(r1)
            r10 = r5
            wh.e r5 = new wh.e
            r9 = r7
            r11 = r8
            r7 = r1
            r8 = r6
            r6 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L1ef
        L1e9:
            i.j1 r5 = new i.j1
            r1 = 1
            r5.<init>(r1)
        L1ef:
            return r5
        L1f0:
            java.lang.Object r2 = r0.f15731j
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = r0.f15729h
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r0.f15730i
            i0.a1 r4 = (i0.a1) r4
            wb.iv r1 = (wb.iv) r1
            r1.getClass()
            r3.setValue(r1)
            wb.iv r3 = wb.iv.f16936m
            if (r1 != r3) goto L221
            java.lang.Object r1 = r4.getValue()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = og.m.t0(r1)
            if (r1 == 0) goto L221
            java.lang.Object r1 = tf.m.v1(r2)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L21e
            java.lang.String r1 = ""
        L21e:
            r4.setValue(r1)
        L221:
            sf.n r1 = sf.n.f12433a
            return r1
        L224:
            java.lang.Object r2 = r0.f15729h
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r0.f15730i
            i0.j1 r3 = (i0.j1) r3
            java.lang.Object r4 = r0.f15731j
            i0.j1 r4 = (i0.j1) r4
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Object r3 = r3.getValue()
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r1 = tf.m.w1(r1, r3)
            fb.c r1 = (fb.c) r1
            if (r1 == 0) goto L271
            java.lang.String r3 = r1.f3432b
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            boolean r5 = og.m.t0(r3)
            if (r5 == 0) goto L25f
            java.lang.String r1 = "当前消息没有可引用内容"
            r3 = 0
            android.widget.Toast r1 = android.widget.Toast.makeText(r2, r1, r3)
            r1.show()
            goto L271
        L25f:
            fb.a1 r2 = new fb.a1
            java.lang.String r5 = r1.f3431a
            r6 = 24000(0x5dc0, float:3.3631E-41)
            java.lang.String r3 = og.m.P0(r6, r3)
            long r6 = r1.f3443m
            r2.<init>(r6, r5, r3)
            r4.setValue(r2)
        L271:
            sf.n r1 = sf.n.f12433a
            return r1
        L274:
            java.lang.Object r2 = r0.f15729h
            ia.n r2 = (ia.n) r2
            java.lang.Object r3 = r0.f15730i
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r0.f15731j
            i0.a1 r4 = (i0.a1) r4
            i0.a0 r1 = (i0.a0) r1
            r1.getClass()
            wb.jp r1 = new wb.jp
            r5 = 23
            r1.<init>(r3, r5)
            r2.invoke(r1)
            ci.w r1 = new ci.w
            r3 = 10
            r1.<init>(r2, r3, r4)
            return r1
        L297:
            java.lang.Object r2 = r0.f15729h
            fb.d1 r2 = (fb.d1) r2
            java.lang.Object r3 = r0.f15730i
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r0.f15731j
            i0.a1 r4 = (i0.a1) r4
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.util.ArrayList r1 = wb.y2.Y(r3, r2, r1)
            if (r1 == 0) goto L2b9
            r3.setValue(r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r4.setValue(r1)
            r1 = 1
            goto L2ba
        L2b9:
            r1 = 0
        L2ba:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        L2bf:
            java.lang.Object r2 = r0.f15729h
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r0.f15730i
            fg.a r3 = (fg.a) r3
            java.lang.Object r4 = r0.f15731j
            fg.a r4 = (fg.a) r4
            r.h r1 = (r.h) r1
            r1.getClass()
            s0.d r5 = wb.p0.W4
            r6 = 0
            r7 = 3
            r.h.a(r1, r6, r5, r7)
            c9.h0 r5 = new c9.h0
            r8 = 7
            r5.<init>(r2, r3, r4, r8)
            s0.d r2 = new s0.d
            r3 = -646396665(0xffffffffd978c507, float:-4.3764018E15)
            r4 = 1
            r2.<init>(r3, r5, r4)
            r.h.a(r1, r6, r2, r7)
            sf.n r1 = sf.n.f12433a
            return r1
        L2ec:
            java.lang.Object r2 = r0.f15729h
            r3 = r2
            v8.a r3 = (v8.a) r3
            java.lang.Object r2 = r0.f15730i
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r4 = r0.f15731j
            i0.a1 r4 = (i0.a1) r4
            r10 = r1
            java.util.Set r10 = (java.util.Set) r10
            r10.getClass()
            r17 = 0
            r18 = 16255(0x3f7f, float:2.2778E-41)
            r1 = r4
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            v8.a r3 = v8.a.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18)
            r2.setValue(r3)
            wb.g r2 = wb.g.f16288i
            r1.setValue(r2)
            sf.n r1 = sf.n.f12433a
            return r1
        L320:
            java.lang.Object r2 = r0.f15730i
            r3 = r2
            x8.s r3 = (x8.s) r3
            java.lang.Object r2 = r0.f15729h
            fg.l r2 = (fg.l) r2
            java.lang.Object r4 = r0.f15731j
            r10 = r4
            android.content.Context r10 = (android.content.Context) r10
            java.util.List r1 = (java.util.List) r1
            r1.getClass()
            java.lang.String r4 = r3.f21346c
            java.util.ArrayList r4 = wb.ho.P4(r4)
            java.util.ArrayList r4 = tf.m.F1(r4, r1)
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = tf.n.e1(r4)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L34a:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L35a
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            j8.b.r(r6, r5)
            goto L34a
        L35a:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r5.iterator()
        L363:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L37a
            java.lang.Object r6 = r5.next()
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            int r7 = r7.length()
            if (r7 <= 0) goto L363
            r4.add(r6)
            goto L363
        L37a:
            java.util.Set r4 = tf.m.T1(r4)
            java.util.List r11 = tf.m.P1(r4)
            boolean r4 = r11.isEmpty()
            if (r4 != 0) goto L3ab
            r15 = 0
            r16 = 62
            java.lang.String r12 = ";;;"
            r13 = 0
            r14 = 0
            java.lang.String r5 = tf.m.A1(r11, r12, r13, r14, r15, r16)
            r8 = 0
            r9 = 27
            r4 = 0
            r6 = 0
            x8.s r3 = x8.s.a(r3, r4, r5, r6, r8, r9)
            r2.invoke(r3)
            int r1 = r1.size()
            java.lang.String r2 = "已选择 "
            java.lang.String r3 = " 个文件"
            wb.en.o(r2, r1, r3, r10, r4)
        L3ab:
            sf.n r1 = sf.n.f12433a
            return r1
        L3ae:
            java.lang.Object r2 = r0.f15729h
            fg.a r2 = (fg.a) r2
            java.lang.Object r3 = r0.f15730i
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r4 = r0.f15731j
            ba.n r4 = (ba.n) r4
            ba.b r1 = (ba.b) r1
            r1.getClass()
            int r1 = r1.ordinal()
            r5 = 0
            if (r1 == 0) goto L3db
            r2 = 1
            if (r1 == r2) goto L3ed
            r2 = 2
            if (r1 != r2) goto L3d6
            java.lang.String r1 = "气泡图片无效或读取失败"
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r5)
            r1.show()
            goto L3ed
        L3d6:
            okio.a.k()
            r1 = 0
            goto L3ef
        L3db:
            r2.invoke()
            java.lang.String r1 = r4.f615h
            java.lang.String r2 = "已更新"
            java.lang.String r1 = r1.concat(r2)
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r5)
            r1.show()
        L3ed:
            sf.n r1 = sf.n.f12433a
        L3ef:
            return r1
        L3f0:
            java.lang.Object r2 = r0.f15729h
            fg.l r2 = (fg.l) r2
            java.lang.Object r3 = r0.f15730i
            db.c r3 = (db.c) r3
            java.lang.Object r4 = r0.f15731j
            java.util.List r4 = (java.util.List) r4
            java.lang.Long r1 = (java.lang.Long) r1
            r1.getClass()
            java.util.ArrayList r1 = tf.m.G1(r4, r1)
            db.c r1 = wb.ho.p7(r3, r1)
            r2.invoke(r1)
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
