package p000;

/* JADX INFO: renamed from: z7 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1048z7 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f12993;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f12994;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f12995;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f12996;

    public /* synthetic */ C1048z7(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f12993 = r4
            r0.f12994 = r1
            r0.f12995 = r2
            r0.f12996 = r3
            r0.<init>()
            return
    }

    public /* synthetic */ C1048z7(p000.v80 r1, p000.C0466ke r2, p000.nw1 r3, p000.f11 r4) {
            r0 = this;
            r4 = 6
            r0.f12993 = r4
            r0.<init>()
            r0.f12994 = r1
            r0.f12995 = r2
            r0.f12996 = r3
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r14 = this;
            int r0 = r14.f12993
            java.lang.String r1 = ""
            r2 = 4
            r3 = 255(0xff, float:3.57E-43)
            r4 = 1
            r5 = 0
            r6 = 0
            s62 r7 = p000.s62.f9751
            java.lang.Object r8 = r14.f12996
            java.lang.Object r9 = r14.f12995
            java.lang.Object r14 = r14.f12994
            switch(r0) {
                case 0: goto L42a;
                case 1: goto L3fe;
                case 2: goto L2d9;
                case 3: goto L29b;
                case 4: goto L283;
                case 5: goto L26f;
                case 6: goto L241;
                case 7: goto L1ec;
                case 8: goto L1b2;
                case 9: goto L19c;
                case 10: goto L144;
                case 11: goto L125;
                case 12: goto Lba;
                case 13: goto La3;
                case 14: goto L47;
                default: goto L15;
            }
        L15:
            ly1 r14 = (p000.ly1) r14
            android.app.Activity r9 = (android.app.Activity) r9
            ty1 r8 = (p000.ty1) r8
            ry1 r0 = p000.ry1.f9602
            java.lang.String r0 = r14.f6842
            java.lang.String r14 = r14.f6843
            my1 r1 = new my1
            r1.<init>(r3, r6, r6)
            rd r2 = new rd
            r2.<init>()
            java.lang.String r3 = "follow"
            p000.ry1.m5248(r0, r14, r1, r3, r2)
            p000.xa1.m6548()
            boolean r14 = p000.dd1.m1714()
            p000.dd1.m1716(r9, r14)
            java.lang.String r14 = "已清除分组规则"
            android.widget.Toast r14 = android.widget.Toast.makeText(r9, r14, r5)
            r14.show()
            r8.invoke()
            return r7
        L47:
            ky1 r14 = (p000.ky1) r14
            android.app.Activity r9 = (android.app.Activity) r9
            cu1 r8 = (p000.cu1) r8
            ry1 r0 = p000.ry1.f9602
            my1 r0 = new my1
            r0.<init>(r3, r6, r6)
            p000.ry1.m5249(r14, r0)
            p000.xa1.m6548()
            long r0 = r14.f6323
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L67
            goto L68
        L67:
            r2 = r6
        L68:
            if (r2 == 0) goto L93
            long r0 = r2.longValue()
            java.util.Map r2 = p000.v81.m6126()
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            java.lang.Object r2 = r2.get(r3)
            sd r2 = (p000.C0794sd) r2
            if (r2 != 0) goto L83
            sd r2 = new sd
            r2.<init>(r0)
        L83:
            ip1 r0 = p000.ip1.f5162
            sd r0 = p000.C0794sd.m5468(r2, r0, r0, r0)
            p000.v81.m6133(r0)
            boolean r0 = p000.dd1.m1714()
            p000.dd1.m1716(r9, r0)
        L93:
            p000.ry1.m5247(r14, r6)
            java.lang.String r14 = "已改为跟随分组/全局消息、火星、投喂与营地规则"
            android.widget.Toast r14 = android.widget.Toast.makeText(r9, r14, r5)
            r14.show()
            r8.invoke()
            return r7
        La3:
            android.app.Activity r14 = (android.app.Activity) r14
            xg1 r9 = (p000.xg1) r9
            android.net.Uri r8 = (android.net.Uri) r8
            ky1 r0 = r9.f12169
            eg1 r0 = p000.g81.m2285(r14, r0, r8)
            ii0 r1 = new ii0
            r2 = 17
            r1.<init>(r14, r2, r0)
            r14.runOnUiThread(r1)
            return r7
        Lba:
            android.app.Activity r14 = (android.app.Activity) r14
            yg1 r9 = (p000.yg1) r9
            android.widget.EditText r8 = (android.widget.EditText) r8
            android.text.Editable r0 = r8.getText()
            if (r0 == 0) goto Lcb
            java.lang.String r0 = r0.toString()
            goto Lcc
        Lcb:
            r0 = r6
        Lcc:
            if (r0 != 0) goto Ld0
            r11 = r1
            goto Ld1
        Ld0:
            r11 = r0
        Ld1:
            r14.getClass()
            r9.getClass()
            boolean r0 = p000.AbstractC0976x9.m6529()
            java.lang.String r1 = "rc62a71041a7416a5"
            if (r0 != 0) goto Le3
            java.lang.String r0 = "火星发送测试仅限内测用户使用"
            r9 = r14
            goto L10e
        Le3:
            java.lang.String r0 = r9.f12612
            int r3 = r9.f12613
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "开始文本测试 name="
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = " count="
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            p000.C0888ux.m5988(r1, r0, r6, r2, r6)
            ry1 r8 = p000.ry1.f9602
            ky1 r10 = r9.f12611
            int r12 = r9.f12613
            r13 = 0
            r9 = r14
            oy1 r14 = r8.m5309(r9, r10, r11, r12, r13)
            java.lang.String r0 = r14.f8348
        L10e:
            r14 = 32
            r3 = 10
            java.lang.String r14 = r0.replace(r3, r14)
            r14.getClass()
            p000.C0888ux.m5988(r1, r14, r6, r2, r6)
            xx0 r14 = new xx0
            r14.<init>(r9, r0, r3)
            r9.runOnUiThread(r14)
            return r7
        L125:
            android.app.Activity r14 = (android.app.Activity) r14
            android.view.View r9 = (android.view.View) r9
            ec1 r8 = (p000.ec1) r8
            java.lang.String r0 = r8.f3484
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "已保存 "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " 的人员规则"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            p000.xn0.m6752(r14, r9, r0)
            return r7
        L144:
            q80 r14 = (p000.q80) r14
            rw1 r9 = (p000.rw1) r9
            r71 r8 = (p000.r71) r8
            if (r14 == 0) goto L156
            int r14 = r9.m5153(r14)
            int r0 = r9.f9557
            int r14 = r14 - r0
            r9.m5151(r14)
        L156:
            int r14 = r9.f9557
            java.util.List r14 = p000.ln0.m3628(r9, r6, r14, r6)
            java.lang.Object r0 = p000.AbstractC0984xh.m6646(r14)
            jn r0 = (p000.C0437jn) r0
            if (r0 == 0) goto L167
            java.lang.Integer r0 = r0.f5527
            goto L168
        L167:
            r0 = r6
        L168:
            java.util.List r1 = r8.mo3981(r0)
            if (r0 == 0) goto L18e
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L175
            goto L18e
        L175:
            java.lang.Object r2 = p000.AbstractC0984xh.m6638(r1)
            jn r2 = (p000.C0437jn) r2
            java.util.List r1 = p000.AbstractC0984xh.m6634(r1, r4)
            int r2 = r2.f5526
            jn r3 = new jn
            r3.<init>(r2, r6, r0)
            java.util.List r0 = p000.AbstractC1021yh.m6896(r3)
            java.util.ArrayList r1 = p000.AbstractC0984xh.m6651(r0, r1)
        L18e:
            hn r0 = new hn
            java.util.ArrayList r14 = p000.AbstractC0984xh.m6651(r14, r1)
            boolean r1 = r8.mo3982()
            r0.<init>(r14, r1)
            return r0
        L19c:
            mv1 r14 = (p000.mv1) r14
            android.app.Dialog r9 = (android.app.Dialog) r9
            android.app.Activity r8 = (android.app.Activity) r8
            p70 r14 = r14.f7295
            r9.dismiss()     // Catch: java.lang.Throwable -> L1a7
        L1a7:
            android.os.Handler r0 = p000.in0.f5135
            fn0 r1 = new fn0
            r1.<init>(r5, r14, r8)
            r0.post(r1)
            return r7
        L1b2:
            nd0 r14 = (p000.nd0) r14
            r14.f7530 = r5
            boolean r0 = r9 instanceof p000.eo1
            if (r0 == 0) goto L1bc
            r0 = r6
            goto L1bd
        L1bc:
            r0 = r9
        L1bd:
            lj0 r0 = (p000.lj0) r0
            if (r0 == 0) goto L1c4
            java.lang.String r0 = r0.f6690
            goto L1c5
        L1c4:
            r0 = r6
        L1c5:
            if (r0 != 0) goto L1c8
            r0 = r1
        L1c8:
            boolean r2 = p000.q02.m4671(r0)
            if (r2 == 0) goto L1e3
            java.lang.Throwable r0 = p000.fo1.m2190(r9)
            if (r0 != 0) goto L1d8
            java.lang.Throwable r0 = p000.fo1.m2190(r8)
        L1d8:
            if (r0 == 0) goto L1de
            java.lang.String r6 = p000.nd0.m4025(r0)
        L1de:
            if (r6 != 0) goto L1e1
            goto L1e2
        L1e1:
            r1 = r6
        L1e2:
            r0 = r1
        L1e3:
            r14.f7531 = r0
            r14.m4030()
            r14.m4031()
            return r7
        L1ec:
            dc0 r14 = (p000.dc0) r14
            um1 r9 = (p000.um1) r9
            java.util.Map r8 = (java.util.Map) r8
            r14.f3071 = r5
            java.lang.Object r0 = r9.f10912
            if (r0 == 0) goto L23b
            sb0 r0 = (p000.sb0) r0
            java.util.List r1 = r0.f9811
            r14.f3069 = r1
            java.util.List r1 = r0.f9810
            int r1 = r1.size()
            r14.f3070 = r1
            java.lang.String r0 = r0.f9813
            r14.f3074 = r0
            java.util.LinkedHashMap r0 = r14.f3067
            java.util.Set r1 = r0.keySet()
            java.util.List r2 = r14.f3069
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L21b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L231
            java.lang.Object r4 = r2.next()
            ic0 r4 = (p000.ic0) r4
            long r4 = r4.f4994
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.add(r4)
            goto L21b
        L231:
            r1.retainAll(r3)
            r0.putAll(r8)
            r14.m1695()
            return r7
        L23b:
            java.lang.String r14 = "result"
            p000.ln0.m3650(r14)
            throw r6
        L241:
            v80 r14 = (p000.v80) r14
            ke r9 = (p000.C0466ke) r9
            nw1 r8 = (p000.nw1) r8
            rn r1 = r14.f11148
            ke r2 = r1.f9406
            r1.f9406 = r9     // Catch: java.lang.Throwable -> L26a
            nw1 r3 = r14.f11142     // Catch: java.lang.Throwable -> L26a
            int[] r4 = r14.f11171     // Catch: java.lang.Throwable -> L26a
            n11 r7 = r14.f11178     // Catch: java.lang.Throwable -> L26a
            r14.f11171 = r6     // Catch: java.lang.Throwable -> L26a
            r14.f11178 = r6     // Catch: java.lang.Throwable -> L26a
            r14.f11142 = r8     // Catch: java.lang.Throwable -> L262
            boolean r8 = r1.f9409     // Catch: java.lang.Throwable -> L262
            r1.f9409 = r5     // Catch: java.lang.Throwable -> L25e
            throw r6     // Catch: java.lang.Throwable -> L25e
        L25e:
            r0 = move-exception
            r1.f9409 = r8     // Catch: java.lang.Throwable -> L262
            throw r0     // Catch: java.lang.Throwable -> L262
        L262:
            r0 = move-exception
            r14.f11142 = r3     // Catch: java.lang.Throwable -> L26a
            r14.f11171 = r4     // Catch: java.lang.Throwable -> L26a
            r14.f11178 = r7     // Catch: java.lang.Throwable -> L26a
            throw r0     // Catch: java.lang.Throwable -> L26a
        L26a:
            r0 = move-exception
            r14 = r0
            r1.f9406 = r2
            throw r14
        L26f:
            q10 r14 = (p000.q10) r14
            android.view.View r9 = (android.view.View) r9
            android.view.View$OnClickListener r8 = (android.view.View.OnClickListener) r8
            p000.q10.m4696(r14, r9, r8)
            e9 r0 = new e9
            r1 = 11
            r0.<init>(r14, r9, r8, r1)
            r9.post(r0)
            return r7
        L283:
            je r14 = (p000.C0428je) r14
            qc0 r9 = (p000.qc0) r9
            p r8 = (p000.C0669p) r8
            bd r14 = r14.f5437
            r14.getClass()
            java.util.List r0 = r9.m4851()
            og0 r1 = r8.f8371
            java.lang.String r1 = r1.f8093
            java.util.List r14 = r14.mo904(r1, r0)
            return r14
        L29b:
            org.luckypray.dexkit.DexKitBridge r14 = (org.luckypray.dexkit.DexKitBridge) r14
            java.lang.String[] r9 = (java.lang.String[]) r9
            java.lang.ClassLoader r8 = (java.lang.ClassLoader) r8
            zi r0 = new zi
            r0.<init>(r9, r5)
            org.luckypray.dexkit.result.MethodDataList r14 = r14.findMethod(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r14 = r14.iterator()
        L2b3:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L2d8
            java.lang.Object r0 = r14.next()
            org.luckypray.dexkit.result.MethodData r0 = (org.luckypray.dexkit.result.MethodData) r0
            java.lang.reflect.Method r0 = r0.getMethodInstance(r8)     // Catch: java.lang.Throwable -> L2c4
            goto L2cb
        L2c4:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L2cb:
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L2d0
            r0 = r6
        L2d0:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto L2b3
            r1.add(r0)
            goto L2b3
        L2d8:
            return r1
        L2d9:
            rb r14 = (p000.C0755rb) r14
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.util.IdentityHashMap r0 = r14.f9319
            java.util.IdentityHashMap r14 = r14.f9320
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>()
            java.util.Set r1 = java.util.Collections.newSetFromMap(r1)
            java.util.Iterator r3 = r8.iterator()
        L2f0:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L339
            java.lang.Object r10 = r3.next()
            android.view.View r10 = (android.view.View) r10
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            android.view.ViewParent r10 = r10.getParent()
            boolean r12 = r10 instanceof android.view.View
            if (r12 == 0) goto L30c
            android.view.View r10 = (android.view.View) r10
            goto L30d
        L30c:
            r10 = r6
        L30d:
            if (r10 == 0) goto L2f0
            r11.add(r10)
            if (r10 != r9) goto L32e
            java.util.Iterator r10 = r11.iterator()
        L318:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L2f0
            java.lang.Object r11 = r10.next()
            android.view.View r11 = (android.view.View) r11
            r1.getClass()
            r12 = r1
            java.util.Collection r12 = (java.util.Collection) r12
            r12.add(r11)
            goto L318
        L32e:
            android.view.ViewParent r10 = r10.getParent()
            boolean r12 = r10 instanceof android.view.View
            if (r12 == 0) goto L30c
            android.view.View r10 = (android.view.View) r10
            goto L30d
        L339:
            r1.getClass()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L342:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L374
            java.lang.Object r3 = r1.next()
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r9 = r14.get(r3)
            pb r9 = (p000.C0681pb) r9
            if (r9 != 0) goto L364
            pb r9 = new pb
            android.graphics.drawable.Drawable r10 = r3.getBackground()
            r9.<init>()
            r9.f8481 = r10
            r14.put(r3, r9)
        L364:
            android.graphics.drawable.Drawable r10 = r3.getBackground()
            if (r10 == 0) goto L342
            android.graphics.drawable.Drawable r10 = r3.getBackground()
            r9.f8481 = r10
            r3.setBackground(r6)
            goto L342
        L374:
            java.util.Iterator r14 = r8.iterator()
        L378:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L3fd
            java.lang.Object r1 = r14.next()
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r3 = r0.get(r1)
            qb r3 = (p000.C0718qb) r3
            if (r3 != 0) goto L3b5
            r1.getClass()
            qb r3 = new qb
            float r6 = r1.getAlpha()
            boolean r8 = r1.isClickable()
            boolean r9 = r1.isLongClickable()
            boolean r10 = r1.isFocusable()
            int r11 = r1.getImportantForAccessibility()
            r3.<init>()
            r3.f8947 = r6
            r3.f8948 = r8
            r3.f8949 = r9
            r3.f8950 = r10
            r3.f8951 = r11
            r0.put(r1, r3)
        L3b5:
            r1.getClass()
            float r6 = r1.getAlpha()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L3c2
            goto L3c8
        L3c2:
            float r6 = r1.getAlpha()
            r3.f8947 = r6
        L3c8:
            boolean r6 = r1.isClickable()
            if (r6 == 0) goto L3d0
            r3.f8948 = r4
        L3d0:
            boolean r6 = r1.isLongClickable()
            if (r6 == 0) goto L3d8
            r3.f8949 = r4
        L3d8:
            boolean r6 = r1.isFocusable()
            if (r6 == 0) goto L3e0
            r3.f8950 = r4
        L3e0:
            int r6 = r1.getImportantForAccessibility()
            if (r6 == r2) goto L3ec
            int r6 = r1.getImportantForAccessibility()
            r3.f8951 = r6
        L3ec:
            r1.setAlpha(r8)
            r1.setClickable(r5)
            r1.setLongClickable(r5)
            r1.setFocusable(r5)
            r1.setImportantForAccessibility(r2)
            goto L378
        L3fd:
            return r7
        L3fe:
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r9 = (java.lang.String) r9
            android.app.Activity r8 = (android.app.Activity) r8
            java.lang.String r0 = "UID: "
            java.lang.String r1 = "\n申请码: "
            java.lang.String r14 = p000.a12.m18(r0, r14, r1, r9)
            java.lang.String r0 = "clipboard"
            java.lang.Object r0 = r8.getSystemService(r0)
            r0.getClass()
            android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0
            java.lang.String r1 = "DYHelper申请信息"
            android.content.ClipData r14 = android.content.ClipData.newPlainText(r1, r14)
            r0.setPrimaryClip(r14)
            java.lang.String r14 = " 已复制，请发给开发者"
            android.widget.Toast r14 = android.widget.Toast.makeText(r8, r14, r5)
            r14.show()
            return r7
        L42a:
            a8 r14 = (p000.AbstractC0009a8) r14
            b8 r9 = (p000.C0068b8) r9
            sm1 r8 = (p000.sm1) r8
            r14.mo48()
            java.lang.Object r14 = r9.f1557
            j7 r14 = (p000.C0421j7) r14
            int r0 = r8.f9967
        L439:
            int r1 = r14.get()
            int r2 = r1 >>> 27
            r2 = r2 & 15
            if (r2 != r0) goto L446
            int r2 = r1 + (-1)
            goto L447
        L446:
            r2 = r1
        L447:
            boolean r1 = r14.compareAndSet(r1, r2)
            if (r1 == 0) goto L439
            return r7
    }
}
