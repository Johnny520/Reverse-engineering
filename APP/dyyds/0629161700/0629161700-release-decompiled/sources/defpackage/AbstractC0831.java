package defpackage;

/* JADX INFO: renamed from: ᛵᛲᛷᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0831 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.util.LinkedHashMap f3836 = null;

    static {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            defpackage.AbstractC0831.f3836 = r0
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static void m1762() {
            java.util.LinkedHashMap r0 = defpackage.AbstractC0831.f3836
            java.util.Set r1 = r0.entrySet()
            r2 = -340208939081262(0xfffeca94ef0961d2, double:NaN)
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L3a
            java.util.Collection r0 = r0.values()
            r1 = -339934061174318(0xfffecad4ef0961d2, double:NaN)
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L2f
            return
        L2f:
            java.lang.Object r0 = r0.next()
            r0.getClass()
            defpackage.C2264.m3679()
            return
        L3a:
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r1 = -340801644568110(0xfffeca0aef0961d2, double:NaN)
            r0.getValue()
            r0 = -340848889208366(0xfffec9ffef0961d2, double:NaN)
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static boolean m1763(int r2) {
            int r0 = android.graphics.Color.alpha(r2)
            r1 = 255(0xff, float:3.57E-43)
            if (r0 != r1) goto L1c
            int r0 = android.graphics.Color.red(r2)
            if (r0 != 0) goto L1c
            int r0 = android.graphics.Color.green(r2)
            if (r0 != 0) goto L1c
            int r2 = android.graphics.Color.blue(r2)
            if (r2 != 0) goto L1c
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static java.lang.String m1764(boolean r2) {
            if (r2 == 0) goto L16
            ᛶᲀᛵ r2 = defpackage.C1141.f5173
            r2.getClass()
            ᲀᲇᛸᛶ r2 = defpackage.C1141.f5114
            ᲁᛷᛶᛶ[] r0 = defpackage.C1141.f5221
            r1 = 123(0x7b, float:1.72E-43)
            r0 = r0[r1]
            java.lang.Object r2 = r2.m3169(r0)
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L16:
            ᛶᲀᛵ r2 = defpackage.C1141.f5173
            r2.getClass()
            ᲀᲇᛸᛶ r2 = defpackage.C1141.f5158
            ᲁᛷᛶᛶ[] r0 = defpackage.C1141.f5221
            r1 = 124(0x7c, float:1.74E-43)
            r0 = r0[r1]
            java.lang.Object r2 = r2.m3169(r0)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static kotlin.Pair m1765(int r5, defpackage.InterfaceC0598 r6) {
            r0 = -1
            r1 = 1
            r2 = r0
            r3 = r2
        L4:
            if (r1 >= r5) goto L22
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.Object r4 = r6.mo617(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            boolean r4 = m1763(r4)
            if (r4 == 0) goto L1f
            if (r2 != r0) goto L1e
            int r2 = r1 + (-1)
        L1e:
            r3 = r1
        L1f:
            int r1 = r1 + 1
            goto L4
        L22:
            if (r2 < 0) goto L34
            if (r3 < 0) goto L34
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r5, r6)
            return r0
        L34:
            r5 = 0
            return r5
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static kotlin.Pair m1766(android.graphics.Bitmap r6, boolean r7) {
            r0 = 1
            if (r7 == 0) goto L9
            int r1 = r6.getWidth()
        L7:
            int r1 = r1 - r0
            goto Le
        L9:
            int r1 = r6.getHeight()
            goto L7
        Le:
            r2 = -1
            r3 = r2
            r4 = r3
        L11:
            if (r0 >= r1) goto L2d
            r5 = 0
            if (r7 == 0) goto L1b
            int r5 = r6.getPixel(r0, r5)
            goto L1f
        L1b:
            int r5 = r6.getPixel(r5, r0)
        L1f:
            boolean r5 = m1763(r5)
            if (r5 == 0) goto L2a
            if (r3 != r2) goto L29
            int r3 = r0 + (-1)
        L29:
            r4 = r0
        L2a:
            int r0 = r0 + 1
            goto L11
        L2d:
            if (r3 < 0) goto L3f
            if (r4 < 0) goto L3f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r6, r7)
            return r0
        L3f:
            r6 = 0
            return r6
    }
}
