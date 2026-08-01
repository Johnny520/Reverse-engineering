package p072;

import kotlin.jvm.internal.AbstractC5227;
import p103.C7954;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p107.C8021;
import p107.InterfaceC8020;
import p267.AbstractC9004;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世子楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7410 implements InterfaceC8013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7410 f18301 = new C7410();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7954 f18300 = AbstractC9004.m14192("io.modelcontextprotocol.kotlin.sdk.StopReason", C8021.f19529);

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        String strMo11221 = interfaceC8016.mo11221();
        C7412 c7412 = C7412.INSTANCE;
        c7412.getClass();
        if (AbstractC5227.m9466(strMo11221, "stopSequence")) {
            return c7412;
        }
        C7594 c7594 = C7594.INSTANCE;
        c7594.getClass();
        if (AbstractC5227.m9466(strMo11221, "maxTokens")) {
            return c7594;
        }
        C7595 c7595 = C7595.INSTANCE;
        c7595.getClass();
        if (AbstractC5227.m9466(strMo11221, "endTurn")) {
            return c7595;
        }
        strMo11221.getClass();
        return new C7413(strMo11221);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return f18300;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        InterfaceC7411 interfaceC7411 = (InterfaceC7411) obj;
        interfaceC7411.getClass();
        interfaceC8015.mo11208(interfaceC7411.getValue());
    }
}
