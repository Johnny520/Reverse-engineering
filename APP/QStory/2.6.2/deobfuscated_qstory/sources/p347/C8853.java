package p347;

import com.bumptech.glide.AbstractC3056;
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

/* JADX INFO: renamed from: 飘花落叶言苏哲子世楪兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8853 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8853 f24960;

    static {
        C8853 c8853 = new C8853();
        f24960 = c8853;
        C7128 c7128 = new C7128("top.suzhelan.qstory.hook.service.proto.TroopReplyEmoji", c8853, 6);
        c7128.m12382("troopUin", false);
        int i = 1;
        c7128.m12381(new C8857(2, i));
        c7128.m12382("msgSeq", false);
        c7128.m12381(new C8857(3, i));
        c7128.m12382("emojiId", false);
        c7128.m12381(new C8857(4, i));
        c7128.m12382("type", false);
        c7128.m12381(new C8857(5, i));
        c7128.m12382("p6", false);
        c7128.m12381(new C8857(6, i));
        c7128.m12382("p7", false);
        c7128.m12381(new C8857(7, i));
        descriptor = c7128;
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        C7071 c7071 = C7071.f18981;
        C7082 c7082 = C7082.f19002;
        return new InterfaceC7183[]{c7071, c7071, C7134.f19094, c7082, c7082, c7082};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        "decoder";
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        interfaceC7188Mo6876.getClass();
        int i = 0;
        int iMo6872 = 0;
        int iMo68722 = 0;
        int iMo68723 = 0;
        long jMo6886 = 0;
        long jMo68862 = 0;
        String strMo6878 = null;
        boolean z = true;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            switch (iMo10672) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jMo6886 = interfaceC7188Mo6876.mo6886(interfaceC7190, 0);
                    i |= 1;
                    break;
                case 1:
                    jMo68862 = interfaceC7188Mo6876.mo6886(interfaceC7190, 1);
                    i |= 2;
                    break;
                case 2:
                    strMo6878 = interfaceC7188Mo6876.mo6878(interfaceC7190, 2);
                    i |= 4;
                    break;
                case 3:
                    iMo6872 = interfaceC7188Mo6876.mo6872(interfaceC7190, 3);
                    i |= 8;
                    break;
                case 4:
                    iMo68722 = interfaceC7188Mo6876.mo6872(interfaceC7190, 4);
                    i |= 16;
                    break;
                case 5:
                    iMo68723 = interfaceC7188Mo6876.mo6872(interfaceC7190, 5);
                    i |= 32;
                    break;
                default:
                    C7546.m12738(iMo10672);
                    return null;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C8858(i, jMo6886, jMo68862, strMo6878, iMo6872, iMo68722, iMo68723);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C8858 c8858 = (C8858) obj;
        "encoder";
        "value";
        c8858.getClass();
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        interfaceC7187Mo6800.mo6796(interfaceC7190, 0, c8858.f24974);
        interfaceC7187Mo6800.mo6796(interfaceC7190, 1, c8858.f24973);
        interfaceC7187Mo6800.mo6814(interfaceC7190, 2, c8858.f24972);
        interfaceC7187Mo6800.mo6805(3, c8858.f24971, interfaceC7190);
        interfaceC7187Mo6800.mo6805(4, c8858.f24970, interfaceC7190);
        interfaceC7187Mo6800.mo6805(5, c8858.f24969, interfaceC7190);
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }
}
