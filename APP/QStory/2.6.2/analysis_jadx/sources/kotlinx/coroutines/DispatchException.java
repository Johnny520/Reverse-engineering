package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4359;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/DispatchException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "cause", "Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;", "dispatcher", "Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;", "context", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/Throwable;Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)V", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DispatchException extends Exception {
    private final Throwable cause;

    public DispatchException(Throwable th, AbstractC5431 abstractC5431, InterfaceC4359 interfaceC4359) {
        super("Coroutine dispatcher " + abstractC5431 + " threw an exception, context = " + interfaceC4359, th);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
