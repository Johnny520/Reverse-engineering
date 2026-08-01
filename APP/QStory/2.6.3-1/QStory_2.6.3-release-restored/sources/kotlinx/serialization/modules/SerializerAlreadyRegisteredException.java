package kotlinx.serialization.modules;

import kotlin.Metadata;
import kotlin.reflect.InterfaceC5925;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0010\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0004\b\u0005\u0010\n¨\u0006\u000b"}, m151d2 = {"Lkotlinx/serialization/modules/SerializerAlreadyRegisteredException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "", "msg", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "Lkotlin/reflect/飘花落叶言子楪世哲兰苏;", "baseClass", "concreteClass", "(Lkotlin/reflect/飘花落叶言子楪世哲兰苏;Lkotlin/reflect/飘花落叶言子楪世哲兰苏;)V", "kotlinx-serialization-core"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
final class SerializerAlreadyRegisteredException extends IllegalArgumentException {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SerializerAlreadyRegisteredException(InterfaceC5925 interfaceC5925, InterfaceC5925 interfaceC59252) {
        this("Serializer for " + interfaceC59252 + " already registered in the scope of " + interfaceC5925);
        interfaceC5925.getClass();
        interfaceC59252.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SerializerAlreadyRegisteredException(String str) {
        super(str);
        str.getClass();
    }
}
