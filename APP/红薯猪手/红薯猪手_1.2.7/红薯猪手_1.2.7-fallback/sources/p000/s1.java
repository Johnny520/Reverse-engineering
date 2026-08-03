package p000;

/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.content.Context f955;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.util.concurrent.ExecutorService f956;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final p000.x1 f957;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final java.util.LinkedHashMap f958;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final java.util.WeakHashMap f959;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final java.util.WeakHashMap f960;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final java.util.HashSet f961;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final ۟.s1.a f962;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public final android.os.Handler f963;

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public final p000.e0 f964;

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public final p000.fa f965;

    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public final java.util.ArrayList f966;

    /* JADX INFO: renamed from: ۥ۠, reason: contains not printable characters */
    public final boolean f967;

    public static class a extends android.os.Handler {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final p000.s1 f968;

        /* JADX INFO: renamed from: ۟.s1$a$a, reason: collision with other inner class name */
        public class RunnableC0011a implements java.lang.Runnable {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public final /* synthetic */ android.os.Message f969;

            public RunnableC0011a(android.os.Message r1) {
                    r0 = this;
                    r0.f969 = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public final void run() {
                    r3 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    java.lang.String r1 = "Unknown handler message received: "
                    java.lang.StringBuilder r1 = p000.c4.m108(r1)
                    android.os.Message r2 = r3.f969
                    int r2 = r2.what
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }
        }

        public a(android.os.Looper r1, p000.s1 r2) {
                r0 = this;
                r0.<init>(r1)
                r0.f968 = r2
                return
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message r12) {
                r11 = this;
                int r0 = r12.what
                r1 = 1
                r2 = 0
                r3 = 0
                r4 = 2
                switch(r0) {
                    case 1: goto L3d0;
                    case 2: goto L364;
                    case 3: goto L9;
                    case 4: goto L297;
                    case 5: goto L1f7;
                    case 6: goto L1ec;
                    case 7: goto L190;
                    case 8: goto L9;
                    case 9: goto L108;
                    case 10: goto Lff;
                    case 11: goto L5e;
                    case 12: goto L15;
                    default: goto L9;
                }
            L9:
                ۟.z7$a r0 = p000.z7.f1248
                ۟.s1$a$a r1 = new ۟.s1$a$a
                r1.<init>(r12)
                r0.post(r1)
                goto L3d9
            L15:
                java.lang.Object r12 = r12.obj
                ۟.s1 r0 = r11.f968
                java.util.HashSet r1 = r0.f961
                boolean r1 = r1.remove(r12)
                if (r1 != 0) goto L23
                goto L3d9
            L23:
                java.util.WeakHashMap r1 = r0.f960
                java.util.Collection r1 = r1.values()
                java.util.Iterator r1 = r1.iterator()
            L2d:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L4f
                java.lang.Object r2 = r1.next()
                ۟.f r2 = (p000.f) r2
                java.lang.Object r4 = r2.f322
                boolean r4 = r4.equals(r12)
                if (r4 == 0) goto L2d
                if (r3 != 0) goto L48
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
            L48:
                r3.add(r2)
                r1.remove()
                goto L2d
            L4f:
                if (r3 == 0) goto L3d9
                android.os.Handler r12 = r0.f963
                r0 = 13
                android.os.Message r0 = r12.obtainMessage(r0, r3)
                r12.sendMessage(r0)
                goto L3d9
            L5e:
                java.lang.Object r12 = r12.obj
                ۟.s1 r0 = r11.f968
                java.util.HashSet r3 = r0.f961
                boolean r3 = r3.add(r12)
                if (r3 != 0) goto L6c
                goto L3d9
            L6c:
                java.util.LinkedHashMap r3 = r0.f958
                java.util.Collection r3 = r3.values()
                java.util.Iterator r3 = r3.iterator()
            L76:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L3d9
                java.lang.Object r4 = r3.next()
                ۟.c0 r4 = (p000.c0) r4
                ۟.z7 r5 = r4.f176
                boolean r5 = r5.f1261
                ۟.f r6 = r4.f185
                java.util.ArrayList r7 = r4.f186
                if (r7 == 0) goto L94
                boolean r8 = r7.isEmpty()
                if (r8 != 0) goto L94
                r8 = r1
                goto L95
            L94:
                r8 = r2
            L95:
                if (r6 != 0) goto L9a
                if (r8 != 0) goto L9a
                goto L76
            L9a:
                if (r6 == 0) goto Lbc
                java.lang.Object r9 = r6.f322
                boolean r9 = r9.equals(r12)
                if (r9 == 0) goto Lbc
                r4.m92(r6)
                java.util.WeakHashMap r9 = r0.f960
                java.lang.Object r10 = r6.m145()
                r9.put(r10, r6)
                if (r5 == 0) goto Lbc
                ۟.w8 r6 = r6.f314
                r6.m454()
                java.util.Objects.toString(r12)
                java.lang.StringBuilder r6 = p000.ic.f502
            Lbc:
                if (r8 == 0) goto Lef
                int r6 = r7.size()
                int r6 = r6 - r1
            Lc3:
                if (r6 < 0) goto Lef
                java.lang.Object r8 = r7.get(r6)
                ۟.f r8 = (p000.f) r8
                java.lang.Object r9 = r8.f322
                boolean r9 = r9.equals(r12)
                if (r9 != 0) goto Ld4
                goto Lec
            Ld4:
                r4.m92(r8)
                java.util.WeakHashMap r9 = r0.f960
                java.lang.Object r10 = r8.m145()
                r9.put(r10, r8)
                if (r5 == 0) goto Lec
                ۟.w8 r8 = r8.f314
                r8.m454()
                java.util.Objects.toString(r12)
                java.lang.StringBuilder r8 = p000.ic.f502
            Lec:
                int r6 = r6 + (-1)
                goto Lc3
            Lef:
                boolean r6 = r4.m91()
                if (r6 == 0) goto L76
                r3.remove()
                if (r5 == 0) goto L76
                p000.ic.m202(r4)
                goto L76
            Lff:
                ۟.s1 r0 = r11.f968
                int r12 = r12.arg1
                r0.getClass()
                goto L3d9
            L108:
                java.lang.Object r12 = r12.obj
                android.net.NetworkInfo r12 = (android.net.NetworkInfo) r12
                ۟.s1 r0 = r11.f968
                java.util.concurrent.ExecutorService r3 = r0.f956
                boolean r5 = r3 instanceof p000.b8
                if (r5 == 0) goto L156
                ۟.b8 r3 = (p000.b8) r3
                r5 = 3
                if (r12 == 0) goto L150
                r3.getClass()
                boolean r6 = r12.isConnectedOrConnecting()
                if (r6 != 0) goto L123
                goto L150
            L123:
                int r6 = r12.getType()
                if (r6 == 0) goto L135
                if (r6 == r1) goto L133
                r1 = 6
                if (r6 == r1) goto L133
                r1 = 9
                if (r6 == r1) goto L133
                goto L148
            L133:
                r4 = 4
                goto L149
            L135:
                int r6 = r12.getSubtype()
                switch(r6) {
                    case 1: goto L141;
                    case 2: goto L141;
                    case 3: goto L149;
                    case 4: goto L149;
                    case 5: goto L149;
                    case 6: goto L149;
                    default: goto L13c;
                }
            L13c:
                r1 = 12
                if (r6 == r1) goto L149
                goto L148
            L141:
                r3.setCorePoolSize(r1)
                r3.setMaximumPoolSize(r1)
                goto L156
            L148:
                r4 = r5
            L149:
                r3.setCorePoolSize(r4)
                r3.setMaximumPoolSize(r4)
                goto L156
            L150:
                r3.setCorePoolSize(r5)
                r3.setMaximumPoolSize(r5)
            L156:
                if (r12 == 0) goto L3d9
                boolean r12 = r12.isConnected()
                if (r12 == 0) goto L3d9
                java.util.WeakHashMap r12 = r0.f959
                boolean r12 = r12.isEmpty()
                if (r12 != 0) goto L3d9
                java.util.WeakHashMap r12 = r0.f959
                java.util.Collection r12 = r12.values()
                java.util.Iterator r12 = r12.iterator()
            L170:
                boolean r1 = r12.hasNext()
                if (r1 == 0) goto L3d9
                java.lang.Object r1 = r12.next()
                ۟.f r1 = (p000.f) r1
                r12.remove()
                ۟.z7 r3 = r1.f313
                boolean r3 = r3.f1261
                if (r3 == 0) goto L18c
                ۟.w8 r3 = r1.f314
                r3.m454()
                java.lang.StringBuilder r3 = p000.ic.f502
            L18c:
                r0.m392(r1, r2)
                goto L170
            L190:
                ۟.s1 r12 = r11.f968
                r12.getClass()
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.ArrayList r1 = r12.f966
                r0.<init>(r1)
                java.util.ArrayList r1 = r12.f966
                r1.clear()
                android.os.Handler r12 = r12.f963
                r1 = 8
                android.os.Message r1 = r12.obtainMessage(r1, r0)
                r12.sendMessage(r1)
                boolean r12 = r0.isEmpty()
                if (r12 == 0) goto L1b4
                goto L3d9
            L1b4:
                java.lang.Object r12 = r0.get(r2)
                ۟.c0 r12 = (p000.c0) r12
                ۟.z7 r12 = r12.f176
                boolean r12 = r12.f1261
                if (r12 == 0) goto L3d9
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.util.Iterator r0 = r0.iterator()
            L1c9:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1e8
                java.lang.Object r1 = r0.next()
                ۟.c0 r1 = (p000.c0) r1
                int r2 = r12.length()
                if (r2 <= 0) goto L1e0
                java.lang.String r2 = ", "
                r12.append(r2)
            L1e0:
                java.lang.String r1 = p000.ic.m202(r1)
                r12.append(r1)
                goto L1c9
            L1e8:
                java.lang.StringBuilder r12 = p000.ic.f502
                goto L3d9
            L1ec:
                java.lang.Object r12 = r12.obj
                ۟.c0 r12 = (p000.c0) r12
                ۟.s1 r0 = r11.f968
                r0.m391(r12)
                goto L3d9
            L1f7:
                java.lang.Object r12 = r12.obj
                ۟.c0 r12 = (p000.c0) r12
                ۟.s1 r0 = r11.f968
                r0.getClass()
                java.util.concurrent.Future<?> r4 = r12.f188
                if (r4 == 0) goto L20c
                boolean r4 = r4.isCancelled()
                if (r4 == 0) goto L20c
                r4 = r1
                goto L20d
            L20c:
                r4 = r2
            L20d:
                if (r4 == 0) goto L211
                goto L3d9
            L211:
                java.util.concurrent.ExecutorService r4 = r0.f956
                boolean r4 = r4.isShutdown()
                if (r4 == 0) goto L21e
                r0.m391(r12)
                goto L3d9
            L21e:
                boolean r4 = r0.f967
                if (r4 == 0) goto L232
                android.content.Context r3 = r0.f955
                java.lang.StringBuilder r4 = p000.ic.f502
                java.lang.String r4 = "connectivity"
                java.lang.Object r3 = r3.getSystemService(r4)
                android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3
                android.net.NetworkInfo r3 = r3.getActiveNetworkInfo()
            L232:
                if (r3 == 0) goto L23c
                boolean r4 = r3.isConnected()
                if (r4 == 0) goto L23c
                r4 = r1
                goto L23d
            L23c:
                r4 = r2
            L23d:
                int r5 = r12.f192
                if (r5 <= 0) goto L243
                r6 = r1
                goto L244
            L243:
                r6 = r2
            L244:
                if (r6 != 0) goto L248
                r3 = r2
                goto L251
            L248:
                int r5 = r5 - r1
                r12.f192 = r5
                ۟.y8 r5 = r12.f184
                boolean r3 = r5.mo436(r3)
            L251:
                ۟.y8 r5 = r12.f184
                r5.getClass()
                boolean r5 = r5 instanceof p000.v6
                if (r3 != 0) goto L268
                boolean r3 = r0.f967
                if (r3 == 0) goto L261
                if (r5 == 0) goto L261
                goto L262
            L261:
                r1 = r2
            L262:
                r0.m391(r12)
                if (r1 == 0) goto L3d9
                goto L274
            L268:
                boolean r2 = r0.f967
                if (r2 == 0) goto L279
                if (r4 == 0) goto L26f
                goto L279
            L26f:
                r0.m391(r12)
                if (r5 == 0) goto L3d9
            L274:
                r0.m390(r12)
                goto L3d9
            L279:
                ۟.z7 r2 = r12.f176
                boolean r2 = r2.f1261
                if (r2 == 0) goto L282
                p000.ic.m202(r12)
            L282:
                java.lang.Exception r2 = r12.f190
                boolean r2 = r2 instanceof ۟.v6.a
                if (r2 == 0) goto L28d
                int r2 = r12.f183
                r1 = r1 | r2
                r12.f183 = r1
            L28d:
                java.util.concurrent.ExecutorService r0 = r0.f956
                java.util.concurrent.Future r0 = r0.submit(r12)
                r12.f188 = r0
                goto L3d9
            L297:
                java.lang.Object r12 = r12.obj
                ۟.c0 r12 = (p000.c0) r12
                ۟.s1 r0 = r11.f968
                r0.getClass()
                int r3 = r12.f182
                r3 = r3 & r4
                if (r3 != 0) goto L2a6
                goto L2a7
            L2a6:
                r1 = r2
            L2a7:
                if (r1 == 0) goto L34f
                ۟.e0 r1 = r0.f964
                java.lang.String r2 = r12.f180
                android.graphics.Bitmap r3 = r12.f187
                ۟.h5 r1 = (p000.h5) r1
                r1.getClass()
                if (r2 == 0) goto L347
                if (r3 == 0) goto L347
                monitor-enter(r1)
                int r4 = r1.f442     // Catch: java.lang.Throwable -> L344
                int r5 = p000.ic.m201(r3)     // Catch: java.lang.Throwable -> L344
                int r4 = r4 + r5
                r1.f442 = r4     // Catch: java.lang.Throwable -> L344
                java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r4 = r1.f440     // Catch: java.lang.Throwable -> L344
                java.lang.Object r2 = r4.put(r2, r3)     // Catch: java.lang.Throwable -> L344
                android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch: java.lang.Throwable -> L344
                if (r2 == 0) goto L2d5
                int r3 = r1.f442     // Catch: java.lang.Throwable -> L344
                int r2 = p000.ic.m201(r2)     // Catch: java.lang.Throwable -> L344
                int r3 = r3 - r2
                r1.f442 = r3     // Catch: java.lang.Throwable -> L344
            L2d5:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L344
                int r2 = r1.f441
            L2d8:
                monitor-enter(r1)
                int r3 = r1.f442     // Catch: java.lang.Throwable -> L341
                if (r3 < 0) goto L324
                java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r3 = r1.f440     // Catch: java.lang.Throwable -> L341
                boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L341
                if (r3 == 0) goto L2e9
                int r3 = r1.f442     // Catch: java.lang.Throwable -> L341
                if (r3 != 0) goto L324
            L2e9:
                int r3 = r1.f442     // Catch: java.lang.Throwable -> L341
                if (r3 <= r2) goto L322
                java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r3 = r1.f440     // Catch: java.lang.Throwable -> L341
                boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L341
                if (r3 == 0) goto L2f6
                goto L322
            L2f6:
                java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r3 = r1.f440     // Catch: java.lang.Throwable -> L341
                java.util.Set r3 = r3.entrySet()     // Catch: java.lang.Throwable -> L341
                java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L341
                java.lang.Object r3 = r3.next()     // Catch: java.lang.Throwable -> L341
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L341
                java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L341
                java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L341
                java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L341
                android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch: java.lang.Throwable -> L341
                java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r5 = r1.f440     // Catch: java.lang.Throwable -> L341
                r5.remove(r4)     // Catch: java.lang.Throwable -> L341
                int r4 = r1.f442     // Catch: java.lang.Throwable -> L341
                int r3 = p000.ic.m201(r3)     // Catch: java.lang.Throwable -> L341
                int r4 = r4 - r3
                r1.f442 = r4     // Catch: java.lang.Throwable -> L341
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L341
                goto L2d8
            L322:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L341
                goto L34f
            L324:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L341
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L341
                r0.<init>()     // Catch: java.lang.Throwable -> L341
                java.lang.Class<۟.h5> r2 = p000.h5.class
                java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L341
                r0.append(r2)     // Catch: java.lang.Throwable -> L341
                java.lang.String r2 = ".sizeOf() is reporting inconsistent results!"
                r0.append(r2)     // Catch: java.lang.Throwable -> L341
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L341
                r12.<init>(r0)     // Catch: java.lang.Throwable -> L341
                throw r12     // Catch: java.lang.Throwable -> L341
            L341:
                r12 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L341
                throw r12
            L344:
                r12 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L344
                throw r12
            L347:
                java.lang.NullPointerException r12 = new java.lang.NullPointerException
                java.lang.String r0 = "key == null || bitmap == null"
                r12.<init>(r0)
                throw r12
            L34f:
                java.util.LinkedHashMap r1 = r0.f958
                java.lang.String r2 = r12.f180
                r1.remove(r2)
                r0.m386(r12)
                ۟.z7 r0 = r12.f176
                boolean r0 = r0.f1261
                if (r0 == 0) goto L3d9
                p000.ic.m202(r12)
                goto L3d9
            L364:
                java.lang.Object r12 = r12.obj
                ۟.f r12 = (p000.f) r12
                ۟.s1 r0 = r11.f968
                r0.getClass()
                java.lang.String r1 = r12.f321
                java.util.LinkedHashMap r2 = r0.f958
                java.lang.Object r2 = r2.get(r1)
                ۟.c0 r2 = (p000.c0) r2
                if (r2 == 0) goto L394
                r2.m92(r12)
                boolean r2 = r2.m91()
                if (r2 == 0) goto L394
                java.util.LinkedHashMap r2 = r0.f958
                r2.remove(r1)
                ۟.z7 r1 = r12.f313
                boolean r1 = r1.f1261
                if (r1 == 0) goto L394
                ۟.w8 r1 = r12.f314
                r1.m454()
                java.lang.StringBuilder r1 = p000.ic.f502
            L394:
                java.util.HashSet r1 = r0.f961
                java.lang.Object r2 = r12.f322
                boolean r1 = r1.contains(r2)
                if (r1 == 0) goto L3b4
                java.util.WeakHashMap r1 = r0.f960
                java.lang.Object r2 = r12.m145()
                r1.remove(r2)
                ۟.z7 r1 = r12.f313
                boolean r1 = r1.f1261
                if (r1 == 0) goto L3b4
                ۟.w8 r1 = r12.f314
                r1.m454()
                java.lang.StringBuilder r1 = p000.ic.f502
            L3b4:
                java.util.WeakHashMap r0 = r0.f959
                java.lang.Object r12 = r12.m145()
                java.lang.Object r12 = r0.remove(r12)
                ۟.f r12 = (p000.f) r12
                if (r12 == 0) goto L3d9
                ۟.z7 r0 = r12.f313
                boolean r0 = r0.f1261
                if (r0 == 0) goto L3d9
                ۟.w8 r12 = r12.f314
                r12.m454()
                java.lang.StringBuilder r12 = p000.ic.f502
                goto L3d9
            L3d0:
                java.lang.Object r12 = r12.obj
                ۟.f r12 = (p000.f) r12
                ۟.s1 r0 = r11.f968
                r0.m392(r12, r1)
            L3d9:
                return
        }
    }

    public static class b extends android.os.HandlerThread {
        public b() {
                r2 = this;
                java.lang.String r0 = "Picasso-Dispatcher"
                r1 = 10
                r2.<init>(r0, r1)
                return
        }
    }

    public static class c extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final p000.s1 f970;

        public c(p000.s1 r1) {
                r0 = this;
                r0.<init>()
                r0.f970 = r1
                return
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(android.content.Context r3, android.content.Intent r4) {
                r2 = this;
                if (r4 != 0) goto L3
                return
            L3:
                java.lang.String r0 = r4.getAction()
                java.lang.String r1 = "android.intent.action.AIRPLANE_MODE"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L2b
                java.lang.String r3 = "state"
                boolean r0 = r4.hasExtra(r3)
                if (r0 != 0) goto L18
                return
            L18:
                ۟.s1 r0 = r2.f970
                r1 = 0
                boolean r3 = r4.getBooleanExtra(r3, r1)
                ۟.s1$a r4 = r0.f962
                r0 = 10
                android.os.Message r3 = r4.obtainMessage(r0, r3, r1)
                r4.sendMessage(r3)
                goto L4e
            L2b:
                java.lang.String r4 = "android.net.conn.CONNECTIVITY_CHANGE"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L4e
                java.lang.StringBuilder r4 = p000.ic.f502
                java.lang.String r4 = "connectivity"
                java.lang.Object r3 = r3.getSystemService(r4)
                android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3
                ۟.s1 r4 = r2.f970
                android.net.NetworkInfo r3 = r3.getActiveNetworkInfo()
                ۟.s1$a r4 = r4.f962
                r0 = 9
                android.os.Message r3 = r4.obtainMessage(r0, r3)
                r4.sendMessage(r3)
            L4e:
                return
        }
    }

    public s1(android.content.Context r6, java.util.concurrent.ExecutorService r7, ۟.z7.a r8, p000.x1 r9, p000.e0 r10, p000.fa r11) {
            r5 = this;
            r5.<init>()
            ۟.s1$b r0 = new ۟.s1$b
            r0.<init>()
            r0.start()
            android.os.Looper r1 = r0.getLooper()
            java.lang.StringBuilder r2 = p000.ic.f502
            ۟.hc r2 = new ۟.hc
            r2.<init>(r1)
            android.os.Message r1 = r2.obtainMessage()
            r3 = 1000(0x3e8, double:4.94E-321)
            r2.sendMessageDelayed(r1, r3)
            r5.f955 = r6
            r5.f956 = r7
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            r5.f958 = r7
            java.util.WeakHashMap r7 = new java.util.WeakHashMap
            r7.<init>()
            r5.f959 = r7
            java.util.WeakHashMap r7 = new java.util.WeakHashMap
            r7.<init>()
            r5.f960 = r7
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            r5.f961 = r7
            ۟.s1$a r7 = new ۟.s1$a
            android.os.Looper r0 = r0.getLooper()
            r7.<init>(r0, r5)
            r5.f962 = r7
            r5.f957 = r9
            r5.f963 = r8
            r5.f964 = r10
            r5.f965 = r11
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 4
            r7.<init>(r8)
            r5.f966 = r7
            android.content.ContentResolver r7 = r6.getContentResolver()
            r8 = 1
            r9 = 0
            java.lang.String r10 = "airplane_mode_on"
            int r7 = android.provider.Settings.System.getInt(r7, r10, r9)     // Catch: java.lang.NullPointerException -> L66
        L66:
            java.lang.String r7 = "android.permission.ACCESS_NETWORK_STATE"
            int r6 = r6.checkCallingOrSelfPermission(r7)
            if (r6 != 0) goto L6f
            goto L70
        L6f:
            r8 = r9
        L70:
            r5.f967 = r8
            ۟.s1$c r6 = new ۟.s1$c
            r6.<init>(r5)
            android.content.IntentFilter r7 = new android.content.IntentFilter
            r7.<init>()
            java.lang.String r8 = "android.intent.action.AIRPLANE_MODE"
            r7.addAction(r8)
            ۟.s1 r8 = r6.f970
            boolean r8 = r8.f967
            if (r8 == 0) goto L8c
            java.lang.String r8 = "android.net.conn.CONNECTIVITY_CHANGE"
            r7.addAction(r8)
        L8c:
            ۟.s1 r8 = r6.f970
            android.content.Context r8 = r8.f955
            r8.registerReceiver(r6, r7)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m386(p000.c0 r4) {
            r3 = this;
            java.util.concurrent.Future<?> r0 = r4.f188
            if (r0 == 0) goto Lc
            boolean r0 = r0.isCancelled()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L10
            return
        L10:
            java.util.ArrayList r0 = r3.f966
            r0.add(r4)
            ۟.s1$a r4 = r3.f962
            r0 = 7
            boolean r4 = r4.hasMessages(r0)
            if (r4 != 0) goto L25
            ۟.s1$a r4 = r3.f962
            r1 = 200(0xc8, double:9.9E-322)
            r4.sendEmptyMessageDelayed(r0, r1)
        L25:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m387(p000.c0 r3) {
            r2 = this;
            ۟.s1$a r0 = r2.f962
            r1 = 4
            android.os.Message r3 = r0.obtainMessage(r1, r3)
            r0.sendMessage(r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m388(p000.c0 r3) {
            r2 = this;
            ۟.s1$a r0 = r2.f962
            r1 = 6
            android.os.Message r3 = r0.obtainMessage(r1, r3)
            r0.sendMessage(r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final void m389(p000.c0 r4) {
            r3 = this;
            ۟.s1$a r0 = r3.f962
            r1 = 5
            android.os.Message r4 = r0.obtainMessage(r1, r4)
            r1 = 500(0x1f4, double:2.47E-321)
            r0.sendMessageDelayed(r4, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final void m390(p000.c0 r7) {
            r6 = this;
            ۟.f r0 = r7.f185
            r1 = 1
            if (r0 == 0) goto L12
            java.lang.Object r2 = r0.m145()
            if (r2 == 0) goto L12
            r0.f323 = r1
            java.util.WeakHashMap r3 = r6.f959
            r3.put(r2, r0)
        L12:
            java.util.ArrayList r7 = r7.f186
            if (r7 == 0) goto L33
            r0 = 0
            int r2 = r7.size()
        L1b:
            if (r0 >= r2) goto L33
            java.lang.Object r3 = r7.get(r0)
            ۟.f r3 = (p000.f) r3
            java.lang.Object r4 = r3.m145()
            if (r4 == 0) goto L30
            r3.f323 = r1
            java.util.WeakHashMap r5 = r6.f959
            r5.put(r4, r3)
        L30:
            int r0 = r0 + 1
            goto L1b
        L33:
            return
    }

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final void m391(p000.c0 r3) {
            r2 = this;
            ۟.z7 r0 = r3.f176
            boolean r0 = r0.f1261
            if (r0 == 0) goto L9
            p000.ic.m202(r3)
        L9:
            java.util.LinkedHashMap r0 = r2.f958
            java.lang.String r1 = r3.f180
            r0.remove(r1)
            r2.m386(r3)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final void m392(p000.f r10, boolean r11) {
            r9 = this;
            java.util.HashSet r0 = r9.f961
            java.lang.Object r1 = r10.f322
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L26
            java.util.WeakHashMap r11 = r9.f960
            java.lang.Object r0 = r10.m145()
            r11.put(r0, r10)
            ۟.z7 r11 = r10.f313
            boolean r11 = r11.f1261
            if (r11 == 0) goto L25
            ۟.w8 r11 = r10.f314
            r11.m454()
            java.lang.Object r10 = r10.f322
            java.util.Objects.toString(r10)
            java.lang.StringBuilder r10 = p000.ic.f502
        L25:
            return
        L26:
            java.util.LinkedHashMap r0 = r9.f958
            java.lang.String r1 = r10.f321
            java.lang.Object r0 = r0.get(r1)
            ۟.c0 r0 = (p000.c0) r0
            if (r0 == 0) goto L86
            ۟.z7 r11 = r0.f176
            boolean r11 = r11.f1261
            ۟.w8 r1 = r10.f314
            ۟.f r2 = r0.f185
            java.lang.String r3 = "to "
            if (r2 != 0) goto L5a
            r0.f185 = r10
            if (r11 == 0) goto L85
            java.util.ArrayList r10 = r0.f186
            if (r10 == 0) goto L54
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L4d
            goto L54
        L4d:
            r1.m454()
            p000.ic.m203(r0, r3)
            goto L85
        L54:
            r1.m454()
            java.lang.StringBuilder r10 = p000.ic.f502
            goto L85
        L5a:
            java.util.ArrayList r2 = r0.f186
            if (r2 != 0) goto L66
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 3
            r2.<init>(r4)
            r0.f186 = r2
        L66:
            java.util.ArrayList r2 = r0.f186
            r2.add(r10)
            if (r11 == 0) goto L73
            r1.m454()
            p000.ic.m203(r0, r3)
        L73:
            ۟.w8 r10 = r10.f314
            int r10 = r10.f1143
            int r11 = p000.c4.m109(r10)
            int r1 = r0.f193
            int r1 = p000.c4.m109(r1)
            if (r11 <= r1) goto L85
            r0.f193 = r10
        L85:
            return
        L86:
            java.util.concurrent.ExecutorService r0 = r9.f956
            boolean r0 = r0.isShutdown()
            if (r0 == 0) goto L9c
            ۟.z7 r11 = r10.f313
            boolean r11 = r11.f1261
            if (r11 == 0) goto L9b
            ۟.w8 r10 = r10.f314
            r10.m454()
            java.lang.StringBuilder r10 = p000.ic.f502
        L9b:
            return
        L9c:
            ۟.z7 r1 = r10.f313
            ۟.e0 r3 = r9.f964
            ۟.fa r4 = r9.f965
            java.lang.Object r0 = p000.c0.f171
            ۟.w8 r0 = r10.f314
            java.util.List<۟.y8> r2 = r1.f1251
            r5 = 0
            int r6 = r2.size()
        Lad:
            if (r5 >= r6) goto Lc8
            java.lang.Object r7 = r2.get(r5)
            ۟.y8 r7 = (p000.y8) r7
            boolean r8 = r7.mo94(r0)
            if (r8 == 0) goto Lc5
            ۟.c0 r8 = new ۟.c0
            r0 = r8
            r2 = r9
            r5 = r10
            r6 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            goto Ld2
        Lc5:
            int r5 = r5 + 1
            goto Lad
        Lc8:
            ۟.c0 r8 = new ۟.c0
            ۟.c0$b r6 = p000.c0.f174
            r0 = r8
            r2 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
        Ld2:
            java.util.concurrent.ExecutorService r0 = r9.f956
            java.util.concurrent.Future r0 = r0.submit(r8)
            r8.f188 = r0
            java.util.LinkedHashMap r0 = r9.f958
            java.lang.String r1 = r10.f321
            r0.put(r1, r8)
            if (r11 == 0) goto Lec
            java.util.WeakHashMap r11 = r9.f959
            java.lang.Object r0 = r10.m145()
            r11.remove(r0)
        Lec:
            ۟.z7 r11 = r10.f313
            boolean r11 = r11.f1261
            if (r11 == 0) goto Lf9
            ۟.w8 r10 = r10.f314
            r10.m454()
            java.lang.StringBuilder r10 = p000.ic.f502
        Lf9:
            return
    }
}
