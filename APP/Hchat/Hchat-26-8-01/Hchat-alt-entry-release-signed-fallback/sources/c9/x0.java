package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x0 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f1431h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f1432i;

    public /* synthetic */ x0(int r1, i0.a1 r2, i0.a1 r3) {
            r0 = this;
            r0.f1430g = r1
            r0.f1431h = r2
            r0.f1432i = r3
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r15 = this;
            int r0 = r15.f1430g
            switch(r0) {
                case 0: goto L332;
                case 1: goto L322;
                case 2: goto L312;
                case 3: goto L302;
                case 4: goto L2f2;
                case 5: goto L2e2;
                case 6: goto L2d2;
                case 7: goto L2c2;
                case 8: goto L2b2;
                case 9: goto L2a2;
                case 10: goto L259;
                case 11: goto L249;
                case 12: goto L239;
                case 13: goto L229;
                case 14: goto L219;
                case 15: goto L209;
                case 16: goto L1f9;
                case 17: goto L1e9;
                case 18: goto L1d9;
                case 19: goto L1c9;
                case 20: goto L19f;
                case 21: goto L17b;
                case 22: goto L158;
                case 23: goto L12a;
                case 24: goto L107;
                case 25: goto Lc5;
                case 26: goto L6e;
                case 27: goto L41;
                case 28: goto L34;
                default: goto L5;
            }
        L5:
            wb.oo r0 = new wb.oo
            wb.v0 r1 = new wb.v0
            i0.a1 r2 = r15.f1431h
            java.lang.Object r2 = r2.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.String r5 = wb.ho.D5(r2)
            wb.jk r6 = new wb.jk
            r2 = 16
            r6.<init>(r2)
            r7 = 1
            r8 = 192(0xc0, float:2.69E-43)
            java.lang.String r2 = "选择转发好友"
            wb.u0 r3 = wb.u0.f19344g
            r4 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.<init>(r1)
            i0.a1 r1 = r15.f1432i
            r1.setValue(r0)
        L31:
            sf.n r0 = sf.n.f12433a
            return r0
        L34:
            i0.a1 r0 = r15.f1431h
            java.lang.String r1 = ""
            r0.setValue(r1)
            i0.a1 r0 = r15.f1432i
            r0.setValue(r1)
            goto L31
        L41:
            wb.uo r0 = new wb.uo
            wb.v0 r1 = new wb.v0
            i0.a1 r2 = r15.f1431h
            java.lang.Object r2 = r2.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.String r5 = wb.ho.D5(r2)
            w0.l r6 = new w0.l
            r2 = 8
            r6.<init>(r2)
            r7 = 1
            r8 = 192(0xc0, float:2.69E-43)
            java.lang.String r2 = "选择朋友圈提醒好友"
            wb.u0 r3 = wb.u0.f19344g
            r4 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.<init>(r1)
            i0.a1 r1 = r15.f1432i
            r1.setValue(r0)
            goto L31
        L6e:
            wb.d6 r0 = new wb.d6
            i0.a1 r1 = r15.f1431h
            java.lang.Object r2 = r1.getValue()
            java.util.List r2 = (java.util.List) r2
            int r2 = r2.size()
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            int r1 = r1.size()
            int r1 = r1 + 1
            aa.h r3 = new aa.h
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = "_"
            r6.append(r4)
            r6.append(r1)
            java.lang.String r4 = r6.toString()
            java.lang.String r5 = "模板 "
            java.lang.String r5 = eh.a.l(r1, r5)
            tf.v r13 = tf.v.f13169g
            java.lang.String r14 = ""
            r6 = 1
            r7 = 0
            java.lang.String r8 = ""
            java.lang.String r9 = ""
            java.lang.String r10 = ""
            java.lang.String r11 = ""
            r12 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = 0
            r0.<init>(r2, r3, r1)
            i0.a1 r1 = r15.f1432i
            r1.setValue(r0)
            goto L31
        Lc5:
            wb.q3 r0 = new wb.q3
            k9.j r1 = new k9.j
            long r2 = java.lang.System.currentTimeMillis()
            i0.a1 r4 = r15.f1431h
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            int r4 = r4.size()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "shortcut_"
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = "_"
            r5.append(r2)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            java.lang.String r6 = ""
            r8 = 1
            java.lang.String r3 = ""
            java.lang.String r4 = "activity"
            java.lang.String r5 = ""
            r7 = r6
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r2 = 0
            r0.<init>(r2, r1)
            i0.a1 r1 = r15.f1432i
            r1.setValue(r0)
            goto L31
        L107:
            wb.v0 r1 = new wb.v0
            i0.a1 r0 = r15.f1431h
            java.lang.Object r2 = r0.getValue()
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            wb.oh r6 = new wb.oh
            r2 = 4
            r6.<init>(r0, r2)
            r7 = 0
            r8 = 224(0xe0, float:3.14E-43)
            java.lang.String r2 = "选择系统消息群聊"
            wb.u0 r3 = wb.u0.f19345h
            r4 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            i0.a1 r0 = r15.f1432i
            r0.setValue(r1)
            goto L31
        L12a:
            wb.a r0 = new wb.a
            wb.v0 r1 = new wb.v0
            i0.a1 r2 = r15.f1431h
            java.lang.Object r2 = r2.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.String r5 = wb.ho.D5(r2)
            wb.pb r6 = new wb.pb
            r2 = 17
            r6.<init>(r2)
            r7 = 0
            r8 = 224(0xe0, float:3.14E-43)
            java.lang.String r2 = "选择屏蔽群聊"
            wb.u0 r3 = wb.u0.f19345h
            r4 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.<init>(r1)
            i0.a1 r1 = r15.f1432i
            r1.setValue(r0)
            goto L31
        L158:
            wb.v0 r1 = new wb.v0
            i0.a1 r0 = r15.f1431h
            java.lang.Object r2 = r0.getValue()
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            wb.oh r6 = new wb.oh
            r2 = 6
            r6.<init>(r0, r2)
            r7 = 1
            r8 = 192(0xc0, float:2.69E-43)
            java.lang.String r2 = "选择黑名单"
            wb.u0 r3 = wb.u0.f19346i
            r4 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            i0.a1 r0 = r15.f1432i
            r0.setValue(r1)
            goto L31
        L17b:
            wb.v0 r1 = new wb.v0
            i0.a1 r0 = r15.f1431h
            java.lang.Object r2 = r0.getValue()
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            wb.bi r6 = new wb.bi
            r2 = 8
            r6.<init>(r0, r2)
            r7 = 1
            r8 = 192(0xc0, float:2.69E-43)
            java.lang.String r2 = "选择白名单"
            wb.u0 r3 = wb.u0.f19346i
            r4 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            i0.a1 r0 = r15.f1432i
            r0.setValue(r1)
            goto L31
        L19f:
            wb.i4 r0 = new wb.i4
            wb.v0 r1 = new wb.v0
            i0.a1 r2 = r15.f1431h
            java.lang.Object r3 = r2.getValue()
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            wb.tg r6 = new wb.tg
            r3 = 22
            r6.<init>(r2, r3)
            r7 = 0
            r8 = 224(0xe0, float:3.14E-43)
            java.lang.String r2 = "选择系统消息群聊"
            wb.u0 r3 = wb.u0.f19345h
            r4 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r2 = 1
            r0.<init>(r1, r2)
            i0.a1 r1 = r15.f1432i
            r1.setValue(r0)
            goto L31
        L1c9:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            i0.a1 r1 = r15.f1431h
            r1.setValue(r0)
            tf.v r0 = tf.v.f13169g
            i0.a1 r1 = r15.f1432i
            r1.setValue(r0)
            goto L31
        L1d9:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            i0.a1 r1 = r15.f1431h
            r1.setValue(r0)
            tf.v r0 = tf.v.f13169g
            i0.a1 r1 = r15.f1432i
            r1.setValue(r0)
            goto L31
        L1e9:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            i0.a1 r1 = r15.f1431h
            r1.setValue(r0)
            tf.v r0 = tf.v.f13169g
            i0.a1 r1 = r15.f1432i
            r1.setValue(r0)
            goto L31
        L1f9:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            i0.a1 r1 = r15.f1431h
            r1.setValue(r0)
            tf.v r0 = tf.v.f13169g
            i0.a1 r1 = r15.f1432i
            r1.setValue(r0)
            goto L31
        L209:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            i0.a1 r1 = r15.f1431h
            r1.setValue(r0)
            tf.v r0 = tf.v.f13169g
            i0.a1 r1 = r15.f1432i
            r1.setValue(r0)
            goto L31
        L219:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            i0.a1 r1 = r15.f1431h
            r1.setValue(r0)
            tf.v r0 = tf.v.f13169g
            i0.a1 r1 = r15.f1432i
            r1.setValue(r0)
            goto L31
        L229:
            tf.v r0 = tf.v.f13169g
            i0.a1 r1 = r15.f1431h
            r1.setValue(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            i0.a1 r1 = r15.f1432i
            r1.setValue(r0)
            goto L31
        L239:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            i0.a1 r1 = r15.f1431h
            r1.setValue(r0)
            tf.v r0 = tf.v.f13169g
            i0.a1 r1 = r15.f1432i
            r1.setValue(r0)
            goto L31
        L249:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            i0.a1 r1 = r15.f1431h
            r1.setValue(r0)
            tf.v r0 = tf.v.f13169g
            i0.a1 r1 = r15.f1432i
            r1.setValue(r0)
            goto L31
        L259:
            i0.a1 r0 = r15.f1431h
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            int r1 = r1.size()
            java.lang.Object r2 = r0.getValue()
            java.util.List r2 = (java.util.List) r2
            int r3 = r1 + 1
            na.h r4 = new na.h
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            java.lang.String r5 = "_"
            r7.append(r5)
            r7.append(r3)
            java.lang.String r5 = r7.toString()
            r8 = 0
            r10 = 0
            r6 = 1
            java.lang.String r7 = "谢谢老板"
            r4.<init>(r5, r6, r7, r8, r10)
            java.util.ArrayList r2 = tf.m.G1(r2, r4)
            r0.setValue(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            i0.a1 r1 = r15.f1432i
            r1.setValue(r0)
            goto L31
        L2a2:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            i0.a1 r1 = r15.f1431h
            r1.setValue(r0)
            tf.v r0 = tf.v.f13169g
            i0.a1 r1 = r15.f1432i
            r1.setValue(r0)
            goto L31
        L2b2:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            i0.a1 r1 = r15.f1431h
            r1.setValue(r0)
            tf.v r0 = tf.v.f13169g
            i0.a1 r1 = r15.f1432i
            r1.setValue(r0)
            goto L31
        L2c2:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            i0.a1 r1 = r15.f1431h
            r1.setValue(r0)
            tf.v r0 = tf.v.f13169g
            i0.a1 r1 = r15.f1432i
            r1.setValue(r0)
            goto L31
        L2d2:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            i0.a1 r1 = r15.f1431h
            r1.setValue(r0)
            tf.v r0 = tf.v.f13169g
            i0.a1 r1 = r15.f1432i
            r1.setValue(r0)
            goto L31
        L2e2:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            i0.a1 r1 = r15.f1431h
            r1.setValue(r0)
            tf.v r0 = tf.v.f13169g
            i0.a1 r1 = r15.f1432i
            r1.setValue(r0)
            goto L31
        L2f2:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            i0.a1 r1 = r15.f1431h
            r1.setValue(r0)
            tf.v r0 = tf.v.f13169g
            i0.a1 r1 = r15.f1432i
            r1.setValue(r0)
            goto L31
        L302:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            i0.a1 r1 = r15.f1431h
            r1.setValue(r0)
            tf.v r0 = tf.v.f13169g
            i0.a1 r1 = r15.f1432i
            r1.setValue(r0)
            goto L31
        L312:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            i0.a1 r1 = r15.f1431h
            r1.setValue(r0)
            tf.v r0 = tf.v.f13169g
            i0.a1 r1 = r15.f1432i
            r1.setValue(r0)
            goto L31
        L322:
            tf.v r0 = tf.v.f13169g
            i0.a1 r1 = r15.f1431h
            r1.setValue(r0)
            c9.e1 r0 = c9.e1.f1173j
            i0.a1 r1 = r15.f1432i
            r1.setValue(r0)
            goto L31
        L332:
            i0.a1 r0 = r15.f1431h
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L347
            c9.e1 r0 = c9.e1.f1174k
            i0.a1 r1 = r15.f1432i
            r1.setValue(r0)
        L347:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
