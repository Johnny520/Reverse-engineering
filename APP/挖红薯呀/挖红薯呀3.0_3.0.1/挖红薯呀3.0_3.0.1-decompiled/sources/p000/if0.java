package p000;

import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class if0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2535a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f2536b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0742sw f2537c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ if0(Context context, InterfaceC0742sw interfaceC0742sw, int i) {
        this.f2535a = i;
        this.f2536b = context;
        this.f2537c = interfaceC0742sw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2535a) {
            case 0:
                vf0.m4601d1(this.f2536b, this.f2537c, view);
                break;
            case 1:
                vf0.m4651n1(this.f2536b, this.f2537c, view);
                break;
            default:
                vf0.m4706y1(this.f2536b, this.f2537c, view);
                break;
        }
    }
}
