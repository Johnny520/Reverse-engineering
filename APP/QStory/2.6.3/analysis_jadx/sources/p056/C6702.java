package p056;

import io.ktor.client.plugins.AbstractC3933;
import java.util.List;
import kotlin.InterfaceC5184;
import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p087.C7100;
import p087.C7129;
import p087.InterfaceC7079;
import p088.C7150;
import p088.C7152;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p090.InterfaceC7189;
import p091.InterfaceC7191;
import p144.C7547;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6702 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6702 f18114;

    static {
        C6702 c6702 = new C6702();
        f18114 = c6702;
        C7129 c7129 = new C7129("io.modelcontextprotocol.kotlin.sdk.CallToolResult", c6702, 3);
        c7129.m12409("content", false);
        c7129.m12409("isError", true);
        c7129.m12409("_meta", true);
        descriptor = c7129;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        return new InterfaceC7184[]{C6705.f18120[0].getValue(), AbstractC3933.m8313(C7100.f19025), C7150.f19112};
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(interfaceC7191);
        InterfaceC5184[] interfaceC5184Arr = C6705.f18120;
        interfaceC7189Mo10676.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        Boolean bool = null;
        C7152 c7152 = null;
        while (z) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(interfaceC7191);
            if (iMo10718 == -1) {
                z = false;
            } else if (iMo10718 == 0) {
                list = (List) interfaceC7189Mo10676.mo10674(interfaceC7191, 0, (InterfaceC7184) interfaceC5184Arr[0].getValue(), list);
                i |= 1;
            } else if (iMo10718 == 1) {
                bool = (Boolean) interfaceC7189Mo10676.mo10675(interfaceC7191, 1, C7100.f19025, bool);
                i |= 2;
            } else {
                if (iMo10718 != 2) {
                    C7547.m12767(iMo10718);
                    return null;
                }
                c7152 = (C7152) interfaceC7189Mo10676.mo10674(interfaceC7191, 2, C7150.f19112, c7152);
                i |= 4;
            }
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C6705(i, list, bool, c7152);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C6705 c6705 = (C6705) obj;
        c6705.getClass();
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(interfaceC7191);
        InterfaceC7184 interfaceC7184 = (InterfaceC7184) C6705.f18120[0].getValue();
        List list = c6705.f18123;
        C7152 c7152 = c6705.f18121;
        Boolean bool = c6705.f18122;
        interfaceC7188Mo10710.mo10719(interfaceC7191, 0, interfaceC7184, list);
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || !AbstractC4395.m8907(bool, Boolean.FALSE)) {
            interfaceC7188Mo10710.mo10715(interfaceC7191, 1, C7100.f19025, bool);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || !AbstractC4395.m8907(c7152, AbstractC6602.f17976)) {
            interfaceC7188Mo10710.mo10719(interfaceC7191, 2, C7150.f19112, c7152);
        }
        interfaceC7188Mo10710.mo10711(interfaceC7191);
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] typeParametersSerializers() {
        return AbstractC7144.f19103;
    }
}
