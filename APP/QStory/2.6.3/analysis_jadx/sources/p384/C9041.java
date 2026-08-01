package p384;

import io.ktor.client.plugins.AbstractC3933;
import java.util.List;
import kotlin.InterfaceC5184;
import p087.C7083;
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

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9041 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9041 f25325;

    static {
        C9041 c9041 = new C9041();
        f25325 = c9041;
        C7129 c7129 = new C7129(AbstractC8405.m13972(1403), c9041, 4);
        c7129.m12409(AbstractC8405.m13972(1381), true);
        c7129.m12408(new C8851(3, 2));
        c7129.m12409(AbstractC8405.m13972(1382), true);
        c7129.m12408(new C8851(4, 2));
        c7129.m12409(AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜喵喵喵~喵喵呜喵喵喵喵喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜喵呜~喵喵喵喵喵呜喵呜"), true);
        c7129.m12408(new C8851(5, 2));
        c7129.m12409(AbstractC8405.m13972(1404), true);
        c7129.m12408(new C8851(6, 2));
        descriptor = c7129;
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        InterfaceC5184[] interfaceC5184Arr = C9043.f25327;
        C9044 c9044 = C9044.f25332;
        return new InterfaceC7184[]{AbstractC3933.m8313(c9044), AbstractC3933.m8313((InterfaceC7184) interfaceC5184Arr[1].getValue()), AbstractC3933.m8313(c9044), C7083.f18997};
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜喵喵呜~喵喵喵喵喵呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(interfaceC7191);
        InterfaceC5184[] interfaceC5184Arr = C9043.f25327;
        interfaceC7189Mo10676.getClass();
        boolean z = true;
        int i = 0;
        int iMo10671 = 0;
        C9042 c9042 = null;
        List list = null;
        C9042 c90422 = null;
        while (z) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(interfaceC7191);
            if (iMo10718 == -1) {
                z = false;
            } else if (iMo10718 == 0) {
                c9042 = (C9042) interfaceC7189Mo10676.mo10675(interfaceC7191, 0, C9044.f25332, c9042);
                i |= 1;
            } else if (iMo10718 == 1) {
                list = (List) interfaceC7189Mo10676.mo10675(interfaceC7191, 1, (InterfaceC7184) interfaceC5184Arr[1].getValue(), list);
                i |= 2;
            } else if (iMo10718 == 2) {
                c90422 = (C9042) interfaceC7189Mo10676.mo10675(interfaceC7191, 2, C9044.f25332, c90422);
                i |= 4;
            } else {
                if (iMo10718 != 3) {
                    C7547.m12767(iMo10718);
                    return null;
                }
                iMo10671 = interfaceC7189Mo10676.mo10671(interfaceC7191, 3);
                i |= 8;
            }
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C9043(i, c9042, list, c90422, iMo10671);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C9043 c9043 = (C9043) obj;
        AbstractC8405.m13973("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵喵呜~喵喵喵喵喵呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
        AbstractC8405.m13973("喵喵喵喵喵呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵");
        c9043.getClass();
        int i = c9043.f25328;
        C9042 c9042 = c9043.f25329;
        List list = c9043.f25330;
        C9042 c90422 = c9043.f25331;
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(interfaceC7191);
        InterfaceC5184[] interfaceC5184Arr = C9043.f25327;
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || c90422 != null) {
            interfaceC7188Mo10710.mo10715(interfaceC7191, 0, C9044.f25332, c90422);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || list != null) {
            interfaceC7188Mo10710.mo10715(interfaceC7191, 1, (InterfaceC7184) interfaceC5184Arr[1].getValue(), list);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || c9042 != null) {
            interfaceC7188Mo10710.mo10715(interfaceC7191, 2, C9044.f25332, c9042);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || i != 0) {
            interfaceC7188Mo10710.mo10729(3, i, interfaceC7191);
        }
        interfaceC7188Mo10710.mo10711(interfaceC7191);
    }
}
