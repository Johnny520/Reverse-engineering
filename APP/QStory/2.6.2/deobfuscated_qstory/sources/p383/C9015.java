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

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9015 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9015 f25311;

    static {
        C9015 c9015 = new C9015();
        f25311 = c9015;
        C7128 c7128 = new C7128("top.artmoe.inao.entries.QQMessage.MessageBody.C2CRecallOperationInfo", c9015, 1);
        AbstractC9032.m14589(-3937696381507208615L, c7128, false, 1);
        descriptor = c7128;
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        return new InterfaceC7183[]{C9013.f25310};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        "decoder";
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        interfaceC7188Mo6876.getClass();
        boolean z = true;
        int i = 0;
        C9011 c9011 = null;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            if (iMo10672 == -1) {
                z = false;
            } else {
                if (iMo10672 != 0) {
                    C7546.m12738(iMo10672);
                    return null;
                }
                c9011 = (C9011) interfaceC7188Mo6876.mo6874(interfaceC7190, 0, C9013.f25310, c9011);
                i = 1;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C9010(i, c9011);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C9010 c9010 = (C9010) obj;
        "encoder";
        "value";
        c9010.getClass();
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        interfaceC7187Mo6800.mo6791(interfaceC7190, 0, C9013.f25310, c9010.f25304);
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }
}
