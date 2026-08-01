package io.ktor.server.plugins;

import kotlin.Metadata;
import kotlinx.coroutines.InterfaceC5433;
import net.bytebuddy.description.method.MethodDescription;
import p236.C8124;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/server/plugins/UnsupportedMediaTypeException;", "Lio/ktor/server/plugins/ContentTransformationException;", "Lkotlinx/coroutines/飘花落叶言子楪兰苏世哲;", "L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏世哲兰;", "contentType", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏世哲兰;)V", "createCopy", "()Lio/ktor/server/plugins/UnsupportedMediaTypeException;", "L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏世哲兰;", "ktor-server-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UnsupportedMediaTypeException extends ContentTransformationException implements InterfaceC5433 {
    private final C8124 contentType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsupportedMediaTypeException(C8124 c8124) {
        super("Content type " + c8124 + " is not supported");
        c8124.getClass();
        this.contentType = c8124;
    }

    @Override // kotlinx.coroutines.InterfaceC5433
    public UnsupportedMediaTypeException createCopy() {
        UnsupportedMediaTypeException unsupportedMediaTypeException = new UnsupportedMediaTypeException(this.contentType);
        unsupportedMediaTypeException.initCause(this);
        return unsupportedMediaTypeException;
    }
}
