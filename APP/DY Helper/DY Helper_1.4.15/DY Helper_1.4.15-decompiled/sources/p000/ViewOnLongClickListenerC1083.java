package p000;

/* JADX INFO: renamed from: ζ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnLongClickListenerC1083 implements android.view.View.OnLongClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f13393;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f13394;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f13395;

    public /* synthetic */ ViewOnLongClickListenerC1083(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f13393 = r2
            r0.f13394 = r1
            r0.f13395 = r3
            r0.<init>()
            return
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View r19) {
            r18 = this;
            r0 = r18
            int r1 = r0.f13393
            r2 = 3
            r3 = 0
            r4 = 1
            java.lang.Object r5 = r0.f13395
            java.lang.Object r0 = r0.f13394
            r6 = 0
            switch(r1) {
                case 0: goto L574;
                case 1: goto Lb4;
                case 2: goto L52;
                case 3: goto L2e;
                default: goto Lf;
            }
        Lf:
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            ky1 r5 = (p000.ky1) r5
            r1 = 1059481190(0x3f266666, float:0.65)
            r0.setAlpha(r1)
            ry1 r1 = p000.ry1.f9602
            java.lang.String r1 = p000.ry1.m5291(r5)
            java.lang.String r2 = "spark"
            android.content.ClipData r1 = android.content.ClipData.newPlainText(r2, r1)
            android.view.View$DragShadowBuilder r2 = new android.view.View$DragShadowBuilder
            r2.<init>(r0)
            r0.startDragAndDrop(r1, r2, r5, r6)
            return r4
        L2e:
            gz1 r0 = (p000.gz1) r0
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            boolean r1 = r0.f4513
            java.lang.String r2 = r0.f4508
            if (r1 != 0) goto L50
            java.lang.String r1 = "default"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L41
            goto L50
        L41:
            java.lang.String r1 = "spark_group"
            android.content.ClipData r1 = android.content.ClipData.newPlainText(r1, r2)
            android.view.View$DragShadowBuilder r2 = new android.view.View$DragShadowBuilder
            r2.<init>(r5)
            r5.startDragAndDrop(r1, r2, r0, r6)
            goto L51
        L50:
            r4 = r6
        L51:
            return r4
        L52:
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            xd0 r5 = (p000.xd0) r5
            be0 r1 = p000.be0.f1670
            boolean r1 = r1.m938()
            if (r1 != 0) goto L60
            r4 = r6
            goto Lb3
        L60:
            cn1 r1 = p000.cn1.f2212
            java.lang.String r1 = r5.f12137
            boolean r6 = p000.q02.m4671(r1)
            if (r6 == 0) goto L6c
            java.lang.String r1 = "该联系人"
        L6c:
            java.lang.String r6 = r5.f12135
            boolean r7 = p000.q02.m4671(r6)
            if (r7 == 0) goto L7e
            java.lang.String r6 = r5.f12136
            boolean r7 = p000.q02.m4671(r6)
            if (r7 == 0) goto L7e
            java.lang.String r6 = r5.f12133
        L7e:
            boolean r7 = p000.q02.m4671(r6)
            if (r7 == 0) goto L86
            r6 = r1
            goto L8c
        L86:
            java.lang.String r7 = "\n抖音号："
            java.lang.String r6 = p000.lz1.m3688(r1, r7, r6)
        L8c:
            android.app.AlertDialog$Builder r7 = new android.app.AlertDialog$Builder
            android.content.Context r8 = r0.getContext()
            r7.<init>(r8)
            java.lang.String r8 = "隐藏联系人"
            android.app.AlertDialog$Builder r7 = r7.setTitle(r8)
            android.app.AlertDialog$Builder r6 = r7.setMessage(r6)
            java.lang.String r7 = "取消"
            android.app.AlertDialog$Builder r3 = r6.setNegativeButton(r7, r3)
            dd0 r6 = new dd0
            r6.<init>(r5, r0, r1, r2)
            java.lang.String r0 = "隐藏"
            android.app.AlertDialog$Builder r0 = r3.setPositiveButton(r0, r6)
            r0.show()
        Lb3:
            return r4
        Lb4:
            android.app.Activity r0 = (android.app.Activity) r0
            ec1 r5 = (p000.ec1) r5
            x01 r1 = p000.x01.f11964
            android.view.LayoutInflater r1 = r1.m6477(r0)
            r7 = 2131492913(0x7f0c0031, float:1.8609291E38)
            android.view.View r1 = r1.inflate(r7, r3, r6)
            r1.getClass()
            android.app.AlertDialog$Builder r7 = new android.app.AlertDialog$Builder
            r7.<init>(r0)
            android.app.AlertDialog$Builder r7 = r7.setView(r1)
            android.app.AlertDialog r7 = r7.create()
            xx r8 = p000.jx0.m3049(r0)
            java.lang.String r9 = r8.f12351
            r10 = 16
            android.graphics.drawable.GradientDrawable r9 = p000.jx0.m3062(r10, r0, r9)
            r1.setBackground(r9)
            r9 = 2131296386(0x7f090082, float:1.8210687E38)
            android.view.View r11 = r1.findViewById(r9)
            java.lang.String r12 = r8.f12352
            r13 = 10
            android.graphics.drawable.GradientDrawable r12 = p000.jx0.m3062(r13, r0, r12)
            r11.setBackground(r12)
            r11 = 2131296387(0x7f090083, float:1.821069E38)
            android.view.View r11 = r1.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            java.lang.String r12 = r5.f3484
            r11.setText(r12)
            int r12 = p000.xn0.m6749(r8)
            r11.setTextColor(r12)
            android.view.View r9 = r1.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            java.lang.String r11 = p000.xn0.m6725(r5)
            r9.setText(r11)
            int r11 = p000.xn0.m6721(r8)
            r9.setTextColor(r11)
            r9 = 2131296384(0x7f090080, float:1.8210683E38)
            android.view.View r9 = r1.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            long r14 = r5.f3481
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r19 = r3
            java.lang.String r3 = "会话短 ID："
            r12.<init>(r3)
            r12.append(r14)
            java.lang.String r3 = "\n"
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            r11.append(r12)
            sd r12 = r5.f3486
            java.lang.String r12 = p000.xn0.m6757(r12)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "人员规则："
            r14.<init>(r15)
            r14.append(r12)
            r14.append(r3)
            java.lang.String r12 = r14.toString()
            r11.append(r12)
            id r5 = r5.f3487
            if (r5 != 0) goto L16f
            java.lang.String r2 = "缓存状态：尚未刷新"
            r11.append(r2)
        L16a:
            r17 = r8
            r2 = r11
            goto L536
        L16f:
            pd r12 = r5.f5004
            int r12 = r12.ordinal()
            r14 = 4
            r15 = 2
            if (r12 == 0) goto L193
            if (r12 == r4) goto L190
            if (r12 == r15) goto L18d
            if (r12 == r2) goto L18a
            if (r12 != r14) goto L184
            java.lang.String r12 = "网络失败"
            goto L195
        L184:
            p000.C1080.m7272()
            r4 = r6
            goto L573
        L18a:
            java.lang.String r12 = "待刷新"
            goto L195
        L18d:
            java.lang.String r12 = "无营地"
            goto L195
        L190:
            java.lang.String r12 = "无小火人"
            goto L195
        L193:
            java.lang.String r12 = "可用"
        L195:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r14 = "缓存状态："
            r6.<init>(r14)
            r6.append(r12)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            r11.append(r6)
            long r13 = r5.f5006
            java.lang.Long r12 = java.lang.Long.valueOf(r13)
            java.lang.String r12 = p000.xn0.m6697(r12)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "更新时间："
            r13.<init>(r14)
            r13.append(r12)
            r13.append(r3)
            java.lang.String r12 = r13.toString()
            r11.append(r12)
            java.lang.Long r12 = r5.f5007
            java.lang.String r12 = p000.xn0.m6697(r12)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "最近成熟："
            r13.<init>(r14)
            r13.append(r12)
            r13.append(r3)
            java.lang.String r12 = r13.toString()
            r11.append(r12)
            java.lang.Long r12 = r5.f5008
            java.lang.String r12 = p000.xn0.m6697(r12)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "最近可浇："
            r13.<init>(r14)
            r13.append(r12)
            r13.append(r3)
            java.lang.String r12 = r13.toString()
            r11.append(r12)
            java.lang.Long r12 = r5.f5009
            java.lang.String r12 = p000.xn0.m6697(r12)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "下次状态复查："
            r13.<init>(r14)
            r13.append(r12)
            r13.append(r3)
            java.lang.String r12 = r13.toString()
            r11.append(r12)
            zd1 r5 = r5.f5005
            if (r5 != 0) goto L220
            java.lang.String r2 = "\n当前没有可展示的营地快照"
            r11.append(r2)
            goto L16a
        L220:
            java.util.List r12 = r5.f13051
            java.lang.String r13 = r5.f13047
            if (r13 != 0) goto L228
            java.lang.String r13 = "未提供"
        L228:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r6 = "\n营地名称："
            r14.<init>(r6)
            r14.append(r13)
            r14.append(r3)
            java.lang.String r6 = r14.toString()
            r11.append(r6)
            java.lang.Integer r6 = r5.f13048
            java.lang.String r13 = "未知"
            if (r6 != 0) goto L243
            r6 = r13
        L243:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r2 = "营地等级："
            r14.<init>(r2)
            r14.append(r6)
            r14.append(r3)
            java.lang.String r2 = r14.toString()
            r11.append(r2)
            java.lang.String r2 = r5.f13049
            if (r2 != 0) goto L25c
            r2 = r13
        L25c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r14 = "经验："
            r6.<init>(r14)
            r6.append(r2)
            r6.append(r3)
            java.lang.String r2 = r6.toString()
            r11.append(r2)
            java.lang.String r2 = r5.f13053
            if (r2 != 0) goto L275
            r2 = r13
        L275:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r14 = "金币："
            r6.<init>(r14)
            r6.append(r2)
            r6.append(r3)
            java.lang.String r2 = r6.toString()
            r11.append(r2)
            java.lang.Integer r2 = r5.f13050
            if (r2 != 0) goto L28e
            r2 = r13
        L28e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r14 = "剩余浇水次数："
            r6.<init>(r14)
            r6.append(r2)
            r6.append(r3)
            java.lang.String r2 = r6.toString()
            r11.append(r2)
            java.lang.Integer r2 = r5.f13056
            if (r2 != 0) goto L2a7
            r2 = r13
        L2a7:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r14 = "双倍收益次数："
            r6.<init>(r14)
            r6.append(r2)
            r6.append(r3)
            java.lang.String r2 = r6.toString()
            r11.append(r2)
            java.lang.Integer r2 = r5.f13057
            if (r2 != 0) goto L2c0
            r2 = r13
        L2c0:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r14 = "访客数量："
            r6.<init>(r14)
            r6.append(r2)
            r6.append(r3)
            java.lang.String r2 = r6.toString()
            r11.append(r2)
            java.lang.Boolean r2 = r5.f13058
            if (r2 == 0) goto L2e4
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L2e1
            java.lang.String r2 = "是"
            goto L2e5
        L2e1:
            java.lang.String r2 = "否"
            goto L2e5
        L2e4:
            r2 = r13
        L2e5:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r14 = "需要重置："
            r6.<init>(r14)
            r6.append(r2)
            r6.append(r3)
            java.lang.String r2 = r6.toString()
            r11.append(r2)
            r2 = r11
            long r10 = java.lang.System.currentTimeMillis()
            java.util.ArrayList r6 = r5.m7128()
            int r6 = r6.size()
            java.lang.String r10 = p000.xn0.m6698(r5, r10)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r14 = "作物概览：已种 "
            r11.<init>(r14)
            r11.append(r6)
            java.lang.String r6 = " 块 · "
            r11.append(r6)
            r11.append(r10)
            r11.append(r3)
            java.lang.String r6 = r11.toString()
            r2.append(r6)
            int r6 = r12.size()
            java.util.ArrayList r10 = r5.m7126()
            int r10 = r10.size()
            java.util.ArrayList r11 = r5.m7122()
            int r11 = r11.size()
            java.util.ArrayList r14 = r5.m7123()
            int r14 = r14.size()
            java.util.ArrayList r5 = r5.m7125()
            int r5 = r5.size()
            java.lang.String r15 = "，成熟 "
            java.lang.String r4 = "，生长 "
            r17 = r8
            java.lang.String r8 = "地块统计：共 "
            java.lang.StringBuilder r4 = p000.AbstractC0602nx.m4136(r8, r6, r15, r10, r4)
            java.lang.String r6 = "，空闲 "
            java.lang.String r8 = "，锁定 "
            p000.AbstractC0602nx.m4117(r4, r11, r6, r14, r8)
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.append(r3)
            boolean r3 = r12.isEmpty()
            if (r3 == 0) goto L377
            java.lang.String r3 = "\n没有地块数据"
            r2.append(r3)
            goto L536
        L377:
            kd1 r3 = p000.kd1.f5861
            java.util.List r3 = r3.m3202()
            r6 = 10
            int r4 = p000.AbstractC1021yh.m6889(r3, r6)
            int r4 = p000.ex0.m1970(r4)
            r14 = 16
            if (r4 >= r14) goto L38d
            r10 = r14
            goto L38e
        L38d:
            r10 = r4
        L38e:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r10)
            java.util.Iterator r3 = r3.iterator()
        L397:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L3ae
            java.lang.Object r5 = r3.next()
            r8 = r5
            id1 r8 = (p000.id1) r8
            int r8 = r8.f5015
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r4.put(r8, r5)
            goto L397
        L3ae:
            java.util.Iterator r3 = r12.iterator()
            r5 = 0
        L3b3:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L536
            java.lang.Object r8 = r3.next()
            int r10 = r5 + 1
            if (r5 < 0) goto L532
            lc1 r8 = (p000.lc1) r8
            mc1 r5 = r8.f6546
            java.lang.Integer r11 = r8.f6553
            int r5 = r5.ordinal()
            if (r5 == 0) goto L3f0
            r12 = 1
            if (r5 == r12) goto L3ea
            r12 = 2
            if (r5 == r12) goto L3e5
            r14 = 3
            if (r5 == r14) goto L3e1
            r15 = 4
            if (r5 != r15) goto L3db
            r5 = r13
            goto L3f5
        L3db:
            p000.C1080.m7272()
            r4 = 0
            goto L573
        L3e1:
            r15 = 4
            java.lang.String r5 = "已成熟"
            goto L3f5
        L3e5:
            r14 = 3
            r15 = 4
            java.lang.String r5 = "生长中"
            goto L3f5
        L3ea:
            r12 = 2
            r14 = 3
            r15 = 4
            java.lang.String r5 = "空闲"
            goto L3f5
        L3f0:
            r12 = 2
            r14 = 3
            r15 = 4
            java.lang.String r5 = "锁定"
        L3f5:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r12 = "\n地块 "
            r6.<init>(r12)
            r6.append(r10)
            java.lang.String r12 = " · "
            r6.append(r12)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r2.append(r5)
            java.lang.Integer r5 = r8.f6552
            if (r5 != 0) goto L414
            if (r11 == 0) goto L435
        L414:
            java.lang.String r6 = "?"
            if (r5 != 0) goto L419
            r5 = r6
        L419:
            if (r11 != 0) goto L41c
            r11 = r6
        L41c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r12 = " · 坐标 "
            r6.<init>(r12)
            r6.append(r5)
            java.lang.String r5 = ","
            r6.append(r5)
            r6.append(r11)
            java.lang.String r5 = r6.toString()
            r2.append(r5)
        L435:
            java.lang.String r5 = r8.f6544
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r11 = "\n  标识："
            r6.<init>(r11)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r2.append(r5)
            java.lang.Integer r5 = r8.f6547
            if (r5 == 0) goto L49f
            int r6 = r5.intValue()
            if (r6 <= 0) goto L453
            goto L455
        L453:
            r5 = r19
        L455:
            if (r5 == 0) goto L49f
            int r6 = r5.intValue()
            java.lang.Object r5 = r4.get(r5)
            id1 r5 = (p000.id1) r5
            if (r5 == 0) goto L478
            java.lang.String r5 = r5.f5016
            if (r5 == 0) goto L478
            java.lang.CharSequence r5 = p000.q02.m4660(r5)
            java.lang.String r5 = r5.toString()
            if (r5 == 0) goto L478
            int r11 = r5.length()
            if (r11 <= 0) goto L478
            goto L47a
        L478:
            r5 = r19
        L47a:
            if (r5 == 0) goto L496
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r5)
            java.lang.String r5 = "（#"
            r11.append(r5)
            r11.append(r6)
            java.lang.String r5 = "）"
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            goto L4a1
        L496:
            java.lang.String r5 = "种子 #"
            java.lang.String r11 = "（名称待获取）"
            java.lang.String r5 = p000.AbstractC0602nx.m4127(r5, r6, r11)
            goto L4a1
        L49f:
            java.lang.String r5 = "无"
        L4a1:
            java.lang.Integer r6 = r8.f6545
            if (r6 != 0) goto L4a6
            r6 = r13
        L4a6:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "\n  种子："
            r11.<init>(r12)
            r11.append(r5)
            java.lang.String r5 = " · 物品："
            r11.append(r5)
            r11.append(r6)
            java.lang.String r5 = r11.toString()
            r2.append(r5)
            java.lang.Long r5 = r8.f6548
            java.lang.String r5 = p000.xn0.m6697(r5)
            java.lang.String r6 = "\n  播种："
            java.lang.String r5 = r6.concat(r5)
            r2.append(r5)
            java.lang.Long r5 = r8.f6549
            java.lang.String r5 = p000.xn0.m6697(r5)
            java.lang.String r6 = "\n  成熟："
            java.lang.String r5 = r6.concat(r5)
            r2.append(r5)
            java.lang.Long r5 = r8.f6554
            if (r5 != 0) goto L4e2
            r5 = r13
        L4e2:
            long r11 = r8.f6550
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r14 = "\n  生长时长："
            r6.<init>(r14)
            r6.append(r5)
            java.lang.String r5 = " 秒 · 浇水节省："
            r6.append(r5)
            r6.append(r11)
            java.lang.String r5 = " 秒"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r2.append(r5)
            java.lang.Integer r5 = r8.f6555
            if (r5 != 0) goto L507
            r5 = r13
        L507:
            java.lang.Long r6 = r8.f6556
            java.lang.String r6 = p000.xn0.m6697(r6)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "\n  已浇次数："
            r11.<init>(r12)
            r11.append(r5)
            java.lang.String r5 = " · 最近浇水："
            r11.append(r5)
            r11.append(r6)
            java.lang.String r5 = r11.toString()
            r2.append(r5)
            boolean r5 = r8.f6551
            if (r5 == 0) goto L52f
            java.lang.String r5 = "\n  当前作物为双倍收益"
            r2.append(r5)
        L52f:
            r5 = r10
            goto L3b3
        L532:
            p000.AbstractC1021yh.m6917()
            throw r19
        L536:
            java.lang.String r2 = r2.toString()
            r9.setText(r2)
            int r2 = p000.xn0.m6721(r17)
            r9.setTextColor(r2)
            r2 = 2131296383(0x7f09007f, float:1.8210681E38)
            android.view.View r3 = r1.findViewById(r2)
            android.widget.TextView r3 = (android.widget.TextView) r3
            int r4 = p000.xn0.m6721(r17)
            r3.setTextColor(r4)
            android.view.View r1 = r1.findViewById(r2)
            sa r2 = new sa
            r6 = 10
            r2.<init>(r7, r6)
            r1.setOnClickListener(r2)
            r7.show()
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 1064011039(0x3f6b851f, float:0.92)
            p000.xn0.m6716(r0, r7, r2, r1)
            r4 = 1
        L573:
            return r4
        L574:
            com.example.dyhelper.ui.AboutActivity r0 = (com.example.dyhelper.p002ui.AboutActivity) r0
            κ r5 = (p000.C1087) r5
            int r1 = com.example.dyhelper.p002ui.AboutActivity.f2435
            java.lang.String r1 = r5.f13403
            java.lang.String r2 = r5.f13404
            java.lang.String r3 = ": "
            java.lang.String r1 = p000.lz1.m3688(r1, r3, r2)
            java.lang.String r2 = "clipboard"
            java.lang.Object r2 = r0.getSystemService(r2)
            r2.getClass()
            android.content.ClipboardManager r2 = (android.content.ClipboardManager) r2
            java.lang.String r3 = "DYHelper"
            android.content.ClipData r3 = android.content.ClipData.newPlainText(r3, r1)
            r2.setPrimaryClip(r3)
            java.lang.String r2 = "已复制: "
            java.lang.String r1 = r2.concat(r1)
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            r16 = 1
            return r16
    }
}
