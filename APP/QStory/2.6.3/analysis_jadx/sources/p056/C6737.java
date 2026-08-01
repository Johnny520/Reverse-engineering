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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪世哲兰子苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6737 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6737 f18164;

    static {
        C6737 c6737 = new C6737();
        f18164 = c6737;
        C7129 c7129 = new C7129("io.modelcontextprotocol.kotlin.sdk.PromptMessage", c6737, 2);
        c7129.m12409("role", false);
        c7129.m12409("content", false);
        descriptor = c7129;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        return new InterfaceC7184[]{C6734.f18160[0].getValue(), C6735.f18163};
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(interfaceC7191);
        InterfaceC5184[] interfaceC5184Arr = C6734.f18160;
        interfaceC7189Mo10676.getClass();
        boolean z = true;
        int i = 0;
        Role role = null;
        InterfaceC6736 interfaceC6736 = null;
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
                interfaceC6736 = (InterfaceC6736) interfaceC7189Mo10676.mo10674(interfaceC7191, 1, C6735.f18163, interfaceC6736);
                i |= 2;
            }
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C6734(i, role, interfaceC6736);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C6734 c6734 = (C6734) obj;
        c6734.getClass();
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(interfaceC7191);
        interfaceC7188Mo10710.mo10719(interfaceC7191, 0, (InterfaceC7184) C6734.f18160[0].getValue(), c6734.f18162);
        interfaceC7188Mo10710.mo10719(interfaceC7191, 1, C6735.f18163, c6734.f18161);
        interfaceC7188Mo10710.mo10711(interfaceC7191);
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] typeParametersSerializers() {
        return AbstractC7144.f19103;
    }
}
