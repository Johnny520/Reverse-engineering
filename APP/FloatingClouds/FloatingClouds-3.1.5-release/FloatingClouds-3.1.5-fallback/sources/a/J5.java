package a;

/* JADX INFO: loaded from: classes.dex */
public final class J5 {
    public static final int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f134a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    static {
            r0 = 4617428107952285287(0x4014666666666667, double:5.1000000000000005)
            long r0 = java.lang.Math.round(r0)
            int r0 = (int) r0
            a.J5.f = r0
            return
    }

    public J5(android.content.Context r6) {
            r5 = this;
            int r0 = com.google.android.material.R.attr.elevationOverlayEnabled
            r1 = 0
            boolean r0 = a.C0498za.b(r6, r0, r1)
            int r2 = com.google.android.material.R.attr.elevationOverlayColor
            int r2 = a.Na.a(r6, r2, r1)
            int r3 = com.google.android.material.R.attr.elevationOverlayAccentColor
            int r3 = a.Na.a(r6, r3, r1)
            int r4 = com.google.android.material.R.attr.colorSurface
            int r1 = a.Na.a(r6, r4, r1)
            android.content.res.Resources r6 = r6.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            r5.<init>()
            r5.f134a = r0
            r5.b = r2
            r5.c = r3
            r5.d = r1
            r5.e = r6
            return
    }
}
