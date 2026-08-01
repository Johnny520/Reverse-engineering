package p000;

import android.view.MenuItem;
import com.github.megatronking.stringfog.Base64;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class p50 implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: d */
    public static final Class[] f3596d = {MenuItem.class};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3597a = 0;

    /* JADX INFO: renamed from: b */
    public Object f3598b;

    /* JADX INFO: renamed from: c */
    public Object f3599c;

    public /* synthetic */ p50() {
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f3597a) {
            case Base64.DEFAULT /* 0 */:
                Object obj = this.f3598b;
                Method method = (Method) this.f3599c;
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
                return ((MenuItem.OnMenuItemClickListener) this.f3598b).onMenuItemClick(((MenuItemC0045av) this.f3599c).m1968g(menuItem));
        }
    }

    public p50(MenuItemC0045av menuItemC0045av, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3599c = menuItemC0045av;
        this.f3598b = onMenuItemClickListener;
    }
}
