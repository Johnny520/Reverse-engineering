package kotlin.time.jdk8;

/* JADX INFO: compiled from: DurationConversions.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u0002*\u00020\u0001H\u0087\bø\u0001\u0001¢\u0006\u0002\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0007"}, m115d2 = {"toJavaDuration", "Ljava/time/Duration;", "Lkotlin/time/Duration;", "toJavaDuration-LRDsOJo", "(J)Ljava/time/Duration;", "toKotlinDuration", "(Ljava/time/Duration;)J", "kotlin-stdlib-jdk8"}, m116k = 2, m117mv = {1, 9, 0}, m118pn = "kotlin.time", m119xi = 48)
public final class DurationConversionsJDK8Kt {
    /* JADX INFO: renamed from: toJavaDuration-LRDsOJo, reason: not valid java name */
    private static final java.time.Duration m10156toJavaDurationLRDsOJo(long r7) {
            r0 = 0
            long r1 = kotlin.time.Duration.m10015getInWholeSecondsimpl(r7)
            int r3 = kotlin.time.Duration.m10017getNanosecondsComponentimpl(r7)
            r4 = 0
            long r5 = (long) r3
            java.time.Duration r1 = java.time.Duration.ofSeconds(r1, r5)
            java.lang.String r0 = "toJavaDuration-LRDsOJo"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }

    private static final long toKotlinDuration(java.time.Duration r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            long r0 = r4.getSeconds()
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.SECONDS
            long r0 = kotlin.time.DurationKt.toDuration(r0, r2)
            int r2 = r4.getNano()
            kotlin.time.DurationUnit r3 = kotlin.time.DurationUnit.NANOSECONDS
            long r2 = kotlin.time.DurationKt.toDuration(r2, r3)
            long r0 = kotlin.time.Duration.m10030plusLRDsOJo(r0, r2)
            return r0
    }
}
