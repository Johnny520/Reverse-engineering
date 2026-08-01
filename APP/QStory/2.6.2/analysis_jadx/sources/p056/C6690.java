package p056;

import p087.AbstractC7143;
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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6690 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6690 f18106;

    static {
        C6690 c6690 = new C6690();
        f18106 = c6690;
        C7128 c7128 = new C7128("io.modelcontextprotocol.kotlin.sdk.CompleteRequest.Argument", c6690, 2);
        c7128.m12382("name", false);
        c7128.m12382("value", false);
        descriptor = c7128;
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        C7134 c7134 = C7134.f19094;
        return new InterfaceC7183[]{c7134, c7134};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        interfaceC7188Mo6876.getClass();
        boolean z = true;
        int i = 0;
        String strMo6878 = null;
        String strMo68782 = null;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            if (iMo10672 == -1) {
                z = false;
            } else if (iMo10672 == 0) {
                strMo6878 = interfaceC7188Mo6876.mo6878(interfaceC7190, 0);
                i |= 1;
            } else {
                if (iMo10672 != 1) {
                    C7546.m12738(iMo10672);
                    return null;
                }
                strMo68782 = interfaceC7188Mo6876.mo6878(interfaceC7190, 1);
                i |= 2;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C6627(i, strMo6878, strMo68782);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C6627 c6627 = (C6627) obj;
        c6627.getClass();
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        interfaceC7187Mo6800.mo6814(interfaceC7190, 0, c6627.f18020);
        interfaceC7187Mo6800.mo6814(interfaceC7190, 1, c6627.f18019);
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] typeParametersSerializers() {
        return AbstractC7143.f19108;
    }
}
