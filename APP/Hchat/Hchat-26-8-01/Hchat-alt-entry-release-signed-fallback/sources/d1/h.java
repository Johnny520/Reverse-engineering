package d1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f1921a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final android.graphics.Rect f1922b = null;

    static {
            r0 = 2
            int[] r0 = new int[r0]
            d1.h.f1921a = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            d1.h.f1922b = r0
            return
    }

    public static final e1.c a(android.view.View r5, android.view.View r6) {
            int[] r0 = d1.h.f1921a
            r5.getLocationInWindow(r0)
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            r4 = r0[r3]
            r6.getLocationInWindow(r0)
            r6 = r0[r1]
            r0 = r0[r3]
            int r2 = r2 - r6
            float r6 = (float) r2
            int r4 = r4 - r0
            float r0 = (float) r4
            android.graphics.Rect r1 = d1.h.f1922b
            r5.getFocusedRect(r1)
            e1.c r5 = new e1.c
            int r2 = r1.left
            float r2 = (float) r2
            float r6 = r6 + r2
            int r2 = r1.top
            float r2 = (float) r2
            float r2 = r2 + r0
            int r3 = r1.width()
            float r3 = (float) r3
            float r3 = r3 + r6
            int r4 = r1.top
            float r4 = (float) r4
            float r0 = r0 + r4
            int r1 = r1.height()
            float r1 = (float) r1
            float r0 = r0 + r1
            r5.<init>(r6, r2, r3, r0)
            return r5
    }

    public static final boolean b(android.view.View r3, java.lang.Integer r4, android.graphics.Rect r5) {
            if (r4 != 0) goto L7
            boolean r3 = r3.requestFocus()
            return r3
        L7:
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 != 0) goto L14
            int r4 = r4.intValue()
            boolean r3 = r3.requestFocus(r4, r5)
            return r3
        L14:
            r0 = r3
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            boolean r1 = r0.isFocused()
            if (r1 == 0) goto L1f
            r3 = 1
            return r3
        L1f:
            boolean r1 = r0.isFocusable()
            if (r1 == 0) goto L34
            boolean r1 = r0.hasFocus()
            if (r1 != 0) goto L34
            int r3 = r4.intValue()
            boolean r3 = r0.requestFocus(r3, r5)
            return r3
        L34:
            boolean r1 = r3 instanceof y1.t
            if (r1 == 0) goto L43
            y1.t r3 = (y1.t) r3
            int r4 = r4.intValue()
            boolean r3 = r3.requestFocus(r4, r5)
            return r3
        L43:
            if (r5 == 0) goto L65
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            int r1 = r4.intValue()
            android.view.View r3 = r3.findNextFocusFromRect(r0, r5, r1)
            if (r3 == 0) goto L5c
            int r4 = r4.intValue()
            boolean r3 = r3.requestFocus(r4, r5)
            return r3
        L5c:
            int r3 = r4.intValue()
            boolean r3 = r0.requestFocus(r3, r5)
            return r3
        L65:
            boolean r5 = r0.hasFocus()
            if (r5 == 0) goto L70
            android.view.View r5 = r0.findFocus()
            goto L71
        L70:
            r5 = 0
        L71:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            int r2 = r4.intValue()
            android.view.View r5 = r1.findNextFocus(r0, r5, r2)
            if (r5 == 0) goto L88
            int r3 = r4.intValue()
            boolean r3 = r5.requestFocus(r3)
            return r3
        L88:
            int r4 = r4.intValue()
            boolean r3 = r3.requestFocus(r4)
            return r3
    }

    public static final java.lang.Integer c(int r2) {
            r0 = 5
            if (r2 != r0) goto La
            r2 = 33
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        La:
            r0 = 6
            if (r2 != r0) goto L14
            r2 = 130(0x82, float:1.82E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L14:
            r0 = 3
            if (r2 != r0) goto L1e
            r2 = 17
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L1e:
            r0 = 4
            if (r2 != r0) goto L28
            r2 = 66
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L28:
            r0 = 2
            r1 = 1
            if (r2 != r1) goto L31
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L31:
            if (r2 != r0) goto L38
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            return r2
        L38:
            r2 = 0
            return r2
    }

    public static final d1.f d(int r2) {
            r0 = 2
            r1 = 1
            if (r2 == r1) goto L3a
            if (r2 == r0) goto L34
            r0 = 17
            if (r2 == r0) goto L2d
            r0 = 33
            if (r2 == r0) goto L26
            r0 = 66
            if (r2 == r0) goto L1f
            r0 = 130(0x82, float:1.82E-43)
            if (r2 == r0) goto L18
            r2 = 0
            return r2
        L18:
            d1.f r2 = new d1.f
            r0 = 6
            r2.<init>(r0)
            return r2
        L1f:
            d1.f r2 = new d1.f
            r0 = 4
            r2.<init>(r0)
            return r2
        L26:
            d1.f r2 = new d1.f
            r0 = 5
            r2.<init>(r0)
            return r2
        L2d:
            d1.f r2 = new d1.f
            r0 = 3
            r2.<init>(r0)
            return r2
        L34:
            d1.f r2 = new d1.f
            r2.<init>(r1)
            return r2
        L3a:
            d1.f r2 = new d1.f
            r2.<init>(r0)
            return r2
    }
}
