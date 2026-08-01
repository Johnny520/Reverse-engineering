package androidx.appcompat.app;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.core.view.AbstractC3100;
import androidx.core.view.AbstractC3103;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0959 extends AbstractC3100 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* synthetic */ C0958 f700;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f701;

    public /* synthetic */ C0959(C0958 c0958, int i) {
        this.f701 = i;
        this.f700 = c0958;
    }

    @Override // androidx.core.view.InterfaceC3116
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo884() {
        View view;
        int i = this.f701;
        C0958 c0958 = this.f700;
        switch (i) {
            case 0:
                if (c0958.f692 && (view = c0958.f695) != null) {
                    view.setTranslationY(0.0f);
                    c0958.f678.setTranslationY(0.0f);
                }
                c0958.f678.setVisibility(8);
                c0958.f678.setTransitioning(false);
                c0958.f683 = null;
                C0923 c0923 = c0958.f696;
                if (c0923 != null) {
                    c0923.mo839(c0958.f699);
                    c0958.f699 = null;
                    c0958.f696 = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = c0958.f679;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = AbstractC3103.f6939;
                    actionBarOverlayLayout.requestApplyInsets();
                }
                break;
            default:
                c0958.f683 = null;
                c0958.f678.requestLayout();
                break;
        }
    }
}
