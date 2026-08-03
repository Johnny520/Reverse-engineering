package p000;

import android.content.res.Configuration;

/* JADX INFO: renamed from: Nz */
/* JADX INFO: loaded from: classes.dex */
public final class C0601Nz extends AbstractComponentCallbacksC1503hi {

    /* JADX INFO: renamed from: T */
    public RunnableC0431K0 f1941T;

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: l */
    public final void mo898l() {
        this.f5294C = true;
        RunnableC0431K0 runnableC0431K0 = this.f1941T;
        if (runnableC0431K0 != null) {
            m2878y().getResources().getConfiguration();
            runnableC0431K0.m888a();
        }
    }

    @Override // p000.AbstractComponentCallbacksC1503hi, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f5294C = true;
        RunnableC0431K0 runnableC0431K0 = this.f1941T;
        if (runnableC0431K0 != null) {
            runnableC0431K0.m889b();
        }
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: p */
    public final void mo901p() {
        this.f5294C = true;
        RunnableC0431K0 runnableC0431K0 = this.f1941T;
        if (runnableC0431K0 != null) {
            runnableC0431K0.m890c();
            this.f1941T = null;
        }
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: s */
    public final void mo1177s() {
        this.f5294C = true;
        RunnableC0431K0 runnableC0431K0 = this.f1941T;
        if (runnableC0431K0 != null) {
            runnableC0431K0.m891d();
        }
    }
}
