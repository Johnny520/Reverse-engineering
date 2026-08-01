package p072;

import io.ktor.client.plugins.AbstractC4765;
import p103.AbstractC7973;
import p103.C7958;
import p103.C7964;
import p103.InterfaceC7908;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p106.InterfaceC8017;
import p106.InterfaceC8018;
import p107.InterfaceC8020;
import p160.C8376;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪子哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7644 implements InterfaceC7908 {
    private static final InterfaceC8020 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7644 f18600;

    static {
        C7644 c7644 = new C7644();
        f18600 = c7644;
        C7958 c7958 = new C7958("io.modelcontextprotocol.kotlin.sdk.ModelHint", c7644, 1);
        c7958.m12968("name", false);
        descriptor = c7958;
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] childSerializers() {
        return new InterfaceC8013[]{AbstractC4765.m8872(C7964.f19434)};
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(interfaceC8020);
        interfaceC8018Mo11235.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(interfaceC8020);
            if (iMo11277 == -1) {
                z = false;
            } else {
                if (iMo11277 != 0) {
                    C8376.m13326(iMo11277);
                    return null;
                }
                str = (String) interfaceC8018Mo11235.mo11234(interfaceC8020, 0, C7964.f19434, str);
                i = 1;
            }
        }
        interfaceC8018Mo11235.mo11237(interfaceC8020);
        return new C7649(i, str);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return descriptor;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C7649 c7649 = (C7649) obj;
        c7649.getClass();
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(interfaceC8020);
        interfaceC8017Mo11269.mo11274(interfaceC8020, 0, C7964.f19434, c7649.f18602);
        interfaceC8017Mo11269.mo11270(interfaceC8020);
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] typeParametersSerializers() {
        return AbstractC7973.f19448;
    }
}
