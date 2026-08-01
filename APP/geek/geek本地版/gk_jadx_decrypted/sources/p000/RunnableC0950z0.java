package p000;

import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: z0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0950z0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5429a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ActionBarOverlayLayout f5430b;

    public /* synthetic */ RunnableC0950z0(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f5429a = i;
        this.f5430b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5429a) {
            case Base64.DEFAULT /* 0 */:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f5430b;
                actionBarOverlayLayout.m155h();
                actionBarOverlayLayout.f277w = actionBarOverlayLayout.f258d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f278x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f5430b;
                actionBarOverlayLayout2.m155h();
                actionBarOverlayLayout2.f277w = actionBarOverlayLayout2.f258d.animate().translationY(-actionBarOverlayLayout2.f258d.getHeight()).setListener(actionBarOverlayLayout2.f278x);
                break;
        }
    }
}
