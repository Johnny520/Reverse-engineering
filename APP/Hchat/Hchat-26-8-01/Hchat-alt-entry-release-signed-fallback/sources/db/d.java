package db;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ cb.f f2191h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ db.c f2192i;

    public /* synthetic */ d(cb.f r1, db.c r2, int r3) {
            r0 = this;
            r0.f2190g = r3
            r0.f2191h = r1
            r0.f2192i = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r32 = this;
            r1 = r32
            int r0 = r1.f2190g
            cb.f r2 = r1.f2191h
            switch(r0) {
                case 0: goto L10a;
                default: goto L9;
            }
        L9:
            db.c r0 = r1.f2192i
            java.lang.String r3 = r0.f2168a
            long r4 = r0.f2174g
            java.lang.Object r0 = r2.f1624e
            db.g r0 = (db.g) r0
            boolean r6 = r0.c()
            if (r6 != 0) goto L1b
            goto L109
        L1b:
            db.c r7 = r0.b(r3)
            if (r7 == 0) goto L109
            long r8 = r7.f2174g
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 != 0) goto L109
            java.lang.String r4 = r7.f2180m
            java.lang.String r5 = "running"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L33
            goto L109
        L33:
            long r4 = java.lang.System.currentTimeMillis()
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 >= 0) goto L41
            long r8 = r8 - r4
            r2.s(r7, r8)
            goto L109
        L41:
            java.lang.String r6 = "scheduled_task:"
            java.lang.String r6 = r6.concat(r3)
            java.lang.Object r10 = r2.f1625f
            java.util.concurrent.ConcurrentHashMap r10 = (java.util.concurrent.ConcurrentHashMap) r10
            r10.remove(r6)
            o8.j r10 = cb.f.u()
            if (r10 == 0) goto L57
            r10.a(r6)
        L57:
            long r4 = r4 - r8
            r8 = 0
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 >= 0) goto L5f
            r4 = r8
        L5f:
            r8 = 60000(0xea60, double:2.9644E-319)
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            r8 = 0
            if (r6 > 0) goto L68
            goto L7e
        L68:
            boolean r6 = r7.f2179l
            if (r6 != 0) goto L6d
            goto L79
        L6d:
            int r6 = r7.f2175h
            if (r6 != 0) goto L7e
            r9 = 600000(0x927c0, double:2.964394E-318)
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 >= 0) goto L79
            goto L7e
        L79:
            r2.d(r7, r8, r8)
            goto L109
        L7e:
            java.lang.String r20 = "running"
            r30 = 0
            r31 = 4190207(0x3fefff, float:5.87173E-39)
            r4 = r8
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            db.c r5 = db.c.a(r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r0.d(r5)
            r6 = 1
            r7 = 0
            r8.g r0 = r2.f1621b     // Catch: java.lang.Throwable -> Lcd
            android.content.Context r0 = r0.f11620a     // Catch: java.lang.Throwable -> Lcd
            java.lang.Class<android.os.PowerManager> r8 = android.os.PowerManager.class
            java.lang.Object r0 = r0.getSystemService(r8)     // Catch: java.lang.Throwable -> Lcd
            android.os.PowerManager r0 = (android.os.PowerManager) r0     // Catch: java.lang.Throwable -> Lcd
            if (r0 == 0) goto Le7
            java.lang.String r8 = "Hchat:ScheduledTask"
            android.os.PowerManager$WakeLock r0 = r0.newWakeLock(r6, r8)     // Catch: java.lang.Throwable -> Lcd
            r0.setReferenceCounted(r4)     // Catch: java.lang.Throwable -> Lcd
            r8 = 1800000(0x1b7740, double:8.89318E-318)
            r0.acquire(r8)     // Catch: java.lang.Throwable -> Lcd
            goto Ld4
        Lcd:
            r0 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r0)
            r0 = r4
        Ld4:
            java.lang.Throwable r4 = sf.g.b(r0)
            if (r4 != 0) goto Ldc
            r7 = r0
            goto Le5
        Ldc:
            java.lang.Object r0 = r2.f1623d
            ab.b r0 = (ab.b) r0
            java.lang.String r8 = "定时任务 WakeLock 获取失败"
            r0.invoke(r8, r4)
        Le5:
            android.os.PowerManager$WakeLock r7 = (android.os.PowerManager.WakeLock) r7
        Le7:
            ac.l r0 = new ac.l
            r4 = 10
            r0.<init>(r2, r5, r7, r4)
            o8.j r2 = cb.f.u()
            if (r2 == 0) goto Lf8
            r2.d(r0)
            goto L109
        Lf8:
            java.lang.Thread r2 = new java.lang.Thread
            java.lang.String r4 = "Hchat-ScheduledTask-"
            java.lang.String r3 = r4.concat(r3)
            r2.<init>(r0, r3)
            r2.setDaemon(r6)
            r2.start()
        L109:
            return
        L10a:
            db.c r3 = r1.f2192i
            sf.e r0 = r2.t(r3)     // Catch: java.lang.Throwable -> L111
            goto L118
        L111:
            r0 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r0)
            r0 = r4
        L118:
            java.lang.Throwable r4 = sf.g.b(r0)
            if (r4 != 0) goto L11f
            goto L13b
        L11f:
            java.lang.Object r0 = r2.f1623d
            ab.b r0 = (ab.b) r0
            java.lang.String r5 = "定时任务立即执行异常"
            r0.invoke(r5, r4)
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r4 = cb.f.b(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            sf.e r5 = new sf.e
            r5.<init>(r0, r4)
            r0 = r5
        L13b:
            sf.e r0 = (sf.e) r0
            java.lang.Object r4 = r0.f12418g
            java.lang.Number r4 = (java.lang.Number) r4
            int r21 = r4.intValue()
            java.lang.Object r0 = r0.f12419h
            java.lang.Number r0 = (java.lang.Number) r0
            int r22 = r0.intValue()
            monitor-enter(r2)
            java.lang.Object r0 = r2.f1624e     // Catch: java.lang.Throwable -> L18d
            db.g r0 = (db.g) r0     // Catch: java.lang.Throwable -> L18d
            java.lang.String r3 = r3.f2168a     // Catch: java.lang.Throwable -> L18d
            db.c r5 = r0.b(r3)     // Catch: java.lang.Throwable -> L18d
            if (r5 == 0) goto L18f
            java.lang.Object r0 = r2.f1624e     // Catch: java.lang.Throwable -> L18d
            db.g r0 = (db.g) r0     // Catch: java.lang.Throwable -> L18d
            java.lang.String r18 = "pending"
            long r19 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L18d
            r28 = 0
            r29 = 4132863(0x3f0fff, float:5.791375E-39)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            db.c r3 = db.c.a(r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch: java.lang.Throwable -> L18d
            r0.d(r3)     // Catch: java.lang.Throwable -> L18d
            r2.r()     // Catch: java.lang.Throwable -> L18d
            monitor-exit(r2)
            goto L190
        L18d:
            r0 = move-exception
            goto L191
        L18f:
            monitor-exit(r2)
        L190:
            return
        L191:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18d
            throw r0
    }
}
