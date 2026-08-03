package p332wb;

import java.util.Set;
import p085fg.InterfaceC1220a;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;
import tf.AbstractC4156d0;

/* JADX INFO: renamed from: wb.x1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5458x1 implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21844g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5292s0 f21845h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f21846i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5458x1(C5292s0 c5292s0, InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f21844g = i9;
        this.f21845h = c5292s0;
        this.f21846i = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f21844g) {
            case 0:
                InterfaceC1809a1 interfaceC1809a1 = this.f21846i;
                Set set = (Set) interfaceC1809a1.getValue();
                String str = this.f21845h.f20550a;
                interfaceC1809a1.setValue(set.contains(str) ? AbstractC4156d0.m8351S((Set) interfaceC1809a1.getValue(), str) : AbstractC4156d0.m8354V((Set) interfaceC1809a1.getValue(), str));
                break;
            case 1:
                InterfaceC1809a1 interfaceC1809a12 = this.f21846i;
                Set set2 = (Set) interfaceC1809a12.getValue();
                String str2 = this.f21845h.f20550a;
                interfaceC1809a12.setValue(set2.contains(str2) ? AbstractC4156d0.m8351S((Set) interfaceC1809a12.getValue(), str2) : AbstractC4156d0.m8354V((Set) interfaceC1809a12.getValue(), str2));
                break;
            case 2:
                InterfaceC1809a1 interfaceC1809a13 = this.f21846i;
                Set set3 = (Set) interfaceC1809a13.getValue();
                String str3 = this.f21845h.f20550a;
                interfaceC1809a13.setValue(set3.contains(str3) ? AbstractC4156d0.m8351S((Set) interfaceC1809a13.getValue(), str3) : AbstractC4156d0.m8354V((Set) interfaceC1809a13.getValue(), str3));
                break;
            case 3:
                InterfaceC1809a1 interfaceC1809a14 = this.f21846i;
                Set set4 = (Set) interfaceC1809a14.getValue();
                String str4 = this.f21845h.f20550a;
                interfaceC1809a14.setValue(set4.contains(str4) ? AbstractC4156d0.m8351S((Set) interfaceC1809a14.getValue(), str4) : AbstractC4156d0.m8354V((Set) interfaceC1809a14.getValue(), str4));
                break;
            default:
                InterfaceC1809a1 interfaceC1809a15 = this.f21846i;
                Set set5 = (Set) interfaceC1809a15.getValue();
                String str5 = this.f21845h.f20550a;
                interfaceC1809a15.setValue(set5.contains(str5) ? AbstractC4156d0.m8351S((Set) interfaceC1809a15.getValue(), str5) : AbstractC4156d0.m8354V((Set) interfaceC1809a15.getValue(), str5));
                break;
        }
        return C3967n.f12976a;
    }
}
