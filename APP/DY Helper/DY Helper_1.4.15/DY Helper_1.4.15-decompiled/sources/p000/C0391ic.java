package p000;

/* JADX INFO: renamed from: ic */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0391ic implements p000.e80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4990;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f4991;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f4992;

    public /* synthetic */ C0391ic(p000.C0024an r2, p000.C0464kc r3) {
            r1 = this;
            r0 = 1
            r1.f4990 = r0
            r1.<init>()
            r1.f4991 = r2
            r1.f4992 = r3
            return
    }

    public /* synthetic */ C0391ic(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f4990 = r2
            r0.f4992 = r1
            r0.f4991 = r3
            r0.<init>()
            return
    }

    public /* synthetic */ C0391ic(p000.C0711q4 r1, p000.C0024an r2, int r3) {
            r0 = this;
            r3 = 2
            r0.f4990 = r3
            r0.<init>()
            r0.f4992 = r1
            r0.f4991 = r2
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r14, java.lang.Object r15) {
            r13 = this;
            int r0 = r13.f4990
            r1 = 8
            r2 = 4
            r3 = 1
            r4 = 0
            s62 r5 = p000.s62.f9751
            java.lang.Object r6 = r13.f4991
            java.lang.Object r13 = r13.f4992
            switch(r0) {
                case 0: goto L25e;
                case 1: goto L237;
                case 2: goto L222;
                case 3: goto L1ee;
                case 4: goto L122;
                case 5: goto L103;
                case 6: goto Le3;
                case 7: goto Laa;
                case 8: goto L80;
                case 9: goto L3d;
                case 10: goto L23;
                default: goto L10;
            }
        L10:
            android.app.Activity r13 = (android.app.Activity) r13
            qh1 r6 = (p000.qh1) r6
            android.net.Uri r14 = (android.net.Uri) r14
            java.lang.String r15 = (java.lang.String) r15
            jg1 r0 = new jg1
            r1 = 9
            r0.<init>(r14, r6, r15, r1)
            r13.runOnUiThread(r0)
            return r5
        L23:
            android.widget.ProgressBar r13 = (android.widget.ProgressBar) r13
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            java.lang.String r15 = (java.lang.String) r15
            r15.getClass()
            android.os.Handler r0 = p000.u72.f10629
            vw r1 = new vw
            r1.<init>(r13, r14, r6, r15)
            r0.post(r1)
            return r5
        L3d:
            android.content.Context r13 = (android.content.Context) r13
            um1 r6 = (p000.um1) r6
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            android.widget.Switch r15 = (android.widget.Switch) r15
            r15.getClass()
            bv1 r0 = p000.bv1.f1853
            v00 r0 = new v00
            r0.<init>(r6, r14, r3)
            r13.getClass()
            java.lang.String r1 = "bottom_bar_hidden"
            r15.getClass()
            boolean r3 = p000.i81.m2670(r13)
            if (r3 != 0) goto L79
            boolean r0 = p000.ui1.m5887(r1, r4)
            if (r14 == r0) goto L6a
            p000.i81.m2648(r13)
        L6a:
            boolean r13 = r15.isChecked()
            if (r13 == r0) goto L7f
            jg r13 = new jg
            r13.<init>(r15, r0, r2)
            r15.post(r13)
            goto L7f
        L79:
            p000.ui1.m5871(r1, r14)
            r0.invoke()
        L7f:
            return r5
        L80:
            a80 r13 = (p000.a80) r13
            android.widget.Switch r6 = (android.widget.Switch) r6
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            r14.getClass()
            bv1 r0 = p000.bv1.f1853
            boolean r0 = p000.q02.m4671(r14)
            if (r0 == 0) goto L99
            java.lang.String r14 = "未选择"
        L99:
            r0 = 32
            java.lang.String r14 = p000.bv1.m1042(r14, r0)
            r13.invoke(r14)
            if (r15 == 0) goto La9
            if (r6 == 0) goto La9
            r6.setChecked(r4)
        La9:
            return r5
        Laa:
            android.content.Context r13 = (android.content.Context) r13
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            android.widget.Switch r15 = (android.widget.Switch) r15
            r15.getClass()
            bv1 r0 = p000.bv1.f1853
            r13.getClass()
            boolean r0 = p000.i81.m2670(r13)
            if (r0 != 0) goto Ldc
            boolean r0 = p000.ui1.m5887(r6, r4)
            if (r14 == r0) goto Lcd
            p000.i81.m2648(r13)
        Lcd:
            boolean r13 = r15.isChecked()
            if (r13 == r0) goto Le2
            jg r13 = new jg
            r13.<init>(r15, r0, r2)
            r15.post(r13)
            goto Le2
        Ldc:
            p000.ui1.m5871(r6, r14)
            p000.v71.m6043()
        Le2:
            return r5
        Le3:
            android.app.Activity r13 = (android.app.Activity) r13
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            android.widget.Switch r15 = (android.widget.Switch) r15
            r15.getClass()
            bv1 r15 = p000.bv1.f1853
            java.lang.String r15 = "comment_bg_image_blur_enabled"
            p000.ui1.m5871(r15, r14)
            p000.jx0.m3047(r13)
            if (r14 == 0) goto Lff
            r1 = r4
        Lff:
            r6.setVisibility(r1)
            return r5
        L103:
            qm1 r13 = (p000.qm1) r13
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            android.widget.Switch r15 = (android.widget.Switch) r15
            r15.getClass()
            r13.f9050 = r14
            bv1 r13 = p000.bv1.f1853
            java.lang.String r13 = "info_bar_enabled"
            p000.ui1.m5871(r13, r14)
            if (r14 == 0) goto L11e
            r1 = r4
        L11e:
            r6.setVisibility(r1)
            return r5
        L122:
            android.app.Activity r13 = (android.app.Activity) r13
            android.app.AlertDialog r6 = (android.app.AlertDialog) r6
            lh0 r14 = (p000.lh0) r14
            java.lang.Throwable r15 = (java.lang.Throwable) r15
            r6.dismiss()     // Catch: java.lang.Throwable -> L12d
        L12d:
            boolean r0 = r13.isFinishing()
            if (r0 != 0) goto L1ed
            boolean r0 = r13.isDestroyed()
            if (r0 == 0) goto L13b
            goto L1ed
        L13b:
            r0 = 0
            if (r14 == 0) goto L1b3
            q71 r15 = p000.q71.f8896
            java.lang.Long r15 = r14.f6642
            java.lang.Long r1 = r14.f6643
            java.lang.String r15 = p000.q71.m4800(r15, r1)
            boolean r1 = r14.f6640
            java.lang.String r2 = r14.f6641
            if (r1 == 0) goto L14f
            goto L155
        L14f:
            java.lang.String r6 = "部分导出："
            java.lang.String r2 = r6.concat(r2)
        L155:
            android.app.AlertDialog$Builder r6 = new android.app.AlertDialog$Builder
            r6.<init>(r13)
            if (r1 == 0) goto L15f
            java.lang.String r1 = "导出完成"
            goto L161
        L15f:
            java.lang.String r1 = "导出完成（部分）"
        L161:
            android.app.AlertDialog$Builder r1 = r6.setTitle(r1)
            java.lang.String r6 = r14.f6636
            hh0 r7 = r14.f6637
            java.lang.String r7 = r7.f4738
            int r8 = r14.f6638
            int r9 = r14.f6644
            java.lang.String r10 = "\n格式："
            java.lang.String r11 = "\n消息："
            java.lang.String r12 = "文件："
            java.lang.StringBuilder r6 = p000.lz1.m3695(r12, r6, r10, r7, r11)
            java.lang.String r7 = " 条\n时间："
            java.lang.String r10 = "\n月份："
            p000.lz1.m3671(r6, r8, r7, r15, r10)
            r6.append(r9)
            java.lang.String r15 = " 个\n状态："
            r6.append(r15)
            r6.append(r2)
            java.lang.String r15 = r6.toString()
            android.app.AlertDialog$Builder r15 = r1.setMessage(r15)
            y61 r1 = new y61
            r1.<init>(r13, r14, r4)
            java.lang.String r2 = "打开"
            android.app.AlertDialog$Builder r15 = r15.setPositiveButton(r2, r1)
            y61 r1 = new y61
            r1.<init>(r13, r14, r3)
            java.lang.String r13 = "分享"
            android.app.AlertDialog$Builder r13 = r15.setNeutralButton(r13, r1)
            java.lang.String r14 = "关闭"
            android.app.AlertDialog$Builder r13 = r13.setNegativeButton(r14, r0)
            r13.show()
            goto L1ed
        L1b3:
            boolean r14 = r15 instanceof java.util.concurrent.CancellationException
            if (r14 == 0) goto L1c1
            java.lang.String r14 = "已取消聊天记录导出"
            android.widget.Toast r13 = android.widget.Toast.makeText(r13, r14, r4)
            r13.show()
            goto L1ed
        L1c1:
            if (r15 == 0) goto L1d3
            java.lang.String r14 = r15.getMessage()
            if (r14 == 0) goto L1d3
            boolean r15 = p000.q02.m4671(r14)
            if (r15 != 0) goto L1d0
            goto L1d1
        L1d0:
            r14 = r0
        L1d1:
            if (r14 != 0) goto L1d5
        L1d3:
            java.lang.String r14 = "未知原因"
        L1d5:
            android.app.AlertDialog$Builder r15 = new android.app.AlertDialog$Builder
            r15.<init>(r13)
            java.lang.String r13 = "导出失败"
            android.app.AlertDialog$Builder r13 = r15.setTitle(r13)
            android.app.AlertDialog$Builder r13 = r13.setMessage(r14)
            java.lang.String r14 = "知道了"
            android.app.AlertDialog$Builder r13 = r13.setPositiveButton(r14, r0)
            r13.show()
        L1ed:
            return r5
        L1ee:
            en1 r13 = (p000.en1) r13
            rw1 r6 = (p000.rw1) r6
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            boolean r0 = r15 instanceof p000.InterfaceC0291fn
            if (r0 == 0) goto L204
            fn r15 = (p000.InterfaceC0291fn) r15
            k21 r13 = r13.f3608
            r13.m3127(r15)
            goto L221
        L204:
            boolean r0 = r15 instanceof p000.ho1
            if (r0 != 0) goto L221
            boolean r0 = r15 instanceof p000.a90
            if (r0 == 0) goto L215
            p000.ln0.m3645(r6, r14, r15)
            a90 r15 = (p000.a90) r15
            r13.m1940(r15)
            goto L221
        L215:
            boolean r13 = r15 instanceof p000.bl1
            if (r13 == 0) goto L221
            p000.ln0.m3645(r6, r14, r15)
            bl1 r15 = (p000.bl1) r15
            r15.m980()
        L221:
            return r5
        L222:
            q4 r13 = (p000.C0711q4) r13
            an r6 = (p000.C0024an) r6
            v80 r14 = (p000.v80) r14
            java.lang.Integer r15 = (java.lang.Integer) r15
            r15.getClass()
            r15 = 57
            int r15 = p000.v81.m6136(r15)
            p000.AbstractC0978xb.m6578(r13, r6, r14, r15)
            return r5
        L237:
            an r6 = (p000.C0024an) r6
            kc r13 = (p000.C0464kc) r13
            v80 r14 = (p000.v80) r14
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            r0 = r15 & 3
            r1 = 2
            if (r0 == r1) goto L24a
            r0 = r3
            goto L24b
        L24a:
            r0 = r4
        L24b:
            r15 = r15 & r3
            boolean r15 = r14.m6075(r15, r0)
            if (r15 == 0) goto L25a
            java.lang.Integer r15 = java.lang.Integer.valueOf(r4)
            r6.mo10(r13, r14, r15)
            goto L25d
        L25a:
            r14.m6078()
        L25d:
            return r5
        L25e:
            px0 r13 = (p000.px0) r13
            an r6 = (p000.C0024an) r6
            i12 r14 = (p000.i12) r14
            yo r15 = (p000.C1028yo) r15
            kc r0 = new kc
            long r1 = r15.f12706
            r0.<init>(r14, r1)
            ic r1 = new ic
            r1.<init>(r6, r0)
            an r0 = new an
            r2 = -431986394(0xffffffffe6406926, float:-2.271585E23)
            r0.<init>(r2, r3, r1)
            java.util.List r0 = r14.mo1611(r0)
            long r1 = r15.f12706
            qx0 r13 = r13.mo1688(r14, r0, r1)
            return r13
    }
}
