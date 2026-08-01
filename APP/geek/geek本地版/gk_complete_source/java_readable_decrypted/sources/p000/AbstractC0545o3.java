package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.HashSet;

/* JADX INFO: renamed from: o3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0545o3 {

    /* JADX INFO: renamed from: a */
    public Object f3479a;

    /* JADX INFO: renamed from: b */
    public Object f3480b;

    public AbstractC0545o3(Context context) {
        this.f3479a = context;
    }

    /* JADX INFO: renamed from: c */
    public void m1985c() {
        C0508n3 c0508n3 = (C0508n3) this.f3479a;
        if (c0508n3 != null) {
            try {
                ((LayoutInflaterFactory2C0657r3) this.f3480b).f4177k.unregisterReceiver(c0508n3);
            } catch (IllegalArgumentException unused) {
            }
            this.f3479a = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m1986d() {
        g40 g40Var = (g40) this.f3479a;
        C0402k8 c0402k8 = (C0402k8) this.f3480b;
        HashSet hashSet = g40Var.f2018e;
        if (hashSet.remove(c0402k8) && hashSet.isEmpty()) {
            g40Var.m1260b();
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract IntentFilter mo1777e();

    /* JADX INFO: renamed from: f */
    public abstract int mo1778f();

    /* JADX INFO: renamed from: g */
    public MenuItem m1987g(MenuItem menuItem) {
        if (!(menuItem instanceof l50)) {
            return menuItem;
        }
        l50 l50Var = (l50) menuItem;
        if (((u30) this.f3480b) == null) {
            this.f3480b = new u30();
        }
        MenuItem menuItem2 = (MenuItem) ((u30) this.f3480b).getOrDefault(l50Var, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0721su menuItemC0721su = new MenuItemC0721su((Context) this.f3479a, l50Var);
        ((u30) this.f3480b).put(l50Var, menuItemC0721su);
        return menuItemC0721su;
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo1779h();

    /* JADX INFO: renamed from: i */
    public void m1988i() {
        m1985c();
        IntentFilter intentFilterMo1777e = mo1777e();
        if (intentFilterMo1777e.countActions() == 0) {
            return;
        }
        if (((C0508n3) this.f3479a) == null) {
            this.f3479a = new C0508n3(this);
        }
        ((LayoutInflaterFactory2C0657r3) this.f3480b).f4177k.registerReceiver((C0508n3) this.f3479a, intentFilterMo1777e);
    }

    public AbstractC0545o3(g40 g40Var, C0402k8 c0402k8) {
        this.f3479a = g40Var;
        this.f3480b = c0402k8;
    }

    public AbstractC0545o3(LayoutInflaterFactory2C0657r3 layoutInflaterFactory2C0657r3) {
        this.f3480b = layoutInflaterFactory2C0657r3;
    }
}
