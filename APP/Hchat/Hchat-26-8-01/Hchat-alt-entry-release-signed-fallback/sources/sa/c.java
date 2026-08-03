package sa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f12407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f12408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f12409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f12410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final android.os.Handler f12411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile long f12412f;

    public c(android.content.Context r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.f12411e = r0
            r2.f12407a = r3
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 == 0) goto L18
            java.lang.String r4 = "[Hchat:RedPacketNotifier]"
        L18:
            r2.f12408b = r4
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 == 0) goto L22
            java.lang.String r5 = "Hchat_redpacket_notify_manual_v2"
        L22:
            r2.f12409c = r5
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 == 0) goto L2c
            java.lang.String r6 = "Hchat 红包提醒"
        L2c:
            r2.f12410d = r6
            return
    }

    public final android.app.PendingIntent a(int r9, java.lang.String r10, java.lang.String r11) {
            r8 = this;
            android.content.Context r0 = r8.f12407a
            r1 = 872415232(0x34000000, float:1.1920929E-7)
            r2 = 0
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L1c
            r3.<init>()     // Catch: java.lang.Throwable -> L1c
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L1d
            java.lang.String r5 = r0.getPackageName()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r6 = "com.tencent.mm.ui.LauncherUI"
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L1d
            r3.setComponent(r4)     // Catch: java.lang.Throwable -> L1d
            r3.addFlags(r1)     // Catch: java.lang.Throwable -> L1d
            goto L1d
        L1c:
            r3 = r2
        L1d:
            if (r3 != 0) goto L30
            android.content.pm.PackageManager r4 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L30
            java.lang.String r5 = r0.getPackageName()     // Catch: java.lang.Throwable -> L30
            android.content.Intent r3 = r4.getLaunchIntentForPackage(r5)     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L30
            r3.addFlags(r1)     // Catch: java.lang.Throwable -> L30
        L30:
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            r4 = 1
            if (r1 != 0) goto L5f
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L5f
            r1.<init>()     // Catch: java.lang.Throwable -> L5f
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L60
            java.lang.String r6 = r0.getPackageName()     // Catch: java.lang.Throwable -> L60
            java.lang.String r7 = "com.tencent.mm.ui.chatting.ChattingUI"
            r5.<init>(r6, r7)     // Catch: java.lang.Throwable -> L60
            r1.setComponent(r5)     // Catch: java.lang.Throwable -> L60
            java.lang.String r5 = "Chat_User"
            r1.putExtra(r5, r10)     // Catch: java.lang.Throwable -> L60
            java.lang.String r5 = "Chat_Mode"
            r1.putExtra(r5, r4)     // Catch: java.lang.Throwable -> L60
            java.lang.String r5 = "finish_direct"
            r1.putExtra(r5, r4)     // Catch: java.lang.Throwable -> L60
            r5 = 603979776(0x24000000, float:2.7755576E-17)
            r1.addFlags(r5)     // Catch: java.lang.Throwable -> L60
            goto L60
        L5f:
            r1 = r2
        L60:
            if (r3 == 0) goto L69
            if (r1 == 0) goto L69
            android.content.Intent[] r1 = new android.content.Intent[]{r3, r1}
            goto L78
        L69:
            if (r1 == 0) goto L70
            android.content.Intent[] r1 = new android.content.Intent[]{r1}
            goto L78
        L70:
            if (r3 == 0) goto L77
            android.content.Intent[] r1 = new android.content.Intent[]{r3}
            goto L78
        L77:
            r1 = r2
        L78:
            if (r1 == 0) goto Lbb
            int r3 = r1.length
            if (r3 != 0) goto L7e
            goto Lbb
        L7e:
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            boolean r5 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> Laf
            if (r5 == 0) goto L98
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> Laf
            if (r11 == 0) goto L92
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Laf
            goto L9d
        L92:
            int r10 = r10.hashCode()     // Catch: java.lang.Throwable -> Laf
        L96:
            long r10 = (long) r10     // Catch: java.lang.Throwable -> Laf
            goto L9d
        L98:
            int r10 = r11.hashCode()     // Catch: java.lang.Throwable -> Laf
            goto L96
        L9d:
            r5 = 1048575(0xfffff, double:5.18065E-318)
            long r10 = r10 & r5
            long r10 = r10 << r4
            r5 = 1275068416(0x4c000000, double:6.299675004E-315)
            long r10 = r10 | r5
            if (r9 != 0) goto La9
            r4 = 0
        La9:
            long r4 = (long) r4
            long r9 = r10 | r4
        Lac:
            long r9 = r9 & r2
            int r9 = (int) r9
            goto Lb4
        Laf:
            long r9 = java.lang.System.currentTimeMillis()
            goto Lac
        Lb4:
            r10 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r9 = android.app.PendingIntent.getActivities(r0, r9, r1, r10)
            return r9
        Lbb:
            return r2
    }

    public final void b(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, boolean r24, boolean r25, boolean r26, boolean r27, java.lang.String r28) {
            r17 = this;
            r1 = r17
            r0 = r19
            r2 = r21
            r3 = r23
            r4 = r27
            java.lang.String r5 = " 通知失败: "
            r6 = 1
            if (r25 == 0) goto L22
            boolean r7 = android.text.TextUtils.isEmpty(r20)     // Catch: java.lang.Throwable -> L51
            if (r7 == 0) goto L16
            goto L22
        L16:
            android.os.Handler r7 = r1.f12411e     // Catch: java.lang.Throwable -> L51
            rb.g r8 = new rb.g     // Catch: java.lang.Throwable -> L51
            r9 = r20
            r8.<init>(r1, r6, r9)     // Catch: java.lang.Throwable -> L51
            r7.post(r8)     // Catch: java.lang.Throwable -> L51
        L22:
            if (r24 != 0) goto L26
            goto L1b6
        L26:
            android.content.Context r7 = r1.f12407a     // Catch: java.lang.Throwable -> L51
            java.lang.String r8 = "notification"
            java.lang.Object r7 = r7.getSystemService(r8)     // Catch: java.lang.Throwable -> L51
            android.app.NotificationManager r7 = (android.app.NotificationManager) r7     // Catch: java.lang.Throwable -> L51
            if (r7 != 0) goto L34
            goto L1b6
        L34:
            boolean r8 = r7.areNotificationsEnabled()     // Catch: java.lang.Throwable -> L51
            if (r8 != 0) goto L54
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51
            r0.<init>()     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = r1.f12408b     // Catch: java.lang.Throwable -> L51
            r0.append(r2)     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = " 通知失败: 微信通知权限已关闭"
            r0.append(r2)     // Catch: java.lang.Throwable -> L51
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L51
            fb.v0.m(r0)     // Catch: java.lang.Throwable -> L51
            return
        L51:
            r0 = move-exception
            goto L19b
        L54:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51
            r8.<init>()     // Catch: java.lang.Throwable -> L51
            java.lang.String r9 = r1.f12409c     // Catch: java.lang.Throwable -> L51
            r8.append(r9)     // Catch: java.lang.Throwable -> L51
            java.lang.String r9 = "_v"
            r8.append(r9)     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto L68
            java.lang.String r9 = "1"
            goto L6a
        L68:
            java.lang.String r9 = "0"
        L6a:
            r8.append(r9)     // Catch: java.lang.Throwable -> L51
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L51
            android.app.NotificationChannel r9 = new android.app.NotificationChannel     // Catch: java.lang.Throwable -> L51
            java.lang.String r10 = r1.f12410d     // Catch: java.lang.Throwable -> L51
            r11 = 4
            r9.<init>(r8, r10, r11)     // Catch: java.lang.Throwable -> L51
            r9.enableVibration(r4)     // Catch: java.lang.Throwable -> L51
            r10 = 0
            if (r4 == 0) goto L85
            long[] r11 = new long[r11]     // Catch: java.lang.Throwable -> L51
            r11 = {x01b8: FILL_ARRAY_DATA , data: [0, 180, 80, 180} // fill-array     // Catch: java.lang.Throwable -> L51
            goto L86
        L85:
            r11 = r10
        L86:
            r9.setVibrationPattern(r11)     // Catch: java.lang.Throwable -> L51
            r9.setSound(r10, r10)     // Catch: java.lang.Throwable -> L51
            r7.createNotificationChannel(r9)     // Catch: java.lang.Throwable -> L51
            android.app.NotificationChannel r9 = r7.getNotificationChannel(r8)     // Catch: java.lang.Throwable -> L51
            if (r9 == 0) goto Lba
            int r9 = r9.getImportance()     // Catch: java.lang.Throwable -> L51
            if (r9 != 0) goto Lba
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51
            r0.<init>()     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = r1.f12408b     // Catch: java.lang.Throwable -> L51
            r0.append(r2)     // Catch: java.lang.Throwable -> L51
            r0.append(r5)     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = r1.f12410d     // Catch: java.lang.Throwable -> L51
            r0.append(r2)     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = "通知渠道已关闭"
            r0.append(r2)     // Catch: java.lang.Throwable -> L51
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L51
            fb.v0.m(r0)     // Catch: java.lang.Throwable -> L51
            return
        Lba:
            android.content.Context r9 = r1.f12407a     // Catch: java.lang.Throwable -> L51
            android.content.pm.ApplicationInfo r9 = r9.getApplicationInfo()     // Catch: java.lang.Throwable -> L51
            int r9 = r9.icon     // Catch: java.lang.Throwable -> L51
            if (r9 != 0) goto Lc7
            r9 = 17301659(0x108009b, float:2.497969E-38)
        Lc7:
            android.app.Notification$Builder r10 = new android.app.Notification$Builder     // Catch: java.lang.Throwable -> L51
            android.content.Context r11 = r1.f12407a     // Catch: java.lang.Throwable -> L51
            r10.<init>(r11, r8)     // Catch: java.lang.Throwable -> L51
            r8 = r22
            android.app.PendingIntent r11 = r1.a(r3, r2, r8)     // Catch: java.lang.Throwable -> L51
            r12 = 2
            if (r4 == 0) goto Ld9
            r4 = r12
            goto Lda
        Ld9:
            r4 = 0
        Lda:
            android.app.Notification$Builder r9 = r10.setSmallIcon(r9)     // Catch: java.lang.Throwable -> L51
            r13 = r18
            android.app.Notification$Builder r9 = r9.setContentTitle(r13)     // Catch: java.lang.Throwable -> L51
            android.app.Notification$Builder r9 = r9.setContentText(r0)     // Catch: java.lang.Throwable -> L51
            android.app.Notification$Builder r0 = r9.setTicker(r0)     // Catch: java.lang.Throwable -> L51
            long r13 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L51
            android.app.Notification$Builder r0 = r0.setWhen(r13)     // Catch: java.lang.Throwable -> L51
            android.app.Notification$Builder r0 = r0.setShowWhen(r6)     // Catch: java.lang.Throwable -> L51
            android.app.Notification$Builder r0 = r0.setAutoCancel(r6)     // Catch: java.lang.Throwable -> L51
            android.app.Notification$Builder r0 = r0.setPriority(r6)     // Catch: java.lang.Throwable -> L51
            r0.setDefaults(r4)     // Catch: java.lang.Throwable -> L51
            if (r11 == 0) goto L108
            r10.setContentIntent(r11)     // Catch: java.lang.Throwable -> L51
        L108:
            android.content.Context r0 = r1.f12407a     // Catch: java.lang.Throwable -> L51
            android.graphics.Bitmap r0 = d9.o.f(r0, r2)     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L113
            r10.setLargeIcon(r0)     // Catch: java.lang.Throwable -> L51
        L113:
            r13 = 2147483647(0x7fffffff, double:1.060997895E-314)
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L144
            if (r0 == 0) goto L121
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L144
            goto L126
        L121:
            int r0 = r8.hashCode()     // Catch: java.lang.Throwable -> L144
            long r8 = (long) r0     // Catch: java.lang.Throwable -> L144
        L126:
            long r2 = (long) r3     // Catch: java.lang.Throwable -> L144
            r15 = 1023(0x3ff, double:5.054E-321)
            long r8 = r8 & r15
            r0 = 10
            long r8 = r8 << r0
            r15 = 1258291200(0x4b000000, double:6.216784544E-315)
            long r8 = r8 | r15
            r15 = 63
            long r2 = r2 & r15
            r0 = 20
            long r2 = r2 << r0
            long r2 = r2 | r8
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L144
            r15 = 1048575(0xfffff, double:5.18065E-318)
            long r8 = r8 & r15
            long r2 = r2 | r8
        L141:
            long r2 = r2 & r13
            int r0 = (int) r2
            goto L149
        L144:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L51
            goto L141
        L149:
            android.app.Notification r2 = r10.build()     // Catch: java.lang.Throwable -> L51
            r7.notify(r0, r2)     // Catch: java.lang.Throwable -> L51
            if (r26 == 0) goto L1b6
            boolean r0 = android.text.TextUtils.isEmpty(r28)     // Catch: java.lang.Throwable -> L178
            if (r0 == 0) goto L15d
            android.net.Uri r0 = android.media.RingtoneManager.getDefaultUri(r12)     // Catch: java.lang.Throwable -> L178
            goto L17c
        L15d:
            java.lang.String r0 = r28.trim()     // Catch: java.lang.Throwable -> L178
            java.lang.String r2 = "://"
            boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> L178
            if (r2 == 0) goto L16e
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L178
            goto L17c
        L16e:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L178
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L178
            android.net.Uri r0 = android.net.Uri.fromFile(r2)     // Catch: java.lang.Throwable -> L178
            goto L17c
        L178:
            android.net.Uri r0 = android.media.RingtoneManager.getDefaultUri(r12)     // Catch: java.lang.Throwable -> L51
        L17c:
            if (r0 != 0) goto L17f
            goto L1b6
        L17f:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L51
            long r6 = r1.f12412f     // Catch: java.lang.Throwable -> L51
            long r6 = r2 - r6
            r8 = 1200(0x4b0, double:5.93E-321)
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 >= 0) goto L18e
            goto L1b6
        L18e:
            r1.f12412f = r2     // Catch: java.lang.Throwable -> L51
            android.os.Handler r2 = r1.f12411e     // Catch: java.lang.Throwable -> L51
            rb.g r3 = new rb.g     // Catch: java.lang.Throwable -> L51
            r3.<init>(r1, r12, r0)     // Catch: java.lang.Throwable -> L51
            r2.post(r3)     // Catch: java.lang.Throwable -> L51
            goto L1b6
        L19b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r1.f12408b
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = r0.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            fb.v0.n(r2, r0)
        L1b6:
            return
    }
}
