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

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9020 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9020 f25314;

    static {
        C9020 c9020 = new C9020();
        f25314 = c9020;
        C7128 c7128 = new C7128("top.artmoe.inao.entries.QQMessage.MessageBody.GroupRecallOperationInfo", c9020, 3);
        AbstractC9032.m14589(-3937695247635842471L, c7128, true, 4);
        AbstractC9032.m14589(-3937696381507208615L, c7128, false, 11);
        AbstractC9032.m14589(-3937617766425822631L, c7128, true, 37);
        descriptor = c7128;
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        return new InterfaceC7183[]{C7071.f18981, C9018.f25313, C7082.f19002};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        "decoder";
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        interfaceC7188Mo6876.getClass();
        int i = 0;
        int iMo6872 = 0;
        long jMo6886 = 0;
        C9009 c9009 = null;
        boolean z = true;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            if (iMo10672 == -1) {
                z = false;
            } else if (iMo10672 == 0) {
                jMo6886 = interfaceC7188Mo6876.mo6886(interfaceC7190, 0);
                i |= 1;
            } else if (iMo10672 == 1) {
                c9009 = (C9009) interfaceC7188Mo6876.mo6874(interfaceC7190, 1, C9018.f25313, c9009);
                i |= 2;
            } else {
                if (iMo10672 != 2) {
                    C7546.m12738(iMo10672);
                    return null;
                }
                iMo6872 = interfaceC7188Mo6876.mo6872(interfaceC7190, 2);
                i |= 4;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C9008(i, jMo6886, c9009, iMo6872);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C9008 c9008 = (C9008) obj;
        "encoder";
        "value";
        c9008.getClass();
        long j = c9008.f25301;
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || j != 0) {
            interfaceC7187Mo6800.mo6796(interfaceC7190, 0, j);
        }
        C9018 c9018 = C9018.f25313;
        C9009 c9009 = c9008.f25300;
        int i = c9008.f25299;
        interfaceC7187Mo6800.mo6791(interfaceC7190, 1, c9018, c9009);
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || i != 0) {
            interfaceC7187Mo6800.mo6805(2, i, interfaceC7190);
        }
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }
}
