package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class xk0 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.CopyOnWriteArrayList f12197 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.CopyOnWriteArrayList f12198 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.CopyOnWriteArrayList f12199 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.LinkedHashSet f12200 = null;

    static {
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            p000.xk0.f12197 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            p000.xk0.f12198 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            p000.xk0.f12199 = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            p000.xk0.f12200 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m6678(android.graphics.Bitmap r3) {
            boolean r0 = r3.isRecycled()
            if (r0 != 0) goto L39
            int r0 = r3.getWidth()
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 >= r1) goto Lf
            goto L39
        Lf:
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.xk0.f12198
            if (r0 == 0) goto L1a
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1a
            goto L31
        L1a:
            java.util.Iterator r1 = r0.iterator()
        L1e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            if (r2 != r3) goto L1e
            goto L39
        L31:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            r0.add(r1)
        L39:
            return
    }

    /* JADX INFO: renamed from: β */
    public static boolean m6679(android.graphics.Bitmap r7) {
            int r0 = r7.getWidth()     // Catch: java.lang.Throwable -> L7f
            int r1 = r7.getHeight()     // Catch: java.lang.Throwable -> L7f
            int r2 = r0 / 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L7f
            int r3 = r1 / 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L7f
            l91 r4 = new l91     // Catch: java.lang.Throwable -> L7f
            r4.<init>(r2, r3)     // Catch: java.lang.Throwable -> L7f
            int r2 = r0 / 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L7f
            int r3 = r1 / 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L7f
            l91 r5 = new l91     // Catch: java.lang.Throwable -> L7f
            r5.<init>(r2, r3)     // Catch: java.lang.Throwable -> L7f
            int r2 = r0 * 3
            int r2 = r2 / 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L7f
            int r3 = r1 * 3
            int r3 = r3 / 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L7f
            l91 r6 = new l91     // Catch: java.lang.Throwable -> L7f
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L7f
            l91[] r2 = new p000.l91[]{r4, r5, r6}     // Catch: java.lang.Throwable -> L7f
            java.util.List r2 = p000.AbstractC1021yh.m6897(r2)     // Catch: java.lang.Throwable -> L7f
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L7f
        L4b:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L7f
            if (r3 == 0) goto L7d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L7f
            l91 r3 = (p000.l91) r3     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r4 = r3.f6502     // Catch: java.lang.Throwable -> L7f
            java.lang.Number r4 = (java.lang.Number) r4     // Catch: java.lang.Throwable -> L7f
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r3 = r3.f6503     // Catch: java.lang.Throwable -> L7f
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Throwable -> L7f
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L7f
            if (r4 < 0) goto L4b
            if (r4 >= r0) goto L4b
            if (r3 < 0) goto L4b
            if (r3 >= r1) goto L4b
            int r3 = r7.getPixel(r4, r3)     // Catch: java.lang.Throwable -> L7f
            if (r3 == 0) goto L4b
            r4 = -1
            if (r3 == r4) goto L4b
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r3 == r4) goto L4b
            goto L7f
        L7d:
            r7 = 1
            return r7
        L7f:
            r7 = 0
            return r7
    }

    /* JADX INFO: renamed from: γ */
    public static void m6680() {
            java.util.LinkedHashSet r0 = p000.xk0.f12200
            r0.clear()
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.xk0.f12198
            r0.clear()
            wj0 r0 = new wj0
            r1 = 22
            r0.<init>(r1)
            java.util.concurrent.CopyOnWriteArrayList r1 = p000.xk0.f12197
            p000.AbstractC0984xh.m6653(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L1f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L1f
            r0.add(r2)
            goto L1f
        L37:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        L40:
            boolean r3 = r2.hasNext()
            java.lang.String r4 = "DYHelper:PhotoHook"
            r5 = 4
            r6 = 0
            if (r3 == 0) goto Lce
            java.lang.Object r3 = r2.next()
            r7 = r3
            android.view.View r7 = (android.view.View) r7
            r8 = r7
        L52:
            r9 = 0
            java.lang.String r10 = ","
            r11 = 2
            r12 = 1
            if (r8 == 0) goto Lb1
            android.view.ViewParent r13 = r8.getParent()
            boolean r14 = r13 instanceof android.view.ViewGroup
            if (r14 == 0) goto L64
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            goto L65
        L64:
            r13 = r6
        L65:
            if (r13 != 0) goto L68
            goto L40
        L68:
            java.lang.Class r14 = r13.getClass()
            java.lang.String r14 = r14.getName()
            java.lang.String r15 = "RTViewPager"
            boolean r15 = p000.q02.m4654(r14, r15, r9)
            if (r15 != 0) goto L83
            java.lang.String r15 = "DetailScrollableViewPager"
            boolean r14 = p000.q02.m4654(r14, r15, r9)
            if (r14 == 0) goto L81
            goto L83
        L81:
            r8 = r13
            goto L52
        L83:
            int[] r7 = new int[r11]
            r8.getLocationOnScreen(r7)
            android.content.res.Resources r8 = r8.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            int r8 = r8.heightPixels
            r9 = r7[r9]
            r11 = r7[r12]
            java.lang.String r13 = "awemeContainer pos=("
            java.lang.String r14 = ") screenH="
            java.lang.StringBuilder r9 = p000.AbstractC0602nx.m4136(r13, r9, r10, r11, r14)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            p000.C0888ux.m5988(r4, r9, r6, r5, r6)
            r4 = r7[r12]
            if (r4 < 0) goto L40
            int r8 = r8 / 2
            if (r4 >= r8) goto L40
            goto Lc9
        Lb1:
            int[] r8 = new int[r11]
            r7.getLocationOnScreen(r8)
            r7 = r8[r9]
            r9 = r8[r12]
            java.lang.String r11 = "no awemeContainer, view pos=("
            java.lang.String r13 = ")"
            java.lang.String r7 = p000.AbstractC0602nx.m4128(r11, r7, r10, r9, r13)
            p000.C0888ux.m5988(r4, r7, r6, r5, r6)
            r4 = r8[r12]
            if (r4 < 0) goto L40
        Lc9:
            r1.add(r3)
            goto L40
        Lce:
            int r0 = r0.size()
            int r2 = r1.size()
            java.lang.String r3 = " total, "
            java.lang.String r7 = " current aweme"
            java.lang.String r8 = "triggerScan: "
            java.lang.String r0 = p000.AbstractC0602nx.m4128(r8, r0, r3, r2, r7)
            p000.C0888ux.m5988(r4, r0, r6, r5, r6)
            java.util.Iterator r0 = r1.iterator()
        Le7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lfe
            java.lang.Object r1 = r0.next()
            android.view.View r1 = (android.view.View) r1
            jb r2 = new jb
            r3 = 24
            r2.<init>(r1, r3)
            r1.post(r2)
            goto Le7
        Lfe:
            return
    }
}
