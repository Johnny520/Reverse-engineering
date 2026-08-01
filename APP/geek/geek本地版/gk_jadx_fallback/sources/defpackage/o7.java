package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o7 implements android.view.View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ o7(int r1, java.lang.Object r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25) {
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.a
            switch(r2) {
                case 0: goto L3b5;
                case 1: goto L69;
                default: goto L9;
            }
        L9:
            java.lang.Object r1 = r0.b
            androidx.appcompat.widget.SearchView r1 = (androidx.appcompat.widget.SearchView) r1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r1.p
            android.view.View r3 = r1.x
            int r4 = r3.getWidth()
            r5 = 1
            if (r4 <= r5) goto L68
            android.content.Context r4 = r1.getContext()
            android.content.res.Resources r4 = r4.getResources()
            android.view.View r5 = r1.r
            int r5 = r5.getPaddingLeft()
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            boolean r7 = defpackage.cb0.a(r1)
            boolean r1 = r1.M
            if (r1 == 0) goto L43
            r1 = 2131165225(0x7f070029, float:1.7944661E38)
            int r1 = r4.getDimensionPixelSize(r1)
            r8 = 2131165226(0x7f07002a, float:1.7944663E38)
            int r4 = r4.getDimensionPixelSize(r8)
            int r4 = r4 + r1
            goto L44
        L43:
            r4 = 0
        L44:
            android.graphics.drawable.Drawable r1 = r2.getDropDownBackground()
            r1.getPadding(r6)
            if (r7 == 0) goto L51
            int r1 = r6.left
            int r1 = -r1
            goto L56
        L51:
            int r1 = r6.left
            int r1 = r1 + r4
            int r1 = r5 - r1
        L56:
            r2.setDropDownHorizontalOffset(r1)
            int r1 = r3.getWidth()
            int r3 = r6.left
            int r1 = r1 + r3
            int r3 = r6.right
            int r1 = r1 + r3
            int r1 = r1 + r4
            int r1 = r1 - r5
            r2.setDropDownWidth(r1)
        L68:
            return
        L69:
            java.lang.String r2 = "vQ==\n"
            java.lang.String r3 = "yxG2LRcqKfI=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r3)
            defpackage.ip.o(r2, r1)
            r1.removeOnLayoutChangeListener(r0)
            r2 = 2114650114(0x7e0b0002, float:4.6190683E37)
            r3 = 0
            r1.setTag(r2, r3)
            int r2 = r20 - r18
            int r4 = r21 - r19
            if (r2 <= 0) goto L3b4
            if (r4 <= 0) goto L3b4
            java.lang.Object r5 = r0.b
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "b87GOPhS61V5zw==\n"
            java.lang.String r7 = "DKanTIw7hTI=\n"
            java.lang.String r6 = defpackage.u40.a(r6, r7)
            r7 = 0
            boolean r5 = defpackage.b50.B(r5, r6, r7)
            android.view.ViewParent r6 = r1.getParent()
            boolean r8 = r6 instanceof android.view.View
            if (r8 == 0) goto La2
            android.view.View r6 = (android.view.View) r6
            goto La3
        La2:
            r6 = r3
        La3:
            r8 = r7
        La4:
            r9 = -1
            java.lang.String r10 = ""
            r11 = 15
            r12 = 1
            if (r6 == 0) goto L13e
            if (r8 >= r11) goto L13e
            java.lang.Class r11 = r6.getClass()
            java.lang.String r11 = r11.getName()
            java.lang.String r13 = "G6vDFjjbE/xS4Jlx\n"
            java.lang.String r14 = "fM63WFm2dtQ=\n"
            defpackage.u40.a(r13, r14)
            java.util.Locale r13 = java.util.Locale.ROOT
            java.lang.String r14 = "1lZaug==\n"
            java.lang.String r15 = "hBkV7qsvXVs=\n"
            java.lang.String r14 = defpackage.u40.a(r14, r15)
            defpackage.ip.n(r14, r13)
            java.lang.String r11 = r11.toLowerCase(r13)
            java.lang.String r14 = "IE5caebROEQ1UnUuv5pkLg==\n"
            java.lang.String r15 = "VCEQBpG0Sgc=\n"
            java.lang.String r14 = defpackage.u40.a(r14, r15)
            defpackage.ip.n(r14, r11)
            int r14 = r6.getId()
            if (r14 == r9) goto L111
            android.content.Context r9 = r6.getContext()     // Catch: java.lang.Throwable -> L111
            android.content.res.Resources r9 = r9.getResources()     // Catch: java.lang.Throwable -> L111
            int r14 = r6.getId()     // Catch: java.lang.Throwable -> L111
            java.lang.String r9 = r9.getResourceEntryName(r14)     // Catch: java.lang.Throwable -> L111
            java.lang.String r14 = "SyQMQX0eD1peIh1WdhkSVmIgFXYwQ04BBQ==\n"
            java.lang.String r15 = "LEF4ExhtYC8=\n"
            java.lang.String r14 = defpackage.u40.a(r14, r15)     // Catch: java.lang.Throwable -> L111
            defpackage.ip.n(r14, r9)     // Catch: java.lang.Throwable -> L111
            java.lang.String r14 = "+1j/jg==\n"
            java.lang.String r15 = "qRew2mUBMR4=\n"
            defpackage.u40.a(r14, r15)     // Catch: java.lang.Throwable -> L111
            java.lang.String r9 = r9.toLowerCase(r13)     // Catch: java.lang.Throwable -> L111
            java.lang.String r13 = "87MooHc5857mrwHnLnKv9A==\n"
            java.lang.String r14 = "h9xkzwBcgd0=\n"
            java.lang.String r13 = defpackage.u40.a(r13, r14)     // Catch: java.lang.Throwable -> L111
            defpackage.ip.n(r13, r9)     // Catch: java.lang.Throwable -> L111
            r10 = r9
        L111:
            java.lang.String r9 = "NKc2/WixML4=\n"
            java.lang.String r13 = "V89XiRzYXtk=\n"
            java.lang.String r9 = defpackage.u40.a(r9, r13)
            boolean r9 = defpackage.b50.B(r10, r9, r7)
            if (r9 != 0) goto L12d
            java.lang.String r9 = "M755Bn7dj+g=\n"
            java.lang.String r10 = "UNYYcgq04Y8=\n"
            java.lang.String r9 = defpackage.u40.a(r9, r10)
            boolean r9 = defpackage.b50.B(r11, r9, r7)
            if (r9 == 0) goto L12e
        L12d:
            r5 = r12
        L12e:
            android.view.ViewParent r6 = r6.getParent()
            boolean r9 = r6 instanceof android.view.View
            if (r9 == 0) goto L139
            android.view.View r6 = (android.view.View) r6
            goto L13a
        L139:
            r6 = r3
        L13a:
            int r8 = r8 + 1
            goto La4
        L13e:
            android.view.ViewParent r6 = r1.getParent()
            boolean r8 = r6 instanceof android.view.View
            if (r8 == 0) goto L149
            android.view.View r6 = (android.view.View) r6
            goto L14a
        L149:
            r6 = r3
        L14a:
            r8 = r7
        L14b:
            r13 = 2114650112(0x7e0b0000, float:4.6190673E37)
            if (r6 == 0) goto L326
            if (r8 >= r11) goto L326
            java.lang.Class r14 = r6.getClass()
            java.lang.String r14 = r14.getName()
            java.lang.String r15 = "RQXo05oMvX8MTrK0\n"
            java.lang.String r3 = "ImCcnfth2Fc=\n"
            defpackage.u40.a(r15, r3)
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r15 = "yLTJkA==\n"
            java.lang.String r11 = "mvuGxA7gw5I=\n"
            java.lang.String r11 = defpackage.u40.a(r15, r11)
            defpackage.ip.n(r11, r3)
            java.lang.String r11 = r14.toLowerCase(r3)
            java.lang.String r14 = "t9p6a6wcqJeixlMs9Vf0/Q==\n"
            java.lang.String r15 = "w7U2BNt52tQ=\n"
            java.lang.String r14 = defpackage.u40.a(r14, r15)
            defpackage.ip.n(r14, r11)
            int r14 = r6.getId()
            if (r14 == r9) goto L1b4
            android.content.Context r14 = r6.getContext()     // Catch: java.lang.Throwable -> L1b4
            android.content.res.Resources r14 = r14.getResources()     // Catch: java.lang.Throwable -> L1b4
            int r15 = r6.getId()     // Catch: java.lang.Throwable -> L1b4
            java.lang.String r14 = r14.getResourceEntryName(r15)     // Catch: java.lang.Throwable -> L1b4
            java.lang.String r15 = "N5wfpIaKo4Aimg6zjY2+jB6YBpPL1+LbeQ==\n"
            java.lang.String r9 = "UPlr9uP5zPU=\n"
            java.lang.String r9 = defpackage.u40.a(r15, r9)     // Catch: java.lang.Throwable -> L1b4
            defpackage.ip.n(r9, r14)     // Catch: java.lang.Throwable -> L1b4
            java.lang.String r9 = "2ggXdw==\n"
            java.lang.String r15 = "iEdYI+JWvzg=\n"
            defpackage.u40.a(r9, r15)     // Catch: java.lang.Throwable -> L1b4
            java.lang.String r3 = r14.toLowerCase(r3)     // Catch: java.lang.Throwable -> L1b4
            java.lang.String r9 = "t+LhBopxhm6i/shB0zraBA==\n"
            java.lang.String r14 = "w42taf0U9C0=\n"
            java.lang.String r9 = defpackage.u40.a(r9, r14)     // Catch: java.lang.Throwable -> L1b4
            defpackage.ip.n(r9, r3)     // Catch: java.lang.Throwable -> L1b4
            goto L1b5
        L1b4:
            r3 = r10
        L1b5:
            java.lang.String r9 = "e9HxZkY=\n"
            java.lang.String r14 = "HryeDC9583c=\n"
            java.lang.String r9 = defpackage.u40.a(r9, r14)
            boolean r9 = defpackage.b50.B(r11, r9, r7)
            if (r9 != 0) goto L31f
            java.lang.String r9 = "UeVyU+k=\n"
            java.lang.String r14 = "NIgdOYA7wJI=\n"
            java.lang.String r9 = defpackage.u40.a(r9, r14)
            boolean r9 = defpackage.b50.B(r3, r9, r7)
            if (r9 != 0) goto L31f
            java.lang.String r9 = "MKXAKMme\n"
            java.lang.String r14 = "Q8ipRKzn048=\n"
            java.lang.String r9 = defpackage.u40.a(r9, r14)
            boolean r9 = defpackage.b50.B(r11, r9, r7)
            if (r9 != 0) goto L31f
            java.lang.String r9 = "5KO+hVcR\n"
            java.lang.String r14 = "l87X6TJoE2A=\n"
            java.lang.String r9 = defpackage.u40.a(r9, r14)
            boolean r9 = defpackage.b50.B(r3, r9, r7)
            if (r9 != 0) goto L31f
            java.lang.String r9 = "DI+hZMaZ7TU=\n"
            java.lang.String r14 = "aeLOEK/6gls=\n"
            java.lang.String r9 = defpackage.u40.a(r9, r14)
            boolean r9 = defpackage.b50.B(r11, r9, r7)
            if (r9 != 0) goto L31f
            java.lang.String r9 = "ZRpZXxmJWL8=\n"
            java.lang.String r14 = "AHc2K3DqN9E=\n"
            java.lang.String r9 = defpackage.u40.a(r9, r14)
            boolean r9 = defpackage.b50.B(r3, r9, r7)
            if (r9 != 0) goto L31f
            java.lang.String r9 = "uYWtTKCaLaY=\n"
            java.lang.String r14 = "0uDULs/7X8I=\n"
            java.lang.String r9 = defpackage.u40.a(r9, r14)
            boolean r9 = defpackage.b50.B(r11, r9, r7)
            if (r9 != 0) goto L31f
            java.lang.String r9 = "yn2s0Sk=\n"
            java.lang.String r14 = "oxPcpF1UVnk=\n"
            java.lang.String r9 = defpackage.u40.a(r9, r14)
            boolean r9 = defpackage.b50.B(r3, r9, r7)
            if (r9 == 0) goto L227
            goto L31f
        L227:
            if (r5 == 0) goto L30a
            java.lang.String r9 = "mbOq3Fw=\n"
            java.lang.String r14 = "6MbFqDlP+XI=\n"
            java.lang.String r9 = defpackage.u40.a(r9, r14)
            boolean r9 = defpackage.b50.B(r11, r9, r7)
            if (r9 != 0) goto L31f
            java.lang.String r9 = "kZlImRQ=\n"
            java.lang.String r14 = "4Own7XG8ejI=\n"
            java.lang.String r9 = defpackage.u40.a(r9, r14)
            boolean r9 = defpackage.b50.B(r3, r9, r7)
            if (r9 != 0) goto L31f
            java.lang.String r9 = "t81EIYw=\n"
            java.lang.String r14 = "xag0TfVbU0M=\n"
            java.lang.String r9 = defpackage.u40.a(r9, r14)
            boolean r9 = defpackage.b50.B(r11, r9, r7)
            if (r9 != 0) goto L31f
            java.lang.String r9 = "NVMS8mg=\n"
            java.lang.String r14 = "RzZinhEc5mY=\n"
            java.lang.String r9 = defpackage.u40.a(r9, r14)
            boolean r9 = defpackage.b50.B(r3, r9, r7)
            if (r9 != 0) goto L31f
            java.lang.String r9 = "YDRKLpY=\n"
            java.lang.String r14 = "EFUkS/orI58=\n"
            java.lang.String r9 = defpackage.u40.a(r9, r14)
            boolean r9 = defpackage.b50.B(r11, r9, r7)
            if (r9 != 0) goto L31f
            java.lang.String r9 = "lps2uZA=\n"
            java.lang.String r14 = "5vpY3PwjBvM=\n"
            java.lang.String r9 = defpackage.u40.a(r9, r14)
            boolean r9 = defpackage.b50.B(r3, r9, r7)
            if (r9 != 0) goto L31f
            java.lang.String r9 = "nG/qh4Lt\n"
            java.lang.String r14 = "+gCF8+ef4z0=\n"
            java.lang.String r9 = defpackage.u40.a(r9, r14)
            boolean r9 = defpackage.b50.B(r11, r9, r7)
            if (r9 != 0) goto L31f
            java.lang.String r9 = "R3djMkLB\n"
            java.lang.String r14 = "IRgMRiezT1U=\n"
            java.lang.String r9 = defpackage.u40.a(r9, r14)
            boolean r9 = defpackage.b50.B(r3, r9, r7)
            if (r9 != 0) goto L31f
            java.lang.String r9 = "6oBMTzuH\n"
            java.lang.String r14 = "iO84O1TqjIA=\n"
            java.lang.String r9 = defpackage.u40.a(r9, r14)
            boolean r9 = defpackage.b50.B(r11, r9, r7)
            if (r9 != 0) goto L31f
            java.lang.String r9 = "gLRM9NBZ\n"
            java.lang.String r14 = "4ts4gL80eHY=\n"
            java.lang.String r9 = defpackage.u40.a(r9, r14)
            boolean r9 = defpackage.b50.B(r3, r9, r7)
            if (r9 != 0) goto L31f
            java.lang.String r9 = "p3hJtg==\n"
            java.lang.String r14 = "wAog0qUiIuE=\n"
            java.lang.String r9 = defpackage.u40.a(r9, r14)
            boolean r9 = defpackage.b50.B(r11, r9, r7)
            if (r9 != 0) goto L31f
            java.lang.String r9 = "TJ+Vvw==\n"
            java.lang.String r11 = "K+3828fcbYk=\n"
            java.lang.String r9 = defpackage.u40.a(r9, r11)
            boolean r9 = defpackage.b50.B(r3, r9, r7)
            if (r9 != 0) goto L31f
            java.lang.String r9 = "dSbXqQAho9BJLdmzAC2jww==\n"
            java.lang.String r11 = "Fk623XRIzbc=\n"
            java.lang.String r9 = defpackage.u40.a(r9, r11)
            boolean r9 = defpackage.b50.B(r3, r9, r7)
            if (r9 != 0) goto L31f
            java.lang.String r9 = "dvFktoUxij9K8HGnnAeFKGX0dqU=\n"
            java.lang.String r11 = "FZkFwvFY5Fg=\n"
            java.lang.String r9 = defpackage.u40.a(r9, r11)
            boolean r9 = defpackage.b50.B(r3, r9, r7)
            if (r9 != 0) goto L31f
            java.lang.String r9 = "s0qGldtd\n"
            java.lang.String r11 = "wCXz57g4+Xc=\n"
            java.lang.String r9 = defpackage.u40.a(r9, r11)
            boolean r9 = defpackage.b50.B(r3, r9, r7)
            if (r9 != 0) goto L31f
            java.lang.String r9 = "h8OPKw==\n"
            java.lang.String r11 = "5KL9Tx87l90=\n"
            java.lang.String r9 = defpackage.u40.a(r9, r11)
            boolean r3 = defpackage.b50.B(r3, r9, r7)
            if (r3 == 0) goto L30a
            goto L31f
        L30a:
            android.view.ViewParent r3 = r6.getParent()
            boolean r6 = r3 instanceof android.view.View
            if (r6 == 0) goto L316
            android.view.View r3 = (android.view.View) r3
            r6 = r3
            goto L317
        L316:
            r6 = 0
        L317:
            int r8 = r8 + 1
            r3 = 0
            r9 = -1
            r11 = 15
            goto L14b
        L31f:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.setTag(r13, r2)
            goto L3b4
        L326:
            if (r5 == 0) goto L32b
            r3 = 1107820544(0x42080000, float:34.0)
            goto L32d
        L32b:
            r3 = 1094713344(0x41400000, float:12.0)
        L32d:
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            r5 = 5
            if (r4 > r5) goto L3af
            float r2 = (float) r2
            android.content.res.Resources r4 = r1.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r2 = r2 / r4
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 > 0) goto L3a9
            r3 = 1118437376(0x42aa0000, float:85.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L3a9
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.setTag(r13, r2)
            java.lang.String r2 = "8Oplo2NVFOj/6nijcEwA8vr9\n"
            java.lang.String r3 = "m48c/BE6YYY=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r3)
            java.lang.String r3 = "ggWA\n"
            java.lang.String r4 = "6WD5BmkcYhM=\n"
            java.lang.String r3 = defpackage.u40.a(r3, r4)
            defpackage.ip.o(r3, r2)
            gn r3 = defpackage.gn.a     // Catch: java.lang.Throwable -> L36e
            r3.getClass()     // Catch: java.lang.Throwable -> L36e
            boolean r2 = defpackage.gn.e(r2)     // Catch: java.lang.Throwable -> L36e
            goto L399
        L36e:
            gn r3 = defpackage.gn.a     // Catch: java.lang.Throwable -> L398
            java.lang.String r4 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L398
            r3.getClass()     // Catch: java.lang.Throwable -> L398
            java.lang.String r2 = defpackage.gn.d(r2, r4)     // Catch: java.lang.Throwable -> L398
            java.lang.String r3 = "true"
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Throwable -> L398
            if (r3 == 0) goto L386
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L398
            goto L392
        L386:
            java.lang.String r3 = "false"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L398
            if (r2 == 0) goto L391
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L398
            goto L392
        L391:
            r3 = 0
        L392:
            if (r3 == 0) goto L398
            boolean r7 = r3.booleanValue()     // Catch: java.lang.Throwable -> L398
        L398:
            r2 = r7
        L399:
            if (r2 == 0) goto L3b4
            ay r2 = defpackage.dy.h
            if (r2 == 0) goto L3b4
            r1.setOutlineProvider(r2)
            r1.setClipToOutline(r12)
            r1.invalidateOutline()
            goto L3b4
        L3a9:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.setTag(r13, r2)
            goto L3b4
        L3af:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.setTag(r13, r2)
        L3b4:
            return
        L3b5:
            r1 = 0
            throw r1
    }
}
