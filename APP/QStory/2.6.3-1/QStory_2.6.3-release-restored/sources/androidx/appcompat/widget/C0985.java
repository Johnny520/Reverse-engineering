package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.appcompat.app.C0912;
import androidx.core.view.InterfaceC3086;
import androidx.fragment.app.C3158;
import java.util.Iterator;
import p206.InterfaceC8626;
import p206.MenuC8631;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0985 implements InterfaceC1047, InterfaceC8626 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Toolbar f943;

    public /* synthetic */ C0985(Toolbar toolbar) {
        this.f943 = toolbar;
    }

    @Override // p206.InterfaceC8626
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public void mo764(MenuC8631 menuC8631) {
        Toolbar toolbar = this.f943;
        C1044 c1044 = toolbar.f856.f802;
        if (c1044 == null || !c1044.m1262()) {
            Iterator it = toolbar.f825.f6904.iterator();
            while (it.hasNext()) {
                ((C3158) ((InterfaceC3086) it.next())).f7171.m4951();
            }
        }
        C0912 c0912 = toolbar.f861;
        if (c0912 != null) {
            c0912.mo764(menuC8631);
        }
    }

    @Override // p206.InterfaceC8626
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public boolean mo765(MenuC8631 menuC8631, MenuItem menuItem) {
        return false;
    }
}
