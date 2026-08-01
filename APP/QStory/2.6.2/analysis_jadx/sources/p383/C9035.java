package p383;

import com.bumptech.glide.AbstractC3056;
import java.util.List;
import kotlin.InterfaceC5183;
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
import p316.C8675;
import p347.C8857;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9035 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9035 f25331;

    static {
        C9035 c9035 = new C9035();
        f25331 = c9035;
        C7128 c7128 = new C7128(AbstractC3056.m6668(-3937698400141837735L), c9035, 4);
        c7128.m12382(AbstractC3056.m6668(-3937700697949341095L), true);
        int i = 2;
        c7128.m12381(new C8857(3, i));
        c7128.m12382(AbstractC3056.m6668(-3937700581985224103L), true);
        c7128.m12381(new C8857(4, i));
        c7128.m12382(AbstractC3056.m6668(-3937700534740583847L), true);
        c7128.m12381(new C8857(5, i));
        c7128.m12382(AbstractC3056.m6668(-3937698236933080487L), true);
        c7128.m12381(new C8857(6, i));
        descriptor = c7128;
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        InterfaceC5183[] interfaceC5183Arr = C9037.f25333;
        C9038 c9038 = C9038.f25338;
        return new InterfaceC7183[]{C8675.m14355(c9038), C8675.m14355((InterfaceC7183) interfaceC5183Arr[1].getValue()), C8675.m14355(c9038), C7082.f19002};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        AbstractC3056.m6668(-3937685991981319591L);
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        InterfaceC5183[] interfaceC5183Arr = C9037.f25333;
        interfaceC7188Mo6876.getClass();
        boolean z = true;
        int i = 0;
        int iMo6872 = 0;
        C9036 c9036 = null;
        List list = null;
        C9036 c90362 = null;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            if (iMo10672 == -1) {
                z = false;
            } else if (iMo10672 == 0) {
                c9036 = (C9036) interfaceC7188Mo6876.mo6875(interfaceC7190, 0, C9038.f25338, c9036);
                i |= 1;
            } else if (iMo10672 == 1) {
                list = (List) interfaceC7188Mo6876.mo6875(interfaceC7190, 1, (InterfaceC7183) interfaceC5183Arr[1].getValue(), list);
                i |= 2;
            } else if (iMo10672 == 2) {
                c90362 = (C9036) interfaceC7188Mo6876.mo6875(interfaceC7190, 2, C9038.f25338, c90362);
                i |= 4;
            } else {
                if (iMo10672 != 3) {
                    C7546.m12738(iMo10672);
                    return null;
                }
                iMo6872 = interfaceC7188Mo6876.mo6872(interfaceC7190, 3);
                i |= 8;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C9037(i, c9036, list, c90362, iMo6872);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C9037 c9037 = (C9037) obj;
        AbstractC3056.m6668(-3937686069290730919L);
        AbstractC3056.m6668(-3937685966211515815L);
        c9037.getClass();
        int i = c9037.f25334;
        C9036 c9036 = c9037.f25335;
        List list = c9037.f25336;
        C9036 c90362 = c9037.f25337;
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        InterfaceC5183[] interfaceC5183Arr = C9037.f25333;
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || c90362 != null) {
            interfaceC7187Mo6800.mo6807(interfaceC7190, 0, C9038.f25338, c90362);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || list != null) {
            interfaceC7187Mo6800.mo6807(interfaceC7190, 1, (InterfaceC7183) interfaceC5183Arr[1].getValue(), list);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || c9036 != null) {
            interfaceC7187Mo6800.mo6807(interfaceC7190, 2, C9038.f25338, c9036);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || i != 0) {
            interfaceC7187Mo6800.mo6805(3, i, interfaceC7190);
        }
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }
}
