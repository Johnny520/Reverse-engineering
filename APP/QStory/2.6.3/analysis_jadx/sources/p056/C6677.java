package p056;

import io.ktor.client.plugins.AbstractC3933;
import kotlin.InterfaceC5184;
import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p087.C7129;
import p087.C7135;
import p087.InterfaceC7079;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p090.InterfaceC7189;
import p091.InterfaceC7191;
import p144.C7547;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6677 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6677 f18079;

    static {
        C6677 c6677 = new C6677();
        f18079 = c6677;
        C7129 c7129 = new C7129("io.modelcontextprotocol.kotlin.sdk.JSONRPCResponse", c6677, 4);
        c7129.m12409("id", false);
        c7129.m12409("jsonrpc", true);
        c7129.m12409("result", true);
        c7129.m12409("error", true);
        descriptor = c7129;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        return new InterfaceC7184[]{C6679.f18085[0].getValue(), C7135.f19089, AbstractC3933.m8313(C6793.f18233), AbstractC3933.m8313(C6676.f18078)};
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(interfaceC7191);
        InterfaceC5184[] interfaceC5184Arr = C6679.f18085;
        interfaceC7189Mo10676.getClass();
        boolean z = true;
        int i = 0;
        InterfaceC6836 interfaceC6836 = null;
        String strMo10686 = null;
        InterfaceC6796 interfaceC6796 = null;
        C6674 c6674 = null;
        while (z) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(interfaceC7191);
            if (iMo10718 == -1) {
                z = false;
            } else if (iMo10718 == 0) {
                interfaceC6836 = (InterfaceC6836) interfaceC7189Mo10676.mo10674(interfaceC7191, 0, (InterfaceC7184) interfaceC5184Arr[0].getValue(), interfaceC6836);
                i |= 1;
            } else if (iMo10718 == 1) {
                strMo10686 = interfaceC7189Mo10676.mo10686(interfaceC7191, 1);
                i |= 2;
            } else if (iMo10718 == 2) {
                interfaceC6796 = (InterfaceC6796) interfaceC7189Mo10676.mo10675(interfaceC7191, 2, C6793.f18233, interfaceC6796);
                i |= 4;
            } else {
                if (iMo10718 != 3) {
                    C7547.m12767(iMo10718);
                    return null;
                }
                c6674 = (C6674) interfaceC7189Mo10676.mo10675(interfaceC7191, 3, C6676.f18078, c6674);
                i |= 8;
            }
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C6679(i, interfaceC6836, strMo10686, interfaceC6796, c6674);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C6679 c6679 = (C6679) obj;
        c6679.getClass();
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(interfaceC7191);
        InterfaceC7184 interfaceC7184 = (InterfaceC7184) C6679.f18085[0].getValue();
        InterfaceC6836 interfaceC6836 = c6679.f18089;
        C6674 c6674 = c6679.f18086;
        InterfaceC6796 interfaceC6796 = c6679.f18087;
        String str = c6679.f18088;
        interfaceC7188Mo10710.mo10719(interfaceC7191, 0, interfaceC7184, interfaceC6836);
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || !AbstractC4395.m8907(str, "2.0")) {
            interfaceC7188Mo10710.mo10735(interfaceC7191, 1, str);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || interfaceC6796 != null) {
            interfaceC7188Mo10710.mo10715(interfaceC7191, 2, C6793.f18233, interfaceC6796);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || c6674 != null) {
            interfaceC7188Mo10710.mo10715(interfaceC7191, 3, C6676.f18078, c6674);
        }
        interfaceC7188Mo10710.mo10711(interfaceC7191);
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] typeParametersSerializers() {
        return AbstractC7144.f19103;
    }
}
