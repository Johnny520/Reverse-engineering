package kotlin;

/* JADX INFO: compiled from: UByte.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 v2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001vB\u0014\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u001b\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u000fJ\u001b\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0012J\u001b\u0010\u001b\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\b \u0010\u0018J\u001a\u0010!\u001a\u00020\"2\b\u0010\t\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b'\u0010\u000fJ\u001b\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\b(\u0010\u0012J\u001b\u0010&\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b)\u0010\u001fJ\u001b\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b*\u0010\u0018J\u0010\u0010+\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0005J\u0016\u00100\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0005J\u001b\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b3\u0010\u000fJ\u001b\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\b4\u0010\u0012J\u001b\u00102\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\b5\u0010\u001fJ\u001b\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\b6\u0010\u0018J\u001b\u00107\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b8\u0010\u000bJ\u001b\u00107\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\b9\u0010\u0012J\u001b\u00107\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b:\u0010\u001fJ\u001b\u00107\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b;\u0010<J\u001b\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b>\u0010\u000bJ\u001b\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b@\u0010\u000fJ\u001b\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\bA\u0010\u0012J\u001b\u0010?\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\bB\u0010\u001fJ\u001b\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\bC\u0010\u0018J\u001b\u0010D\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u001b\u0010H\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bI\u0010GJ\u001b\u0010J\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bK\u0010\u000fJ\u001b\u0010J\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\bL\u0010\u0012J\u001b\u0010J\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\bM\u0010\u001fJ\u001b\u0010J\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\bN\u0010\u0018J\u001b\u0010O\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bP\u0010\u000fJ\u001b\u0010O\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\bQ\u0010\u0012J\u001b\u0010O\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\bR\u0010\u001fJ\u001b\u0010O\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\bS\u0010\u0018J\u0010\u0010T\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bU\u0010\u0005J\u0010\u0010V\u001a\u00020WH\u0087\b¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020[H\u0087\b¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020\rH\u0087\b¢\u0006\u0004\b_\u0010-J\u0010\u0010`\u001a\u00020aH\u0087\b¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020eH\u0087\b¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020iH\u0016¢\u0006\u0004\bj\u0010kJ\u0016\u0010l\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bm\u0010\u0005J\u0016\u0010n\u001a\u00020\u0010H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bo\u0010-J\u0016\u0010p\u001a\u00020\u0013H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bq\u0010cJ\u0016\u0010r\u001a\u00020\u0016H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bs\u0010gJ\u001b\u0010t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\bu\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006w"}, m115d2 = {"Lkotlin/UByte;", "", "data", "", "constructor-impl", "(B)B", "getData$annotations", "()V", "and", "other", "and-7apg3OU", "(BB)B", "compareTo", "", "compareTo-7apg3OU", "(BB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(BI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(BJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(BS)I", "dec", "dec-w2LRezQ", "div", "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(BJ)J", "div-xj2QHRw", "equals", "", "", "equals-impl", "(BLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(B)I", "inc", "inc-w2LRezQ", "inv", "inv-w2LRezQ", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "(BS)S", "or", "or-7apg3OU", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-7apg3OU", "(BB)Lkotlin/ranges/UIntRange;", "rangeUntil", "rangeUntil-7apg3OU", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "toByte-impl", "toDouble", "", "toDouble-impl", "(B)D", "toFloat", "", "toFloat-impl", "(B)F", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(B)J", "toShort", "", "toShort-impl", "(B)S", "toString", "", "toString-impl", "(B)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-7apg3OU", "Companion", "kotlin-stdlib"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
@kotlin.jvm.JvmInline
public final class UByte implements java.lang.Comparable<kotlin.UByte> {
    public static final kotlin.UByte.Companion Companion = null;
    public static final byte MAX_VALUE = -1;
    public static final byte MIN_VALUE = 0;
    public static final int SIZE_BITS = 8;
    public static final int SIZE_BYTES = 1;
    private final byte data;

    /* JADX INFO: compiled from: UByte.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\n"}, m115d2 = {"Lkotlin/UByte$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/UByte;", "B", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
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
    }

    static {
            kotlin.UByte$Companion r0 = new kotlin.UByte$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.UByte.Companion = r0
            return
    }

    private /* synthetic */ UByte(byte r1) {
            r0 = this;
            r0.<init>()
            r0.data = r1
            return
    }

    /* JADX INFO: renamed from: and-7apg3OU, reason: not valid java name */
    private static final byte m8680and7apg3OU(byte r1, byte r2) {
            r0 = r1 & r2
            byte r0 = (byte) r0
            byte r0 = m8687constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlin.UByte m8681boximpl(byte r1) {
            kotlin.UByte r0 = new kotlin.UByte
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private int m8682compareTo7apg3OU(byte r3) {
            r2 = this;
            byte r0 = r2.m8737unboximpl()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r3 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static int m8683compareTo7apg3OU(byte r2, byte r3) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            r1 = r3 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m8684compareToVKZWuLQ(byte r4, long r5) {
            long r0 = (long) r4
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m8843constructorimpl(r0)
            int r0 = java.lang.Long.compareUnsigned(r0, r5)
            return r0
    }

    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m8685compareToWZ4Q5Ns(byte r1, int r2) {
            r0 = r1 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            int r0 = java.lang.Integer.compareUnsigned(r0, r2)
            return r0
    }

    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m8686compareToxj2QHRw(byte r2, short r3) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            r1 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r3
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static byte m8687constructorimpl(byte r0) {
            return r0
    }

    /* JADX INFO: renamed from: dec-w2LRezQ, reason: not valid java name */
    private static final byte m8688decw2LRezQ(byte r1) {
            int r0 = r1 + (-1)
            byte r0 = (byte) r0
            byte r0 = m8687constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m8689div7apg3OU(byte r2, byte r3) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            r1 = r3 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m8764constructorimpl(r1)
            int r0 = java.lang.Integer.divideUnsigned(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m8690divVKZWuLQ(byte r4, long r5) {
            long r0 = (long) r4
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m8843constructorimpl(r0)
            long r0 = java.lang.Long.divideUnsigned(r0, r5)
            return r0
    }

    /* JADX INFO: renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m8691divWZ4Q5Ns(byte r1, int r2) {
            r0 = r1 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            int r0 = java.lang.Integer.divideUnsigned(r0, r2)
            return r0
    }

    /* JADX INFO: renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m8692divxj2QHRw(byte r2, short r3) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            r1 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r3
            int r1 = kotlin.UInt.m8764constructorimpl(r1)
            int r0 = java.lang.Integer.divideUnsigned(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m8693equalsimpl(byte r2, java.lang.Object r3) {
            boolean r0 = r3 instanceof kotlin.UByte
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r3
            kotlin.UByte r0 = (kotlin.UByte) r0
            byte r0 = r0.m8737unboximpl()
            if (r2 == r0) goto L10
            return r1
        L10:
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8694equalsimpl0(byte r1, byte r2) {
            if (r1 != r2) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            return r0
    }

    /* JADX INFO: renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m8695floorDiv7apg3OU(byte r2, byte r3) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            r1 = r3 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m8764constructorimpl(r1)
            int r0 = java.lang.Integer.divideUnsigned(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m8696floorDivVKZWuLQ(byte r4, long r5) {
            long r0 = (long) r4
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m8843constructorimpl(r0)
            long r0 = java.lang.Long.divideUnsigned(r0, r5)
            return r0
    }

    /* JADX INFO: renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m8697floorDivWZ4Q5Ns(byte r1, int r2) {
            r0 = r1 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            int r0 = java.lang.Integer.divideUnsigned(r0, r2)
            return r0
    }

    /* JADX INFO: renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m8698floorDivxj2QHRw(byte r2, short r3) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            r1 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r3
            int r1 = kotlin.UInt.m8764constructorimpl(r1)
            int r0 = java.lang.Integer.divideUnsigned(r0, r1)
            return r0
    }

    public static /* synthetic */ void getData$annotations() {
            return
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m8699hashCodeimpl(byte r1) {
            int r0 = java.lang.Byte.hashCode(r1)
            return r0
    }

    /* JADX INFO: renamed from: inc-w2LRezQ, reason: not valid java name */
    private static final byte m8700incw2LRezQ(byte r1) {
            int r0 = r1 + 1
            byte r0 = (byte) r0
            byte r0 = m8687constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: inv-w2LRezQ, reason: not valid java name */
    private static final byte m8701invw2LRezQ(byte r1) {
            int r0 = ~r1
            byte r0 = (byte) r0
            byte r0 = m8687constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m8702minus7apg3OU(byte r2, byte r3) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            r1 = r3 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m8764constructorimpl(r1)
            int r0 = r0 - r1
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m8703minusVKZWuLQ(byte r4, long r5) {
            long r0 = (long) r4
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m8843constructorimpl(r0)
            long r0 = r0 - r5
            long r0 = kotlin.ULong.m8843constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m8704minusWZ4Q5Ns(byte r1, int r2) {
            r0 = r1 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            int r0 = r0 - r2
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m8705minusxj2QHRw(byte r2, short r3) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            r1 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r3
            int r1 = kotlin.UInt.m8764constructorimpl(r1)
            int r0 = r0 - r1
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m8706mod7apg3OU(byte r2, byte r3) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            r1 = r3 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m8764constructorimpl(r1)
            int r0 = java.lang.Integer.remainderUnsigned(r0, r1)
            byte r0 = (byte) r0
            byte r0 = m8687constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m8707modVKZWuLQ(byte r4, long r5) {
            long r0 = (long) r4
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m8843constructorimpl(r0)
            long r0 = java.lang.Long.remainderUnsigned(r0, r5)
            return r0
    }

    /* JADX INFO: renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m8708modWZ4Q5Ns(byte r1, int r2) {
            r0 = r1 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            int r0 = java.lang.Integer.remainderUnsigned(r0, r2)
            return r0
    }

    /* JADX INFO: renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m8709modxj2QHRw(byte r2, short r3) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            r1 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r3
            int r1 = kotlin.UInt.m8764constructorimpl(r1)
            int r0 = java.lang.Integer.remainderUnsigned(r0, r1)
            short r0 = (short) r0
            short r0 = kotlin.UShort.m8950constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: or-7apg3OU, reason: not valid java name */
    private static final byte m8710or7apg3OU(byte r1, byte r2) {
            r0 = r1 | r2
            byte r0 = (byte) r0
            byte r0 = m8687constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m8711plus7apg3OU(byte r2, byte r3) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            r1 = r3 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m8764constructorimpl(r1)
            int r0 = r0 + r1
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m8712plusVKZWuLQ(byte r4, long r5) {
            long r0 = (long) r4
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m8843constructorimpl(r0)
            long r0 = r0 + r5
            long r0 = kotlin.ULong.m8843constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m8713plusWZ4Q5Ns(byte r1, int r2) {
            r0 = r1 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            int r0 = r0 + r2
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m8714plusxj2QHRw(byte r2, short r3) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            r1 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r3
            int r1 = kotlin.UInt.m8764constructorimpl(r1)
            int r0 = r0 + r1
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: rangeTo-7apg3OU, reason: not valid java name */
    private static final kotlin.ranges.UIntRange m8715rangeTo7apg3OU(byte r4, byte r5) {
            kotlin.ranges.UIntRange r0 = new kotlin.ranges.UIntRange
            r1 = r4 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m8764constructorimpl(r1)
            r2 = r5 & 255(0xff, float:3.57E-43)
            int r2 = kotlin.UInt.m8764constructorimpl(r2)
            r3 = 0
            r0.<init>(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: rangeUntil-7apg3OU, reason: not valid java name */
    private static final kotlin.ranges.UIntRange m8716rangeUntil7apg3OU(byte r2, byte r3) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            r1 = r3 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m8764constructorimpl(r1)
            kotlin.ranges.UIntRange r0 = kotlin.ranges.URangesKt.m9936untilJ1ME1BU(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m8717rem7apg3OU(byte r2, byte r3) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            r1 = r3 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m8764constructorimpl(r1)
            int r0 = java.lang.Integer.remainderUnsigned(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m8718remVKZWuLQ(byte r4, long r5) {
            long r0 = (long) r4
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m8843constructorimpl(r0)
            long r0 = java.lang.Long.remainderUnsigned(r0, r5)
            return r0
    }

    /* JADX INFO: renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m8719remWZ4Q5Ns(byte r1, int r2) {
            r0 = r1 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            int r0 = java.lang.Integer.remainderUnsigned(r0, r2)
            return r0
    }

    /* JADX INFO: renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m8720remxj2QHRw(byte r2, short r3) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            r1 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r3
            int r1 = kotlin.UInt.m8764constructorimpl(r1)
            int r0 = java.lang.Integer.remainderUnsigned(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m8721times7apg3OU(byte r2, byte r3) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            r1 = r3 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m8764constructorimpl(r1)
            int r0 = r0 * r1
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m8722timesVKZWuLQ(byte r4, long r5) {
            long r0 = (long) r4
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m8843constructorimpl(r0)
            long r0 = r0 * r5
            long r0 = kotlin.ULong.m8843constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m8723timesWZ4Q5Ns(byte r1, int r2) {
            r0 = r1 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            int r0 = r0 * r2
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m8724timesxj2QHRw(byte r2, short r3) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            r1 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r3
            int r1 = kotlin.UInt.m8764constructorimpl(r1)
            int r0 = r0 * r1
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    private static final byte m8725toByteimpl(byte r0) {
            return r0
    }

    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    private static final double m8726toDoubleimpl(byte r2) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            double r0 = (double) r0
            return r0
    }

    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    private static final float m8727toFloatimpl(byte r1) {
            r0 = r1 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            return r0
    }

    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    private static final int m8728toIntimpl(byte r1) {
            r0 = r1 & 255(0xff, float:3.57E-43)
            return r0
    }

    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    private static final long m8729toLongimpl(byte r4) {
            long r0 = (long) r4
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            return r0
    }

    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    private static final short m8730toShortimpl(byte r1) {
            short r0 = (short) r1
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
            return r0
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m8731toStringimpl(byte r1) {
            r0 = r1 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }

    /* JADX INFO: renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m8732toUBytew2LRezQ(byte r0) {
            return r0
    }

    /* JADX INFO: renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m8733toUIntpVg5ArA(byte r1) {
            r0 = r1 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m8734toULongsVKNKU(byte r4) {
            long r0 = (long) r4
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m8843constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m8735toUShortMh2AYeg(byte r1) {
            short r0 = (short) r1
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
            short r0 = kotlin.UShort.m8950constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: xor-7apg3OU, reason: not valid java name */
    private static final byte m8736xor7apg3OU(byte r1, byte r2) {
            r0 = r1 ^ r2
            byte r0 = (byte) r0
            byte r0 = m8687constructorimpl(r0)
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(kotlin.UByte r3) {
            r2 = this;
            r0 = r3
            kotlin.UByte r0 = (kotlin.UByte) r0
            byte r0 = r0.m8737unboximpl()
            byte r1 = r2.m8737unboximpl()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r1, r0)
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            byte r0 = r1.data
            boolean r0 = m8693equalsimpl(r0, r2)
            return r0
    }

    public int hashCode() {
            r1 = this;
            byte r0 = r1.data
            int r0 = m8699hashCodeimpl(r0)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            byte r0 = r1.data
            java.lang.String r0 = m8731toStringimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ byte m8737unboximpl() {
            r1 = this;
            byte r0 = r1.data
            return r0
    }
}
