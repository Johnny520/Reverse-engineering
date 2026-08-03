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
    public final /* synthetic */ int f38a = 0;

    /* JADX INFO: renamed from: b */
    public Object f39b;

    /* JADX INFO: renamed from: c */
    public Object f40c;

    /* JADX INFO: renamed from: d */
    public Object f41d;

    public /* synthetic */ RunnableC0014o() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        switch (this.f38a) {
            case 0:
                try {
                    objCall = ((Callable) this.f39b).call();
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.f41d).post(new RunnableC0000a((C0007h) ((InterfaceC0060a) this.f40c), objCall, 1));
                break;
            default:
                C0088Z.m309h((View) this.f39b, (C0002c) this.f40c);
                ((ValueAnimator) this.f41d).start();
                break;
        }
    }

    public RunnableC0014o(View view, C0096d0 c0096d0, C0002c c0002c, ValueAnimator valueAnimator) {
        this.f39b = view;
        this.f40c = c0002c;
        this.f41d = valueAnimator;
    }
}
