package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class up extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f19529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f19530i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ gb.o f19531j;

    public /* synthetic */ up(android.content.Context r1, gb.o r2, wf.c r3, int r4) {
            r0 = this;
            r0.f19529h = r4
            r0.f19530i = r1
            r0.f19531j = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r4, wf.c r5) {
            r3 = this;
            int r4 = r3.f19529h
            switch(r4) {
                case 0: goto L26;
                case 1: goto L1b;
                case 2: goto L10;
                default: goto L5;
            }
        L5:
            wb.up r4 = new wb.up
            gb.o r0 = r3.f19531j
            r1 = 3
            android.content.Context r2 = r3.f19530i
            r4.<init>(r2, r0, r5, r1)
            return r4
        L10:
            wb.up r4 = new wb.up
            gb.o r0 = r3.f19531j
            r1 = 2
            android.content.Context r2 = r3.f19530i
            r4.<init>(r2, r0, r5, r1)
            return r4
        L1b:
            wb.up r4 = new wb.up
            gb.o r0 = r3.f19531j
            r1 = 1
            android.content.Context r2 = r3.f19530i
            r4.<init>(r2, r0, r5, r1)
            return r4
        L26:
            wb.up r4 = new wb.up
            gb.o r0 = r3.f19531j
            r1 = 0
            android.content.Context r2 = r3.f19530i
            r4.<init>(r2, r0, r5, r1)
            return r4
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f19529h
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L30;
                case 1: goto L23;
                case 2: goto L16;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            wb.up r2 = (wb.up) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            wb.up r2 = (wb.up) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L23:
            wf.c r2 = r1.create(r2, r3)
            wb.up r2 = (wb.up) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L30:
            wf.c r2 = r1.create(r2, r3)
            wb.up r2 = (wb.up) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            r14 = this;
            int r0 = r14.f19529h
            r1 = 0
            r2 = 1
            android.content.Context r3 = r14.f19530i
            gb.o r4 = r14.f19531j
            switch(r0) {
                case 0: goto Lb9;
                case 1: goto L4b;
                case 2: goto L1c;
                default: goto Lb;
            }
        Lb:
            f8.i.I0(r15)
            java.util.Set r15 = gb.k.f4440a
            java.lang.String r15 = gb.k.k(r3, r4)
            if (r15 == 0) goto L17
            r1 = r2
        L17:
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r1)
            return r15
        L1c:
            f8.i.I0(r15)
            java.lang.String r15 = r4.f4449a
            gb.m r0 = gb.q.e(r3, r15)     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L37
            java.lang.Object r0 = gb.b.d(r3, r0)     // Catch: java.lang.Throwable -> L34
            f8.i.I0(r0)     // Catch: java.lang.Throwable -> L34
            gb.q.j(r3, r15)     // Catch: java.lang.Throwable -> L34
            sf.n r15 = sf.n.f12433a     // Catch: java.lang.Throwable -> L34
            goto L45
        L34:
            r0 = move-exception
            r15 = r0
            goto L3f
        L37:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = "该插件不是由当前模块安装上传的"
            r15.<init>(r0)     // Catch: java.lang.Throwable -> L34
            throw r15     // Catch: java.lang.Throwable -> L34
        L3f:
            sf.f r0 = new sf.f
            r0.<init>(r15)
            r15 = r0
        L45:
            sf.g r0 = new sf.g
            r0.<init>(r15)
            return r0
        L4b:
            java.lang.String r1 = r4.f4449a
            f8.i.I0(r15)
            java.lang.Object r15 = gb.q.a(r3)
            boolean r0 = r15 instanceof sf.f
            if (r0 != 0) goto L74
            java.lang.Object r0 = gb.q.a(r3)     // Catch: java.lang.Throwable -> L6b
            f8.i.I0(r0)     // Catch: java.lang.Throwable -> L6b
            gb.s r0 = (gb.s) r0     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r0 = gb.b.j(r3, r1, r0)     // Catch: java.lang.Throwable -> L6b
            f8.i.I0(r0)     // Catch: java.lang.Throwable -> L6b
            gb.l r0 = (gb.l) r0     // Catch: java.lang.Throwable -> L6b
            goto L72
        L6b:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L72:
            r2 = r0
            goto L87
        L74:
            java.lang.Throwable r0 = sf.g.b(r15)
            if (r0 == 0) goto L7b
            goto L82
        L7b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "当前微信账号资料未就绪"
            r0.<init>(r2)
        L82:
            sf.f r2 = new sf.f
            r2.<init>(r0)
        L87:
            sf.j r4 = new sf.j
            sf.g r5 = new sf.g
            r5.<init>(r15)
            java.lang.Object r15 = gb.q.a(r3)     // Catch: java.lang.Throwable -> La3
            boolean r0 = r15 instanceof sf.f     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto L97
            r15 = 0
        L97:
            gb.s r15 = (gb.s) r15     // Catch: java.lang.Throwable -> La3
            java.lang.Object r15 = gb.b.b(r3, r1, r15)     // Catch: java.lang.Throwable -> La3
            f8.i.I0(r15)     // Catch: java.lang.Throwable -> La3
            gb.e r15 = (gb.e) r15     // Catch: java.lang.Throwable -> La3
            goto Lab
        La3:
            r0 = move-exception
            r15 = r0
            sf.f r0 = new sf.f
            r0.<init>(r15)
            r15 = r0
        Lab:
            sf.g r0 = new sf.g
            r0.<init>(r15)
            sf.g r15 = new sf.g
            r15.<init>(r2)
            r4.<init>(r5, r0, r15)
            return r4
        Lb9:
            f8.i.I0(r15)
            android.content.Context r6 = r14.f19530i
            java.lang.String r15 = r4.f4449a
            java.lang.Object r0 = gb.b.f(r6, r15)     // Catch: java.lang.Throwable -> Ld1
            f8.i.I0(r0)     // Catch: java.lang.Throwable -> Ld1
            gb.o r0 = (gb.o) r0     // Catch: java.lang.Throwable -> Ld1
            java.lang.Object r3 = gb.k.u(r0)     // Catch: java.lang.Throwable -> Ld1
            f8.i.I0(r3)     // Catch: java.lang.Throwable -> Ld1
            goto Ld8
        Ld1:
            r0 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r0)
            r0 = r3
        Ld8:
            boolean r3 = r0 instanceof sf.f
            if (r3 != 0) goto Lf1
            gb.o r0 = (gb.o) r0
            java.lang.String r3 = gb.k.k(r6, r0)
            if (r3 == 0) goto Le6
            goto Le7
        Le6:
            r2 = r1
        Le7:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            sf.e r3 = new sf.e
            r3.<init>(r0, r2)
            r0 = r3
        Lf1:
            sf.g r2 = new sf.g
            r2.<init>(r0)
            okhttp3.MediaType r0 = gb.b.f4408a
            boolean r0 = og.m.t0(r15)     // Catch: java.lang.Throwable -> L137
            if (r0 != 0) goto L185
            gb.a r7 = gb.a.f4404g     // Catch: java.lang.Throwable -> L137
            java.lang.String r0 = "v1"
            java.lang.String r3 = "plugins"
            java.lang.String r4 = "snapshots"
            java.lang.String[] r15 = new java.lang.String[]{r0, r3, r15, r4}     // Catch: java.lang.Throwable -> L137
            java.util.List r8 = a.a.y0(r15)     // Catch: java.lang.Throwable -> L137
            tf.u r11 = tf.u.f13168g     // Catch: java.lang.Throwable -> L137
            r9 = 0
            r10 = 0
            org.json.JSONObject r15 = gb.b.l(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L137
            org.json.JSONObject r15 = gb.b.c(r15)     // Catch: java.lang.Throwable -> L137
            java.lang.String r0 = "items"
            org.json.JSONArray r15 = r15.optJSONArray(r0)     // Catch: java.lang.Throwable -> L137
            if (r15 == 0) goto L123
            goto L128
        L123:
            org.json.JSONArray r15 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L137
            r15.<init>()     // Catch: java.lang.Throwable -> L137
        L128:
            uf.c r0 = a.a.E()     // Catch: java.lang.Throwable -> L137
            int r3 = r15.length()     // Catch: java.lang.Throwable -> L137
        L130:
            if (r1 < r3) goto L13a
            uf.c r15 = a.a.t(r0)     // Catch: java.lang.Throwable -> L137
            goto L193
        L137:
            r0 = move-exception
            r15 = r0
            goto L18d
        L13a:
            org.json.JSONObject r4 = r15.optJSONObject(r1)     // Catch: java.lang.Throwable -> L137
            if (r4 == 0) goto L182
            gb.h r5 = new gb.h     // Catch: java.lang.Throwable -> L137
            java.lang.String r6 = "versionId"
            java.lang.String r8 = r4.optString(r6)     // Catch: java.lang.Throwable -> L137
            r8.getClass()     // Catch: java.lang.Throwable -> L137
            java.lang.String r6 = "versionName"
            java.lang.String r9 = r4.optString(r6)     // Catch: java.lang.Throwable -> L137
            r9.getClass()     // Catch: java.lang.Throwable -> L137
            java.lang.String r6 = "contentHash"
            java.lang.String r10 = r4.optString(r6)     // Catch: java.lang.Throwable -> L137
            r10.getClass()     // Catch: java.lang.Throwable -> L137
            java.lang.String r6 = "totalSize"
            r11 = 0
            long r6 = r4.optLong(r6, r11)     // Catch: java.lang.Throwable -> L137
            int r13 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r13 >= 0) goto L16a
            r6 = r11
        L16a:
            java.lang.String r11 = "createdAt"
            java.lang.String r11 = r4.optString(r11)     // Catch: java.lang.Throwable -> L137
            r11.getClass()     // Catch: java.lang.Throwable -> L137
            java.lang.String r12 = "releaseNotes"
            java.lang.String r12 = r4.optString(r12)     // Catch: java.lang.Throwable -> L137
            r12.getClass()     // Catch: java.lang.Throwable -> L137
            r5.<init>(r6, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L137
            r0.add(r5)     // Catch: java.lang.Throwable -> L137
        L182:
            int r1 = r1 + 1
            goto L130
        L185:
            java.lang.String r15 = "远程插件 ID 不能为空"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L137
            r0.<init>(r15)     // Catch: java.lang.Throwable -> L137
            throw r0     // Catch: java.lang.Throwable -> L137
        L18d:
            sf.f r0 = new sf.f
            r0.<init>(r15)
            r15 = r0
        L193:
            sf.g r0 = new sf.g
            r0.<init>(r15)
            sf.e r15 = new sf.e
            r15.<init>(r2, r0)
            return r15
    }
}
