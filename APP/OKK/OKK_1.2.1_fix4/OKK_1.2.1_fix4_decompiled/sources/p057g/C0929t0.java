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
    public static final Method f3297z;

    /* JADX INFO: renamed from: y */
    public InterfaceC0921p0 f3298y;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f3297z = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // p057g.InterfaceC0921p0
    /* JADX INFO: renamed from: o */
    public final void mo349o(MenuC0779j menuC0779j, MenuItemC0780k menuItemC0780k) {
        InterfaceC0921p0 interfaceC0921p0 = this.f3298y;
        if (interfaceC0921p0 != null) {
            interfaceC0921p0.mo349o(menuC0779j, menuItemC0780k);
        }
    }

    @Override // p057g.InterfaceC0921p0
    /* JADX INFO: renamed from: s */
    public final void mo353s(MenuC0779j menuC0779j, MenuItemC0780k menuItemC0780k) {
        InterfaceC0921p0 interfaceC0921p0 = this.f3298y;
        if (interfaceC0921p0 != null) {
            interfaceC0921p0.mo353s(menuC0779j, menuItemC0780k);
        }
    }
}
