package io.ktor.server.application;

import kotlin.InterfaceC5168;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0017\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/server/application/DuplicateApplicationPluginException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "ktor-server-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@InterfaceC5168
public class DuplicateApplicationPluginException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DuplicateApplicationPluginException(String str) {
        super(str);
        str.getClass();
    }
}
