package p259;

import io.ktor.util.date.Month;
import io.ktor.util.date.WeekDay;
import p103.AbstractC7973;
import p103.C7901;
import p103.C7912;
import p103.C7958;
import p103.InterfaceC7908;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p106.InterfaceC8017;
import p106.InterfaceC8018;
import p107.InterfaceC8020;
import p160.C8376;

/* JADX INFO: renamed from: 飘花落叶言楪兰哲世苏子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8978 implements InterfaceC7908 {
    private static final InterfaceC8020 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8978 f22818;

    static {
        C8978 c8978 = new C8978();
        f22818 = c8978;
        C7958 c7958 = new C7958("io.ktor.util.date.GMTDate", c8978, 9);
        c7958.m12968("seconds", false);
        c7958.m12968("minutes", false);
        c7958.m12968("hours", false);
        c7958.m12968("dayOfWeek", false);
        c7958.m12968("dayOfMonth", false);
        c7958.m12968("dayOfYear", false);
        c7958.m12968("month", false);
        c7958.m12968("year", false);
        c7958.m12968("timestamp", false);
        descriptor = c7958;
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] childSerializers() {
        InterfaceC8013[] interfaceC8013Arr = C8976.f22808;
        InterfaceC8013 interfaceC8013 = interfaceC8013Arr[3];
        InterfaceC8013 interfaceC80132 = interfaceC8013Arr[6];
        C7912 c7912 = C7912.f19342;
        return new InterfaceC8013[]{c7912, c7912, c7912, interfaceC8013, c7912, c7912, interfaceC80132, c7912, C7901.f19321};
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(interfaceC8020);
        InterfaceC8013[] interfaceC8013Arr = C8976.f22808;
        interfaceC8018Mo11235.getClass();
        Object obj = null;
        int i = 0;
        int iMo11230 = 0;
        int iMo112302 = 0;
        int iMo112303 = 0;
        int iMo112304 = 0;
        int iMo112305 = 0;
        int iMo112306 = 0;
        WeekDay weekDay = null;
        long jMo11258 = 0;
        boolean z = true;
        Month month = null;
        while (z) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(interfaceC8020);
            switch (iMo11277) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    iMo11230 = interfaceC8018Mo11235.mo11230(interfaceC8020, 0);
                    i |= 1;
                    break;
                case 1:
                    iMo112302 = interfaceC8018Mo11235.mo11230(interfaceC8020, 1);
                    i |= 2;
                    break;
                case 2:
                    iMo112303 = interfaceC8018Mo11235.mo11230(interfaceC8020, 2);
                    i |= 4;
                    break;
                case 3:
                    weekDay = (WeekDay) interfaceC8018Mo11235.mo11233(interfaceC8020, 3, interfaceC8013Arr[3], weekDay);
                    i |= 8;
                    break;
                case 4:
                    iMo112304 = interfaceC8018Mo11235.mo11230(interfaceC8020, 4);
                    i |= 16;
                    break;
                case 5:
                    iMo112305 = interfaceC8018Mo11235.mo11230(interfaceC8020, 5);
                    i |= 32;
                    break;
                case 6:
                    month = (Month) interfaceC8018Mo11235.mo11233(interfaceC8020, 6, interfaceC8013Arr[6], month);
                    i |= 64;
                    break;
                case 7:
                    iMo112306 = interfaceC8018Mo11235.mo11230(interfaceC8020, 7);
                    i |= 128;
                    continue;
                case 8:
                    jMo11258 = interfaceC8018Mo11235.mo11258(interfaceC8020, 8);
                    i |= 256;
                    continue;
                default:
                    C8376.m13326(iMo11277);
                    return obj;
            }
            obj = null;
        }
        interfaceC8018Mo11235.mo11237(interfaceC8020);
        return new C8976(i, iMo11230, iMo112302, iMo112303, weekDay, iMo112304, iMo112305, month, iMo112306, jMo11258);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return descriptor;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C8976 c8976 = (C8976) obj;
        c8976.getClass();
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(interfaceC8020);
        InterfaceC8013[] interfaceC8013Arr = C8976.f22808;
        interfaceC8017Mo11269.mo11288(0, c8976.f22817, interfaceC8020);
        interfaceC8017Mo11269.mo11288(1, c8976.f22815, interfaceC8020);
        interfaceC8017Mo11269.mo11288(2, c8976.f22816, interfaceC8020);
        interfaceC8017Mo11269.mo11278(interfaceC8020, 3, interfaceC8013Arr[3], c8976.f22810);
        interfaceC8017Mo11269.mo11288(4, c8976.f22809, interfaceC8020);
        interfaceC8017Mo11269.mo11288(5, c8976.f22813, interfaceC8020);
        interfaceC8017Mo11269.mo11278(interfaceC8020, 6, interfaceC8013Arr[6], c8976.f22814);
        interfaceC8017Mo11269.mo11288(7, c8976.f22811, interfaceC8020);
        interfaceC8017Mo11269.mo11281(interfaceC8020, 8, c8976.f22812);
        interfaceC8017Mo11269.mo11270(interfaceC8020);
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] typeParametersSerializers() {
        return AbstractC7973.f19448;
    }
}
