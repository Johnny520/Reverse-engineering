package p056;

import io.modelcontextprotocol.kotlin.sdk.ErrorCode$Defined;
import java.util.Iterator;
import p087.C7125;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p091.C7192;
import p091.InterfaceC7191;
import p251.AbstractC8175;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6728 implements InterfaceC7184 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6728 f18156 = new C6728();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7125 f18155 = AbstractC8175.m13633("io.modelcontextprotocol.kotlin.sdk.ErrorCode", C7192.f19190);

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        Object next;
        int iMo10665 = interfaceC7187.mo10665();
        Iterator<E> it = ErrorCode$Defined.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ErrorCode$Defined) next).getCode() == iMo10665) {
                break;
            }
        }
        ErrorCode$Defined errorCode$Defined = (ErrorCode$Defined) next;
        return errorCode$Defined != null ? errorCode$Defined : new C6730(iMo10665);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return f18155;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        InterfaceC6727 interfaceC6727 = (InterfaceC6727) obj;
        interfaceC6727.getClass();
        interfaceC7186.mo10645(interfaceC6727.getCode());
    }
}
