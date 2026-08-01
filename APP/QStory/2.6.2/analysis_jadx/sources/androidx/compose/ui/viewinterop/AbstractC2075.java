package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.C1748;
import io.ktor.client.plugins.api.C3885;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2075 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C3885 f6143 = new C3885(6);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m3807(View view, C1748 c1748) {
        long jMo3066 = c1748.f5093.f5285.mo3066(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jMo3066 >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jMo3066 & 4294967295L)));
        view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final View m3808(AbstractC2128 abstractC2128) {
        AbstractC2076 abstractC2076 = AbstractC1785.m3336(abstractC2128.f6291).f5115;
        View interopView = abstractC2076 != null ? abstractC2076.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        C5919.m11250("Could not fetch interop view");
        return null;
    }
}
