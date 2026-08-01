package defpackage;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class i50 implements MenuItem.OnMenuItemClickListener {
    public static final Class[] d = null;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    static {
        d = new Class[]{MenuItem.class};
    }

    public /* synthetic */ i50() {
        this.a = 0;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem r5) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        Object r0 = this.b;
        Method r1 = (Method) this.c;
    L10:
        e = move-exception;
        throw new RuntimeException(e);
    L8:
        if (r1.getReturnType() == Boolean.TYPE) goto L18;
        r1.invoke(r0, new Object[]{r5});     // Catch: Exception -> L10
        return true;
    L18:
        return ((Boolean) r1.invoke(r0, new Object[]{r5})).booleanValue();
    L5:
        return ((MenuItem.OnMenuItemClickListener) this.b).onMenuItemClick(((su) this.c).g(r5));
    }

    public i50(su r2, MenuItem.OnMenuItemClickListener r3) {
        this.a = 1;
        this.c = r2;
        this.b = r3;
    }
}
