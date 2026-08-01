package androidx.core.os;

/* JADX INFO: compiled from: Trace.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0005H\u0087\b¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m115d2 = {"trace", "T", "sectionName", "", "block", "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "core-ktx_release"}, m116k = 2, m117mv = {1, 8, 0}, m119xi = 48)
public final class TraceKt {
    @kotlin.Deprecated(message = "Use androidx.tracing.Trace instead", replaceWith = @kotlin.ReplaceWith(expression = "trace(sectionName, block)", imports = {"androidx.tracing.trace"}))
    public static final <T> T trace(java.lang.String r3, kotlin.jvm.functions.Function0<? extends T> r4) {
            r0 = 0
            androidx.core.os.TraceCompat.beginSection(r3)
            r1 = 1
            java.lang.Object r2 = r4.invoke()     // Catch: java.lang.Throwable -> L14
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            androidx.core.os.TraceCompat.endSection()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r2
        L14:
            r2 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            androidx.core.os.TraceCompat.endSection()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r2
    }
}
