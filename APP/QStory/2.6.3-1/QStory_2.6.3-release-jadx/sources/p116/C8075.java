package p116;

import androidx.compose.runtime.AbstractC2167;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪兰哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8075 extends AbstractC2167 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5313 f19650;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8075(InterfaceC5313 interfaceC5313, AbstractC5714 abstractC5714) {
        super(abstractC5714);
        if (abstractC5714 == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", MethodDescription.CONSTRUCTOR_INTERNAL_NAME));
        }
        this.f19650 = interfaceC5313;
    }

    public final String toString() {
        return getType() + ": Ext {" + this.f19650 + "}";
    }
}
