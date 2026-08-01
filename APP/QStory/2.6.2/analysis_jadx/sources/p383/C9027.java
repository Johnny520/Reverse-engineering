package p383;

import com.bumptech.glide.AbstractC3056;
import p087.C7082;
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

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9027 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9027 f25321;

    static {
        C9027 c9027 = new C9027();
        f25321 = c9027;
        C7128 c7128 = new C7128(AbstractC3056.m6668(-3937685888902104487L), c9027, 2);
        c7128.m12382(AbstractC3056.m6668(-3937592177010673063L), false);
        c7128.m12382(AbstractC3056.m6668(-3937617766425822631L), false);
        descriptor = c7128;
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        return new InterfaceC7183[]{C7134.f19094, C7082.f19002};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        AbstractC3056.m6668(-3937685991981319591L);
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        interfaceC7188Mo6876.getClass();
        boolean z = true;
        int i = 0;
        int iMo6872 = 0;
        String strMo6878 = null;
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
                iMo6872 = interfaceC7188Mo6876.mo6872(interfaceC7190, 1);
                i |= 2;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C9025(i, iMo6872, strMo6878);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C9025 c9025 = (C9025) obj;
        AbstractC3056.m6668(-3937686069290730919L);
        AbstractC3056.m6668(-3937685966211515815L);
        c9025.getClass();
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        interfaceC7187Mo6800.mo6814(interfaceC7190, 0, c9025.f25320);
        interfaceC7187Mo6800.mo6805(1, c9025.f25319, interfaceC7190);
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }
}
