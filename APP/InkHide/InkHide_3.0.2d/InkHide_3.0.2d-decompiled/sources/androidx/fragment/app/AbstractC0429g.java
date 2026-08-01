package androidx.fragment.app;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.HashSet;
import p061e.C0542r;
import p061e.LayoutInflaterFactory2C0545u;
import p068h.MenuItemC0601t;
import p075l.C0753k;
import p089t.InterfaceMenuItemC1005a;
import p091u.C1013c;

/* JADX INFO: renamed from: androidx.fragment.app.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0429g {

    /* JADX INFO: renamed from: a */
    public Object f1328a;

    /* JADX INFO: renamed from: b */
    public Object f1329b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0429g(Context context) {
        this.f1328a = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void m825c() {
        C0542r c0542r = (C0542r) this.f1328a;
        if (c0542r != null) {
            try {
                ((LayoutInflaterFactory2C0545u) this.f1329b).f1820e.unregisterReceiver(c0542r);
            } catch (IllegalArgumentException unused) {
            }
            this.f1328a = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public void m826d() {
        C0420K c0420k = (C0420K) this.f1328a;
        HashSet hashSet = c0420k.f1278e;
        if (hashSet.remove((C1013c) this.f1329b) && hashSet.isEmpty()) {
            c0420k.m810b();
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract IntentFilter mo827e();

    /* JADX INFO: renamed from: f */
    public abstract int mo828f();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public MenuItem m829g(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC1005a)) {
            return menuItem;
        }
        InterfaceMenuItemC1005a interfaceMenuItemC1005a = (InterfaceMenuItemC1005a) menuItem;
        if (((C0753k) this.f1329b) == null) {
            this.f1329b = new C0753k();
        }
        MenuItem menuItem2 = (MenuItem) ((C0753k) this.f1329b).getOrDefault(interfaceMenuItemC1005a, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0601t menuItemC0601t = new MenuItemC0601t((Context) this.f1328a, interfaceMenuItemC1005a);
        ((C0753k) this.f1329b).put(interfaceMenuItemC1005a, menuItemC0601t);
        return menuItemC0601t;
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo830h();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public void m831i() {
        m825c();
        IntentFilter intentFilterMo827e = mo827e();
        if (intentFilterMo827e.countActions() == 0) {
            return;
        }
        if (((C0542r) this.f1328a) == null) {
            this.f1328a = new C0542r(0, this);
        }
        ((LayoutInflaterFactory2C0545u) this.f1329b).f1820e.registerReceiver((C0542r) this.f1328a, intentFilterMo827e);
    }

    public AbstractC0429g(C0420K c0420k, C1013c c1013c) {
        this.f1328a = c0420k;
        this.f1329b = c1013c;
    }

    public AbstractC0429g(LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u) {
        this.f1329b = layoutInflaterFactory2C0545u;
    }
}
