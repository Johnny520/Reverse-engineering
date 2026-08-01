package defpackage;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class s00 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ s00() {
        this.a = 0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.a) {
            case 0: goto L11;
            default: goto L4;
        };
    L4:
        cc0.h((View) this.b, (d4) this.c);
        ((ValueAnimator) this.d).start();
        return;
    L11:
        Object r0 = ((xk) this.b).call();     // Catch: Exception -> L8
    L9:
        yk r1 = (yk) this.c;
        ((Handler) this.d).post(new h1(r1, r0, 8, false));
        return;
    L8:
        r0 = null;
        goto L9
    }

    public s00(View r1, gc0 r2, d4 r3, ValueAnimator r4) {
        this.a = 1;
        this.b = r1;
        this.c = r3;
        this.d = r4;
    }
}
