.class public Lorg/apache/commons/lang3/time/FastDatePrinter;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final EMPTY_RULE_ARRAY:[Lorg/apache/commons/lang3/time/飘花落叶言子世楪苏兰哲;

.field public static final FULL:I = 0x0

.field public static final LONG:I = 0x1

.field private static final MAX_DIGITS:I = 0xa

.field public static final MEDIUM:I = 0x2

.field public static final SHORT:I = 0x3

.field private static final serialVersionUID:J = 0x1L

.field private static final timeZoneDisplayCache:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Lorg/apache/commons/lang3/time/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u5170\u82cf\u54f2;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final locale:Ljava/util/Locale;

.field private transient maxLengthEstimate:I

.field private final pattern:Ljava/lang/String;

.field private transient rules:[Lorg/apache/commons/lang3/time/飘花落叶言子世楪苏兰哲;

.field private final timeZone:Ljava/util/TimeZone;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Lorg/apache/commons/lang3/time/飘花落叶言子世楪苏兰哲;

    .line 3
    .line 4
    sput-object v0, Lorg/apache/commons/lang3/time/FastDatePrinter;->EMPTY_RULE_ARRAY:[Lorg/apache/commons/lang3/time/飘花落叶言子世楪苏兰哲;

    .line 5
    .line 6
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    const/4 v1, 0x7

    .line 9
    invoke-direct {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lorg/apache/commons/lang3/time/FastDatePrinter;->timeZoneDisplayCache:Ljava/util/concurrent/ConcurrentMap;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/apache/commons/lang3/time/FastDatePrinter;->pattern:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lorg/apache/commons/lang3/time/FastDatePrinter;->timeZone:Ljava/util/TimeZone;

    .line 7
    .line 8
    sget p1, Lorg/apache/commons/lang3/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 9
    .line 10
    if-eqz p3, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    :goto_0
    iput-object p3, p0, Lorg/apache/commons/lang3/time/FastDatePrinter;->locale:Ljava/util/Locale;

    .line 18
    .line 19
    invoke-direct {p0}, Lorg/apache/commons/lang3/time/FastDatePrinter;->init()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static synthetic access$000(Ljava/lang/Appendable;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/time/FastDatePrinter;->appendDigits(Ljava/lang/Appendable;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$100(Ljava/lang/Appendable;II)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/time/FastDatePrinter;->appendFullDigits(Ljava/lang/Appendable;II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static appendDigits(Ljava/lang/Appendable;I)V
    .locals 1

    .line 1
    div-int/lit8 v0, p1, 0xa

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x30

    .line 4
    .line 5
    int-to-char v0, v0

    .line 6
    invoke-interface {p0, v0}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 7
    .line 8
    .line 9
    rem-int/lit8 p1, p1, 0xa

    .line 10
    .line 11
    add-int/lit8 p1, p1, 0x30

    .line 12
    .line 13
    int-to-char p1, p1

    .line 14
    invoke-interface {p0, p1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private static appendFullDigits(Ljava/lang/Appendable;II)V
    .locals 8

    .line 1
    const/16 v0, 0x2710

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    const/16 v2, 0x30

    .line 6
    .line 7
    if-ge p1, v0, :cond_a

    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    const/4 v3, 0x3

    .line 11
    const/4 v4, 0x4

    .line 12
    const/4 v5, 0x1

    .line 13
    const/16 v6, 0x3e8

    .line 14
    .line 15
    const/16 v7, 0x64

    .line 16
    .line 17
    if-ge p1, v6, :cond_2

    .line 18
    .line 19
    if-ge p1, v7, :cond_1

    .line 20
    .line 21
    if-ge p1, v1, :cond_0

    .line 22
    .line 23
    move v6, v5

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v6, v0

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move v6, v3

    .line 28
    goto :goto_0

    .line 29
    :cond_2
    move v6, v4

    .line 30
    :goto_0
    sub-int/2addr p2, v6

    .line 31
    :goto_1
    if-lez p2, :cond_3

    .line 32
    .line 33
    invoke-interface {p0, v2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 34
    .line 35
    .line 36
    add-int/lit8 p2, p2, -0x1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    if-eq v6, v5, :cond_9

    .line 40
    .line 41
    if-eq v6, v0, :cond_7

    .line 42
    .line 43
    if-eq v6, v3, :cond_5

    .line 44
    .line 45
    if-eq v6, v4, :cond_4

    .line 46
    .line 47
    goto :goto_7

    .line 48
    :cond_4
    div-int/lit16 p2, p1, 0x3e8

    .line 49
    .line 50
    add-int/2addr p2, v2

    .line 51
    int-to-char p2, p2

    .line 52
    invoke-interface {p0, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 53
    .line 54
    .line 55
    rem-int/lit16 p1, p1, 0x3e8

    .line 56
    .line 57
    :cond_5
    if-lt p1, v7, :cond_6

    .line 58
    .line 59
    div-int/lit8 p2, p1, 0x64

    .line 60
    .line 61
    add-int/2addr p2, v2

    .line 62
    int-to-char p2, p2

    .line 63
    invoke-interface {p0, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 64
    .line 65
    .line 66
    rem-int/lit8 p1, p1, 0x64

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_6
    invoke-interface {p0, v2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 70
    .line 71
    .line 72
    :cond_7
    :goto_2
    if-lt p1, v1, :cond_8

    .line 73
    .line 74
    div-int/lit8 p2, p1, 0xa

    .line 75
    .line 76
    add-int/2addr p2, v2

    .line 77
    int-to-char p2, p2

    .line 78
    invoke-interface {p0, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 79
    .line 80
    .line 81
    rem-int/lit8 p1, p1, 0xa

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_8
    invoke-interface {p0, v2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 85
    .line 86
    .line 87
    :cond_9
    :goto_3
    add-int/2addr p1, v2

    .line 88
    int-to-char p1, p1

    .line 89
    invoke-interface {p0, p1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_a
    new-array v0, v1, [C

    .line 94
    .line 95
    const/4 v1, 0x0

    .line 96
    :goto_4
    if-eqz p1, :cond_b

    .line 97
    .line 98
    add-int/lit8 v3, v1, 0x1

    .line 99
    .line 100
    rem-int/lit8 v4, p1, 0xa

    .line 101
    .line 102
    add-int/2addr v4, v2

    .line 103
    int-to-char v4, v4

    .line 104
    aput-char v4, v0, v1

    .line 105
    .line 106
    div-int/lit8 p1, p1, 0xa

    .line 107
    .line 108
    move v1, v3

    .line 109
    goto :goto_4

    .line 110
    :cond_b
    :goto_5
    if-ge v1, p2, :cond_c

    .line 111
    .line 112
    invoke-interface {p0, v2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 113
    .line 114
    .line 115
    add-int/lit8 p2, p2, -0x1

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_c
    :goto_6
    add-int/lit8 v1, v1, -0x1

    .line 119
    .line 120
    if-ltz v1, :cond_d

    .line 121
    .line 122
    aget-char p1, v0, v1

    .line 123
    .line 124
    invoke-interface {p0, p1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 125
    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_d
    :goto_7
    return-void
.end method

.method private applyRules(Ljava/util/Calendar;Ljava/lang/Appendable;)Ljava/lang/Appendable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<B::",
            "Ljava/lang/Appendable;",
            ">(",
            "Ljava/util/Calendar;",
            "TB;)TB;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/apache/commons/lang3/time/FastDatePrinter;->rules:[Lorg/apache/commons/lang3/time/飘花落叶言子世楪苏兰哲;

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_0

    .line 6
    .line 7
    aget-object v2, p0, v1

    .line 8
    .line 9
    invoke-interface {v2, p1, p2}, Lorg/apache/commons/lang3/time/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/util/Calendar;Ljava/lang/Appendable;)V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v1, v1, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-object p2
.end method

.method private applyRulesToString(Ljava/util/Calendar;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget v1, p0, Lorg/apache/commons/lang3/time/FastDatePrinter;->maxLengthEstimate:I

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1, v0}, Lorg/apache/commons/lang3/time/FastDatePrinter;->applyRules(Ljava/util/Calendar;Ljava/lang/Appendable;)Ljava/lang/Appendable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public static clear()V
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/commons/lang3/time/FastDatePrinter;->timeZoneDisplayCache:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static getTimeZoneDisplay(Ljava/util/TimeZone;ZILjava/util/Locale;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰苏哲;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰苏哲;-><init>(Ljava/util/TimeZone;ZILjava/util/Locale;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lorg/apache/commons/lang3/time/FastDatePrinter;->timeZoneDisplayCache:Ljava/util/concurrent/ConcurrentMap;

    .line 7
    .line 8
    new-instance v2, Lorg/apache/commons/lang3/time/飘花落叶言子楪兰世哲苏;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1, p2, p3}, Lorg/apache/commons/lang3/time/飘花落叶言子楪兰世哲苏;-><init>(Ljava/util/TimeZone;ZILjava/util/Locale;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v1, v0, v2}, Ljava/util/concurrent/ConcurrentMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Ljava/lang/String;

    .line 18
    .line 19
    return-object p0
.end method

.method private init()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lorg/apache/commons/lang3/time/FastDatePrinter;->parsePattern()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lorg/apache/commons/lang3/time/FastDatePrinter;->EMPTY_RULE_ARRAY:[Lorg/apache/commons/lang3/time/飘花落叶言子世楪苏兰哲;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, [Lorg/apache/commons/lang3/time/飘花落叶言子世楪苏兰哲;

    .line 12
    .line 13
    iput-object v0, p0, Lorg/apache/commons/lang3/time/FastDatePrinter;->rules:[Lorg/apache/commons/lang3/time/飘花落叶言子世楪苏兰哲;

    .line 14
    .line 15
    array-length v0, v0

    .line 16
    const/4 v1, 0x0

    .line 17
    :goto_0
    add-int/lit8 v0, v0, -0x1

    .line 18
    .line 19
    if-ltz v0, :cond_0

    .line 20
    .line 21
    iget-object v2, p0, Lorg/apache/commons/lang3/time/FastDatePrinter;->rules:[Lorg/apache/commons/lang3/time/飘花落叶言子世楪苏兰哲;

    .line 22
    .line 23
    aget-object v2, v2, v0

    .line 24
    .line 25
    invoke-interface {v2}, Lorg/apache/commons/lang3/time/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏哲兰()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    add-int/2addr v1, v2

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iput v1, p0, Lorg/apache/commons/lang3/time/FastDatePrinter;->maxLengthEstimate:I

    .line 32
    .line 33
    return-void
.end method

.method private static synthetic lambda$getTimeZoneDisplay$0(Ljava/util/TimeZone;ZILjava/util/Locale;Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰苏哲;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Ljava/util/TimeZone;->getDisplayName(ZILjava/util/Locale;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private newCalendar()Ljava/util/Calendar;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FastDatePrinter;->timeZone:Ljava/util/TimeZone;

    .line 2
    .line 3
    iget-object p0, p0, Lorg/apache/commons/lang3/time/FastDatePrinter;->locale:Ljava/util/Locale;

    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/apache/commons/lang3/time/FastDatePrinter;->init()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(Ljava/util/TimeZone;ZILjava/util/Locale;Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰苏哲;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lorg/apache/commons/lang3/time/FastDatePrinter;->lambda$getTimeZoneDisplay$0(Ljava/util/TimeZone;ZILjava/util/Locale;Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰苏哲;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public applyRules(Ljava/util/Calendar;Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 16
    invoke-direct {p0, p1, p2}, Lorg/apache/commons/lang3/time/FastDatePrinter;->applyRules(Ljava/util/Calendar;Ljava/lang/Appendable;)Ljava/lang/Appendable;

    move-result-object p0

    check-cast p0, Ljava/lang/StringBuffer;

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lorg/apache/commons/lang3/time/FastDatePrinter;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Lorg/apache/commons/lang3/time/FastDatePrinter;

    .line 8
    .line 9
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FastDatePrinter;->pattern:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v2, p1, Lorg/apache/commons/lang3/time/FastDatePrinter;->pattern:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FastDatePrinter;->timeZone:Ljava/util/TimeZone;

    .line 20
    .line 21
    iget-object v2, p1, Lorg/apache/commons/lang3/time/FastDatePrinter;->timeZone:Ljava/util/TimeZone;

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object p0, p0, Lorg/apache/commons/lang3/time/FastDatePrinter;->locale:Ljava/util/Locale;

    .line 30
    .line 31
    iget-object p1, p1, Lorg/apache/commons/lang3/time/FastDatePrinter;->locale:Ljava/util/Locale;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    const/4 p0, 0x1

    .line 40
    return p0

    .line 41
    :cond_1
    return v1
.end method

.method public format(JLjava/lang/Appendable;)Ljava/lang/Appendable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<B::",
            "Ljava/lang/Appendable;",
            ">(JTB;)TB;"
        }
    .end annotation

    .line 82
    invoke-direct {p0}, Lorg/apache/commons/lang3/time/FastDatePrinter;->newCalendar()Ljava/util/Calendar;

    move-result-object v0

    .line 83
    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 84
    invoke-direct {p0, v0, p3}, Lorg/apache/commons/lang3/time/FastDatePrinter;->applyRules(Ljava/util/Calendar;Ljava/lang/Appendable;)Ljava/lang/Appendable;

    move-result-object p0

    return-object p0
.end method

.method public format(Ljava/util/Calendar;Ljava/lang/Appendable;)Ljava/lang/Appendable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<B::",
            "Ljava/lang/Appendable;",
            ">(",
            "Ljava/util/Calendar;",
            "TB;)TB;"
        }
    .end annotation

    .line 65
    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v0

    iget-object v1, p0, Lorg/apache/commons/lang3/time/FastDatePrinter;->timeZone:Ljava/util/TimeZone;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 66
    invoke-virtual {p1}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Calendar;

    .line 67
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FastDatePrinter;->timeZone:Ljava/util/TimeZone;

    invoke-virtual {p1, v0}, Ljava/util/Calendar;->setTimeZone(Ljava/util/TimeZone;)V

    .line 68
    :cond_0
    invoke-direct {p0, p1, p2}, Lorg/apache/commons/lang3/time/FastDatePrinter;->applyRules(Ljava/util/Calendar;Ljava/lang/Appendable;)Ljava/lang/Appendable;

    move-result-object p0

    return-object p0
.end method

.method public format(Ljava/util/Date;Ljava/lang/Appendable;)Ljava/lang/Appendable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<B::",
            "Ljava/lang/Appendable;",
            ">(",
            "Ljava/util/Date;",
            "TB;)TB;"
        }
    .end annotation

    .line 73
    invoke-direct {p0}, Lorg/apache/commons/lang3/time/FastDatePrinter;->newCalendar()Ljava/util/Calendar;

    move-result-object v0

    .line 74
    invoke-virtual {v0, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 75
    invoke-direct {p0, v0, p2}, Lorg/apache/commons/lang3/time/FastDatePrinter;->applyRules(Ljava/util/Calendar;Ljava/lang/Appendable;)Ljava/lang/Appendable;

    move-result-object p0

    return-object p0
.end method

.method public format(J)Ljava/lang/String;
    .locals 1

    .line 79
    invoke-direct {p0}, Lorg/apache/commons/lang3/time/FastDatePrinter;->newCalendar()Ljava/util/Calendar;

    move-result-object v0

    .line 80
    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 81
    invoke-direct {p0, v0}, Lorg/apache/commons/lang3/time/FastDatePrinter;->applyRulesToString(Ljava/util/Calendar;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public format(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 1
    instance-of v0, p1, Ljava/util/Date;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ljava/util/Date;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lorg/apache/commons/lang3/time/FastDatePrinter;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    instance-of v0, p1, Ljava/util/Calendar;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    check-cast p1, Ljava/util/Calendar;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lorg/apache/commons/lang3/time/FastDatePrinter;->format(Ljava/util/Calendar;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    instance-of v0, p1, Ljava/lang/Long;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    check-cast p1, Ljava/lang/Long;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    invoke-virtual {p0, v0, v1}, Lorg/apache/commons/lang3/time/FastDatePrinter;->format(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 39
    .line 40
    sget-object v0, Lorg/apache/commons/lang3/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/util/HashMap;

    .line 41
    .line 42
    if-nez p1, :cond_3

    .line 43
    .line 44
    const-string p1, "<null>"

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    :goto_0
    const-string v0, "Unknown class: "

    .line 56
    .line 57
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p0
.end method

.method public format(Ljava/util/Calendar;)Ljava/lang/String;
    .locals 2

    .line 88
    new-instance v0, Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/apache/commons/lang3/time/FastDatePrinter;->maxLengthEstimate:I

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {p0, p1, v0}, Lorg/apache/commons/lang3/time/FastDatePrinter;->format(Ljava/util/Calendar;Ljava/lang/Appendable;)Ljava/lang/Appendable;

    move-result-object p0

    check-cast p0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public format(Ljava/util/Date;)Ljava/lang/String;
    .locals 1

    .line 70
    invoke-direct {p0}, Lorg/apache/commons/lang3/time/FastDatePrinter;->newCalendar()Ljava/util/Calendar;

    move-result-object v0

    .line 71
    invoke-virtual {v0, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 72
    invoke-direct {p0, v0}, Lorg/apache/commons/lang3/time/FastDatePrinter;->applyRulesToString(Ljava/util/Calendar;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public format(JLjava/lang/StringBuffer;)Ljava/lang/StringBuffer;
    .locals 1

    .line 85
    invoke-direct {p0}, Lorg/apache/commons/lang3/time/FastDatePrinter;->newCalendar()Ljava/util/Calendar;

    move-result-object v0

    .line 86
    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 87
    invoke-direct {p0, v0, p3}, Lorg/apache/commons/lang3/time/FastDatePrinter;->applyRules(Ljava/util/Calendar;Ljava/lang/Appendable;)Ljava/lang/Appendable;

    move-result-object p0

    check-cast p0, Ljava/lang/StringBuffer;

    return-object p0
.end method

.method public format(Ljava/lang/Object;Ljava/lang/StringBuffer;Ljava/text/FieldPosition;)Ljava/lang/StringBuffer;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 89
    instance-of p3, p1, Ljava/util/Date;

    if-eqz p3, :cond_0

    .line 90
    check-cast p1, Ljava/util/Date;

    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/lang3/time/FastDatePrinter;->format(Ljava/util/Date;Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    move-result-object p0

    return-object p0

    .line 91
    :cond_0
    instance-of p3, p1, Ljava/util/Calendar;

    if-eqz p3, :cond_1

    .line 92
    check-cast p1, Ljava/util/Calendar;

    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/lang3/time/FastDatePrinter;->format(Ljava/util/Calendar;Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    move-result-object p0

    return-object p0

    .line 93
    :cond_1
    instance-of p3, p1, Ljava/lang/Long;

    if-eqz p3, :cond_2

    .line 94
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1, p2}, Lorg/apache/commons/lang3/time/FastDatePrinter;->format(JLjava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    move-result-object p0

    return-object p0

    .line 95
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    sget-object p2, Lorg/apache/commons/lang3/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/util/HashMap;

    if-nez p1, :cond_3

    .line 96
    const-string p1, "<null>"

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    .line 97
    :goto_0
    const-string p2, "Unknown class: "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public format(Ljava/util/Calendar;Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;
    .locals 0

    .line 69
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/lang3/time/FastDatePrinter;->format(Ljava/util/Date;Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    move-result-object p0

    return-object p0
.end method

.method public format(Ljava/util/Date;Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;
    .locals 1

    .line 76
    invoke-direct {p0}, Lorg/apache/commons/lang3/time/FastDatePrinter;->newCalendar()Ljava/util/Calendar;

    move-result-object v0

    .line 77
    invoke-virtual {v0, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 78
    invoke-direct {p0, v0, p2}, Lorg/apache/commons/lang3/time/FastDatePrinter;->applyRules(Ljava/util/Calendar;Ljava/lang/Appendable;)Ljava/lang/Appendable;

    move-result-object p0

    check-cast p0, Ljava/lang/StringBuffer;

    return-object p0
.end method

.method public getLocale()Ljava/util/Locale;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/lang3/time/FastDatePrinter;->locale:Ljava/util/Locale;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMaxLengthEstimate()I
    .locals 0

    .line 1
    iget p0, p0, Lorg/apache/commons/lang3/time/FastDatePrinter;->maxLengthEstimate:I

    .line 2
    .line 3
    return p0
.end method

.method public getPattern()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/lang3/time/FastDatePrinter;->pattern:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTimeZone()Ljava/util/TimeZone;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/lang3/time/FastDatePrinter;->timeZone:Ljava/util/TimeZone;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FastDatePrinter;->pattern:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lorg/apache/commons/lang3/time/FastDatePrinter;->timeZone:Ljava/util/TimeZone;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object p0, p0, Lorg/apache/commons/lang3/time/FastDatePrinter;->locale:Ljava/util/Locale;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/util/Locale;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    mul-int/lit8 p0, p0, 0xd

    .line 20
    .line 21
    add-int/2addr p0, v1

    .line 22
    mul-int/lit8 p0, p0, 0xd

    .line 23
    .line 24
    add-int/2addr p0, v0

    .line 25
    return p0
.end method

.method public parsePattern()Ljava/util/List;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/apache/commons/lang3/time/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u5170\u54f2;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lorg/apache/commons/lang3/time/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲兰苏:Lorg/apache/commons/lang3/time/飘花落叶言子世苏楪兰哲;

    .line 4
    .line 5
    sget-object v2, Lorg/apache/commons/lang3/time/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏兰哲:Lorg/apache/commons/lang3/time/飘花落叶言子世苏楪兰哲;

    .line 6
    .line 7
    new-instance v3, Ljava/text/DateFormatSymbols;

    .line 8
    .line 9
    iget-object v4, v0, Lorg/apache/commons/lang3/time/FastDatePrinter;->locale:Ljava/util/Locale;

    .line 10
    .line 11
    invoke-direct {v3, v4}, Ljava/text/DateFormatSymbols;-><init>(Ljava/util/Locale;)V

    .line 12
    .line 13
    .line 14
    new-instance v4, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/text/DateFormatSymbols;->getEras()[Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    invoke-virtual {v3}, Ljava/text/DateFormatSymbols;->getMonths()[Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    invoke-virtual {v3}, Ljava/text/DateFormatSymbols;->getShortMonths()[Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    invoke-virtual {v3}, Ljava/text/DateFormatSymbols;->getWeekdays()[Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    invoke-virtual {v3}, Ljava/text/DateFormatSymbols;->getShortWeekdays()[Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v9

    .line 39
    invoke-virtual {v3}, Ljava/text/DateFormatSymbols;->getAmPmStrings()[Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    iget-object v10, v0, Lorg/apache/commons/lang3/time/FastDatePrinter;->pattern:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 46
    .line 47
    .line 48
    move-result v10

    .line 49
    const/4 v11, 0x0

    .line 50
    move v12, v11

    .line 51
    :goto_0
    if-ge v12, v10, :cond_1e

    .line 52
    .line 53
    filled-new-array {v12}, [I

    .line 54
    .line 55
    .line 56
    move-result-object v12

    .line 57
    iget-object v13, v0, Lorg/apache/commons/lang3/time/FastDatePrinter;->pattern:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v0, v13, v12}, Lorg/apache/commons/lang3/time/FastDatePrinter;->parseToken(Ljava/lang/String;[I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v13

    .line 63
    aget v12, v12, v11

    .line 64
    .line 65
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 66
    .line 67
    .line 68
    move-result v14

    .line 69
    if-nez v14, :cond_0

    .line 70
    .line 71
    goto/16 :goto_11

    .line 72
    .line 73
    :cond_0
    invoke-virtual {v13, v11}, Ljava/lang/String;->charAt(I)C

    .line 74
    .line 75
    .line 76
    move-result v15

    .line 77
    const/16 v11, 0x27

    .line 78
    .line 79
    move-object/from16 v16, v1

    .line 80
    .line 81
    if-eq v15, v11, :cond_1c

    .line 82
    .line 83
    const/16 v11, 0x53

    .line 84
    .line 85
    if-eq v15, v11, :cond_1b

    .line 86
    .line 87
    const/16 v11, 0x61

    .line 88
    .line 89
    if-eq v15, v11, :cond_1a

    .line 90
    .line 91
    const/16 v11, 0x64

    .line 92
    .line 93
    if-eq v15, v11, :cond_19

    .line 94
    .line 95
    const/16 v11, 0x68

    .line 96
    .line 97
    if-eq v15, v11, :cond_18

    .line 98
    .line 99
    const/16 v11, 0x6b

    .line 100
    .line 101
    if-eq v15, v11, :cond_17

    .line 102
    .line 103
    const/16 v11, 0x6d

    .line 104
    .line 105
    if-eq v15, v11, :cond_16

    .line 106
    .line 107
    const/16 v11, 0x73

    .line 108
    .line 109
    if-eq v15, v11, :cond_15

    .line 110
    .line 111
    const/16 v11, 0x75

    .line 112
    .line 113
    if-eq v15, v11, :cond_14

    .line 114
    .line 115
    const/16 v11, 0x77

    .line 116
    .line 117
    if-eq v15, v11, :cond_13

    .line 118
    .line 119
    const/16 v11, 0x79

    .line 120
    .line 121
    const/4 v1, 0x4

    .line 122
    if-eq v15, v11, :cond_3

    .line 123
    .line 124
    const/16 v11, 0x7a

    .line 125
    .line 126
    if-eq v15, v11, :cond_10

    .line 127
    .line 128
    packed-switch v15, :pswitch_data_0

    .line 129
    .line 130
    .line 131
    const/4 v11, 0x0

    .line 132
    packed-switch v15, :pswitch_data_1

    .line 133
    .line 134
    .line 135
    sget-object v17, Lorg/apache/commons/lang3/time/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲兰苏:Lorg/apache/commons/lang3/time/飘花落叶言子楪兰哲世苏;

    .line 136
    .line 137
    packed-switch v15, :pswitch_data_2

    .line 138
    .line 139
    .line 140
    const-string v0, "Illegal pattern component: "

    .line 141
    .line 142
    invoke-virtual {v0, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-static {v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    return-object v11

    .line 150
    :pswitch_0
    const/4 v13, 0x1

    .line 151
    if-ne v14, v13, :cond_1

    .line 152
    .line 153
    sget-object v17, Lorg/apache/commons/lang3/time/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰:Lorg/apache/commons/lang3/time/飘花落叶言子世苏楪哲兰;

    .line 154
    .line 155
    :goto_1
    move v1, v13

    .line 156
    move-object/from16 v11, v17

    .line 157
    .line 158
    :goto_2
    const/4 v15, 0x0

    .line 159
    goto/16 :goto_10

    .line 160
    .line 161
    :cond_1
    const/4 v11, 0x2

    .line 162
    if-ne v14, v11, :cond_2

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_2
    sget-object v17, Lorg/apache/commons/lang3/time/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:Lorg/apache/commons/lang3/time/飘花落叶言子世苏楪哲兰;

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_3
    :pswitch_1
    const/4 v11, 0x2

    .line 169
    goto/16 :goto_d

    .line 170
    .line 171
    :pswitch_2
    move-object/from16 v18, v11

    .line 172
    .line 173
    const/4 v11, 0x2

    .line 174
    const/4 v13, 0x1

    .line 175
    if-eq v14, v13, :cond_6

    .line 176
    .line 177
    if-eq v14, v11, :cond_5

    .line 178
    .line 179
    const/4 v1, 0x3

    .line 180
    if-ne v14, v1, :cond_4

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_4
    const-string v0, "invalid number of X"

    .line 184
    .line 185
    invoke-static {v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    return-object v18

    .line 189
    :cond_5
    sget-object v17, Lorg/apache/commons/lang3/time/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰:Lorg/apache/commons/lang3/time/飘花落叶言子楪兰哲世苏;

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_6
    sget-object v17, Lorg/apache/commons/lang3/time/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:Lorg/apache/commons/lang3/time/飘花落叶言子楪兰哲世苏;

    .line 193
    .line 194
    :goto_3
    move-object/from16 v11, v17

    .line 195
    .line 196
    :goto_4
    const/4 v1, 0x1

    .line 197
    goto :goto_2

    .line 198
    :pswitch_3
    invoke-virtual {v0, v1, v14}, Lorg/apache/commons/lang3/time/FastDatePrinter;->selectNumberRule(II)Lorg/apache/commons/lang3/time/飘花落叶言子楪兰哲苏世;

    .line 199
    .line 200
    .line 201
    move-result-object v17

    .line 202
    goto :goto_3

    .line 203
    :pswitch_4
    if-lt v14, v1, :cond_8

    .line 204
    .line 205
    new-instance v1, Lorg/apache/commons/lang3/time/飘花落叶言子世楪哲兰苏;

    .line 206
    .line 207
    const/4 v11, 0x2

    .line 208
    invoke-direct {v1, v6, v11}, Lorg/apache/commons/lang3/time/飘花落叶言子世楪哲兰苏;-><init>([Ljava/lang/String;I)V

    .line 209
    .line 210
    .line 211
    :cond_7
    :goto_5
    move-object v11, v1

    .line 212
    goto :goto_4

    .line 213
    :cond_8
    const/4 v1, 0x3

    .line 214
    const/4 v11, 0x2

    .line 215
    if-ne v14, v1, :cond_9

    .line 216
    .line 217
    new-instance v1, Lorg/apache/commons/lang3/time/飘花落叶言子世楪哲兰苏;

    .line 218
    .line 219
    invoke-direct {v1, v7, v11}, Lorg/apache/commons/lang3/time/飘花落叶言子世楪哲兰苏;-><init>([Ljava/lang/String;I)V

    .line 220
    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_9
    if-ne v14, v11, :cond_a

    .line 224
    .line 225
    :goto_6
    move-object v11, v2

    .line 226
    goto :goto_4

    .line 227
    :cond_a
    move-object/from16 v11, v16

    .line 228
    .line 229
    goto :goto_4

    .line 230
    :pswitch_5
    move-object/from16 v18, v11

    .line 231
    .line 232
    if-lt v14, v1, :cond_c

    .line 233
    .line 234
    new-instance v1, Lorg/apache/commons/lang3/time/飘花落叶言子世楪哲兰苏;

    .line 235
    .line 236
    iget-object v11, v0, Lorg/apache/commons/lang3/time/FastDatePrinter;->locale:Ljava/util/Locale;

    .line 237
    .line 238
    new-instance v13, Lorg/apache/commons/lang3/time/飘花落叶言子楪世兰苏哲;

    .line 239
    .line 240
    invoke-static {v11}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;

    .line 241
    .line 242
    .line 243
    move-result-object v14

    .line 244
    invoke-direct {v13, v14, v11}, Lorg/apache/commons/lang3/time/飘花落叶言子楪世兰苏哲;-><init>(Ljava/util/Calendar;Ljava/util/Locale;)V

    .line 245
    .line 246
    .line 247
    iget-object v11, v13, Lorg/apache/commons/lang3/time/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Ljava/util/Calendar;

    .line 248
    .line 249
    iget-object v13, v13, Lorg/apache/commons/lang3/time/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/util/Locale;

    .line 250
    .line 251
    const v14, 0x8002

    .line 252
    .line 253
    .line 254
    const/4 v15, 0x2

    .line 255
    invoke-virtual {v11, v15, v14, v13}, Ljava/util/Calendar;->getDisplayNames(IILjava/util/Locale;)Ljava/util/Map;

    .line 256
    .line 257
    .line 258
    move-result-object v11

    .line 259
    if-nez v11, :cond_b

    .line 260
    .line 261
    move-object/from16 v11, v18

    .line 262
    .line 263
    goto :goto_7

    .line 264
    :cond_b
    invoke-interface {v11}, Ljava/util/Map;->size()I

    .line 265
    .line 266
    .line 267
    move-result v13

    .line 268
    new-array v13, v13, [Ljava/lang/String;

    .line 269
    .line 270
    new-instance v14, Lorg/apache/commons/lang3/time/飘花落叶言子楪世哲兰苏;

    .line 271
    .line 272
    const/4 v15, 0x0

    .line 273
    invoke-direct {v14, v13, v15}, Lorg/apache/commons/lang3/time/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;I)V

    .line 274
    .line 275
    .line 276
    invoke-interface {v11, v14}, Ljava/util/Map;->forEach(Ljava/util/function/BiConsumer;)V

    .line 277
    .line 278
    .line 279
    move-object v11, v13

    .line 280
    const/4 v15, 0x2

    .line 281
    :goto_7
    invoke-direct {v1, v11, v15}, Lorg/apache/commons/lang3/time/飘花落叶言子世楪哲兰苏;-><init>([Ljava/lang/String;I)V

    .line 282
    .line 283
    .line 284
    goto :goto_5

    .line 285
    :cond_c
    const/4 v1, 0x3

    .line 286
    const/4 v15, 0x2

    .line 287
    if-ne v14, v1, :cond_e

    .line 288
    .line 289
    new-instance v1, Lorg/apache/commons/lang3/time/飘花落叶言子世楪哲兰苏;

    .line 290
    .line 291
    iget-object v11, v0, Lorg/apache/commons/lang3/time/FastDatePrinter;->locale:Ljava/util/Locale;

    .line 292
    .line 293
    new-instance v13, Lorg/apache/commons/lang3/time/飘花落叶言子楪世兰苏哲;

    .line 294
    .line 295
    invoke-static {v11}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;

    .line 296
    .line 297
    .line 298
    move-result-object v14

    .line 299
    invoke-direct {v13, v14, v11}, Lorg/apache/commons/lang3/time/飘花落叶言子楪世兰苏哲;-><init>(Ljava/util/Calendar;Ljava/util/Locale;)V

    .line 300
    .line 301
    .line 302
    iget-object v11, v13, Lorg/apache/commons/lang3/time/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Ljava/util/Calendar;

    .line 303
    .line 304
    iget-object v13, v13, Lorg/apache/commons/lang3/time/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/util/Locale;

    .line 305
    .line 306
    const v14, 0x8001

    .line 307
    .line 308
    .line 309
    invoke-virtual {v11, v15, v14, v13}, Ljava/util/Calendar;->getDisplayNames(IILjava/util/Locale;)Ljava/util/Map;

    .line 310
    .line 311
    .line 312
    move-result-object v11

    .line 313
    if-nez v11, :cond_d

    .line 314
    .line 315
    move-object/from16 v11, v18

    .line 316
    .line 317
    goto :goto_8

    .line 318
    :cond_d
    invoke-interface {v11}, Ljava/util/Map;->size()I

    .line 319
    .line 320
    .line 321
    move-result v13

    .line 322
    new-array v13, v13, [Ljava/lang/String;

    .line 323
    .line 324
    new-instance v14, Lorg/apache/commons/lang3/time/飘花落叶言子楪世哲兰苏;

    .line 325
    .line 326
    const/4 v15, 0x0

    .line 327
    invoke-direct {v14, v13, v15}, Lorg/apache/commons/lang3/time/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;I)V

    .line 328
    .line 329
    .line 330
    invoke-interface {v11, v14}, Ljava/util/Map;->forEach(Ljava/util/function/BiConsumer;)V

    .line 331
    .line 332
    .line 333
    move-object v11, v13

    .line 334
    const/4 v15, 0x2

    .line 335
    :goto_8
    invoke-direct {v1, v11, v15}, Lorg/apache/commons/lang3/time/飘花落叶言子世楪哲兰苏;-><init>([Ljava/lang/String;I)V

    .line 336
    .line 337
    .line 338
    goto :goto_5

    .line 339
    :cond_e
    if-ne v14, v15, :cond_a

    .line 340
    .line 341
    goto :goto_6

    .line 342
    :pswitch_6
    const/16 v1, 0xa

    .line 343
    .line 344
    invoke-virtual {v0, v1, v14}, Lorg/apache/commons/lang3/time/FastDatePrinter;->selectNumberRule(II)Lorg/apache/commons/lang3/time/飘花落叶言子楪兰哲苏世;

    .line 345
    .line 346
    .line 347
    move-result-object v17

    .line 348
    goto/16 :goto_3

    .line 349
    .line 350
    :pswitch_7
    const/16 v1, 0xb

    .line 351
    .line 352
    invoke-virtual {v0, v1, v14}, Lorg/apache/commons/lang3/time/FastDatePrinter;->selectNumberRule(II)Lorg/apache/commons/lang3/time/飘花落叶言子楪兰哲苏世;

    .line 353
    .line 354
    .line 355
    move-result-object v17

    .line 356
    goto/16 :goto_3

    .line 357
    .line 358
    :pswitch_8
    new-instance v1, Lorg/apache/commons/lang3/time/飘花落叶言子世楪哲兰苏;

    .line 359
    .line 360
    const/4 v15, 0x0

    .line 361
    invoke-direct {v1, v5, v15}, Lorg/apache/commons/lang3/time/飘花落叶言子世楪哲兰苏;-><init>([Ljava/lang/String;I)V

    .line 362
    .line 363
    .line 364
    :goto_9
    move-object v11, v1

    .line 365
    const/4 v1, 0x1

    .line 366
    goto/16 :goto_10

    .line 367
    .line 368
    :pswitch_9
    const/16 v1, 0x8

    .line 369
    .line 370
    invoke-virtual {v0, v1, v14}, Lorg/apache/commons/lang3/time/FastDatePrinter;->selectNumberRule(II)Lorg/apache/commons/lang3/time/飘花落叶言子楪兰哲苏世;

    .line 371
    .line 372
    .line 373
    move-result-object v17

    .line 374
    goto/16 :goto_3

    .line 375
    .line 376
    :pswitch_a
    new-instance v11, Lorg/apache/commons/lang3/time/飘花落叶言子世楪哲兰苏;

    .line 377
    .line 378
    if-ge v14, v1, :cond_f

    .line 379
    .line 380
    move-object v1, v9

    .line 381
    :goto_a
    const/4 v13, 0x7

    .line 382
    goto :goto_b

    .line 383
    :cond_f
    move-object v1, v8

    .line 384
    goto :goto_a

    .line 385
    :goto_b
    invoke-direct {v11, v1, v13}, Lorg/apache/commons/lang3/time/飘花落叶言子世楪哲兰苏;-><init>([Ljava/lang/String;I)V

    .line 386
    .line 387
    .line 388
    goto/16 :goto_4

    .line 389
    .line 390
    :pswitch_b
    const/4 v1, 0x6

    .line 391
    invoke-virtual {v0, v1, v14}, Lorg/apache/commons/lang3/time/FastDatePrinter;->selectNumberRule(II)Lorg/apache/commons/lang3/time/飘花落叶言子楪兰哲苏世;

    .line 392
    .line 393
    .line 394
    move-result-object v17

    .line 395
    goto/16 :goto_3

    .line 396
    .line 397
    :cond_10
    new-instance v11, Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰哲苏;

    .line 398
    .line 399
    iget-object v13, v0, Lorg/apache/commons/lang3/time/FastDatePrinter;->timeZone:Ljava/util/TimeZone;

    .line 400
    .line 401
    iget-object v15, v0, Lorg/apache/commons/lang3/time/FastDatePrinter;->locale:Ljava/util/Locale;

    .line 402
    .line 403
    if-lt v14, v1, :cond_11

    .line 404
    .line 405
    const/4 v1, 0x1

    .line 406
    goto :goto_c

    .line 407
    :cond_11
    const/4 v1, 0x0

    .line 408
    :goto_c
    invoke-direct {v11, v1, v13, v15}, Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰哲苏;-><init>(ILjava/util/TimeZone;Ljava/util/Locale;)V

    .line 409
    .line 410
    .line 411
    goto/16 :goto_4

    .line 412
    .line 413
    :goto_d
    if-ne v14, v11, :cond_12

    .line 414
    .line 415
    sget-object v1, Lorg/apache/commons/lang3/time/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲苏兰:Lorg/apache/commons/lang3/time/飘花落叶言子世苏楪兰哲;

    .line 416
    .line 417
    goto :goto_e

    .line 418
    :cond_12
    invoke-static {v14, v1}, Ljava/lang/Math;->max(II)I

    .line 419
    .line 420
    .line 421
    move-result v1

    .line 422
    const/4 v13, 0x1

    .line 423
    invoke-virtual {v0, v13, v1}, Lorg/apache/commons/lang3/time/FastDatePrinter;->selectNumberRule(II)Lorg/apache/commons/lang3/time/飘花落叶言子楪兰哲苏世;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    :goto_e
    const/16 v11, 0x59

    .line 428
    .line 429
    if-ne v15, v11, :cond_7

    .line 430
    .line 431
    new-instance v11, Lorg/apache/commons/lang3/time/飘花落叶言子楪兰苏哲世;

    .line 432
    .line 433
    const/4 v13, 0x3

    .line 434
    invoke-direct {v11, v1, v13}, Lorg/apache/commons/lang3/time/飘花落叶言子楪兰苏哲世;-><init>(Lorg/apache/commons/lang3/time/飘花落叶言子楪兰哲苏世;I)V

    .line 435
    .line 436
    .line 437
    goto/16 :goto_4

    .line 438
    .line 439
    :cond_13
    const/4 v13, 0x3

    .line 440
    invoke-virtual {v0, v13, v14}, Lorg/apache/commons/lang3/time/FastDatePrinter;->selectNumberRule(II)Lorg/apache/commons/lang3/time/飘花落叶言子楪兰哲苏世;

    .line 441
    .line 442
    .line 443
    move-result-object v17

    .line 444
    goto/16 :goto_3

    .line 445
    .line 446
    :cond_14
    new-instance v1, Lorg/apache/commons/lang3/time/飘花落叶言子楪兰苏哲世;

    .line 447
    .line 448
    const/4 v13, 0x7

    .line 449
    invoke-virtual {v0, v13, v14}, Lorg/apache/commons/lang3/time/FastDatePrinter;->selectNumberRule(II)Lorg/apache/commons/lang3/time/飘花落叶言子楪兰哲苏世;

    .line 450
    .line 451
    .line 452
    move-result-object v11

    .line 453
    const/4 v15, 0x0

    .line 454
    invoke-direct {v1, v11, v15}, Lorg/apache/commons/lang3/time/飘花落叶言子楪兰苏哲世;-><init>(Lorg/apache/commons/lang3/time/飘花落叶言子楪兰哲苏世;I)V

    .line 455
    .line 456
    .line 457
    goto :goto_9

    .line 458
    :cond_15
    const/16 v1, 0xd

    .line 459
    .line 460
    invoke-virtual {v0, v1, v14}, Lorg/apache/commons/lang3/time/FastDatePrinter;->selectNumberRule(II)Lorg/apache/commons/lang3/time/飘花落叶言子楪兰哲苏世;

    .line 461
    .line 462
    .line 463
    move-result-object v17

    .line 464
    goto/16 :goto_3

    .line 465
    .line 466
    :cond_16
    const/16 v1, 0xc

    .line 467
    .line 468
    invoke-virtual {v0, v1, v14}, Lorg/apache/commons/lang3/time/FastDatePrinter;->selectNumberRule(II)Lorg/apache/commons/lang3/time/飘花落叶言子楪兰哲苏世;

    .line 469
    .line 470
    .line 471
    move-result-object v17

    .line 472
    goto/16 :goto_3

    .line 473
    .line 474
    :cond_17
    new-instance v1, Lorg/apache/commons/lang3/time/飘花落叶言子楪兰苏哲世;

    .line 475
    .line 476
    const/16 v11, 0xb

    .line 477
    .line 478
    invoke-virtual {v0, v11, v14}, Lorg/apache/commons/lang3/time/FastDatePrinter;->selectNumberRule(II)Lorg/apache/commons/lang3/time/飘花落叶言子楪兰哲苏世;

    .line 479
    .line 480
    .line 481
    move-result-object v11

    .line 482
    const/4 v15, 0x2

    .line 483
    invoke-direct {v1, v11, v15}, Lorg/apache/commons/lang3/time/飘花落叶言子楪兰苏哲世;-><init>(Lorg/apache/commons/lang3/time/飘花落叶言子楪兰哲苏世;I)V

    .line 484
    .line 485
    .line 486
    goto/16 :goto_5

    .line 487
    .line 488
    :cond_18
    new-instance v1, Lorg/apache/commons/lang3/time/飘花落叶言子楪兰苏哲世;

    .line 489
    .line 490
    const/16 v11, 0xa

    .line 491
    .line 492
    invoke-virtual {v0, v11, v14}, Lorg/apache/commons/lang3/time/FastDatePrinter;->selectNumberRule(II)Lorg/apache/commons/lang3/time/飘花落叶言子楪兰哲苏世;

    .line 493
    .line 494
    .line 495
    move-result-object v11

    .line 496
    const/4 v13, 0x1

    .line 497
    invoke-direct {v1, v11, v13}, Lorg/apache/commons/lang3/time/飘花落叶言子楪兰苏哲世;-><init>(Lorg/apache/commons/lang3/time/飘花落叶言子楪兰哲苏世;I)V

    .line 498
    .line 499
    .line 500
    move-object v11, v1

    .line 501
    move v1, v13

    .line 502
    goto/16 :goto_2

    .line 503
    .line 504
    :cond_19
    const/4 v1, 0x5

    .line 505
    invoke-virtual {v0, v1, v14}, Lorg/apache/commons/lang3/time/FastDatePrinter;->selectNumberRule(II)Lorg/apache/commons/lang3/time/飘花落叶言子楪兰哲苏世;

    .line 506
    .line 507
    .line 508
    move-result-object v17

    .line 509
    goto/16 :goto_3

    .line 510
    .line 511
    :cond_1a
    new-instance v1, Lorg/apache/commons/lang3/time/飘花落叶言子世楪哲兰苏;

    .line 512
    .line 513
    const/16 v11, 0x9

    .line 514
    .line 515
    invoke-direct {v1, v3, v11}, Lorg/apache/commons/lang3/time/飘花落叶言子世楪哲兰苏;-><init>([Ljava/lang/String;I)V

    .line 516
    .line 517
    .line 518
    goto/16 :goto_5

    .line 519
    .line 520
    :cond_1b
    const/16 v1, 0xe

    .line 521
    .line 522
    invoke-virtual {v0, v1, v14}, Lorg/apache/commons/lang3/time/FastDatePrinter;->selectNumberRule(II)Lorg/apache/commons/lang3/time/飘花落叶言子楪兰哲苏世;

    .line 523
    .line 524
    .line 525
    move-result-object v17

    .line 526
    goto/16 :goto_3

    .line 527
    .line 528
    :cond_1c
    const/4 v1, 0x1

    .line 529
    invoke-virtual {v13, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v11

    .line 533
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 534
    .line 535
    .line 536
    move-result v13

    .line 537
    if-ne v13, v1, :cond_1d

    .line 538
    .line 539
    new-instance v13, Lorg/apache/commons/lang3/time/飘花落叶言子楪兰苏世哲;

    .line 540
    .line 541
    const/4 v15, 0x0

    .line 542
    invoke-virtual {v11, v15}, Ljava/lang/String;->charAt(I)C

    .line 543
    .line 544
    .line 545
    move-result v11

    .line 546
    invoke-direct {v13, v11}, Lorg/apache/commons/lang3/time/飘花落叶言子楪兰苏世哲;-><init>(C)V

    .line 547
    .line 548
    .line 549
    :goto_f
    move-object v11, v13

    .line 550
    goto :goto_10

    .line 551
    :cond_1d
    const/4 v15, 0x0

    .line 552
    new-instance v13, Lorg/apache/commons/lang3/time/飘花落叶言子世楪哲苏兰;

    .line 553
    .line 554
    invoke-direct {v13, v11}, Lorg/apache/commons/lang3/time/飘花落叶言子世楪哲苏兰;-><init>(Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    goto :goto_f

    .line 558
    :goto_10
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    add-int/2addr v12, v1

    .line 562
    move v11, v15

    .line 563
    move-object/from16 v1, v16

    .line 564
    .line 565
    goto/16 :goto_0

    .line 566
    .line 567
    :cond_1e
    :goto_11
    return-object v4

    .line 568
    nop

    .line 569
    :pswitch_data_0
    .packed-switch 0x44
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch

    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    :pswitch_data_1
    .packed-switch 0x4b
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    :pswitch_data_2
    .packed-switch 0x57
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public parseToken(Ljava/lang/String;[I)Ljava/lang/String;
    .locals 8

    .line 1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aget v1, p2, v0

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-static {v3}, Lorg/apache/commons/lang3/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(C)Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    :goto_0
    add-int/lit8 v4, v1, 0x1

    .line 27
    .line 28
    if-ge v4, v2, :cond_5

    .line 29
    .line 30
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eq v5, v3, :cond_0

    .line 35
    .line 36
    goto :goto_3

    .line 37
    :cond_0
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    move v1, v4

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/16 v3, 0x27

    .line 43
    .line 44
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    move v4, v0

    .line 48
    :goto_1
    if-ge v1, v2, :cond_5

    .line 49
    .line 50
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-ne v5, v3, :cond_3

    .line 55
    .line 56
    add-int/lit8 v6, v1, 0x1

    .line 57
    .line 58
    if-ge v6, v2, :cond_2

    .line 59
    .line 60
    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    if-ne v7, v3, :cond_2

    .line 65
    .line 66
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    move v1, v6

    .line 70
    goto :goto_2

    .line 71
    :cond_2
    xor-int/lit8 v4, v4, 0x1

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    if-nez v4, :cond_4

    .line 75
    .line 76
    invoke-static {v5}, Lorg/apache/commons/lang3/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(C)Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    if-eqz v6, :cond_4

    .line 81
    .line 82
    add-int/lit8 v1, v1, -0x1

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_4
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_5
    :goto_3
    aput v1, p2, v0

    .line 92
    .line 93
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0
.end method

.method public selectNumberRule(II)Lorg/apache/commons/lang3/time/飘花落叶言子楪兰哲苏世;
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    if-eq p2, p0, :cond_1

    .line 3
    .line 4
    const/4 p0, 0x2

    .line 5
    if-eq p2, p0, :cond_0

    .line 6
    .line 7
    new-instance p0, Lorg/apache/commons/lang3/time/飘花落叶言子世楪苏哲兰;

    .line 8
    .line 9
    invoke-direct {p0, p1, p2}, Lorg/apache/commons/lang3/time/飘花落叶言子世楪苏哲兰;-><init>(II)V

    .line 10
    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance p0, Lorg/apache/commons/lang3/time/飘花落叶言子世苏哲楪兰;

    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-direct {p0, p1, p2}, Lorg/apache/commons/lang3/time/飘花落叶言子世苏哲楪兰;-><init>(II)V

    .line 17
    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_1
    new-instance p0, Lorg/apache/commons/lang3/time/飘花落叶言子世苏哲楪兰;

    .line 21
    .line 22
    const/4 p2, 0x1

    .line 23
    invoke-direct {p0, p1, p2}, Lorg/apache/commons/lang3/time/飘花落叶言子世苏哲楪兰;-><init>(II)V

    .line 24
    .line 25
    .line 26
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "FastDatePrinter["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lorg/apache/commons/lang3/time/FastDatePrinter;->pattern:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ","

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Lorg/apache/commons/lang3/time/FastDatePrinter;->locale:Ljava/util/Locale;

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Lorg/apache/commons/lang3/time/FastDatePrinter;->timeZone:Ljava/util/TimeZone;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p0, "]"

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method
