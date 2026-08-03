package p000a;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.C0998f;
import androidx.appcompat.view.menu.InterfaceC1002j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C1038a;
import androidx.appcompat.widget.C1041d;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000a.AbstractC0200L;

/* JADX INFO: renamed from: a.uf */
/* JADX INFO: loaded from: classes.dex */
public final class C0865uf extends AbstractC0200L {

    /* JADX INFO: renamed from: a */
    public final C1041d f3381a;

    /* JADX INFO: renamed from: b */
    public final Window.Callback f3382b;

    /* JADX INFO: renamed from: c */
    public final e f3383c;

    /* JADX INFO: renamed from: d */
    public boolean f3384d;

    /* JADX INFO: renamed from: e */
    public boolean f3385e;

    /* JADX INFO: renamed from: f */
    public boolean f3386f;

    /* JADX INFO: renamed from: g */
    public final ArrayList<AbstractC0200L.b> f3387g = new ArrayList<>();

    /* JADX INFO: renamed from: h */
    public final a f3388h = new a();

    /* JADX INFO: renamed from: a.uf$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0865uf c0865uf = C0865uf.this;
            Window.Callback callback = c0865uf.f3382b;
            Menu menuM1993p = c0865uf.m1993p();
            C0998f c0998f = menuM1993p instanceof C0998f ? (C0998f) menuM1993p : null;
            if (c0998f != null) {
                c0998f.m2338w();
            }
            try {
                menuM1993p.clear();
                if (!callback.onCreatePanelMenu(0, menuM1993p) || !callback.onPreparePanel(0, null, menuM1993p)) {
                    menuM1993p.clear();
                }
                if (c0998f != null) {
                    c0998f.m2337v();
                }
            } catch (Throwable th) {
                if (c0998f != null) {
                    c0998f.m2337v();
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a.uf$b */
    public class b implements Toolbar.InterfaceC1035h {
        public b() {
        }
    }

    /* JADX INFO: renamed from: a.uf$c */
    public final class c implements InterfaceC1002j.a {

        /* JADX INFO: renamed from: a */
        public boolean f3391a;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1002j.a
        /* JADX INFO: renamed from: a */
        public final void mo818a(C0998f c0998f, boolean z) {
            if (this.f3391a) {
                return;
            }
            this.f3391a = true;
            C0865uf c0865uf = C0865uf.this;
            c0865uf.f3381a.mo671i();
            c0865uf.f3382b.onPanelClosed(108, c0998f);
            this.f3391a = false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1002j.a
        /* JADX INFO: renamed from: b */
        public final boolean mo819b(C0998f c0998f) {
            C0865uf.this.f3382b.onMenuOpened(108, c0998f);
            return true;
        }
    }

    /* JADX INFO: renamed from: a.uf$d */
    public final class d implements C0998f.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.C0998f.a
        /* JADX INFO: renamed from: a */
        public final boolean mo816a(C0998f c0998f, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0998f.a
        /* JADX INFO: renamed from: b */
        public final void mo817b(C0998f c0998f) {
            C1038a c1038a;
            C0865uf c0865uf = C0865uf.this;
            ActionMenuView actionMenuView = c0865uf.f3381a.f4123a.f4045a;
            boolean z = (actionMenuView == null || (c1038a = actionMenuView.f3939t) == null || !c1038a.m2399k()) ? false : true;
            Window.Callback callback = c0865uf.f3382b;
            if (z) {
                callback.onPanelClosed(108, c0998f);
            } else if (callback.onPreparePanel(0, null, c0998f)) {
                callback.onMenuOpened(108, c0998f);
            }
        }
    }

    /* JADX INFO: renamed from: a.uf$e */
    public class e {
        public e() {
        }
    }

    public C0865uf(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        toolbar.getClass();
        C1041d c1041d = new C1041d(toolbar, false);
        this.f3381a = c1041d;
        callback.getClass();
        this.f3382b = callback;
        c1041d.f4133k = callback;
        toolbar.setOnMenuItemClickListener(bVar);
        c1041d.setWindowTitle(charSequence);
        this.f3383c = new e();
    }

