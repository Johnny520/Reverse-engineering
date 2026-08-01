package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: renamed from: hr */
/* JADX INFO: loaded from: classes.dex */
public final class C0308hr implements InterfaceC0462lv, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public Context f2252a;

    /* JADX INFO: renamed from: b */
    public LayoutInflater f2253b;

    /* JADX INFO: renamed from: c */
    public MenuC0646qu f2254c;

    /* JADX INFO: renamed from: d */
    public ExpandedMenuView f2255d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0425kv f2256e;

    /* JADX INFO: renamed from: f */
    public C0271gr f2257f;

    public C0308hr(ContextWrapper contextWrapper) {
        this.f2252a = contextWrapper;
        this.f2253b = LayoutInflater.from(contextWrapper);
    }

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: a */
    public final void mo972a(MenuC0646qu menuC0646qu, boolean z) {
        InterfaceC0425kv interfaceC0425kv = this.f2256e;
        if (interfaceC0425kv != null) {
            interfaceC0425kv.mo1134a(menuC0646qu, z);
        }
    }

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: c */
    public final boolean mo974c() {
        return false;
    }

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: d */
    public final boolean mo530d(C0869wu c0869wu) {
        return false;
    }

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: e */
    public final void mo975e(InterfaceC0425kv interfaceC0425kv) {
        throw null;
    }

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: g */
    public final boolean mo531g(C0869wu c0869wu) {
        return false;
    }

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: h */
    public final void mo977h() {
        C0271gr c0271gr = this.f2257f;
        if (c0271gr != null) {
            c0271gr.notifyDataSetChanged();
        }
    }

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: i */
    public final void mo532i(Context context, MenuC0646qu menuC0646qu) {
        if (this.f2252a != null) {
            this.f2252a = context;
            if (this.f2253b == null) {
                this.f2253b = LayoutInflater.from(context);
            }
        }
        this.f2254c = menuC0646qu;
        C0271gr c0271gr = this.f2257f;
        if (c0271gr != null) {
            c0271gr.notifyDataSetChanged();
        }
    }

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: k */
    public final boolean mo979k(j50 j50Var) {
        boolean zHasVisibleItems = j50Var.hasVisibleItems();
        Context context = j50Var.f3951a;
        if (!zHasVisibleItems) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0683ru dialogInterfaceOnKeyListenerC0683ru = new DialogInterfaceOnKeyListenerC0683ru();
        dialogInterfaceOnKeyListenerC0683ru.f4170a = j50Var;
        C0209f2 c0209f2 = new C0209f2(context);
        C0053b2 c0053b2 = (C0053b2) c0209f2.f1722b;
        C0308hr c0308hr = new C0308hr(c0053b2.f655a);
        dialogInterfaceOnKeyListenerC0683ru.f4172c = c0308hr;
        c0308hr.f2256e = dialogInterfaceOnKeyListenerC0683ru;
        j50Var.m2166b(c0308hr, context);
        C0308hr c0308hr2 = dialogInterfaceOnKeyListenerC0683ru.f4172c;
        if (c0308hr2.f2257f == null) {
            c0308hr2.f2257f = new C0271gr(c0308hr2);
        }
        c0053b2.f661g = c0308hr2.f2257f;
        c0053b2.f662h = dialogInterfaceOnKeyListenerC0683ru;
        View view = j50Var.f3965o;
        if (view != null) {
            c0053b2.f659e = view;
        } else {
            c0053b2.f657c = j50Var.f3964n;
            c0053b2.f658d = j50Var.f3963m;
        }
        c0053b2.f660f = dialogInterfaceOnKeyListenerC0683ru;
        DialogC0246g2 dialogC0246g2M1071a = c0209f2.m1071a();
        dialogInterfaceOnKeyListenerC0683ru.f4171b = dialogC0246g2M1071a;
        dialogC0246g2M1071a.setOnDismissListener(dialogInterfaceOnKeyListenerC0683ru);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0683ru.f4171b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0683ru.f4171b.show();
        InterfaceC0425kv interfaceC0425kv = this.f2256e;
        if (interfaceC0425kv == null) {
            return true;
        }
        interfaceC0425kv.mo1135q(j50Var);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f2254c.m2173q(this.f2257f.getItem(i), this, 0);
    }
}
