package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g9 implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f16351i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f16352j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16353k;

    public /* synthetic */ g9(android.content.SharedPreferences r2, boolean r3, i0.a1 r4, i0.a1 r5) {
            r1 = this;
            r0 = 0
            r1.f16349g = r0
            r1.<init>()
            r1.f16351i = r2
            r1.f16352j = r3
            r1.f16350h = r4
            r1.f16353k = r5
            return
    }

    public /* synthetic */ g9(i0.a1 r2, android.content.SharedPreferences r3, boolean r4, i0.a1 r5) {
            r1 = this;
            r0 = 1
            r1.f16349g = r0
            r1.<init>()
            r1.f16350h = r2
            r1.f16351i = r3
            r1.f16352j = r4
            r1.f16353k = r5
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r13, java.lang.Object r14) {
            r12 = this;
            int r0 = r12.f16349g
            switch(r0) {
                case 0: goto La5;
                default: goto L5;
            }
        L5:
            r6 = r13
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r13 = r14.intValue()
            r14 = r13 & 3
            r0 = 2
            r9 = 0
            r10 = 1
            if (r14 == r0) goto L17
            r14 = r10
            goto L18
        L17:
            r14 = r9
        L18:
            r13 = r13 & r10
            boolean r13 = r6.S(r13, r14)
            if (r13 == 0) goto L9f
            i0.a1 r13 = r12.f16350h
            java.lang.Object r14 = r13.getValue()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r1 = r14.booleanValue()
            boolean r14 = r6.f(r13)
            android.content.SharedPreferences r0 = r12.f16351i
            boolean r2 = r6.h(r0)
            r14 = r14 | r2
            java.lang.Object r2 = r6.P()
            i0.e r11 = i0.l.f5952a
            if (r14 != 0) goto L40
            if (r2 != r11) goto L49
        L40:
            wb.me r2 = new wb.me
            r14 = 1
            r2.<init>(r0, r13, r14)
            r6.k0(r2)
        L49:
            r5 = r2
            fg.l r5 = (fg.l) r5
            r7 = 432(0x1b0, float:6.05E-43)
            r8 = 8
            java.lang.String r2 = "悬浮底栏"
            java.lang.String r3 = "使用悬浮样式的底部导航栏"
            r4 = 0
            wb.ho.P3(r1, r2, r3, r4, r5, r6, r7, r8)
            r13 = 0
            wb.ho.D1(r13, r6, r9, r10)
            boolean r4 = r12.f16352j
            i0.a1 r13 = r12.f16353k
            if (r4 == 0) goto L70
            java.lang.Object r14 = r13.getValue()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L70
            r1 = r10
            goto L71
        L70:
            r1 = r9
        L71:
            if (r4 == 0) goto L77
            java.lang.String r14 = "启用悬浮底栏的液态玻璃效果"
        L75:
            r3 = r14
            goto L7a
        L77:
            java.lang.String r14 = "Android 13 以下不支持液态玻璃效果"
            goto L75
        L7a:
            boolean r14 = r6.f(r13)
            boolean r2 = r6.h(r0)
            r14 = r14 | r2
            java.lang.Object r2 = r6.P()
            if (r14 != 0) goto L8b
            if (r2 != r11) goto L93
        L8b:
            c9.x r2 = new c9.x
            r2.<init>(r4, r0, r13)
            r6.k0(r2)
        L93:
            r5 = r2
            fg.l r5 = (fg.l) r5
            r7 = 3120(0xc30, float:4.372E-42)
            r8 = 0
            java.lang.String r2 = "液态玻璃"
            wb.ho.P3(r1, r2, r3, r4, r5, r6, r7, r8)
            goto La2
        L9f:
            r6.V()
        La2:
            sf.n r13 = sf.n.f12433a
            return r13
        La5:
            r5 = r13
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r13 = r14.intValue()
            r14 = r13 & 3
            r0 = 2
            r9 = 1
            r10 = 0
            if (r14 == r0) goto Lb7
            r14 = r9
            goto Lb8
        Lb7:
            r14 = r10
        Lb8:
            r13 = r13 & r9
            boolean r13 = r5.S(r13, r14)
            if (r13 == 0) goto L15c
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r12.f16351i
            java.lang.String r1 = "anti_recall_enable"
            java.lang.String r2 = "防撤回"
            java.lang.String r3 = "保留被撤回的消息，并在下方插入提示"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            r13 = 0
            wb.ho.D1(r13, r5, r10, r9)
            java.lang.String r1 = "anti_recall_keep_self"
            java.lang.String r2 = "保留自己撤回"
            java.lang.String r3 = "开启后自己撤回的消息也会保留"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            wb.ho.D1(r13, r5, r10, r9)
            r4 = 1
            java.lang.String r1 = "anti_recall_show_notice"
            java.lang.String r2 = "显示撤回提示"
            java.lang.String r3 = "在被撤回消息下方插入提示"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            wb.ho.D1(r13, r5, r10, r9)
            i0.a1 r14 = r12.f16350h
            java.lang.Object r0 = r14.getValue()
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.util.List r3 = wb.ho.f16640h
            java.lang.Object r0 = r5.P()
            i0.e r11 = i0.l.f5952a
            if (r0 != r11) goto L107
            wb.ab r0 = new wb.ab
            r1 = 27
            r0.<init>(r14, r1)
            r5.k0(r0)
        L107:
            fg.l r0 = (fg.l) r0
            r7 = 196662(0x30036, float:2.75582E-40)
            r8 = 16
            r6 = r5
            r5 = r0
            java.lang.String r0 = "提示文案"
            java.lang.String r1 = "点击下方变量插入到光标位置"
            r4 = 0
            wb.ho.i4(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r5 = r6
            boolean r14 = r12.f16352j
            if (r14 == 0) goto L152
            r14 = 1891111495(0x70b81247, float:4.557387E29)
            r5.a0(r14)
            wb.ho.D1(r13, r5, r10, r9)
            i0.a1 r13 = r12.f16353k
            java.lang.Object r14 = r13.getValue()
            r2 = r14
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r14 = r5.P()
            if (r14 != r11) goto L13f
            wb.ab r14 = new wb.ab
            r0 = 28
            r14.<init>(r13, r0)
            r5.k0(r14)
        L13f:
            r4 = r14
            fg.l r4 = (fg.l) r4
            r6 = 24630(0x6036, float:3.4514E-41)
            r7 = 8
            java.lang.String r0 = "时间格式"
            java.lang.String r1 = "使用日期格式，例如 yyyy-MM-dd HH:mm:ss"
            r3 = 0
            wb.ho.C1(r0, r1, r2, r3, r4, r5, r6, r7)
            r5.p(r10)
            goto L15f
        L152:
            r13 = 1891390185(0x70bc52e9, float:4.662673E29)
            r5.a0(r13)
            r5.p(r10)
            goto L15f
        L15c:
            r5.V()
        L15f:
            sf.n r13 = sf.n.f12433a
            return r13
    }
}
