package p056;

import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.AbstractC5061;
import p087.C7124;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p091.C7191;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世子楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6580 implements InterfaceC7183 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6580 f17961 = new C6580();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7124 f17960 = AbstractC5061.m10035("io.modelcontextprotocol.kotlin.sdk.StopReason", C7191.f19191);

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        String strMo6867 = interfaceC7186.mo6867();
        C6582 c6582 = C6582.INSTANCE;
        c6582.getClass();
        if (AbstractC4394.m8917(strMo6867, "stopSequence")) {
            return c6582;
        }
        C6764 c6764 = C6764.INSTANCE;
        c6764.getClass();
        if (AbstractC4394.m8917(strMo6867, "maxTokens")) {
            return c6764;
        }
        C6765 c6765 = C6765.INSTANCE;
        c6765.getClass();
        if (AbstractC4394.m8917(strMo6867, "endTurn")) {
            return c6765;
        }
        strMo6867.getClass();
        return new C6583(strMo6867);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return f17960;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        InterfaceC6581 interfaceC6581 = (InterfaceC6581) obj;
        interfaceC6581.getClass();
        interfaceC7185.mo6813(interfaceC6581.getValue());
    }
}
