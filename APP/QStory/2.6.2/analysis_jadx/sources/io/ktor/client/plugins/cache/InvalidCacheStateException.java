package io.ktor.client.plugins.cache;

import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p236.C8092;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/client/plugins/cache/InvalidCacheStateException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲苏楪兰;", "requestUrl", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲苏楪兰;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InvalidCacheStateException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidCacheStateException(C8092 c8092) {
        super("The entry for url: " + c8092 + " was removed from cache");
        c8092.getClass();
    }
}
