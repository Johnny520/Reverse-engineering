package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6657 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6657 f18057;

    static {
        C6657 c6657 = new C6657();
        f18057 = c6657;
        C7129 c7129 = new C7129("io.modelcontextprotocol.kotlin.sdk.ListRootsRequest", c6657, 2);
        c7129.m12409("_meta", true);
        c7129.m12409("method", true);
        descriptor = c7129;
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        return new InterfaceC7184[]{C7150.f19112, C6792.f18232};
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(interfaceC7191);
        interfaceC7189Mo10676.getClass();
        boolean z = true;
        int i = 0;
        C7152 c7152 = null;
        InterfaceC6816 interfaceC6816 = null;
        while (z) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(interfaceC7191);
            if (iMo10718 == -1) {
                z = false;
            } else if (iMo10718 == 0) {
                c7152 = (C7152) interfaceC7189Mo10676.mo10674(interfaceC7191, 0, C7150.f19112, c7152);
                i |= 1;
            } else {
                if (iMo10718 != 1) {
                    C7547.m12767(iMo10718);
                    return null;
                }
                interfaceC6816 = (InterfaceC6816) interfaceC7189Mo10676.mo10674(interfaceC7191, 1, C6792.f18232, interfaceC6816);
                i |= 2;
            }
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C6654(i, c7152, interfaceC6816);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C6654 c6654 = (C6654) obj;
        c6654.getClass();
        InterfaceC6816 interfaceC6816 = c6654.f18052;
        C7152 c7152 = c6654.f18053;
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(interfaceC7191);
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || !AbstractC4395.m8907(c7152, AbstractC6602.f17976)) {
            interfaceC7188Mo10710.mo10719(interfaceC7191, 0, C7150.f19112, c7152);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || interfaceC6816 != Method$Defined.RootsList) {
            interfaceC7188Mo10710.mo10719(interfaceC7191, 1, C6792.f18232, interfaceC6816);
        }
        interfaceC7188Mo10710.mo10711(interfaceC7191);
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] typeParametersSerializers() {
        return AbstractC7144.f19103;
    }
}
