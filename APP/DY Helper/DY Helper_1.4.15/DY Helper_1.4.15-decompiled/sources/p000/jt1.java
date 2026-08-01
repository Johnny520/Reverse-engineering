package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jt1 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f5580;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f5581;

    public /* synthetic */ jt1(android.app.Activity r1, int r2) {
            r0 = this;
            r0.f5580 = r2
            r0.f5581 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r15) {
            r14 = this;
            int r0 = r14.f5580
            r1 = 1
            r2 = 2
            r3 = 4
            r4 = 0
            r5 = 0
            android.app.Activity r6 = r14.f5581
            s62 r7 = p000.s62.f9751
            switch(r0) {
                case 0: goto L1f5;
                case 1: goto L1cc;
                case 2: goto L1ab;
                case 3: goto L191;
                case 4: goto L172;
                case 5: goto L15d;
                case 6: goto L136;
                case 7: goto L113;
                case 8: goto L102;
                case 9: goto Le1;
                case 10: goto Lba;
                case 11: goto L9b;
                case 12: goto L6b;
                case 13: goto L44;
                case 14: goto L30;
                default: goto Le;
            }
        Le:
            a80 r15 = (p000.a80) r15
            java.lang.String r14 = "#99FFFFFF"
            r15.getClass()
            java.lang.String r0 = "seekbar_time_color"
            java.lang.String r0 = p000.ui1.m5893(r0, r14)     // Catch: java.lang.Exception -> L20
            int r14 = android.graphics.Color.parseColor(r0)     // Catch: java.lang.Exception -> L20
            goto L24
        L20:
            int r14 = android.graphics.Color.parseColor(r14)
        L24:
            hu r0 = new hu
            r1 = 7
            r0.<init>(r15, r6, r1)
            java.lang.String r15 = "设置时间文字颜色"
            com.example.dyhelper.p002ui.C0169.m1584(r6, r15, r14, r5, r0)
            return r7
        L30:
            a80 r15 = (p000.a80) r15
            r15.getClass()
            java.lang.String r14 = "更新中…"
            r15.invoke(r14)
            hu r14 = new hu
            r0 = 5
            r14.<init>(r15, r6, r0)
            p000.pf1.m4519(r6, r4, r14)
            return r7
        L44:
            a80 r15 = (p000.a80) r15
            r15.getClass()
            bv1 r0 = p000.bv1.f1853
            java.lang.String r0 = "pet_elf_auto_feed_max_price"
            android.content.SharedPreferences r1 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L55
            int r5 = r1.getInt(r0, r5)     // Catch: java.lang.Throwable -> L55
        L55:
            java.lang.String r11 = java.lang.String.valueOf(r5)
            hu r13 = new hu
            r0 = 13
            android.app.Activity r8 = r14.f5581
            r13.<init>(r8, r15, r0)
            java.lang.String r9 = "设置投喂价格上限"
            java.lang.String r10 = "输入 0~100；设置为 0 最安全，只允许实时价格为 0 的食物"
            r12 = 2
            p000.bv1.m1053(r8, r9, r10, r11, r12, r13)
            return r7
        L6b:
            a80 r15 = (p000.a80) r15
            r15.getClass()
            bv1 r14 = p000.bv1.f1853
            java.lang.String r14 = "spark_message_source"
            java.lang.String r0 = "custom"
            java.lang.String r14 = p000.ui1.m5893(r14, r0)
            java.lang.String[] r0 = p000.kn0.f6046
            int r14 = p000.AbstractC0312g7.m2254(r0, r14)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            if (r14 < 0) goto L87
            r4 = r0
        L87:
            if (r4 == 0) goto L8d
            int r5 = r4.intValue()
        L8d:
            java.lang.String[] r14 = p000.kn0.f6045
            hu r0 = new hu
            r1 = 3
            r0.<init>(r15, r6, r1)
            java.lang.String r15 = "选择续期消息来源"
            p000.bv1.m1054(r6, r15, r14, r5, r0)
            return r7
        L9b:
            a80 r15 = (p000.a80) r15
            r15.getClass()
            bv1 r0 = p000.bv1.f1853
            java.lang.String r0 = "spark_message"
            java.lang.String r1 = "火花"
            java.lang.String r11 = p000.ui1.m5893(r0, r1)
            hu r13 = new hu
            android.app.Activity r8 = r14.f5581
            r13.<init>(r8, r15, r3)
            java.lang.String r9 = "设置续期消息"
            java.lang.String r10 = "输入续期时发送的消息内容"
            r12 = 1
            p000.bv1.m1053(r8, r9, r10, r11, r12, r13)
            return r7
        Lba:
            a80 r15 = (p000.a80) r15
            r15.getClass()
            bv1 r0 = p000.bv1.f1853
            java.lang.String r0 = "spark_auto_renew_trigger_hour"
            r1 = -1
            android.content.SharedPreferences r3 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> Lcc
            int r1 = r3.getInt(r0, r1)     // Catch: java.lang.Throwable -> Lcc
        Lcc:
            java.lang.String r11 = java.lang.String.valueOf(r1)
            hu r13 = new hu
            android.app.Activity r8 = r14.f5581
            r13.<init>(r15, r8, r2)
            java.lang.String r9 = "设置触发小时"
            java.lang.String r10 = "输入 -1（日期切换）或 0~23（指定小时）"
            r12 = 4098(0x1002, float:5.743E-42)
            p000.bv1.m1053(r8, r9, r10, r11, r12, r13)
            return r7
        Le1:
            a80 r15 = (p000.a80) r15
            r15.getClass()
            bv1 r0 = p000.bv1.f1853
            java.lang.String r0 = "pet_elf_mutual_message"
            java.lang.String r1 = "火星任务"
            java.lang.String r11 = p000.ui1.m5893(r0, r1)
            hu r13 = new hu
            r0 = 10
            android.app.Activity r8 = r14.f5581
            r13.<init>(r8, r15, r0)
            java.lang.String r9 = "设置互发消息默认内容"
            java.lang.String r10 = "用于每日火星互发消息任务，最多 48 个字符"
            r12 = 1
            p000.bv1.m1053(r8, r9, r10, r11, r12, r13)
            return r7
        L102:
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r14 = r15.intValue()
            bv1 r15 = p000.bv1.f1853
            java.lang.String r15 = "comment_bg_image_blur_radius"
            p000.ui1.m5873(r15, r14)
            p000.jx0.m3047(r6)
            return r7
        L113:
            a80 r15 = (p000.a80) r15
            java.lang.String r14 = "#FF1A1A2E"
            r15.getClass()
            java.lang.String r0 = "comment_bg_color"
            java.lang.String r0 = p000.ui1.m5893(r0, r14)     // Catch: java.lang.Exception -> L125
            int r14 = android.graphics.Color.parseColor(r0)     // Catch: java.lang.Exception -> L125
            goto L129
        L125:
            int r14 = android.graphics.Color.parseColor(r14)
        L129:
            hu r0 = new hu
            r2 = 16
            r0.<init>(r15, r6, r2)
            java.lang.String r15 = "设置背景颜色"
            com.example.dyhelper.p002ui.C0169.m1584(r6, r15, r14, r1, r0)
            return r7
        L136:
            a80 r15 = (p000.a80) r15
            r15.getClass()
            nt r14 = new nt
            r14.<init>(r15, r2)
            java.util.concurrent.ExecutorService r15 = p000.wv1.f11875
            r6.getClass()
            boolean r15 = r6.isFinishing()
            if (r15 != 0) goto L15c
            boolean r15 = r6.isDestroyed()
            if (r15 == 0) goto L152
            goto L15c
        L152:
            ii0 r15 = new ii0
            r0 = 25
            r15.<init>(r6, r0, r14)
            r6.runOnUiThread(r15)
        L15c:
            return r7
        L15d:
            a80 r15 = (p000.a80) r15
            r15.getClass()
            android.app.AlertDialog r14 = p000.ia0.f4971
            r6.getClass()
            n9 r14 = new n9
            r15 = 15
            r14.<init>(r6, r15)
            r6.runOnUiThread(r14)
            return r7
        L172:
            a80 r15 = (p000.a80) r15
            r15.getClass()
            bv1 r0 = p000.bv1.f1853
            java.lang.String r0 = "video_length_alert_toast_msg"
            java.lang.String r1 = "当前视频时长超过 %d 分钟"
            java.lang.String r11 = p000.ui1.m5893(r0, r1)
            xj0 r13 = new xj0
            r13.<init>(r15, r3)
            android.app.Activity r8 = r14.f5581
            java.lang.String r9 = "设置提醒文案"
            java.lang.String r10 = "使用 %d 代表视频时长分钟数"
            r12 = 1
            p000.bv1.m1053(r8, r9, r10, r11, r12, r13)
            return r7
        L191:
            a80 r15 = (p000.a80) r15
            r15.getClass()
            p000.u72.m5796(r6)
            p000.u72.m5792(r1)
            java.lang.String r14 = "检查中..."
            r15.invoke(r14)
            java.lang.String r14 = "正在检查更新"
            android.widget.Toast r14 = android.widget.Toast.makeText(r6, r14, r5)
            r14.show()
            return r7
        L1ab:
            a80 r15 = (p000.a80) r15
            r15.getClass()
            bv1 r0 = p000.bv1.f1853
            java.lang.String r0 = "precise_time_format"
            java.lang.String r1 = "yyyy-MM-dd HH:mm"
            java.lang.String r11 = p000.ui1.m5893(r0, r1)
            hu r13 = new hu
            r0 = 21
            android.app.Activity r8 = r14.f5581
            r13.<init>(r8, r15, r0)
            java.lang.String r9 = "设置时间格式"
            java.lang.String r10 = ""
            r12 = 1
            p000.bv1.m1053(r8, r9, r10, r11, r12, r13)
            return r7
        L1cc:
            a80 r15 = (p000.a80) r15
            r15.getClass()
            bv1 r0 = p000.bv1.f1853
            java.lang.String r0 = "hidden_contact_peek_duration_seconds"
            r1 = 30
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L1df
            int r1 = r2.getInt(r0, r1)     // Catch: java.lang.Throwable -> L1df
        L1df:
            java.lang.String r11 = java.lang.String.valueOf(r1)
            hu r13 = new hu
            r0 = 12
            android.app.Activity r8 = r14.f5581
            r13.<init>(r8, r15, r0)
            java.lang.String r9 = "双击显示时长"
            java.lang.String r10 = "输入 5~300 的整数（秒）"
            r12 = 2
            p000.bv1.m1053(r8, r9, r10, r11, r12, r13)
            return r7
        L1f5:
            a80 r15 = (p000.a80) r15
            r15.getClass()
            bv1 r0 = p000.bv1.f1853
            java.lang.String r0 = "duration_alert_message"
            java.lang.String r1 = "你已经刷了 %d 分钟了,休息一下吧~"
            java.lang.String r11 = p000.ui1.m5893(r0, r1)
            xj0 r13 = new xj0
            r0 = 6
            r13.<init>(r15, r0)
            android.app.Activity r8 = r14.f5581
            java.lang.String r9 = "设置提醒文案"
            java.lang.String r10 = "使用 %d 代表已观看的分钟数"
            r12 = 1
            p000.bv1.m1053(r8, r9, r10, r11, r12, r13)
            return r7
    }
}
