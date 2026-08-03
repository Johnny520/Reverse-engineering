package p000;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: Ra */
/* JADX INFO: loaded from: classes.dex */
public final class C0747Ra extends AbstractC0073Bn implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2382b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractActivityC2148ki f2383c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0747Ra(AbstractActivityC2148ki abstractActivityC2148ki, int i) {
        super(0);
        this.f2382b = i;
        this.f2383c = abstractActivityC2148ki;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f2382b) {
            case 0:
                AbstractActivityC2148ki abstractActivityC2148ki = this.f2383c;
                return new C2119jx(abstractActivityC2148ki.getApplication(), abstractActivityC2148ki, abstractActivityC2148ki.getIntent() != null ? abstractActivityC2148ki.getIntent().getExtras() : null);
            case 1:
                this.f2383c.reportFullyDrawn();
                return C0829TC.f2620a;
            case 2:
                AbstractActivityC2148ki abstractActivityC2148ki2 = this.f2383c;
                return new C0713Qi(abstractActivityC2148ki2.f2631g, new C0747Ra(abstractActivityC2148ki2, 1));
            default:
                AbstractActivityC2148ki abstractActivityC2148ki3 = this.f2383c;
                C2335ot c2335ot = new C2335ot(new RunnableC0275Ga(abstractActivityC2148ki3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (AbstractC0585Nj.m1134a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC2148ki3.getLifecycle().mo1555a(new C0447Ka(0, c2335ot, abstractActivityC2148ki3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new RunnableC2260n3(6, abstractActivityC2148ki3, c2335ot));
                    }
                }
                return c2335ot;
        }
    }
}
