package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dc0 extends android.view.WindowInsetsAnimation$Callback {
    public final defpackage.ad a;
    public java.util.List b;
    public java.util.ArrayList c;
    public final java.util.HashMap d;

    public dc0(defpackage.ad r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.d = r0
            r1.a = r2
            return
    }

    public final defpackage.gc0 a(android.view.WindowInsetsAnimation r6) {
            r5 = this;
            java.util.HashMap r0 = r5.d
            java.lang.Object r0 = r0.get(r6)
            gc0 r0 = (defpackage.gc0) r0
            if (r0 != 0) goto L25
            gc0 r0 = new gc0
            r1 = 0
            r2 = 0
            r4 = 0
            r0.<init>(r4, r1, r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto L20
            ec0 r1 = new ec0
            r1.<init>(r6)
            r0.a = r1
        L20:
            java.util.HashMap r1 = r5.d
            r1.put(r6, r0)
        L25:
            return r0
    }

    public final void onEnd(android.view.WindowInsetsAnimation r3) {
            r2 = this;
            r2.a(r3)
            ad r0 = r2.a
            java.lang.Object r0 = r0.e
            android.view.View r0 = (android.view.View) r0
            r1 = 0
            r0.setTranslationY(r1)
            java.util.HashMap r0 = r2.d
            r0.remove(r3)
            return
    }

    public final void onPrepare(android.view.WindowInsetsAnimation r3) {
            r2 = this;
            r2.a(r3)
            ad r3 = r2.a
            java.lang.Object r0 = r3.e
            android.view.View r0 = (android.view.View) r0
            java.lang.Cloneable r1 = r3.f
            int[] r1 = (int[]) r1
            r0.getLocationOnScreen(r1)
            r0 = 1
            r0 = r1[r0]
            r3.c = r0
            return
    }

    public final android.view.WindowInsets onProgress(android.view.WindowInsets r5, java.util.List r6) {
            r4 = this;
            java.util.ArrayList r0 = r4.c
            if (r0 != 0) goto L16
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.size()
            r0.<init>(r1)
            r4.c = r0
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r4.b = r0
            goto L19
        L16:
            r0.clear()
        L19:
            int r0 = r6.size()
            int r0 = r0 + (-1)
        L1f:
            if (r0 < 0) goto L3e
            java.lang.Object r1 = r6.get(r0)
            android.view.WindowInsetsAnimation r1 = defpackage.d0.j(r1)
            gc0 r2 = r4.a(r1)
            float r1 = defpackage.d0.v(r1)
            fc0 r3 = r2.a
            r3.d(r1)
            java.util.ArrayList r1 = r4.c
            r1.add(r2)
            int r0 = r0 + (-1)
            goto L1f
        L3e:
            r6 = 0
            wc0 r5 = defpackage.wc0.g(r6, r5)
            java.util.List r6 = r4.b
            ad r0 = r4.a
            r0.a(r5, r6)
            android.view.WindowInsets r5 = r5.f()
            return r5
    }

    public final android.view.WindowInsetsAnimation.Bounds onStart(android.view.WindowInsetsAnimation r5, android.view.WindowInsetsAnimation.Bounds r6) {
            r4 = this;
            r4.a(r5)
            android.graphics.Insets r5 = defpackage.d0.x(r6)
            ep r5 = defpackage.ep.c(r5)
            android.graphics.Insets r6 = defpackage.d0.f(r6)
            ep r6 = defpackage.ep.c(r6)
            ad r0 = r4.a
            java.lang.Object r1 = r0.e
            android.view.View r1 = (android.view.View) r1
            java.lang.Cloneable r2 = r0.f
            int[] r2 = (int[]) r2
            r1.getLocationOnScreen(r2)
            r3 = 1
            r2 = r2[r3]
            int r3 = r0.c
            int r3 = r3 - r2
            r0.d = r3
            float r0 = (float) r3
            r1.setTranslationY(r0)
            defpackage.d0.m()
            android.graphics.Insets r5 = r5.d()
            android.graphics.Insets r6 = r6.d()
            android.view.WindowInsetsAnimation$Bounds r5 = defpackage.d0.h(r5, r6)
            return r5
    }
}
