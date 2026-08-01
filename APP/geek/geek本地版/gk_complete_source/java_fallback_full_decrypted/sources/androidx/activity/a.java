package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final java.lang.Runnable a;
    public final defpackage.k6 b;
    public defpackage.sl c;
    public final android.window.OnBackInvokedCallback d;
    public android.window.OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public a(java.lang.Runnable r5) {
            r4 = this;
            r4.<init>()
            r4.a = r5
            k6 r5 = new k6
            r5.<init>()
            r4.b = r5
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r5 < r0) goto L43
            r0 = 34
            if (r5 < r0) goto L35
            rw r5 = new rw
            r0 = 0
            r5.<init>(r4, r0)
            rw r0 = new rw
            r1 = 1
            r0.<init>(r4, r1)
            sw r1 = new sw
            r2 = 0
            r1.<init>(r2, r4)
            sw r2 = new sw
            r3 = 1
            r2.<init>(r3, r4)
            vw r3 = defpackage.vw.a
            android.window.OnBackInvokedCallback r5 = r3.a(r5, r0, r1, r2)
            goto L41
        L35:
            sw r5 = new sw
            r0 = 2
            r5.<init>(r0, r4)
            tw r0 = defpackage.tw.a
            android.window.OnBackInvokedCallback r5 = r0.a(r5)
        L41:
            r4.d = r5
        L43:
            return
    }

    public final void a(defpackage.oq r3, defpackage.sl r4) {
            r2 = this;
            java.lang.String r0 = "onBackPressedCallback"
            defpackage.ip.o(r0, r4)
            androidx.lifecycle.a r3 = r3.e()
            jq r0 = r3.c
            jq r1 = defpackage.jq.a
            if (r0 != r1) goto L10
            return
        L10:
            androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable r0 = new androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
            r0.<init>(r2, r3, r4)
            java.util.concurrent.CopyOnWriteArrayList r3 = r4.b
            r3.add(r0)
            r2.d()
            xw r3 = new xw
            r0 = 0
            r3.<init>(r0, r2)
            r4.c = r3
            return
    }

    public final void b() {
            r4 = this;
            k6 r0 = r4.b
            r0.getClass()
            int r1 = r0.c
            java.util.ListIterator r0 = r0.listIterator(r1)
        Lb:
            boolean r1 = r0.hasPrevious()
            r2 = 0
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.previous()
            r3 = r1
            sl r3 = (defpackage.sl) r3
            boolean r3 = r3.a
            if (r3 == 0) goto Lb
            goto L1f
        L1e:
            r1 = r2
        L1f:
            sl r1 = (defpackage.sl) r1
            r4.c = r2
            if (r1 == 0) goto L3b
            yl r0 = r1.d
            r1 = 1
            r0.t(r1)
            sl r1 = r0.h
            boolean r1 = r1.a
            if (r1 == 0) goto L35
            r0.G()
            return
        L35:
            androidx.activity.a r0 = r0.g
            r0.b()
            return
        L3b:
            java.lang.Runnable r0 = r4.a
            r0.run()
            return
    }

    public final void c(boolean r6) {
            r5 = this;
            android.window.OnBackInvokedDispatcher r0 = r5.e
            if (r0 == 0) goto L23
            android.window.OnBackInvokedCallback r1 = r5.d
            if (r1 == 0) goto L23
            r2 = 0
            tw r3 = defpackage.tw.a
            if (r6 == 0) goto L18
            boolean r4 = r5.f
            if (r4 != 0) goto L18
            r3.b(r0, r2, r1)
            r6 = 1
            r5.f = r6
            return
        L18:
            if (r6 != 0) goto L23
            boolean r6 = r5.f
            if (r6 == 0) goto L23
            r3.c(r0, r1)
            r5.f = r2
        L23:
            return
    }

    public final void d() {
            r4 = this;
            boolean r0 = r4.g
            r1 = 0
            k6 r2 = r4.b
            if (r2 == 0) goto Le
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto Le
            goto L23
        Le:
            java.util.Iterator r2 = r2.iterator()
        L12:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L23
            java.lang.Object r3 = r2.next()
            sl r3 = (defpackage.sl) r3
            boolean r3 = r3.a
            if (r3 == 0) goto L12
            r1 = 1
        L23:
            r4.g = r1
            if (r1 == r0) goto L30
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r0 < r2) goto L30
            r4.c(r1)
        L30:
            return
    }
}
