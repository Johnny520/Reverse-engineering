package p072;

import io.ktor.client.plugins.AbstractC4765;
import p103.AbstractC7973;
import p103.C7929;
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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪世苏兰子哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7579 implements InterfaceC7908 {
    private static final InterfaceC8020 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7579 f18521;

    static {
        C7579 c7579 = new C7579();
        f18521 = c7579;
        C7958 c7958 = new C7958("io.modelcontextprotocol.kotlin.sdk.PromptArgument", c7579, 3);
        c7958.m12968("name", false);
        c7958.m12968("description", false);
        c7958.m12968("required", false);
        descriptor = c7958;
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] childSerializers() {
        C7964 c7964 = C7964.f19434;
        return new InterfaceC8013[]{c7964, AbstractC4765.m8872(c7964), AbstractC4765.m8872(C7929.f19370)};
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(interfaceC8020);
        interfaceC8018Mo11235.getClass();
        boolean z = true;
        int i = 0;
        String strMo11245 = null;
        String str = null;
        Boolean bool = null;
        while (z) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(interfaceC8020);
            if (iMo11277 == -1) {
                z = false;
            } else if (iMo11277 == 0) {
                strMo11245 = interfaceC8018Mo11235.mo11245(interfaceC8020, 0);
                i |= 1;
            } else if (iMo11277 == 1) {
                str = (String) interfaceC8018Mo11235.mo11234(interfaceC8020, 1, C7964.f19434, str);
                i |= 2;
            } else {
                if (iMo11277 != 2) {
                    C8376.m13326(iMo11277);
                    return null;
                }
                bool = (Boolean) interfaceC8018Mo11235.mo11234(interfaceC8020, 2, C7929.f19370, bool);
                i |= 4;
            }
        }
        interfaceC8018Mo11235.mo11237(interfaceC8020);
        return new C7569(i, strMo11245, str, bool);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return descriptor;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C7569 c7569 = (C7569) obj;
        c7569.getClass();
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(interfaceC8020);
        interfaceC8017Mo11269.mo11294(interfaceC8020, 0, c7569.f18513);
        interfaceC8017Mo11269.mo11274(interfaceC8020, 1, C7964.f19434, c7569.f18512);
        interfaceC8017Mo11269.mo11274(interfaceC8020, 2, C7929.f19370, c7569.f18511);
        interfaceC8017Mo11269.mo11270(interfaceC8020);
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] typeParametersSerializers() {
        return AbstractC7973.f19448;
    }
}
