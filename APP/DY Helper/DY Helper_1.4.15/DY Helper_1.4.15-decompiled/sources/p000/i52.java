package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i52 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4923;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.um1 f4924;

    public /* synthetic */ i52(p000.um1 r1, int r2) {
            r0 = this;
            r0.f4923 = r2
            r0.f4924 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            int r0 = r5.f4923
            um1 r5 = r5.f4924
            switch(r0) {
                case 0: goto Laf;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r5.f10912     // Catch: java.lang.Throwable -> La2
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch: java.lang.Throwable -> La2
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch: java.lang.Throwable -> La2
            if (r0 != 0) goto L13
            goto Lae
        L13:
            r1 = -2
            r0.width = r1     // Catch: java.lang.Throwable -> La2
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams     // Catch: java.lang.Throwable -> La2
            r2 = 0
            if (r1 == 0) goto L31
            r1 = r0
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1     // Catch: java.lang.Throwable -> La2
            r1.leftMargin = r2     // Catch: java.lang.Throwable -> La2
            r1 = r0
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1     // Catch: java.lang.Throwable -> La2
            r1.rightMargin = r2     // Catch: java.lang.Throwable -> La2
            r1 = r0
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1     // Catch: java.lang.Throwable -> La2
            r1.setMarginStart(r2)     // Catch: java.lang.Throwable -> La2
            r1 = r0
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1     // Catch: java.lang.Throwable -> La2
            r1.setMarginEnd(r2)     // Catch: java.lang.Throwable -> La2
        L31:
            boolean r1 = r0 instanceof android.widget.RelativeLayout.LayoutParams     // Catch: java.lang.Throwable -> La2
            r3 = 17
            if (r1 == 0) goto L7c
            r1 = r0
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1     // Catch: java.lang.Throwable -> La2
            r4 = 9
            r1.removeRule(r4)     // Catch: java.lang.Throwable -> La2
            r1 = r0
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1     // Catch: java.lang.Throwable -> La2
            r4 = 20
            r1.removeRule(r4)     // Catch: java.lang.Throwable -> La2
            r1 = r0
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1     // Catch: java.lang.Throwable -> La2
            r4 = 11
            r1.removeRule(r4)     // Catch: java.lang.Throwable -> La2
            r1 = r0
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1     // Catch: java.lang.Throwable -> La2
            r4 = 21
            r1.removeRule(r4)     // Catch: java.lang.Throwable -> La2
            r1 = r0
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1     // Catch: java.lang.Throwable -> La2
            r4 = 1
            r1.removeRule(r4)     // Catch: java.lang.Throwable -> La2
            r1 = r0
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1     // Catch: java.lang.Throwable -> La2
            r1.removeRule(r2)     // Catch: java.lang.Throwable -> La2
            r1 = r0
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1     // Catch: java.lang.Throwable -> La2
            r1.removeRule(r3)     // Catch: java.lang.Throwable -> La2
            r1 = r0
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1     // Catch: java.lang.Throwable -> La2
            r2 = 16
            r1.removeRule(r2)     // Catch: java.lang.Throwable -> La2
            r1 = r0
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1     // Catch: java.lang.Throwable -> La2
            r2 = 13
            r4 = -1
            r1.addRule(r2, r4)     // Catch: java.lang.Throwable -> La2
            goto L8f
        L7c:
            boolean r1 = r0 instanceof android.widget.FrameLayout.LayoutParams     // Catch: java.lang.Throwable -> La2
            if (r1 == 0) goto L86
            r1 = r0
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1     // Catch: java.lang.Throwable -> La2
            r1.gravity = r3     // Catch: java.lang.Throwable -> La2
            goto L8f
        L86:
            boolean r1 = r0 instanceof android.widget.LinearLayout.LayoutParams     // Catch: java.lang.Throwable -> La2
            if (r1 == 0) goto L8f
            r1 = r0
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1     // Catch: java.lang.Throwable -> La2
            r1.gravity = r3     // Catch: java.lang.Throwable -> La2
        L8f:
            java.lang.Object r1 = r5.f10912     // Catch: java.lang.Throwable -> La2
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1     // Catch: java.lang.Throwable -> La2
            r1.setLayoutParams(r0)     // Catch: java.lang.Throwable -> La2
            java.lang.Object r5 = r5.f10912     // Catch: java.lang.Throwable -> La2
            boolean r0 = r5 instanceof android.widget.LinearLayout     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto Lae
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5     // Catch: java.lang.Throwable -> La2
            r5.setGravity(r3)     // Catch: java.lang.Throwable -> La2
            goto Lae
        La2:
            r5 = move-exception
            java.lang.String r0 = r5.getMessage()
            java.lang.String r1 = "居中对齐失败 - "
            java.lang.String r2 = "ra3f49bce40b36580"
            p000.AbstractC0602nx.m4145(r1, r0, r2, r5)
        Lae:
            return
        Laf:
            java.lang.Object r0 = r5.f10912     // Catch: java.lang.Throwable -> L14a
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch: java.lang.Throwable -> L14a
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch: java.lang.Throwable -> L14a
            if (r0 != 0) goto Lbb
            goto L156
        Lbb:
            r1 = -2
            r0.width = r1     // Catch: java.lang.Throwable -> L14a
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams     // Catch: java.lang.Throwable -> L14a
            r2 = 0
            if (r1 == 0) goto Ld9
            r1 = r0
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1     // Catch: java.lang.Throwable -> L14a
            r1.leftMargin = r2     // Catch: java.lang.Throwable -> L14a
            r1 = r0
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1     // Catch: java.lang.Throwable -> L14a
            r1.rightMargin = r2     // Catch: java.lang.Throwable -> L14a
            r1 = r0
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1     // Catch: java.lang.Throwable -> L14a
            r1.setMarginStart(r2)     // Catch: java.lang.Throwable -> L14a
            r1 = r0
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1     // Catch: java.lang.Throwable -> L14a
            r1.setMarginEnd(r2)     // Catch: java.lang.Throwable -> L14a
        Ld9:
            boolean r1 = r0 instanceof android.widget.RelativeLayout.LayoutParams     // Catch: java.lang.Throwable -> L14a
            r3 = 17
            if (r1 == 0) goto L124
            r1 = r0
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1     // Catch: java.lang.Throwable -> L14a
            r4 = 9
            r1.removeRule(r4)     // Catch: java.lang.Throwable -> L14a
            r1 = r0
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1     // Catch: java.lang.Throwable -> L14a
            r4 = 20
            r1.removeRule(r4)     // Catch: java.lang.Throwable -> L14a
            r1 = r0
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1     // Catch: java.lang.Throwable -> L14a
            r4 = 11
            r1.removeRule(r4)     // Catch: java.lang.Throwable -> L14a
            r1 = r0
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1     // Catch: java.lang.Throwable -> L14a
            r4 = 21
            r1.removeRule(r4)     // Catch: java.lang.Throwable -> L14a
            r1 = r0
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1     // Catch: java.lang.Throwable -> L14a
            r4 = 1
            r1.removeRule(r4)     // Catch: java.lang.Throwable -> L14a
            r1 = r0
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1     // Catch: java.lang.Throwable -> L14a
            r1.removeRule(r2)     // Catch: java.lang.Throwable -> L14a
            r1 = r0
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1     // Catch: java.lang.Throwable -> L14a
            r1.removeRule(r3)     // Catch: java.lang.Throwable -> L14a
            r1 = r0
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1     // Catch: java.lang.Throwable -> L14a
            r2 = 16
            r1.removeRule(r2)     // Catch: java.lang.Throwable -> L14a
            r1 = r0
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1     // Catch: java.lang.Throwable -> L14a
            r2 = 13
            r4 = -1
            r1.addRule(r2, r4)     // Catch: java.lang.Throwable -> L14a
            goto L137
        L124:
            boolean r1 = r0 instanceof android.widget.FrameLayout.LayoutParams     // Catch: java.lang.Throwable -> L14a
            if (r1 == 0) goto L12e
            r1 = r0
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1     // Catch: java.lang.Throwable -> L14a
            r1.gravity = r3     // Catch: java.lang.Throwable -> L14a
            goto L137
        L12e:
            boolean r1 = r0 instanceof android.widget.LinearLayout.LayoutParams     // Catch: java.lang.Throwable -> L14a
            if (r1 == 0) goto L137
            r1 = r0
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1     // Catch: java.lang.Throwable -> L14a
            r1.gravity = r3     // Catch: java.lang.Throwable -> L14a
        L137:
            java.lang.Object r1 = r5.f10912     // Catch: java.lang.Throwable -> L14a
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1     // Catch: java.lang.Throwable -> L14a
            r1.setLayoutParams(r0)     // Catch: java.lang.Throwable -> L14a
            java.lang.Object r5 = r5.f10912     // Catch: java.lang.Throwable -> L14a
            boolean r0 = r5 instanceof android.widget.LinearLayout     // Catch: java.lang.Throwable -> L14a
            if (r0 == 0) goto L156
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5     // Catch: java.lang.Throwable -> L14a
            r5.setGravity(r3)     // Catch: java.lang.Throwable -> L14a
            goto L156
        L14a:
            r5 = move-exception
            java.lang.String r0 = r5.getMessage()
            java.lang.String r1 = "居中对齐失败 - "
            java.lang.String r2 = "r14983b95b84acb5"
            p000.AbstractC0602nx.m4145(r1, r0, r2, r5)
        L156:
            return
    }
}
