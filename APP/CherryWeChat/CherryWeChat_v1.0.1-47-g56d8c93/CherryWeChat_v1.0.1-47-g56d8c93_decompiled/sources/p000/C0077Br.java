package p000;

import android.content.Context;
import android.os.Build;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Br */
/* JADX INFO: loaded from: classes.dex */
public final class C0077Br extends C0289Go implements InterfaceC2384pr {

    /* JADX INFO: renamed from: D */
    public static final Method f185D;

    /* JADX INFO: renamed from: C */
    public C0132D2 f186C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f185D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // p000.InterfaceC2384pr
    /* JADX INFO: renamed from: e */
    public final void mo128e(MenuC2204lr menuC2204lr, MenuItem menuItem) {
        C0132D2 c0132d2 = this.f186C;
        if (c0132d2 != null) {
            c0132d2.mo128e(menuC2204lr, menuItem);
        }
    }

    @Override // p000.InterfaceC2384pr
    /* JADX INFO: renamed from: i */
    public final void mo129i(MenuC2204lr menuC2204lr, C2427qr c2427qr) {
        C0132D2 c0132d2 = this.f186C;
        if (c0132d2 != null) {
            c0132d2.mo129i(menuC2204lr, c2427qr);
        }
    }

    @Override // p000.C0289Go
    /* JADX INFO: renamed from: q */
    public final C0365Ie mo130q(Context context, boolean z) {
        C0034Ar c0034Ar = new C0034Ar(context, z);
        c0034Ar.setHoverListener(this);
        return c0034Ar;
    }
}
