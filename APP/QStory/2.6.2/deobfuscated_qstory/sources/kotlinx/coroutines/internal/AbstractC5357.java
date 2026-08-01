package kotlinx.coroutines.internal;

import androidx.activity.AbstractC0053;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import net.bytebuddy.utility.JavaConstant;
import p175.AbstractC7738;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5357 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f14940 = 0;

    static {
        Object objM162;
        Object objM1622;
        Exception exc = new Exception();
        String simpleName = AbstractC7738.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), JavaConstant.Dynamic.DEFAULT_NAME, stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objM162 = Result.m8755constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            objM162 = AbstractC0053.m162(th);
        }
        if (Result.m8758exceptionOrNullimpl(objM162) != null) {
            objM162 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objM1622 = Result.m8755constructorimpl(AbstractC5357.class.getCanonicalName());
        } catch (Throwable th2) {
            objM1622 = AbstractC0053.m162(th2);
        }
        if (Result.m8758exceptionOrNullimpl(objM1622) != null) {
            objM1622 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
