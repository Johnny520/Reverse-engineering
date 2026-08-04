package yyds;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.view.MenuItem;
import java.io.File;

/* JADX INFO: renamed from: yyds.ᲁᲀᛶᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2315 implements InterfaceC2768 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public Object f11353;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Object f11354;

    public AbstractC2315(Context context, Class cls) {
        this.f11353 = context;
        this.f11354 = cls;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public void m4325() {
        m4326();
        IntentFilter intentFilterMo3659 = mo3659();
        if (intentFilterMo3659.countActions() == 0) {
            return;
        }
        C1085 c1085 = (C1085) this.f11353;
        if (c1085 == null) {
            c1085 = new C1085(0, this);
            this.f11353 = c1085;
        }
        ((LayoutInflaterFactory2C2181) this.f11354).f10680.registerReceiver(c1085, intentFilterMo3659);
    }

    @Override // yyds.InterfaceC2768
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public InterfaceC0894 mo382(C0644 c0644) {
        Context context = (Context) this.f11353;
        Class cls = (Class) this.f11354;
        return new C0349(context, c0644.m1565(File.class, cls), c0644.m1565(Uri.class, cls), cls);
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public abstract int mo3657();

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public abstract void mo3658();

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public void m4326() {
        C1085 c1085 = (C1085) this.f11353;
        if (c1085 != null) {
            try {
                ((LayoutInflaterFactory2C2181) this.f11354).f10680.unregisterReceiver(c1085);
            } catch (IllegalArgumentException unused) {
            }
            this.f11353 = null;
        }
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public MenuItem m4327(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC0339)) {
            return menuItem;
        }
        InterfaceMenuItemC0339 interfaceMenuItemC0339 = (InterfaceMenuItemC0339) menuItem;
        C0988 c0988 = (C0988) this.f11354;
        if (c0988 == null) {
            c0988 = new C0988(0);
            this.f11354 = c0988;
        }
        MenuItem menuItem2 = (MenuItem) c0988.get(interfaceMenuItemC0339);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC1806 menuItemC1806 = new MenuItemC1806((Context) this.f11353, interfaceMenuItemC0339);
        ((C0988) this.f11354).put(interfaceMenuItemC0339, menuItemC1806);
        return menuItemC1806;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public abstract IntentFilter mo3659();

    public AbstractC2315(Context context) {
        this.f11353 = context;
    }

    public AbstractC2315(LayoutInflaterFactory2C2181 layoutInflaterFactory2C2181) {
        this.f11354 = layoutInflaterFactory2C2181;
    }
}
