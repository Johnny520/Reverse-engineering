package p056;

import io.ktor.client.plugins.AbstractC3933;
import p087.AbstractC7144;
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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪兰苏世子哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6774 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6774 f18210;

    static {
        C6774 c6774 = new C6774();
        f18210 = c6774;
        C7129 c7129 = new C7129("io.modelcontextprotocol.kotlin.sdk.ServerCapabilities.Resources", c6774, 2);
        c7129.m12409("subscribe", false);
        c7129.m12409("listChanged", false);
        descriptor = c7129;
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        C7100 c7100 = C7100.f19025;
        return new InterfaceC7184[]{AbstractC3933.m8313(c7100), AbstractC3933.m8313(c7100)};
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(interfaceC7191);
        interfaceC7189Mo10676.getClass();
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        while (z) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(interfaceC7191);
            if (iMo10718 == -1) {
                z = false;
            } else if (iMo10718 == 0) {
                bool = (Boolean) interfaceC7189Mo10676.mo10675(interfaceC7191, 0, C7100.f19025, bool);
                i |= 1;
            } else {
                if (iMo10718 != 1) {
                    C7547.m12767(iMo10718);
                    return null;
                }
                bool2 = (Boolean) interfaceC7189Mo10676.mo10675(interfaceC7191, 1, C7100.f19025, bool2);
                i |= 2;
            }
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C6776(i, bool, bool2);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C6776 c6776 = (C6776) obj;
        c6776.getClass();
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(interfaceC7191);
        C7100 c7100 = C7100.f19025;
        interfaceC7188Mo10710.mo10715(interfaceC7191, 0, c7100, c6776.f18213);
        interfaceC7188Mo10710.mo10715(interfaceC7191, 1, c7100, c6776.f18212);
        interfaceC7188Mo10710.mo10711(interfaceC7191);
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] typeParametersSerializers() {
        return AbstractC7144.f19103;
    }
}
