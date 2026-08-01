package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世楪哲苏兰子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6597 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6597 f17971;

    static {
        C6597 c6597 = new C6597();
        f17971 = c6597;
        C7129 c7129 = new C7129("io.modelcontextprotocol.kotlin.sdk.UnsubscribeRequest", c6597, 3);
        c7129.m12409("uri", false);
        c7129.m12409("_meta", true);
        c7129.m12409("method", true);
        descriptor = c7129;
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        return new InterfaceC7184[]{C7135.f19089, C7150.f19112, C6792.f18232};
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(interfaceC7191);
        interfaceC7189Mo10676.getClass();
        boolean z = true;
        int i = 0;
        String strMo10686 = null;
        C7152 c7152 = null;
        InterfaceC6816 interfaceC6816 = null;
        while (z) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(interfaceC7191);
            if (iMo10718 == -1) {
                z = false;
            } else if (iMo10718 == 0) {
                strMo10686 = interfaceC7189Mo10676.mo10686(interfaceC7191, 0);
                i |= 1;
            } else if (iMo10718 == 1) {
                c7152 = (C7152) interfaceC7189Mo10676.mo10674(interfaceC7191, 1, C7150.f19112, c7152);
                i |= 2;
            } else {
                if (iMo10718 != 2) {
                    C7547.m12767(iMo10718);
                    return null;
                }
                interfaceC6816 = (InterfaceC6816) interfaceC7189Mo10676.mo10674(interfaceC7191, 2, C6792.f18232, interfaceC6816);
                i |= 4;
            }
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C6594(i, strMo10686, c7152, interfaceC6816);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C6594 c6594 = (C6594) obj;
        c6594.getClass();
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(interfaceC7191);
        String str = c6594.f17969;
        InterfaceC6816 interfaceC6816 = c6594.f17967;
        C7152 c7152 = c6594.f17968;
        interfaceC7188Mo10710.mo10735(interfaceC7191, 0, str);
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || !AbstractC4395.m8907(c7152, AbstractC6602.f17976)) {
            interfaceC7188Mo10710.mo10719(interfaceC7191, 1, C7150.f19112, c7152);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || interfaceC6816 != Method$Defined.ResourcesUnsubscribe) {
            interfaceC7188Mo10710.mo10719(interfaceC7191, 2, C6792.f18232, interfaceC6816);
        }
        interfaceC7188Mo10710.mo10711(interfaceC7191);
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] typeParametersSerializers() {
        return AbstractC7144.f19103;
    }
}
