package e9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f2460a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f2461b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f2462c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ExecutorService f2463d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ExecutorService f2464e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final android.os.Handler f2465f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f2466g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f2467h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f2468i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f2469j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f2470k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final java.lang.ThreadLocal f2471l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile java.lang.String f2472m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile long f2473n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile android.content.SharedPreferences f2474o;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            e9.q.f2460a = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            e9.q.f2461b = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r1)
            e9.q.f2462c = r0
            c9.q r0 = new c9.q
            r1 = 3
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor(r0)
            e9.q.f2463d = r0
            c9.q r0 = new c9.q
            r1 = 4
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor(r0)
            e9.q.f2464e = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            e9.q.f2465f = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            e9.q.f2466g = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            e9.q.f2467h = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            e9.q.f2468i = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            e9.q.f2469j = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            e9.q.f2470k = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            e9.q.f2471l = r0
            return
    }

    public static boolean A(e9.c r1, java.lang.String r2) {
            boolean r1 = r1.f2404o
            r0 = 0
            if (r1 == 0) goto L6
            return r0
        L6:
            h8.a r1 = h.Hchat.hooks.api.core.WeChatApis.conversations()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L14
            boolean r1 = r1.e(r2)     // Catch: java.lang.Throwable -> L19
            r2 = 1
            if (r1 != r2) goto L14
            r0 = r2
        L14:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L19
            goto L20
        L19:
            r1 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r1)
            r1 = r2
        L20:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r0 = r1 instanceof sf.f
            if (r0 == 0) goto L27
            r1 = r2
        L27:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
    }

    public static final void a(android.content.Context r8, int r9, java.lang.String r10, boolean r11) {
            java.lang.String r0 = "notification"
            java.lang.Object r0 = r8.getSystemService(r0)
            boolean r1 = r0 instanceof android.app.NotificationManager
            r2 = 0
            if (r1 == 0) goto Le
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 == 0) goto Ld3
            r1 = 0
            android.service.notification.StatusBarNotification[] r3 = r0.getActiveNotifications()     // Catch: java.lang.Throwable -> L2c
            r3.getClass()     // Catch: java.lang.Throwable -> L2c
            int r4 = r3.length     // Catch: java.lang.Throwable -> L2c
            r5 = r1
        L1b:
            if (r5 >= r4) goto L31
            r6 = r3[r5]     // Catch: java.lang.Throwable -> L2c
            java.lang.String r7 = r6.getTag()     // Catch: java.lang.Throwable -> L2c
            if (r7 != 0) goto L2e
            int r7 = r6.getId()     // Catch: java.lang.Throwable -> L2c
            if (r7 != r9) goto L2e
            goto L32
        L2c:
            r3 = move-exception
            goto L3b
        L2e:
            int r5 = r5 + 1
            goto L1b
        L31:
            r6 = r2
        L32:
            if (r6 == 0) goto L39
            android.app.Notification r3 = r6.getNotification()     // Catch: java.lang.Throwable -> L2c
            goto L41
        L39:
            r3 = r2
            goto L41
        L3b:
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        L41:
            boolean r4 = r3 instanceof sf.f
            if (r4 == 0) goto L47
            goto L48
        L47:
            r2 = r3
        L48:
            android.app.Notification r2 = (android.app.Notification) r2
            if (r2 == 0) goto Lce
            long r3 = java.lang.System.nanoTime()
            android.app.Notification$Builder r8 = android.app.Notification.Builder.recoverBuilder(r8, r2)     // Catch: java.lang.Throwable -> L6d
            r5 = 1
            android.app.Notification$Builder r8 = r8.setOnlyAlertOnce(r5)     // Catch: java.lang.Throwable -> L6d
            if (r11 == 0) goto L6f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            r6.<init>()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r7 = "已回复："
            r6.append(r7)     // Catch: java.lang.Throwable -> L6d
            r6.append(r10)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L6d
            goto L71
        L6d:
            r8 = move-exception
            goto L9b
        L6f:
            java.lang.String r6 = "发送失败，请重试"
        L71:
            android.app.Notification$Builder r8 = r8.setContentText(r6)     // Catch: java.lang.Throwable -> L6d
            android.os.Bundle r6 = new android.os.Bundle     // Catch: java.lang.Throwable -> L6d
            android.os.Bundle r2 = r2.extras     // Catch: java.lang.Throwable -> L6d
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r2 = "hchat_custom_notification_reply_completion_token"
            r6.putLong(r2, r3)     // Catch: java.lang.Throwable -> L6d
            android.app.Notification$Builder r8 = r8.setExtras(r6)     // Catch: java.lang.Throwable -> L6d
            r8.getClass()     // Catch: java.lang.Throwable -> L6d
            if (r11 == 0) goto L91
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[r5]     // Catch: java.lang.Throwable -> L6d
            r2[r1] = r10     // Catch: java.lang.Throwable -> L6d
            r8.setRemoteInputHistory(r2)     // Catch: java.lang.Throwable -> L6d
        L91:
            android.app.Notification r8 = r8.build()     // Catch: java.lang.Throwable -> L6d
            r0.notify(r9, r8)     // Catch: java.lang.Throwable -> L6d
            sf.n r8 = sf.n.f12433a     // Catch: java.lang.Throwable -> L6d
            goto La1
        L9b:
            sf.f r10 = new sf.f
            r10.<init>(r8)
            r8 = r10
        La1:
            java.lang.Throwable r8 = sf.g.b(r8)
            if (r8 == 0) goto Lbe
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r1 = "[Hchat:CustomNotification] 快捷回复通知状态更新失败: "
            r10.<init>(r1)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            fb.v0.n(r10, r8)
            if (r11 == 0) goto Ld3
            r0.cancel(r9)
            goto Ld3
        Lbe:
            if (r11 != 0) goto Lc1
            goto Ld3
        Lc1:
            e9.f r8 = new e9.f
            r8.<init>(r0, r9, r3)
            r9 = 1200(0x4b0, double:5.93E-321)
            android.os.Handler r11 = e9.q.f2465f
            r11.postDelayed(r8, r9)
            goto Ld3
        Lce:
            if (r11 == 0) goto Ld3
            r0.cancel(r9)
        Ld3:
            return
    }

    public static final void b(java.lang.Object r12, android.content.Context r13) {
            if (r12 != 0) goto L4
            goto L113
        L4:
            e9.s r0 = new e9.s
            r0.<init>(r13)
            java.lang.String r1 = "custom_notification_enable"
            boolean r1 = r0.b(r1)
            java.lang.String r2 = "Hchat_custom_friend_avatar_config"
            android.content.SharedPreferences r3 = ub.b.c(r13, r2)
            java.lang.String r4 = "enable"
            r5 = 0
            boolean r3 = r3.getBoolean(r4, r5)
            r4 = 1
            if (r3 == 0) goto L2d
            android.content.SharedPreferences r2 = ub.b.c(r13, r2)
            java.lang.String r3 = "scope_notifications"
            boolean r2 = r2.getBoolean(r3, r4)
            if (r2 == 0) goto L2d
            r2 = r4
            goto L2e
        L2d:
            r2 = r5
        L2e:
            java.lang.String r3 = "Hchat_block_at_all_notification_config"
            android.content.SharedPreferences r13 = ub.b.c(r13, r3)
            java.lang.String r3 = "block_at_all_notification_enable"
            boolean r13 = r13.getBoolean(r3, r5)
            if (r1 != 0) goto L42
            if (r2 != 0) goto L42
            if (r13 != 0) goto L42
            goto L113
        L42:
            java.lang.String r3 = "talker"
            java.lang.String r6 = "talkerUserName"
            java.lang.String r7 = "h"
            java.lang.String r8 = "userName"
            java.lang.String r9 = "username"
            java.lang.String[] r3 = new java.lang.String[]{r7, r8, r9, r3, r6}
            java.lang.String r3 = w(r12, r3)
            java.lang.String r6 = "notification"
            java.lang.String r7 = "mNotification"
            java.lang.String r8 = "f"
            java.lang.String[] r6 = new java.lang.String[]{r8, r6, r7}
            r7 = r5
        L5f:
            r8 = 3
            r9 = 0
            if (r7 < r8) goto L97
            java.lang.Class r6 = r12.getClass()
            java.util.List r6 = h.Hchat.utils.KavaReflector.declaredFields(r6)
            java.util.Iterator r6 = r6.iterator()
        L6f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto La6
            java.lang.Object r7 = r6.next()
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            java.lang.Class<android.app.Notification> r8 = android.app.Notification.class
            java.lang.Class r10 = r7.getType()
            boolean r8 = r8.isAssignableFrom(r10)
            if (r8 == 0) goto L92
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.readField(r7, r12)
            boolean r8 = r7 instanceof android.app.Notification
            if (r8 == 0) goto L92
            android.app.Notification r7 = (android.app.Notification) r7
            goto L93
        L92:
            r7 = r9
        L93:
            if (r7 == 0) goto L6f
            r9 = r7
            goto La6
        L97:
            r8 = r6[r7]
            java.lang.Object r8 = h.Hchat.utils.KavaReflector.readField(r12, r8)
            boolean r10 = r8 instanceof android.app.Notification
            if (r10 == 0) goto La4
            r9 = r8
            android.app.Notification r9 = (android.app.Notification) r9
        La4:
            if (r9 == 0) goto L114
        La6:
            if (r1 != 0) goto Laa
            if (r13 == 0) goto Lab
        Laa:
            r5 = r4
        Lab:
            r6 = 0
            if (r5 == 0) goto Lbc
            java.lang.String r4 = "i"
            java.lang.String r8 = "msgId"
            java.lang.String[] r4 = new java.lang.String[]{r4, r8}
            long r10 = v(r12, r4)
            goto Lbd
        Lbc:
            r10 = r6
        Lbd:
            boolean r4 = og.m.t0(r3)
            if (r4 != 0) goto L113
            if (r9 != 0) goto Lc6
            goto L113
        Lc6:
            android.os.Bundle r4 = r9.extras
            if (r4 != 0) goto Ld1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r9.extras = r4
        Ld1:
            java.lang.String r4 = "hchat_custom_notification_talker"
            if (r1 != 0) goto Ld9
            if (r2 != 0) goto Ld9
            if (r13 == 0) goto Lde
        Ld9:
            android.os.Bundle r13 = r9.extras
            r13.putString(r4, r3)
        Lde:
            if (r5 == 0) goto Leb
            int r13 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r13 <= 0) goto Leb
            android.os.Bundle r13 = r9.extras
            java.lang.String r2 = "hchat_custom_notification_native_msg_svr_id"
            r13.putLong(r2, r10)
        Leb:
            if (r1 != 0) goto Lee
            goto L113
        Lee:
            e9.c r13 = r0.a(r3)
            if (r13 == 0) goto L113
            boolean r13 = r13.f2395f
            if (r13 != 0) goto Lf9
            goto L113
        Lf9:
            android.os.Bundle r13 = r9.extras
            r13.putString(r4, r3)
            java.lang.String r13 = "m"
            java.lang.String r0 = "j"
            java.lang.String[] r13 = new java.lang.String[]{r13, r0}
            int r12 = u(r12, r13)
            if (r12 <= 0) goto L113
            android.os.Bundle r13 = r9.extras
            java.lang.String r0 = "hchat_custom_notification_unread_count"
            r13.putInt(r0, r12)
        L113:
            return
        L114:
            int r7 = r7 + 1
            goto L5f
    }

    public static final boolean c(java.lang.String r5, long r6, long r8, java.lang.String r10, boolean r11) {
            k8.g r0 = p.a.q()
            if (r0 == 0) goto L76
            if (r11 == 0) goto L71
            java.lang.Long r11 = java.lang.Long.valueOf(r6)
            r1 = 0
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            r7 = 0
            if (r6 <= 0) goto L14
            goto L15
        L14:
            r11 = r7
        L15:
            if (r11 == 0) goto L19
            r7 = r11
            goto L63
        L19:
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 <= 0) goto L22
            goto L23
        L22:
            r6 = r7
        L23:
            if (r6 == 0) goto L63
            long r8 = r6.longValue()
            k8.s r6 = h.Hchat.hooks.api.core.WeChatApis.messageStore()     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L3e
            h.Hchat.hooks.api.model.WeChatMessage r6 = r6.e(r8, r5)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L3e
            long r3 = r6.msgId     // Catch: java.lang.Throwable -> L3c
            java.lang.Long r6 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L3c
            goto L46
        L3c:
            r6 = move-exception
            goto L40
        L3e:
            r6 = r7
            goto L46
        L40:
            sf.f r11 = new sf.f
            r11.<init>(r6)
            r6 = r11
        L46:
            boolean r11 = r6 instanceof sf.f
            if (r11 == 0) goto L4c
            r6 = r7
        L4c:
            java.lang.Long r6 = (java.lang.Long) r6
            if (r6 == 0) goto L5f
            long r3 = r6.longValue()
            int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r11 <= 0) goto L59
            r7 = r6
        L59:
            if (r7 == 0) goto L5f
            long r8 = r7.longValue()
        L5f:
            java.lang.Long r7 = java.lang.Long.valueOf(r8)
        L63:
            if (r7 == 0) goto L71
            long r6 = r7.longValue()
            boolean r6 = r0.u(r6, r5, r10)
            if (r6 == 0) goto L71
            r5 = 1
            goto L75
        L71:
            boolean r5 = r0.x(r5, r10)
        L75:
            return r5
        L76:
            r5 = 0
            return r5
    }

    public static int d(android.content.Context r8, java.lang.String r9) {
            java.lang.String r0 = "notification"
            java.lang.Object r8 = r8.getSystemService(r0)
            boolean r0 = r8 instanceof android.app.NotificationManager
            r1 = 0
            if (r0 == 0) goto Le
            android.app.NotificationManager r8 = (android.app.NotificationManager) r8
            goto Lf
        Le:
            r8 = r1
        Lf:
            r0 = 0
            if (r8 == 0) goto L6b
            android.service.notification.StatusBarNotification[] r8 = r8.getActiveNotifications()     // Catch: java.lang.Throwable -> L3e
            r8.getClass()     // Catch: java.lang.Throwable -> L3e
            int r2 = r8.length     // Catch: java.lang.Throwable -> L3e
            r3 = r0
            r4 = r3
        L1c:
            if (r3 >= r2) goto L50
            r5 = r8[r3]     // Catch: java.lang.Throwable -> L3e
            android.app.Notification r5 = r5.getNotification()     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L48
            android.os.Bundle r6 = r5.extras     // Catch: java.lang.Throwable -> L3e
            if (r6 == 0) goto L48
            java.lang.String r7 = "hchat_custom_notification"
            boolean r6 = r6.getBoolean(r7, r0)     // Catch: java.lang.Throwable -> L3e
            r7 = 1
            if (r6 != r7) goto L48
            android.os.Bundle r5 = r5.extras     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L40
            java.lang.String r6 = "hchat_custom_notification_talker"
            java.lang.String r5 = r5.getString(r6)     // Catch: java.lang.Throwable -> L3e
            goto L41
        L3e:
            r8 = move-exception
            goto L55
        L40:
            r5 = r1
        L41:
            boolean r5 = gg.l.a(r5, r9)     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L48
            goto L49
        L48:
            r7 = r0
        L49:
            if (r7 == 0) goto L4d
            int r4 = r4 + 1
        L4d:
            int r3 = r3 + 1
            goto L1c
        L50:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L3e
            goto L5b
        L55:
            sf.f r9 = new sf.f
            r9.<init>(r8)
            r8 = r9
        L5b:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            boolean r0 = r8 instanceof sf.f
            if (r0 == 0) goto L64
            r8 = r9
        L64:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            return r8
        L6b:
            return r0
    }

    public static e9.l e(android.content.Context r25, e9.c r26, k8.o r27) {
            r0 = r25
            r1 = r26
            r2 = r27
            java.lang.String r3 = r2.f7445b
            h.Hchat.hooks.api.model.WeChatMessage r4 = r2.f7454k
            java.lang.String r5 = r1.f2391b
            java.lang.String r6 = r1.f2392c
            java.lang.String r7 = g4.a.k(r5)
            boolean r8 = og.m.t0(r7)
            if (r8 == 0) goto L21
            boolean r7 = og.m.t0(r6)
            if (r7 == 0) goto L20
            r7 = r5
            goto L21
        L20:
            r7 = r6
        L21:
            boolean r8 = r1.f2403n
            r9 = 0
            r10 = 0
            java.lang.String r11 = "[收到一条新消息]"
            if (r8 == 0) goto L260
            if (r4 == 0) goto L30
            java.lang.String r8 = r4.bodyContent()
            goto L31
        L30:
            r8 = r10
        L31:
            java.lang.String r12 = ""
            if (r8 != 0) goto L36
            r8 = r12
        L36:
            boolean r13 = og.m.t0(r8)
            if (r13 == 0) goto L3e
            java.lang.String r8 = r2.f7448e
        L3e:
            java.lang.String r8 = p.a.l(r8, r8)
            java.lang.String r13 = "text"
            boolean r13 = r13.equals(r3)
            if (r13 == 0) goto L5f
            java.lang.String r3 = ":\n"
            r13 = 6
            int r3 = og.m.r0(r8, r3, r9, r9, r13)
            if (r3 <= 0) goto L59
            int r3 = r3 + 2
            java.lang.String r8 = r8.substring(r3)
        L59:
            java.lang.String r3 = y(r8)
            goto L20f
        L5f:
            boolean r13 = r2.k()
            if (r13 == 0) goto L69
            java.lang.String r3 = "[图片]"
            goto L20f
        L69:
            boolean r13 = r2.u()
            if (r13 == 0) goto L73
            java.lang.String r3 = "[语音]"
            goto L20f
        L73:
            boolean r13 = r2.t()
            if (r13 == 0) goto L7d
            java.lang.String r3 = "[视频]"
            goto L20f
        L7d:
            boolean r13 = r2.h()
            if (r13 == 0) goto L87
            java.lang.String r3 = "[表情]"
            goto L20f
        L87:
            boolean r13 = r2.m()
            if (r13 == 0) goto L9b
            java.lang.String r3 = s(r8)
            boolean r8 = og.m.t0(r3)
            if (r8 == 0) goto L20f
            java.lang.String r3 = "[位置]"
            goto L20f
        L9b:
            java.lang.String r13 = "red_packet"
            boolean r13 = r13.equals(r3)
            if (r13 == 0) goto La7
            java.lang.String r3 = "[红包]"
            goto L20f
        La7:
            java.lang.String r13 = "transfer"
            boolean r13 = r13.equals(r3)
            if (r13 != 0) goto L1e6
            if (r4 == 0) goto Lb9
            boolean r13 = r4.isTransfer()
            if (r13 == 0) goto Lb9
            goto L1e6
        Lb9:
            boolean r13 = r2.p()
            if (r13 == 0) goto L11d
            if (r4 == 0) goto Lc6
            h.Hchat.hooks.api.model.WeChatQuoteMsg r3 = r4.getQuoteMsg()
            goto Lc7
        Lc6:
            r3 = r10
        Lc7:
            if (r3 == 0) goto Lcc
            java.lang.String r13 = r3.title
            goto Lcd
        Lcc:
            r13 = r10
        Lcd:
            if (r13 != 0) goto Ld0
            r13 = r12
        Ld0:
            java.lang.String r13 = y(r13)
            if (r3 == 0) goto Ld9
            java.lang.String r3 = r3.content
            goto Lda
        Ld9:
            r3 = r10
        Lda:
            if (r3 != 0) goto Ldd
            r3 = r12
        Ldd:
            java.lang.String r3 = y(r3)
            boolean r14 = og.m.t0(r13)
            java.lang.String r15 = "[引用] "
            if (r14 != 0) goto Lf7
            boolean r14 = og.m.t0(r3)
            if (r14 != 0) goto Lf7
            java.lang.String r8 = " | "
            java.lang.String r3 = bc.e.j(r15, r13, r8, r3)
            goto L20f
        Lf7:
            boolean r14 = og.m.t0(r13)
            if (r14 != 0) goto L103
            java.lang.String r3 = r15.concat(r13)
            goto L20f
        L103:
            boolean r13 = og.m.t0(r3)
            if (r13 != 0) goto L10f
            java.lang.String r3 = r15.concat(r3)
            goto L20f
        L10f:
            java.lang.String r3 = s(r8)
            boolean r8 = og.m.t0(r3)
            if (r8 == 0) goto L20f
            java.lang.String r3 = "[引用]"
            goto L20f
        L11d:
            boolean r13 = r2.i()
            if (r13 == 0) goto L15b
            if (r4 == 0) goto L12a
            h.Hchat.hooks.api.model.WeChatFileMsg r3 = r4.getFileMsg()
            goto L12b
        L12a:
            r3 = r10
        L12b:
            if (r3 == 0) goto L130
            java.lang.String r8 = r3.title
            goto L131
        L130:
            r8 = r10
        L131:
            if (r8 != 0) goto L134
            r8 = r12
        L134:
            boolean r13 = og.m.t0(r8)
            if (r13 == 0) goto L145
            if (r3 == 0) goto L13f
            java.lang.String r3 = r3.fileName
            goto L140
        L13f:
            r3 = r10
        L140:
            if (r3 != 0) goto L144
            r8 = r12
            goto L145
        L144:
            r8 = r3
        L145:
            java.lang.String r3 = y(r8)
            boolean r8 = og.m.t0(r3)
            if (r8 != 0) goto L157
            java.lang.String r8 = "[文件] "
            java.lang.String r3 = r8.concat(r3)
            goto L20f
        L157:
            java.lang.String r3 = "[文件]"
            goto L20f
        L15b:
            boolean r13 = r2.l()
            if (r13 == 0) goto L167
            java.lang.String r3 = s(r8)
            goto L20f
        L167:
            java.lang.String r13 = "music"
            boolean r13 = r13.equals(r3)
            if (r13 != 0) goto L1e1
            if (r4 == 0) goto L179
            boolean r13 = r4.isMusic()
            if (r13 == 0) goto L179
            goto L1e1
        L179:
            java.lang.String r13 = "note"
            boolean r13 = r13.equals(r3)
            if (r13 != 0) goto L1dc
            if (r4 == 0) goto L18a
            boolean r13 = r4.isNote()
            if (r13 == 0) goto L18a
            goto L1dc
        L18a:
            boolean r13 = r2.r()
            if (r13 == 0) goto L196
            java.lang.String r3 = s(r8)
            goto L20f
        L196:
            java.lang.String r13 = "video_number_video"
            boolean r3 = r13.equals(r3)
            if (r3 != 0) goto L1d7
            if (r4 == 0) goto L1a7
            boolean r3 = r4.isVideoNumberVideo()
            if (r3 == 0) goto L1a7
            goto L1d7
        L1a7:
            if (r4 == 0) goto L1b3
            boolean r3 = r4.isVoipVideo()
            if (r3 == 0) goto L1b3
            java.lang.String r3 = "[视频通话]"
            goto L20f
        L1b3:
            if (r4 == 0) goto L1be
            boolean r3 = r4.isVoipVoice()
            if (r3 == 0) goto L1be
            java.lang.String r3 = "[语音通话]"
            goto L20f
        L1be:
            boolean r3 = r2.v()
            if (r3 == 0) goto L1c7
            java.lang.String r3 = "[通话]"
            goto L20f
        L1c7:
            boolean r3 = r2.f()
            if (r3 == 0) goto L1d2
            java.lang.String r3 = s(r8)
            goto L20f
        L1d2:
            java.lang.String r3 = s(r8)
            goto L20f
        L1d7:
            java.lang.String r3 = s(r8)
            goto L20f
        L1dc:
            java.lang.String r3 = s(r8)
            goto L20f
        L1e1:
            java.lang.String r3 = s(r8)
            goto L20f
        L1e6:
            h.Hchat.hooks.api.model.WeChatTransferMsg r3 = r2.f7459p
            if (r3 == 0) goto L1eb
            goto L1f3
        L1eb:
            if (r4 == 0) goto L1f2
            h.Hchat.hooks.api.model.WeChatTransferMsg r3 = r4.getTransferMsg()
            goto L1f3
        L1f2:
            r3 = r10
        L1f3:
            if (r3 == 0) goto L1f8
            java.lang.String r3 = r3.description
            goto L1f9
        L1f8:
            r3 = r10
        L1f9:
            if (r3 != 0) goto L1fc
            r3 = r12
        L1fc:
            java.lang.String r3 = y(r3)
            boolean r8 = og.m.t0(r3)
            if (r8 != 0) goto L20d
            java.lang.String r8 = "[转账] "
            java.lang.String r3 = r8.concat(r3)
            goto L20f
        L20d:
            java.lang.String r3 = "[转账]"
        L20f:
            boolean r8 = og.m.t0(r3)
            if (r8 == 0) goto L216
            goto L217
        L216:
            r11 = r3
        L217:
            boolean r1 = r1.f2393d
            if (r1 == 0) goto L260
            java.lang.String r1 = r2.f7447d
            boolean r3 = og.m.t0(r1)
            if (r3 == 0) goto L227
            java.lang.String r1 = r2.c()
        L227:
            r1.getClass()
            boolean r2 = og.m.t0(r1)
            if (r2 != 0) goto L240
            g8.i r2 = wb.en.c()
            if (r2 == 0) goto L23b
            java.lang.String r1 = r2.t(r5, r1)
            goto L23c
        L23b:
            r1 = r10
        L23c:
            if (r1 != 0) goto L23f
            goto L240
        L23f:
            r12 = r1
        L240:
            java.lang.String r1 = g4.a.k(r5)
            boolean r2 = og.m.t0(r1)
            if (r2 == 0) goto L253
            boolean r1 = og.m.t0(r6)
            if (r1 == 0) goto L251
            r6 = r5
        L251:
            r7 = r6
            goto L254
        L253:
            r7 = r1
        L254:
            boolean r1 = og.m.t0(r12)
            if (r1 != 0) goto L260
            java.lang.String r1 = ": "
            java.lang.String r11 = wb.en.h(r12, r1, r11)
        L260:
            r13 = r7
            r14 = r11
            int r1 = d(r0, r5)
            r2 = 1
            int r15 = r1 + 1
            android.graphics.Bitmap r16 = p(r0, r5)
            r0 = 0
            if (r4 == 0) goto L276
            long r5 = r4.getCreateTime()
            goto L277
        L276:
            r5 = r0
        L277:
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 <= 0) goto L280
            r9 = r2
        L280:
            if (r9 == 0) goto L283
            r10 = r3
        L283:
            if (r10 == 0) goto L28c
            long r2 = r10.longValue()
        L289:
            r17 = r2
            goto L291
        L28c:
            long r2 = java.lang.System.currentTimeMillis()
            goto L289
        L291:
            if (r4 == 0) goto L29a
            long r2 = r4.getMsgId()
            r19 = r2
            goto L29c
        L29a:
            r19 = r0
        L29c:
            if (r4 == 0) goto L2a0
            long r0 = r4.msgSvrId
        L2a0:
            r21 = r0
            e9.l r12 = new e9.l
            r23 = 0
            r24 = 128(0x80, float:1.8E-43)
            r12.<init>(r13, r14, r15, r16, r17, r19, r21, r23, r24)
            return r12
    }

    public static java.lang.Object f(java.lang.Object[] r8) {
            int r0 = r8.length
            r1 = 0
            r2 = r1
        L3:
            r3 = 0
            if (r2 >= r0) goto L12
            r4 = r8[r2]
            boolean r5 = m(r4)
            if (r5 == 0) goto Lf
            goto L13
        Lf:
            int r2 = r2 + 1
            goto L3
        L12:
            r4 = r3
        L13:
            if (r4 == 0) goto L16
            return r4
        L16:
            int r0 = r8.length
        L17:
            if (r1 < r0) goto L1a
            return r3
        L1a:
            r2 = r8[r1]
            if (r2 != 0) goto L1f
            goto L6d
        L1f:
            java.lang.Class r4 = r2.getClass()
            java.util.List r4 = j(r4)
            java.util.Iterator r4 = r4.iterator()
        L2b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L6d
            java.lang.Object r5 = r4.next()
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            java.lang.Class r6 = r5.getType()
            boolean r7 = r6.isPrimitive()
            if (r7 != 0) goto L2b
            boolean r7 = r6.isEnum()
            if (r7 != 0) goto L2b
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L2b
            java.lang.Class<java.lang.Number> r7 = java.lang.Number.class
            boolean r7 = r7.isAssignableFrom(r6)
            if (r7 != 0) goto L2b
            java.lang.Class r7 = java.lang.Boolean.TYPE
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L60
            goto L2b
        L60:
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.readField(r5, r2)
            if (r5 == 0) goto L2b
            boolean r6 = m(r5)
            if (r6 == 0) goto L2b
            return r5
        L6d:
            int r1 = r1 + 1
            goto L17
    }

    public static java.lang.String g(java.lang.String... r5) {
            int r0 = r5.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto L19
            r3 = r5[r2]
            if (r3 == 0) goto L12
            boolean r4 = og.m.t0(r3)
            if (r4 == 0) goto L10
            goto L12
        L10:
            r4 = r1
            goto L13
        L12:
            r4 = 1
        L13:
            if (r4 != 0) goto L16
            goto L1a
        L16:
            int r2 = r2 + 1
            goto L3
        L19:
            r3 = 0
        L1a:
            if (r3 != 0) goto L1f
            java.lang.String r5 = ""
            return r5
        L1f:
            return r3
    }

    public static java.lang.String h(android.content.Context r8, java.lang.String r9) {
            java.lang.String r0 = ".mp3"
            java.lang.String r1 = "ringtone_"
            r8.getClass()
            r9.getClass()
            boolean r2 = og.m.t0(r9)
            java.lang.String r3 = ""
            if (r2 == 0) goto L13
            return r3
        L13:
            android.net.Uri r2 = android.net.Uri.parse(r9)     // Catch: java.lang.Throwable -> L18
            goto L1f
        L18:
            r2 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r2)
            r2 = r4
        L1f:
            boolean r4 = r2 instanceof sf.f
            r5 = 0
            if (r4 == 0) goto L26
            r2 = r5
        L26:
            android.net.Uri r2 = (android.net.Uri) r2
            if (r2 == 0) goto Leb
            java.lang.String r4 = r2.getScheme()
            if (r4 != 0) goto L31
            goto L32
        L31:
            r3 = r4
        L32:
            java.lang.String r4 = "content"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 != 0) goto L3c
            goto Leb
        L3c:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L82
            java.io.File r4 = r8.getExternalFilesDir(r5)     // Catch: java.lang.Throwable -> L82
            java.lang.String r6 = "custom_notification_ringtones"
            r3.<init>(r4, r6)     // Catch: java.lang.Throwable -> L82
            r3.mkdirs()     // Catch: java.lang.Throwable -> L82
            java.lang.String r4 = r2.getLastPathSegment()     // Catch: java.lang.Throwable -> L82
            if (r4 == 0) goto L84
            java.lang.String r4 = android.net.Uri.decode(r4)     // Catch: java.lang.Throwable -> L82
            if (r4 == 0) goto L84
            r6 = 47
            java.lang.String r4 = og.m.L0(r4, r6, r4)     // Catch: java.lang.Throwable -> L82
            r6 = 58
            java.lang.String r4 = og.m.L0(r4, r6, r4)     // Catch: java.lang.Throwable -> L82
            java.lang.String r6 = "[\\\\/:*?\"<>|\\s]+"
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6)     // Catch: java.lang.Throwable -> L82
            r6.getClass()     // Catch: java.lang.Throwable -> L82
            java.lang.String r7 = "_"
            java.util.regex.Matcher r4 = r6.matcher(r4)     // Catch: java.lang.Throwable -> L82
            java.lang.String r4 = r4.replaceAll(r7)     // Catch: java.lang.Throwable -> L82
            r4.getClass()     // Catch: java.lang.Throwable -> L82
            boolean r6 = og.m.t0(r4)     // Catch: java.lang.Throwable -> L82
            if (r6 != 0) goto L7f
            r5 = r4
        L7f:
            if (r5 == 0) goto L84
            goto L94
        L82:
            r8 = move-exception
            goto Ldc
        L84:
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L82
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L82
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L82
            r6.append(r4)     // Catch: java.lang.Throwable -> L82
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L82
        L94:
            r1 = 46
            boolean r1 = og.m.i0(r5, r1)     // Catch: java.lang.Throwable -> L82
            if (r1 == 0) goto L9d
            goto La1
        L9d:
            java.lang.String r5 = r5.concat(r0)     // Catch: java.lang.Throwable -> L82
        La1:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L82
            r0.<init>(r3, r5)     // Catch: java.lang.Throwable -> L82
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L82
            java.io.InputStream r8 = r8.openInputStream(r2)     // Catch: java.lang.Throwable -> L82
            if (r8 == 0) goto Lda
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lcb
            r2 = 0
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> Lcb
            g4.a.j(r8, r1)     // Catch: java.lang.Throwable -> Lcd
            r1.close()     // Catch: java.lang.Throwable -> Lcb
            r8.close()     // Catch: java.lang.Throwable -> L82
            android.net.Uri r8 = android.net.Uri.fromFile(r0)     // Catch: java.lang.Throwable -> L82
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L82
            r8.getClass()     // Catch: java.lang.Throwable -> L82
            goto Le2
        Lcb:
            r0 = move-exception
            goto Ld4
        Lcd:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> Lcf
        Lcf:
            r2 = move-exception
            ig.a.i(r1, r0)     // Catch: java.lang.Throwable -> Lcb
            throw r2     // Catch: java.lang.Throwable -> Lcb
        Ld4:
            throw r0     // Catch: java.lang.Throwable -> Ld5
        Ld5:
            r1 = move-exception
            ig.a.i(r8, r0)     // Catch: java.lang.Throwable -> L82
            throw r1     // Catch: java.lang.Throwable -> L82
        Lda:
            r8 = r9
            goto Le2
        Ldc:
            sf.f r0 = new sf.f
            r0.<init>(r8)
            r8 = r0
        Le2:
            boolean r0 = r8 instanceof sf.f
            if (r0 == 0) goto Le8
            goto Le9
        Le8:
            r9 = r8
        Le9:
            java.lang.String r9 = (java.lang.String) r9
        Leb:
            return r9
    }

    public static void i(r8.g r14) {
            r14.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = e9.q.f2460a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L3bd
            ya.i.a(r14)
            tf.t r0 = tf.t.f13167g
            android.content.Context r3 = r14.f11620a
            java.lang.String r4 = "Hchat_custom_notification_method_cache"
            android.content.SharedPreferences r3 = ub.b.c(r3, r4)
            e9.q.f2474o = r3
            e9.h r3 = new e9.h
            r5 = 0
            r3.<init>(r5)
            java.lang.String r5 = "native_notification_processor"
            java.lang.String r6 = "in sample Notify: needSound: %B, needShake: %B, msgContent: ==, msgType: %d, talker: %s, customNotify: %s, isRevokeMessage:%b"
            java.util.List r3 = r(r14, r5, r6, r3)
            java.util.Iterator r5 = r3.iterator()
        L2e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L46
            java.lang.Object r6 = r5.next()
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            r8.i r7 = r8.i.f11631b
            c9.a2 r8 = new c9.a2
            r9 = 2
            r8.<init>(r14, r9)
            r7.b(r6, r8)
            goto L2e
        L46:
            e9.h r5 = new e9.h
            r6 = 1
            r5.<init>(r6)
            java.lang.String r6 = "native_notification_cleanup"
            java.lang.String r7 = "needRemoveNotificationId:%s"
            java.util.List r5 = r(r14, r6, r7, r5)
            boolean r6 = r3.isEmpty()
            if (r6 != 0) goto L9a
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L61
            goto L9a
        L61:
            java.util.Iterator r3 = r3.iterator()
        L65:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L7d
            java.lang.Object r6 = r3.next()
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            r8.i r7 = r8.i.f11631b
            c9.a2 r8 = new c9.a2
            r9 = 3
            r8.<init>(r14, r9)
            r7.b(r6, r8)
            goto L65
        L7d:
            java.util.Iterator r3 = r5.iterator()
        L81:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L9f
            java.lang.Object r5 = r3.next()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            r8.i r6 = r8.i.f11631b
            ba.f r7 = new ba.f
            r8 = 13
            r7.<init>(r8)
            r6.b(r5, r7)
            goto L81
        L9a:
            java.lang.String r3 = "[Hchat:CustomNotification] 未定位微信隐藏内容通知清理链路"
            fb.v0.m(r3)
        L9f:
            e8.b r3 = e8.b.f2358a
            android.content.SharedPreferences r5 = e9.q.f2474o
            if (r5 == 0) goto La6
            goto Lae
        La6:
            android.content.Context r5 = r14.f11620a
            android.content.SharedPreferences r5 = ub.b.c(r5, r4)
            e9.q.f2474o = r5
        Lae:
            android.content.Context r4 = r14.f11620a
            java.lang.ClassLoader r6 = r14.f11622c
            java.lang.String r4 = e8.b.g(r4, r6)
            java.lang.ClassLoader r6 = r14.f11622c
            java.lang.String r7 = "native_notification_builder"
            java.util.List r6 = e8.b.f(r5, r4, r6, r7)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r6 = r6.iterator()
        Lc7:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto Lde
            java.lang.Object r9 = r6.next()
            r10 = r9
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            boolean r10 = n(r10)
            if (r10 == 0) goto Lc7
            r8.add(r9)
            goto Lc7
        Lde:
            boolean r6 = r8.isEmpty()
            r9 = 0
            if (r6 != 0) goto Le6
            goto Le7
        Le6:
            r8 = r9
        Le7:
            if (r8 == 0) goto Leb
            goto L264
        Leb:
            java.lang.String r6 = "com.tencent.mm.booter.notification.e0"
            java.lang.String r8 = "com.tencent.mm.booter.notification.w"
            java.lang.String[] r6 = new java.lang.String[]{r6, r8}
            java.util.List r6 = a.a.y0(r6)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r6 = r6.iterator()
        L100:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L118
            java.lang.Object r10 = r6.next()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.ClassLoader r11 = r14.f11622c
            java.lang.Class r10 = h.Hchat.utils.KavaReflector.loadClass(r10, r11)
            if (r10 == 0) goto L100
            r8.add(r10)
            goto L100
        L118:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r8 = r8.iterator()
        L121:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L155
            java.lang.Object r10 = r8.next()
            java.lang.Class r10 = (java.lang.Class) r10
            java.util.List r10 = h.Hchat.utils.KavaReflector.declaredMethods(r10)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
        L13a:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L151
            java.lang.Object r12 = r10.next()
            r13 = r12
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            boolean r13 = n(r13)
            if (r13 == 0) goto L13a
            r11.add(r12)
            goto L13a
        L151:
            tf.r.h1(r6, r11)
            goto L121
        L155:
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r6 = r6.iterator()
        L163:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L17e
            java.lang.Object r11 = r6.next()
            r12 = r11
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            java.lang.String r12 = r12.toGenericString()
            boolean r12 = r8.add(r12)
            if (r12 == 0) goto L163
            r10.add(r11)
            goto L163
        L17e:
            boolean r6 = r10.isEmpty()
            if (r6 != 0) goto L18a
            r3.j(r5, r4, r7, r10)
            r8 = r10
            goto L264
        L18a:
            org.luckypray.dexkit.DexKitBridge r6 = r14.f11623d     // Catch: java.lang.Throwable -> L1d6
            ch.e r8 = new ch.e     // Catch: java.lang.Throwable -> L1d6
            r8.<init>()     // Catch: java.lang.Throwable -> L1d6
            fh.k r10 = new fh.k     // Catch: java.lang.Throwable -> L1d6
            r10.<init>()     // Catch: java.lang.Throwable -> L1d6
            java.lang.String r11 = "MicroMsg.Notification.AppMsg.Handle"
            java.util.List r11 = a.a.x0(r11)     // Catch: java.lang.Throwable -> L1d6
            fh.k.u0(r10, r11)     // Catch: java.lang.Throwable -> L1d6
            r8.f1666h = r10     // Catch: java.lang.Throwable -> L1d6
            hh.p r6 = r6.findMethod(r8)     // Catch: java.lang.Throwable -> L1d6
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1d6
            r8.<init>()     // Catch: java.lang.Throwable -> L1d6
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L1d6
        L1ae:
            boolean r10 = r6.hasNext()     // Catch: java.lang.Throwable -> L1d6
            if (r10 == 0) goto L1d8
            java.lang.Object r10 = r6.next()     // Catch: java.lang.Throwable -> L1d6
            hh.o r10 = (hh.o) r10     // Catch: java.lang.Throwable -> L1d6
            java.lang.ClassLoader r11 = r14.f11622c     // Catch: java.lang.Throwable -> L1c1
            java.lang.reflect.Method r10 = r10.r(r11)     // Catch: java.lang.Throwable -> L1c1
            goto L1c8
        L1c1:
            r10 = move-exception
            sf.f r11 = new sf.f     // Catch: java.lang.Throwable -> L1d6
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L1d6
            r10 = r11
        L1c8:
            boolean r11 = r10 instanceof sf.f     // Catch: java.lang.Throwable -> L1d6
            if (r11 == 0) goto L1ce
            r10 = r9
        L1ce:
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10     // Catch: java.lang.Throwable -> L1d6
            if (r10 == 0) goto L1ae
            r8.add(r10)     // Catch: java.lang.Throwable -> L1d6
            goto L1ae
        L1d6:
            r6 = move-exception
            goto L221
        L1d8:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1d6
            r6.<init>()     // Catch: java.lang.Throwable -> L1d6
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L1d6
        L1e1:
            boolean r10 = r8.hasNext()     // Catch: java.lang.Throwable -> L1d6
            if (r10 == 0) goto L1f8
            java.lang.Object r10 = r8.next()     // Catch: java.lang.Throwable -> L1d6
            r11 = r10
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11     // Catch: java.lang.Throwable -> L1d6
            boolean r11 = n(r11)     // Catch: java.lang.Throwable -> L1d6
            if (r11 == 0) goto L1e1
            r6.add(r10)     // Catch: java.lang.Throwable -> L1d6
            goto L1e1
        L1f8:
            java.util.HashSet r8 = new java.util.HashSet     // Catch: java.lang.Throwable -> L1d6
            r8.<init>()     // Catch: java.lang.Throwable -> L1d6
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1d6
            r10.<init>()     // Catch: java.lang.Throwable -> L1d6
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L1d6
        L206:
            boolean r11 = r6.hasNext()     // Catch: java.lang.Throwable -> L1d6
            if (r11 == 0) goto L226
            java.lang.Object r11 = r6.next()     // Catch: java.lang.Throwable -> L1d6
            r12 = r11
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12     // Catch: java.lang.Throwable -> L1d6
            java.lang.String r12 = r12.toGenericString()     // Catch: java.lang.Throwable -> L1d6
            boolean r12 = r8.add(r12)     // Catch: java.lang.Throwable -> L1d6
            if (r12 == 0) goto L206
            r10.add(r11)     // Catch: java.lang.Throwable -> L1d6
            goto L206
        L221:
            sf.f r10 = new sf.f
            r10.<init>(r6)
        L226:
            java.lang.Throwable r6 = sf.g.b(r10)
            if (r6 != 0) goto L22d
            goto L237
        L22d:
            java.lang.String r8 = r6.getMessage()
            java.lang.String r10 = "[Hchat:CustomNotification] 定位微信原生通知构建方法失败: "
            eh.a.x(r10, r8, r6)
            r10 = r0
        L237:
            r8 = r10
            java.util.List r8 = (java.util.List) r8
            boolean r6 = r8.isEmpty()
            if (r6 != 0) goto L244
            r3.j(r5, r4, r7, r8)
            goto L264
        L244:
            java.lang.String r3 = "cache.key"
            android.content.SharedPreferences$Editor r6 = r5.edit()     // Catch: java.lang.Throwable -> L264
            java.lang.String r10 = ""
            java.lang.String r5 = r5.getString(r3, r10)     // Catch: java.lang.Throwable -> L264
            boolean r5 = gg.l.a(r5, r4)     // Catch: java.lang.Throwable -> L264
            if (r5 != 0) goto L25d
            android.content.SharedPreferences$Editor r5 = r6.clear()     // Catch: java.lang.Throwable -> L264
            r5.putString(r3, r4)     // Catch: java.lang.Throwable -> L264
        L25d:
            android.content.SharedPreferences$Editor r3 = r6.remove(r7)     // Catch: java.lang.Throwable -> L264
            r3.apply()     // Catch: java.lang.Throwable -> L264
        L264:
            java.util.Iterator r3 = r8.iterator()
        L268:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L280
            java.lang.Object r4 = r3.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            r8.i r5 = r8.i.f11631b
            b9.e r6 = new b9.e
            r7 = 6
            r6.<init>(r4, r7)
            r5.b(r4, r6)
            goto L268
        L280:
            java.lang.ClassLoader r3 = r14.f11622c
            java.lang.String r4 = "com.tencent.mm.booter.notification.NotificationItem"
            java.lang.Class r3 = h.Hchat.utils.KavaReflector.loadClass(r4, r3)
            if (r3 == 0) goto L28c
        L28a:
            r9 = r3
            goto L2df
        L28c:
            h.Hchat.dexkit.DexBridgeHolder r3 = r14.f11627h     // Catch: java.lang.Throwable -> L29d
            java.lang.String r5 = "id: "
            java.lang.String r6 = "userName: "
            java.lang.String r7 = "unreadCount:"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7}     // Catch: java.lang.Throwable -> L29d
            java.util.List r3 = r3.findClassesByStrings(r5)     // Catch: java.lang.Throwable -> L29d
            goto L2a4
        L29d:
            r3 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r3)
            r3 = r5
        L2a4:
            boolean r5 = r3 instanceof sf.f
            if (r5 == 0) goto L2aa
            goto L2ab
        L2aa:
            r0 = r3
        L2ab:
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L2b1:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2df
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r5 = gg.l.a(r3, r4)
            if (r5 != 0) goto L2d6
            r3.getClass()
            java.lang.String r5 = ".NotificationItem"
            boolean r5 = og.t.W(r3, r5, r1)
            if (r5 != 0) goto L2d6
            java.lang.String r5 = "com.tencent.mm.booter.notification"
            boolean r5 = og.m.h0(r3, r5, r1)
            if (r5 == 0) goto L2b1
        L2d6:
            java.lang.ClassLoader r5 = r14.f11622c
            java.lang.Class r3 = h.Hchat.utils.KavaReflector.loadClass(r3, r5)
            if (r3 == 0) goto L2b1
            goto L28a
        L2df:
            if (r9 == 0) goto L338
            c9.a2 r0 = new c9.a2
            r3 = 5
            r0.<init>(r14, r3)
            java.util.Set r0 = de.robv.android.xposed.XposedBridge.hookAllConstructors(r9, r0)
            if (r0 == 0) goto L305
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L2f3:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L305
            java.lang.Object r3 = r0.next()
            de.robv.android.xposed.XC_MethodHook$Unhook r3 = (de.robv.android.xposed.XC_MethodHook.Unhook) r3
            r8.i r4 = r8.i.f11631b
            r4.a(r3)
            goto L2f3
        L305:
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredMethods(r9)
            java.util.Iterator r0 = r0.iterator()
        L30d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L338
            java.lang.Object r3 = r0.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.Class[] r4 = r3.getParameterTypes()
            if (r4 == 0) goto L30d
            int r5 = r4.length
            if (r5 != r2) goto L30d
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r4 = r4[r1]
            boolean r4 = r5.isAssignableFrom(r4)
            if (r4 == 0) goto L30d
            r8.i r4 = r8.i.f11631b
            c9.a2 r5 = new c9.a2
            r6 = 4
            r5.<init>(r14, r6)
            r4.b(r3, r5)
            goto L30d
        L338:
            java.lang.Class<android.app.NotificationManager> r0 = android.app.NotificationManager.class
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            r0.getClass()
            int r3 = r0.length
            r4 = r1
        L343:
            if (r4 < r3) goto L380
            android.content.Context r14 = r14.f11620a
            java.util.concurrent.atomic.AtomicBoolean r0 = e9.q.f2461b
            boolean r2 = r0.compareAndSet(r1, r2)
            if (r2 != 0) goto L351
            goto L3bd
        L351:
            e9.p r2 = new e9.p
            r2.<init>()
            android.content.IntentFilter r3 = new android.content.IntentFilter
            java.lang.String r4 = "h.Hchat.action.CUSTOM_NOTIFICATION_REPLY"
            r3.<init>(r4)
            java.lang.String r4 = "h.Hchat.action.CUSTOM_NOTIFICATION_MARK_READ"
            r3.addAction(r4)
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L36d
            r5 = 33
            if (r4 < r5) goto L36f
            r4 = 4
            r14.registerReceiver(r2, r3, r4)     // Catch: java.lang.Throwable -> L36d
            goto L3bd
        L36d:
            r14 = move-exception
            goto L373
        L36f:
            r14.registerReceiver(r2, r3)     // Catch: java.lang.Throwable -> L36d
            goto L3bd
        L373:
            r0.set(r1)
            java.lang.String r0 = r14.getMessage()
            java.lang.String r1 = "[Hchat:CustomNotification] 注册通知动作广播失败: "
            eh.a.x(r1, r0, r14)
            goto L3bd
        L380:
            r5 = r0[r4]
            java.lang.Class[] r6 = r5.getParameterTypes()
            if (r6 == 0) goto L3ba
            java.lang.String r7 = r5.getName()
            java.lang.String r8 = "notify"
            boolean r7 = gg.l.a(r7, r8)
            if (r7 == 0) goto L3ba
            int r7 = r6.length
            if (r7 != 0) goto L398
            goto L3ba
        L398:
            int r7 = r6.length
            if (r7 == 0) goto L3b4
            int r7 = r6.length
            int r7 = r7 - r2
            r6 = r6[r7]
            java.lang.Class<android.app.Notification> r7 = android.app.Notification.class
            boolean r6 = gg.l.a(r6, r7)
            if (r6 != 0) goto L3a8
            goto L3ba
        L3a8:
            r8.i r6 = r8.i.f11631b
            c9.a2 r7 = new c9.a2
            r8 = 6
            r7.<init>(r14, r8)
            r6.b(r5, r7)
            goto L3ba
        L3b4:
            java.lang.String r14 = "Array is empty."
            j8.o.l(r14)
            return
        L3ba:
            int r4 = r4 + 1
            goto L343
        L3bd:
            return
    }

    public static java.util.List j(java.lang.Class r7) {
            java.util.concurrent.ConcurrentHashMap r0 = e9.q.f2469j
            java.lang.Object r1 = r0.get(r7)
            if (r1 != 0) goto L4c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = r7
        Le:
            if (r2 == 0) goto L44
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L44
            java.util.List r3 = h.Hchat.utils.KavaReflector.declaredFields(r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L25:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L3c
            java.lang.Object r5 = r3.next()
            r6 = r5
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            boolean r6 = h.Hchat.utils.KavaReflector.isStatic(r6)
            if (r6 != 0) goto L25
            r4.add(r5)
            goto L25
        L3c:
            tf.r.h1(r1, r4)
            java.lang.Class r2 = r2.getSuperclass()
            goto Le
        L44:
            java.lang.Object r7 = r0.putIfAbsent(r7, r1)
            if (r7 != 0) goto L4b
            goto L4c
        L4b:
            r1 = r7
        L4c:
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    public static boolean k(e9.c r4) {
            boolean r0 = r4.f2405p
            if (r0 != 0) goto L5
            goto L44
        L5:
            java.util.Set r0 = e9.s.f2475b
            java.lang.String r0 = r4.f2406q
            int r0 = e9.r.g(r0)
            java.lang.String r4 = r4.f2407r
            int r4 = e9.r.g(r4)
            if (r0 < 0) goto L44
            if (r4 >= 0) goto L18
            goto L44
        L18:
            if (r0 != r4) goto L1b
            goto L42
        L1b:
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r2 = 11
            int r2 = r1.get(r2)
            int r2 = r2 * 3600
            r3 = 12
            int r3 = r1.get(r3)
            int r3 = r3 * 60
            int r3 = r3 + r2
            r2 = 13
            int r1 = r1.get(r2)
            int r1 = r1 + r3
            if (r0 >= r4) goto L3e
            if (r0 > r1) goto L44
            if (r1 >= r4) goto L44
            goto L42
        L3e:
            if (r1 >= r0) goto L42
            if (r1 >= r4) goto L44
        L42:
            r4 = 1
            return r4
        L44:
            r4 = 0
            return r4
    }

    public static boolean l(java.lang.Class[] r5) {
            int r0 = r5.length
            r1 = 15
            r2 = 0
            if (r0 < r1) goto L62
            java.lang.Class<android.app.Notification> r0 = android.app.Notification.class
            r1 = r5[r2]
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L62
            r0 = 1
            r1 = r5[r0]
            java.lang.Class r3 = java.lang.Integer.TYPE
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L62
            r1 = 2
            r1 = r5[r1]
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L62
            r1 = 3
            r1 = r5[r1]
            java.lang.Class<android.app.PendingIntent> r3 = android.app.PendingIntent.class
            boolean r1 = r3.isAssignableFrom(r1)
            if (r1 == 0) goto L62
            r1 = 4
            r1 = r5[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L62
            r1 = 5
            r1 = r5[r1]
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L62
            r1 = 6
            r1 = r5[r1]
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L62
            r1 = 7
            r1 = r5[r1]
            java.lang.Class<android.graphics.Bitmap> r4 = android.graphics.Bitmap.class
            boolean r1 = r4.isAssignableFrom(r1)
            if (r1 == 0) goto L62
            r1 = 14
            r5 = r5[r1]
            boolean r5 = gg.l.a(r5, r3)
            if (r5 == 0) goto L62
            return r0
        L62:
            return r2
    }

    public static boolean m(java.lang.Object r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.Class r1 = r5.getClass()
            java.util.concurrent.ConcurrentHashMap r2 = e9.q.f2470k
            java.lang.Object r3 = r2.get(r1)
            if (r3 != 0) goto L42
            java.lang.Class r3 = r5.getClass()
            java.lang.String r4 = "field_msgSvrId"
            java.lang.reflect.Field r3 = h.Hchat.utils.KavaReflector.findFieldRecursive(r3, r4)
            if (r3 == 0) goto L35
            java.lang.Class r3 = r5.getClass()
            java.lang.String r4 = "field_talker"
            java.lang.reflect.Field r3 = h.Hchat.utils.KavaReflector.findFieldRecursive(r3, r4)
            if (r3 == 0) goto L35
            java.lang.Class r5 = r5.getClass()
            java.lang.String r3 = "field_content"
            java.lang.reflect.Field r5 = h.Hchat.utils.KavaReflector.findFieldRecursive(r5, r3)
            if (r5 == 0) goto L35
            r0 = 1
        L35:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            java.lang.Object r0 = r2.putIfAbsent(r1, r5)
            if (r0 != 0) goto L41
            r3 = r5
            goto L42
        L41:
            r3 = r0
        L42:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r5 = r3.booleanValue()
            return r5
    }

    public static boolean n(java.lang.reflect.Method r2) {
            java.lang.Class r0 = r2.getReturnType()
            java.lang.Class<android.app.Notification> r1 = android.app.Notification.class
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto Ld
            goto L21
        Ld:
            java.lang.Class[] r2 = r2.getParameterTypes()
            r2.getClass()
            boolean r0 = l(r2)
            if (r0 != 0) goto L23
            boolean r2 = o(r2)
            if (r2 == 0) goto L21
            goto L23
        L21:
            r2 = 0
            return r2
        L23:
            r2 = 1
            return r2
    }

    public static boolean o(java.lang.Class[] r8) {
            int r0 = r8.length
            r1 = 0
            r2 = 1
            if (r0 != r2) goto Lbb
            r0 = r8[r1]
            java.lang.Class<android.app.Notification> r3 = android.app.Notification.class
            boolean r0 = r3.isAssignableFrom(r0)
            if (r0 == 0) goto L11
            goto Lbb
        L11:
            r8 = r8[r1]
            java.util.List r8 = h.Hchat.utils.KavaReflector.declaredFields(r8)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r8.iterator()
        L20:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L3d
            java.lang.Object r5 = r4.next()
            r6 = r5
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            java.lang.Class r6 = r6.getType()
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            boolean r6 = gg.l.a(r6, r7)
            if (r6 == 0) goto L20
            r0.add(r5)
            goto L20
        L3d:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = tf.n.e1(r0)
            r4.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L4a:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L5e
            java.lang.Object r5 = r0.next()
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            java.lang.String r5 = r5.getName()
            r4.add(r5)
            goto L4a
        L5e:
            java.util.Set r0 = tf.m.U1(r4)
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L69
            goto Lbb
        L69:
            java.util.Iterator r8 = r8.iterator()
        L6d:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto Lbb
            java.lang.Object r4 = r8.next()
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            java.lang.Class r4 = r4.getType()
            boolean r4 = r3.isAssignableFrom(r4)
            if (r4 == 0) goto L6d
            java.lang.String r8 = "g"
            java.lang.String r3 = "o"
            java.lang.String r4 = "e"
            java.lang.String r5 = "f"
            java.lang.String[] r8 = new java.lang.String[]{r4, r5, r8, r3}
            java.util.Set r8 = tf.d0.W(r8)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r3 = r8 instanceof java.util.Collection
            if (r3 == 0) goto La3
            r3 = r8
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto La3
            goto Lba
        La3:
            java.util.Iterator r8 = r8.iterator()
        La7:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Lba
            java.lang.Object r3 = r8.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r0.contains(r3)
            if (r3 != 0) goto La7
            goto Lbb
        Lba:
            return r2
        Lbb:
            return r1
    }

    public static android.graphics.Bitmap p(android.content.Context r7, java.lang.String r8) {
            boolean r0 = og.m.t0(r8)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = "Hchat_custom_friend_avatar_config"
            android.content.SharedPreferences r2 = ub.b.c(r7, r0)
            java.lang.String r3 = "enable"
            r4 = 0
            boolean r2 = r2.getBoolean(r3, r4)
            r3 = 1
            if (r2 == 0) goto L2b
            android.content.SharedPreferences r0 = ub.b.c(r7, r0)
            java.lang.String r2 = "scope_notifications"
            boolean r0 = r0.getBoolean(r2, r3)
            if (r0 == 0) goto L2b
            android.graphics.Bitmap r7 = d9.o.e(r7, r8)
            if (r7 == 0) goto L2b
            return r7
        L2b:
            java.util.concurrent.ConcurrentHashMap r7 = e9.q.f2466g
            boolean r0 = r7.containsKey(r8)
            if (r0 == 0) goto L3a
            java.lang.Object r7 = r7.get(r8)
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            return r7
        L3a:
            g8.i r0 = wb.en.c()
            if (r0 == 0) goto L45
            java.lang.String r2 = r0.m(r8, r3)
            goto L46
        L45:
            r2 = r1
        L46:
            java.lang.String r5 = ""
            if (r2 != 0) goto L4b
            r2 = r5
        L4b:
            if (r0 == 0) goto L52
            java.lang.String r0 = r0.m(r8, r4)
            goto L53
        L52:
            r0 = r1
        L53:
            if (r0 != 0) goto L56
            goto L57
        L56:
            r5 = r0
        L57:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            boolean r6 = og.m.t0(r2)
            if (r6 != 0) goto L65
            r0.add(r2)
        L65:
            boolean r2 = og.m.t0(r5)
            if (r2 != 0) goto L6e
            r0.add(r5)
        L6e:
            java.lang.String r2 = q(r8, r4)
            if (r2 == 0) goto L77
            r0.add(r2)
        L77:
            java.lang.String r2 = q(r8, r3)
            if (r2 == 0) goto L80
            r0.add(r2)
        L80:
            java.util.List r0 = tf.m.P1(r0)
            java.util.Iterator r0 = r0.iterator()
        L88:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lf6
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "http://"
            boolean r3 = og.t.d0(r2, r3, r4)     // Catch: java.lang.Throwable -> Lbd
            if (r3 != 0) goto Lc1
            java.lang.String r3 = "https://"
            boolean r3 = og.t.d0(r2, r3, r4)     // Catch: java.lang.Throwable -> Lbd
            if (r3 == 0) goto La5
            goto Lc1
        La5:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> Lbd
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Lbd
            boolean r2 = r3.exists()     // Catch: java.lang.Throwable -> Lbd
            if (r2 == 0) goto Lb1
            goto Lb2
        Lb1:
            r3 = r1
        Lb2:
            if (r3 == 0) goto Lbf
            java.lang.String r2 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> Lbd
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFile(r2)     // Catch: java.lang.Throwable -> Lbd
            goto Leb
        Lbd:
            r2 = move-exception
            goto Le5
        Lbf:
            r2 = r1
            goto Leb
        Lc1:
            java.net.URL r3 = new java.net.URL     // Catch: java.lang.Throwable -> Lbd
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Lbd
            java.net.URLConnection r2 = r3.openConnection()     // Catch: java.lang.Throwable -> Lbd
            r3 = 3000(0xbb8, float:4.204E-42)
            r2.setConnectTimeout(r3)     // Catch: java.lang.Throwable -> Lbd
            r2.setReadTimeout(r3)     // Catch: java.lang.Throwable -> Lbd
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Throwable -> Lbd
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch: java.lang.Throwable -> Lde
            ig.a.i(r2, r1)     // Catch: java.lang.Throwable -> Lbd
            goto Lea
        Lde:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> Le0
        Le0:
            r5 = move-exception
            ig.a.i(r2, r3)     // Catch: java.lang.Throwable -> Lbd
            throw r5     // Catch: java.lang.Throwable -> Lbd
        Le5:
            sf.f r3 = new sf.f
            r3.<init>(r2)
        Lea:
            r2 = r3
        Leb:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto Lf1
            r2 = r1
        Lf1:
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L88
            r1 = r2
        Lf6:
            r7.put(r8, r1)
            return r1
    }

    public static java.lang.String q(java.lang.String r10, boolean r11) {
            java.lang.String r0 = e9.q.f2472m
            r1 = 0
            if (r0 == 0) goto L7
            goto L75
        L7:
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = h.Hchat.hooks.api.core.WeChatApis.database()
            if (r0 == 0) goto L70
            java.lang.String r2 = "PRAGMA database_list"
            java.util.List r0 = r0.query(r2, r1)     // Catch: java.lang.Throwable -> L14
            goto L1b
        L14:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L1b:
            tf.t r2 = tf.t.f13167g
            boolean r3 = r0 instanceof sf.f
            if (r3 == 0) goto L22
            r0 = r2
        L22:
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L28:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L70
            java.lang.Object r2 = r0.next()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "file"
            java.lang.Object r2 = r2.get(r3)
            if (r2 == 0) goto L41
            java.lang.String r2 = r2.toString()
            goto L42
        L41:
            r2 = r1
        L42:
            if (r2 != 0) goto L46
            java.lang.String r2 = ""
        L46:
            boolean r3 = og.m.t0(r2)
            if (r3 == 0) goto L4d
            goto L28
        L4d:
            java.io.File r3 = new java.io.File
            r3.<init>(r2)
            java.io.File r2 = r3.getParentFile()
            if (r2 == 0) goto L28
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "avatar"
            r3.<init>(r2, r4)
            boolean r4 = r3.isDirectory()
            if (r4 != 0) goto L6b
            boolean r2 = r2.isDirectory()
            if (r2 == 0) goto L28
        L6b:
            java.lang.String r0 = r3.getAbsolutePath()
            goto L71
        L70:
            r0 = r1
        L71:
            e9.q.f2472m = r0
            if (r0 == 0) goto L119
        L75:
            r2 = 0
            r3 = 2
            java.lang.String r4 = "MD5"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)     // Catch: java.lang.Throwable -> L9a
            java.nio.charset.Charset r5 = og.a.f9804a     // Catch: java.lang.Throwable -> L9a
            byte[] r10 = r10.getBytes(r5)     // Catch: java.lang.Throwable -> L9a
            r10.getClass()     // Catch: java.lang.Throwable -> L9a
            byte[] r10 = r4.digest(r10)     // Catch: java.lang.Throwable -> L9a
            int r4 = r10.length     // Catch: java.lang.Throwable -> L9a
            int r4 = r4 * r3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9a
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L9a
            int r4 = r10.length     // Catch: java.lang.Throwable -> L9a
            r6 = r2
        L93:
            if (r6 < r4) goto L9c
            java.lang.String r10 = r5.toString()     // Catch: java.lang.Throwable -> L9a
            goto Lc9
        L9a:
            r10 = move-exception
            goto Lc3
        L9c:
            r7 = r10[r6]     // Catch: java.lang.Throwable -> L9a
            int r8 = r7 >>> 4
            r8 = r8 & 15
            r9 = 16
            a.a.w(r9)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r8 = java.lang.Integer.toString(r8, r9)     // Catch: java.lang.Throwable -> L9a
            r8.getClass()     // Catch: java.lang.Throwable -> L9a
            r5.append(r8)     // Catch: java.lang.Throwable -> L9a
            r7 = r7 & 15
            a.a.w(r9)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r7 = java.lang.Integer.toString(r7, r9)     // Catch: java.lang.Throwable -> L9a
            r7.getClass()     // Catch: java.lang.Throwable -> L9a
            r5.append(r7)     // Catch: java.lang.Throwable -> L9a
            int r6 = r6 + 1
            goto L93
        Lc3:
            sf.f r4 = new sf.f
            r4.<init>(r10)
            r10 = r4
        Lc9:
            boolean r4 = r10 instanceof sf.f
            if (r4 == 0) goto Lcf
            r10 = r1
        Lcf:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L119
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 1
            char[] r5 = new char[r5]
            r6 = 47
            r5[r2] = r6
            java.lang.String r0 = og.m.U0(r0, r5)
            r4.append(r0)
            r4.append(r6)
            java.lang.String r0 = r10.substring(r2, r3)
            r4.append(r0)
            r4.append(r6)
            r0 = 4
            java.lang.String r0 = r10.substring(r3, r0)
            r4.append(r0)
            java.lang.String r0 = "/user_"
            r4.append(r0)
            if (r11 == 0) goto L107
            java.lang.String r11 = "hd_"
            r4.append(r11)
        L107:
            java.lang.String r11 = ".png"
            java.lang.String r10 = eh.a.r(r4, r10, r11)
            java.io.File r11 = new java.io.File
            r11.<init>(r10)
            boolean r11 = r11.exists()
            if (r11 == 0) goto L119
            r1 = r10
        L119:
            return r1
    }

    public static java.util.List r(r8.g r8, java.lang.String r9, java.lang.String r10, fg.l r11) {
            e8.b r0 = e8.b.f2358a
            android.content.SharedPreferences r1 = e9.q.f2474o
            if (r1 == 0) goto L7
            goto L11
        L7:
            android.content.Context r1 = r8.f11620a
            java.lang.String r2 = "Hchat_custom_notification_method_cache"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            e9.q.f2474o = r1
        L11:
            android.content.Context r2 = r8.f11620a
            java.lang.ClassLoader r3 = r8.f11622c
            java.lang.String r2 = e8.b.g(r2, r3)
            java.lang.ClassLoader r3 = r8.f11622c
            java.util.List r3 = e8.b.f(r1, r2, r3, r9)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L28:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L42
            java.lang.Object r5 = r3.next()
            java.lang.Object r6 = r11.invoke(r5)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L28
            r4.add(r5)
            goto L28
        L42:
            boolean r3 = r4.isEmpty()
            r5 = 0
            if (r3 != 0) goto L4a
            goto L4b
        L4a:
            r4 = r5
        L4b:
            if (r4 == 0) goto L4e
            return r4
        L4e:
            org.luckypray.dexkit.DexKitBridge r3 = r8.f11623d     // Catch: java.lang.Throwable -> L98
            ch.e r4 = new ch.e     // Catch: java.lang.Throwable -> L98
            r4.<init>()     // Catch: java.lang.Throwable -> L98
            fh.k r6 = new fh.k     // Catch: java.lang.Throwable -> L98
            r6.<init>()     // Catch: java.lang.Throwable -> L98
            java.util.List r7 = a.a.x0(r10)     // Catch: java.lang.Throwable -> L98
            fh.k.u0(r6, r7)     // Catch: java.lang.Throwable -> L98
            r4.f1666h = r6     // Catch: java.lang.Throwable -> L98
            hh.p r3 = r3.findMethod(r4)     // Catch: java.lang.Throwable -> L98
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L98
            r4.<init>()     // Catch: java.lang.Throwable -> L98
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L98
        L70:
            boolean r6 = r3.hasNext()     // Catch: java.lang.Throwable -> L98
            if (r6 == 0) goto L9a
            java.lang.Object r6 = r3.next()     // Catch: java.lang.Throwable -> L98
            hh.o r6 = (hh.o) r6     // Catch: java.lang.Throwable -> L98
            java.lang.ClassLoader r7 = r8.f11622c     // Catch: java.lang.Throwable -> L83
            java.lang.reflect.Method r6 = r6.r(r7)     // Catch: java.lang.Throwable -> L83
            goto L8a
        L83:
            r6 = move-exception
            sf.f r7 = new sf.f     // Catch: java.lang.Throwable -> L98
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L98
            r6 = r7
        L8a:
            boolean r7 = r6 instanceof sf.f     // Catch: java.lang.Throwable -> L98
            if (r7 == 0) goto L90
            r6 = r5
        L90:
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch: java.lang.Throwable -> L98
            if (r6 == 0) goto L70
            r4.add(r6)     // Catch: java.lang.Throwable -> L98
            goto L70
        L98:
            r8 = move-exception
            goto Le6
        L9a:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L98
            r8.<init>()     // Catch: java.lang.Throwable -> L98
            java.util.Iterator r3 = r4.iterator()     // Catch: java.lang.Throwable -> L98
        La3:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L98
            if (r4 == 0) goto Lbd
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L98
            java.lang.Object r5 = r11.invoke(r4)     // Catch: java.lang.Throwable -> L98
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L98
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L98
            if (r5 == 0) goto La3
            r8.add(r4)     // Catch: java.lang.Throwable -> L98
            goto La3
        Lbd:
            java.util.HashSet r11 = new java.util.HashSet     // Catch: java.lang.Throwable -> L98
            r11.<init>()     // Catch: java.lang.Throwable -> L98
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L98
            r3.<init>()     // Catch: java.lang.Throwable -> L98
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L98
        Lcb:
            boolean r4 = r8.hasNext()     // Catch: java.lang.Throwable -> L98
            if (r4 == 0) goto Leb
            java.lang.Object r4 = r8.next()     // Catch: java.lang.Throwable -> L98
            r5 = r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> L98
            java.lang.String r5 = r5.toGenericString()     // Catch: java.lang.Throwable -> L98
            boolean r5 = r11.add(r5)     // Catch: java.lang.Throwable -> L98
            if (r5 == 0) goto Lcb
            r3.add(r4)     // Catch: java.lang.Throwable -> L98
            goto Lcb
        Le6:
            sf.f r3 = new sf.f
            r3.<init>(r8)
        Leb:
            java.lang.Throwable r8 = sf.g.b(r3)
            if (r8 != 0) goto Lf2
            goto Lff
        Lf2:
            java.lang.String r11 = r8.getMessage()
            java.lang.String r3 = "[Hchat:CustomNotification] 定位微信通知方法失败 anchor="
            java.lang.String r4 = ": "
            eh.a.w(r3, r10, r4, r11, r8)
            tf.t r3 = tf.t.f13167g
        Lff:
            java.util.List r3 = (java.util.List) r3
            boolean r8 = r3.isEmpty()
            if (r8 != 0) goto L10b
            r0.j(r1, r2, r9, r3)
            goto L12b
        L10b:
            java.lang.String r8 = "cache.key"
            android.content.SharedPreferences$Editor r10 = r1.edit()     // Catch: java.lang.Throwable -> L12b
            java.lang.String r11 = ""
            java.lang.String r11 = r1.getString(r8, r11)     // Catch: java.lang.Throwable -> L12b
            boolean r11 = gg.l.a(r11, r2)     // Catch: java.lang.Throwable -> L12b
            if (r11 != 0) goto L124
            android.content.SharedPreferences$Editor r11 = r10.clear()     // Catch: java.lang.Throwable -> L12b
            r11.putString(r8, r2)     // Catch: java.lang.Throwable -> L12b
        L124:
            android.content.SharedPreferences$Editor r8 = r10.remove(r9)     // Catch: java.lang.Throwable -> L12b
            r8.apply()     // Catch: java.lang.Throwable -> L12b
        L12b:
            return r3
    }

    public static java.lang.String s(java.lang.String r5) {
            r0 = 6
            java.lang.String r1 = ":\n"
            r2 = 0
            int r0 = og.m.r0(r5, r1, r2, r2, r0)
            if (r0 <= 0) goto L10
            int r0 = r0 + 2
            java.lang.String r5 = r5.substring(r0)
        L10:
            java.lang.CharSequence r5 = og.m.R0(r5)
            java.lang.String r5 = r5.toString()
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r0.getClass()
            java.lang.String r0 = "title"
            java.lang.String r0 = l8.d.o(r5, r0)
            java.lang.String r1 = "des"
            java.lang.String r1 = l8.d.o(r5, r1)
            java.lang.String r3 = "description"
            java.lang.String r3 = l8.d.o(r5, r3)
            java.lang.String r4 = "content"
            java.lang.String r4 = l8.d.o(r5, r4)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r3, r4}
            java.lang.String r0 = g(r0)
            java.lang.String r0 = y(r0)
            boolean r1 = og.m.t0(r0)
            if (r1 != 0) goto L48
            return r0
        L48:
            java.lang.String r0 = "<"
            boolean r0 = og.t.d0(r5, r0, r2)
            if (r0 == 0) goto L53
            java.lang.String r5 = "[收到一条新消息]"
            return r5
        L53:
            java.lang.String r5 = y(r5)
            return r5
    }

    public static java.lang.String t(android.app.Notification r0, java.lang.String r1) {
            android.os.Bundle r0 = r0.extras
            if (r0 == 0) goto Lf
            java.lang.CharSequence r0 = r0.getCharSequence(r1)
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.toString()
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 != 0) goto L14
            java.lang.String r0 = ""
        L14:
            return r0
    }

    public static int u(java.lang.Object r5, java.lang.String... r6) {
            int r0 = r6.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 < r0) goto L6
            return r1
        L6:
            r3 = r6[r2]
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r5, r3)
            boolean r4 = r3 instanceof java.lang.Number
            if (r4 == 0) goto L13
            java.lang.Number r3 = (java.lang.Number) r3
            goto L14
        L13:
            r3 = 0
        L14:
            if (r3 == 0) goto L1b
            int r5 = r3.intValue()
            return r5
        L1b:
            int r2 = r2 + 1
            goto L3
    }

    public static long v(java.lang.Object r4, java.lang.String... r5) {
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 < r0) goto L7
            r4 = 0
            return r4
        L7:
            r2 = r5[r1]
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r4, r2)
            boolean r3 = r2 instanceof java.lang.Number
            if (r3 == 0) goto L14
            java.lang.Number r2 = (java.lang.Number) r2
            goto L15
        L14:
            r2 = 0
        L15:
            if (r2 == 0) goto L1c
            long r4 = r2.longValue()
            return r4
        L1c:
            int r1 = r1 + 1
            goto L2
    }

    public static java.lang.String w(java.lang.Object r4, java.lang.String... r5) {
            int r0 = r5.length
            r1 = 0
        L2:
            java.lang.String r2 = ""
            if (r1 < r0) goto L7
            return r2
        L7:
            r3 = r5[r1]
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r4, r3)
            if (r3 == 0) goto L1e
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L1e
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            goto L1f
        L1e:
            r3 = 0
        L1f:
            if (r3 != 0) goto L22
            goto L23
        L22:
            r2 = r3
        L23:
            boolean r3 = og.m.t0(r2)
            if (r3 != 0) goto L2a
            return r2
        L2a:
            int r1 = r1 + 1
            goto L2
    }

    public static java.lang.String x(java.lang.Object r1, java.lang.String r2) {
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r1, r2)
            boolean r2 = r1 instanceof java.lang.String
            r0 = 0
            if (r2 == 0) goto Lc
            java.lang.String r1 = (java.lang.String) r1
            goto Ld
        Lc:
            r1 = r0
        Ld:
            if (r1 == 0) goto L17
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r0 = r1.toString()
        L17:
            if (r0 != 0) goto L1c
            java.lang.String r1 = ""
            return r1
        L1c:
            return r0
    }

    public static java.lang.String y(java.lang.String r3) {
            java.lang.String r0 = "&lt;"
            java.lang.String r1 = "<"
            r2 = 0
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "&gt;"
            java.lang.String r1 = ">"
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "&amp;"
            java.lang.String r1 = "&"
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "&quot;"
            java.lang.String r1 = "\""
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "&#39;"
            java.lang.String r1 = "'"
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "\\s+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            java.lang.String r1 = " "
            java.util.regex.Matcher r3 = r0.matcher(r3)
            java.lang.String r3 = r3.replaceAll(r1)
            r3.getClass()
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            return r3
    }

    public static void z(android.content.Context r22, e9.c r23, e9.l r24) {
            r1 = r22
            r2 = r23
            r3 = r24
            java.lang.String r0 = "notification"
            java.lang.Object r0 = r1.getSystemService(r0)
            boolean r4 = r0 instanceof android.app.NotificationManager
            r5 = 0
            if (r4 == 0) goto L15
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            r4 = r0
            goto L16
        L15:
            r4 = r5
        L16:
            if (r4 == 0) goto L46f
            boolean r0 = r2.f2398i
            java.lang.String r6 = "0"
            java.lang.String r7 = "1"
            if (r0 == 0) goto L22
            r0 = r7
            goto L23
        L22:
            r0 = r6
        L23:
            boolean r8 = r2.f2397h
            if (r8 == 0) goto L28
            r6 = r7
        L28:
            java.lang.String r7 = r2.f2408s
            int r7 = r7.hashCode()
            java.lang.String r8 = "_v"
            java.lang.String r9 = "_"
            java.lang.String r10 = "Hchat_custom_notification_s"
            java.lang.StringBuilder r0 = bc.e.p(r10, r0, r8, r6, r9)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r6 = 0
            java.util.List r7 = r4.getNotificationChannels()     // Catch: java.lang.Throwable -> L97
            if (r7 == 0) goto L97
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L97
            r8.<init>()     // Catch: java.lang.Throwable -> L97
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L97
        L4f:
            boolean r9 = r7.hasNext()     // Catch: java.lang.Throwable -> L97
            if (r9 == 0) goto L71
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L97
            android.app.NotificationChannel r9 = (android.app.NotificationChannel) r9     // Catch: java.lang.Throwable -> L97
            java.lang.String r9 = r9.getId()     // Catch: java.lang.Throwable -> L97
            if (r9 == 0) goto L6a
            java.lang.String r10 = "Hchat_custom_notification_"
            boolean r10 = og.t.d0(r9, r10, r6)     // Catch: java.lang.Throwable -> L97
            if (r10 == 0) goto L6a
            goto L6b
        L6a:
            r9 = r5
        L6b:
            if (r9 == 0) goto L4f
            r8.add(r9)     // Catch: java.lang.Throwable -> L97
            goto L4f
        L71:
            int r7 = r8.size()     // Catch: java.lang.Throwable -> L97
            r9 = 100
            if (r7 > r9) goto L7a
            goto L97
        L7a:
            int r7 = r8.size()     // Catch: java.lang.Throwable -> L97
            int r7 = r7 - r9
            java.util.List r7 = tf.m.L1(r7, r8)     // Catch: java.lang.Throwable -> L97
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L97
        L87:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L97
            if (r8 == 0) goto L97
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L97
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L97
            r4.deleteNotificationChannel(r8)     // Catch: java.lang.Throwable -> L97
            goto L87
        L97:
            android.app.NotificationChannel r7 = new android.app.NotificationChannel
            java.lang.String r8 = "Hchat 自定义通知"
            r9 = 4
            r7.<init>(r0, r8, r9)
            boolean r8 = r2.f2397h
            r7.enableVibration(r8)
            boolean r8 = r2.f2397h
            r10 = 0
            r12 = 2
            r13 = 1
            if (r8 == 0) goto Lba
            long[] r8 = new long[r9]
            r8[r6] = r10
            r9 = 250(0xfa, double:1.235E-321)
            r8[r13] = r9
            r8[r12] = r9
            r11 = 3
            r8[r11] = r9
            goto Lbe
        Lba:
            long[] r8 = new long[r13]
            r8[r6] = r10
        Lbe:
            r7.setVibrationPattern(r8)
            r7.setSound(r5, r5)
            r4.createNotificationChannel(r7)
            android.app.Notification$Builder r7 = new android.app.Notification$Builder
            r7.<init>(r1, r0)
            boolean r0 = r2.f2402m
            java.lang.String r8 = r2.f2391b
            if (r0 == 0) goto Ldf
            int r0 = r8.hashCode()
            r8 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r8
            r8 = 1258291200(0x4b000000, float:8388608.0)
            r0 = r0 | r8
        Ldd:
            r8 = r0
            goto L106
        Ldf:
            java.util.concurrent.atomic.AtomicInteger r0 = e9.q.f2462c
            ba.c r9 = new ba.c
            r10 = 3
            r9.<init>(r10)
            int r0 = r0.updateAndGet(r9)
            int r8 = r8.hashCode()
            long r8 = (long) r8
            r10 = 1023(0x3ff, double:5.054E-321)
            long r8 = r8 & r10
            r10 = 20
            long r8 = r8 << r10
            r10 = 1241513984(0x4a000000, double:6.133894083E-315)
            long r8 = r8 | r10
            long r10 = (long) r0
            r14 = 1048575(0xfffff, double:5.18065E-318)
            long r10 = r10 & r14
            long r8 = r8 | r10
            r10 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r8 = r8 & r10
            int r0 = (int) r8
            goto Ldd
        L106:
            boolean r0 = r2.f2402m
            int r9 = r3.f2438c
            java.lang.String r10 = "hchat_custom_notification_unread_count"
            java.lang.String r11 = "hchat_custom_notification"
            java.lang.String r14 = "hchat_custom_notification_talker"
            if (r0 == 0) goto L1c4
            java.lang.String r0 = r2.f2391b
            android.service.notification.StatusBarNotification[] r15 = r4.getActiveNotifications()     // Catch: java.lang.Throwable -> L1a2
            r15.getClass()     // Catch: java.lang.Throwable -> L1a2
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1a2
            r5.<init>()     // Catch: java.lang.Throwable -> L1a2
            r16 = r12
            int r12 = r15.length     // Catch: java.lang.Throwable -> L153
            r13 = r6
        L124:
            if (r13 >= r12) goto L163
            r18 = r15[r13]     // Catch: java.lang.Throwable -> L153
            android.app.Notification r6 = r18.getNotification()     // Catch: java.lang.Throwable -> L153
            if (r6 == 0) goto L155
            android.os.Bundle r6 = r6.extras     // Catch: java.lang.Throwable -> L153
            if (r6 == 0) goto L155
            r18 = r12
            r12 = 0
            boolean r19 = r6.getBoolean(r11, r12)     // Catch: java.lang.Throwable -> L153
            if (r19 == 0) goto L157
            java.lang.String r12 = r6.getString(r14)     // Catch: java.lang.Throwable -> L153
            boolean r12 = gg.l.a(r12, r0)     // Catch: java.lang.Throwable -> L153
            if (r12 == 0) goto L157
            r12 = 0
            int r6 = r6.getInt(r10, r12)     // Catch: java.lang.Throwable -> L153
            r12 = 1
            if (r6 >= r12) goto L14e
            r6 = 1
        L14e:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L153
            goto L158
        L153:
            r0 = move-exception
            goto L1a5
        L155:
            r18 = r12
        L157:
            r6 = 0
        L158:
            if (r6 == 0) goto L15d
            r5.add(r6)     // Catch: java.lang.Throwable -> L153
        L15d:
            int r13 = r13 + 1
            r12 = r18
            r6 = 0
            goto L124
        L163:
            int r0 = r5.size()     // Catch: java.lang.Throwable -> L153
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L153
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L153
            if (r6 != 0) goto L173
            r6 = 0
            goto L18d
        L173:
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L153
            java.lang.Comparable r6 = (java.lang.Comparable) r6     // Catch: java.lang.Throwable -> L153
        L179:
            boolean r12 = r5.hasNext()     // Catch: java.lang.Throwable -> L153
            if (r12 == 0) goto L18d
            java.lang.Object r12 = r5.next()     // Catch: java.lang.Throwable -> L153
            java.lang.Comparable r12 = (java.lang.Comparable) r12     // Catch: java.lang.Throwable -> L153
            int r13 = r6.compareTo(r12)     // Catch: java.lang.Throwable -> L153
            if (r13 >= 0) goto L179
            r6 = r12
            goto L179
        L18d:
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> L153
            if (r6 == 0) goto L196
            int r5 = r6.intValue()     // Catch: java.lang.Throwable -> L153
            goto L197
        L196:
            r5 = 0
        L197:
            int r0 = java.lang.Math.max(r0, r5)     // Catch: java.lang.Throwable -> L153
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L153
        L19f:
            r19 = 0
            goto L1ac
        L1a2:
            r0 = move-exception
            r16 = r12
        L1a5:
            sf.f r5 = new sf.f
            r5.<init>(r0)
            r0 = r5
            goto L19f
        L1ac:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r19)
            boolean r6 = r0 instanceof sf.f
            if (r6 == 0) goto L1b5
            r0 = r5
        L1b5:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r17 = 1
            int r0 = r0 + 1
            int r9 = java.lang.Math.max(r9, r0)
            goto L1c6
        L1c4:
            r16 = r12
        L1c6:
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo()
            int r0 = r0.icon
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L1d3
            goto L1d4
        L1d3:
            r5 = 0
        L1d4:
            if (r5 == 0) goto L1db
            int r0 = r5.intValue()
            goto L1de
        L1db:
            r0 = 17301623(0x1080077, float:2.4979588E-38)
        L1de:
            java.lang.String r5 = r3.f2437b
            r12 = 1
            if (r9 <= r12) goto L20d
            java.lang.String r6 = "^\\[\\d+条].*"
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6)
            r6.getClass()
            java.util.regex.Matcher r6 = r6.matcher(r5)
            boolean r6 = r6.matches()
            if (r6 == 0) goto L1f7
            goto L20d
        L1f7:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r12 = "["
            r6.<init>(r12)
            r6.append(r9)
            java.lang.String r12 = "条]"
            r6.append(r12)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
        L20d:
            android.app.PendingIntent r6 = r3.f2443h
            if (r6 == 0) goto L216
            r20 = r4
            r21 = r10
            goto L285
        L216:
            java.lang.String r6 = r2.f2391b
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            android.content.Intent r15 = new android.content.Intent
            r15.<init>()
            android.content.ComponentName r12 = new android.content.ComponentName
            r20 = r4
            java.lang.String r4 = r1.getPackageName()
            r21 = r10
            java.lang.String r10 = "com.tencent.mm.ui.LauncherUI"
            r12.<init>(r4, r10)
            r15.setComponent(r12)
            r4 = 872415232(0x34000000, float:1.1920929E-7)
            r15.addFlags(r4)
            r13.add(r15)
            boolean r4 = og.m.t0(r6)
            if (r4 != 0) goto L26d
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            android.content.ComponentName r10 = new android.content.ComponentName
            java.lang.String r12 = r1.getPackageName()
            java.lang.String r15 = "com.tencent.mm.ui.chatting.ChattingUI"
            r10.<init>(r12, r15)
            r4.setComponent(r10)
            java.lang.String r10 = "Chat_User"
            r4.putExtra(r10, r6)
            java.lang.String r6 = "Chat_Mode"
            r12 = 1
            r4.putExtra(r6, r12)
            java.lang.String r6 = "finish_direct"
            r4.putExtra(r6, r12)
            r6 = 603979776(0x24000000, float:2.7755576E-17)
            r4.addFlags(r6)
            r13.add(r4)
        L26d:
            boolean r4 = r13.isEmpty()
            if (r4 == 0) goto L275
            r6 = 0
            goto L285
        L275:
            r12 = 0
            android.content.Intent[] r4 = new android.content.Intent[r12]
            java.lang.Object[] r4 = r13.toArray(r4)
            android.content.Intent[] r4 = (android.content.Intent[]) r4
            r6 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r4 = android.app.PendingIntent.getActivities(r1, r8, r4, r6)
            r6 = r4
        L285:
            android.app.Notification$Builder r0 = r7.setSmallIcon(r0)
            java.lang.String r4 = r3.f2436a
            android.app.Notification$Builder r0 = r0.setContentTitle(r4)
            android.app.Notification$Builder r0 = r0.setContentText(r5)
            android.app.Notification$Builder r0 = r0.setTicker(r5)
            android.app.Notification$Builder r0 = r0.setNumber(r9)
            long r4 = r3.f2440e
            android.app.Notification$Builder r0 = r0.setWhen(r4)
            r12 = 1
            android.app.Notification$Builder r0 = r0.setShowWhen(r12)
            android.app.Notification$Builder r0 = r0.setAutoCancel(r12)
            r4 = 0
            android.app.Notification$Builder r0 = r0.setOnlyAlertOnce(r4)
            java.lang.String r4 = "msg"
            android.app.Notification$Builder r0 = r0.setCategory(r4)
            android.app.Notification$Builder r0 = r0.setPriority(r12)
            android.app.Notification$Builder r0 = r0.setContentIntent(r6)
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r4.putBoolean(r11, r12)
            java.lang.String r5 = r2.f2391b
            r4.putString(r14, r5)
            r5 = r21
            r4.putInt(r5, r9)
            r0.setExtras(r4)
            android.graphics.Bitmap r0 = r3.f2439d
            if (r0 == 0) goto L2d9
            r7.setLargeIcon(r0)
        L2d9:
            boolean r0 = r2.f2399j
            java.lang.String r4 = "hchat_custom_notification_id"
            if (r0 == 0) goto L31e
            java.lang.String r0 = r2.f2391b
            android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Throwable -> L30a
            java.lang.String r6 = "h.Hchat.action.CUSTOM_NOTIFICATION_MARK_READ"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L30a
            java.lang.String r6 = r1.getPackageName()     // Catch: java.lang.Throwable -> L30a
            r5.setPackage(r6)     // Catch: java.lang.Throwable -> L30a
            r5.putExtra(r14, r0)     // Catch: java.lang.Throwable -> L30a
            r5.putExtra(r4, r8)     // Catch: java.lang.Throwable -> L30a
            r6 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r1, r8, r5, r6)     // Catch: java.lang.Throwable -> L30a
            android.app.Notification$Action$Builder r5 = new android.app.Notification$Action$Builder     // Catch: java.lang.Throwable -> L30a
            java.lang.String r6 = "已读"
            r9 = 17301591(0x1080057, float:2.49795E-38)
            r5.<init>(r9, r6, r0)     // Catch: java.lang.Throwable -> L30a
            android.app.Notification$Action r0 = r5.build()     // Catch: java.lang.Throwable -> L30a
            goto L311
        L30a:
            r0 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r0)
            r0 = r5
        L311:
            boolean r5 = r0 instanceof sf.f
            if (r5 == 0) goto L317
            r0 = 0
        L317:
            android.app.Notification$Action r0 = (android.app.Notification.Action) r0
            if (r0 == 0) goto L31e
            r7.addAction(r0)
        L31e:
            boolean r0 = r2.f2400k
            if (r0 == 0) goto L3b1
            java.lang.String r0 = r2.f2391b
            long r5 = r3.f2441f
            long r9 = r3.f2442g
            boolean r3 = r2.f2401l
            android.app.RemoteInput$Builder r12 = new android.app.RemoteInput$Builder     // Catch: java.lang.Throwable -> L397
            java.lang.String r13 = "hchat_reply_text"
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L397
            java.lang.String r13 = "输入回复内容..."
            android.app.RemoteInput$Builder r12 = r12.setLabel(r13)     // Catch: java.lang.Throwable -> L397
            r13 = 1
            android.app.RemoteInput$Builder r12 = r12.setAllowFreeFormInput(r13)     // Catch: java.lang.Throwable -> L397
            android.app.RemoteInput r12 = r12.build()     // Catch: java.lang.Throwable -> L397
            r12.getClass()     // Catch: java.lang.Throwable -> L397
            android.content.Intent r13 = new android.content.Intent     // Catch: java.lang.Throwable -> L397
            java.lang.String r15 = "h.Hchat.action.CUSTOM_NOTIFICATION_REPLY"
            r13.<init>(r15)     // Catch: java.lang.Throwable -> L397
            java.lang.String r15 = r1.getPackageName()     // Catch: java.lang.Throwable -> L397
            r13.setPackage(r15)     // Catch: java.lang.Throwable -> L397
            r15 = 268435456(0x10000000, float:2.524355E-29)
            r13.addFlags(r15)     // Catch: java.lang.Throwable -> L397
            r13.putExtra(r14, r0)     // Catch: java.lang.Throwable -> L397
            r13.putExtra(r4, r8)     // Catch: java.lang.Throwable -> L397
            java.lang.String r0 = "hchat_custom_notification_reply_msg_id"
            r13.putExtra(r0, r5)     // Catch: java.lang.Throwable -> L397
            java.lang.String r0 = "hchat_custom_notification_native_msg_svr_id"
            r13.putExtra(r0, r9)     // Catch: java.lang.Throwable -> L397
            java.lang.String r0 = "hchat_custom_notification_quote_quick_reply"
            r13.putExtra(r0, r3)     // Catch: java.lang.Throwable -> L397
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L397
            r3 = 31
            if (r0 < r3) goto L374
            r3 = 167772160(0xa000000, float:6.162976E-33)
            goto L376
        L374:
            r3 = 134217728(0x8000000, float:3.85186E-34)
        L376:
            android.app.PendingIntent r3 = android.app.PendingIntent.getBroadcast(r1, r8, r13, r3)     // Catch: java.lang.Throwable -> L397
            android.app.Notification$Action$Builder r4 = new android.app.Notification$Action$Builder     // Catch: java.lang.Throwable -> L397
            java.lang.String r5 = "快捷回复"
            r6 = 17301584(0x1080050, float:2.497948E-38)
            r4.<init>(r6, r5, r3)     // Catch: java.lang.Throwable -> L397
            android.app.Notification$Action$Builder r3 = r4.addRemoteInput(r12)     // Catch: java.lang.Throwable -> L397
            r3.getClass()     // Catch: java.lang.Throwable -> L397
            r12 = 1
            r3.setAllowGeneratedReplies(r12)     // Catch: java.lang.Throwable -> L397
            r4 = 28
            if (r0 < r4) goto L399
            b0.b0.t(r3)     // Catch: java.lang.Throwable -> L397
            goto L399
        L397:
            r0 = move-exception
            goto L39e
        L399:
            android.app.Notification$Action r0 = r3.build()     // Catch: java.lang.Throwable -> L397
            goto L3a4
        L39e:
            sf.f r3 = new sf.f
            r3.<init>(r0)
            r0 = r3
        L3a4:
            boolean r3 = r0 instanceof sf.f
            if (r3 == 0) goto L3aa
            r0 = 0
        L3aa:
            android.app.Notification$Action r0 = (android.app.Notification.Action) r0
            if (r0 == 0) goto L3b1
            r7.addAction(r0)
        L3b1:
            android.app.Notification r0 = r7.build()
            r5 = r20
            r5.notify(r8, r0)
            boolean r0 = r2.f2402m
            if (r0 == 0) goto L428
            java.lang.String r3 = r2.f2391b
            android.service.notification.StatusBarNotification[] r0 = r5.getActiveNotifications()     // Catch: java.lang.Throwable -> L3db
            r0.getClass()     // Catch: java.lang.Throwable -> L3db
            int r4 = r0.length     // Catch: java.lang.Throwable -> L3db
            r12 = 0
        L3c9:
            if (r12 >= r4) goto L414
            r6 = r0[r12]     // Catch: java.lang.Throwable -> L3db
            int r7 = r6.getId()     // Catch: java.lang.Throwable -> L3db
            if (r7 != r8) goto L3dd
            java.lang.String r7 = r6.getTag()     // Catch: java.lang.Throwable -> L3db
            if (r7 != 0) goto L3dd
        L3d9:
            r9 = 0
            goto L411
        L3db:
            r0 = move-exception
            goto L417
        L3dd:
            android.app.Notification r7 = r6.getNotification()     // Catch: java.lang.Throwable -> L3db
            if (r7 == 0) goto L3d9
            android.os.Bundle r7 = r7.extras     // Catch: java.lang.Throwable -> L3db
            if (r7 == 0) goto L3d9
            r9 = 0
            boolean r10 = r7.getBoolean(r11, r9)     // Catch: java.lang.Throwable -> L3db
            if (r10 == 0) goto L411
            java.lang.String r7 = r7.getString(r14)     // Catch: java.lang.Throwable -> L3db
            boolean r7 = gg.l.a(r7, r3)     // Catch: java.lang.Throwable -> L3db
            if (r7 == 0) goto L411
            java.lang.String r7 = r6.getTag()     // Catch: java.lang.Throwable -> L3db
            if (r7 != 0) goto L406
            int r6 = r6.getId()     // Catch: java.lang.Throwable -> L3db
            r5.cancel(r6)     // Catch: java.lang.Throwable -> L3db
            goto L411
        L406:
            java.lang.String r7 = r6.getTag()     // Catch: java.lang.Throwable -> L3db
            int r6 = r6.getId()     // Catch: java.lang.Throwable -> L3db
            r5.cancel(r7, r6)     // Catch: java.lang.Throwable -> L3db
        L411:
            int r12 = r12 + 1
            goto L3c9
        L414:
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L3db
            goto L41d
        L417:
            sf.f r4 = new sf.f
            r4.<init>(r0)
            r0 = r4
        L41d:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L428
            java.lang.String r4 = "[Hchat:CustomNotification] 合并会话通知清理失败: "
            eh.a.x(r4, r3, r0)
        L428:
            boolean r0 = r2.f2398i
            if (r0 == 0) goto L46f
            java.lang.String r0 = r2.f2408s
            boolean r2 = og.m.t0(r0)     // Catch: java.lang.Throwable -> L439
            if (r2 == 0) goto L43b
            android.net.Uri r0 = android.media.RingtoneManager.getDefaultUri(r16)     // Catch: java.lang.Throwable -> L439
            goto L446
        L439:
            r0 = move-exception
            goto L440
        L43b:
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L439
            goto L446
        L440:
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L446:
            boolean r2 = r0 instanceof sf.f
            if (r2 == 0) goto L44d
            r5 = 0
            goto L44e
        L44d:
            r5 = r0
        L44e:
            android.net.Uri r5 = (android.net.Uri) r5
            if (r5 != 0) goto L453
            goto L46f
        L453:
            long r2 = java.lang.System.currentTimeMillis()
            long r6 = e9.q.f2473n
            long r6 = r2 - r6
            r8 = 1200(0x4b0, double:5.93E-321)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto L462
            goto L46f
        L462:
            e9.q.f2473n = r2
            android.os.Handler r0 = e9.q.f2465f
            e9.e r2 = new e9.e
            r3 = 0
            r2.<init>(r1, r5, r3)
            r0.post(r2)
        L46f:
            return
    }
}
