package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.C1748;
import io.ktor.client.plugins.api.C3886;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2075 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C3886 f6144 = new C3886(6);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m3817(View view, C1748 c1748) {
        long jMo3076 = c1748.f5094.f5286.mo3076(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jMo3076 >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jMo3076 & 4294967295L)));
        view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final View m3818(AbstractC2128 abstractC2128) {
        AbstractC2076 abstractC2076 = AbstractC1785.m3346(abstractC2128.f6292).f5116;
        View interopView = abstractC2076 != null ? abstractC2076.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        C5925.m11311("Could not fetch interop view");
        return null;
    }
}
