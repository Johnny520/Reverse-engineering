package hb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hb.i0 f5319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5320h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f5321i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f5322j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.util.List f5323k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.util.List f5324l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5325m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ b.e f5326n;

    public /* synthetic */ a0(hb.i0 r1, int r2, java.util.Set r3, android.app.Activity r4, java.util.List r5, java.util.List r6, int r7, b.e r8) {
            r0 = this;
            r0.<init>()
            r0.f5319g = r1
            r0.f5320h = r2
            r0.f5321i = r3
            r0.f5322j = r4
            r0.f5323k = r5
            r0.f5324l = r6
            r0.f5325m = r7
            r0.f5326n = r8
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r31) {
            r30 = this;
            r0 = r30
            hb.i0 r1 = r0.f5319g
            int r4 = r0.f5320h
            java.util.Set r5 = r0.f5321i
            android.app.Activity r8 = r0.f5322j
            java.util.List r9 = r0.f5323k
            java.util.List r10 = r0.f5324l
            int r11 = r0.f5325m
            b.e r12 = r0.f5326n
            r2 = r31
            java.lang.Long r2 = (java.lang.Long) r2
            long r6 = r2.longValue()
            r1.getClass()
            long r13 = java.lang.System.currentTimeMillis()
            r15 = 0
            r16 = 0
            if (r4 != 0) goto L36
            int r3 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r3 <= 0) goto L2b
            goto L2c
        L2b:
            r2 = r15
        L2c:
            if (r2 == 0) goto L33
            long r2 = r2.longValue()
            goto L6f
        L33:
            r2 = r16
            goto L6f
        L36:
            r2 = 2
            if (r4 != r2) goto L5a
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L40
            goto L33
        L40:
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            r2.setTimeInMillis(r6)
            r3 = 7
            int r2 = r2.get(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r5.contains(r2)
            if (r2 != 0) goto L5a
            long r6 = a2.a.b(r6, r4, r5)
        L5a:
            r2 = r6
            r6 = r13
            long r2 = a2.a.F(r2, r4, r5, r6)
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L69
            r15 = r13
        L69:
            if (r15 == 0) goto L33
            long r2 = r15.longValue()
        L6f:
            int r6 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r6 > 0) goto L7a
            java.lang.String r2 = "计划时间需要晚于当前时间"
            r1.e(r8, r2)
            goto L1f4
        L7a:
            db.g r6 = new db.g
            r8.g r7 = r1.f5400a
            android.content.Context r7 = r7.f11620a
            r6.<init>(r7)
            r7 = r9
            r28 = r2
            r3 = r8
            r8 = r28
            db.c r2 = a2.a.p()
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = tf.n.e1(r7)
            r13.<init>(r14)
            java.util.Iterator r7 = r7.iterator()
        L9a:
            boolean r14 = r7.hasNext()
            if (r14 == 0) goto L15a
            java.lang.Object r14 = r7.next()
            hb.t r14 = (hb.t) r14
            db.a r15 = new db.a
            r14.getClass()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r16 = r2
            r31 = r3
            long r2 = r14.f5464a
            r17 = r4
            java.lang.String r4 = "msgId"
            r0.put(r4, r2)
            java.lang.String r2 = "type"
            int r3 = r14.f5465b
            r0.put(r2, r3)
            java.lang.String r2 = r14.f5466c
            java.lang.String r3 = "sourceTalker"
            r0.put(r3, r2)
            java.lang.String r2 = r14.f5467d
            r18 = r5
            java.lang.String r5 = "content"
            r0.put(r5, r2)
            java.lang.String r2 = "imagePath"
            r19 = r6
            java.lang.String r6 = r14.f5468e
            r0.put(r2, r6)
            java.lang.String r2 = "createTime"
            r20 = r7
            long r6 = r14.f5469f
            r0.put(r2, r6)
            java.lang.String r2 = "voicePath"
            java.lang.String r6 = r14.f5471h
            r0.put(r2, r6)
            java.lang.String r2 = "voiceDurationMillis"
            int r6 = r14.f5472i
            r0.put(r2, r6)
            java.lang.String r2 = "voiceFileName"
            java.lang.String r6 = r14.f5473j
            r0.put(r2, r6)
            k8.t r2 = r14.f5470g
            if (r2 == 0) goto L137
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            r21 = r8
            long r7 = r2.f7472a
            r6.put(r4, r7)
            java.lang.String r4 = r2.f7473b
            r6.put(r3, r4)
            java.lang.String r3 = r2.f7474c
            r6.put(r5, r3)
            java.lang.String r3 = "retrType"
            int r4 = r2.f7475d
            r6.put(r3, r4)
            java.lang.String r3 = "msgFromScene"
            int r4 = r2.f7476e
            r6.put(r3, r4)
            java.lang.String r3 = "fileName"
            java.lang.String r4 = r2.f7477f
            r6.put(r3, r4)
            java.lang.String r3 = "length"
            int r2 = r2.f7478g
            r6.put(r3, r2)
            java.lang.String r2 = "retransmit"
            r0.put(r2, r6)
            goto L139
        L137:
            r21 = r8
        L139:
            java.lang.String r0 = r0.toString()
            r0.getClass()
            r2 = 8
            r15.<init>(r2, r0)
            r13.add(r15)
            r0 = r30
            r3 = r31
            r2 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            goto L9a
        L15a:
            r16 = r2
            r31 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r21 = r8
            java.util.ArrayList r7 = new java.util.ArrayList
            int r0 = tf.n.e1(r10)
            r7.<init>(r0)
            java.util.Iterator r0 = r10.iterator()
        L173:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L185
            java.lang.Object r2 = r0.next()
            wb.jv r2 = (wb.jv) r2
            java.lang.String r2 = r2.f17140a
            r7.add(r2)
            goto L173
        L185:
            java.lang.Long r0 = java.lang.Long.valueOf(r21)
            java.util.List r25 = a.a.x0(r0)
            r8 = r21
            r22 = 0
            r26 = 458269(0x6fe1d, float:6.42172E-40)
            r3 = 8
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r12
            r12 = 0
            r23 = r13
            r13 = 0
            r14 = 0
            r15 = 0
            r2 = r16
            r10 = r17
            r16 = 0
            r24 = r11
            r11 = r18
            r18 = 0
            r20 = r19
            r19 = 0
            r21 = r20
            java.lang.String r20 = "定时转发[H]"
            r27 = r21
            r21 = 0
            r28 = r27
            r27 = r0
            r0 = r28
            db.c r2 = db.c.a(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            android.content.SharedPreferences r3 = r0.f2199a
            if (r3 == 0) goto L1d8
            android.content.SharedPreferences$Editor r3 = r3.edit()
            if (r3 == 0) goto L1d8
            java.lang.String r4 = "scheduled_task_enable"
            r5 = 1
            android.content.SharedPreferences$Editor r3 = r3.putBoolean(r4, r5)
            if (r3 == 0) goto L1d8
            r3.apply()
        L1d8:
            db.c r2 = a2.a.r(r2)
            r0.d(r2)
            cb.f r0 = be.h.f798a
            if (r0 == 0) goto L1e6
            r0.r()
        L1e6:
            ab.b r0 = r1.f5401b
            r2 = r27
            r2.r(r0)
            java.lang.String r0 = "定时任务已保存"
            r3 = r31
            r1.e(r3, r0)
        L1f4:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
