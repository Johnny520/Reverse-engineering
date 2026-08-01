package p384;

import io.ktor.client.plugins.AbstractC3933;
import p087.C7083;
import p087.C7118;
import p087.C7129;
import p087.InterfaceC7079;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p090.InterfaceC7189;
import p091.InterfaceC7191;
import p144.C7547;
import p287.AbstractC8405;
import p349.C8851;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9048 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9048 f25334;

    static {
        C9048 c9048 = new C9048();
        f25334 = c9048;
        C7129 c7129 = new C7129(AbstractC8405.m13972(1401), c9048, 5);
        c7129.m12409(AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜呜喵呜"), true);
        c7129.m12408(new C8851(3, 2));
        c7129.m12409(AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵喵喵喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵喵喵喵喵~喵喵呜喵呜呜喵喵~喵喵喵喵呜喵喵喵"), true);
        c7129.m12408(new C8851(4, 2));
        c7129.m12409(AbstractC8405.m13972(1366), true);
        c7129.m12408(new C8851(7, 2));
        c7129.m12409(AbstractC8405.m13972(1367), true);
        c7129.m12408(new C8851(8, 2));
        c7129.m12409(AbstractC8405.m13972(1402), true);
        c7129.m12408(new C8851(9, 2));
        descriptor = c7129;
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        C7118 c7118 = C7118.f19054;
        InterfaceC7184 interfaceC7184M8313 = AbstractC3933.m8313(c7118);
        InterfaceC7184 interfaceC7184M83132 = AbstractC3933.m8313(C9041.f25325);
        InterfaceC7184 interfaceC7184M83133 = AbstractC3933.m8313(c7118);
        C7083 c7083 = C7083.f18997;
        return new InterfaceC7184[]{c7083, c7083, interfaceC7184M8313, interfaceC7184M83132, interfaceC7184M83133};
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜喵喵呜~喵喵喵喵喵呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(interfaceC7191);
        interfaceC7189Mo10676.getClass();
        boolean z = true;
        int i = 0;
        int iMo10671 = 0;
        int iMo106712 = 0;
        byte[] bArr = null;
        C9043 c9043 = null;
        byte[] bArr2 = null;
        while (z) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(interfaceC7191);
            if (iMo10718 == -1) {
                z = false;
            } else if (iMo10718 == 0) {
                iMo10671 = interfaceC7189Mo10676.mo10671(interfaceC7191, 0);
                i |= 1;
            } else if (iMo10718 == 1) {
                iMo106712 = interfaceC7189Mo10676.mo10671(interfaceC7191, 1);
                i |= 2;
            } else if (iMo10718 == 2) {
                bArr = (byte[]) interfaceC7189Mo10676.mo10675(interfaceC7191, 2, C7118.f19054, bArr);
                i |= 4;
            } else if (iMo10718 == 3) {
                c9043 = (C9043) interfaceC7189Mo10676.mo10675(interfaceC7191, 3, C9041.f25325, c9043);
                i |= 8;
            } else {
                if (iMo10718 != 4) {
                    C7547.m12767(iMo10718);
                    return null;
                }
                bArr2 = (byte[]) interfaceC7189Mo10676.mo10675(interfaceC7191, 4, C7118.f19054, bArr2);
                i |= 16;
            }
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C9035(i, iMo10671, iMo106712, bArr, c9043, bArr2);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C9035 c9035 = (C9035) obj;
        AbstractC8405.m13973("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵喵呜~喵喵喵喵喵呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
        AbstractC8405.m13973("喵喵喵喵喵呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵");
        c9035.getClass();
        byte[] bArr = c9035.f25317;
        C9043 c9043 = c9035.f25318;
        byte[] bArr2 = c9035.f25319;
        int i = c9035.f25320;
        int i2 = c9035.f25321;
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(interfaceC7191);
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || i2 != 0) {
            interfaceC7188Mo10710.mo10729(0, i2, interfaceC7191);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || i != 0) {
            interfaceC7188Mo10710.mo10729(1, i, interfaceC7191);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || bArr2 != null) {
            interfaceC7188Mo10710.mo10715(interfaceC7191, 2, C7118.f19054, bArr2);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || c9043 != null) {
            interfaceC7188Mo10710.mo10715(interfaceC7191, 3, C9041.f25325, c9043);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || bArr != null) {
            interfaceC7188Mo10710.mo10715(interfaceC7191, 4, C7118.f19054, bArr);
        }
        interfaceC7188Mo10710.mo10711(interfaceC7191);
    }
}
