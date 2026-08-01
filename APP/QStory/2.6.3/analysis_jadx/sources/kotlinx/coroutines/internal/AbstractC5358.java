package kotlinx.coroutines.internal;

import androidx.activity.AbstractC0053;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import net.bytebuddy.utility.JavaConstant;
import p175.AbstractC7739;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5358 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f14940 = 0;

    static {
        Object objM163;
        Object objM1632;
        Exception exc = new Exception();
        String simpleName = AbstractC7739.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), JavaConstant.Dynamic.DEFAULT_NAME, stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objM163 = Result.m8745constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            objM163 = AbstractC0053.m163(th);
        }
        if (Result.m8748exceptionOrNullimpl(objM163) != null) {
            objM163 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objM1632 = Result.m8745constructorimpl(AbstractC5358.class.getCanonicalName());
        } catch (Throwable th2) {
            objM1632 = AbstractC0053.m163(th2);
        }
        if (Result.m8748exceptionOrNullimpl(objM1632) != null) {
            objM1632 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
