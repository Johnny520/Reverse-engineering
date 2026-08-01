package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u001b\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u000e"}, m151d2 = {"Lkotlinx/coroutines/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlinx/coroutines/飘花落叶言子楪兰苏世哲;", "", "message", "Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;", "coroutine", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;)V", "(Ljava/lang/String;)V", "createCopy", "()Lkotlinx/coroutines/TimeoutCancellationException;", "Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;", "kotlinx-coroutines-core"}, m152k = 1, m153mv = {2, 2, 0}, m155xi = 48)
public final class TimeoutCancellationException extends CancellationException implements InterfaceC6266 {
    public final transient InterfaceC6284 coroutine;

    public TimeoutCancellationException(String str, InterfaceC6284 interfaceC6284) {
        super(str);
        this.coroutine = interfaceC6284;
    }

    @Override // kotlinx.coroutines.InterfaceC6266
    public TimeoutCancellationException createCopy() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(message, this.coroutine);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }

    public TimeoutCancellationException(String str) {
        this(str, null);
    }
}
