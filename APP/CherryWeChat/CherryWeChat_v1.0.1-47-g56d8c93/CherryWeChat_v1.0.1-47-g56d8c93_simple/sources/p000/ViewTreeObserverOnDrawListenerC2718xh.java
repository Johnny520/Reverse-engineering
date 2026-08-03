package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: xh */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC2718xh implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f9296a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2761yh f9297b;

    public ViewTreeObserverOnDrawListenerC2718xh(C2761yh r1, View r2) {
        this.f9297b = r1;
        this.f9296a = r2;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        RunnableC0044B0 r0 = new RunnableC0044B0(2, this, this);
        AbstractC2622vD.m5135f().post(r0);
    }
}
