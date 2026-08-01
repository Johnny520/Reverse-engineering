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

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9001 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9001 f25293;

    static {
        C9001 c9001 = new C9001();
        f25293 = c9001;
        C7128 c7128 = new C7128(AbstractC3056.m6668(-3937711478317254055L), c9001, 2);
        AbstractC9032.m14589(-3937711207734314407L, c7128, true, 1);
        AbstractC9032.m14589(-3937711104655099303L, c7128, true, 16);
        descriptor = c7128;
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        return new InterfaceC7183[]{C8675.m14355(C8999.f25292), C8675.m14355(C9003.f25294)};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        AbstractC3056.m6668(-3937685991981319591L);
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        interfaceC7188Mo6876.getClass();
        boolean z = true;
        int i = 0;
        C9055 c9055 = null;
        C8998 c8998 = null;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            if (iMo10672 == -1) {
                z = false;
            } else if (iMo10672 == 0) {
                c9055 = (C9055) interfaceC7188Mo6876.mo6875(interfaceC7190, 0, C8999.f25292, c9055);
                i |= 1;
            } else {
                if (iMo10672 != 1) {
                    C7546.m12738(iMo10672);
                    return null;
                }
                c8998 = (C8998) interfaceC7188Mo6876.mo6875(interfaceC7190, 1, C9003.f25294, c8998);
                i |= 2;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C9059(i, c9055, c8998);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C9059 c9059 = (C9059) obj;
        AbstractC3056.m6668(-3937686069290730919L);
        AbstractC3056.m6668(-3937685966211515815L);
        c9059.getClass();
        C8998 c8998 = c9059.f25364;
        C9055 c9055 = c9059.f25365;
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || c9055 != null) {
            interfaceC7187Mo6800.mo6807(interfaceC7190, 0, C8999.f25292, c9055);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || c8998 != null) {
            interfaceC7187Mo6800.mo6807(interfaceC7190, 1, C9003.f25294, c8998);
        }
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }
}
