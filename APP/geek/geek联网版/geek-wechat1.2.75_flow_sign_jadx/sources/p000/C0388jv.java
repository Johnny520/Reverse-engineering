package p000;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: jv */
/* JADX INFO: loaded from: classes.dex */
public final class C0388jv extends C0569or implements InterfaceC0831vu {

    /* JADX INFO: renamed from: D */
    public static final Method f2744D;

    /* JADX INFO: renamed from: C */
    public C0431l0 f2745C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f2744D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // p000.C0569or
    /* JADX INFO: renamed from: a */
    public final C0485mh mo1635a(Context context, boolean z) {
        C0351iv c0351iv = new C0351iv(context, z);
        c0351iv.setHoverListener(this);
        return c0351iv;
    }

    @Override // p000.InterfaceC0831vu
    /* JADX INFO: renamed from: p */
    public final void mo1636p(MenuC0646qu menuC0646qu, MenuItem menuItem) {
        C0431l0 c0431l0 = this.f2745C;
        if (c0431l0 != null) {
            c0431l0.mo1636p(menuC0646qu, menuItem);
        }
    }

    @Override // p000.InterfaceC0831vu
    /* JADX INFO: renamed from: r */
    public final void mo1637r(MenuC0646qu menuC0646qu, C0869wu c0869wu) {
        C0431l0 c0431l0 = this.f2745C;
        if (c0431l0 != null) {
            c0431l0.mo1637r(menuC0646qu, c0869wu);
        }
    }
}
