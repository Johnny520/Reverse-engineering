package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.AbstractC5061;
import p087.C7124;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p091.C7191;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪哲子世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6791 implements InterfaceC7183 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6791 f18237 = new C6791();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7124 f18236 = AbstractC5061.m10035("io.modelcontextprotocol.kotlin.sdk.Method", C7191.f19191);

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        Object next;
        String strMo6867 = interfaceC7186.mo6867();
        Iterator<E> it = Method$Defined.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC4394.m8917(((Method$Defined) next).getValue(), strMo6867)) {
                break;
            }
        }
        Method$Defined method$Defined = (Method$Defined) next;
        return method$Defined != null ? method$Defined : new C6822(strMo6867);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return f18236;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        InterfaceC6815 interfaceC6815 = (InterfaceC6815) obj;
        interfaceC6815.getClass();
        interfaceC7185.mo6813(interfaceC6815.getValue());
    }
}
