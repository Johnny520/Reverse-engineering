package p069i;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p004C.C0066j;
import p068h.C0596o;
import p068h.MenuC0594m;

/* JADX INFO: renamed from: i.L0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0631L0 extends AbstractC0619F0 implements InterfaceC0621G0 {

    /* JADX INFO: renamed from: D */
    public static final Method f2166D;

    /* JADX INFO: renamed from: C */
    public C0066j f2167C;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f2166D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.AbstractC0619F0
    /* JADX INFO: renamed from: o */
    public final C0717t0 mo1226o(Context context, boolean z2) {
        C0629K0 c0629k0 = new C0629K0(context, z2);
        c0629k0.setHoverListener(this);
        return c0629k0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.InterfaceC0621G0
    /* JADX INFO: renamed from: s */
    public final void mo147s(MenuC0594m menuC0594m, C0596o c0596o) {
        C0066j c0066j = this.f2167C;
        if (c0066j != null) {
            c0066j.mo147s(menuC0594m, c0596o);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.InterfaceC0621G0
    /* JADX INFO: renamed from: u */
    public final void mo149u(MenuC0594m menuC0594m, C0596o c0596o) {
        C0066j c0066j = this.f2167C;
        if (c0066j != null) {
            c0066j.mo149u(menuC0594m, c0596o);
        }
    }
}
