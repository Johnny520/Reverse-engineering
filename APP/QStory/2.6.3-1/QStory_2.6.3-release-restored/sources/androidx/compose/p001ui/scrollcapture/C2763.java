package androidx.compose.p001ui.scrollcapture;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import androidx.compose.foundation.text.selection.AbstractC1759;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.layout.AbstractC2505;
import androidx.compose.p001ui.node.AbstractC2629;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.p001ui.semantics.C2786;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.collection.C2059;
import com.bumptech.glide.AbstractC3888;
import java.util.Arrays;
import java.util.function.Consumer;
import kotlin.coroutines.InterfaceC5192;
import kotlinx.coroutines.AbstractC6231;
import p068.InterfaceC7387;
import p128.C8157;
import p221.C8734;
import p332.C9496;

/* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2763 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC2230 f6023 = AbstractC2202.m3034(Boolean.FALSE);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4196(ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719, C2786 c2786, InterfaceC5192 interfaceC5192, Consumer consumer) {
        C2059 c2059 = new C2059(0, new C2762[16]);
        C9496.m14926(c2786.m4211(), 0, new ScrollCapture$onScrollCaptureSearch$1(c2059));
        Arrays.sort(c2059.f3866, 0, c2059.f3865, AbstractC3888.m7278(new InterfaceC7387() { // from class: androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$2
            @Override // p068.InterfaceC7387
            public final Comparable<?> invoke(C2762 c2762) {
                return Integer.valueOf(c2762.f6021);
            }
        }, new InterfaceC7387() { // from class: androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$3
            @Override // p068.InterfaceC7387
            public final Comparable<?> invoke(C2762 c2762) {
                C8734 c8734 = c2762.f6020;
                return Integer.valueOf(c8734.f22220 - c8734.f22222);
            }
        }));
        int i = c2059.f3865;
        C2762 c2762 = (C2762) (i == 0 ? null : c2059.f3866[i - 1]);
        if (c2762 == null) {
            return;
        }
        C8734 c8734 = c2762.f6020;
        ScrollCaptureCallbackC2767 scrollCaptureCallbackC2767 = new ScrollCaptureCallbackC2767(c2762.f6022, c8734, AbstractC6231.m11048(interfaceC5192), this, viewTreeObserverOnGlobalLayoutListenerC2719);
        AbstractC2629 abstractC2629 = c2762.f6019;
        C8157 c8157Mo3649 = AbstractC2505.m3673(abstractC2629).mo3649(abstractC2629, true);
        long jM13914 = c8734.m13914();
        ScrollCaptureTarget scrollCaptureTargetM2417 = AbstractC1759.m2417(viewTreeObserverOnGlobalLayoutListenerC2719, AbstractC2416.m3448(C9496.m14922(c8157Mo3649)), new Point((int) (jM13914 >> 32), (int) (jM13914 & 4294967295L)), scrollCaptureCallbackC2767);
        scrollCaptureTargetM2417.setScrollBounds(AbstractC2416.m3448(c8734));
        consumer.accept(scrollCaptureTargetM2417);
    }
}
