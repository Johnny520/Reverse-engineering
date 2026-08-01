package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class b92 {

    /* JADX INFO: renamed from: α */
    public static java.util.WeakHashMap f1572;

    /* JADX INFO: renamed from: β */
    public static final p000.p82 f1573 = null;

    /* JADX INFO: renamed from: γ */
    public static final p000.r82 f1574 = null;

    static {
            p82 r0 = new p82
            r0.<init>()
            p000.b92.f1573 = r0
            r82 r0 = new r82
            r0.<init>()
            p000.b92.f1574 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.x92 m823(android.view.View r2) {
            java.util.WeakHashMap r0 = p000.b92.f1572
            if (r0 != 0) goto Lb
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            p000.b92.f1572 = r0
        Lb:
            java.util.WeakHashMap r0 = p000.b92.f1572
            java.lang.Object r0 = r0.get(r2)
            x92 r0 = (p000.x92) r0
            if (r0 != 0) goto L1f
            x92 r0 = new x92
            r0.<init>(r2)
            java.util.WeakHashMap r1 = p000.b92.f1572
            r1.put(r2, r0)
        L1f:
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static p000.oc2 m824(android.view.View r2, p000.oc2 r3) {
            android.view.WindowInsets r0 = r3.m4226()
            if (r0 == 0) goto L15
            android.view.WindowInsets r1 = p000.z82.m7116(r2, r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            oc2 r2 = p000.oc2.m4220(r2, r1)
            return r2
        L15:
            return r3
    }

    /* JADX INFO: renamed from: γ */
    public static java.lang.String[] m825(androidx.appcompat.widget.AppCompatEditText r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            java.lang.String[] r2 = p000.a92.m51(r2)
            return r2
        Lb:
            r0 = 2131296990(0x7f0902de, float:1.8211912E38)
            java.lang.Object r2 = r2.getTag(r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            return r2
    }

    /* JADX INFO: renamed from: δ */
    public static p000.oc2 m826(android.view.View r2, p000.oc2 r3) {
            android.view.WindowInsets r0 = r3.m4226()
            if (r0 == 0) goto L15
            android.view.WindowInsets r1 = p000.s82.m5375(r2, r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            oc2 r2 = p000.oc2.m4220(r2, r1)
            return r2
        L15:
            return r3
    }

    /* JADX INFO: renamed from: ε */
    public static p000.C0367hp m827(android.view.View r3, p000.C0367hp r4) {
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
            hp r3 = p000.a92.m52(r3, r4)
            return r3
        L46:
            r0 = 2131296989(0x7f0902dd, float:1.821191E38)
            java.lang.Object r0 = r3.getTag(r0)
            a42 r0 = (p000.a42) r0
            p82 r1 = p000.b92.f1573
            if (r0 == 0) goto L67
            hp r4 = p000.a42.m32(r3, r4)
            if (r4 != 0) goto L5b
            r3 = 0
            return r3
        L5b:
            boolean r0 = r3 instanceof p000.g51
            if (r0 == 0) goto L62
            r1 = r3
            g51 r1 = (p000.g51) r1
        L62:
            hp r3 = r1.mo270(r4)
            return r3
        L67:
            boolean r0 = r3 instanceof p000.g51
            if (r0 == 0) goto L6e
            r1 = r3
            g51 r1 = (p000.g51) r1
        L6e:
            hp r3 = r1.mo270(r4)
            return r3
    }

    /* JADX INFO: renamed from: ζ */
    public static void m828(android.view.View r1, androidx.core.view.C0045 r2) {
            if (r2 != 0) goto Lf
            android.view.View$AccessibilityDelegate r0 = p000.y82.m6839(r1)
            boolean r0 = r0 instanceof p000.C1116
            if (r0 == 0) goto Lf
            androidx.core.view.α r2 = new androidx.core.view.α
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
            о r2 = r2.f1027
        L1f:
            r1.setAccessibilityDelegate(r2)
            return
    }

    /* JADX INFO: renamed from: η */
    public static void m829(android.view.View r6, java.lang.CharSequence r7) {
            q82 r0 = new q82
            r4 = 28
            r5 = 0
            r1 = 2131296986(0x7f0902da, float:1.8211904E38)
            java.lang.Class<java.lang.CharSequence> r2 = java.lang.CharSequence.class
            r3 = 8
            r0.<init>(r1, r2, r3, r4, r5)
            r0.m7043(r6, r7)
            r82 r0 = p000.b92.f1574
            if (r7 == 0) goto L3f
            java.util.WeakHashMap r7 = r0.f9290
            boolean r1 = r6.isShown()
            if (r1 == 0) goto L26
            int r1 = r6.getWindowVisibility()
            if (r1 != 0) goto L26
            r1 = 1
            goto L27
        L26:
            r1 = 0
        L27:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r7.put(r6, r1)
            r6.addOnAttachStateChangeListener(r0)
            boolean r7 = r6.isAttachedToWindow()
            if (r7 == 0) goto L3e
            android.view.ViewTreeObserver r6 = r6.getViewTreeObserver()
            r6.addOnGlobalLayoutListener(r0)
        L3e:
            return
        L3f:
            java.util.WeakHashMap r7 = r0.f9290
            r7.remove(r6)
            r6.removeOnAttachStateChangeListener(r0)
            android.view.ViewTreeObserver r6 = r6.getViewTreeObserver()
            r6.removeOnGlobalLayoutListener(r0)
            return
    }
}
