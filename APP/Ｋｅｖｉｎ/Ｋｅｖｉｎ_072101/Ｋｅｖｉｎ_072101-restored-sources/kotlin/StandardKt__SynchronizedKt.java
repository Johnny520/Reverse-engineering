package kotlin;

/* JADX INFO: compiled from: Synchronized.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a:\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0005H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, m115d2 = {"synchronized", "R", "lock", "", "block", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "kotlin-stdlib"}, m116k = 5, m117mv = {1, 9, 0}, m119xi = 49, m120xs = "kotlin/StandardKt")
class StandardKt__SynchronizedKt extends kotlin.StandardKt__StandardKt {
    public StandardKt__SynchronizedKt() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    private static final <R> R m8679synchronized(java.lang.Object r3, kotlin.jvm.functions.Function0<? extends R> r4) {
            java.lang.String r0 = "lock"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            monitor-enter(r0)
            r1 = 1
            java.lang.Object r2 = r4.invoke()     // Catch: java.lang.Throwable -> L1b
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            monitor-exit(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r2
        L1b:
            r2 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            monitor-exit(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r2
    }
}
