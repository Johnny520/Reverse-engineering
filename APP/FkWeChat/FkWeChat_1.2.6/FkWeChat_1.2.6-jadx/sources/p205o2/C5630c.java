package p205o2;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p250r1.C6457g;
import p376zd.C9987e;

/* JADX INFO: renamed from: o2.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5630c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0173a f17633a;

    /* JADX INFO: renamed from: b */
    public C6457g f17634b;

    /* JADX INFO: renamed from: c */
    public InterfaceC0173a f17635c;

    /* JADX INFO: renamed from: d */
    public InterfaceC0173a f17636d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0173a f17637e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0173a f17638f;

    /* JADX INFO: renamed from: g */
    public InterfaceC0173a f17639g;

    public /* synthetic */ C5630c(InterfaceC0173a interfaceC0173a, C6457g c6457g, InterfaceC0173a interfaceC0173a2, InterfaceC0173a interfaceC0173a3, InterfaceC0173a interfaceC0173a4, InterfaceC0173a interfaceC0173a5, InterfaceC0173a interfaceC0173a6, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? null : interfaceC0173a, (i10 & 2) != 0 ? C6457g.f20319e.m25594a() : c6457g, (i10 & 4) != 0 ? null : interfaceC0173a2, (i10 & 8) != 0 ? null : interfaceC0173a3, (i10 & 16) != 0 ? null : interfaceC0173a4, (i10 & 32) != 0 ? null : interfaceC0173a5, (i10 & 64) != 0 ? null : interfaceC0173a6);
    }

    /* JADX INFO: renamed from: a */
    public final void m22796a(Menu menu, EnumC5629b enumC5629b) {
        menu.add(0, enumC5629b.m22793c(), enumC5629b.m22794g(), enumC5629b.m22795h()).setShowAsAction(1);
    }

    /* JADX INFO: renamed from: b */
    public final void m22797b(Menu menu, EnumC5629b enumC5629b, InterfaceC0173a interfaceC0173a) {
        if (interfaceC0173a != null && menu.findItem(enumC5629b.m22793c()) == null) {
            m22796a(menu, enumC5629b);
        } else {
            if (interfaceC0173a != null || menu.findItem(enumC5629b.m22793c()) == null) {
                return;
            }
            menu.removeItem(enumC5629b.m22793c());
        }
    }

    /* JADX INFO: renamed from: c */
    public final C6457g m22798c() {
        return this.f17634b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m22799d(ActionMode actionMode, MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == EnumC5629b.f17623s.m22793c()) {
            InterfaceC0173a interfaceC0173a = this.f17635c;
            if (interfaceC0173a != null) {
                interfaceC0173a.invoke();
            }
        } else if (itemId == EnumC5629b.f17624t.m22793c()) {
            InterfaceC0173a interfaceC0173a2 = this.f17636d;
            if (interfaceC0173a2 != null) {
                interfaceC0173a2.invoke();
            }
        } else if (itemId == EnumC5629b.f17625u.m22793c()) {
            InterfaceC0173a interfaceC0173a3 = this.f17637e;
            if (interfaceC0173a3 != null) {
                interfaceC0173a3.invoke();
            }
        } else if (itemId == EnumC5629b.f17626v.m22793c()) {
            InterfaceC0173a interfaceC0173a4 = this.f17638f;
            if (interfaceC0173a4 != null) {
                interfaceC0173a4.invoke();
            }
        } else {
            if (itemId != EnumC5629b.f17627w.m22793c()) {
                return false;
            }
            InterfaceC0173a interfaceC0173a5 = this.f17639g;
            if (interfaceC0173a5 != null) {
                interfaceC0173a5.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m22800e(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            C9987e.m38645a("onCreateActionMode requires a non-null menu");
            return false;
        }
        if (actionMode == null) {
            C9987e.m38645a("onCreateActionMode requires a non-null mode");
            return false;
        }
        if (this.f17635c != null) {
            m22796a(menu, EnumC5629b.f17623s);
        }
        if (this.f17636d != null) {
            m22796a(menu, EnumC5629b.f17624t);
        }
        if (this.f17637e != null) {
            m22796a(menu, EnumC5629b.f17625u);
        }
        if (this.f17638f != null) {
            m22796a(menu, EnumC5629b.f17626v);
        }
        if (this.f17639g == null) {
            return true;
        }
        m22796a(menu, EnumC5629b.f17627w);
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m22801f() {
        InterfaceC0173a interfaceC0173a = this.f17633a;
        if (interfaceC0173a != null) {
            interfaceC0173a.invoke();
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m22802g(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        m22809n(menu);
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final void m22803h(InterfaceC0173a interfaceC0173a) {
        this.f17639g = interfaceC0173a;
    }

    /* JADX INFO: renamed from: i */
    public final void m22804i(InterfaceC0173a interfaceC0173a) {
        this.f17635c = interfaceC0173a;
    }

    /* JADX INFO: renamed from: j */
    public final void m22805j(InterfaceC0173a interfaceC0173a) {
        this.f17637e = interfaceC0173a;
    }

    /* JADX INFO: renamed from: k */
    public final void m22806k(InterfaceC0173a interfaceC0173a) {
        this.f17636d = interfaceC0173a;
    }

    /* JADX INFO: renamed from: l */
    public final void m22807l(InterfaceC0173a interfaceC0173a) {
        this.f17638f = interfaceC0173a;
    }

    /* JADX INFO: renamed from: m */
    public final void m22808m(C6457g c6457g) {
        this.f17634b = c6457g;
    }

    /* JADX INFO: renamed from: n */
    public final void m22809n(Menu menu) {
        m22797b(menu, EnumC5629b.f17623s, this.f17635c);
        m22797b(menu, EnumC5629b.f17624t, this.f17636d);
        m22797b(menu, EnumC5629b.f17625u, this.f17637e);
        m22797b(menu, EnumC5629b.f17626v, this.f17638f);
        m22797b(menu, EnumC5629b.f17627w, this.f17639g);
    }

    public C5630c(InterfaceC0173a interfaceC0173a, C6457g c6457g, InterfaceC0173a interfaceC0173a2, InterfaceC0173a interfaceC0173a3, InterfaceC0173a interfaceC0173a4, InterfaceC0173a interfaceC0173a5, InterfaceC0173a interfaceC0173a6) {
        this.f17633a = interfaceC0173a;
        this.f17634b = c6457g;
        this.f17635c = interfaceC0173a2;
        this.f17636d = interfaceC0173a3;
        this.f17637e = interfaceC0173a4;
        this.f17638f = interfaceC0173a5;
        this.f17639g = interfaceC0173a6;
    }
}
