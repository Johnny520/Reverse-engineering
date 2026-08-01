package p056;

import io.ktor.client.plugins.AbstractC3933;
import java.util.List;
import kotlin.InterfaceC5184;
import p087.AbstractC7144;
import p087.C7083;
import p087.C7100;
import p087.C7129;
import p087.InterfaceC7079;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p090.InterfaceC7189;
import p091.InterfaceC7191;
import p144.C7547;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6623 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6623 f18008;

    static {
        C6623 c6623 = new C6623();
        f18008 = c6623;
        C7129 c7129 = new C7129("io.modelcontextprotocol.kotlin.sdk.CompleteResult.Completion", c6623, 3);
        c7129.m12409("values", false);
        c7129.m12409("total", false);
        c7129.m12409("hasMore", false);
        descriptor = c7129;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        return new InterfaceC7184[]{C6633.f18020[0].getValue(), AbstractC3933.m8313(C7083.f18997), AbstractC3933.m8313(C7100.f19025)};
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(interfaceC7191);
        InterfaceC5184[] interfaceC5184Arr = C6633.f18020;
        interfaceC7189Mo10676.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        Integer num = null;
        Boolean bool = null;
        while (z) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(interfaceC7191);
            if (iMo10718 == -1) {
                z = false;
            } else if (iMo10718 == 0) {
                list = (List) interfaceC7189Mo10676.mo10674(interfaceC7191, 0, (InterfaceC7184) interfaceC5184Arr[0].getValue(), list);
                i |= 1;
            } else if (iMo10718 == 1) {
                num = (Integer) interfaceC7189Mo10676.mo10675(interfaceC7191, 1, C7083.f18997, num);
                i |= 2;
            } else {
                if (iMo10718 != 2) {
                    C7547.m12767(iMo10718);
                    return null;
                }
                bool = (Boolean) interfaceC7189Mo10676.mo10675(interfaceC7191, 2, C7100.f19025, bool);
                i |= 4;
            }
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C6633(i, list, num, bool);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C6633 c6633 = (C6633) obj;
        c6633.getClass();
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(interfaceC7191);
        interfaceC7188Mo10710.mo10719(interfaceC7191, 0, (InterfaceC7184) C6633.f18020[0].getValue(), c6633.f18023);
        interfaceC7188Mo10710.mo10715(interfaceC7191, 1, C7083.f18997, c6633.f18022);
        interfaceC7188Mo10710.mo10715(interfaceC7191, 2, C7100.f19025, c6633.f18021);
        interfaceC7188Mo10710.mo10711(interfaceC7191);
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] typeParametersSerializers() {
        return AbstractC7144.f19103;
    }
}
