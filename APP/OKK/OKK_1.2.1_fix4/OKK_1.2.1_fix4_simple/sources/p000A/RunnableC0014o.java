package p000A;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import java.util.concurrent.Callable;
import p004C.InterfaceC0060a;
import p006D.C0088Z;
import p006D.C0096d0;

/* JADX INFO: renamed from: A.o */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0014o implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38a;

    /* JADX INFO: renamed from: b */
    public Object f39b;

    /* JADX INFO: renamed from: c */
    public Object f40c;

    /* JADX INFO: renamed from: d */
    public Object f41d;

    public /* synthetic */ RunnableC0014o() {
        this.f38a = 0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f38a) {
            case 0: goto L11;
            default: goto L4;
        };
    L4:
        C0002c r02 = (C0002c) this.f40c;
        C0088Z.m309h((View) this.f39b, r02);
        ((ValueAnimator) this.f41d).start();
        return;
    L11:
        Object r03 = ((Callable) this.f39b).call();     // Catch: Exception -> L8
    L9:
        RunnableC0000a r1 = new RunnableC0000a((C0007h) ((InterfaceC0060a) this.f40c), r03, 1);
        ((Handler) this.f41d).post(r1);
        return;
    L8:
        r03 = null;
        goto L9
    }

    public RunnableC0014o(View r1, C0096d0 r2, C0002c r3, ValueAnimator r4) {
        this.f38a = 1;
        this.f39b = r1;
        this.f40c = r3;
        this.f41d = r4;
    }
}
