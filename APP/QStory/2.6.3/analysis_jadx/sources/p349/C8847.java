package p349;

import p087.C7072;
import p087.C7083;
import p087.C7129;
import p087.C7135;
import p087.InterfaceC7079;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p090.InterfaceC7189;
import p091.InterfaceC7191;
import p144.C7547;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏哲子楪兰世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8847 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8847 f24946;

    static {
        C8847 c8847 = new C8847();
        f24946 = c8847;
        C7129 c7129 = new C7129(AbstractC8405.m13972(2828), c8847, 6);
        c7129.m12409(AbstractC8405.m13972(2121), false);
        c7129.m12408(new C8851(2, 1));
        c7129.m12409(AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜呜呜喵呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵呜"), false);
        c7129.m12408(new C8851(3, 1));
        c7129.m12409(AbstractC8405.m13973("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵喵~喵喵喵呜喵呜喵呜~喵喵喵喵喵喵呜喵~喵喵喵喵呜呜喵喵~喵喵呜喵喵呜喵呜~喵喵喵喵喵呜喵呜"), false);
        c7129.m12408(new C8851(4, 1));
        c7129.m12409(AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜呜喵呜"), false);
        c7129.m12408(new C8851(5, 1));
        c7129.m12409(AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵呜喵喵喵喵呜呜"), false);
        c7129.m12408(new C8851(6, 1));
        c7129.m12409(AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵呜喵喵喵喵呜喵"), false);
        c7129.m12408(new C8851(7, 1));
        descriptor = c7129;
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        C7072 c7072 = C7072.f18976;
        C7083 c7083 = C7083.f18997;
        return new InterfaceC7184[]{c7072, c7072, C7135.f19089, c7083, c7083, c7083};
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜喵喵呜~喵喵喵喵喵呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(interfaceC7191);
        interfaceC7189Mo10676.getClass();
        int i = 0;
        int iMo10671 = 0;
        int iMo106712 = 0;
        int iMo106713 = 0;
        long jMo10699 = 0;
        long jMo106992 = 0;
        String strMo10686 = null;
        boolean z = true;
        while (z) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(interfaceC7191);
            switch (iMo10718) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jMo10699 = interfaceC7189Mo10676.mo10699(interfaceC7191, 0);
                    i |= 1;
                    break;
                case 1:
                    jMo106992 = interfaceC7189Mo10676.mo10699(interfaceC7191, 1);
                    i |= 2;
                    break;
                case 2:
                    strMo10686 = interfaceC7189Mo10676.mo10686(interfaceC7191, 2);
                    i |= 4;
                    break;
                case 3:
                    iMo10671 = interfaceC7189Mo10676.mo10671(interfaceC7191, 3);
                    i |= 8;
                    break;
                case 4:
                    iMo106712 = interfaceC7189Mo10676.mo10671(interfaceC7191, 4);
                    i |= 16;
                    break;
                case 5:
                    iMo106713 = interfaceC7189Mo10676.mo10671(interfaceC7191, 5);
                    i |= 32;
                    break;
                default:
                    C7547.m12767(iMo10718);
                    return null;
            }
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C8852(i, jMo10699, jMo106992, strMo10686, iMo10671, iMo106712, iMo106713);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C8852 c8852 = (C8852) obj;
        AbstractC8405.m13973("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵喵呜~喵喵喵喵喵呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
        AbstractC8405.m13973("喵喵喵喵喵呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵");
        c8852.getClass();
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(interfaceC7191);
        interfaceC7188Mo10710.mo10722(interfaceC7191, 0, c8852.f24960);
        interfaceC7188Mo10710.mo10722(interfaceC7191, 1, c8852.f24959);
        interfaceC7188Mo10710.mo10735(interfaceC7191, 2, c8852.f24958);
        interfaceC7188Mo10710.mo10729(3, c8852.f24957, interfaceC7191);
        interfaceC7188Mo10710.mo10729(4, c8852.f24956, interfaceC7191);
        interfaceC7188Mo10710.mo10729(5, c8852.f24955, interfaceC7191);
        interfaceC7188Mo10710.mo10711(interfaceC7191);
    }
}
