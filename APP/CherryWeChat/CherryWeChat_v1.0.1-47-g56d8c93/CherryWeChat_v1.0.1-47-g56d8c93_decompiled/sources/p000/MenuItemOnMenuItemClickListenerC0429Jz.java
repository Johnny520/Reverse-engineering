package p000;

import android.app.Activity;
import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Jz */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0429Jz implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: d */
    public static final Class[] f1411d = {MenuItem.class};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1412a = 0;

    /* JADX INFO: renamed from: b */
    public Object f1413b;

    /* JADX INFO: renamed from: c */
    public Object f1414c;

    public /* synthetic */ MenuItemOnMenuItemClickListenerC0429Jz() {
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f1412a) {
            case 0:
                Object obj = this.f1413b;
                Method method = (Method) this.f1414c;
                try {
                    if (method.getReturnType() == Boolean.TYPE) {
                        return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                    }
                    method.invoke(obj, menuItem);
                    return true;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            case 1:
                AbstractC0295Gu.m625r(-88248693028917L);
                C1495ha c1495ha = (C1495ha) this.f1413b;
                Activity activity = (Activity) this.f1414c;
                C1456gf.m2798P(activity, AbstractC0295Gu.m625r(-102018358179893L), AbstractC0295Gu.m625r(-102039833016373L), AbstractC0295Gu.m625r(-101820789684277L), new C0649P3(11, activity, c1495ha));
                return true;
            default:
                return ((MenuItem.OnMenuItemClickListener) this.f1413b).onMenuItemClick(((MenuItemC2599ur) this.f1414c).m83i(menuItem));
        }
    }

    public MenuItemOnMenuItemClickListenerC0429Jz(C1495ha c1495ha, Activity activity) {
        this.f1413b = c1495ha;
        this.f1414c = activity;
    }

    public MenuItemOnMenuItemClickListenerC0429Jz(MenuItemC2599ur menuItemC2599ur, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1414c = menuItemC2599ur;
        this.f1413b = onMenuItemClickListener;
    }
}
