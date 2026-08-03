package p052d0;

import android.app.Dialog;
import p007D0.C0146l;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: d0.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0743d implements InterfaceC0275a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2581a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Dialog f2582b;

    public /* synthetic */ C0743d(Dialog dialog, int i2) {
        this.f2581a = i2;
        this.f2582b = dialog;
    }

    @Override // p029P0.InterfaceC0275a
    public final Object invoke() {
        switch (this.f2581a) {
            case 0:
                Dialog dialog = this.f2582b;
                AbstractC0307g.m703e(dialog, "$dialog");
                dialog.dismiss();
                break;
            default:
                Dialog dialog2 = this.f2582b;
                AbstractC0307g.m703e(dialog2, "$dialog");
                dialog2.dismiss();
                break;
        }
        return C0146l.f339a;
    }
}
