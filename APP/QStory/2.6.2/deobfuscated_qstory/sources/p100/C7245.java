package p100;

import androidx.compose.runtime.AbstractC1332;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪兰哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7245 extends AbstractC1332 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4480 f19310;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7245(InterfaceC4480 interfaceC4480, AbstractC4881 abstractC4881) {
        super(abstractC4881);
        if (abstractC4881 == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", MethodDescription.CONSTRUCTOR_INTERNAL_NAME));
        }
        this.f19310 = interfaceC4480;
    }

    public final String toString() {
        return getType() + ": Ext {" + this.f19310 + "}";
    }
}
