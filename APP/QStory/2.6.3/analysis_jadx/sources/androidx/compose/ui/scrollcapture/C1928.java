package androidx.compose.ui.scrollcapture;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import androidx.compose.foundation.text.selection.AbstractC0921;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.layout.AbstractC1670;
import androidx.compose.ui.node.AbstractC1794;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import androidx.compose.ui.semantics.C1951;
import com.bumptech.glide.AbstractC3056;
import java.util.Arrays;
import java.util.function.Consumer;
import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.AbstractC5399;
import p052.InterfaceC6558;
import p112.C7328;
import p205.C7905;
import p316.C8667;

/* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1928 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1395 f5678 = AbstractC1367.m2474(Boolean.FALSE);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3636(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884, C1951 c1951, InterfaceC4360 interfaceC4360, Consumer consumer) {
        C1224 c1224 = new C1224(0, new C1927[16]);
        C8667.m14367(c1951.m3651(), 0, new ScrollCapture$onScrollCaptureSearch$1(c1224));
        Arrays.sort(c1224.f3521, 0, c1224.f3520, AbstractC3056.m6718(new InterfaceC6558() { // from class: androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$2
            @Override // p052.InterfaceC6558
            public final Comparable<?> invoke(C1927 c1927) {
                return Integer.valueOf(c1927.f5676);
            }
        }, new InterfaceC6558() { // from class: androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$3
            @Override // p052.InterfaceC6558
            public final Comparable<?> invoke(C1927 c1927) {
                C7905 c7905 = c1927.f5675;
                return Integer.valueOf(c7905.f21875 - c7905.f21877);
            }
        }));
        int i = c1224.f3520;
        C1927 c1927 = (C1927) (i == 0 ? null : c1224.f3521[i - 1]);
        if (c1927 == null) {
            return;
        }
        C7905 c7905 = c1927.f5675;
        ScrollCaptureCallbackC1932 scrollCaptureCallbackC1932 = new ScrollCaptureCallbackC1932(c1927.f5677, c7905, AbstractC5399.m10489(interfaceC4360), this, viewTreeObserverOnGlobalLayoutListenerC1884);
        AbstractC1794 abstractC1794 = c1927.f5674;
        C7328 c7328Mo3089 = AbstractC1670.m3113(abstractC1794).mo3089(abstractC1794, true);
        long jM13355 = c7905.m13355();
        ScrollCaptureTarget scrollCaptureTargetM1857 = AbstractC0921.m1857(viewTreeObserverOnGlobalLayoutListenerC1884, AbstractC1581.m2888(C8667.m14363(c7328Mo3089)), new Point((int) (jM13355 >> 32), (int) (jM13355 & 4294967295L)), scrollCaptureCallbackC1932);
        scrollCaptureTargetM1857.setScrollBounds(AbstractC1581.m2888(c7905));
        consumer.accept(scrollCaptureTargetM1857);
    }
}
