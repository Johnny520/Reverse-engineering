package p383;

import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;
import p087.C7071;
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
import p316.C8675;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9049 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9049 f25343;

    static {
        C9049 c9049 = new C9049();
        f25343 = c9049;
        C7128 c7128 = new C7128("top.artmoe.inao.entries.QQMessage.MessageHead", c9049, 5);
        AbstractC9032.m14589(-3937700191143200167L, c7128, true, 1);
        AbstractC9032.m14589(-3937694487426631079L, c7128, true, 2);
        AbstractC9032.m14589(-3937708802552628647L, c7128, true, 5);
        AbstractC9032.m14589(-3937696033614857639L, c7128, true, 6);
        AbstractC9032.m14589(-3937708729538184615L, c7128, true, 8);
        descriptor = c7128;
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        InterfaceC7183 interfaceC7183M14355 = C8675.m14355(C9047.f25342);
        C7071 c7071 = C7071.f18981;
        C7134 c7134 = C7134.f19094;
        return new InterfaceC7183[]{c7071, c7134, c7071, c7134, interfaceC7183M14355};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        "decoder";
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        interfaceC7188Mo6876.getClass();
        int i = 0;
        long jMo6886 = 0;
        long jMo68862 = 0;
        String strMo6878 = null;
        String strMo68782 = null;
        C9053 c9053 = null;
        boolean z = true;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            if (iMo10672 == -1) {
                z = false;
            } else if (iMo10672 == 0) {
                jMo6886 = interfaceC7188Mo6876.mo6886(interfaceC7190, 0);
                i |= 1;
            } else if (iMo10672 == 1) {
                strMo6878 = interfaceC7188Mo6876.mo6878(interfaceC7190, 1);
                i |= 2;
            } else if (iMo10672 == 2) {
                jMo68862 = interfaceC7188Mo6876.mo6886(interfaceC7190, 2);
                i |= 4;
            } else if (iMo10672 == 3) {
                strMo68782 = interfaceC7188Mo6876.mo6878(interfaceC7190, 3);
                i |= 8;
            } else {
                if (iMo10672 != 4) {
                    C7546.m12738(iMo10672);
                    return null;
                }
                c9053 = (C9053) interfaceC7188Mo6876.mo6875(interfaceC7190, 4, C9047.f25342, c9053);
                i |= 16;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C9054(i, jMo6886, strMo6878, jMo68862, strMo68782, c9053);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C9054 c9054 = (C9054) obj;
        "encoder";
        "value";
        c9054.getClass();
        C9053 c9053 = c9054.f25355;
        String str = c9054.f25356;
        long j = c9054.f25357;
        String str2 = c9054.f25358;
        long j2 = c9054.f25359;
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || j2 != 0) {
            interfaceC7187Mo6800.mo6796(interfaceC7190, 0, j2);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || !AbstractC4394.m8917(str2, "")) {
            interfaceC7187Mo6800.mo6814(interfaceC7190, 1, str2);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || j != 0) {
            interfaceC7187Mo6800.mo6796(interfaceC7190, 2, j);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || !AbstractC4394.m8917(str, "")) {
            interfaceC7187Mo6800.mo6814(interfaceC7190, 3, str);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || c9053 != null) {
            interfaceC7187Mo6800.mo6807(interfaceC7190, 4, C9047.f25342, c9053);
        }
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }
}
