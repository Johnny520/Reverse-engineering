package p383;

import com.bumptech.glide.AbstractC3056;
import p087.C7071;
import p087.C7082;
import p087.C7128;
import p087.InterfaceC7078;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p091.InterfaceC7190;
import p144.C7546;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9058 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9058 f25363;

    static {
        C9058 c9058 = new C9058();
        f25363 = c9058;
        C7128 c7128 = new C7128(AbstractC3056.m6668(-3937709554171905447L), c9058, 5);
        AbstractC9032.m14589(-3937709266409096615L, c7128, true, 1);
        AbstractC9032.m14589(-3937709300768834983L, c7128, true, 2);
        AbstractC9032.m14589(-3937709176214783399L, c7128, true, 3);
        AbstractC9032.m14589(-3937617766425822631L, c7128, true, 5);
        AbstractC9032.m14589(-3937619720635942311L, c7128, true, 6);
        descriptor = c7128;
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        C7082 c7082 = C7082.f19002;
        return new InterfaceC7183[]{c7082, c7082, c7082, c7082, C7071.f18981};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        AbstractC3056.m6668(-3937685991981319591L);
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        interfaceC7188Mo6876.getClass();
        int i = 0;
        int iMo6872 = 0;
        int iMo68722 = 0;
        int iMo68723 = 0;
        int iMo68724 = 0;
        long jMo6886 = 0;
        boolean z = true;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            if (iMo10672 == -1) {
                z = false;
            } else if (iMo10672 == 0) {
                iMo6872 = interfaceC7188Mo6876.mo6872(interfaceC7190, 0);
                i |= 1;
            } else if (iMo10672 == 1) {
                iMo68722 = interfaceC7188Mo6876.mo6872(interfaceC7190, 1);
                i |= 2;
            } else if (iMo10672 == 2) {
                iMo68723 = interfaceC7188Mo6876.mo6872(interfaceC7190, 2);
                i |= 4;
            } else if (iMo10672 == 3) {
                iMo68724 = interfaceC7188Mo6876.mo6872(interfaceC7190, 3);
                i |= 8;
            } else {
                if (iMo10672 != 4) {
                    C7546.m12738(iMo10672);
                    return null;
                }
                jMo6886 = interfaceC7188Mo6876.mo6886(interfaceC7190, 4);
                i |= 16;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C9050(i, iMo6872, iMo68722, iMo68723, iMo68724, jMo6886);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C9050 c9050 = (C9050) obj;
        AbstractC3056.m6668(-3937686069290730919L);
        AbstractC3056.m6668(-3937685966211515815L);
        c9050.getClass();
        long j = c9050.f25344;
        int i = c9050.f25345;
        int i2 = c9050.f25346;
        int i3 = c9050.f25347;
        int i4 = c9050.f25348;
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || i4 != 0) {
            interfaceC7187Mo6800.mo6805(0, i4, interfaceC7190);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || i3 != 0) {
            interfaceC7187Mo6800.mo6805(1, i3, interfaceC7190);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || i2 != 0) {
            interfaceC7187Mo6800.mo6805(2, i2, interfaceC7190);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || i != 0) {
            interfaceC7187Mo6800.mo6805(3, i, interfaceC7190);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || j != 0) {
            interfaceC7187Mo6800.mo6796(interfaceC7190, 4, j);
        }
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }
}
