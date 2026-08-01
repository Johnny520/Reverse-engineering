package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xa0 {
    public final java.util.ArrayList a;
    public long b;
    public android.view.animation.Interpolator c;
    public defpackage.ya0 d;
    public boolean e;
    public final defpackage.j70 f;

    public xa0() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.b = r0
            j70 r0 = new j70
            r0.<init>(r2)
            r2.f = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.a = r0
            return
    }

    public final void a() {
            r5 = this;
            boolean r0 = r5.e
            if (r0 != 0) goto L5
            return
        L5:
            java.util.ArrayList r0 = r5.a
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        Ld:
            if (r3 >= r1) goto L1b
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            wa0 r4 = (defpackage.wa0) r4
            r4.b()
            goto Ld
        L1b:
            r5.e = r2
            return
    }

    public final void b() {
            r8 = this;
            boolean r0 = r8.e
            if (r0 == 0) goto L5
            return
        L5:
            java.util.ArrayList r0 = r8.a
            int r1 = r0.size()
            r2 = 0
        Lc:
            if (r2 >= r1) goto L51
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            wa0 r3 = (defpackage.wa0) r3
            long r4 = r8.b
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L21
            r3.c(r4)
        L21:
            android.view.animation.Interpolator r4 = r8.c
            if (r4 == 0) goto L36
            java.lang.ref.WeakReference r5 = r3.a
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L36
            android.view.ViewPropertyAnimator r5 = r5.animate()
            r5.setInterpolator(r4)
        L36:
            ya0 r4 = r8.d
            if (r4 == 0) goto L3f
            j70 r4 = r8.f
            r3.d(r4)
        L3f:
            java.lang.ref.WeakReference r3 = r3.a
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto Lc
            android.view.ViewPropertyAnimator r3 = r3.animate()
            r3.start()
            goto Lc
        L51:
            r0 = 1
            r8.e = r0
            return
    }
}
