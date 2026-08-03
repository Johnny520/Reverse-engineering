package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.appcompat.C0983R;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.DialogInterfaceC0989b;
import androidx.appcompat.view.menu.InterfaceC1002j;
import androidx.appcompat.view.menu.InterfaceC1003k;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0996d implements InterfaceC1002j, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public Context f3768a;

    /* JADX INFO: renamed from: b */
    public LayoutInflater f3769b;

    /* JADX INFO: renamed from: c */
    public C0998f f3770c;

    /* JADX INFO: renamed from: d */
    public ExpandedMenuView f3771d;

    /* JADX INFO: renamed from: e */
    public final int f3772e;

    /* JADX INFO: renamed from: f */
    public InterfaceC1002j.a f3773f;

    /* JADX INFO: renamed from: g */
    public a f3774g;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.d$a */
    public class a extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public int f3775a = -1;

        public a() {
            m2312b();
        }

        /* JADX INFO: renamed from: b */
        public final void m2312b() {
            C0998f c0998f = C0996d.this.f3770c;
            C1000h c1000h = c0998f.f3805v;
            if (c1000h != null) {
                c0998f.m2324i();
                ArrayList<C1000h> arrayList = c0998f.f3793j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == c1000h) {
                        this.f3775a = i;
                        return;
                    }
                }
            }
            this.f3775a = -1;
        }

        /* JADX DEBUG: Method merged with bridge method: getItem(I)Ljava/lang/Object; */
        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C1000h getItem(int i) {
            C0996d c0996d = C0996d.this;
            C0998f c0998f = c0996d.f3770c;
            c0998f.m2324i();
            ArrayList<C1000h> arrayList = c0998f.f3793j;
            c0996d.getClass();
            int i2 = this.f3775a;
            if (i2 >= 0 && i >= i2) {
                i++;
            }
            return arrayList.get(i);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            C0996d c0996d = C0996d.this;
            C0998f c0998f = c0996d.f3770c;
            c0998f.m2324i();
            int size = c0998f.f3793j.size();
            c0996d.getClass();
            return this.f3775a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0996d c0996d = C0996d.this;
                view = c0996d.f3769b.inflate(c0996d.f3772e, viewGroup, false);
            }
            ((InterfaceC1003k.a) view).mo2300b(getItem(i));
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            m2312b();
            super.notifyDataSetChanged();
        }
    }

    public C0996d(ContextWrapper contextWrapper, int i) {
        this.f3772e = i;
        this.f3768a = contextWrapper;
        this.f3769b = LayoutInflater.from(contextWrapper);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1002j
    /* JADX INFO: renamed from: a */
    public final void mo2306a(C0998f c0998f, boolean z) {
        InterfaceC1002j.a aVar = this.f3773f;
        if (aVar != null) {
            aVar.mo818a(c0998f, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1002j
    /* JADX INFO: renamed from: c */
    public final boolean mo1396c(C1000h c1000h) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1002j
    /* JADX INFO: renamed from: d */
    public final boolean mo2307d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1002j
    /* JADX INFO: renamed from: e */
    public final void mo1397e(Context context, C0998f c0998f) {
        if (this.f3768a != null) {
            this.f3768a = context;
            if (this.f3769b == null) {
                this.f3769b = LayoutInflater.from(context);
            }
        }
        this.f3770c = c0998f;
        a aVar = this.f3774g;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1002j
    /* JADX INFO: renamed from: g */
    public final void mo2308g() {
        a aVar = this.f3774g;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1002j
    /* JADX INFO: renamed from: h */
    public final void mo2309h(InterfaceC1002j.a aVar) {
        throw null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1002j
    /* JADX INFO: renamed from: i */
    public final boolean mo1398i(C1000h c1000h) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1002j
    /* JADX INFO: renamed from: j */
    public final boolean mo2310j(SubMenuC1005m subMenuC1005m) {
        if (!subMenuC1005m.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0999g dialogInterfaceOnKeyListenerC0999g = new DialogInterfaceOnKeyListenerC0999g();
        dialogInterfaceOnKeyListenerC0999g.f3808a = subMenuC1005m;
        Context context = subMenuC1005m.f3784a;
        DialogInterfaceC0989b.a aVar = new DialogInterfaceC0989b.a(context);
        AlertController.C0985b c0985b = aVar.f3691a;
        C0996d c0996d = new C0996d(c0985b.f3677a, C0983R.layout.abc_list_menu_item_layout);
        dialogInterfaceOnKeyListenerC0999g.f3810c = c0996d;
        c0996d.f3773f = dialogInterfaceOnKeyListenerC0999g;
        subMenuC1005m.m2317b(c0996d, context);
        C0996d c0996d2 = dialogInterfaceOnKeyListenerC0999g.f3810c;
        if (c0996d2.f3774g == null) {
            c0996d2.f3774g = c0996d2.new a();
        }
        c0985b.f3683g = c0996d2.f3774g;
        c0985b.f3684h = dialogInterfaceOnKeyListenerC0999g;
        View view = subMenuC1005m.f3798o;
        if (view != null) {
            c0985b.f3681e = view;
        } else {
            c0985b.f3679c = subMenuC1005m.f3797n;
            c0985b.f3680d = subMenuC1005m.f3796m;
        }
        c0985b.f3682f = dialogInterfaceOnKeyListenerC0999g;
        DialogInterfaceC0989b dialogInterfaceC0989bM2298a = aVar.m2298a();
        dialogInterfaceOnKeyListenerC0999g.f3809b = dialogInterfaceC0989bM2298a;
        dialogInterfaceC0989bM2298a.setOnDismissListener(dialogInterfaceOnKeyListenerC0999g);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0999g.f3809b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0999g.f3809b.show();
        InterfaceC1002j.a aVar2 = this.f3773f;
        if (aVar2 == null) {
            return true;
        }
        aVar2.mo819b(subMenuC1005m);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f3770c.m2332q(this.f3774g.getItem(i), this, 0);
    }
}
