package androidx.appcompat.app;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.core.view.AbstractC2267;
import androidx.core.view.AbstractC2270;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0112 extends AbstractC2267 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* synthetic */ C0111 f355;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f356;

    public /* synthetic */ C0112(C0111 c0111, int i) {
        this.f356 = i;
        this.f355 = c0111;
    }

    @Override // androidx.core.view.InterfaceC2283
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo323() {
        View view;
        int i = this.f356;
        C0111 c0111 = this.f355;
        switch (i) {
            case 0:
                if (c0111.f347 && (view = c0111.f350) != null) {
                    view.setTranslationY(0.0f);
                    c0111.f333.setTranslationY(0.0f);
                }
                c0111.f333.setVisibility(8);
                c0111.f333.setTransitioning(false);
                c0111.f338 = null;
                C0076 c0076 = c0111.f351;
                if (c0076 != null) {
                    c0076.mo278(c0111.f354);
                    c0111.f354 = null;
                    c0111.f351 = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = c0111.f334;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = AbstractC2270.f6593;
                    actionBarOverlayLayout.requestApplyInsets();
                }
                break;
            default:
                c0111.f338 = null;
                c0111.f333.requestLayout();
                break;
        }
    }
}
