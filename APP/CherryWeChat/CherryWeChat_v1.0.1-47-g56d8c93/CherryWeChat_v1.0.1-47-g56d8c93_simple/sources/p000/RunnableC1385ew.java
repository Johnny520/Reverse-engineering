package p000;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;

/* JADX INFO: renamed from: ew */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1385ew implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4931a;

    /* JADX INFO: renamed from: b */
    public Object f4932b;

    /* JADX INFO: renamed from: c */
    public Object f4933c;

    /* JADX INFO: renamed from: d */
    public Object f4934d;

    public /* synthetic */ RunnableC1385ew() {
        this.f4931a = 0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f4931a) {
            case 0: goto L11;
            default: goto L4;
        };
    L4:
        C2358pF.m4777h((View) this.f4932b, (C0299Gy) this.f4933c);
        ((ValueAnimator) this.f4934d).start();
        return;
    L11:
        Object r0 = ((CallableC0712Qh) this.f4932b).call();     // Catch: Exception -> L8
    L9:
        C0754Rh r1 = (C0754Rh) this.f4933c;
        ((Handler) this.f4934d).post(new RunnableC0044B0(r1, r0, 6, false));
        return;
    L8:
        r0 = null;
        goto L9
    }

    public RunnableC1385ew(View r1, C2538tF r2, C0299Gy r3, ValueAnimator r4) {
        this.f4931a = 1;
        this.f4932b = r1;
        this.f4933c = r3;
        this.f4934d = r4;
    }
}
