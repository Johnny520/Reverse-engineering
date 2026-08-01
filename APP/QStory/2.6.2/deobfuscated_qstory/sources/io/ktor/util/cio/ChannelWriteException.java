package io.ktor.util.cio;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4384;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/util/cio/ChannelWriteException;", "Lio/ktor/util/cio/ChannelIOException;", "", "message", "", "exception", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/Throwable;)V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChannelWriteException extends ChannelIOException {
    public /* synthetic */ ChannelWriteException(String str, Throwable th, int i, AbstractC4384 abstractC4384) {
        this((i & 1) != 0 ? "Cannot write to a channel" : str, th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelWriteException(String str, Throwable th) {
        super(str, th);
        str.getClass();
        th.getClass();
    }
}
