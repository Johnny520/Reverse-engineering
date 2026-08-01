package p243;

import io.ktor.util.date.Month;
import io.ktor.util.date.WeekDay;
import p087.AbstractC7143;
import p087.C7071;
import p087.C7082;
import p087.C7128;
import p087.InterfaceC7078;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p091.InterfaceC7190;
import p144.C7546;

/* JADX INFO: renamed from: 飘花落叶言楪兰哲世苏子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8148 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8148 f22475;

    static {
        C8148 c8148 = new C8148();
        f22475 = c8148;
        C7128 c7128 = new C7128("io.ktor.util.date.GMTDate", c8148, 9);
        c7128.m12382("seconds", false);
        c7128.m12382("minutes", false);
        c7128.m12382("hours", false);
        c7128.m12382("dayOfWeek", false);
        c7128.m12382("dayOfMonth", false);
        c7128.m12382("dayOfYear", false);
        c7128.m12382("month", false);
        c7128.m12382("year", false);
        c7128.m12382("timestamp", false);
        descriptor = c7128;
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        InterfaceC7183[] interfaceC7183Arr = C8146.f22465;
        InterfaceC7183 interfaceC7183 = interfaceC7183Arr[3];
        InterfaceC7183 interfaceC71832 = interfaceC7183Arr[6];
        C7082 c7082 = C7082.f19002;
        return new InterfaceC7183[]{c7082, c7082, c7082, interfaceC7183, c7082, c7082, interfaceC71832, c7082, C7071.f18981};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        InterfaceC7183[] interfaceC7183Arr = C8146.f22465;
        interfaceC7188Mo6876.getClass();
        Object obj = null;
        int i = 0;
        int iMo6872 = 0;
        int iMo68722 = 0;
        int iMo68723 = 0;
        int iMo68724 = 0;
        int iMo68725 = 0;
        int iMo68726 = 0;
        WeekDay weekDay = null;
        long jMo6886 = 0;
        boolean z = true;
        Month month = null;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            switch (iMo10672) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    iMo6872 = interfaceC7188Mo6876.mo6872(interfaceC7190, 0);
                    i |= 1;
                    break;
                case 1:
                    iMo68722 = interfaceC7188Mo6876.mo6872(interfaceC7190, 1);
                    i |= 2;
                    break;
                case 2:
                    iMo68723 = interfaceC7188Mo6876.mo6872(interfaceC7190, 2);
                    i |= 4;
                    break;
                case 3:
                    weekDay = (WeekDay) interfaceC7188Mo6876.mo6874(interfaceC7190, 3, interfaceC7183Arr[3], weekDay);
                    i |= 8;
                    break;
                case 4:
                    iMo68724 = interfaceC7188Mo6876.mo6872(interfaceC7190, 4);
                    i |= 16;
                    break;
                case 5:
                    iMo68725 = interfaceC7188Mo6876.mo6872(interfaceC7190, 5);
                    i |= 32;
                    break;
                case 6:
                    month = (Month) interfaceC7188Mo6876.mo6874(interfaceC7190, 6, interfaceC7183Arr[6], month);
                    i |= 64;
                    break;
                case 7:
                    iMo68726 = interfaceC7188Mo6876.mo6872(interfaceC7190, 7);
                    i |= 128;
                    continue;
                case 8:
                    jMo6886 = interfaceC7188Mo6876.mo6886(interfaceC7190, 8);
                    i |= 256;
                    continue;
                default:
                    C7546.m12738(iMo10672);
                    return obj;
            }
            obj = null;
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C8146(i, iMo6872, iMo68722, iMo68723, weekDay, iMo68724, iMo68725, month, iMo68726, jMo6886);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C8146 c8146 = (C8146) obj;
        c8146.getClass();
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        InterfaceC7183[] interfaceC7183Arr = C8146.f22465;
        interfaceC7187Mo6800.mo6805(0, c8146.f22474, interfaceC7190);
        interfaceC7187Mo6800.mo6805(1, c8146.f22472, interfaceC7190);
        interfaceC7187Mo6800.mo6805(2, c8146.f22473, interfaceC7190);
        interfaceC7187Mo6800.mo6791(interfaceC7190, 3, interfaceC7183Arr[3], c8146.f22467);
        interfaceC7187Mo6800.mo6805(4, c8146.f22466, interfaceC7190);
        interfaceC7187Mo6800.mo6805(5, c8146.f22470, interfaceC7190);
        interfaceC7187Mo6800.mo6791(interfaceC7190, 6, interfaceC7183Arr[6], c8146.f22471);
        interfaceC7187Mo6800.mo6805(7, c8146.f22468, interfaceC7190);
        interfaceC7187Mo6800.mo6796(interfaceC7190, 8, c8146.f22469);
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] typeParametersSerializers() {
        return AbstractC7143.f19108;
    }
}
