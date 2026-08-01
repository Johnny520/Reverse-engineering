package androidx.compose.p001ui.viewinterop;

import android.view.View;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.C2583;
import io.ktor.client.plugins.api.C4718;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2908 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4718 f6489 = new C4718(6);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m4377(View view, C2583 c2583) {
        long jMo3636 = c2583.f5439.f5631.mo3636(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jMo3636 >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jMo3636 & 4294967295L)));
        view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final View m4378(AbstractC2961 abstractC2961) {
        AbstractC2909 abstractC2909 = AbstractC2620.m3906(abstractC2961.f6637).f5461;
        View interopView = abstractC2909 != null ? abstractC2909.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        C6755.m11870("Could not fetch interop view");
        return null;
    }
}
