package ha;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ab.b f5156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.Context f5157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.content.SharedPreferences f5158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.os.Handler f5159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f5160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.LinkedHashSet f5161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.LinkedHashMap f5162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile java.lang.String f5163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b9.b f5165j;

    public b0(r8.g r2, ab.b r3) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            r1.f5156a = r3
            android.content.Context r2 = r2.f11620a
            r1.f5157b = r2
            java.lang.String r3 = "Hchat_moments_post_notification_config"
            android.content.SharedPreferences r2 = ub.b.c(r2, r3)
            r1.f5158c = r2
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r3.<init>(r0)
            r1.f5159d = r3
            c9.q r3 = new c9.q
            r0 = 14
            r3.<init>(r0)
            java.util.concurrent.ExecutorService r3 = java.util.concurrent.Executors.newSingleThreadExecutor(r3)
            r1.f5160e = r3
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            r1.f5161f = r3
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r1.f5162g = r3
            java.lang.String r3 = "enable"
            r0 = 0
            boolean r2 = r2.getBoolean(r3, r0)
            r1.f5164i = r2
            b9.b r2 = new b9.b
            r3 = 7
            r2.<init>(r1, r3)
            r1.f5165j = r2
            return
    }

    public static java.lang.String a(ha.c0 r2, java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = "%sender%"
            r1 = 0
            java.lang.String r3 = og.t.a0(r3, r0, r4, r1)
            java.lang.String r4 = "%wxid%"
            java.lang.String r0 = r2.f5170c
            java.lang.String r3 = og.t.a0(r3, r4, r0, r1)
            ha.d0 r4 = r2.f5172e
            java.lang.String r4 = r4.f5192g
            java.lang.String r0 = "%type%"
            java.lang.String r3 = og.t.a0(r3, r0, r4, r1)
            java.lang.String r4 = "%content%"
            java.lang.String r0 = r2.f5173f
            java.lang.String r3 = og.t.a0(r3, r4, r0, r1)
            java.lang.String r4 = "%snsid%"
            java.lang.String r2 = r2.f5168a
            java.lang.String r2 = og.t.a0(r3, r4, r2, r1)
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public final java.lang.String b(java.lang.String r11, boolean r12) {
            r10 = this;
            java.lang.String r0 = r10.f5163h
            r1 = 0
            if (r0 == 0) goto L7
            goto L70
        L7:
            tf.t r0 = tf.t.f13167g
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r2 = h.Hchat.hooks.api.core.WeChatApis.database()     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L18
            java.lang.String r3 = "PRAGMA database_list"
            java.util.List r2 = r2.query(r3, r1)     // Catch: java.lang.Throwable -> L16
            goto L19
        L16:
            r2 = move-exception
            goto L1d
        L18:
            r2 = r1
        L19:
            if (r2 != 0) goto L23
            r2 = r0
            goto L23
        L1d:
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L23:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L29
            goto L2a
        L29:
            r0 = r2
        L2a:
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L30:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r0.next()
            java.util.Map r2 = (java.util.Map) r2
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "file"
            java.lang.Object r2 = r2.get(r4)
            if (r2 == 0) goto L4b
            java.lang.String r2 = r2.toString()
            goto L4c
        L4b:
            r2 = r1
        L4c:
            if (r2 != 0) goto L50
            java.lang.String r2 = ""
        L50:
            r3.<init>(r2)
            java.io.File r2 = r3.getParentFile()
            if (r2 == 0) goto L30
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "avatar"
            r3.<init>(r2, r4)
            boolean r2 = r3.isDirectory()
            if (r2 == 0) goto L30
            java.lang.String r0 = r3.getAbsolutePath()
            goto L6c
        L6b:
            r0 = r1
        L6c:
            r10.f5163h = r0
            if (r0 == 0) goto L10f
        L70:
            r2 = 0
            r3 = 2
            java.lang.String r4 = "MD5"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)     // Catch: java.lang.Throwable -> L95
            java.nio.charset.Charset r5 = og.a.f9804a     // Catch: java.lang.Throwable -> L95
            byte[] r11 = r11.getBytes(r5)     // Catch: java.lang.Throwable -> L95
            r11.getClass()     // Catch: java.lang.Throwable -> L95
            byte[] r11 = r4.digest(r11)     // Catch: java.lang.Throwable -> L95
            int r4 = r11.length     // Catch: java.lang.Throwable -> L95
            int r4 = r4 * r3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L95
            int r4 = r11.length     // Catch: java.lang.Throwable -> L95
            r6 = r2
        L8e:
            if (r6 < r4) goto L97
            java.lang.String r11 = r5.toString()     // Catch: java.lang.Throwable -> L95
            goto Lc4
        L95:
            r11 = move-exception
            goto Lbe
        L97:
            r7 = r11[r6]     // Catch: java.lang.Throwable -> L95
            int r8 = r7 >>> 4
            r8 = r8 & 15
            r9 = 16
            a.a.w(r9)     // Catch: java.lang.Throwable -> L95
            java.lang.String r8 = java.lang.Integer.toString(r8, r9)     // Catch: java.lang.Throwable -> L95
            r8.getClass()     // Catch: java.lang.Throwable -> L95
            r5.append(r8)     // Catch: java.lang.Throwable -> L95
            r7 = r7 & 15
            a.a.w(r9)     // Catch: java.lang.Throwable -> L95
            java.lang.String r7 = java.lang.Integer.toString(r7, r9)     // Catch: java.lang.Throwable -> L95
            r7.getClass()     // Catch: java.lang.Throwable -> L95
            r5.append(r7)     // Catch: java.lang.Throwable -> L95
            int r6 = r6 + 1
            goto L8e
        Lbe:
            sf.f r4 = new sf.f
            r4.<init>(r11)
            r11 = r4
        Lc4:
            boolean r4 = r11 instanceof sf.f
            if (r4 == 0) goto Lca
            r11 = r1
        Lca:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L10f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 1
            char[] r5 = new char[r5]
            r6 = 47
            r5[r2] = r6
            java.lang.String r0 = og.m.U0(r0, r5)
            r4.append(r0)
            r4.append(r6)
            java.lang.String r0 = r11.substring(r2, r3)
            r4.append(r0)
            r4.append(r6)
            r0 = 4
            java.lang.String r0 = r11.substring(r3, r0)
            r4.append(r0)
            java.lang.String r0 = "/user_"
            r4.append(r0)
            if (r12 == 0) goto L102
            java.lang.String r12 = "hd_"
            r4.append(r12)
        L102:
            java.lang.String r12 = ".png"
            java.lang.String r11 = eh.a.r(r4, r11, r12)
            boolean r12 = eh.a.y(r11)
            if (r12 == 0) goto L10f
            r1 = r11
        L10f:
            return r1
    }

    public final void c(ha.c0 r12, java.lang.String r13, java.lang.String r14) {
            r11 = this;
            android.content.Context r0 = r11.f5157b
            java.lang.String r1 = "notification"
            java.lang.Object r0 = r0.getSystemService(r1)
            boolean r1 = r0 instanceof android.app.NotificationManager
            r2 = 0
            if (r1 == 0) goto L10
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            goto L11
        L10:
            r0 = r2
        L11:
            if (r0 == 0) goto L20f
            java.lang.String r1 = "hchat_moments_post_v2"
            android.app.NotificationChannel r1 = r0.getNotificationChannel(r1)
            r3 = 1
            if (r1 != 0) goto L34
            android.app.NotificationChannel r1 = new android.app.NotificationChannel
            java.lang.String r4 = "hchat_moments_post_v2"
            java.lang.String r5 = "朋友圈发布通知"
            r6 = 4
            r1.<init>(r4, r5, r6)
            r1.enableVibration(r3)
            long[] r4 = new long[r6]
            r4 = {x0210: FILL_ARRAY_DATA , data: [0, 250, 180, 250} // fill-array
            r1.setVibrationPattern(r4)
            r0.createNotificationChannel(r1)
        L34:
            android.app.Notification$Builder r1 = new android.app.Notification$Builder
            android.content.Context r4 = r11.f5157b
            java.lang.String r5 = "hchat_moments_post_v2"
            r1.<init>(r4, r5)
            r4 = 17301623(0x1080077, float:2.4979588E-38)
            android.app.Notification$Builder r4 = r1.setSmallIcon(r4)
            android.app.Notification$Builder r4 = r4.setContentTitle(r13)
            android.app.Notification$Builder r4 = r4.setContentText(r14)
            android.app.Notification$BigTextStyle r5 = new android.app.Notification$BigTextStyle
            r5.<init>()
            android.app.Notification$BigTextStyle r14 = r5.bigText(r14)
            android.app.Notification$BigTextStyle r13 = r14.setBigContentTitle(r13)
            java.lang.String r14 = "朋友圈通知"
            android.app.Notification$BigTextStyle r13 = r13.setSummaryText(r14)
            android.app.Notification$Builder r13 = r4.setStyle(r13)
            long r4 = java.lang.System.currentTimeMillis()
            android.app.Notification$Builder r13 = r13.setWhen(r4)
            android.app.Notification$Builder r13 = r13.setShowWhen(r3)
            android.app.Notification$Builder r13 = r13.setAutoCancel(r3)
            r14 = 0
            android.app.Notification$Builder r13 = r13.setOnlyAlertOnce(r14)
            r4 = -1
            android.app.Notification$Builder r13 = r13.setDefaults(r4)
            java.lang.String r4 = "msg"
            android.app.Notification$Builder r13 = r13.setCategory(r4)
            android.app.Notification$Builder r13 = r13.setPriority(r3)
            android.app.Notification$Builder r13 = r13.setVisibility(r14)
            java.lang.String r4 = r12.f5168a
            int r4 = r4.hashCode()
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            android.content.ComponentName r6 = new android.content.ComponentName
            android.content.Context r7 = r11.f5157b
            java.lang.String r8 = r7.getPackageName()
            java.lang.String r9 = "com.tencent.mm.ui.LauncherUI"
            r6.<init>(r8, r9)
            r5.setComponent(r6)
            r6 = 872415232(0x34000000, float:1.1920929E-7)
            r5.addFlags(r6)
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            android.content.ComponentName r8 = new android.content.ComponentName
            java.lang.String r9 = r7.getPackageName()
            java.lang.String r10 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI"
            r8.<init>(r9, r10)
            r6.setComponent(r8)
            r8 = 603979776(0x24000000, float:2.7755576E-17)
            r6.addFlags(r8)
            r8 = 201326592(0xc000000, float:9.8607613E-32)
            android.content.Intent[] r5 = new android.content.Intent[]{r5, r6}
            android.app.PendingIntent r4 = android.app.PendingIntent.getActivities(r7, r4, r5, r8)
            r13.setContentIntent(r4)
            java.lang.String r13 = r12.f5170c
            boolean r4 = og.m.t0(r13)
            if (r4 == 0) goto Lda
            goto L1f3
        Lda:
            android.content.Context r4 = r11.f5157b
            java.lang.String r5 = "Hchat_custom_friend_avatar_config"
            android.content.SharedPreferences r5 = ub.b.c(r4, r5)
            java.lang.String r6 = "enable"
            boolean r5 = r5.getBoolean(r6, r14)
            if (r5 == 0) goto L103
            java.lang.String r5 = "Hchat_custom_friend_avatar_config"
            android.content.SharedPreferences r4 = ub.b.c(r4, r5)
            java.lang.String r5 = "scope_moments_notifications"
            boolean r4 = r4.getBoolean(r5, r3)
            if (r4 == 0) goto L103
            android.content.Context r4 = r11.f5157b
            android.graphics.Bitmap r4 = d9.o.e(r4, r13)
            if (r4 == 0) goto L103
        L100:
            r2 = r4
            goto L1f3
        L103:
            java.util.LinkedHashMap r4 = r11.f5162g
            monitor-enter(r4)
            java.util.LinkedHashMap r5 = r11.f5162g     // Catch: java.lang.Throwable -> L20c
            java.lang.Object r5 = r5.get(r13)     // Catch: java.lang.Throwable -> L20c
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5     // Catch: java.lang.Throwable -> L20c
            monitor-exit(r4)
            if (r5 == 0) goto L114
            r2 = r5
            goto L1f3
        L114:
            g8.i r4 = wb.en.c()
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            java.lang.String r6 = r11.b(r13, r14)
            if (r6 == 0) goto L126
            r5.add(r6)
        L126:
            java.lang.String r6 = r11.b(r13, r3)
            if (r6 == 0) goto L12f
            r5.add(r6)
        L12f:
            if (r4 == 0) goto L136
            java.lang.String r3 = r4.m(r13, r3)
            goto L137
        L136:
            r3 = r2
        L137:
            if (r3 != 0) goto L13b
            java.lang.String r3 = ""
        L13b:
            boolean r6 = og.m.t0(r3)
            if (r6 != 0) goto L142
            goto L143
        L142:
            r3 = r2
        L143:
            if (r3 == 0) goto L148
            r5.add(r3)
        L148:
            if (r4 == 0) goto L14f
            java.lang.String r3 = r4.m(r13, r14)
            goto L150
        L14f:
            r3 = r2
        L150:
            if (r3 != 0) goto L154
            java.lang.String r3 = ""
        L154:
            boolean r4 = og.m.t0(r3)
            if (r4 != 0) goto L15b
            goto L15c
        L15b:
            r3 = r2
        L15c:
            if (r3 == 0) goto L161
            r5.add(r3)
        L161:
            java.util.Iterator r3 = r5.iterator()
        L165:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L1be
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "http://"
            boolean r5 = og.t.d0(r4, r5, r14)     // Catch: java.lang.Throwable -> L187
            if (r5 != 0) goto L189
            java.lang.String r5 = "https://"
            boolean r5 = og.t.d0(r4, r5, r14)     // Catch: java.lang.Throwable -> L187
            if (r5 == 0) goto L182
            goto L189
        L182:
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeFile(r4)     // Catch: java.lang.Throwable -> L187
            goto L1b3
        L187:
            r4 = move-exception
            goto L1ad
        L189:
            java.net.URL r5 = new java.net.URL     // Catch: java.lang.Throwable -> L187
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L187
            java.net.URLConnection r4 = r5.openConnection()     // Catch: java.lang.Throwable -> L187
            r5 = 3000(0xbb8, float:4.204E-42)
            r4.setConnectTimeout(r5)     // Catch: java.lang.Throwable -> L187
            r4.setReadTimeout(r5)     // Catch: java.lang.Throwable -> L187
            java.io.InputStream r4 = r4.getInputStream()     // Catch: java.lang.Throwable -> L187
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r4)     // Catch: java.lang.Throwable -> L1a6
            ig.a.i(r4, r2)     // Catch: java.lang.Throwable -> L187
            goto L1b2
        L1a6:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L1a8
        L1a8:
            r6 = move-exception
            ig.a.i(r4, r5)     // Catch: java.lang.Throwable -> L187
            throw r6     // Catch: java.lang.Throwable -> L187
        L1ad:
            sf.f r5 = new sf.f
            r5.<init>(r4)
        L1b2:
            r4 = r5
        L1b3:
            boolean r5 = r4 instanceof sf.f
            if (r5 == 0) goto L1b9
            r4 = r2
        L1b9:
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            if (r4 == 0) goto L165
            goto L1bf
        L1be:
            r4 = r2
        L1bf:
            if (r4 == 0) goto L1f3
            java.util.LinkedHashMap r14 = r11.f5162g
            monitor-enter(r14)
            java.util.LinkedHashMap r2 = r11.f5162g     // Catch: java.lang.Throwable -> L1ec
            r2.put(r13, r4)     // Catch: java.lang.Throwable -> L1ec
        L1c9:
            java.util.LinkedHashMap r13 = r11.f5162g     // Catch: java.lang.Throwable -> L1ec
            int r13 = r13.size()     // Catch: java.lang.Throwable -> L1ec
            r2 = 128(0x80, float:1.8E-43)
            if (r13 <= r2) goto L1ee
            java.util.LinkedHashMap r13 = r11.f5162g     // Catch: java.lang.Throwable -> L1ec
            java.util.Set r2 = r13.entrySet()     // Catch: java.lang.Throwable -> L1ec
            r2.getClass()     // Catch: java.lang.Throwable -> L1ec
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L1ec
            java.lang.Object r2 = tf.m.s1(r2)     // Catch: java.lang.Throwable -> L1ec
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L1ec
            java.lang.Object r2 = r2.getKey()     // Catch: java.lang.Throwable -> L1ec
            r13.remove(r2)     // Catch: java.lang.Throwable -> L1ec
            goto L1c9
        L1ec:
            r12 = move-exception
            goto L1f1
        L1ee:
            monitor-exit(r14)
            goto L100
        L1f1:
            monitor-exit(r14)
            throw r12
        L1f3:
            if (r2 == 0) goto L1f8
            r1.setLargeIcon(r2)
        L1f8:
            java.lang.String r12 = r12.f5168a
            java.lang.String r13 = "hchat_sns_"
            java.lang.String r12 = r13.concat(r12)
            int r12 = r12.hashCode()
            android.app.Notification r13 = r1.build()
            r0.notify(r12, r13)
            return
        L20c:
            r12 = move-exception
            monitor-exit(r4)
            throw r12
        L20f:
            return
    }
}
