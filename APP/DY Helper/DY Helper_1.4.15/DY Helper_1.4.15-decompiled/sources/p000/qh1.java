package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qh1 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9011;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f9012;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f9013;

    public /* synthetic */ qh1(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f9011 = r2
            r0.f9012 = r1
            r0.f9013 = r3
            r0.<init>()
            return
    }

    public /* synthetic */ qh1(p000.ry1 r1, java.util.List r2, java.lang.ClassLoader r3) {
            r0 = this;
            r1 = 7
            r0.f9011 = r1
            r0.<init>()
            r0.f9012 = r2
            r0.f9013 = r3
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r14) {
            r13 = this;
            int r0 = r13.f9011
            switch(r0) {
                case 0: goto L31f;
                case 1: goto L27a;
                case 2: goto L257;
                case 3: goto L244;
                case 4: goto L211;
                case 5: goto L1ef;
                case 6: goto L194;
                case 7: goto L12f;
                case 8: goto L118;
                case 9: goto L31;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r13.f9012
            cw1 r0 = (p000.cw1) r0
            java.lang.Object r13 = r13.f9013
            m62 r13 = (p000.m62) r13
            n62 r14 = (p000.n62) r14
            java.lang.Object r1 = r0.f2789
            zz1 r1 = (p000.zz1) r1
            monitor-enter(r1)
            boolean r2 = r14.f7444     // Catch: java.lang.Throwable -> L23
            java.lang.Object r0 = r0.f2790
            kw0 r0 = (p000.kw0) r0
            if (r2 == 0) goto L25
            java.lang.Object r13 = r0.m3422(r13, r14)     // Catch: java.lang.Throwable -> L23
            n62 r13 = (p000.n62) r13     // Catch: java.lang.Throwable -> L23
            goto L2b
        L23:
            r13 = move-exception
            goto L2f
        L25:
            java.lang.Object r13 = r0.m3423(r13)     // Catch: java.lang.Throwable -> L23
            n62 r13 = (p000.n62) r13     // Catch: java.lang.Throwable -> L23
        L2b:
            monitor-exit(r1)
            s62 r13 = p000.s62.f9751
            return r13
        L2f:
            monitor-exit(r1)
            throw r13
        L31:
            java.lang.Object r0 = r13.f9012
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r13 = r13.f9013
            ky1 r13 = (p000.ky1) r13
            my1 r14 = (p000.my1) r14
            r14.getClass()
            ry1 r1 = p000.ry1.f9602
            java.lang.String r2 = "天)"
            java.lang.String r3 = " ("
            java.lang.String r4 = "spark:test_renew"
            java.lang.String r5 = "天"
            java.lang.String r6 = " "
            java.lang.String r7 = " UID="
            android.content.Context r8 = p000.ry1.f9623
            if (r8 != 0) goto L58
            if (r0 == 0) goto L58
            android.content.Context r8 = r0.getApplicationContext()
            p000.ry1.f9623 = r8
        L58:
            if (r0 == 0) goto L6a
            boolean r8 = p000.ui1.m5867()
            if (r8 != 0) goto L6a
            android.content.Context r8 = r0.getApplicationContext()
            r8.getClass()
            p000.ui1.m5896(r8)
        L6a:
            java.lang.ClassLoader r8 = p000.ry1.f9622
            if (r8 != 0) goto L7a
            if (r0 == 0) goto L79
            java.lang.Class r8 = r0.getClass()
            java.lang.ClassLoader r8 = r8.getClassLoader()
            goto L7a
        L79:
            r8 = 0
        L7a:
            if (r8 == 0) goto L80
            r9 = 1
            r1.m5297(r8, r9)
        L80:
            boolean r8 = p000.ry1.m5270()
            if (r8 != 0) goto L8a
            java.lang.String r13 = "发送功能尚未就绪\n请稍等片刻或随便点开一个私信窗口再试"
            goto L117
        L8a:
            jy1 r8 = p000.ry1.m5235()
            java.lang.String r9 = p000.ry1.m5197(r13)
            if (r0 == 0) goto L9d
            java.lang.String r10 = "测试续火"
            java.lang.String r11 = "1/1"
            r12 = 100
            p000.ry1.m5290(r12, r0, r4, r10, r11)
        L9d:
            java.lang.String r14 = p000.ry1.m5245(r13, r8, r14)
            boolean r14 = r1.m5308(r13, r14)
            p000.ry1.m5194()
            long r10 = r13.f6324
            int r1 = r13.f6326
            if (r14 == 0) goto Le3
            java.lang.String r14 = "[测试] 已提交 "
            java.lang.StringBuilder r14 = p000.AbstractC0602nx.m4137(r14, r9, r10, r7)
            r14.append(r6)
            r14.append(r1)
            r14.append(r5)
            java.lang.String r14 = r14.toString()
            p000.ry1.m5276(r14)
            java.lang.String r14 = "测试续火完成"
            p000.ry1.m5220(r0, r4, r14, r9)
            int r13 = r13.f6326
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "测试续火消息已提交: "
            r14.<init>(r0)
            r14.append(r9)
            r14.append(r3)
            r14.append(r13)
            r14.append(r2)
            java.lang.String r13 = r14.toString()
            goto L117
        Le3:
            java.lang.String r14 = "[测试] 发送失败 "
            java.lang.StringBuilder r14 = p000.AbstractC0602nx.m4137(r14, r9, r10, r7)
            r14.append(r6)
            r14.append(r1)
            r14.append(r5)
            java.lang.String r14 = r14.toString()
            p000.ry1.m5276(r14)
            java.lang.String r14 = "测试续火失败"
            p000.ry1.m5186(r0, r4, r14, r9)
            int r13 = r13.f6326
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "测试续火消息发送失败: "
            r14.<init>(r0)
            r14.append(r9)
            r14.append(r3)
            r14.append(r13)
            r14.append(r2)
            java.lang.String r13 = r14.toString()
        L117:
            return r13
        L118:
            java.lang.Object r0 = r13.f9012
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.lang.Object r13 = r13.f9013
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r14 = r0.optString(r14)
            boolean r13 = p000.ln0.m3626(r14, r13)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            return r13
        L12f:
            java.lang.Object r0 = r13.f9012
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r13 = r13.f9013
            java.lang.ClassLoader r13 = (java.lang.ClassLoader) r13
            org.luckypray.dexkit.DexKitBridge r14 = (org.luckypray.dexkit.DexKitBridge) r14
            r14.getClass()
            ay1 r1 = new ay1     // Catch: java.lang.Throwable -> L166
            r2 = 18
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L166
            org.luckypray.dexkit.result.MethodDataList r14 = r14.findMethod(r1)     // Catch: java.lang.Throwable -> L166
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L166
            r1.<init>()     // Catch: java.lang.Throwable -> L166
            java.util.Iterator r14 = r14.iterator()     // Catch: java.lang.Throwable -> L166
        L150:
            boolean r2 = r14.hasNext()     // Catch: java.lang.Throwable -> L166
            if (r2 == 0) goto L16c
            java.lang.Object r2 = r14.next()     // Catch: java.lang.Throwable -> L166
            org.luckypray.dexkit.result.MethodData r2 = (org.luckypray.dexkit.result.MethodData) r2     // Catch: java.lang.Throwable -> L166
            java.lang.reflect.Method r2 = r2.getMethodInstance(r13)     // Catch: java.lang.Throwable -> L166
            if (r2 == 0) goto L150
            r1.add(r2)     // Catch: java.lang.Throwable -> L166
            goto L150
        L166:
            r13 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r13)
        L16c:
            java.lang.Throwable r13 = p000.fo1.m2190(r1)
            if (r13 != 0) goto L173
            goto L175
        L173:
            jz r1 = p000.C0450jz.f5672
        L175:
            java.util.List r1 = (java.util.List) r1
            boolean r13 = r1.isEmpty()
            if (r13 != 0) goto L17e
            r0 = r1
        L17e:
            java.util.Iterator r13 = r0.iterator()
        L182:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L193
            java.lang.Object r14 = r13.next()
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            r1 = 1
            r14.setAccessible(r1)
            goto L182
        L193:
            return r0
        L194:
            java.lang.Object r0 = r13.f9012
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r13 = r13.f9013
            android.widget.Switch r13 = (android.widget.Switch) r13
            a80 r14 = (p000.a80) r14
            r14.getClass()
            ic r1 = new ic
            r2 = 8
            r1.<init>(r14, r2, r13)
            java.lang.String r13 = "pet_elf_task_image_uri"
            java.lang.String r14 = ""
            java.lang.String r13 = p000.ui1.m5893(r13, r14)
            boolean r13 = p000.q02.m4671(r13)
            r14 = r13 ^ 1
            r2 = 0
            r3 = 1
            if (r13 != 0) goto L1c6
            r13 = 2
            java.lang.String[] r13 = new java.lang.String[r13]
            java.lang.String r4 = "重新选择图片"
            r13[r2] = r4
            java.lang.String r2 = "清除图片"
            r13[r3] = r2
            goto L1cc
        L1c6:
            java.lang.String[] r13 = new java.lang.String[r3]
            java.lang.String r3 = "选择图片"
            r13[r2] = r3
        L1cc:
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r2.<init>(r0)
            java.lang.String r3 = "自动任务图片"
            android.app.AlertDialog$Builder r2 = r2.setTitle(r3)
            java.lang.CharSequence[] r13 = (java.lang.CharSequence[]) r13
            vt1 r3 = new vt1
            r3.<init>(r14, r1, r0)
            android.app.AlertDialog$Builder r13 = r2.setItems(r13, r3)
            java.lang.String r14 = "取消"
            r0 = 0
            android.app.AlertDialog$Builder r13 = r13.setNegativeButton(r14, r0)
            r13.show()
            s62 r13 = p000.s62.f9751
            return r13
        L1ef:
            java.lang.Object r0 = r13.f9012
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r13 = r13.f9013
            xj0 r13 = (p000.xj0) r13
            java.lang.String r14 = (java.lang.String) r14
            r1 = 0
            if (r14 != 0) goto L206
            java.lang.String r2 = "未选择 MP3 文件"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r1)
            r0.show()
            goto L20b
        L206:
            java.lang.String r2 = "已选择: "
            p000.a12.m21(r1, r0, r2, r14)
        L20b:
            r13.invoke(r14)
            s62 r13 = p000.s62.f9751
            return r13
        L211:
            java.lang.Object r0 = r13.f9012
            kl1 r0 = (p000.kl1) r0
            java.lang.Object r13 = r13.f9013
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            java.lang.Throwable r14 = (java.lang.Throwable) r14
            java.lang.Object r1 = r0.f6003
            monitor-enter(r1)
            r2 = 0
            if (r13 == 0) goto L231
            if (r14 == 0) goto L232
            boolean r3 = r14 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L22f
            if (r3 != 0) goto L228
            goto L229
        L228:
            r14 = r2
        L229:
            if (r14 == 0) goto L232
            p000.ln0.m3624(r13, r14)     // Catch: java.lang.Throwable -> L22f
            goto L232
        L22f:
            r13 = move-exception
            goto L242
        L231:
            r13 = r2
        L232:
            r0.f6005 = r13     // Catch: java.lang.Throwable -> L22f
            f02 r13 = r0.f6021     // Catch: java.lang.Throwable -> L22f
            fl1 r14 = p000.fl1.f4005     // Catch: java.lang.Throwable -> L22f
            r13.getClass()     // Catch: java.lang.Throwable -> L22f
            r13.m1988(r2, r14)     // Catch: java.lang.Throwable -> L22f
            monitor-exit(r1)
            s62 r13 = p000.s62.f9751
            return r13
        L242:
            monitor-exit(r1)
            throw r13
        L244:
            java.lang.Object r0 = r13.f9012
            zn r0 = (p000.C1064zn) r0
            java.lang.Object r13 = r13.f9013
            c21 r13 = (p000.c21) r13
            r0.m7180(r14)
            if (r13 == 0) goto L254
            r13.m1107(r14)
        L254:
            s62 r13 = p000.s62.f9751
            return r13
        L257:
            java.lang.Object r0 = r13.f9012
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r13 = r13.f9013
            android.widget.TextView r13 = (android.widget.TextView) r13
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            r14.getClass()
            if (r14 == r0) goto L274
            boolean r0 = p000.uj1.m5907(r14, r0)
            if (r0 == 0) goto L274
            boolean r13 = p000.uj1.m5907(r13, r14)
            if (r13 == 0) goto L274
            r13 = 1
            goto L275
        L274:
            r13 = 0
        L275:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            return r13
        L27a:
            java.lang.Object r0 = r13.f9012
            ki1 r0 = (p000.ki1) r0
            java.lang.Object r13 = r13.f9013
            java.lang.ClassLoader r13 = (java.lang.ClassLoader) r13
            org.luckypray.dexkit.DexKitBridge r14 = (org.luckypray.dexkit.DexKitBridge) r14
            r14.getClass()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.List r2 = p000.ki1.f5940
            java.util.Iterator r2 = r2.iterator()
        L292:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2a8
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            z61 r4 = new z61
            r5 = 1
            r4.<init>(r14, r5, r3)
            p000.ki1.m3271(r13, r1, r4)
            goto L292
        L2a8:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L2c5
            java.util.Collection r2 = r1.values()
            r2.getClass()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = p000.AbstractC0984xh.m6666(r2)
            java.util.List r2 = r0.m3281(r2)
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L2cf
        L2c5:
            η r2 = new η
            r3 = 13
            r2.<init>(r3, r14)
            p000.ki1.m3271(r13, r1, r2)
        L2cf:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L2ec
            java.util.Collection r2 = r1.values()
            r2.getClass()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = p000.AbstractC0984xh.m6666(r2)
            java.util.List r2 = r0.m3281(r2)
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L30d
        L2ec:
            java.util.List r2 = p000.ki1.f5938
            r3 = 1
            java.util.List r2 = p000.AbstractC0984xh.m6634(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L2f7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L30d
            java.lang.Object r3 = r2.next()
            java.util.List r3 = (java.util.List) r3
            z61 r4 = new z61
            r5 = 2
            r4.<init>(r14, r5, r3)
            p000.ki1.m3271(r13, r1, r4)
            goto L2f7
        L30d:
            java.util.Collection r13 = r1.values()
            r13.getClass()
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.List r13 = p000.AbstractC0984xh.m6666(r13)
            java.util.List r13 = r0.m3281(r13)
            return r13
        L31f:
            java.lang.Object r0 = r13.f9012
            qm1 r0 = (p000.qm1) r0
            java.lang.Object r13 = r13.f9013
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            android.view.View r14 = (android.view.View) r14
            java.lang.String r1 = "comment"
            r14.getClass()
            boolean r2 = r0.f9050
            if (r2 == 0) goto L334
            goto L3e4
        L334:
            boolean r2 = r14.isShown()
            if (r2 != 0) goto L33c
            goto L3e4
        L33c:
            java.lang.Class r2 = r14.getClass()
            java.lang.String r2 = r2.getName()
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r3)
            r2.getClass()
            boolean r3 = r14 instanceof android.widget.EditText
            r4 = 1
            if (r3 != 0) goto L353
            goto L3b8
        L353:
            r3 = r14
        L354:
            if (r3 == 0) goto L374
            java.lang.Class r5 = r3.getClass()
            java.lang.String r5 = r5.getName()
            boolean r5 = p000.q02.m4654(r5, r1, r4)
            if (r5 == 0) goto L365
            goto L3b5
        L365:
            if (r3 == r13) goto L374
            android.view.ViewParent r3 = r3.getParent()
            boolean r5 = r3 instanceof android.view.View
            if (r5 == 0) goto L372
            android.view.View r3 = (android.view.View) r3
            goto L354
        L372:
            r3 = 0
            goto L354
        L374:
            r3 = r14
            android.widget.EditText r3 = (android.widget.EditText) r3
            int r5 = r3.getWidth()
            float r5 = (float) r5
            int r6 = r13.getWidth()
            float r6 = (float) r6
            r7 = 1055286886(0x3ee66666, float:0.45)
            float r6 = r6 * r7
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L38a
            goto L3b8
        L38a:
            r5 = 2
            int[] r6 = new int[r5]
            int[] r7 = new int[r5]
            r13.getLocationOnScreen(r6)
            r14.getLocationOnScreen(r7)
            r7 = r7[r4]
            int r3 = r3.getHeight()
            int r3 = r3 / r5
            int r3 = r3 + r7
            r5 = r6[r4]
            int r7 = r13.getHeight()
            float r7 = (float) r7
            r8 = 1057803469(0x3f0ccccd, float:0.55)
            float r7 = r7 * r8
            int r7 = (int) r7
            int r5 = r5 + r7
            r6 = r6[r4]
            int r7 = r13.getHeight()
            int r7 = r7 + r6
            if (r5 > r3) goto L3b8
            if (r3 > r7) goto L3b8
        L3b5:
            r0.f9050 = r4
            goto L3e4
        L3b8:
            r3 = 0
            boolean r1 = p000.q02.m4654(r2, r1, r3)
            if (r1 == 0) goto L3e4
            int r1 = r14.getHeight()
            float r1 = (float) r1
            int r2 = r13.getHeight()
            float r2 = (float) r2
            r3 = 1048576000(0x3e800000, float:0.25)
            float r2 = r2 * r3
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L3e4
            int r14 = r14.getWidth()
            float r14 = (float) r14
            int r13 = r13.getWidth()
            float r13 = (float) r13
            r1 = 1058642330(0x3f19999a, float:0.6)
            float r13 = r13 * r1
            int r13 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r13 <= 0) goto L3e4
            r0.f9050 = r4
        L3e4:
            s62 r13 = p000.s62.f9751
            return r13
    }
}
