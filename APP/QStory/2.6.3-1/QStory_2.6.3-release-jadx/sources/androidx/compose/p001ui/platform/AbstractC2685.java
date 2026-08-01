package androidx.compose.p001ui.platform;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p001ui.node.C2613;
import androidx.compose.runtime.C2198;
import androidx.compose.runtime.internal.C2077;
import androidx.compose.runtime.snapshots.AbstractC2115;
import com.davemorrissey.labs.subscaleview.C0328R;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import kotlin.coroutines.InterfaceC5192;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.channels.AbstractC6037;
import kotlinx.coroutines.channels.C6022;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2685 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ViewGroup.LayoutParams f5700 = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C2686 m4038(AbstractC2716 abstractC2716, C2738 c2738, C2077 c2077) {
        ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719;
        C2686 c2686;
        if (AbstractC2750.f6005.compareAndSet(false, true)) {
            final C6022 c6022M10841 = AbstractC6037.m10841(1, 6, null);
            AbstractC6231.m11036(AbstractC6231.m11048((InterfaceC5192) C2657.f5647.getValue()), null, null, new GlobalSnapshotManager$ensureStarted$1(c6022M10841, null), 3);
            InterfaceC7387 interfaceC7387 = new InterfaceC7387() { // from class: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m3999invoke(Object obj) {
                    if (AbstractC2750.f6004.compareAndSet(false, true)) {
                        c6022M10841.mo8995(C6008.f15084);
                    }
                }

                @Override // p068.InterfaceC7387
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m3999invoke(obj);
                    return C6008.f15084;
                }
            };
            synchronized (AbstractC2115.f4090) {
                AbstractC2115.f4096 = AbstractC5176.m9353(AbstractC2115.f4096, interfaceC7387);
            }
            AbstractC2115.m2823();
        }
        if (abstractC2716.getChildCount() > 0) {
            View childAt = abstractC2716.getChildAt(0);
            viewTreeObserverOnGlobalLayoutListenerC2719 = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC2719 ? (ViewTreeObserverOnGlobalLayoutListenerC2719) childAt : null;
            if (viewTreeObserverOnGlobalLayoutListenerC2719 != null) {
                viewTreeObserverOnGlobalLayoutListenerC2719.setComposeViewContext(c2738);
            }
            if (viewTreeObserverOnGlobalLayoutListenerC2719 == null) {
                viewTreeObserverOnGlobalLayoutListenerC2719 = new ViewTreeObserverOnGlobalLayoutListenerC2719(abstractC2716.getContext(), c2738);
                abstractC2716.addView(viewTreeObserverOnGlobalLayoutListenerC2719.getView(), f5700);
            }
            viewTreeObserverOnGlobalLayoutListenerC2719.setComposeViewContext(c2738);
            if (abstractC2716.getComposeViewContext$ui() != null) {
                c2738.m4160();
                viewTreeObserverOnGlobalLayoutListenerC2719.setComposeViewContextIncrementedDuringInit$ui(true);
            }
            int i = AbstractC2744.f5973;
            Object tag = viewTreeObserverOnGlobalLayoutListenerC2719.getTag(C0328R.id.wrapped_composition_tag);
            c2686 = tag instanceof C2686 ? (C2686) tag : null;
            if (c2686 == null) {
                c2686 = new C2686(viewTreeObserverOnGlobalLayoutListenerC2719, new C2198(c2738.f5943, new C2613(viewTreeObserverOnGlobalLayoutListenerC2719.getRoot())));
                viewTreeObserverOnGlobalLayoutListenerC2719.setTag(C0328R.id.wrapped_composition_tag, c2686);
            }
            c2686.m4039(c2077);
            viewTreeObserverOnGlobalLayoutListenerC2719.setFrameEndScheduler$ui(new C2687(c2738.f5943));
            return c2686;
        }
        abstractC2716.removeAllViews();
        viewTreeObserverOnGlobalLayoutListenerC2719 = null;
        if (viewTreeObserverOnGlobalLayoutListenerC2719 == null) {
        }
        viewTreeObserverOnGlobalLayoutListenerC2719.setComposeViewContext(c2738);
        if (abstractC2716.getComposeViewContext$ui() != null) {
        }
        int i2 = AbstractC2744.f5973;
        Object tag2 = viewTreeObserverOnGlobalLayoutListenerC2719.getTag(C0328R.id.wrapped_composition_tag);
        if (tag2 instanceof C2686) {
        }
        if (c2686 == null) {
        }
        c2686.m4039(c2077);
        viewTreeObserverOnGlobalLayoutListenerC2719.setFrameEndScheduler$ui(new C2687(c2738.f5943));
        return c2686;
    }
}
