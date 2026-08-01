package p000;

/* JADX INFO: renamed from: n9 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0578n9 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f7464;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f7465;

    public /* synthetic */ RunnableC0578n9(android.app.Activity r1, int r2) {
            r0 = this;
            r0.f7464 = r2
            r0.f7465 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r27 = this;
            r0 = r27
            int r1 = r0.f7464
            r2 = 1
            r3 = 2
            r4 = 4
            r5 = 0
            r6 = 0
            switch(r1) {
                case 0: goto L7c7;
                case 1: goto L7bf;
                case 2: goto L7b9;
                case 3: goto L7b3;
                case 4: goto L77a;
                case 5: goto L719;
                case 6: goto L6ec;
                case 7: goto L6bd;
                case 8: goto L6ae;
                case 9: goto L646;
                case 10: goto L518;
                case 11: goto L510;
                case 12: goto L508;
                case 13: goto L4e7;
                case 14: goto L4dc;
                case 15: goto L219;
                case 16: goto L208;
                case 17: goto L1fc;
                case 18: goto L1c9;
                case 19: goto L1bd;
                case 20: goto L197;
                case 21: goto L18b;
                case 22: goto L146;
                case 23: goto L122;
                case 24: goto Le9;
                case 25: goto Ld8;
                case 26: goto Lc6;
                case 27: goto Lb5;
                case 28: goto L8f;
                default: goto Lc;
            }
        Lc:
            android.app.Activity r10 = r0.f7465
            boolean r0 = p000.AbstractC0976x9.m6528()     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L20
            java.lang.String r0 = "营地管理仅限内测用户使用"
            android.widget.Toast r0 = android.widget.Toast.makeText(r10, r0, r6)     // Catch: java.lang.Throwable -> L1e
            r0.show()     // Catch: java.lang.Throwable -> L1e
            goto L8e
        L1e:
            r0 = move-exception
            goto L77
        L20:
            x01 r0 = p000.x01.f11964     // Catch: java.lang.Throwable -> L1e
            android.view.LayoutInflater r0 = r0.m6477(r10)     // Catch: java.lang.Throwable -> L1e
            r1 = 2131492914(0x7f0c0032, float:1.8609293E38)
            android.view.View r11 = r0.inflate(r1, r5, r6)     // Catch: java.lang.Throwable -> L1e
            r11.getClass()     // Catch: java.lang.Throwable -> L1e
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder     // Catch: java.lang.Throwable -> L1e
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L1e
            android.app.AlertDialog$Builder r0 = r0.setView(r11)     // Catch: java.lang.Throwable -> L1e
            android.app.AlertDialog r8 = r0.create()     // Catch: java.lang.Throwable -> L1e
            r8.getClass()     // Catch: java.lang.Throwable -> L1e
            p000.xn0.m6711(r10, r11, r8)     // Catch: java.lang.Throwable -> L1e
            r8.show()     // Catch: java.lang.Throwable -> L1e
            r0 = 1063004406(0x3f5c28f6, float:0.86)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch: java.lang.Throwable -> L1e
            r1 = 1064346583(0x3f70a3d7, float:0.94)
            p000.xn0.m6716(r10, r8, r1, r0)     // Catch: java.lang.Throwable -> L1e
            android.os.Handler r13 = new android.os.Handler     // Catch: java.lang.Throwable -> L1e
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L1e
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L1e
            um1 r9 = new um1     // Catch: java.lang.Throwable -> L1e
            r9.<init>()     // Catch: java.lang.Throwable -> L1e
            um1 r12 = new um1     // Catch: java.lang.Throwable -> L1e
            r12.<init>()     // Catch: java.lang.Throwable -> L1e
            ub1 r7 = new ub1     // Catch: java.lang.Throwable -> L1e
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L1e
            j9 r0 = new j9     // Catch: java.lang.Throwable -> L1e
            r0.<init>(r13, r3, r7)     // Catch: java.lang.Throwable -> L1e
            r8.setOnDismissListener(r0)     // Catch: java.lang.Throwable -> L1e
            r13.post(r7)     // Catch: java.lang.Throwable -> L1e
            goto L8e
        L77:
            xq0 r1 = p000.xq0.f12253
            java.lang.String r3 = "DYHelper: 打开营地管理界面失败"
            r1.m6777(r3)
            r1.m6778(r0)
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L89
            java.lang.String r0 = ""
        L89:
            java.lang.String r1 = "打开营地管理失败: "
            p000.a12.m21(r2, r10, r1, r0)
        L8e:
            return
        L8f:
            android.app.Activity r1 = r0.f7465
            q71 r0 = p000.q71.f8896     // Catch: java.lang.Throwable -> L9b
            f8 r0 = p000.q71.m4773()     // Catch: java.lang.Throwable -> L9b
            p000.q71.m4795(r0, r1)     // Catch: java.lang.Throwable -> L9b
            goto Lb4
        L9b:
            r0 = move-exception
            java.lang.String r2 = "DYHelper"
            java.lang.String r0 = r0.getMessage()
            java.lang.String r3 = "OperationDialog downloadCurrentWork failed: "
            java.lang.String r0 = p000.lz1.m3687(r3, r0)
            p000.C0888ux.m5988(r2, r0, r5, r4, r5)
            java.lang.String r0 = "下载作品失败"
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r6)
            r0.show()
        Lb4:
            return
        Lb5:
            android.app.Activity r0 = r0.f7465
            q71 r1 = p000.q71.f8896
            java.lang.String r1 = "添加作者主页书签"
            f9 r2 = new f9
            r3 = 10
            r2.<init>(r0, r3)
            p000.q71.m4783(r0, r1, r2)
            return
        Lc6:
            android.app.Activity r0 = r0.f7465
            bv1 r1 = p000.bv1.f1853
            r0.getClass()
            hg1 r1 = new hg1
            r2 = 8
            r1.<init>(r0, r2)
            r0.runOnUiThread(r1)
            return
        Ld8:
            android.app.Activity r0 = r0.f7465
            q71 r1 = p000.q71.f8896
            java.lang.String r1 = "添加作品书签"
            f9 r2 = new f9
            r3 = 18
            r2.<init>(r0, r3)
            p000.q71.m4783(r0, r1, r2)
            return
        Le9:
            android.app.Activity r1 = r0.f7465
            q71 r0 = p000.q71.f8896     // Catch: java.lang.Throwable -> Lfd
            f8 r0 = p000.q71.m4773()     // Catch: java.lang.Throwable -> Lfd
            boolean r2 = r0.m2049()     // Catch: java.lang.Throwable -> Lfd
            if (r2 == 0) goto Lff
            qy0 r2 = p000.qy0.f9157     // Catch: java.lang.Throwable -> Lfd
            r2.m5018(r0, r1)     // Catch: java.lang.Throwable -> Lfd
            goto L121
        Lfd:
            r0 = move-exception
            goto L109
        Lff:
            java.lang.String r0 = "未找到可下载的音频"
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r6)     // Catch: java.lang.Throwable -> Lfd
            r0.show()     // Catch: java.lang.Throwable -> Lfd
            goto L121
        L109:
            java.lang.String r2 = "DYHelper"
            java.lang.String r0 = r0.getMessage()
            java.lang.String r3 = "OperationDialog downloadCurrentAudio failed: "
            java.lang.String r0 = p000.lz1.m3687(r3, r0)
            p000.C0888ux.m5988(r2, r0, r5, r4, r5)
            java.lang.String r0 = "下载音频失败"
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r6)
            r0.show()
        L121:
            return
        L122:
            android.app.Activity r1 = r0.f7465
            java.lang.String r2 = "DYHelper"
            q71 r3 = p000.q71.f8896
            r3.m4808(r1)     // Catch: java.lang.Throwable -> L12c
            goto L145
        L12c:
            r0 = move-exception
            r4 = r0
            java.lang.String r0 = "操作菜单 XML UI 打开失败，改用纯代码面板"
            p000.C0888ux.m5977(r2, r0, r4)
            r3.m4807(r1)     // Catch: java.lang.Throwable -> L137
            goto L145
        L137:
            r0 = move-exception
            p000.ln0.m3624(r0, r4)
            java.lang.String r3 = "操作菜单降级 UI 打开失败"
            p000.C0888ux.m5977(r2, r3, r0)
            java.lang.String r2 = "操作菜单"
            p000.u81.m5815(r1, r2, r0)
        L145:
            return
        L146:
            android.app.Activity r1 = r0.f7465
            li0 r0 = new li0     // Catch: java.lang.Throwable -> L153
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L153
            r0.m3574()     // Catch: java.lang.Throwable -> L153
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L153
            goto L15a
        L153:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L15a:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L18a
            java.lang.String r2 = "r846626a90309cae8"
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = p000.mi0.m3828(r0)
            java.lang.String r5 = "打开批量删除会话弹窗失败 type="
            java.lang.String r7 = ", message="
            java.lang.String r3 = p000.a12.m18(r5, r3, r7, r4)
            p000.C0888ux.m5977(r2, r3, r0)
            java.lang.String r0 = p000.mi0.m3828(r0)
            java.lang.String r2 = "打开会话删除列表失败："
            java.lang.String r0 = r2.concat(r0)
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r6)
            r0.show()
        L18a:
            return
        L18b:
            android.app.Activity r0 = r0.f7465
            java.lang.String r1 = "会话批量删除仅限内测用户使用"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r6)
            r0.show()
            return
        L197:
            android.app.Activity r1 = r0.f7465
            p000.AbstractC0073bd.m895(r1)     // Catch: java.lang.Throwable -> L19f
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L19f
            goto L1a6
        L19f:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L1a6:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L1bc
            java.lang.String r2 = "r84e9ffe40b72d3"
            java.lang.String r3 = r0.getMessage()
            java.lang.String r4 = "切换隐藏联系人状态失败: "
            p000.AbstractC0602nx.m4145(r4, r3, r2, r0)
            java.lang.String r0 = "隐藏联系人状态切换失败"
            p000.AbstractC0073bd.m891(r1, r0)
        L1bc:
            return
        L1bd:
            android.app.Activity r0 = r0.f7465
            java.lang.String r1 = "隐藏联系人仅限内测用户使用"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r6)
            r0.show()
            return
        L1c9:
            android.app.Activity r1 = r0.f7465
            dc0 r0 = new dc0     // Catch: java.lang.Throwable -> L1d6
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1d6
            r0.m1693()     // Catch: java.lang.Throwable -> L1d6
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L1d6
            goto L1dd
        L1d6:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L1dd:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L1fb
            java.lang.String r2 = "rd4acaeee73d4cda0"
            java.lang.String r3 = p000.ec0.m1897(r0)
            java.lang.String r4 = "打开群管理弹窗失败："
            java.lang.String r3 = r4.concat(r3)
            p000.C0888ux.m5977(r2, r3, r0)
            java.lang.String r0 = p000.ec0.m1897(r0)
            java.lang.String r2 = "打开群管理失败："
            p000.a12.m21(r6, r1, r2, r0)
        L1fb:
            return
        L1fc:
            android.app.Activity r0 = r0.f7465
            java.lang.String r1 = "群管理仅限内测用户使用"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r6)
            r0.show()
            return
        L208:
            android.app.Activity r0 = r0.f7465
            x10 r1 = p000.x10.f11972
            r0.getClass()
            n9 r1 = new n9
            r2 = 5
            r1.<init>(r0, r2)
            r0.runOnUiThread(r1)
            return
        L219:
            android.app.Activity r9 = r0.f7465
            boolean r0 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> L225
            if (r0 != 0) goto L228
            p000.ui1.m5896(r9)     // Catch: java.lang.Throwable -> L225
            goto L228
        L225:
            r0 = move-exception
            goto L4ba
        L228:
            android.app.AlertDialog r0 = p000.ia0.f4971     // Catch: java.lang.Throwable -> L225
            if (r0 == 0) goto L22f
            r0.dismiss()     // Catch: java.lang.Throwable -> L225
        L22f:
            x01 r0 = p000.x01.f11964     // Catch: java.lang.Throwable -> L225
            android.view.LayoutInflater r0 = r0.m6477(r9)     // Catch: java.lang.Throwable -> L225
            r1 = 2131492903(0x7f0c0027, float:1.8609271E38)
            android.view.View r0 = r0.inflate(r1, r5, r6)     // Catch: java.lang.Throwable -> L225
            r0.getClass()     // Catch: java.lang.Throwable -> L225
            xx r15 = p000.jx0.m3049(r9)     // Catch: java.lang.Throwable -> L225
            java.lang.String r1 = r15.f12351     // Catch: java.lang.Throwable -> L225
            int r7 = android.graphics.Color.parseColor(r1)     // Catch: java.lang.Throwable -> L225
            r8 = 1096810496(0x41600000, float:14.0)
            p000.ia0.m2692(r8, r7, r0)     // Catch: java.lang.Throwable -> L225
            r7 = 7
            int[] r8 = new int[r7]     // Catch: java.lang.Throwable -> L225
            r8 = {x080e: FILL_ARRAY_DATA , data: [2131296596, 2131296468, 2131296469, 2131296467, 2131296465, 2131296907, 2131296466} // fill-array     // Catch: java.lang.Throwable -> L225
            r10 = r6
        L255:
            if (r10 >= r7) goto L26d
            r11 = r8[r10]     // Catch: java.lang.Throwable -> L225
            android.view.View r11 = r0.findViewById(r11)     // Catch: java.lang.Throwable -> L225
            if (r11 == 0) goto L26a
            java.lang.String r12 = r15.f12352     // Catch: java.lang.Throwable -> L225
            int r12 = android.graphics.Color.parseColor(r12)     // Catch: java.lang.Throwable -> L225
            r13 = 1092616192(0x41200000, float:10.0)
            p000.ia0.m2692(r13, r12, r11)     // Catch: java.lang.Throwable -> L225
        L26a:
            int r10 = r10 + 1
            goto L255
        L26d:
            r7 = 2131296593(0x7f090151, float:1.8211107E38)
            android.view.View r8 = r0.findViewById(r7)     // Catch: java.lang.Throwable -> L225
            if (r8 == 0) goto L285
            int r1 = android.graphics.Color.parseColor(r1)     // Catch: java.lang.Throwable -> L225
            java.lang.String r10 = r15.f12353     // Catch: java.lang.Throwable -> L225
            int r10 = android.graphics.Color.parseColor(r10)     // Catch: java.lang.Throwable -> L225
            r11 = 1065353216(0x3f800000, float:1.0)
            p000.ia0.m2693(r8, r1, r10, r11)     // Catch: java.lang.Throwable -> L225
        L285:
            r1 = 2131296972(0x7f0902cc, float:1.8211876E38)
            android.view.View r1 = r0.findViewById(r1)     // Catch: java.lang.Throwable -> L225
            if (r1 == 0) goto L291
            r1.setBackgroundColor(r6)     // Catch: java.lang.Throwable -> L225
        L291:
            p000.ia0.m2688(r0, r15)     // Catch: java.lang.Throwable -> L225
            r1 = 2131297091(0x7f090343, float:1.8212117E38)
            android.view.View r1 = r0.findViewById(r1)     // Catch: java.lang.Throwable -> L225
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch: java.lang.Throwable -> L225
            r8 = 2131297094(0x7f090346, float:1.8212123E38)
            android.view.View r8 = r0.findViewById(r8)     // Catch: java.lang.Throwable -> L225
            r18 = r8
            android.widget.TextView r18 = (android.widget.TextView) r18     // Catch: java.lang.Throwable -> L225
            r8 = 2131297127(0x7f090367, float:1.821219E38)
            android.view.View r8 = r0.findViewById(r8)     // Catch: java.lang.Throwable -> L225
            r10 = r8
            android.widget.TextView r10 = (android.widget.TextView) r10     // Catch: java.lang.Throwable -> L225
            r8 = 2131297129(0x7f090369, float:1.8212194E38)
            android.view.View r8 = r0.findViewById(r8)     // Catch: java.lang.Throwable -> L225
            r11 = r8
            android.widget.TextView r11 = (android.widget.TextView) r11     // Catch: java.lang.Throwable -> L225
            r8 = 2131297134(0x7f09036e, float:1.8212204E38)
            android.view.View r8 = r0.findViewById(r8)     // Catch: java.lang.Throwable -> L225
            r16 = r8
            android.widget.TextView r16 = (android.widget.TextView) r16     // Catch: java.lang.Throwable -> L225
            r8 = 2131296876(0x7f09026c, float:1.8211681E38)
            android.view.View r8 = r0.findViewById(r8)     // Catch: java.lang.Throwable -> L225
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8     // Catch: java.lang.Throwable -> L225
            r12 = 2131296976(0x7f0902d0, float:1.8211884E38)
            android.view.View r12 = r0.findViewById(r12)     // Catch: java.lang.Throwable -> L225
            r13 = r12
            android.widget.Switch r13 = (android.widget.Switch) r13     // Catch: java.lang.Throwable -> L225
            r12 = 2131297095(0x7f090347, float:1.8212125E38)
            android.view.View r12 = r0.findViewById(r12)     // Catch: java.lang.Throwable -> L225
            r17 = r12
            android.widget.TextView r17 = (android.widget.TextView) r17     // Catch: java.lang.Throwable -> L225
            r13.getClass()     // Catch: java.lang.Throwable -> L225
            p000.ia0.m2699(r13, r15)     // Catch: java.lang.Throwable -> L225
            android.view.View r7 = r0.findViewById(r7)     // Catch: java.lang.Throwable -> L225
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7     // Catch: java.lang.Throwable -> L225
            r12 = r8
            com.example.dyhelper.ui.GestureAreaView r8 = new com.example.dyhelper.ui.GestureAreaView     // Catch: java.lang.Throwable -> L225
            r14 = 6
            r8.<init>(r9, r5, r14, r6)     // Catch: java.lang.Throwable -> L225
            w90 r5 = com.example.dyhelper.p002ui.GestureAreaView.f2522     // Catch: java.lang.Throwable -> L225
            r8.setGridBounds(r5)     // Catch: java.lang.Throwable -> L225
            r7.removeAllViews()     // Catch: java.lang.Throwable -> L225
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Throwable -> L225
            r14 = -1
            r5.<init>(r14, r14)     // Catch: java.lang.Throwable -> L225
            r7.addView(r8, r5)     // Catch: java.lang.Throwable -> L225
            r5 = 2131296907(0x7f09028b, float:1.8211744E38)
            android.view.View r5 = r0.findViewById(r5)     // Catch: java.lang.Throwable -> L225
            r20 = r5
            android.widget.LinearLayout r20 = (android.widget.LinearLayout) r20     // Catch: java.lang.Throwable -> L225
            r5 = 2131297051(0x7f09031b, float:1.8212036E38)
            android.view.View r5 = r0.findViewById(r5)     // Catch: java.lang.Throwable -> L225
            r22 = r5
            android.widget.TextView r22 = (android.widget.TextView) r22     // Catch: java.lang.Throwable -> L225
            r5 = 2131297071(0x7f09032f, float:1.8212077E38)
            android.view.View r5 = r0.findViewById(r5)     // Catch: java.lang.Throwable -> L225
            r23 = r5
            android.widget.TextView r23 = (android.widget.TextView) r23     // Catch: java.lang.Throwable -> L225
            r5 = 2131297098(0x7f09034a, float:1.8212131E38)
            android.view.View r5 = r0.findViewById(r5)     // Catch: java.lang.Throwable -> L225
            r24 = r5
            android.widget.TextView r24 = (android.widget.TextView) r24     // Catch: java.lang.Throwable -> L225
            r5 = 2131296344(0x7f090058, float:1.8210602E38)
            android.view.View r5 = r0.findViewById(r5)     // Catch: java.lang.Throwable -> L225
            android.widget.Button r5 = (android.widget.Button) r5     // Catch: java.lang.Throwable -> L225
            r7 = 2131296345(0x7f090059, float:1.8210604E38)
            android.view.View r7 = r0.findViewById(r7)     // Catch: java.lang.Throwable -> L225
            android.widget.Button r7 = (android.widget.Button) r7     // Catch: java.lang.Throwable -> L225
            r14 = 2131296359(0x7f090067, float:1.8210632E38)
            android.view.View r14 = r0.findViewById(r14)     // Catch: java.lang.Throwable -> L225
            android.widget.Button r14 = (android.widget.Button) r14     // Catch: java.lang.Throwable -> L225
            r3 = 2131296356(0x7f090064, float:1.8210626E38)
            android.view.View r3 = r0.findViewById(r3)     // Catch: java.lang.Throwable -> L225
            android.widget.Button r3 = (android.widget.Button) r3     // Catch: java.lang.Throwable -> L225
            r4 = 2131296360(0x7f090068, float:1.8210634E38)
            android.view.View r4 = r0.findViewById(r4)     // Catch: java.lang.Throwable -> L225
            android.widget.Button r4 = (android.widget.Button) r4     // Catch: java.lang.Throwable -> L225
            r5.getClass()     // Catch: java.lang.Throwable -> L225
            p000.ia0.m2698(r5, r6)     // Catch: java.lang.Throwable -> L225
            r7.getClass()     // Catch: java.lang.Throwable -> L225
            p000.ia0.m2698(r7, r6)     // Catch: java.lang.Throwable -> L225
            r14.getClass()     // Catch: java.lang.Throwable -> L225
            p000.ia0.m2698(r14, r6)     // Catch: java.lang.Throwable -> L225
            r3.getClass()     // Catch: java.lang.Throwable -> L225
            p000.ia0.m2698(r3, r6)     // Catch: java.lang.Throwable -> L225
            r4.getClass()     // Catch: java.lang.Throwable -> L225
            p000.ia0.m2698(r4, r2)     // Catch: java.lang.Throwable -> L225
            pa r2 = new pa     // Catch: java.lang.Throwable -> L225
            r6 = 4
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L225
            r1.setOnClickListener(r2)     // Catch: java.lang.Throwable -> L225
            java.lang.String r1 = "gesture_enabled"
            r2 = 0
            boolean r1 = p000.ui1.m5887(r1, r2)     // Catch: java.lang.Throwable -> L225
            r13.setChecked(r1)     // Catch: java.lang.Throwable -> L225
            r1 = r7
            ca0 r7 = new ca0     // Catch: java.lang.Throwable -> L225
            r2 = r1
            r1 = r12
            r6 = r14
            r12 = r16
            r16 = r17
            r14 = r18
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L225
            r18 = r14
            r17 = r16
            r16 = r12
            r13.setOnCheckedChangeListener(r7)     // Catch: java.lang.Throwable -> L225
            wu r7 = new wu     // Catch: java.lang.Throwable -> L225
            r12 = 2
            r7.<init>(r13, r12)     // Catch: java.lang.Throwable -> L225
            r1.setOnClickListener(r7)     // Catch: java.lang.Throwable -> L225
            m90 r19 = new m90     // Catch: java.lang.Throwable -> L225
            r21 = r8
            r19.<init>(r20, r21, r22, r23, r24)     // Catch: java.lang.Throwable -> L225
            r1 = r19
            r8 = r21
            r12 = r23
            r8.setOnAreaSelectedListener(r1)     // Catch: java.lang.Throwable -> L225
            da0 r7 = new da0     // Catch: java.lang.Throwable -> L225
            r21 = 0
            r14 = r10
            r19 = r15
            r10 = r20
            r15 = r11
            r20 = r17
            r11 = r22
            r17 = r13
            r13 = r24
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L225
            r11 = r15
            r13 = r17
            r15 = r19
            r17 = r20
            r20 = r10
            r10 = r14
            r5.setOnClickListener(r7)     // Catch: java.lang.Throwable -> L225
            da0 r7 = new da0     // Catch: java.lang.Throwable -> L225
            r21 = 1
            r14 = r10
            r19 = r15
            r10 = r20
            r15 = r11
            r20 = r17
            r11 = r22
            r17 = r13
            r13 = r24
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L225
            r11 = r15
            r13 = r17
            r15 = r19
            r17 = r20
            r20 = r10
            r10 = r14
            r2.setOnClickListener(r7)     // Catch: java.lang.Throwable -> L225
            nu r7 = new nu     // Catch: java.lang.Throwable -> L225
            r12 = r9
            r9 = r8
            r8 = r12
            r12 = r10
            r10 = r13
            r14 = r16
            r13 = r11
            r16 = r15
            r15 = r18
            r11 = r20
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L4b8
            r11 = r9
            r9 = r8
            r8 = r11
            r11 = r13
            r18 = r15
            r15 = r16
            r13 = r10
            r10 = r12
            r16 = r14
            r6.setOnClickListener(r7)     // Catch: java.lang.Throwable -> L225
            l9 r1 = new l9     // Catch: java.lang.Throwable -> L225
            r1.<init>(r8, r9)     // Catch: java.lang.Throwable -> L225
            r3.setOnClickListener(r1)     // Catch: java.lang.Throwable -> L225
            ea0 r7 = new ea0     // Catch: java.lang.Throwable -> L225
            r12 = r16
            r16 = r17
            r14 = r18
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L225
            r18 = r14
            r17 = r16
            r16 = r12
            r4.setOnClickListener(r7)     // Catch: java.lang.Throwable -> L225
            r12 = r11
            r14 = r13
            r13 = r16
            r11 = r10
            r16 = r15
            r15 = r18
            r10 = r8
            p000.ia0.m2696(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L225
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder     // Catch: java.lang.Throwable -> L225
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L225
            android.app.AlertDialog$Builder r0 = r1.setView(r0)     // Catch: java.lang.Throwable -> L225
            r1 = 1
            android.app.AlertDialog$Builder r0 = r0.setCancelable(r1)     // Catch: java.lang.Throwable -> L225
            android.app.AlertDialog r0 = r0.create()     // Catch: java.lang.Throwable -> L225
            p000.ia0.f4971 = r0     // Catch: java.lang.Throwable -> L225
            android.app.AlertDialog r0 = p000.ia0.f4971     // Catch: java.lang.Throwable -> L225
            if (r0 == 0) goto L474
            z90 r1 = new z90     // Catch: java.lang.Throwable -> L225
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L225
            r0.setOnDismissListener(r1)     // Catch: java.lang.Throwable -> L225
        L474:
            android.app.AlertDialog r0 = p000.ia0.f4971     // Catch: java.lang.Throwable -> L225
            if (r0 == 0) goto L47b
            r0.show()     // Catch: java.lang.Throwable -> L225
        L47b:
            android.app.AlertDialog r0 = p000.ia0.f4971     // Catch: java.lang.Throwable -> L225
            if (r0 == 0) goto L4db
            android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Throwable -> L225
            if (r0 == 0) goto L4db
            r1 = 17170445(0x106000d, float:2.461195E-38)
            r0.setBackgroundDrawableResource(r1)     // Catch: java.lang.Throwable -> L225
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.setDimAmount(r1)     // Catch: java.lang.Throwable -> L225
            r12 = 2
            r0.addFlags(r12)     // Catch: java.lang.Throwable -> L225
            android.content.res.Resources r1 = r9.getResources()     // Catch: java.lang.Throwable -> L225
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()     // Catch: java.lang.Throwable -> L225
            int r1 = r1.widthPixels     // Catch: java.lang.Throwable -> L225
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L225
            r2 = 1064514355(0x3f733333, float:0.95)
            float r1 = r1 * r2
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L225
            android.content.res.Resources r2 = r9.getResources()     // Catch: java.lang.Throwable -> L225
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()     // Catch: java.lang.Throwable -> L225
            int r2 = r2.heightPixels     // Catch: java.lang.Throwable -> L225
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L225
            r3 = 1063339950(0x3f6147ae, float:0.88)
            float r2 = r2 * r3
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L225
            r0.setLayout(r1, r2)     // Catch: java.lang.Throwable -> L225
            goto L4db
        L4b8:
            r0 = move-exception
            r9 = r8
        L4ba:
            java.lang.String r1 = "DYHelper"
            java.lang.String r2 = "打开手势配置界面失败"
            p000.C0888ux.m5977(r1, r2, r0)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "打开配置界面失败: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r9, r0, r2)
            r0.show()
        L4db:
            return
        L4dc:
            r2 = r6
            android.app.Activity r0 = r0.f7465
            com.example.dyhelper.hook.γ r1 = com.example.dyhelper.hook.C0157.f2411
            r3 = 0
            com.example.dyhelper.hook.C0157.m1517(r0, r3, r2)
            return
        L4e7:
            android.app.Activity r0 = r0.f7465
            java.lang.Object r1 = com.example.dyhelper.hook.C0157.f2417
            monitor-enter(r1)
            java.util.WeakHashMap r2 = com.example.dyhelper.hook.C0157.f2432     // Catch: java.lang.Throwable -> L505
            r2.remove(r0)     // Catch: java.lang.Throwable -> L505
            java.util.WeakHashMap r2 = com.example.dyhelper.hook.C0157.f2433     // Catch: java.lang.Throwable -> L505
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L505
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L505
            r2.put(r0, r3)     // Catch: java.lang.Throwable -> L505
            monitor-exit(r1)
            com.example.dyhelper.hook.γ r1 = com.example.dyhelper.hook.C0157.f2411
            r1.m1523(r0)
            return
        L505:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L508:
            android.app.Activity r0 = r0.f7465
            q71 r1 = p000.q71.f8896
            p000.q71.m4777(r0, r5)
            return
        L510:
            android.app.Activity r0 = r0.f7465
            com.example.dyhelper.hook.γ r1 = com.example.dyhelper.hook.C0157.f2411
            r1.m1523(r0)
            return
        L518:
            android.app.Activity r1 = r0.f7465
            java.lang.String r2 = "aweme://lynxview/?hide_nav_bar=1&should_full_screen=1&surl=https%3A%2F%2Flf-dy-sourcecdn-tos.bytegecko.com%2Fobj%2Fbyte-gurd-source%2Fies%2Fdouyin%2Fmain_arch%2Ffe_lynx_history%2Ftemplate.js&channel=fe_lynx_history&bundle=template.js&dynamic=1&fallback_url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Ffe_lynx_main_web%2Flong_video_history%2Findex.html%3Fhide_nav_bar%3D1&use_bdx=1&use_gecko_first=1&use_bdx_since=16.9.0&trans_status_bar=1&enable_prefetch=1&enter_from=navigation_panel&landing=video"
            java.lang.String r3 = "FeedGestureHook"
            java.lang.Class r0 = r1.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            if (r0 != 0) goto L52e
            java.lang.ClassLoader r0 = p000.x10.f11976
            if (r0 != 0) goto L52e
            goto L60b
        L52e:
            r4 = r0
            java.lang.String r0 = "~79141EF2FBD496D84F82136FAD77522A06BB551B75C1AEA3D4F42A80C42F5DAB"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r6 = "~79380C0D8C98F945BB08C5D5DB5DF1EAD9B59028068ACB54724259A29B43A5807491FC629BF3D81986847A"
            java.lang.String r6 = p000.jf0.m2957(r6)
            java.lang.String[] r0 = new java.lang.String[]{r0, r6}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r6 = r0.iterator()
        L547:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L60b
            java.lang.Object r0 = r6.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Class r0 = p000.qe0.m4877(r4, r0)     // Catch: java.lang.Throwable -> L558
            goto L559
        L558:
            r0 = r5
        L559:
            if (r0 != 0) goto L55c
            goto L547
        L55c:
            java.lang.reflect.Method[] r0 = r0.getMethods()
            r0.getClass()
            int r7 = r0.length
            r8 = 0
        L565:
            if (r8 >= r7) goto L5a2
            r9 = r0[r8]
            java.lang.String r10 = r9.getName()
            java.lang.String r11 = "buildRoute"
            boolean r10 = p000.ln0.m3626(r10, r11)
            if (r10 == 0) goto L59e
            java.lang.Class[] r10 = r9.getParameterTypes()
            int r10 = r10.length
            r12 = 2
            if (r10 != r12) goto L59f
            java.lang.Class<android.content.Context> r10 = android.content.Context.class
            java.lang.Class[] r11 = r9.getParameterTypes()
            r26 = 0
            r11 = r11[r26]
            boolean r10 = r10.isAssignableFrom(r11)
            if (r10 == 0) goto L59f
            java.lang.Class[] r10 = r9.getParameterTypes()
            r25 = 1
            r10 = r10[r25]
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            boolean r10 = p000.ln0.m3626(r10, r11)
            if (r10 == 0) goto L59f
            goto L5a4
        L59e:
            r12 = 2
        L59f:
            int r8 = r8 + 1
            goto L565
        L5a2:
            r12 = 2
            r9 = r5
        L5a4:
            if (r9 != 0) goto L5a7
            goto L547
        L5a7:
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r2}     // Catch: java.lang.Throwable -> L5da
            java.lang.Object r0 = r9.invoke(r5, r0)     // Catch: java.lang.Throwable -> L5da
            if (r0 != 0) goto L5b2
            goto L547
        L5b2:
            java.lang.Class r7 = r0.getClass()     // Catch: java.lang.Throwable -> L5da
            java.lang.reflect.Method[] r7 = r7.getMethods()     // Catch: java.lang.Throwable -> L5da
            r7.getClass()     // Catch: java.lang.Throwable -> L5da
            int r8 = r7.length     // Catch: java.lang.Throwable -> L5da
            r9 = 0
        L5bf:
            if (r9 >= r8) goto L5df
            r10 = r7[r9]     // Catch: java.lang.Throwable -> L5da
            java.lang.String r11 = r10.getName()     // Catch: java.lang.Throwable -> L5da
            java.lang.String r13 = "open"
            boolean r11 = p000.ln0.m3626(r11, r13)     // Catch: java.lang.Throwable -> L5da
            if (r11 == 0) goto L5dc
            java.lang.Class[] r11 = r10.getParameterTypes()     // Catch: java.lang.Throwable -> L5da
            r11.getClass()     // Catch: java.lang.Throwable -> L5da
            int r11 = r11.length     // Catch: java.lang.Throwable -> L5da
            if (r11 != 0) goto L5dc
            goto L5e0
        L5da:
            r0 = move-exception
            goto L5fb
        L5dc:
            int r9 = r9 + 1
            goto L5bf
        L5df:
            r10 = r5
        L5e0:
            if (r10 != 0) goto L5e4
            goto L547
        L5e4:
            java.lang.Object r0 = r10.invoke(r0, r5)     // Catch: java.lang.Throwable -> L5da
            boolean r7 = r0 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L5da
            if (r7 == 0) goto L5f4
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L5da
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L5da
            if (r0 == 0) goto L547
        L5f4:
            java.lang.String r0 = "通过 SmartRouter 打开观看历史记录"
            r7 = 4
            p000.C0888ux.m5988(r3, r0, r5, r7, r5)     // Catch: java.lang.Throwable -> L5da
            goto L645
        L5fb:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r7 = "SmartRouter 打开观看历史记录失败: "
            java.lang.String r0 = p000.lz1.m3687(r7, r0)
            r7 = 4
            p000.C0888ux.m5988(r3, r0, r5, r7, r5)
            goto L547
        L60b:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L62c
            java.lang.String r4 = "android.intent.action.VIEW"
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L62c
            r0.<init>(r4, r2)     // Catch: java.lang.Throwable -> L62c
            java.lang.String r2 = r1.getPackageName()     // Catch: java.lang.Throwable -> L62c
            r0.setPackage(r2)     // Catch: java.lang.Throwable -> L62c
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            r0.addFlags(r2)     // Catch: java.lang.Throwable -> L62c
            r1.startActivity(r0)     // Catch: java.lang.Throwable -> L62c
            java.lang.String r0 = "通过 Intent 尝试打开观看历史记录"
            r7 = 4
            p000.C0888ux.m5988(r3, r0, r5, r7, r5)     // Catch: java.lang.Throwable -> L62c
            goto L645
        L62c:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = "打开观看历史记录失败: "
            java.lang.String r0 = p000.lz1.m3687(r2, r0)
            r7 = 4
            p000.C0888ux.m5988(r3, r0, r5, r7, r5)
            java.lang.String r0 = "打开观看历史记录失败"
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r2)
            r0.show()
        L645:
            return
        L646:
            android.app.Activity r1 = r0.f7465
            java.lang.String r2 = "FeedGestureHook"
            n81 r3 = p000.n81.f7456
            java.lang.String r4 = "homepage_hot"
            java.util.concurrent.atomic.AtomicReference r0 = p000.b10.f1403     // Catch: java.lang.Throwable -> L65d
            pq r0 = p000.C0696pq.f8651     // Catch: java.lang.Throwable -> L65d
            kq r0 = p000.C0696pq.m4567()     // Catch: java.lang.Throwable -> L65d
            if (r0 == 0) goto L65b
            java.lang.Object r0 = r0.f6077     // Catch: java.lang.Throwable -> L65d
            goto L675
        L65b:
            r0 = r5
            goto L675
        L65d:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L688
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L688
            java.lang.String r7 = "获取 Aweme 对象失败: "
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L688
            r6.append(r0)     // Catch: java.lang.Throwable -> L688
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L688
            r7 = 4
            p000.C0888ux.m5988(r2, r0, r5, r7, r5)     // Catch: java.lang.Throwable -> L688
            goto L65b
        L675:
            if (r0 == 0) goto L68a
            boolean r0 = p000.p81.m4398(r1, r0, r4, r3)     // Catch: java.lang.Throwable -> L688
            if (r0 != 0) goto L6ad
            java.lang.String r0 = "不感兴趣操作失败"
            r3 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r3)     // Catch: java.lang.Throwable -> L688
            r0.show()     // Catch: java.lang.Throwable -> L688
            goto L6ad
        L688:
            r0 = move-exception
            goto L695
        L68a:
            java.lang.String r0 = "未找到当前视频信息"
            r3 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r3)     // Catch: java.lang.Throwable -> L688
            r0.show()     // Catch: java.lang.Throwable -> L688
            goto L6ad
        L695:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r3 = "不感兴趣动作异常: "
            java.lang.String r0 = p000.lz1.m3687(r3, r0)
            r7 = 4
            p000.C0888ux.m5988(r2, r0, r5, r7, r5)
            java.lang.String r0 = "不感兴趣操作异常"
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r2)
            r0.show()
        L6ad:
            return
        L6ae:
            android.app.Activity r0 = r0.f7465
            q71 r1 = p000.q71.f8896
            n9 r1 = new n9
            r2 = 23
            r1.<init>(r0, r2)
            r0.runOnUiThread(r1)
            return
        L6bd:
            android.app.Activity r1 = r0.f7465
            java.lang.String r2 = "打开发布页失败"
            dk1 r0 = p000.dk1.f3201     // Catch: java.lang.Throwable -> L6d2
            boolean r0 = p000.dk1.m1769(r1)     // Catch: java.lang.Throwable -> L6d2
            if (r0 != 0) goto L6eb
            r3 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r2, r3)     // Catch: java.lang.Throwable -> L6d2
            r0.show()     // Catch: java.lang.Throwable -> L6d2
            goto L6eb
        L6d2:
            r0 = move-exception
            java.lang.String r3 = "FeedGestureHook"
            java.lang.String r0 = r0.getMessage()
            java.lang.String r4 = "打开发布页异常: "
            java.lang.String r0 = p000.lz1.m3687(r4, r0)
            r7 = 4
            p000.C0888ux.m5988(r3, r0, r5, r7, r5)
            r3 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r2, r3)
            r0.show()
        L6eb:
            return
        L6ec:
            android.app.Activity r1 = r0.f7465
            ry1 r0 = p000.ry1.f9602     // Catch: java.lang.Throwable -> L6fd
            java.lang.String r0 = r0.m5303(r1)     // Catch: java.lang.Throwable -> L6fd
            r2 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r2)     // Catch: java.lang.Throwable -> L6fd
            r0.show()     // Catch: java.lang.Throwable -> L6fd
            goto L718
        L6fd:
            r0 = move-exception
            java.lang.String r2 = "FeedGestureHook"
            java.lang.String r0 = r0.getMessage()
            java.lang.String r3 = "续火花失败: "
            java.lang.String r0 = p000.lz1.m3687(r3, r0)
            r7 = 4
            p000.C0888ux.m5988(r2, r0, r5, r7, r5)
            java.lang.String r0 = "续火花失败"
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r2)
            r0.show()
        L718:
            return
        L719:
            android.app.Activity r1 = r0.f7465
            boolean r0 = r1.isFinishing()     // Catch: java.lang.Throwable -> L757
            if (r0 != 0) goto L779
            boolean r0 = r1.isDestroyed()     // Catch: java.lang.Throwable -> L757
            if (r0 == 0) goto L728
            goto L779
        L728:
            x10 r0 = p000.x10.f11972     // Catch: java.lang.Throwable -> L757
            p000.x10.m6492(r1)     // Catch: java.lang.Throwable -> L757
            v10 r0 = p000.x10.m6496(r1)     // Catch: java.lang.Throwable -> L757
            p000.x10.m6491(r0)     // Catch: java.lang.Throwable -> L757
            ja0 r0 = new ja0     // Catch: java.lang.Throwable -> L757
            r2 = 0
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L757
            android.os.Looper r2 = android.os.Looper.myLooper()     // Catch: java.lang.Throwable -> L757
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L757
            boolean r2 = p000.ln0.m3626(r2, r3)     // Catch: java.lang.Throwable -> L757
            if (r2 == 0) goto L74c
            r0.invoke()     // Catch: java.lang.Throwable -> L757
            goto L779
        L74c:
            ν r2 = new ν     // Catch: java.lang.Throwable -> L757
            r3 = 17
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L757
            r1.runOnUiThread(r2)     // Catch: java.lang.Throwable -> L757
            goto L779
        L757:
            r0 = move-exception
            java.lang.String r2 = "FeedGestureHook"
            java.lang.String r3 = r0.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "显示手势位置预览失败: "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            p000.C0888ux.m5987(r2, r3, r0)
            java.lang.String r0 = "显示预览失败"
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r2)
            r0.show()
        L779:
            return
        L77a:
            android.app.Activity r1 = r0.f7465
            p000.pd2.m4476(r1)     // Catch: java.lang.Throwable -> L780
            goto L7b2
        L780:
            r0 = move-exception
            java.lang.String r2 = "DYHelper"
            java.lang.String r3 = r0.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "骰子弹窗异常: "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            p000.C0888ux.m5977(r2, r3, r0)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "骰子功能异常: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r2)
            r0.show()
        L7b2:
            return
        L7b3:
            android.app.Activity r0 = r0.f7465
            p000.pd2.m4473(r0)
            return
        L7b9:
            android.app.Activity r0 = r0.f7465
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.m1379(r0)
            return
        L7bf:
            android.app.Activity r0 = r0.f7465
            android.os.Handler r1 = p000.C0753r9.f9291
            p000.C0753r9.m5073(r0)
            return
        L7c7:
            android.app.Activity r0 = r0.f7465
            android.os.Handler r1 = p000.C0753r9.f9291
            p000.C0753r9.m5073(r0)
            return
    }
}
