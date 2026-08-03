package p001;

import com.skyhand.hookhand.dialog.view.SwitchButton;
import p001.C0241h8;

/* JADX INFO: renamed from: ۟.y */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0460y implements C0241h8.d, SwitchButton.InterfaceC0005d {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ int f1198;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ Object f1199;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final /* synthetic */ Object f1870;

    public /* synthetic */ C0460y(Object obj, Object obj2, int i) {
        this.f1198 = i;
        this.f1199 = obj;
        this.f1870 = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.C0241h8.d
    /* JADX INFO: renamed from: ۥ */
    public final void mo870(boolean z) {
        C0344p0 c0344p0 = (C0344p0) this.f1199;
        C0318n1 c0318n1 = (C0318n1) this.f1870;
        int i = C0318n1.f1714;
        C0237h4.m1090(C0341oa.m915(new byte[]{31, 35, -63, -61, -84}, new byte[]{59, 74, -75, -90, -63, 70}), c0344p0);
        C0237h4.m1090(C0341oa.m915(new byte[]{-7, 40, -24, -100, -115, 66}, new byte[]{-115, 64, -127, -17, -87, 114}), c0318n1);
        c0344p0.f1741 = Boolean.valueOf(z);
        InterfaceC0222g3<Boolean, C0433vb> interfaceC0222g3 = c0344p0.f1742;
        if (interfaceC0222g3 != null) {
            interfaceC0222g3.mo984(Boolean.valueOf(z));
        }
        InterfaceC0208f3<C0433vb> interfaceC0208f3 = c0318n1.f985;
        if (interfaceC0208f3 != null) {
            interfaceC0208f3.mo7();
        }
    }
}
