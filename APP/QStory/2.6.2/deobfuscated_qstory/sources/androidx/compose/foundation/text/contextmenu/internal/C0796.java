package androidx.compose.foundation.text.contextmenu.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import androidx.compose.foundation.lazy.layout.C0713;
import kotlin.C5175;
import p052.InterfaceC6542;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0796 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0814 f2276;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2277;

    public /* synthetic */ C0796(C0814 c0814, int i) {
        this.f2277 = i;
        this.f2276 = c0814;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f2277;
        C5175 c5175 = C5175.f14739;
        C0814 c0814 = this.f2276;
        switch (i) {
            case 0:
                InterfaceC6542 interfaceC6542 = (InterfaceC6542) obj;
                View view = c0814.f2324;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC6542.invoke();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC0813(interfaceC6542, 1));
                    }
                }
                return c5175;
            case 1:
                ActionMode actionMode = c0814.f2325;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return c5175;
            case 2:
                ActionMode actionMode2 = c0814.f2325;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return c5175;
            default:
                c0814.f2320.m2235();
                return new C0713(c0814, 5);
        }
    }
}
