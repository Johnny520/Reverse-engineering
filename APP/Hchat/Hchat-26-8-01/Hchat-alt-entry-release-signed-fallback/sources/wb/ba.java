package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ba implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f15184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fg.l f15185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15186j;

    public /* synthetic */ ba(android.content.Context r2, fg.l r3, i0.a1 r4) {
            r1 = this;
            r0 = 1
            r1.f15183g = r0
            r1.<init>()
            r1.f15184h = r2
            r1.f15185i = r3
            r1.f15186j = r4
            return
    }

    public /* synthetic */ ba(fg.l r2, android.content.Context r3, i0.a1 r4) {
            r1 = this;
            r0 = 0
            r1.f15183g = r0
            r1.<init>()
            r1.f15185i = r2
            r1.f15184h = r3
            r1.f15186j = r4
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r40 = this;
            r0 = r40
            int r1 = r0.f15183g
            switch(r1) {
                case 0: goto L30;
                default: goto L7;
            }
        L7:
            i0.a1 r1 = r0.f15186j
            java.lang.Object r2 = r1.getValue()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = og.m.t0(r2)
            if (r2 == 0) goto L22
            java.lang.String r1 = "请先选择模型"
            r2 = 0
            android.content.Context r3 = r0.f15184h
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r2)
            r1.show()
            goto L2d
        L22:
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            fg.l r2 = r0.f15185i
            r2.invoke(r1)
        L2d:
            sf.n r1 = sf.n.f12433a
            return r1
        L30:
            i0.a1 r1 = r0.f15186j
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            ua.i r3 = (ua.i) r3
            java.lang.Object r2 = r1.getValue()
            ua.i r2 = (ua.i) r2
            java.lang.String r2 = r2.f13624b
            boolean r4 = og.m.t0(r2)
            if (r4 == 0) goto L49
            java.lang.String r2 = "收款模板"
        L49:
            r4 = r2
            java.lang.Object r1 = r1.getValue()
            ua.i r1 = (ua.i) r1
            java.util.List r1 = r1.f13644v
            java.util.ArrayList r27 = wb.ho.X4(r1)
            r38 = -2097155(0xffffffffffdffffd, float:NaN)
            r39 = 1
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            ua.i r1 = ua.i.a(r3, r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            fg.l r2 = r0.f15185i
            r2.invoke(r1)
            java.lang.String r1 = "收款模板已保存"
            r2 = 0
            android.content.Context r3 = r0.f15184h
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r2)
            r1.show()
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
