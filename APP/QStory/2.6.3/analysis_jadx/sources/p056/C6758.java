package p056;

import io.modelcontextprotocol.kotlin.sdk.Role;
import kotlin.InterfaceC5184;
import p087.AbstractC7144;
import p087.C7129;
import p087.InterfaceC7079;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p090.InterfaceC7189;
import p091.InterfaceC7191;
import p144.C7547;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪兰世子苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6758 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6758 f18190;

    static {
        C6758 c6758 = new C6758();
        f18190 = c6758;
        C7129 c7129 = new C7129("io.modelcontextprotocol.kotlin.sdk.SamplingMessage", c6758, 2);
        c7129.m12409("role", false);
        c7129.m12409("content", false);
        descriptor = c7129;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        return new InterfaceC7184[]{C6760.f18192[0].getValue(), C6846.f18284};
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(interfaceC7191);
        InterfaceC5184[] interfaceC5184Arr = C6760.f18192;
        interfaceC7189Mo10676.getClass();
        boolean z = true;
        int i = 0;
        Role role = null;
        InterfaceC6732 interfaceC6732 = null;
        while (z) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(interfaceC7191);
            if (iMo10718 == -1) {
                z = false;
            } else if (iMo10718 == 0) {
                role = (Role) interfaceC7189Mo10676.mo10674(interfaceC7191, 0, (InterfaceC7184) interfaceC5184Arr[0].getValue(), role);
                i |= 1;
            } else {
                if (iMo10718 != 1) {
                    C7547.m12767(iMo10718);
                    return null;
                }
                interfaceC6732 = (InterfaceC6732) interfaceC7189Mo10676.mo10674(interfaceC7191, 1, C6846.f18284, interfaceC6732);
                i |= 2;
            }
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C6760(i, role, interfaceC6732);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C6760 c6760 = (C6760) obj;
        c6760.getClass();
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(interfaceC7191);
        interfaceC7188Mo10710.mo10719(interfaceC7191, 0, (InterfaceC7184) C6760.f18192[0].getValue(), c6760.f18194);
        interfaceC7188Mo10710.mo10719(interfaceC7191, 1, C6846.f18284, c6760.f18193);
        interfaceC7188Mo10710.mo10711(interfaceC7191);
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] typeParametersSerializers() {
        return AbstractC7144.f19103;
    }
}
