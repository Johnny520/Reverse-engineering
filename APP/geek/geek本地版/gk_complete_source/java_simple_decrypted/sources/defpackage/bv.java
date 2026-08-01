package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class bv extends kr implements nu {
    public static final Method D = null;
    public l0 C;

    static {
    L6:
        Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        return;
    L3:
        if (Build.VERSION.SDK_INT > 28) goto L10;
        D = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});     // Catch: NoSuchMethodException -> L6
        return;
    }

    @Override // defpackage.kr
    public final kh a(Context r2, boolean r3) {
        av r0 = new av(r2, r3);
        r0.setHoverListener(this);
        return r0;
    }

    @Override // defpackage.nu
    public final void p(ku r2, MenuItem r3) {
        l0 r0 = this.C;
        if (r0 == null) goto L6;
        r0.p(r2, r3);
        return;
    }

    @Override // defpackage.nu
    public final void r(ku r2, ou r3) {
        l0 r0 = this.C;
        if (r0 == null) goto L6;
        r0.r(r2, r3);
        return;
    }
}
