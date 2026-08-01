package p000;

import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: z0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0950z0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5522a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ActionBarOverlayLayout f5523b;

    public /* synthetic */ RunnableC0950z0(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f5522a = i;
        this.f5523b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5522a) {
            case Base64.DEFAULT /* 0 */:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f5523b;
                actionBarOverlayLayout.m140h();
                actionBarOverlayLayout.f240w = actionBarOverlayLayout.f221d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f241x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f5523b;
                actionBarOverlayLayout2.m140h();
                actionBarOverlayLayout2.f240w = actionBarOverlayLayout2.f221d.animate().translationY(-actionBarOverlayLayout2.f221d.getHeight()).setListener(actionBarOverlayLayout2.f241x);
                break;
        }
    }
}
