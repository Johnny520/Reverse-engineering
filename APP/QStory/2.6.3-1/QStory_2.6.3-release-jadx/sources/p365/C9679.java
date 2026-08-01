package p365;

import kotlin.jvm.internal.AbstractC5227;
import p103.C7912;
import p103.C7947;
import p103.C7958;
import p103.InterfaceC7908;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p106.InterfaceC8017;
import p106.InterfaceC8018;
import p107.InterfaceC8020;
import p160.C8376;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言苏哲子楪兰世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9679 implements InterfaceC7908 {
    private static final InterfaceC8020 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9679 f25297;

    static {
        C9679 c9679 = new C9679();
        f25297 = c9679;
        C7958 c7958 = new C7958(AbstractC9234.m14531(2818), c9679, 5);
        c7958.m12968(AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵呜喵~喵喵喵喵喵呜喵呜"), true);
        c7958.m12967(new C9680(1, 0));
        c7958.m12968(AbstractC9234.m14531(2819), true);
        c7958.m12967(new C9680(2, 0));
        c7958.m12968(AbstractC9234.m14532("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵喵喵"), true);
        c7958.m12967(new C9680(3, 0));
        c7958.m12968(AbstractC9234.m14531(2820), true);
        c7958.m12967(new C9680(4, 0));
        c7958.m12968(AbstractC9234.m14531(2821), true);
        c7958.m12967(new C9680(12, 0));
        descriptor = c7958;
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] childSerializers() {
        C7912 c7912 = C7912.f19342;
        return new InterfaceC8013[]{c7912, c7912, c7912, C7947.f19399, c7912};
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜喵喵呜~喵喵喵喵喵呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(interfaceC8020);
        interfaceC8018Mo11235.getClass();
        boolean z = true;
        int i = 0;
        int iMo11230 = 0;
        int iMo112302 = 0;
        int iMo112303 = 0;
        int iMo112304 = 0;
        byte[] bArr = null;
        while (z) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(interfaceC8020);
            if (iMo11277 == -1) {
                z = false;
            } else if (iMo11277 == 0) {
                iMo11230 = interfaceC8018Mo11235.mo11230(interfaceC8020, 0);
                i |= 1;
            } else if (iMo11277 == 1) {
                iMo112302 = interfaceC8018Mo11235.mo11230(interfaceC8020, 1);
                i |= 2;
            } else if (iMo11277 == 2) {
                iMo112303 = interfaceC8018Mo11235.mo11230(interfaceC8020, 2);
                i |= 4;
            } else if (iMo11277 == 3) {
                bArr = (byte[]) interfaceC8018Mo11235.mo11233(interfaceC8020, 3, C7947.f19399, bArr);
                i |= 8;
            } else {
                if (iMo11277 != 4) {
                    C8376.m13326(iMo11277);
                    return null;
                }
                iMo112304 = interfaceC8018Mo11235.mo11230(interfaceC8020, 4);
                i |= 16;
            }
        }
        interfaceC8018Mo11235.mo11237(interfaceC8020);
        return new C9677(bArr, i, iMo11230, iMo112302, iMo112303, iMo112304);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return descriptor;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C9677 c9677 = (C9677) obj;
        AbstractC9234.m14532("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵喵呜~喵喵喵喵喵呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
        AbstractC9234.m14532("喵喵喵喵喵呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵");
        c9677.getClass();
        int i = c9677.f25292;
        byte[] bArr = c9677.f25293;
        int i2 = c9677.f25294;
        int i3 = c9677.f25295;
        int i4 = c9677.f25296;
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(interfaceC8020);
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || i4 != 0) {
            interfaceC8017Mo11269.mo11288(0, i4, interfaceC8020);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || i3 != 0) {
            interfaceC8017Mo11269.mo11288(1, i3, interfaceC8020);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || i2 != 0) {
            interfaceC8017Mo11269.mo11288(2, i2, interfaceC8020);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || !AbstractC5227.m9466(bArr, new byte[0])) {
            interfaceC8017Mo11269.mo11278(interfaceC8020, 3, C7947.f19399, bArr);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || i != 0) {
            interfaceC8017Mo11269.mo11288(4, i, interfaceC8020);
        }
        interfaceC8017Mo11269.mo11270(interfaceC8020);
    }
}
