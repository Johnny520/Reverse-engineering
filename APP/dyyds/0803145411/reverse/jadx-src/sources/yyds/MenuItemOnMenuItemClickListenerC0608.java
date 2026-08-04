package yyds;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: yyds.ᛳᛶᛳᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0608 implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final Class[] f2960 = {MenuItem.class};

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2961 = 0;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public Object f2962;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public Object f2963;

    public MenuItemOnMenuItemClickListenerC0608(MenuItemC1806 menuItemC1806, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2963 = menuItemC1806;
        this.f2962 = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f2961) {
            case 0:
                Object obj = this.f2962;
                Method method = (Method) this.f2963;
                try {
                    if (method.getReturnType() == Boolean.TYPE) {
                        return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                    }
                    method.invoke(obj, menuItem);
                    return true;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            default:
                return ((MenuItem.OnMenuItemClickListener) this.f2962).onMenuItemClick(((MenuItemC1806) this.f2963).m4327(menuItem));
        }
    }

    public /* synthetic */ MenuItemOnMenuItemClickListenerC0608() {
    }
}
