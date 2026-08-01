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
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7779 implements InterfaceC7790, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public InterfaceC7789 f21131;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public ExpandedMenuView f21132;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C7780 f21133;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public LayoutInflater f21134;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public MenuC7802 f21135;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Context f21136;

    public C7779(ContextWrapper contextWrapper) {
        this.f21136 = contextWrapper;
        this.f21134 = LayoutInflater.from(contextWrapper);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f21135.m13162(this.f21133.getItem(i), this, 0);
    }

    @Override // p190.InterfaceC7790
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo609() {
        return false;
    }

    @Override // p190.InterfaceC7790
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo610(C7800 c7800) {
        return false;
    }

    @Override // p190.InterfaceC7790
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo611(Context context, MenuC7802 menuC7802) {
        if (this.f21136 != null) {
            this.f21136 = context;
            if (this.f21134 == null) {
                this.f21134 = LayoutInflater.from(context);
            }
        }
        this.f21135 = menuC7802;
        C7780 c7780 = this.f21133;
        if (c7780 != null) {
            c7780.notifyDataSetChanged();
        }
    }

    @Override // p190.InterfaceC7790
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo612(SubMenuC7775 subMenuC7775) {
        boolean zHasVisibleItems = subMenuC7775.hasVisibleItems();
        Context context = subMenuC7775.f21269;
        if (!zHasVisibleItems) {
            return false;
        }
        DialogInterfaceOnKeyListenerC7799 dialogInterfaceOnKeyListenerC7799 = new DialogInterfaceOnKeyListenerC7799();
        dialogInterfaceOnKeyListenerC7799.f21215 = subMenuC7775;
        C0107 c0107 = new C0107(context);
        C0084 c0084 = (C0084) c0107.f315;
        C7779 c7779 = new C7779(c0084.f250);
        dialogInterfaceOnKeyListenerC7799.f21214 = c7779;
        c7779.f21131 = dialogInterfaceOnKeyListenerC7799;
        subMenuC7775.m13155(c7779, context);
        C7779 c77792 = dialogInterfaceOnKeyListenerC7799.f21214;
        if (c77792.f21133 == null) {
            c77792.f21133 = new C7780(c77792);
        }
        c0084.f252 = c77792.f21133;
        c0084.f251 = dialogInterfaceOnKeyListenerC7799;
        View view = subMenuC7775.f21249;
        if (view != null) {
            c0084.f246 = view;
        } else {
            c0084.f248 = subMenuC7775.f21250;
            c0084.f247 = subMenuC7775.f21251;
        }
        c0084.f245 = dialogInterfaceOnKeyListenerC7799;
        DialogInterfaceC0104 dialogInterfaceC0104M338 = c0107.m338();
        dialogInterfaceOnKeyListenerC7799.f21213 = dialogInterfaceC0104M338;
        dialogInterfaceC0104M338.setOnDismissListener(dialogInterfaceOnKeyListenerC7799);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC7799.f21213.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC7799.f21213.show();
        InterfaceC7789 interfaceC7789 = this.f21131;
        if (interfaceC7789 == null) {
            return true;
        }
        interfaceC7789.mo197(subMenuC7775);
        return true;
    }

    @Override // p190.InterfaceC7790
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo613(MenuC7802 menuC7802, boolean z) {
        InterfaceC7789 interfaceC7789 = this.f21131;
        if (interfaceC7789 != null) {
            interfaceC7789.mo190(menuC7802, z);
        }
    }

    @Override // p190.InterfaceC7790
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo614() {
        C7780 c7780 = this.f21133;
        if (c7780 != null) {
            c7780.notifyDataSetChanged();
        }
    }

    @Override // p190.InterfaceC7790
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo701(InterfaceC7789 interfaceC7789) {
        throw null;
    }

    @Override // p190.InterfaceC7790
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo615(C7800 c7800) {
        return false;
    }
}
