package kotlin.time;

/* JADX INFO: compiled from: Duration.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000>\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b*\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0002\u0010&\u001a\u0018\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0010\u0010/\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u0001H\u0002\u001a\u0010\u00100\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\u0001H\u0002\u001a \u00101\u001a\u00020\u00072\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0002ø\u0001\u0000¢\u0006\u0002\u00106\u001a\u0010\u00107\u001a\u00020\u00012\u0006\u00102\u001a\u000203H\u0002\u001a)\u00108\u001a\u00020\u0005*\u0002032\u0006\u00109\u001a\u00020\u00052\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u0002050;H\u0082\b\u001a)\u0010=\u001a\u000203*\u0002032\u0006\u00109\u001a\u00020\u00052\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u0002050;H\u0082\b\u001a\u001f\u0010>\u001a\u00020\u0007*\u00020\b2\u0006\u0010?\u001a\u00020\u0007H\u0087\nø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a\u001f\u0010>\u001a\u00020\u0007*\u00020\u00052\u0006\u0010?\u001a\u00020\u0007H\u0087\nø\u0001\u0000¢\u0006\u0004\bB\u0010C\u001a\u001c\u0010D\u001a\u00020\u0007*\u00020\b2\u0006\u0010E\u001a\u00020FH\u0007ø\u0001\u0000¢\u0006\u0002\u0010G\u001a\u001c\u0010D\u001a\u00020\u0007*\u00020\u00052\u0006\u0010E\u001a\u00020FH\u0007ø\u0001\u0000¢\u0006\u0002\u0010H\u001a\u001c\u0010D\u001a\u00020\u0007*\u00020\u00012\u0006\u0010E\u001a\u00020FH\u0007ø\u0001\u0000¢\u0006\u0002\u0010I\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"!\u0010\u0006\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"!\u0010\u0006\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\r\u001a\u0004\b\u000b\u0010\u000e\"!\u0010\u0006\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010\"!\u0010\u0011\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\f\"!\u0010\u0011\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000e\"!\u0010\u0011\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0010\"!\u0010\u0014\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\f\"!\u0010\u0014\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000e\"!\u0010\u0014\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0010\"!\u0010\u0017\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\f\"!\u0010\u0017\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000e\"!\u0010\u0017\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0010\"!\u0010\u001a\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\f\"!\u0010\u001a\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u000e\"!\u0010\u001a\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001c\u0010\u0010\"!\u0010\u001d\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001e\u0010\n\u001a\u0004\b\u001f\u0010\f\"!\u0010\u001d\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001e\u0010\r\u001a\u0004\b\u001f\u0010\u000e\"!\u0010\u001d\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010\u0010\"!\u0010 \u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b!\u0010\n\u001a\u0004\b\"\u0010\f\"!\u0010 \u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b!\u0010\r\u001a\u0004\b\"\u0010\u000e\"!\u0010 \u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b!\u0010\u000f\u001a\u0004\b\"\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006J"}, m115d2 = {"MAX_MILLIS", "", "MAX_NANOS", "MAX_NANOS_IN_MILLIS", "NANOS_IN_MILLIS", "", "days", "Lkotlin/time/Duration;", "", "getDays$annotations", "(D)V", "getDays", "(D)J", "(I)V", "(I)J", "(J)V", "(J)J", "hours", "getHours$annotations", "getHours", "microseconds", "getMicroseconds$annotations", "getMicroseconds", "milliseconds", "getMilliseconds$annotations", "getMilliseconds", "minutes", "getMinutes$annotations", "getMinutes", "nanoseconds", "getNanoseconds$annotations", "getNanoseconds", "seconds", "getSeconds$annotations", "getSeconds", "durationOf", "normalValue", "unitDiscriminator", "(JI)J", "durationOfMillis", "normalMillis", "durationOfMillisNormalized", "millis", "durationOfNanos", "normalNanos", "durationOfNanosNormalized", "nanos", "millisToNanos", "nanosToMillis", "parseDuration", "value", "", "strictIso", "", "(Ljava/lang/String;Z)J", "parseOverLongIsoComponent", "skipWhile", "startIndex", "predicate", "Lkotlin/Function1;", "", "substringWhile", "times", "duration", "times-kIfJnKk", "(DJ)J", "times-mvk6XK0", "(IJ)J", "toDuration", "unit", "Lkotlin/time/DurationUnit;", "(DLkotlin/time/DurationUnit;)J", "(ILkotlin/time/DurationUnit;)J", "(JLkotlin/time/DurationUnit;)J", "kotlin-stdlib"}, m116k = 2, m117mv = {1, 9, 0}, m119xi = 48)
public final class DurationKt {
    public static final long MAX_MILLIS = 4611686018427387903L;
    public static final long MAX_NANOS = 4611686018426999999L;
    private static final long MAX_NANOS_IN_MILLIS = 4611686018426L;
    public static final int NANOS_IN_MILLIS = 1000000;

    public static final /* synthetic */ long access$durationOf(long r2, int r4) {
            long r0 = durationOf(r2, r4)
            return r0
    }

    public static final /* synthetic */ long access$durationOfMillis(long r2) {
            long r0 = durationOfMillis(r2)
            return r0
    }

    public static final /* synthetic */ long access$durationOfMillisNormalized(long r2) {
            long r0 = durationOfMillisNormalized(r2)
            return r0
    }

    public static final /* synthetic */ long access$durationOfNanos(long r2) {
            long r0 = durationOfNanos(r2)
            return r0
    }

    public static final /* synthetic */ long access$durationOfNanosNormalized(long r2) {
            long r0 = durationOfNanosNormalized(r2)
            return r0
    }

    public static final /* synthetic */ long access$millisToNanos(long r2) {
            long r0 = millisToNanos(r2)
            return r0
    }

    public static final /* synthetic */ long access$nanosToMillis(long r2) {
            long r0 = nanosToMillis(r2)
            return r0
    }

    public static final /* synthetic */ long access$parseDuration(java.lang.String r2, boolean r3) {
            long r0 = parseDuration(r2, r3)
            return r0
    }

    private static final long durationOf(long r4, int r6) {
            r0 = 1
            long r0 = r4 << r0
            long r2 = (long) r6
            long r0 = r0 + r2
            long r0 = kotlin.time.Duration.m9994constructorimpl(r0)
            return r0
    }

    private static final long durationOfMillis(long r4) {
            r0 = 1
            long r0 = r4 << r0
            r2 = 1
            long r0 = r0 + r2
            long r0 = kotlin.time.Duration.m9994constructorimpl(r0)
            return r0
    }

    private static final long durationOfMillisNormalized(long r8) {
            kotlin.ranges.LongRange r0 = new kotlin.ranges.LongRange
            r1 = -4611686018426(0xfffffbce4217d286, double:NaN)
            r3 = 4611686018426(0x431bde82d7a, double:2.2784756311107E-311)
            r0.<init>(r1, r3)
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L1e
            long r0 = millisToNanos(r8)
            long r0 = durationOfNanos(r0)
            goto L31
        L1e:
            r4 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r6 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            r2 = r8
            long r0 = kotlin.ranges.RangesKt.coerceIn(r2, r4, r6)
            long r0 = durationOfMillis(r0)
        L31:
            return r0
    }

    private static final long durationOfNanos(long r2) {
            r0 = 1
            long r0 = r2 << r0
            long r0 = kotlin.time.Duration.m9994constructorimpl(r0)
            return r0
    }

    private static final long durationOfNanosNormalized(long r5) {
            kotlin.ranges.LongRange r0 = new kotlin.ranges.LongRange
            r1 = -4611686018426999999(0xc00000000005eb41, double:-2.0000000001722644)
            r3 = 4611686018426999999(0x3ffffffffffa14bf, double:1.9999999999138678)
            r0.<init>(r1, r3)
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L1a
            long r0 = durationOfNanos(r5)
            goto L22
        L1a:
            long r0 = nanosToMillis(r5)
            long r0 = durationOfMillis(r0)
        L22:
            return r0
    }

    public static final /* synthetic */ long getDays(double r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getDays(int r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getDays(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
            long r0 = toDuration(r2, r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getDays$annotations(double r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getDays$annotations(int r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getDays$annotations(long r0) {
            return
    }

    public static final /* synthetic */ long getHours(double r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getHours(int r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getHours(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
            long r0 = toDuration(r2, r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getHours$annotations(double r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getHours$annotations(int r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getHours$annotations(long r0) {
            return
    }

    public static final /* synthetic */ long getMicroseconds(double r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getMicroseconds(int r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getMicroseconds(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMicroseconds$annotations(double r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMicroseconds$annotations(int r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMicroseconds$annotations(long r0) {
            return
    }

    public static final /* synthetic */ long getMilliseconds(double r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getMilliseconds(int r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getMilliseconds(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMilliseconds$annotations(double r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMilliseconds$annotations(int r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMilliseconds$annotations(long r0) {
            return
    }

    public static final /* synthetic */ long getMinutes(double r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getMinutes(int r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getMinutes(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
            long r0 = toDuration(r2, r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMinutes$annotations(double r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMinutes$annotations(int r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMinutes$annotations(long r0) {
            return
    }

    public static final /* synthetic */ long getNanoseconds(double r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getNanoseconds(int r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getNanoseconds(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getNanoseconds$annotations(double r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getNanoseconds$annotations(int r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getNanoseconds$annotations(long r0) {
            return
    }

    public static final /* synthetic */ long getSeconds(double r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getSeconds(int r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getSeconds(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getSeconds$annotations(double r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getSeconds$annotations(int r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getSeconds$annotations(long r0) {
            return
    }

    private static final long millisToNanos(long r2) {
            r0 = 1000000(0xf4240, float:1.401298E-39)
            long r0 = (long) r0
            long r0 = r0 * r2
            return r0
    }

    private static final long nanosToMillis(long r2) {
            r0 = 1000000(0xf4240, float:1.401298E-39)
            long r0 = (long) r0
            long r0 = r2 / r0
            return r0
    }

    private static final long parseDuration(java.lang.String r34, boolean r35) {
            r6 = r34
            int r7 = r34.length()
            if (r7 == 0) goto L3da
            r0 = 0
            kotlin.time.Duration$Companion r1 = kotlin.time.Duration.Companion
            long r8 = r1.m10097getZEROUwyO8pc()
            java.lang.String r10 = "Infinity"
            char r1 = r6.charAt(r0)
            r2 = 43
            r3 = 45
            r11 = 0
            if (r1 != r2) goto L1e
        L1c:
            r1 = 1
            goto L22
        L1e:
            if (r1 != r3) goto L21
            goto L1c
        L21:
            r1 = r11
        L22:
            if (r1 == 0) goto L26
            int r0 = r0 + 1
        L26:
            r13 = r0
            if (r13 <= 0) goto L2b
            r0 = 1
            goto L2c
        L2b:
            r0 = r11
        L2c:
            r14 = r0
            r0 = 0
            r1 = 2
            if (r14 == 0) goto L3c
            r2 = r6
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = kotlin.text.StringsKt.startsWith$default(r2, r3, r11, r1, r0)
            if (r2 == 0) goto L3c
            r2 = 1
            goto L3d
        L3c:
            r2 = r11
        L3d:
            r15 = r2
            java.lang.String r5 = "No components"
            if (r7 <= r13) goto L3d3
            char r2 = r6.charAt(r13)
            r3 = 80
            java.lang.String r4 = "this as java.lang.String).substring(startIndex)"
            java.lang.String r12 = "Unexpected order of duration components"
            r16 = r5
            java.lang.String r1 = "this as java.lang.String…ing(startIndex, endIndex)"
            java.lang.String r11 = "null cannot be cast to non-null type java.lang.String"
            if (r2 != r3) goto L1d8
            int r13 = r13 + 1
            if (r13 == r7) goto L1d2
            java.lang.String r2 = "+-."
            r3 = 0
            r16 = 0
            r19 = r16
        L60:
            if (r13 >= r7) goto L1c4
            char r0 = r6.charAt(r13)
            r5 = 84
            if (r0 != r5) goto L78
            if (r3 != 0) goto L72
            int r13 = r13 + 1
            if (r13 == r7) goto L72
            r3 = 1
            goto L60
        L72:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L78:
            r0 = r34
            r5 = 0
            r16 = r0
            r22 = 0
            r23 = r13
            r24 = r5
            r5 = r23
        L85:
            r23 = r15
            int r15 = r16.length()
            if (r5 >= r15) goto Ld3
            r25 = r14
            r15 = r16
            char r14 = r15.charAt(r5)
            r16 = 0
            r26 = r15
            kotlin.ranges.CharRange r15 = new kotlin.ranges.CharRange
            r20 = r7
            r27 = r10
            r7 = 48
            r10 = 57
            r15.<init>(r7, r10)
            boolean r15 = r15.contains(r14)
            if (r15 != 0) goto Lbd
            r15 = r2
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15
            r18 = r2
            r2 = 0
            r7 = 0
            r10 = 2
            boolean r15 = kotlin.text.StringsKt.contains$default(r15, r14, r2, r10, r7)
            if (r15 == 0) goto Lbb
            goto Lc1
        Lbb:
            r2 = 0
            goto Lc2
        Lbd:
            r18 = r2
            r7 = 0
            r10 = 2
        Lc1:
            r2 = 1
        Lc2:
            if (r2 == 0) goto Ldf
            int r5 = r5 + 1
            r2 = r18
            r7 = r20
            r15 = r23
            r14 = r25
            r16 = r26
            r10 = r27
            goto L85
        Ld3:
            r18 = r2
            r20 = r7
            r27 = r10
            r25 = r14
            r26 = r16
            r7 = 0
            r10 = 2
        Ldf:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r11)
            java.lang.String r2 = r0.substring(r13, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            r0 = r2
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 != 0) goto Lf6
            r2 = 1
            goto Lf7
        Lf6:
            r2 = 0
        Lf7:
            if (r2 != 0) goto L1be
            int r2 = r0.length()
            int r13 = r13 + r2
            r2 = r6
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r13 < 0) goto L1a1
            int r5 = kotlin.text.StringsKt.getLastIndex(r2)
            if (r13 > r5) goto L1a1
            char r2 = r2.charAt(r13)
            int r13 = r13 + 1
            kotlin.time.DurationUnit r5 = kotlin.time.DurationUnitKt.durationUnitByIsoChar(r2, r3)
            r14 = r19
            if (r14 == 0) goto L127
            r15 = r5
            java.lang.Enum r15 = (java.lang.Enum) r15
            int r15 = r14.compareTo(r15)
            if (r15 <= 0) goto L121
            goto L127
        L121:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r12)
            throw r1
        L127:
            r19 = r5
            r28 = r0
            java.lang.CharSequence r28 = (java.lang.CharSequence) r28
            r32 = 6
            r33 = 0
            r29 = 46
            r30 = 0
            r31 = 0
            int r14 = kotlin.text.StringsKt.indexOf$default(r28, r29, r30, r31, r32, r33)
            kotlin.time.DurationUnit r15 = kotlin.time.DurationUnit.SECONDS
            if (r5 != r15) goto L182
            if (r14 <= 0) goto L182
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r11)
            r15 = 0
            java.lang.String r7 = r0.substring(r15, r14)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r1)
            r15 = r11
            long r10 = parseOverLongIsoComponent(r7)
            long r10 = toDuration(r10, r5)
            long r8 = kotlin.time.Duration.m10030plusLRDsOJo(r8, r10)
            r10 = r15
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r10)
            java.lang.String r11 = r0.substring(r14)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r4)
            r24 = r1
            r15 = r2
            double r1 = java.lang.Double.parseDouble(r11)
            long r1 = toDuration(r1, r5)
            long r8 = kotlin.time.Duration.m10030plusLRDsOJo(r8, r1)
            r11 = r10
            r2 = r18
            r7 = r20
            r15 = r23
            r1 = r24
            r14 = r25
            r10 = r27
            goto L60
        L182:
            r24 = r1
            r15 = r2
            r10 = r11
            long r1 = parseOverLongIsoComponent(r0)
            long r1 = toDuration(r1, r5)
            long r8 = kotlin.time.Duration.m10030plusLRDsOJo(r8, r1)
            r11 = r10
            r2 = r18
            r7 = r20
            r15 = r23
            r1 = r24
            r14 = r25
            r10 = r27
            goto L60
        L1a1:
            r14 = r19
            r1 = r13
            r2 = 0
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Missing unit for value "
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L1be:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L1c4:
            r18 = r2
            r20 = r7
            r27 = r10
            r25 = r14
            r23 = r15
            r14 = r19
            goto L3c4
        L1d2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L1d8:
            r24 = r1
            r20 = r7
            r27 = r10
            r10 = r11
            r25 = r14
            r23 = r15
            if (r35 != 0) goto L3cd
            int r7 = r20 - r13
            int r0 = r27.length()
            int r5 = java.lang.Math.max(r7, r0)
            r7 = 1
            r3 = 0
            r11 = 48
            r0 = r34
            r14 = r24
            r1 = r13
            r2 = r27
            r15 = r4
            r4 = r5
            r21 = r8
            r9 = r16
            r8 = 57
            r5 = r7
            boolean r0 = kotlin.text.StringsKt.regionMatches(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L213
            kotlin.time.Duration$Companion r0 = kotlin.time.Duration.Companion
            long r8 = r0.m10095getINFINITEUwyO8pc()
            r7 = r20
            goto L3c4
        L213:
            r0 = 0
            r1 = 0
            if (r25 != 0) goto L219
            r2 = 1
            goto L21a
        L219:
            r2 = 0
        L21a:
            if (r25 == 0) goto L23f
            char r3 = r6.charAt(r13)
            r4 = 40
            if (r3 != r4) goto L23f
            r3 = r6
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            char r3 = kotlin.text.StringsKt.last(r3)
            r4 = 41
            if (r3 != r4) goto L23f
            r2 = 1
            int r13 = r13 + 1
            int r7 = r20 + (-1)
            if (r13 == r7) goto L239
            r3 = r21
            goto L243
        L239:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>(r9)
            throw r3
        L23f:
            r7 = r20
            r3 = r21
        L243:
            if (r13 >= r7) goto L3bf
            if (r1 == 0) goto L273
            if (r2 == 0) goto L273
            r5 = r34
            r9 = 0
            r16 = r13
            r8 = r16
        L250:
            int r11 = r5.length()
            if (r8 >= r11) goto L26e
            char r11 = r5.charAt(r8)
            r18 = 0
            r19 = r1
            r1 = 32
            if (r11 != r1) goto L264
            r1 = 1
            goto L265
        L264:
            r1 = 0
        L265:
            if (r1 == 0) goto L270
            int r8 = r8 + 1
            r1 = r19
            r11 = 48
            goto L250
        L26e:
            r19 = r1
        L270:
            r13 = r8
            goto L275
        L273:
            r19 = r1
        L275:
            r1 = 1
            r5 = r34
            r8 = 0
            r9 = r5
            r11 = 0
            r18 = r13
            r19 = r1
            r1 = r18
        L281:
            r18 = r2
            int r2 = r9.length()
            if (r1 >= r2) goto L2b7
            char r2 = r9.charAt(r1)
            r20 = 0
            kotlin.ranges.CharRange r6 = new kotlin.ranges.CharRange
            r21 = r8
            r16 = r9
            r8 = 57
            r9 = 48
            r6.<init>(r9, r8)
            boolean r6 = r6.contains(r2)
            if (r6 != 0) goto L2a9
            r6 = 46
            if (r2 != r6) goto L2a7
            goto L2a9
        L2a7:
            r2 = 0
            goto L2aa
        L2a9:
            r2 = 1
        L2aa:
            if (r2 == 0) goto L2bf
            int r1 = r1 + 1
            r6 = r34
            r9 = r16
            r2 = r18
            r8 = r21
            goto L281
        L2b7:
            r21 = r8
            r16 = r9
            r8 = 57
            r9 = 48
        L2bf:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r10)
            java.lang.String r1 = r5.substring(r13, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r14)
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 != 0) goto L2d6
            r2 = 1
            goto L2d7
        L2d6:
            r2 = 0
        L2d7:
            if (r2 != 0) goto L3b9
            int r2 = r1.length()
            int r13 = r13 + r2
            r2 = r34
            r5 = 0
            r6 = r2
            r11 = 0
            r16 = r13
            r8 = r16
        L2e7:
            int r9 = r6.length()
            if (r8 >= r9) goto L313
            char r9 = r6.charAt(r8)
            r16 = 0
            r17 = r5
            kotlin.ranges.CharRange r5 = new kotlin.ranges.CharRange
            r22 = r6
            r6 = 97
            r24 = r11
            r11 = 122(0x7a, float:1.71E-43)
            r5.<init>(r6, r11)
            boolean r5 = r5.contains(r9)
            if (r5 == 0) goto L319
            int r8 = r8 + 1
            r5 = r17
            r6 = r22
            r11 = r24
            r9 = 48
            goto L2e7
        L313:
            r17 = r5
            r22 = r6
            r24 = r11
        L319:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r10)
            java.lang.String r5 = r2.substring(r13, r8)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r14)
            r2 = r5
            int r5 = r2.length()
            int r13 = r13 + r5
            kotlin.time.DurationUnit r5 = kotlin.time.DurationUnitKt.durationUnitByShortName(r2)
            if (r0 == 0) goto L340
            r6 = r5
            java.lang.Enum r6 = (java.lang.Enum) r6
            int r6 = r0.compareTo(r6)
            if (r6 <= 0) goto L33a
            goto L340
        L33a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r12)
            throw r6
        L340:
            r0 = r5
            r28 = r1
            java.lang.CharSequence r28 = (java.lang.CharSequence) r28
            r32 = 6
            r33 = 0
            r29 = 46
            r30 = 0
            r31 = 0
            int r6 = kotlin.text.StringsKt.indexOf$default(r28, r29, r30, r31, r32, r33)
            if (r6 <= 0) goto L39c
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r10)
            r8 = 0
            java.lang.String r9 = r1.substring(r8, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r14)
            r16 = r12
            long r11 = java.lang.Long.parseLong(r9)
            long r11 = toDuration(r11, r5)
            long r3 = kotlin.time.Duration.m10030plusLRDsOJo(r3, r11)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r10)
            java.lang.String r11 = r1.substring(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r15)
            double r11 = java.lang.Double.parseDouble(r11)
            long r11 = toDuration(r11, r5)
            long r3 = kotlin.time.Duration.m10030plusLRDsOJo(r3, r11)
            if (r13 < r7) goto L394
            r8 = 57
            r11 = 48
            r6 = r34
            r12 = r16
            r2 = r18
            r1 = r19
            goto L243
        L394:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Fractional component must be last"
            r8.<init>(r10)
            throw r8
        L39c:
            r16 = r12
            r8 = 0
            long r11 = java.lang.Long.parseLong(r1)
            long r11 = toDuration(r11, r5)
            long r3 = kotlin.time.Duration.m10030plusLRDsOJo(r3, r11)
            r8 = 57
            r11 = 48
            r6 = r34
            r12 = r16
            r2 = r18
            r1 = r19
            goto L243
        L3b9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
        L3bf:
            r19 = r1
            r18 = r2
            r8 = r3
        L3c4:
            if (r23 == 0) goto L3cb
            long r0 = kotlin.time.Duration.m10047unaryMinusUwyO8pc(r8)
            goto L3cc
        L3cb:
            r0 = r8
        L3cc:
            return r0
        L3cd:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L3d3:
            r9 = r5
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r9)
            throw r0
        L3da:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The string is empty"
            r0.<init>(r1)
            throw r0
    }

    private static final long parseOverLongIsoComponent(java.lang.String r15) {
            int r0 = r15.length()
            r1 = 0
            r2 = 0
            r3 = 2
            r4 = 0
            if (r0 <= 0) goto L1a
            java.lang.String r5 = "+-"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            char r6 = r15.charAt(r4)
            boolean r5 = kotlin.text.StringsKt.contains$default(r5, r6, r4, r3, r2)
            if (r5 == 0) goto L1a
            int r1 = r1 + 1
        L1a:
            int r5 = r0 - r1
            r6 = 16
            r7 = 1
            if (r5 <= r6) goto L7b
            kotlin.ranges.IntRange r5 = new kotlin.ranges.IntRange
            r6 = r15
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r6 = kotlin.text.StringsKt.getLastIndex(r6)
            r5.<init>(r1, r6)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r6 = 0
            boolean r8 = r5 instanceof java.util.Collection
            if (r8 == 0) goto L3f
            r8 = r5
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L3f
            r5 = r7
            goto L68
        L3f:
            java.util.Iterator r8 = r5.iterator()
        L43:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L67
            r9 = r8
            kotlin.collections.IntIterator r9 = (kotlin.collections.IntIterator) r9
            int r9 = r9.nextInt()
            r10 = r9
            r11 = 0
            kotlin.ranges.CharRange r12 = new kotlin.ranges.CharRange
            r13 = 48
            r14 = 57
            r12.<init>(r13, r14)
            char r13 = r15.charAt(r10)
            boolean r10 = r12.contains(r13)
            if (r10 != 0) goto L43
            r5 = r4
            goto L68
        L67:
            r5 = r7
        L68:
            if (r5 == 0) goto L7b
            char r2 = r15.charAt(r4)
            r3 = 45
            if (r2 != r3) goto L75
            r2 = -9223372036854775808
            goto L7a
        L75:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L7a:
            return r2
        L7b:
            java.lang.String r5 = "+"
            boolean r2 = kotlin.text.StringsKt.startsWith$default(r15, r5, r4, r3, r2)
            if (r2 == 0) goto L8c
            java.lang.String r2 = kotlin.text.StringsKt.drop(r15, r7)
            long r2 = java.lang.Long.parseLong(r2)
            goto L90
        L8c:
            long r2 = java.lang.Long.parseLong(r15)
        L90:
            return r2
    }

    private static final int skipWhile(java.lang.String r3, int r4, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> r5) {
            r0 = 0
            r1 = r4
        L2:
            int r2 = r3.length()
            if (r1 >= r2) goto L1f
            char r2 = r3.charAt(r1)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L1f
            int r1 = r1 + 1
            goto L2
        L1f:
            return r1
    }

    private static final java.lang.String substringWhile(java.lang.String r5, int r6, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> r7) {
            r0 = 0
            r1 = r5
            r2 = 0
            r3 = r6
        L4:
            int r4 = r1.length()
            if (r3 >= r4) goto L21
            char r4 = r1.charAt(r3)
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            java.lang.Object r4 = r7.invoke(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L21
            int r3 = r3 + 1
            goto L4
        L21:
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r1)
            java.lang.String r1 = r5.substring(r6, r3)
            java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: times-kIfJnKk, reason: not valid java name */
    private static final long m10120timeskIfJnKk(double r2, long r4) {
            long r0 = kotlin.time.Duration.m10031timesUwyO8pc(r4, r2)
            return r0
    }

    /* JADX INFO: renamed from: times-mvk6XK0, reason: not valid java name */
    private static final long m10121timesmvk6XK0(int r2, long r3) {
            long r0 = kotlin.time.Duration.m10032timesUwyO8pc(r3, r2)
            return r0
    }

    public static final long toDuration(double r9, kotlin.time.DurationUnit r11) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            double r0 = kotlin.time.DurationUnitKt.convertDurationUnit(r9, r11, r0)
            boolean r2 = java.lang.Double.isNaN(r0)
            if (r2 != 0) goto L3f
            long r2 = kotlin.math.MathKt.roundToLong(r0)
            kotlin.ranges.LongRange r4 = new kotlin.ranges.LongRange
            r5 = -4611686018426999999(0xc00000000005eb41, double:-2.0000000001722644)
            r7 = 4611686018426999999(0x3ffffffffffa14bf, double:1.9999999999138678)
            r4.<init>(r5, r7)
            boolean r4 = r4.contains(r2)
            if (r4 == 0) goto L2f
            long r4 = durationOfNanos(r2)
            goto L3e
        L2f:
            kotlin.time.DurationUnit r4 = kotlin.time.DurationUnit.MILLISECONDS
            double r4 = kotlin.time.DurationUnitKt.convertDurationUnit(r9, r11, r4)
            long r4 = kotlin.math.MathKt.roundToLong(r4)
            long r6 = durationOfMillisNormalized(r4)
            r4 = r6
        L3e:
            return r4
        L3f:
            r2 = 0
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Duration value cannot be NaN."
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public static final long toDuration(int r3, kotlin.time.DurationUnit r4) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
            java.lang.Enum r0 = (java.lang.Enum) r0
            int r0 = r4.compareTo(r0)
            if (r0 > 0) goto L1b
            long r0 = (long) r3
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.NANOSECONDS
            long r0 = kotlin.time.DurationUnitKt.convertDurationUnitOverflow(r0, r4, r2)
            long r0 = durationOfNanos(r0)
            goto L20
        L1b:
            long r0 = (long) r3
            long r0 = toDuration(r0, r4)
        L20:
            return r0
    }

    public static final long toDuration(long r11, kotlin.time.DurationUnit r13) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = 4611686018426999999(0x3ffffffffffa14bf, double:1.9999999999138678)
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.NANOSECONDS
            long r0 = kotlin.time.DurationUnitKt.convertDurationUnitOverflow(r0, r2, r13)
            kotlin.ranges.LongRange r2 = new kotlin.ranges.LongRange
            long r3 = -r0
            r2.<init>(r3, r0)
            boolean r2 = r2.contains(r11)
            if (r2 == 0) goto L27
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.NANOSECONDS
            long r2 = kotlin.time.DurationUnitKt.convertDurationUnitOverflow(r11, r13, r2)
            long r2 = durationOfNanos(r2)
            return r2
        L27:
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.MILLISECONDS
            long r9 = kotlin.time.DurationUnitKt.convertDurationUnit(r11, r13, r2)
            r5 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r7 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            r3 = r9
            long r2 = kotlin.ranges.RangesKt.coerceIn(r3, r5, r7)
            long r2 = durationOfMillis(r2)
            return r2
    }
}
