package p000;

import android.app.Dialog;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class we0 implements InterfaceC0298hw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f7114d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Dialog f7115e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ we0(Dialog dialog, int i) {
        this.f7114d = i;
        this.f7115e = dialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0298hw
    public final Object invoke() {
        int i = this.f7114d;
        Dialog dialog = this.f7115e;
        switch (i) {
            case 0:
                return vf0.m4519J2(dialog);
            case 1:
                return vf0.m4567V2(dialog);
            default:
                return vf0.m4673r3(dialog);
        }
    }
}
