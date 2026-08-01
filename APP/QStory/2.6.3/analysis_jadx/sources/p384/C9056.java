package p384;

import io.ktor.client.plugins.AbstractC3933;
import kotlin.jvm.internal.AbstractC4395;
import p087.C7072;
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

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9056 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9056 f25340;

    static {
        C9056 c9056 = new C9056();
        f25340 = c9056;
        C7129 c7129 = new C7129(AbstractC8405.m13972(1456), c9056, 5);
        c7129.m12409(AbstractC8405.m13972(1384), true);
        c7129.m12408(new C8851(1, 3));
        c7129.m12409(AbstractC8405.m13972(1431), true);
        c7129.m12408(new C8851(2, 3));
        c7129.m12409(AbstractC8405.m13972(1457), true);
        c7129.m12408(new C8851(5, 3));
        c7129.m12409(AbstractC8405.m13972(1422), true);
        c7129.m12408(new C8851(6, 3));
        c7129.m12409(AbstractC8405.m13972(1458), true);
        c7129.m12408(new C8851(8, 3));
        descriptor = c7129;
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        InterfaceC7184 interfaceC7184M8313 = AbstractC3933.m8313(C9054.f25339);
        C7072 c7072 = C7072.f18976;
        C7135 c7135 = C7135.f19089;
        return new InterfaceC7184[]{c7072, c7135, c7072, c7135, interfaceC7184M8313};
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜喵喵呜~喵喵喵喵喵呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(interfaceC7191);
        interfaceC7189Mo10676.getClass();
        int i = 0;
        long jMo10699 = 0;
        long jMo106992 = 0;
        String strMo10686 = null;
        String strMo106862 = null;
        C9052 c9052 = null;
        boolean z = true;
        while (z) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(interfaceC7191);
            if (iMo10718 == -1) {
                z = false;
            } else if (iMo10718 == 0) {
                jMo10699 = interfaceC7189Mo10676.mo10699(interfaceC7191, 0);
                i |= 1;
            } else if (iMo10718 == 1) {
                strMo10686 = interfaceC7189Mo10676.mo10686(interfaceC7191, 1);
                i |= 2;
            } else if (iMo10718 == 2) {
                jMo106992 = interfaceC7189Mo10676.mo10699(interfaceC7191, 2);
                i |= 4;
            } else if (iMo10718 == 3) {
                strMo106862 = interfaceC7189Mo10676.mo10686(interfaceC7191, 3);
                i |= 8;
            } else {
                if (iMo10718 != 4) {
                    C7547.m12767(iMo10718);
                    return null;
                }
                c9052 = (C9052) interfaceC7189Mo10676.mo10675(interfaceC7191, 4, C9054.f25339, c9052);
                i |= 16;
            }
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C9058(i, jMo10699, strMo10686, jMo106992, strMo106862, c9052);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C9058 c9058 = (C9058) obj;
        AbstractC8405.m13973("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵喵呜~喵喵喵喵喵呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
        AbstractC8405.m13973("喵喵喵喵喵呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵");
        c9058.getClass();
        C9052 c9052 = c9058.f25346;
        String str = c9058.f25347;
        long j = c9058.f25348;
        String str2 = c9058.f25349;
        long j2 = c9058.f25350;
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(interfaceC7191);
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || j2 != 0) {
            interfaceC7188Mo10710.mo10722(interfaceC7191, 0, j2);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || !AbstractC4395.m8907(str2, "")) {
            interfaceC7188Mo10710.mo10735(interfaceC7191, 1, str2);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || j != 0) {
            interfaceC7188Mo10710.mo10722(interfaceC7191, 2, j);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || !AbstractC4395.m8907(str, "")) {
            interfaceC7188Mo10710.mo10735(interfaceC7191, 3, str);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || c9052 != null) {
            interfaceC7188Mo10710.mo10715(interfaceC7191, 4, C9054.f25339, c9052);
        }
        interfaceC7188Mo10710.mo10711(interfaceC7191);
    }
}
