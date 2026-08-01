package p056;

import io.ktor.client.plugins.AbstractC3933;
import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪兰世苏哲子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6759 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6759 f18191;

    static {
        C6759 c6759 = new C6759();
        f18191 = c6759;
        C7129 c7129 = new C7129("io.modelcontextprotocol.kotlin.sdk.ServerCapabilities", c6759, 6);
        c7129.m12409("experimental", true);
        c7129.m12409("sampling", true);
        c7129.m12409("logging", true);
        c7129.m12409("prompts", true);
        c7129.m12409("resources", true);
        c7129.m12409("tools", true);
        descriptor = c7129;
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        C7150 c7150 = C7150.f19112;
        return new InterfaceC7184[]{AbstractC3933.m8313(c7150), AbstractC3933.m8313(c7150), AbstractC3933.m8313(c7150), AbstractC3933.m8313(C6756.f18189), AbstractC3933.m8313(C6774.f18210), AbstractC3933.m8313(C6775.f18211)};
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(interfaceC7191);
        interfaceC7189Mo10676.getClass();
        boolean z = true;
        int i = 0;
        C7152 c7152 = null;
        C7152 c71522 = null;
        C7152 c71523 = null;
        C6778 c6778 = null;
        C6776 c6776 = null;
        C6764 c6764 = null;
        while (z) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(interfaceC7191);
            switch (iMo10718) {
                case -1:
                    z = false;
                    break;
                case 0:
                    c7152 = (C7152) interfaceC7189Mo10676.mo10675(interfaceC7191, 0, C7150.f19112, c7152);
                    i |= 1;
                    break;
                case 1:
                    c71522 = (C7152) interfaceC7189Mo10676.mo10675(interfaceC7191, 1, C7150.f19112, c71522);
                    i |= 2;
                    break;
                case 2:
                    c71523 = (C7152) interfaceC7189Mo10676.mo10675(interfaceC7191, 2, C7150.f19112, c71523);
                    i |= 4;
                    break;
                case 3:
                    c6778 = (C6778) interfaceC7189Mo10676.mo10675(interfaceC7191, 3, C6756.f18189, c6778);
                    i |= 8;
                    break;
                case 4:
                    c6776 = (C6776) interfaceC7189Mo10676.mo10675(interfaceC7191, 4, C6774.f18210, c6776);
                    i |= 16;
                    break;
                case 5:
                    c6764 = (C6764) interfaceC7189Mo10676.mo10675(interfaceC7191, 5, C6775.f18211, c6764);
                    i |= 32;
                    break;
                default:
                    C7547.m12767(iMo10718);
                    return null;
            }
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C6761(i, c7152, c71522, c71523, c6778, c6776, c6764);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C6761 c6761 = (C6761) obj;
        c6761.getClass();
        C6764 c6764 = c6761.f18195;
        C6776 c6776 = c6761.f18196;
        C6778 c6778 = c6761.f18197;
        C7152 c7152 = c6761.f18198;
        C7152 c71522 = c6761.f18199;
        C7152 c71523 = c6761.f18200;
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(interfaceC7191);
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || !AbstractC4395.m8907(c71523, AbstractC6602.f17976)) {
            interfaceC7188Mo10710.mo10715(interfaceC7191, 0, C7150.f19112, c71523);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || !AbstractC4395.m8907(c71522, AbstractC6602.f17976)) {
            interfaceC7188Mo10710.mo10715(interfaceC7191, 1, C7150.f19112, c71522);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || !AbstractC4395.m8907(c7152, AbstractC6602.f17976)) {
            interfaceC7188Mo10710.mo10715(interfaceC7191, 2, C7150.f19112, c7152);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || c6778 != null) {
            interfaceC7188Mo10710.mo10715(interfaceC7191, 3, C6756.f18189, c6778);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || c6776 != null) {
            interfaceC7188Mo10710.mo10715(interfaceC7191, 4, C6774.f18210, c6776);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || c6764 != null) {
            interfaceC7188Mo10710.mo10715(interfaceC7191, 5, C6775.f18211, c6764);
        }
        interfaceC7188Mo10710.mo10711(interfaceC7191);
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] typeParametersSerializers() {
        return AbstractC7144.f19103;
    }
}
