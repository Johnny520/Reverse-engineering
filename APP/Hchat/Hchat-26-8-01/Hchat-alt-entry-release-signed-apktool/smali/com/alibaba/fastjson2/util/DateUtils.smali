.class public Lcom/alibaba/fastjson2/util/DateUtils;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;,
        Lcom/alibaba/fastjson2/util/DateUtils$CacheDate10;,
        Lcom/alibaba/fastjson2/util/DateUtils$CacheDate8;
    }
.end annotation


# static fields
.field static DATE_TIME_FORMATTER_34:Ljava/time/format/DateTimeFormatter; = null

.field static DATE_TIME_FORMATTER_COOKIE:Ljava/time/format/DateTimeFormatter; = null

.field static DATE_TIME_FORMATTER_COOKIE_LOCAL:Ljava/time/format/DateTimeFormatter; = null

.field static DATE_TIME_FORMATTER_RFC_2822:Ljava/time/format/DateTimeFormatter; = null

.field public static final DEFAULT_ZONE_ID:Ljava/time/ZoneId;

.field public static final LOCAL_DATE_19700101:Ljava/time/LocalDate;

.field static final LOCAL_EPOCH_DAY:I

.field public static final OFFSET_8_ZONE_ID:Ljava/time/ZoneId;

.field public static final OFFSET_8_ZONE_ID_NAME:Ljava/lang/String; = "+08:00"

.field private static final POWERS:[I

.field public static final SHANGHAI_ZONE_ID:Ljava/time/ZoneId;

.field public static final SHANGHAI_ZONE_ID_NAME:Ljava/lang/String; = "Asia/Shanghai"

.field public static final SHANGHAI_ZONE_RULES:Ljava/time/zone/ZoneRules;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const-string v0, "Asia/Shanghai"

    .line 2
    .line 3
    invoke-static {}, Ljava/time/ZoneId;->systemDefault()Ljava/time/ZoneId;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sput-object v1, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    :try_start_0
    invoke-virtual {v1}, Ljava/time/ZoneId;->getId()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {v0}, Ljava/time/ZoneId;->of(Ljava/lang/String;)Ljava/time/ZoneId;

    .line 22
    .line 23
    .line 24
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    :goto_0
    :try_start_1
    invoke-virtual {v1}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 26
    .line 27
    .line 28
    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 29
    goto :goto_1

    .line 30
    :catch_0
    move-object v1, v2

    .line 31
    :catch_1
    :goto_1
    sput-object v1, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_ID:Ljava/time/ZoneId;

    .line 32
    .line 33
    sput-object v2, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_RULES:Ljava/time/zone/ZoneRules;

    .line 34
    .line 35
    const-string v0, "+08:00"

    .line 36
    .line 37
    invoke-static {v0}, Ljava/time/ZoneId;->of(Ljava/lang/String;)Ljava/time/ZoneId;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->OFFSET_8_ZONE_ID:Ljava/time/ZoneId;

    .line 42
    .line 43
    const/16 v0, 0x7b2

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    invoke-static {v0, v3, v3}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sput-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->LOCAL_DATE_19700101:Ljava/time/LocalDate;

    .line 51
    .line 52
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 53
    .line 54
    .line 55
    move-result-wide v3

    .line 56
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 57
    .line 58
    const-wide/16 v5, 0x3e8

    .line 59
    .line 60
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->floorDiv(JJ)J

    .line 61
    .line 62
    .line 63
    move-result-wide v5

    .line 64
    if-eq v0, v1, :cond_2

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    if-ne v1, v2, :cond_1

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_1
    invoke-static {v3, v4}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v0}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0, v1}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/Instant;)Ljava/time/ZoneOffset;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    goto :goto_3

    .line 90
    :cond_2
    :goto_2
    invoke-static {v5, v6}, Lcom/alibaba/fastjson2/util/DateUtils;->getShanghaiZoneOffsetTotalSeconds(J)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    :goto_3
    int-to-long v0, v0

    .line 95
    add-long/2addr v5, v0

    .line 96
    const-wide/32 v0, 0x15180

    .line 97
    .line 98
    .line 99
    invoke-static {v5, v6, v0, v1}, Ljava/lang/Math;->floorDiv(JJ)J

    .line 100
    .line 101
    .line 102
    move-result-wide v0

    .line 103
    long-to-int v0, v0

    .line 104
    sput v0, Lcom/alibaba/fastjson2/util/DateUtils;->LOCAL_EPOCH_DAY:I

    .line 105
    .line 106
    const/16 v0, 0x10

    .line 107
    .line 108
    new-array v0, v0, [I

    .line 109
    .line 110
    fill-array-data v0, :array_0

    .line 111
    .line 112
    .line 113
    sput-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->POWERS:[I

    .line 114
    .line 115
    return-void

    .line 116
    nop

    .line 117
    :array_0
    .array-data 4
        0x1
        0xa
        0x64
        0x3e8
        0x2710
        0x186a0
        0xf4240
        0x989680
        0x5f5e100
        0x3b9aca00
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static format(III)Ljava/lang/String;
    .locals 1

    .line 314
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_DASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    invoke-static {p0, p1, p2, v0}, Lcom/alibaba/fastjson2/util/DateUtils;->format(IIILcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static format(IIIIII)Ljava/lang/String;
    .locals 7

    .line 348
    sget-object v6, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_DASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    move v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-static/range {v0 .. v6}, Lcom/alibaba/fastjson2/util/DateUtils;->format(IIIIIILcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static format(IIIIIILcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;
    .locals 14

    move-object/from16 v0, p6

    .line 349
    div-int/lit8 v1, p0, 0x64

    mul-int/lit8 v2, v1, 0x64

    sub-int/2addr p0, v2

    const/16 v2, 0x13

    .line 350
    new-array v2, v2, [C

    .line 351
    sget-object v3, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_DOT:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    const/16 v4, 0x20

    const/16 v5, 0xa

    const-wide/16 v6, 0x10

    if-ne v0, v3, :cond_0

    .line 352
    sget-object v0, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    sget-wide v8, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_CHAR_BASE_OFFSET:J

    sget-object v3, Lcom/alibaba/fastjson2/util/IOUtils;->PACKED_DIGITS_UTF16:[I

    aget v10, v3, p2

    invoke-virtual {v0, v2, v8, v9, v10}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    const/4 v10, 0x2

    const/16 v11, 0x2e

    .line 353
    aput-char v11, v2, v10

    const-wide/16 v12, 0x6

    add-long/2addr v12, v8

    .line 354
    aget v10, v3, p1

    invoke-virtual {v0, v2, v12, v13, v10}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    const/4 v10, 0x5

    .line 355
    aput-char v11, v2, v10

    const-wide/16 v10, 0xc

    add-long/2addr v10, v8

    .line 356
    aget v1, v3, v1

    invoke-virtual {v0, v2, v10, v11, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-long/2addr v8, v6

    .line 357
    aget p0, v3, p0

    invoke-virtual {v0, v2, v8, v9, p0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 358
    aput-char v4, v2, v5

    goto :goto_2

    .line 359
    :cond_0
    sget-object v3, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_DASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    if-ne v0, v3, :cond_1

    goto :goto_0

    :cond_1
    const/16 v4, 0x54

    .line 360
    :goto_0
    sget-object v3, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_SLASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    if-ne v0, v3, :cond_2

    const/16 v0, 0x2f

    goto :goto_1

    :cond_2
    const/16 v0, 0x2d

    .line 361
    :goto_1
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    sget-wide v8, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_CHAR_BASE_OFFSET:J

    sget-object v10, Lcom/alibaba/fastjson2/util/IOUtils;->PACKED_DIGITS_UTF16:[I

    aget v1, v10, v1

    invoke-virtual {v3, v2, v8, v9, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    const-wide/16 v11, 0x4

    add-long/2addr v11, v8

    .line 362
    aget p0, v10, p0

    invoke-virtual {v3, v2, v11, v12, p0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    const/4 p0, 0x4

    .line 363
    aput-char v0, v2, p0

    const-wide/16 v11, 0xa

    add-long/2addr v11, v8

    .line 364
    aget p0, v10, p1

    invoke-virtual {v3, v2, v11, v12, p0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    const/4 p0, 0x7

    .line 365
    aput-char v0, v2, p0

    add-long/2addr v8, v6

    .line 366
    aget p0, v10, p2

    invoke-virtual {v3, v2, v8, v9, p0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 367
    aput-char v4, v2, v5

    :goto_2
    const/16 p0, 0xb

    move/from16 v0, p3

    move/from16 v1, p4

    move/from16 v3, p5

    .line 368
    invoke-static {v2, p0, v0, v1, v3}, Lcom/alibaba/fastjson2/util/IOUtils;->writeLocalTime([CIIII)V

    .line 369
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v2}, Ljava/lang/String;-><init>([C)V

    return-object p0
.end method

.method public static format(IIILcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;
    .locals 10

    .line 315
    div-int/lit8 v0, p0, 0x64

    mul-int/lit8 v1, v0, 0x64

    sub-int/2addr p0, v1

    const/16 v1, 0xa

    .line 316
    new-array v1, v1, [C

    .line 317
    sget-object v2, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_DOT:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    const-wide/16 v3, 0x10

    if-ne p3, v2, :cond_0

    .line 318
    sget-object p3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_CHAR_BASE_OFFSET:J

    sget-object v2, Lcom/alibaba/fastjson2/util/IOUtils;->PACKED_DIGITS_UTF16:[I

    aget p2, v2, p2

    invoke-virtual {p3, v1, v5, v6, p2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    const/4 p2, 0x2

    const/16 v7, 0x2e

    .line 319
    aput-char v7, v1, p2

    const-wide/16 v8, 0x6

    add-long/2addr v8, v5

    .line 320
    aget p1, v2, p1

    invoke-virtual {p3, v1, v8, v9, p1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    const/4 p1, 0x5

    .line 321
    aput-char v7, v1, p1

    const-wide/16 p1, 0xc

    add-long/2addr p1, v5

    .line 322
    aget v0, v2, v0

    invoke-virtual {p3, v1, p1, p2, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-long/2addr v5, v3

    .line 323
    aget p0, v2, p0

    invoke-virtual {p3, v1, v5, v6, p0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_1

    .line 324
    :cond_0
    sget-object v2, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_DASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    if-ne p3, v2, :cond_1

    const/16 p3, 0x2d

    goto :goto_0

    :cond_1
    const/16 p3, 0x2f

    .line 325
    :goto_0
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_CHAR_BASE_OFFSET:J

    sget-object v7, Lcom/alibaba/fastjson2/util/IOUtils;->PACKED_DIGITS_UTF16:[I

    aget v0, v7, v0

    invoke-virtual {v2, v1, v5, v6, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    const-wide/16 v8, 0x4

    add-long/2addr v8, v5

    .line 326
    aget p0, v7, p0

    invoke-virtual {v2, v1, v8, v9, p0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    const/4 p0, 0x4

    .line 327
    aput-char p3, v1, p0

    const-wide/16 v8, 0xa

    add-long/2addr v8, v5

    .line 328
    aget p0, v7, p1

    invoke-virtual {v2, v1, v8, v9, p0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    const/4 p0, 0x7

    .line 329
    aput-char p3, v1, p0

    add-long/2addr v5, v3

    .line 330
    aget p0, v7, p2

    invoke-virtual {v2, v1, v5, v6, p0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 331
    :goto_1
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    return-object p0
.end method

.method public static format(J)Ljava/lang/String;
    .locals 1

    .line 332
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_DASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    invoke-static {p0, p1, v0}, Lcom/alibaba/fastjson2/util/DateUtils;->format(JLcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static format(JLcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;
    .locals 26

    .line 1
    move-object/from16 v6, p2

    .line 2
    .line 3
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 4
    .line 5
    const-wide/16 v1, 0x3e8

    .line 6
    .line 7
    move-wide/from16 v3, p0

    .line 8
    .line 9
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->floorDiv(JJ)J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    sget-object v5, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_ID:Ljava/time/ZoneId;

    .line 14
    .line 15
    if-eq v0, v5, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    sget-object v7, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_RULES:Ljava/time/zone/ZoneRules;

    .line 22
    .line 23
    if-ne v5, v7, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v3, v4}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v0}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0, v3}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/Instant;)Ljava/time/ZoneOffset;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    :goto_0
    invoke-static {v1, v2}, Lcom/alibaba/fastjson2/util/DateUtils;->getShanghaiZoneOffsetTotalSeconds(J)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    :goto_1
    int-to-long v3, v0

    .line 48
    add-long/2addr v1, v3

    .line 49
    const-wide/32 v3, 0x15180

    .line 50
    .line 51
    .line 52
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->floorDiv(JJ)J

    .line 53
    .line 54
    .line 55
    move-result-wide v7

    .line 56
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->floorMod(JJ)J

    .line 57
    .line 58
    .line 59
    move-result-wide v0

    .line 60
    long-to-int v0, v0

    .line 61
    const-wide/32 v1, 0xafa6c

    .line 62
    .line 63
    .line 64
    add-long/2addr v1, v7

    .line 65
    const-wide/16 v3, 0x0

    .line 66
    .line 67
    cmp-long v5, v1, v3

    .line 68
    .line 69
    const-wide/16 v9, 0x1

    .line 70
    .line 71
    const-wide/32 v11, 0x23ab1

    .line 72
    .line 73
    .line 74
    const-wide/16 v13, 0x190

    .line 75
    .line 76
    if-gez v5, :cond_2

    .line 77
    .line 78
    const-wide/32 v15, 0xafa6d

    .line 79
    .line 80
    .line 81
    add-long/2addr v7, v15

    .line 82
    div-long/2addr v7, v11

    .line 83
    sub-long/2addr v7, v9

    .line 84
    mul-long v15, v7, v13

    .line 85
    .line 86
    neg-long v7, v7

    .line 87
    mul-long/2addr v7, v11

    .line 88
    add-long/2addr v1, v7

    .line 89
    goto :goto_2

    .line 90
    :cond_2
    move-wide v15, v3

    .line 91
    :goto_2
    mul-long v7, v1, v13

    .line 92
    .line 93
    const-wide/16 v17, 0x24f

    .line 94
    .line 95
    add-long v7, v7, v17

    .line 96
    .line 97
    div-long/2addr v7, v11

    .line 98
    const-wide/16 v11, 0x16d

    .line 99
    .line 100
    mul-long v17, v7, v11

    .line 101
    .line 102
    const-wide/16 v19, 0x4

    .line 103
    .line 104
    div-long v21, v7, v19

    .line 105
    .line 106
    add-long v21, v21, v17

    .line 107
    .line 108
    const-wide/16 v17, 0x64

    .line 109
    .line 110
    div-long v23, v7, v17

    .line 111
    .line 112
    sub-long v21, v21, v23

    .line 113
    .line 114
    div-long v23, v7, v13

    .line 115
    .line 116
    add-long v23, v23, v21

    .line 117
    .line 118
    sub-long v21, v1, v23

    .line 119
    .line 120
    cmp-long v5, v21, v3

    .line 121
    .line 122
    if-gez v5, :cond_3

    .line 123
    .line 124
    sub-long/2addr v7, v9

    .line 125
    mul-long/2addr v11, v7

    .line 126
    div-long v9, v7, v19

    .line 127
    .line 128
    add-long/2addr v9, v11

    .line 129
    div-long v11, v7, v17

    .line 130
    .line 131
    sub-long/2addr v9, v11

    .line 132
    div-long v11, v7, v13

    .line 133
    .line 134
    add-long/2addr v11, v9

    .line 135
    sub-long v21, v1, v11

    .line 136
    .line 137
    :cond_3
    move-wide/from16 v1, v21

    .line 138
    .line 139
    add-long/2addr v7, v15

    .line 140
    long-to-int v1, v1

    .line 141
    mul-int/lit8 v2, v1, 0x5

    .line 142
    .line 143
    add-int/lit8 v2, v2, 0x2

    .line 144
    .line 145
    div-int/lit16 v2, v2, 0x99

    .line 146
    .line 147
    add-int/lit8 v5, v2, 0x2

    .line 148
    .line 149
    rem-int/lit8 v5, v5, 0xc

    .line 150
    .line 151
    add-int/lit8 v5, v5, 0x1

    .line 152
    .line 153
    mul-int/lit16 v9, v2, 0x132

    .line 154
    .line 155
    add-int/lit8 v9, v9, 0x5

    .line 156
    .line 157
    div-int/lit8 v9, v9, 0xa

    .line 158
    .line 159
    sub-int/2addr v1, v9

    .line 160
    add-int/lit8 v1, v1, 0x1

    .line 161
    .line 162
    div-int/lit8 v2, v2, 0xa

    .line 163
    .line 164
    int-to-long v9, v2

    .line 165
    add-long/2addr v7, v9

    .line 166
    const-wide/32 v9, -0x3b9ac9ff

    .line 167
    .line 168
    .line 169
    cmp-long v2, v7, v9

    .line 170
    .line 171
    if-ltz v2, :cond_7

    .line 172
    .line 173
    const-wide/32 v9, 0x3b9ac9ff

    .line 174
    .line 175
    .line 176
    cmp-long v2, v7, v9

    .line 177
    .line 178
    if-gtz v2, :cond_7

    .line 179
    .line 180
    long-to-int v2, v7

    .line 181
    sget-object v7, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_DASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 182
    .line 183
    if-eq v6, v7, :cond_4

    .line 184
    .line 185
    sget-object v7, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_SLASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 186
    .line 187
    if-eq v6, v7, :cond_4

    .line 188
    .line 189
    sget-object v7, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_DOT:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 190
    .line 191
    if-ne v6, v7, :cond_5

    .line 192
    .line 193
    :cond_4
    move v0, v2

    .line 194
    move v2, v1

    .line 195
    move v1, v5

    .line 196
    goto :goto_3

    .line 197
    :cond_5
    int-to-long v7, v0

    .line 198
    cmp-long v0, v7, v3

    .line 199
    .line 200
    if-ltz v0, :cond_6

    .line 201
    .line 202
    const-wide/32 v3, 0x1517f

    .line 203
    .line 204
    .line 205
    cmp-long v0, v7, v3

    .line 206
    .line 207
    if-gtz v0, :cond_6

    .line 208
    .line 209
    const-wide/16 v3, 0xe10

    .line 210
    .line 211
    div-long v3, v7, v3

    .line 212
    .line 213
    long-to-int v3, v3

    .line 214
    mul-int/lit16 v0, v3, 0xe10

    .line 215
    .line 216
    int-to-long v9, v0

    .line 217
    sub-long/2addr v7, v9

    .line 218
    const-wide/16 v9, 0x3c

    .line 219
    .line 220
    div-long v9, v7, v9

    .line 221
    .line 222
    long-to-int v4, v9

    .line 223
    mul-int/lit8 v0, v4, 0x3c

    .line 224
    .line 225
    int-to-long v9, v0

    .line 226
    sub-long/2addr v7, v9

    .line 227
    long-to-int v0, v7

    .line 228
    move/from16 v25, v5

    .line 229
    .line 230
    move v5, v0

    .line 231
    move v0, v2

    .line 232
    move v2, v1

    .line 233
    move/from16 v1, v25

    .line 234
    .line 235
    invoke-static/range {v0 .. v6}, Lcom/alibaba/fastjson2/util/DateUtils;->format(IIIIIILcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    return-object v0

    .line 240
    :cond_6
    new-instance v0, Ljava/time/DateTimeException;

    .line 241
    .line 242
    const-string v1, "Invalid secondOfDay "

    .line 243
    .line 244
    invoke-static {v7, v8, v1}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-direct {v0, v1}, Ljava/time/DateTimeException;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    throw v0

    .line 252
    :goto_3
    invoke-static {v0, v1, v2, v6}, Lcom/alibaba/fastjson2/util/DateUtils;->format(IIILcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    return-object v0

    .line 257
    :cond_7
    new-instance v0, Ljava/time/DateTimeException;

    .line 258
    .line 259
    const-string v1, "Invalid year "

    .line 260
    .line 261
    invoke-static {v7, v8, v1}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-direct {v0, v1}, Ljava/time/DateTimeException;-><init>(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    throw v0
.end method

.method public static format(Ljava/time/LocalDate;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 303
    :cond_0
    invoke-virtual {p0}, Ljava/time/LocalDate;->getYear()I

    move-result v0

    .line 304
    invoke-virtual {p0}, Ljava/time/LocalDate;->getMonthValue()I

    move-result v1

    .line 305
    invoke-virtual {p0}, Ljava/time/LocalDate;->getDayOfMonth()I

    move-result v2

    .line 306
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/4 v4, -0x1

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v3, "dd.MM.yyyy"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x5

    goto :goto_0

    :sswitch_1
    const-string v3, "yyyy-MM-ddTHH:mm:ss"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    const/4 v4, 0x4

    goto :goto_0

    :sswitch_2
    const-string v3, "yyyy-MM-dd\'T\'HH:mm:ss"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    const/4 v4, 0x3

    goto :goto_0

    :sswitch_3
    const-string v3, "yyyy-MM-dd HH:mm:ss"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_0

    :cond_4
    const/4 v4, 0x2

    goto :goto_0

    :sswitch_4
    const-string v3, "yyyy/MM/dd"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_0

    :cond_5
    const/4 v4, 0x1

    goto :goto_0

    :sswitch_5
    const-string v3, "yyyy-MM-dd"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_0

    :cond_6
    const/4 v4, 0x0

    :goto_0
    packed-switch v4, :pswitch_data_0

    .line 307
    invoke-static {p1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object p1

    .line 308
    invoke-virtual {p1, p0}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 309
    :pswitch_0
    sget-object p0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_DOT:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    invoke-static {v0, v1, v2, p0}, Lcom/alibaba/fastjson2/util/DateUtils;->format(IIILcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_1
    const/4 v5, 0x0

    .line 310
    sget-object v6, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_DASH_T:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lcom/alibaba/fastjson2/util/DateUtils;->format(IIIIIILcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_2
    const/4 v5, 0x0

    .line 311
    sget-object v6, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_DASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lcom/alibaba/fastjson2/util/DateUtils;->format(IIIIIILcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 312
    :pswitch_3
    sget-object p0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_SLASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    invoke-static {v0, v1, v2, p0}, Lcom/alibaba/fastjson2/util/DateUtils;->format(IIILcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 313
    :pswitch_4
    sget-object p0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_DASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    invoke-static {v0, v1, v2, p0}, Lcom/alibaba/fastjson2/util/DateUtils;->format(IIILcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x985fe00 -> :sswitch_5
        -0x61c4540 -> :sswitch_4
        0x4f76f1a0 -> :sswitch_3
        0x6b2ed43a -> :sswitch_2
        0x6d5d7dd4 -> :sswitch_1
        0x7147a660 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static format(Ljava/time/LocalDateTime;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 286
    :cond_0
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->getYear()I

    move-result v0

    .line 287
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->getMonthValue()I

    move-result v1

    .line 288
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->getDayOfMonth()I

    move-result v2

    .line 289
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/4 v4, -0x1

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v3, "dd.MM.yyyy"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x5

    goto :goto_0

    :sswitch_1
    const-string v3, "yyyy-MM-ddTHH:mm:ss"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    const/4 v4, 0x4

    goto :goto_0

    :sswitch_2
    const-string v3, "yyyy-MM-dd\'T\'HH:mm:ss"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    const/4 v4, 0x3

    goto :goto_0

    :sswitch_3
    const-string v3, "yyyy-MM-dd HH:mm:ss"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_0

    :cond_4
    const/4 v4, 0x2

    goto :goto_0

    :sswitch_4
    const-string v3, "yyyy/MM/dd"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_0

    :cond_5
    const/4 v4, 0x1

    goto :goto_0

    :sswitch_5
    const-string v3, "yyyy-MM-dd"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_0

    :cond_6
    const/4 v4, 0x0

    :goto_0
    packed-switch v4, :pswitch_data_0

    .line 290
    invoke-static {p1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object p1

    .line 291
    invoke-virtual {p1, p0}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 292
    :pswitch_0
    sget-object p0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_DOT:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    invoke-static {v0, v1, v2, p0}, Lcom/alibaba/fastjson2/util/DateUtils;->format(IIILcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 293
    :pswitch_1
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->getHour()I

    move-result v3

    .line 294
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->getMinute()I

    move-result v4

    .line 295
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->getSecond()I

    move-result v5

    .line 296
    sget-object v6, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_DASH_T:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    invoke-static/range {v0 .. v6}, Lcom/alibaba/fastjson2/util/DateUtils;->format(IIIIIILcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 297
    :pswitch_2
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->getHour()I

    move-result v3

    .line 298
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->getMinute()I

    move-result v4

    .line 299
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->getSecond()I

    move-result v5

    .line 300
    sget-object v6, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_DASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    invoke-static/range {v0 .. v6}, Lcom/alibaba/fastjson2/util/DateUtils;->format(IIIIIILcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 301
    :pswitch_3
    sget-object p0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_SLASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    invoke-static {v0, v1, v2, p0}, Lcom/alibaba/fastjson2/util/DateUtils;->format(IIILcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 302
    :pswitch_4
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/util/DateUtils;->formatYMD10(III)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x985fe00 -> :sswitch_5
        -0x61c4540 -> :sswitch_4
        0x4f76f1a0 -> :sswitch_3
        0x6b2ed43a -> :sswitch_2
        0x6d5d7dd4 -> :sswitch_1
        0x7147a660 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static format(Ljava/time/ZonedDateTime;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 269
    :cond_0
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->getYear()I

    move-result v0

    .line 270
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->getMonthValue()I

    move-result v1

    .line 271
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->getDayOfMonth()I

    move-result v2

    .line 272
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/4 v4, -0x1

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v3, "dd.MM.yyyy"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x5

    goto :goto_0

    :sswitch_1
    const-string v3, "yyyy-MM-ddTHH:mm:ss"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    const/4 v4, 0x4

    goto :goto_0

    :sswitch_2
    const-string v3, "yyyy-MM-dd\'T\'HH:mm:ss"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    const/4 v4, 0x3

    goto :goto_0

    :sswitch_3
    const-string v3, "yyyy-MM-dd HH:mm:ss"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_0

    :cond_4
    const/4 v4, 0x2

    goto :goto_0

    :sswitch_4
    const-string v3, "yyyy/MM/dd"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_0

    :cond_5
    const/4 v4, 0x1

    goto :goto_0

    :sswitch_5
    const-string v3, "yyyy-MM-dd"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_0

    :cond_6
    const/4 v4, 0x0

    :goto_0
    packed-switch v4, :pswitch_data_0

    .line 273
    invoke-static {p1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object p1

    .line 274
    invoke-virtual {p1, p0}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 275
    :pswitch_0
    sget-object p0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_DOT:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    invoke-static {v0, v1, v2, p0}, Lcom/alibaba/fastjson2/util/DateUtils;->format(IIILcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 276
    :pswitch_1
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->getHour()I

    move-result v3

    .line 277
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->getMinute()I

    move-result v4

    .line 278
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->getSecond()I

    move-result v5

    .line 279
    sget-object v6, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_DASH_T:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    invoke-static/range {v0 .. v6}, Lcom/alibaba/fastjson2/util/DateUtils;->format(IIIIIILcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 280
    :pswitch_2
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->getHour()I

    move-result v3

    .line 281
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->getMinute()I

    move-result v4

    .line 282
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->getSecond()I

    move-result v5

    .line 283
    sget-object v6, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_DASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    invoke-static/range {v0 .. v6}, Lcom/alibaba/fastjson2/util/DateUtils;->format(IIIIIILcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 284
    :pswitch_3
    sget-object p0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_SLASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    invoke-static {v0, v1, v2, p0}, Lcom/alibaba/fastjson2/util/DateUtils;->format(IIILcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 285
    :pswitch_4
    sget-object p0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_DASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    invoke-static {v0, v1, v2, p0}, Lcom/alibaba/fastjson2/util/DateUtils;->format(IIILcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x985fe00 -> :sswitch_5
        -0x61c4540 -> :sswitch_4
        0x4f76f1a0 -> :sswitch_3
        0x6b2ed43a -> :sswitch_2
        0x6d5d7dd4 -> :sswitch_1
        0x7147a660 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static format(Ljava/util/Date;)Ljava/lang/String;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 333
    :cond_0
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    sget-object p0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_DASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    invoke-static {v0, v1, p0}, Lcom/alibaba/fastjson2/util/DateUtils;->format(JLcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static format(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-nez p1, :cond_1

    .line 334
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/DateUtils;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 335
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "dd.MM.yyyy"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x7

    goto :goto_0

    :sswitch_1
    const-string v0, "yyyy-MM-ddTHH:mm:ss"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x6

    goto :goto_0

    :sswitch_2
    const-string v0, "yyyy-MM-dd\'T\'HH:mm:ss"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v1, 0x5

    goto :goto_0

    :sswitch_3
    const-string v0, "dd.MM.yyyy HH:mm:ss"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v1, 0x4

    goto :goto_0

    :sswitch_4
    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_5
    const-string v0, "yyyy/MM/dd"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_6
    const-string v0, "yyyy-MM-dd"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_7
    const-string v0, "yyyyMMdd"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_0

    :cond_9
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 336
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    .line 337
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object p0

    .line 338
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    invoke-virtual {p0, v0}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object p0

    .line 339
    invoke-static {p1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object p1

    .line 340
    invoke-virtual {p1, p0}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 341
    :pswitch_0
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide p0

    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_DOT:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    invoke-static {p0, p1, v0}, Lcom/alibaba/fastjson2/util/DateUtils;->format(JLcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 342
    :pswitch_1
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide p0

    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_DASH_T:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    invoke-static {p0, p1, v0}, Lcom/alibaba/fastjson2/util/DateUtils;->format(JLcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 343
    :pswitch_2
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide p0

    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_DOT:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    invoke-static {p0, p1, v0}, Lcom/alibaba/fastjson2/util/DateUtils;->format(JLcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 344
    :pswitch_3
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide p0

    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_DASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    invoke-static {p0, p1, v0}, Lcom/alibaba/fastjson2/util/DateUtils;->format(JLcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 345
    :pswitch_4
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide p0

    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_SLASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    invoke-static {p0, p1, v0}, Lcom/alibaba/fastjson2/util/DateUtils;->format(JLcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 346
    :pswitch_5
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide p0

    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    invoke-static {p0, p1, v0}, Lcom/alibaba/fastjson2/util/DateUtils;->formatYMD10(JLjava/time/ZoneId;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 347
    :pswitch_6
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide p0

    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    invoke-static {p0, p1, v0}, Lcom/alibaba/fastjson2/util/DateUtils;->formatYMD8(JLjava/time/ZoneId;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x10781ba0 -> :sswitch_7
        -0x985fe00 -> :sswitch_6
        -0x61c4540 -> :sswitch_5
        0x4f76f1a0 -> :sswitch_4
        0x534c3940 -> :sswitch_3
        0x6b2ed43a -> :sswitch_2
        0x6d5d7dd4 -> :sswitch_1
        0x7147a660 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static formatYMD10(III)Ljava/lang/String;
    .locals 2

    const/16 v0, 0xa

    .line 233
    new-array v0, v0, [C

    const/4 v1, 0x0

    .line 234
    invoke-static {v0, v1, p0, p1, p2}, Lcom/alibaba/fastjson2/util/IOUtils;->writeLocalDate([CIIII)I

    .line 235
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    return-object p0
.end method

.method public static formatYMD10(JLjava/time/ZoneId;)Ljava/lang/String;
    .locals 25

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    move-object/from16 v0, p2

    .line 7
    .line 8
    :goto_0
    const-wide/16 v1, 0x3e8

    .line 9
    .line 10
    move-wide/from16 v3, p0

    .line 11
    .line 12
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->floorDiv(JJ)J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    sget-object v5, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_ID:Ljava/time/ZoneId;

    .line 17
    .line 18
    if-eq v0, v5, :cond_2

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    sget-object v6, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_RULES:Ljava/time/zone/ZoneRules;

    .line 25
    .line 26
    if-ne v5, v6, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-static {v3, v4}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v0}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0, v3}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/Instant;)Ljava/time/ZoneOffset;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    :goto_1
    invoke-static {v1, v2}, Lcom/alibaba/fastjson2/util/DateUtils;->getShanghaiZoneOffsetTotalSeconds(J)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    :goto_2
    int-to-long v3, v0

    .line 51
    add-long/2addr v1, v3

    .line 52
    const-wide/32 v3, 0x15180

    .line 53
    .line 54
    .line 55
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->floorDiv(JJ)J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    sget v2, Lcom/alibaba/fastjson2/util/DateUtils;->LOCAL_EPOCH_DAY:I

    .line 60
    .line 61
    int-to-long v2, v2

    .line 62
    sub-long v2, v0, v2

    .line 63
    .line 64
    const-wide/16 v4, 0x80

    .line 65
    .line 66
    add-long/2addr v2, v4

    .line 67
    long-to-int v2, v2

    .line 68
    sget-object v3, Lcom/alibaba/fastjson2/util/DateUtils$CacheDate10;->CACHE:[Ljava/lang/String;

    .line 69
    .line 70
    if-ltz v2, :cond_3

    .line 71
    .line 72
    array-length v4, v3

    .line 73
    if-ge v2, v4, :cond_3

    .line 74
    .line 75
    aget-object v4, v3, v2

    .line 76
    .line 77
    if-eqz v4, :cond_3

    .line 78
    .line 79
    return-object v4

    .line 80
    :cond_3
    const-wide/32 v4, 0xafa6c

    .line 81
    .line 82
    .line 83
    add-long/2addr v4, v0

    .line 84
    const-wide/16 v6, 0x0

    .line 85
    .line 86
    cmp-long v8, v4, v6

    .line 87
    .line 88
    const-wide/16 v9, 0x1

    .line 89
    .line 90
    const-wide/32 v11, 0x23ab1

    .line 91
    .line 92
    .line 93
    const-wide/16 v13, 0x190

    .line 94
    .line 95
    if-gez v8, :cond_4

    .line 96
    .line 97
    const-wide/32 v15, 0xafa6d

    .line 98
    .line 99
    .line 100
    add-long/2addr v0, v15

    .line 101
    div-long/2addr v0, v11

    .line 102
    sub-long/2addr v0, v9

    .line 103
    mul-long v15, v0, v13

    .line 104
    .line 105
    neg-long v0, v0

    .line 106
    mul-long/2addr v0, v11

    .line 107
    add-long/2addr v4, v0

    .line 108
    goto :goto_3

    .line 109
    :cond_4
    move-wide v15, v6

    .line 110
    :goto_3
    mul-long v0, v4, v13

    .line 111
    .line 112
    const-wide/16 v17, 0x24f

    .line 113
    .line 114
    add-long v0, v0, v17

    .line 115
    .line 116
    div-long/2addr v0, v11

    .line 117
    const-wide/16 v11, 0x16d

    .line 118
    .line 119
    mul-long v17, v0, v11

    .line 120
    .line 121
    const-wide/16 v19, 0x4

    .line 122
    .line 123
    div-long v21, v0, v19

    .line 124
    .line 125
    add-long v21, v21, v17

    .line 126
    .line 127
    const-wide/16 v17, 0x64

    .line 128
    .line 129
    div-long v23, v0, v17

    .line 130
    .line 131
    sub-long v21, v21, v23

    .line 132
    .line 133
    div-long v23, v0, v13

    .line 134
    .line 135
    add-long v23, v23, v21

    .line 136
    .line 137
    sub-long v21, v4, v23

    .line 138
    .line 139
    cmp-long v6, v21, v6

    .line 140
    .line 141
    if-gez v6, :cond_5

    .line 142
    .line 143
    sub-long/2addr v0, v9

    .line 144
    mul-long/2addr v11, v0

    .line 145
    div-long v6, v0, v19

    .line 146
    .line 147
    add-long/2addr v6, v11

    .line 148
    div-long v8, v0, v17

    .line 149
    .line 150
    sub-long/2addr v6, v8

    .line 151
    div-long v8, v0, v13

    .line 152
    .line 153
    add-long/2addr v8, v6

    .line 154
    sub-long v21, v4, v8

    .line 155
    .line 156
    :cond_5
    move-wide/from16 v4, v21

    .line 157
    .line 158
    add-long/2addr v0, v15

    .line 159
    long-to-int v4, v4

    .line 160
    mul-int/lit8 v5, v4, 0x5

    .line 161
    .line 162
    add-int/lit8 v5, v5, 0x2

    .line 163
    .line 164
    div-int/lit16 v5, v5, 0x99

    .line 165
    .line 166
    add-int/lit8 v6, v5, 0x2

    .line 167
    .line 168
    rem-int/lit8 v6, v6, 0xc

    .line 169
    .line 170
    add-int/lit8 v6, v6, 0x1

    .line 171
    .line 172
    mul-int/lit16 v7, v5, 0x132

    .line 173
    .line 174
    add-int/lit8 v7, v7, 0x5

    .line 175
    .line 176
    const/16 v8, 0xa

    .line 177
    .line 178
    div-int/2addr v7, v8

    .line 179
    sub-int/2addr v4, v7

    .line 180
    add-int/lit8 v4, v4, 0x1

    .line 181
    .line 182
    div-int/2addr v5, v8

    .line 183
    int-to-long v9, v5

    .line 184
    add-long/2addr v0, v9

    .line 185
    const-wide/32 v9, -0x3b9ac9ff

    .line 186
    .line 187
    .line 188
    cmp-long v5, v0, v9

    .line 189
    .line 190
    if-ltz v5, :cond_7

    .line 191
    .line 192
    const-wide/32 v9, 0x3b9ac9ff

    .line 193
    .line 194
    .line 195
    cmp-long v5, v0, v9

    .line 196
    .line 197
    if-gtz v5, :cond_7

    .line 198
    .line 199
    long-to-int v0, v0

    .line 200
    new-array v1, v8, [C

    .line 201
    .line 202
    const/4 v5, 0x0

    .line 203
    invoke-static {v1, v5, v0, v6, v4}, Lcom/alibaba/fastjson2/util/IOUtils;->writeLocalDate([CIIII)I

    .line 204
    .line 205
    .line 206
    new-instance v0, Ljava/lang/String;

    .line 207
    .line 208
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    .line 209
    .line 210
    .line 211
    if-ltz v2, :cond_6

    .line 212
    .line 213
    array-length v1, v3

    .line 214
    if-ge v2, v1, :cond_6

    .line 215
    .line 216
    aput-object v0, v3, v2

    .line 217
    .line 218
    :cond_6
    return-object v0

    .line 219
    :cond_7
    new-instance v2, Ljava/time/DateTimeException;

    .line 220
    .line 221
    const-string v3, "Invalid year "

    .line 222
    .line 223
    invoke-static {v0, v1, v3}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-direct {v2, v0}, Ljava/time/DateTimeException;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    throw v2
.end method

.method public static formatYMD10(Ljava/time/LocalDate;)Ljava/lang/String;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 231
    :cond_0
    invoke-virtual {p0}, Ljava/time/LocalDate;->getYear()I

    move-result v0

    invoke-virtual {p0}, Ljava/time/LocalDate;->getMonthValue()I

    move-result v1

    invoke-virtual {p0}, Ljava/time/LocalDate;->getDayOfMonth()I

    move-result p0

    invoke-static {v0, v1, p0}, Lcom/alibaba/fastjson2/util/DateUtils;->formatYMD10(III)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static formatYMD10(Ljava/util/Date;)Ljava/lang/String;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 232
    :cond_0
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    sget-object p0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    invoke-static {v0, v1, p0}, Lcom/alibaba/fastjson2/util/DateUtils;->formatYMD10(JLjava/time/ZoneId;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static formatYMD8(JLjava/time/ZoneId;)Ljava/lang/String;
    .locals 25

    .line 1
    const-wide/16 v0, 0x3e8

    .line 2
    .line 3
    move-wide/from16 v2, p0

    .line 4
    .line 5
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->floorDiv(JJ)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    sget-object v4, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object/from16 v4, p2

    .line 15
    .line 16
    :goto_0
    sget-object v5, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_ID:Ljava/time/ZoneId;

    .line 17
    .line 18
    if-eq v4, v5, :cond_2

    .line 19
    .line 20
    invoke-virtual {v4}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    sget-object v6, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_RULES:Ljava/time/zone/ZoneRules;

    .line 25
    .line 26
    if-ne v5, v6, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-static {v2, v3}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v4}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v3, v2}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/Instant;)Ljava/time/ZoneOffset;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    :goto_1
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->getShanghaiZoneOffsetTotalSeconds(J)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    :goto_2
    int-to-long v2, v2

    .line 51
    add-long/2addr v0, v2

    .line 52
    const-wide/32 v2, 0x15180

    .line 53
    .line 54
    .line 55
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->floorDiv(JJ)J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    sget v2, Lcom/alibaba/fastjson2/util/DateUtils;->LOCAL_EPOCH_DAY:I

    .line 60
    .line 61
    int-to-long v2, v2

    .line 62
    sub-long v2, v0, v2

    .line 63
    .line 64
    const-wide/16 v4, 0x80

    .line 65
    .line 66
    add-long/2addr v2, v4

    .line 67
    long-to-int v2, v2

    .line 68
    sget-object v3, Lcom/alibaba/fastjson2/util/DateUtils$CacheDate8;->CACHE:[Ljava/lang/String;

    .line 69
    .line 70
    if-ltz v2, :cond_3

    .line 71
    .line 72
    array-length v4, v3

    .line 73
    if-ge v2, v4, :cond_3

    .line 74
    .line 75
    aget-object v4, v3, v2

    .line 76
    .line 77
    if-eqz v4, :cond_3

    .line 78
    .line 79
    return-object v4

    .line 80
    :cond_3
    const-wide/32 v4, 0xafa6c

    .line 81
    .line 82
    .line 83
    add-long/2addr v4, v0

    .line 84
    const-wide/16 v6, 0x0

    .line 85
    .line 86
    cmp-long v8, v4, v6

    .line 87
    .line 88
    const-wide/16 v9, 0x1

    .line 89
    .line 90
    const-wide/32 v11, 0x23ab1

    .line 91
    .line 92
    .line 93
    const-wide/16 v13, 0x190

    .line 94
    .line 95
    if-gez v8, :cond_4

    .line 96
    .line 97
    const-wide/32 v15, 0xafa6d

    .line 98
    .line 99
    .line 100
    add-long/2addr v0, v15

    .line 101
    div-long/2addr v0, v11

    .line 102
    sub-long/2addr v0, v9

    .line 103
    mul-long v15, v0, v13

    .line 104
    .line 105
    neg-long v0, v0

    .line 106
    mul-long/2addr v0, v11

    .line 107
    add-long/2addr v4, v0

    .line 108
    goto :goto_3

    .line 109
    :cond_4
    move-wide v15, v6

    .line 110
    :goto_3
    mul-long v0, v4, v13

    .line 111
    .line 112
    const-wide/16 v17, 0x24f

    .line 113
    .line 114
    add-long v0, v0, v17

    .line 115
    .line 116
    div-long/2addr v0, v11

    .line 117
    const-wide/16 v11, 0x16d

    .line 118
    .line 119
    mul-long v17, v0, v11

    .line 120
    .line 121
    const-wide/16 v19, 0x4

    .line 122
    .line 123
    div-long v21, v0, v19

    .line 124
    .line 125
    add-long v21, v21, v17

    .line 126
    .line 127
    const-wide/16 v17, 0x64

    .line 128
    .line 129
    div-long v23, v0, v17

    .line 130
    .line 131
    sub-long v21, v21, v23

    .line 132
    .line 133
    div-long v23, v0, v13

    .line 134
    .line 135
    add-long v23, v23, v21

    .line 136
    .line 137
    sub-long v21, v4, v23

    .line 138
    .line 139
    cmp-long v6, v21, v6

    .line 140
    .line 141
    if-gez v6, :cond_5

    .line 142
    .line 143
    sub-long/2addr v0, v9

    .line 144
    mul-long/2addr v11, v0

    .line 145
    div-long v6, v0, v19

    .line 146
    .line 147
    add-long/2addr v6, v11

    .line 148
    div-long v8, v0, v17

    .line 149
    .line 150
    sub-long/2addr v6, v8

    .line 151
    div-long v8, v0, v13

    .line 152
    .line 153
    add-long/2addr v8, v6

    .line 154
    sub-long v21, v4, v8

    .line 155
    .line 156
    :cond_5
    move-wide/from16 v4, v21

    .line 157
    .line 158
    add-long/2addr v0, v15

    .line 159
    long-to-int v4, v4

    .line 160
    mul-int/lit8 v5, v4, 0x5

    .line 161
    .line 162
    add-int/lit8 v5, v5, 0x2

    .line 163
    .line 164
    div-int/lit16 v5, v5, 0x99

    .line 165
    .line 166
    add-int/lit8 v6, v5, 0x2

    .line 167
    .line 168
    rem-int/lit8 v6, v6, 0xc

    .line 169
    .line 170
    add-int/lit8 v6, v6, 0x1

    .line 171
    .line 172
    mul-int/lit16 v7, v5, 0x132

    .line 173
    .line 174
    add-int/lit8 v7, v7, 0x5

    .line 175
    .line 176
    div-int/lit8 v7, v7, 0xa

    .line 177
    .line 178
    sub-int/2addr v4, v7

    .line 179
    add-int/lit8 v4, v4, 0x1

    .line 180
    .line 181
    div-int/lit8 v5, v5, 0xa

    .line 182
    .line 183
    int-to-long v7, v5

    .line 184
    add-long/2addr v0, v7

    .line 185
    const-wide/32 v7, -0x3b9ac9ff

    .line 186
    .line 187
    .line 188
    cmp-long v5, v0, v7

    .line 189
    .line 190
    if-ltz v5, :cond_7

    .line 191
    .line 192
    const-wide/32 v7, 0x3b9ac9ff

    .line 193
    .line 194
    .line 195
    cmp-long v5, v0, v7

    .line 196
    .line 197
    if-gtz v5, :cond_7

    .line 198
    .line 199
    long-to-int v0, v0

    .line 200
    div-int/lit8 v1, v0, 0x64

    .line 201
    .line 202
    mul-int/lit8 v5, v1, 0x64

    .line 203
    .line 204
    sub-int/2addr v0, v5

    .line 205
    const/16 v5, 0x8

    .line 206
    .line 207
    new-array v5, v5, [C

    .line 208
    .line 209
    sget-object v7, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 210
    .line 211
    sget-wide v8, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_CHAR_BASE_OFFSET:J

    .line 212
    .line 213
    sget-object v10, Lcom/alibaba/fastjson2/util/IOUtils;->PACKED_DIGITS_UTF16:[I

    .line 214
    .line 215
    aget v1, v10, v1

    .line 216
    .line 217
    invoke-virtual {v7, v5, v8, v9, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 218
    .line 219
    .line 220
    add-long v11, v8, v19

    .line 221
    .line 222
    aget v0, v10, v0

    .line 223
    .line 224
    invoke-virtual {v7, v5, v11, v12, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 225
    .line 226
    .line 227
    const-wide/16 v0, 0x8

    .line 228
    .line 229
    add-long/2addr v0, v8

    .line 230
    aget v6, v10, v6

    .line 231
    .line 232
    invoke-virtual {v7, v5, v0, v1, v6}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 233
    .line 234
    .line 235
    const-wide/16 v0, 0xc

    .line 236
    .line 237
    add-long/2addr v8, v0

    .line 238
    aget v0, v10, v4

    .line 239
    .line 240
    invoke-virtual {v7, v5, v8, v9, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 241
    .line 242
    .line 243
    new-instance v0, Ljava/lang/String;

    .line 244
    .line 245
    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    .line 246
    .line 247
    .line 248
    if-ltz v2, :cond_6

    .line 249
    .line 250
    array-length v1, v3

    .line 251
    if-ge v2, v1, :cond_6

    .line 252
    .line 253
    aput-object v0, v3, v2

    .line 254
    .line 255
    :cond_6
    return-object v0

    .line 256
    :cond_7
    new-instance v2, Ljava/time/DateTimeException;

    .line 257
    .line 258
    const-string v3, "Invalid year "

    .line 259
    .line 260
    invoke-static {v0, v1, v3}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-direct {v2, v0}, Ljava/time/DateTimeException;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    throw v2
.end method

.method public static formatYMD8(Ljava/time/LocalDate;)Ljava/lang/String;
    .locals 10

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 269
    :cond_0
    invoke-virtual {p0}, Ljava/time/LocalDate;->getYear()I

    move-result v0

    .line 270
    invoke-virtual {p0}, Ljava/time/LocalDate;->getMonthValue()I

    move-result v1

    .line 271
    invoke-virtual {p0}, Ljava/time/LocalDate;->getDayOfMonth()I

    move-result p0

    .line 272
    div-int/lit8 v2, v0, 0x64

    mul-int/lit8 v3, v2, 0x64

    sub-int/2addr v0, v3

    const/16 v3, 0x8

    .line 273
    new-array v3, v3, [C

    .line 274
    sget-object v4, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    sget-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_CHAR_BASE_OFFSET:J

    sget-object v7, Lcom/alibaba/fastjson2/util/IOUtils;->PACKED_DIGITS_UTF16:[I

    aget v2, v7, v2

    invoke-virtual {v4, v3, v5, v6, v2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    const-wide/16 v8, 0x4

    add-long/2addr v8, v5

    .line 275
    aget v0, v7, v0

    invoke-virtual {v4, v3, v8, v9, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    const-wide/16 v8, 0x8

    add-long/2addr v8, v5

    .line 276
    aget v0, v7, v1

    invoke-virtual {v4, v3, v8, v9, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    const-wide/16 v0, 0xc

    add-long/2addr v5, v0

    .line 277
    aget p0, v7, p0

    invoke-virtual {v4, v3, v5, v6, p0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 278
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v3}, Ljava/lang/String;-><init>([C)V

    return-object p0
.end method

.method public static formatYMD8(Ljava/util/Date;)Ljava/lang/String;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 268
    :cond_0
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    sget-object p0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    invoke-static {v0, v1, p0}, Lcom/alibaba/fastjson2/util/DateUtils;->formatYMD8(JLjava/time/ZoneId;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static formatYMDHMS19(Ljava/time/LocalDate;)Ljava/lang/String;
    .locals 4

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 291
    :cond_0
    invoke-virtual {p0}, Ljava/time/LocalDate;->getYear()I

    move-result v0

    .line 292
    invoke-virtual {p0}, Ljava/time/LocalDate;->getMonthValue()I

    move-result v1

    .line 293
    invoke-virtual {p0}, Ljava/time/LocalDate;->getDayOfMonth()I

    move-result p0

    const/16 v2, 0x13

    .line 294
    new-array v2, v2, [C

    const/4 v3, 0x0

    .line 295
    invoke-static {v2, v3, v0, v1, p0}, Lcom/alibaba/fastjson2/util/IOUtils;->writeLocalDate([CIIII)I

    const/16 p0, 0xa

    const/16 v0, 0x20

    .line 296
    aput-char v0, v2, p0

    const/16 p0, 0xb

    .line 297
    invoke-static {v2, p0, v3, v3, v3}, Lcom/alibaba/fastjson2/util/IOUtils;->writeLocalTime([CIIII)V

    .line 298
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v2}, Ljava/lang/String;-><init>([C)V

    return-object p0
.end method

.method public static formatYMDHMS19(Ljava/time/LocalDateTime;)Ljava/lang/String;
    .locals 7

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 280
    :cond_0
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->getYear()I

    move-result v0

    .line 281
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->getMonthValue()I

    move-result v1

    .line 282
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->getDayOfMonth()I

    move-result v2

    .line 283
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->getHour()I

    move-result v3

    .line 284
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->getMinute()I

    move-result v4

    .line 285
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->getSecond()I

    move-result p0

    const/16 v5, 0x13

    .line 286
    new-array v5, v5, [C

    const/4 v6, 0x0

    .line 287
    invoke-static {v5, v6, v0, v1, v2}, Lcom/alibaba/fastjson2/util/IOUtils;->writeLocalDate([CIIII)I

    const/16 v0, 0xa

    const/16 v1, 0x20

    .line 288
    aput-char v1, v5, v0

    const/16 v0, 0xb

    .line 289
    invoke-static {v5, v0, v3, v4, p0}, Lcom/alibaba/fastjson2/util/IOUtils;->writeLocalTime([CIIII)V

    .line 290
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v5}, Ljava/lang/String;-><init>([C)V

    return-object p0
.end method

.method public static formatYMDHMS19(Ljava/time/ZonedDateTime;)Ljava/lang/String;
    .locals 7

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 273
    :cond_0
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->getYear()I

    move-result v0

    .line 274
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->getMonthValue()I

    move-result v1

    .line 275
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->getDayOfMonth()I

    move-result v2

    .line 276
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->getHour()I

    move-result v3

    .line 277
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->getMinute()I

    move-result v4

    .line 278
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->getSecond()I

    move-result v5

    .line 279
    sget-object v6, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_DASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    invoke-static/range {v0 .. v6}, Lcom/alibaba/fastjson2/util/DateUtils;->format(IIIIIILcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static formatYMDHMS19(Ljava/util/Date;)Ljava/lang/String;
    .locals 1

    .line 272
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/DateUtils;->formatYMDHMS19(Ljava/util/Date;Ljava/time/ZoneId;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static formatYMDHMS19(Ljava/util/Date;Ljava/time/ZoneId;)Ljava/lang/String;
    .locals 24

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-virtual/range {p0 .. p0}, Ljava/util/Date;->getTime()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    move-object/from16 v2, p1

    .line 15
    .line 16
    :goto_0
    const-wide/16 v3, 0x3e8

    .line 17
    .line 18
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->floorDiv(JJ)J

    .line 19
    .line 20
    .line 21
    move-result-wide v3

    .line 22
    sget-object v5, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_ID:Ljava/time/ZoneId;

    .line 23
    .line 24
    if-eq v2, v5, :cond_2

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    sget-object v6, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_RULES:Ljava/time/zone/ZoneRules;

    .line 31
    .line 32
    if-ne v5, v6, :cond_3

    .line 33
    .line 34
    :cond_2
    const-wide/32 v5, 0x28d2bea0

    .line 35
    .line 36
    .line 37
    cmp-long v5, v3, v5

    .line 38
    .line 39
    if-lez v5, :cond_3

    .line 40
    .line 41
    const/16 v0, 0x7080

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_3
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v2}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1, v0}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/Instant;)Ljava/time/ZoneOffset;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    :goto_1
    int-to-long v0, v0

    .line 61
    add-long/2addr v3, v0

    .line 62
    const-wide/32 v0, 0x15180

    .line 63
    .line 64
    .line 65
    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->floorDiv(JJ)J

    .line 66
    .line 67
    .line 68
    move-result-wide v5

    .line 69
    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->floorMod(JJ)J

    .line 70
    .line 71
    .line 72
    move-result-wide v0

    .line 73
    long-to-int v0, v0

    .line 74
    const-wide/32 v1, 0xafa6c

    .line 75
    .line 76
    .line 77
    add-long/2addr v1, v5

    .line 78
    const-wide/16 v3, 0x0

    .line 79
    .line 80
    cmp-long v7, v1, v3

    .line 81
    .line 82
    const-wide/16 v8, 0x1

    .line 83
    .line 84
    const-wide/32 v10, 0x23ab1

    .line 85
    .line 86
    .line 87
    const-wide/16 v12, 0x190

    .line 88
    .line 89
    if-gez v7, :cond_4

    .line 90
    .line 91
    const-wide/32 v14, 0xafa6d

    .line 92
    .line 93
    .line 94
    add-long/2addr v5, v14

    .line 95
    div-long/2addr v5, v10

    .line 96
    sub-long/2addr v5, v8

    .line 97
    mul-long v14, v5, v12

    .line 98
    .line 99
    neg-long v5, v5

    .line 100
    mul-long/2addr v5, v10

    .line 101
    add-long/2addr v1, v5

    .line 102
    goto :goto_2

    .line 103
    :cond_4
    move-wide v14, v3

    .line 104
    :goto_2
    mul-long v5, v1, v12

    .line 105
    .line 106
    const-wide/16 v16, 0x24f

    .line 107
    .line 108
    add-long v5, v5, v16

    .line 109
    .line 110
    div-long/2addr v5, v10

    .line 111
    const-wide/16 v10, 0x16d

    .line 112
    .line 113
    mul-long v16, v5, v10

    .line 114
    .line 115
    const-wide/16 v18, 0x4

    .line 116
    .line 117
    div-long v20, v5, v18

    .line 118
    .line 119
    add-long v20, v20, v16

    .line 120
    .line 121
    const-wide/16 v16, 0x64

    .line 122
    .line 123
    div-long v22, v5, v16

    .line 124
    .line 125
    sub-long v20, v20, v22

    .line 126
    .line 127
    div-long v22, v5, v12

    .line 128
    .line 129
    add-long v22, v22, v20

    .line 130
    .line 131
    sub-long v20, v1, v22

    .line 132
    .line 133
    cmp-long v7, v20, v3

    .line 134
    .line 135
    if-gez v7, :cond_5

    .line 136
    .line 137
    sub-long/2addr v5, v8

    .line 138
    mul-long/2addr v10, v5

    .line 139
    div-long v7, v5, v18

    .line 140
    .line 141
    add-long/2addr v7, v10

    .line 142
    div-long v9, v5, v16

    .line 143
    .line 144
    sub-long/2addr v7, v9

    .line 145
    div-long v9, v5, v12

    .line 146
    .line 147
    add-long/2addr v9, v7

    .line 148
    sub-long v20, v1, v9

    .line 149
    .line 150
    :cond_5
    move-wide/from16 v1, v20

    .line 151
    .line 152
    add-long/2addr v5, v14

    .line 153
    long-to-int v1, v1

    .line 154
    mul-int/lit8 v2, v1, 0x5

    .line 155
    .line 156
    add-int/lit8 v2, v2, 0x2

    .line 157
    .line 158
    div-int/lit16 v2, v2, 0x99

    .line 159
    .line 160
    add-int/lit8 v7, v2, 0x2

    .line 161
    .line 162
    rem-int/lit8 v7, v7, 0xc

    .line 163
    .line 164
    add-int/lit8 v7, v7, 0x1

    .line 165
    .line 166
    mul-int/lit16 v8, v2, 0x132

    .line 167
    .line 168
    add-int/lit8 v8, v8, 0x5

    .line 169
    .line 170
    const/16 v9, 0xa

    .line 171
    .line 172
    div-int/2addr v8, v9

    .line 173
    sub-int/2addr v1, v8

    .line 174
    add-int/lit8 v1, v1, 0x1

    .line 175
    .line 176
    div-int/2addr v2, v9

    .line 177
    int-to-long v10, v2

    .line 178
    add-long/2addr v5, v10

    .line 179
    const-wide/32 v10, -0x3b9ac9ff

    .line 180
    .line 181
    .line 182
    cmp-long v2, v5, v10

    .line 183
    .line 184
    if-ltz v2, :cond_7

    .line 185
    .line 186
    const-wide/32 v10, 0x3b9ac9ff

    .line 187
    .line 188
    .line 189
    cmp-long v2, v5, v10

    .line 190
    .line 191
    if-gtz v2, :cond_7

    .line 192
    .line 193
    long-to-int v2, v5

    .line 194
    int-to-long v5, v0

    .line 195
    cmp-long v0, v5, v3

    .line 196
    .line 197
    if-ltz v0, :cond_6

    .line 198
    .line 199
    const-wide/32 v3, 0x1517f

    .line 200
    .line 201
    .line 202
    cmp-long v0, v5, v3

    .line 203
    .line 204
    if-gtz v0, :cond_6

    .line 205
    .line 206
    const-wide/16 v3, 0xe10

    .line 207
    .line 208
    div-long v3, v5, v3

    .line 209
    .line 210
    long-to-int v0, v3

    .line 211
    mul-int/lit16 v3, v0, 0xe10

    .line 212
    .line 213
    int-to-long v3, v3

    .line 214
    sub-long/2addr v5, v3

    .line 215
    const-wide/16 v3, 0x3c

    .line 216
    .line 217
    div-long v3, v5, v3

    .line 218
    .line 219
    long-to-int v3, v3

    .line 220
    mul-int/lit8 v4, v3, 0x3c

    .line 221
    .line 222
    int-to-long v10, v4

    .line 223
    sub-long/2addr v5, v10

    .line 224
    long-to-int v4, v5

    .line 225
    const/16 v5, 0x13

    .line 226
    .line 227
    new-array v5, v5, [C

    .line 228
    .line 229
    const/4 v6, 0x0

    .line 230
    invoke-static {v5, v6, v2, v7, v1}, Lcom/alibaba/fastjson2/util/IOUtils;->writeLocalDate([CIIII)I

    .line 231
    .line 232
    .line 233
    const/16 v1, 0x20

    .line 234
    .line 235
    aput-char v1, v5, v9

    .line 236
    .line 237
    const/16 v1, 0xb

    .line 238
    .line 239
    invoke-static {v5, v1, v0, v3, v4}, Lcom/alibaba/fastjson2/util/IOUtils;->writeLocalTime([CIIII)V

    .line 240
    .line 241
    .line 242
    new-instance v0, Ljava/lang/String;

    .line 243
    .line 244
    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    .line 245
    .line 246
    .line 247
    return-object v0

    .line 248
    :cond_6
    new-instance v0, Ljava/time/DateTimeException;

    .line 249
    .line 250
    const-string v1, "Invalid secondOfDay "

    .line 251
    .line 252
    invoke-static {v5, v6, v1}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    invoke-direct {v0, v1}, Ljava/time/DateTimeException;-><init>(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    throw v0

    .line 260
    :cond_7
    new-instance v0, Ljava/time/DateTimeException;

    .line 261
    .line 262
    const-string v1, "Invalid year "

    .line 263
    .line 264
    invoke-static {v5, v6, v1}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-direct {v0, v1}, Ljava/time/DateTimeException;-><init>(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    throw v0
.end method

.method public static getShanghaiZoneOffsetTotalSeconds(J)I
    .locals 5

    .line 1
    const-wide/32 v0, 0x28d2bea0

    .line 2
    .line 3
    .line 4
    cmp-long v0, p0, v0

    .line 5
    .line 6
    const/16 v1, 0x7080

    .line 7
    .line 8
    if-ltz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const-wide/32 v2, 0x2807c5b0

    .line 12
    .line 13
    .line 14
    cmp-long v0, p0, v2

    .line 15
    .line 16
    const/16 v2, 0x7e90

    .line 17
    .line 18
    if-ltz v0, :cond_1

    .line 19
    .line 20
    return v2

    .line 21
    :cond_1
    const-wide/32 v3, 0x26f2dca0

    .line 22
    .line 23
    .line 24
    cmp-long v0, p0, v3

    .line 25
    .line 26
    if-ltz v0, :cond_2

    .line 27
    .line 28
    return v1

    .line 29
    :cond_2
    const-wide/32 v3, 0x2627e3b0

    .line 30
    .line 31
    .line 32
    cmp-long v0, p0, v3

    .line 33
    .line 34
    if-ltz v0, :cond_3

    .line 35
    .line 36
    return v2

    .line 37
    :cond_3
    const-wide/32 v3, 0x2512faa0

    .line 38
    .line 39
    .line 40
    cmp-long v0, p0, v3

    .line 41
    .line 42
    if-ltz v0, :cond_4

    .line 43
    .line 44
    return v1

    .line 45
    :cond_4
    const-wide/32 v3, 0x244801b0

    .line 46
    .line 47
    .line 48
    cmp-long v0, p0, v3

    .line 49
    .line 50
    if-ltz v0, :cond_5

    .line 51
    .line 52
    return v2

    .line 53
    :cond_5
    const-wide/32 v3, 0x2329de20

    .line 54
    .line 55
    .line 56
    cmp-long v0, p0, v3

    .line 57
    .line 58
    if-ltz v0, :cond_6

    .line 59
    .line 60
    return v1

    .line 61
    :cond_6
    const-wide/32 v3, 0x22681fb0

    .line 62
    .line 63
    .line 64
    cmp-long v0, p0, v3

    .line 65
    .line 66
    if-ltz v0, :cond_7

    .line 67
    .line 68
    return v2

    .line 69
    :cond_7
    const-wide/32 v3, 0x2149fc20

    .line 70
    .line 71
    .line 72
    cmp-long v0, p0, v3

    .line 73
    .line 74
    if-ltz v0, :cond_8

    .line 75
    .line 76
    return v1

    .line 77
    :cond_8
    const-wide/32 v3, 0x207f0330

    .line 78
    .line 79
    .line 80
    cmp-long v0, p0, v3

    .line 81
    .line 82
    if-ltz v0, :cond_9

    .line 83
    .line 84
    return v2

    .line 85
    :cond_9
    const-wide/32 v3, 0x1f6a1a20

    .line 86
    .line 87
    .line 88
    cmp-long v0, p0, v3

    .line 89
    .line 90
    if-ltz v0, :cond_a

    .line 91
    .line 92
    return v1

    .line 93
    :cond_a
    const-wide/32 v3, 0x1ebad0b0

    .line 94
    .line 95
    .line 96
    cmp-long v0, p0, v3

    .line 97
    .line 98
    if-ltz v0, :cond_b

    .line 99
    .line 100
    return v2

    .line 101
    :cond_b
    const-wide/32 v3, -0x26be0480

    .line 102
    .line 103
    .line 104
    cmp-long v0, p0, v3

    .line 105
    .line 106
    if-ltz v0, :cond_c

    .line 107
    .line 108
    return v1

    .line 109
    :cond_c
    const-wide/32 v3, -0x26e18ef0

    .line 110
    .line 111
    .line 112
    cmp-long v0, p0, v3

    .line 113
    .line 114
    if-ltz v0, :cond_d

    .line 115
    .line 116
    return v2

    .line 117
    :cond_d
    const-wide/32 v3, -0x27f91b00

    .line 118
    .line 119
    .line 120
    cmp-long v0, p0, v3

    .line 121
    .line 122
    if-ltz v0, :cond_e

    .line 123
    .line 124
    return v1

    .line 125
    :cond_e
    const-wide/32 v3, -0x28c2c270

    .line 126
    .line 127
    .line 128
    cmp-long v0, p0, v3

    .line 129
    .line 130
    if-ltz v0, :cond_f

    .line 131
    .line 132
    return v2

    .line 133
    :cond_f
    const-wide/32 v3, -0x29b2c180

    .line 134
    .line 135
    .line 136
    cmp-long v0, p0, v3

    .line 137
    .line 138
    if-ltz v0, :cond_10

    .line 139
    .line 140
    return v1

    .line 141
    :cond_10
    const-wide/32 v3, -0x2aba5f70

    .line 142
    .line 143
    .line 144
    cmp-long v0, p0, v3

    .line 145
    .line 146
    if-ltz v0, :cond_11

    .line 147
    .line 148
    return v2

    .line 149
    :cond_11
    const-wide/32 v3, -0x2bbcd380

    .line 150
    .line 151
    .line 152
    cmp-long v0, p0, v3

    .line 153
    .line 154
    if-ltz v0, :cond_12

    .line 155
    .line 156
    return v1

    .line 157
    :cond_12
    const-wide/32 v3, -0x2c7405f0

    .line 158
    .line 159
    .line 160
    cmp-long v0, p0, v3

    .line 161
    .line 162
    if-ltz v0, :cond_13

    .line 163
    .line 164
    return v2

    .line 165
    :cond_13
    const-wide/32 v3, -0x2dc44280

    .line 166
    .line 167
    .line 168
    cmp-long v0, p0, v3

    .line 169
    .line 170
    if-ltz v0, :cond_14

    .line 171
    .line 172
    return v1

    .line 173
    :cond_14
    const-wide/32 v3, -0x34834170

    .line 174
    .line 175
    .line 176
    cmp-long v0, p0, v3

    .line 177
    .line 178
    if-ltz v0, :cond_15

    .line 179
    .line 180
    return v2

    .line 181
    :cond_15
    const-wide/32 v3, -0x34f9f680

    .line 182
    .line 183
    .line 184
    cmp-long v0, p0, v3

    .line 185
    .line 186
    if-ltz v0, :cond_16

    .line 187
    .line 188
    return v1

    .line 189
    :cond_16
    const-wide/32 v3, -0x362bc470

    .line 190
    .line 191
    .line 192
    cmp-long v0, p0, v3

    .line 193
    .line 194
    if-ltz v0, :cond_17

    .line 195
    .line 196
    return v2

    .line 197
    :cond_17
    const-wide/32 v3, -0x36f58800

    .line 198
    .line 199
    .line 200
    cmp-long v0, p0, v3

    .line 201
    .line 202
    if-ltz v0, :cond_18

    .line 203
    .line 204
    return v1

    .line 205
    :cond_18
    const-wide/32 v3, -0x37a622f0

    .line 206
    .line 207
    .line 208
    cmp-long v0, p0, v3

    .line 209
    .line 210
    if-ltz v0, :cond_19

    .line 211
    .line 212
    return v2

    .line 213
    :cond_19
    const-wide/32 v3, -0x5e867c80

    .line 214
    .line 215
    .line 216
    cmp-long v0, p0, v3

    .line 217
    .line 218
    if-ltz v0, :cond_1a

    .line 219
    .line 220
    return v1

    .line 221
    :cond_1a
    const-wide/32 v3, -0x5f67def0

    .line 222
    .line 223
    .line 224
    cmp-long v0, p0, v3

    .line 225
    .line 226
    if-ltz v0, :cond_1b

    .line 227
    .line 228
    return v2

    .line 229
    :cond_1b
    const-wide v2, -0x81c94b00L

    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    cmp-long p0, p0, v2

    .line 235
    .line 236
    if-ltz p0, :cond_1c

    .line 237
    .line 238
    return v1

    .line 239
    :cond_1c
    const/16 p0, 0x71d7

    .line 240
    .line 241
    return p0
.end method

.method public static getZoneId(Ljava/lang/String;Ljava/time/ZoneId;)Ljava/time/ZoneId;
    .locals 3

    .line 1
    if-nez p0, :cond_1

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    sget-object p0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 v0, 0x0

    .line 14
    const/4 v1, 0x1

    .line 15
    const/4 v2, -0x1

    .line 16
    sparse-switch p1, :sswitch_data_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :sswitch_0
    const-string p1, "+08:00"

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-nez p1, :cond_2

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    const/4 v2, 0x2

    .line 30
    goto :goto_0

    .line 31
    :sswitch_1
    const-string p1, "CST"

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-nez p1, :cond_3

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_3
    move v2, v1

    .line 41
    goto :goto_0

    .line 42
    :sswitch_2
    const-string p1, "000"

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-nez p1, :cond_4

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_4
    move v2, v0

    .line 52
    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    const/16 v2, 0x5d

    .line 60
    .line 61
    if-lez p1, :cond_6

    .line 62
    .line 63
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    const/16 v0, 0x2b

    .line 68
    .line 69
    if-eq p1, v0, :cond_5

    .line 70
    .line 71
    const/16 v0, 0x2d

    .line 72
    .line 73
    if-ne p1, v0, :cond_6

    .line 74
    .line 75
    :cond_5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    sub-int/2addr p1, v1

    .line 80
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eq p1, v2, :cond_6

    .line 85
    .line 86
    invoke-static {p0}, Ljava/time/ZoneOffset;->of(Ljava/lang/String;)Ljava/time/ZoneOffset;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :cond_6
    const/16 p1, 0x5b

    .line 92
    .line 93
    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(I)I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-lez p1, :cond_7

    .line 98
    .line 99
    invoke-virtual {p0, v2, p1}, Ljava/lang/String;->indexOf(II)I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-lez v0, :cond_7

    .line 104
    .line 105
    add-int/2addr p1, v1

    .line 106
    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-static {p0}, Ljava/time/ZoneId;->of(Ljava/lang/String;)Ljava/time/ZoneId;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0

    .line 115
    :cond_7
    invoke-static {p0}, Ljava/time/ZoneId;->of(Ljava/lang/String;)Ljava/time/ZoneId;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    return-object p0

    .line 120
    :pswitch_0
    sget-object p0, Lcom/alibaba/fastjson2/util/DateUtils;->OFFSET_8_ZONE_ID:Ljava/time/ZoneId;

    .line 121
    .line 122
    return-object p0

    .line 123
    :pswitch_1
    sget-object p0, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_ID:Ljava/time/ZoneId;

    .line 124
    .line 125
    return-object p0

    .line 126
    :pswitch_2
    sget-object p0, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 127
    .line 128
    return-object p0

    .line 129
    :sswitch_data_0
    .sparse-switch
        0xba30 -> :sswitch_2
        0x105e4 -> :sswitch_1
        0x4c1f1f67 -> :sswitch_0
    .end sparse-switch

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static hms([BI)J
    .locals 6

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 4
    .line 5
    int-to-long v3, p1

    .line 6
    add-long/2addr v1, v3

    .line 7
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    sget-boolean v0, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {p0, p1}, Ljava/lang/Long;->reverseBytes(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide p0

    .line 19
    :cond_0
    const-wide v0, -0xf0f0f0f0f0f0f10L    # -1.0773087426743214E236

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    and-long/2addr v0, p0

    .line 25
    const-wide v2, 0x3030303030303030L    # 1.398043286095289E-76

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    sub-long/2addr v0, v2

    .line 31
    const-wide v2, 0xf0f0f0f0f0f0f0fL    # 3.815736827118017E-236

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long/2addr v2, p0

    .line 37
    const-wide v4, 0x606000606000606L

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    add-long/2addr v2, v4

    .line 43
    const-wide v4, -0xf0fff0f0fff0f10L    # -1.0176920443765422E236

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    and-long/2addr v2, v4

    .line 49
    or-long/2addr v0, v2

    .line 50
    const-wide/16 v2, 0x0

    .line 51
    .line 52
    cmp-long v0, v0, v2

    .line 53
    .line 54
    if-nez v0, :cond_2

    .line 55
    .line 56
    const-wide v0, 0xf00000f0000L

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    and-long/2addr v0, p0

    .line 62
    const-wide v2, 0xa00000a0000L

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    cmp-long v0, v0, v2

    .line 68
    .line 69
    if-eqz v0, :cond_1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    const-wide v0, 0xf00000f00000fL

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    and-long/2addr v0, p0

    .line 78
    const/4 v2, 0x3

    .line 79
    shl-long v2, v0, v2

    .line 80
    .line 81
    const/4 v4, 0x1

    .line 82
    shl-long/2addr v0, v4

    .line 83
    add-long/2addr v2, v0

    .line 84
    const-wide v0, 0xf00000f00000f00L

    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    and-long/2addr p0, v0

    .line 90
    const/16 v0, 0x8

    .line 91
    .line 92
    shr-long/2addr p0, v0

    .line 93
    add-long/2addr v2, p0

    .line 94
    return-wide v2

    .line 95
    :cond_2
    :goto_0
    const-wide/16 p0, -0x1

    .line 96
    .line 97
    return-wide p0
.end method

.method public static hourAfterNoon(CC)I
    .locals 5

    .line 1
    const/16 v0, 0x33

    .line 2
    .line 3
    const/16 v1, 0x34

    .line 4
    .line 5
    const/16 v2, 0x32

    .line 6
    .line 7
    const/16 v3, 0x31

    .line 8
    .line 9
    const/16 v4, 0x30

    .line 10
    .line 11
    if-ne p0, v4, :cond_0

    .line 12
    .line 13
    packed-switch p1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    goto :goto_2

    .line 17
    :pswitch_0
    move p0, v2

    .line 18
    move p1, v3

    .line 19
    goto :goto_2

    .line 20
    :pswitch_1
    move p0, v2

    .line 21
    move p1, v4

    .line 22
    goto :goto_2

    .line 23
    :pswitch_2
    const/16 p1, 0x39

    .line 24
    .line 25
    :goto_0
    move p0, v3

    .line 26
    goto :goto_2

    .line 27
    :pswitch_3
    const/16 p1, 0x38

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :pswitch_4
    const/16 p1, 0x37

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :pswitch_5
    const/16 p1, 0x36

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :pswitch_6
    const/16 p1, 0x35

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :pswitch_7
    move p1, v1

    .line 40
    goto :goto_0

    .line 41
    :pswitch_8
    move p1, v0

    .line 42
    goto :goto_0

    .line 43
    :pswitch_9
    move p1, v2

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    if-ne p0, v3, :cond_1

    .line 46
    .line 47
    packed-switch p1, :pswitch_data_1

    .line 48
    .line 49
    .line 50
    goto :goto_2

    .line 51
    :pswitch_a
    move p1, v1

    .line 52
    :goto_1
    move p0, v2

    .line 53
    goto :goto_2

    .line 54
    :pswitch_b
    move p1, v0

    .line 55
    goto :goto_1

    .line 56
    :pswitch_c
    move p0, v2

    .line 57
    move p1, p0

    .line 58
    :cond_1
    :goto_2
    shl-int/lit8 p0, p0, 0x10

    .line 59
    .line 60
    or-int/2addr p0, p1

    .line 61
    return p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    :pswitch_data_1
    .packed-switch 0x30
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch
.end method

.method public static isDate(Ljava/lang/String;)Z
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    :cond_0
    move/from16 v16, v1

    .line 13
    .line 14
    goto/16 :goto_5

    .line 15
    .line 16
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/16 v3, 0x13

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    if-ne v2, v3, :cond_2

    .line 24
    .line 25
    const/4 v2, 0x4

    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    const/16 v5, 0x2d

    .line 31
    .line 32
    if-ne v3, v5, :cond_2

    .line 33
    .line 34
    const/4 v3, 0x7

    .line 35
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-ne v3, v5, :cond_2

    .line 40
    .line 41
    const/16 v3, 0xa

    .line 42
    .line 43
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    const/16 v6, 0x20

    .line 48
    .line 49
    if-eq v5, v6, :cond_3

    .line 50
    .line 51
    const/16 v6, 0x54

    .line 52
    .line 53
    if-ne v5, v6, :cond_2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    move/from16 v16, v1

    .line 57
    .line 58
    move/from16 v17, v4

    .line 59
    .line 60
    goto/16 :goto_4

    .line 61
    .line 62
    :cond_3
    :goto_0
    const/16 v5, 0xd

    .line 63
    .line 64
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    const/16 v6, 0x3a

    .line 69
    .line 70
    if-ne v5, v6, :cond_2

    .line 71
    .line 72
    const/16 v5, 0x10

    .line 73
    .line 74
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-ne v5, v6, :cond_2

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    const/4 v7, 0x2

    .line 89
    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    const/4 v9, 0x3

    .line 94
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    const/4 v11, 0x5

    .line 99
    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    .line 100
    .line 101
    .line 102
    move-result v11

    .line 103
    const/4 v12, 0x6

    .line 104
    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    .line 105
    .line 106
    .line 107
    move-result v13

    .line 108
    const/16 v14, 0x8

    .line 109
    .line 110
    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    .line 111
    .line 112
    .line 113
    move-result v14

    .line 114
    const/16 v15, 0x9

    .line 115
    .line 116
    move/from16 v16, v1

    .line 117
    .line 118
    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    move/from16 v17, v4

    .line 123
    .line 124
    const/16 v4, 0xb

    .line 125
    .line 126
    move/from16 v18, v9

    .line 127
    .line 128
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    const/16 v4, 0xc

    .line 133
    .line 134
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 135
    .line 136
    .line 137
    move-result v15

    .line 138
    const/16 v12, 0xe

    .line 139
    .line 140
    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    .line 141
    .line 142
    .line 143
    move-result v12

    .line 144
    const/16 v2, 0xf

    .line 145
    .line 146
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    const/16 v7, 0x11

    .line 151
    .line 152
    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    const/16 v4, 0x12

    .line 157
    .line 158
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    const/16 v4, 0x30

    .line 163
    .line 164
    if-lt v5, v4, :cond_d

    .line 165
    .line 166
    const/16 v3, 0x39

    .line 167
    .line 168
    if-gt v5, v3, :cond_d

    .line 169
    .line 170
    if-lt v6, v4, :cond_d

    .line 171
    .line 172
    if-gt v6, v3, :cond_d

    .line 173
    .line 174
    if-lt v8, v4, :cond_d

    .line 175
    .line 176
    if-gt v8, v3, :cond_d

    .line 177
    .line 178
    if-lt v10, v4, :cond_d

    .line 179
    .line 180
    if-gt v10, v3, :cond_d

    .line 181
    .line 182
    if-lt v11, v4, :cond_d

    .line 183
    .line 184
    if-gt v11, v3, :cond_d

    .line 185
    .line 186
    if-lt v13, v4, :cond_d

    .line 187
    .line 188
    if-gt v13, v3, :cond_d

    .line 189
    .line 190
    if-lt v14, v4, :cond_d

    .line 191
    .line 192
    if-gt v14, v3, :cond_d

    .line 193
    .line 194
    if-lt v1, v4, :cond_d

    .line 195
    .line 196
    if-gt v1, v3, :cond_d

    .line 197
    .line 198
    if-lt v9, v4, :cond_d

    .line 199
    .line 200
    if-gt v9, v3, :cond_d

    .line 201
    .line 202
    if-lt v15, v4, :cond_d

    .line 203
    .line 204
    if-gt v15, v3, :cond_d

    .line 205
    .line 206
    if-lt v12, v4, :cond_d

    .line 207
    .line 208
    if-gt v12, v3, :cond_d

    .line 209
    .line 210
    if-lt v2, v4, :cond_d

    .line 211
    .line 212
    if-gt v2, v3, :cond_d

    .line 213
    .line 214
    if-lt v7, v4, :cond_d

    .line 215
    .line 216
    if-gt v7, v3, :cond_d

    .line 217
    .line 218
    if-lt v0, v4, :cond_d

    .line 219
    .line 220
    if-le v0, v3, :cond_4

    .line 221
    .line 222
    goto/16 :goto_3

    .line 223
    .line 224
    :cond_4
    sub-int/2addr v5, v4

    .line 225
    mul-int/lit16 v5, v5, 0x3e8

    .line 226
    .line 227
    const/16 v3, 0x64

    .line 228
    .line 229
    invoke-static {v6, v4, v3, v5}, Lp/a;->z(IIII)I

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    const/16 v6, 0xa

    .line 234
    .line 235
    invoke-static {v8, v4, v6, v5}, Lp/a;->z(IIII)I

    .line 236
    .line 237
    .line 238
    move-result v5

    .line 239
    sub-int/2addr v10, v4

    .line 240
    add-int/2addr v10, v5

    .line 241
    sub-int/2addr v11, v4

    .line 242
    mul-int/2addr v11, v6

    .line 243
    sub-int/2addr v13, v4

    .line 244
    add-int/2addr v13, v11

    .line 245
    sub-int/2addr v14, v4

    .line 246
    mul-int/2addr v14, v6

    .line 247
    sub-int/2addr v1, v4

    .line 248
    add-int/2addr v1, v14

    .line 249
    sub-int/2addr v9, v4

    .line 250
    mul-int/2addr v9, v6

    .line 251
    sub-int/2addr v15, v4

    .line 252
    add-int/2addr v15, v9

    .line 253
    sub-int/2addr v12, v4

    .line 254
    mul-int/2addr v12, v6

    .line 255
    sub-int/2addr v2, v4

    .line 256
    add-int/2addr v2, v12

    .line 257
    sub-int/2addr v7, v4

    .line 258
    mul-int/2addr v7, v6

    .line 259
    sub-int/2addr v0, v4

    .line 260
    add-int/2addr v0, v7

    .line 261
    const/16 v4, 0xc

    .line 262
    .line 263
    if-le v13, v4, :cond_5

    .line 264
    .line 265
    return v16

    .line 266
    :cond_5
    const/16 v4, 0x1c

    .line 267
    .line 268
    if-le v1, v4, :cond_a

    .line 269
    .line 270
    const/4 v5, 0x2

    .line 271
    if-eq v13, v5, :cond_7

    .line 272
    .line 273
    const/4 v5, 0x4

    .line 274
    if-eq v13, v5, :cond_6

    .line 275
    .line 276
    const/4 v3, 0x6

    .line 277
    if-eq v13, v3, :cond_6

    .line 278
    .line 279
    const/16 v3, 0x9

    .line 280
    .line 281
    if-eq v13, v3, :cond_6

    .line 282
    .line 283
    const/16 v3, 0xb

    .line 284
    .line 285
    if-eq v13, v3, :cond_6

    .line 286
    .line 287
    const/16 v3, 0x1f

    .line 288
    .line 289
    goto :goto_2

    .line 290
    :cond_6
    const/16 v3, 0x1e

    .line 291
    .line 292
    goto :goto_2

    .line 293
    :cond_7
    and-int/lit8 v5, v10, 0xf

    .line 294
    .line 295
    if-nez v5, :cond_8

    .line 296
    .line 297
    and-int/lit8 v3, v10, 0x3

    .line 298
    .line 299
    if-nez v3, :cond_9

    .line 300
    .line 301
    goto :goto_1

    .line 302
    :cond_8
    and-int/lit8 v5, v10, 0x3

    .line 303
    .line 304
    if-nez v5, :cond_9

    .line 305
    .line 306
    rem-int/2addr v10, v3

    .line 307
    if-eqz v10, :cond_9

    .line 308
    .line 309
    :goto_1
    const/16 v4, 0x1d

    .line 310
    .line 311
    :cond_9
    move v3, v4

    .line 312
    :goto_2
    if-le v1, v3, :cond_a

    .line 313
    .line 314
    return v16

    .line 315
    :cond_a
    const/16 v1, 0x18

    .line 316
    .line 317
    if-le v15, v1, :cond_b

    .line 318
    .line 319
    return v16

    .line 320
    :cond_b
    const/16 v1, 0x3c

    .line 321
    .line 322
    if-le v2, v1, :cond_c

    .line 323
    .line 324
    return v16

    .line 325
    :cond_c
    const/16 v1, 0x3d

    .line 326
    .line 327
    if-gt v0, v1, :cond_d

    .line 328
    .line 329
    return v17

    .line 330
    :cond_d
    :goto_3
    return v16

    .line 331
    :goto_4
    :try_start_0
    sget-object v1, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 332
    .line 333
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseMillis(Ljava/lang/String;Ljava/time/ZoneId;)J

    .line 334
    .line 335
    .line 336
    move-result-wide v0
    :try_end_0
    .catch Ljava/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 337
    const-wide/16 v2, 0x0

    .line 338
    .line 339
    cmp-long v0, v0, v2

    .line 340
    .line 341
    if-eqz v0, :cond_e

    .line 342
    .line 343
    return v17

    .line 344
    :catch_0
    :cond_e
    :goto_5
    return v16
.end method

.method public static isLocalDate(Ljava/lang/String;)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    :cond_0
    move/from16 v16, v1

    .line 13
    .line 14
    goto/16 :goto_2

    .line 15
    .line 16
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/16 v3, 0x9

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    const/16 v5, 0xa

    .line 24
    .line 25
    if-ne v2, v5, :cond_9

    .line 26
    .line 27
    const/4 v2, 0x4

    .line 28
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    const/16 v7, 0x2d

    .line 33
    .line 34
    if-ne v6, v7, :cond_9

    .line 35
    .line 36
    const/4 v6, 0x7

    .line 37
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-ne v6, v7, :cond_9

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    const/4 v8, 0x2

    .line 52
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 53
    .line 54
    .line 55
    move-result v9

    .line 56
    const/4 v10, 0x3

    .line 57
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    .line 58
    .line 59
    .line 60
    move-result v11

    .line 61
    const/4 v12, 0x5

    .line 62
    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    .line 63
    .line 64
    .line 65
    move-result v12

    .line 66
    const/4 v13, 0x6

    .line 67
    invoke-virtual {v0, v13}, Ljava/lang/String;->charAt(I)C

    .line 68
    .line 69
    .line 70
    move-result v14

    .line 71
    const/16 v15, 0x8

    .line 72
    .line 73
    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    .line 74
    .line 75
    .line 76
    move-result v15

    .line 77
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    move/from16 v16, v1

    .line 82
    .line 83
    const/16 v1, 0x30

    .line 84
    .line 85
    sub-int/2addr v6, v1

    .line 86
    mul-int/lit16 v6, v6, 0x3e8

    .line 87
    .line 88
    move/from16 v17, v4

    .line 89
    .line 90
    const/16 v4, 0x64

    .line 91
    .line 92
    invoke-static {v7, v1, v4, v6}, Lp/a;->z(IIII)I

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    invoke-static {v9, v1, v5, v6}, Lp/a;->z(IIII)I

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    sub-int/2addr v11, v1

    .line 101
    add-int/2addr v11, v6

    .line 102
    sub-int/2addr v12, v1

    .line 103
    mul-int/2addr v12, v5

    .line 104
    sub-int/2addr v14, v1

    .line 105
    add-int/2addr v14, v12

    .line 106
    sub-int/2addr v15, v1

    .line 107
    mul-int/2addr v15, v5

    .line 108
    sub-int/2addr v0, v1

    .line 109
    add-int/2addr v0, v15

    .line 110
    const/16 v1, 0xc

    .line 111
    .line 112
    if-le v14, v1, :cond_2

    .line 113
    .line 114
    return v16

    .line 115
    :cond_2
    const/16 v1, 0x1c

    .line 116
    .line 117
    if-le v0, v1, :cond_8

    .line 118
    .line 119
    if-eq v14, v8, :cond_4

    .line 120
    .line 121
    if-eq v14, v2, :cond_3

    .line 122
    .line 123
    if-eq v14, v13, :cond_3

    .line 124
    .line 125
    if-eq v14, v3, :cond_3

    .line 126
    .line 127
    const/16 v1, 0xb

    .line 128
    .line 129
    if-eq v14, v1, :cond_3

    .line 130
    .line 131
    const/16 v1, 0x1f

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_3
    const/16 v1, 0x1e

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_4
    and-int/lit8 v2, v11, 0xf

    .line 138
    .line 139
    if-nez v2, :cond_5

    .line 140
    .line 141
    and-int/lit8 v2, v11, 0x3

    .line 142
    .line 143
    if-nez v2, :cond_6

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_5
    and-int/lit8 v2, v11, 0x3

    .line 147
    .line 148
    if-nez v2, :cond_6

    .line 149
    .line 150
    rem-int/2addr v11, v4

    .line 151
    if-eqz v11, :cond_6

    .line 152
    .line 153
    :goto_0
    const/16 v1, 0x1d

    .line 154
    .line 155
    :cond_6
    :goto_1
    if-gt v0, v1, :cond_7

    .line 156
    .line 157
    return v17

    .line 158
    :cond_7
    return v16

    .line 159
    :cond_8
    return v17

    .line 160
    :cond_9
    move/from16 v16, v1

    .line 161
    .line 162
    move/from16 v17, v4

    .line 163
    .line 164
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    if-lt v1, v3, :cond_b

    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    const/16 v2, 0x28

    .line 175
    .line 176
    if-le v1, v2, :cond_a

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_a
    :try_start_0
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate(Ljava/lang/String;)Ljava/time/LocalDate;

    .line 180
    .line 181
    .line 182
    move-result-object v0
    :try_end_0
    .catch Ljava/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 183
    if-eqz v0, :cond_b

    .line 184
    .line 185
    return v17

    .line 186
    :catch_0
    :cond_b
    :goto_2
    return v16
.end method

.method public static isLocalTime(Ljava/lang/String;)Z
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_5

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_0

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/16 v2, 0x8

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    if-ne v1, v2, :cond_4

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/16 v2, 0x3a

    .line 27
    .line 28
    if-ne v1, v2, :cond_4

    .line 29
    .line 30
    const/4 v1, 0x5

    .line 31
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-ne v1, v2, :cond_4

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    const/4 v4, 0x3

    .line 46
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    const/4 v5, 0x4

    .line 51
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    const/4 v6, 0x6

    .line 56
    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    const/4 v7, 0x7

    .line 61
    invoke-virtual {p0, v7}, Ljava/lang/String;->charAt(I)C

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    const/16 v7, 0x30

    .line 66
    .line 67
    if-lt v1, v7, :cond_3

    .line 68
    .line 69
    const/16 v8, 0x32

    .line 70
    .line 71
    if-gt v1, v8, :cond_3

    .line 72
    .line 73
    if-lt v2, v7, :cond_3

    .line 74
    .line 75
    const/16 v8, 0x39

    .line 76
    .line 77
    if-gt v2, v8, :cond_3

    .line 78
    .line 79
    if-lt v4, v7, :cond_3

    .line 80
    .line 81
    const/16 v9, 0x36

    .line 82
    .line 83
    if-gt v4, v9, :cond_3

    .line 84
    .line 85
    if-lt v5, v7, :cond_3

    .line 86
    .line 87
    if-gt v5, v8, :cond_3

    .line 88
    .line 89
    if-lt v6, v7, :cond_3

    .line 90
    .line 91
    if-gt v6, v9, :cond_3

    .line 92
    .line 93
    if-lt p0, v7, :cond_3

    .line 94
    .line 95
    if-gt p0, v8, :cond_3

    .line 96
    .line 97
    sub-int/2addr v1, v7

    .line 98
    mul-int/lit8 v1, v1, 0xa

    .line 99
    .line 100
    sub-int/2addr v2, v7

    .line 101
    add-int/2addr v2, v1

    .line 102
    const/16 v1, 0x18

    .line 103
    .line 104
    if-le v2, v1, :cond_1

    .line 105
    .line 106
    return v0

    .line 107
    :cond_1
    sub-int/2addr v4, v7

    .line 108
    mul-int/lit8 v4, v4, 0xa

    .line 109
    .line 110
    sub-int/2addr v5, v7

    .line 111
    add-int/2addr v5, v4

    .line 112
    const/16 v1, 0x3c

    .line 113
    .line 114
    if-le v5, v1, :cond_2

    .line 115
    .line 116
    return v0

    .line 117
    :cond_2
    sub-int/2addr v6, v7

    .line 118
    mul-int/lit8 v6, v6, 0xa

    .line 119
    .line 120
    sub-int/2addr p0, v7

    .line 121
    add-int/2addr p0, v6

    .line 122
    const/16 v1, 0x3d

    .line 123
    .line 124
    if-gt p0, v1, :cond_3

    .line 125
    .line 126
    return v3

    .line 127
    :cond_3
    return v0

    .line 128
    :cond_4
    :try_start_0
    invoke-static {p0}, Ljava/time/LocalTime;->parse(Ljava/lang/CharSequence;)Ljava/time/LocalTime;
    :try_end_0
    .catch Ljava/time/format/DateTimeParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 129
    .line 130
    .line 131
    return v3

    .line 132
    :catch_0
    :cond_5
    :goto_0
    return v0
.end method

.method public static localDateTime(CCCCCCCCCCCCCC)Ljava/time/LocalDateTime;
    .locals 17

    move/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move/from16 v12, p12

    move/from16 v13, p13

    const/16 v15, 0x30

    const/16 v16, 0x0

    if-lt v0, v15, :cond_2

    const/16 v14, 0x39

    if-gt v0, v14, :cond_2

    if-lt v1, v15, :cond_2

    if-gt v1, v14, :cond_2

    if-lt v2, v15, :cond_2

    if-gt v2, v14, :cond_2

    if-lt v3, v15, :cond_2

    if-gt v3, v14, :cond_2

    sub-int/2addr v0, v15

    mul-int/lit16 v0, v0, 0x3e8

    const/16 v14, 0x64

    .line 4
    invoke-static {v1, v15, v14, v0}, Lp/a;->z(IIII)I

    move-result v0

    const/16 v1, 0xa

    invoke-static {v2, v15, v1, v0}, Lp/a;->z(IIII)I

    move-result v0

    add-int/lit8 v2, v3, -0x30

    add-int/2addr v2, v0

    if-lt v4, v15, :cond_2

    const/16 v0, 0x39

    if-gt v4, v0, :cond_2

    if-lt v5, v15, :cond_2

    if-gt v5, v0, :cond_2

    add-int/lit8 v3, v4, -0x30

    mul-int/2addr v3, v1

    add-int/lit8 v4, v5, -0x30

    add-int/2addr v4, v3

    if-lt v6, v15, :cond_2

    if-gt v6, v0, :cond_2

    if-lt v7, v15, :cond_2

    if-gt v7, v0, :cond_2

    add-int/lit8 v3, v6, -0x30

    mul-int/2addr v3, v1

    add-int/lit8 v5, v7, -0x30

    add-int/2addr v5, v3

    if-lt v8, v15, :cond_2

    if-gt v8, v0, :cond_2

    if-lt v9, v15, :cond_2

    if-gt v9, v0, :cond_2

    add-int/lit8 v3, v8, -0x30

    mul-int/2addr v3, v1

    add-int/lit8 v6, v9, -0x30

    add-int/2addr v6, v3

    if-lt v10, v15, :cond_2

    if-gt v10, v0, :cond_2

    if-lt v11, v15, :cond_2

    if-gt v11, v0, :cond_2

    add-int/lit8 v3, v10, -0x30

    mul-int/2addr v3, v1

    add-int/lit8 v7, v11, -0x30

    add-int/2addr v7, v3

    if-lt v12, v15, :cond_2

    if-gt v12, v0, :cond_2

    if-lt v13, v15, :cond_2

    if-gt v13, v0, :cond_2

    add-int/lit8 v0, v12, -0x30

    mul-int/2addr v0, v1

    add-int/lit8 v1, v13, -0x30

    add-int/2addr v1, v0

    if-nez v2, :cond_0

    if-nez v4, :cond_0

    if-nez v5, :cond_0

    if-nez v6, :cond_0

    if-nez v7, :cond_0

    if-nez v1, :cond_0

    return-object v16

    :cond_0
    const/16 v0, 0x18

    if-gt v6, v0, :cond_2

    const/16 v0, 0x3c

    if-gt v7, v0, :cond_2

    if-le v1, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    move/from16 p6, v0

    move/from16 p5, v1

    move/from16 p0, v2

    move/from16 p1, v4

    move/from16 p2, v5

    move/from16 p3, v6

    move/from16 p4, v7

    .line 5
    invoke-static/range {p0 .. p6}, Ljava/time/LocalDateTime;->of(IIIIIII)Ljava/time/LocalDateTime;

    move-result-object v0

    return-object v0

    :cond_2
    :goto_0
    return-object v16
.end method

.method public static localDateTime(CCCCCCCCCCCCCCCCCCCCCCC)Ljava/time/LocalDateTime;
    .locals 17

    move/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move/from16 v12, p12

    move/from16 v13, p13

    const/16 v16, 0x0

    const/16 v15, 0x30

    if-lt v0, v15, :cond_0

    const/16 v14, 0x39

    if-gt v0, v14, :cond_0

    if-lt v1, v15, :cond_0

    if-gt v1, v14, :cond_0

    if-lt v2, v15, :cond_0

    if-gt v2, v14, :cond_0

    if-lt v3, v15, :cond_0

    if-gt v3, v14, :cond_0

    sub-int/2addr v0, v15

    const/16 v14, 0x3e8

    mul-int/2addr v0, v14

    const/16 v14, 0x64

    .line 1
    invoke-static {v1, v15, v14, v0}, Lp/a;->z(IIII)I

    move-result v0

    const/16 v1, 0xa

    invoke-static {v2, v15, v1, v0}, Lp/a;->z(IIII)I

    move-result v0

    add-int/lit8 v2, v3, -0x30

    add-int/2addr v2, v0

    if-lt v4, v15, :cond_0

    const/16 v0, 0x39

    if-gt v4, v0, :cond_0

    if-lt v5, v15, :cond_0

    if-gt v5, v0, :cond_0

    add-int/lit8 v3, v4, -0x30

    mul-int/2addr v3, v1

    add-int/lit8 v4, v5, -0x30

    add-int/2addr v4, v3

    if-lt v6, v15, :cond_0

    if-gt v6, v0, :cond_0

    if-lt v7, v15, :cond_0

    if-gt v7, v0, :cond_0

    add-int/lit8 v3, v6, -0x30

    mul-int/2addr v3, v1

    add-int/lit8 v5, v7, -0x30

    add-int/2addr v5, v3

    if-lt v8, v15, :cond_0

    if-gt v8, v0, :cond_0

    if-lt v9, v15, :cond_0

    if-gt v9, v0, :cond_0

    add-int/lit8 v3, v8, -0x30

    mul-int/2addr v3, v1

    add-int/lit8 v6, v9, -0x30

    add-int/2addr v6, v3

    if-lt v10, v15, :cond_0

    if-gt v10, v0, :cond_0

    if-lt v11, v15, :cond_0

    if-gt v11, v0, :cond_0

    add-int/lit8 v3, v10, -0x30

    mul-int/2addr v3, v1

    add-int/lit8 v7, v11, -0x30

    add-int/2addr v7, v3

    if-lt v12, v15, :cond_0

    if-gt v12, v0, :cond_0

    if-lt v13, v15, :cond_0

    if-gt v13, v0, :cond_0

    add-int/lit8 v3, v12, -0x30

    mul-int/2addr v3, v1

    add-int/lit8 v8, v13, -0x30

    add-int/2addr v8, v3

    move/from16 v3, p14

    if-lt v3, v15, :cond_0

    if-gt v3, v0, :cond_0

    move/from16 v9, p15

    if-lt v9, v15, :cond_0

    if-gt v9, v0, :cond_0

    move/from16 v10, p16

    if-lt v10, v15, :cond_0

    if-gt v10, v0, :cond_0

    move/from16 v11, p17

    if-lt v11, v15, :cond_0

    if-gt v11, v0, :cond_0

    move/from16 v12, p18

    if-lt v12, v15, :cond_0

    if-gt v12, v0, :cond_0

    move/from16 v13, p19

    if-lt v13, v15, :cond_0

    if-gt v13, v0, :cond_0

    move/from16 v1, p20

    if-lt v1, v15, :cond_0

    if-gt v1, v0, :cond_0

    move/from16 v14, p21

    if-lt v14, v15, :cond_0

    if-gt v14, v0, :cond_0

    move/from16 p2, v2

    move/from16 v2, p22

    if-lt v2, v15, :cond_0

    if-gt v2, v0, :cond_0

    add-int/lit8 v0, v3, -0x30

    const v3, 0x5f5e100

    mul-int/2addr v0, v3

    const v3, 0x989680

    .line 2
    invoke-static {v9, v15, v3, v0}, Lp/a;->z(IIII)I

    move-result v0

    const v3, 0xf4240

    invoke-static {v10, v15, v3, v0}, Lp/a;->z(IIII)I

    move-result v0

    const v3, 0x186a0

    invoke-static {v11, v15, v3, v0}, Lp/a;->z(IIII)I

    move-result v0

    const/16 v3, 0x2710

    invoke-static {v12, v15, v3, v0}, Lp/a;->z(IIII)I

    move-result v0

    const/16 v3, 0x3e8

    invoke-static {v13, v15, v3, v0}, Lp/a;->z(IIII)I

    move-result v0

    const/16 v3, 0x64

    invoke-static {v1, v15, v3, v0}, Lp/a;->z(IIII)I

    move-result v0

    const/16 v1, 0xa

    invoke-static {v14, v15, v1, v0}, Lp/a;->z(IIII)I

    move-result v0

    add-int/lit8 v1, v2, -0x30

    add-int/2addr v1, v0

    move/from16 p1, p2

    move/from16 p7, v1

    move/from16 p2, v4

    move/from16 p3, v5

    move/from16 p4, v6

    move/from16 p5, v7

    move/from16 p6, v8

    .line 3
    invoke-static/range {p1 .. p7}, Ljava/time/LocalDateTime;->of(IIIIIII)Ljava/time/LocalDateTime;

    move-result-object v0

    return-object v0

    :cond_0
    return-object v16
.end method

.method public static millis(Ljava/time/LocalDateTime;)J
    .locals 8

    .line 167
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->getYear()I

    move-result v1

    .line 168
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->getMonthValue()I

    move-result v2

    .line 169
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->getDayOfMonth()I

    move-result v3

    .line 170
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->getHour()I

    move-result v4

    .line 171
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->getMinute()I

    move-result v5

    .line 172
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->getSecond()I

    move-result v6

    .line 173
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->getNano()I

    move-result v7

    const/4 v0, 0x0

    .line 174
    invoke-static/range {v0 .. v7}, Lcom/alibaba/fastjson2/util/DateUtils;->millis(Ljava/time/ZoneId;IIIIIII)J

    move-result-wide v0

    return-wide v0
.end method

.method public static millis(Ljava/time/LocalDateTime;Ljava/time/ZoneId;)J
    .locals 8

    .line 159
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->getYear()I

    move-result v1

    .line 160
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->getMonthValue()I

    move-result v2

    .line 161
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->getDayOfMonth()I

    move-result v3

    .line 162
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->getHour()I

    move-result v4

    .line 163
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->getMinute()I

    move-result v5

    .line 164
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->getSecond()I

    move-result v6

    .line 165
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->getNano()I

    move-result v7

    move-object v0, p1

    .line 166
    invoke-static/range {v0 .. v7}, Lcom/alibaba/fastjson2/util/DateUtils;->millis(Ljava/time/ZoneId;IIIIIII)J

    move-result-wide p0

    return-wide p0
.end method

.method public static millis(Ljava/time/ZoneId;IIIIIII)J
    .locals 6

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 4
    .line 5
    :cond_0
    mul-int/lit16 v0, p1, 0x16d

    .line 6
    .line 7
    add-int/lit8 v1, p1, 0x3

    .line 8
    .line 9
    div-int/lit8 v1, v1, 0x4

    .line 10
    .line 11
    add-int/lit8 v2, p1, 0x63

    .line 12
    .line 13
    div-int/lit8 v2, v2, 0x64

    .line 14
    .line 15
    sub-int/2addr v1, v2

    .line 16
    add-int/lit16 v2, p1, 0x18f

    .line 17
    .line 18
    div-int/lit16 v2, v2, 0x190

    .line 19
    .line 20
    add-int/2addr v2, v1

    .line 21
    add-int/2addr v2, v0

    .line 22
    mul-int/lit16 v0, p2, 0x16f

    .line 23
    .line 24
    add-int/lit16 v0, v0, -0x16a

    .line 25
    .line 26
    div-int/lit8 v0, v0, 0xc

    .line 27
    .line 28
    add-int/2addr v0, v2

    .line 29
    add-int/lit8 v1, p3, -0x1

    .line 30
    .line 31
    add-int/2addr v1, v0

    .line 32
    int-to-long v0, v1

    .line 33
    const/4 v2, 0x2

    .line 34
    if-le p2, v2, :cond_3

    .line 35
    .line 36
    const-wide/16 v2, 0x1

    .line 37
    .line 38
    sub-long v2, v0, v2

    .line 39
    .line 40
    and-int/lit8 v4, p1, 0x3

    .line 41
    .line 42
    if-nez v4, :cond_2

    .line 43
    .line 44
    rem-int/lit8 v4, p1, 0x64

    .line 45
    .line 46
    if-nez v4, :cond_1

    .line 47
    .line 48
    rem-int/lit16 v4, p1, 0x190

    .line 49
    .line 50
    if-nez v4, :cond_2

    .line 51
    .line 52
    :cond_1
    move-wide v0, v2

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    const-wide/16 v2, 0x2

    .line 55
    .line 56
    sub-long/2addr v0, v2

    .line 57
    :cond_3
    :goto_0
    const-wide/32 v2, 0xafaa8

    .line 58
    .line 59
    .line 60
    sub-long/2addr v0, v2

    .line 61
    const-wide/32 v2, 0x15180

    .line 62
    .line 63
    .line 64
    mul-long/2addr v0, v2

    .line 65
    mul-int/lit16 v2, p4, 0xe10

    .line 66
    .line 67
    int-to-long v2, v2

    .line 68
    add-long/2addr v0, v2

    .line 69
    mul-int/lit8 v2, p5, 0x3c

    .line 70
    .line 71
    int-to-long v2, v2

    .line 72
    add-long/2addr v0, v2

    .line 73
    int-to-long v2, p6

    .line 74
    add-long/2addr v0, v2

    .line 75
    sget-object v2, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_ID:Ljava/time/ZoneId;

    .line 76
    .line 77
    const/4 v3, 0x0

    .line 78
    if-eq p0, v2, :cond_5

    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    sget-object v4, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_RULES:Ljava/time/zone/ZoneRules;

    .line 85
    .line 86
    if-ne v2, v4, :cond_4

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_4
    move v2, v3

    .line 90
    goto :goto_2

    .line 91
    :cond_5
    :goto_1
    const/4 v2, 0x1

    .line 92
    :goto_2
    if-eqz v2, :cond_6

    .line 93
    .line 94
    const-wide/32 v4, 0x28d2bea0

    .line 95
    .line 96
    .line 97
    cmp-long v2, v0, v4

    .line 98
    .line 99
    if-ltz v2, :cond_6

    .line 100
    .line 101
    const/16 v3, 0x7080

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_6
    sget-object v2, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 105
    .line 106
    if-eq p0, v2, :cond_8

    .line 107
    .line 108
    const-string v2, "UTC"

    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/time/ZoneId;->getId()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-eqz v2, :cond_7

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_7
    invoke-static {p1, p2, p3}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-static {p4, p5, p6, p7}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    invoke-static {p1, p2}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {p0}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    invoke-virtual {p0, p1}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/LocalDateTime;)Ljava/time/ZoneOffset;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-virtual {p0}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    :cond_8
    :goto_3
    int-to-long p0, v3

    .line 146
    sub-long/2addr v0, p0

    .line 147
    const-wide/16 p0, 0x3e8

    .line 148
    .line 149
    mul-long/2addr v0, p0

    .line 150
    if-eqz p7, :cond_9

    .line 151
    .line 152
    const p0, 0xf4240

    .line 153
    .line 154
    .line 155
    div-int/2addr p7, p0

    .line 156
    int-to-long p0, p7

    .line 157
    add-long/2addr v0, p0

    .line 158
    :cond_9
    return-wide v0
.end method

.method public static month(CCC)I
    .locals 7

    .line 1
    const/16 v0, 0x41

    .line 2
    .line 3
    const/16 v1, 0x75

    .line 4
    .line 5
    const/16 v2, 0x72

    .line 6
    .line 7
    const/16 v3, 0x70

    .line 8
    .line 9
    if-eq p0, v0, :cond_7

    .line 10
    .line 11
    const/16 v0, 0x44

    .line 12
    .line 13
    const/16 v4, 0x63

    .line 14
    .line 15
    const/16 v5, 0x65

    .line 16
    .line 17
    if-eq p0, v0, :cond_6

    .line 18
    .line 19
    const/16 v0, 0x46

    .line 20
    .line 21
    if-eq p0, v0, :cond_5

    .line 22
    .line 23
    const/16 v0, 0x4a

    .line 24
    .line 25
    const/16 v6, 0x61

    .line 26
    .line 27
    if-eq p0, v0, :cond_2

    .line 28
    .line 29
    const/16 v0, 0x53

    .line 30
    .line 31
    if-eq p0, v0, :cond_1

    .line 32
    .line 33
    packed-switch p0, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :pswitch_0
    if-ne p1, v4, :cond_9

    .line 38
    .line 39
    const/16 p0, 0x74

    .line 40
    .line 41
    if-ne p2, p0, :cond_9

    .line 42
    .line 43
    const/16 p0, 0xa

    .line 44
    .line 45
    return p0

    .line 46
    :pswitch_1
    const/16 p0, 0x6f

    .line 47
    .line 48
    if-ne p1, p0, :cond_9

    .line 49
    .line 50
    const/16 p0, 0x76

    .line 51
    .line 52
    if-ne p2, p0, :cond_9

    .line 53
    .line 54
    const/16 p0, 0xb

    .line 55
    .line 56
    return p0

    .line 57
    :pswitch_2
    if-ne p1, v6, :cond_9

    .line 58
    .line 59
    if-ne p2, v2, :cond_0

    .line 60
    .line 61
    const/4 p0, 0x3

    .line 62
    return p0

    .line 63
    :cond_0
    const/16 p0, 0x79

    .line 64
    .line 65
    if-ne p2, p0, :cond_9

    .line 66
    .line 67
    const/4 p0, 0x5

    .line 68
    return p0

    .line 69
    :cond_1
    if-ne p1, v5, :cond_9

    .line 70
    .line 71
    if-ne p2, v3, :cond_9

    .line 72
    .line 73
    const/16 p0, 0x9

    .line 74
    .line 75
    return p0

    .line 76
    :cond_2
    const/16 p0, 0x6e

    .line 77
    .line 78
    if-ne p1, v6, :cond_3

    .line 79
    .line 80
    if-ne p2, p0, :cond_3

    .line 81
    .line 82
    const/4 p0, 0x1

    .line 83
    return p0

    .line 84
    :cond_3
    if-ne p1, v1, :cond_9

    .line 85
    .line 86
    if-ne p2, p0, :cond_4

    .line 87
    .line 88
    const/4 p0, 0x6

    .line 89
    return p0

    .line 90
    :cond_4
    const/16 p0, 0x6c

    .line 91
    .line 92
    if-ne p2, p0, :cond_9

    .line 93
    .line 94
    const/4 p0, 0x7

    .line 95
    return p0

    .line 96
    :cond_5
    if-ne p1, v5, :cond_9

    .line 97
    .line 98
    const/16 p0, 0x62

    .line 99
    .line 100
    if-ne p2, p0, :cond_9

    .line 101
    .line 102
    const/4 p0, 0x2

    .line 103
    return p0

    .line 104
    :cond_6
    if-ne p1, v5, :cond_9

    .line 105
    .line 106
    if-ne p2, v4, :cond_9

    .line 107
    .line 108
    const/16 p0, 0xc

    .line 109
    .line 110
    return p0

    .line 111
    :cond_7
    if-ne p1, v3, :cond_8

    .line 112
    .line 113
    if-ne p2, v2, :cond_8

    .line 114
    .line 115
    const/4 p0, 0x4

    .line 116
    return p0

    .line 117
    :cond_8
    if-ne p1, v1, :cond_9

    .line 118
    .line 119
    const/16 p0, 0x67

    .line 120
    .line 121
    if-ne p2, p0, :cond_9

    .line 122
    .line 123
    const/16 p0, 0x8

    .line 124
    .line 125
    return p0

    .line 126
    :cond_9
    :goto_0
    const/4 p0, 0x0

    .line 127
    return p0

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x4d
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static nanos(II)I
    .locals 1

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->POWERS:[I

    .line 2
    .line 3
    rsub-int/lit8 p1, p1, 0x9

    .line 4
    .line 5
    and-int/lit8 p1, p1, 0xf

    .line 6
    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    mul-int/2addr p0, p1

    .line 10
    return p0
.end method

.method public static parseDate(Ljava/lang/String;)Ljava/util/Date;
    .locals 4

    .line 308
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/DateUtils;->parseMillis(Ljava/lang/String;Ljava/time/ZoneId;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p0, v0, v2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 309
    :cond_0
    new-instance p0, Ljava/util/Date;

    invoke-direct {p0, v0, v1}, Ljava/util/Date;-><init>(J)V

    return-object p0
.end method

.method public static parseDate(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;
    .locals 1

    .line 307
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    invoke-static {p0, p1, v0}, Lcom/alibaba/fastjson2/util/DateUtils;->parseDate(Ljava/lang/String;Ljava/lang/String;Ljava/time/ZoneId;)Ljava/util/Date;

    move-result-object p0

    return-object p0
.end method

.method public static parseDate(Ljava/lang/String;Ljava/lang/String;Ljava/time/ZoneId;)Ljava/util/Date;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_e

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_e

    .line 9
    .line 10
    const-string v1, "null"

    .line 11
    .line 12
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    goto/16 :goto_2

    .line 19
    .line 20
    :cond_0
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    :cond_1
    move-object p1, p2

    .line 29
    goto/16 :goto_1

    .line 30
    .line 31
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/4 v1, -0x1

    .line 36
    sparse-switch v0, :sswitch_data_0

    .line 37
    .line 38
    .line 39
    goto/16 :goto_0

    .line 40
    .line 41
    :sswitch_0
    const-string v0, "iso8601"

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_3

    .line 48
    .line 49
    goto/16 :goto_0

    .line 50
    .line 51
    :cond_3
    const/16 v1, 0x8

    .line 52
    .line 53
    goto/16 :goto_0

    .line 54
    .line 55
    :sswitch_1
    const-string v0, "yyyy-MM-dd\'T\'HH:mm:ss"

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_4

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_4
    const/4 v1, 0x7

    .line 65
    goto :goto_0

    .line 66
    :sswitch_2
    const-string v0, "dd.MM.yyyy HH:mm:ss"

    .line 67
    .line 68
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_5

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_5
    const/4 v1, 0x6

    .line 76
    goto :goto_0

    .line 77
    :sswitch_3
    const-string v0, "yyyy-MM-dd HH:mm:ss"

    .line 78
    .line 79
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_6

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_6
    const/4 v1, 0x5

    .line 87
    goto :goto_0

    .line 88
    :sswitch_4
    const-string v0, "yyyy/MM/dd HH:mm:ss"

    .line 89
    .line 90
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-nez v0, :cond_7

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_7
    const/4 v1, 0x4

    .line 98
    goto :goto_0

    .line 99
    :sswitch_5
    const-string v0, "yyyy/MM/dd"

    .line 100
    .line 101
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-nez v0, :cond_8

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_8
    const/4 v1, 0x3

    .line 109
    goto :goto_0

    .line 110
    :sswitch_6
    const-string v0, "yyyy-MM-dd"

    .line 111
    .line 112
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-nez v0, :cond_9

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_9
    const/4 v1, 0x2

    .line 120
    goto :goto_0

    .line 121
    :sswitch_7
    const-string v0, "yyyyMMdd"

    .line 122
    .line 123
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-nez v0, :cond_a

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_a
    const/4 v1, 0x1

    .line 131
    goto :goto_0

    .line 132
    :sswitch_8
    const-string v0, "yyyyMMddHHmmssSSSZ"

    .line 133
    .line 134
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-nez v0, :cond_b

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_b
    const/4 v1, 0x0

    .line 142
    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 143
    .line 144
    .line 145
    if-nez p2, :cond_c

    .line 146
    .line 147
    sget-object p2, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 148
    .line 149
    :cond_c
    invoke-static {p1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-static {p0, p1}, Ljava/time/LocalDateTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDateTime;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-static {p0, p2}, Lcom/alibaba/fastjson2/util/DateUtils;->millis(Ljava/time/LocalDateTime;Ljava/time/ZoneId;)J

    .line 158
    .line 159
    .line 160
    move-result-wide p0

    .line 161
    new-instance p2, Ljava/util/Date;

    .line 162
    .line 163
    invoke-direct {p2, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 164
    .line 165
    .line 166
    return-object p2

    .line 167
    :pswitch_0
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/DateUtils;->parseDate(Ljava/lang/String;)Ljava/util/Date;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    return-object p0

    .line 172
    :pswitch_1
    sget-object p1, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_DASH_T:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 173
    .line 174
    invoke-static {p0, p2, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseMillis19(Ljava/lang/String;Ljava/time/ZoneId;Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)J

    .line 175
    .line 176
    .line 177
    move-result-wide p0

    .line 178
    new-instance p2, Ljava/util/Date;

    .line 179
    .line 180
    invoke-direct {p2, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 181
    .line 182
    .line 183
    return-object p2

    .line 184
    :pswitch_2
    sget-object p1, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_DOT:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 185
    .line 186
    invoke-static {p0, p2, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseMillis19(Ljava/lang/String;Ljava/time/ZoneId;Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)J

    .line 187
    .line 188
    .line 189
    move-result-wide p0

    .line 190
    new-instance p2, Ljava/util/Date;

    .line 191
    .line 192
    invoke-direct {p2, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 193
    .line 194
    .line 195
    return-object p2

    .line 196
    :pswitch_3
    invoke-static {p0, p2}, Lcom/alibaba/fastjson2/util/DateUtils;->parseMillisYMDHMS19(Ljava/lang/String;Ljava/time/ZoneId;)J

    .line 197
    .line 198
    .line 199
    move-result-wide p0

    .line 200
    new-instance p2, Ljava/util/Date;

    .line 201
    .line 202
    invoke-direct {p2, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 203
    .line 204
    .line 205
    return-object p2

    .line 206
    :pswitch_4
    sget-object p1, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_SLASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 207
    .line 208
    invoke-static {p0, p2, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseMillis19(Ljava/lang/String;Ljava/time/ZoneId;Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)J

    .line 209
    .line 210
    .line 211
    move-result-wide p0

    .line 212
    new-instance p2, Ljava/util/Date;

    .line 213
    .line 214
    invoke-direct {p2, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 215
    .line 216
    .line 217
    return-object p2

    .line 218
    :pswitch_5
    sget-object p1, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_SLASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 219
    .line 220
    invoke-static {p0, p2, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseMillis10(Ljava/lang/String;Ljava/time/ZoneId;Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)J

    .line 221
    .line 222
    .line 223
    move-result-wide p0

    .line 224
    new-instance p2, Ljava/util/Date;

    .line 225
    .line 226
    invoke-direct {p2, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 227
    .line 228
    .line 229
    return-object p2

    .line 230
    :pswitch_6
    sget-object p1, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_DASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 231
    .line 232
    invoke-static {p0, p2, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseMillis10(Ljava/lang/String;Ljava/time/ZoneId;Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)J

    .line 233
    .line 234
    .line 235
    move-result-wide p0

    .line 236
    new-instance p2, Ljava/util/Date;

    .line 237
    .line 238
    invoke-direct {p2, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 239
    .line 240
    .line 241
    return-object p2

    .line 242
    :pswitch_7
    invoke-static {p1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    invoke-static {p0, p1}, Ljava/time/LocalDate;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDate;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    invoke-virtual {p0}, Ljava/time/LocalDate;->getYear()I

    .line 251
    .line 252
    .line 253
    move-result v1

    .line 254
    invoke-virtual {p0}, Ljava/time/LocalDate;->getMonthValue()I

    .line 255
    .line 256
    .line 257
    move-result v2

    .line 258
    invoke-virtual {p0}, Ljava/time/LocalDate;->getDayOfMonth()I

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    const/4 v6, 0x0

    .line 263
    const/4 v7, 0x0

    .line 264
    const/4 v4, 0x0

    .line 265
    const/4 v5, 0x0

    .line 266
    move-object v0, p2

    .line 267
    invoke-static/range {v0 .. v7}, Lcom/alibaba/fastjson2/util/DateUtils;->millis(Ljava/time/ZoneId;IIIIIII)J

    .line 268
    .line 269
    .line 270
    move-result-wide p0

    .line 271
    new-instance p2, Ljava/util/Date;

    .line 272
    .line 273
    invoke-direct {p2, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 274
    .line 275
    .line 276
    return-object p2

    .line 277
    :pswitch_8
    sget-object p1, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 278
    .line 279
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseMillis(Ljava/lang/String;Ljava/time/ZoneId;)J

    .line 280
    .line 281
    .line 282
    move-result-wide p0

    .line 283
    new-instance p2, Ljava/util/Date;

    .line 284
    .line 285
    invoke-direct {p2, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 286
    .line 287
    .line 288
    return-object p2

    .line 289
    :goto_1
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseMillis(Ljava/lang/String;Ljava/time/ZoneId;)J

    .line 290
    .line 291
    .line 292
    move-result-wide p0

    .line 293
    const-wide/16 v1, 0x0

    .line 294
    .line 295
    cmp-long p2, p0, v1

    .line 296
    .line 297
    if-nez p2, :cond_d

    .line 298
    .line 299
    return-object v0

    .line 300
    :cond_d
    new-instance p2, Ljava/util/Date;

    .line 301
    .line 302
    invoke-direct {p2, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 303
    .line 304
    .line 305
    return-object p2

    .line 306
    :cond_e
    :goto_2
    return-object v0

    .line 307
    :sswitch_data_0
    .sparse-switch
        -0x14bad9d9 -> :sswitch_8
        -0x10781ba0 -> :sswitch_7
        -0x985fe00 -> :sswitch_6
        -0x61c4540 -> :sswitch_5
        0x129110e0 -> :sswitch_4
        0x4f76f1a0 -> :sswitch_3
        0x534c3940 -> :sswitch_2
        0x6b2ed43a -> :sswitch_1
        0x7ce21384 -> :sswitch_0
    .end sparse-switch

    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static parseDate(Ljava/lang/String;Ljava/time/ZoneId;)Ljava/util/Date;
    .locals 2

    .line 310
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseMillis(Ljava/lang/String;Ljava/time/ZoneId;)J

    move-result-wide p0

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 311
    :cond_0
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p0, p1}, Ljava/util/Date;-><init>(J)V

    return-object v0
.end method

.method public static parseDateYMDHMS19(Ljava/lang/String;)Ljava/util/Date;
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 11
    .line 12
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/DateUtils;->parseMillisYMDHMS19(Ljava/lang/String;Ljava/time/ZoneId;)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    new-instance p0, Ljava/util/Date;

    .line 17
    .line 18
    invoke-direct {p0, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 19
    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public static parseLocalDate(Ljava/lang/String;)Ljava/time/LocalDate;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    array-length v2, v1

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {v1, v3, v2}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate([CII)Ljava/time/LocalDate;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-nez v1, :cond_7

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, -0x1

    .line 22
    sparse-switch v1, :sswitch_data_0

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :sswitch_0
    const-string v1, "0000-00-00"

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v2, 0x5

    .line 36
    goto :goto_0

    .line 37
    :sswitch_1
    const-string v1, "0000\u5e7400\u670800\u65e5"

    .line 38
    .line 39
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/4 v2, 0x4

    .line 47
    goto :goto_0

    .line 48
    :sswitch_2
    const-string v1, "null"

    .line 49
    .line 50
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_3

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    const/4 v2, 0x3

    .line 58
    goto :goto_0

    .line 59
    :sswitch_3
    const-string v1, ""

    .line 60
    .line 61
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_4

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_4
    const/4 v2, 0x2

    .line 69
    goto :goto_0

    .line 70
    :sswitch_4
    const-string v1, "00000000"

    .line 71
    .line 72
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_5

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_5
    const/4 v2, 0x1

    .line 80
    goto :goto_0

    .line 81
    :sswitch_5
    const-string v1, "0000-0-00"

    .line 82
    .line 83
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_6

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_6
    move v2, v3

    .line 91
    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 92
    .line 93
    .line 94
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 95
    .line 96
    invoke-direct {v0, p0, p0, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 97
    .line 98
    .line 99
    throw v0

    .line 100
    :pswitch_0
    return-object v0

    .line 101
    :cond_7
    return-object v1

    .line 102
    nop

    .line 103
    :sswitch_data_0
    .sparse-switch
        -0x794e6996 -> :sswitch_5
        -0x45f8e800 -> :sswitch_4
        0x0 -> :sswitch_3
        0x33c587 -> :sswitch_2
        0x52cad51 -> :sswitch_1
        0x4f8288e0 -> :sswitch_0
    .end sparse-switch

    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static parseLocalDate([BII)Ljava/time/LocalDate;
    .locals 5

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    add-int v1, p1, p2

    .line 103
    array-length v2, p0

    const/4 v3, 0x0

    const-string v4, "illegal input "

    if-gt v1, v2, :cond_2

    packed-switch p2, :pswitch_data_0

    const/4 v1, 0x4

    if-ne p2, v1, :cond_1

    .line 104
    aget-byte v1, p0, p1

    const/16 v2, 0x6e

    if-ne v1, v2, :cond_1

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    const/16 v2, 0x75

    if-ne v1, v2, :cond_1

    add-int/lit8 v1, p1, 0x2

    aget-byte v1, p0, v1

    const/16 v2, 0x6c

    if-ne v1, v2, :cond_1

    add-int/lit8 v1, p1, 0x3

    aget-byte v1, p0, v1

    if-ne v1, v2, :cond_1

    return-object v0

    .line 105
    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p0, p1, p2}, Ljava/lang/String;-><init>([BII)V

    .line 106
    new-instance p0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, v0, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw p0

    .line 107
    :pswitch_0
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate11([BI)Ljava/time/LocalDate;

    move-result-object p0

    return-object p0

    .line 108
    :pswitch_1
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate10([BI)Ljava/time/LocalDate;

    move-result-object p0

    return-object p0

    .line 109
    :pswitch_2
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate9([BI)Ljava/time/LocalDate;

    move-result-object p0

    return-object p0

    .line 110
    :pswitch_3
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate8([BI)Ljava/time/LocalDate;

    move-result-object p0

    return-object p0

    .line 111
    :cond_2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p0, p1, p2}, Ljava/lang/String;-><init>([BII)V

    .line 112
    new-instance p0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, v0, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw p0

    :cond_3
    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static parseLocalDate([CII)Ljava/time/LocalDate;
    .locals 5

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    add-int v1, p1, p2

    .line 113
    array-length v2, p0

    const/4 v3, 0x0

    const-string v4, "illegal input "

    if-gt v1, v2, :cond_2

    packed-switch p2, :pswitch_data_0

    const/4 v1, 0x4

    if-ne p2, v1, :cond_1

    .line 114
    aget-char v1, p0, p1

    const/16 v2, 0x6e

    if-ne v1, v2, :cond_1

    add-int/lit8 v1, p1, 0x1

    aget-char v1, p0, v1

    const/16 v2, 0x75

    if-ne v1, v2, :cond_1

    add-int/lit8 v1, p1, 0x2

    aget-char v1, p0, v1

    const/16 v2, 0x6c

    if-ne v1, v2, :cond_1

    add-int/lit8 v1, p1, 0x3

    aget-char v1, p0, v1

    if-ne v1, v2, :cond_1

    return-object v0

    .line 115
    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p0, p1, p2}, Ljava/lang/String;-><init>([CII)V

    .line 116
    new-instance p0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, v0, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw p0

    .line 117
    :pswitch_0
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate11([CI)Ljava/time/LocalDate;

    move-result-object p0

    return-object p0

    .line 118
    :pswitch_1
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate10([CI)Ljava/time/LocalDate;

    move-result-object p0

    return-object p0

    .line 119
    :pswitch_2
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate9([CI)Ljava/time/LocalDate;

    move-result-object p0

    return-object p0

    .line 120
    :pswitch_3
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate8([CI)Ljava/time/LocalDate;

    move-result-object p0

    return-object p0

    .line 121
    :cond_2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p0, p1, p2}, Ljava/lang/String;-><init>([CII)V

    .line 122
    new-instance p0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, v0, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw p0

    :cond_3
    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static parseLocalDate10([BI)Ljava/time/LocalDate;
    .locals 14

    add-int/lit8 v0, p1, 0xa

    .line 284
    array-length v1, p0

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    return-object v2

    .line 285
    :cond_0
    aget-byte v0, p0, p1

    int-to-char v0, v0

    add-int/lit8 v1, p1, 0x1

    .line 286
    aget-byte v1, p0, v1

    int-to-char v1, v1

    add-int/lit8 v3, p1, 0x2

    .line 287
    aget-byte v3, p0, v3

    int-to-char v3, v3

    add-int/lit8 v4, p1, 0x3

    .line 288
    aget-byte v4, p0, v4

    int-to-char v4, v4

    add-int/lit8 v5, p1, 0x4

    .line 289
    aget-byte v5, p0, v5

    int-to-char v5, v5

    add-int/lit8 v6, p1, 0x5

    .line 290
    aget-byte v6, p0, v6

    int-to-char v6, v6

    add-int/lit8 v7, p1, 0x6

    .line 291
    aget-byte v7, p0, v7

    int-to-char v7, v7

    add-int/lit8 v8, p1, 0x7

    .line 292
    aget-byte v8, p0, v8

    int-to-char v8, v8

    add-int/lit8 v9, p1, 0x8

    .line 293
    aget-byte v9, p0, v9

    int-to-char v9, v9

    add-int/lit8 p1, p1, 0x9

    .line 294
    aget-byte p0, p0, p1

    int-to-char p0, p0

    const/16 p1, 0x2d

    const/16 v10, 0x30

    const/16 v11, 0xa

    if-ne v5, p1, :cond_1

    if-ne v8, p1, :cond_1

    goto :goto_0

    :cond_1
    const/16 v12, 0x2f

    if-ne v5, v12, :cond_2

    if-ne v8, v12, :cond_2

    :goto_0
    move v8, v1

    move v5, v4

    move v1, v6

    move p1, v7

    move v4, v9

    goto :goto_3

    :cond_2
    const/16 v13, 0x2e

    if-ne v3, v13, :cond_3

    if-ne v6, v13, :cond_3

    goto :goto_1

    :cond_3
    if-ne v3, p1, :cond_4

    if-ne v6, p1, :cond_4

    :goto_1
    move p1, v5

    move v3, v9

    move v5, p0

    move p0, v1

    move v1, v4

    move v4, v0

    :goto_2
    move v0, v7

    goto :goto_3

    :cond_4
    if-ne v3, v12, :cond_5

    if-ne v6, v12, :cond_5

    move p1, v5

    move v5, p0

    move p0, p1

    move p1, v1

    move v3, v9

    move v1, v0

    goto :goto_2

    :cond_5
    const/16 p1, 0x20

    if-ne v1, p1, :cond_7

    if-ne v6, p1, :cond_7

    .line 295
    invoke-static {v3, v4, v5}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result p1

    if-lez p1, :cond_7

    .line 296
    div-int/lit8 v1, p1, 0xa

    add-int/2addr v1, v10

    int-to-char v1, v1

    .line 297
    rem-int/2addr p1, v11

    add-int/2addr p1, v10

    int-to-char p1, p1

    move v5, p0

    move p0, v0

    move v0, v7

    move v3, v9

    move v4, v10

    :goto_3
    if-lt v0, v10, :cond_7

    const/16 v6, 0x39

    if-gt v0, v6, :cond_7

    if-lt v8, v10, :cond_7

    if-gt v8, v6, :cond_7

    if-lt v3, v10, :cond_7

    if-gt v3, v6, :cond_7

    if-lt v5, v10, :cond_7

    if-gt v5, v6, :cond_7

    sub-int/2addr v0, v10

    mul-int/lit16 v0, v0, 0x3e8

    const/16 v7, 0x64

    .line 298
    invoke-static {v8, v10, v7, v0}, Lp/a;->z(IIII)I

    move-result v0

    invoke-static {v3, v10, v11, v0}, Lp/a;->z(IIII)I

    move-result v0

    sub-int/2addr v5, v10

    add-int/2addr v5, v0

    if-lt v1, v10, :cond_7

    if-gt v1, v6, :cond_7

    if-lt p1, v10, :cond_7

    if-gt p1, v6, :cond_7

    sub-int/2addr v1, v10

    mul-int/2addr v1, v11

    sub-int/2addr p1, v10

    add-int/2addr p1, v1

    if-lt v4, v10, :cond_7

    if-gt v4, v6, :cond_7

    if-lt p0, v10, :cond_7

    if-gt p0, v6, :cond_7

    sub-int/2addr v4, v10

    mul-int/2addr v4, v11

    sub-int/2addr p0, v10

    add-int/2addr p0, v4

    if-nez v5, :cond_6

    if-nez p1, :cond_6

    if-nez p0, :cond_6

    return-object v2

    .line 299
    :cond_6
    invoke-static {v5, p1, p0}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    move-result-object p0

    return-object p0

    :cond_7
    return-object v2
.end method

.method public static parseLocalDate10([CI)Ljava/time/LocalDate;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    add-int/lit8 v1, p1, 0xa

    .line 4
    .line 5
    array-length v2, v0

    .line 6
    const/4 v3, 0x0

    .line 7
    if-le v1, v2, :cond_0

    .line 8
    .line 9
    return-object v3

    .line 10
    :cond_0
    aget-char v1, v0, p1

    .line 11
    .line 12
    add-int/lit8 v2, p1, 0x1

    .line 13
    .line 14
    aget-char v2, v0, v2

    .line 15
    .line 16
    add-int/lit8 v4, p1, 0x2

    .line 17
    .line 18
    aget-char v4, v0, v4

    .line 19
    .line 20
    add-int/lit8 v5, p1, 0x3

    .line 21
    .line 22
    aget-char v5, v0, v5

    .line 23
    .line 24
    add-int/lit8 v6, p1, 0x4

    .line 25
    .line 26
    aget-char v6, v0, v6

    .line 27
    .line 28
    add-int/lit8 v7, p1, 0x5

    .line 29
    .line 30
    aget-char v7, v0, v7

    .line 31
    .line 32
    add-int/lit8 v8, p1, 0x6

    .line 33
    .line 34
    aget-char v8, v0, v8

    .line 35
    .line 36
    add-int/lit8 v9, p1, 0x7

    .line 37
    .line 38
    aget-char v9, v0, v9

    .line 39
    .line 40
    add-int/lit8 v10, p1, 0x8

    .line 41
    .line 42
    aget-char v10, v0, v10

    .line 43
    .line 44
    add-int/lit8 v11, p1, 0x9

    .line 45
    .line 46
    aget-char v0, v0, v11

    .line 47
    .line 48
    const/16 v11, 0x2d

    .line 49
    .line 50
    if-ne v6, v11, :cond_1

    .line 51
    .line 52
    if-ne v9, v11, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    const/16 v14, 0x2f

    .line 56
    .line 57
    if-ne v6, v14, :cond_2

    .line 58
    .line 59
    if-ne v9, v14, :cond_2

    .line 60
    .line 61
    :goto_0
    move-object/from16 v16, v3

    .line 62
    .line 63
    move v9, v10

    .line 64
    const/16 p0, 0xa

    .line 65
    .line 66
    move v10, v0

    .line 67
    :goto_1
    const/16 v0, 0x30

    .line 68
    .line 69
    goto/16 :goto_5

    .line 70
    .line 71
    :cond_2
    const/16 v15, 0x2e

    .line 72
    .line 73
    if-ne v4, v15, :cond_3

    .line 74
    .line 75
    if-ne v7, v15, :cond_3

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    if-ne v4, v11, :cond_4

    .line 79
    .line 80
    if-ne v7, v11, :cond_4

    .line 81
    .line 82
    :goto_2
    move-object/from16 v16, v3

    .line 83
    .line 84
    move v7, v5

    .line 85
    move v4, v10

    .line 86
    const/16 p0, 0xa

    .line 87
    .line 88
    move v5, v0

    .line 89
    move v10, v2

    .line 90
    move v2, v9

    .line 91
    const/16 v0, 0x30

    .line 92
    .line 93
    move v9, v1

    .line 94
    move v1, v8

    .line 95
    move v8, v6

    .line 96
    goto/16 :goto_5

    .line 97
    .line 98
    :cond_4
    if-ne v4, v14, :cond_5

    .line 99
    .line 100
    if-ne v7, v14, :cond_5

    .line 101
    .line 102
    move v7, v1

    .line 103
    move-object/from16 v16, v3

    .line 104
    .line 105
    move v1, v8

    .line 106
    move v4, v10

    .line 107
    const/16 p0, 0xa

    .line 108
    .line 109
    move v8, v2

    .line 110
    move v10, v6

    .line 111
    move v2, v9

    .line 112
    move v9, v5

    .line 113
    move v5, v0

    .line 114
    goto :goto_1

    .line 115
    :cond_5
    const/16 v11, 0x65e5

    .line 116
    .line 117
    const/16 v14, 0x6708

    .line 118
    .line 119
    const/16 v15, 0x5e74

    .line 120
    .line 121
    if-ne v6, v15, :cond_6

    .line 122
    .line 123
    if-ne v8, v14, :cond_6

    .line 124
    .line 125
    if-ne v0, v11, :cond_6

    .line 126
    .line 127
    move-object/from16 v16, v3

    .line 128
    .line 129
    move v8, v7

    .line 130
    const/16 p0, 0xa

    .line 131
    .line 132
    const/16 v0, 0x30

    .line 133
    .line 134
    const/16 v7, 0x30

    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_6
    move-object/from16 v16, v3

    .line 138
    .line 139
    const v3, 0xc77c

    .line 140
    .line 141
    .line 142
    const/16 p0, 0xa

    .line 143
    .line 144
    const v13, 0xc6d4

    .line 145
    .line 146
    .line 147
    const/16 p1, 0x30

    .line 148
    .line 149
    const v12, 0xb144

    .line 150
    .line 151
    .line 152
    if-ne v6, v12, :cond_7

    .line 153
    .line 154
    if-ne v8, v13, :cond_7

    .line 155
    .line 156
    if-ne v0, v3, :cond_7

    .line 157
    .line 158
    move/from16 v0, p1

    .line 159
    .line 160
    move v8, v7

    .line 161
    move v7, v0

    .line 162
    goto :goto_5

    .line 163
    :cond_7
    if-ne v6, v15, :cond_8

    .line 164
    .line 165
    if-ne v9, v14, :cond_8

    .line 166
    .line 167
    if-ne v0, v11, :cond_8

    .line 168
    .line 169
    :goto_3
    move/from16 v0, p1

    .line 170
    .line 171
    :goto_4
    move v9, v0

    .line 172
    goto :goto_5

    .line 173
    :cond_8
    if-ne v6, v12, :cond_9

    .line 174
    .line 175
    if-ne v9, v13, :cond_9

    .line 176
    .line 177
    if-ne v0, v3, :cond_9

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_9
    const/16 v3, 0x20

    .line 181
    .line 182
    if-ne v2, v3, :cond_b

    .line 183
    .line 184
    if-ne v7, v3, :cond_b

    .line 185
    .line 186
    invoke-static {v4, v5, v6}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    if-lez v2, :cond_b

    .line 191
    .line 192
    div-int/lit8 v3, v2, 0xa

    .line 193
    .line 194
    add-int/lit8 v3, v3, 0x30

    .line 195
    .line 196
    int-to-char v3, v3

    .line 197
    rem-int/lit8 v2, v2, 0xa

    .line 198
    .line 199
    add-int/lit8 v2, v2, 0x30

    .line 200
    .line 201
    int-to-char v2, v2

    .line 202
    move v5, v0

    .line 203
    move v7, v3

    .line 204
    move v4, v10

    .line 205
    move/from16 v0, p1

    .line 206
    .line 207
    move v10, v1

    .line 208
    move v1, v8

    .line 209
    move v8, v2

    .line 210
    move v2, v9

    .line 211
    goto :goto_4

    .line 212
    :goto_5
    if-lt v1, v0, :cond_b

    .line 213
    .line 214
    const/16 v3, 0x39

    .line 215
    .line 216
    if-gt v1, v3, :cond_b

    .line 217
    .line 218
    if-lt v2, v0, :cond_b

    .line 219
    .line 220
    if-gt v2, v3, :cond_b

    .line 221
    .line 222
    if-lt v4, v0, :cond_b

    .line 223
    .line 224
    if-gt v4, v3, :cond_b

    .line 225
    .line 226
    if-lt v5, v0, :cond_b

    .line 227
    .line 228
    if-gt v5, v3, :cond_b

    .line 229
    .line 230
    sub-int/2addr v1, v0

    .line 231
    mul-int/lit16 v1, v1, 0x3e8

    .line 232
    .line 233
    const/16 v6, 0x64

    .line 234
    .line 235
    invoke-static {v2, v0, v6, v1}, Lp/a;->z(IIII)I

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    move/from16 v2, p0

    .line 240
    .line 241
    invoke-static {v4, v0, v2, v1}, Lp/a;->z(IIII)I

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    sub-int/2addr v5, v0

    .line 246
    add-int/2addr v5, v1

    .line 247
    if-lt v7, v0, :cond_b

    .line 248
    .line 249
    if-gt v7, v3, :cond_b

    .line 250
    .line 251
    if-lt v8, v0, :cond_b

    .line 252
    .line 253
    if-gt v8, v3, :cond_b

    .line 254
    .line 255
    sub-int/2addr v7, v0

    .line 256
    mul-int/2addr v7, v2

    .line 257
    sub-int/2addr v8, v0

    .line 258
    add-int/2addr v8, v7

    .line 259
    if-lt v9, v0, :cond_b

    .line 260
    .line 261
    if-gt v9, v3, :cond_b

    .line 262
    .line 263
    if-lt v10, v0, :cond_b

    .line 264
    .line 265
    if-gt v10, v3, :cond_b

    .line 266
    .line 267
    sub-int/2addr v9, v0

    .line 268
    mul-int/2addr v9, v2

    .line 269
    sub-int/2addr v10, v0

    .line 270
    add-int/2addr v10, v9

    .line 271
    if-nez v5, :cond_a

    .line 272
    .line 273
    if-nez v8, :cond_a

    .line 274
    .line 275
    if-nez v10, :cond_a

    .line 276
    .line 277
    return-object v16

    .line 278
    :cond_a
    invoke-static {v5, v8, v10}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    return-object v0

    .line 283
    :cond_b
    return-object v16
.end method

.method public static parseLocalDate11([BI)Ljava/time/LocalDate;
    .locals 13

    add-int/lit8 v0, p1, 0xb

    .line 188
    array-length v1, p0

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    return-object v2

    .line 189
    :cond_0
    aget-byte v0, p0, p1

    int-to-char v0, v0

    add-int/lit8 v1, p1, 0x1

    .line 190
    aget-byte v1, p0, v1

    int-to-char v1, v1

    add-int/lit8 v3, p1, 0x2

    .line 191
    aget-byte v3, p0, v3

    int-to-char v3, v3

    add-int/lit8 v4, p1, 0x3

    .line 192
    aget-byte v4, p0, v4

    int-to-char v4, v4

    add-int/lit8 v5, p1, 0x4

    .line 193
    aget-byte v5, p0, v5

    int-to-char v5, v5

    add-int/lit8 v6, p1, 0x5

    .line 194
    aget-byte v6, p0, v6

    int-to-char v6, v6

    add-int/lit8 v7, p1, 0x6

    .line 195
    aget-byte v7, p0, v7

    int-to-char v7, v7

    add-int/lit8 v8, p1, 0x7

    .line 196
    aget-byte v8, p0, v8

    int-to-char v8, v8

    add-int/lit8 v9, p1, 0x8

    .line 197
    aget-byte v9, p0, v9

    int-to-char v9, v9

    add-int/lit8 v10, p1, 0x9

    .line 198
    aget-byte v10, p0, v10

    int-to-char v10, v10

    const/16 v11, 0xa

    add-int/2addr p1, v11

    .line 199
    aget-byte p0, p0, p1

    int-to-char p0, p0

    const/16 p1, 0x2d

    const/16 v12, 0x30

    if-ne v5, p1, :cond_1

    if-ne v8, p1, :cond_1

    const/16 p1, 0x5a

    if-ne p0, p1, :cond_1

    goto :goto_0

    :cond_1
    const/16 p1, 0x20

    if-ne v3, p1, :cond_3

    if-ne v7, p1, :cond_3

    .line 200
    invoke-static {v4, v5, v6}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result p1

    if-lez p1, :cond_3

    .line 201
    div-int/lit8 v3, p1, 0xa

    add-int/2addr v3, v12

    int-to-char v6, v3

    .line 202
    rem-int/2addr p1, v11

    add-int/2addr p1, v12

    int-to-char v7, p1

    move v4, p0

    move v3, v10

    move v10, v1

    move v1, v9

    move v9, v0

    move v0, v8

    :goto_0
    if-lt v0, v12, :cond_3

    const/16 p0, 0x39

    if-gt v0, p0, :cond_3

    if-lt v1, v12, :cond_3

    if-gt v1, p0, :cond_3

    if-lt v3, v12, :cond_3

    if-gt v3, p0, :cond_3

    if-lt v4, v12, :cond_3

    if-gt v4, p0, :cond_3

    sub-int/2addr v0, v12

    mul-int/lit16 v0, v0, 0x3e8

    const/16 p1, 0x64

    .line 203
    invoke-static {v1, v12, p1, v0}, Lp/a;->z(IIII)I

    move-result p1

    invoke-static {v3, v12, v11, p1}, Lp/a;->z(IIII)I

    move-result p1

    sub-int/2addr v4, v12

    add-int/2addr v4, p1

    if-lt v6, v12, :cond_3

    if-gt v6, p0, :cond_3

    if-lt v7, v12, :cond_3

    if-gt v7, p0, :cond_3

    sub-int/2addr v6, v12

    mul-int/2addr v6, v11

    sub-int/2addr v7, v12

    add-int/2addr v7, v6

    if-lt v9, v12, :cond_3

    if-gt v9, p0, :cond_3

    if-lt v10, v12, :cond_3

    if-gt v10, p0, :cond_3

    sub-int/2addr v9, v12

    mul-int/2addr v9, v11

    sub-int/2addr v10, v12

    add-int/2addr v10, v9

    if-nez v4, :cond_2

    if-nez v7, :cond_2

    if-nez v10, :cond_2

    return-object v2

    .line 204
    :cond_2
    invoke-static {v4, v7, v10}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    move-result-object p0

    return-object p0

    :cond_3
    return-object v2
.end method

.method public static parseLocalDate11([CI)Ljava/time/LocalDate;
    .locals 13

    .line 1
    add-int/lit8 v0, p1, 0xb

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-le v0, v1, :cond_0

    .line 6
    .line 7
    return-object v2

    .line 8
    :cond_0
    aget-char v0, p0, p1

    .line 9
    .line 10
    add-int/lit8 v1, p1, 0x1

    .line 11
    .line 12
    aget-char v1, p0, v1

    .line 13
    .line 14
    add-int/lit8 v3, p1, 0x2

    .line 15
    .line 16
    aget-char v3, p0, v3

    .line 17
    .line 18
    add-int/lit8 v4, p1, 0x3

    .line 19
    .line 20
    aget-char v4, p0, v4

    .line 21
    .line 22
    add-int/lit8 v5, p1, 0x4

    .line 23
    .line 24
    aget-char v5, p0, v5

    .line 25
    .line 26
    add-int/lit8 v6, p1, 0x5

    .line 27
    .line 28
    aget-char v6, p0, v6

    .line 29
    .line 30
    add-int/lit8 v7, p1, 0x6

    .line 31
    .line 32
    aget-char v7, p0, v7

    .line 33
    .line 34
    add-int/lit8 v8, p1, 0x7

    .line 35
    .line 36
    aget-char v8, p0, v8

    .line 37
    .line 38
    add-int/lit8 v9, p1, 0x8

    .line 39
    .line 40
    aget-char v9, p0, v9

    .line 41
    .line 42
    add-int/lit8 v10, p1, 0x9

    .line 43
    .line 44
    aget-char v10, p0, v10

    .line 45
    .line 46
    const/16 v11, 0xa

    .line 47
    .line 48
    add-int/2addr p1, v11

    .line 49
    aget-char p0, p0, p1

    .line 50
    .line 51
    const/16 p1, 0x5e74

    .line 52
    .line 53
    const/16 v12, 0x30

    .line 54
    .line 55
    if-ne v5, p1, :cond_1

    .line 56
    .line 57
    const/16 p1, 0x6708

    .line 58
    .line 59
    if-ne v8, p1, :cond_1

    .line 60
    .line 61
    const/16 p1, 0x65e5

    .line 62
    .line 63
    if-ne p0, p1, :cond_1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    const/16 p1, 0x2d

    .line 67
    .line 68
    if-ne v5, p1, :cond_2

    .line 69
    .line 70
    if-ne v8, p1, :cond_2

    .line 71
    .line 72
    const/16 p1, 0x5a

    .line 73
    .line 74
    if-ne p0, p1, :cond_2

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    const p1, 0xb144

    .line 78
    .line 79
    .line 80
    if-ne v5, p1, :cond_3

    .line 81
    .line 82
    const p1, 0xc6d4

    .line 83
    .line 84
    .line 85
    if-ne v8, p1, :cond_3

    .line 86
    .line 87
    const p1, 0xc77c

    .line 88
    .line 89
    .line 90
    if-ne p0, p1, :cond_3

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    const/16 p1, 0x20

    .line 94
    .line 95
    if-ne v3, p1, :cond_5

    .line 96
    .line 97
    if-ne v7, p1, :cond_5

    .line 98
    .line 99
    invoke-static {v4, v5, v6}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-lez p1, :cond_5

    .line 104
    .line 105
    div-int/lit8 v3, p1, 0xa

    .line 106
    .line 107
    add-int/2addr v3, v12

    .line 108
    int-to-char v6, v3

    .line 109
    rem-int/2addr p1, v11

    .line 110
    add-int/2addr p1, v12

    .line 111
    int-to-char v7, p1

    .line 112
    move v4, p0

    .line 113
    move v3, v10

    .line 114
    move v10, v1

    .line 115
    move v1, v9

    .line 116
    move v9, v0

    .line 117
    move v0, v8

    .line 118
    :goto_0
    if-lt v0, v12, :cond_5

    .line 119
    .line 120
    const/16 p0, 0x39

    .line 121
    .line 122
    if-gt v0, p0, :cond_5

    .line 123
    .line 124
    if-lt v1, v12, :cond_5

    .line 125
    .line 126
    if-gt v1, p0, :cond_5

    .line 127
    .line 128
    if-lt v3, v12, :cond_5

    .line 129
    .line 130
    if-gt v3, p0, :cond_5

    .line 131
    .line 132
    if-lt v4, v12, :cond_5

    .line 133
    .line 134
    if-gt v4, p0, :cond_5

    .line 135
    .line 136
    sub-int/2addr v0, v12

    .line 137
    mul-int/lit16 v0, v0, 0x3e8

    .line 138
    .line 139
    const/16 p1, 0x64

    .line 140
    .line 141
    invoke-static {v1, v12, p1, v0}, Lp/a;->z(IIII)I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    invoke-static {v3, v12, v11, p1}, Lp/a;->z(IIII)I

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    sub-int/2addr v4, v12

    .line 150
    add-int/2addr v4, p1

    .line 151
    if-lt v6, v12, :cond_5

    .line 152
    .line 153
    if-gt v6, p0, :cond_5

    .line 154
    .line 155
    if-lt v7, v12, :cond_5

    .line 156
    .line 157
    if-gt v7, p0, :cond_5

    .line 158
    .line 159
    sub-int/2addr v6, v12

    .line 160
    mul-int/2addr v6, v11

    .line 161
    sub-int/2addr v7, v12

    .line 162
    add-int/2addr v7, v6

    .line 163
    if-lt v9, v12, :cond_5

    .line 164
    .line 165
    if-gt v9, p0, :cond_5

    .line 166
    .line 167
    if-lt v10, v12, :cond_5

    .line 168
    .line 169
    if-gt v10, p0, :cond_5

    .line 170
    .line 171
    sub-int/2addr v9, v12

    .line 172
    mul-int/2addr v9, v11

    .line 173
    sub-int/2addr v10, v12

    .line 174
    add-int/2addr v10, v9

    .line 175
    if-nez v4, :cond_4

    .line 176
    .line 177
    if-nez v7, :cond_4

    .line 178
    .line 179
    if-nez v10, :cond_4

    .line 180
    .line 181
    return-object v2

    .line 182
    :cond_4
    invoke-static {v4, v7, v10}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    return-object p0

    .line 187
    :cond_5
    return-object v2
.end method

.method public static parseLocalDate8([BI)Ljava/time/LocalDate;
    .locals 11

    .line 1
    add-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-le v0, v1, :cond_0

    .line 6
    .line 7
    return-object v2

    .line 8
    :cond_0
    aget-byte v0, p0, p1

    .line 9
    .line 10
    int-to-char v0, v0

    .line 11
    add-int/lit8 v1, p1, 0x1

    .line 12
    .line 13
    aget-byte v1, p0, v1

    .line 14
    .line 15
    int-to-char v1, v1

    .line 16
    add-int/lit8 v3, p1, 0x2

    .line 17
    .line 18
    aget-byte v3, p0, v3

    .line 19
    .line 20
    int-to-char v3, v3

    .line 21
    add-int/lit8 v4, p1, 0x3

    .line 22
    .line 23
    aget-byte v4, p0, v4

    .line 24
    .line 25
    int-to-char v4, v4

    .line 26
    add-int/lit8 v5, p1, 0x4

    .line 27
    .line 28
    aget-byte v5, p0, v5

    .line 29
    .line 30
    int-to-char v5, v5

    .line 31
    add-int/lit8 v6, p1, 0x5

    .line 32
    .line 33
    aget-byte v6, p0, v6

    .line 34
    .line 35
    int-to-char v6, v6

    .line 36
    add-int/lit8 v7, p1, 0x6

    .line 37
    .line 38
    aget-byte v7, p0, v7

    .line 39
    .line 40
    int-to-char v7, v7

    .line 41
    add-int/lit8 p1, p1, 0x7

    .line 42
    .line 43
    aget-byte p0, p0, p1

    .line 44
    .line 45
    int-to-char p0, p0

    .line 46
    const/16 p1, 0x2d

    .line 47
    .line 48
    const/16 v8, 0xa

    .line 49
    .line 50
    const/16 v9, 0x30

    .line 51
    .line 52
    if-ne v5, p1, :cond_1

    .line 53
    .line 54
    if-ne v7, p1, :cond_1

    .line 55
    .line 56
    move v5, v9

    .line 57
    move v7, v5

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    const/16 v10, 0x2f

    .line 60
    .line 61
    if-ne v1, v10, :cond_2

    .line 62
    .line 63
    if-ne v4, v10, :cond_2

    .line 64
    .line 65
    move v4, p0

    .line 66
    move p0, v3

    .line 67
    move v1, v6

    .line 68
    move v3, v7

    .line 69
    move v7, v9

    .line 70
    move v6, v0

    .line 71
    move v0, v5

    .line 72
    move v5, v7

    .line 73
    goto :goto_0

    .line 74
    :cond_2
    if-ne v1, p1, :cond_4

    .line 75
    .line 76
    if-ne v6, p1, :cond_4

    .line 77
    .line 78
    invoke-static {v3, v4, v5}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-lez p1, :cond_3

    .line 83
    .line 84
    div-int/lit8 v1, p1, 0xa

    .line 85
    .line 86
    add-int/2addr v1, v9

    .line 87
    int-to-char v5, v1

    .line 88
    rem-int/2addr p1, v8

    .line 89
    add-int/2addr p1, v9

    .line 90
    int-to-char p1, p1

    .line 91
    const/16 v1, 0x32

    .line 92
    .line 93
    move v4, p0

    .line 94
    move v6, p1

    .line 95
    move p0, v0

    .line 96
    move v0, v1

    .line 97
    move v3, v7

    .line 98
    move v1, v9

    .line 99
    move v7, v1

    .line 100
    goto :goto_0

    .line 101
    :cond_3
    return-object v2

    .line 102
    :cond_4
    :goto_0
    if-lt v0, v9, :cond_6

    .line 103
    .line 104
    const/16 p1, 0x39

    .line 105
    .line 106
    if-gt v0, p1, :cond_6

    .line 107
    .line 108
    if-lt v1, v9, :cond_6

    .line 109
    .line 110
    if-gt v1, p1, :cond_6

    .line 111
    .line 112
    if-lt v3, v9, :cond_6

    .line 113
    .line 114
    if-gt v3, p1, :cond_6

    .line 115
    .line 116
    if-lt v4, v9, :cond_6

    .line 117
    .line 118
    if-gt v4, p1, :cond_6

    .line 119
    .line 120
    sub-int/2addr v0, v9

    .line 121
    mul-int/lit16 v0, v0, 0x3e8

    .line 122
    .line 123
    const/16 v10, 0x64

    .line 124
    .line 125
    invoke-static {v1, v9, v10, v0}, Lp/a;->z(IIII)I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    invoke-static {v3, v9, v8, v0}, Lp/a;->z(IIII)I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    sub-int/2addr v4, v9

    .line 134
    add-int/2addr v4, v0

    .line 135
    if-lt v5, v9, :cond_6

    .line 136
    .line 137
    if-gt v5, p1, :cond_6

    .line 138
    .line 139
    if-lt v6, v9, :cond_6

    .line 140
    .line 141
    if-gt v6, p1, :cond_6

    .line 142
    .line 143
    sub-int/2addr v5, v9

    .line 144
    mul-int/2addr v5, v8

    .line 145
    sub-int/2addr v6, v9

    .line 146
    add-int/2addr v6, v5

    .line 147
    if-lt v7, v9, :cond_6

    .line 148
    .line 149
    if-gt v7, p1, :cond_6

    .line 150
    .line 151
    if-lt p0, v9, :cond_6

    .line 152
    .line 153
    if-gt p0, p1, :cond_6

    .line 154
    .line 155
    sub-int/2addr v7, v9

    .line 156
    mul-int/2addr v7, v8

    .line 157
    sub-int/2addr p0, v9

    .line 158
    add-int/2addr p0, v7

    .line 159
    if-nez v4, :cond_5

    .line 160
    .line 161
    if-nez v6, :cond_5

    .line 162
    .line 163
    if-nez p0, :cond_5

    .line 164
    .line 165
    return-object v2

    .line 166
    :cond_5
    invoke-static {v4, v6, p0}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    return-object p0

    .line 171
    :cond_6
    return-object v2
.end method

.method public static parseLocalDate8([CI)Ljava/time/LocalDate;
    .locals 11

    add-int/lit8 v0, p1, 0x8

    .line 172
    array-length v1, p0

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    return-object v2

    .line 173
    :cond_0
    aget-char v0, p0, p1

    add-int/lit8 v1, p1, 0x1

    .line 174
    aget-char v1, p0, v1

    add-int/lit8 v3, p1, 0x2

    .line 175
    aget-char v3, p0, v3

    add-int/lit8 v4, p1, 0x3

    .line 176
    aget-char v4, p0, v4

    add-int/lit8 v5, p1, 0x4

    .line 177
    aget-char v5, p0, v5

    add-int/lit8 v6, p1, 0x5

    .line 178
    aget-char v6, p0, v6

    add-int/lit8 v7, p1, 0x6

    .line 179
    aget-char v7, p0, v7

    add-int/lit8 p1, p1, 0x7

    .line 180
    aget-char p0, p0, p1

    const/16 p1, 0x2d

    const/16 v8, 0xa

    const/16 v9, 0x30

    if-ne v5, p1, :cond_1

    if-ne v7, p1, :cond_1

    move v5, v9

    move v7, v5

    goto :goto_0

    :cond_1
    const/16 v10, 0x2f

    if-ne v1, v10, :cond_2

    if-ne v4, v10, :cond_2

    move v4, p0

    move p0, v3

    move v1, v6

    move v3, v7

    move v7, v9

    move v6, v0

    move v0, v5

    move v5, v7

    goto :goto_0

    :cond_2
    if-ne v1, p1, :cond_4

    if-ne v6, p1, :cond_4

    .line 181
    invoke-static {v3, v4, v5}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result p1

    if-lez p1, :cond_3

    .line 182
    div-int/lit8 v1, p1, 0xa

    add-int/2addr v1, v9

    int-to-char v5, v1

    .line 183
    rem-int/2addr p1, v8

    add-int/2addr p1, v9

    int-to-char p1, p1

    const/16 v1, 0x32

    move v4, p0

    move v6, p1

    move p0, v0

    move v0, v1

    move v3, v7

    move v1, v9

    move v7, v1

    goto :goto_0

    :cond_3
    return-object v2

    :cond_4
    :goto_0
    if-lt v0, v9, :cond_6

    const/16 p1, 0x39

    if-gt v0, p1, :cond_6

    if-lt v1, v9, :cond_6

    if-gt v1, p1, :cond_6

    if-lt v3, v9, :cond_6

    if-gt v3, p1, :cond_6

    if-lt v4, v9, :cond_6

    if-gt v4, p1, :cond_6

    sub-int/2addr v0, v9

    mul-int/lit16 v0, v0, 0x3e8

    const/16 v10, 0x64

    .line 184
    invoke-static {v1, v9, v10, v0}, Lp/a;->z(IIII)I

    move-result v0

    invoke-static {v3, v9, v8, v0}, Lp/a;->z(IIII)I

    move-result v0

    sub-int/2addr v4, v9

    add-int/2addr v4, v0

    if-lt v5, v9, :cond_6

    if-gt v5, p1, :cond_6

    if-lt v6, v9, :cond_6

    if-gt v6, p1, :cond_6

    sub-int/2addr v5, v9

    mul-int/2addr v5, v8

    sub-int/2addr v6, v9

    add-int/2addr v6, v5

    if-lt v7, v9, :cond_6

    if-gt v7, p1, :cond_6

    if-lt p0, v9, :cond_6

    if-gt p0, p1, :cond_6

    sub-int/2addr v7, v9

    mul-int/2addr v7, v8

    sub-int/2addr p0, v9

    add-int/2addr p0, v7

    if-nez v4, :cond_5

    if-nez v6, :cond_5

    if-nez p0, :cond_5

    return-object v2

    .line 185
    :cond_5
    invoke-static {v4, v6, p0}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    move-result-object p0

    return-object p0

    :cond_6
    return-object v2
.end method

.method public static parseLocalDate9([BI)Ljava/time/LocalDate;
    .locals 13

    add-int/lit8 v0, p1, 0x9

    .line 284
    array-length v1, p0

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    return-object v2

    .line 285
    :cond_0
    aget-byte v0, p0, p1

    int-to-char v0, v0

    add-int/lit8 v1, p1, 0x1

    .line 286
    aget-byte v1, p0, v1

    int-to-char v1, v1

    add-int/lit8 v3, p1, 0x2

    .line 287
    aget-byte v3, p0, v3

    int-to-char v3, v3

    add-int/lit8 v4, p1, 0x3

    .line 288
    aget-byte v4, p0, v4

    int-to-char v4, v4

    add-int/lit8 v5, p1, 0x4

    .line 289
    aget-byte v5, p0, v5

    int-to-char v5, v5

    add-int/lit8 v6, p1, 0x5

    .line 290
    aget-byte v6, p0, v6

    int-to-char v6, v6

    add-int/lit8 v7, p1, 0x6

    .line 291
    aget-byte v7, p0, v7

    int-to-char v7, v7

    add-int/lit8 v8, p1, 0x7

    .line 292
    aget-byte v8, p0, v8

    int-to-char v8, v8

    add-int/lit8 p1, p1, 0x8

    .line 293
    aget-byte p0, p0, p1

    int-to-char p0, p0

    const/16 p1, 0xa

    const/16 v9, 0x2d

    const/16 v10, 0x30

    if-ne v5, v9, :cond_1

    if-ne v8, v9, :cond_1

    :goto_0
    move v5, v3

    move v3, v6

    move v8, v10

    move v6, v4

    move v4, v7

    goto/16 :goto_6

    :cond_1
    if-ne v5, v9, :cond_2

    if-ne v7, v9, :cond_2

    :goto_1
    move v5, v6

    move v6, v4

    move v4, v5

    move v5, v3

    :goto_2
    move v3, v10

    goto/16 :goto_6

    :cond_2
    const/16 v11, 0x2f

    if-ne v5, v11, :cond_3

    if-ne v8, v11, :cond_3

    goto :goto_0

    :cond_3
    if-ne v5, v11, :cond_4

    if-ne v7, v11, :cond_4

    goto :goto_1

    :cond_4
    const/16 v12, 0x2e

    if-ne v1, v12, :cond_5

    if-ne v5, v12, :cond_5

    :goto_3
    move v1, v6

    move v6, p0

    move p0, v0

    move v0, v1

    move v1, v7

    move v5, v8

    move v8, v10

    goto/16 :goto_6

    :cond_5
    if-ne v3, v12, :cond_6

    if-ne v5, v12, :cond_6

    :goto_4
    move v5, v8

    move v3, v10

    move v8, v0

    move v0, v6

    move v6, p0

    move p0, v1

    :goto_5
    move v1, v7

    goto/16 :goto_6

    :cond_6
    if-ne v1, v9, :cond_7

    if-ne v5, v9, :cond_7

    goto :goto_3

    :cond_7
    if-ne v3, v9, :cond_8

    if-ne v5, v9, :cond_8

    goto :goto_4

    :cond_8
    if-ne v3, v9, :cond_a

    if-ne v7, v9, :cond_a

    .line 294
    invoke-static {v4, v5, v6}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v3

    if-lez v3, :cond_9

    .line 295
    div-int/lit8 v4, v3, 0xa

    add-int/2addr v4, v10

    int-to-char v4, v4

    .line 296
    rem-int/2addr v3, p1

    add-int/2addr v3, v10

    int-to-char v3, v3

    const/16 v5, 0x32

    move v6, v8

    move v8, v0

    move v0, v5

    move v5, v6

    move v6, v4

    move v4, v3

    move v3, v6

    move v6, p0

    move p0, v1

    move v1, v10

    goto :goto_6

    :cond_9
    return-object v2

    :cond_a
    if-ne v1, v11, :cond_b

    if-ne v5, v11, :cond_b

    move v1, v6

    move v6, p0

    move p0, v4

    move v4, v0

    move v0, v1

    move v1, v7

    move v5, v8

    move v8, v3

    goto :goto_2

    :cond_b
    if-ne v3, v11, :cond_d

    if-ne v5, v11, :cond_d

    move v3, v0

    move v0, v6

    move v5, v8

    move v8, v10

    move v6, p0

    move p0, v4

    move v4, v1

    goto :goto_5

    :goto_6
    if-lt v0, v10, :cond_d

    const/16 v7, 0x39

    if-gt v0, v7, :cond_d

    if-lt v1, v10, :cond_d

    if-gt v1, v7, :cond_d

    if-lt v5, v10, :cond_d

    if-gt v5, v7, :cond_d

    if-lt v6, v10, :cond_d

    if-gt v6, v7, :cond_d

    sub-int/2addr v0, v10

    mul-int/lit16 v0, v0, 0x3e8

    const/16 v9, 0x64

    .line 297
    invoke-static {v1, v10, v9, v0}, Lp/a;->z(IIII)I

    move-result v0

    invoke-static {v5, v10, p1, v0}, Lp/a;->z(IIII)I

    move-result v0

    sub-int/2addr v6, v10

    add-int/2addr v6, v0

    if-lt v3, v10, :cond_d

    if-gt v3, v7, :cond_d

    if-lt v4, v10, :cond_d

    if-gt v4, v7, :cond_d

    sub-int/2addr v3, v10

    mul-int/2addr v3, p1

    sub-int/2addr v4, v10

    add-int/2addr v4, v3

    if-lt v8, v10, :cond_d

    if-gt v8, v7, :cond_d

    if-lt p0, v10, :cond_d

    if-gt p0, v7, :cond_d

    sub-int/2addr v8, v10

    mul-int/2addr v8, p1

    sub-int/2addr p0, v10

    add-int/2addr p0, v8

    if-nez v6, :cond_c

    if-nez v4, :cond_c

    if-nez p0, :cond_c

    return-object v2

    .line 298
    :cond_c
    invoke-static {v6, v4, p0}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    move-result-object p0

    return-object p0

    :cond_d
    return-object v2
.end method

.method public static parseLocalDate9([CI)Ljava/time/LocalDate;
    .locals 13

    .line 1
    add-int/lit8 v0, p1, 0x9

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-le v0, v1, :cond_0

    .line 6
    .line 7
    return-object v2

    .line 8
    :cond_0
    aget-char v0, p0, p1

    .line 9
    .line 10
    add-int/lit8 v1, p1, 0x1

    .line 11
    .line 12
    aget-char v1, p0, v1

    .line 13
    .line 14
    add-int/lit8 v3, p1, 0x2

    .line 15
    .line 16
    aget-char v3, p0, v3

    .line 17
    .line 18
    add-int/lit8 v4, p1, 0x3

    .line 19
    .line 20
    aget-char v4, p0, v4

    .line 21
    .line 22
    add-int/lit8 v5, p1, 0x4

    .line 23
    .line 24
    aget-char v5, p0, v5

    .line 25
    .line 26
    add-int/lit8 v6, p1, 0x5

    .line 27
    .line 28
    aget-char v6, p0, v6

    .line 29
    .line 30
    add-int/lit8 v7, p1, 0x6

    .line 31
    .line 32
    aget-char v7, p0, v7

    .line 33
    .line 34
    add-int/lit8 v8, p1, 0x7

    .line 35
    .line 36
    aget-char v8, p0, v8

    .line 37
    .line 38
    add-int/lit8 p1, p1, 0x8

    .line 39
    .line 40
    aget-char p0, p0, p1

    .line 41
    .line 42
    const/16 p1, 0xa

    .line 43
    .line 44
    const/16 v9, 0x2d

    .line 45
    .line 46
    const/16 v10, 0x30

    .line 47
    .line 48
    if-ne v5, v9, :cond_1

    .line 49
    .line 50
    if-ne v8, v9, :cond_1

    .line 51
    .line 52
    :goto_0
    move v5, v3

    .line 53
    move v3, v6

    .line 54
    move v8, v10

    .line 55
    move v6, v4

    .line 56
    move v4, v7

    .line 57
    goto/16 :goto_7

    .line 58
    .line 59
    :cond_1
    if-ne v5, v9, :cond_2

    .line 60
    .line 61
    if-ne v7, v9, :cond_2

    .line 62
    .line 63
    :goto_1
    move v5, v6

    .line 64
    move v6, v4

    .line 65
    move v4, v5

    .line 66
    move v5, v3

    .line 67
    :goto_2
    move v3, v10

    .line 68
    goto/16 :goto_7

    .line 69
    .line 70
    :cond_2
    const/16 v11, 0x2f

    .line 71
    .line 72
    if-ne v5, v11, :cond_3

    .line 73
    .line 74
    if-ne v8, v11, :cond_3

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    if-ne v5, v11, :cond_4

    .line 78
    .line 79
    if-ne v7, v11, :cond_4

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_4
    const/16 v12, 0x2e

    .line 83
    .line 84
    if-ne v1, v12, :cond_5

    .line 85
    .line 86
    if-ne v5, v12, :cond_5

    .line 87
    .line 88
    :goto_3
    move v1, v6

    .line 89
    move v6, p0

    .line 90
    move p0, v0

    .line 91
    move v0, v1

    .line 92
    move v1, v7

    .line 93
    move v5, v8

    .line 94
    move v8, v10

    .line 95
    goto/16 :goto_7

    .line 96
    .line 97
    :cond_5
    if-ne v3, v12, :cond_6

    .line 98
    .line 99
    if-ne v5, v12, :cond_6

    .line 100
    .line 101
    :goto_4
    move v5, v8

    .line 102
    move v3, v10

    .line 103
    move v8, v0

    .line 104
    move v0, v6

    .line 105
    move v6, p0

    .line 106
    move p0, v1

    .line 107
    :goto_5
    move v1, v7

    .line 108
    goto/16 :goto_7

    .line 109
    .line 110
    :cond_6
    if-ne v1, v9, :cond_7

    .line 111
    .line 112
    if-ne v5, v9, :cond_7

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_7
    if-ne v3, v9, :cond_8

    .line 116
    .line 117
    if-ne v5, v9, :cond_8

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_8
    const/16 v12, 0x5e74

    .line 121
    .line 122
    if-ne v5, v12, :cond_9

    .line 123
    .line 124
    const/16 v12, 0x6708

    .line 125
    .line 126
    if-ne v7, v12, :cond_9

    .line 127
    .line 128
    const/16 v12, 0x65e5

    .line 129
    .line 130
    if-ne p0, v12, :cond_9

    .line 131
    .line 132
    :goto_6
    move p0, v6

    .line 133
    move v6, v4

    .line 134
    move v4, p0

    .line 135
    move v5, v3

    .line 136
    move p0, v8

    .line 137
    move v3, v10

    .line 138
    move v8, v3

    .line 139
    goto/16 :goto_7

    .line 140
    .line 141
    :cond_9
    const v12, 0xb144

    .line 142
    .line 143
    .line 144
    if-ne v5, v12, :cond_a

    .line 145
    .line 146
    const v12, 0xc6d4

    .line 147
    .line 148
    .line 149
    if-ne v7, v12, :cond_a

    .line 150
    .line 151
    const v12, 0xc77c

    .line 152
    .line 153
    .line 154
    if-ne p0, v12, :cond_a

    .line 155
    .line 156
    goto :goto_6

    .line 157
    :cond_a
    if-ne v3, v9, :cond_c

    .line 158
    .line 159
    if-ne v7, v9, :cond_c

    .line 160
    .line 161
    invoke-static {v4, v5, v6}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    if-lez v3, :cond_b

    .line 166
    .line 167
    div-int/lit8 v4, v3, 0xa

    .line 168
    .line 169
    add-int/2addr v4, v10

    .line 170
    int-to-char v4, v4

    .line 171
    rem-int/2addr v3, p1

    .line 172
    add-int/2addr v3, v10

    .line 173
    int-to-char v3, v3

    .line 174
    const/16 v5, 0x32

    .line 175
    .line 176
    move v6, v8

    .line 177
    move v8, v0

    .line 178
    move v0, v5

    .line 179
    move v5, v6

    .line 180
    move v6, v4

    .line 181
    move v4, v3

    .line 182
    move v3, v6

    .line 183
    move v6, p0

    .line 184
    move p0, v1

    .line 185
    move v1, v10

    .line 186
    goto :goto_7

    .line 187
    :cond_b
    return-object v2

    .line 188
    :cond_c
    if-ne v1, v11, :cond_d

    .line 189
    .line 190
    if-ne v5, v11, :cond_d

    .line 191
    .line 192
    move v1, v6

    .line 193
    move v6, p0

    .line 194
    move p0, v4

    .line 195
    move v4, v0

    .line 196
    move v0, v1

    .line 197
    move v1, v7

    .line 198
    move v5, v8

    .line 199
    move v8, v3

    .line 200
    goto/16 :goto_2

    .line 201
    .line 202
    :cond_d
    if-ne v3, v11, :cond_f

    .line 203
    .line 204
    if-ne v5, v11, :cond_f

    .line 205
    .line 206
    move v3, v0

    .line 207
    move v0, v6

    .line 208
    move v5, v8

    .line 209
    move v8, v10

    .line 210
    move v6, p0

    .line 211
    move p0, v4

    .line 212
    move v4, v1

    .line 213
    goto :goto_5

    .line 214
    :goto_7
    if-lt v0, v10, :cond_f

    .line 215
    .line 216
    const/16 v7, 0x39

    .line 217
    .line 218
    if-gt v0, v7, :cond_f

    .line 219
    .line 220
    if-lt v1, v10, :cond_f

    .line 221
    .line 222
    if-gt v1, v7, :cond_f

    .line 223
    .line 224
    if-lt v5, v10, :cond_f

    .line 225
    .line 226
    if-gt v5, v7, :cond_f

    .line 227
    .line 228
    if-lt v6, v10, :cond_f

    .line 229
    .line 230
    if-gt v6, v7, :cond_f

    .line 231
    .line 232
    sub-int/2addr v0, v10

    .line 233
    mul-int/lit16 v0, v0, 0x3e8

    .line 234
    .line 235
    const/16 v9, 0x64

    .line 236
    .line 237
    invoke-static {v1, v10, v9, v0}, Lp/a;->z(IIII)I

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    invoke-static {v5, v10, p1, v0}, Lp/a;->z(IIII)I

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    sub-int/2addr v6, v10

    .line 246
    add-int/2addr v6, v0

    .line 247
    if-lt v3, v10, :cond_f

    .line 248
    .line 249
    if-gt v3, v7, :cond_f

    .line 250
    .line 251
    if-lt v4, v10, :cond_f

    .line 252
    .line 253
    if-gt v4, v7, :cond_f

    .line 254
    .line 255
    sub-int/2addr v3, v10

    .line 256
    mul-int/2addr v3, p1

    .line 257
    sub-int/2addr v4, v10

    .line 258
    add-int/2addr v4, v3

    .line 259
    if-lt v8, v10, :cond_f

    .line 260
    .line 261
    if-gt v8, v7, :cond_f

    .line 262
    .line 263
    if-lt p0, v10, :cond_f

    .line 264
    .line 265
    if-gt p0, v7, :cond_f

    .line 266
    .line 267
    sub-int/2addr v8, v10

    .line 268
    mul-int/2addr v8, p1

    .line 269
    sub-int/2addr p0, v10

    .line 270
    add-int/2addr p0, v8

    .line 271
    if-nez v6, :cond_e

    .line 272
    .line 273
    if-nez v4, :cond_e

    .line 274
    .line 275
    if-nez p0, :cond_e

    .line 276
    .line 277
    return-object v2

    .line 278
    :cond_e
    invoke-static {v6, v4, p0}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 279
    .line 280
    .line 281
    move-result-object p0

    .line 282
    return-object p0

    .line 283
    :cond_f
    return-object v2
.end method

.method public static parseLocalDateTime(Ljava/lang/String;)Ljava/time/LocalDateTime;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    .line 184
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {p0, v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime(Ljava/lang/String;II)Ljava/time/LocalDateTime;

    move-result-object p0

    return-object p0
.end method

.method public static parseLocalDateTime(Ljava/lang/String;II)Ljava/time/LocalDateTime;
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_a

    if-nez p2, :cond_0

    goto/16 :goto_2

    .line 179
    :cond_0
    new-array v1, p2, [C

    add-int v2, p1, p2

    const/4 v3, 0x0

    .line 180
    invoke-virtual {p0, p1, v2, v1, v3}, Ljava/lang/String;->getChars(II[CI)V

    .line 181
    invoke-static {v1, p1, p2}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime([CII)Ljava/time/LocalDateTime;

    move-result-object p2

    if-nez p2, :cond_9

    .line 182
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p2

    const/4 v1, -0x1

    sparse-switch p2, :sswitch_data_0

    :goto_0
    move v3, v1

    goto :goto_1

    :sswitch_0
    const-string p2, "0000-00-00"

    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x7

    goto :goto_1

    :sswitch_1
    const-string p2, "0000\u5e7400\u670800\u65e5"

    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x6

    goto :goto_1

    :sswitch_2
    const-string p2, "null"

    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    goto :goto_0

    :cond_3
    const/4 v3, 0x5

    goto :goto_1

    :sswitch_3
    const-string p2, ""

    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    goto :goto_0

    :cond_4
    const/4 v3, 0x4

    goto :goto_1

    :sswitch_4
    const-string p2, "00000000"

    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    goto :goto_0

    :cond_5
    const/4 v3, 0x3

    goto :goto_1

    :sswitch_5
    const-string p2, "000000000000"

    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_6

    goto :goto_0

    :cond_6
    const/4 v3, 0x2

    goto :goto_1

    :sswitch_6
    const-string p2, "0000-00-0"

    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7

    goto :goto_0

    :cond_7
    const/4 v3, 0x1

    goto :goto_1

    :sswitch_7
    const-string p2, "0000-0-00"

    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_8

    goto :goto_0

    :cond_8
    :goto_1
    packed-switch v3, :pswitch_data_0

    .line 183
    new-instance p2, Ljava/time/format/DateTimeParseException;

    invoke-direct {p2, p0, p0, p1}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw p2

    :pswitch_0
    return-object v0

    :cond_9
    return-object p2

    :cond_a
    :goto_2
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x794e6996 -> :sswitch_7
        -0x794e5eb0 -> :sswitch_6
        -0x4f2e5c00 -> :sswitch_5
        -0x45f8e800 -> :sswitch_4
        0x0 -> :sswitch_3
        0x33c587 -> :sswitch_2
        0x52cad51 -> :sswitch_1
        0x4f8288e0 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static parseLocalDateTime([BII)Ljava/time/LocalDateTime;
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    if-nez p2, :cond_0

    goto/16 :goto_0

    :cond_0
    packed-switch p2, :pswitch_data_0

    .line 185
    :pswitch_0
    invoke-static {p0, p1, p2}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTimeX([BII)Ljava/time/LocalDateTime;

    move-result-object p0

    return-object p0

    .line 186
    :pswitch_1
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime20([BI)Ljava/time/LocalDateTime;

    move-result-object p0

    return-object p0

    .line 187
    :pswitch_2
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime19([BI)Ljava/time/LocalDateTime;

    move-result-object p0

    return-object p0

    .line 188
    :pswitch_3
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime18([BI)Ljava/time/LocalDateTime;

    move-result-object p0

    return-object p0

    .line 189
    :pswitch_4
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime17([BI)Ljava/time/LocalDateTime;

    move-result-object p0

    return-object p0

    .line 190
    :pswitch_5
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime16([BI)Ljava/time/LocalDateTime;

    move-result-object p0

    return-object p0

    .line 191
    :pswitch_6
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime14([BI)Ljava/time/LocalDateTime;

    move-result-object p0

    return-object p0

    .line 192
    :pswitch_7
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime12([BI)Ljava/time/LocalDateTime;

    move-result-object p0

    return-object p0

    .line 193
    :pswitch_8
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate11([BI)Ljava/time/LocalDate;

    move-result-object p0

    sget-object p1, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 194
    invoke-static {p0, p1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    move-result-object p0

    return-object p0

    .line 195
    :pswitch_9
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate10([BI)Ljava/time/LocalDate;

    move-result-object p0

    if-nez p0, :cond_1

    return-object v0

    .line 196
    :cond_1
    sget-object p1, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    invoke-static {p0, p1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    move-result-object p0

    return-object p0

    .line 197
    :pswitch_a
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate9([BI)Ljava/time/LocalDate;

    move-result-object p0

    if-nez p0, :cond_2

    return-object v0

    .line 198
    :cond_2
    sget-object p1, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    invoke-static {p0, p1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    move-result-object p0

    return-object p0

    .line 199
    :pswitch_b
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate8([BI)Ljava/time/LocalDate;

    move-result-object p0

    if-nez p0, :cond_3

    return-object v0

    .line 200
    :cond_3
    sget-object p1, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    invoke-static {p0, p1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    move-result-object p0

    return-object p0

    .line 201
    :pswitch_c
    aget-byte v1, p0, p1

    const/16 v2, 0x6e

    if-ne v1, v2, :cond_4

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    const/16 v2, 0x75

    if-ne v1, v2, :cond_4

    add-int/lit8 v1, p1, 0x2

    aget-byte v1, p0, v1

    const/16 v2, 0x6c

    if-ne v1, v2, :cond_4

    add-int/lit8 v1, p1, 0x3

    aget-byte v1, p0, v1

    if-ne v1, v2, :cond_4

    return-object v0

    .line 202
    :cond_4
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p0, p1, p2}, Ljava/lang/String;-><init>([BII)V

    .line 203
    new-instance p0, Ljava/time/format/DateTimeParseException;

    const-string p1, "illegal input "

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-direct {p0, p1, v0, p2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw p0

    :cond_5
    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static parseLocalDateTime([CII)Ljava/time/LocalDateTime;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_7

    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    goto/16 :goto_0

    .line 7
    .line 8
    :cond_0
    packed-switch p2, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    :pswitch_0
    invoke-static {p0, p1, p2}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTimeX([CII)Ljava/time/LocalDateTime;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :pswitch_1
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime20([CI)Ljava/time/LocalDateTime;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_2
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime19([CI)Ljava/time/LocalDateTime;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_3
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime18([CI)Ljava/time/LocalDateTime;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_4
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime17([CI)Ljava/time/LocalDateTime;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_5
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime16([CI)Ljava/time/LocalDateTime;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :pswitch_6
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime14([CI)Ljava/time/LocalDateTime;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :pswitch_7
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime12([CI)Ljava/time/LocalDateTime;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :pswitch_8
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate11([CI)Ljava/time/LocalDate;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    if-nez p0, :cond_1

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_1
    sget-object p1, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 59
    .line 60
    invoke-static {p0, p1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :pswitch_9
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate10([CI)Ljava/time/LocalDate;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    if-nez p0, :cond_2

    .line 70
    .line 71
    return-object v0

    .line 72
    :cond_2
    sget-object p1, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 73
    .line 74
    invoke-static {p0, p1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0

    .line 79
    :pswitch_a
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate9([CI)Ljava/time/LocalDate;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    if-nez p0, :cond_3

    .line 84
    .line 85
    return-object v0

    .line 86
    :cond_3
    sget-object p1, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 87
    .line 88
    invoke-static {p0, p1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0

    .line 93
    :pswitch_b
    const/4 p2, 0x2

    .line 94
    aget-char p2, p0, p2

    .line 95
    .line 96
    const/16 v1, 0x3a

    .line 97
    .line 98
    if-ne p2, v1, :cond_4

    .line 99
    .line 100
    const/4 p2, 0x5

    .line 101
    aget-char p2, p0, p2

    .line 102
    .line 103
    if-ne p2, v1, :cond_4

    .line 104
    .line 105
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalTime8([CI)Ljava/time/LocalTime;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    sget-object p1, Lcom/alibaba/fastjson2/util/DateUtils;->LOCAL_DATE_19700101:Ljava/time/LocalDate;

    .line 110
    .line 111
    invoke-static {p1, p0}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0

    .line 116
    :cond_4
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDate8([CI)Ljava/time/LocalDate;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    if-nez p0, :cond_5

    .line 121
    .line 122
    return-object v0

    .line 123
    :cond_5
    sget-object p1, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 124
    .line 125
    invoke-static {p0, p1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    return-object p0

    .line 130
    :pswitch_c
    aget-char v1, p0, p1

    .line 131
    .line 132
    const/16 v2, 0x6e

    .line 133
    .line 134
    if-ne v1, v2, :cond_6

    .line 135
    .line 136
    add-int/lit8 v1, p1, 0x1

    .line 137
    .line 138
    aget-char v1, p0, v1

    .line 139
    .line 140
    const/16 v2, 0x75

    .line 141
    .line 142
    if-ne v1, v2, :cond_6

    .line 143
    .line 144
    add-int/lit8 v1, p1, 0x2

    .line 145
    .line 146
    aget-char v1, p0, v1

    .line 147
    .line 148
    const/16 v2, 0x6c

    .line 149
    .line 150
    if-ne v1, v2, :cond_6

    .line 151
    .line 152
    add-int/lit8 v1, p1, 0x3

    .line 153
    .line 154
    aget-char v1, p0, v1

    .line 155
    .line 156
    if-ne v1, v2, :cond_6

    .line 157
    .line 158
    return-object v0

    .line 159
    :cond_6
    new-instance v0, Ljava/lang/String;

    .line 160
    .line 161
    invoke-direct {v0, p0, p1, p2}, Ljava/lang/String;-><init>([CII)V

    .line 162
    .line 163
    .line 164
    new-instance p0, Ljava/time/format/DateTimeParseException;

    .line 165
    .line 166
    const-string p1, "illegal input "

    .line 167
    .line 168
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    const/4 p2, 0x0

    .line 173
    invoke-direct {p0, p1, v0, p2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 174
    .line 175
    .line 176
    throw p0

    .line 177
    :cond_7
    :goto_0
    return-object v0

    .line 178
    nop

    .line 179
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static parseLocalDateTime12([BI)Ljava/time/LocalDateTime;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0xc

    .line 6
    .line 7
    array-length v3, v0

    .line 8
    const-string v5, "illegal input "

    .line 9
    .line 10
    if-gt v2, v3, :cond_7

    .line 11
    .line 12
    aget-byte v3, v0, v1

    .line 13
    .line 14
    int-to-char v3, v3

    .line 15
    add-int/lit8 v6, v1, 0x1

    .line 16
    .line 17
    aget-byte v6, v0, v6

    .line 18
    .line 19
    int-to-char v6, v6

    .line 20
    add-int/lit8 v7, v1, 0x2

    .line 21
    .line 22
    aget-byte v7, v0, v7

    .line 23
    .line 24
    int-to-char v7, v7

    .line 25
    add-int/lit8 v8, v1, 0x3

    .line 26
    .line 27
    aget-byte v8, v0, v8

    .line 28
    .line 29
    int-to-char v8, v8

    .line 30
    add-int/lit8 v9, v1, 0x4

    .line 31
    .line 32
    aget-byte v9, v0, v9

    .line 33
    .line 34
    int-to-char v9, v9

    .line 35
    add-int/lit8 v10, v1, 0x5

    .line 36
    .line 37
    aget-byte v10, v0, v10

    .line 38
    .line 39
    int-to-char v10, v10

    .line 40
    add-int/lit8 v11, v1, 0x6

    .line 41
    .line 42
    aget-byte v11, v0, v11

    .line 43
    .line 44
    int-to-char v11, v11

    .line 45
    add-int/lit8 v12, v1, 0x7

    .line 46
    .line 47
    aget-byte v12, v0, v12

    .line 48
    .line 49
    int-to-char v12, v12

    .line 50
    add-int/lit8 v13, v1, 0x8

    .line 51
    .line 52
    aget-byte v13, v0, v13

    .line 53
    .line 54
    int-to-char v13, v13

    .line 55
    add-int/lit8 v14, v1, 0x9

    .line 56
    .line 57
    aget-byte v14, v0, v14

    .line 58
    .line 59
    int-to-char v14, v14

    .line 60
    add-int/lit8 v15, v1, 0xa

    .line 61
    .line 62
    aget-byte v15, v0, v15

    .line 63
    .line 64
    int-to-char v15, v15

    .line 65
    add-int/lit8 v16, v1, 0xb

    .line 66
    .line 67
    aget-byte v4, v0, v16

    .line 68
    .line 69
    int-to-char v4, v4

    .line 70
    move-object/from16 v16, v5

    .line 71
    .line 72
    const/16 v5, 0x30

    .line 73
    .line 74
    if-lt v3, v5, :cond_6

    .line 75
    .line 76
    const/16 v0, 0x39

    .line 77
    .line 78
    if-gt v3, v0, :cond_5

    .line 79
    .line 80
    if-lt v6, v5, :cond_5

    .line 81
    .line 82
    if-gt v6, v0, :cond_5

    .line 83
    .line 84
    if-lt v7, v5, :cond_5

    .line 85
    .line 86
    if-gt v7, v0, :cond_5

    .line 87
    .line 88
    if-lt v8, v5, :cond_5

    .line 89
    .line 90
    if-gt v8, v0, :cond_5

    .line 91
    .line 92
    sub-int/2addr v3, v5

    .line 93
    mul-int/lit16 v3, v3, 0x3e8

    .line 94
    .line 95
    const/16 v0, 0x64

    .line 96
    .line 97
    invoke-static {v6, v5, v0, v3}, Lp/a;->z(IIII)I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    const/16 v3, 0xa

    .line 102
    .line 103
    invoke-static {v7, v5, v3, v0}, Lp/a;->z(IIII)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    sub-int/2addr v8, v5

    .line 108
    add-int v17, v8, v0

    .line 109
    .line 110
    if-lt v9, v5, :cond_4

    .line 111
    .line 112
    const/16 v0, 0x39

    .line 113
    .line 114
    if-gt v9, v0, :cond_4

    .line 115
    .line 116
    if-lt v10, v5, :cond_4

    .line 117
    .line 118
    if-gt v10, v0, :cond_4

    .line 119
    .line 120
    sub-int/2addr v9, v5

    .line 121
    mul-int/2addr v9, v3

    .line 122
    sub-int/2addr v10, v5

    .line 123
    add-int v18, v10, v9

    .line 124
    .line 125
    if-lt v11, v5, :cond_3

    .line 126
    .line 127
    if-gt v11, v0, :cond_3

    .line 128
    .line 129
    if-lt v12, v5, :cond_3

    .line 130
    .line 131
    if-gt v12, v0, :cond_3

    .line 132
    .line 133
    sub-int/2addr v11, v5

    .line 134
    mul-int/2addr v11, v3

    .line 135
    sub-int/2addr v12, v5

    .line 136
    add-int v19, v12, v11

    .line 137
    .line 138
    if-lt v13, v5, :cond_2

    .line 139
    .line 140
    if-gt v13, v0, :cond_2

    .line 141
    .line 142
    if-lt v14, v5, :cond_2

    .line 143
    .line 144
    if-gt v14, v0, :cond_2

    .line 145
    .line 146
    sub-int/2addr v13, v5

    .line 147
    mul-int/2addr v13, v3

    .line 148
    sub-int/2addr v14, v5

    .line 149
    add-int v20, v14, v13

    .line 150
    .line 151
    if-lt v15, v5, :cond_1

    .line 152
    .line 153
    if-gt v15, v0, :cond_1

    .line 154
    .line 155
    if-lt v4, v5, :cond_1

    .line 156
    .line 157
    if-gt v4, v0, :cond_1

    .line 158
    .line 159
    sub-int/2addr v15, v5

    .line 160
    mul-int/2addr v15, v3

    .line 161
    sub-int/2addr v4, v5

    .line 162
    add-int v21, v4, v15

    .line 163
    .line 164
    if-nez v17, :cond_0

    .line 165
    .line 166
    if-nez v18, :cond_0

    .line 167
    .line 168
    if-nez v19, :cond_0

    .line 169
    .line 170
    if-nez v20, :cond_0

    .line 171
    .line 172
    if-nez v21, :cond_0

    .line 173
    .line 174
    const/4 v0, 0x0

    .line 175
    return-object v0

    .line 176
    :cond_0
    const/16 v22, 0x0

    .line 177
    .line 178
    invoke-static/range {v17 .. v22}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    return-object v0

    .line 183
    :cond_1
    new-instance v0, Ljava/lang/String;

    .line 184
    .line 185
    move-object/from16 v3, p0

    .line 186
    .line 187
    invoke-direct {v0, v3, v1, v2}, Ljava/lang/String;-><init>([BII)V

    .line 188
    .line 189
    .line 190
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 191
    .line 192
    move-object/from16 v4, v16

    .line 193
    .line 194
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    const/4 v5, 0x0

    .line 199
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 200
    .line 201
    .line 202
    throw v1

    .line 203
    :cond_2
    move-object/from16 v3, p0

    .line 204
    .line 205
    move-object/from16 v4, v16

    .line 206
    .line 207
    const/4 v5, 0x0

    .line 208
    new-instance v0, Ljava/lang/String;

    .line 209
    .line 210
    invoke-direct {v0, v3, v1, v2}, Ljava/lang/String;-><init>([BII)V

    .line 211
    .line 212
    .line 213
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 214
    .line 215
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 220
    .line 221
    .line 222
    throw v1

    .line 223
    :cond_3
    move-object/from16 v3, p0

    .line 224
    .line 225
    move-object/from16 v4, v16

    .line 226
    .line 227
    const/4 v5, 0x0

    .line 228
    new-instance v0, Ljava/lang/String;

    .line 229
    .line 230
    invoke-direct {v0, v3, v1, v2}, Ljava/lang/String;-><init>([BII)V

    .line 231
    .line 232
    .line 233
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 234
    .line 235
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 240
    .line 241
    .line 242
    throw v1

    .line 243
    :cond_4
    move-object/from16 v3, p0

    .line 244
    .line 245
    move-object/from16 v4, v16

    .line 246
    .line 247
    const/4 v5, 0x0

    .line 248
    new-instance v0, Ljava/lang/String;

    .line 249
    .line 250
    invoke-direct {v0, v3, v1, v2}, Ljava/lang/String;-><init>([BII)V

    .line 251
    .line 252
    .line 253
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 254
    .line 255
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 260
    .line 261
    .line 262
    throw v1

    .line 263
    :cond_5
    move-object/from16 v3, p0

    .line 264
    .line 265
    :goto_0
    move-object/from16 v4, v16

    .line 266
    .line 267
    goto :goto_1

    .line 268
    :cond_6
    move-object v3, v0

    .line 269
    goto :goto_0

    .line 270
    :goto_1
    new-instance v0, Ljava/lang/String;

    .line 271
    .line 272
    invoke-direct {v0, v3, v1, v2}, Ljava/lang/String;-><init>([BII)V

    .line 273
    .line 274
    .line 275
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 276
    .line 277
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    const/4 v5, 0x0

    .line 282
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 283
    .line 284
    .line 285
    throw v1

    .line 286
    :cond_7
    move-object v3, v0

    .line 287
    move-object v4, v5

    .line 288
    const/4 v5, 0x0

    .line 289
    new-instance v0, Ljava/lang/String;

    .line 290
    .line 291
    array-length v2, v3

    .line 292
    sub-int/2addr v2, v1

    .line 293
    invoke-direct {v0, v3, v1, v2}, Ljava/lang/String;-><init>([BII)V

    .line 294
    .line 295
    .line 296
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 297
    .line 298
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 303
    .line 304
    .line 305
    throw v1
.end method

.method public static parseLocalDateTime12([CI)Ljava/time/LocalDateTime;
    .locals 23

    move-object/from16 v0, p0

    move/from16 v1, p1

    add-int/lit8 v2, v1, 0xc

    .line 306
    array-length v3, v0

    const-string v5, "illegal input "

    if-gt v2, v3, :cond_7

    .line 307
    aget-char v3, v0, v1

    add-int/lit8 v6, v1, 0x1

    .line 308
    aget-char v6, v0, v6

    add-int/lit8 v7, v1, 0x2

    .line 309
    aget-char v7, v0, v7

    add-int/lit8 v8, v1, 0x3

    .line 310
    aget-char v8, v0, v8

    add-int/lit8 v9, v1, 0x4

    .line 311
    aget-char v9, v0, v9

    add-int/lit8 v10, v1, 0x5

    .line 312
    aget-char v10, v0, v10

    add-int/lit8 v11, v1, 0x6

    .line 313
    aget-char v11, v0, v11

    add-int/lit8 v12, v1, 0x7

    .line 314
    aget-char v12, v0, v12

    add-int/lit8 v13, v1, 0x8

    .line 315
    aget-char v13, v0, v13

    add-int/lit8 v14, v1, 0x9

    .line 316
    aget-char v14, v0, v14

    add-int/lit8 v15, v1, 0xa

    .line 317
    aget-char v15, v0, v15

    add-int/lit8 v16, v1, 0xb

    .line 318
    aget-char v4, v0, v16

    move-object/from16 v16, v5

    const/16 v5, 0x30

    if-lt v3, v5, :cond_6

    const/16 v0, 0x39

    if-gt v3, v0, :cond_5

    if-lt v6, v5, :cond_5

    if-gt v6, v0, :cond_5

    if-lt v7, v5, :cond_5

    if-gt v7, v0, :cond_5

    if-lt v8, v5, :cond_5

    if-gt v8, v0, :cond_5

    sub-int/2addr v3, v5

    mul-int/lit16 v3, v3, 0x3e8

    const/16 v0, 0x64

    .line 319
    invoke-static {v6, v5, v0, v3}, Lp/a;->z(IIII)I

    move-result v0

    const/16 v3, 0xa

    invoke-static {v7, v5, v3, v0}, Lp/a;->z(IIII)I

    move-result v0

    sub-int/2addr v8, v5

    add-int v17, v8, v0

    if-lt v9, v5, :cond_4

    const/16 v0, 0x39

    if-gt v9, v0, :cond_4

    if-lt v10, v5, :cond_4

    if-gt v10, v0, :cond_4

    sub-int/2addr v9, v5

    mul-int/2addr v9, v3

    sub-int/2addr v10, v5

    add-int v18, v10, v9

    if-lt v11, v5, :cond_3

    if-gt v11, v0, :cond_3

    if-lt v12, v5, :cond_3

    if-gt v12, v0, :cond_3

    sub-int/2addr v11, v5

    mul-int/2addr v11, v3

    sub-int/2addr v12, v5

    add-int v19, v12, v11

    if-lt v13, v5, :cond_2

    if-gt v13, v0, :cond_2

    if-lt v14, v5, :cond_2

    if-gt v14, v0, :cond_2

    sub-int/2addr v13, v5

    mul-int/2addr v13, v3

    sub-int/2addr v14, v5

    add-int v20, v14, v13

    if-lt v15, v5, :cond_1

    if-gt v15, v0, :cond_1

    if-lt v4, v5, :cond_1

    if-gt v4, v0, :cond_1

    sub-int/2addr v15, v5

    mul-int/2addr v15, v3

    sub-int/2addr v4, v5

    add-int v21, v4, v15

    if-nez v17, :cond_0

    if-nez v18, :cond_0

    if-nez v19, :cond_0

    if-nez v20, :cond_0

    if-nez v21, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/16 v22, 0x0

    .line 320
    invoke-static/range {v17 .. v22}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    move-result-object v0

    return-object v0

    .line 321
    :cond_1
    new-instance v0, Ljava/lang/String;

    move-object/from16 v3, p0

    invoke-direct {v0, v3, v1, v2}, Ljava/lang/String;-><init>([CII)V

    .line 322
    new-instance v1, Ljava/time/format/DateTimeParseException;

    move-object/from16 v4, v16

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :cond_2
    move-object/from16 v3, p0

    move-object/from16 v4, v16

    const/4 v5, 0x0

    .line 323
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3, v1, v2}, Ljava/lang/String;-><init>([CII)V

    .line 324
    new-instance v1, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :cond_3
    move-object/from16 v3, p0

    move-object/from16 v4, v16

    const/4 v5, 0x0

    .line 325
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3, v1, v2}, Ljava/lang/String;-><init>([CII)V

    .line 326
    new-instance v1, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :cond_4
    move-object/from16 v3, p0

    move-object/from16 v4, v16

    const/4 v5, 0x0

    .line 327
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3, v1, v2}, Ljava/lang/String;-><init>([CII)V

    .line 328
    new-instance v1, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :cond_5
    move-object/from16 v3, p0

    :goto_0
    move-object/from16 v4, v16

    goto :goto_1

    :cond_6
    move-object v3, v0

    goto :goto_0

    .line 329
    :goto_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3, v1, v2}, Ljava/lang/String;-><init>([CII)V

    .line 330
    new-instance v1, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :cond_7
    move-object v3, v0

    move-object v4, v5

    const/4 v5, 0x0

    .line 331
    new-instance v0, Ljava/lang/String;

    array-length v2, v3

    sub-int/2addr v2, v1

    invoke-direct {v0, v3, v1, v2}, Ljava/lang/String;-><init>([CII)V

    .line 332
    new-instance v1, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1
.end method

.method public static parseLocalDateTime14([BI)Ljava/time/LocalDateTime;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    add-int/lit8 v1, p1, 0xe

    .line 4
    .line 5
    array-length v2, v0

    .line 6
    const/4 v3, 0x0

    .line 7
    if-le v1, v2, :cond_0

    .line 8
    .line 9
    return-object v3

    .line 10
    :cond_0
    aget-byte v1, v0, p1

    .line 11
    .line 12
    int-to-char v1, v1

    .line 13
    add-int/lit8 v2, p1, 0x1

    .line 14
    .line 15
    aget-byte v2, v0, v2

    .line 16
    .line 17
    int-to-char v2, v2

    .line 18
    add-int/lit8 v4, p1, 0x2

    .line 19
    .line 20
    aget-byte v4, v0, v4

    .line 21
    .line 22
    int-to-char v4, v4

    .line 23
    add-int/lit8 v5, p1, 0x3

    .line 24
    .line 25
    aget-byte v5, v0, v5

    .line 26
    .line 27
    int-to-char v5, v5

    .line 28
    add-int/lit8 v6, p1, 0x4

    .line 29
    .line 30
    aget-byte v6, v0, v6

    .line 31
    .line 32
    int-to-char v6, v6

    .line 33
    add-int/lit8 v7, p1, 0x5

    .line 34
    .line 35
    aget-byte v7, v0, v7

    .line 36
    .line 37
    int-to-char v7, v7

    .line 38
    add-int/lit8 v8, p1, 0x6

    .line 39
    .line 40
    aget-byte v8, v0, v8

    .line 41
    .line 42
    int-to-char v8, v8

    .line 43
    add-int/lit8 v9, p1, 0x7

    .line 44
    .line 45
    aget-byte v9, v0, v9

    .line 46
    .line 47
    int-to-char v9, v9

    .line 48
    add-int/lit8 v10, p1, 0x8

    .line 49
    .line 50
    aget-byte v10, v0, v10

    .line 51
    .line 52
    int-to-char v10, v10

    .line 53
    add-int/lit8 v11, p1, 0x9

    .line 54
    .line 55
    aget-byte v11, v0, v11

    .line 56
    .line 57
    int-to-char v11, v11

    .line 58
    add-int/lit8 v12, p1, 0xa

    .line 59
    .line 60
    aget-byte v12, v0, v12

    .line 61
    .line 62
    int-to-char v12, v12

    .line 63
    add-int/lit8 v13, p1, 0xb

    .line 64
    .line 65
    aget-byte v13, v0, v13

    .line 66
    .line 67
    int-to-char v13, v13

    .line 68
    add-int/lit8 v14, p1, 0xc

    .line 69
    .line 70
    aget-byte v14, v0, v14

    .line 71
    .line 72
    int-to-char v14, v14

    .line 73
    add-int/lit8 v15, p1, 0xd

    .line 74
    .line 75
    aget-byte v0, v0, v15

    .line 76
    .line 77
    int-to-char v0, v0

    .line 78
    const/16 v15, 0x30

    .line 79
    .line 80
    move-object/from16 v16, v3

    .line 81
    .line 82
    if-lt v1, v15, :cond_1

    .line 83
    .line 84
    const/16 v3, 0x39

    .line 85
    .line 86
    if-gt v1, v3, :cond_1

    .line 87
    .line 88
    if-lt v2, v15, :cond_1

    .line 89
    .line 90
    if-gt v2, v3, :cond_1

    .line 91
    .line 92
    if-lt v4, v15, :cond_1

    .line 93
    .line 94
    if-gt v4, v3, :cond_1

    .line 95
    .line 96
    if-lt v5, v15, :cond_1

    .line 97
    .line 98
    if-gt v5, v3, :cond_1

    .line 99
    .line 100
    sub-int/2addr v1, v15

    .line 101
    mul-int/lit16 v1, v1, 0x3e8

    .line 102
    .line 103
    const/16 v3, 0x64

    .line 104
    .line 105
    invoke-static {v2, v15, v3, v1}, Lp/a;->z(IIII)I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    const/16 v2, 0xa

    .line 110
    .line 111
    invoke-static {v4, v15, v2, v1}, Lp/a;->z(IIII)I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    sub-int/2addr v5, v15

    .line 116
    add-int v17, v5, v1

    .line 117
    .line 118
    if-lt v6, v15, :cond_1

    .line 119
    .line 120
    const/16 v1, 0x39

    .line 121
    .line 122
    if-gt v6, v1, :cond_1

    .line 123
    .line 124
    if-lt v7, v15, :cond_1

    .line 125
    .line 126
    if-gt v7, v1, :cond_1

    .line 127
    .line 128
    sub-int/2addr v6, v15

    .line 129
    mul-int/2addr v6, v2

    .line 130
    sub-int/2addr v7, v15

    .line 131
    add-int v18, v7, v6

    .line 132
    .line 133
    if-lt v8, v15, :cond_1

    .line 134
    .line 135
    if-gt v8, v1, :cond_1

    .line 136
    .line 137
    if-lt v9, v15, :cond_1

    .line 138
    .line 139
    if-gt v9, v1, :cond_1

    .line 140
    .line 141
    sub-int/2addr v8, v15

    .line 142
    mul-int/2addr v8, v2

    .line 143
    sub-int/2addr v9, v15

    .line 144
    add-int v19, v9, v8

    .line 145
    .line 146
    if-lt v10, v15, :cond_1

    .line 147
    .line 148
    if-gt v10, v1, :cond_1

    .line 149
    .line 150
    if-lt v11, v15, :cond_1

    .line 151
    .line 152
    if-gt v11, v1, :cond_1

    .line 153
    .line 154
    sub-int/2addr v10, v15

    .line 155
    mul-int/2addr v10, v2

    .line 156
    sub-int/2addr v11, v15

    .line 157
    add-int v20, v11, v10

    .line 158
    .line 159
    if-lt v12, v15, :cond_1

    .line 160
    .line 161
    if-gt v12, v1, :cond_1

    .line 162
    .line 163
    if-lt v13, v15, :cond_1

    .line 164
    .line 165
    if-gt v13, v1, :cond_1

    .line 166
    .line 167
    sub-int/2addr v12, v15

    .line 168
    mul-int/2addr v12, v2

    .line 169
    sub-int/2addr v13, v15

    .line 170
    add-int v21, v13, v12

    .line 171
    .line 172
    if-lt v14, v15, :cond_1

    .line 173
    .line 174
    if-gt v14, v1, :cond_1

    .line 175
    .line 176
    if-lt v0, v15, :cond_1

    .line 177
    .line 178
    if-gt v0, v1, :cond_1

    .line 179
    .line 180
    sub-int/2addr v14, v15

    .line 181
    mul-int/2addr v14, v2

    .line 182
    sub-int/2addr v0, v15

    .line 183
    add-int v22, v0, v14

    .line 184
    .line 185
    invoke-static/range {v17 .. v22}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    return-object v0

    .line 190
    :cond_1
    return-object v16
.end method

.method public static parseLocalDateTime14([CI)Ljava/time/LocalDateTime;
    .locals 23

    move-object/from16 v0, p0

    add-int/lit8 v1, p1, 0xe

    .line 191
    array-length v2, v0

    const/4 v3, 0x0

    if-le v1, v2, :cond_0

    return-object v3

    .line 192
    :cond_0
    aget-char v1, v0, p1

    add-int/lit8 v2, p1, 0x1

    .line 193
    aget-char v2, v0, v2

    add-int/lit8 v4, p1, 0x2

    .line 194
    aget-char v4, v0, v4

    add-int/lit8 v5, p1, 0x3

    .line 195
    aget-char v5, v0, v5

    add-int/lit8 v6, p1, 0x4

    .line 196
    aget-char v6, v0, v6

    add-int/lit8 v7, p1, 0x5

    .line 197
    aget-char v7, v0, v7

    add-int/lit8 v8, p1, 0x6

    .line 198
    aget-char v8, v0, v8

    add-int/lit8 v9, p1, 0x7

    .line 199
    aget-char v9, v0, v9

    add-int/lit8 v10, p1, 0x8

    .line 200
    aget-char v10, v0, v10

    add-int/lit8 v11, p1, 0x9

    .line 201
    aget-char v11, v0, v11

    add-int/lit8 v12, p1, 0xa

    .line 202
    aget-char v12, v0, v12

    add-int/lit8 v13, p1, 0xb

    .line 203
    aget-char v13, v0, v13

    add-int/lit8 v14, p1, 0xc

    .line 204
    aget-char v14, v0, v14

    add-int/lit8 v15, p1, 0xd

    .line 205
    aget-char v0, v0, v15

    const/16 v15, 0x30

    move-object/from16 v16, v3

    if-lt v1, v15, :cond_1

    const/16 v3, 0x39

    if-gt v1, v3, :cond_1

    if-lt v2, v15, :cond_1

    if-gt v2, v3, :cond_1

    if-lt v4, v15, :cond_1

    if-gt v4, v3, :cond_1

    if-lt v5, v15, :cond_1

    if-gt v5, v3, :cond_1

    sub-int/2addr v1, v15

    mul-int/lit16 v1, v1, 0x3e8

    const/16 v3, 0x64

    .line 206
    invoke-static {v2, v15, v3, v1}, Lp/a;->z(IIII)I

    move-result v1

    const/16 v2, 0xa

    invoke-static {v4, v15, v2, v1}, Lp/a;->z(IIII)I

    move-result v1

    sub-int/2addr v5, v15

    add-int v17, v5, v1

    if-lt v6, v15, :cond_1

    const/16 v1, 0x39

    if-gt v6, v1, :cond_1

    if-lt v7, v15, :cond_1

    if-gt v7, v1, :cond_1

    sub-int/2addr v6, v15

    mul-int/2addr v6, v2

    sub-int/2addr v7, v15

    add-int v18, v7, v6

    if-lt v8, v15, :cond_1

    if-gt v8, v1, :cond_1

    if-lt v9, v15, :cond_1

    if-gt v9, v1, :cond_1

    sub-int/2addr v8, v15

    mul-int/2addr v8, v2

    sub-int/2addr v9, v15

    add-int v19, v9, v8

    if-lt v10, v15, :cond_1

    if-gt v10, v1, :cond_1

    if-lt v11, v15, :cond_1

    if-gt v11, v1, :cond_1

    sub-int/2addr v10, v15

    mul-int/2addr v10, v2

    sub-int/2addr v11, v15

    add-int v20, v11, v10

    if-lt v12, v15, :cond_1

    if-gt v12, v1, :cond_1

    if-lt v13, v15, :cond_1

    if-gt v13, v1, :cond_1

    sub-int/2addr v12, v15

    mul-int/2addr v12, v2

    sub-int/2addr v13, v15

    add-int v21, v13, v12

    if-lt v14, v15, :cond_1

    if-gt v14, v1, :cond_1

    if-lt v0, v15, :cond_1

    if-gt v0, v1, :cond_1

    sub-int/2addr v14, v15

    mul-int/2addr v14, v2

    sub-int/2addr v0, v15

    add-int v22, v0, v14

    .line 207
    invoke-static/range {v17 .. v22}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v16
.end method

.method public static parseLocalDateTime16([BI)Ljava/time/LocalDateTime;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    add-int/lit8 v1, p1, 0x10

    .line 4
    .line 5
    array-length v2, v0

    .line 6
    const/4 v3, 0x0

    .line 7
    if-le v1, v2, :cond_0

    .line 8
    .line 9
    return-object v3

    .line 10
    :cond_0
    aget-byte v1, v0, p1

    .line 11
    .line 12
    add-int/lit8 v2, p1, 0x1

    .line 13
    .line 14
    aget-byte v2, v0, v2

    .line 15
    .line 16
    add-int/lit8 v4, p1, 0x2

    .line 17
    .line 18
    aget-byte v4, v0, v4

    .line 19
    .line 20
    add-int/lit8 v5, p1, 0x3

    .line 21
    .line 22
    aget-byte v5, v0, v5

    .line 23
    .line 24
    add-int/lit8 v6, p1, 0x4

    .line 25
    .line 26
    aget-byte v6, v0, v6

    .line 27
    .line 28
    add-int/lit8 v7, p1, 0x5

    .line 29
    .line 30
    aget-byte v7, v0, v7

    .line 31
    .line 32
    add-int/lit8 v8, p1, 0x6

    .line 33
    .line 34
    aget-byte v8, v0, v8

    .line 35
    .line 36
    add-int/lit8 v9, p1, 0x7

    .line 37
    .line 38
    aget-byte v9, v0, v9

    .line 39
    .line 40
    add-int/lit8 v10, p1, 0x8

    .line 41
    .line 42
    aget-byte v10, v0, v10

    .line 43
    .line 44
    add-int/lit8 v11, p1, 0x9

    .line 45
    .line 46
    aget-byte v11, v0, v11

    .line 47
    .line 48
    add-int/lit8 v12, p1, 0xa

    .line 49
    .line 50
    aget-byte v12, v0, v12

    .line 51
    .line 52
    add-int/lit8 v13, p1, 0xb

    .line 53
    .line 54
    aget-byte v13, v0, v13

    .line 55
    .line 56
    add-int/lit8 v14, p1, 0xc

    .line 57
    .line 58
    aget-byte v14, v0, v14

    .line 59
    .line 60
    add-int/lit8 v15, p1, 0xd

    .line 61
    .line 62
    aget-byte v15, v0, v15

    .line 63
    .line 64
    add-int/lit8 v16, p1, 0xe

    .line 65
    .line 66
    move-object/from16 v17, v3

    .line 67
    .line 68
    aget-byte v3, v0, v16

    .line 69
    .line 70
    add-int/lit8 v16, p1, 0xf

    .line 71
    .line 72
    aget-byte v0, v0, v16

    .line 73
    .line 74
    move/from16 p0, v0

    .line 75
    .line 76
    const/16 v20, 0xa

    .line 77
    .line 78
    const/16 v0, 0x2d

    .line 79
    .line 80
    const/16 v21, 0x30

    .line 81
    .line 82
    if-ne v6, v0, :cond_2

    .line 83
    .line 84
    if-ne v9, v0, :cond_2

    .line 85
    .line 86
    const/16 v0, 0x54

    .line 87
    .line 88
    if-eq v12, v0, :cond_1

    .line 89
    .line 90
    const/16 v0, 0x20

    .line 91
    .line 92
    if-ne v12, v0, :cond_2

    .line 93
    .line 94
    :cond_1
    const/16 v0, 0x3a

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    move/from16 v0, p0

    .line 98
    .line 99
    move/from16 v22, v3

    .line 100
    .line 101
    const/16 v3, 0x54

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :goto_0
    if-ne v15, v0, :cond_2

    .line 105
    .line 106
    int-to-char v0, v1

    .line 107
    int-to-char v1, v2

    .line 108
    int-to-char v2, v4

    .line 109
    int-to-char v4, v5

    .line 110
    int-to-char v5, v7

    .line 111
    int-to-char v6, v8

    .line 112
    int-to-char v7, v10

    .line 113
    int-to-char v8, v11

    .line 114
    int-to-char v9, v13

    .line 115
    int-to-char v10, v14

    .line 116
    int-to-char v3, v3

    .line 117
    move/from16 v11, p0

    .line 118
    .line 119
    int-to-char v11, v11

    .line 120
    move/from16 v12, v21

    .line 121
    .line 122
    :goto_1
    move v13, v12

    .line 123
    move v14, v13

    .line 124
    goto/16 :goto_5

    .line 125
    .line 126
    :goto_2
    if-ne v10, v3, :cond_3

    .line 127
    .line 128
    const/16 v3, 0x5a

    .line 129
    .line 130
    if-ne v0, v3, :cond_3

    .line 131
    .line 132
    int-to-char v0, v1

    .line 133
    int-to-char v1, v2

    .line 134
    int-to-char v2, v4

    .line 135
    int-to-char v4, v5

    .line 136
    int-to-char v5, v6

    .line 137
    int-to-char v6, v7

    .line 138
    int-to-char v7, v8

    .line 139
    int-to-char v8, v9

    .line 140
    int-to-char v9, v11

    .line 141
    int-to-char v10, v12

    .line 142
    int-to-char v3, v13

    .line 143
    int-to-char v11, v14

    .line 144
    int-to-char v12, v15

    .line 145
    move/from16 v13, v22

    .line 146
    .line 147
    int-to-char v13, v13

    .line 148
    move/from16 v14, v21

    .line 149
    .line 150
    goto/16 :goto_5

    .line 151
    .line 152
    :cond_3
    move/from16 v3, v22

    .line 153
    .line 154
    move/from16 v22, v14

    .line 155
    .line 156
    const/16 v14, -0x1b

    .line 157
    .line 158
    move/from16 v24, v13

    .line 159
    .line 160
    const/16 v13, -0x1a

    .line 161
    .line 162
    if-ne v6, v14, :cond_4

    .line 163
    .line 164
    const/16 v14, -0x47

    .line 165
    .line 166
    if-ne v7, v14, :cond_4

    .line 167
    .line 168
    const/16 v14, -0x4c

    .line 169
    .line 170
    if-ne v8, v14, :cond_4

    .line 171
    .line 172
    if-ne v10, v13, :cond_4

    .line 173
    .line 174
    const/16 v14, -0x64

    .line 175
    .line 176
    if-ne v11, v14, :cond_4

    .line 177
    .line 178
    const/16 v14, -0x78

    .line 179
    .line 180
    if-ne v12, v14, :cond_4

    .line 181
    .line 182
    if-ne v15, v13, :cond_4

    .line 183
    .line 184
    const/16 v14, -0x69

    .line 185
    .line 186
    if-ne v3, v14, :cond_4

    .line 187
    .line 188
    const/16 v14, -0x5b

    .line 189
    .line 190
    if-ne v0, v14, :cond_4

    .line 191
    .line 192
    int-to-char v0, v1

    .line 193
    int-to-char v1, v2

    .line 194
    int-to-char v2, v4

    .line 195
    int-to-char v4, v5

    .line 196
    int-to-char v6, v9

    .line 197
    move/from16 v14, v24

    .line 198
    .line 199
    int-to-char v7, v14

    .line 200
    move/from16 v3, v22

    .line 201
    .line 202
    int-to-char v8, v3

    .line 203
    move/from16 v3, v21

    .line 204
    .line 205
    move v5, v3

    .line 206
    move v9, v5

    .line 207
    :goto_3
    move v10, v9

    .line 208
    move v11, v10

    .line 209
    move v12, v11

    .line 210
    goto :goto_1

    .line 211
    :cond_4
    move/from16 v25, v22

    .line 212
    .line 213
    move/from16 v14, v24

    .line 214
    .line 215
    const/16 v13, -0x1b

    .line 216
    .line 217
    if-ne v6, v13, :cond_5

    .line 218
    .line 219
    const/16 v13, -0x47

    .line 220
    .line 221
    if-ne v7, v13, :cond_5

    .line 222
    .line 223
    const/16 v13, -0x4c

    .line 224
    .line 225
    if-ne v8, v13, :cond_5

    .line 226
    .line 227
    const/16 v13, -0x1a

    .line 228
    .line 229
    if-ne v11, v13, :cond_5

    .line 230
    .line 231
    const/16 v13, -0x64

    .line 232
    .line 233
    if-ne v12, v13, :cond_5

    .line 234
    .line 235
    const/16 v13, -0x78

    .line 236
    .line 237
    if-ne v14, v13, :cond_5

    .line 238
    .line 239
    const/16 v13, -0x1a

    .line 240
    .line 241
    if-ne v15, v13, :cond_5

    .line 242
    .line 243
    const/16 v13, -0x69

    .line 244
    .line 245
    if-ne v3, v13, :cond_5

    .line 246
    .line 247
    const/16 v13, -0x5b

    .line 248
    .line 249
    if-ne v0, v13, :cond_5

    .line 250
    .line 251
    int-to-char v0, v1

    .line 252
    int-to-char v1, v2

    .line 253
    int-to-char v2, v4

    .line 254
    int-to-char v4, v5

    .line 255
    int-to-char v5, v9

    .line 256
    int-to-char v6, v10

    .line 257
    move/from16 v13, v25

    .line 258
    .line 259
    int-to-char v8, v13

    .line 260
    move/from16 v3, v21

    .line 261
    .line 262
    move v7, v3

    .line 263
    move v9, v7

    .line 264
    goto :goto_3

    .line 265
    :cond_5
    move/from16 v13, v25

    .line 266
    .line 267
    move/from16 p0, v0

    .line 268
    .line 269
    const/16 v0, 0x2d

    .line 270
    .line 271
    if-ne v6, v0, :cond_7

    .line 272
    .line 273
    if-ne v9, v0, :cond_7

    .line 274
    .line 275
    const/16 v0, 0x54

    .line 276
    .line 277
    if-eq v12, v0, :cond_6

    .line 278
    .line 279
    const/16 v0, 0x20

    .line 280
    .line 281
    if-ne v12, v0, :cond_8

    .line 282
    .line 283
    :cond_6
    const/16 v0, 0x3a

    .line 284
    .line 285
    if-ne v13, v0, :cond_7

    .line 286
    .line 287
    if-ne v3, v0, :cond_7

    .line 288
    .line 289
    int-to-char v0, v1

    .line 290
    int-to-char v1, v2

    .line 291
    int-to-char v2, v4

    .line 292
    int-to-char v4, v5

    .line 293
    int-to-char v5, v7

    .line 294
    int-to-char v6, v8

    .line 295
    int-to-char v7, v10

    .line 296
    int-to-char v8, v11

    .line 297
    int-to-char v10, v14

    .line 298
    int-to-char v11, v15

    .line 299
    move/from16 v3, p0

    .line 300
    .line 301
    int-to-char v13, v3

    .line 302
    move/from16 v3, v21

    .line 303
    .line 304
    move v9, v3

    .line 305
    :goto_4
    move v12, v9

    .line 306
    move v14, v12

    .line 307
    goto/16 :goto_5

    .line 308
    .line 309
    :cond_7
    const/16 v0, 0x20

    .line 310
    .line 311
    :cond_8
    if-ne v2, v0, :cond_b

    .line 312
    .line 313
    if-ne v7, v0, :cond_b

    .line 314
    .line 315
    if-ne v12, v0, :cond_b

    .line 316
    .line 317
    const/16 v0, 0x3a

    .line 318
    .line 319
    if-ne v15, v0, :cond_a

    .line 320
    .line 321
    int-to-char v0, v8

    .line 322
    int-to-char v2, v9

    .line 323
    int-to-char v7, v10

    .line 324
    int-to-char v8, v11

    .line 325
    int-to-char v4, v4

    .line 326
    int-to-char v5, v5

    .line 327
    int-to-char v6, v6

    .line 328
    invoke-static {v4, v5, v6}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    .line 329
    .line 330
    .line 331
    move-result v4

    .line 332
    if-lez v4, :cond_9

    .line 333
    .line 334
    div-int/lit8 v5, v4, 0xa

    .line 335
    .line 336
    add-int/lit8 v5, v5, 0x30

    .line 337
    .line 338
    int-to-char v5, v5

    .line 339
    rem-int/lit8 v4, v4, 0xa

    .line 340
    .line 341
    add-int/lit8 v4, v4, 0x30

    .line 342
    .line 343
    int-to-char v6, v4

    .line 344
    int-to-char v1, v1

    .line 345
    int-to-char v9, v14

    .line 346
    int-to-char v10, v13

    .line 347
    int-to-char v3, v3

    .line 348
    move/from16 v4, p0

    .line 349
    .line 350
    int-to-char v11, v4

    .line 351
    move v4, v8

    .line 352
    move/from16 v12, v21

    .line 353
    .line 354
    move v13, v12

    .line 355
    move v14, v13

    .line 356
    move v8, v1

    .line 357
    move v1, v2

    .line 358
    move v2, v7

    .line 359
    move v7, v14

    .line 360
    goto :goto_5

    .line 361
    :cond_9
    return-object v17

    .line 362
    :cond_a
    const/16 v0, 0x20

    .line 363
    .line 364
    :cond_b
    if-ne v2, v0, :cond_c

    .line 365
    .line 366
    if-ne v7, v0, :cond_c

    .line 367
    .line 368
    if-ne v12, v0, :cond_c

    .line 369
    .line 370
    const/16 v0, 0x3a

    .line 371
    .line 372
    if-ne v13, v0, :cond_c

    .line 373
    .line 374
    if-ne v3, v0, :cond_c

    .line 375
    .line 376
    int-to-char v0, v1

    .line 377
    int-to-char v1, v4

    .line 378
    int-to-char v2, v5

    .line 379
    int-to-char v3, v6

    .line 380
    invoke-static {v1, v2, v3}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    if-lez v1, :cond_c

    .line 385
    .line 386
    div-int/lit8 v2, v1, 0xa

    .line 387
    .line 388
    add-int/lit8 v2, v2, 0x30

    .line 389
    .line 390
    int-to-char v5, v2

    .line 391
    rem-int/lit8 v1, v1, 0xa

    .line 392
    .line 393
    add-int/lit8 v1, v1, 0x30

    .line 394
    .line 395
    int-to-char v6, v1

    .line 396
    int-to-char v1, v8

    .line 397
    int-to-char v2, v9

    .line 398
    int-to-char v3, v10

    .line 399
    int-to-char v4, v11

    .line 400
    int-to-char v10, v14

    .line 401
    int-to-char v11, v15

    .line 402
    move/from16 v7, p0

    .line 403
    .line 404
    int-to-char v13, v7

    .line 405
    move v8, v0

    .line 406
    move v0, v1

    .line 407
    move v1, v2

    .line 408
    move v2, v3

    .line 409
    move/from16 v3, v21

    .line 410
    .line 411
    move v7, v3

    .line 412
    move v9, v7

    .line 413
    goto :goto_4

    .line 414
    :goto_5
    if-lt v0, v14, :cond_c

    .line 415
    .line 416
    const/16 v15, 0x39

    .line 417
    .line 418
    if-gt v0, v15, :cond_c

    .line 419
    .line 420
    if-lt v1, v14, :cond_c

    .line 421
    .line 422
    if-gt v1, v15, :cond_c

    .line 423
    .line 424
    if-lt v2, v14, :cond_c

    .line 425
    .line 426
    if-gt v2, v15, :cond_c

    .line 427
    .line 428
    if-lt v4, v14, :cond_c

    .line 429
    .line 430
    if-gt v4, v15, :cond_c

    .line 431
    .line 432
    sub-int/2addr v0, v14

    .line 433
    mul-int/lit16 v0, v0, 0x3e8

    .line 434
    .line 435
    const/16 v15, 0x64

    .line 436
    .line 437
    invoke-static {v1, v14, v15, v0}, Lp/a;->z(IIII)I

    .line 438
    .line 439
    .line 440
    move-result v0

    .line 441
    move/from16 v1, v20

    .line 442
    .line 443
    invoke-static {v2, v14, v1, v0}, Lp/a;->z(IIII)I

    .line 444
    .line 445
    .line 446
    move-result v0

    .line 447
    sub-int/2addr v4, v14

    .line 448
    add-int v18, v4, v0

    .line 449
    .line 450
    if-lt v5, v14, :cond_c

    .line 451
    .line 452
    const/16 v0, 0x39

    .line 453
    .line 454
    if-gt v5, v0, :cond_c

    .line 455
    .line 456
    if-lt v6, v14, :cond_c

    .line 457
    .line 458
    if-gt v6, v0, :cond_c

    .line 459
    .line 460
    sub-int/2addr v5, v14

    .line 461
    mul-int/2addr v5, v1

    .line 462
    sub-int/2addr v6, v14

    .line 463
    add-int v19, v6, v5

    .line 464
    .line 465
    if-lt v7, v14, :cond_c

    .line 466
    .line 467
    if-gt v7, v0, :cond_c

    .line 468
    .line 469
    if-lt v8, v14, :cond_c

    .line 470
    .line 471
    if-gt v8, v0, :cond_c

    .line 472
    .line 473
    sub-int/2addr v7, v14

    .line 474
    mul-int/2addr v7, v1

    .line 475
    sub-int/2addr v8, v14

    .line 476
    add-int v20, v8, v7

    .line 477
    .line 478
    if-lt v9, v14, :cond_c

    .line 479
    .line 480
    if-gt v9, v0, :cond_c

    .line 481
    .line 482
    if-lt v10, v14, :cond_c

    .line 483
    .line 484
    if-gt v10, v0, :cond_c

    .line 485
    .line 486
    sub-int/2addr v9, v14

    .line 487
    mul-int/2addr v9, v1

    .line 488
    sub-int/2addr v10, v14

    .line 489
    add-int v21, v10, v9

    .line 490
    .line 491
    if-lt v3, v14, :cond_c

    .line 492
    .line 493
    if-gt v3, v0, :cond_c

    .line 494
    .line 495
    if-lt v11, v14, :cond_c

    .line 496
    .line 497
    if-gt v11, v0, :cond_c

    .line 498
    .line 499
    sub-int/2addr v3, v14

    .line 500
    mul-int/2addr v3, v1

    .line 501
    sub-int/2addr v11, v14

    .line 502
    add-int v22, v11, v3

    .line 503
    .line 504
    if-lt v12, v14, :cond_c

    .line 505
    .line 506
    if-gt v12, v0, :cond_c

    .line 507
    .line 508
    if-lt v13, v14, :cond_c

    .line 509
    .line 510
    if-gt v13, v0, :cond_c

    .line 511
    .line 512
    sub-int/2addr v12, v14

    .line 513
    mul-int/2addr v12, v1

    .line 514
    sub-int/2addr v13, v14

    .line 515
    add-int v23, v13, v12

    .line 516
    .line 517
    invoke-static/range {v18 .. v23}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    return-object v0

    .line 522
    :cond_c
    return-object v17
.end method

.method public static parseLocalDateTime16([CI)Ljava/time/LocalDateTime;
    .locals 24

    move-object/from16 v0, p0

    add-int/lit8 v1, p1, 0x10

    .line 523
    array-length v2, v0

    const/4 v3, 0x0

    if-le v1, v2, :cond_0

    return-object v3

    .line 524
    :cond_0
    aget-char v1, v0, p1

    add-int/lit8 v2, p1, 0x1

    .line 525
    aget-char v2, v0, v2

    add-int/lit8 v4, p1, 0x2

    .line 526
    aget-char v4, v0, v4

    add-int/lit8 v5, p1, 0x3

    .line 527
    aget-char v5, v0, v5

    add-int/lit8 v6, p1, 0x4

    .line 528
    aget-char v6, v0, v6

    add-int/lit8 v7, p1, 0x5

    .line 529
    aget-char v7, v0, v7

    add-int/lit8 v8, p1, 0x6

    .line 530
    aget-char v8, v0, v8

    add-int/lit8 v9, p1, 0x7

    .line 531
    aget-char v9, v0, v9

    add-int/lit8 v10, p1, 0x8

    .line 532
    aget-char v10, v0, v10

    add-int/lit8 v11, p1, 0x9

    .line 533
    aget-char v11, v0, v11

    add-int/lit8 v12, p1, 0xa

    .line 534
    aget-char v12, v0, v12

    add-int/lit8 v13, p1, 0xb

    .line 535
    aget-char v13, v0, v13

    add-int/lit8 v14, p1, 0xc

    .line 536
    aget-char v14, v0, v14

    add-int/lit8 v15, p1, 0xd

    .line 537
    aget-char v15, v0, v15

    add-int/lit8 v16, p1, 0xe

    move-object/from16 v17, v3

    .line 538
    aget-char v3, v0, v16

    add-int/lit8 v16, p1, 0xf

    .line 539
    aget-char v0, v0, v16

    move/from16 v16, v1

    const/16 v20, 0xa

    const/16 v1, 0x2d

    const/16 v21, 0x30

    if-ne v6, v1, :cond_2

    if-ne v9, v1, :cond_2

    const/16 v1, 0x54

    if-eq v12, v1, :cond_1

    const/16 v1, 0x20

    if-ne v12, v1, :cond_2

    :cond_1
    const/16 v1, 0x3a

    goto :goto_0

    :cond_2
    const/16 v1, 0x54

    goto :goto_2

    :goto_0
    if-ne v15, v1, :cond_2

    move v6, v7

    move v7, v8

    move v8, v10

    move v12, v14

    move/from16 v1, v16

    move/from16 v9, v21

    :goto_1
    move v15, v9

    move v14, v0

    move v0, v3

    move v3, v15

    goto/16 :goto_4

    :goto_2
    if-ne v10, v1, :cond_3

    const/16 v1, 0x5a

    if-ne v0, v1, :cond_3

    move v0, v13

    move/from16 v1, v16

    move v13, v11

    move v11, v9

    move/from16 v9, v21

    goto/16 :goto_4

    :cond_3
    const/16 v1, 0x2d

    if-ne v6, v1, :cond_5

    if-ne v9, v1, :cond_5

    const/16 v1, 0x54

    if-eq v12, v1, :cond_4

    const/16 v1, 0x20

    if-ne v12, v1, :cond_6

    :cond_4
    const/16 v1, 0x3a

    if-ne v14, v1, :cond_5

    if-ne v3, v1, :cond_5

    move v3, v0

    move v6, v7

    move v7, v8

    move v8, v10

    move v12, v13

    move v14, v15

    move/from16 v1, v16

    move/from16 v0, v21

    move v9, v0

    :goto_3
    move v13, v9

    move v15, v13

    goto/16 :goto_4

    :cond_5
    const/16 v1, 0x20

    :cond_6
    if-ne v2, v1, :cond_9

    if-ne v7, v1, :cond_9

    if-ne v12, v1, :cond_9

    const/16 v1, 0x3a

    if-ne v15, v1, :cond_8

    .line 540
    invoke-static {v4, v5, v6}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v1

    if-lez v1, :cond_7

    .line 541
    div-int/lit8 v2, v1, 0xa

    add-int/lit8 v2, v2, 0x30

    int-to-char v6, v2

    .line 542
    rem-int/lit8 v1, v1, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v7, v1

    move v1, v8

    move v2, v9

    move v4, v10

    move v5, v11

    move v12, v14

    move/from16 v11, v16

    move/from16 v8, v21

    move v9, v8

    goto :goto_1

    :cond_7
    return-object v17

    :cond_8
    const/16 v1, 0x20

    :cond_9
    if-ne v2, v1, :cond_a

    if-ne v7, v1, :cond_a

    if-ne v12, v1, :cond_a

    const/16 v1, 0x3a

    if-ne v14, v1, :cond_a

    if-ne v3, v1, :cond_a

    .line 543
    invoke-static {v4, v5, v6}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v1

    if-lez v1, :cond_a

    .line 544
    div-int/lit8 v2, v1, 0xa

    add-int/lit8 v2, v2, 0x30

    int-to-char v6, v2

    .line 545
    rem-int/lit8 v1, v1, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v7, v1

    move v3, v0

    move v1, v8

    move v2, v9

    move v4, v10

    move v5, v11

    move v12, v13

    move v14, v15

    move/from16 v11, v16

    move/from16 v0, v21

    move v8, v0

    move v9, v8

    goto :goto_3

    :goto_4
    if-lt v1, v9, :cond_a

    const/16 v10, 0x39

    if-gt v1, v10, :cond_a

    if-lt v2, v9, :cond_a

    if-gt v2, v10, :cond_a

    if-lt v4, v9, :cond_a

    if-gt v4, v10, :cond_a

    if-lt v5, v9, :cond_a

    if-gt v5, v10, :cond_a

    sub-int/2addr v1, v9

    mul-int/lit16 v1, v1, 0x3e8

    const/16 v10, 0x64

    .line 546
    invoke-static {v2, v9, v10, v1}, Lp/a;->z(IIII)I

    move-result v1

    move/from16 v2, v20

    invoke-static {v4, v9, v2, v1}, Lp/a;->z(IIII)I

    move-result v1

    sub-int/2addr v5, v9

    add-int v18, v5, v1

    if-lt v6, v9, :cond_a

    const/16 v1, 0x39

    if-gt v6, v1, :cond_a

    if-lt v7, v9, :cond_a

    if-gt v7, v1, :cond_a

    sub-int/2addr v6, v9

    mul-int/2addr v6, v2

    sub-int/2addr v7, v9

    add-int v19, v7, v6

    if-lt v8, v9, :cond_a

    if-gt v8, v1, :cond_a

    if-lt v11, v9, :cond_a

    if-gt v11, v1, :cond_a

    sub-int/2addr v8, v9

    mul-int/2addr v8, v2

    sub-int/2addr v11, v9

    add-int v20, v11, v8

    if-lt v13, v9, :cond_a

    if-gt v13, v1, :cond_a

    if-lt v12, v9, :cond_a

    if-gt v12, v1, :cond_a

    sub-int/2addr v13, v9

    mul-int/2addr v13, v2

    sub-int/2addr v12, v9

    add-int v21, v12, v13

    if-lt v0, v9, :cond_a

    if-gt v0, v1, :cond_a

    if-lt v14, v9, :cond_a

    if-gt v14, v1, :cond_a

    sub-int/2addr v0, v9

    mul-int/2addr v0, v2

    sub-int/2addr v14, v9

    add-int v22, v14, v0

    if-lt v15, v9, :cond_a

    if-gt v15, v1, :cond_a

    if-lt v3, v9, :cond_a

    if-gt v3, v1, :cond_a

    sub-int/2addr v15, v9

    mul-int/2addr v15, v2

    sub-int/2addr v3, v9

    add-int v23, v3, v15

    .line 547
    invoke-static/range {v18 .. v23}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    move-result-object v0

    return-object v0

    :cond_a
    return-object v17
.end method

.method public static parseLocalDateTime17([BI)Ljava/time/LocalDateTime;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    add-int/lit8 v2, p1, 0x11

    .line 4
    .line 5
    array-length v3, v0

    .line 6
    const-string v4, "illegal input "

    .line 7
    .line 8
    if-gt v2, v3, :cond_19

    .line 9
    .line 10
    aget-byte v2, v0, p1

    .line 11
    .line 12
    add-int/lit8 v3, p1, 0x1

    .line 13
    .line 14
    aget-byte v3, v0, v3

    .line 15
    .line 16
    add-int/lit8 v6, p1, 0x2

    .line 17
    .line 18
    aget-byte v6, v0, v6

    .line 19
    .line 20
    add-int/lit8 v7, p1, 0x3

    .line 21
    .line 22
    aget-byte v7, v0, v7

    .line 23
    .line 24
    add-int/lit8 v8, p1, 0x4

    .line 25
    .line 26
    aget-byte v8, v0, v8

    .line 27
    .line 28
    add-int/lit8 v9, p1, 0x5

    .line 29
    .line 30
    aget-byte v9, v0, v9

    .line 31
    .line 32
    add-int/lit8 v10, p1, 0x6

    .line 33
    .line 34
    aget-byte v10, v0, v10

    .line 35
    .line 36
    add-int/lit8 v11, p1, 0x7

    .line 37
    .line 38
    aget-byte v11, v0, v11

    .line 39
    .line 40
    add-int/lit8 v12, p1, 0x8

    .line 41
    .line 42
    aget-byte v12, v0, v12

    .line 43
    .line 44
    add-int/lit8 v13, p1, 0x9

    .line 45
    .line 46
    aget-byte v13, v0, v13

    .line 47
    .line 48
    add-int/lit8 v14, p1, 0xa

    .line 49
    .line 50
    aget-byte v14, v0, v14

    .line 51
    .line 52
    add-int/lit8 v15, p1, 0xb

    .line 53
    .line 54
    aget-byte v15, v0, v15

    .line 55
    .line 56
    add-int/lit8 v16, p1, 0xc

    .line 57
    .line 58
    aget-byte v5, v0, v16

    .line 59
    .line 60
    add-int/lit8 v16, p1, 0xd

    .line 61
    .line 62
    move-object/from16 v17, v4

    .line 63
    .line 64
    aget-byte v4, v0, v16

    .line 65
    .line 66
    add-int/lit8 v16, p1, 0xe

    .line 67
    .line 68
    aget-byte v0, p0, v16

    .line 69
    .line 70
    add-int/lit8 v16, p1, 0xf

    .line 71
    .line 72
    aget-byte v1, p0, v16

    .line 73
    .line 74
    add-int/lit8 v16, p1, 0x10

    .line 75
    .line 76
    move/from16 v18, v1

    .line 77
    .line 78
    aget-byte v1, p0, v16

    .line 79
    .line 80
    move/from16 v16, v0

    .line 81
    .line 82
    const/16 v19, 0x64

    .line 83
    .line 84
    const/16 v20, 0xa

    .line 85
    .line 86
    const/16 v21, 0x30

    .line 87
    .line 88
    const/16 v0, 0x2d

    .line 89
    .line 90
    if-ne v8, v0, :cond_1

    .line 91
    .line 92
    if-ne v11, v0, :cond_1

    .line 93
    .line 94
    const/16 v0, 0x54

    .line 95
    .line 96
    if-eq v14, v0, :cond_0

    .line 97
    .line 98
    const/16 v0, 0x20

    .line 99
    .line 100
    if-ne v14, v0, :cond_1

    .line 101
    .line 102
    :cond_0
    const/16 v0, 0x3a

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_1
    move/from16 v0, v16

    .line 106
    .line 107
    move/from16 v16, v1

    .line 108
    .line 109
    const/16 v1, 0x2d

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :goto_0
    if-ne v4, v0, :cond_1

    .line 113
    .line 114
    const/16 v0, 0x5a

    .line 115
    .line 116
    if-ne v1, v0, :cond_1

    .line 117
    .line 118
    int-to-char v0, v2

    .line 119
    int-to-char v1, v3

    .line 120
    int-to-char v2, v6

    .line 121
    int-to-char v3, v7

    .line 122
    int-to-char v4, v9

    .line 123
    int-to-char v6, v10

    .line 124
    int-to-char v7, v12

    .line 125
    int-to-char v8, v13

    .line 126
    int-to-char v9, v15

    .line 127
    int-to-char v5, v5

    .line 128
    move/from16 v10, v16

    .line 129
    .line 130
    int-to-char v10, v10

    .line 131
    move/from16 v11, v18

    .line 132
    .line 133
    int-to-char v11, v11

    .line 134
    move v12, v9

    .line 135
    move v14, v10

    .line 136
    move v15, v11

    .line 137
    move-object/from16 v31, v17

    .line 138
    .line 139
    move/from16 v9, v21

    .line 140
    .line 141
    const/16 v28, 0x0

    .line 142
    .line 143
    move v10, v7

    .line 144
    move v11, v8

    .line 145
    move v8, v5

    .line 146
    move v7, v6

    .line 147
    move v6, v9

    .line 148
    move v5, v2

    .line 149
    :goto_1
    move v2, v6

    .line 150
    goto/16 :goto_9

    .line 151
    .line 152
    :goto_2
    if-ne v8, v1, :cond_3

    .line 153
    .line 154
    if-ne v10, v1, :cond_3

    .line 155
    .line 156
    const/16 v1, 0x20

    .line 157
    .line 158
    if-eq v12, v1, :cond_2

    .line 159
    .line 160
    const/16 v1, 0x54

    .line 161
    .line 162
    if-ne v12, v1, :cond_3

    .line 163
    .line 164
    :cond_2
    const/16 v1, 0x3a

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_3
    move/from16 v1, v16

    .line 168
    .line 169
    move/from16 v16, v4

    .line 170
    .line 171
    move v4, v1

    .line 172
    move/from16 v1, v18

    .line 173
    .line 174
    move/from16 v18, v5

    .line 175
    .line 176
    goto :goto_4

    .line 177
    :goto_3
    if-ne v15, v1, :cond_3

    .line 178
    .line 179
    if-ne v0, v1, :cond_3

    .line 180
    .line 181
    int-to-char v0, v2

    .line 182
    int-to-char v1, v3

    .line 183
    int-to-char v2, v6

    .line 184
    int-to-char v3, v7

    .line 185
    int-to-char v6, v9

    .line 186
    int-to-char v8, v11

    .line 187
    int-to-char v9, v13

    .line 188
    int-to-char v7, v14

    .line 189
    int-to-char v10, v5

    .line 190
    int-to-char v11, v4

    .line 191
    move/from16 v4, v18

    .line 192
    .line 193
    int-to-char v4, v4

    .line 194
    move/from16 v5, v16

    .line 195
    .line 196
    int-to-char v5, v5

    .line 197
    move v12, v9

    .line 198
    move v14, v10

    .line 199
    move v15, v11

    .line 200
    move-object/from16 v31, v17

    .line 201
    .line 202
    move/from16 v10, v21

    .line 203
    .line 204
    const/16 v28, 0x0

    .line 205
    .line 206
    move v9, v5

    .line 207
    move v11, v8

    .line 208
    move v5, v2

    .line 209
    move v8, v7

    .line 210
    move v2, v10

    .line 211
    move v7, v6

    .line 212
    move v6, v4

    .line 213
    move v4, v2

    .line 214
    goto/16 :goto_9

    .line 215
    .line 216
    :goto_4
    const/16 v5, -0x1b

    .line 217
    .line 218
    if-ne v8, v5, :cond_4

    .line 219
    .line 220
    const/16 v5, -0x47

    .line 221
    .line 222
    if-ne v9, v5, :cond_4

    .line 223
    .line 224
    const/16 v5, -0x4c

    .line 225
    .line 226
    if-ne v10, v5, :cond_4

    .line 227
    .line 228
    const/16 v5, -0x1a

    .line 229
    .line 230
    if-ne v13, v5, :cond_4

    .line 231
    .line 232
    const/16 v5, -0x64

    .line 233
    .line 234
    if-ne v14, v5, :cond_4

    .line 235
    .line 236
    const/16 v5, -0x78

    .line 237
    .line 238
    if-ne v15, v5, :cond_4

    .line 239
    .line 240
    const/16 v5, -0x1a

    .line 241
    .line 242
    if-ne v0, v5, :cond_4

    .line 243
    .line 244
    const/16 v5, -0x69

    .line 245
    .line 246
    if-ne v1, v5, :cond_4

    .line 247
    .line 248
    const/16 v5, -0x5b

    .line 249
    .line 250
    if-ne v4, v5, :cond_4

    .line 251
    .line 252
    int-to-char v0, v2

    .line 253
    int-to-char v1, v3

    .line 254
    int-to-char v2, v6

    .line 255
    int-to-char v3, v7

    .line 256
    int-to-char v4, v11

    .line 257
    int-to-char v6, v12

    .line 258
    move/from16 v5, v18

    .line 259
    .line 260
    int-to-char v7, v5

    .line 261
    move/from16 v5, v16

    .line 262
    .line 263
    int-to-char v8, v5

    .line 264
    move v5, v2

    .line 265
    move v10, v7

    .line 266
    move v11, v8

    .line 267
    move-object/from16 v31, v17

    .line 268
    .line 269
    move/from16 v2, v21

    .line 270
    .line 271
    move v8, v2

    .line 272
    move v9, v8

    .line 273
    move v12, v9

    .line 274
    move v14, v12

    .line 275
    move v15, v14

    .line 276
    const/16 v28, 0x0

    .line 277
    .line 278
    move v7, v6

    .line 279
    move v6, v15

    .line 280
    goto/16 :goto_9

    .line 281
    .line 282
    :cond_4
    move/from16 v5, v16

    .line 283
    .line 284
    move/from16 v16, v4

    .line 285
    .line 286
    move v4, v5

    .line 287
    move/from16 v5, v18

    .line 288
    .line 289
    move/from16 v18, v1

    .line 290
    .line 291
    const/16 v1, 0x20

    .line 292
    .line 293
    if-ne v6, v1, :cond_7

    .line 294
    .line 295
    if-ne v10, v1, :cond_7

    .line 296
    .line 297
    if-ne v15, v1, :cond_7

    .line 298
    .line 299
    const/16 v1, 0x3a

    .line 300
    .line 301
    if-ne v0, v1, :cond_6

    .line 302
    .line 303
    int-to-char v0, v11

    .line 304
    int-to-char v1, v12

    .line 305
    int-to-char v6, v13

    .line 306
    int-to-char v10, v14

    .line 307
    int-to-char v7, v7

    .line 308
    int-to-char v8, v8

    .line 309
    int-to-char v9, v9

    .line 310
    invoke-static {v7, v8, v9}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    .line 311
    .line 312
    .line 313
    move-result v7

    .line 314
    if-lez v7, :cond_5

    .line 315
    .line 316
    div-int/lit8 v8, v7, 0xa

    .line 317
    .line 318
    add-int/lit8 v8, v8, 0x30

    .line 319
    .line 320
    int-to-char v8, v8

    .line 321
    rem-int/lit8 v7, v7, 0xa

    .line 322
    .line 323
    add-int/lit8 v7, v7, 0x30

    .line 324
    .line 325
    int-to-char v7, v7

    .line 326
    int-to-char v2, v2

    .line 327
    int-to-char v3, v3

    .line 328
    int-to-char v9, v5

    .line 329
    int-to-char v5, v4

    .line 330
    move/from16 v4, v18

    .line 331
    .line 332
    int-to-char v4, v4

    .line 333
    move/from16 v11, v16

    .line 334
    .line 335
    int-to-char v11, v11

    .line 336
    move v14, v4

    .line 337
    move v4, v8

    .line 338
    move v12, v9

    .line 339
    move v15, v11

    .line 340
    move-object/from16 v31, v17

    .line 341
    .line 342
    move/from16 v9, v21

    .line 343
    .line 344
    const/16 v28, 0x0

    .line 345
    .line 346
    move v11, v3

    .line 347
    move v8, v5

    .line 348
    move v5, v6

    .line 349
    move v3, v10

    .line 350
    move v6, v9

    .line 351
    move v10, v2

    .line 352
    goto/16 :goto_1

    .line 353
    .line 354
    :cond_5
    new-instance v0, Ljava/lang/String;

    .line 355
    .line 356
    const/16 v3, 0x11

    .line 357
    .line 358
    move-object/from16 v1, p0

    .line 359
    .line 360
    move/from16 v2, p1

    .line 361
    .line 362
    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([BII)V

    .line 363
    .line 364
    .line 365
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 366
    .line 367
    move-object/from16 v2, v17

    .line 368
    .line 369
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    const/4 v3, 0x0

    .line 374
    invoke-direct {v1, v2, v0, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 375
    .line 376
    .line 377
    throw v1

    .line 378
    :cond_6
    move/from16 v22, v16

    .line 379
    .line 380
    move-object/from16 v23, v17

    .line 381
    .line 382
    const/16 v1, 0x20

    .line 383
    .line 384
    goto :goto_5

    .line 385
    :cond_7
    move/from16 v22, v16

    .line 386
    .line 387
    move-object/from16 v23, v17

    .line 388
    .line 389
    :goto_5
    if-ne v3, v1, :cond_9

    .line 390
    .line 391
    if-ne v9, v1, :cond_9

    .line 392
    .line 393
    if-ne v14, v1, :cond_9

    .line 394
    .line 395
    const/16 v1, 0x3a

    .line 396
    .line 397
    if-ne v5, v1, :cond_9

    .line 398
    .line 399
    if-ne v0, v1, :cond_9

    .line 400
    .line 401
    int-to-char v0, v2

    .line 402
    int-to-char v1, v6

    .line 403
    int-to-char v2, v7

    .line 404
    int-to-char v3, v8

    .line 405
    invoke-static {v1, v2, v3}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    .line 406
    .line 407
    .line 408
    move-result v1

    .line 409
    if-lez v1, :cond_8

    .line 410
    .line 411
    div-int/lit8 v2, v1, 0xa

    .line 412
    .line 413
    add-int/lit8 v2, v2, 0x30

    .line 414
    .line 415
    int-to-char v2, v2

    .line 416
    rem-int/lit8 v1, v1, 0xa

    .line 417
    .line 418
    add-int/lit8 v1, v1, 0x30

    .line 419
    .line 420
    int-to-char v6, v1

    .line 421
    int-to-char v1, v10

    .line 422
    int-to-char v3, v11

    .line 423
    int-to-char v5, v12

    .line 424
    int-to-char v7, v13

    .line 425
    int-to-char v8, v15

    .line 426
    int-to-char v11, v4

    .line 427
    move/from16 v4, v18

    .line 428
    .line 429
    int-to-char v4, v4

    .line 430
    move/from16 v9, v22

    .line 431
    .line 432
    int-to-char v9, v9

    .line 433
    move v15, v11

    .line 434
    move/from16 v10, v21

    .line 435
    .line 436
    move v12, v10

    .line 437
    move v14, v12

    .line 438
    move-object/from16 v31, v23

    .line 439
    .line 440
    const/16 v28, 0x0

    .line 441
    .line 442
    move v11, v0

    .line 443
    move v0, v1

    .line 444
    move v1, v3

    .line 445
    move v3, v7

    .line 446
    move v7, v6

    .line 447
    move v6, v4

    .line 448
    move v4, v2

    .line 449
    move v2, v14

    .line 450
    goto/16 :goto_9

    .line 451
    .line 452
    :cond_8
    new-instance v0, Ljava/lang/String;

    .line 453
    .line 454
    const/16 v3, 0x11

    .line 455
    .line 456
    move-object/from16 v1, p0

    .line 457
    .line 458
    move/from16 v2, p1

    .line 459
    .line 460
    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([BII)V

    .line 461
    .line 462
    .line 463
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 464
    .line 465
    move-object/from16 v2, v23

    .line 466
    .line 467
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v2

    .line 471
    const/4 v3, 0x0

    .line 472
    invoke-direct {v1, v2, v0, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 473
    .line 474
    .line 475
    throw v1

    .line 476
    :cond_9
    move/from16 v1, v18

    .line 477
    .line 478
    move/from16 v24, v22

    .line 479
    .line 480
    move-object/from16 v25, v23

    .line 481
    .line 482
    move/from16 v16, v0

    .line 483
    .line 484
    const/16 v0, 0x20

    .line 485
    .line 486
    if-ne v3, v0, :cond_c

    .line 487
    .line 488
    if-ne v9, v0, :cond_c

    .line 489
    .line 490
    if-ne v14, v0, :cond_c

    .line 491
    .line 492
    const/16 v0, 0x3a

    .line 493
    .line 494
    if-ne v5, v0, :cond_b

    .line 495
    .line 496
    if-ne v1, v0, :cond_b

    .line 497
    .line 498
    int-to-char v0, v2

    .line 499
    int-to-char v1, v6

    .line 500
    int-to-char v2, v7

    .line 501
    int-to-char v3, v8

    .line 502
    invoke-static {v1, v2, v3}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    .line 503
    .line 504
    .line 505
    move-result v1

    .line 506
    if-lez v1, :cond_a

    .line 507
    .line 508
    div-int/lit8 v2, v1, 0xa

    .line 509
    .line 510
    add-int/lit8 v2, v2, 0x30

    .line 511
    .line 512
    int-to-char v2, v2

    .line 513
    rem-int/lit8 v1, v1, 0xa

    .line 514
    .line 515
    add-int/lit8 v1, v1, 0x30

    .line 516
    .line 517
    int-to-char v6, v1

    .line 518
    int-to-char v1, v10

    .line 519
    int-to-char v3, v11

    .line 520
    int-to-char v5, v12

    .line 521
    int-to-char v7, v13

    .line 522
    int-to-char v8, v15

    .line 523
    int-to-char v10, v4

    .line 524
    move/from16 v4, v16

    .line 525
    .line 526
    int-to-char v11, v4

    .line 527
    move/from16 v4, v24

    .line 528
    .line 529
    int-to-char v4, v4

    .line 530
    move v9, v4

    .line 531
    move v14, v10

    .line 532
    move v15, v11

    .line 533
    move/from16 v10, v21

    .line 534
    .line 535
    move v12, v10

    .line 536
    move-object/from16 v31, v25

    .line 537
    .line 538
    const/16 v28, 0x0

    .line 539
    .line 540
    move v11, v0

    .line 541
    move v0, v1

    .line 542
    move v4, v2

    .line 543
    move v1, v3

    .line 544
    move v3, v7

    .line 545
    move v2, v12

    .line 546
    :goto_6
    move v7, v6

    .line 547
    move v6, v2

    .line 548
    goto/16 :goto_9

    .line 549
    .line 550
    :cond_a
    new-instance v0, Ljava/lang/String;

    .line 551
    .line 552
    const/16 v3, 0x11

    .line 553
    .line 554
    move-object/from16 v1, p0

    .line 555
    .line 556
    move/from16 v2, p1

    .line 557
    .line 558
    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([BII)V

    .line 559
    .line 560
    .line 561
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 562
    .line 563
    move-object/from16 v2, v25

    .line 564
    .line 565
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    const/4 v3, 0x0

    .line 570
    invoke-direct {v1, v2, v0, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 571
    .line 572
    .line 573
    throw v1

    .line 574
    :cond_b
    move/from16 v26, v24

    .line 575
    .line 576
    move-object/from16 v27, v25

    .line 577
    .line 578
    const/16 v0, 0x20

    .line 579
    .line 580
    goto :goto_7

    .line 581
    :cond_c
    move/from16 v26, v24

    .line 582
    .line 583
    move-object/from16 v27, v25

    .line 584
    .line 585
    :goto_7
    if-ne v3, v0, :cond_f

    .line 586
    .line 587
    if-ne v9, v0, :cond_f

    .line 588
    .line 589
    if-ne v14, v0, :cond_f

    .line 590
    .line 591
    const/16 v0, 0x3a

    .line 592
    .line 593
    if-ne v4, v0, :cond_e

    .line 594
    .line 595
    if-ne v1, v0, :cond_e

    .line 596
    .line 597
    int-to-char v0, v2

    .line 598
    int-to-char v1, v6

    .line 599
    int-to-char v2, v7

    .line 600
    int-to-char v3, v8

    .line 601
    invoke-static {v1, v2, v3}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    .line 602
    .line 603
    .line 604
    move-result v1

    .line 605
    if-lez v1, :cond_d

    .line 606
    .line 607
    div-int/lit8 v2, v1, 0xa

    .line 608
    .line 609
    add-int/lit8 v2, v2, 0x30

    .line 610
    .line 611
    int-to-char v4, v2

    .line 612
    rem-int/lit8 v1, v1, 0xa

    .line 613
    .line 614
    add-int/lit8 v1, v1, 0x30

    .line 615
    .line 616
    int-to-char v6, v1

    .line 617
    int-to-char v1, v10

    .line 618
    int-to-char v2, v11

    .line 619
    int-to-char v3, v12

    .line 620
    int-to-char v7, v13

    .line 621
    int-to-char v9, v15

    .line 622
    int-to-char v5, v5

    .line 623
    move/from16 v8, v16

    .line 624
    .line 625
    int-to-char v11, v8

    .line 626
    move/from16 v8, v26

    .line 627
    .line 628
    int-to-char v8, v8

    .line 629
    move v12, v9

    .line 630
    move v15, v11

    .line 631
    move/from16 v10, v21

    .line 632
    .line 633
    move v14, v10

    .line 634
    move-object/from16 v31, v27

    .line 635
    .line 636
    const/16 v28, 0x0

    .line 637
    .line 638
    move v11, v0

    .line 639
    move v0, v1

    .line 640
    move v1, v2

    .line 641
    move v9, v8

    .line 642
    move v2, v14

    .line 643
    move v8, v5

    .line 644
    move v5, v3

    .line 645
    move v3, v7

    .line 646
    goto :goto_6

    .line 647
    :cond_d
    new-instance v0, Ljava/lang/String;

    .line 648
    .line 649
    const/16 v3, 0x11

    .line 650
    .line 651
    move-object/from16 v1, p0

    .line 652
    .line 653
    move/from16 v2, p1

    .line 654
    .line 655
    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([BII)V

    .line 656
    .line 657
    .line 658
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 659
    .line 660
    move-object/from16 v2, v27

    .line 661
    .line 662
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object v2

    .line 666
    const/4 v3, 0x0

    .line 667
    invoke-direct {v1, v2, v0, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 668
    .line 669
    .line 670
    throw v1

    .line 671
    :cond_e
    move/from16 v28, v26

    .line 672
    .line 673
    move-object/from16 v29, v27

    .line 674
    .line 675
    const/16 v0, 0x20

    .line 676
    .line 677
    goto :goto_8

    .line 678
    :cond_f
    move/from16 v28, v26

    .line 679
    .line 680
    move-object/from16 v29, v27

    .line 681
    .line 682
    :goto_8
    if-ne v6, v0, :cond_11

    .line 683
    .line 684
    if-ne v10, v0, :cond_11

    .line 685
    .line 686
    if-ne v15, v0, :cond_11

    .line 687
    .line 688
    const/16 v0, 0x3a

    .line 689
    .line 690
    if-ne v4, v0, :cond_11

    .line 691
    .line 692
    if-ne v1, v0, :cond_11

    .line 693
    .line 694
    int-to-char v0, v2

    .line 695
    int-to-char v1, v3

    .line 696
    int-to-char v2, v7

    .line 697
    int-to-char v3, v8

    .line 698
    int-to-char v4, v9

    .line 699
    invoke-static {v2, v3, v4}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    .line 700
    .line 701
    .line 702
    move-result v2

    .line 703
    if-lez v2, :cond_10

    .line 704
    .line 705
    div-int/lit8 v3, v2, 0xa

    .line 706
    .line 707
    add-int/lit8 v3, v3, 0x30

    .line 708
    .line 709
    int-to-char v4, v3

    .line 710
    rem-int/lit8 v2, v2, 0xa

    .line 711
    .line 712
    add-int/lit8 v2, v2, 0x30

    .line 713
    .line 714
    int-to-char v6, v2

    .line 715
    int-to-char v2, v11

    .line 716
    int-to-char v3, v12

    .line 717
    int-to-char v7, v13

    .line 718
    int-to-char v8, v14

    .line 719
    int-to-char v5, v5

    .line 720
    move/from16 v9, v16

    .line 721
    .line 722
    int-to-char v11, v9

    .line 723
    move/from16 v9, v28

    .line 724
    .line 725
    int-to-char v9, v9

    .line 726
    move v10, v0

    .line 727
    move v0, v2

    .line 728
    move v15, v11

    .line 729
    move/from16 v2, v21

    .line 730
    .line 731
    move v12, v2

    .line 732
    move v14, v12

    .line 733
    move-object/from16 v31, v29

    .line 734
    .line 735
    const/16 v28, 0x0

    .line 736
    .line 737
    move v11, v1

    .line 738
    move v1, v3

    .line 739
    move v3, v8

    .line 740
    move v8, v5

    .line 741
    move v5, v7

    .line 742
    move v7, v6

    .line 743
    move v6, v14

    .line 744
    goto/16 :goto_9

    .line 745
    .line 746
    :cond_10
    new-instance v0, Ljava/lang/String;

    .line 747
    .line 748
    const/16 v3, 0x11

    .line 749
    .line 750
    move-object/from16 v1, p0

    .line 751
    .line 752
    move/from16 v2, p1

    .line 753
    .line 754
    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([BII)V

    .line 755
    .line 756
    .line 757
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 758
    .line 759
    move-object/from16 v2, v29

    .line 760
    .line 761
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 762
    .line 763
    .line 764
    move-result-object v2

    .line 765
    const/4 v3, 0x0

    .line 766
    invoke-direct {v1, v2, v0, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 767
    .line 768
    .line 769
    throw v1

    .line 770
    :cond_11
    move/from16 v0, v16

    .line 771
    .line 772
    move/from16 v30, v28

    .line 773
    .line 774
    move-object/from16 v31, v29

    .line 775
    .line 776
    int-to-char v2, v2

    .line 777
    int-to-char v3, v3

    .line 778
    int-to-char v6, v6

    .line 779
    int-to-char v7, v7

    .line 780
    int-to-char v8, v8

    .line 781
    int-to-char v9, v9

    .line 782
    int-to-char v10, v10

    .line 783
    int-to-char v11, v11

    .line 784
    int-to-char v12, v12

    .line 785
    int-to-char v13, v13

    .line 786
    int-to-char v14, v14

    .line 787
    int-to-char v15, v15

    .line 788
    int-to-char v5, v5

    .line 789
    int-to-char v4, v4

    .line 790
    move/from16 v16, v2

    .line 791
    .line 792
    move/from16 v2, v21

    .line 793
    .line 794
    if-lt v0, v2, :cond_18

    .line 795
    .line 796
    move/from16 v17, v3

    .line 797
    .line 798
    const/16 v3, 0x39

    .line 799
    .line 800
    if-gt v0, v3, :cond_18

    .line 801
    .line 802
    if-lt v1, v2, :cond_18

    .line 803
    .line 804
    if-gt v1, v3, :cond_18

    .line 805
    .line 806
    move/from16 v18, v0

    .line 807
    .line 808
    move/from16 v0, v30

    .line 809
    .line 810
    if-lt v0, v2, :cond_18

    .line 811
    .line 812
    if-gt v0, v3, :cond_18

    .line 813
    .line 814
    add-int/lit8 v18, v18, -0x30

    .line 815
    .line 816
    mul-int/lit8 v3, v18, 0x64

    .line 817
    .line 818
    move/from16 v22, v0

    .line 819
    .line 820
    move/from16 v0, v20

    .line 821
    .line 822
    invoke-static {v1, v2, v0, v3}, Lp/a;->z(IIII)I

    .line 823
    .line 824
    .line 825
    move-result v1

    .line 826
    add-int/lit8 v0, v22, -0x30

    .line 827
    .line 828
    add-int/2addr v0, v1

    .line 829
    const v1, 0xf4240

    .line 830
    .line 831
    .line 832
    mul-int/2addr v0, v1

    .line 833
    move v1, v6

    .line 834
    move v6, v5

    .line 835
    move v5, v1

    .line 836
    move/from16 v28, v0

    .line 837
    .line 838
    move v3, v7

    .line 839
    move v7, v9

    .line 840
    move/from16 v0, v16

    .line 841
    .line 842
    move/from16 v1, v17

    .line 843
    .line 844
    move v9, v4

    .line 845
    move v4, v8

    .line 846
    move v8, v13

    .line 847
    :goto_9
    if-lt v0, v2, :cond_17

    .line 848
    .line 849
    const/16 v13, 0x39

    .line 850
    .line 851
    if-gt v0, v13, :cond_17

    .line 852
    .line 853
    if-lt v1, v2, :cond_17

    .line 854
    .line 855
    if-gt v1, v13, :cond_17

    .line 856
    .line 857
    if-lt v5, v2, :cond_17

    .line 858
    .line 859
    if-gt v5, v13, :cond_17

    .line 860
    .line 861
    if-lt v3, v2, :cond_17

    .line 862
    .line 863
    if-gt v3, v13, :cond_17

    .line 864
    .line 865
    sub-int/2addr v0, v2

    .line 866
    mul-int/lit16 v0, v0, 0x3e8

    .line 867
    .line 868
    move/from16 v13, v19

    .line 869
    .line 870
    invoke-static {v1, v2, v13, v0}, Lp/a;->z(IIII)I

    .line 871
    .line 872
    .line 873
    move-result v0

    .line 874
    const/16 v1, 0xa

    .line 875
    .line 876
    invoke-static {v5, v2, v1, v0}, Lp/a;->z(IIII)I

    .line 877
    .line 878
    .line 879
    move-result v0

    .line 880
    sub-int/2addr v3, v2

    .line 881
    add-int v22, v3, v0

    .line 882
    .line 883
    if-lt v4, v2, :cond_16

    .line 884
    .line 885
    const/16 v3, 0x39

    .line 886
    .line 887
    if-gt v4, v3, :cond_16

    .line 888
    .line 889
    if-lt v7, v2, :cond_16

    .line 890
    .line 891
    if-gt v7, v3, :cond_16

    .line 892
    .line 893
    sub-int/2addr v4, v2

    .line 894
    mul-int/2addr v4, v1

    .line 895
    sub-int/2addr v7, v2

    .line 896
    add-int v23, v7, v4

    .line 897
    .line 898
    if-lt v10, v2, :cond_15

    .line 899
    .line 900
    if-gt v10, v3, :cond_15

    .line 901
    .line 902
    if-lt v11, v2, :cond_15

    .line 903
    .line 904
    if-gt v11, v3, :cond_15

    .line 905
    .line 906
    sub-int/2addr v10, v2

    .line 907
    mul-int/2addr v10, v1

    .line 908
    sub-int/2addr v11, v2

    .line 909
    add-int v24, v11, v10

    .line 910
    .line 911
    if-lt v12, v2, :cond_14

    .line 912
    .line 913
    if-gt v12, v3, :cond_14

    .line 914
    .line 915
    if-lt v8, v2, :cond_14

    .line 916
    .line 917
    if-gt v8, v3, :cond_14

    .line 918
    .line 919
    sub-int/2addr v12, v2

    .line 920
    mul-int/2addr v12, v1

    .line 921
    sub-int/2addr v8, v2

    .line 922
    add-int v25, v8, v12

    .line 923
    .line 924
    if-lt v14, v2, :cond_13

    .line 925
    .line 926
    if-gt v14, v3, :cond_13

    .line 927
    .line 928
    if-lt v15, v2, :cond_13

    .line 929
    .line 930
    if-gt v15, v3, :cond_13

    .line 931
    .line 932
    sub-int/2addr v14, v2

    .line 933
    mul-int/2addr v14, v1

    .line 934
    sub-int/2addr v15, v2

    .line 935
    add-int v26, v15, v14

    .line 936
    .line 937
    if-lt v6, v2, :cond_12

    .line 938
    .line 939
    if-gt v6, v3, :cond_12

    .line 940
    .line 941
    if-lt v9, v2, :cond_12

    .line 942
    .line 943
    if-gt v9, v3, :cond_12

    .line 944
    .line 945
    sub-int/2addr v6, v2

    .line 946
    mul-int/2addr v6, v1

    .line 947
    sub-int/2addr v9, v2

    .line 948
    add-int v27, v9, v6

    .line 949
    .line 950
    invoke-static/range {v22 .. v28}, Ljava/time/LocalDateTime;->of(IIIIIII)Ljava/time/LocalDateTime;

    .line 951
    .line 952
    .line 953
    move-result-object v0

    .line 954
    return-object v0

    .line 955
    :cond_12
    new-instance v0, Ljava/lang/String;

    .line 956
    .line 957
    const/16 v3, 0x11

    .line 958
    .line 959
    move-object/from16 v1, p0

    .line 960
    .line 961
    move/from16 v2, p1

    .line 962
    .line 963
    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([BII)V

    .line 964
    .line 965
    .line 966
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 967
    .line 968
    move-object/from16 v4, v31

    .line 969
    .line 970
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 971
    .line 972
    .line 973
    move-result-object v2

    .line 974
    const/4 v5, 0x0

    .line 975
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 976
    .line 977
    .line 978
    throw v1

    .line 979
    :cond_13
    move-object/from16 v1, p0

    .line 980
    .line 981
    move/from16 v2, p1

    .line 982
    .line 983
    move-object/from16 v4, v31

    .line 984
    .line 985
    const/16 v3, 0x11

    .line 986
    .line 987
    const/4 v5, 0x0

    .line 988
    new-instance v0, Ljava/lang/String;

    .line 989
    .line 990
    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([BII)V

    .line 991
    .line 992
    .line 993
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 994
    .line 995
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 996
    .line 997
    .line 998
    move-result-object v2

    .line 999
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 1000
    .line 1001
    .line 1002
    throw v1

    .line 1003
    :cond_14
    move-object/from16 v1, p0

    .line 1004
    .line 1005
    move/from16 v2, p1

    .line 1006
    .line 1007
    move-object/from16 v4, v31

    .line 1008
    .line 1009
    const/16 v3, 0x11

    .line 1010
    .line 1011
    const/4 v5, 0x0

    .line 1012
    new-instance v0, Ljava/lang/String;

    .line 1013
    .line 1014
    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([BII)V

    .line 1015
    .line 1016
    .line 1017
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 1018
    .line 1019
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v2

    .line 1023
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 1024
    .line 1025
    .line 1026
    throw v1

    .line 1027
    :cond_15
    move-object/from16 v1, p0

    .line 1028
    .line 1029
    move/from16 v2, p1

    .line 1030
    .line 1031
    move-object/from16 v4, v31

    .line 1032
    .line 1033
    const/16 v3, 0x11

    .line 1034
    .line 1035
    const/4 v5, 0x0

    .line 1036
    new-instance v0, Ljava/lang/String;

    .line 1037
    .line 1038
    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([BII)V

    .line 1039
    .line 1040
    .line 1041
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 1042
    .line 1043
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v2

    .line 1047
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 1048
    .line 1049
    .line 1050
    throw v1

    .line 1051
    :cond_16
    move-object/from16 v1, p0

    .line 1052
    .line 1053
    move/from16 v2, p1

    .line 1054
    .line 1055
    move-object/from16 v4, v31

    .line 1056
    .line 1057
    const/16 v3, 0x11

    .line 1058
    .line 1059
    const/4 v5, 0x0

    .line 1060
    new-instance v0, Ljava/lang/String;

    .line 1061
    .line 1062
    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([BII)V

    .line 1063
    .line 1064
    .line 1065
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 1066
    .line 1067
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v2

    .line 1071
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 1072
    .line 1073
    .line 1074
    throw v1

    .line 1075
    :cond_17
    move-object/from16 v1, p0

    .line 1076
    .line 1077
    move/from16 v2, p1

    .line 1078
    .line 1079
    move-object/from16 v4, v31

    .line 1080
    .line 1081
    new-instance v0, Ljava/lang/String;

    .line 1082
    .line 1083
    const/16 v3, 0x11

    .line 1084
    .line 1085
    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([BII)V

    .line 1086
    .line 1087
    .line 1088
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 1089
    .line 1090
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v2

    .line 1094
    const/4 v3, 0x0

    .line 1095
    invoke-direct {v1, v2, v0, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 1096
    .line 1097
    .line 1098
    throw v1

    .line 1099
    :cond_18
    const/4 v0, 0x0

    .line 1100
    return-object v0

    .line 1101
    :cond_19
    move/from16 v2, p1

    .line 1102
    .line 1103
    move-object v1, v0

    .line 1104
    new-instance v0, Ljava/lang/String;

    .line 1105
    .line 1106
    array-length v3, v1

    .line 1107
    sub-int/2addr v3, v2

    .line 1108
    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([BII)V

    .line 1109
    .line 1110
    .line 1111
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 1112
    .line 1113
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v2

    .line 1117
    const/4 v3, 0x0

    .line 1118
    invoke-direct {v1, v2, v0, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 1119
    .line 1120
    .line 1121
    throw v1
.end method

.method public static parseLocalDateTime17([CI)Ljava/time/LocalDateTime;
    .locals 28

    move-object/from16 v0, p0

    move/from16 v1, p1

    add-int/lit8 v2, v1, 0x11

    .line 1122
    array-length v3, v0

    if-gt v2, v3, :cond_14

    .line 1123
    aget-char v2, v0, v1

    add-int/lit8 v3, v1, 0x1

    .line 1124
    aget-char v3, v0, v3

    add-int/lit8 v5, v1, 0x2

    .line 1125
    aget-char v5, v0, v5

    add-int/lit8 v6, v1, 0x3

    .line 1126
    aget-char v6, v0, v6

    add-int/lit8 v7, v1, 0x4

    .line 1127
    aget-char v7, v0, v7

    add-int/lit8 v8, v1, 0x5

    .line 1128
    aget-char v8, v0, v8

    add-int/lit8 v9, v1, 0x6

    .line 1129
    aget-char v9, v0, v9

    add-int/lit8 v10, v1, 0x7

    .line 1130
    aget-char v10, v0, v10

    add-int/lit8 v11, v1, 0x8

    .line 1131
    aget-char v11, v0, v11

    add-int/lit8 v12, v1, 0x9

    .line 1132
    aget-char v12, v0, v12

    add-int/lit8 v13, v1, 0xa

    .line 1133
    aget-char v13, v0, v13

    add-int/lit8 v14, v1, 0xb

    .line 1134
    aget-char v14, v0, v14

    add-int/lit8 v15, v1, 0xc

    .line 1135
    aget-char v15, v0, v15

    add-int/lit8 v16, v1, 0xd

    .line 1136
    aget-char v4, v0, v16

    add-int/lit8 v16, v1, 0xe

    move/from16 v17, v2

    .line 1137
    aget-char v2, v0, v16

    add-int/lit8 v16, v1, 0xf

    move/from16 v18, v12

    .line 1138
    aget-char v12, v0, v16

    add-int/lit8 v1, v1, 0x10

    .line 1139
    aget-char v0, v0, v1

    const/16 p0, 0x64

    const/16 v16, 0x0

    const/16 v20, 0xa

    const/16 v1, 0x2d

    const/16 v21, 0x30

    if-ne v7, v1, :cond_2

    if-ne v10, v1, :cond_2

    const/16 v1, 0x54

    if-eq v13, v1, :cond_0

    const/16 v1, 0x20

    if-ne v13, v1, :cond_1

    :cond_0
    const/16 v1, 0x3a

    goto :goto_0

    :cond_1
    const/16 v1, 0x2d

    goto :goto_1

    :goto_0
    if-ne v4, v1, :cond_1

    const/16 v1, 0x5a

    if-ne v0, v1, :cond_1

    move v13, v2

    move v10, v3

    move v7, v8

    move v8, v9

    move v9, v11

    move v11, v14

    move/from16 v2, v17

    move/from16 v3, v18

    move/from16 v1, v21

    move v4, v1

    const/16 v27, 0x0

    move v14, v12

    move v12, v15

    move v15, v4

    goto/16 :goto_6

    :cond_2
    :goto_1
    if-ne v7, v1, :cond_4

    if-ne v9, v1, :cond_4

    const/16 v1, 0x20

    if-eq v11, v1, :cond_3

    const/16 v1, 0x54

    if-ne v11, v1, :cond_4

    :cond_3
    const/16 v1, 0x3a

    goto :goto_2

    :cond_4
    const/16 v1, 0x20

    goto :goto_4

    :goto_2
    if-ne v14, v1, :cond_4

    if-ne v2, v1, :cond_4

    move v1, v10

    move v10, v3

    move v3, v1

    move v1, v15

    move v15, v12

    move v12, v13

    move v13, v1

    move v14, v4

    move/from16 v2, v17

    move/from16 v11, v18

    move/from16 v1, v21

    move v7, v1

    move v9, v7

    const/16 v27, 0x0

    :goto_3
    move v4, v0

    goto/16 :goto_6

    :goto_4
    if-ne v5, v1, :cond_7

    if-ne v9, v1, :cond_7

    if-ne v14, v1, :cond_7

    const/16 v1, 0x3a

    if-ne v2, v1, :cond_6

    .line 1140
    invoke-static {v6, v7, v8}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v1

    if-lez v1, :cond_5

    .line 1141
    div-int/lit8 v2, v1, 0xa

    add-int/lit8 v2, v2, 0x30

    int-to-char v7, v2

    .line 1142
    rem-int/lit8 v1, v1, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v8, v1

    move v14, v0

    move v2, v10

    move v10, v11

    move v6, v13

    move v11, v15

    move/from16 v9, v17

    move/from16 v5, v18

    move/from16 v1, v21

    move v15, v1

    const/16 v27, 0x0

    move v13, v12

    move v12, v4

    move v4, v15

    goto/16 :goto_6

    :cond_5
    return-object v16

    :cond_6
    const/16 v1, 0x20

    :cond_7
    if-ne v3, v1, :cond_a

    if-ne v8, v1, :cond_a

    if-ne v13, v1, :cond_a

    const/16 v1, 0x3a

    if-ne v15, v1, :cond_9

    if-ne v2, v1, :cond_9

    .line 1143
    invoke-static {v5, v6, v7}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v1

    if-lez v1, :cond_8

    .line 1144
    div-int/lit8 v2, v1, 0xa

    add-int/lit8 v2, v2, 0x30

    int-to-char v7, v2

    .line 1145
    rem-int/lit8 v1, v1, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v8, v1

    move v2, v9

    move v5, v11

    move v15, v12

    move v12, v14

    move/from16 v3, v17

    move/from16 v6, v18

    move/from16 v1, v21

    move v9, v1

    move v11, v9

    move v13, v11

    const/16 v27, 0x0

    move v14, v4

    goto :goto_3

    :cond_8
    return-object v16

    :cond_9
    const/16 v1, 0x20

    :cond_a
    if-ne v3, v1, :cond_d

    if-ne v8, v1, :cond_d

    if-ne v13, v1, :cond_d

    const/16 v1, 0x3a

    if-ne v15, v1, :cond_c

    if-ne v12, v1, :cond_c

    .line 1146
    invoke-static {v5, v6, v7}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v1

    if-lez v1, :cond_b

    .line 1147
    div-int/lit8 v3, v1, 0xa

    add-int/lit8 v3, v3, 0x30

    int-to-char v7, v3

    .line 1148
    rem-int/lit8 v1, v1, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v8, v1

    move v13, v4

    move v5, v11

    move v12, v14

    move/from16 v3, v17

    move/from16 v6, v18

    move/from16 v1, v21

    move v11, v1

    move v15, v11

    const/16 v27, 0x0

    move v4, v0

    :goto_5
    move v14, v2

    move v2, v9

    move v9, v15

    goto/16 :goto_6

    :cond_b
    return-object v16

    :cond_c
    const/16 v1, 0x20

    :cond_d
    if-ne v3, v1, :cond_10

    if-ne v8, v1, :cond_10

    if-ne v13, v1, :cond_10

    const/16 v1, 0x3a

    if-ne v4, v1, :cond_f

    if-ne v12, v1, :cond_f

    .line 1149
    invoke-static {v5, v6, v7}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v1

    if-lez v1, :cond_e

    .line 1150
    div-int/lit8 v3, v1, 0xa

    add-int/lit8 v3, v3, 0x30

    int-to-char v7, v3

    .line 1151
    rem-int/lit8 v1, v1, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v8, v1

    move v4, v0

    move v5, v11

    move v11, v14

    move v12, v15

    move/from16 v3, v17

    move/from16 v6, v18

    move/from16 v1, v21

    move v13, v1

    move v15, v13

    const/16 v27, 0x0

    goto :goto_5

    :cond_e
    return-object v16

    :cond_f
    const/16 v1, 0x20

    :cond_10
    if-ne v5, v1, :cond_12

    if-ne v9, v1, :cond_12

    if-ne v14, v1, :cond_12

    const/16 v1, 0x3a

    if-ne v4, v1, :cond_12

    if-ne v12, v1, :cond_12

    .line 1152
    invoke-static {v6, v7, v8}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v1

    if-lez v1, :cond_11

    .line 1153
    div-int/lit8 v4, v1, 0xa

    add-int/lit8 v4, v4, 0x30

    int-to-char v7, v4

    .line 1154
    rem-int/lit8 v1, v1, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v8, v1

    move v4, v0

    move v14, v2

    move v2, v10

    move v10, v11

    move v6, v13

    move v12, v15

    move/from16 v9, v17

    move/from16 v5, v18

    move/from16 v1, v21

    move v11, v1

    move v13, v11

    move v15, v13

    const/16 v27, 0x0

    goto :goto_6

    :cond_11
    return-object v16

    :cond_12
    move/from16 v1, v21

    if-lt v2, v1, :cond_13

    move/from16 v19, v3

    const/16 v3, 0x39

    if-gt v2, v3, :cond_13

    if-lt v12, v1, :cond_13

    if-gt v12, v3, :cond_13

    if-lt v0, v1, :cond_13

    if-gt v0, v3, :cond_13

    add-int/lit8 v2, v2, -0x30

    mul-int/lit8 v2, v2, 0x64

    move/from16 v3, v20

    .line 1155
    invoke-static {v12, v1, v3, v2}, Lp/a;->z(IIII)I

    move-result v2

    add-int/lit8 v0, v0, -0x30

    add-int/2addr v0, v2

    const v2, 0xf4240

    mul-int/2addr v0, v2

    move/from16 v27, v0

    move v3, v10

    move/from16 v2, v17

    move/from16 v12, v18

    move/from16 v10, v19

    :goto_6
    if-lt v2, v1, :cond_13

    const/16 v0, 0x39

    if-gt v2, v0, :cond_13

    if-lt v10, v1, :cond_13

    if-gt v10, v0, :cond_13

    if-lt v5, v1, :cond_13

    if-gt v5, v0, :cond_13

    if-lt v6, v1, :cond_13

    if-gt v6, v0, :cond_13

    sub-int/2addr v2, v1

    mul-int/lit16 v2, v2, 0x3e8

    move/from16 v0, p0

    .line 1156
    invoke-static {v10, v1, v0, v2}, Lp/a;->z(IIII)I

    move-result v0

    const/16 v2, 0xa

    invoke-static {v5, v1, v2, v0}, Lp/a;->z(IIII)I

    move-result v0

    sub-int/2addr v6, v1

    add-int v21, v6, v0

    if-lt v7, v1, :cond_13

    const/16 v0, 0x39

    if-gt v7, v0, :cond_13

    if-lt v8, v1, :cond_13

    if-gt v8, v0, :cond_13

    sub-int/2addr v7, v1

    mul-int/2addr v7, v2

    sub-int/2addr v8, v1

    add-int v22, v8, v7

    if-lt v9, v1, :cond_13

    if-gt v9, v0, :cond_13

    if-lt v3, v1, :cond_13

    if-gt v3, v0, :cond_13

    sub-int/2addr v9, v1

    mul-int/2addr v9, v2

    sub-int/2addr v3, v1

    add-int v23, v3, v9

    if-lt v11, v1, :cond_13

    if-gt v11, v0, :cond_13

    if-lt v12, v1, :cond_13

    if-gt v12, v0, :cond_13

    sub-int/2addr v11, v1

    mul-int/2addr v11, v2

    sub-int/2addr v12, v1

    add-int v24, v12, v11

    if-lt v13, v1, :cond_13

    if-gt v13, v0, :cond_13

    if-lt v14, v1, :cond_13

    if-gt v14, v0, :cond_13

    sub-int/2addr v13, v1

    mul-int/2addr v13, v2

    sub-int/2addr v14, v1

    add-int v25, v14, v13

    if-lt v15, v1, :cond_13

    if-gt v15, v0, :cond_13

    if-lt v4, v1, :cond_13

    if-gt v4, v0, :cond_13

    sub-int/2addr v15, v1

    mul-int/2addr v15, v2

    sub-int/2addr v4, v1

    add-int v26, v4, v15

    .line 1157
    invoke-static/range {v21 .. v27}, Ljava/time/LocalDateTime;->of(IIIIIII)Ljava/time/LocalDateTime;

    move-result-object v0

    return-object v0

    :cond_13
    return-object v16

    .line 1158
    :cond_14
    new-instance v2, Ljava/lang/String;

    array-length v3, v0

    sub-int/2addr v3, v1

    invoke-direct {v2, v0, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 1159
    new-instance v0, Ljava/time/format/DateTimeParseException;

    const-string v1, "illegal input "

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0
.end method

.method public static parseLocalDateTime18([BI)Ljava/time/LocalDateTime;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x12

    .line 6
    .line 7
    array-length v3, v0

    .line 8
    const-string v5, "illegal input "

    .line 9
    .line 10
    if-gt v2, v3, :cond_26

    .line 11
    .line 12
    aget-byte v2, v0, v1

    .line 13
    .line 14
    int-to-char v2, v2

    .line 15
    add-int/lit8 v3, v1, 0x1

    .line 16
    .line 17
    aget-byte v3, v0, v3

    .line 18
    .line 19
    int-to-char v3, v3

    .line 20
    add-int/lit8 v6, v1, 0x2

    .line 21
    .line 22
    aget-byte v6, v0, v6

    .line 23
    .line 24
    int-to-char v6, v6

    .line 25
    add-int/lit8 v7, v1, 0x3

    .line 26
    .line 27
    aget-byte v7, v0, v7

    .line 28
    .line 29
    int-to-char v7, v7

    .line 30
    add-int/lit8 v8, v1, 0x4

    .line 31
    .line 32
    aget-byte v8, v0, v8

    .line 33
    .line 34
    int-to-char v8, v8

    .line 35
    add-int/lit8 v9, v1, 0x5

    .line 36
    .line 37
    aget-byte v9, v0, v9

    .line 38
    .line 39
    int-to-char v9, v9

    .line 40
    add-int/lit8 v10, v1, 0x6

    .line 41
    .line 42
    aget-byte v10, v0, v10

    .line 43
    .line 44
    int-to-char v10, v10

    .line 45
    add-int/lit8 v11, v1, 0x7

    .line 46
    .line 47
    aget-byte v11, v0, v11

    .line 48
    .line 49
    int-to-char v11, v11

    .line 50
    add-int/lit8 v12, v1, 0x8

    .line 51
    .line 52
    aget-byte v12, v0, v12

    .line 53
    .line 54
    int-to-char v12, v12

    .line 55
    add-int/lit8 v13, v1, 0x9

    .line 56
    .line 57
    aget-byte v13, v0, v13

    .line 58
    .line 59
    int-to-char v13, v13

    .line 60
    add-int/lit8 v14, v1, 0xa

    .line 61
    .line 62
    aget-byte v14, v0, v14

    .line 63
    .line 64
    int-to-char v14, v14

    .line 65
    add-int/lit8 v15, v1, 0xb

    .line 66
    .line 67
    aget-byte v15, v0, v15

    .line 68
    .line 69
    int-to-char v15, v15

    .line 70
    add-int/lit8 v16, v1, 0xc

    .line 71
    .line 72
    aget-byte v4, v0, v16

    .line 73
    .line 74
    int-to-char v4, v4

    .line 75
    add-int/lit8 v16, v1, 0xd

    .line 76
    .line 77
    move/from16 v17, v2

    .line 78
    .line 79
    aget-byte v2, v0, v16

    .line 80
    .line 81
    int-to-char v2, v2

    .line 82
    add-int/lit8 v16, v1, 0xe

    .line 83
    .line 84
    move/from16 v18, v12

    .line 85
    .line 86
    aget-byte v12, v0, v16

    .line 87
    .line 88
    int-to-char v12, v12

    .line 89
    add-int/lit8 v16, v1, 0xf

    .line 90
    .line 91
    move/from16 v19, v12

    .line 92
    .line 93
    aget-byte v12, v0, v16

    .line 94
    .line 95
    int-to-char v12, v12

    .line 96
    add-int/lit8 v16, v1, 0x10

    .line 97
    .line 98
    move/from16 v20, v15

    .line 99
    .line 100
    aget-byte v15, v0, v16

    .line 101
    .line 102
    int-to-char v15, v15

    .line 103
    add-int/lit8 v16, v1, 0x11

    .line 104
    .line 105
    move-object/from16 v21, v5

    .line 106
    .line 107
    aget-byte v5, v0, v16

    .line 108
    .line 109
    int-to-char v5, v5

    .line 110
    move/from16 v16, v5

    .line 111
    .line 112
    const/16 v24, 0xa

    .line 113
    .line 114
    const/16 v27, 0x30

    .line 115
    .line 116
    const/16 v5, 0x2d

    .line 117
    .line 118
    if-ne v8, v5, :cond_2

    .line 119
    .line 120
    if-ne v10, v5, :cond_2

    .line 121
    .line 122
    const/16 v5, 0x20

    .line 123
    .line 124
    if-eq v13, v5, :cond_0

    .line 125
    .line 126
    const/16 v5, 0x54

    .line 127
    .line 128
    if-ne v13, v5, :cond_1

    .line 129
    .line 130
    :cond_0
    const/16 v5, 0x3a

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_1
    const/16 v5, 0x2d

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :goto_0
    if-ne v4, v5, :cond_1

    .line 137
    .line 138
    if-ne v12, v5, :cond_1

    .line 139
    .line 140
    move v4, v2

    .line 141
    move v10, v9

    .line 142
    move v8, v15

    .line 143
    move/from16 v2, v17

    .line 144
    .line 145
    move/from16 v13, v18

    .line 146
    .line 147
    move/from16 v12, v19

    .line 148
    .line 149
    move/from16 v15, v20

    .line 150
    .line 151
    move/from16 v5, v27

    .line 152
    .line 153
    move v9, v5

    .line 154
    goto/16 :goto_f

    .line 155
    .line 156
    :cond_2
    :goto_1
    if-ne v8, v5, :cond_5

    .line 157
    .line 158
    if-ne v11, v5, :cond_5

    .line 159
    .line 160
    const/16 v5, 0x20

    .line 161
    .line 162
    if-eq v13, v5, :cond_3

    .line 163
    .line 164
    const/16 v5, 0x54

    .line 165
    .line 166
    if-ne v13, v5, :cond_4

    .line 167
    .line 168
    :cond_3
    const/16 v5, 0x3a

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_4
    const/16 v5, 0x2d

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :goto_2
    if-ne v4, v5, :cond_4

    .line 175
    .line 176
    if-ne v12, v5, :cond_4

    .line 177
    .line 178
    move v4, v2

    .line 179
    move v8, v15

    .line 180
    move/from16 v2, v17

    .line 181
    .line 182
    move/from16 v13, v18

    .line 183
    .line 184
    move/from16 v12, v19

    .line 185
    .line 186
    move/from16 v15, v20

    .line 187
    .line 188
    move/from16 v5, v27

    .line 189
    .line 190
    move v11, v5

    .line 191
    goto/16 :goto_f

    .line 192
    .line 193
    :cond_5
    :goto_3
    if-ne v8, v5, :cond_8

    .line 194
    .line 195
    if-ne v11, v5, :cond_8

    .line 196
    .line 197
    const/16 v5, 0x20

    .line 198
    .line 199
    if-eq v14, v5, :cond_6

    .line 200
    .line 201
    const/16 v5, 0x54

    .line 202
    .line 203
    if-ne v14, v5, :cond_7

    .line 204
    .line 205
    :cond_6
    const/16 v5, 0x3a

    .line 206
    .line 207
    goto :goto_4

    .line 208
    :cond_7
    const/16 v5, 0x2d

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :goto_4
    if-ne v4, v5, :cond_7

    .line 212
    .line 213
    if-ne v12, v5, :cond_7

    .line 214
    .line 215
    move v4, v2

    .line 216
    move v8, v15

    .line 217
    move/from16 v2, v17

    .line 218
    .line 219
    move/from16 v11, v18

    .line 220
    .line 221
    move/from16 v12, v19

    .line 222
    .line 223
    move/from16 v15, v20

    .line 224
    .line 225
    move/from16 v5, v27

    .line 226
    .line 227
    move v14, v5

    .line 228
    goto/16 :goto_f

    .line 229
    .line 230
    :cond_8
    :goto_5
    if-ne v8, v5, :cond_b

    .line 231
    .line 232
    if-ne v11, v5, :cond_b

    .line 233
    .line 234
    const/16 v5, 0x20

    .line 235
    .line 236
    if-eq v14, v5, :cond_9

    .line 237
    .line 238
    const/16 v5, 0x54

    .line 239
    .line 240
    if-ne v14, v5, :cond_a

    .line 241
    .line 242
    :cond_9
    const/16 v5, 0x3a

    .line 243
    .line 244
    goto :goto_6

    .line 245
    :cond_a
    const/16 v5, 0x2d

    .line 246
    .line 247
    goto :goto_7

    .line 248
    :goto_6
    if-ne v2, v5, :cond_a

    .line 249
    .line 250
    if-ne v12, v5, :cond_a

    .line 251
    .line 252
    move v8, v15

    .line 253
    move/from16 v2, v17

    .line 254
    .line 255
    move/from16 v11, v18

    .line 256
    .line 257
    move/from16 v12, v19

    .line 258
    .line 259
    move/from16 v14, v20

    .line 260
    .line 261
    move/from16 v5, v27

    .line 262
    .line 263
    move v15, v4

    .line 264
    move v4, v5

    .line 265
    goto/16 :goto_f

    .line 266
    .line 267
    :cond_b
    :goto_7
    if-ne v8, v5, :cond_d

    .line 268
    .line 269
    if-ne v11, v5, :cond_d

    .line 270
    .line 271
    const/16 v5, 0x20

    .line 272
    .line 273
    if-eq v14, v5, :cond_c

    .line 274
    .line 275
    const/16 v5, 0x54

    .line 276
    .line 277
    if-ne v14, v5, :cond_d

    .line 278
    .line 279
    :cond_c
    const/16 v5, 0x3a

    .line 280
    .line 281
    goto :goto_8

    .line 282
    :cond_d
    const/16 v5, 0x20

    .line 283
    .line 284
    goto :goto_9

    .line 285
    :goto_8
    if-ne v2, v5, :cond_d

    .line 286
    .line 287
    if-ne v15, v5, :cond_d

    .line 288
    .line 289
    move v15, v4

    .line 290
    move/from16 v2, v17

    .line 291
    .line 292
    move/from16 v11, v18

    .line 293
    .line 294
    move/from16 v4, v19

    .line 295
    .line 296
    move/from16 v14, v20

    .line 297
    .line 298
    move/from16 v5, v27

    .line 299
    .line 300
    move v8, v5

    .line 301
    goto/16 :goto_f

    .line 302
    .line 303
    :goto_9
    if-ne v3, v5, :cond_f

    .line 304
    .line 305
    if-ne v9, v5, :cond_f

    .line 306
    .line 307
    if-ne v14, v5, :cond_f

    .line 308
    .line 309
    const/16 v5, 0x3a

    .line 310
    .line 311
    if-ne v4, v5, :cond_f

    .line 312
    .line 313
    if-ne v12, v5, :cond_f

    .line 314
    .line 315
    invoke-static {v6, v7, v8}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    .line 316
    .line 317
    .line 318
    move-result v3

    .line 319
    if-lez v3, :cond_e

    .line 320
    .line 321
    div-int/lit8 v4, v3, 0xa

    .line 322
    .line 323
    add-int/lit8 v4, v4, 0x30

    .line 324
    .line 325
    int-to-char v9, v4

    .line 326
    rem-int/lit8 v3, v3, 0xa

    .line 327
    .line 328
    add-int/lit8 v3, v3, 0x30

    .line 329
    .line 330
    int-to-char v3, v3

    .line 331
    move v4, v2

    .line 332
    move v2, v10

    .line 333
    move v7, v13

    .line 334
    move v8, v15

    .line 335
    move/from16 v13, v17

    .line 336
    .line 337
    move/from16 v6, v18

    .line 338
    .line 339
    move/from16 v12, v19

    .line 340
    .line 341
    move/from16 v15, v20

    .line 342
    .line 343
    move/from16 v5, v27

    .line 344
    .line 345
    move v14, v5

    .line 346
    move v10, v3

    .line 347
    move v3, v11

    .line 348
    move v11, v14

    .line 349
    goto/16 :goto_f

    .line 350
    .line 351
    :cond_e
    new-instance v2, Ljava/lang/String;

    .line 352
    .line 353
    const/16 v3, 0x12

    .line 354
    .line 355
    invoke-direct {v2, v0, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 356
    .line 357
    .line 358
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 359
    .line 360
    move-object/from16 v5, v21

    .line 361
    .line 362
    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    const/4 v3, 0x0

    .line 367
    invoke-direct {v0, v1, v2, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 368
    .line 369
    .line 370
    throw v0

    .line 371
    :cond_f
    move-object/from16 v5, v21

    .line 372
    .line 373
    move/from16 v21, v4

    .line 374
    .line 375
    const/16 v4, 0x20

    .line 376
    .line 377
    if-ne v3, v4, :cond_12

    .line 378
    .line 379
    if-ne v9, v4, :cond_12

    .line 380
    .line 381
    if-ne v14, v4, :cond_12

    .line 382
    .line 383
    const/16 v4, 0x3a

    .line 384
    .line 385
    if-ne v2, v4, :cond_11

    .line 386
    .line 387
    if-ne v12, v4, :cond_11

    .line 388
    .line 389
    invoke-static {v6, v7, v8}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    if-lez v2, :cond_10

    .line 394
    .line 395
    div-int/lit8 v3, v2, 0xa

    .line 396
    .line 397
    add-int/lit8 v3, v3, 0x30

    .line 398
    .line 399
    int-to-char v9, v3

    .line 400
    rem-int/lit8 v2, v2, 0xa

    .line 401
    .line 402
    add-int/lit8 v2, v2, 0x30

    .line 403
    .line 404
    int-to-char v2, v2

    .line 405
    move v3, v10

    .line 406
    move v10, v2

    .line 407
    move v2, v3

    .line 408
    move v3, v11

    .line 409
    move v7, v13

    .line 410
    move v8, v15

    .line 411
    move/from16 v13, v17

    .line 412
    .line 413
    move/from16 v6, v18

    .line 414
    .line 415
    move/from16 v12, v19

    .line 416
    .line 417
    move/from16 v14, v20

    .line 418
    .line 419
    move/from16 v15, v21

    .line 420
    .line 421
    move/from16 v4, v27

    .line 422
    .line 423
    move v11, v4

    .line 424
    :goto_a
    move-object/from16 v21, v5

    .line 425
    .line 426
    move v5, v11

    .line 427
    goto/16 :goto_f

    .line 428
    .line 429
    :cond_10
    new-instance v2, Ljava/lang/String;

    .line 430
    .line 431
    const/16 v3, 0x12

    .line 432
    .line 433
    invoke-direct {v2, v0, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 434
    .line 435
    .line 436
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 437
    .line 438
    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    const/4 v3, 0x0

    .line 443
    invoke-direct {v0, v1, v2, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 444
    .line 445
    .line 446
    throw v0

    .line 447
    :cond_11
    const/16 v4, 0x20

    .line 448
    .line 449
    :cond_12
    if-ne v3, v4, :cond_15

    .line 450
    .line 451
    if-ne v9, v4, :cond_15

    .line 452
    .line 453
    if-ne v14, v4, :cond_15

    .line 454
    .line 455
    const/16 v4, 0x3a

    .line 456
    .line 457
    if-ne v2, v4, :cond_14

    .line 458
    .line 459
    if-ne v15, v4, :cond_14

    .line 460
    .line 461
    invoke-static {v6, v7, v8}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    .line 462
    .line 463
    .line 464
    move-result v2

    .line 465
    if-lez v2, :cond_13

    .line 466
    .line 467
    div-int/lit8 v3, v2, 0xa

    .line 468
    .line 469
    add-int/lit8 v3, v3, 0x30

    .line 470
    .line 471
    int-to-char v9, v3

    .line 472
    rem-int/lit8 v2, v2, 0xa

    .line 473
    .line 474
    add-int/lit8 v2, v2, 0x30

    .line 475
    .line 476
    int-to-char v2, v2

    .line 477
    move v3, v10

    .line 478
    move v10, v2

    .line 479
    move v2, v3

    .line 480
    move v3, v11

    .line 481
    move v7, v13

    .line 482
    move/from16 v13, v17

    .line 483
    .line 484
    move/from16 v6, v18

    .line 485
    .line 486
    move/from16 v4, v19

    .line 487
    .line 488
    move/from16 v14, v20

    .line 489
    .line 490
    move/from16 v15, v21

    .line 491
    .line 492
    move/from16 v8, v27

    .line 493
    .line 494
    move v11, v8

    .line 495
    goto :goto_a

    .line 496
    :cond_13
    new-instance v2, Ljava/lang/String;

    .line 497
    .line 498
    const/16 v3, 0x12

    .line 499
    .line 500
    invoke-direct {v2, v0, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 501
    .line 502
    .line 503
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 504
    .line 505
    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v1

    .line 509
    const/4 v3, 0x0

    .line 510
    invoke-direct {v0, v1, v2, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 511
    .line 512
    .line 513
    throw v0

    .line 514
    :cond_14
    const/16 v4, 0x20

    .line 515
    .line 516
    :cond_15
    if-ne v6, v4, :cond_19

    .line 517
    .line 518
    if-ne v10, v4, :cond_19

    .line 519
    .line 520
    move/from16 v22, v3

    .line 521
    .line 522
    move/from16 v3, v20

    .line 523
    .line 524
    if-ne v3, v4, :cond_18

    .line 525
    .line 526
    move/from16 v4, v19

    .line 527
    .line 528
    move/from16 v19, v11

    .line 529
    .line 530
    const/16 v11, 0x3a

    .line 531
    .line 532
    if-ne v4, v11, :cond_17

    .line 533
    .line 534
    if-ne v15, v11, :cond_17

    .line 535
    .line 536
    invoke-static {v7, v8, v9}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    .line 537
    .line 538
    .line 539
    move-result v3

    .line 540
    if-lez v3, :cond_16

    .line 541
    .line 542
    div-int/lit8 v4, v3, 0xa

    .line 543
    .line 544
    add-int/lit8 v4, v4, 0x30

    .line 545
    .line 546
    int-to-char v9, v4

    .line 547
    rem-int/lit8 v3, v3, 0xa

    .line 548
    .line 549
    add-int/lit8 v3, v3, 0x30

    .line 550
    .line 551
    int-to-char v3, v3

    .line 552
    move v15, v2

    .line 553
    move v10, v3

    .line 554
    move v6, v13

    .line 555
    move v7, v14

    .line 556
    move/from16 v11, v17

    .line 557
    .line 558
    move/from16 v3, v18

    .line 559
    .line 560
    move/from16 v2, v19

    .line 561
    .line 562
    move/from16 v14, v21

    .line 563
    .line 564
    move/from16 v13, v22

    .line 565
    .line 566
    move/from16 v4, v27

    .line 567
    .line 568
    move v8, v4

    .line 569
    move-object/from16 v21, v5

    .line 570
    .line 571
    move v5, v8

    .line 572
    goto/16 :goto_f

    .line 573
    .line 574
    :cond_16
    new-instance v2, Ljava/lang/String;

    .line 575
    .line 576
    const/16 v3, 0x12

    .line 577
    .line 578
    invoke-direct {v2, v0, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 579
    .line 580
    .line 581
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 582
    .line 583
    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v1

    .line 587
    const/4 v3, 0x0

    .line 588
    invoke-direct {v0, v1, v2, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 589
    .line 590
    .line 591
    throw v0

    .line 592
    :cond_17
    :goto_b
    const/16 v11, 0x20

    .line 593
    .line 594
    goto :goto_d

    .line 595
    :cond_18
    move/from16 v4, v19

    .line 596
    .line 597
    :goto_c
    move/from16 v19, v11

    .line 598
    .line 599
    goto :goto_b

    .line 600
    :cond_19
    move/from16 v22, v3

    .line 601
    .line 602
    move/from16 v4, v19

    .line 603
    .line 604
    move/from16 v3, v20

    .line 605
    .line 606
    goto :goto_c

    .line 607
    :goto_d
    if-ne v6, v11, :cond_1c

    .line 608
    .line 609
    if-ne v10, v11, :cond_1c

    .line 610
    .line 611
    if-ne v3, v11, :cond_1c

    .line 612
    .line 613
    const/16 v11, 0x3a

    .line 614
    .line 615
    if-ne v2, v11, :cond_1b

    .line 616
    .line 617
    if-ne v15, v11, :cond_1b

    .line 618
    .line 619
    invoke-static {v7, v8, v9}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    .line 620
    .line 621
    .line 622
    move-result v2

    .line 623
    if-lez v2, :cond_1a

    .line 624
    .line 625
    div-int/lit8 v3, v2, 0xa

    .line 626
    .line 627
    add-int/lit8 v3, v3, 0x30

    .line 628
    .line 629
    int-to-char v9, v3

    .line 630
    rem-int/lit8 v2, v2, 0xa

    .line 631
    .line 632
    add-int/lit8 v2, v2, 0x30

    .line 633
    .line 634
    int-to-char v2, v2

    .line 635
    move v10, v2

    .line 636
    move v6, v13

    .line 637
    move v7, v14

    .line 638
    move/from16 v11, v17

    .line 639
    .line 640
    move/from16 v3, v18

    .line 641
    .line 642
    move/from16 v2, v19

    .line 643
    .line 644
    move/from16 v15, v21

    .line 645
    .line 646
    move/from16 v13, v22

    .line 647
    .line 648
    move/from16 v8, v27

    .line 649
    .line 650
    move v14, v8

    .line 651
    :goto_e
    move-object/from16 v21, v5

    .line 652
    .line 653
    move v5, v14

    .line 654
    goto :goto_f

    .line 655
    :cond_1a
    new-instance v2, Ljava/lang/String;

    .line 656
    .line 657
    const/16 v3, 0x12

    .line 658
    .line 659
    invoke-direct {v2, v0, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 660
    .line 661
    .line 662
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 663
    .line 664
    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 665
    .line 666
    .line 667
    move-result-object v1

    .line 668
    const/4 v3, 0x0

    .line 669
    invoke-direct {v0, v1, v2, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 670
    .line 671
    .line 672
    throw v0

    .line 673
    :cond_1b
    const/16 v11, 0x20

    .line 674
    .line 675
    :cond_1c
    if-ne v6, v11, :cond_25

    .line 676
    .line 677
    if-ne v10, v11, :cond_25

    .line 678
    .line 679
    if-ne v3, v11, :cond_25

    .line 680
    .line 681
    const/16 v11, 0x3a

    .line 682
    .line 683
    if-ne v2, v11, :cond_25

    .line 684
    .line 685
    if-ne v12, v11, :cond_25

    .line 686
    .line 687
    invoke-static {v7, v8, v9}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    .line 688
    .line 689
    .line 690
    move-result v2

    .line 691
    if-lez v2, :cond_24

    .line 692
    .line 693
    div-int/lit8 v3, v2, 0xa

    .line 694
    .line 695
    add-int/lit8 v3, v3, 0x30

    .line 696
    .line 697
    int-to-char v9, v3

    .line 698
    rem-int/lit8 v2, v2, 0xa

    .line 699
    .line 700
    add-int/lit8 v2, v2, 0x30

    .line 701
    .line 702
    int-to-char v2, v2

    .line 703
    move v10, v2

    .line 704
    move v12, v4

    .line 705
    move v6, v13

    .line 706
    move v7, v14

    .line 707
    move v8, v15

    .line 708
    move/from16 v11, v17

    .line 709
    .line 710
    move/from16 v3, v18

    .line 711
    .line 712
    move/from16 v2, v19

    .line 713
    .line 714
    move/from16 v15, v21

    .line 715
    .line 716
    move/from16 v13, v22

    .line 717
    .line 718
    move/from16 v4, v27

    .line 719
    .line 720
    move v14, v4

    .line 721
    goto :goto_e

    .line 722
    :goto_f
    if-lt v2, v5, :cond_23

    .line 723
    .line 724
    const/16 v0, 0x39

    .line 725
    .line 726
    if-gt v2, v0, :cond_22

    .line 727
    .line 728
    if-lt v3, v5, :cond_22

    .line 729
    .line 730
    if-gt v3, v0, :cond_22

    .line 731
    .line 732
    if-lt v6, v5, :cond_22

    .line 733
    .line 734
    if-gt v6, v0, :cond_22

    .line 735
    .line 736
    if-lt v7, v5, :cond_22

    .line 737
    .line 738
    if-gt v7, v0, :cond_22

    .line 739
    .line 740
    sub-int/2addr v2, v5

    .line 741
    mul-int/lit16 v2, v2, 0x3e8

    .line 742
    .line 743
    const/16 v0, 0x64

    .line 744
    .line 745
    invoke-static {v3, v5, v0, v2}, Lp/a;->z(IIII)I

    .line 746
    .line 747
    .line 748
    move-result v0

    .line 749
    move/from16 v2, v24

    .line 750
    .line 751
    invoke-static {v6, v5, v2, v0}, Lp/a;->z(IIII)I

    .line 752
    .line 753
    .line 754
    move-result v0

    .line 755
    sub-int/2addr v7, v5

    .line 756
    add-int v22, v7, v0

    .line 757
    .line 758
    if-lt v9, v5, :cond_21

    .line 759
    .line 760
    const/16 v0, 0x39

    .line 761
    .line 762
    if-gt v9, v0, :cond_21

    .line 763
    .line 764
    if-lt v10, v5, :cond_21

    .line 765
    .line 766
    if-gt v10, v0, :cond_21

    .line 767
    .line 768
    sub-int/2addr v9, v5

    .line 769
    mul-int/2addr v9, v2

    .line 770
    sub-int/2addr v10, v5

    .line 771
    add-int v23, v10, v9

    .line 772
    .line 773
    if-lt v11, v5, :cond_20

    .line 774
    .line 775
    if-gt v11, v0, :cond_20

    .line 776
    .line 777
    if-lt v13, v5, :cond_20

    .line 778
    .line 779
    if-gt v13, v0, :cond_20

    .line 780
    .line 781
    sub-int/2addr v11, v5

    .line 782
    mul-int/2addr v11, v2

    .line 783
    sub-int/2addr v13, v5

    .line 784
    add-int v24, v13, v11

    .line 785
    .line 786
    if-lt v14, v5, :cond_1f

    .line 787
    .line 788
    if-gt v14, v0, :cond_1f

    .line 789
    .line 790
    if-lt v15, v5, :cond_1f

    .line 791
    .line 792
    if-gt v15, v0, :cond_1f

    .line 793
    .line 794
    sub-int/2addr v14, v5

    .line 795
    mul-int/2addr v14, v2

    .line 796
    sub-int/2addr v15, v5

    .line 797
    add-int v25, v15, v14

    .line 798
    .line 799
    if-lt v4, v5, :cond_1e

    .line 800
    .line 801
    if-gt v4, v0, :cond_1e

    .line 802
    .line 803
    if-lt v12, v5, :cond_1e

    .line 804
    .line 805
    if-gt v12, v0, :cond_1e

    .line 806
    .line 807
    sub-int/2addr v4, v5

    .line 808
    mul-int/2addr v4, v2

    .line 809
    sub-int/2addr v12, v5

    .line 810
    add-int v26, v12, v4

    .line 811
    .line 812
    if-lt v8, v5, :cond_1d

    .line 813
    .line 814
    if-gt v8, v0, :cond_1d

    .line 815
    .line 816
    move/from16 v3, v16

    .line 817
    .line 818
    if-lt v3, v5, :cond_1d

    .line 819
    .line 820
    if-gt v3, v0, :cond_1d

    .line 821
    .line 822
    sub-int/2addr v8, v5

    .line 823
    mul-int/2addr v8, v2

    .line 824
    add-int/lit8 v5, v3, -0x30

    .line 825
    .line 826
    add-int v27, v5, v8

    .line 827
    .line 828
    invoke-static/range {v22 .. v27}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    .line 829
    .line 830
    .line 831
    move-result-object v0

    .line 832
    return-object v0

    .line 833
    :cond_1d
    new-instance v0, Ljava/lang/String;

    .line 834
    .line 835
    const/16 v3, 0x12

    .line 836
    .line 837
    move-object/from16 v2, p0

    .line 838
    .line 839
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 840
    .line 841
    .line 842
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 843
    .line 844
    move-object/from16 v5, v21

    .line 845
    .line 846
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 847
    .line 848
    .line 849
    move-result-object v2

    .line 850
    const/4 v4, 0x0

    .line 851
    invoke-direct {v1, v2, v0, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 852
    .line 853
    .line 854
    throw v1

    .line 855
    :cond_1e
    move-object/from16 v2, p0

    .line 856
    .line 857
    move-object/from16 v5, v21

    .line 858
    .line 859
    const/16 v3, 0x12

    .line 860
    .line 861
    const/4 v4, 0x0

    .line 862
    new-instance v0, Ljava/lang/String;

    .line 863
    .line 864
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 865
    .line 866
    .line 867
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 868
    .line 869
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 870
    .line 871
    .line 872
    move-result-object v2

    .line 873
    invoke-direct {v1, v2, v0, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 874
    .line 875
    .line 876
    throw v1

    .line 877
    :cond_1f
    move-object/from16 v2, p0

    .line 878
    .line 879
    move-object/from16 v5, v21

    .line 880
    .line 881
    const/16 v3, 0x12

    .line 882
    .line 883
    const/4 v4, 0x0

    .line 884
    new-instance v0, Ljava/lang/String;

    .line 885
    .line 886
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 887
    .line 888
    .line 889
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 890
    .line 891
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 892
    .line 893
    .line 894
    move-result-object v2

    .line 895
    invoke-direct {v1, v2, v0, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 896
    .line 897
    .line 898
    throw v1

    .line 899
    :cond_20
    move-object/from16 v2, p0

    .line 900
    .line 901
    move-object/from16 v5, v21

    .line 902
    .line 903
    const/16 v3, 0x12

    .line 904
    .line 905
    const/4 v4, 0x0

    .line 906
    new-instance v0, Ljava/lang/String;

    .line 907
    .line 908
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 909
    .line 910
    .line 911
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 912
    .line 913
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 914
    .line 915
    .line 916
    move-result-object v2

    .line 917
    invoke-direct {v1, v2, v0, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 918
    .line 919
    .line 920
    throw v1

    .line 921
    :cond_21
    move-object/from16 v2, p0

    .line 922
    .line 923
    move-object/from16 v5, v21

    .line 924
    .line 925
    const/16 v3, 0x12

    .line 926
    .line 927
    const/4 v4, 0x0

    .line 928
    new-instance v0, Ljava/lang/String;

    .line 929
    .line 930
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 931
    .line 932
    .line 933
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 934
    .line 935
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 936
    .line 937
    .line 938
    move-result-object v2

    .line 939
    invoke-direct {v1, v2, v0, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 940
    .line 941
    .line 942
    throw v1

    .line 943
    :cond_22
    move-object/from16 v2, p0

    .line 944
    .line 945
    :goto_10
    move-object/from16 v5, v21

    .line 946
    .line 947
    goto :goto_11

    .line 948
    :cond_23
    move-object v2, v0

    .line 949
    goto :goto_10

    .line 950
    :goto_11
    new-instance v0, Ljava/lang/String;

    .line 951
    .line 952
    const/16 v3, 0x12

    .line 953
    .line 954
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 955
    .line 956
    .line 957
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 958
    .line 959
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 960
    .line 961
    .line 962
    move-result-object v2

    .line 963
    const/4 v4, 0x0

    .line 964
    invoke-direct {v1, v2, v0, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 965
    .line 966
    .line 967
    throw v1

    .line 968
    :cond_24
    move-object v2, v0

    .line 969
    const/16 v3, 0x12

    .line 970
    .line 971
    const/4 v4, 0x0

    .line 972
    new-instance v0, Ljava/lang/String;

    .line 973
    .line 974
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 975
    .line 976
    .line 977
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 978
    .line 979
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 980
    .line 981
    .line 982
    move-result-object v2

    .line 983
    invoke-direct {v1, v2, v0, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 984
    .line 985
    .line 986
    throw v1

    .line 987
    :cond_25
    move-object v2, v0

    .line 988
    const/16 v3, 0x12

    .line 989
    .line 990
    const/4 v4, 0x0

    .line 991
    new-instance v0, Ljava/lang/String;

    .line 992
    .line 993
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 994
    .line 995
    .line 996
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 997
    .line 998
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 999
    .line 1000
    .line 1001
    move-result-object v2

    .line 1002
    invoke-direct {v1, v2, v0, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 1003
    .line 1004
    .line 1005
    throw v1

    .line 1006
    :cond_26
    move-object v2, v0

    .line 1007
    const/4 v4, 0x0

    .line 1008
    new-instance v0, Ljava/lang/String;

    .line 1009
    .line 1010
    array-length v3, v2

    .line 1011
    sub-int/2addr v3, v1

    .line 1012
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 1013
    .line 1014
    .line 1015
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 1016
    .line 1017
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v2

    .line 1021
    invoke-direct {v1, v2, v0, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 1022
    .line 1023
    .line 1024
    throw v1
.end method

.method public static parseLocalDateTime18([CI)Ljava/time/LocalDateTime;
    .locals 28

    move-object/from16 v0, p0

    move/from16 v1, p1

    add-int/lit8 v2, v1, 0x12

    .line 1025
    array-length v3, v0

    const-string v5, "illegal input "

    if-gt v2, v3, :cond_26

    .line 1026
    aget-char v2, v0, v1

    add-int/lit8 v3, v1, 0x1

    .line 1027
    aget-char v3, v0, v3

    add-int/lit8 v6, v1, 0x2

    .line 1028
    aget-char v6, v0, v6

    add-int/lit8 v7, v1, 0x3

    .line 1029
    aget-char v7, v0, v7

    add-int/lit8 v8, v1, 0x4

    .line 1030
    aget-char v8, v0, v8

    add-int/lit8 v9, v1, 0x5

    .line 1031
    aget-char v9, v0, v9

    add-int/lit8 v10, v1, 0x6

    .line 1032
    aget-char v10, v0, v10

    add-int/lit8 v11, v1, 0x7

    .line 1033
    aget-char v11, v0, v11

    add-int/lit8 v12, v1, 0x8

    .line 1034
    aget-char v12, v0, v12

    add-int/lit8 v13, v1, 0x9

    .line 1035
    aget-char v13, v0, v13

    add-int/lit8 v14, v1, 0xa

    .line 1036
    aget-char v14, v0, v14

    add-int/lit8 v15, v1, 0xb

    .line 1037
    aget-char v15, v0, v15

    add-int/lit8 v16, v1, 0xc

    .line 1038
    aget-char v4, v0, v16

    add-int/lit8 v16, v1, 0xd

    move/from16 v17, v2

    .line 1039
    aget-char v2, v0, v16

    add-int/lit8 v16, v1, 0xe

    move/from16 v18, v12

    .line 1040
    aget-char v12, v0, v16

    add-int/lit8 v16, v1, 0xf

    move/from16 v19, v12

    .line 1041
    aget-char v12, v0, v16

    add-int/lit8 v16, v1, 0x10

    move/from16 v20, v15

    .line 1042
    aget-char v15, v0, v16

    add-int/lit8 v16, v1, 0x11

    move-object/from16 v21, v5

    .line 1043
    aget-char v5, v0, v16

    move/from16 v16, v5

    const/16 v24, 0xa

    const/16 v27, 0x30

    const/16 v5, 0x2d

    if-ne v8, v5, :cond_2

    if-ne v10, v5, :cond_2

    const/16 v5, 0x20

    if-eq v13, v5, :cond_0

    const/16 v5, 0x54

    if-ne v13, v5, :cond_1

    :cond_0
    const/16 v5, 0x3a

    goto :goto_0

    :cond_1
    const/16 v5, 0x2d

    goto :goto_1

    :goto_0
    if-ne v4, v5, :cond_1

    if-ne v12, v5, :cond_1

    move v4, v2

    move v10, v9

    move v8, v15

    move/from16 v2, v17

    move/from16 v13, v18

    move/from16 v12, v19

    move/from16 v15, v20

    move/from16 v5, v27

    move v9, v5

    goto/16 :goto_f

    :cond_2
    :goto_1
    if-ne v8, v5, :cond_5

    if-ne v11, v5, :cond_5

    const/16 v5, 0x20

    if-eq v13, v5, :cond_3

    const/16 v5, 0x54

    if-ne v13, v5, :cond_4

    :cond_3
    const/16 v5, 0x3a

    goto :goto_2

    :cond_4
    const/16 v5, 0x2d

    goto :goto_3

    :goto_2
    if-ne v4, v5, :cond_4

    if-ne v12, v5, :cond_4

    move v4, v2

    move v8, v15

    move/from16 v2, v17

    move/from16 v13, v18

    move/from16 v12, v19

    move/from16 v15, v20

    move/from16 v5, v27

    move v11, v5

    goto/16 :goto_f

    :cond_5
    :goto_3
    if-ne v8, v5, :cond_8

    if-ne v11, v5, :cond_8

    const/16 v5, 0x20

    if-eq v14, v5, :cond_6

    const/16 v5, 0x54

    if-ne v14, v5, :cond_7

    :cond_6
    const/16 v5, 0x3a

    goto :goto_4

    :cond_7
    const/16 v5, 0x2d

    goto :goto_5

    :goto_4
    if-ne v4, v5, :cond_7

    if-ne v12, v5, :cond_7

    move v4, v2

    move v8, v15

    move/from16 v2, v17

    move/from16 v11, v18

    move/from16 v12, v19

    move/from16 v15, v20

    move/from16 v5, v27

    move v14, v5

    goto/16 :goto_f

    :cond_8
    :goto_5
    if-ne v8, v5, :cond_b

    if-ne v11, v5, :cond_b

    const/16 v5, 0x20

    if-eq v14, v5, :cond_9

    const/16 v5, 0x54

    if-ne v14, v5, :cond_a

    :cond_9
    const/16 v5, 0x3a

    goto :goto_6

    :cond_a
    const/16 v5, 0x2d

    goto :goto_7

    :goto_6
    if-ne v2, v5, :cond_a

    if-ne v12, v5, :cond_a

    move v8, v15

    move/from16 v2, v17

    move/from16 v11, v18

    move/from16 v12, v19

    move/from16 v14, v20

    move/from16 v5, v27

    move v15, v4

    move v4, v5

    goto/16 :goto_f

    :cond_b
    :goto_7
    if-ne v8, v5, :cond_d

    if-ne v11, v5, :cond_d

    const/16 v5, 0x20

    if-eq v14, v5, :cond_c

    const/16 v5, 0x54

    if-ne v14, v5, :cond_d

    :cond_c
    const/16 v5, 0x3a

    goto :goto_8

    :cond_d
    const/16 v5, 0x20

    goto :goto_9

    :goto_8
    if-ne v2, v5, :cond_d

    if-ne v15, v5, :cond_d

    move v15, v4

    move/from16 v2, v17

    move/from16 v11, v18

    move/from16 v4, v19

    move/from16 v14, v20

    move/from16 v5, v27

    move v8, v5

    goto/16 :goto_f

    :goto_9
    if-ne v3, v5, :cond_f

    if-ne v9, v5, :cond_f

    if-ne v14, v5, :cond_f

    const/16 v5, 0x3a

    if-ne v4, v5, :cond_f

    if-ne v12, v5, :cond_f

    .line 1044
    invoke-static {v6, v7, v8}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v3

    if-lez v3, :cond_e

    .line 1045
    div-int/lit8 v4, v3, 0xa

    add-int/lit8 v4, v4, 0x30

    int-to-char v9, v4

    .line 1046
    rem-int/lit8 v3, v3, 0xa

    add-int/lit8 v3, v3, 0x30

    int-to-char v3, v3

    move v4, v2

    move v2, v10

    move v7, v13

    move v8, v15

    move/from16 v13, v17

    move/from16 v6, v18

    move/from16 v12, v19

    move/from16 v15, v20

    move/from16 v5, v27

    move v14, v5

    move v10, v3

    move v3, v11

    move v11, v14

    goto/16 :goto_f

    .line 1047
    :cond_e
    new-instance v2, Ljava/lang/String;

    const/16 v3, 0x12

    invoke-direct {v2, v0, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 1048
    new-instance v0, Ljava/time/format/DateTimeParseException;

    move-object/from16 v5, v21

    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_f
    move-object/from16 v5, v21

    move/from16 v21, v4

    const/16 v4, 0x20

    if-ne v3, v4, :cond_12

    if-ne v9, v4, :cond_12

    if-ne v14, v4, :cond_12

    const/16 v4, 0x3a

    if-ne v2, v4, :cond_11

    if-ne v12, v4, :cond_11

    .line 1049
    invoke-static {v6, v7, v8}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v2

    if-lez v2, :cond_10

    .line 1050
    div-int/lit8 v3, v2, 0xa

    add-int/lit8 v3, v3, 0x30

    int-to-char v9, v3

    .line 1051
    rem-int/lit8 v2, v2, 0xa

    add-int/lit8 v2, v2, 0x30

    int-to-char v2, v2

    move v3, v10

    move v10, v2

    move v2, v3

    move v3, v11

    move v7, v13

    move v8, v15

    move/from16 v13, v17

    move/from16 v6, v18

    move/from16 v12, v19

    move/from16 v14, v20

    move/from16 v15, v21

    move/from16 v4, v27

    move v11, v4

    :goto_a
    move-object/from16 v21, v5

    move v5, v11

    goto/16 :goto_f

    .line 1052
    :cond_10
    new-instance v2, Ljava/lang/String;

    const/16 v3, 0x12

    invoke-direct {v2, v0, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 1053
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_11
    const/16 v4, 0x20

    :cond_12
    if-ne v3, v4, :cond_15

    if-ne v9, v4, :cond_15

    if-ne v14, v4, :cond_15

    const/16 v4, 0x3a

    if-ne v2, v4, :cond_14

    if-ne v15, v4, :cond_14

    .line 1054
    invoke-static {v6, v7, v8}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v2

    if-lez v2, :cond_13

    .line 1055
    div-int/lit8 v3, v2, 0xa

    add-int/lit8 v3, v3, 0x30

    int-to-char v9, v3

    .line 1056
    rem-int/lit8 v2, v2, 0xa

    add-int/lit8 v2, v2, 0x30

    int-to-char v2, v2

    move v3, v10

    move v10, v2

    move v2, v3

    move v3, v11

    move v7, v13

    move/from16 v13, v17

    move/from16 v6, v18

    move/from16 v4, v19

    move/from16 v14, v20

    move/from16 v15, v21

    move/from16 v8, v27

    move v11, v8

    goto :goto_a

    .line 1057
    :cond_13
    new-instance v2, Ljava/lang/String;

    const/16 v3, 0x12

    invoke-direct {v2, v0, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 1058
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_14
    const/16 v4, 0x20

    :cond_15
    if-ne v6, v4, :cond_19

    if-ne v10, v4, :cond_19

    move/from16 v22, v3

    move/from16 v3, v20

    if-ne v3, v4, :cond_18

    move/from16 v4, v19

    move/from16 v19, v11

    const/16 v11, 0x3a

    if-ne v4, v11, :cond_17

    if-ne v15, v11, :cond_17

    .line 1059
    invoke-static {v7, v8, v9}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v3

    if-lez v3, :cond_16

    .line 1060
    div-int/lit8 v4, v3, 0xa

    add-int/lit8 v4, v4, 0x30

    int-to-char v9, v4

    .line 1061
    rem-int/lit8 v3, v3, 0xa

    add-int/lit8 v3, v3, 0x30

    int-to-char v3, v3

    move v15, v2

    move v10, v3

    move v6, v13

    move v7, v14

    move/from16 v11, v17

    move/from16 v3, v18

    move/from16 v2, v19

    move/from16 v14, v21

    move/from16 v13, v22

    move/from16 v4, v27

    move v8, v4

    move-object/from16 v21, v5

    move v5, v8

    goto/16 :goto_f

    .line 1062
    :cond_16
    new-instance v2, Ljava/lang/String;

    const/16 v3, 0x12

    invoke-direct {v2, v0, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 1063
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_17
    :goto_b
    const/16 v11, 0x20

    goto :goto_d

    :cond_18
    move/from16 v4, v19

    :goto_c
    move/from16 v19, v11

    goto :goto_b

    :cond_19
    move/from16 v22, v3

    move/from16 v4, v19

    move/from16 v3, v20

    goto :goto_c

    :goto_d
    if-ne v6, v11, :cond_1c

    if-ne v10, v11, :cond_1c

    if-ne v3, v11, :cond_1c

    const/16 v11, 0x3a

    if-ne v2, v11, :cond_1b

    if-ne v15, v11, :cond_1b

    .line 1064
    invoke-static {v7, v8, v9}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v2

    if-lez v2, :cond_1a

    .line 1065
    div-int/lit8 v3, v2, 0xa

    add-int/lit8 v3, v3, 0x30

    int-to-char v9, v3

    .line 1066
    rem-int/lit8 v2, v2, 0xa

    add-int/lit8 v2, v2, 0x30

    int-to-char v2, v2

    move v10, v2

    move v6, v13

    move v7, v14

    move/from16 v11, v17

    move/from16 v3, v18

    move/from16 v2, v19

    move/from16 v15, v21

    move/from16 v13, v22

    move/from16 v8, v27

    move v14, v8

    :goto_e
    move-object/from16 v21, v5

    move v5, v14

    goto :goto_f

    .line 1067
    :cond_1a
    new-instance v2, Ljava/lang/String;

    const/16 v3, 0x12

    invoke-direct {v2, v0, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 1068
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_1b
    const/16 v11, 0x20

    :cond_1c
    if-ne v6, v11, :cond_25

    if-ne v10, v11, :cond_25

    if-ne v3, v11, :cond_25

    const/16 v11, 0x3a

    if-ne v2, v11, :cond_25

    if-ne v12, v11, :cond_25

    .line 1069
    invoke-static {v7, v8, v9}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v2

    if-lez v2, :cond_24

    .line 1070
    div-int/lit8 v3, v2, 0xa

    add-int/lit8 v3, v3, 0x30

    int-to-char v9, v3

    .line 1071
    rem-int/lit8 v2, v2, 0xa

    add-int/lit8 v2, v2, 0x30

    int-to-char v2, v2

    move v10, v2

    move v12, v4

    move v6, v13

    move v7, v14

    move v8, v15

    move/from16 v11, v17

    move/from16 v3, v18

    move/from16 v2, v19

    move/from16 v15, v21

    move/from16 v13, v22

    move/from16 v4, v27

    move v14, v4

    goto :goto_e

    :goto_f
    if-lt v2, v5, :cond_23

    const/16 v0, 0x39

    if-gt v2, v0, :cond_22

    if-lt v3, v5, :cond_22

    if-gt v3, v0, :cond_22

    if-lt v6, v5, :cond_22

    if-gt v6, v0, :cond_22

    if-lt v7, v5, :cond_22

    if-gt v7, v0, :cond_22

    sub-int/2addr v2, v5

    mul-int/lit16 v2, v2, 0x3e8

    const/16 v0, 0x64

    .line 1072
    invoke-static {v3, v5, v0, v2}, Lp/a;->z(IIII)I

    move-result v0

    move/from16 v2, v24

    invoke-static {v6, v5, v2, v0}, Lp/a;->z(IIII)I

    move-result v0

    sub-int/2addr v7, v5

    add-int v22, v7, v0

    if-lt v9, v5, :cond_21

    const/16 v0, 0x39

    if-gt v9, v0, :cond_21

    if-lt v10, v5, :cond_21

    if-gt v10, v0, :cond_21

    sub-int/2addr v9, v5

    mul-int/2addr v9, v2

    sub-int/2addr v10, v5

    add-int v23, v10, v9

    if-lt v11, v5, :cond_20

    if-gt v11, v0, :cond_20

    if-lt v13, v5, :cond_20

    if-gt v13, v0, :cond_20

    sub-int/2addr v11, v5

    mul-int/2addr v11, v2

    sub-int/2addr v13, v5

    add-int v24, v13, v11

    if-lt v14, v5, :cond_1f

    if-gt v14, v0, :cond_1f

    if-lt v15, v5, :cond_1f

    if-gt v15, v0, :cond_1f

    sub-int/2addr v14, v5

    mul-int/2addr v14, v2

    sub-int/2addr v15, v5

    add-int v25, v15, v14

    if-lt v4, v5, :cond_1e

    if-gt v4, v0, :cond_1e

    if-lt v12, v5, :cond_1e

    if-gt v12, v0, :cond_1e

    sub-int/2addr v4, v5

    mul-int/2addr v4, v2

    sub-int/2addr v12, v5

    add-int v26, v12, v4

    if-lt v8, v5, :cond_1d

    if-gt v8, v0, :cond_1d

    move/from16 v3, v16

    if-lt v3, v5, :cond_1d

    if-gt v3, v0, :cond_1d

    sub-int/2addr v8, v5

    mul-int/2addr v8, v2

    add-int/lit8 v5, v3, -0x30

    add-int v27, v5, v8

    .line 1073
    invoke-static/range {v22 .. v27}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    move-result-object v0

    return-object v0

    .line 1074
    :cond_1d
    new-instance v0, Ljava/lang/String;

    const/16 v3, 0x12

    move-object/from16 v2, p0

    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 1075
    new-instance v1, Ljava/time/format/DateTimeParseException;

    move-object/from16 v5, v21

    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    invoke-direct {v1, v2, v0, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :cond_1e
    move-object/from16 v2, p0

    move-object/from16 v5, v21

    const/16 v3, 0x12

    const/4 v4, 0x0

    .line 1076
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 1077
    new-instance v1, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :cond_1f
    move-object/from16 v2, p0

    move-object/from16 v5, v21

    const/16 v3, 0x12

    const/4 v4, 0x0

    .line 1078
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 1079
    new-instance v1, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :cond_20
    move-object/from16 v2, p0

    move-object/from16 v5, v21

    const/16 v3, 0x12

    const/4 v4, 0x0

    .line 1080
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 1081
    new-instance v1, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :cond_21
    move-object/from16 v2, p0

    move-object/from16 v5, v21

    const/16 v3, 0x12

    const/4 v4, 0x0

    .line 1082
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 1083
    new-instance v1, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :cond_22
    move-object/from16 v2, p0

    :goto_10
    move-object/from16 v5, v21

    goto :goto_11

    :cond_23
    move-object v2, v0

    goto :goto_10

    .line 1084
    :goto_11
    new-instance v0, Ljava/lang/String;

    const/16 v3, 0x12

    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 1085
    new-instance v1, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    invoke-direct {v1, v2, v0, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :cond_24
    move-object v2, v0

    const/16 v3, 0x12

    const/4 v4, 0x0

    .line 1086
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 1087
    new-instance v1, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :cond_25
    move-object v2, v0

    const/16 v3, 0x12

    const/4 v4, 0x0

    .line 1088
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 1089
    new-instance v1, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :cond_26
    move-object v2, v0

    const/4 v4, 0x0

    .line 1090
    new-instance v0, Ljava/lang/String;

    array-length v3, v2

    sub-int/2addr v3, v1

    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 1091
    new-instance v1, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1
.end method

.method public static parseLocalDateTime19(Ljava/lang/String;I)Ljava/time/LocalDateTime;
    .locals 3

    add-int/lit8 v0, p1, 0x13

    .line 281
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-le v0, v1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/16 v1, 0x13

    .line 282
    new-array v1, v1, [C

    const/4 v2, 0x0

    .line 283
    invoke-virtual {p0, p1, v0, v1, v2}, Ljava/lang/String;->getChars(II[CI)V

    .line 284
    invoke-static {v1, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime19([CI)Ljava/time/LocalDateTime;

    move-result-object p0

    return-object p0
.end method

.method public static parseLocalDateTime19([BI)Ljava/time/LocalDateTime;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    add-int/lit8 v1, p1, 0x13

    .line 4
    .line 5
    array-length v2, v0

    .line 6
    const/4 v3, 0x0

    .line 7
    if-le v1, v2, :cond_0

    .line 8
    .line 9
    return-object v3

    .line 10
    :cond_0
    aget-byte v1, v0, p1

    .line 11
    .line 12
    int-to-char v1, v1

    .line 13
    add-int/lit8 v2, p1, 0x1

    .line 14
    .line 15
    aget-byte v2, v0, v2

    .line 16
    .line 17
    int-to-char v2, v2

    .line 18
    add-int/lit8 v4, p1, 0x2

    .line 19
    .line 20
    aget-byte v4, v0, v4

    .line 21
    .line 22
    int-to-char v4, v4

    .line 23
    add-int/lit8 v5, p1, 0x3

    .line 24
    .line 25
    aget-byte v5, v0, v5

    .line 26
    .line 27
    int-to-char v5, v5

    .line 28
    add-int/lit8 v6, p1, 0x4

    .line 29
    .line 30
    aget-byte v6, v0, v6

    .line 31
    .line 32
    int-to-char v6, v6

    .line 33
    add-int/lit8 v7, p1, 0x5

    .line 34
    .line 35
    aget-byte v7, v0, v7

    .line 36
    .line 37
    int-to-char v7, v7

    .line 38
    add-int/lit8 v8, p1, 0x6

    .line 39
    .line 40
    aget-byte v8, v0, v8

    .line 41
    .line 42
    int-to-char v8, v8

    .line 43
    add-int/lit8 v9, p1, 0x7

    .line 44
    .line 45
    aget-byte v9, v0, v9

    .line 46
    .line 47
    int-to-char v9, v9

    .line 48
    add-int/lit8 v10, p1, 0x8

    .line 49
    .line 50
    aget-byte v10, v0, v10

    .line 51
    .line 52
    int-to-char v10, v10

    .line 53
    add-int/lit8 v11, p1, 0x9

    .line 54
    .line 55
    aget-byte v11, v0, v11

    .line 56
    .line 57
    int-to-char v11, v11

    .line 58
    add-int/lit8 v12, p1, 0xa

    .line 59
    .line 60
    aget-byte v12, v0, v12

    .line 61
    .line 62
    int-to-char v12, v12

    .line 63
    add-int/lit8 v13, p1, 0xb

    .line 64
    .line 65
    aget-byte v13, v0, v13

    .line 66
    .line 67
    int-to-char v13, v13

    .line 68
    add-int/lit8 v14, p1, 0xc

    .line 69
    .line 70
    aget-byte v14, v0, v14

    .line 71
    .line 72
    int-to-char v14, v14

    .line 73
    add-int/lit8 v15, p1, 0xd

    .line 74
    .line 75
    aget-byte v15, v0, v15

    .line 76
    .line 77
    int-to-char v15, v15

    .line 78
    add-int/lit8 v16, p1, 0xe

    .line 79
    .line 80
    move-object/from16 v17, v3

    .line 81
    .line 82
    aget-byte v3, v0, v16

    .line 83
    .line 84
    int-to-char v3, v3

    .line 85
    add-int/lit8 v16, p1, 0xf

    .line 86
    .line 87
    aget-byte v0, p0, v16

    .line 88
    .line 89
    int-to-char v0, v0

    .line 90
    add-int/lit8 v16, p1, 0x10

    .line 91
    .line 92
    move/from16 v25, v0

    .line 93
    .line 94
    aget-byte v0, p0, v16

    .line 95
    .line 96
    int-to-char v0, v0

    .line 97
    add-int/lit8 v16, p1, 0x11

    .line 98
    .line 99
    move/from16 v18, v1

    .line 100
    .line 101
    aget-byte v1, p0, v16

    .line 102
    .line 103
    int-to-char v1, v1

    .line 104
    add-int/lit8 v16, p1, 0x12

    .line 105
    .line 106
    move/from16 v26, v1

    .line 107
    .line 108
    aget-byte v1, p0, v16

    .line 109
    .line 110
    int-to-char v1, v1

    .line 111
    move/from16 v27, v1

    .line 112
    .line 113
    const/16 v1, 0x2d

    .line 114
    .line 115
    if-ne v6, v1, :cond_2

    .line 116
    .line 117
    if-ne v9, v1, :cond_2

    .line 118
    .line 119
    const/16 v1, 0x20

    .line 120
    .line 121
    if-eq v12, v1, :cond_1

    .line 122
    .line 123
    const/16 v1, 0x54

    .line 124
    .line 125
    if-ne v12, v1, :cond_2

    .line 126
    .line 127
    :cond_1
    const/16 v1, 0x3a

    .line 128
    .line 129
    if-ne v15, v1, :cond_2

    .line 130
    .line 131
    if-ne v0, v1, :cond_2

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_2
    const/16 v1, 0x2f

    .line 135
    .line 136
    if-ne v6, v1, :cond_5

    .line 137
    .line 138
    if-ne v9, v1, :cond_5

    .line 139
    .line 140
    const/16 v1, 0x20

    .line 141
    .line 142
    if-eq v12, v1, :cond_3

    .line 143
    .line 144
    const/16 v1, 0x54

    .line 145
    .line 146
    if-ne v12, v1, :cond_4

    .line 147
    .line 148
    :cond_3
    const/16 v1, 0x3a

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_4
    const/16 v1, 0x2f

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :goto_0
    if-ne v15, v1, :cond_4

    .line 155
    .line 156
    if-ne v0, v1, :cond_4

    .line 157
    .line 158
    :goto_1
    move v15, v2

    .line 159
    move/from16 v24, v3

    .line 160
    .line 161
    move/from16 v16, v4

    .line 162
    .line 163
    move/from16 v17, v5

    .line 164
    .line 165
    move/from16 v19, v8

    .line 166
    .line 167
    move/from16 v20, v10

    .line 168
    .line 169
    move/from16 v21, v11

    .line 170
    .line 171
    move/from16 v22, v13

    .line 172
    .line 173
    move/from16 v23, v14

    .line 174
    .line 175
    move/from16 v14, v18

    .line 176
    .line 177
    move/from16 v18, v7

    .line 178
    .line 179
    goto/16 :goto_7

    .line 180
    .line 181
    :cond_5
    :goto_2
    if-ne v4, v1, :cond_7

    .line 182
    .line 183
    if-ne v7, v1, :cond_7

    .line 184
    .line 185
    const/16 v1, 0x20

    .line 186
    .line 187
    if-eq v12, v1, :cond_6

    .line 188
    .line 189
    const/16 v1, 0x54

    .line 190
    .line 191
    if-ne v12, v1, :cond_7

    .line 192
    .line 193
    :cond_6
    const/16 v1, 0x3a

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_7
    const/16 v1, 0x20

    .line 197
    .line 198
    goto :goto_5

    .line 199
    :goto_3
    if-ne v15, v1, :cond_7

    .line 200
    .line 201
    if-ne v0, v1, :cond_7

    .line 202
    .line 203
    move/from16 v21, v2

    .line 204
    .line 205
    move/from16 v24, v3

    .line 206
    .line 207
    move/from16 v19, v6

    .line 208
    .line 209
    move v15, v9

    .line 210
    move/from16 v16, v10

    .line 211
    .line 212
    move/from16 v17, v11

    .line 213
    .line 214
    move/from16 v22, v13

    .line 215
    .line 216
    move/from16 v23, v14

    .line 217
    .line 218
    move/from16 v20, v18

    .line 219
    .line 220
    :goto_4
    move/from16 v18, v5

    .line 221
    .line 222
    move v14, v8

    .line 223
    goto :goto_7

    .line 224
    :goto_5
    if-ne v2, v1, :cond_9

    .line 225
    .line 226
    if-ne v7, v1, :cond_9

    .line 227
    .line 228
    if-ne v12, v1, :cond_9

    .line 229
    .line 230
    const/16 v1, 0x3a

    .line 231
    .line 232
    if-ne v15, v1, :cond_9

    .line 233
    .line 234
    if-ne v0, v1, :cond_9

    .line 235
    .line 236
    invoke-static {v4, v5, v6}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    const/16 v1, 0x30

    .line 241
    .line 242
    if-lez v0, :cond_8

    .line 243
    .line 244
    div-int/lit8 v2, v0, 0xa

    .line 245
    .line 246
    add-int/2addr v2, v1

    .line 247
    int-to-char v2, v2

    .line 248
    rem-int/lit8 v0, v0, 0xa

    .line 249
    .line 250
    add-int/2addr v0, v1

    .line 251
    int-to-char v0, v0

    .line 252
    move v6, v0

    .line 253
    move v5, v2

    .line 254
    goto :goto_6

    .line 255
    :cond_8
    move v5, v1

    .line 256
    move v6, v5

    .line 257
    :goto_6
    move/from16 v20, v1

    .line 258
    .line 259
    move/from16 v24, v3

    .line 260
    .line 261
    move/from16 v19, v6

    .line 262
    .line 263
    move v15, v9

    .line 264
    move/from16 v16, v10

    .line 265
    .line 266
    move/from16 v17, v11

    .line 267
    .line 268
    move/from16 v22, v13

    .line 269
    .line 270
    move/from16 v23, v14

    .line 271
    .line 272
    move/from16 v21, v18

    .line 273
    .line 274
    goto :goto_4

    .line 275
    :goto_7
    invoke-static/range {v14 .. v27}, Lcom/alibaba/fastjson2/util/DateUtils;->localDateTime(CCCCCCCCCCCCCC)Ljava/time/LocalDateTime;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    return-object v0

    .line 280
    :cond_9
    return-object v17
.end method

.method public static parseLocalDateTime19([CI)Ljava/time/LocalDateTime;
    .locals 28

    move-object/from16 v0, p0

    add-int/lit8 v1, p1, 0x13

    .line 285
    array-length v2, v0

    const/4 v3, 0x0

    if-le v1, v2, :cond_0

    return-object v3

    .line 286
    :cond_0
    aget-char v1, v0, p1

    add-int/lit8 v2, p1, 0x1

    .line 287
    aget-char v2, v0, v2

    add-int/lit8 v4, p1, 0x2

    .line 288
    aget-char v4, v0, v4

    add-int/lit8 v5, p1, 0x3

    .line 289
    aget-char v5, v0, v5

    add-int/lit8 v6, p1, 0x4

    .line 290
    aget-char v6, v0, v6

    add-int/lit8 v7, p1, 0x5

    .line 291
    aget-char v7, v0, v7

    add-int/lit8 v8, p1, 0x6

    .line 292
    aget-char v8, v0, v8

    add-int/lit8 v9, p1, 0x7

    .line 293
    aget-char v9, v0, v9

    add-int/lit8 v10, p1, 0x8

    .line 294
    aget-char v10, v0, v10

    add-int/lit8 v11, p1, 0x9

    .line 295
    aget-char v11, v0, v11

    add-int/lit8 v12, p1, 0xa

    .line 296
    aget-char v12, v0, v12

    add-int/lit8 v13, p1, 0xb

    .line 297
    aget-char v22, v0, v13

    add-int/lit8 v13, p1, 0xc

    .line 298
    aget-char v23, v0, v13

    add-int/lit8 v13, p1, 0xd

    .line 299
    aget-char v13, v0, v13

    add-int/lit8 v14, p1, 0xe

    .line 300
    aget-char v24, v0, v14

    add-int/lit8 v14, p1, 0xf

    .line 301
    aget-char v25, v0, v14

    add-int/lit8 v14, p1, 0x10

    .line 302
    aget-char v14, v0, v14

    add-int/lit8 v15, p1, 0x11

    .line 303
    aget-char v26, v0, v15

    add-int/lit8 v15, p1, 0x12

    .line 304
    aget-char v27, v0, v15

    const/16 v0, 0x2d

    move-object/from16 v16, v3

    const/16 v3, 0x20

    const/16 v15, 0x3a

    if-ne v6, v0, :cond_2

    if-ne v9, v0, :cond_2

    if-eq v12, v3, :cond_1

    const/16 v0, 0x54

    if-ne v12, v0, :cond_2

    :cond_1
    if-ne v13, v15, :cond_2

    if-ne v14, v15, :cond_2

    goto :goto_0

    :cond_2
    const/16 v0, 0x2f

    if-ne v6, v0, :cond_4

    if-ne v9, v0, :cond_4

    if-eq v12, v3, :cond_3

    const/16 v3, 0x54

    if-ne v12, v3, :cond_4

    :cond_3
    if-ne v13, v15, :cond_4

    if-ne v14, v15, :cond_4

    :goto_0
    move v14, v1

    move v15, v2

    move/from16 v16, v4

    move/from16 v17, v5

    move/from16 v18, v7

    move/from16 v19, v8

    move/from16 v20, v10

    move/from16 v21, v11

    goto :goto_5

    :cond_4
    if-ne v4, v0, :cond_5

    if-ne v7, v0, :cond_5

    const/16 v0, 0x20

    if-eq v12, v0, :cond_6

    const/16 v0, 0x54

    if-ne v12, v0, :cond_5

    goto :goto_1

    :cond_5
    const/16 v0, 0x20

    goto :goto_3

    :cond_6
    :goto_1
    if-ne v13, v15, :cond_5

    if-ne v14, v15, :cond_5

    move/from16 v20, v1

    move/from16 v21, v2

    :goto_2
    move/from16 v18, v5

    move/from16 v19, v6

    move v14, v8

    move v15, v9

    move/from16 v16, v10

    move/from16 v17, v11

    goto :goto_5

    :goto_3
    if-ne v2, v0, :cond_8

    if-ne v7, v0, :cond_8

    if-ne v12, v0, :cond_8

    if-ne v13, v15, :cond_8

    if-ne v14, v15, :cond_8

    .line 305
    invoke-static {v4, v5, v6}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v0

    const/16 v2, 0x30

    if-lez v0, :cond_7

    .line 306
    div-int/lit8 v3, v0, 0xa

    add-int/2addr v3, v2

    int-to-char v3, v3

    .line 307
    rem-int/lit8 v0, v0, 0xa

    add-int/2addr v0, v2

    int-to-char v0, v0

    move v6, v0

    move v5, v3

    goto :goto_4

    :cond_7
    move v5, v2

    move v6, v5

    :goto_4
    move/from16 v21, v1

    move/from16 v20, v2

    goto :goto_2

    .line 308
    :goto_5
    invoke-static/range {v14 .. v27}, Lcom/alibaba/fastjson2/util/DateUtils;->localDateTime(CCCCCCCCCCCCCC)Ljava/time/LocalDateTime;

    move-result-object v0

    return-object v0

    :cond_8
    return-object v16
.end method

.method public static parseLocalDateTime20([BI)Ljava/time/LocalDateTime;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    add-int/lit8 v1, p1, 0x13

    .line 4
    .line 5
    array-length v2, v0

    .line 6
    const/4 v3, 0x0

    .line 7
    if-le v1, v2, :cond_0

    .line 8
    .line 9
    return-object v3

    .line 10
    :cond_0
    aget-byte v2, v0, p1

    .line 11
    .line 12
    int-to-char v10, v2

    .line 13
    add-int/lit8 v2, p1, 0x1

    .line 14
    .line 15
    aget-byte v2, v0, v2

    .line 16
    .line 17
    int-to-char v11, v2

    .line 18
    add-int/lit8 v2, p1, 0x2

    .line 19
    .line 20
    aget-byte v2, v0, v2

    .line 21
    .line 22
    int-to-char v2, v2

    .line 23
    add-int/lit8 v4, p1, 0x3

    .line 24
    .line 25
    aget-byte v4, v0, v4

    .line 26
    .line 27
    int-to-char v4, v4

    .line 28
    add-int/lit8 v5, p1, 0x4

    .line 29
    .line 30
    aget-byte v5, v0, v5

    .line 31
    .line 32
    int-to-char v5, v5

    .line 33
    add-int/lit8 v6, p1, 0x5

    .line 34
    .line 35
    aget-byte v6, v0, v6

    .line 36
    .line 37
    int-to-char v6, v6

    .line 38
    add-int/lit8 v7, p1, 0x6

    .line 39
    .line 40
    aget-byte v7, v0, v7

    .line 41
    .line 42
    int-to-char v7, v7

    .line 43
    add-int/lit8 v8, p1, 0x7

    .line 44
    .line 45
    aget-byte v8, v0, v8

    .line 46
    .line 47
    int-to-char v8, v8

    .line 48
    add-int/lit8 v9, p1, 0x8

    .line 49
    .line 50
    aget-byte v9, v0, v9

    .line 51
    .line 52
    int-to-char v9, v9

    .line 53
    add-int/lit8 v12, p1, 0x9

    .line 54
    .line 55
    aget-byte v12, v0, v12

    .line 56
    .line 57
    int-to-char v12, v12

    .line 58
    add-int/lit8 v13, p1, 0xa

    .line 59
    .line 60
    aget-byte v13, v0, v13

    .line 61
    .line 62
    int-to-char v13, v13

    .line 63
    add-int/lit8 v14, p1, 0xb

    .line 64
    .line 65
    aget-byte v14, v0, v14

    .line 66
    .line 67
    int-to-char v14, v14

    .line 68
    add-int/lit8 v15, p1, 0xc

    .line 69
    .line 70
    aget-byte v15, v0, v15

    .line 71
    .line 72
    int-to-char v15, v15

    .line 73
    add-int/lit8 v16, p1, 0xd

    .line 74
    .line 75
    move-object/from16 v17, v3

    .line 76
    .line 77
    aget-byte v3, v0, v16

    .line 78
    .line 79
    int-to-char v3, v3

    .line 80
    add-int/lit8 v16, p1, 0xe

    .line 81
    .line 82
    aget-byte v0, p0, v16

    .line 83
    .line 84
    int-to-char v0, v0

    .line 85
    add-int/lit8 v16, p1, 0xf

    .line 86
    .line 87
    move/from16 v18, v1

    .line 88
    .line 89
    aget-byte v1, p0, v16

    .line 90
    .line 91
    int-to-char v1, v1

    .line 92
    add-int/lit8 v16, p1, 0x10

    .line 93
    .line 94
    move/from16 v19, v1

    .line 95
    .line 96
    aget-byte v1, p0, v16

    .line 97
    .line 98
    int-to-char v1, v1

    .line 99
    add-int/lit8 v16, p1, 0x11

    .line 100
    .line 101
    move/from16 v20, v1

    .line 102
    .line 103
    aget-byte v1, p0, v16

    .line 104
    .line 105
    int-to-char v1, v1

    .line 106
    add-int/lit8 v16, p1, 0x12

    .line 107
    .line 108
    move/from16 v21, v3

    .line 109
    .line 110
    aget-byte v3, p0, v16

    .line 111
    .line 112
    int-to-char v3, v3

    .line 113
    move/from16 v16, v3

    .line 114
    .line 115
    aget-byte v3, p0, v18

    .line 116
    .line 117
    int-to-char v3, v3

    .line 118
    move/from16 v18, v3

    .line 119
    .line 120
    const/16 v3, 0x20

    .line 121
    .line 122
    if-ne v2, v3, :cond_3

    .line 123
    .line 124
    if-ne v7, v3, :cond_3

    .line 125
    .line 126
    if-ne v14, v3, :cond_3

    .line 127
    .line 128
    const/16 v2, 0x3a

    .line 129
    .line 130
    if-ne v0, v2, :cond_3

    .line 131
    .line 132
    if-eq v1, v2, :cond_1

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_1
    invoke-static {v4, v5, v6}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    const/16 v1, 0x30

    .line 140
    .line 141
    if-lez v0, :cond_2

    .line 142
    .line 143
    div-int/lit8 v2, v0, 0xa

    .line 144
    .line 145
    add-int/2addr v2, v1

    .line 146
    int-to-char v2, v2

    .line 147
    rem-int/lit8 v0, v0, 0xa

    .line 148
    .line 149
    add-int/2addr v0, v1

    .line 150
    int-to-char v1, v0

    .line 151
    move v4, v8

    .line 152
    move v5, v9

    .line 153
    move v9, v1

    .line 154
    move v8, v2

    .line 155
    :goto_0
    move v6, v12

    .line 156
    move v7, v13

    .line 157
    move v12, v15

    .line 158
    move/from16 v17, v18

    .line 159
    .line 160
    move/from16 v14, v19

    .line 161
    .line 162
    move/from16 v15, v20

    .line 163
    .line 164
    move/from16 v13, v21

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_2
    move v4, v8

    .line 168
    move v5, v9

    .line 169
    move v8, v1

    .line 170
    move v9, v8

    .line 171
    goto :goto_0

    .line 172
    :goto_1
    invoke-static/range {v4 .. v17}, Lcom/alibaba/fastjson2/util/DateUtils;->localDateTime(CCCCCCCCCCCCCC)Ljava/time/LocalDateTime;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    return-object v0

    .line 177
    :cond_3
    :goto_2
    return-object v17
.end method

.method public static parseLocalDateTime20([CI)Ljava/time/LocalDateTime;
    .locals 21

    move-object/from16 v0, p0

    add-int/lit8 v1, p1, 0x13

    .line 178
    array-length v2, v0

    const/4 v3, 0x0

    if-le v1, v2, :cond_0

    return-object v3

    .line 179
    :cond_0
    aget-char v10, v0, p1

    add-int/lit8 v2, p1, 0x1

    .line 180
    aget-char v11, v0, v2

    add-int/lit8 v2, p1, 0x2

    .line 181
    aget-char v2, v0, v2

    add-int/lit8 v4, p1, 0x3

    .line 182
    aget-char v4, v0, v4

    add-int/lit8 v5, p1, 0x4

    .line 183
    aget-char v5, v0, v5

    add-int/lit8 v6, p1, 0x5

    .line 184
    aget-char v6, v0, v6

    add-int/lit8 v7, p1, 0x6

    .line 185
    aget-char v7, v0, v7

    add-int/lit8 v8, p1, 0x7

    .line 186
    aget-char v8, v0, v8

    add-int/lit8 v9, p1, 0x8

    .line 187
    aget-char v9, v0, v9

    add-int/lit8 v12, p1, 0x9

    .line 188
    aget-char v12, v0, v12

    add-int/lit8 v13, p1, 0xa

    .line 189
    aget-char v13, v0, v13

    add-int/lit8 v14, p1, 0xb

    .line 190
    aget-char v14, v0, v14

    add-int/lit8 v15, p1, 0xc

    .line 191
    aget-char v15, v0, v15

    add-int/lit8 v16, p1, 0xd

    .line 192
    aget-char v16, v0, v16

    add-int/lit8 v17, p1, 0xe

    move-object/from16 v18, v3

    .line 193
    aget-char v3, v0, v17

    add-int/lit8 v17, p1, 0xf

    .line 194
    aget-char v17, v0, v17

    add-int/lit8 v19, p1, 0x10

    .line 195
    aget-char v19, v0, v19

    add-int/lit8 v20, p1, 0x11

    .line 196
    aget-char v0, p0, v20

    add-int/lit8 v20, p1, 0x12

    .line 197
    aget-char v20, p0, v20

    .line 198
    aget-char v1, p0, v1

    move/from16 p0, v1

    const/16 v1, 0x20

    if-ne v2, v1, :cond_3

    if-ne v7, v1, :cond_3

    if-ne v14, v1, :cond_3

    const/16 v1, 0x3a

    if-ne v3, v1, :cond_3

    if-eq v0, v1, :cond_1

    goto :goto_2

    .line 199
    :cond_1
    invoke-static {v4, v5, v6}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v0

    const/16 v1, 0x30

    if-lez v0, :cond_2

    .line 200
    div-int/lit8 v2, v0, 0xa

    add-int/2addr v2, v1

    int-to-char v2, v2

    .line 201
    rem-int/lit8 v0, v0, 0xa

    add-int/2addr v0, v1

    int-to-char v1, v0

    move v4, v8

    move v5, v9

    move v9, v1

    move v8, v2

    :goto_0
    move v6, v12

    move v7, v13

    move v12, v15

    move/from16 v13, v16

    move/from16 v14, v17

    move/from16 v15, v19

    move/from16 v16, v20

    move/from16 v17, p0

    goto :goto_1

    :cond_2
    move v4, v8

    move v5, v9

    move v8, v1

    move v9, v8

    goto :goto_0

    .line 202
    :goto_1
    invoke-static/range {v4 .. v17}, Lcom/alibaba/fastjson2/util/DateUtils;->localDateTime(CCCCCCCCCCCCCC)Ljava/time/LocalDateTime;

    move-result-object v0

    return-object v0

    :cond_3
    :goto_2
    return-object v18
.end method

.method public static parseLocalDateTime26([BI)Ljava/time/LocalDateTime;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    add-int/lit8 v1, p1, 0x1a

    .line 4
    .line 5
    array-length v2, v0

    .line 6
    const/4 v3, 0x0

    .line 7
    if-le v1, v2, :cond_0

    .line 8
    .line 9
    return-object v3

    .line 10
    :cond_0
    aget-byte v1, v0, p1

    .line 11
    .line 12
    int-to-char v4, v1

    .line 13
    add-int/lit8 v1, p1, 0x1

    .line 14
    .line 15
    aget-byte v1, v0, v1

    .line 16
    .line 17
    int-to-char v5, v1

    .line 18
    add-int/lit8 v1, p1, 0x2

    .line 19
    .line 20
    aget-byte v1, v0, v1

    .line 21
    .line 22
    int-to-char v6, v1

    .line 23
    add-int/lit8 v1, p1, 0x3

    .line 24
    .line 25
    aget-byte v1, v0, v1

    .line 26
    .line 27
    int-to-char v7, v1

    .line 28
    add-int/lit8 v1, p1, 0x4

    .line 29
    .line 30
    aget-byte v1, v0, v1

    .line 31
    .line 32
    int-to-char v1, v1

    .line 33
    add-int/lit8 v2, p1, 0x5

    .line 34
    .line 35
    aget-byte v2, v0, v2

    .line 36
    .line 37
    int-to-char v8, v2

    .line 38
    add-int/lit8 v2, p1, 0x6

    .line 39
    .line 40
    aget-byte v2, v0, v2

    .line 41
    .line 42
    int-to-char v9, v2

    .line 43
    add-int/lit8 v2, p1, 0x7

    .line 44
    .line 45
    aget-byte v2, v0, v2

    .line 46
    .line 47
    int-to-char v2, v2

    .line 48
    add-int/lit8 v10, p1, 0x8

    .line 49
    .line 50
    aget-byte v10, v0, v10

    .line 51
    .line 52
    int-to-char v10, v10

    .line 53
    add-int/lit8 v11, p1, 0x9

    .line 54
    .line 55
    aget-byte v11, v0, v11

    .line 56
    .line 57
    int-to-char v11, v11

    .line 58
    add-int/lit8 v12, p1, 0xa

    .line 59
    .line 60
    aget-byte v12, v0, v12

    .line 61
    .line 62
    int-to-char v12, v12

    .line 63
    add-int/lit8 v13, p1, 0xb

    .line 64
    .line 65
    aget-byte v13, v0, v13

    .line 66
    .line 67
    int-to-char v13, v13

    .line 68
    add-int/lit8 v14, p1, 0xc

    .line 69
    .line 70
    aget-byte v14, v0, v14

    .line 71
    .line 72
    int-to-char v14, v14

    .line 73
    add-int/lit8 v15, p1, 0xd

    .line 74
    .line 75
    aget-byte v15, v0, v15

    .line 76
    .line 77
    int-to-char v15, v15

    .line 78
    add-int/lit8 v16, p1, 0xe

    .line 79
    .line 80
    move-object/from16 v17, v3

    .line 81
    .line 82
    aget-byte v3, v0, v16

    .line 83
    .line 84
    int-to-char v3, v3

    .line 85
    add-int/lit8 v16, p1, 0xf

    .line 86
    .line 87
    aget-byte v0, p0, v16

    .line 88
    .line 89
    int-to-char v0, v0

    .line 90
    add-int/lit8 v16, p1, 0x10

    .line 91
    .line 92
    move/from16 v18, v0

    .line 93
    .line 94
    aget-byte v0, p0, v16

    .line 95
    .line 96
    int-to-char v0, v0

    .line 97
    add-int/lit8 v16, p1, 0x11

    .line 98
    .line 99
    move/from16 v19, v3

    .line 100
    .line 101
    aget-byte v3, p0, v16

    .line 102
    .line 103
    int-to-char v3, v3

    .line 104
    add-int/lit8 v16, p1, 0x12

    .line 105
    .line 106
    move/from16 v20, v3

    .line 107
    .line 108
    aget-byte v3, p0, v16

    .line 109
    .line 110
    int-to-char v3, v3

    .line 111
    add-int/lit8 v16, p1, 0x13

    .line 112
    .line 113
    move/from16 v21, v3

    .line 114
    .line 115
    aget-byte v3, p0, v16

    .line 116
    .line 117
    int-to-char v3, v3

    .line 118
    add-int/lit8 v16, p1, 0x14

    .line 119
    .line 120
    move/from16 v22, v4

    .line 121
    .line 122
    aget-byte v4, p0, v16

    .line 123
    .line 124
    int-to-char v4, v4

    .line 125
    add-int/lit8 v16, p1, 0x15

    .line 126
    .line 127
    move/from16 v23, v4

    .line 128
    .line 129
    aget-byte v4, p0, v16

    .line 130
    .line 131
    int-to-char v4, v4

    .line 132
    add-int/lit8 v16, p1, 0x16

    .line 133
    .line 134
    move/from16 v24, v4

    .line 135
    .line 136
    aget-byte v4, p0, v16

    .line 137
    .line 138
    int-to-char v4, v4

    .line 139
    add-int/lit8 v16, p1, 0x17

    .line 140
    .line 141
    move/from16 v25, v4

    .line 142
    .line 143
    aget-byte v4, p0, v16

    .line 144
    .line 145
    int-to-char v4, v4

    .line 146
    add-int/lit8 v16, p1, 0x18

    .line 147
    .line 148
    move/from16 v26, v4

    .line 149
    .line 150
    aget-byte v4, p0, v16

    .line 151
    .line 152
    int-to-char v4, v4

    .line 153
    add-int/lit8 v16, p1, 0x19

    .line 154
    .line 155
    move/from16 v27, v4

    .line 156
    .line 157
    aget-byte v4, p0, v16

    .line 158
    .line 159
    int-to-char v4, v4

    .line 160
    move/from16 v16, v4

    .line 161
    .line 162
    const/16 v4, 0x2d

    .line 163
    .line 164
    if-ne v1, v4, :cond_3

    .line 165
    .line 166
    if-ne v2, v4, :cond_3

    .line 167
    .line 168
    const/16 v1, 0x20

    .line 169
    .line 170
    if-eq v12, v1, :cond_1

    .line 171
    .line 172
    const/16 v1, 0x54

    .line 173
    .line 174
    if-ne v12, v1, :cond_3

    .line 175
    .line 176
    :cond_1
    const/16 v1, 0x3a

    .line 177
    .line 178
    if-ne v15, v1, :cond_3

    .line 179
    .line 180
    if-ne v0, v1, :cond_3

    .line 181
    .line 182
    const/16 v0, 0x2e

    .line 183
    .line 184
    if-eq v3, v0, :cond_2

    .line 185
    .line 186
    goto :goto_0

    .line 187
    :cond_2
    move/from16 v15, v18

    .line 188
    .line 189
    move/from16 v18, v23

    .line 190
    .line 191
    move/from16 v23, v16

    .line 192
    .line 193
    move/from16 v16, v20

    .line 194
    .line 195
    move/from16 v20, v25

    .line 196
    .line 197
    const/16 v25, 0x30

    .line 198
    .line 199
    move/from16 v17, v21

    .line 200
    .line 201
    move/from16 v21, v26

    .line 202
    .line 203
    const/16 v26, 0x30

    .line 204
    .line 205
    move v12, v13

    .line 206
    move v13, v14

    .line 207
    move/from16 v14, v19

    .line 208
    .line 209
    move/from16 v19, v24

    .line 210
    .line 211
    const/16 v24, 0x30

    .line 212
    .line 213
    move/from16 v4, v22

    .line 214
    .line 215
    move/from16 v22, v27

    .line 216
    .line 217
    invoke-static/range {v4 .. v26}, Lcom/alibaba/fastjson2/util/DateUtils;->localDateTime(CCCCCCCCCCCCCCCCCCCCCCC)Ljava/time/LocalDateTime;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    return-object v0

    .line 222
    :cond_3
    :goto_0
    return-object v17
.end method

.method public static parseLocalDateTime26([CI)Ljava/time/LocalDateTime;
    .locals 28

    move-object/from16 v0, p0

    add-int/lit8 v1, p1, 0x1a

    .line 223
    array-length v2, v0

    const/4 v3, 0x0

    if-le v1, v2, :cond_0

    return-object v3

    .line 224
    :cond_0
    aget-char v4, v0, p1

    add-int/lit8 v1, p1, 0x1

    .line 225
    aget-char v5, v0, v1

    add-int/lit8 v1, p1, 0x2

    .line 226
    aget-char v6, v0, v1

    add-int/lit8 v1, p1, 0x3

    .line 227
    aget-char v7, v0, v1

    add-int/lit8 v1, p1, 0x4

    .line 228
    aget-char v1, v0, v1

    add-int/lit8 v2, p1, 0x5

    .line 229
    aget-char v8, v0, v2

    add-int/lit8 v2, p1, 0x6

    .line 230
    aget-char v9, v0, v2

    add-int/lit8 v2, p1, 0x7

    .line 231
    aget-char v2, v0, v2

    add-int/lit8 v10, p1, 0x8

    .line 232
    aget-char v10, v0, v10

    add-int/lit8 v11, p1, 0x9

    .line 233
    aget-char v11, v0, v11

    add-int/lit8 v12, p1, 0xa

    .line 234
    aget-char v12, v0, v12

    add-int/lit8 v13, p1, 0xb

    .line 235
    aget-char v13, v0, v13

    add-int/lit8 v14, p1, 0xc

    .line 236
    aget-char v14, v0, v14

    add-int/lit8 v15, p1, 0xd

    .line 237
    aget-char v15, v0, v15

    add-int/lit8 v16, p1, 0xe

    .line 238
    aget-char v16, v0, v16

    add-int/lit8 v17, p1, 0xf

    .line 239
    aget-char v17, v0, v17

    add-int/lit8 v18, p1, 0x10

    move-object/from16 v19, v3

    .line 240
    aget-char v3, v0, v18

    add-int/lit8 v18, p1, 0x11

    .line 241
    aget-char v18, v0, v18

    add-int/lit8 v20, p1, 0x12

    .line 242
    aget-char v20, v0, v20

    add-int/lit8 v21, p1, 0x13

    .line 243
    aget-char v0, p0, v21

    add-int/lit8 v21, p1, 0x14

    .line 244
    aget-char v21, p0, v21

    add-int/lit8 v22, p1, 0x15

    .line 245
    aget-char v22, p0, v22

    add-int/lit8 v23, p1, 0x16

    .line 246
    aget-char v23, p0, v23

    add-int/lit8 v24, p1, 0x17

    .line 247
    aget-char v24, p0, v24

    add-int/lit8 v25, p1, 0x18

    .line 248
    aget-char v25, p0, v25

    add-int/lit8 v26, p1, 0x19

    .line 249
    aget-char v26, p0, v26

    move/from16 v27, v4

    const/16 v4, 0x2d

    if-ne v1, v4, :cond_1

    if-ne v2, v4, :cond_1

    const/16 v1, 0x20

    if-eq v12, v1, :cond_2

    const/16 v1, 0x54

    if-ne v12, v1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    move-object/from16 v0, v19

    goto :goto_2

    :cond_2
    :goto_1
    const/16 v1, 0x3a

    if-ne v15, v1, :cond_1

    if-ne v3, v1, :cond_1

    const/16 v1, 0x2e

    if-eq v0, v1, :cond_3

    goto :goto_0

    :cond_3
    move/from16 v19, v22

    move/from16 v22, v25

    const/16 v25, 0x30

    move/from16 v15, v17

    move/from16 v17, v20

    move/from16 v20, v23

    move/from16 v23, v26

    const/16 v26, 0x30

    move v12, v13

    move v13, v14

    move/from16 v14, v16

    move/from16 v16, v18

    move/from16 v18, v21

    move/from16 v21, v24

    const/16 v24, 0x30

    move/from16 v4, v27

    .line 250
    invoke-static/range {v4 .. v26}, Lcom/alibaba/fastjson2/util/DateUtils;->localDateTime(CCCCCCCCCCCCCCCCCCCCCCC)Ljava/time/LocalDateTime;

    move-result-object v0

    :goto_2
    return-object v0
.end method

.method public static parseLocalDateTime27([BI)Ljava/time/LocalDateTime;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    add-int/lit8 v1, p1, 0x1b

    .line 4
    .line 5
    array-length v2, v0

    .line 6
    const/4 v3, 0x0

    .line 7
    if-le v1, v2, :cond_0

    .line 8
    .line 9
    return-object v3

    .line 10
    :cond_0
    aget-byte v1, v0, p1

    .line 11
    .line 12
    int-to-char v4, v1

    .line 13
    add-int/lit8 v1, p1, 0x1

    .line 14
    .line 15
    aget-byte v1, v0, v1

    .line 16
    .line 17
    int-to-char v5, v1

    .line 18
    add-int/lit8 v1, p1, 0x2

    .line 19
    .line 20
    aget-byte v1, v0, v1

    .line 21
    .line 22
    int-to-char v6, v1

    .line 23
    add-int/lit8 v1, p1, 0x3

    .line 24
    .line 25
    aget-byte v1, v0, v1

    .line 26
    .line 27
    int-to-char v7, v1

    .line 28
    add-int/lit8 v1, p1, 0x4

    .line 29
    .line 30
    aget-byte v1, v0, v1

    .line 31
    .line 32
    int-to-char v1, v1

    .line 33
    add-int/lit8 v2, p1, 0x5

    .line 34
    .line 35
    aget-byte v2, v0, v2

    .line 36
    .line 37
    int-to-char v8, v2

    .line 38
    add-int/lit8 v2, p1, 0x6

    .line 39
    .line 40
    aget-byte v2, v0, v2

    .line 41
    .line 42
    int-to-char v9, v2

    .line 43
    add-int/lit8 v2, p1, 0x7

    .line 44
    .line 45
    aget-byte v2, v0, v2

    .line 46
    .line 47
    int-to-char v2, v2

    .line 48
    add-int/lit8 v10, p1, 0x8

    .line 49
    .line 50
    aget-byte v10, v0, v10

    .line 51
    .line 52
    int-to-char v10, v10

    .line 53
    add-int/lit8 v11, p1, 0x9

    .line 54
    .line 55
    aget-byte v11, v0, v11

    .line 56
    .line 57
    int-to-char v11, v11

    .line 58
    add-int/lit8 v12, p1, 0xa

    .line 59
    .line 60
    aget-byte v12, v0, v12

    .line 61
    .line 62
    int-to-char v12, v12

    .line 63
    add-int/lit8 v13, p1, 0xb

    .line 64
    .line 65
    aget-byte v13, v0, v13

    .line 66
    .line 67
    int-to-char v13, v13

    .line 68
    add-int/lit8 v14, p1, 0xc

    .line 69
    .line 70
    aget-byte v14, v0, v14

    .line 71
    .line 72
    int-to-char v14, v14

    .line 73
    add-int/lit8 v15, p1, 0xd

    .line 74
    .line 75
    aget-byte v15, v0, v15

    .line 76
    .line 77
    int-to-char v15, v15

    .line 78
    add-int/lit8 v16, p1, 0xe

    .line 79
    .line 80
    move-object/from16 v17, v3

    .line 81
    .line 82
    aget-byte v3, v0, v16

    .line 83
    .line 84
    int-to-char v3, v3

    .line 85
    add-int/lit8 v16, p1, 0xf

    .line 86
    .line 87
    aget-byte v0, p0, v16

    .line 88
    .line 89
    int-to-char v0, v0

    .line 90
    add-int/lit8 v16, p1, 0x10

    .line 91
    .line 92
    move/from16 v18, v0

    .line 93
    .line 94
    aget-byte v0, p0, v16

    .line 95
    .line 96
    int-to-char v0, v0

    .line 97
    add-int/lit8 v16, p1, 0x11

    .line 98
    .line 99
    move/from16 v19, v3

    .line 100
    .line 101
    aget-byte v3, p0, v16

    .line 102
    .line 103
    int-to-char v3, v3

    .line 104
    add-int/lit8 v16, p1, 0x12

    .line 105
    .line 106
    move/from16 v20, v3

    .line 107
    .line 108
    aget-byte v3, p0, v16

    .line 109
    .line 110
    int-to-char v3, v3

    .line 111
    add-int/lit8 v16, p1, 0x13

    .line 112
    .line 113
    move/from16 v21, v3

    .line 114
    .line 115
    aget-byte v3, p0, v16

    .line 116
    .line 117
    int-to-char v3, v3

    .line 118
    add-int/lit8 v16, p1, 0x14

    .line 119
    .line 120
    move/from16 v22, v4

    .line 121
    .line 122
    aget-byte v4, p0, v16

    .line 123
    .line 124
    int-to-char v4, v4

    .line 125
    add-int/lit8 v16, p1, 0x15

    .line 126
    .line 127
    move/from16 v23, v4

    .line 128
    .line 129
    aget-byte v4, p0, v16

    .line 130
    .line 131
    int-to-char v4, v4

    .line 132
    add-int/lit8 v16, p1, 0x16

    .line 133
    .line 134
    move/from16 v24, v4

    .line 135
    .line 136
    aget-byte v4, p0, v16

    .line 137
    .line 138
    int-to-char v4, v4

    .line 139
    add-int/lit8 v16, p1, 0x17

    .line 140
    .line 141
    move/from16 v25, v4

    .line 142
    .line 143
    aget-byte v4, p0, v16

    .line 144
    .line 145
    int-to-char v4, v4

    .line 146
    add-int/lit8 v16, p1, 0x18

    .line 147
    .line 148
    move/from16 v26, v4

    .line 149
    .line 150
    aget-byte v4, p0, v16

    .line 151
    .line 152
    int-to-char v4, v4

    .line 153
    add-int/lit8 v16, p1, 0x19

    .line 154
    .line 155
    move/from16 v27, v4

    .line 156
    .line 157
    aget-byte v4, p0, v16

    .line 158
    .line 159
    int-to-char v4, v4

    .line 160
    add-int/lit8 v16, p1, 0x1a

    .line 161
    .line 162
    move/from16 v28, v4

    .line 163
    .line 164
    aget-byte v4, p0, v16

    .line 165
    .line 166
    int-to-char v4, v4

    .line 167
    move/from16 v16, v4

    .line 168
    .line 169
    const/16 v4, 0x2d

    .line 170
    .line 171
    if-ne v1, v4, :cond_3

    .line 172
    .line 173
    if-ne v2, v4, :cond_3

    .line 174
    .line 175
    const/16 v1, 0x20

    .line 176
    .line 177
    if-eq v12, v1, :cond_1

    .line 178
    .line 179
    const/16 v1, 0x54

    .line 180
    .line 181
    if-ne v12, v1, :cond_3

    .line 182
    .line 183
    :cond_1
    const/16 v1, 0x3a

    .line 184
    .line 185
    if-ne v15, v1, :cond_3

    .line 186
    .line 187
    if-ne v0, v1, :cond_3

    .line 188
    .line 189
    const/16 v0, 0x2e

    .line 190
    .line 191
    if-eq v3, v0, :cond_2

    .line 192
    .line 193
    goto :goto_0

    .line 194
    :cond_2
    move v12, v13

    .line 195
    move v13, v14

    .line 196
    move/from16 v14, v19

    .line 197
    .line 198
    move/from16 v19, v24

    .line 199
    .line 200
    move/from16 v24, v16

    .line 201
    .line 202
    move/from16 v16, v20

    .line 203
    .line 204
    move/from16 v20, v25

    .line 205
    .line 206
    const/16 v25, 0x30

    .line 207
    .line 208
    move/from16 v17, v21

    .line 209
    .line 210
    move/from16 v21, v26

    .line 211
    .line 212
    const/16 v26, 0x30

    .line 213
    .line 214
    move/from16 v15, v18

    .line 215
    .line 216
    move/from16 v4, v22

    .line 217
    .line 218
    move/from16 v18, v23

    .line 219
    .line 220
    move/from16 v22, v27

    .line 221
    .line 222
    move/from16 v23, v28

    .line 223
    .line 224
    invoke-static/range {v4 .. v26}, Lcom/alibaba/fastjson2/util/DateUtils;->localDateTime(CCCCCCCCCCCCCCCCCCCCCCC)Ljava/time/LocalDateTime;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    return-object v0

    .line 229
    :cond_3
    :goto_0
    return-object v17
.end method

.method public static parseLocalDateTime27([CI)Ljava/time/LocalDateTime;
    .locals 29

    move-object/from16 v0, p0

    add-int/lit8 v1, p1, 0x1b

    .line 230
    array-length v2, v0

    const/4 v3, 0x0

    if-le v1, v2, :cond_0

    return-object v3

    .line 231
    :cond_0
    aget-char v4, v0, p1

    add-int/lit8 v1, p1, 0x1

    .line 232
    aget-char v5, v0, v1

    add-int/lit8 v1, p1, 0x2

    .line 233
    aget-char v6, v0, v1

    add-int/lit8 v1, p1, 0x3

    .line 234
    aget-char v7, v0, v1

    add-int/lit8 v1, p1, 0x4

    .line 235
    aget-char v1, v0, v1

    add-int/lit8 v2, p1, 0x5

    .line 236
    aget-char v8, v0, v2

    add-int/lit8 v2, p1, 0x6

    .line 237
    aget-char v9, v0, v2

    add-int/lit8 v2, p1, 0x7

    .line 238
    aget-char v2, v0, v2

    add-int/lit8 v10, p1, 0x8

    .line 239
    aget-char v10, v0, v10

    add-int/lit8 v11, p1, 0x9

    .line 240
    aget-char v11, v0, v11

    add-int/lit8 v12, p1, 0xa

    .line 241
    aget-char v12, v0, v12

    add-int/lit8 v13, p1, 0xb

    .line 242
    aget-char v13, v0, v13

    add-int/lit8 v14, p1, 0xc

    .line 243
    aget-char v14, v0, v14

    add-int/lit8 v15, p1, 0xd

    .line 244
    aget-char v15, v0, v15

    add-int/lit8 v16, p1, 0xe

    .line 245
    aget-char v16, v0, v16

    add-int/lit8 v17, p1, 0xf

    .line 246
    aget-char v17, v0, v17

    add-int/lit8 v18, p1, 0x10

    move-object/from16 v19, v3

    .line 247
    aget-char v3, v0, v18

    add-int/lit8 v18, p1, 0x11

    .line 248
    aget-char v18, v0, v18

    add-int/lit8 v20, p1, 0x12

    .line 249
    aget-char v20, v0, v20

    add-int/lit8 v21, p1, 0x13

    .line 250
    aget-char v0, p0, v21

    add-int/lit8 v21, p1, 0x14

    .line 251
    aget-char v21, p0, v21

    add-int/lit8 v22, p1, 0x15

    .line 252
    aget-char v22, p0, v22

    add-int/lit8 v23, p1, 0x16

    .line 253
    aget-char v23, p0, v23

    add-int/lit8 v24, p1, 0x17

    .line 254
    aget-char v24, p0, v24

    add-int/lit8 v25, p1, 0x18

    .line 255
    aget-char v25, p0, v25

    add-int/lit8 v26, p1, 0x19

    .line 256
    aget-char v26, p0, v26

    add-int/lit8 v27, p1, 0x1a

    .line 257
    aget-char v27, p0, v27

    move/from16 v28, v4

    const/16 v4, 0x2d

    if-ne v1, v4, :cond_1

    if-ne v2, v4, :cond_1

    const/16 v1, 0x20

    if-eq v12, v1, :cond_2

    const/16 v1, 0x54

    if-ne v12, v1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    move-object/from16 v0, v19

    goto :goto_2

    :cond_2
    :goto_1
    const/16 v1, 0x3a

    if-ne v15, v1, :cond_1

    if-ne v3, v1, :cond_1

    const/16 v1, 0x2e

    if-eq v0, v1, :cond_3

    goto :goto_0

    :cond_3
    move/from16 v19, v22

    move/from16 v22, v25

    const/16 v25, 0x30

    move/from16 v15, v17

    move/from16 v17, v20

    move/from16 v20, v23

    move/from16 v23, v26

    const/16 v26, 0x30

    move v12, v13

    move v13, v14

    move/from16 v14, v16

    move/from16 v16, v18

    move/from16 v18, v21

    move/from16 v21, v24

    move/from16 v24, v27

    move/from16 v4, v28

    .line 258
    invoke-static/range {v4 .. v26}, Lcom/alibaba/fastjson2/util/DateUtils;->localDateTime(CCCCCCCCCCCCCCCCCCCCCCC)Ljava/time/LocalDateTime;

    move-result-object v0

    :goto_2
    return-object v0
.end method

.method public static parseLocalDateTime28([BI)Ljava/time/LocalDateTime;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    add-int/lit8 v1, p1, 0x1c

    .line 4
    .line 5
    array-length v2, v0

    .line 6
    const/4 v3, 0x0

    .line 7
    if-le v1, v2, :cond_0

    .line 8
    .line 9
    return-object v3

    .line 10
    :cond_0
    aget-byte v1, v0, p1

    .line 11
    .line 12
    int-to-char v4, v1

    .line 13
    add-int/lit8 v1, p1, 0x1

    .line 14
    .line 15
    aget-byte v1, v0, v1

    .line 16
    .line 17
    int-to-char v5, v1

    .line 18
    add-int/lit8 v1, p1, 0x2

    .line 19
    .line 20
    aget-byte v1, v0, v1

    .line 21
    .line 22
    int-to-char v6, v1

    .line 23
    add-int/lit8 v1, p1, 0x3

    .line 24
    .line 25
    aget-byte v1, v0, v1

    .line 26
    .line 27
    int-to-char v7, v1

    .line 28
    add-int/lit8 v1, p1, 0x4

    .line 29
    .line 30
    aget-byte v1, v0, v1

    .line 31
    .line 32
    int-to-char v1, v1

    .line 33
    add-int/lit8 v2, p1, 0x5

    .line 34
    .line 35
    aget-byte v2, v0, v2

    .line 36
    .line 37
    int-to-char v8, v2

    .line 38
    add-int/lit8 v2, p1, 0x6

    .line 39
    .line 40
    aget-byte v2, v0, v2

    .line 41
    .line 42
    int-to-char v9, v2

    .line 43
    add-int/lit8 v2, p1, 0x7

    .line 44
    .line 45
    aget-byte v2, v0, v2

    .line 46
    .line 47
    int-to-char v2, v2

    .line 48
    add-int/lit8 v10, p1, 0x8

    .line 49
    .line 50
    aget-byte v10, v0, v10

    .line 51
    .line 52
    int-to-char v10, v10

    .line 53
    add-int/lit8 v11, p1, 0x9

    .line 54
    .line 55
    aget-byte v11, v0, v11

    .line 56
    .line 57
    int-to-char v11, v11

    .line 58
    add-int/lit8 v12, p1, 0xa

    .line 59
    .line 60
    aget-byte v12, v0, v12

    .line 61
    .line 62
    int-to-char v12, v12

    .line 63
    add-int/lit8 v13, p1, 0xb

    .line 64
    .line 65
    aget-byte v13, v0, v13

    .line 66
    .line 67
    int-to-char v13, v13

    .line 68
    add-int/lit8 v14, p1, 0xc

    .line 69
    .line 70
    aget-byte v14, v0, v14

    .line 71
    .line 72
    int-to-char v14, v14

    .line 73
    add-int/lit8 v15, p1, 0xd

    .line 74
    .line 75
    aget-byte v15, v0, v15

    .line 76
    .line 77
    int-to-char v15, v15

    .line 78
    add-int/lit8 v16, p1, 0xe

    .line 79
    .line 80
    move-object/from16 v17, v3

    .line 81
    .line 82
    aget-byte v3, v0, v16

    .line 83
    .line 84
    int-to-char v3, v3

    .line 85
    add-int/lit8 v16, p1, 0xf

    .line 86
    .line 87
    aget-byte v0, p0, v16

    .line 88
    .line 89
    int-to-char v0, v0

    .line 90
    add-int/lit8 v16, p1, 0x10

    .line 91
    .line 92
    move/from16 v18, v0

    .line 93
    .line 94
    aget-byte v0, p0, v16

    .line 95
    .line 96
    int-to-char v0, v0

    .line 97
    add-int/lit8 v16, p1, 0x11

    .line 98
    .line 99
    move/from16 v19, v3

    .line 100
    .line 101
    aget-byte v3, p0, v16

    .line 102
    .line 103
    int-to-char v3, v3

    .line 104
    add-int/lit8 v16, p1, 0x12

    .line 105
    .line 106
    move/from16 v20, v3

    .line 107
    .line 108
    aget-byte v3, p0, v16

    .line 109
    .line 110
    int-to-char v3, v3

    .line 111
    add-int/lit8 v16, p1, 0x13

    .line 112
    .line 113
    move/from16 v21, v3

    .line 114
    .line 115
    aget-byte v3, p0, v16

    .line 116
    .line 117
    int-to-char v3, v3

    .line 118
    add-int/lit8 v16, p1, 0x14

    .line 119
    .line 120
    move/from16 v22, v4

    .line 121
    .line 122
    aget-byte v4, p0, v16

    .line 123
    .line 124
    int-to-char v4, v4

    .line 125
    add-int/lit8 v16, p1, 0x15

    .line 126
    .line 127
    move/from16 v23, v4

    .line 128
    .line 129
    aget-byte v4, p0, v16

    .line 130
    .line 131
    int-to-char v4, v4

    .line 132
    add-int/lit8 v16, p1, 0x16

    .line 133
    .line 134
    move/from16 v24, v4

    .line 135
    .line 136
    aget-byte v4, p0, v16

    .line 137
    .line 138
    int-to-char v4, v4

    .line 139
    add-int/lit8 v16, p1, 0x17

    .line 140
    .line 141
    move/from16 v25, v4

    .line 142
    .line 143
    aget-byte v4, p0, v16

    .line 144
    .line 145
    int-to-char v4, v4

    .line 146
    add-int/lit8 v16, p1, 0x18

    .line 147
    .line 148
    move/from16 v26, v4

    .line 149
    .line 150
    aget-byte v4, p0, v16

    .line 151
    .line 152
    int-to-char v4, v4

    .line 153
    add-int/lit8 v16, p1, 0x19

    .line 154
    .line 155
    move/from16 v27, v4

    .line 156
    .line 157
    aget-byte v4, p0, v16

    .line 158
    .line 159
    int-to-char v4, v4

    .line 160
    add-int/lit8 v16, p1, 0x1a

    .line 161
    .line 162
    move/from16 v28, v4

    .line 163
    .line 164
    aget-byte v4, p0, v16

    .line 165
    .line 166
    int-to-char v4, v4

    .line 167
    add-int/lit8 v16, p1, 0x1b

    .line 168
    .line 169
    move/from16 v29, v4

    .line 170
    .line 171
    aget-byte v4, p0, v16

    .line 172
    .line 173
    int-to-char v4, v4

    .line 174
    move/from16 v16, v4

    .line 175
    .line 176
    const/16 v4, 0x2d

    .line 177
    .line 178
    if-ne v1, v4, :cond_1

    .line 179
    .line 180
    if-ne v2, v4, :cond_1

    .line 181
    .line 182
    const/16 v1, 0x20

    .line 183
    .line 184
    if-eq v12, v1, :cond_2

    .line 185
    .line 186
    const/16 v1, 0x54

    .line 187
    .line 188
    if-ne v12, v1, :cond_1

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_1
    :goto_0
    move-object/from16 v0, v17

    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_2
    :goto_1
    const/16 v1, 0x3a

    .line 195
    .line 196
    if-ne v15, v1, :cond_1

    .line 197
    .line 198
    if-ne v0, v1, :cond_1

    .line 199
    .line 200
    const/16 v0, 0x2e

    .line 201
    .line 202
    if-eq v3, v0, :cond_3

    .line 203
    .line 204
    goto :goto_0

    .line 205
    :cond_3
    move/from16 v17, v21

    .line 206
    .line 207
    move/from16 v21, v26

    .line 208
    .line 209
    const/16 v26, 0x30

    .line 210
    .line 211
    move/from16 v4, v25

    .line 212
    .line 213
    move/from16 v25, v16

    .line 214
    .line 215
    move/from16 v16, v20

    .line 216
    .line 217
    move/from16 v20, v4

    .line 218
    .line 219
    move v12, v13

    .line 220
    move v13, v14

    .line 221
    move/from16 v15, v18

    .line 222
    .line 223
    move/from16 v14, v19

    .line 224
    .line 225
    move/from16 v4, v22

    .line 226
    .line 227
    move/from16 v18, v23

    .line 228
    .line 229
    move/from16 v19, v24

    .line 230
    .line 231
    move/from16 v22, v27

    .line 232
    .line 233
    move/from16 v23, v28

    .line 234
    .line 235
    move/from16 v24, v29

    .line 236
    .line 237
    invoke-static/range {v4 .. v26}, Lcom/alibaba/fastjson2/util/DateUtils;->localDateTime(CCCCCCCCCCCCCCCCCCCCCCC)Ljava/time/LocalDateTime;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    :goto_2
    return-object v0
.end method

.method public static parseLocalDateTime28([CI)Ljava/time/LocalDateTime;
    .locals 30

    move-object/from16 v0, p0

    add-int/lit8 v1, p1, 0x1c

    .line 242
    array-length v2, v0

    const/4 v3, 0x0

    if-le v1, v2, :cond_0

    return-object v3

    .line 243
    :cond_0
    aget-char v4, v0, p1

    add-int/lit8 v1, p1, 0x1

    .line 244
    aget-char v5, v0, v1

    add-int/lit8 v1, p1, 0x2

    .line 245
    aget-char v6, v0, v1

    add-int/lit8 v1, p1, 0x3

    .line 246
    aget-char v7, v0, v1

    add-int/lit8 v1, p1, 0x4

    .line 247
    aget-char v1, v0, v1

    add-int/lit8 v2, p1, 0x5

    .line 248
    aget-char v8, v0, v2

    add-int/lit8 v2, p1, 0x6

    .line 249
    aget-char v9, v0, v2

    add-int/lit8 v2, p1, 0x7

    .line 250
    aget-char v2, v0, v2

    add-int/lit8 v10, p1, 0x8

    .line 251
    aget-char v10, v0, v10

    add-int/lit8 v11, p1, 0x9

    .line 252
    aget-char v11, v0, v11

    add-int/lit8 v12, p1, 0xa

    .line 253
    aget-char v12, v0, v12

    add-int/lit8 v13, p1, 0xb

    .line 254
    aget-char v13, v0, v13

    add-int/lit8 v14, p1, 0xc

    .line 255
    aget-char v14, v0, v14

    add-int/lit8 v15, p1, 0xd

    .line 256
    aget-char v15, v0, v15

    add-int/lit8 v16, p1, 0xe

    .line 257
    aget-char v16, v0, v16

    add-int/lit8 v17, p1, 0xf

    .line 258
    aget-char v17, v0, v17

    add-int/lit8 v18, p1, 0x10

    move-object/from16 v19, v3

    .line 259
    aget-char v3, v0, v18

    add-int/lit8 v18, p1, 0x11

    .line 260
    aget-char v18, v0, v18

    add-int/lit8 v20, p1, 0x12

    .line 261
    aget-char v20, v0, v20

    add-int/lit8 v21, p1, 0x13

    .line 262
    aget-char v0, p0, v21

    add-int/lit8 v21, p1, 0x14

    .line 263
    aget-char v21, p0, v21

    add-int/lit8 v22, p1, 0x15

    .line 264
    aget-char v22, p0, v22

    add-int/lit8 v23, p1, 0x16

    .line 265
    aget-char v23, p0, v23

    add-int/lit8 v24, p1, 0x17

    .line 266
    aget-char v24, p0, v24

    add-int/lit8 v25, p1, 0x18

    .line 267
    aget-char v25, p0, v25

    add-int/lit8 v26, p1, 0x19

    .line 268
    aget-char v26, p0, v26

    add-int/lit8 v27, p1, 0x1a

    .line 269
    aget-char v27, p0, v27

    add-int/lit8 v28, p1, 0x1b

    .line 270
    aget-char v28, p0, v28

    move/from16 v29, v4

    const/16 v4, 0x2d

    if-ne v1, v4, :cond_3

    if-ne v2, v4, :cond_3

    const/16 v1, 0x20

    if-eq v12, v1, :cond_1

    const/16 v1, 0x54

    if-ne v12, v1, :cond_3

    :cond_1
    const/16 v1, 0x3a

    if-ne v15, v1, :cond_3

    if-ne v3, v1, :cond_3

    const/16 v1, 0x2e

    if-eq v0, v1, :cond_2

    goto :goto_0

    :cond_2
    move/from16 v15, v17

    move/from16 v17, v20

    move/from16 v20, v23

    move/from16 v23, v26

    const/16 v26, 0x30

    move v12, v13

    move v13, v14

    move/from16 v14, v16

    move/from16 v16, v18

    move/from16 v18, v21

    move/from16 v19, v22

    move/from16 v21, v24

    move/from16 v22, v25

    move/from16 v24, v27

    move/from16 v25, v28

    move/from16 v4, v29

    .line 271
    invoke-static/range {v4 .. v26}, Lcom/alibaba/fastjson2/util/DateUtils;->localDateTime(CCCCCCCCCCCCCCCCCCCCCCC)Ljava/time/LocalDateTime;

    move-result-object v0

    return-object v0

    :cond_3
    :goto_0
    return-object v19
.end method

.method public static parseLocalDateTime29([BI)Ljava/time/LocalDateTime;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    add-int/lit8 v1, p1, 0x1d

    .line 4
    .line 5
    array-length v2, v0

    .line 6
    const/4 v3, 0x0

    .line 7
    if-le v1, v2, :cond_0

    .line 8
    .line 9
    return-object v3

    .line 10
    :cond_0
    aget-byte v1, v0, p1

    .line 11
    .line 12
    int-to-char v4, v1

    .line 13
    add-int/lit8 v1, p1, 0x1

    .line 14
    .line 15
    aget-byte v1, v0, v1

    .line 16
    .line 17
    int-to-char v5, v1

    .line 18
    add-int/lit8 v1, p1, 0x2

    .line 19
    .line 20
    aget-byte v1, v0, v1

    .line 21
    .line 22
    int-to-char v6, v1

    .line 23
    add-int/lit8 v1, p1, 0x3

    .line 24
    .line 25
    aget-byte v1, v0, v1

    .line 26
    .line 27
    int-to-char v7, v1

    .line 28
    add-int/lit8 v1, p1, 0x4

    .line 29
    .line 30
    aget-byte v1, v0, v1

    .line 31
    .line 32
    int-to-char v1, v1

    .line 33
    add-int/lit8 v2, p1, 0x5

    .line 34
    .line 35
    aget-byte v2, v0, v2

    .line 36
    .line 37
    int-to-char v8, v2

    .line 38
    add-int/lit8 v2, p1, 0x6

    .line 39
    .line 40
    aget-byte v2, v0, v2

    .line 41
    .line 42
    int-to-char v9, v2

    .line 43
    add-int/lit8 v2, p1, 0x7

    .line 44
    .line 45
    aget-byte v2, v0, v2

    .line 46
    .line 47
    int-to-char v2, v2

    .line 48
    add-int/lit8 v10, p1, 0x8

    .line 49
    .line 50
    aget-byte v10, v0, v10

    .line 51
    .line 52
    int-to-char v10, v10

    .line 53
    add-int/lit8 v11, p1, 0x9

    .line 54
    .line 55
    aget-byte v11, v0, v11

    .line 56
    .line 57
    int-to-char v11, v11

    .line 58
    add-int/lit8 v12, p1, 0xa

    .line 59
    .line 60
    aget-byte v12, v0, v12

    .line 61
    .line 62
    int-to-char v12, v12

    .line 63
    add-int/lit8 v13, p1, 0xb

    .line 64
    .line 65
    aget-byte v13, v0, v13

    .line 66
    .line 67
    int-to-char v13, v13

    .line 68
    add-int/lit8 v14, p1, 0xc

    .line 69
    .line 70
    aget-byte v14, v0, v14

    .line 71
    .line 72
    int-to-char v14, v14

    .line 73
    add-int/lit8 v15, p1, 0xd

    .line 74
    .line 75
    aget-byte v15, v0, v15

    .line 76
    .line 77
    int-to-char v15, v15

    .line 78
    add-int/lit8 v16, p1, 0xe

    .line 79
    .line 80
    move-object/from16 v27, v3

    .line 81
    .line 82
    aget-byte v3, v0, v16

    .line 83
    .line 84
    int-to-char v3, v3

    .line 85
    add-int/lit8 v16, p1, 0xf

    .line 86
    .line 87
    aget-byte v0, p0, v16

    .line 88
    .line 89
    int-to-char v0, v0

    .line 90
    add-int/lit8 v16, p1, 0x10

    .line 91
    .line 92
    move/from16 v17, v0

    .line 93
    .line 94
    aget-byte v0, p0, v16

    .line 95
    .line 96
    int-to-char v0, v0

    .line 97
    add-int/lit8 v16, p1, 0x11

    .line 98
    .line 99
    move/from16 v18, v3

    .line 100
    .line 101
    aget-byte v3, p0, v16

    .line 102
    .line 103
    int-to-char v3, v3

    .line 104
    add-int/lit8 v16, p1, 0x12

    .line 105
    .line 106
    move/from16 v19, v3

    .line 107
    .line 108
    aget-byte v3, p0, v16

    .line 109
    .line 110
    int-to-char v3, v3

    .line 111
    add-int/lit8 v16, p1, 0x13

    .line 112
    .line 113
    move/from16 v20, v3

    .line 114
    .line 115
    aget-byte v3, p0, v16

    .line 116
    .line 117
    int-to-char v3, v3

    .line 118
    add-int/lit8 v16, p1, 0x14

    .line 119
    .line 120
    move/from16 v21, v4

    .line 121
    .line 122
    aget-byte v4, p0, v16

    .line 123
    .line 124
    int-to-char v4, v4

    .line 125
    add-int/lit8 v16, p1, 0x15

    .line 126
    .line 127
    move/from16 v22, v4

    .line 128
    .line 129
    aget-byte v4, p0, v16

    .line 130
    .line 131
    int-to-char v4, v4

    .line 132
    add-int/lit8 v16, p1, 0x16

    .line 133
    .line 134
    move/from16 v23, v4

    .line 135
    .line 136
    aget-byte v4, p0, v16

    .line 137
    .line 138
    int-to-char v4, v4

    .line 139
    add-int/lit8 v16, p1, 0x17

    .line 140
    .line 141
    move/from16 v24, v4

    .line 142
    .line 143
    aget-byte v4, p0, v16

    .line 144
    .line 145
    int-to-char v4, v4

    .line 146
    add-int/lit8 v16, p1, 0x18

    .line 147
    .line 148
    move/from16 v25, v4

    .line 149
    .line 150
    aget-byte v4, p0, v16

    .line 151
    .line 152
    int-to-char v4, v4

    .line 153
    add-int/lit8 v16, p1, 0x19

    .line 154
    .line 155
    move/from16 v26, v4

    .line 156
    .line 157
    aget-byte v4, p0, v16

    .line 158
    .line 159
    int-to-char v4, v4

    .line 160
    add-int/lit8 v16, p1, 0x1a

    .line 161
    .line 162
    move/from16 v28, v4

    .line 163
    .line 164
    aget-byte v4, p0, v16

    .line 165
    .line 166
    int-to-char v4, v4

    .line 167
    add-int/lit8 v16, p1, 0x1b

    .line 168
    .line 169
    move/from16 v29, v4

    .line 170
    .line 171
    aget-byte v4, p0, v16

    .line 172
    .line 173
    int-to-char v4, v4

    .line 174
    add-int/lit8 v16, p1, 0x1c

    .line 175
    .line 176
    move/from16 v30, v4

    .line 177
    .line 178
    aget-byte v4, p0, v16

    .line 179
    .line 180
    int-to-char v4, v4

    .line 181
    move/from16 v16, v4

    .line 182
    .line 183
    const/16 v4, 0x2d

    .line 184
    .line 185
    if-ne v1, v4, :cond_3

    .line 186
    .line 187
    if-ne v2, v4, :cond_3

    .line 188
    .line 189
    const/16 v1, 0x20

    .line 190
    .line 191
    if-eq v12, v1, :cond_1

    .line 192
    .line 193
    const/16 v1, 0x54

    .line 194
    .line 195
    if-ne v12, v1, :cond_3

    .line 196
    .line 197
    :cond_1
    const/16 v1, 0x3a

    .line 198
    .line 199
    if-ne v15, v1, :cond_3

    .line 200
    .line 201
    if-ne v0, v1, :cond_3

    .line 202
    .line 203
    const/16 v0, 0x2e

    .line 204
    .line 205
    if-eq v3, v0, :cond_2

    .line 206
    .line 207
    goto :goto_0

    .line 208
    :cond_2
    move v12, v13

    .line 209
    move v13, v14

    .line 210
    move/from16 v15, v17

    .line 211
    .line 212
    move/from16 v14, v18

    .line 213
    .line 214
    move/from16 v17, v20

    .line 215
    .line 216
    move/from16 v4, v21

    .line 217
    .line 218
    move/from16 v18, v22

    .line 219
    .line 220
    move/from16 v20, v24

    .line 221
    .line 222
    move/from16 v21, v25

    .line 223
    .line 224
    move/from16 v22, v26

    .line 225
    .line 226
    move/from16 v24, v29

    .line 227
    .line 228
    move/from16 v25, v30

    .line 229
    .line 230
    move/from16 v26, v16

    .line 231
    .line 232
    move/from16 v16, v19

    .line 233
    .line 234
    move/from16 v19, v23

    .line 235
    .line 236
    move/from16 v23, v28

    .line 237
    .line 238
    invoke-static/range {v4 .. v26}, Lcom/alibaba/fastjson2/util/DateUtils;->localDateTime(CCCCCCCCCCCCCCCCCCCCCCC)Ljava/time/LocalDateTime;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    return-object v0

    .line 243
    :cond_3
    :goto_0
    return-object v27
.end method

.method public static parseLocalDateTime29([CI)Ljava/time/LocalDateTime;
    .locals 31

    move-object/from16 v0, p0

    add-int/lit8 v1, p1, 0x1d

    .line 244
    array-length v2, v0

    const/4 v3, 0x0

    if-le v1, v2, :cond_0

    return-object v3

    .line 245
    :cond_0
    aget-char v4, v0, p1

    add-int/lit8 v1, p1, 0x1

    .line 246
    aget-char v5, v0, v1

    add-int/lit8 v1, p1, 0x2

    .line 247
    aget-char v6, v0, v1

    add-int/lit8 v1, p1, 0x3

    .line 248
    aget-char v7, v0, v1

    add-int/lit8 v1, p1, 0x4

    .line 249
    aget-char v1, v0, v1

    add-int/lit8 v2, p1, 0x5

    .line 250
    aget-char v8, v0, v2

    add-int/lit8 v2, p1, 0x6

    .line 251
    aget-char v9, v0, v2

    add-int/lit8 v2, p1, 0x7

    .line 252
    aget-char v2, v0, v2

    add-int/lit8 v10, p1, 0x8

    .line 253
    aget-char v10, v0, v10

    add-int/lit8 v11, p1, 0x9

    .line 254
    aget-char v11, v0, v11

    add-int/lit8 v12, p1, 0xa

    .line 255
    aget-char v12, v0, v12

    add-int/lit8 v13, p1, 0xb

    .line 256
    aget-char v13, v0, v13

    add-int/lit8 v14, p1, 0xc

    .line 257
    aget-char v14, v0, v14

    add-int/lit8 v15, p1, 0xd

    .line 258
    aget-char v15, v0, v15

    add-int/lit8 v16, p1, 0xe

    .line 259
    aget-char v16, v0, v16

    add-int/lit8 v17, p1, 0xf

    .line 260
    aget-char v17, v0, v17

    add-int/lit8 v18, p1, 0x10

    move-object/from16 v27, v3

    .line 261
    aget-char v3, v0, v18

    add-int/lit8 v18, p1, 0x11

    .line 262
    aget-char v18, v0, v18

    add-int/lit8 v19, p1, 0x12

    .line 263
    aget-char v19, v0, v19

    add-int/lit8 v20, p1, 0x13

    .line 264
    aget-char v0, p0, v20

    add-int/lit8 v20, p1, 0x14

    .line 265
    aget-char v20, p0, v20

    add-int/lit8 v21, p1, 0x15

    .line 266
    aget-char v21, p0, v21

    add-int/lit8 v22, p1, 0x16

    .line 267
    aget-char v22, p0, v22

    add-int/lit8 v23, p1, 0x17

    .line 268
    aget-char v23, p0, v23

    add-int/lit8 v24, p1, 0x18

    .line 269
    aget-char v24, p0, v24

    add-int/lit8 v25, p1, 0x19

    .line 270
    aget-char v25, p0, v25

    add-int/lit8 v26, p1, 0x1a

    .line 271
    aget-char v26, p0, v26

    add-int/lit8 v28, p1, 0x1b

    .line 272
    aget-char v28, p0, v28

    add-int/lit8 v29, p1, 0x1c

    .line 273
    aget-char v29, p0, v29

    move/from16 v30, v4

    const/16 v4, 0x2d

    if-ne v1, v4, :cond_3

    if-ne v2, v4, :cond_3

    const/16 v1, 0x20

    if-eq v12, v1, :cond_1

    const/16 v1, 0x54

    if-ne v12, v1, :cond_3

    :cond_1
    const/16 v1, 0x3a

    if-ne v15, v1, :cond_3

    if-ne v3, v1, :cond_3

    const/16 v1, 0x2e

    if-eq v0, v1, :cond_2

    goto :goto_0

    :cond_2
    move v12, v13

    move v13, v14

    move/from16 v14, v16

    move/from16 v15, v17

    move/from16 v16, v18

    move/from16 v17, v19

    move/from16 v18, v20

    move/from16 v19, v21

    move/from16 v20, v22

    move/from16 v21, v23

    move/from16 v22, v24

    move/from16 v23, v25

    move/from16 v24, v26

    move/from16 v25, v28

    move/from16 v26, v29

    move/from16 v4, v30

    .line 274
    invoke-static/range {v4 .. v26}, Lcom/alibaba/fastjson2/util/DateUtils;->localDateTime(CCCCCCCCCCCCCCCCCCCCCCC)Ljava/time/LocalDateTime;

    move-result-object v0

    return-object v0

    :cond_3
    :goto_0
    return-object v27
.end method

.method public static parseLocalDateTimeX([BII)Ljava/time/LocalDateTime;
    .locals 33

    .line 1
    move/from16 v1, p1

    .line 2
    .line 3
    move/from16 v2, p2

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    if-nez v2, :cond_1

    .line 8
    .line 9
    :cond_0
    const/16 v28, 0x0

    .line 10
    .line 11
    goto/16 :goto_2

    .line 12
    .line 13
    :cond_1
    const/16 v4, 0x15

    .line 14
    .line 15
    if-lt v2, v4, :cond_2

    .line 16
    .line 17
    const/16 v4, 0x1d

    .line 18
    .line 19
    if-le v2, v4, :cond_3

    .line 20
    .line 21
    :cond_2
    const/16 v28, 0x0

    .line 22
    .line 23
    goto/16 :goto_2

    .line 24
    .line 25
    :cond_3
    aget-byte v4, p0, v1

    .line 26
    .line 27
    int-to-char v5, v4

    .line 28
    add-int/lit8 v4, v1, 0x1

    .line 29
    .line 30
    aget-byte v4, p0, v4

    .line 31
    .line 32
    int-to-char v6, v4

    .line 33
    add-int/lit8 v4, v1, 0x2

    .line 34
    .line 35
    aget-byte v4, p0, v4

    .line 36
    .line 37
    int-to-char v7, v4

    .line 38
    add-int/lit8 v4, v1, 0x3

    .line 39
    .line 40
    aget-byte v4, p0, v4

    .line 41
    .line 42
    int-to-char v8, v4

    .line 43
    add-int/lit8 v4, v1, 0x4

    .line 44
    .line 45
    aget-byte v4, p0, v4

    .line 46
    .line 47
    int-to-char v4, v4

    .line 48
    add-int/lit8 v9, v1, 0x5

    .line 49
    .line 50
    aget-byte v9, p0, v9

    .line 51
    .line 52
    int-to-char v9, v9

    .line 53
    add-int/lit8 v10, v1, 0x6

    .line 54
    .line 55
    aget-byte v10, p0, v10

    .line 56
    .line 57
    int-to-char v10, v10

    .line 58
    add-int/lit8 v11, v1, 0x7

    .line 59
    .line 60
    aget-byte v11, p0, v11

    .line 61
    .line 62
    int-to-char v11, v11

    .line 63
    add-int/lit8 v12, v1, 0x8

    .line 64
    .line 65
    aget-byte v12, p0, v12

    .line 66
    .line 67
    int-to-char v12, v12

    .line 68
    add-int/lit8 v13, v1, 0x9

    .line 69
    .line 70
    aget-byte v13, p0, v13

    .line 71
    .line 72
    int-to-char v13, v13

    .line 73
    add-int/lit8 v14, v1, 0xa

    .line 74
    .line 75
    aget-byte v14, p0, v14

    .line 76
    .line 77
    int-to-char v14, v14

    .line 78
    add-int/lit8 v15, v1, 0xb

    .line 79
    .line 80
    aget-byte v15, p0, v15

    .line 81
    .line 82
    int-to-char v15, v15

    .line 83
    add-int/lit8 v16, v1, 0xc

    .line 84
    .line 85
    const/16 v28, 0x0

    .line 86
    .line 87
    aget-byte v3, p0, v16

    .line 88
    .line 89
    int-to-char v3, v3

    .line 90
    add-int/lit8 v16, v1, 0xd

    .line 91
    .line 92
    aget-byte v2, p0, v16

    .line 93
    .line 94
    int-to-char v2, v2

    .line 95
    add-int/lit8 v16, v1, 0xe

    .line 96
    .line 97
    move/from16 v17, v3

    .line 98
    .line 99
    aget-byte v3, p0, v16

    .line 100
    .line 101
    int-to-char v3, v3

    .line 102
    add-int/lit8 v16, v1, 0xf

    .line 103
    .line 104
    move/from16 v18, v3

    .line 105
    .line 106
    aget-byte v3, p0, v16

    .line 107
    .line 108
    int-to-char v3, v3

    .line 109
    add-int/lit8 v16, v1, 0x10

    .line 110
    .line 111
    move/from16 v19, v3

    .line 112
    .line 113
    aget-byte v3, p0, v16

    .line 114
    .line 115
    int-to-char v3, v3

    .line 116
    add-int/lit8 v16, v1, 0x11

    .line 117
    .line 118
    move/from16 v20, v5

    .line 119
    .line 120
    aget-byte v5, p0, v16

    .line 121
    .line 122
    int-to-char v5, v5

    .line 123
    add-int/lit8 v16, v1, 0x12

    .line 124
    .line 125
    move/from16 v21, v5

    .line 126
    .line 127
    aget-byte v5, p0, v16

    .line 128
    .line 129
    int-to-char v5, v5

    .line 130
    add-int/lit8 v16, v1, 0x13

    .line 131
    .line 132
    move/from16 v22, v5

    .line 133
    .line 134
    aget-byte v5, p0, v16

    .line 135
    .line 136
    int-to-char v5, v5

    .line 137
    const/16 v16, 0x30

    .line 138
    .line 139
    packed-switch p2, :pswitch_data_0

    .line 140
    .line 141
    .line 142
    add-int/lit8 v16, v1, 0x14

    .line 143
    .line 144
    move/from16 v23, v6

    .line 145
    .line 146
    aget-byte v6, p0, v16

    .line 147
    .line 148
    int-to-char v6, v6

    .line 149
    add-int/lit8 v16, v1, 0x15

    .line 150
    .line 151
    move/from16 v24, v6

    .line 152
    .line 153
    aget-byte v6, p0, v16

    .line 154
    .line 155
    int-to-char v6, v6

    .line 156
    add-int/lit8 v16, v1, 0x16

    .line 157
    .line 158
    move/from16 v25, v6

    .line 159
    .line 160
    aget-byte v6, p0, v16

    .line 161
    .line 162
    int-to-char v6, v6

    .line 163
    add-int/lit8 v16, v1, 0x17

    .line 164
    .line 165
    move/from16 v26, v6

    .line 166
    .line 167
    aget-byte v6, p0, v16

    .line 168
    .line 169
    int-to-char v6, v6

    .line 170
    add-int/lit8 v16, v1, 0x18

    .line 171
    .line 172
    move/from16 v27, v6

    .line 173
    .line 174
    aget-byte v6, p0, v16

    .line 175
    .line 176
    int-to-char v6, v6

    .line 177
    add-int/lit8 v16, v1, 0x19

    .line 178
    .line 179
    move/from16 v29, v6

    .line 180
    .line 181
    aget-byte v6, p0, v16

    .line 182
    .line 183
    int-to-char v6, v6

    .line 184
    add-int/lit8 v16, v1, 0x1a

    .line 185
    .line 186
    move/from16 v30, v6

    .line 187
    .line 188
    aget-byte v6, p0, v16

    .line 189
    .line 190
    int-to-char v6, v6

    .line 191
    add-int/lit8 v16, v1, 0x1b

    .line 192
    .line 193
    move/from16 v31, v6

    .line 194
    .line 195
    aget-byte v6, p0, v16

    .line 196
    .line 197
    int-to-char v6, v6

    .line 198
    add-int/lit8 v16, v1, 0x1c

    .line 199
    .line 200
    move/from16 v32, v6

    .line 201
    .line 202
    aget-byte v6, p0, v16

    .line 203
    .line 204
    int-to-char v6, v6

    .line 205
    move/from16 v16, v29

    .line 206
    .line 207
    move/from16 v29, v23

    .line 208
    .line 209
    move/from16 v23, v16

    .line 210
    .line 211
    move/from16 v16, v25

    .line 212
    .line 213
    move/from16 v25, v31

    .line 214
    .line 215
    move/from16 v31, v12

    .line 216
    .line 217
    move v12, v13

    .line 218
    move v13, v15

    .line 219
    move/from16 v15, v18

    .line 220
    .line 221
    move/from16 v18, v22

    .line 222
    .line 223
    move/from16 v22, v27

    .line 224
    .line 225
    move/from16 v27, v6

    .line 226
    .line 227
    move/from16 v6, v24

    .line 228
    .line 229
    move/from16 v24, v30

    .line 230
    .line 231
    move/from16 v30, v17

    .line 232
    .line 233
    move/from16 v17, v21

    .line 234
    .line 235
    move/from16 v21, v26

    .line 236
    .line 237
    move/from16 v26, v32

    .line 238
    .line 239
    goto/16 :goto_1

    .line 240
    .line 241
    :pswitch_0
    move/from16 v23, v6

    .line 242
    .line 243
    add-int/lit8 v6, v1, 0x14

    .line 244
    .line 245
    aget-byte v6, p0, v6

    .line 246
    .line 247
    int-to-char v6, v6

    .line 248
    add-int/lit8 v24, v1, 0x15

    .line 249
    .line 250
    move/from16 v25, v6

    .line 251
    .line 252
    aget-byte v6, p0, v24

    .line 253
    .line 254
    int-to-char v6, v6

    .line 255
    add-int/lit8 v24, v1, 0x16

    .line 256
    .line 257
    move/from16 v26, v6

    .line 258
    .line 259
    aget-byte v6, p0, v24

    .line 260
    .line 261
    int-to-char v6, v6

    .line 262
    add-int/lit8 v24, v1, 0x17

    .line 263
    .line 264
    move/from16 v27, v6

    .line 265
    .line 266
    aget-byte v6, p0, v24

    .line 267
    .line 268
    int-to-char v6, v6

    .line 269
    add-int/lit8 v24, v1, 0x18

    .line 270
    .line 271
    move/from16 v29, v6

    .line 272
    .line 273
    aget-byte v6, p0, v24

    .line 274
    .line 275
    int-to-char v6, v6

    .line 276
    add-int/lit8 v24, v1, 0x19

    .line 277
    .line 278
    move/from16 v30, v6

    .line 279
    .line 280
    aget-byte v6, p0, v24

    .line 281
    .line 282
    int-to-char v6, v6

    .line 283
    add-int/lit8 v24, v1, 0x1a

    .line 284
    .line 285
    move/from16 v31, v6

    .line 286
    .line 287
    aget-byte v6, p0, v24

    .line 288
    .line 289
    int-to-char v6, v6

    .line 290
    add-int/lit8 v24, v1, 0x1b

    .line 291
    .line 292
    move/from16 v32, v6

    .line 293
    .line 294
    aget-byte v6, p0, v24

    .line 295
    .line 296
    int-to-char v6, v6

    .line 297
    move/from16 v24, v31

    .line 298
    .line 299
    move/from16 v31, v12

    .line 300
    .line 301
    move v12, v13

    .line 302
    move v13, v15

    .line 303
    move/from16 v15, v18

    .line 304
    .line 305
    move/from16 v18, v22

    .line 306
    .line 307
    move/from16 v22, v29

    .line 308
    .line 309
    move/from16 v29, v23

    .line 310
    .line 311
    move/from16 v23, v30

    .line 312
    .line 313
    move/from16 v30, v17

    .line 314
    .line 315
    move/from16 v17, v21

    .line 316
    .line 317
    move/from16 v21, v27

    .line 318
    .line 319
    move/from16 v27, v16

    .line 320
    .line 321
    move/from16 v16, v26

    .line 322
    .line 323
    move/from16 v26, v6

    .line 324
    .line 325
    move/from16 v6, v25

    .line 326
    .line 327
    move/from16 v25, v32

    .line 328
    .line 329
    goto/16 :goto_1

    .line 330
    .line 331
    :pswitch_1
    move/from16 v23, v6

    .line 332
    .line 333
    add-int/lit8 v6, v1, 0x14

    .line 334
    .line 335
    aget-byte v6, p0, v6

    .line 336
    .line 337
    int-to-char v6, v6

    .line 338
    add-int/lit8 v24, v1, 0x15

    .line 339
    .line 340
    move/from16 v25, v6

    .line 341
    .line 342
    aget-byte v6, p0, v24

    .line 343
    .line 344
    int-to-char v6, v6

    .line 345
    add-int/lit8 v24, v1, 0x16

    .line 346
    .line 347
    move/from16 v26, v6

    .line 348
    .line 349
    aget-byte v6, p0, v24

    .line 350
    .line 351
    int-to-char v6, v6

    .line 352
    add-int/lit8 v24, v1, 0x17

    .line 353
    .line 354
    move/from16 v27, v6

    .line 355
    .line 356
    aget-byte v6, p0, v24

    .line 357
    .line 358
    int-to-char v6, v6

    .line 359
    add-int/lit8 v24, v1, 0x18

    .line 360
    .line 361
    move/from16 v29, v6

    .line 362
    .line 363
    aget-byte v6, p0, v24

    .line 364
    .line 365
    int-to-char v6, v6

    .line 366
    add-int/lit8 v24, v1, 0x19

    .line 367
    .line 368
    move/from16 v30, v6

    .line 369
    .line 370
    aget-byte v6, p0, v24

    .line 371
    .line 372
    int-to-char v6, v6

    .line 373
    add-int/lit8 v24, v1, 0x1a

    .line 374
    .line 375
    move/from16 v31, v6

    .line 376
    .line 377
    aget-byte v6, p0, v24

    .line 378
    .line 379
    int-to-char v6, v6

    .line 380
    move/from16 v24, v25

    .line 381
    .line 382
    move/from16 v25, v6

    .line 383
    .line 384
    move/from16 v6, v24

    .line 385
    .line 386
    move/from16 v24, v31

    .line 387
    .line 388
    move/from16 v31, v12

    .line 389
    .line 390
    move v12, v13

    .line 391
    move v13, v15

    .line 392
    move/from16 v15, v18

    .line 393
    .line 394
    move/from16 v18, v22

    .line 395
    .line 396
    move/from16 v22, v29

    .line 397
    .line 398
    move/from16 v29, v23

    .line 399
    .line 400
    move/from16 v23, v30

    .line 401
    .line 402
    move/from16 v30, v17

    .line 403
    .line 404
    move/from16 v17, v21

    .line 405
    .line 406
    move/from16 v21, v27

    .line 407
    .line 408
    move/from16 v27, v16

    .line 409
    .line 410
    move/from16 v16, v26

    .line 411
    .line 412
    move/from16 v26, v27

    .line 413
    .line 414
    goto/16 :goto_1

    .line 415
    .line 416
    :pswitch_2
    move/from16 v23, v6

    .line 417
    .line 418
    add-int/lit8 v6, v1, 0x14

    .line 419
    .line 420
    aget-byte v6, p0, v6

    .line 421
    .line 422
    int-to-char v6, v6

    .line 423
    add-int/lit8 v24, v1, 0x15

    .line 424
    .line 425
    move/from16 v25, v6

    .line 426
    .line 427
    aget-byte v6, p0, v24

    .line 428
    .line 429
    int-to-char v6, v6

    .line 430
    add-int/lit8 v24, v1, 0x16

    .line 431
    .line 432
    move/from16 v26, v6

    .line 433
    .line 434
    aget-byte v6, p0, v24

    .line 435
    .line 436
    int-to-char v6, v6

    .line 437
    add-int/lit8 v24, v1, 0x17

    .line 438
    .line 439
    move/from16 v27, v6

    .line 440
    .line 441
    aget-byte v6, p0, v24

    .line 442
    .line 443
    int-to-char v6, v6

    .line 444
    add-int/lit8 v24, v1, 0x18

    .line 445
    .line 446
    move/from16 v29, v6

    .line 447
    .line 448
    aget-byte v6, p0, v24

    .line 449
    .line 450
    int-to-char v6, v6

    .line 451
    add-int/lit8 v24, v1, 0x19

    .line 452
    .line 453
    move/from16 v30, v6

    .line 454
    .line 455
    aget-byte v6, p0, v24

    .line 456
    .line 457
    int-to-char v6, v6

    .line 458
    move/from16 v24, v6

    .line 459
    .line 460
    move/from16 v31, v12

    .line 461
    .line 462
    move v12, v13

    .line 463
    move v13, v15

    .line 464
    move/from16 v15, v18

    .line 465
    .line 466
    move/from16 v18, v22

    .line 467
    .line 468
    move/from16 v6, v25

    .line 469
    .line 470
    move/from16 v22, v29

    .line 471
    .line 472
    move/from16 v25, v16

    .line 473
    .line 474
    move/from16 v29, v23

    .line 475
    .line 476
    move/from16 v23, v30

    .line 477
    .line 478
    move/from16 v30, v17

    .line 479
    .line 480
    move/from16 v17, v21

    .line 481
    .line 482
    move/from16 v16, v26

    .line 483
    .line 484
    move/from16 v21, v27

    .line 485
    .line 486
    move/from16 v26, v25

    .line 487
    .line 488
    move/from16 v27, v26

    .line 489
    .line 490
    goto/16 :goto_1

    .line 491
    .line 492
    :pswitch_3
    move/from16 v23, v6

    .line 493
    .line 494
    add-int/lit8 v6, v1, 0x14

    .line 495
    .line 496
    aget-byte v6, p0, v6

    .line 497
    .line 498
    int-to-char v6, v6

    .line 499
    add-int/lit8 v24, v1, 0x15

    .line 500
    .line 501
    move/from16 v25, v6

    .line 502
    .line 503
    aget-byte v6, p0, v24

    .line 504
    .line 505
    int-to-char v6, v6

    .line 506
    add-int/lit8 v24, v1, 0x16

    .line 507
    .line 508
    move/from16 v26, v6

    .line 509
    .line 510
    aget-byte v6, p0, v24

    .line 511
    .line 512
    int-to-char v6, v6

    .line 513
    add-int/lit8 v24, v1, 0x17

    .line 514
    .line 515
    move/from16 v27, v6

    .line 516
    .line 517
    aget-byte v6, p0, v24

    .line 518
    .line 519
    int-to-char v6, v6

    .line 520
    add-int/lit8 v24, v1, 0x18

    .line 521
    .line 522
    move/from16 v29, v6

    .line 523
    .line 524
    aget-byte v6, p0, v24

    .line 525
    .line 526
    int-to-char v6, v6

    .line 527
    move/from16 v31, v12

    .line 528
    .line 529
    move v12, v13

    .line 530
    move v13, v15

    .line 531
    move/from16 v24, v16

    .line 532
    .line 533
    move/from16 v30, v17

    .line 534
    .line 535
    move/from16 v15, v18

    .line 536
    .line 537
    move/from16 v17, v21

    .line 538
    .line 539
    move/from16 v18, v22

    .line 540
    .line 541
    move/from16 v21, v27

    .line 542
    .line 543
    move/from16 v22, v29

    .line 544
    .line 545
    move/from16 v27, v24

    .line 546
    .line 547
    move/from16 v29, v23

    .line 548
    .line 549
    move/from16 v16, v26

    .line 550
    .line 551
    move/from16 v23, v6

    .line 552
    .line 553
    move/from16 v26, v27

    .line 554
    .line 555
    move/from16 v6, v25

    .line 556
    .line 557
    move/from16 v25, v26

    .line 558
    .line 559
    goto/16 :goto_1

    .line 560
    .line 561
    :pswitch_4
    move/from16 v23, v6

    .line 562
    .line 563
    add-int/lit8 v6, v1, 0x14

    .line 564
    .line 565
    aget-byte v6, p0, v6

    .line 566
    .line 567
    int-to-char v6, v6

    .line 568
    add-int/lit8 v24, v1, 0x15

    .line 569
    .line 570
    move/from16 v25, v6

    .line 571
    .line 572
    aget-byte v6, p0, v24

    .line 573
    .line 574
    int-to-char v6, v6

    .line 575
    add-int/lit8 v24, v1, 0x16

    .line 576
    .line 577
    move/from16 v26, v6

    .line 578
    .line 579
    aget-byte v6, p0, v24

    .line 580
    .line 581
    int-to-char v6, v6

    .line 582
    add-int/lit8 v24, v1, 0x17

    .line 583
    .line 584
    move/from16 v27, v6

    .line 585
    .line 586
    aget-byte v6, p0, v24

    .line 587
    .line 588
    int-to-char v6, v6

    .line 589
    move/from16 v31, v12

    .line 590
    .line 591
    move v12, v13

    .line 592
    move v13, v15

    .line 593
    move/from16 v24, v16

    .line 594
    .line 595
    move/from16 v30, v17

    .line 596
    .line 597
    move/from16 v15, v18

    .line 598
    .line 599
    move/from16 v17, v21

    .line 600
    .line 601
    move/from16 v18, v22

    .line 602
    .line 603
    move/from16 v29, v23

    .line 604
    .line 605
    move/from16 v21, v27

    .line 606
    .line 607
    move/from16 v22, v6

    .line 608
    .line 609
    move/from16 v23, v24

    .line 610
    .line 611
    move/from16 v27, v23

    .line 612
    .line 613
    move/from16 v6, v25

    .line 614
    .line 615
    move/from16 v16, v26

    .line 616
    .line 617
    move/from16 v25, v27

    .line 618
    .line 619
    :goto_0
    move/from16 v26, v25

    .line 620
    .line 621
    goto/16 :goto_1

    .line 622
    .line 623
    :pswitch_5
    move/from16 v23, v6

    .line 624
    .line 625
    add-int/lit8 v6, v1, 0x14

    .line 626
    .line 627
    aget-byte v6, p0, v6

    .line 628
    .line 629
    int-to-char v6, v6

    .line 630
    add-int/lit8 v24, v1, 0x15

    .line 631
    .line 632
    move/from16 v25, v6

    .line 633
    .line 634
    aget-byte v6, p0, v24

    .line 635
    .line 636
    int-to-char v6, v6

    .line 637
    add-int/lit8 v24, v1, 0x16

    .line 638
    .line 639
    move/from16 v26, v6

    .line 640
    .line 641
    aget-byte v6, p0, v24

    .line 642
    .line 643
    int-to-char v6, v6

    .line 644
    move/from16 v31, v12

    .line 645
    .line 646
    move v12, v13

    .line 647
    move v13, v15

    .line 648
    move/from16 v24, v16

    .line 649
    .line 650
    move/from16 v27, v24

    .line 651
    .line 652
    move/from16 v30, v17

    .line 653
    .line 654
    move/from16 v15, v18

    .line 655
    .line 656
    move/from16 v17, v21

    .line 657
    .line 658
    move/from16 v18, v22

    .line 659
    .line 660
    move/from16 v29, v23

    .line 661
    .line 662
    move/from16 v21, v6

    .line 663
    .line 664
    move/from16 v22, v27

    .line 665
    .line 666
    move/from16 v23, v22

    .line 667
    .line 668
    move/from16 v6, v25

    .line 669
    .line 670
    move/from16 v16, v26

    .line 671
    .line 672
    move/from16 v25, v23

    .line 673
    .line 674
    goto :goto_0

    .line 675
    :pswitch_6
    move/from16 v23, v6

    .line 676
    .line 677
    add-int/lit8 v6, v1, 0x14

    .line 678
    .line 679
    aget-byte v6, p0, v6

    .line 680
    .line 681
    int-to-char v6, v6

    .line 682
    add-int/lit8 v24, v1, 0x15

    .line 683
    .line 684
    move/from16 v25, v6

    .line 685
    .line 686
    aget-byte v6, p0, v24

    .line 687
    .line 688
    int-to-char v6, v6

    .line 689
    move/from16 v31, v12

    .line 690
    .line 691
    move v12, v13

    .line 692
    move v13, v15

    .line 693
    move/from16 v24, v16

    .line 694
    .line 695
    move/from16 v26, v24

    .line 696
    .line 697
    move/from16 v27, v26

    .line 698
    .line 699
    move/from16 v30, v17

    .line 700
    .line 701
    move/from16 v15, v18

    .line 702
    .line 703
    move/from16 v17, v21

    .line 704
    .line 705
    move/from16 v18, v22

    .line 706
    .line 707
    move/from16 v29, v23

    .line 708
    .line 709
    move/from16 v16, v6

    .line 710
    .line 711
    move/from16 v21, v27

    .line 712
    .line 713
    move/from16 v22, v21

    .line 714
    .line 715
    move/from16 v23, v22

    .line 716
    .line 717
    move/from16 v6, v25

    .line 718
    .line 719
    move/from16 v25, v23

    .line 720
    .line 721
    goto :goto_1

    .line 722
    :pswitch_7
    move/from16 v23, v6

    .line 723
    .line 724
    add-int/lit8 v6, v1, 0x14

    .line 725
    .line 726
    aget-byte v6, p0, v6

    .line 727
    .line 728
    int-to-char v6, v6

    .line 729
    move/from16 v31, v12

    .line 730
    .line 731
    move v12, v13

    .line 732
    move v13, v15

    .line 733
    move/from16 v24, v16

    .line 734
    .line 735
    move/from16 v25, v24

    .line 736
    .line 737
    move/from16 v26, v25

    .line 738
    .line 739
    move/from16 v27, v26

    .line 740
    .line 741
    move/from16 v30, v17

    .line 742
    .line 743
    move/from16 v15, v18

    .line 744
    .line 745
    move/from16 v17, v21

    .line 746
    .line 747
    move/from16 v18, v22

    .line 748
    .line 749
    move/from16 v29, v23

    .line 750
    .line 751
    move/from16 v21, v27

    .line 752
    .line 753
    move/from16 v22, v21

    .line 754
    .line 755
    move/from16 v23, v22

    .line 756
    .line 757
    :goto_1
    const/16 v0, 0x2d

    .line 758
    .line 759
    if-ne v4, v0, :cond_5

    .line 760
    .line 761
    if-ne v11, v0, :cond_5

    .line 762
    .line 763
    const/16 v4, 0x20

    .line 764
    .line 765
    if-eq v14, v4, :cond_4

    .line 766
    .line 767
    const/16 v4, 0x54

    .line 768
    .line 769
    if-ne v14, v4, :cond_5

    .line 770
    .line 771
    :cond_4
    const/16 v4, 0x3a

    .line 772
    .line 773
    if-ne v2, v4, :cond_5

    .line 774
    .line 775
    if-ne v3, v4, :cond_5

    .line 776
    .line 777
    const/16 v2, 0x2e

    .line 778
    .line 779
    if-ne v5, v2, :cond_5

    .line 780
    .line 781
    move/from16 v5, v20

    .line 782
    .line 783
    move/from16 v14, v30

    .line 784
    .line 785
    move/from16 v11, v31

    .line 786
    .line 787
    move/from16 v20, v16

    .line 788
    .line 789
    move/from16 v16, v19

    .line 790
    .line 791
    move/from16 v19, v6

    .line 792
    .line 793
    move/from16 v6, v29

    .line 794
    .line 795
    invoke-static/range {v5 .. v27}, Lcom/alibaba/fastjson2/util/DateUtils;->localDateTime(CCCCCCCCCCCCCCCCCCCCCCC)Ljava/time/LocalDateTime;

    .line 796
    .line 797
    .line 798
    move-result-object v0

    .line 799
    return-object v0

    .line 800
    :cond_5
    add-int v2, v1, p2

    .line 801
    .line 802
    add-int/lit8 v3, v2, -0xf

    .line 803
    .line 804
    aget-byte v3, p0, v3

    .line 805
    .line 806
    if-ne v3, v0, :cond_7

    .line 807
    .line 808
    add-int/lit8 v3, v2, -0xc

    .line 809
    .line 810
    aget-byte v3, p0, v3

    .line 811
    .line 812
    if-ne v3, v0, :cond_7

    .line 813
    .line 814
    add-int/lit8 v0, v2, -0x9

    .line 815
    .line 816
    aget-byte v0, p0, v0

    .line 817
    .line 818
    const/16 v3, 0x20

    .line 819
    .line 820
    if-eq v0, v3, :cond_6

    .line 821
    .line 822
    const/16 v3, 0x54

    .line 823
    .line 824
    if-ne v0, v3, :cond_7

    .line 825
    .line 826
    :cond_6
    add-int/lit8 v0, v2, -0x6

    .line 827
    .line 828
    aget-byte v0, p0, v0

    .line 829
    .line 830
    const/16 v4, 0x3a

    .line 831
    .line 832
    if-ne v0, v4, :cond_7

    .line 833
    .line 834
    add-int/lit8 v0, v2, -0x3

    .line 835
    .line 836
    aget-byte v0, p0, v0

    .line 837
    .line 838
    if-ne v0, v4, :cond_7

    .line 839
    .line 840
    add-int/lit8 v0, p2, -0xf

    .line 841
    .line 842
    move-object/from16 v3, p0

    .line 843
    .line 844
    invoke-static {v3, v1, v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->parseInt([BII)I

    .line 845
    .line 846
    .line 847
    move-result v0

    .line 848
    add-int/lit8 v1, v2, -0xe

    .line 849
    .line 850
    const/4 v4, 0x2

    .line 851
    invoke-static {v3, v1, v4}, Lcom/alibaba/fastjson2/util/TypeUtils;->parseInt([BII)I

    .line 852
    .line 853
    .line 854
    move-result v1

    .line 855
    add-int/lit8 v5, v2, -0xb

    .line 856
    .line 857
    invoke-static {v3, v5, v4}, Lcom/alibaba/fastjson2/util/TypeUtils;->parseInt([BII)I

    .line 858
    .line 859
    .line 860
    move-result v5

    .line 861
    add-int/lit8 v6, v2, -0x8

    .line 862
    .line 863
    invoke-static {v3, v6, v4}, Lcom/alibaba/fastjson2/util/TypeUtils;->parseInt([BII)I

    .line 864
    .line 865
    .line 866
    move-result v6

    .line 867
    add-int/lit8 v7, v2, -0x5

    .line 868
    .line 869
    invoke-static {v3, v7, v4}, Lcom/alibaba/fastjson2/util/TypeUtils;->parseInt([BII)I

    .line 870
    .line 871
    .line 872
    move-result v7

    .line 873
    sub-int/2addr v2, v4

    .line 874
    invoke-static {v3, v2, v4}, Lcom/alibaba/fastjson2/util/TypeUtils;->parseInt([BII)I

    .line 875
    .line 876
    .line 877
    move-result v8

    .line 878
    move v3, v0

    .line 879
    move v4, v1

    .line 880
    invoke-static/range {v3 .. v8}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    .line 881
    .line 882
    .line 883
    move-result-object v0

    .line 884
    return-object v0

    .line 885
    :cond_7
    :goto_2
    return-object v28

    .line 886
    nop

    .line 887
    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static parseLocalDateTimeX([CII)Ljava/time/LocalDateTime;
    .locals 33

    move/from16 v1, p1

    move/from16 v2, p2

    if-eqz p0, :cond_0

    if-nez v2, :cond_1

    :cond_0
    const/16 v28, 0x0

    goto/16 :goto_4

    :cond_1
    const/16 v4, 0x15

    if-lt v2, v4, :cond_2

    const/16 v4, 0x1d

    if-le v2, v4, :cond_3

    :cond_2
    const/16 v28, 0x0

    goto/16 :goto_4

    .line 887
    :cond_3
    aget-char v5, p0, v1

    add-int/lit8 v4, v1, 0x1

    .line 888
    aget-char v6, p0, v4

    add-int/lit8 v4, v1, 0x2

    .line 889
    aget-char v7, p0, v4

    add-int/lit8 v4, v1, 0x3

    .line 890
    aget-char v8, p0, v4

    add-int/lit8 v4, v1, 0x4

    .line 891
    aget-char v4, p0, v4

    add-int/lit8 v9, v1, 0x5

    .line 892
    aget-char v9, p0, v9

    add-int/lit8 v10, v1, 0x6

    .line 893
    aget-char v10, p0, v10

    add-int/lit8 v11, v1, 0x7

    .line 894
    aget-char v11, p0, v11

    add-int/lit8 v12, v1, 0x8

    .line 895
    aget-char v12, p0, v12

    add-int/lit8 v13, v1, 0x9

    .line 896
    aget-char v13, p0, v13

    add-int/lit8 v14, v1, 0xa

    .line 897
    aget-char v14, p0, v14

    add-int/lit8 v15, v1, 0xb

    .line 898
    aget-char v15, p0, v15

    add-int/lit8 v16, v1, 0xc

    .line 899
    aget-char v16, p0, v16

    add-int/lit8 v17, v1, 0xd

    const/16 v28, 0x0

    .line 900
    aget-char v3, p0, v17

    add-int/lit8 v17, v1, 0xe

    .line 901
    aget-char v17, p0, v17

    add-int/lit8 v18, v1, 0xf

    .line 902
    aget-char v18, p0, v18

    add-int/lit8 v19, v1, 0x10

    .line 903
    aget-char v2, p0, v19

    add-int/lit8 v19, v1, 0x11

    .line 904
    aget-char v19, p0, v19

    add-int/lit8 v20, v1, 0x12

    .line 905
    aget-char v20, p0, v20

    add-int/lit8 v21, v1, 0x13

    move/from16 v22, v5

    .line 906
    aget-char v5, p0, v21

    const/16 v21, 0x30

    packed-switch p2, :pswitch_data_0

    add-int/lit8 v21, v1, 0x14

    .line 907
    aget-char v21, p0, v21

    add-int/lit8 v23, v1, 0x15

    .line 908
    aget-char v23, p0, v23

    add-int/lit8 v24, v1, 0x16

    .line 909
    aget-char v24, p0, v24

    add-int/lit8 v25, v1, 0x17

    .line 910
    aget-char v25, p0, v25

    add-int/lit8 v26, v1, 0x18

    .line 911
    aget-char v26, p0, v26

    add-int/lit8 v27, v1, 0x19

    .line 912
    aget-char v27, p0, v27

    add-int/lit8 v29, v1, 0x1a

    .line 913
    aget-char v29, p0, v29

    add-int/lit8 v30, v1, 0x1b

    .line 914
    aget-char v30, p0, v30

    add-int/lit8 v31, v1, 0x1c

    .line 915
    aget-char v31, p0, v31

    move/from16 v32, v31

    move/from16 v31, v16

    move/from16 v16, v18

    move/from16 v18, v20

    move/from16 v20, v23

    move/from16 v23, v26

    move/from16 v26, v30

    move/from16 v30, v29

    move/from16 v29, v22

    move/from16 v22, v25

    move/from16 v25, v24

    move/from16 v24, v27

    move/from16 v27, v32

    goto/16 :goto_3

    :pswitch_0
    add-int/lit8 v23, v1, 0x14

    .line 916
    aget-char v23, p0, v23

    add-int/lit8 v24, v1, 0x15

    .line 917
    aget-char v24, p0, v24

    add-int/lit8 v25, v1, 0x16

    .line 918
    aget-char v25, p0, v25

    add-int/lit8 v26, v1, 0x17

    .line 919
    aget-char v26, p0, v26

    add-int/lit8 v27, v1, 0x18

    .line 920
    aget-char v27, p0, v27

    add-int/lit8 v29, v1, 0x19

    .line 921
    aget-char v29, p0, v29

    add-int/lit8 v30, v1, 0x1a

    .line 922
    aget-char v30, p0, v30

    add-int/lit8 v31, v1, 0x1b

    .line 923
    aget-char v31, p0, v31

    move/from16 v32, v31

    move/from16 v31, v16

    move/from16 v16, v18

    move/from16 v18, v20

    move/from16 v20, v24

    move/from16 v24, v29

    move/from16 v29, v22

    move/from16 v22, v26

    move/from16 v26, v32

    move/from16 v32, v27

    move/from16 v27, v21

    move/from16 v21, v23

    move/from16 v23, v32

    goto/16 :goto_3

    :pswitch_1
    add-int/lit8 v23, v1, 0x14

    .line 924
    aget-char v23, p0, v23

    add-int/lit8 v24, v1, 0x15

    .line 925
    aget-char v24, p0, v24

    add-int/lit8 v25, v1, 0x16

    .line 926
    aget-char v25, p0, v25

    add-int/lit8 v26, v1, 0x17

    .line 927
    aget-char v26, p0, v26

    add-int/lit8 v27, v1, 0x18

    .line 928
    aget-char v27, p0, v27

    add-int/lit8 v29, v1, 0x19

    .line 929
    aget-char v29, p0, v29

    add-int/lit8 v30, v1, 0x1a

    .line 930
    aget-char v30, p0, v30

    move/from16 v31, v16

    move/from16 v16, v18

    move/from16 v18, v20

    move/from16 v20, v24

    move/from16 v24, v29

    move/from16 v29, v22

    move/from16 v22, v26

    move/from16 v26, v21

    :goto_0
    move/from16 v21, v23

    move/from16 v23, v27

    :goto_1
    move/from16 v27, v26

    goto/16 :goto_3

    :pswitch_2
    add-int/lit8 v23, v1, 0x14

    .line 931
    aget-char v23, p0, v23

    add-int/lit8 v24, v1, 0x15

    .line 932
    aget-char v24, p0, v24

    add-int/lit8 v25, v1, 0x16

    .line 933
    aget-char v25, p0, v25

    add-int/lit8 v26, v1, 0x17

    .line 934
    aget-char v26, p0, v26

    add-int/lit8 v27, v1, 0x18

    .line 935
    aget-char v27, p0, v27

    add-int/lit8 v29, v1, 0x19

    .line 936
    aget-char v29, p0, v29

    move/from16 v31, v16

    move/from16 v16, v18

    move/from16 v18, v20

    move/from16 v30, v21

    move/from16 v20, v24

    move/from16 v24, v29

    move/from16 v29, v22

    move/from16 v21, v23

    move/from16 v22, v26

    move/from16 v23, v27

    move/from16 v26, v30

    goto :goto_1

    :pswitch_3
    add-int/lit8 v23, v1, 0x14

    .line 937
    aget-char v23, p0, v23

    add-int/lit8 v24, v1, 0x15

    .line 938
    aget-char v24, p0, v24

    add-int/lit8 v25, v1, 0x16

    .line 939
    aget-char v25, p0, v25

    add-int/lit8 v26, v1, 0x17

    .line 940
    aget-char v26, p0, v26

    add-int/lit8 v27, v1, 0x18

    .line 941
    aget-char v27, p0, v27

    move/from16 v31, v16

    move/from16 v16, v18

    move/from16 v18, v20

    move/from16 v30, v21

    move/from16 v29, v22

    move/from16 v20, v24

    move/from16 v22, v26

    move/from16 v24, v30

    move/from16 v26, v24

    goto :goto_0

    :pswitch_4
    add-int/lit8 v23, v1, 0x14

    .line 942
    aget-char v23, p0, v23

    add-int/lit8 v24, v1, 0x15

    .line 943
    aget-char v24, p0, v24

    add-int/lit8 v25, v1, 0x16

    .line 944
    aget-char v25, p0, v25

    add-int/lit8 v26, v1, 0x17

    .line 945
    aget-char v26, p0, v26

    move/from16 v31, v16

    move/from16 v16, v18

    move/from16 v18, v20

    move/from16 v27, v21

    move/from16 v30, v27

    move/from16 v29, v22

    move/from16 v20, v24

    move/from16 v22, v26

    move/from16 v24, v30

    move/from16 v26, v24

    move/from16 v21, v23

    move/from16 v23, v26

    goto :goto_3

    :pswitch_5
    add-int/lit8 v23, v1, 0x14

    .line 946
    aget-char v23, p0, v23

    add-int/lit8 v24, v1, 0x15

    .line 947
    aget-char v24, p0, v24

    add-int/lit8 v25, v1, 0x16

    .line 948
    aget-char v25, p0, v25

    move/from16 v31, v16

    move/from16 v16, v18

    move/from16 v18, v20

    move/from16 v26, v21

    :goto_2
    move/from16 v27, v26

    move/from16 v30, v27

    move/from16 v29, v22

    move/from16 v20, v24

    move/from16 v22, v30

    move/from16 v24, v22

    move/from16 v21, v23

    move/from16 v23, v24

    goto :goto_3

    :pswitch_6
    add-int/lit8 v23, v1, 0x14

    .line 949
    aget-char v23, p0, v23

    add-int/lit8 v24, v1, 0x15

    .line 950
    aget-char v24, p0, v24

    move/from16 v31, v16

    move/from16 v16, v18

    move/from16 v18, v20

    move/from16 v25, v21

    move/from16 v26, v25

    goto :goto_2

    :pswitch_7
    add-int/lit8 v23, v1, 0x14

    .line 951
    aget-char v23, p0, v23

    move/from16 v31, v16

    move/from16 v16, v18

    move/from16 v18, v20

    move/from16 v20, v21

    move/from16 v24, v20

    move/from16 v25, v24

    move/from16 v26, v25

    move/from16 v27, v26

    move/from16 v30, v27

    move/from16 v29, v22

    move/from16 v22, v30

    move/from16 v21, v23

    move/from16 v23, v22

    :goto_3
    const/16 v0, 0x2d

    if-ne v4, v0, :cond_5

    if-ne v11, v0, :cond_5

    const/16 v4, 0x20

    if-eq v14, v4, :cond_4

    const/16 v4, 0x54

    if-ne v14, v4, :cond_5

    :cond_4
    const/16 v4, 0x3a

    if-ne v3, v4, :cond_5

    if-ne v2, v4, :cond_5

    const/16 v2, 0x2e

    if-ne v5, v2, :cond_5

    move v11, v12

    move v12, v13

    move v13, v15

    move/from16 v15, v17

    move/from16 v17, v19

    move/from16 v19, v21

    move/from16 v21, v25

    move/from16 v5, v29

    move/from16 v25, v30

    move/from16 v14, v31

    .line 952
    invoke-static/range {v5 .. v27}, Lcom/alibaba/fastjson2/util/DateUtils;->localDateTime(CCCCCCCCCCCCCCCCCCCCCCC)Ljava/time/LocalDateTime;

    move-result-object v0

    return-object v0

    :cond_5
    add-int v2, v1, p2

    add-int/lit8 v3, v2, -0xf

    .line 953
    aget-char v3, p0, v3

    if-ne v3, v0, :cond_7

    add-int/lit8 v3, v2, -0xc

    aget-char v3, p0, v3

    if-ne v3, v0, :cond_7

    add-int/lit8 v0, v2, -0x9

    aget-char v0, p0, v0

    const/16 v3, 0x20

    if-eq v0, v3, :cond_6

    const/16 v3, 0x54

    if-ne v0, v3, :cond_7

    :cond_6
    add-int/lit8 v0, v2, -0x6

    aget-char v0, p0, v0

    const/16 v4, 0x3a

    if-ne v0, v4, :cond_7

    add-int/lit8 v0, v2, -0x3

    aget-char v0, p0, v0

    if-ne v0, v4, :cond_7

    add-int/lit8 v0, p2, -0xf

    move-object/from16 v3, p0

    .line 954
    invoke-static {v3, v1, v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->parseInt([CII)I

    move-result v0

    add-int/lit8 v1, v2, -0xe

    const/4 v4, 0x2

    .line 955
    invoke-static {v3, v1, v4}, Lcom/alibaba/fastjson2/util/TypeUtils;->parseInt([CII)I

    move-result v1

    add-int/lit8 v5, v2, -0xb

    .line 956
    invoke-static {v3, v5, v4}, Lcom/alibaba/fastjson2/util/TypeUtils;->parseInt([CII)I

    move-result v5

    add-int/lit8 v6, v2, -0x8

    .line 957
    invoke-static {v3, v6, v4}, Lcom/alibaba/fastjson2/util/TypeUtils;->parseInt([CII)I

    move-result v6

    add-int/lit8 v7, v2, -0x5

    .line 958
    invoke-static {v3, v7, v4}, Lcom/alibaba/fastjson2/util/TypeUtils;->parseInt([CII)I

    move-result v7

    sub-int/2addr v2, v4

    .line 959
    invoke-static {v3, v2, v4}, Lcom/alibaba/fastjson2/util/TypeUtils;->parseInt([CII)I

    move-result v8

    move v3, v0

    move v4, v1

    .line 960
    invoke-static/range {v3 .. v8}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    move-result-object v0

    return-object v0

    :cond_7
    :goto_4
    return-object v28

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static parseLocalTime(CCCCCCCC)Ljava/time/LocalTime;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/16 v1, 0x3a

    .line 3
    .line 4
    if-ne p2, v1, :cond_0

    .line 5
    .line 6
    if-ne p5, v1, :cond_0

    .line 7
    .line 8
    const/16 p2, 0x30

    .line 9
    .line 10
    if-lt p0, p2, :cond_0

    .line 11
    .line 12
    const/16 p5, 0x39

    .line 13
    .line 14
    if-gt p0, p5, :cond_0

    .line 15
    .line 16
    if-lt p1, p2, :cond_0

    .line 17
    .line 18
    if-gt p1, p5, :cond_0

    .line 19
    .line 20
    sub-int/2addr p0, p2

    .line 21
    mul-int/lit8 p0, p0, 0xa

    .line 22
    .line 23
    sub-int/2addr p1, p2

    .line 24
    add-int/2addr p1, p0

    .line 25
    if-lt p3, p2, :cond_0

    .line 26
    .line 27
    if-gt p3, p5, :cond_0

    .line 28
    .line 29
    if-lt p4, p2, :cond_0

    .line 30
    .line 31
    if-gt p4, p5, :cond_0

    .line 32
    .line 33
    sub-int/2addr p3, p2

    .line 34
    mul-int/lit8 p3, p3, 0xa

    .line 35
    .line 36
    sub-int/2addr p4, p2

    .line 37
    add-int/2addr p4, p3

    .line 38
    if-lt p6, p2, :cond_0

    .line 39
    .line 40
    if-gt p6, p5, :cond_0

    .line 41
    .line 42
    if-lt p7, p2, :cond_0

    .line 43
    .line 44
    if-gt p7, p5, :cond_0

    .line 45
    .line 46
    sub-int/2addr p6, p2

    .line 47
    mul-int/lit8 p6, p6, 0xa

    .line 48
    .line 49
    sub-int/2addr p7, p2

    .line 50
    add-int/2addr p7, p6

    .line 51
    invoke-static {p1, p4, p7}, Ljava/time/LocalTime;->of(III)Ljava/time/LocalTime;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :cond_0
    return-object v0
.end method

.method public static parseLocalTime10([BI)Ljava/time/LocalTime;
    .locals 10

    .line 1
    add-int/lit8 v0, p1, 0xa

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-le v0, v1, :cond_0

    .line 6
    .line 7
    return-object v2

    .line 8
    :cond_0
    aget-byte v0, p0, p1

    .line 9
    .line 10
    add-int/lit8 v1, p1, 0x1

    .line 11
    .line 12
    aget-byte v1, p0, v1

    .line 13
    .line 14
    add-int/lit8 v3, p1, 0x2

    .line 15
    .line 16
    aget-byte v3, p0, v3

    .line 17
    .line 18
    add-int/lit8 v4, p1, 0x3

    .line 19
    .line 20
    aget-byte v4, p0, v4

    .line 21
    .line 22
    add-int/lit8 v5, p1, 0x4

    .line 23
    .line 24
    aget-byte v5, p0, v5

    .line 25
    .line 26
    add-int/lit8 v6, p1, 0x5

    .line 27
    .line 28
    aget-byte v6, p0, v6

    .line 29
    .line 30
    add-int/lit8 v7, p1, 0x6

    .line 31
    .line 32
    aget-byte v7, p0, v7

    .line 33
    .line 34
    add-int/lit8 v8, p1, 0x7

    .line 35
    .line 36
    aget-byte v8, p0, v8

    .line 37
    .line 38
    add-int/lit8 v9, p1, 0x8

    .line 39
    .line 40
    aget-byte v9, p0, v9

    .line 41
    .line 42
    add-int/lit8 p1, p1, 0x9

    .line 43
    .line 44
    aget-byte p0, p0, p1

    .line 45
    .line 46
    const/16 p1, 0x3a

    .line 47
    .line 48
    if-ne v3, p1, :cond_1

    .line 49
    .line 50
    if-ne v6, p1, :cond_1

    .line 51
    .line 52
    const/16 p1, 0x2e

    .line 53
    .line 54
    if-ne v9, p1, :cond_1

    .line 55
    .line 56
    const/16 p1, 0x30

    .line 57
    .line 58
    if-lt v0, p1, :cond_1

    .line 59
    .line 60
    const/16 v3, 0x39

    .line 61
    .line 62
    if-gt v0, v3, :cond_1

    .line 63
    .line 64
    if-lt v1, p1, :cond_1

    .line 65
    .line 66
    if-gt v1, v3, :cond_1

    .line 67
    .line 68
    sub-int/2addr v0, p1

    .line 69
    mul-int/lit8 v0, v0, 0xa

    .line 70
    .line 71
    sub-int/2addr v1, p1

    .line 72
    add-int/2addr v1, v0

    .line 73
    if-lt v4, p1, :cond_1

    .line 74
    .line 75
    if-gt v4, v3, :cond_1

    .line 76
    .line 77
    if-lt v5, p1, :cond_1

    .line 78
    .line 79
    if-gt v5, v3, :cond_1

    .line 80
    .line 81
    sub-int/2addr v4, p1

    .line 82
    mul-int/lit8 v4, v4, 0xa

    .line 83
    .line 84
    sub-int/2addr v5, p1

    .line 85
    add-int/2addr v5, v4

    .line 86
    if-lt v7, p1, :cond_1

    .line 87
    .line 88
    if-gt v7, v3, :cond_1

    .line 89
    .line 90
    if-lt v8, p1, :cond_1

    .line 91
    .line 92
    if-gt v8, v3, :cond_1

    .line 93
    .line 94
    sub-int/2addr v7, p1

    .line 95
    mul-int/lit8 v7, v7, 0xa

    .line 96
    .line 97
    sub-int/2addr v8, p1

    .line 98
    add-int/2addr v8, v7

    .line 99
    if-lt p0, p1, :cond_1

    .line 100
    .line 101
    if-gt p0, v3, :cond_1

    .line 102
    .line 103
    sub-int/2addr p0, p1

    .line 104
    const p1, 0x5f5e100

    .line 105
    .line 106
    .line 107
    mul-int/2addr p0, p1

    .line 108
    invoke-static {v1, v5, v8, p0}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    return-object p0

    .line 113
    :cond_1
    return-object v2
.end method

.method public static parseLocalTime10([CI)Ljava/time/LocalTime;
    .locals 10

    add-int/lit8 v0, p1, 0xa

    .line 114
    array-length v1, p0

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    return-object v2

    .line 115
    :cond_0
    aget-char v0, p0, p1

    add-int/lit8 v1, p1, 0x1

    .line 116
    aget-char v1, p0, v1

    add-int/lit8 v3, p1, 0x2

    .line 117
    aget-char v3, p0, v3

    add-int/lit8 v4, p1, 0x3

    .line 118
    aget-char v4, p0, v4

    add-int/lit8 v5, p1, 0x4

    .line 119
    aget-char v5, p0, v5

    add-int/lit8 v6, p1, 0x5

    .line 120
    aget-char v6, p0, v6

    add-int/lit8 v7, p1, 0x6

    .line 121
    aget-char v7, p0, v7

    add-int/lit8 v8, p1, 0x7

    .line 122
    aget-char v8, p0, v8

    add-int/lit8 v9, p1, 0x8

    .line 123
    aget-char v9, p0, v9

    add-int/lit8 p1, p1, 0x9

    .line 124
    aget-char p0, p0, p1

    const/16 p1, 0x3a

    if-ne v3, p1, :cond_1

    if-ne v6, p1, :cond_1

    const/16 p1, 0x2e

    if-ne v9, p1, :cond_1

    const/16 p1, 0x30

    if-lt v0, p1, :cond_1

    const/16 v3, 0x39

    if-gt v0, v3, :cond_1

    if-lt v1, p1, :cond_1

    if-gt v1, v3, :cond_1

    sub-int/2addr v0, p1

    mul-int/lit8 v0, v0, 0xa

    sub-int/2addr v1, p1

    add-int/2addr v1, v0

    if-lt v4, p1, :cond_1

    if-gt v4, v3, :cond_1

    if-lt v5, p1, :cond_1

    if-gt v5, v3, :cond_1

    sub-int/2addr v4, p1

    mul-int/lit8 v4, v4, 0xa

    sub-int/2addr v5, p1

    add-int/2addr v5, v4

    if-lt v7, p1, :cond_1

    if-gt v7, v3, :cond_1

    if-lt v8, p1, :cond_1

    if-gt v8, v3, :cond_1

    sub-int/2addr v7, p1

    mul-int/lit8 v7, v7, 0xa

    sub-int/2addr v8, p1

    add-int/2addr v8, v7

    if-lt p0, p1, :cond_1

    if-gt p0, v3, :cond_1

    sub-int/2addr p0, p1

    const p1, 0x5f5e100

    mul-int/2addr p0, p1

    .line 125
    invoke-static {v1, v5, v8, p0}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v2
.end method

.method public static parseLocalTime11([BI)Ljava/time/LocalTime;
    .locals 11

    .line 1
    add-int/lit8 v0, p1, 0xb

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-le v0, v1, :cond_0

    .line 6
    .line 7
    return-object v2

    .line 8
    :cond_0
    aget-byte v0, p0, p1

    .line 9
    .line 10
    add-int/lit8 v1, p1, 0x1

    .line 11
    .line 12
    aget-byte v1, p0, v1

    .line 13
    .line 14
    add-int/lit8 v3, p1, 0x2

    .line 15
    .line 16
    aget-byte v3, p0, v3

    .line 17
    .line 18
    add-int/lit8 v4, p1, 0x3

    .line 19
    .line 20
    aget-byte v4, p0, v4

    .line 21
    .line 22
    add-int/lit8 v5, p1, 0x4

    .line 23
    .line 24
    aget-byte v5, p0, v5

    .line 25
    .line 26
    add-int/lit8 v6, p1, 0x5

    .line 27
    .line 28
    aget-byte v6, p0, v6

    .line 29
    .line 30
    add-int/lit8 v7, p1, 0x6

    .line 31
    .line 32
    aget-byte v7, p0, v7

    .line 33
    .line 34
    add-int/lit8 v8, p1, 0x7

    .line 35
    .line 36
    aget-byte v8, p0, v8

    .line 37
    .line 38
    add-int/lit8 v9, p1, 0x8

    .line 39
    .line 40
    aget-byte v9, p0, v9

    .line 41
    .line 42
    add-int/lit8 v10, p1, 0x9

    .line 43
    .line 44
    aget-byte v10, p0, v10

    .line 45
    .line 46
    add-int/lit8 p1, p1, 0xa

    .line 47
    .line 48
    aget-byte p0, p0, p1

    .line 49
    .line 50
    const/16 p1, 0x3a

    .line 51
    .line 52
    if-ne v3, p1, :cond_1

    .line 53
    .line 54
    if-ne v6, p1, :cond_1

    .line 55
    .line 56
    const/16 p1, 0x2e

    .line 57
    .line 58
    if-ne v9, p1, :cond_1

    .line 59
    .line 60
    const/16 p1, 0x30

    .line 61
    .line 62
    if-lt v0, p1, :cond_1

    .line 63
    .line 64
    const/16 v3, 0x39

    .line 65
    .line 66
    if-gt v0, v3, :cond_1

    .line 67
    .line 68
    if-lt v1, p1, :cond_1

    .line 69
    .line 70
    if-gt v1, v3, :cond_1

    .line 71
    .line 72
    sub-int/2addr v0, p1

    .line 73
    mul-int/lit8 v0, v0, 0xa

    .line 74
    .line 75
    sub-int/2addr v1, p1

    .line 76
    add-int/2addr v1, v0

    .line 77
    if-lt v4, p1, :cond_1

    .line 78
    .line 79
    if-gt v4, v3, :cond_1

    .line 80
    .line 81
    if-lt v5, p1, :cond_1

    .line 82
    .line 83
    if-gt v5, v3, :cond_1

    .line 84
    .line 85
    sub-int/2addr v4, p1

    .line 86
    mul-int/lit8 v4, v4, 0xa

    .line 87
    .line 88
    sub-int/2addr v5, p1

    .line 89
    add-int/2addr v5, v4

    .line 90
    if-lt v7, p1, :cond_1

    .line 91
    .line 92
    if-gt v7, v3, :cond_1

    .line 93
    .line 94
    if-lt v8, p1, :cond_1

    .line 95
    .line 96
    if-gt v8, v3, :cond_1

    .line 97
    .line 98
    sub-int/2addr v7, p1

    .line 99
    mul-int/lit8 v7, v7, 0xa

    .line 100
    .line 101
    sub-int/2addr v8, p1

    .line 102
    add-int/2addr v8, v7

    .line 103
    if-lt v10, p1, :cond_1

    .line 104
    .line 105
    if-gt v10, v3, :cond_1

    .line 106
    .line 107
    if-lt p0, p1, :cond_1

    .line 108
    .line 109
    if-gt p0, v3, :cond_1

    .line 110
    .line 111
    sub-int/2addr v10, p1

    .line 112
    mul-int/lit8 v10, v10, 0x64

    .line 113
    .line 114
    sub-int/2addr p0, p1

    .line 115
    mul-int/lit8 p0, p0, 0xa

    .line 116
    .line 117
    add-int/2addr p0, v10

    .line 118
    const p1, 0xf4240

    .line 119
    .line 120
    .line 121
    mul-int/2addr p0, p1

    .line 122
    invoke-static {v1, v5, v8, p0}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    return-object p0

    .line 127
    :cond_1
    return-object v2
.end method

.method public static parseLocalTime11([CI)Ljava/time/LocalTime;
    .locals 11

    add-int/lit8 v0, p1, 0xb

    .line 128
    array-length v1, p0

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    return-object v2

    .line 129
    :cond_0
    aget-char v0, p0, p1

    add-int/lit8 v1, p1, 0x1

    .line 130
    aget-char v1, p0, v1

    add-int/lit8 v3, p1, 0x2

    .line 131
    aget-char v3, p0, v3

    add-int/lit8 v4, p1, 0x3

    .line 132
    aget-char v4, p0, v4

    add-int/lit8 v5, p1, 0x4

    .line 133
    aget-char v5, p0, v5

    add-int/lit8 v6, p1, 0x5

    .line 134
    aget-char v6, p0, v6

    add-int/lit8 v7, p1, 0x6

    .line 135
    aget-char v7, p0, v7

    add-int/lit8 v8, p1, 0x7

    .line 136
    aget-char v8, p0, v8

    add-int/lit8 v9, p1, 0x8

    .line 137
    aget-char v9, p0, v9

    add-int/lit8 v10, p1, 0x9

    .line 138
    aget-char v10, p0, v10

    add-int/lit8 p1, p1, 0xa

    .line 139
    aget-char p0, p0, p1

    const/16 p1, 0x3a

    if-ne v3, p1, :cond_1

    if-ne v6, p1, :cond_1

    const/16 p1, 0x2e

    if-ne v9, p1, :cond_1

    const/16 p1, 0x30

    if-lt v0, p1, :cond_1

    const/16 v3, 0x39

    if-gt v0, v3, :cond_1

    if-lt v1, p1, :cond_1

    if-gt v1, v3, :cond_1

    sub-int/2addr v0, p1

    mul-int/lit8 v0, v0, 0xa

    sub-int/2addr v1, p1

    add-int/2addr v1, v0

    if-lt v4, p1, :cond_1

    if-gt v4, v3, :cond_1

    if-lt v5, p1, :cond_1

    if-gt v5, v3, :cond_1

    sub-int/2addr v4, p1

    mul-int/lit8 v4, v4, 0xa

    sub-int/2addr v5, p1

    add-int/2addr v5, v4

    if-lt v7, p1, :cond_1

    if-gt v7, v3, :cond_1

    if-lt v8, p1, :cond_1

    if-gt v8, v3, :cond_1

    sub-int/2addr v7, p1

    mul-int/lit8 v7, v7, 0xa

    sub-int/2addr v8, p1

    add-int/2addr v8, v7

    if-lt v10, p1, :cond_1

    if-gt v10, v3, :cond_1

    if-lt p0, p1, :cond_1

    if-gt p0, v3, :cond_1

    sub-int/2addr v10, p1

    mul-int/lit8 v10, v10, 0x64

    sub-int/2addr p0, p1

    mul-int/lit8 p0, p0, 0xa

    add-int/2addr p0, v10

    const p1, 0xf4240

    mul-int/2addr p0, p1

    .line 140
    invoke-static {v1, v5, v8, p0}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v2
.end method

.method public static parseLocalTime12([BI)Ljava/time/LocalTime;
    .locals 12

    .line 1
    add-int/lit8 v0, p1, 0xc

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-le v0, v1, :cond_0

    .line 6
    .line 7
    return-object v2

    .line 8
    :cond_0
    aget-byte v0, p0, p1

    .line 9
    .line 10
    add-int/lit8 v1, p1, 0x1

    .line 11
    .line 12
    aget-byte v1, p0, v1

    .line 13
    .line 14
    add-int/lit8 v3, p1, 0x2

    .line 15
    .line 16
    aget-byte v3, p0, v3

    .line 17
    .line 18
    add-int/lit8 v4, p1, 0x3

    .line 19
    .line 20
    aget-byte v4, p0, v4

    .line 21
    .line 22
    add-int/lit8 v5, p1, 0x4

    .line 23
    .line 24
    aget-byte v5, p0, v5

    .line 25
    .line 26
    add-int/lit8 v6, p1, 0x5

    .line 27
    .line 28
    aget-byte v6, p0, v6

    .line 29
    .line 30
    add-int/lit8 v7, p1, 0x6

    .line 31
    .line 32
    aget-byte v7, p0, v7

    .line 33
    .line 34
    add-int/lit8 v8, p1, 0x7

    .line 35
    .line 36
    aget-byte v8, p0, v8

    .line 37
    .line 38
    add-int/lit8 v9, p1, 0x8

    .line 39
    .line 40
    aget-byte v9, p0, v9

    .line 41
    .line 42
    add-int/lit8 v10, p1, 0x9

    .line 43
    .line 44
    aget-byte v10, p0, v10

    .line 45
    .line 46
    add-int/lit8 v11, p1, 0xa

    .line 47
    .line 48
    aget-byte v11, p0, v11

    .line 49
    .line 50
    add-int/lit8 p1, p1, 0xb

    .line 51
    .line 52
    aget-byte p0, p0, p1

    .line 53
    .line 54
    const/16 p1, 0x3a

    .line 55
    .line 56
    if-ne v3, p1, :cond_1

    .line 57
    .line 58
    if-ne v6, p1, :cond_1

    .line 59
    .line 60
    const/16 p1, 0x2e

    .line 61
    .line 62
    if-ne v9, p1, :cond_1

    .line 63
    .line 64
    const/16 p1, 0x30

    .line 65
    .line 66
    if-lt v0, p1, :cond_1

    .line 67
    .line 68
    const/16 v3, 0x39

    .line 69
    .line 70
    if-gt v0, v3, :cond_1

    .line 71
    .line 72
    if-lt v1, p1, :cond_1

    .line 73
    .line 74
    if-gt v1, v3, :cond_1

    .line 75
    .line 76
    sub-int/2addr v0, p1

    .line 77
    const/16 v6, 0xa

    .line 78
    .line 79
    mul-int/2addr v0, v6

    .line 80
    sub-int/2addr v1, p1

    .line 81
    add-int/2addr v1, v0

    .line 82
    if-lt v4, p1, :cond_1

    .line 83
    .line 84
    if-gt v4, v3, :cond_1

    .line 85
    .line 86
    if-lt v5, p1, :cond_1

    .line 87
    .line 88
    if-gt v5, v3, :cond_1

    .line 89
    .line 90
    sub-int/2addr v4, p1

    .line 91
    mul-int/2addr v4, v6

    .line 92
    sub-int/2addr v5, p1

    .line 93
    add-int/2addr v5, v4

    .line 94
    if-lt v7, p1, :cond_1

    .line 95
    .line 96
    if-gt v7, v3, :cond_1

    .line 97
    .line 98
    if-lt v8, p1, :cond_1

    .line 99
    .line 100
    if-gt v8, v3, :cond_1

    .line 101
    .line 102
    sub-int/2addr v7, p1

    .line 103
    mul-int/2addr v7, v6

    .line 104
    sub-int/2addr v8, p1

    .line 105
    add-int/2addr v8, v7

    .line 106
    if-lt v10, p1, :cond_1

    .line 107
    .line 108
    if-gt v10, v3, :cond_1

    .line 109
    .line 110
    if-lt v11, p1, :cond_1

    .line 111
    .line 112
    if-gt v11, v3, :cond_1

    .line 113
    .line 114
    if-lt p0, p1, :cond_1

    .line 115
    .line 116
    if-gt p0, v3, :cond_1

    .line 117
    .line 118
    sub-int/2addr v10, p1

    .line 119
    mul-int/lit8 v10, v10, 0x64

    .line 120
    .line 121
    invoke-static {v11, p1, v6, v10}, Lp/a;->z(IIII)I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    sub-int/2addr p0, p1

    .line 126
    add-int/2addr p0, v0

    .line 127
    const p1, 0xf4240

    .line 128
    .line 129
    .line 130
    mul-int/2addr p0, p1

    .line 131
    invoke-static {v1, v5, v8, p0}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    return-object p0

    .line 136
    :cond_1
    return-object v2
.end method

.method public static parseLocalTime12([CI)Ljava/time/LocalTime;
    .locals 12

    add-int/lit8 v0, p1, 0xc

    .line 137
    array-length v1, p0

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    return-object v2

    .line 138
    :cond_0
    aget-char v0, p0, p1

    add-int/lit8 v1, p1, 0x1

    .line 139
    aget-char v1, p0, v1

    add-int/lit8 v3, p1, 0x2

    .line 140
    aget-char v3, p0, v3

    add-int/lit8 v4, p1, 0x3

    .line 141
    aget-char v4, p0, v4

    add-int/lit8 v5, p1, 0x4

    .line 142
    aget-char v5, p0, v5

    add-int/lit8 v6, p1, 0x5

    .line 143
    aget-char v6, p0, v6

    add-int/lit8 v7, p1, 0x6

    .line 144
    aget-char v7, p0, v7

    add-int/lit8 v8, p1, 0x7

    .line 145
    aget-char v8, p0, v8

    add-int/lit8 v9, p1, 0x8

    .line 146
    aget-char v9, p0, v9

    add-int/lit8 v10, p1, 0x9

    .line 147
    aget-char v10, p0, v10

    add-int/lit8 v11, p1, 0xa

    .line 148
    aget-char v11, p0, v11

    add-int/lit8 p1, p1, 0xb

    .line 149
    aget-char p0, p0, p1

    const/16 p1, 0x3a

    if-ne v3, p1, :cond_1

    if-ne v6, p1, :cond_1

    const/16 p1, 0x2e

    if-ne v9, p1, :cond_1

    const/16 p1, 0x30

    if-lt v0, p1, :cond_1

    const/16 v3, 0x39

    if-gt v0, v3, :cond_1

    if-lt v1, p1, :cond_1

    if-gt v1, v3, :cond_1

    sub-int/2addr v0, p1

    const/16 v6, 0xa

    mul-int/2addr v0, v6

    sub-int/2addr v1, p1

    add-int/2addr v1, v0

    if-lt v4, p1, :cond_1

    if-gt v4, v3, :cond_1

    if-lt v5, p1, :cond_1

    if-gt v5, v3, :cond_1

    sub-int/2addr v4, p1

    mul-int/2addr v4, v6

    sub-int/2addr v5, p1

    add-int/2addr v5, v4

    if-lt v7, p1, :cond_1

    if-gt v7, v3, :cond_1

    if-lt v8, p1, :cond_1

    if-gt v8, v3, :cond_1

    sub-int/2addr v7, p1

    mul-int/2addr v7, v6

    sub-int/2addr v8, p1

    add-int/2addr v8, v7

    if-lt v10, p1, :cond_1

    if-gt v10, v3, :cond_1

    if-lt v11, p1, :cond_1

    if-gt v11, v3, :cond_1

    if-lt p0, p1, :cond_1

    if-gt p0, v3, :cond_1

    sub-int/2addr v10, p1

    mul-int/lit8 v10, v10, 0x64

    .line 150
    invoke-static {v11, p1, v6, v10}, Lp/a;->z(IIII)I

    move-result v0

    sub-int/2addr p0, p1

    add-int/2addr p0, v0

    const p1, 0xf4240

    mul-int/2addr p0, p1

    .line 151
    invoke-static {v1, v5, v8, p0}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v2
.end method

.method public static parseLocalTime15([BI)Ljava/time/LocalTime;
    .locals 6

    add-int/lit8 v0, p1, 0xf

    .line 66
    array-length v1, p0

    const/4 v2, 0x0

    if-gt v0, v1, :cond_2

    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->hms([BI)J

    move-result-wide v0

    const-wide/16 v3, -0x1

    cmp-long v3, v0, v3

    if-eqz v3, :cond_2

    add-int/lit8 v3, p1, 0x8

    aget-byte v3, p0, v3

    const/16 v4, 0x2e

    if-eq v3, v4, :cond_0

    goto :goto_0

    :cond_0
    long-to-int v3, v0

    and-int/lit16 v3, v3, 0xff

    const/16 v4, 0x18

    shr-long v4, v0, v4

    long-to-int v4, v4

    and-int/lit16 v4, v4, 0xff

    const/16 v5, 0x30

    shr-long/2addr v0, v5

    long-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 p1, p1, 0x9

    const/4 v1, 0x6

    .line 67
    invoke-static {p0, v1, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->readNanos([BII)I

    move-result p0

    if-gez p0, :cond_1

    return-object v2

    .line 68
    :cond_1
    invoke-static {v3, v4, v0, p0}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_0
    return-object v2
.end method

.method public static parseLocalTime15([CI)Ljava/time/LocalTime;
    .locals 5

    .line 1
    add-int/lit8 v0, p1, 0xf

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-gt v0, v1, :cond_2

    .line 6
    .line 7
    add-int/lit8 v0, p1, 0x2

    .line 8
    .line 9
    aget-char v0, p0, v0

    .line 10
    .line 11
    const/16 v1, 0x3a

    .line 12
    .line 13
    if-ne v0, v1, :cond_2

    .line 14
    .line 15
    add-int/lit8 v0, p1, 0x5

    .line 16
    .line 17
    aget-char v0, p0, v0

    .line 18
    .line 19
    if-ne v0, v1, :cond_2

    .line 20
    .line 21
    add-int/lit8 v0, p1, 0x8

    .line 22
    .line 23
    aget-char v0, p0, v0

    .line 24
    .line 25
    const/16 v1, 0x2e

    .line 26
    .line 27
    if-eq v0, v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/IOUtils;->digit2([CI)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    add-int/lit8 v1, p1, 0x3

    .line 35
    .line 36
    invoke-static {p0, v1}, Lcom/alibaba/fastjson2/util/IOUtils;->digit2([CI)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    add-int/lit8 v3, p1, 0x6

    .line 41
    .line 42
    invoke-static {p0, v3}, Lcom/alibaba/fastjson2/util/IOUtils;->digit2([CI)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    add-int/lit8 p1, p1, 0x9

    .line 47
    .line 48
    const/4 v4, 0x6

    .line 49
    invoke-static {p0, v4, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->readNanos([CII)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    or-int p1, v0, v1

    .line 54
    .line 55
    or-int/2addr p1, v3

    .line 56
    or-int/2addr p1, p0

    .line 57
    if-gez p1, :cond_1

    .line 58
    .line 59
    return-object v2

    .line 60
    :cond_1
    invoke-static {v0, v1, v3, p0}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_2
    :goto_0
    return-object v2
.end method

.method public static parseLocalTime18([BI)Ljava/time/LocalTime;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    add-int/lit8 v1, p1, 0x12

    .line 4
    .line 5
    array-length v2, v0

    .line 6
    const/4 v3, 0x0

    .line 7
    if-le v1, v2, :cond_0

    .line 8
    .line 9
    return-object v3

    .line 10
    :cond_0
    aget-byte v1, v0, p1

    .line 11
    .line 12
    add-int/lit8 v2, p1, 0x1

    .line 13
    .line 14
    aget-byte v2, v0, v2

    .line 15
    .line 16
    add-int/lit8 v4, p1, 0x2

    .line 17
    .line 18
    aget-byte v4, v0, v4

    .line 19
    .line 20
    add-int/lit8 v5, p1, 0x3

    .line 21
    .line 22
    aget-byte v5, v0, v5

    .line 23
    .line 24
    add-int/lit8 v6, p1, 0x4

    .line 25
    .line 26
    aget-byte v6, v0, v6

    .line 27
    .line 28
    add-int/lit8 v7, p1, 0x5

    .line 29
    .line 30
    aget-byte v7, v0, v7

    .line 31
    .line 32
    add-int/lit8 v8, p1, 0x6

    .line 33
    .line 34
    aget-byte v8, v0, v8

    .line 35
    .line 36
    add-int/lit8 v9, p1, 0x7

    .line 37
    .line 38
    aget-byte v9, v0, v9

    .line 39
    .line 40
    add-int/lit8 v10, p1, 0x8

    .line 41
    .line 42
    aget-byte v10, v0, v10

    .line 43
    .line 44
    add-int/lit8 v11, p1, 0x9

    .line 45
    .line 46
    aget-byte v11, v0, v11

    .line 47
    .line 48
    add-int/lit8 v12, p1, 0xa

    .line 49
    .line 50
    aget-byte v12, v0, v12

    .line 51
    .line 52
    add-int/lit8 v13, p1, 0xb

    .line 53
    .line 54
    aget-byte v13, v0, v13

    .line 55
    .line 56
    add-int/lit8 v14, p1, 0xc

    .line 57
    .line 58
    aget-byte v14, v0, v14

    .line 59
    .line 60
    add-int/lit8 v15, p1, 0xd

    .line 61
    .line 62
    aget-byte v15, v0, v15

    .line 63
    .line 64
    add-int/lit8 v16, p1, 0xe

    .line 65
    .line 66
    move-object/from16 v17, v3

    .line 67
    .line 68
    aget-byte v3, v0, v16

    .line 69
    .line 70
    add-int/lit8 v16, p1, 0xf

    .line 71
    .line 72
    aget-byte v0, p0, v16

    .line 73
    .line 74
    add-int/lit8 v16, p1, 0x10

    .line 75
    .line 76
    move/from16 v18, v0

    .line 77
    .line 78
    aget-byte v0, p0, v16

    .line 79
    .line 80
    add-int/lit8 v16, p1, 0x11

    .line 81
    .line 82
    move/from16 v19, v0

    .line 83
    .line 84
    aget-byte v0, p0, v16

    .line 85
    .line 86
    move/from16 p0, v0

    .line 87
    .line 88
    const/16 v0, 0x3a

    .line 89
    .line 90
    if-ne v4, v0, :cond_1

    .line 91
    .line 92
    if-ne v7, v0, :cond_1

    .line 93
    .line 94
    const/16 v0, 0x2e

    .line 95
    .line 96
    if-ne v10, v0, :cond_1

    .line 97
    .line 98
    const/16 v0, 0x30

    .line 99
    .line 100
    if-lt v1, v0, :cond_1

    .line 101
    .line 102
    const/16 v4, 0x39

    .line 103
    .line 104
    if-gt v1, v4, :cond_1

    .line 105
    .line 106
    if-lt v2, v0, :cond_1

    .line 107
    .line 108
    if-gt v2, v4, :cond_1

    .line 109
    .line 110
    sub-int/2addr v1, v0

    .line 111
    const/16 v7, 0xa

    .line 112
    .line 113
    mul-int/2addr v1, v7

    .line 114
    sub-int/2addr v2, v0

    .line 115
    add-int/2addr v2, v1

    .line 116
    if-lt v5, v0, :cond_1

    .line 117
    .line 118
    if-gt v5, v4, :cond_1

    .line 119
    .line 120
    if-lt v6, v0, :cond_1

    .line 121
    .line 122
    if-gt v6, v4, :cond_1

    .line 123
    .line 124
    sub-int/2addr v5, v0

    .line 125
    mul-int/2addr v5, v7

    .line 126
    sub-int/2addr v6, v0

    .line 127
    add-int/2addr v6, v5

    .line 128
    if-lt v8, v0, :cond_1

    .line 129
    .line 130
    if-gt v8, v4, :cond_1

    .line 131
    .line 132
    if-lt v9, v0, :cond_1

    .line 133
    .line 134
    if-gt v9, v4, :cond_1

    .line 135
    .line 136
    sub-int/2addr v8, v0

    .line 137
    mul-int/2addr v8, v7

    .line 138
    sub-int/2addr v9, v0

    .line 139
    add-int/2addr v9, v8

    .line 140
    if-lt v11, v0, :cond_1

    .line 141
    .line 142
    if-gt v11, v4, :cond_1

    .line 143
    .line 144
    if-lt v12, v0, :cond_1

    .line 145
    .line 146
    if-gt v12, v4, :cond_1

    .line 147
    .line 148
    if-lt v13, v0, :cond_1

    .line 149
    .line 150
    if-gt v13, v4, :cond_1

    .line 151
    .line 152
    if-lt v14, v0, :cond_1

    .line 153
    .line 154
    if-gt v14, v4, :cond_1

    .line 155
    .line 156
    if-lt v15, v0, :cond_1

    .line 157
    .line 158
    if-gt v15, v4, :cond_1

    .line 159
    .line 160
    if-lt v3, v0, :cond_1

    .line 161
    .line 162
    if-gt v3, v4, :cond_1

    .line 163
    .line 164
    move/from16 v1, v18

    .line 165
    .line 166
    if-lt v1, v0, :cond_1

    .line 167
    .line 168
    if-gt v1, v4, :cond_1

    .line 169
    .line 170
    move/from16 v5, v19

    .line 171
    .line 172
    if-lt v5, v0, :cond_1

    .line 173
    .line 174
    if-gt v5, v4, :cond_1

    .line 175
    .line 176
    move/from16 v8, p0

    .line 177
    .line 178
    if-lt v8, v0, :cond_1

    .line 179
    .line 180
    if-gt v8, v4, :cond_1

    .line 181
    .line 182
    sub-int/2addr v11, v0

    .line 183
    const v4, 0x5f5e100

    .line 184
    .line 185
    .line 186
    mul-int/2addr v11, v4

    .line 187
    const v4, 0x989680

    .line 188
    .line 189
    .line 190
    invoke-static {v12, v0, v4, v11}, Lp/a;->z(IIII)I

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    const v10, 0xf4240

    .line 195
    .line 196
    .line 197
    invoke-static {v13, v0, v10, v4}, Lp/a;->z(IIII)I

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    const v10, 0x186a0

    .line 202
    .line 203
    .line 204
    invoke-static {v14, v0, v10, v4}, Lp/a;->z(IIII)I

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    const/16 v10, 0x2710

    .line 209
    .line 210
    invoke-static {v15, v0, v10, v4}, Lp/a;->z(IIII)I

    .line 211
    .line 212
    .line 213
    move-result v4

    .line 214
    const/16 v10, 0x3e8

    .line 215
    .line 216
    invoke-static {v3, v0, v10, v4}, Lp/a;->z(IIII)I

    .line 217
    .line 218
    .line 219
    move-result v3

    .line 220
    const/16 v4, 0x64

    .line 221
    .line 222
    invoke-static {v1, v0, v4, v3}, Lp/a;->z(IIII)I

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    invoke-static {v5, v0, v7, v1}, Lp/a;->z(IIII)I

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    add-int/lit8 v0, v8, -0x30

    .line 231
    .line 232
    add-int/2addr v0, v1

    .line 233
    invoke-static {v2, v6, v9, v0}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    return-object v0

    .line 238
    :cond_1
    return-object v17
.end method

.method public static parseLocalTime18([CI)Ljava/time/LocalTime;
    .locals 20

    move-object/from16 v0, p0

    add-int/lit8 v1, p1, 0x12

    .line 239
    array-length v2, v0

    const/4 v3, 0x0

    if-le v1, v2, :cond_0

    return-object v3

    .line 240
    :cond_0
    aget-char v1, v0, p1

    add-int/lit8 v2, p1, 0x1

    .line 241
    aget-char v2, v0, v2

    add-int/lit8 v4, p1, 0x2

    .line 242
    aget-char v4, v0, v4

    add-int/lit8 v5, p1, 0x3

    .line 243
    aget-char v5, v0, v5

    add-int/lit8 v6, p1, 0x4

    .line 244
    aget-char v6, v0, v6

    add-int/lit8 v7, p1, 0x5

    .line 245
    aget-char v7, v0, v7

    add-int/lit8 v8, p1, 0x6

    .line 246
    aget-char v8, v0, v8

    add-int/lit8 v9, p1, 0x7

    .line 247
    aget-char v9, v0, v9

    add-int/lit8 v10, p1, 0x8

    .line 248
    aget-char v10, v0, v10

    add-int/lit8 v11, p1, 0x9

    .line 249
    aget-char v11, v0, v11

    add-int/lit8 v12, p1, 0xa

    .line 250
    aget-char v12, v0, v12

    add-int/lit8 v13, p1, 0xb

    .line 251
    aget-char v13, v0, v13

    add-int/lit8 v14, p1, 0xc

    .line 252
    aget-char v14, v0, v14

    add-int/lit8 v15, p1, 0xd

    .line 253
    aget-char v15, v0, v15

    add-int/lit8 v16, p1, 0xe

    move-object/from16 v17, v3

    .line 254
    aget-char v3, v0, v16

    add-int/lit8 v16, p1, 0xf

    .line 255
    aget-char v0, p0, v16

    add-int/lit8 v16, p1, 0x10

    move/from16 v18, v0

    .line 256
    aget-char v0, p0, v16

    add-int/lit8 v16, p1, 0x11

    move/from16 v19, v0

    .line 257
    aget-char v0, p0, v16

    move/from16 p0, v0

    const/16 v0, 0x3a

    if-ne v4, v0, :cond_1

    if-ne v7, v0, :cond_1

    const/16 v0, 0x2e

    if-ne v10, v0, :cond_1

    const/16 v0, 0x30

    if-lt v1, v0, :cond_1

    const/16 v4, 0x39

    if-gt v1, v4, :cond_1

    if-lt v2, v0, :cond_1

    if-gt v2, v4, :cond_1

    sub-int/2addr v1, v0

    const/16 v7, 0xa

    mul-int/2addr v1, v7

    sub-int/2addr v2, v0

    add-int/2addr v2, v1

    if-lt v5, v0, :cond_1

    if-gt v5, v4, :cond_1

    if-lt v6, v0, :cond_1

    if-gt v6, v4, :cond_1

    sub-int/2addr v5, v0

    mul-int/2addr v5, v7

    sub-int/2addr v6, v0

    add-int/2addr v6, v5

    if-lt v8, v0, :cond_1

    if-gt v8, v4, :cond_1

    if-lt v9, v0, :cond_1

    if-gt v9, v4, :cond_1

    sub-int/2addr v8, v0

    mul-int/2addr v8, v7

    sub-int/2addr v9, v0

    add-int/2addr v9, v8

    if-lt v11, v0, :cond_1

    if-gt v11, v4, :cond_1

    if-lt v12, v0, :cond_1

    if-gt v12, v4, :cond_1

    if-lt v13, v0, :cond_1

    if-gt v13, v4, :cond_1

    if-lt v14, v0, :cond_1

    if-gt v14, v4, :cond_1

    if-lt v15, v0, :cond_1

    if-gt v15, v4, :cond_1

    if-lt v3, v0, :cond_1

    if-gt v3, v4, :cond_1

    move/from16 v1, v18

    if-lt v1, v0, :cond_1

    if-gt v1, v4, :cond_1

    move/from16 v5, v19

    if-lt v5, v0, :cond_1

    if-gt v5, v4, :cond_1

    move/from16 v8, p0

    if-lt v8, v0, :cond_1

    if-gt v8, v4, :cond_1

    sub-int/2addr v11, v0

    const v4, 0x5f5e100

    mul-int/2addr v11, v4

    const v4, 0x989680

    .line 258
    invoke-static {v12, v0, v4, v11}, Lp/a;->z(IIII)I

    move-result v4

    const v10, 0xf4240

    invoke-static {v13, v0, v10, v4}, Lp/a;->z(IIII)I

    move-result v4

    const v10, 0x186a0

    invoke-static {v14, v0, v10, v4}, Lp/a;->z(IIII)I

    move-result v4

    const/16 v10, 0x2710

    invoke-static {v15, v0, v10, v4}, Lp/a;->z(IIII)I

    move-result v4

    const/16 v10, 0x3e8

    invoke-static {v3, v0, v10, v4}, Lp/a;->z(IIII)I

    move-result v3

    const/16 v4, 0x64

    invoke-static {v1, v0, v4, v3}, Lp/a;->z(IIII)I

    move-result v1

    invoke-static {v5, v0, v7, v1}, Lp/a;->z(IIII)I

    move-result v1

    add-int/lit8 v0, v8, -0x30

    add-int/2addr v0, v1

    .line 259
    invoke-static {v2, v6, v9, v0}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v17
.end method

.method public static parseLocalTime5([BI)Ljava/time/LocalTime;
    .locals 5

    .line 1
    add-int/lit8 v0, p1, 0x5

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-le v0, v1, :cond_0

    .line 6
    .line 7
    return-object v2

    .line 8
    :cond_0
    aget-byte v0, p0, p1

    .line 9
    .line 10
    add-int/lit8 v1, p1, 0x1

    .line 11
    .line 12
    aget-byte v1, p0, v1

    .line 13
    .line 14
    add-int/lit8 v3, p1, 0x2

    .line 15
    .line 16
    aget-byte v3, p0, v3

    .line 17
    .line 18
    add-int/lit8 v4, p1, 0x3

    .line 19
    .line 20
    aget-byte v4, p0, v4

    .line 21
    .line 22
    add-int/lit8 p1, p1, 0x4

    .line 23
    .line 24
    aget-byte p0, p0, p1

    .line 25
    .line 26
    const/16 p1, 0x3a

    .line 27
    .line 28
    if-ne v3, p1, :cond_1

    .line 29
    .line 30
    const/16 p1, 0x30

    .line 31
    .line 32
    if-lt v0, p1, :cond_1

    .line 33
    .line 34
    const/16 v3, 0x39

    .line 35
    .line 36
    if-gt v0, v3, :cond_1

    .line 37
    .line 38
    if-lt v1, p1, :cond_1

    .line 39
    .line 40
    if-gt v1, v3, :cond_1

    .line 41
    .line 42
    sub-int/2addr v0, p1

    .line 43
    mul-int/lit8 v0, v0, 0xa

    .line 44
    .line 45
    sub-int/2addr v1, p1

    .line 46
    add-int/2addr v1, v0

    .line 47
    if-lt v4, p1, :cond_1

    .line 48
    .line 49
    if-gt v4, v3, :cond_1

    .line 50
    .line 51
    if-lt p0, p1, :cond_1

    .line 52
    .line 53
    if-gt p0, v3, :cond_1

    .line 54
    .line 55
    sub-int/2addr v4, p1

    .line 56
    mul-int/lit8 v4, v4, 0xa

    .line 57
    .line 58
    sub-int/2addr p0, p1

    .line 59
    add-int/2addr p0, v4

    .line 60
    invoke-static {v1, p0}, Ljava/time/LocalTime;->of(II)Ljava/time/LocalTime;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_1
    return-object v2
.end method

.method public static parseLocalTime5([CI)Ljava/time/LocalTime;
    .locals 5

    add-int/lit8 v0, p1, 0x5

    .line 66
    array-length v1, p0

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    return-object v2

    .line 67
    :cond_0
    aget-char v0, p0, p1

    add-int/lit8 v1, p1, 0x1

    .line 68
    aget-char v1, p0, v1

    add-int/lit8 v3, p1, 0x2

    .line 69
    aget-char v3, p0, v3

    add-int/lit8 v4, p1, 0x3

    .line 70
    aget-char v4, p0, v4

    add-int/lit8 p1, p1, 0x4

    .line 71
    aget-char p0, p0, p1

    const/16 p1, 0x3a

    if-ne v3, p1, :cond_1

    const/16 p1, 0x30

    if-lt v0, p1, :cond_1

    const/16 v3, 0x39

    if-gt v0, v3, :cond_1

    if-lt v1, p1, :cond_1

    if-gt v1, v3, :cond_1

    sub-int/2addr v0, p1

    mul-int/lit8 v0, v0, 0xa

    sub-int/2addr v1, p1

    add-int/2addr v1, v0

    if-lt v4, p1, :cond_1

    if-gt v4, v3, :cond_1

    if-lt p0, p1, :cond_1

    if-gt p0, v3, :cond_1

    sub-int/2addr v4, p1

    mul-int/lit8 v4, v4, 0xa

    sub-int/2addr p0, p1

    add-int/2addr p0, v4

    .line 72
    invoke-static {v1, p0}, Ljava/time/LocalTime;->of(II)Ljava/time/LocalTime;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v2
.end method

.method public static parseLocalTime8([BI)Ljava/time/LocalTime;
    .locals 9

    .line 1
    add-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    if-le v0, v1, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return-object p0

    .line 8
    :cond_0
    aget-byte v0, p0, p1

    .line 9
    .line 10
    int-to-char v1, v0

    .line 11
    add-int/lit8 v0, p1, 0x1

    .line 12
    .line 13
    aget-byte v0, p0, v0

    .line 14
    .line 15
    int-to-char v2, v0

    .line 16
    add-int/lit8 v0, p1, 0x2

    .line 17
    .line 18
    aget-byte v0, p0, v0

    .line 19
    .line 20
    int-to-char v3, v0

    .line 21
    add-int/lit8 v0, p1, 0x3

    .line 22
    .line 23
    aget-byte v0, p0, v0

    .line 24
    .line 25
    int-to-char v4, v0

    .line 26
    add-int/lit8 v0, p1, 0x4

    .line 27
    .line 28
    aget-byte v0, p0, v0

    .line 29
    .line 30
    int-to-char v5, v0

    .line 31
    add-int/lit8 v0, p1, 0x5

    .line 32
    .line 33
    aget-byte v0, p0, v0

    .line 34
    .line 35
    int-to-char v6, v0

    .line 36
    add-int/lit8 v0, p1, 0x6

    .line 37
    .line 38
    aget-byte v0, p0, v0

    .line 39
    .line 40
    int-to-char v7, v0

    .line 41
    add-int/lit8 p1, p1, 0x7

    .line 42
    .line 43
    aget-byte p0, p0, p1

    .line 44
    .line 45
    int-to-char v8, p0

    .line 46
    invoke-static/range {v1 .. v8}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalTime(CCCCCCCC)Ljava/time/LocalTime;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method public static parseLocalTime8([CI)Ljava/time/LocalTime;
    .locals 8

    add-int/lit8 v0, p1, 0x8

    .line 51
    array-length v1, p0

    if-le v0, v1, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 52
    :cond_0
    aget-char v0, p0, p1

    add-int/lit8 v1, p1, 0x1

    .line 53
    aget-char v1, p0, v1

    add-int/lit8 v2, p1, 0x2

    .line 54
    aget-char v2, p0, v2

    add-int/lit8 v3, p1, 0x3

    .line 55
    aget-char v3, p0, v3

    add-int/lit8 v4, p1, 0x4

    .line 56
    aget-char v4, p0, v4

    add-int/lit8 v5, p1, 0x5

    .line 57
    aget-char v5, p0, v5

    add-int/lit8 v6, p1, 0x6

    .line 58
    aget-char v6, p0, v6

    add-int/lit8 p1, p1, 0x7

    .line 59
    aget-char v7, p0, p1

    .line 60
    invoke-static/range {v0 .. v7}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalTime(CCCCCCCC)Ljava/time/LocalTime;

    move-result-object p0

    return-object p0
.end method

.method public static parseMillis(Ljava/lang/String;)J
    .locals 2

    .line 467
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/DateUtils;->parseMillis(Ljava/lang/String;Ljava/time/ZoneId;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static parseMillis(Ljava/lang/String;Ljava/time/ZoneId;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 p0, 0x0

    return-wide p0

    .line 429
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    const/4 v0, 0x0

    .line 430
    array-length v1, p0

    invoke-static {p0, v0, v1, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseMillis([CIILjava/time/ZoneId;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static parseMillis([BII)J
    .locals 2

    .line 431
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    sget-object v1, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    invoke-static {p0, p1, p2, v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseMillis([BIILjava/nio/charset/Charset;Ljava/time/ZoneId;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static parseMillis([BIILjava/nio/charset/Charset;)J
    .locals 1

    .line 432
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    invoke-static {p0, p1, p2, p3, v0}, Lcom/alibaba/fastjson2/util/DateUtils;->parseMillis([BIILjava/nio/charset/Charset;Ljava/time/ZoneId;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static parseMillis([BIILjava/nio/charset/Charset;Ljava/time/ZoneId;)J
    .locals 20

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p4

    const-wide/16 v4, 0x0

    if-eqz v0, :cond_13

    if-nez v2, :cond_0

    goto/16 :goto_3

    :cond_0
    const/4 v6, 0x4

    if-ne v2, v6, :cond_1

    .line 433
    aget-byte v7, v0, v1

    const/16 v8, 0x6e

    if-ne v7, v8, :cond_1

    add-int/lit8 v7, v1, 0x1

    aget-byte v7, v0, v7

    const/16 v8, 0x75

    if-ne v7, v8, :cond_1

    add-int/lit8 v7, v1, 0x2

    aget-byte v7, v0, v7

    const/16 v8, 0x6c

    if-ne v7, v8, :cond_1

    add-int/lit8 v7, v1, 0x3

    aget-byte v7, v0, v7

    if-ne v7, v8, :cond_1

    return-wide v4

    .line 434
    :cond_1
    aget-byte v7, v0, v1

    int-to-char v7, v7

    const/16 v8, 0x22

    if-ne v7, v8, :cond_4

    add-int/lit8 v9, v2, -0x1

    .line 435
    aget-byte v9, v0, v9

    if-ne v9, v8, :cond_4

    .line 436
    invoke-static/range {p0 .. p3}, Lcom/alibaba/fastjson2/JSONReader;->of([BIILjava/nio/charset/Charset;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object v11

    .line 437
    :try_start_0
    sget-object v10, Lcom/alibaba/fastjson2/reader/ObjectReaderImplDate;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplDate;

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/4 v12, 0x0

    invoke-virtual/range {v10 .. v15}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplDate;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Date;

    .line 438
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v11, :cond_2

    .line 439
    invoke-virtual {v11}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    :cond_2
    return-wide v0

    :catchall_0
    move-exception v0

    move-object v1, v0

    if-eqz v11, :cond_3

    .line 440
    :try_start_1
    invoke-virtual {v11}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_0
    throw v1

    :cond_4
    const/16 v8, 0x13

    if-ne v2, v8, :cond_5

    .line 441
    invoke-static {v0, v1, v3}, Lcom/alibaba/fastjson2/util/DateUtils;->parseMillis19([BILjava/time/ZoneId;)J

    move-result-wide v0

    return-wide v0

    :cond_5
    if-gt v2, v8, :cond_11

    const/16 v8, 0x10

    const/16 v9, 0x2d

    if-ne v2, v8, :cond_6

    add-int/lit8 v8, v1, 0xa

    .line 442
    aget-byte v8, v0, v8

    int-to-char v8, v8

    const/16 v10, 0x2b

    if-eq v8, v10, :cond_11

    if-ne v8, v9, :cond_6

    goto/16 :goto_2

    :cond_6
    const/4 v8, 0x0

    const/16 v10, 0x9

    const-wide/16 v11, 0x3e8

    const/16 v13, 0x30

    if-eq v7, v9, :cond_7

    if-lt v7, v13, :cond_d

    const/16 v14, 0x39

    if-gt v7, v14, :cond_d

    .line 443
    :cond_7
    invoke-static/range {p0 .. p2}, Lcom/alibaba/fastjson2/util/IOUtils;->isNumber([BII)Z

    move-result v7

    if-eqz v7, :cond_d

    .line 444
    invoke-static/range {p0 .. p2}, Lcom/alibaba/fastjson2/util/TypeUtils;->parseLong([BII)J

    move-result-wide v0

    const/16 v4, 0x8

    if-ne v2, v4, :cond_c

    const-wide/32 v4, 0x12c9985

    cmp-long v2, v0, v4

    if-ltz v2, :cond_c

    const-wide/32 v4, 0x1406fa5

    cmp-long v2, v0, v4

    if-gtz v2, :cond_c

    long-to-int v2, v0

    .line 445
    div-int/lit16 v13, v2, 0x2710

    .line 446
    rem-int/lit16 v4, v2, 0x2710

    div-int/lit8 v14, v4, 0x64

    .line 447
    rem-int/lit8 v15, v2, 0x64

    const/4 v2, 0x1

    if-lt v14, v2, :cond_c

    const/16 v2, 0xc

    if-gt v14, v2, :cond_c

    const/4 v2, 0x2

    if-eq v14, v2, :cond_9

    if-eq v14, v6, :cond_8

    const/4 v2, 0x6

    if-eq v14, v2, :cond_8

    if-eq v14, v10, :cond_8

    const/16 v2, 0xb

    if-eq v14, v2, :cond_8

    const/16 v2, 0x1f

    goto :goto_1

    :cond_8
    const/16 v2, 0x1e

    goto :goto_1

    :cond_9
    and-int/lit8 v2, v13, 0x3

    if-nez v2, :cond_b

    .line 448
    rem-int/lit8 v2, v13, 0x64

    if-nez v2, :cond_a

    rem-int/lit16 v2, v13, 0x190

    if-nez v2, :cond_b

    :cond_a
    const/16 v2, 0x1d

    goto :goto_1

    :cond_b
    const/16 v2, 0x1c

    :goto_1
    if-gt v15, v2, :cond_c

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v16, 0x0

    .line 449
    invoke-static/range {v13 .. v18}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    move-result-object v0

    .line 450
    invoke-static {v0, v3, v8}, Ljava/time/ZonedDateTime;->ofLocal(Ljava/time/LocalDateTime;Ljava/time/ZoneId;Ljava/time/ZoneOffset;)Ljava/time/ZonedDateTime;

    move-result-object v0

    .line 451
    invoke-interface {v0}, Ljava/time/chrono/ChronoZonedDateTime;->toEpochSecond()J

    move-result-wide v0

    mul-long/2addr v0, v11

    :cond_c
    return-wide v0

    :cond_d
    add-int/lit8 v6, v2, -0x1

    .line 452
    aget-byte v6, v0, v6

    int-to-char v6, v6

    const/16 v7, 0x5a

    if-ne v6, v7, :cond_e

    .line 453
    sget-object v3, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 454
    :cond_e
    invoke-static/range {p0 .. p2}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime([BII)Ljava/time/LocalDateTime;

    move-result-object v2

    if-nez v2, :cond_f

    .line 455
    aget-byte v6, v0, v1

    if-ne v6, v13, :cond_f

    add-int/lit8 v6, v1, 0x1

    aget-byte v6, v0, v6

    if-ne v6, v13, :cond_f

    add-int/lit8 v6, v1, 0x2

    aget-byte v6, v0, v6

    if-ne v6, v13, :cond_f

    add-int/lit8 v6, v1, 0x3

    aget-byte v6, v0, v6

    if-ne v6, v13, :cond_f

    add-int/lit8 v6, v1, 0x4

    aget-byte v6, v0, v6

    if-ne v6, v9, :cond_f

    add-int/lit8 v6, v1, 0x5

    aget-byte v6, v0, v6

    if-ne v6, v13, :cond_f

    add-int/lit8 v6, v1, 0x6

    aget-byte v6, v0, v6

    if-ne v6, v13, :cond_f

    add-int/lit8 v6, v1, 0x7

    aget-byte v6, v0, v6

    if-ne v6, v9, :cond_f

    add-int/lit8 v6, v1, 0x8

    aget-byte v6, v0, v6

    if-ne v6, v13, :cond_f

    add-int/2addr v1, v10

    aget-byte v0, v0, v1

    if-ne v0, v13, :cond_f

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v14, 0x7b2

    const/4 v15, 0x1

    const/16 v16, 0x1

    const/16 v17, 0x0

    .line 456
    invoke-static/range {v14 .. v19}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    move-result-object v2

    .line 457
    :cond_f
    invoke-static {v2, v3, v8}, Ljava/time/ZonedDateTime;->ofLocal(Ljava/time/LocalDateTime;Ljava/time/ZoneId;Ljava/time/ZoneOffset;)Ljava/time/ZonedDateTime;

    move-result-object v0

    .line 458
    invoke-interface {v0}, Ljava/time/chrono/ChronoZonedDateTime;->toEpochSecond()J

    move-result-wide v0

    .line 459
    invoke-virtual {v2}, Ljava/time/LocalDateTime;->getNano()I

    move-result v2

    cmp-long v3, v0, v4

    const v4, 0xf4240

    if-gez v3, :cond_10

    if-lez v2, :cond_10

    const-wide/16 v5, 0x1

    add-long/2addr v0, v5

    mul-long/2addr v0, v11

    .line 460
    div-int/2addr v2, v4

    int-to-long v2, v2

    add-long/2addr v0, v2

    sub-long/2addr v0, v11

    return-wide v0

    :cond_10
    mul-long/2addr v0, v11

    .line 461
    div-int/2addr v2, v4

    int-to-long v2, v2

    add-long/2addr v0, v2

    return-wide v0

    .line 462
    :cond_11
    :goto_2
    invoke-static {v0, v1, v2, v3}, Lcom/alibaba/fastjson2/util/DateUtils;->parseZonedDateTime([BIILjava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object v3

    if-eqz v3, :cond_12

    .line 463
    invoke-interface {v3}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v0

    return-wide v0

    .line 464
    :cond_12
    new-instance v3, Ljava/lang/String;

    sub-int/2addr v2, v1

    invoke-direct {v3, v0, v1, v2}, Ljava/lang/String;-><init>([BII)V

    .line 465
    new-instance v0, Ljava/time/format/DateTimeParseException;

    const-string v1, "illegal input "

    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v3, v2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_13
    :goto_3
    return-wide v4
.end method

.method public static parseMillis([CII)J
    .locals 1

    .line 466
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    invoke-static {p0, p1, p2, v0}, Lcom/alibaba/fastjson2/util/DateUtils;->parseMillis([CIILjava/time/ZoneId;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static parseMillis([CIILjava/time/ZoneId;)J
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    const-wide/16 v4, 0x0

    .line 10
    .line 11
    if-eqz v0, :cond_14

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    goto/16 :goto_3

    .line 16
    .line 17
    :cond_0
    const/4 v6, 0x4

    .line 18
    if-ne v2, v6, :cond_1

    .line 19
    .line 20
    aget-char v7, v0, v1

    .line 21
    .line 22
    const/16 v8, 0x6e

    .line 23
    .line 24
    if-ne v7, v8, :cond_1

    .line 25
    .line 26
    add-int/lit8 v7, v1, 0x1

    .line 27
    .line 28
    aget-char v7, v0, v7

    .line 29
    .line 30
    const/16 v8, 0x75

    .line 31
    .line 32
    if-ne v7, v8, :cond_1

    .line 33
    .line 34
    add-int/lit8 v7, v1, 0x2

    .line 35
    .line 36
    aget-char v7, v0, v7

    .line 37
    .line 38
    const/16 v8, 0x6c

    .line 39
    .line 40
    if-ne v7, v8, :cond_1

    .line 41
    .line 42
    add-int/lit8 v7, v1, 0x3

    .line 43
    .line 44
    aget-char v7, v0, v7

    .line 45
    .line 46
    if-ne v7, v8, :cond_1

    .line 47
    .line 48
    return-wide v4

    .line 49
    :cond_1
    aget-char v7, v0, v1

    .line 50
    .line 51
    const/16 v8, 0x22

    .line 52
    .line 53
    if-ne v7, v8, :cond_4

    .line 54
    .line 55
    add-int/lit8 v9, v2, -0x1

    .line 56
    .line 57
    aget-char v9, v0, v9

    .line 58
    .line 59
    if-ne v9, v8, :cond_4

    .line 60
    .line 61
    invoke-static/range {p0 .. p2}, Lcom/alibaba/fastjson2/JSONReader;->of([CII)Lcom/alibaba/fastjson2/JSONReader;

    .line 62
    .line 63
    .line 64
    move-result-object v11

    .line 65
    :try_start_0
    sget-object v10, Lcom/alibaba/fastjson2/reader/ObjectReaderImplDate;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplDate;

    .line 66
    .line 67
    const/4 v13, 0x0

    .line 68
    const-wide/16 v14, 0x0

    .line 69
    .line 70
    const/4 v12, 0x0

    .line 71
    invoke-virtual/range {v10 .. v15}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplDate;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, Ljava/util/Date;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 78
    .line 79
    .line 80
    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    if-eqz v11, :cond_2

    .line 82
    .line 83
    invoke-virtual {v11}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    .line 84
    .line 85
    .line 86
    :cond_2
    return-wide v0

    .line 87
    :catchall_0
    move-exception v0

    .line 88
    move-object v1, v0

    .line 89
    if-eqz v11, :cond_3

    .line 90
    .line 91
    :try_start_1
    invoke-virtual {v11}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :catchall_1
    move-exception v0

    .line 96
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    :cond_3
    :goto_0
    throw v1

    .line 100
    :cond_4
    const/16 v8, 0x13

    .line 101
    .line 102
    if-ne v2, v8, :cond_5

    .line 103
    .line 104
    invoke-static {v0, v1, v3}, Lcom/alibaba/fastjson2/util/DateUtils;->parseMillis19([CILjava/time/ZoneId;)J

    .line 105
    .line 106
    .line 107
    move-result-wide v0

    .line 108
    return-wide v0

    .line 109
    :cond_5
    const/4 v9, 0x0

    .line 110
    const-string v10, "illegal input "

    .line 111
    .line 112
    if-gt v2, v8, :cond_12

    .line 113
    .line 114
    const/16 v8, 0x10

    .line 115
    .line 116
    const/16 v11, 0x2d

    .line 117
    .line 118
    if-ne v2, v8, :cond_6

    .line 119
    .line 120
    add-int/lit8 v8, v1, 0xa

    .line 121
    .line 122
    aget-char v8, v0, v8

    .line 123
    .line 124
    const/16 v12, 0x2b

    .line 125
    .line 126
    if-eq v8, v12, :cond_12

    .line 127
    .line 128
    if-ne v8, v11, :cond_6

    .line 129
    .line 130
    goto/16 :goto_2

    .line 131
    .line 132
    :cond_6
    const/4 v8, 0x0

    .line 133
    const-wide/16 v12, 0x3e8

    .line 134
    .line 135
    const/16 v14, 0x30

    .line 136
    .line 137
    if-eq v7, v11, :cond_7

    .line 138
    .line 139
    if-lt v7, v14, :cond_d

    .line 140
    .line 141
    const/16 v15, 0x39

    .line 142
    .line 143
    if-gt v7, v15, :cond_d

    .line 144
    .line 145
    :cond_7
    invoke-static/range {p0 .. p2}, Lcom/alibaba/fastjson2/util/IOUtils;->isNumber([CII)Z

    .line 146
    .line 147
    .line 148
    move-result v7

    .line 149
    if-eqz v7, :cond_d

    .line 150
    .line 151
    invoke-static/range {p0 .. p2}, Lcom/alibaba/fastjson2/util/TypeUtils;->parseLong([CII)J

    .line 152
    .line 153
    .line 154
    move-result-wide v0

    .line 155
    const/16 v4, 0x8

    .line 156
    .line 157
    if-ne v2, v4, :cond_c

    .line 158
    .line 159
    const-wide/32 v4, 0x12c9985

    .line 160
    .line 161
    .line 162
    cmp-long v2, v0, v4

    .line 163
    .line 164
    if-ltz v2, :cond_c

    .line 165
    .line 166
    const-wide/32 v4, 0x1406fa5

    .line 167
    .line 168
    .line 169
    cmp-long v2, v0, v4

    .line 170
    .line 171
    if-gtz v2, :cond_c

    .line 172
    .line 173
    long-to-int v2, v0

    .line 174
    div-int/lit16 v14, v2, 0x2710

    .line 175
    .line 176
    rem-int/lit16 v4, v2, 0x2710

    .line 177
    .line 178
    div-int/lit8 v15, v4, 0x64

    .line 179
    .line 180
    rem-int/lit8 v2, v2, 0x64

    .line 181
    .line 182
    const/4 v4, 0x1

    .line 183
    if-lt v15, v4, :cond_c

    .line 184
    .line 185
    const/16 v4, 0xc

    .line 186
    .line 187
    if-gt v15, v4, :cond_c

    .line 188
    .line 189
    const/4 v4, 0x2

    .line 190
    if-eq v15, v4, :cond_9

    .line 191
    .line 192
    if-eq v15, v6, :cond_8

    .line 193
    .line 194
    const/4 v4, 0x6

    .line 195
    if-eq v15, v4, :cond_8

    .line 196
    .line 197
    const/16 v4, 0x9

    .line 198
    .line 199
    if-eq v15, v4, :cond_8

    .line 200
    .line 201
    const/16 v4, 0xb

    .line 202
    .line 203
    if-eq v15, v4, :cond_8

    .line 204
    .line 205
    const/16 v4, 0x1f

    .line 206
    .line 207
    goto :goto_1

    .line 208
    :cond_8
    const/16 v4, 0x1e

    .line 209
    .line 210
    goto :goto_1

    .line 211
    :cond_9
    and-int/lit8 v4, v14, 0x3

    .line 212
    .line 213
    if-nez v4, :cond_b

    .line 214
    .line 215
    rem-int/lit8 v4, v14, 0x64

    .line 216
    .line 217
    if-nez v4, :cond_a

    .line 218
    .line 219
    rem-int/lit16 v4, v14, 0x190

    .line 220
    .line 221
    if-nez v4, :cond_b

    .line 222
    .line 223
    :cond_a
    const/16 v4, 0x1d

    .line 224
    .line 225
    goto :goto_1

    .line 226
    :cond_b
    const/16 v4, 0x1c

    .line 227
    .line 228
    :goto_1
    if-gt v2, v4, :cond_c

    .line 229
    .line 230
    const/16 v18, 0x0

    .line 231
    .line 232
    const/16 v19, 0x0

    .line 233
    .line 234
    const/16 v17, 0x0

    .line 235
    .line 236
    move/from16 v16, v2

    .line 237
    .line 238
    invoke-static/range {v14 .. v19}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-static {v0, v3, v8}, Ljava/time/ZonedDateTime;->ofLocal(Ljava/time/LocalDateTime;Ljava/time/ZoneId;Ljava/time/ZoneOffset;)Ljava/time/ZonedDateTime;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-interface {v0}, Ljava/time/chrono/ChronoZonedDateTime;->toEpochSecond()J

    .line 247
    .line 248
    .line 249
    move-result-wide v0

    .line 250
    mul-long/2addr v0, v12

    .line 251
    :cond_c
    return-wide v0

    .line 252
    :cond_d
    add-int/lit8 v6, v2, -0x1

    .line 253
    .line 254
    aget-char v6, v0, v6

    .line 255
    .line 256
    const/16 v7, 0x5a

    .line 257
    .line 258
    if-ne v6, v7, :cond_e

    .line 259
    .line 260
    add-int/lit8 v2, v2, -0x1

    .line 261
    .line 262
    sget-object v3, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 263
    .line 264
    :cond_e
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalDateTime([CII)Ljava/time/LocalDateTime;

    .line 265
    .line 266
    .line 267
    move-result-object v6

    .line 268
    if-nez v6, :cond_f

    .line 269
    .line 270
    aget-char v7, v0, v1

    .line 271
    .line 272
    if-ne v7, v14, :cond_f

    .line 273
    .line 274
    add-int/lit8 v7, v1, 0x1

    .line 275
    .line 276
    aget-char v7, v0, v7

    .line 277
    .line 278
    if-ne v7, v14, :cond_f

    .line 279
    .line 280
    add-int/lit8 v7, v1, 0x2

    .line 281
    .line 282
    aget-char v7, v0, v7

    .line 283
    .line 284
    if-ne v7, v14, :cond_f

    .line 285
    .line 286
    add-int/lit8 v7, v1, 0x3

    .line 287
    .line 288
    aget-char v7, v0, v7

    .line 289
    .line 290
    if-ne v7, v14, :cond_f

    .line 291
    .line 292
    add-int/lit8 v7, v1, 0x4

    .line 293
    .line 294
    aget-char v7, v0, v7

    .line 295
    .line 296
    if-ne v7, v11, :cond_f

    .line 297
    .line 298
    add-int/lit8 v7, v1, 0x5

    .line 299
    .line 300
    aget-char v7, v0, v7

    .line 301
    .line 302
    if-ne v7, v14, :cond_f

    .line 303
    .line 304
    add-int/lit8 v7, v1, 0x6

    .line 305
    .line 306
    aget-char v7, v0, v7

    .line 307
    .line 308
    if-ne v7, v14, :cond_f

    .line 309
    .line 310
    add-int/lit8 v7, v1, 0x7

    .line 311
    .line 312
    aget-char v7, v0, v7

    .line 313
    .line 314
    if-ne v7, v11, :cond_f

    .line 315
    .line 316
    add-int/lit8 v7, v1, 0x8

    .line 317
    .line 318
    aget-char v7, v0, v7

    .line 319
    .line 320
    if-ne v7, v14, :cond_f

    .line 321
    .line 322
    add-int/lit8 v7, v1, 0x9

    .line 323
    .line 324
    aget-char v7, v0, v7

    .line 325
    .line 326
    if-ne v7, v14, :cond_f

    .line 327
    .line 328
    const/16 v19, 0x0

    .line 329
    .line 330
    const/16 v20, 0x0

    .line 331
    .line 332
    const/16 v15, 0x7b2

    .line 333
    .line 334
    const/16 v16, 0x1

    .line 335
    .line 336
    const/16 v17, 0x1

    .line 337
    .line 338
    const/16 v18, 0x0

    .line 339
    .line 340
    invoke-static/range {v15 .. v20}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    .line 341
    .line 342
    .line 343
    move-result-object v6

    .line 344
    :cond_f
    if-eqz v6, :cond_11

    .line 345
    .line 346
    invoke-static {v6, v3, v8}, Ljava/time/ZonedDateTime;->ofLocal(Ljava/time/LocalDateTime;Ljava/time/ZoneId;Ljava/time/ZoneOffset;)Ljava/time/ZonedDateTime;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-interface {v0}, Ljava/time/chrono/ChronoZonedDateTime;->toEpochSecond()J

    .line 351
    .line 352
    .line 353
    move-result-wide v0

    .line 354
    invoke-virtual {v6}, Ljava/time/LocalDateTime;->getNano()I

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    cmp-long v3, v0, v4

    .line 359
    .line 360
    const v4, 0xf4240

    .line 361
    .line 362
    .line 363
    if-gez v3, :cond_10

    .line 364
    .line 365
    if-lez v2, :cond_10

    .line 366
    .line 367
    const-wide/16 v5, 0x1

    .line 368
    .line 369
    add-long/2addr v0, v5

    .line 370
    mul-long/2addr v0, v12

    .line 371
    div-int/2addr v2, v4

    .line 372
    int-to-long v2, v2

    .line 373
    add-long/2addr v0, v2

    .line 374
    sub-long/2addr v0, v12

    .line 375
    return-wide v0

    .line 376
    :cond_10
    mul-long/2addr v0, v12

    .line 377
    div-int/2addr v2, v4

    .line 378
    int-to-long v2, v2

    .line 379
    add-long/2addr v0, v2

    .line 380
    return-wide v0

    .line 381
    :cond_11
    new-instance v3, Ljava/lang/String;

    .line 382
    .line 383
    sub-int/2addr v2, v1

    .line 384
    invoke-direct {v3, v0, v1, v2}, Ljava/lang/String;-><init>([CII)V

    .line 385
    .line 386
    .line 387
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 388
    .line 389
    invoke-virtual {v10, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    invoke-direct {v0, v1, v3, v9}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 394
    .line 395
    .line 396
    throw v0

    .line 397
    :cond_12
    :goto_2
    invoke-static/range {p0 .. p3}, Lcom/alibaba/fastjson2/util/DateUtils;->parseZonedDateTime([CIILjava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 398
    .line 399
    .line 400
    move-result-object v3

    .line 401
    if-eqz v3, :cond_13

    .line 402
    .line 403
    invoke-interface {v3}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    invoke-virtual {v0}, Ljava/time/Instant;->toEpochMilli()J

    .line 408
    .line 409
    .line 410
    move-result-wide v0

    .line 411
    return-wide v0

    .line 412
    :cond_13
    new-instance v3, Ljava/lang/String;

    .line 413
    .line 414
    sub-int/2addr v2, v1

    .line 415
    invoke-direct {v3, v0, v1, v2}, Ljava/lang/String;-><init>([CII)V

    .line 416
    .line 417
    .line 418
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 419
    .line 420
    invoke-virtual {v10, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    invoke-direct {v0, v1, v3, v9}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 425
    .line 426
    .line 427
    throw v0

    .line 428
    :cond_14
    :goto_3
    return-wide v4
.end method

.method public static parseMillis10(Ljava/lang/String;Ljava/time/ZoneId;Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)J
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    if-eqz v0, :cond_1b

    .line 6
    .line 7
    const-string v2, "null"

    .line 8
    .line 9
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    goto/16 :goto_9

    .line 16
    .line 17
    :cond_0
    move-object/from16 v2, p2

    .line 18
    .line 19
    iget v3, v2, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->length:I

    .line 20
    .line 21
    const/16 v4, 0xa

    .line 22
    .line 23
    if-ne v3, v4, :cond_1a

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/4 v5, 0x0

    .line 30
    if-ne v3, v4, :cond_19

    .line 31
    .line 32
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    const/4 v6, 0x1

    .line 37
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    const/4 v8, 0x2

    .line 42
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 43
    .line 44
    .line 45
    move-result v9

    .line 46
    const/4 v10, 0x3

    .line 47
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    .line 48
    .line 49
    .line 50
    move-result v10

    .line 51
    const/4 v11, 0x4

    .line 52
    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    .line 53
    .line 54
    .line 55
    move-result v12

    .line 56
    const/4 v13, 0x5

    .line 57
    invoke-virtual {v0, v13}, Ljava/lang/String;->charAt(I)C

    .line 58
    .line 59
    .line 60
    move-result v14

    .line 61
    const/4 v15, 0x6

    .line 62
    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    const/4 v11, 0x7

    .line 67
    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    .line 68
    .line 69
    .line 70
    move-result v11

    .line 71
    const/16 v8, 0x8

    .line 72
    .line 73
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    const/16 v4, 0x9

    .line 78
    .line 79
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    sget-object v19, Lcom/alibaba/fastjson2/util/DateUtils$1;->$SwitchMap$com$alibaba$fastjson2$util$DateUtils$DateTimeFormatPattern:[I

    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    aget v2, v19, v2

    .line 90
    .line 91
    const-string v4, "illegal input"

    .line 92
    .line 93
    if-eq v2, v13, :cond_3

    .line 94
    .line 95
    if-ne v2, v15, :cond_2

    .line 96
    .line 97
    const/16 v2, 0x2f

    .line 98
    .line 99
    if-ne v12, v2, :cond_1

    .line 100
    .line 101
    if-ne v11, v2, :cond_1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_1
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 105
    .line 106
    const/4 v2, 0x0

    .line 107
    invoke-direct {v1, v4, v0, v2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 108
    .line 109
    .line 110
    throw v1

    .line 111
    :cond_2
    const/4 v2, 0x0

    .line 112
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 113
    .line 114
    invoke-direct {v1, v4, v0, v2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 115
    .line 116
    .line 117
    throw v1

    .line 118
    :cond_3
    const/16 v2, 0x2d

    .line 119
    .line 120
    if-ne v12, v2, :cond_18

    .line 121
    .line 122
    if-ne v11, v2, :cond_18

    .line 123
    .line 124
    :goto_0
    const/16 v2, 0x30

    .line 125
    .line 126
    if-lt v3, v2, :cond_17

    .line 127
    .line 128
    const/16 v11, 0x39

    .line 129
    .line 130
    if-gt v3, v11, :cond_17

    .line 131
    .line 132
    if-lt v7, v2, :cond_17

    .line 133
    .line 134
    if-gt v7, v11, :cond_17

    .line 135
    .line 136
    if-lt v9, v2, :cond_17

    .line 137
    .line 138
    if-gt v9, v11, :cond_17

    .line 139
    .line 140
    if-lt v10, v2, :cond_17

    .line 141
    .line 142
    if-gt v10, v11, :cond_17

    .line 143
    .line 144
    sub-int/2addr v3, v2

    .line 145
    mul-int/lit16 v3, v3, 0x3e8

    .line 146
    .line 147
    const/16 v12, 0x64

    .line 148
    .line 149
    invoke-static {v7, v2, v12, v3}, Lp/a;->z(IIII)I

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    const/16 v7, 0xa

    .line 154
    .line 155
    invoke-static {v9, v2, v7, v3}, Lp/a;->z(IIII)I

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    sub-int/2addr v10, v2

    .line 160
    add-int/2addr v10, v3

    .line 161
    if-lt v14, v2, :cond_16

    .line 162
    .line 163
    if-gt v14, v11, :cond_16

    .line 164
    .line 165
    if-lt v6, v2, :cond_16

    .line 166
    .line 167
    if-gt v6, v11, :cond_16

    .line 168
    .line 169
    sub-int/2addr v14, v2

    .line 170
    mul-int/2addr v14, v7

    .line 171
    sub-int/2addr v6, v2

    .line 172
    add-int/2addr v6, v14

    .line 173
    if-nez v6, :cond_5

    .line 174
    .line 175
    if-nez v10, :cond_4

    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_4
    const/4 v2, 0x0

    .line 179
    goto/16 :goto_8

    .line 180
    .line 181
    :cond_5
    :goto_1
    const/16 v3, 0xc

    .line 182
    .line 183
    if-gt v6, v3, :cond_4

    .line 184
    .line 185
    if-lt v8, v2, :cond_15

    .line 186
    .line 187
    if-gt v8, v11, :cond_15

    .line 188
    .line 189
    if-lt v5, v2, :cond_15

    .line 190
    .line 191
    if-gt v5, v11, :cond_15

    .line 192
    .line 193
    sub-int/2addr v8, v2

    .line 194
    const/16 v18, 0xa

    .line 195
    .line 196
    mul-int/lit8 v8, v8, 0xa

    .line 197
    .line 198
    sub-int/2addr v5, v2

    .line 199
    add-int/2addr v5, v8

    .line 200
    const/4 v2, 0x2

    .line 201
    if-eq v6, v2, :cond_7

    .line 202
    .line 203
    const/4 v2, 0x4

    .line 204
    if-eq v6, v2, :cond_6

    .line 205
    .line 206
    if-eq v6, v15, :cond_6

    .line 207
    .line 208
    const/16 v2, 0x9

    .line 209
    .line 210
    if-eq v6, v2, :cond_6

    .line 211
    .line 212
    const/16 v2, 0xb

    .line 213
    .line 214
    if-eq v6, v2, :cond_6

    .line 215
    .line 216
    const/16 v2, 0x1f

    .line 217
    .line 218
    goto :goto_2

    .line 219
    :cond_6
    const/16 v2, 0x1e

    .line 220
    .line 221
    goto :goto_2

    .line 222
    :cond_7
    and-int/lit8 v2, v10, 0x3

    .line 223
    .line 224
    if-nez v2, :cond_9

    .line 225
    .line 226
    rem-int/lit8 v2, v10, 0x64

    .line 227
    .line 228
    if-nez v2, :cond_8

    .line 229
    .line 230
    rem-int/lit16 v2, v10, 0x190

    .line 231
    .line 232
    if-nez v2, :cond_9

    .line 233
    .line 234
    :cond_8
    const/16 v2, 0x1d

    .line 235
    .line 236
    goto :goto_2

    .line 237
    :cond_9
    const/16 v2, 0x1c

    .line 238
    .line 239
    :goto_2
    if-nez v5, :cond_a

    .line 240
    .line 241
    if-nez v10, :cond_14

    .line 242
    .line 243
    :cond_a
    if-gt v5, v2, :cond_14

    .line 244
    .line 245
    if-nez v10, :cond_b

    .line 246
    .line 247
    if-nez v6, :cond_b

    .line 248
    .line 249
    if-nez v5, :cond_b

    .line 250
    .line 251
    const/16 v10, 0x7b2

    .line 252
    .line 253
    const/4 v5, 0x1

    .line 254
    const/4 v6, 0x1

    .line 255
    :cond_b
    mul-int/lit16 v0, v10, 0x16d

    .line 256
    .line 257
    add-int/lit8 v2, v10, 0x3

    .line 258
    .line 259
    const/16 v17, 0x4

    .line 260
    .line 261
    div-int/lit8 v2, v2, 0x4

    .line 262
    .line 263
    add-int/lit8 v4, v10, 0x63

    .line 264
    .line 265
    div-int/2addr v4, v12

    .line 266
    sub-int/2addr v2, v4

    .line 267
    add-int/lit16 v4, v10, 0x18f

    .line 268
    .line 269
    div-int/lit16 v4, v4, 0x190

    .line 270
    .line 271
    add-int/2addr v4, v2

    .line 272
    add-int/2addr v4, v0

    .line 273
    mul-int/lit16 v0, v6, 0x16f

    .line 274
    .line 275
    add-int/lit16 v0, v0, -0x16a

    .line 276
    .line 277
    div-int/2addr v0, v3

    .line 278
    add-int/2addr v0, v4

    .line 279
    add-int/lit8 v2, v5, -0x1

    .line 280
    .line 281
    add-int/2addr v2, v0

    .line 282
    int-to-long v2, v2

    .line 283
    const/4 v0, 0x2

    .line 284
    if-le v6, v0, :cond_e

    .line 285
    .line 286
    const-wide/16 v7, 0x1

    .line 287
    .line 288
    sub-long v7, v2, v7

    .line 289
    .line 290
    and-int/lit8 v0, v10, 0x3

    .line 291
    .line 292
    if-nez v0, :cond_d

    .line 293
    .line 294
    rem-int/lit8 v0, v10, 0x64

    .line 295
    .line 296
    if-nez v0, :cond_c

    .line 297
    .line 298
    rem-int/lit16 v0, v10, 0x190

    .line 299
    .line 300
    if-nez v0, :cond_d

    .line 301
    .line 302
    :cond_c
    move-wide v2, v7

    .line 303
    goto :goto_3

    .line 304
    :cond_d
    const-wide/16 v7, 0x2

    .line 305
    .line 306
    sub-long/2addr v2, v7

    .line 307
    :cond_e
    :goto_3
    const-wide/32 v7, 0xafaa8

    .line 308
    .line 309
    .line 310
    sub-long/2addr v2, v7

    .line 311
    const-wide/32 v7, 0x15180

    .line 312
    .line 313
    .line 314
    mul-long/2addr v2, v7

    .line 315
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_ID:Ljava/time/ZoneId;

    .line 316
    .line 317
    if-eq v1, v0, :cond_10

    .line 318
    .line 319
    invoke-virtual {v1}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    sget-object v4, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_RULES:Ljava/time/zone/ZoneRules;

    .line 324
    .line 325
    if-ne v0, v4, :cond_f

    .line 326
    .line 327
    goto :goto_4

    .line 328
    :cond_f
    const/16 v16, 0x0

    .line 329
    .line 330
    goto :goto_5

    .line 331
    :cond_10
    :goto_4
    const/16 v16, 0x1

    .line 332
    .line 333
    :goto_5
    if-eqz v16, :cond_11

    .line 334
    .line 335
    const-wide/32 v7, 0x28d2bea0

    .line 336
    .line 337
    .line 338
    cmp-long v0, v2, v7

    .line 339
    .line 340
    if-ltz v0, :cond_11

    .line 341
    .line 342
    const/16 v5, 0x7080

    .line 343
    .line 344
    goto :goto_7

    .line 345
    :cond_11
    sget-object v0, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 346
    .line 347
    if-eq v1, v0, :cond_13

    .line 348
    .line 349
    const-string v0, "UTC"

    .line 350
    .line 351
    invoke-virtual {v1}, Ljava/time/ZoneId;->getId()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v4

    .line 355
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v0

    .line 359
    if-eqz v0, :cond_12

    .line 360
    .line 361
    goto :goto_6

    .line 362
    :cond_12
    invoke-static {v10, v6, v5}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    sget-object v4, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 367
    .line 368
    invoke-static {v0, v4}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    invoke-virtual {v1}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    invoke-virtual {v1, v0}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/LocalDateTime;)Ljava/time/ZoneOffset;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 381
    .line 382
    .line 383
    move-result v5

    .line 384
    goto :goto_7

    .line 385
    :cond_13
    :goto_6
    const/4 v5, 0x0

    .line 386
    :goto_7
    int-to-long v0, v5

    .line 387
    sub-long/2addr v2, v0

    .line 388
    const-wide/16 v0, 0x3e8

    .line 389
    .line 390
    mul-long/2addr v2, v0

    .line 391
    return-wide v2

    .line 392
    :cond_14
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 393
    .line 394
    const/4 v2, 0x0

    .line 395
    invoke-direct {v1, v4, v0, v2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 396
    .line 397
    .line 398
    throw v1

    .line 399
    :cond_15
    const/4 v2, 0x0

    .line 400
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 401
    .line 402
    invoke-direct {v1, v4, v0, v2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 403
    .line 404
    .line 405
    throw v1

    .line 406
    :goto_8
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 407
    .line 408
    invoke-direct {v1, v4, v0, v2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 409
    .line 410
    .line 411
    throw v1

    .line 412
    :cond_16
    const/4 v2, 0x0

    .line 413
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 414
    .line 415
    invoke-direct {v1, v4, v0, v2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 416
    .line 417
    .line 418
    throw v1

    .line 419
    :cond_17
    const/4 v2, 0x0

    .line 420
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 421
    .line 422
    invoke-direct {v1, v4, v0, v2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 423
    .line 424
    .line 425
    throw v1

    .line 426
    :cond_18
    const/4 v2, 0x0

    .line 427
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 428
    .line 429
    invoke-direct {v1, v4, v0, v2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 430
    .line 431
    .line 432
    throw v1

    .line 433
    :cond_19
    move v2, v5

    .line 434
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 435
    .line 436
    const-string v3, "illegal input "

    .line 437
    .line 438
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v3

    .line 442
    invoke-direct {v1, v3, v0, v2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 443
    .line 444
    .line 445
    throw v1

    .line 446
    :cond_1a
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 447
    .line 448
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 449
    .line 450
    .line 451
    throw v0

    .line 452
    :cond_1b
    :goto_9
    const-wide/16 v0, 0x0

    .line 453
    .line 454
    return-wide v0
.end method

.method public static parseMillis19(Ljava/lang/String;Ljava/time/ZoneId;)J
    .locals 27

    move-object/from16 v0, p0

    .line 1053
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1054
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x13

    const-string v3, "illegal input "

    const/4 v4, 0x0

    if-ne v1, v2, :cond_2c

    .line 1055
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/4 v2, 0x1

    .line 1056
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/4 v6, 0x2

    .line 1057
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/4 v8, 0x3

    .line 1058
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    const/4 v9, 0x4

    .line 1059
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v10

    const/4 v11, 0x5

    .line 1060
    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    const/4 v12, 0x6

    .line 1061
    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    move-result v13

    const/4 v14, 0x7

    .line 1062
    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    const/16 v15, 0x8

    .line 1063
    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    const/16 v2, 0x9

    .line 1064
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v17

    const/16 v2, 0xa

    .line 1065
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v12

    const/16 v9, 0xb

    .line 1066
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v9, 0xc

    .line 1067
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v19

    const/16 v9, 0xd

    .line 1068
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    move/from16 v21, v2

    const/16 v2, 0xe

    .line 1069
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v4, 0xf

    .line 1070
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    move/from16 v22, v1

    const/16 v1, 0x10

    .line 1071
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    move/from16 v23, v4

    const/16 v4, 0x11

    .line 1072
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    move/from16 v24, v15

    const/16 v15, 0x12

    .line 1073
    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    move/from16 v25, v15

    const/16 v15, 0x2d

    const/16 v26, 0x30

    if-ne v10, v15, :cond_1

    if-ne v14, v15, :cond_1

    const/16 v15, 0x20

    if-eq v12, v15, :cond_0

    const/16 v15, 0x54

    if-ne v12, v15, :cond_1

    :cond_0
    const/16 v15, 0x3a

    if-ne v9, v15, :cond_1

    if-ne v1, v15, :cond_1

    goto :goto_1

    :cond_1
    const/16 v15, 0x2f

    if-ne v10, v15, :cond_4

    if-ne v14, v15, :cond_4

    const/16 v15, 0x20

    if-eq v12, v15, :cond_2

    const/16 v15, 0x54

    if-ne v12, v15, :cond_3

    :cond_2
    const/16 v15, 0x3a

    goto :goto_0

    :cond_3
    const/16 v15, 0x2f

    goto :goto_2

    :goto_0
    if-ne v9, v15, :cond_3

    if-ne v1, v15, :cond_3

    :goto_1
    move v14, v5

    move v9, v7

    move v12, v8

    move v10, v13

    move/from16 v5, v17

    move/from16 v13, v19

    move/from16 v1, v22

    move/from16 v15, v26

    move v7, v4

    move v8, v6

    move/from16 v6, v23

    move v4, v2

    move/from16 v2, v24

    goto/16 :goto_4

    :cond_4
    :goto_2
    if-ne v7, v15, :cond_5

    if-ne v11, v15, :cond_5

    const/16 v15, 0x20

    if-ne v12, v15, :cond_5

    const/16 v15, 0x3a

    if-ne v9, v15, :cond_5

    if-ne v1, v15, :cond_5

    goto :goto_3

    :cond_5
    const/16 v15, 0x2e

    if-ne v7, v15, :cond_6

    if-ne v11, v15, :cond_6

    const/16 v15, 0x20

    if-ne v12, v15, :cond_7

    const/16 v15, 0x3a

    if-ne v9, v15, :cond_6

    if-ne v1, v15, :cond_6

    :goto_3
    move v7, v4

    move v11, v8

    move v1, v13

    move/from16 v12, v17

    move/from16 v13, v19

    move/from16 v9, v24

    move/from16 v15, v26

    move v4, v2

    move v8, v6

    move/from16 v2, v22

    move/from16 v6, v23

    goto/16 :goto_4

    :cond_6
    const/16 v15, 0x20

    :cond_7
    if-ne v5, v15, :cond_a

    if-ne v11, v15, :cond_a

    if-ne v12, v15, :cond_a

    const/16 v15, 0x3a

    if-ne v9, v15, :cond_9

    if-ne v1, v15, :cond_9

    .line 1074
    invoke-static {v7, v8, v10}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v1

    if-lez v1, :cond_8

    .line 1075
    div-int/lit8 v5, v1, 0xa

    add-int/lit8 v5, v5, 0x30

    int-to-char v8, v5

    .line 1076
    rem-int/lit8 v1, v1, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v10, v1

    move v7, v4

    move v11, v8

    move v1, v13

    move/from16 v12, v17

    move/from16 v13, v19

    move/from16 v5, v22

    move/from16 v9, v24

    move/from16 v15, v26

    move v4, v2

    move v8, v6

    move/from16 v6, v23

    move v2, v15

    goto/16 :goto_4

    .line 1077
    :cond_8
    new-instance v1, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v0, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :cond_9
    const/16 v15, 0x20

    :cond_a
    if-ne v7, v15, :cond_d

    if-ne v13, v15, :cond_d

    if-ne v6, v15, :cond_d

    const/16 v15, 0x3a

    if-ne v9, v15, :cond_c

    if-ne v1, v15, :cond_c

    .line 1078
    invoke-static {v8, v10, v11}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v1

    if-lez v1, :cond_b

    .line 1079
    div-int/lit8 v6, v1, 0xa

    add-int/lit8 v6, v6, 0x30

    int-to-char v8, v6

    .line 1080
    rem-int/lit8 v1, v1, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v10, v1

    move v7, v4

    move v11, v8

    move v1, v14

    move/from16 v9, v17

    move/from16 v13, v19

    move/from16 v6, v23

    move/from16 v14, v24

    move/from16 v8, v26

    move v15, v8

    move v4, v2

    move/from16 v2, v22

    goto/16 :goto_4

    .line 1081
    :cond_b
    new-instance v1, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v0, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :cond_c
    const/16 v15, 0x20

    :cond_d
    if-ne v7, v15, :cond_10

    if-ne v13, v15, :cond_10

    if-ne v6, v15, :cond_10

    const/16 v15, 0x3a

    if-ne v2, v15, :cond_f

    if-ne v1, v15, :cond_f

    .line 1082
    invoke-static {v8, v10, v11}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v1

    if-lez v1, :cond_e

    .line 1083
    div-int/lit8 v2, v1, 0xa

    add-int/lit8 v2, v2, 0x30

    int-to-char v8, v2

    .line 1084
    rem-int/lit8 v1, v1, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v10, v1

    move v7, v4

    move v11, v8

    move v13, v9

    move v1, v14

    move/from16 v9, v17

    move/from16 v8, v19

    move/from16 v2, v22

    move/from16 v6, v23

    move/from16 v14, v24

    move/from16 v4, v26

    move v15, v4

    goto :goto_4

    .line 1085
    :cond_e
    new-instance v1, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v0, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :cond_f
    const/16 v15, 0x20

    :cond_10
    if-ne v7, v15, :cond_2b

    if-ne v13, v15, :cond_2b

    if-ne v6, v15, :cond_2b

    const/16 v15, 0x3a

    if-ne v2, v15, :cond_2b

    if-ne v4, v15, :cond_2b

    .line 1086
    invoke-static {v8, v10, v11}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v2

    if-lez v2, :cond_2a

    .line 1087
    div-int/lit8 v4, v2, 0xa

    add-int/lit8 v4, v4, 0x30

    int-to-char v8, v4

    .line 1088
    rem-int/lit8 v2, v2, 0xa

    add-int/lit8 v2, v2, 0x30

    int-to-char v10, v2

    move v6, v1

    move v11, v8

    move v13, v9

    move v1, v14

    move/from16 v9, v17

    move/from16 v8, v19

    move/from16 v2, v22

    move/from16 v4, v23

    move/from16 v14, v24

    move/from16 v7, v26

    move v15, v7

    :goto_4
    if-lt v1, v15, :cond_29

    const/16 v0, 0x39

    if-gt v1, v0, :cond_28

    if-lt v14, v15, :cond_28

    if-gt v14, v0, :cond_28

    if-lt v9, v15, :cond_28

    if-gt v9, v0, :cond_28

    if-lt v12, v15, :cond_28

    if-gt v12, v0, :cond_28

    sub-int/2addr v1, v15

    mul-int/lit16 v1, v1, 0x3e8

    const/16 v0, 0x64

    .line 1089
    invoke-static {v14, v15, v0, v1}, Lp/a;->z(IIII)I

    move-result v1

    move/from16 v14, v21

    invoke-static {v9, v15, v14, v1}, Lp/a;->z(IIII)I

    move-result v1

    sub-int/2addr v12, v15

    add-int/2addr v12, v1

    if-lt v11, v15, :cond_27

    const/16 v1, 0x39

    if-gt v11, v1, :cond_27

    if-lt v10, v15, :cond_27

    if-gt v10, v1, :cond_27

    sub-int/2addr v11, v15

    mul-int/2addr v11, v14

    sub-int/2addr v10, v15

    add-int/2addr v10, v11

    if-nez v10, :cond_11

    if-nez v12, :cond_12

    :cond_11
    const/16 v1, 0xc

    goto :goto_5

    :cond_12
    const/4 v4, 0x0

    move-object/from16 v1, p0

    goto/16 :goto_f

    :goto_5
    if-gt v10, v1, :cond_12

    if-lt v2, v15, :cond_26

    const/16 v1, 0x39

    if-gt v2, v1, :cond_26

    if-lt v5, v15, :cond_26

    if-gt v5, v1, :cond_26

    sub-int/2addr v2, v15

    const/16 v21, 0xa

    mul-int/lit8 v2, v2, 0xa

    sub-int/2addr v5, v15

    add-int/2addr v5, v2

    const/4 v1, 0x2

    if-eq v10, v1, :cond_14

    const/4 v1, 0x4

    if-eq v10, v1, :cond_13

    const/4 v1, 0x6

    if-eq v10, v1, :cond_13

    const/16 v1, 0x9

    if-eq v10, v1, :cond_13

    const/16 v1, 0xb

    if-eq v10, v1, :cond_13

    const/16 v1, 0x1f

    goto :goto_6

    :cond_13
    const/16 v1, 0x1e

    goto :goto_6

    :cond_14
    and-int/lit8 v1, v12, 0x3

    if-nez v1, :cond_16

    .line 1090
    rem-int/lit8 v1, v12, 0x64

    if-nez v1, :cond_15

    rem-int/lit16 v1, v12, 0x190

    if-nez v1, :cond_16

    :cond_15
    const/16 v1, 0x1d

    goto :goto_6

    :cond_16
    const/16 v1, 0x1c

    :goto_6
    if-nez v5, :cond_18

    if-nez v12, :cond_17

    goto :goto_7

    :cond_17
    const/4 v4, 0x0

    move-object/from16 v1, p0

    goto/16 :goto_e

    :cond_18
    :goto_7
    if-gt v5, v1, :cond_17

    const/16 v15, 0x30

    if-lt v8, v15, :cond_25

    const/16 v1, 0x39

    if-gt v8, v1, :cond_25

    if-lt v13, v15, :cond_25

    if-gt v13, v1, :cond_25

    sub-int/2addr v8, v15

    const/16 v21, 0xa

    mul-int/lit8 v8, v8, 0xa

    sub-int/2addr v13, v15

    add-int/2addr v13, v8

    if-lt v4, v15, :cond_24

    if-gt v4, v1, :cond_24

    if-lt v6, v15, :cond_24

    if-gt v6, v1, :cond_24

    sub-int/2addr v4, v15

    mul-int/lit8 v4, v4, 0xa

    sub-int/2addr v6, v15

    add-int/2addr v6, v4

    if-lt v7, v15, :cond_23

    if-gt v7, v1, :cond_23

    move/from16 v2, v25

    if-lt v2, v15, :cond_23

    if-gt v2, v1, :cond_23

    sub-int/2addr v7, v15

    mul-int/lit8 v7, v7, 0xa

    add-int/lit8 v15, v2, -0x30

    add-int/2addr v15, v7

    if-nez v12, :cond_19

    if-nez v10, :cond_19

    if-nez v5, :cond_19

    const/16 v12, 0x7b2

    const/4 v5, 0x1

    const/4 v10, 0x1

    :cond_19
    mul-int/lit16 v1, v12, 0x16d

    add-int/lit8 v2, v12, 0x3

    const/16 v18, 0x4

    .line 1091
    div-int/lit8 v2, v2, 0x4

    add-int/lit8 v3, v12, 0x63

    div-int/2addr v3, v0

    sub-int/2addr v2, v3

    add-int/lit16 v0, v12, 0x18f

    div-int/lit16 v0, v0, 0x190

    add-int/2addr v0, v2

    add-int/2addr v0, v1

    mul-int/lit16 v1, v10, 0x16f

    add-int/lit16 v1, v1, -0x16a

    const/16 v20, 0xc

    div-int/lit8 v1, v1, 0xc

    add-int/2addr v1, v0

    add-int/lit8 v0, v5, -0x1

    add-int/2addr v0, v1

    int-to-long v0, v0

    const/4 v2, 0x2

    if-le v10, v2, :cond_1c

    const-wide/16 v2, 0x1

    sub-long v2, v0, v2

    and-int/lit8 v4, v12, 0x3

    if-nez v4, :cond_1b

    .line 1092
    rem-int/lit8 v4, v12, 0x64

    if-nez v4, :cond_1a

    rem-int/lit16 v4, v12, 0x190

    if-nez v4, :cond_1b

    :cond_1a
    move-wide v0, v2

    goto :goto_8

    :cond_1b
    const-wide/16 v2, 0x2

    sub-long/2addr v0, v2

    :cond_1c
    :goto_8
    const-wide/32 v2, 0xafaa8

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x15180

    mul-long/2addr v0, v2

    mul-int/lit16 v2, v13, 0xe10

    int-to-long v2, v2

    add-long/2addr v0, v2

    mul-int/lit8 v2, v6, 0x3c

    int-to-long v2, v2

    add-long/2addr v0, v2

    int-to-long v2, v15

    add-long/2addr v0, v2

    if-nez p1, :cond_1d

    .line 1093
    sget-object v2, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    goto :goto_9

    :cond_1d
    move-object/from16 v2, p1

    .line 1094
    :goto_9
    sget-object v3, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_ID:Ljava/time/ZoneId;

    if-eq v2, v3, :cond_1f

    invoke-virtual {v2}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    move-result-object v3

    sget-object v4, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_RULES:Ljava/time/zone/ZoneRules;

    if-ne v3, v4, :cond_1e

    goto :goto_a

    :cond_1e
    const/16 v16, 0x0

    goto :goto_b

    :cond_1f
    :goto_a
    const/16 v16, 0x1

    :goto_b
    if-eqz v16, :cond_20

    const-wide/32 v3, 0x28d2bea0

    cmp-long v3, v0, v3

    if-ltz v3, :cond_20

    const/16 v4, 0x7080

    goto :goto_d

    .line 1095
    :cond_20
    sget-object v3, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    if-eq v2, v3, :cond_22

    const-string v3, "UTC"

    invoke-virtual {v2}, Ljava/time/ZoneId;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_21

    goto :goto_c

    .line 1096
    :cond_21
    invoke-static {v12, v10, v5}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    move-result-object v3

    const/4 v4, 0x0

    .line 1097
    invoke-static {v13, v6, v15, v4}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    move-result-object v4

    .line 1098
    invoke-static {v3, v4}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    move-result-object v3

    .line 1099
    invoke-virtual {v2}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/LocalDateTime;)Ljava/time/ZoneOffset;

    move-result-object v2

    .line 1100
    invoke-virtual {v2}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    move-result v4

    goto :goto_d

    :cond_22
    :goto_c
    const/4 v4, 0x0

    :goto_d
    int-to-long v2, v4

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    return-wide v0

    .line 1101
    :cond_23
    new-instance v0, Ljava/time/format/DateTimeParseException;

    move-object/from16 v1, p0

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    invoke-direct {v0, v2, v1, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_24
    const/4 v4, 0x0

    move-object/from16 v1, p0

    .line 1102
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_25
    const/4 v4, 0x0

    move-object/from16 v1, p0

    .line 1103
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    .line 1104
    :goto_e
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_26
    const/4 v4, 0x0

    move-object/from16 v1, p0

    .line 1105
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    .line 1106
    :goto_f
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_27
    const/4 v4, 0x0

    move-object/from16 v1, p0

    .line 1107
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_28
    move-object/from16 v1, p0

    goto :goto_10

    :cond_29
    move-object v1, v0

    .line 1108
    :goto_10
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    invoke-direct {v0, v2, v1, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_2a
    move-object v1, v0

    const/4 v4, 0x0

    .line 1109
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_2b
    move-object v1, v0

    const/4 v4, 0x0

    .line 1110
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_2c
    move-object v1, v0

    .line 1111
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0
.end method

.method public static parseMillis19(Ljava/lang/String;Ljava/time/ZoneId;Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)J
    .locals 28

    move-object/from16 v0, p0

    if-eqz v0, :cond_24

    .line 1112
    const-string v1, "null"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_e

    :cond_0
    move-object/from16 v1, p2

    .line 1113
    iget v2, v1, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->length:I

    const/16 v3, 0x13

    if-ne v2, v3, :cond_23

    .line 1114
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v4, 0x0

    if-ne v2, v3, :cond_22

    .line 1115
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/4 v3, 0x1

    .line 1116
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/4 v6, 0x2

    .line 1117
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/4 v8, 0x3

    .line 1118
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v9

    const/4 v10, 0x4

    .line 1119
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    move-result v11

    const/4 v12, 0x5

    .line 1120
    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    const/4 v13, 0x6

    .line 1121
    invoke-virtual {v0, v13}, Ljava/lang/String;->charAt(I)C

    move-result v14

    const/4 v15, 0x7

    .line 1122
    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    const/16 v13, 0x8

    .line 1123
    invoke-virtual {v0, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    const/16 v4, 0x9

    .line 1124
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v16

    const/16 v4, 0xa

    .line 1125
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v10

    const/16 v4, 0xb

    .line 1126
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v8

    const/16 v4, 0xc

    .line 1127
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v4, 0xd

    .line 1128
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v3, 0xe

    .line 1129
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v1, 0xf

    .line 1130
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    move/from16 v21, v2

    const/16 v2, 0x10

    .line 1131
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    move/from16 v22, v5

    const/16 v5, 0x11

    .line 1132
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    move/from16 v23, v9

    const/16 v9, 0x12

    .line 1133
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    .line 1134
    sget-object v24, Lcom/alibaba/fastjson2/util/DateUtils$1;->$SwitchMap$com$alibaba$fastjson2$util$DateUtils$DateTimeFormatPattern:[I

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Enum;->ordinal()I

    move-result v25

    move/from16 v26, v13

    aget v13, v24, v25

    move/from16 v24, v14

    const-string v14, "illegal input"

    move/from16 v27, v9

    const/4 v9, 0x1

    if-eq v13, v9, :cond_7

    const/4 v9, 0x2

    if-eq v13, v9, :cond_5

    const/4 v9, 0x3

    if-eq v13, v9, :cond_3

    const/4 v9, 0x4

    if-ne v13, v9, :cond_2

    const/16 v9, 0x2e

    if-ne v7, v9, :cond_1

    if-ne v12, v9, :cond_1

    const/16 v7, 0x20

    if-ne v10, v7, :cond_1

    const/16 v7, 0x3a

    if-ne v4, v7, :cond_1

    if-ne v2, v7, :cond_1

    move/from16 v10, v16

    move/from16 v4, v21

    move/from16 v7, v22

    move/from16 v12, v23

    move/from16 v2, v24

    move/from16 v9, v26

    goto :goto_1

    .line 1135
    :cond_1
    new-instance v1, Ljava/time/format/DateTimeParseException;

    const/4 v2, 0x0

    invoke-direct {v1, v14, v0, v2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :cond_2
    const/4 v2, 0x0

    .line 1136
    new-instance v1, Ljava/time/format/DateTimeParseException;

    invoke-direct {v1, v14, v0, v2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :cond_3
    const/16 v9, 0x2f

    if-ne v11, v9, :cond_4

    if-ne v15, v9, :cond_4

    const/16 v9, 0x20

    if-ne v10, v9, :cond_4

    const/16 v9, 0x3a

    if-ne v4, v9, :cond_4

    if-ne v2, v9, :cond_4

    goto :goto_0

    .line 1137
    :cond_4
    new-instance v1, Ljava/time/format/DateTimeParseException;

    const/4 v2, 0x0

    invoke-direct {v1, v14, v0, v2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :cond_5
    const/16 v9, 0x2d

    if-ne v11, v9, :cond_6

    if-ne v15, v9, :cond_6

    const/16 v9, 0x54

    if-ne v10, v9, :cond_6

    const/16 v9, 0x3a

    if-ne v4, v9, :cond_6

    if-ne v2, v9, :cond_6

    goto :goto_0

    .line 1138
    :cond_6
    new-instance v1, Ljava/time/format/DateTimeParseException;

    const/4 v2, 0x0

    invoke-direct {v1, v14, v0, v2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :cond_7
    const/16 v9, 0x2d

    if-ne v11, v9, :cond_21

    if-ne v15, v9, :cond_21

    const/16 v9, 0x20

    if-ne v10, v9, :cond_21

    const/16 v9, 0x3a

    if-ne v4, v9, :cond_21

    if-ne v2, v9, :cond_21

    :goto_0
    move v9, v7

    move/from16 v7, v16

    move/from16 v2, v21

    move/from16 v15, v22

    move/from16 v10, v23

    move/from16 v11, v24

    move/from16 v4, v26

    :goto_1
    const/16 v13, 0x30

    if-lt v2, v13, :cond_20

    const/16 v0, 0x39

    if-gt v2, v0, :cond_1f

    if-lt v15, v13, :cond_1f

    if-gt v15, v0, :cond_1f

    if-lt v9, v13, :cond_1f

    if-gt v9, v0, :cond_1f

    if-lt v10, v13, :cond_1f

    if-gt v10, v0, :cond_1f

    sub-int/2addr v2, v13

    mul-int/lit16 v2, v2, 0x3e8

    const/16 v0, 0x64

    .line 1139
    invoke-static {v15, v13, v0, v2}, Lp/a;->z(IIII)I

    move-result v2

    const/16 v15, 0xa

    invoke-static {v9, v13, v15, v2}, Lp/a;->z(IIII)I

    move-result v2

    sub-int/2addr v10, v13

    add-int/2addr v10, v2

    if-lt v12, v13, :cond_1e

    const/16 v2, 0x39

    if-gt v12, v2, :cond_1e

    if-lt v11, v13, :cond_1e

    if-gt v11, v2, :cond_1e

    sub-int/2addr v12, v13

    mul-int/2addr v12, v15

    sub-int/2addr v11, v13

    add-int/2addr v11, v12

    if-nez v11, :cond_8

    if-nez v10, :cond_9

    :cond_8
    const/16 v2, 0xc

    goto :goto_2

    :cond_9
    const/4 v2, 0x0

    move-object/from16 v1, p0

    goto/16 :goto_c

    :goto_2
    if-gt v11, v2, :cond_9

    if-lt v4, v13, :cond_1d

    const/16 v2, 0x39

    if-gt v4, v2, :cond_1d

    if-lt v7, v13, :cond_1d

    if-gt v7, v2, :cond_1d

    sub-int/2addr v4, v13

    const/16 v18, 0xa

    mul-int/lit8 v4, v4, 0xa

    sub-int/2addr v7, v13

    add-int/2addr v7, v4

    const/4 v9, 0x2

    if-eq v11, v9, :cond_b

    const/4 v9, 0x4

    if-eq v11, v9, :cond_a

    const/4 v2, 0x6

    if-eq v11, v2, :cond_a

    const/16 v2, 0x9

    if-eq v11, v2, :cond_a

    const/16 v2, 0xb

    if-eq v11, v2, :cond_a

    const/16 v2, 0x1f

    goto :goto_3

    :cond_a
    const/16 v2, 0x1e

    goto :goto_3

    :cond_b
    and-int/lit8 v2, v10, 0x3

    if-nez v2, :cond_d

    .line 1140
    rem-int/lit8 v2, v10, 0x64

    if-nez v2, :cond_c

    rem-int/lit16 v2, v10, 0x190

    if-nez v2, :cond_d

    :cond_c
    const/16 v2, 0x1d

    goto :goto_3

    :cond_d
    const/16 v2, 0x1c

    :goto_3
    if-nez v7, :cond_f

    if-nez v10, :cond_e

    goto :goto_4

    :cond_e
    const/4 v2, 0x0

    move-object/from16 v1, p0

    goto/16 :goto_b

    :cond_f
    :goto_4
    if-gt v7, v2, :cond_e

    if-lt v8, v13, :cond_1c

    const/16 v2, 0x39

    if-gt v8, v2, :cond_1c

    if-lt v6, v13, :cond_1c

    if-gt v6, v2, :cond_1c

    sub-int/2addr v8, v13

    const/16 v18, 0xa

    mul-int/lit8 v8, v8, 0xa

    sub-int/2addr v6, v13

    add-int/2addr v6, v8

    if-lt v3, v13, :cond_1b

    if-gt v3, v2, :cond_1b

    if-lt v1, v13, :cond_1b

    if-gt v1, v2, :cond_1b

    sub-int/2addr v3, v13

    mul-int/lit8 v3, v3, 0xa

    sub-int/2addr v1, v13

    add-int/2addr v1, v3

    if-lt v5, v13, :cond_1a

    if-gt v5, v2, :cond_1a

    move/from16 v3, v27

    if-lt v3, v13, :cond_1a

    if-gt v3, v2, :cond_1a

    sub-int/2addr v5, v13

    mul-int/lit8 v5, v5, 0xa

    add-int/lit8 v9, v3, -0x30

    add-int/2addr v9, v5

    if-nez v10, :cond_10

    if-nez v11, :cond_10

    if-nez v7, :cond_10

    const/16 v10, 0x7b2

    const/4 v7, 0x1

    const/4 v11, 0x1

    :cond_10
    mul-int/lit16 v2, v10, 0x16d

    add-int/lit8 v3, v10, 0x3

    const/16 v17, 0x4

    .line 1141
    div-int/lit8 v3, v3, 0x4

    add-int/lit8 v4, v10, 0x63

    div-int/2addr v4, v0

    sub-int/2addr v3, v4

    add-int/lit16 v0, v10, 0x18f

    div-int/lit16 v0, v0, 0x190

    add-int/2addr v0, v3

    add-int/2addr v0, v2

    mul-int/lit16 v2, v11, 0x16f

    add-int/lit16 v2, v2, -0x16a

    const/16 v19, 0xc

    div-int/lit8 v2, v2, 0xc

    add-int/2addr v2, v0

    add-int/lit8 v0, v7, -0x1

    add-int/2addr v0, v2

    int-to-long v2, v0

    const/4 v0, 0x2

    if-le v11, v0, :cond_13

    const-wide/16 v4, 0x1

    sub-long v4, v2, v4

    and-int/lit8 v0, v10, 0x3

    if-nez v0, :cond_12

    .line 1142
    rem-int/lit8 v0, v10, 0x64

    if-nez v0, :cond_11

    rem-int/lit16 v0, v10, 0x190

    if-nez v0, :cond_12

    :cond_11
    move-wide v2, v4

    goto :goto_5

    :cond_12
    const-wide/16 v4, 0x2

    sub-long/2addr v2, v4

    :cond_13
    :goto_5
    const-wide/32 v4, 0xafaa8

    sub-long/2addr v2, v4

    const-wide/32 v4, 0x15180

    mul-long/2addr v2, v4

    mul-int/lit16 v0, v6, 0xe10

    int-to-long v4, v0

    add-long/2addr v2, v4

    mul-int/lit8 v0, v1, 0x3c

    int-to-long v4, v0

    add-long/2addr v2, v4

    int-to-long v4, v9

    add-long/2addr v2, v4

    if-nez p1, :cond_14

    .line 1143
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    goto :goto_6

    :cond_14
    move-object/from16 v0, p1

    .line 1144
    :goto_6
    sget-object v4, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_ID:Ljava/time/ZoneId;

    if-eq v0, v4, :cond_16

    invoke-virtual {v0}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    move-result-object v4

    sget-object v5, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_RULES:Ljava/time/zone/ZoneRules;

    if-ne v4, v5, :cond_15

    goto :goto_7

    :cond_15
    const/16 v20, 0x0

    goto :goto_8

    :cond_16
    :goto_7
    const/16 v20, 0x1

    :goto_8
    if-eqz v20, :cond_17

    const-wide/32 v4, 0x28d2bea0

    cmp-long v4, v2, v4

    if-ltz v4, :cond_17

    const/16 v4, 0x7080

    goto :goto_a

    .line 1145
    :cond_17
    sget-object v4, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    if-eq v0, v4, :cond_19

    const-string v4, "UTC"

    invoke-virtual {v0}, Ljava/time/ZoneId;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_18

    goto :goto_9

    .line 1146
    :cond_18
    invoke-static {v10, v11, v7}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    move-result-object v4

    const/4 v5, 0x0

    .line 1147
    invoke-static {v6, v1, v9, v5}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    move-result-object v1

    .line 1148
    invoke-static {v4, v1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    move-result-object v1

    .line 1149
    invoke-virtual {v0}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/LocalDateTime;)Ljava/time/ZoneOffset;

    move-result-object v0

    .line 1150
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    move-result v4

    goto :goto_a

    :cond_19
    :goto_9
    const/4 v4, 0x0

    :goto_a
    int-to-long v0, v4

    sub-long/2addr v2, v0

    const-wide/16 v0, 0x3e8

    mul-long/2addr v2, v0

    return-wide v2

    .line 1151
    :cond_1a
    new-instance v0, Ljava/time/format/DateTimeParseException;

    const/4 v2, 0x0

    move-object/from16 v1, p0

    invoke-direct {v0, v14, v1, v2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_1b
    const/4 v2, 0x0

    move-object/from16 v1, p0

    .line 1152
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-direct {v0, v14, v1, v2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_1c
    const/4 v2, 0x0

    move-object/from16 v1, p0

    .line 1153
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-direct {v0, v14, v1, v2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    .line 1154
    :goto_b
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-direct {v0, v14, v1, v2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_1d
    const/4 v2, 0x0

    move-object/from16 v1, p0

    .line 1155
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-direct {v0, v14, v1, v2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    .line 1156
    :goto_c
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-direct {v0, v14, v1, v2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_1e
    const/4 v2, 0x0

    move-object/from16 v1, p0

    .line 1157
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-direct {v0, v14, v1, v2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_1f
    const/4 v2, 0x0

    move-object/from16 v1, p0

    goto :goto_d

    :cond_20
    move-object v1, v0

    const/4 v2, 0x0

    .line 1158
    :goto_d
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-direct {v0, v14, v1, v2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_21
    move-object v1, v0

    const/4 v2, 0x0

    .line 1159
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-direct {v0, v14, v1, v2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_22
    move-object v1, v0

    move v2, v4

    .line 1160
    new-instance v0, Ljava/time/format/DateTimeParseException;

    const-string v3, "illegal input "

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3, v1, v2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    .line 1161
    :cond_23
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    :cond_24
    :goto_e
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public static parseMillis19([BILjava/time/ZoneId;)J
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    aget-byte v2, v0, v1

    .line 9
    .line 10
    int-to-char v2, v2

    .line 11
    add-int/lit8 v3, v1, 0x1

    .line 12
    .line 13
    aget-byte v3, v0, v3

    .line 14
    .line 15
    int-to-char v3, v3

    .line 16
    add-int/lit8 v4, v1, 0x2

    .line 17
    .line 18
    aget-byte v4, v0, v4

    .line 19
    .line 20
    int-to-char v4, v4

    .line 21
    add-int/lit8 v5, v1, 0x3

    .line 22
    .line 23
    aget-byte v5, v0, v5

    .line 24
    .line 25
    int-to-char v5, v5

    .line 26
    add-int/lit8 v6, v1, 0x4

    .line 27
    .line 28
    aget-byte v6, v0, v6

    .line 29
    .line 30
    int-to-char v6, v6

    .line 31
    add-int/lit8 v7, v1, 0x5

    .line 32
    .line 33
    aget-byte v7, v0, v7

    .line 34
    .line 35
    int-to-char v7, v7

    .line 36
    add-int/lit8 v8, v1, 0x6

    .line 37
    .line 38
    aget-byte v8, v0, v8

    .line 39
    .line 40
    int-to-char v8, v8

    .line 41
    add-int/lit8 v9, v1, 0x7

    .line 42
    .line 43
    aget-byte v9, v0, v9

    .line 44
    .line 45
    int-to-char v9, v9

    .line 46
    add-int/lit8 v10, v1, 0x8

    .line 47
    .line 48
    aget-byte v10, v0, v10

    .line 49
    .line 50
    int-to-char v10, v10

    .line 51
    add-int/lit8 v11, v1, 0x9

    .line 52
    .line 53
    aget-byte v11, v0, v11

    .line 54
    .line 55
    int-to-char v11, v11

    .line 56
    add-int/lit8 v12, v1, 0xa

    .line 57
    .line 58
    aget-byte v12, v0, v12

    .line 59
    .line 60
    int-to-char v12, v12

    .line 61
    add-int/lit8 v13, v1, 0xb

    .line 62
    .line 63
    aget-byte v13, v0, v13

    .line 64
    .line 65
    int-to-char v13, v13

    .line 66
    add-int/lit8 v14, v1, 0xc

    .line 67
    .line 68
    aget-byte v14, v0, v14

    .line 69
    .line 70
    int-to-char v14, v14

    .line 71
    add-int/lit8 v15, v1, 0xd

    .line 72
    .line 73
    aget-byte v15, v0, v15

    .line 74
    .line 75
    int-to-char v15, v15

    .line 76
    add-int/lit8 v16, v1, 0xe

    .line 77
    .line 78
    move/from16 v17, v2

    .line 79
    .line 80
    aget-byte v2, v0, v16

    .line 81
    .line 82
    int-to-char v2, v2

    .line 83
    add-int/lit8 v16, v1, 0xf

    .line 84
    .line 85
    move/from16 v18, v10

    .line 86
    .line 87
    aget-byte v10, v0, v16

    .line 88
    .line 89
    int-to-char v10, v10

    .line 90
    add-int/lit8 v16, v1, 0x10

    .line 91
    .line 92
    move/from16 v19, v10

    .line 93
    .line 94
    aget-byte v10, v0, v16

    .line 95
    .line 96
    int-to-char v10, v10

    .line 97
    add-int/lit8 v16, v1, 0x11

    .line 98
    .line 99
    move/from16 v20, v11

    .line 100
    .line 101
    aget-byte v11, v0, v16

    .line 102
    .line 103
    int-to-char v11, v11

    .line 104
    add-int/lit8 v16, v1, 0x12

    .line 105
    .line 106
    move/from16 v21, v14

    .line 107
    .line 108
    aget-byte v14, v0, v16

    .line 109
    .line 110
    int-to-char v14, v14

    .line 111
    move/from16 v16, v14

    .line 112
    .line 113
    const-string v14, "illegal input "

    .line 114
    .line 115
    move/from16 v22, v11

    .line 116
    .line 117
    const/16 v23, 0x30

    .line 118
    .line 119
    const/16 v24, 0xa

    .line 120
    .line 121
    const/16 v11, 0x2d

    .line 122
    .line 123
    if-ne v6, v11, :cond_1

    .line 124
    .line 125
    if-ne v9, v11, :cond_1

    .line 126
    .line 127
    const/16 v11, 0x20

    .line 128
    .line 129
    if-eq v12, v11, :cond_0

    .line 130
    .line 131
    const/16 v11, 0x54

    .line 132
    .line 133
    if-ne v12, v11, :cond_1

    .line 134
    .line 135
    :cond_0
    const/16 v11, 0x3a

    .line 136
    .line 137
    if-ne v15, v11, :cond_1

    .line 138
    .line 139
    if-ne v10, v11, :cond_1

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_1
    const/16 v11, 0x2f

    .line 143
    .line 144
    if-ne v6, v11, :cond_4

    .line 145
    .line 146
    if-ne v9, v11, :cond_4

    .line 147
    .line 148
    const/16 v11, 0x20

    .line 149
    .line 150
    if-eq v12, v11, :cond_2

    .line 151
    .line 152
    const/16 v11, 0x54

    .line 153
    .line 154
    if-ne v12, v11, :cond_3

    .line 155
    .line 156
    :cond_2
    const/16 v11, 0x3a

    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_3
    const/16 v11, 0x2f

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :goto_0
    if-ne v15, v11, :cond_3

    .line 163
    .line 164
    if-ne v10, v11, :cond_3

    .line 165
    .line 166
    :goto_1
    move v9, v3

    .line 167
    move v6, v4

    .line 168
    move v12, v5

    .line 169
    move/from16 v3, v18

    .line 170
    .line 171
    move/from16 v10, v19

    .line 172
    .line 173
    move/from16 v4, v20

    .line 174
    .line 175
    move/from16 v15, v21

    .line 176
    .line 177
    move/from16 v11, v22

    .line 178
    .line 179
    move v5, v2

    .line 180
    move/from16 v2, v17

    .line 181
    .line 182
    move-object/from16 v17, v14

    .line 183
    .line 184
    move/from16 v14, v23

    .line 185
    .line 186
    goto/16 :goto_7

    .line 187
    .line 188
    :cond_4
    :goto_2
    if-ne v4, v11, :cond_6

    .line 189
    .line 190
    if-eq v7, v11, :cond_5

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_5
    :goto_3
    const/16 v11, 0x20

    .line 194
    .line 195
    goto :goto_5

    .line 196
    :cond_6
    :goto_4
    const/16 v11, 0x2e

    .line 197
    .line 198
    if-ne v4, v11, :cond_7

    .line 199
    .line 200
    if-eq v7, v11, :cond_5

    .line 201
    .line 202
    :cond_7
    const/16 v11, 0x2d

    .line 203
    .line 204
    if-ne v4, v11, :cond_8

    .line 205
    .line 206
    if-ne v7, v11, :cond_8

    .line 207
    .line 208
    goto :goto_3

    .line 209
    :goto_5
    if-ne v12, v11, :cond_9

    .line 210
    .line 211
    const/16 v11, 0x3a

    .line 212
    .line 213
    if-ne v15, v11, :cond_8

    .line 214
    .line 215
    if-ne v10, v11, :cond_8

    .line 216
    .line 217
    move v4, v3

    .line 218
    move v7, v5

    .line 219
    move/from16 v3, v17

    .line 220
    .line 221
    move/from16 v10, v19

    .line 222
    .line 223
    move/from16 v12, v20

    .line 224
    .line 225
    move/from16 v15, v21

    .line 226
    .line 227
    move/from16 v11, v22

    .line 228
    .line 229
    move v5, v2

    .line 230
    move v2, v8

    .line 231
    move-object/from16 v17, v14

    .line 232
    .line 233
    move/from16 v14, v23

    .line 234
    .line 235
    :goto_6
    move v8, v6

    .line 236
    move/from16 v6, v18

    .line 237
    .line 238
    goto/16 :goto_7

    .line 239
    .line 240
    :cond_8
    const/16 v11, 0x20

    .line 241
    .line 242
    :cond_9
    if-ne v3, v11, :cond_c

    .line 243
    .line 244
    if-ne v7, v11, :cond_c

    .line 245
    .line 246
    if-ne v12, v11, :cond_c

    .line 247
    .line 248
    const/16 v11, 0x3a

    .line 249
    .line 250
    if-ne v15, v11, :cond_b

    .line 251
    .line 252
    if-ne v10, v11, :cond_b

    .line 253
    .line 254
    invoke-static {v4, v5, v6}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    .line 255
    .line 256
    .line 257
    move-result v3

    .line 258
    if-lez v3, :cond_a

    .line 259
    .line 260
    div-int/lit8 v4, v3, 0xa

    .line 261
    .line 262
    add-int/lit8 v4, v4, 0x30

    .line 263
    .line 264
    int-to-char v5, v4

    .line 265
    rem-int/lit8 v3, v3, 0xa

    .line 266
    .line 267
    add-int/lit8 v3, v3, 0x30

    .line 268
    .line 269
    int-to-char v6, v3

    .line 270
    move v7, v5

    .line 271
    move/from16 v4, v17

    .line 272
    .line 273
    move/from16 v10, v19

    .line 274
    .line 275
    move/from16 v12, v20

    .line 276
    .line 277
    move/from16 v15, v21

    .line 278
    .line 279
    move/from16 v11, v22

    .line 280
    .line 281
    move/from16 v3, v23

    .line 282
    .line 283
    move v5, v2

    .line 284
    move v2, v8

    .line 285
    move-object/from16 v17, v14

    .line 286
    .line 287
    move v14, v3

    .line 288
    goto :goto_6

    .line 289
    :cond_a
    new-instance v2, Ljava/lang/String;

    .line 290
    .line 291
    const/16 v3, 0x13

    .line 292
    .line 293
    invoke-direct {v2, v0, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 294
    .line 295
    .line 296
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 297
    .line 298
    invoke-virtual {v14, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    const/4 v3, 0x0

    .line 303
    invoke-direct {v0, v1, v2, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 304
    .line 305
    .line 306
    throw v0

    .line 307
    :cond_b
    const/16 v11, 0x20

    .line 308
    .line 309
    :cond_c
    if-ne v4, v11, :cond_f

    .line 310
    .line 311
    if-ne v8, v11, :cond_f

    .line 312
    .line 313
    if-ne v13, v11, :cond_f

    .line 314
    .line 315
    const/16 v11, 0x3a

    .line 316
    .line 317
    if-ne v15, v11, :cond_e

    .line 318
    .line 319
    if-ne v10, v11, :cond_e

    .line 320
    .line 321
    invoke-static {v5, v6, v7}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    .line 322
    .line 323
    .line 324
    move-result v4

    .line 325
    if-lez v4, :cond_d

    .line 326
    .line 327
    div-int/lit8 v5, v4, 0xa

    .line 328
    .line 329
    add-int/lit8 v5, v5, 0x30

    .line 330
    .line 331
    int-to-char v5, v5

    .line 332
    rem-int/lit8 v4, v4, 0xa

    .line 333
    .line 334
    add-int/lit8 v4, v4, 0x30

    .line 335
    .line 336
    int-to-char v6, v4

    .line 337
    move v4, v3

    .line 338
    move v7, v5

    .line 339
    move v8, v6

    .line 340
    move/from16 v3, v17

    .line 341
    .line 342
    move/from16 v10, v19

    .line 343
    .line 344
    move/from16 v6, v20

    .line 345
    .line 346
    move/from16 v15, v21

    .line 347
    .line 348
    move/from16 v11, v22

    .line 349
    .line 350
    move/from16 v13, v23

    .line 351
    .line 352
    move v5, v2

    .line 353
    move v2, v9

    .line 354
    move-object/from16 v17, v14

    .line 355
    .line 356
    move/from16 v9, v18

    .line 357
    .line 358
    move v14, v13

    .line 359
    goto/16 :goto_7

    .line 360
    .line 361
    :cond_d
    new-instance v2, Ljava/lang/String;

    .line 362
    .line 363
    const/16 v3, 0x13

    .line 364
    .line 365
    invoke-direct {v2, v0, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 366
    .line 367
    .line 368
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 369
    .line 370
    invoke-virtual {v14, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    const/4 v3, 0x0

    .line 375
    invoke-direct {v0, v1, v2, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 376
    .line 377
    .line 378
    throw v0

    .line 379
    :cond_e
    const/16 v11, 0x20

    .line 380
    .line 381
    :cond_f
    if-ne v4, v11, :cond_12

    .line 382
    .line 383
    if-ne v8, v11, :cond_12

    .line 384
    .line 385
    if-ne v13, v11, :cond_12

    .line 386
    .line 387
    const/16 v11, 0x3a

    .line 388
    .line 389
    if-ne v2, v11, :cond_11

    .line 390
    .line 391
    if-ne v10, v11, :cond_11

    .line 392
    .line 393
    invoke-static {v5, v6, v7}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    .line 394
    .line 395
    .line 396
    move-result v2

    .line 397
    if-lez v2, :cond_10

    .line 398
    .line 399
    div-int/lit8 v4, v2, 0xa

    .line 400
    .line 401
    add-int/lit8 v4, v4, 0x30

    .line 402
    .line 403
    int-to-char v5, v4

    .line 404
    rem-int/lit8 v2, v2, 0xa

    .line 405
    .line 406
    add-int/lit8 v2, v2, 0x30

    .line 407
    .line 408
    int-to-char v6, v2

    .line 409
    move v4, v3

    .line 410
    move v7, v5

    .line 411
    move v8, v6

    .line 412
    move v2, v9

    .line 413
    move/from16 v3, v17

    .line 414
    .line 415
    move/from16 v9, v18

    .line 416
    .line 417
    move/from16 v10, v19

    .line 418
    .line 419
    move/from16 v6, v20

    .line 420
    .line 421
    move/from16 v13, v21

    .line 422
    .line 423
    move/from16 v11, v22

    .line 424
    .line 425
    move/from16 v5, v23

    .line 426
    .line 427
    move-object/from16 v17, v14

    .line 428
    .line 429
    move v14, v5

    .line 430
    goto :goto_7

    .line 431
    :cond_10
    new-instance v2, Ljava/lang/String;

    .line 432
    .line 433
    const/16 v3, 0x13

    .line 434
    .line 435
    invoke-direct {v2, v0, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 436
    .line 437
    .line 438
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 439
    .line 440
    invoke-virtual {v14, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    const/4 v3, 0x0

    .line 445
    invoke-direct {v0, v1, v2, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 446
    .line 447
    .line 448
    throw v0

    .line 449
    :cond_11
    const/16 v11, 0x20

    .line 450
    .line 451
    :cond_12
    if-ne v4, v11, :cond_2d

    .line 452
    .line 453
    if-ne v8, v11, :cond_2d

    .line 454
    .line 455
    if-ne v13, v11, :cond_2d

    .line 456
    .line 457
    const/16 v11, 0x3a

    .line 458
    .line 459
    if-ne v2, v11, :cond_2d

    .line 460
    .line 461
    move/from16 v2, v22

    .line 462
    .line 463
    if-ne v2, v11, :cond_2d

    .line 464
    .line 465
    invoke-static {v5, v6, v7}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    .line 466
    .line 467
    .line 468
    move-result v2

    .line 469
    if-lez v2, :cond_2c

    .line 470
    .line 471
    div-int/lit8 v4, v2, 0xa

    .line 472
    .line 473
    add-int/lit8 v4, v4, 0x30

    .line 474
    .line 475
    int-to-char v5, v4

    .line 476
    rem-int/lit8 v2, v2, 0xa

    .line 477
    .line 478
    add-int/lit8 v2, v2, 0x30

    .line 479
    .line 480
    int-to-char v6, v2

    .line 481
    move v4, v3

    .line 482
    move v7, v5

    .line 483
    move v8, v6

    .line 484
    move v2, v9

    .line 485
    move/from16 v3, v17

    .line 486
    .line 487
    move/from16 v9, v18

    .line 488
    .line 489
    move/from16 v5, v19

    .line 490
    .line 491
    move/from16 v6, v20

    .line 492
    .line 493
    move/from16 v13, v21

    .line 494
    .line 495
    move/from16 v11, v23

    .line 496
    .line 497
    move-object/from16 v17, v14

    .line 498
    .line 499
    move v14, v11

    .line 500
    :goto_7
    if-lt v2, v14, :cond_2b

    .line 501
    .line 502
    const/16 v0, 0x39

    .line 503
    .line 504
    if-gt v2, v0, :cond_2a

    .line 505
    .line 506
    if-lt v9, v14, :cond_2a

    .line 507
    .line 508
    if-gt v9, v0, :cond_2a

    .line 509
    .line 510
    if-lt v6, v14, :cond_2a

    .line 511
    .line 512
    if-gt v6, v0, :cond_2a

    .line 513
    .line 514
    if-lt v12, v14, :cond_2a

    .line 515
    .line 516
    if-gt v12, v0, :cond_2a

    .line 517
    .line 518
    sub-int/2addr v2, v14

    .line 519
    mul-int/lit16 v2, v2, 0x3e8

    .line 520
    .line 521
    const/16 v0, 0x64

    .line 522
    .line 523
    invoke-static {v9, v14, v0, v2}, Lp/a;->z(IIII)I

    .line 524
    .line 525
    .line 526
    move-result v2

    .line 527
    move/from16 v9, v24

    .line 528
    .line 529
    invoke-static {v6, v14, v9, v2}, Lp/a;->z(IIII)I

    .line 530
    .line 531
    .line 532
    move-result v2

    .line 533
    sub-int/2addr v12, v14

    .line 534
    add-int/2addr v12, v2

    .line 535
    if-lt v7, v14, :cond_29

    .line 536
    .line 537
    const/16 v2, 0x39

    .line 538
    .line 539
    if-gt v7, v2, :cond_29

    .line 540
    .line 541
    if-lt v8, v14, :cond_29

    .line 542
    .line 543
    if-gt v8, v2, :cond_29

    .line 544
    .line 545
    sub-int/2addr v7, v14

    .line 546
    mul-int/2addr v7, v9

    .line 547
    sub-int/2addr v8, v14

    .line 548
    add-int/2addr v8, v7

    .line 549
    if-nez v8, :cond_14

    .line 550
    .line 551
    if-nez v12, :cond_13

    .line 552
    .line 553
    goto :goto_8

    .line 554
    :cond_13
    move-object/from16 v2, p0

    .line 555
    .line 556
    move-object/from16 v4, v17

    .line 557
    .line 558
    const/16 v3, 0x13

    .line 559
    .line 560
    const/4 v5, 0x0

    .line 561
    goto/16 :goto_11

    .line 562
    .line 563
    :cond_14
    :goto_8
    const/16 v2, 0xc

    .line 564
    .line 565
    if-gt v8, v2, :cond_13

    .line 566
    .line 567
    if-lt v3, v14, :cond_28

    .line 568
    .line 569
    const/16 v6, 0x39

    .line 570
    .line 571
    if-gt v3, v6, :cond_28

    .line 572
    .line 573
    if-lt v4, v14, :cond_28

    .line 574
    .line 575
    if-gt v4, v6, :cond_28

    .line 576
    .line 577
    sub-int/2addr v3, v14

    .line 578
    const/16 v24, 0xa

    .line 579
    .line 580
    mul-int/lit8 v3, v3, 0xa

    .line 581
    .line 582
    sub-int/2addr v4, v14

    .line 583
    add-int/2addr v4, v3

    .line 584
    const/4 v3, 0x2

    .line 585
    const/4 v6, 0x4

    .line 586
    if-eq v8, v3, :cond_16

    .line 587
    .line 588
    if-eq v8, v6, :cond_15

    .line 589
    .line 590
    const/4 v7, 0x6

    .line 591
    if-eq v8, v7, :cond_15

    .line 592
    .line 593
    const/16 v7, 0x9

    .line 594
    .line 595
    if-eq v8, v7, :cond_15

    .line 596
    .line 597
    const/16 v7, 0xb

    .line 598
    .line 599
    if-eq v8, v7, :cond_15

    .line 600
    .line 601
    const/16 v7, 0x1f

    .line 602
    .line 603
    goto :goto_9

    .line 604
    :cond_15
    const/16 v7, 0x1e

    .line 605
    .line 606
    goto :goto_9

    .line 607
    :cond_16
    and-int/lit8 v7, v12, 0x3

    .line 608
    .line 609
    if-nez v7, :cond_18

    .line 610
    .line 611
    rem-int/lit8 v7, v12, 0x64

    .line 612
    .line 613
    if-nez v7, :cond_17

    .line 614
    .line 615
    rem-int/lit16 v7, v12, 0x190

    .line 616
    .line 617
    if-nez v7, :cond_18

    .line 618
    .line 619
    :cond_17
    const/16 v7, 0x1d

    .line 620
    .line 621
    goto :goto_9

    .line 622
    :cond_18
    const/16 v7, 0x1c

    .line 623
    .line 624
    :goto_9
    if-nez v4, :cond_1a

    .line 625
    .line 626
    if-nez v12, :cond_19

    .line 627
    .line 628
    goto :goto_a

    .line 629
    :cond_19
    move-object/from16 v2, p0

    .line 630
    .line 631
    move-object/from16 v4, v17

    .line 632
    .line 633
    const/16 v3, 0x13

    .line 634
    .line 635
    const/4 v5, 0x0

    .line 636
    goto/16 :goto_10

    .line 637
    .line 638
    :cond_1a
    :goto_a
    if-gt v4, v7, :cond_19

    .line 639
    .line 640
    const/16 v14, 0x30

    .line 641
    .line 642
    if-lt v13, v14, :cond_27

    .line 643
    .line 644
    const/16 v7, 0x39

    .line 645
    .line 646
    if-gt v13, v7, :cond_27

    .line 647
    .line 648
    if-lt v15, v14, :cond_27

    .line 649
    .line 650
    if-gt v15, v7, :cond_27

    .line 651
    .line 652
    sub-int/2addr v13, v14

    .line 653
    const/16 v24, 0xa

    .line 654
    .line 655
    mul-int/lit8 v13, v13, 0xa

    .line 656
    .line 657
    sub-int/2addr v15, v14

    .line 658
    add-int/2addr v15, v13

    .line 659
    if-lt v5, v14, :cond_26

    .line 660
    .line 661
    if-gt v5, v7, :cond_26

    .line 662
    .line 663
    if-lt v10, v14, :cond_26

    .line 664
    .line 665
    if-gt v10, v7, :cond_26

    .line 666
    .line 667
    sub-int/2addr v5, v14

    .line 668
    mul-int/lit8 v5, v5, 0xa

    .line 669
    .line 670
    sub-int/2addr v10, v14

    .line 671
    add-int/2addr v10, v5

    .line 672
    if-lt v11, v14, :cond_25

    .line 673
    .line 674
    if-gt v11, v7, :cond_25

    .line 675
    .line 676
    move/from16 v5, v16

    .line 677
    .line 678
    if-lt v5, v14, :cond_25

    .line 679
    .line 680
    if-gt v5, v7, :cond_25

    .line 681
    .line 682
    sub-int/2addr v11, v14

    .line 683
    mul-int/lit8 v11, v11, 0xa

    .line 684
    .line 685
    add-int/lit8 v14, v5, -0x30

    .line 686
    .line 687
    add-int/2addr v14, v11

    .line 688
    const/4 v1, 0x1

    .line 689
    if-nez v12, :cond_1b

    .line 690
    .line 691
    if-nez v8, :cond_1b

    .line 692
    .line 693
    if-nez v4, :cond_1b

    .line 694
    .line 695
    const/16 v12, 0x7b2

    .line 696
    .line 697
    move v4, v1

    .line 698
    move v8, v4

    .line 699
    :cond_1b
    mul-int/lit16 v5, v12, 0x16d

    .line 700
    .line 701
    add-int/lit8 v7, v12, 0x3

    .line 702
    .line 703
    div-int/2addr v7, v6

    .line 704
    add-int/lit8 v6, v12, 0x63

    .line 705
    .line 706
    div-int/2addr v6, v0

    .line 707
    sub-int/2addr v7, v6

    .line 708
    add-int/lit16 v0, v12, 0x18f

    .line 709
    .line 710
    div-int/lit16 v0, v0, 0x190

    .line 711
    .line 712
    add-int/2addr v0, v7

    .line 713
    add-int/2addr v0, v5

    .line 714
    mul-int/lit16 v5, v8, 0x16f

    .line 715
    .line 716
    add-int/lit16 v5, v5, -0x16a

    .line 717
    .line 718
    div-int/2addr v5, v2

    .line 719
    add-int/2addr v5, v0

    .line 720
    add-int/lit8 v0, v4, -0x1

    .line 721
    .line 722
    add-int/2addr v0, v5

    .line 723
    int-to-long v5, v0

    .line 724
    if-le v8, v3, :cond_1e

    .line 725
    .line 726
    const-wide/16 v2, 0x1

    .line 727
    .line 728
    sub-long v2, v5, v2

    .line 729
    .line 730
    and-int/lit8 v0, v12, 0x3

    .line 731
    .line 732
    if-nez v0, :cond_1d

    .line 733
    .line 734
    rem-int/lit8 v0, v12, 0x64

    .line 735
    .line 736
    if-nez v0, :cond_1c

    .line 737
    .line 738
    rem-int/lit16 v0, v12, 0x190

    .line 739
    .line 740
    if-nez v0, :cond_1d

    .line 741
    .line 742
    :cond_1c
    move-wide v5, v2

    .line 743
    goto :goto_b

    .line 744
    :cond_1d
    const-wide/16 v2, 0x2

    .line 745
    .line 746
    sub-long/2addr v5, v2

    .line 747
    :cond_1e
    :goto_b
    const-wide/32 v2, 0xafaa8

    .line 748
    .line 749
    .line 750
    sub-long/2addr v5, v2

    .line 751
    const-wide/32 v2, 0x15180

    .line 752
    .line 753
    .line 754
    mul-long/2addr v5, v2

    .line 755
    mul-int/lit16 v0, v15, 0xe10

    .line 756
    .line 757
    int-to-long v2, v0

    .line 758
    add-long/2addr v5, v2

    .line 759
    mul-int/lit8 v0, v10, 0x3c

    .line 760
    .line 761
    int-to-long v2, v0

    .line 762
    add-long/2addr v5, v2

    .line 763
    int-to-long v2, v14

    .line 764
    add-long/2addr v5, v2

    .line 765
    if-nez p2, :cond_1f

    .line 766
    .line 767
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 768
    .line 769
    goto :goto_c

    .line 770
    :cond_1f
    move-object/from16 v0, p2

    .line 771
    .line 772
    :goto_c
    sget-object v2, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_ID:Ljava/time/ZoneId;

    .line 773
    .line 774
    if-eq v0, v2, :cond_21

    .line 775
    .line 776
    invoke-virtual {v0}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 777
    .line 778
    .line 779
    move-result-object v2

    .line 780
    sget-object v3, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_RULES:Ljava/time/zone/ZoneRules;

    .line 781
    .line 782
    if-ne v2, v3, :cond_20

    .line 783
    .line 784
    goto :goto_d

    .line 785
    :cond_20
    const/4 v1, 0x0

    .line 786
    :cond_21
    :goto_d
    if-eqz v1, :cond_22

    .line 787
    .line 788
    const-wide/32 v1, 0x28d2bea0

    .line 789
    .line 790
    .line 791
    cmp-long v1, v5, v1

    .line 792
    .line 793
    if-ltz v1, :cond_22

    .line 794
    .line 795
    const/16 v11, 0x7080

    .line 796
    .line 797
    goto :goto_f

    .line 798
    :cond_22
    sget-object v1, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 799
    .line 800
    if-eq v0, v1, :cond_24

    .line 801
    .line 802
    const-string v1, "UTC"

    .line 803
    .line 804
    invoke-virtual {v0}, Ljava/time/ZoneId;->getId()Ljava/lang/String;

    .line 805
    .line 806
    .line 807
    move-result-object v2

    .line 808
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 809
    .line 810
    .line 811
    move-result v1

    .line 812
    if-eqz v1, :cond_23

    .line 813
    .line 814
    goto :goto_e

    .line 815
    :cond_23
    invoke-static {v12, v8, v4}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 816
    .line 817
    .line 818
    move-result-object v1

    .line 819
    const/4 v3, 0x0

    .line 820
    invoke-static {v15, v10, v14, v3}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 821
    .line 822
    .line 823
    move-result-object v2

    .line 824
    invoke-static {v1, v2}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 825
    .line 826
    .line 827
    move-result-object v1

    .line 828
    invoke-virtual {v0}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 829
    .line 830
    .line 831
    move-result-object v0

    .line 832
    invoke-virtual {v0, v1}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/LocalDateTime;)Ljava/time/ZoneOffset;

    .line 833
    .line 834
    .line 835
    move-result-object v0

    .line 836
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 837
    .line 838
    .line 839
    move-result v11

    .line 840
    goto :goto_f

    .line 841
    :cond_24
    :goto_e
    const/4 v11, 0x0

    .line 842
    :goto_f
    int-to-long v0, v11

    .line 843
    sub-long/2addr v5, v0

    .line 844
    const-wide/16 v0, 0x3e8

    .line 845
    .line 846
    mul-long/2addr v5, v0

    .line 847
    return-wide v5

    .line 848
    :cond_25
    new-instance v0, Ljava/lang/String;

    .line 849
    .line 850
    const/16 v3, 0x13

    .line 851
    .line 852
    move-object/from16 v2, p0

    .line 853
    .line 854
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 855
    .line 856
    .line 857
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 858
    .line 859
    move-object/from16 v4, v17

    .line 860
    .line 861
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 862
    .line 863
    .line 864
    move-result-object v2

    .line 865
    const/4 v5, 0x0

    .line 866
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 867
    .line 868
    .line 869
    throw v1

    .line 870
    :cond_26
    move-object/from16 v2, p0

    .line 871
    .line 872
    move-object/from16 v4, v17

    .line 873
    .line 874
    const/16 v3, 0x13

    .line 875
    .line 876
    const/4 v5, 0x0

    .line 877
    new-instance v0, Ljava/lang/String;

    .line 878
    .line 879
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 880
    .line 881
    .line 882
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 883
    .line 884
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 885
    .line 886
    .line 887
    move-result-object v2

    .line 888
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 889
    .line 890
    .line 891
    throw v1

    .line 892
    :cond_27
    move-object/from16 v2, p0

    .line 893
    .line 894
    move-object/from16 v4, v17

    .line 895
    .line 896
    const/16 v3, 0x13

    .line 897
    .line 898
    const/4 v5, 0x0

    .line 899
    new-instance v0, Ljava/lang/String;

    .line 900
    .line 901
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 902
    .line 903
    .line 904
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 905
    .line 906
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 907
    .line 908
    .line 909
    move-result-object v2

    .line 910
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 911
    .line 912
    .line 913
    throw v1

    .line 914
    :goto_10
    new-instance v0, Ljava/lang/String;

    .line 915
    .line 916
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 917
    .line 918
    .line 919
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 920
    .line 921
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 922
    .line 923
    .line 924
    move-result-object v2

    .line 925
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 926
    .line 927
    .line 928
    throw v1

    .line 929
    :cond_28
    move-object/from16 v2, p0

    .line 930
    .line 931
    move-object/from16 v4, v17

    .line 932
    .line 933
    const/16 v3, 0x13

    .line 934
    .line 935
    const/4 v5, 0x0

    .line 936
    new-instance v0, Ljava/lang/String;

    .line 937
    .line 938
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 939
    .line 940
    .line 941
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 942
    .line 943
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 944
    .line 945
    .line 946
    move-result-object v2

    .line 947
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 948
    .line 949
    .line 950
    throw v1

    .line 951
    :goto_11
    new-instance v0, Ljava/lang/String;

    .line 952
    .line 953
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 954
    .line 955
    .line 956
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 957
    .line 958
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 959
    .line 960
    .line 961
    move-result-object v2

    .line 962
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 963
    .line 964
    .line 965
    throw v1

    .line 966
    :cond_29
    move-object/from16 v2, p0

    .line 967
    .line 968
    move-object/from16 v4, v17

    .line 969
    .line 970
    const/16 v3, 0x13

    .line 971
    .line 972
    const/4 v5, 0x0

    .line 973
    new-instance v0, Ljava/lang/String;

    .line 974
    .line 975
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 976
    .line 977
    .line 978
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 979
    .line 980
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 981
    .line 982
    .line 983
    move-result-object v2

    .line 984
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 985
    .line 986
    .line 987
    throw v1

    .line 988
    :cond_2a
    move-object/from16 v2, p0

    .line 989
    .line 990
    :goto_12
    move-object/from16 v4, v17

    .line 991
    .line 992
    goto :goto_13

    .line 993
    :cond_2b
    move-object v2, v0

    .line 994
    goto :goto_12

    .line 995
    :goto_13
    new-instance v0, Ljava/lang/String;

    .line 996
    .line 997
    const/16 v3, 0x13

    .line 998
    .line 999
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 1000
    .line 1001
    .line 1002
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 1003
    .line 1004
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v2

    .line 1008
    const/4 v5, 0x0

    .line 1009
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 1010
    .line 1011
    .line 1012
    throw v1

    .line 1013
    :cond_2c
    move-object v2, v0

    .line 1014
    move-object v4, v14

    .line 1015
    const/16 v3, 0x13

    .line 1016
    .line 1017
    const/4 v5, 0x0

    .line 1018
    new-instance v0, Ljava/lang/String;

    .line 1019
    .line 1020
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 1021
    .line 1022
    .line 1023
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 1024
    .line 1025
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v2

    .line 1029
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 1030
    .line 1031
    .line 1032
    throw v1

    .line 1033
    :cond_2d
    move-object v2, v0

    .line 1034
    move-object v4, v14

    .line 1035
    const/16 v3, 0x13

    .line 1036
    .line 1037
    const/4 v5, 0x0

    .line 1038
    new-instance v0, Ljava/lang/String;

    .line 1039
    .line 1040
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 1041
    .line 1042
    .line 1043
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 1044
    .line 1045
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v2

    .line 1049
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 1050
    .line 1051
    .line 1052
    throw v1
.end method

.method public static parseMillis19([CILjava/time/ZoneId;)J
    .locals 25

    move-object/from16 v0, p0

    move/from16 v1, p1

    .line 1162
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1163
    aget-char v2, v0, v1

    add-int/lit8 v3, v1, 0x1

    .line 1164
    aget-char v3, v0, v3

    add-int/lit8 v4, v1, 0x2

    .line 1165
    aget-char v4, v0, v4

    add-int/lit8 v5, v1, 0x3

    .line 1166
    aget-char v5, v0, v5

    add-int/lit8 v6, v1, 0x4

    .line 1167
    aget-char v6, v0, v6

    add-int/lit8 v7, v1, 0x5

    .line 1168
    aget-char v7, v0, v7

    add-int/lit8 v8, v1, 0x6

    .line 1169
    aget-char v8, v0, v8

    add-int/lit8 v9, v1, 0x7

    .line 1170
    aget-char v9, v0, v9

    add-int/lit8 v10, v1, 0x8

    .line 1171
    aget-char v10, v0, v10

    add-int/lit8 v11, v1, 0x9

    .line 1172
    aget-char v11, v0, v11

    add-int/lit8 v12, v1, 0xa

    .line 1173
    aget-char v12, v0, v12

    add-int/lit8 v13, v1, 0xb

    .line 1174
    aget-char v13, v0, v13

    add-int/lit8 v14, v1, 0xc

    .line 1175
    aget-char v14, v0, v14

    add-int/lit8 v15, v1, 0xd

    .line 1176
    aget-char v15, v0, v15

    add-int/lit8 v16, v1, 0xe

    move/from16 v17, v2

    .line 1177
    aget-char v2, v0, v16

    add-int/lit8 v16, v1, 0xf

    .line 1178
    aget-char v16, v0, v16

    add-int/lit8 v18, v1, 0x10

    move/from16 v19, v10

    .line 1179
    aget-char v10, v0, v18

    add-int/lit8 v18, v1, 0x11

    move/from16 v20, v11

    .line 1180
    aget-char v11, v0, v18

    add-int/lit8 v18, v1, 0x12

    move/from16 v21, v14

    .line 1181
    aget-char v14, v0, v18

    move/from16 v18, v14

    .line 1182
    const-string v14, "illegal input "

    move/from16 v22, v11

    const/16 v23, 0x30

    const/16 v24, 0xa

    const/16 v11, 0x2d

    if-ne v6, v11, :cond_1

    if-ne v9, v11, :cond_1

    const/16 v11, 0x20

    if-eq v12, v11, :cond_0

    const/16 v11, 0x54

    if-ne v12, v11, :cond_1

    :cond_0
    const/16 v11, 0x3a

    if-ne v15, v11, :cond_1

    if-ne v10, v11, :cond_1

    goto :goto_1

    :cond_1
    const/16 v11, 0x2f

    if-ne v6, v11, :cond_4

    if-ne v9, v11, :cond_4

    const/16 v11, 0x20

    if-eq v12, v11, :cond_2

    const/16 v11, 0x54

    if-ne v12, v11, :cond_3

    :cond_2
    const/16 v11, 0x3a

    goto :goto_0

    :cond_3
    const/16 v11, 0x2f

    goto :goto_2

    :goto_0
    if-ne v15, v11, :cond_3

    if-ne v10, v11, :cond_3

    :goto_1
    move v9, v3

    move v6, v4

    move v12, v5

    move/from16 v10, v16

    move/from16 v3, v19

    move/from16 v4, v20

    move/from16 v15, v21

    move/from16 v11, v22

    move v5, v2

    move-object/from16 v16, v14

    move/from16 v2, v17

    move/from16 v14, v23

    goto/16 :goto_7

    :cond_4
    :goto_2
    if-ne v4, v11, :cond_6

    if-eq v7, v11, :cond_5

    goto :goto_4

    :cond_5
    :goto_3
    const/16 v11, 0x20

    goto :goto_5

    :cond_6
    :goto_4
    const/16 v11, 0x2e

    if-ne v4, v11, :cond_7

    if-eq v7, v11, :cond_5

    :cond_7
    const/16 v11, 0x2d

    if-ne v4, v11, :cond_8

    if-ne v7, v11, :cond_8

    goto :goto_3

    :goto_5
    if-ne v12, v11, :cond_9

    const/16 v11, 0x3a

    if-ne v15, v11, :cond_8

    if-ne v10, v11, :cond_8

    move v4, v3

    move v7, v5

    move/from16 v10, v16

    move/from16 v3, v17

    move/from16 v12, v20

    move/from16 v15, v21

    move/from16 v11, v22

    move v5, v2

    move v2, v8

    move-object/from16 v16, v14

    move/from16 v14, v23

    :goto_6
    move v8, v6

    move/from16 v6, v19

    goto/16 :goto_7

    :cond_8
    const/16 v11, 0x20

    :cond_9
    if-ne v3, v11, :cond_c

    if-ne v7, v11, :cond_c

    if-ne v12, v11, :cond_c

    const/16 v11, 0x3a

    if-ne v15, v11, :cond_b

    if-ne v10, v11, :cond_b

    .line 1183
    invoke-static {v4, v5, v6}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v3

    if-lez v3, :cond_a

    .line 1184
    div-int/lit8 v4, v3, 0xa

    add-int/lit8 v4, v4, 0x30

    int-to-char v5, v4

    .line 1185
    rem-int/lit8 v3, v3, 0xa

    add-int/lit8 v3, v3, 0x30

    int-to-char v6, v3

    move v7, v5

    move/from16 v10, v16

    move/from16 v4, v17

    move/from16 v12, v20

    move/from16 v15, v21

    move/from16 v11, v22

    move/from16 v3, v23

    move v5, v2

    move v2, v8

    move-object/from16 v16, v14

    move v14, v3

    goto :goto_6

    .line 1186
    :cond_a
    new-instance v2, Ljava/lang/String;

    const/16 v3, 0x13

    invoke-direct {v2, v0, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 1187
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v14, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_b
    const/16 v11, 0x20

    :cond_c
    if-ne v4, v11, :cond_f

    if-ne v8, v11, :cond_f

    if-ne v13, v11, :cond_f

    const/16 v11, 0x3a

    if-ne v15, v11, :cond_e

    if-ne v10, v11, :cond_e

    .line 1188
    invoke-static {v5, v6, v7}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v4

    if-lez v4, :cond_d

    .line 1189
    div-int/lit8 v5, v4, 0xa

    add-int/lit8 v5, v5, 0x30

    int-to-char v5, v5

    .line 1190
    rem-int/lit8 v4, v4, 0xa

    add-int/lit8 v4, v4, 0x30

    int-to-char v6, v4

    move v4, v3

    move v7, v5

    move v8, v6

    move/from16 v10, v16

    move/from16 v3, v17

    move/from16 v6, v20

    move/from16 v15, v21

    move/from16 v11, v22

    move/from16 v13, v23

    move v5, v2

    move v2, v9

    move-object/from16 v16, v14

    move/from16 v9, v19

    move v14, v13

    goto/16 :goto_7

    .line 1191
    :cond_d
    new-instance v2, Ljava/lang/String;

    const/16 v3, 0x13

    invoke-direct {v2, v0, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 1192
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v14, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_e
    const/16 v11, 0x20

    :cond_f
    if-ne v4, v11, :cond_12

    if-ne v8, v11, :cond_12

    if-ne v13, v11, :cond_12

    const/16 v11, 0x3a

    if-ne v2, v11, :cond_11

    if-ne v10, v11, :cond_11

    .line 1193
    invoke-static {v5, v6, v7}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v2

    if-lez v2, :cond_10

    .line 1194
    div-int/lit8 v4, v2, 0xa

    add-int/lit8 v4, v4, 0x30

    int-to-char v5, v4

    .line 1195
    rem-int/lit8 v2, v2, 0xa

    add-int/lit8 v2, v2, 0x30

    int-to-char v6, v2

    move v4, v3

    move v7, v5

    move v8, v6

    move v2, v9

    move/from16 v10, v16

    move/from16 v3, v17

    move/from16 v9, v19

    move/from16 v6, v20

    move/from16 v13, v21

    move/from16 v11, v22

    move/from16 v5, v23

    move-object/from16 v16, v14

    move v14, v5

    goto :goto_7

    .line 1196
    :cond_10
    new-instance v2, Ljava/lang/String;

    const/16 v3, 0x13

    invoke-direct {v2, v0, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 1197
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v14, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_11
    const/16 v11, 0x20

    :cond_12
    if-ne v4, v11, :cond_2d

    if-ne v8, v11, :cond_2d

    if-ne v13, v11, :cond_2d

    const/16 v11, 0x3a

    if-ne v2, v11, :cond_2d

    move/from16 v2, v22

    if-ne v2, v11, :cond_2d

    .line 1198
    invoke-static {v5, v6, v7}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v2

    if-lez v2, :cond_2c

    .line 1199
    div-int/lit8 v4, v2, 0xa

    add-int/lit8 v4, v4, 0x30

    int-to-char v5, v4

    .line 1200
    rem-int/lit8 v2, v2, 0xa

    add-int/lit8 v2, v2, 0x30

    int-to-char v6, v2

    move v4, v3

    move v7, v5

    move v8, v6

    move v2, v9

    move/from16 v5, v16

    move/from16 v3, v17

    move/from16 v9, v19

    move/from16 v6, v20

    move/from16 v13, v21

    move/from16 v11, v23

    move-object/from16 v16, v14

    move v14, v11

    :goto_7
    if-lt v2, v14, :cond_2b

    const/16 v0, 0x39

    if-gt v2, v0, :cond_2a

    if-lt v9, v14, :cond_2a

    if-gt v9, v0, :cond_2a

    if-lt v6, v14, :cond_2a

    if-gt v6, v0, :cond_2a

    if-lt v12, v14, :cond_2a

    if-gt v12, v0, :cond_2a

    sub-int/2addr v2, v14

    mul-int/lit16 v2, v2, 0x3e8

    const/16 v0, 0x64

    .line 1201
    invoke-static {v9, v14, v0, v2}, Lp/a;->z(IIII)I

    move-result v2

    move/from16 v9, v24

    invoke-static {v6, v14, v9, v2}, Lp/a;->z(IIII)I

    move-result v2

    sub-int/2addr v12, v14

    add-int/2addr v12, v2

    if-lt v7, v14, :cond_29

    const/16 v2, 0x39

    if-gt v7, v2, :cond_29

    if-lt v8, v14, :cond_29

    if-gt v8, v2, :cond_29

    sub-int/2addr v7, v14

    mul-int/2addr v7, v9

    sub-int/2addr v8, v14

    add-int/2addr v8, v7

    if-nez v8, :cond_14

    if-nez v12, :cond_13

    goto :goto_8

    :cond_13
    move-object/from16 v2, p0

    move-object/from16 v4, v16

    const/16 v3, 0x13

    const/4 v5, 0x0

    goto/16 :goto_11

    :cond_14
    :goto_8
    const/16 v2, 0xc

    if-gt v8, v2, :cond_13

    if-lt v3, v14, :cond_28

    const/16 v6, 0x39

    if-gt v3, v6, :cond_28

    if-lt v4, v14, :cond_28

    if-gt v4, v6, :cond_28

    sub-int/2addr v3, v14

    const/16 v24, 0xa

    mul-int/lit8 v3, v3, 0xa

    sub-int/2addr v4, v14

    add-int/2addr v4, v3

    const/4 v3, 0x2

    const/4 v6, 0x4

    if-eq v8, v3, :cond_16

    if-eq v8, v6, :cond_15

    const/4 v7, 0x6

    if-eq v8, v7, :cond_15

    const/16 v7, 0x9

    if-eq v8, v7, :cond_15

    const/16 v7, 0xb

    if-eq v8, v7, :cond_15

    const/16 v7, 0x1f

    goto :goto_9

    :cond_15
    const/16 v7, 0x1e

    goto :goto_9

    :cond_16
    and-int/lit8 v7, v12, 0x3

    if-nez v7, :cond_18

    .line 1202
    rem-int/lit8 v7, v12, 0x64

    if-nez v7, :cond_17

    rem-int/lit16 v7, v12, 0x190

    if-nez v7, :cond_18

    :cond_17
    const/16 v7, 0x1d

    goto :goto_9

    :cond_18
    const/16 v7, 0x1c

    :goto_9
    if-nez v4, :cond_1a

    if-nez v12, :cond_19

    goto :goto_a

    :cond_19
    move-object/from16 v2, p0

    move-object/from16 v4, v16

    const/16 v3, 0x13

    const/4 v5, 0x0

    goto/16 :goto_10

    :cond_1a
    :goto_a
    if-gt v4, v7, :cond_19

    const/16 v14, 0x30

    if-lt v13, v14, :cond_27

    const/16 v7, 0x39

    if-gt v13, v7, :cond_27

    if-lt v15, v14, :cond_27

    if-gt v15, v7, :cond_27

    sub-int/2addr v13, v14

    const/16 v24, 0xa

    mul-int/lit8 v13, v13, 0xa

    sub-int/2addr v15, v14

    add-int/2addr v15, v13

    if-lt v5, v14, :cond_26

    if-gt v5, v7, :cond_26

    if-lt v10, v14, :cond_26

    if-gt v10, v7, :cond_26

    sub-int/2addr v5, v14

    mul-int/lit8 v5, v5, 0xa

    sub-int/2addr v10, v14

    add-int/2addr v10, v5

    if-lt v11, v14, :cond_25

    if-gt v11, v7, :cond_25

    move/from16 v5, v18

    if-lt v5, v14, :cond_25

    if-gt v5, v7, :cond_25

    sub-int/2addr v11, v14

    mul-int/lit8 v11, v11, 0xa

    add-int/lit8 v14, v5, -0x30

    add-int/2addr v14, v11

    const/4 v1, 0x1

    if-nez v12, :cond_1b

    if-nez v8, :cond_1b

    if-nez v4, :cond_1b

    const/16 v12, 0x7b2

    move v4, v1

    move v8, v4

    :cond_1b
    mul-int/lit16 v5, v12, 0x16d

    add-int/lit8 v7, v12, 0x3

    .line 1203
    div-int/2addr v7, v6

    add-int/lit8 v6, v12, 0x63

    div-int/2addr v6, v0

    sub-int/2addr v7, v6

    add-int/lit16 v0, v12, 0x18f

    div-int/lit16 v0, v0, 0x190

    add-int/2addr v0, v7

    add-int/2addr v0, v5

    mul-int/lit16 v5, v8, 0x16f

    add-int/lit16 v5, v5, -0x16a

    div-int/2addr v5, v2

    add-int/2addr v5, v0

    add-int/lit8 v0, v4, -0x1

    add-int/2addr v0, v5

    int-to-long v5, v0

    if-le v8, v3, :cond_1e

    const-wide/16 v2, 0x1

    sub-long v2, v5, v2

    and-int/lit8 v0, v12, 0x3

    if-nez v0, :cond_1d

    .line 1204
    rem-int/lit8 v0, v12, 0x64

    if-nez v0, :cond_1c

    rem-int/lit16 v0, v12, 0x190

    if-nez v0, :cond_1d

    :cond_1c
    move-wide v5, v2

    goto :goto_b

    :cond_1d
    const-wide/16 v2, 0x2

    sub-long/2addr v5, v2

    :cond_1e
    :goto_b
    const-wide/32 v2, 0xafaa8

    sub-long/2addr v5, v2

    const-wide/32 v2, 0x15180

    mul-long/2addr v5, v2

    mul-int/lit16 v0, v15, 0xe10

    int-to-long v2, v0

    add-long/2addr v5, v2

    mul-int/lit8 v0, v10, 0x3c

    int-to-long v2, v0

    add-long/2addr v5, v2

    int-to-long v2, v14

    add-long/2addr v5, v2

    if-nez p2, :cond_1f

    .line 1205
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    goto :goto_c

    :cond_1f
    move-object/from16 v0, p2

    .line 1206
    :goto_c
    sget-object v2, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_ID:Ljava/time/ZoneId;

    if-eq v0, v2, :cond_21

    invoke-virtual {v0}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    move-result-object v2

    sget-object v3, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_RULES:Ljava/time/zone/ZoneRules;

    if-ne v2, v3, :cond_20

    goto :goto_d

    :cond_20
    const/4 v1, 0x0

    :cond_21
    :goto_d
    if-eqz v1, :cond_22

    const-wide/32 v1, 0x28d2bea0

    cmp-long v1, v5, v1

    if-ltz v1, :cond_22

    const/16 v11, 0x7080

    goto :goto_f

    .line 1207
    :cond_22
    sget-object v1, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    if-eq v0, v1, :cond_24

    const-string v1, "UTC"

    invoke-virtual {v0}, Ljava/time/ZoneId;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_23

    goto :goto_e

    .line 1208
    :cond_23
    invoke-static {v12, v8, v4}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    move-result-object v1

    const/4 v3, 0x0

    .line 1209
    invoke-static {v15, v10, v14, v3}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    move-result-object v2

    .line 1210
    invoke-static {v1, v2}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    move-result-object v1

    .line 1211
    invoke-virtual {v0}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/LocalDateTime;)Ljava/time/ZoneOffset;

    move-result-object v0

    .line 1212
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    move-result v11

    goto :goto_f

    :cond_24
    :goto_e
    const/4 v11, 0x0

    :goto_f
    int-to-long v0, v11

    sub-long/2addr v5, v0

    const-wide/16 v0, 0x3e8

    mul-long/2addr v5, v0

    return-wide v5

    .line 1213
    :cond_25
    new-instance v0, Ljava/lang/String;

    const/16 v3, 0x13

    move-object/from16 v2, p0

    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 1214
    new-instance v1, Ljava/time/format/DateTimeParseException;

    move-object/from16 v4, v16

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :cond_26
    move-object/from16 v2, p0

    move-object/from16 v4, v16

    const/16 v3, 0x13

    const/4 v5, 0x0

    .line 1215
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 1216
    new-instance v1, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :cond_27
    move-object/from16 v2, p0

    move-object/from16 v4, v16

    const/16 v3, 0x13

    const/4 v5, 0x0

    .line 1217
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 1218
    new-instance v1, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    .line 1219
    :goto_10
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 1220
    new-instance v1, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :cond_28
    move-object/from16 v2, p0

    move-object/from16 v4, v16

    const/16 v3, 0x13

    const/4 v5, 0x0

    .line 1221
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 1222
    new-instance v1, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    .line 1223
    :goto_11
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 1224
    new-instance v1, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :cond_29
    move-object/from16 v2, p0

    move-object/from16 v4, v16

    const/16 v3, 0x13

    const/4 v5, 0x0

    .line 1225
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 1226
    new-instance v1, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :cond_2a
    move-object/from16 v2, p0

    :goto_12
    move-object/from16 v4, v16

    goto :goto_13

    :cond_2b
    move-object v2, v0

    goto :goto_12

    .line 1227
    :goto_13
    new-instance v0, Ljava/lang/String;

    const/16 v3, 0x13

    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 1228
    new-instance v1, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :cond_2c
    move-object v2, v0

    move-object v4, v14

    const/16 v3, 0x13

    const/4 v5, 0x0

    .line 1229
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 1230
    new-instance v1, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :cond_2d
    move-object v2, v0

    move-object v4, v14

    const/16 v3, 0x13

    const/4 v5, 0x0

    .line 1231
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 1232
    new-instance v1, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1
.end method

.method public static parseMillisYMDHMS19(Ljava/lang/String;Ljava/time/ZoneId;)J
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/16 v2, 0x13

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    if-ne v1, v2, :cond_1a

    .line 16
    .line 17
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    const/4 v5, 0x2

    .line 27
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    const/4 v7, 0x3

    .line 32
    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    const/4 v8, 0x4

    .line 37
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    const/4 v10, 0x5

    .line 42
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    .line 43
    .line 44
    .line 45
    move-result v10

    .line 46
    const/4 v11, 0x6

    .line 47
    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    .line 48
    .line 49
    .line 50
    move-result v12

    .line 51
    const/4 v13, 0x7

    .line 52
    invoke-virtual {v0, v13}, Ljava/lang/String;->charAt(I)C

    .line 53
    .line 54
    .line 55
    move-result v13

    .line 56
    const/16 v14, 0x8

    .line 57
    .line 58
    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    .line 59
    .line 60
    .line 61
    move-result v14

    .line 62
    const/16 v15, 0x9

    .line 63
    .line 64
    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    const/16 v3, 0xa

    .line 69
    .line 70
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 71
    .line 72
    .line 73
    move-result v15

    .line 74
    const/16 v11, 0xb

    .line 75
    .line 76
    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    const/16 v11, 0xc

    .line 81
    .line 82
    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    const/16 v11, 0xd

    .line 87
    .line 88
    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    .line 89
    .line 90
    .line 91
    move-result v11

    .line 92
    const/16 v3, 0xe

    .line 93
    .line 94
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    move/from16 v20, v3

    .line 99
    .line 100
    const/16 v3, 0xf

    .line 101
    .line 102
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    move/from16 v21, v3

    .line 107
    .line 108
    const/16 v3, 0x10

    .line 109
    .line 110
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    move/from16 v22, v5

    .line 115
    .line 116
    const/16 v5, 0x11

    .line 117
    .line 118
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    move/from16 v23, v5

    .line 123
    .line 124
    const/16 v5, 0x12

    .line 125
    .line 126
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    const/16 v0, 0x2d

    .line 131
    .line 132
    move/from16 v24, v5

    .line 133
    .line 134
    const-string v5, "illegal input"

    .line 135
    .line 136
    if-ne v9, v0, :cond_19

    .line 137
    .line 138
    if-ne v13, v0, :cond_19

    .line 139
    .line 140
    const/16 v0, 0x20

    .line 141
    .line 142
    if-ne v15, v0, :cond_19

    .line 143
    .line 144
    const/16 v0, 0x3a

    .line 145
    .line 146
    if-ne v11, v0, :cond_19

    .line 147
    .line 148
    if-ne v3, v0, :cond_19

    .line 149
    .line 150
    const/16 v0, 0x30

    .line 151
    .line 152
    if-lt v1, v0, :cond_18

    .line 153
    .line 154
    const/16 v3, 0x39

    .line 155
    .line 156
    if-gt v1, v3, :cond_18

    .line 157
    .line 158
    if-lt v4, v0, :cond_18

    .line 159
    .line 160
    if-gt v4, v3, :cond_18

    .line 161
    .line 162
    if-lt v6, v0, :cond_18

    .line 163
    .line 164
    if-gt v6, v3, :cond_18

    .line 165
    .line 166
    if-lt v7, v0, :cond_18

    .line 167
    .line 168
    if-gt v7, v3, :cond_18

    .line 169
    .line 170
    sub-int/2addr v1, v0

    .line 171
    mul-int/lit16 v1, v1, 0x3e8

    .line 172
    .line 173
    const/16 v9, 0x64

    .line 174
    .line 175
    invoke-static {v4, v0, v9, v1}, Lp/a;->z(IIII)I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    const/16 v4, 0xa

    .line 180
    .line 181
    invoke-static {v6, v0, v4, v1}, Lp/a;->z(IIII)I

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    sub-int/2addr v7, v0

    .line 186
    add-int/2addr v7, v1

    .line 187
    if-lt v10, v0, :cond_17

    .line 188
    .line 189
    if-gt v10, v3, :cond_17

    .line 190
    .line 191
    if-lt v12, v0, :cond_17

    .line 192
    .line 193
    if-gt v12, v3, :cond_17

    .line 194
    .line 195
    sub-int/2addr v10, v0

    .line 196
    mul-int/2addr v10, v4

    .line 197
    sub-int/2addr v12, v0

    .line 198
    add-int/2addr v12, v10

    .line 199
    if-nez v12, :cond_1

    .line 200
    .line 201
    if-nez v7, :cond_2

    .line 202
    .line 203
    :cond_1
    const/16 v1, 0xc

    .line 204
    .line 205
    goto :goto_0

    .line 206
    :cond_2
    const/4 v7, 0x0

    .line 207
    move-object/from16 v1, p0

    .line 208
    .line 209
    goto/16 :goto_a

    .line 210
    .line 211
    :goto_0
    if-gt v12, v1, :cond_2

    .line 212
    .line 213
    if-lt v14, v0, :cond_16

    .line 214
    .line 215
    if-gt v14, v3, :cond_16

    .line 216
    .line 217
    if-lt v2, v0, :cond_16

    .line 218
    .line 219
    if-gt v2, v3, :cond_16

    .line 220
    .line 221
    sub-int/2addr v14, v0

    .line 222
    const/16 v19, 0xa

    .line 223
    .line 224
    mul-int/lit8 v14, v14, 0xa

    .line 225
    .line 226
    sub-int/2addr v2, v0

    .line 227
    add-int/2addr v2, v14

    .line 228
    const/4 v1, 0x2

    .line 229
    if-eq v12, v1, :cond_4

    .line 230
    .line 231
    const/4 v1, 0x4

    .line 232
    if-eq v12, v1, :cond_3

    .line 233
    .line 234
    const/4 v1, 0x6

    .line 235
    if-eq v12, v1, :cond_3

    .line 236
    .line 237
    const/16 v1, 0x9

    .line 238
    .line 239
    if-eq v12, v1, :cond_3

    .line 240
    .line 241
    const/16 v1, 0xb

    .line 242
    .line 243
    if-eq v12, v1, :cond_3

    .line 244
    .line 245
    const/16 v1, 0x1f

    .line 246
    .line 247
    goto :goto_1

    .line 248
    :cond_3
    const/16 v1, 0x1e

    .line 249
    .line 250
    goto :goto_1

    .line 251
    :cond_4
    and-int/lit8 v1, v7, 0x3

    .line 252
    .line 253
    if-nez v1, :cond_6

    .line 254
    .line 255
    rem-int/lit8 v1, v7, 0x64

    .line 256
    .line 257
    if-nez v1, :cond_5

    .line 258
    .line 259
    rem-int/lit16 v1, v7, 0x190

    .line 260
    .line 261
    if-nez v1, :cond_6

    .line 262
    .line 263
    :cond_5
    const/16 v1, 0x1d

    .line 264
    .line 265
    goto :goto_1

    .line 266
    :cond_6
    const/16 v1, 0x1c

    .line 267
    .line 268
    :goto_1
    if-nez v2, :cond_8

    .line 269
    .line 270
    if-nez v7, :cond_7

    .line 271
    .line 272
    goto :goto_2

    .line 273
    :cond_7
    const/4 v7, 0x0

    .line 274
    move-object/from16 v1, p0

    .line 275
    .line 276
    goto/16 :goto_9

    .line 277
    .line 278
    :cond_8
    :goto_2
    if-gt v2, v1, :cond_7

    .line 279
    .line 280
    if-lt v8, v0, :cond_15

    .line 281
    .line 282
    if-gt v8, v3, :cond_15

    .line 283
    .line 284
    move/from16 v1, v22

    .line 285
    .line 286
    if-lt v1, v0, :cond_15

    .line 287
    .line 288
    if-gt v1, v3, :cond_15

    .line 289
    .line 290
    sub-int/2addr v8, v0

    .line 291
    const/16 v19, 0xa

    .line 292
    .line 293
    mul-int/lit8 v8, v8, 0xa

    .line 294
    .line 295
    sub-int/2addr v1, v0

    .line 296
    add-int/2addr v1, v8

    .line 297
    move/from16 v4, v20

    .line 298
    .line 299
    if-lt v4, v0, :cond_14

    .line 300
    .line 301
    if-gt v4, v3, :cond_14

    .line 302
    .line 303
    move/from16 v6, v21

    .line 304
    .line 305
    if-lt v6, v0, :cond_14

    .line 306
    .line 307
    if-gt v6, v3, :cond_14

    .line 308
    .line 309
    sub-int/2addr v4, v0

    .line 310
    mul-int/lit8 v4, v4, 0xa

    .line 311
    .line 312
    sub-int/2addr v6, v0

    .line 313
    add-int/2addr v6, v4

    .line 314
    move/from16 v4, v23

    .line 315
    .line 316
    if-lt v4, v0, :cond_13

    .line 317
    .line 318
    if-gt v4, v3, :cond_13

    .line 319
    .line 320
    move/from16 v8, v24

    .line 321
    .line 322
    if-lt v8, v0, :cond_13

    .line 323
    .line 324
    if-gt v8, v3, :cond_13

    .line 325
    .line 326
    add-int/lit8 v5, v4, -0x30

    .line 327
    .line 328
    mul-int/lit8 v5, v5, 0xa

    .line 329
    .line 330
    add-int/lit8 v0, v8, -0x30

    .line 331
    .line 332
    add-int/2addr v0, v5

    .line 333
    if-nez v7, :cond_9

    .line 334
    .line 335
    if-nez v12, :cond_9

    .line 336
    .line 337
    if-nez v2, :cond_9

    .line 338
    .line 339
    const/16 v7, 0x7b2

    .line 340
    .line 341
    const/4 v2, 0x1

    .line 342
    const/4 v12, 0x1

    .line 343
    :cond_9
    mul-int/lit16 v3, v7, 0x16d

    .line 344
    .line 345
    add-int/lit8 v4, v7, 0x3

    .line 346
    .line 347
    const/16 v17, 0x4

    .line 348
    .line 349
    div-int/lit8 v4, v4, 0x4

    .line 350
    .line 351
    add-int/lit8 v5, v7, 0x63

    .line 352
    .line 353
    div-int/2addr v5, v9

    .line 354
    sub-int/2addr v4, v5

    .line 355
    add-int/lit16 v5, v7, 0x18f

    .line 356
    .line 357
    div-int/lit16 v5, v5, 0x190

    .line 358
    .line 359
    add-int/2addr v5, v4

    .line 360
    add-int/2addr v5, v3

    .line 361
    mul-int/lit16 v3, v12, 0x16f

    .line 362
    .line 363
    add-int/lit16 v3, v3, -0x16a

    .line 364
    .line 365
    const/16 v18, 0xc

    .line 366
    .line 367
    div-int/lit8 v3, v3, 0xc

    .line 368
    .line 369
    add-int/2addr v3, v5

    .line 370
    add-int/lit8 v4, v2, -0x1

    .line 371
    .line 372
    add-int/2addr v4, v3

    .line 373
    int-to-long v3, v4

    .line 374
    const/4 v5, 0x2

    .line 375
    if-le v12, v5, :cond_c

    .line 376
    .line 377
    const-wide/16 v8, 0x1

    .line 378
    .line 379
    sub-long v8, v3, v8

    .line 380
    .line 381
    and-int/lit8 v5, v7, 0x3

    .line 382
    .line 383
    if-nez v5, :cond_b

    .line 384
    .line 385
    rem-int/lit8 v5, v7, 0x64

    .line 386
    .line 387
    if-nez v5, :cond_a

    .line 388
    .line 389
    rem-int/lit16 v5, v7, 0x190

    .line 390
    .line 391
    if-nez v5, :cond_b

    .line 392
    .line 393
    :cond_a
    move-wide v3, v8

    .line 394
    goto :goto_3

    .line 395
    :cond_b
    const-wide/16 v8, 0x2

    .line 396
    .line 397
    sub-long/2addr v3, v8

    .line 398
    :cond_c
    :goto_3
    const-wide/32 v8, 0xafaa8

    .line 399
    .line 400
    .line 401
    sub-long/2addr v3, v8

    .line 402
    const-wide/32 v8, 0x15180

    .line 403
    .line 404
    .line 405
    mul-long/2addr v3, v8

    .line 406
    mul-int/lit16 v5, v1, 0xe10

    .line 407
    .line 408
    int-to-long v8, v5

    .line 409
    add-long/2addr v3, v8

    .line 410
    mul-int/lit8 v5, v6, 0x3c

    .line 411
    .line 412
    int-to-long v8, v5

    .line 413
    add-long/2addr v3, v8

    .line 414
    int-to-long v8, v0

    .line 415
    add-long/2addr v3, v8

    .line 416
    if-nez p1, :cond_d

    .line 417
    .line 418
    sget-object v5, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 419
    .line 420
    goto :goto_4

    .line 421
    :cond_d
    move-object/from16 v5, p1

    .line 422
    .line 423
    :goto_4
    sget-object v8, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_ID:Ljava/time/ZoneId;

    .line 424
    .line 425
    if-eq v5, v8, :cond_f

    .line 426
    .line 427
    invoke-virtual {v5}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 428
    .line 429
    .line 430
    move-result-object v8

    .line 431
    sget-object v9, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_RULES:Ljava/time/zone/ZoneRules;

    .line 432
    .line 433
    if-ne v8, v9, :cond_e

    .line 434
    .line 435
    goto :goto_5

    .line 436
    :cond_e
    const/16 v16, 0x0

    .line 437
    .line 438
    goto :goto_6

    .line 439
    :cond_f
    :goto_5
    const/16 v16, 0x1

    .line 440
    .line 441
    :goto_6
    if-eqz v16, :cond_10

    .line 442
    .line 443
    const-wide/32 v8, 0x28d2bea0

    .line 444
    .line 445
    .line 446
    cmp-long v8, v3, v8

    .line 447
    .line 448
    if-ltz v8, :cond_10

    .line 449
    .line 450
    const/16 v0, 0x7080

    .line 451
    .line 452
    goto :goto_8

    .line 453
    :cond_10
    sget-object v8, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 454
    .line 455
    if-eq v5, v8, :cond_12

    .line 456
    .line 457
    const-string v8, "UTC"

    .line 458
    .line 459
    invoke-virtual {v5}, Ljava/time/ZoneId;->getId()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v9

    .line 463
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    move-result v8

    .line 467
    if-eqz v8, :cond_11

    .line 468
    .line 469
    goto :goto_7

    .line 470
    :cond_11
    invoke-static {v7, v12, v2}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 471
    .line 472
    .line 473
    move-result-object v2

    .line 474
    const/4 v7, 0x0

    .line 475
    invoke-static {v1, v6, v0, v7}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    invoke-static {v2, v0}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    invoke-virtual {v5}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    invoke-virtual {v1, v0}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/LocalDateTime;)Ljava/time/ZoneOffset;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 492
    .line 493
    .line 494
    move-result v0

    .line 495
    goto :goto_8

    .line 496
    :cond_12
    :goto_7
    const/4 v0, 0x0

    .line 497
    :goto_8
    int-to-long v0, v0

    .line 498
    sub-long/2addr v3, v0

    .line 499
    const-wide/16 v0, 0x3e8

    .line 500
    .line 501
    mul-long/2addr v3, v0

    .line 502
    return-wide v3

    .line 503
    :cond_13
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 504
    .line 505
    const/4 v7, 0x0

    .line 506
    move-object/from16 v1, p0

    .line 507
    .line 508
    invoke-direct {v0, v5, v1, v7}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 509
    .line 510
    .line 511
    throw v0

    .line 512
    :cond_14
    const/4 v7, 0x0

    .line 513
    move-object/from16 v1, p0

    .line 514
    .line 515
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 516
    .line 517
    invoke-direct {v0, v5, v1, v7}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 518
    .line 519
    .line 520
    throw v0

    .line 521
    :cond_15
    const/4 v7, 0x0

    .line 522
    move-object/from16 v1, p0

    .line 523
    .line 524
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 525
    .line 526
    invoke-direct {v0, v5, v1, v7}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 527
    .line 528
    .line 529
    throw v0

    .line 530
    :goto_9
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 531
    .line 532
    invoke-direct {v0, v5, v1, v7}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 533
    .line 534
    .line 535
    throw v0

    .line 536
    :cond_16
    const/4 v7, 0x0

    .line 537
    move-object/from16 v1, p0

    .line 538
    .line 539
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 540
    .line 541
    invoke-direct {v0, v5, v1, v7}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 542
    .line 543
    .line 544
    throw v0

    .line 545
    :goto_a
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 546
    .line 547
    invoke-direct {v0, v5, v1, v7}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 548
    .line 549
    .line 550
    throw v0

    .line 551
    :cond_17
    const/4 v7, 0x0

    .line 552
    move-object/from16 v1, p0

    .line 553
    .line 554
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 555
    .line 556
    invoke-direct {v0, v5, v1, v7}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 557
    .line 558
    .line 559
    throw v0

    .line 560
    :cond_18
    const/4 v7, 0x0

    .line 561
    move-object/from16 v1, p0

    .line 562
    .line 563
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 564
    .line 565
    invoke-direct {v0, v5, v1, v7}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 566
    .line 567
    .line 568
    throw v0

    .line 569
    :cond_19
    const/4 v7, 0x0

    .line 570
    move-object/from16 v1, p0

    .line 571
    .line 572
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 573
    .line 574
    invoke-direct {v0, v5, v1, v7}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 575
    .line 576
    .line 577
    throw v0

    .line 578
    :cond_1a
    move-object v1, v0

    .line 579
    move v7, v3

    .line 580
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 581
    .line 582
    const-string v2, "illegal input "

    .line 583
    .line 584
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 585
    .line 586
    .line 587
    move-result-object v2

    .line 588
    invoke-direct {v0, v2, v1, v7}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 589
    .line 590
    .line 591
    throw v0
.end method

.method public static parseZonedDateTime(Ljava/lang/String;)Ljava/time/ZonedDateTime;
    .locals 1

    .line 147
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/DateUtils;->parseZonedDateTime(Ljava/lang/String;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object p0

    return-object p0
.end method

.method public static parseZonedDateTime(Ljava/lang/String;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 137
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_1

    return-object v0

    .line 138
    :cond_1
    sget v1, Lcom/alibaba/fastjson2/util/JDKUtils;->ANDROID_SDK_INT:I

    const/16 v2, 0x22

    const/4 v3, 0x0

    if-lt v1, v2, :cond_2

    .line 139
    sget-object v1, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    .line 140
    array-length v2, v1

    invoke-static {v1, v3, v2, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseZonedDateTime([BIILjava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object p1

    goto :goto_0

    .line 141
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    .line 142
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v2

    array-length v1, v1

    invoke-static {v2, v3, v1, p1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseZonedDateTime([CIILjava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object p1

    :goto_0
    if-nez p1, :cond_6

    .line 143
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p1

    const/4 v1, -0x1

    sparse-switch p1, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string p1, "0000-00-00"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v1, 0x2

    goto :goto_1

    :sswitch_1
    const-string p1, "null"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    const/4 v1, 0x1

    goto :goto_1

    :sswitch_2
    const-string p1, "0"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_1

    :cond_5
    move v1, v3

    :goto_1
    packed-switch v1, :pswitch_data_0

    .line 144
    new-instance p1, Ljava/time/format/DateTimeParseException;

    invoke-direct {p1, p0, p0, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw p1

    :pswitch_0
    return-object v0

    :cond_6
    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        0x30 -> :sswitch_2
        0x33c587 -> :sswitch_1
        0x4f8288e0 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static parseZonedDateTime([BII)Ljava/time/ZonedDateTime;
    .locals 1

    .line 145
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    invoke-static {p0, p1, p2, v0}, Lcom/alibaba/fastjson2/util/DateUtils;->parseZonedDateTime([BIILjava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object p0

    return-object p0
.end method

.method public static parseZonedDateTime([BIILjava/time/ZoneId;)Ljava/time/ZonedDateTime;
    .locals 60

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    const/4 v4, 0x0

    if-nez v0, :cond_0

    return-object v4

    :cond_0
    if-nez v2, :cond_1

    return-object v4

    :cond_1
    const/16 v5, 0x10

    if-ne v2, v5, :cond_2

    .line 1
    invoke-static {v0, v1, v3}, Lcom/alibaba/fastjson2/util/DateUtils;->parseZonedDateTime16([BILjava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object v0

    return-object v0

    :cond_2
    const/16 v5, 0x13

    if-ge v2, v5, :cond_3

    return-object v4

    .line 2
    :cond_3
    aget-byte v6, v0, v1

    int-to-char v6, v6

    add-int/lit8 v7, v1, 0x1

    .line 3
    aget-byte v7, v0, v7

    int-to-char v7, v7

    add-int/lit8 v8, v1, 0x2

    .line 4
    aget-byte v8, v0, v8

    int-to-char v8, v8

    add-int/lit8 v9, v1, 0x3

    .line 5
    aget-byte v9, v0, v9

    int-to-char v10, v9

    add-int/lit8 v11, v1, 0x4

    .line 6
    aget-byte v11, v0, v11

    int-to-char v11, v11

    add-int/lit8 v12, v1, 0x5

    .line 7
    aget-byte v12, v0, v12

    int-to-char v12, v12

    add-int/lit8 v13, v1, 0x6

    .line 8
    aget-byte v13, v0, v13

    int-to-char v13, v13

    add-int/lit8 v14, v1, 0x7

    .line 9
    aget-byte v14, v0, v14

    int-to-char v14, v14

    add-int/lit8 v15, v1, 0x8

    .line 10
    aget-byte v15, v0, v15

    int-to-char v15, v15

    add-int/lit8 v16, v1, 0x9

    move-object/from16 v17, v4

    .line 11
    aget-byte v4, v0, v16

    int-to-char v4, v4

    add-int/lit8 v16, v1, 0xa

    .line 12
    aget-byte v5, v0, v16

    int-to-char v5, v5

    add-int/lit8 v16, v1, 0xb

    move/from16 v19, v9

    .line 13
    aget-byte v9, v0, v16

    int-to-char v9, v9

    add-int/lit8 v16, v1, 0xc

    .line 14
    aget-byte v1, v0, v16

    int-to-char v1, v1

    add-int/lit8 v16, p1, 0xd

    .line 15
    aget-byte v3, v0, v16

    int-to-char v3, v3

    add-int/lit8 v16, p1, 0xe

    move/from16 v20, v4

    .line 16
    aget-byte v4, v0, v16

    int-to-char v4, v4

    add-int/lit8 v16, p1, 0xf

    move/from16 v21, v15

    .line 17
    aget-byte v15, v0, v16

    int-to-char v15, v15

    add-int/lit8 v16, p1, 0x10

    .line 18
    aget-byte v0, p0, v16

    int-to-char v0, v0

    add-int/lit8 v16, p1, 0x11

    move/from16 v22, v15

    .line 19
    aget-byte v15, p0, v16

    int-to-char v15, v15

    add-int/lit8 v16, p1, 0x12

    move/from16 v23, v1

    .line 20
    aget-byte v1, p0, v16

    int-to-char v1, v1

    move/from16 v16, v1

    const/16 v1, 0x13

    if-ne v2, v1, :cond_4

    const/16 v1, 0x20

    goto :goto_0

    :cond_4
    add-int/lit8 v18, p1, 0x13

    .line 21
    aget-byte v1, p0, v18

    int-to-char v1, v1

    :goto_0
    const/16 v18, 0x0

    const/16 v25, 0x30

    packed-switch v2, :pswitch_data_0

    add-int/lit8 v26, p1, 0x14

    move/from16 v27, v6

    .line 22
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x15

    move/from16 v28, v6

    .line 23
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x16

    move/from16 v29, v6

    .line 24
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x17

    move/from16 v30, v6

    .line 25
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x18

    move/from16 v31, v6

    .line 26
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x19

    move/from16 v32, v6

    .line 27
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x1a

    move/from16 v33, v6

    .line 28
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x1b

    move/from16 v34, v6

    .line 29
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x1c

    move/from16 v35, v6

    .line 30
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x1d

    move/from16 v36, v6

    .line 31
    aget-byte v6, p0, v26

    int-to-char v6, v6

    move/from16 v44, v6

    move/from16 v26, v7

    move/from16 v37, v28

    move/from16 v6, v29

    move/from16 v28, v30

    move/from16 v38, v31

    move/from16 v39, v32

    move/from16 v40, v33

    move/from16 v41, v34

    move/from16 v42, v35

    move/from16 v43, v36

    goto/16 :goto_2

    :pswitch_0
    move/from16 v27, v6

    add-int/lit8 v6, p1, 0x14

    .line 32
    aget-byte v6, p0, v6

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x15

    move/from16 v28, v6

    .line 33
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x16

    move/from16 v29, v6

    .line 34
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x17

    move/from16 v30, v6

    .line 35
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x18

    move/from16 v31, v6

    .line 36
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x19

    move/from16 v32, v6

    .line 37
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x1a

    move/from16 v33, v6

    .line 38
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x1b

    move/from16 v34, v6

    .line 39
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x1c

    move/from16 v35, v6

    .line 40
    aget-byte v6, p0, v26

    int-to-char v6, v6

    move/from16 v43, v6

    move/from16 v26, v7

    move/from16 v44, v18

    move/from16 v37, v28

    move/from16 v6, v29

    move/from16 v28, v30

    move/from16 v38, v31

    move/from16 v39, v32

    move/from16 v40, v33

    move/from16 v41, v34

    move/from16 v42, v35

    goto/16 :goto_2

    :pswitch_1
    move/from16 v27, v6

    add-int/lit8 v6, p1, 0x14

    .line 41
    aget-byte v6, p0, v6

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x15

    move/from16 v28, v6

    .line 42
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x16

    move/from16 v29, v6

    .line 43
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x17

    move/from16 v30, v6

    .line 44
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x18

    move/from16 v31, v6

    .line 45
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x19

    move/from16 v32, v6

    .line 46
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x1a

    move/from16 v33, v6

    .line 47
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x1b

    move/from16 v34, v6

    .line 48
    aget-byte v6, p0, v26

    int-to-char v6, v6

    move/from16 v42, v6

    move/from16 v26, v7

    move/from16 v44, v18

    move/from16 v43, v25

    move/from16 v37, v28

    move/from16 v6, v29

    move/from16 v28, v30

    move/from16 v38, v31

    move/from16 v39, v32

    move/from16 v40, v33

    move/from16 v41, v34

    goto/16 :goto_2

    :pswitch_2
    move/from16 v27, v6

    add-int/lit8 v6, p1, 0x14

    .line 49
    aget-byte v6, p0, v6

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x15

    move/from16 v28, v6

    .line 50
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x16

    move/from16 v29, v6

    .line 51
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x17

    move/from16 v30, v6

    .line 52
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x18

    move/from16 v31, v6

    .line 53
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x19

    move/from16 v32, v6

    .line 54
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x1a

    move/from16 v33, v6

    .line 55
    aget-byte v6, p0, v26

    int-to-char v6, v6

    move/from16 v41, v6

    move/from16 v26, v7

    move/from16 v44, v18

    move/from16 v42, v25

    move/from16 v43, v42

    move/from16 v37, v28

    move/from16 v6, v29

    move/from16 v28, v30

    move/from16 v38, v31

    move/from16 v39, v32

    move/from16 v40, v33

    goto/16 :goto_2

    :pswitch_3
    move/from16 v27, v6

    add-int/lit8 v6, p1, 0x14

    .line 56
    aget-byte v6, p0, v6

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x15

    move/from16 v28, v6

    .line 57
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x16

    move/from16 v29, v6

    .line 58
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x17

    move/from16 v30, v6

    .line 59
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x18

    move/from16 v31, v6

    .line 60
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x19

    move/from16 v32, v6

    .line 61
    aget-byte v6, p0, v26

    int-to-char v6, v6

    move/from16 v40, v6

    move/from16 v26, v7

    move/from16 v44, v18

    move/from16 v41, v25

    move/from16 v42, v41

    move/from16 v43, v42

    move/from16 v37, v28

    move/from16 v6, v29

    move/from16 v28, v30

    move/from16 v38, v31

    move/from16 v39, v32

    goto/16 :goto_2

    :pswitch_4
    move/from16 v27, v6

    add-int/lit8 v6, p1, 0x14

    .line 62
    aget-byte v6, p0, v6

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x15

    move/from16 v28, v6

    .line 63
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x16

    move/from16 v29, v6

    .line 64
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x17

    move/from16 v30, v6

    .line 65
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x18

    move/from16 v31, v6

    .line 66
    aget-byte v6, p0, v26

    int-to-char v6, v6

    move/from16 v39, v6

    move/from16 v26, v7

    move/from16 v44, v18

    move/from16 v40, v25

    move/from16 v41, v40

    move/from16 v42, v41

    move/from16 v43, v42

    move/from16 v37, v28

    move/from16 v6, v29

    move/from16 v28, v30

    move/from16 v38, v31

    goto/16 :goto_2

    :pswitch_5
    move/from16 v27, v6

    add-int/lit8 v6, p1, 0x14

    .line 67
    aget-byte v6, p0, v6

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x15

    move/from16 v28, v6

    .line 68
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x16

    move/from16 v29, v6

    .line 69
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x17

    move/from16 v30, v6

    .line 70
    aget-byte v6, p0, v26

    int-to-char v6, v6

    move/from16 v38, v6

    move/from16 v26, v7

    move/from16 v44, v18

    move/from16 v39, v25

    move/from16 v40, v39

    move/from16 v41, v40

    move/from16 v42, v41

    move/from16 v43, v42

    move/from16 v37, v28

    move/from16 v6, v29

    move/from16 v28, v30

    goto/16 :goto_2

    :pswitch_6
    move/from16 v27, v6

    add-int/lit8 v6, p1, 0x14

    .line 71
    aget-byte v6, p0, v6

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x15

    move/from16 v28, v6

    .line 72
    aget-byte v6, p0, v26

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x16

    move/from16 v29, v6

    .line 73
    aget-byte v6, p0, v26

    int-to-char v6, v6

    move/from16 v26, v7

    move/from16 v44, v18

    move/from16 v38, v25

    move/from16 v39, v38

    move/from16 v40, v39

    move/from16 v41, v40

    move/from16 v42, v41

    move/from16 v43, v42

    move/from16 v37, v28

    move/from16 v28, v6

    move/from16 v6, v29

    goto :goto_2

    :pswitch_7
    move/from16 v27, v6

    add-int/lit8 v6, p1, 0x14

    .line 74
    aget-byte v6, p0, v6

    int-to-char v6, v6

    add-int/lit8 v26, p1, 0x15

    move/from16 v28, v6

    .line 75
    aget-byte v6, p0, v26

    int-to-char v6, v6

    move/from16 v26, v7

    move/from16 v44, v18

    move/from16 v38, v25

    move/from16 v39, v38

    move/from16 v40, v39

    move/from16 v41, v40

    move/from16 v42, v41

    move/from16 v43, v42

    move/from16 v37, v28

    move/from16 v28, v43

    goto :goto_2

    :pswitch_8
    move/from16 v27, v6

    add-int/lit8 v6, p1, 0x14

    .line 76
    aget-byte v6, p0, v6

    int-to-char v6, v6

    move/from16 v37, v6

    move/from16 v26, v7

    move/from16 v44, v18

    :goto_1
    move/from16 v6, v25

    move/from16 v28, v6

    move/from16 v38, v28

    move/from16 v39, v38

    move/from16 v40, v39

    move/from16 v41, v40

    move/from16 v42, v41

    move/from16 v43, v42

    goto :goto_2

    :pswitch_9
    move/from16 v27, v6

    move/from16 v26, v7

    move/from16 v37, v18

    move/from16 v44, v37

    goto :goto_1

    :goto_2
    const/16 v32, 0x1

    const/16 v7, 0x2d

    move/from16 v34, v6

    const/16 v6, 0x3a

    if-ne v11, v7, :cond_7

    if-ne v14, v7, :cond_7

    const/16 v7, 0x20

    if-eq v5, v7, :cond_5

    const/16 v7, 0x54

    if-ne v5, v7, :cond_7

    :cond_5
    if-ne v3, v6, :cond_7

    if-ne v0, v6, :cond_7

    const/16 v7, 0x5b

    if-eq v1, v7, :cond_6

    const/16 v7, 0x5a

    if-eq v1, v7, :cond_6

    const/16 v7, 0x2b

    if-eq v1, v7, :cond_6

    const/16 v7, 0x2d

    if-eq v1, v7, :cond_6

    const/16 v7, 0x20

    if-ne v1, v7, :cond_7

    :cond_6
    move-object/from16 v11, p0

    move/from16 v46, v4

    move/from16 v38, v8

    move/from16 v39, v10

    move/from16 v40, v12

    move/from16 v41, v13

    move/from16 v48, v15

    move/from16 v49, v16

    move-object/from16 v3, v17

    move/from16 v0, v18

    move v1, v0

    move/from16 v43, v20

    move/from16 v42, v21

    move/from16 v47, v22

    move/from16 v4, v23

    move/from16 v50, v25

    move/from16 v51, v50

    move/from16 v52, v51

    move/from16 v53, v52

    move/from16 v54, v53

    move/from16 v55, v54

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v37, v26

    move/from16 v36, v27

    const/16 v5, 0x13

    move v15, v9

    goto/16 :goto_7d

    :cond_7
    const/16 v7, 0x2d

    if-ne v11, v7, :cond_8

    if-ne v14, v7, :cond_8

    const/16 v7, 0x20

    if-ne v5, v7, :cond_8

    if-ne v9, v7, :cond_8

    if-ne v4, v6, :cond_8

    if-ne v15, v6, :cond_8

    const/16 v7, 0x14

    if-ne v2, v7, :cond_9

    move-object/from16 v11, p0

    move/from16 v47, v0

    move/from16 v49, v1

    move v4, v3

    move v5, v7

    move/from16 v38, v8

    move/from16 v39, v10

    move/from16 v40, v12

    move/from16 v41, v13

    move/from16 v48, v16

    move-object/from16 v3, v17

    move/from16 v0, v18

    move v1, v0

    move/from16 v43, v20

    move/from16 v42, v21

    move/from16 v46, v22

    move/from16 v15, v23

    move/from16 v50, v25

    move/from16 v51, v50

    move/from16 v52, v51

    move/from16 v53, v52

    move/from16 v54, v53

    move/from16 v55, v54

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v37, v26

    move/from16 v36, v27

    goto/16 :goto_7d

    :cond_8
    const/16 v7, 0x14

    :cond_9
    if-ne v2, v7, :cond_b

    const/16 v7, 0x20

    if-ne v8, v7, :cond_b

    if-ne v13, v7, :cond_b

    if-ne v9, v7, :cond_b

    if-ne v4, v6, :cond_b

    if-ne v15, v6, :cond_b

    .line 77
    invoke-static {v10, v11, v12}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v4

    if-lez v4, :cond_a

    .line 78
    div-int/lit8 v6, v4, 0xa

    add-int/lit8 v6, v6, 0x30

    int-to-char v6, v6

    .line 79
    rem-int/lit8 v4, v4, 0xa

    add-int/lit8 v4, v4, 0x30

    int-to-char v4, v4

    goto :goto_3

    :cond_a
    move/from16 v4, v25

    move v6, v4

    :goto_3
    move-object/from16 v11, p0

    move/from16 v47, v0

    move/from16 v49, v1

    move/from16 v41, v4

    move/from16 v39, v5

    move/from16 v40, v6

    move/from16 v36, v14

    move/from16 v48, v16

    move/from16 v0, v18

    move v1, v0

    move/from16 v38, v20

    move/from16 v37, v21

    move/from16 v46, v22

    move/from16 v15, v23

    move/from16 v50, v25

    move/from16 v51, v50

    move/from16 v52, v51

    move/from16 v53, v52

    move/from16 v54, v53

    move/from16 v55, v54

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v43, v26

    move/from16 v42, v27

    const/16 v5, 0x14

    move v4, v3

    move-object/from16 v3, v17

    goto/16 :goto_7d

    :cond_b
    const/16 v7, 0x2d

    if-ne v11, v7, :cond_c

    if-ne v14, v7, :cond_c

    const/16 v7, 0x20

    if-eq v5, v7, :cond_d

    const/16 v7, 0x54

    if-ne v5, v7, :cond_c

    goto :goto_4

    :cond_c
    move/from16 v7, v34

    goto/16 :goto_9

    :cond_d
    :goto_4
    if-ne v3, v6, :cond_c

    if-ne v0, v6, :cond_c

    const/16 v7, 0x2e

    if-ne v1, v7, :cond_c

    const/16 v7, 0x15

    if-eq v2, v7, :cond_f

    move/from16 v7, v34

    const/16 v6, 0x5b

    if-eq v7, v6, :cond_e

    const/16 v6, 0x2b

    if-eq v7, v6, :cond_e

    const/16 v6, 0x2d

    if-eq v7, v6, :cond_e

    const/16 v6, 0x5a

    if-ne v7, v6, :cond_11

    :cond_e
    :goto_5
    const/16 v0, 0x7c

    goto :goto_6

    :cond_f
    move/from16 v7, v34

    goto :goto_5

    :goto_6
    if-ne v7, v0, :cond_10

    move/from16 v0, v32

    goto :goto_7

    :cond_10
    move/from16 v0, v18

    :goto_7
    move-object/from16 v11, p0

    move v1, v0

    move/from16 v46, v4

    move/from16 v38, v8

    move/from16 v39, v10

    move/from16 v40, v12

    move/from16 v41, v13

    move/from16 v48, v15

    move/from16 v49, v16

    move-object/from16 v3, v17

    move/from16 v0, v18

    move/from16 v43, v20

    move/from16 v42, v21

    move/from16 v47, v22

    move/from16 v4, v23

    move/from16 v51, v25

    move/from16 v52, v51

    move/from16 v53, v52

    move/from16 v54, v53

    move/from16 v55, v54

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v36, v27

    move/from16 v50, v37

    const/16 v5, 0x15

    :goto_8
    move v15, v9

    move/from16 v37, v26

    goto/16 :goto_7d

    :cond_11
    :goto_9
    const/16 v6, 0x2d

    if-ne v11, v6, :cond_13

    if-ne v14, v6, :cond_13

    const/16 v6, 0x20

    if-eq v5, v6, :cond_12

    const/16 v6, 0x54

    if-ne v5, v6, :cond_13

    :cond_12
    const/16 v6, 0x3a

    goto :goto_a

    :cond_13
    move/from16 v6, v28

    move/from16 v28, v4

    goto/16 :goto_e

    :goto_a
    if-ne v3, v6, :cond_13

    if-ne v0, v6, :cond_13

    const/16 v6, 0x2e

    if-ne v1, v6, :cond_13

    const/16 v6, 0x16

    if-eq v2, v6, :cond_15

    move/from16 v6, v28

    move/from16 v28, v4

    const/16 v4, 0x5b

    if-eq v6, v4, :cond_14

    const/16 v4, 0x2b

    if-eq v6, v4, :cond_14

    const/16 v4, 0x2d

    if-eq v6, v4, :cond_14

    const/16 v4, 0x5a

    if-ne v6, v4, :cond_17

    :cond_14
    :goto_b
    const/16 v0, 0x7c

    goto :goto_c

    :cond_15
    move/from16 v6, v28

    move/from16 v28, v4

    goto :goto_b

    :goto_c
    if-ne v6, v0, :cond_16

    move/from16 v0, v32

    goto :goto_d

    :cond_16
    move/from16 v0, v18

    :goto_d
    move-object/from16 v11, p0

    move v1, v0

    move/from16 v51, v7

    move/from16 v38, v8

    move/from16 v39, v10

    move/from16 v40, v12

    move/from16 v41, v13

    move/from16 v48, v15

    move/from16 v49, v16

    move-object/from16 v3, v17

    move/from16 v0, v18

    move/from16 v43, v20

    move/from16 v42, v21

    move/from16 v47, v22

    move/from16 v4, v23

    move/from16 v52, v25

    move/from16 v53, v52

    move/from16 v54, v53

    move/from16 v55, v54

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v36, v27

    move/from16 v46, v28

    move/from16 v50, v37

    const/16 v5, 0x16

    goto :goto_8

    :cond_17
    :goto_e
    const/16 v4, 0x2d

    if-ne v11, v4, :cond_19

    if-ne v14, v4, :cond_19

    const/16 v4, 0x20

    if-eq v5, v4, :cond_18

    const/16 v4, 0x54

    if-ne v5, v4, :cond_19

    :cond_18
    const/16 v4, 0x3a

    if-ne v3, v4, :cond_19

    const/16 v4, 0x5a

    if-ne v0, v4, :cond_19

    const/16 v4, 0x5b

    if-ne v15, v4, :cond_19

    const/16 v4, 0x5d

    if-ne v7, v4, :cond_19

    const/16 v4, 0x16

    if-ne v2, v4, :cond_19

    move-object/from16 v11, p0

    move/from16 v38, v8

    move v15, v9

    move/from16 v39, v10

    move/from16 v40, v12

    move/from16 v41, v13

    move-object/from16 v3, v17

    move/from16 v0, v18

    move/from16 v43, v20

    move/from16 v42, v21

    move/from16 v47, v22

    move/from16 v4, v23

    move/from16 v48, v25

    move/from16 v49, v48

    move/from16 v50, v49

    move/from16 v51, v50

    move/from16 v52, v51

    move/from16 v53, v52

    move/from16 v54, v53

    move/from16 v55, v54

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v37, v26

    move/from16 v36, v27

    move/from16 v46, v28

    move/from16 v1, v32

    :goto_f
    const/16 v5, 0x11

    goto/16 :goto_7d

    :cond_19
    const/16 v4, 0x16

    if-ne v2, v4, :cond_20

    const/16 v4, 0x20

    if-ne v10, v4, :cond_20

    move/from16 v52, v11

    const/16 v11, 0x2c

    if-ne v12, v11, :cond_1f

    if-ne v13, v4, :cond_1f

    if-ne v9, v4, :cond_1f

    const/16 v11, 0x3a

    if-ne v3, v11, :cond_1f

    if-ne v0, v11, :cond_1f

    if-ne v1, v4, :cond_1f

    move/from16 v4, v37

    const/16 v11, 0x41

    if-eq v4, v11, :cond_1a

    const/16 v11, 0x50

    if-ne v4, v11, :cond_1b

    :cond_1a
    const/16 v11, 0x4d

    goto :goto_11

    :cond_1b
    move/from16 v11, v26

    move/from16 v26, v14

    move v14, v11

    :goto_10
    const/16 v11, 0x16

    goto/16 :goto_17

    :goto_11
    if-ne v7, v11, :cond_1e

    move/from16 v11, v26

    move/from16 v26, v14

    move v14, v11

    move/from16 v11, v27

    .line 80
    invoke-static {v11, v14, v8}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v0

    if-lez v0, :cond_1c

    .line 81
    div-int/lit8 v1, v0, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    .line 82
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    move v7, v0

    move v6, v1

    :goto_12
    const/16 v11, 0x50

    goto :goto_13

    :cond_1c
    move/from16 v6, v25

    move v7, v6

    goto :goto_12

    :goto_13
    if-ne v4, v11, :cond_1d

    move/from16 v0, v32

    goto :goto_14

    :cond_1d
    move/from16 v0, v18

    :goto_14
    move-object/from16 v11, p0

    move/from16 v39, v5

    move/from16 v40, v6

    move/from16 v41, v7

    move/from16 v48, v15

    move/from16 v49, v16

    move-object/from16 v3, v17

    move/from16 v1, v18

    move/from16 v38, v20

    move/from16 v37, v21

    move/from16 v47, v22

    move/from16 v4, v23

    move/from16 v15, v25

    move/from16 v42, v15

    move/from16 v50, v42

    move/from16 v51, v50

    move/from16 v53, v51

    move/from16 v54, v53

    move/from16 v55, v54

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v36, v26

    move/from16 v46, v28

    move/from16 v43, v52

    const/16 v5, 0x16

    :goto_15
    move/from16 v52, v58

    goto/16 :goto_7d

    :cond_1e
    move/from16 v59, v26

    move/from16 v26, v14

    move/from16 v14, v59

    goto :goto_10

    :cond_1f
    move/from16 v4, v26

    move/from16 v26, v14

    move v14, v4

    :goto_16
    move/from16 v4, v37

    goto :goto_10

    :cond_20
    move/from16 v4, v26

    move/from16 v26, v14

    move v14, v4

    move/from16 v52, v11

    goto :goto_16

    :goto_17
    if-ne v2, v11, :cond_21

    const/16 v11, 0x2f

    if-ne v8, v11, :cond_21

    if-ne v12, v11, :cond_21

    const/16 v11, 0x20

    if-ne v5, v11, :cond_21

    const/16 v11, 0x3a

    if-ne v3, v11, :cond_21

    if-ne v0, v11, :cond_21

    const/16 v11, 0x20

    if-ne v1, v11, :cond_21

    const/16 v11, 0x41

    if-eq v4, v11, :cond_22

    const/16 v11, 0x50

    if-ne v4, v11, :cond_21

    :goto_18
    move/from16 v37, v1

    const/16 v1, 0x4d

    goto :goto_19

    :cond_21
    move/from16 v37, v1

    goto :goto_1b

    :cond_22
    const/16 v11, 0x50

    goto :goto_18

    :goto_19
    if-ne v7, v1, :cond_24

    if-ne v4, v11, :cond_23

    move/from16 v0, v32

    goto :goto_1a

    :cond_23
    move/from16 v0, v18

    :goto_1a
    move-object/from16 v11, p0

    move/from16 v42, v10

    move/from16 v36, v13

    move/from16 v41, v14

    move/from16 v48, v15

    move/from16 v49, v16

    move-object/from16 v3, v17

    move/from16 v1, v18

    move/from16 v39, v20

    move/from16 v38, v21

    move/from16 v47, v22

    move/from16 v4, v23

    move/from16 v50, v25

    move/from16 v51, v50

    move/from16 v53, v51

    move/from16 v54, v53

    move/from16 v55, v54

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v37, v26

    move/from16 v40, v27

    move/from16 v46, v28

    move/from16 v43, v52

    const/16 v5, 0x16

    move v15, v9

    goto/16 :goto_15

    :cond_24
    :goto_1b
    const/16 v1, 0x17

    if-ne v2, v1, :cond_29

    const/16 v11, 0x20

    if-ne v10, v11, :cond_29

    const/16 v1, 0x2c

    if-ne v12, v1, :cond_29

    if-ne v13, v11, :cond_29

    if-ne v9, v11, :cond_29

    move/from16 v1, v28

    const/16 v11, 0x3a

    if-ne v1, v11, :cond_26

    if-ne v15, v11, :cond_26

    const/16 v11, 0x20

    if-ne v4, v11, :cond_26

    const/16 v11, 0x41

    if-eq v7, v11, :cond_25

    const/16 v11, 0x50

    if-ne v7, v11, :cond_26

    :cond_25
    const/16 v11, 0x4d

    goto :goto_1d

    :cond_26
    move/from16 v11, v27

    :goto_1c
    move/from16 v27, v0

    const/16 v0, 0x17

    goto/16 :goto_22

    :goto_1d
    if-ne v6, v11, :cond_26

    move/from16 v11, v27

    .line 83
    invoke-static {v11, v14, v8}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v1

    if-lez v1, :cond_27

    .line 84
    div-int/lit8 v4, v1, 0xa

    add-int/lit8 v4, v4, 0x30

    int-to-char v4, v4

    .line 85
    rem-int/lit8 v1, v1, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    move v6, v4

    :goto_1e
    const/16 v11, 0x50

    goto :goto_1f

    :cond_27
    move/from16 v1, v25

    move v6, v1

    goto :goto_1e

    :goto_1f
    if-ne v7, v11, :cond_28

    move/from16 v4, v32

    goto :goto_20

    :cond_28
    move/from16 v4, v18

    :goto_20
    move-object/from16 v11, p0

    move/from16 v47, v0

    move/from16 v41, v1

    move v0, v4

    move/from16 v39, v5

    move/from16 v40, v6

    move/from16 v48, v16

    move/from16 v1, v18

    move/from16 v38, v20

    move/from16 v46, v22

    move/from16 v15, v23

    move/from16 v42, v25

    move/from16 v50, v42

    move/from16 v51, v50

    move/from16 v53, v51

    move/from16 v54, v53

    move/from16 v55, v54

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v36, v26

    move/from16 v49, v37

    move/from16 v43, v52

    const/16 v5, 0x17

    move v4, v3

    move-object/from16 v3, v17

    :goto_21
    move/from16 v37, v21

    goto/16 :goto_15

    :cond_29
    move/from16 v11, v27

    move/from16 v1, v28

    goto :goto_1c

    :goto_22
    if-ne v2, v0, :cond_2f

    const/16 v0, 0x20

    move/from16 v28, v5

    if-ne v10, v0, :cond_2e

    const/16 v5, 0x2c

    if-ne v13, v5, :cond_2e

    move/from16 v5, v26

    move/from16 v26, v3

    move/from16 v3, v23

    if-ne v5, v0, :cond_2b

    if-ne v3, v0, :cond_2b

    const/16 v0, 0x3a

    if-ne v1, v0, :cond_2b

    if-ne v15, v0, :cond_2b

    const/16 v0, 0x20

    if-ne v4, v0, :cond_2b

    const/16 v0, 0x41

    if-eq v7, v0, :cond_2a

    const/16 v0, 0x50

    if-ne v7, v0, :cond_2b

    :cond_2a
    const/16 v0, 0x4d

    goto :goto_24

    :cond_2b
    :goto_23
    const/16 v0, 0x17

    goto/16 :goto_29

    :goto_24
    if-ne v6, v0, :cond_2b

    .line 86
    invoke-static {v11, v14, v8}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v0

    if-lez v0, :cond_2c

    .line 87
    div-int/lit8 v1, v0, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    .line 88
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    move v6, v1

    :goto_25
    const/16 v11, 0x50

    goto :goto_26

    :cond_2c
    move/from16 v0, v25

    move v6, v0

    goto :goto_25

    :goto_26
    if-ne v7, v11, :cond_2d

    move/from16 v1, v32

    goto :goto_27

    :cond_2d
    move/from16 v1, v18

    :goto_27
    move-object/from16 v11, p0

    move/from16 v41, v0

    move v0, v1

    move/from16 v40, v6

    move/from16 v39, v9

    move/from16 v43, v12

    move/from16 v48, v16

    move-object/from16 v3, v17

    move/from16 v1, v18

    move/from16 v36, v21

    move/from16 v46, v22

    move/from16 v15, v25

    move/from16 v50, v15

    move/from16 v51, v50

    move/from16 v53, v51

    move/from16 v54, v53

    move/from16 v55, v54

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v4, v26

    move/from16 v47, v27

    move/from16 v38, v28

    move/from16 v49, v37

    move/from16 v42, v52

    const/16 v5, 0x17

    :goto_28
    move/from16 v37, v20

    goto/16 :goto_15

    :cond_2e
    move/from16 v5, v26

    move/from16 v26, v3

    move/from16 v3, v23

    goto :goto_23

    :cond_2f
    move/from16 v28, v5

    move/from16 v5, v26

    move/from16 v26, v3

    move/from16 v3, v23

    :goto_29
    if-ne v2, v0, :cond_33

    const/16 v0, 0x20

    if-ne v10, v0, :cond_33

    move/from16 v23, v5

    const/16 v5, 0x2c

    if-ne v12, v5, :cond_34

    if-ne v13, v0, :cond_34

    if-ne v9, v5, :cond_34

    if-ne v3, v0, :cond_34

    const/16 v5, 0x3a

    if-ne v1, v5, :cond_34

    if-ne v15, v5, :cond_34

    if-ne v4, v0, :cond_34

    const/16 v0, 0x41

    if-eq v7, v0, :cond_30

    const/16 v0, 0x50

    if-ne v7, v0, :cond_34

    :cond_30
    const/16 v0, 0x4d

    if-ne v6, v0, :cond_34

    .line 89
    invoke-static {v11, v14, v8}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v0

    if-lez v0, :cond_31

    .line 90
    div-int/lit8 v1, v0, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    .line 91
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    move v6, v1

    :goto_2a
    const/16 v11, 0x50

    goto :goto_2b

    :cond_31
    move/from16 v0, v25

    move v6, v0

    goto :goto_2a

    :goto_2b
    if-ne v7, v11, :cond_32

    move/from16 v1, v32

    goto :goto_2c

    :cond_32
    move/from16 v1, v18

    :goto_2c
    move-object/from16 v11, p0

    move/from16 v41, v0

    move v0, v1

    move/from16 v40, v6

    move/from16 v48, v16

    move-object/from16 v3, v17

    move/from16 v1, v18

    move/from16 v38, v20

    move/from16 v46, v22

    move/from16 v36, v23

    move/from16 v15, v25

    move/from16 v42, v15

    move/from16 v50, v42

    move/from16 v51, v50

    move/from16 v53, v51

    move/from16 v54, v53

    move/from16 v55, v54

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v4, v26

    move/from16 v47, v27

    move/from16 v39, v28

    move/from16 v49, v37

    move/from16 v43, v52

    const/16 v5, 0x17

    goto/16 :goto_21

    :cond_33
    move/from16 v23, v5

    :cond_34
    const/16 v0, 0x18

    if-ne v2, v0, :cond_3c

    const/16 v5, 0x20

    if-ne v10, v5, :cond_3c

    const/16 v0, 0x2c

    if-ne v13, v0, :cond_3c

    move/from16 v0, v23

    if-ne v0, v5, :cond_3b

    if-ne v3, v5, :cond_3b

    move/from16 v5, v22

    move/from16 v22, v4

    const/16 v4, 0x3a

    move/from16 v23, v1

    move/from16 v1, v16

    if-ne v5, v4, :cond_3a

    if-ne v1, v4, :cond_36

    const/16 v4, 0x20

    if-ne v7, v4, :cond_36

    const/16 v4, 0x41

    if-eq v6, v4, :cond_35

    const/16 v4, 0x50

    if-ne v6, v4, :cond_36

    :cond_35
    move/from16 v16, v15

    move/from16 v4, v38

    const/16 v15, 0x4d

    goto :goto_2f

    :cond_36
    :goto_2d
    move/from16 v16, v15

    move/from16 v4, v38

    :cond_37
    :goto_2e
    const/16 v15, 0x18

    goto/16 :goto_34

    :goto_2f
    if-ne v4, v15, :cond_37

    .line 92
    invoke-static {v11, v14, v8}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v0

    if-lez v0, :cond_38

    .line 93
    div-int/lit8 v1, v0, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    .line 94
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    move v7, v0

    :goto_30
    const/16 v11, 0x50

    goto :goto_31

    :cond_38
    move/from16 v1, v25

    move v7, v1

    goto :goto_30

    :goto_31
    if-ne v6, v11, :cond_39

    move/from16 v0, v32

    goto :goto_32

    :cond_39
    move/from16 v0, v18

    :goto_32
    move-object/from16 v11, p0

    move/from16 v40, v1

    move/from16 v41, v7

    move/from16 v39, v9

    move/from16 v43, v12

    move/from16 v47, v16

    move-object/from16 v3, v17

    move/from16 v1, v18

    move/from16 v36, v21

    move/from16 v49, v22

    move/from16 v4, v23

    move/from16 v50, v25

    move/from16 v51, v50

    move/from16 v53, v51

    move/from16 v54, v53

    move/from16 v55, v54

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v15, v26

    move/from16 v46, v27

    move/from16 v38, v28

    move/from16 v48, v37

    move/from16 v42, v52

    const/16 v5, 0x18

    goto/16 :goto_28

    :cond_3a
    :goto_33
    move/from16 v4, v38

    move/from16 v16, v15

    goto :goto_2e

    :cond_3b
    move/from16 v23, v1

    move/from16 v1, v16

    move/from16 v5, v22

    move/from16 v22, v4

    goto :goto_2d

    :cond_3c
    move/from16 v5, v22

    move/from16 v0, v23

    move/from16 v23, v1

    move/from16 v22, v4

    move/from16 v1, v16

    goto :goto_33

    :goto_34
    if-ne v2, v15, :cond_42

    const/16 v15, 0x20

    move/from16 v38, v9

    if-ne v10, v15, :cond_41

    const/16 v9, 0x2c

    if-ne v13, v9, :cond_41

    if-ne v0, v15, :cond_41

    if-ne v3, v9, :cond_41

    move/from16 v9, v26

    if-ne v9, v15, :cond_3e

    const/16 v15, 0x3a

    if-ne v5, v15, :cond_3e

    if-ne v1, v15, :cond_3e

    const/16 v15, 0x20

    if-ne v7, v15, :cond_3e

    const/16 v15, 0x41

    if-eq v6, v15, :cond_3d

    const/16 v15, 0x50

    if-ne v6, v15, :cond_3e

    :cond_3d
    const/16 v15, 0x4d

    goto :goto_36

    :cond_3e
    :goto_35
    const/16 v15, 0x18

    goto/16 :goto_3a

    :goto_36
    if-ne v4, v15, :cond_3e

    .line 95
    invoke-static {v11, v14, v8}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v0

    if-lez v0, :cond_3f

    .line 96
    div-int/lit8 v1, v0, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    .line 97
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    move v7, v0

    :goto_37
    const/16 v11, 0x50

    goto :goto_38

    :cond_3f
    move/from16 v1, v25

    move v7, v1

    goto :goto_37

    :goto_38
    if-ne v6, v11, :cond_40

    move/from16 v0, v32

    goto :goto_39

    :cond_40
    move/from16 v0, v18

    :goto_39
    move-object/from16 v11, p0

    move/from16 v40, v1

    move/from16 v41, v7

    move/from16 v43, v12

    move/from16 v47, v16

    move-object/from16 v3, v17

    move/from16 v1, v18

    move/from16 v36, v21

    move/from16 v49, v22

    move/from16 v4, v23

    move/from16 v15, v25

    move/from16 v50, v15

    move/from16 v51, v50

    move/from16 v53, v51

    move/from16 v54, v53

    move/from16 v55, v54

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v46, v27

    move/from16 v48, v37

    move/from16 v39, v38

    move/from16 v42, v52

    const/16 v5, 0x18

    move/from16 v37, v20

    move/from16 v52, v58

    move/from16 v38, v28

    goto/16 :goto_7d

    :cond_41
    move/from16 v9, v26

    goto :goto_35

    :cond_42
    move/from16 v38, v9

    move/from16 v9, v26

    :goto_3a
    if-ne v2, v15, :cond_48

    const/16 v15, 0x20

    if-ne v10, v15, :cond_48

    move/from16 v26, v10

    const/16 v10, 0x2c

    if-ne v12, v10, :cond_47

    if-ne v13, v15, :cond_47

    move/from16 v55, v12

    move/from16 v12, v38

    if-ne v12, v10, :cond_44

    if-ne v3, v15, :cond_44

    const/16 v10, 0x3a

    if-ne v5, v10, :cond_44

    if-ne v1, v10, :cond_44

    if-ne v7, v15, :cond_44

    const/16 v15, 0x41

    if-eq v6, v15, :cond_43

    const/16 v15, 0x50

    if-ne v6, v15, :cond_44

    :cond_43
    const/16 v15, 0x4d

    goto :goto_3c

    :cond_44
    :goto_3b
    move/from16 v10, v52

    const/16 v15, 0x2d

    goto/16 :goto_41

    :goto_3c
    if-ne v4, v15, :cond_44

    .line 98
    invoke-static {v11, v14, v8}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v1

    if-lez v1, :cond_45

    .line 99
    div-int/lit8 v3, v1, 0xa

    add-int/lit8 v3, v3, 0x30

    int-to-char v3, v3

    .line 100
    rem-int/lit8 v1, v1, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    move v7, v1

    :goto_3d
    const/16 v11, 0x50

    goto :goto_3e

    :cond_45
    move/from16 v3, v25

    move v7, v3

    goto :goto_3d

    :goto_3e
    if-ne v6, v11, :cond_46

    move/from16 v1, v32

    goto :goto_3f

    :cond_46
    move/from16 v1, v18

    :goto_3f
    move-object/from16 v11, p0

    move/from16 v36, v0

    move v0, v1

    move/from16 v40, v3

    move/from16 v41, v7

    move v15, v9

    move/from16 v47, v16

    move-object/from16 v3, v17

    move/from16 v1, v18

    move/from16 v38, v20

    move/from16 v49, v22

    move/from16 v4, v23

    move/from16 v42, v25

    move/from16 v50, v42

    move/from16 v51, v50

    move/from16 v53, v51

    move/from16 v54, v53

    move/from16 v55, v54

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v46, v27

    move/from16 v39, v28

    move/from16 v48, v37

    move/from16 v43, v52

    const/16 v5, 0x18

    goto/16 :goto_21

    :cond_47
    :goto_40
    move/from16 v55, v12

    move/from16 v12, v38

    goto :goto_3b

    :cond_48
    move/from16 v26, v10

    goto :goto_40

    :goto_41
    if-ne v10, v15, :cond_50

    if-ne v0, v15, :cond_50

    move/from16 v38, v12

    move/from16 v15, v28

    const/16 v12, 0x20

    if-eq v15, v12, :cond_49

    const/16 v12, 0x54

    if-ne v15, v12, :cond_4a

    :cond_49
    const/16 v12, 0x3a

    goto :goto_44

    :cond_4a
    move/from16 v28, v7

    move/from16 v7, v27

    move/from16 v12, v37

    :goto_42
    move/from16 v27, v1

    :cond_4b
    :goto_43
    const/16 v1, 0x2d

    goto/16 :goto_48

    :goto_44
    if-ne v9, v12, :cond_4a

    move/from16 v28, v7

    move/from16 v7, v27

    move/from16 v27, v1

    if-ne v7, v12, :cond_4f

    move/from16 v12, v37

    const/16 v1, 0x2e

    if-ne v12, v1, :cond_4b

    const/16 v1, 0x17

    if-eq v2, v1, :cond_4c

    const/16 v1, 0x5b

    if-eq v4, v1, :cond_4c

    const/16 v1, 0x7c

    if-eq v4, v1, :cond_4d

    const/16 v1, 0x2b

    if-eq v4, v1, :cond_4c

    const/16 v1, 0x2d

    if-eq v4, v1, :cond_4c

    const/16 v1, 0x5a

    if-ne v4, v1, :cond_4b

    :cond_4c
    const/16 v0, 0x7c

    goto :goto_45

    :cond_4d
    move v0, v1

    :goto_45
    if-ne v4, v0, :cond_4e

    move/from16 v0, v32

    goto :goto_46

    :cond_4e
    move/from16 v0, v18

    :goto_46
    move v1, v0

    move v4, v3

    move/from16 v47, v5

    move/from16 v52, v6

    move/from16 v36, v11

    move/from16 v41, v13

    move/from16 v37, v14

    move/from16 v48, v16

    move-object/from16 v3, v17

    move/from16 v0, v18

    move/from16 v43, v20

    move/from16 v42, v21

    move/from16 v50, v22

    move/from16 v46, v23

    move/from16 v53, v25

    move/from16 v54, v53

    move/from16 v56, v54

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v39, v26

    move/from16 v49, v27

    move/from16 v51, v28

    move/from16 v15, v38

    move/from16 v40, v55

    const/16 v5, 0x17

    move-object/from16 v11, p0

    move/from16 v38, v8

    :goto_47
    move/from16 v55, v58

    goto/16 :goto_7d

    :cond_4f
    move/from16 v12, v37

    goto :goto_43

    :cond_50
    move/from16 v38, v12

    move/from16 v15, v28

    move/from16 v12, v37

    move/from16 v28, v7

    move/from16 v7, v27

    goto :goto_42

    :goto_48
    if-ne v10, v1, :cond_52

    if-ne v0, v1, :cond_52

    const/16 v1, 0x20

    if-eq v15, v1, :cond_51

    const/16 v1, 0x54

    if-ne v15, v1, :cond_52

    :cond_51
    const/16 v1, 0x3a

    goto :goto_49

    :cond_52
    move/from16 v37, v5

    move/from16 v1, v39

    goto/16 :goto_4d

    :goto_49
    if-ne v9, v1, :cond_52

    if-ne v7, v1, :cond_52

    const/16 v1, 0x2e

    if-ne v12, v1, :cond_52

    const/16 v1, 0x18

    move/from16 v37, v5

    if-eq v2, v1, :cond_55

    move/from16 v1, v39

    const/16 v5, 0x5b

    if-eq v1, v5, :cond_53

    const/16 v5, 0x7c

    if-eq v1, v5, :cond_54

    const/16 v5, 0x2b

    if-eq v1, v5, :cond_53

    const/16 v5, 0x2d

    if-eq v1, v5, :cond_53

    const/16 v5, 0x5a

    if-ne v1, v5, :cond_57

    :cond_53
    :goto_4a
    const/16 v0, 0x7c

    goto :goto_4b

    :cond_54
    move v0, v5

    goto :goto_4b

    :cond_55
    move/from16 v1, v39

    goto :goto_4a

    :goto_4b
    if-ne v1, v0, :cond_56

    move/from16 v0, v32

    goto :goto_4c

    :cond_56
    move/from16 v0, v18

    :goto_4c
    move v1, v0

    move/from16 v53, v4

    move/from16 v52, v6

    move/from16 v36, v11

    move/from16 v41, v13

    move/from16 v48, v16

    move/from16 v0, v18

    move/from16 v43, v20

    move/from16 v42, v21

    move/from16 v50, v22

    move/from16 v46, v23

    move/from16 v54, v25

    move/from16 v56, v54

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v39, v26

    move/from16 v49, v27

    move/from16 v51, v28

    move/from16 v47, v37

    move/from16 v15, v38

    move/from16 v40, v55

    const/16 v5, 0x18

    move-object/from16 v11, p0

    move v4, v3

    move/from16 v38, v8

    move/from16 v37, v14

    move-object/from16 v3, v17

    goto/16 :goto_47

    :cond_57
    :goto_4d
    const/16 v5, 0x2d

    if-ne v10, v5, :cond_59

    if-ne v0, v5, :cond_59

    const/16 v5, 0x20

    if-eq v15, v5, :cond_58

    const/16 v5, 0x54

    if-ne v15, v5, :cond_59

    :cond_58
    const/16 v5, 0x3a

    goto :goto_4e

    :cond_59
    move/from16 v5, v40

    move/from16 v40, v15

    :cond_5a
    const/16 v15, 0x19

    goto/16 :goto_52

    :goto_4e
    if-ne v9, v5, :cond_59

    if-ne v7, v5, :cond_59

    const/16 v5, 0x2e

    if-ne v12, v5, :cond_59

    const/16 v5, 0x19

    if-eq v2, v5, :cond_5d

    move/from16 v5, v40

    move/from16 v40, v15

    const/16 v15, 0x5b

    if-eq v5, v15, :cond_5b

    const/16 v15, 0x7c

    if-eq v5, v15, :cond_5c

    const/16 v15, 0x2b

    if-eq v5, v15, :cond_5b

    const/16 v15, 0x2d

    if-eq v5, v15, :cond_5b

    const/16 v15, 0x5a

    if-ne v5, v15, :cond_5a

    :cond_5b
    :goto_4f
    const/16 v0, 0x7c

    goto :goto_50

    :cond_5c
    move v0, v15

    goto :goto_50

    :cond_5d
    move/from16 v5, v40

    goto :goto_4f

    :goto_50
    if-ne v5, v0, :cond_5e

    move/from16 v0, v32

    goto :goto_51

    :cond_5e
    move/from16 v0, v18

    :goto_51
    move/from16 v54, v1

    move/from16 v53, v4

    move/from16 v52, v6

    move/from16 v36, v11

    move/from16 v41, v13

    move/from16 v48, v16

    move/from16 v43, v20

    move/from16 v42, v21

    move/from16 v50, v22

    move/from16 v46, v23

    move/from16 v56, v25

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v39, v26

    move/from16 v49, v27

    move/from16 v51, v28

    move/from16 v47, v37

    move/from16 v15, v38

    move/from16 v40, v55

    const/16 v5, 0x19

    move-object/from16 v11, p0

    move v1, v0

    move v4, v3

    move/from16 v38, v8

    move/from16 v37, v14

    move-object/from16 v3, v17

    move/from16 v0, v18

    goto/16 :goto_47

    :goto_52
    if-ne v2, v15, :cond_63

    move/from16 v15, v26

    move/from16 v26, v5

    const/16 v5, 0x20

    move/from16 v52, v15

    if-ne v15, v5, :cond_60

    const/16 v15, 0x2c

    if-ne v13, v15, :cond_60

    if-ne v0, v5, :cond_60

    if-ne v3, v15, :cond_60

    if-ne v9, v5, :cond_60

    const/16 v15, 0x3a

    if-ne v7, v15, :cond_60

    if-ne v12, v15, :cond_60

    if-ne v6, v5, :cond_60

    const/16 v15, 0x41

    if-eq v4, v15, :cond_5f

    const/16 v15, 0x50

    if-ne v4, v15, :cond_60

    :cond_5f
    const/16 v15, 0x4d

    goto :goto_54

    :cond_60
    :goto_53
    const/16 v15, 0x2d

    goto/16 :goto_58

    :goto_54
    if-ne v1, v15, :cond_60

    .line 101
    invoke-static {v11, v14, v8}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v0

    if-lez v0, :cond_61

    .line 102
    div-int/lit8 v1, v0, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    .line 103
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    move v7, v0

    move v6, v1

    :goto_55
    const/16 v11, 0x50

    goto :goto_56

    :cond_61
    move/from16 v6, v25

    move v7, v6

    goto :goto_55

    :goto_56
    if-ne v4, v11, :cond_62

    move/from16 v0, v32

    goto :goto_57

    :cond_62
    move/from16 v0, v18

    :goto_57
    move-object/from16 v11, p0

    move/from16 v41, v7

    move/from16 v42, v10

    move/from16 v46, v16

    move-object/from16 v3, v17

    move/from16 v1, v18

    move/from16 v36, v21

    move/from16 v48, v22

    move/from16 v15, v23

    move/from16 v50, v25

    move/from16 v51, v50

    move/from16 v52, v51

    move/from16 v53, v52

    move/from16 v54, v53

    move/from16 v56, v54

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v47, v27

    move/from16 v49, v28

    move/from16 v4, v37

    move/from16 v39, v38

    move/from16 v38, v40

    move/from16 v43, v55

    const/16 v5, 0x19

    move/from16 v40, v6

    move/from16 v37, v20

    goto/16 :goto_47

    :cond_63
    move/from16 v52, v26

    move/from16 v26, v5

    goto :goto_53

    :goto_58
    if-ne v10, v15, :cond_6b

    if-ne v0, v15, :cond_6b

    move/from16 v15, v40

    const/16 v5, 0x20

    if-eq v15, v5, :cond_64

    const/16 v5, 0x54

    if-ne v15, v5, :cond_65

    :cond_64
    const/16 v5, 0x3a

    goto :goto_5a

    :cond_65
    :goto_59
    move/from16 v5, v41

    move/from16 v41, v8

    :cond_66
    const/16 v8, 0x2d

    goto/16 :goto_5f

    :goto_5a
    if-ne v9, v5, :cond_65

    if-ne v7, v5, :cond_65

    const/16 v5, 0x2e

    if-ne v12, v5, :cond_65

    const/16 v5, 0x1a

    if-eq v2, v5, :cond_69

    move/from16 v5, v41

    move/from16 v41, v8

    const/16 v8, 0x5b

    if-eq v5, v8, :cond_67

    const/16 v8, 0x7c

    if-eq v5, v8, :cond_68

    const/16 v8, 0x2b

    if-eq v5, v8, :cond_67

    const/16 v8, 0x2d

    if-eq v5, v8, :cond_67

    const/16 v8, 0x5a

    if-ne v5, v8, :cond_66

    :cond_67
    :goto_5b
    const/16 v0, 0x7c

    goto :goto_5c

    :cond_68
    move v0, v8

    goto :goto_5c

    :cond_69
    move/from16 v5, v41

    move/from16 v41, v8

    goto :goto_5b

    :goto_5c
    if-ne v5, v0, :cond_6a

    move/from16 v0, v32

    goto :goto_5d

    :cond_6a
    move/from16 v0, v18

    :goto_5d
    move/from16 v54, v1

    move/from16 v53, v4

    move/from16 v36, v11

    move/from16 v48, v16

    move/from16 v43, v20

    move/from16 v42, v21

    move/from16 v50, v22

    move/from16 v46, v23

    move/from16 v56, v25

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v49, v27

    move/from16 v51, v28

    move/from16 v47, v37

    move/from16 v15, v38

    move/from16 v38, v41

    move/from16 v39, v52

    move/from16 v40, v55

    const/16 v5, 0x1a

    move-object/from16 v11, p0

    move v1, v0

    move v4, v3

    move/from16 v52, v6

    move/from16 v41, v13

    move/from16 v37, v14

    move-object/from16 v3, v17

    move/from16 v0, v18

    :goto_5e
    move/from16 v55, v26

    goto/16 :goto_7d

    :cond_6b
    move/from16 v15, v40

    goto :goto_59

    :goto_5f
    if-ne v10, v8, :cond_6d

    if-ne v0, v8, :cond_6d

    const/16 v8, 0x20

    if-eq v15, v8, :cond_6c

    const/16 v8, 0x54

    if-ne v15, v8, :cond_6d

    :cond_6c
    const/16 v8, 0x3a

    goto :goto_60

    :cond_6d
    move/from16 v8, v42

    move/from16 v42, v11

    goto/16 :goto_65

    :goto_60
    if-ne v9, v8, :cond_6d

    if-ne v7, v8, :cond_6d

    const/16 v8, 0x2e

    if-ne v12, v8, :cond_6d

    const/16 v8, 0x1b

    if-eq v2, v8, :cond_6f

    move/from16 v8, v42

    move/from16 v42, v11

    const/16 v11, 0x5b

    if-eq v8, v11, :cond_6e

    const/16 v11, 0x7c

    if-eq v8, v11, :cond_6e

    const/16 v11, 0x2b

    if-eq v8, v11, :cond_6e

    const/16 v11, 0x2d

    if-eq v8, v11, :cond_6e

    const/16 v11, 0x5a

    if-ne v8, v11, :cond_72

    :cond_6e
    :goto_61
    const/16 v7, 0x20

    goto :goto_62

    :cond_6f
    move/from16 v8, v42

    move/from16 v42, v11

    goto :goto_61

    :goto_62
    if-ne v4, v7, :cond_70

    move-object/from16 v11, p0

    move v4, v3

    move/from16 v48, v16

    move-object/from16 v3, v17

    move/from16 v0, v18

    move v1, v0

    move/from16 v43, v20

    move/from16 v50, v22

    move/from16 v46, v23

    move/from16 v53, v25

    move/from16 v54, v53

    move/from16 v56, v54

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v49, v27

    move/from16 v51, v28

    move/from16 v47, v37

    move/from16 v15, v38

    move/from16 v38, v41

    move/from16 v36, v42

    move/from16 v39, v52

    move/from16 v40, v55

    const/16 v5, 0x17

    move/from16 v52, v6

    move/from16 v41, v13

    move/from16 v37, v14

    move/from16 v42, v21

    goto/16 :goto_47

    :cond_70
    const/16 v0, 0x7c

    if-ne v8, v0, :cond_71

    move/from16 v0, v32

    goto :goto_63

    :cond_71
    move/from16 v0, v18

    :goto_63
    move-object/from16 v11, p0

    move/from16 v54, v1

    move/from16 v53, v4

    move/from16 v56, v5

    move/from16 v48, v16

    move/from16 v43, v20

    move/from16 v50, v22

    move/from16 v46, v23

    move/from16 v57, v25

    move/from16 v58, v57

    move/from16 v49, v27

    move/from16 v51, v28

    move/from16 v47, v37

    move/from16 v15, v38

    move/from16 v38, v41

    move/from16 v36, v42

    move/from16 v39, v52

    move/from16 v40, v55

    const/16 v5, 0x1b

    move v1, v0

    move v4, v3

    move/from16 v52, v6

    move/from16 v41, v13

    move/from16 v37, v14

    move-object/from16 v3, v17

    move/from16 v0, v18

    :goto_64
    move/from16 v42, v21

    goto/16 :goto_5e

    :cond_72
    :goto_65
    const/16 v11, 0x2d

    if-ne v10, v11, :cond_74

    if-ne v0, v11, :cond_74

    const/16 v11, 0x20

    if-eq v15, v11, :cond_73

    const/16 v11, 0x54

    if-ne v15, v11, :cond_74

    :cond_73
    const/16 v11, 0x3a

    goto :goto_66

    :cond_74
    move/from16 v11, v43

    move/from16 v43, v14

    :cond_75
    const/16 v14, 0x1c

    goto/16 :goto_6a

    :goto_66
    if-ne v9, v11, :cond_74

    if-ne v7, v11, :cond_74

    const/16 v11, 0x2e

    if-ne v12, v11, :cond_74

    const/16 v11, 0x1c

    if-eq v2, v11, :cond_78

    move/from16 v11, v43

    move/from16 v43, v14

    const/16 v14, 0x5b

    if-eq v11, v14, :cond_76

    const/16 v14, 0x7c

    if-eq v11, v14, :cond_77

    const/16 v14, 0x2b

    if-eq v11, v14, :cond_76

    const/16 v14, 0x2d

    if-eq v11, v14, :cond_76

    const/16 v14, 0x5a

    if-ne v11, v14, :cond_75

    :cond_76
    :goto_67
    const/16 v0, 0x7c

    goto :goto_68

    :cond_77
    move v0, v14

    goto :goto_68

    :cond_78
    move/from16 v11, v43

    move/from16 v43, v14

    goto :goto_67

    :goto_68
    if-ne v11, v0, :cond_79

    move/from16 v0, v32

    goto :goto_69

    :cond_79
    move/from16 v0, v18

    :goto_69
    move-object/from16 v11, p0

    move/from16 v54, v1

    move/from16 v53, v4

    move/from16 v56, v5

    move/from16 v57, v8

    move/from16 v48, v16

    move/from16 v50, v22

    move/from16 v46, v23

    move/from16 v58, v25

    move/from16 v49, v27

    move/from16 v51, v28

    move/from16 v47, v37

    move/from16 v15, v38

    move/from16 v38, v41

    move/from16 v36, v42

    move/from16 v37, v43

    move/from16 v39, v52

    move/from16 v40, v55

    const/16 v5, 0x1c

    move v1, v0

    move v4, v3

    move/from16 v52, v6

    move/from16 v41, v13

    move-object/from16 v3, v17

    move/from16 v0, v18

    move/from16 v43, v20

    goto/16 :goto_64

    :goto_6a
    move/from16 v48, v11

    if-ne v2, v14, :cond_7c

    move/from16 v14, v52

    const/16 v11, 0x20

    if-ne v14, v11, :cond_7b

    if-ne v0, v11, :cond_7b

    if-ne v15, v11, :cond_7b

    const/16 v11, 0x3a

    if-ne v9, v11, :cond_7b

    if-ne v7, v11, :cond_7b

    const/16 v11, 0x20

    if-ne v12, v11, :cond_7b

    if-ne v4, v11, :cond_7b

    move/from16 v11, v55

    .line 104
    invoke-static {v10, v11, v13}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v0

    if-lez v0, :cond_7a

    .line 105
    div-int/lit8 v4, v0, 0xa

    add-int/lit8 v4, v4, 0x30

    int-to-char v4, v4

    .line 106
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    move v7, v0

    move v6, v4

    goto :goto_6b

    :cond_7a
    move/from16 v6, v25

    move v7, v6

    .line 107
    :goto_6b
    new-instance v0, Ljava/lang/String;

    add-int/lit8 v4, p1, 0x14

    const/4 v9, 0x3

    move-object/from16 v10, p0

    invoke-direct {v0, v10, v4, v9}, Ljava/lang/String;-><init>([BII)V

    move/from16 v36, v1

    move v4, v3

    move/from16 v40, v6

    move/from16 v41, v7

    move/from16 v39, v8

    move-object v11, v10

    move/from16 v48, v16

    move/from16 v1, v18

    move/from16 v43, v20

    move/from16 v42, v21

    move/from16 v46, v23

    move/from16 v50, v25

    move/from16 v51, v50

    move/from16 v52, v51

    move/from16 v53, v52

    move/from16 v54, v53

    move/from16 v55, v54

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v49, v27

    move/from16 v47, v37

    move/from16 v15, v38

    move-object v3, v0

    move/from16 v38, v5

    move v0, v1

    move/from16 v37, v26

    const/16 v5, 0x13

    goto/16 :goto_7d

    :cond_7b
    :goto_6c
    move-object/from16 v11, p0

    move/from16 v24, v8

    const/16 v8, 0x1c

    goto :goto_6d

    :cond_7c
    move/from16 v14, v52

    goto :goto_6c

    :goto_6d
    if-ne v2, v8, :cond_81

    const/16 v8, 0x2c

    if-ne v14, v8, :cond_81

    const/16 v8, 0x20

    if-ne v10, v8, :cond_81

    if-ne v13, v8, :cond_81

    if-ne v15, v8, :cond_81

    move/from16 v40, v3

    move/from16 v3, v37

    if-ne v3, v8, :cond_80

    move/from16 v8, v27

    move/from16 v27, v5

    const/16 v5, 0x3a

    if-ne v8, v5, :cond_7f

    move/from16 v37, v8

    move/from16 v8, v28

    if-ne v8, v5, :cond_7e

    const/16 v5, 0x20

    if-ne v1, v5, :cond_7e

    move/from16 v1, v20

    move/from16 v5, v21

    .line 108
    invoke-static {v0, v5, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v0

    if-lez v0, :cond_7d

    .line 109
    div-int/lit8 v1, v0, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    .line 110
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    goto :goto_6e

    :cond_7d
    move/from16 v0, v25

    move v1, v0

    :goto_6e
    move/from16 v41, v0

    move/from16 v49, v4

    move/from16 v48, v6

    move v15, v7

    move/from16 v46, v12

    move/from16 v4, v16

    move-object/from16 v3, v17

    move/from16 v0, v18

    move/from16 v47, v22

    move/from16 v39, v23

    move/from16 v42, v25

    move/from16 v50, v42

    move/from16 v51, v50

    move/from16 v52, v51

    move/from16 v53, v52

    move/from16 v54, v53

    move/from16 v56, v54

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v36, v38

    move/from16 v37, v40

    move/from16 v43, v55

    const/16 v5, 0x18

    move/from16 v40, v1

    move/from16 v38, v9

    move/from16 v55, v58

    move/from16 v1, v32

    goto/16 :goto_7d

    :cond_7e
    move/from16 v5, v20

    move/from16 v20, v1

    move v1, v5

    move/from16 v5, v21

    move/from16 v28, v8

    goto :goto_71

    :cond_7f
    move/from16 v5, v20

    move/from16 v20, v1

    move v1, v5

    move/from16 v37, v8

    :goto_6f
    move/from16 v5, v21

    goto :goto_71

    :cond_80
    move/from16 v37, v20

    move/from16 v20, v1

    move/from16 v1, v37

    :goto_70
    move/from16 v37, v27

    move/from16 v27, v5

    goto :goto_6f

    :cond_81
    move/from16 v40, v20

    move/from16 v20, v1

    move/from16 v1, v40

    move/from16 v40, v3

    move/from16 v3, v37

    goto :goto_70

    :goto_71
    const/16 v8, 0x1d

    if-ne v2, v8, :cond_85

    const/16 v8, 0x2c

    if-ne v14, v8, :cond_85

    const/16 v8, 0x20

    if-ne v10, v8, :cond_85

    if-ne v0, v8, :cond_85

    move/from16 v52, v14

    move/from16 v14, v38

    if-ne v14, v8, :cond_84

    if-ne v7, v8, :cond_84

    const/16 v8, 0x3a

    if-ne v12, v8, :cond_84

    if-ne v6, v8, :cond_84

    move/from16 v8, v26

    move/from16 v26, v4

    const/16 v4, 0x20

    if-ne v8, v4, :cond_83

    .line 111
    invoke-static {v5, v1, v15}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v0

    if-lez v0, :cond_82

    .line 112
    div-int/lit8 v1, v0, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    .line 113
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    move v7, v0

    move v6, v1

    goto :goto_72

    :cond_82
    move/from16 v6, v25

    move v7, v6

    :goto_72
    move/from16 v39, v3

    move/from16 v41, v7

    move/from16 v43, v13

    move/from16 v15, v16

    move-object/from16 v3, v17

    move/from16 v0, v18

    move/from16 v49, v20

    move/from16 v46, v22

    move/from16 v38, v23

    move/from16 v50, v25

    move/from16 v51, v50

    move/from16 v52, v51

    move/from16 v53, v52

    move/from16 v54, v53

    move/from16 v56, v54

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v48, v26

    move/from16 v47, v28

    move/from16 v1, v32

    move/from16 v4, v37

    move/from16 v36, v40

    move/from16 v42, v55

    const/16 v5, 0x19

    move/from16 v40, v6

    move/from16 v37, v9

    goto/16 :goto_47

    :cond_83
    :goto_73
    const/16 v4, 0x2d

    goto :goto_75

    :cond_84
    move/from16 v8, v26

    :goto_74
    move/from16 v26, v4

    goto :goto_73

    :cond_85
    move/from16 v52, v14

    move/from16 v8, v26

    move/from16 v14, v38

    goto :goto_74

    :goto_75
    if-ne v10, v4, :cond_87

    if-ne v0, v4, :cond_87

    const/16 v4, 0x20

    if-eq v15, v4, :cond_86

    const/16 v4, 0x54

    if-ne v15, v4, :cond_87

    :cond_86
    const/16 v4, 0x3a

    goto :goto_76

    :cond_87
    move/from16 v29, v10

    :cond_88
    const/16 v4, 0x16

    goto/16 :goto_7a

    :goto_76
    if-ne v9, v4, :cond_87

    if-ne v7, v4, :cond_87

    const/16 v4, 0x2e

    if-ne v12, v4, :cond_87

    const/16 v4, 0x1d

    if-eq v2, v4, :cond_8b

    move/from16 v29, v10

    move/from16 v4, v44

    const/16 v10, 0x5b

    if-eq v4, v10, :cond_89

    const/16 v10, 0x7c

    if-eq v4, v10, :cond_8a

    const/16 v10, 0x2b

    if-eq v4, v10, :cond_89

    const/16 v10, 0x2d

    if-eq v4, v10, :cond_89

    const/16 v10, 0x5a

    if-ne v4, v10, :cond_88

    :cond_89
    :goto_77
    const/16 v0, 0x7c

    goto :goto_78

    :cond_8a
    move v0, v10

    goto :goto_78

    :cond_8b
    move/from16 v4, v44

    goto :goto_77

    :goto_78
    if-ne v4, v0, :cond_8c

    move/from16 v0, v32

    goto :goto_79

    :cond_8c
    move/from16 v0, v18

    :goto_79
    move/from16 v47, v3

    move v15, v14

    move-object/from16 v3, v17

    move/from16 v54, v20

    move/from16 v50, v22

    move/from16 v46, v23

    move/from16 v57, v24

    move/from16 v53, v26

    move/from16 v56, v27

    move/from16 v51, v28

    move/from16 v49, v37

    move/from16 v4, v40

    move/from16 v38, v41

    move/from16 v36, v42

    move/from16 v37, v43

    move/from16 v58, v48

    move/from16 v39, v52

    move/from16 v40, v55

    move/from16 v43, v1

    move/from16 v42, v5

    move/from16 v52, v6

    move/from16 v55, v8

    move/from16 v41, v13

    move/from16 v48, v16

    const/16 v5, 0x1d

    move v1, v0

    move/from16 v0, v18

    goto :goto_7d

    :goto_7a
    if-ne v2, v4, :cond_9c

    move/from16 v4, v16

    const/16 v10, 0x2b

    if-eq v4, v10, :cond_8e

    const/16 v10, 0x2d

    if-ne v4, v10, :cond_8d

    goto :goto_7c

    :cond_8d
    :goto_7b
    const/16 v10, 0x20

    goto/16 :goto_85

    :cond_8e
    :goto_7c
    move v4, v1

    move/from16 v51, v3

    move/from16 v49, v9

    move/from16 v47, v14

    move/from16 v46, v15

    move-object/from16 v3, v17

    move/from16 v1, v18

    move/from16 v50, v23

    move/from16 v53, v25

    move/from16 v54, v53

    move/from16 v56, v54

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v48, v40

    move/from16 v38, v41

    move/from16 v36, v42

    move/from16 v37, v43

    move/from16 v39, v52

    move/from16 v41, v55

    move/from16 v43, v0

    move v15, v5

    move/from16 v52, v7

    move/from16 v42, v13

    move v0, v1

    move/from16 v55, v58

    move/from16 v40, v29

    goto/16 :goto_f

    :goto_7d
    if-eqz v0, :cond_8f

    const/16 v6, 0x31

    if-ne v15, v6, :cond_8f

    const/16 v6, 0x32

    if-ne v4, v6, :cond_8f

    goto :goto_7e

    :cond_8f
    move/from16 v18, v0

    :goto_7e
    if-eqz v18, :cond_90

    .line 114
    invoke-static {v15, v4}, Lcom/alibaba/fastjson2/util/DateUtils;->hourAfterNoon(CC)I

    move-result v0

    shr-int/lit8 v4, v0, 0x10

    int-to-char v15, v4

    int-to-short v0, v0

    int-to-char v4, v0

    :cond_90
    move/from16 v45, v4

    move/from16 v44, v15

    .line 115
    invoke-static/range {v36 .. v58}, Lcom/alibaba/fastjson2/util/DateUtils;->localDateTime(CCCCCCCCCCCCCCCCCCCCCCC)Ljava/time/LocalDateTime;

    move-result-object v0

    if-nez v0, :cond_91

    return-object v17

    :cond_91
    if-eqz v1, :cond_93

    .line 116
    new-instance v1, Ljava/lang/String;

    sub-int/2addr v2, v5

    invoke-direct {v1, v11, v5, v2}, Ljava/lang/String;-><init>([BII)V

    .line 117
    const-string v2, "UTC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_92

    const-string v2, "[UTC]"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_92

    .line 118
    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    .line 119
    invoke-virtual {v1}, Ljava/util/TimeZone;->toZoneId()Ljava/time/ZoneId;

    move-result-object v1

    goto :goto_7f

    .line 120
    :cond_92
    sget-object v1, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    :goto_7f
    move-object v2, v1

    move-object/from16 v1, p3

    goto :goto_83

    :cond_93
    if-ne v5, v2, :cond_94

    move-object/from16 v1, p3

    move-object v2, v1

    goto :goto_83

    :cond_94
    add-int v1, p1, v5

    .line 121
    aget-byte v4, v11, v1

    int-to-char v4, v4

    const/16 v14, 0x5a

    if-ne v4, v14, :cond_95

    .line 122
    sget-object v1, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    goto :goto_7f

    :cond_95
    if-nez v3, :cond_97

    const/16 v10, 0x2b

    if-eq v4, v10, :cond_99

    const/16 v15, 0x2d

    if-ne v4, v15, :cond_96

    goto :goto_81

    :cond_96
    const/16 v7, 0x20

    if-ne v4, v7, :cond_98

    .line 123
    new-instance v3, Ljava/lang/String;

    add-int/lit8 v1, v1, 0x1

    sub-int/2addr v2, v5

    add-int/lit8 v2, v2, -0x1

    invoke-direct {v3, v11, v1, v2}, Ljava/lang/String;-><init>([BII)V

    :cond_97
    :goto_80
    move-object/from16 v1, p3

    goto :goto_82

    :cond_98
    if-ge v5, v2, :cond_97

    .line 124
    new-instance v3, Ljava/lang/String;

    add-int/lit8 v1, v1, 0x1

    sub-int/2addr v2, v5

    add-int/lit8 v2, v2, -0x2

    invoke-direct {v3, v11, v1, v2}, Ljava/lang/String;-><init>([BII)V

    goto :goto_80

    .line 125
    :cond_99
    :goto_81
    new-instance v3, Ljava/lang/String;

    sub-int/2addr v2, v5

    invoke-direct {v3, v11, v1, v2}, Ljava/lang/String;-><init>([BII)V

    goto :goto_80

    .line 126
    :goto_82
    invoke-static {v3, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->getZoneId(Ljava/lang/String;Ljava/time/ZoneId;)Ljava/time/ZoneId;

    move-result-object v2

    :goto_83
    if-nez v2, :cond_9a

    goto :goto_84

    :cond_9a
    move-object v1, v2

    :goto_84
    if-nez v1, :cond_9b

    .line 127
    sget-object v1, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    :cond_9b
    move-object/from16 v2, v17

    .line 128
    invoke-static {v0, v1, v2}, Ljava/time/ZonedDateTime;->ofLocal(Ljava/time/LocalDateTime;Ljava/time/ZoneId;Ljava/time/ZoneOffset;)Ljava/time/ZonedDateTime;

    move-result-object v0

    return-object v0

    :cond_9c
    move/from16 v4, v16

    goto/16 :goto_7b

    :goto_85
    if-ne v2, v10, :cond_9d

    const/16 v11, 0x2c

    if-ne v13, v11, :cond_9d

    if-ne v0, v10, :cond_9d

    const/16 v11, 0x2d

    if-ne v15, v11, :cond_9d

    move/from16 v13, v23

    if-ne v13, v11, :cond_9d

    if-ne v12, v10, :cond_9d

    const/16 v11, 0x3a

    if-ne v6, v11, :cond_9d

    if-ne v8, v11, :cond_9d

    add-int/lit8 v11, p1, 0x1c

    .line 129
    aget-byte v11, p0, v11

    if-eq v11, v10, :cond_a0

    :cond_9d
    const/16 v10, 0x21

    if-ne v2, v10, :cond_9e

    const/16 v11, 0x2c

    if-ne v0, v11, :cond_9e

    const/16 v11, 0x20

    if-ne v5, v11, :cond_9e

    const/16 v10, 0x2d

    if-ne v14, v10, :cond_9e

    if-ne v3, v10, :cond_9e

    move/from16 v0, v22

    if-ne v0, v11, :cond_9e

    move/from16 v0, v26

    const/16 v12, 0x3a

    if-ne v0, v12, :cond_9e

    move/from16 v0, v27

    if-ne v0, v12, :cond_9e

    add-int/lit8 v0, p1, 0x1d

    aget-byte v0, p0, v0

    if-eq v0, v11, :cond_a0

    :cond_9e
    const/16 v0, 0x22

    if-ne v2, v0, :cond_9f

    const/16 v11, 0x2c

    if-ne v5, v11, :cond_9f

    const/16 v11, 0x20

    if-ne v1, v11, :cond_9f

    move/from16 v3, v40

    const/16 v10, 0x2d

    if-ne v3, v10, :cond_9f

    if-ne v7, v10, :cond_9f

    move/from16 v7, v28

    if-ne v7, v11, :cond_9f

    move/from16 v3, v20

    const/16 v5, 0x3a

    if-ne v3, v5, :cond_9f

    move/from16 v3, v24

    if-ne v3, v5, :cond_9f

    add-int/lit8 v3, p1, 0x1e

    aget-byte v3, p0, v3

    if-eq v3, v11, :cond_a0

    :cond_9f
    const/16 v3, 0x23

    if-ne v2, v3, :cond_a1

    const/16 v11, 0x2c

    if-ne v1, v11, :cond_a1

    const/16 v11, 0x20

    if-ne v15, v11, :cond_a1

    const/16 v15, 0x2d

    if-ne v9, v15, :cond_a1

    if-ne v4, v15, :cond_a1

    if-ne v6, v11, :cond_a1

    const/16 v5, 0x3a

    if-ne v8, v5, :cond_a1

    move/from16 v6, v48

    if-ne v6, v5, :cond_a1

    add-int/lit8 v1, p1, 0x1f

    aget-byte v1, p0, v1

    if-ne v1, v11, :cond_a1

    .line 130
    :cond_a0
    new-instance v0, Ljava/lang/String;

    move-object/from16 v10, p0

    move/from16 v1, p1

    invoke-direct {v0, v10, v1, v2}, Ljava/lang/String;-><init>([BII)V

    invoke-static {v0}, Lcom/alibaba/fastjson2/util/DateUtils;->parseZonedDateTimeCookie(Ljava/lang/String;)Ljava/time/ZonedDateTime;

    move-result-object v0

    return-object v0

    :cond_a1
    move-object/from16 v10, p0

    move/from16 v1, p1

    if-ne v2, v0, :cond_a3

    .line 131
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DATE_TIME_FORMATTER_34:Ljava/time/format/DateTimeFormatter;

    if-nez v0, :cond_a2

    .line 132
    const-string v0, "EEE MMM dd HH:mm:ss O yyyy"

    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {v0, v3}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    sput-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DATE_TIME_FORMATTER_34:Ljava/time/format/DateTimeFormatter;

    .line 133
    :cond_a2
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v10, v1, v2}, Ljava/lang/String;-><init>([BII)V

    invoke-static {v3, v0}, Ljava/time/ZonedDateTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/ZonedDateTime;

    move-result-object v0

    return-object v0

    :cond_a3
    const/16 v0, 0x1f

    if-ne v2, v0, :cond_a5

    move/from16 v0, v19

    const/16 v11, 0x2c

    if-ne v0, v11, :cond_a5

    .line 134
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DATE_TIME_FORMATTER_RFC_2822:Ljava/time/format/DateTimeFormatter;

    if-nez v0, :cond_a4

    .line 135
    const-string v0, "EEE, dd MMM yyyy HH:mm:ss Z"

    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {v0, v3}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    sput-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DATE_TIME_FORMATTER_RFC_2822:Ljava/time/format/DateTimeFormatter;

    .line 136
    :cond_a4
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v10, v1, v2}, Ljava/lang/String;-><init>([BII)V

    invoke-static {v3, v0}, Ljava/time/ZonedDateTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/ZonedDateTime;

    move-result-object v0

    return-object v0

    :cond_a5
    const/16 v17, 0x0

    return-object v17

    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static parseZonedDateTime([CII)Ljava/time/ZonedDateTime;
    .locals 1

    .line 146
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    invoke-static {p0, p1, p2, v0}, Lcom/alibaba/fastjson2/util/DateUtils;->parseZonedDateTime([CIILjava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object p0

    return-object p0
.end method

.method public static parseZonedDateTime([CIILjava/time/ZoneId;)Ljava/time/ZonedDateTime;
    .locals 64

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    const/4 v4, 0x0

    if-nez v0, :cond_0

    return-object v4

    :cond_0
    if-nez v2, :cond_1

    return-object v4

    :cond_1
    const/16 v5, 0x10

    if-ne v2, v5, :cond_2

    .line 148
    invoke-static {v0, v1, v3}, Lcom/alibaba/fastjson2/util/DateUtils;->parseZonedDateTime16([CILjava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object v0

    return-object v0

    :cond_2
    const/16 v5, 0x13

    if-lt v2, v5, :cond_a8

    .line 149
    aget-char v7, v0, v1

    add-int/lit8 v8, v1, 0x1

    .line 150
    aget-char v8, v0, v8

    add-int/lit8 v9, v1, 0x2

    .line 151
    aget-char v9, v0, v9

    add-int/lit8 v10, v1, 0x3

    .line 152
    aget-char v10, v0, v10

    add-int/lit8 v11, v1, 0x4

    .line 153
    aget-char v11, v0, v11

    add-int/lit8 v12, v1, 0x5

    .line 154
    aget-char v12, v0, v12

    add-int/lit8 v13, v1, 0x6

    .line 155
    aget-char v13, v0, v13

    add-int/lit8 v14, v1, 0x7

    .line 156
    aget-char v14, v0, v14

    add-int/lit8 v15, v1, 0x8

    .line 157
    aget-char v15, v0, v15

    add-int/lit8 v16, v1, 0x9

    .line 158
    aget-char v6, v0, v16

    add-int/lit8 v16, v1, 0xa

    move-object/from16 v17, v4

    .line 159
    aget-char v4, v0, v16

    add-int/lit8 v16, v1, 0xb

    .line 160
    aget-char v5, v0, v16

    add-int/lit8 v16, v1, 0xc

    .line 161
    aget-char v1, v0, v16

    add-int/lit8 v16, p1, 0xd

    .line 162
    aget-char v3, v0, v16

    add-int/lit8 v16, p1, 0xe

    move/from16 v19, v6

    .line 163
    aget-char v6, v0, v16

    add-int/lit8 v16, p1, 0xf

    move/from16 v20, v15

    .line 164
    aget-char v15, v0, v16

    add-int/lit8 v16, p1, 0x10

    .line 165
    aget-char v0, p0, v16

    add-int/lit8 v16, p1, 0x11

    move/from16 v21, v15

    .line 166
    aget-char v15, p0, v16

    add-int/lit8 v16, p1, 0x12

    move/from16 v22, v1

    .line 167
    aget-char v1, p0, v16

    move/from16 v16, v1

    const/16 v1, 0x13

    if-ne v2, v1, :cond_3

    const/16 v1, 0x20

    goto :goto_0

    :cond_3
    add-int/lit8 v18, p1, 0x13

    .line 168
    aget-char v18, p0, v18

    move/from16 v1, v18

    :goto_0
    const/16 v18, 0x30

    packed-switch v2, :pswitch_data_0

    add-int/lit8 v24, p1, 0x14

    .line 169
    aget-char v24, p0, v24

    add-int/lit8 v25, p1, 0x15

    .line 170
    aget-char v25, p0, v25

    add-int/lit8 v26, p1, 0x16

    .line 171
    aget-char v26, p0, v26

    add-int/lit8 v27, p1, 0x17

    .line 172
    aget-char v27, p0, v27

    add-int/lit8 v28, p1, 0x18

    .line 173
    aget-char v28, p0, v28

    add-int/lit8 v29, p1, 0x19

    .line 174
    aget-char v29, p0, v29

    add-int/lit8 v30, p1, 0x1a

    .line 175
    aget-char v30, p0, v30

    add-int/lit8 v31, p1, 0x1b

    .line 176
    aget-char v31, p0, v31

    add-int/lit8 v32, p1, 0x1c

    .line 177
    aget-char v32, p0, v32

    add-int/lit8 v33, p1, 0x1d

    .line 178
    aget-char v33, p0, v33

    move/from16 v34, v25

    move/from16 v25, v8

    move/from16 v8, v34

    move/from16 v34, v27

    move/from16 v35, v28

    move/from16 v36, v29

    move/from16 v37, v30

    move/from16 v38, v31

    move/from16 v39, v32

    move/from16 v40, v33

    :goto_1
    move/from16 v27, v26

    :goto_2
    move/from16 v26, v24

    :goto_3
    move/from16 v24, v7

    goto/16 :goto_6

    :pswitch_0
    add-int/lit8 v24, p1, 0x14

    .line 179
    aget-char v24, p0, v24

    add-int/lit8 v25, p1, 0x15

    .line 180
    aget-char v25, p0, v25

    add-int/lit8 v26, p1, 0x16

    .line 181
    aget-char v26, p0, v26

    add-int/lit8 v27, p1, 0x17

    .line 182
    aget-char v27, p0, v27

    add-int/lit8 v28, p1, 0x18

    .line 183
    aget-char v28, p0, v28

    add-int/lit8 v29, p1, 0x19

    .line 184
    aget-char v29, p0, v29

    add-int/lit8 v30, p1, 0x1a

    .line 185
    aget-char v30, p0, v30

    add-int/lit8 v31, p1, 0x1b

    .line 186
    aget-char v31, p0, v31

    add-int/lit8 v32, p1, 0x1c

    .line 187
    aget-char v32, p0, v32

    move/from16 v34, v25

    move/from16 v25, v8

    move/from16 v8, v34

    move/from16 v34, v27

    move/from16 v35, v28

    move/from16 v36, v29

    move/from16 v37, v30

    move/from16 v38, v31

    move/from16 v39, v32

    :goto_4
    const/16 v40, 0x0

    goto :goto_1

    :pswitch_1
    add-int/lit8 v24, p1, 0x14

    .line 188
    aget-char v24, p0, v24

    add-int/lit8 v25, p1, 0x15

    .line 189
    aget-char v25, p0, v25

    add-int/lit8 v26, p1, 0x16

    .line 190
    aget-char v26, p0, v26

    add-int/lit8 v27, p1, 0x17

    .line 191
    aget-char v27, p0, v27

    add-int/lit8 v28, p1, 0x18

    .line 192
    aget-char v28, p0, v28

    add-int/lit8 v29, p1, 0x19

    .line 193
    aget-char v29, p0, v29

    add-int/lit8 v30, p1, 0x1a

    .line 194
    aget-char v30, p0, v30

    add-int/lit8 v31, p1, 0x1b

    .line 195
    aget-char v31, p0, v31

    move/from16 v34, v25

    move/from16 v25, v8

    move/from16 v8, v34

    move/from16 v39, v18

    move/from16 v34, v27

    move/from16 v35, v28

    move/from16 v36, v29

    move/from16 v37, v30

    move/from16 v38, v31

    goto :goto_4

    :pswitch_2
    add-int/lit8 v24, p1, 0x14

    .line 196
    aget-char v24, p0, v24

    add-int/lit8 v25, p1, 0x15

    .line 197
    aget-char v25, p0, v25

    add-int/lit8 v26, p1, 0x16

    .line 198
    aget-char v26, p0, v26

    add-int/lit8 v27, p1, 0x17

    .line 199
    aget-char v27, p0, v27

    add-int/lit8 v28, p1, 0x18

    .line 200
    aget-char v28, p0, v28

    add-int/lit8 v29, p1, 0x19

    .line 201
    aget-char v29, p0, v29

    add-int/lit8 v30, p1, 0x1a

    .line 202
    aget-char v30, p0, v30

    move/from16 v34, v25

    move/from16 v25, v8

    move/from16 v8, v34

    move/from16 v38, v18

    move/from16 v39, v38

    move/from16 v34, v27

    move/from16 v35, v28

    move/from16 v36, v29

    move/from16 v37, v30

    goto :goto_4

    :pswitch_3
    add-int/lit8 v24, p1, 0x14

    .line 203
    aget-char v24, p0, v24

    add-int/lit8 v25, p1, 0x15

    .line 204
    aget-char v25, p0, v25

    add-int/lit8 v26, p1, 0x16

    .line 205
    aget-char v26, p0, v26

    add-int/lit8 v27, p1, 0x17

    .line 206
    aget-char v27, p0, v27

    add-int/lit8 v28, p1, 0x18

    .line 207
    aget-char v28, p0, v28

    add-int/lit8 v29, p1, 0x19

    .line 208
    aget-char v29, p0, v29

    move/from16 v34, v25

    move/from16 v25, v8

    move/from16 v8, v34

    move/from16 v37, v18

    move/from16 v38, v37

    move/from16 v39, v38

    move/from16 v34, v27

    move/from16 v35, v28

    move/from16 v36, v29

    goto/16 :goto_4

    :pswitch_4
    add-int/lit8 v24, p1, 0x14

    .line 209
    aget-char v24, p0, v24

    add-int/lit8 v25, p1, 0x15

    .line 210
    aget-char v25, p0, v25

    add-int/lit8 v26, p1, 0x16

    .line 211
    aget-char v26, p0, v26

    add-int/lit8 v27, p1, 0x17

    .line 212
    aget-char v27, p0, v27

    add-int/lit8 v28, p1, 0x18

    .line 213
    aget-char v28, p0, v28

    move/from16 v34, v25

    move/from16 v25, v8

    move/from16 v8, v34

    move/from16 v36, v18

    move/from16 v37, v36

    move/from16 v38, v37

    move/from16 v39, v38

    move/from16 v34, v27

    move/from16 v35, v28

    goto/16 :goto_4

    :pswitch_5
    add-int/lit8 v24, p1, 0x14

    .line 214
    aget-char v24, p0, v24

    add-int/lit8 v25, p1, 0x15

    .line 215
    aget-char v25, p0, v25

    add-int/lit8 v26, p1, 0x16

    .line 216
    aget-char v26, p0, v26

    add-int/lit8 v27, p1, 0x17

    .line 217
    aget-char v27, p0, v27

    move/from16 v34, v25

    move/from16 v25, v8

    move/from16 v8, v34

    move/from16 v35, v18

    move/from16 v36, v35

    move/from16 v37, v36

    move/from16 v38, v37

    move/from16 v39, v38

    move/from16 v34, v27

    goto/16 :goto_4

    :pswitch_6
    add-int/lit8 v24, p1, 0x14

    .line 218
    aget-char v24, p0, v24

    add-int/lit8 v25, p1, 0x15

    .line 219
    aget-char v25, p0, v25

    add-int/lit8 v26, p1, 0x16

    .line 220
    aget-char v26, p0, v26

    move/from16 v27, v25

    move/from16 v25, v8

    move/from16 v8, v27

    move/from16 v34, v18

    move/from16 v35, v34

    move/from16 v36, v35

    move/from16 v37, v36

    move/from16 v38, v37

    move/from16 v39, v38

    move/from16 v27, v26

    const/16 v40, 0x0

    goto/16 :goto_2

    :pswitch_7
    add-int/lit8 v24, p1, 0x14

    .line 221
    aget-char v24, p0, v24

    add-int/lit8 v25, p1, 0x15

    .line 222
    aget-char v25, p0, v25

    move/from16 v26, v25

    move/from16 v25, v8

    move/from16 v8, v26

    move/from16 v27, v18

    :goto_5
    move/from16 v34, v27

    move/from16 v35, v34

    move/from16 v36, v35

    move/from16 v37, v36

    move/from16 v38, v37

    move/from16 v39, v38

    move/from16 v26, v24

    const/16 v40, 0x0

    goto/16 :goto_3

    :pswitch_8
    add-int/lit8 v24, p1, 0x14

    .line 223
    aget-char v24, p0, v24

    move/from16 v25, v8

    move/from16 v8, v18

    move/from16 v27, v8

    goto :goto_5

    :pswitch_9
    move/from16 v24, v7

    move/from16 v25, v8

    move/from16 v8, v18

    move/from16 v27, v8

    move/from16 v34, v27

    move/from16 v35, v34

    move/from16 v36, v35

    move/from16 v37, v36

    move/from16 v38, v37

    move/from16 v39, v38

    const/16 v26, 0x0

    const/16 v40, 0x0

    :goto_6
    const/16 v31, 0x1

    const/16 v7, 0x2d

    move/from16 v33, v8

    const/16 v8, 0x3a

    if-ne v11, v7, :cond_6

    if-ne v14, v7, :cond_6

    const/16 v7, 0x20

    if-eq v4, v7, :cond_4

    const/16 v7, 0x54

    if-ne v4, v7, :cond_6

    :cond_4
    if-ne v3, v8, :cond_6

    if-ne v0, v8, :cond_6

    const/16 v7, 0x5b

    if-eq v1, v7, :cond_5

    const/16 v7, 0x5a

    if-eq v1, v7, :cond_5

    const/16 v7, 0x2b

    if-eq v1, v7, :cond_5

    const/16 v7, 0x2d

    if-eq v1, v7, :cond_5

    const/16 v7, 0x20

    if-ne v1, v7, :cond_6

    :cond_5
    const/4 v0, 0x0

    move-object/from16 v11, p0

    move v7, v2

    move/from16 v51, v6

    move/from16 v43, v9

    move/from16 v44, v10

    move/from16 v45, v12

    move/from16 v46, v13

    move/from16 v53, v15

    move/from16 v54, v16

    move-object/from16 v2, v17

    move/from16 v55, v18

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v59, v58

    move/from16 v60, v59

    move/from16 v61, v60

    move/from16 v62, v61

    move/from16 v63, v62

    move/from16 v48, v19

    move/from16 v47, v20

    move/from16 v52, v21

    move/from16 v6, v22

    move/from16 v41, v24

    move/from16 v42, v25

    const/4 v1, 0x0

    move v15, v5

    const/16 v5, 0x13

    goto/16 :goto_82

    :cond_6
    const/16 v7, 0x2d

    if-ne v11, v7, :cond_7

    if-ne v14, v7, :cond_7

    const/16 v7, 0x20

    if-ne v4, v7, :cond_7

    if-ne v5, v7, :cond_7

    if-ne v6, v8, :cond_7

    if-ne v15, v8, :cond_7

    const/16 v7, 0x14

    if-ne v2, v7, :cond_8

    move-object/from16 v11, p0

    move/from16 v52, v0

    move/from16 v54, v1

    move v6, v3

    move v5, v7

    move/from16 v43, v9

    move/from16 v44, v10

    move/from16 v45, v12

    move/from16 v46, v13

    move/from16 v53, v16

    move/from16 v55, v18

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v59, v58

    move/from16 v60, v59

    move/from16 v61, v60

    move/from16 v62, v61

    move/from16 v63, v62

    move/from16 v48, v19

    move/from16 v47, v20

    move/from16 v51, v21

    move/from16 v15, v22

    move/from16 v41, v24

    move/from16 v42, v25

    const/4 v1, 0x0

    const/4 v0, 0x0

    :goto_7
    move v7, v2

    move-object/from16 v2, v17

    goto/16 :goto_82

    :cond_7
    const/16 v7, 0x14

    :cond_8
    if-ne v2, v7, :cond_a

    const/16 v7, 0x20

    if-ne v9, v7, :cond_a

    if-ne v13, v7, :cond_a

    if-ne v5, v7, :cond_a

    if-ne v6, v8, :cond_a

    if-ne v15, v8, :cond_a

    .line 224
    invoke-static {v10, v11, v12}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v5

    if-lez v5, :cond_9

    .line 225
    div-int/lit8 v6, v5, 0xa

    add-int/lit8 v6, v6, 0x30

    int-to-char v6, v6

    .line 226
    rem-int/lit8 v5, v5, 0xa

    add-int/lit8 v5, v5, 0x30

    int-to-char v5, v5

    goto :goto_8

    :cond_9
    move/from16 v5, v18

    move v6, v5

    :goto_8
    move-object/from16 v11, p0

    move/from16 v52, v0

    move/from16 v54, v1

    move v7, v2

    move/from16 v44, v4

    move/from16 v46, v5

    move/from16 v45, v6

    move/from16 v41, v14

    move/from16 v53, v16

    move-object/from16 v2, v17

    move/from16 v55, v18

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v59, v58

    move/from16 v60, v59

    move/from16 v61, v60

    move/from16 v62, v61

    move/from16 v63, v62

    move/from16 v43, v19

    move/from16 v42, v20

    move/from16 v51, v21

    move/from16 v15, v22

    move/from16 v47, v24

    move/from16 v48, v25

    const/4 v1, 0x0

    const/16 v5, 0x14

    const/4 v0, 0x0

    move v6, v3

    goto/16 :goto_82

    :cond_a
    const/16 v7, 0x2d

    if-ne v11, v7, :cond_b

    if-ne v14, v7, :cond_b

    const/16 v7, 0x20

    if-eq v4, v7, :cond_c

    const/16 v7, 0x54

    if-ne v4, v7, :cond_b

    goto :goto_9

    :cond_b
    move/from16 v7, v33

    goto/16 :goto_d

    :cond_c
    :goto_9
    if-ne v3, v8, :cond_b

    if-ne v0, v8, :cond_b

    const/16 v7, 0x2e

    if-ne v1, v7, :cond_b

    const/16 v7, 0x15

    if-eq v2, v7, :cond_e

    move/from16 v7, v33

    const/16 v8, 0x5b

    if-eq v7, v8, :cond_d

    const/16 v8, 0x2b

    if-eq v7, v8, :cond_d

    const/16 v8, 0x2d

    if-eq v7, v8, :cond_d

    const/16 v8, 0x5a

    if-ne v7, v8, :cond_10

    :cond_d
    :goto_a
    const/16 v0, 0x7c

    goto :goto_b

    :cond_e
    move/from16 v7, v33

    goto :goto_a

    :goto_b
    if-ne v7, v0, :cond_f

    move/from16 v0, v31

    goto :goto_c

    :cond_f
    const/4 v0, 0x0

    :goto_c
    move-object/from16 v11, p0

    move v1, v0

    move v7, v2

    move/from16 v51, v6

    move/from16 v43, v9

    move/from16 v44, v10

    move/from16 v45, v12

    move/from16 v46, v13

    move/from16 v53, v15

    move/from16 v54, v16

    move-object/from16 v2, v17

    move/from16 v56, v18

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v59, v58

    move/from16 v60, v59

    move/from16 v61, v60

    move/from16 v62, v61

    move/from16 v63, v62

    move/from16 v48, v19

    move/from16 v47, v20

    move/from16 v52, v21

    move/from16 v6, v22

    move/from16 v41, v24

    move/from16 v42, v25

    move/from16 v55, v26

    const/4 v0, 0x0

    move v15, v5

    const/16 v5, 0x15

    goto/16 :goto_82

    :cond_10
    :goto_d
    const/16 v8, 0x2d

    if-ne v11, v8, :cond_12

    if-ne v14, v8, :cond_12

    const/16 v8, 0x20

    if-eq v4, v8, :cond_11

    const/16 v8, 0x54

    if-ne v4, v8, :cond_12

    :cond_11
    const/16 v8, 0x3a

    goto :goto_e

    :cond_12
    move/from16 v8, v27

    move/from16 v27, v6

    goto/16 :goto_13

    :goto_e
    if-ne v3, v8, :cond_12

    if-ne v0, v8, :cond_12

    const/16 v8, 0x2e

    if-ne v1, v8, :cond_12

    const/16 v8, 0x16

    if-eq v2, v8, :cond_14

    move/from16 v8, v27

    move/from16 v27, v6

    const/16 v6, 0x5b

    if-eq v8, v6, :cond_13

    const/16 v6, 0x2b

    if-eq v8, v6, :cond_13

    const/16 v6, 0x2d

    if-eq v8, v6, :cond_13

    const/16 v6, 0x5a

    if-ne v8, v6, :cond_16

    :cond_13
    :goto_f
    const/16 v0, 0x7c

    goto :goto_10

    :cond_14
    move/from16 v8, v27

    move/from16 v27, v6

    goto :goto_f

    :goto_10
    if-ne v8, v0, :cond_15

    move/from16 v0, v31

    goto :goto_11

    :cond_15
    const/4 v0, 0x0

    :goto_11
    move-object/from16 v11, p0

    move v1, v0

    move/from16 v56, v7

    move/from16 v43, v9

    move/from16 v44, v10

    move/from16 v45, v12

    move/from16 v46, v13

    move/from16 v53, v15

    move/from16 v54, v16

    move/from16 v57, v18

    move/from16 v58, v57

    move/from16 v59, v58

    move/from16 v60, v59

    move/from16 v61, v60

    move/from16 v62, v61

    move/from16 v63, v62

    move/from16 v48, v19

    move/from16 v47, v20

    move/from16 v52, v21

    move/from16 v6, v22

    move/from16 v41, v24

    move/from16 v42, v25

    move/from16 v55, v26

    move/from16 v51, v27

    const/4 v0, 0x0

    move v7, v2

    move v15, v5

    move-object/from16 v2, v17

    :goto_12
    const/16 v5, 0x16

    goto/16 :goto_82

    :cond_16
    :goto_13
    const/16 v6, 0x2d

    if-ne v11, v6, :cond_18

    if-ne v14, v6, :cond_18

    const/16 v6, 0x20

    if-eq v4, v6, :cond_17

    const/16 v6, 0x54

    if-ne v4, v6, :cond_18

    :cond_17
    const/16 v6, 0x3a

    if-ne v3, v6, :cond_18

    const/16 v6, 0x5a

    if-ne v0, v6, :cond_18

    const/16 v6, 0x5b

    if-ne v15, v6, :cond_18

    const/16 v6, 0x5d

    if-ne v7, v6, :cond_18

    const/16 v6, 0x16

    if-ne v2, v6, :cond_18

    const/4 v0, 0x0

    move-object/from16 v11, p0

    move v7, v2

    move v15, v5

    move/from16 v43, v9

    move/from16 v44, v10

    move/from16 v45, v12

    move/from16 v46, v13

    move-object/from16 v2, v17

    move/from16 v53, v18

    move/from16 v54, v53

    move/from16 v55, v54

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v59, v58

    move/from16 v60, v59

    move/from16 v61, v60

    move/from16 v62, v61

    move/from16 v63, v62

    move/from16 v48, v19

    move/from16 v47, v20

    move/from16 v52, v21

    move/from16 v6, v22

    move/from16 v41, v24

    move/from16 v42, v25

    move/from16 v51, v27

    move/from16 v1, v31

    const/16 v5, 0x11

    goto/16 :goto_82

    :cond_18
    const/16 v6, 0x16

    if-ne v2, v6, :cond_1e

    const/16 v6, 0x20

    if-ne v10, v6, :cond_1e

    move/from16 v49, v11

    const/16 v11, 0x2c

    if-ne v12, v11, :cond_1d

    if-ne v13, v6, :cond_1d

    if-ne v5, v6, :cond_1d

    const/16 v11, 0x3a

    if-ne v3, v11, :cond_1d

    if-ne v0, v11, :cond_1d

    if-ne v1, v6, :cond_1d

    move/from16 v6, v26

    const/16 v11, 0x41

    if-eq v6, v11, :cond_19

    const/16 v11, 0x50

    if-ne v6, v11, :cond_1a

    :cond_19
    const/16 v11, 0x4d

    goto :goto_15

    :cond_1a
    move/from16 v11, v24

    :goto_14
    move/from16 v24, v14

    move/from16 v14, v25

    move/from16 v25, v11

    const/16 v11, 0x16

    goto/16 :goto_1a

    :goto_15
    if-ne v7, v11, :cond_1a

    move/from16 v11, v24

    move/from16 v24, v14

    move/from16 v14, v25

    .line 227
    invoke-static {v11, v14, v9}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v0

    if-lez v0, :cond_1b

    .line 228
    div-int/lit8 v1, v0, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    .line 229
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    move v8, v0

    move v7, v1

    :goto_16
    const/16 v11, 0x50

    goto :goto_17

    :cond_1b
    move/from16 v7, v18

    move v8, v7

    goto :goto_16

    :goto_17
    if-ne v6, v11, :cond_1c

    move/from16 v0, v31

    goto :goto_18

    :cond_1c
    const/4 v0, 0x0

    :goto_18
    move-object/from16 v11, p0

    move/from16 v44, v4

    move/from16 v45, v7

    move/from16 v46, v8

    move/from16 v53, v15

    move/from16 v54, v16

    move/from16 v15, v18

    move/from16 v47, v15

    move/from16 v55, v47

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v59, v58

    move/from16 v60, v59

    move/from16 v61, v60

    move/from16 v62, v61

    move/from16 v63, v62

    move/from16 v43, v19

    move/from16 v42, v20

    move/from16 v52, v21

    move/from16 v6, v22

    move/from16 v41, v24

    move/from16 v51, v27

    move/from16 v48, v49

    const/4 v1, 0x0

    const/16 v5, 0x16

    goto/16 :goto_7

    :cond_1d
    :goto_19
    move/from16 v11, v24

    move/from16 v6, v26

    goto :goto_14

    :cond_1e
    move/from16 v49, v11

    goto :goto_19

    :goto_1a
    if-ne v2, v11, :cond_1f

    const/16 v11, 0x2f

    if-ne v9, v11, :cond_1f

    if-ne v12, v11, :cond_1f

    const/16 v11, 0x20

    if-ne v4, v11, :cond_1f

    const/16 v11, 0x3a

    if-ne v3, v11, :cond_1f

    if-ne v0, v11, :cond_1f

    const/16 v11, 0x20

    if-ne v1, v11, :cond_1f

    const/16 v11, 0x41

    if-eq v6, v11, :cond_20

    const/16 v11, 0x50

    if-ne v6, v11, :cond_1f

    :goto_1b
    move/from16 v26, v1

    const/16 v1, 0x4d

    goto :goto_1c

    :cond_1f
    move/from16 v26, v1

    goto :goto_1e

    :cond_20
    const/16 v11, 0x50

    goto :goto_1b

    :goto_1c
    if-ne v7, v1, :cond_22

    if-ne v6, v11, :cond_21

    move/from16 v0, v31

    goto :goto_1d

    :cond_21
    const/4 v0, 0x0

    :goto_1d
    move-object/from16 v11, p0

    move v7, v2

    move/from16 v47, v10

    move/from16 v41, v13

    move/from16 v46, v14

    move/from16 v53, v15

    move/from16 v54, v16

    move-object/from16 v2, v17

    move/from16 v55, v18

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v59, v58

    move/from16 v60, v59

    move/from16 v61, v60

    move/from16 v62, v61

    move/from16 v63, v62

    move/from16 v44, v19

    move/from16 v43, v20

    move/from16 v52, v21

    move/from16 v6, v22

    move/from16 v42, v24

    move/from16 v45, v25

    move/from16 v51, v27

    move/from16 v48, v49

    const/4 v1, 0x0

    move v15, v5

    goto/16 :goto_12

    :cond_22
    :goto_1e
    const/16 v1, 0x17

    if-ne v2, v1, :cond_27

    const/16 v11, 0x20

    if-ne v10, v11, :cond_27

    const/16 v1, 0x2c

    if-ne v12, v1, :cond_27

    if-ne v13, v11, :cond_27

    if-ne v5, v11, :cond_27

    move/from16 v1, v27

    const/16 v11, 0x3a

    if-ne v1, v11, :cond_24

    if-ne v15, v11, :cond_24

    const/16 v11, 0x20

    if-ne v6, v11, :cond_24

    const/16 v11, 0x41

    if-eq v7, v11, :cond_23

    const/16 v11, 0x50

    if-ne v7, v11, :cond_24

    :cond_23
    const/16 v11, 0x4d

    goto :goto_20

    :cond_24
    move/from16 v11, v25

    :goto_1f
    move/from16 v25, v0

    const/16 v0, 0x17

    goto/16 :goto_26

    :goto_20
    if-ne v8, v11, :cond_24

    move/from16 v11, v25

    .line 230
    invoke-static {v11, v14, v9}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v1

    if-lez v1, :cond_25

    .line 231
    div-int/lit8 v5, v1, 0xa

    add-int/lit8 v5, v5, 0x30

    int-to-char v5, v5

    .line 232
    rem-int/lit8 v1, v1, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    move v8, v1

    :goto_21
    const/16 v11, 0x50

    goto :goto_22

    :cond_25
    move/from16 v5, v18

    move v8, v5

    goto :goto_21

    :goto_22
    if-ne v7, v11, :cond_26

    move/from16 v1, v31

    goto :goto_23

    :cond_26
    const/4 v1, 0x0

    :goto_23
    move-object/from16 v11, p0

    move/from16 v52, v0

    move v0, v1

    move v7, v2

    move v6, v3

    move/from16 v44, v4

    move/from16 v45, v5

    move/from16 v46, v8

    move/from16 v53, v16

    move-object/from16 v2, v17

    move/from16 v47, v18

    move/from16 v55, v47

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v59, v58

    move/from16 v60, v59

    move/from16 v61, v60

    move/from16 v62, v61

    move/from16 v63, v62

    move/from16 v43, v19

    move/from16 v42, v20

    move/from16 v51, v21

    move/from16 v15, v22

    move/from16 v41, v24

    move/from16 v54, v26

    :goto_24
    move/from16 v48, v49

    :goto_25
    const/4 v1, 0x0

    const/16 v5, 0x17

    goto/16 :goto_82

    :cond_27
    move/from16 v11, v25

    move/from16 v1, v27

    goto :goto_1f

    :goto_26
    if-ne v2, v0, :cond_2d

    const/16 v0, 0x20

    move/from16 v27, v3

    if-ne v10, v0, :cond_2c

    const/16 v3, 0x2c

    if-ne v13, v3, :cond_2c

    move/from16 v3, v24

    move/from16 v24, v4

    move/from16 v4, v22

    if-ne v3, v0, :cond_29

    if-ne v4, v0, :cond_29

    const/16 v0, 0x3a

    if-ne v1, v0, :cond_29

    if-ne v15, v0, :cond_29

    const/16 v0, 0x20

    if-ne v6, v0, :cond_29

    const/16 v0, 0x41

    if-eq v7, v0, :cond_28

    const/16 v0, 0x50

    if-ne v7, v0, :cond_29

    :cond_28
    const/16 v0, 0x4d

    goto :goto_28

    :cond_29
    :goto_27
    const/16 v0, 0x17

    goto/16 :goto_2c

    :goto_28
    if-ne v8, v0, :cond_29

    .line 233
    invoke-static {v11, v14, v9}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v0

    if-lez v0, :cond_2a

    .line 234
    div-int/lit8 v1, v0, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    .line 235
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    move v8, v0

    :goto_29
    const/16 v11, 0x50

    goto :goto_2a

    :cond_2a
    move/from16 v1, v18

    move v8, v1

    goto :goto_29

    :goto_2a
    if-ne v7, v11, :cond_2b

    move/from16 v0, v31

    goto :goto_2b

    :cond_2b
    const/4 v0, 0x0

    :goto_2b
    move-object/from16 v11, p0

    move/from16 v45, v1

    move v7, v2

    move/from16 v44, v5

    move/from16 v46, v8

    move/from16 v48, v12

    move/from16 v53, v16

    move-object/from16 v2, v17

    move/from16 v15, v18

    move/from16 v55, v15

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v59, v58

    move/from16 v60, v59

    move/from16 v61, v60

    move/from16 v62, v61

    move/from16 v63, v62

    move/from16 v42, v19

    move/from16 v41, v20

    move/from16 v51, v21

    move/from16 v43, v24

    move/from16 v52, v25

    move/from16 v54, v26

    move/from16 v6, v27

    move/from16 v47, v49

    goto/16 :goto_25

    :cond_2c
    move/from16 v3, v24

    move/from16 v24, v4

    move/from16 v4, v22

    goto :goto_27

    :cond_2d
    move/from16 v27, v3

    move/from16 v3, v24

    move/from16 v24, v4

    move/from16 v4, v22

    :goto_2c
    if-ne v2, v0, :cond_31

    const/16 v0, 0x20

    if-ne v10, v0, :cond_31

    move/from16 v22, v3

    const/16 v3, 0x2c

    if-ne v12, v3, :cond_32

    if-ne v13, v0, :cond_32

    if-ne v5, v3, :cond_32

    if-ne v4, v0, :cond_32

    const/16 v3, 0x3a

    if-ne v1, v3, :cond_32

    if-ne v15, v3, :cond_32

    if-ne v6, v0, :cond_32

    const/16 v0, 0x41

    if-eq v7, v0, :cond_2e

    const/16 v0, 0x50

    if-ne v7, v0, :cond_32

    :cond_2e
    const/16 v0, 0x4d

    if-ne v8, v0, :cond_32

    .line 236
    invoke-static {v11, v14, v9}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v0

    if-lez v0, :cond_2f

    .line 237
    div-int/lit8 v1, v0, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    .line 238
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    move v8, v0

    :goto_2d
    const/16 v11, 0x50

    goto :goto_2e

    :cond_2f
    move/from16 v1, v18

    move v8, v1

    goto :goto_2d

    :goto_2e
    if-ne v7, v11, :cond_30

    move/from16 v0, v31

    goto :goto_2f

    :cond_30
    const/4 v0, 0x0

    :goto_2f
    move-object/from16 v11, p0

    move/from16 v45, v1

    move v7, v2

    move/from16 v46, v8

    move/from16 v53, v16

    move-object/from16 v2, v17

    move/from16 v15, v18

    move/from16 v47, v15

    move/from16 v55, v47

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v59, v58

    move/from16 v60, v59

    move/from16 v61, v60

    move/from16 v62, v61

    move/from16 v63, v62

    move/from16 v43, v19

    move/from16 v42, v20

    move/from16 v51, v21

    move/from16 v41, v22

    move/from16 v44, v24

    move/from16 v52, v25

    move/from16 v54, v26

    move/from16 v6, v27

    goto/16 :goto_24

    :cond_31
    move/from16 v22, v3

    :cond_32
    const/16 v0, 0x18

    if-ne v2, v0, :cond_3b

    const/16 v3, 0x20

    if-ne v10, v3, :cond_3b

    const/16 v0, 0x2c

    if-ne v13, v0, :cond_3b

    move/from16 v0, v22

    if-ne v0, v3, :cond_3a

    if-ne v4, v3, :cond_3a

    move/from16 v3, v21

    move/from16 v21, v6

    const/16 v6, 0x3a

    move/from16 v22, v1

    move/from16 v1, v16

    if-ne v3, v6, :cond_39

    if-ne v1, v6, :cond_38

    const/16 v6, 0x20

    if-ne v7, v6, :cond_38

    const/16 v6, 0x41

    if-eq v8, v6, :cond_33

    const/16 v6, 0x50

    if-ne v8, v6, :cond_34

    :cond_33
    move/from16 v16, v15

    move/from16 v6, v34

    const/16 v15, 0x4d

    goto :goto_31

    :cond_34
    move/from16 v16, v15

    move/from16 v6, v34

    move/from16 v15, v49

    move/from16 v34, v5

    :goto_30
    const/16 v5, 0x2d

    goto/16 :goto_39

    :goto_31
    if-ne v6, v15, :cond_37

    .line 239
    invoke-static {v11, v14, v9}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v0

    if-lez v0, :cond_35

    .line 240
    div-int/lit8 v1, v0, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    .line 241
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    move v7, v1

    :goto_32
    const/16 v11, 0x50

    goto :goto_33

    :cond_35
    move/from16 v0, v18

    move v7, v0

    goto :goto_32

    :goto_33
    if-ne v8, v11, :cond_36

    move/from16 v1, v31

    goto :goto_34

    :cond_36
    const/4 v1, 0x0

    :goto_34
    move-object/from16 v11, p0

    move/from16 v46, v0

    move v0, v1

    move/from16 v44, v5

    move/from16 v45, v7

    move/from16 v48, v12

    move/from16 v52, v16

    move/from16 v55, v18

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v59, v58

    move/from16 v60, v59

    move/from16 v61, v60

    move/from16 v62, v61

    move/from16 v63, v62

    move/from16 v42, v19

    move/from16 v41, v20

    move/from16 v54, v21

    move/from16 v6, v22

    move/from16 v43, v24

    move/from16 v51, v25

    move/from16 v53, v26

    move/from16 v15, v27

    move/from16 v47, v49

    :goto_35
    const/4 v1, 0x0

    const/16 v5, 0x18

    goto/16 :goto_7

    :cond_37
    :goto_36
    move/from16 v34, v5

    move/from16 v15, v49

    goto :goto_30

    :cond_38
    :goto_37
    move/from16 v16, v15

    move/from16 v6, v34

    goto :goto_36

    :cond_39
    :goto_38
    move/from16 v6, v34

    move/from16 v16, v15

    goto :goto_36

    :cond_3a
    move/from16 v22, v1

    move/from16 v1, v16

    move/from16 v3, v21

    move/from16 v21, v6

    goto :goto_37

    :cond_3b
    move/from16 v3, v21

    move/from16 v0, v22

    move/from16 v22, v1

    move/from16 v21, v6

    move/from16 v1, v16

    goto :goto_38

    :goto_39
    if-ne v15, v5, :cond_44

    if-ne v0, v5, :cond_44

    move/from16 v5, v24

    move/from16 v24, v12

    const/16 v12, 0x20

    if-eq v5, v12, :cond_3c

    const/16 v12, 0x54

    if-ne v5, v12, :cond_3d

    :cond_3c
    move/from16 v12, v27

    move/from16 v27, v9

    const/16 v9, 0x3a

    goto :goto_3c

    :cond_3d
    move/from16 v49, v11

    move/from16 v11, v25

    move/from16 v12, v27

    move/from16 v27, v9

    move/from16 v25, v14

    :cond_3e
    :goto_3a
    move/from16 v9, v26

    :cond_3f
    :goto_3b
    const/16 v14, 0x2d

    goto/16 :goto_41

    :goto_3c
    move/from16 v49, v11

    move/from16 v11, v25

    if-ne v12, v9, :cond_43

    move/from16 v25, v14

    if-ne v11, v9, :cond_3e

    move/from16 v9, v26

    const/16 v14, 0x2e

    if-ne v9, v14, :cond_3f

    const/16 v14, 0x17

    if-eq v2, v14, :cond_40

    const/16 v14, 0x5b

    if-eq v6, v14, :cond_40

    const/16 v14, 0x7c

    if-eq v6, v14, :cond_41

    const/16 v14, 0x2b

    if-eq v6, v14, :cond_40

    const/16 v14, 0x2d

    if-eq v6, v14, :cond_40

    const/16 v14, 0x5a

    if-ne v6, v14, :cond_3f

    :cond_40
    const/16 v0, 0x7c

    goto :goto_3d

    :cond_41
    move v0, v14

    :goto_3d
    if-ne v6, v0, :cond_42

    move/from16 v0, v31

    goto :goto_3e

    :cond_42
    const/4 v0, 0x0

    :goto_3e
    move-object/from16 v11, p0

    move/from16 v54, v1

    move/from16 v52, v3

    move v6, v4

    move/from16 v56, v7

    move/from16 v57, v8

    move/from16 v44, v10

    move/from16 v46, v13

    move/from16 v53, v16

    move/from16 v58, v18

    move/from16 v59, v58

    move/from16 v60, v59

    move/from16 v61, v60

    move/from16 v62, v61

    move/from16 v63, v62

    move/from16 v48, v19

    move/from16 v47, v20

    move/from16 v55, v21

    move/from16 v51, v22

    move/from16 v45, v24

    move/from16 v42, v25

    move/from16 v43, v27

    move/from16 v15, v34

    move/from16 v41, v49

    const/16 v5, 0x17

    move v1, v0

    move v7, v2

    :goto_3f
    move-object/from16 v2, v17

    :goto_40
    const/4 v0, 0x0

    goto/16 :goto_82

    :cond_43
    move/from16 v9, v26

    move/from16 v25, v14

    goto :goto_3b

    :cond_44
    move/from16 v49, v11

    move/from16 v5, v24

    move/from16 v11, v25

    move/from16 v24, v12

    move/from16 v25, v14

    move/from16 v12, v27

    move/from16 v27, v9

    goto/16 :goto_3a

    :goto_41
    if-ne v15, v14, :cond_46

    if-ne v0, v14, :cond_46

    const/16 v14, 0x20

    if-eq v5, v14, :cond_45

    const/16 v14, 0x54

    if-ne v5, v14, :cond_46

    :cond_45
    const/16 v14, 0x3a

    goto :goto_42

    :cond_46
    move/from16 v26, v9

    move/from16 v14, v35

    :cond_47
    const/16 v9, 0x18

    goto/16 :goto_46

    :goto_42
    if-ne v12, v14, :cond_46

    if-ne v11, v14, :cond_46

    const/16 v14, 0x2e

    if-ne v9, v14, :cond_46

    const/16 v14, 0x18

    if-eq v2, v14, :cond_4a

    move/from16 v26, v9

    move/from16 v14, v35

    const/16 v9, 0x5b

    if-eq v14, v9, :cond_48

    const/16 v9, 0x7c

    if-eq v14, v9, :cond_49

    const/16 v9, 0x2b

    if-eq v14, v9, :cond_48

    const/16 v9, 0x2d

    if-eq v14, v9, :cond_48

    const/16 v9, 0x5a

    if-ne v14, v9, :cond_47

    :cond_48
    :goto_43
    const/16 v0, 0x7c

    goto :goto_44

    :cond_49
    move v0, v9

    goto :goto_44

    :cond_4a
    move/from16 v14, v35

    goto :goto_43

    :goto_44
    if-ne v14, v0, :cond_4b

    move/from16 v0, v31

    goto :goto_45

    :cond_4b
    const/4 v0, 0x0

    :goto_45
    move-object/from16 v11, p0

    move/from16 v54, v1

    move/from16 v52, v3

    move/from16 v58, v6

    move/from16 v56, v7

    move/from16 v57, v8

    move/from16 v44, v10

    move/from16 v46, v13

    move/from16 v53, v16

    move/from16 v59, v18

    move/from16 v60, v59

    move/from16 v61, v60

    move/from16 v62, v61

    move/from16 v63, v62

    move/from16 v48, v19

    move/from16 v47, v20

    move/from16 v55, v21

    move/from16 v51, v22

    move/from16 v45, v24

    move/from16 v42, v25

    move/from16 v43, v27

    move/from16 v15, v34

    move/from16 v41, v49

    const/16 v5, 0x18

    move v1, v0

    move v7, v2

    move v6, v4

    goto/16 :goto_3f

    :goto_46
    if-ne v2, v9, :cond_50

    const/16 v9, 0x20

    if-ne v10, v9, :cond_50

    move/from16 v35, v14

    const/16 v14, 0x2c

    if-ne v13, v14, :cond_4d

    if-ne v0, v9, :cond_4d

    if-ne v4, v14, :cond_4d

    if-ne v12, v9, :cond_4d

    const/16 v14, 0x3a

    if-ne v3, v14, :cond_4d

    if-ne v1, v14, :cond_4d

    if-ne v7, v9, :cond_4d

    const/16 v9, 0x41

    if-eq v8, v9, :cond_4c

    const/16 v9, 0x50

    if-ne v8, v9, :cond_4d

    :cond_4c
    const/16 v9, 0x4d

    goto :goto_48

    :cond_4d
    :goto_47
    move/from16 v14, v25

    move/from16 v9, v49

    move/from16 v25, v11

    move/from16 v11, v27

    move/from16 v27, v12

    const/16 v12, 0x18

    goto/16 :goto_4c

    :goto_48
    if-ne v6, v9, :cond_4d

    move/from16 v14, v25

    move/from16 v9, v49

    move/from16 v25, v11

    move/from16 v11, v27

    .line 242
    invoke-static {v9, v14, v11}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v0

    if-lez v0, :cond_4e

    .line 243
    div-int/lit8 v1, v0, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    .line 244
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    move v7, v1

    :goto_49
    const/16 v11, 0x50

    goto :goto_4a

    :cond_4e
    move/from16 v0, v18

    move v7, v0

    goto :goto_49

    :goto_4a
    if-ne v8, v11, :cond_4f

    move/from16 v1, v31

    goto :goto_4b

    :cond_4f
    const/4 v1, 0x0

    :goto_4b
    move-object/from16 v11, p0

    move/from16 v46, v0

    move v0, v1

    move/from16 v43, v5

    move/from16 v45, v7

    move/from16 v47, v15

    move/from16 v52, v16

    move/from16 v15, v18

    move/from16 v55, v15

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v59, v58

    move/from16 v60, v59

    move/from16 v61, v60

    move/from16 v62, v61

    move/from16 v63, v62

    move/from16 v42, v19

    move/from16 v41, v20

    move/from16 v54, v21

    move/from16 v6, v22

    move/from16 v48, v24

    move/from16 v51, v25

    move/from16 v53, v26

    move/from16 v44, v34

    goto/16 :goto_35

    :cond_50
    move/from16 v35, v14

    goto :goto_47

    :goto_4c
    if-ne v2, v12, :cond_55

    const/16 v12, 0x20

    if-ne v10, v12, :cond_55

    move/from16 v49, v10

    move/from16 v10, v24

    const/16 v2, 0x2c

    if-ne v10, v2, :cond_54

    if-ne v13, v12, :cond_54

    move/from16 v24, v10

    move/from16 v10, v34

    if-ne v10, v2, :cond_56

    if-ne v4, v12, :cond_56

    const/16 v2, 0x3a

    if-ne v3, v2, :cond_56

    if-ne v1, v2, :cond_56

    if-ne v7, v12, :cond_56

    const/16 v2, 0x41

    if-eq v8, v2, :cond_51

    const/16 v2, 0x50

    if-ne v8, v2, :cond_56

    :cond_51
    const/16 v2, 0x4d

    if-ne v6, v2, :cond_56

    .line 245
    invoke-static {v9, v14, v11}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v1

    if-lez v1, :cond_52

    .line 246
    div-int/lit8 v2, v1, 0xa

    add-int/lit8 v2, v2, 0x30

    int-to-char v2, v2

    .line 247
    rem-int/lit8 v1, v1, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    move v7, v2

    :goto_4d
    const/16 v11, 0x50

    goto :goto_4e

    :cond_52
    move/from16 v1, v18

    move v7, v1

    goto :goto_4d

    :goto_4e
    if-ne v8, v11, :cond_53

    move/from16 v2, v31

    goto :goto_4f

    :cond_53
    const/4 v2, 0x0

    :goto_4f
    move-object/from16 v11, p0

    move/from16 v41, v0

    move/from16 v46, v1

    move v0, v2

    move/from16 v44, v5

    move/from16 v45, v7

    move/from16 v48, v15

    move/from16 v52, v16

    move-object/from16 v2, v17

    move/from16 v47, v18

    move/from16 v55, v47

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v59, v58

    move/from16 v60, v59

    move/from16 v61, v60

    move/from16 v62, v61

    move/from16 v63, v62

    move/from16 v43, v19

    move/from16 v42, v20

    move/from16 v54, v21

    move/from16 v6, v22

    move/from16 v51, v25

    move/from16 v53, v26

    move/from16 v15, v27

    const/4 v1, 0x0

    const/16 v5, 0x18

    move/from16 v7, p2

    goto/16 :goto_82

    :cond_54
    move/from16 v24, v10

    :goto_50
    move/from16 v10, v34

    goto :goto_51

    :cond_55
    move/from16 v49, v10

    goto :goto_50

    :cond_56
    :goto_51
    const/16 v12, 0x2d

    if-ne v15, v12, :cond_58

    if-ne v0, v12, :cond_58

    const/16 v12, 0x20

    if-eq v5, v12, :cond_57

    const/16 v12, 0x54

    if-ne v5, v12, :cond_58

    :cond_57
    move/from16 v12, v27

    const/16 v2, 0x3a

    goto :goto_54

    :cond_58
    move/from16 v34, v10

    move/from16 v10, v25

    move/from16 v2, v26

    move/from16 v12, v27

    :goto_52
    move/from16 v26, v1

    move/from16 v25, v7

    move/from16 v1, v36

    move/from16 v7, p2

    :goto_53
    move/from16 v36, v3

    :cond_59
    const/16 v3, 0x19

    goto/16 :goto_59

    :goto_54
    move/from16 v34, v10

    move/from16 v10, v25

    if-ne v12, v2, :cond_60

    move/from16 v25, v7

    if-ne v10, v2, :cond_5f

    move/from16 v2, v26

    const/16 v7, 0x2e

    if-ne v2, v7, :cond_5e

    move/from16 v7, p2

    move/from16 v26, v1

    const/16 v1, 0x19

    if-eq v7, v1, :cond_5c

    move/from16 v1, v36

    move/from16 v36, v3

    const/16 v3, 0x5b

    if-eq v1, v3, :cond_5a

    const/16 v3, 0x7c

    if-eq v1, v3, :cond_5b

    const/16 v3, 0x2b

    if-eq v1, v3, :cond_5a

    const/16 v3, 0x2d

    if-eq v1, v3, :cond_5a

    const/16 v3, 0x5a

    if-ne v1, v3, :cond_59

    :cond_5a
    :goto_55
    const/16 v0, 0x7c

    goto :goto_56

    :cond_5b
    move v0, v3

    goto :goto_56

    :cond_5c
    move/from16 v1, v36

    move/from16 v36, v3

    goto :goto_55

    :goto_56
    if-ne v1, v0, :cond_5d

    move/from16 v0, v31

    goto :goto_57

    :cond_5d
    const/4 v0, 0x0

    :goto_57
    move v1, v0

    move/from16 v58, v6

    move/from16 v57, v8

    move/from16 v41, v9

    move/from16 v43, v11

    move/from16 v46, v13

    move/from16 v42, v14

    move/from16 v53, v16

    move-object/from16 v2, v17

    move/from16 v60, v18

    move/from16 v61, v60

    move/from16 v62, v61

    move/from16 v63, v62

    move/from16 v48, v19

    move/from16 v47, v20

    move/from16 v55, v21

    move/from16 v51, v22

    move/from16 v45, v24

    move/from16 v56, v25

    move/from16 v54, v26

    move/from16 v15, v34

    move/from16 v59, v35

    move/from16 v52, v36

    move/from16 v44, v49

    const/16 v5, 0x19

    const/4 v0, 0x0

    move-object/from16 v11, p0

    move v6, v4

    goto/16 :goto_82

    :cond_5e
    :goto_58
    move/from16 v7, p2

    move/from16 v26, v1

    move/from16 v1, v36

    goto/16 :goto_53

    :cond_5f
    move/from16 v2, v26

    goto :goto_58

    :cond_60
    move/from16 v2, v26

    goto/16 :goto_52

    :goto_59
    if-ne v7, v3, :cond_66

    move/from16 v3, v49

    move/from16 v49, v1

    const/16 v1, 0x20

    move/from16 v52, v3

    if-ne v3, v1, :cond_62

    const/16 v3, 0x2c

    if-ne v13, v3, :cond_62

    if-ne v0, v1, :cond_62

    if-ne v4, v3, :cond_62

    if-ne v12, v1, :cond_62

    const/16 v3, 0x3a

    if-ne v10, v3, :cond_62

    if-ne v2, v3, :cond_62

    if-ne v8, v1, :cond_62

    const/16 v1, 0x41

    if-eq v6, v1, :cond_61

    const/16 v1, 0x50

    if-ne v6, v1, :cond_62

    :cond_61
    move/from16 v1, v35

    const/16 v3, 0x4d

    goto :goto_5b

    :cond_62
    :goto_5a
    move/from16 v1, v35

    :cond_63
    const/16 v3, 0x2d

    goto/16 :goto_60

    :goto_5b
    if-ne v1, v3, :cond_63

    .line 248
    invoke-static {v9, v14, v11}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v0

    if-lez v0, :cond_64

    .line 249
    div-int/lit8 v1, v0, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    .line 250
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    move v8, v0

    :goto_5c
    const/16 v11, 0x50

    goto :goto_5d

    :cond_64
    move/from16 v1, v18

    move v8, v1

    goto :goto_5c

    :goto_5d
    if-ne v6, v11, :cond_65

    move/from16 v0, v31

    goto :goto_5e

    :cond_65
    const/4 v0, 0x0

    :goto_5e
    move-object/from16 v11, p0

    move/from16 v45, v1

    move/from16 v43, v5

    move/from16 v46, v8

    move/from16 v47, v15

    move/from16 v51, v16

    move-object/from16 v2, v17

    move/from16 v55, v18

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v59, v58

    move/from16 v60, v59

    move/from16 v61, v60

    move/from16 v62, v61

    move/from16 v63, v62

    move/from16 v42, v19

    move/from16 v41, v20

    move/from16 v53, v21

    move/from16 v15, v22

    move/from16 v48, v24

    move/from16 v54, v25

    move/from16 v52, v26

    move/from16 v44, v34

    move/from16 v6, v36

    const/4 v1, 0x0

    :goto_5f
    const/16 v5, 0x19

    goto/16 :goto_82

    :cond_66
    move/from16 v52, v49

    move/from16 v49, v1

    goto :goto_5a

    :goto_60
    if-ne v15, v3, :cond_68

    if-ne v0, v3, :cond_68

    const/16 v3, 0x20

    if-eq v5, v3, :cond_67

    const/16 v3, 0x54

    if-ne v5, v3, :cond_68

    :cond_67
    const/16 v3, 0x3a

    goto :goto_61

    :cond_68
    move/from16 v3, v37

    move/from16 v37, v9

    :cond_69
    const/16 v9, 0x2d

    goto/16 :goto_66

    :goto_61
    if-ne v12, v3, :cond_68

    if-ne v10, v3, :cond_68

    const/16 v3, 0x2e

    if-ne v2, v3, :cond_68

    const/16 v3, 0x1a

    if-eq v7, v3, :cond_6c

    move/from16 v3, v37

    move/from16 v37, v9

    const/16 v9, 0x5b

    if-eq v3, v9, :cond_6a

    const/16 v9, 0x7c

    if-eq v3, v9, :cond_6b

    const/16 v9, 0x2b

    if-eq v3, v9, :cond_6a

    const/16 v9, 0x2d

    if-eq v3, v9, :cond_6a

    const/16 v9, 0x5a

    if-ne v3, v9, :cond_69

    :cond_6a
    :goto_62
    const/16 v0, 0x7c

    goto :goto_63

    :cond_6b
    move v0, v9

    goto :goto_63

    :cond_6c
    move/from16 v3, v37

    move/from16 v37, v9

    goto :goto_62

    :goto_63
    if-ne v3, v0, :cond_6d

    move/from16 v0, v31

    goto :goto_64

    :cond_6d
    const/4 v0, 0x0

    :goto_64
    move/from16 v59, v1

    move/from16 v58, v6

    move/from16 v57, v8

    move/from16 v43, v11

    move/from16 v46, v13

    move/from16 v42, v14

    move/from16 v53, v16

    move-object/from16 v2, v17

    move/from16 v61, v18

    move/from16 v62, v61

    move/from16 v63, v62

    move/from16 v48, v19

    move/from16 v47, v20

    move/from16 v55, v21

    move/from16 v51, v22

    move/from16 v45, v24

    move/from16 v56, v25

    move/from16 v54, v26

    move/from16 v15, v34

    move/from16 v41, v37

    move/from16 v60, v49

    move/from16 v44, v52

    const/16 v5, 0x1a

    move-object/from16 v11, p0

    :goto_65
    move v1, v0

    move v6, v4

    move/from16 v52, v36

    goto/16 :goto_40

    :goto_66
    if-ne v15, v9, :cond_6f

    if-ne v0, v9, :cond_6f

    const/16 v9, 0x20

    if-eq v5, v9, :cond_6e

    const/16 v9, 0x54

    if-ne v5, v9, :cond_6f

    :cond_6e
    const/16 v9, 0x3a

    goto :goto_67

    :cond_6f
    move/from16 v9, v38

    move/from16 v38, v11

    goto/16 :goto_6b

    :goto_67
    if-ne v12, v9, :cond_6f

    if-ne v10, v9, :cond_6f

    const/16 v9, 0x2e

    if-ne v2, v9, :cond_6f

    const/16 v9, 0x1b

    if-eq v7, v9, :cond_71

    move/from16 v9, v38

    move/from16 v38, v11

    const/16 v11, 0x5b

    if-eq v9, v11, :cond_70

    const/16 v11, 0x7c

    if-eq v9, v11, :cond_70

    const/16 v11, 0x2b

    if-eq v9, v11, :cond_70

    const/16 v11, 0x2d

    if-eq v9, v11, :cond_70

    const/16 v11, 0x5a

    if-ne v9, v11, :cond_74

    :cond_70
    :goto_68
    const/16 v11, 0x20

    goto :goto_69

    :cond_71
    move/from16 v9, v38

    move/from16 v38, v11

    goto :goto_68

    :goto_69
    if-ne v6, v11, :cond_72

    const/4 v0, 0x0

    move-object/from16 v11, p0

    move v6, v4

    move/from16 v57, v8

    move/from16 v46, v13

    move/from16 v42, v14

    move/from16 v53, v16

    move-object/from16 v2, v17

    move/from16 v58, v18

    move/from16 v59, v58

    move/from16 v60, v59

    move/from16 v61, v60

    move/from16 v62, v61

    move/from16 v63, v62

    move/from16 v48, v19

    move/from16 v47, v20

    move/from16 v55, v21

    move/from16 v51, v22

    move/from16 v45, v24

    move/from16 v56, v25

    move/from16 v54, v26

    move/from16 v15, v34

    move/from16 v41, v37

    move/from16 v43, v38

    move/from16 v44, v52

    const/4 v1, 0x0

    const/16 v5, 0x17

    move/from16 v52, v36

    goto/16 :goto_82

    :cond_72
    const/16 v0, 0x7c

    if-ne v9, v0, :cond_73

    move/from16 v0, v31

    goto :goto_6a

    :cond_73
    const/4 v0, 0x0

    :goto_6a
    move-object/from16 v11, p0

    move/from16 v59, v1

    move/from16 v61, v3

    move/from16 v58, v6

    move/from16 v57, v8

    move/from16 v46, v13

    move/from16 v42, v14

    move/from16 v53, v16

    move-object/from16 v2, v17

    move/from16 v62, v18

    move/from16 v63, v62

    move/from16 v48, v19

    move/from16 v47, v20

    move/from16 v55, v21

    move/from16 v51, v22

    move/from16 v45, v24

    move/from16 v56, v25

    move/from16 v54, v26

    move/from16 v15, v34

    move/from16 v41, v37

    move/from16 v43, v38

    move/from16 v60, v49

    move/from16 v44, v52

    const/16 v5, 0x1b

    goto/16 :goto_65

    :cond_74
    :goto_6b
    const/16 v11, 0x2d

    if-ne v15, v11, :cond_76

    if-ne v0, v11, :cond_76

    const/16 v11, 0x20

    if-eq v5, v11, :cond_75

    const/16 v11, 0x54

    if-ne v5, v11, :cond_76

    :cond_75
    const/16 v11, 0x3a

    goto :goto_6c

    :cond_76
    move/from16 v11, v39

    move/from16 v39, v14

    :cond_77
    const/16 v14, 0x1c

    goto/16 :goto_70

    :goto_6c
    if-ne v12, v11, :cond_76

    if-ne v10, v11, :cond_76

    const/16 v11, 0x2e

    if-ne v2, v11, :cond_76

    const/16 v11, 0x1c

    if-eq v7, v11, :cond_7a

    move/from16 v11, v39

    move/from16 v39, v14

    const/16 v14, 0x5b

    if-eq v11, v14, :cond_78

    const/16 v14, 0x7c

    if-eq v11, v14, :cond_79

    const/16 v14, 0x2b

    if-eq v11, v14, :cond_78

    const/16 v14, 0x2d

    if-eq v11, v14, :cond_78

    const/16 v14, 0x5a

    if-ne v11, v14, :cond_77

    :cond_78
    :goto_6d
    const/16 v0, 0x7c

    goto :goto_6e

    :cond_79
    move v0, v14

    goto :goto_6e

    :cond_7a
    move/from16 v11, v39

    move/from16 v39, v14

    goto :goto_6d

    :goto_6e
    if-ne v11, v0, :cond_7b

    move/from16 v0, v31

    goto :goto_6f

    :cond_7b
    const/4 v0, 0x0

    :goto_6f
    move-object/from16 v11, p0

    move/from16 v59, v1

    move/from16 v61, v3

    move/from16 v58, v6

    move/from16 v57, v8

    move/from16 v62, v9

    move/from16 v46, v13

    move/from16 v53, v16

    move-object/from16 v2, v17

    move/from16 v63, v18

    move/from16 v48, v19

    move/from16 v47, v20

    move/from16 v55, v21

    move/from16 v51, v22

    move/from16 v45, v24

    move/from16 v56, v25

    move/from16 v54, v26

    move/from16 v15, v34

    move/from16 v41, v37

    move/from16 v43, v38

    move/from16 v42, v39

    move/from16 v60, v49

    move/from16 v44, v52

    const/16 v5, 0x1c

    goto/16 :goto_65

    :goto_70
    move/from16 v45, v11

    if-ne v7, v14, :cond_7e

    move/from16 v14, v52

    const/16 v11, 0x20

    if-ne v14, v11, :cond_7d

    if-ne v0, v11, :cond_7d

    if-ne v5, v11, :cond_7d

    const/16 v11, 0x3a

    if-ne v12, v11, :cond_7d

    if-ne v10, v11, :cond_7d

    const/16 v11, 0x20

    if-ne v2, v11, :cond_7d

    if-ne v6, v11, :cond_7d

    move/from16 v11, v24

    .line 251
    invoke-static {v15, v11, v13}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v0

    if-lez v0, :cond_7c

    .line 252
    div-int/lit8 v2, v0, 0xa

    add-int/lit8 v2, v2, 0x30

    int-to-char v2, v2

    .line 253
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    move v8, v0

    goto :goto_71

    :cond_7c
    move/from16 v2, v18

    move v8, v2

    .line 254
    :goto_71
    new-instance v0, Ljava/lang/String;

    add-int/lit8 v5, p1, 0x14

    const/4 v6, 0x3

    move-object/from16 v10, p0

    invoke-direct {v0, v10, v5, v6}, Ljava/lang/String;-><init>([CII)V

    move/from16 v41, v1

    move/from16 v45, v2

    move/from16 v43, v3

    move v6, v4

    move/from16 v46, v8

    move/from16 v44, v9

    move-object v11, v10

    move/from16 v53, v16

    move/from16 v55, v18

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v59, v58

    move/from16 v60, v59

    move/from16 v61, v60

    move/from16 v62, v61

    move/from16 v63, v62

    move/from16 v48, v19

    move/from16 v47, v20

    move/from16 v51, v22

    move/from16 v54, v26

    move/from16 v15, v34

    move/from16 v52, v36

    move/from16 v42, v49

    const/4 v1, 0x0

    const/16 v5, 0x13

    move-object v2, v0

    goto/16 :goto_40

    :cond_7d
    :goto_72
    move-object/from16 v11, p0

    move/from16 v23, v9

    const/16 v9, 0x1c

    goto :goto_73

    :cond_7e
    move/from16 v14, v52

    goto :goto_72

    :goto_73
    if-ne v7, v9, :cond_83

    const/16 v9, 0x2c

    if-ne v14, v9, :cond_83

    const/16 v9, 0x20

    if-ne v15, v9, :cond_83

    if-ne v13, v9, :cond_83

    if-ne v5, v9, :cond_83

    move/from16 v35, v4

    move/from16 v4, v36

    if-ne v4, v9, :cond_82

    move/from16 v9, v26

    move/from16 v26, v3

    const/16 v3, 0x3a

    if-ne v9, v3, :cond_81

    move/from16 v36, v9

    move/from16 v9, v25

    if-ne v9, v3, :cond_80

    const/16 v3, 0x20

    if-ne v1, v3, :cond_80

    move/from16 v1, v19

    move/from16 v3, v20

    .line 255
    invoke-static {v0, v3, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v0

    if-lez v0, :cond_7f

    .line 256
    div-int/lit8 v1, v0, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    .line 257
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    goto :goto_74

    :cond_7f
    move/from16 v0, v18

    move v1, v0

    :goto_74
    move/from16 v46, v0

    move/from16 v45, v1

    move/from16 v51, v2

    move/from16 v54, v6

    move/from16 v53, v8

    move v15, v10

    move/from16 v43, v12

    move/from16 v6, v16

    move-object/from16 v2, v17

    move/from16 v47, v18

    move/from16 v55, v47

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v59, v58

    move/from16 v60, v59

    move/from16 v61, v60

    move/from16 v62, v61

    move/from16 v63, v62

    move/from16 v52, v21

    move/from16 v44, v22

    move/from16 v48, v24

    move/from16 v1, v31

    move/from16 v41, v34

    move/from16 v42, v35

    const/4 v0, 0x0

    const/16 v5, 0x18

    goto/16 :goto_82

    :cond_80
    move/from16 v3, v19

    move/from16 v19, v1

    move v1, v3

    move/from16 v3, v20

    move/from16 v25, v9

    goto :goto_77

    :cond_81
    move/from16 v3, v19

    move/from16 v19, v1

    move v1, v3

    move/from16 v36, v9

    :goto_75
    move/from16 v3, v20

    goto :goto_77

    :cond_82
    move/from16 v36, v19

    move/from16 v19, v1

    move/from16 v1, v36

    :goto_76
    move/from16 v36, v26

    move/from16 v26, v3

    goto :goto_75

    :cond_83
    move/from16 v35, v19

    move/from16 v19, v1

    move/from16 v1, v35

    move/from16 v35, v4

    move/from16 v4, v36

    goto :goto_76

    :goto_77
    const/16 v9, 0x1d

    if-ne v7, v9, :cond_87

    const/16 v9, 0x2c

    if-ne v14, v9, :cond_87

    const/16 v9, 0x20

    if-ne v15, v9, :cond_87

    if-ne v0, v9, :cond_87

    move/from16 v52, v14

    move/from16 v14, v34

    if-ne v14, v9, :cond_86

    if-ne v10, v9, :cond_86

    const/16 v9, 0x3a

    if-ne v2, v9, :cond_86

    if-ne v8, v9, :cond_86

    move/from16 v34, v6

    move/from16 v9, v49

    const/16 v6, 0x20

    if-ne v9, v6, :cond_85

    .line 258
    invoke-static {v3, v1, v5}, Lcom/alibaba/fastjson2/util/DateUtils;->month(CCC)I

    move-result v0

    if-lez v0, :cond_84

    .line 259
    div-int/lit8 v1, v0, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    .line 260
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    move v8, v0

    goto :goto_78

    :cond_84
    move/from16 v1, v18

    move v8, v1

    :goto_78
    move/from16 v45, v1

    move/from16 v44, v4

    move/from16 v46, v8

    move/from16 v42, v12

    move/from16 v48, v13

    move/from16 v15, v16

    move-object/from16 v2, v17

    move/from16 v55, v18

    move/from16 v56, v55

    move/from16 v57, v56

    move/from16 v58, v57

    move/from16 v59, v58

    move/from16 v60, v59

    move/from16 v61, v60

    move/from16 v62, v61

    move/from16 v63, v62

    move/from16 v54, v19

    move/from16 v51, v21

    move/from16 v43, v22

    move/from16 v47, v24

    move/from16 v52, v25

    move/from16 v1, v31

    move/from16 v53, v34

    move/from16 v41, v35

    move/from16 v6, v36

    const/4 v0, 0x0

    goto/16 :goto_5f

    :cond_85
    :goto_79
    const/16 v6, 0x2d

    goto :goto_7a

    :cond_86
    move/from16 v34, v6

    move/from16 v9, v49

    goto :goto_79

    :cond_87
    move/from16 v52, v14

    move/from16 v14, v34

    move/from16 v9, v49

    move/from16 v34, v6

    goto :goto_79

    :goto_7a
    if-ne v15, v6, :cond_89

    if-ne v0, v6, :cond_89

    const/16 v6, 0x20

    if-eq v5, v6, :cond_88

    const/16 v6, 0x54

    if-ne v5, v6, :cond_89

    :cond_88
    const/16 v6, 0x3a

    goto :goto_7b

    :cond_89
    move/from16 v49, v15

    :cond_8a
    const/16 v6, 0x16

    goto/16 :goto_7f

    :goto_7b
    if-ne v12, v6, :cond_89

    if-ne v10, v6, :cond_89

    const/16 v6, 0x2e

    if-ne v2, v6, :cond_89

    const/16 v6, 0x1d

    if-eq v7, v6, :cond_8d

    move/from16 v49, v15

    move/from16 v6, v40

    const/16 v15, 0x5b

    if-eq v6, v15, :cond_8b

    const/16 v15, 0x7c

    if-eq v6, v15, :cond_8c

    const/16 v15, 0x2b

    if-eq v6, v15, :cond_8b

    const/16 v15, 0x2d

    if-eq v6, v15, :cond_8b

    const/16 v15, 0x5a

    if-ne v6, v15, :cond_8a

    :cond_8b
    :goto_7c
    const/16 v0, 0x7c

    goto :goto_7d

    :cond_8c
    move v0, v15

    goto :goto_7d

    :cond_8d
    move/from16 v6, v40

    goto :goto_7c

    :goto_7d
    if-ne v6, v0, :cond_8e

    move/from16 v0, v31

    goto :goto_7e

    :cond_8e
    const/4 v0, 0x0

    :goto_7e
    move/from16 v48, v1

    move/from16 v47, v3

    move/from16 v57, v8

    move/from16 v60, v9

    move/from16 v46, v13

    move v15, v14

    move/from16 v53, v16

    move-object/from16 v2, v17

    move/from16 v59, v19

    move/from16 v55, v21

    move/from16 v51, v22

    move/from16 v62, v23

    move/from16 v56, v25

    move/from16 v61, v26

    move/from16 v58, v34

    move/from16 v6, v35

    move/from16 v54, v36

    move/from16 v41, v37

    move/from16 v43, v38

    move/from16 v42, v39

    move/from16 v63, v45

    move/from16 v44, v52

    const/16 v5, 0x1d

    move v1, v0

    move/from16 v52, v4

    move/from16 v45, v24

    goto/16 :goto_40

    :goto_7f
    if-ne v7, v6, :cond_9e

    move/from16 v6, v16

    const/16 v15, 0x2b

    if-eq v6, v15, :cond_90

    const/16 v15, 0x2d

    if-ne v6, v15, :cond_8f

    goto :goto_81

    :cond_8f
    :goto_80
    const/16 v15, 0x20

    goto/16 :goto_88

    :cond_90
    :goto_81
    move/from16 v48, v0

    move v6, v1

    move v15, v3

    move/from16 v56, v4

    move/from16 v51, v5

    move/from16 v57, v10

    move/from16 v54, v12

    move/from16 v47, v13

    move-object/from16 v2, v17

    move/from16 v58, v18

    move/from16 v59, v58

    move/from16 v60, v59

    move/from16 v61, v60

    move/from16 v62, v61

    move/from16 v63, v62

    move/from16 v55, v22

    move/from16 v46, v24

    move/from16 v53, v35

    move/from16 v41, v37

    move/from16 v43, v38

    move/from16 v42, v39

    move/from16 v45, v49

    move/from16 v44, v52

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/16 v5, 0x11

    move/from16 v52, v14

    :goto_82
    if-eqz v0, :cond_91

    const/16 v3, 0x31

    if-ne v15, v3, :cond_91

    const/16 v3, 0x32

    if-ne v6, v3, :cond_91

    const/4 v0, 0x0

    :cond_91
    if-eqz v0, :cond_92

    .line 261
    invoke-static {v15, v6}, Lcom/alibaba/fastjson2/util/DateUtils;->hourAfterNoon(CC)I

    move-result v0

    shr-int/lit8 v3, v0, 0x10

    int-to-char v15, v3

    int-to-short v0, v0

    int-to-char v6, v0

    :cond_92
    move/from16 v50, v6

    move/from16 v49, v15

    .line 262
    invoke-static/range {v41 .. v63}, Lcom/alibaba/fastjson2/util/DateUtils;->localDateTime(CCCCCCCCCCCCCCCCCCCCCCC)Ljava/time/LocalDateTime;

    move-result-object v0

    if-nez v0, :cond_93

    return-object v17

    :cond_93
    if-eqz v1, :cond_95

    .line 263
    new-instance v1, Ljava/lang/String;

    sub-int v2, v7, v5

    invoke-direct {v1, v11, v5, v2}, Ljava/lang/String;-><init>([CII)V

    .line 264
    const-string v2, "UTC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_94

    const-string v2, "[UTC]"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_94

    .line 265
    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    .line 266
    invoke-virtual {v1}, Ljava/util/TimeZone;->toZoneId()Ljava/time/ZoneId;

    move-result-object v1

    goto :goto_83

    .line 267
    :cond_94
    sget-object v1, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    :goto_83
    move-object/from16 v3, p3

    goto :goto_87

    :cond_95
    if-ne v5, v7, :cond_96

    move-object/from16 v1, p3

    move-object v3, v1

    goto :goto_87

    :cond_96
    add-int v1, p1, v5

    .line 268
    aget-char v3, v11, v1

    const/16 v14, 0x5a

    if-ne v3, v14, :cond_97

    .line 269
    sget-object v1, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    goto :goto_83

    :cond_97
    if-nez v2, :cond_99

    const/16 v14, 0x2b

    if-eq v3, v14, :cond_9b

    const/16 v14, 0x2d

    if-ne v3, v14, :cond_98

    goto :goto_85

    :cond_98
    const/16 v6, 0x20

    if-ne v3, v6, :cond_9a

    .line 270
    new-instance v2, Ljava/lang/String;

    add-int/lit8 v1, v1, 0x1

    sub-int v3, v7, v5

    add-int/lit8 v3, v3, -0x1

    invoke-direct {v2, v11, v1, v3}, Ljava/lang/String;-><init>([CII)V

    :cond_99
    :goto_84
    move-object/from16 v3, p3

    goto :goto_86

    :cond_9a
    if-ge v5, v7, :cond_99

    .line 271
    new-instance v2, Ljava/lang/String;

    add-int/lit8 v1, v1, 0x1

    sub-int v3, v7, v5

    add-int/lit8 v3, v3, -0x2

    invoke-direct {v2, v11, v1, v3}, Ljava/lang/String;-><init>([CII)V

    goto :goto_84

    .line 272
    :cond_9b
    :goto_85
    new-instance v2, Ljava/lang/String;

    sub-int v3, v7, v5

    invoke-direct {v2, v11, v1, v3}, Ljava/lang/String;-><init>([CII)V

    goto :goto_84

    .line 273
    :goto_86
    invoke-static {v2, v3}, Lcom/alibaba/fastjson2/util/DateUtils;->getZoneId(Ljava/lang/String;Ljava/time/ZoneId;)Ljava/time/ZoneId;

    move-result-object v1

    :goto_87
    if-nez v1, :cond_9c

    move-object v1, v3

    :cond_9c
    if-nez v1, :cond_9d

    .line 274
    sget-object v1, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    :cond_9d
    move-object/from16 v2, v17

    .line 275
    invoke-static {v0, v1, v2}, Ljava/time/ZonedDateTime;->ofLocal(Ljava/time/LocalDateTime;Ljava/time/ZoneId;Ljava/time/ZoneOffset;)Ljava/time/ZonedDateTime;

    move-result-object v0

    return-object v0

    :cond_9e
    move/from16 v6, v16

    goto/16 :goto_80

    :goto_88
    if-ne v7, v15, :cond_9f

    const/16 v11, 0x2c

    if-ne v13, v11, :cond_9f

    if-ne v0, v15, :cond_9f

    const/16 v11, 0x2d

    if-ne v5, v11, :cond_9f

    move/from16 v13, v22

    if-ne v13, v11, :cond_9f

    if-ne v2, v15, :cond_9f

    const/16 v11, 0x3a

    if-ne v8, v11, :cond_9f

    if-ne v9, v11, :cond_9f

    add-int/lit8 v2, p1, 0x1c

    .line 276
    aget-char v2, p0, v2

    if-eq v2, v15, :cond_a2

    :cond_9f
    const/16 v2, 0x21

    if-ne v7, v2, :cond_a0

    const/16 v11, 0x2c

    if-ne v0, v11, :cond_a0

    const/16 v11, 0x20

    if-ne v3, v11, :cond_a0

    const/16 v15, 0x2d

    if-ne v14, v15, :cond_a0

    if-ne v4, v15, :cond_a0

    move/from16 v0, v21

    if-ne v0, v11, :cond_a0

    move/from16 v0, v34

    const/16 v14, 0x3a

    if-ne v0, v14, :cond_a0

    move/from16 v0, v26

    if-ne v0, v14, :cond_a0

    add-int/lit8 v0, p1, 0x1d

    aget-char v0, p0, v0

    if-eq v0, v11, :cond_a2

    :cond_a0
    const/16 v0, 0x22

    if-ne v7, v0, :cond_a1

    const/16 v11, 0x2c

    if-ne v3, v11, :cond_a1

    const/16 v11, 0x20

    if-ne v1, v11, :cond_a1

    move/from16 v4, v35

    const/16 v14, 0x2d

    if-ne v4, v14, :cond_a1

    if-ne v10, v14, :cond_a1

    move/from16 v2, v25

    if-ne v2, v11, :cond_a1

    move/from16 v14, v19

    const/16 v3, 0x3a

    if-ne v14, v3, :cond_a1

    move/from16 v2, v23

    if-ne v2, v3, :cond_a1

    add-int/lit8 v2, p1, 0x1e

    aget-char v2, p0, v2

    if-eq v2, v11, :cond_a2

    :cond_a1
    const/16 v2, 0x23

    if-ne v7, v2, :cond_a3

    const/16 v11, 0x2c

    if-ne v1, v11, :cond_a3

    const/16 v11, 0x20

    if-ne v5, v11, :cond_a3

    const/16 v14, 0x2d

    if-ne v12, v14, :cond_a3

    if-ne v6, v14, :cond_a3

    if-ne v8, v11, :cond_a3

    const/16 v3, 0x3a

    if-ne v9, v3, :cond_a3

    move/from16 v1, v45

    if-ne v1, v3, :cond_a3

    add-int/lit8 v1, p1, 0x1f

    aget-char v1, p0, v1

    if-ne v1, v11, :cond_a3

    .line 277
    :cond_a2
    new-instance v0, Ljava/lang/String;

    move-object/from16 v10, p0

    move/from16 v1, p1

    invoke-direct {v0, v10, v1, v7}, Ljava/lang/String;-><init>([CII)V

    invoke-static {v0}, Lcom/alibaba/fastjson2/util/DateUtils;->parseZonedDateTimeCookie(Ljava/lang/String;)Ljava/time/ZonedDateTime;

    move-result-object v0

    return-object v0

    :cond_a3
    move-object/from16 v10, p0

    move/from16 v1, p1

    if-ne v7, v0, :cond_a5

    .line 278
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DATE_TIME_FORMATTER_34:Ljava/time/format/DateTimeFormatter;

    if-nez v0, :cond_a4

    .line 279
    const-string v0, "EEE MMM dd HH:mm:ss O yyyy"

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {v0, v2}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    sput-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DATE_TIME_FORMATTER_34:Ljava/time/format/DateTimeFormatter;

    .line 280
    :cond_a4
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v10, v1, v7}, Ljava/lang/String;-><init>([CII)V

    invoke-static {v2, v0}, Ljava/time/ZonedDateTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/ZonedDateTime;

    move-result-object v0

    return-object v0

    :cond_a5
    const/16 v0, 0x1f

    if-ne v7, v0, :cond_a7

    move/from16 v14, v52

    const/16 v11, 0x2c

    if-ne v14, v11, :cond_a7

    .line 281
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DATE_TIME_FORMATTER_RFC_2822:Ljava/time/format/DateTimeFormatter;

    if-nez v0, :cond_a6

    .line 282
    const-string v0, "EEE, dd MMM yyyy HH:mm:ss Z"

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {v0, v2}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    sput-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DATE_TIME_FORMATTER_RFC_2822:Ljava/time/format/DateTimeFormatter;

    .line 283
    :cond_a6
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v10, v1, v7}, Ljava/lang/String;-><init>([CII)V

    invoke-static {v2, v0}, Ljava/time/ZonedDateTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/ZonedDateTime;

    move-result-object v0

    return-object v0

    :cond_a7
    const/16 v17, 0x0

    return-object v17

    :cond_a8
    move-object v10, v0

    .line 284
    new-instance v0, Ljava/lang/String;

    array-length v2, v10

    sub-int/2addr v2, v1

    invoke-direct {v0, v10, v1, v2}, Ljava/lang/String;-><init>([CII)V

    .line 285
    new-instance v1, Ljava/time/format/DateTimeParseException;

    const-string v2, "illegal input "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v0, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static parseZonedDateTime16([BILjava/time/ZoneId;)Ljava/time/ZonedDateTime;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    add-int/lit8 v2, p1, 0x10

    .line 4
    .line 5
    array-length v3, v0

    .line 6
    const-string v5, "illegal input "

    .line 7
    .line 8
    if-gt v2, v3, :cond_5

    .line 9
    .line 10
    aget-byte v2, v0, p1

    .line 11
    .line 12
    int-to-char v2, v2

    .line 13
    add-int/lit8 v3, p1, 0x1

    .line 14
    .line 15
    aget-byte v3, v0, v3

    .line 16
    .line 17
    int-to-char v3, v3

    .line 18
    add-int/lit8 v6, p1, 0x2

    .line 19
    .line 20
    aget-byte v6, v0, v6

    .line 21
    .line 22
    int-to-char v6, v6

    .line 23
    add-int/lit8 v7, p1, 0x3

    .line 24
    .line 25
    aget-byte v7, v0, v7

    .line 26
    .line 27
    int-to-char v7, v7

    .line 28
    add-int/lit8 v8, p1, 0x4

    .line 29
    .line 30
    aget-byte v8, v0, v8

    .line 31
    .line 32
    int-to-char v8, v8

    .line 33
    add-int/lit8 v9, p1, 0x5

    .line 34
    .line 35
    aget-byte v9, v0, v9

    .line 36
    .line 37
    int-to-char v9, v9

    .line 38
    add-int/lit8 v10, p1, 0x6

    .line 39
    .line 40
    aget-byte v10, v0, v10

    .line 41
    .line 42
    int-to-char v10, v10

    .line 43
    add-int/lit8 v11, p1, 0x7

    .line 44
    .line 45
    aget-byte v11, v0, v11

    .line 46
    .line 47
    int-to-char v11, v11

    .line 48
    add-int/lit8 v12, p1, 0x8

    .line 49
    .line 50
    aget-byte v12, v0, v12

    .line 51
    .line 52
    int-to-char v12, v12

    .line 53
    add-int/lit8 v13, p1, 0x9

    .line 54
    .line 55
    aget-byte v13, v0, v13

    .line 56
    .line 57
    int-to-char v13, v13

    .line 58
    add-int/lit8 v14, p1, 0xa

    .line 59
    .line 60
    aget-byte v15, v0, v14

    .line 61
    .line 62
    int-to-char v15, v15

    .line 63
    add-int/lit8 v16, p1, 0xd

    .line 64
    .line 65
    aget-byte v4, v0, v16

    .line 66
    .line 67
    int-to-char v4, v4

    .line 68
    move-object/from16 v16, v5

    .line 69
    .line 70
    const/16 v5, 0x2d

    .line 71
    .line 72
    const/16 v1, 0x10

    .line 73
    .line 74
    if-ne v8, v5, :cond_0

    .line 75
    .line 76
    if-ne v11, v5, :cond_0

    .line 77
    .line 78
    const/16 v8, 0x2b

    .line 79
    .line 80
    if-eq v15, v8, :cond_1

    .line 81
    .line 82
    if-ne v15, v5, :cond_0

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    move/from16 v3, p1

    .line 86
    .line 87
    move-object/from16 v4, v16

    .line 88
    .line 89
    const/4 v5, 0x0

    .line 90
    goto/16 :goto_1

    .line 91
    .line 92
    :cond_1
    :goto_0
    const/16 v5, 0x3a

    .line 93
    .line 94
    if-ne v4, v5, :cond_0

    .line 95
    .line 96
    const/16 v4, 0x30

    .line 97
    .line 98
    if-lt v2, v4, :cond_4

    .line 99
    .line 100
    const/16 v5, 0x39

    .line 101
    .line 102
    if-gt v2, v5, :cond_4

    .line 103
    .line 104
    if-lt v3, v4, :cond_4

    .line 105
    .line 106
    if-gt v3, v5, :cond_4

    .line 107
    .line 108
    if-lt v6, v4, :cond_4

    .line 109
    .line 110
    if-gt v6, v5, :cond_4

    .line 111
    .line 112
    if-lt v7, v4, :cond_4

    .line 113
    .line 114
    if-gt v7, v5, :cond_4

    .line 115
    .line 116
    sub-int/2addr v2, v4

    .line 117
    mul-int/lit16 v2, v2, 0x3e8

    .line 118
    .line 119
    const/16 v8, 0x64

    .line 120
    .line 121
    invoke-static {v3, v4, v8, v2}, Lp/a;->z(IIII)I

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    const/16 v3, 0xa

    .line 126
    .line 127
    invoke-static {v6, v4, v3, v2}, Lp/a;->z(IIII)I

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    sub-int/2addr v7, v4

    .line 132
    add-int/2addr v7, v2

    .line 133
    if-lt v9, v4, :cond_3

    .line 134
    .line 135
    if-gt v9, v5, :cond_3

    .line 136
    .line 137
    if-lt v10, v4, :cond_3

    .line 138
    .line 139
    if-gt v10, v5, :cond_3

    .line 140
    .line 141
    sub-int/2addr v9, v4

    .line 142
    mul-int/2addr v9, v3

    .line 143
    sub-int/2addr v10, v4

    .line 144
    add-int/2addr v10, v9

    .line 145
    if-lt v12, v4, :cond_2

    .line 146
    .line 147
    if-gt v12, v5, :cond_2

    .line 148
    .line 149
    if-lt v13, v4, :cond_2

    .line 150
    .line 151
    if-gt v13, v5, :cond_2

    .line 152
    .line 153
    sub-int/2addr v12, v4

    .line 154
    mul-int/2addr v12, v3

    .line 155
    sub-int/2addr v13, v4

    .line 156
    add-int/2addr v13, v12

    .line 157
    new-instance v1, Ljava/lang/String;

    .line 158
    .line 159
    const/4 v2, 0x6

    .line 160
    invoke-direct {v1, v0, v14, v2}, Ljava/lang/String;-><init>([BII)V

    .line 161
    .line 162
    .line 163
    move-object/from16 v0, p2

    .line 164
    .line 165
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/DateUtils;->getZoneId(Ljava/lang/String;Ljava/time/ZoneId;)Ljava/time/ZoneId;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-static {v7, v10, v13}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    sget-object v2, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 174
    .line 175
    invoke-static {v1, v2}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-static {v1, v0}, Ljava/time/ZonedDateTime;->of(Ljava/time/LocalDateTime;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    return-object v0

    .line 184
    :cond_2
    new-instance v2, Ljava/lang/String;

    .line 185
    .line 186
    move/from16 v3, p1

    .line 187
    .line 188
    invoke-direct {v2, v0, v3, v1}, Ljava/lang/String;-><init>([BII)V

    .line 189
    .line 190
    .line 191
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 192
    .line 193
    move-object/from16 v4, v16

    .line 194
    .line 195
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    const/4 v5, 0x0

    .line 200
    invoke-direct {v0, v1, v2, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 201
    .line 202
    .line 203
    throw v0

    .line 204
    :cond_3
    move/from16 v3, p1

    .line 205
    .line 206
    move-object/from16 v4, v16

    .line 207
    .line 208
    const/4 v5, 0x0

    .line 209
    new-instance v2, Ljava/lang/String;

    .line 210
    .line 211
    invoke-direct {v2, v0, v3, v1}, Ljava/lang/String;-><init>([BII)V

    .line 212
    .line 213
    .line 214
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 215
    .line 216
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-direct {v0, v1, v2, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 221
    .line 222
    .line 223
    throw v0

    .line 224
    :cond_4
    move/from16 v3, p1

    .line 225
    .line 226
    move-object/from16 v4, v16

    .line 227
    .line 228
    new-instance v2, Ljava/lang/String;

    .line 229
    .line 230
    invoke-direct {v2, v0, v3, v1}, Ljava/lang/String;-><init>([BII)V

    .line 231
    .line 232
    .line 233
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 234
    .line 235
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    const/4 v5, 0x0

    .line 240
    invoke-direct {v0, v1, v2, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 241
    .line 242
    .line 243
    throw v0

    .line 244
    :goto_1
    new-instance v2, Ljava/lang/String;

    .line 245
    .line 246
    invoke-direct {v2, v0, v3, v1}, Ljava/lang/String;-><init>([BII)V

    .line 247
    .line 248
    .line 249
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 250
    .line 251
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    invoke-direct {v0, v1, v2, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 256
    .line 257
    .line 258
    throw v0

    .line 259
    :cond_5
    move/from16 v3, p1

    .line 260
    .line 261
    move-object v4, v5

    .line 262
    const/4 v5, 0x0

    .line 263
    new-instance v1, Ljava/lang/String;

    .line 264
    .line 265
    array-length v2, v0

    .line 266
    sub-int/2addr v2, v3

    .line 267
    invoke-direct {v1, v0, v3, v2}, Ljava/lang/String;-><init>([BII)V

    .line 268
    .line 269
    .line 270
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 271
    .line 272
    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    invoke-direct {v0, v2, v1, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 277
    .line 278
    .line 279
    throw v0
.end method

.method public static parseZonedDateTime16([CILjava/time/ZoneId;)Ljava/time/ZonedDateTime;
    .locals 17

    move-object/from16 v0, p0

    add-int/lit8 v2, p1, 0x10

    .line 280
    array-length v3, v0

    const-string v5, "illegal input "

    if-gt v2, v3, :cond_5

    .line 281
    aget-char v2, v0, p1

    add-int/lit8 v3, p1, 0x1

    .line 282
    aget-char v3, v0, v3

    add-int/lit8 v6, p1, 0x2

    .line 283
    aget-char v6, v0, v6

    add-int/lit8 v7, p1, 0x3

    .line 284
    aget-char v7, v0, v7

    add-int/lit8 v8, p1, 0x4

    .line 285
    aget-char v8, v0, v8

    add-int/lit8 v9, p1, 0x5

    .line 286
    aget-char v9, v0, v9

    add-int/lit8 v10, p1, 0x6

    .line 287
    aget-char v10, v0, v10

    add-int/lit8 v11, p1, 0x7

    .line 288
    aget-char v11, v0, v11

    add-int/lit8 v12, p1, 0x8

    .line 289
    aget-char v12, v0, v12

    add-int/lit8 v13, p1, 0x9

    .line 290
    aget-char v13, v0, v13

    add-int/lit8 v14, p1, 0xa

    .line 291
    aget-char v15, v0, v14

    add-int/lit8 v16, p1, 0xd

    .line 292
    aget-char v4, v0, v16

    move-object/from16 v16, v5

    const/16 v5, 0x2d

    const/16 v1, 0x10

    if-ne v8, v5, :cond_0

    if-ne v11, v5, :cond_0

    const/16 v8, 0x2b

    if-eq v15, v8, :cond_1

    if-ne v15, v5, :cond_0

    goto :goto_0

    :cond_0
    move/from16 v3, p1

    move-object/from16 v4, v16

    const/4 v5, 0x0

    goto/16 :goto_1

    :cond_1
    :goto_0
    const/16 v5, 0x3a

    if-ne v4, v5, :cond_0

    const/16 v4, 0x30

    if-lt v2, v4, :cond_4

    const/16 v5, 0x39

    if-gt v2, v5, :cond_4

    if-lt v3, v4, :cond_4

    if-gt v3, v5, :cond_4

    if-lt v6, v4, :cond_4

    if-gt v6, v5, :cond_4

    if-lt v7, v4, :cond_4

    if-gt v7, v5, :cond_4

    sub-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x3e8

    const/16 v8, 0x64

    .line 293
    invoke-static {v3, v4, v8, v2}, Lp/a;->z(IIII)I

    move-result v2

    const/16 v3, 0xa

    invoke-static {v6, v4, v3, v2}, Lp/a;->z(IIII)I

    move-result v2

    sub-int/2addr v7, v4

    add-int/2addr v7, v2

    if-lt v9, v4, :cond_3

    if-gt v9, v5, :cond_3

    if-lt v10, v4, :cond_3

    if-gt v10, v5, :cond_3

    sub-int/2addr v9, v4

    mul-int/2addr v9, v3

    sub-int/2addr v10, v4

    add-int/2addr v10, v9

    if-lt v12, v4, :cond_2

    if-gt v12, v5, :cond_2

    if-lt v13, v4, :cond_2

    if-gt v13, v5, :cond_2

    sub-int/2addr v12, v4

    mul-int/2addr v12, v3

    sub-int/2addr v13, v4

    add-int/2addr v13, v12

    .line 294
    new-instance v1, Ljava/lang/String;

    const/4 v2, 0x6

    invoke-direct {v1, v0, v14, v2}, Ljava/lang/String;-><init>([CII)V

    move-object/from16 v0, p2

    .line 295
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/DateUtils;->getZoneId(Ljava/lang/String;Ljava/time/ZoneId;)Ljava/time/ZoneId;

    move-result-object v0

    .line 296
    invoke-static {v7, v10, v13}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    move-result-object v1

    sget-object v2, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    invoke-static {v1, v2}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    move-result-object v1

    .line 297
    invoke-static {v1, v0}, Ljava/time/ZonedDateTime;->of(Ljava/time/LocalDateTime;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object v0

    return-object v0

    .line 298
    :cond_2
    new-instance v2, Ljava/lang/String;

    move/from16 v3, p1

    invoke-direct {v2, v0, v3, v1}, Ljava/lang/String;-><init>([CII)V

    .line 299
    new-instance v0, Ljava/time/format/DateTimeParseException;

    move-object/from16 v4, v16

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v5, 0x0

    invoke-direct {v0, v1, v2, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_3
    move/from16 v3, p1

    move-object/from16 v4, v16

    const/4 v5, 0x0

    .line 300
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v0, v3, v1}, Ljava/lang/String;-><init>([CII)V

    .line 301
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v2, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_4
    move/from16 v3, p1

    move-object/from16 v4, v16

    .line 302
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v0, v3, v1}, Ljava/lang/String;-><init>([CII)V

    .line 303
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v5, 0x0

    invoke-direct {v0, v1, v2, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    .line 304
    :goto_1
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v0, v3, v1}, Ljava/lang/String;-><init>([CII)V

    .line 305
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v2, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_5
    move/from16 v3, p1

    move-object v4, v5

    const/4 v5, 0x0

    .line 306
    new-instance v1, Ljava/lang/String;

    array-length v2, v0

    sub-int/2addr v2, v3

    invoke-direct {v1, v0, v3, v2}, Ljava/lang/String;-><init>([CII)V

    .line 307
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0
.end method

.method public static parseZonedDateTimeCookie(Ljava/lang/String;)Ljava/time/ZonedDateTime;
    .locals 3

    .line 1
    const-string v0, " CST"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DATE_TIME_FORMATTER_COOKIE_LOCAL:Ljava/time/format/DateTimeFormatter;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const-string v0, "EEEE, dd-MMM-yyyy HH:mm:ss"

    .line 14
    .line 15
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 16
    .line 17
    invoke-static {v0, v1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DATE_TIME_FORMATTER_COOKIE_LOCAL:Ljava/time/format/DateTimeFormatter;

    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    add-int/lit8 v1, v1, -0x4

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0, v0}, Ljava/time/LocalDateTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDateTime;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_ID:Ljava/time/ZoneId;

    .line 39
    .line 40
    invoke-static {p0, v0}, Ljava/time/ZonedDateTime;->of(Ljava/time/LocalDateTime;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :cond_1
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DATE_TIME_FORMATTER_COOKIE:Ljava/time/format/DateTimeFormatter;

    .line 46
    .line 47
    if-nez v0, :cond_2

    .line 48
    .line 49
    const-string v0, "EEEE, dd-MMM-yyyy HH:mm:ss zzz"

    .line 50
    .line 51
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 52
    .line 53
    invoke-static {v0, v1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sput-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DATE_TIME_FORMATTER_COOKIE:Ljava/time/format/DateTimeFormatter;

    .line 58
    .line 59
    :cond_2
    invoke-static {p0, v0}, Ljava/time/ZonedDateTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/ZonedDateTime;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method

.method public static readNanos([BII)I
    .locals 7

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    const/16 v3, 0x9

    if-ge v1, p1, :cond_3

    add-int v4, p2, v1

    .line 45
    aget-byte v4, p0, v4

    add-int/lit8 v4, v4, -0x30

    const/4 v5, 0x1

    if-gez v4, :cond_0

    move v6, v5

    goto :goto_1

    :cond_0
    move v6, v0

    :goto_1
    if-le v4, v3, :cond_1

    goto :goto_2

    :cond_1
    move v5, v0

    :goto_2
    or-int v3, v6, v5

    if-eqz v3, :cond_2

    const/4 p0, -0x1

    return p0

    :cond_2
    mul-int/lit8 v2, v2, 0xa

    add-int/2addr v2, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 46
    :cond_3
    sget-object p0, Lcom/alibaba/fastjson2/util/DateUtils;->POWERS:[I

    sub-int/2addr v3, p1

    and-int/lit8 p1, v3, 0xf

    aget p0, p0, p1

    mul-int/2addr v2, p0

    return v2
.end method

.method public static readNanos([CII)I
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    const/16 v3, 0x9

    .line 5
    .line 6
    if-ge v1, p1, :cond_3

    .line 7
    .line 8
    add-int v4, p2, v1

    .line 9
    .line 10
    aget-char v4, p0, v4

    .line 11
    .line 12
    add-int/lit8 v4, v4, -0x30

    .line 13
    .line 14
    const/4 v5, 0x1

    .line 15
    if-gez v4, :cond_0

    .line 16
    .line 17
    move v6, v5

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    move v6, v0

    .line 20
    :goto_1
    if-le v4, v3, :cond_1

    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_1
    move v5, v0

    .line 24
    :goto_2
    or-int v3, v6, v5

    .line 25
    .line 26
    if-eqz v3, :cond_2

    .line 27
    .line 28
    const/4 p0, -0x1

    .line 29
    return p0

    .line 30
    :cond_2
    mul-int/lit8 v2, v2, 0xa

    .line 31
    .line 32
    add-int/2addr v2, v4

    .line 33
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    sget-object p0, Lcom/alibaba/fastjson2/util/DateUtils;->POWERS:[I

    .line 37
    .line 38
    sub-int/2addr v3, p1

    .line 39
    and-int/lit8 p1, v3, 0xf

    .line 40
    .line 41
    aget p0, p0, p1

    .line 42
    .line 43
    mul-int/2addr v2, p0

    .line 44
    return v2
.end method

.method public static toString(JZLjava/time/ZoneId;)Ljava/lang/String;
    .locals 29

    .line 1
    move-wide/from16 v0, p0

    .line 2
    .line 3
    const-wide/16 v2, 0x3e8

    .line 4
    .line 5
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->floorDiv(JJ)J

    .line 6
    .line 7
    .line 8
    move-result-wide v4

    .line 9
    sget-object v6, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_ID:Ljava/time/ZoneId;

    .line 10
    .line 11
    move-object/from16 v7, p3

    .line 12
    .line 13
    if-eq v7, v6, :cond_1

    .line 14
    .line 15
    invoke-virtual {v7}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    sget-object v8, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_RULES:Ljava/time/zone/ZoneRules;

    .line 20
    .line 21
    if-ne v6, v8, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    invoke-virtual {v7}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    invoke-virtual {v7, v6}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/Instant;)Ljava/time/ZoneOffset;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-virtual {v6}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    :goto_0
    invoke-static {v4, v5}, Lcom/alibaba/fastjson2/util/DateUtils;->getShanghaiZoneOffsetTotalSeconds(J)I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    :goto_1
    int-to-long v7, v6

    .line 46
    add-long/2addr v4, v7

    .line 47
    const-wide/32 v7, 0x15180

    .line 48
    .line 49
    .line 50
    invoke-static {v4, v5, v7, v8}, Ljava/lang/Math;->floorDiv(JJ)J

    .line 51
    .line 52
    .line 53
    move-result-wide v9

    .line 54
    invoke-static {v4, v5, v7, v8}, Ljava/lang/Math;->floorMod(JJ)J

    .line 55
    .line 56
    .line 57
    move-result-wide v4

    .line 58
    long-to-int v4, v4

    .line 59
    const-wide/32 v7, 0xafa6c

    .line 60
    .line 61
    .line 62
    add-long/2addr v7, v9

    .line 63
    const-wide/16 v11, 0x0

    .line 64
    .line 65
    cmp-long v5, v7, v11

    .line 66
    .line 67
    const-wide/16 v13, 0x1

    .line 68
    .line 69
    const-wide/32 v15, 0x23ab1

    .line 70
    .line 71
    .line 72
    const-wide/16 v17, 0x190

    .line 73
    .line 74
    if-gez v5, :cond_2

    .line 75
    .line 76
    const-wide/32 v19, 0xafa6d

    .line 77
    .line 78
    .line 79
    add-long v9, v9, v19

    .line 80
    .line 81
    div-long/2addr v9, v15

    .line 82
    sub-long/2addr v9, v13

    .line 83
    mul-long v19, v9, v17

    .line 84
    .line 85
    neg-long v9, v9

    .line 86
    mul-long/2addr v9, v15

    .line 87
    add-long/2addr v7, v9

    .line 88
    goto :goto_2

    .line 89
    :cond_2
    move-wide/from16 v19, v11

    .line 90
    .line 91
    :goto_2
    mul-long v9, v7, v17

    .line 92
    .line 93
    const-wide/16 v21, 0x24f

    .line 94
    .line 95
    add-long v9, v9, v21

    .line 96
    .line 97
    div-long/2addr v9, v15

    .line 98
    const-wide/16 v15, 0x16d

    .line 99
    .line 100
    mul-long v21, v9, v15

    .line 101
    .line 102
    const-wide/16 v23, 0x4

    .line 103
    .line 104
    div-long v25, v9, v23

    .line 105
    .line 106
    add-long v25, v25, v21

    .line 107
    .line 108
    const-wide/16 v21, 0x64

    .line 109
    .line 110
    div-long v27, v9, v21

    .line 111
    .line 112
    sub-long v25, v25, v27

    .line 113
    .line 114
    div-long v27, v9, v17

    .line 115
    .line 116
    add-long v27, v27, v25

    .line 117
    .line 118
    sub-long v25, v7, v27

    .line 119
    .line 120
    cmp-long v5, v25, v11

    .line 121
    .line 122
    if-gez v5, :cond_3

    .line 123
    .line 124
    sub-long/2addr v9, v13

    .line 125
    mul-long/2addr v15, v9

    .line 126
    div-long v13, v9, v23

    .line 127
    .line 128
    add-long/2addr v13, v15

    .line 129
    div-long v15, v9, v21

    .line 130
    .line 131
    sub-long/2addr v13, v15

    .line 132
    div-long v15, v9, v17

    .line 133
    .line 134
    add-long/2addr v15, v13

    .line 135
    sub-long v25, v7, v15

    .line 136
    .line 137
    :cond_3
    move-wide/from16 v7, v25

    .line 138
    .line 139
    add-long v9, v9, v19

    .line 140
    .line 141
    long-to-int v5, v7

    .line 142
    mul-int/lit8 v7, v5, 0x5

    .line 143
    .line 144
    const/4 v8, 0x2

    .line 145
    add-int/2addr v7, v8

    .line 146
    div-int/lit16 v7, v7, 0x99

    .line 147
    .line 148
    add-int/lit8 v13, v7, 0x2

    .line 149
    .line 150
    rem-int/lit8 v13, v13, 0xc

    .line 151
    .line 152
    const/4 v14, 0x1

    .line 153
    add-int/2addr v13, v14

    .line 154
    mul-int/lit16 v15, v7, 0x132

    .line 155
    .line 156
    add-int/lit8 v15, v15, 0x5

    .line 157
    .line 158
    const/16 v8, 0xa

    .line 159
    .line 160
    div-int/2addr v15, v8

    .line 161
    sub-int/2addr v5, v15

    .line 162
    add-int/2addr v5, v14

    .line 163
    div-int/2addr v7, v8

    .line 164
    move-wide v15, v11

    .line 165
    int-to-long v11, v7

    .line 166
    add-long/2addr v9, v11

    .line 167
    const-wide/32 v11, -0x3b9ac9ff

    .line 168
    .line 169
    .line 170
    cmp-long v7, v9, v11

    .line 171
    .line 172
    if-ltz v7, :cond_14

    .line 173
    .line 174
    const-wide/32 v11, 0x3b9ac9ff

    .line 175
    .line 176
    .line 177
    cmp-long v7, v9, v11

    .line 178
    .line 179
    if-gtz v7, :cond_14

    .line 180
    .line 181
    long-to-int v7, v9

    .line 182
    int-to-long v9, v4

    .line 183
    cmp-long v4, v9, v15

    .line 184
    .line 185
    if-ltz v4, :cond_13

    .line 186
    .line 187
    const-wide/32 v11, 0x1517f

    .line 188
    .line 189
    .line 190
    cmp-long v4, v9, v11

    .line 191
    .line 192
    if-gtz v4, :cond_13

    .line 193
    .line 194
    const-wide/16 v11, 0xe10

    .line 195
    .line 196
    div-long v11, v9, v11

    .line 197
    .line 198
    long-to-int v4, v11

    .line 199
    mul-int/lit16 v11, v4, 0xe10

    .line 200
    .line 201
    int-to-long v11, v11

    .line 202
    sub-long/2addr v9, v11

    .line 203
    const-wide/16 v11, 0x3c

    .line 204
    .line 205
    div-long v11, v9, v11

    .line 206
    .line 207
    long-to-int v11, v11

    .line 208
    mul-int/lit8 v12, v11, 0x3c

    .line 209
    .line 210
    int-to-long v14, v12

    .line 211
    sub-long/2addr v9, v14

    .line 212
    long-to-int v9, v9

    .line 213
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->floorMod(JJ)J

    .line 214
    .line 215
    .line 216
    move-result-wide v0

    .line 217
    long-to-int v0, v0

    .line 218
    const/4 v1, 0x0

    .line 219
    if-nez v0, :cond_4

    .line 220
    .line 221
    move v2, v1

    .line 222
    goto :goto_3

    .line 223
    :cond_4
    const/4 v2, 0x4

    .line 224
    if-ge v0, v8, :cond_5

    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_5
    rem-int/lit8 v3, v0, 0x64

    .line 228
    .line 229
    if-nez v3, :cond_6

    .line 230
    .line 231
    const/4 v2, 0x2

    .line 232
    goto :goto_3

    .line 233
    :cond_6
    rem-int/lit8 v3, v0, 0xa

    .line 234
    .line 235
    if-nez v3, :cond_7

    .line 236
    .line 237
    const/4 v2, 0x3

    .line 238
    :cond_7
    :goto_3
    if-eqz p2, :cond_9

    .line 239
    .line 240
    if-nez v6, :cond_8

    .line 241
    .line 242
    const/4 v14, 0x1

    .line 243
    goto :goto_4

    .line 244
    :cond_8
    const/4 v14, 0x6

    .line 245
    goto :goto_4

    .line 246
    :cond_9
    move v14, v1

    .line 247
    :goto_4
    add-int/lit8 v3, v2, 0x13

    .line 248
    .line 249
    add-int/2addr v14, v3

    .line 250
    new-array v10, v14, [B

    .line 251
    .line 252
    invoke-static {v10, v1, v7, v13, v5}, Lcom/alibaba/fastjson2/util/IOUtils;->writeLocalDate([BIIII)I

    .line 253
    .line 254
    .line 255
    const/16 v5, 0x20

    .line 256
    .line 257
    aput-byte v5, v10, v8

    .line 258
    .line 259
    const/16 v5, 0xb

    .line 260
    .line 261
    invoke-static {v10, v5, v4, v11, v9}, Lcom/alibaba/fastjson2/util/IOUtils;->writeLocalTime([BIIII)V

    .line 262
    .line 263
    .line 264
    const/16 v4, 0x30

    .line 265
    .line 266
    if-lez v2, :cond_e

    .line 267
    .line 268
    const/16 v5, 0x2e

    .line 269
    .line 270
    const/16 v7, 0x13

    .line 271
    .line 272
    aput-byte v5, v10, v7

    .line 273
    .line 274
    const/16 v5, 0x14

    .line 275
    .line 276
    :goto_5
    if-ge v5, v14, :cond_a

    .line 277
    .line 278
    aput-byte v4, v10, v5

    .line 279
    .line 280
    add-int/lit8 v5, v5, 0x1

    .line 281
    .line 282
    goto :goto_5

    .line 283
    :cond_a
    if-ge v0, v8, :cond_b

    .line 284
    .line 285
    invoke-static {v0, v3, v10}, Lcom/alibaba/fastjson2/util/IOUtils;->getChars(II[B)V

    .line 286
    .line 287
    .line 288
    goto :goto_6

    .line 289
    :cond_b
    rem-int/lit8 v5, v0, 0x64

    .line 290
    .line 291
    if-nez v5, :cond_c

    .line 292
    .line 293
    div-int/lit8 v0, v0, 0x64

    .line 294
    .line 295
    invoke-static {v0, v3, v10}, Lcom/alibaba/fastjson2/util/IOUtils;->getChars(II[B)V

    .line 296
    .line 297
    .line 298
    goto :goto_6

    .line 299
    :cond_c
    rem-int/lit8 v5, v0, 0xa

    .line 300
    .line 301
    if-nez v5, :cond_d

    .line 302
    .line 303
    div-int/2addr v0, v8

    .line 304
    invoke-static {v0, v3, v10}, Lcom/alibaba/fastjson2/util/IOUtils;->getChars(II[B)V

    .line 305
    .line 306
    .line 307
    goto :goto_6

    .line 308
    :cond_d
    invoke-static {v0, v3, v10}, Lcom/alibaba/fastjson2/util/IOUtils;->getChars(II[B)V

    .line 309
    .line 310
    .line 311
    :cond_e
    :goto_6
    if-eqz p2, :cond_12

    .line 312
    .line 313
    div-int/lit16 v0, v6, 0xe10

    .line 314
    .line 315
    if-nez v6, :cond_f

    .line 316
    .line 317
    const/16 v0, 0x5a

    .line 318
    .line 319
    aput-byte v0, v10, v3

    .line 320
    .line 321
    goto :goto_8

    .line 322
    :cond_f
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 323
    .line 324
    .line 325
    move-result v5

    .line 326
    if-ltz v0, :cond_10

    .line 327
    .line 328
    const/16 v7, 0x2b

    .line 329
    .line 330
    aput-byte v7, v10, v3

    .line 331
    .line 332
    goto :goto_7

    .line 333
    :cond_10
    const/16 v7, 0x2d

    .line 334
    .line 335
    aput-byte v7, v10, v3

    .line 336
    .line 337
    :goto_7
    add-int/lit8 v3, v2, 0x14

    .line 338
    .line 339
    aput-byte v4, v10, v3

    .line 340
    .line 341
    add-int/lit8 v3, v2, 0x16

    .line 342
    .line 343
    invoke-static {v5, v3, v10}, Lcom/alibaba/fastjson2/util/IOUtils;->getChars(II[B)V

    .line 344
    .line 345
    .line 346
    const/16 v5, 0x3a

    .line 347
    .line 348
    aput-byte v5, v10, v3

    .line 349
    .line 350
    add-int/lit8 v2, v2, 0x17

    .line 351
    .line 352
    aput-byte v4, v10, v2

    .line 353
    .line 354
    mul-int/lit16 v0, v0, 0xe10

    .line 355
    .line 356
    sub-int/2addr v6, v0

    .line 357
    div-int/lit8 v6, v6, 0x3c

    .line 358
    .line 359
    if-gez v6, :cond_11

    .line 360
    .line 361
    neg-int v6, v6

    .line 362
    :cond_11
    invoke-static {v6, v14, v10}, Lcom/alibaba/fastjson2/util/IOUtils;->getChars(II[B)V

    .line 363
    .line 364
    .line 365
    :cond_12
    :goto_8
    new-instance v0, Ljava/lang/String;

    .line 366
    .line 367
    sget-object v2, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 368
    .line 369
    invoke-direct {v0, v10, v1, v14, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 370
    .line 371
    .line 372
    return-object v0

    .line 373
    :cond_13
    new-instance v0, Ljava/time/DateTimeException;

    .line 374
    .line 375
    const-string v1, "Invalid secondOfDay "

    .line 376
    .line 377
    invoke-static {v9, v10, v1}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    invoke-direct {v0, v1}, Ljava/time/DateTimeException;-><init>(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    throw v0

    .line 385
    :cond_14
    new-instance v0, Ljava/time/DateTimeException;

    .line 386
    .line 387
    const-string v1, "Invalid year "

    .line 388
    .line 389
    invoke-static {v9, v10, v1}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    invoke-direct {v0, v1}, Ljava/time/DateTimeException;-><init>(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    throw v0
.end method

.method public static toString(Ljava/util/Date;)Ljava/lang/String;
    .locals 3

    .line 397
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    const/4 p0, 0x0

    sget-object v2, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    invoke-static {v0, v1, p0, v2}, Lcom/alibaba/fastjson2/util/DateUtils;->toString(JZLjava/time/ZoneId;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static utcSeconds(IIIIII)J
    .locals 3

    .line 1
    mul-int/lit16 v0, p0, 0x16d

    .line 2
    .line 3
    add-int/lit8 v1, p0, 0x3

    .line 4
    .line 5
    div-int/lit8 v1, v1, 0x4

    .line 6
    .line 7
    add-int/lit8 v2, p0, 0x63

    .line 8
    .line 9
    div-int/lit8 v2, v2, 0x64

    .line 10
    .line 11
    sub-int/2addr v1, v2

    .line 12
    add-int/lit16 v2, p0, 0x18f

    .line 13
    .line 14
    div-int/lit16 v2, v2, 0x190

    .line 15
    .line 16
    add-int/2addr v2, v1

    .line 17
    add-int/2addr v2, v0

    .line 18
    mul-int/lit16 v0, p1, 0x16f

    .line 19
    .line 20
    add-int/lit16 v0, v0, -0x16a

    .line 21
    .line 22
    div-int/lit8 v0, v0, 0xc

    .line 23
    .line 24
    add-int/2addr v0, v2

    .line 25
    add-int/lit8 p2, p2, -0x1

    .line 26
    .line 27
    add-int/2addr p2, v0

    .line 28
    int-to-long v0, p2

    .line 29
    const/4 p2, 0x2

    .line 30
    if-le p1, p2, :cond_2

    .line 31
    .line 32
    const-wide/16 p1, 0x1

    .line 33
    .line 34
    sub-long p1, v0, p1

    .line 35
    .line 36
    and-int/lit8 v2, p0, 0x3

    .line 37
    .line 38
    if-nez v2, :cond_1

    .line 39
    .line 40
    rem-int/lit8 v2, p0, 0x64

    .line 41
    .line 42
    if-nez v2, :cond_0

    .line 43
    .line 44
    rem-int/lit16 p0, p0, 0x190

    .line 45
    .line 46
    if-nez p0, :cond_1

    .line 47
    .line 48
    :cond_0
    move-wide v0, p1

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const-wide/16 p0, 0x2

    .line 51
    .line 52
    sub-long/2addr v0, p0

    .line 53
    :cond_2
    :goto_0
    const-wide/32 p0, 0xafaa8

    .line 54
    .line 55
    .line 56
    sub-long/2addr v0, p0

    .line 57
    const-wide/32 p0, 0x15180

    .line 58
    .line 59
    .line 60
    mul-long/2addr v0, p0

    .line 61
    mul-int/lit16 p3, p3, 0xe10

    .line 62
    .line 63
    int-to-long p0, p3

    .line 64
    add-long/2addr v0, p0

    .line 65
    mul-int/lit8 p4, p4, 0x3c

    .line 66
    .line 67
    int-to-long p0, p4

    .line 68
    add-long/2addr v0, p0

    .line 69
    int-to-long p0, p5

    .line 70
    add-long/2addr v0, p0

    .line 71
    return-wide v0
.end method

.method public static ymd([BI)J
    .locals 8

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 4
    .line 5
    int-to-long v3, p1

    .line 6
    add-long/2addr v1, v3

    .line 7
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    sget-boolean v0, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {p0, p1}, Ljava/lang/Long;->reverseBytes(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide p0

    .line 19
    :cond_0
    const-wide v0, 0xff0000ff0000L

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    and-long/2addr v0, p0

    .line 25
    const-wide v2, 0x2d00002d0000L

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    cmp-long v0, v0, v2

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    const-wide v0, -0xf0fff0f0fff0f10L    # -1.0176920443765422E236

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    and-long v2, p0, v0

    .line 40
    .line 41
    const-wide v4, 0x3030003030003030L    # 1.3818504690893197E-76

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    sub-long/2addr v2, v4

    .line 47
    const-wide v4, 0xf0f000f0f000f0fL    # 3.808538281982251E-236

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    and-long/2addr v4, p0

    .line 53
    const-wide v6, 0x606000606000606L

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    add-long/2addr v4, v6

    .line 59
    and-long/2addr v0, v4

    .line 60
    or-long/2addr v0, v2

    .line 61
    const-wide/16 v2, 0x0

    .line 62
    .line 63
    cmp-long v0, v0, v2

    .line 64
    .line 65
    if-eqz v0, :cond_1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    const-wide v0, 0xf00000f00000fL

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    and-long/2addr v0, p0

    .line 74
    const/4 v2, 0x3

    .line 75
    shl-long v2, v0, v2

    .line 76
    .line 77
    const/4 v4, 0x1

    .line 78
    shl-long/2addr v0, v4

    .line 79
    add-long/2addr v2, v0

    .line 80
    const-wide v0, 0xf00000f00000f00L

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    and-long/2addr p0, v0

    .line 86
    const/16 v0, 0x8

    .line 87
    .line 88
    shr-long/2addr p0, v0

    .line 89
    add-long/2addr v2, p0

    .line 90
    return-wide v2

    .line 91
    :cond_2
    :goto_0
    const-wide/16 p0, -0x1

    .line 92
    .line 93
    return-wide p0
.end method

.method public static yy([BI)I
    .locals 5

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 4
    .line 5
    int-to-long v3, p1

    .line 6
    add-long/2addr v1, v3

    .line 7
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getShort(Ljava/lang/Object;J)S

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    sget-boolean p1, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-static {p0}, Ljava/lang/Short;->reverseBytes(S)S

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    :cond_0
    const p1, 0xf0f0

    .line 20
    .line 21
    .line 22
    and-int v0, p0, p1

    .line 23
    .line 24
    add-int/lit16 v0, v0, -0x3030

    .line 25
    .line 26
    and-int/lit16 v1, p0, 0xf0f

    .line 27
    .line 28
    add-int/lit16 v2, v1, 0x606

    .line 29
    .line 30
    and-int/2addr p1, v2

    .line 31
    or-int/2addr p1, v0

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    const/4 p0, -0x1

    .line 35
    return p0

    .line 36
    :cond_1
    and-int/lit8 p0, p0, 0xf

    .line 37
    .line 38
    mul-int/lit16 p0, p0, 0x3e8

    .line 39
    .line 40
    shr-int/lit8 p1, v1, 0x8

    .line 41
    .line 42
    mul-int/lit8 p1, p1, 0x64

    .line 43
    .line 44
    add-int/2addr p1, p0

    .line 45
    return p1
.end method

.method public static zoneOffset([BII)Ljava/time/ZoneOffset;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/String;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Ljava/lang/String;-><init>([BII)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/time/ZoneOffset;->of(Ljava/lang/String;)Ljava/time/ZoneOffset;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static zoneOffset([CII)Ljava/time/ZoneOffset;
    .locals 1

    .line 11
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p0, p1, p2}, Ljava/lang/String;-><init>([CII)V

    invoke-static {v0}, Ljava/time/ZoneOffset;->of(Ljava/lang/String;)Ljava/time/ZoneOffset;

    move-result-object p0

    return-object p0
.end method
