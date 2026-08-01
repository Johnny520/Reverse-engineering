.class public Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;
.super Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子世哲楪兰苏:J

.field public static final 飘花落叶言子世哲楪苏兰:J

.field public static final 飘花落叶言子世哲苏楪兰:[I


# instance fields
.field public final 飘花落叶言子世苏兰哲楪:J

.field public final 飘花落叶言子世苏兰楪哲:Lcom/alibaba/fastjson2/飘花落叶言子楪世兰哲苏;

.field public 飘花落叶言子世苏哲兰楪:[C


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    const/16 v0, 0x100

    .line 2
    .line 3
    new-array v1, v0, [I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move v3, v2

    .line 7
    :goto_0
    const/16 v4, 0x10

    .line 8
    .line 9
    if-ge v3, v4, :cond_3

    .line 10
    .line 11
    const/16 v5, 0xa

    .line 12
    .line 13
    if-ge v3, v5, :cond_0

    .line 14
    .line 15
    add-int/lit8 v6, v3, 0x30

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    add-int/lit8 v6, v3, 0x57

    .line 19
    .line 20
    :goto_1
    int-to-short v6, v6

    .line 21
    move v7, v2

    .line 22
    :goto_2
    if-ge v7, v4, :cond_2

    .line 23
    .line 24
    if-ge v7, v5, :cond_1

    .line 25
    .line 26
    add-int/lit8 v8, v7, 0x30

    .line 27
    .line 28
    goto :goto_3

    .line 29
    :cond_1
    add-int/lit8 v8, v7, 0x57

    .line 30
    .line 31
    :goto_3
    int-to-short v8, v8

    .line 32
    shl-int/lit8 v9, v3, 0x4

    .line 33
    .line 34
    add-int/2addr v9, v7

    .line 35
    shl-int/2addr v8, v4

    .line 36
    or-int/2addr v8, v6

    .line 37
    aput v8, v1, v9

    .line 38
    .line 39
    add-int/lit8 v7, v7, 0x1

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    sget-boolean v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰苏世:Z

    .line 46
    .line 47
    const/16 v4, 0x8

    .line 48
    .line 49
    if-eqz v3, :cond_4

    .line 50
    .line 51
    move v3, v2

    .line 52
    :goto_4
    if-ge v3, v0, :cond_4

    .line 53
    .line 54
    aget v5, v1, v3

    .line 55
    .line 56
    shl-int/2addr v5, v4

    .line 57
    invoke-static {v5}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    aput v5, v1, v3

    .line 62
    .line 63
    add-int/lit8 v3, v3, 0x1

    .line 64
    .line 65
    goto :goto_4

    .line 66
    :cond_4
    sput-object v1, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世哲苏楪兰:[I

    .line 67
    .line 68
    new-array v0, v4, [C

    .line 69
    .line 70
    const/16 v1, 0x7b

    .line 71
    .line 72
    aput-char v1, v0, v2

    .line 73
    .line 74
    const/4 v1, 0x1

    .line 75
    const/16 v2, 0x22

    .line 76
    .line 77
    aput-char v2, v0, v1

    .line 78
    .line 79
    const/4 v1, 0x2

    .line 80
    const/16 v3, 0x24

    .line 81
    .line 82
    aput-char v3, v0, v1

    .line 83
    .line 84
    const/4 v1, 0x3

    .line 85
    const/16 v3, 0x72

    .line 86
    .line 87
    aput-char v3, v0, v1

    .line 88
    .line 89
    const/16 v1, 0x65

    .line 90
    .line 91
    const/4 v3, 0x4

    .line 92
    aput-char v1, v0, v3

    .line 93
    .line 94
    const/4 v1, 0x5

    .line 95
    const/16 v3, 0x66

    .line 96
    .line 97
    aput-char v3, v0, v1

    .line 98
    .line 99
    const/4 v1, 0x6

    .line 100
    aput-char v2, v0, v1

    .line 101
    .line 102
    const/4 v2, 0x7

    .line 103
    const/16 v3, 0x3a

    .line 104
    .line 105
    aput-char v3, v0, v2

    .line 106
    .line 107
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 108
    .line 109
    sget-wide v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰:J

    .line 110
    .line 111
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 112
    .line 113
    .line 114
    move-result-wide v5

    .line 115
    sput-wide v5, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世哲楪苏兰:J

    .line 116
    .line 117
    const-wide/16 v5, 0x8

    .line 118
    .line 119
    add-long/2addr v5, v3

    .line 120
    invoke-virtual {v2, v0, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 121
    .line 122
    .line 123
    move-result-wide v5

    .line 124
    sput-wide v5, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世哲楪兰苏:J

    .line 125
    .line 126
    const-wide/16 v5, 0xc

    .line 127
    .line 128
    add-long v7, v3, v5

    .line 129
    .line 130
    invoke-virtual {v2, v0, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 131
    .line 132
    .line 133
    const/16 v7, 0x27

    .line 134
    .line 135
    aput-char v7, v0, v1

    .line 136
    .line 137
    add-long/2addr v3, v5

    .line 138
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 139
    .line 140
    .line 141
    return-void
.end method

.method public constructor <init>(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_16:Ljava/nio/charset/Charset;

    .line 3
    .line 4
    invoke-direct {p0, p1, v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;ZLjava/nio/charset/Charset;)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    sget-object v0, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰苏世:[Lcom/alibaba/fastjson2/飘花落叶言子楪世兰哲苏;

    .line 16
    .line 17
    array-length v1, v0

    .line 18
    add-int/lit8 v1, v1, -0x1

    .line 19
    .line 20
    and-int/2addr p1, v1

    .line 21
    aget-object p1, v0, p1

    .line 22
    .line 23
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏兰楪哲:Lcom/alibaba/fastjson2/飘花落叶言子楪世兰哲苏;

    .line 24
    .line 25
    sget-object v0, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世苏哲:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, [C

    .line 33
    .line 34
    if-nez p1, :cond_0

    .line 35
    .line 36
    const/16 p1, 0x2000

    .line 37
    .line 38
    new-array p1, p1, [C

    .line 39
    .line 40
    :cond_0
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 41
    .line 42
    iget-boolean p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰世哲苏:Z

    .line 43
    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    const-wide v0, -0x2727272727272728L    # -1.0025205409043291E120

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const-wide v0, -0x2222222222222223L    # -1.4568159901474629E144

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    :goto_0
    iput-wide v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏兰哲楪:J

    .line 58
    .line 59
    return-void
.end method

.method public static 飘花落叶言楪世子兰苏哲(J)J
    .locals 5

    .line 1
    const-wide/16 v0, 0xff

    .line 2
    .line 3
    and-long/2addr v0, p0

    .line 4
    const-wide/32 v2, 0xff00

    .line 5
    .line 6
    .line 7
    and-long/2addr v2, p0

    .line 8
    const/16 v4, 0x8

    .line 9
    .line 10
    shl-long/2addr v2, v4

    .line 11
    or-long/2addr v0, v2

    .line 12
    const-wide/32 v2, 0xff0000

    .line 13
    .line 14
    .line 15
    and-long/2addr v2, p0

    .line 16
    const/16 v4, 0x10

    .line 17
    .line 18
    shl-long/2addr v2, v4

    .line 19
    or-long/2addr v0, v2

    .line 20
    const-wide v2, 0xff000000L

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    and-long/2addr p0, v2

    .line 26
    const/16 v2, 0x18

    .line 27
    .line 28
    shl-long/2addr p0, v2

    .line 29
    or-long/2addr p0, v0

    .line 30
    return-wide p0
.end method

.method public static 飘花落叶言楪世苏子兰哲(II[CI)V
    .locals 8

    .line 1
    and-int/lit16 p1, p1, 0xff

    .line 2
    .line 3
    sget-object v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世哲苏楪兰:[I

    .line 4
    .line 5
    aget p1, v0, p1

    .line 6
    .line 7
    int-to-long v1, p1

    .line 8
    and-int/lit16 p1, p3, 0xff

    .line 9
    .line 10
    aget p1, v0, p1

    .line 11
    .line 12
    int-to-long v3, p1

    .line 13
    const/16 p1, 0x20

    .line 14
    .line 15
    shl-long/2addr v3, p1

    .line 16
    or-long v0, v1, v3

    .line 17
    .line 18
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 19
    .line 20
    sget-wide v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰:J

    .line 21
    .line 22
    int-to-long p0, p0

    .line 23
    const/4 p3, 0x1

    .line 24
    shl-long/2addr p0, p3

    .line 25
    add-long v4, v3, p0

    .line 26
    .line 27
    sget-boolean p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰苏世:Z

    .line 28
    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    const/16 p0, 0x8

    .line 32
    .line 33
    shl-long p0, v0, p0

    .line 34
    .line 35
    invoke-static {p0, p1}, Ljava/lang/Long;->reverseBytes(J)J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    :cond_0
    move-object v3, p2

    .line 40
    move-wide v6, v0

    .line 41
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 42
    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/high16 v2, 0x800000

    .line 5
    .line 6
    if-le v1, v2, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    sget-object v1, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世苏哲:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 10
    .line 11
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏兰楪哲:Lcom/alibaba/fastjson2/飘花落叶言子楪世兰哲苏;

    .line 12
    .line 13
    invoke-virtual {v1, p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 7
    .line 8
    invoke-direct {v0, v1, v2, p0}, Ljava/lang/String;-><init>([CII)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final 飘花落叶言子兰世哲楪苏([B)V
    .locals 7

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 8
    .line 9
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 12
    .line 13
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 14
    .line 15
    and-long/2addr v0, v2

    .line 16
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    cmp-long v0, v0, v2

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x1

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    move v0, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move v0, v1

    .line 27
    :goto_0
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 28
    .line 29
    array-length v4, p1

    .line 30
    const/4 v5, 0x5

    .line 31
    const/4 v6, 0x2

    .line 32
    invoke-static {v4, v5, v3, v6}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    iget-object v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 37
    .line 38
    array-length v6, v5

    .line 39
    if-le v4, v6, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 42
    .line 43
    .line 44
    iget-object v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 45
    .line 46
    :cond_2
    add-int/lit8 v4, v3, 0x1

    .line 47
    .line 48
    const/16 v6, 0x5b

    .line 49
    .line 50
    aput-char v6, v5, v3

    .line 51
    .line 52
    :goto_1
    array-length v3, p1

    .line 53
    if-ge v1, v3, :cond_6

    .line 54
    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    add-int/lit8 v3, v4, 0x1

    .line 58
    .line 59
    const/16 v6, 0x2c

    .line 60
    .line 61
    aput-char v6, v5, v4

    .line 62
    .line 63
    move v4, v3

    .line 64
    :cond_3
    iget-char v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 65
    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    add-int/lit8 v6, v4, 0x1

    .line 69
    .line 70
    aput-char v3, v5, v4

    .line 71
    .line 72
    move v4, v6

    .line 73
    :cond_4
    aget-byte v6, p1, v1

    .line 74
    .line 75
    invoke-static {v5, v4, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲世楪兰苏([CIB)I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-eqz v0, :cond_5

    .line 80
    .line 81
    add-int/lit8 v6, v4, 0x1

    .line 82
    .line 83
    aput-char v3, v5, v4

    .line 84
    .line 85
    move v4, v6

    .line 86
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_6
    const/16 p1, 0x5d

    .line 90
    .line 91
    aput-char p1, v5, v4

    .line 92
    .line 93
    add-int/2addr v4, v2

    .line 94
    iput v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 95
    .line 96
    return-void
.end method

.method public final 飘花落叶言子兰世哲苏楪(Ljava/time/LocalDate;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 8
    .line 9
    add-int/lit8 v1, v0, 0x12

    .line 10
    .line 11
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 12
    .line 13
    array-length v3, v2

    .line 14
    if-le v1, v3, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 20
    .line 21
    :cond_1
    add-int/lit8 v1, v0, 0x1

    .line 22
    .line 23
    iget-char v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 24
    .line 25
    aput-char v3, v2, v0

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/time/LocalDate;->getYear()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {p1}, Ljava/time/LocalDate;->getMonthValue()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    invoke-virtual {p1}, Ljava/time/LocalDate;->getDayOfMonth()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-static {v2, v1, v0, v4, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲世苏兰楪([CIIII)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    aput-char v3, v2, p1

    .line 44
    .line 45
    add-int/lit8 p1, p1, 0x1

    .line 46
    .line 47
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 48
    .line 49
    return-void
.end method

.method public final 飘花落叶言子兰世楪哲苏(Ljava/lang/Long;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0, v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子兰世楪苏哲(J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final 飘花落叶言子兰世楪苏哲(J)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 6
    .line 7
    add-int/lit8 v3, v2, 0x17

    .line 8
    .line 9
    iget-object v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 10
    .line 11
    array-length v5, v4

    .line 12
    if-le v3, v5, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 15
    .line 16
    .line 17
    iget-object v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 18
    .line 19
    :cond_0
    invoke-static {p1, p2, v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰哲苏世(JJ)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    iget-char v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 24
    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    add-int/lit8 v6, v2, 0x1

    .line 28
    .line 29
    aput-char v5, v4, v2

    .line 30
    .line 31
    move v2, v6

    .line 32
    :cond_1
    invoke-static {v4, v2, p1, p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲楪苏兰世([CIJ)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    add-int/lit8 p1, v2, 0x1

    .line 39
    .line 40
    aput-char v5, v4, v2

    .line 41
    .line 42
    :goto_0
    move v2, p1

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    const-wide/16 v5, 0x200

    .line 45
    .line 46
    and-long/2addr v5, v0

    .line 47
    const-wide/16 v7, 0x0

    .line 48
    .line 49
    cmp-long v3, v5, v7

    .line 50
    .line 51
    if-eqz v3, :cond_3

    .line 52
    .line 53
    const-wide v5, 0x10000000000L

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    and-long/2addr v0, v5

    .line 59
    cmp-long v0, v0, v7

    .line 60
    .line 61
    if-nez v0, :cond_3

    .line 62
    .line 63
    const-wide/32 v0, -0x80000000

    .line 64
    .line 65
    .line 66
    cmp-long v0, p1, v0

    .line 67
    .line 68
    if-ltz v0, :cond_3

    .line 69
    .line 70
    const-wide/32 v0, 0x7fffffff

    .line 71
    .line 72
    .line 73
    cmp-long p1, p1, v0

    .line 74
    .line 75
    if-gtz p1, :cond_3

    .line 76
    .line 77
    add-int/lit8 p1, v2, 0x1

    .line 78
    .line 79
    const/16 p2, 0x4c

    .line 80
    .line 81
    aput-char p2, v4, v2

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    :goto_1
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 85
    .line 86
    return-void
.end method

.method public final 飘花落叶言子兰世苏哲楪(B)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 6
    .line 7
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 8
    .line 9
    and-long/2addr v0, v2

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 20
    .line 21
    add-int/lit8 v2, v1, 0x7

    .line 22
    .line 23
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 24
    .line 25
    array-length v4, v3

    .line 26
    if-le v2, v4, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 29
    .line 30
    .line 31
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 32
    .line 33
    :cond_1
    iget-char v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    add-int/lit8 v4, v1, 0x1

    .line 38
    .line 39
    aput-char v2, v3, v1

    .line 40
    .line 41
    move v1, v4

    .line 42
    :cond_2
    invoke-static {v3, v1, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲世楪兰苏([CIB)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    add-int/lit8 v0, p1, 0x1

    .line 49
    .line 50
    aput-char v2, v3, p1

    .line 51
    .line 52
    move p1, v0

    .line 53
    :cond_3
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 54
    .line 55
    return-void
.end method

.method public final 飘花落叶言子兰世苏楪哲([J)V
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 8
    .line 9
    add-int/lit8 v1, v0, 0x2

    .line 10
    .line 11
    array-length v2, p1

    .line 12
    mul-int/lit8 v2, v2, 0x17

    .line 13
    .line 14
    add-int/2addr v2, v1

    .line 15
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 16
    .line 17
    array-length v3, v1

    .line 18
    if-le v2, v3, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 24
    .line 25
    :cond_1
    add-int/lit8 v2, v0, 0x1

    .line 26
    .line 27
    const/16 v3, 0x5b

    .line 28
    .line 29
    aput-char v3, v1, v0

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    :goto_0
    array-length v3, p1

    .line 33
    if-ge v0, v3, :cond_5

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    add-int/lit8 v3, v2, 0x1

    .line 38
    .line 39
    const/16 v4, 0x2c

    .line 40
    .line 41
    aput-char v4, v1, v2

    .line 42
    .line 43
    move v2, v3

    .line 44
    :cond_2
    aget-wide v3, p1, v0

    .line 45
    .line 46
    iget-object v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 47
    .line 48
    iget-wide v5, v5, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 49
    .line 50
    invoke-static {v3, v4, v5, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰哲苏世(JJ)Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    iget-char v6, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 55
    .line 56
    if-eqz v5, :cond_3

    .line 57
    .line 58
    add-int/lit8 v7, v2, 0x1

    .line 59
    .line 60
    aput-char v6, v1, v2

    .line 61
    .line 62
    move v2, v7

    .line 63
    :cond_3
    invoke-static {v1, v2, v3, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲楪苏兰世([CIJ)I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v5, :cond_4

    .line 68
    .line 69
    add-int/lit8 v3, v2, 0x1

    .line 70
    .line 71
    aput-char v6, v1, v2

    .line 72
    .line 73
    move v2, v3

    .line 74
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_5
    const/16 p1, 0x5d

    .line 78
    .line 79
    aput-char p1, v1, v2

    .line 80
    .line 81
    add-int/lit8 v2, v2, 0x1

    .line 82
    .line 83
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 84
    .line 85
    return-void
.end method

.method public final 飘花落叶言子兰哲楪世苏([C)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    add-int/2addr v1, v0

    .line 5
    add-int/lit8 v1, v1, 0x2

    .line 6
    .line 7
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰哲苏世:I

    .line 8
    .line 9
    iget-byte v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪兰哲苏:B

    .line 10
    .line 11
    mul-int/2addr v2, v3

    .line 12
    add-int/2addr v2, v1

    .line 13
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 14
    .line 15
    array-length v4, v1

    .line 16
    if-le v2, v4, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 22
    .line 23
    :cond_0
    iget-boolean v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰哲世苏:Z

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰哲世苏:Z

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    add-int/lit8 v2, v0, 0x1

    .line 32
    .line 33
    const/16 v5, 0x2c

    .line 34
    .line 35
    aput-char v5, v1, v0

    .line 36
    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    invoke-virtual {p0, v2, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世苏子哲兰(I[C)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    move v0, v2

    .line 45
    :goto_0
    array-length v2, p1

    .line 46
    invoke-static {p1, v4, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 47
    .line 48
    .line 49
    array-length p1, p1

    .line 50
    add-int/2addr v0, p1

    .line 51
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 52
    .line 53
    return-void
.end method

.method public final 飘花落叶言子兰哲楪苏世()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x4

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-le v1, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 14
    .line 15
    :cond_0
    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏世兰楪哲(I[C)V

    .line 16
    .line 17
    .line 18
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 19
    .line 20
    return-void
.end method

.method public final 飘花落叶言子兰哲苏世楪(Ljava/time/OffsetTime;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/time/OffsetTime;->getOffset()Ljava/time/ZoneOffset;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 12
    .line 13
    add-int/lit8 v2, v1, 0x1c

    .line 14
    .line 15
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 16
    .line 17
    array-length v4, v3

    .line 18
    if-le v2, v4, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 21
    .line 22
    .line 23
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 24
    .line 25
    :cond_1
    iget-char v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 26
    .line 27
    aput-char v2, v3, v1

    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/time/OffsetTime;->toLocalTime()Ljava/time/LocalTime;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {v3, v1, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲世兰苏楪([CILjava/time/LocalTime;)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_2

    .line 44
    .line 45
    add-int/lit8 v0, p1, 0x1

    .line 46
    .line 47
    const/16 v1, 0x5a

    .line 48
    .line 49
    aput-char v1, v3, p1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getId()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const/4 v1, 0x0

    .line 57
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    invoke-virtual {v0, v1, v4, v3, p1}, Ljava/lang/String;->getChars(II[CI)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    add-int/2addr v0, p1

    .line 69
    :goto_0
    aput-char v2, v3, v0

    .line 70
    .line 71
    add-int/lit8 v0, v0, 0x1

    .line 72
    .line 73
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 74
    .line 75
    return-void
.end method

.method public final 飘花落叶言子兰哲苏楪世(Ljava/time/OffsetDateTime;)V
    .locals 7

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 8
    .line 9
    add-int/lit8 v1, v0, 0x2d

    .line 10
    .line 11
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 12
    .line 13
    array-length v3, v2

    .line 14
    if-le v1, v3, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 20
    .line 21
    :cond_1
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 22
    .line 23
    aput-char v1, v2, v0

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/time/OffsetDateTime;->toLocalDateTime()Ljava/time/LocalDateTime;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v3}, Ljava/time/LocalDateTime;->toLocalDate()Ljava/time/LocalDate;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    add-int/lit8 v0, v0, 0x1

    .line 34
    .line 35
    invoke-virtual {v4}, Ljava/time/LocalDate;->getYear()I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    invoke-virtual {v4}, Ljava/time/LocalDate;->getMonthValue()I

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    invoke-virtual {v4}, Ljava/time/LocalDate;->getDayOfMonth()I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    invoke-static {v2, v0, v5, v6, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲世苏兰楪([CIIII)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const/16 v4, 0x54

    .line 52
    .line 53
    aput-char v4, v2, v0

    .line 54
    .line 55
    add-int/lit8 v0, v0, 0x1

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/time/LocalDateTime;->toLocalTime()Ljava/time/LocalTime;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-static {v2, v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲世兰苏楪([CILjava/time/LocalTime;)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-virtual {p1}, Ljava/time/OffsetDateTime;->getOffset()Ljava/time/ZoneOffset;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-nez v3, :cond_2

    .line 74
    .line 75
    add-int/lit8 p1, v0, 0x1

    .line 76
    .line 77
    const/16 v3, 0x5a

    .line 78
    .line 79
    aput-char v3, v2, v0

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    invoke-virtual {p1}, Ljava/time/ZoneOffset;->getId()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    const/4 v3, 0x0

    .line 87
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    invoke-virtual {p1, v3, v4, v2, v0}, Ljava/lang/String;->getChars(II[CI)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    add-int/2addr p1, v0

    .line 99
    :goto_0
    aput-char v1, v2, p1

    .line 100
    .line 101
    add-int/lit8 p1, p1, 0x1

    .line 102
    .line 103
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 104
    .line 105
    return-void
.end method

.method public final 飘花落叶言子兰楪世哲苏(S)V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 6
    .line 7
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 8
    .line 9
    and-long/2addr v0, v2

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    move v0, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 21
    .line 22
    add-int/lit8 v3, v2, 0x7

    .line 23
    .line 24
    iget-object v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 25
    .line 26
    array-length v5, v4

    .line 27
    if-le v3, v5, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 30
    .line 31
    .line 32
    iget-object v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 33
    .line 34
    :cond_1
    iget-char v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    add-int/lit8 v5, v2, 0x1

    .line 39
    .line 40
    aput-char v3, v4, v2

    .line 41
    .line 42
    move v2, v5

    .line 43
    :cond_2
    sget-object v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲世兰苏:[J

    .line 44
    .line 45
    if-gez p1, :cond_3

    .line 46
    .line 47
    neg-int p1, p1

    .line 48
    add-int/lit8 v6, v2, 0x1

    .line 49
    .line 50
    const/16 v7, 0x2d

    .line 51
    .line 52
    invoke-static {v4, v2, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪世哲兰([CIC)V

    .line 53
    .line 54
    .line 55
    move v2, v6

    .line 56
    :cond_3
    const/16 v6, 0x30

    .line 57
    .line 58
    const/16 v7, 0x20

    .line 59
    .line 60
    const/16 v8, 0x3e8

    .line 61
    .line 62
    if-ge p1, v8, :cond_6

    .line 63
    .line 64
    and-int/lit16 p1, p1, 0x3ff

    .line 65
    .line 66
    aget-wide v8, v5, p1

    .line 67
    .line 68
    long-to-int p1, v8

    .line 69
    int-to-byte p1, p1

    .line 70
    if-nez p1, :cond_4

    .line 71
    .line 72
    const/16 p1, 0x10

    .line 73
    .line 74
    shr-long v10, v8, p1

    .line 75
    .line 76
    long-to-int p1, v10

    .line 77
    invoke-static {v2, p1, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪哲世兰(II[C)V

    .line 78
    .line 79
    .line 80
    add-int/lit8 v2, v2, 0x2

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    if-ne p1, v1, :cond_5

    .line 84
    .line 85
    add-int/lit8 p1, v2, 0x1

    .line 86
    .line 87
    shr-long v10, v8, v7

    .line 88
    .line 89
    long-to-int v5, v10

    .line 90
    int-to-char v5, v5

    .line 91
    invoke-static {v4, v2, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪世哲兰([CIC)V

    .line 92
    .line 93
    .line 94
    move v2, p1

    .line 95
    :cond_5
    :goto_1
    shr-long v5, v8, v6

    .line 96
    .line 97
    long-to-int p1, v5

    .line 98
    int-to-char p1, p1

    .line 99
    invoke-static {v4, v2, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪世哲兰([CIC)V

    .line 100
    .line 101
    .line 102
    add-int/2addr v2, v1

    .line 103
    goto :goto_2

    .line 104
    :cond_6
    int-to-long v9, p1

    .line 105
    const-wide/32 v11, 0x10624dd3

    .line 106
    .line 107
    .line 108
    mul-long/2addr v9, v11

    .line 109
    const/16 v11, 0x26

    .line 110
    .line 111
    shr-long/2addr v9, v11

    .line 112
    long-to-int v9, v9

    .line 113
    and-int/lit16 v10, v9, 0x3ff

    .line 114
    .line 115
    aget-wide v10, v5, v10

    .line 116
    .line 117
    long-to-int v12, v10

    .line 118
    int-to-byte v12, v12

    .line 119
    if-ne v12, v1, :cond_7

    .line 120
    .line 121
    add-int/lit8 v1, v2, 0x1

    .line 122
    .line 123
    shr-long v12, v10, v7

    .line 124
    .line 125
    long-to-int v7, v12

    .line 126
    int-to-char v7, v7

    .line 127
    invoke-static {v4, v2, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪世哲兰([CIC)V

    .line 128
    .line 129
    .line 130
    move v2, v1

    .line 131
    :cond_7
    mul-int/2addr v9, v8

    .line 132
    sub-int/2addr p1, v9

    .line 133
    and-int/lit16 p1, p1, 0x3ff

    .line 134
    .line 135
    aget-wide v7, v5, p1

    .line 136
    .line 137
    const-wide/32 v12, -0x10000

    .line 138
    .line 139
    .line 140
    and-long/2addr v7, v12

    .line 141
    shr-long v5, v10, v6

    .line 142
    .line 143
    or-long/2addr v5, v7

    .line 144
    invoke-static {v4, v2, v5, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏世哲楪兰([CIJ)V

    .line 145
    .line 146
    .line 147
    add-int/lit8 v2, v2, 0x4

    .line 148
    .line 149
    :goto_2
    if-eqz v0, :cond_8

    .line 150
    .line 151
    add-int/lit8 p1, v2, 0x1

    .line 152
    .line 153
    aput-char v3, v4, v2

    .line 154
    .line 155
    move v2, p1

    .line 156
    :cond_8
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 157
    .line 158
    return-void
.end method

.method public final 飘花落叶言子兰楪哲世苏(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子兰楪苏哲世(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final 飘花落叶言子兰楪哲苏世([I)V
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 8
    .line 9
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 12
    .line 13
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 14
    .line 15
    and-long/2addr v0, v2

    .line 16
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    cmp-long v0, v0, v2

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x1

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    move v0, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move v0, v1

    .line 27
    :goto_0
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 28
    .line 29
    array-length v4, p1

    .line 30
    const/16 v5, 0xd

    .line 31
    .line 32
    const/4 v6, 0x2

    .line 33
    invoke-static {v4, v5, v3, v6}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    iget-object v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 38
    .line 39
    array-length v6, v5

    .line 40
    if-le v4, v6, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 43
    .line 44
    .line 45
    iget-object v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 46
    .line 47
    :cond_2
    add-int/lit8 v4, v3, 0x1

    .line 48
    .line 49
    const/16 v6, 0x5b

    .line 50
    .line 51
    aput-char v6, v5, v3

    .line 52
    .line 53
    :goto_1
    array-length v3, p1

    .line 54
    if-ge v1, v3, :cond_6

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    add-int/lit8 v3, v4, 0x1

    .line 59
    .line 60
    const/16 v6, 0x2c

    .line 61
    .line 62
    aput-char v6, v5, v4

    .line 63
    .line 64
    move v4, v3

    .line 65
    :cond_3
    iget-char v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 66
    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    add-int/lit8 v6, v4, 0x1

    .line 70
    .line 71
    aput-char v3, v5, v4

    .line 72
    .line 73
    move v4, v6

    .line 74
    :cond_4
    aget v6, p1, v1

    .line 75
    .line 76
    int-to-long v6, v6

    .line 77
    invoke-static {v5, v4, v6, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰哲世楪([CIJ)I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    add-int/lit8 v6, v4, 0x1

    .line 84
    .line 85
    aput-char v3, v5, v4

    .line 86
    .line 87
    move v4, v6

    .line 88
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_6
    const/16 p1, 0x5d

    .line 92
    .line 93
    aput-char p1, v5, v4

    .line 94
    .line 95
    add-int/2addr v4, v2

    .line 96
    iput v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 97
    .line 98
    return-void
.end method

.method public final 飘花落叶言子兰楪苏哲世(I)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    const-wide/16 v2, 0x100

    .line 6
    .line 7
    and-long/2addr v0, v2

    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 18
    .line 19
    add-int/lit8 v2, v1, 0xd

    .line 20
    .line 21
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 22
    .line 23
    array-length v4, v3

    .line 24
    if-le v2, v4, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 27
    .line 28
    .line 29
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 30
    .line 31
    :cond_1
    iget-char v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    add-int/lit8 v4, v1, 0x1

    .line 36
    .line 37
    aput-char v2, v3, v1

    .line 38
    .line 39
    move v1, v4

    .line 40
    :cond_2
    int-to-long v4, p1

    .line 41
    invoke-static {v3, v1, v4, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰哲世楪([CIJ)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    add-int/lit8 v0, p1, 0x1

    .line 48
    .line 49
    aput-char v2, v3, p1

    .line 50
    .line 51
    move p1, v0

    .line 52
    :cond_3
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 53
    .line 54
    return-void
.end method

.method public final 飘花落叶言子兰苏哲世楪([B)V
    .locals 0

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string p1, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言子兰苏楪世哲(Ljava/time/LocalDateTime;)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x26

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-le v1, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 14
    .line 15
    :cond_0
    add-int/lit8 v1, v0, 0x1

    .line 16
    .line 17
    iget-char v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 18
    .line 19
    aput-char v3, v2, v0

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/time/LocalDateTime;->toLocalDate()Ljava/time/LocalDate;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/time/LocalDate;->getYear()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    invoke-virtual {v0}, Ljava/time/LocalDate;->getMonthValue()I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    invoke-virtual {v0}, Ljava/time/LocalDate;->getDayOfMonth()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-static {v2, v1, v4, v5, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲世苏兰楪([CIIII)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    add-int/lit8 v1, v0, 0x1

    .line 42
    .line 43
    const/16 v4, 0x20

    .line 44
    .line 45
    aput-char v4, v2, v0

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/time/LocalDateTime;->toLocalTime()Ljava/time/LocalTime;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {v2, v1, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲世兰苏楪([CILjava/time/LocalTime;)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    aput-char v3, v2, p1

    .line 56
    .line 57
    add-int/lit8 p1, p1, 0x1

    .line 58
    .line 59
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 60
    .line 61
    return-void
.end method

.method public final 飘花落叶言子兰苏楪哲世(Ljava/time/LocalTime;)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x14

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-le v1, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 14
    .line 15
    :cond_0
    add-int/lit8 v1, v0, 0x1

    .line 16
    .line 17
    iget-char v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 18
    .line 19
    aput-char v3, v2, v0

    .line 20
    .line 21
    invoke-static {v2, v1, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲世兰苏楪([CILjava/time/LocalTime;)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    aput-char v3, v2, p1

    .line 26
    .line 27
    add-int/lit8 p1, p1, 0x1

    .line 28
    .line 29
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 30
    .line 31
    return-void
.end method

.method public final 飘花落叶言子哲世兰楪苏(IIIIII)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x15

    .line 6
    .line 7
    array-length v3, v0

    .line 8
    if-le v2, v3, :cond_0

    .line 9
    .line 10
    add-int/lit8 v1, v1, 0x15

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 16
    .line 17
    :cond_0
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 18
    .line 19
    iget-char v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 20
    .line 21
    aput-char v2, v0, v1

    .line 22
    .line 23
    if-ltz p1, :cond_1

    .line 24
    .line 25
    const/16 v3, 0x270f

    .line 26
    .line 27
    if-gt p1, v3, :cond_1

    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    invoke-static {v0, v1, p1, p2, p3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲世苏兰楪([CIIII)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    const/16 p2, 0x20

    .line 36
    .line 37
    aput-char p2, v0, p1

    .line 38
    .line 39
    add-int/lit8 p2, p1, 0x1

    .line 40
    .line 41
    invoke-static {v0, p2, p4, p5, p6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲苏楪兰世([CIIII)V

    .line 42
    .line 43
    .line 44
    add-int/lit8 p2, p1, 0x9

    .line 45
    .line 46
    aput-char v2, v0, p2

    .line 47
    .line 48
    add-int/lit8 p1, p1, 0xa

    .line 49
    .line 50
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    invoke-static {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏兰世哲(I)Ljava/lang/IllegalArgumentException;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    throw p0
.end method

.method public final 飘花落叶言子哲世兰苏楪(IIIIIIIIZ)V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p9, :cond_1

    .line 3
    .line 4
    if-nez p8, :cond_0

    .line 5
    .line 6
    move v1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v1, 0x6

    .line 9
    goto :goto_0

    .line 10
    :cond_1
    const/4 v1, 0x0

    .line 11
    :goto_0
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 12
    .line 13
    add-int/lit8 v3, v2, 0x19

    .line 14
    .line 15
    add-int/2addr v3, v1

    .line 16
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 17
    .line 18
    array-length v4, v1

    .line 19
    if-le v3, v4, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 25
    .line 26
    :cond_2
    iget-char v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 27
    .line 28
    aput-char v3, v1, v2

    .line 29
    .line 30
    add-int/2addr v2, v0

    .line 31
    invoke-static {v1, v2, p1, p2, p3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲世苏兰楪([CIIII)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p9, :cond_3

    .line 36
    .line 37
    const/16 p2, 0x54

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_3
    const/16 p2, 0x20

    .line 41
    .line 42
    :goto_1
    aput-char p2, v1, p1

    .line 43
    .line 44
    add-int/lit8 p2, p1, 0x1

    .line 45
    .line 46
    invoke-static {v1, p2, p4, p5, p6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲苏楪兰世([CIIII)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 p2, p1, 0x9

    .line 50
    .line 51
    if-lez p7, :cond_6

    .line 52
    .line 53
    div-int/lit8 p3, p7, 0xa

    .line 54
    .line 55
    div-int/lit8 p4, p3, 0xa

    .line 56
    .line 57
    mul-int/lit8 p5, p3, 0xa

    .line 58
    .line 59
    sub-int p5, p7, p5

    .line 60
    .line 61
    if-eqz p5, :cond_4

    .line 62
    .line 63
    sget-object p3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲世兰苏:[J

    .line 64
    .line 65
    and-int/lit16 p4, p7, 0x3ff

    .line 66
    .line 67
    aget-wide p4, p3, p4

    .line 68
    .line 69
    const-wide/32 p6, -0x10000

    .line 70
    .line 71
    .line 72
    and-long p3, p4, p6

    .line 73
    .line 74
    sget-wide p5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏兰世哲:J

    .line 75
    .line 76
    or-long/2addr p3, p5

    .line 77
    invoke-static {v1, p2, p3, p4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏世哲楪兰([CIJ)V

    .line 78
    .line 79
    .line 80
    add-int/lit8 p2, p1, 0xd

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    add-int/lit8 p5, p1, 0xa

    .line 84
    .line 85
    const/16 p6, 0x2e

    .line 86
    .line 87
    aput-char p6, v1, p2

    .line 88
    .line 89
    mul-int/lit8 p2, p4, 0xa

    .line 90
    .line 91
    sub-int p2, p3, p2

    .line 92
    .line 93
    if-eqz p2, :cond_5

    .line 94
    .line 95
    invoke-static {p5, p3, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 96
    .line 97
    .line 98
    add-int/lit8 p2, p1, 0xc

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_5
    add-int/lit8 p2, p1, 0xb

    .line 102
    .line 103
    add-int/lit8 p4, p4, 0x30

    .line 104
    .line 105
    int-to-byte p1, p4

    .line 106
    int-to-char p1, p1

    .line 107
    aput-char p1, v1, p5

    .line 108
    .line 109
    :cond_6
    :goto_2
    if-eqz p9, :cond_a

    .line 110
    .line 111
    div-int/lit16 p1, p8, 0xe10

    .line 112
    .line 113
    if-nez p8, :cond_7

    .line 114
    .line 115
    add-int/lit8 p1, p2, 0x1

    .line 116
    .line 117
    const/16 p3, 0x5a

    .line 118
    .line 119
    aput-char p3, v1, p2

    .line 120
    .line 121
    move p2, p1

    .line 122
    goto :goto_4

    .line 123
    :cond_7
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 124
    .line 125
    .line 126
    move-result p3

    .line 127
    if-ltz p1, :cond_8

    .line 128
    .line 129
    const/16 p4, 0x2b

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_8
    const/16 p4, 0x2d

    .line 133
    .line 134
    :goto_3
    aput-char p4, v1, p2

    .line 135
    .line 136
    add-int/lit8 p4, p2, 0x1

    .line 137
    .line 138
    invoke-static {p4, p3, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 139
    .line 140
    .line 141
    add-int/lit8 p3, p2, 0x3

    .line 142
    .line 143
    const/16 p4, 0x3a

    .line 144
    .line 145
    aput-char p4, v1, p3

    .line 146
    .line 147
    mul-int/lit16 p1, p1, 0xe10

    .line 148
    .line 149
    sub-int/2addr p8, p1

    .line 150
    div-int/lit8 p8, p8, 0x3c

    .line 151
    .line 152
    if-gez p8, :cond_9

    .line 153
    .line 154
    neg-int p8, p8

    .line 155
    :cond_9
    add-int/lit8 p1, p2, 0x4

    .line 156
    .line 157
    invoke-static {p1, p8, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 158
    .line 159
    .line 160
    add-int/lit8 p2, p2, 0x6

    .line 161
    .line 162
    :cond_a
    :goto_4
    aput-char v3, v1, p2

    .line 163
    .line 164
    add-int/2addr p2, v0

    .line 165
    iput p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 166
    .line 167
    return-void
.end method

.method public final 飘花落叶言子哲世楪兰苏()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    if-ne v0, v2, :cond_0

    .line 7
    .line 8
    add-int/lit8 v1, v0, 0x1

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 14
    .line 15
    :cond_0
    const/16 v2, 0x3a

    .line 16
    .line 17
    aput-char v2, v1, v0

    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 22
    .line 23
    return-void
.end method

.method public final 飘花落叶言子哲世楪苏兰(C)V
    .locals 8

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 4
    .line 5
    add-int/lit8 v2, v0, 0x8

    .line 6
    .line 7
    array-length v3, v1

    .line 8
    if-le v2, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 14
    .line 15
    :cond_0
    add-int/lit8 v2, v0, 0x1

    .line 16
    .line 17
    iget-char v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 18
    .line 19
    aput-char v3, v1, v0

    .line 20
    .line 21
    const/16 v4, 0x22

    .line 22
    .line 23
    const/16 v5, 0x5c

    .line 24
    .line 25
    if-eq p1, v4, :cond_2

    .line 26
    .line 27
    const/16 v4, 0x27

    .line 28
    .line 29
    if-eq p1, v4, :cond_2

    .line 30
    .line 31
    if-eq p1, v5, :cond_1

    .line 32
    .line 33
    const/16 v4, 0x31

    .line 34
    .line 35
    const/16 v6, 0x75

    .line 36
    .line 37
    const/16 v7, 0x30

    .line 38
    .line 39
    packed-switch p1, :pswitch_data_0

    .line 40
    .line 41
    .line 42
    add-int/lit8 v0, v0, 0x2

    .line 43
    .line 44
    aput-char p1, v1, v2

    .line 45
    .line 46
    goto/16 :goto_1

    .line 47
    .line 48
    :pswitch_0
    aput-char v5, v1, v2

    .line 49
    .line 50
    add-int/lit8 v2, v0, 0x2

    .line 51
    .line 52
    aput-char v6, v1, v2

    .line 53
    .line 54
    add-int/lit8 v2, v0, 0x3

    .line 55
    .line 56
    aput-char v7, v1, v2

    .line 57
    .line 58
    add-int/lit8 v2, v0, 0x4

    .line 59
    .line 60
    aput-char v7, v1, v2

    .line 61
    .line 62
    add-int/lit8 v2, v0, 0x5

    .line 63
    .line 64
    aput-char v4, v1, v2

    .line 65
    .line 66
    add-int/lit8 v2, v0, 0x6

    .line 67
    .line 68
    add-int/lit8 p1, p1, 0x47

    .line 69
    .line 70
    int-to-char p1, p1

    .line 71
    aput-char p1, v1, v2

    .line 72
    .line 73
    :goto_0
    add-int/lit8 v0, v0, 0x7

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :pswitch_1
    aput-char v5, v1, v2

    .line 77
    .line 78
    add-int/lit8 v2, v0, 0x2

    .line 79
    .line 80
    aput-char v6, v1, v2

    .line 81
    .line 82
    add-int/lit8 v2, v0, 0x3

    .line 83
    .line 84
    aput-char v7, v1, v2

    .line 85
    .line 86
    add-int/lit8 v2, v0, 0x4

    .line 87
    .line 88
    aput-char v7, v1, v2

    .line 89
    .line 90
    add-int/lit8 v2, v0, 0x5

    .line 91
    .line 92
    aput-char v4, v1, v2

    .line 93
    .line 94
    add-int/lit8 v2, v0, 0x6

    .line 95
    .line 96
    add-int/lit8 p1, p1, 0x20

    .line 97
    .line 98
    int-to-char p1, p1

    .line 99
    aput-char p1, v1, v2

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :pswitch_2
    aput-char v5, v1, v2

    .line 103
    .line 104
    add-int/lit8 v2, v0, 0x2

    .line 105
    .line 106
    aput-char v6, v1, v2

    .line 107
    .line 108
    add-int/lit8 v2, v0, 0x3

    .line 109
    .line 110
    aput-char v7, v1, v2

    .line 111
    .line 112
    add-int/lit8 v2, v0, 0x4

    .line 113
    .line 114
    aput-char v7, v1, v2

    .line 115
    .line 116
    add-int/lit8 v2, v0, 0x5

    .line 117
    .line 118
    aput-char v7, v1, v2

    .line 119
    .line 120
    add-int/lit8 v2, v0, 0x6

    .line 121
    .line 122
    add-int/lit8 p1, p1, 0x57

    .line 123
    .line 124
    int-to-char p1, p1

    .line 125
    aput-char p1, v1, v2

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :pswitch_3
    aput-char v5, v1, v2

    .line 129
    .line 130
    add-int/lit8 v2, v0, 0x2

    .line 131
    .line 132
    aput-char v6, v1, v2

    .line 133
    .line 134
    add-int/lit8 v2, v0, 0x3

    .line 135
    .line 136
    aput-char v7, v1, v2

    .line 137
    .line 138
    add-int/lit8 v2, v0, 0x4

    .line 139
    .line 140
    aput-char v7, v1, v2

    .line 141
    .line 142
    add-int/lit8 v2, v0, 0x5

    .line 143
    .line 144
    aput-char v7, v1, v2

    .line 145
    .line 146
    add-int/lit8 v2, v0, 0x6

    .line 147
    .line 148
    add-int/2addr p1, v7

    .line 149
    int-to-char p1, p1

    .line 150
    aput-char p1, v1, v2

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_1
    :pswitch_4
    invoke-static {v2, p1, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏兰哲(II[C)V

    .line 154
    .line 155
    .line 156
    add-int/lit8 v0, v0, 0x3

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_2
    if-ne p1, v3, :cond_3

    .line 160
    .line 161
    add-int/lit8 v0, v0, 0x2

    .line 162
    .line 163
    aput-char v5, v1, v2

    .line 164
    .line 165
    move v2, v0

    .line 166
    :cond_3
    add-int/lit8 v0, v2, 0x1

    .line 167
    .line 168
    aput-char p1, v1, v2

    .line 169
    .line 170
    :goto_1
    aput-char v3, v1, v0

    .line 171
    .line 172
    add-int/lit8 v0, v0, 0x1

    .line 173
    .line 174
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 175
    .line 176
    return-void

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子哲世苏兰楪(IIIIII)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x10

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-le v1, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 14
    .line 15
    :cond_0
    iget-char v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 16
    .line 17
    aput-char v3, v2, v0

    .line 18
    .line 19
    if-ltz p1, :cond_1

    .line 20
    .line 21
    const/16 v4, 0x270f

    .line 22
    .line 23
    if-gt p1, v4, :cond_1

    .line 24
    .line 25
    div-int/lit8 v4, p1, 0x64

    .line 26
    .line 27
    mul-int/lit8 v5, v4, 0x64

    .line 28
    .line 29
    sub-int/2addr p1, v5

    .line 30
    add-int/lit8 v5, v0, 0x1

    .line 31
    .line 32
    invoke-static {v5, v4, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 33
    .line 34
    .line 35
    add-int/lit8 v4, v0, 0x3

    .line 36
    .line 37
    invoke-static {v4, p1, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 38
    .line 39
    .line 40
    add-int/lit8 p1, v0, 0x5

    .line 41
    .line 42
    invoke-static {p1, p2, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 43
    .line 44
    .line 45
    add-int/lit8 p1, v0, 0x7

    .line 46
    .line 47
    invoke-static {p1, p3, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 48
    .line 49
    .line 50
    add-int/lit8 p1, v0, 0x9

    .line 51
    .line 52
    invoke-static {p1, p4, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 53
    .line 54
    .line 55
    add-int/lit8 p1, v0, 0xb

    .line 56
    .line 57
    invoke-static {p1, p5, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 58
    .line 59
    .line 60
    add-int/lit8 p1, v0, 0xd

    .line 61
    .line 62
    invoke-static {p1, p6, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 63
    .line 64
    .line 65
    add-int/lit8 v0, v0, 0xf

    .line 66
    .line 67
    aput-char v3, v2, v0

    .line 68
    .line 69
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 70
    .line 71
    return-void

    .line 72
    :cond_1
    invoke-static {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏兰世哲(I)Ljava/lang/IllegalArgumentException;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    throw p0
.end method

.method public final 飘花落叶言子哲世苏楪兰()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰哲世苏:Z

    .line 3
    .line 4
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 5
    .line 6
    add-int/lit8 v1, v0, 0x2

    .line 7
    .line 8
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰哲苏世:I

    .line 9
    .line 10
    iget-byte v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪兰哲苏:B

    .line 11
    .line 12
    mul-int/2addr v2, v3

    .line 13
    add-int/2addr v2, v1

    .line 14
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 15
    .line 16
    array-length v4, v1

    .line 17
    if-le v2, v4, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 23
    .line 24
    :cond_0
    add-int/lit8 v2, v0, 0x1

    .line 25
    .line 26
    const/16 v4, 0x2c

    .line 27
    .line 28
    aput-char v4, v1, v0

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0, v2, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世苏子哲兰(I[C)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    :cond_1
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 37
    .line 38
    return-void
.end method

.method public final 飘花落叶言子哲兰世楪苏(F)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 6
    .line 7
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 8
    .line 9
    and-long/2addr v0, v2

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 20
    .line 21
    add-int/lit8 v2, v1, 0xf

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    add-int/lit8 v2, v1, 0x11

    .line 26
    .line 27
    :cond_1
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 28
    .line 29
    array-length v4, v3

    .line 30
    if-le v2, v4, :cond_2

    .line 31
    .line 32
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 33
    .line 34
    .line 35
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 36
    .line 37
    :cond_2
    const/16 v2, 0x22

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    add-int/lit8 v4, v1, 0x1

    .line 42
    .line 43
    aput-char v2, v3, v1

    .line 44
    .line 45
    move v1, v4

    .line 46
    :cond_3
    invoke-static {v3, v1, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏哲兰世([CIF)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz v0, :cond_4

    .line 51
    .line 52
    add-int/lit8 v0, p1, 0x1

    .line 53
    .line 54
    aput-char v2, v3, p1

    .line 55
    .line 56
    move p1, v0

    .line 57
    :cond_4
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 58
    .line 59
    return-void
.end method

.method public final 飘花落叶言子哲兰楪世苏([D)V
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 8
    .line 9
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 12
    .line 13
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 14
    .line 15
    and-long/2addr v0, v2

    .line 16
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    cmp-long v0, v0, v2

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x1

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    move v0, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move v0, v1

    .line 27
    :goto_0
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 28
    .line 29
    array-length v4, p1

    .line 30
    const/16 v5, 0x1b

    .line 31
    .line 32
    invoke-static {v4, v5, v3, v2}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    iget-object v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 37
    .line 38
    array-length v6, v5

    .line 39
    if-le v4, v6, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 42
    .line 43
    .line 44
    iget-object v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 45
    .line 46
    :cond_2
    add-int/lit8 v4, v3, 0x1

    .line 47
    .line 48
    const/16 v6, 0x5b

    .line 49
    .line 50
    aput-char v6, v5, v3

    .line 51
    .line 52
    :goto_1
    array-length v3, p1

    .line 53
    if-ge v1, v3, :cond_6

    .line 54
    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    add-int/lit8 v3, v4, 0x1

    .line 58
    .line 59
    const/16 v6, 0x2c

    .line 60
    .line 61
    aput-char v6, v5, v4

    .line 62
    .line 63
    move v4, v3

    .line 64
    :cond_3
    const/16 v3, 0x22

    .line 65
    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    add-int/lit8 v6, v4, 0x1

    .line 69
    .line 70
    aput-char v3, v5, v4

    .line 71
    .line 72
    move v4, v6

    .line 73
    :cond_4
    aget-wide v6, p1, v1

    .line 74
    .line 75
    invoke-static {v5, v4, v6, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏世兰哲([CID)I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-eqz v0, :cond_5

    .line 80
    .line 81
    add-int/lit8 v6, v4, 0x1

    .line 82
    .line 83
    aput-char v3, v5, v4

    .line 84
    .line 85
    move v4, v6

    .line 86
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_6
    const/16 p1, 0x5d

    .line 90
    .line 91
    aput-char p1, v5, v4

    .line 92
    .line 93
    add-int/2addr v4, v2

    .line 94
    iput v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 95
    .line 96
    return-void
.end method

.method public final 飘花落叶言子哲兰苏世楪([B)V
    .locals 10

    .line 1
    array-length v0, p1

    .line 2
    mul-int/lit8 v0, v0, 0x2

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x3

    .line 5
    .line 6
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 7
    .line 8
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 9
    .line 10
    add-int/2addr v0, v1

    .line 11
    add-int/lit8 v0, v0, 0x2

    .line 12
    .line 13
    array-length v3, v2

    .line 14
    if-le v0, v3, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 20
    .line 21
    :cond_0
    const/16 v0, 0x78

    .line 22
    .line 23
    aput-char v0, v2, v1

    .line 24
    .line 25
    add-int/lit8 v0, v1, 0x1

    .line 26
    .line 27
    const/16 v3, 0x27

    .line 28
    .line 29
    aput-char v3, v2, v0

    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x2

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    :goto_0
    array-length v4, p1

    .line 35
    if-ge v0, v4, :cond_3

    .line 36
    .line 37
    aget-byte v4, p1, v0

    .line 38
    .line 39
    and-int/lit16 v5, v4, 0xff

    .line 40
    .line 41
    shr-int/lit8 v5, v5, 0x4

    .line 42
    .line 43
    and-int/lit8 v4, v4, 0xf

    .line 44
    .line 45
    const/16 v6, 0x37

    .line 46
    .line 47
    const/16 v7, 0x30

    .line 48
    .line 49
    const/16 v8, 0xa

    .line 50
    .line 51
    if-ge v5, v8, :cond_1

    .line 52
    .line 53
    move v9, v7

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move v9, v6

    .line 56
    :goto_1
    add-int/2addr v5, v9

    .line 57
    int-to-char v5, v5

    .line 58
    aput-char v5, v2, v1

    .line 59
    .line 60
    add-int/lit8 v5, v1, 0x1

    .line 61
    .line 62
    if-ge v4, v8, :cond_2

    .line 63
    .line 64
    move v6, v7

    .line 65
    :cond_2
    add-int/2addr v4, v6

    .line 66
    int-to-char v4, v4

    .line 67
    aput-char v4, v2, v5

    .line 68
    .line 69
    add-int/lit8 v1, v1, 0x2

    .line 70
    .line 71
    add-int/lit8 v0, v0, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    aput-char v3, v2, v1

    .line 75
    .line 76
    add-int/lit8 v1, v1, 0x1

    .line 77
    .line 78
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 79
    .line 80
    return-void
.end method

.method public final 飘花落叶言子哲兰苏楪世([F)V
    .locals 7

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰哲楪世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 8
    .line 9
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 12
    .line 13
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 14
    .line 15
    and-long/2addr v0, v2

    .line 16
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    cmp-long v0, v0, v2

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x1

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    move v0, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move v0, v1

    .line 27
    :goto_0
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 28
    .line 29
    array-length v4, p1

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    const/16 v5, 0x10

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    const/16 v5, 0x12

    .line 36
    .line 37
    :goto_1
    invoke-static {v4, v5, v3, v2}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    iget-object v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 42
    .line 43
    array-length v6, v5

    .line 44
    if-le v4, v6, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 47
    .line 48
    .line 49
    iget-object v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 50
    .line 51
    :cond_3
    add-int/lit8 v4, v3, 0x1

    .line 52
    .line 53
    const/16 v6, 0x5b

    .line 54
    .line 55
    aput-char v6, v5, v3

    .line 56
    .line 57
    :goto_2
    array-length v3, p1

    .line 58
    if-ge v1, v3, :cond_7

    .line 59
    .line 60
    if-eqz v1, :cond_4

    .line 61
    .line 62
    add-int/lit8 v3, v4, 0x1

    .line 63
    .line 64
    const/16 v6, 0x2c

    .line 65
    .line 66
    aput-char v6, v5, v4

    .line 67
    .line 68
    move v4, v3

    .line 69
    :cond_4
    const/16 v3, 0x22

    .line 70
    .line 71
    if-eqz v0, :cond_5

    .line 72
    .line 73
    add-int/lit8 v6, v4, 0x1

    .line 74
    .line 75
    aput-char v3, v5, v4

    .line 76
    .line 77
    move v4, v6

    .line 78
    :cond_5
    aget v6, p1, v1

    .line 79
    .line 80
    invoke-static {v5, v4, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏哲兰世([CIF)I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-eqz v0, :cond_6

    .line 85
    .line 86
    add-int/lit8 v6, v4, 0x1

    .line 87
    .line 88
    aput-char v3, v5, v4

    .line 89
    .line 90
    move v4, v6

    .line 91
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_7
    const/16 p1, 0x5d

    .line 95
    .line 96
    aput-char p1, v5, v4

    .line 97
    .line 98
    add-int/2addr v4, v2

    .line 99
    iput v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 100
    .line 101
    return-void
.end method

.method public final 飘花落叶言子哲楪世兰苏(Ljava/math/BigInteger;J)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲世楪苏()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/math/BigInteger;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const-wide/16 v0, 0x0

    .line 14
    .line 15
    cmp-long v0, p2, v0

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/math/BigInteger;->longValue()J

    .line 20
    .line 21
    .line 22
    move-result-wide p1

    .line 23
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子兰世楪苏哲(J)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    const/16 v0, 0xa

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 34
    .line 35
    iget-wide v1, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 36
    .line 37
    or-long/2addr p2, v1

    .line 38
    invoke-static {p1, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪兰哲苏(Ljava/math/BigInteger;J)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    iget p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 45
    .line 46
    .line 47
    move-result p3

    .line 48
    add-int v1, p2, p3

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    const/4 v3, 0x2

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    move v3, v2

    .line 56
    :goto_0
    add-int/2addr v1, v3

    .line 57
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 58
    .line 59
    array-length v4, v3

    .line 60
    if-le v1, v4, :cond_3

    .line 61
    .line 62
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 63
    .line 64
    .line 65
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 66
    .line 67
    :cond_3
    const/16 v1, 0x22

    .line 68
    .line 69
    if-eqz p1, :cond_4

    .line 70
    .line 71
    add-int/lit8 v4, p2, 0x1

    .line 72
    .line 73
    aput-char v1, v3, p2

    .line 74
    .line 75
    move p2, v4

    .line 76
    :cond_4
    invoke-virtual {v0, v2, p3, v3, p2}, Ljava/lang/String;->getChars(II[CI)V

    .line 77
    .line 78
    .line 79
    add-int/2addr p2, p3

    .line 80
    if-eqz p1, :cond_5

    .line 81
    .line 82
    add-int/lit8 p1, p2, 0x1

    .line 83
    .line 84
    aput-char v1, v3, p2

    .line 85
    .line 86
    move p2, p1

    .line 87
    :cond_5
    iput p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 88
    .line 89
    return-void
.end method

.method public final 飘花落叶言子哲楪世苏兰([B)V
    .locals 11

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰哲楪世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    array-length v0, p1

    .line 8
    add-int/lit8 v0, v0, -0x1

    .line 9
    .line 10
    div-int/lit8 v0, v0, 0x3

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    shl-int/2addr v0, v1

    .line 16
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 17
    .line 18
    add-int/2addr v0, v2

    .line 19
    add-int/2addr v0, v1

    .line 20
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 21
    .line 22
    array-length v3, v3

    .line 23
    if-le v0, v3, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 26
    .line 27
    .line 28
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 29
    .line 30
    add-int/lit8 v3, v2, 0x1

    .line 31
    .line 32
    iget-char v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 33
    .line 34
    aput-char v4, v0, v2

    .line 35
    .line 36
    array-length v2, p1

    .line 37
    div-int/lit8 v2, v2, 0x3

    .line 38
    .line 39
    mul-int/lit8 v2, v2, 0x3

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    move v6, v5

    .line 43
    :goto_0
    if-ge v6, v2, :cond_2

    .line 44
    .line 45
    add-int/lit8 v7, v6, 0x1

    .line 46
    .line 47
    aget-byte v8, p1, v6

    .line 48
    .line 49
    and-int/lit16 v8, v8, 0xff

    .line 50
    .line 51
    shl-int/lit8 v8, v8, 0x10

    .line 52
    .line 53
    add-int/lit8 v9, v6, 0x2

    .line 54
    .line 55
    aget-byte v7, p1, v7

    .line 56
    .line 57
    and-int/lit16 v7, v7, 0xff

    .line 58
    .line 59
    shl-int/lit8 v7, v7, 0x8

    .line 60
    .line 61
    or-int/2addr v7, v8

    .line 62
    add-int/lit8 v6, v6, 0x3

    .line 63
    .line 64
    aget-byte v8, p1, v9

    .line 65
    .line 66
    and-int/lit16 v8, v8, 0xff

    .line 67
    .line 68
    or-int/2addr v7, v8

    .line 69
    sget-object v8, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲世兰苏:[C

    .line 70
    .line 71
    ushr-int/lit8 v9, v7, 0x12

    .line 72
    .line 73
    and-int/lit8 v9, v9, 0x3f

    .line 74
    .line 75
    aget-char v9, v8, v9

    .line 76
    .line 77
    aput-char v9, v0, v3

    .line 78
    .line 79
    add-int/lit8 v9, v3, 0x1

    .line 80
    .line 81
    ushr-int/lit8 v10, v7, 0xc

    .line 82
    .line 83
    and-int/lit8 v10, v10, 0x3f

    .line 84
    .line 85
    aget-char v10, v8, v10

    .line 86
    .line 87
    aput-char v10, v0, v9

    .line 88
    .line 89
    add-int/lit8 v9, v3, 0x2

    .line 90
    .line 91
    ushr-int/lit8 v10, v7, 0x6

    .line 92
    .line 93
    and-int/lit8 v10, v10, 0x3f

    .line 94
    .line 95
    aget-char v10, v8, v10

    .line 96
    .line 97
    aput-char v10, v0, v9

    .line 98
    .line 99
    add-int/lit8 v9, v3, 0x3

    .line 100
    .line 101
    and-int/lit8 v7, v7, 0x3f

    .line 102
    .line 103
    aget-char v7, v8, v7

    .line 104
    .line 105
    aput-char v7, v0, v9

    .line 106
    .line 107
    add-int/lit8 v3, v3, 0x4

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_2
    array-length v6, p1

    .line 111
    sub-int/2addr v6, v2

    .line 112
    if-lez v6, :cond_5

    .line 113
    .line 114
    aget-byte v2, p1, v2

    .line 115
    .line 116
    and-int/lit16 v2, v2, 0xff

    .line 117
    .line 118
    shl-int/lit8 v2, v2, 0xa

    .line 119
    .line 120
    if-ne v6, v1, :cond_3

    .line 121
    .line 122
    array-length v5, p1

    .line 123
    add-int/lit8 v5, v5, -0x1

    .line 124
    .line 125
    aget-byte p1, p1, v5

    .line 126
    .line 127
    and-int/lit16 p1, p1, 0xff

    .line 128
    .line 129
    shl-int/lit8 v5, p1, 0x2

    .line 130
    .line 131
    :cond_3
    or-int p1, v2, v5

    .line 132
    .line 133
    sget-object v2, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲世兰苏:[C

    .line 134
    .line 135
    shr-int/lit8 v5, p1, 0xc

    .line 136
    .line 137
    aget-char v5, v2, v5

    .line 138
    .line 139
    aput-char v5, v0, v3

    .line 140
    .line 141
    add-int/lit8 v5, v3, 0x1

    .line 142
    .line 143
    ushr-int/lit8 v7, p1, 0x6

    .line 144
    .line 145
    and-int/lit8 v7, v7, 0x3f

    .line 146
    .line 147
    aget-char v7, v2, v7

    .line 148
    .line 149
    aput-char v7, v0, v5

    .line 150
    .line 151
    add-int/lit8 v5, v3, 0x2

    .line 152
    .line 153
    const/16 v7, 0x3d

    .line 154
    .line 155
    if-ne v6, v1, :cond_4

    .line 156
    .line 157
    and-int/lit8 p1, p1, 0x3f

    .line 158
    .line 159
    aget-char p1, v2, p1

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_4
    move p1, v7

    .line 163
    :goto_1
    aput-char p1, v0, v5

    .line 164
    .line 165
    add-int/lit8 p1, v3, 0x3

    .line 166
    .line 167
    aput-char v7, v0, p1

    .line 168
    .line 169
    add-int/lit8 v3, v3, 0x4

    .line 170
    .line 171
    :cond_5
    aput-char v4, v0, v3

    .line 172
    .line 173
    add-int/lit8 v3, v3, 0x1

    .line 174
    .line 175
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 176
    .line 177
    return-void
.end method

.method public 飘花落叶言子哲楪苏兰世(Z)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5

    .line 4
    .line 5
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 6
    .line 7
    array-length v2, v1

    .line 8
    if-le v0, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 14
    .line 15
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 16
    .line 17
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 18
    .line 19
    iget-wide v2, v2, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 20
    .line 21
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteBooleanAsNumber:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 22
    .line 23
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 24
    .line 25
    and-long/2addr v2, v4

    .line 26
    const-wide/16 v4, 0x0

    .line 27
    .line 28
    cmp-long v2, v2, v4

    .line 29
    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    add-int/lit8 v2, v0, 0x1

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    const/16 p1, 0x31

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/16 p1, 0x30

    .line 40
    .line 41
    :goto_0
    aput-char p1, v1, v0

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    const/16 v2, 0x65

    .line 45
    .line 46
    if-nez p1, :cond_3

    .line 47
    .line 48
    const/16 p1, 0x66

    .line 49
    .line 50
    aput-char p1, v1, v0

    .line 51
    .line 52
    add-int/lit8 p1, v0, 0x1

    .line 53
    .line 54
    const/16 v3, 0x61

    .line 55
    .line 56
    aput-char v3, v1, p1

    .line 57
    .line 58
    add-int/lit8 p1, v0, 0x2

    .line 59
    .line 60
    const/16 v3, 0x6c

    .line 61
    .line 62
    aput-char v3, v1, p1

    .line 63
    .line 64
    add-int/lit8 p1, v0, 0x3

    .line 65
    .line 66
    const/16 v3, 0x73

    .line 67
    .line 68
    aput-char v3, v1, p1

    .line 69
    .line 70
    add-int/lit8 p1, v0, 0x4

    .line 71
    .line 72
    aput-char v2, v1, p1

    .line 73
    .line 74
    add-int/lit8 v2, v0, 0x5

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    const/16 p1, 0x74

    .line 78
    .line 79
    aput-char p1, v1, v0

    .line 80
    .line 81
    add-int/lit8 p1, v0, 0x1

    .line 82
    .line 83
    const/16 v3, 0x72

    .line 84
    .line 85
    aput-char v3, v1, p1

    .line 86
    .line 87
    add-int/lit8 p1, v0, 0x2

    .line 88
    .line 89
    const/16 v3, 0x75

    .line 90
    .line 91
    aput-char v3, v1, p1

    .line 92
    .line 93
    add-int/lit8 p1, v0, 0x3

    .line 94
    .line 95
    aput-char v2, v1, p1

    .line 96
    .line 97
    add-int/lit8 v2, v0, 0x4

    .line 98
    .line 99
    :goto_1
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 100
    .line 101
    return-void
.end method

.method public final 飘花落叶言子哲苏世楪兰(Ljava/math/BigDecimal;JLjava/text/DecimalFormat;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲苏世兰楪()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    if-eqz v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪子世兰苏哲(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iget-object v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 24
    .line 25
    iget-wide v2, v2, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 26
    .line 27
    or-long v2, p2, v2

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/math/BigDecimal;->precision()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-static {v1, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪哲兰苏(Ljava/math/BigDecimal;J)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    iget v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 38
    .line 39
    add-int v7, v6, v4

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/math/BigDecimal;->scale()I

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    add-int/2addr v8, v7

    .line 50
    add-int/lit8 v8, v8, 0x7

    .line 51
    .line 52
    iget-object v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 53
    .line 54
    array-length v9, v7

    .line 55
    if-le v8, v9, :cond_2

    .line 56
    .line 57
    invoke-virtual {v0, v8}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 58
    .line 59
    .line 60
    iget-object v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 61
    .line 62
    :cond_2
    const/16 v8, 0x22

    .line 63
    .line 64
    if-eqz v5, :cond_3

    .line 65
    .line 66
    add-int/lit8 v9, v6, 0x1

    .line 67
    .line 68
    aput-char v8, v7, v6

    .line 69
    .line 70
    move v6, v9

    .line 71
    :cond_3
    sget-object v9, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteBigDecimalAsPlain:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 72
    .line 73
    iget-wide v9, v9, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 74
    .line 75
    and-long/2addr v2, v9

    .line 76
    const-wide/16 v9, 0x0

    .line 77
    .line 78
    cmp-long v2, v2, v9

    .line 79
    .line 80
    const/4 v11, 0x1

    .line 81
    if-eqz v2, :cond_4

    .line 82
    .line 83
    move v2, v11

    .line 84
    goto :goto_0

    .line 85
    :cond_4
    const/4 v2, 0x0

    .line 86
    :goto_0
    const/16 v12, 0x13

    .line 87
    .line 88
    if-ge v4, v12, :cond_c

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/math/BigDecimal;->scale()I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-ltz v4, :cond_c

    .line 95
    .line 96
    sget-wide v12, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世兰哲:J

    .line 97
    .line 98
    const-wide/16 v14, -0x1

    .line 99
    .line 100
    cmp-long v14, v12, v14

    .line 101
    .line 102
    if-eqz v14, :cond_c

    .line 103
    .line 104
    sget-object v14, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 105
    .line 106
    invoke-virtual {v14, v1, v12, v13}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 107
    .line 108
    .line 109
    move-result-wide v12

    .line 110
    const-wide/high16 v14, -0x8000000000000000L

    .line 111
    .line 112
    cmp-long v14, v12, v14

    .line 113
    .line 114
    if-eqz v14, :cond_c

    .line 115
    .line 116
    if-nez v2, :cond_c

    .line 117
    .line 118
    cmp-long v1, v12, v9

    .line 119
    .line 120
    if-gez v1, :cond_5

    .line 121
    .line 122
    add-int/lit8 v1, v6, 0x1

    .line 123
    .line 124
    const/16 v2, 0x2d

    .line 125
    .line 126
    invoke-static {v7, v6, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪世哲兰([CIC)V

    .line 127
    .line 128
    .line 129
    neg-long v12, v12

    .line 130
    move v6, v1

    .line 131
    :cond_5
    if-eqz v4, :cond_b

    .line 132
    .line 133
    invoke-static {v12, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏哲兰楪世(J)I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    sub-int v2, v1, v4

    .line 138
    .line 139
    const/16 v9, 0x2e

    .line 140
    .line 141
    const/16 v10, 0x30

    .line 142
    .line 143
    if-nez v2, :cond_6

    .line 144
    .line 145
    add-int/lit8 v1, v6, 0x1

    .line 146
    .line 147
    aput-char v10, v7, v6

    .line 148
    .line 149
    add-int/lit8 v6, v6, 0x2

    .line 150
    .line 151
    aput-char v9, v7, v1

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_6
    if-gez v2, :cond_7

    .line 155
    .line 156
    add-int/lit8 v1, v6, 0x1

    .line 157
    .line 158
    aput-char v10, v7, v6

    .line 159
    .line 160
    add-int/lit8 v6, v6, 0x2

    .line 161
    .line 162
    aput-char v9, v7, v1

    .line 163
    .line 164
    const/4 v3, 0x0

    .line 165
    :goto_1
    neg-int v1, v2

    .line 166
    if-ge v3, v1, :cond_b

    .line 167
    .line 168
    add-int/lit8 v1, v6, 0x1

    .line 169
    .line 170
    invoke-static {v7, v6, v10}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪世哲兰([CIC)V

    .line 171
    .line 172
    .line 173
    add-int/lit8 v3, v3, 0x1

    .line 174
    .line 175
    move v6, v1

    .line 176
    goto :goto_1

    .line 177
    :cond_7
    sget-object v14, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰世苏哲:[J

    .line 178
    .line 179
    add-int/lit8 v15, v4, -0x1

    .line 180
    .line 181
    aget-wide v15, v14, v15

    .line 182
    .line 183
    move/from16 p2, v4

    .line 184
    .line 185
    div-long v3, v12, v15

    .line 186
    .line 187
    mul-long/2addr v15, v3

    .line 188
    sub-long/2addr v12, v15

    .line 189
    invoke-static {v7, v6, v3, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲楪苏兰世([CIJ)I

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    invoke-static {v7, v3, v9}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪世哲兰([CIC)V

    .line 194
    .line 195
    .line 196
    const/4 v4, 0x2

    .line 197
    move/from16 v6, p2

    .line 198
    .line 199
    if-ne v6, v11, :cond_8

    .line 200
    .line 201
    add-int/lit8 v1, v3, 0x1

    .line 202
    .line 203
    const-wide/16 v9, 0x30

    .line 204
    .line 205
    add-long/2addr v12, v9

    .line 206
    long-to-int v2, v12

    .line 207
    int-to-char v2, v2

    .line 208
    invoke-static {v7, v1, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪世哲兰([CIC)V

    .line 209
    .line 210
    .line 211
    add-int/2addr v3, v4

    .line 212
    goto :goto_5

    .line 213
    :cond_8
    if-ne v6, v4, :cond_9

    .line 214
    .line 215
    add-int/lit8 v1, v3, 0x1

    .line 216
    .line 217
    long-to-int v2, v12

    .line 218
    invoke-static {v1, v2, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 219
    .line 220
    .line 221
    add-int/lit8 v3, v3, 0x3

    .line 222
    .line 223
    goto :goto_5

    .line 224
    :cond_9
    invoke-static {v12, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏哲兰楪世(J)I

    .line 225
    .line 226
    .line 227
    move-result v4

    .line 228
    sub-int/2addr v1, v4

    .line 229
    sub-int/2addr v1, v2

    .line 230
    move v2, v3

    .line 231
    const/4 v3, 0x0

    .line 232
    :goto_2
    if-ge v3, v1, :cond_a

    .line 233
    .line 234
    add-int/lit8 v2, v2, 0x1

    .line 235
    .line 236
    invoke-static {v7, v2, v10}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪世哲兰([CIC)V

    .line 237
    .line 238
    .line 239
    add-int/lit8 v3, v3, 0x1

    .line 240
    .line 241
    goto :goto_2

    .line 242
    :cond_a
    add-int/2addr v2, v11

    .line 243
    invoke-static {v7, v2, v12, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲楪苏兰世([CIJ)I

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    goto :goto_5

    .line 248
    :cond_b
    :goto_3
    invoke-static {v7, v6, v12, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲楪苏兰世([CIJ)I

    .line 249
    .line 250
    .line 251
    move-result v3

    .line 252
    goto :goto_5

    .line 253
    :cond_c
    if-eqz v2, :cond_d

    .line 254
    .line 255
    invoke-virtual {v1}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    goto :goto_4

    .line 260
    :cond_d
    invoke-virtual {v1}, Ljava/math/BigDecimal;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    :goto_4
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 265
    .line 266
    .line 267
    move-result v2

    .line 268
    const/4 v3, 0x0

    .line 269
    invoke-virtual {v1, v3, v2, v7, v6}, Ljava/lang/String;->getChars(II[CI)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    add-int v3, v1, v6

    .line 277
    .line 278
    :goto_5
    if-eqz v5, :cond_e

    .line 279
    .line 280
    add-int/lit8 v1, v3, 0x1

    .line 281
    .line 282
    aput-char v8, v7, v3

    .line 283
    .line 284
    move v3, v1

    .line 285
    :cond_e
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 286
    .line 287
    return-void
.end method

.method public final 飘花落叶言子哲苏兰楪世(D)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 6
    .line 7
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 8
    .line 9
    and-long/2addr v0, v2

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 20
    .line 21
    add-int/lit8 v2, v1, 0x18

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    add-int/lit8 v2, v1, 0x1a

    .line 26
    .line 27
    :cond_1
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 28
    .line 29
    array-length v4, v3

    .line 30
    if-le v2, v4, :cond_2

    .line 31
    .line 32
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 33
    .line 34
    .line 35
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 36
    .line 37
    :cond_2
    const/16 v2, 0x22

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    add-int/lit8 v4, v1, 0x1

    .line 42
    .line 43
    aput-char v2, v3, v1

    .line 44
    .line 45
    move v1, v4

    .line 46
    :cond_3
    invoke-static {v3, v1, p1, p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏世兰哲([CID)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz v0, :cond_4

    .line 51
    .line 52
    add-int/lit8 p2, p1, 0x1

    .line 53
    .line 54
    aput-char v2, v3, p1

    .line 55
    .line 56
    move p1, p2

    .line 57
    :cond_4
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 58
    .line 59
    return-void
.end method

.method public final 飘花落叶言子哲苏楪世兰(III)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0xd

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-le v1, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 14
    .line 15
    :cond_0
    add-int/lit8 v1, v0, 0x1

    .line 16
    .line 17
    iget-char v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 18
    .line 19
    aput-char v3, v2, v0

    .line 20
    .line 21
    invoke-static {v2, v1, p1, p2, p3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲世苏兰楪([CIIII)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    aput-char v3, v2, p1

    .line 26
    .line 27
    add-int/lit8 p1, p1, 0x1

    .line 28
    .line 29
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 30
    .line 31
    return-void
.end method

.method public final 飘花落叶言子哲苏楪兰世(III)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0xa

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-le v1, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 14
    .line 15
    :cond_0
    iget-char v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 16
    .line 17
    aput-char v3, v2, v0

    .line 18
    .line 19
    if-ltz p1, :cond_1

    .line 20
    .line 21
    const/16 v4, 0x270f

    .line 22
    .line 23
    if-gt p1, v4, :cond_1

    .line 24
    .line 25
    div-int/lit8 v4, p1, 0x64

    .line 26
    .line 27
    mul-int/lit8 v5, v4, 0x64

    .line 28
    .line 29
    sub-int/2addr p1, v5

    .line 30
    add-int/lit8 v5, v0, 0x1

    .line 31
    .line 32
    invoke-static {v5, v4, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 33
    .line 34
    .line 35
    add-int/lit8 v4, v0, 0x3

    .line 36
    .line 37
    invoke-static {v4, p1, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 38
    .line 39
    .line 40
    add-int/lit8 p1, v0, 0x5

    .line 41
    .line 42
    invoke-static {p1, p2, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 43
    .line 44
    .line 45
    add-int/lit8 p1, v0, 0x7

    .line 46
    .line 47
    invoke-static {p1, p3, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 48
    .line 49
    .line 50
    add-int/lit8 v0, v0, 0x9

    .line 51
    .line 52
    aput-char v3, v2, v0

    .line 53
    .line 54
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 55
    .line 56
    return-void

    .line 57
    :cond_1
    invoke-static {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏兰世哲(I)Ljava/lang/IllegalArgumentException;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    throw p0
.end method

.method public final 飘花落叶言子楪世兰哲苏()V
    .locals 6

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰哲苏世:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰哲苏世:I

    .line 6
    .line 7
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 8
    .line 9
    add-int/lit8 v2, v1, 0x1

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    iget-byte v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪兰哲苏:B

    .line 13
    .line 14
    if-nez v4, :cond_0

    .line 15
    .line 16
    move v0, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    mul-int/2addr v0, v4

    .line 19
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    :goto_0
    add-int/2addr v2, v0

    .line 22
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 23
    .line 24
    array-length v5, v0

    .line 25
    if-le v2, v5, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 31
    .line 32
    :cond_1
    if-eqz v4, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0, v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世苏子哲兰(I[C)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    :cond_2
    const/16 v2, 0x7d

    .line 39
    .line 40
    aput-char v2, v0, v1

    .line 41
    .line 42
    add-int/lit8 v1, v1, 0x1

    .line 43
    .line 44
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 45
    .line 46
    iput-boolean v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰哲世苏:Z

    .line 47
    .line 48
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰()V
    .locals 6

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰哲苏世:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰哲苏世:I

    .line 6
    .line 7
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 8
    .line 9
    add-int/lit8 v2, v1, 0x1

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    iget-byte v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪兰哲苏:B

    .line 13
    .line 14
    if-nez v4, :cond_0

    .line 15
    .line 16
    move v0, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    mul-int/2addr v0, v4

    .line 19
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    :goto_0
    add-int/2addr v2, v0

    .line 22
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 23
    .line 24
    array-length v5, v0

    .line 25
    if-le v2, v5, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 31
    .line 32
    :cond_1
    if-eqz v4, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0, v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世苏子哲兰(I[C)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    :cond_2
    const/16 v2, 0x5d

    .line 39
    .line 40
    aput-char v2, v0, v1

    .line 41
    .line 42
    add-int/lit8 v1, v1, 0x1

    .line 43
    .line 44
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 45
    .line 46
    iput-boolean v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰哲世苏:Z

    .line 47
    .line 48
    return-void
.end method

.method public final 飘花落叶言子苏兰世楪哲(Ljava/util/Map;)V
    .locals 13

    .line 1
    iget-byte v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪兰哲苏:B

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-super/range {p0 .. p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰世楪哲(Ljava/util/Map;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子兰哲楪苏世()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    iget-object v7, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 16
    .line 17
    iget-wide v2, v7, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 18
    .line 19
    sget-wide v4, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世苏楪兰哲:J

    .line 20
    .line 21
    and-long/2addr v2, v4

    .line 22
    const-wide/16 v8, 0x0

    .line 23
    .line 24
    cmp-long v0, v2, v8

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v7, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const/4 v4, 0x0

    .line 37
    const-wide/16 v5, 0x0

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    move-object v1, p0

    .line 41
    move-object v2, p1

    .line 42
    invoke-interface/range {v0 .. v6}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    const/16 v0, 0x7b

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪子世苏兰哲(C)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    const/4 v0, 0x1

    .line 60
    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_e

    .line 65
    .line 66
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Ljava/util/Map$Entry;

    .line 71
    .line 72
    move-object v3, v2

    .line 73
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    if-nez v2, :cond_3

    .line 78
    .line 79
    iget-wide v4, v7, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 80
    .line 81
    sget-object v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteMapNullValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 82
    .line 83
    iget-wide v11, v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 84
    .line 85
    and-long/2addr v4, v11

    .line 86
    cmp-long v4, v4, v8

    .line 87
    .line 88
    if-nez v4, :cond_3

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_3
    if-nez v0, :cond_4

    .line 92
    .line 93
    const/16 v0, 0x2c

    .line 94
    .line 95
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪子世苏兰哲(C)V

    .line 96
    .line 97
    .line 98
    :cond_4
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    instance-of v3, v0, Ljava/lang/String;

    .line 103
    .line 104
    if-eqz v3, :cond_5

    .line 105
    .line 106
    check-cast v0, Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_5
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰世哲楪(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :goto_1
    const/16 v0, 0x3a

    .line 116
    .line 117
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪子世苏兰哲(C)V

    .line 118
    .line 119
    .line 120
    if-nez v2, :cond_6

    .line 121
    .line 122
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子兰哲楪苏世()V

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    const-class v3, Ljava/lang/String;

    .line 131
    .line 132
    if-ne v0, v3, :cond_7

    .line 133
    .line 134
    check-cast v2, Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_7
    const-class v3, Ljava/lang/Integer;

    .line 141
    .line 142
    if-ne v0, v3, :cond_8

    .line 143
    .line 144
    check-cast v2, Ljava/lang/Integer;

    .line 145
    .line 146
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子兰楪哲世苏(Ljava/lang/Integer;)V

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_8
    const-class v3, Ljava/lang/Long;

    .line 151
    .line 152
    if-ne v0, v3, :cond_9

    .line 153
    .line 154
    check-cast v2, Ljava/lang/Long;

    .line 155
    .line 156
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子兰世楪哲苏(Ljava/lang/Long;)V

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_9
    const-class v3, Ljava/lang/Boolean;

    .line 161
    .line 162
    if-ne v0, v3, :cond_a

    .line 163
    .line 164
    check-cast v2, Ljava/lang/Boolean;

    .line 165
    .line 166
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子哲楪苏兰世(Z)V

    .line 171
    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_a
    const-class v3, Ljava/math/BigDecimal;

    .line 175
    .line 176
    if-ne v0, v3, :cond_b

    .line 177
    .line 178
    check-cast v2, Ljava/math/BigDecimal;

    .line 179
    .line 180
    const/4 v0, 0x0

    .line 181
    invoke-virtual {p0, v2, v8, v9, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子哲苏世楪兰(Ljava/math/BigDecimal;JLjava/text/DecimalFormat;)V

    .line 182
    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_b
    const-class v3, Lcom/alibaba/fastjson2/JSONArray;

    .line 186
    .line 187
    if-ne v0, v3, :cond_c

    .line 188
    .line 189
    check-cast v2, Lcom/alibaba/fastjson2/JSONArray;

    .line 190
    .line 191
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子苏兰楪哲世(Ljava/util/List;)V

    .line 192
    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_c
    const-class v3, Lcom/alibaba/fastjson2/JSONObject;

    .line 196
    .line 197
    if-ne v0, v3, :cond_d

    .line 198
    .line 199
    check-cast v2, Lcom/alibaba/fastjson2/JSONObject;

    .line 200
    .line 201
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子苏兰世楪哲(Ljava/util/Map;)V

    .line 202
    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_d
    invoke-virtual {v7, v0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    const/4 v4, 0x0

    .line 210
    const-wide/16 v5, 0x0

    .line 211
    .line 212
    const/4 v3, 0x0

    .line 213
    move-object v1, p0

    .line 214
    invoke-interface/range {v0 .. v6}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 215
    .line 216
    .line 217
    :goto_2
    const/4 v0, 0x0

    .line 218
    goto/16 :goto_0

    .line 219
    .line 220
    :cond_e
    const/16 v0, 0x7d

    .line 221
    .line 222
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪子世苏兰哲(C)V

    .line 223
    .line 224
    .line 225
    return-void
.end method

.method public final 飘花落叶言子苏兰楪世哲()V
    .locals 5

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰哲苏世:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰哲苏世:I

    .line 6
    .line 7
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 8
    .line 9
    iget v2, v2, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲兰苏:I

    .line 10
    .line 11
    if-gt v0, v2, :cond_2

    .line 12
    .line 13
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰哲世苏:Z

    .line 14
    .line 15
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 16
    .line 17
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 18
    .line 19
    add-int/lit8 v3, v1, 0x3

    .line 20
    .line 21
    iget-byte v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪兰哲苏:B

    .line 22
    .line 23
    mul-int/2addr v0, v4

    .line 24
    add-int/2addr v0, v3

    .line 25
    array-length v3, v2

    .line 26
    if-le v0, v3, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 32
    .line 33
    :cond_0
    add-int/lit8 v0, v1, 0x1

    .line 34
    .line 35
    const/16 v3, 0x7b

    .line 36
    .line 37
    aput-char v3, v2, v1

    .line 38
    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0, v0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世苏子哲兰(I[C)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    :cond_1
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏世哲楪兰()V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    throw p0
.end method

.method public final 飘花落叶言子苏兰楪哲世(Ljava/util/List;)V
    .locals 13

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->ReferenceDetection:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 2
    .line 3
    iget-wide v2, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 4
    .line 5
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->PrettyFormat:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 6
    .line 7
    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 8
    .line 9
    or-long/2addr v2, v4

    .line 10
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteEmptyArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 11
    .line 12
    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 13
    .line 14
    or-long/2addr v2, v4

    .line 15
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 16
    .line 17
    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 18
    .line 19
    or-long/2addr v2, v4

    .line 20
    iget-object v7, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 21
    .line 22
    iget-wide v4, v7, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 23
    .line 24
    and-long/2addr v2, v4

    .line 25
    const-wide/16 v8, 0x0

    .line 26
    .line 27
    cmp-long v0, v2, v8

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v7, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/4 v4, 0x0

    .line 40
    const-wide/16 v5, 0x0

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    move-object v1, p0

    .line 44
    move-object v2, p1

    .line 45
    invoke-interface/range {v0 .. v6}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 50
    .line 51
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 52
    .line 53
    array-length v2, v2

    .line 54
    const/4 v10, 0x1

    .line 55
    if-ne v0, v2, :cond_1

    .line 56
    .line 57
    add-int/2addr v0, v10

    .line 58
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 59
    .line 60
    .line 61
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 62
    .line 63
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 64
    .line 65
    add-int/lit8 v3, v2, 0x1

    .line 66
    .line 67
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 68
    .line 69
    const/16 v3, 0x5b

    .line 70
    .line 71
    aput-char v3, v0, v2

    .line 72
    .line 73
    const/4 v11, 0x0

    .line 74
    move v0, v10

    .line 75
    move v12, v11

    .line 76
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-ge v12, v2, :cond_c

    .line 81
    .line 82
    invoke-interface {p1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    if-nez v0, :cond_3

    .line 87
    .line 88
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 89
    .line 90
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 91
    .line 92
    array-length v3, v3

    .line 93
    if-ne v0, v3, :cond_2

    .line 94
    .line 95
    add-int/lit8 v0, v0, 0x1

    .line 96
    .line 97
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 98
    .line 99
    .line 100
    :cond_2
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 101
    .line 102
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 103
    .line 104
    add-int/lit8 v4, v3, 0x1

    .line 105
    .line 106
    iput v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 107
    .line 108
    const/16 v4, 0x2c

    .line 109
    .line 110
    aput-char v4, v0, v3

    .line 111
    .line 112
    :cond_3
    if-nez v2, :cond_4

    .line 113
    .line 114
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子兰哲楪苏世()V

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    const-class v3, Ljava/lang/String;

    .line 123
    .line 124
    if-ne v0, v3, :cond_5

    .line 125
    .line 126
    check-cast v2, Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_5
    const-class v3, Ljava/lang/Integer;

    .line 133
    .line 134
    if-ne v0, v3, :cond_6

    .line 135
    .line 136
    check-cast v2, Ljava/lang/Integer;

    .line 137
    .line 138
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子兰楪哲世苏(Ljava/lang/Integer;)V

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_6
    const-class v3, Ljava/lang/Long;

    .line 143
    .line 144
    if-ne v0, v3, :cond_7

    .line 145
    .line 146
    check-cast v2, Ljava/lang/Long;

    .line 147
    .line 148
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子兰世楪哲苏(Ljava/lang/Long;)V

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_7
    const-class v3, Ljava/lang/Boolean;

    .line 153
    .line 154
    if-ne v0, v3, :cond_8

    .line 155
    .line 156
    check-cast v2, Ljava/lang/Boolean;

    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子哲楪苏兰世(Z)V

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_8
    const-class v3, Ljava/math/BigDecimal;

    .line 167
    .line 168
    if-ne v0, v3, :cond_9

    .line 169
    .line 170
    check-cast v2, Ljava/math/BigDecimal;

    .line 171
    .line 172
    const/4 v0, 0x0

    .line 173
    invoke-virtual {p0, v2, v8, v9, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子哲苏世楪兰(Ljava/math/BigDecimal;JLjava/text/DecimalFormat;)V

    .line 174
    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_9
    const-class v3, Lcom/alibaba/fastjson2/JSONArray;

    .line 178
    .line 179
    if-ne v0, v3, :cond_a

    .line 180
    .line 181
    check-cast v2, Lcom/alibaba/fastjson2/JSONArray;

    .line 182
    .line 183
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子苏兰楪哲世(Ljava/util/List;)V

    .line 184
    .line 185
    .line 186
    goto :goto_1

    .line 187
    :cond_a
    const-class v3, Lcom/alibaba/fastjson2/JSONObject;

    .line 188
    .line 189
    if-ne v0, v3, :cond_b

    .line 190
    .line 191
    check-cast v2, Lcom/alibaba/fastjson2/JSONObject;

    .line 192
    .line 193
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子苏兰世楪哲(Ljava/util/Map;)V

    .line 194
    .line 195
    .line 196
    goto :goto_1

    .line 197
    :cond_b
    invoke-virtual {v7, v0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Class;)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    const/4 v4, 0x0

    .line 202
    const-wide/16 v5, 0x0

    .line 203
    .line 204
    const/4 v3, 0x0

    .line 205
    move-object v1, p0

    .line 206
    invoke-interface/range {v0 .. v6}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 207
    .line 208
    .line 209
    :goto_1
    add-int/lit8 v12, v12, 0x1

    .line 210
    .line 211
    move v0, v11

    .line 212
    goto/16 :goto_0

    .line 213
    .line 214
    :cond_c
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 215
    .line 216
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 217
    .line 218
    array-length v2, v2

    .line 219
    if-ne v0, v2, :cond_d

    .line 220
    .line 221
    add-int/2addr v0, v10

    .line 222
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 223
    .line 224
    .line 225
    :cond_d
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 226
    .line 227
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 228
    .line 229
    add-int/lit8 v3, v2, 0x1

    .line 230
    .line 231
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 232
    .line 233
    const/16 v1, 0x5d

    .line 234
    .line 235
    aput-char v1, v0, v2

    .line 236
    .line 237
    return-void
.end method

.method public final 飘花落叶言子苏哲兰楪世()V
    .locals 5

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰哲苏世:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰哲苏世:I

    .line 6
    .line 7
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 8
    .line 9
    iget v1, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲兰苏:I

    .line 10
    .line 11
    if-gt v0, v1, :cond_2

    .line 12
    .line 13
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 14
    .line 15
    add-int/lit8 v2, v1, 0x3

    .line 16
    .line 17
    iget-byte v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪兰哲苏:B

    .line 18
    .line 19
    mul-int/2addr v0, v3

    .line 20
    add-int/2addr v0, v2

    .line 21
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 22
    .line 23
    array-length v4, v2

    .line 24
    if-le v0, v4, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 30
    .line 31
    :cond_0
    add-int/lit8 v0, v1, 0x1

    .line 32
    .line 33
    const/16 v4, 0x5b

    .line 34
    .line 35
    aput-char v4, v2, v1

    .line 36
    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0, v0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世苏子哲兰(I[C)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    :cond_1
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏世哲楪兰()V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    throw p0
.end method

.method public final 飘花落叶言楪世子兰哲苏(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    invoke-virtual {p0, p1, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏楪哲兰世(II)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([CI)[C

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 13
    .line 14
    return-void
.end method

.method public final 飘花落叶言楪世子哲兰苏(Ljava/time/ZonedDateTime;)V
    .locals 14

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/time/ZonedDateTime;->getZone()Ljava/time/ZoneId;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/time/ZoneId;->getId()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    sget-object v3, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 20
    .line 21
    const/16 v4, 0x2d

    .line 22
    .line 23
    const/16 v5, 0x2b

    .line 24
    .line 25
    const-string v6, "Z"

    .line 26
    .line 27
    const/4 v7, 0x0

    .line 28
    const/4 v8, 0x1

    .line 29
    if-eq v3, v0, :cond_5

    .line 30
    .line 31
    const/4 v0, 0x3

    .line 32
    if-gt v2, v0, :cond_1

    .line 33
    .line 34
    const-string v0, "UTC"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_5

    .line 41
    .line 42
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    if-eqz v2, :cond_3

    .line 50
    .line 51
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eq v0, v5, :cond_2

    .line 56
    .line 57
    if-ne v0, v4, :cond_4

    .line 58
    .line 59
    :cond_2
    move v3, v2

    .line 60
    goto :goto_1

    .line 61
    :cond_3
    move v0, v7

    .line 62
    :cond_4
    add-int/lit8 v3, v2, 0x2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_5
    :goto_0
    move-object v1, v6

    .line 66
    move v0, v7

    .line 67
    move v3, v8

    .line 68
    :goto_1
    iget v6, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 69
    .line 70
    add-int v9, v6, v3

    .line 71
    .line 72
    add-int/lit8 v9, v9, 0x26

    .line 73
    .line 74
    iget-object v10, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 75
    .line 76
    array-length v11, v10

    .line 77
    if-le v9, v11, :cond_6

    .line 78
    .line 79
    invoke-virtual {p0, v9}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 80
    .line 81
    .line 82
    iget-object v10, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 83
    .line 84
    :cond_6
    iget-char v9, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 85
    .line 86
    aput-char v9, v10, v6

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/time/ZonedDateTime;->toLocalDate()Ljava/time/LocalDate;

    .line 89
    .line 90
    .line 91
    move-result-object v11

    .line 92
    add-int/2addr v6, v8

    .line 93
    invoke-virtual {v11}, Ljava/time/LocalDate;->getYear()I

    .line 94
    .line 95
    .line 96
    move-result v12

    .line 97
    invoke-virtual {v11}, Ljava/time/LocalDate;->getMonthValue()I

    .line 98
    .line 99
    .line 100
    move-result v13

    .line 101
    invoke-virtual {v11}, Ljava/time/LocalDate;->getDayOfMonth()I

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    invoke-static {v10, v6, v12, v13, v11}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲世苏兰楪([CIIII)I

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    const/16 v11, 0x54

    .line 110
    .line 111
    aput-char v11, v10, v6

    .line 112
    .line 113
    add-int/2addr v6, v8

    .line 114
    invoke-virtual {p1}, Ljava/time/ZonedDateTime;->toLocalTime()Ljava/time/LocalTime;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {v10, v6, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲世兰苏楪([CILjava/time/LocalTime;)I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-ne v3, v8, :cond_7

    .line 123
    .line 124
    add-int/lit8 v0, p1, 0x1

    .line 125
    .line 126
    const/16 v1, 0x5a

    .line 127
    .line 128
    aput-char v1, v10, p1

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_7
    if-eq v0, v5, :cond_9

    .line 132
    .line 133
    if-ne v0, v4, :cond_8

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_8
    add-int/lit8 v0, p1, 0x1

    .line 137
    .line 138
    const/16 v3, 0x5b

    .line 139
    .line 140
    aput-char v3, v10, p1

    .line 141
    .line 142
    invoke-virtual {v1, v7, v2, v10, v0}, Ljava/lang/String;->getChars(II[CI)V

    .line 143
    .line 144
    .line 145
    add-int/2addr v0, v2

    .line 146
    add-int/lit8 p1, v0, 0x1

    .line 147
    .line 148
    const/16 v1, 0x5d

    .line 149
    .line 150
    aput-char v1, v10, v0

    .line 151
    .line 152
    move v0, p1

    .line 153
    goto :goto_3

    .line 154
    :cond_9
    :goto_2
    invoke-virtual {v1, v7, v2, v10, p1}, Ljava/lang/String;->getChars(II[CI)V

    .line 155
    .line 156
    .line 157
    add-int v0, p1, v2

    .line 158
    .line 159
    :goto_3
    aput-char v9, v10, v0

    .line 160
    .line 161
    add-int/2addr v0, v8

    .line 162
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 163
    .line 164
    return-void
.end method

.method public final 飘花落叶言楪世子哲苏兰(Ljava/util/UUID;)V
    .locals 14

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/util/UUID;->getMostSignificantBits()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-virtual {p1}, Ljava/util/UUID;->getLeastSignificantBits()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 16
    .line 17
    add-int/lit8 p1, p1, 0x26

    .line 18
    .line 19
    iget-object v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 20
    .line 21
    array-length v5, v4

    .line 22
    if-le p1, v5, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 25
    .line 26
    .line 27
    iget-object v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 28
    .line 29
    :cond_1
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 30
    .line 31
    const/16 v5, 0x22

    .line 32
    .line 33
    aput-char v5, v4, p1

    .line 34
    .line 35
    add-int/lit8 v6, p1, 0x1

    .line 36
    .line 37
    const/16 v7, 0x38

    .line 38
    .line 39
    shr-long v8, v0, v7

    .line 40
    .line 41
    long-to-int v8, v8

    .line 42
    const/16 v9, 0x30

    .line 43
    .line 44
    shr-long v10, v0, v9

    .line 45
    .line 46
    long-to-int v10, v10

    .line 47
    invoke-static {v6, v8, v4, v10}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世苏子兰哲(II[CI)V

    .line 48
    .line 49
    .line 50
    add-int/lit8 v6, p1, 0x5

    .line 51
    .line 52
    const/16 v8, 0x28

    .line 53
    .line 54
    shr-long v10, v0, v8

    .line 55
    .line 56
    long-to-int v10, v10

    .line 57
    const/16 v11, 0x20

    .line 58
    .line 59
    shr-long v12, v0, v11

    .line 60
    .line 61
    long-to-int v12, v12

    .line 62
    invoke-static {v6, v10, v4, v12}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世苏子兰哲(II[CI)V

    .line 63
    .line 64
    .line 65
    add-int/lit8 v6, p1, 0x9

    .line 66
    .line 67
    const/16 v10, 0x2d

    .line 68
    .line 69
    aput-char v10, v4, v6

    .line 70
    .line 71
    add-int/lit8 v6, p1, 0xa

    .line 72
    .line 73
    long-to-int v0, v0

    .line 74
    shr-int/lit8 v1, v0, 0x18

    .line 75
    .line 76
    shr-int/lit8 v12, v0, 0x10

    .line 77
    .line 78
    invoke-static {v6, v1, v4, v12}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世苏子兰哲(II[CI)V

    .line 79
    .line 80
    .line 81
    add-int/lit8 v1, p1, 0xe

    .line 82
    .line 83
    aput-char v10, v4, v1

    .line 84
    .line 85
    add-int/lit8 v1, p1, 0xf

    .line 86
    .line 87
    shr-int/lit8 v6, v0, 0x8

    .line 88
    .line 89
    invoke-static {v1, v6, v4, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世苏子兰哲(II[CI)V

    .line 90
    .line 91
    .line 92
    add-int/lit8 v0, p1, 0x13

    .line 93
    .line 94
    aput-char v10, v4, v0

    .line 95
    .line 96
    add-int/lit8 v0, p1, 0x14

    .line 97
    .line 98
    shr-long v6, v2, v7

    .line 99
    .line 100
    long-to-int v1, v6

    .line 101
    shr-long v6, v2, v9

    .line 102
    .line 103
    long-to-int v6, v6

    .line 104
    invoke-static {v0, v1, v4, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世苏子兰哲(II[CI)V

    .line 105
    .line 106
    .line 107
    add-int/lit8 v0, p1, 0x18

    .line 108
    .line 109
    aput-char v10, v4, v0

    .line 110
    .line 111
    add-int/lit8 v0, p1, 0x19

    .line 112
    .line 113
    shr-long v6, v2, v8

    .line 114
    .line 115
    long-to-int v1, v6

    .line 116
    shr-long v6, v2, v11

    .line 117
    .line 118
    long-to-int v6, v6

    .line 119
    invoke-static {v0, v1, v4, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世苏子兰哲(II[CI)V

    .line 120
    .line 121
    .line 122
    add-int/lit8 v0, p1, 0x1d

    .line 123
    .line 124
    long-to-int v1, v2

    .line 125
    shr-int/lit8 v2, v1, 0x18

    .line 126
    .line 127
    shr-int/lit8 v3, v1, 0x10

    .line 128
    .line 129
    invoke-static {v0, v2, v4, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世苏子兰哲(II[CI)V

    .line 130
    .line 131
    .line 132
    add-int/lit8 v0, p1, 0x21

    .line 133
    .line 134
    shr-int/lit8 v2, v1, 0x8

    .line 135
    .line 136
    invoke-static {v0, v2, v4, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世苏子兰哲(II[CI)V

    .line 137
    .line 138
    .line 139
    add-int/lit8 p1, p1, 0x25

    .line 140
    .line 141
    aput-char v5, v4, p1

    .line 142
    .line 143
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 144
    .line 145
    add-int/lit8 p1, p1, 0x26

    .line 146
    .line 147
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 148
    .line 149
    return-void
.end method

.method public final 飘花落叶言楪世苏兰哲子([B)V
    .locals 13

    .line 1
    array-length v0, p1

    .line 2
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 3
    .line 4
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 5
    .line 6
    iget-wide v2, v2, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 7
    .line 8
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->EscapeNoneAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 9
    .line 10
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 11
    .line 12
    and-long/2addr v4, v2

    .line 13
    const-wide/16 v6, 0x0

    .line 14
    .line 15
    cmp-long v4, v4, v6

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    const/4 v8, 0x1

    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    move v4, v8

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v4, v5

    .line 24
    :goto_0
    sget-object v9, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BrowserSecure:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 25
    .line 26
    iget-wide v9, v9, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 27
    .line 28
    and-long/2addr v2, v9

    .line 29
    cmp-long v2, v2, v6

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    move v2, v8

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v2, v5

    .line 36
    :goto_1
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 37
    .line 38
    const/4 v6, 0x6

    .line 39
    const/4 v7, 0x2

    .line 40
    invoke-static {v0, v6, v3, v7}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    iget-object v7, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 45
    .line 46
    array-length v7, v7

    .line 47
    if-le v6, v7, :cond_2

    .line 48
    .line 49
    invoke-virtual {p0, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 50
    .line 51
    .line 52
    :cond_2
    iget-object v6, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 53
    .line 54
    add-int/lit8 v7, v3, 0x1

    .line 55
    .line 56
    aput-char v1, v6, v3

    .line 57
    .line 58
    :goto_2
    if-ge v5, v0, :cond_9

    .line 59
    .line 60
    sget-object v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 61
    .line 62
    sget v9, Lsun/misc/Unsafe;->ARRAY_BYTE_BASE_OFFSET:I

    .line 63
    .line 64
    int-to-long v9, v9

    .line 65
    int-to-long v11, v5

    .line 66
    add-long/2addr v9, v11

    .line 67
    invoke-virtual {v3, p1, v9, v10}, Lsun/misc/Unsafe;->getChar(Ljava/lang/Object;J)C

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    const/16 v9, 0x22

    .line 72
    .line 73
    const/16 v10, 0x5c

    .line 74
    .line 75
    if-eq v3, v9, :cond_7

    .line 76
    .line 77
    const/16 v9, 0x3c

    .line 78
    .line 79
    if-eq v3, v9, :cond_5

    .line 80
    .line 81
    const/16 v9, 0x3e

    .line 82
    .line 83
    if-eq v3, v9, :cond_5

    .line 84
    .line 85
    if-eq v3, v10, :cond_4

    .line 86
    .line 87
    packed-switch v3, :pswitch_data_0

    .line 88
    .line 89
    .line 90
    packed-switch v3, :pswitch_data_1

    .line 91
    .line 92
    .line 93
    if-eqz v4, :cond_3

    .line 94
    .line 95
    const/16 v9, 0x7f

    .line 96
    .line 97
    if-le v3, v9, :cond_3

    .line 98
    .line 99
    invoke-static {v7, v3, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪苏世哲兰(II[C)V

    .line 100
    .line 101
    .line 102
    :goto_3
    add-int/lit8 v7, v7, 0x6

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_3
    add-int/lit8 v9, v7, 0x1

    .line 106
    .line 107
    aput-char v3, v6, v7

    .line 108
    .line 109
    :goto_4
    move v7, v9

    .line 110
    goto :goto_5

    .line 111
    :pswitch_0
    invoke-static {v7, v3, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰苏哲(II[C)V

    .line 112
    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_4
    :pswitch_1
    invoke-static {v7, v3, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏兰哲(II[C)V

    .line 116
    .line 117
    .line 118
    add-int/lit8 v7, v7, 0x2

    .line 119
    .line 120
    goto :goto_5

    .line 121
    :cond_5
    :pswitch_2
    if-eqz v2, :cond_6

    .line 122
    .line 123
    invoke-static {v7, v3, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪苏世哲兰(II[C)V

    .line 124
    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_6
    add-int/lit8 v9, v7, 0x1

    .line 128
    .line 129
    aput-char v3, v6, v7

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_7
    :pswitch_3
    if-ne v3, v1, :cond_8

    .line 133
    .line 134
    add-int/lit8 v9, v7, 0x1

    .line 135
    .line 136
    aput-char v10, v6, v7

    .line 137
    .line 138
    move v7, v9

    .line 139
    :cond_8
    add-int/lit8 v9, v7, 0x1

    .line 140
    .line 141
    aput-char v3, v6, v7

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :goto_5
    add-int/lit8 v5, v5, 0x2

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_9
    aput-char v1, v6, v7

    .line 148
    .line 149
    add-int/2addr v7, v8

    .line 150
    iput v7, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 151
    .line 152
    return-void

    .line 153
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
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    :pswitch_data_1
    .packed-switch 0x27
        :pswitch_3
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public final 飘花落叶言楪世苏兰子哲([C)V
    .locals 10

    .line 1
    array-length v0, p1

    .line 2
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 3
    .line 4
    iget-wide v1, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 5
    .line 6
    sget-object v3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->EscapeNoneAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 7
    .line 8
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 9
    .line 10
    and-long/2addr v3, v1

    .line 11
    const-wide/16 v5, 0x0

    .line 12
    .line 13
    cmp-long v3, v3, v5

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v7, 0x1

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    move v3, v7

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v3, v4

    .line 22
    :goto_0
    sget-object v8, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BrowserSecure:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 23
    .line 24
    iget-wide v8, v8, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 25
    .line 26
    and-long/2addr v1, v8

    .line 27
    cmp-long v1, v1, v5

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    move v1, v7

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v1, v4

    .line 34
    :goto_1
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 35
    .line 36
    const/4 v5, 0x6

    .line 37
    const/4 v6, 0x2

    .line 38
    invoke-static {v0, v5, v2, v6}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-object v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 43
    .line 44
    array-length v5, v5

    .line 45
    if-le v0, v5, :cond_2

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 48
    .line 49
    .line 50
    :cond_2
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 51
    .line 52
    add-int/lit8 v5, v2, 0x1

    .line 53
    .line 54
    iget-char v6, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 55
    .line 56
    aput-char v6, v0, v2

    .line 57
    .line 58
    :goto_2
    array-length v2, p1

    .line 59
    if-ge v4, v2, :cond_9

    .line 60
    .line 61
    aget-char v2, p1, v4

    .line 62
    .line 63
    const/16 v8, 0x22

    .line 64
    .line 65
    const/16 v9, 0x5c

    .line 66
    .line 67
    if-eq v2, v8, :cond_7

    .line 68
    .line 69
    const/16 v8, 0x3c

    .line 70
    .line 71
    if-eq v2, v8, :cond_5

    .line 72
    .line 73
    const/16 v8, 0x3e

    .line 74
    .line 75
    if-eq v2, v8, :cond_5

    .line 76
    .line 77
    if-eq v2, v9, :cond_4

    .line 78
    .line 79
    packed-switch v2, :pswitch_data_0

    .line 80
    .line 81
    .line 82
    packed-switch v2, :pswitch_data_1

    .line 83
    .line 84
    .line 85
    if-eqz v3, :cond_3

    .line 86
    .line 87
    const/16 v8, 0x7f

    .line 88
    .line 89
    if-le v2, v8, :cond_3

    .line 90
    .line 91
    invoke-static {v5, v2, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪苏世哲兰(II[C)V

    .line 92
    .line 93
    .line 94
    :goto_3
    add-int/lit8 v5, v5, 0x6

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_3
    add-int/lit8 v8, v5, 0x1

    .line 98
    .line 99
    aput-char v2, v0, v5

    .line 100
    .line 101
    :goto_4
    move v5, v8

    .line 102
    goto :goto_5

    .line 103
    :pswitch_0
    invoke-static {v5, v2, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰苏哲(II[C)V

    .line 104
    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_4
    :pswitch_1
    invoke-static {v5, v2, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏兰哲(II[C)V

    .line 108
    .line 109
    .line 110
    add-int/lit8 v5, v5, 0x2

    .line 111
    .line 112
    goto :goto_5

    .line 113
    :cond_5
    :pswitch_2
    if-eqz v1, :cond_6

    .line 114
    .line 115
    invoke-static {v5, v2, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪苏世哲兰(II[C)V

    .line 116
    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_6
    add-int/lit8 v8, v5, 0x1

    .line 120
    .line 121
    aput-char v2, v0, v5

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_7
    :pswitch_3
    if-ne v2, v6, :cond_8

    .line 125
    .line 126
    add-int/lit8 v8, v5, 0x1

    .line 127
    .line 128
    aput-char v9, v0, v5

    .line 129
    .line 130
    move v5, v8

    .line 131
    :cond_8
    add-int/lit8 v8, v5, 0x1

    .line 132
    .line 133
    aput-char v2, v0, v5

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :goto_5
    add-int/lit8 v4, v4, 0x1

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_9
    aput-char v6, v0, v5

    .line 140
    .line 141
    add-int/2addr v5, v7

    .line 142
    iput v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 143
    .line 144
    return-void

    .line 145
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
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    :pswitch_data_1
    .packed-switch 0x27
        :pswitch_3
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public final 飘花落叶言楪世苏哲兰子(Ljava/lang/String;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 6
    .line 7
    iget-wide v1, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 8
    .line 9
    sget-object v3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->EscapeNoneAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 10
    .line 11
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 12
    .line 13
    and-long/2addr v3, v1

    .line 14
    const-wide/16 v5, 0x0

    .line 15
    .line 16
    cmp-long v3, v3, v5

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v7, 0x1

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    move v3, v7

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v3, v4

    .line 25
    :goto_0
    sget-object v8, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BrowserSecure:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 26
    .line 27
    iget-wide v8, v8, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 28
    .line 29
    and-long/2addr v1, v8

    .line 30
    cmp-long v1, v1, v5

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    move v1, v7

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v1, v4

    .line 37
    :goto_1
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 38
    .line 39
    const/4 v5, 0x6

    .line 40
    const/4 v6, 0x2

    .line 41
    invoke-static {v0, v5, v2, v6}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    iget-object v6, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 46
    .line 47
    array-length v6, v6

    .line 48
    if-le v5, v6, :cond_2

    .line 49
    .line 50
    invoke-virtual {p0, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 51
    .line 52
    .line 53
    :cond_2
    iget-object v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 54
    .line 55
    add-int/lit8 v6, v2, 0x1

    .line 56
    .line 57
    iget-char v8, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 58
    .line 59
    aput-char v8, v5, v2

    .line 60
    .line 61
    :goto_2
    if-ge v4, v0, :cond_9

    .line 62
    .line 63
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    const/16 v9, 0x22

    .line 68
    .line 69
    const/16 v10, 0x5c

    .line 70
    .line 71
    if-eq v2, v9, :cond_7

    .line 72
    .line 73
    const/16 v9, 0x3c

    .line 74
    .line 75
    if-eq v2, v9, :cond_5

    .line 76
    .line 77
    const/16 v9, 0x3e

    .line 78
    .line 79
    if-eq v2, v9, :cond_5

    .line 80
    .line 81
    if-eq v2, v10, :cond_4

    .line 82
    .line 83
    packed-switch v2, :pswitch_data_0

    .line 84
    .line 85
    .line 86
    packed-switch v2, :pswitch_data_1

    .line 87
    .line 88
    .line 89
    if-eqz v3, :cond_3

    .line 90
    .line 91
    const/16 v9, 0x7f

    .line 92
    .line 93
    if-le v2, v9, :cond_3

    .line 94
    .line 95
    invoke-static {v6, v2, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪苏世哲兰(II[C)V

    .line 96
    .line 97
    .line 98
    :goto_3
    add-int/lit8 v6, v6, 0x6

    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_3
    add-int/lit8 v9, v6, 0x1

    .line 102
    .line 103
    aput-char v2, v5, v6

    .line 104
    .line 105
    :goto_4
    move v6, v9

    .line 106
    goto :goto_5

    .line 107
    :pswitch_0
    invoke-static {v6, v2, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰苏哲(II[C)V

    .line 108
    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_4
    :pswitch_1
    invoke-static {v6, v2, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏兰哲(II[C)V

    .line 112
    .line 113
    .line 114
    add-int/lit8 v6, v6, 0x2

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_5
    :pswitch_2
    if-eqz v1, :cond_6

    .line 118
    .line 119
    invoke-static {v6, v2, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪苏世哲兰(II[C)V

    .line 120
    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_6
    add-int/lit8 v9, v6, 0x1

    .line 124
    .line 125
    aput-char v2, v5, v6

    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_7
    :pswitch_3
    if-ne v2, v8, :cond_8

    .line 129
    .line 130
    add-int/lit8 v9, v6, 0x1

    .line 131
    .line 132
    aput-char v10, v5, v6

    .line 133
    .line 134
    move v6, v9

    .line 135
    :cond_8
    add-int/lit8 v9, v6, 0x1

    .line 136
    .line 137
    aput-char v2, v5, v6

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :goto_5
    add-int/lit8 v4, v4, 0x1

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_9
    aput-char v8, v5, v6

    .line 144
    .line 145
    add-int/2addr v6, v7

    .line 146
    iput v6, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 147
    .line 148
    return-void

    .line 149
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
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    :pswitch_data_1
    .packed-switch 0x27
        :pswitch_3
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public final 飘花落叶言楪世苏哲子兰()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 4
    .line 5
    array-length v1, v1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x1

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 14
    .line 15
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 16
    .line 17
    add-int/lit8 v2, v1, 0x1

    .line 18
    .line 19
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 20
    .line 21
    iget-char p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 22
    .line 23
    aput-char p0, v0, v1

    .line 24
    .line 25
    return-void
.end method

.method public final 飘花落叶言楪世苏子哲兰(I[C)I
    .locals 2

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    aput-char v0, p2, p1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    add-int/2addr p1, v0

    .line 7
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰哲苏世:I

    .line 8
    .line 9
    iget-byte p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪兰哲苏:B

    .line 10
    .line 11
    mul-int/2addr v1, p0

    .line 12
    add-int/2addr v1, p1

    .line 13
    if-ne p0, v0, :cond_0

    .line 14
    .line 15
    const/16 p0, 0x9

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 p0, 0x20

    .line 19
    .line 20
    :goto_0
    invoke-static {p2, p1, v1, p0}, Ljava/util/Arrays;->fill([CIIC)V

    .line 21
    .line 22
    .line 23
    return v1
.end method

.method public final 飘花落叶言楪子世兰哲苏([B)V
    .locals 0

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string p1, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言楪子世兰苏哲(Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 6
    .line 7
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 8
    .line 9
    add-int v3, v1, v0

    .line 10
    .line 11
    array-length v4, v2

    .line 12
    if-le v3, v4, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 15
    .line 16
    .line 17
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 18
    .line 19
    :cond_0
    const/4 v4, 0x0

    .line 20
    invoke-virtual {p1, v4, v0, v2, v1}, Ljava/lang/String;->getChars(II[CI)V

    .line 21
    .line 22
    .line 23
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 24
    .line 25
    return-void
.end method

.method public final 飘花落叶言楪子世哲兰苏(I[C)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 4
    .line 5
    add-int v2, v0, p1

    .line 6
    .line 7
    array-length v3, v1

    .line 8
    if-le v2, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 14
    .line 15
    :cond_0
    const/4 v3, 0x0

    .line 16
    invoke-static {p2, v3, v1, v0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 17
    .line 18
    .line 19
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 20
    .line 21
    return-void
.end method

.method public final 飘花落叶言楪子世哲苏兰(CC)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 4
    .line 5
    add-int/lit8 v2, v0, 0x2

    .line 6
    .line 7
    array-length v3, v1

    .line 8
    if-le v2, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 14
    .line 15
    :cond_0
    aput-char p1, v1, v0

    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    aput-char p2, v1, v0

    .line 20
    .line 21
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 22
    .line 23
    return-void
.end method

.method public final 飘花落叶言楪子世苏兰哲(C)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 4
    .line 5
    array-length v1, v1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x1

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 14
    .line 15
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 16
    .line 17
    add-int/lit8 v2, v1, 0x1

    .line 18
    .line 19
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 20
    .line 21
    aput-char p1, v0, v1

    .line 22
    .line 23
    return-void
.end method

.method public final 飘花落叶言楪子兰世苏哲([Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-byte v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪兰哲苏:B

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 9
    .line 10
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 11
    .line 12
    array-length v1, v1

    .line 13
    if-ne v0, v1, :cond_1

    .line 14
    .line 15
    add-int/lit8 v0, v0, 0x1

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 18
    .line 19
    .line 20
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 21
    .line 22
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 23
    .line 24
    add-int/lit8 v2, v1, 0x1

    .line 25
    .line 26
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 27
    .line 28
    const/16 v2, 0x5b

    .line 29
    .line 30
    aput-char v2, v0, v1

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    :goto_0
    array-length v1, p1

    .line 34
    if-ge v0, v1, :cond_4

    .line 35
    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 39
    .line 40
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 41
    .line 42
    array-length v2, v2

    .line 43
    if-ne v1, v2, :cond_2

    .line 44
    .line 45
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 48
    .line 49
    .line 50
    :cond_2
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 51
    .line 52
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 53
    .line 54
    add-int/lit8 v3, v2, 0x1

    .line 55
    .line 56
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 57
    .line 58
    const/16 v3, 0x2c

    .line 59
    .line 60
    aput-char v3, v1, v2

    .line 61
    .line 62
    :cond_3
    aget-object v1, p1, v0

    .line 63
    .line 64
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    add-int/lit8 v0, v0, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_4
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 71
    .line 72
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 73
    .line 74
    array-length v0, v0

    .line 75
    if-ne p1, v0, :cond_5

    .line 76
    .line 77
    add-int/lit8 p1, p1, 0x1

    .line 78
    .line 79
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 80
    .line 81
    .line 82
    :cond_5
    iget-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 83
    .line 84
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 85
    .line 86
    add-int/lit8 v1, v0, 0x1

    .line 87
    .line 88
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 89
    .line 90
    const/16 p0, 0x5d

    .line 91
    .line 92
    aput-char p0, p1, v0

    .line 93
    .line 94
    return-void

    .line 95
    :cond_6
    :goto_1
    invoke-super {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子兰世苏哲([Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public final 飘花落叶言楪子兰哲苏世(III)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0xa

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-le v1, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 14
    .line 15
    :cond_0
    iget-char v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 16
    .line 17
    int-to-byte v4, v3

    .line 18
    int-to-char v4, v4

    .line 19
    aput-char v4, v2, v0

    .line 20
    .line 21
    add-int/lit8 v4, v0, 0x1

    .line 22
    .line 23
    invoke-static {v4, p1, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 p1, v0, 0x3

    .line 27
    .line 28
    const/16 v4, 0x3a

    .line 29
    .line 30
    aput-char v4, v2, p1

    .line 31
    .line 32
    add-int/lit8 p1, v0, 0x4

    .line 33
    .line 34
    invoke-static {p1, p2, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 p1, v0, 0x6

    .line 38
    .line 39
    aput-char v4, v2, p1

    .line 40
    .line 41
    add-int/lit8 p1, v0, 0x7

    .line 42
    .line 43
    invoke-static {p1, p3, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪世哲(II[C)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 v0, v0, 0x9

    .line 47
    .line 48
    int-to-byte p1, v3

    .line 49
    int-to-char p1, p1

    .line 50
    aput-char p1, v2, v0

    .line 51
    .line 52
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 53
    .line 54
    return-void
.end method

.method public final 飘花落叶言楪子兰苏世哲(I[C)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->EscapeNoneAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 6
    .line 7
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 8
    .line 9
    and-long/2addr v0, v2

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v0, v1

    .line 20
    :goto_0
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    mul-int/lit8 v3, p1, 0x6

    .line 25
    .line 26
    :goto_1
    add-int/2addr v3, v2

    .line 27
    goto :goto_2

    .line 28
    :cond_1
    mul-int/lit8 v3, p1, 0x2

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :goto_2
    iget-object v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 32
    .line 33
    array-length v5, v4

    .line 34
    sub-int v5, v3, v5

    .line 35
    .line 36
    if-lez v5, :cond_2

    .line 37
    .line 38
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 39
    .line 40
    .line 41
    iget-object v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 42
    .line 43
    :cond_2
    array-length v3, p2

    .line 44
    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    :goto_3
    if-ge v1, p1, :cond_7

    .line 49
    .line 50
    aget-char v3, p2, v1

    .line 51
    .line 52
    const/16 v5, 0x22

    .line 53
    .line 54
    const/16 v6, 0x5c

    .line 55
    .line 56
    if-eq v3, v5, :cond_5

    .line 57
    .line 58
    const/16 v5, 0x27

    .line 59
    .line 60
    if-eq v3, v5, :cond_5

    .line 61
    .line 62
    if-eq v3, v6, :cond_4

    .line 63
    .line 64
    packed-switch v3, :pswitch_data_0

    .line 65
    .line 66
    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    const/16 v5, 0x7f

    .line 70
    .line 71
    if-le v3, v5, :cond_3

    .line 72
    .line 73
    invoke-static {v2, v3, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪苏世哲兰(II[C)V

    .line 74
    .line 75
    .line 76
    :goto_4
    add-int/lit8 v2, v2, 0x6

    .line 77
    .line 78
    goto :goto_6

    .line 79
    :cond_3
    add-int/lit8 v5, v2, 0x1

    .line 80
    .line 81
    aput-char v3, v4, v2

    .line 82
    .line 83
    :goto_5
    move v2, v5

    .line 84
    goto :goto_6

    .line 85
    :pswitch_0
    invoke-static {v2, v3, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰苏哲(II[C)V

    .line 86
    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_4
    :pswitch_1
    invoke-static {v2, v3, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏兰哲(II[C)V

    .line 90
    .line 91
    .line 92
    add-int/lit8 v2, v2, 0x2

    .line 93
    .line 94
    goto :goto_6

    .line 95
    :cond_5
    iget-char v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 96
    .line 97
    if-ne v3, v5, :cond_6

    .line 98
    .line 99
    add-int/lit8 v5, v2, 0x1

    .line 100
    .line 101
    aput-char v6, v4, v2

    .line 102
    .line 103
    move v2, v5

    .line 104
    :cond_6
    add-int/lit8 v5, v2, 0x1

    .line 105
    .line 106
    aput-char v3, v4, v2

    .line 107
    .line 108
    goto :goto_5

    .line 109
    :goto_6
    add-int/lit8 v1, v1, 0x1

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_7
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 113
    .line 114
    return-void

    .line 115
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
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
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

.method public final 飘花落叶言楪子哲世兰苏(Ljava/util/List;)V
    .locals 5

    .line 1
    iget-byte v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪兰哲苏:B

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世兰苏(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 10
    .line 11
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 12
    .line 13
    array-length v1, v1

    .line 14
    if-ne v0, v1, :cond_1

    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 19
    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 22
    .line 23
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 24
    .line 25
    add-int/lit8 v2, v1, 0x1

    .line 26
    .line 27
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 28
    .line 29
    const/16 v2, 0x5b

    .line 30
    .line 31
    aput-char v2, v0, v1

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/4 v1, 0x0

    .line 38
    :goto_0
    if-ge v1, v0, :cond_4

    .line 39
    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 43
    .line 44
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 45
    .line 46
    array-length v3, v3

    .line 47
    if-ne v2, v3, :cond_2

    .line 48
    .line 49
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 52
    .line 53
    .line 54
    :cond_2
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 55
    .line 56
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 57
    .line 58
    add-int/lit8 v4, v3, 0x1

    .line 59
    .line 60
    iput v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 61
    .line 62
    const/16 v4, 0x2c

    .line 63
    .line 64
    aput-char v4, v2, v3

    .line 65
    .line 66
    :cond_3
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    add-int/lit8 v1, v1, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_4
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 79
    .line 80
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 81
    .line 82
    array-length v0, v0

    .line 83
    if-ne p1, v0, :cond_5

    .line 84
    .line 85
    add-int/lit8 p1, p1, 0x1

    .line 86
    .line 87
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 88
    .line 89
    .line 90
    :cond_5
    iget-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 91
    .line 92
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 93
    .line 94
    add-int/lit8 v1, v0, 0x1

    .line 95
    .line 96
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 97
    .line 98
    const/16 p0, 0x5d

    .line 99
    .line 100
    aput-char p0, p1, v0

    .line 101
    .line 102
    return-void
.end method

.method public 飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V
    .locals 9

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子兰苏哲世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 8
    .line 9
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 10
    .line 11
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->EscapeNoneAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 12
    .line 13
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 14
    .line 15
    and-long/2addr v2, v0

    .line 16
    const-wide/16 v4, 0x0

    .line 17
    .line 18
    cmp-long v2, v2, v4

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v6, 0x1

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    move v2, v6

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move v2, v3

    .line 27
    :goto_0
    sget-object v7, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BrowserSecure:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 28
    .line 29
    iget-wide v7, v7, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 30
    .line 31
    and-long/2addr v0, v7

    .line 32
    cmp-long v0, v0, v4

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    move v0, v6

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v0, v3

    .line 39
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    iget v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 44
    .line 45
    add-int/2addr v4, v1

    .line 46
    add-int/lit8 v4, v4, 0x2

    .line 47
    .line 48
    iget-object v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 49
    .line 50
    array-length v5, v5

    .line 51
    if-lt v4, v5, :cond_3

    .line 52
    .line 53
    invoke-virtual {p0, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 54
    .line 55
    .line 56
    :cond_3
    move v4, v3

    .line 57
    :goto_2
    iget-char v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 58
    .line 59
    if-ge v4, v1, :cond_7

    .line 60
    .line 61
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    const/16 v8, 0x5c

    .line 66
    .line 67
    if-eq v7, v8, :cond_6

    .line 68
    .line 69
    if-eq v7, v5, :cond_6

    .line 70
    .line 71
    const/16 v5, 0x20

    .line 72
    .line 73
    if-lt v7, v5, :cond_6

    .line 74
    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    const/16 v5, 0x3c

    .line 78
    .line 79
    if-eq v7, v5, :cond_6

    .line 80
    .line 81
    const/16 v5, 0x3e

    .line 82
    .line 83
    if-eq v7, v5, :cond_6

    .line 84
    .line 85
    const/16 v5, 0x28

    .line 86
    .line 87
    if-eq v7, v5, :cond_6

    .line 88
    .line 89
    const/16 v5, 0x29

    .line 90
    .line 91
    if-eq v7, v5, :cond_6

    .line 92
    .line 93
    :cond_4
    if-eqz v2, :cond_5

    .line 94
    .line 95
    const/16 v5, 0x7f

    .line 96
    .line 97
    if-le v7, v5, :cond_5

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_5
    add-int/lit8 v4, v4, 0x1

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_6
    :goto_3
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世苏哲兰子(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_7
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 108
    .line 109
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 110
    .line 111
    add-int/lit8 v4, v0, 0x1

    .line 112
    .line 113
    aput-char v5, v2, v0

    .line 114
    .line 115
    invoke-virtual {p1, v3, v1, v2, v4}, Ljava/lang/String;->getChars(II[CI)V

    .line 116
    .line 117
    .line 118
    add-int/2addr v4, v1

    .line 119
    aput-char v5, v2, v4

    .line 120
    .line 121
    add-int/2addr v4, v6

    .line 122
    iput v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 123
    .line 124
    return-void
.end method

.method public final 飘花落叶言楪子哲苏世兰(S)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 6
    .line 7
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 8
    .line 9
    and-long/2addr v0, v2

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世苏哲子兰()V

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子兰楪世哲苏(S)V

    .line 25
    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世苏哲子兰()V

    .line 30
    .line 31
    .line 32
    :cond_2
    return-void
.end method

.method public final 飘花落叶言楪子哲苏兰世(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 8
    .line 9
    iget-char v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 10
    .line 11
    aput-char v2, v0, v1

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子哲楪苏兰世(Z)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 17
    .line 18
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 19
    .line 20
    add-int/lit8 v1, v0, 0x1

    .line 21
    .line 22
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 23
    .line 24
    aput-char v2, p1, v0

    .line 25
    .line 26
    return-void
.end method

.method public final 飘花落叶言楪子苏世哲兰(Ljava/lang/String;)V
    .locals 9

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪兰苏哲:Ljava/lang/String;

    .line 2
    .line 3
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 4
    .line 5
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 6
    .line 7
    add-int/lit8 v2, v0, 0x9

    .line 8
    .line 9
    array-length v3, v1

    .line 10
    if-le v2, v3, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 16
    .line 17
    :cond_0
    move-object v3, v1

    .line 18
    sget-wide v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲:J

    .line 19
    .line 20
    int-to-long v4, v0

    .line 21
    const/4 v8, 0x1

    .line 22
    shl-long/2addr v4, v8

    .line 23
    add-long/2addr v4, v1

    .line 24
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 25
    .line 26
    sget-wide v6, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世哲楪苏兰:J

    .line 27
    .line 28
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 29
    .line 30
    .line 31
    const-wide/16 v6, 0x8

    .line 32
    .line 33
    add-long/2addr v4, v6

    .line 34
    sget-wide v6, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世哲楪兰苏:J

    .line 35
    .line 36
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 37
    .line 38
    .line 39
    add-int/lit8 v0, v0, 0x8

    .line 40
    .line 41
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 47
    .line 48
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 49
    .line 50
    array-length v1, v0

    .line 51
    if-ne p1, v1, :cond_1

    .line 52
    .line 53
    add-int/lit8 v0, p1, 0x1

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 59
    .line 60
    :cond_1
    const/16 v1, 0x7d

    .line 61
    .line 62
    aput-char v1, v0, p1

    .line 63
    .line 64
    add-int/2addr p1, v8

    .line 65
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 66
    .line 67
    return-void
.end method

.method public final 飘花落叶言楪子苏兰世哲(I[C)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->EscapeNoneAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 6
    .line 7
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 8
    .line 9
    and-long/2addr v0, v2

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x1

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    move v0, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v0, v1

    .line 21
    :goto_0
    move v3, v1

    .line 22
    :goto_1
    iget-char v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 23
    .line 24
    if-ge v3, p1, :cond_3

    .line 25
    .line 26
    aget-char v5, p2, v3

    .line 27
    .line 28
    const/16 v6, 0x5c

    .line 29
    .line 30
    if-eq v5, v6, :cond_2

    .line 31
    .line 32
    if-eq v5, v4, :cond_2

    .line 33
    .line 34
    const/16 v6, 0x20

    .line 35
    .line 36
    if-ge v5, v6, :cond_1

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    :goto_2
    move v0, v2

    .line 43
    :cond_3
    if-nez v0, :cond_5

    .line 44
    .line 45
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 46
    .line 47
    add-int v3, v0, p1

    .line 48
    .line 49
    add-int/lit8 v3, v3, 0x2

    .line 50
    .line 51
    iget-object v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 52
    .line 53
    array-length v6, v5

    .line 54
    if-le v3, v6, :cond_4

    .line 55
    .line 56
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世子兰哲苏(I)V

    .line 57
    .line 58
    .line 59
    iget-object v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 60
    .line 61
    :cond_4
    add-int/lit8 v3, v0, 0x1

    .line 62
    .line 63
    aput-char v4, v5, v0

    .line 64
    .line 65
    invoke-static {p2, v1, v5, v3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 66
    .line 67
    .line 68
    add-int/2addr v3, p1

    .line 69
    aput-char v4, v5, v3

    .line 70
    .line 71
    add-int/2addr v3, v2

    .line 72
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 73
    .line 74
    return-void

    .line 75
    :cond_5
    new-instance v0, Ljava/lang/String;

    .line 76
    .line 77
    invoke-direct {v0, p2, v1, p1}, Ljava/lang/String;-><init>([CII)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世苏哲兰子(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final 飘花落叶言楪子苏兰哲世(J)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 6
    .line 7
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 8
    .line 9
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteLongAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 10
    .line 11
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 12
    .line 13
    or-long/2addr v2, v4

    .line 14
    and-long/2addr v0, v2

    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    cmp-long v0, v0, v2

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    :goto_0
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世苏哲子兰()V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子兰世楪苏哲(J)V

    .line 30
    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世苏哲子兰()V

    .line 35
    .line 36
    .line 37
    :cond_2
    return-void
.end method

.method public final 飘花落叶言楪子苏哲世兰(B)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 6
    .line 7
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 8
    .line 9
    and-long/2addr v0, v2

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世苏哲子兰()V

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子兰世苏哲楪(B)V

    .line 25
    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世苏哲子兰()V

    .line 30
    .line 31
    .line 32
    :cond_2
    return-void
.end method

.method public final 飘花落叶言楪子苏哲兰世(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 6
    .line 7
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 8
    .line 9
    and-long/2addr v0, v2

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世苏哲子兰()V

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子兰楪苏哲世(I)V

    .line 25
    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪世苏哲子兰()V

    .line 30
    .line 31
    .line 32
    :cond_2
    return-void
.end method
