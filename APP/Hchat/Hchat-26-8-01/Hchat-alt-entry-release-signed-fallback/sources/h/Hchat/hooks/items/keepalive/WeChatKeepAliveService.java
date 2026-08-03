package h.Hchat.hooks.items.keepalive;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatKeepAliveService extends android.app.Service {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f4605k = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final android.os.Handler f4606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final rg.f f4609j;

    public WeChatKeepAliveService() {
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.f4606g = r0
            rg.f r0 = new rg.f
            r1 = 1
            r0.<init>(r2, r1)
            r2.f4609j = r0
            return
    }

    public final android.app.Notification a() {
            r6 = this;
            java.lang.Class<android.app.NotificationManager> r0 = android.app.NotificationManager.class
            java.lang.Object r0 = r6.getSystemService(r0)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            android.app.NotificationChannel r1 = new android.app.NotificationChannel
            java.lang.String r2 = "hchat_wechat_keep_alive"
            java.lang.String r3 = "Hchat 微信保活"
            r4 = 1
            r1.<init>(r2, r3, r4)
            r3 = 0
            r1.setShowBadge(r3)
            r1.enableLights(r3)
            r1.enableVibration(r3)
            r5 = 0
            r1.setSound(r5, r5)
            if (r0 == 0) goto L25
            r0.createNotificationChannel(r1)
        L25:
            android.app.Notification$Builder r0 = new android.app.Notification$Builder
            r0.<init>(r6, r2)
            r1 = 2131034120(0x7f050008, float:1.7678749E38)
            android.app.Notification$Builder r0 = r0.setSmallIcon(r1)
            java.lang.String r1 = "Hchat 微信强保活"
            android.app.Notification$Builder r0 = r0.setContentTitle(r1)
            java.lang.String r1 = "正在尝试保持微信息屏运行"
            android.app.Notification$Builder r0 = r0.setContentText(r1)
            android.app.Notification$Builder r0 = r0.setOngoing(r4)
            android.app.Notification$Builder r0 = r0.setShowWhen(r3)
            android.app.Notification r0 = r0.build()
            r0.getClass()
            return r0
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.app.Service
    public final void onDestroy() {
            r2 = this;
            android.os.Handler r0 = r2.f4606g
            rg.f r1 = r2.f4609j
            r0.removeCallbacks(r1)
            super.onDestroy()
            return
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent r4, int r5, int r6) {
            r3 = this;
            rg.f r5 = r3.f4609j
            android.os.Handler r6 = r3.f4606g
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L14
            java.lang.String r2 = "h.Hchat.extra.WATCHDOG"
            boolean r2 = r4.getBooleanExtra(r2, r1)     // Catch: java.lang.Throwable -> L12
            if (r2 != r0) goto L14
            r2 = r0
            goto L15
        L12:
            r4 = move-exception
            goto L3c
        L14:
            r2 = r1
        L15:
            r3.f4607h = r2     // Catch: java.lang.Throwable -> L12
            if (r4 == 0) goto L22
            java.lang.String r2 = "h.Hchat.extra.NETWORK_HEARTBEAT"
            boolean r4 = r4.getBooleanExtra(r2, r1)     // Catch: java.lang.Throwable -> L12
            if (r4 != r0) goto L22
            r1 = r0
        L22:
            r3.f4608i = r1     // Catch: java.lang.Throwable -> L12
            android.app.Notification r4 = r3.a()     // Catch: java.lang.Throwable -> L12
            r1 = 520134(0x7efc6, float:7.28863E-40)
            r3.startForeground(r1, r4)     // Catch: java.lang.Throwable -> L12
            r6.removeCallbacks(r5)     // Catch: java.lang.Throwable -> L12
            r1 = 60000(0xea60, double:2.9644E-319)
            r6.postDelayed(r5, r1)     // Catch: java.lang.Throwable -> L12
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L12
            goto L42
        L3c:
            sf.f r5 = new sf.f
            r5.<init>(r4)
            r4 = r5
        L42:
            java.lang.Throwable r5 = sf.g.b(r4)
            if (r5 == 0) goto L51
            java.lang.String r6 = r5.getMessage()
            java.lang.String r0 = "[Hchat:KeepAliveService] 启动前台保活服务失败: "
            eh.a.x(r0, r6, r5)
        L51:
            r5 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r6 = r4 instanceof sf.f
            if (r6 == 0) goto L5b
            r4 = r5
        L5b:
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            return r4
    }
}
