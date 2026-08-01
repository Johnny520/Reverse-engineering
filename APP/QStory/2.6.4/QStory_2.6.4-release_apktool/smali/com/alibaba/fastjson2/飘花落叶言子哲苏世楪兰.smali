.class public final Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;
.super Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子世哲楪苏兰:J


# instance fields
.field public final 飘花落叶言子世苏兰哲楪:J

.field public 飘花落叶言子世苏兰楪哲:[B

.field public final 飘花落叶言子世苏哲兰楪:Lcom/alibaba/fastjson2/飘花落叶言子楪世兰哲苏;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/16 v2, 0x7b

    .line 7
    .line 8
    aput-byte v2, v0, v1

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    const/16 v2, 0x22

    .line 12
    .line 13
    aput-byte v2, v0, v1

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    const/16 v3, 0x24

    .line 17
    .line 18
    aput-byte v3, v0, v1

    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    const/16 v3, 0x72

    .line 22
    .line 23
    aput-byte v3, v0, v1

    .line 24
    .line 25
    const/4 v1, 0x4

    .line 26
    const/16 v3, 0x65

    .line 27
    .line 28
    aput-byte v3, v0, v1

    .line 29
    .line 30
    const/4 v1, 0x5

    .line 31
    const/16 v3, 0x66

    .line 32
    .line 33
    aput-byte v3, v0, v1

    .line 34
    .line 35
    const/4 v1, 0x6

    .line 36
    aput-byte v2, v0, v1

    .line 37
    .line 38
    const/4 v2, 0x7

    .line 39
    const/16 v3, 0x3a

    .line 40
    .line 41
    aput-byte v3, v0, v2

    .line 42
    .line 43
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 44
    .line 45
    sget-wide v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰:J

    .line 46
    .line 47
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 48
    .line 49
    .line 50
    move-result-wide v5

    .line 51
    sput-wide v5, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世哲楪苏兰:J

    .line 52
    .line 53
    const-wide/16 v5, 0x6

    .line 54
    .line 55
    add-long v7, v3, v5

    .line 56
    .line 57
    invoke-virtual {v2, v0, v7, v8}, Lsun/misc/Unsafe;->getShort(Ljava/lang/Object;J)S

    .line 58
    .line 59
    .line 60
    const/16 v7, 0x27

    .line 61
    .line 62
    aput-byte v7, v0, v1

    .line 63
    .line 64
    add-long/2addr v3, v5

    .line 65
    invoke-virtual {v2, v0, v3, v4}, Lsun/misc/Unsafe;->getShort(Ljava/lang/Object;J)S

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public constructor <init>(Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

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
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏哲兰楪:Lcom/alibaba/fastjson2/飘花落叶言子楪世兰哲苏;

    .line 24
    .line 25
    sget-object v0, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世哲苏:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

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
    check-cast p1, [B

    .line 33
    .line 34
    if-nez p1, :cond_0

    .line 35
    .line 36
    const/16 p1, 0x2000

    .line 37
    .line 38
    new-array p1, p1, [B

    .line 39
    .line 40
    :cond_0
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

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
    iput-wide v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰哲楪:J

    .line 58
    .line 59
    return-void
.end method

.method public static 飘花落叶言楪苏哲兰子世(J)J
    .locals 8

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    shl-long v0, p0, v0

    .line 4
    .line 5
    const-wide v2, -0xffff00000001L

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    and-long/2addr p0, v2

    .line 11
    const-wide v2, 0xffff00000000L

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    and-long/2addr v0, v2

    .line 17
    or-long/2addr p0, v0

    .line 18
    const/16 v0, 0x8

    .line 19
    .line 20
    shl-long v0, p0, v0

    .line 21
    .line 22
    const-wide v2, -0xff000000ff0001L

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    and-long/2addr p0, v2

    .line 28
    const-wide v2, 0xff000000ff0000L

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    and-long/2addr v0, v2

    .line 34
    or-long/2addr p0, v0

    .line 35
    const/4 v0, 0x4

    .line 36
    shl-long v1, p0, v0

    .line 37
    .line 38
    const-wide v3, -0xf000f000f000f01L    # -2.0311904136630851E236

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    and-long/2addr p0, v3

    .line 44
    const-wide v3, 0xf000f000f000f00L

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    and-long/2addr v1, v3

    .line 50
    or-long/2addr p0, v1

    .line 51
    const-wide v1, 0xf0f0f0f0f0f0f0fL    # 3.815736827118017E-236

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    and-long/2addr p0, v1

    .line 57
    const-wide v1, 0x606060606060606L

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    add-long/2addr v1, p0

    .line 63
    const-wide v3, 0x1010101010101010L    # 2.586563270614692E-231

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    and-long/2addr v1, v3

    .line 69
    const/4 v3, 0x1

    .line 70
    shl-long v4, v1, v3

    .line 71
    .line 72
    shr-long v6, v1, v3

    .line 73
    .line 74
    add-long/2addr v4, v6

    .line 75
    shr-long v0, v1, v0

    .line 76
    .line 77
    sub-long/2addr v4, v0

    .line 78
    const-wide v0, 0x3030303030303030L    # 1.398043286095289E-76

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    add-long/2addr v4, v0

    .line 84
    add-long/2addr v4, p0

    .line 85
    sget-boolean p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰苏世:Z

    .line 86
    .line 87
    if-nez p0, :cond_0

    .line 88
    .line 89
    invoke-static {v4, v5}, Ljava/lang/Long;->reverseBytes(J)J

    .line 90
    .line 91
    .line 92
    move-result-wide p0

    .line 93
    return-wide p0

    .line 94
    :cond_0
    return-wide v4
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

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
    sget-object v1, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世哲苏:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 10
    .line 11
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏哲兰楪:Lcom/alibaba/fastjson2/飘花落叶言子楪世兰哲苏;

    .line 12
    .line 13
    invoke-virtual {v1, p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 4
    .line 5
    iget p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 6
    .line 7
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v0, v1, v3, p0, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final 飘花落叶言子兰世哲楪苏([B)V
    .locals 11

    .line 1
    array-length v0, p1

    .line 2
    add-int/lit8 v0, v0, -0x1

    .line 3
    .line 4
    div-int/lit8 v0, v0, 0x3

    .line 5
    .line 6
    add-int/lit8 v0, v0, 0x1

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    shl-int/2addr v0, v1

    .line 10
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 11
    .line 12
    add-int/2addr v0, v2

    .line 13
    add-int/2addr v0, v1

    .line 14
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 15
    .line 16
    array-length v4, v3

    .line 17
    if-le v0, v4, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 20
    .line 21
    .line 22
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 23
    .line 24
    :cond_0
    add-int/lit8 v0, v2, 0x1

    .line 25
    .line 26
    iget-char v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 27
    .line 28
    int-to-byte v5, v4

    .line 29
    aput-byte v5, v3, v2

    .line 30
    .line 31
    array-length v2, p1

    .line 32
    div-int/lit8 v2, v2, 0x3

    .line 33
    .line 34
    mul-int/lit8 v2, v2, 0x3

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    move v6, v5

    .line 38
    :goto_0
    if-ge v6, v2, :cond_1

    .line 39
    .line 40
    add-int/lit8 v7, v6, 0x1

    .line 41
    .line 42
    aget-byte v8, p1, v6

    .line 43
    .line 44
    and-int/lit16 v8, v8, 0xff

    .line 45
    .line 46
    shl-int/lit8 v8, v8, 0x10

    .line 47
    .line 48
    add-int/lit8 v9, v6, 0x2

    .line 49
    .line 50
    aget-byte v7, p1, v7

    .line 51
    .line 52
    and-int/lit16 v7, v7, 0xff

    .line 53
    .line 54
    shl-int/lit8 v7, v7, 0x8

    .line 55
    .line 56
    or-int/2addr v7, v8

    .line 57
    add-int/lit8 v6, v6, 0x3

    .line 58
    .line 59
    aget-byte v8, p1, v9

    .line 60
    .line 61
    and-int/lit16 v8, v8, 0xff

    .line 62
    .line 63
    or-int/2addr v7, v8

    .line 64
    sget-object v8, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲世兰苏:[C

    .line 65
    .line 66
    ushr-int/lit8 v9, v7, 0x12

    .line 67
    .line 68
    and-int/lit8 v9, v9, 0x3f

    .line 69
    .line 70
    aget-char v9, v8, v9

    .line 71
    .line 72
    int-to-byte v9, v9

    .line 73
    aput-byte v9, v3, v0

    .line 74
    .line 75
    add-int/lit8 v9, v0, 0x1

    .line 76
    .line 77
    ushr-int/lit8 v10, v7, 0xc

    .line 78
    .line 79
    and-int/lit8 v10, v10, 0x3f

    .line 80
    .line 81
    aget-char v10, v8, v10

    .line 82
    .line 83
    int-to-byte v10, v10

    .line 84
    aput-byte v10, v3, v9

    .line 85
    .line 86
    add-int/lit8 v9, v0, 0x2

    .line 87
    .line 88
    ushr-int/lit8 v10, v7, 0x6

    .line 89
    .line 90
    and-int/lit8 v10, v10, 0x3f

    .line 91
    .line 92
    aget-char v10, v8, v10

    .line 93
    .line 94
    int-to-byte v10, v10

    .line 95
    aput-byte v10, v3, v9

    .line 96
    .line 97
    add-int/lit8 v9, v0, 0x3

    .line 98
    .line 99
    and-int/lit8 v7, v7, 0x3f

    .line 100
    .line 101
    aget-char v7, v8, v7

    .line 102
    .line 103
    int-to-byte v7, v7

    .line 104
    aput-byte v7, v3, v9

    .line 105
    .line 106
    add-int/lit8 v0, v0, 0x4

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_1
    array-length v6, p1

    .line 110
    sub-int/2addr v6, v2

    .line 111
    if-lez v6, :cond_4

    .line 112
    .line 113
    aget-byte v2, p1, v2

    .line 114
    .line 115
    and-int/lit16 v2, v2, 0xff

    .line 116
    .line 117
    shl-int/lit8 v2, v2, 0xa

    .line 118
    .line 119
    if-ne v6, v1, :cond_2

    .line 120
    .line 121
    array-length v5, p1

    .line 122
    add-int/lit8 v5, v5, -0x1

    .line 123
    .line 124
    aget-byte p1, p1, v5

    .line 125
    .line 126
    and-int/lit16 p1, p1, 0xff

    .line 127
    .line 128
    shl-int/lit8 v5, p1, 0x2

    .line 129
    .line 130
    :cond_2
    or-int p1, v2, v5

    .line 131
    .line 132
    sget-object v2, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲世兰苏:[C

    .line 133
    .line 134
    shr-int/lit8 v5, p1, 0xc

    .line 135
    .line 136
    aget-char v5, v2, v5

    .line 137
    .line 138
    int-to-byte v5, v5

    .line 139
    aput-byte v5, v3, v0

    .line 140
    .line 141
    add-int/lit8 v5, v0, 0x1

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
    int-to-byte v7, v7

    .line 150
    aput-byte v7, v3, v5

    .line 151
    .line 152
    add-int/lit8 v5, v0, 0x2

    .line 153
    .line 154
    const/16 v7, 0x3d

    .line 155
    .line 156
    if-ne v6, v1, :cond_3

    .line 157
    .line 158
    and-int/lit8 p1, p1, 0x3f

    .line 159
    .line 160
    aget-char p1, v2, p1

    .line 161
    .line 162
    int-to-byte p1, p1

    .line 163
    goto :goto_1

    .line 164
    :cond_3
    move p1, v7

    .line 165
    :goto_1
    aput-byte p1, v3, v5

    .line 166
    .line 167
    add-int/lit8 p1, v0, 0x3

    .line 168
    .line 169
    aput-byte v7, v3, p1

    .line 170
    .line 171
    add-int/lit8 v0, v0, 0x4

    .line 172
    .line 173
    :cond_4
    int-to-byte p1, v4

    .line 174
    aput-byte p1, v3, v0

    .line 175
    .line 176
    add-int/lit8 v0, v0, 0x1

    .line 177
    .line 178
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 179
    .line 180
    return-void
.end method

.method public final 飘花落叶言子兰世哲苏楪(Ljava/math/BigInteger;J)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世苏子哲兰()V

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
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪子哲兰世苏(J)V

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
    invoke-static {p1, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏楪哲世兰(Ljava/math/BigInteger;J)Z

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
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 58
    .line 59
    array-length v4, v3

    .line 60
    if-le v1, v4, :cond_3

    .line 61
    .line 62
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 63
    .line 64
    .line 65
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

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
    aput-byte v1, v3, p2

    .line 74
    .line 75
    move p2, v4

    .line 76
    :cond_4
    invoke-virtual {v0, v2, p3, v3, p2}, Ljava/lang/String;->getBytes(II[BI)V

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
    aput-byte v1, v3, p2

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

.method public final 飘花落叶言子兰世楪苏哲(Ljava/util/Map;)V
    .locals 14

    .line 1
    iget-byte v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪兰哲苏:B

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-super/range {p0 .. p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰世楪苏哲(Ljava/util/Map;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪世子兰哲苏()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    iget-object v7, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 16
    .line 17
    iget-wide v8, v7, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 18
    .line 19
    sget-wide v2, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世苏楪兰哲:J

    .line 20
    .line 21
    and-long/2addr v2, v8

    .line 22
    const-wide/16 v10, 0x0

    .line 23
    .line 24
    cmp-long v0, v2, v10

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
    invoke-virtual {v7, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

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
    invoke-interface/range {v0 .. v6}, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 47
    .line 48
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 49
    .line 50
    array-length v2, v2

    .line 51
    const/4 v12, 0x1

    .line 52
    if-ne v0, v2, :cond_3

    .line 53
    .line 54
    add-int/2addr v0, v12

    .line 55
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 56
    .line 57
    .line 58
    :cond_3
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 59
    .line 60
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 61
    .line 62
    add-int/lit8 v3, v2, 0x1

    .line 63
    .line 64
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 65
    .line 66
    const/16 v3, 0x7b

    .line 67
    .line 68
    aput-byte v3, v0, v2

    .line 69
    .line 70
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v13

    .line 78
    move v0, v12

    .line 79
    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_11

    .line 84
    .line 85
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    check-cast v2, Ljava/util/Map$Entry;

    .line 90
    .line 91
    move-object v3, v2

    .line 92
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    if-nez v2, :cond_4

    .line 97
    .line 98
    const-wide/16 v4, 0x10

    .line 99
    .line 100
    and-long/2addr v4, v8

    .line 101
    cmp-long v4, v4, v10

    .line 102
    .line 103
    if-nez v4, :cond_4

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_4
    if-nez v0, :cond_6

    .line 107
    .line 108
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 109
    .line 110
    iget-object v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 111
    .line 112
    array-length v4, v4

    .line 113
    if-ne v0, v4, :cond_5

    .line 114
    .line 115
    add-int/lit8 v0, v0, 0x1

    .line 116
    .line 117
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 118
    .line 119
    .line 120
    :cond_5
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 121
    .line 122
    iget v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 123
    .line 124
    add-int/lit8 v5, v4, 0x1

    .line 125
    .line 126
    iput v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 127
    .line 128
    const/16 v5, 0x2c

    .line 129
    .line 130
    aput-byte v5, v0, v4

    .line 131
    .line 132
    :cond_6
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    instance-of v3, v0, Ljava/lang/String;

    .line 137
    .line 138
    if-eqz v3, :cond_7

    .line 139
    .line 140
    check-cast v0, Ljava/lang/String;

    .line 141
    .line 142
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪世兰哲子苏(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_7
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰世楪哲苏(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    :goto_1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 150
    .line 151
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 152
    .line 153
    array-length v3, v3

    .line 154
    if-ne v0, v3, :cond_8

    .line 155
    .line 156
    add-int/lit8 v0, v0, 0x1

    .line 157
    .line 158
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 159
    .line 160
    .line 161
    :cond_8
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 162
    .line 163
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 164
    .line 165
    add-int/lit8 v4, v3, 0x1

    .line 166
    .line 167
    iput v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 168
    .line 169
    const/16 v4, 0x3a

    .line 170
    .line 171
    aput-byte v4, v0, v3

    .line 172
    .line 173
    if-nez v2, :cond_9

    .line 174
    .line 175
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪世子兰哲苏()V

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    const-class v3, Ljava/lang/String;

    .line 184
    .line 185
    if-ne v0, v3, :cond_a

    .line 186
    .line 187
    check-cast v2, Ljava/lang/String;

    .line 188
    .line 189
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪世兰哲子苏(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_a
    const-class v3, Ljava/lang/Integer;

    .line 194
    .line 195
    if-ne v0, v3, :cond_b

    .line 196
    .line 197
    check-cast v2, Ljava/lang/Integer;

    .line 198
    .line 199
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪子哲苏世兰(Ljava/lang/Integer;)V

    .line 200
    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_b
    const-class v3, Ljava/lang/Long;

    .line 204
    .line 205
    if-ne v0, v3, :cond_c

    .line 206
    .line 207
    check-cast v2, Ljava/lang/Long;

    .line 208
    .line 209
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪子哲兰苏世(Ljava/lang/Long;)V

    .line 210
    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_c
    const-class v3, Ljava/lang/Boolean;

    .line 214
    .line 215
    if-ne v0, v3, :cond_d

    .line 216
    .line 217
    check-cast v2, Ljava/lang/Boolean;

    .line 218
    .line 219
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子兰苏楪哲世(Z)V

    .line 224
    .line 225
    .line 226
    goto :goto_2

    .line 227
    :cond_d
    const-class v3, Ljava/math/BigDecimal;

    .line 228
    .line 229
    if-ne v0, v3, :cond_e

    .line 230
    .line 231
    check-cast v2, Ljava/math/BigDecimal;

    .line 232
    .line 233
    const/4 v0, 0x0

    .line 234
    invoke-virtual {p0, v2, v10, v11, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪子世苏哲兰(Ljava/math/BigDecimal;JLjava/text/DecimalFormat;)V

    .line 235
    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_e
    const-class v3, Lcom/alibaba/fastjson2/JSONArray;

    .line 239
    .line 240
    if-ne v0, v3, :cond_f

    .line 241
    .line 242
    check-cast v2, Lcom/alibaba/fastjson2/JSONArray;

    .line 243
    .line 244
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子兰楪哲苏世(Ljava/util/List;)V

    .line 245
    .line 246
    .line 247
    goto :goto_2

    .line 248
    :cond_f
    const-class v3, Lcom/alibaba/fastjson2/JSONObject;

    .line 249
    .line 250
    if-ne v0, v3, :cond_10

    .line 251
    .line 252
    check-cast v2, Lcom/alibaba/fastjson2/JSONObject;

    .line 253
    .line 254
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子兰世楪苏哲(Ljava/util/Map;)V

    .line 255
    .line 256
    .line 257
    goto :goto_2

    .line 258
    :cond_10
    invoke-virtual {v7, v0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Class;)L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    const/4 v4, 0x0

    .line 263
    const-wide/16 v5, 0x0

    .line 264
    .line 265
    const/4 v3, 0x0

    .line 266
    move-object v1, p0

    .line 267
    invoke-interface/range {v0 .. v6}, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 268
    .line 269
    .line 270
    :goto_2
    const/4 v0, 0x0

    .line 271
    goto/16 :goto_0

    .line 272
    .line 273
    :cond_11
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 274
    .line 275
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 276
    .line 277
    array-length v2, v2

    .line 278
    if-ne v0, v2, :cond_12

    .line 279
    .line 280
    add-int/2addr v0, v12

    .line 281
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 282
    .line 283
    .line 284
    :cond_12
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 285
    .line 286
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 287
    .line 288
    add-int/lit8 v3, v2, 0x1

    .line 289
    .line 290
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 291
    .line 292
    const/16 v1, 0x7d

    .line 293
    .line 294
    aput-byte v1, v0, v2

    .line 295
    .line 296
    return-void
.end method

.method public final 飘花落叶言子兰哲世楪苏(IIIIII)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x15

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-le v1, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 14
    .line 15
    :cond_0
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 16
    .line 17
    int-to-byte v3, v1

    .line 18
    aput-byte v3, v2, v0

    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    invoke-static {v2, v0, p1, p2, p3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲世苏楪兰([BIIII)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    const/16 p2, 0x20

    .line 27
    .line 28
    aput-byte p2, v2, p1

    .line 29
    .line 30
    add-int/lit8 p2, p1, 0x1

    .line 31
    .line 32
    invoke-static {v2, p2, p4, p5, p6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲苏楪世兰([BIIII)V

    .line 33
    .line 34
    .line 35
    add-int/lit8 p2, p1, 0x9

    .line 36
    .line 37
    int-to-byte p3, v1

    .line 38
    aput-byte p3, v2, p2

    .line 39
    .line 40
    add-int/lit8 p1, p1, 0xa

    .line 41
    .line 42
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 43
    .line 44
    return-void
.end method

.method public final 飘花落叶言子兰哲世苏楪(IIIIIIIIZ)V
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
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 17
    .line 18
    array-length v4, v1

    .line 19
    if-le v3, v4, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 25
    .line 26
    :cond_2
    iget-char v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 27
    .line 28
    int-to-byte v4, v3

    .line 29
    aput-byte v4, v1, v2

    .line 30
    .line 31
    add-int/2addr v2, v0

    .line 32
    invoke-static {v1, v2, p1, p2, p3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲世苏楪兰([BIIII)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p9, :cond_3

    .line 37
    .line 38
    const/16 p2, 0x54

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_3
    const/16 p2, 0x20

    .line 42
    .line 43
    :goto_1
    int-to-byte p2, p2

    .line 44
    aput-byte p2, v1, p1

    .line 45
    .line 46
    add-int/lit8 p2, p1, 0x1

    .line 47
    .line 48
    invoke-static {v1, p2, p4, p5, p6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲苏楪世兰([BIIII)V

    .line 49
    .line 50
    .line 51
    add-int/lit8 p2, p1, 0x9

    .line 52
    .line 53
    if-lez p7, :cond_6

    .line 54
    .line 55
    div-int/lit8 p3, p7, 0xa

    .line 56
    .line 57
    div-int/lit8 p4, p3, 0xa

    .line 58
    .line 59
    mul-int/lit8 p5, p3, 0xa

    .line 60
    .line 61
    sub-int p5, p7, p5

    .line 62
    .line 63
    const/16 p6, 0x2e

    .line 64
    .line 65
    if-eqz p5, :cond_4

    .line 66
    .line 67
    sget-object p3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲世苏兰:[I

    .line 68
    .line 69
    and-int/lit16 p4, p7, 0x3ff

    .line 70
    .line 71
    aget p3, p3, p4

    .line 72
    .line 73
    and-int/lit16 p3, p3, -0x100

    .line 74
    .line 75
    or-int/2addr p3, p6

    .line 76
    invoke-static {p2, v1, p3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪哲兰世(I[BI)V

    .line 77
    .line 78
    .line 79
    add-int/lit8 p2, p1, 0xd

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    add-int/lit8 p5, p1, 0xa

    .line 83
    .line 84
    aput-byte p6, v1, p2

    .line 85
    .line 86
    mul-int/lit8 p2, p4, 0xa

    .line 87
    .line 88
    sub-int p2, p3, p2

    .line 89
    .line 90
    if-eqz p2, :cond_5

    .line 91
    .line 92
    invoke-static {p5, v1, p3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪哲世(I[BI)V

    .line 93
    .line 94
    .line 95
    add-int/lit8 p2, p1, 0xc

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_5
    add-int/lit8 p2, p1, 0xb

    .line 99
    .line 100
    add-int/lit8 p4, p4, 0x30

    .line 101
    .line 102
    int-to-byte p1, p4

    .line 103
    aput-byte p1, v1, p5

    .line 104
    .line 105
    :cond_6
    :goto_2
    if-eqz p9, :cond_a

    .line 106
    .line 107
    div-int/lit16 p1, p8, 0xe10

    .line 108
    .line 109
    if-nez p8, :cond_7

    .line 110
    .line 111
    add-int/lit8 p1, p2, 0x1

    .line 112
    .line 113
    const/16 p3, 0x5a

    .line 114
    .line 115
    aput-byte p3, v1, p2

    .line 116
    .line 117
    move p2, p1

    .line 118
    goto :goto_4

    .line 119
    :cond_7
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 120
    .line 121
    .line 122
    move-result p3

    .line 123
    if-ltz p1, :cond_8

    .line 124
    .line 125
    const/16 p4, 0x2b

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_8
    const/16 p4, 0x2d

    .line 129
    .line 130
    :goto_3
    aput-byte p4, v1, p2

    .line 131
    .line 132
    add-int/lit8 p4, p2, 0x1

    .line 133
    .line 134
    invoke-static {p4, v1, p3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪哲世(I[BI)V

    .line 135
    .line 136
    .line 137
    add-int/lit8 p3, p2, 0x3

    .line 138
    .line 139
    const/16 p4, 0x3a

    .line 140
    .line 141
    aput-byte p4, v1, p3

    .line 142
    .line 143
    mul-int/lit16 p1, p1, 0xe10

    .line 144
    .line 145
    sub-int/2addr p8, p1

    .line 146
    div-int/lit8 p8, p8, 0x3c

    .line 147
    .line 148
    if-gez p8, :cond_9

    .line 149
    .line 150
    neg-int p8, p8

    .line 151
    :cond_9
    add-int/lit8 p1, p2, 0x4

    .line 152
    .line 153
    invoke-static {p1, v1, p8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪哲世(I[BI)V

    .line 154
    .line 155
    .line 156
    add-int/lit8 p2, p2, 0x6

    .line 157
    .line 158
    :cond_a
    :goto_4
    int-to-byte p1, v3

    .line 159
    aput-byte p1, v1, p2

    .line 160
    .line 161
    add-int/2addr p2, v0

    .line 162
    iput p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 163
    .line 164
    return-void
.end method

.method public final 飘花落叶言子兰哲楪世苏()V
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
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 15
    .line 16
    array-length v4, v1

    .line 17
    if-le v2, v4, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 23
    .line 24
    :cond_0
    add-int/lit8 v2, v0, 0x1

    .line 25
    .line 26
    const/16 v4, 0x2c

    .line 27
    .line 28
    aput-byte v4, v1, v0

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0, v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲兰世子([BI)I

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

.method public final 飘花落叶言子兰哲楪苏世(IIIIII)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x10

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-le v1, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 14
    .line 15
    :cond_0
    iget-char v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 16
    .line 17
    int-to-byte v4, v3

    .line 18
    aput-byte v4, v2, v0

    .line 19
    .line 20
    if-ltz p1, :cond_1

    .line 21
    .line 22
    const/16 v4, 0x270f

    .line 23
    .line 24
    if-gt p1, v4, :cond_1

    .line 25
    .line 26
    div-int/lit8 v4, p1, 0x64

    .line 27
    .line 28
    mul-int/lit8 v5, v4, 0x64

    .line 29
    .line 30
    sub-int/2addr p1, v5

    .line 31
    add-int/lit8 v5, v0, 0x1

    .line 32
    .line 33
    invoke-static {v5, v2, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪哲世(I[BI)V

    .line 34
    .line 35
    .line 36
    add-int/lit8 v4, v0, 0x3

    .line 37
    .line 38
    invoke-static {v4, v2, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪哲世(I[BI)V

    .line 39
    .line 40
    .line 41
    add-int/lit8 p1, v0, 0x5

    .line 42
    .line 43
    invoke-static {p1, v2, p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪哲世(I[BI)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 p1, v0, 0x7

    .line 47
    .line 48
    invoke-static {p1, v2, p3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪哲世(I[BI)V

    .line 49
    .line 50
    .line 51
    add-int/lit8 p1, v0, 0x9

    .line 52
    .line 53
    invoke-static {p1, v2, p4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪哲世(I[BI)V

    .line 54
    .line 55
    .line 56
    add-int/lit8 p1, v0, 0xb

    .line 57
    .line 58
    invoke-static {p1, v2, p5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪哲世(I[BI)V

    .line 59
    .line 60
    .line 61
    add-int/lit8 p1, v0, 0xd

    .line 62
    .line 63
    invoke-static {p1, v2, p6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪哲世(I[BI)V

    .line 64
    .line 65
    .line 66
    add-int/lit8 v0, v0, 0xf

    .line 67
    .line 68
    int-to-byte p1, v3

    .line 69
    aput-byte p1, v2, v0

    .line 70
    .line 71
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 72
    .line 73
    return-void

    .line 74
    :cond_1
    invoke-static {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世(I)Ljava/lang/IllegalArgumentException;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    throw p0
.end method

.method public final 飘花落叶言子兰哲苏世楪(III)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0xa

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-le v1, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 14
    .line 15
    :cond_0
    iget-char v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 16
    .line 17
    int-to-byte v4, v3

    .line 18
    aput-byte v4, v2, v0

    .line 19
    .line 20
    if-ltz p1, :cond_1

    .line 21
    .line 22
    const/16 v4, 0x270f

    .line 23
    .line 24
    if-gt p1, v4, :cond_1

    .line 25
    .line 26
    div-int/lit8 v4, p1, 0x64

    .line 27
    .line 28
    mul-int/lit8 v5, v4, 0x64

    .line 29
    .line 30
    sub-int/2addr p1, v5

    .line 31
    add-int/lit8 v5, v0, 0x1

    .line 32
    .line 33
    invoke-static {v5, v2, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪哲世(I[BI)V

    .line 34
    .line 35
    .line 36
    add-int/lit8 v4, v0, 0x3

    .line 37
    .line 38
    invoke-static {v4, v2, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪哲世(I[BI)V

    .line 39
    .line 40
    .line 41
    add-int/lit8 p1, v0, 0x5

    .line 42
    .line 43
    invoke-static {p1, v2, p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪哲世(I[BI)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 p1, v0, 0x7

    .line 47
    .line 48
    invoke-static {p1, v2, p3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪哲世(I[BI)V

    .line 49
    .line 50
    .line 51
    add-int/lit8 v0, v0, 0x9

    .line 52
    .line 53
    int-to-byte p1, v3

    .line 54
    aput-byte p1, v2, v0

    .line 55
    .line 56
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    invoke-static {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世(I)Ljava/lang/IllegalArgumentException;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    throw p0
.end method

.method public final 飘花落叶言子兰哲苏楪世(III)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0xd

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-le v1, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 14
    .line 15
    :cond_0
    add-int/lit8 v1, v0, 0x1

    .line 16
    .line 17
    iget-char v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 18
    .line 19
    int-to-byte v4, v3

    .line 20
    aput-byte v4, v2, v0

    .line 21
    .line 22
    invoke-static {v2, v1, p1, p2, p3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲世苏楪兰([BIIII)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    int-to-byte p2, v3

    .line 27
    aput-byte p2, v2, p1

    .line 28
    .line 29
    add-int/lit8 p1, p1, 0x1

    .line 30
    .line 31
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 32
    .line 33
    return-void
.end method

.method public final 飘花落叶言子兰楪哲世苏()V
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
    add-int/lit8 v2, v1, 0x3

    .line 18
    .line 19
    iget-byte v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪兰哲苏:B

    .line 20
    .line 21
    mul-int/2addr v0, v3

    .line 22
    add-int/2addr v0, v2

    .line 23
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 24
    .line 25
    array-length v4, v2

    .line 26
    if-le v0, v4, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 32
    .line 33
    :cond_0
    add-int/lit8 v0, v1, 0x1

    .line 34
    .line 35
    const/16 v4, 0x7b

    .line 36
    .line 37
    aput-byte v4, v2, v1

    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0, v2, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲兰世子([BI)I

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
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲兰楪世苏()V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    throw p0
.end method

.method public final 飘花落叶言子兰楪哲苏世(Ljava/util/List;)V
    .locals 13

    .line 1
    iget-object v7, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v2, v7, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    const-wide/32 v4, 0x4031000

    .line 6
    .line 7
    .line 8
    and-long/2addr v2, v4

    .line 9
    const-wide/16 v8, 0x0

    .line 10
    .line 11
    cmp-long v0, v2, v8

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v7, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v4, 0x0

    .line 24
    const-wide/16 v5, 0x0

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    move-object v1, p0

    .line 28
    move-object v2, p1

    .line 29
    invoke-interface/range {v0 .. v6}, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 34
    .line 35
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 36
    .line 37
    array-length v2, v2

    .line 38
    const/4 v10, 0x1

    .line 39
    if-ne v0, v2, :cond_1

    .line 40
    .line 41
    add-int/2addr v0, v10

    .line 42
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 43
    .line 44
    .line 45
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 46
    .line 47
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 48
    .line 49
    add-int/lit8 v3, v2, 0x1

    .line 50
    .line 51
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 52
    .line 53
    const/16 v3, 0x5b

    .line 54
    .line 55
    aput-byte v3, v0, v2

    .line 56
    .line 57
    const/4 v11, 0x0

    .line 58
    move v0, v10

    .line 59
    move v12, v11

    .line 60
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-ge v12, v2, :cond_c

    .line 65
    .line 66
    invoke-interface {p1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    if-nez v0, :cond_3

    .line 71
    .line 72
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 73
    .line 74
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 75
    .line 76
    array-length v3, v3

    .line 77
    if-ne v0, v3, :cond_2

    .line 78
    .line 79
    add-int/lit8 v0, v0, 0x1

    .line 80
    .line 81
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 82
    .line 83
    .line 84
    :cond_2
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 85
    .line 86
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 87
    .line 88
    add-int/lit8 v4, v3, 0x1

    .line 89
    .line 90
    iput v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 91
    .line 92
    const/16 v4, 0x2c

    .line 93
    .line 94
    aput-byte v4, v0, v3

    .line 95
    .line 96
    :cond_3
    if-nez v2, :cond_4

    .line 97
    .line 98
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪世子兰哲苏()V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    const-class v3, Ljava/lang/String;

    .line 107
    .line 108
    if-ne v0, v3, :cond_5

    .line 109
    .line 110
    check-cast v2, Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪世兰哲子苏(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_5
    const-class v3, Ljava/lang/Integer;

    .line 117
    .line 118
    if-ne v0, v3, :cond_6

    .line 119
    .line 120
    check-cast v2, Ljava/lang/Integer;

    .line 121
    .line 122
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪子哲苏世兰(Ljava/lang/Integer;)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_6
    const-class v3, Ljava/lang/Long;

    .line 127
    .line 128
    if-ne v0, v3, :cond_7

    .line 129
    .line 130
    check-cast v2, Ljava/lang/Long;

    .line 131
    .line 132
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪子哲兰苏世(Ljava/lang/Long;)V

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_7
    const-class v3, Ljava/lang/Boolean;

    .line 137
    .line 138
    if-ne v0, v3, :cond_8

    .line 139
    .line 140
    check-cast v2, Ljava/lang/Boolean;

    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子兰苏楪哲世(Z)V

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_8
    const-class v3, Ljava/math/BigDecimal;

    .line 151
    .line 152
    if-ne v0, v3, :cond_9

    .line 153
    .line 154
    check-cast v2, Ljava/math/BigDecimal;

    .line 155
    .line 156
    const/4 v0, 0x0

    .line 157
    invoke-virtual {p0, v2, v8, v9, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪子世苏哲兰(Ljava/math/BigDecimal;JLjava/text/DecimalFormat;)V

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_9
    const-class v3, Lcom/alibaba/fastjson2/JSONArray;

    .line 162
    .line 163
    if-ne v0, v3, :cond_a

    .line 164
    .line 165
    check-cast v2, Lcom/alibaba/fastjson2/JSONArray;

    .line 166
    .line 167
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子兰楪哲苏世(Ljava/util/List;)V

    .line 168
    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_a
    const-class v3, Lcom/alibaba/fastjson2/JSONObject;

    .line 172
    .line 173
    if-ne v0, v3, :cond_b

    .line 174
    .line 175
    check-cast v2, Lcom/alibaba/fastjson2/JSONObject;

    .line 176
    .line 177
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子兰世楪苏哲(Ljava/util/Map;)V

    .line 178
    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_b
    invoke-virtual {v7, v0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Class;)L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    const/4 v4, 0x0

    .line 186
    const-wide/16 v5, 0x0

    .line 187
    .line 188
    const/4 v3, 0x0

    .line 189
    move-object v1, p0

    .line 190
    invoke-interface/range {v0 .. v6}, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 191
    .line 192
    .line 193
    :goto_1
    add-int/lit8 v12, v12, 0x1

    .line 194
    .line 195
    move v0, v11

    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :cond_c
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 199
    .line 200
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 201
    .line 202
    array-length v2, v2

    .line 203
    if-ne v0, v2, :cond_d

    .line 204
    .line 205
    add-int/2addr v0, v10

    .line 206
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 207
    .line 208
    .line 209
    :cond_d
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 210
    .line 211
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 212
    .line 213
    add-int/lit8 v3, v2, 0x1

    .line 214
    .line 215
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 216
    .line 217
    const/16 v1, 0x5d

    .line 218
    .line 219
    aput-byte v1, v0, v2

    .line 220
    .line 221
    return-void
.end method

.method public final 飘花落叶言子兰楪苏世哲()V
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
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 22
    .line 23
    array-length v4, v2

    .line 24
    if-le v0, v4, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 30
    .line 31
    :cond_0
    add-int/lit8 v0, v1, 0x1

    .line 32
    .line 33
    const/16 v4, 0x5b

    .line 34
    .line 35
    aput-byte v4, v2, v1

    .line 36
    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0, v2, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲兰世子([BI)I

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
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲兰楪世苏()V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    throw p0
.end method

.method public final 飘花落叶言子兰苏哲世楪()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世兰子(I)[B

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/16 v2, 0x3a

    .line 8
    .line 9
    aput-byte v2, v1, v0

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 14
    .line 15
    return-void
.end method

.method public final 飘花落叶言子兰苏哲楪世(C)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

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
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 14
    .line 15
    :cond_0
    add-int/lit8 v2, v0, 0x1

    .line 16
    .line 17
    iget-char v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 18
    .line 19
    int-to-byte v4, v3

    .line 20
    aput-byte v4, v1, v0

    .line 21
    .line 22
    const/16 v4, 0x7f

    .line 23
    .line 24
    if-gt p1, v4, :cond_3

    .line 25
    .line 26
    const/16 v4, 0x5c

    .line 27
    .line 28
    if-eq p1, v4, :cond_2

    .line 29
    .line 30
    packed-switch p1, :pswitch_data_0

    .line 31
    .line 32
    .line 33
    if-ne p1, v3, :cond_1

    .line 34
    .line 35
    aput-byte v4, v1, v2

    .line 36
    .line 37
    add-int/lit8 p1, v0, 0x2

    .line 38
    .line 39
    int-to-byte v2, v3

    .line 40
    aput-byte v2, v1, p1

    .line 41
    .line 42
    :goto_0
    add-int/lit8 v0, v0, 0x3

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    add-int/lit8 v0, v0, 0x2

    .line 46
    .line 47
    int-to-byte p1, p1

    .line 48
    aput-byte p1, v1, v2

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :pswitch_0
    invoke-static {v2, v1, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰哲苏(I[BI)V

    .line 52
    .line 53
    .line 54
    add-int/lit8 v0, v0, 0x7

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    :pswitch_1
    invoke-static {v2, v1, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世哲苏兰(I[BI)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    const v4, 0xd800

    .line 62
    .line 63
    .line 64
    if-lt p1, v4, :cond_5

    .line 65
    .line 66
    const v4, 0xe000

    .line 67
    .line 68
    .line 69
    if-lt p1, v4, :cond_4

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_4
    const-string p0, "illegal char "

    .line 73
    .line 74
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲(ILjava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_5
    :goto_1
    const/16 v4, 0x7ff

    .line 79
    .line 80
    if-le p1, v4, :cond_6

    .line 81
    .line 82
    shr-int/lit8 v4, p1, 0xc

    .line 83
    .line 84
    and-int/lit8 v4, v4, 0xf

    .line 85
    .line 86
    or-int/lit16 v4, v4, 0xe0

    .line 87
    .line 88
    int-to-byte v4, v4

    .line 89
    aput-byte v4, v1, v2

    .line 90
    .line 91
    add-int/lit8 v2, v0, 0x2

    .line 92
    .line 93
    shr-int/lit8 v4, p1, 0x6

    .line 94
    .line 95
    and-int/lit8 v4, v4, 0x3f

    .line 96
    .line 97
    or-int/lit16 v4, v4, 0x80

    .line 98
    .line 99
    int-to-byte v4, v4

    .line 100
    aput-byte v4, v1, v2

    .line 101
    .line 102
    add-int/lit8 v2, v0, 0x3

    .line 103
    .line 104
    and-int/lit8 p1, p1, 0x3f

    .line 105
    .line 106
    or-int/lit16 p1, p1, 0x80

    .line 107
    .line 108
    int-to-byte p1, p1

    .line 109
    aput-byte p1, v1, v2

    .line 110
    .line 111
    add-int/lit8 v0, v0, 0x4

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_6
    shr-int/lit8 v4, p1, 0x6

    .line 115
    .line 116
    and-int/lit8 v4, v4, 0x1f

    .line 117
    .line 118
    or-int/lit16 v4, v4, 0xc0

    .line 119
    .line 120
    int-to-byte v4, v4

    .line 121
    aput-byte v4, v1, v2

    .line 122
    .line 123
    add-int/lit8 v2, v0, 0x2

    .line 124
    .line 125
    and-int/lit8 p1, p1, 0x3f

    .line 126
    .line 127
    or-int/lit16 p1, p1, 0x80

    .line 128
    .line 129
    int-to-byte p1, p1

    .line 130
    aput-byte p1, v1, v2

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :goto_2
    int-to-byte p1, v3

    .line 134
    aput-byte p1, v1, v0

    .line 135
    .line 136
    add-int/lit8 v0, v0, 0x1

    .line 137
    .line 138
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 139
    .line 140
    return-void

    .line 141
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

.method public final 飘花落叶言子兰苏楪哲世(Z)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5

    .line 4
    .line 5
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 6
    .line 7
    array-length v2, v1

    .line 8
    if-le v0, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

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
    const-wide/16 v4, 0x80

    .line 22
    .line 23
    and-long/2addr v2, v4

    .line 24
    const-wide/16 v4, 0x0

    .line 25
    .line 26
    cmp-long v2, v2, v4

    .line 27
    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    add-int/lit8 v2, v0, 0x1

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    const/16 p1, 0x31

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/16 p1, 0x30

    .line 38
    .line 39
    :goto_0
    int-to-byte p1, p1

    .line 40
    aput-byte p1, v1, v0

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    invoke-static {v1, v0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世兰苏哲楪([BIZ)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    :goto_1
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 48
    .line 49
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
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 23
    .line 24
    array-length v5, v0

    .line 25
    if-le v2, v5, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 31
    .line 32
    :cond_1
    if-eqz v4, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0, v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲兰世子([BI)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    :cond_2
    const/16 v2, 0x5d

    .line 39
    .line 40
    aput-byte v2, v0, v1

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

.method public final 飘花落叶言子楪苏世哲兰()V
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
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 23
    .line 24
    array-length v5, v0

    .line 25
    if-le v2, v5, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 31
    .line 32
    :cond_1
    if-eqz v4, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0, v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲兰世子([BI)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    :cond_2
    const/16 v2, 0x7d

    .line 39
    .line 40
    aput-byte v2, v0, v1

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

.method public final 飘花落叶言楪世兰哲子苏(Ljava/lang/String;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪苏世子兰哲()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏哲世:Ljava/util/function/Function;

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, [B

    .line 16
    .line 17
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏世哲:Ljava/util/function/ToIntFunction;

    .line 18
    .line 19
    invoke-interface {v1, p1}, Ljava/util/function/ToIntFunction;->applyAsInt(Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏兰哲子世([B)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏兰哲世子([B)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_2
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏兰世哲子(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final 飘花落叶言楪世兰哲苏子(Ljava/util/List;)V
    .locals 5

    .line 1
    iget-byte v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪兰哲苏:B

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世兰哲苏子(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世兰子(I)[B

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/16 v2, 0x5b

    .line 16
    .line 17
    aput-byte v2, v1, v0

    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x0

    .line 28
    :goto_0
    if-ge v1, v0, :cond_5

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 33
    .line 34
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世兰子(I)[B

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    const/16 v4, 0x2c

    .line 39
    .line 40
    aput-byte v4, v3, v2

    .line 41
    .line 42
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 45
    .line 46
    :cond_1
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Ljava/lang/String;

    .line 51
    .line 52
    if-nez v2, :cond_2

    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪苏世子兰哲()V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    sget-object v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏哲世:Ljava/util/function/Function;

    .line 59
    .line 60
    if-eqz v3, :cond_4

    .line 61
    .line 62
    invoke-interface {v3, v2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, [B

    .line 67
    .line 68
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏世哲:Ljava/util/function/ToIntFunction;

    .line 69
    .line 70
    invoke-interface {v4, v2}, Ljava/util/function/ToIntFunction;->applyAsInt(Ljava/lang/Object;)I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_3

    .line 75
    .line 76
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏兰哲子世([B)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏兰哲世子([B)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏兰世哲子(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_5
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 91
    .line 92
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世兰子(I)[B

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    const/16 v1, 0x5d

    .line 97
    .line 98
    aput-byte v1, v0, p1

    .line 99
    .line 100
    add-int/lit8 p1, p1, 0x1

    .line 101
    .line 102
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 103
    .line 104
    return-void
.end method

.method public final 飘花落叶言楪世兰子哲苏(I)V
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
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏兰子世哲()V

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪子哲世兰苏(I)V

    .line 25
    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏兰子世哲()V

    .line 30
    .line 31
    .line 32
    :cond_2
    return-void
.end method

.method public final 飘花落叶言楪世兰子苏哲(B)V
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
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏兰子世哲()V

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪子兰世哲苏(B)V

    .line 25
    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏兰子世哲()V

    .line 30
    .line 31
    .line 32
    :cond_2
    return-void
.end method

.method public final 飘花落叶言楪世兰苏哲子(J)V
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
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏兰子世哲()V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪子哲兰世苏(J)V

    .line 30
    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏兰子世哲()V

    .line 35
    .line 36
    .line 37
    :cond_2
    return-void
.end method

.method public final 飘花落叶言楪世兰苏子哲(I[C)V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BrowserSecure:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 6
    .line 7
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 8
    .line 9
    and-long/2addr v2, v0

    .line 10
    const-wide/16 v4, 0x0

    .line 11
    .line 12
    cmp-long v2, v2, v4

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v6, 0x1

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    move v10, v6

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v10, v3

    .line 21
    :goto_0
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->EscapeNoneAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 22
    .line 23
    iget-wide v7, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 24
    .line 25
    and-long/2addr v0, v7

    .line 26
    cmp-long v0, v0, v4

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    move v11, v6

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v11, v3

    .line 33
    :goto_1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 34
    .line 35
    mul-int/lit8 v1, p1, 0x3

    .line 36
    .line 37
    add-int v2, v0, v1

    .line 38
    .line 39
    add-int/lit8 v2, v2, 0x2

    .line 40
    .line 41
    if-nez v11, :cond_2

    .line 42
    .line 43
    if-eqz v10, :cond_3

    .line 44
    .line 45
    :cond_2
    add-int/2addr v2, v1

    .line 46
    :cond_3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 47
    .line 48
    array-length v4, v1

    .line 49
    if-le v2, v4, :cond_4

    .line 50
    .line 51
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 55
    .line 56
    :cond_4
    add-int/lit8 v2, v0, 0x1

    .line 57
    .line 58
    iget-char v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 59
    .line 60
    int-to-byte v5, v4

    .line 61
    aput-byte v5, v1, v0

    .line 62
    .line 63
    move v12, v3

    .line 64
    :goto_2
    if-ge v12, p1, :cond_6

    .line 65
    .line 66
    aget-char v0, p2, v12

    .line 67
    .line 68
    if-eq v0, v4, :cond_6

    .line 69
    .line 70
    const/16 v3, 0x5c

    .line 71
    .line 72
    if-eq v0, v3, :cond_6

    .line 73
    .line 74
    const/16 v3, 0x20

    .line 75
    .line 76
    if-lt v0, v3, :cond_6

    .line 77
    .line 78
    const/16 v3, 0x7f

    .line 79
    .line 80
    if-gt v0, v3, :cond_6

    .line 81
    .line 82
    if-eqz v10, :cond_5

    .line 83
    .line 84
    const/16 v3, 0x3c

    .line 85
    .line 86
    if-eq v0, v3, :cond_6

    .line 87
    .line 88
    const/16 v3, 0x3e

    .line 89
    .line 90
    if-eq v0, v3, :cond_6

    .line 91
    .line 92
    const/16 v3, 0x28

    .line 93
    .line 94
    if-eq v0, v3, :cond_6

    .line 95
    .line 96
    const/16 v3, 0x29

    .line 97
    .line 98
    if-ne v0, v3, :cond_5

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_5
    add-int/lit8 v3, v2, 0x1

    .line 102
    .line 103
    int-to-byte v0, v0

    .line 104
    aput-byte v0, v1, v2

    .line 105
    .line 106
    add-int/lit8 v12, v12, 0x1

    .line 107
    .line 108
    move v2, v3

    .line 109
    goto :goto_2

    .line 110
    :cond_6
    :goto_3
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 111
    .line 112
    move-object v7, p0

    .line 113
    if-ge v12, p1, :cond_7

    .line 114
    .line 115
    move v9, p1

    .line 116
    move-object v8, p2

    .line 117
    invoke-virtual/range {v7 .. v12}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏兰世子哲([CIZZI)V

    .line 118
    .line 119
    .line 120
    :cond_7
    iget-object p0, v7, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 121
    .line 122
    iget p1, v7, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 123
    .line 124
    add-int/lit8 p2, p1, 0x1

    .line 125
    .line 126
    iput p2, v7, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 127
    .line 128
    aput-byte v5, p0, p1

    .line 129
    .line 130
    return-void
.end method

.method public final 飘花落叶言楪世哲兰子苏(Ljava/lang/String;)V
    .locals 9

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪兰苏哲:Ljava/lang/String;

    .line 2
    .line 3
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 4
    .line 5
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 6
    .line 7
    add-int/lit8 v2, v0, 0x8

    .line 8
    .line 9
    array-length v3, v1

    .line 10
    if-le v2, v3, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 16
    .line 17
    :cond_0
    move-object v4, v1

    .line 18
    sget-object v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 19
    .line 20
    sget-wide v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲:J

    .line 21
    .line 22
    int-to-long v0, v0

    .line 23
    add-long/2addr v5, v0

    .line 24
    sget-wide v7, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世哲楪苏兰:J

    .line 25
    .line 26
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 27
    .line 28
    .line 29
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪世兰哲子苏(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/16 p1, 0x7d

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪世苏兰子哲(B)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final 飘花落叶言楪世哲子苏兰(CC)V
    .locals 4

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    if-gt p1, v0, :cond_1

    .line 4
    .line 5
    if-gt p2, v0, :cond_1

    .line 6
    .line 7
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 8
    .line 9
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 10
    .line 11
    add-int/lit8 v2, v0, 0x2

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    if-le v2, v3, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 20
    .line 21
    :cond_0
    int-to-byte p1, p1

    .line 22
    aput-byte p1, v1, v0

    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    int-to-byte p1, p2

    .line 27
    aput-byte p1, v1, v0

    .line 28
    .line 29
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 33
    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v1, "not support "

    .line 37
    .line 38
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p1, ", "

    .line 45
    .line 46
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p0
.end method

.method public final 飘花落叶言楪世哲苏兰子([B)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    add-int/2addr v1, v0

    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 6
    .line 7
    array-length v2, v2

    .line 8
    if-le v1, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 14
    .line 15
    array-length v2, p1

    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-static {p1, v3, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 18
    .line 19
    .line 20
    array-length p1, p1

    .line 21
    add-int/2addr v0, p1

    .line 22
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 23
    .line 24
    return-void
.end method

.method public final 飘花落叶言楪世哲苏子兰(Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)[C

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 6
    .line 7
    array-length v1, p1

    .line 8
    mul-int/lit8 v1, v1, 0x3

    .line 9
    .line 10
    add-int/2addr v1, v0

    .line 11
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 12
    .line 13
    array-length v3, v2

    .line 14
    if-le v1, v3, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 20
    .line 21
    :cond_0
    const/4 v1, 0x0

    .line 22
    :goto_0
    array-length v3, p1

    .line 23
    if-ge v1, v3, :cond_3

    .line 24
    .line 25
    aget-char v3, p1, v1

    .line 26
    .line 27
    const/4 v4, 0x1

    .line 28
    if-lt v3, v4, :cond_1

    .line 29
    .line 30
    const/16 v4, 0x7f

    .line 31
    .line 32
    if-gt v3, v4, :cond_1

    .line 33
    .line 34
    add-int/lit8 v4, v0, 0x1

    .line 35
    .line 36
    int-to-byte v3, v3

    .line 37
    aput-byte v3, v2, v0

    .line 38
    .line 39
    move v0, v4

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const/16 v4, 0x7ff

    .line 42
    .line 43
    if-le v3, v4, :cond_2

    .line 44
    .line 45
    shr-int/lit8 v4, v3, 0xc

    .line 46
    .line 47
    and-int/lit8 v4, v4, 0xf

    .line 48
    .line 49
    or-int/lit16 v4, v4, 0xe0

    .line 50
    .line 51
    int-to-byte v4, v4

    .line 52
    aput-byte v4, v2, v0

    .line 53
    .line 54
    add-int/lit8 v4, v0, 0x1

    .line 55
    .line 56
    shr-int/lit8 v5, v3, 0x6

    .line 57
    .line 58
    and-int/lit8 v5, v5, 0x3f

    .line 59
    .line 60
    or-int/lit16 v5, v5, 0x80

    .line 61
    .line 62
    int-to-byte v5, v5

    .line 63
    aput-byte v5, v2, v4

    .line 64
    .line 65
    add-int/lit8 v4, v0, 0x2

    .line 66
    .line 67
    and-int/lit8 v3, v3, 0x3f

    .line 68
    .line 69
    or-int/lit16 v3, v3, 0x80

    .line 70
    .line 71
    int-to-byte v3, v3

    .line 72
    aput-byte v3, v2, v4

    .line 73
    .line 74
    add-int/lit8 v0, v0, 0x3

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    shr-int/lit8 v4, v3, 0x6

    .line 78
    .line 79
    and-int/lit8 v4, v4, 0x1f

    .line 80
    .line 81
    or-int/lit16 v4, v4, 0xc0

    .line 82
    .line 83
    int-to-byte v4, v4

    .line 84
    aput-byte v4, v2, v0

    .line 85
    .line 86
    add-int/lit8 v4, v0, 0x1

    .line 87
    .line 88
    and-int/lit8 v3, v3, 0x3f

    .line 89
    .line 90
    or-int/lit16 v3, v3, 0x80

    .line 91
    .line 92
    int-to-byte v3, v3

    .line 93
    aput-byte v3, v2, v4

    .line 94
    .line 95
    add-int/lit8 v0, v0, 0x2

    .line 96
    .line 97
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_3
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 101
    .line 102
    return-void
.end method

.method public final 飘花落叶言楪世子兰哲苏()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 4
    .line 5
    add-int/lit8 v2, v0, 0x4

    .line 6
    .line 7
    array-length v3, v1

    .line 8
    if-le v2, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 14
    .line 15
    :cond_0
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏世兰哲楪([BI)V

    .line 16
    .line 17
    .line 18
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 19
    .line 20
    return-void
.end method

.method public final 飘花落叶言楪世子兰苏哲([C)V
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

.method public final 飘花落叶言楪世子哲兰苏([B)V
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
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 14
    .line 15
    array-length v4, v1

    .line 16
    if-le v2, v4, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

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
    aput-byte v5, v1, v0

    .line 36
    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    invoke-virtual {p0, v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲兰世子([BI)I

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

.method public final 飘花落叶言楪世苏兰哲子(C)V
    .locals 3

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    if-gt p1, v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 6
    .line 7
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 8
    .line 9
    array-length v1, v1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 20
    .line 21
    add-int/lit8 v2, v1, 0x1

    .line 22
    .line 23
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 24
    .line 25
    int-to-byte p0, p1

    .line 26
    aput-byte p0, v0, v1

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    const-string p0, "not support "

    .line 30
    .line 31
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲(ILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final 飘花落叶言楪世苏兰子哲(B)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世兰子(I)[B

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    aput-byte p1, v1, v0

    .line 8
    .line 9
    add-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 12
    .line 13
    return-void
.end method

.method public final 飘花落叶言楪世苏哲兰子(Ljava/time/OffsetTime;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪世子兰哲苏()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 8
    .line 9
    add-int/lit8 v1, v0, 0x1c

    .line 10
    .line 11
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 12
    .line 13
    array-length v3, v2

    .line 14
    if-le v1, v3, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 20
    .line 21
    :cond_1
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 22
    .line 23
    int-to-byte v3, v1

    .line 24
    aput-byte v3, v2, v0

    .line 25
    .line 26
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/time/OffsetTime;->toLocalTime()Ljava/time/LocalTime;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-static {v2, v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲世兰楪苏([BILjava/time/LocalTime;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-virtual {p1}, Ljava/time/OffsetTime;->getOffset()Ljava/time/ZoneOffset;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-nez v3, :cond_2

    .line 45
    .line 46
    add-int/lit8 p1, v0, 0x1

    .line 47
    .line 48
    const/16 v3, 0x5a

    .line 49
    .line 50
    aput-byte v3, v2, v0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    invoke-virtual {p1}, Ljava/time/ZoneOffset;->getId()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const/4 v3, 0x0

    .line 58
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    invoke-virtual {p1, v3, v4, v2, v0}, Ljava/lang/String;->getBytes(II[BI)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    add-int/2addr p1, v0

    .line 70
    :goto_0
    int-to-byte v0, v1

    .line 71
    aput-byte v0, v2, p1

    .line 72
    .line 73
    add-int/lit8 p1, p1, 0x1

    .line 74
    .line 75
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 76
    .line 77
    return-void
.end method

.method public final 飘花落叶言楪世苏哲子兰(Ljava/time/OffsetDateTime;)V
    .locals 7

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪世子兰哲苏()V

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
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 12
    .line 13
    array-length v3, v2

    .line 14
    if-le v1, v3, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 20
    .line 21
    :cond_1
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 22
    .line 23
    int-to-byte v3, v1

    .line 24
    aput-byte v3, v2, v0

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/time/OffsetDateTime;->toLocalDateTime()Ljava/time/LocalDateTime;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v3}, Ljava/time/LocalDateTime;->toLocalDate()Ljava/time/LocalDate;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    add-int/lit8 v0, v0, 0x1

    .line 35
    .line 36
    invoke-virtual {v4}, Ljava/time/LocalDate;->getYear()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    invoke-virtual {v4}, Ljava/time/LocalDate;->getMonthValue()I

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    invoke-virtual {v4}, Ljava/time/LocalDate;->getDayOfMonth()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    invoke-static {v2, v0, v5, v6, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲世苏楪兰([BIIII)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const/16 v4, 0x54

    .line 53
    .line 54
    aput-byte v4, v2, v0

    .line 55
    .line 56
    add-int/lit8 v0, v0, 0x1

    .line 57
    .line 58
    invoke-virtual {v3}, Ljava/time/LocalDateTime;->toLocalTime()Ljava/time/LocalTime;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-static {v2, v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲世兰楪苏([BILjava/time/LocalTime;)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    invoke-virtual {p1}, Ljava/time/OffsetDateTime;->getOffset()Ljava/time/ZoneOffset;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-nez v3, :cond_2

    .line 75
    .line 76
    add-int/lit8 p1, v0, 0x1

    .line 77
    .line 78
    const/16 v3, 0x5a

    .line 79
    .line 80
    aput-byte v3, v2, v0

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    invoke-virtual {p1}, Ljava/time/ZoneOffset;->getId()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    const/4 v3, 0x0

    .line 88
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    invoke-virtual {p1, v3, v4, v2, v0}, Ljava/lang/String;->getBytes(II[BI)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    add-int/2addr p1, v0

    .line 100
    :goto_0
    int-to-byte v0, v1

    .line 101
    aput-byte v0, v2, p1

    .line 102
    .line 103
    add-int/lit8 p1, p1, 0x1

    .line 104
    .line 105
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 106
    .line 107
    return-void
.end method

.method public final 飘花落叶言楪子世兰苏哲([D)V
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪世子兰哲苏()V

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
    invoke-static {v4, v5, v3, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    iget-object v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 37
    .line 38
    array-length v6, v5

    .line 39
    if-le v4, v6, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 42
    .line 43
    .line 44
    iget-object v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 45
    .line 46
    :cond_2
    add-int/lit8 v4, v3, 0x1

    .line 47
    .line 48
    const/16 v6, 0x5b

    .line 49
    .line 50
    aput-byte v6, v5, v3

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
    aput-byte v6, v5, v4

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
    aput-byte v3, v5, v4

    .line 71
    .line 72
    move v4, v6

    .line 73
    :cond_4
    aget-wide v6, p1, v1

    .line 74
    .line 75
    invoke-static {v5, v4, v6, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏世哲兰([BID)I

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
    aput-byte v3, v5, v4

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
    aput-byte p1, v5, v4

    .line 92
    .line 93
    add-int/2addr v4, v2

    .line 94
    iput v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 95
    .line 96
    return-void
.end method

.method public final 飘花落叶言楪子世哲苏兰(D)V
    .locals 5

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
    add-int/lit8 v2, v1, 0x1a

    .line 20
    .line 21
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 22
    .line 23
    array-length v4, v3

    .line 24
    if-le v2, v4, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 27
    .line 28
    .line 29
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 30
    .line 31
    :cond_1
    const/16 v2, 0x22

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    add-int/lit8 v4, v1, 0x1

    .line 36
    .line 37
    aput-byte v2, v3, v1

    .line 38
    .line 39
    move v1, v4

    .line 40
    :cond_2
    invoke-static {v3, v1, p1, p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏世哲兰([BID)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    add-int/lit8 p2, p1, 0x1

    .line 47
    .line 48
    aput-byte v2, v3, p1

    .line 49
    .line 50
    move p1, p2

    .line 51
    :cond_3
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 52
    .line 53
    return-void
.end method

.method public final 飘花落叶言楪子世苏哲兰(Ljava/math/BigDecimal;JLjava/text/DecimalFormat;)V
    .locals 16

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
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子世苏兰哲()V

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
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪世哲苏子兰(Ljava/lang/String;)V

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
    invoke-static {v1, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世兰哲楪苏(Ljava/math/BigDecimal;J)Z

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
    iget-object v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 53
    .line 54
    array-length v9, v7

    .line 55
    if-le v8, v9, :cond_2

    .line 56
    .line 57
    invoke-virtual {v0, v8}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 58
    .line 59
    .line 60
    iget-object v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

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
    aput-byte v8, v7, v6

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
    const/4 v3, 0x0

    .line 81
    const/4 v11, 0x1

    .line 82
    if-eqz v2, :cond_4

    .line 83
    .line 84
    move v2, v11

    .line 85
    goto :goto_0

    .line 86
    :cond_4
    move v2, v3

    .line 87
    :goto_0
    const/16 v12, 0x13

    .line 88
    .line 89
    if-ge v4, v12, :cond_c

    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/math/BigDecimal;->scale()I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-ltz v4, :cond_c

    .line 96
    .line 97
    sget-wide v12, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世兰哲:J

    .line 98
    .line 99
    const-wide/16 v14, -0x1

    .line 100
    .line 101
    cmp-long v14, v12, v14

    .line 102
    .line 103
    if-eqz v14, :cond_c

    .line 104
    .line 105
    sget-object v14, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 106
    .line 107
    invoke-virtual {v14, v1, v12, v13}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 108
    .line 109
    .line 110
    move-result-wide v12

    .line 111
    const-wide/high16 v14, -0x8000000000000000L

    .line 112
    .line 113
    cmp-long v14, v12, v14

    .line 114
    .line 115
    if-eqz v14, :cond_c

    .line 116
    .line 117
    if-nez v2, :cond_c

    .line 118
    .line 119
    sget-short v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰世哲苏:S

    .line 120
    .line 121
    cmp-long v2, v12, v9

    .line 122
    .line 123
    if-gez v2, :cond_5

    .line 124
    .line 125
    add-int/lit8 v2, v6, 0x1

    .line 126
    .line 127
    const/16 v9, 0x2d

    .line 128
    .line 129
    invoke-static {v7, v6, v9}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世兰哲苏楪([BIB)V

    .line 130
    .line 131
    .line 132
    neg-long v12, v12

    .line 133
    move v6, v2

    .line 134
    :cond_5
    if-eqz v4, :cond_6

    .line 135
    .line 136
    invoke-static {v12, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏哲兰楪世(J)I

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    sub-int v9, v2, v4

    .line 141
    .line 142
    if-nez v9, :cond_7

    .line 143
    .line 144
    invoke-static {v7, v6, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏哲世楪兰([BIS)V

    .line 145
    .line 146
    .line 147
    add-int/lit8 v6, v6, 0x2

    .line 148
    .line 149
    :cond_6
    move/from16 p2, v8

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_7
    const/16 v10, 0x30

    .line 153
    .line 154
    if-gez v9, :cond_8

    .line 155
    .line 156
    invoke-static {v7, v6, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏哲世楪兰([BIS)V

    .line 157
    .line 158
    .line 159
    add-int/lit8 v6, v6, 0x2

    .line 160
    .line 161
    :goto_1
    neg-int v1, v9

    .line 162
    if-ge v3, v1, :cond_6

    .line 163
    .line 164
    add-int/lit8 v1, v6, 0x1

    .line 165
    .line 166
    invoke-static {v7, v6, v10}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世兰哲苏楪([BIB)V

    .line 167
    .line 168
    .line 169
    add-int/lit8 v3, v3, 0x1

    .line 170
    .line 171
    move v6, v1

    .line 172
    goto :goto_1

    .line 173
    :cond_8
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰世苏哲:[J

    .line 174
    .line 175
    add-int/lit8 v14, v4, -0x1

    .line 176
    .line 177
    aget-wide v14, v1, v14

    .line 178
    .line 179
    move/from16 p2, v8

    .line 180
    .line 181
    move/from16 p1, v9

    .line 182
    .line 183
    div-long v8, v12, v14

    .line 184
    .line 185
    mul-long/2addr v14, v8

    .line 186
    sub-long/2addr v12, v14

    .line 187
    invoke-static {v8, v9, v7, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲楪苏世兰(J[BI)I

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    const/16 v6, 0x2e

    .line 192
    .line 193
    invoke-static {v7, v1, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世兰哲苏楪([BIB)V

    .line 194
    .line 195
    .line 196
    const/4 v6, 0x2

    .line 197
    if-ne v4, v11, :cond_9

    .line 198
    .line 199
    add-int/lit8 v2, v1, 0x1

    .line 200
    .line 201
    const-wide/16 v3, 0x30

    .line 202
    .line 203
    add-long/2addr v12, v3

    .line 204
    long-to-int v3, v12

    .line 205
    int-to-byte v3, v3

    .line 206
    invoke-static {v7, v2, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世兰哲苏楪([BIB)V

    .line 207
    .line 208
    .line 209
    add-int/2addr v1, v6

    .line 210
    goto :goto_5

    .line 211
    :cond_9
    if-ne v4, v6, :cond_a

    .line 212
    .line 213
    add-int/lit8 v2, v1, 0x1

    .line 214
    .line 215
    long-to-int v3, v12

    .line 216
    invoke-static {v2, v7, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰楪哲世(I[BI)V

    .line 217
    .line 218
    .line 219
    add-int/lit8 v1, v1, 0x3

    .line 220
    .line 221
    goto :goto_5

    .line 222
    :cond_a
    invoke-static {v12, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏哲兰楪世(J)I

    .line 223
    .line 224
    .line 225
    move-result v4

    .line 226
    sub-int/2addr v2, v4

    .line 227
    sub-int v2, v2, p1

    .line 228
    .line 229
    :goto_2
    if-ge v3, v2, :cond_b

    .line 230
    .line 231
    add-int/lit8 v1, v1, 0x1

    .line 232
    .line 233
    invoke-static {v7, v1, v10}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世兰哲苏楪([BIB)V

    .line 234
    .line 235
    .line 236
    add-int/lit8 v3, v3, 0x1

    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_b
    add-int/2addr v1, v11

    .line 240
    invoke-static {v12, v13, v7, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲楪苏世兰(J[BI)I

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    goto :goto_5

    .line 245
    :goto_3
    invoke-static {v12, v13, v7, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲楪苏世兰(J[BI)I

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    goto :goto_5

    .line 250
    :cond_c
    move/from16 p2, v8

    .line 251
    .line 252
    if-eqz v2, :cond_d

    .line 253
    .line 254
    invoke-virtual {v1}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    goto :goto_4

    .line 259
    :cond_d
    invoke-virtual {v1}, Ljava/math/BigDecimal;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    :goto_4
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 264
    .line 265
    .line 266
    move-result v2

    .line 267
    invoke-virtual {v1, v3, v2, v7, v6}, Ljava/lang/String;->getBytes(II[BI)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 271
    .line 272
    .line 273
    move-result v1

    .line 274
    add-int/2addr v1, v6

    .line 275
    :goto_5
    if-eqz v5, :cond_e

    .line 276
    .line 277
    add-int/lit8 v2, v1, 0x1

    .line 278
    .line 279
    aput-byte p2, v7, v1

    .line 280
    .line 281
    move v1, v2

    .line 282
    :cond_e
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 283
    .line 284
    return-void
.end method

.method public final 飘花落叶言楪子兰世哲苏(B)V
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
    add-int/lit8 v2, v1, 0x5

    .line 20
    .line 21
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 22
    .line 23
    array-length v4, v3

    .line 24
    if-le v2, v4, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 27
    .line 28
    .line 29
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

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
    int-to-byte v5, v2

    .line 38
    aput-byte v5, v3, v1

    .line 39
    .line 40
    move v1, v4

    .line 41
    :cond_2
    invoke-static {v3, v1, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲世楪苏兰([BIB)I

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
    int-to-byte v1, v2

    .line 50
    aput-byte v1, v3, p1

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

.method public final 飘花落叶言楪子兰世苏哲([J)V
    .locals 9

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪世子兰哲苏()V

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
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 16
    .line 17
    array-length v3, v1

    .line 18
    if-le v2, v3, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 24
    .line 25
    :cond_1
    add-int/lit8 v2, v0, 0x1

    .line 26
    .line 27
    const/16 v3, 0x5b

    .line 28
    .line 29
    aput-byte v3, v1, v0

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
    aput-byte v4, v1, v2

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
    invoke-static {v3, v4, v5, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世哲苏楪兰(JJ)Z

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
    int-to-byte v8, v6

    .line 61
    aput-byte v8, v1, v2

    .line 62
    .line 63
    move v2, v7

    .line 64
    :cond_3
    invoke-static {v3, v4, v1, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲楪苏世兰(J[BI)I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v5, :cond_4

    .line 69
    .line 70
    add-int/lit8 v3, v2, 0x1

    .line 71
    .line 72
    int-to-byte v4, v6

    .line 73
    aput-byte v4, v1, v2

    .line 74
    .line 75
    move v2, v3

    .line 76
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_5
    const/16 p1, 0x5d

    .line 80
    .line 81
    aput-byte p1, v1, v2

    .line 82
    .line 83
    add-int/lit8 v2, v2, 0x1

    .line 84
    .line 85
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 86
    .line 87
    return-void
.end method

.method public final 飘花落叶言楪子兰哲世苏(Ljava/time/LocalDateTime;)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x26

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-le v1, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 14
    .line 15
    :cond_0
    add-int/lit8 v1, v0, 0x1

    .line 16
    .line 17
    iget-char v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 18
    .line 19
    int-to-byte v4, v3

    .line 20
    aput-byte v4, v2, v0

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/time/LocalDateTime;->toLocalDate()Ljava/time/LocalDate;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljava/time/LocalDate;->getYear()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    invoke-virtual {v0}, Ljava/time/LocalDate;->getMonthValue()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    invoke-virtual {v0}, Ljava/time/LocalDate;->getDayOfMonth()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-static {v2, v1, v4, v5, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲世苏楪兰([BIIII)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    add-int/lit8 v1, v0, 0x1

    .line 43
    .line 44
    const/16 v4, 0x20

    .line 45
    .line 46
    aput-byte v4, v2, v0

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/time/LocalDateTime;->toLocalTime()Ljava/time/LocalTime;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {v2, v1, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲世兰楪苏([BILjava/time/LocalTime;)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    int-to-byte v0, v3

    .line 57
    aput-byte v0, v2, p1

    .line 58
    .line 59
    add-int/lit8 p1, p1, 0x1

    .line 60
    .line 61
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 62
    .line 63
    return-void
.end method

.method public final 飘花落叶言楪子兰哲苏世(Ljava/time/LocalTime;)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x14

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-le v1, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 14
    .line 15
    :cond_0
    add-int/lit8 v1, v0, 0x1

    .line 16
    .line 17
    iget-char v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 18
    .line 19
    int-to-byte v4, v3

    .line 20
    aput-byte v4, v2, v0

    .line 21
    .line 22
    invoke-static {v2, v1, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲世兰楪苏([BILjava/time/LocalTime;)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    int-to-byte v0, v3

    .line 27
    aput-byte v0, v2, p1

    .line 28
    .line 29
    add-int/lit8 p1, p1, 0x1

    .line 30
    .line 31
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 32
    .line 33
    return-void
.end method

.method public final 飘花落叶言楪子兰苏世哲([B)V
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪世子兰哲苏()V

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
    const-wide/16 v2, 0x100

    .line 12
    .line 13
    and-long/2addr v0, v2

    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    cmp-long v0, v0, v2

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x1

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    move v0, v2

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move v0, v1

    .line 25
    :goto_0
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 26
    .line 27
    array-length v4, p1

    .line 28
    const/4 v5, 0x5

    .line 29
    const/4 v6, 0x2

    .line 30
    invoke-static {v4, v5, v3, v6}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    iget-object v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 35
    .line 36
    array-length v6, v5

    .line 37
    if-le v4, v6, :cond_2

    .line 38
    .line 39
    invoke-virtual {p0, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 40
    .line 41
    .line 42
    iget-object v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 43
    .line 44
    :cond_2
    add-int/lit8 v4, v3, 0x1

    .line 45
    .line 46
    const/16 v6, 0x5b

    .line 47
    .line 48
    aput-byte v6, v5, v3

    .line 49
    .line 50
    :goto_1
    array-length v3, p1

    .line 51
    if-ge v1, v3, :cond_6

    .line 52
    .line 53
    if-eqz v1, :cond_3

    .line 54
    .line 55
    add-int/lit8 v3, v4, 0x1

    .line 56
    .line 57
    const/16 v6, 0x2c

    .line 58
    .line 59
    aput-byte v6, v5, v4

    .line 60
    .line 61
    move v4, v3

    .line 62
    :cond_3
    iget-char v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 63
    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    add-int/lit8 v6, v4, 0x1

    .line 67
    .line 68
    int-to-byte v7, v3

    .line 69
    aput-byte v7, v5, v4

    .line 70
    .line 71
    move v4, v6

    .line 72
    :cond_4
    aget-byte v6, p1, v1

    .line 73
    .line 74
    invoke-static {v5, v4, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲世楪苏兰([BIB)I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-eqz v0, :cond_5

    .line 79
    .line 80
    add-int/lit8 v6, v4, 0x1

    .line 81
    .line 82
    int-to-byte v3, v3

    .line 83
    aput-byte v3, v5, v4

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
    aput-byte p1, v5, v4

    .line 92
    .line 93
    add-int/2addr v4, v2

    .line 94
    iput v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 95
    .line 96
    return-void
.end method

.method public final 飘花落叶言楪子兰苏哲世(Ljava/time/LocalDate;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪世子兰哲苏()V

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
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 12
    .line 13
    array-length v3, v2

    .line 14
    if-le v1, v3, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 20
    .line 21
    :cond_1
    add-int/lit8 v1, v0, 0x1

    .line 22
    .line 23
    iget-char v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 24
    .line 25
    int-to-byte v3, v3

    .line 26
    aput-byte v3, v2, v0

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/time/LocalDate;->getYear()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p1}, Ljava/time/LocalDate;->getMonthValue()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    invoke-virtual {p1}, Ljava/time/LocalDate;->getDayOfMonth()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    invoke-static {v2, v1, v0, v4, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲世苏楪兰([BIIII)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    aput-byte v3, v2, p1

    .line 45
    .line 46
    add-int/lit8 p1, p1, 0x1

    .line 47
    .line 48
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 49
    .line 50
    return-void
.end method

.method public final 飘花落叶言楪子哲世兰苏(I)V
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
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 22
    .line 23
    array-length v4, v3

    .line 24
    if-le v2, v4, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 27
    .line 28
    .line 29
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

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
    int-to-byte v5, v2

    .line 38
    aput-byte v5, v3, v1

    .line 39
    .line 40
    move v1, v4

    .line 41
    :cond_2
    int-to-long v4, p1

    .line 42
    invoke-static {v4, v5, v3, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰哲楪世(J[BI)I

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
    int-to-byte v1, v2

    .line 51
    aput-byte v1, v3, p1

    .line 52
    .line 53
    move p1, v0

    .line 54
    :cond_3
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 55
    .line 56
    return-void
.end method

.method public final 飘花落叶言楪子哲兰世苏(J)V
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
    iget-object v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 10
    .line 11
    array-length v5, v4

    .line 12
    if-le v3, v5, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 15
    .line 16
    .line 17
    iget-object v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 18
    .line 19
    :cond_0
    invoke-static {p1, p2, v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世哲苏楪兰(JJ)Z

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
    int-to-byte v7, v5

    .line 30
    aput-byte v7, v4, v2

    .line 31
    .line 32
    move v2, v6

    .line 33
    :cond_1
    invoke-static {p1, p2, v4, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲楪苏世兰(J[BI)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    add-int/lit8 p1, v2, 0x1

    .line 40
    .line 41
    int-to-byte p2, v5

    .line 42
    aput-byte p2, v4, v2

    .line 43
    .line 44
    :goto_0
    move v2, p1

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    const-wide/16 v5, 0x200

    .line 47
    .line 48
    and-long/2addr v5, v0

    .line 49
    const-wide/16 v7, 0x0

    .line 50
    .line 51
    cmp-long v3, v5, v7

    .line 52
    .line 53
    if-eqz v3, :cond_3

    .line 54
    .line 55
    const-wide v5, 0x10000000000L

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    and-long/2addr v0, v5

    .line 61
    cmp-long v0, v0, v7

    .line 62
    .line 63
    if-nez v0, :cond_3

    .line 64
    .line 65
    const-wide/32 v0, -0x80000000

    .line 66
    .line 67
    .line 68
    cmp-long v0, p1, v0

    .line 69
    .line 70
    if-ltz v0, :cond_3

    .line 71
    .line 72
    const-wide/32 v0, 0x7fffffff

    .line 73
    .line 74
    .line 75
    cmp-long p1, p1, v0

    .line 76
    .line 77
    if-gtz p1, :cond_3

    .line 78
    .line 79
    add-int/lit8 p1, v2, 0x1

    .line 80
    .line 81
    const/16 p2, 0x4c

    .line 82
    .line 83
    aput-byte p2, v4, v2

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_3
    :goto_1
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 87
    .line 88
    return-void
.end method

.method public final 飘花落叶言楪子哲兰苏世(Ljava/lang/Long;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0, v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪子哲兰世苏(J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final 飘花落叶言楪子哲苏世兰(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪子哲世兰苏(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final 飘花落叶言楪子哲苏兰世([I)V
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪世子兰哲苏()V

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
    const-wide/16 v2, 0x100

    .line 12
    .line 13
    and-long/2addr v0, v2

    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    cmp-long v0, v0, v2

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x1

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    move v0, v2

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move v0, v1

    .line 25
    :goto_0
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 26
    .line 27
    array-length v4, p1

    .line 28
    const/16 v5, 0xd

    .line 29
    .line 30
    const/4 v6, 0x2

    .line 31
    invoke-static {v4, v5, v3, v6}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    iget-object v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 36
    .line 37
    array-length v6, v5

    .line 38
    if-le v4, v6, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 41
    .line 42
    .line 43
    iget-object v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 44
    .line 45
    :cond_2
    add-int/lit8 v4, v3, 0x1

    .line 46
    .line 47
    const/16 v6, 0x5b

    .line 48
    .line 49
    aput-byte v6, v5, v3

    .line 50
    .line 51
    :goto_1
    array-length v3, p1

    .line 52
    if-ge v1, v3, :cond_6

    .line 53
    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    add-int/lit8 v3, v4, 0x1

    .line 57
    .line 58
    const/16 v6, 0x2c

    .line 59
    .line 60
    aput-byte v6, v5, v4

    .line 61
    .line 62
    move v4, v3

    .line 63
    :cond_3
    iget-char v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 64
    .line 65
    if-eqz v0, :cond_4

    .line 66
    .line 67
    add-int/lit8 v6, v4, 0x1

    .line 68
    .line 69
    int-to-byte v7, v3

    .line 70
    aput-byte v7, v5, v4

    .line 71
    .line 72
    move v4, v6

    .line 73
    :cond_4
    aget v6, p1, v1

    .line 74
    .line 75
    int-to-long v6, v6

    .line 76
    invoke-static {v6, v7, v5, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏兰哲楪世(J[BI)I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-eqz v0, :cond_5

    .line 81
    .line 82
    add-int/lit8 v6, v4, 0x1

    .line 83
    .line 84
    int-to-byte v3, v3

    .line 85
    aput-byte v3, v5, v4

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
    aput-byte p1, v5, v4

    .line 94
    .line 95
    add-int/2addr v4, v2

    .line 96
    iput v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 97
    .line 98
    return-void
.end method

.method public final 飘花落叶言楪子苏世哲兰(F)V
    .locals 5

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
    add-int/lit8 v2, v1, 0x11

    .line 20
    .line 21
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 22
    .line 23
    array-length v4, v3

    .line 24
    if-le v2, v4, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 27
    .line 28
    .line 29
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 30
    .line 31
    :cond_1
    const/16 v2, 0x22

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    add-int/lit8 v4, v1, 0x1

    .line 36
    .line 37
    aput-byte v2, v3, v1

    .line 38
    .line 39
    move v1, v4

    .line 40
    :cond_2
    invoke-static {v3, v1, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏哲世兰([BIF)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    add-int/lit8 v0, p1, 0x1

    .line 47
    .line 48
    aput-byte v2, v3, p1

    .line 49
    .line 50
    move p1, v0

    .line 51
    :cond_3
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 52
    .line 53
    return-void
.end method

.method public final 飘花落叶言楪子苏兰哲世(S)V
    .locals 11

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
    iget-object v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 25
    .line 26
    array-length v5, v4

    .line 27
    if-le v3, v5, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 30
    .line 31
    .line 32
    iget-object v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

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
    int-to-byte v6, v3

    .line 41
    aput-byte v6, v4, v2

    .line 42
    .line 43
    move v2, v5

    .line 44
    :cond_2
    sget-object v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲世苏兰:[I

    .line 45
    .line 46
    if-gez p1, :cond_3

    .line 47
    .line 48
    neg-int p1, p1

    .line 49
    add-int/lit8 v6, v2, 0x1

    .line 50
    .line 51
    const/16 v7, 0x2d

    .line 52
    .line 53
    invoke-static {v4, v2, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世兰哲苏楪([BIB)V

    .line 54
    .line 55
    .line 56
    move v2, v6

    .line 57
    :cond_3
    const/16 v6, 0x3e8

    .line 58
    .line 59
    if-ge p1, v6, :cond_6

    .line 60
    .line 61
    and-int/lit16 p1, p1, 0x3ff

    .line 62
    .line 63
    aget p1, v5, p1

    .line 64
    .line 65
    int-to-byte v5, p1

    .line 66
    if-nez v5, :cond_4

    .line 67
    .line 68
    shr-int/lit8 v5, p1, 0x8

    .line 69
    .line 70
    int-to-short v5, v5

    .line 71
    invoke-static {v4, v2, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏哲楪兰世([BIS)V

    .line 72
    .line 73
    .line 74
    add-int/lit8 v2, v2, 0x2

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    if-ne v5, v1, :cond_5

    .line 78
    .line 79
    add-int/lit8 v5, v2, 0x1

    .line 80
    .line 81
    shr-int/lit8 v6, p1, 0x10

    .line 82
    .line 83
    int-to-byte v6, v6

    .line 84
    invoke-static {v4, v2, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世兰哲苏楪([BIB)V

    .line 85
    .line 86
    .line 87
    move v2, v5

    .line 88
    :cond_5
    :goto_1
    shr-int/lit8 p1, p1, 0x18

    .line 89
    .line 90
    int-to-byte p1, p1

    .line 91
    invoke-static {v4, v2, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世兰哲苏楪([BIB)V

    .line 92
    .line 93
    .line 94
    add-int/2addr v2, v1

    .line 95
    goto :goto_2

    .line 96
    :cond_6
    int-to-long v7, p1

    .line 97
    const-wide/32 v9, 0x10624dd3

    .line 98
    .line 99
    .line 100
    mul-long/2addr v7, v9

    .line 101
    const/16 v9, 0x26

    .line 102
    .line 103
    shr-long/2addr v7, v9

    .line 104
    long-to-int v7, v7

    .line 105
    and-int/lit16 v8, v7, 0x3ff

    .line 106
    .line 107
    aget v8, v5, v8

    .line 108
    .line 109
    int-to-byte v9, v8

    .line 110
    if-ne v9, v1, :cond_7

    .line 111
    .line 112
    add-int/lit8 v1, v2, 0x1

    .line 113
    .line 114
    shr-int/lit8 v9, v8, 0x10

    .line 115
    .line 116
    int-to-byte v9, v9

    .line 117
    invoke-static {v4, v2, v9}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世兰哲苏楪([BIB)V

    .line 118
    .line 119
    .line 120
    move v2, v1

    .line 121
    :cond_7
    mul-int/2addr v7, v6

    .line 122
    sub-int/2addr p1, v7

    .line 123
    and-int/lit16 p1, p1, 0x3ff

    .line 124
    .line 125
    aget p1, v5, p1

    .line 126
    .line 127
    and-int/lit16 p1, p1, -0x100

    .line 128
    .line 129
    shr-int/lit8 v1, v8, 0x18

    .line 130
    .line 131
    or-int/2addr p1, v1

    .line 132
    invoke-static {v2, v4, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏楪哲兰世(I[BI)V

    .line 133
    .line 134
    .line 135
    add-int/lit8 v2, v2, 0x4

    .line 136
    .line 137
    :goto_2
    if-eqz v0, :cond_8

    .line 138
    .line 139
    add-int/lit8 p1, v2, 0x1

    .line 140
    .line 141
    int-to-byte v0, v3

    .line 142
    aput-byte v0, v4, v2

    .line 143
    .line 144
    move v2, p1

    .line 145
    :cond_8
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 146
    .line 147
    return-void
.end method

.method public final 飘花落叶言楪子苏哲世兰([F)V
    .locals 7

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰世苏楪哲()V

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
    const-wide/16 v2, 0x100

    .line 12
    .line 13
    and-long/2addr v0, v2

    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    cmp-long v0, v0, v2

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x1

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    move v0, v2

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move v0, v1

    .line 25
    :goto_0
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 26
    .line 27
    array-length v4, p1

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    const/16 v5, 0x10

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    const/16 v5, 0x12

    .line 34
    .line 35
    :goto_1
    invoke-static {v4, v5, v3, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    iget-object v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 40
    .line 41
    array-length v6, v5

    .line 42
    if-le v4, v6, :cond_3

    .line 43
    .line 44
    invoke-virtual {p0, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 45
    .line 46
    .line 47
    iget-object v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 48
    .line 49
    :cond_3
    add-int/lit8 v4, v3, 0x1

    .line 50
    .line 51
    const/16 v6, 0x5b

    .line 52
    .line 53
    aput-byte v6, v5, v3

    .line 54
    .line 55
    :goto_2
    array-length v3, p1

    .line 56
    if-ge v1, v3, :cond_7

    .line 57
    .line 58
    if-eqz v1, :cond_4

    .line 59
    .line 60
    add-int/lit8 v3, v4, 0x1

    .line 61
    .line 62
    const/16 v6, 0x2c

    .line 63
    .line 64
    aput-byte v6, v5, v4

    .line 65
    .line 66
    move v4, v3

    .line 67
    :cond_4
    const/16 v3, 0x22

    .line 68
    .line 69
    if-eqz v0, :cond_5

    .line 70
    .line 71
    add-int/lit8 v6, v4, 0x1

    .line 72
    .line 73
    aput-byte v3, v5, v4

    .line 74
    .line 75
    move v4, v6

    .line 76
    :cond_5
    aget v6, p1, v1

    .line 77
    .line 78
    invoke-static {v5, v4, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏哲世兰([BIF)I

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-eqz v0, :cond_6

    .line 83
    .line 84
    add-int/lit8 v6, v4, 0x1

    .line 85
    .line 86
    aput-byte v3, v5, v4

    .line 87
    .line 88
    move v4, v6

    .line 89
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_7
    const/16 p1, 0x5d

    .line 93
    .line 94
    aput-byte p1, v5, v4

    .line 95
    .line 96
    add-int/2addr v4, v2

    .line 97
    iput v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 98
    .line 99
    return-void
.end method

.method public final 飘花落叶言楪子苏哲兰世([B)V
    .locals 6

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
    add-int/2addr v0, v1

    .line 9
    add-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 12
    .line 13
    array-length v3, v2

    .line 14
    if-le v0, v3, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 20
    .line 21
    :cond_0
    const/16 v0, 0x2778

    .line 22
    .line 23
    invoke-static {v2, v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏哲楪兰世([BIS)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x2

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    :goto_0
    array-length v3, p1

    .line 30
    if-ge v0, v3, :cond_1

    .line 31
    .line 32
    aget-byte v3, p1, v0

    .line 33
    .line 34
    and-int/lit16 v4, v3, 0xf0

    .line 35
    .line 36
    shr-int/lit8 v4, v4, 0x4

    .line 37
    .line 38
    and-int/lit8 v3, v3, 0xf

    .line 39
    .line 40
    shl-int/lit8 v3, v3, 0x8

    .line 41
    .line 42
    or-int/2addr v3, v4

    .line 43
    const v4, 0x6060606

    .line 44
    .line 45
    .line 46
    add-int/2addr v4, v3

    .line 47
    const v5, 0x10101010

    .line 48
    .line 49
    .line 50
    and-int/2addr v4, v5

    .line 51
    shr-int/lit8 v5, v4, 0x1

    .line 52
    .line 53
    shr-int/lit8 v4, v4, 0x4

    .line 54
    .line 55
    sub-int/2addr v5, v4

    .line 56
    const v4, 0x30303030

    .line 57
    .line 58
    .line 59
    add-int/2addr v5, v4

    .line 60
    add-int/2addr v5, v3

    .line 61
    int-to-short v3, v5

    .line 62
    invoke-static {v2, v1, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏哲楪兰世([BIS)V

    .line 63
    .line 64
    .line 65
    add-int/lit8 v1, v1, 0x2

    .line 66
    .line 67
    add-int/lit8 v0, v0, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    const/16 p1, 0x27

    .line 71
    .line 72
    aput-byte p1, v2, v1

    .line 73
    .line 74
    add-int/lit8 v1, v1, 0x1

    .line 75
    .line 76
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 77
    .line 78
    return-void
.end method

.method public final 飘花落叶言楪苏世哲兰子(III)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0xa

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-le v1, v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 14
    .line 15
    :cond_0
    iget-char v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 16
    .line 17
    int-to-byte v4, v3

    .line 18
    aput-byte v4, v2, v0

    .line 19
    .line 20
    add-int/lit8 v4, v0, 0x1

    .line 21
    .line 22
    invoke-static {v2, v4, p1, p2, p3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲苏楪世兰([BIIII)V

    .line 23
    .line 24
    .line 25
    add-int/lit8 v0, v0, 0x9

    .line 26
    .line 27
    int-to-byte p1, v3

    .line 28
    aput-byte p1, v2, v0

    .line 29
    .line 30
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 31
    .line 32
    return-void
.end method

.method public final 飘花落叶言楪苏世子哲兰(I[C)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 8
    .line 9
    iget-wide v3, v3, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 10
    .line 11
    sget-object v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->EscapeNoneAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 12
    .line 13
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 14
    .line 15
    and-long/2addr v3, v5

    .line 16
    const-wide/16 v5, 0x0

    .line 17
    .line 18
    cmp-long v3, v3, v5

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v3, v4

    .line 26
    :goto_0
    iget v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 27
    .line 28
    array-length v7, v2

    .line 29
    const/4 v8, 0x3

    .line 30
    const/4 v9, 0x2

    .line 31
    invoke-static {v7, v8, v6, v9}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    mul-int/lit8 v7, v1, 0x3

    .line 38
    .line 39
    add-int/2addr v6, v7

    .line 40
    :cond_1
    iget-object v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 41
    .line 42
    array-length v8, v7

    .line 43
    if-le v6, v8, :cond_2

    .line 44
    .line 45
    invoke-virtual {v0, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 46
    .line 47
    .line 48
    iget-object v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 49
    .line 50
    :cond_2
    iget v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 51
    .line 52
    :goto_1
    const/16 v8, 0x7f

    .line 53
    .line 54
    const/16 v10, 0x5c

    .line 55
    .line 56
    iget-char v11, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 57
    .line 58
    if-ge v4, v1, :cond_4

    .line 59
    .line 60
    aget-char v12, v2, v4

    .line 61
    .line 62
    if-eq v12, v11, :cond_4

    .line 63
    .line 64
    if-eq v12, v10, :cond_4

    .line 65
    .line 66
    const/16 v13, 0x20

    .line 67
    .line 68
    if-lt v12, v13, :cond_4

    .line 69
    .line 70
    if-le v12, v8, :cond_3

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    add-int/lit8 v8, v6, 0x1

    .line 74
    .line 75
    int-to-byte v10, v12

    .line 76
    aput-byte v10, v7, v6

    .line 77
    .line 78
    add-int/lit8 v4, v4, 0x1

    .line 79
    .line 80
    move v6, v8

    .line 81
    goto :goto_1

    .line 82
    :cond_4
    :goto_2
    if-ne v4, v1, :cond_5

    .line 83
    .line 84
    iput v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 85
    .line 86
    return-void

    .line 87
    :cond_5
    :goto_3
    if-ge v4, v1, :cond_10

    .line 88
    .line 89
    aget-char v12, v2, v4

    .line 90
    .line 91
    if-gt v12, v8, :cond_8

    .line 92
    .line 93
    if-eq v12, v10, :cond_7

    .line 94
    .line 95
    packed-switch v12, :pswitch_data_0

    .line 96
    .line 97
    .line 98
    if-ne v12, v11, :cond_6

    .line 99
    .line 100
    aput-byte v10, v7, v6

    .line 101
    .line 102
    add-int/lit8 v12, v6, 0x1

    .line 103
    .line 104
    int-to-byte v13, v11

    .line 105
    aput-byte v13, v7, v12

    .line 106
    .line 107
    :goto_4
    add-int/lit8 v6, v6, 0x2

    .line 108
    .line 109
    :goto_5
    const/16 v16, 0x1

    .line 110
    .line 111
    goto/16 :goto_9

    .line 112
    .line 113
    :cond_6
    add-int/lit8 v13, v6, 0x1

    .line 114
    .line 115
    int-to-byte v12, v12

    .line 116
    aput-byte v12, v7, v6

    .line 117
    .line 118
    move v6, v13

    .line 119
    goto :goto_5

    .line 120
    :pswitch_0
    invoke-static {v6, v7, v12}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰哲苏(I[BI)V

    .line 121
    .line 122
    .line 123
    :goto_6
    add-int/lit8 v6, v6, 0x6

    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_7
    :pswitch_1
    invoke-static {v6, v7, v12}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世哲苏兰(I[BI)V

    .line 127
    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_8
    if-eqz v3, :cond_9

    .line 131
    .line 132
    invoke-static {v6, v7, v12}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪苏世兰哲(I[BI)V

    .line 133
    .line 134
    .line 135
    goto :goto_6

    .line 136
    :cond_9
    const v13, 0xd800

    .line 137
    .line 138
    .line 139
    const/16 v14, 0x3f

    .line 140
    .line 141
    if-lt v12, v13, :cond_e

    .line 142
    .line 143
    const v13, 0xe000

    .line 144
    .line 145
    .line 146
    if-ge v12, v13, :cond_e

    .line 147
    .line 148
    const v15, 0xdc00

    .line 149
    .line 150
    .line 151
    if-ge v12, v15, :cond_d

    .line 152
    .line 153
    const/16 v16, 0x1

    .line 154
    .line 155
    array-length v5, v2

    .line 156
    sub-int/2addr v5, v4

    .line 157
    if-ge v5, v9, :cond_a

    .line 158
    .line 159
    const/4 v5, -0x1

    .line 160
    goto :goto_7

    .line 161
    :cond_a
    add-int/lit8 v5, v4, 0x1

    .line 162
    .line 163
    aget-char v5, v2, v5

    .line 164
    .line 165
    if-lt v5, v15, :cond_c

    .line 166
    .line 167
    if-ge v5, v13, :cond_c

    .line 168
    .line 169
    shl-int/lit8 v12, v12, 0xa

    .line 170
    .line 171
    add-int/2addr v12, v5

    .line 172
    const v5, -0x35fdc00

    .line 173
    .line 174
    .line 175
    add-int/2addr v5, v12

    .line 176
    :goto_7
    if-gez v5, :cond_b

    .line 177
    .line 178
    add-int/lit8 v5, v6, 0x1

    .line 179
    .line 180
    aput-byte v14, v7, v6

    .line 181
    .line 182
    goto :goto_8

    .line 183
    :cond_b
    shr-int/lit8 v12, v5, 0x12

    .line 184
    .line 185
    or-int/lit16 v12, v12, 0xf0

    .line 186
    .line 187
    int-to-byte v12, v12

    .line 188
    aput-byte v12, v7, v6

    .line 189
    .line 190
    add-int/lit8 v12, v6, 0x1

    .line 191
    .line 192
    shr-int/lit8 v13, v5, 0xc

    .line 193
    .line 194
    and-int/2addr v13, v14

    .line 195
    or-int/lit16 v13, v13, 0x80

    .line 196
    .line 197
    int-to-byte v13, v13

    .line 198
    aput-byte v13, v7, v12

    .line 199
    .line 200
    add-int/lit8 v12, v6, 0x2

    .line 201
    .line 202
    shr-int/lit8 v13, v5, 0x6

    .line 203
    .line 204
    and-int/2addr v13, v14

    .line 205
    or-int/lit16 v13, v13, 0x80

    .line 206
    .line 207
    int-to-byte v13, v13

    .line 208
    aput-byte v13, v7, v12

    .line 209
    .line 210
    add-int/lit8 v12, v6, 0x3

    .line 211
    .line 212
    and-int/lit8 v5, v5, 0x3f

    .line 213
    .line 214
    or-int/lit16 v5, v5, 0x80

    .line 215
    .line 216
    int-to-byte v5, v5

    .line 217
    aput-byte v5, v7, v12

    .line 218
    .line 219
    add-int/lit8 v5, v6, 0x4

    .line 220
    .line 221
    add-int/lit8 v4, v4, 0x1

    .line 222
    .line 223
    :goto_8
    move v6, v5

    .line 224
    goto :goto_9

    .line 225
    :cond_c
    add-int/lit8 v5, v6, 0x1

    .line 226
    .line 227
    aput-byte v14, v7, v6

    .line 228
    .line 229
    goto :goto_8

    .line 230
    :cond_d
    const/16 v16, 0x1

    .line 231
    .line 232
    add-int/lit8 v5, v6, 0x1

    .line 233
    .line 234
    aput-byte v14, v7, v6

    .line 235
    .line 236
    goto :goto_8

    .line 237
    :cond_e
    const/16 v16, 0x1

    .line 238
    .line 239
    const/16 v5, 0x7ff

    .line 240
    .line 241
    if-le v12, v5, :cond_f

    .line 242
    .line 243
    shr-int/lit8 v5, v12, 0xc

    .line 244
    .line 245
    and-int/lit8 v5, v5, 0xf

    .line 246
    .line 247
    or-int/lit16 v5, v5, 0xe0

    .line 248
    .line 249
    int-to-byte v5, v5

    .line 250
    aput-byte v5, v7, v6

    .line 251
    .line 252
    add-int/lit8 v5, v6, 0x1

    .line 253
    .line 254
    shr-int/lit8 v13, v12, 0x6

    .line 255
    .line 256
    and-int/2addr v13, v14

    .line 257
    or-int/lit16 v13, v13, 0x80

    .line 258
    .line 259
    int-to-byte v13, v13

    .line 260
    aput-byte v13, v7, v5

    .line 261
    .line 262
    add-int/lit8 v5, v6, 0x2

    .line 263
    .line 264
    and-int/lit8 v12, v12, 0x3f

    .line 265
    .line 266
    or-int/lit16 v12, v12, 0x80

    .line 267
    .line 268
    int-to-byte v12, v12

    .line 269
    aput-byte v12, v7, v5

    .line 270
    .line 271
    add-int/lit8 v6, v6, 0x3

    .line 272
    .line 273
    goto :goto_9

    .line 274
    :cond_f
    shr-int/lit8 v5, v12, 0x6

    .line 275
    .line 276
    and-int/lit8 v5, v5, 0x1f

    .line 277
    .line 278
    or-int/lit16 v5, v5, 0xc0

    .line 279
    .line 280
    int-to-byte v5, v5

    .line 281
    aput-byte v5, v7, v6

    .line 282
    .line 283
    add-int/lit8 v5, v6, 0x1

    .line 284
    .line 285
    and-int/lit8 v12, v12, 0x3f

    .line 286
    .line 287
    or-int/lit16 v12, v12, 0x80

    .line 288
    .line 289
    int-to-byte v12, v12

    .line 290
    aput-byte v12, v7, v5

    .line 291
    .line 292
    add-int/lit8 v6, v6, 0x2

    .line 293
    .line 294
    :goto_9
    add-int/lit8 v4, v4, 0x1

    .line 295
    .line 296
    goto/16 :goto_3

    .line 297
    .line 298
    :cond_10
    iput v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 299
    .line 300
    return-void

    .line 301
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

.method public final 飘花落叶言楪苏兰世哲子(Ljava/lang/String;)V
    .locals 13

    .line 1
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)[C

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    iget-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 6
    .line 7
    iget-wide v2, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 8
    .line 9
    sget-object p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BrowserSecure:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 10
    .line 11
    iget-wide v4, p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 12
    .line 13
    and-long/2addr v4, v2

    .line 14
    const-wide/16 v6, 0x0

    .line 15
    .line 16
    cmp-long p1, v4, v6

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    const/4 v4, 0x1

    .line 20
    move-wide v8, v2

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    move v3, v4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v3, v0

    .line 26
    :goto_0
    sget-object p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->EscapeNoneAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 27
    .line 28
    iget-wide v10, p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 29
    .line 30
    and-long/2addr v8, v10

    .line 31
    cmp-long p1, v8, v6

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    move p1, v4

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move p1, v4

    .line 38
    move v4, v0

    .line 39
    :goto_1
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 40
    .line 41
    array-length v5, v1

    .line 42
    const/4 v6, 0x2

    .line 43
    const/4 v7, 0x3

    .line 44
    invoke-static {v5, v7, v2, v6}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-nez v4, :cond_2

    .line 49
    .line 50
    if-eqz v3, :cond_3

    .line 51
    .line 52
    :cond_2
    array-length v6, v1

    .line 53
    mul-int/2addr v6, v7

    .line 54
    add-int/2addr v5, v6

    .line 55
    :cond_3
    iget-object v6, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 56
    .line 57
    array-length v7, v6

    .line 58
    if-le v5, v7, :cond_4

    .line 59
    .line 60
    invoke-virtual {p0, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 61
    .line 62
    .line 63
    iget-object v6, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 64
    .line 65
    :cond_4
    add-int/lit8 v5, v2, 0x1

    .line 66
    .line 67
    iget-char v7, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 68
    .line 69
    int-to-byte v8, v7

    .line 70
    aput-byte v8, v6, v2

    .line 71
    .line 72
    move v12, v5

    .line 73
    move v5, v0

    .line 74
    move v0, v12

    .line 75
    :goto_2
    array-length v2, v1

    .line 76
    if-ge v5, v2, :cond_6

    .line 77
    .line 78
    aget-char v2, v1, v5

    .line 79
    .line 80
    if-eq v2, v7, :cond_6

    .line 81
    .line 82
    const/16 v9, 0x5c

    .line 83
    .line 84
    if-eq v2, v9, :cond_6

    .line 85
    .line 86
    const/16 v9, 0x20

    .line 87
    .line 88
    if-lt v2, v9, :cond_6

    .line 89
    .line 90
    const/16 v9, 0x7f

    .line 91
    .line 92
    if-gt v2, v9, :cond_6

    .line 93
    .line 94
    if-eqz v3, :cond_5

    .line 95
    .line 96
    const/16 v9, 0x3c

    .line 97
    .line 98
    if-eq v2, v9, :cond_6

    .line 99
    .line 100
    const/16 v9, 0x3e

    .line 101
    .line 102
    if-eq v2, v9, :cond_6

    .line 103
    .line 104
    const/16 v9, 0x28

    .line 105
    .line 106
    if-eq v2, v9, :cond_6

    .line 107
    .line 108
    const/16 v9, 0x29

    .line 109
    .line 110
    if-ne v2, v9, :cond_5

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_5
    add-int/lit8 v9, v0, 0x1

    .line 114
    .line 115
    int-to-byte v2, v2

    .line 116
    aput-byte v2, v6, v0

    .line 117
    .line 118
    add-int/lit8 v5, v5, 0x1

    .line 119
    .line 120
    move v0, v9

    .line 121
    goto :goto_2

    .line 122
    :cond_6
    :goto_3
    array-length v2, v1

    .line 123
    if-ne v5, v2, :cond_7

    .line 124
    .line 125
    aput-byte v8, v6, v0

    .line 126
    .line 127
    add-int/2addr v0, p1

    .line 128
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 129
    .line 130
    return-void

    .line 131
    :cond_7
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 132
    .line 133
    array-length p1, v1

    .line 134
    if-ge v5, p1, :cond_8

    .line 135
    .line 136
    array-length v2, v1

    .line 137
    move-object v0, p0

    .line 138
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏兰世子哲([CIZZI)V

    .line 139
    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_8
    move-object v0, p0

    .line 143
    :goto_4
    iget-object p0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 144
    .line 145
    iget p1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 146
    .line 147
    add-int/lit8 v1, p1, 0x1

    .line 148
    .line 149
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 150
    .line 151
    aput-byte v8, p0, p1

    .line 152
    .line 153
    return-void
.end method

.method public final 飘花落叶言楪苏兰世子哲([CIZZI)V
    .locals 8

    .line 1
    array-length v0, p1

    .line 2
    sub-int/2addr v0, p5

    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    const/4 v3, 0x2

    .line 7
    invoke-static {v0, v2, v1, v3}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 12
    .line 13
    array-length v2, v1

    .line 14
    if-le v0, v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 20
    .line 21
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 22
    .line 23
    :goto_0
    if-ge p5, p2, :cond_d

    .line 24
    .line 25
    aget-char v2, p1, p5

    .line 26
    .line 27
    const/16 v4, 0x7f

    .line 28
    .line 29
    if-gt v2, v4, :cond_5

    .line 30
    .line 31
    const/16 v4, 0x28

    .line 32
    .line 33
    if-eq v2, v4, :cond_3

    .line 34
    .line 35
    const/16 v4, 0x29

    .line 36
    .line 37
    if-eq v2, v4, :cond_3

    .line 38
    .line 39
    const/16 v4, 0x3c

    .line 40
    .line 41
    if-eq v2, v4, :cond_3

    .line 42
    .line 43
    const/16 v4, 0x3e

    .line 44
    .line 45
    if-eq v2, v4, :cond_3

    .line 46
    .line 47
    const/16 v4, 0x5c

    .line 48
    .line 49
    if-eq v2, v4, :cond_2

    .line 50
    .line 51
    packed-switch v2, :pswitch_data_0

    .line 52
    .line 53
    .line 54
    iget-char v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 55
    .line 56
    if-ne v2, v5, :cond_1

    .line 57
    .line 58
    aput-byte v4, v1, v0

    .line 59
    .line 60
    add-int/lit8 v2, v0, 0x1

    .line 61
    .line 62
    int-to-byte v4, v5

    .line 63
    aput-byte v4, v1, v2

    .line 64
    .line 65
    :goto_1
    add-int/lit8 v0, v0, 0x2

    .line 66
    .line 67
    goto/16 :goto_6

    .line 68
    .line 69
    :cond_1
    add-int/lit8 v4, v0, 0x1

    .line 70
    .line 71
    int-to-byte v2, v2

    .line 72
    aput-byte v2, v1, v0

    .line 73
    .line 74
    :goto_2
    move v0, v4

    .line 75
    goto/16 :goto_6

    .line 76
    .line 77
    :pswitch_0
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰哲苏(I[BI)V

    .line 78
    .line 79
    .line 80
    :goto_3
    add-int/lit8 v0, v0, 0x6

    .line 81
    .line 82
    goto/16 :goto_6

    .line 83
    .line 84
    :cond_2
    :pswitch_1
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世哲苏兰(I[BI)V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    if-eqz p3, :cond_4

    .line 89
    .line 90
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪苏世兰哲(I[BI)V

    .line 91
    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_4
    add-int/lit8 v4, v0, 0x1

    .line 95
    .line 96
    int-to-byte v2, v2

    .line 97
    aput-byte v2, v1, v0

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_5
    if-eqz p4, :cond_6

    .line 101
    .line 102
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪苏世兰哲(I[BI)V

    .line 103
    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_6
    const v4, 0xd800

    .line 107
    .line 108
    .line 109
    const/16 v5, 0x3f

    .line 110
    .line 111
    if-lt v2, v4, :cond_b

    .line 112
    .line 113
    const v4, 0xe000

    .line 114
    .line 115
    .line 116
    if-ge v2, v4, :cond_b

    .line 117
    .line 118
    const v6, 0xdc00

    .line 119
    .line 120
    .line 121
    if-ge v2, v6, :cond_a

    .line 122
    .line 123
    array-length v7, p1

    .line 124
    sub-int/2addr v7, p5

    .line 125
    if-ge v7, v3, :cond_7

    .line 126
    .line 127
    const/4 v2, -0x1

    .line 128
    goto :goto_4

    .line 129
    :cond_7
    add-int/lit8 v7, p5, 0x1

    .line 130
    .line 131
    aget-char v7, p1, v7

    .line 132
    .line 133
    if-lt v7, v6, :cond_9

    .line 134
    .line 135
    if-ge v7, v4, :cond_9

    .line 136
    .line 137
    shl-int/lit8 v2, v2, 0xa

    .line 138
    .line 139
    add-int/2addr v2, v7

    .line 140
    const v4, -0x35fdc00

    .line 141
    .line 142
    .line 143
    add-int/2addr v2, v4

    .line 144
    :goto_4
    if-gez v2, :cond_8

    .line 145
    .line 146
    add-int/lit8 v2, v0, 0x1

    .line 147
    .line 148
    aput-byte v5, v1, v0

    .line 149
    .line 150
    goto :goto_5

    .line 151
    :cond_8
    shr-int/lit8 v4, v2, 0x12

    .line 152
    .line 153
    or-int/lit16 v4, v4, 0xf0

    .line 154
    .line 155
    int-to-byte v4, v4

    .line 156
    aput-byte v4, v1, v0

    .line 157
    .line 158
    add-int/lit8 v4, v0, 0x1

    .line 159
    .line 160
    shr-int/lit8 v6, v2, 0xc

    .line 161
    .line 162
    and-int/2addr v6, v5

    .line 163
    or-int/lit16 v6, v6, 0x80

    .line 164
    .line 165
    int-to-byte v6, v6

    .line 166
    aput-byte v6, v1, v4

    .line 167
    .line 168
    add-int/lit8 v4, v0, 0x2

    .line 169
    .line 170
    shr-int/lit8 v6, v2, 0x6

    .line 171
    .line 172
    and-int/2addr v5, v6

    .line 173
    or-int/lit16 v5, v5, 0x80

    .line 174
    .line 175
    int-to-byte v5, v5

    .line 176
    aput-byte v5, v1, v4

    .line 177
    .line 178
    add-int/lit8 v4, v0, 0x3

    .line 179
    .line 180
    and-int/lit8 v2, v2, 0x3f

    .line 181
    .line 182
    or-int/lit16 v2, v2, 0x80

    .line 183
    .line 184
    int-to-byte v2, v2

    .line 185
    aput-byte v2, v1, v4

    .line 186
    .line 187
    add-int/lit8 v2, v0, 0x4

    .line 188
    .line 189
    add-int/lit8 p5, p5, 0x1

    .line 190
    .line 191
    :goto_5
    move v0, v2

    .line 192
    goto :goto_6

    .line 193
    :cond_9
    add-int/lit8 v2, v0, 0x1

    .line 194
    .line 195
    aput-byte v5, v1, v0

    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_a
    add-int/lit8 v2, v0, 0x1

    .line 199
    .line 200
    aput-byte v5, v1, v0

    .line 201
    .line 202
    goto :goto_5

    .line 203
    :cond_b
    const/16 v4, 0x7ff

    .line 204
    .line 205
    if-le v2, v4, :cond_c

    .line 206
    .line 207
    shr-int/lit8 v4, v2, 0xc

    .line 208
    .line 209
    and-int/lit8 v4, v4, 0xf

    .line 210
    .line 211
    or-int/lit16 v4, v4, 0xe0

    .line 212
    .line 213
    int-to-byte v4, v4

    .line 214
    aput-byte v4, v1, v0

    .line 215
    .line 216
    add-int/lit8 v4, v0, 0x1

    .line 217
    .line 218
    shr-int/lit8 v6, v2, 0x6

    .line 219
    .line 220
    and-int/2addr v5, v6

    .line 221
    or-int/lit16 v5, v5, 0x80

    .line 222
    .line 223
    int-to-byte v5, v5

    .line 224
    aput-byte v5, v1, v4

    .line 225
    .line 226
    add-int/lit8 v4, v0, 0x2

    .line 227
    .line 228
    and-int/lit8 v2, v2, 0x3f

    .line 229
    .line 230
    or-int/lit16 v2, v2, 0x80

    .line 231
    .line 232
    int-to-byte v2, v2

    .line 233
    aput-byte v2, v1, v4

    .line 234
    .line 235
    add-int/lit8 v0, v0, 0x3

    .line 236
    .line 237
    goto :goto_6

    .line 238
    :cond_c
    shr-int/lit8 v4, v2, 0x6

    .line 239
    .line 240
    and-int/lit8 v4, v4, 0x1f

    .line 241
    .line 242
    or-int/lit16 v4, v4, 0xc0

    .line 243
    .line 244
    int-to-byte v4, v4

    .line 245
    aput-byte v4, v1, v0

    .line 246
    .line 247
    add-int/lit8 v4, v0, 0x1

    .line 248
    .line 249
    and-int/lit8 v2, v2, 0x3f

    .line 250
    .line 251
    or-int/lit16 v2, v2, 0x80

    .line 252
    .line 253
    int-to-byte v2, v2

    .line 254
    aput-byte v2, v1, v4

    .line 255
    .line 256
    goto/16 :goto_1

    .line 257
    .line 258
    :goto_6
    add-int/lit8 p5, p5, 0x1

    .line 259
    .line 260
    goto/16 :goto_0

    .line 261
    .line 262
    :cond_d
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 263
    .line 264
    return-void

    .line 265
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

.method public final 飘花落叶言楪苏兰哲世子([B)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪苏世子兰哲()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 12
    .line 13
    iget-object v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 14
    .line 15
    array-length v4, v1

    .line 16
    const/4 v5, 0x6

    .line 17
    const/4 v6, 0x2

    .line 18
    invoke-static {v4, v5, v2, v6}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    array-length v5, v3

    .line 23
    if-le v4, v5, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 26
    .line 27
    .line 28
    iget-object v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 29
    .line 30
    :cond_1
    iget-char v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 31
    .line 32
    int-to-byte v4, v4

    .line 33
    iget-object v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 34
    .line 35
    iget-wide v5, v5, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 36
    .line 37
    sget-wide v7, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏哲兰:J

    .line 38
    .line 39
    and-long/2addr v7, v5

    .line 40
    const-wide/16 v9, 0x0

    .line 41
    .line 42
    cmp-long v7, v7, v9

    .line 43
    .line 44
    const/4 v8, 0x0

    .line 45
    const/4 v11, 0x1

    .line 46
    if-eqz v7, :cond_2

    .line 47
    .line 48
    move v7, v11

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    move v7, v8

    .line 51
    :goto_0
    sget-wide v12, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏兰哲:J

    .line 52
    .line 53
    and-long/2addr v5, v12

    .line 54
    cmp-long v5, v5, v9

    .line 55
    .line 56
    if-eqz v5, :cond_3

    .line 57
    .line 58
    move v5, v11

    .line 59
    goto :goto_1

    .line 60
    :cond_3
    move v5, v8

    .line 61
    :goto_1
    add-int/lit8 v6, v2, 0x1

    .line 62
    .line 63
    aput-byte v4, v3, v2

    .line 64
    .line 65
    array-length v2, v1

    .line 66
    shr-int/2addr v2, v11

    .line 67
    :goto_2
    if-ge v8, v2, :cond_10

    .line 68
    .line 69
    add-int/lit8 v9, v8, 0x1

    .line 70
    .line 71
    invoke-static {v1, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲世苏兰([BI)C

    .line 72
    .line 73
    .line 74
    move-result v10

    .line 75
    const/16 v12, 0x80

    .line 76
    .line 77
    if-ge v10, v12, :cond_8

    .line 78
    .line 79
    const/16 v8, 0x28

    .line 80
    .line 81
    if-eq v10, v8, :cond_6

    .line 82
    .line 83
    const/16 v8, 0x29

    .line 84
    .line 85
    if-eq v10, v8, :cond_6

    .line 86
    .line 87
    const/16 v8, 0x3c

    .line 88
    .line 89
    if-eq v10, v8, :cond_6

    .line 90
    .line 91
    const/16 v8, 0x3e

    .line 92
    .line 93
    if-eq v10, v8, :cond_6

    .line 94
    .line 95
    const/16 v8, 0x5c

    .line 96
    .line 97
    if-eq v10, v8, :cond_5

    .line 98
    .line 99
    packed-switch v10, :pswitch_data_0

    .line 100
    .line 101
    .line 102
    if-ne v10, v4, :cond_4

    .line 103
    .line 104
    aput-byte v8, v3, v6

    .line 105
    .line 106
    add-int/lit8 v8, v6, 0x1

    .line 107
    .line 108
    aput-byte v4, v3, v8

    .line 109
    .line 110
    :goto_3
    add-int/lit8 v6, v6, 0x2

    .line 111
    .line 112
    :goto_4
    move v8, v9

    .line 113
    move/from16 v16, v11

    .line 114
    .line 115
    goto/16 :goto_a

    .line 116
    .line 117
    :cond_4
    add-int/lit8 v8, v6, 0x1

    .line 118
    .line 119
    int-to-byte v10, v10

    .line 120
    aput-byte v10, v3, v6

    .line 121
    .line 122
    :goto_5
    move v6, v8

    .line 123
    goto :goto_4

    .line 124
    :pswitch_0
    invoke-static {v6, v3, v10}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰哲苏(I[BI)V

    .line 125
    .line 126
    .line 127
    :goto_6
    add-int/lit8 v6, v6, 0x6

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_5
    :pswitch_1
    invoke-static {v6, v3, v10}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世哲苏兰(I[BI)V

    .line 131
    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_6
    if-eqz v5, :cond_7

    .line 135
    .line 136
    invoke-static {v6, v3, v10}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪苏世兰哲(I[BI)V

    .line 137
    .line 138
    .line 139
    goto :goto_6

    .line 140
    :cond_7
    add-int/lit8 v8, v6, 0x1

    .line 141
    .line 142
    int-to-byte v10, v10

    .line 143
    aput-byte v10, v3, v6

    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_8
    const/16 v13, 0x800

    .line 147
    .line 148
    if-ge v10, v13, :cond_9

    .line 149
    .line 150
    shr-int/lit8 v8, v10, 0x6

    .line 151
    .line 152
    or-int/lit16 v8, v8, 0xc0

    .line 153
    .line 154
    int-to-byte v8, v8

    .line 155
    aput-byte v8, v3, v6

    .line 156
    .line 157
    add-int/lit8 v8, v6, 0x1

    .line 158
    .line 159
    and-int/lit8 v10, v10, 0x3f

    .line 160
    .line 161
    or-int/2addr v10, v12

    .line 162
    int-to-byte v10, v10

    .line 163
    aput-byte v10, v3, v8

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_9
    if-eqz v7, :cond_a

    .line 167
    .line 168
    invoke-static {v6, v3, v10}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪苏世兰哲(I[BI)V

    .line 169
    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_a
    const v13, 0xd800

    .line 173
    .line 174
    .line 175
    const/16 v14, 0x3f

    .line 176
    .line 177
    if-lt v10, v13, :cond_f

    .line 178
    .line 179
    const v13, 0xe000

    .line 180
    .line 181
    .line 182
    if-ge v10, v13, :cond_f

    .line 183
    .line 184
    const v15, 0xdc00

    .line 185
    .line 186
    .line 187
    if-ge v10, v15, :cond_e

    .line 188
    .line 189
    add-int/lit8 v8, v8, 0x2

    .line 190
    .line 191
    if-le v8, v2, :cond_b

    .line 192
    .line 193
    const/4 v8, -0x1

    .line 194
    move/from16 v16, v11

    .line 195
    .line 196
    goto :goto_7

    .line 197
    :cond_b
    move/from16 v16, v11

    .line 198
    .line 199
    invoke-static {v1, v9}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲世苏兰([BI)C

    .line 200
    .line 201
    .line 202
    move-result v11

    .line 203
    if-lt v11, v15, :cond_d

    .line 204
    .line 205
    if-ge v11, v13, :cond_d

    .line 206
    .line 207
    shl-int/lit8 v9, v10, 0xa

    .line 208
    .line 209
    add-int/2addr v9, v11

    .line 210
    const v10, -0x35fdc00

    .line 211
    .line 212
    .line 213
    add-int/2addr v9, v10

    .line 214
    move/from16 v17, v9

    .line 215
    .line 216
    move v9, v8

    .line 217
    move/from16 v8, v17

    .line 218
    .line 219
    :goto_7
    if-gez v8, :cond_c

    .line 220
    .line 221
    add-int/lit8 v8, v6, 0x1

    .line 222
    .line 223
    aput-byte v14, v3, v6

    .line 224
    .line 225
    goto :goto_8

    .line 226
    :cond_c
    shr-int/lit8 v10, v8, 0x12

    .line 227
    .line 228
    or-int/lit16 v10, v10, 0xf0

    .line 229
    .line 230
    int-to-byte v10, v10

    .line 231
    aput-byte v10, v3, v6

    .line 232
    .line 233
    add-int/lit8 v10, v6, 0x1

    .line 234
    .line 235
    shr-int/lit8 v11, v8, 0xc

    .line 236
    .line 237
    and-int/2addr v11, v14

    .line 238
    or-int/2addr v11, v12

    .line 239
    int-to-byte v11, v11

    .line 240
    aput-byte v11, v3, v10

    .line 241
    .line 242
    add-int/lit8 v10, v6, 0x2

    .line 243
    .line 244
    shr-int/lit8 v11, v8, 0x6

    .line 245
    .line 246
    and-int/2addr v11, v14

    .line 247
    or-int/2addr v11, v12

    .line 248
    int-to-byte v11, v11

    .line 249
    aput-byte v11, v3, v10

    .line 250
    .line 251
    add-int/lit8 v10, v6, 0x3

    .line 252
    .line 253
    and-int/lit8 v8, v8, 0x3f

    .line 254
    .line 255
    or-int/2addr v8, v12

    .line 256
    int-to-byte v8, v8

    .line 257
    aput-byte v8, v3, v10

    .line 258
    .line 259
    add-int/lit8 v8, v6, 0x4

    .line 260
    .line 261
    :goto_8
    move v6, v8

    .line 262
    goto :goto_9

    .line 263
    :cond_d
    add-int/lit8 v8, v6, 0x1

    .line 264
    .line 265
    aput-byte v14, v3, v6

    .line 266
    .line 267
    move v6, v8

    .line 268
    :goto_9
    move v8, v9

    .line 269
    :goto_a
    move/from16 v11, v16

    .line 270
    .line 271
    goto/16 :goto_2

    .line 272
    .line 273
    :cond_e
    move/from16 v16, v11

    .line 274
    .line 275
    add-int/lit8 v8, v6, 0x1

    .line 276
    .line 277
    aput-byte v14, v3, v6

    .line 278
    .line 279
    move v6, v8

    .line 280
    move v8, v9

    .line 281
    goto/16 :goto_2

    .line 282
    .line 283
    :cond_f
    move/from16 v16, v11

    .line 284
    .line 285
    shr-int/lit8 v8, v10, 0xc

    .line 286
    .line 287
    or-int/lit16 v8, v8, 0xe0

    .line 288
    .line 289
    int-to-byte v8, v8

    .line 290
    aput-byte v8, v3, v6

    .line 291
    .line 292
    add-int/lit8 v8, v6, 0x1

    .line 293
    .line 294
    shr-int/lit8 v11, v10, 0x6

    .line 295
    .line 296
    and-int/2addr v11, v14

    .line 297
    or-int/2addr v11, v12

    .line 298
    int-to-byte v11, v11

    .line 299
    aput-byte v11, v3, v8

    .line 300
    .line 301
    add-int/lit8 v8, v6, 0x2

    .line 302
    .line 303
    and-int/lit8 v10, v10, 0x3f

    .line 304
    .line 305
    or-int/2addr v10, v12

    .line 306
    int-to-byte v10, v10

    .line 307
    aput-byte v10, v3, v8

    .line 308
    .line 309
    add-int/lit8 v6, v6, 0x3

    .line 310
    .line 311
    goto :goto_9

    .line 312
    :cond_10
    move/from16 v16, v11

    .line 313
    .line 314
    aput-byte v4, v3, v6

    .line 315
    .line 316
    add-int/lit8 v6, v6, 0x1

    .line 317
    .line 318
    iput v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 319
    .line 320
    return-void

    .line 321
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

.method public final 飘花落叶言楪苏兰哲子世([B)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    const-wide v2, 0x800000000L

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    and-long/2addr v0, v2

    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    cmp-long v0, v0, v2

    .line 14
    .line 15
    const/16 v1, 0x20

    .line 16
    .line 17
    const/16 v2, 0x5c

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    iget-char v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 21
    .line 22
    if-eqz v0, :cond_4

    .line 23
    .line 24
    int-to-byte v0, v4

    .line 25
    move v4, v3

    .line 26
    :goto_0
    array-length v5, p1

    .line 27
    if-ge v4, v5, :cond_1

    .line 28
    .line 29
    aget-byte v5, p1, v4

    .line 30
    .line 31
    if-eq v5, v0, :cond_1

    .line 32
    .line 33
    if-eq v5, v2, :cond_1

    .line 34
    .line 35
    if-lt v5, v1, :cond_1

    .line 36
    .line 37
    const/16 v6, 0x3c

    .line 38
    .line 39
    if-eq v5, v6, :cond_1

    .line 40
    .line 41
    const/16 v6, 0x3e

    .line 42
    .line 43
    if-eq v5, v6, :cond_1

    .line 44
    .line 45
    const/16 v6, 0x28

    .line 46
    .line 47
    if-eq v5, v6, :cond_1

    .line 48
    .line 49
    const/16 v6, 0x29

    .line 50
    .line 51
    if-ne v5, v6, :cond_0

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    :goto_1
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 58
    .line 59
    array-length v2, p1

    .line 60
    if-ne v4, v2, :cond_3

    .line 61
    .line 62
    array-length v2, p1

    .line 63
    add-int/2addr v2, v1

    .line 64
    add-int/lit8 v2, v2, 0x2

    .line 65
    .line 66
    iget-object v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 67
    .line 68
    array-length v5, v4

    .line 69
    if-le v2, v5, :cond_2

    .line 70
    .line 71
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 72
    .line 73
    .line 74
    iget-object v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 75
    .line 76
    :cond_2
    aput-byte v0, v4, v1

    .line 77
    .line 78
    add-int/lit8 v2, v1, 0x1

    .line 79
    .line 80
    array-length v5, p1

    .line 81
    invoke-static {p1, v3, v4, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 82
    .line 83
    .line 84
    array-length p1, p1

    .line 85
    add-int/lit8 p1, p1, 0x1

    .line 86
    .line 87
    add-int/2addr p1, v1

    .line 88
    aput-byte v0, v4, p1

    .line 89
    .line 90
    add-int/lit8 p1, p1, 0x1

    .line 91
    .line 92
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 93
    .line 94
    return-void

    .line 95
    :cond_3
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏兰子哲世([B)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_4
    int-to-byte v0, v4

    .line 100
    sget v4, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世哲苏兰:I

    .line 101
    .line 102
    array-length v4, p1

    .line 103
    and-int/lit8 v4, v4, -0x8

    .line 104
    .line 105
    move v5, v3

    .line 106
    :goto_2
    if-ge v5, v4, :cond_6

    .line 107
    .line 108
    invoke-static {p1, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪苏哲兰([BI)J

    .line 109
    .line 110
    .line 111
    move-result-wide v6

    .line 112
    iget-wide v8, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰哲楪:J

    .line 113
    .line 114
    invoke-static {v6, v7, v8, v9}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏哲兰(JJ)Z

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    if-nez v6, :cond_5

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_5
    add-int/lit8 v5, v5, 0x8

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_6
    :goto_3
    array-length v4, p1

    .line 125
    if-ge v5, v4, :cond_9

    .line 126
    .line 127
    aget-byte v4, p1, v5

    .line 128
    .line 129
    if-eq v4, v0, :cond_8

    .line 130
    .line 131
    if-eq v4, v2, :cond_8

    .line 132
    .line 133
    if-ge v4, v1, :cond_7

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_7
    add-int/lit8 v5, v5, 0x1

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_8
    :goto_4
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏兰子哲世([B)V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :cond_9
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 144
    .line 145
    array-length v2, p1

    .line 146
    add-int/2addr v2, v1

    .line 147
    add-int/lit8 v2, v2, 0x2

    .line 148
    .line 149
    iget-object v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 150
    .line 151
    array-length v5, v4

    .line 152
    if-le v2, v5, :cond_a

    .line 153
    .line 154
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 155
    .line 156
    .line 157
    iget-object v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 158
    .line 159
    :cond_a
    array-length v2, p1

    .line 160
    aput-byte v0, v4, v1

    .line 161
    .line 162
    add-int/lit8 v5, v1, 0x1

    .line 163
    .line 164
    invoke-static {p1, v3, v4, v5, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 165
    .line 166
    .line 167
    add-int/2addr v1, v2

    .line 168
    add-int/lit8 p1, v1, 0x1

    .line 169
    .line 170
    aput-byte v0, v4, p1

    .line 171
    .line 172
    add-int/lit8 v1, v1, 0x2

    .line 173
    .line 174
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 175
    .line 176
    return-void
.end method

.method public final 飘花落叶言楪苏兰子世哲()V
    .locals 1

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 2
    .line 3
    int-to-byte v0, v0

    .line 4
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪世苏兰子哲(B)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final 飘花落叶言楪苏兰子哲世([B)V
    .locals 9

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x6

    .line 6
    invoke-static {v1, v3, v0, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 11
    .line 12
    array-length v2, v1

    .line 13
    if-le v0, v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 19
    .line 20
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 21
    .line 22
    iget-char v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 23
    .line 24
    int-to-byte v2, v2

    .line 25
    iget-object v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 26
    .line 27
    iget-wide v4, v4, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 28
    .line 29
    sget-wide v6, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏兰哲:J

    .line 30
    .line 31
    and-long/2addr v4, v6

    .line 32
    const-wide/16 v6, 0x0

    .line 33
    .line 34
    cmp-long v4, v4, v6

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    const/4 v6, 0x1

    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    move v4, v6

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move v4, v5

    .line 43
    :goto_0
    add-int/lit8 v7, v0, 0x1

    .line 44
    .line 45
    aput-byte v2, v1, v0

    .line 46
    .line 47
    :goto_1
    array-length v0, p1

    .line 48
    if-ge v5, v0, :cond_7

    .line 49
    .line 50
    aget-byte v0, p1, v5

    .line 51
    .line 52
    const/16 v8, 0x28

    .line 53
    .line 54
    if-eq v0, v8, :cond_5

    .line 55
    .line 56
    const/16 v8, 0x29

    .line 57
    .line 58
    if-eq v0, v8, :cond_5

    .line 59
    .line 60
    const/16 v8, 0x3c

    .line 61
    .line 62
    if-eq v0, v8, :cond_5

    .line 63
    .line 64
    const/16 v8, 0x3e

    .line 65
    .line 66
    if-eq v0, v8, :cond_5

    .line 67
    .line 68
    const/16 v8, 0x5c

    .line 69
    .line 70
    if-eq v0, v8, :cond_4

    .line 71
    .line 72
    packed-switch v0, :pswitch_data_0

    .line 73
    .line 74
    .line 75
    if-ne v0, v2, :cond_2

    .line 76
    .line 77
    aput-byte v8, v1, v7

    .line 78
    .line 79
    add-int/lit8 v0, v7, 0x1

    .line 80
    .line 81
    aput-byte v2, v1, v0

    .line 82
    .line 83
    :goto_2
    add-int/lit8 v7, v7, 0x2

    .line 84
    .line 85
    goto :goto_5

    .line 86
    :cond_2
    if-gez v0, :cond_3

    .line 87
    .line 88
    and-int/lit16 v8, v0, 0xff

    .line 89
    .line 90
    shr-int/2addr v8, v3

    .line 91
    or-int/lit16 v8, v8, 0xc0

    .line 92
    .line 93
    int-to-byte v8, v8

    .line 94
    aput-byte v8, v1, v7

    .line 95
    .line 96
    add-int/lit8 v8, v7, 0x1

    .line 97
    .line 98
    and-int/lit8 v0, v0, 0x3f

    .line 99
    .line 100
    or-int/lit16 v0, v0, 0x80

    .line 101
    .line 102
    int-to-byte v0, v0

    .line 103
    aput-byte v0, v1, v8

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_3
    add-int/lit8 v8, v7, 0x1

    .line 107
    .line 108
    aput-byte v0, v1, v7

    .line 109
    .line 110
    :goto_3
    move v7, v8

    .line 111
    goto :goto_5

    .line 112
    :pswitch_0
    invoke-static {v7, v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰哲苏(I[BI)V

    .line 113
    .line 114
    .line 115
    :goto_4
    add-int/lit8 v7, v7, 0x6

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_4
    :pswitch_1
    invoke-static {v7, v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世哲苏兰(I[BI)V

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_5
    if-eqz v4, :cond_6

    .line 123
    .line 124
    invoke-static {v7, v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪苏世兰哲(I[BI)V

    .line 125
    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_6
    add-int/lit8 v8, v7, 0x1

    .line 129
    .line 130
    aput-byte v0, v1, v7

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :goto_5
    add-int/lit8 v5, v5, 0x1

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_7
    aput-byte v2, v1, v7

    .line 137
    .line 138
    add-int/2addr v7, v6

    .line 139
    iput v7, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 140
    .line 141
    return-void

    .line 142
    nop

    .line 143
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

.method public final 飘花落叶言楪苏哲世兰子(I)[B
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-ne p1, v1, :cond_0

    .line 5
    .line 6
    add-int/lit8 p1, p1, 0x1

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    return-object v0
.end method

.method public final 飘花落叶言楪苏哲世子兰(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    invoke-virtual {p0, p1, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲楪兰苏世(II)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 13
    .line 14
    return-void
.end method

.method public final 飘花落叶言楪苏哲兰世子([BI)I
    .locals 2

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    aput-byte v0, p1, p2

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    add-int/2addr p2, v0

    .line 7
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰哲苏世:I

    .line 8
    .line 9
    iget-byte p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪兰哲苏:B

    .line 10
    .line 11
    mul-int/2addr v1, p0

    .line 12
    add-int/2addr v1, p2

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
    invoke-static {p1, p2, v1, p0}, Ljava/util/Arrays;->fill([BIIB)V

    .line 21
    .line 22
    .line 23
    return v1
.end method

.method public final 飘花落叶言楪苏哲子世兰(Ljava/util/UUID;)V
    .locals 13

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪世子兰哲苏()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 8
    .line 9
    add-int/lit8 v1, v0, 0x26

    .line 10
    .line 11
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 12
    .line 13
    array-length v3, v2

    .line 14
    if-le v1, v3, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 20
    .line 21
    :cond_1
    move-object v4, v2

    .line 22
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 23
    .line 24
    int-to-byte v1, v1

    .line 25
    sget-wide v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲:J

    .line 26
    .line 27
    int-to-long v5, v0

    .line 28
    add-long v9, v2, v5

    .line 29
    .line 30
    sget-object v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 31
    .line 32
    invoke-virtual {v3, v4, v9, v10, v1}, Lsun/misc/Unsafe;->putByte(Ljava/lang/Object;JB)V

    .line 33
    .line 34
    .line 35
    const-wide/16 v5, 0x9

    .line 36
    .line 37
    add-long/2addr v5, v9

    .line 38
    const/16 v0, 0x2d

    .line 39
    .line 40
    invoke-virtual {v3, v4, v5, v6, v0}, Lsun/misc/Unsafe;->putByte(Ljava/lang/Object;JB)V

    .line 41
    .line 42
    .line 43
    const-wide/16 v5, 0xe

    .line 44
    .line 45
    add-long/2addr v5, v9

    .line 46
    invoke-virtual {v3, v4, v5, v6, v0}, Lsun/misc/Unsafe;->putByte(Ljava/lang/Object;JB)V

    .line 47
    .line 48
    .line 49
    const-wide/16 v5, 0x13

    .line 50
    .line 51
    add-long/2addr v5, v9

    .line 52
    invoke-virtual {v3, v4, v5, v6, v0}, Lsun/misc/Unsafe;->putByte(Ljava/lang/Object;JB)V

    .line 53
    .line 54
    .line 55
    const-wide/16 v5, 0x18

    .line 56
    .line 57
    add-long/2addr v5, v9

    .line 58
    invoke-virtual {v3, v4, v5, v6, v0}, Lsun/misc/Unsafe;->putByte(Ljava/lang/Object;JB)V

    .line 59
    .line 60
    .line 61
    const-wide/16 v5, 0x25

    .line 62
    .line 63
    add-long/2addr v5, v9

    .line 64
    invoke-virtual {v3, v4, v5, v6, v1}, Lsun/misc/Unsafe;->putByte(Ljava/lang/Object;JB)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/util/UUID;->getMostSignificantBits()J

    .line 68
    .line 69
    .line 70
    move-result-wide v0

    .line 71
    invoke-virtual {p1}, Ljava/util/UUID;->getLeastSignificantBits()J

    .line 72
    .line 73
    .line 74
    move-result-wide v11

    .line 75
    const/16 p1, 0x20

    .line 76
    .line 77
    ushr-long v5, v0, p1

    .line 78
    .line 79
    invoke-static {v5, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲兰子世(J)J

    .line 80
    .line 81
    .line 82
    move-result-wide v7

    .line 83
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲兰子世(J)J

    .line 84
    .line 85
    .line 86
    move-result-wide v0

    .line 87
    const-wide/16 v5, 0x1

    .line 88
    .line 89
    add-long/2addr v5, v9

    .line 90
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 91
    .line 92
    .line 93
    const-wide/16 v5, 0xa

    .line 94
    .line 95
    add-long/2addr v5, v9

    .line 96
    long-to-int v2, v0

    .line 97
    invoke-virtual {v3, v4, v5, v6, v2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 98
    .line 99
    .line 100
    const-wide/16 v5, 0xf

    .line 101
    .line 102
    add-long/2addr v5, v9

    .line 103
    ushr-long/2addr v0, p1

    .line 104
    long-to-int v0, v0

    .line 105
    invoke-virtual {v3, v4, v5, v6, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 106
    .line 107
    .line 108
    ushr-long v0, v11, p1

    .line 109
    .line 110
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲兰子世(J)J

    .line 111
    .line 112
    .line 113
    move-result-wide v0

    .line 114
    invoke-static {v11, v12}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲兰子世(J)J

    .line 115
    .line 116
    .line 117
    move-result-wide v7

    .line 118
    const-wide/16 v5, 0x14

    .line 119
    .line 120
    add-long/2addr v5, v9

    .line 121
    long-to-int v2, v0

    .line 122
    invoke-virtual {v3, v4, v5, v6, v2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 123
    .line 124
    .line 125
    const-wide/16 v5, 0x19

    .line 126
    .line 127
    add-long/2addr v5, v9

    .line 128
    ushr-long/2addr v0, p1

    .line 129
    long-to-int p1, v0

    .line 130
    invoke-virtual {v3, v4, v5, v6, p1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 131
    .line 132
    .line 133
    const-wide/16 v0, 0x1d

    .line 134
    .line 135
    add-long v5, v9, v0

    .line 136
    .line 137
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 138
    .line 139
    .line 140
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 141
    .line 142
    add-int/lit8 p1, p1, 0x26

    .line 143
    .line 144
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 145
    .line 146
    return-void
.end method

.method public final 飘花落叶言楪苏哲子兰世(Ljava/time/ZonedDateTime;)V
    .locals 14

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪世子兰哲苏()V

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
    iget-object v10, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 75
    .line 76
    array-length v11, v10

    .line 77
    if-le v9, v11, :cond_6

    .line 78
    .line 79
    invoke-virtual {p0, v9}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世子兰(I)V

    .line 80
    .line 81
    .line 82
    iget-object v10, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 83
    .line 84
    :cond_6
    iget-char v9, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 85
    .line 86
    int-to-byte v11, v9

    .line 87
    aput-byte v11, v10, v6

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/time/ZonedDateTime;->toLocalDate()Ljava/time/LocalDate;

    .line 90
    .line 91
    .line 92
    move-result-object v11

    .line 93
    add-int/2addr v6, v8

    .line 94
    invoke-virtual {v11}, Ljava/time/LocalDate;->getYear()I

    .line 95
    .line 96
    .line 97
    move-result v12

    .line 98
    invoke-virtual {v11}, Ljava/time/LocalDate;->getMonthValue()I

    .line 99
    .line 100
    .line 101
    move-result v13

    .line 102
    invoke-virtual {v11}, Ljava/time/LocalDate;->getDayOfMonth()I

    .line 103
    .line 104
    .line 105
    move-result v11

    .line 106
    invoke-static {v10, v6, v12, v13, v11}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲世苏楪兰([BIIII)I

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    const/16 v11, 0x54

    .line 111
    .line 112
    aput-byte v11, v10, v6

    .line 113
    .line 114
    add-int/2addr v6, v8

    .line 115
    invoke-virtual {p1}, Ljava/time/ZonedDateTime;->toLocalTime()Ljava/time/LocalTime;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-static {v10, v6, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子哲世兰楪苏([BILjava/time/LocalTime;)I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-ne v3, v8, :cond_7

    .line 124
    .line 125
    add-int/lit8 v0, p1, 0x1

    .line 126
    .line 127
    const/16 v1, 0x5a

    .line 128
    .line 129
    aput-byte v1, v10, p1

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_7
    if-eq v0, v5, :cond_9

    .line 133
    .line 134
    if-ne v0, v4, :cond_8

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_8
    add-int/lit8 v0, p1, 0x1

    .line 138
    .line 139
    const/16 v3, 0x5b

    .line 140
    .line 141
    aput-byte v3, v10, p1

    .line 142
    .line 143
    invoke-virtual {v1, v7, v2, v10, v0}, Ljava/lang/String;->getBytes(II[BI)V

    .line 144
    .line 145
    .line 146
    add-int/2addr v0, v2

    .line 147
    add-int/lit8 p1, v0, 0x1

    .line 148
    .line 149
    const/16 v1, 0x5d

    .line 150
    .line 151
    aput-byte v1, v10, v0

    .line 152
    .line 153
    move v0, p1

    .line 154
    goto :goto_3

    .line 155
    :cond_9
    :goto_2
    invoke-virtual {v1, v7, v2, v10, p1}, Ljava/lang/String;->getBytes(II[BI)V

    .line 156
    .line 157
    .line 158
    add-int v0, p1, v2

    .line 159
    .line 160
    :goto_3
    int-to-byte p1, v9

    .line 161
    aput-byte p1, v10, v0

    .line 162
    .line 163
    add-int/2addr v0, v8

    .line 164
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 165
    .line 166
    return-void
.end method

.method public final 飘花落叶言楪苏子世兰哲(Z)V
    .locals 4

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 2
    .line 3
    int-to-byte v0, v0

    .line 4
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 5
    .line 6
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 7
    .line 8
    add-int/lit8 v3, v2, 0x1

    .line 9
    .line 10
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 11
    .line 12
    aput-byte v0, v1, v2

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子兰苏楪哲世(Z)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言子世苏兰楪哲:[B

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 20
    .line 21
    add-int/lit8 v2, v1, 0x1

    .line 22
    .line 23
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 24
    .line 25
    aput-byte v0, p1, v1

    .line 26
    .line 27
    return-void
.end method

.method public final 飘花落叶言楪苏子世哲兰(S)V
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
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏兰子世哲()V

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪子苏兰哲世(S)V

    .line 25
    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏兰子世哲()V

    .line 30
    .line 31
    .line 32
    :cond_2
    return-void
.end method

.method public final 飘花落叶言楪苏子兰世哲([Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-byte v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪兰哲苏:B

    .line 2
    .line 3
    if-nez v0, :cond_3

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
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世兰子(I)[B

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/16 v2, 0x5b

    .line 15
    .line 16
    aput-byte v2, v1, v0

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    :goto_0
    array-length v1, p1

    .line 24
    if-ge v0, v1, :cond_2

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世兰子(I)[B

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const/16 v3, 0x2c

    .line 35
    .line 36
    aput-byte v3, v2, v1

    .line 37
    .line 38
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 41
    .line 42
    :cond_1
    aget-object v1, p1, v0

    .line 43
    .line 44
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪世兰哲子苏(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    add-int/lit8 v0, v0, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世楪兰;->飘花落叶言楪苏哲世兰子(I)[B

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const/16 v1, 0x5d

    .line 57
    .line 58
    aput-byte v1, v0, p1

    .line 59
    .line 60
    add-int/lit8 p1, p1, 0x1

    .line 61
    .line 62
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 63
    .line 64
    return-void

    .line 65
    :cond_3
    :goto_1
    invoke-super {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪苏子兰世哲([Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method
