package p390;

import java.util.List;
import kotlin.InterfaceC5183;
import p087.C7128;
import p087.C7134;
import p087.InterfaceC7078;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p091.InterfaceC7190;
import p144.C7546;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲世子兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9109 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9109 f25480;

    static {
        C9109 c9109 = new C9109();
        f25480 = c9109;
        C7128 c7128 = new C7128("top.sacz.xphelper.dexkit.cache.DexKitCacheJson.MethodInfo", c9109, 4);
        c7128.m12382("DeclareClass", false);
        c7128.m12382("MethodName", false);
        c7128.m12382("Params", false);
        c7128.m12382("ReturnType", false);
        descriptor = c7128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        InterfaceC5183[] interfaceC5183Arr = C9107.f25475;
        C7134 c7134 = C7134.f19094;
        return new InterfaceC7183[]{c7134, c7134, interfaceC5183Arr[2].getValue(), c7134};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        InterfaceC5183[] interfaceC5183Arr = C9107.f25475;
        interfaceC7188Mo6876.getClass();
        boolean z = true;
        int i = 0;
        String strMo6878 = null;
        String strMo68782 = null;
        List list = null;
        String strMo68783 = null;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            if (iMo10672 == -1) {
                z = false;
            } else if (iMo10672 == 0) {
                strMo6878 = interfaceC7188Mo6876.mo6878(interfaceC7190, 0);
                i |= 1;
            } else if (iMo10672 == 1) {
                strMo68782 = interfaceC7188Mo6876.mo6878(interfaceC7190, 1);
                i |= 2;
            } else if (iMo10672 == 2) {
                list = (List) interfaceC7188Mo6876.mo6874(interfaceC7190, 2, (InterfaceC7183) interfaceC5183Arr[2].getValue(), list);
                i |= 4;
            } else {
                if (iMo10672 != 3) {
                    C7546.m12738(iMo10672);
                    return null;
                }
                strMo68783 = interfaceC7188Mo6876.mo6878(interfaceC7190, 3);
                i |= 8;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C9107(i, strMo6878, strMo68782, list, strMo68783);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C9107 c9107 = (C9107) obj;
        c9107.getClass();
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        InterfaceC5183[] interfaceC5183Arr = C9107.f25475;
        interfaceC7187Mo6800.mo6814(interfaceC7190, 0, c9107.f25479);
        interfaceC7187Mo6800.mo6814(interfaceC7190, 1, c9107.f25478);
        interfaceC7187Mo6800.mo6791(interfaceC7190, 2, (InterfaceC7183) interfaceC5183Arr[2].getValue(), c9107.f25477);
        interfaceC7187Mo6800.mo6814(interfaceC7190, 3, c9107.f25476);
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }
}
