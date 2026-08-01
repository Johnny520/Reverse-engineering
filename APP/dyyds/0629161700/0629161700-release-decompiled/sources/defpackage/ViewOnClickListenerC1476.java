package defpackage;

/* JADX INFO: renamed from: ᛸᛴᲀᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1476 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f6524;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f6525;

    public /* synthetic */ ViewOnClickListenerC1476(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f6525 = r1
            r0.f6524 = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r7) {
            r6 = this;
            int r0 = r6.f6525
            java.lang.Object r6 = r6.f6524
            switch(r0) {
                case 0: goto L131;
                case 1: goto Lf2;
                case 2: goto Lc5;
                case 3: goto Lbd;
                case 4: goto La7;
                case 5: goto L9b;
                case 6: goto L95;
                case 7: goto L78;
                case 8: goto L72;
                case 9: goto L58;
                case 10: goto L52;
                default: goto L7;
            }
        L7:
            ᛳᛵᛴᛴ r6 = (defpackage.C0478) r6
            java.lang.Object r7 = r6.f2404
            android.widget.EditText r7 = (android.widget.EditText) r7
            java.lang.String r1 = defpackage.AbstractC0225.m809(r7)
            java.lang.Object r7 = r6.f2399
            android.widget.EditText r7 = (android.widget.EditText) r7
            java.lang.String r2 = defpackage.AbstractC0225.m809(r7)
            java.lang.Object r6 = r6.f2401
            android.widget.EditText r6 = (android.widget.EditText) r6
            java.lang.String r3 = defpackage.AbstractC0225.m809(r6)
            int r6 = r1.length()
            if (r6 != 0) goto L28
            goto L35
        L28:
            int r6 = r2.length()
            if (r6 != 0) goto L2f
            goto L35
        L2f:
            int r6 = r3.length()
            if (r6 != 0) goto L42
        L35:
            r6 = -134394106256942(0xffff85c4ef0961d2, double:NaN)
            java.lang.String r6 = "请填写完整信息"
            defpackage.AbstractC0209.m764(r6)
            goto L51
        L42:
            ᛷᲈᛳᛳ r6 = defpackage.AbstractC1140.m2170()
            ᛸᲈᲇᛴ r0 = new ᛸᲈᲇᛴ
            r5 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            r7 = 3
            defpackage.AbstractC0397.m1149(r6, r4, r0, r7)
        L51:
            return
        L52:
            ᛶᛸᲈᛶ r6 = (defpackage.C1135) r6
            r6.mo1032()
            return
        L58:
            android.app.Activity r6 = (android.app.Activity) r6
            ᛶᛶᲇᲈ r7 = defpackage.C1394.f6045
            r7.getClass()
            r0 = -140935341448750(0xffff7fd1ef0961d2, double:NaN)
            ᛷᲇᲇᲀ r7 = new ᛷᲇᲇᲀ
            r7.<init>(r6)
            ᛶᛵᛳᛸ r6 = r7.f6051
            r6.m2032()
            return
        L72:
            android.widget.Switch r6 = (android.widget.Switch) r6
            r6.toggle()
            return
        L78:
            java.lang.String r6 = (java.lang.String) r6
            ᛷᲈᲀ r0 = defpackage.C1403.f6102
            android.content.Context r7 = r7.getContext()
            r1 = -583621915614766(0xfffded32ef0961d2, double:NaN)
            r1 = -583690635091502(0xfffded22ef0961d2, double:NaN)
            java.lang.String r1 = "已复制uid到剪切板"
            r0.m2569(r7, r6, r1)
            return
        L95:
            ᲀᲈᛵᲇ r6 = (defpackage.InterfaceC1781) r6
            r6.mo1032()
            return
        L9b:
            ᲀᛷᲈᛵ r6 = (defpackage.DialogC1716) r6
            ᛱᛴᲈᛸ r7 = r6.f7628
            boolean r7 = r7.f826
            if (r7 == 0) goto La6
            r6.dismiss()
        La6:
            return
        La7:
            ᛸᛱᛴᲁ r6 = (defpackage.C1419) r6
            java.lang.Object r6 = r6.f6211
            if (r6 != 0) goto Lb7
            r6 = -79710582644270(0xffffb780ef0961d2, double:NaN)
            r6 = 0
            goto Lb9
        Lb7:
            android.app.AlertDialog r6 = (android.app.AlertDialog) r6
        Lb9:
            r6.dismiss()
            return
        Lbd:
            ᛱᛴᛶᲇ r6 = (defpackage.C0078) r6
            android.widget.Switch r6 = r6.f801
            r6.toggle()
            return
        Lc5:
            ᛳᛸᲀᲁ r6 = (defpackage.C0531) r6
            boolean r7 = r6.f2643
            r0 = r7 ^ 1
            r6.f2643 = r0
            android.widget.TextView r0 = r6.f2647
            if (r7 != 0) goto Ld3
            r7 = 0
            goto Ld5
        Ld3:
            r7 = 8
        Ld5:
            r0.setVisibility(r7)
            android.widget.TextView r7 = r6.f2650
            boolean r6 = r6.f2643
            if (r6 == 0) goto Le8
            r0 = -734143339470382(0xfffd644cef0961d2, double:NaN)
        Le3:
            java.lang.String r6 = "收起"
            goto Lee
        Le8:
            r0 = -734156224372270(0xfffd6449ef0961d2, double:NaN)
            goto Le3
        Lee:
            r7.setText(r6)
            return
        Lf2:
            android.view.View r6 = (android.view.View) r6
            android.content.Context r7 = r6.getContext()
            ᛶᛵᛳᛸ r7 = defpackage.C1069.m2030(r7)
            r0 = -549601479663150(0xfffe0c23ef0961d2, double:NaN)
            java.lang.String r0 = "评论设置"
            r7.f4775 = r0
            r7.mo2037()
            ᛲᲀᛱᲁ r0 = defpackage.C0346.f1773
            android.app.Activity r1 = r7.m271()
            r0.getClass()
            defpackage.C0346.m1051(r1)
            long r0 = defpackage.C1771.f7832
            ᛴᛵᲁᛴ r2 = new ᛴᛵᲁᛴ
            r2.<init>(r7)
            r7.f4776 = r2
            r7.mo2037()
            ᛳᛶᛶᛷ r2 = new ᛳᛶᛶᛷ
            r2.<init>(r0, r6)
            r7.f384 = r2
            android.content.Context r6 = r6.getContext()
            r7.m2034(r6)
            return
        L131:
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            ᛶᲀᛵ r7 = defpackage.C1141.f5173
            r0 = -122922248609326(0xffff9033ef0961d2, double:NaN)
            java.lang.String r0 = ""
            r7.getClass()
            r1 = -18266780507694(0xffffef62ef0961d2, double:NaN)
            ᲀᲇᛸᛶ r7 = defpackage.C1141.f5141
            ᲁᛷᛶᛶ[] r1 = defpackage.C1141.f5221
            r2 = 44
            r1 = r1[r2]
            r7.m3168(r1, r0)
            defpackage.C1326.m2453(r6)
            defpackage.C1500.m2706()
            return
    }
}
