package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eu1 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3672;

    public /* synthetic */ eu1(int r1) {
            r0 = this;
            r0.f3672 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r8) {
            r7 = this;
            int r7 = r7.f3672
            r0 = 4
            r1 = 0
            r2 = 20
            r3 = 0
            r5 = 1
            r6 = 0
            switch(r7) {
                case 0: goto L287;
                case 1: goto L263;
                case 2: goto L25b;
                case 3: goto L252;
                case 4: goto L24a;
                case 5: goto L241;
                case 6: goto L238;
                case 7: goto L22f;
                case 8: goto L226;
                case 9: goto L21d;
                case 10: goto L214;
                case 11: goto L20b;
                case 12: goto L202;
                case 13: goto L1f9;
                case 14: goto L1f0;
                case 15: goto L1e7;
                case 16: goto L1c7;
                case 17: goto L1b3;
                case 18: goto L19d;
                case 19: goto L18d;
                case 20: goto L176;
                case 21: goto L15f;
                case 22: goto L13b;
                case 23: goto L133;
                case 24: goto L12c;
                case 25: goto Lcd;
                case 26: goto L6f;
                case 27: goto L23;
                case 28: goto L14;
                default: goto Ld;
            }
        Ld:
            java.lang.Class r8 = (java.lang.Class) r8
            java.lang.String r7 = r8.getName()
            return r7
        L14:
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            int r7 = r8.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L23:
            java.lang.ClassLoader r8 = (java.lang.ClassLoader) r8
            r8.getClass()
            ry1 r7 = p000.ry1.f9602
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.ry1.f9585
            boolean r0 = r0.compareAndSet(r6, r5)
            if (r0 != 0) goto L33
            goto L6c
        L33:
            java.lang.String r0 = "Spark DexKit 首扫完成，部署依赖 Hook"
            p000.ry1.m5274(r0)
            r7.m5306(r8)
            r7.m5305(r8)
            st r7 = p000.C0810st.f10010
            r7.m5569(r8)
            java.util.concurrent.ConcurrentHashMap r7 = p000.ry1.f9620
            java.util.Collection r7 = r7.values()
            r7.getClass()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L52:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L6c
            java.lang.Object r8 = r7.next()
            ky1 r8 = (p000.ky1) r8
            long r0 = r8.f6324
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L52
            st r2 = p000.C0810st.f10010     // Catch: java.lang.Throwable -> L52
            java.lang.String r8 = r8.f6322     // Catch: java.lang.Throwable -> L52
            r2.m5567(r0, r8)     // Catch: java.lang.Throwable -> L52
            goto L52
        L6c:
            s62 r7 = p000.s62.f9751
            return r7
        L6f:
            java.lang.ClassLoader r8 = (java.lang.ClassLoader) r8
            r8.getClass()
            qx r7 = new qx
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6273
            java.lang.String r0 = p000.C0666ox.m4320(r0, r8)
            java.lang.String r1 = "定位火花会话 CoreInfo 方法"
            k41 r3 = new k41
            r3.<init>(r8, r2)
            r7.<init>(r0, r1, r3)
            qx r0 = new qx
            kx r1 = p000.EnumC0491kx.f6276
            java.lang.String r1 = p000.C0666ox.m4306(r1, r8)
            java.lang.String r2 = "定位火花官方发送回调接口"
            k41 r3 = new k41
            r4 = 21
            r3.<init>(r8, r4)
            r0.<init>(r1, r2, r3)
            qx r1 = new qx
            kx r2 = p000.EnumC0491kx.f6275
            java.lang.String r2 = p000.C0666ox.m4306(r2, r8)
            java.lang.String r3 = "定位火花官方发送工厂类"
            k41 r4 = new k41
            r5 = 22
            r4.<init>(r8, r5)
            r1.<init>(r2, r3, r4)
            qx r2 = new qx
            kx r3 = p000.EnumC0491kx.f6277
            java.lang.String r3 = p000.C0666ox.m4306(r3, r8)
            java.lang.String r4 = "定位火花官方消息发送器"
            k41 r5 = new k41
            r6 = 23
            r5.<init>(r8, r6)
            r2.<init>(r3, r4, r5)
            qx[] r7 = new p000.C0740qx[]{r7, r0, r1, r2}
            java.util.List r7 = p000.AbstractC1021yh.m6897(r7)
            return r7
        Lcd:
            java.lang.String r8 = (java.lang.String) r8
            r8.getClass()
            java.util.concurrent.ConcurrentHashMap r7 = p000.bd1.f1663
            r7.clear()
            java.util.concurrent.ConcurrentHashMap r7 = p000.bd1.f1664
            r7.clear()
            java.util.concurrent.ConcurrentHashMap r7 = p000.bd1.f1665
            r7.clear()
            java.util.concurrent.atomic.AtomicReference r7 = p000.bd1.f1666
            r7.set(r1)
            java.util.concurrent.atomic.AtomicReference r7 = p000.bd1.f1667
            r7.set(r1)
            java.util.Map r7 = p000.bd1.f1668
            r7.getClass()
            monitor-enter(r7)
            r7.clear()     // Catch: java.lang.Throwable -> L129
            monitor-exit(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = p000.dd1.f3097
            r7.set(r6)
            java.util.concurrent.atomic.AtomicLong r7 = p000.dd1.f3098
            r7.set(r3)
            p000.dd1.m1712()
            java.lang.CharSequence r7 = p000.q02.m4660(r8)
            java.lang.String r7 = r7.toString()
            java.lang.Long r7 = p000.x02.m6488(r7)
            if (r7 == 0) goto L126
            long r5 = r7.longValue()
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 <= 0) goto L119
            r1 = r7
        L119:
            if (r1 == 0) goto L126
            long r7 = r1.longValue()
            ry1 r0 = p000.ry1.f9602
            java.lang.String r0 = "PrefsManager.profileChanged"
            p000.ry1.m5288(r7, r0)
        L126:
            s62 r7 = p000.s62.f9751
            return r7
        L129:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        L12c:
            yw1 r8 = (p000.yw1) r8
            eu1 r7 = p000.ax1.f1360
            s62 r7 = p000.s62.f9751
            return r7
        L133:
            java.lang.String r8 = (java.lang.String) r8
            r8.getClass()
            s62 r7 = p000.s62.f9751
            return r7
        L13b:
            android.app.Activity r8 = (android.app.Activity) r8
            r8.getClass()
            bv1 r7 = p000.bv1.f1853
            boolean r7 = p000.bv1.m1033()
            if (r7 != 0) goto L15a
            java.lang.String r7 = "volume_key_enabled"
            boolean r7 = p000.ui1.m5887(r7, r5)
            if (r7 != 0) goto L15a
            java.lang.String r7 = "share_panel_enabled"
            boolean r7 = p000.ui1.m5887(r7, r5)
            if (r7 == 0) goto L159
            goto L15a
        L159:
            r5 = r6
        L15a:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        L15f:
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r7 = r8.intValue()
            bv1 r8 = p000.bv1.f1853
            java.lang.String r8 = "auto_scroll_article_dwell_seconds"
            r0 = 5
            r1 = 120(0x78, float:1.68E-43)
            int r7 = p000.j81.m2906(r7, r0, r1)
            p000.ui1.m5873(r8, r7)
            s62 r7 = p000.s62.f9751
            return r7
        L176:
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r7 = r8.intValue()
            bv1 r8 = p000.bv1.f1853
            java.lang.String r8 = "auto_scroll_image_dwell_seconds"
            r0 = 3
            r1 = 60
            int r7 = p000.j81.m2906(r7, r0, r1)
            p000.ui1.m5873(r8, r7)
            s62 r7 = p000.s62.f9751
            return r7
        L18d:
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r7 = r8.intValue()
            bv1 r8 = p000.bv1.f1853
            java.lang.String r8 = "auto_scroll_delay_ms"
            p000.ui1.m5873(r8, r7)
            s62 r7 = p000.s62.f9751
            return r7
        L19d:
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r7 = r8.intValue()
            bv1 r8 = p000.bv1.f1853
            java.lang.String r8 = "seekbar_time_alpha"
            r0 = 100
            int r7 = p000.j81.m2906(r7, r6, r0)
            p000.ui1.m5873(r8, r7)
            s62 r7 = p000.s62.f9751
            return r7
        L1b3:
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r7 = r8.intValue()
            bv1 r8 = p000.bv1.f1853
            java.lang.String r8 = "seekbar_time_text_size"
            int r7 = p000.j81.m2906(r7, r0, r2)
            p000.ui1.m5873(r8, r7)
            s62 r7 = p000.s62.f9751
            return r7
        L1c7:
            fo1 r8 = (p000.fo1) r8
            java.lang.Object r7 = r8.f4054
            java.lang.Throwable r7 = p000.fo1.m2190(r7)
            if (r7 == 0) goto L1e4
            java.lang.String r8 = "DYHelper"
            java.lang.String r7 = r7.getMessage()
            if (r7 != 0) goto L1db
            java.lang.String r7 = ""
        L1db:
            java.lang.String r2 = "首次打开设置获取食物目录失败: "
            java.lang.String r7 = r2.concat(r7)
            p000.C0888ux.m5988(r8, r7, r1, r0, r1)
        L1e4:
            s62 r7 = p000.s62.f9751
            return r7
        L1e7:
            android.app.Activity r8 = (android.app.Activity) r8
            java.lang.String r7 = "seekbar_time_enabled"
            java.lang.Boolean r7 = p000.AbstractC0602nx.m4124(r8, r7, r6)
            return r7
        L1f0:
            android.app.Activity r8 = (android.app.Activity) r8
            java.lang.String r7 = "auto_pause_on_complete_enabled"
            java.lang.Boolean r7 = p000.AbstractC0602nx.m4124(r8, r7, r6)
            return r7
        L1f9:
            android.app.Activity r8 = (android.app.Activity) r8
            java.lang.String r7 = "auto_scroll_next_enabled"
            java.lang.Boolean r7 = p000.AbstractC0602nx.m4124(r8, r7, r6)
            return r7
        L202:
            android.app.Activity r8 = (android.app.Activity) r8
            java.lang.String r7 = "video_length_alert_enabled"
            java.lang.Boolean r7 = p000.AbstractC0602nx.m4124(r8, r7, r6)
            return r7
        L20b:
            android.app.Activity r8 = (android.app.Activity) r8
            java.lang.String r7 = "block_douyin_duration_reminder_enabled"
            java.lang.Boolean r7 = p000.AbstractC0602nx.m4124(r8, r7, r6)
            return r7
        L214:
            android.app.Activity r8 = (android.app.Activity) r8
            java.lang.String r7 = "duration_alert_enabled"
            java.lang.Boolean r7 = p000.AbstractC0602nx.m4124(r8, r7, r6)
            return r7
        L21d:
            android.app.Activity r8 = (android.app.Activity) r8
            java.lang.String r7 = "im_auto_read_enabled"
            java.lang.Boolean r7 = p000.AbstractC0602nx.m4124(r8, r7, r6)
            return r7
        L226:
            android.app.Activity r8 = (android.app.Activity) r8
            java.lang.String r7 = "im_disable_read_receipt_report"
            java.lang.Boolean r7 = p000.AbstractC0602nx.m4124(r8, r7, r6)
            return r7
        L22f:
            android.app.Activity r8 = (android.app.Activity) r8
            java.lang.String r7 = "im_time_label_enabled"
            java.lang.Boolean r7 = p000.AbstractC0602nx.m4124(r8, r7, r6)
            return r7
        L238:
            android.app.Activity r8 = (android.app.Activity) r8
            java.lang.String r7 = "im_anti_recall_enabled"
            java.lang.Boolean r7 = p000.AbstractC0602nx.m4124(r8, r7, r6)
            return r7
        L241:
            android.app.Activity r8 = (android.app.Activity) r8
            java.lang.String r7 = "filter_enabled"
            java.lang.Boolean r7 = p000.AbstractC0602nx.m4124(r8, r7, r6)
            return r7
        L24a:
            android.app.Activity r8 = (android.app.Activity) r8
            r8.getClass()
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L252:
            android.app.Activity r8 = (android.app.Activity) r8
            java.lang.String r7 = "version_update_check_enabled"
            java.lang.Boolean r7 = p000.AbstractC0602nx.m4124(r8, r7, r6)
            return r7
        L25b:
            android.app.Activity r8 = (android.app.Activity) r8
            r8.getClass()
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L263:
            android.app.Activity r8 = (android.app.Activity) r8
            r8.getClass()
            java.lang.String r7 = "download_show_top_notification"
            boolean r7 = p000.ui1.m5887(r7, r5)
            if (r7 != 0) goto L282
            java.lang.String r7 = "spark_show_top_notification"
            boolean r7 = p000.ui1.m5887(r7, r5)
            if (r7 != 0) goto L282
            java.lang.String r7 = "pet_elf_camp_show_top_notification"
            boolean r7 = p000.ui1.m5887(r7, r5)
            if (r7 == 0) goto L281
            goto L282
        L281:
            r5 = r6
        L282:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        L287:
            android.app.Activity r8 = (android.app.Activity) r8
            java.lang.String r7 = "info_bar_enabled"
            java.lang.Boolean r7 = p000.AbstractC0602nx.m4124(r8, r7, r6)
            return r7
    }
}
