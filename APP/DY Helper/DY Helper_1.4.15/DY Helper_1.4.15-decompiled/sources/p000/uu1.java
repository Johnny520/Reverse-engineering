package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uu1 extends p000.p80 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f10960;

    public /* synthetic */ uu1(int r1, java.lang.Object r2, java.lang.Class r3, java.lang.String r4, java.lang.String r5, int r6, int r7) {
            r0 = this;
            r0.f10960 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r42) {
            r41 = this;
            r0 = r41
            int r1 = r0.f10960
            r2 = 13
            r3 = 3600(0xe10, float:5.045E-42)
            java.lang.String r4 = "仅限内测用户使用"
            r5 = 8
            s62 r6 = p000.s62.f9751
            r7 = 2
            r8 = 10
            r9 = 11
            r10 = 1
            r11 = 0
            switch(r1) {
                case 0: goto L559;
                case 1: goto L543;
                case 2: goto L4ad;
                case 3: goto L3b3;
                case 4: goto L38b;
                case 5: goto L30c;
                case 6: goto L231;
                case 7: goto L1f4;
                case 8: goto L1e5;
                case 9: goto Led;
                case 10: goto L48;
                case 11: goto L30;
                default: goto L18;
            }
        L18:
            r1 = r42
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Object r0 = r0.receiver
            ib2 r0 = (p000.ib2) r0
            r0.getClass()
            bb2 r0 = p000.ib2.m2723(r1)
            if (r0 == 0) goto L2a
            goto L2b
        L2a:
            r10 = r11
        L2b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        L30:
            r1 = r42
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Object r0 = r0.receiver
            ib2 r0 = (p000.ib2) r0
            r0.getClass()
            bb2 r0 = p000.ib2.m2723(r1)
            if (r0 == 0) goto L42
            goto L43
        L42:
            r10 = r11
        L43:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        L48:
            r1 = r42
            java.lang.Class r1 = (java.lang.Class) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            c82 r0 = (p000.c82) r0
            r0.getClass()
            java.util.List r0 = p000.c82.f2003
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L61:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L79
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            c82 r4 = p000.c82.f1991
            java.lang.reflect.Field r3 = p000.c82.m1150(r1, r3)
            if (r3 == 0) goto L61
            r2.add(r3)
            goto L61
        L79:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L7e:
            if (r1 == 0) goto Lba
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Lba
            java.lang.reflect.Field[] r3 = r1.getDeclaredFields()
            r3.getClass()
            ss1 r3 = p000.AbstractC0312g7.m2232(r3)
            j72 r4 = new j72
            r4.<init>(r9)
            y30 r5 = new y30
            r5.<init>(r3, r10, r4)
            x30 r3 = new x30
            r3.<init>(r5)
        La2:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lb5
            java.lang.Object r4 = r3.next()
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            r4.setAccessible(r10)     // Catch: java.lang.Throwable -> La2
            r0.add(r4)     // Catch: java.lang.Throwable -> La2
            goto La2
        Lb5:
            java.lang.Class r1 = r1.getSuperclass()
            goto L7e
        Lba:
            java.util.ArrayList r0 = p000.AbstractC0984xh.m6651(r2, r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lcc:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Le7
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            java.lang.String r4 = r4.getName()
            boolean r4 = r1.add(r4)
            if (r4 == 0) goto Lcc
            r2.add(r3)
            goto Lcc
        Le7:
            b82 r0 = new b82
            r0.<init>(r2)
            return r0
        Led:
            r1 = r42
            java.lang.Class r1 = (java.lang.Class) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            c82 r0 = (p000.c82) r0
            a82 r2 = new a82
            r0.getClass()
            java.lang.String r0 = "desc"
            java.lang.reflect.Field r3 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "title"
            java.lang.reflect.Field r4 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "simpleDesc"
            java.lang.reflect.Field r5 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "authorUserId"
            java.lang.reflect.Field r6 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "author"
            java.lang.reflect.Field r7 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "awemeType"
            java.lang.reflect.Field r8 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "isAd"
            java.lang.reflect.Field r9 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "isAigcMedia"
            java.lang.reflect.Field r10 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "aigcInfo"
            java.lang.reflect.Field r11 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "textVideoLabels"
            java.lang.reflect.Field r12 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "textTopLabels"
            java.lang.reflect.Field r13 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "hybridLabels"
            java.lang.reflect.Field r14 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "commonLeftTopLabels"
            java.lang.reflect.Field r15 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "liveRoom"
            java.lang.reflect.Field r16 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "newLiveRoomData"
            java.lang.reflect.Field r17 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "liveRoomStruct"
            java.lang.reflect.Field r18 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "mRoomFeedCellStruct"
            java.lang.reflect.Field r19 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "liveId"
            java.lang.reflect.Field r20 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "isDetailLive"
            java.lang.reflect.Field r21 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "liveFeedbackCard"
            java.lang.reflect.Field r22 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "isLiveReplay"
            java.lang.reflect.Field r23 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "isEcomLive"
            java.lang.reflect.Field r24 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "awemeRawAd"
            java.lang.reflect.Field r25 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "adAwemeSource"
            java.lang.reflect.Field r26 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "feedAdPlayletExtraInfo"
            java.lang.reflect.Field r27 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "feedAdForcePlayletExtraInfo"
            java.lang.reflect.Field r28 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "insertionAdConfig"
            java.lang.reflect.Field r29 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "asyncAdInfo"
            java.lang.reflect.Field r30 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "packUsageSceneByReqPath"
            java.lang.reflect.Field r31 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "images"
            java.lang.reflect.Field r32 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "isTextMode"
            java.lang.reflect.Field r33 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "isNewTextMode"
            java.lang.reflect.Field r34 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "video"
            java.lang.reflect.Field r35 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "statistics"
            java.lang.reflect.Field r36 = p000.c82.m1150(r1, r0)
            java.lang.String r0 = "isLive"
            java.lang.reflect.Method r37 = p000.c82.m1151(r1, r0)
            java.lang.String r0 = "getLiveRoom"
            java.lang.reflect.Method r38 = p000.c82.m1151(r1, r0)
            java.lang.String r0 = "getAd"
            java.lang.reflect.Method r39 = p000.c82.m1151(r1, r0)
            java.lang.String r0 = "getAdId"
            java.lang.reflect.Method r40 = p000.c82.m1151(r1, r0)
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return r2
        L1e5:
            r1 = r42
            java.util.Set r1 = (java.util.Set) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            vv1 r0 = (p000.vv1) r0
            r0.m6277(r1)
            return r6
        L1f4:
            r1 = r42
            java.lang.Class r1 = (java.lang.Class) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            lv1 r0 = (p000.lv1) r0
            r0.getClass()
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = p000.lv1.f6816
            ce0 r0 = p000.AbstractC0978xb.m6576(r1)
            if (r0 != 0) goto L20b
            goto L22c
        L20b:
            java.lang.reflect.Method r1 = r0.f2079
            boolean r3 = r2.add(r1)
            if (r3 != 0) goto L214
            goto L22c
        L214:
            xq0 r3 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L220
            nh r4 = new nh     // Catch: java.lang.Throwable -> L220
            r4.<init>(r5, r0)     // Catch: java.lang.Throwable -> L220
            r3.m6775(r1, r4)     // Catch: java.lang.Throwable -> L220
            r3 = r6
            goto L226
        L220:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
        L226:
            java.lang.Throwable r0 = p000.fo1.m2190(r3)
            if (r0 != 0) goto L22d
        L22c:
            return r6
        L22d:
            r2.remove(r1)
            throw r0
        L231:
            r12 = r42
            android.app.Activity r12 = (android.app.Activity) r12
            r12.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            android.widget.LinearLayout r0 = p000.bv1.m1062(r12)
            java.lang.String r1 = "im_auto_read_enabled"
            boolean r1 = p000.ui1.m5887(r1, r11)
            oq1 r2 = new oq1
            r3 = 16
            r2.<init>(r3)
            java.lang.String r3 = "启用定时已读"
            java.lang.String r4 = "按设定间隔自动将私信标记为已读"
            android.widget.LinearLayout r1 = p000.bv1.m1073(r12, r3, r4, r1, r2)
            r0.addView(r1)
            android.view.View r1 = p000.bv1.m1064(r12)
            r0.addView(r1)
            java.lang.String r1 = "im_auto_read_interval_minutes"
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L26c
            int r8 = r2.getInt(r1, r8)     // Catch: java.lang.Throwable -> L26c
        L26c:
            r1 = 180(0xb4, float:2.52E-43)
            int r14 = p000.j81.m2906(r8, r10, r1)
            dt1 r1 = new dt1
            r1.<init>(r9)
            java.lang.String r13 = "执行间隔"
            r15 = 180(0xb4, float:2.52E-43)
            r16 = 1
            java.lang.String r17 = "分钟"
            java.lang.String r18 = "每隔多少分钟自动执行一次已读"
            r19 = r1
            android.widget.LinearLayout r1 = p000.bv1.m1070(r12, r13, r14, r15, r16, r17, r18, r19)
            r0.addView(r1)
            android.view.View r1 = p000.bv1.m1064(r12)
            r0.addView(r1)
            java.lang.String r1 = "im_auto_read_include_interactive"
            boolean r1 = p000.ui1.m5887(r1, r10)
            oq1 r2 = new oq1
            r3 = 17
            r2.<init>(r3)
            java.lang.String r3 = "同时已读互动消息"
            java.lang.String r4 = "定时已读时同步清除点赞、评论、关注等互动消息角标"
            android.widget.LinearLayout r1 = p000.bv1.m1073(r12, r3, r4, r1, r2)
            r0.addView(r1)
            android.view.View r1 = p000.bv1.m1064(r12)
            r0.addView(r1)
            java.lang.String r1 = "im_auto_read_filter_mode"
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L2bb
            int r1 = r2.getInt(r1, r11)     // Catch: java.lang.Throwable -> L2bb
            goto L2bc
        L2bb:
            r1 = r11
        L2bc:
            java.lang.String[] r2 = p000.kn0.f6041
            int r1 = p000.j81.m2906(r1, r11, r7)
            r1 = r2[r1]
            g71 r2 = new g71
            r3 = 28
            r2.<init>(r12, r3)
            java.lang.String r3 = "已读模式"
            java.lang.String r4 = "全部：所有会话；白名单：只处理规则内；黑名单：排除规则内"
            android.widget.LinearLayout r1 = p000.bv1.m1063(r12, r3, r1, r4, r2)
            r0.addView(r1)
            android.view.View r1 = p000.bv1.m1064(r12)
            r0.addView(r1)
            java.lang.String r1 = "im_auto_read_filter_rules"
            java.lang.String r2 = ""
            java.lang.String r1 = p000.ui1.m5893(r1, r2)
            java.lang.String r1 = p000.bv1.m1066(r1)
            g71 r2 = new g71
            r3 = 29
            r2.<init>(r12, r3)
            java.lang.String r3 = "白/黑名单规则"
            java.lang.String r4 = "每行一个 conversationId、UID、群名或昵称关键词"
            android.widget.LinearLayout r1 = p000.bv1.m1063(r12, r3, r1, r4, r2)
            r0.addView(r1)
            android.view.View r1 = p000.bv1.m1064(r12)
            r0.addView(r1)
            java.lang.String r1 = "如果开启“关闭已读状态上报”，定时已读只会清本地未读，对方通常看不到已读"
            android.widget.TextView r1 = p000.bv1.m1065(r12, r1)
            r0.addView(r1)
            return r0
        L30c:
            r1 = r42
            android.app.Activity r1 = (android.app.Activity) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            boolean r0 = p000.AbstractC0976x9.m6525()
            android.widget.LinearLayout r12 = p000.bv1.m1062(r1)
            if (r0 == 0) goto L327
            java.lang.String r5 = "本进程首次进入抖音并等待消息服务就绪后执行一次"
            goto L328
        L327:
            r5 = r4
        L328:
            if (r0 == 0) goto L334
            java.lang.String r6 = "group_apply_auto_approval_cold_start_enabled"
            boolean r6 = p000.ui1.m5887(r6, r11)
            if (r6 == 0) goto L334
            r6 = r10
            goto L335
        L334:
            r6 = r11
        L335:
            it1 r7 = new it1
            r7.<init>(r1, r11)
            java.lang.String r9 = "冷启动自动审批"
            android.widget.LinearLayout r5 = p000.bv1.m1073(r1, r9, r5, r6, r7)
            p000.AbstractC0602nx.m4141(r12, r5, r1)
            if (r0 == 0) goto L347
            java.lang.String r4 = "按设定间隔重复查询并通过全部待审核入群申请"
        L347:
            if (r0 == 0) goto L352
            java.lang.String r5 = "group_apply_auto_approval_polling_enabled"
            boolean r5 = p000.ui1.m5887(r5, r11)
            if (r5 == 0) goto L352
            r11 = r10
        L352:
            it1 r5 = new it1
            r5.<init>(r1, r10)
            java.lang.String r6 = "轮询自动审批"
            android.widget.LinearLayout r4 = p000.bv1.m1073(r1, r6, r4, r11, r5)
            p000.AbstractC0602nx.m4141(r12, r4, r1)
            java.lang.String r4 = "group_apply_auto_approval_interval_seconds"
            r5 = 60
            android.content.SharedPreferences r6 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L36c
            int r5 = r6.getInt(r4, r5)     // Catch: java.lang.Throwable -> L36c
        L36c:
            int r4 = p000.j81.m2906(r5, r8, r3)
            dt1 r9 = new dt1
            r9.<init>(r2)
            java.lang.String r3 = "轮询间隔"
            r5 = 3600(0xe10, float:5.045E-42)
            r6 = 10
            java.lang.String r7 = "秒"
            java.lang.String r8 = "每轮完整结束后重新计时；冷启动审批不受此间隔限制"
            r2 = r1
            android.widget.LinearLayout r1 = p000.bv1.m1070(r2, r3, r4, r5, r6, r7, r8, r9)
            r12.addView(r1)
            p000.bv1.m1060(r12, r0)
            return r12
        L38b:
            r1 = r42
            android.app.Activity r1 = (android.app.Activity) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            android.widget.LinearLayout r0 = p000.bv1.m1062(r1)
            java.util.List r2 = p000.zs1.f13270
            p000.bv1.m1055(r0, r1, r2, r11)
            android.view.View r2 = p000.bv1.m1064(r1)
            r0.addView(r2)
            java.lang.String r2 = "开启已读上报关闭后，服务端可能仍认为消息未读，多端同步时未读数可能恢复"
            android.widget.TextView r1 = p000.bv1.m1065(r1, r2)
            r0.addView(r1)
            return r0
        L3b3:
            r12 = r42
            android.app.Activity r12 = (android.app.Activity) r12
            r12.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            android.widget.LinearLayout r0 = p000.bv1.m1062(r12)
            java.util.List r1 = p000.zs1.f13255
            p000.bv1.m1055(r0, r12, r1, r11)
            android.view.View r1 = p000.bv1.m1064(r12)
            r0.addView(r1)
            java.lang.String r1 = "filter_keywords"
            java.lang.String r2 = "[]"
            java.lang.String r1 = p000.ui1.m5893(r1, r2)
            java.lang.String r4 = p000.bv1.m1068(r1)
            fj1 r6 = new fj1
            r6.<init>(r12, r1, r10)
            java.lang.String r1 = "关键词黑名单"
            java.lang.String r9 = "包含这些词的视频将被过滤"
            android.widget.LinearLayout r1 = p000.bv1.m1063(r12, r1, r4, r9, r6)
            r0.addView(r1)
            android.view.View r1 = p000.bv1.m1064(r12)
            r0.addView(r1)
            java.lang.String r1 = "filter_user_ids"
            java.lang.String r1 = p000.ui1.m5893(r1, r2)
            java.lang.String r2 = p000.bv1.m1068(r1)
            fj1 r4 = new fj1
            r4.<init>(r12, r1, r7)
            java.lang.String r1 = "用户 UID 黑名单"
            java.lang.String r6 = "这些用户的视频将被过滤"
            android.widget.LinearLayout r1 = p000.bv1.m1063(r12, r1, r2, r6, r4)
            p000.AbstractC0602nx.m4141(r0, r1, r12)
            java.lang.String r1 = "filter_min_duration_sec"
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L419
            int r1 = r2.getInt(r1, r11)     // Catch: java.lang.Throwable -> L419
            goto L41a
        L419:
            r1 = r11
        L41a:
            int r14 = p000.j81.m2906(r1, r11, r3)
            dt1 r1 = new dt1
            r1.<init>(r5)
            java.lang.String r13 = "最短时长"
            r15 = 600(0x258, float:8.41E-43)
            r16 = 0
            java.lang.String r17 = "秒"
            java.lang.String r18 = "过滤时长低于此值的视频（0 = 不限制）"
            r19 = r1
            android.widget.LinearLayout r1 = p000.bv1.m1070(r12, r13, r14, r15, r16, r17, r18, r19)
            p000.AbstractC0602nx.m4141(r0, r1, r12)
            java.lang.String r1 = "filter_max_duration_sec"
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L441
            int r1 = r2.getInt(r1, r11)     // Catch: java.lang.Throwable -> L441
            goto L442
        L441:
            r1 = r11
        L442:
            r2 = 7200(0x1c20, float:1.009E-41)
            int r14 = p000.j81.m2906(r1, r11, r2)
            dt1 r1 = new dt1
            r2 = 9
            r1.<init>(r2)
            java.lang.String r13 = "最长时长"
            r15 = 7200(0x1c20, float:1.009E-41)
            r16 = 0
            java.lang.String r17 = "秒"
            java.lang.String r18 = "过滤时长超过此值的视频（0 = 不限制）"
            r19 = r1
            android.widget.LinearLayout r1 = p000.bv1.m1070(r12, r13, r14, r15, r16, r17, r18, r19)
            p000.AbstractC0602nx.m4141(r0, r1, r12)
            java.lang.String r1 = "filter_min_digg"
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L46d
            int r1 = r2.getInt(r1, r11)     // Catch: java.lang.Throwable -> L46d
            goto L46e
        L46d:
            r1 = r11
        L46e:
            r2 = 100000(0x186a0, float:1.4013E-40)
            int r4 = p000.j81.m2906(r1, r11, r2)
            dt1 r9 = new dt1
            r9.<init>(r8)
            java.lang.String r3 = "最低点赞数"
            r5 = 50000(0xc350, float:7.0065E-41)
            r6 = 0
            java.lang.String r7 = ""
            java.lang.String r8 = "过滤点赞数低于此值的视频（0 = 不限制）"
            r2 = r12
            android.widget.LinearLayout r1 = p000.bv1.m1070(r2, r3, r4, r5, r6, r7, r8, r9)
            p000.AbstractC0602nx.m4141(r0, r1, r12)
            java.util.concurrent.atomic.AtomicInteger r1 = p000.c82.f2002
            int r1 = r1.get()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "本次会话已过滤 "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " 条内容"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.widget.TextView r1 = p000.bv1.m1065(r12, r1)
            r0.addView(r1)
            return r0
        L4ad:
            r1 = r42
            android.app.Activity r1 = (android.app.Activity) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            android.widget.LinearLayout r0 = p000.bv1.m1062(r1)
            java.util.List r3 = p000.zs1.f13269
            p000.bv1.m1055(r0, r1, r3, r11)
            android.view.View r3 = p000.bv1.m1064(r1)
            r0.addView(r3)
            java.lang.String r3 = "im_time_label_format"
            java.lang.String r4 = "yyyy-MM-dd HH:mm:ss"
            java.lang.String r3 = p000.ui1.m5893(r3, r4)
            java.lang.String r4 = "im_time_label_text"
            java.lang.String r5 = "{time}"
            java.lang.String r4 = p000.ui1.m5893(r4, r5)
            java.lang.String r3 = p000.bv1.m1067(r4, r3)
            g71 r4 = new g71
            r4.<init>(r1, r9)
            java.lang.String r5 = "显示文字"
            java.lang.String r6 = "自定义文字、换行和时间格式，并实时预览气泡下方效果"
            android.widget.LinearLayout r3 = p000.bv1.m1063(r1, r5, r3, r6, r4)
            p000.AbstractC0602nx.m4141(r0, r3, r1)
            ym1 r3 = p000.hk0.f4753
            java.lang.String r3 = "im_time_label_light_color"
            java.lang.String r4 = "#000000"
            java.lang.String r3 = p000.ui1.m5893(r3, r4)
            java.lang.String r3 = p000.hk0.m2515(r3, r4)
            g71 r4 = new g71
            r5 = 12
            r4.<init>(r1, r5)
            java.lang.String r5 = "浅色模式颜色"
            java.lang.String r6 = "浅色模式下的标签文字颜色，默认黑色"
            android.widget.LinearLayout r3 = p000.bv1.m1063(r1, r5, r3, r6, r4)
            r0.addView(r3)
            android.view.View r3 = p000.bv1.m1064(r1)
            r0.addView(r3)
            java.lang.String r3 = "im_time_label_dark_color"
            java.lang.String r4 = "#FFFFFF"
            java.lang.String r3 = p000.ui1.m5893(r3, r4)
            java.lang.String r3 = p000.hk0.m2515(r3, r4)
            g71 r4 = new g71
            r4.<init>(r1, r2)
            java.lang.String r2 = "深色模式颜色"
            java.lang.String r5 = "深色模式下的标签文字颜色，默认白色"
            android.widget.LinearLayout r2 = p000.bv1.m1063(r1, r2, r3, r5, r4)
            r0.addView(r2)
            android.view.View r2 = p000.bv1.m1064(r1)
            r0.addView(r2)
            java.lang.String r2 = "支持 {time} 占位符和最多 4 行文字；点击后可选择常用时间格式"
            android.widget.TextView r1 = p000.bv1.m1065(r1, r2)
            r0.addView(r1)
            return r0
        L543:
            r1 = r42
            android.app.Activity r1 = (android.app.Activity) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            r0 = 0
            ys1 r2 = p000.zs1.f13268
            android.widget.LinearLayout r0 = p000.bv1.m1072(r1, r2, r0)
            return r0
        L559:
            r1 = r42
            android.app.Activity r1 = (android.app.Activity) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            boolean r0 = p000.AbstractC0976x9.m6524()
            android.widget.LinearLayout r2 = p000.bv1.m1062(r1)
            qm1 r3 = new qm1
            r3.<init>()
            if (r0 == 0) goto L578
            java.lang.String r4 = "开启后在抖音消息页标题栏显示批量删除按钮"
        L578:
            if (r0 == 0) goto L583
            java.lang.String r5 = "im_conversation_delete_entry_enabled"
            boolean r5 = p000.ui1.m5887(r5, r10)
            if (r5 == 0) goto L583
            goto L584
        L583:
            r10 = r11
        L584:
            kt1 r5 = new kt1
            r5.<init>(r3, r1, r7)
            java.lang.String r3 = "消息页顶部注入会话批量删除入口"
            android.widget.LinearLayout r3 = p000.bv1.m1073(r1, r3, r4, r10, r5)
            p000.AbstractC0602nx.m4141(r2, r3, r1)
            if (r0 == 0) goto L597
            java.lang.String r0 = "切换消息页后生效；删除前仍会二次确认"
            goto L599
        L597:
            java.lang.String r0 = "已锁定 · 仅限内测用户"
        L599:
            android.widget.TextView r0 = p000.bv1.m1065(r1, r0)
            r2.addView(r0)
            return r2
    }
}
