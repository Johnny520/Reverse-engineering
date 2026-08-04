package yyds;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: renamed from: yyds.ᲈᛷᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2711 implements InterfaceC0613, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public C0447 f13324;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public MenuC0836 f13325;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public InterfaceC2407 f13326;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public Context f13327;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public ExpandedMenuView f13328;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public LayoutInflater f13329;

    public C2711(ContextWrapper contextWrapper) {
        this.f13327 = contextWrapper;
        this.f13329 = LayoutInflater.from(contextWrapper);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f13325.m1906(this.f13324.getItem(i), this, 0);
    }

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final boolean mo1501() {
        return false;
    }

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public final boolean mo1502(C1148 c1148) {
        return false;
    }

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo1503() {
        C0447 c0447 = this.f13324;
        if (c0447 != null) {
            c0447.notifyDataSetChanged();
        }
    }

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo1504(MenuC0836 menuC0836, boolean z) {
        InterfaceC2407 interfaceC2407 = this.f13326;
        if (interfaceC2407 != null) {
            interfaceC2407.mo391(menuC0836, z);
        }
    }

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final boolean mo1505(SubMenuC1011 subMenuC1011) {
        boolean zHasVisibleItems = subMenuC1011.hasVisibleItems();
        Context context = subMenuC1011.f3841;
        if (!zHasVisibleItems) {
            return false;
        }
        DialogInterfaceOnKeyListenerC2346 dialogInterfaceOnKeyListenerC2346 = new DialogInterfaceOnKeyListenerC2346();
        dialogInterfaceOnKeyListenerC2346.f11524 = subMenuC1011;
        C1760 c1760 = new C1760(context);
        C0493 c0493 = (C0493) c1760.f8839;
        C2711 c2711 = new C2711(c0493.f2419);
        dialogInterfaceOnKeyListenerC2346.f11523 = c2711;
        c2711.f13326 = dialogInterfaceOnKeyListenerC2346;
        subMenuC1011.m1904(c2711, context);
        C2711 c27112 = dialogInterfaceOnKeyListenerC2346.f11523;
        C0447 c0447 = c27112.f13324;
        if (c0447 == null) {
            c0447 = new C0447(c27112);
            c27112.f13324 = c0447;
        }
        c0493.f2421 = c0447;
        c0493.f2416 = dialogInterfaceOnKeyListenerC2346;
        View view = subMenuC1011.f3833;
        if (view != null) {
            c0493.f2418 = view;
        } else {
            c0493.f2423 = subMenuC1011.f3842;
            c0493.f2425 = subMenuC1011.f3829;
        }
        c0493.f2424 = dialogInterfaceOnKeyListenerC2346;
        DialogC0194 dialogC0194M3501 = c1760.m3501();
        dialogInterfaceOnKeyListenerC2346.f11525 = dialogC0194M3501;
        dialogC0194M3501.setOnDismissListener(dialogInterfaceOnKeyListenerC2346);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC2346.f11525.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC2346.f11525.show();
        InterfaceC2407 interfaceC2407 = this.f13326;
        if (interfaceC2407 == null) {
            return true;
        }
        interfaceC2407.mo404(subMenuC1011);
        return true;
    }

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final boolean mo1506(C1148 c1148) {
        return false;
    }

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo1507(Context context, MenuC0836 menuC0836) {
        if (this.f13327 != null) {
            this.f13327 = context;
            if (this.f13329 == null) {
                this.f13329 = LayoutInflater.from(context);
            }
        }
        this.f13325 = menuC0836;
        C0447 c0447 = this.f13324;
        if (c0447 != null) {
            c0447.notifyDataSetChanged();
        }
    }

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo1508(InterfaceC2407 interfaceC2407) {
        throw null;
    }
}
