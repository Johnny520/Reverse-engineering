package e9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f2422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2423i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2424j;

    public /* synthetic */ f(android.app.NotificationManager r2, int r3, long r4) {
            r1 = this;
            r0 = 0
            r1.f2421g = r0
            r1.<init>()
            r1.f2424j = r2
            r1.f2423i = r3
            r1.f2422h = r4
            return
    }

    public /* synthetic */ f(j8.y r2, long r3, int r5) {
            r1 = this;
            r0 = 1
            r1.f2421g = r0
            r1.<init>()
            r1.f2424j = r2
            r1.f2422h = r3
            r1.f2423i = r5
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r8 = this;
            int r0 = r8.f2421g
            switch(r0) {
                case 0: goto L4d;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r8.f2424j
            j8.y r0 = (j8.y) r0
            long r1 = r8.f2422h
            b.e r1 = r0.c(r1)
            if (r1 != 0) goto L12
            goto L4c
        L12:
            java.lang.Object r2 = r1.f333i     // Catch: java.lang.Throwable -> L2b
            nb.o r2 = (nb.o) r2     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r1 = r1.f332h     // Catch: java.lang.Throwable -> L2b
            nb.w r1 = (nb.w) r1     // Catch: java.lang.Throwable -> L2b
            android.os.Handler r3 = r1.f9312b
            r4 = 3
            int r5 = r8.f2423i
            if (r5 != r4) goto L2d
            nb.s r4 = new nb.s     // Catch: java.lang.Throwable -> L2b
            r5 = 1
            r4.<init>(r1, r2, r5)     // Catch: java.lang.Throwable -> L2b
            r3.post(r4)     // Catch: java.lang.Throwable -> L2b
            goto L4c
        L2b:
            r1 = move-exception
            goto L37
        L2d:
            nb.s r4 = new nb.s     // Catch: java.lang.Throwable -> L2b
            r5 = 0
            r4.<init>(r1, r2, r5)     // Catch: java.lang.Throwable -> L2b
            r3.post(r4)     // Catch: java.lang.Throwable -> L2b
            goto L4c
        L37:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "原语音播放回调执行失败: "
            r2.<init>(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.m(r1)
        L4c:
            return
        L4d:
            java.lang.Object r0 = r8.f2424j
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            int r1 = r8.f2423i
            android.service.notification.StatusBarNotification[] r2 = r0.getActiveNotifications()     // Catch: java.lang.Throwable -> L6e
            r2.getClass()     // Catch: java.lang.Throwable -> L6e
            int r3 = r2.length     // Catch: java.lang.Throwable -> L6e
            r4 = 0
            r5 = r4
        L5d:
            if (r5 >= r3) goto L73
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L6e
            java.lang.String r7 = r6.getTag()     // Catch: java.lang.Throwable -> L6e
            if (r7 != 0) goto L70
            int r7 = r6.getId()     // Catch: java.lang.Throwable -> L6e
            if (r7 != r1) goto L70
            goto L74
        L6e:
            r2 = move-exception
            goto L92
        L70:
            int r5 = r5 + 1
            goto L5d
        L73:
            r6 = 0
        L74:
            if (r6 == 0) goto L8d
            android.app.Notification r2 = r6.getNotification()     // Catch: java.lang.Throwable -> L6e
            if (r2 == 0) goto L8d
            android.os.Bundle r2 = r2.extras     // Catch: java.lang.Throwable -> L6e
            if (r2 == 0) goto L8d
            java.lang.String r3 = "hchat_custom_notification_reply_completion_token"
            long r2 = r2.getLong(r3)     // Catch: java.lang.Throwable -> L6e
            long r5 = r8.f2422h
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L8d
            r4 = 1
        L8d:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L6e
            goto L98
        L92:
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L98:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r4 = r2 instanceof sf.f
            if (r4 == 0) goto L9f
            r2 = r3
        L9f:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Laa
            r0.cancel(r1)
        Laa:
            return
    }
}
