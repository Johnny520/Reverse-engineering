package p000;

import android.app.Dialog;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rf0 implements InterfaceC0298hw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5412d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Dialog f5413e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Context f5414f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ rf0(Dialog dialog, Context context) {
        this.f5412d = 3;
        this.f5414f = context;
        this.f5413e = dialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0298hw
    public final Object invoke() {
        switch (this.f5412d) {
            case 0:
                return vf0.m4707y2(this.f5413e, this.f5414f);
            case 1:
                return vf0.m4712z2(this.f5413e, this.f5414f);
            case 2:
                return vf0.m4477A2(this.f5413e, this.f5414f);
            default:
                return vf0.m4481B2(this.f5414f, this.f5413e);
        }
    }

    public /* synthetic */ rf0(Context context, int i, Dialog dialog) {
        this.f5412d = i;
        this.f5413e = dialog;
        this.f5414f = context;
    }
}
