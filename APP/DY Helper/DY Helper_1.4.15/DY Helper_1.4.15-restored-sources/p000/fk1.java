package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class fk1 {

    /* JADX INFO: renamed from: α */
    public static final p000.fk1 f3997 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicBoolean f3998 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.ConcurrentHashMap f3999 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.CopyOnWriteArrayList f4000 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.List f4001 = null;

    static {
            fk1 r0 = new fk1
            r0.<init>()
            p000.fk1.f3997 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.fk1.f3998 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.fk1.f3999 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            p000.fk1.f4000 = r0
            java.lang.String r0 = "~788FC25F6ECFA50DD00C6DA13A7899CDD863E55178DDAE176707859EDDA8AE08A7E39E76D72CD0ED2894EBA8AE89C668D958516EBA264A16F0AC0219DBF823F756466AC3C64E"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r1 = "com.p771ss.android.ugc.aweme.im.share.sharelist.IMShareContactsListAdapter"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            p000.fk1.f4001 = r0
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m2143(p000.a80 r0, java.lang.Class r1) {
            r0.invoke(r1)     // Catch: java.lang.Throwable -> L6
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L6
            goto Ld
        L6:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        Ld:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L26
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = "resolved listener failed: "
            java.lang.String r0 = r1.concat(r0)
            java.lang.String r1 = "rccd4afae37c74879"
            p000.C0888ux.m5975(r1, r0)
        L26:
            return
    }

    /* JADX INFO: renamed from: γ */
    public static java.util.List m2144(java.util.Collection r3) {
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            f7 r0 = new f7
            r1 = 1
            r0.<init>(r1, r3)
            li1 r3 = new li1
            r1 = 14
            r3.<init>(r1)
            y30 r1 = new y30
            r2 = 1
            r1.<init>(r0, r2, r3)
            li1 r3 = new li1
            r0 = 15
            r3.<init>(r0)
            bu r0 = new bu
            java.util.Iterator r1 = r1.iterator()
            r0.<init>(r1, r3)
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto L2e
            jz r3 = p000.C0450jz.f5672
            goto L4f
        L2e:
            java.lang.Object r3 = r0.next()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L3d
            java.util.List r3 = p000.AbstractC1021yh.m6896(r3)
            goto L4f
        L3d:
            java.util.ArrayList r3 = p000.lz1.m3696(r3)
        L41:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r0.next()
            r3.add(r1)
            goto L41
        L4f:
            return r3
    }

    /* JADX INFO: renamed from: α */
    public final void m2145(java.lang.ClassLoader r8, boolean r9) {
            r7 = this;
            r8.getClass()
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6193
            java.util.List r1 = p000.C0666ox.m4321(r0, r8)
            jz r2 = p000.C0450jz.f5672
            if (r1 != 0) goto L10
            r1 = r2
        L10:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r4 = p000.fk1.f4001
            java.util.Iterator r4 = r4.iterator()
        L1b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L41
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            r6 = 0
            java.lang.Class r5 = java.lang.Class.forName(r5, r6, r8)     // Catch: java.lang.Throwable -> L2d
            goto L34
        L2d:
            r5 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        L34:
            boolean r6 = r5 instanceof p000.eo1
            if (r6 == 0) goto L39
            r5 = 0
        L39:
            java.lang.Class r5 = (java.lang.Class) r5
            if (r5 == 0) goto L1b
            r3.add(r5)
            goto L1b
        L41:
            java.util.List r4 = m2144(r1)
            java.util.ArrayList r3 = p000.AbstractC0984xh.m6651(r3, r4)
            java.util.List r3 = m2144(r3)
            boolean r5 = r3.isEmpty()
            java.lang.String r6 = "rccd4afae37c74879"
            if (r5 != 0) goto L8d
            boolean r7 = r3.isEmpty()
            if (r7 != 0) goto L8a
            java.lang.Object r7 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r7 = p000.C0666ox.f8305
            boolean r7 = r7.get()
            if (r7 != 0) goto L66
            goto L8a
        L66:
            p000.C0666ox.m4325(r0, r3)     // Catch: java.lang.Throwable -> L6c
            s62 r7 = p000.s62.f9751     // Catch: java.lang.Throwable -> L6c
            goto L73
        L6c:
            r7 = move-exception
            eo1 r8 = new eo1
            r8.<init>(r7)
            r7 = r8
        L73:
            java.lang.Throwable r7 = p000.fo1.m2190(r7)
            if (r7 == 0) goto L8a
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getSimpleName()
            java.lang.String r8 = "save class cache failed: "
            java.lang.String r7 = r8.concat(r7)
            p000.C0888ux.m5975(r6, r7)
        L8a:
            r2 = r3
            goto Lf7
        L8d:
            if (r9 == 0) goto Lf7
            java.lang.Object r9 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r9 = p000.C0666ox.f8305
            boolean r9 = r9.get()
            if (r9 != 0) goto L9a
            goto Lf7
        L9a:
            android.os.Looper r9 = android.os.Looper.myLooper()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            boolean r9 = p000.ln0.m3626(r9, r3)
            if (r9 == 0) goto Lae
            java.lang.String r7 = "skip DexKit scan on main thread"
            p000.C0888ux.m5975(r6, r7)
            goto Lf7
        Lae:
            boolean r9 = r1.isEmpty()
            if (r9 != 0) goto Lbd
            boolean r9 = r4.isEmpty()
            if (r9 == 0) goto Lbd
            p000.C0666ox.m4325(r0, r2)     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            java.lang.Object r9 = p000.C0666ox.f8297     // Catch: java.lang.Throwable -> Ld1
            t20 r9 = new t20     // Catch: java.lang.Throwable -> Ld1
            r1 = 28
            r9.<init>(r8, r7, r1)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r7 = "定位视频快捷分享联系人 Adapter"
            java.util.List r7 = p000.C0666ox.m4314(r0, r8, r7, r9)     // Catch: java.lang.Throwable -> Ld1
            java.util.List r7 = m2144(r7)     // Catch: java.lang.Throwable -> Ld1
            goto Ld8
        Ld1:
            r7 = move-exception
            eo1 r8 = new eo1
            r8.<init>(r7)
            r7 = r8
        Ld8:
            java.lang.Throwable r8 = p000.fo1.m2190(r7)
            if (r8 == 0) goto Lef
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getSimpleName()
            java.lang.String r9 = "DexKit candidate scan failed: "
            java.lang.String r8 = r9.concat(r8)
            p000.C0888ux.m5975(r6, r8)
        Lef:
            boolean r8 = r7 instanceof p000.eo1
            if (r8 == 0) goto Lf4
            goto Lf5
        Lf4:
            r2 = r7
        Lf5:
            java.util.List r2 = (java.util.List) r2
        Lf7:
            java.util.Iterator r7 = r2.iterator()
        Lfb:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L12c
            java.lang.Object r8 = r7.next()
            java.lang.Class r8 = (java.lang.Class) r8
            java.util.concurrent.ConcurrentHashMap r9 = p000.fk1.f3999
            java.lang.String r0 = r8.getName()
            java.lang.Object r9 = r9.putIfAbsent(r0, r8)
            if (r9 != 0) goto Lfb
            java.util.concurrent.CopyOnWriteArrayList r9 = p000.fk1.f4000
            java.util.Iterator r9 = r9.iterator()
        L119:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lfb
            java.lang.Object r0 = r9.next()
            a80 r0 = (p000.a80) r0
            r0.getClass()
            m2143(r0, r8)
            goto L119
        L12c:
            return
    }
}
