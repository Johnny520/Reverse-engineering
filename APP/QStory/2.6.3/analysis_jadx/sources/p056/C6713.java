package p056;

import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p087.C7129;
import p087.C7135;
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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6713 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6713 f18136;

    static {
        C6713 c6713 = new C6713();
        f18136 = c6713;
        C7129 c7129 = new C7129("io.modelcontextprotocol.kotlin.sdk.InitializeResult", c6713, 4);
        c7129.m12409("protocolVersion", true);
        c7129.m12409("capabilities", true);
        c7129.m12409("serverInfo", false);
        c7129.m12409("_meta", true);
        descriptor = c7129;
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        return new InterfaceC7184[]{C7135.f19089, C6759.f18191, C6719.f18147, C7150.f19112};
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(interfaceC7191);
        interfaceC7189Mo10676.getClass();
        boolean z = true;
        int i = 0;
        String strMo10686 = null;
        C6761 c6761 = null;
        C6721 c6721 = null;
        C7152 c7152 = null;
        while (z) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(interfaceC7191);
            if (iMo10718 == -1) {
                z = false;
            } else if (iMo10718 == 0) {
                strMo10686 = interfaceC7189Mo10676.mo10686(interfaceC7191, 0);
                i |= 1;
            } else if (iMo10718 == 1) {
                c6761 = (C6761) interfaceC7189Mo10676.mo10674(interfaceC7191, 1, C6759.f18191, c6761);
                i |= 2;
            } else if (iMo10718 == 2) {
                c6721 = (C6721) interfaceC7189Mo10676.mo10674(interfaceC7191, 2, C6719.f18147, c6721);
                i |= 4;
            } else {
                if (iMo10718 != 3) {
                    C7547.m12767(iMo10718);
                    return null;
                }
                c7152 = (C7152) interfaceC7189Mo10676.mo10674(interfaceC7191, 3, C7150.f19112, c7152);
                i |= 8;
            }
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C6715(i, strMo10686, c6761, c6721, c7152);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C6715 c6715 = (C6715) obj;
        c6715.getClass();
        C6761 c6761 = c6715.f18144;
        String str = c6715.f18145;
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(interfaceC7191);
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || !AbstractC4395.m8907(str, "2024-11-05")) {
            interfaceC7188Mo10710.mo10735(interfaceC7191, 0, str);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || !AbstractC4395.m8907(c6761, new C6761(null, null, null, 63))) {
            interfaceC7188Mo10710.mo10719(interfaceC7191, 1, C6759.f18191, c6761);
        }
        C6719 c6719 = C6719.f18147;
        C6721 c6721 = c6715.f18143;
        C7152 c7152 = c6715.f18142;
        interfaceC7188Mo10710.mo10719(interfaceC7191, 2, c6719, c6721);
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || !AbstractC4395.m8907(c7152, AbstractC6602.f17976)) {
            interfaceC7188Mo10710.mo10719(interfaceC7191, 3, C7150.f19112, c7152);
        }
        interfaceC7188Mo10710.mo10711(interfaceC7191);
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] typeParametersSerializers() {
        return AbstractC7144.f19103;
    }
}
