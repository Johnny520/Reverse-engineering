package p072;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5227;
import p103.C7954;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p107.C8021;
import p107.InterfaceC8020;
import p267.AbstractC9004;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪哲子世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7621 implements InterfaceC8013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7621 f18577 = new C7621();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7954 f18576 = AbstractC9004.m14192("io.modelcontextprotocol.kotlin.sdk.Method", C8021.f19529);

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        Object next;
        String strMo11221 = interfaceC8016.mo11221();
        Iterator<E> it = Method$Defined.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC5227.m9466(((Method$Defined) next).getValue(), strMo11221)) {
                break;
            }
        }
        Method$Defined method$Defined = (Method$Defined) next;
        return method$Defined != null ? method$Defined : new C7652(strMo11221);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return f18576;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        InterfaceC7645 interfaceC7645 = (InterfaceC7645) obj;
        interfaceC7645.getClass();
        interfaceC8015.mo11208(interfaceC7645.getValue());
    }
}
