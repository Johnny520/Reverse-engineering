package p000;

/* JADX INFO: renamed from: m3 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0535m3 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f6915;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f6916;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f6917;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f6918;

    public /* synthetic */ C0535m3(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f6915 = r4
            r0.f6916 = r1
            r0.f6917 = r2
            r0.f6918 = r3
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r25) {
            r24 = this;
            r0 = r24
            int r1 = r0.f6915
            r2 = 5
            r3 = 10
            r5 = 16
            r6 = 1
            r7 = 0
            s62 r8 = p000.s62.f9751
            java.lang.Object r9 = r0.f6918
            java.lang.Object r10 = r0.f6917
            java.lang.Object r0 = r0.f6916
            switch(r1) {
                case 0: goto L923;
                case 1: goto L788;
                case 2: goto L770;
                case 3: goto L587;
                case 4: goto L572;
                case 5: goto L503;
                case 6: goto L1b2;
                case 7: goto L180;
                case 8: goto Lac;
                case 9: goto L90;
                case 10: goto L73;
                case 11: goto L4f;
                case 12: goto L30;
                default: goto L16;
            }
        L16:
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            java.lang.Class r10 = (java.lang.Class) r10
            r1 = r25
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r1.getClass()
            ry1 r2 = p000.ry1.f9602
            java.lang.Class r2 = r9.getClass()
            boolean r0 = p000.ry1.m5263(r1, r0, r10, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L30:
            r2 = r0
            android.app.Activity r2 = (android.app.Activity) r2
            r4 = r10
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            r5 = r9
            um1 r5 = (p000.um1) r5
            r3 = r25
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            r3.getClass()
            java.lang.Thread r0 = new java.lang.Thread
            vg0 r1 = new vg0
            r6 = 6
            r1.<init>(r2, r3, r4, r5, r6)
            r0.<init>(r1)
            r0.start()
            return r8
        L4f:
            a80 r0 = (p000.a80) r0
            java.lang.String[] r10 = (java.lang.String[]) r10
            android.app.Activity r9 = (android.app.Activity) r9
            r1 = r25
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            bv1 r2 = p000.bv1.f1853
            java.lang.String r2 = "comment_audio_download_trigger_mode"
            p000.ui1.m5873(r2, r1)
            r1 = r10[r1]
            r0.invoke(r1)
            java.lang.String r0 = "评论语音下载方案已更新，重新打开评论区后生效"
            android.widget.Toast r0 = android.widget.Toast.makeText(r9, r0, r7)
            r0.show()
            return r8
        L73:
            sm1 r0 = (p000.sm1) r0
            a80 r10 = (p000.a80) r10
            java.lang.String[] r9 = (java.lang.String[]) r9
            r1 = r25
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.f9967 = r1
            bv1 r0 = p000.bv1.f1853
            java.lang.String r0 = "feed_preload_quality"
            p000.ui1.m5873(r0, r1)
            r0 = r9[r1]
            r10.invoke(r0)
            return r8
        L90:
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.String[] r10 = (java.lang.String[]) r10
            sm1 r9 = (p000.sm1) r9
            r1 = r25
            a80 r1 = (p000.a80) r1
            r1.getClass()
            bv1 r2 = p000.bv1.f1853
            int r2 = r9.f9967
            m3 r4 = new m3
            r4.<init>(r9, r1, r10, r3)
            java.lang.String r1 = "选择预加载清晰度"
            p000.bv1.m1054(r0, r1, r10, r2, r4)
            return r8
        Lac:
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            ck1 r10 = (p000.ck1) r10
            java.lang.ClassLoader r9 = (java.lang.ClassLoader) r9
            r1 = r25
            org.luckypray.dexkit.DexKitBridge r1 = (org.luckypray.dexkit.DexKitBridge) r1
            r1.getClass()
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.util.Set r4 = p000.ck1.f2181
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        Lc6:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto Ldf
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            yh0 r7 = new yh0     // Catch: java.lang.Throwable -> Lc6
            r7.<init>(r6, r5)     // Catch: java.lang.Throwable -> Lc6
            org.luckypray.dexkit.result.ClassDataList r6 = r1.findClass(r7)     // Catch: java.lang.Throwable -> Lc6
            p000.ck1.m1246(r3, r6, r9)     // Catch: java.lang.Throwable -> Lc6
            goto Lc6
        Ldf:
            java.lang.String r4 = "PublishButton"
            java.lang.String r5 = "setPublishViewAlpha:"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            java.lang.String r5 = "HomePage_Main_Shoot"
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.lang.String r6 = "HomeShotDynamicIconAbility"
            java.lang.String[] r6 = new java.lang.String[]{r6}
            java.lang.String r7 = "PublishStickerViewAbility"
            java.lang.String[] r7 = new java.lang.String[]{r7}
            java.lang.String r8 = "PUBLISH"
            java.lang.String[] r8 = new java.lang.String[]{r8}
            java.lang.String[][] r4 = new java.lang.String[][]{r4, r5, r6, r7, r8}
            java.util.List r4 = p000.AbstractC1021yh.m6897(r4)
            java.util.Iterator r4 = r4.iterator()
        L10b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L124
            java.lang.Object r5 = r4.next()
            java.lang.String[] r5 = (java.lang.String[]) r5
            zi r6 = new zi     // Catch: java.lang.Throwable -> L10b
            r6.<init>(r5, r2)     // Catch: java.lang.Throwable -> L10b
            org.luckypray.dexkit.result.MethodDataList r5 = r1.findMethod(r6)     // Catch: java.lang.Throwable -> L10b
            p000.ck1.m1247(r3, r5, r9)     // Catch: java.lang.Throwable -> L10b
            goto L10b
        L124:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r3.iterator()
        L12d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L144
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.Class r4 = (java.lang.Class) r4
            boolean r4 = p000.ck1.m1249(r4)
            if (r4 == 0) goto L12d
            r1.add(r3)
            goto L12d
        L144:
            ib1 r2 = new ib1
            r3 = 25
            r2.<init>(r3, r10)
            java.util.List r1 = p000.AbstractC0984xh.m6658(r1, r2)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L15d:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L178
            java.lang.Object r4 = r1.next()
            r5 = r4
            java.lang.Class r5 = (java.lang.Class) r5
            java.lang.String r5 = r5.getName()
            boolean r5 = r2.add(r5)
            if (r5 == 0) goto L15d
            r3.add(r4)
            goto L15d
        L178:
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L17f
            r0 = r3
        L17f:
            return r0
        L180:
            com.example.dyhelper.ui.dialog.PetElfCampTrendChartView r0 = (com.example.dyhelper.p002ui.dialog.PetElfCampTrendChartView) r0
            ce1 r10 = (p000.ce1) r10
            java.lang.String r9 = (java.lang.String) r9
            r1 = r25
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.util.List r0 = r0.f2632
            java.lang.Object r0 = r0.get(r1)
            java.util.List r2 = r10.f2090
            java.lang.Object r1 = r2.get(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " "
            r2.append(r0)
            r2.append(r1)
            r2.append(r9)
            java.lang.String r0 = r2.toString()
            return r0
        L1b2:
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.View r10 = (android.view.View) r10
            r11 = r9
            od r11 = (p000.EnumC0619od) r11
            r1 = r25
            dc1 r1 = (p000.dc1) r1
            r1.getClass()
            boolean r2 = p000.xn0.m6727(r0, r10, r6)
            if (r2 == 0) goto L1c7
            goto L1cd
        L1c7:
            boolean r2 = p000.xn0.m6696(r0, r10, r1)
            if (r2 != 0) goto L1d1
        L1cd:
            r23 = r8
            goto L500
        L1d1:
            java.lang.String r1 = r1.m1696()
            p000.xn0.m6752(r0, r10, r1)
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.jc1.f5424
            bb1 r15 = new bb1
            java.lang.String r1 = "pet_elf_camp_daily_harvest_limit"
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L1e7
            int r1 = r2.getInt(r1, r7)     // Catch: java.lang.Throwable -> L1e7
            goto L1e8
        L1e7:
            r1 = r7
        L1e8:
            r2 = 100
            int r1 = p000.j81.m2906(r1, r7, r2)
            java.lang.String r9 = "pet_elf_camp_daily_plant_limit"
            android.content.SharedPreferences r12 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L1f9
            int r9 = r12.getInt(r9, r7)     // Catch: java.lang.Throwable -> L1f9
            goto L1fa
        L1f9:
            r9 = r7
        L1fa:
            int r2 = p000.j81.m2906(r9, r7, r2)
            java.lang.String r9 = "pet_elf_camp_operation_interval_seconds"
            r12 = 3
            android.content.SharedPreferences r13 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L209
            int r12 = r13.getInt(r9, r12)     // Catch: java.lang.Throwable -> L209
        L209:
            r9 = 60
            int r9 = p000.j81.m2906(r12, r7, r9)
            long r12 = (long) r9
            r16 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r16
            r15.<init>(r1, r2, r12)
            xn0 r1 = p000.xn0.f12235
            long r12 = java.lang.System.currentTimeMillis()
            rc1 r16 = r1.m6763(r12)
            java.util.List r12 = p000.jc1.m2939()
            qd r13 = p000.v81.m6127()
            kd1 r1 = p000.kd1.f5861
            java.util.List r14 = r1.m3202()
            long r17 = java.lang.System.currentTimeMillis()
            bc1 r1 = p000.jc1.m2932(r11, r12, r13, r14, r15, r16, r17)
            java.util.ArrayList r2 = r1.f1630
            int r2 = r2.size()
            int r9 = r1.f1631
            long r12 = r1.f1632
            java.util.LinkedHashSet r14 = r1.f1633
            java.util.ArrayList r15 = r1.f1634
            int r6 = r1.f1636
            int r5 = r1.f1637
            r21 = 0
            int r4 = r1.f1638
            java.lang.Integer r1 = r1.f1639
            if (r2 == 0) goto L253
            if (r9 != 0) goto L25a
        L253:
            r2 = r0
            r24 = r1
            r23 = r8
            goto L4cc
        L25a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r3 = " 位人员、"
            r24 = r1
            java.lang.String r1 = " 块地"
            r23 = r8
            java.lang.String r8 = "本次将处理 "
            java.lang.String r1 = p000.AbstractC0602nx.m4128(r8, r2, r3, r9, r1)
            r7.append(r1)
            od r1 = p000.EnumC0619od.f8035
            if (r11 != r1) goto L3a0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "\n预计消耗金币："
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            r7.append(r1)
            r19 = 0
            r20 = 63
            r1 = r15
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            java.lang.String r2 = p000.AbstractC0984xh.m6644(r14, r15, r16, r17, r18, r19, r20)
            boolean r3 = p000.q02.m4671(r2)
            if (r3 == 0) goto L29d
            java.lang.String r2 = "无有效选择"
        L29d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r8 = "\n本次种子："
            r3.<init>(r8)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r7.append(r2)
            java.lang.String r2 = "\n\n逐会话种植计划："
            r7.append(r2)
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L2b8:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L3a0
            java.lang.Object r3 = r1.next()
            int r8 = r2 + 1
            if (r2 < 0) goto L39c
            fc1 r3 = (p000.fc1) r3
            java.lang.Long r2 = r3.f3879
            java.lang.String r9 = "未知"
            if (r2 == 0) goto L2d4
            java.lang.String r2 = r2.toString()
            if (r2 != 0) goto L2d5
        L2d4:
            r2 = r9
        L2d5:
            java.lang.Long r12 = r3.f3880
            if (r12 == 0) goto L2df
            java.lang.String r12 = r12.toString()
            if (r12 != 0) goto L2e0
        L2df:
            r12 = r9
        L2e0:
            java.lang.Integer r13 = r3.f3877
            if (r13 == 0) goto L2ea
            java.lang.String r13 = r13.toString()
            if (r13 != 0) goto L2eb
        L2ea:
            r13 = r9
        L2eb:
            java.lang.Integer r14 = r3.f3878
            if (r14 == 0) goto L2f7
            java.lang.String r14 = r14.toString()
            if (r14 != 0) goto L2f6
            goto L2f7
        L2f6:
            r9 = r14
        L2f7:
            java.lang.String r14 = r3.f3873
            r15 = 13
            r25 = r1
            r1 = 32
            java.lang.String r14 = r14.replace(r15, r1)
            r14.getClass()
            r15 = 10
            java.lang.String r1 = r14.replace(r15, r1)
            r1.getClass()
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            r14 = 48
            java.lang.String r1 = p000.q02.m4693(r1, r14)
            boolean r14 = p000.q02.m4671(r1)
            if (r14 == 0) goto L325
            java.lang.String r1 = "未命名会话"
        L325:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "\n"
            r14.<init>(r15)
            r14.append(r8)
            java.lang.String r15 = ". "
            r14.append(r15)
            r14.append(r1)
            java.lang.String r1 = r14.toString()
            r7.append(r1)
            java.lang.String r1 = r3.f3881
            java.lang.String r14 = r3.f3875
            int r15 = r3.f3874
            int r3 = r3.f3876
            r16 = r8
            java.lang.String r8 = " · "
            r17 = r10
            java.lang.String r10 = " (#"
            r18 = r0
            java.lang.String r0 = "\n   "
            java.lang.StringBuilder r0 = p000.lz1.m3695(r0, r1, r8, r14, r10)
            r0.append(r15)
            java.lang.String r1 = ") × "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " 块"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\n   投入 "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = " 金币（"
            r0.append(r1)
            java.lang.String r1 = "/块） · 预计收益 "
            java.lang.String r2 = "（"
            p000.AbstractC0602nx.m4119(r0, r13, r1, r12, r2)
            r0.append(r9)
            java.lang.String r1 = "/块）"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.append(r0)
            r1 = r25
            r2 = r16
            r10 = r17
            r0 = r18
            goto L2b8
        L39c:
            p000.AbstractC1021yh.m6917()
            throw r21
        L3a0:
            r18 = r0
            r17 = r10
            od r0 = p000.EnumC0619od.f8036
            if (r11 == r0) goto L3c2
            if (r24 == 0) goto L3b7
            int r0 = r24.intValue()
            java.lang.String r1 = "剩余 "
            java.lang.String r2 = " 次"
            java.lang.String r0 = p000.AbstractC0602nx.m4127(r1, r0, r2)
            goto L3b9
        L3b7:
            java.lang.String r0 = "不限制"
        L3b9:
            java.lang.String r1 = "\n今日限额："
            java.lang.String r0 = r1.concat(r0)
            r7.append(r0)
        L3c2:
            int r0 = r5 + r4
            if (r0 > 0) goto L3c8
            if (r6 <= 0) goto L3e1
        L3c8:
            java.lang.String r0 = " 人，无候选 "
            java.lang.String r1 = " 人，规则关闭 "
            java.lang.String r2 = "\n未纳入：不可用 "
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r2, r5, r0, r4, r1)
            r0.append(r6)
            java.lang.String r1 = " 人"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.append(r0)
        L3e1:
            java.lang.String r0 = r7.toString()
            x01 r1 = p000.x01.f11964
            r2 = r18
            android.view.LayoutInflater r1 = r1.m6477(r2)
            r3 = 2131492912(0x7f0c0030, float:1.860929E38)
            r4 = r21
            r5 = 0
            android.view.View r1 = r1.inflate(r3, r4, r5)
            r1.getClass()
            android.app.AlertDialog$Builder r3 = new android.app.AlertDialog$Builder
            r3.<init>(r2)
            android.app.AlertDialog$Builder r3 = r3.setView(r1)
            android.app.AlertDialog r3 = r3.create()
            xx r4 = p000.jx0.m3049(r2)
            java.lang.String r5 = r4.f12351
            r6 = 16
            android.graphics.drawable.GradientDrawable r5 = p000.jx0.m3062(r6, r2, r5)
            r1.setBackground(r5)
            r5 = 2131296378(0x7f09007a, float:1.821067E38)
            android.view.View r5 = r1.findViewById(r5)
            java.lang.String r6 = r4.f12352
            r7 = 12
            android.graphics.drawable.GradientDrawable r6 = p000.jx0.m3062(r7, r2, r6)
            r5.setBackground(r6)
            p000.xn0.m6707(r1, r4)
            r5 = 2131296377(0x7f090079, float:1.8210669E38)
            android.view.View r6 = r1.findViewById(r5)
            r6.getClass()
            android.widget.Button r6 = (android.widget.Button) r6
            java.lang.String r8 = r4.f12371
            int r9 = p000.xn0.m6749(r4)
            p000.xn0.m6726(r6, r8, r9)
            r6 = 2131296382(0x7f09007e, float:1.821068E38)
            android.view.View r8 = r1.findViewById(r6)
            android.widget.TextView r8 = (android.widget.TextView) r8
            int r9 = p000.xn0.m6749(r4)
            r8.setTextColor(r9)
            r8 = 2131296379(0x7f09007b, float:1.8210673E38)
            android.view.View r9 = r1.findViewById(r8)
            android.widget.TextView r9 = (android.widget.TextView) r9
            int r10 = p000.xn0.m6721(r4)
            r9.setTextColor(r10)
            r9 = 2131296380(0x7f09007c, float:1.8210675E38)
            android.view.View r10 = r1.findViewById(r9)
            r10.getClass()
            android.widget.Button r10 = (android.widget.Button) r10
            java.lang.String r4 = r4.f12358
            java.lang.String r12 = "#FFFFFF"
            int r12 = android.graphics.Color.parseColor(r12)
            p000.xn0.m6726(r10, r4, r12)
            android.view.View r4 = r1.findViewById(r6)
            android.widget.TextView r4 = (android.widget.TextView) r4
            int r6 = r11.ordinal()
            if (r6 == 0) goto L495
            r10 = 1
            if (r6 == r10) goto L492
            r10 = 2
            if (r6 != r10) goto L48c
            java.lang.String r6 = "确认全部浇水"
            goto L497
        L48c:
            p000.C1080.m7272()
            r4 = 0
            goto L502
        L492:
            java.lang.String r6 = "确认全部种地"
            goto L497
        L495:
            java.lang.String r6 = "确认一键收菜"
        L497:
            r4.setText(r6)
            android.view.View r4 = r1.findViewById(r8)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setText(r0)
            android.view.View r0 = r1.findViewById(r5)
            android.widget.Button r0 = (android.widget.Button) r0
            sa r4 = new sa
            r4.<init>(r3, r7)
            r0.setOnClickListener(r4)
            android.view.View r0 = r1.findViewById(r9)
            android.widget.Button r0 = (android.widget.Button) r0
            vj r1 = new vj
            r10 = r17
            r1.<init>(r2, r3, r10, r11)
            r0.setOnClickListener(r1)
            r3.show()
            r0 = 1063675494(0x3f666666, float:0.9)
            r4 = 0
            p000.xn0.m6716(r2, r3, r0, r4)
            goto L500
        L4cc:
            if (r24 != 0) goto L4cf
            goto L4e3
        L4cf:
            int r0 = r24.intValue()
            if (r0 != 0) goto L4e3
            java.lang.String r0 = p000.xn0.m6706(r11)
            java.lang.String r1 = "今日"
            java.lang.String r3 = "限额已用完"
            java.lang.String r0 = p000.lz1.m3674(r1, r0, r3)
        L4e1:
            r10 = 1
            goto L4f9
        L4e3:
            java.lang.String r0 = "当前没有可执行的"
            if (r5 <= 0) goto L4f2
            java.lang.String r1 = p000.xn0.m6706(r11)
            java.lang.String r3 = "地块；无小火人或无营地会话已排除"
        L4ed:
            java.lang.String r0 = p000.lz1.m3674(r0, r1, r3)
            goto L4e1
        L4f2:
            java.lang.String r1 = p000.xn0.m6706(r11)
            java.lang.String r3 = "地块"
            goto L4ed
        L4f9:
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r10)
            r0.show()
        L500:
            r4 = r23
        L502:
            return r4
        L503:
            r23 = r8
            r7 = r0
            android.app.Activity r7 = (android.app.Activity) r7
            r6 = r10
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            fv r9 = (p000.C0299fv) r9
            r11 = r25
            java.lang.String r11 = (java.lang.String) r11
            r11.getClass()
            qy0 r0 = p000.qy0.f9157
            java.lang.String r12 = r9.f4139
            p000.qy0.m4960(r7)
            int r10 = r0.m5031()
            boolean r8 = p000.qy0.m4988(r7)
            java.lang.String r0 = "notification"
            java.lang.Object r0 = r7.getSystemService(r0)
            r0.getClass()
            r9 = r0
            android.app.NotificationManager r9 = (android.app.NotificationManager) r9
            int r0 = r6.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "共 "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " 张"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "保存图片"
            p000.qy0.m4996(r7, r1, r0)
            int r0 = r6.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "⬇ 开始保存 "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " 张图片..."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            p000.qy0.m4991(r7, r0)
            iy0 r5 = new iy0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r0 = 23
            java.lang.String r1 = "save-bitmaps"
            p000.p91.m4411(r0, r5, r1)
            return r23
        L572:
            r23 = r8
            android.app.Activity r0 = (android.app.Activity) r0
            f8 r10 = (p000.C0276f8) r10
            java.util.List r9 = (java.util.List) r9
            r1 = r25
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            qy0 r2 = p000.qy0.f9157
            p000.qy0.m4955(r0, r10, r9, r1)
            return r23
        L587:
            r4 = 0
            r1 = r0
            android.content.Context r1 = (android.content.Context) r1
            f8 r10 = (p000.C0276f8) r10
            fv r9 = (p000.C0299fv) r9
            r2 = r25
            java.util.List r2 = (java.util.List) r2
            r2.getClass()
            qy0 r0 = p000.qy0.f9157
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L768
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r5 = p000.qy0.m4969(r1, r10)
            if (r9 != 0) goto L5af
            jy0 r6 = p000.jy0.f5663
            fv r9 = p000.qy0.m5014(r0, r1, r10, r6, r5)
        L5af:
            java.lang.String r5 = r9.f4139
            java.lang.String r0 = r9.f4140
            java.lang.String r6 = p000.pu0.m4619(r0)
            java.util.Iterator r7 = r2.iterator()
            r0 = 0
        L5bc:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L767
            r10 = 1
            int r8 = r0 + 1
            java.lang.Object r0 = r7.next()
            r9 = r0
            h41 r9 = (p000.h41) r9
            java.lang.String r0 = r9.f4570
            java.lang.String r11 = r9.f4571
            boolean r0 = p000.q02.m4671(r0)
            if (r0 != 0) goto L75b
            int r0 = r2.size()
            r12 = 6
            if (r0 > r10) goto L5e0
            r10 = r6
            r13 = 0
            goto L612
        L5e0:
            java.lang.String r0 = "."
            int r10 = p000.q02.m4673(r12, r6, r0)
            r13 = -1
            if (r10 != r13) goto L5ec
            r10 = r6
            r13 = 0
            goto L5f1
        L5ec:
            r13 = 0
            java.lang.String r10 = r6.substring(r13, r10)
        L5f1:
            java.lang.String r14 = "jpg"
            java.lang.String r14 = p000.q02.m4688(r6, r0, r14)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r10)
            java.lang.String r10 = "_official"
            r15.append(r10)
            r15.append(r8)
            r15.append(r0)
            r15.append(r14)
            java.lang.String r0 = r15.toString()
            r10 = r0
        L612:
            android.net.Uri r0 = p000.AbstractC1021yh.m6864(r1)
            if (r0 == 0) goto L61d
            java.lang.String r0 = r0.toString()
            goto L61e
        L61d:
            r0 = r4
        L61e:
            if (r0 == 0) goto L626
            boolean r14 = p000.q02.m4671(r0)
            if (r14 == 0) goto L627
        L626:
            r0 = r4
        L627:
            java.lang.String r14 = "DYHelper"
            if (r0 != 0) goto L631
        L62b:
            r24 = r6
            r25 = r7
            goto L6c0
        L631:
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L675
            cw1 r0 = p000.cw1.m1627(r1, r0)     // Catch: java.lang.Throwable -> L675
            boolean r15 = r0.m1628()     // Catch: java.lang.Throwable -> L675
            if (r15 != 0) goto L640
            goto L62b
        L640:
            java.lang.String r15 = p000.qy0.m5003(r0, r5)     // Catch: java.lang.Throwable -> L675
            boolean r16 = p000.q02.m4671(r15)     // Catch: java.lang.Throwable -> L675
            if (r16 != 0) goto L681
            java.lang.String r16 = "/"
            java.lang.String[] r4 = new java.lang.String[]{r16}     // Catch: java.lang.Throwable -> L675
            java.util.List r4 = p000.q02.m4683(r15, r4, r12)     // Catch: java.lang.Throwable -> L675
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L675
        L658:
            boolean r12 = r4.hasNext()     // Catch: java.lang.Throwable -> L675
            if (r12 == 0) goto L681
            java.lang.Object r12 = r4.next()     // Catch: java.lang.Throwable -> L675
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> L675
            java.lang.String r12 = p000.AbstractC0488ku.m3416(r12)     // Catch: java.lang.Throwable -> L675
            cw1 r0 = r0.m1629(r12)     // Catch: java.lang.Throwable -> L675
            if (r0 == 0) goto L67b
            boolean r12 = r0.m1631()     // Catch: java.lang.Throwable -> L675
            if (r12 != 0) goto L658
            goto L67b
        L675:
            r0 = move-exception
            r24 = r6
            r25 = r7
            goto L6ba
        L67b:
            r24 = r6
            r25 = r7
        L67f:
            r4 = 0
            goto L6c0
        L681:
            java.lang.String r4 = p000.AbstractC0488ku.m3418(r10)     // Catch: java.lang.Throwable -> L675
            cw1 r4 = r0.m1629(r4)     // Catch: java.lang.Throwable -> L675
            if (r4 == 0) goto L67b
            java.lang.Object r0 = r4.f2790     // Catch: java.lang.Throwable -> L675
            android.net.Uri r0 = (android.net.Uri) r0     // Catch: java.lang.Throwable -> L675
            java.lang.Object r12 = r4.f2789     // Catch: java.lang.Throwable -> L675
            android.content.Context r12 = (android.content.Context) r12     // Catch: java.lang.Throwable -> L675
            java.lang.String r15 = "mime_type"
            java.lang.String r15 = p000.AbstractC0073bd.m858(r12, r0, r15)     // Catch: java.lang.Throwable -> L675
            java.lang.String r13 = "vnd.android.document/directory"
            boolean r13 = r13.equals(r15)     // Catch: java.lang.Throwable -> L675
            if (r13 != 0) goto L67b
            boolean r13 = android.text.TextUtils.isEmpty(r15)     // Catch: java.lang.Throwable -> L675
            if (r13 == 0) goto L6a8
            goto L67b
        L6a8:
            java.lang.String r13 = "_size"
            r24 = r6
            r25 = r7
            r6 = 0
            long r12 = p000.AbstractC0073bd.m857(r12, r0, r13, r6)     // Catch: java.lang.Throwable -> L6b9
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 <= 0) goto L67f
            goto L6c0
        L6b9:
            r0 = move-exception
        L6ba:
            java.lang.String r4 = "[SAF] 检查已存在输出失败"
            p000.C0888ux.m5977(r14, r4, r0)
            goto L67f
        L6c0:
            java.lang.String r0 = ", uri="
            if (r4 == 0) goto L6e3
            r3.add(r10)
            java.lang.Object r4 = r4.f2790
            android.net.Uri r4 = (android.net.Uri) r4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "[LIVEPHOTO-MERGE-OFFICIAL-KEEP] file="
            r6.<init>(r7)
            r6.append(r10)
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = r6.toString()
            p000.C0888ux.m5975(r14, r0)
            goto L732
        L6e3:
            java.lang.String r4 = "image/jpeg"
            java.lang.String r6 = android.os.Environment.DIRECTORY_PICTURES     // Catch: java.lang.Throwable -> L755
            r6.getClass()     // Catch: java.lang.Throwable -> L755
            android.net.Uri r4 = p000.qy0.m4985(r1, r5, r10, r4, r6)     // Catch: java.lang.Throwable -> L755
            java.io.InputStream r6 = p000.qy0.m5007(r1, r9)     // Catch: java.lang.Throwable -> L73a
            android.content.ContentResolver r7 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L73c
            java.io.OutputStream r7 = r7.openOutputStream(r4)     // Catch: java.lang.Throwable -> L73c
            if (r7 == 0) goto L747
            r9 = 8192(0x2000, float:1.148E-41)
            p000.h62.m2364(r6, r7, r9)     // Catch: java.lang.Throwable -> L73f
            r7.flush()     // Catch: java.lang.Throwable -> L73f
            r7.close()     // Catch: java.lang.Throwable -> L73c
            r6.close()     // Catch: java.lang.Throwable -> L73a
            p000.qy0.m4999(r1, r4)     // Catch: java.lang.Throwable -> L73a
            r3.add(r10)     // Catch: java.lang.Throwable -> L73a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73a
            r6.<init>()     // Catch: java.lang.Throwable -> L73a
            java.lang.String r7 = "[LIVEPHOTO-MERGE-OFFICIAL-IMPORTED] source="
            r6.append(r7)     // Catch: java.lang.Throwable -> L73a
            r6.append(r11)     // Catch: java.lang.Throwable -> L73a
            java.lang.String r7 = ", file="
            r6.append(r7)     // Catch: java.lang.Throwable -> L73a
            r6.append(r10)     // Catch: java.lang.Throwable -> L73a
            r6.append(r0)     // Catch: java.lang.Throwable -> L73a
            r6.append(r4)     // Catch: java.lang.Throwable -> L73a
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L73a
            p000.C0888ux.m5975(r14, r0)     // Catch: java.lang.Throwable -> L73a
        L732:
            r6 = r24
            r7 = r25
            r0 = r8
            r4 = 0
            goto L5bc
        L73a:
            r0 = move-exception
            goto L757
        L73c:
            r0 = move-exception
            r2 = r0
            goto L74f
        L73f:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch: java.lang.Throwable -> L742
        L742:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r7, r2)     // Catch: java.lang.Throwable -> L73c
            throw r0     // Catch: java.lang.Throwable -> L73c
        L747:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L73c
            java.lang.String r2 = "无法打开官方合并输出导入流"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L73c
            throw r0     // Catch: java.lang.Throwable -> L73c
        L74f:
            throw r2     // Catch: java.lang.Throwable -> L750
        L750:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r6, r2)     // Catch: java.lang.Throwable -> L73a
            throw r0     // Catch: java.lang.Throwable -> L73a
        L755:
            r0 = move-exception
            r4 = 0
        L757:
            p000.qy0.m4987(r1, r4)
            throw r0
        L75b:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "官方合并未返回可读取的输出路径: "
            java.lang.String r1 = p000.lz1.m3687(r1, r11)
            r0.<init>(r1)
            throw r0
        L767:
            return r3
        L768:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "官方合并成功但没有返回输出文件"
            r0.<init>(r1)
            throw r0
        L770:
            r23 = r8
            um1 r0 = (p000.um1) r0
            com.example.dyhelper.ui.GestureAreaView r10 = (com.example.dyhelper.p002ui.GestureAreaView) r10
            la0 r9 = (p000.la0) r9
            r1 = r25
            w90 r1 = (p000.w90) r1
            r1.getClass()
            r0.f10912 = r1
            r10.setGridBounds(r1)
            r9.invoke()
            return r23
        L788:
            r1 = r0
            st r1 = (p000.C0810st) r1
            java.lang.ClassLoader r10 = (java.lang.ClassLoader) r10
            cb r9 = (p000.C0107cb) r9
            r3 = r25
            org.luckypray.dexkit.DexKitBridge r3 = (org.luckypray.dexkit.DexKitBridge) r3
            r3.getClass()
            st r0 = p000.C0810st.f10010
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            hm r0 = new hm     // Catch: java.lang.Throwable -> L7c7
            r5 = 14
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L7c7
            org.luckypray.dexkit.result.MethodDataList r0 = r3.findMethod(r0)     // Catch: java.lang.Throwable -> L7c7
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7c7
            r5.<init>()     // Catch: java.lang.Throwable -> L7c7
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L7c7
        L7b1:
            boolean r6 = r0.hasNext()     // Catch: java.lang.Throwable -> L7c7
            if (r6 == 0) goto L7cd
            java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L7c7
            org.luckypray.dexkit.result.MethodData r6 = (org.luckypray.dexkit.result.MethodData) r6     // Catch: java.lang.Throwable -> L7c7
            java.lang.reflect.Method r6 = r6.getMethodInstance(r10)     // Catch: java.lang.Throwable -> L7c7
            if (r6 == 0) goto L7b1
            r5.add(r6)     // Catch: java.lang.Throwable -> L7c7
            goto L7b1
        L7c7:
            r0 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r0)
        L7cd:
            java.lang.Throwable r0 = p000.fo1.m2190(r5)
            jz r6 = p000.C0450jz.f5672
            java.lang.String r7 = "r398844d0f2b2fd7c"
            if (r0 != 0) goto L7d8
            goto L7e2
        L7d8:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r5 = "DexKit strict matcher failed: "
            p000.AbstractC0602nx.m4143(r5, r0, r7)
            r5 = r6
        L7e2:
            java.util.List r5 = (java.util.List) r5
            p000.C0810st.m5554(r4, r5)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L833
            hm r0 = new hm     // Catch: java.lang.Throwable -> L817
            r5 = 15
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L817
            org.luckypray.dexkit.result.MethodDataList r0 = r3.findMethod(r0)     // Catch: java.lang.Throwable -> L817
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L817
            r5.<init>()     // Catch: java.lang.Throwable -> L817
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L817
        L801:
            boolean r8 = r0.hasNext()     // Catch: java.lang.Throwable -> L817
            if (r8 == 0) goto L81d
            java.lang.Object r8 = r0.next()     // Catch: java.lang.Throwable -> L817
            org.luckypray.dexkit.result.MethodData r8 = (org.luckypray.dexkit.result.MethodData) r8     // Catch: java.lang.Throwable -> L817
            java.lang.reflect.Method r8 = r8.getMethodInstance(r10)     // Catch: java.lang.Throwable -> L817
            if (r8 == 0) goto L801
            r5.add(r8)     // Catch: java.lang.Throwable -> L817
            goto L801
        L817:
            r0 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r0)
        L81d:
            java.lang.Throwable r0 = p000.fo1.m2190(r5)
            if (r0 != 0) goto L824
            goto L82e
        L824:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r5 = "DexKit signature matcher failed: "
            p000.AbstractC0602nx.m4143(r5, r0, r7)
            r5 = r6
        L82e:
            java.util.List r5 = (java.util.List) r5
            p000.C0810st.m5554(r4, r5)
        L833:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L87f
            hm r0 = new hm     // Catch: java.lang.Throwable -> L863
            r5 = 16
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L863
            org.luckypray.dexkit.result.MethodDataList r0 = r3.findMethod(r0)     // Catch: java.lang.Throwable -> L863
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L863
            r3.<init>()     // Catch: java.lang.Throwable -> L863
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L863
        L84d:
            boolean r5 = r0.hasNext()     // Catch: java.lang.Throwable -> L863
            if (r5 == 0) goto L869
            java.lang.Object r5 = r0.next()     // Catch: java.lang.Throwable -> L863
            org.luckypray.dexkit.result.MethodData r5 = (org.luckypray.dexkit.result.MethodData) r5     // Catch: java.lang.Throwable -> L863
            java.lang.reflect.Method r5 = r5.getMethodInstance(r10)     // Catch: java.lang.Throwable -> L863
            if (r5 == 0) goto L84d
            r3.add(r5)     // Catch: java.lang.Throwable -> L863
            goto L84d
        L863:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
        L869:
            java.lang.Throwable r0 = p000.fo1.m2190(r3)
            if (r0 != 0) goto L871
            r6 = r3
            goto L87a
        L871:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r3 = "DexKit string matcher failed: "
            p000.AbstractC0602nx.m4143(r3, r0, r7)
        L87a:
            java.util.List r6 = (java.util.List) r6
            p000.C0810st.m5554(r4, r6)
        L87f:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r4.iterator()
        L88d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L8a8
            java.lang.Object r5 = r4.next()
            r6 = r5
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.String r6 = p000.C0810st.m5561(r6)
            boolean r6 = r0.add(r6)
            if (r6 == 0) goto L88d
            r3.add(r5)
            goto L88d
        L8a8:
            tf r0 = new tf
            r4 = 26
            r0.<init>(r4)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r3, r0)
            java.util.Iterator r3 = r0.iterator()
        L8b7:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L8cb
            java.lang.Object r4 = r3.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            r10 = 1
            r4.setAccessible(r10)
            p000.C0810st.m5547(r4)
            goto L8b7
        L8cb:
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L8d2
            goto L8d8
        L8d2:
            java.lang.Object r0 = r9.invoke()
            java.util.List r0 = (java.util.List) r0
        L8d8:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L8e6:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L901
            java.lang.Object r5 = r0.next()
            r6 = r5
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.String r6 = p000.C0810st.m5561(r6)
            boolean r6 = r3.add(r6)
            if (r6 == 0) goto L8e6
            r4.add(r5)
            goto L8e6
        L901:
            qt r0 = new qt
            r0.<init>(r2, r1)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r4, r0)
            java.util.Iterator r1 = r0.iterator()
        L90e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L922
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r10 = 1
            r2.setAccessible(r10)
            p000.C0810st.m5547(r2)
            goto L90e
        L922:
            return r0
        L923:
            r23 = r8
            o3 r0 = (p000.C0609o3) r0
            x3 r10 = (p000.C0970x3) r10
            qm1 r9 = (p000.qm1) r9
            r1 = r25
            v3 r1 = (p000.C0895v3) r1
            x3 r2 = r0.f7915
            p000.j81.m2894(r1, r2)
            x91 r2 = r1.f11082
            java.lang.Object r3 = r2.getValue()
            g62 r4 = r0.f7913
            c4 r5 = r0.f7922
            c4 r6 = r0.f7921
            c4 r7 = r0.f7919
            boolean r7 = p000.ln0.m3626(r6, r7)
            if (r7 == 0) goto L951
            c4 r7 = r0.f7920
            boolean r7 = p000.ln0.m3626(r5, r7)
            if (r7 == 0) goto L951
            goto L99a
        L951:
            a80 r7 = r4.f4262
            java.lang.Object r7 = r7.invoke(r3)
            c4 r7 = (p000.AbstractC0100c4) r7
            int r8 = r7.mo28()
            r11 = 0
            r22 = 0
        L960:
            if (r11 >= r8) goto L992
            float r12 = r7.mo27(r11)
            float r13 = r6.mo27(r11)
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 < 0) goto L97a
            float r12 = r7.mo27(r11)
            float r13 = r5.mo27(r11)
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 <= 0) goto L98f
        L97a:
            float r12 = r7.mo27(r11)
            float r13 = r6.mo27(r11)
            float r14 = r5.mo27(r11)
            float r12 = p000.j81.m2905(r12, r13, r14)
            r7.mo31(r11, r12)
            r22 = 1
        L98f:
            int r11 = r11 + 1
            goto L960
        L992:
            if (r22 == 0) goto L99a
            a80 r3 = r4.f4263
            java.lang.Object r3 = r3.invoke(r7)
        L99a:
            java.lang.Object r2 = r2.getValue()
            boolean r2 = p000.ln0.m3626(r3, r2)
            if (r2 != 0) goto L9bf
            x3 r0 = r0.f7915
            x91 r0 = r0.f12020
            r0.setValue(r3)
            x91 r0 = r10.f12020
            r0.setValue(r3)
            x91 r0 = r1.f11086
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.setValue(r2)
            p70 r0 = r1.f11081
            r0.invoke()
            r10 = 1
            r9.f9050 = r10
        L9bf:
            return r23
    }
}
