package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class zc0 extends android.widget.BaseAdapter {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f13032;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Object f13033;

    /* JADX INFO: renamed from: η */
    public java.lang.Object f13034;

    /* JADX INFO: renamed from: θ */
    public java.io.Serializable f13035;

    public zc0(android.app.Activity r2) {
            r1 = this;
            r0 = 0
            r1.f13032 = r0
            r2.getClass()
            r1.<init>()
            r1.f13033 = r2
            jz r2 = p000.C0450jz.f5672
            r1.f13034 = r2
            ad0 r2 = p000.ad0.f188
            r1.f13035 = r2
            return
    }

    public zc0(android.app.Activity r2, p000.ij0 r3) {
            r1 = this;
            r0 = 1
            r1.f13032 = r0
            r2.getClass()
            r1.<init>()
            r1.f13033 = r2
            r1.f13034 = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f13035 = r2
            return
    }

    public zc0(android.app.Activity r2, java.util.List r3, java.util.LinkedHashMap r4) {
            r1 = this;
            r0 = 2
            r1.f13032 = r0
            r2.getClass()
            r1.<init>()
            r1.f13033 = r2
            r1.f13034 = r3
            r1.f13035 = r4
            return
    }

    public zc0(p000.um1 r2, android.view.LayoutInflater r3, java.util.LinkedHashSet r4) {
            r1 = this;
            r0 = 3
            r1.f13032 = r0
            r1.f13033 = r2
            r1.f13034 = r3
            r1.f13035 = r4
            r1.<init>()
            return
    }

    @Override // android.widget.Adapter
    public final int getCount() {
            r1 = this;
            int r0 = r1.f13032
            switch(r0) {
                case 0: goto L24;
                case 1: goto L1b;
                case 2: goto L12;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f13033
            um1 r1 = (p000.um1) r1
            java.lang.Object r1 = r1.f10912
            java.util.List r1 = (java.util.List) r1
            int r1 = r1.size()
            return r1
        L12:
            java.lang.Object r1 = r1.f13034
            java.util.List r1 = (java.util.List) r1
            int r1 = r1.size()
            return r1
        L1b:
            java.io.Serializable r1 = r1.f13035
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r1 = r1.size()
            return r1
        L24:
            java.lang.Object r1 = r1.f13034
            java.util.List r1 = (java.util.List) r1
            int r1 = r1.size()
            return r1
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int r2) {
            r1 = this;
            int r0 = r1.f13032
            switch(r0) {
                case 0: goto L26;
                case 1: goto L1b;
                case 2: goto L12;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f13033
            um1 r1 = (p000.um1) r1
            java.lang.Object r1 = r1.f10912
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r1.get(r2)
            return r1
        L12:
            java.lang.Object r1 = r1.f13034
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r1.get(r2)
            return r1
        L1b:
            java.io.Serializable r1 = r1.f13035
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r1 = p000.AbstractC0984xh.m6641(r2, r1)
            xi0 r1 = (p000.xi0) r1
            return r1
        L26:
            java.lang.Object r1 = r1.f13034
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = p000.AbstractC0984xh.m6641(r2, r1)
            xd0 r1 = (p000.xd0) r1
            return r1
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r2) {
            r1 = this;
            int r0 = r1.f13032
            switch(r0) {
                case 0: goto L1f;
                case 1: goto L1d;
                case 2: goto L1b;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f13033
            um1 r1 = (p000.um1) r1
            java.lang.Object r1 = r1.f10912
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r1.get(r2)
            lu1 r1 = (p000.lu1) r1
            java.lang.String r1 = r1.f6800
            int r1 = r1.hashCode()
            long r1 = (long) r1
            return r1
        L1b:
            long r1 = (long) r2
            return r1
        L1d:
            long r1 = (long) r2
            return r1
        L1f:
            long r1 = (long) r2
            return r1
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int r13, android.view.View r14, android.view.ViewGroup r15) {
            r12 = this;
            int r0 = r12.f13032
            r1 = 1
            r2 = 8
            r3 = 0
            r4 = 0
            switch(r0) {
                case 0: goto L2c0;
                case 1: goto L14a;
                case 2: goto L73;
                default: goto La;
            }
        La:
            r15.getClass()
            if (r14 != 0) goto L26
            java.lang.Object r14 = r12.f13034
            android.view.LayoutInflater r14 = (android.view.LayoutInflater) r14
            r0 = 2131492944(0x7f0c0050, float:1.8609354E38)
            android.view.View r14 = r14.inflate(r0, r15, r4)
            r14.getClass()
            zu1 r15 = new zu1
            r15.<init>(r14)
            r14.setTag(r15)
            goto L2f
        L26:
            java.lang.Object r15 = r14.getTag()
            r15.getClass()
            zu1 r15 = (p000.zu1) r15
        L2f:
            android.widget.TextView r0 = r15.f13310
            android.widget.TextView r1 = r15.f13309
            android.widget.CheckBox r15 = r15.f13308
            java.lang.Object r2 = r12.f13033
            um1 r2 = (p000.um1) r2
            java.lang.Object r2 = r2.f10912
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r13 = r2.get(r13)
            lu1 r13 = (p000.lu1) r13
            java.io.Serializable r12 = r12.f13035
            java.util.LinkedHashSet r12 = (java.util.LinkedHashSet) r12
            java.lang.String r2 = r13.f6800
            boolean r12 = r12.contains(r2)
            r15.setClickable(r4)
            r15.setFocusable(r4)
            r15.setChecked(r12)
            java.lang.String r12 = r13.f6801
            r1.setText(r12)
            java.lang.String r12 = "#1C2B1E"
            int r12 = android.graphics.Color.parseColor(r12)
            r1.setTextColor(r12)
            java.lang.String r12 = r13.f6802
            r0.setText(r12)
            java.lang.String r12 = "#9EB09F"
            int r12 = android.graphics.Color.parseColor(r12)
            r0.setTextColor(r12)
            return r14
        L73:
            java.lang.Object r0 = r12.f13033
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.String r1 = "theme"
            r15.getClass()
            if (r14 != 0) goto L8b
            x01 r14 = p000.x01.f11964
            android.view.LayoutInflater r14 = r14.m6477(r0)
            r5 = 2131492941(0x7f0c004d, float:1.8609348E38)
            android.view.View r14 = r14.inflate(r5, r15, r4)
        L8b:
            java.lang.Object r15 = r12.f13034
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r13 = r15.get(r13)
            ku1 r13 = (p000.ku1) r13
            java.io.Serializable r12 = r12.f13035
            java.util.LinkedHashMap r12 = (java.util.LinkedHashMap) r12
            java.lang.String r15 = r13.f6118
            java.lang.Object r12 = r12.get(r15)
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            boolean r12 = p000.ln0.m3626(r12, r15)
            r15 = 2131296766(0x7f0901fe, float:1.8211458E38)
            android.view.View r15 = r14.findViewById(r15)
            android.widget.LinearLayout r15 = (android.widget.LinearLayout) r15
            r5 = 2131296482(0x7f0900e2, float:1.8210882E38)
            android.view.View r5 = r14.findViewById(r5)
            android.widget.CheckBox r5 = (android.widget.CheckBox) r5
            r6 = 2131297078(0x7f090336, float:1.821209E38)
            android.view.View r6 = r14.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5.setClickable(r4)
            r5.setFocusable(r4)
            r5.setChecked(r12)
            java.lang.String r4 = r13.f6119
            java.lang.String r13 = r13.f6120
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "\n"
            r5.append(r4)
            r5.append(r13)
            java.lang.String r13 = r5.toString()
            r6.setText(r13)
            if (r12 == 0) goto Lf5
            qu1 r13 = p000.bv1.f1856
            if (r13 == 0) goto Lf1
            java.lang.String r13 = r13.f9131
        Lec:
            int r13 = android.graphics.Color.parseColor(r13)
            goto Lfc
        Lf1:
            p000.ln0.m3650(r1)
            throw r3
        Lf5:
            qu1 r13 = p000.bv1.f1856
            if (r13 == 0) goto L146
            java.lang.String r13 = r13.f9122
            goto Lec
        Lfc:
            r6.setTextColor(r13)
            if (r12 == 0) goto L122
            android.graphics.drawable.GradientDrawable r12 = new android.graphics.drawable.GradientDrawable
            r12.<init>()
            bv1 r13 = p000.bv1.f1853
            qu1 r13 = p000.bv1.f1856
            if (r13 == 0) goto L11e
            java.lang.String r13 = r13.f9132
            int r13 = android.graphics.Color.parseColor(r13)
            r12.setColor(r13)
            int r13 = p000.bv1.m1076(r0, r2)
            float r13 = (float) r13
            r12.setCornerRadius(r13)
            goto L13e
        L11e:
            p000.ln0.m3650(r1)
            throw r3
        L122:
            android.graphics.drawable.GradientDrawable r12 = new android.graphics.drawable.GradientDrawable
            r12.<init>()
            bv1 r13 = p000.bv1.f1853
            qu1 r13 = p000.bv1.f1856
            if (r13 == 0) goto L142
            java.lang.String r13 = r13.f9117
            int r13 = android.graphics.Color.parseColor(r13)
            r12.setColor(r13)
            int r13 = p000.bv1.m1076(r0, r2)
            float r13 = (float) r13
            r12.setCornerRadius(r13)
        L13e:
            r15.setBackground(r12)
            return r14
        L142:
            p000.ln0.m3650(r1)
            throw r3
        L146:
            p000.ln0.m3650(r1)
            throw r3
        L14a:
            if (r14 != 0) goto L1a7
            x01 r14 = p000.x01.f11964
            java.lang.Object r0 = r12.f13033
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.LayoutInflater r14 = r14.m6477(r0)
            r0 = 2131492945(0x7f0c0051, float:1.8609356E38)
            android.view.View r14 = r14.inflate(r0, r15, r4)
            r14.getClass()
            di0 r4 = new di0
            r15 = 2131296707(0x7f0901c3, float:1.8211338E38)
            android.view.View r5 = r14.findViewById(r15)
            r5.getClass()
            r15 = 2131296703(0x7f0901bf, float:1.821133E38)
            android.view.View r15 = r14.findViewById(r15)
            r15.getClass()
            r6 = r15
            android.widget.CheckBox r6 = (android.widget.CheckBox) r6
            r15 = 2131296705(0x7f0901c1, float:1.8211334E38)
            android.view.View r15 = r14.findViewById(r15)
            r15.getClass()
            r7 = r15
            android.widget.TextView r7 = (android.widget.TextView) r7
            r15 = 2131296706(0x7f0901c2, float:1.8211336E38)
            android.view.View r15 = r14.findViewById(r15)
            r15.getClass()
            r8 = r15
            android.widget.TextView r8 = (android.widget.TextView) r8
            r15 = 2131296704(0x7f0901c0, float:1.8211332E38)
            android.view.View r15 = r14.findViewById(r15)
            r15.getClass()
            r9 = r15
            android.widget.TextView r9 = (android.widget.TextView) r9
            r4.<init>(r5, r6, r7, r8, r9)
            r14.setTag(r4)
            goto L1b1
        L1a7:
            java.lang.Object r15 = r14.getTag()
            r15.getClass()
            r4 = r15
            di0 r4 = (p000.di0) r4
        L1b1:
            java.io.Serializable r15 = r12.f13035
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            java.lang.Object r13 = p000.AbstractC0984xh.m6641(r13, r15)
            xi0 r13 = (p000.xi0) r13
            if (r13 != 0) goto L1c0
        L1bd:
            r3 = r14
            goto L2bb
        L1c0:
            java.lang.Object r15 = r12.f13033
            android.app.Activity r15 = (android.app.Activity) r15
            xx r15 = p000.jx0.m3049(r15)
            boolean r0 = r13.m6673()
            android.widget.CheckBox r2 = r4.f3171
            r2.setEnabled(r0)
            android.widget.CheckBox r2 = r4.f3171
            java.lang.Object r5 = r12.f13034
            ij0 r5 = (p000.ij0) r5
            java.lang.String r6 = r13.f12180
            monitor-enter(r5)
            java.util.LinkedHashSet r7 = r5.f5096     // Catch: java.lang.Throwable -> L2bc
            boolean r6 = r7.contains(r6)     // Catch: java.lang.Throwable -> L2bc
            monitor-exit(r5)
            r2.setChecked(r6)
            android.widget.TextView r2 = r4.f3172
            java.lang.String r5 = r13.m6674()
            r2.setText(r5)
            android.widget.TextView r2 = r4.f3172
            java.lang.String r5 = r15.f12355
            int r5 = android.graphics.Color.parseColor(r5)
            r2.setTextColor(r5)
            android.widget.TextView r2 = r4.f3174
            long r5 = r13.f12181
            r7 = 0
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            java.lang.String r8 = r13.f12180
            if (r7 <= 0) goto L21b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "UID: "
            r7.<init>(r9)
            r7.append(r5)
            java.lang.String r5 = " · CID: "
            r7.append(r5)
            r7.append(r8)
            java.lang.String r5 = r7.toString()
            goto L221
        L21b:
            java.lang.String r5 = "CID: "
            java.lang.String r5 = r5.concat(r8)
        L221:
            r2.setText(r5)
            android.widget.TextView r2 = r4.f3174
            java.lang.String r5 = r15.f12356
            int r5 = android.graphics.Color.parseColor(r5)
            r2.setTextColor(r5)
            android.widget.TextView r2 = r4.f3173
            nj0 r5 = r13.f12184
            java.lang.String r5 = r5.f7648
            r2.setText(r5)
            android.os.Handler r2 = p000.mi0.f7160
            nj0 r13 = r13.f12184
            int r13 = r13.ordinal()
            if (r13 == 0) goto L279
            if (r13 == r1) goto L26f
            r1 = 2
            if (r13 == r1) goto L265
            r1 = 3
            if (r13 == r1) goto L25b
            r1 = 4
            if (r13 != r1) goto L257
            java.lang.String r13 = r15.f12370
            java.lang.String r1 = r15.f12371
            l91 r2 = new l91
            r2.<init>(r13, r1)
            goto L282
        L257:
            p000.C1080.m7272()
            goto L2bb
        L25b:
            java.lang.String r13 = r15.f12366
            java.lang.String r1 = r15.f12367
            l91 r2 = new l91
            r2.<init>(r13, r1)
            goto L282
        L265:
            java.lang.String r13 = r15.f12360
            java.lang.String r1 = r15.f12361
            l91 r2 = new l91
            r2.<init>(r13, r1)
            goto L282
        L26f:
            java.lang.String r13 = r15.f12358
            java.lang.String r1 = r15.f12359
            l91 r2 = new l91
            r2.<init>(r13, r1)
            goto L282
        L279:
            java.lang.String r13 = r15.f12362
            java.lang.String r1 = r15.f12363
            l91 r2 = new l91
            r2.<init>(r13, r1)
        L282:
            android.widget.TextView r13 = r4.f3173
            java.lang.Object r1 = r2.f6502
            java.lang.String r1 = (java.lang.String) r1
            int r1 = p000.jx0.m3048(r1)
            r13.setTextColor(r1)
            android.widget.TextView r13 = r4.f3173
            java.lang.Object r12 = r12.f13033
            android.app.Activity r12 = (android.app.Activity) r12
            java.lang.Object r1 = r2.f6503
            java.lang.String r1 = (java.lang.String) r1
            r2 = 6
            android.graphics.drawable.GradientDrawable r12 = p000.jx0.m3062(r2, r12, r1)
            r13.setBackground(r12)
            android.view.View r12 = r4.f3170
            if (r0 == 0) goto L2a8
            r13 = 1065353216(0x3f800000, float:1.0)
            goto L2ab
        L2a8:
            r13 = 1057300152(0x3f051eb8, float:0.52)
        L2ab:
            r12.setAlpha(r13)
            android.view.View r12 = r4.f3170
            java.lang.String r13 = r15.f12348
            android.graphics.drawable.RippleDrawable r13 = p000.jx0.m3034(r13)
            r12.setBackground(r13)
            goto L1bd
        L2bb:
            return r3
        L2bc:
            r0 = move-exception
            r12 = r0
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2bc
            throw r12
        L2c0:
            java.lang.String r0 = "抖音号："
            java.lang.Object r3 = r12.f13033
            android.app.Activity r3 = (android.app.Activity) r3
            if (r14 != 0) goto L30f
            x01 r14 = p000.x01.f11964
            android.view.LayoutInflater r14 = r14.m6477(r3)
            r5 = 2131492943(0x7f0c004f, float:1.8609352E38)
            android.view.View r14 = r14.inflate(r5, r15, r4)
            r14.getClass()
            od0 r15 = new od0
            r5 = 2131296627(0x7f090173, float:1.8211176E38)
            android.view.View r5 = r14.findViewById(r5)
            r5.getClass()
            r6 = 2131296626(0x7f090172, float:1.8211174E38)
            android.view.View r6 = r14.findViewById(r6)
            r6.getClass()
            android.widget.TextView r6 = (android.widget.TextView) r6
            r7 = 2131296625(0x7f090171, float:1.8211172E38)
            android.view.View r7 = r14.findViewById(r7)
            r7.getClass()
            android.widget.TextView r7 = (android.widget.TextView) r7
            r8 = 2131296624(0x7f090170, float:1.821117E38)
            android.view.View r8 = r14.findViewById(r8)
            r8.getClass()
            android.widget.TextView r8 = (android.widget.TextView) r8
            r15.<init>(r5, r6, r7, r8)
            r14.setTag(r15)
            goto L318
        L30f:
            java.lang.Object r15 = r14.getTag()
            r15.getClass()
            od0 r15 = (p000.od0) r15
        L318:
            android.widget.TextView r5 = r15.f8040
            android.widget.TextView r6 = r15.f8039
            android.widget.TextView r7 = r15.f8041
            java.lang.Object r8 = r12.f13034
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r13 = p000.AbstractC0984xh.m6641(r13, r8)
            xd0 r13 = (p000.xd0) r13
            if (r13 != 0) goto L32c
            goto L3d7
        L32c:
            java.lang.String r8 = r13.f12133
            xx r9 = p000.jx0.m3049(r3)
            java.lang.String r10 = r13.f12137
            boolean r11 = p000.q02.m4671(r10)
            if (r11 == 0) goto L349
            boolean r10 = p000.q02.m4671(r8)
            if (r10 != 0) goto L347
            java.lang.String r10 = "UID "
            java.lang.String r10 = r10.concat(r8)
            goto L349
        L347:
            java.lang.String r10 = "已识别联系人"
        L349:
            r6.setText(r10)
            java.lang.String r10 = r9.f12355
            int r10 = android.graphics.Color.parseColor(r10)
            r6.setTextColor(r10)
            java.lang.String r6 = r13.f12135
            boolean r10 = p000.q02.m4671(r6)
            if (r10 == 0) goto L35f
            java.lang.String r6 = r13.f12136
        L35f:
            boolean r13 = p000.q02.m4671(r6)
            if (r13 != 0) goto L372
            boolean r13 = p000.q02.m4671(r8)
            if (r13 != 0) goto L372
            java.lang.String r13 = " · UID："
            java.lang.String r13 = p000.a12.m18(r0, r6, r13, r8)
            goto L38c
        L372:
            boolean r13 = p000.q02.m4671(r6)
            if (r13 != 0) goto L37d
            java.lang.String r13 = r0.concat(r6)
            goto L38c
        L37d:
            boolean r13 = p000.q02.m4671(r8)
            if (r13 != 0) goto L38a
            java.lang.String r13 = "UID："
            java.lang.String r13 = r13.concat(r8)
            goto L38c
        L38a:
            java.lang.String r13 = "SecUID 已记录"
        L38c:
            r5.setText(r13)
            java.lang.String r13 = r9.f12356
            int r13 = android.graphics.Color.parseColor(r13)
            r5.setTextColor(r13)
            android.view.View r13 = r15.f8038
            java.lang.String r15 = r9.f12348
            java.lang.String r0 = r9.f12352
            android.graphics.drawable.RippleDrawable r15 = p000.jx0.m3059(r2, r3, r15, r0)
            r13.setBackground(r15)
            java.io.Serializable r12 = r12.f13035
            ad0 r12 = (p000.ad0) r12
            ad0 r13 = p000.ad0.f188
            if (r12 != r13) goto L3ae
            goto L3af
        L3ae:
            r1 = r4
        L3af:
            if (r1 == 0) goto L3b4
            java.lang.String r12 = "添加"
            goto L3b6
        L3b4:
            java.lang.String r12 = "恢复"
        L3b6:
            r7.setText(r12)
            if (r1 == 0) goto L3be
            java.lang.String r12 = r9.f12358
            goto L3c0
        L3be:
            java.lang.String r12 = r9.f12366
        L3c0:
            int r12 = android.graphics.Color.parseColor(r12)
            r7.setTextColor(r12)
            if (r1 == 0) goto L3cc
            java.lang.String r12 = r9.f12359
            goto L3ce
        L3cc:
            java.lang.String r12 = r9.f12367
        L3ce:
            r13 = 99
            android.graphics.drawable.GradientDrawable r12 = p000.jx0.m3062(r13, r3, r12)
            r7.setBackground(r12)
        L3d7:
            return r14
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
            r1 = this;
            int r0 = r1.f13032
            switch(r0) {
                case 3: goto La;
                default: goto L5;
            }
        L5:
            boolean r1 = super.hasStableIds()
            return r1
        La:
            r1 = 1
            return r1
    }
}
