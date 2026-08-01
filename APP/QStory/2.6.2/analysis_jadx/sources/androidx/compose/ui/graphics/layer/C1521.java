package androidx.compose.ui.graphics.layer;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1521 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f4386;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.f4386) {
            case 0:
                if (!(view instanceof C1519) || (outline2 = ((C1519) view).f4377) == null) {
                    return;
                }
                outline.set(outline2);
                return;
            case 1:
                view.getClass();
                throw new ClassCastException();
            case 2:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 3:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            default:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                return;
        }
    }
}
