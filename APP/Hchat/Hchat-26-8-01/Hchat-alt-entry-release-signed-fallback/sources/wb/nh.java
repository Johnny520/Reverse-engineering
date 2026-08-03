package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nh implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17906h;

    public /* synthetic */ nh(i0.a1 r1, int r2) {
            r0 = this;
            r0.f17905g = r2
            r0.f17906h = r1
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r14, java.lang.Object r15) {
            r13 = this;
            int r0 = r13.f17905g
            r1 = 2
            r2 = 0
            r3 = 1
            switch(r0) {
                case 0: goto L436;
                case 1: goto L3f6;
                case 2: goto L3ce;
                case 3: goto L388;
                case 4: goto L370;
                case 5: goto L359;
                case 6: goto L341;
                case 7: goto L329;
                case 8: goto L311;
                case 9: goto L2f9;
                case 10: goto La8;
                case 11: goto L90;
                case 12: goto L79;
                case 13: goto L61;
                case 14: goto L49;
                case 15: goto L3b;
                default: goto L8;
            }
        L8:
            i0.a1 r0 = r13.f17906h
            i0.h0 r14 = (i0.h0) r14
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            r4 = r15 & 3
            if (r4 == r1) goto L18
            r1 = r3
            goto L19
        L18:
            r1 = r2
        L19:
            r15 = r15 & r3
            boolean r15 = r14.S(r15, r1)
            if (r15 == 0) goto L35
            java.lang.Object r15 = r0.getValue()
            java.lang.String r15 = (java.lang.String) r15
            boolean r15 = og.m.t0(r15)
            if (r15 == 0) goto L2f
            java.lang.String r15 = "暂无在线插件"
            goto L31
        L2f:
            java.lang.String r15 = "没有匹配的在线插件"
        L31:
            wb.ho.s0(r15, r14, r2)
            goto L38
        L35:
            r14.V()
        L38:
            sf.n r14 = sf.n.f12433a
            return r14
        L3b:
            i0.a1 r0 = r13.f17906h
            java.util.List r14 = (java.util.List) r14
            java.lang.Throwable r15 = (java.lang.Throwable) r15
            og.k r15 = wb.ho.f16633a
            r0.setValue(r14)
            sf.n r14 = sf.n.f12433a
            return r14
        L49:
            i0.a1 r0 = r13.f17906h
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            na.j r15 = (na.j) r15
            r15.getClass()
            wb.uq r1 = new wb.uq
            r1.<init>(r14, r15, r3)
            r0.setValue(r1)
            sf.n r14 = sf.n.f12433a
            return r14
        L61:
            i0.a1 r0 = r13.f17906h
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            na.i r15 = (na.i) r15
            r15.getClass()
            wb.hq r1 = new wb.hq
            r1.<init>(r14, r15, r3)
            r0.setValue(r1)
            sf.n r14 = sf.n.f12433a
            return r14
        L79:
            i0.a1 r0 = r13.f17906h
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r15 = (java.lang.String) r15
            r14.getClass()
            r15.getClass()
            sf.e r1 = new sf.e
            r1.<init>(r14, r15)
            r0.setValue(r1)
            sf.n r14 = sf.n.f12433a
            return r14
        L90:
            i0.a1 r0 = r13.f17906h
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            o9.q r15 = (o9.q) r15
            r15.getClass()
            wb.c4 r1 = new wb.c4
            r1.<init>(r14, r15, r3)
            r0.setValue(r1)
            sf.n r14 = sf.n.f12433a
            return r14
        La8:
            i0.a1 r1 = r13.f17906h
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r7 = r14.booleanValue()
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r8 = r15.intValue()
            java.lang.Object r14 = r1.getValue()
            java.util.List r14 = (java.util.List) r14
            java.util.ArrayList r15 = new java.util.ArrayList
            int r0 = tf.n.e1(r14)
            r15.<init>(r0)
            java.util.Iterator r14 = r14.iterator()
        Lc9:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto Ldb
            java.lang.Object r0 = r14.next()
            wb.sv r0 = (wb.sv) r0
            java.lang.String r0 = r0.f19147a
            r15.add(r0)
            goto Lc9
        Ldb:
            rb.k r5 = fb.v0.f3834a
            if (r5 == 0) goto L2ec
            boolean r14 = r5.f11915l
            if (r14 == 0) goto L2e4
            rb.c r14 = r5.f11914k
            if (r14 != 0) goto Le9
            goto L2e4
        Le9:
            java.util.ArrayList r14 = new java.util.ArrayList
            int r0 = tf.n.e1(r15)
            r14.<init>(r0)
            java.util.Iterator r15 = r15.iterator()
        Lf6:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L106
            java.lang.Object r0 = r15.next()
            java.lang.String r0 = (java.lang.String) r0
            j8.b.r(r0, r14)
            goto Lf6
        L106:
            java.util.Set r14 = tf.m.T1(r14)
            java.util.List r14 = tf.m.P1(r14)
            boolean r15 = r14.isEmpty()
            if (r15 == 0) goto L11d
            rb.a r14 = new rb.a
            java.lang.String r15 = "请选择要删除的好友"
            r14.<init>(r2, r15)
            goto L2f3
        L11d:
            boolean r15 = r14.isEmpty()
            if (r15 == 0) goto L124
            goto L143
        L124:
            java.util.Iterator r15 = r14.iterator()
        L128:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L143
            java.lang.Object r0 = r15.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = rb.k.g(r0)
            if (r0 != 0) goto L128
            rb.a r14 = new rb.a
            java.lang.String r15 = "选择中包含无效联系人，请重新选择"
            r14.<init>(r2, r15)
            goto L2f3
        L143:
            java.lang.Object r15 = r5.f11907d
            monitor-enter(r15)
            boolean r0 = r5.f11916m     // Catch: java.lang.Throwable -> L154
            if (r0 == 0) goto L158
            rb.a r14 = new rb.a     // Catch: java.lang.Throwable -> L154
            java.lang.String r0 = "请先暂停好友检测"
            r14.<init>(r2, r0)     // Catch: java.lang.Throwable -> L154
        L151:
            monitor-exit(r15)
            goto L2f3
        L154:
            r0 = move-exception
            r14 = r0
            goto L2e2
        L158:
            boolean r0 = r5.f11922s     // Catch: java.lang.Throwable -> L154
            if (r0 == 0) goto L164
            rb.a r14 = new rb.a     // Catch: java.lang.Throwable -> L154
            java.lang.String r0 = "批量删除正在运行"
            r14.<init>(r2, r0)     // Catch: java.lang.Throwable -> L154
            goto L151
        L164:
            monitor-exit(r15)
            g8.i r15 = h.Hchat.hooks.api.core.WeChatApis.contacts()     // Catch: java.lang.Throwable -> L177
            r0 = 0
            if (r15 == 0) goto L172
            java.lang.String r4 = "SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE (r.encryptUsername!='' OR r.username=(SELECT value FROM userinfo WHERE id=2)) AND r.verifyFlag=0 AND (r.type & 1)!=0 AND (r.type & 8)=0 AND (r.type & 32)=0 AND r.username NOT LIKE '%chatroom'"
            java.util.ArrayList r0 = r15.U(r4, r0)     // Catch: java.lang.Throwable -> L177
        L172:
            if (r0 != 0) goto L17e
            tf.t r0 = tf.t.f13167g     // Catch: java.lang.Throwable -> L177
            goto L17e
        L177:
            r0 = move-exception
            r15 = r0
            sf.f r0 = new sf.f
            r0.<init>(r15)
        L17e:
            java.lang.Throwable r15 = sf.g.b(r0)
            if (r15 != 0) goto L2d3
            java.util.List r0 = (java.util.List) r0
            int r15 = tf.n.e1(r0)
            int r15 = tf.y.a0(r15)
            r4 = 16
            if (r15 >= r4) goto L193
            r15 = r4
        L193:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r15)
            java.util.Iterator r15 = r0.iterator()
        L19c:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L1af
            java.lang.Object r0 = r15.next()
            r6 = r0
            h.Hchat.hooks.api.model.WeChatContact r6 = (h.Hchat.hooks.api.model.WeChatContact) r6
            java.lang.String r6 = r6.wxId
            r4.put(r6, r0)
            goto L19c
        L1af:
            boolean r15 = r14.isEmpty()
            if (r15 == 0) goto L1b6
            goto L1d5
        L1b6:
            java.util.Iterator r15 = r14.iterator()
        L1ba:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L1d5
            java.lang.Object r0 = r15.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r4.containsKey(r0)
            if (r0 != 0) goto L1ba
            rb.a r14 = new rb.a
            java.lang.String r15 = "部分好友已不在联系人列表，请重新选择"
            r14.<init>(r2, r15)
            goto L2f3
        L1d5:
            java.util.ArrayList r6 = new java.util.ArrayList
            int r15 = tf.n.e1(r14)
            r6.<init>(r15)
            java.util.Iterator r14 = r14.iterator()
        L1e2:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L208
            java.lang.Object r15 = r14.next()
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r0 = tf.y.Y(r15, r4)
            h.Hchat.hooks.api.model.WeChatContact r0 = (h.Hchat.hooks.api.model.WeChatContact) r0
            java.lang.String r0 = r0.displayName()
            boolean r9 = og.m.t0(r0)
            if (r9 == 0) goto L1ff
            r0 = r15
        L1ff:
            rb.i r9 = new rb.i
            r9.<init>(r15, r0)
            r6.add(r9)
            goto L1e2
        L208:
            java.lang.Object r14 = r5.f11907d
            monitor-enter(r14)
            boolean r15 = r5.f11916m     // Catch: java.lang.Throwable -> L21a
            if (r15 == 0) goto L21e
            rb.a r15 = new rb.a     // Catch: java.lang.Throwable -> L21a
            java.lang.String r0 = "请先暂停好友检测"
            r15.<init>(r2, r0)     // Catch: java.lang.Throwable -> L21a
        L216:
            monitor-exit(r14)
            r14 = r15
            goto L2f3
        L21a:
            r0 = move-exception
            r15 = r0
            goto L2d1
        L21e:
            boolean r15 = r5.f11922s     // Catch: java.lang.Throwable -> L21a
            if (r15 == 0) goto L22a
            rb.a r15 = new rb.a     // Catch: java.lang.Throwable -> L21a
            java.lang.String r0 = "批量删除正在运行"
            r15.<init>(r2, r0)     // Catch: java.lang.Throwable -> L21a
            goto L216
        L22a:
            long r9 = r5.f11921r     // Catch: java.lang.Throwable -> L21a
            r11 = 1
            long r9 = r9 + r11
            r5.f11921r = r9     // Catch: java.lang.Throwable -> L21a
            r5.f11922s = r3     // Catch: java.lang.Throwable -> L21a
            int r15 = r6.size()     // Catch: java.lang.Throwable -> L21a
            r5.f11923t = r15     // Catch: java.lang.Throwable -> L21a
            r5.f11924u = r2     // Catch: java.lang.Throwable -> L21a
            r5.f11925v = r2     // Catch: java.lang.Throwable -> L21a
            r5.f11926w = r2     // Catch: java.lang.Throwable -> L21a
            java.lang.String r15 = ""
            r5.f11918o = r15     // Catch: java.lang.Throwable -> L21a
            int r15 = r6.size()     // Catch: java.lang.Throwable -> L21a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21a
            r0.<init>()     // Catch: java.lang.Throwable -> L21a
            java.lang.String r4 = "准备批量删除 "
            r0.append(r4)     // Catch: java.lang.Throwable -> L21a
            r0.append(r15)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r15 = " 位好友"
            r0.append(r15)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r15 = r0.toString()     // Catch: java.lang.Throwable -> L21a
            r5.f11917n = r15     // Catch: java.lang.Throwable -> L21a
            int r15 = r6.size()     // Catch: java.lang.Throwable -> L21a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21a
            r0.<init>()     // Catch: java.lang.Throwable -> L21a
            java.lang.String r4 = "开始批量删除 "
            r0.append(r4)     // Catch: java.lang.Throwable -> L21a
            r0.append(r15)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r15 = " 位好友"
            r0.append(r15)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r15 = r0.toString()     // Catch: java.lang.Throwable -> L21a
            r5.b(r15)     // Catch: java.lang.Throwable -> L21a
            long r9 = r5.f11921r     // Catch: java.lang.Throwable -> L21a
            monitor-exit(r14)
            java.util.concurrent.ScheduledThreadPoolExecutor r14 = r5.f11909f     // Catch: java.lang.Throwable -> L28c
            rb.f r4 = new rb.f     // Catch: java.lang.Throwable -> L28c
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L28c
            r14.execute(r4)     // Catch: java.lang.Throwable -> L28c
            sf.n r14 = sf.n.f12433a     // Catch: java.lang.Throwable -> L28c
            goto L294
        L28c:
            r0 = move-exception
            r14 = r0
            sf.f r15 = new sf.f
            r15.<init>(r14)
            r14 = r15
        L294:
            boolean r14 = r14 instanceof sf.f
            if (r14 == 0) goto L2bf
            java.lang.Object r14 = r5.f11907d
            monitor-enter(r14)
            boolean r15 = r5.d(r9)     // Catch: java.lang.Throwable -> L2b1
            if (r15 == 0) goto L2b4
            r5.f11922s = r2     // Catch: java.lang.Throwable -> L2b1
            java.lang.String r15 = ""
            r5.f11918o = r15     // Catch: java.lang.Throwable -> L2b1
            java.lang.String r15 = "批量删除启动失败"
            r5.f11917n = r15     // Catch: java.lang.Throwable -> L2b1
            java.lang.String r15 = "批量删除任务提交失败"
            r5.b(r15)     // Catch: java.lang.Throwable -> L2b1
            goto L2b4
        L2b1:
            r0 = move-exception
            r15 = r0
            goto L2bd
        L2b4:
            monitor-exit(r14)
            rb.a r14 = new rb.a
            java.lang.String r15 = "批量删除任务启动失败"
            r14.<init>(r2, r15)
            goto L2f3
        L2bd:
            monitor-exit(r14)
            throw r15
        L2bf:
            rb.a r14 = new rb.a
            int r15 = r6.size()
            java.lang.String r0 = "已开始批量删除 "
            java.lang.String r2 = " 位好友"
            java.lang.String r15 = eh.a.m(r15, r0, r2)
            r14.<init>(r3, r15)
            goto L2f3
        L2d1:
            monitor-exit(r14)
            throw r15
        L2d3:
            ia.t r14 = r5.f11904a
            java.lang.String r0 = "批量删除前读取好友列表失败"
            r14.invoke(r0, r15)
            rb.a r14 = new rb.a
            java.lang.String r15 = "读取好友列表失败"
            r14.<init>(r2, r15)
            goto L2f3
        L2e2:
            monitor-exit(r15)
            throw r14
        L2e4:
            rb.a r14 = new rb.a
            java.lang.String r15 = "删除好友接口尚未就绪"
            r14.<init>(r2, r15)
            goto L2f3
        L2ec:
            rb.a r14 = new rb.a
            java.lang.String r15 = "检测运行时尚未就绪"
            r14.<init>(r2, r15)
        L2f3:
            tf.t r15 = tf.t.f13167g
            r1.setValue(r15)
            return r14
        L2f9:
            i0.a1 r0 = r13.f17906h
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            ua.i r15 = (ua.i) r15
            r15.getClass()
            wb.nu r1 = new wb.nu
            r1.<init>(r14, r15, r3)
            r0.setValue(r1)
            sf.n r14 = sf.n.f12433a
            return r14
        L311:
            i0.a1 r0 = r13.f17906h
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            ua.h r15 = (ua.h) r15
            r15.getClass()
            wb.mu r1 = new wb.mu
            r1.<init>(r14, r15, r3)
            r0.setValue(r1)
            sf.n r14 = sf.n.f12433a
            return r14
        L329:
            i0.a1 r0 = r13.f17906h
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            aa.a r15 = (aa.a) r15
            r15.getClass()
            wb.i5 r1 = new wb.i5
            r1.<init>(r14, r15, r3)
            r0.setValue(r1)
            sf.n r14 = sf.n.f12433a
            return r14
        L341:
            i0.a1 r0 = r13.f17906h
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            aa.h r15 = (aa.h) r15
            r15.getClass()
            wb.d6 r1 = new wb.d6
            r1.<init>(r14, r15, r3)
            r0.setValue(r1)
            sf.n r14 = sf.n.f12433a
            return r14
        L359:
            i0.a1 r0 = r13.f17906h
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r15 = (java.lang.String) r15
            r14.getClass()
            r15.getClass()
            wb.j4 r1 = new wb.j4
            r1.<init>(r14, r15)
            r0.setValue(r1)
            sf.n r14 = sf.n.f12433a
            return r14
        L370:
            i0.a1 r0 = r13.f17906h
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            q9.g r15 = (q9.g) r15
            r15.getClass()
            wb.k4 r1 = new wb.k4
            r1.<init>(r14, r15, r3)
            r0.setValue(r1)
            sf.n r14 = sf.n.f12433a
            return r14
        L388:
            i0.a1 r0 = r13.f17906h
            r9 = r14
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r14 = r15.intValue()
            r15 = r14 & 3
            if (r15 == r1) goto L398
            r2 = r3
        L398:
            r14 = r14 & r3
            boolean r14 = r9.S(r14, r2)
            if (r14 == 0) goto L3c8
            java.lang.String r4 = "搜索"
            java.lang.String r5 = "输入模型名过滤"
            java.lang.Object r14 = r0.getValue()
            r6 = r14
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r14 = r9.P()
            i0.e r15 = i0.l.f5952a
            if (r14 != r15) goto L3bc
            wb.ti r14 = new wb.ti
            r15 = 28
            r14.<init>(r0, r15)
            r9.k0(r14)
        L3bc:
            r8 = r14
            fg.l r8 = (fg.l) r8
            r10 = 24630(0x6036, float:3.4514E-41)
            r11 = 8
            r7 = 0
            wb.ho.C1(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L3cb
        L3c8:
            r9.V()
        L3cb:
            sf.n r14 = sf.n.f12433a
            return r14
        L3ce:
            i0.a1 r0 = r13.f17906h
            i0.h0 r14 = (i0.h0) r14
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            r4 = r15 & 3
            if (r4 == r1) goto L3de
            r1 = r3
            goto L3df
        L3de:
            r1 = r2
        L3df:
            r15 = r15 & r3
            boolean r15 = r14.S(r15, r1)
            if (r15 == 0) goto L3f0
            java.lang.Object r15 = r0.getValue()
            java.lang.String r15 = (java.lang.String) r15
            wb.ho.s0(r15, r14, r2)
            goto L3f3
        L3f0:
            r14.V()
        L3f3:
            sf.n r14 = sf.n.f12433a
            return r14
        L3f6:
            i0.a1 r0 = r13.f17906h
            i0.h0 r14 = (i0.h0) r14
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            r4 = r15 & 3
            if (r4 == r1) goto L405
            r2 = r3
        L405:
            r15 = r15 & r3
            boolean r15 = r14.S(r15, r2)
            if (r15 == 0) goto L430
            java.lang.String r15 = "新增回复"
            java.lang.String r1 = "添加一条按顺序发送的回复"
            boolean r2 = r14.f(r0)
            java.lang.Object r3 = r14.P()
            if (r2 != 0) goto L41e
            i0.e r2 = i0.l.f5952a
            if (r3 != r2) goto L428
        L41e:
            wb.bf r3 = new wb.bf
            r2 = 29
            r3.<init>(r0, r2)
            r14.k0(r3)
        L428:
            fg.a r3 = (fg.a) r3
            r0 = 54
            wb.ho.b(r15, r1, r3, r14, r0)
            goto L433
        L430:
            r14.V()
        L433:
            sf.n r14 = sf.n.f12433a
            return r14
        L436:
            i0.a1 r0 = r13.f17906h
            i0.h0 r14 = (i0.h0) r14
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            r4 = r15 & 3
            if (r4 == r1) goto L446
            r1 = r3
            goto L447
        L446:
            r1 = r2
        L447:
            r15 = r15 & r3
            boolean r15 = r14.S(r15, r1)
            if (r15 == 0) goto L458
            java.lang.Object r15 = r0.getValue()
            java.lang.String r15 = (java.lang.String) r15
            wb.ho.s0(r15, r14, r2)
            goto L45b
        L458:
            r14.V()
        L45b:
            sf.n r14 = sf.n.f12433a
            return r14
    }
}
