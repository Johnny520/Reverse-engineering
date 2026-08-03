package p000;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;

/* JADX INFO: renamed from: ew */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1385ew implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4931a = 0;

    /* JADX INFO: renamed from: b */
    public Object f4932b;

    /* JADX INFO: renamed from: c */
    public Object f4933c;

    /* JADX INFO: renamed from: d */
    public Object f4934d;

    public /* synthetic */ RunnableC1385ew() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        switch (this.f4931a) {
            case 0:
                try {
                    objCall = ((CallableC0712Qh) this.f4932b).call();
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.f4934d).post(new RunnableC0044B0((C0754Rh) this.f4933c, objCall, 6, false));
                break;
            default:
                C2358pF.m4777h((View) this.f4932b, (C0299Gy) this.f4933c);
                ((ValueAnimator) this.f4934d).start();
                break;
        }
    }

    public RunnableC1385ew(View view, C2538tF c2538tF, C0299Gy c0299Gy, ValueAnimator valueAnimator) {
        this.f4932b = view;
        this.f4933c = c0299Gy;
        this.f4934d = valueAnimator;
    }
}
