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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6690 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6690 f18100;

    static {
        C6690 c6690 = new C6690();
        f18100 = c6690;
        C7129 c7129 = new C7129("io.modelcontextprotocol.kotlin.sdk.CompatibilityCallToolResult", c6690, 4);
        c7129.m12409("content", false);
        c7129.m12409("isError", true);
        c7129.m12409("_meta", true);
        c7129.m12409("toolResult", true);
        descriptor = c7129;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        C7150 c7150 = C7150.f19112;
        return new InterfaceC7184[]{C6693.f18102[0].getValue(), AbstractC3933.m8313(C7100.f19025), c7150, c7150};
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(interfaceC7191);
        InterfaceC5184[] interfaceC5184Arr = C6693.f18102;
        interfaceC7189Mo10676.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        Boolean bool = null;
        C7152 c7152 = null;
        C7152 c71522 = null;
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
            } else if (iMo10718 == 2) {
                c7152 = (C7152) interfaceC7189Mo10676.mo10674(interfaceC7191, 2, C7150.f19112, c7152);
                i |= 4;
            } else {
                if (iMo10718 != 3) {
                    C7547.m12767(iMo10718);
                    return null;
                }
                c71522 = (C7152) interfaceC7189Mo10676.mo10674(interfaceC7191, 3, C7150.f19112, c71522);
                i |= 8;
            }
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C6693(i, list, bool, c7152, c71522);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C6693 c6693 = (C6693) obj;
        c6693.getClass();
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(interfaceC7191);
        InterfaceC7184 interfaceC7184 = (InterfaceC7184) C6693.f18102[0].getValue();
        List list = c6693.f18106;
        C7152 c7152 = c6693.f18103;
        C7152 c71522 = c6693.f18104;
        Boolean bool = c6693.f18105;
        interfaceC7188Mo10710.mo10719(interfaceC7191, 0, interfaceC7184, list);
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || !AbstractC4395.m8907(bool, Boolean.FALSE)) {
            interfaceC7188Mo10710.mo10715(interfaceC7191, 1, C7100.f19025, bool);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || !AbstractC4395.m8907(c71522, AbstractC6602.f17976)) {
            interfaceC7188Mo10710.mo10719(interfaceC7191, 2, C7150.f19112, c71522);
        }
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
