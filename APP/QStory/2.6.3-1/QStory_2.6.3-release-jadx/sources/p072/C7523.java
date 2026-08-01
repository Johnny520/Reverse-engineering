package p072;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p103.C7958;
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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7523 implements InterfaceC7908 {
    private static final InterfaceC8020 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7523 f18452;

    static {
        C7523 c7523 = new C7523();
        f18452 = c7523;
        C7958 c7958 = new C7958("io.modelcontextprotocol.kotlin.sdk.CompleteRequest", c7523, 4);
        c7958.m12968("ref", false);
        c7958.m12968("argument", false);
        c7958.m12968("_meta", true);
        c7958.m12968("method", true);
        descriptor = c7958;
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] childSerializers() {
        return new InterfaceC8013[]{C7672.f18626, C7520.f18446, C7979.f19457, C7621.f18577};
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(interfaceC8020);
        interfaceC8018Mo11235.getClass();
        boolean z = true;
        int i = 0;
        InterfaceC7656 interfaceC7656 = null;
        C7457 c7457 = null;
        C7981 c7981 = null;
        InterfaceC7645 interfaceC7645 = null;
        while (z) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(interfaceC8020);
            if (iMo11277 == -1) {
                z = false;
            } else if (iMo11277 == 0) {
                interfaceC7656 = (InterfaceC7656) interfaceC8018Mo11235.mo11233(interfaceC8020, 0, C7672.f18626, interfaceC7656);
                i |= 1;
            } else if (iMo11277 == 1) {
                c7457 = (C7457) interfaceC8018Mo11235.mo11233(interfaceC8020, 1, C7520.f18446, c7457);
                i |= 2;
            } else if (iMo11277 == 2) {
                c7981 = (C7981) interfaceC8018Mo11235.mo11233(interfaceC8020, 2, C7979.f19457, c7981);
                i |= 4;
            } else {
                if (iMo11277 != 3) {
                    C8376.m13326(iMo11277);
                    return null;
                }
                interfaceC7645 = (InterfaceC7645) interfaceC8018Mo11235.mo11233(interfaceC8020, 3, C7621.f18577, interfaceC7645);
                i |= 8;
            }
        }
        interfaceC8018Mo11235.mo11237(interfaceC8020);
        return new C7455(i, interfaceC7656, c7457, c7981, interfaceC7645);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return descriptor;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C7455 c7455 = (C7455) obj;
        c7455.getClass();
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(interfaceC8020);
        C7672 c7672 = C7672.f18626;
        InterfaceC7656 interfaceC7656 = c7455.f18358;
        InterfaceC7645 interfaceC7645 = c7455.f18355;
        C7981 c7981 = c7455.f18356;
        interfaceC8017Mo11269.mo11278(interfaceC8020, 0, c7672, interfaceC7656);
        interfaceC8017Mo11269.mo11278(interfaceC8020, 1, C7520.f18446, c7455.f18357);
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || !AbstractC5227.m9466(c7981, AbstractC7431.f18321)) {
            interfaceC8017Mo11269.mo11278(interfaceC8020, 2, C7979.f19457, c7981);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || interfaceC7645 != Method$Defined.CompletionComplete) {
            interfaceC8017Mo11269.mo11278(interfaceC8020, 3, C7621.f18577, interfaceC7645);
        }
        interfaceC8017Mo11269.mo11270(interfaceC8020);
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] typeParametersSerializers() {
        return AbstractC7973.f19448;
    }
}
