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

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9013 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9013 f25310;

    static {
        C9013 c9013 = new C9013();
        f25310 = c9013;
        C7128 c7128 = new C7128("top.artmoe.inao.entries.QQMessage.MessageBody.C2CRecallOperationInfo.Info", c9013, 5);
        AbstractC9032.m14589(-3937702875497760167L, c7128, true, 1);
        AbstractC9032.m14589(-3937696033614857639L, c7128, true, 2);
        AbstractC9032.m14589(-3937619720635942311L, c7128, true, 5);
        AbstractC9032.m14589(-3937611422759126439L, c7128, true, 6);
        AbstractC9032.m14589(-3937617766425822631L, c7128, true, 20);
        descriptor = c7128;
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        C7134 c7134 = C7134.f19094;
        C7071 c7071 = C7071.f18981;
        return new InterfaceC7183[]{c7134, c7134, c7071, c7071, C7082.f19002};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        "decoder";
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        interfaceC7188Mo6876.getClass();
        int i = 0;
        int iMo6872 = 0;
        String strMo6878 = null;
        String strMo68782 = null;
        long jMo6886 = 0;
        long jMo68862 = 0;
        boolean z = true;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            if (iMo10672 == -1) {
                z = false;
            } else if (iMo10672 == 0) {
                strMo6878 = interfaceC7188Mo6876.mo6878(interfaceC7190, 0);
                i |= 1;
            } else if (iMo10672 == 1) {
                strMo68782 = interfaceC7188Mo6876.mo6878(interfaceC7190, 1);
                i |= 2;
            } else if (iMo10672 == 2) {
                jMo6886 = interfaceC7188Mo6876.mo6886(interfaceC7190, 2);
                i |= 4;
            } else if (iMo10672 == 3) {
                jMo68862 = interfaceC7188Mo6876.mo6886(interfaceC7190, 3);
                i |= 8;
            } else {
                if (iMo10672 != 4) {
                    C7546.m12738(iMo10672);
                    return null;
                }
                iMo6872 = interfaceC7188Mo6876.mo6872(interfaceC7190, 4);
                i |= 16;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C9011(i, strMo6878, strMo68782, jMo6886, jMo68862, iMo6872);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C9011 c9011 = (C9011) obj;
        "encoder";
        "value";
        c9011.getClass();
        int i = c9011.f25305;
        long j = c9011.f25306;
        long j2 = c9011.f25307;
        String str = c9011.f25308;
        String str2 = c9011.f25309;
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || !AbstractC4394.m8917(str2, "")) {
            interfaceC7187Mo6800.mo6814(interfaceC7190, 0, str2);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || !AbstractC4394.m8917(str, "")) {
            interfaceC7187Mo6800.mo6814(interfaceC7190, 1, str);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || j2 != 0) {
            interfaceC7187Mo6800.mo6796(interfaceC7190, 2, j2);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || j != 0) {
            interfaceC7187Mo6800.mo6796(interfaceC7190, 3, j);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || i != 0) {
            interfaceC7187Mo6800.mo6805(4, i, interfaceC7190);
        }
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }
}
