package p056;

import io.ktor.client.plugins.AbstractC3933;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import java.util.Map;
import kotlin.InterfaceC5184;
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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6712 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6712 f18135;

    static {
        C6712 c6712 = new C6712();
        f18135 = c6712;
        C7129 c7129 = new C7129("io.modelcontextprotocol.kotlin.sdk.GetPromptRequest", c6712, 4);
        c7129.m12409("name", false);
        c7129.m12409("arguments", false);
        c7129.m12409("_meta", true);
        c7129.m12409("method", true);
        descriptor = c7129;
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        return new InterfaceC7184[]{C7135.f19089, AbstractC3933.m8313((InterfaceC7184) C6710.f18130[1].getValue()), C7150.f19112, C6792.f18232};
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(interfaceC7191);
        InterfaceC5184[] interfaceC5184Arr = C6710.f18130;
        interfaceC7189Mo10676.getClass();
        boolean z = true;
        int i = 0;
        String strMo10686 = null;
        Map map = null;
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
                map = (Map) interfaceC7189Mo10676.mo10675(interfaceC7191, 1, (InterfaceC7184) interfaceC5184Arr[1].getValue(), map);
                i |= 2;
            } else if (iMo10718 == 2) {
                c7152 = (C7152) interfaceC7189Mo10676.mo10674(interfaceC7191, 2, C7150.f19112, c7152);
                i |= 4;
            } else {
                if (iMo10718 != 3) {
                    C7547.m12767(iMo10718);
                    return null;
                }
                interfaceC6816 = (InterfaceC6816) interfaceC7189Mo10676.mo10674(interfaceC7191, 3, C6792.f18232, interfaceC6816);
                i |= 8;
            }
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C6710(i, strMo10686, map, c7152, interfaceC6816);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C6710 c6710 = (C6710) obj;
        c6710.getClass();
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(interfaceC7191);
        InterfaceC5184[] interfaceC5184Arr = C6710.f18130;
        String str = c6710.f18134;
        InterfaceC6816 interfaceC6816 = c6710.f18131;
        C7152 c7152 = c6710.f18132;
        interfaceC7188Mo10710.mo10735(interfaceC7191, 0, str);
        interfaceC7188Mo10710.mo10715(interfaceC7191, 1, (InterfaceC7184) interfaceC5184Arr[1].getValue(), c6710.f18133);
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || !AbstractC4395.m8907(c7152, AbstractC6602.f17976)) {
            interfaceC7188Mo10710.mo10719(interfaceC7191, 2, C7150.f19112, c7152);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || interfaceC6816 != Method$Defined.PromptsGet) {
            interfaceC7188Mo10710.mo10719(interfaceC7191, 3, C6792.f18232, interfaceC6816);
        }
        interfaceC7188Mo10710.mo10711(interfaceC7191);
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] typeParametersSerializers() {
        return AbstractC7144.f19103;
    }
}
