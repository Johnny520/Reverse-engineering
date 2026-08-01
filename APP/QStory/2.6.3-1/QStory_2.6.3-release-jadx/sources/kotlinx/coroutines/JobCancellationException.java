package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m151d2 = {"Lkotlinx/coroutines/JobCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlinx/coroutines/飘花落叶言子楪兰苏世哲;", "", "message", "", "cause", "Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;", "job", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/Throwable;Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;)V", "fillInStackTrace", "()Ljava/lang/Throwable;", "createCopy", "()Lkotlinx/coroutines/JobCancellationException;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "_job", "Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;", "getJob$kotlinx_coroutines_core", "()Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;", "kotlinx-coroutines-core"}, m152k = 1, m153mv = {2, 2, 0}, m155xi = 48)
public final class JobCancellationException extends CancellationException implements InterfaceC6266 {
    private final transient InterfaceC6284 _job;

    public JobCancellationException(String str, Throwable th, InterfaceC6284 interfaceC6284) {
        super(str);
        this._job = interfaceC6284;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof JobCancellationException)) {
            return false;
        }
        JobCancellationException jobCancellationException = (JobCancellationException) other;
        return AbstractC5227.m9466(jobCancellationException.getMessage(), getMessage()) && AbstractC5227.m9466(jobCancellationException.getJob$kotlinx_coroutines_core(), getJob$kotlinx_coroutines_core()) && AbstractC5227.m9466(jobCancellationException.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final InterfaceC6284 getJob$kotlinx_coroutines_core() {
        InterfaceC6284 interfaceC6284 = this._job;
        return interfaceC6284 == null ? C6291.f15453 : interfaceC6284;
    }

    public int hashCode() {
        String message = getMessage();
        message.getClass();
        int iHashCode = (getJob$kotlinx_coroutines_core().hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + getJob$kotlinx_coroutines_core();
    }

    @Override // kotlinx.coroutines.InterfaceC6266
    public JobCancellationException createCopy() {
        return null;
    }
}
