package io.ktor.server.plugins;

import kotlin.Metadata;
import kotlin.reflect.InterfaceC5087;
import kotlinx.coroutines.InterfaceC5434;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/server/plugins/CannotTransformContentToTypeException;", "Lio/ktor/server/plugins/ContentTransformationException;", "Lkotlinx/coroutines/飘花落叶言子楪兰苏世哲;", "Lkotlin/reflect/飘花落叶言子世楪苏兰哲;", "type", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lkotlin/reflect/飘花落叶言子世楪苏兰哲;)V", "createCopy", "()Lio/ktor/server/plugins/CannotTransformContentToTypeException;", "Lkotlin/reflect/飘花落叶言子世楪苏兰哲;", "ktor-server-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CannotTransformContentToTypeException extends ContentTransformationException implements InterfaceC5434 {
    private final InterfaceC5087 type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CannotTransformContentToTypeException(InterfaceC5087 interfaceC5087) {
        super("Cannot transform this request's content to " + interfaceC5087);
        interfaceC5087.getClass();
        this.type = interfaceC5087;
    }

    @Override // kotlinx.coroutines.InterfaceC5434
    public CannotTransformContentToTypeException createCopy() {
        CannotTransformContentToTypeException cannotTransformContentToTypeException = new CannotTransformContentToTypeException(this.type);
        cannotTransformContentToTypeException.initCause(this);
        return cannotTransformContentToTypeException;
    }
}
