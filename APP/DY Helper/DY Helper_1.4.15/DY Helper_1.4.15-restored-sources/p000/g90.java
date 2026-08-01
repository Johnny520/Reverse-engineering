package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g90 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4283;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f4284;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f4285;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f4286;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.Object f4287;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ java.lang.Object f4288;

    public /* synthetic */ g90(android.app.Activity r1, p000.um1 r2, java.lang.Object r3, android.widget.TextView r4, java.lang.Object r5, int r6) {
            r0 = this;
            r0.f4283 = r6
            r0.f4288 = r1
            r0.f4285 = r2
            r0.f4286 = r3
            r0.f4284 = r4
            r0.f4287 = r5
            r0.<init>()
            return
    }

    public /* synthetic */ g90(java.util.List r2, android.app.Activity r3, p000.C0598nt r4, android.app.AlertDialog r5, java.util.LinkedHashMap r6) {
            r1 = this;
            r0 = 3
            r1.f4283 = r0
            r1.<init>()
            r1.f4285 = r2
            r1.f4288 = r3
            r1.f4286 = r4
            r1.f4287 = r5
            r1.f4284 = r6
            return
    }

    public /* synthetic */ g90(p000.C0568n r2, android.app.AlertDialog r3, android.widget.ProgressBar r4, android.widget.TextView r5, android.widget.TextView r6) {
            r1 = this;
            r0 = 1
            r1.f4283 = r0
            r1.<init>()
            r1.f4285 = r2
            r1.f4284 = r5
            r1.f4286 = r6
            r1.f4287 = r4
            r1.f4288 = r3
            return
    }

    public /* synthetic */ g90(p000.um1 r2, android.widget.LinearLayout r3, p000.um1 r4, android.app.Activity r5, android.widget.TextView r6) {
            r1 = this;
            r0 = 0
            r1.f4283 = r0
            r1.<init>()
            r1.f4285 = r2
            r1.f4287 = r3
            r1.f4286 = r4
            r1.f4288 = r5
            r1.f4284 = r6
            return
    }

    public /* synthetic */ g90(p000.va2 r2, android.app.Dialog r3, java.lang.reflect.Method r4, java.lang.Object r5, java.lang.Object[] r6) {
            r1 = this;
            r0 = 5
            r1.f4283 = r0
            r1.<init>()
            r1.f4285 = r2
            r1.f4286 = r3
            r1.f4287 = r4
            r1.f4288 = r5
            r1.f4284 = r6
            return
    }

    public /* synthetic */ g90(p000.zc0 r2, android.widget.TextView r3, android.widget.TextView r4, java.util.LinkedHashMap r5, java.util.List r6) {
            r1 = this;
            r0 = 2
            r1.f4283 = r0
            r1.<init>()
            r1.f4285 = r6
            r1.f4286 = r2
            r1.f4287 = r5
            r1.f4284 = r3
            r1.f4288 = r4
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r13) {
            r12 = this;
            int r13 = r12.f4283
            r0 = 0
            java.lang.Object r1 = r12.f4287
            java.lang.Object r2 = r12.f4284
            java.lang.Object r3 = r12.f4286
            java.lang.Object r4 = r12.f4285
            java.lang.Object r12 = r12.f4288
            switch(r13) {
                case 0: goto L125;
                case 1: goto Lfd;
                case 2: goto Ld4;
                case 3: goto L90;
                case 4: goto L68;
                case 5: goto L54;
                default: goto L10;
            }
        L10:
            r6 = r12
            android.app.Activity r6 = (android.app.Activity) r6
            r7 = r4
            um1 r7 = (p000.um1) r7
            r8 = r3
            pa2 r8 = (p000.pa2) r8
            r9 = r2
            android.widget.TextView r9 = (android.widget.TextView) r9
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            la2 r5 = new la2
            r11 = 1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            za2 r12 = new za2
            r12.<init>()
            zd r13 = new zd
            r0 = 4
            r13.<init>(r0, r5)
            r12.f13021 = r13
            android.app.FragmentManager r13 = r6.getFragmentManager()
            android.app.FragmentTransaction r13 = r13.beginTransaction()
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "dyhelper_voice_audio_picker_"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.app.FragmentTransaction r12 = r13.add(r12, r0)
            r12.commitAllowingStateLoss()
            return
        L54:
            va2 r4 = (p000.va2) r4
            android.app.Dialog r3 = (android.app.Dialog) r3
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r4.m6142()
            r3.dismiss()
            ib2 r13 = p000.ib2.f4981
            p000.ib2.m2727(r12, r1, r2)
            return
        L68:
            android.app.Activity r12 = (android.app.Activity) r12
            um1 r4 = (p000.um1) r4
            r7 = r3
            ky1 r7 = (p000.ky1) r7
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r13 = p000.pf1.f8541
            java.lang.Object r13 = r4.f10912
            r5 = r13
            java.lang.String r5 = (java.lang.String) r5
            wy1 r8 = new wy1
            r8.<init>(r4, r2, r1)
            r12.getClass()
            r5.getClass()
            xg0 r3 = new xg0
            r6 = 1
            r4 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r4.runOnUiThread(r3)
            return
        L90:
            java.util.List r4 = (java.util.List) r4
            android.app.Activity r12 = (android.app.Activity) r12
            nt r3 = (p000.C0598nt) r3
            android.app.AlertDialog r1 = (android.app.AlertDialog) r1
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            java.util.Iterator r13 = r4.iterator()
        L9e:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto Lc4
            java.lang.Object r4 = r13.next()
            ku1 r4 = (p000.ku1) r4
            bv1 r5 = p000.bv1.f1853
            java.lang.String r5 = r4.f6118
            java.lang.String r6 = "feed_right_control_hide_"
            java.lang.String r5 = r6.concat(r5)
            java.lang.String r4 = r4.f6118
            java.lang.Object r4 = r2.get(r4)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r4 = p000.ln0.m3626(r4, r6)
            p000.ui1.m5871(r5, r4)
            goto L9e
        Lc4:
            java.lang.String r13 = "右侧控件屏蔽配置已保存，建议重进视频页"
            android.widget.Toast r12 = android.widget.Toast.makeText(r12, r13, r0)
            r12.show()
            r3.invoke()
            r1.dismiss()
            return
        Ld4:
            java.util.List r4 = (java.util.List) r4
            zc0 r3 = (p000.zc0) r3
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.widget.TextView r12 = (android.widget.TextView) r12
            java.util.Iterator r13 = r4.iterator()
        Le2:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto Lf6
            java.lang.Object r0 = r13.next()
            ku1 r0 = (p000.ku1) r0
            java.lang.String r0 = r0.f6118
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r1.put(r0, r5)
            goto Le2
        Lf6:
            r3.notifyDataSetChanged()
            p000.bv1.m1047(r2, r4, r12, r1)
            return
        Lfd:
            n r4 = (p000.C0568n) r4
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            android.app.AlertDialog r12 = (android.app.AlertDialog) r12
            java.lang.Object r13 = r4.f7336
            java.util.concurrent.atomic.AtomicBoolean r13 = (java.util.concurrent.atomic.AtomicBoolean) r13
            r4 = 1
            r13.set(r4)
            java.lang.String r13 = "正在取消导出…"
            r2.setText(r13)
            java.lang.String r13 = "正在安全关闭文件，请稍候"
            r3.setText(r13)
            r1.setIndeterminate(r4)
            r13 = -2
            android.widget.Button r12 = r12.getButton(r13)
            r12.setEnabled(r0)
            return
        L125:
            um1 r4 = (p000.um1) r4
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            um1 r3 = (p000.um1) r3
            android.app.Activity r12 = (android.app.Activity) r12
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.Object r13 = r4.f10912
            if (r13 != 0) goto L181
            boolean r13 = r1.isEnabled()
            if (r13 != 0) goto L13a
            goto L181
        L13a:
            s90[] r13 = p000.s90.values()
            java.lang.Object r1 = r3.f10912
            int r1 = p000.AbstractC0312g7.m2254(r13, r1)
            if (r1 >= 0) goto L147
            r1 = r0
        L147:
            android.app.AlertDialog$Builder r4 = new android.app.AlertDialog$Builder
            r4.<init>(r12)
            java.lang.String r5 = "选择下载源"
            android.app.AlertDialog$Builder r4 = r4.setTitle(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r13.length
            r5.<init>(r6)
            int r6 = r13.length
            r7 = r0
        L15a:
            if (r7 >= r6) goto L166
            r8 = r13[r7]
            java.lang.String r8 = r8.f9771
            r5.add(r8)
            int r7 = r7 + 1
            goto L15a
        L166:
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r5.toArray(r0)
            java.lang.CharSequence[] r0 = (java.lang.CharSequence[]) r0
            l90 r5 = new l90
            r5.<init>(r13, r3, r2, r12)
            android.app.AlertDialog$Builder r12 = r4.setSingleChoiceItems(r0, r1, r5)
            java.lang.String r13 = "取消"
            r0 = 0
            android.app.AlertDialog$Builder r12 = r12.setNegativeButton(r13, r0)
            r12.show()
        L181:
            return
    }
}
