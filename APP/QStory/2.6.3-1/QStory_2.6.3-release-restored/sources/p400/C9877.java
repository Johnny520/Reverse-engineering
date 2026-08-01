package p400;

import io.ktor.client.plugins.AbstractC4765;
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
import p365.C9680;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9877 implements InterfaceC7908 {
    private static final InterfaceC8020 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9877 f25679;

    static {
        C9877 c9877 = new C9877();
        f25679 = c9877;
        C7958 c7958 = new C7958("top.artmoe.inao.entries.NewSyncPush", c9877, 5);
        c7958.m12968("type", true);
        c7958.m12967(new C9680(3, 2));
        c7958.m12968("pushId", true);
        c7958.m12967(new C9680(4, 2));
        c7958.m12968("syncContent", true);
        c7958.m12967(new C9680(7, 2));
        c7958.m12968("syncRecallContent", true);
        c7958.m12967(new C9680(8, 2));
        c7958.m12968("syncPushExtra", true);
        c7958.m12967(new C9680(9, 2));
        descriptor = c7958;
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] childSerializers() {
        C7947 c7947 = C7947.f19399;
        InterfaceC8013 interfaceC8013M8872 = AbstractC4765.m8872(c7947);
        InterfaceC8013 interfaceC8013M88722 = AbstractC4765.m8872(C9870.f25670);
        InterfaceC8013 interfaceC8013M88723 = AbstractC4765.m8872(c7947);
        C7912 c7912 = C7912.f19342;
        return new InterfaceC8013[]{c7912, c7912, interfaceC8013M8872, interfaceC8013M88722, interfaceC8013M88723};
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        "decoder";
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(interfaceC8020);
        interfaceC8018Mo11235.getClass();
        boolean z = true;
        int i = 0;
        int iMo11230 = 0;
        int iMo112302 = 0;
        byte[] bArr = null;
        C9872 c9872 = null;
        byte[] bArr2 = null;
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
                bArr = (byte[]) interfaceC8018Mo11235.mo11234(interfaceC8020, 2, C7947.f19399, bArr);
                i |= 4;
            } else if (iMo11277 == 3) {
                c9872 = (C9872) interfaceC8018Mo11235.mo11234(interfaceC8020, 3, C9870.f25670, c9872);
                i |= 8;
            } else {
                if (iMo11277 != 4) {
                    C8376.m13326(iMo11277);
                    return null;
                }
                bArr2 = (byte[]) interfaceC8018Mo11235.mo11234(interfaceC8020, 4, C7947.f19399, bArr2);
                i |= 16;
            }
        }
        interfaceC8018Mo11235.mo11237(interfaceC8020);
        return new C9864(i, iMo11230, iMo112302, bArr, c9872, bArr2);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return descriptor;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C9864 c9864 = (C9864) obj;
        "encoder";
        "value";
        c9864.getClass();
        byte[] bArr = c9864.f25662;
        C9872 c9872 = c9864.f25663;
        byte[] bArr2 = c9864.f25664;
        int i = c9864.f25665;
        int i2 = c9864.f25666;
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(interfaceC8020);
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || i2 != 0) {
            interfaceC8017Mo11269.mo11288(0, i2, interfaceC8020);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || i != 0) {
            interfaceC8017Mo11269.mo11288(1, i, interfaceC8020);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || bArr2 != null) {
            interfaceC8017Mo11269.mo11274(interfaceC8020, 2, C7947.f19399, bArr2);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || c9872 != null) {
            interfaceC8017Mo11269.mo11274(interfaceC8020, 3, C9870.f25670, c9872);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || bArr != null) {
            interfaceC8017Mo11269.mo11274(interfaceC8020, 4, C7947.f19399, bArr);
        }
        interfaceC8017Mo11269.mo11270(interfaceC8020);
    }
}
