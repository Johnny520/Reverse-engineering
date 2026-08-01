package p000;

/* JADX INFO: renamed from: a9 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0010a9 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f137;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f138;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f139;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f140;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.Object f141;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ java.lang.Object f142;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ java.lang.Object f143;

    /* JADX INFO: renamed from: μ */
    public final /* synthetic */ java.lang.Object f144;

    public /* synthetic */ C0010a9(android.app.Activity r2, android.app.AlertDialog r3, android.widget.LinearLayout r4, p000.C0384i5 r5, p000.a80 r6, java.lang.String r7, java.lang.String r8) {
            r1 = this;
            r0 = 0
            r1.f137 = r0
            r1.<init>()
            r1.f138 = r2
            r1.f139 = r3
            r1.f140 = r4
            r1.f141 = r5
            r1.f142 = r6
            r1.f143 = r7
            r1.f144 = r8
            return
    }

    public /* synthetic */ C0010a9(java.lang.String r2, p000.eh0 r3, java.util.List r4, p000.mh0 r5, p000.ih0 r6, p000.C0568n r7, p000.C1085 r8) {
            r1 = this;
            r0 = 2
            r1.f137 = r0
            r1.<init>()
            r1.f143 = r2
            r1.f138 = r3
            r1.f139 = r4
            r1.f140 = r5
            r1.f141 = r6
            r1.f142 = r7
            r1.f144 = r8
            return
    }

    public /* synthetic */ C0010a9(p000.um1 r2, android.app.Activity r3, android.widget.EditText r4, android.widget.EditText r5, android.widget.TextView r6, android.widget.TextView r7, android.widget.TextView r8) {
            r1 = this;
            r0 = 1
            r1.f137 = r0
            r1.<init>()
            r1.f139 = r4
            r1.f138 = r3
            r1.f140 = r5
            r1.f141 = r2
            r1.f142 = r6
            r1.f143 = r7
            r1.f144 = r8
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r59) {
            r58 = this;
            r0 = r58
            int r1 = r0.f137
            switch(r1) {
                case 0: goto Lea3;
                case 1: goto Le55;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f143
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r0.f138
            r4 = r3
            eh0 r4 = (p000.eh0) r4
            java.lang.Object r3 = r0.f139
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r5 = r0.f140
            mh0 r5 = (p000.mh0) r5
            java.lang.Object r6 = r0.f141
            ih0 r6 = (p000.ih0) r6
            java.lang.Object r7 = r0.f142
            r10 = r7
            n r10 = (p000.C0568n) r10
            java.lang.Object r0 = r0.f144
            r9 = r0
            θ r9 = (p000.C1085) r9
            r11 = r59
            java.io.Writer r11 = (java.io.Writer) r11
            r11.getClass()
            nh0 r0 = p000.nh0.f7619
            int r0 = r3.size()
            hh0 r3 = r6.f5087
            int r3 = r3.ordinal()
            java.lang.String r14 = "getContent"
            java.lang.String r7 = "已导出 "
            java.lang.String r8 = "直播分享"
            r58 = 0
            java.lang.String r16 = ""
            java.lang.String r2 = "text"
            java.lang.String r12 = "getLocalReferenceInfo"
            java.lang.String r15 = "getReferenceInfo"
            java.lang.String r13 = "getAttachments"
            r18 = r10
            java.lang.String r10 = "getSubType"
            r19 = r1
            java.lang.String r1 = "getMsgType"
            r20 = r2
            java.lang.String r2 = "getSender"
            r21 = r12
            java.lang.String r12 = "getCreatedAt"
            r22 = r15
            java.lang.String r15 = "正在导出 "
            r23 = 0
            r25 = r13
            r13 = 1
            if (r3 == 0) goto L9cf
            if (r3 != r13) goto L9c8
            java.util.ArrayList r3 = r4.f3560
            java.util.Iterator r3 = r3.iterator()
            r13 = 0
        L6f:
            boolean r19 = r3.hasNext()
            if (r19 == 0) goto L89
            java.lang.Object r19 = r3.next()
            r27 = r3
            r3 = r19
            dh0 r3 = (p000.dh0) r3
            java.util.List r3 = r3.f3162
            int r3 = r3.size()
            int r13 = r13 + r3
            r3 = r27
            goto L6f
        L89:
            long r27 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = "DYHelper 聊天记录"
            java.lang.Appendable r3 = r11.append(r3)
            r29 = r14
            r14 = 10
            r3.append(r14)
            java.lang.String r3 = p000.nh0.m4055(r27)
            java.lang.String r14 = "导出时间："
            java.lang.String r3 = r14.concat(r3)
            java.lang.Appendable r3 = r11.append(r3)
            r14 = 10
            r3.append(r14)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r14 = "消息数量："
            r3.<init>(r14)
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            java.lang.Appendable r3 = r11.append(r3)
            r14 = 10
            r3.append(r14)
            if (r0 == r13) goto Le2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r14 = "日期筛选前："
            r3.<init>(r14)
            r3.append(r0)
            java.lang.String r0 = " 条"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.Appendable r0 = r11.append(r0)
            r14 = 10
            r0.append(r14)
        Le2:
            java.lang.Long r0 = r4.f3558
            java.lang.String r3 = "yyyy年MM月"
            r14 = r7
            r27 = r8
            if (r0 == 0) goto L105
            long r7 = r0.longValue()
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            r28 = r9
            java.util.Locale r9 = java.util.Locale.CHINA
            r0.<init>(r3, r9)
            java.util.Date r9 = new java.util.Date
            r9.<init>(r7)
            java.lang.String r0 = r0.format(r9)
            r0.getClass()
            goto L109
        L105:
            r28 = r9
            r0 = r58
        L109:
            java.lang.Long r7 = r4.f3559
            if (r7 == 0) goto L127
            long r7 = r7.longValue()
            java.text.SimpleDateFormat r9 = new java.text.SimpleDateFormat
            r30 = r13
            java.util.Locale r13 = java.util.Locale.CHINA
            r9.<init>(r3, r13)
            java.util.Date r3 = new java.util.Date
            r3.<init>(r7)
            java.lang.String r3 = r9.format(r3)
            r3.getClass()
            goto L12b
        L127:
            r30 = r13
            r3 = r58
        L12b:
            java.lang.String r7 = " 至 "
            if (r0 == 0) goto L13e
            if (r3 != 0) goto L132
            goto L13e
        L132:
            boolean r8 = r0.equals(r3)
            if (r8 == 0) goto L139
            goto L140
        L139:
            java.lang.String r0 = p000.lz1.m3688(r0, r7, r3)
            goto L140
        L13e:
            java.lang.String r0 = "没有可识别的消息时间"
        L140:
            java.lang.String r3 = "聊天时间："
            java.lang.String r0 = r3.concat(r0)
            java.lang.Appendable r0 = r11.append(r0)
            r3 = 10
            r0.append(r3)
            boolean r0 = r6.f5084
            if (r0 == 0) goto L156
            java.lang.String r0 = "完整聊天记录"
            goto L158
        L156:
            java.lang.String r0 = "当前聊天页已显示的消息"
        L158:
            java.lang.Long r3 = r6.f5085
            if (r3 == 0) goto L165
            long r8 = r3.longValue()
            java.lang.String r3 = p000.nh0.m4055(r8)
            goto L167
        L165:
            r3 = r58
        L167:
            java.lang.Long r6 = r6.f5086
            if (r6 == 0) goto L174
            long r8 = r6.longValue()
            java.lang.String r6 = p000.nh0.m4055(r8)
            goto L176
        L174:
            r6 = r58
        L176:
            if (r3 != 0) goto L17b
            if (r6 != 0) goto L17b
            goto L19d
        L17b:
            if (r3 != 0) goto L17f
            java.lang.String r3 = "最早"
        L17f:
            if (r6 != 0) goto L183
            java.lang.String r6 = "最新"
        L183:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            java.lang.String r0 = "，"
            r8.append(r0)
            r8.append(r3)
            r8.append(r7)
            r8.append(r6)
            java.lang.String r0 = r8.toString()
        L19d:
            java.lang.String r3 = "范围："
            java.lang.String r0 = r3.concat(r0)
            java.lang.Appendable r0 = r11.append(r0)
            r3 = 10
            r0.append(r3)
            java.lang.String r0 = r5.f7134
            java.lang.String r5 = "结果："
            java.lang.String r0 = r5.concat(r0)
            java.lang.Appendable r0 = r11.append(r0)
            r0.append(r3)
            r11.append(r3)
            java.util.ArrayList r0 = p000.e72.f3439     // Catch: java.lang.Throwable -> L1c7
            long r5 = p000.e72.f3437     // Catch: java.lang.Throwable -> L1c7
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L1c7
            goto L1ce
        L1c7:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L1ce:
            java.lang.Long r3 = java.lang.Long.valueOf(r23)
            boolean r5 = r0 instanceof p000.eo1
            if (r5 == 0) goto L1d7
            r0 = r3
        L1d7:
            java.lang.Number r0 = (java.lang.Number) r0
            long r35 = r0.longValue()
            java.util.ArrayList r0 = r4.f3560
            java.util.Iterator r3 = r0.iterator()
            r7 = 0
        L1e4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L9bf
            java.lang.Object r0 = r3.next()
            int r13 = r7 + 1
            if (r7 < 0) goto L9bb
            r5 = r0
            dh0 r5 = (p000.dh0) r5
            java.lang.String r6 = r5.f3161
            java.lang.String r8 = p000.lz1.m3687(r15, r6)
            r9 = r28
            r28 = r13
            r13 = r14
            r14 = r27
            r27 = r3
            r3 = r5
            r5 = r30
            p000.nh0.m4066(r4, r5, r6, r7, r8, r9)
            java.lang.String r0 = r3.f3161
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "========== "
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r0 = " =========="
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.Appendable r0 = r11.append(r0)
            r6 = 10
            r0.append(r6)
            r11.append(r6)
            java.util.List r0 = r3.f3162
            java.util.Iterator r6 = r0.iterator()
        L231:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L97f
            java.lang.Object r0 = r6.next()
            r18.m3924()
            long r7 = p000.nh0.m4049(r0, r12)
            long r7 = p000.nh0.m4061(r7)
            ph0 r31 = new ph0
            int r30 = (r7 > r23 ? 1 : (r7 == r23 ? 0 : -1))
            if (r30 <= 0) goto L253
            java.lang.String r7 = p000.nh0.m4055(r7)
        L250:
            r32 = r7
            goto L256
        L253:
            java.lang.String r7 = "时间未知"
            goto L250
        L256:
            long r33 = p000.nh0.m4049(r0, r2)
            int r37 = p000.nh0.m4048(r0, r1)
            int r38 = p000.nh0.m4048(r0, r10)
            r7 = r29
            java.lang.String r8 = p000.nh0.m4051(r0, r7)     // Catch: java.lang.Throwable -> L273
            boolean r29 = p000.q02.m4671(r8)     // Catch: java.lang.Throwable -> L273
            if (r29 != 0) goto L273
            r39 = r8
        L270:
            r8 = r25
            goto L276
        L273:
            r39 = r16
            goto L270
        L276:
            java.lang.Object r25 = p000.nh0.m4046(r0, r8)
            boolean r40 = p000.nh0.m4058(r25)
            r25 = r10
            r10 = r22
            java.lang.Object r22 = p000.nh0.m4046(r0, r10)
            boolean r22 = p000.nh0.m4058(r22)
            if (r22 != 0) goto L29e
            r22 = r10
            r10 = r21
            java.lang.Object r0 = p000.nh0.m4046(r0, r10)
            boolean r0 = p000.nh0.m4058(r0)
            if (r0 == 0) goto L29b
            goto L2a2
        L29b:
            r41 = 0
            goto L2a4
        L29e:
            r22 = r10
            r10 = r21
        L2a2:
            r41 = 1
        L2a4:
            r31.<init>(r32, r33, r35, r37, r38, r39, r40, r41)
            r21 = r4
            r4 = r37
            boolean r0 = p000.q02.m4671(r39)
            if (r0 == 0) goto L2b6
            r0 = r58
            r30 = r5
            goto L2d9
        L2b6:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2c6
            r30 = r5
            r5 = r39
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L2c2
            r39 = r5
            goto L2d1
        L2c2:
            r0 = move-exception
            r39 = r5
            goto L2cb
        L2c6:
            r0 = move-exception
            r30 = r5
            r5 = r39
        L2cb:
            eo1 r5 = new eo1
            r5.<init>(r0)
            r0 = r5
        L2d1:
            boolean r5 = r0 instanceof p000.eo1
            if (r5 == 0) goto L2d7
            r0 = r58
        L2d7:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
        L2d9:
            java.lang.String r5 = "内容："
            r29 = r6
            java.lang.String r6 = "文字消息"
            if (r0 != 0) goto L313
            java.lang.String r0 = p000.h62.m2362(r39)
            boolean r32 = p000.q02.m4671(r0)
            if (r32 != 0) goto L2fb
            r32 = r7
            oh0 r7 = new oh0
            java.lang.String r0 = r5.concat(r0)
            java.util.List r0 = p000.AbstractC1021yh.m6896(r0)
            r7.<init>(r6, r0)
            goto L301
        L2fb:
            r32 = r7
            oh0 r7 = p000.h62.m2421(r31)
        L301:
            r40 = r1
            r41 = r2
            r37 = r8
            r38 = r9
            r39 = r10
            r42 = r12
        L30d:
            r33 = r14
            r1 = r20
            goto L8d5
        L313:
            r32 = r7
            java.lang.String r7 = "此消息没有可显示的文字内容"
            r33 = r6
            java.lang.String r6 = "tips"
            r34 = r7
            java.lang.String r7 = "name"
            r37 = r8
            java.lang.String r8 = "push_detail"
            r38 = r9
            java.lang.String r9 = "description"
            r39 = r10
            r10 = 1
            if (r4 == r10) goto L75e
            java.lang.String r10 = "msgHint"
            r40 = r1
            r1 = 5
            if (r4 == r1) goto L72c
            r1 = 17
            r41 = r2
            java.lang.String r2 = "时长："
            r42 = r12
            java.lang.String r12 = "duration"
            if (r4 == r1) goto L6e3
            r1 = 21
            if (r4 == r1) goto L6a6
            r1 = 30
            if (r4 == r1) goto L653
            r1 = 77
            if (r4 == r1) goto L470
            r2 = 90
            java.lang.String r12 = "title"
            if (r4 == r2) goto L554
            r2 = 105(0x69, float:1.47E-43)
            if (r4 == r2) goto L506
            r2 = 110(0x6e, float:1.54E-43)
            if (r4 == r2) goto L4ab
            r2 = 168(0xa8, float:2.35E-43)
            if (r4 == r2) goto L470
            r2 = 7
            if (r4 == r2) goto L474
            r2 = 8
            if (r4 == r2) goto L470
            java.lang.String r1 = "desc"
            switch(r4) {
                case 25: goto L437;
                case 26: goto L3fe;
                case 27: goto L3ac;
                default: goto L369;
            }
        L369:
            java.lang.String r56 = "danmaku_text"
            java.lang.String r57 = "ai_audio_text"
            java.lang.String r43 = "text"
            java.lang.String r44 = "tips"
            java.lang.String r45 = "title"
            java.lang.String r46 = "sub_title"
            java.lang.String r47 = "content_title"
            java.lang.String r48 = "description"
            java.lang.String r49 = "desc"
            java.lang.String r50 = "push_detail"
            java.lang.String r51 = "msgHint"
            java.lang.String r52 = "hint"
            java.lang.String r53 = "display_name"
            java.lang.String r54 = "name"
            java.lang.String r55 = "comment"
            java.lang.String[] r1 = new java.lang.String[]{r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57}
            java.lang.String r0 = p000.h62.m2376(r0, r1)
            boolean r1 = p000.q02.m4671(r0)
            if (r1 != 0) goto L3a5
            oh0 r1 = new oh0
            java.lang.String r0 = r5.concat(r0)
            java.util.List r0 = p000.AbstractC1021yh.m6896(r0)
            java.lang.String r2 = "消息"
            r1.<init>(r2, r0)
            goto L3a9
        L3a5:
            oh0 r1 = p000.h62.m2421(r31)
        L3a9:
            r7 = r1
            goto L30d
        L3ac:
            java.lang.String r1 = "cover_width"
            int r1 = r0.optInt(r1)
            java.lang.String r2 = "cover_height"
            int r2 = r0.optInt(r2)
            java.lang.String r5 = "is_long_pic"
            boolean r0 = r0.optBoolean(r5)
            if (r0 == 0) goto L3c3
            java.lang.String r0 = "长图"
            goto L3c5
        L3c3:
            java.lang.String r0 = "图片"
        L3c5:
            if (r1 <= 0) goto L3d2
            if (r2 <= 0) goto L3d2
            java.lang.String r5 = "图片尺寸："
            java.lang.String r6 = " × "
            java.lang.String r1 = p000.AbstractC0602nx.m4125(r1, r2, r5, r6)
            goto L3d4
        L3d2:
            r1 = r16
        L3d4:
            java.util.List r1 = p000.AbstractC1021yh.m6896(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L3e1:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L3f8
            java.lang.Object r5 = r1.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = p000.q02.m4671(r6)
            if (r6 != 0) goto L3e1
            r2.add(r5)
            goto L3e1
        L3f8:
            oh0 r1 = new oh0
            r1.<init>(r0, r2)
            goto L3a9
        L3fe:
            java.lang.String[] r2 = new java.lang.String[]{r12}
            java.lang.String r2 = p000.h62.m2376(r0, r2)
            java.lang.String r5 = "标题"
            java.lang.String r2 = p000.h62.m2435(r5, r2)
            java.lang.String[] r1 = new java.lang.String[]{r1, r9}
            java.lang.String r0 = p000.h62.m2376(r0, r1)
            java.lang.String r1 = "说明"
            java.lang.String r0 = p000.h62.m2435(r1, r0)
            java.lang.String[] r0 = new java.lang.String[]{r2, r0}
            java.util.List r0 = p000.h62.m2366(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L42e
            java.lang.String r0 = "分享了一个活动卡片"
            java.util.List r0 = p000.AbstractC1021yh.m6896(r0)
        L42e:
            oh0 r1 = new oh0
            java.lang.String r2 = "活动卡片"
            r1.<init>(r2, r0)
            goto L3a9
        L437:
            java.lang.String[] r2 = new java.lang.String[]{r7, r8}
            java.lang.String r2 = p000.h62.m2376(r0, r2)
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.lang.String r0 = p000.h62.m2376(r0, r1)
            java.lang.String r1 = "用户"
            java.lang.String r1 = p000.h62.m2435(r1, r2)
            java.lang.String r2 = "抖音号"
            java.lang.String r0 = p000.h62.m2435(r2, r0)
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.util.List r0 = p000.h62.m2366(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L467
            java.lang.String r0 = "分享了一个用户主页"
            java.util.List r0 = p000.AbstractC1021yh.m6896(r0)
        L467:
            oh0 r1 = new oh0
            java.lang.String r2 = "用户名片"
            r1.<init>(r2, r0)
            goto L3a9
        L470:
            r7 = r20
            goto L587
        L474:
            r7 = r20
            java.lang.String[] r1 = new java.lang.String[]{r7, r6, r9, r10}
            java.lang.String r1 = p000.h62.m2376(r0, r1)
            java.lang.String r2 = "aweType"
            int r0 = r0.optInt(r2)
            r2 = 716(0x2cc, float:1.003E-42)
            if (r0 != r2) goto L48b
            java.lang.String r6 = "精灵消息"
            goto L48d
        L48b:
            r6 = r33
        L48d:
            oh0 r0 = new oh0
            boolean r2 = p000.q02.m4671(r1)
            if (r2 == 0) goto L49a
            java.util.List r1 = p000.AbstractC1021yh.m6896(r34)
            goto L4a2
        L49a:
            java.lang.String r1 = r5.concat(r1)
            java.util.List r1 = p000.AbstractC1021yh.m6896(r1)
        L4a2:
            r0.<init>(r6, r1)
        L4a5:
            r1 = r7
            r33 = r14
            r7 = r0
            goto L8d5
        L4ab:
            r7 = r20
            java.lang.String[] r1 = new java.lang.String[]{r9, r8, r10}
            java.lang.String r1 = p000.h62.m2376(r0, r1)
            java.lang.String[] r2 = new java.lang.String[]{r8}
            java.lang.String r0 = p000.h62.m2376(r0, r2)
            java.lang.String r2 = "分享"
            r5 = 0
            boolean r6 = p000.q02.m4654(r1, r2, r5)
            if (r6 != 0) goto L4e2
            boolean r2 = p000.q02.m4654(r0, r2, r5)
            if (r2 == 0) goto L4cd
            goto L4e2
        L4cd:
            java.lang.String r2 = "喂食"
            boolean r6 = p000.q02.m4654(r1, r2, r5)
            if (r6 != 0) goto L4df
            boolean r2 = p000.q02.m4654(r0, r2, r5)
            if (r2 == 0) goto L4dc
            goto L4df
        L4dc:
            java.lang.String r2 = "互动卡片"
            goto L4e4
        L4df:
            java.lang.String r2 = "互动提醒"
            goto L4e4
        L4e2:
            java.lang.String r2 = "分享卡片"
        L4e4:
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.util.List r0 = p000.h62.m2366(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L4f8
            java.lang.String r0 = "收到一条互动提醒"
            java.util.List r0 = p000.AbstractC1021yh.m6896(r0)
        L4f8:
            oh0 r1 = new oh0
            r1.<init>(r2, r0)
        L4fd:
            r33 = r7
            r7 = r1
            r1 = r33
            r33 = r14
            goto L8d5
        L506:
            r7 = r20
            java.lang.String r1 = "comment_user_name"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.lang.String r1 = p000.h62.m2376(r0, r1)
            java.lang.String r2 = "评论者"
            java.lang.String r1 = p000.h62.m2435(r2, r1)
            java.lang.String r2 = "comment"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            java.lang.String r2 = p000.h62.m2376(r0, r2)
            java.lang.String r5 = "评论内容"
            java.lang.String r2 = p000.h62.m2435(r5, r2)
            java.lang.String r5 = "aweme_title"
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.lang.String r0 = p000.h62.m2376(r0, r5)
            java.lang.String r5 = "来自作品"
            java.lang.String r0 = p000.h62.m2435(r5, r0)
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r0}
            java.util.List r0 = p000.h62.m2366(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L54c
            java.lang.String r0 = "分享了一条评论"
            java.util.List r0 = p000.AbstractC1021yh.m6896(r0)
        L54c:
            oh0 r1 = new oh0
            java.lang.String r2 = "评论分享"
            r1.<init>(r2, r0)
            goto L4fd
        L554:
            r7 = r20
            java.lang.String r1 = "hint"
            java.lang.String[] r1 = new java.lang.String[]{r12, r1}
            java.lang.String r1 = p000.h62.m2376(r0, r1)
            java.lang.String r2 = "sub_title"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            java.lang.String r0 = p000.h62.m2376(r0, r2)
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.util.List r0 = p000.h62.m2366(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L57e
            java.lang.String r0 = "邀请你一起观看"
            java.util.List r0 = p000.AbstractC1021yh.m6896(r0)
        L57e:
            oh0 r1 = new oh0
            java.lang.String r2 = "一起看邀请"
            r1.<init>(r2, r0)
            goto L4fd
        L587:
            java.lang.String r2 = "image_count"
            int r2 = r0.optInt(r2)
            if (r4 == r1) goto L59d
            if (r2 > 0) goto L59d
            java.lang.String r1 = "is_text"
            int r1 = r0.optInt(r1)
            r2 = 1
            if (r1 != r2) goto L59b
            goto L59e
        L59b:
            r1 = 0
            goto L59f
        L59d:
            r2 = 1
        L59e:
            r1 = r2
        L59f:
            if (r1 == 0) goto L5a4
            java.lang.String r5 = "图文分享"
            goto L5b1
        L5a4:
            java.lang.String r5 = "is_live_photo"
            int r5 = r0.optInt(r5)
            if (r5 != r2) goto L5af
            java.lang.String r5 = "实况作品分享"
            goto L5b1
        L5af:
            java.lang.String r5 = "视频分享"
        L5b1:
            java.lang.String r2 = "content_name"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            java.lang.String r2 = p000.h62.m2376(r0, r2)
            java.lang.String r6 = "作者"
            java.lang.String r2 = p000.h62.m2435(r6, r2)
            java.lang.String r6 = "content_title"
            java.lang.String r8 = "photosMsgHint"
            java.lang.String[] r6 = new java.lang.String[]{r6, r8, r10}
            java.lang.String r6 = p000.h62.m2376(r0, r6)
            java.lang.String r8 = "作品内容"
            java.lang.String r6 = p000.h62.m2435(r8, r6)
            java.lang.String r8 = "item_id"
            java.lang.String r9 = "aweme_id"
            java.lang.String r10 = "itemId"
            java.lang.String[] r8 = new java.lang.String[]{r10, r8, r9}
            java.lang.String r8 = p000.h62.m2374(r0, r8)
            java.lang.String r9 = "share_id"
            java.lang.String[] r9 = new java.lang.String[]{r9}
            java.lang.String r0 = p000.h62.m2374(r0, r9)
            boolean r9 = p000.q02.m4671(r8)
            if (r9 == 0) goto L61a
            r8 = 95
            java.lang.String r0 = p000.q02.m4687(r0, r8, r0)
            boolean r8 = p000.q02.m4671(r0)
            if (r8 != 0) goto L612
            r8 = 0
        L5fe:
            int r9 = r0.length()
            if (r8 >= r9) goto L614
            char r9 = r0.charAt(r8)
            boolean r9 = java.lang.Character.isDigit(r9)
            if (r9 != 0) goto L60f
            goto L612
        L60f:
            int r8 = r8 + 1
            goto L5fe
        L612:
            r0 = r58
        L614:
            if (r0 != 0) goto L619
            r8 = r16
            goto L61a
        L619:
            r8 = r0
        L61a:
            boolean r0 = p000.q02.m4671(r8)
            if (r0 == 0) goto L623
            r0 = r16
            goto L632
        L623:
            if (r1 == 0) goto L628
            java.lang.String r0 = "note"
            goto L62a
        L628:
            java.lang.String r0 = "video"
        L62a:
            java.lang.String r1 = "https://www.douyin.com/"
            java.lang.String r9 = "/"
            java.lang.String r0 = p000.a12.m18(r1, r0, r9, r8)
        L632:
            java.lang.String r1 = "作品链接"
            java.lang.String r0 = p000.h62.m2435(r1, r0)
            java.lang.String[] r0 = new java.lang.String[]{r2, r6, r0}
            java.util.List r0 = p000.h62.m2366(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L64c
            java.lang.String r0 = "分享了一个抖音作品"
            java.util.List r0 = p000.AbstractC1021yh.m6896(r0)
        L64c:
            oh0 r1 = new oh0
            r1.<init>(r5, r0)
            goto L4fd
        L653:
            r7 = r20
            java.lang.String r0 = r0.optString(r12)
            r0.getClass()
            java.lang.Double r0 = p000.w02.m6298(r0)
            r5 = 0
            if (r0 == 0) goto L669
            double r0 = r0.doubleValue()
            goto L66a
        L669:
            r0 = r5
        L66a:
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 <= 0) goto L677
            java.lang.String r0 = p000.h62.m2377(r0)
            java.lang.String r0 = r2.concat(r0)
            goto L679
        L677:
            r0 = r16
        L679:
            java.util.List r0 = p000.AbstractC1021yh.m6896(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L686:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L69d
            java.lang.Object r2 = r0.next()
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = p000.q02.m4671(r5)
            if (r5 != 0) goto L686
            r1.add(r2)
            goto L686
        L69d:
            oh0 r0 = new oh0
            java.lang.String r2 = "视频"
            r0.<init>(r2, r1)
            goto L4a5
        L6a6:
            r7 = r20
            java.lang.String r1 = "room_owner_name"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.lang.String r1 = p000.h62.m2376(r0, r1)
            java.lang.String r2 = "主播"
            java.lang.String r1 = p000.h62.m2435(r2, r1)
            java.lang.String r2 = "room_description"
            java.lang.String[] r2 = new java.lang.String[]{r2, r8, r10}
            java.lang.String r0 = p000.h62.m2376(r0, r2)
            java.lang.String r2 = "直播内容"
            java.lang.String r0 = p000.h62.m2435(r2, r0)
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.util.List r0 = p000.h62.m2366(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L6dc
            java.lang.String r0 = "分享了一个直播间"
            java.util.List r0 = p000.AbstractC1021yh.m6896(r0)
        L6dc:
            oh0 r1 = new oh0
            r1.<init>(r14, r0)
            goto L4fd
        L6e3:
            r7 = r20
            long r5 = r0.optLong(r12)
            java.lang.String r1 = "ai_audio_text"
            java.lang.String[] r1 = new java.lang.String[]{r1, r7}
            java.lang.String r0 = p000.h62.m2376(r0, r1)
            int r1 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r1 <= 0) goto L707
            double r5 = (double) r5
            r8 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r5 = r5 / r8
            java.lang.String r1 = p000.h62.m2377(r5)
            java.lang.String r1 = r2.concat(r1)
            goto L709
        L707:
            r1 = r16
        L709:
            java.lang.String r2 = "识别文字"
            java.lang.String r0 = p000.h62.m2435(r2, r0)
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.util.List r0 = p000.h62.m2366(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L723
            java.lang.String r0 = "发送了一条语音"
            java.util.List r0 = p000.AbstractC1021yh.m6896(r0)
        L723:
            oh0 r1 = new oh0
            java.lang.String r2 = "语音消息"
            r1.<init>(r2, r0)
            goto L4fd
        L72c:
            r41 = r2
            r42 = r12
            r7 = r20
            java.lang.String r1 = "activity_desc"
            java.lang.String r2 = "danmaku_text"
            java.lang.String r5 = "display_name"
            java.lang.String r6 = "hint_content"
            java.lang.String[] r1 = new java.lang.String[]{r5, r6, r1, r2, r10}
            java.lang.String r0 = p000.h62.m2376(r0, r1)
            oh0 r1 = new oh0
            boolean r2 = p000.q02.m4671(r0)
            if (r2 == 0) goto L74d
            java.lang.String r0 = "发送了一个表情"
            goto L753
        L74d:
            java.lang.String r2 = "表情："
            java.lang.String r0 = r2.concat(r0)
        L753:
            java.util.List r0 = p000.AbstractC1021yh.m6896(r0)
            java.lang.String r2 = "表情或互动"
            r1.<init>(r2, r0)
            goto L4fd
        L75e:
            r40 = r1
            r41 = r2
            r42 = r12
            r1 = r20
            java.lang.String[] r2 = new java.lang.String[]{r6, r1, r9, r8}
            java.lang.String r2 = p000.h62.m2376(r0, r2)
            java.lang.String r6 = "template"
            org.json.JSONArray r0 = r0.optJSONArray(r6)
            java.lang.String r6 = "}}"
            java.lang.String r8 = "{{"
            if (r0 == 0) goto L7c5
            int r9 = r0.length()
            r10 = 0
        L77f:
            if (r10 >= r9) goto L7c5
            org.json.JSONObject r12 = r0.optJSONObject(r10)
            if (r12 != 0) goto L78c
            r20 = r0
            r33 = r9
            goto L7be
        L78c:
            r20 = r0
            java.lang.String r0 = "key"
            r33 = r9
            r9 = -1
            int r0 = r12.optInt(r0, r9)
            java.lang.String r9 = r12.optString(r7)
            r9.getClass()
            java.lang.String r9 = p000.h62.m2362(r9)
            if (r0 < 0) goto L7be
            boolean r12 = p000.q02.m4671(r9)
            if (r12 != 0) goto L7be
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r8)
            r12.append(r0)
            r12.append(r6)
            java.lang.String r0 = r12.toString()
            java.lang.String r0 = p000.x02.m6483(r2, r0, r9)
            r2 = r0
        L7be:
            int r10 = r10 + 1
            r0 = r20
            r9 = r33
            goto L77f
        L7c5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r7 = r2.length()
            r0.<init>(r7)
            r7 = 0
        L7cf:
            int r9 = r2.length()
            if (r7 >= r9) goto L7e4
            r9 = 0
            r10 = 4
            int r12 = p000.q02.m4669(r2, r8, r7, r9, r10)
            if (r12 >= 0) goto L7e7
            int r6 = r2.length()
            r0.append(r2, r7, r6)
        L7e4:
            r33 = r14
            goto L82f
        L7e7:
            r20 = r8
            int r8 = r12 + 2
            r33 = r14
            int r14 = p000.q02.m4669(r2, r6, r8, r9, r10)
            if (r14 >= 0) goto L7fb
            int r6 = r2.length()
            r0.append(r2, r7, r6)
            goto L82f
        L7fb:
            r0.append(r2, r7, r12)
            java.lang.String r7 = r2.substring(r8, r14)
            int r8 = r7.length()
            if (r8 <= 0) goto L823
            r8 = 0
        L809:
            int r9 = r7.length()
            if (r8 >= r9) goto L81d
            char r9 = r7.charAt(r8)
            boolean r9 = java.lang.Character.isDigit(r9)
            if (r9 != 0) goto L81a
            goto L823
        L81a:
            int r8 = r8 + 1
            goto L809
        L81d:
            java.lang.String r7 = "相关内容"
            r0.append(r7)
            goto L828
        L823:
            int r7 = r14 + 2
            r0.append(r2, r12, r7)
        L828:
            int r7 = r14 + 2
            r8 = r20
            r14 = r33
            goto L7cf
        L82f:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r6 = r0.length()
            r2.<init>(r6)
            r6 = 0
        L83d:
            int r7 = r0.length()
            if (r6 >= r7) goto L8ae
            char r7 = r0.charAt(r6)
            r8 = 32
            if (r7 != r8) goto L8a4
            int r7 = r2.length()
            if (r7 != 0) goto L854
            r7 = r58
            goto L864
        L854:
            int r7 = r2.length()
            r26 = 1
            int r7 = r7 + (-1)
            char r7 = r2.charAt(r7)
            java.lang.Character r7 = java.lang.Character.valueOf(r7)
        L864:
            if (r7 == 0) goto L8a4
            char r7 = r7.charValue()
            r9 = 40960(0xa000, float:5.7397E-41)
            r10 = 19968(0x4e00, float:2.7981E-41)
            r12 = 19904(0x4dc0, float:2.7891E-41)
            r14 = 13312(0x3400, float:1.8654E-41)
            if (r14 > r7) goto L878
            if (r7 >= r12) goto L878
            goto L87c
        L878:
            if (r10 > r7) goto L8a4
            if (r7 >= r9) goto L8a4
        L87c:
            r7 = r6
        L87d:
            int r9 = r0.length()
            if (r7 >= r9) goto L88c
            char r9 = r0.charAt(r7)
            if (r9 != r8) goto L88c
            int r7 = r7 + 1
            goto L87d
        L88c:
            java.lang.Character r8 = p000.q02.m4665(r0, r7)
            if (r8 == 0) goto L8a4
            char r8 = r8.charValue()
            if (r14 > r8) goto L89b
            if (r8 >= r12) goto L89b
            goto L8a2
        L89b:
            if (r10 > r8) goto L8a4
            r9 = 40960(0xa000, float:5.7397E-41)
            if (r8 >= r9) goto L8a4
        L8a2:
            r6 = r7
            goto L83d
        L8a4:
            char r7 = r0.charAt(r6)
            r2.append(r7)
            int r6 = r6 + 1
            goto L83d
        L8ae:
            java.lang.String r0 = r2.toString()
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            oh0 r2 = new oh0
            boolean r6 = p000.q02.m4671(r0)
            if (r6 == 0) goto L8c7
            java.util.List r0 = p000.AbstractC1021yh.m6896(r34)
            goto L8cf
        L8c7:
            java.lang.String r0 = r5.concat(r0)
            java.util.List r0 = p000.AbstractC1021yh.m6896(r0)
        L8cf:
            java.lang.String r5 = "系统提示"
            r2.<init>(r5, r0)
            r7 = r2
        L8d5:
            java.lang.String r0 = r7.f8112
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "["
            r2.<init>(r5)
            r5 = r31
            java.lang.String r6 = r5.f8560
            r2.append(r6)
            java.lang.String r6 = "] "
            r2.append(r6)
            r10 = 1
            if (r4 == r10) goto L906
            long r8 = r5.f8561
            int r4 = (r8 > r23 ? 1 : (r8 == r23 ? 0 : -1))
            if (r4 > 0) goto L8f4
            goto L906
        L8f4:
            r43 = r8
            long r8 = r5.f8562
            int r4 = (r8 > r23 ? 1 : (r8 == r23 ? 0 : -1))
            if (r4 <= 0) goto L903
            int r4 = (r43 > r8 ? 1 : (r43 == r8 ? 0 : -1))
            if (r4 != 0) goto L903
            java.lang.String r4 = "我"
            goto L908
        L903:
            java.lang.String r4 = "对方"
            goto L908
        L906:
            java.lang.String r4 = "系统"
        L908:
            r2.append(r4)
            java.lang.String r4 = " · "
            r2.append(r4)
            r2.append(r0)
            r14 = 10
            r2.append(r14)
            java.util.List r4 = r7.f8113
            java.util.Iterator r4 = r4.iterator()
        L91e:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L931
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            r2.append(r6)
            r2.append(r14)
            goto L91e
        L931:
            boolean r4 = r5.f8566
            if (r4 == 0) goto L942
            java.lang.String r4 = "附件消息"
            boolean r0 = p000.ln0.m3626(r0, r4)
            if (r0 != 0) goto L942
            java.lang.String r0 = "附带文件或媒体附件\n"
            r2.append(r0)
        L942:
            boolean r0 = r5.f8567
            if (r0 == 0) goto L94b
            java.lang.String r0 = "回复或引用了一条消息\n"
            r2.append(r0)
        L94b:
            java.lang.String r0 = r2.toString()
            java.lang.CharSequence r0 = p000.q02.m4662(r0)
            java.lang.String r0 = r0.toString()
            java.lang.Appendable r0 = r11.append(r0)
            r14 = 10
            r0.append(r14)
            r11.append(r14)
            r20 = r1
            r4 = r21
            r10 = r25
            r6 = r29
            r5 = r30
            r29 = r32
            r14 = r33
            r25 = r37
            r9 = r38
            r21 = r39
            r1 = r40
            r2 = r41
            r12 = r42
            goto L231
        L97f:
            r40 = r1
            r41 = r2
            r30 = r5
            r38 = r9
            r42 = r12
            r33 = r14
            r1 = r20
            r39 = r21
            r37 = r25
            r32 = r29
            r14 = 10
            r21 = r4
            r25 = r10
            java.lang.String r6 = r3.f3161
            java.lang.String r8 = p000.lz1.m3687(r13, r6)
            r7 = r28
            r2 = r32
            r3 = r37
            p000.nh0.m4066(r4, r5, r6, r7, r8, r9)
            r29 = r2
            r14 = r13
            r21 = r39
            r1 = r40
            r2 = r41
            r25 = r3
            r28 = r9
            r3 = r27
            r27 = r33
            goto L1e4
        L9bb:
            p000.AbstractC1021yh.m6917()
            throw r58
        L9bf:
            r9 = r28
            r5 = r30
            p000.nh0.m4065(r4, r5, r9)
            goto Le52
        L9c8:
            p000.C1080.m7272()
            r12 = r58
            goto Le54
        L9cf:
            r40 = r1
            r41 = r2
            r13 = r7
            r33 = r8
            r42 = r12
            r2 = r14
            r1 = r20
            r39 = r21
            r3 = r25
            r25 = r10
            java.util.ArrayList r7 = r4.f3560
            java.util.Iterator r8 = r7.iterator()
            r10 = 0
        L9e8:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L9fc
            java.lang.Object r12 = r8.next()
            dh0 r12 = (p000.dh0) r12
            java.util.List r12 = r12.f3162
            int r12 = r12.size()
            int r10 = r10 + r12
            goto L9e8
        L9fc:
            java.lang.Long r8 = r4.f3558
            java.lang.Long r12 = r4.f3559
            int r14 = r7.size()
            r20 = r7
            r21 = r8
            long r7 = java.lang.System.currentTimeMillis()
            r27 = r4
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            r28 = r9
            java.lang.String r9 = "schemaVersion"
            r29 = r12
            r12 = 3
            r4.put(r9, r12)
            java.lang.String r12 = "conversationId"
            r9 = r19
            r4.put(r12, r9)
            java.lang.String r9 = "exportTime"
            r4.put(r9, r7)
            java.lang.String r9 = "exportTimeReadable"
            java.lang.String r7 = p000.nh0.m4055(r7)
            r4.put(r9, r7)
            java.lang.String r7 = "messageCount"
            r4.put(r7, r10)
            java.lang.String r7 = "rawMessageCount"
            r4.put(r7, r0)
            boolean r0 = r6.f5084
            java.lang.Long r7 = r6.f5086
            java.lang.Long r8 = r6.f5085
            if (r0 == 0) goto La47
            java.lang.String r0 = "ChatListLogic#loadOld + getMessageList"
            goto La49
        La47:
            java.lang.String r0 = "ChatListLogic#getMessageList"
        La49:
            java.lang.String r9 = "source"
            r4.put(r9, r0)
            java.lang.String r0 = "fullLoad"
            boolean r6 = r6.f5084
            r4.put(r0, r6)
            java.lang.String r0 = "complete"
            boolean r6 = r5.f7133
            r4.put(r0, r6)
            java.lang.String r0 = "completionNote"
            java.lang.String r5 = r5.f7134
            r4.put(r0, r5)
            if (r21 != 0) goto La68
            java.lang.Object r0 = org.json.JSONObject.NULL
            goto La6a
        La68:
            r0 = r21
        La6a:
            java.lang.String r5 = "earliestMessageTimeMs"
            r4.put(r5, r0)
            if (r29 != 0) goto La74
            java.lang.Object r0 = org.json.JSONObject.NULL
            goto La76
        La74:
            r0 = r29
        La76:
            java.lang.String r5 = "latestMessageTimeMs"
            r4.put(r5, r0)
            if (r21 == 0) goto La86
            long r5 = r21.longValue()
            java.lang.String r0 = p000.nh0.m4055(r5)
            goto La88
        La86:
            java.lang.Object r0 = org.json.JSONObject.NULL
        La88:
            java.lang.String r5 = "earliestMessageTimeReadable"
            r4.put(r5, r0)
            if (r29 == 0) goto La98
            long r5 = r29.longValue()
            java.lang.String r0 = p000.nh0.m4055(r5)
            goto La9a
        La98:
            java.lang.Object r0 = org.json.JSONObject.NULL
        La9a:
            java.lang.String r5 = "latestMessageTimeReadable"
            r4.put(r5, r0)
            java.lang.String r0 = "monthCount"
            r4.put(r0, r14)
            if (r8 != 0) goto Laa9
            java.lang.Object r0 = org.json.JSONObject.NULL
            goto Laaa
        Laa9:
            r0 = r8
        Laaa:
            java.lang.String r5 = "startTimeMs"
            r4.put(r5, r0)
            if (r7 != 0) goto Lab4
            java.lang.Object r0 = org.json.JSONObject.NULL
            goto Lab5
        Lab4:
            r0 = r7
        Lab5:
            java.lang.String r5 = "endTimeMs"
            r4.put(r5, r0)
            if (r8 == 0) goto Lac5
            long r5 = r8.longValue()
            java.lang.String r0 = p000.nh0.m4055(r5)
            goto Lac7
        Lac5:
            java.lang.Object r0 = org.json.JSONObject.NULL
        Lac7:
            java.lang.String r5 = "startTimeReadable"
            r4.put(r5, r0)
            if (r7 == 0) goto Lad7
            long r5 = r7.longValue()
            java.lang.String r0 = p000.nh0.m4055(r5)
            goto Lad9
        Lad7:
            java.lang.Object r0 = org.json.JSONObject.NULL
        Lad9:
            java.lang.String r5 = "endTimeReadable"
            r4.put(r5, r0)
            r0 = 2
            java.lang.String r4 = r4.toString(r0)
            r4.getClass()
            java.lang.String r4 = p000.q02.m4656(r4)
            r11.write(r4)
            java.lang.String r4 = ",\n  \"messages\": ["
            r11.write(r4)
            java.util.Iterator r14 = r20.iterator()
            r7 = 0
            r19 = 0
        Laf9:
            boolean r4 = r14.hasNext()
            java.lang.String r5 = "\n"
            if (r4 == 0) goto Le3f
            java.lang.Object r4 = r14.next()
            int r20 = r7 + 1
            if (r7 < 0) goto Le39
            dh0 r4 = (p000.dh0) r4
            java.lang.String r6 = r4.f3161
            java.lang.String r8 = p000.lz1.m3687(r15, r6)
            r0 = r5
            r5 = r10
            r9 = r28
            r10 = r4
            r4 = r27
            p000.nh0.m4066(r4, r5, r6, r7, r8, r9)
            java.util.List r6 = r10.f3162
            java.util.Iterator r6 = r6.iterator()
            r7 = r19
        Lb23:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto Ldf4
            java.lang.Object r8 = r6.next()
            r18.m3924()
            r27 = r4
            if (r7 <= 0) goto Lb39
            java.lang.String r4 = ","
            r11.write(r4)
        Lb39:
            r11.write(r0)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            r28 = r5
            java.lang.String r5 = "indexInExport"
            r4.put(r5, r7)
            java.lang.Class r5 = r8.getClass()
            java.lang.String r5 = r5.getName()
            r29 = r6
            java.lang.String r6 = "messageClass"
            r4.put(r6, r5)
            r5 = r42
            long r30 = p000.nh0.m4049(r8, r5)
            long r5 = p000.nh0.m4061(r30)
            r19 = r7
            java.lang.String r7 = "getMsgId"
            r31 = r14
            r30 = r15
            long r14 = p000.nh0.m4049(r8, r7)
            java.lang.String r7 = "msgId"
            r4.put(r7, r14)
            java.lang.String r7 = "getUuid"
            java.lang.String r7 = p000.nh0.m4051(r8, r7)
            java.lang.String r14 = "uuid"
            r4.put(r14, r7)
            java.lang.String r7 = "getConversationId"
            java.lang.String r7 = p000.nh0.m4051(r8, r7)
            r4.put(r12, r7)
            java.lang.String r7 = "getConversationShortId"
            long r14 = p000.nh0.m4049(r8, r7)
            java.lang.String r7 = "conversationShortId"
            r4.put(r7, r14)
            java.lang.String r7 = "getConversationType"
            int r7 = p000.nh0.m4048(r8, r7)
            java.lang.String r14 = "conversationType"
            r4.put(r14, r7)
            java.lang.String r7 = "sender"
            r32 = r12
            r15 = r13
            r14 = r41
            long r12 = p000.nh0.m4049(r8, r14)
            r4.put(r7, r12)
            java.lang.String r7 = "getSecSender"
            java.lang.String r7 = p000.nh0.m4051(r8, r7)
            java.lang.String r12 = "secSender"
            r4.put(r12, r7)
            java.lang.String r7 = "createdAt"
            r4.put(r7, r5)
            int r7 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r7 <= 0) goto Lbc3
            java.lang.String r5 = p000.nh0.m4055(r5)
            goto Lbc5
        Lbc3:
            r5 = r16
        Lbc5:
            java.lang.String r6 = "createdAtReadable"
            r4.put(r6, r5)
            r12 = r40
            int r5 = p000.nh0.m4048(r8, r12)
            r13 = r25
            int r6 = p000.nh0.m4048(r8, r13)
            java.lang.String r7 = "msgType"
            r4.put(r7, r5)
            java.lang.String r7 = "subType"
            r4.put(r7, r6)
            r7 = 1
            if (r5 == r7) goto Lc0a
            r12 = 7
            if (r5 == r12) goto Lbf7
            r12 = 21
            if (r5 == r12) goto Lbf4
            r6 = 27
            if (r5 == r6) goto Lbf1
            java.lang.String r5 = "通用消息"
            goto Lc0e
        Lbf1:
            java.lang.String r5 = "图片/媒体消息"
            goto Lc0e
        Lbf4:
            r5 = r33
            goto Lc0e
        Lbf7:
            r12 = 21
            r5 = 700(0x2bc, float:9.81E-43)
            if (r6 == r5) goto Lc07
            r5 = 701(0x2bd, float:9.82E-43)
            if (r6 == r5) goto Lc04
            java.lang.String r5 = "IM文本/通用消息"
            goto Lc0e
        Lc04:
            java.lang.String r5 = "关注打招呼消息"
            goto Lc0e
        Lc07:
            java.lang.String r5 = "文本消息"
            goto Lc0e
        Lc0a:
            r12 = 21
            java.lang.String r5 = "系统/提示消息"
        Lc0e:
            java.lang.String r6 = "msgTypeName"
            r4.put(r6, r5)
            java.lang.String r5 = "getMsgStatus"
            int r5 = p000.nh0.m4048(r8, r5)
            java.lang.String r6 = "msgStatus"
            r4.put(r6, r5)
            java.lang.String r5 = "getReadStatus"
            int r5 = p000.nh0.m4048(r8, r5)
            java.lang.String r6 = "readStatus"
            r4.put(r6, r5)
            java.lang.String r5 = "getDeleted"
            int r5 = p000.nh0.m4048(r8, r5)
            java.lang.String r6 = "deleted"
            r4.put(r6, r5)
            java.lang.String r5 = "getOrderIndex"
            long r5 = p000.nh0.m4049(r8, r5)
            java.lang.String r7 = "orderIndex"
            r4.put(r7, r5)
            java.lang.String r5 = "getIndex"
            long r5 = p000.nh0.m4049(r8, r5)
            java.lang.String r7 = "index"
            r4.put(r7, r5)
            java.lang.String r5 = "getIndexInConversationV2"
            long r5 = p000.nh0.m4049(r8, r5)
            java.lang.String r7 = "indexInConversationV2"
            r4.put(r7, r5)
            java.lang.String r5 = "getVersion"
            long r5 = p000.nh0.m4049(r8, r5)
            java.lang.String r7 = "version"
            r4.put(r7, r5)
            java.lang.String r5 = "getThreadId"
            java.lang.String r5 = p000.nh0.m4051(r8, r5)
            java.lang.String r6 = "threadId"
            r4.put(r6, r5)
            java.lang.String r5 = p000.nh0.m4051(r8, r2)     // Catch: java.lang.Throwable -> Lc76
            boolean r6 = p000.q02.m4671(r5)     // Catch: java.lang.Throwable -> Lc76
            if (r6 != 0) goto Lc76
            goto Lc78
        Lc76:
            r5 = r16
        Lc78:
            java.lang.String r6 = "content"
            r4.put(r6, r5)
            boolean r6 = p000.q02.m4671(r5)
            if (r6 == 0) goto Lc89
            r25 = r2
            r6 = r16
        Lc87:
            r2 = 4
            goto Lcbf
        Lc89:
            java.lang.Object r6 = p000.nh0.m4062(r5)
            if (r6 != 0) goto Lc93
            r25 = r2
            r6 = r5
            goto Lc87
        Lc93:
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            r25 = r2
            r2 = 0
            p000.nh0.m4053(r6, r7, r12, r2)
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto Lcaa
            r7 = r12
        Lcaa:
            r2 = 4
            java.util.List r43 = p000.AbstractC0984xh.m6662(r7, r2)
            r48 = 0
            r49 = 62
            java.lang.String r44 = " | "
            r45 = 0
            r46 = 0
            r47 = 0
            java.lang.String r6 = p000.AbstractC0984xh.m6644(r43, r44, r45, r46, r47, r48, r49)
        Lcbf:
            r4.put(r1, r6)
            boolean r6 = p000.q02.m4671(r5)
            if (r6 == 0) goto Lcce
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            goto Lcd6
        Lcce:
            java.lang.Object r6 = p000.nh0.m4062(r5)
            if (r6 != 0) goto Lcd5
            goto Lcd6
        Lcd5:
            r5 = r6
        Lcd6:
            java.lang.String r6 = "contentJson"
            r4.put(r6, r5)
            java.lang.String r5 = "getExt"
            java.util.Map r5 = p000.nh0.m4050(r8, r5)
            java.lang.String r6 = "ext"
            p000.nh0.m4064(r4, r6, r5)
            java.lang.String r6 = "getLocalExt"
            java.util.Map r6 = p000.nh0.m4050(r8, r6)
            java.lang.String r7 = "localExt"
            p000.nh0.m4064(r4, r7, r6)
            java.lang.String r6 = "getOldExt"
            java.util.Map r6 = p000.nh0.m4050(r8, r6)
            java.lang.String r7 = "oldExt"
            p000.nh0.m4064(r4, r7, r6)
            if (r5 == 0) goto Ld0b
            java.lang.String r6 = "s:is_recalled"
            java.lang.Object r6 = r5.get(r6)
            if (r6 == 0) goto Ld0b
            java.lang.String r6 = r6.toString()
            goto Ld0d
        Ld0b:
            r6 = r58
        Ld0d:
            java.lang.String r7 = "true"
            boolean r6 = p000.ln0.m3626(r6, r7)
            java.lang.String r7 = "isRecalled"
            r4.put(r7, r6)
            if (r5 == 0) goto Ld28
            java.lang.String r6 = "a:recalled_msg_type"
            java.lang.Object r6 = r5.get(r6)
            if (r6 == 0) goto Ld28
            java.lang.String r6 = r6.toString()
            if (r6 != 0) goto Ld2a
        Ld28:
            r6 = r16
        Ld2a:
            java.lang.String r7 = "recalledMsgType"
            r4.put(r7, r6)
            if (r5 == 0) goto Ld3f
            java.lang.String r6 = "s:client_message_id"
            java.lang.Object r6 = r5.get(r6)
            if (r6 == 0) goto Ld3f
            java.lang.String r6 = r6.toString()
            if (r6 != 0) goto Ld41
        Ld3f:
            r6 = r16
        Ld41:
            java.lang.String r7 = "clientMessageId"
            r4.put(r7, r6)
            if (r5 == 0) goto Ld56
            java.lang.String r6 = "s:server_message_create_time"
            java.lang.Object r5 = r5.get(r6)
            if (r5 == 0) goto Ld56
            java.lang.String r5 = r5.toString()
            if (r5 != 0) goto Ld58
        Ld56:
            r5 = r16
        Ld58:
            java.lang.String r6 = "serverCreateTime"
            r4.put(r6, r5)
            java.lang.String r5 = "getLabelListStr"
            java.lang.String r5 = p000.nh0.m4051(r8, r5)
            java.lang.String r6 = "labelListStr"
            r4.put(r6, r5)
            java.lang.String r5 = "getContentUpdateFrom"
            java.lang.String r5 = p000.nh0.m4051(r8, r5)
            java.lang.String r6 = "contentUpdateFrom"
            r4.put(r6, r5)
            java.lang.String r5 = "getPropertyItemListMapString"
            java.lang.String r5 = p000.nh0.m4051(r8, r5)
            java.lang.String r6 = "propertyItemListMapString"
            r4.put(r6, r5)
            java.lang.String r5 = "getPropertyItemListMap"
            java.lang.Object r5 = p000.nh0.m4046(r8, r5)
            r6 = 0
            java.lang.Object r5 = p000.nh0.m4044(r6, r5)
            java.lang.String r7 = "propertyItemListMap"
            r4.put(r7, r5)
            r12 = r22
            java.lang.Object r5 = p000.nh0.m4046(r8, r12)
            java.lang.Object r5 = p000.nh0.m4044(r6, r5)
            java.lang.String r7 = "referenceInfo"
            r4.put(r7, r5)
            r5 = r39
            java.lang.Object r7 = p000.nh0.m4046(r8, r5)
            java.lang.Object r7 = p000.nh0.m4044(r6, r7)
            java.lang.String r2 = "localReferenceInfo"
            r4.put(r2, r7)
            java.lang.Object r2 = p000.nh0.m4046(r8, r3)
            java.lang.Object r2 = p000.nh0.m4044(r6, r2)
            java.lang.String r6 = "attachments"
            r4.put(r6, r2)
            r2 = 2
            java.lang.String r4 = r4.toString(r2)
            r4.getClass()
            f7 r6 = new f7
            r7 = 5
            r6.<init>(r7, r4)
            by1 r4 = new by1
            r4.<init>(r7)
            t52 r8 = new t52
            r8.<init>(r6, r4)
            r4 = 62
            r6 = r58
            java.lang.String r4 = p000.us1.m5955(r8, r0, r6, r4)
            r11.write(r4)
            int r4 = r19 + 1
            r7 = r4
            r41 = r14
            r2 = r25
            r4 = r27
            r5 = r28
            r6 = r29
            r14 = r31
            r12 = r32
            r25 = r13
            r13 = r15
            r15 = r30
            goto Lb23
        Ldf4:
            r6 = r58
            r27 = r4
            r28 = r5
            r19 = r7
            r32 = r12
            r31 = r14
            r30 = r15
            r12 = r22
            r5 = r39
            r14 = r41
            r7 = 5
            r15 = r13
            r13 = r25
            r25 = r2
            r2 = 2
            java.lang.String r0 = r10.f3161
            java.lang.String r8 = p000.lz1.m3687(r15, r0)
            r21 = r5
            r10 = r6
            r17 = r7
            r7 = r20
            r5 = r28
            r26 = 1
            r6 = r0
            p000.nh0.m4066(r4, r5, r6, r7, r8, r9)
            r0 = r2
            r28 = r9
            r58 = r10
            r39 = r21
            r2 = r25
            r14 = r31
            r12 = r32
            r10 = r5
            r25 = r13
            r13 = r15
            r15 = r30
            goto Laf9
        Le39:
            r10 = r58
            p000.AbstractC1021yh.m6917()
            throw r10
        Le3f:
            r0 = r5
            r5 = r10
            r4 = r27
            r9 = r28
            if (r19 <= 0) goto Le4a
            r11.write(r0)
        Le4a:
            java.lang.String r0 = "  ]\n}"
            r11.write(r0)
            p000.nh0.m4065(r4, r5, r9)
        Le52:
            s62 r12 = p000.s62.f9751
        Le54:
            return r12
        Le55:
            java.lang.Object r1 = r0.f139
            r4 = r1
            android.widget.EditText r4 = (android.widget.EditText) r4
            java.lang.Object r1 = r0.f138
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r2 = r0.f140
            android.widget.EditText r2 = (android.widget.EditText) r2
            java.lang.Object r3 = r0.f141
            um1 r3 = (p000.um1) r3
            java.lang.Object r5 = r0.f142
            r6 = r5
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.Object r5 = r0.f143
            r7 = r5
            android.widget.TextView r7 = (android.widget.TextView) r7
            java.lang.Object r0 = r0.f144
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = r59
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            r4.setText(r0)
            android.text.Editable r0 = r4.getText()
            if (r0 == 0) goto Le8a
            int r5 = r0.length()
            goto Le8b
        Le8a:
            r5 = 0
        Le8b:
            r4.setSelection(r5)
            r4.requestFocus()
            qu r0 = new qu
            r5 = 0
            r0.<init>(r1, r4, r5)
            r9 = 120(0x78, double:5.93E-322)
            r4.postDelayed(r0, r9)
            r5 = 0
            p000.h62.m2411(r2, r3, r4, r5, r6, r7, r8)
        Lea0:
            s62 r0 = p000.s62.f9751
            return r0
        Lea3:
            java.lang.Object r1 = r0.f138
            r5 = r1
            android.app.Activity r5 = (android.app.Activity) r5
            java.lang.Object r1 = r0.f139
            r3 = r1
            android.app.AlertDialog r3 = (android.app.AlertDialog) r3
            java.lang.Object r1 = r0.f140
            r6 = r1
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            java.lang.Object r1 = r0.f141
            r7 = r1
            i5 r7 = (p000.C0384i5) r7
            java.lang.Object r1 = r0.f142
            r8 = r1
            a80 r8 = (p000.a80) r8
            java.lang.Object r1 = r0.f143
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r0.f144
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            r4 = r59
            v9 r4 = (p000.C0901v9) r4
            r4.getClass()
            d9 r2 = new d9
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r5.runOnUiThread(r2)
            goto Lea0
    }
}
