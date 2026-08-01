package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class nd0 {

    /* JADX INFO: renamed from: Α */
    public final android.app.AlertDialog f7525;

    /* JADX INFO: renamed from: Β */
    public final java.util.LinkedHashSet f7526;

    /* JADX INFO: renamed from: Γ */
    public final java.util.LinkedHashSet f7527;

    /* JADX INFO: renamed from: Δ */
    public p000.ad0 f7528;

    /* JADX INFO: renamed from: Ε */
    public java.lang.String f7529;

    /* JADX INFO: renamed from: Ζ */
    public boolean f7530;

    /* JADX INFO: renamed from: Η */
    public java.lang.String f7531;

    /* JADX INFO: renamed from: Θ */
    public java.util.List f7532;

    /* JADX INFO: renamed from: Ι */
    public p000.C0598nt f7533;

    /* JADX INFO: renamed from: α */
    public final android.app.Activity f7534;

    /* JADX INFO: renamed from: β */
    public final p000.C0286fi f7535;

    /* JADX INFO: renamed from: γ */
    public final android.os.Handler f7536;

    /* JADX INFO: renamed from: δ */
    public final java.util.concurrent.atomic.AtomicBoolean f7537;

    /* JADX INFO: renamed from: ε */
    public final java.lang.ClassLoader f7538;

    /* JADX INFO: renamed from: ζ */
    public final android.view.View f7539;

    /* JADX INFO: renamed from: η */
    public final android.view.View f7540;

    /* JADX INFO: renamed from: θ */
    public final android.widget.TextView f7541;

    /* JADX INFO: renamed from: ι */
    public final android.widget.TextView f7542;

    /* JADX INFO: renamed from: κ */
    public final android.widget.TextView f7543;

    /* JADX INFO: renamed from: λ */
    public final android.view.View f7544;

    /* JADX INFO: renamed from: μ */
    public final android.widget.TextView f7545;

    /* JADX INFO: renamed from: ν */
    public final android.widget.TextView f7546;

    /* JADX INFO: renamed from: ξ */
    public final android.view.View f7547;

    /* JADX INFO: renamed from: ο */
    public final android.widget.EditText f7548;

    /* JADX INFO: renamed from: π */
    public final android.widget.ProgressBar f7549;

    /* JADX INFO: renamed from: ρ */
    public final android.widget.TextView f7550;

    /* JADX INFO: renamed from: σ */
    public final android.widget.ListView f7551;

    /* JADX INFO: renamed from: τ */
    public final android.view.View f7552;

    /* JADX INFO: renamed from: υ */
    public final android.widget.TextView f7553;

    /* JADX INFO: renamed from: φ */
    public final android.widget.Button f7554;

    /* JADX INFO: renamed from: χ */
    public final android.widget.Button f7555;

    /* JADX INFO: renamed from: ψ */
    public final android.widget.TextView f7556;

    /* JADX INFO: renamed from: ω */
    public final p000.zc0 f7557;

    public nd0(android.app.Activity r4, p000.C0286fi r5) {
            r3 = this;
            r4.getClass()
            r3.<init>()
            r3.f7534 = r4
            r3.f7535 = r5
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r5.<init>(r0)
            r3.f7536 = r5
            java.util.concurrent.atomic.AtomicBoolean r5 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r5.<init>(r0)
            r3.f7537 = r5
            java.lang.Class r5 = r4.getClass()
            java.lang.ClassLoader r5 = r5.getClassLoader()
            r1 = 0
            if (r5 == 0) goto L122
            r3.f7538 = r5
            x01 r5 = p000.x01.f11964
            android.view.LayoutInflater r5 = r5.m6477(r4)
            r2 = 2131492905(0x7f0c0029, float:1.8609275E38)
            android.view.View r5 = r5.inflate(r2, r1, r0)
            r3.f7539 = r5
            r0 = 2131296623(0x7f09016f, float:1.8211168E38)
            android.view.View r0 = r5.findViewById(r0)
            r3.f7540 = r0
            r0 = 2131296639(0x7f09017f, float:1.82112E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.f7541 = r0
            r0 = 2131296619(0x7f09016b, float:1.821116E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.f7542 = r0
            r0 = 2131296620(0x7f09016c, float:1.8211162E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.f7543 = r0
            r0 = 2131296638(0x7f09017e, float:1.8211198E38)
            android.view.View r0 = r5.findViewById(r0)
            r3.f7544 = r0
            r0 = 2131296636(0x7f09017c, float:1.8211194E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.f7545 = r0
            r0 = 2131296637(0x7f09017d, float:1.8211196E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.f7546 = r0
            r0 = 2131296634(0x7f09017a, float:1.821119E38)
            android.view.View r0 = r5.findViewById(r0)
            r3.f7547 = r0
            r0 = 2131296633(0x7f090179, float:1.8211188E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r3.f7548 = r0
            r0 = 2131296631(0x7f090177, float:1.8211184E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r3.f7549 = r0
            r0 = 2131296635(0x7f09017b, float:1.8211192E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.f7550 = r0
            r0 = 2131296628(0x7f090174, float:1.8211178E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.ListView r0 = (android.widget.ListView) r0
            r3.f7551 = r0
            r0 = 2131296629(0x7f090175, float:1.821118E38)
            android.view.View r0 = r5.findViewById(r0)
            r3.f7552 = r0
            r0 = 2131296621(0x7f09016d, float:1.8211164E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.f7553 = r0
            r0 = 2131296630(0x7f090176, float:1.8211182E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r3.f7554 = r0
            r0 = 2131296618(0x7f09016a, float:1.8211158E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r3.f7555 = r0
            r0 = 2131296622(0x7f09016e, float:1.8211166E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.f7556 = r0
            zc0 r0 = new zc0
            r0.<init>(r4)
            r3.f7557 = r0
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r4)
            android.app.AlertDialog$Builder r4 = r0.setView(r5)
            android.app.AlertDialog r4 = r4.create()
            r3.f7525 = r4
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            r3.f7526 = r4
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            r3.f7527 = r4
            ad0 r4 = p000.ad0.f188
            r3.f7528 = r4
            java.lang.String r4 = ""
            r3.f7529 = r4
            r5 = 1
            r3.f7530 = r5
            r3.f7531 = r4
            jz r4 = p000.C0450jz.f5672
            r3.f7532 = r4
            return
        L122:
            java.lang.String r3 = "宿主 ClassLoader 不可用"
            p000.C1080.m7275(r3)
            throw r1
    }

    /* JADX INFO: renamed from: ζ */
    public static void m4024(java.util.List r14) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r14 = r14.iterator()
        L9:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L6e
            java.lang.Object r1 = r14.next()
            th0 r1 = (p000.th0) r1
            vh0 r2 = p000.vh0.f11270
            java.lang.String r2 = r1.f10373
            long r2 = p000.vh0.m6233(r2)
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r5 = 0
            if (r4 > 0) goto L25
            goto L68
        L25:
            java.lang.String r9 = java.lang.String.valueOf(r2)
            st r4 = p000.C0810st.f10010
            java.lang.String r4 = r1.m5712()
            java.lang.String r2 = p000.C0810st.m5548(r2, r4)
            if (r2 == 0) goto L53
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "UID: "
            r3.<init>(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 != 0) goto L53
            java.lang.String r1 = r1.f10373
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L52
            goto L53
        L52:
            r5 = r2
        L53:
            if (r5 != 0) goto L57
            java.lang.String r5 = ""
        L57:
            r13 = r5
            xd0 r6 = new xd0
            java.lang.String r12 = ""
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.String r10 = ""
            java.lang.String r11 = ""
            r6.<init>(r7, r9, r10, r11, r12, r13)
            r5 = r6
        L68:
            if (r5 == 0) goto L9
            r0.add(r5)
            goto L9
        L6e:
            xc0 r14 = p000.xc0.f12128
            r14.m6610(r0)
            return
    }

    /* JADX INFO: renamed from: θ */
    public static java.lang.String m4025(java.lang.Throwable r2) {
            java.lang.String r0 = r2.getMessage()
            if (r0 != 0) goto Le
            java.lang.Class r2 = r2.getClass()
            java.lang.String r0 = r2.getSimpleName()
        Le:
            r2 = 10
            r1 = 32
            java.lang.String r2 = r0.replace(r2, r1)
            r2.getClass()
            r0 = 13
            java.lang.String r2 = r2.replace(r0, r1)
            r2.getClass()
            r0 = 120(0x78, float:1.68E-43)
            java.lang.String r2 = p000.q02.m4693(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: α */
    public final void m4026(p000.xd0 r6) {
            r5 = this;
            be0 r0 = p000.be0.f1670
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 31
            r4 = 0
            xd0 r6 = p000.xd0.m6612(r6, r4, r1, r3)
            yd0 r6 = r0.m934(r6)
            int r6 = r6.ordinal()
            android.app.Activity r1 = r5.f7534
            r2 = 0
            if (r6 == 0) goto L4e
            r3 = 1
            if (r6 == r3) goto L4e
            r5 = 4
            if (r6 == r5) goto L44
            r5 = 5
            if (r6 == r5) goto L3a
            r5 = 7
            if (r6 == r5) goto L30
            java.lang.String r5 = "联系人身份无效"
            android.widget.Toast r5 = android.widget.Toast.makeText(r1, r5, r2)
            r5.show()
            return
        L30:
            java.lang.String r5 = "隐藏名单保存失败"
            android.widget.Toast r5 = android.widget.Toast.makeText(r1, r5, r2)
            r5.show()
            return
        L3a:
            java.lang.String r5 = "当前账号尚未识别"
            android.widget.Toast r5 = android.widget.Toast.makeText(r1, r5, r2)
            r5.show()
            return
        L44:
            java.lang.String r5 = "该联系人已在名单中"
            android.widget.Toast r5 = android.widget.Toast.makeText(r1, r5, r2)
            r5.show()
            return
        L4e:
            boolean r6 = r0.m938()
            if (r6 == 0) goto L57
            java.lang.String r6 = "已加入隐藏名单"
            goto L59
        L57:
            java.lang.String r6 = "已加入名单，开启总开关后生效"
        L59:
            android.widget.Toast r6 = android.widget.Toast.makeText(r1, r6, r2)
            r6.show()
            r5.m4030()
            r5.m4031()
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m4027(android.app.AlertDialog r7, android.widget.EditText r8) {
            r6 = this;
            android.app.Activity r6 = r6.f7534
            xx r0 = p000.jx0.m3049(r6)
            java.lang.String r1 = r0.f12356
            java.lang.String r2 = r0.f12355
            android.view.Window r3 = r7.getWindow()
            if (r3 == 0) goto L1b
            java.lang.String r4 = r0.f12352
            r5 = 16
            android.graphics.drawable.GradientDrawable r4 = p000.jx0.m3062(r5, r6, r4)
            r3.setBackgroundDrawable(r4)
        L1b:
            r3 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r3 = r7.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L2d
            int r4 = android.graphics.Color.parseColor(r2)
            r3.setTextColor(r4)
        L2d:
            r3 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r3 = r7.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L3f
            int r4 = android.graphics.Color.parseColor(r1)
            r3.setTextColor(r4)
        L3f:
            r3 = -1
            android.widget.Button r3 = r7.getButton(r3)
            if (r3 == 0) goto L4f
            java.lang.String r4 = r0.f12358
            int r4 = android.graphics.Color.parseColor(r4)
            r3.setTextColor(r4)
        L4f:
            r3 = -2
            android.widget.Button r7 = r7.getButton(r3)
            if (r7 == 0) goto L5d
            int r1 = android.graphics.Color.parseColor(r1)
            r7.setTextColor(r1)
        L5d:
            if (r8 == 0) goto L7a
            int r7 = android.graphics.Color.parseColor(r2)
            r8.setTextColor(r7)
            java.lang.String r7 = r0.f12357
            int r7 = android.graphics.Color.parseColor(r7)
            r8.setHintTextColor(r7)
            java.lang.String r7 = r0.f12371
            r0 = 8
            android.graphics.drawable.GradientDrawable r6 = p000.jx0.m3062(r0, r6, r7)
            r8.setBackground(r6)
        L7a:
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m4028(p000.C0699pt r10) {
            r9 = this;
            st r0 = p000.C0810st.f10010
            java.lang.String r0 = r10.f8694
            long r1 = r10.f8693
            java.lang.String r10 = p000.C0810st.m5548(r1, r0)
            if (r10 == 0) goto L8d
            boolean r0 = p000.q02.m4671(r10)
            if (r0 == 0) goto L14
            goto L8d
        L14:
            java.util.LinkedHashSet r0 = r9.f7526
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            r0.remove(r3)
            java.lang.String r0 = java.lang.String.valueOf(r1)
            xc0 r1 = p000.xc0.f12128
            java.util.List r1 = r1.m6609()
            java.util.Iterator r1 = r1.iterator()
        L2b:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L42
            java.lang.Object r2 = r1.next()
            r4 = r2
            xd0 r4 = (p000.xd0) r4
            java.lang.String r4 = r4.f12133
            boolean r4 = p000.ln0.m3626(r4, r0)
            if (r4 == 0) goto L2b
            goto L43
        L42:
            r2 = r3
        L43:
            xd0 r2 = (p000.xd0) r2
            r1 = 47
            r4 = 0
            if (r2 == 0) goto L58
            xc0 r6 = p000.xc0.f12128
            xd0 r2 = p000.xd0.m6612(r2, r10, r4, r1)
            java.util.List r2 = p000.AbstractC1021yh.m6896(r2)
            r6.m6610(r2)
        L58:
            be0 r2 = p000.be0.f1670
            java.util.List r2 = r2.m943()
            java.util.Iterator r2 = r2.iterator()
        L62:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L80
            java.lang.Object r6 = r2.next()
            r7 = r6
            xd0 r7 = (p000.xd0) r7
            java.lang.String r8 = r7.f12133
            boolean r8 = p000.ln0.m3626(r8, r0)
            if (r8 == 0) goto L62
            java.lang.String r7 = r7.f12137
            boolean r7 = p000.ln0.m3626(r7, r10)
            if (r7 != 0) goto L62
            r3 = r6
        L80:
            xd0 r3 = (p000.xd0) r3
            if (r3 == 0) goto L8d
            be0 r0 = p000.be0.f1670
            xd0 r10 = p000.xd0.m6612(r3, r10, r4, r1)
            r0.m934(r10)
        L8d:
            r9.m4030()
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m4029(p000.p70 r3) {
            r2 = this;
            w1 r0 = new w1
            r1 = 25
            r0.<init>(r2, r1, r3)
            android.os.Handler r2 = r2.f7536
            r2.post(r0)
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m4030() {
            r17 = this;
            r0 = r17
            be0 r1 = p000.be0.f1670
            java.util.List r1 = r1.m943()
            ad0 r2 = r0.f7528
            ad0 r3 = p000.ad0.f188
            if (r2 != r3) goto L68
            xc0 r2 = p000.xc0.f12128
            java.util.List r2 = r2.m6609()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L1d:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L69
            java.lang.Object r5 = r2.next()
            r6 = r5
            xd0 r6 = (p000.xd0) r6
            boolean r7 = r1.isEmpty()
            if (r7 == 0) goto L31
            goto L64
        L31:
            java.util.Iterator r7 = r1.iterator()
        L35:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L64
            java.lang.Object r8 = r7.next()
            xd0 r8 = (p000.xd0) r8
            java.lang.String r9 = r8.f12133
            java.lang.String r10 = r8.f12134
            int r9 = r9.length()
            if (r9 <= 0) goto L55
            java.lang.String r8 = r8.f12133
            java.lang.String r9 = r6.f12133
            boolean r8 = p000.ln0.m3626(r8, r9)
            if (r8 != 0) goto L1d
        L55:
            int r8 = r10.length()
            if (r8 <= 0) goto L35
            java.lang.String r8 = r6.f12134
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto L35
            goto L1d
        L64:
            r4.add(r5)
            goto L1d
        L68:
            r4 = r1
        L69:
            java.lang.String r2 = r0.f7529
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r2 = p000.AbstractC0602nx.m4134(r5, r2, r5)
            int r5 = r2.length()
            r6 = 0
            if (r5 != 0) goto L82
            r5 = r4
            goto Lcc
        L82:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r7 = r4.iterator()
        L8b:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lcc
            java.lang.Object r8 = r7.next()
            r9 = r8
            xd0 r9 = (p000.xd0) r9
            java.lang.String r10 = r9.f12137
            java.lang.String r11 = r9.f12135
            java.lang.String r12 = r9.f12136
            java.lang.String r13 = r9.f12133
            java.lang.String r9 = r9.f12134
            java.lang.String[] r9 = new java.lang.String[]{r10, r11, r12, r13, r9}
            java.util.List r10 = p000.AbstractC1021yh.m6897(r9)
            r15 = 0
            r16 = 62
            java.lang.String r11 = " "
            r12 = 0
            r13 = 0
            r14 = 0
            java.lang.String r9 = p000.AbstractC0984xh.m6644(r10, r11, r12, r13, r14, r15, r16)
            java.util.Locale r10 = java.util.Locale.ROOT
            r10.getClass()
            java.lang.String r9 = r9.toLowerCase(r10)
            r9.getClass()
            boolean r9 = p000.q02.m4654(r9, r2, r6)
            if (r9 == 0) goto L8b
            r5.add(r8)
            goto L8b
        Lcc:
            r0.f7532 = r5
            ad0 r7 = r0.f7528
            zc0 r8 = r0.f7557
            r8.getClass()
            r7.getClass()
            java.util.List r5 = p000.AbstractC0984xh.m6666(r5)
            r8.f13034 = r5
            r8.f13035 = r7
            r8.notifyDataSetChanged()
            int r5 = r1.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            fi r7 = r0.f7535
            r7.invoke(r5)
            x01 r5 = p000.x01.f11964
            int r7 = r1.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            android.app.Activity r8 = r0.f7534
            r9 = 2131689544(0x7f0f0048, float:1.9008106E38)
            java.lang.String r5 = r5.m6478(r8, r9, r7)
            android.widget.TextView r7 = r0.f7543
            r7.setText(r5)
            ad0 r5 = r0.f7528
            r7 = 8
            if (r5 != r3) goto L114
            r5 = r6
            goto L115
        L114:
            r5 = r7
        L115:
            android.widget.Button r8 = r0.f7554
            r8.setVisibility(r5)
            ad0 r5 = r0.f7528
            ad0 r8 = p000.ad0.f189
            if (r5 != r8) goto L122
            r5 = r6
            goto L123
        L122:
            r5 = r7
        L123:
            android.widget.Button r9 = r0.f7555
            r9.setVisibility(r5)
            boolean r1 = r1.isEmpty()
            r5 = 1
            r1 = r1 ^ r5
            r9.setEnabled(r1)
            boolean r1 = r0.f7530
            java.util.LinkedHashSet r9 = r0.f7526
            if (r1 != 0) goto L13f
            boolean r1 = r9.isEmpty()
            if (r1 != 0) goto L13e
            goto L13f
        L13e:
            r5 = r6
        L13f:
            if (r5 == 0) goto L143
            r1 = r6
            goto L144
        L143:
            r1 = r7
        L144:
            android.widget.ProgressBar r10 = r0.f7549
            r10.setVisibility(r1)
            int r1 = r4.size()
            java.util.List r4 = r0.f7532
            int r4 = r4.size()
            boolean r10 = r0.f7530
            if (r10 == 0) goto L15d
            if (r1 != 0) goto L15d
            java.lang.String r1 = "正在读取联系人和会话目录…"
            goto L1cb
        L15d:
            boolean r10 = r9.isEmpty()
            if (r10 != 0) goto L170
            int r1 = r9.size()
            java.lang.String r4 = "正在将 "
            java.lang.String r8 = " 个 UID 转换为名称…"
            java.lang.String r1 = p000.AbstractC0602nx.m4127(r4, r1, r8)
            goto L1cb
        L170:
            if (r5 == 0) goto L175
            java.lang.String r1 = "正在刷新联系人…"
            goto L1cb
        L175:
            int r9 = r2.length()
            java.lang.String r10 = " 人"
            if (r9 <= 0) goto L186
            java.lang.String r8 = "匹配 "
            java.lang.String r9 = " / "
            java.lang.String r1 = p000.AbstractC0602nx.m4128(r8, r4, r9, r1, r10)
            goto L1cb
        L186:
            ad0 r4 = r0.f7528
            if (r4 != r3) goto L193
            if (r1 <= 0) goto L193
            java.lang.String r4 = "可添加 "
            java.lang.String r1 = p000.AbstractC0602nx.m4127(r4, r1, r10)
            goto L1cb
        L193:
            if (r4 != r8) goto L1a0
            if (r1 <= 0) goto L1a0
            java.lang.String r4 = "已隐藏 "
            java.lang.String r8 = " 人，点击可恢复显示"
            java.lang.String r1 = p000.AbstractC0602nx.m4127(r4, r1, r8)
            goto L1cb
        L1a0:
            java.lang.String r1 = r0.f7531
            boolean r1 = p000.q02.m4671(r1)
            if (r1 != 0) goto L1b5
            ad0 r1 = r0.f7528
            if (r1 != r3) goto L1b5
            java.lang.String r1 = r0.f7531
            java.lang.String r4 = "联系人加载不完整："
            java.lang.String r1 = p000.lz1.m3687(r4, r1)
            goto L1cb
        L1b5:
            java.lang.String r1 = p000.ui1.m5890()
            boolean r1 = p000.q02.m4671(r1)
            if (r1 == 0) goto L1c2
            java.lang.String r1 = "尚未识别当前抖音账号"
            goto L1cb
        L1c2:
            ad0 r1 = r0.f7528
            if (r1 != r3) goto L1c9
            java.lang.String r1 = "暂无候选联系人"
            goto L1cb
        L1c9:
            java.lang.String r1 = "当前没有隐藏联系人"
        L1cb:
            android.widget.TextView r4 = r0.f7550
            r4.setText(r1)
            if (r5 == 0) goto L1dd
            java.util.List r1 = r0.f7532
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L1dd
            java.lang.String r1 = "正在加载联系人…"
            goto L1fc
        L1dd:
            ad0 r1 = r0.f7528
            if (r1 != r3) goto L1ea
            int r1 = r2.length()
            if (r1 <= 0) goto L1ea
            java.lang.String r1 = "没有匹配的可添加联系人"
            goto L1fc
        L1ea:
            ad0 r1 = r0.f7528
            if (r1 != r3) goto L1f1
            java.lang.String r1 = "暂无候选联系人\n可使用下方按钮输入数字 UID"
            goto L1fc
        L1f1:
            int r1 = r2.length()
            if (r1 <= 0) goto L1fa
            java.lang.String r1 = "名单中没有匹配联系人"
            goto L1fc
        L1fa:
            java.lang.String r1 = "当前账号没有隐藏联系人"
        L1fc:
            android.widget.TextView r2 = r0.f7553
            r2.setText(r1)
            java.util.List r1 = r0.f7532
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L20b
            r1 = r6
            goto L20c
        L20b:
            r1 = r7
        L20c:
            r2.setVisibility(r1)
            java.util.List r1 = r0.f7532
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L218
            r6 = r7
        L218:
            android.widget.ListView r0 = r0.f7551
            r0.setVisibility(r6)
            return
    }

    /* JADX INFO: renamed from: η */
    public final void m4031() {
            r4 = this;
            be0 r0 = p000.be0.f1670
            java.util.List r0 = r0.m943()
            xc0 r1 = p000.xc0.f12128
            java.util.List r1 = r1.m6609()
            java.util.ArrayList r0 = p000.AbstractC0984xh.m6651(r0, r1)
            f7 r1 = new f7
            r2 = 1
            r1.<init>(r2, r0)
            zb0 r0 = new zb0
            r2 = 5
            r0.<init>(r2)
            y30 r2 = new y30
            r3 = 1
            r2.<init>(r1, r3, r0)
            zb0 r0 = new zb0
            r1 = 6
            r0.<init>(r1)
            y30 r0 = p000.us1.m5943(r2, r0)
            bd0 r1 = new bd0
            r2 = 1
            r1.<init>(r4, r2)
            y30 r2 = new y30
            r2.<init>(r0, r3, r1)
            cu r0 = p000.us1.m5952(r2)
            java.util.List r0 = p000.us1.m5948(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L46
            return
        L46:
            java.util.LinkedHashSet r1 = r4.f7526
            p000.AbstractC0984xh.m6660(r1, r0)
            r4.m4030()
            st r1 = p000.C0810st.f10010
            java.lang.ClassLoader r2 = r4.f7538
            r1.m5569(r2)
            java.util.concurrent.ExecutorService r1 = p000.pd0.f8508
            fd0 r2 = new fd0
            r2.<init>(r0, r4)
            r1.execute(r2)
            fd0 r1 = new fd0
            r1.<init>(r4, r0)
            r2 = 12000(0x2ee0, double:5.929E-320)
            android.os.Handler r4 = r4.f7536
            r4.postDelayed(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ι */
    public final void m4032() {
            r16 = this;
            r0 = r16
            be0 r1 = p000.be0.f1670
            r1.m936()
            kd0 r1 = new kd0
            r2 = 0
            r1.<init>(r0, r2)
            android.widget.TextView r3 = r0.f7542
            r3.setOnClickListener(r1)
            kd0 r1 = new kd0
            r4 = 1
            r1.<init>(r0, r4)
            android.widget.TextView r5 = r0.f7545
            r5.setOnClickListener(r1)
            kd0 r1 = new kd0
            r5 = 2
            r1.<init>(r0, r5)
            android.widget.TextView r6 = r0.f7546
            r6.setOnClickListener(r1)
            kd0 r1 = new kd0
            r6 = 3
            r1.<init>(r0, r6)
            android.widget.Button r7 = r0.f7554
            r7.setOnClickListener(r1)
            kd0 r1 = new kd0
            r8 = 4
            r1.<init>(r0, r8)
            android.widget.Button r8 = r0.f7555
            r8.setOnClickListener(r1)
            ld0 r1 = new ld0
            r1.<init>(r2, r0)
            android.widget.ListView r9 = r0.f7551
            r9.setOnItemClickListener(r1)
            md0 r1 = new md0
            r1.<init>(r2, r0)
            android.widget.EditText r10 = r0.f7548
            r10.addTextChangedListener(r1)
            r10.setShowSoftInputOnFocus(r4)
            tj r1 = new tj
            r1.<init>(r4, r0)
            r10.setOnFocusChangeListener(r1)
            kd0 r1 = new kd0
            r11 = 5
            r1.<init>(r0, r11)
            r10.setOnClickListener(r1)
            android.app.Activity r1 = r0.f7534
            xx r11 = p000.jx0.m3049(r1)
            java.lang.String r12 = r11.f12351
            r13 = 16
            android.graphics.drawable.GradientDrawable r12 = p000.jx0.m3062(r13, r1, r12)
            android.view.View r13 = r0.f7539
            r13.setBackground(r12)
            java.lang.String r12 = r11.f12352
            r13 = 10
            android.graphics.drawable.GradientDrawable r14 = p000.jx0.m3062(r13, r1, r12)
            android.view.View r15 = r0.f7540
            r15.setBackground(r14)
            android.view.View r14 = r0.f7544
            android.graphics.drawable.GradientDrawable r15 = p000.jx0.m3062(r13, r1, r12)
            r14.setBackground(r15)
            r14 = 12
            android.graphics.drawable.GradientDrawable r15 = p000.jx0.m3062(r14, r1, r12)
            android.view.View r5 = r0.f7547
            r5.setBackground(r15)
            android.view.View r5 = r0.f7552
            android.graphics.drawable.GradientDrawable r14 = p000.jx0.m3062(r14, r1, r12)
            r5.setBackground(r14)
            int r5 = android.graphics.Color.parseColor(r12)
            r9.setBackgroundColor(r5)
            java.lang.String r5 = r11.f12355
            int r12 = android.graphics.Color.parseColor(r5)
            android.widget.TextView r14 = r0.f7541
            r14.setTextColor(r12)
            java.lang.String r12 = r11.f12356
            int r14 = android.graphics.Color.parseColor(r12)
            r3.setTextColor(r14)
            java.lang.String r3 = r11.f12360
            int r14 = android.graphics.Color.parseColor(r3)
            android.widget.TextView r15 = r0.f7543
            r15.setTextColor(r14)
            int r14 = android.graphics.Color.parseColor(r5)
            r10.setTextColor(r14)
            java.lang.String r14 = r11.f12357
            int r14 = android.graphics.Color.parseColor(r14)
            r10.setHintTextColor(r14)
            java.lang.String r14 = r11.f12371
            r6 = 8
            android.graphics.drawable.GradientDrawable r6 = p000.jx0.m3062(r6, r1, r14)
            r10.setBackground(r6)
            android.widget.TextView r6 = r0.f7550
            int r10 = android.graphics.Color.parseColor(r12)
            r6.setTextColor(r10)
            android.widget.TextView r6 = r0.f7553
            int r10 = android.graphics.Color.parseColor(r12)
            r6.setTextColor(r10)
            java.lang.String r6 = r11.f12349
            int r6 = android.graphics.Color.parseColor(r6)
            android.widget.TextView r10 = r0.f7556
            r10.setTextColor(r6)
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            java.lang.String r10 = r11.f12353
            int r10 = android.graphics.Color.parseColor(r10)
            r6.<init>(r10)
            r9.setDivider(r6)
            r9.setDividerHeight(r4)
            r9.setCacheColorHint(r2)
            java.lang.String r6 = r11.f12348
            android.graphics.drawable.RippleDrawable r10 = p000.jx0.m3034(r6)
            r9.setSelector(r10)
            int r3 = android.graphics.Color.parseColor(r3)
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r3)
            android.widget.ProgressBar r10 = r0.f7549
            r10.setIndeterminateTintList(r3)
            java.lang.String r3 = r11.f12361
            r10 = 99
            android.graphics.drawable.GradientDrawable r3 = p000.jx0.m3062(r10, r1, r3)
            r15.setBackground(r3)
            java.lang.String r3 = r11.f12358
            android.graphics.drawable.RippleDrawable r3 = p000.jx0.m3059(r13, r1, r6, r3)
            r7.setBackground(r3)
            java.lang.String r3 = "#FFFFFF"
            int r3 = android.graphics.Color.parseColor(r3)
            r7.setTextColor(r3)
            int r3 = android.graphics.Color.parseColor(r5)
            r8.setTextColor(r3)
            android.graphics.drawable.RippleDrawable r3 = p000.jx0.m3059(r13, r1, r6, r14)
            r8.setBackground(r3)
            r0.m4035()
            st r3 = p000.C0810st.f10010
            bd0 r3 = new bd0
            r3.<init>(r0, r2)
            java.util.concurrent.CopyOnWriteArraySet r5 = p000.C0810st.f10021
            r5.add(r3)
            nt r5 = new nt
            r5.<init>(r3, r2)
            r0.f7533 = r5
            zc0 r3 = r0.f7557
            r9.setAdapter(r3)
            vg r3 = new vg
            r5 = 3
            r3.<init>(r5, r0)
            android.app.AlertDialog r5 = r0.f7525
            r5.setOnDismissListener(r3)
            r5.show()
            android.view.Window r3 = r5.getWindow()
            if (r3 == 0) goto L1c1
            android.graphics.drawable.ColorDrawable r5 = new android.graphics.drawable.ColorDrawable
            r5.<init>(r2)
            r3.setBackgroundDrawable(r5)
            r5 = 1056964608(0x3f000000, float:0.5)
            r3.setDimAmount(r5)
            r5 = 2
            r3.addFlags(r5)
            r5 = 131072(0x20000, float:1.83671E-40)
            r3.clearFlags(r5)
            r3.setSoftInputMode(r4)
            android.content.res.Resources r4 = r1.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r4 = r4.widthPixels
            float r4 = (float) r4
            r5 = 1064346583(0x3f70a3d7, float:0.94)
            float r4 = r4 * r5
            int r4 = (int) r4
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.heightPixels
            float r1 = (float) r1
            r5 = 1063004406(0x3f5c28f6, float:0.86)
            float r1 = r1 * r5
            int r1 = (int) r1
            r3.setLayout(r4, r1)
        L1c1:
            r0.m4030()
            java.util.concurrent.ExecutorService r1 = p000.pd0.f8508
            hd0 r3 = new hd0
            r3.<init>(r0, r2)
            r1.execute(r3)
            return
    }

    /* JADX INFO: renamed from: κ */
    public final void m4033() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f7537
            boolean r0 = r0.get()
            if (r0 != 0) goto L2f
            android.app.Activity r0 = r2.f7534
            boolean r1 = r0.isFinishing()
            if (r1 != 0) goto L2f
            boolean r0 = r0.isDestroyed()
            if (r0 == 0) goto L17
            goto L2f
        L17:
            android.app.AlertDialog r0 = r2.f7525
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L24
            r1 = 131072(0x20000, float:1.83671E-40)
            r0.clearFlags(r1)
        L24:
            hd0 r0 = new hd0
            r1 = 1
            r0.<init>(r2, r1)
            android.widget.EditText r2 = r2.f7548
            r2.post(r0)
        L2f:
            return
    }

    /* JADX INFO: renamed from: λ */
    public final void m4034(android.widget.TextView r3, boolean r4, p000.C1000xx r5) {
            r2 = this;
            if (r4 == 0) goto L5
            java.lang.String r0 = "#FFFFFF"
            goto L7
        L5:
            java.lang.String r0 = r5.f12356
        L7:
            int r0 = android.graphics.Color.parseColor(r0)
            r3.setTextColor(r0)
            if (r4 == 0) goto L13
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT_BOLD
            goto L15
        L13:
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
        L15:
            r3.setTypeface(r0)
            java.lang.String r0 = r5.f12348
            r1 = 8
            android.app.Activity r2 = r2.f7534
            if (r4 == 0) goto L27
            java.lang.String r4 = r5.f12358
            android.graphics.drawable.RippleDrawable r2 = p000.jx0.m3059(r1, r2, r0, r4)
            goto L2d
        L27:
            java.lang.String r4 = r5.f12352
            android.graphics.drawable.RippleDrawable r2 = p000.jx0.m3059(r1, r2, r0, r4)
        L2d:
            r3.setBackground(r2)
            return
    }

    /* JADX INFO: renamed from: μ */
    public final void m4035() {
            r6 = this;
            android.app.Activity r0 = r6.f7534
            xx r0 = p000.jx0.m3049(r0)
            android.widget.TextView r1 = r6.f7545
            r1.getClass()
            ad0 r2 = r6.f7528
            ad0 r3 = p000.ad0.f188
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L15
            r2 = r5
            goto L16
        L15:
            r2 = r4
        L16:
            r6.m4034(r1, r2, r0)
            android.widget.TextView r1 = r6.f7546
            r1.getClass()
            ad0 r2 = r6.f7528
            ad0 r3 = p000.ad0.f189
            if (r2 != r3) goto L25
            r4 = r5
        L25:
            r6.m4034(r1, r4, r0)
            return
    }
}
