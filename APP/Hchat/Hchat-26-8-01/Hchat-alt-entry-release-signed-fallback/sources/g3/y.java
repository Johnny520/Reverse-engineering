package g3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends android.view.WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3.s f4251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.util.List f4252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.util.ArrayList f4253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f4254d;

    public y(g3.s r2) {
            r1 = this;
            int r0 = r2.f4232h
            r1.<init>(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f4254d = r0
            r1.f4251a = r2
            return
    }

    public final g3.b0 a(android.view.WindowInsetsAnimation r6) {
            r5 = this;
            java.util.HashMap r0 = r5.f4254d
            java.lang.Object r0 = r0.get(r6)
            g3.b0 r0 = (g3.b0) r0
            if (r0 != 0) goto L25
            g3.b0 r0 = new g3.b0
            r1 = 0
            r2 = 0
            r4 = 0
            r0.<init>(r4, r1, r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto L20
            g3.z r1 = new g3.z
            r1.<init>(r6)
            r0.f4187a = r1
        L20:
            java.util.HashMap r1 = r5.f4254d
            r1.put(r6, r0)
        L25:
            return r0
    }

    public final void onEnd(android.view.WindowInsetsAnimation r3) {
            r2 = this;
            g3.s r0 = r2.f4251a
            g3.b0 r1 = r2.a(r3)
            r0.a(r1)
            java.util.HashMap r0 = r2.f4254d
            r0.remove(r3)
            return
    }

    public final void onPrepare(android.view.WindowInsetsAnimation r1) {
            r0 = this;
            r0.a(r1)
            g3.s r1 = r0.f4251a
            r1.b()
            return
    }

    public final android.view.WindowInsets onProgress(android.view.WindowInsets r5, java.util.List r6) {
            r4 = this;
            java.util.ArrayList r0 = r4.f4253c
            if (r0 != 0) goto L16
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.size()
            r0.<init>(r1)
            r4.f4253c = r0
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r4.f4252b = r0
            goto L19
        L16:
            r0.clear()
        L19:
            int r0 = r6.size()
            int r0 = r0 + (-1)
        L1f:
            if (r0 < 0) goto L3e
            java.lang.Object r1 = r6.get(r0)
            android.view.WindowInsetsAnimation r1 = g3.h.j(r1)
            g3.b0 r2 = r4.a(r1)
            float r1 = g3.h.y(r1)
            g3.a0 r3 = r2.f4187a
            r3.e(r1)
            java.util.ArrayList r1 = r4.f4253c
            r1.add(r2)
            int r0 = r0 + (-1)
            goto L1f
        L3e:
            r6 = 0
            g3.r0 r5 = g3.r0.c(r5, r6)
            java.util.List r6 = r4.f4252b
            g3.s r0 = r4.f4251a
            g3.r0 r5 = r0.d(r5, r6)
            android.view.WindowInsets r5 = r5.b()
            return r5
    }

    public final android.view.WindowInsetsAnimation.Bounds onStart(android.view.WindowInsetsAnimation r2, android.view.WindowInsetsAnimation.Bounds r3) {
            r1 = this;
            g3.b0 r2 = r1.a(r2)
            b.e r0 = new b.e
            r0.<init>(r3)
            g3.s r3 = r1.f4251a
            b.e r2 = r3.e(r2, r0)
            r2.getClass()
            g3.h.l()
            java.lang.Object r3 = r2.f332h
            b3.a r3 = (b3.a) r3
            android.graphics.Insets r3 = r3.d()
            java.lang.Object r2 = r2.f333i
            b3.a r2 = (b3.a) r2
            android.graphics.Insets r2 = r2.d()
            android.view.WindowInsetsAnimation$Bounds r2 = g3.h.h(r3, r2)
            return r2
    }
}
