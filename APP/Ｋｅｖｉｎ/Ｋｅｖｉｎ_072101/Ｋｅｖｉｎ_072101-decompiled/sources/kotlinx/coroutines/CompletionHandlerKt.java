package kotlinx.coroutines;

/* JADX INFO: compiled from: CompletionHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\r\u001a\u00020\u0006*#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0080\b\":\u0010\u0000\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007*\u00020\b8À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\":\u0010\u0000\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007*\u00020\u000b8À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\f¨\u0006\u000e"}, m115d2 = {"asHandler", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "Lkotlinx/coroutines/CancelHandlerBase;", "getAsHandler", "(Lkotlinx/coroutines/CancelHandlerBase;)Lkotlin/jvm/functions/Function1;", "Lkotlinx/coroutines/CompletionHandlerBase;", "(Lkotlinx/coroutines/CompletionHandlerBase;)Lkotlin/jvm/functions/Function1;", "invokeIt", "kotlinx-coroutines-core"}, m116k = 2, m117mv = {1, 6, 0}, m119xi = 48)
public final class CompletionHandlerKt {
    public static final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> getAsHandler(kotlinx.coroutines.CancelHandlerBase r2) {
            r0 = 0
            r1 = r2
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            return r1
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> getAsHandler(kotlinx.coroutines.CompletionHandlerBase r2) {
            r0 = 0
            r1 = r2
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            return r1
    }

    public static final void invokeIt(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r1, java.lang.Throwable r2) {
            r0 = 0
            r1.invoke(r2)
            return
    }
}
