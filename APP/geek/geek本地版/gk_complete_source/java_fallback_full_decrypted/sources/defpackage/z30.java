package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class z30 {
    static {
            return
    }

    public static final void a(android.view.View r4, int r5) {
            int r5 = t(r5)
            java.lang.String r0 = "FragmentManager"
            r1 = 2
            if (r5 == 0) goto L73
            r2 = 1
            java.lang.String r3 = "SpecialEffectsController: Setting view "
            if (r5 == r2) goto L54
            if (r5 == r1) goto L34
            r2 = 3
            if (r5 == r2) goto L15
            goto L9d
        L15:
            boolean r5 = defpackage.yl.A(r1)
            if (r5 == 0) goto L2f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            r5.append(r4)
            java.lang.String r1 = " to INVISIBLE"
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r0, r5)
        L2f:
            r5 = 4
            r4.setVisibility(r5)
            return
        L34:
            boolean r5 = defpackage.yl.A(r1)
            if (r5 == 0) goto L4e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            r5.append(r4)
            java.lang.String r1 = " to GONE"
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r0, r5)
        L4e:
            r5 = 8
            r4.setVisibility(r5)
            return
        L54:
            boolean r5 = defpackage.yl.A(r1)
            if (r5 == 0) goto L6e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            r5.append(r4)
            java.lang.String r1 = " to VISIBLE"
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r0, r5)
        L6e:
            r5 = 0
            r4.setVisibility(r5)
            return
        L73:
            android.view.ViewParent r5 = r4.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r5 == 0) goto L9d
            boolean r1 = defpackage.yl.A(r1)
            if (r1 == 0) goto L9a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "SpecialEffectsController: Removing view "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = " from container "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L9a:
            r5.removeView(r4)
        L9d:
            return
    }

    public static int b(int r3) {
            if (r3 == 0) goto L20
            r0 = 4
            if (r3 == r0) goto L1f
            r0 = 8
            if (r3 != r0) goto Lb
            r3 = 3
            return r3
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown visibility "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L1f:
            return r0
        L20:
            r3 = 2
            return r3
    }

    public static int c(android.view.View r2) {
            float r0 = r2.getAlpha()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L11
            int r0 = r2.getVisibility()
            if (r0 != 0) goto L11
            r2 = 4
            return r2
        L11:
            int r2 = r2.getVisibility()
            int r2 = b(r2)
            return r2
    }

    public static int d(int r0, int r1, int r2) {
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 + r1
            int r0 = r0 * r2
            return r0
    }

    public static int e(java.lang.String r0, int r1, int r2) {
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * r2
            return r0
    }

    public static defpackage.i40 f(float r1, float r2, float r3) {
            i40 r0 = new i40
            r0.<init>(r1)
            r0.b(r2)
            r0.a(r3)
            return r0
    }

    public static android.widget.LinearLayout g(android.app.Activity r1, int r2) {
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r1)
            r0.setOrientation(r2)
            return r0
    }

    public static java.lang.ClassCastException h(java.util.Iterator r0) {
            java.lang.Object r0 = r0.next()
            r0.getClass()
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            return r0
    }

    public static java.lang.String i(java.lang.String r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String j(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String k(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = defpackage.u40.a(r0, r1)
            defpackage.ip.o(r0, r2)
            java.lang.String r0 = defpackage.u40.a(r3, r4)
            return r0
    }

    public static java.lang.String l(java.lang.StringBuilder r0, java.lang.String r1, java.lang.String r2) {
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static /* synthetic */ void m(java.lang.Object r0) {
            if (r0 != 0) goto L3
            return
        L3:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
    }

    public static void n(java.lang.String r0, java.lang.String r1, android.widget.TextView r2, float r3, int r4) {
            java.lang.String r0 = defpackage.u40.a(r0, r1)
            r2.setText(r0)
            r2.setTextSize(r3)
            r2.setTextColor(r4)
            return
    }

    public static void o(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = defpackage.u40.a(r0, r1)
            defpackage.ip.o(r0, r2)
            defpackage.u40.a(r3, r4)
            return
    }

    public static void p(java.lang.StringBuilder r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0.append(r1)
            r0.append(r2)
            r0.append(r3)
            r0.append(r4)
            return
    }

    public static boolean q(java.lang.String r0, java.lang.String r1, defpackage.gn r2) {
            java.lang.String r0 = defpackage.u40.a(r0, r1)
            r2.getClass()
            boolean r0 = defpackage.gn.e(r0)
            return r0
    }

    public static void r(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            defpackage.ip.o(r1, r0)
            java.lang.String r0 = defpackage.u40.a(r2, r3)
            defpackage.ip.o(r0, r4)
            return
    }

    public static /* synthetic */ java.lang.String s(int r0) {
            switch(r0) {
                case 1: goto L1d;
                case 2: goto L1a;
                case 3: goto L17;
                case 4: goto L14;
                case 5: goto L11;
                case 6: goto Le;
                case 7: goto Lb;
                case 8: goto L8;
                case 9: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            throw r0
        L5:
            java.lang.String r0 = "CENTER_Y"
            return r0
        L8:
            java.lang.String r0 = "CENTER_X"
            return r0
        Lb:
            java.lang.String r0 = "CENTER"
            return r0
        Le:
            java.lang.String r0 = "BASELINE"
            return r0
        L11:
            java.lang.String r0 = "BOTTOM"
            return r0
        L14:
            java.lang.String r0 = "RIGHT"
            return r0
        L17:
            java.lang.String r0 = "TOP"
            return r0
        L1a:
            java.lang.String r0 = "LEFT"
            return r0
        L1d:
            java.lang.String r0 = "NONE"
            return r0
    }

    public static /* synthetic */ int t(int r0) {
            if (r0 == 0) goto L5
            int r0 = r0 + (-1)
            return r0
        L5:
            r0 = 0
            throw r0
    }

    public static /* synthetic */ java.lang.String u(int r1) {
            r0 = 1
            if (r1 == r0) goto L12
            r0 = 2
            if (r1 == r0) goto Lf
            r0 = 3
            if (r1 == r0) goto Lc
            java.lang.String r1 = "null"
            return r1
        Lc:
            java.lang.String r1 = "REMOVING"
            return r1
        Lf:
            java.lang.String r1 = "ADDING"
            return r1
        L12:
            java.lang.String r1 = "NONE"
            return r1
    }

    public static /* synthetic */ java.lang.String v(int r1) {
            r0 = 1
            if (r1 == r0) goto L18
            r0 = 2
            if (r1 == r0) goto L15
            r0 = 3
            if (r1 == r0) goto L12
            r0 = 4
            if (r1 == r0) goto Lf
            java.lang.String r1 = "null"
            return r1
        Lf:
            java.lang.String r1 = "INVISIBLE"
            return r1
        L12:
            java.lang.String r1 = "GONE"
            return r1
        L15:
            java.lang.String r1 = "VISIBLE"
            return r1
        L18:
            java.lang.String r1 = "REMOVED"
            return r1
    }
}
