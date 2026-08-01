package p383;

import com.bumptech.glide.AbstractC3056;
import p087.C7128;
import p087.InterfaceC7078;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p091.InterfaceC7190;
import p144.C7546;
import p316.C8675;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9033 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9033 f25330;

    static {
        C9033 c9033 = new C9033();
        f25330 = c9033;
        C7128 c7128 = new C7128("top.artmoe.inao.entries.QQMessage", c9033, 3);
        AbstractC9032.m14589(-3937697085881845159L, c7128, false, 1);
        AbstractC9032.m14589(-3937697034342237607L, c7128, false, 2);
        AbstractC9032.m14589(-3937696944147924391L, c7128, true, 3);
        descriptor = c7128;
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        return new InterfaceC7183[]{C9049.f25343, C9058.f25363, C8675.m14355(C9031.f25329)};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        "decoder";
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        interfaceC7188Mo6876.getClass();
        boolean z = true;
        int i = 0;
        C9054 c9054 = null;
        C9050 c9050 = null;
        C9057 c9057 = null;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            if (iMo10672 == -1) {
                z = false;
            } else if (iMo10672 == 0) {
                c9054 = (C9054) interfaceC7188Mo6876.mo6874(interfaceC7190, 0, C9049.f25343, c9054);
                i |= 1;
            } else if (iMo10672 == 1) {
                c9050 = (C9050) interfaceC7188Mo6876.mo6874(interfaceC7190, 1, C9058.f25363, c9050);
                i |= 2;
            } else {
                if (iMo10672 != 2) {
                    C7546.m12738(iMo10672);
                    return null;
                }
                c9057 = (C9057) interfaceC7188Mo6876.mo6875(interfaceC7190, 2, C9031.f25329, c9057);
                i |= 4;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C9052(i, c9054, c9050, c9057);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C9052 c9052 = (C9052) obj;
        "encoder";
        "value";
        c9052.getClass();
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        C9049 c9049 = C9049.f25343;
        C9054 c9054 = c9052.f25351;
        C9057 c9057 = c9052.f25349;
        interfaceC7187Mo6800.mo6791(interfaceC7190, 0, c9049, c9054);
        interfaceC7187Mo6800.mo6791(interfaceC7190, 1, C9058.f25363, c9052.f25350);
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || c9057 != null) {
            interfaceC7187Mo6800.mo6807(interfaceC7190, 2, C9031.f25329, c9057);
        }
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }
}
