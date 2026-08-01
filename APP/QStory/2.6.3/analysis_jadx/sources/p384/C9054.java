package p384;

import kotlin.jvm.internal.AbstractC4395;
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
import p349.C8851;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9054 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9054 f25339;

    static {
        C9054 c9054 = new C9054();
        f25339 = c9054;
        C7129 c7129 = new C7129(AbstractC8405.m13972(1459), c9054, 3);
        c7129.m12409(AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜喵呜呜喵喵~喵喵喵喵呜喵喵喵"), true);
        c7129.m12408(new C8851(1, 3));
        c7129.m12409(AbstractC8405.m13972(1452), true);
        c7129.m12408(new C8851(2, 3));
        c7129.m12409(AbstractC8405.m13972(1441), true);
        c7129.m12408(new C8851(4, 3));
        descriptor = c7129;
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        return new InterfaceC7184[]{C7072.f18976, C7083.f18997, C7135.f19089};
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜喵喵呜~喵喵喵喵喵呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(interfaceC7191);
        interfaceC7189Mo10676.getClass();
        int i = 0;
        int iMo10671 = 0;
        long jMo10699 = 0;
        String strMo10686 = null;
        boolean z = true;
        while (z) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(interfaceC7191);
            if (iMo10718 == -1) {
                z = false;
            } else if (iMo10718 == 0) {
                jMo10699 = interfaceC7189Mo10676.mo10699(interfaceC7191, 0);
                i |= 1;
            } else if (iMo10718 == 1) {
                iMo10671 = interfaceC7189Mo10676.mo10671(interfaceC7191, 1);
                i |= 2;
            } else {
                if (iMo10718 != 2) {
                    C7547.m12767(iMo10718);
                    return null;
                }
                strMo10686 = interfaceC7189Mo10676.mo10686(interfaceC7191, 2);
                i |= 4;
            }
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C9052(i, iMo10671, jMo10699, strMo10686);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C9052 c9052 = (C9052) obj;
        AbstractC8405.m13973("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵喵呜~喵喵喵喵喵呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
        AbstractC8405.m13973("喵喵喵喵喵呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵");
        c9052.getClass();
        String str = c9052.f25336;
        int i = c9052.f25337;
        long j = c9052.f25338;
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(interfaceC7191);
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || j != 0) {
            interfaceC7188Mo10710.mo10722(interfaceC7191, 0, j);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || i != 0) {
            interfaceC7188Mo10710.mo10729(1, i, interfaceC7191);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || !AbstractC4395.m8907(str, "")) {
            interfaceC7188Mo10710.mo10735(interfaceC7191, 2, str);
        }
        interfaceC7188Mo10710.mo10711(interfaceC7191);
    }
}
