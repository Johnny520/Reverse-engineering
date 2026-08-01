package p056;

import kotlin.jvm.internal.AbstractC4394;
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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6617 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6617 f18000;

    static {
        C6617 c6617 = new C6617();
        f18000 = c6617;
        C7128 c7128 = new C7128("io.modelcontextprotocol.kotlin.sdk.EmbeddedResource", c6617, 2);
        c7128.m12382("resource", false);
        c7128.m12382("type", true);
        descriptor = c7128;
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        return new InterfaceC7183[]{C6778.f18220, C7134.f19094};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        interfaceC7188Mo6876.getClass();
        boolean z = true;
        int i = 0;
        InterfaceC6782 interfaceC6782 = null;
        String strMo6878 = null;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            if (iMo10672 == -1) {
                z = false;
            } else if (iMo10672 == 0) {
                interfaceC6782 = (InterfaceC6782) interfaceC7188Mo6876.mo6874(interfaceC7190, 0, C6778.f18220, interfaceC6782);
                i |= 1;
            } else {
                if (iMo10672 != 1) {
                    C7546.m12738(iMo10672);
                    return null;
                }
                strMo6878 = interfaceC7188Mo6876.mo6878(interfaceC7190, 1);
                i |= 2;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C6612(i, interfaceC6782, strMo6878);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C6612 c6612 = (C6612) obj;
        c6612.getClass();
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        C6778 c6778 = C6778.f18220;
        InterfaceC6782 interfaceC6782 = c6612.f17992;
        String str = c6612.f17991;
        interfaceC7187Mo6800.mo6791(interfaceC7190, 0, c6778, interfaceC6782);
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || !AbstractC4394.m8917(str, "resource")) {
            interfaceC7187Mo6800.mo6814(interfaceC7190, 1, str);
        }
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] typeParametersSerializers() {
        return AbstractC7143.f19108;
    }
}
