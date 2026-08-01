package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4720 extends AbstractC4728 implements InterfaceC4699 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C4730 f13787 = C4730.f13807;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f13788;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m9421(GeneratedMessageLite.ExtendableMessage extendableMessage) {
        C4695 c4695;
        if (!this.f13788) {
            this.f13787 = this.f13787.clone();
            this.f13788 = true;
        }
        C4730 c4730 = this.f13787;
        C4730 c47302 = extendableMessage.extensions;
        c4730.getClass();
        int i = 0;
        while (true) {
            int size = c47302.f13809.f13740.size();
            c4695 = c47302.f13809;
            if (i >= size) {
                break;
            }
            c4730.m9434((Map.Entry) c4695.f13740.get(i));
            i++;
        }
        Iterator it = c4695.m9353().iterator();
        while (it.hasNext()) {
            c4730.m9434((Map.Entry) it.next());
        }
    }
}
