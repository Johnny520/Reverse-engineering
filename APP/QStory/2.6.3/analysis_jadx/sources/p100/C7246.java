package p100;

import androidx.compose.runtime.AbstractC1332;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪兰哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7246 extends AbstractC1332 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4481 f19305;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7246(InterfaceC4481 interfaceC4481, AbstractC4882 abstractC4882) {
        super(abstractC4882);
        if (abstractC4882 == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", MethodDescription.CONSTRUCTOR_INTERNAL_NAME));
        }
        this.f19305 = interfaceC4481;
    }

    public final String toString() {
        return getType() + ": Ext {" + this.f19305 + "}";
    }
}
