package p000;

import android.app.Fragment;
import android.content.res.Configuration;
import android.os.Bundle;

/* JADX INFO: renamed from: Yv */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentC1069Yv extends Fragment {

    /* JADX INFO: renamed from: a */
    public RunnableC0431K0 f3380a;

    public FragmentC1069Yv() {
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle r2) {
        super.onActivityCreated(r2);
        RunnableC0431K0 r22 = this.f3380a;
        if (r22 == null) goto L6;
        getResources().getConfiguration();
        r22.m888a();
        return;
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration r1) {
        super.onConfigurationChanged(r1);
        RunnableC0431K0 r12 = this.f3380a;
        if (r12 == null) goto L6;
        r12.m889b();
        return;
    }

    @Override // android.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        RunnableC0431K0 r0 = this.f3380a;
        if (r0 == null) goto L6;
        r0.m890c();
        this.f3380a = null;
        return;
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        RunnableC0431K0 r0 = this.f3380a;
        if (r0 == null) goto L6;
        r0.m891d();
        return;
    }
}
