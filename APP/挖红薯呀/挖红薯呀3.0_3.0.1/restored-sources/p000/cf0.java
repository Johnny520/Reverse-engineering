package p000;

import android.content.Context;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cf0 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f797d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Context f798e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f799f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f800g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ cf0(int i, Context context, int i2, int i3) {
        this.f797d = i3;
        this.f798e = context;
        this.f799f = i;
        this.f800g = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        int i = this.f797d;
        int i2 = this.f800g;
        int i3 = this.f799f;
        Context context = this.f798e;
        LinearLayout linearLayout = (LinearLayout) obj;
        switch (i) {
            case 0:
                return vf0.m4574X1(context, i3, i2, linearLayout);
            case 1:
                return vf0.m4582Z1(context, i3, i2, linearLayout);
            case 2:
                return vf0.m4526L1(context, i3, i2, linearLayout);
            default:
                return vf0.m4542P1(context, i3, i2, linearLayout);
        }
    }
}
