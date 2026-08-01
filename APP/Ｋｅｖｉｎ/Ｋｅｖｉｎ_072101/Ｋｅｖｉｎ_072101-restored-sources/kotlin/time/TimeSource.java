package kotlin.time;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0007"}, m115d2 = {"Lkotlin/time/TimeSource;", "", "markNow", "Lkotlin/time/TimeMark;", "Companion", "Monotonic", "WithComparableMarks", "kotlin-stdlib"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
public interface TimeSource {
    public static final kotlin.time.TimeSource.Companion Companion = null;

    /* JADX INFO: compiled from: TimeSource.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m115d2 = {"Lkotlin/time/TimeSource$Companion;", "", "()V", "kotlin-stdlib"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
    public static final class Companion {
        static final /* synthetic */ kotlin.time.TimeSource.Companion $$INSTANCE = null;

        static {
                kotlin.time.TimeSource$Companion r0 = new kotlin.time.TimeSource$Companion
                r0.<init>()
                kotlin.time.TimeSource.Companion.$$INSTANCE = r0
                return
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: compiled from: TimeSource.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\n"}, m115d2 = {"Lkotlin/time/TimeSource$Monotonic;", "Lkotlin/time/TimeSource$WithComparableMarks;", "()V", "markNow", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "markNow-z9LOYto", "()J", "toString", "", "ValueTimeMark", "kotlin-stdlib"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
    public static final class Monotonic implements kotlin.time.TimeSource.WithComparableMarks {
        public static final kotlin.time.TimeSource.Monotonic INSTANCE = null;

        /* JADX INFO: compiled from: TimeSource.kt */
        @kotlin.Metadata(m114d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0018\b\u0000\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\rH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0006J\u001a\u0010\u000f\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0001H\u0096\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\rH\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001b\u0010\u001c\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010!J\u001b\u0010#\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\rH\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(R\u0012\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004ø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006)"}, m115d2 = {"Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "Lkotlin/time/ComparableTimeMark;", "reading", "", "Lkotlin/time/ValueTimeMarkReading;", "constructor-impl", "(J)J", "compareTo", "", "other", "compareTo-6eNON_k", "(JJ)I", "elapsedNow", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "equals", "", "", "equals-impl", "(JLjava/lang/Object;)Z", "hasNotPassedNow", "hasNotPassedNow-impl", "(J)Z", "hasPassedNow", "hasPassedNow-impl", "hashCode", "hashCode-impl", "(J)I", "minus", "minus-UwyO8pc", "(JLkotlin/time/ComparableTimeMark;)J", "duration", "minus-LRDsOJo", "(JJ)J", "minus-6eNON_k", "plus", "plus-LRDsOJo", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "kotlin-stdlib"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
        @kotlin.jvm.JvmInline
        public static final class ValueTimeMark implements kotlin.time.ComparableTimeMark {
            private final long reading;

            private /* synthetic */ ValueTimeMark(long r1) {
                    r0 = this;
                    r0.<init>()
                    r0.reading = r1
                    return
            }

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ kotlin.time.TimeSource.Monotonic.ValueTimeMark m10134boximpl(long r1) {
                    kotlin.time.TimeSource$Monotonic$ValueTimeMark r0 = new kotlin.time.TimeSource$Monotonic$ValueTimeMark
                    r0.<init>(r1)
                    return r0
            }

            /* JADX INFO: renamed from: compareTo-6eNON_k, reason: not valid java name */
            public static final int m10135compareTo6eNON_k(long r4, long r6) {
                    long r0 = m10144minus6eNON_k(r4, r6)
                    kotlin.time.Duration$Companion r2 = kotlin.time.Duration.Companion
                    long r2 = r2.m10097getZEROUwyO8pc()
                    int r0 = kotlin.time.Duration.m9993compareToLRDsOJo(r0, r2)
                    return r0
            }

            /* JADX INFO: renamed from: compareTo-impl, reason: not valid java name */
            public static int m10136compareToimpl(long r1, kotlin.time.ComparableTimeMark r3) {
                    java.lang.String r0 = "other"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    kotlin.time.TimeSource$Monotonic$ValueTimeMark r0 = m10134boximpl(r1)
                    int r0 = r0.compareTo2(r3)
                    return r0
            }

            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static long m10137constructorimpl(long r0) {
                    return r0
            }

            /* JADX INFO: renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
            public static long m10138elapsedNowUwyO8pc(long r2) {
                    kotlin.time.MonotonicTimeSource r0 = kotlin.time.MonotonicTimeSource.INSTANCE
                    long r0 = r0.m10127elapsedFrom6eNON_k(r2)
                    return r0
            }

            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            public static boolean m10139equalsimpl(long r4, java.lang.Object r6) {
                    boolean r0 = r6 instanceof kotlin.time.TimeSource.Monotonic.ValueTimeMark
                    r1 = 0
                    if (r0 != 0) goto L6
                    return r1
                L6:
                    r0 = r6
                    kotlin.time.TimeSource$Monotonic$ValueTimeMark r0 = (kotlin.time.TimeSource.Monotonic.ValueTimeMark) r0
                    long r2 = r0.m10151unboximpl()
                    int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                    if (r0 == 0) goto L12
                    return r1
                L12:
                    r0 = 1
                    return r0
            }

            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m10140equalsimpl0(long r1, long r3) {
                    int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r0 != 0) goto L6
                    r0 = 1
                    goto L7
                L6:
                    r0 = 0
                L7:
                    return r0
            }

            /* JADX INFO: renamed from: hasNotPassedNow-impl, reason: not valid java name */
            public static boolean m10141hasNotPassedNowimpl(long r2) {
                    long r0 = m10138elapsedNowUwyO8pc(r2)
                    boolean r0 = kotlin.time.Duration.m10027isNegativeimpl(r0)
                    return r0
            }

            /* JADX INFO: renamed from: hasPassedNow-impl, reason: not valid java name */
            public static boolean m10142hasPassedNowimpl(long r2) {
                    long r0 = m10138elapsedNowUwyO8pc(r2)
                    boolean r0 = kotlin.time.Duration.m10027isNegativeimpl(r0)
                    r0 = r0 ^ 1
                    return r0
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m10143hashCodeimpl(long r1) {
                    int r0 = java.lang.Long.hashCode(r1)
                    return r0
            }

            /* JADX INFO: renamed from: minus-6eNON_k, reason: not valid java name */
            public static final long m10144minus6eNON_k(long r2, long r4) {
                    kotlin.time.MonotonicTimeSource r0 = kotlin.time.MonotonicTimeSource.INSTANCE
                    long r0 = r0.m10126differenceBetweenfRLX17w(r2, r4)
                    return r0
            }

            /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
            public static long m10145minusLRDsOJo(long r3, long r5) {
                    kotlin.time.MonotonicTimeSource r0 = kotlin.time.MonotonicTimeSource.INSTANCE
                    long r1 = kotlin.time.Duration.m10047unaryMinusUwyO8pc(r5)
                    long r0 = r0.m10125adjustReading6QKq23U(r3, r1)
                    return r0
            }

            /* JADX INFO: renamed from: minus-UwyO8pc, reason: not valid java name */
            public static long m10146minusUwyO8pc(long r3, kotlin.time.ComparableTimeMark r5) {
                    java.lang.String r0 = "other"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                    boolean r0 = r5 instanceof kotlin.time.TimeSource.Monotonic.ValueTimeMark
                    if (r0 == 0) goto L15
                    r0 = r5
                    kotlin.time.TimeSource$Monotonic$ValueTimeMark r0 = (kotlin.time.TimeSource.Monotonic.ValueTimeMark) r0
                    long r0 = r0.m10151unboximpl()
                    long r0 = m10144minus6eNON_k(r3, r0)
                    return r0
                L15:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Subtracting or comparing time marks from different time sources is not possible: "
                    java.lang.StringBuilder r1 = r1.append(r2)
                    java.lang.String r2 = m10148toStringimpl(r3)
                    java.lang.StringBuilder r1 = r1.append(r2)
                    java.lang.String r2 = " and "
                    java.lang.StringBuilder r1 = r1.append(r2)
                    java.lang.StringBuilder r1 = r1.append(r5)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
            public static long m10147plusLRDsOJo(long r2, long r4) {
                    kotlin.time.MonotonicTimeSource r0 = kotlin.time.MonotonicTimeSource.INSTANCE
                    long r0 = r0.m10125adjustReading6QKq23U(r2, r4)
                    return r0
            }

            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static java.lang.String m10148toStringimpl(long r2) {
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "ValueTimeMark(reading="
                    java.lang.StringBuilder r0 = r0.append(r1)
                    java.lang.StringBuilder r0 = r0.append(r2)
                    r1 = 41
                    java.lang.StringBuilder r0 = r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }

            @Override // java.lang.Comparable
            public /* bridge */ /* synthetic */ int compareTo(kotlin.time.ComparableTimeMark r2) {
                    r1 = this;
                    r0 = r2
                    kotlin.time.ComparableTimeMark r0 = (kotlin.time.ComparableTimeMark) r0
                    int r0 = r1.compareTo2(r0)
                    return r0
            }

            @Override // kotlin.time.ComparableTimeMark
            /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
            public int compareTo2(kotlin.time.ComparableTimeMark r2) {
                    r1 = this;
                    r0 = r1
                    kotlin.time.ComparableTimeMark r0 = (kotlin.time.ComparableTimeMark) r0
                    int r0 = kotlin.time.ComparableTimeMark.DefaultImpls.compareTo(r0, r2)
                    return r0
            }

            @Override // kotlin.time.TimeMark
            /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
            public long mo9984elapsedNowUwyO8pc() {
                    r2 = this;
                    long r0 = r2.reading
                    long r0 = m10138elapsedNowUwyO8pc(r0)
                    return r0
            }

            @Override // kotlin.time.ComparableTimeMark
            public boolean equals(java.lang.Object r3) {
                    r2 = this;
                    long r0 = r2.reading
                    boolean r0 = m10139equalsimpl(r0, r3)
                    return r0
            }

            @Override // kotlin.time.TimeMark
            public boolean hasNotPassedNow() {
                    r2 = this;
                    long r0 = r2.reading
                    boolean r0 = m10141hasNotPassedNowimpl(r0)
                    return r0
            }

            @Override // kotlin.time.TimeMark
            public boolean hasPassedNow() {
                    r2 = this;
                    long r0 = r2.reading
                    boolean r0 = m10142hasPassedNowimpl(r0)
                    return r0
            }

            @Override // kotlin.time.ComparableTimeMark
            public int hashCode() {
                    r2 = this;
                    long r0 = r2.reading
                    int r0 = m10143hashCodeimpl(r0)
                    return r0
            }

            /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
            public long m10149minusLRDsOJo(long r3) {
                    r2 = this;
                    long r0 = r2.reading
                    long r0 = m10145minusLRDsOJo(r0, r3)
                    return r0
            }

            @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
            /* JADX INFO: renamed from: minus-LRDsOJo */
            public /* bridge */ /* synthetic */ kotlin.time.ComparableTimeMark mo9985minusLRDsOJo(long r3) {
                    r2 = this;
                    long r0 = r2.m10149minusLRDsOJo(r3)
                    kotlin.time.TimeSource$Monotonic$ValueTimeMark r0 = m10134boximpl(r0)
                    return r0
            }

            @Override // kotlin.time.TimeMark
            /* JADX INFO: renamed from: minus-LRDsOJo */
            public /* bridge */ /* synthetic */ kotlin.time.TimeMark mo9985minusLRDsOJo(long r3) {
                    r2 = this;
                    long r0 = r2.m10149minusLRDsOJo(r3)
                    kotlin.time.TimeSource$Monotonic$ValueTimeMark r0 = m10134boximpl(r0)
                    return r0
            }

            @Override // kotlin.time.ComparableTimeMark
            /* JADX INFO: renamed from: minus-UwyO8pc */
            public long mo9986minusUwyO8pc(kotlin.time.ComparableTimeMark r3) {
                    r2 = this;
                    java.lang.String r0 = "other"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    long r0 = r2.reading
                    long r0 = m10146minusUwyO8pc(r0, r3)
                    return r0
            }

            /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
            public long m10150plusLRDsOJo(long r3) {
                    r2 = this;
                    long r0 = r2.reading
                    long r0 = m10147plusLRDsOJo(r0, r3)
                    return r0
            }

            @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
            /* JADX INFO: renamed from: plus-LRDsOJo */
            public /* bridge */ /* synthetic */ kotlin.time.ComparableTimeMark mo9987plusLRDsOJo(long r3) {
                    r2 = this;
                    long r0 = r2.m10150plusLRDsOJo(r3)
                    kotlin.time.TimeSource$Monotonic$ValueTimeMark r0 = m10134boximpl(r0)
                    return r0
            }

            @Override // kotlin.time.TimeMark
            /* JADX INFO: renamed from: plus-LRDsOJo */
            public /* bridge */ /* synthetic */ kotlin.time.TimeMark mo9987plusLRDsOJo(long r3) {
                    r2 = this;
                    long r0 = r2.m10150plusLRDsOJo(r3)
                    kotlin.time.TimeSource$Monotonic$ValueTimeMark r0 = m10134boximpl(r0)
                    return r0
            }

            public java.lang.String toString() {
                    r2 = this;
                    long r0 = r2.reading
                    java.lang.String r0 = m10148toStringimpl(r0)
                    return r0
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ long m10151unboximpl() {
                    r2 = this;
                    long r0 = r2.reading
                    return r0
            }
        }

        static {
                kotlin.time.TimeSource$Monotonic r0 = new kotlin.time.TimeSource$Monotonic
                r0.<init>()
                kotlin.time.TimeSource.Monotonic.INSTANCE = r0
                return
        }

        private Monotonic() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // kotlin.time.TimeSource.WithComparableMarks, kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ kotlin.time.ComparableTimeMark markNow() {
                r2 = this;
                long r0 = r2.m10133markNowz9LOYto()
                kotlin.time.TimeSource$Monotonic$ValueTimeMark r0 = kotlin.time.TimeSource.Monotonic.ValueTimeMark.m10134boximpl(r0)
                return r0
        }

        @Override // kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ kotlin.time.TimeMark markNow() {
                r2 = this;
                long r0 = r2.m10133markNowz9LOYto()
                kotlin.time.TimeSource$Monotonic$ValueTimeMark r0 = kotlin.time.TimeSource.Monotonic.ValueTimeMark.m10134boximpl(r0)
                return r0
        }

        /* JADX INFO: renamed from: markNow-z9LOYto, reason: not valid java name */
        public long m10133markNowz9LOYto() {
                r2 = this;
                kotlin.time.MonotonicTimeSource r0 = kotlin.time.MonotonicTimeSource.INSTANCE
                long r0 = r0.m10128markNowz9LOYto()
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                kotlin.time.MonotonicTimeSource r0 = kotlin.time.MonotonicTimeSource.INSTANCE
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: TimeSource.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m115d2 = {"Lkotlin/time/TimeSource$WithComparableMarks;", "Lkotlin/time/TimeSource;", "markNow", "Lkotlin/time/ComparableTimeMark;", "kotlin-stdlib"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
    public interface WithComparableMarks extends kotlin.time.TimeSource {
        @Override // kotlin.time.TimeSource
        kotlin.time.ComparableTimeMark markNow();
    }

    static {
            kotlin.time.TimeSource$Companion r0 = kotlin.time.TimeSource.Companion.$$INSTANCE
            kotlin.time.TimeSource.Companion = r0
            return
    }

    kotlin.time.TimeMark markNow();
}
