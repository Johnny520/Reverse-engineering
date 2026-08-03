package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ec implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f15907h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f15908i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f15909j;

    public /* synthetic */ ec(android.content.Context r2, android.content.SharedPreferences r3, boolean r4) {
            r1 = this;
            r0 = 1
            r1.f15906g = r0
            r1.<init>()
            r1.f15907h = r2
            r1.f15908i = r3
            r1.f15909j = r4
            return
    }

    public /* synthetic */ ec(android.content.Context r2, boolean r3, android.content.SharedPreferences r4) {
            r1 = this;
            r0 = 0
            r1.f15906g = r0
            r1.<init>()
            r1.f15907h = r2
            r1.f15909j = r3
            r1.f15908i = r4
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r11 = this;
            int r0 = r11.f15906g
            switch(r0) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            boolean r0 = r11.f15909j
            java.lang.String r1 = "已清除"
            android.content.Context r2 = r11.f15907h
            android.content.SharedPreferences r3 = r11.f15908i
            wb.ho.S6(r2, r3, r1, r0)
            sf.n r0 = sf.n.f12433a
            return r0
        L13:
            wb.ec r0 = new wb.ec
            android.content.Context r1 = r11.f15907h
            android.content.SharedPreferences r2 = r11.f15908i
            boolean r3 = r11.f15909j
            r0.<init>(r1, r2, r3)
            boolean r2 = r1 instanceof android.app.Activity
            r4 = 0
            if (r2 == 0) goto L26
            android.app.Activity r1 = (android.app.Activity) r1
            goto L27
        L26:
            r1 = r4
        L27:
            if (r1 == 0) goto L2b
            r5 = r1
            goto L3d
        L2b:
            q8.o r1 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r1 == 0) goto L36
            android.app.Activity r1 = r1.a()
            goto L37
        L36:
            r1 = r4
        L37:
            if (r1 == 0) goto L3a
            r4 = r1
        L3a:
            if (r4 == 0) goto L62
            r5 = r4
        L3d:
            if (r3 == 0) goto L43
            java.lang.String r1 = "清除伪集赞"
        L41:
            r6 = r1
            goto L46
        L43:
            java.lang.String r1 = "清除伪评论"
            goto L41
        L46:
            if (r3 == 0) goto L4c
            java.lang.String r1 = "清空全部朋友圈已保存的本地点赞？"
        L4a:
            r7 = r1
            goto L4f
        L4c:
            java.lang.String r1 = "清空全部朋友圈已保存的本地评论？"
            goto L4a
        L4f:
            nb.a r8 = new nb.a
            r1 = 24
            r8.<init>(r0, r1)
            k.s1 r9 = new k.s1
            r0 = 25
            r9.<init>(r0)
            wb.lv r10 = wb.lv.f17583j
            wb.y2.S1(r5, r6, r7, r8, r9, r10)
        L62:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
