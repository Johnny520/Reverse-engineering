package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: renamed from: dr */
/* JADX INFO: loaded from: classes.dex */
public final class C0160dr implements InterfaceC0164dv, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public Context f1622a;

    /* JADX INFO: renamed from: b */
    public LayoutInflater f1623b;

    /* JADX INFO: renamed from: c */
    public MenuC0424ku f1624c;

    /* JADX INFO: renamed from: d */
    public ExpandedMenuView f1625d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0128cv f1626e;

    /* JADX INFO: renamed from: f */
    public C0124cr f1627f;

    public C0160dr(ContextWrapper contextWrapper) {
        this.f1622a = contextWrapper;
        this.f1623b = LayoutInflater.from(contextWrapper);
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: a */
    public final void mo949a(MenuC0424ku menuC0424ku, boolean z) {
        InterfaceC0128cv interfaceC0128cv = this.f1626e;
        if (interfaceC0128cv != null) {
            interfaceC0128cv.mo829a(menuC0424ku, z);
        }
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: c */
    public final boolean mo950c() {
        return false;
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: d */
    public final boolean mo951d(C0572ou c0572ou) {
        return false;
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: e */
    public final void mo952e(InterfaceC0128cv interfaceC0128cv) {
        throw null;
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: g */
    public final boolean mo953g(C0572ou c0572ou) {
        return false;
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: h */
    public final void mo954h() {
        C0124cr c0124cr = this.f1627f;
        if (c0124cr != null) {
            c0124cr.notifyDataSetChanged();
        }
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: i */
    public final void mo955i(Context context, MenuC0424ku menuC0424ku) {
        if (this.f1622a != null) {
            this.f1622a = context;
            if (this.f1623b == null) {
                this.f1623b = LayoutInflater.from(context);
            }
        }
        this.f1624c = menuC0424ku;
        C0124cr c0124cr = this.f1627f;
        if (c0124cr != null) {
            c0124cr.notifyDataSetChanged();
        }
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: k */
    public final boolean mo956k(c50 c50Var) {
        boolean zHasVisibleItems = c50Var.hasVisibleItems();
        Context context = c50Var.f2950a;
        if (!zHasVisibleItems) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0461lu dialogInterfaceOnKeyListenerC0461lu = new DialogInterfaceOnKeyListenerC0461lu();
        dialogInterfaceOnKeyListenerC0461lu.f3104a = c50Var;
        C0209f2 c0209f2 = new C0209f2(context);
        C0053b2 c0053b2 = (C0053b2) c0209f2.f1872b;
        C0160dr c0160dr = new C0160dr(c0053b2.f715a);
        dialogInterfaceOnKeyListenerC0461lu.f3106c = c0160dr;
        c0160dr.f1626e = dialogInterfaceOnKeyListenerC0461lu;
        c50Var.m1717b(c0160dr, context);
        C0160dr c0160dr2 = dialogInterfaceOnKeyListenerC0461lu.f3106c;
        if (c0160dr2.f1627f == null) {
            c0160dr2.f1627f = new C0124cr(c0160dr2);
        }
        c0053b2.f721g = c0160dr2.f1627f;
        c0053b2.f722h = dialogInterfaceOnKeyListenerC0461lu;
        View view = c50Var.f2964o;
        if (view != null) {
            c0053b2.f719e = view;
        } else {
            c0053b2.f717c = c50Var.f2963n;
            c0053b2.f718d = c50Var.f2962m;
        }
        c0053b2.f720f = dialogInterfaceOnKeyListenerC0461lu;
        DialogC0246g2 dialogC0246g2M1133a = c0209f2.m1133a();
        dialogInterfaceOnKeyListenerC0461lu.f3105b = dialogC0246g2M1133a;
        dialogC0246g2M1133a.setOnDismissListener(dialogInterfaceOnKeyListenerC0461lu);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0461lu.f3105b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0461lu.f3105b.show();
        InterfaceC0128cv interfaceC0128cv = this.f1626e;
        if (interfaceC0128cv == null) {
            return true;
        }
        interfaceC0128cv.mo830q(c50Var);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f1624c.m1724q(this.f1627f.getItem(i), this, 0);
    }
}
