package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4721 extends AbstractC4729 implements InterfaceC4700 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C4731 f13791 = C4731.f13811;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f13792;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m9411(GeneratedMessageLite.ExtendableMessage extendableMessage) {
        C4696 c4696;
        if (!this.f13792) {
            this.f13791 = this.f13791.clone();
            this.f13792 = true;
        }
        C4731 c4731 = this.f13791;
        C4731 c47312 = extendableMessage.extensions;
        c4731.getClass();
        int i = 0;
        while (true) {
            int size = c47312.f13813.f13744.size();
            c4696 = c47312.f13813;
            if (i >= size) {
                break;
            }
            c4731.m9424((Map.Entry) c4696.f13744.get(i));
            i++;
        }
        Iterator it = c4696.m9343().iterator();
        while (it.hasNext()) {
            c4731.m9424((Map.Entry) it.next());
        }
    }
}
