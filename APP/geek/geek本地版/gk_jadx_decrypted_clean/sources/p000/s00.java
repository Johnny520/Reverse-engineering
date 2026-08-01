package p000;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class s00 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4365a = 0;

    /* JADX INFO: renamed from: b */
    public Object f4366b;

    /* JADX INFO: renamed from: c */
    public Object f4367c;

    /* JADX INFO: renamed from: d */
    public Object f4368d;

    public /* synthetic */ s00() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        switch (this.f4365a) {
            case Base64.DEFAULT /* 0 */:
                try {
                    objCall = ((CallableC0896xk) this.f4366b).call();
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.f4368d).post(new RunnableC0282h1((C0933yk) this.f4367c, objCall, 8, false));
                break;
            default:
                cc0.m671h((View) this.f4366b, (C0138d4) this.f4367c);
                ((ValueAnimator) this.f4368d).start();
                break;
        }
    }

    public s00(View view, gc0 gc0Var, C0138d4 c0138d4, ValueAnimator valueAnimator) {
        this.f4366b = view;
        this.f4367c = c0138d4;
        this.f4368d = valueAnimator;
    }
}
