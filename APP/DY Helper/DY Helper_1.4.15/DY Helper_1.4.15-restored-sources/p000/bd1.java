package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class bd1 {

    /* JADX INFO: renamed from: α */
    public static final java.util.Set f1661 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicBoolean f1662 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.ConcurrentHashMap f1663 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.ConcurrentHashMap f1664 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.concurrent.ConcurrentHashMap f1665 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.util.concurrent.atomic.AtomicReference f1666 = null;

    /* JADX INFO: renamed from: η */
    public static final java.util.concurrent.atomic.AtomicReference f1667 = null;

    /* JADX INFO: renamed from: θ */
    public static final java.util.Map f1668 = null;

    static {
            java.lang.String r0 = "Agw-Js-Conv"
            java.lang.String r1 = "X-Hamlet-Is-Unity"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)
            p000.bd1.f1661 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.bd1.f1662 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.bd1.f1663 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.bd1.f1664 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.bd1.f1665 = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            p000.bd1.f1666 = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            p000.bd1.f1667 = r0
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            p000.bd1.f1668 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m908(java.lang.Object[] r30) {
            r0 = r30
            r1 = 0
            java.lang.Object r2 = p000.AbstractC0312g7.m2253(r1, r0)
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto Le
            java.lang.String r2 = (java.lang.String) r2
            goto Lf
        Le:
            r2 = 0
        Lf:
            if (r2 == 0) goto L1a
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            goto L1b
        L1a:
            r2 = 0
        L1b:
            if (r2 != 0) goto L1f
            java.lang.String r2 = ""
        L1f:
            r6 = r2
            java.lang.String r2 = "farm/"
            r3 = 1
            boolean r2 = p000.q02.m4654(r6, r2, r3)
            r14 = 63
            java.lang.String r5 = p000.q02.m4689(r6, r14, r6)
            char[] r7 = new char[r3]
            r8 = 47
            r7[r1] = r8
            java.lang.String r5 = p000.q02.m4663(r5, r7)
            java.util.Locale r7 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r7)
            r5.getClass()
            java.lang.String r7 = "/config/v2/load"
            boolean r1 = p000.x02.m6479(r5, r7, r1)
            if (r2 != 0) goto L4b
            if (r1 != 0) goto L4b
            return
        L4b:
            java.lang.Object r2 = p000.AbstractC0312g7.m2253(r3, r0)
            boolean r3 = r2 instanceof org.json.JSONObject
            if (r3 == 0) goto L56
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            goto L57
        L56:
            r2 = 0
        L57:
            r3 = 2
            java.lang.Object r3 = p000.AbstractC0312g7.m2253(r3, r0)
            boolean r5 = r3 instanceof org.json.JSONObject
            if (r5 == 0) goto L63
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            goto L64
        L63:
            r3 = 0
        L64:
            r5 = 3
            java.lang.Object r5 = p000.AbstractC0312g7.m2253(r5, r0)
            boolean r7 = r5 instanceof java.lang.String
            if (r7 == 0) goto L70
            java.lang.String r5 = (java.lang.String) r5
            goto L71
        L70:
            r5 = 0
        L71:
            if (r5 == 0) goto L7c
            java.lang.CharSequence r5 = p000.q02.m4660(r5)
            java.lang.String r5 = r5.toString()
            goto L7d
        L7c:
            r5 = 0
        L7d:
            if (r5 != 0) goto L81
            java.lang.String r5 = ""
        L81:
            r7 = r5
            org.json.JSONObject r5 = m926(r2)
            java.lang.String r8 = r5.toString()
            r8.getClass()
            if (r3 != 0) goto L93
            jz r5 = p000.C0450jz.f5672
        L91:
            r15 = r5
            goto Laf
        L93:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r9 = r3.keys()
        L9c:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Laa
            java.lang.Object r10 = r9.next()
            r5.add(r10)
            goto L9c
        Laa:
            java.util.List r5 = p000.AbstractC0984xh.m6657(r5)
            goto L91
        Laf:
            long r20 = java.lang.System.currentTimeMillis()
            wc1 r5 = new wc1
            r13 = 0
            r12 = 0
            r9 = r15
            r10 = r20
            r5.<init>(r6, r7, r8, r9, r10, r12, r13)
            java.util.concurrent.ConcurrentHashMap r9 = p000.bd1.f1663
            r9.put(r6, r5)
            r5 = 4
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r5, r0)
            if (r0 == 0) goto Le9
            java.util.Map r5 = p000.bd1.f1668
            r5.getClass()
            monitor-enter(r5)
            int r9 = r5.size()     // Catch: java.lang.Throwable -> Ldb
            r12 = 128(0x80, float:1.8E-43)
            if (r9 < r12) goto Ldd
            r5.clear()     // Catch: java.lang.Throwable -> Ldb
            goto Ldd
        Ldb:
            r0 = move-exception
            goto Le7
        Ldd:
            xc1 r9 = new xc1     // Catch: java.lang.Throwable -> Ldb
            r9.<init>(r10, r6, r7)     // Catch: java.lang.Throwable -> Ldb
            r5.put(r0, r9)     // Catch: java.lang.Throwable -> Ldb
            monitor-exit(r5)
            goto Le9
        Le7:
            monitor-exit(r5)
            throw r0
        Le9:
            if (r1 == 0) goto Lf5
            java.lang.String r0 = p000.q02.m4689(r6, r14, r6)
            java.lang.String r1 = "r92f7758a36520680"
            p000.AbstractC0602nx.m4121(r1, r7, r0)
            return
        Lf5:
            if (r2 == 0) goto L108
            java.lang.String r0 = "sec_pet_id"
            java.lang.String r0 = r2.optString(r0)
            if (r0 == 0) goto L108
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            goto L109
        L108:
            r0 = 0
        L109:
            if (r0 != 0) goto L10d
            java.lang.String r0 = ""
        L10d:
            if (r3 != 0) goto L114
            kz r1 = p000.C0493kz.f6332
        L111:
            r19 = r1
            goto L16a
        L114:
            java.util.Set r1 = p000.bd1.f1661
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L121:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L161
            java.lang.Object r5 = r1.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r9 = r3.opt(r5)
            if (r9 == 0) goto L15a
            java.lang.Object r12 = org.json.JSONObject.NULL
            if (r9 != r12) goto L138
            r9 = 0
        L138:
            if (r9 == 0) goto L15a
            java.lang.String r9 = r9.toString()
            if (r9 == 0) goto L15a
            java.lang.CharSequence r9 = p000.q02.m4660(r9)
            java.lang.String r9 = r9.toString()
            if (r9 == 0) goto L15a
            int r12 = r9.length()
            if (r12 <= 0) goto L151
            goto L152
        L151:
            r9 = 0
        L152:
            if (r9 == 0) goto L15a
            l91 r12 = new l91
            r12.<init>(r5, r9)
            goto L15b
        L15a:
            r12 = 0
        L15b:
            if (r12 == 0) goto L121
            r2.add(r12)
            goto L121
        L161:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            p000.ex0.m1976(r2, r1)
            goto L111
        L16a:
            int r1 = r0.length()
            if (r1 <= 0) goto L39d
            java.util.Set r1 = r19.keySet()
            java.util.Set r2 = p000.bd1.f1661
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r1 = r1.containsAll(r2)
            if (r1 == 0) goto L39d
            uc1 r1 = p000.uc1.f10693
            java.lang.String r1 = r1.m5842(r0)
            java.util.concurrent.ConcurrentHashMap r2 = p000.bd1.f1665
            java.lang.Object r2 = r2.get(r1)
            vc1 r2 = (p000.vc1) r2
            java.util.concurrent.ConcurrentHashMap r3 = p000.bd1.f1664
            java.lang.Object r3 = r3.get(r1)
            vc1 r3 = (p000.vc1) r3
            if (r3 != 0) goto L1bc
            xn0 r3 = p000.xn0.f12234
            java.util.List r3 = r3.m6761()
            java.util.Iterator r3 = r3.iterator()
        L1a0:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L1b8
            java.lang.Object r5 = r3.next()
            r9 = r5
            vc1 r9 = (p000.vc1) r9
            java.lang.String r9 = r9.m6173()
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L1a0
            goto L1b9
        L1b8:
            r5 = 0
        L1b9:
            r3 = r5
            vc1 r3 = (p000.vc1) r3
        L1bc:
            if (r2 != 0) goto L239
            java.util.concurrent.atomic.AtomicReference r1 = p000.bd1.f1666
            java.lang.Object r5 = r1.get()
            zc1 r5 = (p000.zc1) r5
            r16 = 0
            if (r5 == 0) goto L1e4
            long r20 = java.lang.System.currentTimeMillis()
            r22 = 120001(0x1d4c1, double:5.92884E-319)
            long r12 = r5.f13039
            long r20 = r20 - r12
            int r9 = (r16 > r20 ? 1 : (r16 == r20 ? 0 : -1))
            if (r9 > 0) goto L1de
            int r9 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r9 >= 0) goto L1de
            goto L1df
        L1de:
            r5 = 0
        L1df:
            if (r5 == 0) goto L1e7
            r20 = r10
            goto L23c
        L1e4:
            r22 = 120001(0x1d4c1, double:5.92884E-319)
        L1e7:
            java.util.concurrent.atomic.AtomicReference r5 = p000.bd1.f1667
            java.lang.Object r5 = r5.get()
            yc1 r5 = (p000.yc1) r5
            if (r5 == 0) goto L239
            long r12 = java.lang.System.currentTimeMillis()
            r20 = r10
            long r9 = r5.f12577
            long r12 = r12 - r9
            int r9 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r9 > 0) goto L203
            int r9 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r9 >= 0) goto L203
            goto L204
        L203:
            r5 = 0
        L204:
            if (r5 != 0) goto L207
            goto L23b
        L207:
            ym1 r9 = p000.he1.f4708
            ee1 r9 = r5.f12576
            java.util.ArrayList r10 = m922()
            ge1 r9 = p000.he1.m2501(r9, r10)
            if (r9 != 0) goto L216
            goto L23b
        L216:
            zc1 r22 = new zc1
            long r10 = r9.f4345
            java.lang.String r12 = r9.f4346
            java.lang.Long r13 = r9.f4347
            long r4 = r5.f12577
            java.lang.String r9 = r9.f4348
            java.lang.String r14 = "deferred:"
            java.lang.String r29 = r14.concat(r9)
            r27 = r4
            r23 = r10
            r25 = r12
            r26 = r13
            r22.<init>(r23, r25, r26, r27, r29)
            r5 = r22
            r1.set(r5)
            goto L23c
        L239:
            r20 = r10
        L23b:
            r5 = 0
        L23c:
            vc1 r16 = new vc1
            uc1 r18 = p000.uc1.f10693
            if (r2 == 0) goto L24a
            java.lang.Long r1 = r2.f11235
            if (r1 != 0) goto L247
            goto L24a
        L247:
            r22 = r1
            goto L25d
        L24a:
            if (r3 == 0) goto L24f
            java.lang.Long r1 = r3.f11235
            goto L250
        L24f:
            r1 = 0
        L250:
            if (r1 != 0) goto L247
            if (r5 == 0) goto L25b
            long r9 = r5.f13036
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            goto L247
        L25b:
            r22 = 0
        L25d:
            if (r2 == 0) goto L267
            java.lang.String r1 = r2.f11236
            if (r1 != 0) goto L264
            goto L267
        L264:
            r23 = r1
            goto L276
        L267:
            if (r3 == 0) goto L26c
            java.lang.String r1 = r3.f11236
            goto L26d
        L26c:
            r1 = 0
        L26d:
            if (r1 != 0) goto L264
            if (r5 == 0) goto L274
            java.lang.String r1 = r5.f13037
            goto L264
        L274:
            r23 = 0
        L276:
            if (r2 == 0) goto L282
            java.lang.Long r1 = r2.f11237
            if (r1 != 0) goto L27d
            goto L282
        L27d:
            r17 = r0
            r24 = r1
            goto L293
        L282:
            if (r3 == 0) goto L287
            java.lang.Long r1 = r3.f11237
            goto L288
        L287:
            r1 = 0
        L288:
            if (r1 != 0) goto L27d
            if (r5 == 0) goto L28f
            java.lang.Long r1 = r5.f13038
            goto L27d
        L28f:
            r17 = r0
            r24 = 0
        L293:
            r16.<init>(r17, r18, r19, r20, r22, r23, r24)
            r0 = r16
            if (r2 != 0) goto L2a1
            vc1 r16 = m923(r0, r3)
            r9 = r16
            goto L2a2
        L2a1:
            r9 = r0
        L2a2:
            if (r2 != 0) goto L39d
            java.util.concurrent.ConcurrentHashMap r0 = p000.bd1.f1664
            java.lang.String r1 = r9.m6173()
            r0.put(r1, r9)
            xn0 r1 = p000.xn0.f12234
            monitor-enter(r1)
            boolean r0 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> L2e1
            if (r0 == 0) goto L329
            java.lang.String r0 = r9.f11231     // Catch: java.lang.Throwable -> L2e1
            boolean r0 = p000.q02.m4671(r0)     // Catch: java.lang.Throwable -> L2e1
            if (r0 == 0) goto L2c0
            goto L329
        L2c0:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L2e1
            r0.<init>()     // Catch: java.lang.Throwable -> L2e1
            java.util.List r2 = r1.m6761()     // Catch: java.lang.Throwable -> L2e1
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2e1
        L2cd:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L2e1
            if (r4 == 0) goto L2e4
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L2e1
            vc1 r4 = (p000.vc1) r4     // Catch: java.lang.Throwable -> L2e1
            java.lang.String r10 = r4.m6173()     // Catch: java.lang.Throwable -> L2e1
            r0.put(r10, r4)     // Catch: java.lang.Throwable -> L2e1
            goto L2cd
        L2e1:
            r0 = move-exception
            goto L39b
        L2e4:
            java.lang.String r2 = r9.m6173()     // Catch: java.lang.Throwable -> L2e1
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L2e1
            vc1 r2 = (p000.vc1) r2     // Catch: java.lang.Throwable -> L2e1
            java.lang.String r4 = r9.m6173()     // Catch: java.lang.Throwable -> L2e1
            java.lang.Long r10 = r9.f11235     // Catch: java.lang.Throwable -> L2e1
            if (r10 != 0) goto L2fa
            if (r2 == 0) goto L2fc
            java.lang.Long r10 = r2.f11235     // Catch: java.lang.Throwable -> L2e1
        L2fa:
            r11 = r10
            goto L2fd
        L2fc:
            r11 = 0
        L2fd:
            java.lang.String r10 = r9.f11236     // Catch: java.lang.Throwable -> L2e1
            if (r10 != 0) goto L305
            if (r2 == 0) goto L307
            java.lang.String r10 = r2.f11236     // Catch: java.lang.Throwable -> L2e1
        L305:
            r12 = r10
            goto L308
        L307:
            r12 = 0
        L308:
            java.lang.Long r10 = r9.f11237     // Catch: java.lang.Throwable -> L2e1
            if (r10 != 0) goto L310
            if (r2 == 0) goto L312
            java.lang.Long r10 = r2.f11237     // Catch: java.lang.Throwable -> L2e1
        L310:
            r13 = r10
            goto L313
        L312:
            r13 = 0
        L313:
            r14 = 15
            r10 = 0
            vc1 r2 = p000.vc1.m6172(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L2e1
            r0.put(r4, r2)     // Catch: java.lang.Throwable -> L2e1
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L2e1
            r0.getClass()     // Catch: java.lang.Throwable -> L2e1
            p000.xn0.m6747(r0)     // Catch: java.lang.Throwable -> L2e1
            monitor-exit(r1)
            goto L32a
        L329:
            monitor-exit(r1)
        L32a:
            boolean r0 = p000.dd1.m1714()
            if (r0 == 0) goto L335
            r0 = 2000(0x7d0, double:9.88E-321)
            p000.dd1.m1718(r0)
        L335:
            java.lang.Long r0 = r9.f11235
            if (r0 == 0) goto L360
            if (r3 == 0) goto L33e
            java.lang.Long r4 = r3.f11235
            goto L33f
        L33e:
            r4 = 0
        L33f:
            if (r4 == 0) goto L344
            java.lang.String r1 = "cached"
            goto L34b
        L344:
            if (r5 == 0) goto L349
            java.lang.String r1 = r5.f13040
            goto L34b
        L349:
            java.lang.String r1 = "manual"
        L34b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "rad2803da1aa0f08a"
            r2.<init>(r3)
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            p000.C0888ux.m5985(r0)
            goto L39d
        L360:
            boolean r0 = p000.C0888ux.m5984()
            if (r0 == 0) goto L39d
            java.util.concurrent.atomic.AtomicReference r0 = p000.bd1.f1667
            java.lang.Object r0 = r0.get()
            yc1 r0 = (p000.yc1) r0
            if (r0 == 0) goto L375
            ee1 r0 = r0.f12576
            java.util.Set r4 = r0.f3526
            goto L376
        L375:
            r4 = 0
        L376:
            if (r4 != 0) goto L37a
            nz r4 = p000.C0604nz.f7825
        L37a:
            java.util.ArrayList r0 = m922()
            int r0 = r0.size()
            java.lang.String r1 = m925(r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "r98519b8a46ecbd1e"
            r2.<init>(r3)
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            p000.C0888ux.m5985(r0)
            goto L39d
        L39b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2e1
            throw r0
        L39d:
            java.lang.String r16 = ","
            r20 = 0
            r21 = 62
            r17 = 0
            r18 = 0
            r19 = 0
            java.lang.String r0 = p000.AbstractC0984xh.m6644(r15, r16, r17, r18, r19, r20, r21)
            java.lang.String r1 = "request method="
            java.lang.String r2 = " path="
            java.lang.String r3 = " params="
            java.lang.StringBuilder r1 = p000.lz1.m3695(r1, r7, r2, r6, r3)
            r1.append(r8)
            java.lang.String r2 = " headerNames="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 12000(0x2ee0, float:1.6816E-41)
            java.lang.String r0 = p000.q02.m4693(r0, r1)
            java.lang.String r1 = "r8ce45eb8182ecab1"
            java.lang.String r0 = r1.concat(r0)
            p000.C0888ux.m5985(r0)
            return
    }

    /* JADX INFO: renamed from: β */
    public static final void m909(java.lang.Object r6, java.lang.Integer r7, java.lang.String r8) {
            if (r6 != 0) goto L4
            r6 = 0
            goto L11
        L4:
            java.util.Map r1 = p000.bd1.f1668
            r1.getClass()
            monitor-enter(r1)
            java.lang.Object r6 = r1.remove(r6)     // Catch: java.lang.Throwable -> L70
            xc1 r6 = (p000.xc1) r6     // Catch: java.lang.Throwable -> L70
            monitor-exit(r1)
        L11:
            if (r6 != 0) goto L14
            return
        L14:
            if (r8 != 0) goto L18
            java.lang.String r8 = ""
        L18:
            r0 = 13
            r1 = 32
            java.lang.String r8 = r8.replace(r0, r1)
            r8.getClass()
            r0 = 10
            java.lang.String r8 = r8.replace(r0, r1)
            r8.getClass()
            r0 = 240(0xf0, float:3.36E-43)
            java.lang.String r8 = p000.q02.m4693(r8, r0)
            java.lang.String r0 = r6.f12130
            java.lang.String r1 = r6.f12131
            long r2 = r6.f12132
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = "error"
            org.json.JSONObject r4 = r4.put(r5, r8)
            java.lang.String r5 = r4.toString()
            r5.getClass()
            r4 = r7
            m928(r0, r1, r2, r4, r5)
            java.lang.String r6 = r6.f12130
            if (r4 == 0) goto L57
            int r7 = r4.intValue()
            goto L58
        L57:
            r7 = -1
        L58:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "r60e225453a01e198"
            r0.<init>(r1)
            r0.append(r6)
            r0.append(r7)
            r0.append(r8)
            java.lang.String r6 = r0.toString()
            p000.C0888ux.m5985(r6)
            return
        L70:
            r0 = move-exception
            r6 = r0
            monitor-exit(r1)
            throw r6
    }

    /* JADX INFO: renamed from: γ */
    public static final void m910(java.lang.Object r8, org.json.JSONObject r9) {
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r0 = 0
            if (r8 != 0) goto Lb
            r8 = r0
            goto L18
        Lb:
            java.util.Map r1 = p000.bd1.f1668
            r1.getClass()
            monitor-enter(r1)
            java.lang.Object r8 = r1.remove(r8)     // Catch: java.lang.Throwable -> Lee
            xc1 r8 = (p000.xc1) r8     // Catch: java.lang.Throwable -> Lee
            monitor-exit(r1)
        L18:
            if (r8 != 0) goto L1b
            return
        L1b:
            java.lang.String r7 = r8.f12130
            kd1 r1 = p000.kd1.f5861
            boolean r2 = p000.kd1.m3189(r7)
            if (r2 == 0) goto Lb4
            if (r9 == 0) goto L2c
            java.util.List r9 = r1.m3200(r9)
            goto L2d
        L2c:
            r9 = r0
        L2d:
            if (r9 != 0) goto L31
            jz r9 = p000.C0450jz.f5672
        L31:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "seed_count"
            int r3 = r9.size()
            org.json.JSONObject r1 = r1.put(r2, r3)
            java.lang.String r2 = "shop_seed_count"
            boolean r3 = r9.isEmpty()
            r7 = 0
            if (r3 == 0) goto L4b
            r4 = r7
            goto L69
        L4b:
            java.util.Iterator r3 = r9.iterator()
            r4 = r7
        L50:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L69
            java.lang.Object r6 = r3.next()
            id1 r6 = (p000.id1) r6
            boolean r6 = r6.f5033
            if (r6 == 0) goto L50
            int r4 = r4 + 1
            if (r4 < 0) goto L65
            goto L50
        L65:
            p000.AbstractC1021yh.m6916()
            throw r0
        L69:
            org.json.JSONObject r1 = r1.put(r2, r4)
            java.lang.String r6 = r1.toString()
            r6.getClass()
            java.lang.String r1 = r8.f12130
            java.lang.String r2 = r8.f12131
            long r3 = r8.f12132
            m928(r1, r2, r3, r5, r6)
            java.lang.String r8 = "rc2954fec18baf260"
            int r1 = r9.size()
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L8a
            goto La7
        L8a:
            java.util.Iterator r9 = r9.iterator()
        L8e:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto La7
            java.lang.Object r2 = r9.next()
            id1 r2 = (p000.id1) r2
            boolean r2 = r2.f5033
            if (r2 == 0) goto L8e
            int r7 = r7 + 1
            if (r7 < 0) goto La3
            goto L8e
        La3:
            p000.AbstractC1021yh.m6916()
            throw r0
        La7:
            java.lang.String r9 = "宿主玩法配置已解析 seedCount="
            java.lang.String r2 = " shopSeedCount="
            java.lang.String r9 = p000.AbstractC0602nx.m4125(r1, r7, r9, r2)
            r1 = 4
            p000.C0888ux.m5992(r8, r9, r0, r1, r0)
            return
        Lb4:
            org.json.JSONObject r9 = m926(r9)
            java.lang.String r6 = r9.toString()
            r6.getClass()
            java.lang.String r1 = r8.f12130
            java.lang.String r2 = r8.f12131
            long r3 = r8.f12132
            m928(r1, r2, r3, r5, r6)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "response source=bridge path="
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r9 = " data="
            r8.append(r9)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            r9 = 12000(0x2ee0, float:1.6816E-41)
            java.lang.String r8 = p000.q02.m4693(r8, r9)
            java.lang.String r9 = "r8ce45eb8182ecab1"
            java.lang.String r8 = r9.concat(r8)
            p000.C0888ux.m5985(r8)
            return
        Lee:
            r0 = move-exception
            r8 = r0
            monitor-exit(r1)
            throw r8
    }

    /* JADX INFO: renamed from: δ */
    public static final void m911(java.lang.Object[] r13) {
            r1 = 0
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r1, r13)
            if (r0 != 0) goto L9
            goto L1a1
        L9:
            r2 = 1
            java.lang.Object r13 = p000.AbstractC0312g7.m2253(r2, r13)
            if (r13 != 0) goto L12
            goto L1a1
        L12:
            java.lang.String r3 = "request"
            java.lang.Object r3 = m920(r0, r3)
            if (r3 != 0) goto L1c
            goto L1a1
        L1c:
            java.lang.String r0 = "getUrl"
            java.lang.Object r0 = m920(r3, r0)
            r4 = 0
            if (r0 == 0) goto L34
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L34
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            goto L35
        L34:
            r0 = r4
        L35:
            java.lang.String r5 = ""
            if (r0 != 0) goto L3b
            r6 = r5
            goto L3c
        L3b:
            r6 = r0
        L3c:
            kd1 r0 = p000.kd1.f5861
            boolean r7 = p000.kd1.m3189(r6)
            java.lang.String r8 = "farm/"
            boolean r2 = p000.q02.m4654(r6, r8, r2)
            if (r2 != 0) goto L4e
            if (r7 != 0) goto L4e
            goto L1a1
        L4e:
            java.lang.String r2 = "body"
            java.lang.Object r2 = m920(r13, r2)
            if (r2 == 0) goto L5b
            java.lang.String r2 = r2.toString()
            goto L5c
        L5b:
            r2 = r4
        L5c:
            if (r2 != 0) goto L5f
            r2 = r5
        L5f:
            java.lang.String r8 = "code"
            java.lang.Object r13 = m920(r13, r8)
            boolean r8 = r13 instanceof java.lang.Number
            if (r8 == 0) goto L6c
            java.lang.Number r13 = (java.lang.Number) r13
            goto L6d
        L6c:
            r13 = r4
        L6d:
            if (r13 == 0) goto L79
            int r13 = r13.intValue()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r10 = r13
            goto L7a
        L79:
            r10 = r4
        L7a:
            java.lang.String r13 = "getMethod"
            if (r7 == 0) goto L133
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L88
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L88
            java.util.List r0 = r0.m3200(r7)     // Catch: java.lang.Throwable -> L88
            goto L8f
        L88:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L8f:
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L95
            jz r0 = p000.C0450jz.f5672
        L95:
            java.util.List r0 = (java.util.List) r0
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r7 = "seed_count"
            int r8 = r0.size()
            org.json.JSONObject r2 = r2.put(r7, r8)
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto Lae
            r8 = r1
            goto Lcc
        Lae:
            java.util.Iterator r7 = r0.iterator()
            r8 = r1
        Lb3:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto Lcc
            java.lang.Object r9 = r7.next()
            id1 r9 = (p000.id1) r9
            boolean r9 = r9.f5033
            if (r9 == 0) goto Lb3
            int r8 = r8 + 1
            if (r8 < 0) goto Lc8
            goto Lb3
        Lc8:
            p000.AbstractC1021yh.m6916()
            throw r4
        Lcc:
            java.lang.String r7 = "shop_seed_count"
            org.json.JSONObject r2 = r2.put(r7, r8)
            java.lang.String r11 = r2.toString()
            r11.getClass()
            java.lang.Object r13 = m920(r3, r13)
            if (r13 == 0) goto Lee
            java.lang.String r13 = r13.toString()
            if (r13 == 0) goto Lee
            java.lang.CharSequence r13 = p000.q02.m4660(r13)
            java.lang.String r13 = r13.toString()
            goto Lef
        Lee:
            r13 = r4
        Lef:
            if (r13 != 0) goto Lf3
            r7 = r5
            goto Lf4
        Lf3:
            r7 = r13
        Lf4:
            long r8 = java.lang.System.currentTimeMillis()
            m928(r6, r7, r8, r10, r11)
            int r13 = r0.size()
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L106
            goto L123
        L106:
            java.util.Iterator r0 = r0.iterator()
        L10a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L123
            java.lang.Object r2 = r0.next()
            id1 r2 = (p000.id1) r2
            boolean r2 = r2.f5033
            if (r2 == 0) goto L10a
            int r1 = r1 + 1
            if (r1 < 0) goto L11f
            goto L10a
        L11f:
            p000.AbstractC1021yh.m6916()
            throw r4
        L123:
            java.lang.String r0 = "宿主玩法配置监控响应已解析 seedCount="
            java.lang.String r2 = " shopSeedCount="
            java.lang.String r13 = p000.AbstractC0602nx.m4125(r13, r1, r0, r2)
            r0 = 4
            java.lang.String r1 = "rc2954fec18baf260"
            p000.C0888ux.m5992(r1, r13, r4, r0, r4)
            goto L1a1
        L133:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L141
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L141
            org.json.JSONObject r0 = m926(r0)     // Catch: java.lang.Throwable -> L141
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L141
            goto L148
        L141:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L148:
            java.lang.Throwable r1 = p000.fo1.m2190(r0)
            r12 = 12000(0x2ee0, float:1.6816E-41)
            if (r1 != 0) goto L151
            goto L155
        L151:
            java.lang.String r0 = p000.q02.m4693(r2, r12)
        L155:
            r0.getClass()
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r13 = m920(r3, r13)
            if (r13 == 0) goto L16f
            java.lang.String r13 = r13.toString()
            if (r13 == 0) goto L16f
            java.lang.CharSequence r13 = p000.q02.m4660(r13)
            java.lang.String r4 = r13.toString()
        L16f:
            if (r4 != 0) goto L173
            r7 = r5
            goto L174
        L173:
            r7 = r4
        L174:
            long r8 = java.lang.System.currentTimeMillis()
            m928(r6, r7, r8, r10, r11)
            if (r10 == 0) goto L182
            int r13 = r10.intValue()
            goto L183
        L182:
            r13 = -1
        L183:
            java.lang.String r0 = " path="
            java.lang.String r1 = " data="
            java.lang.String r2 = "response http="
            java.lang.StringBuilder r13 = p000.a12.m20(r13, r2, r0, r6, r1)
            r13.append(r11)
            java.lang.String r13 = r13.toString()
            java.lang.String r13 = p000.q02.m4693(r13, r12)
            java.lang.String r0 = "r8ce45eb8182ecab1"
            java.lang.String r13 = r0.concat(r13)
            p000.C0888ux.m5985(r13)
        L1a1:
            return
    }

    /* JADX INFO: renamed from: ε */
    public static final void m912(java.lang.Object[] r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r6.length
            r2 = 0
        L7:
            r3 = 0
            if (r2 >= r1) goto L1b
            r4 = r6[r2]
            boolean r5 = r4 instanceof java.util.Map
            if (r5 == 0) goto L13
            r3 = r4
            java.util.Map r3 = (java.util.Map) r3
        L13:
            if (r3 == 0) goto L18
            r0.add(r3)
        L18:
            int r2 = r2 + 1
            goto L7
        L1b:
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto L23
            goto Lc4
        L23:
            ym1 r6 = p000.he1.f4708
            java.util.ArrayList r6 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r0, r1)
            r6.<init>(r1)
            java.util.Iterator r1 = r0.iterator()
        L34:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()
            java.util.Map r2 = (java.util.Map) r2
            ee1 r2 = p000.he1.m2498(r2)
            r6.add(r2)
            goto L34
        L48:
            ee1 r1 = new ee1
            r1.<init>()
            java.util.Iterator r6 = r6.iterator()
        L51:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L62
            java.lang.Object r2 = r6.next()
            ee1 r2 = (p000.ee1) r2
            ee1 r1 = r1.m1918(r2)
            goto L51
        L62:
            java.lang.String r6 = "unity_state"
            m914(r1, r6)
            boolean r6 = r1.m1917()
            if (r6 != 0) goto Lc4
            boolean r6 = p000.C0888ux.m5984()
            if (r6 == 0) goto Lc4
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r0 = r0.iterator()
        L7c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb3
            java.lang.Object r1 = r0.next()
            java.util.Map r1 = (java.util.Map) r1
            java.util.Set r1 = r1.keySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L97:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Laf
            java.lang.Object r4 = r1.next()
            if (r4 == 0) goto La8
            java.lang.String r4 = r4.toString()
            goto La9
        La8:
            r4 = r3
        La9:
            if (r4 == 0) goto L97
            r2.add(r4)
            goto L97
        Laf:
            p000.AbstractC0984xh.m6660(r6, r2)
            goto L7c
        Lb3:
            java.util.Set r6 = p000.AbstractC0984xh.m6671(r6)
            java.lang.String r6 = m925(r6)
            java.lang.String r0 = "r151314eb9ef1f86"
            java.lang.String r6 = r0.concat(r6)
            p000.C0888ux.m5985(r6)
        Lc4:
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static final void m913(android.app.Activity r12) {
            java.util.concurrent.atomic.AtomicReference r0 = p000.bd1.f1666
            r1 = 0
            r0.set(r1)
            java.util.concurrent.atomic.AtomicReference r0 = p000.bd1.f1667
            r0.set(r1)
            java.lang.String r0 = "launch_schema"
            if (r12 == 0) goto L1a
            android.content.Intent r12 = r12.getIntent()
            if (r12 == 0) goto L1a
            java.lang.String r12 = r12.getStringExtra(r0)
            goto L1b
        L1a:
            r12 = r1
        L1b:
            ym1 r2 = p000.he1.f4708
            if (r12 == 0) goto L27
            java.lang.CharSequence r12 = p000.q02.m4660(r12)
            java.lang.String r1 = r12.toString()
        L27:
            java.lang.String r12 = ""
            if (r1 != 0) goto L2c
            r1 = r12
        L2c:
            int r2 = r1.length()
            if (r2 != 0) goto L39
            ee1 r12 = new ee1
            r12.<init>()
            goto Lb2
        L39:
            r2 = 63
            java.lang.String r1 = p000.q02.m4685(r1, r2, r12)
            r2 = 35
            java.lang.String r1 = p000.q02.m4689(r1, r2, r1)
            int r2 = r1.length()
            if (r2 != 0) goto L51
            ee1 r12 = new ee1
            r12.<init>()
            goto Lb2
        L51:
            b8 r2 = new b8
            r3 = 5
            r2.<init>(r3)
            r3 = 1
            char[] r3 = new char[r3]
            r4 = 38
            r5 = 0
            r3[r5] = r4
            r4 = 6
            java.util.List r1 = p000.q02.m4682(r1, r3, r5, r4)
            java.util.Iterator r1 = r1.iterator()
        L68:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L93
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = p000.q02.m4671(r3)
            if (r4 != 0) goto L68
            r4 = 61
            java.lang.String r6 = p000.q02.m4689(r3, r4, r3)
            java.lang.String r3 = p000.q02.m4685(r3, r4, r12)
            java.lang.String r4 = p000.he1.m2497(r6)
            java.lang.String r3 = p000.he1.m2497(r3)
            r2.m809(r3, r4)
            r2.m822(r3, r5)
            goto L68
        L93:
            ee1 r6 = new ee1
            java.lang.Object r12 = r2.f1555
            r7 = r12
            java.lang.Long r7 = (java.lang.Long) r7
            java.lang.Object r12 = r2.f1556
            r8 = r12
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r12 = r2.f1557
            r9 = r12
            java.lang.Long r9 = (java.lang.Long) r9
            java.lang.Object r12 = r2.f1558
            r10 = r12
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r12 = r2.f1559
            r11 = r12
            java.util.LinkedHashSet r11 = (java.util.LinkedHashSet) r11
            r6.<init>(r7, r8, r9, r10, r11)
            r12 = r6
        Lb2:
            m914(r12, r0)
            boolean r0 = r12.m1917()
            if (r0 != 0) goto Ld0
            boolean r0 = p000.C0888ux.m5984()
            if (r0 == 0) goto Ld0
            java.util.Set r12 = r12.f3526
            java.lang.String r12 = m925(r12)
            java.lang.String r0 = "r5272cef44c97f052"
            java.lang.String r12 = r0.concat(r12)
            p000.C0888ux.m5985(r12)
        Ld0:
            return
    }

    /* JADX INFO: renamed from: η */
    public static void m914(p000.ee1 r13, java.lang.String r14) {
            boolean r0 = r13.m1917()
            if (r0 != 0) goto L7
            goto L55
        L7:
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = r13.f3522
            r1 = 0
            r2 = 1
            java.util.concurrent.atomic.AtomicReference r3 = p000.bd1.f1667
            if (r0 != 0) goto L56
            java.lang.String r0 = r13.f3523
            if (r0 == 0) goto L1d
            boolean r0 = p000.q02.m4671(r0)
            if (r0 == 0) goto L56
        L1d:
            java.lang.Long r0 = r13.f3524
            if (r0 != 0) goto L56
            java.lang.String r0 = r13.f3525
            if (r0 == 0) goto L2b
            boolean r0 = p000.q02.m4671(r0)
            if (r0 == 0) goto L56
        L2b:
            boolean r0 = p000.C0888ux.m5984()
            if (r0 == 0) goto L55
            java.util.Set r13 = r13.f3526
            java.lang.String r13 = m925(r13)
            java.lang.Object r0 = r3.get()
            if (r0 == 0) goto L3e
            r1 = r2
        L3e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "r7196732039ba50b0"
            r0.<init>(r2)
            r0.append(r14)
            r0.append(r13)
            r0.append(r1)
            java.lang.String r13 = r0.toString()
            p000.C0888ux.m5985(r13)
        L55:
            return
        L56:
            java.lang.Object r0 = r3.get()
            yc1 r0 = (p000.yc1) r0
            r4 = 0
            r8 = 0
            if (r0 == 0) goto L71
            long r9 = r0.f12577
            long r9 = r6 - r9
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 > 0) goto L71
            r11 = 120001(0x1d4c1, double:5.92884E-319)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L71
            goto L72
        L71:
            r0 = r8
        L72:
            java.lang.String r9 = "launch_schema"
            boolean r9 = r14.equals(r9)
            if (r9 != 0) goto L83
            if (r0 != 0) goto L7d
            goto L83
        L7d:
            ee1 r0 = r0.f12576
            ee1 r13 = r13.m1918(r0)
        L83:
            java.util.Set r0 = r13.f3526
            yc1 r9 = new yc1
            r9.<init>(r13, r6)
            r3.set(r9)
            java.util.ArrayList r3 = m922()
            ge1 r9 = p000.he1.m2501(r13, r3)
            if (r9 != 0) goto L1d6
            java.lang.String r6 = m925(r0)
            java.lang.String r7 = r13.f3523
            if (r7 != 0) goto La1
            java.lang.String r7 = ""
        La1:
            de1 r9 = p000.he1.m2499(r7, r3)
            java.lang.Long r13 = r13.f3524
            if (r13 == 0) goto Le7
            long r10 = r13.longValue()
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r4 <= 0) goto Lb2
            goto Lb3
        Lb2:
            r13 = r8
        Lb3:
            if (r13 == 0) goto Le7
            long r4 = r13.longValue()
            boolean r13 = r3.isEmpty()
            if (r13 == 0) goto Lc0
            goto Le7
        Lc0:
            java.util.Iterator r13 = r3.iterator()
            r3 = r1
        Lc5:
            boolean r10 = r13.hasNext()
            if (r10 == 0) goto Le8
            java.lang.Object r10 = r13.next()
            fe1 r10 = (p000.fe1) r10
            java.lang.Long r10 = r10.f3914
            if (r10 != 0) goto Ld6
            goto Lc5
        Ld6:
            long r10 = r10.longValue()
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 != 0) goto Lc5
            int r3 = r3 + 1
            if (r3 < 0) goto Le3
            goto Lc5
        Le3:
            p000.AbstractC1021yh.m6916()
            throw r8
        Le7:
            r3 = r1
        Le8:
            int r13 = r7.length()
            if (r13 <= 0) goto Lf0
            r13 = r2
            goto Lf1
        Lf0:
            r13 = r1
        Lf1:
            int r4 = r7.length()
            int r5 = r7.length()
            if (r5 <= 0) goto L112
            r5 = r1
        Lfc:
            int r10 = r7.length()
            if (r5 >= r10) goto L110
            char r10 = r7.charAt(r5)
            boolean r10 = java.lang.Character.isDigit(r10)
            if (r10 != 0) goto L10d
            goto L112
        L10d:
            int r5 = r5 + 1
            goto Lfc
        L110:
            r5 = r2
            goto L113
        L112:
            r5 = r1
        L113:
            char[] r2 = new char[r2]
            r10 = 58
            r2[r1] = r10
            r10 = 6
            java.util.List r2 = p000.q02.m4682(r7, r2, r1, r10)
            boolean r10 = r2.isEmpty()
            if (r10 == 0) goto L125
            goto L144
        L125:
            java.util.Iterator r2 = r2.iterator()
        L129:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L144
            java.lang.Object r10 = r2.next()
            java.lang.String r10 = (java.lang.String) r10
            int r10 = r10.length()
            if (r10 <= 0) goto L129
            int r1 = r1 + 1
            if (r1 < 0) goto L140
            goto L129
        L140:
            p000.AbstractC1021yh.m6916()
            throw r8
        L144:
            ym1 r2 = p000.he1.f4708
            cu r2 = p000.ym1.m6940(r2, r7)
            f71 r7 = new f71
            r8 = 23
            r7.<init>(r8)
            y30 r2 = p000.us1.m5943(r2, r7)
            java.util.Set r2 = p000.us1.m5950(r2)
            int r2 = r2.size()
            java.util.List r7 = r9.f3106
            int r7 = r7.size()
            java.util.List r8 = r9.f3107
            int r8 = r8.size()
            java.util.List r10 = r9.f3108
            int r10 = r10.size()
            java.util.List r9 = r9.f3109
            int r9 = r9.size()
            java.lang.String r11 = "sec_uid"
            boolean r0 = r0.contains(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "cidPresent="
            r11.<init>(r12)
            r11.append(r13)
            java.lang.String r13 = " cidLength="
            r11.append(r13)
            r11.append(r4)
            java.lang.String r13 = " cidNumeric="
            r11.append(r13)
            r11.append(r5)
            java.lang.String r13 = " cidParts="
            r11.append(r13)
            r11.append(r1)
            java.lang.String r13 = " cidNumbers="
            r11.append(r13)
            java.lang.String r13 = " matches=short:"
            java.lang.String r1 = ",exact:"
            p000.AbstractC0602nx.m4117(r11, r2, r13, r7, r1)
            java.lang.String r13 = ",participants:"
            java.lang.String r1 = ",uid:"
            p000.AbstractC0602nx.m4117(r11, r8, r13, r10, r1)
            java.lang.String r13 = ",other:"
            java.lang.String r1 = " secUidObserved="
            p000.AbstractC0602nx.m4117(r11, r9, r13, r3, r1)
            r11.append(r0)
            java.lang.String r13 = r11.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "rf973f421553d444f"
            r0.<init>(r1)
            r0.append(r14)
            r0.append(r6)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            p000.C0888ux.m5985(r13)
            return
        L1d6:
            java.lang.String r13 = r9.f4348
            zc1 r1 = new zc1
            long r2 = r9.f4345
            java.lang.String r4 = r9.f4346
            java.lang.Long r5 = r9.f4347
            java.lang.String r0 = ":"
            java.lang.String r8 = p000.lz1.m3688(r14, r0, r13)
            r1.<init>(r2, r4, r5, r6, r8)
            java.util.concurrent.atomic.AtomicReference r0 = p000.bd1.f1666
            r0.set(r1)
            long r0 = r9.f4345
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "r1aefe15b196f0fa6"
            r2.<init>(r3)
            r2.append(r0)
            r2.append(r14)
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            p000.C0888ux.m5985(r13)
            return
    }

    /* JADX INFO: renamed from: θ */
    public static void m915(java.lang.Class r8) {
            java.lang.reflect.Method[] r8 = r8.getDeclaredMethods()
            r8.getClass()
            java.util.List r8 = p000.AbstractC0312g7.m2262(r8)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r8.iterator()
        L14:
            boolean r2 = r1.hasNext()
            java.lang.Class r3 = java.lang.Void.TYPE
            if (r2 == 0) goto L41
            java.lang.Object r2 = r1.next()
            r4 = r2
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.Class r5 = r4.getReturnType()
            boolean r3 = p000.ln0.m3626(r5, r3)
            if (r3 == 0) goto L14
            java.lang.Class[] r3 = r4.getParameterTypes()
            java.lang.Class<org.json.JSONObject> r4 = org.json.JSONObject.class
            java.lang.Class[] r4 = new java.lang.Class[]{r4}
            boolean r3 = java.util.Arrays.equals(r3, r4)
            if (r3 == 0) goto L14
            r0.add(r2)
            goto L14
        L41:
            java.lang.Object r0 = p000.AbstractC0984xh.m6656(r0)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto Lbc
            r1 = 1
            r0.setAccessible(r1)
            xq0 r2 = p000.xq0.f12253
            oj0 r4 = new oj0
            r5 = 26
            r4.<init>(r5)
            r2.m6775(r0, r4)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L62:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto La4
            java.lang.Object r2 = r8.next()
            r4 = r2
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.Class[] r5 = r4.getParameterTypes()
            java.lang.Class r4 = r4.getReturnType()
            boolean r4 = p000.ln0.m3626(r4, r3)
            if (r4 == 0) goto L62
            int r4 = r5.length
            r6 = 2
            if (r4 != r6) goto L62
            r4 = 0
            r6 = r5[r4]
            java.lang.Class r7 = java.lang.Integer.TYPE
            boolean r6 = p000.ln0.m3626(r6, r7)
            if (r6 != 0) goto L96
            r4 = r5[r4]
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            boolean r4 = p000.ln0.m3626(r4, r6)
            if (r4 == 0) goto L62
        L96:
            r4 = r5[r1]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 == 0) goto L62
            r0.add(r2)
            goto L62
        La4:
            java.lang.Object r8 = p000.AbstractC0984xh.m6656(r0)
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            if (r8 == 0) goto Lbb
            r8.setAccessible(r1)
            xq0 r0 = p000.xq0.f12253
            oj0 r1 = new oj0
            r2 = 27
            r1.<init>(r2)
            r0.m6775(r8, r1)
        Lbb:
            return
        Lbc:
            java.lang.String r8 = "未找到唯一的 Hamlet JSONObject 成功回调"
            p000.ql1.m4936(r8)
            return
    }

    /* JADX INFO: renamed from: ι */
    public static void m916(java.lang.ClassLoader r7) {
            java.lang.String r0 = "~7978C51E2BF10182948ED6FF3D5888FCAAC2ED466438382620E6A7BFCEAA5ACFEB501A06BC7D6BBAD1E0D3D1EB2B1F75DB3E34B944368002BC8D99"
            java.lang.String r0 = p000.jf0.m2957(r0)
            r1 = 0
            java.lang.Class r7 = java.lang.Class.forName(r0, r1, r7)
            java.lang.reflect.Method[] r7 = r7.getDeclaredMethods()
            r7.getClass()
            java.util.List r7 = p000.AbstractC0312g7.m2262(r7)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L1f:
            boolean r2 = r7.hasNext()
            r3 = 1
            if (r2 == 0) goto L52
            java.lang.Object r2 = r7.next()
            r4 = r2
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.Class r5 = r4.getReturnType()
            java.lang.Class r6 = java.lang.Void.TYPE
            boolean r5 = p000.ln0.m3626(r5, r6)
            if (r5 == 0) goto L1f
            java.lang.Class[] r5 = r4.getParameterTypes()
            int r5 = r5.length
            if (r5 != r3) goto L1f
            java.lang.Class[] r3 = r4.getParameterTypes()
            r3 = r3[r1]
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 == 0) goto L1f
            r0.add(r2)
            goto L1f
        L52:
            boolean r7 = r0.isEmpty()
            if (r7 != 0) goto L8e
            java.util.Iterator r7 = r0.iterator()
        L5c:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L78
            java.lang.Object r1 = r7.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r1.setAccessible(r3)
            xq0 r2 = p000.xq0.f12253
            oj0 r4 = new oj0
            r5 = 28
            r4.<init>(r5)
            r2.m6775(r1, r4)
            goto L5c
        L78:
            int r7 = r0.size()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "rc6a14a32a12c5157"
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            p000.C0888ux.m5985(r7)
            return
        L8e:
            java.lang.String r7 = "未找到 Hamlet 单 Map 公共参数入口"
            p000.ql1.m4936(r7)
            return
    }

    /* JADX INFO: renamed from: κ */
    public static void m917(java.lang.ClassLoader r7) {
            java.lang.String r0 = "~7978C51E2BF10182948ED6FF3D5888FCAAC2ED466438382620E6A7BFCEAA5ACFEB501A06BC7D6BBAD1E0D3C5EB341E7EE11836BD6514810FBD8E8E"
            java.lang.String r0 = p000.jf0.m2957(r0)
            r1 = 0
            java.lang.Class r7 = java.lang.Class.forName(r0, r1, r7)
            java.lang.reflect.Method[] r7 = r7.getDeclaredMethods()
            r7.getClass()
            java.util.List r7 = p000.AbstractC0312g7.m2262(r7)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L1f:
            boolean r2 = r7.hasNext()
            r3 = 1
            if (r2 == 0) goto L73
            java.lang.Object r2 = r7.next()
            r4 = r2
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.Class[] r5 = r4.getParameterTypes()
            int r6 = r4.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)
            if (r6 == 0) goto L1f
            java.lang.Class r4 = r4.getReturnType()
            java.lang.Class r6 = java.lang.Void.TYPE
            boolean r4 = p000.ln0.m3626(r4, r6)
            if (r4 == 0) goto L1f
            int r4 = r5.length
            r6 = 2
            if (r4 != r6) goto L1f
            r4 = r5[r1]
            java.lang.String r4 = r4.getName()
            java.lang.String r6 = "~79E5B19C98B999B9F082C9F024BE3A6EDBEB8D5A00AD3512D795EC8C"
            java.lang.String r6 = p000.jf0.m2957(r6)
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L1f
            r3 = r5[r3]
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "~791C379118E47E8B07D05A90B0CB51AAE8EE453FF46C693C81B12D1195DEBF202DE4"
            java.lang.String r4 = p000.jf0.m2957(r4)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L1f
            r0.add(r2)
            goto L1f
        L73:
            java.lang.Object r7 = p000.AbstractC0984xh.m6656(r0)
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            if (r7 == 0) goto L8b
            r7.setAccessible(r3)
            xq0 r0 = p000.xq0.f12253
            oj0 r1 = new oj0
            r2 = 29
            r1.<init>(r2)
            r0.m6775(r7, r1)
            return
        L8b:
            java.lang.String r7 = "未找到唯一的 Hamlet 网络响应监控方法"
            p000.ql1.m4936(r7)
            return
    }

    /* JADX INFO: renamed from: λ */
    public static void m918(java.lang.ClassLoader r5) {
            java.lang.String r0 = "~7974716F46EDCCC8AB71015994E08EBF7057E4892C51F22F56F93137A4FAB193EE755529BB7A132C85E57DBFFBB37FDE095537D6082174A9"
            java.lang.String r0 = p000.jf0.m2957(r0)
            r1 = 0
            java.lang.Class r5 = java.lang.Class.forName(r0, r1, r5)
            java.lang.reflect.Method[] r5 = r5.getDeclaredMethods()
            r5.getClass()
            java.util.List r5 = p000.AbstractC0312g7.m2262(r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L1f:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r5.next()
            r2 = r1
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.String r3 = r2.getName()
            java.lang.String r4 = "onCreate"
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 == 0) goto L1f
            java.lang.Class r3 = r2.getReturnType()
            java.lang.Class r4 = java.lang.Void.TYPE
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 == 0) goto L1f
            java.lang.Class[] r2 = r2.getParameterTypes()
            java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L1f
            r0.add(r1)
            goto L1f
        L58:
            java.lang.Object r5 = p000.AbstractC0984xh.m6656(r0)
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            if (r5 == 0) goto L70
            r0 = 1
            r5.setAccessible(r0)
            xq0 r0 = p000.xq0.f12253
            ad1 r1 = new ad1
            r2 = 0
            r1.<init>(r2)
            r0.m6775(r5, r1)
            return
        L70:
            java.lang.String r5 = "未找到唯一的 Hamlet WorldActivity.onCreate(Bundle)"
            p000.ql1.m4936(r5)
            return
    }

    /* JADX INFO: renamed from: μ */
    public static void m919(java.lang.Class r7) {
            java.lang.reflect.Method[] r7 = r7.getDeclaredMethods()
            r7.getClass()
            java.util.List r7 = p000.AbstractC0312g7.m2262(r7)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L14:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L4b
            java.lang.Object r1 = r7.next()
            r2 = r1
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Class[] r3 = r2.getParameterTypes()
            java.lang.Class r2 = r2.getReturnType()
            java.lang.Class r4 = java.lang.Void.TYPE
            boolean r2 = p000.ln0.m3626(r2, r4)
            if (r2 == 0) goto L14
            int r2 = r3.length
            r4 = 2
            if (r2 != r4) goto L14
            int r2 = r3.length
            r4 = 0
        L37:
            if (r4 >= r2) goto L47
            r5 = r3[r4]
            java.lang.Class<java.util.Map> r6 = java.util.Map.class
            boolean r5 = r6.isAssignableFrom(r5)
            if (r5 != 0) goto L44
            goto L14
        L44:
            int r4 = r4 + 1
            goto L37
        L47:
            r0.add(r1)
            goto L14
        L4b:
            java.lang.Object r7 = p000.AbstractC0984xh.m6656(r0)
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            if (r7 == 0) goto L63
            r0 = 1
            r7.setAccessible(r0)
            xq0 r0 = p000.xq0.f12253
            ad1 r1 = new ad1
            r2 = 1
            r1.<init>(r2)
            r0.m6775(r7, r1)
            return
        L63:
            java.lang.String r7 = "未找到唯一的 Hamlet 世界状态同步方法"
            p000.ql1.m4936(r7)
            return
    }

    /* JADX INFO: renamed from: ν */
    public static java.lang.Object m920(java.lang.Object r6, java.lang.String r7) {
            java.lang.Class r0 = r6.getClass()
            java.lang.reflect.Method[] r0 = r0.getMethods()
            r0.getClass()
            int r1 = r0.length
            r2 = 0
        Ld:
            r3 = 0
            if (r2 >= r1) goto L2a
            r4 = r0[r2]
            java.lang.String r5 = r4.getName()
            boolean r5 = p000.ln0.m3626(r5, r7)
            if (r5 == 0) goto L27
            java.lang.Class[] r5 = r4.getParameterTypes()
            r5.getClass()
            int r5 = r5.length
            if (r5 != 0) goto L27
            goto L2b
        L27:
            int r2 = r2 + 1
            goto Ld
        L2a:
            r4 = r3
        L2b:
            if (r4 != 0) goto L2e
            return r3
        L2e:
            r7 = 1
            r4.setAccessible(r7)
            java.lang.Object r6 = r4.invoke(r6, r3)
            return r6
    }

    /* JADX INFO: renamed from: ξ */
    public static boolean m921(java.lang.String r2) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r0)
            r2.getClass()
            java.lang.String r0 = "token"
            r1 = 0
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L4c
            java.lang.String r0 = "auth"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L4c
            java.lang.String r0 = "cookie"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L4c
            java.lang.String r0 = "session"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L4c
            java.lang.String r0 = "signature"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L4c
            java.lang.String r0 = "sec_pet_id"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L4c
            java.lang.String r0 = "conversation_id"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L4c
            java.lang.String r0 = "sign"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L4b
            goto L4c
        L4b:
            return r1
        L4c:
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: ο */
    public static java.util.ArrayList m922() {
            java.util.concurrent.ConcurrentHashMap r0 = p000.ry1.f9620
            java.util.Map r0 = p000.ex0.m1975(r0)
            java.util.Collection r0 = r0.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L33
            java.lang.Object r2 = r0.next()
            r5 = r2
            ky1 r5 = (p000.ky1) r5
            int r6 = r5.f6325
            r7 = 1
            if (r6 != r7) goto L15
            long r5 = r5.f6323
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 <= 0) goto L15
            r1.add(r2)
            goto L15
        L33:
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 10
            int r2 = p000.AbstractC1021yh.m6889(r1, r2)
            r0.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L42:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r1.next()
            ky1 r2 = (p000.ky1) r2
            long r5 = r2.f6323
            java.lang.String r7 = r2.f6322
            boolean r8 = p000.q02.m4671(r7)
            r9 = 0
            if (r8 != 0) goto L5a
            goto L5b
        L5a:
            r7 = r9
        L5b:
            long r10 = r2.f6324
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            int r8 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r8 <= 0) goto L66
            r9 = r2
        L66:
            fe1 r2 = new fe1
            r2.<init>(r5, r7, r9)
            r0.add(r2)
            goto L42
        L6f:
            return r0
    }

    /* JADX INFO: renamed from: π */
    public static p000.vc1 m923(p000.vc1 r8, p000.vc1 r9) {
            java.lang.Long r0 = r8.f11235
            r1 = 0
            if (r0 != 0) goto L9
            if (r9 == 0) goto Lb
            java.lang.Long r0 = r9.f11235
        L9:
            r4 = r0
            goto Lc
        Lb:
            r4 = r1
        Lc:
            java.lang.String r0 = r8.f11236
            if (r0 != 0) goto L14
            if (r9 == 0) goto L16
            java.lang.String r0 = r9.f11236
        L14:
            r5 = r0
            goto L17
        L16:
            r5 = r1
        L17:
            java.lang.Long r0 = r8.f11237
            if (r0 != 0) goto L21
            if (r9 == 0) goto L1f
            java.lang.Long r1 = r9.f11237
        L1f:
            r6 = r1
            goto L22
        L21:
            r6 = r0
        L22:
            r7 = 15
            r3 = 0
            r2 = r8
            vc1 r8 = p000.vc1.m6172(r2, r3, r4, r5, r6, r7)
            return r8
    }

    /* JADX INFO: renamed from: ρ */
    public static java.lang.reflect.Method m924(java.util.List r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L9:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L56
            java.lang.Object r1 = r6.next()
            r2 = r1
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Class[] r3 = r2.getParameterTypes()
            java.lang.Class r2 = r2.getReturnType()
            java.lang.Class r4 = java.lang.Void.TYPE
            boolean r2 = p000.ln0.m3626(r2, r4)
            if (r2 == 0) goto L9
            int r2 = r3.length
            r4 = 5
            if (r2 != r4) goto L9
            r2 = 0
            r2 = r3[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            boolean r2 = p000.ln0.m3626(r2, r4)
            if (r2 == 0) goto L9
            r2 = 1
            r2 = r3[r2]
            java.lang.Class<org.json.JSONObject> r5 = org.json.JSONObject.class
            boolean r2 = p000.ln0.m3626(r2, r5)
            if (r2 == 0) goto L9
            r2 = 2
            r2 = r3[r2]
            boolean r2 = p000.ln0.m3626(r2, r5)
            if (r2 == 0) goto L9
            r2 = 3
            r2 = r3[r2]
            boolean r2 = p000.ln0.m3626(r2, r4)
            if (r2 == 0) goto L9
            r0.add(r1)
            goto L9
        L56:
            java.lang.Object r6 = p000.AbstractC0984xh.m6656(r0)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            return r6
    }

    /* JADX INFO: renamed from: σ */
    public static java.lang.String m925(java.util.Set r3) {
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            f7 r3 = p000.AbstractC0984xh.m6661(r3)
            f71 r0 = new f71
            r1 = 18
            r0.<init>(r1)
            y30 r1 = new y30
            r2 = 0
            r1.<init>(r3, r2, r0)
            f7 r3 = new f7
            r0 = 4
            r3.<init>(r0, r1)
            r0 = 24
            ss1 r3 = p000.us1.m5947(r3, r0)
            r0 = 0
            r1 = 62
            java.lang.String r2 = ","
            java.lang.String r3 = p000.us1.m5955(r3, r2, r0, r1)
            return r3
    }

    /* JADX INFO: renamed from: τ */
    public static org.json.JSONObject m926(org.json.JSONObject r4) {
            if (r4 != 0) goto L8
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            return r4
        L8:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Iterator r1 = r4.keys()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r2.getClass()
            boolean r3 = m921(r2)
            if (r3 == 0) goto L29
            java.lang.String r3 = "<redacted>"
            goto L31
        L29:
            java.lang.Object r3 = r4.opt(r2)
            java.lang.Object r3 = m927(r3)
        L31:
            r0.put(r2, r3)
            goto L11
        L35:
            return r0
    }

    /* JADX INFO: renamed from: υ */
    public static java.lang.Object m927(java.lang.Object r4) {
            boolean r0 = r4 instanceof org.json.JSONObject
            if (r0 == 0) goto Lb
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            org.json.JSONObject r4 = m926(r4)
            return r4
        Lb:
            boolean r0 = r4 instanceof org.json.JSONArray
            if (r0 == 0) goto L2c
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            org.json.JSONArray r4 = (org.json.JSONArray) r4
            int r1 = r4.length()
            r2 = 0
        L1b:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r4.opt(r2)
            java.lang.Object r3 = m927(r3)
            r0.put(r3)
            int r2 = r2 + 1
            goto L1b
        L2b:
            return r0
        L2c:
            return r4
    }

    /* JADX INFO: renamed from: φ */
    public static void m928(java.lang.String r7, java.lang.String r8, long r9, java.lang.Integer r11, java.lang.String r12) {
            sc1 r0 = new sc1
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r5, r6)
            tc1 r7 = new tc1
            r7.<init>(r0)
            java.util.concurrent.ConcurrentHashMap r8 = p000.bd1.f1663
            r8.compute(r1, r7)
            return
    }
}
