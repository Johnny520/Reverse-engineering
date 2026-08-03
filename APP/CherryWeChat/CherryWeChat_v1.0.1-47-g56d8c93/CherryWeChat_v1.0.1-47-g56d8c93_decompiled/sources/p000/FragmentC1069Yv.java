package p000;

import android.app.Fragment;
import android.content.res.Configuration;
import android.os.Bundle;

/* JADX INFO: renamed from: Yv */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentC1069Yv extends Fragment {

    /* JADX INFO: renamed from: a */
    public RunnableC0431K0 f3380a;

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        RunnableC0431K0 runnableC0431K0 = this.f3380a;
        if (runnableC0431K0 != null) {
            getResources().getConfiguration();
            runnableC0431K0.m888a();
        }
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        RunnableC0431K0 runnableC0431K0 = this.f3380a;
        if (runnableC0431K0 != null) {
            runnableC0431K0.m889b();
        }
    }

    @Override // android.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        RunnableC0431K0 runnableC0431K0 = this.f3380a;
        if (runnableC0431K0 != null) {
            runnableC0431K0.m890c();
            this.f3380a = null;
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        RunnableC0431K0 runnableC0431K0 = this.f3380a;
        if (runnableC0431K0 != null) {
            runnableC0431K0.m891d();
        }
    }
}
