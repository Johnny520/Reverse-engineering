package p000;

/* JADX INFO: renamed from: d9 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0204d9 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f2978;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.AlertDialog f2979;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ android.app.Activity f2980;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f2981;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.Object f2982;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ java.lang.Object f2983;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ java.lang.Object f2984;

    /* JADX INFO: renamed from: μ */
    public final /* synthetic */ java.lang.Object f2985;

    /* JADX INFO: renamed from: ν */
    public final /* synthetic */ java.lang.Object f2986;

    public /* synthetic */ RunnableC0204d9(android.app.AlertDialog r2, p000.C0901v9 r3, android.app.Activity r4, android.widget.LinearLayout r5, p000.C0384i5 r6, p000.a80 r7, java.lang.String r8, java.lang.String r9) {
            r1 = this;
            r0 = 0
            r1.f2978 = r0
            r1.<init>()
            r1.f2979 = r2
            r1.f2981 = r3
            r1.f2980 = r4
            r1.f2982 = r5
            r1.f2983 = r6
            r1.f2984 = r7
            r1.f2985 = r8
            r1.f2986 = r9
            return
    }

    public /* synthetic */ RunnableC0204d9(p000.C1000xx r2, p000.p70 r3, p000.qm1 r4, p000.um1 r5, android.app.Activity r6, android.app.AlertDialog r7, android.widget.TextView r8, android.widget.TextView r9) {
            r1 = this;
            r0 = 1
            r1.f2978 = r0
            r1.<init>()
            r1.f2979 = r7
            r1.f2981 = r4
            r1.f2982 = r5
            r1.f2983 = r8
            r1.f2980 = r6
            r1.f2984 = r2
            r1.f2985 = r9
            r1.f2986 = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r17 = this;
            r0 = r17
            int r1 = r0.f2978
            java.lang.Object r2 = r0.f2986
            java.lang.Object r3 = r0.f2985
            java.lang.Object r4 = r0.f2984
            java.lang.Object r5 = r0.f2983
            java.lang.Object r6 = r0.f2982
            java.lang.Object r7 = r0.f2981
            switch(r1) {
                case 0: goto L80;
                default: goto L13;
            }
        L13:
            qm1 r7 = (p000.qm1) r7
            um1 r6 = (p000.um1) r6
            android.widget.TextView r5 = (android.widget.TextView) r5
            xx r4 = (p000.C1000xx) r4
            android.widget.TextView r3 = (android.widget.TextView) r3
            p70 r2 = (p000.p70) r2
            android.app.AlertDialog r1 = r0.f2979
            boolean r8 = r1.isShowing()
            if (r8 == 0) goto L7f
            boolean r7 = r7.f9050
            if (r7 == 0) goto L2c
            goto L7f
        L2c:
            r7 = 0
            r6.f10912 = r7
            java.lang.String r6 = "已下载"
            r5.setText(r6)
            java.lang.String r6 = r4.f12359
            java.lang.String r4 = r4.f12358
            r8 = 99
            android.app.Activity r0 = r0.f2980
            android.graphics.drawable.GradientDrawable r0 = p000.jx0.m3062(r8, r0, r6)
            r5.setBackground(r0)
            int r0 = android.graphics.Color.parseColor(r4)
            r5.setTextColor(r0)
            r0 = 0
            r3.setVisibility(r0)
            int r0 = android.graphics.Color.parseColor(r4)
            r3.setTextColor(r0)
            java.lang.String r0 = "数据库校验完成"
            r3.setText(r0)
            com.example.dyhelper.hook.γ r0 = com.example.dyhelper.hook.C0157.f2411
            com.example.dyhelper.hook.C0157.m1499()
            if (r2 == 0) goto L6e
            r2.invoke()     // Catch: java.lang.Throwable -> L67
            s62 r7 = p000.s62.f9751     // Catch: java.lang.Throwable -> L67
            goto L6e
        L67:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            goto L6f
        L6e:
            r2 = r7
        L6f:
            java.lang.Throwable r0 = p000.fo1.m2190(r2)
            if (r0 == 0) goto L7c
            java.lang.String r2 = "raf02e3c7781e553e"
            java.lang.String r3 = "安装完成回调执行失败"
            p000.C0888ux.m5977(r2, r3, r0)
        L7c:
            r1.dismiss()
        L7f:
            return
        L80:
            v9 r7 = (p000.C0901v9) r7
            r9 = r6
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r11 = r5
            i5 r11 = (p000.C0384i5) r11
            r12 = r4
            a80 r12 = (p000.a80) r12
            r14 = r3
            java.lang.String r14 = (java.lang.String) r14
            r15 = r2
            java.lang.String r15 = (java.lang.String) r15
            android.app.AlertDialog r10 = r0.f2979
            boolean r1 = r10.isShowing()
            if (r1 != 0) goto L9a
            goto Lb1
        L9a:
            boolean r1 = r7.f11181
            android.app.Activity r8 = r0.f2980
            if (r1 == 0) goto La8
            g9 r13 = p000.EnumC0314g9.f4280
            java.lang.String r16 = ""
            p000.h62.m2442(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto Lb1
        La8:
            g9 r13 = p000.EnumC0314g9.f4281
            java.lang.String r0 = r7.f11182
            r16 = r0
            p000.h62.m2442(r8, r9, r10, r11, r12, r13, r14, r15, r16)
        Lb1:
            return
    }
}
