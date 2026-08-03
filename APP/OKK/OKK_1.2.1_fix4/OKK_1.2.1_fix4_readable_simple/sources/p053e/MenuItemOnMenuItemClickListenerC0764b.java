package p053e;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: e.b */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0764b implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: c */
    public static final Class[] f2680c = null;

    /* JADX INFO: renamed from: a */
    public Object f2681a;

    /* JADX INFO: renamed from: b */
    public Method f2682b;

    static {
        f2680c = new Class[]{MenuItem.class};
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem r5) {
        Method r02 = this.f2682b;
        Class<?> r1 = r02.getReturnType();     // Catch: Exception -> L8
        Class<?> r2 = Boolean.TYPE;     // Catch: Exception -> L8
        Object r3 = this.f2681a;
        if (r1 == r2) goto L7;
        r02.invoke(r3, new Object[]{r5});     // Catch: Exception -> L8
        return true;
    L7:
        return ((Boolean) r02.invoke(r3, new Object[]{r5})).booleanValue();
    L8:
        e = move-exception;
        throw new RuntimeException(e);
    }
}
