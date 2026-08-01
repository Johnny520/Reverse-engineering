package androidx.compose.foundation.gestures;

import androidx.compose.p001ui.focus.C2287;
import androidx.compose.p001ui.focus.C2313;
import androidx.compose.p001ui.focus.FocusStateImpl;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1336 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1358 f1820;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1821;

    public /* synthetic */ C1336(C1358 c1358, int i) {
        this.f1821 = i;
        this.f1820 = c1358;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f1821;
        C1358 c1358 = this.f1820;
        switch (i) {
            case 0:
                return Boolean.valueOf(c1358.f6624);
            default:
                C2287 c2287 = c1358.f1866;
                if (!c2287.f6637.f6624) {
                    return null;
                }
                FocusStateImpl focusStateImplM3157 = c2287.m3157();
                if (!focusStateImplM3157.getHasFocus()) {
                    return null;
                }
                if (focusStateImplM3157.isFocused()) {
                    return c2287.m3155(null);
                }
                C2287 c2287M3203 = ((C2313) ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(c2287)).getFocusOwner()).m3203();
                if (c2287M3203 != null) {
                    return c2287M3203.m3155(AbstractC2620.m3909(c2287));
                }
                return null;
        }
    }
}
