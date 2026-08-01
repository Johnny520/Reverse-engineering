package androidx.compose.ui.scrollcapture;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.foundation.text.selection.AbstractC0921;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.layout.AbstractC1670;
import androidx.compose.ui.node.AbstractC1794;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import androidx.compose.ui.semantics.C1951;
import java.util.Arrays;
import java.util.function.Consumer;
import kotlin.coroutines.InterfaceC4359;
import kotlinx.coroutines.AbstractC5398;
import p052.InterfaceC6557;
import p112.C7327;
import p175.AbstractC7738;
import p205.C7904;
import p251.AbstractC8174;

/* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1928 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1395 f5677 = AbstractC1367.m2465(Boolean.FALSE);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3626(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884, C1951 c1951, InterfaceC4359 interfaceC4359, Consumer consumer) {
        C1224 c1224 = new C1224(0, new C1927[16]);
        AbstractC0455.m1147(c1951.m3641(), 0, new ScrollCapture$onScrollCaptureSearch$1(c1224));
        Arrays.sort(c1224.f3520, 0, c1224.f3519, AbstractC7738.m13041(new InterfaceC6557() { // from class: androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$2
            @Override // p052.InterfaceC6557
            public final Comparable<?> invoke(C1927 c1927) {
                return Integer.valueOf(c1927.f5675);
            }
        }, new InterfaceC6557() { // from class: androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$3
            @Override // p052.InterfaceC6557
            public final Comparable<?> invoke(C1927 c1927) {
                C7904 c7904 = c1927.f5674;
                return Integer.valueOf(c7904.f21878 - c7904.f21880);
            }
        }));
        int i = c1224.f3519;
        C1927 c1927 = (C1927) (i == 0 ? null : c1224.f3520[i - 1]);
        if (c1927 == null) {
            return;
        }
        C7904 c7904 = c1927.f5674;
        ScrollCaptureCallbackC1932 scrollCaptureCallbackC1932 = new ScrollCaptureCallbackC1932(c1927.f5676, c7904, AbstractC5398.m10485(interfaceC4359), this, viewTreeObserverOnGlobalLayoutListenerC1884);
        AbstractC1794 abstractC1794 = c1927.f5673;
        C7327 c7327Mo3079 = AbstractC1670.m3103(abstractC1794).mo3079(abstractC1794, true);
        long jM13327 = c7904.m13327();
        ScrollCaptureTarget scrollCaptureTargetM1847 = AbstractC0921.m1847(viewTreeObserverOnGlobalLayoutListenerC1884, AbstractC1581.m2878(AbstractC8174.m13602(c7327Mo3079)), new Point((int) (jM13327 >> 32), (int) (jM13327 & 4294967295L)), scrollCaptureCallbackC1932);
        scrollCaptureTargetM1847.setScrollBounds(AbstractC1581.m2878(c7904));
        consumer.accept(scrollCaptureTargetM1847);
    }
}
