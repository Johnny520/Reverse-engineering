package kotlinx.coroutines.internal;

import androidx.activity.AbstractC0900;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import net.bytebuddy.utility.JavaConstant;
import p191.AbstractC8568;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6190 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f15285 = 0;

    static {
        Object objM723;
        Object objM7232;
        Exception exc = new Exception();
        String simpleName = AbstractC8568.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), JavaConstant.Dynamic.DEFAULT_NAME, stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objM723 = Result.m9304constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            objM723 = AbstractC0900.m723(th);
        }
        if (Result.m9307exceptionOrNullimpl(objM723) != null) {
            objM723 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objM7232 = Result.m9304constructorimpl(AbstractC6190.class.getCanonicalName());
        } catch (Throwable th2) {
            objM7232 = AbstractC0900.m723(th2);
        }
        if (Result.m9307exceptionOrNullimpl(objM7232) != null) {
            objM7232 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
