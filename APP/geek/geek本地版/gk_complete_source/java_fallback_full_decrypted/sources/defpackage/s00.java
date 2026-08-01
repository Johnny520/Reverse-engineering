package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s00 implements java.lang.Runnable {
    public final /* synthetic */ int a;
    public java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;

    public /* synthetic */ s00() {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            return
    }

    public s00(android.view.View r1, defpackage.gc0 r2, defpackage.d4 r3, android.animation.ValueAnimator r4) {
            r0 = this;
            r2 = 1
            r0.a = r2
            r0.<init>()
            r0.b = r1
            r0.c = r3
            r0.d = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r6 = this;
            int r0 = r6.a
            switch(r0) {
                case 0: goto L18;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r6.b
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r1 = r6.c
            d4 r1 = (defpackage.d4) r1
            defpackage.cc0.h(r0, r1)
            java.lang.Object r0 = r6.d
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            r0.start()
            return
        L18:
            java.lang.Object r0 = r6.b     // Catch: java.lang.Exception -> L21
            xk r0 = (defpackage.xk) r0     // Catch: java.lang.Exception -> L21
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Exception -> L21
            goto L22
        L21:
            r0 = 0
        L22:
            java.lang.Object r1 = r6.c
            yk r1 = (defpackage.yk) r1
            java.lang.Object r2 = r6.d
            android.os.Handler r2 = (android.os.Handler) r2
            h1 r3 = new h1
            r4 = 8
            r5 = 0
            r3.<init>(r1, r0, r4, r5)
            r2.post(r3)
            return
    }
}
