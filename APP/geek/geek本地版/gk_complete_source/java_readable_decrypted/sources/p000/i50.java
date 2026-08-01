package p000;

import android.view.MenuItem;
import com.github.megatronking.stringfog.Base64;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class i50 implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: d */
    public static final Class[] f2354d = {MenuItem.class};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2355a = 0;

    /* JADX INFO: renamed from: b */
    public Object f2356b;

    /* JADX INFO: renamed from: c */
    public Object f2357c;

    public /* synthetic */ i50() {
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f2355a) {
            case Base64.DEFAULT /* 0 */:
                Object obj = this.f2356b;
                Method method = (Method) this.f2357c;
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
                return ((MenuItem.OnMenuItemClickListener) this.f2356b).onMenuItemClick(((MenuItemC0721su) this.f2357c).m1987g(menuItem));
        }
    }

    public i50(MenuItemC0721su menuItemC0721su, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2357c = menuItemC0721su;
        this.f2356b = onMenuItemClickListener;
    }
}
