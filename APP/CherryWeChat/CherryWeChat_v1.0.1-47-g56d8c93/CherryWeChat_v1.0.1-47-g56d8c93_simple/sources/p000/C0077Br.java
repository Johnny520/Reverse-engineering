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
    public static final Method f185D = null;

    /* JADX INFO: renamed from: C */
    public C0132D2 f186C;

    static {
        if (Build.VERSION.SDK_INT > 28) goto L9;
        f185D = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});     // Catch: NoSuchMethodException -> L6
        return;
    L9:
        return;
    }

    @Override // p000.InterfaceC2384pr
    /* JADX INFO: renamed from: e */
    public final void mo128e(MenuC2204lr r2, MenuItem r3) {
        C0132D2 r0 = this.f186C;
        if (r0 == null) goto L6;
        r0.mo128e(r2, r3);
        return;
    }

    @Override // p000.InterfaceC2384pr
    /* JADX INFO: renamed from: i */
    public final void mo129i(MenuC2204lr r2, C2427qr r3) {
        C0132D2 r0 = this.f186C;
        if (r0 == null) goto L6;
        r0.mo129i(r2, r3);
        return;
    }

    @Override // p000.C0289Go
    /* JADX INFO: renamed from: q */
    public final C0365Ie mo130q(Context r2, boolean r3) {
        C0034Ar r0 = new C0034Ar(r2, r3);
        r0.setHoverListener(this);
        return r0;
    }
}
