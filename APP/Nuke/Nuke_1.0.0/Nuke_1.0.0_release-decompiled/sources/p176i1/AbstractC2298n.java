package p176i1;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import p095T.C1305C;

/* JADX INFO: renamed from: i1.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2298n {

    /* JADX INFO: renamed from: a */
    public static final C1305C f7490a = new C1305C(C2288d.f7458h);

    /* JADX INFO: renamed from: b */
    public static final C1305C f7491b = new C1305C(C2288d.f7457g);

    /* JADX WARN: Removed duplicated region for block: B:104:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4122a(p176i1.InterfaceC2282C r23, p112W2.InterfaceC1599a r24, p176i1.C2283D r25, p136b0.C1843e r26, p095T.InterfaceC1373m r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p176i1.AbstractC2298n.m4122a(i1.C, W2.a, i1.D, b0.e, T.m, int, int):void");
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m4123b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
