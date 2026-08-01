package androidx.compose.foundation.text.contextmenu.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import androidx.compose.foundation.lazy.layout.C1554;
import kotlin.C6008;
import p068.InterfaceC7372;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1636 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1654 f2622;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2623;

    public /* synthetic */ C1636(C1654 c1654, int i) {
        this.f2623 = i;
        this.f2622 = c1654;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f2623;
        C6008 c6008 = C6008.f15084;
        C1654 c1654 = this.f2622;
        switch (i) {
            case 0:
                InterfaceC7372 interfaceC7372 = (InterfaceC7372) obj;
                View view = c1654.f2670;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC7372.invoke();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC1653(interfaceC7372, 1));
                    }
                }
                return c6008;
            case 1:
                ActionMode actionMode = c1654.f2671;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return c6008;
            case 2:
                ActionMode actionMode2 = c1654.f2671;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return c6008;
            default:
                c1654.f2666.m2805();
                return new C1554(c1654, 5);
        }
    }
}
