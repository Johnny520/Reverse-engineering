package kotlin.jdk7;

/* JADX INFO: compiled from: AutoCloseableJVM.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0001\u001aH\u0010\u0005\u001a\u0002H\u0006\"\n\b\u0000\u0010\u0007*\u0004\u0018\u00010\u0002\"\u0004\b\u0001\u0010\u0006*\u0002H\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u00060\tH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, m115d2 = {"closeFinally", "", "Ljava/lang/AutoCloseable;", "cause", "", "use", "R", "T", "block", "Lkotlin/Function1;", "(Ljava/lang/AutoCloseable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib-jdk7"}, m116k = 2, m117mv = {1, 9, 0}, m118pn = "kotlin", m119xi = 48)
public final class AutoCloseableKt {
    public static final void closeFinally(java.lang.AutoCloseable r1, java.lang.Throwable r2) {
            if (r1 == 0) goto L12
            if (r2 != 0) goto L9
            r1.close()
            goto L12
        L9:
            r1.close()     // Catch: java.lang.Throwable -> Le
            goto L12
        Le:
            r0 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r2, r0)
        L12:
            return
    }

    private static final <T extends java.lang.AutoCloseable, R> R use(T r3, kotlin.jvm.functions.Function1<? super T, ? extends R> r4) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            r1 = 1
            java.lang.Object r2 = r4.invoke(r3)     // Catch: java.lang.Throwable -> L17
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            closeFinally(r3, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r2
        L17:
            r2 = move-exception
            r0 = r2
            throw r2     // Catch: java.lang.Throwable -> L1b
        L1b:
            r2 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            closeFinally(r3, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r2
    }
}
