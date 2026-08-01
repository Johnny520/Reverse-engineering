package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m90 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f7027;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f7028;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f7029;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f7030;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.Object f7031;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ java.lang.Object f7032;

    public /* synthetic */ m90(android.widget.LinearLayout r2, com.example.dyhelper.p002ui.GestureAreaView r3, android.widget.TextView r4, android.widget.TextView r5, android.widget.TextView r6) {
            r1 = this;
            r0 = 1
            r1.f7027 = r0
            r1.<init>()
            r1.f7029 = r2
            r1.f7030 = r3
            r1.f7028 = r4
            r1.f7031 = r5
            r1.f7032 = r6
            return
    }

    public /* synthetic */ m90(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, int r6) {
            r0 = this;
            r0.f7027 = r6
            r0.f7029 = r1
            r0.f7030 = r2
            r0.f7031 = r3
            r0.f7028 = r4
            r0.f7032 = r5
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r26) {
            r25 = this;
            r0 = r25
            int r1 = r0.f7027
            r2 = 23
            java.lang.String r3 = "正在连接..."
            r4 = 0
            java.lang.String r5 = "comment_bg_mode"
            s62 r6 = p000.s62.f9751
            java.lang.Object r7 = r0.f7032
            java.lang.Object r8 = r0.f7028
            java.lang.Object r9 = r0.f7031
            java.lang.Object r10 = r0.f7030
            java.lang.Object r0 = r0.f7029
            switch(r1) {
                case 0: goto L115;
                case 1: goto Lfa;
                case 2: goto Lbb;
                case 3: goto L79;
                case 4: goto L4c;
                default: goto L1a;
            }
        L1a:
            sm1 r0 = (p000.sm1) r0
            a80 r10 = (p000.a80) r10
            java.lang.String[] r9 = (java.lang.String[]) r9
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r1 = r26
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            bv1 r2 = p000.bv1.f1853
            p000.ui1.m5873(r5, r1)
            r0.f9967 = r1
            r0 = r9[r1]
            r10.invoke(r0)
            r0 = 1
            r2 = 8
            if (r1 != r0) goto L3f
            r0 = r4
            goto L40
        L3f:
            r0 = r2
        L40:
            r8.setVisibility(r0)
            r0 = 2
            if (r1 != r0) goto L47
            goto L48
        L47:
            r4 = r2
        L48:
            r7.setVisibility(r4)
            return r6
        L4c:
            android.app.Activity r0 = (android.app.Activity) r0
            r14 = r10
            java.lang.String[] r14 = (java.lang.String[]) r14
            r12 = r9
            sm1 r12 = (p000.sm1) r12
            r15 = r8
            android.widget.LinearLayout r15 = (android.widget.LinearLayout) r15
            r16 = r7
            android.widget.LinearLayout r16 = (android.widget.LinearLayout) r16
            r13 = r26
            a80 r13 = (p000.a80) r13
            r13.getClass()
            bv1 r1 = p000.bv1.f1853
            android.content.SharedPreferences r1 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L6c
            int r4 = r1.getInt(r5, r4)     // Catch: java.lang.Throwable -> L6c
        L6c:
            m90 r11 = new m90
            r17 = 5
            r11.<init>(r12, r13, r14, r15, r16, r17)
            java.lang.String r1 = "选择背景模式"
            p000.bv1.m1054(r0, r1, r14, r4, r11)
            return r6
        L79:
            android.app.Activity r0 = (android.app.Activity) r0
            r18 = r10
            java.lang.String r18 = (java.lang.String) r18
            fv r9 = (p000.C0299fv) r9
            r17 = r8
            java.lang.String r17 = (java.lang.String) r17
            r23 = r7
            zx0 r23 = (p000.zx0) r23
            r20 = r26
            java.lang.String r20 = (java.lang.String) r20
            r20.getClass()
            qy0 r1 = p000.qy0.f9157
            p000.qy0.m4960(r0)
            java.lang.String r4 = "下载原画质"
            p000.qy0.m4996(r0, r4, r3)
            java.lang.String r3 = "开始下载原画质视频..."
            p000.qy0.m4991(r0, r3)
            java.lang.String r3 = r9.f4139
            p000.qy0.m4960(r0)
            int r19 = r1.m5031()
            boolean r21 = p000.qy0.m4988(r0)
            vx0 r15 = new vx0
            r16 = r0
            r22 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.String r0 = "dl-original-video"
            p000.p91.m4411(r2, r15, r0)
            return r6
        Lbb:
            android.app.Activity r0 = (android.app.Activity) r0
            r18 = r10
            fv r18 = (p000.C0299fv) r18
            r20 = r9
            java.lang.String r20 = (java.lang.String) r20
            r21 = r8
            f8 r21 = (p000.C0276f8) r21
            r22 = r7
            java.lang.String r22 = (java.lang.String) r22
            r19 = r26
            java.lang.String r19 = (java.lang.String) r19
            r19.getClass()
            qy0 r1 = p000.qy0.f9157
            p000.qy0.m4960(r0)
            int r23 = r1.m5031()
            boolean r24 = p000.qy0.m4988(r0)
            java.lang.String r1 = "下载音频"
            p000.qy0.m4996(r0, r1, r3)
            java.lang.String r1 = "开始下载音频..."
            p000.qy0.m4991(r0, r1)
            vx0 r16 = new vx0
            r17 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r0 = r16
            java.lang.String r1 = "dl-audio"
            p000.p91.m4411(r2, r0, r1)
            return r6
        Lfa:
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            com.example.dyhelper.ui.GestureAreaView r10 = (com.example.dyhelper.p002ui.GestureAreaView) r10
            android.widget.TextView r8 = (android.widget.TextView) r8
            android.widget.TextView r9 = (android.widget.TextView) r9
            r11 = r7
            android.widget.TextView r11 = (android.widget.TextView) r11
            r12 = r26
            java.lang.String r12 = (java.lang.String) r12
            r12.getClass()
            r7 = r9
            r9 = r8
            r8 = r10
            r10 = r7
            r7 = r0
            p000.ia0.m2695(r7, r8, r9, r10, r11, r12)
            return r6
        L115:
            android.app.Activity r0 = (android.app.Activity) r0
            r12 = r10
            android.app.AlertDialog r12 = (android.app.AlertDialog) r12
            r14 = r9
            android.widget.ProgressBar r14 = (android.widget.ProgressBar) r14
            r15 = r8
            android.widget.TextView r15 = (android.widget.TextView) r15
            r16 = r7
            xx r16 = (p000.C1000xx) r16
            r13 = r26
            r90 r13 = (p000.r90) r13
            r13.getClass()
            v8 r11 = new v8
            r17 = 3
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r0.runOnUiThread(r11)
            return r6
    }
}
