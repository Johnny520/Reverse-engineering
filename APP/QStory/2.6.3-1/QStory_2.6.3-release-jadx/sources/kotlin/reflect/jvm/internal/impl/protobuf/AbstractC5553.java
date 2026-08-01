package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5553 extends AbstractC5561 implements InterfaceC5532 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C5563 f14136 = C5563.f14156;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f14137;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m9970(GeneratedMessageLite.ExtendableMessage extendableMessage) {
        C5528 c5528;
        if (!this.f14137) {
            this.f14136 = this.f14136.clone();
            this.f14137 = true;
        }
        C5563 c5563 = this.f14136;
        C5563 c55632 = extendableMessage.extensions;
        c5563.getClass();
        int i = 0;
        while (true) {
            int size = c55632.f14158.f14089.size();
            c5528 = c55632.f14158;
            if (i >= size) {
                break;
            }
            c5563.m9983((Map.Entry) c5528.f14089.get(i));
            i++;
        }
        Iterator it = c5528.m9902().iterator();
        while (it.hasNext()) {
            c5563.m9983((Map.Entry) it.next());
        }
    }
}
