package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x90 implements android.view.View.OnApplyWindowInsetsListener {
    public defpackage.wc0 a;
    public final /* synthetic */ android.view.View b;
    public final /* synthetic */ defpackage.qw c;

    public x90(android.view.View r1, defpackage.qw r2) {
            r0 = this;
            r0.b = r1
            r0.c = r2
            r0.<init>()
            r1 = 0
            r0.a = r1
            return
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View r6, android.view.WindowInsets r7) {
            r5 = this;
            wc0 r0 = defpackage.wc0.g(r6, r7)
            int r1 = android.os.Build.VERSION.SDK_INT
            qw r2 = r5.c
            r3 = 30
            if (r1 >= r3) goto L22
            android.view.View r4 = r5.b
            defpackage.y90.a(r7, r4)
            wc0 r7 = r5.a
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L22
            wc0 r6 = r2.d(r6, r0)
            android.view.WindowInsets r6 = r6.f()
            return r6
        L22:
            r5.a = r0
            wc0 r7 = r2.d(r6, r0)
            if (r1 < r3) goto L2f
            android.view.WindowInsets r6 = r7.f()
            return r6
        L2f:
            java.util.WeakHashMap r0 = defpackage.ja0.a
            defpackage.w90.c(r6)
            android.view.WindowInsets r6 = r7.f()
            return r6
    }
}
