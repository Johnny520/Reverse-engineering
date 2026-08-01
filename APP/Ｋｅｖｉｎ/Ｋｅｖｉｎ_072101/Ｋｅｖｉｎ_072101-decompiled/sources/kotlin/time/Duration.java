package kotlin.time;

/* JADX INFO: compiled from: Duration.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087@\u0018\u0000 ¦\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002¦\u0001B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u0003H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ\u001b\u0010I\u001a\u00020\t2\u0006\u0010J\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ\u001e\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u000fH\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ\u001e\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\tH\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bO\u0010QJ\u001b\u0010M\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ\u001a\u0010T\u001a\u00020U2\b\u0010J\u001a\u0004\u0018\u00010VHÖ\u0003¢\u0006\u0004\bW\u0010XJ\u0010\u0010Y\u001a\u00020\tHÖ\u0001¢\u0006\u0004\bZ\u0010\rJ\r\u0010[\u001a\u00020U¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020UH\u0002¢\u0006\u0004\b_\u0010]J\u000f\u0010`\u001a\u00020UH\u0002¢\u0006\u0004\ba\u0010]J\r\u0010b\u001a\u00020U¢\u0006\u0004\bc\u0010]J\r\u0010d\u001a\u00020U¢\u0006\u0004\be\u0010]J\r\u0010f\u001a\u00020U¢\u0006\u0004\bg\u0010]J\u001b\u0010h\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bi\u0010jJ\u001b\u0010k\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bl\u0010jJ\u001e\u0010m\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u000fH\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bn\u0010PJ\u001e\u0010m\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\tH\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bn\u0010QJ\u009d\u0001\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2u\u0010q\u001aq\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(u\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(v\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0rH\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010{J\u0088\u0001\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2`\u0010q\u001a\\\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(v\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0|H\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010}Js\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2K\u0010q\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0~H\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010\u007fJ`\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p27\u0010q\u001a3\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0\u0080\u0001H\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0005\bz\u0010\u0081\u0001J\u0019\u0010\u0082\u0001\u001a\u00020\u000f2\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0019\u0010\u0086\u0001\u001a\u00020\t2\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0011\u0010\u0089\u0001\u001a\u00030\u008a\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0019\u0010\u008d\u0001\u001a\u00020\u00032\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0011\u0010\u0090\u0001\u001a\u00020\u0003H\u0007¢\u0006\u0005\b\u0091\u0001\u0010\u0005J\u0011\u0010\u0092\u0001\u001a\u00020\u0003H\u0007¢\u0006\u0005\b\u0093\u0001\u0010\u0005J\u0013\u0010\u0094\u0001\u001a\u00030\u008a\u0001H\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u008c\u0001J%\u0010\u0094\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u0083\u0001\u001a\u00020=2\t\b\u0002\u0010\u0096\u0001\u001a\u00020\t¢\u0006\u0006\b\u0095\u0001\u0010\u0097\u0001J!\u0010\u0098\u0001\u001a\u00020\u00002\u0007\u0010\u0083\u0001\u001a\u00020=H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0099\u0001\u0010\u008f\u0001J\u0018\u0010\u009a\u0001\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0005\b\u009b\u0001\u0010\u0005JK\u0010\u009c\u0001\u001a\u00030\u009d\u0001*\b0\u009e\u0001j\u0003`\u009f\u00012\u0007\u0010 \u0001\u001a\u00020\t2\u0007\u0010¡\u0001\u001a\u00020\t2\u0007\u0010¢\u0001\u001a\u00020\t2\b\u0010\u0083\u0001\u001a\u00030\u008a\u00012\u0007\u0010£\u0001\u001a\u00020UH\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001R\u0017\u0010\u0006\u001a\u00020\u00008Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001c\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\u0012R\u001a\u0010\u001f\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\u0012R\u001a\u0010\"\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\u000b\u001a\u0004\b$\u0010\u0012R\u0011\u0010%\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010\u0005R\u0011\u0010'\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b(\u0010\u0005R\u0011\u0010)\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b*\u0010\u0005R\u0011\u0010+\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b,\u0010\u0005R\u0011\u0010-\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b.\u0010\u0005R\u0011\u0010/\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b0\u0010\u0005R\u0011\u00101\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b2\u0010\u0005R\u001a\u00103\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b4\u0010\u000b\u001a\u0004\b5\u0010\rR\u001a\u00106\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b7\u0010\u000b\u001a\u0004\b8\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00109\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b:\u0010\u000b\u001a\u0004\b;\u0010\rR\u0014\u0010<\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0015\u0010@\u001a\u00020\t8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\rR\u0014\u0010B\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u0005\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u009920\u0001¨\u0006§\u0001"}, m115d2 = {"Lkotlin/time/Duration;", "", "rawValue", "", "constructor-impl", "(J)J", "absoluteValue", "getAbsoluteValue-UwyO8pc", "hoursComponent", "", "getHoursComponent$annotations", "()V", "getHoursComponent-impl", "(J)I", "inDays", "", "getInDays$annotations", "getInDays-impl", "(J)D", "inHours", "getInHours$annotations", "getInHours-impl", "inMicroseconds", "getInMicroseconds$annotations", "getInMicroseconds-impl", "inMilliseconds", "getInMilliseconds$annotations", "getInMilliseconds-impl", "inMinutes", "getInMinutes$annotations", "getInMinutes-impl", "inNanoseconds", "getInNanoseconds$annotations", "getInNanoseconds-impl", "inSeconds", "getInSeconds$annotations", "getInSeconds-impl", "inWholeDays", "getInWholeDays-impl", "inWholeHours", "getInWholeHours-impl", "inWholeMicroseconds", "getInWholeMicroseconds-impl", "inWholeMilliseconds", "getInWholeMilliseconds-impl", "inWholeMinutes", "getInWholeMinutes-impl", "inWholeNanoseconds", "getInWholeNanoseconds-impl", "inWholeSeconds", "getInWholeSeconds-impl", "minutesComponent", "getMinutesComponent$annotations", "getMinutesComponent-impl", "nanosecondsComponent", "getNanosecondsComponent$annotations", "getNanosecondsComponent-impl", "secondsComponent", "getSecondsComponent$annotations", "getSecondsComponent-impl", "storageUnit", "Lkotlin/time/DurationUnit;", "getStorageUnit-impl", "(J)Lkotlin/time/DurationUnit;", "unitDiscriminator", "getUnitDiscriminator-impl", "value", "getValue-impl", "addValuesMixedRanges", "thisMillis", "otherNanos", "addValuesMixedRanges-UwyO8pc", "(JJJ)J", "compareTo", "other", "compareTo-LRDsOJo", "(JJ)I", "div", "scale", "div-UwyO8pc", "(JD)J", "(JI)J", "div-LRDsOJo", "(JJ)D", "equals", "", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "isFinite", "isFinite-impl", "(J)Z", "isInMillis", "isInMillis-impl", "isInNanos", "isInNanos-impl", "isInfinite", "isInfinite-impl", "isNegative", "isNegative-impl", "isPositive", "isPositive-impl", "minus", "minus-LRDsOJo", "(JJ)J", "plus", "plus-LRDsOJo", "times", "times-UwyO8pc", "toComponents", "T", "action", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "days", "hours", "minutes", "seconds", "nanoseconds", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "toDouble", "unit", "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toInt", "toInt-impl", "(JLkotlin/time/DurationUnit;)I", "toIsoString", "", "toIsoString-impl", "(J)Ljava/lang/String;", "toLong", "toLong-impl", "(JLkotlin/time/DurationUnit;)J", "toLongMilliseconds", "toLongMilliseconds-impl", "toLongNanoseconds", "toLongNanoseconds-impl", "toString", "toString-impl", "decimals", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "truncateTo", "truncateTo-UwyO8pc$kotlin_stdlib", "unaryMinus", "unaryMinus-UwyO8pc", "appendFractional", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "appendFractional-impl", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "Companion", "kotlin-stdlib"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
@kotlin.jvm.JvmInline
public final class Duration implements java.lang.Comparable<kotlin.time.Duration> {
    public static final kotlin.time.Duration.Companion Companion = null;
    private static final long INFINITE = 0;
    private static final long NEG_INFINITE = 0;
    private static final long ZERO = 0;
    private final long rawValue;

    /* JADX INFO: compiled from: Duration.kt */
    @kotlin.Metadata(m114d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-H\u0007J\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0011J\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0014J\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0011J\u001d\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0011J\u001d\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0014J\u001d\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0017J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0011J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0014J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0017J\u001d\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0011J\u001d\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0014J\u001d\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0017J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0011J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0014J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0017J\u001b\u00105\u001a\u00020\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u00020\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b:\u00108J\u001b\u0010;\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b<J\u001b\u0010=\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b>J\u001d\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0011J\u001d\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0014J\u001d\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0017R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R%\u0010\f\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R%\u0010\f\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014R%\u0010\f\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017R%\u0010\u0018\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R%\u0010\u0018\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0014R%\u0010\u0018\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0017R%\u0010\u001b\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011R%\u0010\u001b\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0014R%\u0010\u001b\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0017R%\u0010\u001e\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001f\u0010\u000f\u001a\u0004\b \u0010\u0011R%\u0010\u001e\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0014R%\u0010\u001e\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0017R%\u0010!\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\"\u0010\u000f\u001a\u0004\b#\u0010\u0011R%\u0010!\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0014R%\u0010!\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0017R%\u0010$\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b%\u0010\u000f\u001a\u0004\b&\u0010\u0011R%\u0010$\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b%\u0010\u0013\u001a\u0004\b&\u0010\u0014R%\u0010$\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0017R%\u0010'\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b(\u0010\u000f\u001a\u0004\b)\u0010\u0011R%\u0010'\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b(\u0010\u0013\u001a\u0004\b)\u0010\u0014R%\u0010'\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0017\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006@"}, m115d2 = {"Lkotlin/time/Duration$Companion;", "", "()V", "INFINITE", "Lkotlin/time/Duration;", "getINFINITE-UwyO8pc", "()J", "J", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "ZERO", "getZERO-UwyO8pc", "days", "", "getDays-UwyO8pc$annotations", "(D)V", "getDays-UwyO8pc", "(D)J", "", "(I)V", "(I)J", "", "(J)V", "(J)J", "hours", "getHours-UwyO8pc$annotations", "getHours-UwyO8pc", "microseconds", "getMicroseconds-UwyO8pc$annotations", "getMicroseconds-UwyO8pc", "milliseconds", "getMilliseconds-UwyO8pc$annotations", "getMilliseconds-UwyO8pc", "minutes", "getMinutes-UwyO8pc$annotations", "getMinutes-UwyO8pc", "nanoseconds", "getNanoseconds-UwyO8pc$annotations", "getNanoseconds-UwyO8pc", "seconds", "getSeconds-UwyO8pc$annotations", "getSeconds-UwyO8pc", "convert", "value", "sourceUnit", "Lkotlin/time/DurationUnit;", "targetUnit", "days-UwyO8pc", "hours-UwyO8pc", "microseconds-UwyO8pc", "milliseconds-UwyO8pc", "minutes-UwyO8pc", "nanoseconds-UwyO8pc", "parse", "", "parse-UwyO8pc", "(Ljava/lang/String;)J", "parseIsoString", "parseIsoString-UwyO8pc", "parseIsoStringOrNull", "parseIsoStringOrNull-FghU774", "parseOrNull", "parseOrNull-FghU774", "seconds-UwyO8pc", "kotlin-stdlib"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m10050getDaysUwyO8pc(double r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m10051getDaysUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m10052getDaysUwyO8pc(long r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10053getDaysUwyO8pc$annotations(double r0) {
                return
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10054getDaysUwyO8pc$annotations(int r0) {
                return
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10055getDaysUwyO8pc$annotations(long r0) {
                return
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m10056getHoursUwyO8pc(double r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m10057getHoursUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m10058getHoursUwyO8pc(long r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10059getHoursUwyO8pc$annotations(double r0) {
                return
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10060getHoursUwyO8pc$annotations(int r0) {
                return
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10061getHoursUwyO8pc$annotations(long r0) {
                return
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m10062getMicrosecondsUwyO8pc(double r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m10063getMicrosecondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m10064getMicrosecondsUwyO8pc(long r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10065getMicrosecondsUwyO8pc$annotations(double r0) {
                return
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10066getMicrosecondsUwyO8pc$annotations(int r0) {
                return
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10067getMicrosecondsUwyO8pc$annotations(long r0) {
                return
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m10068getMillisecondsUwyO8pc(double r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m10069getMillisecondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m10070getMillisecondsUwyO8pc(long r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10071getMillisecondsUwyO8pc$annotations(double r0) {
                return
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10072getMillisecondsUwyO8pc$annotations(int r0) {
                return
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10073getMillisecondsUwyO8pc$annotations(long r0) {
                return
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m10074getMinutesUwyO8pc(double r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m10075getMinutesUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m10076getMinutesUwyO8pc(long r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10077getMinutesUwyO8pc$annotations(double r0) {
                return
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10078getMinutesUwyO8pc$annotations(int r0) {
                return
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10079getMinutesUwyO8pc$annotations(long r0) {
                return
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m10080getNanosecondsUwyO8pc(double r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m10081getNanosecondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m10082getNanosecondsUwyO8pc(long r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10083getNanosecondsUwyO8pc$annotations(double r0) {
                return
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10084getNanosecondsUwyO8pc$annotations(int r0) {
                return
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10085getNanosecondsUwyO8pc$annotations(long r0) {
                return
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m10086getSecondsUwyO8pc(double r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m10087getSecondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m10088getSecondsUwyO8pc(long r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10089getSecondsUwyO8pc$annotations(double r0) {
                return
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10090getSecondsUwyO8pc$annotations(int r0) {
                return
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10091getSecondsUwyO8pc$annotations(long r0) {
                return
        }

        public final double convert(double r3, kotlin.time.DurationUnit r5, kotlin.time.DurationUnit r6) {
                r2 = this;
                java.lang.String r0 = "sourceUnit"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "targetUnit"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                double r0 = kotlin.time.DurationUnitKt.convertDurationUnit(r3, r5, r6)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10092daysUwyO8pc(double r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10093daysUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10094daysUwyO8pc(long r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m10095getINFINITEUwyO8pc() {
                r2 = this;
                long r0 = kotlin.time.Duration.access$getINFINITE$cp()
                return r0
        }

        /* JADX INFO: renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m10096getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
                r2 = this;
                long r0 = kotlin.time.Duration.access$getNEG_INFINITE$cp()
                return r0
        }

        /* JADX INFO: renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m10097getZEROUwyO8pc() {
                r2 = this;
                long r0 = kotlin.time.Duration.access$getZERO$cp()
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10098hoursUwyO8pc(double r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10099hoursUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10100hoursUwyO8pc(long r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10101microsecondsUwyO8pc(double r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10102microsecondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10103microsecondsUwyO8pc(long r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10104millisecondsUwyO8pc(double r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10105millisecondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10106millisecondsUwyO8pc(long r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10107minutesUwyO8pc(double r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10108minutesUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10109minutesUwyO8pc(long r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10110nanosecondsUwyO8pc(double r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10111nanosecondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10112nanosecondsUwyO8pc(long r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: parse-UwyO8pc, reason: not valid java name */
        public final long m10113parseUwyO8pc(java.lang.String r5) {
                r4 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = 0
                long r0 = kotlin.time.DurationKt.access$parseDuration(r5, r0)     // Catch: java.lang.IllegalArgumentException -> Lc
                return r0
            Lc:
                r0 = move-exception
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Invalid duration string format: '"
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r5)
                java.lang.String r3 = "'."
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r3 = r0
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                r1.<init>(r2, r3)
                throw r1
        }

        /* JADX INFO: renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m10114parseIsoStringUwyO8pc(java.lang.String r5) {
                r4 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = 1
                long r0 = kotlin.time.DurationKt.access$parseDuration(r5, r0)     // Catch: java.lang.IllegalArgumentException -> Lc
                return r0
            Lc:
                r0 = move-exception
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Invalid ISO duration string format: '"
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r5)
                java.lang.String r3 = "'."
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r3 = r0
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                r1.<init>(r2, r3)
                throw r1
        }

        /* JADX INFO: renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
        public final kotlin.time.Duration m10115parseIsoStringOrNullFghU774(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 1
                long r0 = kotlin.time.DurationKt.access$parseDuration(r3, r0)     // Catch: java.lang.IllegalArgumentException -> L10
                kotlin.time.Duration r0 = kotlin.time.Duration.m9992boximpl(r0)     // Catch: java.lang.IllegalArgumentException -> L10
                goto L13
            L10:
                r0 = move-exception
                r1 = 0
                r0 = r1
            L13:
                return r0
        }

        /* JADX INFO: renamed from: parseOrNull-FghU774, reason: not valid java name */
        public final kotlin.time.Duration m10116parseOrNullFghU774(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 0
                long r0 = kotlin.time.DurationKt.access$parseDuration(r3, r0)     // Catch: java.lang.IllegalArgumentException -> L10
                kotlin.time.Duration r0 = kotlin.time.Duration.m9992boximpl(r0)     // Catch: java.lang.IllegalArgumentException -> L10
                goto L13
            L10:
                r0 = move-exception
                r1 = 0
                r0 = r1
            L13:
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10117secondsUwyO8pc(double r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10118secondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10119secondsUwyO8pc(long r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }
    }

    static {
            kotlin.time.Duration$Companion r0 = new kotlin.time.Duration$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.time.Duration.Companion = r0
            r0 = 0
            long r0 = m9994constructorimpl(r0)
            kotlin.time.Duration.ZERO = r0
            r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r0 = kotlin.time.DurationKt.access$durationOfMillis(r0)
            kotlin.time.Duration.INFINITE = r0
            r0 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            long r0 = kotlin.time.DurationKt.access$durationOfMillis(r0)
            kotlin.time.Duration.NEG_INFINITE = r0
            return
    }

    private /* synthetic */ Duration(long r1) {
            r0 = this;
            r0.<init>()
            r0.rawValue = r1
            return
    }

    public static final /* synthetic */ long access$getINFINITE$cp() {
            long r0 = kotlin.time.Duration.INFINITE
            return r0
    }

    public static final /* synthetic */ long access$getNEG_INFINITE$cp() {
            long r0 = kotlin.time.Duration.NEG_INFINITE
            return r0
    }

    public static final /* synthetic */ long access$getZERO$cp() {
            long r0 = kotlin.time.Duration.ZERO
            return r0
    }

    /* JADX INFO: renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    private static final long m9990addValuesMixedRangesUwyO8pc(long r10, long r12, long r14) {
            long r0 = kotlin.time.DurationKt.access$nanosToMillis(r14)
            long r8 = r12 + r0
            kotlin.ranges.LongRange r2 = new kotlin.ranges.LongRange
            r3 = -4611686018426(0xfffffbce4217d286, double:NaN)
            r5 = 4611686018426(0x431bde82d7a, double:2.2784756311107E-311)
            r2.<init>(r3, r5)
            boolean r2 = r2.contains(r8)
            if (r2 == 0) goto L2b
            long r2 = kotlin.time.DurationKt.access$millisToNanos(r0)
            long r2 = r14 - r2
            long r4 = kotlin.time.DurationKt.access$millisToNanos(r8)
            long r4 = r4 + r2
            long r2 = kotlin.time.DurationKt.access$durationOfNanos(r4)
            goto L3e
        L2b:
            r4 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r6 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            r2 = r8
            long r2 = kotlin.ranges.RangesKt.coerceIn(r2, r4, r6)
            long r2 = kotlin.time.DurationKt.access$durationOfMillis(r2)
        L3e:
            return r2
    }

    /* JADX INFO: renamed from: appendFractional-impl, reason: not valid java name */
    private static final void m9991appendFractionalimpl(long r13, java.lang.StringBuilder r15, int r16, int r17, int r18, java.lang.String r19, boolean r20) {
            r0 = r15
            r15.append(r16)
            if (r17 == 0) goto L5b
            r1 = 46
            r15.append(r1)
            java.lang.String r1 = java.lang.String.valueOf(r17)
            r2 = 48
            r3 = r18
            java.lang.String r1 = kotlin.text.StringsKt.padStart(r1, r3, r2)
            r4 = r1
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r5 = 0
            int r6 = r4.length()
            r7 = -1
            int r6 = r6 + r7
            r8 = 1
            r9 = 0
            if (r6 < 0) goto L37
        L25:
            r10 = r6
            int r6 = r6 + r7
            char r11 = r4.charAt(r10)
            r12 = 0
            if (r11 == r2) goto L30
            r11 = r8
            goto L31
        L30:
            r11 = r9
        L31:
            if (r11 == 0) goto L35
            r7 = r10
            goto L38
        L35:
            if (r6 >= 0) goto L25
        L37:
        L38:
            int r7 = r7 + r8
            java.lang.String r2 = "this.append(value, startIndex, endIndex)"
            r4 = 3
            if (r20 != 0) goto L4c
            if (r7 >= r4) goto L4c
            r4 = r1
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.StringBuilder r4 = r15.append(r4, r9, r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r2)
            goto L5d
        L4c:
            r5 = r1
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            int r6 = r7 + 2
            int r6 = r6 / r4
            int r6 = r6 * r4
            java.lang.StringBuilder r4 = r15.append(r5, r9, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r2)
            goto L5d
        L5b:
            r3 = r18
        L5d:
            r1 = r19
            r15.append(r1)
            return
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlin.time.Duration m9992boximpl(long r1) {
            kotlin.time.Duration r0 = new kotlin.time.Duration
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m9993compareToLRDsOJo(long r5, long r7) {
            long r0 = r5 ^ r7
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L21
            int r2 = (int) r0
            r2 = r2 & 1
            if (r2 != 0) goto Le
            goto L21
        Le:
            r2 = 0
            int r3 = (int) r5
            r2 = r3 & 1
            r3 = 0
            int r4 = (int) r7
            r3 = r4 & 1
            int r2 = r2 - r3
            boolean r3 = m10027isNegativeimpl(r5)
            if (r3 == 0) goto L1f
            int r3 = -r2
            goto L20
        L1f:
            r3 = r2
        L20:
            return r3
        L21:
            int r2 = kotlin.jvm.internal.Intrinsics.compare(r5, r7)
            return r2
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m9994constructorimpl(long r5) {
            boolean r0 = kotlin.time.DurationJvmKt.getDurationAssertionsEnabled()
            if (r0 == 0) goto Lb1
            boolean r0 = m10025isInNanosimpl(r5)
            if (r0 == 0) goto L44
            kotlin.ranges.LongRange r0 = new kotlin.ranges.LongRange
            r1 = -4611686018426999999(0xc00000000005eb41, double:-2.0000000001722644)
            r3 = 4611686018426999999(0x3ffffffffffa14bf, double:1.9999999999138678)
            r0.<init>(r1, r3)
            long r1 = m10021getValueimpl(r5)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L27
            goto Lb1
        L27:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r2 = m10021getValueimpl(r5)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " ns is out of nanoseconds range"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L44:
            kotlin.ranges.LongRange r0 = new kotlin.ranges.LongRange
            r1 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r3 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            r0.<init>(r1, r3)
            long r1 = m10021getValueimpl(r5)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L94
            kotlin.ranges.LongRange r0 = new kotlin.ranges.LongRange
            r1 = -4611686018426(0xfffffbce4217d286, double:NaN)
            r3 = 4611686018426(0x431bde82d7a, double:2.2784756311107E-311)
            r0.<init>(r1, r3)
            long r1 = m10021getValueimpl(r5)
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L77
            goto Lb1
        L77:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r2 = m10021getValueimpl(r5)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " ms is denormalized"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L94:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r2 = m10021getValueimpl(r5)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " ms is out of milliseconds range"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lb1:
            return r5
    }

    /* JADX INFO: renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m9995divLRDsOJo(long r5, long r7) {
            kotlin.time.DurationUnit r0 = m10019getStorageUnitimpl(r5)
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            kotlin.time.DurationUnit r1 = m10019getStorageUnitimpl(r7)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Comparable r0 = kotlin.comparisons.ComparisonsKt.maxOf(r0, r1)
            kotlin.time.DurationUnit r0 = (kotlin.time.DurationUnit) r0
            double r1 = m10037toDoubleimpl(r5, r0)
            double r3 = m10037toDoubleimpl(r7, r0)
            double r1 = r1 / r3
            return r1
    }

    /* JADX INFO: renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m9996divUwyO8pc(long r6, double r8) {
            int r0 = kotlin.math.MathKt.roundToInt(r8)
            double r1 = (double) r0
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 != 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 == 0) goto L15
            if (r0 == 0) goto L15
            long r1 = m9997divUwyO8pc(r6, r0)
            return r1
        L15:
            kotlin.time.DurationUnit r1 = m10019getStorageUnitimpl(r6)
            double r2 = m10037toDoubleimpl(r6, r1)
            double r2 = r2 / r8
            long r4 = kotlin.time.DurationKt.toDuration(r2, r1)
            return r4
    }

    /* JADX INFO: renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m9997divUwyO8pc(long r7, int r9) {
            if (r9 != 0) goto L1d
        L3:
            boolean r0 = m10028isPositiveimpl(r7)
            if (r0 == 0) goto Lc
            long r0 = kotlin.time.Duration.INFINITE
            goto L14
        Lc:
            boolean r0 = m10027isNegativeimpl(r7)
            if (r0 == 0) goto L15
            long r0 = kotlin.time.Duration.NEG_INFINITE
        L14:
            return r0
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Dividing zero duration by zero yields an undefined result."
            r0.<init>(r1)
            throw r0
        L1d:
            boolean r0 = m10025isInNanosimpl(r7)
            if (r0 == 0) goto L2e
            long r0 = m10021getValueimpl(r7)
            long r2 = (long) r9
            long r0 = r0 / r2
            long r0 = kotlin.time.DurationKt.access$durationOfNanos(r0)
            return r0
        L2e:
            boolean r0 = m10026isInfiniteimpl(r7)
            if (r0 == 0) goto L3d
            int r0 = kotlin.math.MathKt.getSign(r9)
            long r0 = m10032timesUwyO8pc(r7, r0)
            return r0
        L3d:
            long r0 = m10021getValueimpl(r7)
            long r2 = (long) r9
            long r0 = r0 / r2
            kotlin.ranges.LongRange r2 = new kotlin.ranges.LongRange
            r3 = -4611686018426(0xfffffbce4217d286, double:NaN)
            r5 = 4611686018426(0x431bde82d7a, double:2.2784756311107E-311)
            r2.<init>(r3, r5)
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L6f
            long r2 = m10021getValueimpl(r7)
            long r4 = (long) r9
            long r4 = r4 * r0
            long r2 = r2 - r4
            long r2 = kotlin.time.DurationKt.access$millisToNanos(r2)
            long r4 = (long) r9
            long r2 = r2 / r4
            long r4 = kotlin.time.DurationKt.access$millisToNanos(r0)
            long r4 = r4 + r2
            long r4 = kotlin.time.DurationKt.access$durationOfNanos(r4)
            return r4
        L6f:
            long r2 = kotlin.time.DurationKt.access$durationOfMillis(r0)
            return r2
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m9998equalsimpl(long r4, java.lang.Object r6) {
            boolean r0 = r6 instanceof kotlin.time.Duration
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r6
            kotlin.time.Duration r0 = (kotlin.time.Duration) r0
            long r2 = r0.m10049unboximpl()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L12
            return r1
        L12:
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9999equalsimpl0(long r1, long r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* JADX INFO: renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m10000getAbsoluteValueUwyO8pc(long r2) {
            boolean r0 = m10027isNegativeimpl(r2)
            if (r0 == 0) goto Lb
            long r0 = m10047unaryMinusUwyO8pc(r2)
            goto Lc
        Lb:
            r0 = r2
        Lc:
            return r0
    }

    public static /* synthetic */ void getHoursComponent$annotations() {
            return
    }

    /* JADX INFO: renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m10001getHoursComponentimpl(long r4) {
            boolean r0 = m10026isInfiniteimpl(r4)
            if (r0 == 0) goto L8
            r0 = 0
            goto L11
        L8:
            long r0 = m10010getInWholeHoursimpl(r4)
            r2 = 24
            long r2 = (long) r2
            long r0 = r0 % r2
            int r0 = (int) r0
        L11:
            return r0
    }

    @kotlin.Deprecated(message = "Use inWholeDays property instead or convert toDouble(DAYS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.DAYS)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInDays$annotations() {
            return
    }

    /* JADX INFO: renamed from: getInDays-impl, reason: not valid java name */
    public static final /* synthetic */ double m10002getInDaysimpl(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
            double r0 = m10037toDoubleimpl(r2, r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use inWholeHours property instead or convert toDouble(HOURS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.HOURS)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInHours$annotations() {
            return
    }

    /* JADX INFO: renamed from: getInHours-impl, reason: not valid java name */
    public static final /* synthetic */ double m10003getInHoursimpl(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
            double r0 = m10037toDoubleimpl(r2, r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use inWholeMicroseconds property instead or convert toDouble(MICROSECONDS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.MICROSECONDS)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInMicroseconds$annotations() {
            return
    }

    /* JADX INFO: renamed from: getInMicroseconds-impl, reason: not valid java name */
    public static final /* synthetic */ double m10004getInMicrosecondsimpl(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
            double r0 = m10037toDoubleimpl(r2, r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use inWholeMilliseconds property instead or convert toDouble(MILLISECONDS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.MILLISECONDS)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInMilliseconds$annotations() {
            return
    }

    /* JADX INFO: renamed from: getInMilliseconds-impl, reason: not valid java name */
    public static final /* synthetic */ double m10005getInMillisecondsimpl(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            double r0 = m10037toDoubleimpl(r2, r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use inWholeMinutes property instead or convert toDouble(MINUTES) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.MINUTES)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInMinutes$annotations() {
            return
    }

    /* JADX INFO: renamed from: getInMinutes-impl, reason: not valid java name */
    public static final /* synthetic */ double m10006getInMinutesimpl(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
            double r0 = m10037toDoubleimpl(r2, r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use inWholeNanoseconds property instead or convert toDouble(NANOSECONDS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.NANOSECONDS)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInNanoseconds$annotations() {
            return
    }

    /* JADX INFO: renamed from: getInNanoseconds-impl, reason: not valid java name */
    public static final /* synthetic */ double m10007getInNanosecondsimpl(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            double r0 = m10037toDoubleimpl(r2, r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use inWholeSeconds property instead or convert toDouble(SECONDS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.SECONDS)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInSeconds$annotations() {
            return
    }

    /* JADX INFO: renamed from: getInSeconds-impl, reason: not valid java name */
    public static final /* synthetic */ double m10008getInSecondsimpl(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
            double r0 = m10037toDoubleimpl(r2, r0)
            return r0
    }

    /* JADX INFO: renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m10009getInWholeDaysimpl(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
            long r0 = m10040toLongimpl(r2, r0)
            return r0
    }

    /* JADX INFO: renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m10010getInWholeHoursimpl(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
            long r0 = m10040toLongimpl(r2, r0)
            return r0
    }

    /* JADX INFO: renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m10011getInWholeMicrosecondsimpl(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
            long r0 = m10040toLongimpl(r2, r0)
            return r0
    }

    /* JADX INFO: renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m10012getInWholeMillisecondsimpl(long r2) {
            boolean r0 = m10024isInMillisimpl(r2)
            if (r0 == 0) goto L11
            boolean r0 = m10023isFiniteimpl(r2)
            if (r0 == 0) goto L11
            long r0 = m10021getValueimpl(r2)
            goto L17
        L11:
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            long r0 = m10040toLongimpl(r2, r0)
        L17:
            return r0
    }

    /* JADX INFO: renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m10013getInWholeMinutesimpl(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
            long r0 = m10040toLongimpl(r2, r0)
            return r0
    }

    /* JADX INFO: renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m10014getInWholeNanosecondsimpl(long r4) {
            long r0 = m10021getValueimpl(r4)
            boolean r2 = m10025isInNanosimpl(r4)
            if (r2 == 0) goto Ld
            r2 = r0
            goto L2c
        Ld:
            r2 = 9223372036854(0x8637bd05af6, double:4.5569512622224E-311)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L1c
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L2c
        L1c:
            r2 = -9223372036854(0xfffff79c842fa50a, double:NaN)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L28
            r2 = -9223372036854775808
            goto L2c
        L28:
            long r2 = kotlin.time.DurationKt.access$millisToNanos(r0)
        L2c:
            return r2
    }

    /* JADX INFO: renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m10015getInWholeSecondsimpl(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
            long r0 = m10040toLongimpl(r2, r0)
            return r0
    }

    public static /* synthetic */ void getMinutesComponent$annotations() {
            return
    }

    /* JADX INFO: renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m10016getMinutesComponentimpl(long r4) {
            boolean r0 = m10026isInfiniteimpl(r4)
            if (r0 == 0) goto L8
            r0 = 0
            goto L11
        L8:
            long r0 = m10013getInWholeMinutesimpl(r4)
            r2 = 60
            long r2 = (long) r2
            long r0 = r0 % r2
            int r0 = (int) r0
        L11:
            return r0
    }

    public static /* synthetic */ void getNanosecondsComponent$annotations() {
            return
    }

    /* JADX INFO: renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m10017getNanosecondsComponentimpl(long r4) {
            boolean r0 = m10026isInfiniteimpl(r4)
            if (r0 == 0) goto L9
            r0 = 0
            goto L27
        L9:
            boolean r0 = m10024isInMillisimpl(r4)
            if (r0 == 0) goto L1d
            long r0 = m10021getValueimpl(r4)
            r2 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r2
            long r0 = r0 % r2
            long r0 = kotlin.time.DurationKt.access$millisToNanos(r0)
            int r0 = (int) r0
            goto L27
        L1d:
            long r0 = m10021getValueimpl(r4)
            r2 = 1000000000(0x3b9aca00, float:0.0047237873)
            long r2 = (long) r2
            long r0 = r0 % r2
            int r0 = (int) r0
        L27:
            return r0
    }

    public static /* synthetic */ void getSecondsComponent$annotations() {
            return
    }

    /* JADX INFO: renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m10018getSecondsComponentimpl(long r4) {
            boolean r0 = m10026isInfiniteimpl(r4)
            if (r0 == 0) goto L8
            r0 = 0
            goto L11
        L8:
            long r0 = m10015getInWholeSecondsimpl(r4)
            r2 = 60
            long r2 = (long) r2
            long r0 = r0 % r2
            int r0 = (int) r0
        L11:
            return r0
    }

    /* JADX INFO: renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final kotlin.time.DurationUnit m10019getStorageUnitimpl(long r1) {
            boolean r0 = m10025isInNanosimpl(r1)
            if (r0 == 0) goto L9
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            goto Lb
        L9:
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
        Lb:
            return r0
    }

    /* JADX INFO: renamed from: getUnitDiscriminator-impl, reason: not valid java name */
    private static final int m10020getUnitDiscriminatorimpl(long r2) {
            r0 = 0
            int r1 = (int) r2
            r1 = r1 & 1
            return r1
    }

    /* JADX INFO: renamed from: getValue-impl, reason: not valid java name */
    private static final long m10021getValueimpl(long r2) {
            r0 = 1
            long r0 = r2 >> r0
            return r0
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m10022hashCodeimpl(long r1) {
            int r0 = java.lang.Long.hashCode(r1)
            return r0
    }

    /* JADX INFO: renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m10023isFiniteimpl(long r1) {
            boolean r0 = m10026isInfiniteimpl(r1)
            r0 = r0 ^ 1
            return r0
    }

    /* JADX INFO: renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m10024isInMillisimpl(long r3) {
            r0 = 0
            int r1 = (int) r3
            r2 = 1
            r0 = r1 & 1
            if (r0 != r2) goto L8
            goto L9
        L8:
            r2 = 0
        L9:
            return r2
    }

    /* JADX INFO: renamed from: isInNanos-impl, reason: not valid java name */
    private static final boolean m10025isInNanosimpl(long r3) {
            r0 = 0
            int r1 = (int) r3
            r2 = 1
            r0 = r1 & 1
            if (r0 != 0) goto L8
            goto L9
        L8:
            r2 = 0
        L9:
            return r2
    }

    /* JADX INFO: renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m10026isInfiniteimpl(long r2) {
            long r0 = kotlin.time.Duration.INFINITE
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Lf
            long r0 = kotlin.time.Duration.NEG_INFINITE
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    /* JADX INFO: renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m10027isNegativeimpl(long r2) {
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m10028isPositiveimpl(long r2) {
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m10029minusLRDsOJo(long r2, long r4) {
            long r0 = m10047unaryMinusUwyO8pc(r4)
            long r0 = m10030plusLRDsOJo(r2, r0)
            return r0
    }

    /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m10030plusLRDsOJo(long r10, long r12) {
            boolean r0 = m10026isInfiniteimpl(r10)
            if (r0 == 0) goto L1f
            boolean r0 = m10023isFiniteimpl(r12)
            if (r0 != 0) goto L1e
            long r0 = r10 ^ r12
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L16
            goto L1e
        L16:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Summing infinite durations of different signs yields an undefined result."
            r0.<init>(r1)
            throw r0
        L1e:
            return r10
        L1f:
            boolean r0 = m10026isInfiniteimpl(r12)
            if (r0 == 0) goto L26
            return r12
        L26:
            r0 = 0
            int r1 = (int) r10
            r0 = r1 & 1
            r1 = 0
            int r2 = (int) r12
            r1 = r2 & 1
            if (r0 != r1) goto L4b
            long r0 = m10021getValueimpl(r10)
            long r2 = m10021getValueimpl(r12)
            long r0 = r0 + r2
            boolean r2 = m10025isInNanosimpl(r10)
            if (r2 == 0) goto L46
            long r2 = kotlin.time.DurationKt.access$durationOfNanosNormalized(r0)
            goto L6c
        L46:
            long r2 = kotlin.time.DurationKt.access$durationOfMillisNormalized(r0)
            goto L6c
        L4b:
            boolean r0 = m10024isInMillisimpl(r10)
            if (r0 == 0) goto L5f
            long r3 = m10021getValueimpl(r10)
            long r5 = m10021getValueimpl(r12)
            r1 = r10
            long r2 = m9990addValuesMixedRangesUwyO8pc(r1, r3, r5)
            goto L6c
        L5f:
            long r6 = m10021getValueimpl(r12)
            long r8 = m10021getValueimpl(r10)
            r4 = r10
            long r2 = m9990addValuesMixedRangesUwyO8pc(r4, r6, r8)
        L6c:
            return r2
    }

    /* JADX INFO: renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m10031timesUwyO8pc(long r6, double r8) {
            int r0 = kotlin.math.MathKt.roundToInt(r8)
            double r1 = (double) r0
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 != 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 == 0) goto L13
            long r1 = m10032timesUwyO8pc(r6, r0)
            return r1
        L13:
            kotlin.time.DurationUnit r1 = m10019getStorageUnitimpl(r6)
            double r2 = m10037toDoubleimpl(r6, r1)
            double r2 = r2 * r8
            long r4 = kotlin.time.DurationKt.toDuration(r2, r1)
            return r4
    }

    /* JADX INFO: renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m10032timesUwyO8pc(long r20, int r22) {
            r0 = r22
            boolean r1 = m10026isInfiniteimpl(r20)
            if (r1 == 0) goto L1d
        L9:
            if (r0 == 0) goto L15
            if (r0 <= 0) goto L10
            r1 = r20
            goto L14
        L10:
            long r1 = m10047unaryMinusUwyO8pc(r20)
        L14:
            return r1
        L15:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Multiplying infinite duration by zero yields an undefined result."
            r1.<init>(r2)
            throw r1
        L1d:
            if (r0 != 0) goto L22
            long r1 = kotlin.time.Duration.ZERO
            return r1
        L22:
            long r1 = m10021getValueimpl(r20)
            long r3 = (long) r0
            long r3 = r3 * r1
            boolean r5 = m10025isInNanosimpl(r20)
            if (r5 == 0) goto La5
            kotlin.ranges.LongRange r5 = new kotlin.ranges.LongRange
            r10 = -2147483647(0xffffffff80000001, double:NaN)
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r5.<init>(r10, r12)
            boolean r5 = r5.contains(r1)
            if (r5 == 0) goto L45
            long r5 = kotlin.time.DurationKt.access$durationOfNanos(r3)
            goto Ld6
        L45:
            long r10 = (long) r0
            long r10 = r3 / r10
            int r5 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r5 != 0) goto L52
            long r5 = kotlin.time.DurationKt.access$durationOfNanosNormalized(r3)
            goto Ld6
        L52:
            long r10 = kotlin.time.DurationKt.access$nanosToMillis(r1)
            long r12 = kotlin.time.DurationKt.access$millisToNanos(r10)
            long r12 = r1 - r12
            long r14 = (long) r0
            long r14 = r14 * r10
            long r6 = (long) r0
            long r6 = r6 * r12
            long r5 = kotlin.time.DurationKt.access$nanosToMillis(r6)
            long r5 = r5 + r14
            long r8 = (long) r0
            long r7 = r14 / r8
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 != 0) goto L91
            long r7 = r5 ^ r14
            r18 = 0
            int r7 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r7 < 0) goto L91
            kotlin.ranges.LongRange r7 = new kotlin.ranges.LongRange
            r16 = r10
            r8 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            r10 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r7.<init>(r10, r8)
            kotlin.ranges.ClosedRange r7 = (kotlin.ranges.ClosedRange) r7
            long r7 = kotlin.ranges.RangesKt.coerceIn(r5, r7)
            long r7 = kotlin.time.DurationKt.access$durationOfMillis(r7)
            r5 = r7
            goto Ld6
        L91:
            r16 = r10
            int r7 = kotlin.math.MathKt.getSign(r1)
            int r8 = kotlin.math.MathKt.getSign(r22)
            int r7 = r7 * r8
            if (r7 <= 0) goto La2
            long r7 = kotlin.time.Duration.INFINITE
            r5 = r7
            goto Ld6
        La2:
            long r5 = kotlin.time.Duration.NEG_INFINITE
            goto Ld6
        La5:
            long r5 = (long) r0
            long r5 = r3 / r5
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto Lc6
            kotlin.ranges.LongRange r5 = new kotlin.ranges.LongRange
            r6 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            r8 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r5.<init>(r8, r6)
            kotlin.ranges.ClosedRange r5 = (kotlin.ranges.ClosedRange) r5
            long r5 = kotlin.ranges.RangesKt.coerceIn(r3, r5)
            long r5 = kotlin.time.DurationKt.access$durationOfMillis(r5)
            goto Ld6
        Lc6:
            int r5 = kotlin.math.MathKt.getSign(r1)
            int r6 = kotlin.math.MathKt.getSign(r22)
            int r5 = r5 * r6
            if (r5 <= 0) goto Ld4
            long r5 = kotlin.time.Duration.INFINITE
            goto Ld6
        Ld4:
            long r5 = kotlin.time.Duration.NEG_INFINITE
        Ld6:
            return r5
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m10033toComponentsimpl(long r3, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Integer, ? extends T> r5) {
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            long r1 = m10015getInWholeSecondsimpl(r3)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            int r2 = m10017getNanosecondsComponentimpl(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r5.invoke(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m10034toComponentsimpl(long r4, kotlin.jvm.functions.Function3<? super java.lang.Long, ? super java.lang.Integer, ? super java.lang.Integer, ? extends T> r6) {
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            long r1 = m10013getInWholeMinutesimpl(r4)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            int r2 = m10018getSecondsComponentimpl(r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = m10017getNanosecondsComponentimpl(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r1 = r6.invoke(r1, r2, r3)
            return r1
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m10035toComponentsimpl(long r5, kotlin.jvm.functions.Function4<? super java.lang.Long, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? extends T> r7) {
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            long r1 = m10010getInWholeHoursimpl(r5)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            int r2 = m10016getMinutesComponentimpl(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = m10018getSecondsComponentimpl(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = m10017getNanosecondsComponentimpl(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r1 = r7.invoke(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m10036toComponentsimpl(long r9, kotlin.jvm.functions.Function5<? super java.lang.Long, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? extends T> r11) {
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 0
            long r1 = m10009getInWholeDaysimpl(r9)
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            int r1 = m10001getHoursComponentimpl(r9)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            int r1 = m10016getMinutesComponentimpl(r9)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            int r1 = m10018getSecondsComponentimpl(r9)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            int r1 = m10017getNanosecondsComponentimpl(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r3 = r11
            java.lang.Object r1 = r3.invoke(r4, r5, r6, r7, r8)
            return r1
    }

    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    public static final double m10037toDoubleimpl(long r3, kotlin.time.DurationUnit r5) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            long r0 = kotlin.time.Duration.INFINITE
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto Lf
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            goto L25
        Lf:
            long r0 = kotlin.time.Duration.NEG_INFINITE
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L18
            r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            goto L25
        L18:
            long r0 = m10021getValueimpl(r3)
            double r0 = (double) r0
            kotlin.time.DurationUnit r2 = m10019getStorageUnitimpl(r3)
            double r0 = kotlin.time.DurationUnitKt.convertDurationUnit(r0, r2, r5)
        L25:
            return r0
    }

    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    public static final int m10038toIntimpl(long r7, kotlin.time.DurationUnit r9) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            long r1 = m10040toLongimpl(r7, r9)
            r3 = -2147483648(0xffffffff80000000, double:NaN)
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = kotlin.ranges.RangesKt.coerceIn(r1, r3, r5)
            int r0 = (int) r0
            return r0
    }

    /* JADX INFO: renamed from: toIsoString-impl, reason: not valid java name */
    public static final java.lang.String m10039toIsoStringimpl(long r27) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r9 = r0
            r10 = 0
            boolean r1 = m10027isNegativeimpl(r27)
            if (r1 == 0) goto L12
            r1 = 45
            r9.append(r1)
        L12:
            java.lang.String r1 = "PT"
            r9.append(r1)
            long r11 = m10000getAbsoluteValueUwyO8pc(r27)
            r13 = 0
            long r1 = m10010getInWholeHoursimpl(r11)
            int r14 = m10016getMinutesComponentimpl(r11)
            int r15 = m10018getSecondsComponentimpl(r11)
            int r16 = m10017getNanosecondsComponentimpl(r11)
            r17 = r1
            r19 = 0
            boolean r3 = m10026isInfiniteimpl(r27)
            if (r3 == 0) goto L3f
            r1 = 9999999999999(0x9184e729fff, double:4.940656458412E-311)
            r7 = r1
            goto L40
        L3f:
            r7 = r1
        L40:
            r1 = 0
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L4a
            r1 = r2
            goto L4b
        L4a:
            r1 = r3
        L4b:
            r20 = r1
            if (r15 != 0) goto L54
            if (r16 == 0) goto L52
            goto L54
        L52:
            r1 = r3
            goto L55
        L54:
            r1 = r2
        L55:
            r21 = r1
            if (r14 != 0) goto L5f
            if (r21 == 0) goto L5e
            if (r20 == 0) goto L5e
            goto L5f
        L5e:
            r2 = r3
        L5f:
            r22 = r2
            if (r20 == 0) goto L6c
            java.lang.StringBuilder r1 = r9.append(r7)
            r2 = 72
            r1.append(r2)
        L6c:
            if (r22 == 0) goto L77
            java.lang.StringBuilder r1 = r9.append(r14)
            r2 = 77
            r1.append(r2)
        L77:
            if (r21 != 0) goto L81
            if (r20 != 0) goto L7e
            if (r22 != 0) goto L7e
            goto L81
        L7e:
            r25 = r7
            goto L96
        L81:
            java.lang.String r23 = "S"
            r24 = 1
            r6 = 9
            r1 = r27
            r3 = r9
            r4 = r15
            r5 = r16
            r25 = r7
            r7 = r23
            r8 = r24
            m9991appendFractionalimpl(r1, r3, r4, r5, r6, r7, r8)
        L96:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    public static final long m10040toLongimpl(long r3, kotlin.time.DurationUnit r5) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            long r0 = kotlin.time.Duration.INFINITE
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L12
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L27
        L12:
            long r0 = kotlin.time.Duration.NEG_INFINITE
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L1b
            r0 = -9223372036854775808
            goto L27
        L1b:
            long r0 = m10021getValueimpl(r3)
            kotlin.time.DurationUnit r2 = m10019getStorageUnitimpl(r3)
            long r0 = kotlin.time.DurationUnitKt.convertDurationUnit(r0, r2, r5)
        L27:
            return r0
    }

    @kotlin.Deprecated(message = "Use inWholeMilliseconds property instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.inWholeMilliseconds", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    /* JADX INFO: renamed from: toLongMilliseconds-impl, reason: not valid java name */
    public static final /* synthetic */ long m10041toLongMillisecondsimpl(long r2) {
            long r0 = m10012getInWholeMillisecondsimpl(r2)
            return r0
    }

    @kotlin.Deprecated(message = "Use inWholeNanoseconds property instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.inWholeNanoseconds", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    /* JADX INFO: renamed from: toLongNanoseconds-impl, reason: not valid java name */
    public static final /* synthetic */ long m10042toLongNanosecondsimpl(long r2) {
            long r0 = m10014getInWholeNanosecondsimpl(r2)
            return r0
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m10043toStringimpl(long r31) {
            r0 = 0
            int r2 = (r31 > r0 ? 1 : (r31 == r0 ? 0 : -1))
            if (r2 != 0) goto Lb
            java.lang.String r0 = "0s"
            goto L15a
        Lb:
            long r2 = kotlin.time.Duration.INFINITE
            int r2 = (r31 > r2 ? 1 : (r31 == r2 ? 0 : -1))
            if (r2 != 0) goto L15
            java.lang.String r0 = "Infinity"
            goto L15a
        L15:
            long r2 = kotlin.time.Duration.NEG_INFINITE
            int r2 = (r31 > r2 ? 1 : (r31 == r2 ? 0 : -1))
            if (r2 != 0) goto L1f
            java.lang.String r0 = "-Infinity"
            goto L15a
        L1f:
            boolean r8 = m10027isNegativeimpl(r31)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r10 = r9
            r11 = 0
            if (r8 == 0) goto L31
            r2 = 45
            r10.append(r2)
        L31:
            long r12 = m10000getAbsoluteValueUwyO8pc(r31)
            r14 = 0
            long r6 = m10009getInWholeDaysimpl(r12)
            int r15 = m10001getHoursComponentimpl(r12)
            int r5 = m10016getMinutesComponentimpl(r12)
            int r16 = m10018getSecondsComponentimpl(r12)
            int r4 = m10017getNanosecondsComponentimpl(r12)
            r17 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L54
            r0 = 1
            goto L55
        L54:
            r0 = r1
        L55:
            r18 = r0
            if (r15 == 0) goto L5b
            r0 = 1
            goto L5c
        L5b:
            r0 = r1
        L5c:
            r19 = r0
            if (r5 == 0) goto L62
            r0 = 1
            goto L63
        L62:
            r0 = r1
        L63:
            r20 = r0
            if (r16 != 0) goto L69
            if (r4 == 0) goto L6a
        L69:
            r1 = 1
        L6a:
            r21 = r1
            r0 = 0
            if (r18 == 0) goto L7a
            java.lang.StringBuilder r1 = r10.append(r6)
            r2 = 100
            r1.append(r2)
            int r0 = r0 + 1
        L7a:
            r1 = 32
            if (r19 != 0) goto L84
            if (r18 == 0) goto L95
            if (r20 != 0) goto L84
            if (r21 == 0) goto L95
        L84:
            int r2 = r0 + 1
            if (r0 <= 0) goto L8b
            r10.append(r1)
        L8b:
            java.lang.StringBuilder r0 = r10.append(r15)
            r3 = 104(0x68, float:1.46E-43)
            r0.append(r3)
            r0 = r2
        L95:
            if (r20 != 0) goto L9d
            if (r21 == 0) goto Lae
            if (r19 != 0) goto L9d
            if (r18 == 0) goto Lae
        L9d:
            int r2 = r0 + 1
            if (r0 <= 0) goto La4
            r10.append(r1)
        La4:
            java.lang.StringBuilder r0 = r10.append(r5)
            r3 = 109(0x6d, float:1.53E-43)
            r0.append(r3)
            r0 = r2
        Lae:
            if (r21 == 0) goto L137
            int r23 = r0 + 1
            if (r0 <= 0) goto Lb7
            r10.append(r1)
        Lb7:
            if (r16 != 0) goto L11f
            if (r18 != 0) goto L11f
            if (r19 != 0) goto L11f
            if (r20 == 0) goto Lc9
            r22 = r5
            r29 = r6
            r25 = r11
            r11 = r4
            goto L126
        Lc9:
            r0 = 1000000(0xf4240, float:1.401298E-39)
            if (r4 < r0) goto Lf1
            int r3 = r4 / r0
            int r24 = r4 % r0
            java.lang.String r25 = "ms"
            r26 = 0
            r27 = 6
            r0 = r31
            r2 = r10
            r28 = r4
            r4 = r24
            r22 = r5
            r5 = r27
            r29 = r6
            r6 = r25
            r7 = r26
            m9991appendFractionalimpl(r0, r2, r3, r4, r5, r6, r7)
            r25 = r11
            r11 = r28
            goto L134
        Lf1:
            r28 = r4
            r22 = r5
            r29 = r6
            r0 = 1000(0x3e8, float:1.401E-42)
            r7 = r28
            if (r7 < r0) goto L112
            int r3 = r7 / 1000
            int r4 = r7 % 1000
            java.lang.String r6 = "us"
            r24 = 0
            r5 = 3
            r0 = r31
            r2 = r10
            r25 = r11
            r11 = r7
            r7 = r24
            m9991appendFractionalimpl(r0, r2, r3, r4, r5, r6, r7)
            goto L134
        L112:
            r25 = r11
            r11 = r7
            java.lang.StringBuilder r0 = r10.append(r11)
            java.lang.String r1 = "ns"
            r0.append(r1)
            goto L134
        L11f:
            r22 = r5
            r29 = r6
            r25 = r11
            r11 = r4
        L126:
            java.lang.String r6 = "s"
            r7 = 0
            r5 = 9
            r0 = r31
            r2 = r10
            r3 = r16
            r4 = r11
            m9991appendFractionalimpl(r0, r2, r3, r4, r5, r6, r7)
        L134:
            r0 = r23
            goto L13e
        L137:
            r22 = r5
            r29 = r6
            r25 = r11
            r11 = r4
        L13e:
            if (r8 == 0) goto L14e
            r1 = 1
            if (r0 <= r1) goto L14e
            r2 = 40
            java.lang.StringBuilder r1 = r10.insert(r1, r2)
            r2 = 41
            r1.append(r2)
        L14e:
            java.lang.String r0 = r9.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
        L15a:
            return r0
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static final java.lang.String m10044toStringimpl(long r4, kotlin.time.DurationUnit r6, int r7) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            if (r7 < 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L3b
            double r0 = m10037toDoubleimpl(r4, r6)
            boolean r2 = java.lang.Double.isInfinite(r0)
            if (r2 == 0) goto L1b
            java.lang.String r2 = java.lang.String.valueOf(r0)
            return r2
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 12
            int r3 = kotlin.ranges.RangesKt.coerceAtMost(r7, r3)
            java.lang.String r3 = kotlin.time.DurationJvmKt.formatToExactDecimals(r0, r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = kotlin.time.DurationUnitKt.shortName(r6)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
        L3b:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "decimals must be not negative, but was "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ java.lang.String m10045toStringimpl$default(long r0, kotlin.time.DurationUnit r2, int r3, int r4, java.lang.Object r5) {
            r4 = r4 & 2
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = m10044toStringimpl(r0, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: truncateTo-UwyO8pc$kotlin_stdlib, reason: not valid java name */
    public static final long m10046truncateToUwyO8pc$kotlin_stdlib(long r7, kotlin.time.DurationUnit r9) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            kotlin.time.DurationUnit r0 = m10019getStorageUnitimpl(r7)
            r1 = r0
            java.lang.Enum r1 = (java.lang.Enum) r1
            int r1 = r9.compareTo(r1)
            if (r1 <= 0) goto L2e
            boolean r1 = m10026isInfiniteimpl(r7)
            if (r1 == 0) goto L19
            goto L2e
        L19:
            r1 = 1
            long r1 = kotlin.time.DurationUnitKt.convertDurationUnit(r1, r9, r0)
            long r3 = m10021getValueimpl(r7)
            long r5 = m10021getValueimpl(r7)
            long r5 = r5 % r1
            long r3 = r3 - r5
            long r5 = kotlin.time.DurationKt.toDuration(r3, r0)
            return r5
        L2e:
            return r7
    }

    /* JADX INFO: renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m10047unaryMinusUwyO8pc(long r4) {
            long r0 = m10021getValueimpl(r4)
            long r0 = -r0
            r2 = 0
            int r3 = (int) r4
            r2 = r3 & 1
            long r0 = kotlin.time.DurationKt.access$durationOf(r0, r2)
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(kotlin.time.Duration r3) {
            r2 = this;
            r0 = r3
            kotlin.time.Duration r0 = (kotlin.time.Duration) r0
            long r0 = r0.m10049unboximpl()
            int r0 = r2.m10048compareToLRDsOJo(r0)
            return r0
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m10048compareToLRDsOJo(long r3) {
            r2 = this;
            long r0 = r2.rawValue
            int r0 = m9993compareToLRDsOJo(r0, r3)
            return r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            long r0 = r2.rawValue
            boolean r0 = m9998equalsimpl(r0, r3)
            return r0
    }

    public int hashCode() {
            r2 = this;
            long r0 = r2.rawValue
            int r0 = m10022hashCodeimpl(r0)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            long r0 = r2.rawValue
            java.lang.String r0 = m10043toStringimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m10049unboximpl() {
            r2 = this;
            long r0 = r2.rawValue
            return r0
    }
}
