package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cc0 extends defpackage.fc0 {
    public static void e(android.view.View r2) {
            ad r0 = j(r2)
            if (r0 == 0) goto Lf
            java.lang.Object r2 = r0.e
            android.view.View r2 = (android.view.View) r2
            r0 = 0
            r2.setTranslationY(r0)
            return
        Lf:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L26
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0 = 0
        L16:
            int r1 = r2.getChildCount()
            if (r0 >= r1) goto L26
            android.view.View r1 = r2.getChildAt(r0)
            e(r1)
            int r0 = r0 + 1
            goto L16
        L26:
            return
    }

    public static void f(android.view.View r2, android.view.WindowInsets r3, boolean r4) {
            ad r0 = j(r2)
            if (r0 == 0) goto L1a
            r0.b = r3
            if (r4 != 0) goto L1a
            java.lang.Object r4 = r0.e
            android.view.View r4 = (android.view.View) r4
            java.lang.Cloneable r1 = r0.f
            int[] r1 = (int[]) r1
            r4.getLocationOnScreen(r1)
            r4 = 1
            r1 = r1[r4]
            r0.c = r1
        L1a:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L31
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0 = 0
        L21:
            int r1 = r2.getChildCount()
            if (r0 >= r1) goto L31
            android.view.View r1 = r2.getChildAt(r0)
            f(r1, r3, r4)
            int r0 = r0 + 1
            goto L21
        L31:
            return
    }

    public static void g(android.view.View r2, defpackage.wc0 r3, java.util.List r4) {
            ad r0 = j(r2)
            if (r0 == 0) goto La
            r0.a(r3, r4)
            return
        La:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L21
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0 = 0
        L11:
            int r1 = r2.getChildCount()
            if (r0 >= r1) goto L21
            android.view.View r1 = r2.getChildAt(r0)
            g(r1, r3, r4)
            int r0 = r0 + 1
            goto L11
        L21:
            return
    }

    public static void h(android.view.View r2, defpackage.d4 r3) {
            ad r0 = j(r2)
            if (r0 == 0) goto L1e
            java.lang.Object r2 = r0.e
            android.view.View r2 = (android.view.View) r2
            java.lang.Cloneable r3 = r0.f
            int[] r3 = (int[]) r3
            r2.getLocationOnScreen(r3)
            r1 = 1
            r3 = r3[r1]
            int r1 = r0.c
            int r1 = r1 - r3
            r0.d = r1
            float r3 = (float) r1
            r2.setTranslationY(r3)
            return
        L1e:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L35
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0 = 0
        L25:
            int r1 = r2.getChildCount()
            if (r0 >= r1) goto L35
            android.view.View r1 = r2.getChildAt(r0)
            h(r1, r3)
            int r0 = r0 + 1
            goto L25
        L35:
            return
    }

    public static android.view.WindowInsets i(android.view.View r1, android.view.WindowInsets r2) {
            r0 = 2131296645(0x7f090185, float:1.8211213E38)
            java.lang.Object r0 = r1.getTag(r0)
            if (r0 == 0) goto La
            return r2
        La:
            android.view.WindowInsets r1 = r1.onApplyWindowInsets(r2)
            return r1
    }

    public static defpackage.ad j(android.view.View r1) {
            r0 = 2131296653(0x7f09018d, float:1.8211229E38)
            java.lang.Object r1 = r1.getTag(r0)
            boolean r0 = r1 instanceof defpackage.bc0
            if (r0 == 0) goto L10
            bc0 r1 = (defpackage.bc0) r1
            ad r1 = r1.a
            return r1
        L10:
            r1 = 0
            return r1
    }
}
