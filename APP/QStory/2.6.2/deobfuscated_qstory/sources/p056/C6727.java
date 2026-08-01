package p056;

import io.modelcontextprotocol.kotlin.sdk.ErrorCode$Defined;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.AbstractC5061;
import p087.C7124;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p091.C7191;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6727 implements InterfaceC7183 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6727 f18161 = new C6727();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7124 f18160 = AbstractC5061.m10035("io.modelcontextprotocol.kotlin.sdk.ErrorCode", C7191.f19197);

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        Object next;
        int iMo6868 = interfaceC7186.mo6868();
        Iterator<E> it = ErrorCode$Defined.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ErrorCode$Defined) next).getCode() == iMo6868) {
                break;
            }
        }
        ErrorCode$Defined errorCode$Defined = (ErrorCode$Defined) next;
        return errorCode$Defined != null ? errorCode$Defined : new C6729(iMo6868);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return f18160;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        InterfaceC6726 interfaceC6726 = (InterfaceC6726) obj;
        interfaceC6726.getClass();
        interfaceC7185.mo6790(interfaceC6726.getCode());
    }
}
