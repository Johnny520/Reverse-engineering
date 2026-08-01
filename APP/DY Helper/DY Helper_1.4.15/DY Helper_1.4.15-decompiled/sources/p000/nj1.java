package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class nj1 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f7649 = null;

    /* JADX INFO: renamed from: β */
    public static final java.lang.Object f7650 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.WeakHashMap f7651 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.WeakHashMap f7652 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.WeakHashMap f7653 = null;

    /* JADX INFO: renamed from: ζ */
    public static volatile float f7654;

    /* JADX INFO: renamed from: η */
    public static volatile float f7655;

    /* JADX INFO: renamed from: θ */
    public static final p000.li1 f7656 = null;

    /* JADX INFO: renamed from: ι */
    public static final p000.li1 f7657 = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.nj1.f7649 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.nj1.f7650 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            p000.nj1.f7651 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            p000.nj1.f7652 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            p000.nj1.f7653 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            p000.nj1.f7654 = r0
            p000.nj1.f7655 = r0
            li1 r0 = new li1
            r1 = 6
            r0.<init>(r1)
            p000.nj1.f7656 = r0
            li1 r0 = new li1
            r1 = 7
            r0.<init>(r1)
            p000.nj1.f7657 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m4070(android.view.View r3, boolean r4) {
            if (r4 != 0) goto L1b
            java.lang.Object r4 = p000.nj1.f7650
            monitor-enter(r4)
            java.util.WeakHashMap r0 = p000.nj1.f7651     // Catch: java.lang.Throwable -> L18
            java.lang.Object r0 = r0.remove(r3)     // Catch: java.lang.Throwable -> L18
            java.lang.Float r0 = (java.lang.Float) r0     // Catch: java.lang.Throwable -> L18
            monitor-exit(r4)
            if (r0 == 0) goto L17
            float r4 = r0.floatValue()
            m4077(r3, r4)
        L17:
            return
        L18:
            r3 = move-exception
            monitor-exit(r4)
            throw r3
        L1b:
            m4076()
            java.util.Set r4 = p000.rj1.f9389
            float r4 = r3.getAlpha()
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = p000.rj1.m5100(r4, r0)
            java.lang.Object r0 = p000.nj1.f7650
            monitor-enter(r0)
            java.util.WeakHashMap r1 = p000.nj1.f7651     // Catch: java.lang.Throwable -> L41
            java.lang.Float r2 = java.lang.Float.valueOf(r4)     // Catch: java.lang.Throwable -> L41
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> L41
            monitor-exit(r0)
            float r0 = p000.nj1.f7654
            float r4 = p000.rj1.m5100(r4, r0)
            m4077(r3, r4)
            return
        L41:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    /* JADX INFO: renamed from: β */
    public static boolean m4071(android.view.View r4) {
            java.util.WeakHashMap r0 = p000.nj1.f7653
            java.util.Set r0 = r0.keySet()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L19
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L19
            goto L40
        L19:
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L40
            java.lang.Object r1 = r0.next()
            android.view.View r1 = (android.view.View) r1
            r1.getClass()
            r2 = r4
        L2d:
            if (r2 == 0) goto L1d
            if (r2 != r1) goto L33
            r4 = 1
            return r4
        L33:
            android.view.ViewParent r2 = r2.getParent()
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L3e
            android.view.View r2 = (android.view.View) r2
            goto L2d
        L3e:
            r2 = 0
            goto L2d
        L40:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: γ */
    public static void m4072(android.view.View r2, boolean r3, float r4) {
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = p000.rj1.m5100(r4, r0)
            if (r3 != 0) goto L18
            java.lang.Object r3 = p000.nj1.f7650
            monitor-enter(r3)
            java.util.WeakHashMap r4 = p000.nj1.f7652     // Catch: java.lang.Throwable -> L15
            java.lang.Object r2 = r4.remove(r2)     // Catch: java.lang.Throwable -> L15
            java.lang.Float r2 = (java.lang.Float) r2     // Catch: java.lang.Throwable -> L15
            monitor-exit(r3)
            return
        L15:
            r2 = move-exception
            monitor-exit(r3)
            throw r2
        L18:
            m4075()
            java.lang.Object r3 = p000.nj1.f7650
            monitor-enter(r3)
            boolean r0 = m4071(r2)     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L2d
            java.util.WeakHashMap r0 = p000.nj1.f7652     // Catch: java.lang.Throwable -> L2b
            r0.remove(r2)     // Catch: java.lang.Throwable -> L2b
            r0 = 1
            goto L37
        L2b:
            r2 = move-exception
            goto L48
        L2d:
            java.util.WeakHashMap r0 = p000.nj1.f7652     // Catch: java.lang.Throwable -> L2b
            java.lang.Float r1 = java.lang.Float.valueOf(r4)     // Catch: java.lang.Throwable -> L2b
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L2b
            r0 = 0
        L37:
            monitor-exit(r3)
            if (r0 == 0) goto L3e
            m4077(r2, r4)
            return
        L3e:
            float r3 = p000.nj1.f7655
            float r3 = p000.rj1.m5100(r4, r3)
            m4077(r2, r3)
            return
        L48:
            monitor-exit(r3)
            throw r2
    }

    /* JADX INFO: renamed from: δ */
    public static void m4073() {
            java.lang.Object r0 = p000.nj1.f7650
            monitor-enter(r0)
            java.util.WeakHashMap r1 = p000.nj1.f7652     // Catch: java.lang.Throwable -> L3a
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L3a
            r1.getClass()     // Catch: java.lang.Throwable -> L3a
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L3a
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3a
            r3 = 10
            int r4 = p000.AbstractC1021yh.m6889(r1, r3)     // Catch: java.lang.Throwable -> L3a
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L3a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3a
        L1d:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L3d
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L3a
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r5 = r4.getKey()     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L3a
            l91 r6 = new l91     // Catch: java.lang.Throwable -> L3a
            r6.<init>(r5, r4)     // Catch: java.lang.Throwable -> L3a
            r2.add(r6)     // Catch: java.lang.Throwable -> L3a
            goto L1d
        L3a:
            r1 = move-exception
            goto Lc4
        L3d:
            java.util.WeakHashMap r1 = p000.nj1.f7653     // Catch: java.lang.Throwable -> L3a
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L3a
            r1.getClass()     // Catch: java.lang.Throwable -> L3a
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L3a
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3a
            int r3 = p000.AbstractC1021yh.m6889(r1, r3)     // Catch: java.lang.Throwable -> L3a
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L3a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3a
        L55:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L72
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L3a
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r5 = r3.getKey()     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L3a
            l91 r6 = new l91     // Catch: java.lang.Throwable -> L3a
            r6.<init>(r5, r3)     // Catch: java.lang.Throwable -> L3a
            r4.add(r6)     // Catch: java.lang.Throwable -> L3a
            goto L55
        L72:
            monitor-exit(r0)
            java.util.Iterator r0 = r2.iterator()
        L77:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L9b
            java.lang.Object r1 = r0.next()
            l91 r1 = (p000.l91) r1
            java.lang.Object r2 = r1.f6502
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r1 = r1.f6503
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.util.Set r3 = p000.rj1.f9389
            float r3 = p000.nj1.f7655
            float r1 = p000.rj1.m5100(r1, r3)
            m4077(r2, r1)
            goto L77
        L9b:
            java.util.Iterator r0 = r4.iterator()
        L9f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc3
            java.lang.Object r1 = r0.next()
            l91 r1 = (p000.l91) r1
            java.lang.Object r2 = r1.f6502
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r1 = r1.f6503
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.util.Set r3 = p000.rj1.f9389
            float r3 = p000.nj1.f7655
            float r1 = p000.rj1.m5100(r1, r3)
            m4077(r2, r1)
            goto L9f
        Lc3:
            return
        Lc4:
            monitor-exit(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ε */
    public static void m4074() {
            java.lang.Object r0 = p000.nj1.f7650
            monitor-enter(r0)
            java.util.WeakHashMap r1 = p000.nj1.f7651     // Catch: java.lang.Throwable -> L3a
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L3a
            r1.getClass()     // Catch: java.lang.Throwable -> L3a
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L3a
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3a
            r3 = 10
            int r3 = p000.AbstractC1021yh.m6889(r1, r3)     // Catch: java.lang.Throwable -> L3a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3a
        L1d:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L3c
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L3a
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L3a
            l91 r5 = new l91     // Catch: java.lang.Throwable -> L3a
            r5.<init>(r4, r3)     // Catch: java.lang.Throwable -> L3a
            r2.add(r5)     // Catch: java.lang.Throwable -> L3a
            goto L1d
        L3a:
            r1 = move-exception
            goto L6c
        L3c:
            monitor-exit(r0)
            java.util.Iterator r0 = r2.iterator()
        L41:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6b
            java.lang.Object r1 = r0.next()
            l91 r1 = (p000.l91) r1
            java.lang.Object r2 = r1.f6502
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r1 = r1.f6503
            java.lang.Float r1 = (java.lang.Float) r1
            r2.getClass()
            java.util.Set r3 = p000.rj1.f9389
            r1.getClass()
            float r1 = r1.floatValue()
            float r3 = p000.nj1.f7654
            float r1 = p000.rj1.m5100(r1, r3)
            m4077(r2, r1)
            goto L41
        L6b:
            return
        L6c:
            monitor-exit(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ζ */
    public static void m4075() {
            java.lang.String r0 = "profile_video_comment_bar_alpha"
            r1 = 100
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> Ld
            int r0 = r2.getInt(r0, r1)     // Catch: java.lang.Throwable -> Ld
            goto Le
        Ld:
            r0 = r1
        Le:
            r2 = 0
            int r0 = p000.j81.m2906(r0, r2, r1)
            float r0 = (float) r0
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r1
            p000.nj1.f7655 = r0
            return
    }

    /* JADX INFO: renamed from: η */
    public static void m4076() {
            java.lang.String r0 = "profile_video_search_alpha"
            r1 = 100
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> Ld
            int r0 = r2.getInt(r0, r1)     // Catch: java.lang.Throwable -> Ld
            goto Le
        Ld:
            r0 = r1
        Le:
            r2 = 0
            int r0 = p000.j81.m2906(r0, r2, r1)
            float r0 = (float) r0
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r1
            p000.nj1.f7654 = r0
            return
    }

    /* JADX INFO: renamed from: θ */
    public static void m4077(android.view.View r2, float r3) {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L2b
            r2.setAlpha(r3)     // Catch: java.lang.Throwable -> L14
            s62 r2 = p000.s62.f9751     // Catch: java.lang.Throwable -> L14
            goto L1b
        L14:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L1b:
            java.lang.Throwable r2 = p000.fo1.m2190(r2)
            if (r2 == 0) goto L2a
            java.lang.String r2 = r2.getMessage()
            java.lang.String r3 = "ProfileVideoOverlayAlpha: 主线程应用透明度失败: "
            p000.AbstractC0602nx.m4142(r3, r2)
        L2a:
            return
        L2b:
            mj1 r0 = new mj1
            r0.<init>(r2, r3)
            r2.post(r0)
            return
    }
}
