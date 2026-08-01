package p206;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.app.C0931;
import androidx.appcompat.app.C0954;
import androidx.appcompat.app.DialogInterfaceC0951;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8608 implements InterfaceC8619, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public InterfaceC8618 f21476;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public ExpandedMenuView f21477;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C8609 f21478;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public LayoutInflater f21479;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public MenuC8631 f21480;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Context f21481;

    public C8608(ContextWrapper contextWrapper) {
        this.f21481 = contextWrapper;
        this.f21479 = LayoutInflater.from(contextWrapper);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f21480.m13721(this.f21478.getItem(i), this, 0);
    }

    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo1169() {
        return false;
    }

    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo1170(C8629 c8629) {
        return false;
    }

    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo1171(Context context, MenuC8631 menuC8631) {
        if (this.f21481 != null) {
            this.f21481 = context;
            if (this.f21479 == null) {
                this.f21479 = LayoutInflater.from(context);
            }
        }
        this.f21480 = menuC8631;
        C8609 c8609 = this.f21478;
        if (c8609 != null) {
            c8609.notifyDataSetChanged();
        }
    }

    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo1172(SubMenuC8604 subMenuC8604) {
        boolean zHasVisibleItems = subMenuC8604.hasVisibleItems();
        Context context = subMenuC8604.f21614;
        if (!zHasVisibleItems) {
            return false;
        }
        DialogInterfaceOnKeyListenerC8628 dialogInterfaceOnKeyListenerC8628 = new DialogInterfaceOnKeyListenerC8628();
        dialogInterfaceOnKeyListenerC8628.f21560 = subMenuC8604;
        C0954 c0954 = new C0954(context);
        C0931 c0931 = (C0931) c0954.f660;
        C8608 c8608 = new C8608(c0931.f595);
        dialogInterfaceOnKeyListenerC8628.f21559 = c8608;
        c8608.f21476 = dialogInterfaceOnKeyListenerC8628;
        subMenuC8604.m13714(c8608, context);
        C8608 c86082 = dialogInterfaceOnKeyListenerC8628.f21559;
        if (c86082.f21478 == null) {
            c86082.f21478 = new C8609(c86082);
        }
        c0931.f597 = c86082.f21478;
        c0931.f596 = dialogInterfaceOnKeyListenerC8628;
        View view = subMenuC8604.f21594;
        if (view != null) {
            c0931.f591 = view;
        } else {
            c0931.f593 = subMenuC8604.f21595;
            c0931.f592 = subMenuC8604.f21596;
        }
        c0931.f590 = dialogInterfaceOnKeyListenerC8628;
        DialogInterfaceC0951 dialogInterfaceC0951M898 = c0954.m898();
        dialogInterfaceOnKeyListenerC8628.f21558 = dialogInterfaceC0951M898;
        dialogInterfaceC0951M898.setOnDismissListener(dialogInterfaceOnKeyListenerC8628);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC8628.f21558.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC8628.f21558.show();
        InterfaceC8618 interfaceC8618 = this.f21476;
        if (interfaceC8618 == null) {
            return true;
        }
        interfaceC8618.mo757(subMenuC8604);
        return true;
    }

    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo1173(MenuC8631 menuC8631, boolean z) {
        InterfaceC8618 interfaceC8618 = this.f21476;
        if (interfaceC8618 != null) {
            interfaceC8618.mo750(menuC8631, z);
        }
    }

    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo1174() {
        C8609 c8609 = this.f21478;
        if (c8609 != null) {
            c8609.notifyDataSetChanged();
        }
    }

    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo1261(InterfaceC8618 interfaceC8618) {
        throw null;
    }

    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo1175(C8629 c8629) {
        return false;
    }
}
