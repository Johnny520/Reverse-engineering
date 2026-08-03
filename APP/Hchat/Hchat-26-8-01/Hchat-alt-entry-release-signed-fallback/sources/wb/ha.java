package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ha implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16522g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f16523h;

    public /* synthetic */ ha(android.content.Context r1, int r2) {
            r0 = this;
            r0.f16522g = r2
            r0.f16523h = r1
            r0.<init>()
            return
    }

    public /* synthetic */ ha(android.content.Context r1, int r2, int r3) {
            r0 = this;
            r0.f16522g = r3
            r0.f16523h = r1
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11) {
            r9 = this;
            int r0 = r9.f16522g
            switch(r0) {
                case 0: goto L201;
                case 1: goto L1ee;
                case 2: goto La1;
                case 3: goto L8d;
                case 4: goto L49;
                default: goto L5;
            }
        L5:
            i0.h0 r10 = (i0.h0) r10
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r0 = r11 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L15
            r0 = r2
            goto L16
        L15:
            r0 = 0
        L16:
            r11 = r11 & r2
            boolean r11 = r10.S(r11, r0)
            if (r11 == 0) goto L43
            android.content.Context r11 = r9.f16523h
            boolean r0 = r10.h(r11)
            java.lang.Object r1 = r10.P()
            if (r0 != 0) goto L2d
            i0.e r0 = i0.l.f5952a
            if (r1 != r0) goto L37
        L2d:
            h9.c r1 = new h9.c
            r0 = 13
            r1.<init>(r11, r0)
            r10.k0(r1)
        L37:
            fg.a r1 = (fg.a) r1
            r11 = 54
            java.lang.String r0 = "立即清空上下文"
            java.lang.String r2 = "清除当前运行中的 AI 对话记忆"
            wb.ho.b(r0, r2, r1, r10, r11)
            goto L46
        L43:
            r10.V()
        L46:
            sf.n r10 = sf.n.f12433a
            return r10
        L49:
            i0.h0 r10 = (i0.h0) r10
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r0 = r11 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L59
            r0 = r2
            goto L5a
        L59:
            r0 = 0
        L5a:
            r11 = r11 & r2
            boolean r11 = r10.S(r11, r0)
            if (r11 == 0) goto L87
            android.content.Context r11 = r9.f16523h
            boolean r0 = r10.h(r11)
            java.lang.Object r1 = r10.P()
            if (r0 != 0) goto L71
            i0.e r0 = i0.l.f5952a
            if (r1 != r0) goto L7b
        L71:
            h9.c r1 = new h9.c
            r0 = 14
            r1.<init>(r11, r0)
            r10.k0(r1)
        L7b:
            fg.a r1 = (fg.a) r1
            r11 = 54
            java.lang.String r0 = "立即清空上下文"
            java.lang.String r2 = "清除当前运行中的小智对话记忆"
            wb.ho.b(r0, r2, r1, r10, r11)
            goto L8a
        L87:
            r10.V()
        L8a:
            sf.n r10 = sf.n.f12433a
            return r10
        L8d:
            i0.h0 r10 = (i0.h0) r10
            java.lang.Integer r11 = (java.lang.Integer) r11
            r11.getClass()
            r11 = 1
            int r11 = i0.r.C(r11)
            android.content.Context r0 = r9.f16523h
            wb.ho.U3(r0, r10, r11)
        L9e:
            sf.n r10 = sf.n.f12433a
            return r10
        La1:
            r3 = r10
            i0.h0 r3 = (i0.h0) r3
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r6 = 0
            r7 = 1
            if (r11 == r0) goto Lb3
            r11 = r7
            goto Lb4
        Lb3:
            r11 = r6
        Lb4:
            r10 = r10 & r7
            boolean r10 = r3.S(r10, r11)
            if (r10 == 0) goto L1e8
            android.content.Context r10 = r9.f16523h
            boolean r11 = r3.h(r10)
            java.lang.Object r0 = r3.P()
            i0.e r8 = i0.l.f5952a
            if (r11 != 0) goto Lcb
            if (r0 != r8) goto Ld4
        Lcb:
            h9.c r0 = new h9.c
            r11 = 2
            r0.<init>(r10, r11)
            r3.k0(r0)
        Ld4:
            r2 = r0
            fg.a r2 = (fg.a) r2
            r4 = 54
            r5 = 0
            java.lang.String r0 = "KavaRef"
            java.lang.String r1 = "HighCapable"
            wb.ho.B1(r0, r1, r2, r3, r4, r5)
            r11 = 0
            wb.ho.D1(r11, r3, r6, r7)
            boolean r0 = r3.h(r10)
            java.lang.Object r1 = r3.P()
            if (r0 != 0) goto Lf1
            if (r1 != r8) goto Lfa
        Lf1:
            h9.c r1 = new h9.c
            r0 = 3
            r1.<init>(r10, r0)
            r3.k0(r1)
        Lfa:
            r2 = r1
            fg.a r2 = (fg.a) r2
            r4 = 54
            r5 = 0
            java.lang.String r0 = "DexKit"
            java.lang.String r1 = "LuckyPray"
            wb.ho.B1(r0, r1, r2, r3, r4, r5)
            wb.ho.D1(r11, r3, r6, r7)
            boolean r0 = r3.h(r10)
            java.lang.Object r1 = r3.P()
            if (r0 != 0) goto L116
            if (r1 != r8) goto L11f
        L116:
            h9.c r1 = new h9.c
            r0 = 4
            r1.<init>(r10, r0)
            r3.k0(r1)
        L11f:
            r2 = r1
            fg.a r2 = (fg.a) r2
            r4 = 54
            r5 = 0
            java.lang.String r0 = "FastKV"
            java.lang.String r1 = "BillyWei01"
            wb.ho.B1(r0, r1, r2, r3, r4, r5)
            wb.ho.D1(r11, r3, r6, r7)
            boolean r0 = r3.h(r10)
            java.lang.Object r1 = r3.P()
            if (r0 != 0) goto L13b
            if (r1 != r8) goto L144
        L13b:
            h9.c r1 = new h9.c
            r0 = 5
            r1.<init>(r10, r0)
            r3.k0(r1)
        L144:
            r2 = r1
            fg.a r2 = (fg.a) r2
            r4 = 54
            r5 = 0
            java.lang.String r0 = "WeChat Pad"
            java.lang.String r1 = "lovejiuwu"
            wb.ho.B1(r0, r1, r2, r3, r4, r5)
            wb.ho.D1(r11, r3, r6, r7)
            boolean r0 = r3.h(r10)
            java.lang.Object r1 = r3.P()
            if (r0 != 0) goto L160
            if (r1 != r8) goto L169
        L160:
            h9.c r1 = new h9.c
            r0 = 6
            r1.<init>(r10, r0)
            r3.k0(r1)
        L169:
            r2 = r1
            fg.a r2 = (fg.a) r2
            r4 = 54
            r5 = 0
            java.lang.String r0 = "LSPosed"
            java.lang.String r1 = "LSPosed"
            wb.ho.B1(r0, r1, r2, r3, r4, r5)
            wb.ho.D1(r11, r3, r6, r7)
            boolean r0 = r3.h(r10)
            java.lang.Object r1 = r3.P()
            if (r0 != 0) goto L185
            if (r1 != r8) goto L18e
        L185:
            h9.c r1 = new h9.c
            r0 = 7
            r1.<init>(r10, r0)
            r3.k0(r1)
        L18e:
            r2 = r1
            fg.a r2 = (fg.a) r2
            r4 = 54
            r5 = 0
            java.lang.String r0 = "Miuix"
            java.lang.String r1 = "YuKongA"
            wb.ho.B1(r0, r1, r2, r3, r4, r5)
            wb.ho.D1(r11, r3, r6, r7)
            boolean r0 = r3.h(r10)
            java.lang.Object r1 = r3.P()
            if (r0 != 0) goto L1aa
            if (r1 != r8) goto L1b4
        L1aa:
            h9.c r1 = new h9.c
            r0 = 8
            r1.<init>(r10, r0)
            r3.k0(r1)
        L1b4:
            r2 = r1
            fg.a r2 = (fg.a) r2
            r4 = 54
            r5 = 0
            java.lang.String r0 = "BeanShell-Android"
            java.lang.String r1 = "CopyLibs"
            wb.ho.B1(r0, r1, r2, r3, r4, r5)
            wb.ho.D1(r11, r3, r6, r7)
            boolean r11 = r3.h(r10)
            java.lang.Object r0 = r3.P()
            if (r11 != 0) goto L1d0
            if (r0 != r8) goto L1da
        L1d0:
            h9.c r0 = new h9.c
            r11 = 9
            r0.<init>(r10, r11)
            r3.k0(r0)
        L1da:
            r2 = r0
            fg.a r2 = (fg.a) r2
            r4 = 54
            r5 = 0
            java.lang.String r0 = "Silk Codec"
            java.lang.String r1 = "YunJavaPro"
            wb.ho.B1(r0, r1, r2, r3, r4, r5)
            goto L1eb
        L1e8:
            r3.V()
        L1eb:
            sf.n r10 = sf.n.f12433a
            return r10
        L1ee:
            i0.h0 r10 = (i0.h0) r10
            java.lang.Integer r11 = (java.lang.Integer) r11
            r11.getClass()
            r11 = 1
            int r11 = i0.r.C(r11)
            android.content.Context r0 = r9.f16523h
            wb.ho.k1(r0, r10, r11)
            goto L9e
        L201:
            r3 = r10
            i0.h0 r3 = (i0.h0) r3
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r6 = 0
            r7 = 1
            if (r11 == r0) goto L213
            r11 = r7
            goto L214
        L213:
            r11 = r6
        L214:
            r10 = r10 & r7
            boolean r10 = r3.S(r10, r11)
            if (r10 == 0) goto L26a
            android.content.Context r10 = r9.f16523h
            boolean r11 = r3.h(r10)
            java.lang.Object r0 = r3.P()
            i0.e r8 = i0.l.f5952a
            if (r11 != 0) goto L22b
            if (r0 != r8) goto L235
        L22b:
            h9.c r0 = new h9.c
            r11 = 10
            r0.<init>(r10, r11)
            r3.k0(r0)
        L235:
            r2 = r0
            fg.a r2 = (fg.a) r2
            r4 = 54
            r5 = 0
            java.lang.String r0 = "Telegram Channel"
            java.lang.String r1 = "Hchat_ci"
            wb.ho.B1(r0, r1, r2, r3, r4, r5)
            r11 = 0
            wb.ho.D1(r11, r3, r6, r7)
            boolean r11 = r3.h(r10)
            java.lang.Object r0 = r3.P()
            if (r11 != 0) goto L252
            if (r0 != r8) goto L25c
        L252:
            h9.c r0 = new h9.c
            r11 = 11
            r0.<init>(r10, r11)
            r3.k0(r0)
        L25c:
            r2 = r0
            fg.a r2 = (fg.a) r2
            r4 = 54
            r5 = 0
            java.lang.String r0 = "Telegram Group"
            java.lang.String r1 = "Hchat_Group"
            wb.ho.B1(r0, r1, r2, r3, r4, r5)
            goto L26d
        L26a:
            r3.V()
        L26d:
            sf.n r10 = sf.n.f12433a
            return r10
    }
}
