package p000;

/* JADX INFO: renamed from: t7 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0825t7 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f10214 = null;

    /* JADX INFO: renamed from: β */
    public static final android.os.Handler f10215 = null;

    /* JADX INFO: renamed from: γ */
    public static volatile p000.EnumC0539m7 f10216;

    /* JADX INFO: renamed from: δ */
    public static volatile p000.ny0 f10217;

    /* JADX INFO: renamed from: ε */
    public static p000.C0677p7 f10218;

    /* JADX INFO: renamed from: ζ */
    public static boolean f10219;

    /* JADX INFO: renamed from: η */
    public static boolean f10220;

    /* JADX INFO: renamed from: θ */
    public static final p000.C0576n7 f10221 = null;

    /* JADX INFO: renamed from: ι */
    public static final p000.C0576n7 f10222 = null;

    /* JADX INFO: renamed from: κ */
    public static final java.util.Set f10223 = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.AbstractC0825t7.f10214 = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            p000.AbstractC0825t7.f10215 = r0
            n7 r0 = new n7
            r1 = 0
            r0.<init>(r1)
            p000.AbstractC0825t7.f10221 = r0
            n7 r0 = new n7
            r1 = 1
            r0.<init>(r1)
            p000.AbstractC0825t7.f10222 = r0
            java.lang.String r7 = "auto_scroll_article_dwell_seconds"
            java.lang.String r8 = "auto_scroll_touch_restart_enabled"
            java.lang.String r2 = "auto_scroll_next_enabled"
            java.lang.String r3 = "auto_pause_on_complete_enabled"
            java.lang.String r4 = "auto_scroll_image_enabled"
            java.lang.String r5 = "auto_scroll_image_dwell_seconds"
            java.lang.String r6 = "auto_scroll_article_enabled"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8}
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)
            p000.AbstractC0825t7.f10223 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m5609(p000.C0677p7 r2) {
            if (r2 == 0) goto Lf
            ν r0 = r2.f8444
            if (r0 != 0) goto L7
            goto Lf
        L7:
            android.os.Handler r1 = p000.AbstractC0825t7.f10215
            r1.removeCallbacks(r0)
            r0 = 0
            r2.f8444 = r0
        Lf:
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m5610(p000.C0558mq r17) {
            r1 = r17
            p7 r0 = p000.AbstractC0825t7.f10218
            if (r0 == 0) goto L1e
            oq r2 = r0.f8443
            if (r2 == 0) goto L1e
            int r3 = r2.f8173
            switch(r3) {
                case 0: goto L17;
                default: goto Lf;
            }
        Lf:
            java.util.concurrent.atomic.AtomicReference r2 = r2.f8174
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r2.set(r3)
            goto L1e
        L17:
            java.util.concurrent.atomic.AtomicReference r2 = r2.f8174
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r2.set(r3)
        L1e:
            r2 = 0
            if (r0 == 0) goto L23
            r0.f8443 = r2
        L23:
            m5609(r0)
            p000.AbstractC0825t7.f10218 = r2
            p000.AbstractC0825t7.f10216 = r2
            if (r1 == 0) goto L1d3
            java.lang.String r0 = "auto_scroll_next_enabled"
            r3 = 0
            boolean r0 = p000.ui1.m5887(r0, r3)
            if (r0 != 0) goto L3d
            java.lang.String r0 = "auto_pause_on_complete_enabled"
            boolean r0 = p000.ui1.m5887(r0, r3)
            if (r0 == 0) goto L1d3
        L3d:
            pq r0 = p000.C0696pq.f8651
            kq r4 = p000.C0696pq.m4567()
            if (r4 != 0) goto L47
            goto L1d3
        L47:
            mq r0 = r4.f6079
            long r5 = r0.f7247
            long r7 = r1.f7247
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L53
            goto L1d3
        L53:
            p7 r5 = new p7
            java.lang.String r6 = r1.f7244
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.s00.f9638
            java.lang.Object r9 = r4.f6077
            rz r0 = p000.r00.f9189
            if (r0 == 0) goto L68
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L68
            r0 = r3
            goto L13b
        L68:
            java.util.Iterator r11 = r0.iterator()
        L6c:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L13a
            java.lang.Object r0 = r11.next()
            r00 r0 = (p000.r00) r0
            java.util.concurrent.atomic.AtomicBoolean r12 = p000.s00.f9638
            java.lang.Class r12 = r9.getClass()
            java.lang.String r13 = "@"
            java.lang.ClassLoader r14 = r12.getClassLoader()
            if (r14 != 0) goto L88
            r10 = r2
            goto Led
        L88:
            int r15 = java.lang.System.identityHashCode(r14)
            java.lang.String r2 = r12.getName()
            java.lang.String r3 = r0.name()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r15)
            r10.append(r13)
            r10.append(r2)
            r10.append(r13)
            r10.append(r3)
            java.lang.String r2 = r10.toString()
            java.util.concurrent.ConcurrentHashMap r3 = p000.s00.f9639
            java.lang.Object r10 = r3.get(r2)
            java.lang.reflect.Field r10 = (java.lang.reflect.Field) r10
            if (r10 == 0) goto Lb7
            goto Led
        Lb7:
            java.util.concurrent.ConcurrentHashMap$KeySetView r10 = p000.s00.f9640
            boolean r13 = r10.contains(r2)
            if (r13 == 0) goto Lc1
        Lbf:
            r10 = 0
            goto Led
        Lc1:
            java.lang.Object r13 = p000.C0666ox.f8297
            kx r13 = r0.f9190
            java.lang.reflect.Field r13 = p000.C0666ox.m4322(r13, r14)
            if (r13 == 0) goto Ldb
            java.lang.Class r14 = r13.getDeclaringClass()
            boolean r14 = r14.isAssignableFrom(r12)
            if (r14 == 0) goto Ld6
            goto Ld7
        Ld6:
            r13 = 0
        Ld7:
            if (r13 == 0) goto Ldb
            r0 = r13
            goto Ldf
        Ldb:
            java.lang.reflect.Field r0 = p000.s00.m5313(r12, r0)
        Ldf:
            if (r0 != 0) goto Le5
            r10.add(r2)
            goto Lbf
        Le5:
            r10 = 1
            r0.setAccessible(r10)
            r3.put(r2, r0)
            r10 = r0
        Led:
            if (r10 != 0) goto Lf1
        Lef:
            r0 = 0
            goto L132
        Lf1:
            java.lang.Object r0 = r10.get(r9)     // Catch: java.lang.Throwable -> Lf6
            goto Lfd
        Lf6:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        Lfd:
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L102
            r0 = 0
        L102:
            boolean r2 = r0 instanceof java.lang.Boolean
            if (r2 == 0) goto L10d
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L132
        L10d:
            boolean r2 = r0 instanceof java.lang.Number
            if (r2 == 0) goto L11b
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto Lef
        L119:
            r0 = 1
            goto L132
        L11b:
            boolean r2 = r0 instanceof java.lang.String
            if (r2 == 0) goto Lef
            java.lang.String r2 = "1"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L119
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "true"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto Lef
            goto L119
        L132:
            if (r0 == 0) goto L136
            r0 = 1
            goto L13b
        L136:
            r2 = 0
            r3 = 0
            goto L6c
        L13a:
            r0 = 0
        L13b:
            r5.<init>(r7, r6, r0)
            p000.AbstractC0825t7.f10218 = r5
            pq r0 = p000.C0696pq.f8651
            java.lang.Object r2 = r4.f6077
            java.lang.String r1 = r1.f7244
            θ r3 = new θ
            r4 = 3
            r3.<init>(r4, r5)
            java.util.concurrent.atomic.AtomicReference r4 = new java.util.concurrent.atomic.AtomicReference
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4.<init>(r6)
            wa r6 = new wa
            r7 = 7
            r6.<init>(r4, r7, r3)
            if (r1 != 0) goto L16b
            java.lang.String r1 = r0.m4569(r2)
            if (r1 != 0) goto L16b
            int r0 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = "identity:"
            java.lang.String r1 = p000.a12.m17(r1, r0)
        L16b:
            long r7 = android.os.SystemClock.uptimeMillis()
            java.lang.Object r3 = p000.C0696pq.f8656
            monitor-enter(r3)
            nq r0 = p000.C0696pq.f8657     // Catch: java.lang.Throwable -> L197
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L197
            iq r0 = (p000.C0404iq) r0     // Catch: java.lang.Throwable -> L197
            if (r0 == 0) goto L199
            long r9 = r0.f5167     // Catch: java.lang.Throwable -> L197
            long r7 = r7 - r9
            r9 = 300000(0x493e0, double:1.482197E-318)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 > 0) goto L187
            goto L188
        L187:
            r0 = 0
        L188:
            if (r0 == 0) goto L199
            f8 r0 = r0.f5166     // Catch: java.lang.Throwable -> L197
            r6.invoke(r0)     // Catch: java.lang.Throwable -> L197
            oq r0 = new oq     // Catch: java.lang.Throwable -> L197
            r1 = 0
            r0.<init>(r4, r1)     // Catch: java.lang.Throwable -> L197
            monitor-exit(r3)
            goto L1ce
        L197:
            r0 = move-exception
            goto L1d1
        L199:
            java.util.HashMap r0 = p000.C0696pq.f8658     // Catch: java.lang.Throwable -> L197
            java.lang.Object r7 = r0.get(r1)     // Catch: java.lang.Throwable -> L197
            jq r7 = (p000.C0441jq) r7     // Catch: java.lang.Throwable -> L197
            if (r7 == 0) goto L1a9
            java.util.ArrayList r0 = r7.f5544     // Catch: java.lang.Throwable -> L197
            r0.add(r6)     // Catch: java.lang.Throwable -> L197
            goto L1c7
        L1a9:
            jq r7 = new jq     // Catch: java.lang.Throwable -> L197
            r10 = 1
            a80[] r8 = new p000.a80[r10]     // Catch: java.lang.Throwable -> L197
            r16 = 0
            r8[r16] = r6     // Catch: java.lang.Throwable -> L197
            java.util.ArrayList r6 = p000.AbstractC1021yh.m6899(r8)     // Catch: java.lang.Throwable -> L197
            r7.<init>(r2, r6)     // Catch: java.lang.Throwable -> L197
            r0.put(r1, r7)     // Catch: java.lang.Throwable -> L197
            android.os.Handler r0 = p000.C0696pq.f8655     // Catch: java.lang.Throwable -> L197
            ea r2 = new ea     // Catch: java.lang.Throwable -> L197
            r6 = 2
            r2.<init>(r1, r6)     // Catch: java.lang.Throwable -> L197
            r0.post(r2)     // Catch: java.lang.Throwable -> L197
        L1c7:
            monitor-exit(r3)
            oq r0 = new oq
            r10 = 1
            r0.<init>(r4, r10)
        L1ce:
            r5.f8443 = r0
            return
        L1d1:
            monitor-exit(r3)
            throw r0
        L1d3:
            return
    }

    /* JADX INFO: renamed from: γ */
    public static boolean m5611(p000.EnumC0539m7 r4) {
            java.lang.String r0 = "auto_scroll_image_enabled"
            r1 = 0
            boolean r0 = p000.ui1.m5887(r0, r1)
            java.lang.String r2 = "auto_scroll_article_enabled"
            boolean r2 = p000.ui1.m5887(r2, r1)
            r4.getClass()
            int r4 = r4.ordinal()
            if (r4 == 0) goto L27
            r3 = 1
            if (r4 == r3) goto L26
            r0 = 2
            if (r4 == r0) goto L25
            r0 = 3
            if (r4 != r0) goto L20
            goto L27
        L20:
            p000.C1080.m7272()
            r4 = 0
            return r4
        L25:
            return r2
        L26:
            return r0
        L27:
            return r1
    }

    /* JADX INFO: renamed from: δ */
    public static void m5612(p000.p70 r2) {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L12
            r2.invoke()
            return
        L12:
            r0 r0 = new r0
            r1 = 2
            r0.<init>(r1, r2)
            android.os.Handler r2 = p000.AbstractC0825t7.f10215
            r2.post(r0)
            return
    }

    /* JADX INFO: renamed from: ε */
    public static void m5613(p000.C0677p7 r5) {
            p7 r0 = p000.AbstractC0825t7.f10218
            if (r0 != r5) goto L86
            boolean r0 = r5.f8446
            if (r0 != 0) goto L86
            boolean r0 = r5.f8445
            if (r0 == 0) goto Le
            goto L86
        Le:
            boolean r0 = p000.AbstractC0825t7.f10219
            if (r0 == 0) goto L86
            boolean r0 = p000.AbstractC0825t7.f10220
            if (r0 != 0) goto L86
            java.lang.String r0 = "auto_scroll_next_enabled"
            r1 = 0
            boolean r0 = p000.ui1.m5887(r0, r1)
            if (r0 != 0) goto L20
            goto L86
        L20:
            m7 r0 = r5.f8442
            if (r0 != 0) goto L25
            goto L86
        L25:
            boolean r1 = m5611(r0)
            if (r1 != 0) goto L2c
            goto L86
        L2c:
            java.lang.String r1 = "auto_scroll_image_dwell_seconds"
            r2 = 10
            android.content.SharedPreferences r3 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L38
            int r2 = r3.getInt(r1, r2)     // Catch: java.lang.Throwable -> L38
        L38:
            java.lang.String r1 = "auto_scroll_article_dwell_seconds"
            r3 = 20
            android.content.SharedPreferences r4 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L44
            int r3 = r4.getInt(r1, r3)     // Catch: java.lang.Throwable -> L44
        L44:
            int r0 = r0.ordinal()
            if (r0 == 0) goto L6f
            r1 = 1
            r4 = 3
            if (r0 == r1) goto L60
            r1 = 2
            if (r0 == r1) goto L58
            if (r0 != r4) goto L54
            goto L6f
        L54:
            p000.C1080.m7272()
            return
        L58:
            r0 = 5
            r1 = 120(0x78, float:1.68E-43)
            int r0 = p000.j81.m2906(r3, r0, r1)
            goto L66
        L60:
            r0 = 60
            int r0 = p000.j81.m2906(r2, r4, r0)
        L66:
            long r0 = (long) r0
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L70
        L6f:
            r0 = 0
        L70:
            if (r0 == 0) goto L86
            long r0 = r0.longValue()
            m5609(r5)
            ν r2 = new ν
            r3 = 3
            r2.<init>(r3, r5)
            r5.f8444 = r2
            android.os.Handler r5 = p000.AbstractC0825t7.f10215
            r5.postDelayed(r2, r0)
        L86:
            return
    }
}
