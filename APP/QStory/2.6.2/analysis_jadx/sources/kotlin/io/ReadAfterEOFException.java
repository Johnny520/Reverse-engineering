package kotlin.io;

import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\bF\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/io/ReadAfterEOFException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ReadAfterEOFException extends RuntimeException {
    public ReadAfterEOFException(String str) {
        super(str);
    }
}
