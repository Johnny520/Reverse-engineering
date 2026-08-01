package defpackage;

/* JADX INFO: renamed from: ᛵᛳᲈᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0858 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final defpackage.ViewTreeObserverOnGlobalLayoutListenerC2320 f3910 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static java.util.WeakHashMap f3911;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C0683 f3912 = null;

    static {
            ᛴᛵᲈᛸ r0 = new ᛴᛵᲈᛸ
            r0.<init>()
            defpackage.AbstractC0858.f3912 = r0
            ᲈᲀᛳᛴ r0 = new ᲈᲀᛳᛴ
            r0.<init>()
            defpackage.AbstractC0858.f3910 = r0
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static void m1812(android.view.View r2, java.lang.CharSequence r3) {
            defpackage.AbstractC0181.m717(r2, r3)
            ᲈᲀᛳᛴ r0 = defpackage.AbstractC0858.f3910
            if (r3 == 0) goto L30
            java.util.WeakHashMap r3 = r0.f9804
            boolean r1 = r2.isShown()
            if (r1 == 0) goto L17
            int r1 = r2.getWindowVisibility()
            if (r1 != 0) goto L17
            r1 = 1
            goto L18
        L17:
            r1 = 0
        L18:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r3.put(r2, r1)
            r2.addOnAttachStateChangeListener(r0)
            boolean r3 = r2.isAttachedToWindow()
            if (r3 == 0) goto L3f
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
            r2.addOnGlobalLayoutListener(r0)
            goto L3f
        L30:
            java.util.WeakHashMap r3 = r0.f9804
            r3.remove(r2)
            r2.removeOnAttachStateChangeListener(r0)
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
            r2.removeOnGlobalLayoutListener(r0)
        L3f:
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static void m1813(android.view.View r1, defpackage.C1195 r2) {
            if (r2 != 0) goto Lf
            android.view.View$AccessibilityDelegate r0 = defpackage.AbstractC0756.m1675(r1)
            boolean r0 = r0 instanceof defpackage.C0256
            if (r0 == 0) goto Lf
            ᛶᲈᲈᛸ r2 = new ᛶᲈᲈᛸ
            r2.<init>()
        Lf:
            int r0 = r1.getImportantForAccessibility()
            if (r0 != 0) goto L19
            r0 = 1
            r1.setImportantForAccessibility(r0)
        L19:
            if (r2 != 0) goto L1d
            r2 = 0
            goto L1f
        L1d:
            ᛲᛲᛸᲈ r2 = r2.f5397
        L1f:
            r1.setAccessibilityDelegate(r2)
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static defpackage.C0406 m1814(android.view.View r3, defpackage.C0406 r4) {
            r0 = 3
            java.lang.String r1 = "ViewCompat"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L3b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "performReceiveContent: "
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r2 = ", view="
            r0.append(r2)
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r0.append(r2)
            java.lang.String r2 = "["
            r0.append(r2)
            int r2 = r3.getId()
            r0.append(r2)
            java.lang.String r2 = "]"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L3b:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L46
            ᛳᛱᛴᛸ r3 = defpackage.AbstractC1213.m2351(r3, r4)
            return r3
        L46:
            r0 = 1711866857(0x660903e9, float:1.6175908E23)
            java.lang.Object r0 = r3.getTag(r0)
            ᛵᲇᲁᲁ r0 = (defpackage.C0986) r0
            ᛴᛵᲈᛸ r1 = defpackage.AbstractC0858.f3912
            if (r0 == 0) goto L67
            ᛳᛱᛴᛸ r4 = defpackage.C0986.m1929(r3, r4)
            if (r4 != 0) goto L5b
            r3 = 0
            return r3
        L5b:
            boolean r0 = r3 instanceof defpackage.InterfaceC0895
            if (r0 == 0) goto L62
            r1 = r3
            ᛵᛵᲀᛳ r1 = (defpackage.InterfaceC0895) r1
        L62:
            ᛳᛱᛴᛸ r3 = r1.mo1568(r4)
            return r3
        L67:
            boolean r0 = r3 instanceof defpackage.InterfaceC0895
            if (r0 == 0) goto L6e
            r1 = r3
            ᛵᛵᲀᛳ r1 = (defpackage.InterfaceC0895) r1
        L6e:
            ᛳᛱᛴᛸ r3 = r1.mo1568(r4)
            return r3
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static defpackage.C2136 m1815(android.view.View r2) {
            java.util.WeakHashMap r0 = defpackage.AbstractC0858.f3911
            if (r0 != 0) goto Lb
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            defpackage.AbstractC0858.f3911 = r0
        Lb:
            java.lang.Object r0 = r0.get(r2)
            ᲇᲇᛱᛳ r0 = (defpackage.C2136) r0
            if (r0 != 0) goto L1d
            ᲇᲇᛱᛳ r0 = new ᲇᲇᛱᛳ
            r0.<init>(r2)
            java.util.WeakHashMap r1 = defpackage.AbstractC0858.f3911
            r1.put(r2, r0)
        L1d:
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static java.lang.String[] m1816(defpackage.C2015 r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            java.lang.String[] r2 = defpackage.AbstractC1213.m2350(r2)
            return r2
        Lb:
            r0 = 1711866858(0x660903ea, float:1.617591E23)
            java.lang.Object r2 = r2.getTag(r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            return r2
    }
}