    @Override // p000a.AbstractC0200L
    /* JADX INFO: renamed from: a */
    public final boolean mo555a() {
        return this.f3381a.mo666d();
    }

    @Override // p000a.AbstractC0200L
    /* JADX INFO: renamed from: b */
    public final boolean mo556b() {
        C1041d c1041d = this.f3381a;
        Toolbar.C1033f c1033f = c1041d.f4123a.f4037M;
        if (c1033f == null || c1033f.f4076b == null) {
            return false;
        }
        c1041d.collapseActionView();
        return true;
    }

    @Override // p000a.AbstractC0200L
    /* JADX INFO: renamed from: c */
    public final void mo557c(boolean z) {
        if (z == this.f3386f) {
            return;
        }
        this.f3386f = z;
        ArrayList<AbstractC0200L.b> arrayList = this.f3387g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).m570a();
        }
    }

    @Override // p000a.AbstractC0200L
    /* JADX INFO: renamed from: d */
    public final int mo558d() {
        return this.f3381a.f4124b;
    }

    @Override // p000a.AbstractC0200L
    /* JADX INFO: renamed from: e */
    public final Context mo559e() {
        return this.f3381a.f4123a.getContext();
    }

    @Override // p000a.AbstractC0200L
    /* JADX INFO: renamed from: f */
    public final boolean mo560f() {
        C1041d c1041d = this.f3381a;
        Toolbar toolbar = c1041d.f4123a;
        a aVar = this.f3388h;
        toolbar.removeCallbacks(aVar);
        Toolbar toolbar2 = c1041d.f4123a;
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        toolbar2.postOnAnimation(aVar);
        return true;
    }

    @Override // p000a.AbstractC0200L
    /* JADX INFO: renamed from: g */
    public final void mo561g() {
    }

    @Override // p000a.AbstractC0200L
    /* JADX INFO: renamed from: h */
    public final void mo562h() {
        this.f3381a.f4123a.removeCallbacks(this.f3388h);
    }

    @Override // p000a.AbstractC0200L
    /* JADX INFO: renamed from: i */
    public final boolean mo563i(int i, KeyEvent keyEvent) {
        Menu menuM1993p = m1993p();
        if (menuM1993p == null) {
            return false;
        }
        menuM1993p.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuM1993p.performShortcut(i, keyEvent, 0);
    }

    @Override // p000a.AbstractC0200L
    /* JADX INFO: renamed from: j */
    public final boolean mo564j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo565k();
        }
        return true;
    }

    @Override // p000a.AbstractC0200L
    /* JADX INFO: renamed from: k */
    public final boolean mo565k() {
        return this.f3381a.f4123a.m2390u();
    }

    @Override // p000a.AbstractC0200L
    /* JADX INFO: renamed from: l */
    public final void mo566l(boolean z) {
    }

    @Override // p000a.AbstractC0200L
    /* JADX INFO: renamed from: m */
    public final void mo567m(boolean z) {
    }

    @Override // p000a.AbstractC0200L
    /* JADX INFO: renamed from: n */
    public final void mo568n(CharSequence charSequence) {
        this.f3381a.setWindowTitle(charSequence);
    }

    /* JADX INFO: renamed from: p */
    public final Menu m1993p() {
        boolean z = this.f3385e;
        C1041d c1041d = this.f3381a;
        if (!z) {
            c cVar = new c();
            d dVar = new d();
            Toolbar toolbar = c1041d.f4123a;
            toolbar.f4038N = cVar;
            toolbar.f4039O = dVar;
            ActionMenuView actionMenuView = toolbar.f4045a;
            if (actionMenuView != null) {
                actionMenuView.f3940u = cVar;
                actionMenuView.f3941v = dVar;
            }
            this.f3385e = true;
        }
        return c1041d.f4123a.getMenu();
    }
}
