package p000;

/* JADX INFO: renamed from: hu */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0372hu implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4816;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f4817;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.a80 f4818;

    public /* synthetic */ C0372hu(p000.a80 r1, android.app.Activity r2, int r3) {
            r0 = this;
            r0.f4816 = r3
            r0.f4818 = r1
            r0.f4817 = r2
            r0.<init>()
            return
    }

    public /* synthetic */ C0372hu(android.app.Activity r1, p000.a80 r2, int r3) {
            r0 = this;
            r0.f4816 = r3
            r0.f4817 = r1
            r0.f4818 = r2
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r25) {
            r24 = this;
            r0 = r24
            int r1 = r0.f4816
            java.lang.String r2 = "#%08X"
            java.lang.String r3 = "请输入 5~300 之间的整数"
            java.lang.String r5 = "已保存 "
            r6 = 20
            r7 = 120(0x78, float:1.68E-43)
            java.lang.String r8 = "规则已保存"
            java.lang.String r9 = "im_auto_read_filter_rules"
            java.lang.String r10 = "请输入 0~100 之间的整数"
            java.lang.String r12 = "颜色已更新"
            java.lang.String r14 = "#%06X"
            r16 = 16777215(0xffffff, float:2.3509886E-38)
            r11 = 0
            r4 = 0
            s62 r17 = p000.s62.f9751
            android.app.Activity r13 = r0.f4817
            a80 r15 = r0.f4818
            switch(r1) {
                case 0: goto L801;
                case 1: goto L7f0;
                case 2: goto L794;
                case 3: goto L759;
                case 4: goto L72c;
                case 5: goto L6e2;
                case 6: goto L68f;
                case 7: goto L662;
                case 8: goto L616;
                case 9: goto L570;
                case 10: goto L531;
                case 11: goto L500;
                case 12: goto L4b8;
                case 13: goto L435;
                case 14: goto L3e2;
                case 15: goto L38f;
                case 16: goto L369;
                case 17: goto L343;
                case 18: goto L312;
                case 19: goto L2b9;
                case 20: goto L266;
                case 21: goto L23b;
                case 22: goto L213;
                case 23: goto L203;
                case 24: goto L172;
                case 25: goto L87;
                case 26: goto L6c;
                case 27: goto L41;
                default: goto L26;
            }
        L26:
            r0 = r25
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            bv1 r1 = p000.bv1.f1853
            p000.ui1.m5875(r9, r0)
            java.lang.String r0 = p000.bv1.m1066(r0)
            r15.invoke(r0)
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r8, r4)
            r0.show()
            return r17
        L41:
            r0 = r25
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            boolean r1 = p000.q02.m4671(r0)
            if (r1 == 0) goto L50
            java.lang.String r0 = "{time}     {location}"
        L50:
            java.lang.String r0 = p000.q02.m4693(r0, r7)
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = "info_bar_text_format"
            p000.ui1.m5875(r1, r0)
            java.lang.String r0 = p000.bv1.m1042(r0, r6)
            r15.invoke(r0)
            java.lang.String r0 = "格式已更新，切换视频后生效"
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r0, r4)
            r0.show()
            return r17
        L6c:
            r0 = r25
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            bv1 r1 = p000.bv1.f1853
            p000.ui1.m5875(r9, r0)
            java.lang.String r0 = p000.bv1.m1066(r0)
            r15.invoke(r0)
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r8, r4)
            r0.show()
            return r17
        L87:
            r1 = r25
            android.net.Uri r1 = (android.net.Uri) r1
            if (r1 != 0) goto L94
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r15.invoke(r0)
            goto L171
        L94:
            android.content.ContentResolver r0 = r13.getContentResolver()     // Catch: java.lang.Throwable -> Lc9
            java.util.List r0 = r0.getPersistedUriPermissions()     // Catch: java.lang.Throwable -> Lc9
            r0.getClass()     // Catch: java.lang.Throwable -> Lc9
            boolean r2 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lc9
            if (r2 == 0) goto La7
        La5:
            r0 = r4
            goto Lcb
        La7:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lc9
        Lab:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> Lc9
            if (r2 == 0) goto La5
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> Lc9
            android.content.UriPermission r2 = (android.content.UriPermission) r2     // Catch: java.lang.Throwable -> Lc9
            android.net.Uri r3 = r2.getUri()     // Catch: java.lang.Throwable -> Lc9
            boolean r3 = p000.ln0.m3626(r3, r1)     // Catch: java.lang.Throwable -> Lc9
            if (r3 == 0) goto Lab
            boolean r2 = r2.isReadPermission()     // Catch: java.lang.Throwable -> Lc9
            if (r2 == 0) goto Lab
            r0 = 1
            goto Lcb
        Lc9:
            r0 = move-exception
            goto Ld0
        Lcb:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Lc9
            goto Ld6
        Ld0:
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        Ld6:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto Ldd
            r0 = r2
        Ldd:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lfc
            java.lang.String r0 = "自动任务图片未获得持久读取权限，拒绝保存 URI"
            r1 = 4
            java.lang.String r3 = "DYHelper"
            p000.C0888ux.m5979(r3, r0, r11, r1, r11)
            java.lang.String r0 = "所选图片不支持长期读取，请更换文件来源"
            r1 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r0, r1)
            r0.show()
            r15.invoke(r2)
            goto L171
        Lfc:
            android.content.ContentResolver r18 = r13.getContentResolver()     // Catch: java.lang.Throwable -> L131
            java.lang.String r0 = "_display_name"
            java.lang.String[] r20 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L131
            r22 = 0
            r23 = 0
            r21 = 0
            r19 = r1
            android.database.Cursor r1 = r18.query(r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> L127
            if (r1 == 0) goto L12f
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L11f
            if (r0 == 0) goto L122
            java.lang.String r0 = r1.getString(r4)     // Catch: java.lang.Throwable -> L11f
            goto L123
        L11f:
            r0 = move-exception
            r2 = r0
            goto L129
        L122:
            r0 = r11
        L123:
            r1.close()     // Catch: java.lang.Throwable -> L127
            goto L13a
        L127:
            r0 = move-exception
            goto L134
        L129:
            throw r2     // Catch: java.lang.Throwable -> L12a
        L12a:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r1, r2)     // Catch: java.lang.Throwable -> L127
            throw r0     // Catch: java.lang.Throwable -> L127
        L12f:
            r0 = r11
            goto L13a
        L131:
            r0 = move-exception
            r19 = r1
        L134:
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L13a:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L13f
            goto L140
        L13f:
            r11 = r0
        L140:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L14c
            java.lang.String r11 = r19.getLastPathSegment()
            if (r11 != 0) goto L14c
            java.lang.String r11 = "已选择图片"
        L14c:
            bv1 r0 = p000.bv1.f1853
            java.lang.String r0 = r19.toString()
            r0.getClass()
            java.lang.String r1 = "pet_elf_task_image_uri"
            p000.ui1.m5875(r1, r0)
            java.lang.String r0 = "pet_elf_task_image_name"
            java.lang.String r1 = p000.q02.m4693(r11, r7)
            p000.ui1.m5875(r0, r1)
            java.lang.String r0 = "自动任务图片已更新"
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r0, r4)
            r0.show()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r15.invoke(r0)
        L171:
            return r17
        L172:
            r0 = r25
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            java.util.List r0 = p000.q02.m4675(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = p000.AbstractC1021yh.m6889(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L18c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1a4
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            r1.add(r2)
            goto L18c
        L1a4:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L1ad:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1c4
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = p000.q02.m4671(r3)
            if (r3 != 0) goto L1ad
            r0.add(r2)
            goto L1ad
        L1c4:
            java.util.Set r0 = p000.AbstractC0984xh.m6670(r0)
            java.util.List r0 = p000.AbstractC0984xh.m6666(r0)
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>(r0)
            java.lang.String r1 = r1.toString()
            r1.getClass()
            bv1 r2 = p000.bv1.f1853
            java.lang.String r2 = "filter_keywords"
            p000.ui1.m5875(r2, r1)
            java.lang.String r1 = p000.bv1.m1068(r1)
            r15.invoke(r1)
            int r0 = r0.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            r1.append(r0)
            java.lang.String r0 = " 个关键词"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r0, r4)
            r0.show()
            return r17
        L203:
            r0 = r25
            v9 r0 = (p000.C0901v9) r0
            r0.getClass()
            jg1 r1 = new jg1
            r1.<init>(r15, r13, r0)
            r13.runOnUiThread(r1)
            return r17
        L213:
            r0 = r25
            gk0 r0 = (p000.gk0) r0
            r0.getClass()
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = r0.f4397
            java.lang.String r2 = "im_time_label_format"
            p000.ui1.m5875(r2, r1)
            java.lang.String r0 = r0.f4398
            java.lang.String r2 = "im_time_label_text"
            p000.ui1.m5875(r2, r0)
            java.lang.String r0 = p000.bv1.m1067(r0, r1)
            r15.invoke(r0)
            java.lang.String r0 = "时间标签显示已更新"
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r0, r4)
            r0.show()
            return r17
        L23b:
            r0 = r25
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            boolean r1 = p000.q02.m4671(r0)
            if (r1 != 0) goto L265
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = "precise_time_format"
            r2 = 50
            java.lang.String r2 = p000.q02.m4693(r0, r2)
            p000.ui1.m5875(r1, r2)
            java.lang.String r1 = "时间格式已更新"
            android.widget.Toast r1 = android.widget.Toast.makeText(r13, r1, r4)
            r1.show()
            java.lang.String r0 = p000.bv1.m1042(r0, r6)
            r15.invoke(r0)
        L265:
            return r17
        L266:
            r0 = r25
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            r2 = 10
            java.lang.Integer r0 = p000.x02.m6487(r0, r2)
            if (r0 == 0) goto L2b1
            xm0 r1 = new xm0
            r2 = 300(0x12c, float:4.2E-43)
            r5 = 5
            r6 = 1
            r1.<init>(r5, r2, r6)
            int r2 = r0.intValue()
            boolean r1 = r1.m6684(r2)
            if (r1 == 0) goto L2b1
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = "spark_auto_renew_delay_seconds"
            int r2 = r0.intValue()
            p000.ui1.m5873(r1, r2)
            java.lang.String r1 = "延迟已更新"
            android.widget.Toast r1 = android.widget.Toast.makeText(r13, r1, r4)
            r1.show()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "s"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r15.invoke(r0)
            goto L2b8
        L2b1:
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r3, r4)
            r0.show()
        L2b8:
            return r17
        L2b9:
            r0 = r25
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            r2 = 10
            java.lang.Integer r0 = p000.x02.m6487(r0, r2)
            if (r0 == 0) goto L308
            xm0 r1 = new xm0
            r3 = 500(0x1f4, float:7.0E-43)
            r6 = 1
            r1.<init>(r2, r3, r6)
            int r5 = r0.intValue()
            boolean r1 = r1.m6684(r5)
            if (r1 != 0) goto L2db
            goto L308
        L2db:
            int r1 = r0.intValue()
            java.lang.Object r5 = p000.ui1.f10844
            java.lang.String r5 = "offline_cache_count"
            int r1 = p000.j81.m2906(r1, r2, r3)
            p000.ui1.m5873(r5, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " 条"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r15.invoke(r0)
            java.lang.String r0 = "数量已保存，请在抖音缓存设置中应用"
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r0, r4)
            r0.show()
            goto L311
        L308:
            java.lang.String r0 = "请输入 10~500 之间的整数"
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r0, r4)
            r0.show()
        L311:
            return r17
        L312:
            r0 = r25
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Locale r1 = java.util.Locale.ROOT
            r0 = r0 & r16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r6 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r6)
            java.lang.String r0 = java.lang.String.format(r1, r14, r0)
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = "im_time_label_light_color"
            p000.ui1.m5875(r1, r0)
            r15.invoke(r0)
            java.lang.String r0 = "浅色模式颜色已更新"
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r0, r4)
            r0.show()
            return r17
        L343:
            r0 = r25
            java.lang.Integer r0 = (java.lang.Integer) r0
            r0.getClass()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r6 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r6)
            java.lang.String r0 = java.lang.String.format(r2, r0)
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = "info_bar_text_color"
            p000.ui1.m5875(r1, r0)
            r15.invoke(r0)
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r12, r4)
            r0.show()
            return r17
        L369:
            r0 = r25
            java.lang.Integer r0 = (java.lang.Integer) r0
            r0.getClass()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r6 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r6)
            java.lang.String r0 = java.lang.String.format(r2, r0)
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = "comment_bg_color"
            p000.ui1.m5875(r1, r0)
            r15.invoke(r0)
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r12, r4)
            r0.show()
            return r17
        L38f:
            r0 = r25
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            r2 = 10
            java.lang.Integer r0 = p000.x02.m6487(r0, r2)
            if (r0 == 0) goto L3d8
            xm0 r1 = new xm0
            r2 = 300(0x12c, float:4.2E-43)
            r6 = 1
            r1.<init>(r4, r2, r6)
            int r2 = r0.intValue()
            boolean r1 = r1.m6684(r2)
            if (r1 != 0) goto L3b1
            goto L3d8
        L3b1:
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = "pet_elf_camp_start_delay_seconds"
            int r2 = r0.intValue()
            p000.ui1.m5873(r1, r2)
            boolean r1 = p000.dd1.m1714()
            p000.dd1.m1716(r13, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " 秒后"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r15.invoke(r0)
            goto L3e1
        L3d8:
            java.lang.String r0 = "请输入 0~300 之间的整数"
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r0, r4)
            r0.show()
        L3e1:
            return r17
        L3e2:
            r0 = r25
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            r2 = 10
            java.lang.Integer r0 = p000.x02.m6487(r0, r2)
            if (r0 == 0) goto L42d
            xm0 r1 = new xm0
            r2 = 100
            r6 = 1
            r1.<init>(r4, r2, r6)
            int r2 = r0.intValue()
            boolean r1 = r1.m6684(r2)
            if (r1 != 0) goto L404
            goto L42d
        L404:
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = "pet_elf_camp_daily_harvest_limit"
            int r2 = r0.intValue()
            p000.ui1.m5873(r1, r2)
            int r1 = r0.intValue()
            if (r1 != 0) goto L418
            java.lang.String r0 = "不限制"
            goto L429
        L418:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " 次"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L429:
            r15.invoke(r0)
            goto L434
        L42d:
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r10, r4)
            r0.show()
        L434:
            return r17
        L435:
            r0 = r25
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            r2 = 10
            java.lang.Integer r0 = p000.x02.m6487(r0, r2)
            if (r0 == 0) goto L4b0
            xm0 r1 = new xm0
            r2 = 100
            r6 = 1
            r1.<init>(r4, r2, r6)
            int r2 = r0.intValue()
            boolean r1 = r1.m6684(r2)
            if (r1 != 0) goto L457
            goto L4b0
        L457:
            z61 r1 = new z61
            r2 = 6
            r1.<init>(r0, r2, r15)
            int r2 = r0.intValue()
            if (r2 != 0) goto L467
            r1.invoke()
            goto L4b7
        L467:
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r2.<init>(r13)
            java.lang.String r3 = "允许付费自动投喂？"
            android.app.AlertDialog$Builder r2 = r2.setTitle(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "开启后，每个启用人员每次投喂最多可能消耗 "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = " 火星。实际价格超过上限仍会跳过。"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.app.AlertDialog$Builder r2 = r2.setMessage(r3)
            java.lang.String r3 = "取消"
            android.app.AlertDialog$Builder r2 = r2.setNegativeButton(r3, r11)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "允许最多 "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = " 火星"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            gd0 r3 = new gd0
            r5 = 5
            r3.<init>(r5, r1)
            android.app.AlertDialog$Builder r0 = r2.setPositiveButton(r0, r3)
            r0.show()
            goto L4b7
        L4b0:
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r10, r4)
            r0.show()
        L4b7:
            return r17
        L4b8:
            r0 = r25
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            r2 = 10
            java.lang.Integer r0 = p000.x02.m6487(r0, r2)
            if (r0 == 0) goto L4d6
            int r0 = r0.intValue()
            r2 = 300(0x12c, float:4.2E-43)
            r5 = 5
            int r0 = p000.j81.m2906(r0, r5, r2)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
        L4d6:
            if (r11 != 0) goto L4e0
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r3, r4)
            r0.show()
            goto L4ff
        L4e0:
            bv1 r0 = p000.bv1.f1853
            java.lang.String r0 = "hidden_contact_peek_duration_seconds"
            int r1 = r11.intValue()
            p000.ui1.m5873(r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            java.lang.String r1 = " 秒"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15.invoke(r0)
        L4ff:
            return r17
        L500:
            r0 = r25
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Locale r1 = java.util.Locale.ROOT
            r0 = r0 & r16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r6 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r6)
            java.lang.String r0 = java.lang.String.format(r1, r14, r0)
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = "im_time_label_dark_color"
            p000.ui1.m5875(r1, r0)
            r15.invoke(r0)
            java.lang.String r0 = "深色模式颜色已更新"
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r0, r4)
            r0.show()
            return r17
        L531:
            r0 = r25
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            r1 = 48
            java.lang.String r0 = p000.q02.m4693(r0, r1)
            boolean r1 = p000.q02.m4671(r0)
            if (r1 == 0) goto L556
            java.lang.String r0 = "互发消息内容不能为空"
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r0, r4)
            r0.show()
            goto L56f
        L556:
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = "pet_elf_mutual_message"
            p000.ui1.m5875(r1, r0)
            r1 = 15
            java.lang.String r0 = p000.bv1.m1042(r0, r1)
            r15.invoke(r0)
            java.lang.String r0 = "互发消息默认内容已更新"
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r0, r4)
            r0.show()
        L56f:
            return r17
        L570:
            r0 = r25
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            java.util.List r0 = p000.q02.m4675(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = p000.AbstractC1021yh.m6889(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L58a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5a2
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            r1.add(r2)
            goto L58a
        L5a2:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L5ab:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5d7
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            boolean r6 = p000.q02.m4671(r3)
            if (r6 != 0) goto L5ab
            r6 = r4
        L5bf:
            int r7 = r3.length()
            if (r6 >= r7) goto L5d3
            char r7 = r3.charAt(r6)
            boolean r7 = java.lang.Character.isDigit(r7)
            if (r7 != 0) goto L5d0
            goto L5ab
        L5d0:
            int r6 = r6 + 1
            goto L5bf
        L5d3:
            r0.add(r2)
            goto L5ab
        L5d7:
            java.util.Set r0 = p000.AbstractC0984xh.m6670(r0)
            java.util.List r0 = p000.AbstractC0984xh.m6666(r0)
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>(r0)
            java.lang.String r1 = r1.toString()
            r1.getClass()
            bv1 r2 = p000.bv1.f1853
            java.lang.String r2 = "filter_user_ids"
            p000.ui1.m5875(r2, r1)
            java.lang.String r1 = p000.bv1.m1068(r1)
            r15.invoke(r1)
            int r0 = r0.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            r1.append(r0)
            java.lang.String r0 = " 个 UID"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r0, r4)
            r0.show()
            return r17
        L616:
            r0 = r25
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            r2 = 10
            java.lang.Integer r0 = p000.x02.m6487(r0, r2)
            if (r0 == 0) goto L658
            xm0 r1 = new xm0
            r2 = 60
            r6 = 1
            r1.<init>(r4, r2, r6)
            int r2 = r0.intValue()
            boolean r1 = r1.m6684(r2)
            if (r1 != 0) goto L638
            goto L658
        L638:
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = "pet_elf_camp_operation_interval_seconds"
            int r2 = r0.intValue()
            p000.ui1.m5873(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " 秒"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r15.invoke(r0)
            goto L661
        L658:
            java.lang.String r0 = "请输入 0~60 之间的整数"
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r0, r4)
            r0.show()
        L661:
            return r17
        L662:
            r0 = r25
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r0 = r0 & r16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r6 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r6)
            java.lang.String r0 = java.lang.String.format(r14, r0)
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = "seekbar_time_color"
            p000.ui1.m5875(r1, r0)
            r15.invoke(r0)
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r12, r4)
            r0.show()
            return r17
        L68f:
            r0 = r25
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            r2 = 10
            java.lang.Integer r0 = p000.x02.m6487(r0, r2)
            if (r0 == 0) goto L6da
            xm0 r1 = new xm0
            r2 = 100
            r6 = 1
            r1.<init>(r4, r2, r6)
            int r2 = r0.intValue()
            boolean r1 = r1.m6684(r2)
            if (r1 != 0) goto L6b1
            goto L6da
        L6b1:
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = "pet_elf_camp_daily_plant_limit"
            int r2 = r0.intValue()
            p000.ui1.m5873(r1, r2)
            int r1 = r0.intValue()
            if (r1 != 0) goto L6c5
            java.lang.String r0 = "不限制"
            goto L6d6
        L6c5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " 次"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L6d6:
            r15.invoke(r0)
            goto L6e1
        L6da:
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r10, r4)
            r0.show()
        L6e1:
            return r17
        L6e2:
            r0 = r25
            fo1 r0 = (p000.fo1) r0
            java.lang.Object r0 = r0.f4054
            boolean r1 = r0 instanceof p000.eo1
            if (r1 != 0) goto L712
            r1 = r0
            ef1 r1 = (p000.ef1) r1
            java.util.List r1 = r1.f3533
            int r1 = r1.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " 种"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r15.invoke(r1)
            java.lang.String r1 = "食物列表已更新"
            android.widget.Toast r1 = android.widget.Toast.makeText(r13, r1, r4)
            r1.show()
        L712:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L72b
            java.lang.String r1 = "更新失败"
            r15.invoke(r1)
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L725
            java.lang.String r0 = ""
        L725:
            java.lang.String r1 = "食物列表更新失败: "
            r6 = 1
            p000.a12.m21(r6, r13, r1, r0)
        L72b:
            return r17
        L72c:
            r0 = r25
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            boolean r1 = p000.q02.m4671(r0)
            if (r1 != 0) goto L758
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = "spark_message"
            r2 = 50
            java.lang.String r2 = p000.q02.m4693(r0, r2)
            p000.ui1.m5875(r1, r2)
            java.lang.String r1 = "续期消息已更新"
            android.widget.Toast r1 = android.widget.Toast.makeText(r13, r1, r4)
            r1.show()
            r1 = 15
            java.lang.String r0 = p000.bv1.m1042(r0, r1)
            r15.invoke(r0)
        L758:
            return r17
        L759:
            r0 = r25
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.String[] r1 = p000.kn0.f6046
            r2 = 3
            if (r0 < 0) goto L76b
            if (r0 >= r2) goto L76b
            r0 = r1[r0]
            goto L76d
        L76b:
            java.lang.String r0 = "custom"
        L76d:
            bv1 r3 = p000.bv1.f1853
            java.lang.String r3 = "spark_message_source"
            p000.ui1.m5875(r3, r0)
            int r0 = p000.AbstractC0312g7.m2254(r1, r0)
            java.lang.String[] r1 = p000.kn0.f6045
            if (r0 < 0) goto L781
            if (r0 >= r2) goto L781
            r0 = r1[r0]
            goto L787
        L781:
            java.lang.Object r0 = p000.AbstractC0312g7.m2249(r1)
            java.lang.String r0 = (java.lang.String) r0
        L787:
            r15.invoke(r0)
            java.lang.String r0 = "续期消息来源已更新"
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r0, r4)
            r0.show()
            return r17
        L794:
            r0 = r25
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            r2 = 10
            java.lang.Integer r0 = p000.x02.m6487(r0, r2)
            if (r0 == 0) goto L7e6
            int r1 = r0.intValue()
            r2 = -1
            if (r1 < r2) goto L7e6
            int r1 = r0.intValue()
            r2 = 23
            if (r1 > r2) goto L7e6
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = "spark_auto_renew_trigger_hour"
            int r2 = r0.intValue()
            p000.ui1.m5873(r1, r2)
            int r1 = r0.intValue()
            if (r1 >= 0) goto L7c6
            java.lang.String r0 = "日期切换时触发"
            goto L7d9
        L7c6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "每日 "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ":00 后触发"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L7d9:
            r15.invoke(r0)
            java.lang.String r0 = "触发时间已更新"
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r0, r4)
            r0.show()
            goto L7ef
        L7e6:
            java.lang.String r0 = "请输入 -1 或 0~23 之间的整数"
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r0, r4)
            r0.show()
        L7ef:
            return r17
        L7f0:
            r0 = r25
            gc1 r0 = (p000.gc1) r0
            r0.getClass()
            ii0 r1 = new ii0
            r2 = 7
            r1.<init>(r15, r2, r0)
            r13.runOnUiThread(r1)
            return r17
        L801:
            r6 = 1
            r0 = r25
            android.net.Uri r0 = (android.net.Uri) r0
            if (r0 == 0) goto L80f
            boolean r1 = p000.AbstractC1021yh.m6884(r13, r0)
            if (r1 == 0) goto L80f
            r11 = r0
        L80f:
            if (r11 == 0) goto L812
            goto L813
        L812:
            r6 = r4
        L813:
            java.lang.String r0 = "download_saf_auth_state"
            if (r11 == 0) goto L841
            java.lang.String r1 = r11.toString()
            r1.getClass()
            java.lang.String r2 = "download_uri"
            p000.AbstractC1021yh.m6905(r13, r2, r1)
            java.lang.String r1 = "granted"
            p000.AbstractC1021yh.m6905(r13, r0, r1)
            java.lang.String r0 = r11.toString()
            r0.getClass()
            java.lang.String r0 = p000.AbstractC1021yh.m6894(r0)
            java.lang.String r1 = "下载目录已授权："
            java.lang.String r0 = r1.concat(r0)
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r0, r4)
            r0.show()
            goto L846
        L841:
            java.lang.String r1 = "canceled"
            p000.AbstractC1021yh.m6905(r13, r0, r1)
        L846:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r15.invoke(r0)
            return r17
    }
}
