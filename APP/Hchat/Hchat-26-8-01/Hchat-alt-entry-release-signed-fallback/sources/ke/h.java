package ke;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements ke.d, f8.d, okhttp3.EventListener.Factory, j6.o, z7.t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f7599h;

    public /* synthetic */ h(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f7598g = r2
            r0.f7599h = r1
            r0.<init>()
            return
    }

    @Override // z7.t
    public void a(int r3, int r4) {
            r2 = this;
            java.lang.Object r0 = r2.f7599h
            o7.b r0 = (o7.b) r0
            k7.a r1 = r0.Q(r3)
            k7.a r0 = r0.Q(r4)
            if (r1 == 0) goto L11
            r1.H(r3)
        L11:
            if (r0 == 0) goto L16
            r0.H(r4)
        L16:
            return
    }

    @Override // f8.d
    public void b(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.f7598g
            r8.c r1 = r8.c.f11603i
            r2 = 7
            r8.c r3 = r8.c.f11604j
            r4 = 1
            r5 = 11
            r6 = 4
            r7 = 8
            r8 = 12
            r9 = 0
            java.lang.Object r10 = r11.f7599h
            switch(r0) {
                case 1: goto L1df;
                case 2: goto L15;
                case 3: goto L1cb;
                case 4: goto L1b7;
                case 5: goto L1ac;
                case 6: goto L198;
                case 7: goto L184;
                case 8: goto L16e;
                case 9: goto L158;
                case 10: goto L140;
                case 11: goto L135;
                case 12: goto L12a;
                case 13: goto L112;
                case 14: goto Lfc;
                case 15: goto Le6;
                case 16: goto Ld2;
                case 17: goto L15;
                case 18: goto L15;
                case 19: goto Lbb;
                case 20: goto La6;
                case 21: goto L92;
                case 22: goto L87;
                case 23: goto L71;
                case 24: goto L5b;
                case 25: goto L15;
                case 26: goto L34;
                case 27: goto L15;
                case 28: goto L29;
                default: goto L15;
            }
        L15:
            pb.a r10 = (pb.a) r10
            f8.e r12 = (f8.e) r12
            r12.getClass()
            i.e0 r12 = new i.e0
            r12.<init>(r10, r5)
            java.lang.String r0 = "block_typing_report"
            java.lang.String r1 = "拦截正在输入上报"
            r8.e.f(r8, r12, r0, r1, r9)
            return
        L29:
            o9.p r10 = (o9.p) r10
            f8.e r12 = (f8.e) r12
            r12.getClass()
            r10.z()
            return
        L34:
            b9.a r10 = (b9.a) r10
            f8.e r12 = (f8.e) r12
            r12.getClass()
            i8.c r12 = h.Hchat.hooks.api.core.WeChatApis.message()
            r12.getClass()
            k8.p r12 = h.Hchat.hooks.api.core.WeChatApis.l()
            if (r12 != 0) goto L4e
            java.lang.String r12 = "[Hchat:TextSpeech] 消息观察 API 未就绪"
            fb.v0.m(r12)
            goto L5a
        L4e:
            na.c r0 = new na.c
            r0.<init>(r10, r4)
            a2.a r12 = r12.e(r0)
            r10.j(r12)
        L5a:
            return
        L5b:
            ma.a r10 = (ma.a) r10
            f8.e r12 = (f8.e) r12
            r12.getClass()
            i.e0 r12 = new i.e0
            r0 = 9
            r12.<init>(r10, r0)
            java.lang.String r0 = "disable_pat"
            java.lang.String r1 = "禁止拍一拍"
            r8.e.f(r8, r12, r0, r1, r9)
            return
        L71:
            m9.a r10 = (m9.a) r10
            f8.e r12 = (f8.e) r12
            r12.getClass()
            android.os.Handler r12 = r8.e.f11615a
            i.e0 r12 = new i.e0
            r12.<init>(r10, r2)
            java.lang.String r0 = "game_emoji_result"
            java.lang.String r1 = "指定骰子猜拳"
            r8.e.f(r7, r12, r0, r1, r3)
            return
        L87:
            lb.k r10 = (lb.k) r10
            f8.e r12 = (f8.e) r12
            r12.getClass()
            r10.k()
            return
        L92:
            jb.a r10 = (jb.a) r10
            f8.e r12 = (f8.e) r12
            r12.getClass()
            i.e0 r12 = new i.e0
            r12.<init>(r10, r6)
            java.lang.String r0 = "finder_media_download"
            java.lang.String r1 = "视频号媒体下载"
            r8.e.f(r8, r12, r0, r1, r9)
            return
        La6:
            ja.a r10 = (ja.a) r10
            f8.e r12 = (f8.e) r12
            r12.getClass()
            i.e0 r12 = new i.e0
            r0 = 3
            r12.<init>(r10, r0)
            java.lang.String r0 = "multi_recall"
            java.lang.String r1 = "多选撤回"
            r8.e.f(r8, r12, r0, r1, r9)
            return
        Lbb:
            j9.a r10 = (j9.a) r10
            f8.e r12 = (f8.e) r12
            r12.getClass()
            android.os.Handler r12 = r8.e.f11615a
            i.e0 r12 = new i.e0
            r0 = 2
            r12.<init>(r10, r0)
            java.lang.String r0 = "fake_voice_duration"
            java.lang.String r2 = "伪造语音时长"
            r8.e.f(r7, r12, r0, r2, r1)
            return
        Ld2:
            b9.a r10 = (b9.a) r10
            f8.e r12 = (f8.e) r12
            r12.getClass()
            i.e0 r12 = new i.e0
            r12.<init>(r10, r4)
            java.lang.String r0 = "fake_scan_camera"
            java.lang.String r1 = "模拟相机扫码"
            r8.e.f(r6, r12, r0, r1, r9)
            return
        Le6:
            hb.u r10 = (hb.u) r10
            f8.e r12 = (f8.e) r12
            r12.getClass()
            ab.a r12 = new ab.a
            r0 = 29
            r12.<init>(r10, r0)
            java.lang.String r0 = "selected_messages"
            java.lang.String r1 = "群发助手"
            r8.e.f(r8, r12, r0, r1, r9)
            return
        Lfc:
            b9.a r10 = (b9.a) r10
            f8.e r12 = (f8.e) r12
            r12.getClass()
            ab.a r12 = new ab.a
            r0 = 28
            r12.<init>(r10, r0)
            java.lang.String r0 = "original_moments_upload"
            java.lang.String r1 = "朋友圈原图上传"
            r8.e.f(r8, r12, r0, r1, r9)
            return
        L112:
            ha.e0 r10 = (ha.e0) r10
            f8.e r12 = (f8.e) r12
            r12.getClass()
            android.os.Handler r12 = r8.e.f11615a
            ab.a r12 = new ab.a
            r0 = 27
            r12.<init>(r10, r0)
            java.lang.String r0 = "moments_upload_tail"
            java.lang.String r1 = "朋友圈上传尾巴"
            r8.e.f(r7, r12, r0, r1, r3)
            return
        L12a:
            ha.v r10 = (ha.v) r10
            f8.e r12 = (f8.e) r12
            r12.getClass()
            r10.k()
            return
        L135:
            ha.o r10 = (ha.o) r10
            f8.e r12 = (f8.e) r12
            r12.getClass()
            r10.k()
            return
        L140:
            h9.a r10 = (h9.a) r10
            f8.e r12 = (f8.e) r12
            r12.getClass()
            android.os.Handler r12 = r8.e.f11615a
            ab.a r12 = new ab.a
            r0 = 24
            r12.<init>(r10, r0)
            java.lang.String r0 = "fake_location"
            java.lang.String r2 = "虚拟定位"
            r8.e.f(r7, r12, r0, r2, r1)
            return
        L158:
            g9.a r10 = (g9.a) r10
            f8.e r12 = (f8.e) r12
            r12.getClass()
            ab.a r12 = new ab.a
            r0 = 23
            r12.<init>(r10, r0)
            java.lang.String r0 = "emoji_save"
            java.lang.String r1 = "保存表情"
            r8.e.f(r8, r12, r0, r1, r9)
            return
        L16e:
            f9.a r10 = (f9.a) r10
            f8.e r12 = (f8.e) r12
            r12.getClass()
            ab.a r12 = new ab.a
            r0 = 19
            r12.<init>(r10, r0)
            java.lang.String r0 = "edit_message"
            java.lang.String r1 = "修改聊天记录"
            r8.e.f(r8, r12, r0, r1, r9)
            return
        L184:
            d9.d r10 = (d9.d) r10
            f8.e r12 = (f8.e) r12
            r12.getClass()
            ab.a r12 = new ab.a
            r12.<init>(r10, r8)
            java.lang.String r0 = "custom_friend_avatar"
            java.lang.String r1 = "自定义好友头像"
            r8.e.f(r8, r12, r0, r1, r9)
            return
        L198:
            b9.a r10 = (b9.a) r10
            f8.e r12 = (f8.e) r12
            r12.getClass()
            ab.a r12 = new ab.a
            r12.<init>(r10, r5)
            java.lang.String r0 = "round_avatar"
            java.lang.String r1 = "圆角头像"
            r8.e.f(r8, r12, r0, r1, r9)
            return
        L1ac:
            ca.f r10 = (ca.f) r10
            f8.e r12 = (f8.e) r12
            r12.getClass()
            r10.k()
            return
        L1b7:
            bb.e r10 = (bb.e) r10
            f8.e r12 = (f8.e) r12
            r12.getClass()
            ab.a r12 = new ab.a
            r12.<init>(r10, r2)
            java.lang.String r0 = "real_name_tail"
            java.lang.String r1 = "实名尾字"
            r8.e.f(r8, r12, r0, r1, r9)
            return
        L1cb:
            b9.a r10 = (b9.a) r10
            f8.e r12 = (f8.e) r12
            r12.getClass()
            ab.a r12 = new ab.a
            r12.<init>(r10, r6)
            java.lang.String r0 = "chat_time_style"
            java.lang.String r1 = "会话时间样式"
            r8.e.f(r8, r12, r0, r1, r9)
            return
        L1df:
            ab.c r10 = (ab.c) r10
            f8.e r12 = (f8.e) r12
            r12.getClass()
            ab.a r12 = new ab.a
            r0 = 0
            r12.<init>(r10, r0)
            java.lang.String r0 = "quote_delete_clear"
            java.lang.String r1 = "删除键清引用"
            r8.e.f(r8, r12, r0, r1, r9)
            return
    }

    @Override // ke.d
    public boolean c(ud.r r6, ud.n r7) {
            r5 = this;
            java.lang.Object r0 = r5.f7599h
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r1 = r0.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()
            ae.h r2 = (ae.h) r2
            ud.a r3 = r2.f249m
            java.util.List r4 = r7.u()
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L8
            boolean r1 = ke.i.t0(r7, r2, r3)
            if (r1 != 0) goto L33
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r1 = "Can't wrap try/catch for region: "
            java.lang.String r7 = r1.concat(r7)
            r6.K(r7)
        L33:
            r0.remove(r2)
            boolean r6 = r0.isEmpty()
            if (r6 != 0) goto L3e
            r6 = 1
            return r6
        L3e:
            r6 = 0
            return r6
    }

    @Override // okhttp3.EventListener.Factory
    public okhttp3.EventListener create(okhttp3.Call r2) {
            r1 = this;
            java.lang.Object r0 = r1.f7599h
            okhttp3.EventListener r0 = (okhttp3.EventListener) r0
            okhttp3.EventListener r2 = okhttp3.internal.Util.a(r0, r2)
            return r2
    }

    @Override // j6.o
    public java.lang.Object d() {
            r6 = this;
            int r0 = r6.f7598g
            java.lang.Object r1 = r6.f7599h
            switch(r0) {
                case 17: goto L2a;
                default: goto L7;
            }
        L7:
            java.lang.Class r1 = (java.lang.Class) r1
            j6.v r0 = j6.v.f6769a     // Catch: java.lang.Exception -> L10
            java.lang.Object r0 = r0.a(r1)     // Catch: java.lang.Exception -> L10
            return r0
        L10:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Unable to create instance of "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            throw r2
        L2a:
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            java.lang.String r0 = "' with no args"
            java.lang.String r2 = "Failed to invoke constructor '"
            r3 = 0
            java.lang.Object r3 = r1.newInstance(r3)     // Catch: java.lang.IllegalAccessException -> L36 java.lang.reflect.InvocationTargetException -> L3f java.lang.InstantiationException -> L5b
            goto L5a
        L36:
            r0 = move-exception
            f8.i r1 = l6.c.f7868a
            java.lang.String r1 = "Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."
            ah.a.p(r1, r0)
            goto L5a
        L3f:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r2)
            java.lang.String r1 = l6.c.b(r1)
            r5.append(r1)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.Throwable r1 = r4.getCause()
            ah.a.p(r0, r1)
        L5a:
            return r3
        L5b:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r1 = l6.c.b(r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r2)
            r5.append(r1)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r4.<init>(r0, r3)
            throw r4
    }
}
