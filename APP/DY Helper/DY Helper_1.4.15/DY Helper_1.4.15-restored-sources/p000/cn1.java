package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class cn1 {

    /* JADX INFO: renamed from: α */
    public static final p000.cn1 f2212 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicBoolean f2213 = null;

    /* JADX INFO: renamed from: γ */
    public static final android.os.Handler f2214 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.Map f2215 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.concurrent.ConcurrentHashMap f2216 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f2217 = null;

    /* JADX INFO: renamed from: η */
    public static final java.lang.ThreadLocal f2218 = null;

    static {
            cn1 r0 = new cn1
            r0.<init>()
            p000.cn1.f2212 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.cn1.f2213 = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            p000.cn1.f2214 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            p000.cn1.f2215 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.cn1.f2216 = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            p000.cn1.f2217 = r0
            b01 r0 = new b01
            r1 = 1
            r0.<init>(r1)
            java.lang.ThreadLocal r0 = java.lang.ThreadLocal.withInitial(r0)
            p000.cn1.f2218 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final android.widget.ImageView m1274(java.lang.Object r4) {
            java.lang.Class r0 = r4.getClass()
            li1 r1 = new li1
            r2 = 16
            r1.<init>(r2)
            c8 r2 = new c8
            r3 = 12
            r2.<init>(r1, r3)
            java.util.concurrent.ConcurrentHashMap r1 = p000.cn1.f2216
            java.lang.Object r0 = r1.computeIfAbsent(r0, r2)
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            r1 = 0
            if (r0 != 0) goto L1e
            return r1
        L1e:
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.Throwable -> L29
            boolean r0 = r4 instanceof android.widget.ImageView     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L2b
            android.widget.ImageView r4 = (android.widget.ImageView) r4     // Catch: java.lang.Throwable -> L29
            goto L33
        L29:
            r4 = move-exception
            goto L2d
        L2b:
            r4 = r1
            goto L33
        L2d:
            eo1 r0 = new eo1
            r0.<init>(r4)
            r4 = r0
        L33:
            boolean r0 = r4 instanceof p000.eo1
            if (r0 == 0) goto L38
            goto L39
        L38:
            r1 = r4
        L39:
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            return r1
    }

    /* JADX INFO: renamed from: β */
    public static final void m1275(p000.ee0 r4, java.lang.Object r5, java.util.List r6, int r7, int r8) {
            java.lang.reflect.Method r0 = r4.f3518
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L9
            goto L4b
        L9:
            java.lang.Class r1 = r0.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            java.lang.Class r2 = r5.getClass()
            java.lang.String r2 = r2.getName()
            int r4 = r4.f3520
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = "@"
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = ":"
            r3.append(r1)
            r3.append(r4)
            java.lang.String r4 = r3.toString()
            if (r8 <= 0) goto L40
            java.lang.String r1 = ":removed"
        L3b:
            java.lang.String r4 = r4.concat(r1)
            goto L43
        L40:
            java.lang.String r1 = ":observed"
            goto L3b
        L43:
            java.util.concurrent.ConcurrentHashMap$KeySetView r1 = p000.cn1.f2217
            boolean r4 = r1.add(r4)
            if (r4 != 0) goto L4c
        L4b:
            return
        L4c:
            java.util.Iterator r4 = r6.iterator()
        L50:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L5d
            java.lang.Object r1 = r4.next()
            if (r1 == 0) goto L50
            goto L5e
        L5d:
            r1 = 0
        L5e:
            if (r1 == 0) goto L69
            java.lang.Class r4 = r1.getClass()
            java.lang.String r4 = r4.getName()
            goto L6b
        L69:
            java.lang.String r4 = "null"
        L6b:
            java.lang.Class r0 = r0.getDeclaringClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getSimpleName()
            int r6 = r6.size()
            java.lang.String r1 = " receiver="
            java.lang.String r2 = " source="
            java.lang.String r3 = "callback owner="
            java.lang.StringBuilder r5 = p000.lz1.m3695(r3, r0, r1, r5, r2)
            java.lang.String r0 = " recognized="
            java.lang.String r1 = " removed="
            p000.AbstractC0602nx.m4117(r5, r6, r0, r7, r1)
            r5.append(r8)
            java.lang.String r6 = " sample="
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "reae2c2e0c445b34d"
            p000.C0888ux.m5975(r5, r4)
            return
    }
}
