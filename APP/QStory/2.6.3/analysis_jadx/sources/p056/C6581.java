package p056;

import kotlin.jvm.internal.AbstractC4395;
import p087.C7125;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p091.C7192;
import p091.InterfaceC7191;
import p251.AbstractC8175;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世子楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6581 implements InterfaceC7184 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6581 f17956 = new C6581();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7125 f17955 = AbstractC8175.m13633("io.modelcontextprotocol.kotlin.sdk.StopReason", C7192.f19184);

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        String strMo10662 = interfaceC7187.mo10662();
        C6583 c6583 = C6583.INSTANCE;
        c6583.getClass();
        if (AbstractC4395.m8907(strMo10662, "stopSequence")) {
            return c6583;
        }
        C6765 c6765 = C6765.INSTANCE;
        c6765.getClass();
        if (AbstractC4395.m8907(strMo10662, "maxTokens")) {
            return c6765;
        }
        C6766 c6766 = C6766.INSTANCE;
        c6766.getClass();
        if (AbstractC4395.m8907(strMo10662, "endTurn")) {
            return c6766;
        }
        strMo10662.getClass();
        return new C6584(strMo10662);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return f17955;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        InterfaceC6582 interfaceC6582 = (InterfaceC6582) obj;
        interfaceC6582.getClass();
        interfaceC7186.mo10649(interfaceC6582.getValue());
    }
}
