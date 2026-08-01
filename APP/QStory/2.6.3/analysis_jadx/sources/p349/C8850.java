package p349;

import kotlin.jvm.internal.AbstractC4395;
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

/* JADX INFO: renamed from: 飘花落叶言苏哲子楪兰世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8850 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8850 f24952;

    static {
        C8850 c8850 = new C8850();
        f24952 = c8850;
        C7129 c7129 = new C7129(AbstractC8405.m13972(2818), c8850, 5);
        c7129.m12409(AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵呜喵~喵喵喵喵喵呜喵呜"), true);
        c7129.m12408(new C8851(1, 0));
        c7129.m12409(AbstractC8405.m13972(2819), true);
        c7129.m12408(new C8851(2, 0));
        c7129.m12409(AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵喵喵"), true);
        c7129.m12408(new C8851(3, 0));
        c7129.m12409(AbstractC8405.m13972(2820), true);
        c7129.m12408(new C8851(4, 0));
        c7129.m12409(AbstractC8405.m13972(2821), true);
        c7129.m12408(new C8851(12, 0));
        descriptor = c7129;
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        C7083 c7083 = C7083.f18997;
        return new InterfaceC7184[]{c7083, c7083, c7083, C7118.f19054, c7083};
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
        int iMo106713 = 0;
        int iMo106714 = 0;
        byte[] bArr = null;
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
                iMo106713 = interfaceC7189Mo10676.mo10671(interfaceC7191, 2);
                i |= 4;
            } else if (iMo10718 == 3) {
                bArr = (byte[]) interfaceC7189Mo10676.mo10674(interfaceC7191, 3, C7118.f19054, bArr);
                i |= 8;
            } else {
                if (iMo10718 != 4) {
                    C7547.m12767(iMo10718);
                    return null;
                }
                iMo106714 = interfaceC7189Mo10676.mo10671(interfaceC7191, 4);
                i |= 16;
            }
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C8848(bArr, i, iMo10671, iMo106712, iMo106713, iMo106714);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C8848 c8848 = (C8848) obj;
        AbstractC8405.m13973("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵喵呜~喵喵喵喵喵呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
        AbstractC8405.m13973("喵喵喵喵喵呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵");
        c8848.getClass();
        int i = c8848.f24947;
        byte[] bArr = c8848.f24948;
        int i2 = c8848.f24949;
        int i3 = c8848.f24950;
        int i4 = c8848.f24951;
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(interfaceC7191);
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || i4 != 0) {
            interfaceC7188Mo10710.mo10729(0, i4, interfaceC7191);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || i3 != 0) {
            interfaceC7188Mo10710.mo10729(1, i3, interfaceC7191);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || i2 != 0) {
            interfaceC7188Mo10710.mo10729(2, i2, interfaceC7191);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || !AbstractC4395.m8907(bArr, new byte[0])) {
            interfaceC7188Mo10710.mo10719(interfaceC7191, 3, C7118.f19054, bArr);
        }
        if (interfaceC7188Mo10710.mo10713(interfaceC7191) || i != 0) {
            interfaceC7188Mo10710.mo10729(4, i, interfaceC7191);
        }
        interfaceC7188Mo10710.mo10711(interfaceC7191);
    }
}
