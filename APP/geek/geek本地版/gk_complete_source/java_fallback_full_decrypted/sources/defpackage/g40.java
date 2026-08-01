package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g40 {
    public int a;
    public int b;
    public final defpackage.ml c;
    public final java.util.ArrayList d;
    public final java.util.HashSet e;
    public boolean f;
    public boolean g;
    public final androidx.fragment.app.a h;

    public g40(int r3, int r4, androidx.fragment.app.a r5, defpackage.k8 r6) {
            r2 = this;
            ml r0 = r5.c
            r2.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.d = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r2.e = r1
            r1 = 0
            r2.f = r1
            r2.g = r1
            r2.a = r3
            r2.b = r4
            r2.c = r0
            l0 r3 = new l0
            r4 = 25
            r3.<init>(r4, r2)
            r6.a(r3)
            r2.h = r5
            return
    }

    public final void a() {
            r6 = this;
            java.util.HashSet r0 = r6.e
            boolean r1 = r6.f
            if (r1 == 0) goto L7
            goto L59
        L7:
            r1 = 1
            r6.f = r1
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L14
            r6.b()
            return
        L14:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            int r0 = r1.size()
            r2 = 0
        L1e:
            if (r2 >= r0) goto L59
            java.lang.Object r3 = r1.get(r2)
            int r2 = r2 + 1
            k8 r3 = (defpackage.k8) r3
            monitor-enter(r3)
            boolean r4 = r3.a     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L31
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2f
            goto L1e
        L2f:
            r0 = move-exception
            goto L57
        L31:
            r4 = 1
            r3.a = r4     // Catch: java.lang.Throwable -> L2f
            r3.c = r4     // Catch: java.lang.Throwable -> L2f
            j8 r4 = r3.b     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2f
            r5 = 0
            if (r4 == 0) goto L4c
            r4.onCancel()     // Catch: java.lang.Throwable -> L40
            goto L4c
        L40:
            r0 = move-exception
            monitor-enter(r3)
            r3.c = r5     // Catch: java.lang.Throwable -> L49
            r3.notifyAll()     // Catch: java.lang.Throwable -> L49
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L49
            throw r0
        L49:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L49
            throw r0
        L4c:
            monitor-enter(r3)
            r3.c = r5     // Catch: java.lang.Throwable -> L54
            r3.notifyAll()     // Catch: java.lang.Throwable -> L54
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L54
            goto L1e
        L54:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L54
            throw r0
        L57:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2f
            throw r0
        L59:
            return
    }

    public final void b() {
            r4 = this;
            boolean r0 = r4.g
            if (r0 == 0) goto L5
            goto L3c
        L5:
            r0 = 2
            boolean r0 = defpackage.yl.A(r0)
            if (r0 == 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SpecialEffectsController: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = " has called complete."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L24:
            r0 = 1
            r4.g = r0
            java.util.ArrayList r0 = r4.d
            int r1 = r0.size()
            r2 = 0
        L2e:
            if (r2 >= r1) goto L3c
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r3.run()
            goto L2e
        L3c:
            androidx.fragment.app.a r0 = r4.h
            r0.k()
            return
    }

    public final void c(int r7, int r8) {
            r6 = this;
            int r8 = defpackage.z30.t(r8)
            java.lang.String r0 = " mFinalState = "
            ml r1 = r6.c
            java.lang.String r2 = "SpecialEffectsController: For fragment "
            java.lang.String r3 = "FragmentManager"
            r4 = 1
            r5 = 2
            if (r8 == 0) goto L81
            if (r8 == r4) goto L50
            if (r8 == r5) goto L16
            goto Lb9
        L16:
            boolean r7 = defpackage.yl.A(r5)
            if (r7 == 0) goto L4a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r2)
            r7.append(r1)
            r7.append(r0)
            int r8 = r6.a
            java.lang.String r8 = defpackage.z30.v(r8)
            r7.append(r8)
            java.lang.String r8 = " -> REMOVED. mLifecycleImpact  = "
            r7.append(r8)
            int r8 = r6.b
            java.lang.String r8 = defpackage.z30.u(r8)
            r7.append(r8)
            java.lang.String r8 = " to REMOVING."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.v(r3, r7)
        L4a:
            r6.a = r4
            r7 = 3
            r6.b = r7
            return
        L50:
            int r7 = r6.a
            if (r7 != r4) goto Lb9
            boolean r7 = defpackage.yl.A(r5)
            if (r7 == 0) goto L7c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r2)
            r7.append(r1)
            java.lang.String r8 = " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = "
            r7.append(r8)
            int r8 = r6.b
            java.lang.String r8 = defpackage.z30.u(r8)
            r7.append(r8)
            java.lang.String r8 = " to ADDING."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.v(r3, r7)
        L7c:
            r6.a = r5
            r6.b = r5
            return
        L81:
            int r8 = r6.a
            if (r8 == r4) goto Lb9
            boolean r8 = defpackage.yl.A(r5)
            if (r8 == 0) goto Lb7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r2)
            r8.append(r1)
            r8.append(r0)
            int r0 = r6.a
            java.lang.String r0 = defpackage.z30.v(r0)
            r8.append(r0)
            java.lang.String r0 = " -> "
            r8.append(r0)
            java.lang.String r0 = defpackage.z30.v(r7)
            r8.append(r0)
            java.lang.String r0 = ". "
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            android.util.Log.v(r3, r8)
        Lb7:
            r6.a = r7
        Lb9:
            return
    }

    public final void d() {
            r5 = this;
            int r0 = r5.b
            r1 = 2
            if (r0 != r1) goto L69
            androidx.fragment.app.a r0 = r5.h
            ml r2 = r0.c
            android.view.View r3 = r2.E
            android.view.View r3 = r3.findFocus()
            if (r3 == 0) goto L38
            ll r4 = r2.f()
            r4.k = r3
            boolean r1 = defpackage.yl.A(r1)
            if (r1 == 0) goto L38
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "requestFocus: Saved focused view "
            r1.<init>(r4)
            r1.append(r3)
            java.lang.String r3 = " for Fragment "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r1)
        L38:
            ml r1 = r5.c
            android.view.View r1 = r1.A()
            android.view.ViewParent r3 = r1.getParent()
            r4 = 0
            if (r3 != 0) goto L4b
            r0.b()
            r1.setAlpha(r4)
        L4b:
            float r0 = r1.getAlpha()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L5d
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L5d
            r0 = 4
            r1.setVisibility(r0)
        L5d:
            ll r0 = r2.H
            if (r0 != 0) goto L64
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L66
        L64:
            float r0 = r0.j
        L66:
            r1.setAlpha(r0)
        L69:
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Operation {"
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "} {mFinalState = "
            r0.append(r1)
            int r1 = r2.a
            java.lang.String r1 = defpackage.z30.v(r1)
            r0.append(r1)
            java.lang.String r1 = "} {mLifecycleImpact = "
            r0.append(r1)
            int r1 = r2.b
            java.lang.String r1 = defpackage.z30.u(r1)
            r0.append(r1)
            java.lang.String r1 = "} {mFragment = "
            r0.append(r1)
            ml r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
