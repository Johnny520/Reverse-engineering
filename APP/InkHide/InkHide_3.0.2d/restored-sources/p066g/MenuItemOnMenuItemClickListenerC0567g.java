package p066g;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: g.g */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0567g implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: c */
    public static final Class[] f1890c = {MenuItem.class};

    /* JADX INFO: renamed from: a */
    public Object f1891a;

    /* JADX INFO: renamed from: b */
    public Method f1892b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f1892b;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f1891a;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
