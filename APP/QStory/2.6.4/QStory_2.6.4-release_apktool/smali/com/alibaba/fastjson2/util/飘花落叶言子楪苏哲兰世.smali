.class public abstract Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static 飘花落叶言子楪世兰哲苏:Ljava/time/format/DateTimeFormatter;

.field public static final 飘花落叶言子楪世兰苏哲:Ljava/time/LocalDate;

.field public static final 飘花落叶言子楪世哲兰苏:Ljava/time/ZoneId;

.field public static final 飘花落叶言子楪世哲苏兰:Ljava/time/zone/ZoneRules;

.field public static final 飘花落叶言子楪世苏兰哲:Ljava/time/ZoneId;

.field public static final 飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

.field public static 飘花落叶言子楪苏世兰哲:Ljava/time/format/DateTimeFormatter;

.field public static 飘花落叶言子楪苏世哲兰:Ljava/time/format/DateTimeFormatter;

.field public static final 飘花落叶言子楪苏兰世哲:[I

.field public static 飘花落叶言子楪苏哲世兰:Ljava/time/format/DateTimeFormatter;

.field public static final 飘花落叶言子楪苏哲兰世:I


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
    sput-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

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
    sput-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Ljava/time/ZoneId;

    .line 32
    .line 33
    sput-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰:Ljava/time/zone/ZoneRules;

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
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏:Ljava/time/ZoneId;

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
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰苏哲:Ljava/time/LocalDate;

    .line 51
    .line 52
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 53
    .line 54
    .line 55
    move-result-wide v3

    .line 56
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

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
    invoke-static {v5, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰苏哲(J)I

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
    sput v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲兰世:I

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
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲:[I

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

.method public static 飘花落叶言子世兰哲楪苏([BI)Ljava/time/LocalTime;
    .locals 6

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
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世哲兰([BI)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const-wide/16 v3, -0x1

    .line 12
    .line 13
    cmp-long v3, v0, v3

    .line 14
    .line 15
    if-eqz v3, :cond_2

    .line 16
    .line 17
    add-int/lit8 v3, p1, 0x8

    .line 18
    .line 19
    aget-byte v3, p0, v3

    .line 20
    .line 21
    const/16 v4, 0x2e

    .line 22
    .line 23
    if-eq v3, v4, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    long-to-int v3, v0

    .line 27
    and-int/lit16 v3, v3, 0xff

    .line 28
    .line 29
    const/16 v4, 0x18

    .line 30
    .line 31
    shr-long v4, v0, v4

    .line 32
    .line 33
    long-to-int v4, v4

    .line 34
    and-int/lit16 v4, v4, 0xff

    .line 35
    .line 36
    const/16 v5, 0x30

    .line 37
    .line 38
    shr-long/2addr v0, v5

    .line 39
    long-to-int v0, v0

    .line 40
    and-int/lit16 v0, v0, 0xff

    .line 41
    .line 42
    add-int/lit8 p1, p1, 0x9

    .line 43
    .line 44
    const/4 v1, 0x6

    .line 45
    invoke-static {v1, p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏哲世楪兰(I[BI)I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-gez p0, :cond_1

    .line 50
    .line 51
    return-object v2

    .line 52
    :cond_1
    invoke-static {v3, v4, v0, p0}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :cond_2
    :goto_0
    return-object v2
.end method

.method public static 飘花落叶言子世兰哲苏楪([BI)Ljava/time/LocalTime;
    .locals 6

    .line 1
    add-int/lit8 v0, p1, 0x12

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-gt v0, v1, :cond_2

    .line 6
    .line 7
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世哲兰([BI)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const-wide/16 v3, -0x1

    .line 12
    .line 13
    cmp-long v3, v0, v3

    .line 14
    .line 15
    if-eqz v3, :cond_2

    .line 16
    .line 17
    add-int/lit8 v3, p1, 0x8

    .line 18
    .line 19
    aget-byte v3, p0, v3

    .line 20
    .line 21
    const/16 v4, 0x2e

    .line 22
    .line 23
    if-eq v3, v4, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    long-to-int v3, v0

    .line 27
    and-int/lit16 v3, v3, 0xff

    .line 28
    .line 29
    const/16 v4, 0x18

    .line 30
    .line 31
    shr-long v4, v0, v4

    .line 32
    .line 33
    long-to-int v4, v4

    .line 34
    and-int/lit16 v4, v4, 0xff

    .line 35
    .line 36
    const/16 v5, 0x30

    .line 37
    .line 38
    shr-long/2addr v0, v5

    .line 39
    long-to-int v0, v0

    .line 40
    and-int/lit16 v0, v0, 0xff

    .line 41
    .line 42
    const/16 v1, 0x9

    .line 43
    .line 44
    add-int/2addr p1, v1

    .line 45
    invoke-static {v1, p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏哲世楪兰(I[BI)I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-gez p0, :cond_1

    .line 50
    .line 51
    return-object v2

    .line 52
    :cond_1
    invoke-static {v3, v4, v0, p0}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :cond_2
    :goto_0
    return-object v2
.end method

.method public static 飘花落叶言子世兰楪哲苏([BI)Ljava/time/LocalTime;
    .locals 4

    .line 1
    add-int/lit8 v0, p1, 0xa

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-gt v0, v1, :cond_3

    .line 6
    .line 7
    add-int/lit8 v0, p1, 0x2

    .line 8
    .line 9
    aget-byte v0, p0, v0

    .line 10
    .line 11
    const/16 v1, 0x3a

    .line 12
    .line 13
    if-ne v0, v1, :cond_3

    .line 14
    .line 15
    add-int/lit8 v0, p1, 0x5

    .line 16
    .line 17
    aget-byte v0, p0, v0

    .line 18
    .line 19
    if-ne v0, v1, :cond_3

    .line 20
    .line 21
    add-int/lit8 v0, p1, 0x8

    .line 22
    .line 23
    aget-byte v0, p0, v0

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
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    add-int/lit8 v1, p1, 0x3

    .line 35
    .line 36
    invoke-static {p0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    add-int/lit8 v3, p1, 0x6

    .line 41
    .line 42
    invoke-static {p0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    add-int/lit8 p1, p1, 0x9

    .line 47
    .line 48
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-lez p0, :cond_1

    .line 53
    .line 54
    const p1, 0x5f5e100

    .line 55
    .line 56
    .line 57
    mul-int/2addr p0, p1

    .line 58
    :cond_1
    or-int p1, v0, v1

    .line 59
    .line 60
    or-int/2addr p1, v3

    .line 61
    or-int/2addr p1, v1

    .line 62
    if-gez p1, :cond_2

    .line 63
    .line 64
    return-object v2

    .line 65
    :cond_2
    invoke-static {v0, v1, v3, p0}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :cond_3
    :goto_0
    return-object v2
.end method

.method public static 飘花落叶言子世兰楪苏哲(I[BI)Ljava/time/LocalDateTime;
    .locals 33

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move/from16 v2, p2

    .line 4
    .line 5
    if-eqz v1, :cond_0

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
    aget-byte v4, v1, p0

    .line 26
    .line 27
    int-to-char v5, v4

    .line 28
    add-int/lit8 v4, p0, 0x1

    .line 29
    .line 30
    aget-byte v4, v1, v4

    .line 31
    .line 32
    int-to-char v6, v4

    .line 33
    add-int/lit8 v4, p0, 0x2

    .line 34
    .line 35
    aget-byte v4, v1, v4

    .line 36
    .line 37
    int-to-char v7, v4

    .line 38
    add-int/lit8 v4, p0, 0x3

    .line 39
    .line 40
    aget-byte v4, v1, v4

    .line 41
    .line 42
    int-to-char v8, v4

    .line 43
    add-int/lit8 v4, p0, 0x4

    .line 44
    .line 45
    aget-byte v4, v1, v4

    .line 46
    .line 47
    int-to-char v4, v4

    .line 48
    add-int/lit8 v9, p0, 0x5

    .line 49
    .line 50
    aget-byte v9, v1, v9

    .line 51
    .line 52
    int-to-char v9, v9

    .line 53
    add-int/lit8 v10, p0, 0x6

    .line 54
    .line 55
    aget-byte v10, v1, v10

    .line 56
    .line 57
    int-to-char v10, v10

    .line 58
    add-int/lit8 v11, p0, 0x7

    .line 59
    .line 60
    aget-byte v11, v1, v11

    .line 61
    .line 62
    int-to-char v11, v11

    .line 63
    add-int/lit8 v12, p0, 0x8

    .line 64
    .line 65
    aget-byte v12, v1, v12

    .line 66
    .line 67
    int-to-char v12, v12

    .line 68
    add-int/lit8 v13, p0, 0x9

    .line 69
    .line 70
    aget-byte v13, v1, v13

    .line 71
    .line 72
    int-to-char v13, v13

    .line 73
    add-int/lit8 v14, p0, 0xa

    .line 74
    .line 75
    aget-byte v14, v1, v14

    .line 76
    .line 77
    int-to-char v14, v14

    .line 78
    add-int/lit8 v15, p0, 0xb

    .line 79
    .line 80
    aget-byte v15, v1, v15

    .line 81
    .line 82
    int-to-char v15, v15

    .line 83
    add-int/lit8 v16, p0, 0xc

    .line 84
    .line 85
    const/16 v28, 0x0

    .line 86
    .line 87
    aget-byte v3, v1, v16

    .line 88
    .line 89
    int-to-char v3, v3

    .line 90
    add-int/lit8 v16, p0, 0xd

    .line 91
    .line 92
    aget-byte v2, v1, v16

    .line 93
    .line 94
    int-to-char v2, v2

    .line 95
    add-int/lit8 v16, p0, 0xe

    .line 96
    .line 97
    move/from16 v17, v3

    .line 98
    .line 99
    aget-byte v3, v1, v16

    .line 100
    .line 101
    int-to-char v3, v3

    .line 102
    add-int/lit8 v16, p0, 0xf

    .line 103
    .line 104
    move/from16 v18, v3

    .line 105
    .line 106
    aget-byte v3, v1, v16

    .line 107
    .line 108
    int-to-char v3, v3

    .line 109
    add-int/lit8 v16, p0, 0x10

    .line 110
    .line 111
    move/from16 v19, v3

    .line 112
    .line 113
    aget-byte v3, v1, v16

    .line 114
    .line 115
    int-to-char v3, v3

    .line 116
    add-int/lit8 v16, p0, 0x11

    .line 117
    .line 118
    move/from16 v20, v5

    .line 119
    .line 120
    aget-byte v5, v1, v16

    .line 121
    .line 122
    int-to-char v5, v5

    .line 123
    add-int/lit8 v16, p0, 0x12

    .line 124
    .line 125
    move/from16 v21, v5

    .line 126
    .line 127
    aget-byte v5, v1, v16

    .line 128
    .line 129
    int-to-char v5, v5

    .line 130
    add-int/lit8 v16, p0, 0x13

    .line 131
    .line 132
    move/from16 v22, v5

    .line 133
    .line 134
    aget-byte v5, v1, v16

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
    add-int/lit8 v16, p0, 0x14

    .line 143
    .line 144
    move/from16 v23, v6

    .line 145
    .line 146
    aget-byte v6, v1, v16

    .line 147
    .line 148
    int-to-char v6, v6

    .line 149
    add-int/lit8 v16, p0, 0x15

    .line 150
    .line 151
    move/from16 v24, v6

    .line 152
    .line 153
    aget-byte v6, v1, v16

    .line 154
    .line 155
    int-to-char v6, v6

    .line 156
    add-int/lit8 v16, p0, 0x16

    .line 157
    .line 158
    move/from16 v25, v6

    .line 159
    .line 160
    aget-byte v6, v1, v16

    .line 161
    .line 162
    int-to-char v6, v6

    .line 163
    add-int/lit8 v16, p0, 0x17

    .line 164
    .line 165
    move/from16 v26, v6

    .line 166
    .line 167
    aget-byte v6, v1, v16

    .line 168
    .line 169
    int-to-char v6, v6

    .line 170
    add-int/lit8 v16, p0, 0x18

    .line 171
    .line 172
    move/from16 v27, v6

    .line 173
    .line 174
    aget-byte v6, v1, v16

    .line 175
    .line 176
    int-to-char v6, v6

    .line 177
    add-int/lit8 v16, p0, 0x19

    .line 178
    .line 179
    move/from16 v29, v6

    .line 180
    .line 181
    aget-byte v6, v1, v16

    .line 182
    .line 183
    int-to-char v6, v6

    .line 184
    add-int/lit8 v16, p0, 0x1a

    .line 185
    .line 186
    move/from16 v30, v6

    .line 187
    .line 188
    aget-byte v6, v1, v16

    .line 189
    .line 190
    int-to-char v6, v6

    .line 191
    add-int/lit8 v16, p0, 0x1b

    .line 192
    .line 193
    move/from16 v31, v6

    .line 194
    .line 195
    aget-byte v6, v1, v16

    .line 196
    .line 197
    int-to-char v6, v6

    .line 198
    add-int/lit8 v16, p0, 0x1c

    .line 199
    .line 200
    move/from16 v32, v6

    .line 201
    .line 202
    aget-byte v6, v1, v16

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
    add-int/lit8 v6, p0, 0x14

    .line 244
    .line 245
    aget-byte v6, v1, v6

    .line 246
    .line 247
    int-to-char v6, v6

    .line 248
    add-int/lit8 v24, p0, 0x15

    .line 249
    .line 250
    move/from16 v25, v6

    .line 251
    .line 252
    aget-byte v6, v1, v24

    .line 253
    .line 254
    int-to-char v6, v6

    .line 255
    add-int/lit8 v24, p0, 0x16

    .line 256
    .line 257
    move/from16 v26, v6

    .line 258
    .line 259
    aget-byte v6, v1, v24

    .line 260
    .line 261
    int-to-char v6, v6

    .line 262
    add-int/lit8 v24, p0, 0x17

    .line 263
    .line 264
    move/from16 v27, v6

    .line 265
    .line 266
    aget-byte v6, v1, v24

    .line 267
    .line 268
    int-to-char v6, v6

    .line 269
    add-int/lit8 v24, p0, 0x18

    .line 270
    .line 271
    move/from16 v29, v6

    .line 272
    .line 273
    aget-byte v6, v1, v24

    .line 274
    .line 275
    int-to-char v6, v6

    .line 276
    add-int/lit8 v24, p0, 0x19

    .line 277
    .line 278
    move/from16 v30, v6

    .line 279
    .line 280
    aget-byte v6, v1, v24

    .line 281
    .line 282
    int-to-char v6, v6

    .line 283
    add-int/lit8 v24, p0, 0x1a

    .line 284
    .line 285
    move/from16 v31, v6

    .line 286
    .line 287
    aget-byte v6, v1, v24

    .line 288
    .line 289
    int-to-char v6, v6

    .line 290
    add-int/lit8 v24, p0, 0x1b

    .line 291
    .line 292
    move/from16 v32, v6

    .line 293
    .line 294
    aget-byte v6, v1, v24

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
    add-int/lit8 v6, p0, 0x14

    .line 334
    .line 335
    aget-byte v6, v1, v6

    .line 336
    .line 337
    int-to-char v6, v6

    .line 338
    add-int/lit8 v24, p0, 0x15

    .line 339
    .line 340
    move/from16 v25, v6

    .line 341
    .line 342
    aget-byte v6, v1, v24

    .line 343
    .line 344
    int-to-char v6, v6

    .line 345
    add-int/lit8 v24, p0, 0x16

    .line 346
    .line 347
    move/from16 v26, v6

    .line 348
    .line 349
    aget-byte v6, v1, v24

    .line 350
    .line 351
    int-to-char v6, v6

    .line 352
    add-int/lit8 v24, p0, 0x17

    .line 353
    .line 354
    move/from16 v27, v6

    .line 355
    .line 356
    aget-byte v6, v1, v24

    .line 357
    .line 358
    int-to-char v6, v6

    .line 359
    add-int/lit8 v24, p0, 0x18

    .line 360
    .line 361
    move/from16 v29, v6

    .line 362
    .line 363
    aget-byte v6, v1, v24

    .line 364
    .line 365
    int-to-char v6, v6

    .line 366
    add-int/lit8 v24, p0, 0x19

    .line 367
    .line 368
    move/from16 v30, v6

    .line 369
    .line 370
    aget-byte v6, v1, v24

    .line 371
    .line 372
    int-to-char v6, v6

    .line 373
    add-int/lit8 v24, p0, 0x1a

    .line 374
    .line 375
    move/from16 v31, v6

    .line 376
    .line 377
    aget-byte v6, v1, v24

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
    add-int/lit8 v6, p0, 0x14

    .line 419
    .line 420
    aget-byte v6, v1, v6

    .line 421
    .line 422
    int-to-char v6, v6

    .line 423
    add-int/lit8 v24, p0, 0x15

    .line 424
    .line 425
    move/from16 v25, v6

    .line 426
    .line 427
    aget-byte v6, v1, v24

    .line 428
    .line 429
    int-to-char v6, v6

    .line 430
    add-int/lit8 v24, p0, 0x16

    .line 431
    .line 432
    move/from16 v26, v6

    .line 433
    .line 434
    aget-byte v6, v1, v24

    .line 435
    .line 436
    int-to-char v6, v6

    .line 437
    add-int/lit8 v24, p0, 0x17

    .line 438
    .line 439
    move/from16 v27, v6

    .line 440
    .line 441
    aget-byte v6, v1, v24

    .line 442
    .line 443
    int-to-char v6, v6

    .line 444
    add-int/lit8 v24, p0, 0x18

    .line 445
    .line 446
    move/from16 v29, v6

    .line 447
    .line 448
    aget-byte v6, v1, v24

    .line 449
    .line 450
    int-to-char v6, v6

    .line 451
    add-int/lit8 v24, p0, 0x19

    .line 452
    .line 453
    move/from16 v30, v6

    .line 454
    .line 455
    aget-byte v6, v1, v24

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
    add-int/lit8 v6, p0, 0x14

    .line 495
    .line 496
    aget-byte v6, v1, v6

    .line 497
    .line 498
    int-to-char v6, v6

    .line 499
    add-int/lit8 v24, p0, 0x15

    .line 500
    .line 501
    move/from16 v25, v6

    .line 502
    .line 503
    aget-byte v6, v1, v24

    .line 504
    .line 505
    int-to-char v6, v6

    .line 506
    add-int/lit8 v24, p0, 0x16

    .line 507
    .line 508
    move/from16 v26, v6

    .line 509
    .line 510
    aget-byte v6, v1, v24

    .line 511
    .line 512
    int-to-char v6, v6

    .line 513
    add-int/lit8 v24, p0, 0x17

    .line 514
    .line 515
    move/from16 v27, v6

    .line 516
    .line 517
    aget-byte v6, v1, v24

    .line 518
    .line 519
    int-to-char v6, v6

    .line 520
    add-int/lit8 v24, p0, 0x18

    .line 521
    .line 522
    move/from16 v29, v6

    .line 523
    .line 524
    aget-byte v6, v1, v24

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
    add-int/lit8 v6, p0, 0x14

    .line 564
    .line 565
    aget-byte v6, v1, v6

    .line 566
    .line 567
    int-to-char v6, v6

    .line 568
    add-int/lit8 v24, p0, 0x15

    .line 569
    .line 570
    move/from16 v25, v6

    .line 571
    .line 572
    aget-byte v6, v1, v24

    .line 573
    .line 574
    int-to-char v6, v6

    .line 575
    add-int/lit8 v24, p0, 0x16

    .line 576
    .line 577
    move/from16 v26, v6

    .line 578
    .line 579
    aget-byte v6, v1, v24

    .line 580
    .line 581
    int-to-char v6, v6

    .line 582
    add-int/lit8 v24, p0, 0x17

    .line 583
    .line 584
    move/from16 v27, v6

    .line 585
    .line 586
    aget-byte v6, v1, v24

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
    add-int/lit8 v6, p0, 0x14

    .line 626
    .line 627
    aget-byte v6, v1, v6

    .line 628
    .line 629
    int-to-char v6, v6

    .line 630
    add-int/lit8 v24, p0, 0x15

    .line 631
    .line 632
    move/from16 v25, v6

    .line 633
    .line 634
    aget-byte v6, v1, v24

    .line 635
    .line 636
    int-to-char v6, v6

    .line 637
    add-int/lit8 v24, p0, 0x16

    .line 638
    .line 639
    move/from16 v26, v6

    .line 640
    .line 641
    aget-byte v6, v1, v24

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
    add-int/lit8 v6, p0, 0x14

    .line 678
    .line 679
    aget-byte v6, v1, v6

    .line 680
    .line 681
    int-to-char v6, v6

    .line 682
    add-int/lit8 v24, p0, 0x15

    .line 683
    .line 684
    move/from16 v25, v6

    .line 685
    .line 686
    aget-byte v6, v1, v24

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
    add-int/lit8 v6, p0, 0x14

    .line 725
    .line 726
    aget-byte v6, v1, v6

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
    invoke-static/range {v5 .. v27}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲世兰(CCCCCCCCCCCCCCCCCCCCCCC)Ljava/time/LocalDateTime;

    .line 796
    .line 797
    .line 798
    move-result-object v0

    .line 799
    return-object v0

    .line 800
    :cond_5
    add-int v2, p0, p2

    .line 801
    .line 802
    add-int/lit8 v3, v2, -0xf

    .line 803
    .line 804
    aget-byte v3, v1, v3

    .line 805
    .line 806
    if-ne v3, v0, :cond_7

    .line 807
    .line 808
    add-int/lit8 v3, v2, -0xc

    .line 809
    .line 810
    aget-byte v3, v1, v3

    .line 811
    .line 812
    if-ne v3, v0, :cond_7

    .line 813
    .line 814
    add-int/lit8 v0, v2, -0x9

    .line 815
    .line 816
    aget-byte v0, v1, v0

    .line 817
    .line 818
    const/16 v4, 0x20

    .line 819
    .line 820
    if-eq v0, v4, :cond_6

    .line 821
    .line 822
    const/16 v4, 0x54

    .line 823
    .line 824
    if-ne v0, v4, :cond_7

    .line 825
    .line 826
    :cond_6
    add-int/lit8 v0, v2, -0x6

    .line 827
    .line 828
    aget-byte v0, v1, v0

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
    aget-byte v0, v1, v0

    .line 837
    .line 838
    if-ne v0, v4, :cond_7

    .line 839
    .line 840
    add-int/lit8 v0, p2, -0xf

    .line 841
    .line 842
    move/from16 v3, p0

    .line 843
    .line 844
    invoke-static {v3, v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰哲苏世(I[BI)I

    .line 845
    .line 846
    .line 847
    move-result v3

    .line 848
    add-int/lit8 v0, v2, -0xe

    .line 849
    .line 850
    const/4 v4, 0x2

    .line 851
    invoke-static {v0, v1, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰哲苏世(I[BI)I

    .line 852
    .line 853
    .line 854
    move-result v0

    .line 855
    add-int/lit8 v5, v2, -0xb

    .line 856
    .line 857
    invoke-static {v5, v1, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰哲苏世(I[BI)I

    .line 858
    .line 859
    .line 860
    move-result v5

    .line 861
    add-int/lit8 v6, v2, -0x8

    .line 862
    .line 863
    invoke-static {v6, v1, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰哲苏世(I[BI)I

    .line 864
    .line 865
    .line 866
    move-result v6

    .line 867
    add-int/lit8 v7, v2, -0x5

    .line 868
    .line 869
    invoke-static {v7, v1, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰哲苏世(I[BI)I

    .line 870
    .line 871
    .line 872
    move-result v7

    .line 873
    sub-int/2addr v2, v4

    .line 874
    invoke-static {v2, v1, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰哲苏世(I[BI)I

    .line 875
    .line 876
    .line 877
    move-result v8

    .line 878
    move v4, v0

    .line 879
    invoke-static/range {v3 .. v8}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    return-object v0

    .line 884
    :cond_7
    :goto_2
    return-object v28

    .line 885
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

.method public static 飘花落叶言子世兰苏哲楪([BI)Ljava/time/LocalTime;
    .locals 6

    .line 1
    add-int/lit8 v0, p1, 0xc

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    if-gt v0, v1, :cond_3

    .line 5
    .line 6
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世哲兰([BI)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const-wide/16 v2, -0x1

    .line 11
    .line 12
    cmp-long v2, v0, v2

    .line 13
    .line 14
    if-eqz v2, :cond_3

    .line 15
    .line 16
    add-int/lit8 v2, p1, 0x8

    .line 17
    .line 18
    aget-byte v2, p0, v2

    .line 19
    .line 20
    const/16 v3, 0x2e

    .line 21
    .line 22
    if-eq v2, v3, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    long-to-int v2, v0

    .line 26
    and-int/lit16 v2, v2, 0xff

    .line 27
    .line 28
    const/16 v3, 0x18

    .line 29
    .line 30
    shr-long v3, v0, v3

    .line 31
    .line 32
    long-to-int v3, v3

    .line 33
    and-int/lit16 v3, v3, 0xff

    .line 34
    .line 35
    const/16 v4, 0x30

    .line 36
    .line 37
    shr-long/2addr v0, v4

    .line 38
    long-to-int v0, v0

    .line 39
    and-int/lit16 v0, v0, 0xff

    .line 40
    .line 41
    add-int/lit8 v1, p1, 0x9

    .line 42
    .line 43
    invoke-static {p0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪哲苏兰([BI)S

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    add-int/lit8 p1, p1, 0xb

    .line 48
    .line 49
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏兰世哲([BI)B

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    shl-int/lit8 p0, p0, 0x10

    .line 54
    .line 55
    or-int/2addr p0, v1

    .line 56
    const p1, 0xf0f0f0

    .line 57
    .line 58
    .line 59
    and-int v1, p0, p1

    .line 60
    .line 61
    const v4, 0x303030

    .line 62
    .line 63
    .line 64
    sub-int/2addr v1, v4

    .line 65
    const v4, 0xf0f0f

    .line 66
    .line 67
    .line 68
    and-int/2addr v4, p0

    .line 69
    const v5, 0x60606

    .line 70
    .line 71
    .line 72
    add-int/2addr v5, v4

    .line 73
    and-int/2addr p1, v5

    .line 74
    or-int/2addr p1, v1

    .line 75
    if-eqz p1, :cond_1

    .line 76
    .line 77
    const/4 p0, -0x1

    .line 78
    goto :goto_0

    .line 79
    :cond_1
    and-int/lit8 p0, p0, 0xf

    .line 80
    .line 81
    mul-int/lit8 p0, p0, 0xa

    .line 82
    .line 83
    shr-int/lit8 p1, v4, 0x8

    .line 84
    .line 85
    and-int/lit8 p1, p1, 0xf

    .line 86
    .line 87
    add-int/2addr p0, p1

    .line 88
    mul-int/lit8 p0, p0, 0xa

    .line 89
    .line 90
    shr-int/lit8 p1, v4, 0x10

    .line 91
    .line 92
    add-int/2addr p0, p1

    .line 93
    :goto_0
    if-lez p0, :cond_2

    .line 94
    .line 95
    const p1, 0xf4240

    .line 96
    .line 97
    .line 98
    mul-int/2addr p0, p1

    .line 99
    :cond_2
    invoke-static {v2, v3, v0, p0}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0

    .line 104
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 105
    return-object p0
.end method

.method public static 飘花落叶言子世兰苏楪哲([BI)Ljava/time/LocalTime;
    .locals 5

    .line 1
    add-int/lit8 v0, p1, 0xb

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    if-gt v0, v1, :cond_2

    .line 5
    .line 6
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世哲兰([BI)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const-wide/16 v2, -0x1

    .line 11
    .line 12
    cmp-long v2, v0, v2

    .line 13
    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    add-int/lit8 v2, p1, 0x8

    .line 17
    .line 18
    aget-byte v2, p0, v2

    .line 19
    .line 20
    const/16 v3, 0x2e

    .line 21
    .line 22
    if-eq v2, v3, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    long-to-int v2, v0

    .line 26
    and-int/lit16 v2, v2, 0xff

    .line 27
    .line 28
    const/16 v3, 0x18

    .line 29
    .line 30
    shr-long v3, v0, v3

    .line 31
    .line 32
    long-to-int v3, v3

    .line 33
    and-int/lit16 v3, v3, 0xff

    .line 34
    .line 35
    const/16 v4, 0x30

    .line 36
    .line 37
    shr-long/2addr v0, v4

    .line 38
    long-to-int v0, v0

    .line 39
    and-int/lit16 v0, v0, 0xff

    .line 40
    .line 41
    add-int/lit8 p1, p1, 0x9

    .line 42
    .line 43
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-lez p0, :cond_1

    .line 48
    .line 49
    const p1, 0x989680

    .line 50
    .line 51
    .line 52
    mul-int/2addr p0, p1

    .line 53
    :cond_1
    invoke-static {v2, v3, v0, p0}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 59
    return-object p0
.end method

.method public static 飘花落叶言子世哲兰楪苏([BI)Ljava/time/LocalDateTime;
    .locals 10

    .line 1
    add-int/lit8 v0, p1, 0x13

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
    aget-byte v0, p0, v0

    .line 10
    .line 11
    const/16 v1, 0x20

    .line 12
    .line 13
    if-ne v0, v1, :cond_2

    .line 14
    .line 15
    add-int/lit8 v0, p1, 0x6

    .line 16
    .line 17
    aget-byte v0, p0, v0

    .line 18
    .line 19
    if-ne v0, v1, :cond_2

    .line 20
    .line 21
    add-int/lit8 v0, p1, 0xb

    .line 22
    .line 23
    aget-byte v0, p0, v0

    .line 24
    .line 25
    if-ne v0, v1, :cond_2

    .line 26
    .line 27
    add-int/lit8 v0, p1, 0xc

    .line 28
    .line 29
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世哲兰([BI)J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    const-wide/16 v3, -0x1

    .line 34
    .line 35
    cmp-long v3, v0, v3

    .line 36
    .line 37
    if-nez v3, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    add-int/lit8 v3, p1, 0x3

    .line 45
    .line 46
    aget-byte v3, p0, v3

    .line 47
    .line 48
    add-int/lit8 v4, p1, 0x4

    .line 49
    .line 50
    aget-byte v4, p0, v4

    .line 51
    .line 52
    add-int/lit8 v5, p1, 0x5

    .line 53
    .line 54
    aget-byte v5, p0, v5

    .line 55
    .line 56
    invoke-static {v3, v4, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰哲世(BBB)I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    add-int/lit8 p1, p1, 0x7

    .line 61
    .line 62
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    long-to-int p0, v0

    .line 67
    and-int/lit16 v7, p0, 0xff

    .line 68
    .line 69
    const/16 p0, 0x18

    .line 70
    .line 71
    shr-long v8, v0, p0

    .line 72
    .line 73
    long-to-int p1, v8

    .line 74
    and-int/lit16 v8, p1, 0xff

    .line 75
    .line 76
    const/16 p1, 0x30

    .line 77
    .line 78
    shr-long/2addr v0, p1

    .line 79
    long-to-int p1, v0

    .line 80
    and-int/lit16 v9, p1, 0xff

    .line 81
    .line 82
    or-int p1, v4, v5

    .line 83
    .line 84
    or-int/2addr p1, v6

    .line 85
    or-int/2addr p1, v7

    .line 86
    or-int/2addr p1, v8

    .line 87
    or-int/2addr p1, v9

    .line 88
    if-lez p1, :cond_2

    .line 89
    .line 90
    if-gt v7, p0, :cond_2

    .line 91
    .line 92
    const/16 p0, 0x3b

    .line 93
    .line 94
    if-gt v8, p0, :cond_2

    .line 95
    .line 96
    const/16 p0, 0x3c

    .line 97
    .line 98
    if-le v9, p0, :cond_1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_1
    invoke-static/range {v4 .. v9}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0

    .line 106
    :cond_2
    :goto_0
    return-object v2
.end method

.method public static 飘花落叶言子世哲兰苏楪(II[C)Ljava/time/LocalDateTime;
    .locals 33

    .line 1
    move/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    :cond_0
    const/16 v28, 0x0

    .line 10
    .line 11
    goto/16 :goto_4

    .line 12
    .line 13
    :cond_1
    const/16 v4, 0x15

    .line 14
    .line 15
    if-lt v1, v4, :cond_2

    .line 16
    .line 17
    const/16 v4, 0x1d

    .line 18
    .line 19
    if-le v1, v4, :cond_3

    .line 20
    .line 21
    :cond_2
    const/16 v28, 0x0

    .line 22
    .line 23
    goto/16 :goto_4

    .line 24
    .line 25
    :cond_3
    aget-char v5, v2, p0

    .line 26
    .line 27
    add-int/lit8 v4, p0, 0x1

    .line 28
    .line 29
    aget-char v6, v2, v4

    .line 30
    .line 31
    add-int/lit8 v4, p0, 0x2

    .line 32
    .line 33
    aget-char v7, v2, v4

    .line 34
    .line 35
    add-int/lit8 v4, p0, 0x3

    .line 36
    .line 37
    aget-char v8, v2, v4

    .line 38
    .line 39
    add-int/lit8 v4, p0, 0x4

    .line 40
    .line 41
    aget-char v4, v2, v4

    .line 42
    .line 43
    add-int/lit8 v9, p0, 0x5

    .line 44
    .line 45
    aget-char v9, v2, v9

    .line 46
    .line 47
    add-int/lit8 v10, p0, 0x6

    .line 48
    .line 49
    aget-char v10, v2, v10

    .line 50
    .line 51
    add-int/lit8 v11, p0, 0x7

    .line 52
    .line 53
    aget-char v11, v2, v11

    .line 54
    .line 55
    add-int/lit8 v12, p0, 0x8

    .line 56
    .line 57
    aget-char v12, v2, v12

    .line 58
    .line 59
    add-int/lit8 v13, p0, 0x9

    .line 60
    .line 61
    aget-char v13, v2, v13

    .line 62
    .line 63
    add-int/lit8 v14, p0, 0xa

    .line 64
    .line 65
    aget-char v14, v2, v14

    .line 66
    .line 67
    add-int/lit8 v15, p0, 0xb

    .line 68
    .line 69
    aget-char v15, v2, v15

    .line 70
    .line 71
    add-int/lit8 v16, p0, 0xc

    .line 72
    .line 73
    aget-char v16, v2, v16

    .line 74
    .line 75
    add-int/lit8 v17, p0, 0xd

    .line 76
    .line 77
    const/16 v28, 0x0

    .line 78
    .line 79
    aget-char v3, v2, v17

    .line 80
    .line 81
    add-int/lit8 v17, p0, 0xe

    .line 82
    .line 83
    aget-char v17, v2, v17

    .line 84
    .line 85
    add-int/lit8 v18, p0, 0xf

    .line 86
    .line 87
    aget-char v18, v2, v18

    .line 88
    .line 89
    add-int/lit8 v19, p0, 0x10

    .line 90
    .line 91
    aget-char v1, v2, v19

    .line 92
    .line 93
    add-int/lit8 v19, p0, 0x11

    .line 94
    .line 95
    aget-char v19, v2, v19

    .line 96
    .line 97
    add-int/lit8 v20, p0, 0x12

    .line 98
    .line 99
    aget-char v20, v2, v20

    .line 100
    .line 101
    add-int/lit8 v21, p0, 0x13

    .line 102
    .line 103
    move/from16 v22, v5

    .line 104
    .line 105
    aget-char v5, v2, v21

    .line 106
    .line 107
    const/16 v21, 0x30

    .line 108
    .line 109
    packed-switch p1, :pswitch_data_0

    .line 110
    .line 111
    .line 112
    add-int/lit8 v21, p0, 0x14

    .line 113
    .line 114
    aget-char v21, v2, v21

    .line 115
    .line 116
    add-int/lit8 v23, p0, 0x15

    .line 117
    .line 118
    aget-char v23, v2, v23

    .line 119
    .line 120
    add-int/lit8 v24, p0, 0x16

    .line 121
    .line 122
    aget-char v24, v2, v24

    .line 123
    .line 124
    add-int/lit8 v25, p0, 0x17

    .line 125
    .line 126
    aget-char v25, v2, v25

    .line 127
    .line 128
    add-int/lit8 v26, p0, 0x18

    .line 129
    .line 130
    aget-char v26, v2, v26

    .line 131
    .line 132
    add-int/lit8 v27, p0, 0x19

    .line 133
    .line 134
    aget-char v27, v2, v27

    .line 135
    .line 136
    add-int/lit8 v29, p0, 0x1a

    .line 137
    .line 138
    aget-char v29, v2, v29

    .line 139
    .line 140
    add-int/lit8 v30, p0, 0x1b

    .line 141
    .line 142
    aget-char v30, v2, v30

    .line 143
    .line 144
    add-int/lit8 v31, p0, 0x1c

    .line 145
    .line 146
    aget-char v31, v2, v31

    .line 147
    .line 148
    move/from16 v32, v31

    .line 149
    .line 150
    move/from16 v31, v16

    .line 151
    .line 152
    move/from16 v16, v18

    .line 153
    .line 154
    move/from16 v18, v20

    .line 155
    .line 156
    move/from16 v20, v23

    .line 157
    .line 158
    move/from16 v23, v26

    .line 159
    .line 160
    move/from16 v26, v30

    .line 161
    .line 162
    move/from16 v30, v29

    .line 163
    .line 164
    move/from16 v29, v22

    .line 165
    .line 166
    move/from16 v22, v25

    .line 167
    .line 168
    move/from16 v25, v24

    .line 169
    .line 170
    move/from16 v24, v27

    .line 171
    .line 172
    move/from16 v27, v32

    .line 173
    .line 174
    goto/16 :goto_3

    .line 175
    .line 176
    :pswitch_0
    add-int/lit8 v23, p0, 0x14

    .line 177
    .line 178
    aget-char v23, v2, v23

    .line 179
    .line 180
    add-int/lit8 v24, p0, 0x15

    .line 181
    .line 182
    aget-char v24, v2, v24

    .line 183
    .line 184
    add-int/lit8 v25, p0, 0x16

    .line 185
    .line 186
    aget-char v25, v2, v25

    .line 187
    .line 188
    add-int/lit8 v26, p0, 0x17

    .line 189
    .line 190
    aget-char v26, v2, v26

    .line 191
    .line 192
    add-int/lit8 v27, p0, 0x18

    .line 193
    .line 194
    aget-char v27, v2, v27

    .line 195
    .line 196
    add-int/lit8 v29, p0, 0x19

    .line 197
    .line 198
    aget-char v29, v2, v29

    .line 199
    .line 200
    add-int/lit8 v30, p0, 0x1a

    .line 201
    .line 202
    aget-char v30, v2, v30

    .line 203
    .line 204
    add-int/lit8 v31, p0, 0x1b

    .line 205
    .line 206
    aget-char v31, v2, v31

    .line 207
    .line 208
    move/from16 v32, v31

    .line 209
    .line 210
    move/from16 v31, v16

    .line 211
    .line 212
    move/from16 v16, v18

    .line 213
    .line 214
    move/from16 v18, v20

    .line 215
    .line 216
    move/from16 v20, v24

    .line 217
    .line 218
    move/from16 v24, v29

    .line 219
    .line 220
    move/from16 v29, v22

    .line 221
    .line 222
    move/from16 v22, v26

    .line 223
    .line 224
    move/from16 v26, v32

    .line 225
    .line 226
    move/from16 v32, v27

    .line 227
    .line 228
    move/from16 v27, v21

    .line 229
    .line 230
    move/from16 v21, v23

    .line 231
    .line 232
    move/from16 v23, v32

    .line 233
    .line 234
    goto/16 :goto_3

    .line 235
    .line 236
    :pswitch_1
    add-int/lit8 v23, p0, 0x14

    .line 237
    .line 238
    aget-char v23, v2, v23

    .line 239
    .line 240
    add-int/lit8 v24, p0, 0x15

    .line 241
    .line 242
    aget-char v24, v2, v24

    .line 243
    .line 244
    add-int/lit8 v25, p0, 0x16

    .line 245
    .line 246
    aget-char v25, v2, v25

    .line 247
    .line 248
    add-int/lit8 v26, p0, 0x17

    .line 249
    .line 250
    aget-char v26, v2, v26

    .line 251
    .line 252
    add-int/lit8 v27, p0, 0x18

    .line 253
    .line 254
    aget-char v27, v2, v27

    .line 255
    .line 256
    add-int/lit8 v29, p0, 0x19

    .line 257
    .line 258
    aget-char v29, v2, v29

    .line 259
    .line 260
    add-int/lit8 v30, p0, 0x1a

    .line 261
    .line 262
    aget-char v30, v2, v30

    .line 263
    .line 264
    move/from16 v31, v16

    .line 265
    .line 266
    move/from16 v16, v18

    .line 267
    .line 268
    move/from16 v18, v20

    .line 269
    .line 270
    move/from16 v20, v24

    .line 271
    .line 272
    move/from16 v24, v29

    .line 273
    .line 274
    move/from16 v29, v22

    .line 275
    .line 276
    move/from16 v22, v26

    .line 277
    .line 278
    move/from16 v26, v21

    .line 279
    .line 280
    :goto_0
    move/from16 v21, v23

    .line 281
    .line 282
    move/from16 v23, v27

    .line 283
    .line 284
    :goto_1
    move/from16 v27, v26

    .line 285
    .line 286
    goto/16 :goto_3

    .line 287
    .line 288
    :pswitch_2
    add-int/lit8 v23, p0, 0x14

    .line 289
    .line 290
    aget-char v23, v2, v23

    .line 291
    .line 292
    add-int/lit8 v24, p0, 0x15

    .line 293
    .line 294
    aget-char v24, v2, v24

    .line 295
    .line 296
    add-int/lit8 v25, p0, 0x16

    .line 297
    .line 298
    aget-char v25, v2, v25

    .line 299
    .line 300
    add-int/lit8 v26, p0, 0x17

    .line 301
    .line 302
    aget-char v26, v2, v26

    .line 303
    .line 304
    add-int/lit8 v27, p0, 0x18

    .line 305
    .line 306
    aget-char v27, v2, v27

    .line 307
    .line 308
    add-int/lit8 v29, p0, 0x19

    .line 309
    .line 310
    aget-char v29, v2, v29

    .line 311
    .line 312
    move/from16 v31, v16

    .line 313
    .line 314
    move/from16 v16, v18

    .line 315
    .line 316
    move/from16 v18, v20

    .line 317
    .line 318
    move/from16 v30, v21

    .line 319
    .line 320
    move/from16 v20, v24

    .line 321
    .line 322
    move/from16 v24, v29

    .line 323
    .line 324
    move/from16 v29, v22

    .line 325
    .line 326
    move/from16 v21, v23

    .line 327
    .line 328
    move/from16 v22, v26

    .line 329
    .line 330
    move/from16 v23, v27

    .line 331
    .line 332
    move/from16 v26, v30

    .line 333
    .line 334
    goto :goto_1

    .line 335
    :pswitch_3
    add-int/lit8 v23, p0, 0x14

    .line 336
    .line 337
    aget-char v23, v2, v23

    .line 338
    .line 339
    add-int/lit8 v24, p0, 0x15

    .line 340
    .line 341
    aget-char v24, v2, v24

    .line 342
    .line 343
    add-int/lit8 v25, p0, 0x16

    .line 344
    .line 345
    aget-char v25, v2, v25

    .line 346
    .line 347
    add-int/lit8 v26, p0, 0x17

    .line 348
    .line 349
    aget-char v26, v2, v26

    .line 350
    .line 351
    add-int/lit8 v27, p0, 0x18

    .line 352
    .line 353
    aget-char v27, v2, v27

    .line 354
    .line 355
    move/from16 v31, v16

    .line 356
    .line 357
    move/from16 v16, v18

    .line 358
    .line 359
    move/from16 v18, v20

    .line 360
    .line 361
    move/from16 v30, v21

    .line 362
    .line 363
    move/from16 v29, v22

    .line 364
    .line 365
    move/from16 v20, v24

    .line 366
    .line 367
    move/from16 v22, v26

    .line 368
    .line 369
    move/from16 v24, v30

    .line 370
    .line 371
    move/from16 v26, v24

    .line 372
    .line 373
    goto :goto_0

    .line 374
    :pswitch_4
    add-int/lit8 v23, p0, 0x14

    .line 375
    .line 376
    aget-char v23, v2, v23

    .line 377
    .line 378
    add-int/lit8 v24, p0, 0x15

    .line 379
    .line 380
    aget-char v24, v2, v24

    .line 381
    .line 382
    add-int/lit8 v25, p0, 0x16

    .line 383
    .line 384
    aget-char v25, v2, v25

    .line 385
    .line 386
    add-int/lit8 v26, p0, 0x17

    .line 387
    .line 388
    aget-char v26, v2, v26

    .line 389
    .line 390
    move/from16 v31, v16

    .line 391
    .line 392
    move/from16 v16, v18

    .line 393
    .line 394
    move/from16 v18, v20

    .line 395
    .line 396
    move/from16 v27, v21

    .line 397
    .line 398
    move/from16 v30, v27

    .line 399
    .line 400
    move/from16 v29, v22

    .line 401
    .line 402
    move/from16 v20, v24

    .line 403
    .line 404
    move/from16 v22, v26

    .line 405
    .line 406
    move/from16 v24, v30

    .line 407
    .line 408
    move/from16 v26, v24

    .line 409
    .line 410
    move/from16 v21, v23

    .line 411
    .line 412
    move/from16 v23, v26

    .line 413
    .line 414
    goto :goto_3

    .line 415
    :pswitch_5
    add-int/lit8 v23, p0, 0x14

    .line 416
    .line 417
    aget-char v23, v2, v23

    .line 418
    .line 419
    add-int/lit8 v24, p0, 0x15

    .line 420
    .line 421
    aget-char v24, v2, v24

    .line 422
    .line 423
    add-int/lit8 v25, p0, 0x16

    .line 424
    .line 425
    aget-char v25, v2, v25

    .line 426
    .line 427
    move/from16 v31, v16

    .line 428
    .line 429
    move/from16 v16, v18

    .line 430
    .line 431
    move/from16 v18, v20

    .line 432
    .line 433
    move/from16 v26, v21

    .line 434
    .line 435
    :goto_2
    move/from16 v27, v26

    .line 436
    .line 437
    move/from16 v30, v27

    .line 438
    .line 439
    move/from16 v29, v22

    .line 440
    .line 441
    move/from16 v20, v24

    .line 442
    .line 443
    move/from16 v22, v30

    .line 444
    .line 445
    move/from16 v24, v22

    .line 446
    .line 447
    move/from16 v21, v23

    .line 448
    .line 449
    move/from16 v23, v24

    .line 450
    .line 451
    goto :goto_3

    .line 452
    :pswitch_6
    add-int/lit8 v23, p0, 0x14

    .line 453
    .line 454
    aget-char v23, v2, v23

    .line 455
    .line 456
    add-int/lit8 v24, p0, 0x15

    .line 457
    .line 458
    aget-char v24, v2, v24

    .line 459
    .line 460
    move/from16 v31, v16

    .line 461
    .line 462
    move/from16 v16, v18

    .line 463
    .line 464
    move/from16 v18, v20

    .line 465
    .line 466
    move/from16 v25, v21

    .line 467
    .line 468
    move/from16 v26, v25

    .line 469
    .line 470
    goto :goto_2

    .line 471
    :pswitch_7
    add-int/lit8 v23, p0, 0x14

    .line 472
    .line 473
    aget-char v23, v2, v23

    .line 474
    .line 475
    move/from16 v31, v16

    .line 476
    .line 477
    move/from16 v16, v18

    .line 478
    .line 479
    move/from16 v18, v20

    .line 480
    .line 481
    move/from16 v20, v21

    .line 482
    .line 483
    move/from16 v24, v20

    .line 484
    .line 485
    move/from16 v25, v24

    .line 486
    .line 487
    move/from16 v26, v25

    .line 488
    .line 489
    move/from16 v27, v26

    .line 490
    .line 491
    move/from16 v30, v27

    .line 492
    .line 493
    move/from16 v29, v22

    .line 494
    .line 495
    move/from16 v22, v30

    .line 496
    .line 497
    move/from16 v21, v23

    .line 498
    .line 499
    move/from16 v23, v22

    .line 500
    .line 501
    :goto_3
    const/16 v0, 0x2d

    .line 502
    .line 503
    if-ne v4, v0, :cond_5

    .line 504
    .line 505
    if-ne v11, v0, :cond_5

    .line 506
    .line 507
    const/16 v4, 0x20

    .line 508
    .line 509
    if-eq v14, v4, :cond_4

    .line 510
    .line 511
    const/16 v4, 0x54

    .line 512
    .line 513
    if-ne v14, v4, :cond_5

    .line 514
    .line 515
    :cond_4
    const/16 v4, 0x3a

    .line 516
    .line 517
    if-ne v3, v4, :cond_5

    .line 518
    .line 519
    if-ne v1, v4, :cond_5

    .line 520
    .line 521
    const/16 v1, 0x2e

    .line 522
    .line 523
    if-ne v5, v1, :cond_5

    .line 524
    .line 525
    move v11, v12

    .line 526
    move v12, v13

    .line 527
    move v13, v15

    .line 528
    move/from16 v15, v17

    .line 529
    .line 530
    move/from16 v17, v19

    .line 531
    .line 532
    move/from16 v19, v21

    .line 533
    .line 534
    move/from16 v21, v25

    .line 535
    .line 536
    move/from16 v5, v29

    .line 537
    .line 538
    move/from16 v25, v30

    .line 539
    .line 540
    move/from16 v14, v31

    .line 541
    .line 542
    invoke-static/range {v5 .. v27}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲世兰(CCCCCCCCCCCCCCCCCCCCCCC)Ljava/time/LocalDateTime;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    return-object v0

    .line 547
    :cond_5
    add-int v1, p0, p1

    .line 548
    .line 549
    add-int/lit8 v3, v1, -0xf

    .line 550
    .line 551
    aget-char v3, v2, v3

    .line 552
    .line 553
    if-ne v3, v0, :cond_7

    .line 554
    .line 555
    add-int/lit8 v3, v1, -0xc

    .line 556
    .line 557
    aget-char v3, v2, v3

    .line 558
    .line 559
    if-ne v3, v0, :cond_7

    .line 560
    .line 561
    add-int/lit8 v0, v1, -0x9

    .line 562
    .line 563
    aget-char v0, v2, v0

    .line 564
    .line 565
    const/16 v4, 0x20

    .line 566
    .line 567
    if-eq v0, v4, :cond_6

    .line 568
    .line 569
    const/16 v4, 0x54

    .line 570
    .line 571
    if-ne v0, v4, :cond_7

    .line 572
    .line 573
    :cond_6
    add-int/lit8 v0, v1, -0x6

    .line 574
    .line 575
    aget-char v0, v2, v0

    .line 576
    .line 577
    const/16 v4, 0x3a

    .line 578
    .line 579
    if-ne v0, v4, :cond_7

    .line 580
    .line 581
    add-int/lit8 v0, v1, -0x3

    .line 582
    .line 583
    aget-char v0, v2, v0

    .line 584
    .line 585
    if-ne v0, v4, :cond_7

    .line 586
    .line 587
    add-int/lit8 v0, p1, -0xf

    .line 588
    .line 589
    move/from16 v3, p0

    .line 590
    .line 591
    invoke-static {v3, v0, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰哲世苏(II[C)I

    .line 592
    .line 593
    .line 594
    move-result v0

    .line 595
    add-int/lit8 v3, v1, -0xe

    .line 596
    .line 597
    const/4 v4, 0x2

    .line 598
    invoke-static {v3, v4, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰哲世苏(II[C)I

    .line 599
    .line 600
    .line 601
    move-result v3

    .line 602
    add-int/lit8 v5, v1, -0xb

    .line 603
    .line 604
    invoke-static {v5, v4, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰哲世苏(II[C)I

    .line 605
    .line 606
    .line 607
    move-result v5

    .line 608
    add-int/lit8 v6, v1, -0x8

    .line 609
    .line 610
    invoke-static {v6, v4, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰哲世苏(II[C)I

    .line 611
    .line 612
    .line 613
    move-result v6

    .line 614
    add-int/lit8 v7, v1, -0x5

    .line 615
    .line 616
    invoke-static {v7, v4, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰哲世苏(II[C)I

    .line 617
    .line 618
    .line 619
    move-result v7

    .line 620
    sub-int/2addr v1, v4

    .line 621
    invoke-static {v1, v4, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰哲世苏(II[C)I

    .line 622
    .line 623
    .line 624
    move-result v1

    .line 625
    move v2, v0

    .line 626
    move v4, v5

    .line 627
    move v5, v6

    .line 628
    move v6, v7

    .line 629
    move v7, v1

    .line 630
    invoke-static/range {v2 .. v7}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    return-object v0

    .line 635
    :cond_7
    :goto_4
    return-object v28

    .line 636
    nop

    .line 637
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

.method public static 飘花落叶言子世哲楪兰苏(I[C)Ljava/time/LocalDateTime;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    add-int/lit8 v1, p0, 0x13

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
    add-int/lit8 v1, p0, 0x1

    .line 11
    .line 12
    aget-char v1, v0, v1

    .line 13
    .line 14
    add-int/lit8 v2, p0, 0x2

    .line 15
    .line 16
    aget-char v2, v0, v2

    .line 17
    .line 18
    add-int/lit8 v4, p0, 0x3

    .line 19
    .line 20
    aget-char v5, v0, v4

    .line 21
    .line 22
    add-int/lit8 v6, p0, 0x4

    .line 23
    .line 24
    aget-char v6, v0, v6

    .line 25
    .line 26
    add-int/lit8 v7, p0, 0x5

    .line 27
    .line 28
    aget-char v8, v0, v7

    .line 29
    .line 30
    add-int/lit8 v9, p0, 0x7

    .line 31
    .line 32
    aget-char v9, v0, v9

    .line 33
    .line 34
    add-int/lit8 v10, p0, 0xa

    .line 35
    .line 36
    aget-char v10, v0, v10

    .line 37
    .line 38
    add-int/lit8 v11, p0, 0xd

    .line 39
    .line 40
    aget-char v11, v0, v11

    .line 41
    .line 42
    add-int/lit8 v12, p0, 0x10

    .line 43
    .line 44
    aget-char v12, v0, v12

    .line 45
    .line 46
    const/16 v14, 0x2d

    .line 47
    .line 48
    const/16 v15, 0x2f

    .line 49
    .line 50
    move-object/from16 v16, v3

    .line 51
    .line 52
    const/16 v3, 0x20

    .line 53
    .line 54
    const/16 v13, 0x3a

    .line 55
    .line 56
    if-ne v6, v14, :cond_1

    .line 57
    .line 58
    if-eq v9, v14, :cond_2

    .line 59
    .line 60
    :cond_1
    if-ne v6, v15, :cond_4

    .line 61
    .line 62
    if-ne v9, v15, :cond_4

    .line 63
    .line 64
    :cond_2
    if-eq v10, v3, :cond_3

    .line 65
    .line 66
    const/16 v9, 0x54

    .line 67
    .line 68
    if-ne v10, v9, :cond_4

    .line 69
    .line 70
    :cond_3
    if-ne v11, v13, :cond_4

    .line 71
    .line 72
    if-ne v12, v13, :cond_4

    .line 73
    .line 74
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    invoke-static {v7, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    add-int/lit8 v3, p0, 0x8

    .line 83
    .line 84
    invoke-static {v3, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    add-int/lit8 v4, p0, 0xb

    .line 89
    .line 90
    invoke-static {v4, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    add-int/lit8 v5, p0, 0xe

    .line 95
    .line 96
    invoke-static {v5, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    add-int/lit8 v6, p0, 0x11

    .line 101
    .line 102
    invoke-static {v6, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    :goto_0
    move v11, v0

    .line 107
    move v6, v1

    .line 108
    move v7, v2

    .line 109
    move v8, v3

    .line 110
    move v9, v4

    .line 111
    move v10, v5

    .line 112
    goto :goto_1

    .line 113
    :cond_4
    if-ne v2, v15, :cond_6

    .line 114
    .line 115
    if-ne v8, v15, :cond_6

    .line 116
    .line 117
    if-eq v10, v3, :cond_5

    .line 118
    .line 119
    const/16 v9, 0x54

    .line 120
    .line 121
    if-ne v10, v9, :cond_6

    .line 122
    .line 123
    :cond_5
    if-ne v11, v13, :cond_6

    .line 124
    .line 125
    if-ne v12, v13, :cond_6

    .line 126
    .line 127
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    invoke-static {v4, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    add-int/lit8 v1, p0, 0x6

    .line 136
    .line 137
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    add-int/lit8 v4, p0, 0xb

    .line 142
    .line 143
    invoke-static {v4, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    add-int/lit8 v5, p0, 0xe

    .line 148
    .line 149
    invoke-static {v5, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    add-int/lit8 v6, p0, 0x11

    .line 154
    .line 155
    invoke-static {v6, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    goto :goto_0

    .line 160
    :cond_6
    if-ne v1, v3, :cond_8

    .line 161
    .line 162
    if-ne v8, v3, :cond_8

    .line 163
    .line 164
    if-ne v10, v3, :cond_8

    .line 165
    .line 166
    if-ne v11, v13, :cond_8

    .line 167
    .line 168
    if-ne v12, v13, :cond_8

    .line 169
    .line 170
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    invoke-static {v2, v5, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    add-int/lit8 v1, p0, 0x6

    .line 179
    .line 180
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    add-int/lit8 v4, p0, 0xb

    .line 185
    .line 186
    invoke-static {v4, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    add-int/lit8 v5, p0, 0xe

    .line 191
    .line 192
    invoke-static {v5, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 193
    .line 194
    .line 195
    move-result v5

    .line 196
    add-int/lit8 v6, p0, 0x11

    .line 197
    .line 198
    invoke-static {v6, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    goto :goto_0

    .line 203
    :goto_1
    or-int v0, v6, v7

    .line 204
    .line 205
    or-int/2addr v0, v8

    .line 206
    or-int/2addr v0, v9

    .line 207
    or-int/2addr v0, v10

    .line 208
    or-int/2addr v0, v11

    .line 209
    if-gtz v0, :cond_7

    .line 210
    .line 211
    return-object v16

    .line 212
    :cond_7
    invoke-static/range {v6 .. v11}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    return-object v0

    .line 217
    :cond_8
    return-object v16
.end method

.method public static 飘花落叶言子世哲楪苏兰([BI)Ljava/time/LocalDateTime;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    add-int/lit8 v2, p1, 0x12

    .line 4
    .line 5
    array-length v3, v0

    .line 6
    const-string v5, "illegal input "

    .line 7
    .line 8
    if-gt v2, v3, :cond_1a

    .line 9
    .line 10
    add-int/lit8 v2, p1, 0x1

    .line 11
    .line 12
    aget-byte v2, v0, v2

    .line 13
    .line 14
    add-int/lit8 v3, p1, 0x2

    .line 15
    .line 16
    aget-byte v3, v0, v3

    .line 17
    .line 18
    add-int/lit8 v6, p1, 0x3

    .line 19
    .line 20
    aget-byte v6, v0, v6

    .line 21
    .line 22
    add-int/lit8 v7, p1, 0x4

    .line 23
    .line 24
    aget-byte v7, v0, v7

    .line 25
    .line 26
    add-int/lit8 v8, p1, 0x5

    .line 27
    .line 28
    aget-byte v9, v0, v8

    .line 29
    .line 30
    add-int/lit8 v10, p1, 0x6

    .line 31
    .line 32
    aget-byte v11, v0, v10

    .line 33
    .line 34
    add-int/lit8 v12, p1, 0x7

    .line 35
    .line 36
    aget-byte v13, v0, v12

    .line 37
    .line 38
    add-int/lit8 v14, p1, 0x9

    .line 39
    .line 40
    aget-byte v14, v0, v14

    .line 41
    .line 42
    add-int/lit8 v15, p1, 0xa

    .line 43
    .line 44
    aget-byte v4, v0, v15

    .line 45
    .line 46
    move-object/from16 v16, v5

    .line 47
    .line 48
    add-int/lit8 v5, p1, 0xb

    .line 49
    .line 50
    aget-byte v1, v0, v5

    .line 51
    .line 52
    move/from16 v17, v1

    .line 53
    .line 54
    add-int/lit8 v1, p1, 0xc

    .line 55
    .line 56
    move/from16 v18, v1

    .line 57
    .line 58
    aget-byte v1, v0, v18

    .line 59
    .line 60
    move/from16 v19, v10

    .line 61
    .line 62
    add-int/lit8 v10, p1, 0xd

    .line 63
    .line 64
    move/from16 v20, v3

    .line 65
    .line 66
    aget-byte v3, v0, v10

    .line 67
    .line 68
    move/from16 v21, v6

    .line 69
    .line 70
    add-int/lit8 v6, p1, 0xe

    .line 71
    .line 72
    move/from16 v22, v9

    .line 73
    .line 74
    aget-byte v9, v0, v6

    .line 75
    .line 76
    move/from16 v23, v9

    .line 77
    .line 78
    add-int/lit8 v9, p1, 0xf

    .line 79
    .line 80
    move/from16 v24, v9

    .line 81
    .line 82
    aget-byte v9, v0, v24

    .line 83
    .line 84
    move/from16 v25, v2

    .line 85
    .line 86
    add-int/lit8 v2, p1, 0x10

    .line 87
    .line 88
    move/from16 v26, v6

    .line 89
    .line 90
    aget-byte v6, v0, v2

    .line 91
    .line 92
    move/from16 v27, v6

    .line 93
    .line 94
    const/16 v6, 0x2d

    .line 95
    .line 96
    move/from16 v28, v3

    .line 97
    .line 98
    const/16 v3, 0x20

    .line 99
    .line 100
    if-ne v7, v6, :cond_1

    .line 101
    .line 102
    if-ne v11, v6, :cond_1

    .line 103
    .line 104
    if-eq v14, v3, :cond_0

    .line 105
    .line 106
    const/16 v3, 0x54

    .line 107
    .line 108
    if-ne v14, v3, :cond_1

    .line 109
    .line 110
    :cond_0
    const/16 v3, 0x3a

    .line 111
    .line 112
    if-ne v1, v3, :cond_1

    .line 113
    .line 114
    if-ne v9, v3, :cond_1

    .line 115
    .line 116
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    invoke-static {v0, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    invoke-static {v0, v12}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    invoke-static {v0, v15}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    invoke-static {v0, v10}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    :goto_0
    move v12, v0

    .line 141
    move v7, v1

    .line 142
    move v8, v3

    .line 143
    move v9, v4

    .line 144
    move v10, v5

    .line 145
    move v11, v6

    .line 146
    goto/16 :goto_b

    .line 147
    .line 148
    :cond_1
    if-ne v7, v6, :cond_3

    .line 149
    .line 150
    if-ne v13, v6, :cond_3

    .line 151
    .line 152
    const/16 v3, 0x20

    .line 153
    .line 154
    if-eq v14, v3, :cond_2

    .line 155
    .line 156
    const/16 v3, 0x54

    .line 157
    .line 158
    if-ne v14, v3, :cond_3

    .line 159
    .line 160
    :cond_2
    const/16 v3, 0x3a

    .line 161
    .line 162
    if-ne v1, v3, :cond_3

    .line 163
    .line 164
    if-ne v9, v3, :cond_3

    .line 165
    .line 166
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    invoke-static {v0, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    add-int/lit8 v4, p1, 0x8

    .line 175
    .line 176
    invoke-static {v0, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    invoke-static {v0, v15}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    invoke-static {v0, v10}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 185
    .line 186
    .line 187
    move-result v6

    .line 188
    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    goto :goto_0

    .line 193
    :cond_3
    if-ne v7, v6, :cond_5

    .line 194
    .line 195
    if-ne v13, v6, :cond_5

    .line 196
    .line 197
    const/16 v3, 0x20

    .line 198
    .line 199
    if-eq v4, v3, :cond_4

    .line 200
    .line 201
    const/16 v3, 0x54

    .line 202
    .line 203
    if-ne v4, v3, :cond_5

    .line 204
    .line 205
    :cond_4
    const/16 v3, 0x3a

    .line 206
    .line 207
    if-ne v1, v3, :cond_5

    .line 208
    .line 209
    if-ne v9, v3, :cond_5

    .line 210
    .line 211
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    invoke-static {v0, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    add-int/lit8 v4, p1, 0x8

    .line 220
    .line 221
    invoke-static {v0, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    invoke-static {v0, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    invoke-static {v0, v10}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 230
    .line 231
    .line 232
    move-result v6

    .line 233
    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    goto :goto_0

    .line 238
    :cond_5
    if-ne v7, v6, :cond_7

    .line 239
    .line 240
    if-ne v13, v6, :cond_7

    .line 241
    .line 242
    const/16 v3, 0x20

    .line 243
    .line 244
    if-eq v4, v3, :cond_6

    .line 245
    .line 246
    const/16 v3, 0x54

    .line 247
    .line 248
    if-ne v4, v3, :cond_7

    .line 249
    .line 250
    :cond_6
    move/from16 v3, v28

    .line 251
    .line 252
    const/16 v14, 0x3a

    .line 253
    .line 254
    goto :goto_1

    .line 255
    :cond_7
    move/from16 v14, v26

    .line 256
    .line 257
    move/from16 v3, v28

    .line 258
    .line 259
    goto :goto_2

    .line 260
    :goto_1
    if-ne v3, v14, :cond_8

    .line 261
    .line 262
    if-ne v9, v14, :cond_8

    .line 263
    .line 264
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    invoke-static {v0, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 269
    .line 270
    .line 271
    move-result v3

    .line 272
    add-int/lit8 v4, p1, 0x8

    .line 273
    .line 274
    invoke-static {v0, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 275
    .line 276
    .line 277
    move-result v4

    .line 278
    invoke-static {v0, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 279
    .line 280
    .line 281
    move-result v5

    .line 282
    move/from16 v14, v26

    .line 283
    .line 284
    invoke-static {v0, v14}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 285
    .line 286
    .line 287
    move-result v6

    .line 288
    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    goto/16 :goto_0

    .line 293
    .line 294
    :cond_8
    move/from16 v14, v26

    .line 295
    .line 296
    :goto_2
    if-ne v7, v6, :cond_c

    .line 297
    .line 298
    if-ne v13, v6, :cond_c

    .line 299
    .line 300
    const/16 v6, 0x20

    .line 301
    .line 302
    if-eq v4, v6, :cond_9

    .line 303
    .line 304
    const/16 v6, 0x54

    .line 305
    .line 306
    if-ne v4, v6, :cond_a

    .line 307
    .line 308
    :cond_9
    const/16 v6, 0x3a

    .line 309
    .line 310
    goto :goto_4

    .line 311
    :cond_a
    move/from16 v6, v25

    .line 312
    .line 313
    move/from16 v13, v27

    .line 314
    .line 315
    :goto_3
    const/16 v8, 0x20

    .line 316
    .line 317
    goto :goto_6

    .line 318
    :goto_4
    if-ne v3, v6, :cond_c

    .line 319
    .line 320
    move/from16 v13, v27

    .line 321
    .line 322
    if-ne v13, v6, :cond_b

    .line 323
    .line 324
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 325
    .line 326
    .line 327
    move-result v1

    .line 328
    invoke-static {v0, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 329
    .line 330
    .line 331
    move-result v3

    .line 332
    add-int/lit8 v2, p1, 0x8

    .line 333
    .line 334
    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 335
    .line 336
    .line 337
    move-result v4

    .line 338
    invoke-static {v0, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 339
    .line 340
    .line 341
    move-result v5

    .line 342
    invoke-static {v0, v14}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 343
    .line 344
    .line 345
    move-result v6

    .line 346
    add-int/lit8 v2, p1, 0x11

    .line 347
    .line 348
    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 349
    .line 350
    .line 351
    move-result v0

    .line 352
    goto/16 :goto_0

    .line 353
    .line 354
    :cond_b
    :goto_5
    move/from16 v6, v25

    .line 355
    .line 356
    goto :goto_3

    .line 357
    :cond_c
    move/from16 v13, v27

    .line 358
    .line 359
    goto :goto_5

    .line 360
    :goto_6
    if-ne v6, v8, :cond_e

    .line 361
    .line 362
    move/from16 v15, v22

    .line 363
    .line 364
    if-ne v15, v8, :cond_d

    .line 365
    .line 366
    if-ne v4, v8, :cond_d

    .line 367
    .line 368
    const/16 v8, 0x3a

    .line 369
    .line 370
    if-ne v1, v8, :cond_d

    .line 371
    .line 372
    if-ne v9, v8, :cond_d

    .line 373
    .line 374
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 375
    .line 376
    .line 377
    move-result v4

    .line 378
    move/from16 v1, v20

    .line 379
    .line 380
    move/from16 v8, v21

    .line 381
    .line 382
    invoke-static {v1, v8, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰哲世(BBB)I

    .line 383
    .line 384
    .line 385
    move-result v3

    .line 386
    move/from16 v1, v19

    .line 387
    .line 388
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 389
    .line 390
    .line 391
    move-result v1

    .line 392
    invoke-static {v0, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 393
    .line 394
    .line 395
    move-result v5

    .line 396
    invoke-static {v0, v10}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 397
    .line 398
    .line 399
    move-result v6

    .line 400
    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 401
    .line 402
    .line 403
    move-result v0

    .line 404
    goto/16 :goto_0

    .line 405
    .line 406
    :cond_d
    move/from16 v10, v19

    .line 407
    .line 408
    move/from16 v1, v20

    .line 409
    .line 410
    move/from16 v8, v21

    .line 411
    .line 412
    :goto_7
    move/from16 v19, v12

    .line 413
    .line 414
    const/16 v12, 0x20

    .line 415
    .line 416
    goto :goto_8

    .line 417
    :cond_e
    move/from16 v10, v19

    .line 418
    .line 419
    move/from16 v1, v20

    .line 420
    .line 421
    move/from16 v8, v21

    .line 422
    .line 423
    move/from16 v15, v22

    .line 424
    .line 425
    goto :goto_7

    .line 426
    :goto_8
    if-ne v6, v12, :cond_10

    .line 427
    .line 428
    if-ne v15, v12, :cond_10

    .line 429
    .line 430
    if-ne v4, v12, :cond_10

    .line 431
    .line 432
    const/16 v12, 0x3a

    .line 433
    .line 434
    if-ne v3, v12, :cond_f

    .line 435
    .line 436
    if-ne v9, v12, :cond_f

    .line 437
    .line 438
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 439
    .line 440
    .line 441
    move-result v4

    .line 442
    invoke-static {v1, v8, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰哲世(BBB)I

    .line 443
    .line 444
    .line 445
    move-result v3

    .line 446
    invoke-static {v0, v10}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 447
    .line 448
    .line 449
    move-result v1

    .line 450
    invoke-static {v0, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 451
    .line 452
    .line 453
    move-result v5

    .line 454
    invoke-static {v0, v14}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 455
    .line 456
    .line 457
    move-result v6

    .line 458
    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 459
    .line 460
    .line 461
    move-result v0

    .line 462
    goto/16 :goto_0

    .line 463
    .line 464
    :cond_f
    const/16 v12, 0x20

    .line 465
    .line 466
    :cond_10
    if-ne v6, v12, :cond_12

    .line 467
    .line 468
    if-ne v15, v12, :cond_12

    .line 469
    .line 470
    if-ne v4, v12, :cond_12

    .line 471
    .line 472
    const/16 v6, 0x3a

    .line 473
    .line 474
    if-ne v3, v6, :cond_11

    .line 475
    .line 476
    if-ne v13, v6, :cond_11

    .line 477
    .line 478
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 479
    .line 480
    .line 481
    move-result v4

    .line 482
    invoke-static {v1, v8, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰哲世(BBB)I

    .line 483
    .line 484
    .line 485
    move-result v3

    .line 486
    invoke-static {v0, v10}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 487
    .line 488
    .line 489
    move-result v1

    .line 490
    invoke-static {v0, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 491
    .line 492
    .line 493
    move-result v5

    .line 494
    invoke-static {v0, v14}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 495
    .line 496
    .line 497
    move-result v6

    .line 498
    add-int/lit8 v2, p1, 0x11

    .line 499
    .line 500
    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 501
    .line 502
    .line 503
    move-result v0

    .line 504
    goto/16 :goto_0

    .line 505
    .line 506
    :cond_11
    const/16 v12, 0x20

    .line 507
    .line 508
    :cond_12
    if-ne v1, v12, :cond_15

    .line 509
    .line 510
    if-ne v11, v12, :cond_15

    .line 511
    .line 512
    move/from16 v4, v17

    .line 513
    .line 514
    if-ne v4, v12, :cond_14

    .line 515
    .line 516
    move/from16 v5, v23

    .line 517
    .line 518
    const/16 v6, 0x3a

    .line 519
    .line 520
    if-ne v5, v6, :cond_13

    .line 521
    .line 522
    if-ne v13, v6, :cond_13

    .line 523
    .line 524
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 525
    .line 526
    .line 527
    move-result v4

    .line 528
    invoke-static {v8, v7, v15}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰哲世(BBB)I

    .line 529
    .line 530
    .line 531
    move-result v3

    .line 532
    move/from16 v5, v19

    .line 533
    .line 534
    invoke-static {v0, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 535
    .line 536
    .line 537
    move-result v1

    .line 538
    move/from16 v6, v18

    .line 539
    .line 540
    invoke-static {v0, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 541
    .line 542
    .line 543
    move-result v5

    .line 544
    move/from16 v2, v24

    .line 545
    .line 546
    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 547
    .line 548
    .line 549
    move-result v6

    .line 550
    add-int/lit8 v2, p1, 0x11

    .line 551
    .line 552
    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 553
    .line 554
    .line 555
    move-result v0

    .line 556
    goto/16 :goto_0

    .line 557
    .line 558
    :cond_13
    move/from16 v6, v18

    .line 559
    .line 560
    move/from16 v5, v19

    .line 561
    .line 562
    const/16 v12, 0x20

    .line 563
    .line 564
    goto :goto_a

    .line 565
    :cond_14
    :goto_9
    move/from16 v6, v18

    .line 566
    .line 567
    move/from16 v5, v19

    .line 568
    .line 569
    goto :goto_a

    .line 570
    :cond_15
    move/from16 v4, v17

    .line 571
    .line 572
    goto :goto_9

    .line 573
    :goto_a
    if-ne v1, v12, :cond_17

    .line 574
    .line 575
    if-ne v11, v12, :cond_17

    .line 576
    .line 577
    if-ne v4, v12, :cond_17

    .line 578
    .line 579
    const/16 v12, 0x3a

    .line 580
    .line 581
    if-ne v3, v12, :cond_16

    .line 582
    .line 583
    if-ne v13, v12, :cond_16

    .line 584
    .line 585
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 586
    .line 587
    .line 588
    move-result v4

    .line 589
    invoke-static {v8, v7, v15}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰哲世(BBB)I

    .line 590
    .line 591
    .line 592
    move-result v3

    .line 593
    invoke-static {v0, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 594
    .line 595
    .line 596
    move-result v1

    .line 597
    invoke-static {v0, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 598
    .line 599
    .line 600
    move-result v5

    .line 601
    invoke-static {v0, v14}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 602
    .line 603
    .line 604
    move-result v6

    .line 605
    add-int/lit8 v2, p1, 0x11

    .line 606
    .line 607
    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 608
    .line 609
    .line 610
    move-result v0

    .line 611
    goto/16 :goto_0

    .line 612
    .line 613
    :cond_16
    const/16 v12, 0x20

    .line 614
    .line 615
    :cond_17
    if-ne v1, v12, :cond_19

    .line 616
    .line 617
    if-ne v11, v12, :cond_19

    .line 618
    .line 619
    if-ne v4, v12, :cond_19

    .line 620
    .line 621
    const/16 v12, 0x3a

    .line 622
    .line 623
    if-ne v3, v12, :cond_19

    .line 624
    .line 625
    if-ne v9, v12, :cond_19

    .line 626
    .line 627
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 628
    .line 629
    .line 630
    move-result v4

    .line 631
    invoke-static {v8, v7, v15}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰哲世(BBB)I

    .line 632
    .line 633
    .line 634
    move-result v3

    .line 635
    invoke-static {v0, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 636
    .line 637
    .line 638
    move-result v1

    .line 639
    invoke-static {v0, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 640
    .line 641
    .line 642
    move-result v5

    .line 643
    invoke-static {v0, v14}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 644
    .line 645
    .line 646
    move-result v6

    .line 647
    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 648
    .line 649
    .line 650
    move-result v0

    .line 651
    goto/16 :goto_0

    .line 652
    .line 653
    :goto_b
    or-int v0, v7, v8

    .line 654
    .line 655
    or-int/2addr v0, v9

    .line 656
    or-int/2addr v0, v10

    .line 657
    or-int/2addr v0, v11

    .line 658
    or-int/2addr v0, v12

    .line 659
    if-gez v0, :cond_18

    .line 660
    .line 661
    const/4 v0, 0x0

    .line 662
    return-object v0

    .line 663
    :cond_18
    invoke-static/range {v7 .. v12}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    return-object v0

    .line 668
    :cond_19
    new-instance v1, Ljava/lang/String;

    .line 669
    .line 670
    const/16 v2, 0x12

    .line 671
    .line 672
    move/from16 v3, p1

    .line 673
    .line 674
    invoke-direct {v1, v0, v3, v2}, Ljava/lang/String;-><init>([BII)V

    .line 675
    .line 676
    .line 677
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 678
    .line 679
    move-object/from16 v2, v16

    .line 680
    .line 681
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object v2

    .line 685
    const/4 v4, 0x0

    .line 686
    invoke-direct {v0, v2, v1, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 687
    .line 688
    .line 689
    throw v0

    .line 690
    :cond_1a
    move/from16 v3, p1

    .line 691
    .line 692
    move-object v2, v5

    .line 693
    const/4 v4, 0x0

    .line 694
    new-instance v1, Ljava/lang/String;

    .line 695
    .line 696
    array-length v5, v0

    .line 697
    sub-int/2addr v5, v3

    .line 698
    invoke-direct {v1, v0, v3, v5}, Ljava/lang/String;-><init>([BII)V

    .line 699
    .line 700
    .line 701
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 702
    .line 703
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 704
    .line 705
    .line 706
    move-result-object v2

    .line 707
    invoke-direct {v0, v2, v1, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 708
    .line 709
    .line 710
    throw v0
.end method

.method public static 飘花落叶言子世哲苏兰楪(I[C)Ljava/time/LocalDateTime;
    .locals 9

    .line 1
    add-int/lit8 v0, p0, 0x13

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-gt v0, v1, :cond_2

    .line 6
    .line 7
    add-int/lit8 v0, p0, 0x2

    .line 8
    .line 9
    aget-char v0, p1, v0

    .line 10
    .line 11
    const/16 v1, 0x20

    .line 12
    .line 13
    if-ne v0, v1, :cond_2

    .line 14
    .line 15
    add-int/lit8 v0, p0, 0x6

    .line 16
    .line 17
    aget-char v0, p1, v0

    .line 18
    .line 19
    if-ne v0, v1, :cond_2

    .line 20
    .line 21
    add-int/lit8 v0, p0, 0xb

    .line 22
    .line 23
    aget-char v0, p1, v0

    .line 24
    .line 25
    if-ne v0, v1, :cond_2

    .line 26
    .line 27
    add-int/lit8 v0, p0, 0xe

    .line 28
    .line 29
    aget-char v0, p1, v0

    .line 30
    .line 31
    const/16 v1, 0x3a

    .line 32
    .line 33
    if-ne v0, v1, :cond_2

    .line 34
    .line 35
    add-int/lit8 v0, p0, 0x11

    .line 36
    .line 37
    aget-char v0, p1, v0

    .line 38
    .line 39
    if-eq v0, v1, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    add-int/lit8 v0, p0, 0x3

    .line 47
    .line 48
    aget-char v0, p1, v0

    .line 49
    .line 50
    add-int/lit8 v1, p0, 0x4

    .line 51
    .line 52
    aget-char v1, p1, v1

    .line 53
    .line 54
    add-int/lit8 v3, p0, 0x5

    .line 55
    .line 56
    aget-char v3, p1, v3

    .line 57
    .line 58
    invoke-static {v0, v1, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    add-int/lit8 v0, p0, 0x7

    .line 63
    .line 64
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    add-int/lit8 v0, p0, 0xc

    .line 69
    .line 70
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    add-int/lit8 v0, p0, 0xf

    .line 75
    .line 76
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    add-int/lit8 p0, p0, 0x12

    .line 81
    .line 82
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    or-int p0, v3, v4

    .line 87
    .line 88
    or-int/2addr p0, v5

    .line 89
    or-int/2addr p0, v6

    .line 90
    or-int/2addr p0, v7

    .line 91
    or-int/2addr p0, v8

    .line 92
    if-lez p0, :cond_2

    .line 93
    .line 94
    const/16 p0, 0x18

    .line 95
    .line 96
    if-gt v6, p0, :cond_2

    .line 97
    .line 98
    const/16 p0, 0x3b

    .line 99
    .line 100
    if-gt v7, p0, :cond_2

    .line 101
    .line 102
    const/16 p0, 0x3c

    .line 103
    .line 104
    if-le v8, p0, :cond_1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_1
    invoke-static/range {v3 .. v8}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    :cond_2
    :goto_0
    return-object v2
.end method

.method public static 飘花落叶言子世哲苏楪兰([BI)Ljava/time/LocalDateTime;
    .locals 14

    .line 1
    add-int/lit8 v0, p1, 0x13

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
    add-int/lit8 v0, p1, 0x1

    .line 9
    .line 10
    aget-byte v0, p0, v0

    .line 11
    .line 12
    add-int/lit8 v1, p1, 0x2

    .line 13
    .line 14
    aget-byte v1, p0, v1

    .line 15
    .line 16
    add-int/lit8 v3, p1, 0x3

    .line 17
    .line 18
    aget-byte v4, p0, v3

    .line 19
    .line 20
    add-int/lit8 v5, p1, 0x4

    .line 21
    .line 22
    aget-byte v5, p0, v5

    .line 23
    .line 24
    add-int/lit8 v6, p1, 0x5

    .line 25
    .line 26
    aget-byte v7, p0, v6

    .line 27
    .line 28
    add-int/lit8 v8, p1, 0x7

    .line 29
    .line 30
    aget-byte v8, p0, v8

    .line 31
    .line 32
    add-int/lit8 v9, p1, 0xa

    .line 33
    .line 34
    aget-byte v9, p0, v9

    .line 35
    .line 36
    const/16 v10, 0x54

    .line 37
    .line 38
    const/16 v11, 0x2d

    .line 39
    .line 40
    const/16 v12, 0x2f

    .line 41
    .line 42
    const/16 v13, 0x20

    .line 43
    .line 44
    if-ne v5, v11, :cond_1

    .line 45
    .line 46
    if-eq v8, v11, :cond_2

    .line 47
    .line 48
    :cond_1
    if-ne v5, v12, :cond_4

    .line 49
    .line 50
    if-ne v8, v12, :cond_4

    .line 51
    .line 52
    :cond_2
    if-eq v9, v13, :cond_3

    .line 53
    .line 54
    if-ne v9, v10, :cond_4

    .line 55
    .line 56
    :cond_3
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-static {p0, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    add-int/lit8 v3, p1, 0x8

    .line 65
    .line 66
    invoke-static {p0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    :goto_0
    move v4, v0

    .line 71
    move v5, v1

    .line 72
    move v6, v3

    .line 73
    goto :goto_1

    .line 74
    :cond_4
    if-ne v1, v12, :cond_6

    .line 75
    .line 76
    if-ne v7, v12, :cond_6

    .line 77
    .line 78
    if-eq v9, v13, :cond_5

    .line 79
    .line 80
    if-ne v9, v10, :cond_6

    .line 81
    .line 82
    :cond_5
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    invoke-static {p0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    add-int/lit8 v3, p1, 0x6

    .line 91
    .line 92
    invoke-static {p0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    move v6, v0

    .line 97
    move v5, v1

    .line 98
    move v4, v3

    .line 99
    goto :goto_1

    .line 100
    :cond_6
    if-ne v0, v13, :cond_8

    .line 101
    .line 102
    if-ne v7, v13, :cond_8

    .line 103
    .line 104
    if-ne v9, v13, :cond_8

    .line 105
    .line 106
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    invoke-static {v1, v4, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰哲世(BBB)I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    add-int/lit8 v0, p1, 0x6

    .line 115
    .line 116
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    goto :goto_0

    .line 121
    :goto_1
    add-int/lit8 p1, p1, 0xb

    .line 122
    .line 123
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世哲兰([BI)J

    .line 124
    .line 125
    .line 126
    move-result-wide p0

    .line 127
    or-int v0, v4, v5

    .line 128
    .line 129
    or-int/2addr v0, v6

    .line 130
    int-to-long v0, v0

    .line 131
    or-long/2addr v0, p0

    .line 132
    const-wide/16 v7, 0x0

    .line 133
    .line 134
    cmp-long v0, v0, v7

    .line 135
    .line 136
    if-gtz v0, :cond_7

    .line 137
    .line 138
    return-object v2

    .line 139
    :cond_7
    long-to-int v0, p0

    .line 140
    and-int/lit16 v7, v0, 0xff

    .line 141
    .line 142
    const/16 v0, 0x18

    .line 143
    .line 144
    shr-long v0, p0, v0

    .line 145
    .line 146
    long-to-int v0, v0

    .line 147
    and-int/lit16 v8, v0, 0xff

    .line 148
    .line 149
    const/16 v0, 0x30

    .line 150
    .line 151
    shr-long/2addr p0, v0

    .line 152
    long-to-int p0, p0

    .line 153
    and-int/lit16 v9, p0, 0xff

    .line 154
    .line 155
    invoke-static/range {v4 .. v9}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    return-object p0

    .line 160
    :cond_8
    return-object v2
.end method

.method public static 飘花落叶言子世楪兰哲苏(I[C)Ljava/time/LocalDateTime;
    .locals 9

    .line 1
    add-int/lit8 v0, p0, 0xe

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-le v0, v1, :cond_0

    .line 6
    .line 7
    return-object v2

    .line 8
    :cond_0
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    add-int/lit8 v0, p0, 0x4

    .line 13
    .line 14
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    add-int/lit8 v0, p0, 0x6

    .line 19
    .line 20
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    add-int/lit8 v0, p0, 0x8

    .line 25
    .line 26
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    add-int/lit8 v0, p0, 0xa

    .line 31
    .line 32
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    add-int/lit8 p0, p0, 0xc

    .line 37
    .line 38
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    or-int p0, v3, v4

    .line 43
    .line 44
    or-int/2addr p0, v5

    .line 45
    or-int/2addr p0, v6

    .line 46
    or-int/2addr p0, v7

    .line 47
    or-int/2addr p0, v8

    .line 48
    if-gez p0, :cond_1

    .line 49
    .line 50
    return-object v2

    .line 51
    :cond_1
    invoke-static/range {v3 .. v8}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method

.method public static 飘花落叶言子世楪兰苏哲([BI)Ljava/time/LocalDateTime;
    .locals 10

    .line 1
    add-int/lit8 v0, p1, 0xc

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    const/4 v2, 0x0

    .line 5
    const-string v3, "illegal input "

    .line 6
    .line 7
    if-gt v0, v1, :cond_2

    .line 8
    .line 9
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    add-int/lit8 v1, p1, 0x4

    .line 14
    .line 15
    invoke-static {p0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    add-int/lit8 v1, p1, 0x6

    .line 20
    .line 21
    invoke-static {p0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    add-int/lit8 v1, p1, 0x8

    .line 26
    .line 27
    invoke-static {p0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    add-int/lit8 v1, p1, 0xa

    .line 32
    .line 33
    invoke-static {p0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    or-int v1, v4, v5

    .line 38
    .line 39
    or-int/2addr v1, v6

    .line 40
    or-int/2addr v1, v7

    .line 41
    or-int/2addr v1, v8

    .line 42
    if-ltz v1, :cond_1

    .line 43
    .line 44
    if-nez v4, :cond_0

    .line 45
    .line 46
    if-nez v5, :cond_0

    .line 47
    .line 48
    if-nez v6, :cond_0

    .line 49
    .line 50
    if-nez v7, :cond_0

    .line 51
    .line 52
    if-nez v8, :cond_0

    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    return-object p0

    .line 56
    :cond_0
    const/4 v9, 0x0

    .line 57
    invoke-static/range {v4 .. v9}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :cond_1
    new-instance v1, Ljava/lang/String;

    .line 63
    .line 64
    invoke-direct {v1, p0, p1, v0}, Ljava/lang/String;-><init>([BII)V

    .line 65
    .line 66
    .line 67
    new-instance p0, Ljava/time/format/DateTimeParseException;

    .line 68
    .line 69
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-direct {p0, p1, v1, v2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 74
    .line 75
    .line 76
    throw p0

    .line 77
    :cond_2
    new-instance v0, Ljava/lang/String;

    .line 78
    .line 79
    array-length v1, p0

    .line 80
    sub-int/2addr v1, p1

    .line 81
    invoke-direct {v0, p0, p1, v1}, Ljava/lang/String;-><init>([BII)V

    .line 82
    .line 83
    .line 84
    new-instance p0, Ljava/time/format/DateTimeParseException;

    .line 85
    .line 86
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-direct {p0, p1, v0, v2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 91
    .line 92
    .line 93
    throw p0
.end method

.method public static 飘花落叶言子世楪哲兰苏(I[C)Ljava/time/LocalDateTime;
    .locals 10

    .line 1
    add-int/lit8 v0, p0, 0xc

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    const/4 v2, 0x0

    .line 5
    const-string v3, "illegal input "

    .line 6
    .line 7
    if-gt v0, v1, :cond_2

    .line 8
    .line 9
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    add-int/lit8 v1, p0, 0x4

    .line 14
    .line 15
    invoke-static {v1, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    add-int/lit8 v1, p0, 0x6

    .line 20
    .line 21
    invoke-static {v1, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    add-int/lit8 v1, p0, 0x8

    .line 26
    .line 27
    invoke-static {v1, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    add-int/lit8 v1, p0, 0xa

    .line 32
    .line 33
    invoke-static {v1, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    or-int v1, v4, v5

    .line 38
    .line 39
    or-int/2addr v1, v6

    .line 40
    or-int/2addr v1, v7

    .line 41
    or-int/2addr v1, v8

    .line 42
    if-ltz v1, :cond_1

    .line 43
    .line 44
    if-nez v4, :cond_0

    .line 45
    .line 46
    if-nez v5, :cond_0

    .line 47
    .line 48
    if-nez v6, :cond_0

    .line 49
    .line 50
    if-nez v7, :cond_0

    .line 51
    .line 52
    if-nez v8, :cond_0

    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    return-object p0

    .line 56
    :cond_0
    const/4 v9, 0x0

    .line 57
    invoke-static/range {v4 .. v9}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :cond_1
    new-instance v1, Ljava/lang/String;

    .line 63
    .line 64
    invoke-direct {v1, p1, p0, v0}, Ljava/lang/String;-><init>([CII)V

    .line 65
    .line 66
    .line 67
    new-instance p0, Ljava/time/format/DateTimeParseException;

    .line 68
    .line 69
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-direct {p0, p1, v1, v2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 74
    .line 75
    .line 76
    throw p0

    .line 77
    :cond_2
    new-instance v0, Ljava/lang/String;

    .line 78
    .line 79
    array-length v1, p1

    .line 80
    sub-int/2addr v1, p0

    .line 81
    invoke-direct {v0, p1, p0, v1}, Ljava/lang/String;-><init>([CII)V

    .line 82
    .line 83
    .line 84
    new-instance p0, Ljava/time/format/DateTimeParseException;

    .line 85
    .line 86
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-direct {p0, p1, v0, v2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 91
    .line 92
    .line 93
    throw p0
.end method

.method public static 飘花落叶言子世楪哲苏兰([BI)Ljava/time/LocalDateTime;
    .locals 3

    .line 1
    if-eqz p0, :cond_5

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto/16 :goto_0

    .line 6
    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    :pswitch_0
    invoke-static {v0, p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世兰楪苏哲(I[BI)Ljava/time/LocalDateTime;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :pswitch_1
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲兰楪苏([BI)Ljava/time/LocalDateTime;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_2
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲苏楪兰([BI)Ljava/time/LocalDateTime;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_3
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲楪苏兰([BI)Ljava/time/LocalDateTime;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_4
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏兰楪哲([BI)Ljava/time/LocalDateTime;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_5
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏哲楪兰([BI)Ljava/time/LocalDateTime;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :pswitch_6
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪哲兰([BI)Ljava/time/LocalDateTime;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :pswitch_7
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪兰苏哲([BI)Ljava/time/LocalDateTime;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :pswitch_8
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世哲苏([BI)Ljava/time/LocalDate;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    sget-object p1, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 56
    .line 57
    invoke-static {p0, p1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :pswitch_9
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰苏世([BI)Ljava/time/LocalDate;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    if-nez p0, :cond_1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    sget-object p1, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 70
    .line 71
    invoke-static {p0, p1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :pswitch_a
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰哲苏世([BI)Ljava/time/LocalDate;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    if-nez p0, :cond_2

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    sget-object p1, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 84
    .line 85
    invoke-static {p0, p1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0

    .line 90
    :pswitch_b
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰苏哲世([BI)Ljava/time/LocalDate;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    if-nez p0, :cond_3

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_3
    sget-object p1, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 98
    .line 99
    invoke-static {p0, p1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0

    .line 104
    :pswitch_c
    aget-byte v1, p0, v0

    .line 105
    .line 106
    const/16 v2, 0x6e

    .line 107
    .line 108
    if-ne v1, v2, :cond_4

    .line 109
    .line 110
    const/4 v1, 0x1

    .line 111
    aget-byte v1, p0, v1

    .line 112
    .line 113
    const/16 v2, 0x75

    .line 114
    .line 115
    if-ne v1, v2, :cond_4

    .line 116
    .line 117
    const/4 v1, 0x2

    .line 118
    aget-byte v1, p0, v1

    .line 119
    .line 120
    const/16 v2, 0x6c

    .line 121
    .line 122
    if-ne v1, v2, :cond_4

    .line 123
    .line 124
    const/4 v1, 0x3

    .line 125
    aget-byte v1, p0, v1

    .line 126
    .line 127
    if-ne v1, v2, :cond_4

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_4
    new-instance v1, Ljava/lang/String;

    .line 131
    .line 132
    invoke-direct {v1, p0, v0, p1}, Ljava/lang/String;-><init>([BII)V

    .line 133
    .line 134
    .line 135
    new-instance p0, Ljava/time/format/DateTimeParseException;

    .line 136
    .line 137
    const-string p1, "illegal input "

    .line 138
    .line 139
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-direct {p0, p1, v1, v0}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 144
    .line 145
    .line 146
    throw p0

    .line 147
    :cond_5
    :goto_0
    const/4 p0, 0x0

    .line 148
    return-object p0

    .line 149
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

.method public static 飘花落叶言子世楪苏兰哲(I[C)Ljava/time/LocalDateTime;
    .locals 4

    .line 1
    if-eqz p1, :cond_7

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_0

    .line 6
    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x2

    .line 9
    packed-switch p0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    :pswitch_0
    invoke-static {v0, p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲兰苏楪(II[C)Ljava/time/LocalDateTime;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :pswitch_1
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲苏兰楪(I[C)Ljava/time/LocalDateTime;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :pswitch_2
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲楪兰苏(I[C)Ljava/time/LocalDateTime;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :pswitch_3
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏兰哲楪(I[C)Ljava/time/LocalDateTime;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :pswitch_4
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏哲兰楪(I[C)Ljava/time/LocalDateTime;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :pswitch_5
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪兰哲(I[C)Ljava/time/LocalDateTime;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :pswitch_6
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪兰哲苏(I[C)Ljava/time/LocalDateTime;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_7
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪哲兰苏(I[C)Ljava/time/LocalDateTime;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :pswitch_8
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世苏哲(I[C)Ljava/time/LocalDate;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    if-nez p0, :cond_1

    .line 57
    .line 58
    goto/16 :goto_0

    .line 59
    .line 60
    :cond_1
    sget-object p1, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 61
    .line 62
    invoke-static {p0, p1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :pswitch_9
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏(I[C)Ljava/time/LocalDate;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    if-nez p0, :cond_2

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    sget-object p1, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 75
    .line 76
    invoke-static {p0, p1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0

    .line 81
    :pswitch_a
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰哲世苏(I[C)Ljava/time/LocalDate;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    if-nez p0, :cond_3

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_3
    sget-object p1, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 89
    .line 90
    invoke-static {p0, p1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0

    .line 95
    :pswitch_b
    aget-char p0, p1, v1

    .line 96
    .line 97
    const/16 v1, 0x3a

    .line 98
    .line 99
    if-ne p0, v1, :cond_4

    .line 100
    .line 101
    const/4 p0, 0x5

    .line 102
    aget-char p0, p1, p0

    .line 103
    .line 104
    if-ne p0, v1, :cond_4

    .line 105
    .line 106
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏楪哲兰世(I[C)Ljava/time/LocalTime;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    sget-object p1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰苏哲:Ljava/time/LocalDate;

    .line 111
    .line 112
    invoke-static {p1, p0}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    return-object p0

    .line 117
    :cond_4
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰苏世哲(I[C)Ljava/time/LocalDate;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    if-nez p0, :cond_5

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_5
    sget-object p1, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 125
    .line 126
    invoke-static {p0, p1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    return-object p0

    .line 131
    :pswitch_c
    aget-char v2, p1, v0

    .line 132
    .line 133
    const/16 v3, 0x6e

    .line 134
    .line 135
    if-ne v2, v3, :cond_6

    .line 136
    .line 137
    const/4 v2, 0x1

    .line 138
    aget-char v2, p1, v2

    .line 139
    .line 140
    const/16 v3, 0x75

    .line 141
    .line 142
    if-ne v2, v3, :cond_6

    .line 143
    .line 144
    aget-char v1, p1, v1

    .line 145
    .line 146
    const/16 v2, 0x6c

    .line 147
    .line 148
    if-ne v1, v2, :cond_6

    .line 149
    .line 150
    const/4 v1, 0x3

    .line 151
    aget-char v1, p1, v1

    .line 152
    .line 153
    if-ne v1, v2, :cond_6

    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_6
    new-instance v1, Ljava/lang/String;

    .line 157
    .line 158
    invoke-direct {v1, p1, v0, p0}, Ljava/lang/String;-><init>([CII)V

    .line 159
    .line 160
    .line 161
    new-instance p0, Ljava/time/format/DateTimeParseException;

    .line 162
    .line 163
    const-string p1, "illegal input "

    .line 164
    .line 165
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-direct {p0, p1, v1, v0}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 170
    .line 171
    .line 172
    throw p0

    .line 173
    :cond_7
    :goto_0
    const/4 p0, 0x0

    .line 174
    return-object p0

    .line 175
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

.method public static 飘花落叶言子世楪苏哲兰(ILjava/lang/String;)Ljava/time/LocalDateTime;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto/16 :goto_2

    .line 4
    .line 5
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏世哲:Ljava/util/function/ToIntFunction;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏哲世:Ljava/util/function/Function;

    .line 11
    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    invoke-interface {v0, p1}, Ljava/util/function/ToIntFunction;->applyAsInt(Ljava/lang/Object;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    invoke-interface {v2, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, [B

    .line 25
    .line 26
    invoke-static {v0, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪哲苏兰([BI)Ljava/time/LocalDateTime;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    sget v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏:I

    .line 32
    .line 33
    const/16 v2, 0x8

    .line 34
    .line 35
    if-ne v0, v2, :cond_2

    .line 36
    .line 37
    sget-boolean v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世哲兰:Z

    .line 38
    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)[C

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪苏兰哲(I[C)Ljava/time/LocalDateTime;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    new-array v0, p0, [C

    .line 51
    .line 52
    invoke-virtual {p1, v1, p0, v0, v1}, Ljava/lang/String;->getChars(II[CI)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪苏兰哲(I[C)Ljava/time/LocalDateTime;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    :goto_0
    if-nez p0, :cond_b

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    const/4 v0, -0x1

    .line 66
    sparse-switch p0, :sswitch_data_0

    .line 67
    .line 68
    .line 69
    goto/16 :goto_1

    .line 70
    .line 71
    :sswitch_0
    const-string p0, "0000-00-00"

    .line 72
    .line 73
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-nez p0, :cond_3

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    const/4 v0, 0x7

    .line 81
    goto :goto_1

    .line 82
    :sswitch_1
    const-string p0, "0000\u5e7400\u670800\u65e5"

    .line 83
    .line 84
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-nez p0, :cond_4

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_4
    const/4 v0, 0x6

    .line 92
    goto :goto_1

    .line 93
    :sswitch_2
    const-string p0, "null"

    .line 94
    .line 95
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    if-nez p0, :cond_5

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_5
    const/4 v0, 0x5

    .line 103
    goto :goto_1

    .line 104
    :sswitch_3
    const-string p0, ""

    .line 105
    .line 106
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    if-nez p0, :cond_6

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_6
    const/4 v0, 0x4

    .line 114
    goto :goto_1

    .line 115
    :sswitch_4
    const-string p0, "00000000"

    .line 116
    .line 117
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    if-nez p0, :cond_7

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_7
    const/4 v0, 0x3

    .line 125
    goto :goto_1

    .line 126
    :sswitch_5
    const-string p0, "000000000000"

    .line 127
    .line 128
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    if-nez p0, :cond_8

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_8
    const/4 v0, 0x2

    .line 136
    goto :goto_1

    .line 137
    :sswitch_6
    const-string p0, "0000-00-0"

    .line 138
    .line 139
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result p0

    .line 143
    if-nez p0, :cond_9

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_9
    const/4 v0, 0x1

    .line 147
    goto :goto_1

    .line 148
    :sswitch_7
    const-string p0, "0000-0-00"

    .line 149
    .line 150
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result p0

    .line 154
    if-nez p0, :cond_a

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_a
    move v0, v1

    .line 158
    :goto_1
    packed-switch v0, :pswitch_data_0

    .line 159
    .line 160
    .line 161
    new-instance p0, Ljava/time/format/DateTimeParseException;

    .line 162
    .line 163
    invoke-direct {p0, p1, p1, v1}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 164
    .line 165
    .line 166
    throw p0

    .line 167
    :goto_2
    :pswitch_0
    const/4 p0, 0x0

    .line 168
    :cond_b
    return-object p0

    .line 169
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

    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
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

.method public static 飘花落叶言子世苏兰哲楪(I[C)Ljava/time/LocalDateTime;
    .locals 29

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    add-int/lit8 v2, p0, 0x12

    .line 4
    .line 5
    array-length v3, v1

    .line 6
    const-string v5, "illegal input "

    .line 7
    .line 8
    if-gt v2, v3, :cond_1a

    .line 9
    .line 10
    add-int/lit8 v2, p0, 0x1

    .line 11
    .line 12
    aget-char v2, v1, v2

    .line 13
    .line 14
    add-int/lit8 v3, p0, 0x2

    .line 15
    .line 16
    aget-char v3, v1, v3

    .line 17
    .line 18
    add-int/lit8 v6, p0, 0x3

    .line 19
    .line 20
    aget-char v6, v1, v6

    .line 21
    .line 22
    add-int/lit8 v7, p0, 0x4

    .line 23
    .line 24
    aget-char v7, v1, v7

    .line 25
    .line 26
    add-int/lit8 v8, p0, 0x5

    .line 27
    .line 28
    aget-char v9, v1, v8

    .line 29
    .line 30
    add-int/lit8 v10, p0, 0x6

    .line 31
    .line 32
    aget-char v11, v1, v10

    .line 33
    .line 34
    add-int/lit8 v12, p0, 0x7

    .line 35
    .line 36
    aget-char v13, v1, v12

    .line 37
    .line 38
    add-int/lit8 v14, p0, 0x9

    .line 39
    .line 40
    aget-char v14, v1, v14

    .line 41
    .line 42
    add-int/lit8 v15, p0, 0xa

    .line 43
    .line 44
    aget-char v4, v1, v15

    .line 45
    .line 46
    move-object/from16 v16, v5

    .line 47
    .line 48
    add-int/lit8 v5, p0, 0xb

    .line 49
    .line 50
    aget-char v0, v1, v5

    .line 51
    .line 52
    move/from16 v17, v0

    .line 53
    .line 54
    add-int/lit8 v0, p0, 0xc

    .line 55
    .line 56
    move/from16 v18, v0

    .line 57
    .line 58
    aget-char v0, v1, v18

    .line 59
    .line 60
    move/from16 v19, v10

    .line 61
    .line 62
    add-int/lit8 v10, p0, 0xd

    .line 63
    .line 64
    move/from16 v20, v3

    .line 65
    .line 66
    aget-char v3, v1, v10

    .line 67
    .line 68
    move/from16 v21, v6

    .line 69
    .line 70
    add-int/lit8 v6, p0, 0xe

    .line 71
    .line 72
    move/from16 v22, v9

    .line 73
    .line 74
    aget-char v9, v1, v6

    .line 75
    .line 76
    move/from16 v23, v9

    .line 77
    .line 78
    add-int/lit8 v9, p0, 0xf

    .line 79
    .line 80
    move/from16 v24, v9

    .line 81
    .line 82
    aget-char v9, v1, v24

    .line 83
    .line 84
    move/from16 v25, v2

    .line 85
    .line 86
    add-int/lit8 v2, p0, 0x10

    .line 87
    .line 88
    move/from16 v26, v6

    .line 89
    .line 90
    aget-char v6, v1, v2

    .line 91
    .line 92
    move/from16 v27, v6

    .line 93
    .line 94
    const/16 v6, 0x2d

    .line 95
    .line 96
    move/from16 v28, v3

    .line 97
    .line 98
    const/16 v3, 0x20

    .line 99
    .line 100
    if-ne v7, v6, :cond_1

    .line 101
    .line 102
    if-ne v11, v6, :cond_1

    .line 103
    .line 104
    if-eq v14, v3, :cond_0

    .line 105
    .line 106
    const/16 v3, 0x54

    .line 107
    .line 108
    if-ne v14, v3, :cond_1

    .line 109
    .line 110
    :cond_0
    const/16 v3, 0x3a

    .line 111
    .line 112
    if-ne v0, v3, :cond_1

    .line 113
    .line 114
    if-ne v9, v3, :cond_1

    .line 115
    .line 116
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    invoke-static {v8, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    invoke-static {v12, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    invoke-static {v15, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    invoke-static {v10, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    :goto_0
    move v7, v0

    .line 141
    move v12, v1

    .line 142
    move v8, v3

    .line 143
    move v9, v4

    .line 144
    move v10, v5

    .line 145
    move v11, v6

    .line 146
    goto/16 :goto_b

    .line 147
    .line 148
    :cond_1
    if-ne v7, v6, :cond_3

    .line 149
    .line 150
    if-ne v13, v6, :cond_3

    .line 151
    .line 152
    const/16 v3, 0x20

    .line 153
    .line 154
    if-eq v14, v3, :cond_2

    .line 155
    .line 156
    const/16 v3, 0x54

    .line 157
    .line 158
    if-ne v14, v3, :cond_3

    .line 159
    .line 160
    :cond_2
    const/16 v3, 0x3a

    .line 161
    .line 162
    if-ne v0, v3, :cond_3

    .line 163
    .line 164
    if-ne v9, v3, :cond_3

    .line 165
    .line 166
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    invoke-static {v8, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    add-int/lit8 v4, p0, 0x8

    .line 175
    .line 176
    invoke-static {v4, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    invoke-static {v15, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    invoke-static {v10, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 185
    .line 186
    .line 187
    move-result v6

    .line 188
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    goto :goto_0

    .line 193
    :cond_3
    if-ne v7, v6, :cond_5

    .line 194
    .line 195
    if-ne v13, v6, :cond_5

    .line 196
    .line 197
    const/16 v3, 0x20

    .line 198
    .line 199
    if-eq v4, v3, :cond_4

    .line 200
    .line 201
    const/16 v3, 0x54

    .line 202
    .line 203
    if-ne v4, v3, :cond_5

    .line 204
    .line 205
    :cond_4
    const/16 v3, 0x3a

    .line 206
    .line 207
    if-ne v0, v3, :cond_5

    .line 208
    .line 209
    if-ne v9, v3, :cond_5

    .line 210
    .line 211
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    invoke-static {v8, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    add-int/lit8 v4, p0, 0x8

    .line 220
    .line 221
    invoke-static {v4, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    invoke-static {v5, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    invoke-static {v10, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 230
    .line 231
    .line 232
    move-result v6

    .line 233
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    goto :goto_0

    .line 238
    :cond_5
    if-ne v7, v6, :cond_7

    .line 239
    .line 240
    if-ne v13, v6, :cond_7

    .line 241
    .line 242
    const/16 v3, 0x20

    .line 243
    .line 244
    if-eq v4, v3, :cond_6

    .line 245
    .line 246
    const/16 v3, 0x54

    .line 247
    .line 248
    if-ne v4, v3, :cond_7

    .line 249
    .line 250
    :cond_6
    move/from16 v3, v28

    .line 251
    .line 252
    const/16 v14, 0x3a

    .line 253
    .line 254
    goto :goto_1

    .line 255
    :cond_7
    move/from16 v14, v26

    .line 256
    .line 257
    move/from16 v3, v28

    .line 258
    .line 259
    goto :goto_2

    .line 260
    :goto_1
    if-ne v3, v14, :cond_8

    .line 261
    .line 262
    if-ne v9, v14, :cond_8

    .line 263
    .line 264
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    invoke-static {v8, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 269
    .line 270
    .line 271
    move-result v3

    .line 272
    add-int/lit8 v4, p0, 0x8

    .line 273
    .line 274
    invoke-static {v4, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 275
    .line 276
    .line 277
    move-result v4

    .line 278
    invoke-static {v5, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 279
    .line 280
    .line 281
    move-result v5

    .line 282
    move/from16 v14, v26

    .line 283
    .line 284
    invoke-static {v14, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 285
    .line 286
    .line 287
    move-result v6

    .line 288
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 289
    .line 290
    .line 291
    move-result v1

    .line 292
    goto/16 :goto_0

    .line 293
    .line 294
    :cond_8
    move/from16 v14, v26

    .line 295
    .line 296
    :goto_2
    if-ne v7, v6, :cond_c

    .line 297
    .line 298
    if-ne v13, v6, :cond_c

    .line 299
    .line 300
    const/16 v6, 0x20

    .line 301
    .line 302
    if-eq v4, v6, :cond_9

    .line 303
    .line 304
    const/16 v6, 0x54

    .line 305
    .line 306
    if-ne v4, v6, :cond_a

    .line 307
    .line 308
    :cond_9
    const/16 v6, 0x3a

    .line 309
    .line 310
    goto :goto_4

    .line 311
    :cond_a
    move/from16 v6, v25

    .line 312
    .line 313
    move/from16 v13, v27

    .line 314
    .line 315
    :goto_3
    const/16 v8, 0x20

    .line 316
    .line 317
    goto :goto_6

    .line 318
    :goto_4
    if-ne v3, v6, :cond_c

    .line 319
    .line 320
    move/from16 v13, v27

    .line 321
    .line 322
    if-ne v13, v6, :cond_b

    .line 323
    .line 324
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 325
    .line 326
    .line 327
    move-result v0

    .line 328
    invoke-static {v8, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 329
    .line 330
    .line 331
    move-result v3

    .line 332
    add-int/lit8 v2, p0, 0x8

    .line 333
    .line 334
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 335
    .line 336
    .line 337
    move-result v4

    .line 338
    invoke-static {v5, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 339
    .line 340
    .line 341
    move-result v5

    .line 342
    invoke-static {v14, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 343
    .line 344
    .line 345
    move-result v6

    .line 346
    add-int/lit8 v2, p0, 0x11

    .line 347
    .line 348
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 349
    .line 350
    .line 351
    move-result v1

    .line 352
    goto/16 :goto_0

    .line 353
    .line 354
    :cond_b
    :goto_5
    move/from16 v6, v25

    .line 355
    .line 356
    goto :goto_3

    .line 357
    :cond_c
    move/from16 v13, v27

    .line 358
    .line 359
    goto :goto_5

    .line 360
    :goto_6
    if-ne v6, v8, :cond_e

    .line 361
    .line 362
    move/from16 v15, v22

    .line 363
    .line 364
    if-ne v15, v8, :cond_d

    .line 365
    .line 366
    if-ne v4, v8, :cond_d

    .line 367
    .line 368
    const/16 v8, 0x3a

    .line 369
    .line 370
    if-ne v0, v8, :cond_d

    .line 371
    .line 372
    if-ne v9, v8, :cond_d

    .line 373
    .line 374
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 375
    .line 376
    .line 377
    move-result v4

    .line 378
    move/from16 v0, v20

    .line 379
    .line 380
    move/from16 v8, v21

    .line 381
    .line 382
    invoke-static {v0, v8, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    .line 383
    .line 384
    .line 385
    move-result v3

    .line 386
    move/from16 v0, v19

    .line 387
    .line 388
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 389
    .line 390
    .line 391
    move-result v0

    .line 392
    invoke-static {v5, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 393
    .line 394
    .line 395
    move-result v5

    .line 396
    invoke-static {v10, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 397
    .line 398
    .line 399
    move-result v6

    .line 400
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 401
    .line 402
    .line 403
    move-result v1

    .line 404
    goto/16 :goto_0

    .line 405
    .line 406
    :cond_d
    move/from16 v10, v19

    .line 407
    .line 408
    move/from16 v0, v20

    .line 409
    .line 410
    move/from16 v8, v21

    .line 411
    .line 412
    :goto_7
    move/from16 v19, v12

    .line 413
    .line 414
    const/16 v12, 0x20

    .line 415
    .line 416
    goto :goto_8

    .line 417
    :cond_e
    move/from16 v10, v19

    .line 418
    .line 419
    move/from16 v0, v20

    .line 420
    .line 421
    move/from16 v8, v21

    .line 422
    .line 423
    move/from16 v15, v22

    .line 424
    .line 425
    goto :goto_7

    .line 426
    :goto_8
    if-ne v6, v12, :cond_10

    .line 427
    .line 428
    if-ne v15, v12, :cond_10

    .line 429
    .line 430
    if-ne v4, v12, :cond_10

    .line 431
    .line 432
    const/16 v12, 0x3a

    .line 433
    .line 434
    if-ne v3, v12, :cond_f

    .line 435
    .line 436
    if-ne v9, v12, :cond_f

    .line 437
    .line 438
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 439
    .line 440
    .line 441
    move-result v4

    .line 442
    invoke-static {v0, v8, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    .line 443
    .line 444
    .line 445
    move-result v3

    .line 446
    invoke-static {v10, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 447
    .line 448
    .line 449
    move-result v0

    .line 450
    invoke-static {v5, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 451
    .line 452
    .line 453
    move-result v5

    .line 454
    invoke-static {v14, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 455
    .line 456
    .line 457
    move-result v6

    .line 458
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 459
    .line 460
    .line 461
    move-result v1

    .line 462
    goto/16 :goto_0

    .line 463
    .line 464
    :cond_f
    const/16 v12, 0x20

    .line 465
    .line 466
    :cond_10
    if-ne v6, v12, :cond_12

    .line 467
    .line 468
    if-ne v15, v12, :cond_12

    .line 469
    .line 470
    if-ne v4, v12, :cond_12

    .line 471
    .line 472
    const/16 v6, 0x3a

    .line 473
    .line 474
    if-ne v3, v6, :cond_11

    .line 475
    .line 476
    if-ne v13, v6, :cond_11

    .line 477
    .line 478
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 479
    .line 480
    .line 481
    move-result v4

    .line 482
    invoke-static {v0, v8, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    .line 483
    .line 484
    .line 485
    move-result v3

    .line 486
    invoke-static {v10, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 487
    .line 488
    .line 489
    move-result v0

    .line 490
    invoke-static {v5, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 491
    .line 492
    .line 493
    move-result v5

    .line 494
    invoke-static {v14, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 495
    .line 496
    .line 497
    move-result v6

    .line 498
    add-int/lit8 v2, p0, 0x11

    .line 499
    .line 500
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 501
    .line 502
    .line 503
    move-result v1

    .line 504
    goto/16 :goto_0

    .line 505
    .line 506
    :cond_11
    const/16 v12, 0x20

    .line 507
    .line 508
    :cond_12
    if-ne v0, v12, :cond_15

    .line 509
    .line 510
    if-ne v11, v12, :cond_15

    .line 511
    .line 512
    move/from16 v4, v17

    .line 513
    .line 514
    if-ne v4, v12, :cond_14

    .line 515
    .line 516
    move/from16 v5, v23

    .line 517
    .line 518
    const/16 v6, 0x3a

    .line 519
    .line 520
    if-ne v5, v6, :cond_13

    .line 521
    .line 522
    if-ne v13, v6, :cond_13

    .line 523
    .line 524
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 525
    .line 526
    .line 527
    move-result v4

    .line 528
    invoke-static {v8, v7, v15}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    .line 529
    .line 530
    .line 531
    move-result v3

    .line 532
    move/from16 v5, v19

    .line 533
    .line 534
    invoke-static {v5, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 535
    .line 536
    .line 537
    move-result v0

    .line 538
    move/from16 v6, v18

    .line 539
    .line 540
    invoke-static {v6, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 541
    .line 542
    .line 543
    move-result v5

    .line 544
    move/from16 v2, v24

    .line 545
    .line 546
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 547
    .line 548
    .line 549
    move-result v6

    .line 550
    add-int/lit8 v2, p0, 0x11

    .line 551
    .line 552
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 553
    .line 554
    .line 555
    move-result v1

    .line 556
    goto/16 :goto_0

    .line 557
    .line 558
    :cond_13
    move/from16 v6, v18

    .line 559
    .line 560
    move/from16 v5, v19

    .line 561
    .line 562
    const/16 v12, 0x20

    .line 563
    .line 564
    goto :goto_a

    .line 565
    :cond_14
    :goto_9
    move/from16 v6, v18

    .line 566
    .line 567
    move/from16 v5, v19

    .line 568
    .line 569
    goto :goto_a

    .line 570
    :cond_15
    move/from16 v4, v17

    .line 571
    .line 572
    goto :goto_9

    .line 573
    :goto_a
    if-ne v0, v12, :cond_17

    .line 574
    .line 575
    if-ne v11, v12, :cond_17

    .line 576
    .line 577
    if-ne v4, v12, :cond_17

    .line 578
    .line 579
    const/16 v12, 0x3a

    .line 580
    .line 581
    if-ne v3, v12, :cond_16

    .line 582
    .line 583
    if-ne v13, v12, :cond_16

    .line 584
    .line 585
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 586
    .line 587
    .line 588
    move-result v4

    .line 589
    invoke-static {v8, v7, v15}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    .line 590
    .line 591
    .line 592
    move-result v3

    .line 593
    invoke-static {v5, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 594
    .line 595
    .line 596
    move-result v0

    .line 597
    invoke-static {v6, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 598
    .line 599
    .line 600
    move-result v5

    .line 601
    invoke-static {v14, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 602
    .line 603
    .line 604
    move-result v6

    .line 605
    add-int/lit8 v2, p0, 0x11

    .line 606
    .line 607
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 608
    .line 609
    .line 610
    move-result v1

    .line 611
    goto/16 :goto_0

    .line 612
    .line 613
    :cond_16
    const/16 v12, 0x20

    .line 614
    .line 615
    :cond_17
    if-ne v0, v12, :cond_19

    .line 616
    .line 617
    if-ne v11, v12, :cond_19

    .line 618
    .line 619
    if-ne v4, v12, :cond_19

    .line 620
    .line 621
    const/16 v12, 0x3a

    .line 622
    .line 623
    if-ne v3, v12, :cond_19

    .line 624
    .line 625
    if-ne v9, v12, :cond_19

    .line 626
    .line 627
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 628
    .line 629
    .line 630
    move-result v4

    .line 631
    invoke-static {v8, v7, v15}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    .line 632
    .line 633
    .line 634
    move-result v3

    .line 635
    invoke-static {v5, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 636
    .line 637
    .line 638
    move-result v0

    .line 639
    invoke-static {v6, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 640
    .line 641
    .line 642
    move-result v5

    .line 643
    invoke-static {v14, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 644
    .line 645
    .line 646
    move-result v6

    .line 647
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 648
    .line 649
    .line 650
    move-result v1

    .line 651
    goto/16 :goto_0

    .line 652
    .line 653
    :goto_b
    or-int v0, v7, v8

    .line 654
    .line 655
    or-int/2addr v0, v9

    .line 656
    or-int/2addr v0, v10

    .line 657
    or-int/2addr v0, v11

    .line 658
    or-int/2addr v0, v12

    .line 659
    if-gez v0, :cond_18

    .line 660
    .line 661
    const/4 v0, 0x0

    .line 662
    return-object v0

    .line 663
    :cond_18
    invoke-static/range {v7 .. v12}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    return-object v0

    .line 668
    :cond_19
    new-instance v0, Ljava/lang/String;

    .line 669
    .line 670
    const/16 v2, 0x12

    .line 671
    .line 672
    move/from16 v3, p0

    .line 673
    .line 674
    invoke-direct {v0, v1, v3, v2}, Ljava/lang/String;-><init>([CII)V

    .line 675
    .line 676
    .line 677
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 678
    .line 679
    move-object/from16 v2, v16

    .line 680
    .line 681
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object v2

    .line 685
    const/4 v4, 0x0

    .line 686
    invoke-direct {v1, v2, v0, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 687
    .line 688
    .line 689
    throw v1

    .line 690
    :cond_1a
    move/from16 v3, p0

    .line 691
    .line 692
    move-object v2, v5

    .line 693
    const/4 v4, 0x0

    .line 694
    new-instance v0, Ljava/lang/String;

    .line 695
    .line 696
    array-length v5, v1

    .line 697
    sub-int/2addr v5, v3

    .line 698
    invoke-direct {v0, v1, v3, v5}, Ljava/lang/String;-><init>([CII)V

    .line 699
    .line 700
    .line 701
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 702
    .line 703
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 704
    .line 705
    .line 706
    move-result-object v2

    .line 707
    invoke-direct {v1, v2, v0, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 708
    .line 709
    .line 710
    throw v1
.end method

.method public static 飘花落叶言子世苏兰楪哲([BI)Ljava/time/LocalDateTime;
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
    if-gt v2, v3, :cond_10

    .line 7
    .line 8
    add-int/lit8 v2, p1, 0x1

    .line 9
    .line 10
    aget-byte v2, v0, v2

    .line 11
    .line 12
    add-int/lit8 v3, p1, 0x2

    .line 13
    .line 14
    aget-byte v3, v0, v3

    .line 15
    .line 16
    add-int/lit8 v5, p1, 0x3

    .line 17
    .line 18
    aget-byte v5, v0, v5

    .line 19
    .line 20
    add-int/lit8 v6, p1, 0x4

    .line 21
    .line 22
    aget-byte v7, v0, v6

    .line 23
    .line 24
    add-int/lit8 v8, p1, 0x5

    .line 25
    .line 26
    aget-byte v9, v0, v8

    .line 27
    .line 28
    add-int/lit8 v10, p1, 0x6

    .line 29
    .line 30
    aget-byte v11, v0, v10

    .line 31
    .line 32
    add-int/lit8 v12, p1, 0x7

    .line 33
    .line 34
    aget-byte v13, v0, v12

    .line 35
    .line 36
    add-int/lit8 v14, p1, 0x8

    .line 37
    .line 38
    aget-byte v15, v0, v14

    .line 39
    .line 40
    add-int/lit8 v4, p1, 0x9

    .line 41
    .line 42
    aget-byte v1, v0, v4

    .line 43
    .line 44
    move/from16 v16, v6

    .line 45
    .line 46
    add-int/lit8 v6, p1, 0xa

    .line 47
    .line 48
    move/from16 v17, v6

    .line 49
    .line 50
    aget-byte v6, v0, v17

    .line 51
    .line 52
    move/from16 v18, v1

    .line 53
    .line 54
    add-int/lit8 v1, p1, 0xb

    .line 55
    .line 56
    move/from16 v19, v10

    .line 57
    .line 58
    aget-byte v10, v0, v1

    .line 59
    .line 60
    move/from16 v20, v2

    .line 61
    .line 62
    add-int/lit8 v2, p1, 0xc

    .line 63
    .line 64
    move/from16 v21, v5

    .line 65
    .line 66
    aget-byte v5, v0, v2

    .line 67
    .line 68
    move/from16 v22, v5

    .line 69
    .line 70
    add-int/lit8 v5, p1, 0xd

    .line 71
    .line 72
    move/from16 v23, v5

    .line 73
    .line 74
    aget-byte v5, v0, v23

    .line 75
    .line 76
    move/from16 v24, v9

    .line 77
    .line 78
    add-int/lit8 v9, p1, 0xe

    .line 79
    .line 80
    move/from16 v25, v3

    .line 81
    .line 82
    aget-byte v3, v0, v9

    .line 83
    .line 84
    move/from16 v26, v2

    .line 85
    .line 86
    add-int/lit8 v2, p1, 0xf

    .line 87
    .line 88
    move/from16 v27, v2

    .line 89
    .line 90
    aget-byte v2, v0, v27

    .line 91
    .line 92
    move/from16 v28, v2

    .line 93
    .line 94
    add-int/lit8 v2, p1, 0x10

    .line 95
    .line 96
    move/from16 v29, v2

    .line 97
    .line 98
    aget-byte v2, v0, v29

    .line 99
    .line 100
    move/from16 v30, v4

    .line 101
    .line 102
    const/16 v4, 0x2d

    .line 103
    .line 104
    move/from16 v31, v12

    .line 105
    .line 106
    const/16 v12, 0x20

    .line 107
    .line 108
    if-ne v7, v4, :cond_1

    .line 109
    .line 110
    if-ne v13, v4, :cond_1

    .line 111
    .line 112
    const/16 v13, 0x54

    .line 113
    .line 114
    if-eq v6, v13, :cond_0

    .line 115
    .line 116
    if-ne v6, v12, :cond_1

    .line 117
    .line 118
    :cond_0
    const/16 v13, 0x3a

    .line 119
    .line 120
    if-ne v5, v13, :cond_1

    .line 121
    .line 122
    const/16 v13, 0x5a

    .line 123
    .line 124
    if-ne v2, v13, :cond_1

    .line 125
    .line 126
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    invoke-static {v0, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    invoke-static {v0, v14}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    invoke-static {v0, v9}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    move v11, v0

    .line 147
    move v10, v1

    .line 148
    move v7, v2

    .line 149
    move v8, v3

    .line 150
    move v9, v4

    .line 151
    :goto_0
    const/4 v12, 0x0

    .line 152
    :goto_1
    const/4 v13, 0x0

    .line 153
    goto/16 :goto_b

    .line 154
    .line 155
    :cond_1
    if-ne v7, v4, :cond_4

    .line 156
    .line 157
    if-ne v11, v4, :cond_4

    .line 158
    .line 159
    if-eq v15, v12, :cond_2

    .line 160
    .line 161
    const/16 v13, 0x54

    .line 162
    .line 163
    if-ne v15, v13, :cond_3

    .line 164
    .line 165
    :cond_2
    const/16 v13, 0x3a

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_3
    move/from16 v15, v25

    .line 169
    .line 170
    move/from16 v8, v26

    .line 171
    .line 172
    move/from16 v13, v27

    .line 173
    .line 174
    move/from16 v4, v31

    .line 175
    .line 176
    goto :goto_5

    .line 177
    :goto_2
    if-ne v10, v13, :cond_4

    .line 178
    .line 179
    if-ne v3, v13, :cond_4

    .line 180
    .line 181
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    invoke-static {v0, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    move/from16 v4, v31

    .line 190
    .line 191
    invoke-static {v0, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    move/from16 v1, v30

    .line 196
    .line 197
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    move/from16 v8, v26

    .line 202
    .line 203
    invoke-static {v0, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 204
    .line 205
    .line 206
    move-result v5

    .line 207
    move/from16 v13, v27

    .line 208
    .line 209
    invoke-static {v0, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    :goto_3
    move v12, v0

    .line 214
    move v10, v1

    .line 215
    move v7, v2

    .line 216
    move v8, v3

    .line 217
    move v9, v4

    .line 218
    :goto_4
    move v11, v5

    .line 219
    goto :goto_1

    .line 220
    :cond_4
    move/from16 v8, v26

    .line 221
    .line 222
    move/from16 v13, v27

    .line 223
    .line 224
    move/from16 v4, v31

    .line 225
    .line 226
    move/from16 v15, v25

    .line 227
    .line 228
    :goto_5
    if-ne v15, v12, :cond_5

    .line 229
    .line 230
    if-ne v11, v12, :cond_5

    .line 231
    .line 232
    if-ne v10, v12, :cond_5

    .line 233
    .line 234
    const/16 v12, 0x3a

    .line 235
    .line 236
    if-ne v3, v12, :cond_5

    .line 237
    .line 238
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 239
    .line 240
    .line 241
    move-result v1

    .line 242
    move/from16 v12, v21

    .line 243
    .line 244
    move/from16 v2, v24

    .line 245
    .line 246
    invoke-static {v12, v7, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰哲世(BBB)I

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    invoke-static {v0, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 251
    .line 252
    .line 253
    move-result v2

    .line 254
    invoke-static {v0, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 255
    .line 256
    .line 257
    move-result v4

    .line 258
    invoke-static {v0, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    move v11, v0

    .line 263
    move v9, v1

    .line 264
    move v7, v2

    .line 265
    move v8, v3

    .line 266
    move v10, v4

    .line 267
    goto :goto_0

    .line 268
    :cond_5
    move/from16 v12, v21

    .line 269
    .line 270
    move/from16 v21, v14

    .line 271
    .line 272
    move/from16 v14, v24

    .line 273
    .line 274
    move/from16 v24, v2

    .line 275
    .line 276
    move/from16 v26, v8

    .line 277
    .line 278
    move/from16 v2, v20

    .line 279
    .line 280
    const/16 v8, 0x20

    .line 281
    .line 282
    if-ne v2, v8, :cond_7

    .line 283
    .line 284
    if-ne v14, v8, :cond_7

    .line 285
    .line 286
    if-ne v6, v8, :cond_7

    .line 287
    .line 288
    move/from16 v31, v4

    .line 289
    .line 290
    move/from16 v8, v22

    .line 291
    .line 292
    const/16 v4, 0x3a

    .line 293
    .line 294
    if-ne v8, v4, :cond_6

    .line 295
    .line 296
    if-ne v3, v4, :cond_6

    .line 297
    .line 298
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 299
    .line 300
    .line 301
    move-result v4

    .line 302
    invoke-static {v15, v12, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰哲世(BBB)I

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    move/from16 v2, v19

    .line 307
    .line 308
    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 309
    .line 310
    .line 311
    move-result v2

    .line 312
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    move/from16 v5, v23

    .line 317
    .line 318
    invoke-static {v0, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 319
    .line 320
    .line 321
    move-result v5

    .line 322
    invoke-static {v0, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 323
    .line 324
    .line 325
    move-result v0

    .line 326
    goto :goto_3

    .line 327
    :cond_6
    move/from16 v4, v19

    .line 328
    .line 329
    :goto_6
    move/from16 v13, v23

    .line 330
    .line 331
    move/from16 v19, v3

    .line 332
    .line 333
    const/16 v3, 0x20

    .line 334
    .line 335
    goto :goto_7

    .line 336
    :cond_7
    move/from16 v31, v4

    .line 337
    .line 338
    move/from16 v4, v19

    .line 339
    .line 340
    move/from16 v8, v22

    .line 341
    .line 342
    goto :goto_6

    .line 343
    :goto_7
    if-ne v2, v3, :cond_a

    .line 344
    .line 345
    if-ne v14, v3, :cond_a

    .line 346
    .line 347
    if-ne v6, v3, :cond_a

    .line 348
    .line 349
    const/16 v3, 0x3a

    .line 350
    .line 351
    if-ne v8, v3, :cond_9

    .line 352
    .line 353
    move/from16 v8, v28

    .line 354
    .line 355
    if-ne v8, v3, :cond_8

    .line 356
    .line 357
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 358
    .line 359
    .line 360
    move-result v2

    .line 361
    invoke-static {v15, v12, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰哲世(BBB)I

    .line 362
    .line 363
    .line 364
    move-result v3

    .line 365
    invoke-static {v0, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 366
    .line 367
    .line 368
    move-result v4

    .line 369
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 370
    .line 371
    .line 372
    move-result v1

    .line 373
    invoke-static {v0, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 374
    .line 375
    .line 376
    move-result v5

    .line 377
    move/from16 v13, v29

    .line 378
    .line 379
    invoke-static {v0, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 380
    .line 381
    .line 382
    move-result v0

    .line 383
    :goto_8
    move v12, v0

    .line 384
    move v10, v1

    .line 385
    move v9, v2

    .line 386
    move v8, v3

    .line 387
    move v7, v4

    .line 388
    goto/16 :goto_4

    .line 389
    .line 390
    :cond_8
    :goto_9
    move/from16 v13, v29

    .line 391
    .line 392
    const/16 v3, 0x20

    .line 393
    .line 394
    goto :goto_a

    .line 395
    :cond_9
    move/from16 v8, v28

    .line 396
    .line 397
    goto :goto_9

    .line 398
    :cond_a
    move/from16 v8, v28

    .line 399
    .line 400
    move/from16 v13, v29

    .line 401
    .line 402
    :goto_a
    if-ne v2, v3, :cond_c

    .line 403
    .line 404
    if-ne v14, v3, :cond_c

    .line 405
    .line 406
    if-ne v6, v3, :cond_c

    .line 407
    .line 408
    const/16 v3, 0x3a

    .line 409
    .line 410
    if-ne v5, v3, :cond_b

    .line 411
    .line 412
    if-ne v8, v3, :cond_b

    .line 413
    .line 414
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 415
    .line 416
    .line 417
    move-result v2

    .line 418
    invoke-static {v15, v12, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰哲世(BBB)I

    .line 419
    .line 420
    .line 421
    move-result v3

    .line 422
    invoke-static {v0, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 423
    .line 424
    .line 425
    move-result v4

    .line 426
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 427
    .line 428
    .line 429
    move-result v1

    .line 430
    invoke-static {v0, v9}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 431
    .line 432
    .line 433
    move-result v5

    .line 434
    invoke-static {v0, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 435
    .line 436
    .line 437
    move-result v0

    .line 438
    goto :goto_8

    .line 439
    :cond_b
    const/16 v3, 0x20

    .line 440
    .line 441
    :cond_c
    if-ne v15, v3, :cond_d

    .line 442
    .line 443
    if-ne v11, v3, :cond_d

    .line 444
    .line 445
    if-ne v10, v3, :cond_d

    .line 446
    .line 447
    const/16 v3, 0x3a

    .line 448
    .line 449
    if-ne v5, v3, :cond_d

    .line 450
    .line 451
    if-ne v8, v3, :cond_d

    .line 452
    .line 453
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 454
    .line 455
    .line 456
    move-result v4

    .line 457
    invoke-static {v12, v7, v14}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰哲世(BBB)I

    .line 458
    .line 459
    .line 460
    move-result v3

    .line 461
    move/from16 v1, v31

    .line 462
    .line 463
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 464
    .line 465
    .line 466
    move-result v2

    .line 467
    move/from16 v5, v26

    .line 468
    .line 469
    invoke-static {v0, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 470
    .line 471
    .line 472
    move-result v1

    .line 473
    invoke-static {v0, v9}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 474
    .line 475
    .line 476
    move-result v5

    .line 477
    invoke-static {v0, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 478
    .line 479
    .line 480
    move-result v0

    .line 481
    goto/16 :goto_3

    .line 482
    .line 483
    :cond_d
    move/from16 v5, v26

    .line 484
    .line 485
    move/from16 v1, v31

    .line 486
    .line 487
    const/16 v2, -0x1b

    .line 488
    .line 489
    if-ne v7, v2, :cond_e

    .line 490
    .line 491
    const/16 v2, -0x47

    .line 492
    .line 493
    if-ne v14, v2, :cond_e

    .line 494
    .line 495
    const/16 v2, -0x4c

    .line 496
    .line 497
    if-ne v11, v2, :cond_e

    .line 498
    .line 499
    const/16 v2, -0x1a

    .line 500
    .line 501
    move/from16 v3, v18

    .line 502
    .line 503
    if-ne v3, v2, :cond_e

    .line 504
    .line 505
    const/16 v3, -0x64

    .line 506
    .line 507
    if-ne v6, v3, :cond_e

    .line 508
    .line 509
    const/16 v3, -0x78

    .line 510
    .line 511
    if-ne v10, v3, :cond_e

    .line 512
    .line 513
    move/from16 v3, v19

    .line 514
    .line 515
    if-ne v3, v2, :cond_e

    .line 516
    .line 517
    const/16 v2, -0x69

    .line 518
    .line 519
    if-ne v8, v2, :cond_e

    .line 520
    .line 521
    const/16 v2, -0x5b

    .line 522
    .line 523
    move/from16 v3, v24

    .line 524
    .line 525
    if-ne v3, v2, :cond_e

    .line 526
    .line 527
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 528
    .line 529
    .line 530
    move-result v2

    .line 531
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 532
    .line 533
    .line 534
    move-result v3

    .line 535
    invoke-static {v0, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 536
    .line 537
    .line 538
    move-result v4

    .line 539
    move v7, v2

    .line 540
    move v8, v3

    .line 541
    move v9, v4

    .line 542
    const/4 v10, 0x0

    .line 543
    const/4 v11, 0x0

    .line 544
    goto/16 :goto_0

    .line 545
    .line 546
    :cond_e
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 547
    .line 548
    .line 549
    move-result v2

    .line 550
    move/from16 v1, v16

    .line 551
    .line 552
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 553
    .line 554
    .line 555
    move-result v3

    .line 556
    invoke-static {v0, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 557
    .line 558
    .line 559
    move-result v4

    .line 560
    move/from16 v1, v21

    .line 561
    .line 562
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 563
    .line 564
    .line 565
    move-result v1

    .line 566
    move/from16 v6, v17

    .line 567
    .line 568
    invoke-static {v0, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 569
    .line 570
    .line 571
    move-result v6

    .line 572
    invoke-static {v0, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 573
    .line 574
    .line 575
    move-result v5

    .line 576
    const/4 v7, 0x3

    .line 577
    invoke-static {v7, v0, v9}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏哲世楪兰(I[BI)I

    .line 578
    .line 579
    .line 580
    move-result v0

    .line 581
    move v13, v0

    .line 582
    move v10, v1

    .line 583
    move v7, v2

    .line 584
    move v8, v3

    .line 585
    move v9, v4

    .line 586
    move v12, v5

    .line 587
    move v11, v6

    .line 588
    :goto_b
    or-int v0, v7, v8

    .line 589
    .line 590
    or-int/2addr v0, v9

    .line 591
    or-int/2addr v0, v10

    .line 592
    or-int/2addr v0, v11

    .line 593
    or-int/2addr v0, v12

    .line 594
    or-int/2addr v0, v13

    .line 595
    if-gez v0, :cond_f

    .line 596
    .line 597
    const/4 v0, 0x0

    .line 598
    return-object v0

    .line 599
    :cond_f
    invoke-static/range {v7 .. v13}, Ljava/time/LocalDateTime;->of(IIIIIII)Ljava/time/LocalDateTime;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    return-object v0

    .line 604
    :cond_10
    new-instance v1, Ljava/lang/String;

    .line 605
    .line 606
    array-length v2, v0

    .line 607
    sub-int v2, v2, p1

    .line 608
    .line 609
    move/from16 v3, p1

    .line 610
    .line 611
    invoke-direct {v1, v0, v3, v2}, Ljava/lang/String;-><init>([BII)V

    .line 612
    .line 613
    .line 614
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 615
    .line 616
    const-string v2, "illegal input "

    .line 617
    .line 618
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v2

    .line 622
    const/4 v3, 0x0

    .line 623
    invoke-direct {v0, v2, v1, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 624
    .line 625
    .line 626
    throw v0
.end method

.method public static 飘花落叶言子世苏哲兰楪(I[C)Ljava/time/LocalDateTime;
    .locals 31

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    add-int/lit8 v2, p0, 0x11

    .line 4
    .line 5
    array-length v3, v1

    .line 6
    if-gt v2, v3, :cond_f

    .line 7
    .line 8
    add-int/lit8 v2, p0, 0x1

    .line 9
    .line 10
    aget-char v2, v1, v2

    .line 11
    .line 12
    add-int/lit8 v3, p0, 0x2

    .line 13
    .line 14
    aget-char v3, v1, v3

    .line 15
    .line 16
    add-int/lit8 v5, p0, 0x3

    .line 17
    .line 18
    aget-char v5, v1, v5

    .line 19
    .line 20
    add-int/lit8 v6, p0, 0x4

    .line 21
    .line 22
    aget-char v7, v1, v6

    .line 23
    .line 24
    add-int/lit8 v8, p0, 0x5

    .line 25
    .line 26
    aget-char v9, v1, v8

    .line 27
    .line 28
    add-int/lit8 v10, p0, 0x6

    .line 29
    .line 30
    aget-char v11, v1, v10

    .line 31
    .line 32
    add-int/lit8 v12, p0, 0x7

    .line 33
    .line 34
    aget-char v13, v1, v12

    .line 35
    .line 36
    add-int/lit8 v14, p0, 0x8

    .line 37
    .line 38
    aget-char v15, v1, v14

    .line 39
    .line 40
    add-int/lit8 v4, p0, 0xa

    .line 41
    .line 42
    aget-char v0, v1, v4

    .line 43
    .line 44
    move/from16 v16, v4

    .line 45
    .line 46
    add-int/lit8 v4, p0, 0xb

    .line 47
    .line 48
    move/from16 v17, v6

    .line 49
    .line 50
    aget-char v6, v1, v4

    .line 51
    .line 52
    move/from16 v18, v10

    .line 53
    .line 54
    add-int/lit8 v10, p0, 0xc

    .line 55
    .line 56
    move/from16 v19, v2

    .line 57
    .line 58
    aget-char v2, v1, v10

    .line 59
    .line 60
    move/from16 v20, v2

    .line 61
    .line 62
    add-int/lit8 v2, p0, 0xd

    .line 63
    .line 64
    move/from16 v21, v2

    .line 65
    .line 66
    aget-char v2, v1, v21

    .line 67
    .line 68
    move/from16 v22, v5

    .line 69
    .line 70
    add-int/lit8 v5, p0, 0xe

    .line 71
    .line 72
    move/from16 v23, v9

    .line 73
    .line 74
    aget-char v9, v1, v5

    .line 75
    .line 76
    move/from16 v24, v3

    .line 77
    .line 78
    add-int/lit8 v3, p0, 0xf

    .line 79
    .line 80
    move/from16 v25, v3

    .line 81
    .line 82
    aget-char v3, v1, v25

    .line 83
    .line 84
    move/from16 v26, v3

    .line 85
    .line 86
    add-int/lit8 v3, p0, 0x10

    .line 87
    .line 88
    move/from16 v27, v3

    .line 89
    .line 90
    aget-char v3, v1, v27

    .line 91
    .line 92
    move/from16 v28, v10

    .line 93
    .line 94
    const/16 v10, 0x2d

    .line 95
    .line 96
    move/from16 v29, v12

    .line 97
    .line 98
    const/16 v12, 0x20

    .line 99
    .line 100
    if-ne v7, v10, :cond_1

    .line 101
    .line 102
    if-ne v13, v10, :cond_1

    .line 103
    .line 104
    const/16 v13, 0x54

    .line 105
    .line 106
    if-eq v0, v13, :cond_0

    .line 107
    .line 108
    if-ne v0, v12, :cond_1

    .line 109
    .line 110
    :cond_0
    const/16 v13, 0x3a

    .line 111
    .line 112
    if-ne v2, v13, :cond_1

    .line 113
    .line 114
    const/16 v13, 0x5a

    .line 115
    .line 116
    if-ne v3, v13, :cond_1

    .line 117
    .line 118
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    invoke-static {v8, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    invoke-static {v14, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    invoke-static {v4, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    invoke-static {v5, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    move v8, v0

    .line 139
    move v12, v1

    .line 140
    move v9, v2

    .line 141
    move v10, v3

    .line 142
    :goto_0
    move v11, v4

    .line 143
    const/4 v13, 0x0

    .line 144
    :goto_1
    const/4 v14, 0x0

    .line 145
    goto/16 :goto_a

    .line 146
    .line 147
    :cond_1
    if-ne v7, v10, :cond_4

    .line 148
    .line 149
    if-ne v11, v10, :cond_4

    .line 150
    .line 151
    if-eq v15, v12, :cond_2

    .line 152
    .line 153
    const/16 v13, 0x54

    .line 154
    .line 155
    if-ne v15, v13, :cond_3

    .line 156
    .line 157
    :cond_2
    const/16 v13, 0x3a

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_3
    move/from16 v13, v24

    .line 161
    .line 162
    move/from16 v10, v25

    .line 163
    .line 164
    move/from16 v8, v28

    .line 165
    .line 166
    move/from16 v3, v29

    .line 167
    .line 168
    goto :goto_4

    .line 169
    :goto_2
    if-ne v6, v13, :cond_4

    .line 170
    .line 171
    if-ne v9, v13, :cond_4

    .line 172
    .line 173
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    invoke-static {v8, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    move/from16 v3, v29

    .line 182
    .line 183
    invoke-static {v3, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    add-int/lit8 v4, p0, 0x9

    .line 188
    .line 189
    invoke-static {v4, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 190
    .line 191
    .line 192
    move-result v4

    .line 193
    move/from16 v8, v28

    .line 194
    .line 195
    invoke-static {v8, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    move/from16 v10, v25

    .line 200
    .line 201
    invoke-static {v10, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    :goto_3
    move v8, v0

    .line 206
    move v13, v1

    .line 207
    move v9, v2

    .line 208
    move v10, v3

    .line 209
    move v11, v4

    .line 210
    move v12, v5

    .line 211
    goto :goto_1

    .line 212
    :cond_4
    move/from16 v10, v25

    .line 213
    .line 214
    move/from16 v8, v28

    .line 215
    .line 216
    move/from16 v3, v29

    .line 217
    .line 218
    move/from16 v13, v24

    .line 219
    .line 220
    :goto_4
    if-ne v13, v12, :cond_5

    .line 221
    .line 222
    if-ne v11, v12, :cond_5

    .line 223
    .line 224
    if-ne v6, v12, :cond_5

    .line 225
    .line 226
    const/16 v15, 0x3a

    .line 227
    .line 228
    if-ne v9, v15, :cond_5

    .line 229
    .line 230
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    move/from16 v15, v22

    .line 235
    .line 236
    move/from16 v2, v23

    .line 237
    .line 238
    invoke-static {v15, v7, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    .line 239
    .line 240
    .line 241
    move-result v2

    .line 242
    invoke-static {v3, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    invoke-static {v8, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 247
    .line 248
    .line 249
    move-result v4

    .line 250
    invoke-static {v10, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 251
    .line 252
    .line 253
    move-result v1

    .line 254
    move v10, v0

    .line 255
    move v12, v1

    .line 256
    move v9, v2

    .line 257
    move v8, v3

    .line 258
    goto :goto_0

    .line 259
    :cond_5
    move/from16 v15, v22

    .line 260
    .line 261
    move/from16 v30, v23

    .line 262
    .line 263
    move/from16 v22, v14

    .line 264
    .line 265
    move/from16 v14, v19

    .line 266
    .line 267
    if-ne v14, v12, :cond_8

    .line 268
    .line 269
    move/from16 v28, v8

    .line 270
    .line 271
    move/from16 v8, v30

    .line 272
    .line 273
    if-ne v8, v12, :cond_7

    .line 274
    .line 275
    if-ne v0, v12, :cond_7

    .line 276
    .line 277
    move/from16 v29, v3

    .line 278
    .line 279
    move/from16 v12, v20

    .line 280
    .line 281
    const/16 v3, 0x3a

    .line 282
    .line 283
    if-ne v12, v3, :cond_6

    .line 284
    .line 285
    if-ne v9, v3, :cond_6

    .line 286
    .line 287
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 288
    .line 289
    .line 290
    move-result v3

    .line 291
    invoke-static {v13, v15, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    .line 292
    .line 293
    .line 294
    move-result v2

    .line 295
    move/from16 v9, v18

    .line 296
    .line 297
    invoke-static {v9, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    invoke-static {v4, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 302
    .line 303
    .line 304
    move-result v4

    .line 305
    move/from16 v5, v21

    .line 306
    .line 307
    invoke-static {v5, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 308
    .line 309
    .line 310
    move-result v5

    .line 311
    invoke-static {v10, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 312
    .line 313
    .line 314
    move-result v1

    .line 315
    goto :goto_3

    .line 316
    :cond_6
    move/from16 v9, v18

    .line 317
    .line 318
    :goto_5
    move/from16 v3, v21

    .line 319
    .line 320
    :goto_6
    const/16 v10, 0x20

    .line 321
    .line 322
    goto :goto_7

    .line 323
    :cond_7
    move/from16 v29, v3

    .line 324
    .line 325
    move/from16 v9, v18

    .line 326
    .line 327
    move/from16 v12, v20

    .line 328
    .line 329
    goto :goto_5

    .line 330
    :cond_8
    move/from16 v29, v3

    .line 331
    .line 332
    move/from16 v28, v8

    .line 333
    .line 334
    move/from16 v9, v18

    .line 335
    .line 336
    move/from16 v12, v20

    .line 337
    .line 338
    move/from16 v3, v21

    .line 339
    .line 340
    move/from16 v8, v30

    .line 341
    .line 342
    goto :goto_6

    .line 343
    :goto_7
    if-ne v14, v10, :cond_a

    .line 344
    .line 345
    if-ne v8, v10, :cond_a

    .line 346
    .line 347
    if-ne v0, v10, :cond_a

    .line 348
    .line 349
    const/16 v10, 0x3a

    .line 350
    .line 351
    if-ne v12, v10, :cond_a

    .line 352
    .line 353
    move/from16 v12, v26

    .line 354
    .line 355
    if-ne v12, v10, :cond_9

    .line 356
    .line 357
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 358
    .line 359
    .line 360
    move-result v0

    .line 361
    invoke-static {v13, v15, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    .line 362
    .line 363
    .line 364
    move-result v2

    .line 365
    invoke-static {v9, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 366
    .line 367
    .line 368
    move-result v5

    .line 369
    invoke-static {v4, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 370
    .line 371
    .line 372
    move-result v4

    .line 373
    invoke-static {v3, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 374
    .line 375
    .line 376
    move-result v3

    .line 377
    move/from16 v10, v27

    .line 378
    .line 379
    invoke-static {v10, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 380
    .line 381
    .line 382
    move-result v1

    .line 383
    move v10, v0

    .line 384
    move v13, v1

    .line 385
    move v9, v2

    .line 386
    move v12, v3

    .line 387
    move v11, v4

    .line 388
    move v8, v5

    .line 389
    goto/16 :goto_1

    .line 390
    .line 391
    :cond_9
    :goto_8
    move/from16 v10, v27

    .line 392
    .line 393
    const/16 v3, 0x20

    .line 394
    .line 395
    goto :goto_9

    .line 396
    :cond_a
    move/from16 v12, v26

    .line 397
    .line 398
    goto :goto_8

    .line 399
    :goto_9
    if-ne v14, v3, :cond_c

    .line 400
    .line 401
    if-ne v8, v3, :cond_c

    .line 402
    .line 403
    if-ne v0, v3, :cond_c

    .line 404
    .line 405
    const/16 v3, 0x3a

    .line 406
    .line 407
    if-ne v2, v3, :cond_b

    .line 408
    .line 409
    if-ne v12, v3, :cond_b

    .line 410
    .line 411
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 412
    .line 413
    .line 414
    move-result v3

    .line 415
    invoke-static {v13, v15, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    .line 416
    .line 417
    .line 418
    move-result v2

    .line 419
    invoke-static {v9, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 420
    .line 421
    .line 422
    move-result v0

    .line 423
    invoke-static {v4, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 424
    .line 425
    .line 426
    move-result v4

    .line 427
    invoke-static {v5, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 428
    .line 429
    .line 430
    move-result v5

    .line 431
    invoke-static {v10, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 432
    .line 433
    .line 434
    move-result v1

    .line 435
    goto/16 :goto_3

    .line 436
    .line 437
    :cond_b
    const/16 v3, 0x20

    .line 438
    .line 439
    :cond_c
    if-ne v13, v3, :cond_d

    .line 440
    .line 441
    if-ne v11, v3, :cond_d

    .line 442
    .line 443
    if-ne v6, v3, :cond_d

    .line 444
    .line 445
    const/16 v3, 0x3a

    .line 446
    .line 447
    if-ne v2, v3, :cond_d

    .line 448
    .line 449
    if-ne v12, v3, :cond_d

    .line 450
    .line 451
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 452
    .line 453
    .line 454
    move-result v3

    .line 455
    invoke-static {v15, v7, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    .line 456
    .line 457
    .line 458
    move-result v2

    .line 459
    move/from16 v0, v29

    .line 460
    .line 461
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 462
    .line 463
    .line 464
    move-result v0

    .line 465
    move/from16 v8, v28

    .line 466
    .line 467
    invoke-static {v8, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 468
    .line 469
    .line 470
    move-result v4

    .line 471
    invoke-static {v5, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 472
    .line 473
    .line 474
    move-result v5

    .line 475
    invoke-static {v10, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 476
    .line 477
    .line 478
    move-result v1

    .line 479
    goto/16 :goto_3

    .line 480
    .line 481
    :cond_d
    move/from16 v8, v28

    .line 482
    .line 483
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 484
    .line 485
    .line 486
    move-result v0

    .line 487
    move/from16 v2, v17

    .line 488
    .line 489
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 490
    .line 491
    .line 492
    move-result v2

    .line 493
    invoke-static {v9, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 494
    .line 495
    .line 496
    move-result v3

    .line 497
    move/from16 v4, v22

    .line 498
    .line 499
    invoke-static {v4, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 500
    .line 501
    .line 502
    move-result v4

    .line 503
    move/from16 v6, v16

    .line 504
    .line 505
    invoke-static {v6, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 506
    .line 507
    .line 508
    move-result v6

    .line 509
    invoke-static {v8, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 510
    .line 511
    .line 512
    move-result v7

    .line 513
    const/4 v8, 0x3

    .line 514
    invoke-static {v8, v5, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏哲楪兰世(II[C)I

    .line 515
    .line 516
    .line 517
    move-result v1

    .line 518
    move v8, v0

    .line 519
    move v14, v1

    .line 520
    move v9, v2

    .line 521
    move v10, v3

    .line 522
    move v11, v4

    .line 523
    move v12, v6

    .line 524
    move v13, v7

    .line 525
    :goto_a
    or-int v0, v8, v9

    .line 526
    .line 527
    or-int/2addr v0, v10

    .line 528
    or-int/2addr v0, v11

    .line 529
    or-int/2addr v0, v12

    .line 530
    or-int/2addr v0, v13

    .line 531
    or-int/2addr v0, v14

    .line 532
    if-gez v0, :cond_e

    .line 533
    .line 534
    const/4 v0, 0x0

    .line 535
    return-object v0

    .line 536
    :cond_e
    invoke-static/range {v8 .. v14}, Ljava/time/LocalDateTime;->of(IIIIIII)Ljava/time/LocalDateTime;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    return-object v0

    .line 541
    :cond_f
    new-instance v0, Ljava/lang/String;

    .line 542
    .line 543
    array-length v2, v1

    .line 544
    sub-int v2, v2, p0

    .line 545
    .line 546
    move/from16 v3, p0

    .line 547
    .line 548
    invoke-direct {v0, v1, v3, v2}, Ljava/lang/String;-><init>([CII)V

    .line 549
    .line 550
    .line 551
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 552
    .line 553
    const-string v2, "illegal input "

    .line 554
    .line 555
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object v2

    .line 559
    const/4 v3, 0x0

    .line 560
    invoke-direct {v1, v2, v0, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 561
    .line 562
    .line 563
    throw v1
.end method

.method public static 飘花落叶言子世苏哲楪兰([BI)Ljava/time/LocalDateTime;
    .locals 31

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
    add-int/lit8 v1, p1, 0x1

    .line 11
    .line 12
    aget-byte v1, v0, v1

    .line 13
    .line 14
    add-int/lit8 v2, p1, 0x2

    .line 15
    .line 16
    aget-byte v2, v0, v2

    .line 17
    .line 18
    add-int/lit8 v4, p1, 0x3

    .line 19
    .line 20
    aget-byte v4, v0, v4

    .line 21
    .line 22
    add-int/lit8 v5, p1, 0x4

    .line 23
    .line 24
    aget-byte v6, v0, v5

    .line 25
    .line 26
    add-int/lit8 v7, p1, 0x5

    .line 27
    .line 28
    aget-byte v8, v0, v7

    .line 29
    .line 30
    add-int/lit8 v9, p1, 0x6

    .line 31
    .line 32
    aget-byte v10, v0, v9

    .line 33
    .line 34
    add-int/lit8 v11, p1, 0x7

    .line 35
    .line 36
    aget-byte v12, v0, v11

    .line 37
    .line 38
    add-int/lit8 v13, p1, 0x8

    .line 39
    .line 40
    aget-byte v14, v0, v13

    .line 41
    .line 42
    add-int/lit8 v15, p1, 0x9

    .line 43
    .line 44
    move-object/from16 v16, v3

    .line 45
    .line 46
    aget-byte v3, v0, v15

    .line 47
    .line 48
    add-int/lit8 v17, p1, 0xa

    .line 49
    .line 50
    move/from16 v18, v11

    .line 51
    .line 52
    aget-byte v11, v0, v17

    .line 53
    .line 54
    move/from16 v17, v3

    .line 55
    .line 56
    add-int/lit8 v3, p1, 0xb

    .line 57
    .line 58
    move/from16 v19, v10

    .line 59
    .line 60
    aget-byte v10, v0, v3

    .line 61
    .line 62
    move/from16 v20, v10

    .line 63
    .line 64
    add-int/lit8 v10, p1, 0xc

    .line 65
    .line 66
    move/from16 v21, v10

    .line 67
    .line 68
    aget-byte v10, v0, v21

    .line 69
    .line 70
    move/from16 v22, v2

    .line 71
    .line 72
    add-int/lit8 v2, p1, 0xd

    .line 73
    .line 74
    move/from16 v23, v4

    .line 75
    .line 76
    aget-byte v4, v0, v2

    .line 77
    .line 78
    move/from16 v24, v8

    .line 79
    .line 80
    add-int/lit8 v8, p1, 0xe

    .line 81
    .line 82
    move/from16 v25, v1

    .line 83
    .line 84
    aget-byte v1, v0, v8

    .line 85
    .line 86
    move/from16 v26, v1

    .line 87
    .line 88
    add-int/lit8 v1, p1, 0xf

    .line 89
    .line 90
    move/from16 v27, v1

    .line 91
    .line 92
    aget-byte v1, v0, v27

    .line 93
    .line 94
    move/from16 v28, v10

    .line 95
    .line 96
    const/16 v10, 0x2d

    .line 97
    .line 98
    const/16 v29, 0x0

    .line 99
    .line 100
    move/from16 v30, v2

    .line 101
    .line 102
    const/16 v2, 0x20

    .line 103
    .line 104
    if-ne v6, v10, :cond_2

    .line 105
    .line 106
    if-ne v12, v10, :cond_2

    .line 107
    .line 108
    const/16 v10, 0x54

    .line 109
    .line 110
    if-eq v11, v10, :cond_1

    .line 111
    .line 112
    if-ne v11, v2, :cond_2

    .line 113
    .line 114
    :cond_1
    const/16 v10, 0x3a

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_2
    const/16 v10, 0x54

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :goto_0
    if-ne v4, v10, :cond_2

    .line 121
    .line 122
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    invoke-static {v0, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    invoke-static {v0, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    invoke-static {v0, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    :goto_1
    move v9, v0

    .line 143
    move v5, v1

    .line 144
    move v6, v2

    .line 145
    move v8, v3

    .line 146
    move v7, v4

    .line 147
    move/from16 v10, v29

    .line 148
    .line 149
    goto/16 :goto_d

    .line 150
    .line 151
    :goto_2
    if-ne v14, v10, :cond_3

    .line 152
    .line 153
    const/16 v10, 0x5a

    .line 154
    .line 155
    if-ne v1, v10, :cond_3

    .line 156
    .line 157
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    invoke-static {v0, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    invoke-static {v0, v9}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    invoke-static {v0, v15}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 170
    .line 171
    .line 172
    move-result v29

    .line 173
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    move/from16 v5, v30

    .line 178
    .line 179
    invoke-static {v0, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    :goto_3
    move v10, v0

    .line 184
    move v5, v1

    .line 185
    move v6, v2

    .line 186
    move v9, v3

    .line 187
    move v7, v4

    .line 188
    move/from16 v8, v29

    .line 189
    .line 190
    goto/16 :goto_d

    .line 191
    .line 192
    :cond_3
    move/from16 v5, v30

    .line 193
    .line 194
    const/16 v10, 0x2d

    .line 195
    .line 196
    if-ne v6, v10, :cond_7

    .line 197
    .line 198
    if-ne v12, v10, :cond_7

    .line 199
    .line 200
    const/16 v10, 0x54

    .line 201
    .line 202
    if-eq v11, v10, :cond_4

    .line 203
    .line 204
    if-ne v11, v2, :cond_5

    .line 205
    .line 206
    :cond_4
    move/from16 v10, v28

    .line 207
    .line 208
    const/16 v12, 0x3a

    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_5
    move/from16 v12, v25

    .line 212
    .line 213
    move/from16 v15, v26

    .line 214
    .line 215
    move/from16 v7, v27

    .line 216
    .line 217
    move/from16 v10, v28

    .line 218
    .line 219
    goto :goto_6

    .line 220
    :goto_4
    move/from16 v15, v26

    .line 221
    .line 222
    if-ne v10, v12, :cond_6

    .line 223
    .line 224
    if-ne v15, v12, :cond_6

    .line 225
    .line 226
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    invoke-static {v0, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    invoke-static {v0, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 235
    .line 236
    .line 237
    move-result v4

    .line 238
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 239
    .line 240
    .line 241
    move-result v29

    .line 242
    invoke-static {v0, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    move/from16 v7, v27

    .line 247
    .line 248
    invoke-static {v0, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    goto :goto_3

    .line 253
    :cond_6
    move/from16 v7, v27

    .line 254
    .line 255
    :goto_5
    move/from16 v12, v25

    .line 256
    .line 257
    goto :goto_6

    .line 258
    :cond_7
    move/from16 v15, v26

    .line 259
    .line 260
    move/from16 v7, v27

    .line 261
    .line 262
    move/from16 v10, v28

    .line 263
    .line 264
    goto :goto_5

    .line 265
    :goto_6
    if-ne v12, v2, :cond_9

    .line 266
    .line 267
    move/from16 v13, v24

    .line 268
    .line 269
    if-ne v13, v2, :cond_8

    .line 270
    .line 271
    if-ne v11, v2, :cond_8

    .line 272
    .line 273
    const/16 v2, 0x3a

    .line 274
    .line 275
    if-ne v4, v2, :cond_8

    .line 276
    .line 277
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 278
    .line 279
    .line 280
    move-result v4

    .line 281
    move/from16 v2, v22

    .line 282
    .line 283
    move/from16 v1, v23

    .line 284
    .line 285
    invoke-static {v2, v1, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰哲世(BBB)I

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    invoke-static {v0, v9}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 294
    .line 295
    .line 296
    move-result v3

    .line 297
    invoke-static {v0, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    goto/16 :goto_1

    .line 302
    .line 303
    :cond_8
    move/from16 v2, v22

    .line 304
    .line 305
    move/from16 v8, v23

    .line 306
    .line 307
    :goto_7
    move/from16 v22, v1

    .line 308
    .line 309
    const/16 v1, 0x20

    .line 310
    .line 311
    goto :goto_8

    .line 312
    :cond_9
    move/from16 v2, v22

    .line 313
    .line 314
    move/from16 v8, v23

    .line 315
    .line 316
    move/from16 v13, v24

    .line 317
    .line 318
    goto :goto_7

    .line 319
    :goto_8
    if-ne v12, v1, :cond_a

    .line 320
    .line 321
    if-ne v13, v1, :cond_a

    .line 322
    .line 323
    if-ne v11, v1, :cond_a

    .line 324
    .line 325
    const/16 v12, 0x3a

    .line 326
    .line 327
    if-ne v10, v12, :cond_a

    .line 328
    .line 329
    if-ne v15, v12, :cond_a

    .line 330
    .line 331
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 332
    .line 333
    .line 334
    move-result v4

    .line 335
    invoke-static {v2, v8, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰哲世(BBB)I

    .line 336
    .line 337
    .line 338
    move-result v2

    .line 339
    invoke-static {v0, v9}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 340
    .line 341
    .line 342
    move-result v1

    .line 343
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 344
    .line 345
    .line 346
    move-result v29

    .line 347
    invoke-static {v0, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 348
    .line 349
    .line 350
    move-result v3

    .line 351
    invoke-static {v0, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 352
    .line 353
    .line 354
    move-result v0

    .line 355
    goto/16 :goto_3

    .line 356
    .line 357
    :cond_a
    const/16 v1, -0x5b

    .line 358
    .line 359
    const/16 v2, -0x69

    .line 360
    .line 361
    const/16 v5, -0x78

    .line 362
    .line 363
    const/16 v7, -0x64

    .line 364
    .line 365
    const/16 v8, -0x4c

    .line 366
    .line 367
    const/16 v9, -0x47

    .line 368
    .line 369
    const/16 v10, -0x1b

    .line 370
    .line 371
    const/16 v12, -0x1a

    .line 372
    .line 373
    if-ne v6, v10, :cond_e

    .line 374
    .line 375
    if-ne v13, v9, :cond_e

    .line 376
    .line 377
    move/from16 v9, v19

    .line 378
    .line 379
    if-ne v9, v8, :cond_d

    .line 380
    .line 381
    if-ne v14, v12, :cond_d

    .line 382
    .line 383
    move/from16 v14, v17

    .line 384
    .line 385
    if-ne v14, v7, :cond_c

    .line 386
    .line 387
    if-ne v11, v5, :cond_c

    .line 388
    .line 389
    if-ne v4, v12, :cond_c

    .line 390
    .line 391
    if-ne v15, v2, :cond_c

    .line 392
    .line 393
    move/from16 v2, v22

    .line 394
    .line 395
    if-ne v2, v1, :cond_b

    .line 396
    .line 397
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 398
    .line 399
    .line 400
    move-result v1

    .line 401
    move/from16 v2, v18

    .line 402
    .line 403
    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 404
    .line 405
    .line 406
    move-result v2

    .line 407
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 408
    .line 409
    .line 410
    move-result v4

    .line 411
    :goto_9
    move v5, v1

    .line 412
    move v6, v2

    .line 413
    move v7, v4

    .line 414
    move/from16 v8, v29

    .line 415
    .line 416
    move v9, v8

    .line 417
    move v10, v9

    .line 418
    goto :goto_d

    .line 419
    :cond_b
    move/from16 v3, v18

    .line 420
    .line 421
    goto :goto_c

    .line 422
    :cond_c
    :goto_a
    move/from16 v3, v18

    .line 423
    .line 424
    :goto_b
    move/from16 v2, v22

    .line 425
    .line 426
    goto :goto_c

    .line 427
    :cond_d
    move/from16 v14, v17

    .line 428
    .line 429
    goto :goto_a

    .line 430
    :cond_e
    move/from16 v14, v17

    .line 431
    .line 432
    move/from16 v3, v18

    .line 433
    .line 434
    move/from16 v9, v19

    .line 435
    .line 436
    goto :goto_b

    .line 437
    :goto_c
    if-ne v6, v10, :cond_10

    .line 438
    .line 439
    const/16 v6, -0x47

    .line 440
    .line 441
    if-ne v13, v6, :cond_10

    .line 442
    .line 443
    if-ne v9, v8, :cond_10

    .line 444
    .line 445
    if-ne v14, v12, :cond_10

    .line 446
    .line 447
    if-ne v11, v7, :cond_10

    .line 448
    .line 449
    move/from16 v6, v20

    .line 450
    .line 451
    if-ne v6, v5, :cond_10

    .line 452
    .line 453
    if-ne v4, v12, :cond_10

    .line 454
    .line 455
    const/16 v4, -0x69

    .line 456
    .line 457
    if-ne v15, v4, :cond_10

    .line 458
    .line 459
    if-ne v2, v1, :cond_10

    .line 460
    .line 461
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 462
    .line 463
    .line 464
    move-result v1

    .line 465
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 466
    .line 467
    .line 468
    move-result v2

    .line 469
    move/from16 v3, v21

    .line 470
    .line 471
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 472
    .line 473
    .line 474
    move-result v4

    .line 475
    goto :goto_9

    .line 476
    :goto_d
    or-int v0, v5, v6

    .line 477
    .line 478
    or-int/2addr v0, v7

    .line 479
    or-int/2addr v0, v8

    .line 480
    or-int/2addr v0, v9

    .line 481
    or-int/2addr v0, v10

    .line 482
    if-gez v0, :cond_f

    .line 483
    .line 484
    return-object v16

    .line 485
    :cond_f
    invoke-static/range {v5 .. v10}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    return-object v0

    .line 490
    :cond_10
    return-object v16
.end method

.method public static 飘花落叶言子世苏楪兰哲(I[C)Ljava/time/LocalDateTime;
    .locals 20

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    add-int/lit8 v1, p0, 0x10

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
    add-int/lit8 v1, p0, 0x1

    .line 11
    .line 12
    aget-char v1, v0, v1

    .line 13
    .line 14
    add-int/lit8 v2, p0, 0x2

    .line 15
    .line 16
    aget-char v2, v0, v2

    .line 17
    .line 18
    add-int/lit8 v4, p0, 0x3

    .line 19
    .line 20
    aget-char v4, v0, v4

    .line 21
    .line 22
    add-int/lit8 v5, p0, 0x4

    .line 23
    .line 24
    aget-char v6, v0, v5

    .line 25
    .line 26
    add-int/lit8 v7, p0, 0x5

    .line 27
    .line 28
    aget-char v8, v0, v7

    .line 29
    .line 30
    add-int/lit8 v9, p0, 0x7

    .line 31
    .line 32
    aget-char v9, v0, v9

    .line 33
    .line 34
    add-int/lit8 v10, p0, 0xa

    .line 35
    .line 36
    aget-char v10, v0, v10

    .line 37
    .line 38
    add-int/lit8 v11, p0, 0xc

    .line 39
    .line 40
    aget-char v11, v0, v11

    .line 41
    .line 42
    add-int/lit8 v12, p0, 0xd

    .line 43
    .line 44
    aget-char v13, v0, v12

    .line 45
    .line 46
    add-int/lit8 v14, p0, 0xe

    .line 47
    .line 48
    aget-char v15, v0, v14

    .line 49
    .line 50
    move-object/from16 v16, v3

    .line 51
    .line 52
    const/16 v17, 0x0

    .line 53
    .line 54
    const/16 v3, 0x2d

    .line 55
    .line 56
    if-ne v6, v3, :cond_2

    .line 57
    .line 58
    if-ne v9, v3, :cond_2

    .line 59
    .line 60
    const/16 v3, 0x54

    .line 61
    .line 62
    if-eq v10, v3, :cond_1

    .line 63
    .line 64
    const/16 v3, 0x20

    .line 65
    .line 66
    if-ne v10, v3, :cond_2

    .line 67
    .line 68
    :cond_1
    const/16 v3, 0x3a

    .line 69
    .line 70
    if-ne v13, v3, :cond_2

    .line 71
    .line 72
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    invoke-static {v7, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    add-int/lit8 v3, p0, 0x8

    .line 81
    .line 82
    invoke-static {v3, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    add-int/lit8 v4, p0, 0xb

    .line 87
    .line 88
    invoke-static {v4, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    invoke-static {v14, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    :goto_0
    move v10, v0

    .line 97
    move v6, v1

    .line 98
    move v7, v2

    .line 99
    move v8, v3

    .line 100
    move v9, v4

    .line 101
    :goto_1
    move/from16 v11, v17

    .line 102
    .line 103
    goto/16 :goto_3

    .line 104
    .line 105
    :cond_2
    add-int/lit8 v3, p0, 0x8

    .line 106
    .line 107
    move/from16 v18, v14

    .line 108
    .line 109
    aget-char v14, v0, v3

    .line 110
    .line 111
    move/from16 v19, v2

    .line 112
    .line 113
    const/16 v2, 0x54

    .line 114
    .line 115
    if-ne v14, v2, :cond_3

    .line 116
    .line 117
    add-int/lit8 v2, p0, 0xf

    .line 118
    .line 119
    aget-char v2, v0, v2

    .line 120
    .line 121
    const/16 v14, 0x5a

    .line 122
    .line 123
    if-ne v2, v14, :cond_3

    .line 124
    .line 125
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    invoke-static {v5, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    add-int/lit8 v3, p0, 0x6

    .line 134
    .line 135
    invoke-static {v3, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    add-int/lit8 v4, p0, 0x9

    .line 140
    .line 141
    invoke-static {v4, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    add-int/lit8 v5, p0, 0xb

    .line 146
    .line 147
    invoke-static {v5, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    invoke-static {v12, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 152
    .line 153
    .line 154
    move-result v17

    .line 155
    :goto_2
    move v6, v1

    .line 156
    move v7, v2

    .line 157
    move v8, v3

    .line 158
    move v9, v4

    .line 159
    move v10, v5

    .line 160
    goto :goto_1

    .line 161
    :cond_3
    const/16 v2, 0x2d

    .line 162
    .line 163
    if-ne v6, v2, :cond_5

    .line 164
    .line 165
    if-ne v9, v2, :cond_5

    .line 166
    .line 167
    const/16 v2, 0x54

    .line 168
    .line 169
    if-eq v10, v2, :cond_4

    .line 170
    .line 171
    const/16 v2, 0x20

    .line 172
    .line 173
    if-ne v10, v2, :cond_6

    .line 174
    .line 175
    :cond_4
    const/16 v2, 0x3a

    .line 176
    .line 177
    if-ne v11, v2, :cond_5

    .line 178
    .line 179
    if-ne v15, v2, :cond_5

    .line 180
    .line 181
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    invoke-static {v7, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    invoke-static {v3, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    add-int/lit8 v4, p0, 0xb

    .line 194
    .line 195
    invoke-static {v4, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    invoke-static {v12, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    add-int/lit8 v6, p0, 0xf

    .line 204
    .line 205
    invoke-static {v6, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 206
    .line 207
    .line 208
    move-result v17

    .line 209
    goto :goto_2

    .line 210
    :cond_5
    const/16 v2, 0x20

    .line 211
    .line 212
    :cond_6
    if-ne v1, v2, :cond_7

    .line 213
    .line 214
    if-ne v8, v2, :cond_7

    .line 215
    .line 216
    if-ne v10, v2, :cond_7

    .line 217
    .line 218
    const/16 v2, 0x3a

    .line 219
    .line 220
    if-ne v13, v2, :cond_7

    .line 221
    .line 222
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    move/from16 v2, v19

    .line 227
    .line 228
    invoke-static {v2, v4, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    .line 229
    .line 230
    .line 231
    move-result v2

    .line 232
    add-int/lit8 v1, p0, 0x6

    .line 233
    .line 234
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    add-int/lit8 v4, p0, 0xb

    .line 239
    .line 240
    invoke-static {v4, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 241
    .line 242
    .line 243
    move-result v4

    .line 244
    move/from16 v5, v18

    .line 245
    .line 246
    invoke-static {v5, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    goto/16 :goto_0

    .line 251
    .line 252
    :cond_7
    move/from16 v2, v19

    .line 253
    .line 254
    const/16 v3, 0x20

    .line 255
    .line 256
    if-ne v1, v3, :cond_9

    .line 257
    .line 258
    if-ne v8, v3, :cond_9

    .line 259
    .line 260
    if-ne v10, v3, :cond_9

    .line 261
    .line 262
    const/16 v3, 0x3a

    .line 263
    .line 264
    if-ne v11, v3, :cond_9

    .line 265
    .line 266
    if-ne v15, v3, :cond_9

    .line 267
    .line 268
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 269
    .line 270
    .line 271
    move-result v3

    .line 272
    invoke-static {v2, v4, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    .line 273
    .line 274
    .line 275
    move-result v2

    .line 276
    add-int/lit8 v1, p0, 0x6

    .line 277
    .line 278
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 279
    .line 280
    .line 281
    move-result v1

    .line 282
    add-int/lit8 v4, p0, 0xb

    .line 283
    .line 284
    invoke-static {v4, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 285
    .line 286
    .line 287
    move-result v4

    .line 288
    invoke-static {v12, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 289
    .line 290
    .line 291
    move-result v5

    .line 292
    add-int/lit8 v6, p0, 0xf

    .line 293
    .line 294
    invoke-static {v6, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 295
    .line 296
    .line 297
    move-result v17

    .line 298
    goto/16 :goto_2

    .line 299
    .line 300
    :goto_3
    or-int v0, v6, v7

    .line 301
    .line 302
    or-int/2addr v0, v8

    .line 303
    or-int/2addr v0, v9

    .line 304
    or-int/2addr v0, v10

    .line 305
    or-int/2addr v0, v11

    .line 306
    if-gez v0, :cond_8

    .line 307
    .line 308
    return-object v16

    .line 309
    :cond_8
    invoke-static/range {v6 .. v11}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    return-object v0

    .line 314
    :cond_9
    return-object v16
.end method

.method public static 飘花落叶言子世苏楪哲兰([BI)Ljava/time/LocalDateTime;
    .locals 9

    .line 1
    add-int/lit8 v0, p1, 0xe

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
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    add-int/lit8 v0, p1, 0x4

    .line 13
    .line 14
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    add-int/lit8 v0, p1, 0x6

    .line 19
    .line 20
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    add-int/lit8 v0, p1, 0x8

    .line 25
    .line 26
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    add-int/lit8 v0, p1, 0xa

    .line 31
    .line 32
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    add-int/lit8 p1, p1, 0xc

    .line 37
    .line 38
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    or-int p0, v3, v4

    .line 43
    .line 44
    or-int/2addr p0, v5

    .line 45
    or-int/2addr p0, v6

    .line 46
    or-int/2addr p0, v7

    .line 47
    or-int/2addr p0, v8

    .line 48
    if-gez p0, :cond_1

    .line 49
    .line 50
    return-object v2

    .line 51
    :cond_1
    invoke-static/range {v3 .. v8}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method

.method public static 飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/time/ZoneId;)Ljava/time/ZoneId;
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
    sget-object p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

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
    sget-object p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏:Ljava/time/ZoneId;

    .line 121
    .line 122
    return-object p0

    .line 123
    :pswitch_1
    sget-object p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Ljava/time/ZoneId;

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

.method public static 飘花落叶言子楪世兰苏哲(J)I
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

.method public static 飘花落叶言子楪世哲兰苏(JLcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;
    .locals 25

    .line 1
    move-object/from16 v6, p2

    .line 2
    .line 3
    const-wide/16 v0, 0x3e8

    .line 4
    .line 5
    move-wide/from16 v2, p0

    .line 6
    .line 7
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->floorDiv(JJ)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Ljava/time/ZoneId;

    .line 12
    .line 13
    sget-object v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 14
    .line 15
    if-eq v5, v4, :cond_1

    .line 16
    .line 17
    invoke-virtual {v5}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    sget-object v7, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰:Ljava/time/zone/ZoneRules;

    .line 22
    .line 23
    if-ne v4, v7, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v2, v3}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v5}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v3, v2}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/Instant;)Ljava/time/ZoneOffset;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    :goto_0
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰苏哲(J)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    :goto_1
    int-to-long v2, v2

    .line 48
    add-long/2addr v0, v2

    .line 49
    const-wide/32 v2, 0x15180

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->floorDiv(JJ)J

    .line 53
    .line 54
    .line 55
    move-result-wide v4

    .line 56
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->floorMod(JJ)J

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
    add-long/2addr v1, v4

    .line 65
    const-wide/16 v7, 0x0

    .line 66
    .line 67
    cmp-long v3, v1, v7

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
    if-gez v3, :cond_2

    .line 77
    .line 78
    const-wide/32 v15, 0xafa6d

    .line 79
    .line 80
    .line 81
    add-long/2addr v4, v15

    .line 82
    div-long/2addr v4, v11

    .line 83
    sub-long/2addr v4, v9

    .line 84
    mul-long v15, v4, v13

    .line 85
    .line 86
    neg-long v3, v4

    .line 87
    mul-long/2addr v3, v11

    .line 88
    add-long/2addr v1, v3

    .line 89
    goto :goto_2

    .line 90
    :cond_2
    move-wide v15, v7

    .line 91
    :goto_2
    mul-long v3, v1, v13

    .line 92
    .line 93
    const-wide/16 v17, 0x24f

    .line 94
    .line 95
    add-long v3, v3, v17

    .line 96
    .line 97
    div-long/2addr v3, v11

    .line 98
    const-wide/16 v11, 0x16d

    .line 99
    .line 100
    mul-long v17, v3, v11

    .line 101
    .line 102
    const-wide/16 v19, 0x4

    .line 103
    .line 104
    div-long v21, v3, v19

    .line 105
    .line 106
    add-long v21, v21, v17

    .line 107
    .line 108
    const-wide/16 v17, 0x64

    .line 109
    .line 110
    div-long v23, v3, v17

    .line 111
    .line 112
    sub-long v21, v21, v23

    .line 113
    .line 114
    div-long v23, v3, v13

    .line 115
    .line 116
    add-long v23, v23, v21

    .line 117
    .line 118
    sub-long v21, v1, v23

    .line 119
    .line 120
    cmp-long v5, v21, v7

    .line 121
    .line 122
    if-gez v5, :cond_3

    .line 123
    .line 124
    sub-long/2addr v3, v9

    .line 125
    mul-long/2addr v11, v3

    .line 126
    div-long v9, v3, v19

    .line 127
    .line 128
    add-long/2addr v9, v11

    .line 129
    div-long v11, v3, v17

    .line 130
    .line 131
    sub-long/2addr v9, v11

    .line 132
    div-long v11, v3, v13

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
    add-long/2addr v3, v15

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
    add-long/2addr v3, v9

    .line 166
    const-wide/32 v9, -0x3b9ac9ff

    .line 167
    .line 168
    .line 169
    cmp-long v2, v3, v9

    .line 170
    .line 171
    if-ltz v2, :cond_7

    .line 172
    .line 173
    const-wide/32 v9, 0x3b9ac9ff

    .line 174
    .line 175
    .line 176
    cmp-long v2, v3, v9

    .line 177
    .line 178
    if-gtz v2, :cond_7

    .line 179
    .line 180
    long-to-int v2, v3

    .line 181
    sget-object v3, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_DASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 182
    .line 183
    if-eq v6, v3, :cond_4

    .line 184
    .line 185
    sget-object v3, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_SLASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 186
    .line 187
    if-eq v6, v3, :cond_4

    .line 188
    .line 189
    sget-object v3, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_DOT:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 190
    .line 191
    if-ne v6, v3, :cond_5

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
    int-to-long v3, v0

    .line 198
    cmp-long v0, v3, v7

    .line 199
    .line 200
    if-ltz v0, :cond_6

    .line 201
    .line 202
    const-wide/32 v7, 0x1517f

    .line 203
    .line 204
    .line 205
    cmp-long v0, v3, v7

    .line 206
    .line 207
    if-gtz v0, :cond_6

    .line 208
    .line 209
    const-wide/16 v7, 0xe10

    .line 210
    .line 211
    div-long v7, v3, v7

    .line 212
    .line 213
    long-to-int v0, v7

    .line 214
    mul-int/lit16 v7, v0, 0xe10

    .line 215
    .line 216
    int-to-long v7, v7

    .line 217
    sub-long/2addr v3, v7

    .line 218
    const-wide/16 v7, 0x3c

    .line 219
    .line 220
    div-long v7, v3, v7

    .line 221
    .line 222
    long-to-int v7, v7

    .line 223
    mul-int/lit8 v8, v7, 0x3c

    .line 224
    .line 225
    int-to-long v8, v8

    .line 226
    sub-long/2addr v3, v8

    .line 227
    long-to-int v3, v3

    .line 228
    move v4, v3

    .line 229
    move v3, v0

    .line 230
    move v0, v2

    .line 231
    move v2, v1

    .line 232
    move v1, v5

    .line 233
    move v5, v4

    .line 234
    move v4, v7

    .line 235
    invoke-static/range {v0 .. v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲(IIIIIILcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;

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
    invoke-static {v3, v4, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(JLjava/lang/String;)Ljava/lang/String;

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
    invoke-static {v0, v1, v2, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰(IIILcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;

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
    invoke-static {v3, v4, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(JLjava/lang/String;)Ljava/lang/String;

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

.method public static 飘花落叶言子楪世哲苏兰(IIILcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;
    .locals 17

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    div-int/lit8 v3, p0, 0x64

    .line 8
    .line 9
    mul-int/lit8 v4, v3, 0x64

    .line 10
    .line 11
    sub-int v4, p0, v4

    .line 12
    .line 13
    sget-object v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世哲苏:Ljava/util/function/BiFunction;

    .line 14
    .line 15
    const/16 v9, 0x2d

    .line 16
    .line 17
    const/4 v10, 0x6

    .line 18
    const/4 v11, 0x3

    .line 19
    const/16 v12, 0xa

    .line 20
    .line 21
    const/16 v13, 0x8

    .line 22
    .line 23
    const/4 v14, 0x5

    .line 24
    const/16 v15, 0x2e

    .line 25
    .line 26
    const/16 p0, 0x7

    .line 27
    .line 28
    const/4 v6, 0x2

    .line 29
    const/16 v16, 0x4

    .line 30
    .line 31
    const/4 v7, 0x0

    .line 32
    if-eqz v5, :cond_2

    .line 33
    .line 34
    new-array v12, v12, [B

    .line 35
    .line 36
    sget-object v8, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_DOT:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 37
    .line 38
    if-ne v2, v8, :cond_0

    .line 39
    .line 40
    invoke-static {v7, v12, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪哲世(I[BI)V

    .line 41
    .line 42
    .line 43
    aput-byte v15, v12, v6

    .line 44
    .line 45
    invoke-static {v11, v12, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪哲世(I[BI)V

    .line 46
    .line 47
    .line 48
    aput-byte v15, v12, v14

    .line 49
    .line 50
    invoke-static {v10, v12, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪哲世(I[BI)V

    .line 51
    .line 52
    .line 53
    invoke-static {v13, v12, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪哲世(I[BI)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    sget-object v8, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_DASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 58
    .line 59
    if-ne v2, v8, :cond_1

    .line 60
    .line 61
    move v8, v9

    .line 62
    goto :goto_0

    .line 63
    :cond_1
    const/16 v8, 0x2f

    .line 64
    .line 65
    :goto_0
    int-to-byte v2, v8

    .line 66
    invoke-static {v7, v12, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪哲世(I[BI)V

    .line 67
    .line 68
    .line 69
    invoke-static {v6, v12, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪哲世(I[BI)V

    .line 70
    .line 71
    .line 72
    aput-byte v2, v12, v16

    .line 73
    .line 74
    invoke-static {v14, v12, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪哲世(I[BI)V

    .line 75
    .line 76
    .line 77
    aput-byte v2, v12, p0

    .line 78
    .line 79
    invoke-static {v13, v12, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪哲世(I[BI)V

    .line 80
    .line 81
    .line 82
    :goto_1
    invoke-static {v7}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-interface {v5, v12, v0}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, Ljava/lang/String;

    .line 91
    .line 92
    return-object v0

    .line 93
    :cond_2
    new-array v5, v12, [C

    .line 94
    .line 95
    sget-object v8, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_DOT:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 96
    .line 97
    if-ne v2, v8, :cond_3

    .line 98
    .line 99
    invoke-static {v7, v1, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 100
    .line 101
    .line 102
    aput-char v15, v5, v6

    .line 103
    .line 104
    invoke-static {v11, v0, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 105
    .line 106
    .line 107
    aput-char v15, v5, v14

    .line 108
    .line 109
    invoke-static {v10, v3, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 110
    .line 111
    .line 112
    invoke-static {v13, v4, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_3
    sget-object v8, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_DASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 117
    .line 118
    if-ne v2, v8, :cond_4

    .line 119
    .line 120
    move v8, v9

    .line 121
    goto :goto_2

    .line 122
    :cond_4
    const/16 v8, 0x2f

    .line 123
    .line 124
    :goto_2
    invoke-static {v7, v3, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 125
    .line 126
    .line 127
    invoke-static {v6, v4, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 128
    .line 129
    .line 130
    aput-char v8, v5, v16

    .line 131
    .line 132
    invoke-static {v14, v0, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 133
    .line 134
    .line 135
    aput-char v8, v5, p0

    .line 136
    .line 137
    invoke-static {v13, v1, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 138
    .line 139
    .line 140
    :goto_3
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世苏哲:Ljava/util/function/BiFunction;

    .line 141
    .line 142
    if-eqz v0, :cond_5

    .line 143
    .line 144
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 145
    .line 146
    invoke-interface {v0, v5, v1}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    check-cast v0, Ljava/lang/String;

    .line 151
    .line 152
    return-object v0

    .line 153
    :cond_5
    new-instance v0, Ljava/lang/String;

    .line 154
    .line 155
    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    .line 156
    .line 157
    .line 158
    return-object v0
.end method

.method public static 飘花落叶言子楪世苏兰哲(IIIIIILcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)Ljava/lang/String;
    .locals 22

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    move/from16 v4, p5

    .line 10
    .line 11
    move-object/from16 v5, p6

    .line 12
    .line 13
    div-int/lit8 v6, p0, 0x64

    .line 14
    .line 15
    mul-int/lit8 v7, v6, 0x64

    .line 16
    .line 17
    sub-int v7, p0, v7

    .line 18
    .line 19
    sget-object v8, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世哲苏:Ljava/util/function/BiFunction;

    .line 20
    .line 21
    const/4 v15, 0x6

    .line 22
    const/16 p0, 0x7

    .line 23
    .line 24
    const/4 v10, 0x3

    .line 25
    const/16 v16, 0x4

    .line 26
    .line 27
    const/16 v11, 0x13

    .line 28
    .line 29
    const/16 v17, 0x20

    .line 30
    .line 31
    const/16 v18, 0xa

    .line 32
    .line 33
    const/16 v12, 0x8

    .line 34
    .line 35
    const/16 v20, 0x2e

    .line 36
    .line 37
    const/4 v14, 0x2

    .line 38
    const/4 v9, 0x0

    .line 39
    if-eqz v8, :cond_3

    .line 40
    .line 41
    new-array v11, v11, [B

    .line 42
    .line 43
    const/16 v21, 0x5

    .line 44
    .line 45
    sget-object v13, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_DOT:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 46
    .line 47
    if-ne v5, v13, :cond_0

    .line 48
    .line 49
    invoke-static {v9, v11, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪哲世(I[BI)V

    .line 50
    .line 51
    .line 52
    aput-byte v20, v11, v14

    .line 53
    .line 54
    invoke-static {v10, v11, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪哲世(I[BI)V

    .line 55
    .line 56
    .line 57
    aput-byte v20, v11, v21

    .line 58
    .line 59
    invoke-static {v15, v11, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪哲世(I[BI)V

    .line 60
    .line 61
    .line 62
    invoke-static {v12, v11, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪哲世(I[BI)V

    .line 63
    .line 64
    .line 65
    aput-byte v17, v11, v18

    .line 66
    .line 67
    :goto_0
    const/16 v0, 0xb

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_0
    sget-object v10, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_DASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 71
    .line 72
    if-ne v5, v10, :cond_1

    .line 73
    .line 74
    move/from16 v10, v17

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    const/16 v10, 0x54

    .line 78
    .line 79
    :goto_1
    sget-object v13, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_SLASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 80
    .line 81
    if-ne v5, v13, :cond_2

    .line 82
    .line 83
    const/16 v5, 0x2f

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_2
    const/16 v5, 0x2d

    .line 87
    .line 88
    :goto_2
    int-to-byte v5, v5

    .line 89
    invoke-static {v9, v11, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪哲世(I[BI)V

    .line 90
    .line 91
    .line 92
    invoke-static {v14, v11, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪哲世(I[BI)V

    .line 93
    .line 94
    .line 95
    aput-byte v5, v11, v16

    .line 96
    .line 97
    move/from16 v6, v21

    .line 98
    .line 99
    invoke-static {v6, v11, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪哲世(I[BI)V

    .line 100
    .line 101
    .line 102
    aput-byte v5, v11, p0

    .line 103
    .line 104
    invoke-static {v12, v11, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪哲世(I[BI)V

    .line 105
    .line 106
    .line 107
    int-to-byte v0, v10

    .line 108
    aput-byte v0, v11, v18

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :goto_3
    invoke-static {v11, v0, v2, v3, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲苏楪世兰([BIIII)V

    .line 112
    .line 113
    .line 114
    invoke-static {v9}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-interface {v8, v11, v0}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    check-cast v0, Ljava/lang/String;

    .line 123
    .line 124
    return-object v0

    .line 125
    :cond_3
    new-array v8, v11, [C

    .line 126
    .line 127
    sget-object v11, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_DOT:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 128
    .line 129
    if-ne v5, v11, :cond_4

    .line 130
    .line 131
    invoke-static {v9, v1, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 132
    .line 133
    .line 134
    aput-char v20, v8, v14

    .line 135
    .line 136
    invoke-static {v10, v0, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 137
    .line 138
    .line 139
    const/16 v21, 0x5

    .line 140
    .line 141
    aput-char v20, v8, v21

    .line 142
    .line 143
    invoke-static {v15, v6, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 144
    .line 145
    .line 146
    invoke-static {v12, v7, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 147
    .line 148
    .line 149
    aput-char v17, v8, v18

    .line 150
    .line 151
    :goto_4
    const/16 v0, 0xb

    .line 152
    .line 153
    goto :goto_7

    .line 154
    :cond_4
    sget-object v10, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_DASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 155
    .line 156
    if-ne v5, v10, :cond_5

    .line 157
    .line 158
    goto :goto_5

    .line 159
    :cond_5
    const/16 v17, 0x54

    .line 160
    .line 161
    :goto_5
    sget-object v10, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_SLASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 162
    .line 163
    if-ne v5, v10, :cond_6

    .line 164
    .line 165
    const/16 v19, 0x2f

    .line 166
    .line 167
    goto :goto_6

    .line 168
    :cond_6
    const/16 v19, 0x2d

    .line 169
    .line 170
    :goto_6
    invoke-static {v9, v6, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 171
    .line 172
    .line 173
    invoke-static {v14, v7, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 174
    .line 175
    .line 176
    aput-char v19, v8, v16

    .line 177
    .line 178
    const/4 v6, 0x5

    .line 179
    invoke-static {v6, v0, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 180
    .line 181
    .line 182
    aput-char v19, v8, p0

    .line 183
    .line 184
    invoke-static {v12, v1, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 185
    .line 186
    .line 187
    aput-char v17, v8, v18

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :goto_7
    invoke-static {v8, v0, v2, v3, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲苏楪兰世([CIIII)V

    .line 191
    .line 192
    .line 193
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世苏哲:Ljava/util/function/BiFunction;

    .line 194
    .line 195
    if-eqz v0, :cond_7

    .line 196
    .line 197
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 198
    .line 199
    invoke-interface {v0, v8, v1}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    check-cast v0, Ljava/lang/String;

    .line 204
    .line 205
    return-object v0

    .line 206
    :cond_7
    new-instance v0, Ljava/lang/String;

    .line 207
    .line 208
    invoke-direct {v0, v8}, Ljava/lang/String;-><init>([C)V

    .line 209
    .line 210
    .line 211
    return-object v0
.end method

.method public static 飘花落叶言子楪世苏哲兰(III)J
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
    return-wide v0
.end method

.method public static 飘花落叶言子楪兰世哲苏([BI)Ljava/time/LocalDate;
    .locals 6

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
    add-int/lit8 v0, p1, 0x4

    .line 9
    .line 10
    aget-byte v1, p0, v0

    .line 11
    .line 12
    const/16 v3, 0x2d

    .line 13
    .line 14
    if-ne v1, v3, :cond_1

    .line 15
    .line 16
    add-int/lit8 v1, p1, 0x7

    .line 17
    .line 18
    aget-byte v1, p0, v1

    .line 19
    .line 20
    if-ne v1, v3, :cond_1

    .line 21
    .line 22
    add-int/lit8 v1, p1, 0xa

    .line 23
    .line 24
    aget-byte v1, p0, v1

    .line 25
    .line 26
    const/16 v3, 0x5a

    .line 27
    .line 28
    if-ne v1, v3, :cond_1

    .line 29
    .line 30
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    add-int/lit8 v1, p1, 0x5

    .line 35
    .line 36
    invoke-static {p0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    add-int/lit8 p1, p1, 0x8

    .line 41
    .line 42
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    add-int/lit8 v1, p1, 0x2

    .line 48
    .line 49
    aget-byte v1, p0, v1

    .line 50
    .line 51
    const/16 v3, 0x20

    .line 52
    .line 53
    if-ne v1, v3, :cond_3

    .line 54
    .line 55
    add-int/lit8 v1, p1, 0x6

    .line 56
    .line 57
    aget-byte v1, p0, v1

    .line 58
    .line 59
    if-ne v1, v3, :cond_3

    .line 60
    .line 61
    add-int/lit8 v1, p1, 0x7

    .line 62
    .line 63
    invoke-static {p0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    add-int/lit8 v3, p1, 0x3

    .line 68
    .line 69
    aget-byte v3, p0, v3

    .line 70
    .line 71
    int-to-char v3, v3

    .line 72
    aget-byte v0, p0, v0

    .line 73
    .line 74
    int-to-char v0, v0

    .line 75
    add-int/lit8 v4, p1, 0x5

    .line 76
    .line 77
    aget-byte v4, p0, v4

    .line 78
    .line 79
    int-to-char v4, v4

    .line 80
    invoke-static {v3, v0, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    move v5, v1

    .line 89
    move v1, v0

    .line 90
    move v0, v5

    .line 91
    :goto_0
    or-int p1, v0, v1

    .line 92
    .line 93
    or-int/2addr p1, p0

    .line 94
    if-ltz p1, :cond_3

    .line 95
    .line 96
    if-nez v0, :cond_2

    .line 97
    .line 98
    if-nez v1, :cond_2

    .line 99
    .line 100
    if-nez p0, :cond_2

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_2
    invoke-static {v0, v1, p0}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :cond_3
    :goto_1
    return-object v2
.end method

.method public static 飘花落叶言子楪兰世苏哲(I[C)Ljava/time/LocalDate;
    .locals 7

    .line 1
    add-int/lit8 v0, p0, 0xb

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-le v0, v1, :cond_0

    .line 6
    .line 7
    return-object v2

    .line 8
    :cond_0
    add-int/lit8 v0, p0, 0x4

    .line 9
    .line 10
    aget-char v0, p1, v0

    .line 11
    .line 12
    add-int/lit8 v1, p0, 0x7

    .line 13
    .line 14
    aget-char v3, p1, v1

    .line 15
    .line 16
    add-int/lit8 v4, p0, 0xa

    .line 17
    .line 18
    aget-char v4, p1, v4

    .line 19
    .line 20
    const/16 v5, 0x5e74

    .line 21
    .line 22
    if-ne v0, v5, :cond_1

    .line 23
    .line 24
    const/16 v5, 0x6708

    .line 25
    .line 26
    if-ne v3, v5, :cond_1

    .line 27
    .line 28
    const/16 v5, 0x65e5

    .line 29
    .line 30
    if-eq v4, v5, :cond_3

    .line 31
    .line 32
    :cond_1
    const/16 v5, 0x2d

    .line 33
    .line 34
    if-ne v0, v5, :cond_2

    .line 35
    .line 36
    if-ne v3, v5, :cond_2

    .line 37
    .line 38
    const/16 v5, 0x5a

    .line 39
    .line 40
    if-eq v4, v5, :cond_3

    .line 41
    .line 42
    :cond_2
    const v5, 0xb144

    .line 43
    .line 44
    .line 45
    if-ne v0, v5, :cond_4

    .line 46
    .line 47
    const v5, 0xc6d4

    .line 48
    .line 49
    .line 50
    if-ne v3, v5, :cond_4

    .line 51
    .line 52
    const v3, 0xc77c

    .line 53
    .line 54
    .line 55
    if-ne v4, v3, :cond_4

    .line 56
    .line 57
    :cond_3
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    add-int/lit8 v1, p0, 0x5

    .line 62
    .line 63
    invoke-static {v1, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    add-int/lit8 p0, p0, 0x8

    .line 68
    .line 69
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    goto :goto_0

    .line 74
    :cond_4
    add-int/lit8 v3, p0, 0x2

    .line 75
    .line 76
    aget-char v3, p1, v3

    .line 77
    .line 78
    const/16 v4, 0x20

    .line 79
    .line 80
    if-ne v3, v4, :cond_6

    .line 81
    .line 82
    add-int/lit8 v3, p0, 0x6

    .line 83
    .line 84
    aget-char v3, p1, v3

    .line 85
    .line 86
    if-ne v3, v4, :cond_6

    .line 87
    .line 88
    invoke-static {v1, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    add-int/lit8 v3, p0, 0x3

    .line 93
    .line 94
    aget-char v3, p1, v3

    .line 95
    .line 96
    add-int/lit8 v4, p0, 0x5

    .line 97
    .line 98
    aget-char v4, p1, v4

    .line 99
    .line 100
    invoke-static {v3, v0, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    move v6, v1

    .line 109
    move v1, v0

    .line 110
    move v0, v6

    .line 111
    :goto_0
    or-int p1, v0, v1

    .line 112
    .line 113
    or-int/2addr p1, p0

    .line 114
    if-ltz p1, :cond_6

    .line 115
    .line 116
    if-nez v0, :cond_5

    .line 117
    .line 118
    if-nez v1, :cond_5

    .line 119
    .line 120
    if-nez p0, :cond_5

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_5
    invoke-static {v0, v1, p0}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0

    .line 128
    :cond_6
    :goto_1
    return-object v2
.end method

.method public static 飘花落叶言子楪兰哲世苏(I[C)Ljava/time/LocalDate;
    .locals 13

    .line 1
    add-int/lit8 v0, p0, 0x9

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-le v0, v1, :cond_0

    .line 6
    .line 7
    return-object v2

    .line 8
    :cond_0
    add-int/lit8 v0, p0, 0x1

    .line 9
    .line 10
    aget-char v0, p1, v0

    .line 11
    .line 12
    add-int/lit8 v1, p0, 0x2

    .line 13
    .line 14
    aget-char v3, p1, v1

    .line 15
    .line 16
    add-int/lit8 v4, p0, 0x4

    .line 17
    .line 18
    aget-char v4, p1, v4

    .line 19
    .line 20
    add-int/lit8 v5, p0, 0x6

    .line 21
    .line 22
    aget-char v5, p1, v5

    .line 23
    .line 24
    add-int/lit8 v6, p0, 0x7

    .line 25
    .line 26
    aget-char v7, p1, v6

    .line 27
    .line 28
    add-int/lit8 v8, p0, 0x8

    .line 29
    .line 30
    aget-char v9, p1, v8

    .line 31
    .line 32
    const/16 v10, 0x2d

    .line 33
    .line 34
    if-ne v4, v10, :cond_1

    .line 35
    .line 36
    if-eq v7, v10, :cond_2

    .line 37
    .line 38
    :cond_1
    const/16 v11, 0x2f

    .line 39
    .line 40
    if-ne v4, v11, :cond_3

    .line 41
    .line 42
    if-ne v7, v11, :cond_3

    .line 43
    .line 44
    :cond_2
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    add-int/lit8 p0, p0, 0x5

    .line 49
    .line 50
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    invoke-static {v8, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    goto/16 :goto_2

    .line 59
    .line 60
    :cond_3
    if-ne v4, v10, :cond_4

    .line 61
    .line 62
    if-eq v5, v10, :cond_5

    .line 63
    .line 64
    :cond_4
    if-ne v4, v11, :cond_6

    .line 65
    .line 66
    if-ne v5, v11, :cond_6

    .line 67
    .line 68
    :cond_5
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    add-int/lit8 p0, p0, 0x5

    .line 73
    .line 74
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    invoke-static {v6, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    goto/16 :goto_2

    .line 83
    .line 84
    :cond_6
    const/16 v7, 0x5e74

    .line 85
    .line 86
    if-ne v4, v7, :cond_7

    .line 87
    .line 88
    const/16 v7, 0x6708

    .line 89
    .line 90
    if-ne v5, v7, :cond_7

    .line 91
    .line 92
    const/16 v7, 0x65e5

    .line 93
    .line 94
    if-eq v9, v7, :cond_8

    .line 95
    .line 96
    :cond_7
    const v7, 0xb144

    .line 97
    .line 98
    .line 99
    if-ne v4, v7, :cond_9

    .line 100
    .line 101
    const v7, 0xc6d4

    .line 102
    .line 103
    .line 104
    if-ne v5, v7, :cond_9

    .line 105
    .line 106
    const v7, 0xc77c

    .line 107
    .line 108
    .line 109
    if-ne v9, v7, :cond_9

    .line 110
    .line 111
    :cond_8
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    add-int/lit8 p0, p0, 0x5

    .line 116
    .line 117
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    invoke-static {v6, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    goto/16 :goto_2

    .line 126
    .line 127
    :cond_9
    const/16 v7, 0x2e

    .line 128
    .line 129
    if-ne v0, v7, :cond_a

    .line 130
    .line 131
    if-ne v4, v7, :cond_a

    .line 132
    .line 133
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    invoke-static {v1, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    add-int/lit8 p0, p0, 0x5

    .line 142
    .line 143
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 144
    .line 145
    .line 146
    move-result p0

    .line 147
    :goto_0
    move p1, v0

    .line 148
    move v0, p0

    .line 149
    move p0, v1

    .line 150
    goto/16 :goto_2

    .line 151
    .line 152
    :cond_a
    if-ne v3, v7, :cond_b

    .line 153
    .line 154
    if-eq v4, v7, :cond_c

    .line 155
    .line 156
    :cond_b
    if-ne v3, v10, :cond_d

    .line 157
    .line 158
    if-ne v4, v10, :cond_d

    .line 159
    .line 160
    :cond_c
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    add-int/lit8 v1, p0, 0x3

    .line 165
    .line 166
    invoke-static {v1, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    add-int/lit8 p0, p0, 0x5

    .line 171
    .line 172
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 173
    .line 174
    .line 175
    move-result p0

    .line 176
    goto :goto_0

    .line 177
    :cond_d
    if-ne v0, v10, :cond_e

    .line 178
    .line 179
    if-ne v4, v10, :cond_e

    .line 180
    .line 181
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    invoke-static {v1, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    add-int/lit8 p0, p0, 0x5

    .line 190
    .line 191
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 192
    .line 193
    .line 194
    move-result p0

    .line 195
    goto :goto_0

    .line 196
    :cond_e
    if-ne v3, v10, :cond_10

    .line 197
    .line 198
    if-ne v5, v10, :cond_10

    .line 199
    .line 200
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    add-int/lit8 v1, p0, 0x3

    .line 205
    .line 206
    aget-char v1, p1, v1

    .line 207
    .line 208
    add-int/lit8 p0, p0, 0x5

    .line 209
    .line 210
    aget-char p0, p1, p0

    .line 211
    .line 212
    invoke-static {v1, v4, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    .line 213
    .line 214
    .line 215
    move-result p0

    .line 216
    invoke-static {v6, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    const/4 v1, -0x1

    .line 221
    if-eq p1, v1, :cond_f

    .line 222
    .line 223
    add-int/lit16 p1, p1, 0x7d0

    .line 224
    .line 225
    :cond_f
    move v12, v0

    .line 226
    move v0, p1

    .line 227
    move p1, v12

    .line 228
    goto :goto_2

    .line 229
    :cond_10
    if-ne v0, v11, :cond_11

    .line 230
    .line 231
    if-ne v4, v11, :cond_11

    .line 232
    .line 233
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    invoke-static {v1, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    add-int/lit8 p0, p0, 0x5

    .line 242
    .line 243
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 244
    .line 245
    .line 246
    move-result p0

    .line 247
    :goto_1
    move p1, v0

    .line 248
    move v0, p0

    .line 249
    move p0, p1

    .line 250
    move p1, v1

    .line 251
    goto :goto_2

    .line 252
    :cond_11
    if-ne v3, v11, :cond_13

    .line 253
    .line 254
    if-ne v4, v11, :cond_13

    .line 255
    .line 256
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    add-int/lit8 v1, p0, 0x3

    .line 261
    .line 262
    invoke-static {v1, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    add-int/lit8 p0, p0, 0x5

    .line 267
    .line 268
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 269
    .line 270
    .line 271
    move-result p0

    .line 272
    goto :goto_1

    .line 273
    :goto_2
    or-int v1, v0, p0

    .line 274
    .line 275
    or-int/2addr v1, p1

    .line 276
    if-gtz v1, :cond_12

    .line 277
    .line 278
    return-object v2

    .line 279
    :cond_12
    invoke-static {v0, p0, p1}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    return-object p0

    .line 284
    :cond_13
    return-object v2
.end method

.method public static 飘花落叶言子楪兰哲苏世([BI)Ljava/time/LocalDate;
    .locals 11

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
    add-int/lit8 v0, p1, 0x1

    .line 9
    .line 10
    aget-byte v0, p0, v0

    .line 11
    .line 12
    int-to-char v0, v0

    .line 13
    add-int/lit8 v1, p1, 0x2

    .line 14
    .line 15
    aget-byte v3, p0, v1

    .line 16
    .line 17
    int-to-char v3, v3

    .line 18
    add-int/lit8 v4, p1, 0x4

    .line 19
    .line 20
    aget-byte v4, p0, v4

    .line 21
    .line 22
    int-to-char v4, v4

    .line 23
    add-int/lit8 v5, p1, 0x6

    .line 24
    .line 25
    aget-byte v5, p0, v5

    .line 26
    .line 27
    int-to-char v5, v5

    .line 28
    add-int/lit8 v6, p1, 0x7

    .line 29
    .line 30
    aget-byte v7, p0, v6

    .line 31
    .line 32
    int-to-char v7, v7

    .line 33
    const/16 v8, 0x2d

    .line 34
    .line 35
    if-ne v4, v8, :cond_1

    .line 36
    .line 37
    if-eq v7, v8, :cond_2

    .line 38
    .line 39
    :cond_1
    const/16 v9, 0x2f

    .line 40
    .line 41
    if-ne v4, v9, :cond_3

    .line 42
    .line 43
    if-ne v7, v9, :cond_3

    .line 44
    .line 45
    :cond_2
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    add-int/lit8 v1, p1, 0x5

    .line 50
    .line 51
    invoke-static {p0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    add-int/lit8 p1, p1, 0x8

    .line 56
    .line 57
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    goto/16 :goto_1

    .line 62
    .line 63
    :cond_3
    if-ne v4, v8, :cond_4

    .line 64
    .line 65
    if-eq v5, v8, :cond_5

    .line 66
    .line 67
    :cond_4
    if-ne v4, v9, :cond_6

    .line 68
    .line 69
    if-ne v5, v9, :cond_6

    .line 70
    .line 71
    :cond_5
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    add-int/lit8 p1, p1, 0x5

    .line 76
    .line 77
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    invoke-static {p0, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    goto/16 :goto_1

    .line 86
    .line 87
    :cond_6
    const/16 v7, 0x2e

    .line 88
    .line 89
    if-ne v0, v7, :cond_8

    .line 90
    .line 91
    if-ne v4, v7, :cond_8

    .line 92
    .line 93
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    invoke-static {p0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    add-int/lit8 p1, p1, 0x5

    .line 102
    .line 103
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    :cond_7
    :goto_0
    move v10, v0

    .line 108
    move v0, p0

    .line 109
    move p0, v10

    .line 110
    goto/16 :goto_1

    .line 111
    .line 112
    :cond_8
    if-ne v3, v7, :cond_9

    .line 113
    .line 114
    if-eq v4, v7, :cond_a

    .line 115
    .line 116
    :cond_9
    if-ne v3, v8, :cond_b

    .line 117
    .line 118
    if-ne v4, v8, :cond_b

    .line 119
    .line 120
    :cond_a
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    add-int/lit8 v1, p1, 0x3

    .line 125
    .line 126
    invoke-static {p0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    add-int/lit8 p1, p1, 0x5

    .line 131
    .line 132
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    goto :goto_0

    .line 137
    :cond_b
    if-ne v0, v8, :cond_c

    .line 138
    .line 139
    if-ne v4, v8, :cond_c

    .line 140
    .line 141
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    invoke-static {p0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    add-int/lit8 p1, p1, 0x5

    .line 150
    .line 151
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 152
    .line 153
    .line 154
    move-result p0

    .line 155
    goto :goto_0

    .line 156
    :cond_c
    if-ne v3, v8, :cond_d

    .line 157
    .line 158
    if-ne v5, v8, :cond_d

    .line 159
    .line 160
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    add-int/lit8 v1, p1, 0x3

    .line 165
    .line 166
    aget-byte v1, p0, v1

    .line 167
    .line 168
    int-to-char v1, v1

    .line 169
    add-int/lit8 p1, p1, 0x5

    .line 170
    .line 171
    aget-byte p1, p0, p1

    .line 172
    .line 173
    int-to-char p1, p1

    .line 174
    invoke-static {v1, v4, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    invoke-static {p0, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 179
    .line 180
    .line 181
    move-result p0

    .line 182
    const/4 p1, -0x1

    .line 183
    if-eq p0, p1, :cond_7

    .line 184
    .line 185
    add-int/lit16 p0, p0, 0x7d0

    .line 186
    .line 187
    goto :goto_0

    .line 188
    :cond_d
    if-ne v0, v9, :cond_e

    .line 189
    .line 190
    if-ne v4, v9, :cond_e

    .line 191
    .line 192
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    invoke-static {p0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    add-int/lit8 p1, p1, 0x5

    .line 201
    .line 202
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 203
    .line 204
    .line 205
    move-result p0

    .line 206
    move v10, v0

    .line 207
    move v0, p0

    .line 208
    move p0, v1

    .line 209
    move v1, v10

    .line 210
    goto :goto_1

    .line 211
    :cond_e
    if-ne v3, v9, :cond_10

    .line 212
    .line 213
    if-ne v4, v9, :cond_10

    .line 214
    .line 215
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    add-int/lit8 v0, p1, 0x3

    .line 220
    .line 221
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    add-int/lit8 p1, p1, 0x5

    .line 226
    .line 227
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 228
    .line 229
    .line 230
    move-result p0

    .line 231
    goto :goto_0

    .line 232
    :goto_1
    or-int p1, v0, v1

    .line 233
    .line 234
    or-int/2addr p1, p0

    .line 235
    if-gtz p1, :cond_f

    .line 236
    .line 237
    return-object v2

    .line 238
    :cond_f
    invoke-static {v0, v1, p0}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    return-object p0

    .line 243
    :cond_10
    return-object v2
.end method

.method public static 飘花落叶言子楪兰苏世哲(I[C)Ljava/time/LocalDate;
    .locals 8

    .line 1
    add-int/lit8 v0, p0, 0x8

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-le v0, v1, :cond_0

    .line 6
    .line 7
    return-object v2

    .line 8
    :cond_0
    add-int/lit8 v0, p0, 0x1

    .line 9
    .line 10
    aget-char v0, p1, v0

    .line 11
    .line 12
    add-int/lit8 v1, p0, 0x3

    .line 13
    .line 14
    aget-char v1, p1, v1

    .line 15
    .line 16
    add-int/lit8 v3, p0, 0x4

    .line 17
    .line 18
    aget-char v4, p1, v3

    .line 19
    .line 20
    const/16 v5, 0x2d

    .line 21
    .line 22
    if-ne v4, v5, :cond_1

    .line 23
    .line 24
    add-int/lit8 v6, p0, 0x6

    .line 25
    .line 26
    aget-char v6, p1, v6

    .line 27
    .line 28
    if-ne v6, v5, :cond_1

    .line 29
    .line 30
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    add-int/lit8 v1, p0, 0x5

    .line 35
    .line 36
    invoke-static {v1, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    add-int/lit8 p0, p0, 0x7

    .line 41
    .line 42
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/16 v6, 0x2f

    .line 48
    .line 49
    if-ne v0, v6, :cond_2

    .line 50
    .line 51
    if-ne v1, v6, :cond_2

    .line 52
    .line 53
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    add-int/lit8 p0, p0, 0x2

    .line 58
    .line 59
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    invoke-static {v3, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    goto :goto_0

    .line 68
    :cond_2
    if-ne v0, v5, :cond_4

    .line 69
    .line 70
    add-int/lit8 v0, p0, 0x5

    .line 71
    .line 72
    aget-char v0, p1, v0

    .line 73
    .line 74
    if-ne v0, v5, :cond_4

    .line 75
    .line 76
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    add-int/lit8 v3, p0, 0x2

    .line 81
    .line 82
    aget-char v3, p1, v3

    .line 83
    .line 84
    invoke-static {v3, v1, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    add-int/lit8 p0, p0, 0x6

    .line 89
    .line 90
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    const/4 p1, -0x1

    .line 95
    if-eq p0, p1, :cond_3

    .line 96
    .line 97
    add-int/lit16 p0, p0, 0x7d0

    .line 98
    .line 99
    :cond_3
    move v7, v0

    .line 100
    move v0, p0

    .line 101
    move p0, v7

    .line 102
    goto :goto_0

    .line 103
    :cond_4
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    invoke-static {v3, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    add-int/lit8 p0, p0, 0x6

    .line 112
    .line 113
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    :goto_0
    or-int p1, v0, v1

    .line 118
    .line 119
    or-int/2addr p1, p0

    .line 120
    if-gtz p1, :cond_5

    .line 121
    .line 122
    return-object v2

    .line 123
    :cond_5
    invoke-static {v0, v1, p0}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0
.end method

.method public static 飘花落叶言子楪兰苏哲世([BI)Ljava/time/LocalDate;
    .locals 8

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
    add-int/lit8 v0, p1, 0x1

    .line 9
    .line 10
    aget-byte v0, p0, v0

    .line 11
    .line 12
    int-to-char v0, v0

    .line 13
    add-int/lit8 v1, p1, 0x3

    .line 14
    .line 15
    aget-byte v1, p0, v1

    .line 16
    .line 17
    int-to-char v1, v1

    .line 18
    add-int/lit8 v3, p1, 0x4

    .line 19
    .line 20
    aget-byte v4, p0, v3

    .line 21
    .line 22
    int-to-char v4, v4

    .line 23
    const/16 v5, 0x2d

    .line 24
    .line 25
    if-ne v4, v5, :cond_1

    .line 26
    .line 27
    add-int/lit8 v6, p1, 0x6

    .line 28
    .line 29
    aget-byte v6, p0, v6

    .line 30
    .line 31
    if-ne v6, v5, :cond_1

    .line 32
    .line 33
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/lit8 v1, p1, 0x5

    .line 38
    .line 39
    invoke-static {p0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    add-int/lit8 p1, p1, 0x7

    .line 44
    .line 45
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const/16 v6, 0x2f

    .line 51
    .line 52
    if-ne v0, v6, :cond_2

    .line 53
    .line 54
    if-ne v1, v6, :cond_2

    .line 55
    .line 56
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    add-int/lit8 p1, p1, 0x2

    .line 61
    .line 62
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    invoke-static {p0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    move p0, p1

    .line 71
    goto :goto_0

    .line 72
    :cond_2
    if-ne v0, v5, :cond_4

    .line 73
    .line 74
    add-int/lit8 v0, p1, 0x5

    .line 75
    .line 76
    aget-byte v0, p0, v0

    .line 77
    .line 78
    if-ne v0, v5, :cond_4

    .line 79
    .line 80
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    add-int/lit8 v3, p1, 0x2

    .line 85
    .line 86
    aget-byte v3, p0, v3

    .line 87
    .line 88
    int-to-char v3, v3

    .line 89
    invoke-static {v3, v1, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    add-int/lit8 p1, p1, 0x6

    .line 94
    .line 95
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    const/4 p1, -0x1

    .line 100
    if-eq p0, p1, :cond_3

    .line 101
    .line 102
    add-int/lit16 p0, p0, 0x7d0

    .line 103
    .line 104
    :cond_3
    move v7, v0

    .line 105
    move v0, p0

    .line 106
    move p0, v7

    .line 107
    goto :goto_0

    .line 108
    :cond_4
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    invoke-static {p0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    add-int/lit8 p1, p1, 0x6

    .line 117
    .line 118
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    :goto_0
    or-int p1, v0, v1

    .line 123
    .line 124
    or-int/2addr p1, p0

    .line 125
    if-gtz p1, :cond_5

    .line 126
    .line 127
    return-object v2

    .line 128
    :cond_5
    invoke-static {v0, v1, p0}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    return-object p0
.end method

.method public static 飘花落叶言子楪哲世兰苏(Ljava/lang/String;)Ljava/util/Date;
    .locals 4

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏楪兰哲世(Ljava/lang/String;Ljava/time/ZoneId;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long p0, v0, v2

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    :cond_0
    new-instance p0, Ljava/util/Date;

    .line 16
    .line 17
    invoke-direct {p0, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public static 飘花落叶言子楪哲世苏兰(CCC)I
    .locals 1

    .line 1
    shl-int/lit8 p0, p0, 0x10

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    shl-int/2addr p1, v0

    .line 6
    or-int/2addr p0, p1

    .line 7
    or-int/2addr p0, p2

    .line 8
    sparse-switch p0, :sswitch_data_0

    .line 9
    .line 10
    .line 11
    const/4 p0, -0x1

    .line 12
    return p0

    .line 13
    :sswitch_0
    const/16 p0, 0x9

    .line 14
    .line 15
    return p0

    .line 16
    :sswitch_1
    const/16 p0, 0xa

    .line 17
    .line 18
    return p0

    .line 19
    :sswitch_2
    const/16 p0, 0xb

    .line 20
    .line 21
    return p0

    .line 22
    :sswitch_3
    const/4 p0, 0x5

    .line 23
    return p0

    .line 24
    :sswitch_4
    const/4 p0, 0x3

    .line 25
    return p0

    .line 26
    :sswitch_5
    const/4 p0, 0x6

    .line 27
    return p0

    .line 28
    :sswitch_6
    const/4 p0, 0x7

    .line 29
    return p0

    .line 30
    :sswitch_7
    const/4 p0, 0x1

    .line 31
    return p0

    .line 32
    :sswitch_8
    const/4 p0, 0x2

    .line 33
    return p0

    .line 34
    :sswitch_9
    const/16 p0, 0xc

    .line 35
    .line 36
    return p0

    .line 37
    :sswitch_a
    return v0

    .line 38
    :sswitch_b
    const/4 p0, 0x4

    .line 39
    return p0

    .line 40
    nop

    .line 41
    :sswitch_data_0
    .sparse-switch
        0x417072 -> :sswitch_b
        0x417567 -> :sswitch_a
        0x446563 -> :sswitch_9
        0x466562 -> :sswitch_8
        0x4a616e -> :sswitch_7
        0x4a756c -> :sswitch_6
        0x4a756e -> :sswitch_5
        0x4d6172 -> :sswitch_4
        0x4d6179 -> :sswitch_3
        0x4e6f76 -> :sswitch_2
        0x4f6374 -> :sswitch_1
        0x536570 -> :sswitch_0
    .end sparse-switch
.end method

.method public static 飘花落叶言子楪哲兰世苏(I[C)Ljava/time/LocalDate;
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    add-int/lit8 v1, p0, 0xa

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
    add-int/lit8 v1, p0, 0x1

    .line 11
    .line 12
    aget-char v1, v0, v1

    .line 13
    .line 14
    add-int/lit8 v2, p0, 0x2

    .line 15
    .line 16
    aget-char v2, v0, v2

    .line 17
    .line 18
    add-int/lit8 v4, p0, 0x4

    .line 19
    .line 20
    aget-char v4, v0, v4

    .line 21
    .line 22
    add-int/lit8 v5, p0, 0x5

    .line 23
    .line 24
    aget-char v6, v0, v5

    .line 25
    .line 26
    add-int/lit8 v7, p0, 0x6

    .line 27
    .line 28
    aget-char v8, v0, v7

    .line 29
    .line 30
    add-int/lit8 v9, p0, 0x7

    .line 31
    .line 32
    aget-char v10, v0, v9

    .line 33
    .line 34
    add-int/lit8 v11, p0, 0x9

    .line 35
    .line 36
    aget-char v11, v0, v11

    .line 37
    .line 38
    const/16 v12, 0x2d

    .line 39
    .line 40
    if-ne v4, v12, :cond_1

    .line 41
    .line 42
    if-eq v10, v12, :cond_2

    .line 43
    .line 44
    :cond_1
    const/16 v13, 0x2f

    .line 45
    .line 46
    if-ne v4, v13, :cond_3

    .line 47
    .line 48
    if-ne v10, v13, :cond_3

    .line 49
    .line 50
    :cond_2
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-static {v5, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    add-int/lit8 v4, p0, 0x8

    .line 59
    .line 60
    invoke-static {v4, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    :goto_0
    move-object/from16 v16, v3

    .line 65
    .line 66
    goto/16 :goto_4

    .line 67
    .line 68
    :cond_3
    const/16 v14, 0x2e

    .line 69
    .line 70
    if-ne v2, v14, :cond_4

    .line 71
    .line 72
    if-eq v6, v14, :cond_5

    .line 73
    .line 74
    :cond_4
    if-ne v2, v12, :cond_6

    .line 75
    .line 76
    if-ne v6, v12, :cond_6

    .line 77
    .line 78
    :cond_5
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    add-int/lit8 v2, p0, 0x3

    .line 83
    .line 84
    invoke-static {v2, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    invoke-static {v7, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    :goto_1
    move/from16 v16, v1

    .line 93
    .line 94
    move v1, v0

    .line 95
    move/from16 v0, v16

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_6
    if-ne v2, v13, :cond_7

    .line 99
    .line 100
    if-ne v6, v13, :cond_7

    .line 101
    .line 102
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    add-int/lit8 v1, p0, 0x3

    .line 107
    .line 108
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    invoke-static {v7, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    goto :goto_1

    .line 117
    :cond_7
    const/16 v12, 0x65e5

    .line 118
    .line 119
    const/16 v13, 0x6708

    .line 120
    .line 121
    const/16 v14, 0x5e74

    .line 122
    .line 123
    if-ne v4, v14, :cond_9

    .line 124
    .line 125
    if-ne v8, v13, :cond_9

    .line 126
    .line 127
    if-eq v11, v12, :cond_8

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_8
    move-object/from16 v16, v3

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_9
    :goto_2
    const v15, 0xc77c

    .line 134
    .line 135
    .line 136
    move-object/from16 v16, v3

    .line 137
    .line 138
    const v3, 0xc6d4

    .line 139
    .line 140
    .line 141
    const v12, 0xb144

    .line 142
    .line 143
    .line 144
    if-ne v4, v12, :cond_a

    .line 145
    .line 146
    if-ne v8, v3, :cond_a

    .line 147
    .line 148
    if-ne v11, v15, :cond_a

    .line 149
    .line 150
    :goto_3
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    invoke-static {v5, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    invoke-static {v9, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    goto :goto_4

    .line 163
    :cond_a
    if-ne v4, v14, :cond_b

    .line 164
    .line 165
    if-ne v10, v13, :cond_b

    .line 166
    .line 167
    const/16 v8, 0x65e5

    .line 168
    .line 169
    if-eq v11, v8, :cond_c

    .line 170
    .line 171
    :cond_b
    if-ne v4, v12, :cond_d

    .line 172
    .line 173
    if-ne v10, v3, :cond_d

    .line 174
    .line 175
    if-ne v11, v15, :cond_d

    .line 176
    .line 177
    :cond_c
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    invoke-static {v5, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    add-int/lit8 v3, p0, 0x8

    .line 186
    .line 187
    invoke-static {v3, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    goto :goto_4

    .line 192
    :cond_d
    const/16 v3, 0x20

    .line 193
    .line 194
    if-ne v1, v3, :cond_f

    .line 195
    .line 196
    if-ne v6, v3, :cond_f

    .line 197
    .line 198
    invoke-static/range {p0 .. p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    add-int/lit8 v3, p0, 0x3

    .line 203
    .line 204
    aget-char v3, v0, v3

    .line 205
    .line 206
    invoke-static {v2, v3, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    invoke-static {v7, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    move/from16 v17, v1

    .line 215
    .line 216
    move v1, v0

    .line 217
    move/from16 v0, v17

    .line 218
    .line 219
    :goto_4
    or-int v3, v1, v2

    .line 220
    .line 221
    or-int/2addr v3, v0

    .line 222
    if-gtz v3, :cond_e

    .line 223
    .line 224
    return-object v16

    .line 225
    :cond_e
    invoke-static {v1, v2, v0}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    return-object v0

    .line 230
    :cond_f
    return-object v16
.end method

.method public static 飘花落叶言子楪哲兰苏世([BI)Ljava/time/LocalDate;
    .locals 9

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
    add-int/lit8 v0, p1, 0x2

    .line 9
    .line 10
    aget-byte v0, p0, v0

    .line 11
    .line 12
    int-to-char v0, v0

    .line 13
    add-int/lit8 v1, p1, 0x4

    .line 14
    .line 15
    aget-byte v1, p0, v1

    .line 16
    .line 17
    int-to-char v1, v1

    .line 18
    add-int/lit8 v3, p1, 0x5

    .line 19
    .line 20
    aget-byte v4, p0, v3

    .line 21
    .line 22
    int-to-char v4, v4

    .line 23
    add-int/lit8 v5, p1, 0x7

    .line 24
    .line 25
    aget-byte v5, p0, v5

    .line 26
    .line 27
    int-to-char v5, v5

    .line 28
    const/16 v6, 0x2d

    .line 29
    .line 30
    if-ne v1, v6, :cond_1

    .line 31
    .line 32
    if-eq v5, v6, :cond_2

    .line 33
    .line 34
    :cond_1
    const/16 v7, 0x2f

    .line 35
    .line 36
    if-ne v1, v7, :cond_3

    .line 37
    .line 38
    if-ne v5, v7, :cond_3

    .line 39
    .line 40
    :cond_2
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-static {p0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    add-int/lit8 p1, p1, 0x8

    .line 49
    .line 50
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    goto :goto_1

    .line 55
    :cond_3
    const/16 v3, 0x2e

    .line 56
    .line 57
    if-ne v0, v3, :cond_4

    .line 58
    .line 59
    if-eq v4, v3, :cond_5

    .line 60
    .line 61
    :cond_4
    if-ne v0, v6, :cond_6

    .line 62
    .line 63
    if-ne v4, v6, :cond_6

    .line 64
    .line 65
    :cond_5
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    add-int/lit8 v1, p1, 0x3

    .line 70
    .line 71
    invoke-static {p0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    add-int/lit8 p1, p1, 0x6

    .line 76
    .line 77
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    :goto_0
    move v8, v0

    .line 82
    move v0, p0

    .line 83
    move p0, v8

    .line 84
    goto :goto_1

    .line 85
    :cond_6
    if-ne v0, v7, :cond_7

    .line 86
    .line 87
    if-ne v4, v7, :cond_7

    .line 88
    .line 89
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    add-int/lit8 v0, p1, 0x3

    .line 94
    .line 95
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    add-int/lit8 p1, p1, 0x6

    .line 100
    .line 101
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    goto :goto_0

    .line 106
    :cond_7
    add-int/lit8 v3, p1, 0x1

    .line 107
    .line 108
    aget-byte v3, p0, v3

    .line 109
    .line 110
    const/16 v5, 0x20

    .line 111
    .line 112
    if-ne v3, v5, :cond_9

    .line 113
    .line 114
    if-ne v4, v5, :cond_9

    .line 115
    .line 116
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    add-int/lit8 v4, p1, 0x3

    .line 121
    .line 122
    aget-byte v4, p0, v4

    .line 123
    .line 124
    int-to-char v4, v4

    .line 125
    invoke-static {v0, v4, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    add-int/lit8 p1, p1, 0x6

    .line 130
    .line 131
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲([BI)I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    move p0, v3

    .line 136
    :goto_1
    or-int p1, v0, v1

    .line 137
    .line 138
    or-int/2addr p1, p0

    .line 139
    if-gtz p1, :cond_8

    .line 140
    .line 141
    return-object v2

    .line 142
    :cond_8
    invoke-static {v0, v1, p0}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    return-object p0

    .line 147
    :cond_9
    return-object v2
.end method

.method public static 飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;Ljava/time/ZoneId;)Ljava/util/Date;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    if-eqz v0, :cond_29

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-nez v3, :cond_29

    .line 14
    .line 15
    const-string v3, "null"

    .line 16
    .line 17
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    goto/16 :goto_e

    .line 24
    .line 25
    :cond_0
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-nez v3, :cond_1

    .line 32
    .line 33
    const-string v3, "string"

    .line 34
    .line 35
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    :cond_1
    move-object/from16 v32, v2

    .line 42
    .line 43
    move-object v2, v0

    .line 44
    move-object/from16 v0, v32

    .line 45
    .line 46
    goto/16 :goto_d

    .line 47
    .line 48
    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    const/16 v4, 0x8

    .line 53
    .line 54
    const/4 v5, 0x7

    .line 55
    const/4 v6, 0x6

    .line 56
    const/4 v7, 0x5

    .line 57
    const/4 v8, 0x4

    .line 58
    const/4 v9, 0x3

    .line 59
    const/4 v10, 0x2

    .line 60
    const/4 v11, 0x1

    .line 61
    const/4 v12, 0x0

    .line 62
    const/4 v13, -0x1

    .line 63
    sparse-switch v3, :sswitch_data_0

    .line 64
    .line 65
    .line 66
    goto/16 :goto_0

    .line 67
    .line 68
    :sswitch_0
    const-string v3, "iso8601"

    .line 69
    .line 70
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-nez v3, :cond_3

    .line 75
    .line 76
    goto/16 :goto_0

    .line 77
    .line 78
    :cond_3
    move v13, v4

    .line 79
    goto/16 :goto_0

    .line 80
    .line 81
    :sswitch_1
    const-string v3, "yyyy-MM-dd\'T\'HH:mm:ss"

    .line 82
    .line 83
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-nez v3, :cond_4

    .line 88
    .line 89
    goto/16 :goto_0

    .line 90
    .line 91
    :cond_4
    move v13, v5

    .line 92
    goto :goto_0

    .line 93
    :sswitch_2
    const-string v3, "dd.MM.yyyy HH:mm:ss"

    .line 94
    .line 95
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-nez v3, :cond_5

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_5
    move v13, v6

    .line 103
    goto :goto_0

    .line 104
    :sswitch_3
    const-string v3, "yyyy-MM-dd HH:mm:ss"

    .line 105
    .line 106
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-nez v3, :cond_6

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_6
    move v13, v7

    .line 114
    goto :goto_0

    .line 115
    :sswitch_4
    const-string v3, "yyyy/MM/dd HH:mm:ss"

    .line 116
    .line 117
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-nez v3, :cond_7

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_7
    move v13, v8

    .line 125
    goto :goto_0

    .line 126
    :sswitch_5
    const-string v3, "yyyy/MM/dd"

    .line 127
    .line 128
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-nez v3, :cond_8

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_8
    move v13, v9

    .line 136
    goto :goto_0

    .line 137
    :sswitch_6
    const-string v3, "yyyy-MM-dd"

    .line 138
    .line 139
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-nez v3, :cond_9

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_9
    move v13, v10

    .line 147
    goto :goto_0

    .line 148
    :sswitch_7
    const-string v3, "yyyyMMdd"

    .line 149
    .line 150
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    if-nez v3, :cond_a

    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_a
    move v13, v11

    .line 158
    goto :goto_0

    .line 159
    :sswitch_8
    const-string v3, "yyyyMMddHHmmssSSSZ"

    .line 160
    .line 161
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    if-nez v3, :cond_b

    .line 166
    .line 167
    goto :goto_0

    .line 168
    :cond_b
    move v13, v12

    .line 169
    :goto_0
    sget-object v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 170
    .line 171
    packed-switch v13, :pswitch_data_0

    .line 172
    .line 173
    .line 174
    if-nez v2, :cond_c

    .line 175
    .line 176
    move-object v14, v3

    .line 177
    goto :goto_1

    .line 178
    :cond_c
    move-object v14, v2

    .line 179
    :goto_1
    invoke-static {v1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-static {v0, v1}, Ljava/time/LocalDateTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDateTime;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-virtual {v0}, Ljava/time/LocalDateTime;->getYear()I

    .line 188
    .line 189
    .line 190
    move-result v15

    .line 191
    invoke-virtual {v0}, Ljava/time/LocalDateTime;->getMonthValue()I

    .line 192
    .line 193
    .line 194
    move-result v16

    .line 195
    invoke-virtual {v0}, Ljava/time/LocalDateTime;->getDayOfMonth()I

    .line 196
    .line 197
    .line 198
    move-result v17

    .line 199
    invoke-virtual {v0}, Ljava/time/LocalDateTime;->getHour()I

    .line 200
    .line 201
    .line 202
    move-result v18

    .line 203
    invoke-virtual {v0}, Ljava/time/LocalDateTime;->getMinute()I

    .line 204
    .line 205
    .line 206
    move-result v19

    .line 207
    invoke-virtual {v0}, Ljava/time/LocalDateTime;->getSecond()I

    .line 208
    .line 209
    .line 210
    move-result v20

    .line 211
    invoke-virtual {v0}, Ljava/time/LocalDateTime;->getNano()I

    .line 212
    .line 213
    .line 214
    move-result v21

    .line 215
    invoke-static/range {v14 .. v21}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(Ljava/time/ZoneId;IIIIIII)J

    .line 216
    .line 217
    .line 218
    move-result-wide v0

    .line 219
    new-instance v2, Ljava/util/Date;

    .line 220
    .line 221
    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 222
    .line 223
    .line 224
    return-object v2

    .line 225
    :pswitch_0
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)Ljava/util/Date;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    return-object v0

    .line 230
    :pswitch_1
    sget-object v1, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_DASH_T:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 231
    .line 232
    invoke-static {v0, v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏世楪兰哲(Ljava/lang/String;Ljava/time/ZoneId;Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)J

    .line 233
    .line 234
    .line 235
    move-result-wide v0

    .line 236
    new-instance v2, Ljava/util/Date;

    .line 237
    .line 238
    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 239
    .line 240
    .line 241
    return-object v2

    .line 242
    :pswitch_2
    sget-object v1, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_DOT:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 243
    .line 244
    invoke-static {v0, v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏世楪兰哲(Ljava/lang/String;Ljava/time/ZoneId;Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)J

    .line 245
    .line 246
    .line 247
    move-result-wide v0

    .line 248
    new-instance v2, Ljava/util/Date;

    .line 249
    .line 250
    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 251
    .line 252
    .line 253
    return-object v2

    .line 254
    :pswitch_3
    sget v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏:I

    .line 255
    .line 256
    const/16 p1, 0x12

    .line 257
    .line 258
    const/16 v16, 0x11

    .line 259
    .line 260
    const/16 v17, 0x10

    .line 261
    .line 262
    const/16 v18, 0xf

    .line 263
    .line 264
    const-string v13, "illegal input "

    .line 265
    .line 266
    const/16 v19, 0xe

    .line 267
    .line 268
    const/16 v14, 0x13

    .line 269
    .line 270
    const/16 v20, 0xd

    .line 271
    .line 272
    const/16 v21, 0xc

    .line 273
    .line 274
    const/16 v22, 0xb

    .line 275
    .line 276
    const/16 v23, 0x9

    .line 277
    .line 278
    if-ne v1, v4, :cond_e

    .line 279
    .line 280
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)[C

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    const/16 v24, 0xa

    .line 285
    .line 286
    array-length v15, v1

    .line 287
    if-ne v15, v14, :cond_d

    .line 288
    .line 289
    aget-char v13, v1, v12

    .line 290
    .line 291
    aget-char v14, v1, v11

    .line 292
    .line 293
    aget-char v15, v1, v10

    .line 294
    .line 295
    aget-char v9, v1, v9

    .line 296
    .line 297
    aget-char v25, v1, v8

    .line 298
    .line 299
    aget-char v7, v1, v7

    .line 300
    .line 301
    aget-char v26, v1, v6

    .line 302
    .line 303
    aget-char v5, v1, v5

    .line 304
    .line 305
    aget-char v4, v1, v4

    .line 306
    .line 307
    aget-char v27, v1, v23

    .line 308
    .line 309
    aget-char v28, v1, v24

    .line 310
    .line 311
    aget-char v29, v1, v22

    .line 312
    .line 313
    aget-char v30, v1, v21

    .line 314
    .line 315
    aget-char v20, v1, v20

    .line 316
    .line 317
    aget-char v19, v1, v19

    .line 318
    .line 319
    aget-char v18, v1, v18

    .line 320
    .line 321
    aget-char v17, v1, v17

    .line 322
    .line 323
    aget-char v16, v1, v16

    .line 324
    .line 325
    aget-char v1, v1, p1

    .line 326
    .line 327
    move/from16 v8, v17

    .line 328
    .line 329
    move/from16 v2, v26

    .line 330
    .line 331
    move/from16 v0, v27

    .line 332
    .line 333
    move/from16 v10, v28

    .line 334
    .line 335
    move/from16 v6, v29

    .line 336
    .line 337
    move/from16 v11, v30

    .line 338
    .line 339
    move/from16 v17, v1

    .line 340
    .line 341
    move/from16 v1, v20

    .line 342
    .line 343
    move/from16 v20, v19

    .line 344
    .line 345
    move/from16 v19, v18

    .line 346
    .line 347
    move/from16 v18, v16

    .line 348
    .line 349
    move-object/from16 v16, v3

    .line 350
    .line 351
    move/from16 v3, v25

    .line 352
    .line 353
    goto/16 :goto_2

    .line 354
    .line 355
    :cond_d
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 356
    .line 357
    invoke-virtual {v13, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    invoke-direct {v1, v2, v0, v12}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 362
    .line 363
    .line 364
    throw v1

    .line 365
    :cond_e
    const/16 v24, 0xa

    .line 366
    .line 367
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏世哲:Ljava/util/function/ToIntFunction;

    .line 368
    .line 369
    if-eqz v1, :cond_10

    .line 370
    .line 371
    invoke-interface {v1, v0}, Ljava/util/function/ToIntFunction;->applyAsInt(Ljava/lang/Object;)I

    .line 372
    .line 373
    .line 374
    move-result v1

    .line 375
    if-nez v1, :cond_10

    .line 376
    .line 377
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏哲世:Ljava/util/function/Function;

    .line 378
    .line 379
    if-eqz v1, :cond_10

    .line 380
    .line 381
    invoke-interface {v1, v0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    check-cast v1, [B

    .line 386
    .line 387
    array-length v15, v1

    .line 388
    if-ne v15, v14, :cond_f

    .line 389
    .line 390
    aget-byte v13, v1, v12

    .line 391
    .line 392
    int-to-char v13, v13

    .line 393
    aget-byte v14, v1, v11

    .line 394
    .line 395
    int-to-char v14, v14

    .line 396
    aget-byte v15, v1, v10

    .line 397
    .line 398
    int-to-char v15, v15

    .line 399
    aget-byte v9, v1, v9

    .line 400
    .line 401
    int-to-char v9, v9

    .line 402
    move/from16 v25, v4

    .line 403
    .line 404
    aget-byte v4, v1, v8

    .line 405
    .line 406
    int-to-char v4, v4

    .line 407
    aget-byte v7, v1, v7

    .line 408
    .line 409
    int-to-char v7, v7

    .line 410
    move/from16 v26, v5

    .line 411
    .line 412
    aget-byte v5, v1, v6

    .line 413
    .line 414
    int-to-char v5, v5

    .line 415
    aget-byte v6, v1, v26

    .line 416
    .line 417
    int-to-char v6, v6

    .line 418
    aget-byte v8, v1, v25

    .line 419
    .line 420
    int-to-char v8, v8

    .line 421
    aget-byte v10, v1, v23

    .line 422
    .line 423
    int-to-char v10, v10

    .line 424
    aget-byte v11, v1, v24

    .line 425
    .line 426
    int-to-char v11, v11

    .line 427
    aget-byte v12, v1, v22

    .line 428
    .line 429
    int-to-char v12, v12

    .line 430
    move-object/from16 v31, v1

    .line 431
    .line 432
    aget-byte v1, v31, v21

    .line 433
    .line 434
    int-to-char v1, v1

    .line 435
    move/from16 v25, v1

    .line 436
    .line 437
    aget-byte v1, v31, v20

    .line 438
    .line 439
    int-to-char v1, v1

    .line 440
    move/from16 v20, v1

    .line 441
    .line 442
    aget-byte v1, v31, v19

    .line 443
    .line 444
    int-to-char v1, v1

    .line 445
    move/from16 v19, v1

    .line 446
    .line 447
    aget-byte v1, v31, v18

    .line 448
    .line 449
    int-to-char v1, v1

    .line 450
    move/from16 v18, v1

    .line 451
    .line 452
    aget-byte v1, v31, v17

    .line 453
    .line 454
    int-to-char v1, v1

    .line 455
    move/from16 v17, v1

    .line 456
    .line 457
    aget-byte v1, v31, v16

    .line 458
    .line 459
    int-to-char v1, v1

    .line 460
    move/from16 v16, v1

    .line 461
    .line 462
    aget-byte v1, v31, p1

    .line 463
    .line 464
    int-to-char v1, v1

    .line 465
    move/from16 v0, v17

    .line 466
    .line 467
    move/from16 v17, v1

    .line 468
    .line 469
    move/from16 v1, v20

    .line 470
    .line 471
    move/from16 v20, v19

    .line 472
    .line 473
    move/from16 v19, v18

    .line 474
    .line 475
    move/from16 v18, v16

    .line 476
    .line 477
    move-object/from16 v16, v3

    .line 478
    .line 479
    move v3, v4

    .line 480
    move v4, v8

    .line 481
    move v8, v0

    .line 482
    move v2, v5

    .line 483
    move v5, v6

    .line 484
    move v0, v10

    .line 485
    move v10, v11

    .line 486
    move v6, v12

    .line 487
    move/from16 v11, v25

    .line 488
    .line 489
    goto/16 :goto_2

    .line 490
    .line 491
    :cond_f
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 492
    .line 493
    invoke-virtual {v13, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v2

    .line 497
    const/4 v4, 0x0

    .line 498
    invoke-direct {v1, v2, v0, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 499
    .line 500
    .line 501
    throw v1

    .line 502
    :cond_10
    move/from16 v25, v4

    .line 503
    .line 504
    move/from16 v26, v5

    .line 505
    .line 506
    move v4, v12

    .line 507
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 508
    .line 509
    .line 510
    move-result v1

    .line 511
    if-ne v1, v14, :cond_27

    .line 512
    .line 513
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 514
    .line 515
    .line 516
    move-result v13

    .line 517
    const/4 v1, 0x1

    .line 518
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 519
    .line 520
    .line 521
    move-result v14

    .line 522
    const/4 v4, 0x2

    .line 523
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 524
    .line 525
    .line 526
    move-result v15

    .line 527
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 528
    .line 529
    .line 530
    move-result v9

    .line 531
    const/4 v4, 0x4

    .line 532
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 533
    .line 534
    .line 535
    move-result v5

    .line 536
    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    .line 537
    .line 538
    .line 539
    move-result v7

    .line 540
    const/4 v4, 0x6

    .line 541
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 542
    .line 543
    .line 544
    move-result v6

    .line 545
    move/from16 v4, v26

    .line 546
    .line 547
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 548
    .line 549
    .line 550
    move-result v4

    .line 551
    move/from16 v8, v25

    .line 552
    .line 553
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 554
    .line 555
    .line 556
    move-result v8

    .line 557
    move/from16 v10, v23

    .line 558
    .line 559
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    .line 560
    .line 561
    .line 562
    move-result v11

    .line 563
    move/from16 v10, v24

    .line 564
    .line 565
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    .line 566
    .line 567
    .line 568
    move-result v12

    .line 569
    move/from16 v10, v22

    .line 570
    .line 571
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    .line 572
    .line 573
    .line 574
    move-result v25

    .line 575
    move/from16 v10, v21

    .line 576
    .line 577
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    .line 578
    .line 579
    .line 580
    move-result v30

    .line 581
    move/from16 v10, v20

    .line 582
    .line 583
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    .line 584
    .line 585
    .line 586
    move-result v20

    .line 587
    move/from16 v10, v19

    .line 588
    .line 589
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    .line 590
    .line 591
    .line 592
    move-result v19

    .line 593
    move/from16 v10, v18

    .line 594
    .line 595
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    .line 596
    .line 597
    .line 598
    move-result v18

    .line 599
    move/from16 v10, v17

    .line 600
    .line 601
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    .line 602
    .line 603
    .line 604
    move-result v17

    .line 605
    move/from16 v10, v16

    .line 606
    .line 607
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    .line 608
    .line 609
    .line 610
    move-result v16

    .line 611
    move/from16 v10, p1

    .line 612
    .line 613
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    .line 614
    .line 615
    .line 616
    move-result v10

    .line 617
    move v2, v6

    .line 618
    move v0, v11

    .line 619
    move/from16 v1, v20

    .line 620
    .line 621
    move/from16 v6, v25

    .line 622
    .line 623
    move/from16 v11, v30

    .line 624
    .line 625
    move/from16 v20, v19

    .line 626
    .line 627
    move/from16 v19, v18

    .line 628
    .line 629
    move/from16 v18, v16

    .line 630
    .line 631
    move-object/from16 v16, v3

    .line 632
    .line 633
    move v3, v5

    .line 634
    move v5, v4

    .line 635
    move v4, v8

    .line 636
    move/from16 v8, v17

    .line 637
    .line 638
    move/from16 v17, v10

    .line 639
    .line 640
    move v10, v12

    .line 641
    :goto_2
    const/16 v12, 0x2d

    .line 642
    .line 643
    move/from16 v25, v11

    .line 644
    .line 645
    const-string v11, "illegal input"

    .line 646
    .line 647
    if-ne v3, v12, :cond_26

    .line 648
    .line 649
    if-ne v5, v12, :cond_26

    .line 650
    .line 651
    const/16 v3, 0x20

    .line 652
    .line 653
    if-ne v10, v3, :cond_26

    .line 654
    .line 655
    const/16 v3, 0x3a

    .line 656
    .line 657
    if-ne v1, v3, :cond_26

    .line 658
    .line 659
    if-ne v8, v3, :cond_26

    .line 660
    .line 661
    const/16 v1, 0x30

    .line 662
    .line 663
    if-lt v13, v1, :cond_25

    .line 664
    .line 665
    const/16 v3, 0x39

    .line 666
    .line 667
    if-gt v13, v3, :cond_25

    .line 668
    .line 669
    if-lt v14, v1, :cond_25

    .line 670
    .line 671
    if-gt v14, v3, :cond_25

    .line 672
    .line 673
    if-lt v15, v1, :cond_25

    .line 674
    .line 675
    if-gt v15, v3, :cond_25

    .line 676
    .line 677
    if-lt v9, v1, :cond_25

    .line 678
    .line 679
    if-gt v9, v3, :cond_25

    .line 680
    .line 681
    sub-int/2addr v13, v1

    .line 682
    mul-int/lit16 v13, v13, 0x3e8

    .line 683
    .line 684
    const/16 v5, 0x64

    .line 685
    .line 686
    invoke-static {v14, v1, v5, v13}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(IIII)I

    .line 687
    .line 688
    .line 689
    move-result v5

    .line 690
    const/16 v10, 0xa

    .line 691
    .line 692
    invoke-static {v15, v1, v10, v5}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(IIII)I

    .line 693
    .line 694
    .line 695
    move-result v5

    .line 696
    sub-int/2addr v9, v1

    .line 697
    add-int/2addr v9, v5

    .line 698
    if-lt v7, v1, :cond_24

    .line 699
    .line 700
    if-gt v7, v3, :cond_24

    .line 701
    .line 702
    if-lt v2, v1, :cond_24

    .line 703
    .line 704
    if-gt v2, v3, :cond_24

    .line 705
    .line 706
    sub-int/2addr v7, v1

    .line 707
    mul-int/2addr v7, v10

    .line 708
    sub-int/2addr v2, v1

    .line 709
    add-int/2addr v2, v7

    .line 710
    if-nez v2, :cond_11

    .line 711
    .line 712
    if-nez v9, :cond_12

    .line 713
    .line 714
    :cond_11
    const/16 v10, 0xc

    .line 715
    .line 716
    goto :goto_3

    .line 717
    :cond_12
    const/4 v4, 0x0

    .line 718
    move-object/from16 v2, p0

    .line 719
    .line 720
    goto/16 :goto_c

    .line 721
    .line 722
    :goto_3
    if-gt v2, v10, :cond_12

    .line 723
    .line 724
    if-lt v4, v1, :cond_23

    .line 725
    .line 726
    if-gt v4, v3, :cond_23

    .line 727
    .line 728
    if-lt v0, v1, :cond_23

    .line 729
    .line 730
    if-gt v0, v3, :cond_23

    .line 731
    .line 732
    sub-int/2addr v4, v1

    .line 733
    const/16 v24, 0xa

    .line 734
    .line 735
    mul-int/lit8 v4, v4, 0xa

    .line 736
    .line 737
    sub-int/2addr v0, v1

    .line 738
    add-int/2addr v0, v4

    .line 739
    const/4 v4, 0x2

    .line 740
    if-eq v2, v4, :cond_14

    .line 741
    .line 742
    const/4 v4, 0x4

    .line 743
    if-eq v2, v4, :cond_13

    .line 744
    .line 745
    const/4 v4, 0x6

    .line 746
    if-eq v2, v4, :cond_13

    .line 747
    .line 748
    const/16 v10, 0x9

    .line 749
    .line 750
    if-eq v2, v10, :cond_13

    .line 751
    .line 752
    const/16 v10, 0xb

    .line 753
    .line 754
    if-eq v2, v10, :cond_13

    .line 755
    .line 756
    const/16 v4, 0x1f

    .line 757
    .line 758
    goto :goto_4

    .line 759
    :cond_13
    const/16 v4, 0x1e

    .line 760
    .line 761
    goto :goto_4

    .line 762
    :cond_14
    and-int/lit8 v4, v9, 0x3

    .line 763
    .line 764
    if-nez v4, :cond_16

    .line 765
    .line 766
    rem-int/lit8 v4, v9, 0x64

    .line 767
    .line 768
    if-nez v4, :cond_15

    .line 769
    .line 770
    rem-int/lit16 v4, v9, 0x190

    .line 771
    .line 772
    if-nez v4, :cond_16

    .line 773
    .line 774
    :cond_15
    const/16 v4, 0x1d

    .line 775
    .line 776
    goto :goto_4

    .line 777
    :cond_16
    const/16 v4, 0x1c

    .line 778
    .line 779
    :goto_4
    if-nez v0, :cond_18

    .line 780
    .line 781
    if-nez v9, :cond_17

    .line 782
    .line 783
    goto :goto_5

    .line 784
    :cond_17
    const/4 v4, 0x0

    .line 785
    move-object/from16 v2, p0

    .line 786
    .line 787
    goto/16 :goto_b

    .line 788
    .line 789
    :cond_18
    :goto_5
    if-gt v0, v4, :cond_17

    .line 790
    .line 791
    if-lt v6, v1, :cond_22

    .line 792
    .line 793
    if-gt v6, v3, :cond_22

    .line 794
    .line 795
    move/from16 v4, v25

    .line 796
    .line 797
    if-lt v4, v1, :cond_22

    .line 798
    .line 799
    if-gt v4, v3, :cond_22

    .line 800
    .line 801
    sub-int/2addr v6, v1

    .line 802
    const/16 v24, 0xa

    .line 803
    .line 804
    mul-int/lit8 v6, v6, 0xa

    .line 805
    .line 806
    sub-int/2addr v4, v1

    .line 807
    add-int/2addr v4, v6

    .line 808
    move/from16 v5, v20

    .line 809
    .line 810
    if-lt v5, v1, :cond_21

    .line 811
    .line 812
    if-gt v5, v3, :cond_21

    .line 813
    .line 814
    move/from16 v6, v19

    .line 815
    .line 816
    if-lt v6, v1, :cond_21

    .line 817
    .line 818
    if-gt v6, v3, :cond_21

    .line 819
    .line 820
    add-int/lit8 v20, v5, -0x30

    .line 821
    .line 822
    mul-int/lit8 v20, v20, 0xa

    .line 823
    .line 824
    add-int/lit8 v19, v6, -0x30

    .line 825
    .line 826
    add-int v5, v19, v20

    .line 827
    .line 828
    move/from16 v6, v18

    .line 829
    .line 830
    if-lt v6, v1, :cond_20

    .line 831
    .line 832
    if-gt v6, v3, :cond_20

    .line 833
    .line 834
    move/from16 v10, v17

    .line 835
    .line 836
    if-lt v10, v1, :cond_20

    .line 837
    .line 838
    if-gt v10, v3, :cond_20

    .line 839
    .line 840
    add-int/lit8 v18, v6, -0x30

    .line 841
    .line 842
    mul-int/lit8 v18, v18, 0xa

    .line 843
    .line 844
    add-int/lit8 v17, v10, -0x30

    .line 845
    .line 846
    add-int v1, v17, v18

    .line 847
    .line 848
    if-nez v9, :cond_19

    .line 849
    .line 850
    if-nez v2, :cond_19

    .line 851
    .line 852
    if-nez v0, :cond_19

    .line 853
    .line 854
    const/16 v9, 0x7b2

    .line 855
    .line 856
    const/4 v0, 0x1

    .line 857
    const/4 v2, 0x1

    .line 858
    :cond_19
    invoke-static {v9, v2, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(III)J

    .line 859
    .line 860
    .line 861
    move-result-wide v6

    .line 862
    const-wide/32 v10, 0x15180

    .line 863
    .line 864
    .line 865
    mul-long/2addr v6, v10

    .line 866
    mul-int/lit16 v3, v4, 0xe10

    .line 867
    .line 868
    int-to-long v10, v3

    .line 869
    add-long/2addr v6, v10

    .line 870
    mul-int/lit8 v3, v5, 0x3c

    .line 871
    .line 872
    int-to-long v10, v3

    .line 873
    add-long/2addr v6, v10

    .line 874
    int-to-long v10, v1

    .line 875
    add-long/2addr v6, v10

    .line 876
    if-nez p2, :cond_1a

    .line 877
    .line 878
    move-object/from16 v3, v16

    .line 879
    .line 880
    goto :goto_6

    .line 881
    :cond_1a
    move-object/from16 v3, p2

    .line 882
    .line 883
    :goto_6
    sget-object v8, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Ljava/time/ZoneId;

    .line 884
    .line 885
    if-eq v3, v8, :cond_1c

    .line 886
    .line 887
    invoke-virtual {v3}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 888
    .line 889
    .line 890
    move-result-object v8

    .line 891
    sget-object v10, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰:Ljava/time/zone/ZoneRules;

    .line 892
    .line 893
    if-ne v8, v10, :cond_1b

    .line 894
    .line 895
    goto :goto_7

    .line 896
    :cond_1b
    const/4 v11, 0x0

    .line 897
    goto :goto_8

    .line 898
    :cond_1c
    :goto_7
    const/4 v11, 0x1

    .line 899
    :goto_8
    if-eqz v11, :cond_1d

    .line 900
    .line 901
    const-wide/32 v10, 0x28d2bea0

    .line 902
    .line 903
    .line 904
    cmp-long v8, v6, v10

    .line 905
    .line 906
    if-ltz v8, :cond_1d

    .line 907
    .line 908
    const/16 v12, 0x7080

    .line 909
    .line 910
    goto :goto_a

    .line 911
    :cond_1d
    sget-object v8, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 912
    .line 913
    if-eq v3, v8, :cond_1f

    .line 914
    .line 915
    const-string v8, "UTC"

    .line 916
    .line 917
    invoke-virtual {v3}, Ljava/time/ZoneId;->getId()Ljava/lang/String;

    .line 918
    .line 919
    .line 920
    move-result-object v10

    .line 921
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 922
    .line 923
    .line 924
    move-result v8

    .line 925
    if-eqz v8, :cond_1e

    .line 926
    .line 927
    goto :goto_9

    .line 928
    :cond_1e
    invoke-static {v9, v2, v0}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 929
    .line 930
    .line 931
    move-result-object v0

    .line 932
    const/4 v2, 0x0

    .line 933
    invoke-static {v4, v5, v1, v2}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 934
    .line 935
    .line 936
    move-result-object v1

    .line 937
    invoke-static {v0, v1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 938
    .line 939
    .line 940
    move-result-object v0

    .line 941
    invoke-virtual {v3}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 942
    .line 943
    .line 944
    move-result-object v1

    .line 945
    invoke-virtual {v1, v0}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/LocalDateTime;)Ljava/time/ZoneOffset;

    .line 946
    .line 947
    .line 948
    move-result-object v0

    .line 949
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 950
    .line 951
    .line 952
    move-result v12

    .line 953
    goto :goto_a

    .line 954
    :cond_1f
    :goto_9
    const/4 v12, 0x0

    .line 955
    :goto_a
    int-to-long v0, v12

    .line 956
    sub-long/2addr v6, v0

    .line 957
    const-wide/16 v0, 0x3e8

    .line 958
    .line 959
    mul-long/2addr v6, v0

    .line 960
    new-instance v0, Ljava/util/Date;

    .line 961
    .line 962
    invoke-direct {v0, v6, v7}, Ljava/util/Date;-><init>(J)V

    .line 963
    .line 964
    .line 965
    return-object v0

    .line 966
    :cond_20
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 967
    .line 968
    const/4 v4, 0x0

    .line 969
    move-object/from16 v2, p0

    .line 970
    .line 971
    invoke-direct {v0, v11, v2, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 972
    .line 973
    .line 974
    throw v0

    .line 975
    :cond_21
    const/4 v4, 0x0

    .line 976
    move-object/from16 v2, p0

    .line 977
    .line 978
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 979
    .line 980
    invoke-direct {v0, v11, v2, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 981
    .line 982
    .line 983
    throw v0

    .line 984
    :cond_22
    const/4 v4, 0x0

    .line 985
    move-object/from16 v2, p0

    .line 986
    .line 987
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 988
    .line 989
    invoke-direct {v0, v11, v2, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 990
    .line 991
    .line 992
    throw v0

    .line 993
    :goto_b
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 994
    .line 995
    invoke-direct {v0, v11, v2, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 996
    .line 997
    .line 998
    throw v0

    .line 999
    :cond_23
    const/4 v4, 0x0

    .line 1000
    move-object/from16 v2, p0

    .line 1001
    .line 1002
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 1003
    .line 1004
    invoke-direct {v0, v11, v2, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 1005
    .line 1006
    .line 1007
    throw v0

    .line 1008
    :goto_c
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 1009
    .line 1010
    invoke-direct {v0, v11, v2, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 1011
    .line 1012
    .line 1013
    throw v0

    .line 1014
    :cond_24
    const/4 v4, 0x0

    .line 1015
    move-object/from16 v2, p0

    .line 1016
    .line 1017
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 1018
    .line 1019
    invoke-direct {v0, v11, v2, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 1020
    .line 1021
    .line 1022
    throw v0

    .line 1023
    :cond_25
    const/4 v4, 0x0

    .line 1024
    move-object/from16 v2, p0

    .line 1025
    .line 1026
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 1027
    .line 1028
    invoke-direct {v0, v11, v2, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 1029
    .line 1030
    .line 1031
    throw v0

    .line 1032
    :cond_26
    const/4 v4, 0x0

    .line 1033
    move-object/from16 v2, p0

    .line 1034
    .line 1035
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 1036
    .line 1037
    invoke-direct {v0, v11, v2, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 1038
    .line 1039
    .line 1040
    throw v0

    .line 1041
    :cond_27
    move-object v2, v0

    .line 1042
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 1043
    .line 1044
    invoke-virtual {v13, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v1

    .line 1048
    invoke-direct {v0, v1, v2, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 1049
    .line 1050
    .line 1051
    throw v0

    .line 1052
    :pswitch_4
    move-object v2, v0

    .line 1053
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_SLASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 1054
    .line 1055
    move-object/from16 v3, p2

    .line 1056
    .line 1057
    invoke-static {v2, v3, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏世楪兰哲(Ljava/lang/String;Ljava/time/ZoneId;Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)J

    .line 1058
    .line 1059
    .line 1060
    move-result-wide v0

    .line 1061
    new-instance v2, Ljava/util/Date;

    .line 1062
    .line 1063
    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 1064
    .line 1065
    .line 1066
    return-object v2

    .line 1067
    :pswitch_5
    move-object v3, v2

    .line 1068
    move-object v2, v0

    .line 1069
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_SLASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 1070
    .line 1071
    invoke-static {v2, v3, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;Ljava/time/ZoneId;Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)J

    .line 1072
    .line 1073
    .line 1074
    move-result-wide v0

    .line 1075
    new-instance v2, Ljava/util/Date;

    .line 1076
    .line 1077
    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 1078
    .line 1079
    .line 1080
    return-object v2

    .line 1081
    :pswitch_6
    move-object v3, v2

    .line 1082
    move-object v2, v0

    .line 1083
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_DASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 1084
    .line 1085
    invoke-static {v2, v3, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;Ljava/time/ZoneId;Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)J

    .line 1086
    .line 1087
    .line 1088
    move-result-wide v0

    .line 1089
    new-instance v2, Ljava/util/Date;

    .line 1090
    .line 1091
    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 1092
    .line 1093
    .line 1094
    return-object v2

    .line 1095
    :pswitch_7
    move-object v3, v2

    .line 1096
    move-object v2, v0

    .line 1097
    invoke-static {v1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v0

    .line 1101
    invoke-static {v2, v0}, Ljava/time/LocalDate;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDate;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v0

    .line 1105
    invoke-virtual {v0}, Ljava/time/LocalDate;->getYear()I

    .line 1106
    .line 1107
    .line 1108
    move-result v1

    .line 1109
    invoke-virtual {v0}, Ljava/time/LocalDate;->getMonthValue()I

    .line 1110
    .line 1111
    .line 1112
    move-result v2

    .line 1113
    invoke-virtual {v0}, Ljava/time/LocalDate;->getDayOfMonth()I

    .line 1114
    .line 1115
    .line 1116
    move-result v0

    .line 1117
    const/4 v6, 0x0

    .line 1118
    const/4 v7, 0x0

    .line 1119
    const/4 v4, 0x0

    .line 1120
    const/4 v5, 0x0

    .line 1121
    move-object/from16 v32, v3

    .line 1122
    .line 1123
    move v3, v0

    .line 1124
    move-object/from16 v0, v32

    .line 1125
    .line 1126
    invoke-static/range {v0 .. v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(Ljava/time/ZoneId;IIIIIII)J

    .line 1127
    .line 1128
    .line 1129
    move-result-wide v0

    .line 1130
    new-instance v2, Ljava/util/Date;

    .line 1131
    .line 1132
    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 1133
    .line 1134
    .line 1135
    return-object v2

    .line 1136
    :pswitch_8
    move-object v2, v0

    .line 1137
    move-object v0, v3

    .line 1138
    invoke-static {v2, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏楪兰哲世(Ljava/lang/String;Ljava/time/ZoneId;)J

    .line 1139
    .line 1140
    .line 1141
    move-result-wide v0

    .line 1142
    new-instance v2, Ljava/util/Date;

    .line 1143
    .line 1144
    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 1145
    .line 1146
    .line 1147
    return-object v2

    .line 1148
    :goto_d
    invoke-static {v2, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏楪兰哲世(Ljava/lang/String;Ljava/time/ZoneId;)J

    .line 1149
    .line 1150
    .line 1151
    move-result-wide v0

    .line 1152
    const-wide/16 v2, 0x0

    .line 1153
    .line 1154
    cmp-long v2, v0, v2

    .line 1155
    .line 1156
    if-nez v2, :cond_28

    .line 1157
    .line 1158
    goto :goto_e

    .line 1159
    :cond_28
    new-instance v2, Ljava/util/Date;

    .line 1160
    .line 1161
    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 1162
    .line 1163
    .line 1164
    return-object v2

    .line 1165
    :cond_29
    :goto_e
    const/4 v0, 0x0

    .line 1166
    return-object v0

    .line 1167
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

    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
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

.method public static 飘花落叶言子楪哲苏兰世(Ljava/lang/String;)Ljava/time/LocalDate;
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏世哲:Ljava/util/function/ToIntFunction;

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/16 v4, 0x75

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/16 v6, 0x6e

    .line 13
    .line 14
    const/4 v7, 0x4

    .line 15
    const-string v8, "illegal input "

    .line 16
    .line 17
    const/16 v9, 0x6c

    .line 18
    .line 19
    const/4 v10, 0x0

    .line 20
    if-eqz v1, :cond_4

    .line 21
    .line 22
    sget-object v11, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏哲世:Ljava/util/function/Function;

    .line 23
    .line 24
    if-eqz v11, :cond_4

    .line 25
    .line 26
    invoke-interface {v1, p0}, Ljava/util/function/ToIntFunction;->applyAsInt(Ljava/lang/Object;)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_4

    .line 31
    .line 32
    invoke-interface {v11, p0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, [B

    .line 37
    .line 38
    array-length v11, v1

    .line 39
    if-nez v11, :cond_1

    .line 40
    .line 41
    :goto_0
    move-object v1, v0

    .line 42
    goto/16 :goto_1

    .line 43
    .line 44
    :cond_1
    array-length v12, v1

    .line 45
    if-gt v11, v12, :cond_3

    .line 46
    .line 47
    packed-switch v11, :pswitch_data_0

    .line 48
    .line 49
    .line 50
    if-ne v11, v7, :cond_2

    .line 51
    .line 52
    aget-byte v12, v1, v10

    .line 53
    .line 54
    if-ne v12, v6, :cond_2

    .line 55
    .line 56
    aget-byte v6, v1, v5

    .line 57
    .line 58
    if-ne v6, v4, :cond_2

    .line 59
    .line 60
    aget-byte v4, v1, v3

    .line 61
    .line 62
    if-ne v4, v9, :cond_2

    .line 63
    .line 64
    aget-byte v4, v1, v2

    .line 65
    .line 66
    if-ne v4, v9, :cond_2

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    new-instance p0, Ljava/lang/String;

    .line 70
    .line 71
    invoke-direct {p0, v1, v10, v11}, Ljava/lang/String;-><init>([BII)V

    .line 72
    .line 73
    .line 74
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 75
    .line 76
    invoke-virtual {v8, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-direct {v0, v1, p0, v10}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 81
    .line 82
    .line 83
    throw v0

    .line 84
    :pswitch_0
    invoke-static {v1, v10}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世哲苏([BI)Ljava/time/LocalDate;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    goto :goto_1

    .line 89
    :pswitch_1
    invoke-static {v1, v10}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰苏世([BI)Ljava/time/LocalDate;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    goto :goto_1

    .line 94
    :pswitch_2
    invoke-static {v1, v10}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰哲苏世([BI)Ljava/time/LocalDate;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    goto :goto_1

    .line 99
    :pswitch_3
    invoke-static {v1, v10}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰苏哲世([BI)Ljava/time/LocalDate;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    goto :goto_1

    .line 104
    :cond_3
    new-instance p0, Ljava/lang/String;

    .line 105
    .line 106
    invoke-direct {p0, v1, v10, v11}, Ljava/lang/String;-><init>([BII)V

    .line 107
    .line 108
    .line 109
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 110
    .line 111
    invoke-virtual {v8, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-direct {v0, v1, p0, v10}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 116
    .line 117
    .line 118
    throw v0

    .line 119
    :cond_4
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)[C

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    array-length v11, v1

    .line 124
    if-nez v11, :cond_5

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_5
    array-length v12, v1

    .line 128
    if-gt v11, v12, :cond_e

    .line 129
    .line 130
    packed-switch v11, :pswitch_data_1

    .line 131
    .line 132
    .line 133
    if-ne v11, v7, :cond_6

    .line 134
    .line 135
    aget-char v12, v1, v10

    .line 136
    .line 137
    if-ne v12, v6, :cond_6

    .line 138
    .line 139
    aget-char v6, v1, v5

    .line 140
    .line 141
    if-ne v6, v4, :cond_6

    .line 142
    .line 143
    aget-char v4, v1, v3

    .line 144
    .line 145
    if-ne v4, v9, :cond_6

    .line 146
    .line 147
    aget-char v4, v1, v2

    .line 148
    .line 149
    if-ne v4, v9, :cond_6

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_6
    new-instance p0, Ljava/lang/String;

    .line 153
    .line 154
    invoke-direct {p0, v1, v10, v11}, Ljava/lang/String;-><init>([CII)V

    .line 155
    .line 156
    .line 157
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 158
    .line 159
    invoke-virtual {v8, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-direct {v0, v1, p0, v10}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 164
    .line 165
    .line 166
    throw v0

    .line 167
    :pswitch_4
    invoke-static {v10, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世苏哲(I[C)Ljava/time/LocalDate;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    goto :goto_1

    .line 172
    :pswitch_5
    invoke-static {v10, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏(I[C)Ljava/time/LocalDate;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    goto :goto_1

    .line 177
    :pswitch_6
    invoke-static {v10, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰哲世苏(I[C)Ljava/time/LocalDate;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    goto :goto_1

    .line 182
    :pswitch_7
    invoke-static {v10, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰苏世哲(I[C)Ljava/time/LocalDate;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    :goto_1
    if-nez v1, :cond_d

    .line 187
    .line 188
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    const/4 v4, -0x1

    .line 193
    sparse-switch v1, :sswitch_data_0

    .line 194
    .line 195
    .line 196
    :goto_2
    move v2, v4

    .line 197
    goto :goto_3

    .line 198
    :sswitch_0
    const-string v1, "0000-00-00"

    .line 199
    .line 200
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    if-nez v1, :cond_7

    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_7
    const/4 v2, 0x5

    .line 208
    goto :goto_3

    .line 209
    :sswitch_1
    const-string v1, "0000\u5e7400\u670800\u65e5"

    .line 210
    .line 211
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    if-nez v1, :cond_8

    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_8
    move v2, v7

    .line 219
    goto :goto_3

    .line 220
    :sswitch_2
    const-string v1, "null"

    .line 221
    .line 222
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    if-nez v1, :cond_c

    .line 227
    .line 228
    goto :goto_2

    .line 229
    :sswitch_3
    const-string v1, ""

    .line 230
    .line 231
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    if-nez v1, :cond_9

    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_9
    move v2, v3

    .line 239
    goto :goto_3

    .line 240
    :sswitch_4
    const-string v1, "00000000"

    .line 241
    .line 242
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    if-nez v1, :cond_a

    .line 247
    .line 248
    goto :goto_2

    .line 249
    :cond_a
    move v2, v5

    .line 250
    goto :goto_3

    .line 251
    :sswitch_5
    const-string v1, "0000-0-00"

    .line 252
    .line 253
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    if-nez v1, :cond_b

    .line 258
    .line 259
    goto :goto_2

    .line 260
    :cond_b
    move v2, v10

    .line 261
    :cond_c
    :goto_3
    packed-switch v2, :pswitch_data_2

    .line 262
    .line 263
    .line 264
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 265
    .line 266
    invoke-direct {v0, p0, p0, v10}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 267
    .line 268
    .line 269
    throw v0

    .line 270
    :pswitch_8
    return-object v0

    .line 271
    :cond_d
    return-object v1

    .line 272
    :cond_e
    new-instance p0, Ljava/lang/String;

    .line 273
    .line 274
    invoke-direct {p0, v1, v10, v11}, Ljava/lang/String;-><init>([CII)V

    .line 275
    .line 276
    .line 277
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 278
    .line 279
    invoke-virtual {v8, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    invoke-direct {v0, v1, p0, v10}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 284
    .line 285
    .line 286
    throw v0

    .line 287
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    :pswitch_data_1
    .packed-switch 0x8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    :sswitch_data_0
    .sparse-switch
        -0x794e6996 -> :sswitch_5
        -0x45f8e800 -> :sswitch_4
        0x0 -> :sswitch_3
        0x33c587 -> :sswitch_2
        0x52cad51 -> :sswitch_1
        0x4f8288e0 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
    .end packed-switch
.end method

.method public static 飘花落叶言子楪苏世兰哲(CC)I
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

.method public static 飘花落叶言子楪苏世哲兰([BI)J
    .locals 6

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲:J

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
    sget-boolean v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰苏世:Z

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

.method public static 飘花落叶言子楪苏兰世哲(Ljava/time/ZoneId;IIIIIII)J
    .locals 6

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 4
    .line 5
    :cond_0
    invoke-static {p1, p2, p3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(III)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    const-wide/32 v2, 0x15180

    .line 10
    .line 11
    .line 12
    mul-long/2addr v0, v2

    .line 13
    mul-int/lit16 v2, p4, 0xe10

    .line 14
    .line 15
    int-to-long v2, v2

    .line 16
    add-long/2addr v0, v2

    .line 17
    mul-int/lit8 v2, p5, 0x3c

    .line 18
    .line 19
    int-to-long v2, v2

    .line 20
    add-long/2addr v0, v2

    .line 21
    int-to-long v2, p6

    .line 22
    add-long/2addr v0, v2

    .line 23
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Ljava/time/ZoneId;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    if-eq p0, v2, :cond_2

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰:Ljava/time/zone/ZoneRules;

    .line 33
    .line 34
    if-ne v2, v4, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move v2, v3

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    :goto_0
    const/4 v2, 0x1

    .line 40
    :goto_1
    if-eqz v2, :cond_3

    .line 41
    .line 42
    const-wide/32 v4, 0x28d2bea0

    .line 43
    .line 44
    .line 45
    cmp-long v2, v0, v4

    .line 46
    .line 47
    if-ltz v2, :cond_3

    .line 48
    .line 49
    const/16 v3, 0x7080

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_3
    sget-object v2, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 53
    .line 54
    if-eq p0, v2, :cond_5

    .line 55
    .line 56
    const-string v2, "UTC"

    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/time/ZoneId;->getId()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_4

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_4
    invoke-static {p1, p2, p3}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-static {p4, p5, p6, p7}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-static {p1, p2}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p0}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p0, p1}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/LocalDateTime;)Ljava/time/ZoneOffset;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-virtual {p0}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    :cond_5
    :goto_2
    int-to-long p0, v3

    .line 94
    sub-long/2addr v0, p0

    .line 95
    const-wide/16 p0, 0x3e8

    .line 96
    .line 97
    mul-long/2addr v0, p0

    .line 98
    if-eqz p7, :cond_6

    .line 99
    .line 100
    const p0, 0xf4240

    .line 101
    .line 102
    .line 103
    div-int/2addr p7, p0

    .line 104
    int-to-long p0, p7

    .line 105
    add-long/2addr v0, p0

    .line 106
    :cond_6
    return-wide v0
.end method

.method public static 飘花落叶言子楪苏兰哲世(BBB)I
    .locals 0

    .line 1
    int-to-char p0, p0

    .line 2
    int-to-char p1, p1

    .line 3
    int-to-char p2, p2

    .line 4
    invoke-static {p0, p1, p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    return p0
.end method

.method public static 飘花落叶言子楪苏哲世兰(CCCCCCCCCCCCCCCCCCCCCCC)Ljava/time/LocalDateTime;
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
    invoke-static {v1, v15, v14, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(IIII)I

    move-result v0

    const/16 v1, 0xa

    invoke-static {v2, v15, v1, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(IIII)I

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
    invoke-static {v9, v15, v3, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(IIII)I

    move-result v0

    const v3, 0xf4240

    invoke-static {v10, v15, v3, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(IIII)I

    move-result v0

    const v3, 0x186a0

    invoke-static {v11, v15, v3, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(IIII)I

    move-result v0

    const/16 v3, 0x2710

    invoke-static {v12, v15, v3, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(IIII)I

    move-result v0

    const/16 v3, 0x3e8

    invoke-static {v13, v15, v3, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(IIII)I

    move-result v0

    const/16 v3, 0x64

    invoke-static {v1, v15, v3, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(IIII)I

    move-result v0

    const/16 v1, 0xa

    invoke-static {v14, v15, v1, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(IIII)I

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

.method public static 飘花落叶言子楪苏哲兰世(III)Ljava/time/LocalTime;
    .locals 1

    .line 1
    or-int v0, p0, p1

    .line 2
    .line 3
    or-int/2addr v0, p2

    .line 4
    if-gez v0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-static {p0, p1, p2}, Ljava/time/LocalTime;->of(III)Ljava/time/LocalTime;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static 飘花落叶言子苏世兰哲楪([CIILjava/time/ZoneId;)Ljava/time/ZonedDateTime;
    .locals 70

    move-object/from16 v0, p0

    move/from16 v2, p2

    move-object/from16 v3, p3

    const/4 v4, 0x0

    if-nez v0, :cond_0

    return-object v4

    :cond_0
    if-nez v2, :cond_1

    return-object v4

    .line 1
    :cond_1
    const-string v5, "illegal input "

    const/16 v6, 0x10

    if-ne v2, v6, :cond_8

    add-int/lit8 v2, p1, 0x10

    .line 2
    array-length v4, v0

    if-gt v2, v4, :cond_7

    .line 3
    aget-char v2, v0, p1

    add-int/lit8 v4, p1, 0x1

    .line 4
    aget-char v4, v0, v4

    add-int/lit8 v13, p1, 0x2

    .line 5
    aget-char v13, v0, v13

    add-int/lit8 v14, p1, 0x3

    .line 6
    aget-char v14, v0, v14

    add-int/lit8 v15, p1, 0x4

    .line 7
    aget-char v15, v0, v15

    add-int/lit8 v16, p1, 0x5

    .line 8
    aget-char v8, v0, v16

    add-int/lit8 v16, p1, 0x6

    .line 9
    aget-char v6, v0, v16

    add-int/lit8 v16, p1, 0x7

    .line 10
    aget-char v9, v0, v16

    add-int/lit8 v16, p1, 0x8

    .line 11
    aget-char v12, v0, v16

    add-int/lit8 v16, p1, 0x9

    .line 12
    aget-char v11, v0, v16

    add-int/lit8 v7, p1, 0xa

    .line 13
    aget-char v10, v0, v7

    add-int/lit8 v20, p1, 0xd

    move-object/from16 v21, v5

    .line 14
    aget-char v5, v0, v20

    const/16 v1, 0x2d

    if-ne v15, v1, :cond_3

    if-ne v9, v1, :cond_3

    const/16 v9, 0x2b

    if-eq v10, v9, :cond_2

    if-ne v10, v1, :cond_3

    :cond_2
    const/16 v1, 0x3a

    goto :goto_0

    :cond_3
    move/from16 v5, p1

    move-object/from16 v6, v21

    const/16 v2, 0x10

    const/4 v3, 0x0

    goto/16 :goto_1

    :goto_0
    if-ne v5, v1, :cond_3

    const/16 v1, 0x30

    if-lt v2, v1, :cond_6

    const/16 v5, 0x39

    if-gt v2, v5, :cond_6

    if-lt v4, v1, :cond_6

    if-gt v4, v5, :cond_6

    if-lt v13, v1, :cond_6

    if-gt v13, v5, :cond_6

    if-lt v14, v1, :cond_6

    if-gt v14, v5, :cond_6

    sub-int/2addr v2, v1

    mul-int/lit16 v2, v2, 0x3e8

    const/16 v9, 0x64

    .line 15
    invoke-static {v4, v1, v9, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(IIII)I

    move-result v2

    const/16 v4, 0xa

    invoke-static {v13, v1, v4, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(IIII)I

    move-result v2

    sub-int/2addr v14, v1

    add-int/2addr v14, v2

    if-lt v8, v1, :cond_5

    if-gt v8, v5, :cond_5

    if-lt v6, v1, :cond_5

    if-gt v6, v5, :cond_5

    sub-int/2addr v8, v1

    mul-int/2addr v8, v4

    sub-int/2addr v6, v1

    add-int/2addr v6, v8

    if-lt v12, v1, :cond_4

    if-gt v12, v5, :cond_4

    if-lt v11, v1, :cond_4

    if-gt v11, v5, :cond_4

    sub-int/2addr v12, v1

    mul-int/2addr v12, v4

    sub-int/2addr v11, v1

    add-int/2addr v11, v12

    .line 16
    new-instance v1, Ljava/lang/String;

    const/4 v2, 0x6

    invoke-direct {v1, v0, v7, v2}, Ljava/lang/String;-><init>([CII)V

    .line 17
    invoke-static {v1, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/time/ZoneId;)Ljava/time/ZoneId;

    move-result-object v0

    .line 18
    invoke-static {v14, v6, v11}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    move-result-object v1

    sget-object v2, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    invoke-static {v1, v2}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    move-result-object v1

    .line 19
    invoke-static {v1, v0}, Ljava/time/ZonedDateTime;->of(Ljava/time/LocalDateTime;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object v0

    return-object v0

    .line 20
    :cond_4
    new-instance v1, Ljava/lang/String;

    move/from16 v5, p1

    const/16 v2, 0x10

    invoke-direct {v1, v0, v5, v2}, Ljava/lang/String;-><init>([CII)V

    .line 21
    new-instance v0, Ljava/time/format/DateTimeParseException;

    move-object/from16 v6, v21

    invoke-virtual {v6, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_5
    move/from16 v5, p1

    move-object/from16 v6, v21

    const/16 v2, 0x10

    const/4 v3, 0x0

    .line 22
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0, v5, v2}, Ljava/lang/String;-><init>([CII)V

    .line 23
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v6, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_6
    move/from16 v5, p1

    move-object/from16 v6, v21

    .line 24
    new-instance v1, Ljava/lang/String;

    const/16 v2, 0x10

    invoke-direct {v1, v0, v5, v2}, Ljava/lang/String;-><init>([CII)V

    .line 25
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v6, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    .line 26
    :goto_1
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0, v5, v2}, Ljava/lang/String;-><init>([CII)V

    .line 27
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v6, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_7
    move-object v6, v5

    const/4 v3, 0x0

    move/from16 v5, p1

    .line 28
    new-instance v1, Ljava/lang/String;

    array-length v2, v0

    sub-int/2addr v2, v5

    invoke-direct {v1, v0, v5, v2}, Ljava/lang/String;-><init>([CII)V

    .line 29
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v6, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_8
    move-object v6, v5

    move/from16 v5, p1

    const/16 v1, 0x13

    if-lt v2, v1, :cond_ab

    .line 30
    aget-char v6, v0, v5

    add-int/lit8 v7, v5, 0x1

    .line 31
    aget-char v7, v0, v7

    add-int/lit8 v8, v5, 0x2

    .line 32
    aget-char v8, v0, v8

    add-int/lit8 v9, v5, 0x3

    .line 33
    aget-char v9, v0, v9

    add-int/lit8 v10, v5, 0x4

    .line 34
    aget-char v10, v0, v10

    add-int/lit8 v11, v5, 0x5

    .line 35
    aget-char v11, v0, v11

    add-int/lit8 v12, v5, 0x6

    .line 36
    aget-char v12, v0, v12

    add-int/lit8 v13, v5, 0x7

    .line 37
    aget-char v13, v0, v13

    add-int/lit8 v14, v5, 0x8

    .line 38
    aget-char v14, v0, v14

    add-int/lit8 v15, v5, 0x9

    .line 39
    aget-char v15, v0, v15

    add-int/lit8 v17, v5, 0xa

    move-object/from16 v20, v4

    .line 40
    aget-char v4, v0, v17

    add-int/lit8 v17, v5, 0xb

    .line 41
    aget-char v1, v0, v17

    add-int/lit8 v17, v5, 0xc

    .line 42
    aget-char v5, v0, v17

    add-int/lit8 v17, p1, 0xd

    .line 43
    aget-char v3, v0, v17

    add-int/lit8 v17, p1, 0xe

    move/from16 v22, v14

    .line 44
    aget-char v14, v0, v17

    add-int/lit8 v17, p1, 0xf

    move/from16 v23, v15

    .line 45
    aget-char v15, v0, v17

    add-int/lit8 v17, p1, 0x10

    .line 46
    aget-char v0, p0, v17

    add-int/lit8 v17, p1, 0x11

    move/from16 v24, v15

    .line 47
    aget-char v15, p0, v17

    add-int/lit8 v17, p1, 0x12

    move/from16 v25, v5

    .line 48
    aget-char v5, p0, v17

    move/from16 v17, v5

    const/16 v5, 0x13

    if-ne v2, v5, :cond_9

    const/16 v5, 0x20

    goto :goto_2

    :cond_9
    add-int/lit8 v21, p1, 0x13

    .line 49
    aget-char v21, p0, v21

    move/from16 v5, v21

    :goto_2
    packed-switch v2, :pswitch_data_0

    add-int/lit8 v21, p1, 0x14

    .line 50
    aget-char v21, p0, v21

    add-int/lit8 v27, p1, 0x15

    .line 51
    aget-char v27, p0, v27

    add-int/lit8 v28, p1, 0x16

    .line 52
    aget-char v28, p0, v28

    add-int/lit8 v29, p1, 0x17

    .line 53
    aget-char v29, p0, v29

    add-int/lit8 v30, p1, 0x18

    .line 54
    aget-char v30, p0, v30

    add-int/lit8 v31, p1, 0x19

    .line 55
    aget-char v31, p0, v31

    add-int/lit8 v32, p1, 0x1a

    .line 56
    aget-char v32, p0, v32

    add-int/lit8 v33, p1, 0x1b

    .line 57
    aget-char v33, p0, v33

    add-int/lit8 v34, p1, 0x1c

    .line 58
    aget-char v34, p0, v34

    add-int/lit8 v35, p1, 0x1d

    .line 59
    aget-char v35, p0, v35

    move/from16 v42, v21

    move/from16 v36, v29

    move/from16 v37, v30

    move/from16 v38, v31

    move/from16 v39, v32

    move/from16 v40, v33

    move/from16 v41, v34

    move/from16 v43, v35

    :goto_3
    move/from16 v21, v6

    move/from16 v6, v27

    move/from16 v27, v7

    goto/16 :goto_b

    :pswitch_0
    add-int/lit8 v21, p1, 0x14

    .line 60
    aget-char v21, p0, v21

    add-int/lit8 v27, p1, 0x15

    .line 61
    aget-char v27, p0, v27

    add-int/lit8 v28, p1, 0x16

    .line 62
    aget-char v28, p0, v28

    add-int/lit8 v29, p1, 0x17

    .line 63
    aget-char v29, p0, v29

    add-int/lit8 v30, p1, 0x18

    .line 64
    aget-char v30, p0, v30

    add-int/lit8 v31, p1, 0x19

    .line 65
    aget-char v31, p0, v31

    add-int/lit8 v32, p1, 0x1a

    .line 66
    aget-char v32, p0, v32

    add-int/lit8 v33, p1, 0x1b

    .line 67
    aget-char v33, p0, v33

    add-int/lit8 v34, p1, 0x1c

    .line 68
    aget-char v34, p0, v34

    move/from16 v42, v21

    move/from16 v36, v29

    move/from16 v37, v30

    move/from16 v38, v31

    move/from16 v39, v32

    move/from16 v40, v33

    move/from16 v41, v34

    :goto_4
    const/16 v43, 0x0

    goto :goto_3

    :pswitch_1
    add-int/lit8 v21, p1, 0x14

    .line 69
    aget-char v21, p0, v21

    add-int/lit8 v27, p1, 0x15

    .line 70
    aget-char v27, p0, v27

    add-int/lit8 v28, p1, 0x16

    .line 71
    aget-char v28, p0, v28

    add-int/lit8 v29, p1, 0x17

    .line 72
    aget-char v29, p0, v29

    add-int/lit8 v30, p1, 0x18

    .line 73
    aget-char v30, p0, v30

    add-int/lit8 v31, p1, 0x19

    .line 74
    aget-char v31, p0, v31

    add-int/lit8 v32, p1, 0x1a

    .line 75
    aget-char v32, p0, v32

    add-int/lit8 v33, p1, 0x1b

    .line 76
    aget-char v33, p0, v33

    move/from16 v42, v21

    move/from16 v36, v29

    move/from16 v37, v30

    move/from16 v38, v31

    move/from16 v39, v32

    move/from16 v40, v33

    :goto_5
    const/16 v41, 0x30

    goto :goto_4

    :pswitch_2
    add-int/lit8 v21, p1, 0x14

    .line 77
    aget-char v21, p0, v21

    add-int/lit8 v27, p1, 0x15

    .line 78
    aget-char v27, p0, v27

    add-int/lit8 v28, p1, 0x16

    .line 79
    aget-char v28, p0, v28

    add-int/lit8 v29, p1, 0x17

    .line 80
    aget-char v29, p0, v29

    add-int/lit8 v30, p1, 0x18

    .line 81
    aget-char v30, p0, v30

    add-int/lit8 v31, p1, 0x19

    .line 82
    aget-char v31, p0, v31

    add-int/lit8 v32, p1, 0x1a

    .line 83
    aget-char v32, p0, v32

    move/from16 v42, v21

    move/from16 v36, v29

    move/from16 v37, v30

    move/from16 v38, v31

    move/from16 v39, v32

    :goto_6
    const/16 v40, 0x30

    goto :goto_5

    :pswitch_3
    add-int/lit8 v21, p1, 0x14

    .line 84
    aget-char v21, p0, v21

    add-int/lit8 v27, p1, 0x15

    .line 85
    aget-char v27, p0, v27

    add-int/lit8 v28, p1, 0x16

    .line 86
    aget-char v28, p0, v28

    add-int/lit8 v29, p1, 0x17

    .line 87
    aget-char v29, p0, v29

    add-int/lit8 v30, p1, 0x18

    .line 88
    aget-char v30, p0, v30

    add-int/lit8 v31, p1, 0x19

    .line 89
    aget-char v31, p0, v31

    move/from16 v42, v21

    move/from16 v36, v29

    move/from16 v37, v30

    move/from16 v38, v31

    :goto_7
    const/16 v39, 0x30

    goto :goto_6

    :pswitch_4
    add-int/lit8 v21, p1, 0x14

    .line 90
    aget-char v21, p0, v21

    add-int/lit8 v27, p1, 0x15

    .line 91
    aget-char v27, p0, v27

    add-int/lit8 v28, p1, 0x16

    .line 92
    aget-char v28, p0, v28

    add-int/lit8 v29, p1, 0x17

    .line 93
    aget-char v29, p0, v29

    add-int/lit8 v30, p1, 0x18

    .line 94
    aget-char v30, p0, v30

    move/from16 v42, v21

    move/from16 v36, v29

    move/from16 v37, v30

    :goto_8
    const/16 v38, 0x30

    goto :goto_7

    :pswitch_5
    add-int/lit8 v21, p1, 0x14

    .line 95
    aget-char v21, p0, v21

    add-int/lit8 v27, p1, 0x15

    .line 96
    aget-char v27, p0, v27

    add-int/lit8 v28, p1, 0x16

    .line 97
    aget-char v28, p0, v28

    add-int/lit8 v29, p1, 0x17

    .line 98
    aget-char v29, p0, v29

    move/from16 v42, v21

    move/from16 v36, v29

    :goto_9
    const/16 v37, 0x30

    goto :goto_8

    :pswitch_6
    add-int/lit8 v21, p1, 0x14

    .line 99
    aget-char v21, p0, v21

    add-int/lit8 v27, p1, 0x15

    .line 100
    aget-char v27, p0, v27

    add-int/lit8 v28, p1, 0x16

    .line 101
    aget-char v28, p0, v28

    move/from16 v42, v21

    :goto_a
    const/16 v36, 0x30

    goto :goto_9

    :pswitch_7
    add-int/lit8 v21, p1, 0x14

    .line 102
    aget-char v21, p0, v21

    add-int/lit8 v27, p1, 0x15

    .line 103
    aget-char v27, p0, v27

    move/from16 v42, v21

    const/16 v28, 0x30

    goto :goto_a

    :pswitch_8
    add-int/lit8 v21, p1, 0x14

    .line 104
    aget-char v21, p0, v21

    move/from16 v27, v7

    move/from16 v42, v21

    const/16 v28, 0x30

    const/16 v36, 0x30

    const/16 v37, 0x30

    const/16 v38, 0x30

    const/16 v39, 0x30

    const/16 v40, 0x30

    const/16 v41, 0x30

    const/16 v43, 0x0

    move/from16 v21, v6

    const/16 v6, 0x30

    goto :goto_b

    :pswitch_9
    move/from16 v21, v6

    move/from16 v27, v7

    const/16 v6, 0x30

    const/16 v28, 0x30

    const/16 v36, 0x30

    const/16 v37, 0x30

    const/16 v38, 0x30

    const/16 v39, 0x30

    const/16 v40, 0x30

    const/16 v41, 0x30

    const/16 v42, 0x0

    const/16 v43, 0x0

    :goto_b
    const/16 v31, 0x1

    const/16 v7, 0x2d

    if-ne v10, v7, :cond_c

    if-ne v13, v7, :cond_c

    const/16 v7, 0x20

    if-eq v4, v7, :cond_a

    const/16 v7, 0x54

    if-ne v4, v7, :cond_c

    :cond_a
    const/16 v7, 0x3a

    if-ne v3, v7, :cond_c

    if-ne v0, v7, :cond_c

    const/16 v7, 0x5b

    if-eq v5, v7, :cond_b

    const/16 v7, 0x5a

    if-eq v5, v7, :cond_b

    const/16 v7, 0x2b

    if-eq v5, v7, :cond_b

    const/16 v7, 0x2d

    if-eq v5, v7, :cond_b

    const/16 v7, 0x20

    if-ne v5, v7, :cond_c

    :cond_b
    const/4 v3, 0x0

    move-object/from16 v13, p0

    move v6, v2

    move/from16 v49, v8

    move/from16 v50, v9

    move/from16 v51, v11

    move/from16 v52, v12

    move/from16 v57, v14

    move/from16 v59, v15

    move/from16 v60, v17

    move-object/from16 v2, v20

    move/from16 v47, v21

    move/from16 v53, v22

    move/from16 v54, v23

    move/from16 v58, v24

    move/from16 v15, v25

    move/from16 v48, v27

    const/4 v0, 0x0

    const/16 v61, 0x30

    const/16 v62, 0x30

    const/16 v63, 0x30

    const/16 v64, 0x30

    const/16 v65, 0x30

    const/16 v66, 0x30

    const/16 v67, 0x30

    const/16 v68, 0x30

    const/16 v69, 0x30

    move v12, v1

    const/16 v1, 0x13

    goto/16 :goto_84

    :cond_c
    const/16 v7, 0x2d

    if-ne v10, v7, :cond_d

    if-ne v13, v7, :cond_d

    const/16 v7, 0x20

    if-ne v4, v7, :cond_d

    if-ne v1, v7, :cond_d

    const/16 v7, 0x3a

    if-ne v14, v7, :cond_d

    if-ne v15, v7, :cond_d

    const/16 v7, 0x14

    if-ne v2, v7, :cond_e

    move-object/from16 v13, p0

    move/from16 v58, v0

    move v6, v2

    move v15, v3

    move/from16 v60, v5

    move v1, v7

    move/from16 v49, v8

    move/from16 v50, v9

    move/from16 v51, v11

    move/from16 v52, v12

    move/from16 v59, v17

    move-object/from16 v2, v20

    move/from16 v47, v21

    move/from16 v53, v22

    move/from16 v54, v23

    move/from16 v57, v24

    move/from16 v12, v25

    move/from16 v48, v27

    const/4 v0, 0x0

    const/16 v61, 0x30

    const/16 v62, 0x30

    const/16 v63, 0x30

    const/16 v64, 0x30

    const/16 v65, 0x30

    const/16 v66, 0x30

    const/16 v67, 0x30

    :goto_c
    const/16 v68, 0x30

    :goto_d
    const/16 v69, 0x30

    :goto_e
    const/4 v3, 0x0

    goto/16 :goto_84

    :cond_d
    const/16 v7, 0x14

    :cond_e
    if-ne v2, v7, :cond_10

    const/16 v7, 0x20

    if-ne v8, v7, :cond_10

    if-ne v12, v7, :cond_10

    if-ne v1, v7, :cond_10

    const/16 v7, 0x3a

    if-ne v14, v7, :cond_10

    if-ne v15, v7, :cond_10

    .line 105
    invoke-static {v9, v10, v11}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    move-result v1

    if-lez v1, :cond_f

    .line 106
    div-int/lit8 v6, v1, 0xa

    const/16 v19, 0x30

    add-int/lit8 v6, v6, 0x30

    int-to-char v6, v6

    const/16 v18, 0xa

    .line 107
    rem-int/lit8 v1, v1, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    goto :goto_f

    :cond_f
    const/16 v1, 0x30

    const/16 v6, 0x30

    :goto_f
    move/from16 v58, v0

    move/from16 v52, v1

    move v15, v3

    move/from16 v50, v4

    move/from16 v60, v5

    move/from16 v51, v6

    move/from16 v47, v13

    move/from16 v59, v17

    move/from16 v53, v21

    move/from16 v48, v22

    move/from16 v49, v23

    move/from16 v57, v24

    move/from16 v12, v25

    move/from16 v54, v27

    const/4 v0, 0x0

    const/16 v1, 0x14

    const/16 v61, 0x30

    const/16 v62, 0x30

    const/16 v63, 0x30

    const/16 v64, 0x30

    const/16 v65, 0x30

    const/16 v66, 0x30

    const/16 v67, 0x30

    const/16 v68, 0x30

    const/16 v69, 0x30

    const/4 v3, 0x0

    move-object/from16 v13, p0

    :goto_10
    move v6, v2

    move-object/from16 v2, v20

    goto/16 :goto_84

    :cond_10
    const/16 v7, 0x2d

    if-ne v10, v7, :cond_14

    if-ne v13, v7, :cond_14

    const/16 v7, 0x20

    if-eq v4, v7, :cond_11

    const/16 v7, 0x54

    if-ne v4, v7, :cond_14

    :cond_11
    const/16 v7, 0x3a

    if-ne v3, v7, :cond_14

    if-ne v0, v7, :cond_14

    const/16 v7, 0x2e

    if-ne v5, v7, :cond_14

    const/16 v7, 0x15

    if-eq v2, v7, :cond_12

    const/16 v7, 0x5b

    if-eq v6, v7, :cond_12

    const/16 v7, 0x2b

    if-eq v6, v7, :cond_12

    const/16 v7, 0x2d

    if-eq v6, v7, :cond_12

    const/16 v7, 0x5a

    if-ne v6, v7, :cond_14

    :cond_12
    const/16 v0, 0x7c

    if-ne v6, v0, :cond_13

    move/from16 v3, v31

    goto :goto_11

    :cond_13
    const/4 v3, 0x0

    :goto_11
    move-object/from16 v13, p0

    move v6, v2

    move v0, v3

    move/from16 v49, v8

    move/from16 v50, v9

    move/from16 v51, v11

    move/from16 v52, v12

    move/from16 v57, v14

    move/from16 v59, v15

    move/from16 v60, v17

    move-object/from16 v2, v20

    move/from16 v47, v21

    move/from16 v53, v22

    move/from16 v54, v23

    move/from16 v58, v24

    move/from16 v15, v25

    move/from16 v48, v27

    move/from16 v61, v42

    const/16 v62, 0x30

    const/16 v63, 0x30

    const/16 v64, 0x30

    const/16 v65, 0x30

    const/16 v66, 0x30

    const/16 v67, 0x30

    const/16 v68, 0x30

    const/16 v69, 0x30

    const/4 v3, 0x0

    move v12, v1

    const/16 v1, 0x15

    goto/16 :goto_84

    :cond_14
    const/16 v7, 0x2d

    if-ne v10, v7, :cond_16

    if-ne v13, v7, :cond_16

    const/16 v7, 0x20

    if-eq v4, v7, :cond_15

    const/16 v7, 0x54

    if-ne v4, v7, :cond_16

    :cond_15
    const/16 v7, 0x3a

    goto :goto_12

    :cond_16
    move/from16 v7, v28

    move/from16 v28, v14

    goto/16 :goto_17

    :goto_12
    if-ne v3, v7, :cond_16

    if-ne v0, v7, :cond_16

    const/16 v7, 0x2e

    if-ne v5, v7, :cond_16

    const/16 v7, 0x16

    if-eq v2, v7, :cond_18

    move/from16 v7, v28

    move/from16 v28, v14

    const/16 v14, 0x5b

    if-eq v7, v14, :cond_17

    const/16 v14, 0x2b

    if-eq v7, v14, :cond_17

    const/16 v14, 0x2d

    if-eq v7, v14, :cond_17

    const/16 v14, 0x5a

    if-ne v7, v14, :cond_1a

    :cond_17
    :goto_13
    const/16 v0, 0x7c

    goto :goto_14

    :cond_18
    move/from16 v7, v28

    move/from16 v28, v14

    goto :goto_13

    :goto_14
    if-ne v7, v0, :cond_19

    move/from16 v3, v31

    goto :goto_15

    :cond_19
    const/4 v3, 0x0

    :goto_15
    move-object/from16 v13, p0

    move v0, v3

    move/from16 v62, v6

    move/from16 v49, v8

    move/from16 v50, v9

    move/from16 v51, v11

    move/from16 v52, v12

    move/from16 v59, v15

    move/from16 v60, v17

    move/from16 v47, v21

    move/from16 v53, v22

    move/from16 v54, v23

    move/from16 v58, v24

    move/from16 v15, v25

    move/from16 v48, v27

    move/from16 v57, v28

    move/from16 v61, v42

    const/16 v63, 0x30

    const/16 v64, 0x30

    const/16 v65, 0x30

    const/16 v66, 0x30

    const/16 v67, 0x30

    const/16 v68, 0x30

    const/16 v69, 0x30

    const/4 v3, 0x0

    move v12, v1

    move v6, v2

    move-object/from16 v2, v20

    :goto_16
    const/16 v1, 0x16

    goto/16 :goto_84

    :cond_1a
    :goto_17
    const/16 v14, 0x2d

    if-ne v10, v14, :cond_1c

    if-ne v13, v14, :cond_1c

    const/16 v14, 0x20

    if-eq v4, v14, :cond_1b

    const/16 v14, 0x54

    if-ne v4, v14, :cond_1c

    :cond_1b
    const/16 v14, 0x3a

    if-ne v3, v14, :cond_1c

    const/16 v14, 0x5a

    if-ne v0, v14, :cond_1c

    const/16 v14, 0x5b

    if-ne v15, v14, :cond_1c

    const/16 v14, 0x5d

    if-ne v6, v14, :cond_1c

    const/16 v14, 0x16

    if-ne v2, v14, :cond_1c

    const/4 v3, 0x0

    move-object/from16 v13, p0

    move v6, v2

    move/from16 v49, v8

    move/from16 v50, v9

    move/from16 v51, v11

    move/from16 v52, v12

    move-object/from16 v2, v20

    move/from16 v47, v21

    move/from16 v53, v22

    move/from16 v54, v23

    move/from16 v58, v24

    move/from16 v15, v25

    move/from16 v48, v27

    move/from16 v57, v28

    move/from16 v0, v31

    const/16 v59, 0x30

    const/16 v60, 0x30

    const/16 v61, 0x30

    const/16 v62, 0x30

    const/16 v63, 0x30

    const/16 v64, 0x30

    const/16 v65, 0x30

    const/16 v66, 0x30

    const/16 v67, 0x30

    const/16 v68, 0x30

    const/16 v69, 0x30

    move v12, v1

    const/16 v1, 0x11

    goto/16 :goto_84

    :cond_1c
    const/16 v14, 0x16

    if-ne v2, v14, :cond_22

    const/16 v14, 0x20

    if-ne v9, v14, :cond_22

    move/from16 v45, v10

    const/16 v10, 0x2c

    if-ne v11, v10, :cond_21

    if-ne v12, v14, :cond_21

    if-ne v1, v14, :cond_21

    const/16 v10, 0x3a

    if-ne v3, v10, :cond_21

    if-ne v0, v10, :cond_21

    if-ne v5, v14, :cond_21

    move/from16 v10, v42

    const/16 v14, 0x41

    if-eq v10, v14, :cond_1d

    const/16 v14, 0x50

    if-ne v10, v14, :cond_1e

    :cond_1d
    const/16 v14, 0x4d

    goto :goto_19

    :cond_1e
    move/from16 v14, v21

    :goto_18
    move/from16 v21, v13

    const/16 v13, 0x16

    goto/16 :goto_21

    :goto_19
    if-ne v6, v14, :cond_1e

    move/from16 v14, v21

    move/from16 v21, v13

    move/from16 v13, v27

    .line 108
    invoke-static {v14, v13, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    move-result v0

    if-lez v0, :cond_1f

    .line 109
    div-int/lit8 v1, v0, 0xa

    const/16 v19, 0x30

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    const/16 v18, 0xa

    .line 110
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    :goto_1a
    const/16 v14, 0x50

    goto :goto_1b

    :cond_1f
    const/16 v0, 0x30

    const/16 v1, 0x30

    goto :goto_1a

    :goto_1b
    if-ne v10, v14, :cond_20

    move/from16 v3, v31

    goto :goto_1c

    :cond_20
    const/4 v3, 0x0

    :goto_1c
    const/16 v12, 0x30

    move-object/from16 v13, p0

    move/from16 v52, v0

    move/from16 v51, v1

    move v6, v2

    move/from16 v50, v4

    move/from16 v59, v15

    move/from16 v60, v17

    move-object/from16 v2, v20

    move/from16 v47, v21

    move/from16 v48, v22

    move/from16 v49, v23

    move/from16 v58, v24

    move/from16 v15, v25

    move/from16 v57, v28

    move/from16 v54, v45

    const/4 v0, 0x0

    const/16 v1, 0x16

    :goto_1d
    const/16 v53, 0x30

    :goto_1e
    const/16 v61, 0x30

    const/16 v62, 0x30

    const/16 v63, 0x30

    :goto_1f
    const/16 v64, 0x30

    const/16 v65, 0x30

    const/16 v66, 0x30

    const/16 v67, 0x30

    const/16 v68, 0x30

    const/16 v69, 0x30

    goto/16 :goto_84

    :cond_21
    :goto_20
    move/from16 v14, v21

    move/from16 v10, v42

    goto :goto_18

    :cond_22
    move/from16 v45, v10

    goto :goto_20

    :goto_21
    if-ne v2, v13, :cond_23

    const/16 v13, 0x2f

    if-ne v8, v13, :cond_23

    if-ne v11, v13, :cond_23

    const/16 v13, 0x20

    if-ne v4, v13, :cond_23

    const/16 v13, 0x3a

    if-ne v3, v13, :cond_23

    if-ne v0, v13, :cond_23

    const/16 v13, 0x20

    if-ne v5, v13, :cond_23

    const/16 v13, 0x41

    if-eq v10, v13, :cond_24

    const/16 v13, 0x50

    if-ne v10, v13, :cond_23

    :goto_22
    move/from16 v42, v5

    const/16 v5, 0x4d

    goto :goto_23

    :cond_23
    move/from16 v42, v5

    goto :goto_25

    :cond_24
    const/16 v13, 0x50

    goto :goto_22

    :goto_23
    if-ne v6, v5, :cond_26

    if-ne v10, v13, :cond_25

    move/from16 v3, v31

    goto :goto_24

    :cond_25
    const/4 v3, 0x0

    :goto_24
    move-object/from16 v13, p0

    move v6, v2

    move/from16 v53, v9

    move/from16 v47, v12

    move/from16 v51, v14

    move/from16 v59, v15

    move/from16 v60, v17

    move-object/from16 v2, v20

    move/from16 v48, v21

    move/from16 v49, v22

    move/from16 v50, v23

    move/from16 v58, v24

    move/from16 v15, v25

    move/from16 v52, v27

    move/from16 v57, v28

    move/from16 v54, v45

    const/4 v0, 0x0

    const/16 v61, 0x30

    const/16 v62, 0x30

    const/16 v63, 0x30

    const/16 v64, 0x30

    const/16 v65, 0x30

    const/16 v66, 0x30

    const/16 v67, 0x30

    const/16 v68, 0x30

    const/16 v69, 0x30

    move v12, v1

    goto/16 :goto_16

    :cond_26
    :goto_25
    const/16 v5, 0x17

    if-ne v2, v5, :cond_2b

    const/16 v13, 0x20

    if-ne v9, v13, :cond_2b

    const/16 v5, 0x2c

    if-ne v11, v5, :cond_2b

    if-ne v12, v13, :cond_2b

    if-ne v1, v13, :cond_2b

    move/from16 v5, v28

    const/16 v13, 0x3a

    if-ne v5, v13, :cond_28

    if-ne v15, v13, :cond_28

    const/16 v13, 0x20

    if-ne v10, v13, :cond_28

    const/16 v13, 0x41

    if-eq v6, v13, :cond_27

    const/16 v13, 0x50

    if-ne v6, v13, :cond_28

    :cond_27
    const/16 v13, 0x4d

    goto :goto_27

    :cond_28
    move/from16 v13, v27

    :goto_26
    move/from16 v27, v0

    const/16 v0, 0x17

    goto/16 :goto_2b

    :goto_27
    if-ne v7, v13, :cond_28

    move/from16 v13, v27

    .line 111
    invoke-static {v14, v13, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    move-result v1

    if-lez v1, :cond_29

    .line 112
    div-int/lit8 v5, v1, 0xa

    const/16 v19, 0x30

    add-int/lit8 v5, v5, 0x30

    int-to-char v5, v5

    const/16 v18, 0xa

    .line 113
    rem-int/lit8 v1, v1, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    :goto_28
    const/16 v13, 0x50

    goto :goto_29

    :cond_29
    const/16 v1, 0x30

    const/16 v5, 0x30

    goto :goto_28

    :goto_29
    if-ne v6, v13, :cond_2a

    move/from16 v6, v31

    goto :goto_2a

    :cond_2a
    const/4 v6, 0x0

    :goto_2a
    move-object/from16 v13, p0

    move/from16 v58, v0

    move/from16 v52, v1

    move v15, v3

    move/from16 v50, v4

    move/from16 v51, v5

    move v3, v6

    move/from16 v59, v17

    move/from16 v47, v21

    move/from16 v48, v22

    move/from16 v49, v23

    move/from16 v57, v24

    move/from16 v12, v25

    move/from16 v60, v42

    move/from16 v54, v45

    const/4 v0, 0x0

    const/16 v1, 0x17

    const/16 v53, 0x30

    const/16 v61, 0x30

    const/16 v62, 0x30

    const/16 v63, 0x30

    const/16 v64, 0x30

    const/16 v65, 0x30

    const/16 v66, 0x30

    const/16 v67, 0x30

    const/16 v68, 0x30

    const/16 v69, 0x30

    goto/16 :goto_10

    :cond_2b
    move/from16 v13, v27

    move/from16 v5, v28

    goto :goto_26

    :goto_2b
    if-ne v2, v0, :cond_31

    const/16 v0, 0x20

    move/from16 v28, v3

    if-ne v9, v0, :cond_30

    const/16 v3, 0x2c

    if-ne v12, v3, :cond_30

    move/from16 v3, v21

    move/from16 v21, v4

    move/from16 v4, v25

    if-ne v3, v0, :cond_2d

    if-ne v4, v0, :cond_2d

    const/16 v0, 0x3a

    if-ne v5, v0, :cond_2d

    if-ne v15, v0, :cond_2d

    const/16 v0, 0x20

    if-ne v10, v0, :cond_2d

    const/16 v0, 0x41

    if-eq v6, v0, :cond_2c

    const/16 v0, 0x50

    if-ne v6, v0, :cond_2d

    :cond_2c
    const/16 v0, 0x4d

    goto :goto_2d

    :cond_2d
    :goto_2c
    const/16 v0, 0x17

    goto/16 :goto_32

    :goto_2d
    if-ne v7, v0, :cond_2d

    .line 114
    invoke-static {v14, v13, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    move-result v0

    if-lez v0, :cond_2e

    .line 115
    div-int/lit8 v3, v0, 0xa

    const/16 v19, 0x30

    add-int/lit8 v3, v3, 0x30

    int-to-char v3, v3

    const/16 v18, 0xa

    .line 116
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    :goto_2e
    const/16 v13, 0x50

    goto :goto_2f

    :cond_2e
    const/16 v0, 0x30

    const/16 v3, 0x30

    goto :goto_2e

    :goto_2f
    if-ne v6, v13, :cond_2f

    move/from16 v4, v31

    goto :goto_30

    :cond_2f
    const/4 v4, 0x0

    :goto_30
    move-object/from16 v13, p0

    move/from16 v52, v0

    move/from16 v50, v1

    move v6, v2

    move/from16 v51, v3

    move v3, v4

    move/from16 v54, v11

    move/from16 v59, v17

    move-object/from16 v2, v20

    move/from16 v49, v21

    move/from16 v47, v22

    move/from16 v48, v23

    move/from16 v57, v24

    move/from16 v58, v27

    move/from16 v15, v28

    move/from16 v60, v42

    move/from16 v53, v45

    const/4 v0, 0x0

    const/16 v1, 0x17

    :goto_31
    const/16 v12, 0x30

    goto/16 :goto_1e

    :cond_30
    move/from16 v3, v21

    move/from16 v21, v4

    move/from16 v4, v25

    goto :goto_2c

    :cond_31
    move/from16 v28, v3

    move/from16 v3, v21

    move/from16 v21, v4

    move/from16 v4, v25

    :goto_32
    if-ne v2, v0, :cond_35

    const/16 v0, 0x20

    if-ne v9, v0, :cond_35

    move/from16 v25, v3

    const/16 v3, 0x2c

    if-ne v11, v3, :cond_36

    if-ne v12, v0, :cond_36

    if-ne v1, v3, :cond_36

    if-ne v4, v0, :cond_36

    const/16 v3, 0x3a

    if-ne v5, v3, :cond_36

    if-ne v15, v3, :cond_36

    if-ne v10, v0, :cond_36

    const/16 v0, 0x41

    if-eq v6, v0, :cond_32

    const/16 v0, 0x50

    if-ne v6, v0, :cond_36

    :cond_32
    const/16 v0, 0x4d

    if-ne v7, v0, :cond_36

    .line 117
    invoke-static {v14, v13, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    move-result v0

    if-lez v0, :cond_33

    .line 118
    div-int/lit8 v1, v0, 0xa

    const/16 v19, 0x30

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    const/16 v18, 0xa

    .line 119
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    :goto_33
    const/16 v13, 0x50

    goto :goto_34

    :cond_33
    const/16 v0, 0x30

    const/16 v1, 0x30

    goto :goto_33

    :goto_34
    if-ne v6, v13, :cond_34

    move/from16 v3, v31

    goto :goto_35

    :cond_34
    const/4 v3, 0x0

    :goto_35
    const/16 v12, 0x30

    move-object/from16 v13, p0

    move/from16 v52, v0

    move/from16 v51, v1

    move v6, v2

    move/from16 v59, v17

    move-object/from16 v2, v20

    move/from16 v50, v21

    move/from16 v48, v22

    move/from16 v49, v23

    move/from16 v57, v24

    move/from16 v47, v25

    move/from16 v58, v27

    move/from16 v15, v28

    move/from16 v60, v42

    move/from16 v54, v45

    const/4 v0, 0x0

    const/16 v1, 0x17

    goto/16 :goto_1d

    :cond_35
    move/from16 v25, v3

    :cond_36
    const/16 v0, 0x18

    if-ne v2, v0, :cond_3f

    const/16 v3, 0x20

    if-ne v9, v3, :cond_3f

    const/16 v0, 0x2c

    if-ne v12, v0, :cond_3f

    move/from16 v0, v25

    if-ne v0, v3, :cond_3e

    if-ne v4, v3, :cond_3e

    move/from16 v3, v24

    move/from16 v24, v10

    const/16 v10, 0x3a

    move/from16 v25, v5

    move/from16 v5, v17

    if-ne v3, v10, :cond_3d

    if-ne v5, v10, :cond_3c

    const/16 v10, 0x20

    if-ne v6, v10, :cond_3c

    const/16 v10, 0x41

    if-eq v7, v10, :cond_37

    const/16 v10, 0x50

    if-ne v7, v10, :cond_38

    :cond_37
    move/from16 v17, v15

    move/from16 v10, v36

    const/16 v15, 0x4d

    goto :goto_37

    :cond_38
    move/from16 v17, v15

    move/from16 v10, v36

    move/from16 v15, v45

    move/from16 v36, v1

    :goto_36
    const/16 v1, 0x2d

    goto/16 :goto_3e

    :goto_37
    if-ne v10, v15, :cond_3b

    .line 120
    invoke-static {v14, v13, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    move-result v0

    if-lez v0, :cond_39

    .line 121
    div-int/lit8 v3, v0, 0xa

    const/16 v19, 0x30

    add-int/lit8 v3, v3, 0x30

    int-to-char v3, v3

    const/16 v18, 0xa

    .line 122
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    :goto_38
    const/16 v13, 0x50

    goto :goto_39

    :cond_39
    const/16 v0, 0x30

    const/16 v3, 0x30

    goto :goto_38

    :goto_39
    if-ne v7, v13, :cond_3a

    move/from16 v4, v31

    goto :goto_3a

    :cond_3a
    const/4 v4, 0x0

    :goto_3a
    move-object/from16 v13, p0

    move/from16 v52, v0

    move/from16 v50, v1

    move v6, v2

    move/from16 v51, v3

    move v3, v4

    move/from16 v54, v11

    move/from16 v58, v17

    move-object/from16 v2, v20

    move/from16 v49, v21

    move/from16 v47, v22

    move/from16 v48, v23

    move/from16 v60, v24

    move/from16 v15, v25

    move/from16 v57, v27

    move/from16 v12, v28

    move/from16 v59, v42

    move/from16 v53, v45

    const/4 v0, 0x0

    const/16 v1, 0x18

    goto/16 :goto_1e

    :cond_3b
    :goto_3b
    move/from16 v36, v1

    move/from16 v15, v45

    goto :goto_36

    :cond_3c
    :goto_3c
    move/from16 v17, v15

    move/from16 v10, v36

    goto :goto_3b

    :cond_3d
    :goto_3d
    move/from16 v10, v36

    move/from16 v17, v15

    goto :goto_3b

    :cond_3e
    move/from16 v25, v5

    move/from16 v5, v17

    move/from16 v3, v24

    move/from16 v24, v10

    goto :goto_3c

    :cond_3f
    move/from16 v3, v24

    move/from16 v0, v25

    move/from16 v25, v5

    move/from16 v24, v10

    move/from16 v5, v17

    goto :goto_3d

    :goto_3e
    if-ne v15, v1, :cond_48

    if-ne v0, v1, :cond_48

    move/from16 v1, v21

    move/from16 v21, v11

    const/16 v11, 0x20

    if-eq v1, v11, :cond_40

    const/16 v11, 0x54

    if-ne v1, v11, :cond_41

    :cond_40
    move/from16 v11, v28

    move/from16 v28, v8

    const/16 v8, 0x3a

    goto :goto_41

    :cond_41
    move/from16 v45, v13

    move/from16 v13, v27

    move/from16 v11, v28

    move/from16 v28, v8

    move/from16 v27, v14

    :cond_42
    :goto_3f
    move/from16 v8, v42

    :cond_43
    :goto_40
    const/16 v14, 0x2d

    goto/16 :goto_45

    :goto_41
    move/from16 v45, v13

    move/from16 v13, v27

    if-ne v11, v8, :cond_47

    move/from16 v27, v14

    if-ne v13, v8, :cond_42

    move/from16 v8, v42

    const/16 v14, 0x2e

    if-ne v8, v14, :cond_43

    const/16 v14, 0x17

    if-eq v2, v14, :cond_44

    const/16 v14, 0x5b

    if-eq v10, v14, :cond_44

    const/16 v14, 0x7c

    if-eq v10, v14, :cond_45

    const/16 v14, 0x2b

    if-eq v10, v14, :cond_44

    const/16 v14, 0x2d

    if-eq v10, v14, :cond_44

    const/16 v14, 0x5a

    if-ne v10, v14, :cond_43

    :cond_44
    const/16 v0, 0x7c

    goto :goto_42

    :cond_45
    move v0, v14

    :goto_42
    if-ne v10, v0, :cond_46

    move/from16 v0, v31

    goto :goto_43

    :cond_46
    const/4 v0, 0x0

    :goto_43
    move-object/from16 v13, p0

    move/from16 v58, v3

    move v15, v4

    move/from16 v60, v5

    move/from16 v62, v6

    move/from16 v63, v7

    move/from16 v50, v9

    move/from16 v52, v12

    move/from16 v59, v17

    move/from16 v51, v21

    move/from16 v53, v22

    move/from16 v54, v23

    move/from16 v61, v24

    move/from16 v57, v25

    move/from16 v47, v27

    move/from16 v49, v28

    move/from16 v12, v36

    move/from16 v48, v45

    const/16 v1, 0x17

    const/16 v64, 0x30

    :goto_44
    const/16 v65, 0x30

    const/16 v66, 0x30

    const/16 v67, 0x30

    const/16 v68, 0x30

    const/16 v69, 0x30

    const/4 v3, 0x0

    goto/16 :goto_10

    :cond_47
    move/from16 v8, v42

    move/from16 v27, v14

    goto :goto_40

    :cond_48
    move/from16 v45, v13

    move/from16 v1, v21

    move/from16 v13, v27

    move/from16 v21, v11

    move/from16 v27, v14

    move/from16 v11, v28

    move/from16 v28, v8

    goto :goto_3f

    :goto_45
    if-ne v15, v14, :cond_4a

    if-ne v0, v14, :cond_4a

    const/16 v14, 0x20

    if-eq v1, v14, :cond_49

    const/16 v14, 0x54

    if-ne v1, v14, :cond_4a

    :cond_49
    const/16 v14, 0x3a

    goto :goto_46

    :cond_4a
    move/from16 v42, v8

    move/from16 v14, v37

    :cond_4b
    const/16 v8, 0x18

    goto/16 :goto_4a

    :goto_46
    if-ne v11, v14, :cond_4a

    if-ne v13, v14, :cond_4a

    const/16 v14, 0x2e

    if-ne v8, v14, :cond_4a

    const/16 v14, 0x18

    if-eq v2, v14, :cond_4e

    move/from16 v42, v8

    move/from16 v14, v37

    const/16 v8, 0x5b

    if-eq v14, v8, :cond_4c

    const/16 v8, 0x7c

    if-eq v14, v8, :cond_4d

    const/16 v8, 0x2b

    if-eq v14, v8, :cond_4c

    const/16 v8, 0x2d

    if-eq v14, v8, :cond_4c

    const/16 v8, 0x5a

    if-ne v14, v8, :cond_4b

    :cond_4c
    :goto_47
    const/16 v0, 0x7c

    goto :goto_48

    :cond_4d
    move v0, v8

    goto :goto_48

    :cond_4e
    move/from16 v14, v37

    goto :goto_47

    :goto_48
    if-ne v14, v0, :cond_4f

    move/from16 v0, v31

    goto :goto_49

    :cond_4f
    const/4 v0, 0x0

    :goto_49
    move-object/from16 v13, p0

    move/from16 v58, v3

    move v15, v4

    move/from16 v60, v5

    move/from16 v62, v6

    move/from16 v63, v7

    move/from16 v50, v9

    move/from16 v64, v10

    move/from16 v52, v12

    move/from16 v59, v17

    move/from16 v51, v21

    move/from16 v53, v22

    move/from16 v54, v23

    move/from16 v61, v24

    move/from16 v57, v25

    move/from16 v47, v27

    move/from16 v49, v28

    move/from16 v12, v36

    move/from16 v48, v45

    const/16 v1, 0x18

    goto/16 :goto_44

    :goto_4a
    if-ne v2, v8, :cond_54

    const/16 v8, 0x20

    if-ne v9, v8, :cond_54

    move/from16 v37, v14

    const/16 v14, 0x2c

    if-ne v12, v14, :cond_51

    if-ne v0, v8, :cond_51

    if-ne v4, v14, :cond_51

    if-ne v11, v8, :cond_51

    const/16 v14, 0x3a

    if-ne v3, v14, :cond_51

    if-ne v5, v14, :cond_51

    if-ne v6, v8, :cond_51

    const/16 v14, 0x41

    if-eq v7, v14, :cond_50

    const/16 v14, 0x50

    if-ne v7, v14, :cond_51

    :cond_50
    const/16 v14, 0x4d

    goto :goto_4c

    :cond_51
    :goto_4b
    move/from16 v14, v27

    move/from16 v8, v45

    move/from16 v27, v13

    move/from16 v13, v28

    move/from16 v28, v11

    const/16 v11, 0x18

    goto :goto_50

    :goto_4c
    if-ne v10, v14, :cond_51

    move/from16 v14, v27

    move/from16 v8, v45

    move/from16 v27, v13

    move/from16 v13, v28

    .line 123
    invoke-static {v14, v8, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    move-result v0

    if-lez v0, :cond_52

    .line 124
    div-int/lit8 v3, v0, 0xa

    const/16 v19, 0x30

    add-int/lit8 v3, v3, 0x30

    int-to-char v3, v3

    const/16 v18, 0xa

    .line 125
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    :goto_4d
    const/16 v13, 0x50

    goto :goto_4e

    :cond_52
    const/16 v0, 0x30

    const/16 v3, 0x30

    goto :goto_4d

    :goto_4e
    if-ne v7, v13, :cond_53

    move/from16 v4, v31

    goto :goto_4f

    :cond_53
    const/4 v4, 0x0

    :goto_4f
    move-object/from16 v13, p0

    move/from16 v52, v0

    move/from16 v49, v1

    move v6, v2

    move/from16 v51, v3

    move v3, v4

    move/from16 v53, v15

    move/from16 v58, v17

    move-object/from16 v2, v20

    move/from16 v54, v21

    move/from16 v47, v22

    move/from16 v48, v23

    move/from16 v60, v24

    move/from16 v15, v25

    move/from16 v57, v27

    move/from16 v50, v36

    move/from16 v59, v42

    const/4 v0, 0x0

    const/16 v1, 0x18

    goto/16 :goto_31

    :cond_54
    move/from16 v37, v14

    goto :goto_4b

    :goto_50
    if-ne v2, v11, :cond_59

    const/16 v11, 0x20

    if-ne v9, v11, :cond_59

    move/from16 v45, v9

    move/from16 v9, v21

    const/16 v2, 0x2c

    if-ne v9, v2, :cond_58

    if-ne v12, v11, :cond_58

    move/from16 v21, v9

    move/from16 v9, v36

    if-ne v9, v2, :cond_5a

    if-ne v4, v11, :cond_5a

    const/16 v2, 0x3a

    if-ne v3, v2, :cond_5a

    if-ne v5, v2, :cond_5a

    if-ne v6, v11, :cond_5a

    const/16 v2, 0x41

    if-eq v7, v2, :cond_55

    const/16 v2, 0x50

    if-ne v7, v2, :cond_5a

    :cond_55
    const/16 v2, 0x4d

    if-ne v10, v2, :cond_5a

    .line 126
    invoke-static {v14, v8, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    move-result v2

    if-lez v2, :cond_56

    .line 127
    div-int/lit8 v3, v2, 0xa

    const/16 v19, 0x30

    add-int/lit8 v3, v3, 0x30

    int-to-char v3, v3

    const/16 v18, 0xa

    .line 128
    rem-int/lit8 v2, v2, 0xa

    add-int/lit8 v2, v2, 0x30

    int-to-char v2, v2

    :goto_51
    const/16 v13, 0x50

    goto :goto_52

    :cond_56
    const/16 v2, 0x30

    const/16 v3, 0x30

    goto :goto_51

    :goto_52
    if-ne v7, v13, :cond_57

    move/from16 v4, v31

    goto :goto_53

    :cond_57
    const/4 v4, 0x0

    :goto_53
    move-object/from16 v13, p0

    move/from16 v6, p2

    move/from16 v47, v0

    move/from16 v50, v1

    move/from16 v52, v2

    move/from16 v51, v3

    move v3, v4

    move/from16 v54, v15

    move/from16 v58, v17

    move-object/from16 v2, v20

    move/from16 v48, v22

    move/from16 v49, v23

    move/from16 v60, v24

    move/from16 v15, v25

    move/from16 v57, v27

    move/from16 v12, v28

    move/from16 v59, v42

    const/4 v0, 0x0

    const/16 v1, 0x18

    goto/16 :goto_1d

    :cond_58
    move/from16 v21, v9

    :goto_54
    move/from16 v9, v36

    goto :goto_55

    :cond_59
    move/from16 v45, v9

    goto :goto_54

    :cond_5a
    :goto_55
    const/16 v11, 0x2d

    if-ne v15, v11, :cond_5c

    if-ne v0, v11, :cond_5c

    const/16 v11, 0x20

    if-eq v1, v11, :cond_5b

    const/16 v11, 0x54

    if-ne v1, v11, :cond_5c

    :cond_5b
    move/from16 v11, v28

    const/16 v2, 0x3a

    goto :goto_57

    :cond_5c
    move/from16 v36, v9

    move/from16 v9, v27

    move/from16 v11, v28

    :cond_5d
    move/from16 v2, v42

    move/from16 v42, v5

    move/from16 v27, v6

    move/from16 v5, v38

    move/from16 v6, p2

    :goto_56
    move/from16 v38, v3

    :cond_5e
    const/16 v3, 0x19

    goto/16 :goto_5d

    :goto_57
    move/from16 v36, v9

    move/from16 v9, v27

    if-ne v11, v2, :cond_5d

    move/from16 v27, v6

    if-ne v9, v2, :cond_64

    move/from16 v2, v42

    const/16 v6, 0x2e

    if-ne v2, v6, :cond_63

    move/from16 v6, p2

    move/from16 v42, v5

    const/16 v5, 0x19

    if-eq v6, v5, :cond_61

    move/from16 v5, v38

    move/from16 v38, v3

    const/16 v3, 0x5b

    if-eq v5, v3, :cond_5f

    const/16 v3, 0x7c

    if-eq v5, v3, :cond_60

    const/16 v3, 0x2b

    if-eq v5, v3, :cond_5f

    const/16 v3, 0x2d

    if-eq v5, v3, :cond_5f

    const/16 v3, 0x5a

    if-ne v5, v3, :cond_5e

    :cond_5f
    :goto_58
    const/16 v0, 0x7c

    goto :goto_59

    :cond_60
    move v0, v3

    goto :goto_59

    :cond_61
    move/from16 v5, v38

    move/from16 v38, v3

    goto :goto_58

    :goto_59
    if-ne v5, v0, :cond_62

    move/from16 v3, v31

    goto :goto_5a

    :cond_62
    const/4 v3, 0x0

    :goto_5a
    move v0, v3

    move v15, v4

    move/from16 v63, v7

    move/from16 v48, v8

    move/from16 v64, v10

    move/from16 v52, v12

    move/from16 v49, v13

    move/from16 v47, v14

    move/from16 v59, v17

    move-object/from16 v2, v20

    move/from16 v51, v21

    move/from16 v53, v22

    move/from16 v54, v23

    move/from16 v61, v24

    move/from16 v57, v25

    move/from16 v62, v27

    move/from16 v12, v36

    move/from16 v65, v37

    move/from16 v58, v38

    move/from16 v60, v42

    move/from16 v50, v45

    const/16 v1, 0x19

    const/16 v66, 0x30

    :goto_5b
    const/16 v67, 0x30

    const/16 v68, 0x30

    const/16 v69, 0x30

    const/4 v3, 0x0

    move-object/from16 v13, p0

    goto/16 :goto_84

    :cond_63
    :goto_5c
    move/from16 v6, p2

    move/from16 v42, v5

    move/from16 v5, v38

    goto/16 :goto_56

    :cond_64
    move/from16 v2, v42

    goto :goto_5c

    :goto_5d
    if-ne v6, v3, :cond_6a

    move/from16 v3, v45

    move/from16 v45, v5

    const/16 v5, 0x20

    move/from16 v46, v3

    if-ne v3, v5, :cond_66

    const/16 v3, 0x2c

    if-ne v12, v3, :cond_66

    if-ne v0, v5, :cond_66

    if-ne v4, v3, :cond_66

    if-ne v11, v5, :cond_66

    const/16 v3, 0x3a

    if-ne v9, v3, :cond_66

    if-ne v2, v3, :cond_66

    if-ne v7, v5, :cond_66

    const/16 v3, 0x41

    if-eq v10, v3, :cond_65

    const/16 v3, 0x50

    if-ne v10, v3, :cond_66

    :cond_65
    move/from16 v3, v37

    const/16 v5, 0x4d

    goto :goto_5f

    :cond_66
    move/from16 v3, v37

    :cond_67
    :goto_5e
    const/16 v5, 0x2d

    goto :goto_63

    :goto_5f
    if-ne v3, v5, :cond_67

    .line 129
    invoke-static {v14, v8, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    move-result v0

    if-lez v0, :cond_68

    .line 130
    div-int/lit8 v2, v0, 0xa

    const/16 v19, 0x30

    add-int/lit8 v2, v2, 0x30

    int-to-char v2, v2

    const/16 v18, 0xa

    .line 131
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    :goto_60
    const/16 v13, 0x50

    goto :goto_61

    :cond_68
    const/16 v0, 0x30

    const/16 v2, 0x30

    goto :goto_60

    :goto_61
    if-ne v10, v13, :cond_69

    move/from16 v3, v31

    goto :goto_62

    :cond_69
    const/4 v3, 0x0

    :goto_62
    move-object/from16 v13, p0

    move/from16 v52, v0

    move/from16 v49, v1

    move/from16 v51, v2

    move/from16 v53, v15

    move/from16 v57, v17

    move-object/from16 v2, v20

    move/from16 v54, v21

    move/from16 v47, v22

    move/from16 v48, v23

    move/from16 v59, v24

    move/from16 v12, v25

    move/from16 v60, v27

    move/from16 v50, v36

    move/from16 v15, v38

    move/from16 v58, v42

    const/4 v0, 0x0

    const/16 v1, 0x19

    goto/16 :goto_1e

    :cond_6a
    move/from16 v3, v37

    move/from16 v46, v45

    move/from16 v45, v5

    goto :goto_5e

    :goto_63
    if-ne v15, v5, :cond_6c

    if-ne v0, v5, :cond_6c

    const/16 v5, 0x20

    if-eq v1, v5, :cond_6b

    const/16 v5, 0x54

    if-ne v1, v5, :cond_6c

    :cond_6b
    const/16 v5, 0x3a

    goto :goto_64

    :cond_6c
    move/from16 v5, v39

    move/from16 v39, v8

    :cond_6d
    const/16 v8, 0x2d

    goto/16 :goto_68

    :goto_64
    if-ne v11, v5, :cond_6c

    if-ne v9, v5, :cond_6c

    const/16 v5, 0x2e

    if-ne v2, v5, :cond_6c

    const/16 v5, 0x1a

    if-eq v6, v5, :cond_70

    move/from16 v5, v39

    move/from16 v39, v8

    const/16 v8, 0x5b

    if-eq v5, v8, :cond_6e

    const/16 v8, 0x7c

    if-eq v5, v8, :cond_6f

    const/16 v8, 0x2b

    if-eq v5, v8, :cond_6e

    const/16 v8, 0x2d

    if-eq v5, v8, :cond_6e

    const/16 v8, 0x5a

    if-ne v5, v8, :cond_6d

    :cond_6e
    :goto_65
    const/16 v0, 0x7c

    goto :goto_66

    :cond_6f
    move v0, v8

    goto :goto_66

    :cond_70
    move/from16 v5, v39

    move/from16 v39, v8

    goto :goto_65

    :goto_66
    if-ne v5, v0, :cond_71

    move/from16 v0, v31

    goto :goto_67

    :cond_71
    const/4 v0, 0x0

    :goto_67
    move/from16 v65, v3

    move v15, v4

    move/from16 v63, v7

    move/from16 v64, v10

    move/from16 v52, v12

    move/from16 v49, v13

    move/from16 v47, v14

    move/from16 v59, v17

    move-object/from16 v2, v20

    move/from16 v51, v21

    move/from16 v53, v22

    move/from16 v54, v23

    move/from16 v61, v24

    move/from16 v57, v25

    move/from16 v62, v27

    move/from16 v12, v36

    move/from16 v58, v38

    move/from16 v48, v39

    move/from16 v60, v42

    move/from16 v66, v45

    move/from16 v50, v46

    const/16 v1, 0x1a

    goto/16 :goto_5b

    :goto_68
    if-ne v15, v8, :cond_73

    if-ne v0, v8, :cond_73

    const/16 v8, 0x20

    if-eq v1, v8, :cond_72

    const/16 v8, 0x54

    if-ne v1, v8, :cond_73

    :cond_72
    const/16 v8, 0x3a

    goto :goto_69

    :cond_73
    move/from16 v8, v40

    move/from16 v40, v13

    goto/16 :goto_6d

    :goto_69
    if-ne v11, v8, :cond_73

    if-ne v9, v8, :cond_73

    const/16 v8, 0x2e

    if-ne v2, v8, :cond_73

    const/16 v8, 0x1b

    if-eq v6, v8, :cond_75

    move/from16 v8, v40

    move/from16 v40, v13

    const/16 v13, 0x5b

    if-eq v8, v13, :cond_74

    const/16 v13, 0x7c

    if-eq v8, v13, :cond_74

    const/16 v13, 0x2b

    if-eq v8, v13, :cond_74

    const/16 v13, 0x2d

    if-eq v8, v13, :cond_74

    const/16 v13, 0x5a

    if-ne v8, v13, :cond_78

    :cond_74
    :goto_6a
    const/16 v13, 0x20

    goto :goto_6b

    :cond_75
    move/from16 v8, v40

    move/from16 v40, v13

    goto :goto_6a

    :goto_6b
    if-ne v10, v13, :cond_76

    const/4 v3, 0x0

    move-object/from16 v13, p0

    move v15, v4

    move/from16 v63, v7

    move/from16 v52, v12

    move/from16 v47, v14

    move/from16 v59, v17

    move-object/from16 v2, v20

    move/from16 v51, v21

    move/from16 v53, v22

    move/from16 v54, v23

    move/from16 v61, v24

    move/from16 v57, v25

    move/from16 v62, v27

    move/from16 v12, v36

    move/from16 v58, v38

    move/from16 v48, v39

    move/from16 v49, v40

    move/from16 v60, v42

    move/from16 v50, v46

    const/4 v0, 0x0

    const/16 v1, 0x17

    goto/16 :goto_1f

    :cond_76
    const/16 v0, 0x7c

    if-ne v8, v0, :cond_77

    move/from16 v0, v31

    goto :goto_6c

    :cond_77
    const/4 v0, 0x0

    :goto_6c
    move-object/from16 v13, p0

    move/from16 v65, v3

    move v15, v4

    move/from16 v67, v5

    move/from16 v63, v7

    move/from16 v64, v10

    move/from16 v52, v12

    move/from16 v47, v14

    move/from16 v59, v17

    move-object/from16 v2, v20

    move/from16 v51, v21

    move/from16 v53, v22

    move/from16 v54, v23

    move/from16 v61, v24

    move/from16 v57, v25

    move/from16 v62, v27

    move/from16 v12, v36

    move/from16 v58, v38

    move/from16 v48, v39

    move/from16 v49, v40

    move/from16 v60, v42

    move/from16 v66, v45

    move/from16 v50, v46

    const/16 v1, 0x1b

    goto/16 :goto_c

    :cond_78
    :goto_6d
    const/16 v13, 0x2d

    if-ne v15, v13, :cond_7a

    if-ne v0, v13, :cond_7a

    const/16 v13, 0x20

    if-eq v1, v13, :cond_79

    const/16 v13, 0x54

    if-ne v1, v13, :cond_7a

    :cond_79
    const/16 v13, 0x3a

    goto :goto_6e

    :cond_7a
    move/from16 v13, v41

    move/from16 v41, v14

    :cond_7b
    const/16 v14, 0x1c

    goto/16 :goto_72

    :goto_6e
    if-ne v11, v13, :cond_7a

    if-ne v9, v13, :cond_7a

    const/16 v13, 0x2e

    if-ne v2, v13, :cond_7a

    const/16 v13, 0x1c

    if-eq v6, v13, :cond_7e

    move/from16 v13, v41

    move/from16 v41, v14

    const/16 v14, 0x5b

    if-eq v13, v14, :cond_7c

    const/16 v14, 0x7c

    if-eq v13, v14, :cond_7d

    const/16 v14, 0x2b

    if-eq v13, v14, :cond_7c

    const/16 v14, 0x2d

    if-eq v13, v14, :cond_7c

    const/16 v14, 0x5a

    if-ne v13, v14, :cond_7b

    :cond_7c
    :goto_6f
    const/16 v0, 0x7c

    goto :goto_70

    :cond_7d
    move v0, v14

    goto :goto_70

    :cond_7e
    move/from16 v13, v41

    move/from16 v41, v14

    goto :goto_6f

    :goto_70
    if-ne v13, v0, :cond_7f

    move/from16 v0, v31

    goto :goto_71

    :cond_7f
    const/4 v0, 0x0

    :goto_71
    move-object/from16 v13, p0

    move/from16 v65, v3

    move v15, v4

    move/from16 v67, v5

    move/from16 v63, v7

    move/from16 v68, v8

    move/from16 v64, v10

    move/from16 v52, v12

    move/from16 v59, v17

    move-object/from16 v2, v20

    move/from16 v51, v21

    move/from16 v53, v22

    move/from16 v54, v23

    move/from16 v61, v24

    move/from16 v57, v25

    move/from16 v62, v27

    move/from16 v12, v36

    move/from16 v58, v38

    move/from16 v48, v39

    move/from16 v49, v40

    move/from16 v47, v41

    move/from16 v60, v42

    move/from16 v66, v45

    move/from16 v50, v46

    const/16 v1, 0x1c

    goto/16 :goto_d

    :goto_72
    move/from16 v44, v13

    if-ne v6, v14, :cond_82

    move/from16 v14, v46

    const/16 v13, 0x20

    if-ne v14, v13, :cond_81

    if-ne v0, v13, :cond_81

    if-ne v1, v13, :cond_81

    const/16 v13, 0x3a

    if-ne v11, v13, :cond_81

    if-ne v9, v13, :cond_81

    const/16 v13, 0x20

    if-ne v2, v13, :cond_81

    if-ne v10, v13, :cond_81

    move/from16 v13, v21

    .line 132
    invoke-static {v15, v13, v12}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    move-result v0

    if-lez v0, :cond_80

    .line 133
    div-int/lit8 v1, v0, 0xa

    const/16 v19, 0x30

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    const/16 v18, 0xa

    .line 134
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    goto :goto_73

    :cond_80
    const/16 v0, 0x30

    const/16 v1, 0x30

    .line 135
    :goto_73
    new-instance v2, Ljava/lang/String;

    add-int/lit8 v7, p1, 0x14

    const/4 v9, 0x3

    move-object/from16 v10, p0

    invoke-direct {v2, v10, v7, v9}, Ljava/lang/String;-><init>([CII)V

    move/from16 v52, v0

    move/from16 v51, v1

    move/from16 v47, v3

    move v15, v4

    move/from16 v49, v5

    move/from16 v50, v8

    move-object v13, v10

    move/from16 v59, v17

    move/from16 v53, v22

    move/from16 v54, v23

    move/from16 v57, v25

    move/from16 v12, v36

    move/from16 v58, v38

    move/from16 v60, v42

    move/from16 v48, v45

    const/4 v0, 0x0

    const/16 v1, 0x13

    const/4 v3, 0x0

    goto/16 :goto_1e

    :cond_81
    :goto_74
    move-object/from16 v13, p0

    move/from16 v26, v8

    const/16 v8, 0x1c

    goto :goto_75

    :cond_82
    move/from16 v14, v46

    goto :goto_74

    :goto_75
    if-ne v6, v8, :cond_86

    const/16 v8, 0x2c

    if-ne v14, v8, :cond_86

    const/16 v8, 0x20

    if-ne v15, v8, :cond_86

    if-ne v12, v8, :cond_86

    if-ne v1, v8, :cond_86

    move/from16 v37, v4

    move/from16 v4, v38

    move/from16 v38, v5

    if-ne v4, v8, :cond_85

    move/from16 v8, v42

    const/16 v5, 0x3a

    if-ne v8, v5, :cond_85

    move/from16 v8, v27

    if-ne v8, v5, :cond_84

    const/16 v5, 0x20

    if-ne v3, v5, :cond_84

    move/from16 v5, v22

    move/from16 v3, v23

    .line 136
    invoke-static {v0, v5, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    move-result v0

    if-lez v0, :cond_83

    .line 137
    div-int/lit8 v1, v0, 0xa

    const/16 v19, 0x30

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    const/16 v18, 0xa

    .line 138
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    goto :goto_76

    :cond_83
    const/16 v0, 0x30

    const/16 v1, 0x30

    :goto_76
    move/from16 v52, v0

    move/from16 v51, v1

    move/from16 v57, v2

    move/from16 v59, v7

    move v12, v9

    move/from16 v60, v10

    move/from16 v49, v11

    move/from16 v15, v17

    move-object/from16 v2, v20

    move/from16 v54, v21

    move/from16 v58, v24

    move/from16 v50, v25

    move/from16 v0, v31

    move/from16 v47, v36

    move/from16 v48, v37

    const/16 v1, 0x18

    const/4 v3, 0x0

    goto/16 :goto_1d

    :cond_84
    move/from16 v5, v22

    move/from16 v22, v3

    move/from16 v3, v23

    move/from16 v27, v8

    goto :goto_78

    :cond_85
    :goto_77
    move/from16 v5, v22

    move/from16 v22, v3

    move/from16 v3, v23

    goto :goto_78

    :cond_86
    move/from16 v37, v4

    move/from16 v4, v38

    move/from16 v38, v5

    goto :goto_77

    :goto_78
    const/16 v8, 0x1d

    if-ne v6, v8, :cond_8a

    const/16 v8, 0x2c

    if-ne v14, v8, :cond_8a

    const/16 v8, 0x20

    if-ne v15, v8, :cond_8a

    if-ne v0, v8, :cond_8a

    move/from16 v46, v14

    move/from16 v14, v36

    if-ne v14, v8, :cond_89

    if-ne v9, v8, :cond_89

    const/16 v8, 0x3a

    if-ne v2, v8, :cond_89

    if-ne v7, v8, :cond_89

    move/from16 v36, v10

    move/from16 v8, v45

    const/16 v10, 0x20

    if-ne v8, v10, :cond_88

    .line 139
    invoke-static {v5, v3, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    move-result v0

    if-lez v0, :cond_87

    .line 140
    div-int/lit8 v1, v0, 0xa

    const/16 v19, 0x30

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    const/16 v18, 0xa

    .line 141
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    goto :goto_79

    :cond_87
    const/16 v19, 0x30

    move/from16 v0, v19

    move v1, v0

    :goto_79
    move/from16 v52, v0

    move/from16 v51, v1

    move/from16 v50, v4

    move/from16 v48, v11

    move/from16 v54, v12

    move/from16 v12, v17

    move/from16 v61, v19

    move/from16 v62, v61

    move/from16 v63, v62

    move/from16 v64, v63

    move/from16 v65, v64

    move/from16 v66, v65

    move/from16 v67, v66

    move/from16 v68, v67

    move/from16 v69, v68

    move-object/from16 v2, v20

    move/from16 v53, v21

    move/from16 v60, v22

    move/from16 v57, v24

    move/from16 v49, v25

    move/from16 v58, v27

    move/from16 v0, v31

    move/from16 v59, v36

    move/from16 v47, v37

    move/from16 v15, v42

    const/16 v1, 0x19

    goto/16 :goto_e

    :cond_88
    :goto_7a
    const/16 v19, 0x30

    :goto_7b
    const/16 v10, 0x2d

    goto :goto_7c

    :cond_89
    move/from16 v36, v10

    move/from16 v8, v45

    goto :goto_7a

    :cond_8a
    move/from16 v46, v14

    move/from16 v14, v36

    move/from16 v8, v45

    const/16 v19, 0x30

    move/from16 v36, v10

    goto :goto_7b

    :goto_7c
    if-ne v15, v10, :cond_8c

    if-ne v0, v10, :cond_8c

    const/16 v10, 0x20

    if-eq v1, v10, :cond_8b

    const/16 v10, 0x54

    if-ne v1, v10, :cond_8c

    :cond_8b
    const/16 v10, 0x3a

    goto :goto_7d

    :cond_8c
    move/from16 v45, v15

    :cond_8d
    const/16 v10, 0x16

    goto/16 :goto_81

    :goto_7d
    if-ne v11, v10, :cond_8c

    if-ne v9, v10, :cond_8c

    const/16 v10, 0x2e

    if-ne v2, v10, :cond_8c

    const/16 v10, 0x1d

    if-eq v6, v10, :cond_90

    move/from16 v45, v15

    move/from16 v10, v43

    const/16 v15, 0x5b

    if-eq v10, v15, :cond_8e

    const/16 v15, 0x7c

    if-eq v10, v15, :cond_8f

    const/16 v15, 0x2b

    if-eq v10, v15, :cond_8e

    const/16 v15, 0x2d

    if-eq v10, v15, :cond_8e

    const/16 v15, 0x5a

    if-ne v10, v15, :cond_8d

    :cond_8e
    :goto_7e
    const/16 v0, 0x7c

    goto :goto_7f

    :cond_8f
    move v0, v15

    goto :goto_7f

    :cond_90
    move/from16 v10, v43

    goto :goto_7e

    :goto_7f
    if-ne v10, v0, :cond_91

    move/from16 v0, v31

    goto :goto_80

    :cond_91
    const/4 v0, 0x0

    :goto_80
    move/from16 v54, v3

    move/from16 v58, v4

    move/from16 v53, v5

    move/from16 v63, v7

    move/from16 v66, v8

    move/from16 v52, v12

    move v12, v14

    move/from16 v59, v17

    move-object/from16 v2, v20

    move/from16 v51, v21

    move/from16 v65, v22

    move/from16 v61, v24

    move/from16 v57, v25

    move/from16 v68, v26

    move/from16 v62, v27

    move/from16 v64, v36

    move/from16 v15, v37

    move/from16 v67, v38

    move/from16 v48, v39

    move/from16 v49, v40

    move/from16 v47, v41

    move/from16 v60, v42

    move/from16 v69, v44

    move/from16 v50, v46

    const/16 v1, 0x1d

    goto/16 :goto_e

    :goto_81
    if-ne v6, v10, :cond_a1

    move/from16 v10, v17

    const/16 v15, 0x2b

    if-eq v10, v15, :cond_93

    const/16 v15, 0x2d

    if-ne v10, v15, :cond_92

    goto :goto_83

    :cond_92
    :goto_82
    const/16 v15, 0x20

    goto/16 :goto_8c

    :cond_93
    :goto_83
    move/from16 v54, v0

    move/from16 v57, v1

    move v15, v3

    move/from16 v62, v4

    move/from16 v63, v9

    move/from16 v60, v11

    move/from16 v53, v12

    move/from16 v58, v14

    move/from16 v64, v19

    move/from16 v65, v64

    move/from16 v66, v65

    move/from16 v67, v66

    move/from16 v68, v67

    move/from16 v69, v68

    move-object/from16 v2, v20

    move/from16 v52, v21

    move/from16 v61, v25

    move/from16 v59, v37

    move/from16 v48, v39

    move/from16 v49, v40

    move/from16 v47, v41

    move/from16 v51, v45

    move/from16 v50, v46

    const/4 v0, 0x0

    const/16 v1, 0x11

    const/4 v3, 0x0

    move v12, v5

    :goto_84
    if-eqz v3, :cond_94

    const/16 v4, 0x31

    if-ne v12, v4, :cond_94

    const/16 v4, 0x32

    if-ne v15, v4, :cond_94

    const/4 v8, 0x0

    goto :goto_85

    :cond_94
    move v8, v3

    :goto_85
    if-eqz v8, :cond_95

    .line 142
    invoke-static {v12, v15}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世兰哲(CC)I

    move-result v3

    shr-int/lit8 v4, v3, 0x10

    int-to-char v12, v4

    int-to-short v3, v3

    int-to-char v15, v3

    :cond_95
    move/from16 v55, v12

    move/from16 v56, v15

    .line 143
    invoke-static/range {v47 .. v69}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲世兰(CCCCCCCCCCCCCCCCCCCCCCC)Ljava/time/LocalDateTime;

    move-result-object v3

    if-nez v3, :cond_96

    return-object v20

    :cond_96
    if-eqz v0, :cond_98

    .line 144
    new-instance v0, Ljava/lang/String;

    sub-int v2, v6, v1

    invoke-direct {v0, v13, v1, v2}, Ljava/lang/String;-><init>([CII)V

    .line 145
    const-string v1, "UTC"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_97

    const-string v1, "[UTC]"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_97

    .line 146
    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    .line 147
    invoke-virtual {v0}, Ljava/util/TimeZone;->toZoneId()Ljava/time/ZoneId;

    move-result-object v0

    goto :goto_86

    .line 148
    :cond_97
    sget-object v0, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    :goto_86
    move-object v1, v0

    move-object/from16 v0, p3

    goto :goto_8a

    :cond_98
    if-ne v1, v6, :cond_99

    move-object/from16 v0, p3

    move-object v1, v0

    goto :goto_8a

    :cond_99
    add-int v0, p1, v1

    .line 149
    aget-char v4, v13, v0

    const/16 v14, 0x5a

    if-ne v4, v14, :cond_9a

    .line 150
    sget-object v0, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    goto :goto_86

    :cond_9a
    if-nez v2, :cond_9c

    const/16 v14, 0x2b

    if-eq v4, v14, :cond_9e

    const/16 v7, 0x2d

    if-ne v4, v7, :cond_9b

    goto :goto_88

    :cond_9b
    const/16 v7, 0x20

    if-ne v4, v7, :cond_9d

    .line 151
    new-instance v2, Ljava/lang/String;

    add-int/lit8 v0, v0, 0x1

    sub-int v1, v6, v1

    add-int/lit8 v1, v1, -0x1

    invoke-direct {v2, v13, v0, v1}, Ljava/lang/String;-><init>([CII)V

    :cond_9c
    :goto_87
    move-object/from16 v0, p3

    goto :goto_89

    :cond_9d
    if-ge v1, v6, :cond_9c

    .line 152
    new-instance v2, Ljava/lang/String;

    add-int/lit8 v0, v0, 0x1

    sub-int v1, v6, v1

    add-int/lit8 v1, v1, -0x2

    invoke-direct {v2, v13, v0, v1}, Ljava/lang/String;-><init>([CII)V

    goto :goto_87

    .line 153
    :cond_9e
    :goto_88
    new-instance v2, Ljava/lang/String;

    sub-int v1, v6, v1

    invoke-direct {v2, v13, v0, v1}, Ljava/lang/String;-><init>([CII)V

    goto :goto_87

    .line 154
    :goto_89
    invoke-static {v2, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/time/ZoneId;)Ljava/time/ZoneId;

    move-result-object v1

    :goto_8a
    if-nez v1, :cond_9f

    goto :goto_8b

    :cond_9f
    move-object v0, v1

    :goto_8b
    if-nez v0, :cond_a0

    .line 155
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    :cond_a0
    move-object/from16 v1, v20

    .line 156
    invoke-static {v3, v0, v1}, Ljava/time/ZonedDateTime;->ofLocal(Ljava/time/LocalDateTime;Ljava/time/ZoneId;Ljava/time/ZoneOffset;)Ljava/time/ZonedDateTime;

    move-result-object v0

    return-object v0

    :cond_a1
    move/from16 v10, v17

    goto/16 :goto_82

    :goto_8c
    if-ne v6, v15, :cond_a2

    const/16 v13, 0x2c

    if-ne v12, v13, :cond_a2

    if-ne v0, v15, :cond_a2

    const/16 v13, 0x2d

    if-ne v1, v13, :cond_a2

    move/from16 v12, v25

    if-ne v12, v13, :cond_a2

    if-ne v2, v15, :cond_a2

    const/16 v13, 0x3a

    if-ne v7, v13, :cond_a2

    if-ne v8, v13, :cond_a2

    add-int/lit8 v2, p1, 0x1c

    .line 157
    aget-char v2, p0, v2

    if-eq v2, v15, :cond_a5

    :cond_a2
    const/16 v2, 0x21

    if-ne v6, v2, :cond_a3

    const/16 v13, 0x2c

    if-ne v0, v13, :cond_a3

    const/16 v13, 0x20

    if-ne v5, v13, :cond_a3

    const/16 v15, 0x2d

    if-ne v14, v15, :cond_a3

    if-ne v4, v15, :cond_a3

    move/from16 v0, v24

    if-ne v0, v13, :cond_a3

    move/from16 v0, v36

    const/16 v14, 0x3a

    if-ne v0, v14, :cond_a3

    move/from16 v0, v38

    if-ne v0, v14, :cond_a3

    add-int/lit8 v0, p1, 0x1d

    aget-char v0, p0, v0

    if-eq v0, v13, :cond_a5

    :cond_a3
    const/16 v0, 0x22

    if-ne v6, v0, :cond_a4

    const/16 v13, 0x2c

    if-ne v5, v13, :cond_a4

    const/16 v13, 0x20

    if-ne v3, v13, :cond_a4

    move/from16 v4, v37

    const/16 v14, 0x2d

    if-ne v4, v14, :cond_a4

    if-ne v9, v14, :cond_a4

    move/from16 v2, v27

    if-ne v2, v13, :cond_a4

    move/from16 v14, v22

    const/16 v2, 0x3a

    if-ne v14, v2, :cond_a4

    move/from16 v4, v26

    if-ne v4, v2, :cond_a4

    add-int/lit8 v2, p1, 0x1e

    aget-char v2, p0, v2

    if-eq v2, v13, :cond_a5

    :cond_a4
    const/16 v2, 0x23

    if-ne v6, v2, :cond_a6

    const/16 v13, 0x2c

    if-ne v3, v13, :cond_a6

    const/16 v13, 0x20

    if-ne v1, v13, :cond_a6

    const/16 v14, 0x2d

    if-ne v11, v14, :cond_a6

    if-ne v10, v14, :cond_a6

    if-ne v7, v13, :cond_a6

    const/16 v7, 0x3a

    if-ne v8, v7, :cond_a6

    move/from16 v1, v44

    if-ne v1, v7, :cond_a6

    add-int/lit8 v1, p1, 0x1f

    aget-char v1, p0, v1

    if-ne v1, v13, :cond_a6

    .line 158
    :cond_a5
    new-instance v0, Ljava/lang/String;

    move-object/from16 v13, p0

    move/from16 v1, p1

    invoke-direct {v0, v13, v1, v6}, Ljava/lang/String;-><init>([CII)V

    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏哲楪世兰(Ljava/lang/String;)Ljava/time/ZonedDateTime;

    move-result-object v0

    return-object v0

    :cond_a6
    move-object/from16 v13, p0

    move/from16 v1, p1

    if-ne v6, v0, :cond_a8

    .line 159
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏:Ljava/time/format/DateTimeFormatter;

    if-nez v0, :cond_a7

    .line 160
    const-string v0, "EEE MMM dd HH:mm:ss O yyyy"

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {v0, v2}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏:Ljava/time/format/DateTimeFormatter;

    .line 161
    :cond_a7
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v13, v1, v6}, Ljava/lang/String;-><init>([CII)V

    invoke-static {v2, v0}, Ljava/time/ZonedDateTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/ZonedDateTime;

    move-result-object v0

    return-object v0

    :cond_a8
    const/16 v0, 0x1f

    if-ne v6, v0, :cond_aa

    move/from16 v14, v46

    const/16 v3, 0x2c

    if-ne v14, v3, :cond_aa

    .line 162
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲世兰:Ljava/time/format/DateTimeFormatter;

    if-nez v0, :cond_a9

    .line 163
    const-string v0, "EEE, dd MMM yyyy HH:mm:ss Z"

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {v0, v2}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲世兰:Ljava/time/format/DateTimeFormatter;

    .line 164
    :cond_a9
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v13, v1, v6}, Ljava/lang/String;-><init>([CII)V

    invoke-static {v2, v0}, Ljava/time/ZonedDateTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/ZonedDateTime;

    move-result-object v0

    return-object v0

    :cond_aa
    const/16 v20, 0x0

    return-object v20

    :cond_ab
    move-object v13, v0

    move v1, v5

    .line 165
    new-instance v0, Ljava/lang/String;

    array-length v2, v13

    sub-int/2addr v2, v1

    invoke-direct {v0, v13, v1, v2}, Ljava/lang/String;-><init>([CII)V

    .line 166
    new-instance v1, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v0, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    nop

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

.method public static 飘花落叶言子苏世兰楪哲([BIILjava/time/ZoneId;)Ljava/time/ZonedDateTime;
    .locals 73

    move-object/from16 v0, p0

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

    if-ne v2, v5, :cond_8

    add-int/lit8 v2, p1, 0x10

    .line 1
    array-length v4, v0

    const-string v12, "illegal input "

    if-gt v2, v4, :cond_7

    .line 2
    aget-byte v2, v0, p1

    int-to-char v2, v2

    add-int/lit8 v4, p1, 0x1

    .line 3
    aget-byte v4, v0, v4

    int-to-char v4, v4

    add-int/lit8 v13, p1, 0x2

    .line 4
    aget-byte v13, v0, v13

    int-to-char v13, v13

    add-int/lit8 v14, p1, 0x3

    .line 5
    aget-byte v14, v0, v14

    int-to-char v14, v14

    add-int/lit8 v15, p1, 0x4

    .line 6
    aget-byte v15, v0, v15

    int-to-char v15, v15

    add-int/lit8 v16, p1, 0x5

    .line 7
    aget-byte v7, v0, v16

    int-to-char v7, v7

    add-int/lit8 v16, p1, 0x6

    .line 8
    aget-byte v5, v0, v16

    int-to-char v5, v5

    add-int/lit8 v16, p1, 0x7

    .line 9
    aget-byte v8, v0, v16

    int-to-char v8, v8

    add-int/lit8 v16, p1, 0x8

    .line 10
    aget-byte v11, v0, v16

    int-to-char v11, v11

    add-int/lit8 v16, p1, 0x9

    .line 11
    aget-byte v10, v0, v16

    int-to-char v10, v10

    add-int/lit8 v6, p1, 0xa

    .line 12
    aget-byte v9, v0, v6

    int-to-char v9, v9

    add-int/lit8 v20, p1, 0xd

    move-object/from16 p2, v12

    .line 13
    aget-byte v12, v0, v20

    int-to-char v12, v12

    const/16 v1, 0x2d

    if-ne v15, v1, :cond_3

    if-ne v8, v1, :cond_3

    const/16 v8, 0x2b

    if-eq v9, v8, :cond_2

    if-ne v9, v1, :cond_3

    :cond_2
    const/16 v1, 0x3a

    goto :goto_0

    :cond_3
    move/from16 v5, p1

    move-object/from16 v3, p2

    const/16 v2, 0x10

    const/4 v6, 0x0

    goto/16 :goto_1

    :goto_0
    if-ne v12, v1, :cond_3

    const/16 v1, 0x30

    if-lt v2, v1, :cond_6

    const/16 v8, 0x39

    if-gt v2, v8, :cond_6

    if-lt v4, v1, :cond_6

    if-gt v4, v8, :cond_6

    if-lt v13, v1, :cond_6

    if-gt v13, v8, :cond_6

    if-lt v14, v1, :cond_6

    if-gt v14, v8, :cond_6

    sub-int/2addr v2, v1

    mul-int/lit16 v2, v2, 0x3e8

    const/16 v9, 0x64

    .line 14
    invoke-static {v4, v1, v9, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(IIII)I

    move-result v2

    const/16 v4, 0xa

    invoke-static {v13, v1, v4, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(IIII)I

    move-result v2

    sub-int/2addr v14, v1

    add-int/2addr v14, v2

    if-lt v7, v1, :cond_5

    if-gt v7, v8, :cond_5

    if-lt v5, v1, :cond_5

    if-gt v5, v8, :cond_5

    sub-int/2addr v7, v1

    mul-int/2addr v7, v4

    sub-int/2addr v5, v1

    add-int/2addr v5, v7

    if-lt v11, v1, :cond_4

    if-gt v11, v8, :cond_4

    if-lt v10, v1, :cond_4

    if-gt v10, v8, :cond_4

    sub-int/2addr v11, v1

    mul-int/2addr v11, v4

    sub-int/2addr v10, v1

    add-int/2addr v10, v11

    .line 15
    new-instance v1, Ljava/lang/String;

    const/4 v2, 0x6

    invoke-direct {v1, v0, v6, v2}, Ljava/lang/String;-><init>([BII)V

    .line 16
    invoke-static {v1, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/time/ZoneId;)Ljava/time/ZoneId;

    move-result-object v0

    .line 17
    invoke-static {v14, v5, v10}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    move-result-object v1

    sget-object v2, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    invoke-static {v1, v2}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    move-result-object v1

    .line 18
    invoke-static {v1, v0}, Ljava/time/ZonedDateTime;->of(Ljava/time/LocalDateTime;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object v0

    return-object v0

    .line 19
    :cond_4
    new-instance v1, Ljava/lang/String;

    move/from16 v5, p1

    const/16 v2, 0x10

    invoke-direct {v1, v0, v5, v2}, Ljava/lang/String;-><init>([BII)V

    .line 20
    new-instance v0, Ljava/time/format/DateTimeParseException;

    move-object/from16 v3, p2

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    invoke-direct {v0, v2, v1, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_5
    move/from16 v5, p1

    move-object/from16 v3, p2

    const/16 v2, 0x10

    const/4 v4, 0x0

    .line 21
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0, v5, v2}, Ljava/lang/String;-><init>([BII)V

    .line 22
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_6
    move/from16 v5, p1

    move-object/from16 v3, p2

    .line 23
    new-instance v1, Ljava/lang/String;

    const/16 v2, 0x10

    invoke-direct {v1, v0, v5, v2}, Ljava/lang/String;-><init>([BII)V

    .line 24
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x0

    invoke-direct {v0, v2, v1, v6}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    .line 25
    :goto_1
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0, v5, v2}, Ljava/lang/String;-><init>([BII)V

    .line 26
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1, v6}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_7
    move/from16 v5, p1

    move-object v3, v12

    const/4 v6, 0x0

    .line 27
    new-instance v1, Ljava/lang/String;

    array-length v2, v0

    sub-int/2addr v2, v5

    invoke-direct {v1, v0, v5, v2}, Ljava/lang/String;-><init>([BII)V

    .line 28
    new-instance v0, Ljava/time/format/DateTimeParseException;

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1, v6}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v0

    :cond_8
    move/from16 v5, p1

    const/4 v6, 0x0

    const/16 v1, 0x13

    if-ge v2, v1, :cond_9

    return-object v4

    .line 29
    :cond_9
    aget-byte v7, v0, v5

    int-to-char v7, v7

    add-int/lit8 v8, v5, 0x1

    .line 30
    aget-byte v8, v0, v8

    int-to-char v8, v8

    add-int/lit8 v9, v5, 0x2

    .line 31
    aget-byte v9, v0, v9

    int-to-char v9, v9

    add-int/lit8 v10, v5, 0x3

    .line 32
    aget-byte v10, v0, v10

    int-to-char v11, v10

    add-int/lit8 v12, v5, 0x4

    .line 33
    aget-byte v12, v0, v12

    int-to-char v12, v12

    add-int/lit8 v13, v5, 0x5

    .line 34
    aget-byte v13, v0, v13

    int-to-char v13, v13

    add-int/lit8 v14, v5, 0x6

    .line 35
    aget-byte v14, v0, v14

    int-to-char v14, v14

    add-int/lit8 v15, v5, 0x7

    .line 36
    aget-byte v15, v0, v15

    int-to-char v15, v15

    add-int/lit8 v17, v5, 0x8

    .line 37
    aget-byte v6, v0, v17

    int-to-char v6, v6

    add-int/lit8 v17, v5, 0x9

    move-object/from16 v20, v4

    .line 38
    aget-byte v4, v0, v17

    int-to-char v4, v4

    add-int/lit8 v17, v5, 0xa

    .line 39
    aget-byte v1, v0, v17

    int-to-char v1, v1

    add-int/lit8 v17, v5, 0xb

    move/from16 v22, v10

    .line 40
    aget-byte v10, v0, v17

    int-to-char v10, v10

    add-int/lit8 v17, v5, 0xc

    .line 41
    aget-byte v5, v0, v17

    int-to-char v5, v5

    add-int/lit8 v17, p1, 0xd

    .line 42
    aget-byte v3, v0, v17

    int-to-char v3, v3

    add-int/lit8 v17, p1, 0xe

    move/from16 v23, v4

    .line 43
    aget-byte v4, v0, v17

    int-to-char v4, v4

    add-int/lit8 v17, p1, 0xf

    move/from16 v24, v6

    .line 44
    aget-byte v6, v0, v17

    int-to-char v6, v6

    add-int/lit8 v17, p1, 0x10

    .line 45
    aget-byte v0, p0, v17

    int-to-char v0, v0

    add-int/lit8 v17, p1, 0x11

    move/from16 v25, v6

    .line 46
    aget-byte v6, p0, v17

    int-to-char v6, v6

    add-int/lit8 v17, p1, 0x12

    move/from16 v26, v5

    .line 47
    aget-byte v5, p0, v17

    int-to-char v5, v5

    move/from16 v17, v5

    const/16 v5, 0x13

    if-ne v2, v5, :cond_a

    const/16 v5, 0x20

    goto :goto_2

    :cond_a
    add-int/lit8 v21, p1, 0x13

    .line 48
    aget-byte v5, p0, v21

    int-to-char v5, v5

    :goto_2
    packed-switch v2, :pswitch_data_0

    add-int/lit8 v21, p1, 0x14

    move/from16 v28, v7

    .line 49
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x15

    move/from16 v29, v7

    .line 50
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x16

    move/from16 v30, v7

    .line 51
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x17

    move/from16 v31, v7

    .line 52
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x18

    move/from16 v32, v7

    .line 53
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x19

    move/from16 v33, v7

    .line 54
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x1a

    move/from16 v34, v7

    .line 55
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x1b

    move/from16 v35, v7

    .line 56
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x1c

    move/from16 v36, v7

    .line 57
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x1d

    move/from16 v37, v7

    .line 58
    aget-byte v7, p0, v21

    int-to-char v7, v7

    move/from16 v45, v7

    move/from16 v21, v8

    move/from16 v44, v29

    move/from16 v7, v30

    move/from16 v29, v31

    move/from16 v38, v32

    move/from16 v39, v33

    move/from16 v40, v34

    move/from16 v41, v35

    move/from16 v42, v36

    move/from16 v43, v37

    goto/16 :goto_a

    :pswitch_0
    move/from16 v28, v7

    add-int/lit8 v7, p1, 0x14

    .line 59
    aget-byte v7, p0, v7

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x15

    move/from16 v29, v7

    .line 60
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x16

    move/from16 v30, v7

    .line 61
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x17

    move/from16 v31, v7

    .line 62
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x18

    move/from16 v32, v7

    .line 63
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x19

    move/from16 v33, v7

    .line 64
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x1a

    move/from16 v34, v7

    .line 65
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x1b

    move/from16 v35, v7

    .line 66
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x1c

    move/from16 v36, v7

    .line 67
    aget-byte v7, p0, v21

    int-to-char v7, v7

    move/from16 v43, v7

    move/from16 v21, v8

    move/from16 v44, v29

    move/from16 v7, v30

    move/from16 v29, v31

    move/from16 v38, v32

    move/from16 v39, v33

    move/from16 v40, v34

    move/from16 v41, v35

    move/from16 v42, v36

    :goto_3
    const/16 v45, 0x0

    goto/16 :goto_a

    :pswitch_1
    move/from16 v28, v7

    add-int/lit8 v7, p1, 0x14

    .line 68
    aget-byte v7, p0, v7

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x15

    move/from16 v29, v7

    .line 69
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x16

    move/from16 v30, v7

    .line 70
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x17

    move/from16 v31, v7

    .line 71
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x18

    move/from16 v32, v7

    .line 72
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x19

    move/from16 v33, v7

    .line 73
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x1a

    move/from16 v34, v7

    .line 74
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x1b

    move/from16 v35, v7

    .line 75
    aget-byte v7, p0, v21

    int-to-char v7, v7

    move/from16 v42, v7

    move/from16 v21, v8

    move/from16 v44, v29

    move/from16 v7, v30

    move/from16 v29, v31

    move/from16 v38, v32

    move/from16 v39, v33

    move/from16 v40, v34

    move/from16 v41, v35

    :goto_4
    const/16 v43, 0x30

    goto :goto_3

    :pswitch_2
    move/from16 v28, v7

    add-int/lit8 v7, p1, 0x14

    .line 76
    aget-byte v7, p0, v7

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x15

    move/from16 v29, v7

    .line 77
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x16

    move/from16 v30, v7

    .line 78
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x17

    move/from16 v31, v7

    .line 79
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x18

    move/from16 v32, v7

    .line 80
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x19

    move/from16 v33, v7

    .line 81
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x1a

    move/from16 v34, v7

    .line 82
    aget-byte v7, p0, v21

    int-to-char v7, v7

    move/from16 v41, v7

    move/from16 v21, v8

    move/from16 v44, v29

    move/from16 v7, v30

    move/from16 v29, v31

    move/from16 v38, v32

    move/from16 v39, v33

    move/from16 v40, v34

    :goto_5
    const/16 v42, 0x30

    goto :goto_4

    :pswitch_3
    move/from16 v28, v7

    add-int/lit8 v7, p1, 0x14

    .line 83
    aget-byte v7, p0, v7

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x15

    move/from16 v29, v7

    .line 84
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x16

    move/from16 v30, v7

    .line 85
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x17

    move/from16 v31, v7

    .line 86
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x18

    move/from16 v32, v7

    .line 87
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x19

    move/from16 v33, v7

    .line 88
    aget-byte v7, p0, v21

    int-to-char v7, v7

    move/from16 v40, v7

    move/from16 v21, v8

    move/from16 v44, v29

    move/from16 v7, v30

    move/from16 v29, v31

    move/from16 v38, v32

    move/from16 v39, v33

    :goto_6
    const/16 v41, 0x30

    goto :goto_5

    :pswitch_4
    move/from16 v28, v7

    add-int/lit8 v7, p1, 0x14

    .line 89
    aget-byte v7, p0, v7

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x15

    move/from16 v29, v7

    .line 90
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x16

    move/from16 v30, v7

    .line 91
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x17

    move/from16 v31, v7

    .line 92
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x18

    move/from16 v32, v7

    .line 93
    aget-byte v7, p0, v21

    int-to-char v7, v7

    move/from16 v39, v7

    move/from16 v21, v8

    move/from16 v44, v29

    move/from16 v7, v30

    move/from16 v29, v31

    move/from16 v38, v32

    :goto_7
    const/16 v40, 0x30

    goto :goto_6

    :pswitch_5
    move/from16 v28, v7

    add-int/lit8 v7, p1, 0x14

    .line 94
    aget-byte v7, p0, v7

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x15

    move/from16 v29, v7

    .line 95
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x16

    move/from16 v30, v7

    .line 96
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x17

    move/from16 v31, v7

    .line 97
    aget-byte v7, p0, v21

    int-to-char v7, v7

    move/from16 v38, v7

    move/from16 v21, v8

    move/from16 v44, v29

    move/from16 v7, v30

    move/from16 v29, v31

    :goto_8
    const/16 v39, 0x30

    goto :goto_7

    :pswitch_6
    move/from16 v28, v7

    add-int/lit8 v7, p1, 0x14

    .line 98
    aget-byte v7, p0, v7

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x15

    move/from16 v29, v7

    .line 99
    aget-byte v7, p0, v21

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x16

    move/from16 v30, v7

    .line 100
    aget-byte v7, p0, v21

    int-to-char v7, v7

    move/from16 v21, v8

    move/from16 v44, v29

    const/16 v38, 0x30

    const/16 v39, 0x30

    const/16 v40, 0x30

    const/16 v41, 0x30

    const/16 v42, 0x30

    const/16 v43, 0x30

    const/16 v45, 0x0

    move/from16 v29, v7

    move/from16 v7, v30

    goto :goto_a

    :pswitch_7
    move/from16 v28, v7

    add-int/lit8 v7, p1, 0x14

    .line 101
    aget-byte v7, p0, v7

    int-to-char v7, v7

    add-int/lit8 v21, p1, 0x15

    move/from16 v29, v7

    .line 102
    aget-byte v7, p0, v21

    int-to-char v7, v7

    move/from16 v21, v8

    move/from16 v44, v29

    :goto_9
    const/16 v29, 0x30

    const/16 v38, 0x30

    goto :goto_8

    :pswitch_8
    move/from16 v28, v7

    add-int/lit8 v7, p1, 0x14

    .line 103
    aget-byte v7, p0, v7

    int-to-char v7, v7

    move/from16 v44, v7

    move/from16 v21, v8

    const/16 v7, 0x30

    goto :goto_9

    :pswitch_9
    move/from16 v28, v7

    move/from16 v21, v8

    const/16 v7, 0x30

    const/16 v29, 0x30

    const/16 v38, 0x30

    const/16 v39, 0x30

    const/16 v40, 0x30

    const/16 v41, 0x30

    const/16 v42, 0x30

    const/16 v43, 0x30

    const/16 v44, 0x0

    goto/16 :goto_3

    :goto_a
    const/16 v32, 0x1

    const/16 v8, 0x2d

    if-ne v12, v8, :cond_d

    if-ne v15, v8, :cond_d

    const/16 v8, 0x20

    if-eq v1, v8, :cond_b

    const/16 v8, 0x54

    if-ne v1, v8, :cond_d

    :cond_b
    const/16 v8, 0x3a

    if-ne v3, v8, :cond_d

    if-ne v0, v8, :cond_d

    const/16 v8, 0x5b

    if-eq v5, v8, :cond_c

    const/16 v8, 0x5a

    if-eq v5, v8, :cond_c

    const/16 v8, 0x2b

    if-eq v5, v8, :cond_c

    const/16 v8, 0x2d

    if-eq v5, v8, :cond_c

    const/16 v8, 0x20

    if-ne v5, v8, :cond_d

    :cond_c
    move-object/from16 v12, p0

    move/from16 v59, v4

    move/from16 v61, v6

    move/from16 v51, v9

    move/from16 v52, v11

    move/from16 v53, v13

    move/from16 v54, v14

    move/from16 v62, v17

    move-object/from16 v6, v20

    move/from16 v50, v21

    move/from16 v56, v23

    move/from16 v55, v24

    move/from16 v60, v25

    move/from16 v3, v26

    move/from16 v49, v28

    const/4 v0, 0x0

    const/16 v1, 0x13

    const/16 v63, 0x30

    :goto_b
    const/16 v64, 0x30

    :goto_c
    const/16 v65, 0x30

    const/16 v66, 0x30

    const/16 v67, 0x30

    const/16 v68, 0x30

    const/16 v69, 0x30

    const/16 v70, 0x30

    const/16 v71, 0x30

    const/4 v4, 0x0

    :goto_d
    move v11, v10

    goto/16 :goto_88

    :cond_d
    const/16 v8, 0x2d

    if-ne v12, v8, :cond_e

    if-ne v15, v8, :cond_e

    const/16 v8, 0x20

    if-ne v1, v8, :cond_e

    if-ne v10, v8, :cond_e

    const/16 v8, 0x3a

    if-ne v4, v8, :cond_e

    if-ne v6, v8, :cond_e

    const/16 v8, 0x14

    if-ne v2, v8, :cond_f

    const/4 v4, 0x0

    move-object/from16 v12, p0

    move/from16 v60, v0

    move/from16 v62, v5

    move v1, v8

    move/from16 v51, v9

    move/from16 v52, v11

    move/from16 v53, v13

    move/from16 v54, v14

    move/from16 v61, v17

    move-object/from16 v6, v20

    move/from16 v50, v21

    move/from16 v56, v23

    move/from16 v55, v24

    move/from16 v59, v25

    move/from16 v11, v26

    move/from16 v49, v28

    const/4 v0, 0x0

    :goto_e
    const/16 v63, 0x30

    const/16 v64, 0x30

    const/16 v65, 0x30

    :goto_f
    const/16 v66, 0x30

    const/16 v67, 0x30

    const/16 v68, 0x30

    const/16 v69, 0x30

    const/16 v70, 0x30

    const/16 v71, 0x30

    goto/16 :goto_88

    :cond_e
    const/16 v8, 0x14

    :cond_f
    if-ne v2, v8, :cond_11

    const/16 v8, 0x20

    if-ne v9, v8, :cond_11

    if-ne v14, v8, :cond_11

    if-ne v10, v8, :cond_11

    const/16 v8, 0x3a

    if-ne v4, v8, :cond_11

    if-ne v6, v8, :cond_11

    .line 104
    invoke-static {v11, v12, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    move-result v4

    if-lez v4, :cond_10

    .line 105
    div-int/lit8 v6, v4, 0xa

    const/16 v19, 0x30

    add-int/lit8 v6, v6, 0x30

    int-to-char v6, v6

    const/16 v18, 0xa

    .line 106
    rem-int/lit8 v4, v4, 0xa

    add-int/lit8 v4, v4, 0x30

    int-to-char v4, v4

    goto :goto_10

    :cond_10
    const/16 v4, 0x30

    const/16 v6, 0x30

    :goto_10
    move-object/from16 v12, p0

    move/from16 v60, v0

    move/from16 v52, v1

    move/from16 v54, v4

    move/from16 v62, v5

    move/from16 v53, v6

    move/from16 v49, v15

    move/from16 v61, v17

    move-object/from16 v6, v20

    move/from16 v56, v21

    move/from16 v51, v23

    move/from16 v50, v24

    move/from16 v59, v25

    move/from16 v11, v26

    move/from16 v55, v28

    const/4 v0, 0x0

    const/16 v1, 0x14

    const/16 v63, 0x30

    const/16 v64, 0x30

    const/16 v65, 0x30

    const/16 v66, 0x30

    const/16 v67, 0x30

    const/16 v68, 0x30

    const/16 v69, 0x30

    :goto_11
    const/16 v70, 0x30

    :goto_12
    const/16 v71, 0x30

    :goto_13
    const/4 v4, 0x0

    goto/16 :goto_88

    :cond_11
    const/16 v8, 0x2d

    if-ne v12, v8, :cond_15

    if-ne v15, v8, :cond_15

    const/16 v8, 0x20

    if-eq v1, v8, :cond_12

    const/16 v8, 0x54

    if-ne v1, v8, :cond_15

    :cond_12
    const/16 v8, 0x3a

    if-ne v3, v8, :cond_15

    if-ne v0, v8, :cond_15

    const/16 v8, 0x2e

    if-ne v5, v8, :cond_15

    const/16 v8, 0x15

    if-eq v2, v8, :cond_13

    const/16 v8, 0x5b

    if-eq v7, v8, :cond_13

    const/16 v8, 0x2b

    if-eq v7, v8, :cond_13

    const/16 v8, 0x2d

    if-eq v7, v8, :cond_13

    const/16 v8, 0x5a

    if-ne v7, v8, :cond_15

    :cond_13
    const/16 v0, 0x7c

    if-ne v7, v0, :cond_14

    move/from16 v0, v32

    goto :goto_14

    :cond_14
    const/4 v0, 0x0

    :goto_14
    move-object/from16 v12, p0

    move/from16 v59, v4

    move/from16 v61, v6

    move/from16 v51, v9

    move/from16 v52, v11

    move/from16 v53, v13

    move/from16 v54, v14

    move/from16 v62, v17

    move-object/from16 v6, v20

    move/from16 v50, v21

    move/from16 v56, v23

    move/from16 v55, v24

    move/from16 v60, v25

    move/from16 v3, v26

    move/from16 v49, v28

    move/from16 v63, v44

    const/16 v1, 0x15

    goto/16 :goto_b

    :cond_15
    const/16 v8, 0x2d

    if-ne v12, v8, :cond_17

    if-ne v15, v8, :cond_17

    const/16 v8, 0x20

    if-eq v1, v8, :cond_16

    const/16 v8, 0x54

    if-ne v1, v8, :cond_17

    :cond_16
    const/16 v8, 0x3a

    goto :goto_15

    :cond_17
    move/from16 v8, v29

    move/from16 v29, v4

    goto/16 :goto_19

    :goto_15
    if-ne v3, v8, :cond_17

    if-ne v0, v8, :cond_17

    const/16 v8, 0x2e

    if-ne v5, v8, :cond_17

    const/16 v8, 0x16

    if-eq v2, v8, :cond_19

    move/from16 v8, v29

    move/from16 v29, v4

    const/16 v4, 0x5b

    if-eq v8, v4, :cond_18

    const/16 v4, 0x2b

    if-eq v8, v4, :cond_18

    const/16 v4, 0x2d

    if-eq v8, v4, :cond_18

    const/16 v4, 0x5a

    if-ne v8, v4, :cond_1b

    :cond_18
    :goto_16
    const/16 v0, 0x7c

    goto :goto_17

    :cond_19
    move/from16 v8, v29

    move/from16 v29, v4

    goto :goto_16

    :goto_17
    if-ne v8, v0, :cond_1a

    move/from16 v4, v32

    goto :goto_18

    :cond_1a
    const/4 v4, 0x0

    :goto_18
    move-object/from16 v12, p0

    move v0, v4

    move/from16 v61, v6

    move/from16 v64, v7

    move/from16 v51, v9

    move/from16 v52, v11

    move/from16 v53, v13

    move/from16 v54, v14

    move/from16 v62, v17

    move-object/from16 v6, v20

    move/from16 v50, v21

    move/from16 v56, v23

    move/from16 v55, v24

    move/from16 v60, v25

    move/from16 v3, v26

    move/from16 v49, v28

    move/from16 v59, v29

    move/from16 v63, v44

    const/16 v1, 0x16

    goto/16 :goto_c

    :cond_1b
    :goto_19
    const/16 v4, 0x2d

    if-ne v12, v4, :cond_1d

    if-ne v15, v4, :cond_1d

    const/16 v4, 0x20

    if-eq v1, v4, :cond_1c

    const/16 v4, 0x54

    if-ne v1, v4, :cond_1d

    :cond_1c
    const/16 v4, 0x3a

    if-ne v3, v4, :cond_1d

    const/16 v4, 0x5a

    if-ne v0, v4, :cond_1d

    const/16 v4, 0x5b

    if-ne v6, v4, :cond_1d

    const/16 v4, 0x5d

    if-ne v7, v4, :cond_1d

    const/16 v4, 0x16

    if-ne v2, v4, :cond_1d

    const/4 v4, 0x0

    move-object/from16 v12, p0

    move/from16 v51, v9

    move/from16 v52, v11

    move/from16 v53, v13

    move/from16 v54, v14

    move-object/from16 v6, v20

    move/from16 v50, v21

    move/from16 v56, v23

    move/from16 v55, v24

    move/from16 v60, v25

    move/from16 v3, v26

    move/from16 v49, v28

    move/from16 v59, v29

    move/from16 v0, v32

    const/16 v1, 0x11

    const/16 v61, 0x30

    const/16 v62, 0x30

    :goto_1a
    const/16 v63, 0x30

    const/16 v64, 0x30

    const/16 v65, 0x30

    const/16 v66, 0x30

    const/16 v67, 0x30

    const/16 v68, 0x30

    const/16 v69, 0x30

    const/16 v70, 0x30

    const/16 v71, 0x30

    goto/16 :goto_d

    :cond_1d
    const/16 v4, 0x16

    if-ne v2, v4, :cond_24

    const/16 v4, 0x20

    if-ne v11, v4, :cond_24

    move/from16 v47, v12

    const/16 v12, 0x2c

    if-ne v13, v12, :cond_23

    if-ne v14, v4, :cond_23

    if-ne v10, v4, :cond_23

    const/16 v12, 0x3a

    if-ne v3, v12, :cond_23

    if-ne v0, v12, :cond_23

    if-ne v5, v4, :cond_23

    move/from16 v4, v44

    const/16 v12, 0x41

    if-eq v4, v12, :cond_1e

    const/16 v12, 0x50

    if-ne v4, v12, :cond_1f

    :cond_1e
    const/16 v12, 0x4d

    goto :goto_1c

    :cond_1f
    move/from16 v12, v21

    move/from16 v21, v15

    move v15, v12

    :goto_1b
    const/16 v12, 0x16

    goto/16 :goto_22

    :goto_1c
    if-ne v7, v12, :cond_22

    move/from16 v12, v21

    move/from16 v21, v15

    move v15, v12

    move/from16 v12, v28

    .line 107
    invoke-static {v12, v15, v9}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    move-result v0

    if-lez v0, :cond_20

    .line 108
    div-int/lit8 v3, v0, 0xa

    const/16 v19, 0x30

    add-int/lit8 v3, v3, 0x30

    int-to-char v3, v3

    const/16 v18, 0xa

    .line 109
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    :goto_1d
    const/16 v12, 0x50

    goto :goto_1e

    :cond_20
    const/16 v0, 0x30

    const/16 v3, 0x30

    goto :goto_1d

    :goto_1e
    if-ne v4, v12, :cond_21

    move/from16 v4, v32

    goto :goto_1f

    :cond_21
    const/4 v4, 0x0

    :goto_1f
    const/16 v11, 0x30

    move-object/from16 v12, p0

    move/from16 v54, v0

    move/from16 v52, v1

    move/from16 v53, v3

    move/from16 v61, v6

    move/from16 v62, v17

    move-object/from16 v6, v20

    move/from16 v49, v21

    move/from16 v51, v23

    move/from16 v50, v24

    move/from16 v60, v25

    move/from16 v3, v26

    move/from16 v59, v29

    move/from16 v56, v47

    const/4 v0, 0x0

    const/16 v1, 0x16

    :goto_20
    const/16 v55, 0x30

    goto/16 :goto_e

    :cond_22
    move/from16 v72, v21

    move/from16 v21, v15

    move/from16 v15, v72

    goto :goto_1b

    :cond_23
    move/from16 v4, v21

    move/from16 v21, v15

    move v15, v4

    :goto_21
    move/from16 v4, v44

    goto :goto_1b

    :cond_24
    move/from16 v4, v21

    move/from16 v21, v15

    move v15, v4

    move/from16 v47, v12

    goto :goto_21

    :goto_22
    if-ne v2, v12, :cond_25

    const/16 v12, 0x2f

    if-ne v9, v12, :cond_25

    if-ne v13, v12, :cond_25

    const/16 v12, 0x20

    if-ne v1, v12, :cond_25

    const/16 v12, 0x3a

    if-ne v3, v12, :cond_25

    if-ne v0, v12, :cond_25

    const/16 v12, 0x20

    if-ne v5, v12, :cond_25

    const/16 v12, 0x41

    if-eq v4, v12, :cond_26

    const/16 v12, 0x50

    if-ne v4, v12, :cond_25

    :goto_23
    move/from16 v44, v5

    const/16 v5, 0x4d

    goto :goto_24

    :cond_25
    move/from16 v44, v5

    goto :goto_26

    :cond_26
    const/16 v12, 0x50

    goto :goto_23

    :goto_24
    if-ne v7, v5, :cond_28

    if-ne v4, v12, :cond_27

    move/from16 v4, v32

    goto :goto_25

    :cond_27
    const/4 v4, 0x0

    :goto_25
    move-object/from16 v12, p0

    move/from16 v61, v6

    move/from16 v55, v11

    move/from16 v49, v14

    move/from16 v54, v15

    move/from16 v62, v17

    move-object/from16 v6, v20

    move/from16 v50, v21

    move/from16 v52, v23

    move/from16 v51, v24

    move/from16 v60, v25

    move/from16 v3, v26

    move/from16 v53, v28

    move/from16 v59, v29

    move/from16 v56, v47

    const/4 v0, 0x0

    const/16 v1, 0x16

    goto/16 :goto_1a

    :cond_28
    :goto_26
    const/16 v5, 0x17

    if-ne v2, v5, :cond_2d

    const/16 v12, 0x20

    if-ne v11, v12, :cond_2d

    const/16 v5, 0x2c

    if-ne v13, v5, :cond_2d

    if-ne v14, v12, :cond_2d

    if-ne v10, v12, :cond_2d

    move/from16 v5, v29

    const/16 v12, 0x3a

    if-ne v5, v12, :cond_2a

    if-ne v6, v12, :cond_2a

    const/16 v12, 0x20

    if-ne v4, v12, :cond_2a

    const/16 v12, 0x41

    if-eq v7, v12, :cond_29

    const/16 v12, 0x50

    if-ne v7, v12, :cond_2a

    :cond_29
    const/16 v12, 0x4d

    goto :goto_28

    :cond_2a
    move/from16 v12, v28

    :goto_27
    move/from16 v28, v0

    const/16 v0, 0x17

    goto :goto_2d

    :goto_28
    if-ne v8, v12, :cond_2a

    move/from16 v12, v28

    .line 110
    invoke-static {v12, v15, v9}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    move-result v4

    if-lez v4, :cond_2b

    .line 111
    div-int/lit8 v5, v4, 0xa

    const/16 v19, 0x30

    add-int/lit8 v5, v5, 0x30

    int-to-char v5, v5

    const/16 v18, 0xa

    .line 112
    rem-int/lit8 v4, v4, 0xa

    add-int/lit8 v4, v4, 0x30

    int-to-char v4, v4

    :goto_29
    const/16 v12, 0x50

    goto :goto_2a

    :cond_2b
    const/16 v4, 0x30

    const/16 v5, 0x30

    goto :goto_29

    :goto_2a
    if-ne v7, v12, :cond_2c

    move/from16 v6, v32

    goto :goto_2b

    :cond_2c
    const/4 v6, 0x0

    :goto_2b
    move-object/from16 v12, p0

    move/from16 v60, v0

    move/from16 v52, v1

    move/from16 v54, v4

    move/from16 v53, v5

    move v4, v6

    move/from16 v61, v17

    move-object/from16 v6, v20

    move/from16 v49, v21

    move/from16 v51, v23

    move/from16 v50, v24

    move/from16 v59, v25

    move/from16 v11, v26

    :goto_2c
    move/from16 v62, v44

    move/from16 v56, v47

    const/4 v0, 0x0

    const/16 v1, 0x17

    goto/16 :goto_20

    :cond_2d
    move/from16 v12, v28

    move/from16 v5, v29

    goto :goto_27

    :goto_2d
    if-ne v2, v0, :cond_33

    const/16 v0, 0x20

    move/from16 v29, v1

    if-ne v11, v0, :cond_32

    const/16 v1, 0x2c

    if-ne v14, v1, :cond_32

    move/from16 v1, v21

    move/from16 v21, v3

    move/from16 v3, v26

    if-ne v1, v0, :cond_2f

    if-ne v3, v0, :cond_2f

    const/16 v0, 0x3a

    if-ne v5, v0, :cond_2f

    if-ne v6, v0, :cond_2f

    const/16 v0, 0x20

    if-ne v4, v0, :cond_2f

    const/16 v0, 0x41

    if-eq v7, v0, :cond_2e

    const/16 v0, 0x50

    if-ne v7, v0, :cond_2f

    :cond_2e
    const/16 v0, 0x4d

    goto :goto_2f

    :cond_2f
    :goto_2e
    const/16 v0, 0x17

    goto :goto_33

    :goto_2f
    if-ne v8, v0, :cond_2f

    .line 113
    invoke-static {v12, v15, v9}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    move-result v0

    if-lez v0, :cond_30

    .line 114
    div-int/lit8 v1, v0, 0xa

    const/16 v19, 0x30

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    const/16 v18, 0xa

    .line 115
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    :goto_30
    const/16 v12, 0x50

    goto :goto_31

    :cond_30
    const/16 v0, 0x30

    const/16 v1, 0x30

    goto :goto_30

    :goto_31
    if-ne v7, v12, :cond_31

    move/from16 v4, v32

    goto :goto_32

    :cond_31
    const/4 v4, 0x0

    :goto_32
    const/16 v11, 0x30

    move-object/from16 v12, p0

    move/from16 v54, v0

    move/from16 v53, v1

    move/from16 v52, v10

    move/from16 v56, v13

    move/from16 v61, v17

    move-object/from16 v6, v20

    move/from16 v3, v21

    move/from16 v50, v23

    move/from16 v49, v24

    move/from16 v59, v25

    move/from16 v60, v28

    move/from16 v51, v29

    move/from16 v62, v44

    move/from16 v55, v47

    const/4 v0, 0x0

    const/16 v1, 0x17

    goto/16 :goto_e

    :cond_32
    move/from16 v1, v21

    move/from16 v21, v3

    move/from16 v3, v26

    goto :goto_2e

    :cond_33
    move/from16 v29, v1

    move/from16 v1, v21

    move/from16 v21, v3

    move/from16 v3, v26

    :goto_33
    if-ne v2, v0, :cond_37

    const/16 v0, 0x20

    if-ne v11, v0, :cond_37

    move/from16 v26, v1

    const/16 v1, 0x2c

    if-ne v13, v1, :cond_38

    if-ne v14, v0, :cond_38

    if-ne v10, v1, :cond_38

    if-ne v3, v0, :cond_38

    const/16 v1, 0x3a

    if-ne v5, v1, :cond_38

    if-ne v6, v1, :cond_38

    if-ne v4, v0, :cond_38

    const/16 v0, 0x41

    if-eq v7, v0, :cond_34

    const/16 v0, 0x50

    if-ne v7, v0, :cond_38

    :cond_34
    const/16 v0, 0x4d

    if-ne v8, v0, :cond_38

    .line 116
    invoke-static {v12, v15, v9}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    move-result v0

    if-lez v0, :cond_35

    .line 117
    div-int/lit8 v1, v0, 0xa

    const/16 v19, 0x30

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    const/16 v18, 0xa

    .line 118
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    :goto_34
    const/16 v12, 0x50

    goto :goto_35

    :cond_35
    const/16 v0, 0x30

    const/16 v1, 0x30

    goto :goto_34

    :goto_35
    if-ne v7, v12, :cond_36

    move/from16 v4, v32

    goto :goto_36

    :cond_36
    const/4 v4, 0x0

    :goto_36
    const/16 v11, 0x30

    move-object/from16 v12, p0

    move/from16 v54, v0

    move/from16 v53, v1

    move/from16 v61, v17

    move-object/from16 v6, v20

    move/from16 v3, v21

    move/from16 v51, v23

    move/from16 v50, v24

    move/from16 v59, v25

    move/from16 v49, v26

    move/from16 v60, v28

    move/from16 v52, v29

    goto/16 :goto_2c

    :cond_37
    move/from16 v26, v1

    :cond_38
    const/16 v0, 0x18

    if-ne v2, v0, :cond_40

    const/16 v1, 0x20

    if-ne v11, v1, :cond_40

    const/16 v0, 0x2c

    if-ne v14, v0, :cond_40

    move/from16 v0, v26

    if-ne v0, v1, :cond_3f

    if-ne v3, v1, :cond_3f

    move/from16 v1, v25

    move/from16 v25, v4

    const/16 v4, 0x3a

    move/from16 v26, v5

    move/from16 v5, v17

    if-ne v1, v4, :cond_3e

    if-ne v5, v4, :cond_3a

    const/16 v4, 0x20

    if-ne v7, v4, :cond_3a

    const/16 v4, 0x41

    if-eq v8, v4, :cond_39

    const/16 v4, 0x50

    if-ne v8, v4, :cond_3a

    :cond_39
    move/from16 v17, v6

    move/from16 v4, v38

    const/16 v6, 0x4d

    goto :goto_39

    :cond_3a
    :goto_37
    move/from16 v17, v6

    move/from16 v4, v38

    :cond_3b
    :goto_38
    const/16 v6, 0x18

    goto/16 :goto_3f

    :goto_39
    if-ne v4, v6, :cond_3b

    .line 119
    invoke-static {v12, v15, v9}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    move-result v0

    if-lez v0, :cond_3c

    .line 120
    div-int/lit8 v1, v0, 0xa

    const/16 v19, 0x30

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    const/16 v18, 0xa

    .line 121
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    :goto_3a
    const/16 v12, 0x50

    goto :goto_3b

    :cond_3c
    const/16 v0, 0x30

    const/16 v1, 0x30

    goto :goto_3a

    :goto_3b
    if-ne v8, v12, :cond_3d

    move/from16 v4, v32

    goto :goto_3c

    :cond_3d
    const/4 v4, 0x0

    :goto_3c
    move-object/from16 v12, p0

    move/from16 v54, v0

    move/from16 v53, v1

    move/from16 v52, v10

    move/from16 v56, v13

    move/from16 v60, v17

    move-object/from16 v6, v20

    move/from16 v11, v21

    move/from16 v50, v23

    move/from16 v49, v24

    move/from16 v62, v25

    move/from16 v3, v26

    move/from16 v59, v28

    move/from16 v51, v29

    :goto_3d
    move/from16 v61, v44

    move/from16 v55, v47

    const/4 v0, 0x0

    const/16 v1, 0x18

    goto/16 :goto_e

    :cond_3e
    :goto_3e
    move/from16 v4, v38

    move/from16 v17, v6

    goto :goto_38

    :cond_3f
    move/from16 v26, v5

    move/from16 v5, v17

    move/from16 v1, v25

    move/from16 v25, v4

    goto :goto_37

    :cond_40
    move/from16 v1, v25

    move/from16 v0, v26

    move/from16 v25, v4

    move/from16 v26, v5

    move/from16 v5, v17

    goto :goto_3e

    :goto_3f
    if-ne v2, v6, :cond_46

    const/16 v6, 0x20

    move/from16 v38, v10

    if-ne v11, v6, :cond_45

    const/16 v10, 0x2c

    if-ne v14, v10, :cond_45

    if-ne v0, v6, :cond_45

    if-ne v3, v10, :cond_45

    move/from16 v10, v21

    if-ne v10, v6, :cond_42

    const/16 v6, 0x3a

    if-ne v1, v6, :cond_42

    if-ne v5, v6, :cond_42

    const/16 v6, 0x20

    if-ne v7, v6, :cond_42

    const/16 v6, 0x41

    if-eq v8, v6, :cond_41

    const/16 v6, 0x50

    if-ne v8, v6, :cond_42

    :cond_41
    const/16 v6, 0x4d

    goto :goto_41

    :cond_42
    :goto_40
    const/16 v6, 0x18

    goto :goto_45

    :goto_41
    if-ne v4, v6, :cond_42

    .line 122
    invoke-static {v12, v15, v9}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    move-result v0

    if-lez v0, :cond_43

    .line 123
    div-int/lit8 v1, v0, 0xa

    const/16 v19, 0x30

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    const/16 v18, 0xa

    .line 124
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    :goto_42
    const/16 v12, 0x50

    goto :goto_43

    :cond_43
    const/16 v0, 0x30

    const/16 v1, 0x30

    goto :goto_42

    :goto_43
    if-ne v8, v12, :cond_44

    move/from16 v4, v32

    goto :goto_44

    :cond_44
    const/4 v4, 0x0

    :goto_44
    const/16 v11, 0x30

    move-object/from16 v12, p0

    move/from16 v54, v0

    move/from16 v53, v1

    move/from16 v56, v13

    move/from16 v60, v17

    move-object/from16 v6, v20

    move/from16 v50, v23

    move/from16 v49, v24

    move/from16 v62, v25

    move/from16 v3, v26

    move/from16 v59, v28

    move/from16 v51, v29

    move/from16 v52, v38

    goto/16 :goto_3d

    :cond_45
    move/from16 v10, v21

    goto :goto_40

    :cond_46
    move/from16 v38, v10

    move/from16 v10, v21

    :goto_45
    if-ne v2, v6, :cond_4c

    const/16 v6, 0x20

    if-ne v11, v6, :cond_4c

    move/from16 v21, v11

    const/16 v11, 0x2c

    if-ne v13, v11, :cond_4b

    if-ne v14, v6, :cond_4b

    move/from16 v48, v13

    move/from16 v13, v38

    if-ne v13, v11, :cond_48

    if-ne v3, v6, :cond_48

    const/16 v11, 0x3a

    if-ne v1, v11, :cond_48

    if-ne v5, v11, :cond_48

    if-ne v7, v6, :cond_48

    const/16 v6, 0x41

    if-eq v8, v6, :cond_47

    const/16 v6, 0x50

    if-ne v8, v6, :cond_48

    :cond_47
    const/16 v6, 0x4d

    goto :goto_47

    :cond_48
    :goto_46
    move/from16 v6, v47

    const/16 v11, 0x2d

    goto :goto_4c

    :goto_47
    if-ne v4, v6, :cond_48

    .line 125
    invoke-static {v12, v15, v9}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    move-result v1

    if-lez v1, :cond_49

    .line 126
    div-int/lit8 v3, v1, 0xa

    const/16 v19, 0x30

    add-int/lit8 v3, v3, 0x30

    int-to-char v3, v3

    const/16 v18, 0xa

    .line 127
    rem-int/lit8 v1, v1, 0xa

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    :goto_48
    const/16 v12, 0x50

    goto :goto_49

    :cond_49
    const/16 v1, 0x30

    const/16 v3, 0x30

    goto :goto_48

    :goto_49
    if-ne v8, v12, :cond_4a

    move/from16 v4, v32

    goto :goto_4a

    :cond_4a
    const/4 v4, 0x0

    :goto_4a
    move-object/from16 v12, p0

    move/from16 v49, v0

    move/from16 v54, v1

    move/from16 v53, v3

    move v11, v10

    move/from16 v60, v17

    move-object/from16 v6, v20

    move/from16 v51, v23

    move/from16 v50, v24

    move/from16 v62, v25

    move/from16 v3, v26

    move/from16 v59, v28

    move/from16 v52, v29

    move/from16 v61, v44

    move/from16 v56, v47

    const/4 v0, 0x0

    const/16 v1, 0x18

    goto/16 :goto_20

    :cond_4b
    :goto_4b
    move/from16 v48, v13

    move/from16 v13, v38

    goto :goto_46

    :cond_4c
    move/from16 v21, v11

    goto :goto_4b

    :goto_4c
    if-ne v6, v11, :cond_54

    if-ne v0, v11, :cond_54

    move/from16 v38, v13

    move/from16 v11, v29

    const/16 v13, 0x20

    if-eq v11, v13, :cond_4d

    const/16 v13, 0x54

    if-ne v11, v13, :cond_4e

    :cond_4d
    const/16 v13, 0x3a

    goto :goto_4f

    :cond_4e
    move/from16 v29, v7

    move/from16 v7, v28

    move/from16 v13, v44

    :goto_4d
    move/from16 v28, v5

    :cond_4f
    :goto_4e
    const/16 v5, 0x2d

    goto/16 :goto_55

    :goto_4f
    if-ne v10, v13, :cond_4e

    move/from16 v29, v7

    move/from16 v7, v28

    move/from16 v28, v5

    if-ne v7, v13, :cond_53

    move/from16 v13, v44

    const/16 v5, 0x2e

    if-ne v13, v5, :cond_4f

    const/16 v5, 0x17

    if-eq v2, v5, :cond_50

    const/16 v5, 0x5b

    if-eq v4, v5, :cond_50

    const/16 v5, 0x7c

    if-eq v4, v5, :cond_51

    const/16 v5, 0x2b

    if-eq v4, v5, :cond_50

    const/16 v5, 0x2d

    if-eq v4, v5, :cond_50

    const/16 v5, 0x5a

    if-ne v4, v5, :cond_4f

    :cond_50
    const/16 v0, 0x7c

    goto :goto_50

    :cond_51
    move v0, v5

    :goto_50
    if-ne v4, v0, :cond_52

    move/from16 v4, v32

    goto :goto_51

    :cond_52
    const/4 v4, 0x0

    :goto_51
    move/from16 v60, v1

    move v0, v4

    move/from16 v65, v8

    move/from16 v51, v9

    move/from16 v49, v12

    move/from16 v54, v14

    move/from16 v50, v15

    move/from16 v61, v17

    move-object/from16 v6, v20

    move/from16 v52, v21

    move/from16 v56, v23

    move/from16 v55, v24

    move/from16 v63, v25

    move/from16 v59, v26

    move/from16 v62, v28

    move/from16 v64, v29

    move/from16 v11, v38

    move/from16 v53, v48

    const/16 v1, 0x17

    const/16 v66, 0x30

    :goto_52
    const/16 v67, 0x30

    :goto_53
    const/16 v68, 0x30

    :goto_54
    const/16 v69, 0x30

    const/16 v70, 0x30

    const/16 v71, 0x30

    const/4 v4, 0x0

    move-object/from16 v12, p0

    goto/16 :goto_88

    :cond_53
    move/from16 v13, v44

    goto :goto_4e

    :cond_54
    move/from16 v38, v13

    move/from16 v11, v29

    move/from16 v13, v44

    move/from16 v29, v7

    move/from16 v7, v28

    goto :goto_4d

    :goto_55
    if-ne v6, v5, :cond_56

    if-ne v0, v5, :cond_56

    const/16 v5, 0x20

    if-eq v11, v5, :cond_55

    const/16 v5, 0x54

    if-ne v11, v5, :cond_56

    :cond_55
    const/16 v5, 0x3a

    goto :goto_56

    :cond_56
    move/from16 v5, v39

    move/from16 v39, v1

    goto/16 :goto_5a

    :goto_56
    if-ne v10, v5, :cond_56

    if-ne v7, v5, :cond_56

    const/16 v5, 0x2e

    if-ne v13, v5, :cond_56

    const/16 v5, 0x18

    if-eq v2, v5, :cond_59

    move/from16 v5, v39

    move/from16 v39, v1

    const/16 v1, 0x5b

    if-eq v5, v1, :cond_57

    const/16 v1, 0x7c

    if-eq v5, v1, :cond_58

    const/16 v1, 0x2b

    if-eq v5, v1, :cond_57

    const/16 v1, 0x2d

    if-eq v5, v1, :cond_57

    const/16 v1, 0x5a

    if-ne v5, v1, :cond_5b

    :cond_57
    :goto_57
    const/16 v0, 0x7c

    goto :goto_58

    :cond_58
    move v0, v1

    goto :goto_58

    :cond_59
    move/from16 v5, v39

    move/from16 v39, v1

    goto :goto_57

    :goto_58
    if-ne v5, v0, :cond_5a

    move/from16 v0, v32

    goto :goto_59

    :cond_5a
    const/4 v0, 0x0

    :goto_59
    move/from16 v66, v4

    move/from16 v65, v8

    move/from16 v51, v9

    move/from16 v49, v12

    move/from16 v54, v14

    move/from16 v50, v15

    move/from16 v61, v17

    move-object/from16 v6, v20

    move/from16 v52, v21

    move/from16 v56, v23

    move/from16 v55, v24

    move/from16 v63, v25

    move/from16 v59, v26

    move/from16 v62, v28

    move/from16 v64, v29

    move/from16 v11, v38

    move/from16 v60, v39

    move/from16 v53, v48

    const/16 v1, 0x18

    goto/16 :goto_52

    :cond_5b
    :goto_5a
    const/16 v1, 0x2d

    if-ne v6, v1, :cond_5d

    if-ne v0, v1, :cond_5d

    const/16 v1, 0x20

    if-eq v11, v1, :cond_5c

    const/16 v1, 0x54

    if-ne v11, v1, :cond_5d

    :cond_5c
    const/16 v1, 0x3a

    goto :goto_5b

    :cond_5d
    move/from16 v1, v40

    move/from16 v40, v11

    :cond_5e
    const/16 v11, 0x19

    goto/16 :goto_5f

    :goto_5b
    if-ne v10, v1, :cond_5d

    if-ne v7, v1, :cond_5d

    const/16 v1, 0x2e

    if-ne v13, v1, :cond_5d

    const/16 v1, 0x19

    if-eq v2, v1, :cond_61

    move/from16 v1, v40

    move/from16 v40, v11

    const/16 v11, 0x5b

    if-eq v1, v11, :cond_5f

    const/16 v11, 0x7c

    if-eq v1, v11, :cond_60

    const/16 v11, 0x2b

    if-eq v1, v11, :cond_5f

    const/16 v11, 0x2d

    if-eq v1, v11, :cond_5f

    const/16 v11, 0x5a

    if-ne v1, v11, :cond_5e

    :cond_5f
    :goto_5c
    const/16 v0, 0x7c

    goto :goto_5d

    :cond_60
    move v0, v11

    goto :goto_5d

    :cond_61
    move/from16 v1, v40

    goto :goto_5c

    :goto_5d
    if-ne v1, v0, :cond_62

    move/from16 v0, v32

    goto :goto_5e

    :cond_62
    const/4 v0, 0x0

    :goto_5e
    move/from16 v66, v4

    move/from16 v67, v5

    move/from16 v65, v8

    move/from16 v51, v9

    move/from16 v49, v12

    move/from16 v54, v14

    move/from16 v50, v15

    move/from16 v61, v17

    move-object/from16 v6, v20

    move/from16 v52, v21

    move/from16 v56, v23

    move/from16 v55, v24

    move/from16 v63, v25

    move/from16 v59, v26

    move/from16 v62, v28

    move/from16 v64, v29

    move/from16 v11, v38

    move/from16 v60, v39

    move/from16 v53, v48

    const/16 v1, 0x19

    goto/16 :goto_53

    :goto_5f
    if-ne v2, v11, :cond_67

    move/from16 v11, v21

    move/from16 v21, v1

    const/16 v1, 0x20

    move/from16 v47, v11

    if-ne v11, v1, :cond_64

    const/16 v11, 0x2c

    if-ne v14, v11, :cond_64

    if-ne v0, v1, :cond_64

    if-ne v3, v11, :cond_64

    if-ne v10, v1, :cond_64

    const/16 v11, 0x3a

    if-ne v7, v11, :cond_64

    if-ne v13, v11, :cond_64

    if-ne v8, v1, :cond_64

    const/16 v1, 0x41

    if-eq v4, v1, :cond_63

    const/16 v1, 0x50

    if-ne v4, v1, :cond_64

    :cond_63
    const/16 v1, 0x4d

    goto :goto_61

    :cond_64
    :goto_60
    const/16 v1, 0x2d

    goto :goto_65

    :goto_61
    if-ne v5, v1, :cond_64

    .line 128
    invoke-static {v12, v15, v9}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    move-result v0

    if-lez v0, :cond_65

    .line 129
    div-int/lit8 v1, v0, 0xa

    const/16 v19, 0x30

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    const/16 v18, 0xa

    .line 130
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    :goto_62
    const/16 v12, 0x50

    goto :goto_63

    :cond_65
    const/16 v0, 0x30

    const/16 v1, 0x30

    goto :goto_62

    :goto_63
    if-ne v4, v12, :cond_66

    move/from16 v4, v32

    goto :goto_64

    :cond_66
    const/4 v4, 0x0

    :goto_64
    move-object/from16 v12, p0

    move/from16 v54, v0

    move/from16 v53, v1

    move/from16 v55, v6

    move/from16 v59, v17

    move-object/from16 v6, v20

    move/from16 v50, v23

    move/from16 v49, v24

    move/from16 v61, v25

    move/from16 v11, v26

    move/from16 v60, v28

    move/from16 v62, v29

    move/from16 v52, v38

    move/from16 v3, v39

    move/from16 v51, v40

    move/from16 v56, v48

    const/4 v0, 0x0

    const/16 v1, 0x19

    goto/16 :goto_e

    :cond_67
    move/from16 v47, v21

    move/from16 v21, v1

    goto :goto_60

    :goto_65
    if-ne v6, v1, :cond_6f

    if-ne v0, v1, :cond_6f

    move/from16 v11, v40

    const/16 v1, 0x20

    if-eq v11, v1, :cond_68

    const/16 v1, 0x54

    if-ne v11, v1, :cond_69

    :cond_68
    const/16 v1, 0x3a

    goto :goto_67

    :cond_69
    :goto_66
    move/from16 v1, v41

    move/from16 v41, v9

    :cond_6a
    const/16 v9, 0x2d

    goto/16 :goto_6b

    :goto_67
    if-ne v10, v1, :cond_69

    if-ne v7, v1, :cond_69

    const/16 v1, 0x2e

    if-ne v13, v1, :cond_69

    const/16 v1, 0x1a

    if-eq v2, v1, :cond_6d

    move/from16 v1, v41

    move/from16 v41, v9

    const/16 v9, 0x5b

    if-eq v1, v9, :cond_6b

    const/16 v9, 0x7c

    if-eq v1, v9, :cond_6c

    const/16 v9, 0x2b

    if-eq v1, v9, :cond_6b

    const/16 v9, 0x2d

    if-eq v1, v9, :cond_6b

    const/16 v9, 0x5a

    if-ne v1, v9, :cond_6a

    :cond_6b
    :goto_68
    const/16 v0, 0x7c

    goto :goto_69

    :cond_6c
    move v0, v9

    goto :goto_69

    :cond_6d
    move/from16 v1, v41

    move/from16 v41, v9

    goto :goto_68

    :goto_69
    if-ne v1, v0, :cond_6e

    move/from16 v0, v32

    goto :goto_6a

    :cond_6e
    const/4 v0, 0x0

    :goto_6a
    move/from16 v66, v4

    move/from16 v67, v5

    move/from16 v65, v8

    move/from16 v49, v12

    move/from16 v54, v14

    move/from16 v50, v15

    move/from16 v61, v17

    move-object/from16 v6, v20

    move/from16 v68, v21

    move/from16 v56, v23

    move/from16 v55, v24

    move/from16 v63, v25

    move/from16 v59, v26

    move/from16 v62, v28

    move/from16 v64, v29

    move/from16 v11, v38

    move/from16 v60, v39

    move/from16 v51, v41

    move/from16 v52, v47

    move/from16 v53, v48

    const/16 v1, 0x1a

    goto/16 :goto_54

    :cond_6f
    move/from16 v11, v40

    goto :goto_66

    :goto_6b
    if-ne v6, v9, :cond_71

    if-ne v0, v9, :cond_71

    const/16 v9, 0x20

    if-eq v11, v9, :cond_70

    const/16 v9, 0x54

    if-ne v11, v9, :cond_71

    :cond_70
    const/16 v9, 0x3a

    goto :goto_6c

    :cond_71
    move/from16 v9, v42

    move/from16 v42, v12

    goto/16 :goto_70

    :goto_6c
    if-ne v10, v9, :cond_71

    if-ne v7, v9, :cond_71

    const/16 v9, 0x2e

    if-ne v13, v9, :cond_71

    const/16 v9, 0x1b

    if-eq v2, v9, :cond_73

    move/from16 v9, v42

    move/from16 v42, v12

    const/16 v12, 0x5b

    if-eq v9, v12, :cond_72

    const/16 v12, 0x7c

    if-eq v9, v12, :cond_72

    const/16 v12, 0x2b

    if-eq v9, v12, :cond_72

    const/16 v12, 0x2d

    if-eq v9, v12, :cond_72

    const/16 v12, 0x5a

    if-ne v9, v12, :cond_76

    :cond_72
    :goto_6d
    const/16 v12, 0x20

    goto :goto_6e

    :cond_73
    move/from16 v9, v42

    move/from16 v42, v12

    goto :goto_6d

    :goto_6e
    if-ne v4, v12, :cond_74

    const/4 v4, 0x0

    move-object/from16 v12, p0

    move/from16 v65, v8

    move/from16 v54, v14

    move/from16 v50, v15

    move/from16 v61, v17

    move-object/from16 v6, v20

    move/from16 v56, v23

    move/from16 v55, v24

    move/from16 v63, v25

    move/from16 v59, v26

    move/from16 v62, v28

    move/from16 v64, v29

    move/from16 v11, v38

    move/from16 v60, v39

    move/from16 v51, v41

    move/from16 v49, v42

    move/from16 v52, v47

    move/from16 v53, v48

    const/4 v0, 0x0

    const/16 v1, 0x17

    goto/16 :goto_f

    :cond_74
    const/16 v0, 0x7c

    if-ne v9, v0, :cond_75

    move/from16 v0, v32

    goto :goto_6f

    :cond_75
    const/4 v0, 0x0

    :goto_6f
    move-object/from16 v12, p0

    move/from16 v69, v1

    move/from16 v66, v4

    move/from16 v67, v5

    move/from16 v65, v8

    move/from16 v54, v14

    move/from16 v50, v15

    move/from16 v61, v17

    move-object/from16 v6, v20

    move/from16 v68, v21

    move/from16 v56, v23

    move/from16 v55, v24

    move/from16 v63, v25

    move/from16 v59, v26

    move/from16 v62, v28

    move/from16 v64, v29

    move/from16 v11, v38

    move/from16 v60, v39

    move/from16 v51, v41

    move/from16 v49, v42

    move/from16 v52, v47

    move/from16 v53, v48

    const/16 v1, 0x1b

    goto/16 :goto_11

    :cond_76
    :goto_70
    const/16 v12, 0x2d

    if-ne v6, v12, :cond_78

    if-ne v0, v12, :cond_78

    const/16 v12, 0x20

    if-eq v11, v12, :cond_77

    const/16 v12, 0x54

    if-ne v11, v12, :cond_78

    :cond_77
    const/16 v12, 0x3a

    goto :goto_71

    :cond_78
    move/from16 v12, v43

    move/from16 v43, v15

    :cond_79
    const/16 v15, 0x1c

    goto/16 :goto_75

    :goto_71
    if-ne v10, v12, :cond_78

    if-ne v7, v12, :cond_78

    const/16 v12, 0x2e

    if-ne v13, v12, :cond_78

    const/16 v12, 0x1c

    if-eq v2, v12, :cond_7c

    move/from16 v12, v43

    move/from16 v43, v15

    const/16 v15, 0x5b

    if-eq v12, v15, :cond_7a

    const/16 v15, 0x7c

    if-eq v12, v15, :cond_7b

    const/16 v15, 0x2b

    if-eq v12, v15, :cond_7a

    const/16 v15, 0x2d

    if-eq v12, v15, :cond_7a

    const/16 v15, 0x5a

    if-ne v12, v15, :cond_79

    :cond_7a
    :goto_72
    const/16 v0, 0x7c

    goto :goto_73

    :cond_7b
    move v0, v15

    goto :goto_73

    :cond_7c
    move/from16 v12, v43

    move/from16 v43, v15

    goto :goto_72

    :goto_73
    if-ne v12, v0, :cond_7d

    move/from16 v0, v32

    goto :goto_74

    :cond_7d
    const/4 v0, 0x0

    :goto_74
    move-object/from16 v12, p0

    move/from16 v69, v1

    move/from16 v66, v4

    move/from16 v67, v5

    move/from16 v65, v8

    move/from16 v70, v9

    move/from16 v54, v14

    move/from16 v61, v17

    move-object/from16 v6, v20

    move/from16 v68, v21

    move/from16 v56, v23

    move/from16 v55, v24

    move/from16 v63, v25

    move/from16 v59, v26

    move/from16 v62, v28

    move/from16 v64, v29

    move/from16 v11, v38

    move/from16 v60, v39

    move/from16 v51, v41

    move/from16 v49, v42

    move/from16 v50, v43

    move/from16 v52, v47

    move/from16 v53, v48

    const/16 v1, 0x1c

    goto/16 :goto_12

    :goto_75
    move/from16 v46, v12

    if-ne v2, v15, :cond_80

    move/from16 v15, v47

    const/16 v12, 0x20

    if-ne v15, v12, :cond_7f

    if-ne v0, v12, :cond_7f

    if-ne v11, v12, :cond_7f

    const/16 v12, 0x3a

    if-ne v10, v12, :cond_7f

    if-ne v7, v12, :cond_7f

    const/16 v12, 0x20

    if-ne v13, v12, :cond_7f

    if-ne v4, v12, :cond_7f

    move/from16 v12, v48

    .line 131
    invoke-static {v6, v12, v14}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    move-result v0

    if-lez v0, :cond_7e

    .line 132
    div-int/lit8 v4, v0, 0xa

    const/16 v19, 0x30

    add-int/lit8 v4, v4, 0x30

    int-to-char v4, v4

    const/16 v18, 0xa

    .line 133
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    goto :goto_76

    :cond_7e
    const/16 v0, 0x30

    const/16 v4, 0x30

    .line 134
    :goto_76
    new-instance v6, Ljava/lang/String;

    add-int/lit8 v7, p1, 0x14

    const/4 v8, 0x3

    move-object/from16 v10, p0

    invoke-direct {v6, v10, v7, v8}, Ljava/lang/String;-><init>([BII)V

    move/from16 v54, v0

    move/from16 v51, v1

    move/from16 v53, v4

    move/from16 v49, v5

    move/from16 v52, v9

    move-object v12, v10

    move/from16 v61, v17

    move/from16 v50, v21

    move/from16 v56, v23

    move/from16 v55, v24

    move/from16 v59, v26

    move/from16 v62, v28

    move/from16 v11, v38

    move/from16 v60, v39

    const/4 v0, 0x0

    const/16 v1, 0x13

    const/4 v4, 0x0

    goto/16 :goto_e

    :cond_7f
    :goto_77
    move-object/from16 v12, p0

    move/from16 v27, v9

    const/16 v9, 0x1c

    goto :goto_78

    :cond_80
    move/from16 v15, v47

    goto :goto_77

    :goto_78
    if-ne v2, v9, :cond_85

    const/16 v9, 0x2c

    if-ne v15, v9, :cond_85

    const/16 v9, 0x20

    if-ne v6, v9, :cond_85

    if-ne v14, v9, :cond_85

    if-ne v11, v9, :cond_85

    move/from16 v40, v3

    move/from16 v3, v39

    if-ne v3, v9, :cond_84

    move/from16 v9, v28

    move/from16 v28, v1

    const/16 v1, 0x3a

    if-ne v9, v1, :cond_83

    move/from16 v39, v9

    move/from16 v9, v29

    if-ne v9, v1, :cond_82

    const/16 v1, 0x20

    if-ne v5, v1, :cond_82

    move/from16 v5, v23

    move/from16 v1, v24

    .line 135
    invoke-static {v0, v1, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    move-result v0

    if-lez v0, :cond_81

    .line 136
    div-int/lit8 v1, v0, 0xa

    const/16 v19, 0x30

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    const/16 v18, 0xa

    .line 137
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    goto :goto_79

    :cond_81
    const/16 v0, 0x30

    const/16 v1, 0x30

    :goto_79
    move/from16 v54, v0

    move/from16 v53, v1

    move/from16 v62, v4

    move v11, v7

    move/from16 v61, v8

    move/from16 v51, v10

    move/from16 v59, v13

    move/from16 v3, v17

    move-object/from16 v6, v20

    move/from16 v60, v25

    move/from16 v52, v26

    move/from16 v0, v32

    move/from16 v49, v38

    move/from16 v50, v40

    move/from16 v56, v48

    const/16 v1, 0x18

    const/4 v4, 0x0

    goto/16 :goto_20

    :cond_82
    move/from16 v1, v23

    move/from16 v23, v5

    move v5, v1

    move/from16 v1, v24

    move/from16 v29, v9

    goto :goto_7c

    :cond_83
    move/from16 v1, v23

    move/from16 v23, v5

    move v5, v1

    move/from16 v39, v9

    :goto_7a
    move/from16 v1, v24

    goto :goto_7c

    :cond_84
    move/from16 v39, v23

    move/from16 v23, v5

    move/from16 v5, v39

    :goto_7b
    move/from16 v39, v28

    move/from16 v28, v1

    goto :goto_7a

    :cond_85
    move/from16 v40, v23

    move/from16 v23, v5

    move/from16 v5, v40

    move/from16 v40, v3

    move/from16 v3, v39

    goto :goto_7b

    :goto_7c
    const/16 v9, 0x1d

    if-ne v2, v9, :cond_89

    const/16 v9, 0x2c

    if-ne v15, v9, :cond_89

    const/16 v9, 0x20

    if-ne v6, v9, :cond_89

    if-ne v0, v9, :cond_89

    move/from16 v47, v15

    move/from16 v15, v38

    if-ne v15, v9, :cond_88

    if-ne v7, v9, :cond_88

    const/16 v9, 0x3a

    if-ne v13, v9, :cond_88

    if-ne v8, v9, :cond_88

    move/from16 v9, v21

    move/from16 v21, v4

    const/16 v4, 0x20

    if-ne v9, v4, :cond_87

    .line 138
    invoke-static {v1, v5, v11}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    move-result v0

    if-lez v0, :cond_86

    .line 139
    div-int/lit8 v1, v0, 0xa

    const/16 v19, 0x30

    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    const/16 v18, 0xa

    .line 140
    rem-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    goto :goto_7d

    :cond_86
    const/16 v19, 0x30

    move/from16 v0, v19

    move v1, v0

    :goto_7d
    move/from16 v54, v0

    move/from16 v53, v1

    move/from16 v52, v3

    move/from16 v50, v10

    move/from16 v56, v14

    move/from16 v11, v17

    move/from16 v63, v19

    move/from16 v64, v63

    move/from16 v65, v64

    move/from16 v66, v65

    move/from16 v67, v66

    move/from16 v68, v67

    move/from16 v69, v68

    move/from16 v70, v69

    move/from16 v71, v70

    move-object/from16 v6, v20

    move/from16 v61, v21

    move/from16 v62, v23

    move/from16 v59, v25

    move/from16 v51, v26

    move/from16 v60, v29

    move/from16 v0, v32

    move/from16 v3, v39

    move/from16 v49, v40

    move/from16 v55, v48

    const/16 v1, 0x19

    goto/16 :goto_13

    :cond_87
    const/16 v19, 0x30

    :goto_7e
    const/16 v4, 0x2d

    goto :goto_80

    :cond_88
    move/from16 v9, v21

    :goto_7f
    const/16 v19, 0x30

    move/from16 v21, v4

    goto :goto_7e

    :cond_89
    move/from16 v47, v15

    move/from16 v9, v21

    move/from16 v15, v38

    goto :goto_7f

    :goto_80
    if-ne v6, v4, :cond_8b

    if-ne v0, v4, :cond_8b

    const/16 v4, 0x20

    if-eq v11, v4, :cond_8a

    const/16 v4, 0x54

    if-ne v11, v4, :cond_8b

    :cond_8a
    const/16 v4, 0x3a

    goto :goto_81

    :cond_8b
    move/from16 v18, v6

    :cond_8c
    const/16 v4, 0x16

    goto/16 :goto_85

    :goto_81
    if-ne v10, v4, :cond_8b

    if-ne v7, v4, :cond_8b

    const/16 v4, 0x2e

    if-ne v13, v4, :cond_8b

    const/16 v4, 0x1d

    if-eq v2, v4, :cond_8f

    move/from16 v18, v6

    move/from16 v4, v45

    const/16 v6, 0x5b

    if-eq v4, v6, :cond_8d

    const/16 v6, 0x7c

    if-eq v4, v6, :cond_8e

    const/16 v6, 0x2b

    if-eq v4, v6, :cond_8d

    const/16 v6, 0x2d

    if-eq v4, v6, :cond_8d

    const/16 v6, 0x5a

    if-ne v4, v6, :cond_8c

    :cond_8d
    :goto_82
    const/16 v0, 0x7c

    goto :goto_83

    :cond_8e
    move v0, v6

    goto :goto_83

    :cond_8f
    move/from16 v4, v45

    goto :goto_82

    :goto_83
    if-ne v4, v0, :cond_90

    move/from16 v4, v32

    goto :goto_84

    :cond_90
    const/4 v4, 0x0

    :goto_84
    move/from16 v55, v1

    move/from16 v60, v3

    move v0, v4

    move/from16 v56, v5

    move/from16 v65, v8

    move/from16 v68, v9

    move/from16 v54, v14

    move v11, v15

    move/from16 v61, v17

    move-object/from16 v6, v20

    move/from16 v66, v21

    move/from16 v67, v23

    move/from16 v63, v25

    move/from16 v59, v26

    move/from16 v70, v27

    move/from16 v69, v28

    move/from16 v64, v29

    move/from16 v62, v39

    move/from16 v3, v40

    move/from16 v51, v41

    move/from16 v49, v42

    move/from16 v50, v43

    move/from16 v71, v46

    move/from16 v52, v47

    move/from16 v53, v48

    const/16 v1, 0x1d

    goto/16 :goto_13

    :goto_85
    if-ne v2, v4, :cond_a0

    move/from16 v4, v17

    const/16 v6, 0x2b

    if-eq v4, v6, :cond_92

    const/16 v6, 0x2d

    if-ne v4, v6, :cond_91

    goto :goto_87

    :cond_91
    :goto_86
    const/16 v6, 0x20

    goto/16 :goto_90

    :cond_92
    :goto_87
    move/from16 v56, v0

    move/from16 v64, v3

    move v3, v5

    move/from16 v65, v7

    move/from16 v62, v10

    move/from16 v59, v11

    move/from16 v55, v14

    move/from16 v60, v15

    move/from16 v53, v18

    move/from16 v66, v19

    move/from16 v67, v66

    move/from16 v68, v67

    move/from16 v69, v68

    move/from16 v70, v69

    move/from16 v71, v70

    move-object/from16 v6, v20

    move/from16 v63, v26

    move/from16 v61, v40

    move/from16 v51, v41

    move/from16 v49, v42

    move/from16 v50, v43

    move/from16 v52, v47

    move/from16 v54, v48

    const/4 v0, 0x0

    const/4 v4, 0x0

    move v11, v1

    const/16 v1, 0x11

    :goto_88
    if-eqz v4, :cond_93

    const/16 v5, 0x31

    if-ne v11, v5, :cond_93

    const/16 v5, 0x32

    if-ne v3, v5, :cond_93

    const/4 v7, 0x0

    goto :goto_89

    :cond_93
    move v7, v4

    :goto_89
    if-eqz v7, :cond_94

    .line 141
    invoke-static {v11, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世兰哲(CC)I

    move-result v3

    shr-int/lit8 v4, v3, 0x10

    int-to-char v11, v4

    int-to-short v3, v3

    int-to-char v3, v3

    :cond_94
    move/from16 v58, v3

    move/from16 v57, v11

    .line 142
    invoke-static/range {v49 .. v71}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲世兰(CCCCCCCCCCCCCCCCCCCCCCC)Ljava/time/LocalDateTime;

    move-result-object v3

    if-nez v3, :cond_95

    return-object v20

    :cond_95
    if-eqz v0, :cond_97

    .line 143
    new-instance v0, Ljava/lang/String;

    sub-int/2addr v2, v1

    invoke-direct {v0, v12, v1, v2}, Ljava/lang/String;-><init>([BII)V

    .line 144
    const-string v1, "UTC"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_96

    const-string v1, "[UTC]"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_96

    .line 145
    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    .line 146
    invoke-virtual {v0}, Ljava/util/TimeZone;->toZoneId()Ljava/time/ZoneId;

    move-result-object v0

    goto :goto_8a

    .line 147
    :cond_96
    sget-object v0, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    :goto_8a
    move-object v1, v0

    move-object/from16 v0, p3

    goto :goto_8e

    :cond_97
    if-ne v1, v2, :cond_98

    move-object/from16 v0, p3

    move-object v1, v0

    goto :goto_8e

    :cond_98
    add-int v0, p1, v1

    .line 148
    aget-byte v4, v12, v0

    int-to-char v4, v4

    const/16 v8, 0x5a

    if-ne v4, v8, :cond_99

    .line 149
    sget-object v0, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    goto :goto_8a

    :cond_99
    if-nez v6, :cond_9b

    const/16 v8, 0x2b

    if-eq v4, v8, :cond_9d

    const/16 v8, 0x2d

    if-ne v4, v8, :cond_9a

    goto :goto_8c

    :cond_9a
    const/16 v8, 0x20

    if-ne v4, v8, :cond_9c

    .line 150
    new-instance v6, Ljava/lang/String;

    add-int/lit8 v0, v0, 0x1

    sub-int v1, v2, v1

    add-int/lit8 v1, v1, -0x1

    invoke-direct {v6, v12, v0, v1}, Ljava/lang/String;-><init>([BII)V

    :cond_9b
    :goto_8b
    move-object/from16 v0, p3

    goto :goto_8d

    :cond_9c
    if-ge v1, v2, :cond_9b

    .line 151
    new-instance v6, Ljava/lang/String;

    add-int/lit8 v0, v0, 0x1

    sub-int v1, v2, v1

    add-int/lit8 v1, v1, -0x2

    invoke-direct {v6, v12, v0, v1}, Ljava/lang/String;-><init>([BII)V

    goto :goto_8b

    .line 152
    :cond_9d
    :goto_8c
    new-instance v6, Ljava/lang/String;

    sub-int v1, v2, v1

    invoke-direct {v6, v12, v0, v1}, Ljava/lang/String;-><init>([BII)V

    goto :goto_8b

    .line 153
    :goto_8d
    invoke-static {v6, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/time/ZoneId;)Ljava/time/ZoneId;

    move-result-object v1

    :goto_8e
    if-nez v1, :cond_9e

    goto :goto_8f

    :cond_9e
    move-object v0, v1

    :goto_8f
    if-nez v0, :cond_9f

    .line 154
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    :cond_9f
    move-object/from16 v1, v20

    .line 155
    invoke-static {v3, v0, v1}, Ljava/time/ZonedDateTime;->ofLocal(Ljava/time/LocalDateTime;Ljava/time/ZoneId;Ljava/time/ZoneOffset;)Ljava/time/ZonedDateTime;

    move-result-object v0

    return-object v0

    :cond_a0
    move/from16 v4, v17

    goto/16 :goto_86

    :goto_90
    if-ne v2, v6, :cond_a1

    const/16 v12, 0x2c

    if-ne v14, v12, :cond_a1

    if-ne v0, v6, :cond_a1

    const/16 v12, 0x2d

    if-ne v11, v12, :cond_a1

    move/from16 v14, v26

    if-ne v14, v12, :cond_a1

    if-ne v13, v6, :cond_a1

    const/16 v12, 0x3a

    if-ne v8, v12, :cond_a1

    if-ne v9, v12, :cond_a1

    add-int/lit8 v12, p1, 0x1c

    .line 156
    aget-byte v12, p0, v12

    if-eq v12, v6, :cond_a4

    :cond_a1
    const/16 v6, 0x21

    if-ne v2, v6, :cond_a2

    const/16 v12, 0x2c

    if-ne v0, v12, :cond_a2

    const/16 v12, 0x20

    if-ne v1, v12, :cond_a2

    const/16 v6, 0x2d

    if-ne v15, v6, :cond_a2

    if-ne v3, v6, :cond_a2

    move/from16 v0, v25

    if-ne v0, v12, :cond_a2

    move/from16 v0, v21

    const/16 v13, 0x3a

    if-ne v0, v13, :cond_a2

    move/from16 v0, v28

    if-ne v0, v13, :cond_a2

    add-int/lit8 v0, p1, 0x1d

    aget-byte v0, p0, v0

    if-eq v0, v12, :cond_a4

    :cond_a2
    const/16 v0, 0x22

    if-ne v2, v0, :cond_a3

    const/16 v12, 0x2c

    if-ne v1, v12, :cond_a3

    const/16 v12, 0x20

    if-ne v5, v12, :cond_a3

    move/from16 v3, v40

    const/16 v1, 0x2d

    if-ne v3, v1, :cond_a3

    if-ne v7, v1, :cond_a3

    move/from16 v7, v29

    if-ne v7, v12, :cond_a3

    move/from16 v7, v23

    const/16 v1, 0x3a

    if-ne v7, v1, :cond_a3

    move/from16 v7, v27

    if-ne v7, v1, :cond_a3

    add-int/lit8 v1, p1, 0x1e

    aget-byte v1, p0, v1

    if-eq v1, v12, :cond_a4

    :cond_a3
    const/16 v1, 0x23

    if-ne v2, v1, :cond_a5

    const/16 v12, 0x2c

    if-ne v5, v12, :cond_a5

    const/16 v12, 0x20

    if-ne v11, v12, :cond_a5

    const/16 v1, 0x2d

    if-ne v10, v1, :cond_a5

    if-ne v4, v1, :cond_a5

    if-ne v8, v12, :cond_a5

    const/16 v1, 0x3a

    if-ne v9, v1, :cond_a5

    move/from16 v7, v46

    if-ne v7, v1, :cond_a5

    add-int/lit8 v1, p1, 0x1f

    aget-byte v1, p0, v1

    if-ne v1, v12, :cond_a5

    .line 157
    :cond_a4
    new-instance v0, Ljava/lang/String;

    move-object/from16 v12, p0

    move/from16 v1, p1

    invoke-direct {v0, v12, v1, v2}, Ljava/lang/String;-><init>([BII)V

    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏哲楪世兰(Ljava/lang/String;)Ljava/time/ZonedDateTime;

    move-result-object v0

    return-object v0

    :cond_a5
    move-object/from16 v12, p0

    move/from16 v1, p1

    if-ne v2, v0, :cond_a7

    .line 158
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏:Ljava/time/format/DateTimeFormatter;

    if-nez v0, :cond_a6

    .line 159
    const-string v0, "EEE MMM dd HH:mm:ss O yyyy"

    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {v0, v3}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏:Ljava/time/format/DateTimeFormatter;

    .line 160
    :cond_a6
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v12, v1, v2}, Ljava/lang/String;-><init>([BII)V

    invoke-static {v3, v0}, Ljava/time/ZonedDateTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/ZonedDateTime;

    move-result-object v0

    return-object v0

    :cond_a7
    const/16 v0, 0x1f

    if-ne v2, v0, :cond_a9

    move/from16 v0, v22

    const/16 v9, 0x2c

    if-ne v0, v9, :cond_a9

    .line 161
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲世兰:Ljava/time/format/DateTimeFormatter;

    if-nez v0, :cond_a8

    .line 162
    const-string v0, "EEE, dd MMM yyyy HH:mm:ss Z"

    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {v0, v3}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲世兰:Ljava/time/format/DateTimeFormatter;

    .line 163
    :cond_a8
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v12, v1, v2}, Ljava/lang/String;-><init>([BII)V

    invoke-static {v3, v0}, Ljava/time/ZonedDateTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/ZonedDateTime;

    move-result-object v0

    return-object v0

    :cond_a9
    const/16 v20, 0x0

    return-object v20

    nop

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

.method public static 飘花落叶言子苏世哲兰楪([CILjava/time/ZoneId;)J
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
    aget-char v2, v0, v1

    .line 9
    .line 10
    add-int/lit8 v3, v1, 0x1

    .line 11
    .line 12
    aget-char v3, v0, v3

    .line 13
    .line 14
    add-int/lit8 v4, v1, 0x2

    .line 15
    .line 16
    aget-char v4, v0, v4

    .line 17
    .line 18
    add-int/lit8 v5, v1, 0x3

    .line 19
    .line 20
    aget-char v5, v0, v5

    .line 21
    .line 22
    add-int/lit8 v6, v1, 0x4

    .line 23
    .line 24
    aget-char v6, v0, v6

    .line 25
    .line 26
    add-int/lit8 v7, v1, 0x5

    .line 27
    .line 28
    aget-char v7, v0, v7

    .line 29
    .line 30
    add-int/lit8 v8, v1, 0x6

    .line 31
    .line 32
    aget-char v8, v0, v8

    .line 33
    .line 34
    add-int/lit8 v9, v1, 0x7

    .line 35
    .line 36
    aget-char v9, v0, v9

    .line 37
    .line 38
    add-int/lit8 v10, v1, 0x8

    .line 39
    .line 40
    aget-char v10, v0, v10

    .line 41
    .line 42
    add-int/lit8 v11, v1, 0x9

    .line 43
    .line 44
    aget-char v11, v0, v11

    .line 45
    .line 46
    add-int/lit8 v12, v1, 0xa

    .line 47
    .line 48
    aget-char v12, v0, v12

    .line 49
    .line 50
    add-int/lit8 v13, v1, 0xb

    .line 51
    .line 52
    aget-char v13, v0, v13

    .line 53
    .line 54
    add-int/lit8 v14, v1, 0xc

    .line 55
    .line 56
    aget-char v14, v0, v14

    .line 57
    .line 58
    add-int/lit8 v15, v1, 0xd

    .line 59
    .line 60
    aget-char v15, v0, v15

    .line 61
    .line 62
    add-int/lit8 v16, v1, 0xe

    .line 63
    .line 64
    move/from16 v17, v2

    .line 65
    .line 66
    aget-char v2, v0, v16

    .line 67
    .line 68
    add-int/lit8 v16, v1, 0xf

    .line 69
    .line 70
    aget-char v16, v0, v16

    .line 71
    .line 72
    add-int/lit8 v18, v1, 0x10

    .line 73
    .line 74
    move/from16 v19, v10

    .line 75
    .line 76
    aget-char v10, v0, v18

    .line 77
    .line 78
    add-int/lit8 v18, v1, 0x11

    .line 79
    .line 80
    move/from16 v20, v11

    .line 81
    .line 82
    aget-char v11, v0, v18

    .line 83
    .line 84
    add-int/lit8 v18, v1, 0x12

    .line 85
    .line 86
    move/from16 v21, v14

    .line 87
    .line 88
    aget-char v14, v0, v18

    .line 89
    .line 90
    move/from16 v18, v14

    .line 91
    .line 92
    const-string v14, "illegal input "

    .line 93
    .line 94
    move/from16 v22, v11

    .line 95
    .line 96
    const/16 v23, 0x30

    .line 97
    .line 98
    const/16 v24, 0xa

    .line 99
    .line 100
    const/16 v11, 0x2d

    .line 101
    .line 102
    if-ne v6, v11, :cond_1

    .line 103
    .line 104
    if-ne v9, v11, :cond_1

    .line 105
    .line 106
    const/16 v11, 0x20

    .line 107
    .line 108
    if-eq v12, v11, :cond_0

    .line 109
    .line 110
    const/16 v11, 0x54

    .line 111
    .line 112
    if-ne v12, v11, :cond_1

    .line 113
    .line 114
    :cond_0
    const/16 v11, 0x3a

    .line 115
    .line 116
    if-ne v15, v11, :cond_1

    .line 117
    .line 118
    if-ne v10, v11, :cond_1

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_1
    const/16 v11, 0x2f

    .line 122
    .line 123
    if-ne v6, v11, :cond_4

    .line 124
    .line 125
    if-ne v9, v11, :cond_4

    .line 126
    .line 127
    const/16 v11, 0x20

    .line 128
    .line 129
    if-eq v12, v11, :cond_2

    .line 130
    .line 131
    const/16 v11, 0x54

    .line 132
    .line 133
    if-ne v12, v11, :cond_3

    .line 134
    .line 135
    :cond_2
    const/16 v11, 0x3a

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_3
    const/16 v11, 0x2f

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :goto_0
    if-ne v15, v11, :cond_3

    .line 142
    .line 143
    if-ne v10, v11, :cond_3

    .line 144
    .line 145
    :goto_1
    move v9, v3

    .line 146
    move v6, v4

    .line 147
    move v12, v5

    .line 148
    move/from16 v10, v16

    .line 149
    .line 150
    move/from16 v3, v19

    .line 151
    .line 152
    move/from16 v4, v20

    .line 153
    .line 154
    move/from16 v15, v21

    .line 155
    .line 156
    move/from16 v11, v22

    .line 157
    .line 158
    move v5, v2

    .line 159
    move-object/from16 v16, v14

    .line 160
    .line 161
    move/from16 v2, v17

    .line 162
    .line 163
    move/from16 v14, v23

    .line 164
    .line 165
    goto/16 :goto_7

    .line 166
    .line 167
    :cond_4
    :goto_2
    if-ne v4, v11, :cond_5

    .line 168
    .line 169
    if-eq v7, v11, :cond_6

    .line 170
    .line 171
    :cond_5
    const/16 v11, 0x2d

    .line 172
    .line 173
    goto :goto_4

    .line 174
    :cond_6
    :goto_3
    const/16 v11, 0x20

    .line 175
    .line 176
    goto :goto_5

    .line 177
    :goto_4
    if-ne v4, v11, :cond_7

    .line 178
    .line 179
    if-eq v7, v11, :cond_6

    .line 180
    .line 181
    :cond_7
    const/16 v11, 0x2e

    .line 182
    .line 183
    if-ne v4, v11, :cond_8

    .line 184
    .line 185
    if-ne v7, v11, :cond_8

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :goto_5
    if-ne v12, v11, :cond_9

    .line 189
    .line 190
    const/16 v11, 0x3a

    .line 191
    .line 192
    if-ne v15, v11, :cond_8

    .line 193
    .line 194
    if-ne v10, v11, :cond_8

    .line 195
    .line 196
    move v4, v3

    .line 197
    move v7, v5

    .line 198
    move/from16 v10, v16

    .line 199
    .line 200
    move/from16 v3, v17

    .line 201
    .line 202
    move/from16 v12, v20

    .line 203
    .line 204
    move/from16 v15, v21

    .line 205
    .line 206
    move/from16 v11, v22

    .line 207
    .line 208
    move v5, v2

    .line 209
    move v2, v8

    .line 210
    move-object/from16 v16, v14

    .line 211
    .line 212
    move/from16 v14, v23

    .line 213
    .line 214
    :goto_6
    move v8, v6

    .line 215
    move/from16 v6, v19

    .line 216
    .line 217
    goto/16 :goto_7

    .line 218
    .line 219
    :cond_8
    const/16 v11, 0x20

    .line 220
    .line 221
    :cond_9
    if-ne v3, v11, :cond_c

    .line 222
    .line 223
    if-ne v7, v11, :cond_c

    .line 224
    .line 225
    if-ne v12, v11, :cond_c

    .line 226
    .line 227
    const/16 v11, 0x3a

    .line 228
    .line 229
    if-ne v15, v11, :cond_b

    .line 230
    .line 231
    if-ne v10, v11, :cond_b

    .line 232
    .line 233
    invoke-static {v4, v5, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    if-lez v3, :cond_a

    .line 238
    .line 239
    div-int/lit8 v4, v3, 0xa

    .line 240
    .line 241
    add-int/lit8 v4, v4, 0x30

    .line 242
    .line 243
    int-to-char v5, v4

    .line 244
    rem-int/lit8 v3, v3, 0xa

    .line 245
    .line 246
    add-int/lit8 v3, v3, 0x30

    .line 247
    .line 248
    int-to-char v6, v3

    .line 249
    move v7, v5

    .line 250
    move/from16 v10, v16

    .line 251
    .line 252
    move/from16 v4, v17

    .line 253
    .line 254
    move/from16 v12, v20

    .line 255
    .line 256
    move/from16 v15, v21

    .line 257
    .line 258
    move/from16 v11, v22

    .line 259
    .line 260
    move/from16 v3, v23

    .line 261
    .line 262
    move v5, v2

    .line 263
    move v2, v8

    .line 264
    move-object/from16 v16, v14

    .line 265
    .line 266
    move v14, v3

    .line 267
    goto :goto_6

    .line 268
    :cond_a
    new-instance v2, Ljava/lang/String;

    .line 269
    .line 270
    const/16 v3, 0x13

    .line 271
    .line 272
    invoke-direct {v2, v0, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 273
    .line 274
    .line 275
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 276
    .line 277
    invoke-virtual {v14, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    const/4 v3, 0x0

    .line 282
    invoke-direct {v0, v1, v2, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 283
    .line 284
    .line 285
    throw v0

    .line 286
    :cond_b
    const/16 v11, 0x20

    .line 287
    .line 288
    :cond_c
    if-ne v4, v11, :cond_f

    .line 289
    .line 290
    if-ne v8, v11, :cond_f

    .line 291
    .line 292
    if-ne v13, v11, :cond_f

    .line 293
    .line 294
    const/16 v11, 0x3a

    .line 295
    .line 296
    if-ne v15, v11, :cond_e

    .line 297
    .line 298
    if-ne v10, v11, :cond_e

    .line 299
    .line 300
    invoke-static {v5, v6, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    .line 301
    .line 302
    .line 303
    move-result v4

    .line 304
    if-lez v4, :cond_d

    .line 305
    .line 306
    div-int/lit8 v5, v4, 0xa

    .line 307
    .line 308
    add-int/lit8 v5, v5, 0x30

    .line 309
    .line 310
    int-to-char v5, v5

    .line 311
    rem-int/lit8 v4, v4, 0xa

    .line 312
    .line 313
    add-int/lit8 v4, v4, 0x30

    .line 314
    .line 315
    int-to-char v6, v4

    .line 316
    move v4, v3

    .line 317
    move v7, v5

    .line 318
    move v8, v6

    .line 319
    move/from16 v10, v16

    .line 320
    .line 321
    move/from16 v3, v17

    .line 322
    .line 323
    move/from16 v6, v20

    .line 324
    .line 325
    move/from16 v15, v21

    .line 326
    .line 327
    move/from16 v11, v22

    .line 328
    .line 329
    move/from16 v13, v23

    .line 330
    .line 331
    move v5, v2

    .line 332
    move v2, v9

    .line 333
    move-object/from16 v16, v14

    .line 334
    .line 335
    move/from16 v9, v19

    .line 336
    .line 337
    move v14, v13

    .line 338
    goto/16 :goto_7

    .line 339
    .line 340
    :cond_d
    new-instance v2, Ljava/lang/String;

    .line 341
    .line 342
    const/16 v3, 0x13

    .line 343
    .line 344
    invoke-direct {v2, v0, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 345
    .line 346
    .line 347
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 348
    .line 349
    invoke-virtual {v14, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    const/4 v3, 0x0

    .line 354
    invoke-direct {v0, v1, v2, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 355
    .line 356
    .line 357
    throw v0

    .line 358
    :cond_e
    const/16 v11, 0x20

    .line 359
    .line 360
    :cond_f
    if-ne v4, v11, :cond_12

    .line 361
    .line 362
    if-ne v8, v11, :cond_12

    .line 363
    .line 364
    if-ne v13, v11, :cond_12

    .line 365
    .line 366
    const/16 v11, 0x3a

    .line 367
    .line 368
    if-ne v2, v11, :cond_11

    .line 369
    .line 370
    if-ne v10, v11, :cond_11

    .line 371
    .line 372
    invoke-static {v5, v6, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    .line 373
    .line 374
    .line 375
    move-result v2

    .line 376
    if-lez v2, :cond_10

    .line 377
    .line 378
    div-int/lit8 v4, v2, 0xa

    .line 379
    .line 380
    add-int/lit8 v4, v4, 0x30

    .line 381
    .line 382
    int-to-char v5, v4

    .line 383
    rem-int/lit8 v2, v2, 0xa

    .line 384
    .line 385
    add-int/lit8 v2, v2, 0x30

    .line 386
    .line 387
    int-to-char v6, v2

    .line 388
    move v4, v3

    .line 389
    move v7, v5

    .line 390
    move v8, v6

    .line 391
    move v2, v9

    .line 392
    move/from16 v10, v16

    .line 393
    .line 394
    move/from16 v3, v17

    .line 395
    .line 396
    move/from16 v9, v19

    .line 397
    .line 398
    move/from16 v6, v20

    .line 399
    .line 400
    move/from16 v13, v21

    .line 401
    .line 402
    move/from16 v11, v22

    .line 403
    .line 404
    move/from16 v5, v23

    .line 405
    .line 406
    move-object/from16 v16, v14

    .line 407
    .line 408
    move v14, v5

    .line 409
    goto :goto_7

    .line 410
    :cond_10
    new-instance v2, Ljava/lang/String;

    .line 411
    .line 412
    const/16 v3, 0x13

    .line 413
    .line 414
    invoke-direct {v2, v0, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 415
    .line 416
    .line 417
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 418
    .line 419
    invoke-virtual {v14, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    const/4 v3, 0x0

    .line 424
    invoke-direct {v0, v1, v2, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 425
    .line 426
    .line 427
    throw v0

    .line 428
    :cond_11
    const/16 v11, 0x20

    .line 429
    .line 430
    :cond_12
    if-ne v4, v11, :cond_2a

    .line 431
    .line 432
    if-ne v8, v11, :cond_2a

    .line 433
    .line 434
    if-ne v13, v11, :cond_2a

    .line 435
    .line 436
    const/16 v11, 0x3a

    .line 437
    .line 438
    if-ne v2, v11, :cond_2a

    .line 439
    .line 440
    move/from16 v2, v22

    .line 441
    .line 442
    if-ne v2, v11, :cond_2a

    .line 443
    .line 444
    invoke-static {v5, v6, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    .line 445
    .line 446
    .line 447
    move-result v2

    .line 448
    if-lez v2, :cond_29

    .line 449
    .line 450
    div-int/lit8 v4, v2, 0xa

    .line 451
    .line 452
    add-int/lit8 v4, v4, 0x30

    .line 453
    .line 454
    int-to-char v5, v4

    .line 455
    rem-int/lit8 v2, v2, 0xa

    .line 456
    .line 457
    add-int/lit8 v2, v2, 0x30

    .line 458
    .line 459
    int-to-char v6, v2

    .line 460
    move v4, v3

    .line 461
    move v7, v5

    .line 462
    move v8, v6

    .line 463
    move v2, v9

    .line 464
    move/from16 v5, v16

    .line 465
    .line 466
    move/from16 v3, v17

    .line 467
    .line 468
    move/from16 v9, v19

    .line 469
    .line 470
    move/from16 v6, v20

    .line 471
    .line 472
    move/from16 v13, v21

    .line 473
    .line 474
    move/from16 v11, v23

    .line 475
    .line 476
    move-object/from16 v16, v14

    .line 477
    .line 478
    move v14, v11

    .line 479
    :goto_7
    if-lt v2, v14, :cond_28

    .line 480
    .line 481
    const/16 v0, 0x39

    .line 482
    .line 483
    if-gt v2, v0, :cond_27

    .line 484
    .line 485
    if-lt v9, v14, :cond_27

    .line 486
    .line 487
    if-gt v9, v0, :cond_27

    .line 488
    .line 489
    if-lt v6, v14, :cond_27

    .line 490
    .line 491
    if-gt v6, v0, :cond_27

    .line 492
    .line 493
    if-lt v12, v14, :cond_27

    .line 494
    .line 495
    if-gt v12, v0, :cond_27

    .line 496
    .line 497
    sub-int/2addr v2, v14

    .line 498
    mul-int/lit16 v2, v2, 0x3e8

    .line 499
    .line 500
    const/16 v0, 0x64

    .line 501
    .line 502
    invoke-static {v9, v14, v0, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(IIII)I

    .line 503
    .line 504
    .line 505
    move-result v0

    .line 506
    move/from16 v2, v24

    .line 507
    .line 508
    invoke-static {v6, v14, v2, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(IIII)I

    .line 509
    .line 510
    .line 511
    move-result v0

    .line 512
    sub-int/2addr v12, v14

    .line 513
    add-int/2addr v12, v0

    .line 514
    if-lt v7, v14, :cond_26

    .line 515
    .line 516
    const/16 v0, 0x39

    .line 517
    .line 518
    if-gt v7, v0, :cond_26

    .line 519
    .line 520
    if-lt v8, v14, :cond_26

    .line 521
    .line 522
    if-gt v8, v0, :cond_26

    .line 523
    .line 524
    sub-int/2addr v7, v14

    .line 525
    mul-int/2addr v7, v2

    .line 526
    sub-int/2addr v8, v14

    .line 527
    add-int/2addr v8, v7

    .line 528
    if-nez v8, :cond_14

    .line 529
    .line 530
    if-nez v12, :cond_13

    .line 531
    .line 532
    goto :goto_8

    .line 533
    :cond_13
    move-object/from16 v2, p0

    .line 534
    .line 535
    move-object/from16 v4, v16

    .line 536
    .line 537
    const/16 v3, 0x13

    .line 538
    .line 539
    const/4 v5, 0x0

    .line 540
    goto/16 :goto_10

    .line 541
    .line 542
    :cond_14
    :goto_8
    const/16 v0, 0xc

    .line 543
    .line 544
    if-gt v8, v0, :cond_13

    .line 545
    .line 546
    if-lt v3, v14, :cond_25

    .line 547
    .line 548
    const/16 v0, 0x39

    .line 549
    .line 550
    if-gt v3, v0, :cond_25

    .line 551
    .line 552
    if-lt v4, v14, :cond_25

    .line 553
    .line 554
    if-gt v4, v0, :cond_25

    .line 555
    .line 556
    sub-int/2addr v3, v14

    .line 557
    const/16 v24, 0xa

    .line 558
    .line 559
    mul-int/lit8 v3, v3, 0xa

    .line 560
    .line 561
    sub-int/2addr v4, v14

    .line 562
    add-int/2addr v4, v3

    .line 563
    const/4 v0, 0x2

    .line 564
    if-eq v8, v0, :cond_16

    .line 565
    .line 566
    const/4 v0, 0x4

    .line 567
    if-eq v8, v0, :cond_15

    .line 568
    .line 569
    const/4 v0, 0x6

    .line 570
    if-eq v8, v0, :cond_15

    .line 571
    .line 572
    const/16 v0, 0x9

    .line 573
    .line 574
    if-eq v8, v0, :cond_15

    .line 575
    .line 576
    const/16 v0, 0xb

    .line 577
    .line 578
    if-eq v8, v0, :cond_15

    .line 579
    .line 580
    const/16 v0, 0x1f

    .line 581
    .line 582
    goto :goto_9

    .line 583
    :cond_15
    const/16 v0, 0x1e

    .line 584
    .line 585
    goto :goto_9

    .line 586
    :cond_16
    and-int/lit8 v0, v12, 0x3

    .line 587
    .line 588
    if-nez v0, :cond_18

    .line 589
    .line 590
    rem-int/lit8 v0, v12, 0x64

    .line 591
    .line 592
    if-nez v0, :cond_17

    .line 593
    .line 594
    rem-int/lit16 v0, v12, 0x190

    .line 595
    .line 596
    if-nez v0, :cond_18

    .line 597
    .line 598
    :cond_17
    const/16 v0, 0x1d

    .line 599
    .line 600
    goto :goto_9

    .line 601
    :cond_18
    const/16 v0, 0x1c

    .line 602
    .line 603
    :goto_9
    if-nez v4, :cond_1a

    .line 604
    .line 605
    if-nez v12, :cond_19

    .line 606
    .line 607
    goto :goto_a

    .line 608
    :cond_19
    move-object/from16 v2, p0

    .line 609
    .line 610
    move-object/from16 v4, v16

    .line 611
    .line 612
    const/16 v3, 0x13

    .line 613
    .line 614
    const/4 v5, 0x0

    .line 615
    goto/16 :goto_f

    .line 616
    .line 617
    :cond_1a
    :goto_a
    if-gt v4, v0, :cond_19

    .line 618
    .line 619
    const/16 v14, 0x30

    .line 620
    .line 621
    if-lt v13, v14, :cond_24

    .line 622
    .line 623
    const/16 v0, 0x39

    .line 624
    .line 625
    if-gt v13, v0, :cond_24

    .line 626
    .line 627
    if-lt v15, v14, :cond_24

    .line 628
    .line 629
    if-gt v15, v0, :cond_24

    .line 630
    .line 631
    sub-int/2addr v13, v14

    .line 632
    const/16 v24, 0xa

    .line 633
    .line 634
    mul-int/lit8 v13, v13, 0xa

    .line 635
    .line 636
    sub-int/2addr v15, v14

    .line 637
    add-int/2addr v15, v13

    .line 638
    if-lt v5, v14, :cond_23

    .line 639
    .line 640
    if-gt v5, v0, :cond_23

    .line 641
    .line 642
    if-lt v10, v14, :cond_23

    .line 643
    .line 644
    if-gt v10, v0, :cond_23

    .line 645
    .line 646
    sub-int/2addr v5, v14

    .line 647
    mul-int/lit8 v5, v5, 0xa

    .line 648
    .line 649
    sub-int/2addr v10, v14

    .line 650
    add-int/2addr v10, v5

    .line 651
    if-lt v11, v14, :cond_22

    .line 652
    .line 653
    if-gt v11, v0, :cond_22

    .line 654
    .line 655
    move/from16 v2, v18

    .line 656
    .line 657
    if-lt v2, v14, :cond_22

    .line 658
    .line 659
    if-gt v2, v0, :cond_22

    .line 660
    .line 661
    sub-int/2addr v11, v14

    .line 662
    mul-int/lit8 v11, v11, 0xa

    .line 663
    .line 664
    add-int/lit8 v14, v2, -0x30

    .line 665
    .line 666
    add-int/2addr v14, v11

    .line 667
    const/4 v0, 0x1

    .line 668
    if-nez v12, :cond_1b

    .line 669
    .line 670
    if-nez v8, :cond_1b

    .line 671
    .line 672
    if-nez v4, :cond_1b

    .line 673
    .line 674
    const/16 v12, 0x7b2

    .line 675
    .line 676
    move v4, v0

    .line 677
    move v8, v4

    .line 678
    :cond_1b
    invoke-static {v12, v8, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(III)J

    .line 679
    .line 680
    .line 681
    move-result-wide v1

    .line 682
    const-wide/32 v5, 0x15180

    .line 683
    .line 684
    .line 685
    mul-long/2addr v1, v5

    .line 686
    mul-int/lit16 v3, v15, 0xe10

    .line 687
    .line 688
    int-to-long v5, v3

    .line 689
    add-long/2addr v1, v5

    .line 690
    mul-int/lit8 v3, v10, 0x3c

    .line 691
    .line 692
    int-to-long v5, v3

    .line 693
    add-long/2addr v1, v5

    .line 694
    int-to-long v5, v14

    .line 695
    add-long/2addr v1, v5

    .line 696
    if-nez p2, :cond_1c

    .line 697
    .line 698
    sget-object v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 699
    .line 700
    goto :goto_b

    .line 701
    :cond_1c
    move-object/from16 v3, p2

    .line 702
    .line 703
    :goto_b
    sget-object v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Ljava/time/ZoneId;

    .line 704
    .line 705
    if-eq v3, v5, :cond_1e

    .line 706
    .line 707
    invoke-virtual {v3}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 708
    .line 709
    .line 710
    move-result-object v5

    .line 711
    sget-object v6, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰:Ljava/time/zone/ZoneRules;

    .line 712
    .line 713
    if-ne v5, v6, :cond_1d

    .line 714
    .line 715
    goto :goto_c

    .line 716
    :cond_1d
    const/4 v0, 0x0

    .line 717
    :cond_1e
    :goto_c
    if-eqz v0, :cond_1f

    .line 718
    .line 719
    const-wide/32 v5, 0x28d2bea0

    .line 720
    .line 721
    .line 722
    cmp-long v0, v1, v5

    .line 723
    .line 724
    if-ltz v0, :cond_1f

    .line 725
    .line 726
    const/16 v11, 0x7080

    .line 727
    .line 728
    goto :goto_e

    .line 729
    :cond_1f
    sget-object v0, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 730
    .line 731
    if-eq v3, v0, :cond_21

    .line 732
    .line 733
    const-string v0, "UTC"

    .line 734
    .line 735
    invoke-virtual {v3}, Ljava/time/ZoneId;->getId()Ljava/lang/String;

    .line 736
    .line 737
    .line 738
    move-result-object v5

    .line 739
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 740
    .line 741
    .line 742
    move-result v0

    .line 743
    if-eqz v0, :cond_20

    .line 744
    .line 745
    goto :goto_d

    .line 746
    :cond_20
    invoke-static {v12, v8, v4}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 747
    .line 748
    .line 749
    move-result-object v0

    .line 750
    const/4 v4, 0x0

    .line 751
    invoke-static {v15, v10, v14, v4}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 752
    .line 753
    .line 754
    move-result-object v4

    .line 755
    invoke-static {v0, v4}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 756
    .line 757
    .line 758
    move-result-object v0

    .line 759
    invoke-virtual {v3}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 760
    .line 761
    .line 762
    move-result-object v3

    .line 763
    invoke-virtual {v3, v0}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/LocalDateTime;)Ljava/time/ZoneOffset;

    .line 764
    .line 765
    .line 766
    move-result-object v0

    .line 767
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 768
    .line 769
    .line 770
    move-result v11

    .line 771
    goto :goto_e

    .line 772
    :cond_21
    :goto_d
    const/4 v11, 0x0

    .line 773
    :goto_e
    int-to-long v3, v11

    .line 774
    sub-long/2addr v1, v3

    .line 775
    const-wide/16 v3, 0x3e8

    .line 776
    .line 777
    mul-long/2addr v1, v3

    .line 778
    return-wide v1

    .line 779
    :cond_22
    new-instance v0, Ljava/lang/String;

    .line 780
    .line 781
    const/16 v3, 0x13

    .line 782
    .line 783
    move-object/from16 v2, p0

    .line 784
    .line 785
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 786
    .line 787
    .line 788
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 789
    .line 790
    move-object/from16 v4, v16

    .line 791
    .line 792
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 793
    .line 794
    .line 795
    move-result-object v2

    .line 796
    const/4 v5, 0x0

    .line 797
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 798
    .line 799
    .line 800
    throw v1

    .line 801
    :cond_23
    move-object/from16 v2, p0

    .line 802
    .line 803
    move-object/from16 v4, v16

    .line 804
    .line 805
    const/16 v3, 0x13

    .line 806
    .line 807
    const/4 v5, 0x0

    .line 808
    new-instance v0, Ljava/lang/String;

    .line 809
    .line 810
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 811
    .line 812
    .line 813
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 814
    .line 815
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 816
    .line 817
    .line 818
    move-result-object v2

    .line 819
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 820
    .line 821
    .line 822
    throw v1

    .line 823
    :cond_24
    move-object/from16 v2, p0

    .line 824
    .line 825
    move-object/from16 v4, v16

    .line 826
    .line 827
    const/16 v3, 0x13

    .line 828
    .line 829
    const/4 v5, 0x0

    .line 830
    new-instance v0, Ljava/lang/String;

    .line 831
    .line 832
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 833
    .line 834
    .line 835
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 836
    .line 837
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 838
    .line 839
    .line 840
    move-result-object v2

    .line 841
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 842
    .line 843
    .line 844
    throw v1

    .line 845
    :goto_f
    new-instance v0, Ljava/lang/String;

    .line 846
    .line 847
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 848
    .line 849
    .line 850
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 851
    .line 852
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 853
    .line 854
    .line 855
    move-result-object v2

    .line 856
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 857
    .line 858
    .line 859
    throw v1

    .line 860
    :cond_25
    move-object/from16 v2, p0

    .line 861
    .line 862
    move-object/from16 v4, v16

    .line 863
    .line 864
    const/16 v3, 0x13

    .line 865
    .line 866
    const/4 v5, 0x0

    .line 867
    new-instance v0, Ljava/lang/String;

    .line 868
    .line 869
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 870
    .line 871
    .line 872
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 873
    .line 874
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 875
    .line 876
    .line 877
    move-result-object v2

    .line 878
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 879
    .line 880
    .line 881
    throw v1

    .line 882
    :goto_10
    new-instance v0, Ljava/lang/String;

    .line 883
    .line 884
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 885
    .line 886
    .line 887
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 888
    .line 889
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 890
    .line 891
    .line 892
    move-result-object v2

    .line 893
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 894
    .line 895
    .line 896
    throw v1

    .line 897
    :cond_26
    move-object/from16 v2, p0

    .line 898
    .line 899
    move-object/from16 v4, v16

    .line 900
    .line 901
    const/16 v3, 0x13

    .line 902
    .line 903
    const/4 v5, 0x0

    .line 904
    new-instance v0, Ljava/lang/String;

    .line 905
    .line 906
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 907
    .line 908
    .line 909
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 910
    .line 911
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 912
    .line 913
    .line 914
    move-result-object v2

    .line 915
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 916
    .line 917
    .line 918
    throw v1

    .line 919
    :cond_27
    move-object/from16 v2, p0

    .line 920
    .line 921
    :goto_11
    move-object/from16 v4, v16

    .line 922
    .line 923
    goto :goto_12

    .line 924
    :cond_28
    move-object v2, v0

    .line 925
    goto :goto_11

    .line 926
    :goto_12
    new-instance v0, Ljava/lang/String;

    .line 927
    .line 928
    const/16 v3, 0x13

    .line 929
    .line 930
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 931
    .line 932
    .line 933
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 934
    .line 935
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 936
    .line 937
    .line 938
    move-result-object v2

    .line 939
    const/4 v5, 0x0

    .line 940
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 941
    .line 942
    .line 943
    throw v1

    .line 944
    :cond_29
    move-object v2, v0

    .line 945
    move-object v4, v14

    .line 946
    const/16 v3, 0x13

    .line 947
    .line 948
    const/4 v5, 0x0

    .line 949
    new-instance v0, Ljava/lang/String;

    .line 950
    .line 951
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 952
    .line 953
    .line 954
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 955
    .line 956
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 957
    .line 958
    .line 959
    move-result-object v2

    .line 960
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 961
    .line 962
    .line 963
    throw v1

    .line 964
    :cond_2a
    move-object v2, v0

    .line 965
    move-object v4, v14

    .line 966
    const/16 v3, 0x13

    .line 967
    .line 968
    const/4 v5, 0x0

    .line 969
    new-instance v0, Ljava/lang/String;

    .line 970
    .line 971
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 972
    .line 973
    .line 974
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 975
    .line 976
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 977
    .line 978
    .line 979
    move-result-object v2

    .line 980
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 981
    .line 982
    .line 983
    throw v1
.end method

.method public static 飘花落叶言子苏世哲楪兰([BILjava/time/ZoneId;)J
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
    if-ne v4, v11, :cond_5

    .line 189
    .line 190
    if-eq v7, v11, :cond_6

    .line 191
    .line 192
    :cond_5
    const/16 v11, 0x2d

    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_6
    :goto_3
    const/16 v11, 0x20

    .line 196
    .line 197
    goto :goto_5

    .line 198
    :goto_4
    if-ne v4, v11, :cond_7

    .line 199
    .line 200
    if-eq v7, v11, :cond_6

    .line 201
    .line 202
    :cond_7
    const/16 v11, 0x2e

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
    invoke-static {v4, v5, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

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
    invoke-static {v5, v6, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

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
    invoke-static {v5, v6, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

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
    if-ne v4, v11, :cond_2a

    .line 452
    .line 453
    if-ne v8, v11, :cond_2a

    .line 454
    .line 455
    if-ne v13, v11, :cond_2a

    .line 456
    .line 457
    const/16 v11, 0x3a

    .line 458
    .line 459
    if-ne v2, v11, :cond_2a

    .line 460
    .line 461
    move/from16 v2, v22

    .line 462
    .line 463
    if-ne v2, v11, :cond_2a

    .line 464
    .line 465
    invoke-static {v5, v6, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世苏兰(CCC)I

    .line 466
    .line 467
    .line 468
    move-result v2

    .line 469
    if-lez v2, :cond_29

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
    if-lt v2, v14, :cond_28

    .line 501
    .line 502
    const/16 v0, 0x39

    .line 503
    .line 504
    if-gt v2, v0, :cond_27

    .line 505
    .line 506
    if-lt v9, v14, :cond_27

    .line 507
    .line 508
    if-gt v9, v0, :cond_27

    .line 509
    .line 510
    if-lt v6, v14, :cond_27

    .line 511
    .line 512
    if-gt v6, v0, :cond_27

    .line 513
    .line 514
    if-lt v12, v14, :cond_27

    .line 515
    .line 516
    if-gt v12, v0, :cond_27

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
    invoke-static {v9, v14, v0, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(IIII)I

    .line 524
    .line 525
    .line 526
    move-result v0

    .line 527
    move/from16 v2, v24

    .line 528
    .line 529
    invoke-static {v6, v14, v2, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(IIII)I

    .line 530
    .line 531
    .line 532
    move-result v0

    .line 533
    sub-int/2addr v12, v14

    .line 534
    add-int/2addr v12, v0

    .line 535
    if-lt v7, v14, :cond_26

    .line 536
    .line 537
    const/16 v0, 0x39

    .line 538
    .line 539
    if-gt v7, v0, :cond_26

    .line 540
    .line 541
    if-lt v8, v14, :cond_26

    .line 542
    .line 543
    if-gt v8, v0, :cond_26

    .line 544
    .line 545
    sub-int/2addr v7, v14

    .line 546
    mul-int/2addr v7, v2

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
    goto/16 :goto_10

    .line 562
    .line 563
    :cond_14
    :goto_8
    const/16 v0, 0xc

    .line 564
    .line 565
    if-gt v8, v0, :cond_13

    .line 566
    .line 567
    if-lt v3, v14, :cond_25

    .line 568
    .line 569
    const/16 v0, 0x39

    .line 570
    .line 571
    if-gt v3, v0, :cond_25

    .line 572
    .line 573
    if-lt v4, v14, :cond_25

    .line 574
    .line 575
    if-gt v4, v0, :cond_25

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
    const/4 v0, 0x2

    .line 585
    if-eq v8, v0, :cond_16

    .line 586
    .line 587
    const/4 v0, 0x4

    .line 588
    if-eq v8, v0, :cond_15

    .line 589
    .line 590
    const/4 v0, 0x6

    .line 591
    if-eq v8, v0, :cond_15

    .line 592
    .line 593
    const/16 v0, 0x9

    .line 594
    .line 595
    if-eq v8, v0, :cond_15

    .line 596
    .line 597
    const/16 v0, 0xb

    .line 598
    .line 599
    if-eq v8, v0, :cond_15

    .line 600
    .line 601
    const/16 v0, 0x1f

    .line 602
    .line 603
    goto :goto_9

    .line 604
    :cond_15
    const/16 v0, 0x1e

    .line 605
    .line 606
    goto :goto_9

    .line 607
    :cond_16
    and-int/lit8 v0, v12, 0x3

    .line 608
    .line 609
    if-nez v0, :cond_18

    .line 610
    .line 611
    rem-int/lit8 v0, v12, 0x64

    .line 612
    .line 613
    if-nez v0, :cond_17

    .line 614
    .line 615
    rem-int/lit16 v0, v12, 0x190

    .line 616
    .line 617
    if-nez v0, :cond_18

    .line 618
    .line 619
    :cond_17
    const/16 v0, 0x1d

    .line 620
    .line 621
    goto :goto_9

    .line 622
    :cond_18
    const/16 v0, 0x1c

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
    goto/16 :goto_f

    .line 637
    .line 638
    :cond_1a
    :goto_a
    if-gt v4, v0, :cond_19

    .line 639
    .line 640
    const/16 v14, 0x30

    .line 641
    .line 642
    if-lt v13, v14, :cond_24

    .line 643
    .line 644
    const/16 v0, 0x39

    .line 645
    .line 646
    if-gt v13, v0, :cond_24

    .line 647
    .line 648
    if-lt v15, v14, :cond_24

    .line 649
    .line 650
    if-gt v15, v0, :cond_24

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
    if-lt v5, v14, :cond_23

    .line 660
    .line 661
    if-gt v5, v0, :cond_23

    .line 662
    .line 663
    if-lt v10, v14, :cond_23

    .line 664
    .line 665
    if-gt v10, v0, :cond_23

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
    if-lt v11, v14, :cond_22

    .line 673
    .line 674
    if-gt v11, v0, :cond_22

    .line 675
    .line 676
    move/from16 v2, v16

    .line 677
    .line 678
    if-lt v2, v14, :cond_22

    .line 679
    .line 680
    if-gt v2, v0, :cond_22

    .line 681
    .line 682
    sub-int/2addr v11, v14

    .line 683
    mul-int/lit8 v11, v11, 0xa

    .line 684
    .line 685
    add-int/lit8 v14, v2, -0x30

    .line 686
    .line 687
    add-int/2addr v14, v11

    .line 688
    const/4 v0, 0x1

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
    move v4, v0

    .line 698
    move v8, v4

    .line 699
    :cond_1b
    invoke-static {v12, v8, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(III)J

    .line 700
    .line 701
    .line 702
    move-result-wide v1

    .line 703
    const-wide/32 v5, 0x15180

    .line 704
    .line 705
    .line 706
    mul-long/2addr v1, v5

    .line 707
    mul-int/lit16 v3, v15, 0xe10

    .line 708
    .line 709
    int-to-long v5, v3

    .line 710
    add-long/2addr v1, v5

    .line 711
    mul-int/lit8 v3, v10, 0x3c

    .line 712
    .line 713
    int-to-long v5, v3

    .line 714
    add-long/2addr v1, v5

    .line 715
    int-to-long v5, v14

    .line 716
    add-long/2addr v1, v5

    .line 717
    if-nez p2, :cond_1c

    .line 718
    .line 719
    sget-object v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 720
    .line 721
    goto :goto_b

    .line 722
    :cond_1c
    move-object/from16 v3, p2

    .line 723
    .line 724
    :goto_b
    sget-object v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Ljava/time/ZoneId;

    .line 725
    .line 726
    if-eq v3, v5, :cond_1e

    .line 727
    .line 728
    invoke-virtual {v3}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 729
    .line 730
    .line 731
    move-result-object v5

    .line 732
    sget-object v6, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰:Ljava/time/zone/ZoneRules;

    .line 733
    .line 734
    if-ne v5, v6, :cond_1d

    .line 735
    .line 736
    goto :goto_c

    .line 737
    :cond_1d
    const/4 v0, 0x0

    .line 738
    :cond_1e
    :goto_c
    if-eqz v0, :cond_1f

    .line 739
    .line 740
    const-wide/32 v5, 0x28d2bea0

    .line 741
    .line 742
    .line 743
    cmp-long v0, v1, v5

    .line 744
    .line 745
    if-ltz v0, :cond_1f

    .line 746
    .line 747
    const/16 v11, 0x7080

    .line 748
    .line 749
    goto :goto_e

    .line 750
    :cond_1f
    sget-object v0, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 751
    .line 752
    if-eq v3, v0, :cond_21

    .line 753
    .line 754
    const-string v0, "UTC"

    .line 755
    .line 756
    invoke-virtual {v3}, Ljava/time/ZoneId;->getId()Ljava/lang/String;

    .line 757
    .line 758
    .line 759
    move-result-object v5

    .line 760
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 761
    .line 762
    .line 763
    move-result v0

    .line 764
    if-eqz v0, :cond_20

    .line 765
    .line 766
    goto :goto_d

    .line 767
    :cond_20
    invoke-static {v12, v8, v4}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 768
    .line 769
    .line 770
    move-result-object v0

    .line 771
    const/4 v4, 0x0

    .line 772
    invoke-static {v15, v10, v14, v4}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 773
    .line 774
    .line 775
    move-result-object v4

    .line 776
    invoke-static {v0, v4}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 777
    .line 778
    .line 779
    move-result-object v0

    .line 780
    invoke-virtual {v3}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 781
    .line 782
    .line 783
    move-result-object v3

    .line 784
    invoke-virtual {v3, v0}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/LocalDateTime;)Ljava/time/ZoneOffset;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 789
    .line 790
    .line 791
    move-result v11

    .line 792
    goto :goto_e

    .line 793
    :cond_21
    :goto_d
    const/4 v11, 0x0

    .line 794
    :goto_e
    int-to-long v3, v11

    .line 795
    sub-long/2addr v1, v3

    .line 796
    const-wide/16 v3, 0x3e8

    .line 797
    .line 798
    mul-long/2addr v1, v3

    .line 799
    return-wide v1

    .line 800
    :cond_22
    new-instance v0, Ljava/lang/String;

    .line 801
    .line 802
    const/16 v3, 0x13

    .line 803
    .line 804
    move-object/from16 v2, p0

    .line 805
    .line 806
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 807
    .line 808
    .line 809
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 810
    .line 811
    move-object/from16 v4, v17

    .line 812
    .line 813
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    move-result-object v2

    .line 817
    const/4 v5, 0x0

    .line 818
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 819
    .line 820
    .line 821
    throw v1

    .line 822
    :cond_23
    move-object/from16 v2, p0

    .line 823
    .line 824
    move-object/from16 v4, v17

    .line 825
    .line 826
    const/16 v3, 0x13

    .line 827
    .line 828
    const/4 v5, 0x0

    .line 829
    new-instance v0, Ljava/lang/String;

    .line 830
    .line 831
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 832
    .line 833
    .line 834
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 835
    .line 836
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 837
    .line 838
    .line 839
    move-result-object v2

    .line 840
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 841
    .line 842
    .line 843
    throw v1

    .line 844
    :cond_24
    move-object/from16 v2, p0

    .line 845
    .line 846
    move-object/from16 v4, v17

    .line 847
    .line 848
    const/16 v3, 0x13

    .line 849
    .line 850
    const/4 v5, 0x0

    .line 851
    new-instance v0, Ljava/lang/String;

    .line 852
    .line 853
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 854
    .line 855
    .line 856
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 857
    .line 858
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 859
    .line 860
    .line 861
    move-result-object v2

    .line 862
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 863
    .line 864
    .line 865
    throw v1

    .line 866
    :goto_f
    new-instance v0, Ljava/lang/String;

    .line 867
    .line 868
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 869
    .line 870
    .line 871
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 872
    .line 873
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object v2

    .line 877
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 878
    .line 879
    .line 880
    throw v1

    .line 881
    :cond_25
    move-object/from16 v2, p0

    .line 882
    .line 883
    move-object/from16 v4, v17

    .line 884
    .line 885
    const/16 v3, 0x13

    .line 886
    .line 887
    const/4 v5, 0x0

    .line 888
    new-instance v0, Ljava/lang/String;

    .line 889
    .line 890
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 891
    .line 892
    .line 893
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 894
    .line 895
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object v2

    .line 899
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 900
    .line 901
    .line 902
    throw v1

    .line 903
    :goto_10
    new-instance v0, Ljava/lang/String;

    .line 904
    .line 905
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 906
    .line 907
    .line 908
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 909
    .line 910
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 911
    .line 912
    .line 913
    move-result-object v2

    .line 914
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 915
    .line 916
    .line 917
    throw v1

    .line 918
    :cond_26
    move-object/from16 v2, p0

    .line 919
    .line 920
    move-object/from16 v4, v17

    .line 921
    .line 922
    const/16 v3, 0x13

    .line 923
    .line 924
    const/4 v5, 0x0

    .line 925
    new-instance v0, Ljava/lang/String;

    .line 926
    .line 927
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 928
    .line 929
    .line 930
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 931
    .line 932
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 933
    .line 934
    .line 935
    move-result-object v2

    .line 936
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 937
    .line 938
    .line 939
    throw v1

    .line 940
    :cond_27
    move-object/from16 v2, p0

    .line 941
    .line 942
    :goto_11
    move-object/from16 v4, v17

    .line 943
    .line 944
    goto :goto_12

    .line 945
    :cond_28
    move-object v2, v0

    .line 946
    goto :goto_11

    .line 947
    :goto_12
    new-instance v0, Ljava/lang/String;

    .line 948
    .line 949
    const/16 v3, 0x13

    .line 950
    .line 951
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 952
    .line 953
    .line 954
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 955
    .line 956
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 957
    .line 958
    .line 959
    move-result-object v2

    .line 960
    const/4 v5, 0x0

    .line 961
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 962
    .line 963
    .line 964
    throw v1

    .line 965
    :cond_29
    move-object v2, v0

    .line 966
    move-object v4, v14

    .line 967
    const/16 v3, 0x13

    .line 968
    .line 969
    const/4 v5, 0x0

    .line 970
    new-instance v0, Ljava/lang/String;

    .line 971
    .line 972
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 973
    .line 974
    .line 975
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 976
    .line 977
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 978
    .line 979
    .line 980
    move-result-object v2

    .line 981
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 982
    .line 983
    .line 984
    throw v1

    .line 985
    :cond_2a
    move-object v2, v0

    .line 986
    move-object v4, v14

    .line 987
    const/16 v3, 0x13

    .line 988
    .line 989
    const/4 v5, 0x0

    .line 990
    new-instance v0, Ljava/lang/String;

    .line 991
    .line 992
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([BII)V

    .line 993
    .line 994
    .line 995
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 996
    .line 997
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 998
    .line 999
    .line 1000
    move-result-object v2

    .line 1001
    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 1002
    .line 1003
    .line 1004
    throw v1
.end method

.method public static 飘花落叶言子苏世楪兰哲(Ljava/lang/String;Ljava/time/ZoneId;Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)J
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_25

    .line 6
    .line 7
    const-string v3, "null"

    .line 8
    .line 9
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    goto/16 :goto_f

    .line 16
    .line 17
    :cond_0
    move-object/from16 v3, p2

    .line 18
    .line 19
    iget v4, v3, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->length:I

    .line 20
    .line 21
    const/16 v5, 0x13

    .line 22
    .line 23
    if-ne v4, v5, :cond_24

    .line 24
    .line 25
    sget v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏:I

    .line 26
    .line 27
    const/4 v10, 0x7

    .line 28
    const-string v11, "illegal input "

    .line 29
    .line 30
    const/16 v14, 0x9

    .line 31
    .line 32
    const/4 v15, 0x5

    .line 33
    const/16 v16, 0x12

    .line 34
    .line 35
    const/4 v2, 0x2

    .line 36
    const/16 v17, 0x11

    .line 37
    .line 38
    const/16 v4, 0x8

    .line 39
    .line 40
    const/16 v18, 0x10

    .line 41
    .line 42
    const/4 v6, 0x6

    .line 43
    const/16 v19, 0xf

    .line 44
    .line 45
    const/4 v7, 0x4

    .line 46
    const/16 v20, 0xe

    .line 47
    .line 48
    const/4 v8, 0x3

    .line 49
    const/16 v21, 0xd

    .line 50
    .line 51
    const/4 v9, 0x1

    .line 52
    const/16 v22, 0xc

    .line 53
    .line 54
    const/16 v23, 0xb

    .line 55
    .line 56
    const/4 v13, 0x0

    .line 57
    if-ne v1, v4, :cond_2

    .line 58
    .line 59
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)[C

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const/16 v24, 0xa

    .line 64
    .line 65
    array-length v12, v1

    .line 66
    if-ne v12, v5, :cond_1

    .line 67
    .line 68
    aget-char v5, v1, v13

    .line 69
    .line 70
    aget-char v11, v1, v9

    .line 71
    .line 72
    aget-char v12, v1, v2

    .line 73
    .line 74
    aget-char v25, v1, v8

    .line 75
    .line 76
    aget-char v26, v1, v7

    .line 77
    .line 78
    aget-char v27, v1, v15

    .line 79
    .line 80
    aget-char v28, v1, v6

    .line 81
    .line 82
    aget-char v10, v1, v10

    .line 83
    .line 84
    aget-char v4, v1, v4

    .line 85
    .line 86
    aget-char v29, v1, v14

    .line 87
    .line 88
    aget-char v30, v1, v24

    .line 89
    .line 90
    aget-char v31, v1, v23

    .line 91
    .line 92
    aget-char v32, v1, v22

    .line 93
    .line 94
    aget-char v21, v1, v21

    .line 95
    .line 96
    aget-char v20, v1, v20

    .line 97
    .line 98
    aget-char v19, v1, v19

    .line 99
    .line 100
    aget-char v18, v1, v18

    .line 101
    .line 102
    aget-char v17, v1, v17

    .line 103
    .line 104
    aget-char v1, v1, v16

    .line 105
    .line 106
    move v9, v1

    .line 107
    move/from16 v2, v17

    .line 108
    .line 109
    move/from16 v6, v18

    .line 110
    .line 111
    move/from16 v7, v19

    .line 112
    .line 113
    move/from16 v8, v20

    .line 114
    .line 115
    move/from16 v13, v21

    .line 116
    .line 117
    move/from16 v14, v25

    .line 118
    .line 119
    move/from16 v15, v26

    .line 120
    .line 121
    move/from16 v1, v27

    .line 122
    .line 123
    move/from16 v16, v28

    .line 124
    .line 125
    move/from16 v17, v29

    .line 126
    .line 127
    move/from16 v3, v30

    .line 128
    .line 129
    move/from16 v18, v4

    .line 130
    .line 131
    move/from16 v19, v5

    .line 132
    .line 133
    move/from16 v20, v11

    .line 134
    .line 135
    move/from16 v4, v31

    .line 136
    .line 137
    move/from16 v5, v32

    .line 138
    .line 139
    goto/16 :goto_1

    .line 140
    .line 141
    :cond_1
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 142
    .line 143
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-direct {v1, v2, v0, v13}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 148
    .line 149
    .line 150
    throw v1

    .line 151
    :cond_2
    const/16 v24, 0xa

    .line 152
    .line 153
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏世哲:Ljava/util/function/ToIntFunction;

    .line 154
    .line 155
    if-eqz v1, :cond_4

    .line 156
    .line 157
    sget-object v12, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏哲世:Ljava/util/function/Function;

    .line 158
    .line 159
    if-eqz v12, :cond_4

    .line 160
    .line 161
    invoke-interface {v1, v0}, Ljava/util/function/ToIntFunction;->applyAsInt(Ljava/lang/Object;)I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    if-nez v1, :cond_4

    .line 166
    .line 167
    invoke-interface {v12, v0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    check-cast v1, [B

    .line 172
    .line 173
    array-length v12, v1

    .line 174
    if-ne v12, v5, :cond_3

    .line 175
    .line 176
    aget-byte v5, v1, v13

    .line 177
    .line 178
    int-to-char v5, v5

    .line 179
    aget-byte v11, v1, v9

    .line 180
    .line 181
    int-to-char v11, v11

    .line 182
    aget-byte v12, v1, v2

    .line 183
    .line 184
    int-to-char v12, v12

    .line 185
    move/from16 v25, v14

    .line 186
    .line 187
    aget-byte v14, v1, v8

    .line 188
    .line 189
    int-to-char v14, v14

    .line 190
    move/from16 v26, v4

    .line 191
    .line 192
    aget-byte v4, v1, v7

    .line 193
    .line 194
    int-to-char v4, v4

    .line 195
    move/from16 v27, v10

    .line 196
    .line 197
    aget-byte v10, v1, v15

    .line 198
    .line 199
    int-to-char v10, v10

    .line 200
    move/from16 v28, v6

    .line 201
    .line 202
    aget-byte v6, v1, v28

    .line 203
    .line 204
    int-to-char v6, v6

    .line 205
    aget-byte v15, v1, v27

    .line 206
    .line 207
    int-to-char v15, v15

    .line 208
    aget-byte v7, v1, v26

    .line 209
    .line 210
    int-to-char v7, v7

    .line 211
    aget-byte v8, v1, v25

    .line 212
    .line 213
    int-to-char v8, v8

    .line 214
    aget-byte v2, v1, v24

    .line 215
    .line 216
    int-to-char v2, v2

    .line 217
    aget-byte v9, v1, v23

    .line 218
    .line 219
    int-to-char v9, v9

    .line 220
    aget-byte v13, v1, v22

    .line 221
    .line 222
    int-to-char v13, v13

    .line 223
    move-object/from16 v34, v1

    .line 224
    .line 225
    aget-byte v1, v34, v21

    .line 226
    .line 227
    int-to-char v1, v1

    .line 228
    move/from16 v21, v1

    .line 229
    .line 230
    aget-byte v1, v34, v20

    .line 231
    .line 232
    int-to-char v1, v1

    .line 233
    move/from16 v20, v1

    .line 234
    .line 235
    aget-byte v1, v34, v19

    .line 236
    .line 237
    int-to-char v1, v1

    .line 238
    move/from16 v19, v1

    .line 239
    .line 240
    aget-byte v1, v34, v18

    .line 241
    .line 242
    int-to-char v1, v1

    .line 243
    move/from16 v18, v1

    .line 244
    .line 245
    aget-byte v1, v34, v17

    .line 246
    .line 247
    int-to-char v1, v1

    .line 248
    move/from16 v17, v1

    .line 249
    .line 250
    aget-byte v1, v34, v16

    .line 251
    .line 252
    int-to-char v1, v1

    .line 253
    move v3, v9

    .line 254
    move v9, v1

    .line 255
    move v1, v10

    .line 256
    move v10, v15

    .line 257
    move v15, v4

    .line 258
    move v4, v3

    .line 259
    move v3, v2

    .line 260
    move/from16 v16, v6

    .line 261
    .line 262
    move/from16 v2, v17

    .line 263
    .line 264
    move/from16 v6, v18

    .line 265
    .line 266
    move/from16 v18, v7

    .line 267
    .line 268
    move/from16 v17, v8

    .line 269
    .line 270
    move/from16 v7, v19

    .line 271
    .line 272
    move/from16 v8, v20

    .line 273
    .line 274
    move/from16 v19, v5

    .line 275
    .line 276
    move/from16 v20, v11

    .line 277
    .line 278
    move v5, v13

    .line 279
    :goto_0
    move/from16 v13, v21

    .line 280
    .line 281
    goto/16 :goto_1

    .line 282
    .line 283
    :cond_3
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 284
    .line 285
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    const/4 v4, 0x0

    .line 290
    invoke-direct {v1, v2, v0, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 291
    .line 292
    .line 293
    throw v1

    .line 294
    :cond_4
    move/from16 v26, v4

    .line 295
    .line 296
    move/from16 v28, v6

    .line 297
    .line 298
    move/from16 v27, v10

    .line 299
    .line 300
    move v4, v13

    .line 301
    move/from16 v25, v14

    .line 302
    .line 303
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    if-ne v1, v5, :cond_23

    .line 308
    .line 309
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 310
    .line 311
    .line 312
    move-result v5

    .line 313
    const/4 v1, 0x1

    .line 314
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 315
    .line 316
    .line 317
    move-result v11

    .line 318
    const/4 v2, 0x2

    .line 319
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 320
    .line 321
    .line 322
    move-result v12

    .line 323
    const/4 v2, 0x3

    .line 324
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 325
    .line 326
    .line 327
    move-result v4

    .line 328
    const/4 v2, 0x4

    .line 329
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 330
    .line 331
    .line 332
    move-result v6

    .line 333
    const/4 v2, 0x5

    .line 334
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 335
    .line 336
    .line 337
    move-result v7

    .line 338
    move/from16 v2, v28

    .line 339
    .line 340
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 341
    .line 342
    .line 343
    move-result v8

    .line 344
    move/from16 v2, v27

    .line 345
    .line 346
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 347
    .line 348
    .line 349
    move-result v10

    .line 350
    move/from16 v2, v26

    .line 351
    .line 352
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 353
    .line 354
    .line 355
    move-result v2

    .line 356
    move/from16 v9, v25

    .line 357
    .line 358
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 359
    .line 360
    .line 361
    move-result v13

    .line 362
    move/from16 v9, v24

    .line 363
    .line 364
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 365
    .line 366
    .line 367
    move-result v14

    .line 368
    move/from16 v9, v23

    .line 369
    .line 370
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 371
    .line 372
    .line 373
    move-result v15

    .line 374
    move/from16 v9, v22

    .line 375
    .line 376
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 377
    .line 378
    .line 379
    move-result v26

    .line 380
    move/from16 v9, v21

    .line 381
    .line 382
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 383
    .line 384
    .line 385
    move-result v21

    .line 386
    move/from16 v9, v20

    .line 387
    .line 388
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 389
    .line 390
    .line 391
    move-result v20

    .line 392
    move/from16 v9, v19

    .line 393
    .line 394
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 395
    .line 396
    .line 397
    move-result v19

    .line 398
    move/from16 v9, v18

    .line 399
    .line 400
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 401
    .line 402
    .line 403
    move-result v18

    .line 404
    move/from16 v9, v17

    .line 405
    .line 406
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 407
    .line 408
    .line 409
    move-result v17

    .line 410
    move/from16 v9, v16

    .line 411
    .line 412
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 413
    .line 414
    .line 415
    move-result v9

    .line 416
    move v1, v7

    .line 417
    move/from16 v16, v8

    .line 418
    .line 419
    move v3, v14

    .line 420
    move/from16 v7, v19

    .line 421
    .line 422
    move/from16 v8, v20

    .line 423
    .line 424
    move v14, v4

    .line 425
    move/from16 v19, v5

    .line 426
    .line 427
    move/from16 v20, v11

    .line 428
    .line 429
    move v4, v15

    .line 430
    move/from16 v5, v26

    .line 431
    .line 432
    move v15, v6

    .line 433
    move/from16 v6, v18

    .line 434
    .line 435
    move/from16 v18, v2

    .line 436
    .line 437
    move/from16 v2, v17

    .line 438
    .line 439
    move/from16 v17, v13

    .line 440
    .line 441
    goto/16 :goto_0

    .line 442
    .line 443
    :goto_1
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Enum;->ordinal()I

    .line 444
    .line 445
    .line 446
    move-result v11

    .line 447
    move/from16 v21, v14

    .line 448
    .line 449
    const-string v14, "illegal input"

    .line 450
    .line 451
    move/from16 v34, v9

    .line 452
    .line 453
    const/4 v9, 0x3

    .line 454
    if-eq v11, v9, :cond_b

    .line 455
    .line 456
    const/4 v9, 0x4

    .line 457
    if-eq v11, v9, :cond_9

    .line 458
    .line 459
    const/4 v9, 0x5

    .line 460
    if-eq v11, v9, :cond_7

    .line 461
    .line 462
    const/4 v9, 0x6

    .line 463
    if-ne v11, v9, :cond_6

    .line 464
    .line 465
    const/16 v9, 0x2e

    .line 466
    .line 467
    if-ne v12, v9, :cond_5

    .line 468
    .line 469
    if-ne v1, v9, :cond_5

    .line 470
    .line 471
    const/16 v1, 0x20

    .line 472
    .line 473
    if-ne v3, v1, :cond_5

    .line 474
    .line 475
    const/16 v1, 0x3a

    .line 476
    .line 477
    if-ne v13, v1, :cond_5

    .line 478
    .line 479
    if-ne v6, v1, :cond_5

    .line 480
    .line 481
    move/from16 v3, v16

    .line 482
    .line 483
    move/from16 v6, v17

    .line 484
    .line 485
    move/from16 v12, v18

    .line 486
    .line 487
    move/from16 v1, v19

    .line 488
    .line 489
    move/from16 v11, v20

    .line 490
    .line 491
    move/from16 v9, v21

    .line 492
    .line 493
    goto :goto_3

    .line 494
    :cond_5
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 495
    .line 496
    const/4 v4, 0x0

    .line 497
    invoke-direct {v1, v14, v0, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 498
    .line 499
    .line 500
    throw v1

    .line 501
    :cond_6
    const/4 v4, 0x0

    .line 502
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 503
    .line 504
    invoke-direct {v1, v14, v0, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 505
    .line 506
    .line 507
    throw v1

    .line 508
    :cond_7
    const/16 v9, 0x2f

    .line 509
    .line 510
    if-ne v15, v9, :cond_8

    .line 511
    .line 512
    if-ne v10, v9, :cond_8

    .line 513
    .line 514
    const/16 v9, 0x20

    .line 515
    .line 516
    if-ne v3, v9, :cond_8

    .line 517
    .line 518
    const/16 v3, 0x3a

    .line 519
    .line 520
    if-ne v13, v3, :cond_8

    .line 521
    .line 522
    if-ne v6, v3, :cond_8

    .line 523
    .line 524
    goto :goto_2

    .line 525
    :cond_8
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 526
    .line 527
    const/4 v4, 0x0

    .line 528
    invoke-direct {v1, v14, v0, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 529
    .line 530
    .line 531
    throw v1

    .line 532
    :cond_9
    const/16 v9, 0x2d

    .line 533
    .line 534
    if-ne v15, v9, :cond_a

    .line 535
    .line 536
    if-ne v10, v9, :cond_a

    .line 537
    .line 538
    const/16 v9, 0x54

    .line 539
    .line 540
    if-ne v3, v9, :cond_a

    .line 541
    .line 542
    const/16 v3, 0x3a

    .line 543
    .line 544
    if-ne v13, v3, :cond_a

    .line 545
    .line 546
    if-ne v6, v3, :cond_a

    .line 547
    .line 548
    goto :goto_2

    .line 549
    :cond_a
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 550
    .line 551
    const/4 v4, 0x0

    .line 552
    invoke-direct {v1, v14, v0, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 553
    .line 554
    .line 555
    throw v1

    .line 556
    :cond_b
    const/16 v9, 0x2d

    .line 557
    .line 558
    if-ne v15, v9, :cond_22

    .line 559
    .line 560
    if-ne v10, v9, :cond_22

    .line 561
    .line 562
    const/16 v9, 0x20

    .line 563
    .line 564
    if-ne v3, v9, :cond_22

    .line 565
    .line 566
    const/16 v3, 0x3a

    .line 567
    .line 568
    if-ne v13, v3, :cond_22

    .line 569
    .line 570
    if-ne v6, v3, :cond_22

    .line 571
    .line 572
    :goto_2
    move v9, v1

    .line 573
    move/from16 v15, v16

    .line 574
    .line 575
    move/from16 v11, v17

    .line 576
    .line 577
    move/from16 v1, v18

    .line 578
    .line 579
    move/from16 v3, v19

    .line 580
    .line 581
    move/from16 v10, v20

    .line 582
    .line 583
    move/from16 v6, v21

    .line 584
    .line 585
    :goto_3
    const/16 v13, 0x30

    .line 586
    .line 587
    if-lt v3, v13, :cond_21

    .line 588
    .line 589
    const/16 v0, 0x39

    .line 590
    .line 591
    if-gt v3, v0, :cond_20

    .line 592
    .line 593
    if-lt v10, v13, :cond_20

    .line 594
    .line 595
    if-gt v10, v0, :cond_20

    .line 596
    .line 597
    if-lt v12, v13, :cond_20

    .line 598
    .line 599
    if-gt v12, v0, :cond_20

    .line 600
    .line 601
    if-lt v6, v13, :cond_20

    .line 602
    .line 603
    if-gt v6, v0, :cond_20

    .line 604
    .line 605
    sub-int/2addr v3, v13

    .line 606
    mul-int/lit16 v3, v3, 0x3e8

    .line 607
    .line 608
    const/16 v0, 0x64

    .line 609
    .line 610
    invoke-static {v10, v13, v0, v3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(IIII)I

    .line 611
    .line 612
    .line 613
    move-result v0

    .line 614
    const/16 v3, 0xa

    .line 615
    .line 616
    invoke-static {v12, v13, v3, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(IIII)I

    .line 617
    .line 618
    .line 619
    move-result v0

    .line 620
    sub-int/2addr v6, v13

    .line 621
    add-int/2addr v6, v0

    .line 622
    if-lt v9, v13, :cond_1f

    .line 623
    .line 624
    const/16 v0, 0x39

    .line 625
    .line 626
    if-gt v9, v0, :cond_1f

    .line 627
    .line 628
    if-lt v15, v13, :cond_1f

    .line 629
    .line 630
    if-gt v15, v0, :cond_1f

    .line 631
    .line 632
    sub-int/2addr v9, v13

    .line 633
    mul-int/2addr v9, v3

    .line 634
    sub-int/2addr v15, v13

    .line 635
    add-int/2addr v15, v9

    .line 636
    if-nez v15, :cond_c

    .line 637
    .line 638
    if-nez v6, :cond_d

    .line 639
    .line 640
    :cond_c
    const/16 v9, 0xc

    .line 641
    .line 642
    goto :goto_4

    .line 643
    :cond_d
    const/4 v4, 0x0

    .line 644
    move-object/from16 v1, p0

    .line 645
    .line 646
    goto/16 :goto_d

    .line 647
    .line 648
    :goto_4
    if-gt v15, v9, :cond_d

    .line 649
    .line 650
    if-lt v1, v13, :cond_1e

    .line 651
    .line 652
    const/16 v0, 0x39

    .line 653
    .line 654
    if-gt v1, v0, :cond_1e

    .line 655
    .line 656
    if-lt v11, v13, :cond_1e

    .line 657
    .line 658
    if-gt v11, v0, :cond_1e

    .line 659
    .line 660
    sub-int/2addr v1, v13

    .line 661
    const/16 v24, 0xa

    .line 662
    .line 663
    mul-int/lit8 v1, v1, 0xa

    .line 664
    .line 665
    sub-int/2addr v11, v13

    .line 666
    add-int/2addr v11, v1

    .line 667
    const/4 v0, 0x2

    .line 668
    if-eq v15, v0, :cond_f

    .line 669
    .line 670
    const/4 v9, 0x4

    .line 671
    if-eq v15, v9, :cond_e

    .line 672
    .line 673
    const/4 v9, 0x6

    .line 674
    if-eq v15, v9, :cond_e

    .line 675
    .line 676
    const/16 v9, 0x9

    .line 677
    .line 678
    if-eq v15, v9, :cond_e

    .line 679
    .line 680
    const/16 v9, 0xb

    .line 681
    .line 682
    if-eq v15, v9, :cond_e

    .line 683
    .line 684
    const/16 v0, 0x1f

    .line 685
    .line 686
    goto :goto_5

    .line 687
    :cond_e
    const/16 v0, 0x1e

    .line 688
    .line 689
    goto :goto_5

    .line 690
    :cond_f
    and-int/lit8 v0, v6, 0x3

    .line 691
    .line 692
    if-nez v0, :cond_11

    .line 693
    .line 694
    rem-int/lit8 v0, v6, 0x64

    .line 695
    .line 696
    if-nez v0, :cond_10

    .line 697
    .line 698
    rem-int/lit16 v0, v6, 0x190

    .line 699
    .line 700
    if-nez v0, :cond_11

    .line 701
    .line 702
    :cond_10
    const/16 v0, 0x1d

    .line 703
    .line 704
    goto :goto_5

    .line 705
    :cond_11
    const/16 v0, 0x1c

    .line 706
    .line 707
    :goto_5
    if-nez v11, :cond_13

    .line 708
    .line 709
    if-nez v6, :cond_12

    .line 710
    .line 711
    goto :goto_6

    .line 712
    :cond_12
    const/4 v4, 0x0

    .line 713
    move-object/from16 v1, p0

    .line 714
    .line 715
    goto/16 :goto_c

    .line 716
    .line 717
    :cond_13
    :goto_6
    if-gt v11, v0, :cond_12

    .line 718
    .line 719
    if-lt v4, v13, :cond_1d

    .line 720
    .line 721
    const/16 v0, 0x39

    .line 722
    .line 723
    if-gt v4, v0, :cond_1d

    .line 724
    .line 725
    if-lt v5, v13, :cond_1d

    .line 726
    .line 727
    if-gt v5, v0, :cond_1d

    .line 728
    .line 729
    sub-int/2addr v4, v13

    .line 730
    const/16 v24, 0xa

    .line 731
    .line 732
    mul-int/lit8 v4, v4, 0xa

    .line 733
    .line 734
    sub-int/2addr v5, v13

    .line 735
    add-int/2addr v5, v4

    .line 736
    if-lt v8, v13, :cond_1c

    .line 737
    .line 738
    if-gt v8, v0, :cond_1c

    .line 739
    .line 740
    if-lt v7, v13, :cond_1c

    .line 741
    .line 742
    if-gt v7, v0, :cond_1c

    .line 743
    .line 744
    sub-int/2addr v8, v13

    .line 745
    mul-int/lit8 v8, v8, 0xa

    .line 746
    .line 747
    sub-int/2addr v7, v13

    .line 748
    add-int/2addr v7, v8

    .line 749
    if-lt v2, v13, :cond_1b

    .line 750
    .line 751
    if-gt v2, v0, :cond_1b

    .line 752
    .line 753
    move/from16 v1, v34

    .line 754
    .line 755
    if-lt v1, v13, :cond_1b

    .line 756
    .line 757
    if-gt v1, v0, :cond_1b

    .line 758
    .line 759
    sub-int/2addr v2, v13

    .line 760
    mul-int/lit8 v2, v2, 0xa

    .line 761
    .line 762
    add-int/lit8 v9, v1, -0x30

    .line 763
    .line 764
    add-int/2addr v9, v2

    .line 765
    if-nez v6, :cond_14

    .line 766
    .line 767
    if-nez v15, :cond_14

    .line 768
    .line 769
    if-nez v11, :cond_14

    .line 770
    .line 771
    const/16 v6, 0x7b2

    .line 772
    .line 773
    const/4 v11, 0x1

    .line 774
    const/4 v15, 0x1

    .line 775
    :cond_14
    invoke-static {v6, v15, v11}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(III)J

    .line 776
    .line 777
    .line 778
    move-result-wide v0

    .line 779
    const-wide/32 v2, 0x15180

    .line 780
    .line 781
    .line 782
    mul-long/2addr v0, v2

    .line 783
    mul-int/lit16 v2, v5, 0xe10

    .line 784
    .line 785
    int-to-long v2, v2

    .line 786
    add-long/2addr v0, v2

    .line 787
    mul-int/lit8 v2, v7, 0x3c

    .line 788
    .line 789
    int-to-long v2, v2

    .line 790
    add-long/2addr v0, v2

    .line 791
    int-to-long v2, v9

    .line 792
    add-long/2addr v0, v2

    .line 793
    if-nez p1, :cond_15

    .line 794
    .line 795
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 796
    .line 797
    goto :goto_7

    .line 798
    :cond_15
    move-object/from16 v2, p1

    .line 799
    .line 800
    :goto_7
    sget-object v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Ljava/time/ZoneId;

    .line 801
    .line 802
    if-eq v2, v3, :cond_17

    .line 803
    .line 804
    invoke-virtual {v2}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 805
    .line 806
    .line 807
    move-result-object v3

    .line 808
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰:Ljava/time/zone/ZoneRules;

    .line 809
    .line 810
    if-ne v3, v4, :cond_16

    .line 811
    .line 812
    goto :goto_8

    .line 813
    :cond_16
    const/16 v33, 0x0

    .line 814
    .line 815
    goto :goto_9

    .line 816
    :cond_17
    :goto_8
    const/16 v33, 0x1

    .line 817
    .line 818
    :goto_9
    if-eqz v33, :cond_18

    .line 819
    .line 820
    const-wide/32 v3, 0x28d2bea0

    .line 821
    .line 822
    .line 823
    cmp-long v3, v0, v3

    .line 824
    .line 825
    if-ltz v3, :cond_18

    .line 826
    .line 827
    const/16 v13, 0x7080

    .line 828
    .line 829
    goto :goto_b

    .line 830
    :cond_18
    sget-object v3, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 831
    .line 832
    if-eq v2, v3, :cond_1a

    .line 833
    .line 834
    const-string v3, "UTC"

    .line 835
    .line 836
    invoke-virtual {v2}, Ljava/time/ZoneId;->getId()Ljava/lang/String;

    .line 837
    .line 838
    .line 839
    move-result-object v4

    .line 840
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 841
    .line 842
    .line 843
    move-result v3

    .line 844
    if-eqz v3, :cond_19

    .line 845
    .line 846
    goto :goto_a

    .line 847
    :cond_19
    invoke-static {v6, v15, v11}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 848
    .line 849
    .line 850
    move-result-object v3

    .line 851
    const/4 v4, 0x0

    .line 852
    invoke-static {v5, v7, v9, v4}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 853
    .line 854
    .line 855
    move-result-object v4

    .line 856
    invoke-static {v3, v4}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 857
    .line 858
    .line 859
    move-result-object v3

    .line 860
    invoke-virtual {v2}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 861
    .line 862
    .line 863
    move-result-object v2

    .line 864
    invoke-virtual {v2, v3}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/LocalDateTime;)Ljava/time/ZoneOffset;

    .line 865
    .line 866
    .line 867
    move-result-object v2

    .line 868
    invoke-virtual {v2}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 869
    .line 870
    .line 871
    move-result v13

    .line 872
    goto :goto_b

    .line 873
    :cond_1a
    :goto_a
    const/4 v13, 0x0

    .line 874
    :goto_b
    int-to-long v2, v13

    .line 875
    sub-long/2addr v0, v2

    .line 876
    const-wide/16 v2, 0x3e8

    .line 877
    .line 878
    mul-long/2addr v0, v2

    .line 879
    return-wide v0

    .line 880
    :cond_1b
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 881
    .line 882
    const/4 v4, 0x0

    .line 883
    move-object/from16 v1, p0

    .line 884
    .line 885
    invoke-direct {v0, v14, v1, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 886
    .line 887
    .line 888
    throw v0

    .line 889
    :cond_1c
    const/4 v4, 0x0

    .line 890
    move-object/from16 v1, p0

    .line 891
    .line 892
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 893
    .line 894
    invoke-direct {v0, v14, v1, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 895
    .line 896
    .line 897
    throw v0

    .line 898
    :cond_1d
    const/4 v4, 0x0

    .line 899
    move-object/from16 v1, p0

    .line 900
    .line 901
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 902
    .line 903
    invoke-direct {v0, v14, v1, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 904
    .line 905
    .line 906
    throw v0

    .line 907
    :goto_c
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 908
    .line 909
    invoke-direct {v0, v14, v1, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 910
    .line 911
    .line 912
    throw v0

    .line 913
    :cond_1e
    const/4 v4, 0x0

    .line 914
    move-object/from16 v1, p0

    .line 915
    .line 916
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 917
    .line 918
    invoke-direct {v0, v14, v1, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 919
    .line 920
    .line 921
    throw v0

    .line 922
    :goto_d
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 923
    .line 924
    invoke-direct {v0, v14, v1, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 925
    .line 926
    .line 927
    throw v0

    .line 928
    :cond_1f
    const/4 v4, 0x0

    .line 929
    move-object/from16 v1, p0

    .line 930
    .line 931
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 932
    .line 933
    invoke-direct {v0, v14, v1, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 934
    .line 935
    .line 936
    throw v0

    .line 937
    :cond_20
    const/4 v4, 0x0

    .line 938
    move-object/from16 v1, p0

    .line 939
    .line 940
    goto :goto_e

    .line 941
    :cond_21
    move-object v1, v0

    .line 942
    const/4 v4, 0x0

    .line 943
    :goto_e
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 944
    .line 945
    invoke-direct {v0, v14, v1, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 946
    .line 947
    .line 948
    throw v0

    .line 949
    :cond_22
    move-object v1, v0

    .line 950
    const/4 v4, 0x0

    .line 951
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 952
    .line 953
    invoke-direct {v0, v14, v1, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 954
    .line 955
    .line 956
    throw v0

    .line 957
    :cond_23
    move-object v1, v0

    .line 958
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 959
    .line 960
    invoke-virtual {v11, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 961
    .line 962
    .line 963
    move-result-object v2

    .line 964
    invoke-direct {v0, v2, v1, v4}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 965
    .line 966
    .line 967
    throw v0

    .line 968
    :cond_24
    invoke-static {}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世()V

    .line 969
    .line 970
    .line 971
    :cond_25
    :goto_f
    return-wide v1
.end method

.method public static 飘花落叶言子苏世楪哲兰(Ljava/lang/String;Ljava/time/ZoneId;Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;)J
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_1c

    .line 8
    .line 9
    const-string v4, "null"

    .line 10
    .line 11
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    goto/16 :goto_5

    .line 18
    .line 19
    :cond_0
    move-object/from16 v4, p2

    .line 20
    .line 21
    iget v5, v4, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->length:I

    .line 22
    .line 23
    const/16 v6, 0xa

    .line 24
    .line 25
    if-ne v5, v6, :cond_1b

    .line 26
    .line 27
    sget v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏:I

    .line 28
    .line 29
    const/4 v3, 0x7

    .line 30
    const/4 v5, 0x5

    .line 31
    const-string v7, "illegal input "

    .line 32
    .line 33
    const/4 v9, 0x6

    .line 34
    const/4 v10, 0x4

    .line 35
    const/4 v11, 0x3

    .line 36
    const/4 v12, 0x2

    .line 37
    const/16 v13, 0x8

    .line 38
    .line 39
    const/4 v14, 0x1

    .line 40
    const/4 v15, 0x0

    .line 41
    if-ne v2, v13, :cond_2

    .line 42
    .line 43
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)[C

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    const/16 v16, 0x9

    .line 48
    .line 49
    array-length v8, v2

    .line 50
    if-ne v8, v6, :cond_1

    .line 51
    .line 52
    aget-char v7, v2, v15

    .line 53
    .line 54
    aget-char v8, v2, v14

    .line 55
    .line 56
    aget-char v17, v2, v12

    .line 57
    .line 58
    aget-char v11, v2, v11

    .line 59
    .line 60
    aget-char v18, v2, v10

    .line 61
    .line 62
    aget-char v5, v2, v5

    .line 63
    .line 64
    aget-char v19, v2, v9

    .line 65
    .line 66
    aget-char v3, v2, v3

    .line 67
    .line 68
    aget-char v13, v2, v13

    .line 69
    .line 70
    aget-char v2, v2, v16

    .line 71
    .line 72
    move/from16 v9, v17

    .line 73
    .line 74
    move/from16 v10, v18

    .line 75
    .line 76
    move/from16 v12, v19

    .line 77
    .line 78
    goto/16 :goto_0

    .line 79
    .line 80
    :cond_1
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 81
    .line 82
    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-direct {v1, v2, v0, v15}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 87
    .line 88
    .line 89
    throw v1

    .line 90
    :cond_2
    const/16 v16, 0x9

    .line 91
    .line 92
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏世哲:Ljava/util/function/ToIntFunction;

    .line 93
    .line 94
    if-eqz v2, :cond_4

    .line 95
    .line 96
    sget-object v8, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏哲世:Ljava/util/function/Function;

    .line 97
    .line 98
    if-eqz v8, :cond_4

    .line 99
    .line 100
    invoke-interface {v2, v0}, Ljava/util/function/ToIntFunction;->applyAsInt(Ljava/lang/Object;)I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-nez v2, :cond_4

    .line 105
    .line 106
    invoke-interface {v8, v0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    check-cast v2, [B

    .line 111
    .line 112
    array-length v8, v2

    .line 113
    if-ne v8, v6, :cond_3

    .line 114
    .line 115
    aget-byte v7, v2, v15

    .line 116
    .line 117
    int-to-char v7, v7

    .line 118
    aget-byte v8, v2, v14

    .line 119
    .line 120
    int-to-char v8, v8

    .line 121
    move/from16 v17, v13

    .line 122
    .line 123
    aget-byte v13, v2, v12

    .line 124
    .line 125
    int-to-char v13, v13

    .line 126
    aget-byte v11, v2, v11

    .line 127
    .line 128
    int-to-char v11, v11

    .line 129
    move/from16 v18, v3

    .line 130
    .line 131
    aget-byte v3, v2, v10

    .line 132
    .line 133
    int-to-char v3, v3

    .line 134
    aget-byte v5, v2, v5

    .line 135
    .line 136
    int-to-char v5, v5

    .line 137
    move/from16 v19, v9

    .line 138
    .line 139
    aget-byte v9, v2, v19

    .line 140
    .line 141
    int-to-char v9, v9

    .line 142
    aget-byte v10, v2, v18

    .line 143
    .line 144
    int-to-char v10, v10

    .line 145
    aget-byte v12, v2, v17

    .line 146
    .line 147
    int-to-char v12, v12

    .line 148
    aget-byte v2, v2, v16

    .line 149
    .line 150
    int-to-char v2, v2

    .line 151
    move/from16 v20, v10

    .line 152
    .line 153
    move v10, v3

    .line 154
    move/from16 v3, v20

    .line 155
    .line 156
    move/from16 v20, v12

    .line 157
    .line 158
    move v12, v9

    .line 159
    move v9, v13

    .line 160
    move/from16 v13, v20

    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_3
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 164
    .line 165
    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-direct {v1, v2, v0, v15}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 170
    .line 171
    .line 172
    throw v1

    .line 173
    :cond_4
    move/from16 v18, v3

    .line 174
    .line 175
    move/from16 v19, v9

    .line 176
    .line 177
    move/from16 v17, v13

    .line 178
    .line 179
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    if-ne v2, v6, :cond_1a

    .line 184
    .line 185
    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    .line 186
    .line 187
    .line 188
    move-result v7

    .line 189
    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    .line 190
    .line 191
    .line 192
    move-result v8

    .line 193
    const/4 v2, 0x2

    .line 194
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    .line 199
    .line 200
    .line 201
    move-result v11

    .line 202
    const/4 v2, 0x4

    .line 203
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 204
    .line 205
    .line 206
    move-result v9

    .line 207
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 208
    .line 209
    .line 210
    move-result v5

    .line 211
    move/from16 v2, v19

    .line 212
    .line 213
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 214
    .line 215
    .line 216
    move-result v10

    .line 217
    move/from16 v2, v18

    .line 218
    .line 219
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    move/from16 v12, v17

    .line 224
    .line 225
    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    .line 226
    .line 227
    .line 228
    move-result v13

    .line 229
    move/from16 v12, v16

    .line 230
    .line 231
    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    .line 232
    .line 233
    .line 234
    move-result v17

    .line 235
    move v12, v10

    .line 236
    move v10, v9

    .line 237
    move v9, v3

    .line 238
    move v3, v2

    .line 239
    move/from16 v2, v17

    .line 240
    .line 241
    :goto_0
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 242
    .line 243
    .line 244
    move-result v4

    .line 245
    const-string v6, "illegal input"

    .line 246
    .line 247
    if-eqz v4, :cond_7

    .line 248
    .line 249
    if-ne v4, v14, :cond_6

    .line 250
    .line 251
    const/16 v4, 0x2f

    .line 252
    .line 253
    if-ne v10, v4, :cond_5

    .line 254
    .line 255
    if-ne v3, v4, :cond_5

    .line 256
    .line 257
    goto :goto_1

    .line 258
    :cond_5
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 259
    .line 260
    invoke-direct {v1, v6, v0, v15}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 261
    .line 262
    .line 263
    throw v1

    .line 264
    :cond_6
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 265
    .line 266
    invoke-direct {v1, v6, v0, v15}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 267
    .line 268
    .line 269
    throw v1

    .line 270
    :cond_7
    const/16 v4, 0x2d

    .line 271
    .line 272
    if-ne v10, v4, :cond_19

    .line 273
    .line 274
    if-ne v3, v4, :cond_19

    .line 275
    .line 276
    :goto_1
    const/16 v3, 0x30

    .line 277
    .line 278
    if-lt v7, v3, :cond_18

    .line 279
    .line 280
    const/16 v4, 0x39

    .line 281
    .line 282
    if-gt v7, v4, :cond_18

    .line 283
    .line 284
    if-lt v8, v3, :cond_18

    .line 285
    .line 286
    if-gt v8, v4, :cond_18

    .line 287
    .line 288
    if-lt v9, v3, :cond_18

    .line 289
    .line 290
    if-gt v9, v4, :cond_18

    .line 291
    .line 292
    if-lt v11, v3, :cond_18

    .line 293
    .line 294
    if-gt v11, v4, :cond_18

    .line 295
    .line 296
    sub-int/2addr v7, v3

    .line 297
    mul-int/lit16 v7, v7, 0x3e8

    .line 298
    .line 299
    const/16 v10, 0x64

    .line 300
    .line 301
    invoke-static {v8, v3, v10, v7}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(IIII)I

    .line 302
    .line 303
    .line 304
    move-result v7

    .line 305
    const/16 v8, 0xa

    .line 306
    .line 307
    invoke-static {v9, v3, v8, v7}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(IIII)I

    .line 308
    .line 309
    .line 310
    move-result v7

    .line 311
    sub-int/2addr v11, v3

    .line 312
    add-int/2addr v11, v7

    .line 313
    if-lt v5, v3, :cond_17

    .line 314
    .line 315
    if-gt v5, v4, :cond_17

    .line 316
    .line 317
    if-lt v12, v3, :cond_17

    .line 318
    .line 319
    if-gt v12, v4, :cond_17

    .line 320
    .line 321
    sub-int/2addr v5, v3

    .line 322
    mul-int/2addr v5, v8

    .line 323
    sub-int/2addr v12, v3

    .line 324
    add-int/2addr v12, v5

    .line 325
    if-nez v12, :cond_8

    .line 326
    .line 327
    if-nez v11, :cond_16

    .line 328
    .line 329
    :cond_8
    const/16 v5, 0xc

    .line 330
    .line 331
    if-gt v12, v5, :cond_16

    .line 332
    .line 333
    if-lt v13, v3, :cond_15

    .line 334
    .line 335
    if-gt v13, v4, :cond_15

    .line 336
    .line 337
    if-lt v2, v3, :cond_15

    .line 338
    .line 339
    if-gt v2, v4, :cond_15

    .line 340
    .line 341
    sub-int/2addr v13, v3

    .line 342
    const/16 v17, 0xa

    .line 343
    .line 344
    mul-int/lit8 v13, v13, 0xa

    .line 345
    .line 346
    sub-int/2addr v2, v3

    .line 347
    add-int/2addr v2, v13

    .line 348
    const/4 v3, 0x2

    .line 349
    if-eq v12, v3, :cond_a

    .line 350
    .line 351
    const/4 v3, 0x4

    .line 352
    if-eq v12, v3, :cond_9

    .line 353
    .line 354
    const/4 v3, 0x6

    .line 355
    if-eq v12, v3, :cond_9

    .line 356
    .line 357
    const/16 v3, 0x9

    .line 358
    .line 359
    if-eq v12, v3, :cond_9

    .line 360
    .line 361
    const/16 v3, 0xb

    .line 362
    .line 363
    if-eq v12, v3, :cond_9

    .line 364
    .line 365
    const/16 v3, 0x1f

    .line 366
    .line 367
    goto :goto_2

    .line 368
    :cond_9
    const/16 v3, 0x1e

    .line 369
    .line 370
    goto :goto_2

    .line 371
    :cond_a
    and-int/lit8 v3, v11, 0x3

    .line 372
    .line 373
    if-nez v3, :cond_c

    .line 374
    .line 375
    rem-int/lit8 v3, v11, 0x64

    .line 376
    .line 377
    if-nez v3, :cond_b

    .line 378
    .line 379
    rem-int/lit16 v3, v11, 0x190

    .line 380
    .line 381
    if-nez v3, :cond_c

    .line 382
    .line 383
    :cond_b
    const/16 v3, 0x1d

    .line 384
    .line 385
    goto :goto_2

    .line 386
    :cond_c
    const/16 v3, 0x1c

    .line 387
    .line 388
    :goto_2
    if-nez v2, :cond_d

    .line 389
    .line 390
    if-nez v11, :cond_14

    .line 391
    .line 392
    :cond_d
    if-gt v2, v3, :cond_14

    .line 393
    .line 394
    if-nez v11, :cond_e

    .line 395
    .line 396
    if-nez v12, :cond_e

    .line 397
    .line 398
    if-nez v2, :cond_e

    .line 399
    .line 400
    const/16 v11, 0x7b2

    .line 401
    .line 402
    move v2, v14

    .line 403
    move v12, v2

    .line 404
    :cond_e
    invoke-static {v11, v12, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(III)J

    .line 405
    .line 406
    .line 407
    move-result-wide v3

    .line 408
    const-wide/32 v5, 0x15180

    .line 409
    .line 410
    .line 411
    mul-long/2addr v3, v5

    .line 412
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Ljava/time/ZoneId;

    .line 413
    .line 414
    if-eq v1, v0, :cond_10

    .line 415
    .line 416
    invoke-virtual {v1}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    sget-object v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰:Ljava/time/zone/ZoneRules;

    .line 421
    .line 422
    if-ne v0, v5, :cond_f

    .line 423
    .line 424
    goto :goto_3

    .line 425
    :cond_f
    move v14, v15

    .line 426
    :cond_10
    :goto_3
    if-eqz v14, :cond_11

    .line 427
    .line 428
    const-wide/32 v5, 0x28d2bea0

    .line 429
    .line 430
    .line 431
    cmp-long v0, v3, v5

    .line 432
    .line 433
    if-ltz v0, :cond_11

    .line 434
    .line 435
    const/16 v15, 0x7080

    .line 436
    .line 437
    goto :goto_4

    .line 438
    :cond_11
    sget-object v0, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 439
    .line 440
    if-eq v1, v0, :cond_13

    .line 441
    .line 442
    const-string v0, "UTC"

    .line 443
    .line 444
    invoke-virtual {v1}, Ljava/time/ZoneId;->getId()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v5

    .line 448
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 449
    .line 450
    .line 451
    move-result v0

    .line 452
    if-eqz v0, :cond_12

    .line 453
    .line 454
    goto :goto_4

    .line 455
    :cond_12
    invoke-static {v11, v12, v2}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    sget-object v2, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 460
    .line 461
    invoke-static {v0, v2}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    invoke-virtual {v1}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    invoke-virtual {v1, v0}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/LocalDateTime;)Ljava/time/ZoneOffset;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 474
    .line 475
    .line 476
    move-result v15

    .line 477
    :cond_13
    :goto_4
    int-to-long v0, v15

    .line 478
    sub-long/2addr v3, v0

    .line 479
    const-wide/16 v0, 0x3e8

    .line 480
    .line 481
    mul-long/2addr v3, v0

    .line 482
    return-wide v3

    .line 483
    :cond_14
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 484
    .line 485
    invoke-direct {v1, v6, v0, v15}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 486
    .line 487
    .line 488
    throw v1

    .line 489
    :cond_15
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 490
    .line 491
    invoke-direct {v1, v6, v0, v15}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 492
    .line 493
    .line 494
    throw v1

    .line 495
    :cond_16
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 496
    .line 497
    invoke-direct {v1, v6, v0, v15}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 498
    .line 499
    .line 500
    throw v1

    .line 501
    :cond_17
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 502
    .line 503
    invoke-direct {v1, v6, v0, v15}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 504
    .line 505
    .line 506
    throw v1

    .line 507
    :cond_18
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 508
    .line 509
    invoke-direct {v1, v6, v0, v15}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 510
    .line 511
    .line 512
    throw v1

    .line 513
    :cond_19
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 514
    .line 515
    invoke-direct {v1, v6, v0, v15}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 516
    .line 517
    .line 518
    throw v1

    .line 519
    :cond_1a
    new-instance v1, Ljava/time/format/DateTimeParseException;

    .line 520
    .line 521
    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v2

    .line 525
    invoke-direct {v1, v2, v0, v15}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 526
    .line 527
    .line 528
    throw v1

    .line 529
    :cond_1b
    invoke-static {}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世()V

    .line 530
    .line 531
    .line 532
    :cond_1c
    :goto_5
    return-wide v2
.end method

.method public static 飘花落叶言子苏哲世兰楪(JLjava/time/ZoneId;)Ljava/lang/String;
    .locals 28

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
    sget-object v6, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Ljava/time/ZoneId;

    .line 10
    .line 11
    move-object/from16 v7, p2

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
    sget-object v8, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰:Ljava/time/zone/ZoneRules;

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
    invoke-static {v4, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰苏哲(J)I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    :goto_1
    int-to-long v6, v6

    .line 46
    add-long/2addr v4, v6

    .line 47
    const-wide/32 v6, 0x15180

    .line 48
    .line 49
    .line 50
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->floorDiv(JJ)J

    .line 51
    .line 52
    .line 53
    move-result-wide v8

    .line 54
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->floorMod(JJ)J

    .line 55
    .line 56
    .line 57
    move-result-wide v4

    .line 58
    long-to-int v4, v4

    .line 59
    const-wide/32 v5, 0xafa6c

    .line 60
    .line 61
    .line 62
    add-long/2addr v5, v8

    .line 63
    const-wide/16 v10, 0x0

    .line 64
    .line 65
    cmp-long v7, v5, v10

    .line 66
    .line 67
    const-wide/16 v12, 0x1

    .line 68
    .line 69
    const-wide/32 v14, 0x23ab1

    .line 70
    .line 71
    .line 72
    const-wide/16 v16, 0x190

    .line 73
    .line 74
    if-gez v7, :cond_2

    .line 75
    .line 76
    const-wide/32 v18, 0xafa6d

    .line 77
    .line 78
    .line 79
    add-long v8, v8, v18

    .line 80
    .line 81
    div-long/2addr v8, v14

    .line 82
    sub-long/2addr v8, v12

    .line 83
    mul-long v18, v8, v16

    .line 84
    .line 85
    neg-long v7, v8

    .line 86
    mul-long/2addr v7, v14

    .line 87
    add-long/2addr v5, v7

    .line 88
    goto :goto_2

    .line 89
    :cond_2
    move-wide/from16 v18, v10

    .line 90
    .line 91
    :goto_2
    mul-long v7, v5, v16

    .line 92
    .line 93
    const-wide/16 v20, 0x24f

    .line 94
    .line 95
    add-long v7, v7, v20

    .line 96
    .line 97
    div-long/2addr v7, v14

    .line 98
    const-wide/16 v14, 0x16d

    .line 99
    .line 100
    mul-long v20, v7, v14

    .line 101
    .line 102
    const-wide/16 v22, 0x4

    .line 103
    .line 104
    div-long v24, v7, v22

    .line 105
    .line 106
    add-long v24, v24, v20

    .line 107
    .line 108
    const-wide/16 v20, 0x64

    .line 109
    .line 110
    div-long v26, v7, v20

    .line 111
    .line 112
    sub-long v24, v24, v26

    .line 113
    .line 114
    div-long v26, v7, v16

    .line 115
    .line 116
    add-long v26, v26, v24

    .line 117
    .line 118
    sub-long v24, v5, v26

    .line 119
    .line 120
    cmp-long v9, v24, v10

    .line 121
    .line 122
    if-gez v9, :cond_3

    .line 123
    .line 124
    sub-long/2addr v7, v12

    .line 125
    mul-long/2addr v14, v7

    .line 126
    div-long v12, v7, v22

    .line 127
    .line 128
    add-long/2addr v12, v14

    .line 129
    div-long v14, v7, v20

    .line 130
    .line 131
    sub-long/2addr v12, v14

    .line 132
    div-long v14, v7, v16

    .line 133
    .line 134
    add-long/2addr v14, v12

    .line 135
    sub-long v24, v5, v14

    .line 136
    .line 137
    :cond_3
    move-wide/from16 v5, v24

    .line 138
    .line 139
    add-long v7, v7, v18

    .line 140
    .line 141
    long-to-int v5, v5

    .line 142
    mul-int/lit8 v6, v5, 0x5

    .line 143
    .line 144
    const/4 v9, 0x2

    .line 145
    add-int/2addr v6, v9

    .line 146
    div-int/lit16 v6, v6, 0x99

    .line 147
    .line 148
    add-int/lit8 v12, v6, 0x2

    .line 149
    .line 150
    rem-int/lit8 v12, v12, 0xc

    .line 151
    .line 152
    add-int/lit8 v12, v12, 0x1

    .line 153
    .line 154
    mul-int/lit16 v13, v6, 0x132

    .line 155
    .line 156
    add-int/lit8 v13, v13, 0x5

    .line 157
    .line 158
    const/16 v14, 0xa

    .line 159
    .line 160
    div-int/2addr v13, v14

    .line 161
    sub-int/2addr v5, v13

    .line 162
    add-int/lit8 v5, v5, 0x1

    .line 163
    .line 164
    div-int/2addr v6, v14

    .line 165
    move-wide v15, v10

    .line 166
    int-to-long v9, v6

    .line 167
    add-long/2addr v7, v9

    .line 168
    const-wide/32 v9, -0x3b9ac9ff

    .line 169
    .line 170
    .line 171
    cmp-long v6, v7, v9

    .line 172
    .line 173
    if-ltz v6, :cond_15

    .line 174
    .line 175
    const-wide/32 v9, 0x3b9ac9ff

    .line 176
    .line 177
    .line 178
    cmp-long v6, v7, v9

    .line 179
    .line 180
    if-gtz v6, :cond_15

    .line 181
    .line 182
    long-to-int v6, v7

    .line 183
    int-to-long v7, v4

    .line 184
    cmp-long v4, v7, v15

    .line 185
    .line 186
    if-ltz v4, :cond_14

    .line 187
    .line 188
    const-wide/32 v9, 0x1517f

    .line 189
    .line 190
    .line 191
    cmp-long v4, v7, v9

    .line 192
    .line 193
    if-gtz v4, :cond_14

    .line 194
    .line 195
    const-wide/16 v9, 0xe10

    .line 196
    .line 197
    div-long v9, v7, v9

    .line 198
    .line 199
    long-to-int v4, v9

    .line 200
    mul-int/lit16 v9, v4, 0xe10

    .line 201
    .line 202
    int-to-long v9, v9

    .line 203
    sub-long/2addr v7, v9

    .line 204
    const-wide/16 v9, 0x3c

    .line 205
    .line 206
    div-long v9, v7, v9

    .line 207
    .line 208
    long-to-int v9, v9

    .line 209
    mul-int/lit8 v10, v9, 0x3c

    .line 210
    .line 211
    int-to-long v10, v10

    .line 212
    sub-long/2addr v7, v10

    .line 213
    long-to-int v7, v7

    .line 214
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->floorMod(JJ)J

    .line 215
    .line 216
    .line 217
    move-result-wide v0

    .line 218
    long-to-int v0, v0

    .line 219
    const/4 v1, 0x0

    .line 220
    if-nez v0, :cond_4

    .line 221
    .line 222
    move v2, v1

    .line 223
    goto :goto_3

    .line 224
    :cond_4
    const/4 v2, 0x4

    .line 225
    if-ge v0, v14, :cond_5

    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_5
    rem-int/lit8 v3, v0, 0x64

    .line 229
    .line 230
    if-nez v3, :cond_6

    .line 231
    .line 232
    const/4 v2, 0x2

    .line 233
    goto :goto_3

    .line 234
    :cond_6
    rem-int/lit8 v3, v0, 0xa

    .line 235
    .line 236
    if-nez v3, :cond_7

    .line 237
    .line 238
    const/4 v2, 0x3

    .line 239
    :cond_7
    :goto_3
    add-int/lit8 v3, v2, 0x13

    .line 240
    .line 241
    sget-object v8, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世苏哲:Ljava/util/function/BiFunction;

    .line 242
    .line 243
    const/16 v10, 0x2e

    .line 244
    .line 245
    const/16 v11, 0xb

    .line 246
    .line 247
    const/16 v13, 0x20

    .line 248
    .line 249
    const/16 v15, 0x13

    .line 250
    .line 251
    const/16 v16, 0x14

    .line 252
    .line 253
    const/16 v17, 0x30

    .line 254
    .line 255
    if-eqz v8, :cond_d

    .line 256
    .line 257
    new-array v8, v3, [C

    .line 258
    .line 259
    invoke-static {v8, v1, v6, v12, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲世苏兰楪([CIIII)I

    .line 260
    .line 261
    .line 262
    aput-char v13, v8, v14

    .line 263
    .line 264
    invoke-static {v8, v11, v4, v9, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲苏楪兰世([CIIII)V

    .line 265
    .line 266
    .line 267
    if-lez v2, :cond_c

    .line 268
    .line 269
    aput-char v10, v8, v15

    .line 270
    .line 271
    move/from16 v1, v16

    .line 272
    .line 273
    :goto_4
    if-ge v1, v3, :cond_8

    .line 274
    .line 275
    aput-char v17, v8, v1

    .line 276
    .line 277
    add-int/lit8 v1, v1, 0x1

    .line 278
    .line 279
    goto :goto_4

    .line 280
    :cond_8
    if-ge v0, v14, :cond_9

    .line 281
    .line 282
    invoke-static {v0, v3, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲世兰苏(II[C)V

    .line 283
    .line 284
    .line 285
    goto :goto_5

    .line 286
    :cond_9
    rem-int/lit8 v1, v0, 0x64

    .line 287
    .line 288
    if-nez v1, :cond_a

    .line 289
    .line 290
    div-int/lit8 v0, v0, 0x64

    .line 291
    .line 292
    invoke-static {v0, v3, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲世兰苏(II[C)V

    .line 293
    .line 294
    .line 295
    goto :goto_5

    .line 296
    :cond_a
    rem-int/lit8 v1, v0, 0xa

    .line 297
    .line 298
    if-nez v1, :cond_b

    .line 299
    .line 300
    div-int/2addr v0, v14

    .line 301
    invoke-static {v0, v3, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲世兰苏(II[C)V

    .line 302
    .line 303
    .line 304
    goto :goto_5

    .line 305
    :cond_b
    invoke-static {v0, v3, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲世兰苏(II[C)V

    .line 306
    .line 307
    .line 308
    :cond_c
    :goto_5
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世苏哲:Ljava/util/function/BiFunction;

    .line 309
    .line 310
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 311
    .line 312
    invoke-interface {v0, v8, v1}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    check-cast v0, Ljava/lang/String;

    .line 317
    .line 318
    return-object v0

    .line 319
    :cond_d
    new-array v8, v3, [B

    .line 320
    .line 321
    invoke-static {v8, v1, v6, v12, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲世苏楪兰([BIIII)I

    .line 322
    .line 323
    .line 324
    aput-byte v13, v8, v14

    .line 325
    .line 326
    invoke-static {v8, v11, v4, v9, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲苏楪世兰([BIIII)V

    .line 327
    .line 328
    .line 329
    if-lez v2, :cond_12

    .line 330
    .line 331
    aput-byte v10, v8, v15

    .line 332
    .line 333
    move/from16 v2, v16

    .line 334
    .line 335
    :goto_6
    if-ge v2, v3, :cond_e

    .line 336
    .line 337
    aput-byte v17, v8, v2

    .line 338
    .line 339
    add-int/lit8 v2, v2, 0x1

    .line 340
    .line 341
    goto :goto_6

    .line 342
    :cond_e
    if-ge v0, v14, :cond_f

    .line 343
    .line 344
    invoke-static {v0, v8, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏世兰(I[BI)V

    .line 345
    .line 346
    .line 347
    goto :goto_7

    .line 348
    :cond_f
    rem-int/lit8 v2, v0, 0x64

    .line 349
    .line 350
    if-nez v2, :cond_10

    .line 351
    .line 352
    div-int/lit8 v0, v0, 0x64

    .line 353
    .line 354
    invoke-static {v0, v8, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏世兰(I[BI)V

    .line 355
    .line 356
    .line 357
    goto :goto_7

    .line 358
    :cond_10
    rem-int/lit8 v2, v0, 0xa

    .line 359
    .line 360
    if-nez v2, :cond_11

    .line 361
    .line 362
    div-int/2addr v0, v14

    .line 363
    invoke-static {v0, v8, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏世兰(I[BI)V

    .line 364
    .line 365
    .line 366
    goto :goto_7

    .line 367
    :cond_11
    invoke-static {v0, v8, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏世兰(I[BI)V

    .line 368
    .line 369
    .line 370
    :cond_12
    :goto_7
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世哲苏:Ljava/util/function/BiFunction;

    .line 371
    .line 372
    if-eqz v0, :cond_13

    .line 373
    .line 374
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    invoke-interface {v0, v8, v1}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    check-cast v0, Ljava/lang/String;

    .line 383
    .line 384
    return-object v0

    .line 385
    :cond_13
    new-instance v0, Ljava/lang/String;

    .line 386
    .line 387
    sget-object v2, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 388
    .line 389
    invoke-direct {v0, v8, v1, v3, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 390
    .line 391
    .line 392
    return-object v0

    .line 393
    :cond_14
    new-instance v0, Ljava/time/DateTimeException;

    .line 394
    .line 395
    const-string v1, "Invalid secondOfDay "

    .line 396
    .line 397
    invoke-static {v7, v8, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(JLjava/lang/String;)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    invoke-direct {v0, v1}, Ljava/time/DateTimeException;-><init>(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    throw v0

    .line 405
    :cond_15
    new-instance v0, Ljava/time/DateTimeException;

    .line 406
    .line 407
    const-string v1, "Invalid year "

    .line 408
    .line 409
    invoke-static {v7, v8, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(JLjava/lang/String;)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    invoke-direct {v0, v1}, Ljava/time/DateTimeException;-><init>(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    throw v0
.end method

.method public static 飘花落叶言子苏哲世楪兰(I[BI)I
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
    if-ge v1, p0, :cond_3

    .line 7
    .line 8
    add-int v4, p2, v1

    .line 9
    .line 10
    aget-byte v4, p1, v4

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
    sub-int/2addr v3, p0

    .line 37
    and-int/lit8 p0, v3, 0xf

    .line 38
    .line 39
    sget-object p1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲:[I

    .line 40
    .line 41
    aget p0, p1, p0

    .line 42
    .line 43
    mul-int/2addr v2, p0

    .line 44
    return v2
.end method

.method public static 飘花落叶言子苏哲兰世楪([BI)I
    .locals 5

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲:J

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
    sget-boolean p1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰苏世:Z

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

.method public static 飘花落叶言子苏哲兰楪世([BI)J
    .locals 8

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲:J

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
    sget-boolean v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰苏世:Z

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

.method public static 飘花落叶言子苏哲楪世兰(Ljava/lang/String;)Ljava/time/ZonedDateTime;
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
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世兰哲:Ljava/time/format/DateTimeFormatter;

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
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世兰哲:Ljava/time/format/DateTimeFormatter;

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
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Ljava/time/ZoneId;

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
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世哲兰:Ljava/time/format/DateTimeFormatter;

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
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世哲兰:Ljava/time/format/DateTimeFormatter;

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

.method public static 飘花落叶言子苏哲楪兰世(II[C)I
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
    if-ge v1, p0, :cond_3

    .line 7
    .line 8
    add-int v4, p1, v1

    .line 9
    .line 10
    aget-char v4, p2, v4

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
    sub-int/2addr v3, p0

    .line 37
    and-int/lit8 p0, v3, 0xf

    .line 38
    .line 39
    sget-object p1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲:[I

    .line 40
    .line 41
    aget p0, p1, p0

    .line 42
    .line 43
    mul-int/2addr v2, p0

    .line 44
    return v2
.end method

.method public static 飘花落叶言子苏楪世兰哲([BI)Ljava/time/LocalTime;
    .locals 8

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
    add-int/lit8 v1, p1, 0x1

    .line 9
    .line 10
    aget-byte v1, p0, v1

    .line 11
    .line 12
    add-int/lit8 v3, p1, 0x4

    .line 13
    .line 14
    aget-byte v4, p0, v3

    .line 15
    .line 16
    add-int/lit8 v5, p1, 0x2

    .line 17
    .line 18
    aget-byte v6, p0, v5

    .line 19
    .line 20
    const/16 v7, 0x3a

    .line 21
    .line 22
    if-ne v6, v7, :cond_1

    .line 23
    .line 24
    if-ne v4, v7, :cond_1

    .line 25
    .line 26
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    add-int/lit8 p1, p1, 0x3

    .line 31
    .line 32
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    if-ne v1, v7, :cond_2

    .line 42
    .line 43
    if-ne v4, v7, :cond_2

    .line 44
    .line 45
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-static {p0, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    goto :goto_0

    .line 58
    :cond_2
    if-ne v1, v7, :cond_3

    .line 59
    .line 60
    add-int/lit8 v0, p1, 0x3

    .line 61
    .line 62
    aget-byte v0, p0, v0

    .line 63
    .line 64
    if-ne v0, v7, :cond_3

    .line 65
    .line 66
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-static {p0, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    invoke-static {p0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    :goto_0
    invoke-static {v1, p1, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲兰世(III)Ljava/time/LocalTime;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :cond_3
    return-object v2
.end method

.method public static 飘花落叶言子苏楪世哲兰([BI)Ljava/time/LocalTime;
    .locals 4

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
    add-int/lit8 v0, p1, 0x2

    .line 9
    .line 10
    aget-byte v1, p0, v0

    .line 11
    .line 12
    const/16 v3, 0x3a

    .line 13
    .line 14
    if-ne v1, v3, :cond_1

    .line 15
    .line 16
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    add-int/lit8 p1, p1, 0x3

    .line 21
    .line 22
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    const/4 p1, 0x0

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    add-int/lit8 v1, p1, 0x1

    .line 29
    .line 30
    aget-byte v1, p0, v1

    .line 31
    .line 32
    if-ne v1, v3, :cond_2

    .line 33
    .line 34
    add-int/lit8 v1, p1, 0x3

    .line 35
    .line 36
    aget-byte v1, p0, v1

    .line 37
    .line 38
    if-ne v1, v3, :cond_2

    .line 39
    .line 40
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    add-int/lit8 p1, p1, 0x4

    .line 49
    .line 50
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    move p0, v0

    .line 55
    move v0, v1

    .line 56
    :goto_0
    invoke-static {v0, p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲兰世(III)Ljava/time/LocalTime;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :cond_2
    return-object v2
.end method

.method public static 飘花落叶言子苏楪兰世哲([BI)Ljava/time/LocalTime;
    .locals 3

    .line 1
    add-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    if-gt v0, v1, :cond_1

    .line 5
    .line 6
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世哲兰([BI)J

    .line 7
    .line 8
    .line 9
    move-result-wide p0

    .line 10
    const-wide/16 v0, -0x1

    .line 11
    .line 12
    cmp-long v0, p0, v0

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    long-to-int v0, p0

    .line 18
    and-int/lit16 v0, v0, 0xff

    .line 19
    .line 20
    const/16 v1, 0x18

    .line 21
    .line 22
    shr-long v1, p0, v1

    .line 23
    .line 24
    long-to-int v1, v1

    .line 25
    and-int/lit16 v1, v1, 0xff

    .line 26
    .line 27
    const/16 v2, 0x30

    .line 28
    .line 29
    shr-long/2addr p0, v2

    .line 30
    long-to-int p0, p0

    .line 31
    and-int/lit16 p0, p0, 0xff

    .line 32
    .line 33
    invoke-static {v0, v1, p0}, Ljava/time/LocalTime;->of(III)Ljava/time/LocalTime;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 39
    return-object p0
.end method

.method public static 飘花落叶言子苏楪兰哲世(Ljava/lang/String;Ljava/time/ZoneId;)J
    .locals 44

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-wide/16 v30, 0x0

    .line 8
    .line 9
    goto/16 :goto_11

    .line 10
    .line 11
    :cond_0
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏世哲:Ljava/util/function/ToIntFunction;

    .line 12
    .line 13
    const-string v5, "illegal input "

    .line 14
    .line 15
    const-string v6, "parseInt error "

    .line 16
    .line 17
    const-wide/32 v16, 0x12c9985

    .line 18
    .line 19
    .line 20
    const-wide/high16 v18, -0x8000000000000000L

    .line 21
    .line 22
    const-wide/16 v20, 0x30

    .line 23
    .line 24
    const-wide/16 v22, 0xa

    .line 25
    .line 26
    const-wide v24, -0xcccccccccccccccL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    const-wide/16 v26, 0x64

    .line 32
    .line 33
    const-wide v28, -0x147ae147ae147aeL

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    const-wide/16 v30, 0x0

    .line 39
    .line 40
    const/16 v32, 0xa

    .line 41
    .line 42
    const/16 v7, 0x10

    .line 43
    .line 44
    const/16 v8, 0x2d

    .line 45
    .line 46
    const-wide/16 v33, 0x3e8

    .line 47
    .line 48
    const/16 v9, 0x2b

    .line 49
    .line 50
    const/16 v13, 0x30

    .line 51
    .line 52
    const-wide/32 v35, 0x1406fa5

    .line 53
    .line 54
    .line 55
    const/16 v15, 0x22

    .line 56
    .line 57
    const/16 v10, 0x13

    .line 58
    .line 59
    const/4 v12, 0x0

    .line 60
    const-wide/16 v37, 0x1

    .line 61
    .line 62
    const/4 v14, 0x0

    .line 63
    const v39, 0xf4240

    .line 64
    .line 65
    .line 66
    const/4 v2, 0x4

    .line 67
    if-eqz v4, :cond_28

    .line 68
    .line 69
    sget-object v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏哲世:Ljava/util/function/Function;

    .line 70
    .line 71
    if-eqz v3, :cond_28

    .line 72
    .line 73
    invoke-interface {v4, v0}, Ljava/util/function/ToIntFunction;->applyAsInt(Ljava/lang/Object;)I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-nez v4, :cond_28

    .line 78
    .line 79
    invoke-interface {v3, v0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    check-cast v0, [B

    .line 84
    .line 85
    array-length v3, v0

    .line 86
    sget-object v4, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 87
    .line 88
    if-nez v3, :cond_1

    .line 89
    .line 90
    goto/16 :goto_11

    .line 91
    .line 92
    :cond_1
    if-ne v3, v2, :cond_2

    .line 93
    .line 94
    invoke-static {v0, v12}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲苏兰楪([BI)Z

    .line 95
    .line 96
    .line 97
    move-result v40

    .line 98
    if-eqz v40, :cond_2

    .line 99
    .line 100
    goto/16 :goto_11

    .line 101
    .line 102
    :cond_2
    aget-byte v2, v0, v12

    .line 103
    .line 104
    int-to-char v2, v2

    .line 105
    if-ne v2, v15, :cond_5

    .line 106
    .line 107
    add-int/lit8 v41, v3, -0x1

    .line 108
    .line 109
    aget-byte v11, v0, v41

    .line 110
    .line 111
    if-ne v11, v15, :cond_5

    .line 112
    .line 113
    sget-object v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲楪兰苏:[Z

    .line 114
    .line 115
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰()Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 120
    .line 121
    if-ne v4, v2, :cond_3

    .line 122
    .line 123
    invoke-static {v3, v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰苏世;->飘花落叶言楪兰世苏子哲(ILcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;[B)Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰苏世;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    move-object v2, v0

    .line 128
    goto :goto_0

    .line 129
    :cond_3
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_16:Ljava/nio/charset/Charset;

    .line 130
    .line 131
    if-ne v4, v2, :cond_4

    .line 132
    .line 133
    new-instance v2, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;

    .line 134
    .line 135
    invoke-direct {v2, v3, v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;-><init>(ILcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;[B)V

    .line 136
    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_4
    sget-object v2, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    .line 140
    .line 141
    new-instance v2, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏世兰;

    .line 142
    .line 143
    invoke-direct {v2, v1, v14, v0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏世兰;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;Ljava/lang/String;[BI)V

    .line 144
    .line 145
    .line 146
    :goto_0
    :try_start_0
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏楪世兰;->飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏楪世兰;

    .line 147
    .line 148
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏楪世兰;->飘花落叶言子世苏楪哲兰(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Ljava/util/Date;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 153
    .line 154
    .line 155
    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    invoke-interface {v2}, Ljava/io/Closeable;->close()V

    .line 157
    .line 158
    .line 159
    return-wide v0

    .line 160
    :catchall_0
    move-exception v0

    .line 161
    move-object v1, v0

    .line 162
    :try_start_1
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :catchall_1
    move-exception v0

    .line 167
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 168
    .line 169
    .line 170
    :goto_1
    throw v1

    .line 171
    :cond_5
    if-ne v3, v10, :cond_6

    .line 172
    .line 173
    invoke-static {v0, v12, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏世哲楪兰([BILjava/time/ZoneId;)J

    .line 174
    .line 175
    .line 176
    move-result-wide v0

    .line 177
    return-wide v0

    .line 178
    :cond_6
    if-gt v3, v10, :cond_26

    .line 179
    .line 180
    if-ne v3, v7, :cond_7

    .line 181
    .line 182
    aget-byte v4, v0, v32

    .line 183
    .line 184
    int-to-char v4, v4

    .line 185
    if-eq v4, v9, :cond_26

    .line 186
    .line 187
    if-ne v4, v8, :cond_7

    .line 188
    .line 189
    goto/16 :goto_10

    .line 190
    .line 191
    :cond_7
    if-eq v2, v8, :cond_8

    .line 192
    .line 193
    if-lt v2, v13, :cond_d

    .line 194
    .line 195
    const/16 v4, 0x39

    .line 196
    .line 197
    if-gt v2, v4, :cond_d

    .line 198
    .line 199
    :cond_8
    sget-short v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:S

    .line 200
    .line 201
    if-gtz v3, :cond_9

    .line 202
    .line 203
    goto :goto_4

    .line 204
    :cond_9
    move v2, v12

    .line 205
    :goto_2
    if-ge v2, v3, :cond_11

    .line 206
    .line 207
    aget-byte v4, v0, v2

    .line 208
    .line 209
    int-to-char v4, v4

    .line 210
    if-eq v4, v9, :cond_b

    .line 211
    .line 212
    if-ne v4, v8, :cond_a

    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_a
    if-lt v4, v13, :cond_d

    .line 216
    .line 217
    const/16 v5, 0x39

    .line 218
    .line 219
    if-le v4, v5, :cond_c

    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_b
    :goto_3
    if-nez v2, :cond_d

    .line 223
    .line 224
    const/4 v4, 0x1

    .line 225
    if-ne v3, v4, :cond_c

    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_c
    add-int/lit8 v2, v2, 0x1

    .line 229
    .line 230
    goto :goto_2

    .line 231
    :cond_d
    :goto_4
    add-int/lit8 v2, v3, -0x1

    .line 232
    .line 233
    aget-byte v2, v0, v2

    .line 234
    .line 235
    int-to-char v2, v2

    .line 236
    const/16 v4, 0x5a

    .line 237
    .line 238
    if-ne v2, v4, :cond_e

    .line 239
    .line 240
    sget-object v1, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 241
    .line 242
    :cond_e
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪哲苏兰([BI)Ljava/time/LocalDateTime;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    if-nez v2, :cond_f

    .line 247
    .line 248
    invoke-static {v0, v12}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰哲世苏([BI)J

    .line 249
    .line 250
    .line 251
    move-result-wide v3

    .line 252
    const-wide v5, 0x2d30302d30303030L    # 4.966833461036871E-91

    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    cmp-long v3, v3, v5

    .line 258
    .line 259
    if-nez v3, :cond_f

    .line 260
    .line 261
    const/16 v3, 0x8

    .line 262
    .line 263
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪哲苏兰([BI)S

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    const/16 v3, 0x3030

    .line 268
    .line 269
    if-ne v0, v3, :cond_f

    .line 270
    .line 271
    const/4 v8, 0x0

    .line 272
    const/4 v9, 0x0

    .line 273
    const/16 v4, 0x7b2

    .line 274
    .line 275
    const/4 v5, 0x1

    .line 276
    const/4 v6, 0x1

    .line 277
    const/4 v7, 0x0

    .line 278
    invoke-static/range {v4 .. v9}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    :cond_f
    invoke-static {v2, v1, v14}, Ljava/time/ZonedDateTime;->ofLocal(Ljava/time/LocalDateTime;Ljava/time/ZoneId;Ljava/time/ZoneOffset;)Ljava/time/ZonedDateTime;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-interface {v0}, Ljava/time/chrono/ChronoZonedDateTime;->toEpochSecond()J

    .line 287
    .line 288
    .line 289
    move-result-wide v0

    .line 290
    invoke-virtual {v2}, Ljava/time/LocalDateTime;->getNano()I

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    cmp-long v3, v0, v30

    .line 295
    .line 296
    if-gez v3, :cond_10

    .line 297
    .line 298
    if-lez v2, :cond_10

    .line 299
    .line 300
    add-long v0, v0, v37

    .line 301
    .line 302
    mul-long v0, v0, v33

    .line 303
    .line 304
    div-int v2, v2, v39

    .line 305
    .line 306
    int-to-long v2, v2

    .line 307
    add-long/2addr v0, v2

    .line 308
    sub-long v0, v0, v33

    .line 309
    .line 310
    return-wide v0

    .line 311
    :cond_10
    mul-long v0, v0, v33

    .line 312
    .line 313
    div-int v2, v2, v39

    .line 314
    .line 315
    int-to-long v2, v2

    .line 316
    add-long/2addr v0, v2

    .line 317
    return-wide v0

    .line 318
    :cond_11
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 319
    .line 320
    aget-byte v2, v0, v12

    .line 321
    .line 322
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲楪兰苏(I)Z

    .line 323
    .line 324
    .line 325
    move-result v4

    .line 326
    if-eqz v4, :cond_12

    .line 327
    .line 328
    rsub-int/lit8 v4, v2, 0x30

    .line 329
    .line 330
    int-to-long v4, v4

    .line 331
    move-wide/from16 v37, v4

    .line 332
    .line 333
    goto :goto_5

    .line 334
    :cond_12
    const/4 v4, 0x1

    .line 335
    if-eq v3, v4, :cond_14

    .line 336
    .line 337
    if-eq v2, v8, :cond_13

    .line 338
    .line 339
    if-ne v2, v9, :cond_14

    .line 340
    .line 341
    :cond_13
    move-wide/from16 v37, v30

    .line 342
    .line 343
    :cond_14
    :goto_5
    const/4 v4, 0x1

    .line 344
    :goto_6
    add-int/lit8 v5, v4, 0x1

    .line 345
    .line 346
    if-ge v5, v3, :cond_17

    .line 347
    .line 348
    invoke-static {v0, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 349
    .line 350
    .line 351
    move-result v7

    .line 352
    const/4 v9, -0x1

    .line 353
    if-eq v7, v9, :cond_17

    .line 354
    .line 355
    cmp-long v9, v28, v37

    .line 356
    .line 357
    if-gtz v9, :cond_15

    .line 358
    .line 359
    const/4 v9, 0x1

    .line 360
    goto :goto_7

    .line 361
    :cond_15
    move v9, v12

    .line 362
    :goto_7
    cmp-long v10, v37, v30

    .line 363
    .line 364
    if-gtz v10, :cond_16

    .line 365
    .line 366
    const/4 v10, 0x1

    .line 367
    goto :goto_8

    .line 368
    :cond_16
    move v10, v12

    .line 369
    :goto_8
    and-int/2addr v9, v10

    .line 370
    if-eqz v9, :cond_17

    .line 371
    .line 372
    mul-long v37, v37, v26

    .line 373
    .line 374
    int-to-long v9, v7

    .line 375
    sub-long v37, v37, v9

    .line 376
    .line 377
    add-int/lit8 v4, v4, 0x2

    .line 378
    .line 379
    goto :goto_6

    .line 380
    :cond_17
    if-ge v4, v3, :cond_1a

    .line 381
    .line 382
    aget-byte v7, v0, v4

    .line 383
    .line 384
    invoke-static {v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲楪兰苏(I)Z

    .line 385
    .line 386
    .line 387
    move-result v9

    .line 388
    if-eqz v9, :cond_1a

    .line 389
    .line 390
    cmp-long v9, v24, v37

    .line 391
    .line 392
    if-gtz v9, :cond_18

    .line 393
    .line 394
    const/4 v9, 0x1

    .line 395
    goto :goto_9

    .line 396
    :cond_18
    move v9, v12

    .line 397
    :goto_9
    cmp-long v10, v37, v30

    .line 398
    .line 399
    if-gtz v10, :cond_19

    .line 400
    .line 401
    const/4 v10, 0x1

    .line 402
    goto :goto_a

    .line 403
    :cond_19
    move v10, v12

    .line 404
    :goto_a
    and-int/2addr v9, v10

    .line 405
    if-eqz v9, :cond_1a

    .line 406
    .line 407
    mul-long v37, v37, v22

    .line 408
    .line 409
    add-long v37, v37, v20

    .line 410
    .line 411
    int-to-long v9, v7

    .line 412
    sub-long v37, v37, v9

    .line 413
    .line 414
    move v4, v5

    .line 415
    :cond_1a
    move-wide/from16 v9, v37

    .line 416
    .line 417
    if-ne v4, v3, :cond_1b

    .line 418
    .line 419
    const/4 v5, 0x1

    .line 420
    goto :goto_b

    .line 421
    :cond_1b
    move v5, v12

    .line 422
    :goto_b
    cmp-long v7, v9, v30

    .line 423
    .line 424
    if-gtz v7, :cond_1c

    .line 425
    .line 426
    const/4 v7, 0x1

    .line 427
    goto :goto_c

    .line 428
    :cond_1c
    move v7, v12

    .line 429
    :goto_c
    and-int/2addr v5, v7

    .line 430
    cmp-long v7, v18, v9

    .line 431
    .line 432
    if-ltz v7, :cond_1d

    .line 433
    .line 434
    if-ne v2, v8, :cond_1e

    .line 435
    .line 436
    :cond_1d
    const/4 v12, 0x1

    .line 437
    :cond_1e
    and-int/2addr v5, v12

    .line 438
    if-eqz v5, :cond_25

    .line 439
    .line 440
    if-ne v2, v8, :cond_1f

    .line 441
    .line 442
    :goto_d
    const/16 v0, 0x8

    .line 443
    .line 444
    goto :goto_e

    .line 445
    :cond_1f
    neg-long v9, v9

    .line 446
    goto :goto_d

    .line 447
    :goto_e
    if-ne v3, v0, :cond_24

    .line 448
    .line 449
    cmp-long v0, v9, v16

    .line 450
    .line 451
    if-ltz v0, :cond_24

    .line 452
    .line 453
    cmp-long v0, v9, v35

    .line 454
    .line 455
    if-gtz v0, :cond_24

    .line 456
    .line 457
    long-to-int v0, v9

    .line 458
    div-int/lit16 v2, v0, 0x2710

    .line 459
    .line 460
    rem-int/lit16 v3, v0, 0x2710

    .line 461
    .line 462
    div-int/lit8 v3, v3, 0x64

    .line 463
    .line 464
    rem-int/lit8 v4, v0, 0x64

    .line 465
    .line 466
    const/4 v0, 0x1

    .line 467
    if-lt v3, v0, :cond_24

    .line 468
    .line 469
    const/16 v0, 0xc

    .line 470
    .line 471
    if-gt v3, v0, :cond_24

    .line 472
    .line 473
    const/4 v0, 0x2

    .line 474
    if-eq v3, v0, :cond_21

    .line 475
    .line 476
    const/4 v0, 0x4

    .line 477
    if-eq v3, v0, :cond_20

    .line 478
    .line 479
    const/4 v0, 0x6

    .line 480
    if-eq v3, v0, :cond_20

    .line 481
    .line 482
    const/16 v0, 0x9

    .line 483
    .line 484
    if-eq v3, v0, :cond_20

    .line 485
    .line 486
    const/16 v0, 0xb

    .line 487
    .line 488
    if-eq v3, v0, :cond_20

    .line 489
    .line 490
    const/16 v7, 0x1f

    .line 491
    .line 492
    goto :goto_f

    .line 493
    :cond_20
    const/16 v7, 0x1e

    .line 494
    .line 495
    goto :goto_f

    .line 496
    :cond_21
    and-int/lit8 v0, v2, 0x3

    .line 497
    .line 498
    if-nez v0, :cond_23

    .line 499
    .line 500
    rem-int/lit8 v0, v2, 0x64

    .line 501
    .line 502
    if-nez v0, :cond_22

    .line 503
    .line 504
    rem-int/lit16 v0, v2, 0x190

    .line 505
    .line 506
    if-nez v0, :cond_23

    .line 507
    .line 508
    :cond_22
    const/16 v7, 0x1d

    .line 509
    .line 510
    goto :goto_f

    .line 511
    :cond_23
    const/16 v7, 0x1c

    .line 512
    .line 513
    :goto_f
    if-gt v4, v7, :cond_24

    .line 514
    .line 515
    const/4 v6, 0x0

    .line 516
    const/4 v7, 0x0

    .line 517
    const/4 v5, 0x0

    .line 518
    invoke-static/range {v2 .. v7}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    invoke-static {v0, v1, v14}, Ljava/time/ZonedDateTime;->ofLocal(Ljava/time/LocalDateTime;Ljava/time/ZoneId;Ljava/time/ZoneOffset;)Ljava/time/ZonedDateTime;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    invoke-interface {v0}, Ljava/time/chrono/ChronoZonedDateTime;->toEpochSecond()J

    .line 527
    .line 528
    .line 529
    move-result-wide v0

    .line 530
    mul-long v0, v0, v33

    .line 531
    .line 532
    return-wide v0

    .line 533
    :cond_24
    return-wide v9

    .line 534
    :cond_25
    new-instance v1, Ljava/lang/NumberFormatException;

    .line 535
    .line 536
    new-instance v2, Ljava/lang/String;

    .line 537
    .line 538
    invoke-direct {v2, v0, v4, v3}, Ljava/lang/String;-><init>([BII)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v6, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    invoke-direct {v1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    throw v1

    .line 549
    :cond_26
    :goto_10
    invoke-static {v0, v12, v3, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏世兰楪哲([BIILjava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 550
    .line 551
    .line 552
    move-result-object v1

    .line 553
    if-eqz v1, :cond_27

    .line 554
    .line 555
    invoke-interface {v1}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    invoke-virtual {v0}, Ljava/time/Instant;->toEpochMilli()J

    .line 560
    .line 561
    .line 562
    move-result-wide v0

    .line 563
    return-wide v0

    .line 564
    :cond_27
    new-instance v1, Ljava/lang/String;

    .line 565
    .line 566
    invoke-direct {v1, v0, v12, v3}, Ljava/lang/String;-><init>([BII)V

    .line 567
    .line 568
    .line 569
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 570
    .line 571
    invoke-virtual {v5, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v2

    .line 575
    invoke-direct {v0, v2, v1, v12}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 576
    .line 577
    .line 578
    throw v0

    .line 579
    :cond_28
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)[C

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    array-length v2, v0

    .line 584
    if-nez v2, :cond_29

    .line 585
    .line 586
    :goto_11
    return-wide v30

    .line 587
    :cond_29
    const/4 v3, 0x4

    .line 588
    if-ne v2, v3, :cond_2a

    .line 589
    .line 590
    invoke-static {v12, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰哲苏世(I[C)J

    .line 591
    .line 592
    .line 593
    move-result-wide v3

    .line 594
    sget-wide v42, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏:J

    .line 595
    .line 596
    cmp-long v3, v3, v42

    .line 597
    .line 598
    if-nez v3, :cond_2a

    .line 599
    .line 600
    return-wide v30

    .line 601
    :cond_2a
    aget-char v3, v0, v12

    .line 602
    .line 603
    if-ne v3, v15, :cond_2b

    .line 604
    .line 605
    add-int/lit8 v4, v2, -0x1

    .line 606
    .line 607
    aget-char v4, v0, v4

    .line 608
    .line 609
    if-ne v4, v15, :cond_2b

    .line 610
    .line 611
    sget-object v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲楪兰苏:[Z

    .line 612
    .line 613
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰()Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 614
    .line 615
    .line 616
    move-result-object v1

    .line 617
    new-instance v3, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;

    .line 618
    .line 619
    invoke-direct {v3, v1, v14, v0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;Ljava/lang/String;[CI)V

    .line 620
    .line 621
    .line 622
    :try_start_2
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏楪世兰;->飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏楪世兰;

    .line 623
    .line 624
    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏楪世兰;->飘花落叶言子世苏楪哲兰(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Ljava/util/Date;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 629
    .line 630
    .line 631
    move-result-wide v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 632
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->close()V

    .line 633
    .line 634
    .line 635
    return-wide v0

    .line 636
    :catchall_2
    move-exception v0

    .line 637
    move-object v1, v0

    .line 638
    :try_start_3
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 639
    .line 640
    .line 641
    goto :goto_12

    .line 642
    :catchall_3
    move-exception v0

    .line 643
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 644
    .line 645
    .line 646
    :goto_12
    throw v1

    .line 647
    :cond_2b
    if-ne v2, v10, :cond_2c

    .line 648
    .line 649
    invoke-static {v0, v12, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏世哲兰楪([CILjava/time/ZoneId;)J

    .line 650
    .line 651
    .line 652
    move-result-wide v0

    .line 653
    return-wide v0

    .line 654
    :cond_2c
    if-gt v2, v10, :cond_4d

    .line 655
    .line 656
    if-ne v2, v7, :cond_2d

    .line 657
    .line 658
    aget-char v4, v0, v32

    .line 659
    .line 660
    if-eq v4, v9, :cond_4d

    .line 661
    .line 662
    if-ne v4, v8, :cond_2d

    .line 663
    .line 664
    goto/16 :goto_21

    .line 665
    .line 666
    :cond_2d
    if-eq v3, v8, :cond_2e

    .line 667
    .line 668
    if-lt v3, v13, :cond_33

    .line 669
    .line 670
    const/16 v4, 0x39

    .line 671
    .line 672
    if-gt v3, v4, :cond_33

    .line 673
    .line 674
    :cond_2e
    sget-short v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:S

    .line 675
    .line 676
    if-gtz v2, :cond_2f

    .line 677
    .line 678
    goto :goto_15

    .line 679
    :cond_2f
    move v3, v12

    .line 680
    :goto_13
    if-ge v3, v2, :cond_38

    .line 681
    .line 682
    aget-char v4, v0, v3

    .line 683
    .line 684
    if-eq v4, v9, :cond_30

    .line 685
    .line 686
    if-ne v4, v8, :cond_31

    .line 687
    .line 688
    :cond_30
    const/16 v7, 0x39

    .line 689
    .line 690
    goto :goto_14

    .line 691
    :cond_31
    if-lt v4, v13, :cond_33

    .line 692
    .line 693
    const/16 v7, 0x39

    .line 694
    .line 695
    if-le v4, v7, :cond_32

    .line 696
    .line 697
    goto :goto_15

    .line 698
    :goto_14
    if-nez v3, :cond_33

    .line 699
    .line 700
    const/4 v4, 0x1

    .line 701
    if-ne v2, v4, :cond_32

    .line 702
    .line 703
    goto :goto_15

    .line 704
    :cond_32
    add-int/lit8 v3, v3, 0x1

    .line 705
    .line 706
    goto :goto_13

    .line 707
    :cond_33
    :goto_15
    add-int/lit8 v3, v2, -0x1

    .line 708
    .line 709
    aget-char v3, v0, v3

    .line 710
    .line 711
    const/16 v4, 0x5a

    .line 712
    .line 713
    if-ne v3, v4, :cond_34

    .line 714
    .line 715
    add-int/lit8 v2, v2, -0x1

    .line 716
    .line 717
    sget-object v1, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 718
    .line 719
    :cond_34
    invoke-static {v2, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪苏兰哲(I[C)Ljava/time/LocalDateTime;

    .line 720
    .line 721
    .line 722
    move-result-object v3

    .line 723
    if-nez v3, :cond_35

    .line 724
    .line 725
    invoke-static {v12, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏哲世(I[C)J

    .line 726
    .line 727
    .line 728
    move-result-wide v6

    .line 729
    const-wide v8, 0x30003000300030L

    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    cmp-long v4, v6, v8

    .line 735
    .line 736
    if-nez v4, :cond_35

    .line 737
    .line 738
    const/4 v4, 0x4

    .line 739
    invoke-static {v4, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏哲世(I[C)J

    .line 740
    .line 741
    .line 742
    move-result-wide v6

    .line 743
    const-wide v8, 0x2d00300030002dL

    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    cmp-long v4, v6, v8

    .line 749
    .line 750
    if-nez v4, :cond_35

    .line 751
    .line 752
    const/16 v4, 0x8

    .line 753
    .line 754
    invoke-static {v4, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰世苏(I[C)I

    .line 755
    .line 756
    .line 757
    move-result v4

    .line 758
    int-to-long v6, v4

    .line 759
    const-wide/32 v8, 0x300030

    .line 760
    .line 761
    .line 762
    cmp-long v4, v6, v8

    .line 763
    .line 764
    if-nez v4, :cond_35

    .line 765
    .line 766
    const/4 v10, 0x0

    .line 767
    const/4 v11, 0x0

    .line 768
    const/16 v6, 0x7b2

    .line 769
    .line 770
    const/4 v7, 0x1

    .line 771
    const/4 v8, 0x1

    .line 772
    const/4 v9, 0x0

    .line 773
    invoke-static/range {v6 .. v11}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    .line 774
    .line 775
    .line 776
    move-result-object v3

    .line 777
    :cond_35
    if-eqz v3, :cond_37

    .line 778
    .line 779
    invoke-static {v3, v1, v14}, Ljava/time/ZonedDateTime;->ofLocal(Ljava/time/LocalDateTime;Ljava/time/ZoneId;Ljava/time/ZoneOffset;)Ljava/time/ZonedDateTime;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    invoke-interface {v0}, Ljava/time/chrono/ChronoZonedDateTime;->toEpochSecond()J

    .line 784
    .line 785
    .line 786
    move-result-wide v0

    .line 787
    invoke-virtual {v3}, Ljava/time/LocalDateTime;->getNano()I

    .line 788
    .line 789
    .line 790
    move-result v2

    .line 791
    cmp-long v3, v0, v30

    .line 792
    .line 793
    if-gez v3, :cond_36

    .line 794
    .line 795
    if-lez v2, :cond_36

    .line 796
    .line 797
    add-long v0, v0, v37

    .line 798
    .line 799
    mul-long v0, v0, v33

    .line 800
    .line 801
    div-int v2, v2, v39

    .line 802
    .line 803
    int-to-long v2, v2

    .line 804
    add-long/2addr v0, v2

    .line 805
    sub-long v0, v0, v33

    .line 806
    .line 807
    return-wide v0

    .line 808
    :cond_36
    mul-long v0, v0, v33

    .line 809
    .line 810
    div-int v2, v2, v39

    .line 811
    .line 812
    int-to-long v2, v2

    .line 813
    add-long/2addr v0, v2

    .line 814
    return-wide v0

    .line 815
    :cond_37
    new-instance v1, Ljava/lang/String;

    .line 816
    .line 817
    invoke-direct {v1, v0, v12, v2}, Ljava/lang/String;-><init>([CII)V

    .line 818
    .line 819
    .line 820
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 821
    .line 822
    invoke-virtual {v5, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 823
    .line 824
    .line 825
    move-result-object v2

    .line 826
    invoke-direct {v0, v2, v1, v12}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 827
    .line 828
    .line 829
    throw v0

    .line 830
    :cond_38
    sget-object v3, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 831
    .line 832
    aget-char v3, v0, v12

    .line 833
    .line 834
    invoke-static {v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲楪兰苏(I)Z

    .line 835
    .line 836
    .line 837
    move-result v4

    .line 838
    if-eqz v4, :cond_39

    .line 839
    .line 840
    rsub-int/lit8 v4, v3, 0x30

    .line 841
    .line 842
    int-to-long v4, v4

    .line 843
    move-wide/from16 v37, v4

    .line 844
    .line 845
    goto :goto_16

    .line 846
    :cond_39
    const/4 v4, 0x1

    .line 847
    if-eq v2, v4, :cond_3b

    .line 848
    .line 849
    if-eq v3, v8, :cond_3a

    .line 850
    .line 851
    if-ne v3, v9, :cond_3b

    .line 852
    .line 853
    :cond_3a
    move-wide/from16 v37, v30

    .line 854
    .line 855
    :cond_3b
    :goto_16
    const/4 v4, 0x1

    .line 856
    :goto_17
    add-int/lit8 v5, v4, 0x1

    .line 857
    .line 858
    if-ge v5, v2, :cond_3e

    .line 859
    .line 860
    invoke-static {v4, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 861
    .line 862
    .line 863
    move-result v7

    .line 864
    const/4 v9, -0x1

    .line 865
    if-eq v7, v9, :cond_3e

    .line 866
    .line 867
    cmp-long v10, v28, v37

    .line 868
    .line 869
    if-gtz v10, :cond_3c

    .line 870
    .line 871
    const/4 v10, 0x1

    .line 872
    goto :goto_18

    .line 873
    :cond_3c
    move v10, v12

    .line 874
    :goto_18
    cmp-long v11, v37, v30

    .line 875
    .line 876
    if-gtz v11, :cond_3d

    .line 877
    .line 878
    const/4 v11, 0x1

    .line 879
    goto :goto_19

    .line 880
    :cond_3d
    move v11, v12

    .line 881
    :goto_19
    and-int/2addr v10, v11

    .line 882
    if-eqz v10, :cond_3e

    .line 883
    .line 884
    mul-long v37, v37, v26

    .line 885
    .line 886
    int-to-long v10, v7

    .line 887
    sub-long v37, v37, v10

    .line 888
    .line 889
    add-int/lit8 v4, v4, 0x2

    .line 890
    .line 891
    goto :goto_17

    .line 892
    :cond_3e
    if-ge v4, v2, :cond_41

    .line 893
    .line 894
    aget-char v7, v0, v4

    .line 895
    .line 896
    invoke-static {v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲楪兰苏(I)Z

    .line 897
    .line 898
    .line 899
    move-result v9

    .line 900
    if-eqz v9, :cond_41

    .line 901
    .line 902
    cmp-long v9, v24, v37

    .line 903
    .line 904
    if-gtz v9, :cond_3f

    .line 905
    .line 906
    const/4 v9, 0x1

    .line 907
    goto :goto_1a

    .line 908
    :cond_3f
    move v9, v12

    .line 909
    :goto_1a
    cmp-long v10, v37, v30

    .line 910
    .line 911
    if-gtz v10, :cond_40

    .line 912
    .line 913
    const/4 v10, 0x1

    .line 914
    goto :goto_1b

    .line 915
    :cond_40
    move v10, v12

    .line 916
    :goto_1b
    and-int/2addr v9, v10

    .line 917
    if-eqz v9, :cond_41

    .line 918
    .line 919
    mul-long v37, v37, v22

    .line 920
    .line 921
    add-long v37, v37, v20

    .line 922
    .line 923
    int-to-long v9, v7

    .line 924
    sub-long v37, v37, v9

    .line 925
    .line 926
    move v4, v5

    .line 927
    :cond_41
    move-wide/from16 v9, v37

    .line 928
    .line 929
    if-ne v4, v2, :cond_42

    .line 930
    .line 931
    const/4 v5, 0x1

    .line 932
    goto :goto_1c

    .line 933
    :cond_42
    move v5, v12

    .line 934
    :goto_1c
    cmp-long v7, v9, v30

    .line 935
    .line 936
    if-gtz v7, :cond_43

    .line 937
    .line 938
    const/4 v7, 0x1

    .line 939
    goto :goto_1d

    .line 940
    :cond_43
    move v7, v12

    .line 941
    :goto_1d
    and-int/2addr v5, v7

    .line 942
    cmp-long v7, v18, v9

    .line 943
    .line 944
    if-ltz v7, :cond_44

    .line 945
    .line 946
    if-ne v3, v8, :cond_45

    .line 947
    .line 948
    :cond_44
    const/4 v12, 0x1

    .line 949
    :cond_45
    and-int/2addr v5, v12

    .line 950
    if-eqz v5, :cond_4c

    .line 951
    .line 952
    if-ne v3, v8, :cond_46

    .line 953
    .line 954
    :goto_1e
    const/16 v0, 0x8

    .line 955
    .line 956
    goto :goto_1f

    .line 957
    :cond_46
    neg-long v9, v9

    .line 958
    goto :goto_1e

    .line 959
    :goto_1f
    if-ne v2, v0, :cond_4b

    .line 960
    .line 961
    cmp-long v0, v9, v16

    .line 962
    .line 963
    if-ltz v0, :cond_4b

    .line 964
    .line 965
    cmp-long v0, v9, v35

    .line 966
    .line 967
    if-gtz v0, :cond_4b

    .line 968
    .line 969
    long-to-int v0, v9

    .line 970
    div-int/lit16 v2, v0, 0x2710

    .line 971
    .line 972
    rem-int/lit16 v3, v0, 0x2710

    .line 973
    .line 974
    div-int/lit8 v3, v3, 0x64

    .line 975
    .line 976
    rem-int/lit8 v4, v0, 0x64

    .line 977
    .line 978
    const/4 v0, 0x1

    .line 979
    if-lt v3, v0, :cond_4b

    .line 980
    .line 981
    const/16 v0, 0xc

    .line 982
    .line 983
    if-gt v3, v0, :cond_4b

    .line 984
    .line 985
    const/4 v0, 0x2

    .line 986
    if-eq v3, v0, :cond_48

    .line 987
    .line 988
    const/4 v0, 0x4

    .line 989
    if-eq v3, v0, :cond_47

    .line 990
    .line 991
    const/4 v0, 0x6

    .line 992
    if-eq v3, v0, :cond_47

    .line 993
    .line 994
    const/16 v0, 0x9

    .line 995
    .line 996
    if-eq v3, v0, :cond_47

    .line 997
    .line 998
    const/16 v0, 0xb

    .line 999
    .line 1000
    if-eq v3, v0, :cond_47

    .line 1001
    .line 1002
    const/16 v7, 0x1f

    .line 1003
    .line 1004
    goto :goto_20

    .line 1005
    :cond_47
    const/16 v7, 0x1e

    .line 1006
    .line 1007
    goto :goto_20

    .line 1008
    :cond_48
    and-int/lit8 v0, v2, 0x3

    .line 1009
    .line 1010
    if-nez v0, :cond_4a

    .line 1011
    .line 1012
    rem-int/lit8 v0, v2, 0x64

    .line 1013
    .line 1014
    if-nez v0, :cond_49

    .line 1015
    .line 1016
    rem-int/lit16 v0, v2, 0x190

    .line 1017
    .line 1018
    if-nez v0, :cond_4a

    .line 1019
    .line 1020
    :cond_49
    const/16 v7, 0x1d

    .line 1021
    .line 1022
    goto :goto_20

    .line 1023
    :cond_4a
    const/16 v7, 0x1c

    .line 1024
    .line 1025
    :goto_20
    if-gt v4, v7, :cond_4b

    .line 1026
    .line 1027
    const/4 v6, 0x0

    .line 1028
    const/4 v7, 0x0

    .line 1029
    const/4 v5, 0x0

    .line 1030
    invoke-static/range {v2 .. v7}, Ljava/time/LocalDateTime;->of(IIIIII)Ljava/time/LocalDateTime;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v0

    .line 1034
    invoke-static {v0, v1, v14}, Ljava/time/ZonedDateTime;->ofLocal(Ljava/time/LocalDateTime;Ljava/time/ZoneId;Ljava/time/ZoneOffset;)Ljava/time/ZonedDateTime;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v0

    .line 1038
    invoke-interface {v0}, Ljava/time/chrono/ChronoZonedDateTime;->toEpochSecond()J

    .line 1039
    .line 1040
    .line 1041
    move-result-wide v0

    .line 1042
    mul-long v0, v0, v33

    .line 1043
    .line 1044
    return-wide v0

    .line 1045
    :cond_4b
    return-wide v9

    .line 1046
    :cond_4c
    new-instance v1, Ljava/lang/NumberFormatException;

    .line 1047
    .line 1048
    new-instance v3, Ljava/lang/String;

    .line 1049
    .line 1050
    invoke-direct {v3, v0, v4, v2}, Ljava/lang/String;-><init>([CII)V

    .line 1051
    .line 1052
    .line 1053
    invoke-virtual {v6, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v0

    .line 1057
    invoke-direct {v1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 1058
    .line 1059
    .line 1060
    throw v1

    .line 1061
    :cond_4d
    :goto_21
    invoke-static {v0, v12, v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏世兰哲楪([CIILjava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v1

    .line 1065
    if-eqz v1, :cond_4e

    .line 1066
    .line 1067
    invoke-interface {v1}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v0

    .line 1071
    invoke-virtual {v0}, Ljava/time/Instant;->toEpochMilli()J

    .line 1072
    .line 1073
    .line 1074
    move-result-wide v0

    .line 1075
    return-wide v0

    .line 1076
    :cond_4e
    new-instance v1, Ljava/lang/String;

    .line 1077
    .line 1078
    invoke-direct {v1, v0, v12, v2}, Ljava/lang/String;-><init>([CII)V

    .line 1079
    .line 1080
    .line 1081
    new-instance v0, Ljava/time/format/DateTimeParseException;

    .line 1082
    .line 1083
    invoke-virtual {v5, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v2

    .line 1087
    invoke-direct {v0, v2, v1, v12}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 1088
    .line 1089
    .line 1090
    throw v0
.end method

.method public static 飘花落叶言子苏楪哲世兰([BI)Ljava/time/LocalTime;
    .locals 8

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
    add-int/lit8 v1, p1, 0x2

    .line 9
    .line 10
    aget-byte v3, p0, v1

    .line 11
    .line 12
    add-int/lit8 v4, p1, 0x4

    .line 13
    .line 14
    aget-byte v4, p0, v4

    .line 15
    .line 16
    add-int/lit8 v5, p1, 0x1

    .line 17
    .line 18
    aget-byte v5, p0, v5

    .line 19
    .line 20
    const/16 v6, 0x3a

    .line 21
    .line 22
    if-ne v5, v6, :cond_1

    .line 23
    .line 24
    if-ne v4, v6, :cond_1

    .line 25
    .line 26
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-static {p0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    if-ne v3, v6, :cond_2

    .line 40
    .line 41
    if-ne v4, v6, :cond_2

    .line 42
    .line 43
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    add-int/lit8 p1, p1, 0x3

    .line 48
    .line 49
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    move v7, v1

    .line 58
    move v1, p1

    .line 59
    move p1, v7

    .line 60
    goto :goto_0

    .line 61
    :cond_2
    if-ne v3, v6, :cond_3

    .line 62
    .line 63
    aget-byte v0, p0, v0

    .line 64
    .line 65
    if-ne v0, v6, :cond_3

    .line 66
    .line 67
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    add-int/lit8 v1, p1, 0x3

    .line 72
    .line 73
    invoke-static {p0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏([BI)I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    add-int/lit8 p1, p1, 0x6

    .line 78
    .line 79
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏([BI)I

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    move p1, v0

    .line 84
    :goto_0
    invoke-static {p1, v1, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲兰世(III)Ljava/time/LocalTime;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0

    .line 89
    :cond_3
    return-object v2
.end method

.method public static 飘花落叶言子苏楪哲兰世(I[C)Ljava/time/LocalTime;
    .locals 2

    .line 1
    add-int/lit8 v0, p0, 0x8

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    if-gt v0, v1, :cond_1

    .line 5
    .line 6
    add-int/lit8 v0, p0, 0x2

    .line 7
    .line 8
    aget-char v0, p1, v0

    .line 9
    .line 10
    const/16 v1, 0x3a

    .line 11
    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    add-int/lit8 v0, p0, 0x5

    .line 15
    .line 16
    aget-char v0, p1, v0

    .line 17
    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    add-int/lit8 v1, p0, 0x3

    .line 26
    .line 27
    invoke-static {v1, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    add-int/lit8 p0, p0, 0x6

    .line 32
    .line 33
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    invoke-static {v0, v1, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲兰世(III)Ljava/time/LocalTime;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 43
    return-object p0
.end method
