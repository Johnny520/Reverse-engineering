package p332wb;

import bsh.org.objectweb.asm.Opcodes;
import p085fg.InterfaceC1220a;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.af */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4716af implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f15767g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f15768h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f15769i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f15770j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f15771k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4716af(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, int i9) {
        this.f15767g = i9;
        this.f15768h = interfaceC1809a1;
        this.f15769i = interfaceC1809a12;
        this.f15770j = interfaceC1809a13;
        this.f15771k = interfaceC1809a14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f15767g) {
            case 0:
                InterfaceC1809a1 interfaceC1809a1 = this.f15768h;
                String str = ((Number) interfaceC1809a1.getValue()).intValue() == 1 ? "选择白名单" : "选择黑名单";
                int iIntValue = ((Number) interfaceC1809a1.getValue()).intValue();
                InterfaceC1809a1 interfaceC1809a12 = this.f15769i;
                InterfaceC1809a1 interfaceC1809a13 = this.f15770j;
                String str2 = iIntValue == 1 ? (String) interfaceC1809a12.getValue() : (String) interfaceC1809a13.getValue();
                this.f15771k.setValue(new C5391v0(str, EnumC5358u0.f20980i, true, str2, new C4714ad(interfaceC1809a1, interfaceC1809a12, interfaceC1809a13, 1), true, Opcodes.CHECKCAST));
                break;
            case 1:
                C5491y2.m9841s(this.f15768h, this.f15769i, this.f15770j, this.f15771k, -5000);
                break;
            default:
                C5491y2.m9841s(this.f15768h, this.f15769i, this.f15770j, this.f15771k, 5000);
                break;
        }
        return C3967n.f12976a;
    }
}
