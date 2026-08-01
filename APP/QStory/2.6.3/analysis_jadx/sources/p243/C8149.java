package p243;

import io.ktor.util.date.Month;
import io.ktor.util.date.WeekDay;
import p087.AbstractC7144;
import p087.C7072;
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

/* JADX INFO: renamed from: 飘花落叶言楪兰哲世苏子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8149 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8149 f22473;

    static {
        C8149 c8149 = new C8149();
        f22473 = c8149;
        C7129 c7129 = new C7129("io.ktor.util.date.GMTDate", c8149, 9);
        c7129.m12409("seconds", false);
        c7129.m12409("minutes", false);
        c7129.m12409("hours", false);
        c7129.m12409("dayOfWeek", false);
        c7129.m12409("dayOfMonth", false);
        c7129.m12409("dayOfYear", false);
        c7129.m12409("month", false);
        c7129.m12409("year", false);
        c7129.m12409("timestamp", false);
        descriptor = c7129;
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        InterfaceC7184[] interfaceC7184Arr = C8147.f22463;
        InterfaceC7184 interfaceC7184 = interfaceC7184Arr[3];
        InterfaceC7184 interfaceC71842 = interfaceC7184Arr[6];
        C7083 c7083 = C7083.f18997;
        return new InterfaceC7184[]{c7083, c7083, c7083, interfaceC7184, c7083, c7083, interfaceC71842, c7083, C7072.f18976};
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(interfaceC7191);
        InterfaceC7184[] interfaceC7184Arr = C8147.f22463;
        interfaceC7189Mo10676.getClass();
        Object obj = null;
        int i = 0;
        int iMo10671 = 0;
        int iMo106712 = 0;
        int iMo106713 = 0;
        int iMo106714 = 0;
        int iMo106715 = 0;
        int iMo106716 = 0;
        WeekDay weekDay = null;
        long jMo10699 = 0;
        boolean z = true;
        Month month = null;
        while (z) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(interfaceC7191);
            switch (iMo10718) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    iMo10671 = interfaceC7189Mo10676.mo10671(interfaceC7191, 0);
                    i |= 1;
                    break;
                case 1:
                    iMo106712 = interfaceC7189Mo10676.mo10671(interfaceC7191, 1);
                    i |= 2;
                    break;
                case 2:
                    iMo106713 = interfaceC7189Mo10676.mo10671(interfaceC7191, 2);
                    i |= 4;
                    break;
                case 3:
                    weekDay = (WeekDay) interfaceC7189Mo10676.mo10674(interfaceC7191, 3, interfaceC7184Arr[3], weekDay);
                    i |= 8;
                    break;
                case 4:
                    iMo106714 = interfaceC7189Mo10676.mo10671(interfaceC7191, 4);
                    i |= 16;
                    break;
                case 5:
                    iMo106715 = interfaceC7189Mo10676.mo10671(interfaceC7191, 5);
                    i |= 32;
                    break;
                case 6:
                    month = (Month) interfaceC7189Mo10676.mo10674(interfaceC7191, 6, interfaceC7184Arr[6], month);
                    i |= 64;
                    break;
                case 7:
                    iMo106716 = interfaceC7189Mo10676.mo10671(interfaceC7191, 7);
                    i |= 128;
                    continue;
                case 8:
                    jMo10699 = interfaceC7189Mo10676.mo10699(interfaceC7191, 8);
                    i |= 256;
                    continue;
                default:
                    C7547.m12767(iMo10718);
                    return obj;
            }
            obj = null;
        }
        interfaceC7189Mo10676.mo10678(interfaceC7191);
        return new C8147(i, iMo10671, iMo106712, iMo106713, weekDay, iMo106714, iMo106715, month, iMo106716, jMo10699);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C8147 c8147 = (C8147) obj;
        c8147.getClass();
        InterfaceC7191 interfaceC7191 = descriptor;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(interfaceC7191);
        InterfaceC7184[] interfaceC7184Arr = C8147.f22463;
        interfaceC7188Mo10710.mo10729(0, c8147.f22472, interfaceC7191);
        interfaceC7188Mo10710.mo10729(1, c8147.f22470, interfaceC7191);
        interfaceC7188Mo10710.mo10729(2, c8147.f22471, interfaceC7191);
        interfaceC7188Mo10710.mo10719(interfaceC7191, 3, interfaceC7184Arr[3], c8147.f22465);
        interfaceC7188Mo10710.mo10729(4, c8147.f22464, interfaceC7191);
        interfaceC7188Mo10710.mo10729(5, c8147.f22468, interfaceC7191);
        interfaceC7188Mo10710.mo10719(interfaceC7191, 6, interfaceC7184Arr[6], c8147.f22469);
        interfaceC7188Mo10710.mo10729(7, c8147.f22466, interfaceC7191);
        interfaceC7188Mo10710.mo10722(interfaceC7191, 8, c8147.f22467);
        interfaceC7188Mo10710.mo10711(interfaceC7191);
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] typeParametersSerializers() {
        return AbstractC7144.f19103;
    }
}
