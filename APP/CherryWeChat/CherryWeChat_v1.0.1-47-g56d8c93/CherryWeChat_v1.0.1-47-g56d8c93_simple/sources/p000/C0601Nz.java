package p000;

import android.content.res.Configuration;

/* JADX INFO: renamed from: Nz */
/* JADX INFO: loaded from: classes.dex */
public final class C0601Nz extends AbstractComponentCallbacksC1503hi {

    /* JADX INFO: renamed from: T */
    public RunnableC0431K0 f1941T;

    public C0601Nz() {
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: l */
    public final void mo898l() {
        this.f5294C = true;
        RunnableC0431K0 r0 = this.f1941T;
        if (r0 == null) goto L6;
        m2878y().getResources().getConfiguration();
        r0.m888a();
        return;
    }

    @Override // p000.AbstractComponentCallbacksC1503hi, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration r1) {
        this.f5294C = true;
        RunnableC0431K0 r12 = this.f1941T;
        if (r12 == null) goto L6;
        r12.m889b();
        return;
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: p */
    public final void mo901p() {
        this.f5294C = true;
        RunnableC0431K0 r0 = this.f1941T;
        if (r0 == null) goto L6;
        r0.m890c();
        this.f1941T = null;
        return;
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: s */
    public final void mo1177s() {
        this.f5294C = true;
        RunnableC0431K0 r0 = this.f1941T;
        if (r0 == null) goto L6;
        r0.m891d();
        return;
    }
}
