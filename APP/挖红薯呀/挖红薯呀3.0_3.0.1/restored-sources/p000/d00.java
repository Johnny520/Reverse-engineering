package p000;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d00 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f921a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0298hw f922b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ d00(int i, InterfaceC0298hw interfaceC0298hw) {
        this.f921a = i;
        this.f922b = interfaceC0298hw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f921a;
        InterfaceC0298hw interfaceC0298hw = this.f922b;
        switch (i) {
            case 0:
                m00.m2217b3(interfaceC0298hw, view);
                break;
            case 1:
                vf0.m4636k1(interfaceC0298hw, view);
                break;
            case 2:
                vf0.m4573X0(interfaceC0298hw, view);
                break;
            case 3:
                vf0.m4577Y0(interfaceC0298hw, view);
                break;
            case 4:
                vf0.m4626i1(interfaceC0298hw, view);
                break;
            default:
                vf0.m4696w1(interfaceC0298hw, view);
                break;
        }
    }
}
