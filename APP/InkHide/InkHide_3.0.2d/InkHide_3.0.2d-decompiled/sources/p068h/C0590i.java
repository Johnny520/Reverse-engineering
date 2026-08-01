package p068h;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import p061e.C0527c;
import p061e.C0531g;
import p061e.DialogInterfaceC0532h;

/* JADX INFO: renamed from: h.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0590i implements InterfaceC0607z, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b */
    public Context f2017b;

    /* JADX INFO: renamed from: c */
    public LayoutInflater f2018c;

    /* JADX INFO: renamed from: d */
    public MenuC0594m f2019d;

    /* JADX INFO: renamed from: e */
    public ExpandedMenuView f2020e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0606y f2021f;

    /* JADX INFO: renamed from: g */
    public C0589h f2022g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0590i(ContextWrapper contextWrapper) {
        this.f2017b = contextWrapper;
        this.f2018c = LayoutInflater.from(contextWrapper);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: b */
    public final void mo1147b(MenuC0594m menuC0594m, boolean z2) {
        InterfaceC0606y interfaceC0606y = this.f2021f;
        if (interfaceC0606y != null) {
            interfaceC0606y.mo132b(menuC0594m, z2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: c */
    public final void mo1148c() {
        C0589h c0589h = this.f2022g;
        if (c0589h != null) {
            c0589h.notifyDataSetChanged();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: d */
    public final boolean mo1177d(C0596o c0596o) {
        return false;
    }

    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: e */
    public final void mo1149e(InterfaceC0606y interfaceC0606y) {
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: g */
    public final void mo1178g(Context context, MenuC0594m menuC0594m) {
        if (this.f2017b != null) {
            this.f2017b = context;
            if (this.f2018c == null) {
                this.f2018c = LayoutInflater.from(context);
            }
        }
        this.f2019d = menuC0594m;
        C0589h c0589h = this.f2022g;
        if (c0589h != null) {
            c0589h.notifyDataSetChanged();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: i */
    public final boolean mo1150i() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: j */
    public final boolean mo1151j(SubMenuC0581F subMenuC0581F) {
        if (!subMenuC0581F.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0595n dialogInterfaceOnKeyListenerC0595n = new DialogInterfaceOnKeyListenerC0595n();
        dialogInterfaceOnKeyListenerC0595n.f2054b = subMenuC0581F;
        Context context = subMenuC0581F.f2030a;
        C0531g c0531g = new C0531g(context);
        C0527c c0527c = (C0527c) c0531g.f1747b;
        C0590i c0590i = new C0590i(c0527c.f1712a);
        dialogInterfaceOnKeyListenerC0595n.f2056d = c0590i;
        c0590i.f2021f = dialogInterfaceOnKeyListenerC0595n;
        subMenuC0581F.m1183b(c0590i, context);
        C0590i c0590i2 = dialogInterfaceOnKeyListenerC0595n.f2056d;
        if (c0590i2.f2022g == null) {
            c0590i2.f2022g = new C0589h(c0590i2);
        }
        c0527c.f1718g = c0590i2.f2022g;
        c0527c.f1719h = dialogInterfaceOnKeyListenerC0595n;
        View view = subMenuC0581F.f2044o;
        if (view != null) {
            c0527c.f1716e = view;
        } else {
            c0527c.f1714c = subMenuC0581F.f2043n;
            c0527c.f1715d = subMenuC0581F.f2042m;
        }
        c0527c.f1717f = dialogInterfaceOnKeyListenerC0595n;
        DialogInterfaceC0532h dialogInterfaceC0532hM1069a = c0531g.m1069a();
        dialogInterfaceOnKeyListenerC0595n.f2055c = dialogInterfaceC0532hM1069a;
        dialogInterfaceC0532hM1069a.setOnDismissListener(dialogInterfaceOnKeyListenerC0595n);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0595n.f2055c.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0595n.f2055c.show();
        InterfaceC0606y interfaceC0606y = this.f2021f;
        if (interfaceC0606y == null) {
            return true;
        }
        interfaceC0606y.mo142m(subMenuC0581F);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: k */
    public final boolean mo1179k(C0596o c0596o) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        this.f2019d.m1190q(this.f2022g.getItem(i2), this, 0);
    }
}
