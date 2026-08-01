package p072;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.InterfaceC6016;
import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p103.C7958;
import p103.C7964;
import p103.InterfaceC7908;
import p104.AbstractC8005;
import p104.C8000;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p106.InterfaceC8017;
import p106.InterfaceC8018;
import p107.InterfaceC8020;
import p160.C8376;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7510 implements InterfaceC7908 {
    private static final InterfaceC8020 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7510 f18435;

    static {
        C7510 c7510 = new C7510();
        f18435 = c7510;
        C7958 c7958 = new C7958("io.modelcontextprotocol.kotlin.sdk.JSONRPCRequest", c7510, 4);
        c7958.m12968("id", true);
        c7958.m12968("method", false);
        c7958.m12968("params", true);
        c7958.m12968("jsonrpc", true);
        descriptor = c7958;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] childSerializers() {
        C7964 c7964 = C7964.f19434;
        return new InterfaceC8013[]{C7507.f18425[0].getValue(), c7964, C8000.f19484, c7964};
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(interfaceC8020);
        InterfaceC6016[] interfaceC6016Arr = C7507.f18425;
        interfaceC8018Mo11235.getClass();
        boolean z = true;
        int i = 0;
        InterfaceC7665 interfaceC7665 = null;
        String strMo11245 = null;
        AbstractC8005 abstractC8005 = null;
        String strMo112452 = null;
        while (z) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(interfaceC8020);
            if (iMo11277 == -1) {
                z = false;
            } else if (iMo11277 == 0) {
                interfaceC7665 = (InterfaceC7665) interfaceC8018Mo11235.mo11233(interfaceC8020, 0, (InterfaceC8013) interfaceC6016Arr[0].getValue(), interfaceC7665);
                i |= 1;
            } else if (iMo11277 == 1) {
                strMo11245 = interfaceC8018Mo11235.mo11245(interfaceC8020, 1);
                i |= 2;
            } else if (iMo11277 == 2) {
                abstractC8005 = (AbstractC8005) interfaceC8018Mo11235.mo11233(interfaceC8020, 2, C8000.f19484, abstractC8005);
                i |= 4;
            } else {
                if (iMo11277 != 3) {
                    C8376.m13326(iMo11277);
                    return null;
                }
                strMo112452 = interfaceC8018Mo11235.mo11245(interfaceC8020, 3);
                i |= 8;
            }
        }
        interfaceC8018Mo11235.mo11237(interfaceC8020);
        return new C7507(i, interfaceC7665, strMo11245, abstractC8005, strMo112452);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @Override // p105.InterfaceC8013
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C7507 c7507 = (C7507) obj;
        c7507.getClass();
        InterfaceC7665 interfaceC7665 = c7507.f18429;
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(interfaceC8020);
        InterfaceC6016[] interfaceC6016Arr = C7507.f18425;
        if (interfaceC8017Mo11269.mo11272(interfaceC8020)) {
            interfaceC8017Mo11269.mo11278(interfaceC8020, 0, (InterfaceC8013) interfaceC6016Arr[0].getValue(), interfaceC7665);
        } else {
            AtomicLong atomicLong = AbstractC7433.f18323;
            atomicLong.getClass();
            if (!AbstractC5227.m9466(interfaceC7665, new C7666(atomicLong.addAndGet(1L)))) {
            }
        }
        String str = c7507.f18428;
        String str2 = c7507.f18426;
        AbstractC8005 abstractC8005 = c7507.f18427;
        interfaceC8017Mo11269.mo11294(interfaceC8020, 1, str);
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || !AbstractC5227.m9466(abstractC8005, AbstractC7431.f18321)) {
            interfaceC8017Mo11269.mo11278(interfaceC8020, 2, C8000.f19484, abstractC8005);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || !AbstractC5227.m9466(str2, "2.0")) {
            interfaceC8017Mo11269.mo11294(interfaceC8020, 3, str2);
        }
        interfaceC8017Mo11269.mo11270(interfaceC8020);
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] typeParametersSerializers() {
        return AbstractC7973.f19448;
    }
}
