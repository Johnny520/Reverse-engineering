package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class qr1 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f9091 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.Set f9092 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.Set f9093 = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.qr1.f9091 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            java.util.Set r0 = java.util.Collections.synchronizedSet(r0)
            r0.getClass()
            p000.qr1.f9092 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            java.util.Set r0 = java.util.Collections.synchronizedSet(r0)
            r0.getClass()
            p000.qr1.f9093 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m4943(android.view.View r4) {
            java.util.Set r0 = p000.qr1.f9092
            r0.add(r4)
            boolean r0 = p000.ui1.m5867()
            java.lang.String r1 = "default"
            if (r0 != 0) goto Le
            goto L1d
        Le:
            java.lang.String r0 = "seekbar_visibility_mode"
            java.lang.String r0 = p000.ui1.m5893(r0, r1)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r1 = r0.toLowerCase(r1)
            r1.getClass()
        L1d:
            java.lang.String r0 = "show"
            boolean r0 = r1.equals(r0)
            java.util.Set r2 = p000.qr1.f9093
            if (r0 == 0) goto L50
            boolean r0 = r2.add(r4)
            if (r0 != 0) goto L2e
            goto L84
        L2e:
            int r0 = r4.getVisibility()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L38
            r0 = 0
            r4.setVisibility(r0)     // Catch: java.lang.Throwable -> L4c
        L38:
            float r0 = r4.getAlpha()     // Catch: java.lang.Throwable -> L4c
            r1 = 1008981770(0x3c23d70a, float:0.01)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L48
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.setAlpha(r0)     // Catch: java.lang.Throwable -> L4c
        L48:
            r2.remove(r4)
            return
        L4c:
            r2.remove(r4)
            return
        L50:
            java.lang.String r0 = "hide"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L84
            boolean r0 = r2.add(r4)
            if (r0 != 0) goto L5f
            goto L84
        L5f:
            int r0 = r4.getVisibility()     // Catch: java.lang.Throwable -> L81
            r1 = 4
            if (r0 == r1) goto L69
            r4.setVisibility(r1)     // Catch: java.lang.Throwable -> L81
        L69:
            float r0 = r4.getAlpha()     // Catch: java.lang.Throwable -> L81
            r1 = 0
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)     // Catch: java.lang.Throwable -> L81
            r3 = 1000593162(0x3ba3d70a, float:0.005)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L7d
            r4.setAlpha(r1)     // Catch: java.lang.Throwable -> L81
        L7d:
            r2.remove(r4)
            return
        L81:
            r2.remove(r4)
        L84:
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m4944(java.lang.Class r7, java.lang.String r8, p000.m01 r9) {
            java.lang.String r0 = "DYHelper: SeekBarVisibility"
            java.lang.String r1 = "#"
            java.lang.String r2 = "hook "
            r3 = 4
            r4 = 0
            xq0 r5 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L36
            java.util.Set r9 = r5.m6774(r7, r8, r9)     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = r7.getName()     // Catch: java.lang.Throwable -> L36
            int r9 = r9.size()     // Catch: java.lang.Throwable -> L36
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L36
            r6.append(r5)     // Catch: java.lang.Throwable -> L36
            r6.append(r1)     // Catch: java.lang.Throwable -> L36
            r6.append(r8)     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = " count="
            r6.append(r5)     // Catch: java.lang.Throwable -> L36
            r6.append(r9)     // Catch: java.lang.Throwable -> L36
            java.lang.String r9 = r6.toString()     // Catch: java.lang.Throwable -> L36
            p000.C0888ux.m5988(r0, r9, r4, r3, r4)     // Catch: java.lang.Throwable -> L36
            s62 r9 = p000.s62.f9751     // Catch: java.lang.Throwable -> L36
            goto L3d
        L36:
            r9 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r9)
            r9 = r5
        L3d:
            java.lang.Throwable r9 = p000.fo1.m2190(r9)
            if (r9 == 0) goto L5b
            java.lang.String r7 = r7.getName()
            java.lang.String r9 = r9.getMessage()
            java.lang.String r5 = " failed: "
            java.lang.StringBuilder r7 = p000.lz1.m3695(r2, r7, r1, r8, r5)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            p000.C0888ux.m5988(r0, r7, r4, r3, r4)
        L5b:
            return
    }
}
