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

    public ViewTreeObserverOnDrawListenerC2718xh(C2761yh c2761yh, View view) {
        this.f9297b = c2761yh;
        this.f9296a = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        AbstractC2622vD.m5135f().post(new RunnableC0044B0(2, this, this));
    }
}
