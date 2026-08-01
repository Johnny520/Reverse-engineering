package kotlin.reflect.full;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4384;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/full/NoSuchPropertyException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/Exception;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NoSuchPropertyException extends Exception {
    public /* synthetic */ NoSuchPropertyException(Exception exc, int i, AbstractC4384 abstractC4384) {
        this((i & 1) != 0 ? null : exc);
    }

    public NoSuchPropertyException(Exception exc) {
        super(exc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NoSuchPropertyException() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
