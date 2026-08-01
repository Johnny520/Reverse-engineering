package p383;

import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;
import p087.C7071;
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

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9047 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9047 f25342;

    static {
        C9047 c9047 = new C9047();
        f25342 = c9047;
        C7128 c7128 = new C7128(AbstractC3056.m6668(-3937708673703609767L), c9047, 3);
        AbstractC9032.m14589(-3937695247635842471L, c7128, true, 1);
        AbstractC9032.m14589(-3937709300768834983L, c7128, true, 2);
        AbstractC9032.m14589(-3937710782532552103L, c7128, true, 4);
        descriptor = c7128;
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        return new InterfaceC7183[]{C7071.f18981, C7082.f19002, C7134.f19094};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        AbstractC3056.m6668(-3937685991981319591L);
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        interfaceC7188Mo6876.getClass();
        int i = 0;
        int iMo6872 = 0;
        long jMo6886 = 0;
        String strMo6878 = null;
        boolean z = true;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            if (iMo10672 == -1) {
                z = false;
            } else if (iMo10672 == 0) {
                jMo6886 = interfaceC7188Mo6876.mo6886(interfaceC7190, 0);
                i |= 1;
            } else if (iMo10672 == 1) {
                iMo6872 = interfaceC7188Mo6876.mo6872(interfaceC7190, 1);
                i |= 2;
            } else {
                if (iMo10672 != 2) {
                    C7546.m12738(iMo10672);
                    return null;
                }
                strMo6878 = interfaceC7188Mo6876.mo6878(interfaceC7190, 2);
                i |= 4;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C9053(i, iMo6872, jMo6886, strMo6878);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C9053 c9053 = (C9053) obj;
        AbstractC3056.m6668(-3937686069290730919L);
        AbstractC3056.m6668(-3937685966211515815L);
        c9053.getClass();
        String str = c9053.f25352;
        int i = c9053.f25353;
        long j = c9053.f25354;
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || j != 0) {
            interfaceC7187Mo6800.mo6796(interfaceC7190, 0, j);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || i != 0) {
            interfaceC7187Mo6800.mo6805(1, i, interfaceC7190);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || !AbstractC4394.m8917(str, AbstractC3056.m6668(-3937561979095614887L))) {
            interfaceC7187Mo6800.mo6814(interfaceC7190, 2, str);
        }
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }
}
