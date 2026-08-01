package p000;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bf0 implements InterfaceC0298hw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f504d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Context f505e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ bf0(Context context, int i) {
        this.f504d = i;
        this.f505e = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0298hw
    public final Object invoke() {
        int i = this.f504d;
        Context context = this.f505e;
        switch (i) {
            case 0:
                return vf0.m4534N1(context);
            case 1:
                return vf0.m4518J1(context);
            default:
                return vf0.m4505G1(context);
        }
    }
}
