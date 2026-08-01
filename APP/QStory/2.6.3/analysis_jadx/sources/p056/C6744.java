package p056;

import io.ktor.client.plugins.AbstractC3933;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.InterfaceC5184;
import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p087.C7083;
import p087.C7106;
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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪世子兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6744 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6744 f18170;

    static {
        C6744 c6744 = new C6744();
        f18170 = c6744;
        C7129 c7129 = new C7129("io.modelcontextprotocol.kotlin.sdk.ProgressNotification", c6744, 6);
        c7129.m12409("progress", false);
        c7129.m12409("progressToken", false);
        c7129.m12409("_meta", true);
        c7129.m12409("total", false);
        c7129.m12409("message", false);
        c7129.m12409("method", true);
        descriptor = c7129;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        return new InterfaceC7184[]{C7083.f18997, C6754.f18182[1].getValue(), C7150.f19112, AbstractC3933.m8313(C7106.f19033), AbstractC3933.m8313(C7135.f19089), C6792.f18232};
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(interfaceC7191);
        InterfaceC5184[] interfaceC5184Arr = C6754.f18182;
        interfaceC7189Mo10676.getClass();
        boolean z = true;
        int i = 0;
        int iMo10671 = 0;
        InterfaceC6836 interfaceC6836 = null;
        C7152 c7152 = null;
        Double d = null;
        String str = null;
        InterfaceC6816 interfaceC6816 = null;
        while (z) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(interfaceC7191);
            switch (iMo10718) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iMo10671 = interfaceC7189Mo10676.mo10671(interfaceC7191, 0);
                    i |= 1;
                    break;
                case 1:
                    interfaceC6836 = (InterfaceC6836) interfaceC7189Mo10676.mo10674(interfaceC7191, 1, (InterfaceC7184) interfaceC5184Arr[1].getValue(), interfaceC6836);
                    i |= 2;
                    break;
                case 2:
                    c7152 = (C7152) interfaceC7189Mo10676.mo10674(interfaceC7191, 2, C7150.f19112, c7152);
                    i |= 4;
                    break;
                case 3:
                    d = (Double) interfaceC7189Mo10676.mo10675(interfaceC7191, 3, C7106.f19033, d);
                    i |= 8;
                    break;
                case 4:
                    str = (String) interfaceC7189Mo10676.mo10675(interfaceC7191, 4, C7135.f19089, str);
                    i |= 16;
                    break;
                case 5:
                    interfaceC6816 = (InterfaceC6816) interfaceC7189Mo10676.mo10674(interfaceC7191, 5, C6792.f18232, interfaceC6816);
                    i |= 32;
                    break;
                default:
                    C7547.m12767(iMo10718);
                    return null;
            }
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C6754(i, iMo10671, interfaceC6836, c7152, d, str, interfaceC6816);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C6754 c6754 = (C6754) obj;
        c6754.getClass();
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(interfaceC7191);
        InterfaceC5184[] interfaceC5184Arr = C6754.f18182;
        int i = c6754.f18188;
        InterfaceC6816 interfaceC6816 = c6754.f18183;
        C7152 c7152 = c6754.f18186;
        interfaceC7188Mo10710.mo10729(0, i, interfaceC7191);
        interfaceC7188Mo10710.mo10719(interfaceC7191, 1, (InterfaceC7184) interfaceC5184Arr[1].getValue(), c6754.f18187);
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || !AbstractC4395.m8907(c7152, AbstractC6602.f17976)) {
            interfaceC7188Mo10710.mo10719(interfaceC7191, 2, C7150.f19112, c7152);
        }
        interfaceC7188Mo10710.mo10715(interfaceC7191, 3, C7106.f19033, c6754.f18185);
        interfaceC7188Mo10710.mo10715(interfaceC7191, 4, C7135.f19089, c6754.f18184);
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || interfaceC6816 != Method$Defined.NotificationsProgress) {
            interfaceC7188Mo10710.mo10719(interfaceC7191, 5, C6792.f18232, interfaceC6816);
        }
        interfaceC7188Mo10710.mo10711(interfaceC7191);
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] typeParametersSerializers() {
        return AbstractC7144.f19103;
    }
}
