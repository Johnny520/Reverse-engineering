package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5192;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m151d2 = {"Lkotlinx/coroutines/DispatchException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "cause", "Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;", "dispatcher", "Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;", "context", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/Throwable;Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)V", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, m152k = 1, m153mv = {2, 2, 0}, m155xi = 48)
public final class DispatchException extends Exception {
    private final Throwable cause;

    public DispatchException(Throwable th, AbstractC6264 abstractC6264, InterfaceC5192 interfaceC5192) {
        super("Coroutine dispatcher " + abstractC6264 + " threw an exception, context = " + interfaceC5192, th);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
