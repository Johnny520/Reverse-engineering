package p000;

import android.app.Activity;
import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Jz */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0429Jz implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: d */
    public static final Class[] f1411d = null;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1412a;

    /* JADX INFO: renamed from: b */
    public Object f1413b;

    /* JADX INFO: renamed from: c */
    public Object f1414c;

    static {
        f1411d = new Class[]{MenuItem.class};
    }

    public /* synthetic */ MenuItemOnMenuItemClickListenerC0429Jz() {
        this.f1412a = 0;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem r7) {
        switch(this.f1412a) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        AbstractC0295Gu.m625r(-88248693028917L);
        C1495ha r72 = (C1495ha) this.f1413b;
        Activity r0 = (Activity) this.f1414c;
        C1456gf.m2798P(r0, AbstractC0295Gu.m625r(-102018358179893L), AbstractC0295Gu.m625r(-102039833016373L), AbstractC0295Gu.m625r(-101820789684277L), new C0649P3(11, r0, r72));
        return true;
    L8:
        Object r02 = this.f1413b;
        Method r1 = (Method) this.f1414c;
    L12:
        e = move-exception;
        throw new RuntimeException(e);
    L10:
        if (r1.getReturnType() == Boolean.TYPE) goto L20;
        r1.invoke(r02, new Object[]{r7});     // Catch: Exception -> L12
        return true;
    L20:
        return ((Boolean) r1.invoke(r02, new Object[]{r7})).booleanValue();
    L5:
        return ((MenuItem.OnMenuItemClickListener) this.f1413b).onMenuItemClick(((MenuItemC2599ur) this.f1414c).m83i(r7));
    }

    public MenuItemOnMenuItemClickListenerC0429Jz(C1495ha r2, Activity r3) {
        this.f1412a = 1;
        this.f1413b = r2;
        this.f1414c = r3;
    }

    public MenuItemOnMenuItemClickListenerC0429Jz(MenuItemC2599ur r2, MenuItem.OnMenuItemClickListener r3) {
        this.f1412a = 2;
        this.f1414c = r2;
        this.f1413b = r3;
    }
}
