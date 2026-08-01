package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.appcompat.app.C0065;
import androidx.core.view.InterfaceC2253;
import androidx.fragment.app.C2325;
import java.util.Iterator;
import p190.InterfaceC7797;
import p190.MenuC7802;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0138 implements InterfaceC0200, InterfaceC7797 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Toolbar f598;

    public /* synthetic */ C0138(Toolbar toolbar) {
        this.f598 = toolbar;
    }

    @Override // p190.InterfaceC7797
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public void mo204(MenuC7802 menuC7802) {
        Toolbar toolbar = this.f598;
        C0197 c0197 = toolbar.f511.f457;
        if (c0197 == null || !c0197.m702()) {
            Iterator it = toolbar.f480.f6559.iterator();
            while (it.hasNext()) {
                ((C2325) ((InterfaceC2253) it.next())).f6826.m4391();
            }
        }
        C0065 c0065 = toolbar.f516;
        if (c0065 != null) {
            c0065.mo204(menuC7802);
        }
    }

    @Override // p190.InterfaceC7797
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public boolean mo205(MenuC7802 menuC7802, MenuItem menuItem) {
        return false;
    }
}
