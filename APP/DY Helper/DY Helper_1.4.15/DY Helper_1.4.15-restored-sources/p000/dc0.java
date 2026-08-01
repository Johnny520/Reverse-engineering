package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class dc0 {

    /* JADX INFO: renamed from: α */
    public final android.app.Activity f3052;

    /* JADX INFO: renamed from: β */
    public final java.lang.ClassLoader f3053;

    /* JADX INFO: renamed from: γ */
    public final android.view.View f3054;

    /* JADX INFO: renamed from: δ */
    public final android.widget.TextView f3055;

    /* JADX INFO: renamed from: ε */
    public final android.widget.TextView f3056;

    /* JADX INFO: renamed from: ζ */
    public final android.widget.TextView f3057;

    /* JADX INFO: renamed from: η */
    public final android.widget.TextView f3058;

    /* JADX INFO: renamed from: θ */
    public final android.widget.TextView f3059;

    /* JADX INFO: renamed from: ι */
    public final android.widget.ListView f3060;

    /* JADX INFO: renamed from: κ */
    public final android.widget.TextView f3061;

    /* JADX INFO: renamed from: λ */
    public final android.widget.TextView f3062;

    /* JADX INFO: renamed from: μ */
    public final android.view.View f3063;

    /* JADX INFO: renamed from: ν */
    public final android.view.View f3064;

    /* JADX INFO: renamed from: ξ */
    public final android.app.AlertDialog f3065;

    /* JADX INFO: renamed from: ο */
    public final java.util.concurrent.atomic.AtomicBoolean f3066;

    /* JADX INFO: renamed from: π */
    public final java.util.LinkedHashMap f3067;

    /* JADX INFO: renamed from: ρ */
    public final p000.ub0 f3068;

    /* JADX INFO: renamed from: σ */
    public java.util.List f3069;

    /* JADX INFO: renamed from: τ */
    public int f3070;

    /* JADX INFO: renamed from: υ */
    public boolean f3071;

    /* JADX INFO: renamed from: φ */
    public boolean f3072;

    /* JADX INFO: renamed from: χ */
    public java.lang.String f3073;

    /* JADX INFO: renamed from: ψ */
    public java.lang.String f3074;

    /* JADX INFO: renamed from: ω */
    public p000.C0598nt f3075;

    public dc0(android.app.Activity r6) {
            r5 = this;
            r6.getClass()
            r5.<init>()
            r5.f3052 = r6
            java.lang.Class r0 = r6.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            if (r0 == 0) goto Ldd
            r5.f3053 = r0
            x01 r0 = p000.x01.f11964
            java.lang.String r1 = "dialog_group_apply_manager"
            r2 = 2131492904(0x7f0c0028, float:1.8609273E38)
            android.view.View r0 = r0.m6476(r2, r6, r1)
            r5.f3054 = r0
            java.lang.String r1 = "group_apply_tv_close"
            r2 = 2131296612(0x7f090164, float:1.8211146E38)
            java.lang.Class<android.widget.TextView> r3 = android.widget.TextView.class
            android.view.View r1 = r5.m1692(r2, r3, r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r5.f3055 = r1
            java.lang.String r1 = "group_apply_tv_title"
            r2 = 2131296616(0x7f090168, float:1.8211154E38)
            android.view.View r1 = r5.m1692(r2, r3, r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r5.f3056 = r1
            java.lang.String r1 = "group_apply_tv_count"
            r2 = 2131296613(0x7f090165, float:1.8211148E38)
            android.view.View r1 = r5.m1692(r2, r3, r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r5.f3057 = r1
            java.lang.String r1 = "group_apply_tv_status"
            r2 = 2131296615(0x7f090167, float:1.8211152E38)
            android.view.View r1 = r5.m1692(r2, r3, r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r5.f3058 = r1
            java.lang.String r1 = "group_apply_tv_empty"
            r2 = 2131296614(0x7f090166, float:1.821115E38)
            android.view.View r1 = r5.m1692(r2, r3, r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r5.f3059 = r1
            r1 = 2131296610(0x7f090162, float:1.8211142E38)
            java.lang.Class<android.widget.ListView> r2 = android.widget.ListView.class
            java.lang.String r4 = "group_apply_list"
            android.view.View r1 = r5.m1692(r1, r2, r4)
            android.widget.ListView r1 = (android.widget.ListView) r1
            r5.f3060 = r1
            java.lang.String r1 = "group_apply_action_reload"
            r2 = 2131296602(0x7f09015a, float:1.8211125E38)
            android.view.View r1 = r5.m1692(r2, r3, r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r5.f3061 = r1
            java.lang.String r1 = "group_apply_action_approve_all"
            r2 = 2131296601(0x7f090159, float:1.8211123E38)
            android.view.View r1 = r5.m1692(r2, r3, r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r5.f3062 = r1
            java.lang.String r1 = "group_apply_top_divider"
            r2 = 2131296611(0x7f090163, float:1.8211144E38)
            java.lang.Class<android.view.View> r3 = android.view.View.class
            android.view.View r1 = r5.m1692(r2, r3, r1)
            r5.f3063 = r1
            java.lang.String r1 = "group_apply_bottom_divider"
            r2 = 2131296603(0x7f09015b, float:1.8211127E38)
            android.view.View r1 = r5.m1692(r2, r3, r1)
            r5.f3064 = r1
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r6)
            android.app.AlertDialog$Builder r0 = r1.setView(r0)
            android.app.AlertDialog r0 = r0.create()
            r5.f3065 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r5.f3066 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r5.f3067 = r0
            ub0 r0 = new ub0
            yb0 r1 = new yb0
            r2 = 2
            r1.<init>(r5, r2)
            r0.<init>(r6, r1)
            r5.f3068 = r0
            jz r6 = p000.C0450jz.f5672
            r5.f3069 = r6
            java.lang.String r6 = "正在加载可管理群"
            r5.f3073 = r6
            java.lang.String r6 = ""
            r5.f3074 = r6
            return
        Ldd:
            java.lang.String r5 = "宿主 Activity ClassLoader 不可用"
            p000.C1080.m7275(r5)
            r5 = 0
            throw r5
    }

    /* JADX INFO: renamed from: α */
    public final void m1689(java.util.List r9) {
            r8 = this;
            boolean r0 = r8.f3071
            if (r0 != 0) goto L98
            boolean r0 = r8.f3072
            if (r0 != 0) goto L98
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L10
            goto L98
        L10:
            int r0 = r9.size()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L5d
            java.lang.Object r0 = p000.AbstractC0984xh.m6638(r9)
            ic0 r0 = (p000.ic0) r0
            long r3 = r0.f4994
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.util.LinkedHashMap r4 = r8.f3067
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L4e
            long r3 = r0.f4994
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            r6 = 0
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 <= 0) goto L3b
            goto L3c
        L3b:
            r5 = r1
        L3c:
            if (r5 == 0) goto L49
            long r3 = r5.longValue()
            java.lang.String r5 = "UID "
            java.lang.String r3 = p000.AbstractC0602nx.m4126(r3, r5)
            goto L4a
        L49:
            r3 = r1
        L4a:
            if (r3 != 0) goto L4e
            java.lang.String r3 = "未知申请人"
        L4e:
            uw0 r0 = r0.f4996
            java.lang.String r0 = r0.f10972
            java.lang.String r4 = " 加入“"
            java.lang.String r5 = "”吗？"
            java.lang.String r6 = "确认通过 "
            java.lang.String r0 = p000.lz1.m3689(r6, r3, r4, r0, r5)
            goto L69
        L5d:
            int r0 = r9.size()
            java.lang.String r3 = "确认通过当前全部 "
            java.lang.String r4 = " 条入群申请吗？\n\n将按宿主限制分批提交，提交后自动刷新最终状态。"
            java.lang.String r0 = p000.AbstractC0602nx.m4127(r3, r0, r4)
        L69:
            android.app.AlertDialog$Builder r3 = new android.app.AlertDialog$Builder
            android.app.Activity r4 = r8.f3052
            r3.<init>(r4)
            int r4 = r9.size()
            if (r4 != r2) goto L79
            java.lang.String r2 = "通过入群申请"
            goto L7b
        L79:
            java.lang.String r2 = "一键通过全部申请"
        L7b:
            android.app.AlertDialog$Builder r2 = r3.setTitle(r2)
            android.app.AlertDialog$Builder r0 = r2.setMessage(r0)
            java.lang.String r2 = "取消"
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r2, r1)
            bc0 r1 = new bc0
            r2 = 0
            r1.<init>(r8, r2, r9)
            java.lang.String r8 = "确认通过"
            android.app.AlertDialog$Builder r8 = r0.setPositiveButton(r8, r1)
            r8.show()
        L98:
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m1690(p000.p70 r4) {
            r3 = this;
            android.os.Handler r0 = p000.ec0.f3479
            w1 r1 = new w1
            r2 = 22
            r1.<init>(r3, r2, r4)
            r0.post(r1)
            return
    }

    /* JADX INFO: renamed from: γ */
    public final java.util.Map m1691(java.util.List r4) {
            r3 = this;
            f7 r3 = new f7
            r0 = 1
            r3.<init>(r0, r4)
            cc0 r4 = p000.cc0.f2062
            t52 r0 = new t52
            r0.<init>(r3, r4)
            s20 r3 = new s20
            r4 = 29
            r3.<init>(r4)
            y30 r4 = new y30
            r1 = 1
            r4.<init>(r0, r1, r3)
            cu r3 = p000.us1.m5952(r4)
            zb0 r4 = new zb0
            r0 = 0
            r4.<init>(r0)
            y30 r3 = p000.us1.m5943(r3, r4)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            x30 r0 = new x30
            r0.<init>(r3)
        L32:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L46
            java.lang.Object r3 = r0.next()
            l91 r3 = (p000.l91) r3
            java.lang.Object r2 = r3.f6502
            java.lang.Object r3 = r3.f6503
            r4.put(r2, r3)
            goto L32
        L46:
            int r3 = r4.size()
            if (r3 == 0) goto L6d
            if (r3 == r1) goto L4f
            return r4
        L4f:
            java.util.Set r3 = r4.entrySet()
            java.util.Iterator r3 = r3.iterator()
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            java.util.Map r3 = java.util.Collections.singletonMap(r4, r3)
            r3.getClass()
            return r3
        L6d:
            kz r3 = p000.C0493kz.f6332
            return r3
    }

    /* JADX INFO: renamed from: δ */
    public final android.view.View m1692(int r2, java.lang.Class r3, java.lang.String r4) {
            r1 = this;
            x01 r0 = p000.x01.f11964
            android.view.View r1 = r1.f3054
            android.view.View r1 = p000.x01.m6472(r1, r4, r2, r3)
            return r1
    }

    /* JADX INFO: renamed from: ε */
    public final void m1693() {
            r9 = this;
            android.app.Activity r0 = r9.f3052
            xx r1 = p000.jx0.m3049(r0)
            java.lang.String r2 = r1.f12352
            r3 = 8
            android.graphics.drawable.GradientDrawable r3 = p000.jx0.m3062(r3, r0, r2)
            android.view.View r4 = r9.f3054
            r4.setBackground(r3)
            java.lang.String r3 = r1.f12355
            int r3 = android.graphics.Color.parseColor(r3)
            android.widget.TextView r4 = r9.f3056
            r4.setTextColor(r3)
            java.lang.String r3 = r1.f12356
            int r4 = android.graphics.Color.parseColor(r3)
            android.widget.TextView r5 = r9.f3055
            r5.setTextColor(r4)
            java.lang.String r4 = r1.f12348
            r6 = 6
            android.graphics.drawable.RippleDrawable r2 = p000.jx0.m3059(r6, r0, r4, r2)
            r5.setBackground(r2)
            java.lang.String r2 = r1.f12358
            int r7 = android.graphics.Color.parseColor(r2)
            android.widget.TextView r8 = r9.f3057
            r8.setTextColor(r7)
            java.lang.String r7 = r1.f12359
            android.graphics.drawable.GradientDrawable r7 = p000.jx0.m3062(r6, r0, r7)
            r8.setBackground(r7)
            android.widget.TextView r7 = r9.f3058
            int r8 = android.graphics.Color.parseColor(r3)
            r7.setTextColor(r8)
            android.widget.TextView r7 = r9.f3059
            int r3 = android.graphics.Color.parseColor(r3)
            r7.setTextColor(r3)
            java.lang.String r3 = r1.f12353
            int r7 = android.graphics.Color.parseColor(r3)
            android.view.View r8 = r9.f3063
            r8.setBackgroundColor(r7)
            android.view.View r7 = r9.f3064
            int r3 = android.graphics.Color.parseColor(r3)
            r7.setBackgroundColor(r3)
            java.lang.String r3 = r1.f12360
            int r3 = android.graphics.Color.parseColor(r3)
            android.widget.TextView r7 = r9.f3061
            r7.setTextColor(r3)
            java.lang.String r1 = r1.f12361
            android.graphics.drawable.RippleDrawable r1 = p000.jx0.m3059(r6, r0, r4, r1)
            r7.setBackground(r1)
            r1 = -1
            android.widget.TextView r3 = r9.f3062
            r3.setTextColor(r1)
            android.graphics.drawable.RippleDrawable r1 = p000.jx0.m3059(r6, r0, r4, r2)
            r3.setBackground(r1)
            ac0 r1 = new ac0
            r2 = 0
            r1.<init>(r9, r2)
            r5.setOnClickListener(r1)
            ac0 r1 = new ac0
            r4 = 1
            r1.<init>(r9, r4)
            r7.setOnClickListener(r1)
            ac0 r1 = new ac0
            r4 = 2
            r1.<init>(r9, r4)
            r3.setOnClickListener(r1)
            st r1 = p000.C0810st.f10010
            yb0 r1 = new yb0
            r3 = 3
            r1.<init>(r9, r3)
            java.util.concurrent.CopyOnWriteArraySet r3 = p000.C0810st.f10021
            r3.add(r1)
            nt r3 = new nt
            r3.<init>(r1, r2)
            r9.f3075 = r3
            android.widget.ListView r1 = r9.f3060
            ub0 r3 = r9.f3068
            r1.setAdapter(r3)
            vg r1 = new vg
            r1.<init>(r4, r9)
            android.app.AlertDialog r3 = r9.f3065
            r3.setOnDismissListener(r1)
            r3.setCanceledOnTouchOutside(r2)
            r3.show()
            android.view.Window r1 = r3.getWindow()
            if (r1 == 0) goto Lfd
            android.graphics.drawable.ColorDrawable r3 = new android.graphics.drawable.ColorDrawable
            r3.<init>(r2)
            r1.setBackgroundDrawable(r3)
            android.view.View r3 = r1.getDecorView()
            r3.setPadding(r2, r2, r2, r2)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            float r0 = (float) r0
            r2 = 1064346583(0x3f70a3d7, float:0.94)
            float r0 = r0 * r2
            int r0 = (int) r0
            r2 = -2
            r1.setLayout(r0, r2)
        Lfd:
            r9.m1694()
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final void m1694() {
            r3 = this;
            boolean r0 = r3.f3071
            if (r0 != 0) goto L2b
            boolean r0 = r3.f3072
            if (r0 != 0) goto L2b
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f3066
            boolean r0 = r0.get()
            if (r0 == 0) goto L11
            goto L2b
        L11:
            r0 = 1
            r3.f3071 = r0
            java.lang.String r0 = ""
            r3.f3074 = r0
            java.lang.String r0 = "正在加载可管理群"
            r3.f3073 = r0
            r3.m1695()
            java.util.concurrent.ExecutorService r0 = p000.ec0.f3480
            ν r1 = new ν
            r2 = 18
            r1.<init>(r2, r3)
            r0.execute(r1)
        L2b:
            return
    }

    /* JADX INFO: renamed from: η */
    public final void m1695() {
            r8 = this;
            boolean r0 = r8.f3071
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Ld
            boolean r0 = r8.f3072
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = r1
            goto Le
        Ld:
            r0 = r2
        Le:
            java.util.List r3 = r8.f3069
            int r3 = r3.size()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            android.widget.TextView r4 = r8.f3057
            r4.setText(r3)
            if (r0 == 0) goto L22
            java.lang.String r3 = r8.f3073
            goto L3f
        L22:
            java.lang.String r3 = r8.f3074
            boolean r3 = p000.q02.m4671(r3)
            if (r3 != 0) goto L2d
            java.lang.String r3 = r8.f3074
            goto L3f
        L2d:
            int r3 = r8.f3070
            java.util.List r4 = r8.f3069
            int r4 = r4.size()
            java.lang.String r5 = " 个可管理群，共 "
            java.lang.String r6 = " 条待审核申请"
            java.lang.String r7 = "已检查 "
            java.lang.String r3 = p000.AbstractC0602nx.m4128(r7, r3, r5, r4, r6)
        L3f:
            android.widget.TextView r4 = r8.f3058
            r4.setText(r3)
            java.util.List r3 = r8.f3069
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L4e
            r3 = r1
            goto L50
        L4e:
            r3 = 8
        L50:
            android.widget.TextView r4 = r8.f3059
            r4.setVisibility(r3)
            boolean r3 = r8.f3071
            if (r3 == 0) goto L5c
            java.lang.String r3 = "正在加载入群申请"
            goto L70
        L5c:
            boolean r3 = r8.f3072
            if (r3 == 0) goto L63
            java.lang.String r3 = "正在同步审批结果"
            goto L70
        L63:
            java.util.List r3 = r8.f3069
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L6e
            java.lang.String r3 = "当前没有待审核的入群申请"
            goto L70
        L6e:
            java.lang.String r3 = ""
        L70:
            r4.setText(r3)
            r3 = r0 ^ 1
            android.widget.TextView r4 = r8.f3061
            r4.setEnabled(r3)
            r3 = 1065353216(0x3f800000, float:1.0)
            r5 = 1055286886(0x3ee66666, float:0.45)
            if (r0 == 0) goto L83
            r6 = r5
            goto L84
        L83:
            r6 = r3
        L84:
            r4.setAlpha(r6)
            if (r0 != 0) goto L92
            java.util.List r4 = r8.f3069
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L92
            r1 = r2
        L92:
            android.widget.TextView r4 = r8.f3062
            r4.setEnabled(r1)
            boolean r1 = r4.isEnabled()
            if (r1 == 0) goto L9f
            r1 = r3
            goto La0
        L9f:
            r1 = r5
        La0:
            r4.setAlpha(r1)
            java.util.List r1 = r8.f3069
            int r1 = r1.size()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "一键通过 "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r1 = " 人"
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            r4.setText(r1)
            boolean r1 = r8.f3072
            r1 = r1 ^ r2
            android.widget.TextView r4 = r8.f3055
            r4.setEnabled(r1)
            boolean r1 = r8.f3072
            if (r1 == 0) goto Lcc
            r3 = r5
        Lcc:
            r4.setAlpha(r3)
            boolean r1 = r8.f3072
            r1 = r1 ^ r2
            android.app.AlertDialog r2 = r8.f3065
            r2.setCancelable(r1)
            java.util.List r1 = r8.f3069
            ub0 r2 = r8.f3068
            r2.getClass()
            r1.getClass()
            java.util.LinkedHashMap r8 = r8.f3067
            r8.getClass()
            java.util.ArrayList r3 = r2.f10677
            r3.clear()
            r3.addAll(r1)
            java.util.LinkedHashMap r1 = r2.f10678
            r1.clear()
            r1.putAll(r8)
            r2.f10680 = r0
            r2.notifyDataSetChanged()
            return
    }
}
