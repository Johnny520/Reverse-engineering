package p072;

import io.ktor.client.plugins.AbstractC4765;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.InterfaceC6016;
import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p103.C7912;
import p103.C7935;
import p103.C7958;
import p103.C7964;
import p103.InterfaceC7908;
import p104.C7979;
import p104.C7981;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p106.InterfaceC8017;
import p106.InterfaceC8018;
import p107.InterfaceC8020;
import p160.C8376;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪世子兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7573 implements InterfaceC7908 {
    private static final InterfaceC8020 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7573 f18515;

    static {
        C7573 c7573 = new C7573();
        f18515 = c7573;
        C7958 c7958 = new C7958("io.modelcontextprotocol.kotlin.sdk.ProgressNotification", c7573, 6);
        c7958.m12968("progress", false);
        c7958.m12968("progressToken", false);
        c7958.m12968("_meta", true);
        c7958.m12968("total", false);
        c7958.m12968("message", false);
        c7958.m12968("method", true);
        descriptor = c7958;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] childSerializers() {
        return new InterfaceC8013[]{C7912.f19342, C7583.f18527[1].getValue(), C7979.f19457, AbstractC4765.m8872(C7935.f19378), AbstractC4765.m8872(C7964.f19434), C7621.f18577};
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(interfaceC8020);
        InterfaceC6016[] interfaceC6016Arr = C7583.f18527;
        interfaceC8018Mo11235.getClass();
        boolean z = true;
        int i = 0;
        int iMo11230 = 0;
        InterfaceC7665 interfaceC7665 = null;
        C7981 c7981 = null;
        Double d = null;
        String str = null;
        InterfaceC7645 interfaceC7645 = null;
        while (z) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(interfaceC8020);
            switch (iMo11277) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iMo11230 = interfaceC8018Mo11235.mo11230(interfaceC8020, 0);
                    i |= 1;
                    break;
                case 1:
                    interfaceC7665 = (InterfaceC7665) interfaceC8018Mo11235.mo11233(interfaceC8020, 1, (InterfaceC8013) interfaceC6016Arr[1].getValue(), interfaceC7665);
                    i |= 2;
                    break;
                case 2:
                    c7981 = (C7981) interfaceC8018Mo11235.mo11233(interfaceC8020, 2, C7979.f19457, c7981);
                    i |= 4;
                    break;
                case 3:
                    d = (Double) interfaceC8018Mo11235.mo11234(interfaceC8020, 3, C7935.f19378, d);
                    i |= 8;
                    break;
                case 4:
                    str = (String) interfaceC8018Mo11235.mo11234(interfaceC8020, 4, C7964.f19434, str);
                    i |= 16;
                    break;
                case 5:
                    interfaceC7645 = (InterfaceC7645) interfaceC8018Mo11235.mo11233(interfaceC8020, 5, C7621.f18577, interfaceC7645);
                    i |= 32;
                    break;
                default:
                    C8376.m13326(iMo11277);
                    return null;
            }
        }
        interfaceC8018Mo11235.mo11237(interfaceC8020);
        return new C7583(i, iMo11230, interfaceC7665, c7981, d, str, interfaceC7645);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return descriptor;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C7583 c7583 = (C7583) obj;
        c7583.getClass();
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(interfaceC8020);
        InterfaceC6016[] interfaceC6016Arr = C7583.f18527;
        int i = c7583.f18533;
        InterfaceC7645 interfaceC7645 = c7583.f18528;
        C7981 c7981 = c7583.f18531;
        interfaceC8017Mo11269.mo11288(0, i, interfaceC8020);
        interfaceC8017Mo11269.mo11278(interfaceC8020, 1, (InterfaceC8013) interfaceC6016Arr[1].getValue(), c7583.f18532);
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || !AbstractC5227.m9466(c7981, AbstractC7431.f18321)) {
            interfaceC8017Mo11269.mo11278(interfaceC8020, 2, C7979.f19457, c7981);
        }
        interfaceC8017Mo11269.mo11274(interfaceC8020, 3, C7935.f19378, c7583.f18530);
        interfaceC8017Mo11269.mo11274(interfaceC8020, 4, C7964.f19434, c7583.f18529);
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || interfaceC7645 != Method$Defined.NotificationsProgress) {
            interfaceC8017Mo11269.mo11278(interfaceC8020, 5, C7621.f18577, interfaceC7645);
        }
        interfaceC8017Mo11269.mo11270(interfaceC8020);
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] typeParametersSerializers() {
        return AbstractC7973.f19448;
    }
}
