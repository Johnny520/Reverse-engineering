package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xh {
    public static final int f = 0;
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    static {
            r0 = 4617428107952285287(0x4014666666666667, double:5.1000000000000005)
            long r0 = java.lang.Math.round(r0)
            int r0 = (int) r0
            defpackage.xh.f = r0
            return
    }

    public xh(android.content.Context r6) {
            r5 = this;
            r0 = 2130968965(0x7f040185, float:1.7546599E38)
            r1 = 0
            boolean r0 = defpackage.gt.z(r6, r0, r1)
            r2 = 2130968964(0x7f040184, float:1.7546597E38)
            int r2 = defpackage.zt.j(r6, r2, r1)
            r3 = 2130968963(0x7f040183, float:1.7546594E38)
            int r3 = defpackage.zt.j(r6, r3, r1)
            r4 = 2130968841(0x7f040109, float:1.7546347E38)
            int r1 = defpackage.zt.j(r6, r4, r1)
            android.content.res.Resources r6 = r6.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            r5.<init>()
            r5.a = r0
            r5.b = r2
            r5.c = r3
            r5.d = r1
            r5.e = r6
            return
    }
}
