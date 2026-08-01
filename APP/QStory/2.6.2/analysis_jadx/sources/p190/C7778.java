package p190;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.app.C0084;
import androidx.appcompat.app.C0107;
import androidx.appcompat.app.DialogInterfaceC0104;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7778 implements InterfaceC7789, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public InterfaceC7788 f21134;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public ExpandedMenuView f21135;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C7779 f21136;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public LayoutInflater f21137;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public MenuC7801 f21138;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Context f21139;

    public C7778(ContextWrapper contextWrapper) {
        this.f21139 = contextWrapper;
        this.f21137 = LayoutInflater.from(contextWrapper);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f21138.m13134(this.f21136.getItem(i), this, 0);
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo608() {
        return false;
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo609(C7799 c7799) {
        return false;
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo610(Context context, MenuC7801 menuC7801) {
        if (this.f21139 != null) {
            this.f21139 = context;
            if (this.f21137 == null) {
                this.f21137 = LayoutInflater.from(context);
            }
        }
        this.f21138 = menuC7801;
        C7779 c7779 = this.f21136;
        if (c7779 != null) {
            c7779.notifyDataSetChanged();
        }
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo611(SubMenuC7774 subMenuC7774) {
        boolean zHasVisibleItems = subMenuC7774.hasVisibleItems();
        Context context = subMenuC7774.f21272;
        if (!zHasVisibleItems) {
            return false;
        }
        DialogInterfaceOnKeyListenerC7798 dialogInterfaceOnKeyListenerC7798 = new DialogInterfaceOnKeyListenerC7798();
        dialogInterfaceOnKeyListenerC7798.f21218 = subMenuC7774;
        C0107 c0107 = new C0107(context);
        C0084 c0084 = (C0084) c0107.f315;
        C7778 c7778 = new C7778(c0084.f250);
        dialogInterfaceOnKeyListenerC7798.f21217 = c7778;
        c7778.f21134 = dialogInterfaceOnKeyListenerC7798;
        subMenuC7774.m13127(c7778, context);
        C7778 c77782 = dialogInterfaceOnKeyListenerC7798.f21217;
        if (c77782.f21136 == null) {
            c77782.f21136 = new C7779(c77782);
        }
        c0084.f252 = c77782.f21136;
        c0084.f251 = dialogInterfaceOnKeyListenerC7798;
        View view = subMenuC7774.f21252;
        if (view != null) {
            c0084.f246 = view;
        } else {
            c0084.f248 = subMenuC7774.f21253;
            c0084.f247 = subMenuC7774.f21254;
        }
        c0084.f245 = dialogInterfaceOnKeyListenerC7798;
        DialogInterfaceC0104 dialogInterfaceC0104M337 = c0107.m337();
        dialogInterfaceOnKeyListenerC7798.f21216 = dialogInterfaceC0104M337;
        dialogInterfaceC0104M337.setOnDismissListener(dialogInterfaceOnKeyListenerC7798);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC7798.f21216.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC7798.f21216.show();
        InterfaceC7788 interfaceC7788 = this.f21134;
        if (interfaceC7788 == null) {
            return true;
        }
        interfaceC7788.mo196(subMenuC7774);
        return true;
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo612(MenuC7801 menuC7801, boolean z) {
        InterfaceC7788 interfaceC7788 = this.f21134;
        if (interfaceC7788 != null) {
            interfaceC7788.mo189(menuC7801, z);
        }
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo613() {
        C7779 c7779 = this.f21136;
        if (c7779 != null) {
            c7779.notifyDataSetChanged();
        }
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo700(InterfaceC7788 interfaceC7788) {
        throw null;
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo614(C7799 c7799) {
        return false;
    }
}
