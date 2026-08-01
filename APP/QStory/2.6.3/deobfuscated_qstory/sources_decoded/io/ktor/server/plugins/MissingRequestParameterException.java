package io.ktor.server.plugins;

import kotlin.Metadata;
import kotlinx.coroutines.InterfaceC5434;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/server/plugins/MissingRequestParameterException;", "Lio/ktor/server/plugins/BadRequestException;", "Lkotlinx/coroutines/飘花落叶言子楪兰苏世哲;", "", "parameterName", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "createCopy", "()Lio/ktor/server/plugins/MissingRequestParameterException;", "Ljava/lang/String;", "getParameterName", "()Ljava/lang/String;", "ktor-server-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MissingRequestParameterException extends BadRequestException implements InterfaceC5434 {
    private final String parameterName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingRequestParameterException(String str) {
        super("Request parameter " + str + " is missing", null, 2, null);
        str.getClass();
        this.parameterName = str;
    }

    @Override // kotlinx.coroutines.InterfaceC5434
    public MissingRequestParameterException createCopy() {
        MissingRequestParameterException missingRequestParameterException = new MissingRequestParameterException(this.parameterName);
        missingRequestParameterException.initCause(this);
        return missingRequestParameterException;
    }

    public final String getParameterName() {
        return this.parameterName;
    }
}
