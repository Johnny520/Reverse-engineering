package p088s0;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import p027N0.AbstractC0223g;
import p027N0.C0228l;

/* JADX INFO: renamed from: s0.r */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnShowListenerC0996r implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3582a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0228l f3583b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ DialogInterfaceOnShowListenerC0996r(C0228l c0228l, int i2) {
        this.f3582a = i2;
        this.f3583b = c0228l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f3582a) {
            case 0:
                Object obj = this.f3583b.f568a;
                if (obj == null) {
                    AbstractC0223g.m420g("dialog");
                    throw null;
                }
                Window window = ((AlertDialog) obj).getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                    return;
                }
                return;
            case 1:
                Object obj2 = this.f3583b.f568a;
                if (obj2 == null) {
                    AbstractC0223g.m420g("dialog");
                    throw null;
                }
                Window window2 = ((AlertDialog) obj2).getWindow();
                if (window2 != null) {
                    window2.setBackgroundDrawable(new ColorDrawable(0));
                    return;
                }
                return;
            case 2:
                Object obj3 = this.f3583b.f568a;
                if (obj3 == null) {
                    AbstractC0223g.m420g("dialog");
                    throw null;
                }
                Window window3 = ((AlertDialog) obj3).getWindow();
                if (window3 != null) {
                    window3.setBackgroundDrawable(new ColorDrawable(0));
                    return;
                }
                return;
            case 3:
                Object obj4 = this.f3583b.f568a;
                if (obj4 == null) {
                    AbstractC0223g.m420g("dialog");
                    throw null;
                }
                Window window4 = ((AlertDialog) obj4).getWindow();
                if (window4 != null) {
                    window4.setBackgroundDrawable(new ColorDrawable(0));
                    return;
                }
                return;
            case 4:
                Object obj5 = this.f3583b.f568a;
                if (obj5 == null) {
                    AbstractC0223g.m420g("dialog");
                    throw null;
                }
                Window window5 = ((AlertDialog) obj5).getWindow();
                if (window5 != null) {
                    window5.setBackgroundDrawable(new ColorDrawable(0));
                    return;
                }
                return;
            case 5:
                Object obj6 = this.f3583b.f568a;
                if (obj6 == null) {
                    AbstractC0223g.m420g("dialog");
                    throw null;
                }
                Window window6 = ((AlertDialog) obj6).getWindow();
                if (window6 != null) {
                    window6.setBackgroundDrawable(new ColorDrawable(0));
                    return;
                }
                return;
            default:
                Object obj7 = this.f3583b.f568a;
                if (obj7 == null) {
                    AbstractC0223g.m420g("dialog");
                    throw null;
                }
                Window window7 = ((AlertDialog) obj7).getWindow();
                if (window7 != null) {
                    window7.setBackgroundDrawable(new ColorDrawable(0));
                    return;
                }
                return;
        }
    }
}
