package p000;

import android.content.Context;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mf0 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3944d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Context f3945e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ mf0(Context context, int i) {
        this.f3944d = i;
        this.f3945e = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        int i = this.f3944d;
        Context context = this.f3945e;
        switch (i) {
            case 0:
                return vf0.m4495E1(context, (LinearLayout) obj);
            case 1:
                return Integer.valueOf(hk0.m1343O(context, ((Integer) obj).intValue()));
            default:
                return Integer.valueOf(wb1.m4944L(context, ((Integer) obj).intValue()));
        }
    }
}
