package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: renamed from: yo */
/* JADX INFO: loaded from: classes.dex */
public final class C2768yo implements InterfaceC0163Dr, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public Context f9409a;

    /* JADX INFO: renamed from: b */
    public LayoutInflater f9410b;

    /* JADX INFO: renamed from: c */
    public MenuC2204lr f9411c;

    /* JADX INFO: renamed from: d */
    public ExpandedMenuView f9412d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0120Cr f9413e;

    /* JADX INFO: renamed from: f */
    public C2725xo f9414f;

    public C2768yo(Context context) {
        this.f9409a = context;
        this.f9410b = LayoutInflater.from(context);
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: b */
    public final void mo213b(MenuC2204lr menuC2204lr, boolean z) {
        InterfaceC0120Cr interfaceC0120Cr = this.f9413e;
        if (interfaceC0120Cr != null) {
            interfaceC0120Cr.mo193b(menuC2204lr, z);
        }
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: d */
    public final boolean mo215d(C2427qr c2427qr) {
        return false;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: e */
    public final void mo216e(InterfaceC0120Cr interfaceC0120Cr) {
        throw null;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: f */
    public final boolean mo217f(C2427qr c2427qr) {
        return false;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: g */
    public final void mo218g() {
        C2725xo c2725xo = this.f9414f;
        if (c2725xo != null) {
            c2725xo.notifyDataSetChanged();
        }
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: i */
    public final void mo220i(Context context, MenuC2204lr menuC2204lr) {
        if (this.f9409a != null) {
            this.f9409a = context;
            if (this.f9410b == null) {
                this.f9410b = LayoutInflater.from(context);
            }
        }
        this.f9411c = menuC2204lr;
        C2725xo c2725xo = this.f9414f;
        if (c2725xo != null) {
            c2725xo.notifyDataSetChanged();
        }
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: j */
    public final boolean mo221j(SubMenuC0214Ez subMenuC0214Ez) {
        boolean zHasVisibleItems = subMenuC0214Ez.hasVisibleItems();
        Context context = subMenuC0214Ez.f7660a;
        if (!zHasVisibleItems) {
            return false;
        }
        DialogInterfaceOnKeyListenerC2247mr dialogInterfaceOnKeyListenerC2247mr = new DialogInterfaceOnKeyListenerC2247mr();
        dialogInterfaceOnKeyListenerC2247mr.f7948a = subMenuC0214Ez;
        C2654w2 c2654w2 = new C2654w2(context);
        C2768yo c2768yo = new C2768yo(c2654w2.getContext());
        dialogInterfaceOnKeyListenerC2247mr.f7950c = c2768yo;
        c2768yo.f9413e = dialogInterfaceOnKeyListenerC2247mr;
        subMenuC0214Ez.m4429b(c2768yo, context);
        C2768yo c2768yo2 = dialogInterfaceOnKeyListenerC2247mr.f7950c;
        if (c2768yo2.f9414f == null) {
            c2768yo2.f9414f = new C2725xo(c2768yo2);
        }
        C2725xo c2725xo = c2768yo2.f9414f;
        C2482s2 c2482s2 = c2654w2.f9188a;
        c2482s2.f8728k = c2725xo;
        c2482s2.f8729l = dialogInterfaceOnKeyListenerC2247mr;
        View view = subMenuC0214Ez.f7674o;
        if (view != null) {
            c2482s2.f8722e = view;
        } else {
            c2482s2.f8720c = subMenuC0214Ez.f7673n;
            c2654w2.setTitle(subMenuC0214Ez.f7672m);
        }
        c2482s2.f8727j = dialogInterfaceOnKeyListenerC2247mr;
        DialogInterfaceC2697x2 dialogInterfaceC2697x2Create = c2654w2.create();
        dialogInterfaceOnKeyListenerC2247mr.f7949b = dialogInterfaceC2697x2Create;
        dialogInterfaceC2697x2Create.setOnDismissListener(dialogInterfaceOnKeyListenerC2247mr);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC2247mr.f7949b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC2247mr.f7949b.show();
        InterfaceC0120Cr interfaceC0120Cr = this.f9413e;
        if (interfaceC0120Cr == null) {
            return true;
        }
        interfaceC0120Cr.mo194s(subMenuC0214Ez);
        return true;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: k */
    public final boolean mo222k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f9411c.m4436q(this.f9414f.getItem(i), this, 0);
    }
}
