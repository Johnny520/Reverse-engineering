package p057g;

import android.os.Build;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p055f.MenuC0779j;
import p055f.MenuItemC0780k;

/* JADX INFO: renamed from: g.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0929t0 extends AbstractC0919o0 implements InterfaceC0921p0 {

    /* JADX INFO: renamed from: z */
    public static final Method f3297z = null;

    /* JADX INFO: renamed from: y */
    public InterfaceC0921p0 f3298y;

    static {
        if (Build.VERSION.SDK_INT > 28) goto L9;
        f3297z = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});     // Catch: NoSuchMethodException -> L6
        return;
    L9:
        return;
    }

    @Override // p057g.InterfaceC0921p0
    /* JADX INFO: renamed from: o */
    public final void mo349o(MenuC0779j r2, MenuItemC0780k r3) {
        InterfaceC0921p0 r02 = this.f3298y;
        if (r02 == null) goto L6;
        r02.mo349o(r2, r3);
        return;
    }

    @Override // p057g.InterfaceC0921p0
    /* JADX INFO: renamed from: s */
    public final void mo353s(MenuC0779j r2, MenuItemC0780k r3) {
        InterfaceC0921p0 r02 = this.f3298y;
        if (r02 == null) goto L6;
        r02.mo353s(r2, r3);
        return;
    }
}
