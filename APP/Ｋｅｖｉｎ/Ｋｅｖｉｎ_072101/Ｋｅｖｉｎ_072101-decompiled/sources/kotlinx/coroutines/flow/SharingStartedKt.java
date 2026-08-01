package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, m115d2 = {"WhileSubscribed", "Lkotlinx/coroutines/flow/SharingStarted;", "Lkotlinx/coroutines/flow/SharingStarted$Companion;", "stopTimeout", "Lkotlin/time/Duration;", "replayExpiration", "WhileSubscribed-5qebJ5I", "(Lkotlinx/coroutines/flow/SharingStarted$Companion;JJ)Lkotlinx/coroutines/flow/SharingStarted;", "kotlinx-coroutines-core"}, m116k = 2, m117mv = {1, 6, 0}, m119xi = 48)
public final class SharingStartedKt {
    /* JADX INFO: renamed from: WhileSubscribed-5qebJ5I, reason: not valid java name */
    public static final kotlinx.coroutines.flow.SharingStarted m10207WhileSubscribed5qebJ5I(kotlinx.coroutines.flow.SharingStarted.Companion r5, long r6, long r8) {
            kotlinx.coroutines.flow.StartedWhileSubscribed r0 = new kotlinx.coroutines.flow.StartedWhileSubscribed
            long r1 = kotlin.time.Duration.m10012getInWholeMillisecondsimpl(r6)
            long r3 = kotlin.time.Duration.m10012getInWholeMillisecondsimpl(r8)
            r0.<init>(r1, r3)
            kotlinx.coroutines.flow.SharingStarted r0 = (kotlinx.coroutines.flow.SharingStarted) r0
            return r0
    }

    /* JADX INFO: renamed from: WhileSubscribed-5qebJ5I$default, reason: not valid java name */
    public static /* synthetic */ kotlinx.coroutines.flow.SharingStarted m10208WhileSubscribed5qebJ5I$default(kotlinx.coroutines.flow.SharingStarted.Companion r0, long r1, long r3, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto La
            kotlin.time.Duration$Companion r1 = kotlin.time.Duration.Companion
            long r1 = r1.m10097getZEROUwyO8pc()
        La:
            r5 = r5 & 2
            if (r5 == 0) goto L14
            kotlin.time.Duration$Companion r3 = kotlin.time.Duration.Companion
            long r3 = r3.m10095getINFINITEUwyO8pc()
        L14:
            kotlinx.coroutines.flow.SharingStarted r0 = m10207WhileSubscribed5qebJ5I(r0, r1, r3)
            return r0
    }
}
