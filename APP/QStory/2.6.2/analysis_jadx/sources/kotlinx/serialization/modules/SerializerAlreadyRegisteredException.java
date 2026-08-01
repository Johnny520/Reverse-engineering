package kotlinx.serialization.modules;

import kotlin.Metadata;
import kotlin.reflect.InterfaceC5092;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0010\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0004\b\u0005\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlinx/serialization/modules/SerializerAlreadyRegisteredException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "", "msg", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "Lkotlin/reflect/飘花落叶言子楪世哲兰苏;", "baseClass", "concreteClass", "(Lkotlin/reflect/飘花落叶言子楪世哲兰苏;Lkotlin/reflect/飘花落叶言子楪世哲兰苏;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class SerializerAlreadyRegisteredException extends IllegalArgumentException {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SerializerAlreadyRegisteredException(InterfaceC5092 interfaceC5092, InterfaceC5092 interfaceC50922) {
        this("Serializer for " + interfaceC50922 + " already registered in the scope of " + interfaceC5092);
        interfaceC5092.getClass();
        interfaceC50922.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SerializerAlreadyRegisteredException(String str) {
        super(str);
        str.getClass();
    }
}
