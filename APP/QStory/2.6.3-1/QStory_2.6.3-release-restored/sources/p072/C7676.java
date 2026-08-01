package p072;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪苏子兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7676 implements InterfaceC7908 {
    private static final InterfaceC8020 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7676 f18630;

    static {
        C7676 c7676 = new C7676();
        f18630 = c7676;
        C7958 c7958 = new C7958("io.modelcontextprotocol.kotlin.sdk.ReadResourceRequest", c7676, 3);
        c7958.m12968("uri", false);
        c7958.m12968("_meta", true);
        c7958.m12968("method", true);
        descriptor = c7958;
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] childSerializers() {
        return new InterfaceC8013[]{C7964.f19434, C7979.f19457, C7621.f18577};
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(interfaceC8020);
        interfaceC8018Mo11235.getClass();
        boolean z = true;
        int i = 0;
        String strMo11245 = null;
        C7981 c7981 = null;
        InterfaceC7645 interfaceC7645 = null;
        while (z) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(interfaceC8020);
            if (iMo11277 == -1) {
                z = false;
            } else if (iMo11277 == 0) {
                strMo11245 = interfaceC8018Mo11235.mo11245(interfaceC8020, 0);
                i |= 1;
            } else if (iMo11277 == 1) {
                c7981 = (C7981) interfaceC8018Mo11235.mo11233(interfaceC8020, 1, C7979.f19457, c7981);
                i |= 2;
            } else {
                if (iMo11277 != 2) {
                    C8376.m13326(iMo11277);
                    return null;
                }
                interfaceC7645 = (InterfaceC7645) interfaceC8018Mo11235.mo11233(interfaceC8020, 2, C7621.f18577, interfaceC7645);
                i |= 4;
            }
        }
        interfaceC8018Mo11235.mo11237(interfaceC8020);
        return new C7661(i, strMo11245, c7981, interfaceC7645);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return descriptor;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C7661 c7661 = (C7661) obj;
        c7661.getClass();
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(interfaceC8020);
        String str = c7661.f18619;
        InterfaceC7645 interfaceC7645 = c7661.f18617;
        C7981 c7981 = c7661.f18618;
        interfaceC8017Mo11269.mo11294(interfaceC8020, 0, str);
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || !AbstractC5227.m9466(c7981, AbstractC7431.f18321)) {
            interfaceC8017Mo11269.mo11278(interfaceC8020, 1, C7979.f19457, c7981);
        }
        if (interfaceC8017Mo11269.mo11272(interfaceC8020) || interfaceC7645 != Method$Defined.ResourcesRead) {
            interfaceC8017Mo11269.mo11278(interfaceC8020, 2, C7621.f18577, interfaceC7645);
        }
        interfaceC8017Mo11269.mo11270(interfaceC8020);
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] typeParametersSerializers() {
        return AbstractC7973.f19448;
    }
}
