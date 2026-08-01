package p393;

import java.util.List;
import kotlin.InterfaceC5184;
import p087.C7129;
import p087.C7135;
import p087.InterfaceC7079;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p090.InterfaceC7189;
import p091.InterfaceC7191;
import p144.C7547;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲子兰世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9105 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9105 f25533;

    static {
        C9105 c9105 = new C9105();
        f25533 = c9105;
        C7129 c7129 = new C7129("top.sacz.xphelper.dexkit.cache.DexKitCacheJson.MethodInfo", c9105, 4);
        c7129.m12409("DeclareClass", false);
        c7129.m12409("MethodName", false);
        c7129.m12409("Params", false);
        c7129.m12409("ReturnType", false);
        descriptor = c7129;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        InterfaceC5184[] interfaceC5184Arr = C9103.f25528;
        C7135 c7135 = C7135.f19089;
        return new InterfaceC7184[]{c7135, c7135, interfaceC5184Arr[2].getValue(), c7135};
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(interfaceC7191);
        InterfaceC5184[] interfaceC5184Arr = C9103.f25528;
        interfaceC7189Mo10676.getClass();
        boolean z = true;
        int i = 0;
        String strMo10686 = null;
        String strMo106862 = null;
        List list = null;
        String strMo106863 = null;
        while (z) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(interfaceC7191);
            if (iMo10718 == -1) {
                z = false;
            } else if (iMo10718 == 0) {
                strMo10686 = interfaceC7189Mo10676.mo10686(interfaceC7191, 0);
                i |= 1;
            } else if (iMo10718 == 1) {
                strMo106862 = interfaceC7189Mo10676.mo10686(interfaceC7191, 1);
                i |= 2;
            } else if (iMo10718 == 2) {
                list = (List) interfaceC7189Mo10676.mo10674(interfaceC7191, 2, (InterfaceC7184) interfaceC5184Arr[2].getValue(), list);
                i |= 4;
            } else {
                if (iMo10718 != 3) {
                    C7547.m12767(iMo10718);
                    return null;
                }
                strMo106863 = interfaceC7189Mo10676.mo10686(interfaceC7191, 3);
                i |= 8;
            }
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C9103(i, strMo10686, strMo106862, list, strMo106863);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C9103 c9103 = (C9103) obj;
        c9103.getClass();
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(interfaceC7191);
        InterfaceC5184[] interfaceC5184Arr = C9103.f25528;
        interfaceC7188Mo10710.mo10735(interfaceC7191, 0, c9103.f25532);
        interfaceC7188Mo10710.mo10735(interfaceC7191, 1, c9103.f25531);
        interfaceC7188Mo10710.mo10719(interfaceC7191, 2, (InterfaceC7184) interfaceC5184Arr[2].getValue(), c9103.f25530);
        interfaceC7188Mo10710.mo10735(interfaceC7191, 3, c9103.f25529);
        interfaceC7188Mo10710.mo10711(interfaceC7191);
    }
}
