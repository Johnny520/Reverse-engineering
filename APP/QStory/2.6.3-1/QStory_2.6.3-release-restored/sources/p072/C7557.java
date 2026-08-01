package p072;

import io.modelcontextprotocol.kotlin.sdk.ErrorCode$Defined;
import java.util.Iterator;
import p103.C7954;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p107.C8021;
import p107.InterfaceC8020;
import p267.AbstractC9004;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7557 implements InterfaceC8013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7557 f18501 = new C7557();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7954 f18500 = AbstractC9004.m14192("io.modelcontextprotocol.kotlin.sdk.ErrorCode", C8021.f19535);

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        Object next;
        int iMo11224 = interfaceC8016.mo11224();
        Iterator<E> it = ErrorCode$Defined.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ErrorCode$Defined) next).getCode() == iMo11224) {
                break;
            }
        }
        ErrorCode$Defined errorCode$Defined = (ErrorCode$Defined) next;
        return errorCode$Defined != null ? errorCode$Defined : new C7559(iMo11224);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return f18500;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        InterfaceC7556 interfaceC7556 = (InterfaceC7556) obj;
        interfaceC7556.getClass();
        interfaceC8015.mo11204(interfaceC7556.getCode());
    }
}
