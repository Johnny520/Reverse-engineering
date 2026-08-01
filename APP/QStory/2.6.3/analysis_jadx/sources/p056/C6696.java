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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6696 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6696 f18108;

    static {
        C6696 c6696 = new C6696();
        f18108 = c6696;
        C7129 c7129 = new C7129("io.modelcontextprotocol.kotlin.sdk.ClientCapabilities", c6696, 3);
        c7129.m12409("experimental", true);
        c7129.m12409("sampling", true);
        c7129.m12409("roots", true);
        descriptor = c7129;
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        C7150 c7150 = C7150.f19112;
        return new InterfaceC7184[]{AbstractC3933.m8313(c7150), AbstractC3933.m8313(c7150), AbstractC3933.m8313(C6699.f18113)};
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
        C6697 c6697 = null;
        while (z) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(interfaceC7191);
            if (iMo10718 == -1) {
                z = false;
            } else if (iMo10718 == 0) {
                c7152 = (C7152) interfaceC7189Mo10676.mo10675(interfaceC7191, 0, C7150.f19112, c7152);
                i |= 1;
            } else if (iMo10718 == 1) {
                c71522 = (C7152) interfaceC7189Mo10676.mo10675(interfaceC7191, 1, C7150.f19112, c71522);
                i |= 2;
            } else {
                if (iMo10718 != 2) {
                    C7547.m12767(iMo10718);
                    return null;
                }
                c6697 = (C6697) interfaceC7189Mo10676.mo10675(interfaceC7191, 2, C6699.f18113, c6697);
                i |= 4;
            }
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C6698(i, c7152, c71522, c6697);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C6698 c6698 = (C6698) obj;
        c6698.getClass();
        C6697 c6697 = c6698.f18110;
        C7152 c7152 = c6698.f18111;
        C7152 c71522 = c6698.f18112;
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(interfaceC7191);
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || !AbstractC4395.m8907(c71522, AbstractC6602.f17976)) {
            interfaceC7188Mo10710.mo10715(interfaceC7191, 0, C7150.f19112, c71522);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || !AbstractC4395.m8907(c7152, AbstractC6602.f17976)) {
            interfaceC7188Mo10710.mo10715(interfaceC7191, 1, C7150.f19112, c7152);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || c6697 != null) {
            interfaceC7188Mo10710.mo10715(interfaceC7191, 2, C6699.f18113, c6697);
        }
        interfaceC7188Mo10710.mo10711(interfaceC7191);
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] typeParametersSerializers() {
        return AbstractC7144.f19103;
    }
}
