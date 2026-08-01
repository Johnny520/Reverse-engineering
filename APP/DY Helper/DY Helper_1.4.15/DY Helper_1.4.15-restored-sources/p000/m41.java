package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class m41 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f6932 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.Set f6933 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicReference f6934 = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.m41.f6932 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            p000.m41.f6933 = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            r0.<init>(r1)
            p000.m41.f6934 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m3725(java.lang.reflect.Method r5, java.lang.String r6, p000.m01 r7) {
            java.lang.String r0 = " method="
            java.lang.String r1 = "[install] role="
            java.lang.String r2 = r5.toGenericString()
            java.util.Set r3 = p000.m41.f6933
            boolean r4 = r3.add(r2)
            if (r4 != 0) goto L11
            goto L5b
        L11:
            r4 = 1
            r5.setAccessible(r4)     // Catch: java.lang.Throwable -> L32
            xq0 r4 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L32
            r4.m6775(r5, r7)     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L32
            r5.append(r6)     // Catch: java.lang.Throwable -> L32
            r5.append(r0)     // Catch: java.lang.Throwable -> L32
            r5.append(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L32
            m3727(r5)     // Catch: java.lang.Throwable -> L32
            s62 r5 = p000.s62.f9751     // Catch: java.lang.Throwable -> L32
            goto L39
        L32:
            r5 = move-exception
            eo1 r7 = new eo1
            r7.<init>(r5)
            r5 = r7
        L39:
            java.lang.Throwable r5 = p000.fo1.m2190(r5)
            if (r5 == 0) goto L5b
            r3.remove(r2)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "[install] failed role="
            r7.<init>(r1)
            r7.append(r6)
            r7.append(r0)
            r7.append(r2)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "DYH-OfflineCache"
            p000.C0888ux.m5977(r7, r6, r5)
        L5b:
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m3726(java.lang.ClassLoader r12) {
            r12.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.m41.f6932
            r2 = 1
            r6 = 0
            boolean r0 = r0.compareAndSet(r6, r2)
            r7 = 24
            r8 = 23
            if (r0 != 0) goto L12
            goto L61
        L12:
            java.lang.String r0 = "offline_cache_count_enabled"
            boolean r0 = p000.ui1.m5887(r0, r6)
            java.lang.String r2 = "offline_cache_count"
            r3 = 100
            android.content.SharedPreferences r4 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L24
            int r3 = r4.getInt(r2, r3)     // Catch: java.lang.Throwable -> L24
        L24:
            r2 = 10
            r4 = 500(0x1f4, float:7.0E-43)
            int r2 = p000.j81.m2906(r3, r2, r4)
            p000.jx0.f5633 = r0
            p000.jx0.f5634 = r2
            boolean r0 = p000.jx0.f5633
            int r2 = p000.jx0.f5634
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "[config] initial enabled="
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = " count="
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            m3727(r0)
            sv0 r0 = new sv0
            r0.<init>(r8)
            java.util.concurrent.CopyOnWriteArrayList r2 = p000.ui1.f10853
            r2.add(r0)
            sv0 r0 = new sv0
            r0.<init>(r7)
            java.util.concurrent.CopyOnWriteArrayList r2 = p000.ui1.f10852
            r2.add(r0)
        L61:
            l41 r9 = p000.l41.f6416
            kx r0 = p000.EnumC0491kx.f6259
            sv0 r3 = new sv0
            r10 = 22
            r3.<init>(r10)
            r20 r4 = new r20
            r2 = 28
            r4.<init>(r12, r2)
            t20 r5 = new t20
            r2 = 15
            r5.<init>(r12, r2)
            r2 = 0
            r1 = r12
            java.util.List r11 = p000.l41.m3492(r0, r1, r2, r3, r4, r5)
            java.util.List r0 = r9.m3494(r12, r2)
            java.util.Iterator r0 = r0.iterator()
        L88:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto La1
            java.lang.Object r3 = r0.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            oj0 r4 = new oj0
            r5 = 21
            r4.<init>(r5)
            java.lang.String r5 = "target_getter"
            m3725(r3, r5, r4)
            goto L88
        La1:
            l41 r0 = p000.l41.f6416
            java.util.List r0 = r0.m3495(r12, r2)
            java.util.Iterator r0 = r0.iterator()
        Lab:
            boolean r3 = r0.hasNext()
            r9 = 2
            if (r3 == 0) goto Lc3
            java.lang.Object r3 = r0.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            bt r4 = new bt
            java.lang.String r5 = "target_setter"
            r4.<init>(r5, r9)
            m3725(r3, r5, r4)
            goto Lab
        Lc3:
            kx r0 = p000.EnumC0491kx.f6258
            sv0 r3 = new sv0
            r4 = 12
            r3.<init>(r4)
            k41 r4 = new k41
            r4.<init>(r12, r6)
            t20 r5 = new t20
            r6 = 17
            r5.<init>(r12, r6)
            r1 = r12
            java.util.List r0 = p000.l41.m3492(r0, r1, r2, r3, r4, r5)
            java.util.Iterator r0 = r0.iterator()
        Le1:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lf8
            java.lang.Object r3 = r0.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            bt r4 = new bt
            java.lang.String r5 = "cache_loader"
            r4.<init>(r5, r9)
            m3725(r3, r5, r4)
            goto Le1
        Lf8:
            java.util.Iterator r0 = r11.iterator()
        Lfc:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L113
            java.lang.Object r3 = r0.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            oj0 r4 = new oj0
            r4.<init>(r10)
            java.lang.String r5 = "panel_adjust"
            m3725(r3, r5, r4)
            goto Lfc
        L113:
            l41 r0 = p000.l41.f6416
            kx r0 = p000.EnumC0491kx.f6261
            sv0 r3 = new sv0
            r4 = 11
            r3.<init>(r4)
            r20 r4 = new r20
            r5 = 29
            r4.<init>(r12, r5)
            t20 r5 = new t20
            r6 = 16
            r5.<init>(r12, r6)
            r1 = r12
            java.util.List r0 = p000.l41.m3492(r0, r1, r2, r3, r4, r5)
            java.util.Iterator r0 = r0.iterator()
        L135:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L14c
            java.lang.Object r3 = r0.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            oj0 r4 = new oj0
            r4.<init>(r7)
            java.lang.String r5 = "panel_render"
            m3725(r3, r5, r4)
            goto L135
        L14c:
            l41 r0 = p000.l41.f6416
            kx r0 = p000.EnumC0491kx.f6260
            sv0 r3 = new sv0
            r4 = 19
            r3.<init>(r4)
            k41 r4 = new k41
            r5 = 8
            r4.<init>(r12, r5)
            t20 r5 = new t20
            r6 = 20
            r5.<init>(r12, r6)
            r1 = r12
            java.util.List r0 = p000.l41.m3492(r0, r1, r2, r3, r4, r5)
            java.util.Iterator r0 = r0.iterator()
        L16e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L185
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            oj0 r2 = new oj0
            r2.<init>(r8)
            java.lang.String r3 = "panel_ui"
            m3725(r1, r3, r2)
            goto L16e
        L185:
            return
    }

    /* JADX INFO: renamed from: γ */
    public static void m3727(java.lang.String r1) {
            java.lang.String r0 = "DYH-OfflineCache"
            p000.C0888ux.m5975(r0, r1)
            return
    }
}
