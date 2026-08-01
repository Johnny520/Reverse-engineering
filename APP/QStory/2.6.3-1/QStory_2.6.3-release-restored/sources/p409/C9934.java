package p409;

import java.util.List;
import kotlin.InterfaceC6016;
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

/* JADX INFO: renamed from: 飘花落叶言苏楪哲子兰世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9934 implements InterfaceC7908 {
    private static final InterfaceC8020 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9934 f25878;

    static {
        C9934 c9934 = new C9934();
        f25878 = c9934;
        C7958 c7958 = new C7958("top.sacz.xphelper.dexkit.cache.DexKitCacheJson.MethodInfo", c9934, 4);
        c7958.m12968("DeclareClass", false);
        c7958.m12968("MethodName", false);
        c7958.m12968("Params", false);
        c7958.m12968("ReturnType", false);
        descriptor = c7958;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] childSerializers() {
        InterfaceC6016[] interfaceC6016Arr = C9932.f25873;
        C7964 c7964 = C7964.f19434;
        return new InterfaceC8013[]{c7964, c7964, interfaceC6016Arr[2].getValue(), c7964};
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(interfaceC8020);
        InterfaceC6016[] interfaceC6016Arr = C9932.f25873;
        interfaceC8018Mo11235.getClass();
        boolean z = true;
        int i = 0;
        String strMo11245 = null;
        String strMo112452 = null;
        List list = null;
        String strMo112453 = null;
        while (z) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(interfaceC8020);
            if (iMo11277 == -1) {
                z = false;
            } else if (iMo11277 == 0) {
                strMo11245 = interfaceC8018Mo11235.mo11245(interfaceC8020, 0);
                i |= 1;
            } else if (iMo11277 == 1) {
                strMo112452 = interfaceC8018Mo11235.mo11245(interfaceC8020, 1);
                i |= 2;
            } else if (iMo11277 == 2) {
                list = (List) interfaceC8018Mo11235.mo11233(interfaceC8020, 2, (InterfaceC8013) interfaceC6016Arr[2].getValue(), list);
                i |= 4;
            } else {
                if (iMo11277 != 3) {
                    C8376.m13326(iMo11277);
                    return null;
                }
                strMo112453 = interfaceC8018Mo11235.mo11245(interfaceC8020, 3);
                i |= 8;
            }
        }
        interfaceC8018Mo11235.mo11237(interfaceC8020);
        return new C9932(i, strMo11245, strMo112452, list, strMo112453);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return descriptor;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C9932 c9932 = (C9932) obj;
        c9932.getClass();
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(interfaceC8020);
        InterfaceC6016[] interfaceC6016Arr = C9932.f25873;
        interfaceC8017Mo11269.mo11294(interfaceC8020, 0, c9932.f25877);
        interfaceC8017Mo11269.mo11294(interfaceC8020, 1, c9932.f25876);
        interfaceC8017Mo11269.mo11278(interfaceC8020, 2, (InterfaceC8013) interfaceC6016Arr[2].getValue(), c9932.f25875);
        interfaceC8017Mo11269.mo11294(interfaceC8020, 3, c9932.f25874);
        interfaceC8017Mo11269.mo11270(interfaceC8020);
    }
}
