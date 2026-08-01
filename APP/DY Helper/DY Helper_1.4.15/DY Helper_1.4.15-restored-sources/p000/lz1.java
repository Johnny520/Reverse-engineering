package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class lz1 {

    /* JADX INFO: renamed from: α */
    public static final /* synthetic */ int[] f6877 = null;

    static {
            r0 = 9
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [1, 2, 3, 4, 5, 6, 7, 8, 9} // fill-array
            p000.lz1.f6877 = r0
            return
    }

    /* JADX INFO: renamed from: Α */
    public static void m3671(java.lang.StringBuilder r0, int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0.append(r1)
            r0.append(r2)
            r0.append(r3)
            r0.append(r4)
            return
    }

    /* JADX INFO: renamed from: Β */
    public static void m3672(java.lang.StringBuilder r0, java.lang.reflect.Field r1, java.lang.String r2, java.lang.reflect.Field r3, java.lang.String r4) {
            r0.append(r1)
            r0.append(r2)
            r0.append(r3)
            r0.append(r4)
            return
    }

    /* JADX INFO: renamed from: Γ */
    public static boolean m3673(java.lang.StringBuilder r0, java.lang.String r1, java.lang.String r2, java.util.HashSet r3) {
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            boolean r0 = r3.add(r0)
            return r0
    }

    /* JADX INFO: renamed from: Δ */
    public static java.lang.String m3674(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            return r1
    }

    /* JADX INFO: renamed from: Ε */
    public static /* synthetic */ int m3675(int r0) {
            if (r0 == 0) goto L5
            int r0 = r0 + (-1)
            return r0
        L5:
            r0 = 0
            throw r0
    }

    /* JADX INFO: renamed from: α */
    public static int m3676(float r0, int r1, int r2) {
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 + r1
            int r0 = r0 * r2
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static int m3677(int r0, int r1, long r2) {
            int r2 = java.lang.Long.hashCode(r2)
            int r2 = r2 + r0
            int r2 = r2 * r1
            return r2
    }

    /* JADX INFO: renamed from: γ */
    public static int m3678(int r0, int r1, boolean r2) {
            int r2 = java.lang.Boolean.hashCode(r2)
            int r2 = r2 + r0
            int r2 = r2 * r1
            return r2
    }

    /* JADX INFO: renamed from: δ */
    public static int m3679(java.lang.Class r0, java.util.ArrayList r1, int r2, int r3) {
            java.lang.String r0 = r0.getName()
            r1.add(r0)
            int r2 = r2 + r3
            return r2
    }

    /* JADX INFO: renamed from: ε */
    public static p000.C0692pm m3680(java.lang.String r0) {
            p000.am0.m179(r0)
            pm r0 = new pm
            r0.<init>()
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static android.graphics.drawable.GradientDrawable m3681(int r1) {
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r0.setColor(r1)
            return r0
    }

    /* JADX INFO: renamed from: η */
    public static android.view.View m3682(java.lang.String r0, android.widget.TextView r1, android.view.View r2, int r3) {
            int r0 = android.graphics.Color.parseColor(r0)
            r1.setTextColor(r0)
            android.view.View r0 = r2.findViewById(r3)
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public static android.widget.TextView m3683(android.app.Activity r1, java.lang.String r2, float r3) {
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r1)
            r0.setText(r2)
            r0.setTextSize(r3)
            return r0
    }

    /* JADX INFO: renamed from: ι */
    public static java.lang.Class m3684(java.lang.Class r1, java.util.ArrayList r2) {
            java.lang.reflect.Field[] r0 = r1.getDeclaredFields()
            r0.getClass()
            p000.AbstractC0984xh.m6659(r2, r0)
            java.lang.Class r1 = r1.getSuperclass()
            return r1
    }

    /* JADX INFO: renamed from: κ */
    public static java.lang.ClassCastException m3685(int r0, java.util.ArrayList r1) {
            java.lang.Object r0 = r1.get(r0)
            r0.getClass()
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            return r0
    }

    /* JADX INFO: renamed from: λ */
    public static java.lang.String m3686(java.lang.String r1, int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    /* JADX INFO: renamed from: μ */
    public static java.lang.String m3687(java.lang.String r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    /* JADX INFO: renamed from: ν */
    public static java.lang.String m3688(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r2)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            return r1
    }

    /* JADX INFO: renamed from: ξ */
    public static java.lang.String m3689(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r3)
            r0.append(r4)
            r0.append(r5)
            java.lang.String r1 = r0.toString()
            return r1
    }

    /* JADX INFO: renamed from: ο */
    public static java.lang.String m3690(java.lang.String r0, java.lang.reflect.Method r1) {
            r0.getClass()
            java.lang.Class r0 = r1.getReturnType()
            java.lang.String r0 = r0.getName()
            return r0
    }

    /* JADX INFO: renamed from: π */
    public static java.lang.String m3691(java.lang.StringBuilder r0, java.lang.String r1, java.lang.String r2) {
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ρ */
    public static java.lang.String m3692(java.lang.StringBuilder r0, java.lang.String r1, java.lang.String r2, java.lang.reflect.Method r3) {
            r0.append(r1)
            r0.append(r2)
            java.lang.Class r1 = r3.getReturnType()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: σ */
    public static java.lang.String m3693(java.lang.StringBuilder r0, boolean r1, java.lang.String r2) {
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: τ */
    public static java.lang.String m3694(java.lang.reflect.Method r0) {
            r0.getClass()
            java.lang.Class r0 = r0.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            return r0
    }

    /* JADX INFO: renamed from: υ */
    public static java.lang.StringBuilder m3695(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r3)
            r0.append(r4)
            r0.append(r5)
            return r0
    }

    /* JADX INFO: renamed from: φ */
    public static java.util.ArrayList m3696(java.lang.Object r1) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r1)
            return r0
    }

    /* JADX INFO: renamed from: χ */
    public static /* synthetic */ void m3697(android.database.Cursor r5) {
            boolean r0 = r5 instanceof java.lang.AutoCloseable
            if (r0 == 0) goto L8
            r5.close()
            return
        L8:
            boolean r0 = r5 instanceof java.util.concurrent.ExecutorService
            if (r0 == 0) goto L3b
            java.util.concurrent.ExecutorService r5 = (java.util.concurrent.ExecutorService) r5
            java.util.concurrent.ForkJoinPool r0 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r5 != r0) goto L15
            goto L3a
        L15:
            boolean r0 = r5.isTerminated()
            if (r0 != 0) goto L3a
            r5.shutdown()
            r1 = 0
        L1f:
            if (r0 != 0) goto L31
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.InterruptedException -> L2a
            r3 = 1
            boolean r0 = r5.awaitTermination(r3, r2)     // Catch: java.lang.InterruptedException -> L2a
            goto L1f
        L2a:
            if (r1 != 0) goto L1f
            r5.shutdownNow()
            r1 = 1
            goto L1f
        L31:
            if (r1 == 0) goto L3a
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
        L3a:
            return
        L3b:
            boolean r0 = r5 instanceof android.content.res.TypedArray
            if (r0 == 0) goto L45
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r5.recycle()
            return
        L45:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
    }

    /* JADX INFO: renamed from: ψ */
    public static /* synthetic */ void m3698(java.lang.Object r0) {
            if (r0 != 0) goto L3
            return
        L3:
            p000.C1080.m7264()
            return
    }

    /* JADX INFO: renamed from: ω */
    public static void m3699(java.lang.String r0, android.widget.TextView r1, android.graphics.Typeface r2, int r3) {
            int r0 = android.graphics.Color.parseColor(r0)
            r1.setTextColor(r0)
            r1.setTypeface(r2, r3)
            return
    }
}
