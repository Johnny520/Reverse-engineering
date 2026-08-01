package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4395;
import p087.C7125;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p091.C7192;
import p091.InterfaceC7191;
import p251.AbstractC8175;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪哲子世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6792 implements InterfaceC7184 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6792 f18232 = new C6792();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7125 f18231 = AbstractC8175.m13633("io.modelcontextprotocol.kotlin.sdk.Method", C7192.f19184);

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        Object next;
        String strMo10662 = interfaceC7187.mo10662();
        Iterator<E> it = Method$Defined.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC4395.m8907(((Method$Defined) next).getValue(), strMo10662)) {
                break;
            }
        }
        Method$Defined method$Defined = (Method$Defined) next;
        return method$Defined != null ? method$Defined : new C6823(strMo10662);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return f18231;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        InterfaceC6816 interfaceC6816 = (InterfaceC6816) obj;
        interfaceC6816.getClass();
        interfaceC7186.mo10649(interfaceC6816.getValue());
    }
}
