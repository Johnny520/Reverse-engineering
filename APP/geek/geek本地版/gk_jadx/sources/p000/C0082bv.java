package p000;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: bv */
/* JADX INFO: loaded from: classes.dex */
public final class C0082bv extends C0421kr implements InterfaceC0535nu {

    /* JADX INFO: renamed from: D */
    public static final Method f855D;

    /* JADX INFO: renamed from: C */
    public C0431l0 f856C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f855D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // p000.C0421kr
    /* JADX INFO: renamed from: a */
    public final C0411kh mo579a(Context context, boolean z) {
        C0045av c0045av = new C0045av(context, z);
        c0045av.setHoverListener(this);
        return c0045av;
    }

    @Override // p000.InterfaceC0535nu
    /* JADX INFO: renamed from: p */
    public final void mo580p(MenuC0424ku menuC0424ku, MenuItem menuItem) {
        C0431l0 c0431l0 = this.f856C;
        if (c0431l0 != null) {
            c0431l0.mo580p(menuC0424ku, menuItem);
        }
    }

    @Override // p000.InterfaceC0535nu
    /* JADX INFO: renamed from: r */
    public final void mo581r(MenuC0424ku menuC0424ku, C0572ou c0572ou) {
        C0431l0 c0431l0 = this.f856C;
        if (c0431l0 != null) {
            c0431l0.mo581r(menuC0424ku, c0572ou);
        }
    }
}
