package p332wb;

import bsh.org.objectweb.asm.Opcodes;
import p085fg.InterfaceC1220a;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;
import ua.C4298i;

/* JADX INFO: renamed from: wb.yh */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5506yh implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f22172g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f22173h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f22174i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f22175j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5506yh(String str, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, int i9) {
        this.f22172g = i9;
        this.f22173h = str;
        this.f22174i = interfaceC1809a1;
        this.f22175j = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f22172g) {
            case 0:
                InterfaceC1809a1 interfaceC1809a1 = this.f22174i;
                this.f22175j.setValue(new C5391v0(((C4298i) interfaceC1809a1.getValue()).f14308i == 1 ? "选择白名单" : "选择黑名单", EnumC5358u0.f20980i, true, this.f22173h, new C5145ni(interfaceC1809a1, 18), true, Opcodes.CHECKCAST));
                break;
            default:
                this.f22174i.setValue(this.f22173h);
                this.f22175j.setValue("rename");
                break;
        }
        return C3967n.f12976a;
    }
}
