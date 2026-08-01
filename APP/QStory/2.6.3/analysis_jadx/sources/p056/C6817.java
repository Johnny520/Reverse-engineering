package p056;

import io.ktor.client.plugins.AbstractC3933;
import java.util.List;
import kotlin.InterfaceC5184;
import p087.AbstractC7144;
import p087.C7106;
import p087.C7129;
import p087.InterfaceC7079;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p090.InterfaceC7189;
import p091.InterfaceC7191;
import p144.C7547;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪子哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6817 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6817 f18256;

    static {
        C6817 c6817 = new C6817();
        f18256 = c6817;
        C7129 c7129 = new C7129("io.modelcontextprotocol.kotlin.sdk.ModelPreferences", c6817, 4);
        c7129.m12409("hints", false);
        c7129.m12409("costPriority", false);
        c7129.m12409("speedPriority", false);
        c7129.m12409("intelligencePriority", false);
        descriptor = c7129;
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        InterfaceC7184 interfaceC7184M8313 = AbstractC3933.m8313((InterfaceC7184) C6810.f18248[0].getValue());
        C7106 c7106 = C7106.f19033;
        return new InterfaceC7184[]{interfaceC7184M8313, AbstractC3933.m8313(c7106), AbstractC3933.m8313(c7106), AbstractC3933.m8313(c7106)};
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(interfaceC7191);
        InterfaceC5184[] interfaceC5184Arr = C6810.f18248;
        interfaceC7189Mo10676.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        Double d = null;
        Double d2 = null;
        Double d3 = null;
        while (z) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(interfaceC7191);
            if (iMo10718 == -1) {
                z = false;
            } else if (iMo10718 == 0) {
                list = (List) interfaceC7189Mo10676.mo10675(interfaceC7191, 0, (InterfaceC7184) interfaceC5184Arr[0].getValue(), list);
                i |= 1;
            } else if (iMo10718 == 1) {
                d = (Double) interfaceC7189Mo10676.mo10675(interfaceC7191, 1, C7106.f19033, d);
                i |= 2;
            } else if (iMo10718 == 2) {
                d2 = (Double) interfaceC7189Mo10676.mo10675(interfaceC7191, 2, C7106.f19033, d2);
                i |= 4;
            } else {
                if (iMo10718 != 3) {
                    C7547.m12767(iMo10718);
                    return null;
                }
                d3 = (Double) interfaceC7189Mo10676.mo10675(interfaceC7191, 3, C7106.f19033, d3);
                i |= 8;
            }
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C6810(i, list, d, d2, d3);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C6810 c6810 = (C6810) obj;
        c6810.getClass();
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(interfaceC7191);
        interfaceC7188Mo10710.mo10715(interfaceC7191, 0, (InterfaceC7184) C6810.f18248[0].getValue(), c6810.f18252);
        C7106 c7106 = C7106.f19033;
        interfaceC7188Mo10710.mo10715(interfaceC7191, 1, c7106, c6810.f18251);
        interfaceC7188Mo10710.mo10715(interfaceC7191, 2, c7106, c6810.f18250);
        interfaceC7188Mo10710.mo10715(interfaceC7191, 3, c7106, c6810.f18249);
        interfaceC7188Mo10710.mo10711(interfaceC7191);
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] typeParametersSerializers() {
        return AbstractC7144.f19103;
    }
}
