package androidx.compose.foundation.text.contextmenu.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import androidx.compose.foundation.lazy.layout.C0713;
import kotlin.C5176;
import p052.InterfaceC6543;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0796 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0814 f2277;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2278;

    public /* synthetic */ C0796(C0814 c0814, int i) {
        this.f2278 = i;
        this.f2277 = c0814;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f2278;
        C5176 c5176 = C5176.f14739;
        C0814 c0814 = this.f2277;
        switch (i) {
            case 0:
                InterfaceC6543 interfaceC6543 = (InterfaceC6543) obj;
                View view = c0814.f2325;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC6543.invoke();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC0813(interfaceC6543, 1));
                    }
                }
                return c5176;
            case 1:
                ActionMode actionMode = c0814.f2326;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return c5176;
            case 2:
                ActionMode actionMode2 = c0814.f2326;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return c5176;
            default:
                c0814.f2321.m2245();
                return new C0713(c0814, 5);
        }
    }
}
