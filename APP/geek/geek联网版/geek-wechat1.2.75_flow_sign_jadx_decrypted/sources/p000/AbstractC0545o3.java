package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.HashSet;

/* JADX INFO: renamed from: o3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0545o3 {

    /* JADX INFO: renamed from: a */
    public Object f3364a;

    /* JADX INFO: renamed from: b */
    public Object f3365b;

    public AbstractC0545o3(Context context) {
        this.f3364a = context;
    }

    /* JADX INFO: renamed from: c */
    public void m1966c() {
        C0508n3 c0508n3 = (C0508n3) this.f3364a;
        if (c0508n3 != null) {
            try {
                ((LayoutInflaterFactory2C0656r3) this.f3365b).f4038k.unregisterReceiver(c0508n3);
            } catch (IllegalArgumentException unused) {
            }
            this.f3364a = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m1967d() {
        n40 n40Var = (n40) this.f3364a;
        C0772u8 c0772u8 = (C0772u8) this.f3365b;
        HashSet hashSet = n40Var.f3218e;
        if (hashSet.remove(c0772u8) && hashSet.isEmpty()) {
            n40Var.m1913b();
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract IntentFilter mo1795e();

    /* JADX INFO: renamed from: f */
    public abstract int mo1796f();

    /* JADX INFO: renamed from: g */
    public MenuItem m1968g(MenuItem menuItem) {
        if (!(menuItem instanceof s50)) {
            return menuItem;
        }
        s50 s50Var = (s50) menuItem;
        if (((b40) this.f3365b) == null) {
            this.f3365b = new b40();
        }
        MenuItem menuItem2 = (MenuItem) ((b40) this.f3365b).getOrDefault(s50Var, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0045av menuItemC0045av = new MenuItemC0045av((Context) this.f3364a, s50Var);
        ((b40) this.f3365b).put(s50Var, menuItemC0045av);
        return menuItemC0045av;
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo1797h();

    /* JADX INFO: renamed from: i */
    public void m1969i() {
        m1966c();
        IntentFilter intentFilterMo1795e = mo1795e();
        if (intentFilterMo1795e.countActions() == 0) {
            return;
        }
        if (((C0508n3) this.f3364a) == null) {
            this.f3364a = new C0508n3(this);
        }
        ((LayoutInflaterFactory2C0656r3) this.f3365b).f4038k.registerReceiver((C0508n3) this.f3364a, intentFilterMo1795e);
    }

    public AbstractC0545o3(n40 n40Var, C0772u8 c0772u8) {
        this.f3364a = n40Var;
        this.f3365b = c0772u8;
    }

    public AbstractC0545o3(LayoutInflaterFactory2C0656r3 layoutInflaterFactory2C0656r3) {
        this.f3365b = layoutInflaterFactory2C0656r3;
    }
}
