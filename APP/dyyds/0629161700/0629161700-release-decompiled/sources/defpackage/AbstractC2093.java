package defpackage;

/* JADX INFO: renamed from: ᲇᛷᛸᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2093 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final int f8941 = 0;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final int f8942 = 0;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.util.LinkedHashMap f8943 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final int f8944 = 0;

    static {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            defpackage.AbstractC2093.f8943 = r0
            r0 = -444396255747630(0xfffe6bd2ef0961d2, double:NaN)
            java.lang.String r0 = "dp_hidden_by_us"
            int r0 = r0.hashCode()
            defpackage.AbstractC2093.f8944 = r0
            r0 = -444464975224366(0xfffe6bc2ef0961d2, double:NaN)
            java.lang.String r0 = "dp_saved_clickable"
            int r0 = r0.hashCode()
            defpackage.AbstractC2093.f8942 = r0
            r0 = -444546579602990(0xfffe6bafef0961d2, double:NaN)
            java.lang.String r0 = "dp_saved_focusable"
            int r0 = r0.hashCode()
            defpackage.AbstractC2093.f8941 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static native void m3507(android.view.View r0, defpackage.C1470 r1);

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static int m3508(android.view.MotionEvent r7, android.content.Context r8) {
            r0 = -442373326151214(0xfffe6da9ef0961d2, double:NaN)
            r0 = -442403390922286(0xfffe6da2ef0961d2, double:NaN)
            android.content.res.Resources r0 = r8.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            android.content.res.Resources r8 = r8.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            int r8 = r8.heightPixels
            ᛶᲀᛵ r1 = defpackage.C1141.f5173
            r1.getClass()
            int r1 = defpackage.C1141.m2191()
            r2 = 9
            r3 = 1
            r4 = 0
            r5 = 3
            r6 = 2
            if (r1 != r2) goto L6d
            float r1 = r7.getRawX()
            int r2 = r0 / 3
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L42
            r0 = r4
            goto L50
        L42:
            float r1 = r7.getRawX()
            int r0 = r0 * r6
            int r0 = r0 / r5
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L4f
            r0 = r3
            goto L50
        L4f:
            r0 = r6
        L50:
            float r1 = r7.getRawY()
            int r2 = r8 / 3
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L5d
            r3 = r4
            goto L6a
        L5d:
            float r7 = r7.getRawY()
            int r8 = r8 * r6
            int r8 = r8 / r5
            float r8 = (float) r8
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L69
            goto L6a
        L69:
            r3 = r6
        L6a:
            int r3 = r3 * r5
            int r3 = r3 + r0
            return r3
        L6d:
            float r1 = r7.getRawX()
            int r0 = r0 / r6
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L79
            r0 = r3
            goto L7a
        L79:
            r0 = r4
        L7a:
            float r7 = r7.getRawY()
            int r8 = r8 / r6
            float r8 = (float) r8
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L86
            r7 = r3
            goto L87
        L86:
            r7 = r4
        L87:
            if (r0 == 0) goto L8c
            if (r7 == 0) goto L8c
            return r4
        L8c:
            if (r0 != 0) goto L91
            if (r7 == 0) goto L91
            return r3
        L91:
            if (r0 == 0) goto L96
            if (r7 != 0) goto L96
            return r6
        L96:
            return r5
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static void m3509(android.view.View r3) {
            int r0 = java.lang.System.identityHashCode(r3)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.util.LinkedHashMap r1 = defpackage.AbstractC2093.f8943
            java.lang.Object r2 = r1.get(r0)
            android.view.ViewTreeObserver$OnDrawListener r2 = (android.view.ViewTreeObserver.OnDrawListener) r2
            android.view.ViewTreeObserver r3 = r3.getViewTreeObserver()
            r3.removeOnDrawListener(r2)
            r1.remove(r0)
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static int m3510(int r1) {
            float r1 = (float) r1
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            int r1 = (int) r1
            return r1
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static android.view.View m3511(android.view.View r5) {
            r0 = -441308174261806(0xfffe6ea1ef0961d2, double:NaN)
            java.lang.Class<android.widget.SeekBar> r0 = android.widget.SeekBar.class
            boolean r0 = r0.isInstance(r5)
            if (r0 == 0) goto L11
            return r5
        L11:
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L34
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r0 = r5.getChildCount()
            r1 = 0
        L1c:
            if (r1 >= r0) goto L34
            android.view.View r2 = r5.getChildAt(r1)
            r3 = -441338239032878(0xfffe6e9aef0961d2, double:NaN)
            android.view.View r2 = m3511(r2)
            if (r2 == 0) goto L31
            return r2
        L31:
            int r1 = r1 + 1
            goto L1c
        L34:
            r5 = 0
            return r5
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static void m3512(android.app.Activity r2, boolean r3) {
            if (r2 == 0) goto L21
            android.view.Window r2 = r2.getWindow()
            r0 = -442562304712238(0xfffe6d7def0961d2, double:NaN)
            r0 = -442532239941166(0xfffe6d84ef0961d2, double:NaN)
            r0 = 8192(0x2000, float:1.148E-41)
            if (r3 == 0) goto L1e
            r2.addFlags(r0)
            return
        L1e:
            r2.clearFlags(r0)
        L21:
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static int m3513(android.content.Context r2, int r3) {
            r0 = -442149987851822(0xfffe6dddef0961d2, double:NaN)
            float r3 = (float) r3
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r3 = r3 * r2
            int r2 = (int) r3
            return r2
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m3514(android.view.View r5) {
            m3509(r5)
            r0 = r5
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = java.lang.System.identityHashCode(r5)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            ᛸᛱᛴᲁ r2 = new ᛸᛱᛴᲁ
            r2.<init>()
            ᛸᛱᛴᲁ r3 = new ᛸᛱᛴᲁ
            r3.<init>()
            ᲀᲇᛵ r4 = new ᲀᲇᛵ
            r4.<init>(r5, r3, r0, r2)
            java.util.LinkedHashMap r5 = defpackage.AbstractC2093.f8943
            r5.putIfAbsent(r1, r4)
            java.lang.Object r5 = r5.get(r1)
            android.view.ViewTreeObserver$OnDrawListener r5 = (android.view.ViewTreeObserver.OnDrawListener) r5
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.addOnDrawListener(r5)
            return
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static android.view.ViewGroup m3515(android.view.View r2) {
            r0 = 0
            if (r2 == 0) goto L11
            android.view.ViewParent r2 = r2.getParent()
            if (r2 == 0) goto L11
            boolean r1 = r2 instanceof android.view.ViewGroup
            if (r1 != 0) goto Le
            goto Lf
        Le:
            r0 = r2
        Lf:
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L11:
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static boolean m3516(android.content.Context r7, android.view.View r8) {
            r0 = -442764168175150(0xfffe6d4eef0961d2, double:NaN)
            r0 = -442798527913518(0xfffe6d46ef0961d2, double:NaN)
            java.lang.Object r0 = defpackage.AbstractC1171.m2267()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L40
            int r3 = defpackage.AbstractC0233.f1405
            ᛶᲈᛱᲈ r0 = defpackage.AbstractC2279.m3695(r0)
            ᛶᛶᛲᛱ r0 = r0.m2298()
            r3 = -445328263650862(0xfffe6af9ef0961d2, double:NaN)
            java.lang.String r3 = "getCurUser"
            r0.f4431 = r3
            java.util.List r0 = r0.mo1885()
            java.lang.Object r0 = defpackage.AbstractC1107.m2122(r0)
            ᛱᲁᛲᲁ r0 = (defpackage.C0178) r0
            if (r0 == 0) goto L40
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.Object r0 = r0.m715(r3)
            goto L41
        L40:
            r0 = r2
        L41:
            if (r0 == 0) goto L6b
            int r3 = defpackage.AbstractC0233.f1405
            ᛶᲈᛱᲈ r0 = defpackage.AbstractC2279.m3695(r0)
            ᛵᛷᛶᲇ r0 = r0.m2300()
            r3 = -445289608945198(0xfffe6b02ef0961d2, double:NaN)
            java.lang.String r3 = "uniqueId"
            r0.f4431 = r3
            java.util.List r0 = r0.mo1885()
            java.lang.Object r0 = defpackage.AbstractC1107.m2122(r0)
            ᲀᛳᲇᲁ r0 = (defpackage.C1652) r0
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r0.m3037()
            java.lang.String r0 = (java.lang.String) r0
            goto L6c
        L6b:
            r0 = r2
        L6c:
            java.lang.String r3 = defpackage.AbstractC1171.m2252()
            java.lang.String r4 = defpackage.AbstractC1171.m2252()
            r5 = -445281019010606(0xfffe6b04ef0961d2, double:NaN)
            java.lang.String r5 = "0"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L92
            ᛲᲈᛶᲈ r8 = defpackage.C1836.f8024
            r2 = -442820002749998(0xfffe6d41ef0961d2, double:NaN)
            java.lang.String r8 = "请先登录抖音"
            defpackage.C1836.m3231(r7, r8)
            return r1
        L92:
            if (r0 != 0) goto L9d
            r0 = -442850067521070(0xfffe6d3aef0961d2, double:NaN)
            java.lang.String r0 = ""
        L9d:
            r4 = -442626729221678(0xfffe6d6eef0961d2, double:NaN)
            r4 = -442656793992750(0xfffe6d67ef0961d2, double:NaN)
            r4 = -442691153731118(0xfffe6d5fef0961d2, double:NaN)
            r4 = -442729808436782(0xfffe6d56ef0961d2, double:NaN)
            r7 = 1711867112(0x660904e8, float:1.6176368E23)
            java.lang.Object r1 = r8.getTag(r7)
            boolean r4 = r1 instanceof defpackage.C1441
            if (r4 == 0) goto Lcb
            r2 = r1
            ᛸᛲᲀᛱ r2 = (defpackage.C1441) r2
        Lcb:
            r1 = 1
            if (r2 == 0) goto Lf4
            r4 = -388011925085742(0xfffe9f1aef0961d2, double:NaN)
            r4 = -388050579791406(0xfffe9f11ef0961d2, double:NaN)
            java.lang.String r4 = r2.f6328
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto Lf4
            java.lang.String r4 = r2.f6329
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto Lf4
            ᛶᲇᲀᲇ r7 = r2.f6327
            r7.m2286(r8)
            return r1
        Lf4:
            if (r2 == 0) goto L104
            android.view.ViewOverlay r4 = r8.getOverlay()
            ᛶᲇᲀᲇ r5 = r2.f6327
            r4.remove(r5)
            ᛶᛱᛷᛶ r2 = r2.f6326
            r8.removeOnLayoutChangeListener(r2)
        L104:
            ᛶᲇᲀᲇ r2 = new ᛶᲇᲀᲇ
            r2.<init>(r0, r3)
            ᛶᛱᛷᛶ r4 = new ᛶᛱᛷᛶ
            r4.<init>(r2)
            ᛸᛲᲀᛱ r5 = new ᛸᛲᲀᛱ
            r5.<init>(r0, r3, r2, r4)
            r8.setTag(r7, r5)
            r8.addOnLayoutChangeListener(r4)
            r2.m2286(r8)
            android.view.ViewOverlay r7 = r8.getOverlay()
            r7.add(r2)
            ᛸᛳᛴᲁ r7 = new ᛸᛳᛴᲁ
            r0 = 12
            r7.<init>(r2, r0, r8)
            r8.post(r7)
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static android.view.View m3517(android.view.ViewGroup r4, java.lang.String r5) {
            r0 = -442489290268206(0xfffe6d8eef0961d2, double:NaN)
            if (r4 != 0) goto Lb
            goto L35
        Lb:
            int r0 = r4.getChildCount()
            r1 = 0
        L10:
            if (r1 >= r0) goto L35
            android.view.View r2 = r4.getChildAt(r1)
            java.lang.Class r3 = r2.getClass()
            java.lang.String r3 = r3.getName()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L25
            return r2
        L25:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L32
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r2 = m3517(r2, r5)
            if (r2 == 0) goto L32
            return r2
        L32:
            int r1 = r1 + 1
            goto L10
        L35:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static android.view.View m3518(android.view.View r4, java.lang.String r5) {
            r0 = -441797800533550(0xfffe6e2fef0961d2, double:NaN)
            r0 = 0
            if (r4 == 0) goto L31
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto L31
            android.content.res.Resources r1 = r1.getResources()
            if (r1 == 0) goto L31
            r2 = -441827865304622(0xfffe6e28ef0961d2, double:NaN)
            java.lang.String r2 = "id"
            android.content.Context r3 = r4.getContext()
            java.lang.String r3 = r3.getPackageName()
            int r5 = r1.getIdentifier(r5, r2, r3)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L32
        L31:
            r5 = r0
        L32:
            if (r5 == 0) goto L44
            int r1 = r5.intValue()
            if (r1 != 0) goto L3b
            goto L44
        L3b:
            int r5 = r5.intValue()
            android.view.View r4 = r4.findViewById(r5)
            return r4
        L44:
            return r0
    }
}
