package p000;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class z00 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5524a = 0;

    /* JADX INFO: renamed from: b */
    public Object f5525b;

    /* JADX INFO: renamed from: c */
    public Object f5526c;

    /* JADX INFO: renamed from: d */
    public Object f5527d;

    public /* synthetic */ z00() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        switch (this.f5524a) {
            case Base64.DEFAULT /* 0 */:
                try {
                    objCall = ((CallableC0970zk) this.f5525b).call();
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.f5527d).post(new RunnableC0282h1((C0022al) this.f5526c, objCall, 8, false));
                break;
            default:
                hc0.m1389h((View) this.f5525b, (C0138d4) this.f5526c);
                ((ValueAnimator) this.f5527d).start();
                break;
        }
    }

    public z00(View view, lc0 lc0Var, C0138d4 c0138d4, ValueAnimator valueAnimator) {
        this.f5525b = view;
        this.f5526c = c0138d4;
        this.f5527d = valueAnimator;
    }
}
