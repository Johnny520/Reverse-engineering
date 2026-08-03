package p000;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: Ra */
/* JADX INFO: loaded from: classes.dex */
public final class C0747Ra extends AbstractC0073Bn implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2382b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractActivityC2148ki f2383c;

    public /* synthetic */ C0747Ra(AbstractActivityC2148ki r1, int r2) {
        this.f2382b = r2;
        this.f2383c = r1;
        super(0);
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch(this.f2382b) {
            case 0: goto L15;
            case 1: goto L13;
            case 2: goto L11;
            default: goto L4;
        };
    L4:
        AbstractActivityC2148ki r3 = this.f2383c;
        C2335ot r0 = new C2335ot(new RunnableC0275Ga(r3, 1));
        if (Build.VERSION.SDK_INT >= 33) goto L7;
    L10:
        return r0;
    L7:
        if (AbstractC0585Nj.m1134a(Looper.myLooper(), Looper.getMainLooper()) == true) goto L9;
        new Handler(Looper.getMainLooper()).post(new RunnableC2260n3(6, r3, r0));
        goto L10
    L9:
        AbstractActivityC0833Ta.access$addObserverForBackInvoker(r3, r0);
        goto L10
    L11:
        AbstractActivityC2148ki r1 = this.f2383c;
        return new C0713Qi(AbstractActivityC0833Ta.access$getReportFullyDrawnExecutor$p(r1), new C0747Ra(r1, 1));
    L13:
        this.f2383c.reportFullyDrawn();
        return C0829TC.f2620a;
    L15:
        AbstractActivityC2148ki r12 = this.f2383c;
        Application r2 = r12.getApplication();
        if (r12.getIntent() == null) goto L18;
        Bundle r32 = r12.getIntent().getExtras();
    L20:
        return new C2119jx(r2, r12, r32);
    L18:
        r32 = null;
        goto L20
    }
}
