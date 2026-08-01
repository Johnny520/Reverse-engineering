package p383;

import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;
import p087.C7117;
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

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9031 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9031 f25329;

    static {
        C9031 c9031 = new C9031();
        f25329 = c9031;
        C7128 c7128 = new C7128(AbstractC3056.m6668(-3937696892608316839L), c9031, 2);
        AbstractC9032.m14589(-3937696677859952039L, c7128, true, 1);
        AbstractC9032.m14589(-3937696712219690407L, c7128, true, 2);
        descriptor = c7128;
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        return new InterfaceC7183[]{C8675.m14355(C9004.f25295), C7117.f19059};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        AbstractC3056.m6668(-3937685991981319591L);
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        interfaceC7188Mo6876.getClass();
        boolean z = true;
        int i = 0;
        C9060 c9060 = null;
        byte[] bArr = null;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            if (iMo10672 == -1) {
                z = false;
            } else if (iMo10672 == 0) {
                c9060 = (C9060) interfaceC7188Mo6876.mo6875(interfaceC7190, 0, C9004.f25295, c9060);
                i |= 1;
            } else {
                if (iMo10672 != 1) {
                    C7546.m12738(iMo10672);
                    return null;
                }
                bArr = (byte[]) interfaceC7188Mo6876.mo6874(interfaceC7190, 1, C7117.f19059, bArr);
                i |= 2;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C9057(i, c9060, bArr);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C9057 c9057 = (C9057) obj;
        AbstractC3056.m6668(-3937686069290730919L);
        AbstractC3056.m6668(-3937685966211515815L);
        c9057.getClass();
        byte[] bArr = c9057.f25361;
        C9060 c9060 = c9057.f25362;
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || c9060 != null) {
            interfaceC7187Mo6800.mo6807(interfaceC7190, 0, C9004.f25295, c9060);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || !AbstractC4394.m8917(bArr, new byte[0])) {
            interfaceC7187Mo6800.mo6791(interfaceC7190, 1, C7117.f19059, bArr);
        }
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }
}
