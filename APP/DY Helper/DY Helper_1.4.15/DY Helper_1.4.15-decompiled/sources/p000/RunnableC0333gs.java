package p000;

/* JADX INFO: renamed from: gs */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0333gs implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4436;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ int f4437;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f4438;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f4439;

    public /* synthetic */ RunnableC0333gs(int r1, int r2, java.lang.Object r3, java.lang.Object r4) {
            r0 = this;
            r0.f4436 = r2
            r0.f4438 = r3
            r0.f4437 = r1
            r0.f4439 = r4
            r0.<init>()
            return
    }

    public /* synthetic */ RunnableC0333gs(android.app.Activity r2, java.util.concurrent.atomic.AtomicInteger r3, int r4) {
            r1 = this;
            r0 = 1
            r1.f4436 = r0
            r1.<init>()
            r1.f4438 = r2
            r1.f4439 = r3
            r1.f4437 = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r10 = this;
            int r0 = r10.f4436
            r1 = 1
            java.lang.String r2 = "/"
            java.lang.Object r3 = r10.f4439
            int r4 = r10.f4437
            java.lang.Object r10 = r10.f4438
            switch(r0) {
                case 0: goto L124;
                case 1: goto L102;
                case 2: goto Lec;
                case 3: goto Ld6;
                case 4: goto Lcb;
                case 5: goto Lbf;
                default: goto Le;
            }
        Le:
            android.app.Activity r10 = (android.app.Activity) r10
            rb1 r3 = (p000.rb1) r3
            xx r0 = p000.jx0.m3049(r10)
            android.widget.LinearLayout r2 = p000.AbstractC0602nx.m4123(r10, r1)
            r5 = 20
            int r6 = p000.jx0.m3056(r10, r5)
            r7 = 8
            int r8 = p000.jx0.m3056(r10, r7)
            int r5 = p000.jx0.m3056(r10, r5)
            r9 = 0
            r2.setPadding(r6, r8, r5, r9)
            java.lang.String r5 = "智能选择只会比较当前会话已解锁、余额足够且价格不超过该值的种子。0 表示不限制。"
            r6 = 1095761920(0x41500000, float:13.0)
            android.widget.TextView r5 = p000.lz1.m3683(r10, r5, r6)
            java.lang.String r6 = r0.f12356
            int r6 = android.graphics.Color.parseColor(r6)
            r5.setTextColor(r6)
            android.widget.EditText r6 = new android.widget.EditText
            r6.<init>(r10)
            r8 = 2
            r6.setInputType(r8)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r6.setText(r4)
            r6.setSelectAllOnFocus(r9)
            r4 = 1098907648(0x41800000, float:16.0)
            r6.setTextSize(r4)
            java.lang.String r4 = r0.f12355
            int r4 = android.graphics.Color.parseColor(r4)
            r6.setTextColor(r4)
            r6.setSingleLine(r1)
            java.lang.String r1 = r0.f12348
            java.lang.String r4 = r0.f12371
            android.graphics.drawable.RippleDrawable r1 = p000.jx0.m3059(r7, r10, r1, r4)
            r6.setBackground(r1)
            r1 = 12
            int r4 = p000.jx0.m3056(r10, r1)
            int r7 = p000.jx0.m3056(r10, r1)
            r6.setPadding(r4, r9, r7, r9)
            r2.addView(r5)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = 48
            int r5 = p000.jx0.m3056(r10, r5)
            r7 = -1
            r4.<init>(r7, r5)
            int r1 = p000.jx0.m3056(r10, r1)
            r4.topMargin = r1
            r2.addView(r6, r4)
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r10)
            java.lang.String r10 = "智能种子价格上限"
            android.app.AlertDialog$Builder r10 = r1.setTitle(r10)
            android.app.AlertDialog$Builder r10 = r10.setView(r2)
            java.lang.String r1 = "取消"
            r2 = 0
            android.app.AlertDialog$Builder r10 = r10.setNegativeButton(r1, r2)
            java.lang.String r1 = "保存"
            android.app.AlertDialog$Builder r10 = r10.setPositiveButton(r1, r2)
            android.app.AlertDialog r10 = r10.create()
            qd1 r1 = new qd1
            r1.<init>(r10, r0, r6, r3)
            r10.setOnShowListener(r1)
            r10.show()
            return
        Lbf:
            wb1 r10 = (p000.wb1) r10
            ec1 r3 = (p000.ec1) r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r10.invoke(r0, r3)
            return
        Lcb:
            android.app.Activity r10 = (android.app.Activity) r10
            p3 r3 = (p000.C0673p3) r3
            q71 r0 = p000.q71.f8896
            int r4 = r4 - r1
            p000.q71.m4782(r10, r4, r3)
            return
        Ld6:
            android.app.Activity r10 = (android.app.Activity) r10
            java.util.List r3 = (java.util.List) r3
            qy0 r0 = p000.qy0.f9157
            int r0 = r3.size()
            java.lang.String r1 = "已完成 "
            java.lang.String r3 = " 项"
            java.lang.String r0 = p000.AbstractC0602nx.m4128(r1, r4, r2, r0, r3)
            p000.qy0.m4991(r10, r0)
            return
        Lec:
            android.app.Activity r10 = (android.app.Activity) r10
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            qy0 r0 = p000.qy0.f9157
            int r0 = r3.size()
            java.lang.String r1 = "已保存 "
            java.lang.String r3 = " 张图片到相册"
            java.lang.String r0 = p000.AbstractC0602nx.m4128(r1, r4, r2, r0, r3)
            p000.qy0.m4991(r10, r0)
            return
        L102:
            android.app.Activity r10 = (android.app.Activity) r10
            java.util.concurrent.atomic.AtomicInteger r3 = (java.util.concurrent.atomic.AtomicInteger) r3
            qy0 r0 = p000.qy0.f9157
            int r0 = r3.get()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "✅ 批量下载完成: 成功 "
            r1.<init>(r3)
            r1.append(r0)
            r1.append(r2)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            p000.qy0.m4991(r10, r0)
            return
        L124:
            hs r10 = (p000.C0370hs) r10
            hj1 r10 = r10.f4791
            r10.mo2512(r4, r3)
            return
    }
}
