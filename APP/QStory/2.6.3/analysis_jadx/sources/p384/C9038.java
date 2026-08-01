package p384;

import io.ktor.client.plugins.AbstractC3933;
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

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9038 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9038 f25324;

    static {
        C9038 c9038 = new C9038();
        f25324 = c9038;
        C7129 c7129 = new C7129(AbstractC8405.m13972(1414), c9038, 3);
        c7129.m12409(AbstractC8405.m13972(1415), false);
        c7129.m12408(new C8851(1, 3));
        c7129.m12409(AbstractC8405.m13972(1416), false);
        c7129.m12408(new C8851(2, 3));
        c7129.m12409(AbstractC8405.m13972(1417), true);
        c7129.m12408(new C8851(3, 3));
        descriptor = c7129;
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        return new InterfaceC7184[]{C9056.f25340, C9062.f25357, AbstractC3933.m8313(C9036.f25322)};
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜喵喵呜~喵喵喵喵喵呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(interfaceC7191);
        interfaceC7189Mo10676.getClass();
        boolean z = true;
        int i = 0;
        C9058 c9058 = null;
        C9057 c9057 = null;
        C9065 c9065 = null;
        while (z) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(interfaceC7191);
            if (iMo10718 == -1) {
                z = false;
            } else if (iMo10718 == 0) {
                c9058 = (C9058) interfaceC7189Mo10676.mo10674(interfaceC7191, 0, C9056.f25340, c9058);
                i |= 1;
            } else if (iMo10718 == 1) {
                c9057 = (C9057) interfaceC7189Mo10676.mo10674(interfaceC7191, 1, C9062.f25357, c9057);
                i |= 2;
            } else {
                if (iMo10718 != 2) {
                    C7547.m12767(iMo10718);
                    return null;
                }
                c9065 = (C9065) interfaceC7189Mo10676.mo10675(interfaceC7191, 2, C9036.f25322, c9065);
                i |= 4;
            }
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C9059(i, c9058, c9057, c9065);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C9059 c9059 = (C9059) obj;
        AbstractC8405.m13973("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵喵呜~喵喵喵喵喵呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
        AbstractC8405.m13973("喵喵喵喵喵呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵");
        c9059.getClass();
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(interfaceC7191);
        C9056 c9056 = C9056.f25340;
        C9058 c9058 = c9059.f25353;
        C9065 c9065 = c9059.f25351;
        interfaceC7188Mo10710.mo10719(interfaceC7191, 0, c9056, c9058);
        interfaceC7188Mo10710.mo10719(interfaceC7191, 1, C9062.f25357, c9059.f25352);
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || c9065 != null) {
            interfaceC7188Mo10710.mo10715(interfaceC7191, 2, C9036.f25322, c9065);
        }
        interfaceC7188Mo10710.mo10711(interfaceC7191);
    }
}
