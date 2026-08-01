.class public final Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;
.super Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子苏世楪哲兰:[B

.field public static final 飘花落叶言子苏楪兰世哲:[B

.field public static 飘花落叶言子苏楪兰哲世:Ljava/nio/charset/Charset;

.field public static final 飘花落叶言子苏楪哲兰世:J


# instance fields
.field public 飘花落叶言子世兰哲楪苏:J

.field public 飘花落叶言子世兰哲苏楪:I

.field public 飘花落叶言子世兰楪哲苏:I

.field public 飘花落叶言子世兰楪苏哲:B

.field public final 飘花落叶言子世兰苏哲楪:Lcom/alibaba/fastjson2/飘花落叶言子楪世兰哲苏;

.field public 飘花落叶言子世兰苏楪哲:[B

.field public 飘花落叶言子世哲兰楪苏:B

.field public 飘花落叶言子世哲兰苏楪:I

.field public final 飘花落叶言子世哲苏兰楪:I

.field public final 飘花落叶言子世哲苏楪兰:[B

.field public 飘花落叶言子苏楪世兰哲:B

.field public 飘花落叶言子苏楪世哲兰:I

.field public 飘花落叶言子苏楪哲世兰:[J


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 2
    .line 3
    const-class v1, [B

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lsun/misc/Unsafe;->arrayBaseOffset(Ljava/lang/Class;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    int-to-long v0, v0

    .line 10
    sput-wide v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪哲兰世:J

    .line 11
    .line 12
    const-string v0, "Asia/Shanghai"

    .line 13
    .line 14
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)[B

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪兰世哲:[B

    .line 19
    .line 20
    const/16 v0, 0x100

    .line 21
    .line 22
    new-array v0, v0, [B

    .line 23
    .line 24
    const/16 v1, -0x10

    .line 25
    .line 26
    :goto_0
    const/16 v2, 0x2f

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    if-ge v1, v2, :cond_0

    .line 30
    .line 31
    and-int/lit16 v2, v1, 0xff

    .line 32
    .line 33
    aput-byte v3, v0, v2

    .line 34
    .line 35
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/16 v1, 0x30

    .line 39
    .line 40
    :goto_1
    const/16 v2, 0x3f

    .line 41
    .line 42
    const/4 v4, 0x2

    .line 43
    if-ge v1, v2, :cond_1

    .line 44
    .line 45
    and-int/lit16 v2, v1, 0xff

    .line 46
    .line 47
    aput-byte v4, v0, v2

    .line 48
    .line 49
    add-int/lit8 v1, v1, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    const/16 v1, 0x40

    .line 53
    .line 54
    :goto_2
    const/16 v2, 0x47

    .line 55
    .line 56
    const/4 v5, 0x3

    .line 57
    if-ge v1, v2, :cond_2

    .line 58
    .line 59
    and-int/lit16 v2, v1, 0xff

    .line 60
    .line 61
    aput-byte v5, v0, v2

    .line 62
    .line 63
    add-int/lit8 v1, v1, 0x1

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    const/16 v1, -0x28

    .line 67
    .line 68
    :goto_3
    const/16 v2, -0x11

    .line 69
    .line 70
    if-ge v1, v2, :cond_3

    .line 71
    .line 72
    and-int/lit16 v2, v1, 0xff

    .line 73
    .line 74
    aput-byte v3, v0, v2

    .line 75
    .line 76
    add-int/lit8 v1, v1, 0x1

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_3
    const/16 v1, -0x38

    .line 80
    .line 81
    :goto_4
    const/16 v2, -0x29

    .line 82
    .line 83
    if-ge v1, v2, :cond_4

    .line 84
    .line 85
    and-int/lit16 v2, v1, 0xff

    .line 86
    .line 87
    aput-byte v4, v0, v2

    .line 88
    .line 89
    add-int/lit8 v1, v1, 0x1

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_4
    const/16 v1, -0x40

    .line 93
    .line 94
    :goto_5
    const/16 v2, -0x39

    .line 95
    .line 96
    if-ge v1, v2, :cond_5

    .line 97
    .line 98
    and-int/lit16 v2, v1, 0xff

    .line 99
    .line 100
    aput-byte v5, v0, v2

    .line 101
    .line 102
    add-int/lit8 v1, v1, 0x1

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_5
    const/16 v1, 0x49

    .line 106
    .line 107
    move v2, v1

    .line 108
    :goto_6
    const/16 v6, 0x78

    .line 109
    .line 110
    if-ge v2, v6, :cond_6

    .line 111
    .line 112
    and-int/lit16 v6, v2, 0xff

    .line 113
    .line 114
    add-int/lit8 v7, v2, -0x48

    .line 115
    .line 116
    int-to-byte v7, v7

    .line 117
    aput-byte v7, v0, v6

    .line 118
    .line 119
    add-int/lit8 v2, v2, 0x1

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_6
    const/16 v2, 0x94

    .line 123
    .line 124
    aput-byte v3, v0, v2

    .line 125
    .line 126
    aput-byte v3, v0, v1

    .line 127
    .line 128
    const/16 v1, 0xaf

    .line 129
    .line 130
    aput-byte v3, v0, v1

    .line 131
    .line 132
    const/16 v1, 0xb0

    .line 133
    .line 134
    aput-byte v3, v0, v1

    .line 135
    .line 136
    const/16 v1, 0xb1

    .line 137
    .line 138
    aput-byte v3, v0, v1

    .line 139
    .line 140
    const/16 v1, 0xbd

    .line 141
    .line 142
    aput-byte v4, v0, v1

    .line 143
    .line 144
    const/16 v1, 0xbc

    .line 145
    .line 146
    aput-byte v5, v0, v1

    .line 147
    .line 148
    const/16 v1, 0x48

    .line 149
    .line 150
    const/4 v2, 0x5

    .line 151
    aput-byte v2, v0, v1

    .line 152
    .line 153
    const/16 v1, 0xac

    .line 154
    .line 155
    aput-byte v2, v0, v1

    .line 156
    .line 157
    const/16 v1, 0xb7

    .line 158
    .line 159
    aput-byte v2, v0, v1

    .line 160
    .line 161
    const/16 v1, 0xbf

    .line 162
    .line 163
    aput-byte v2, v0, v1

    .line 164
    .line 165
    const/16 v1, 0xbe

    .line 166
    .line 167
    const/16 v2, 0x9

    .line 168
    .line 169
    aput-byte v2, v0, v1

    .line 170
    .line 171
    const/16 v1, 0xab

    .line 172
    .line 173
    aput-byte v2, v0, v1

    .line 174
    .line 175
    const/16 v1, 0xb5

    .line 176
    .line 177
    aput-byte v2, v0, v1

    .line 178
    .line 179
    const/16 v1, 0x79

    .line 180
    .line 181
    const/4 v2, -0x1

    .line 182
    aput-byte v2, v0, v1

    .line 183
    .line 184
    const/16 v1, 0x7a

    .line 185
    .line 186
    aput-byte v2, v0, v1

    .line 187
    .line 188
    const/16 v1, 0x7b

    .line 189
    .line 190
    aput-byte v2, v0, v1

    .line 191
    .line 192
    const/16 v1, 0x7c

    .line 193
    .line 194
    aput-byte v2, v0, v1

    .line 195
    .line 196
    const/16 v1, 0x7d

    .line 197
    .line 198
    aput-byte v2, v0, v1

    .line 199
    .line 200
    sput-object v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏世楪哲兰:[B

    .line 201
    .line 202
    return-void
.end method

.method public constructor <init>(ILcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;[B)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p2, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;Z)V

    .line 3
    .line 4
    .line 5
    iput-object p3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    iput p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 9
    .line 10
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏兰楪:I

    .line 11
    .line 12
    sget-object p1, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰苏世:[Lcom/alibaba/fastjson2/飘花落叶言子楪世兰哲苏;

    .line 13
    .line 14
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-static {p2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    array-length p3, p1

    .line 23
    sub-int/2addr p3, v0

    .line 24
    and-int/2addr p2, p3

    .line 25
    aget-object p1, p1, p2

    .line 26
    .line 27
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰苏哲楪:Lcom/alibaba/fastjson2/飘花落叶言子楪世兰哲苏;

    .line 28
    .line 29
    return-void
.end method

.method public static 飘花落叶言楪苏兰世哲子(I[BI)I
    .locals 0

    .line 1
    add-int/lit8 p2, p2, 0x30

    .line 2
    .line 3
    shl-int/lit8 p2, p2, 0x8

    .line 4
    .line 5
    aget-byte p0, p1, p0

    .line 6
    .line 7
    and-int/lit16 p0, p0, 0xff

    .line 8
    .line 9
    add-int/2addr p2, p0

    .line 10
    return p2
.end method

.method public static 飘花落叶言楪苏兰世子哲(I[BI)I
    .locals 0

    .line 1
    add-int/lit8 p2, p2, 0x3c

    .line 2
    .line 3
    shl-int/lit8 p2, p2, 0x10

    .line 4
    .line 5
    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪苏兰哲([BI)S

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const p1, 0xffff

    .line 10
    .line 11
    .line 12
    and-int/2addr p0, p1

    .line 13
    add-int/2addr p2, p0

    .line 14
    return p2
.end method

.method public static 飘花落叶言楪苏兰哲世子(B)Lcom/alibaba/fastjson2/JSONException;
    .locals 3

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "name not support input : "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(B)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public static 飘花落叶言楪苏兰子世哲(I[BI)I
    .locals 0

    .line 1
    add-int/lit8 p2, p2, -0x44

    .line 2
    .line 3
    shl-int/lit8 p2, p2, 0x10

    .line 4
    .line 5
    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪苏兰哲([BI)S

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const p1, 0xffff

    .line 10
    .line 11
    .line 12
    and-int/2addr p0, p1

    .line 13
    add-int/2addr p2, p0

    .line 14
    return p2
.end method

.method public static 飘花落叶言楪苏兰子哲世(I[BI)I
    .locals 0

    .line 1
    add-int/lit8 p2, p2, -0x38

    .line 2
    .line 3
    shl-int/lit8 p2, p2, 0x8

    .line 4
    .line 5
    aget-byte p0, p1, p0

    .line 6
    .line 7
    and-int/lit16 p0, p0, 0xff

    .line 8
    .line 9
    add-int/2addr p2, p0

    .line 10
    return p2
.end method

.method public static 飘花落叶言楪苏哲世兰子(II)V
    .locals 2

    .line 1
    add-int/lit8 v0, p0, 0x3

    .line 2
    .line 3
    if-ge v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string v0, "offset overflow, offset "

    .line 7
    .line 8
    const-string v1, ", end "

    .line 9
    .line 10
    invoke-static {p0, p1, v0, v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲兰世(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static 飘花落叶言楪苏哲兰子世(II)V
    .locals 2

    .line 1
    add-int/lit8 v0, p0, 0x7

    .line 2
    .line 3
    if-ge v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string v0, "offset overflow, offset "

    .line 7
    .line 8
    const-string v1, ", end "

    .line 9
    .line 10
    invoke-static {p0, p1, v0, v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲兰世(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰苏楪哲:[B

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    const/high16 v2, 0x800000

    .line 7
    .line 8
    if-ge v1, v2, :cond_0

    .line 9
    .line 10
    sget-object v1, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世哲苏:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 11
    .line 12
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰苏哲楪:Lcom/alibaba/fastjson2/飘花落叶言子楪世兰哲苏;

    .line 13
    .line 14
    invoke-virtual {v1, p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子世兰哲苏楪()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 4
    .line 5
    aget-byte v0, v0, v1

    .line 6
    .line 7
    iput-byte v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰楪苏:B

    .line 8
    .line 9
    const/16 p0, 0x49

    .line 10
    .line 11
    if-lt v0, p0, :cond_0

    .line 12
    .line 13
    const/16 v1, 0x78

    .line 14
    .line 15
    if-ge v0, v1, :cond_0

    .line 16
    .line 17
    sub-int/2addr v0, p0

    .line 18
    return v0

    .line 19
    :cond_0
    invoke-static {}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世()V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public final 飘花落叶言子世兰楪哲苏()Ljava/lang/String;
    .locals 5

    .line 1
    iget-byte v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪苏哲:B

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 4
    .line 5
    const/16 v2, -0x51

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-ne v0, v2, :cond_0

    .line 9
    .line 10
    return-object v3

    .line 11
    :cond_0
    if-ltz v1, :cond_9

    .line 12
    .line 13
    const/16 v2, 0x79

    .line 14
    .line 15
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 16
    .line 17
    if-ne v0, v2, :cond_1

    .line 18
    .line 19
    sget-object v0, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/16 v2, 0x49

    .line 23
    .line 24
    if-lt v0, v2, :cond_4

    .line 25
    .line 26
    const/16 v2, 0x78

    .line 27
    .line 28
    if-gt v0, v2, :cond_4

    .line 29
    .line 30
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世苏哲:Ljava/util/function/BiFunction;

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 35
    .line 36
    invoke-static {p0, v3, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰(I[BI)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_2
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世哲苏:Ljava/util/function/BiFunction;

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    new-array v2, v1, [B

    .line 46
    .line 47
    iget p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 48
    .line 49
    const/4 v4, 0x0

    .line 50
    invoke-static {v3, p0, v2, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 51
    .line 52
    .line 53
    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-interface {v0, v2, p0}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, Ljava/lang/String;

    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_3
    sget-object v0, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_4
    const/16 v2, 0x7a

    .line 68
    .line 69
    if-ne v0, v2, :cond_5

    .line 70
    .line 71
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_5
    const/16 v2, 0x7b

    .line 75
    .line 76
    if-ne v0, v2, :cond_6

    .line 77
    .line 78
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_16:Ljava/nio/charset/Charset;

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_6
    const/16 v2, 0x7c

    .line 82
    .line 83
    if-ne v0, v2, :cond_7

    .line 84
    .line 85
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_7
    const/16 v2, 0x7d

    .line 89
    .line 90
    if-ne v0, v2, :cond_8

    .line 91
    .line 92
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_16BE:Ljava/nio/charset/Charset;

    .line 93
    .line 94
    :goto_0
    new-instance v2, Ljava/lang/String;

    .line 95
    .line 96
    iget p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 97
    .line 98
    invoke-direct {v2, v3, p0, v1, v0}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 99
    .line 100
    .line 101
    return-object v2

    .line 102
    :cond_8
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰哲世子(B)Lcom/alibaba/fastjson2/JSONException;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    throw p0

    .line 107
    :cond_9
    throw v3
.end method

.method public final 飘花落叶言子世楪哲苏兰()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final 飘花落叶言子世苏楪兰哲()J
    .locals 15

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    move-wide v5, v1

    .line 7
    move v4, v3

    .line 8
    :goto_0
    iget v7, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 9
    .line 10
    const/16 v8, 0x5a

    .line 11
    .line 12
    const/16 v9, 0x41

    .line 13
    .line 14
    const/16 v10, 0x2d

    .line 15
    .line 16
    const/16 v11, 0x5f

    .line 17
    .line 18
    iget-object v12, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 19
    .line 20
    const/16 v13, 0x20

    .line 21
    .line 22
    if-ge v4, v7, :cond_5

    .line 23
    .line 24
    aget-byte v7, v12, v0

    .line 25
    .line 26
    if-ltz v7, :cond_4

    .line 27
    .line 28
    const/16 v14, 0x8

    .line 29
    .line 30
    if-ge v4, v14, :cond_4

    .line 31
    .line 32
    if-nez v4, :cond_0

    .line 33
    .line 34
    iget v14, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 35
    .line 36
    aget-byte v14, v12, v14

    .line 37
    .line 38
    if-nez v14, :cond_0

    .line 39
    .line 40
    goto :goto_4

    .line 41
    :cond_0
    if-eq v7, v11, :cond_1

    .line 42
    .line 43
    if-eq v7, v10, :cond_1

    .line 44
    .line 45
    if-ne v7, v13, :cond_2

    .line 46
    .line 47
    :cond_1
    add-int/lit8 v10, v0, 0x1

    .line 48
    .line 49
    aget-byte v10, v12, v10

    .line 50
    .line 51
    if-eq v10, v7, :cond_2

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_2
    if-lt v7, v9, :cond_3

    .line 55
    .line 56
    if-gt v7, v8, :cond_3

    .line 57
    .line 58
    add-int/lit8 v7, v7, 0x20

    .line 59
    .line 60
    int-to-byte v7, v7

    .line 61
    :cond_3
    packed-switch v4, :pswitch_data_0

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :pswitch_0
    int-to-long v7, v7

    .line 66
    const/16 v9, 0x38

    .line 67
    .line 68
    shl-long/2addr v7, v9

    .line 69
    const-wide v9, 0xffffffffffffffL

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    :goto_1
    and-long/2addr v5, v9

    .line 75
    add-long/2addr v5, v7

    .line 76
    goto :goto_2

    .line 77
    :pswitch_1
    int-to-long v7, v7

    .line 78
    const/16 v9, 0x30

    .line 79
    .line 80
    shl-long/2addr v7, v9

    .line 81
    const-wide v9, 0xffffffffffffL

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :pswitch_2
    int-to-long v7, v7

    .line 88
    const/16 v9, 0x28

    .line 89
    .line 90
    shl-long/2addr v7, v9

    .line 91
    const-wide v9, 0xffffffffffL

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :pswitch_3
    int-to-long v7, v7

    .line 98
    shl-long/2addr v7, v13

    .line 99
    const-wide v9, 0xffffffffL

    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :pswitch_4
    shl-int/lit8 v7, v7, 0x18

    .line 106
    .line 107
    int-to-long v7, v7

    .line 108
    const-wide/32 v9, 0xffffff

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :pswitch_5
    shl-int/lit8 v7, v7, 0x10

    .line 113
    .line 114
    int-to-long v7, v7

    .line 115
    const-wide/32 v9, 0xffff

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :pswitch_6
    shl-int/lit8 v7, v7, 0x8

    .line 120
    .line 121
    int-to-long v7, v7

    .line 122
    const-wide/16 v9, 0xff

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :pswitch_7
    int-to-long v5, v7

    .line 126
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 127
    .line 128
    :goto_3
    add-int/lit8 v0, v0, 0x1

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_4
    :goto_4
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 132
    .line 133
    move-wide v5, v1

    .line 134
    :cond_5
    cmp-long v1, v5, v1

    .line 135
    .line 136
    if-eqz v1, :cond_6

    .line 137
    .line 138
    return-wide v5

    .line 139
    :cond_6
    const-wide v1, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    :goto_5
    iget v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 145
    .line 146
    if-ge v3, v4, :cond_a

    .line 147
    .line 148
    add-int/lit8 v4, v0, 0x1

    .line 149
    .line 150
    aget-byte v0, v12, v0

    .line 151
    .line 152
    if-lt v0, v9, :cond_7

    .line 153
    .line 154
    if-gt v0, v8, :cond_7

    .line 155
    .line 156
    add-int/lit8 v0, v0, 0x20

    .line 157
    .line 158
    int-to-byte v0, v0

    .line 159
    :cond_7
    if-eq v0, v11, :cond_9

    .line 160
    .line 161
    if-eq v0, v10, :cond_9

    .line 162
    .line 163
    if-ne v0, v13, :cond_8

    .line 164
    .line 165
    goto :goto_6

    .line 166
    :cond_8
    int-to-long v5, v0

    .line 167
    xor-long v0, v1, v5

    .line 168
    .line 169
    const-wide v5, 0x100000001b3L

    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    mul-long/2addr v0, v5

    .line 175
    move-wide v1, v0

    .line 176
    :cond_9
    :goto_6
    add-int/lit8 v3, v3, 0x1

    .line 177
    .line 178
    move v0, v4

    .line 179
    goto :goto_5

    .line 180
    :cond_a
    return-wide v1

    .line 181
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final 飘花落叶言子兰世哲楪苏()Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 3
    .line 4
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 5
    .line 6
    add-int/lit8 v2, v1, 0x1

    .line 7
    .line 8
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 9
    .line 10
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 11
    .line 12
    aget-byte v1, v2, v1

    .line 13
    .line 14
    const/16 v2, -0x4f

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_0
    const/16 v2, -0x50

    .line 21
    .line 22
    if-ne v1, v2, :cond_1

    .line 23
    .line 24
    return v0

    .line 25
    :cond_1
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子世苏兰(B)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    return p0
.end method

.method public final 飘花落叶言子兰世哲苏楪()C
    .locals 5

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    const/16 v3, -0x70

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    :goto_0
    int-to-char p0, p0

    .line 20
    return p0

    .line 21
    :cond_0
    const/16 v3, 0x49

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    if-ne v2, v3, :cond_1

    .line 25
    .line 26
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 29
    .line 30
    return v4

    .line 31
    :cond_1
    if-le v2, v3, :cond_2

    .line 32
    .line 33
    const/16 v3, 0x78

    .line 34
    .line 35
    if-ge v2, v3, :cond_2

    .line 36
    .line 37
    add-int/lit8 v2, v0, 0x1

    .line 38
    .line 39
    add-int/lit8 v0, v0, 0x2

    .line 40
    .line 41
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 42
    .line 43
    aget-byte p0, v1, v2

    .line 44
    .line 45
    and-int/lit16 p0, p0, 0xff

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    if-eqz p0, :cond_4

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    return p0

    .line 66
    :cond_4
    :goto_1
    return v4
.end method

.method public final 飘花落叶言子兰世楪哲苏()Ljava/math/BigInteger;
    .locals 8

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 6
    .line 7
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 8
    .line 9
    aget-byte v3, v2, v0

    .line 10
    .line 11
    const/16 v4, -0x46

    .line 12
    .line 13
    if-ne v3, v4, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世兰苏哲()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    const/16 v4, -0x45

    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    if-ne v3, v4, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    new-array v1, v0, [B

    .line 34
    .line 35
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 36
    .line 37
    invoke-static {v2, v3, v1, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 38
    .line 39
    .line 40
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 41
    .line 42
    add-int/2addr v2, v0

    .line 43
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 44
    .line 45
    new-instance p0, Ljava/math/BigInteger;

    .line 46
    .line 47
    invoke-direct {p0, v1}, Ljava/math/BigInteger;-><init>([B)V

    .line 48
    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_1
    const/16 v4, -0x6f

    .line 52
    .line 53
    if-eq v3, v4, :cond_12

    .line 54
    .line 55
    const/16 v4, -0x47

    .line 56
    .line 57
    if-eq v3, v4, :cond_10

    .line 58
    .line 59
    const/16 v4, 0x48

    .line 60
    .line 61
    iget v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏兰楪:I

    .line 62
    .line 63
    if-eq v3, v4, :cond_f

    .line 64
    .line 65
    const/16 v4, 0x7c

    .line 66
    .line 67
    const/4 v6, -0x1

    .line 68
    const/16 v7, 0x2e

    .line 69
    .line 70
    if-eq v3, v4, :cond_d

    .line 71
    .line 72
    const/16 v4, 0x79

    .line 73
    .line 74
    if-eq v3, v4, :cond_b

    .line 75
    .line 76
    const/16 v4, 0x7a

    .line 77
    .line 78
    if-eq v3, v4, :cond_9

    .line 79
    .line 80
    packed-switch v3, :pswitch_data_0

    .line 81
    .line 82
    .line 83
    packed-switch v3, :pswitch_data_1

    .line 84
    .line 85
    .line 86
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(I)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_2

    .line 91
    .line 92
    int-to-long v0, v3

    .line 93
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    :cond_2
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(I)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_3

    .line 103
    .line 104
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 105
    .line 106
    add-int/lit8 v1, v0, 0x1

    .line 107
    .line 108
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 109
    .line 110
    invoke-static {v0, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰子哲世(I[BI)I

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    int-to-long v0, p0

    .line 115
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    return-object p0

    .line 120
    :cond_3
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(I)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_4

    .line 125
    .line 126
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 127
    .line 128
    add-int/lit8 v1, v0, 0x1

    .line 129
    .line 130
    if-ge v1, v5, :cond_4

    .line 131
    .line 132
    invoke-static {v0, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰子世哲(I[BI)I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 137
    .line 138
    add-int/lit8 v1, v1, 0x2

    .line 139
    .line 140
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 141
    .line 142
    int-to-long v0, v0

    .line 143
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    return-object p0

    .line 148
    :cond_4
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(I)Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-eqz v0, :cond_5

    .line 153
    .line 154
    add-int/lit8 v3, v3, 0x20

    .line 155
    .line 156
    int-to-long v0, v3

    .line 157
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    return-object p0

    .line 162
    :cond_5
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(I)Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_6

    .line 167
    .line 168
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 169
    .line 170
    add-int/lit8 v1, v0, 0x1

    .line 171
    .line 172
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 173
    .line 174
    invoke-static {v0, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰世哲子(I[BI)I

    .line 175
    .line 176
    .line 177
    move-result p0

    .line 178
    int-to-long v0, p0

    .line 179
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    return-object p0

    .line 184
    :cond_6
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲(I)Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-eqz v0, :cond_7

    .line 189
    .line 190
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 191
    .line 192
    add-int/lit8 v1, v0, 0x1

    .line 193
    .line 194
    if-ge v1, v5, :cond_7

    .line 195
    .line 196
    invoke-static {v0, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰世子哲(I[BI)I

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 201
    .line 202
    add-int/lit8 v1, v1, 0x2

    .line 203
    .line 204
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 205
    .line 206
    int-to-long v0, v0

    .line 207
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    return-object p0

    .line 212
    :cond_7
    const/16 v0, 0x49

    .line 213
    .line 214
    if-lt v3, v0, :cond_8

    .line 215
    .line 216
    const/16 v1, 0x78

    .line 217
    .line 218
    if-gt v3, v1, :cond_8

    .line 219
    .line 220
    sub-int/2addr v3, v0

    .line 221
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子世兰苏(I)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 226
    .line 227
    add-int/2addr v1, v3

    .line 228
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 229
    .line 230
    new-instance p0, Ljava/math/BigInteger;

    .line 231
    .line 232
    invoke-direct {p0, v0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    return-object p0

    .line 236
    :cond_8
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰哲世子(B)Lcom/alibaba/fastjson2/JSONException;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    throw p0

    .line 241
    :pswitch_0
    invoke-static {v1, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲兰子世(II)V

    .line 242
    .line 243
    .line 244
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲([BI)J

    .line 245
    .line 246
    .line 247
    move-result-wide v0

    .line 248
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 249
    .line 250
    add-int/lit8 v2, v2, 0x8

    .line 251
    .line 252
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 253
    .line 254
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    return-object p0

    .line 259
    :pswitch_1
    add-int/lit8 v0, v0, 0x2

    .line 260
    .line 261
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 262
    .line 263
    aget-byte p0, v2, v1

    .line 264
    .line 265
    int-to-long v0, p0

    .line 266
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    return-object p0

    .line 271
    :pswitch_2
    add-int/lit8 v3, v0, 0x2

    .line 272
    .line 273
    aget-byte v3, v2, v3

    .line 274
    .line 275
    and-int/lit16 v3, v3, 0xff

    .line 276
    .line 277
    aget-byte v1, v2, v1

    .line 278
    .line 279
    shl-int/lit8 v1, v1, 0x8

    .line 280
    .line 281
    add-int/2addr v3, v1

    .line 282
    add-int/lit8 v0, v0, 0x3

    .line 283
    .line 284
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 285
    .line 286
    int-to-long v0, v3

    .line 287
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    return-object p0

    .line 292
    :pswitch_3
    invoke-static {v1, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 293
    .line 294
    .line 295
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 300
    .line 301
    add-int/lit8 v1, v1, 0x4

    .line 302
    .line 303
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 304
    .line 305
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 306
    .line 307
    .line 308
    move-result p0

    .line 309
    float-to-long v0, p0

    .line 310
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 311
    .line 312
    .line 313
    move-result-object p0

    .line 314
    return-object p0

    .line 315
    :pswitch_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 316
    .line 317
    .line 318
    move-result p0

    .line 319
    int-to-float p0, p0

    .line 320
    float-to-long v0, p0

    .line 321
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 322
    .line 323
    .line 324
    move-result-object p0

    .line 325
    return-object p0

    .line 326
    :pswitch_5
    invoke-static {v1, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲兰子世(II)V

    .line 327
    .line 328
    .line 329
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲([BI)J

    .line 330
    .line 331
    .line 332
    move-result-wide v0

    .line 333
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 334
    .line 335
    add-int/lit8 v2, v2, 0x8

    .line 336
    .line 337
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 338
    .line 339
    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 340
    .line 341
    .line 342
    move-result-wide v0

    .line 343
    double-to-long v0, v0

    .line 344
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 345
    .line 346
    .line 347
    move-result-object p0

    .line 348
    return-object p0

    .line 349
    :pswitch_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世兰苏哲()J

    .line 350
    .line 351
    .line 352
    move-result-wide v0

    .line 353
    long-to-double v0, v0

    .line 354
    double-to-long v0, v0

    .line 355
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 356
    .line 357
    .line 358
    move-result-object p0

    .line 359
    return-object p0

    .line 360
    :pswitch_7
    sget-object p0, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    .line 361
    .line 362
    return-object p0

    .line 363
    :pswitch_8
    sget-object p0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 364
    .line 365
    return-object p0

    .line 366
    :pswitch_9
    const/4 p0, 0x0

    .line 367
    return-object p0

    .line 368
    :cond_9
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    new-instance v1, Ljava/lang/String;

    .line 373
    .line 374
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 375
    .line 376
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 377
    .line 378
    invoke-direct {v1, v2, v3, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 379
    .line 380
    .line 381
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 382
    .line 383
    add-int/2addr v2, v0

    .line 384
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 385
    .line 386
    invoke-virtual {v1, v7}, Ljava/lang/String;->indexOf(I)I

    .line 387
    .line 388
    .line 389
    move-result p0

    .line 390
    if-ne p0, v6, :cond_a

    .line 391
    .line 392
    new-instance p0, Ljava/math/BigInteger;

    .line 393
    .line 394
    invoke-direct {p0, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    return-object p0

    .line 398
    :cond_a
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 399
    .line 400
    .line 401
    move-result-object p0

    .line 402
    invoke-virtual {p0}, Ljava/math/BigDecimal;->toBigInteger()Ljava/math/BigInteger;

    .line 403
    .line 404
    .line 405
    move-result-object p0

    .line 406
    return-object p0

    .line 407
    :cond_b
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 408
    .line 409
    .line 410
    move-result v0

    .line 411
    new-instance v1, Ljava/lang/String;

    .line 412
    .line 413
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 414
    .line 415
    sget-object v4, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 416
    .line 417
    invoke-direct {v1, v2, v3, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 418
    .line 419
    .line 420
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 421
    .line 422
    add-int/2addr v2, v0

    .line 423
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 424
    .line 425
    invoke-virtual {v1, v7}, Ljava/lang/String;->indexOf(I)I

    .line 426
    .line 427
    .line 428
    move-result p0

    .line 429
    if-ne p0, v6, :cond_c

    .line 430
    .line 431
    new-instance p0, Ljava/math/BigInteger;

    .line 432
    .line 433
    invoke-direct {p0, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    return-object p0

    .line 437
    :cond_c
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 438
    .line 439
    .line 440
    move-result-object p0

    .line 441
    invoke-virtual {p0}, Ljava/math/BigDecimal;->toBigInteger()Ljava/math/BigInteger;

    .line 442
    .line 443
    .line 444
    move-result-object p0

    .line 445
    return-object p0

    .line 446
    :cond_d
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 447
    .line 448
    .line 449
    move-result v0

    .line 450
    new-instance v1, Ljava/lang/String;

    .line 451
    .line 452
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 453
    .line 454
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 455
    .line 456
    invoke-direct {v1, v2, v3, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 457
    .line 458
    .line 459
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 460
    .line 461
    add-int/2addr v2, v0

    .line 462
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 463
    .line 464
    invoke-virtual {v1, v7}, Ljava/lang/String;->indexOf(I)I

    .line 465
    .line 466
    .line 467
    move-result p0

    .line 468
    if-ne p0, v6, :cond_e

    .line 469
    .line 470
    new-instance p0, Ljava/math/BigInteger;

    .line 471
    .line 472
    invoke-direct {p0, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 473
    .line 474
    .line 475
    return-object p0

    .line 476
    :cond_e
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 477
    .line 478
    .line 479
    move-result-object p0

    .line 480
    invoke-virtual {p0}, Ljava/math/BigDecimal;->toBigInteger()Ljava/math/BigInteger;

    .line 481
    .line 482
    .line 483
    move-result-object p0

    .line 484
    return-object p0

    .line 485
    :cond_f
    :pswitch_a
    invoke-static {v1, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 486
    .line 487
    .line 488
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 489
    .line 490
    .line 491
    move-result v0

    .line 492
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 493
    .line 494
    add-int/lit8 v1, v1, 0x4

    .line 495
    .line 496
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 497
    .line 498
    int-to-long v0, v0

    .line 499
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 500
    .line 501
    .line 502
    move-result-object p0

    .line 503
    return-object p0

    .line 504
    :cond_10
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 505
    .line 506
    .line 507
    move-result v0

    .line 508
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰世楪哲苏()Ljava/math/BigInteger;

    .line 509
    .line 510
    .line 511
    move-result-object p0

    .line 512
    if-nez v0, :cond_11

    .line 513
    .line 514
    new-instance v0, Ljava/math/BigDecimal;

    .line 515
    .line 516
    invoke-direct {v0, p0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 517
    .line 518
    .line 519
    goto :goto_0

    .line 520
    :cond_11
    new-instance v1, Ljava/math/BigDecimal;

    .line 521
    .line 522
    invoke-direct {v1, p0, v0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 523
    .line 524
    .line 525
    move-object v0, v1

    .line 526
    :goto_0
    invoke-virtual {v0}, Ljava/math/BigDecimal;->toBigInteger()Ljava/math/BigInteger;

    .line 527
    .line 528
    .line 529
    move-result-object p0

    .line 530
    return-object p0

    .line 531
    :cond_12
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 532
    .line 533
    .line 534
    move-result v0

    .line 535
    new-array v1, v0, [B

    .line 536
    .line 537
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 538
    .line 539
    invoke-static {v2, v3, v1, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 540
    .line 541
    .line 542
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 543
    .line 544
    add-int/2addr v2, v0

    .line 545
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 546
    .line 547
    new-instance p0, Ljava/math/BigInteger;

    .line 548
    .line 549
    invoke-direct {p0, v1}, Ljava/math/BigInteger;-><init>([B)V

    .line 550
    .line 551
    .line 552
    return-object p0

    .line 553
    :pswitch_data_0
    .packed-switch -0x51
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    :pswitch_data_1
    .packed-switch -0x44
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_a
    .end packed-switch
.end method

.method public final 飘花落叶言子兰世楪苏哲()Ljava/math/BigDecimal;
    .locals 7

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 6
    .line 7
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 8
    .line 9
    aget-byte v3, v2, v0

    .line 10
    .line 11
    const/16 v4, -0x47

    .line 12
    .line 13
    const/16 v5, 0x48

    .line 14
    .line 15
    iget v6, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏兰楪:I

    .line 16
    .line 17
    if-ne v3, v4, :cond_4

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 24
    .line 25
    aget-byte v3, v2, v1

    .line 26
    .line 27
    const/16 v4, -0x46

    .line 28
    .line 29
    if-ne v3, v4, :cond_0

    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世兰苏哲()J

    .line 36
    .line 37
    .line 38
    move-result-wide v1

    .line 39
    invoke-static {v1, v2, v0}, Ljava/math/BigDecimal;->valueOf(JI)Ljava/math/BigDecimal;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :cond_0
    if-ne v3, v5, :cond_1

    .line 45
    .line 46
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    invoke-static {v1, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 49
    .line 50
    .line 51
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    int-to-long v1, v1

    .line 56
    invoke-static {v1, v2, v0}, Ljava/math/BigDecimal;->valueOf(JI)Ljava/math/BigDecimal;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 61
    .line 62
    add-int/lit8 v1, v1, 0x5

    .line 63
    .line 64
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 65
    .line 66
    return-object v0

    .line 67
    :cond_1
    const/16 v4, -0x42

    .line 68
    .line 69
    if-ne v3, v4, :cond_2

    .line 70
    .line 71
    add-int/lit8 v1, v1, 0x1

    .line 72
    .line 73
    invoke-static {v1, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲兰子世(II)V

    .line 74
    .line 75
    .line 76
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲([BI)J

    .line 77
    .line 78
    .line 79
    move-result-wide v1

    .line 80
    invoke-static {v1, v2, v0}, Ljava/math/BigDecimal;->valueOf(JI)Ljava/math/BigDecimal;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 85
    .line 86
    add-int/lit8 v1, v1, 0x9

    .line 87
    .line 88
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 89
    .line 90
    return-object v0

    .line 91
    :cond_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰世楪哲苏()Ljava/math/BigInteger;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    if-nez v0, :cond_3

    .line 96
    .line 97
    new-instance v0, Ljava/math/BigDecimal;

    .line 98
    .line 99
    invoke-direct {v0, p0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 100
    .line 101
    .line 102
    return-object v0

    .line 103
    :cond_3
    new-instance v1, Ljava/math/BigDecimal;

    .line 104
    .line 105
    invoke-direct {v1, p0, v0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 106
    .line 107
    .line 108
    return-object v1

    .line 109
    :cond_4
    const/16 v4, -0x48

    .line 110
    .line 111
    if-ne v3, v4, :cond_5

    .line 112
    .line 113
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世兰苏哲()J

    .line 114
    .line 115
    .line 116
    move-result-wide v0

    .line 117
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    return-object p0

    .line 122
    :cond_5
    if-eq v3, v5, :cond_10

    .line 123
    .line 124
    const/16 v4, 0x7c

    .line 125
    .line 126
    if-eq v3, v4, :cond_f

    .line 127
    .line 128
    const/16 v4, 0x79

    .line 129
    .line 130
    if-eq v3, v4, :cond_e

    .line 131
    .line 132
    const/16 v4, 0x7a

    .line 133
    .line 134
    if-eq v3, v4, :cond_d

    .line 135
    .line 136
    packed-switch v3, :pswitch_data_0

    .line 137
    .line 138
    .line 139
    packed-switch v3, :pswitch_data_1

    .line 140
    .line 141
    .line 142
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(I)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_6

    .line 147
    .line 148
    int-to-long v0, v3

    .line 149
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    return-object p0

    .line 154
    :cond_6
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(I)Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eqz v0, :cond_7

    .line 159
    .line 160
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 161
    .line 162
    add-int/lit8 v1, v0, 0x1

    .line 163
    .line 164
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 165
    .line 166
    invoke-static {v0, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰子哲世(I[BI)I

    .line 167
    .line 168
    .line 169
    move-result p0

    .line 170
    int-to-long v0, p0

    .line 171
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    return-object p0

    .line 176
    :cond_7
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(I)Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-eqz v0, :cond_8

    .line 181
    .line 182
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 183
    .line 184
    add-int/lit8 v1, v0, 0x1

    .line 185
    .line 186
    if-ge v1, v6, :cond_8

    .line 187
    .line 188
    invoke-static {v0, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰子世哲(I[BI)I

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 193
    .line 194
    add-int/lit8 v1, v1, 0x2

    .line 195
    .line 196
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 197
    .line 198
    int-to-long v0, v0

    .line 199
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    return-object p0

    .line 204
    :cond_8
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(I)Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    if-eqz v0, :cond_9

    .line 209
    .line 210
    add-int/lit8 v3, v3, 0x20

    .line 211
    .line 212
    int-to-long v0, v3

    .line 213
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    return-object p0

    .line 218
    :cond_9
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(I)Z

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-eqz v0, :cond_a

    .line 223
    .line 224
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 225
    .line 226
    add-int/lit8 v1, v0, 0x1

    .line 227
    .line 228
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 229
    .line 230
    invoke-static {v0, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰世哲子(I[BI)I

    .line 231
    .line 232
    .line 233
    move-result p0

    .line 234
    int-to-long v0, p0

    .line 235
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    return-object p0

    .line 240
    :cond_a
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲(I)Z

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    if-eqz v0, :cond_b

    .line 245
    .line 246
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 247
    .line 248
    add-int/lit8 v1, v0, 0x1

    .line 249
    .line 250
    if-ge v1, v6, :cond_b

    .line 251
    .line 252
    invoke-static {v0, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰世子哲(I[BI)I

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 257
    .line 258
    add-int/lit8 v1, v1, 0x2

    .line 259
    .line 260
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 261
    .line 262
    int-to-long v0, v0

    .line 263
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    return-object p0

    .line 268
    :cond_b
    const/16 v0, 0x49

    .line 269
    .line 270
    if-lt v3, v0, :cond_c

    .line 271
    .line 272
    const/16 v1, 0x78

    .line 273
    .line 274
    if-gt v3, v1, :cond_c

    .line 275
    .line 276
    sub-int/2addr v3, v0

    .line 277
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子世兰苏(I)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 282
    .line 283
    add-int/2addr v1, v3

    .line 284
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 285
    .line 286
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 287
    .line 288
    .line 289
    move-result-object p0

    .line 290
    return-object p0

    .line 291
    :cond_c
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰哲世子(B)Lcom/alibaba/fastjson2/JSONException;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    throw p0

    .line 296
    :pswitch_0
    invoke-static {v1, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲兰子世(II)V

    .line 297
    .line 298
    .line 299
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲([BI)J

    .line 300
    .line 301
    .line 302
    move-result-wide v0

    .line 303
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 304
    .line 305
    add-int/lit8 v2, v2, 0x8

    .line 306
    .line 307
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 308
    .line 309
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 310
    .line 311
    .line 312
    move-result-object p0

    .line 313
    return-object p0

    .line 314
    :pswitch_1
    add-int/lit8 v0, v0, 0x2

    .line 315
    .line 316
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 317
    .line 318
    aget-byte p0, v2, v1

    .line 319
    .line 320
    int-to-long v0, p0

    .line 321
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 322
    .line 323
    .line 324
    move-result-object p0

    .line 325
    return-object p0

    .line 326
    :pswitch_2
    add-int/lit8 v3, v0, 0x2

    .line 327
    .line 328
    aget-byte v3, v2, v3

    .line 329
    .line 330
    and-int/lit16 v3, v3, 0xff

    .line 331
    .line 332
    aget-byte v1, v2, v1

    .line 333
    .line 334
    shl-int/lit8 v1, v1, 0x8

    .line 335
    .line 336
    add-int/2addr v3, v1

    .line 337
    add-int/lit8 v0, v0, 0x3

    .line 338
    .line 339
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 340
    .line 341
    int-to-long v0, v3

    .line 342
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 343
    .line 344
    .line 345
    move-result-object p0

    .line 346
    return-object p0

    .line 347
    :pswitch_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰世楪哲苏()Ljava/math/BigInteger;

    .line 348
    .line 349
    .line 350
    move-result-object p0

    .line 351
    new-instance v0, Ljava/math/BigDecimal;

    .line 352
    .line 353
    invoke-direct {v0, p0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 354
    .line 355
    .line 356
    return-object v0

    .line 357
    :pswitch_4
    invoke-static {v1, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 358
    .line 359
    .line 360
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 361
    .line 362
    .line 363
    move-result v0

    .line 364
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 365
    .line 366
    add-int/lit8 v1, v1, 0x4

    .line 367
    .line 368
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 369
    .line 370
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 371
    .line 372
    .line 373
    move-result p0

    .line 374
    float-to-long v0, p0

    .line 375
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 376
    .line 377
    .line 378
    move-result-object p0

    .line 379
    return-object p0

    .line 380
    :pswitch_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 381
    .line 382
    .line 383
    move-result p0

    .line 384
    int-to-float p0, p0

    .line 385
    float-to-long v0, p0

    .line 386
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 387
    .line 388
    .line 389
    move-result-object p0

    .line 390
    return-object p0

    .line 391
    :pswitch_6
    invoke-static {v1, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲兰子世(II)V

    .line 392
    .line 393
    .line 394
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲([BI)J

    .line 395
    .line 396
    .line 397
    move-result-wide v0

    .line 398
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 399
    .line 400
    add-int/lit8 v2, v2, 0x8

    .line 401
    .line 402
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 403
    .line 404
    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 405
    .line 406
    .line 407
    move-result-wide v0

    .line 408
    double-to-long v0, v0

    .line 409
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 410
    .line 411
    .line 412
    move-result-object p0

    .line 413
    return-object p0

    .line 414
    :pswitch_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世兰苏哲()J

    .line 415
    .line 416
    .line 417
    move-result-wide v0

    .line 418
    long-to-double v0, v0

    .line 419
    double-to-long v0, v0

    .line 420
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 421
    .line 422
    .line 423
    move-result-object p0

    .line 424
    return-object p0

    .line 425
    :pswitch_8
    sget-object p0, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    .line 426
    .line 427
    return-object p0

    .line 428
    :pswitch_9
    sget-object p0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 429
    .line 430
    return-object p0

    .line 431
    :pswitch_a
    const/4 p0, 0x0

    .line 432
    return-object p0

    .line 433
    :cond_d
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 434
    .line 435
    .line 436
    move-result v0

    .line 437
    new-instance v1, Ljava/lang/String;

    .line 438
    .line 439
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 440
    .line 441
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 442
    .line 443
    invoke-direct {v1, v2, v3, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 444
    .line 445
    .line 446
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 447
    .line 448
    add-int/2addr v2, v0

    .line 449
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 450
    .line 451
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 452
    .line 453
    .line 454
    move-result-object p0

    .line 455
    return-object p0

    .line 456
    :cond_e
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 457
    .line 458
    .line 459
    move-result v0

    .line 460
    new-instance v1, Ljava/lang/String;

    .line 461
    .line 462
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 463
    .line 464
    sget-object v4, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 465
    .line 466
    invoke-direct {v1, v2, v3, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 467
    .line 468
    .line 469
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 470
    .line 471
    add-int/2addr v2, v0

    .line 472
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 473
    .line 474
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 475
    .line 476
    .line 477
    move-result-object p0

    .line 478
    return-object p0

    .line 479
    :cond_f
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 480
    .line 481
    .line 482
    move-result v0

    .line 483
    new-instance v1, Ljava/lang/String;

    .line 484
    .line 485
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 486
    .line 487
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 488
    .line 489
    invoke-direct {v1, v2, v3, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 490
    .line 491
    .line 492
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 493
    .line 494
    add-int/2addr v2, v0

    .line 495
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 496
    .line 497
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 498
    .line 499
    .line 500
    move-result-object p0

    .line 501
    return-object p0

    .line 502
    :cond_10
    :pswitch_b
    invoke-static {v1, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 503
    .line 504
    .line 505
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 506
    .line 507
    .line 508
    move-result v0

    .line 509
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 510
    .line 511
    add-int/lit8 v1, v1, 0x4

    .line 512
    .line 513
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 514
    .line 515
    int-to-long v0, v0

    .line 516
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 517
    .line 518
    .line 519
    move-result-object p0

    .line 520
    return-object p0

    .line 521
    :pswitch_data_0
    .packed-switch -0x51
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    :pswitch_data_1
    .packed-switch -0x45
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_b
    .end packed-switch
.end method

.method public final 飘花落叶言子兰世苏哲楪()Ljava/lang/Boolean;
    .locals 2

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 6
    .line 7
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 8
    .line 9
    aget-byte v0, v1, v0

    .line 10
    .line 11
    const/16 v1, -0x51

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0

    .line 17
    :cond_0
    const/16 v1, -0x4f

    .line 18
    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_1
    const/16 v1, -0x50

    .line 25
    .line 26
    if-ne v0, v1, :cond_2

    .line 27
    .line 28
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_2
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子世苏兰(B)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public final 飘花落叶言子兰世苏楪哲()[B
    .locals 5

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 6
    .line 7
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 8
    .line 9
    aget-byte v0, v1, v0

    .line 10
    .line 11
    const/16 v2, -0x6f

    .line 12
    .line 13
    if-ne v0, v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    new-array v2, v0, [B

    .line 20
    .line 21
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-static {v1, v3, v2, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 25
    .line 26
    .line 27
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 28
    .line 29
    add-int/2addr v1, v0

    .line 30
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 31
    .line 32
    return-object v2

    .line 33
    :cond_0
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰哲世子(B)Lcom/alibaba/fastjson2/JSONException;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    throw p0
.end method

.method public final 飘花落叶言子兰哲世楪苏()F
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    const/16 v3, -0x49

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v2, v0, 0x1

    .line 12
    .line 13
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏兰楪:I

    .line 14
    .line 15
    invoke-static {v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    add-int/lit8 v0, v0, 0x5

    .line 23
    .line 24
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 25
    .line 26
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0

    .line 31
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子苏世兰()F

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0
.end method

.method public final 飘花落叶言子兰哲世苏楪()[B
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    div-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    new-array v1, v0, [B

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    :goto_0
    if-ge v2, v0, :cond_2

    .line 15
    .line 16
    mul-int/lit8 v3, v2, 0x2

    .line 17
    .line 18
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    const/16 v5, 0x37

    .line 29
    .line 30
    const/16 v6, 0x30

    .line 31
    .line 32
    const/16 v7, 0x39

    .line 33
    .line 34
    if-gt v4, v7, :cond_0

    .line 35
    .line 36
    move v8, v6

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    move v8, v5

    .line 39
    :goto_1
    sub-int/2addr v4, v8

    .line 40
    if-gt v3, v7, :cond_1

    .line 41
    .line 42
    move v5, v6

    .line 43
    :cond_1
    sub-int/2addr v3, v5

    .line 44
    shl-int/lit8 v4, v4, 0x4

    .line 45
    .line 46
    or-int/2addr v3, v4

    .line 47
    int-to-byte v3, v3

    .line 48
    aput-byte v3, v1, v2

    .line 49
    .line 50
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    return-object v1
.end method

.method public final 飘花落叶言子兰哲楪苏世()Ljava/lang/Float;
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    const/16 v3, -0x49

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v2, v0, 0x4

    .line 12
    .line 13
    aget-byte v2, v1, v2

    .line 14
    .line 15
    and-int/lit16 v2, v2, 0xff

    .line 16
    .line 17
    add-int/lit8 v3, v0, 0x3

    .line 18
    .line 19
    aget-byte v3, v1, v3

    .line 20
    .line 21
    and-int/lit16 v3, v3, 0xff

    .line 22
    .line 23
    shl-int/lit8 v3, v3, 0x8

    .line 24
    .line 25
    add-int/2addr v2, v3

    .line 26
    add-int/lit8 v3, v0, 0x2

    .line 27
    .line 28
    aget-byte v3, v1, v3

    .line 29
    .line 30
    and-int/lit16 v3, v3, 0xff

    .line 31
    .line 32
    shl-int/lit8 v3, v3, 0x10

    .line 33
    .line 34
    add-int/2addr v2, v3

    .line 35
    add-int/lit8 v3, v0, 0x1

    .line 36
    .line 37
    aget-byte v1, v1, v3

    .line 38
    .line 39
    shl-int/lit8 v1, v1, 0x18

    .line 40
    .line 41
    add-int/2addr v2, v1

    .line 42
    add-int/lit8 v0, v0, 0x5

    .line 43
    .line 44
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 45
    .line 46
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :cond_0
    const/16 v1, -0x51

    .line 56
    .line 57
    if-ne v2, v1, :cond_1

    .line 58
    .line 59
    add-int/lit8 v0, v0, 0x1

    .line 60
    .line 61
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 62
    .line 63
    const/4 p0, 0x0

    .line 64
    return-object p0

    .line 65
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子苏世兰()F

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0
.end method

.method public final 飘花落叶言子兰哲苏世楪()Ljava/time/Instant;
    .locals 7

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 6
    .line 7
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 8
    .line 9
    aget-byte v0, v2, v0

    .line 10
    .line 11
    const/16 v3, -0x42

    .line 12
    .line 13
    iget v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏兰楪:I

    .line 14
    .line 15
    if-eq v0, v3, :cond_0

    .line 16
    .line 17
    const-wide/16 v5, 0x0

    .line 18
    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    invoke-static {}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世()V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return-object p0

    .line 27
    :pswitch_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世兰苏哲()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    int-to-long v2, p0

    .line 36
    invoke-static {v0, v1, v2, v3}, Ljava/time/Instant;->ofEpochSecond(JJ)Ljava/time/Instant;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :pswitch_1
    invoke-static {v1, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 42
    .line 43
    .line 44
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    int-to-long v0, v0

    .line 49
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 50
    .line 51
    add-int/lit8 v2, v2, 0x4

    .line 52
    .line 53
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 54
    .line 55
    const-wide/16 v2, 0x3c

    .line 56
    .line 57
    mul-long/2addr v0, v2

    .line 58
    invoke-static {v0, v1, v5, v6}, Ljava/time/Instant;->ofEpochSecond(JJ)Ljava/time/Instant;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :pswitch_2
    invoke-static {v1, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 64
    .line 65
    .line 66
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    int-to-long v0, v0

    .line 71
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 72
    .line 73
    add-int/lit8 v2, v2, 0x4

    .line 74
    .line 75
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 76
    .line 77
    invoke-static {v0, v1, v5, v6}, Ljava/time/Instant;->ofEpochSecond(JJ)Ljava/time/Instant;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    :cond_0
    :pswitch_3
    invoke-static {v1, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲兰子世(II)V

    .line 83
    .line 84
    .line 85
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲([BI)J

    .line 86
    .line 87
    .line 88
    move-result-wide v0

    .line 89
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 90
    .line 91
    add-int/lit8 v2, v2, 0x8

    .line 92
    .line 93
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 94
    .line 95
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch -0x55
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子兰哲苏楪世()Z
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v1, v1, v0

    .line 6
    .line 7
    const/16 v2, -0x51

    .line 8
    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    add-int/2addr v0, v1

    .line 13
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public final 飘花落叶言子兰楪世哲苏(Ljava/util/Map;J)V
    .locals 8

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    const/16 v3, -0x5a

    .line 8
    .line 9
    if-ne v2, v3, :cond_a

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 14
    .line 15
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 16
    .line 17
    iget-wide v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 18
    .line 19
    or-long/2addr p2, v4

    .line 20
    :goto_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 21
    .line 22
    aget-byte v2, v1, v0

    .line 23
    .line 24
    const/16 v4, -0x5b

    .line 25
    .line 26
    if-ne v2, v4, :cond_0

    .line 27
    .line 28
    add-int/lit8 v0, v0, 0x1

    .line 29
    .line 30
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    const/16 v0, 0x49

    .line 34
    .line 35
    if-lt v2, v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰苏世哲楪()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰楪苏世哲()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    :goto_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏哲兰楪世()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_3

    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世兰苏子哲()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const-string v4, ".."

    .line 57
    .line 58
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_2

    .line 63
    .line 64
    invoke-interface {p1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {p0, p1, v2, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪世兰哲苏(Ljava/util/Map;Ljava/lang/Object;Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;)V

    .line 73
    .line 74
    .line 75
    const/4 v0, 0x0

    .line 76
    invoke-interface {p1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    iget v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 81
    .line 82
    aget-byte v4, v1, v4

    .line 83
    .line 84
    if-lt v4, v0, :cond_4

    .line 85
    .line 86
    const/16 v0, 0x7e

    .line 87
    .line 88
    if-gt v4, v0, :cond_4

    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    goto :goto_2

    .line 95
    :cond_4
    invoke-static {v4}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(I)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_5

    .line 100
    .line 101
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 102
    .line 103
    add-int/lit8 v0, v0, 0x1

    .line 104
    .line 105
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 106
    .line 107
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    goto :goto_2

    .line 112
    :cond_5
    const/16 v0, -0x4f

    .line 113
    .line 114
    if-ne v4, v0, :cond_6

    .line 115
    .line 116
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 117
    .line 118
    add-int/lit8 v0, v0, 0x1

    .line 119
    .line 120
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 121
    .line 122
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_6
    const/16 v0, -0x50

    .line 126
    .line 127
    if-ne v4, v0, :cond_7

    .line 128
    .line 129
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 130
    .line 131
    add-int/lit8 v0, v0, 0x1

    .line 132
    .line 133
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 134
    .line 135
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_7
    if-ne v4, v3, :cond_8

    .line 139
    .line 140
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世哲苏兰子()Ljava/util/Map;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    goto :goto_2

    .line 145
    :cond_8
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰楪苏世哲()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    :goto_2
    if-nez v0, :cond_9

    .line 150
    .line 151
    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreNullPropertyValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 152
    .line 153
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 154
    .line 155
    and-long/2addr v4, p2

    .line 156
    const-wide/16 v6, 0x0

    .line 157
    .line 158
    cmp-long v4, v4, v6

    .line 159
    .line 160
    if-eqz v4, :cond_9

    .line 161
    .line 162
    goto/16 :goto_0

    .line 163
    .line 164
    :cond_9
    invoke-interface {p1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    goto/16 :goto_0

    .line 168
    .line 169
    :cond_a
    iget-byte p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰楪苏:B

    .line 170
    .line 171
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲兰世子(B)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    const-string p1, "object not support input "

    .line 176
    .line 177
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    return-void
.end method

.method public final 飘花落叶言子兰楪哲世苏(Ljava/lang/reflect/Type;)Ljava/util/List;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子哲世兰苏楪()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 10
    .line 11
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 12
    .line 13
    aget-byte v0, v0, v2

    .line 14
    .line 15
    const/16 v2, -0x6e

    .line 16
    .line 17
    if-ne v0, v2, :cond_3

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰楪苏世哲()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    instance-of p1, p0, Ljava/util/List;

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    check-cast p0, Ljava/util/List;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_1
    instance-of p1, p0, Ljava/util/Collection;

    .line 31
    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    new-instance p1, Lcom/alibaba/fastjson2/JSONArray;

    .line 35
    .line 36
    check-cast p0, Ljava/util/Collection;

    .line 37
    .line 38
    invoke-direct {p1, p0}, Lcom/alibaba/fastjson2/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 39
    .line 40
    .line 41
    return-object p1

    .line 42
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v0, "not support class "

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0, p1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/Object;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v1

    .line 57
    :cond_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏世兰子哲()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    new-instance v1, Lcom/alibaba/fastjson2/JSONArray;

    .line 62
    .line 63
    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 64
    .line 65
    .line 66
    const/4 v2, 0x0

    .line 67
    :goto_0
    if-ge v2, v0, :cond_4

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子哲兰苏世楪(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    add-int/lit8 v2, v2, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_4
    return-object v1
.end method

.method public final 飘花落叶言子兰楪苏世哲()Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    const/4 v3, 0x1

    .line 9
    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    iget v5, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 14
    .line 15
    iget-object v6, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 16
    .line 17
    array-length v7, v6

    .line 18
    const-string v8, "/"

    .line 19
    .line 20
    if-ge v5, v7, :cond_3d

    .line 21
    .line 22
    add-int/lit8 v7, v5, 0x1

    .line 23
    .line 24
    iput v7, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 25
    .line 26
    aget-byte v9, v6, v5

    .line 27
    .line 28
    iput-byte v9, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰楪苏:B

    .line 29
    .line 30
    const/16 v10, 0x48

    .line 31
    .line 32
    iget v11, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏兰楪:I

    .line 33
    .line 34
    if-eq v9, v10, :cond_3c

    .line 35
    .line 36
    const-string v10, ", offset "

    .line 37
    .line 38
    const-string v12, "autoType not support : "

    .line 39
    .line 40
    const/4 v13, 0x0

    .line 41
    const-wide/16 v16, 0x0

    .line 42
    .line 43
    iget-object v14, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 44
    .line 45
    packed-switch v9, :pswitch_data_0

    .line 46
    .line 47
    .line 48
    const-string v15, ".."

    .line 49
    .line 50
    move/from16 v18, v3

    .line 51
    .line 52
    const/16 v3, 0x49

    .line 53
    .line 54
    packed-switch v9, :pswitch_data_1

    .line 55
    .line 56
    .line 57
    packed-switch v9, :pswitch_data_2

    .line 58
    .line 59
    .line 60
    invoke-static {v9}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(I)Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-eqz v4, :cond_0

    .line 65
    .line 66
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    return-object v0

    .line 71
    :cond_0
    invoke-static {v9}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(I)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eqz v4, :cond_1

    .line 76
    .line 77
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 78
    .line 79
    add-int/lit8 v2, v0, 0x1

    .line 80
    .line 81
    iput v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 82
    .line 83
    invoke-static {v0, v6, v9}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰子哲世(I[BI)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    return-object v0

    .line 92
    :cond_1
    invoke-static {v9}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(I)Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-eqz v4, :cond_2

    .line 97
    .line 98
    iget v4, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 99
    .line 100
    add-int/lit8 v5, v4, 0x1

    .line 101
    .line 102
    if-ge v5, v11, :cond_2

    .line 103
    .line 104
    invoke-static {v4, v6, v9}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰子世哲(I[BI)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    iget v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 109
    .line 110
    add-int/lit8 v2, v2, 0x2

    .line 111
    .line 112
    iput v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 113
    .line 114
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    return-object v0

    .line 119
    :cond_2
    invoke-static {v9}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(I)Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-eqz v4, :cond_3

    .line 124
    .line 125
    add-int/lit8 v9, v9, 0x28

    .line 126
    .line 127
    int-to-long v0, v9

    .line 128
    const-wide/16 v2, -0x8

    .line 129
    .line 130
    add-long/2addr v0, v2

    .line 131
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    return-object v0

    .line 136
    :cond_3
    invoke-static {v9}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(I)Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    if-eqz v4, :cond_4

    .line 141
    .line 142
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 143
    .line 144
    add-int/lit8 v2, v0, 0x1

    .line 145
    .line 146
    iput v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 147
    .line 148
    invoke-static {v0, v6, v9}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰世哲子(I[BI)I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    int-to-long v0, v0

    .line 153
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    return-object v0

    .line 158
    :cond_4
    invoke-static {v9}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲(I)Z

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    if-eqz v4, :cond_5

    .line 163
    .line 164
    iget v4, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 165
    .line 166
    add-int/lit8 v5, v4, 0x1

    .line 167
    .line 168
    if-ge v5, v11, :cond_5

    .line 169
    .line 170
    invoke-static {v4, v6, v9}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰世子哲(I[BI)I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    int-to-long v2, v0

    .line 175
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 176
    .line 177
    add-int/lit8 v0, v0, 0x2

    .line 178
    .line 179
    iput v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 180
    .line 181
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    return-object v0

    .line 186
    :cond_5
    const/16 v4, -0x6c

    .line 187
    .line 188
    if-lt v9, v4, :cond_d

    .line 189
    .line 190
    const/16 v5, -0x5c

    .line 191
    .line 192
    if-gt v9, v5, :cond_d

    .line 193
    .line 194
    if-ne v9, v5, :cond_6

    .line 195
    .line 196
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    goto :goto_0

    .line 201
    :cond_6
    add-int/lit8 v2, v9, 0x6c

    .line 202
    .line 203
    :goto_0
    if-nez v2, :cond_8

    .line 204
    .line 205
    iget-wide v0, v14, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 206
    .line 207
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseNativeObject:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 208
    .line 209
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 210
    .line 211
    and-long/2addr v0, v2

    .line 212
    cmp-long v0, v0, v16

    .line 213
    .line 214
    if-eqz v0, :cond_7

    .line 215
    .line 216
    new-instance v0, Ljava/util/ArrayList;

    .line 217
    .line 218
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 219
    .line 220
    .line 221
    return-object v0

    .line 222
    :cond_7
    new-instance v0, Lcom/alibaba/fastjson2/JSONArray;

    .line 223
    .line 224
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 225
    .line 226
    .line 227
    return-object v0

    .line 228
    :cond_8
    iget-wide v3, v14, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 229
    .line 230
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseNativeObject:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 231
    .line 232
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 233
    .line 234
    and-long/2addr v3, v5

    .line 235
    cmp-long v3, v3, v16

    .line 236
    .line 237
    if-eqz v3, :cond_9

    .line 238
    .line 239
    new-instance v3, Ljava/util/ArrayList;

    .line 240
    .line 241
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 242
    .line 243
    .line 244
    goto :goto_1

    .line 245
    :cond_9
    new-instance v3, Lcom/alibaba/fastjson2/JSONArray;

    .line 246
    .line 247
    invoke-direct {v3, v2}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 248
    .line 249
    .line 250
    :goto_1
    if-ge v0, v2, :cond_c

    .line 251
    .line 252
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏哲兰楪世()Z

    .line 253
    .line 254
    .line 255
    move-result v4

    .line 256
    if-eqz v4, :cond_b

    .line 257
    .line 258
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世兰苏子哲()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    invoke-virtual {v15, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v5

    .line 266
    if-eqz v5, :cond_a

    .line 267
    .line 268
    invoke-interface {v3, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    goto :goto_2

    .line 272
    :cond_a
    invoke-interface {v3, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    invoke-static {v4}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;

    .line 276
    .line 277
    .line 278
    move-result-object v4

    .line 279
    invoke-virtual {v1, v3, v0, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪世哲苏兰(Ljava/util/Collection;ILcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;)V

    .line 280
    .line 281
    .line 282
    goto :goto_2

    .line 283
    :cond_b
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰楪苏世哲()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v4

    .line 287
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 291
    .line 292
    goto :goto_1

    .line 293
    :cond_c
    return-object v3

    .line 294
    :cond_d
    if-lt v9, v3, :cond_18

    .line 295
    .line 296
    const/16 v4, 0x79

    .line 297
    .line 298
    if-gt v9, v4, :cond_18

    .line 299
    .line 300
    if-ne v9, v4, :cond_e

    .line 301
    .line 302
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    goto :goto_3

    .line 307
    :cond_e
    add-int/lit8 v3, v9, -0x49

    .line 308
    .line 309
    :goto_3
    iput v3, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 310
    .line 311
    if-ltz v3, :cond_17

    .line 312
    .line 313
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世苏哲:Ljava/util/function/BiFunction;

    .line 314
    .line 315
    if-eqz v4, :cond_11

    .line 316
    .line 317
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 318
    .line 319
    invoke-static {v0, v6, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰(I[BI)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    iget v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 324
    .line 325
    iget v3, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 326
    .line 327
    add-int/2addr v2, v3

    .line 328
    iput v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 329
    .line 330
    iget-wide v1, v14, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 331
    .line 332
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->TrimString:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 333
    .line 334
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 335
    .line 336
    and-long/2addr v1, v3

    .line 337
    cmp-long v1, v1, v16

    .line 338
    .line 339
    if-eqz v1, :cond_f

    .line 340
    .line 341
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    :cond_f
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 346
    .line 347
    .line 348
    move-result v1

    .line 349
    if-eqz v1, :cond_10

    .line 350
    .line 351
    iget-wide v1, v14, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 352
    .line 353
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->EmptyStringAsNull:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 354
    .line 355
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 356
    .line 357
    and-long/2addr v1, v3

    .line 358
    cmp-long v1, v1, v16

    .line 359
    .line 360
    if-eqz v1, :cond_10

    .line 361
    .line 362
    goto/16 :goto_8

    .line 363
    .line 364
    :cond_10
    return-object v0

    .line 365
    :cond_11
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世哲苏:Ljava/util/function/BiFunction;

    .line 366
    .line 367
    if-eqz v4, :cond_14

    .line 368
    .line 369
    new-array v5, v3, [B

    .line 370
    .line 371
    iget v7, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 372
    .line 373
    invoke-static {v6, v7, v5, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 374
    .line 375
    .line 376
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 377
    .line 378
    iget v3, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 379
    .line 380
    add-int/2addr v0, v3

    .line 381
    iput v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 382
    .line 383
    invoke-interface {v4, v5, v2}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    check-cast v0, Ljava/lang/String;

    .line 388
    .line 389
    iget-wide v1, v14, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 390
    .line 391
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->TrimString:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 392
    .line 393
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 394
    .line 395
    and-long/2addr v1, v3

    .line 396
    cmp-long v1, v1, v16

    .line 397
    .line 398
    if-eqz v1, :cond_12

    .line 399
    .line 400
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    :cond_12
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 405
    .line 406
    .line 407
    move-result v1

    .line 408
    if-eqz v1, :cond_13

    .line 409
    .line 410
    iget-wide v1, v14, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 411
    .line 412
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->EmptyStringAsNull:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 413
    .line 414
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 415
    .line 416
    and-long/2addr v1, v3

    .line 417
    cmp-long v1, v1, v16

    .line 418
    .line 419
    if-eqz v1, :cond_13

    .line 420
    .line 421
    goto/16 :goto_8

    .line 422
    .line 423
    :cond_13
    return-object v0

    .line 424
    :cond_14
    new-instance v0, Ljava/lang/String;

    .line 425
    .line 426
    iget v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 427
    .line 428
    sget-object v4, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 429
    .line 430
    invoke-direct {v0, v6, v2, v3, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 431
    .line 432
    .line 433
    iget v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 434
    .line 435
    iget v3, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 436
    .line 437
    add-int/2addr v2, v3

    .line 438
    iput v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 439
    .line 440
    iget-wide v1, v14, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 441
    .line 442
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->TrimString:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 443
    .line 444
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 445
    .line 446
    and-long/2addr v1, v3

    .line 447
    cmp-long v1, v1, v16

    .line 448
    .line 449
    if-eqz v1, :cond_15

    .line 450
    .line 451
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    :cond_15
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 456
    .line 457
    .line 458
    move-result v1

    .line 459
    if-eqz v1, :cond_16

    .line 460
    .line 461
    iget-wide v1, v14, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 462
    .line 463
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->EmptyStringAsNull:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 464
    .line 465
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 466
    .line 467
    and-long/2addr v1, v3

    .line 468
    cmp-long v1, v1, v16

    .line 469
    .line 470
    if-eqz v1, :cond_16

    .line 471
    .line 472
    goto/16 :goto_8

    .line 473
    .line 474
    :cond_16
    return-object v0

    .line 475
    :cond_17
    throw v13

    .line 476
    :cond_18
    const/16 v0, 0x7f

    .line 477
    .line 478
    if-ne v9, v0, :cond_1a

    .line 479
    .line 480
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 481
    .line 482
    .line 483
    move-result v0

    .line 484
    iput v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 485
    .line 486
    if-ltz v0, :cond_19

    .line 487
    .line 488
    const-string v0, "not support symbol : "

    .line 489
    .line 490
    iget v1, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 491
    .line 492
    invoke-static {v1, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世(ILjava/lang/String;)V

    .line 493
    .line 494
    .line 495
    return-object v13

    .line 496
    :cond_19
    throw v13

    .line 497
    :cond_1a
    invoke-virtual {v1, v9}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲兰世子(B)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    const-string v1, "not support type : "

    .line 502
    .line 503
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 508
    .line 509
    .line 510
    return-object v13

    .line 511
    :pswitch_0
    sget-object v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪兰哲世:Ljava/nio/charset/Charset;

    .line 512
    .line 513
    if-nez v0, :cond_1b

    .line 514
    .line 515
    const-string v0, "GB18030"

    .line 516
    .line 517
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    sput-object v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪兰哲世:Ljava/nio/charset/Charset;

    .line 522
    .line 523
    :cond_1b
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 524
    .line 525
    .line 526
    move-result v0

    .line 527
    new-instance v2, Ljava/lang/String;

    .line 528
    .line 529
    iget v3, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 530
    .line 531
    sget-object v4, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪兰哲世:Ljava/nio/charset/Charset;

    .line 532
    .line 533
    invoke-direct {v2, v6, v3, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 534
    .line 535
    .line 536
    iget v3, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 537
    .line 538
    add-int/2addr v3, v0

    .line 539
    iput v3, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 540
    .line 541
    return-object v2

    .line 542
    :pswitch_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 543
    .line 544
    .line 545
    move-result v3

    .line 546
    sget-object v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世哲苏:Ljava/util/function/BiFunction;

    .line 547
    .line 548
    if-eqz v5, :cond_1d

    .line 549
    .line 550
    sget-boolean v7, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰苏世:Z

    .line 551
    .line 552
    if-eqz v7, :cond_1d

    .line 553
    .line 554
    new-array v7, v3, [B

    .line 555
    .line 556
    iget v8, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 557
    .line 558
    invoke-static {v6, v8, v7, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 559
    .line 560
    .line 561
    if-nez v3, :cond_1c

    .line 562
    .line 563
    goto :goto_4

    .line 564
    :cond_1c
    move-object v2, v4

    .line 565
    :goto_4
    invoke-interface {v5, v7, v2}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    check-cast v0, Ljava/lang/String;

    .line 570
    .line 571
    goto :goto_5

    .line 572
    :cond_1d
    new-instance v0, Ljava/lang/String;

    .line 573
    .line 574
    iget v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 575
    .line 576
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_16BE:Ljava/nio/charset/Charset;

    .line 577
    .line 578
    invoke-direct {v0, v6, v2, v3, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 579
    .line 580
    .line 581
    :goto_5
    iget v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 582
    .line 583
    add-int/2addr v2, v3

    .line 584
    iput v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 585
    .line 586
    return-object v0

    .line 587
    :pswitch_2
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 588
    .line 589
    .line 590
    move-result v3

    .line 591
    sget-object v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世哲苏:Ljava/util/function/BiFunction;

    .line 592
    .line 593
    if-eqz v5, :cond_1f

    .line 594
    .line 595
    sget-boolean v7, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰苏世:Z

    .line 596
    .line 597
    if-nez v7, :cond_1f

    .line 598
    .line 599
    new-array v7, v3, [B

    .line 600
    .line 601
    iget v8, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 602
    .line 603
    invoke-static {v6, v8, v7, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 604
    .line 605
    .line 606
    if-nez v3, :cond_1e

    .line 607
    .line 608
    goto :goto_6

    .line 609
    :cond_1e
    move-object v2, v4

    .line 610
    :goto_6
    invoke-interface {v5, v7, v2}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v0

    .line 614
    check-cast v0, Ljava/lang/String;

    .line 615
    .line 616
    goto :goto_7

    .line 617
    :cond_1f
    new-instance v0, Ljava/lang/String;

    .line 618
    .line 619
    iget v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 620
    .line 621
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 622
    .line 623
    invoke-direct {v0, v6, v2, v3, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 624
    .line 625
    .line 626
    :goto_7
    iget v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 627
    .line 628
    add-int/2addr v2, v3

    .line 629
    iput v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 630
    .line 631
    return-object v0

    .line 632
    :pswitch_3
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 633
    .line 634
    .line 635
    move-result v0

    .line 636
    new-instance v2, Ljava/lang/String;

    .line 637
    .line 638
    iget v3, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 639
    .line 640
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_16:Ljava/nio/charset/Charset;

    .line 641
    .line 642
    invoke-direct {v2, v6, v3, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 643
    .line 644
    .line 645
    iget v3, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 646
    .line 647
    add-int/2addr v3, v0

    .line 648
    iput v3, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 649
    .line 650
    return-object v2

    .line 651
    :pswitch_4
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 652
    .line 653
    .line 654
    move-result v2

    .line 655
    sget-object v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世哲苏:Ljava/util/function/BiFunction;

    .line 656
    .line 657
    if-eqz v3, :cond_22

    .line 658
    .line 659
    sget-boolean v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰苏世:Z

    .line 660
    .line 661
    if-nez v5, :cond_22

    .line 662
    .line 663
    iget-object v5, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰苏楪哲:[B

    .line 664
    .line 665
    if-nez v5, :cond_20

    .line 666
    .line 667
    sget-object v5, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世哲苏:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 668
    .line 669
    iget-object v7, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰苏哲楪:Lcom/alibaba/fastjson2/飘花落叶言子楪世兰哲苏;

    .line 670
    .line 671
    invoke-virtual {v5, v7, v13}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v5

    .line 675
    check-cast v5, [B

    .line 676
    .line 677
    iput-object v5, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰苏楪哲:[B

    .line 678
    .line 679
    if-nez v5, :cond_20

    .line 680
    .line 681
    const/16 v5, 0x2000

    .line 682
    .line 683
    new-array v5, v5, [B

    .line 684
    .line 685
    iput-object v5, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰苏楪哲:[B

    .line 686
    .line 687
    :cond_20
    shl-int/lit8 v5, v2, 0x1

    .line 688
    .line 689
    iget-object v7, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰苏楪哲:[B

    .line 690
    .line 691
    array-length v7, v7

    .line 692
    if-le v5, v7, :cond_21

    .line 693
    .line 694
    new-array v5, v5, [B

    .line 695
    .line 696
    iput-object v5, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰苏楪哲:[B

    .line 697
    .line 698
    :cond_21
    iget v5, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 699
    .line 700
    iget-object v7, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰苏楪哲:[B

    .line 701
    .line 702
    invoke-static {v5, v2, v6, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲(II[B[B)I

    .line 703
    .line 704
    .line 705
    move-result v5

    .line 706
    const/4 v7, -0x1

    .line 707
    if-eq v5, v7, :cond_22

    .line 708
    .line 709
    new-array v6, v5, [B

    .line 710
    .line 711
    iget-object v7, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰苏楪哲:[B

    .line 712
    .line 713
    invoke-static {v7, v0, v6, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 714
    .line 715
    .line 716
    invoke-interface {v3, v6, v4}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    check-cast v0, Ljava/lang/String;

    .line 721
    .line 722
    iget v3, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 723
    .line 724
    add-int/2addr v3, v2

    .line 725
    iput v3, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 726
    .line 727
    return-object v0

    .line 728
    :cond_22
    new-instance v0, Ljava/lang/String;

    .line 729
    .line 730
    iget v3, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 731
    .line 732
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 733
    .line 734
    invoke-direct {v0, v6, v3, v2, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 735
    .line 736
    .line 737
    iget v3, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 738
    .line 739
    add-int/2addr v3, v2

    .line 740
    iput v3, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 741
    .line 742
    return-object v0

    .line 743
    :pswitch_5
    invoke-static {v7, v11}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 744
    .line 745
    .line 746
    invoke-static {v6, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 747
    .line 748
    .line 749
    move-result v0

    .line 750
    iget v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 751
    .line 752
    add-int/lit8 v2, v2, 0x4

    .line 753
    .line 754
    iput v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 755
    .line 756
    int-to-long v0, v0

    .line 757
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 758
    .line 759
    .line 760
    move-result-object v0

    .line 761
    return-object v0

    .line 762
    :pswitch_6
    invoke-static {v7, v11}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲兰子世(II)V

    .line 763
    .line 764
    .line 765
    invoke-static {v6, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲([BI)J

    .line 766
    .line 767
    .line 768
    move-result-wide v2

    .line 769
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 770
    .line 771
    add-int/lit8 v0, v0, 0x8

    .line 772
    .line 773
    iput v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 774
    .line 775
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 776
    .line 777
    .line 778
    move-result-object v0

    .line 779
    return-object v0

    .line 780
    :pswitch_7
    add-int/lit8 v5, v5, 0x2

    .line 781
    .line 782
    iput v5, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 783
    .line 784
    aget-byte v0, v6, v7

    .line 785
    .line 786
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 787
    .line 788
    .line 789
    move-result-object v0

    .line 790
    return-object v0

    .line 791
    :pswitch_8
    add-int/lit8 v0, v5, 0x2

    .line 792
    .line 793
    iput v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 794
    .line 795
    aget-byte v2, v6, v7

    .line 796
    .line 797
    shl-int/lit8 v2, v2, 0x8

    .line 798
    .line 799
    add-int/lit8 v5, v5, 0x3

    .line 800
    .line 801
    iput v5, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 802
    .line 803
    aget-byte v0, v6, v0

    .line 804
    .line 805
    and-int/lit16 v0, v0, 0xff

    .line 806
    .line 807
    add-int/2addr v2, v0

    .line 808
    int-to-short v0, v2

    .line 809
    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 810
    .line 811
    .line 812
    move-result-object v0

    .line 813
    return-object v0

    .line 814
    :pswitch_9
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 815
    .line 816
    .line 817
    move-result v2

    .line 818
    new-array v3, v2, [B

    .line 819
    .line 820
    iget v4, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 821
    .line 822
    invoke-static {v6, v4, v3, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 823
    .line 824
    .line 825
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 826
    .line 827
    add-int/2addr v0, v2

    .line 828
    iput v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 829
    .line 830
    new-instance v0, Ljava/math/BigInteger;

    .line 831
    .line 832
    invoke-direct {v0, v3}, Ljava/math/BigInteger;-><init>([B)V

    .line 833
    .line 834
    .line 835
    return-object v0

    .line 836
    :pswitch_a
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世兰苏哲()J

    .line 837
    .line 838
    .line 839
    move-result-wide v0

    .line 840
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 841
    .line 842
    .line 843
    move-result-object v0

    .line 844
    return-object v0

    .line 845
    :pswitch_b
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 846
    .line 847
    .line 848
    move-result v0

    .line 849
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰世楪哲苏()Ljava/math/BigInteger;

    .line 850
    .line 851
    .line 852
    move-result-object v1

    .line 853
    if-nez v0, :cond_23

    .line 854
    .line 855
    new-instance v0, Ljava/math/BigDecimal;

    .line 856
    .line 857
    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 858
    .line 859
    .line 860
    return-object v0

    .line 861
    :cond_23
    new-instance v2, Ljava/math/BigDecimal;

    .line 862
    .line 863
    invoke-direct {v2, v1, v0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 864
    .line 865
    .line 866
    return-object v2

    .line 867
    :pswitch_c
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世兰苏哲()J

    .line 868
    .line 869
    .line 870
    move-result-wide v0

    .line 871
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 872
    .line 873
    .line 874
    move-result-object v0

    .line 875
    return-object v0

    .line 876
    :pswitch_d
    invoke-static {v7, v11}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 877
    .line 878
    .line 879
    invoke-static {v6, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 880
    .line 881
    .line 882
    move-result v0

    .line 883
    iget v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 884
    .line 885
    add-int/lit8 v2, v2, 0x4

    .line 886
    .line 887
    iput v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 888
    .line 889
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 890
    .line 891
    .line 892
    move-result v0

    .line 893
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 894
    .line 895
    .line 896
    move-result-object v0

    .line 897
    return-object v0

    .line 898
    :pswitch_e
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 899
    .line 900
    .line 901
    move-result v0

    .line 902
    int-to-float v0, v0

    .line 903
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 904
    .line 905
    .line 906
    move-result-object v0

    .line 907
    return-object v0

    .line 908
    :pswitch_f
    invoke-static {v7, v11}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲兰子世(II)V

    .line 909
    .line 910
    .line 911
    invoke-static {v6, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲([BI)J

    .line 912
    .line 913
    .line 914
    move-result-wide v2

    .line 915
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 916
    .line 917
    add-int/lit8 v0, v0, 0x8

    .line 918
    .line 919
    iput v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 920
    .line 921
    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 922
    .line 923
    .line 924
    move-result-wide v0

    .line 925
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 926
    .line 927
    .line 928
    move-result-object v0

    .line 929
    return-object v0

    .line 930
    :pswitch_10
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世兰苏哲()J

    .line 931
    .line 932
    .line 933
    move-result-wide v0

    .line 934
    long-to-double v0, v0

    .line 935
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 936
    .line 937
    .line 938
    move-result-object v0

    .line 939
    return-object v0

    .line 940
    :pswitch_11
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 941
    .line 942
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 943
    .line 944
    .line 945
    move-result-object v0

    .line 946
    return-object v0

    .line 947
    :pswitch_12
    const-wide/16 v0, 0x0

    .line 948
    .line 949
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 950
    .line 951
    .line 952
    move-result-object v0

    .line 953
    return-object v0

    .line 954
    :pswitch_13
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 955
    .line 956
    return-object v0

    .line 957
    :pswitch_14
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 958
    .line 959
    return-object v0

    .line 960
    :goto_8
    :pswitch_15
    return-object v13

    .line 961
    :pswitch_16
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世兰苏哲()J

    .line 962
    .line 963
    .line 964
    move-result-wide v2

    .line 965
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 966
    .line 967
    .line 968
    move-result v0

    .line 969
    int-to-long v0, v0

    .line 970
    invoke-static {v2, v3, v0, v1}, Ljava/time/Instant;->ofEpochSecond(JJ)Ljava/time/Instant;

    .line 971
    .line 972
    .line 973
    move-result-object v0

    .line 974
    return-object v0

    .line 975
    :pswitch_17
    invoke-static {v7, v11}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 976
    .line 977
    .line 978
    invoke-static {v6, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 979
    .line 980
    .line 981
    move-result v0

    .line 982
    int-to-long v2, v0

    .line 983
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 984
    .line 985
    add-int/lit8 v0, v0, 0x4

    .line 986
    .line 987
    iput v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 988
    .line 989
    new-instance v0, Ljava/util/Date;

    .line 990
    .line 991
    const-wide/32 v4, 0xea60

    .line 992
    .line 993
    .line 994
    mul-long/2addr v2, v4

    .line 995
    invoke-direct {v0, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 996
    .line 997
    .line 998
    return-object v0

    .line 999
    :pswitch_18
    invoke-static {v7, v11}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 1000
    .line 1001
    .line 1002
    invoke-static {v6, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 1003
    .line 1004
    .line 1005
    move-result v0

    .line 1006
    int-to-long v2, v0

    .line 1007
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1008
    .line 1009
    add-int/lit8 v0, v0, 0x4

    .line 1010
    .line 1011
    iput v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1012
    .line 1013
    new-instance v0, Ljava/util/Date;

    .line 1014
    .line 1015
    const-wide/16 v4, 0x3e8

    .line 1016
    .line 1017
    mul-long/2addr v2, v4

    .line 1018
    invoke-direct {v0, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 1019
    .line 1020
    .line 1021
    return-object v0

    .line 1022
    :pswitch_19
    invoke-static {v7, v11}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲兰子世(II)V

    .line 1023
    .line 1024
    .line 1025
    invoke-static {v6, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲([BI)J

    .line 1026
    .line 1027
    .line 1028
    move-result-wide v2

    .line 1029
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1030
    .line 1031
    add-int/lit8 v0, v0, 0x8

    .line 1032
    .line 1033
    iput v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1034
    .line 1035
    new-instance v0, Ljava/util/Date;

    .line 1036
    .line 1037
    invoke-direct {v0, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 1038
    .line 1039
    .line 1040
    return-object v0

    .line 1041
    :pswitch_1a
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲世子兰苏()Ljava/time/ZonedDateTime;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v0

    .line 1045
    return-object v0

    .line 1046
    :pswitch_1b
    add-int/lit8 v0, v5, 0x2

    .line 1047
    .line 1048
    iput v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1049
    .line 1050
    aget-byte v2, v6, v7

    .line 1051
    .line 1052
    shl-int/lit8 v2, v2, 0x8

    .line 1053
    .line 1054
    add-int/lit8 v3, v5, 0x3

    .line 1055
    .line 1056
    iput v3, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1057
    .line 1058
    aget-byte v0, v6, v0

    .line 1059
    .line 1060
    and-int/lit16 v0, v0, 0xff

    .line 1061
    .line 1062
    add-int/2addr v2, v0

    .line 1063
    add-int/lit8 v0, v5, 0x4

    .line 1064
    .line 1065
    iput v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1066
    .line 1067
    aget-byte v3, v6, v3

    .line 1068
    .line 1069
    add-int/lit8 v5, v5, 0x5

    .line 1070
    .line 1071
    iput v5, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1072
    .line 1073
    aget-byte v0, v6, v0

    .line 1074
    .line 1075
    invoke-static {v2, v3, v0}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v0

    .line 1079
    return-object v0

    .line 1080
    :pswitch_1c
    add-int/lit8 v0, v5, 0x2

    .line 1081
    .line 1082
    iput v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1083
    .line 1084
    aget-byte v2, v6, v7

    .line 1085
    .line 1086
    shl-int/lit8 v2, v2, 0x8

    .line 1087
    .line 1088
    add-int/lit8 v3, v5, 0x3

    .line 1089
    .line 1090
    iput v3, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1091
    .line 1092
    aget-byte v0, v6, v0

    .line 1093
    .line 1094
    and-int/lit16 v0, v0, 0xff

    .line 1095
    .line 1096
    add-int v7, v2, v0

    .line 1097
    .line 1098
    add-int/lit8 v0, v5, 0x4

    .line 1099
    .line 1100
    iput v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1101
    .line 1102
    aget-byte v8, v6, v3

    .line 1103
    .line 1104
    add-int/lit8 v2, v5, 0x5

    .line 1105
    .line 1106
    iput v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1107
    .line 1108
    aget-byte v9, v6, v0

    .line 1109
    .line 1110
    add-int/lit8 v0, v5, 0x6

    .line 1111
    .line 1112
    iput v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1113
    .line 1114
    aget-byte v10, v6, v2

    .line 1115
    .line 1116
    add-int/lit8 v2, v5, 0x7

    .line 1117
    .line 1118
    iput v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1119
    .line 1120
    aget-byte v11, v6, v0

    .line 1121
    .line 1122
    add-int/lit8 v5, v5, 0x8

    .line 1123
    .line 1124
    iput v5, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1125
    .line 1126
    aget-byte v12, v6, v2

    .line 1127
    .line 1128
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 1129
    .line 1130
    .line 1131
    move-result v13

    .line 1132
    invoke-static/range {v7 .. v13}, Ljava/time/LocalDateTime;->of(IIIIIII)Ljava/time/LocalDateTime;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v0

    .line 1136
    return-object v0

    .line 1137
    :pswitch_1d
    add-int/lit8 v0, v5, 0x2

    .line 1138
    .line 1139
    iput v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1140
    .line 1141
    aget-byte v2, v6, v7

    .line 1142
    .line 1143
    add-int/lit8 v3, v5, 0x3

    .line 1144
    .line 1145
    iput v3, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1146
    .line 1147
    aget-byte v0, v6, v0

    .line 1148
    .line 1149
    add-int/lit8 v5, v5, 0x4

    .line 1150
    .line 1151
    iput v5, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1152
    .line 1153
    aget-byte v3, v6, v3

    .line 1154
    .line 1155
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 1156
    .line 1157
    .line 1158
    move-result v1

    .line 1159
    invoke-static {v2, v0, v3, v1}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v0

    .line 1163
    return-object v0

    .line 1164
    :pswitch_1e
    iget-wide v4, v14, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 1165
    .line 1166
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 1167
    .line 1168
    move-wide/from16 v19, v4

    .line 1169
    .line 1170
    iget-wide v3, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 1171
    .line 1172
    and-long v2, v19, v3

    .line 1173
    .line 1174
    cmp-long v2, v2, v16

    .line 1175
    .line 1176
    if-eqz v2, :cond_24

    .line 1177
    .line 1178
    move/from16 v2, v18

    .line 1179
    .line 1180
    goto :goto_9

    .line 1181
    :cond_24
    move v2, v0

    .line 1182
    :goto_9
    move-object v3, v13

    .line 1183
    :goto_a
    iget v4, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1184
    .line 1185
    aget-byte v5, v6, v4

    .line 1186
    .line 1187
    const/16 v7, -0x5b

    .line 1188
    .line 1189
    if-ne v5, v7, :cond_27

    .line 1190
    .line 1191
    add-int/lit8 v4, v4, 0x1

    .line 1192
    .line 1193
    iput v4, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1194
    .line 1195
    if-nez v3, :cond_26

    .line 1196
    .line 1197
    iget-wide v0, v14, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 1198
    .line 1199
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseNativeObject:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 1200
    .line 1201
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 1202
    .line 1203
    and-long/2addr v0, v2

    .line 1204
    cmp-long v0, v0, v16

    .line 1205
    .line 1206
    if-eqz v0, :cond_25

    .line 1207
    .line 1208
    new-instance v0, Ljava/util/HashMap;

    .line 1209
    .line 1210
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1211
    .line 1212
    .line 1213
    return-object v0

    .line 1214
    :cond_25
    new-instance v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 1215
    .line 1216
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 1217
    .line 1218
    .line 1219
    return-object v0

    .line 1220
    :cond_26
    return-object v3

    .line 1221
    :cond_27
    if-eqz v2, :cond_2b

    .line 1222
    .line 1223
    if-nez v0, :cond_2b

    .line 1224
    .line 1225
    const/16 v9, 0x49

    .line 1226
    .line 1227
    if-lt v5, v9, :cond_2b

    .line 1228
    .line 1229
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰苏哲楪世()J

    .line 1230
    .line 1231
    .line 1232
    move-result-wide v4

    .line 1233
    sget-wide v19, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世苏哲兰:J

    .line 1234
    .line 1235
    cmp-long v4, v4, v19

    .line 1236
    .line 1237
    if-nez v4, :cond_2a

    .line 1238
    .line 1239
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏子哲兰世()J

    .line 1240
    .line 1241
    .line 1242
    move-result-wide v2

    .line 1243
    iget-object v0, v14, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 1244
    .line 1245
    check-cast v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 1246
    .line 1247
    invoke-virtual {v0, v2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏世哲兰(J)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v0

    .line 1251
    if-nez v0, :cond_28

    .line 1252
    .line 1253
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏()Ljava/lang/String;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v0

    .line 1257
    invoke-virtual {v14, v13, v0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v2

    .line 1261
    if-eqz v2, :cond_29

    .line 1262
    .line 1263
    move-object v0, v2

    .line 1264
    :cond_28
    move/from16 v2, v18

    .line 1265
    .line 1266
    goto :goto_b

    .line 1267
    :cond_29
    new-instance v2, Lcom/alibaba/fastjson2/JSONException;

    .line 1268
    .line 1269
    invoke-static {v12, v0, v10}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v0

    .line 1273
    iget v1, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1274
    .line 1275
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1276
    .line 1277
    .line 1278
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1279
    .line 1280
    .line 1281
    array-length v1, v6

    .line 1282
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1283
    .line 1284
    .line 1285
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v0

    .line 1289
    invoke-direct {v2, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 1290
    .line 1291
    .line 1292
    throw v2

    .line 1293
    :goto_b
    iput-boolean v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲楪苏兰:Z

    .line 1294
    .line 1295
    const/4 v3, 0x0

    .line 1296
    const-wide/16 v4, 0x0

    .line 1297
    .line 1298
    const/4 v2, 0x0

    .line 1299
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v0

    .line 1303
    return-object v0

    .line 1304
    :cond_2a
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏()Ljava/lang/String;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v4

    .line 1308
    goto :goto_c

    .line 1309
    :cond_2b
    const/16 v9, 0x49

    .line 1310
    .line 1311
    if-lt v5, v9, :cond_2c

    .line 1312
    .line 1313
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰苏世哲楪()Ljava/lang/String;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v4

    .line 1317
    goto :goto_c

    .line 1318
    :cond_2c
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰楪苏世哲()Ljava/lang/Object;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v4

    .line 1322
    :goto_c
    if-nez v3, :cond_2e

    .line 1323
    .line 1324
    move-object v5, v10

    .line 1325
    iget-wide v9, v14, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 1326
    .line 1327
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseNativeObject:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 1328
    .line 1329
    move-object/from16 v19, v8

    .line 1330
    .line 1331
    iget-wide v7, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 1332
    .line 1333
    and-long/2addr v7, v9

    .line 1334
    cmp-long v3, v7, v16

    .line 1335
    .line 1336
    if-eqz v3, :cond_2d

    .line 1337
    .line 1338
    new-instance v3, Ljava/util/HashMap;

    .line 1339
    .line 1340
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 1341
    .line 1342
    .line 1343
    goto :goto_d

    .line 1344
    :cond_2d
    new-instance v3, Lcom/alibaba/fastjson2/JSONObject;

    .line 1345
    .line 1346
    invoke-direct {v3}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 1347
    .line 1348
    .line 1349
    goto :goto_d

    .line 1350
    :cond_2e
    move-object/from16 v19, v8

    .line 1351
    .line 1352
    move-object v5, v10

    .line 1353
    :goto_d
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏哲兰楪世()Z

    .line 1354
    .line 1355
    .line 1356
    move-result v7

    .line 1357
    if-eqz v7, :cond_30

    .line 1358
    .line 1359
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世兰苏子哲()Ljava/lang/String;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v7

    .line 1363
    invoke-virtual {v15, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1364
    .line 1365
    .line 1366
    move-result v8

    .line 1367
    if-eqz v8, :cond_2f

    .line 1368
    .line 1369
    invoke-interface {v3, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1370
    .line 1371
    .line 1372
    :goto_e
    const/16 v18, 0x1

    .line 1373
    .line 1374
    goto/16 :goto_10

    .line 1375
    .line 1376
    :cond_2f
    invoke-static {v7}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v7

    .line 1380
    invoke-virtual {v1, v3, v4, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪世兰哲苏(Ljava/util/Map;Ljava/lang/Object;Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;)V

    .line 1381
    .line 1382
    .line 1383
    invoke-interface {v3, v4, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1384
    .line 1385
    .line 1386
    goto :goto_e

    .line 1387
    :cond_30
    iget v7, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1388
    .line 1389
    aget-byte v7, v6, v7

    .line 1390
    .line 1391
    const/16 v9, 0x49

    .line 1392
    .line 1393
    if-lt v7, v9, :cond_31

    .line 1394
    .line 1395
    const/16 v8, 0x7e

    .line 1396
    .line 1397
    if-gt v7, v8, :cond_31

    .line 1398
    .line 1399
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v7

    .line 1403
    const/16 v18, 0x1

    .line 1404
    .line 1405
    goto :goto_f

    .line 1406
    :cond_31
    invoke-static {v7}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(I)Z

    .line 1407
    .line 1408
    .line 1409
    move-result v8

    .line 1410
    if-eqz v8, :cond_32

    .line 1411
    .line 1412
    iget v8, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1413
    .line 1414
    const/16 v18, 0x1

    .line 1415
    .line 1416
    add-int/lit8 v8, v8, 0x1

    .line 1417
    .line 1418
    iput v8, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1419
    .line 1420
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v7

    .line 1424
    goto :goto_f

    .line 1425
    :cond_32
    const/16 v18, 0x1

    .line 1426
    .line 1427
    const/16 v8, -0x4f

    .line 1428
    .line 1429
    if-ne v7, v8, :cond_33

    .line 1430
    .line 1431
    iget v7, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1432
    .line 1433
    add-int/lit8 v7, v7, 0x1

    .line 1434
    .line 1435
    iput v7, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1436
    .line 1437
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1438
    .line 1439
    goto :goto_f

    .line 1440
    :cond_33
    const/16 v8, -0x50

    .line 1441
    .line 1442
    if-ne v7, v8, :cond_34

    .line 1443
    .line 1444
    iget v7, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1445
    .line 1446
    add-int/lit8 v7, v7, 0x1

    .line 1447
    .line 1448
    iput v7, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1449
    .line 1450
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1451
    .line 1452
    goto :goto_f

    .line 1453
    :cond_34
    const/16 v8, -0x5a

    .line 1454
    .line 1455
    if-ne v7, v8, :cond_35

    .line 1456
    .line 1457
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世哲苏兰子()Ljava/util/Map;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v7

    .line 1461
    goto :goto_f

    .line 1462
    :cond_35
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰楪苏世哲()Ljava/lang/Object;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v7

    .line 1466
    :goto_f
    if-nez v7, :cond_36

    .line 1467
    .line 1468
    iget-wide v10, v14, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 1469
    .line 1470
    sget-object v8, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreNullPropertyValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 1471
    .line 1472
    move-wide/from16 v21, v10

    .line 1473
    .line 1474
    iget-wide v9, v8, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 1475
    .line 1476
    and-long v8, v21, v9

    .line 1477
    .line 1478
    cmp-long v8, v8, v16

    .line 1479
    .line 1480
    if-eqz v8, :cond_36

    .line 1481
    .line 1482
    goto :goto_10

    .line 1483
    :cond_36
    invoke-interface {v3, v4, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1484
    .line 1485
    .line 1486
    :goto_10
    add-int/lit8 v0, v0, 0x1

    .line 1487
    .line 1488
    move-object v10, v5

    .line 1489
    move-object/from16 v8, v19

    .line 1490
    .line 1491
    goto/16 :goto_a

    .line 1492
    .line 1493
    :pswitch_1f
    move-object/from16 v19, v8

    .line 1494
    .line 1495
    move-object v5, v10

    .line 1496
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏子世兰哲()J

    .line 1497
    .line 1498
    .line 1499
    move-result-wide v2

    .line 1500
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1501
    .line 1502
    .line 1503
    iget-wide v7, v14, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 1504
    .line 1505
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 1506
    .line 1507
    iget-wide v9, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 1508
    .line 1509
    and-long/2addr v7, v9

    .line 1510
    cmp-long v0, v7, v16

    .line 1511
    .line 1512
    if-eqz v0, :cond_39

    .line 1513
    .line 1514
    iget-object v0, v14, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 1515
    .line 1516
    check-cast v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 1517
    .line 1518
    invoke-virtual {v0, v2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏世哲兰(J)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v0

    .line 1522
    if-nez v0, :cond_38

    .line 1523
    .line 1524
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏()Ljava/lang/String;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v0

    .line 1528
    invoke-virtual {v14, v13, v0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v2

    .line 1532
    if-eqz v2, :cond_37

    .line 1533
    .line 1534
    move-object v0, v2

    .line 1535
    goto :goto_11

    .line 1536
    :cond_37
    new-instance v2, Lcom/alibaba/fastjson2/JSONException;

    .line 1537
    .line 1538
    invoke-static {v12, v0, v5}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v0

    .line 1542
    iget v1, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1543
    .line 1544
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1545
    .line 1546
    .line 1547
    move-object/from16 v1, v19

    .line 1548
    .line 1549
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1550
    .line 1551
    .line 1552
    array-length v1, v6

    .line 1553
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1554
    .line 1555
    .line 1556
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1557
    .line 1558
    .line 1559
    move-result-object v0

    .line 1560
    invoke-direct {v2, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 1561
    .line 1562
    .line 1563
    throw v2

    .line 1564
    :cond_38
    :goto_11
    const/4 v3, 0x0

    .line 1565
    const-wide/16 v4, 0x0

    .line 1566
    .line 1567
    const/4 v2, 0x0

    .line 1568
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1569
    .line 1570
    .line 1571
    move-result-object v0

    .line 1572
    return-object v0

    .line 1573
    :cond_39
    move-object v0, v1

    .line 1574
    move-object/from16 v1, v19

    .line 1575
    .line 1576
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏哲世兰楪()Z

    .line 1577
    .line 1578
    .line 1579
    move-result v2

    .line 1580
    if-eqz v2, :cond_3a

    .line 1581
    .line 1582
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世哲苏兰子()Ljava/util/Map;

    .line 1583
    .line 1584
    .line 1585
    move-result-object v0

    .line 1586
    return-object v0

    .line 1587
    :cond_3a
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏世楪兰哲()Z

    .line 1588
    .line 1589
    .line 1590
    move-result v2

    .line 1591
    if-eqz v2, :cond_3b

    .line 1592
    .line 1593
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰楪苏哲世()Ljava/util/List;

    .line 1594
    .line 1595
    .line 1596
    move-result-object v0

    .line 1597
    return-object v0

    .line 1598
    :cond_3b
    new-instance v2, Lcom/alibaba/fastjson2/JSONException;

    .line 1599
    .line 1600
    iget v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1601
    .line 1602
    array-length v3, v6

    .line 1603
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1604
    .line 1605
    const-string v5, "autoType not support , offset "

    .line 1606
    .line 1607
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1608
    .line 1609
    .line 1610
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1611
    .line 1612
    .line 1613
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1614
    .line 1615
    .line 1616
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1617
    .line 1618
    .line 1619
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1620
    .line 1621
    .line 1622
    move-result-object v0

    .line 1623
    invoke-direct {v2, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 1624
    .line 1625
    .line 1626
    throw v2

    .line 1627
    :pswitch_20
    move-object v0, v1

    .line 1628
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 1629
    .line 1630
    .line 1631
    move-result v1

    .line 1632
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1633
    .line 1634
    add-int v3, v2, v1

    .line 1635
    .line 1636
    invoke-static {v6, v2, v3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 1637
    .line 1638
    .line 1639
    move-result-object v2

    .line 1640
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1641
    .line 1642
    add-int/2addr v3, v1

    .line 1643
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1644
    .line 1645
    return-object v2

    .line 1646
    :pswitch_21
    move-object v0, v1

    .line 1647
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 1648
    .line 1649
    .line 1650
    move-result v0

    .line 1651
    int-to-char v0, v0

    .line 1652
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v0

    .line 1656
    return-object v0

    .line 1657
    :cond_3c
    move-object v0, v1

    .line 1658
    invoke-static {v7, v11}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 1659
    .line 1660
    .line 1661
    invoke-static {v6, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 1662
    .line 1663
    .line 1664
    move-result v1

    .line 1665
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1666
    .line 1667
    add-int/lit8 v2, v2, 0x4

    .line 1668
    .line 1669
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1670
    .line 1671
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1672
    .line 1673
    .line 1674
    move-result-object v0

    .line 1675
    return-object v0

    .line 1676
    :cond_3d
    move-object v0, v1

    .line 1677
    move-object v1, v8

    .line 1678
    new-instance v2, Lcom/alibaba/fastjson2/JSONException;

    .line 1679
    .line 1680
    iget v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1681
    .line 1682
    array-length v3, v6

    .line 1683
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1684
    .line 1685
    const-string v5, "readAny overflow : "

    .line 1686
    .line 1687
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1688
    .line 1689
    .line 1690
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1691
    .line 1692
    .line 1693
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1694
    .line 1695
    .line 1696
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1697
    .line 1698
    .line 1699
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1700
    .line 1701
    .line 1702
    move-result-object v0

    .line 1703
    invoke-direct {v2, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 1704
    .line 1705
    .line 1706
    throw v2

    .line 1707
    :pswitch_data_0
    .packed-switch -0x70
        :pswitch_21
        :pswitch_20
        :pswitch_1f
    .end packed-switch

    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    :pswitch_data_1
    .packed-switch -0x5a
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch

    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    :pswitch_data_2
    .packed-switch 0x7a
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子兰楪苏哲世()Ljava/util/List;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏世兰子哲()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    new-instance v2, Lcom/alibaba/fastjson2/JSONArray;

    .line 8
    .line 9
    invoke-direct {v2, v1}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    move v4, v3

    .line 14
    :goto_0
    if-ge v4, v1, :cond_15

    .line 15
    .line 16
    iget v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 17
    .line 18
    iget-object v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 19
    .line 20
    aget-byte v5, v6, v5

    .line 21
    .line 22
    const/16 v7, 0x7e

    .line 23
    .line 24
    const/16 v8, 0x49

    .line 25
    .line 26
    if-lt v5, v8, :cond_0

    .line 27
    .line 28
    if-gt v5, v7, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    goto/16 :goto_6

    .line 35
    .line 36
    :cond_0
    invoke-static {v5}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(I)Z

    .line 37
    .line 38
    .line 39
    move-result v9

    .line 40
    if-eqz v9, :cond_1

    .line 41
    .line 42
    iget v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 43
    .line 44
    add-int/lit8 v6, v6, 0x1

    .line 45
    .line 46
    iput v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 47
    .line 48
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    goto/16 :goto_6

    .line 53
    .line 54
    :cond_1
    const/16 v9, -0x4f

    .line 55
    .line 56
    if-ne v5, v9, :cond_2

    .line 57
    .line 58
    iget v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 59
    .line 60
    add-int/lit8 v5, v5, 0x1

    .line 61
    .line 62
    iput v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 63
    .line 64
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 65
    .line 66
    goto/16 :goto_6

    .line 67
    .line 68
    :cond_2
    const/16 v9, -0x50

    .line 69
    .line 70
    if-ne v5, v9, :cond_3

    .line 71
    .line 72
    iget v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 73
    .line 74
    add-int/lit8 v5, v5, 0x1

    .line 75
    .line 76
    iput v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 77
    .line 78
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 79
    .line 80
    goto/16 :goto_6

    .line 81
    .line 82
    :cond_3
    const/16 v9, -0x5a

    .line 83
    .line 84
    if-ne v5, v9, :cond_4

    .line 85
    .line 86
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世哲苏兰子()Ljava/util/Map;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    goto/16 :goto_6

    .line 91
    .line 92
    :cond_4
    const/16 v10, -0x42

    .line 93
    .line 94
    iget v11, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏兰楪:I

    .line 95
    .line 96
    if-ne v5, v10, :cond_5

    .line 97
    .line 98
    iget v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 99
    .line 100
    add-int/lit8 v5, v5, 0x1

    .line 101
    .line 102
    iput v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 103
    .line 104
    invoke-static {v5, v11}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲兰子世(II)V

    .line 105
    .line 106
    .line 107
    invoke-static {v6, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲([BI)J

    .line 108
    .line 109
    .line 110
    move-result-wide v5

    .line 111
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    iget v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 116
    .line 117
    add-int/lit8 v6, v6, 0x8

    .line 118
    .line 119
    iput v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 120
    .line 121
    goto/16 :goto_6

    .line 122
    .line 123
    :cond_5
    const-string v10, ".."

    .line 124
    .line 125
    const/16 v12, -0x6c

    .line 126
    .line 127
    if-lt v5, v12, :cond_f

    .line 128
    .line 129
    const/16 v12, -0x5c

    .line 130
    .line 131
    if-gt v5, v12, :cond_f

    .line 132
    .line 133
    iget v11, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 134
    .line 135
    add-int/lit8 v11, v11, 0x1

    .line 136
    .line 137
    iput v11, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 138
    .line 139
    if-ne v5, v12, :cond_6

    .line 140
    .line 141
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    goto :goto_1

    .line 146
    :cond_6
    add-int/lit8 v5, v5, 0x6c

    .line 147
    .line 148
    :goto_1
    const-wide/16 v11, 0x0

    .line 149
    .line 150
    iget-object v13, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 151
    .line 152
    if-nez v5, :cond_8

    .line 153
    .line 154
    iget-wide v5, v13, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 155
    .line 156
    sget-object v7, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseNativeObject:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 157
    .line 158
    iget-wide v7, v7, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 159
    .line 160
    and-long/2addr v5, v7

    .line 161
    cmp-long v5, v5, v11

    .line 162
    .line 163
    if-eqz v5, :cond_7

    .line 164
    .line 165
    new-instance v5, Ljava/util/ArrayList;

    .line 166
    .line 167
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 168
    .line 169
    .line 170
    goto/16 :goto_6

    .line 171
    .line 172
    :cond_7
    new-instance v5, Lcom/alibaba/fastjson2/JSONArray;

    .line 173
    .line 174
    invoke-direct {v5}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 175
    .line 176
    .line 177
    goto/16 :goto_6

    .line 178
    .line 179
    :cond_8
    iget-wide v13, v13, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 180
    .line 181
    sget-object v15, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseNativeObject:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 182
    .line 183
    move-wide/from16 v16, v11

    .line 184
    .line 185
    iget-wide v11, v15, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 186
    .line 187
    and-long/2addr v11, v13

    .line 188
    cmp-long v11, v11, v16

    .line 189
    .line 190
    if-eqz v11, :cond_9

    .line 191
    .line 192
    new-instance v11, Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-direct {v11, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 195
    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_9
    new-instance v11, Lcom/alibaba/fastjson2/JSONArray;

    .line 199
    .line 200
    invoke-direct {v11, v5}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 201
    .line 202
    .line 203
    :goto_2
    move v12, v3

    .line 204
    :goto_3
    if-ge v12, v5, :cond_e

    .line 205
    .line 206
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏哲兰楪世()Z

    .line 207
    .line 208
    .line 209
    move-result v13

    .line 210
    if-eqz v13, :cond_b

    .line 211
    .line 212
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世兰苏子哲()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v13

    .line 216
    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v14

    .line 220
    if-eqz v14, :cond_a

    .line 221
    .line 222
    invoke-interface {v11, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_a
    const/4 v14, 0x0

    .line 227
    invoke-interface {v11, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    invoke-static {v13}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;

    .line 231
    .line 232
    .line 233
    move-result-object v13

    .line 234
    invoke-virtual {v0, v11, v12, v13}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪世哲苏兰(Ljava/util/Collection;ILcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;)V

    .line 235
    .line 236
    .line 237
    goto :goto_5

    .line 238
    :cond_b
    iget v13, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 239
    .line 240
    aget-byte v13, v6, v13

    .line 241
    .line 242
    if-lt v13, v8, :cond_c

    .line 243
    .line 244
    if-gt v13, v7, :cond_c

    .line 245
    .line 246
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v13

    .line 250
    goto :goto_4

    .line 251
    :cond_c
    if-ne v13, v9, :cond_d

    .line 252
    .line 253
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世哲苏兰子()Ljava/util/Map;

    .line 254
    .line 255
    .line 256
    move-result-object v13

    .line 257
    goto :goto_4

    .line 258
    :cond_d
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰楪苏世哲()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v13

    .line 262
    :goto_4
    invoke-interface {v11, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    :goto_5
    add-int/lit8 v12, v12, 0x1

    .line 266
    .line 267
    goto :goto_3

    .line 268
    :cond_e
    move-object v5, v11

    .line 269
    goto/16 :goto_6

    .line 270
    .line 271
    :cond_f
    invoke-static {v5}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(I)Z

    .line 272
    .line 273
    .line 274
    move-result v7

    .line 275
    if-eqz v7, :cond_10

    .line 276
    .line 277
    iget v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 278
    .line 279
    add-int/lit8 v7, v7, 0x1

    .line 280
    .line 281
    invoke-static {v7, v6, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰子哲世(I[BI)I

    .line 282
    .line 283
    .line 284
    move-result v5

    .line 285
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 286
    .line 287
    .line 288
    move-result-object v5

    .line 289
    iget v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 290
    .line 291
    add-int/lit8 v6, v6, 0x2

    .line 292
    .line 293
    iput v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 294
    .line 295
    goto :goto_6

    .line 296
    :cond_10
    invoke-static {v5}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲(I)Z

    .line 297
    .line 298
    .line 299
    move-result v7

    .line 300
    if-eqz v7, :cond_11

    .line 301
    .line 302
    iget v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 303
    .line 304
    add-int/lit8 v8, v7, 0x2

    .line 305
    .line 306
    if-ge v8, v11, :cond_11

    .line 307
    .line 308
    add-int/lit8 v7, v7, 0x1

    .line 309
    .line 310
    invoke-static {v7, v6, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰世子哲(I[BI)I

    .line 311
    .line 312
    .line 313
    move-result v5

    .line 314
    iget v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 315
    .line 316
    add-int/lit8 v6, v6, 0x3

    .line 317
    .line 318
    iput v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 319
    .line 320
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 321
    .line 322
    .line 323
    move-result-object v5

    .line 324
    goto :goto_6

    .line 325
    :cond_11
    const/16 v7, 0x48

    .line 326
    .line 327
    if-ne v5, v7, :cond_12

    .line 328
    .line 329
    iget v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 330
    .line 331
    add-int/lit8 v5, v5, 0x1

    .line 332
    .line 333
    invoke-static {v5, v11}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 334
    .line 335
    .line 336
    invoke-static {v6, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 337
    .line 338
    .line 339
    move-result v5

    .line 340
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 341
    .line 342
    .line 343
    move-result-object v5

    .line 344
    iget v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 345
    .line 346
    add-int/lit8 v6, v6, 0x5

    .line 347
    .line 348
    iput v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 349
    .line 350
    goto :goto_6

    .line 351
    :cond_12
    const/16 v6, -0x6d

    .line 352
    .line 353
    if-ne v5, v6, :cond_14

    .line 354
    .line 355
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世兰苏子哲()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v5

    .line 359
    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    move-result v6

    .line 363
    if-eqz v6, :cond_13

    .line 364
    .line 365
    move-object v5, v2

    .line 366
    goto :goto_6

    .line 367
    :cond_13
    invoke-static {v5}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;

    .line 368
    .line 369
    .line 370
    move-result-object v5

    .line 371
    invoke-virtual {v0, v2, v4, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪世哲苏兰(Ljava/util/Collection;ILcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;)V

    .line 372
    .line 373
    .line 374
    goto :goto_7

    .line 375
    :cond_14
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰楪苏世哲()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v5

    .line 379
    :goto_6
    invoke-virtual {v2, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    :goto_7
    add-int/lit8 v4, v4, 0x1

    .line 383
    .line 384
    goto/16 :goto_0

    .line 385
    .line 386
    :cond_15
    return-object v2
.end method

.method public final 飘花落叶言子兰苏世哲楪()Ljava/lang/String;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    add-int/lit8 v4, v1, 0x1

    .line 11
    .line 12
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 13
    .line 14
    iget-object v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 15
    .line 16
    aget-byte v1, v5, v1

    .line 17
    .line 18
    iput-byte v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪苏哲:B

    .line 19
    .line 20
    const/16 v6, -0x51

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    if-ne v1, v6, :cond_0

    .line 24
    .line 25
    return-object v7

    .line 26
    :cond_0
    const/16 v6, 0x7f

    .line 27
    .line 28
    const/4 v8, 0x0

    .line 29
    if-ne v1, v6, :cond_1

    .line 30
    .line 31
    move v6, v2

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move v6, v8

    .line 34
    :goto_0
    const/16 v9, 0x8

    .line 35
    .line 36
    const/4 v10, 0x2

    .line 37
    const/16 v11, 0x20

    .line 38
    .line 39
    if-eqz v6, :cond_5

    .line 40
    .line 41
    aget-byte v1, v5, v4

    .line 42
    .line 43
    iput-byte v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪苏哲:B

    .line 44
    .line 45
    invoke-static {v1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_4

    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-ltz v1, :cond_3

    .line 56
    .line 57
    if-nez v1, :cond_2

    .line 58
    .line 59
    iget-byte v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪世兰哲:B

    .line 60
    .line 61
    iput-byte v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪苏哲:B

    .line 62
    .line 63
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪世哲兰:I

    .line 64
    .line 65
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 66
    .line 67
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰哲苏楪:I

    .line 68
    .line 69
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 70
    .line 71
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    return-object v0

    .line 76
    :cond_2
    mul-int/2addr v1, v10

    .line 77
    add-int/2addr v1, v2

    .line 78
    iget-object v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪哲世兰:[J

    .line 79
    .line 80
    aget-wide v1, v2, v1

    .line 81
    .line 82
    long-to-int v3, v1

    .line 83
    int-to-byte v4, v3

    .line 84
    iput-byte v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪苏哲:B

    .line 85
    .line 86
    shr-int/2addr v3, v9

    .line 87
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 88
    .line 89
    shr-long/2addr v1, v11

    .line 90
    long-to-int v1, v1

    .line 91
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 92
    .line 93
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    return-object v0

    .line 98
    :cond_3
    throw v7

    .line 99
    :cond_4
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 100
    .line 101
    add-int/2addr v4, v2

    .line 102
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 103
    .line 104
    :cond_5
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 105
    .line 106
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 107
    .line 108
    const/16 v12, 0x4a

    .line 109
    .line 110
    if-ne v1, v12, :cond_6

    .line 111
    .line 112
    aget-byte v3, v5, v4

    .line 113
    .line 114
    and-int/lit16 v3, v3, 0xff

    .line 115
    .line 116
    int-to-char v3, v3

    .line 117
    invoke-static {v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世兰苏楪哲(C)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 122
    .line 123
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 124
    .line 125
    add-int/2addr v4, v2

    .line 126
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 127
    .line 128
    :goto_1
    move/from16 v24, v2

    .line 129
    .line 130
    move-object v2, v7

    .line 131
    move/from16 v23, v9

    .line 132
    .line 133
    move/from16 v22, v10

    .line 134
    .line 135
    goto/16 :goto_13

    .line 136
    .line 137
    :cond_6
    const/16 v12, 0x4b

    .line 138
    .line 139
    if-ne v1, v12, :cond_7

    .line 140
    .line 141
    aget-byte v3, v5, v4

    .line 142
    .line 143
    and-int/lit16 v3, v3, 0xff

    .line 144
    .line 145
    int-to-char v3, v3

    .line 146
    add-int/2addr v4, v2

    .line 147
    aget-byte v4, v5, v4

    .line 148
    .line 149
    and-int/lit16 v4, v4, 0xff

    .line 150
    .line 151
    int-to-char v4, v4

    .line 152
    invoke-static {v3, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世兰苏哲楪(CC)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    iput v10, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 157
    .line 158
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 159
    .line 160
    add-int/2addr v4, v10

    .line 161
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_7
    const/16 v12, 0x49

    .line 165
    .line 166
    if-lt v1, v12, :cond_13

    .line 167
    .line 168
    const/16 v12, 0x79

    .line 169
    .line 170
    if-gt v1, v12, :cond_13

    .line 171
    .line 172
    if-ne v1, v12, :cond_8

    .line 173
    .line 174
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 179
    .line 180
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 181
    .line 182
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_8
    add-int/lit8 v3, v1, -0x49

    .line 186
    .line 187
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 188
    .line 189
    add-int v12, v4, v3

    .line 190
    .line 191
    array-length v15, v5

    .line 192
    if-gt v12, v15, :cond_12

    .line 193
    .line 194
    const/16 v12, 0x30

    .line 195
    .line 196
    const/16 v15, 0x28

    .line 197
    .line 198
    const-wide v16, 0xffffffffL

    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    const-wide/16 v18, 0xff

    .line 204
    .line 205
    sget-wide v20, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪哲兰世:J

    .line 206
    .line 207
    packed-switch v3, :pswitch_data_0

    .line 208
    .line 209
    .line 210
    :goto_2
    move/from16 v24, v2

    .line 211
    .line 212
    move/from16 v23, v9

    .line 213
    .line 214
    move/from16 v22, v10

    .line 215
    .line 216
    const-wide/16 v25, -0x1

    .line 217
    .line 218
    const-wide/16 v29, -0x1

    .line 219
    .line 220
    const-wide/16 v31, -0x1

    .line 221
    .line 222
    goto/16 :goto_9

    .line 223
    .line 224
    :pswitch_0
    sget-object v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 225
    .line 226
    move/from16 v23, v9

    .line 227
    .line 228
    move/from16 v22, v10

    .line 229
    .line 230
    int-to-long v9, v4

    .line 231
    add-long v9, v20, v9

    .line 232
    .line 233
    invoke-virtual {v3, v5, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 234
    .line 235
    .line 236
    move-result-wide v15

    .line 237
    const-wide/16 v17, 0x8

    .line 238
    .line 239
    add-long v9, v9, v17

    .line 240
    .line 241
    invoke-virtual {v3, v5, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 242
    .line 243
    .line 244
    move-result-wide v3

    .line 245
    move/from16 v24, v2

    .line 246
    .line 247
    move-wide/from16 v31, v3

    .line 248
    .line 249
    move-wide/from16 v29, v15

    .line 250
    .line 251
    const-wide/16 v25, -0x1

    .line 252
    .line 253
    goto/16 :goto_9

    .line 254
    .line 255
    :pswitch_1
    move/from16 v23, v9

    .line 256
    .line 257
    move/from16 v22, v10

    .line 258
    .line 259
    add-int/lit8 v3, v4, 0x6

    .line 260
    .line 261
    aget-byte v3, v5, v3

    .line 262
    .line 263
    int-to-long v9, v3

    .line 264
    shl-long/2addr v9, v12

    .line 265
    add-int/lit8 v3, v4, 0x5

    .line 266
    .line 267
    aget-byte v3, v5, v3

    .line 268
    .line 269
    move/from16 v24, v2

    .line 270
    .line 271
    int-to-long v2, v3

    .line 272
    and-long v2, v2, v18

    .line 273
    .line 274
    shl-long/2addr v2, v15

    .line 275
    add-long/2addr v9, v2

    .line 276
    add-int/lit8 v2, v4, 0x4

    .line 277
    .line 278
    aget-byte v2, v5, v2

    .line 279
    .line 280
    int-to-long v2, v2

    .line 281
    and-long v2, v2, v18

    .line 282
    .line 283
    shl-long/2addr v2, v11

    .line 284
    add-long/2addr v9, v2

    .line 285
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 286
    .line 287
    int-to-long v3, v4

    .line 288
    add-long v3, v20, v3

    .line 289
    .line 290
    invoke-virtual {v2, v5, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 291
    .line 292
    .line 293
    move-result v12

    .line 294
    const-wide/16 v25, -0x1

    .line 295
    .line 296
    int-to-long v13, v12

    .line 297
    and-long v12, v13, v16

    .line 298
    .line 299
    add-long v15, v9, v12

    .line 300
    .line 301
    const-wide/16 v9, 0x7

    .line 302
    .line 303
    add-long/2addr v3, v9

    .line 304
    invoke-virtual {v2, v5, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 305
    .line 306
    .line 307
    move-result-wide v3

    .line 308
    :goto_3
    move-wide/from16 v31, v3

    .line 309
    .line 310
    move-wide/from16 v29, v15

    .line 311
    .line 312
    goto/16 :goto_9

    .line 313
    .line 314
    :pswitch_2
    move/from16 v24, v2

    .line 315
    .line 316
    move/from16 v23, v9

    .line 317
    .line 318
    move/from16 v22, v10

    .line 319
    .line 320
    const-wide/16 v25, -0x1

    .line 321
    .line 322
    add-int/lit8 v2, v4, 0x5

    .line 323
    .line 324
    aget-byte v2, v5, v2

    .line 325
    .line 326
    int-to-long v2, v2

    .line 327
    shl-long/2addr v2, v15

    .line 328
    add-int/lit8 v9, v4, 0x4

    .line 329
    .line 330
    aget-byte v9, v5, v9

    .line 331
    .line 332
    int-to-long v9, v9

    .line 333
    and-long v9, v9, v18

    .line 334
    .line 335
    shl-long/2addr v9, v11

    .line 336
    add-long/2addr v2, v9

    .line 337
    sget-object v9, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 338
    .line 339
    int-to-long v12, v4

    .line 340
    add-long v12, v20, v12

    .line 341
    .line 342
    invoke-virtual {v9, v5, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 343
    .line 344
    .line 345
    move-result v4

    .line 346
    int-to-long v14, v4

    .line 347
    and-long v14, v14, v16

    .line 348
    .line 349
    add-long v15, v2, v14

    .line 350
    .line 351
    const-wide/16 v2, 0x6

    .line 352
    .line 353
    add-long/2addr v12, v2

    .line 354
    invoke-virtual {v9, v5, v12, v13}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 355
    .line 356
    .line 357
    move-result-wide v3

    .line 358
    goto :goto_3

    .line 359
    :pswitch_3
    move/from16 v24, v2

    .line 360
    .line 361
    move/from16 v23, v9

    .line 362
    .line 363
    move/from16 v22, v10

    .line 364
    .line 365
    const-wide/16 v25, -0x1

    .line 366
    .line 367
    add-int/lit8 v2, v4, 0x4

    .line 368
    .line 369
    aget-byte v2, v5, v2

    .line 370
    .line 371
    int-to-long v2, v2

    .line 372
    shl-long/2addr v2, v11

    .line 373
    sget-object v9, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 374
    .line 375
    int-to-long v12, v4

    .line 376
    add-long v12, v20, v12

    .line 377
    .line 378
    invoke-virtual {v9, v5, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 379
    .line 380
    .line 381
    move-result v4

    .line 382
    int-to-long v14, v4

    .line 383
    and-long v14, v14, v16

    .line 384
    .line 385
    add-long v15, v2, v14

    .line 386
    .line 387
    const-wide/16 v2, 0x5

    .line 388
    .line 389
    add-long/2addr v12, v2

    .line 390
    invoke-virtual {v9, v5, v12, v13}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 391
    .line 392
    .line 393
    move-result-wide v3

    .line 394
    goto :goto_3

    .line 395
    :pswitch_4
    move/from16 v24, v2

    .line 396
    .line 397
    move/from16 v23, v9

    .line 398
    .line 399
    move/from16 v22, v10

    .line 400
    .line 401
    const-wide/16 v25, -0x1

    .line 402
    .line 403
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 404
    .line 405
    int-to-long v3, v4

    .line 406
    add-long v3, v20, v3

    .line 407
    .line 408
    invoke-virtual {v2, v5, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 409
    .line 410
    .line 411
    move-result v9

    .line 412
    int-to-long v9, v9

    .line 413
    const-wide/16 v12, 0x4

    .line 414
    .line 415
    add-long/2addr v3, v12

    .line 416
    invoke-virtual {v2, v5, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 417
    .line 418
    .line 419
    move-result-wide v3

    .line 420
    :goto_4
    move-wide/from16 v31, v3

    .line 421
    .line 422
    move-wide/from16 v29, v9

    .line 423
    .line 424
    goto/16 :goto_9

    .line 425
    .line 426
    :pswitch_5
    move/from16 v24, v2

    .line 427
    .line 428
    move/from16 v23, v9

    .line 429
    .line 430
    move/from16 v22, v10

    .line 431
    .line 432
    const-wide/16 v25, -0x1

    .line 433
    .line 434
    aget-byte v2, v5, v4

    .line 435
    .line 436
    shl-int/lit8 v2, v2, 0x10

    .line 437
    .line 438
    int-to-long v2, v2

    .line 439
    add-int/lit8 v9, v4, 0x1

    .line 440
    .line 441
    aget-byte v9, v5, v9

    .line 442
    .line 443
    int-to-long v9, v9

    .line 444
    and-long v9, v9, v18

    .line 445
    .line 446
    shl-long v9, v9, v23

    .line 447
    .line 448
    add-long/2addr v2, v9

    .line 449
    add-int/lit8 v9, v4, 0x2

    .line 450
    .line 451
    aget-byte v9, v5, v9

    .line 452
    .line 453
    int-to-long v9, v9

    .line 454
    and-long v9, v9, v18

    .line 455
    .line 456
    add-long v15, v2, v9

    .line 457
    .line 458
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 459
    .line 460
    int-to-long v3, v4

    .line 461
    add-long v20, v20, v3

    .line 462
    .line 463
    const-wide/16 v3, 0x3

    .line 464
    .line 465
    add-long v3, v20, v3

    .line 466
    .line 467
    invoke-virtual {v2, v5, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 468
    .line 469
    .line 470
    move-result-wide v3

    .line 471
    goto/16 :goto_3

    .line 472
    .line 473
    :pswitch_6
    move/from16 v24, v2

    .line 474
    .line 475
    move/from16 v23, v9

    .line 476
    .line 477
    move/from16 v22, v10

    .line 478
    .line 479
    const-wide/16 v25, -0x1

    .line 480
    .line 481
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 482
    .line 483
    int-to-long v3, v4

    .line 484
    add-long v3, v20, v3

    .line 485
    .line 486
    invoke-virtual {v2, v5, v3, v4}, Lsun/misc/Unsafe;->getShort(Ljava/lang/Object;J)S

    .line 487
    .line 488
    .line 489
    move-result v9

    .line 490
    int-to-long v9, v9

    .line 491
    const-wide/16 v12, 0x2

    .line 492
    .line 493
    add-long/2addr v3, v12

    .line 494
    invoke-virtual {v2, v5, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 495
    .line 496
    .line 497
    move-result-wide v3

    .line 498
    goto :goto_4

    .line 499
    :pswitch_7
    move/from16 v24, v2

    .line 500
    .line 501
    move/from16 v23, v9

    .line 502
    .line 503
    move/from16 v22, v10

    .line 504
    .line 505
    const-wide/16 v25, -0x1

    .line 506
    .line 507
    aget-byte v2, v5, v4

    .line 508
    .line 509
    int-to-long v2, v2

    .line 510
    sget-object v9, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 511
    .line 512
    int-to-long v12, v4

    .line 513
    add-long v20, v20, v12

    .line 514
    .line 515
    const-wide/16 v12, 0x1

    .line 516
    .line 517
    add-long v12, v20, v12

    .line 518
    .line 519
    invoke-virtual {v9, v5, v12, v13}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 520
    .line 521
    .line 522
    move-result-wide v9

    .line 523
    move-wide/from16 v29, v2

    .line 524
    .line 525
    move-wide/from16 v31, v9

    .line 526
    .line 527
    goto/16 :goto_9

    .line 528
    .line 529
    :pswitch_8
    move/from16 v24, v2

    .line 530
    .line 531
    move/from16 v23, v9

    .line 532
    .line 533
    move/from16 v22, v10

    .line 534
    .line 535
    const-wide/16 v25, -0x1

    .line 536
    .line 537
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 538
    .line 539
    int-to-long v3, v4

    .line 540
    add-long v3, v20, v3

    .line 541
    .line 542
    invoke-virtual {v2, v5, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 543
    .line 544
    .line 545
    move-result-wide v15

    .line 546
    :goto_5
    move-wide/from16 v29, v15

    .line 547
    .line 548
    :goto_6
    move-wide/from16 v31, v25

    .line 549
    .line 550
    goto/16 :goto_9

    .line 551
    .line 552
    :pswitch_9
    move/from16 v24, v2

    .line 553
    .line 554
    move/from16 v23, v9

    .line 555
    .line 556
    move/from16 v22, v10

    .line 557
    .line 558
    const-wide/16 v25, -0x1

    .line 559
    .line 560
    add-int/lit8 v2, v4, 0x6

    .line 561
    .line 562
    aget-byte v2, v5, v2

    .line 563
    .line 564
    int-to-long v2, v2

    .line 565
    shl-long/2addr v2, v12

    .line 566
    add-int/lit8 v9, v4, 0x5

    .line 567
    .line 568
    aget-byte v9, v5, v9

    .line 569
    .line 570
    int-to-long v9, v9

    .line 571
    and-long v9, v9, v18

    .line 572
    .line 573
    shl-long/2addr v9, v15

    .line 574
    add-long/2addr v2, v9

    .line 575
    add-int/lit8 v9, v4, 0x4

    .line 576
    .line 577
    aget-byte v9, v5, v9

    .line 578
    .line 579
    int-to-long v9, v9

    .line 580
    and-long v9, v9, v18

    .line 581
    .line 582
    shl-long/2addr v9, v11

    .line 583
    add-long/2addr v2, v9

    .line 584
    sget-object v9, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 585
    .line 586
    int-to-long v12, v4

    .line 587
    add-long v12, v20, v12

    .line 588
    .line 589
    invoke-virtual {v9, v5, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 590
    .line 591
    .line 592
    move-result v4

    .line 593
    :goto_7
    int-to-long v9, v4

    .line 594
    and-long v9, v9, v16

    .line 595
    .line 596
    :goto_8
    add-long v15, v2, v9

    .line 597
    .line 598
    goto :goto_5

    .line 599
    :pswitch_a
    move/from16 v24, v2

    .line 600
    .line 601
    move/from16 v23, v9

    .line 602
    .line 603
    move/from16 v22, v10

    .line 604
    .line 605
    const-wide/16 v25, -0x1

    .line 606
    .line 607
    add-int/lit8 v2, v4, 0x5

    .line 608
    .line 609
    aget-byte v2, v5, v2

    .line 610
    .line 611
    int-to-long v2, v2

    .line 612
    shl-long/2addr v2, v15

    .line 613
    add-int/lit8 v9, v4, 0x4

    .line 614
    .line 615
    aget-byte v9, v5, v9

    .line 616
    .line 617
    int-to-long v9, v9

    .line 618
    and-long v9, v9, v18

    .line 619
    .line 620
    shl-long/2addr v9, v11

    .line 621
    add-long/2addr v2, v9

    .line 622
    sget-object v9, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 623
    .line 624
    int-to-long v12, v4

    .line 625
    add-long v12, v20, v12

    .line 626
    .line 627
    invoke-virtual {v9, v5, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 628
    .line 629
    .line 630
    move-result v4

    .line 631
    goto :goto_7

    .line 632
    :pswitch_b
    move/from16 v24, v2

    .line 633
    .line 634
    move/from16 v23, v9

    .line 635
    .line 636
    move/from16 v22, v10

    .line 637
    .line 638
    const-wide/16 v25, -0x1

    .line 639
    .line 640
    add-int/lit8 v2, v4, 0x4

    .line 641
    .line 642
    aget-byte v2, v5, v2

    .line 643
    .line 644
    int-to-long v2, v2

    .line 645
    shl-long/2addr v2, v11

    .line 646
    sget-object v9, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 647
    .line 648
    int-to-long v12, v4

    .line 649
    add-long v12, v20, v12

    .line 650
    .line 651
    invoke-virtual {v9, v5, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 652
    .line 653
    .line 654
    move-result v4

    .line 655
    goto :goto_7

    .line 656
    :pswitch_c
    move/from16 v24, v2

    .line 657
    .line 658
    move/from16 v23, v9

    .line 659
    .line 660
    move/from16 v22, v10

    .line 661
    .line 662
    const-wide/16 v25, -0x1

    .line 663
    .line 664
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 665
    .line 666
    int-to-long v3, v4

    .line 667
    add-long v3, v20, v3

    .line 668
    .line 669
    invoke-virtual {v2, v5, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 670
    .line 671
    .line 672
    move-result v2

    .line 673
    int-to-long v2, v2

    .line 674
    move-wide/from16 v29, v2

    .line 675
    .line 676
    goto/16 :goto_6

    .line 677
    .line 678
    :pswitch_d
    move/from16 v24, v2

    .line 679
    .line 680
    move/from16 v23, v9

    .line 681
    .line 682
    move/from16 v22, v10

    .line 683
    .line 684
    const-wide/16 v25, -0x1

    .line 685
    .line 686
    add-int/lit8 v2, v4, 0x2

    .line 687
    .line 688
    aget-byte v2, v5, v2

    .line 689
    .line 690
    shl-int/lit8 v2, v2, 0x10

    .line 691
    .line 692
    int-to-long v2, v2

    .line 693
    add-int/lit8 v9, v4, 0x1

    .line 694
    .line 695
    aget-byte v9, v5, v9

    .line 696
    .line 697
    int-to-long v9, v9

    .line 698
    and-long v9, v9, v18

    .line 699
    .line 700
    shl-long v9, v9, v23

    .line 701
    .line 702
    add-long/2addr v2, v9

    .line 703
    aget-byte v4, v5, v4

    .line 704
    .line 705
    int-to-long v9, v4

    .line 706
    and-long v9, v9, v18

    .line 707
    .line 708
    goto :goto_8

    .line 709
    :goto_9
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 710
    .line 711
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 712
    .line 713
    add-int v4, v3, v2

    .line 714
    .line 715
    add-int/lit8 v9, v4, -0x1

    .line 716
    .line 717
    aget-byte v9, v5, v9

    .line 718
    .line 719
    if-lez v9, :cond_e

    .line 720
    .line 721
    cmp-long v9, v29, v25

    .line 722
    .line 723
    if-eqz v9, :cond_e

    .line 724
    .line 725
    cmp-long v9, v31, v25

    .line 726
    .line 727
    if-eqz v9, :cond_b

    .line 728
    .line 729
    xor-long v9, v29, v31

    .line 730
    .line 731
    ushr-long v12, v9, v11

    .line 732
    .line 733
    xor-long/2addr v9, v12

    .line 734
    long-to-int v9, v9

    .line 735
    sget-object v10, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰哲世:[Lcom/alibaba/fastjson2/飘花落叶言子楪苏世兰哲;

    .line 736
    .line 737
    and-int/lit16 v9, v9, 0x1fff

    .line 738
    .line 739
    aget-object v12, v10, v9

    .line 740
    .line 741
    if-nez v12, :cond_a

    .line 742
    .line 743
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世苏哲:Ljava/util/function/BiFunction;

    .line 744
    .line 745
    if-eqz v4, :cond_9

    .line 746
    .line 747
    invoke-static {v3, v5, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰(I[BI)Ljava/lang/String;

    .line 748
    .line 749
    .line 750
    move-result-object v3

    .line 751
    move-object/from16 v28, v3

    .line 752
    .line 753
    goto :goto_a

    .line 754
    :cond_9
    new-instance v4, Ljava/lang/String;

    .line 755
    .line 756
    sget-object v12, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 757
    .line 758
    invoke-direct {v4, v5, v3, v2, v12}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 759
    .line 760
    .line 761
    move-object/from16 v28, v4

    .line 762
    .line 763
    :goto_a
    new-instance v27, Lcom/alibaba/fastjson2/飘花落叶言子楪苏世兰哲;

    .line 764
    .line 765
    invoke-direct/range {v27 .. v32}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/String;JJ)V

    .line 766
    .line 767
    .line 768
    aput-object v27, v10, v9

    .line 769
    .line 770
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 771
    .line 772
    add-int/2addr v3, v2

    .line 773
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 774
    .line 775
    goto :goto_c

    .line 776
    :cond_a
    move-wide/from16 v9, v29

    .line 777
    .line 778
    iget-wide v13, v12, Lcom/alibaba/fastjson2/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:J

    .line 779
    .line 780
    cmp-long v3, v13, v9

    .line 781
    .line 782
    if-nez v3, :cond_e

    .line 783
    .line 784
    iget-wide v9, v12, Lcom/alibaba/fastjson2/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:J

    .line 785
    .line 786
    cmp-long v3, v9, v31

    .line 787
    .line 788
    if-nez v3, :cond_e

    .line 789
    .line 790
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 791
    .line 792
    iget-object v3, v12, Lcom/alibaba/fastjson2/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 793
    .line 794
    move-object/from16 v28, v3

    .line 795
    .line 796
    check-cast v28, Ljava/lang/String;

    .line 797
    .line 798
    goto :goto_c

    .line 799
    :cond_b
    move-wide/from16 v9, v29

    .line 800
    .line 801
    ushr-long v12, v9, v11

    .line 802
    .line 803
    xor-long/2addr v12, v9

    .line 804
    long-to-int v12, v12

    .line 805
    sget-object v13, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲:[Landroidx/recyclerview/widget/飘花落叶言子楪世苏兰哲;

    .line 806
    .line 807
    and-int/lit16 v12, v12, 0x1fff

    .line 808
    .line 809
    aget-object v14, v13, v12

    .line 810
    .line 811
    if-nez v14, :cond_d

    .line 812
    .line 813
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世苏哲:Ljava/util/function/BiFunction;

    .line 814
    .line 815
    if-eqz v4, :cond_c

    .line 816
    .line 817
    invoke-static {v3, v5, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰(I[BI)Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v3

    .line 821
    goto :goto_b

    .line 822
    :cond_c
    new-instance v4, Ljava/lang/String;

    .line 823
    .line 824
    sget-object v14, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 825
    .line 826
    invoke-direct {v4, v5, v3, v2, v14}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 827
    .line 828
    .line 829
    move-object v3, v4

    .line 830
    :goto_b
    new-instance v4, Landroidx/recyclerview/widget/飘花落叶言子楪世苏兰哲;

    .line 831
    .line 832
    invoke-direct {v4, v3, v9, v10}, Landroidx/recyclerview/widget/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;J)V

    .line 833
    .line 834
    .line 835
    aput-object v4, v13, v12

    .line 836
    .line 837
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 838
    .line 839
    add-int/2addr v4, v2

    .line 840
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 841
    .line 842
    move-object/from16 v28, v3

    .line 843
    .line 844
    goto :goto_c

    .line 845
    :cond_d
    iget-wide v12, v14, Landroidx/recyclerview/widget/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:J

    .line 846
    .line 847
    cmp-long v3, v12, v9

    .line 848
    .line 849
    if-nez v3, :cond_e

    .line 850
    .line 851
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 852
    .line 853
    iget-object v3, v14, Landroidx/recyclerview/widget/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 854
    .line 855
    move-object/from16 v28, v3

    .line 856
    .line 857
    check-cast v28, Ljava/lang/String;

    .line 858
    .line 859
    goto :goto_c

    .line 860
    :cond_e
    move-object/from16 v28, v7

    .line 861
    .line 862
    :goto_c
    if-nez v28, :cond_11

    .line 863
    .line 864
    if-ltz v2, :cond_10

    .line 865
    .line 866
    sget-object v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世苏哲:Ljava/util/function/BiFunction;

    .line 867
    .line 868
    if-eqz v3, :cond_f

    .line 869
    .line 870
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 871
    .line 872
    invoke-static {v3, v5, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰(I[BI)Ljava/lang/String;

    .line 873
    .line 874
    .line 875
    move-result-object v28

    .line 876
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 877
    .line 878
    add-int/2addr v3, v2

    .line 879
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 880
    .line 881
    goto :goto_d

    .line 882
    :cond_f
    sget-object v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世哲苏:Ljava/util/function/BiFunction;

    .line 883
    .line 884
    if-eqz v3, :cond_10

    .line 885
    .line 886
    new-array v4, v2, [B

    .line 887
    .line 888
    iget v9, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 889
    .line 890
    invoke-static {v5, v9, v4, v8, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 891
    .line 892
    .line 893
    invoke-static {v8}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 894
    .line 895
    .line 896
    move-result-object v8

    .line 897
    invoke-interface {v3, v4, v8}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 898
    .line 899
    .line 900
    move-result-object v3

    .line 901
    move-object/from16 v28, v3

    .line 902
    .line 903
    check-cast v28, Ljava/lang/String;

    .line 904
    .line 905
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 906
    .line 907
    add-int/2addr v3, v2

    .line 908
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 909
    .line 910
    :cond_10
    :goto_d
    sget-object v2, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 911
    .line 912
    :goto_e
    move-object/from16 v3, v28

    .line 913
    .line 914
    goto/16 :goto_13

    .line 915
    .line 916
    :cond_11
    move-object v2, v7

    .line 917
    goto :goto_e

    .line 918
    :cond_12
    const-string v0, "illegal jsonb data"

    .line 919
    .line 920
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 921
    .line 922
    .line 923
    return-object v7

    .line 924
    :cond_13
    move/from16 v24, v2

    .line 925
    .line 926
    move/from16 v23, v9

    .line 927
    .line 928
    move/from16 v22, v10

    .line 929
    .line 930
    const/16 v2, 0x7a

    .line 931
    .line 932
    if-ne v1, v2, :cond_17

    .line 933
    .line 934
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 935
    .line 936
    .line 937
    move-result v2

    .line 938
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 939
    .line 940
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 941
    .line 942
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 943
    .line 944
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世哲苏:Ljava/util/function/BiFunction;

    .line 945
    .line 946
    if-eqz v2, :cond_16

    .line 947
    .line 948
    sget-boolean v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰苏世:Z

    .line 949
    .line 950
    if-nez v4, :cond_16

    .line 951
    .line 952
    iget-object v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰苏楪哲:[B

    .line 953
    .line 954
    if-nez v4, :cond_14

    .line 955
    .line 956
    sget-object v4, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世哲苏:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 957
    .line 958
    iget-object v9, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰苏哲楪:Lcom/alibaba/fastjson2/飘花落叶言子楪世兰哲苏;

    .line 959
    .line 960
    invoke-virtual {v4, v9, v7}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 961
    .line 962
    .line 963
    move-result-object v4

    .line 964
    check-cast v4, [B

    .line 965
    .line 966
    iput-object v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰苏楪哲:[B

    .line 967
    .line 968
    if-nez v4, :cond_14

    .line 969
    .line 970
    const/16 v4, 0x2000

    .line 971
    .line 972
    new-array v4, v4, [B

    .line 973
    .line 974
    iput-object v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰苏楪哲:[B

    .line 975
    .line 976
    :cond_14
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 977
    .line 978
    shl-int/lit8 v9, v4, 0x1

    .line 979
    .line 980
    iget-object v10, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰苏楪哲:[B

    .line 981
    .line 982
    array-length v10, v10

    .line 983
    if-le v9, v10, :cond_15

    .line 984
    .line 985
    new-array v9, v9, [B

    .line 986
    .line 987
    iput-object v9, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰苏楪哲:[B

    .line 988
    .line 989
    :cond_15
    iget v9, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 990
    .line 991
    iget-object v10, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰苏楪哲:[B

    .line 992
    .line 993
    invoke-static {v9, v4, v5, v10}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲(II[B[B)I

    .line 994
    .line 995
    .line 996
    move-result v4

    .line 997
    const/4 v9, -0x1

    .line 998
    if-eq v4, v9, :cond_16

    .line 999
    .line 1000
    new-array v9, v4, [B

    .line 1001
    .line 1002
    iget-object v10, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰苏楪哲:[B

    .line 1003
    .line 1004
    invoke-static {v10, v8, v9, v8, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1005
    .line 1006
    .line 1007
    invoke-interface {v2, v9, v3}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v2

    .line 1011
    check-cast v2, Ljava/lang/String;

    .line 1012
    .line 1013
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1014
    .line 1015
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 1016
    .line 1017
    add-int/2addr v3, v4

    .line 1018
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1019
    .line 1020
    move-object v3, v2

    .line 1021
    goto :goto_f

    .line 1022
    :cond_16
    move-object v3, v7

    .line 1023
    :goto_f
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 1024
    .line 1025
    goto/16 :goto_13

    .line 1026
    .line 1027
    :cond_17
    const/16 v2, 0x7b

    .line 1028
    .line 1029
    if-ne v1, v2, :cond_18

    .line 1030
    .line 1031
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 1032
    .line 1033
    .line 1034
    move-result v2

    .line 1035
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 1036
    .line 1037
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1038
    .line 1039
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 1040
    .line 1041
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_16:Ljava/nio/charset/Charset;

    .line 1042
    .line 1043
    :goto_10
    move-object v3, v7

    .line 1044
    goto/16 :goto_13

    .line 1045
    .line 1046
    :cond_18
    const/16 v2, 0x7c

    .line 1047
    .line 1048
    if-ne v1, v2, :cond_1a

    .line 1049
    .line 1050
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 1051
    .line 1052
    .line 1053
    move-result v2

    .line 1054
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 1055
    .line 1056
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1057
    .line 1058
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 1059
    .line 1060
    sget-object v9, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世哲苏:Ljava/util/function/BiFunction;

    .line 1061
    .line 1062
    if-eqz v9, :cond_19

    .line 1063
    .line 1064
    sget-boolean v10, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰苏世:Z

    .line 1065
    .line 1066
    if-nez v10, :cond_19

    .line 1067
    .line 1068
    new-array v10, v2, [B

    .line 1069
    .line 1070
    invoke-static {v5, v4, v10, v8, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1071
    .line 1072
    .line 1073
    invoke-interface {v9, v10, v3}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v2

    .line 1077
    check-cast v2, Ljava/lang/String;

    .line 1078
    .line 1079
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1080
    .line 1081
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 1082
    .line 1083
    add-int/2addr v3, v4

    .line 1084
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1085
    .line 1086
    move-object v3, v2

    .line 1087
    goto :goto_11

    .line 1088
    :cond_19
    move-object v3, v7

    .line 1089
    :goto_11
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 1090
    .line 1091
    goto :goto_13

    .line 1092
    :cond_1a
    const/16 v2, 0x7d

    .line 1093
    .line 1094
    if-ne v1, v2, :cond_1c

    .line 1095
    .line 1096
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 1097
    .line 1098
    .line 1099
    move-result v2

    .line 1100
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 1101
    .line 1102
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1103
    .line 1104
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 1105
    .line 1106
    sget-object v9, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世哲苏:Ljava/util/function/BiFunction;

    .line 1107
    .line 1108
    if-eqz v9, :cond_1b

    .line 1109
    .line 1110
    sget-boolean v10, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰苏世:Z

    .line 1111
    .line 1112
    if-eqz v10, :cond_1b

    .line 1113
    .line 1114
    new-array v10, v2, [B

    .line 1115
    .line 1116
    invoke-static {v5, v4, v10, v8, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1117
    .line 1118
    .line 1119
    invoke-interface {v9, v10, v3}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v2

    .line 1123
    check-cast v2, Ljava/lang/String;

    .line 1124
    .line 1125
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1126
    .line 1127
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 1128
    .line 1129
    add-int/2addr v3, v4

    .line 1130
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1131
    .line 1132
    move-object v3, v2

    .line 1133
    goto :goto_12

    .line 1134
    :cond_1b
    move-object v3, v7

    .line 1135
    :goto_12
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_16BE:Ljava/nio/charset/Charset;

    .line 1136
    .line 1137
    goto :goto_13

    .line 1138
    :cond_1c
    const/16 v2, 0x7e

    .line 1139
    .line 1140
    if-ne v1, v2, :cond_1e

    .line 1141
    .line 1142
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 1143
    .line 1144
    .line 1145
    move-result v2

    .line 1146
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 1147
    .line 1148
    sget-object v2, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪兰哲世:Ljava/nio/charset/Charset;

    .line 1149
    .line 1150
    if-nez v2, :cond_1d

    .line 1151
    .line 1152
    const-string v2, "GB18030"

    .line 1153
    .line 1154
    invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v2

    .line 1158
    sput-object v2, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪兰哲世:Ljava/nio/charset/Charset;

    .line 1159
    .line 1160
    :cond_1d
    sget-object v2, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪兰哲世:Ljava/nio/charset/Charset;

    .line 1161
    .line 1162
    goto :goto_10

    .line 1163
    :cond_1e
    move-object v2, v7

    .line 1164
    move-object v3, v2

    .line 1165
    :goto_13
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 1166
    .line 1167
    if-ltz v4, :cond_24

    .line 1168
    .line 1169
    if-nez v3, :cond_1f

    .line 1170
    .line 1171
    new-instance v3, Ljava/lang/String;

    .line 1172
    .line 1173
    iget v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1174
    .line 1175
    invoke-direct {v3, v5, v7, v4, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 1176
    .line 1177
    .line 1178
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1179
    .line 1180
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 1181
    .line 1182
    add-int/2addr v2, v4

    .line 1183
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1184
    .line 1185
    :cond_1f
    if-eqz v6, :cond_23

    .line 1186
    .line 1187
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 1188
    .line 1189
    .line 1190
    move-result v2

    .line 1191
    if-nez v2, :cond_20

    .line 1192
    .line 1193
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 1194
    .line 1195
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰哲苏楪:I

    .line 1196
    .line 1197
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 1198
    .line 1199
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪世哲兰:I

    .line 1200
    .line 1201
    iput-byte v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪世兰哲:B

    .line 1202
    .line 1203
    return-object v3

    .line 1204
    :cond_20
    mul-int/lit8 v2, v2, 0x2

    .line 1205
    .line 1206
    add-int/lit8 v4, v2, 0x2

    .line 1207
    .line 1208
    iget-object v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪哲世兰:[J

    .line 1209
    .line 1210
    if-nez v5, :cond_21

    .line 1211
    .line 1212
    invoke-static {v4, v11}, Ljava/lang/Math;->max(II)I

    .line 1213
    .line 1214
    .line 1215
    move-result v4

    .line 1216
    new-array v4, v4, [J

    .line 1217
    .line 1218
    iput-object v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪哲世兰:[J

    .line 1219
    .line 1220
    goto :goto_14

    .line 1221
    :cond_21
    array-length v6, v5

    .line 1222
    if-ge v6, v4, :cond_22

    .line 1223
    .line 1224
    array-length v4, v5

    .line 1225
    add-int/lit8 v4, v4, 0x10

    .line 1226
    .line 1227
    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 1228
    .line 1229
    .line 1230
    move-result-object v4

    .line 1231
    iput-object v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪哲世兰:[J

    .line 1232
    .line 1233
    :cond_22
    :goto_14
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 1234
    .line 1235
    int-to-long v4, v4

    .line 1236
    shl-long/2addr v4, v11

    .line 1237
    iget v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 1238
    .line 1239
    int-to-long v6, v6

    .line 1240
    shl-long v6, v6, v23

    .line 1241
    .line 1242
    add-long/2addr v4, v6

    .line 1243
    int-to-long v6, v1

    .line 1244
    add-long/2addr v4, v6

    .line 1245
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪哲世兰:[J

    .line 1246
    .line 1247
    add-int/lit8 v2, v2, 0x1

    .line 1248
    .line 1249
    aput-wide v4, v0, v2

    .line 1250
    .line 1251
    :cond_23
    return-object v3

    .line 1252
    :cond_24
    throw v7

    .line 1253
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
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

.method public final 飘花落叶言子兰苏世楪哲()D
    .locals 11

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    const/16 v3, -0x4b

    .line 8
    .line 9
    const/16 v4, 0x8

    .line 10
    .line 11
    if-ne v2, v3, :cond_0

    .line 12
    .line 13
    add-int/lit8 v2, v0, 0x8

    .line 14
    .line 15
    aget-byte v2, v1, v2

    .line 16
    .line 17
    int-to-long v2, v2

    .line 18
    const-wide/16 v5, 0xff

    .line 19
    .line 20
    and-long/2addr v2, v5

    .line 21
    add-int/lit8 v7, v0, 0x7

    .line 22
    .line 23
    aget-byte v7, v1, v7

    .line 24
    .line 25
    int-to-long v7, v7

    .line 26
    and-long/2addr v7, v5

    .line 27
    shl-long/2addr v7, v4

    .line 28
    add-long/2addr v2, v7

    .line 29
    add-int/lit8 v4, v0, 0x6

    .line 30
    .line 31
    aget-byte v4, v1, v4

    .line 32
    .line 33
    int-to-long v7, v4

    .line 34
    and-long/2addr v7, v5

    .line 35
    const/16 v4, 0x10

    .line 36
    .line 37
    shl-long/2addr v7, v4

    .line 38
    add-long/2addr v2, v7

    .line 39
    add-int/lit8 v4, v0, 0x5

    .line 40
    .line 41
    aget-byte v4, v1, v4

    .line 42
    .line 43
    int-to-long v7, v4

    .line 44
    and-long/2addr v7, v5

    .line 45
    const/16 v4, 0x18

    .line 46
    .line 47
    shl-long/2addr v7, v4

    .line 48
    add-long/2addr v2, v7

    .line 49
    add-int/lit8 v4, v0, 0x4

    .line 50
    .line 51
    aget-byte v4, v1, v4

    .line 52
    .line 53
    int-to-long v7, v4

    .line 54
    and-long/2addr v7, v5

    .line 55
    const/16 v4, 0x20

    .line 56
    .line 57
    shl-long/2addr v7, v4

    .line 58
    add-long/2addr v2, v7

    .line 59
    add-int/lit8 v4, v0, 0x3

    .line 60
    .line 61
    aget-byte v4, v1, v4

    .line 62
    .line 63
    int-to-long v7, v4

    .line 64
    and-long/2addr v7, v5

    .line 65
    const/16 v4, 0x28

    .line 66
    .line 67
    shl-long/2addr v7, v4

    .line 68
    add-long/2addr v2, v7

    .line 69
    add-int/lit8 v4, v0, 0x2

    .line 70
    .line 71
    aget-byte v4, v1, v4

    .line 72
    .line 73
    int-to-long v7, v4

    .line 74
    and-long v4, v7, v5

    .line 75
    .line 76
    const/16 v6, 0x30

    .line 77
    .line 78
    shl-long/2addr v4, v6

    .line 79
    add-long/2addr v2, v4

    .line 80
    add-int/lit8 v4, v0, 0x1

    .line 81
    .line 82
    aget-byte v1, v1, v4

    .line 83
    .line 84
    int-to-long v4, v1

    .line 85
    const/16 v1, 0x38

    .line 86
    .line 87
    shl-long/2addr v4, v1

    .line 88
    add-long/2addr v2, v4

    .line 89
    add-int/lit8 v0, v0, 0x9

    .line 90
    .line 91
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 92
    .line 93
    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 94
    .line 95
    .line 96
    move-result-wide v0

    .line 97
    return-wide v0

    .line 98
    :cond_0
    add-int/lit8 v3, v0, 0x1

    .line 99
    .line 100
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 101
    .line 102
    const/16 v5, -0x4a

    .line 103
    .line 104
    if-eq v2, v5, :cond_14

    .line 105
    .line 106
    const/16 v5, -0x49

    .line 107
    .line 108
    iget v6, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏兰楪:I

    .line 109
    .line 110
    if-eq v2, v5, :cond_13

    .line 111
    .line 112
    const/16 v5, -0x47

    .line 113
    .line 114
    if-eq v2, v5, :cond_11

    .line 115
    .line 116
    const/16 v5, 0x48

    .line 117
    .line 118
    if-eq v2, v5, :cond_10

    .line 119
    .line 120
    const/16 v5, 0x7c

    .line 121
    .line 122
    const/4 v7, -0x1

    .line 123
    const/16 v8, 0x2e

    .line 124
    .line 125
    if-eq v2, v5, :cond_e

    .line 126
    .line 127
    const/16 v5, 0x79

    .line 128
    .line 129
    if-eq v2, v5, :cond_c

    .line 130
    .line 131
    const/16 v5, 0x7a

    .line 132
    .line 133
    if-eq v2, v5, :cond_a

    .line 134
    .line 135
    const-wide/16 v9, 0x0

    .line 136
    .line 137
    packed-switch v2, :pswitch_data_0

    .line 138
    .line 139
    .line 140
    packed-switch v2, :pswitch_data_1

    .line 141
    .line 142
    .line 143
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(I)Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-eqz v0, :cond_1

    .line 148
    .line 149
    int-to-double v0, v2

    .line 150
    return-wide v0

    .line 151
    :cond_1
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(I)Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-eqz v0, :cond_2

    .line 156
    .line 157
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 158
    .line 159
    add-int/lit8 v3, v0, 0x1

    .line 160
    .line 161
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 162
    .line 163
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰子哲世(I[BI)I

    .line 164
    .line 165
    .line 166
    move-result p0

    .line 167
    int-to-double v0, p0

    .line 168
    return-wide v0

    .line 169
    :cond_2
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(I)Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-eqz v0, :cond_3

    .line 174
    .line 175
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 176
    .line 177
    add-int/lit8 v3, v0, 0x1

    .line 178
    .line 179
    if-ge v3, v6, :cond_3

    .line 180
    .line 181
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰子世哲(I[BI)I

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 186
    .line 187
    add-int/lit8 v1, v1, 0x2

    .line 188
    .line 189
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 190
    .line 191
    int-to-double v0, v0

    .line 192
    return-wide v0

    .line 193
    :cond_3
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(I)Z

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    if-eqz v0, :cond_4

    .line 198
    .line 199
    add-int/lit8 v2, v2, 0x28

    .line 200
    .line 201
    int-to-long v0, v2

    .line 202
    const-wide/16 v2, -0x8

    .line 203
    .line 204
    add-long/2addr v0, v2

    .line 205
    long-to-double v0, v0

    .line 206
    return-wide v0

    .line 207
    :cond_4
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(I)Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-eqz v0, :cond_5

    .line 212
    .line 213
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 214
    .line 215
    add-int/lit8 v3, v0, 0x1

    .line 216
    .line 217
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 218
    .line 219
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰世哲子(I[BI)I

    .line 220
    .line 221
    .line 222
    move-result p0

    .line 223
    int-to-double v0, p0

    .line 224
    return-wide v0

    .line 225
    :cond_5
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲(I)Z

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    if-eqz v0, :cond_6

    .line 230
    .line 231
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 232
    .line 233
    add-int/lit8 v3, v0, 0x1

    .line 234
    .line 235
    if-ge v3, v6, :cond_6

    .line 236
    .line 237
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰世子哲(I[BI)I

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 242
    .line 243
    add-int/lit8 v1, v1, 0x2

    .line 244
    .line 245
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 246
    .line 247
    int-to-double v0, v0

    .line 248
    return-wide v0

    .line 249
    :cond_6
    const/16 v0, 0x49

    .line 250
    .line 251
    if-lt v2, v0, :cond_8

    .line 252
    .line 253
    const/16 v1, 0x78

    .line 254
    .line 255
    if-gt v2, v1, :cond_8

    .line 256
    .line 257
    sub-int/2addr v2, v0

    .line 258
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子世兰苏(I)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 263
    .line 264
    add-int/2addr v1, v2

    .line 265
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 266
    .line 267
    invoke-virtual {v0, v8}, Ljava/lang/String;->indexOf(I)I

    .line 268
    .line 269
    .line 270
    move-result p0

    .line 271
    if-ne p0, v7, :cond_7

    .line 272
    .line 273
    new-instance p0, Ljava/math/BigInteger;

    .line 274
    .line 275
    invoke-direct {p0, v0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {p0}, Ljava/math/BigInteger;->intValue()I

    .line 279
    .line 280
    .line 281
    move-result p0

    .line 282
    int-to-double v0, p0

    .line 283
    return-wide v0

    .line 284
    :cond_7
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    invoke-virtual {p0}, Ljava/math/BigDecimal;->intValue()I

    .line 289
    .line 290
    .line 291
    move-result p0

    .line 292
    int-to-double v0, p0

    .line 293
    return-wide v0

    .line 294
    :cond_8
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰哲世子(B)Lcom/alibaba/fastjson2/JSONException;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    throw p0

    .line 299
    :pswitch_0
    invoke-static {v3, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲兰子世(II)V

    .line 300
    .line 301
    .line 302
    invoke-static {v1, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲([BI)J

    .line 303
    .line 304
    .line 305
    move-result-wide v0

    .line 306
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 307
    .line 308
    add-int/2addr v2, v4

    .line 309
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 310
    .line 311
    long-to-double v0, v0

    .line 312
    return-wide v0

    .line 313
    :pswitch_1
    add-int/lit8 v0, v0, 0x2

    .line 314
    .line 315
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 316
    .line 317
    aget-byte p0, v1, v3

    .line 318
    .line 319
    int-to-double v0, p0

    .line 320
    return-wide v0

    .line 321
    :pswitch_2
    add-int/lit8 v2, v0, 0x2

    .line 322
    .line 323
    aget-byte v2, v1, v2

    .line 324
    .line 325
    and-int/lit16 v2, v2, 0xff

    .line 326
    .line 327
    aget-byte v1, v1, v3

    .line 328
    .line 329
    shl-int/2addr v1, v4

    .line 330
    add-int/2addr v2, v1

    .line 331
    add-int/lit8 v0, v0, 0x3

    .line 332
    .line 333
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 334
    .line 335
    int-to-double v0, v2

    .line 336
    return-wide v0

    .line 337
    :pswitch_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世兰苏哲()J

    .line 338
    .line 339
    .line 340
    move-result-wide v0

    .line 341
    long-to-double v0, v0

    .line 342
    return-wide v0

    .line 343
    :pswitch_4
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 344
    .line 345
    return-wide v0

    .line 346
    :pswitch_5
    return-wide v9

    .line 347
    :pswitch_6
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 348
    .line 349
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 350
    .line 351
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNullForPrimitives:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 352
    .line 353
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 354
    .line 355
    and-long/2addr v0, v2

    .line 356
    const-wide/16 v2, 0x0

    .line 357
    .line 358
    cmp-long v0, v0, v2

    .line 359
    .line 360
    if-nez v0, :cond_9

    .line 361
    .line 362
    const/4 v0, 0x1

    .line 363
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 364
    .line 365
    return-wide v9

    .line 366
    :cond_9
    const-string v0, "long value not support input null"

    .line 367
    .line 368
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object p0

    .line 372
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    return-wide v9

    .line 376
    :cond_a
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 377
    .line 378
    .line 379
    move-result v0

    .line 380
    new-instance v2, Ljava/lang/String;

    .line 381
    .line 382
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 383
    .line 384
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 385
    .line 386
    invoke-direct {v2, v1, v3, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 387
    .line 388
    .line 389
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 390
    .line 391
    add-int/2addr v1, v0

    .line 392
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 393
    .line 394
    invoke-virtual {v2, v8}, Ljava/lang/String;->indexOf(I)I

    .line 395
    .line 396
    .line 397
    move-result p0

    .line 398
    if-ne p0, v7, :cond_b

    .line 399
    .line 400
    new-instance p0, Ljava/math/BigInteger;

    .line 401
    .line 402
    invoke-direct {p0, v2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {p0}, Ljava/math/BigInteger;->intValue()I

    .line 406
    .line 407
    .line 408
    move-result p0

    .line 409
    int-to-double v0, p0

    .line 410
    return-wide v0

    .line 411
    :cond_b
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 412
    .line 413
    .line 414
    move-result-object p0

    .line 415
    invoke-virtual {p0}, Ljava/math/BigDecimal;->intValue()I

    .line 416
    .line 417
    .line 418
    move-result p0

    .line 419
    int-to-double v0, p0

    .line 420
    return-wide v0

    .line 421
    :cond_c
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 422
    .line 423
    .line 424
    move-result v0

    .line 425
    new-instance v2, Ljava/lang/String;

    .line 426
    .line 427
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 428
    .line 429
    sget-object v4, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 430
    .line 431
    invoke-direct {v2, v1, v3, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 432
    .line 433
    .line 434
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 435
    .line 436
    add-int/2addr v1, v0

    .line 437
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 438
    .line 439
    invoke-virtual {v2, v8}, Ljava/lang/String;->indexOf(I)I

    .line 440
    .line 441
    .line 442
    move-result p0

    .line 443
    if-ne p0, v7, :cond_d

    .line 444
    .line 445
    new-instance p0, Ljava/math/BigInteger;

    .line 446
    .line 447
    invoke-direct {p0, v2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {p0}, Ljava/math/BigInteger;->intValue()I

    .line 451
    .line 452
    .line 453
    move-result p0

    .line 454
    int-to-double v0, p0

    .line 455
    return-wide v0

    .line 456
    :cond_d
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 457
    .line 458
    .line 459
    move-result-object p0

    .line 460
    invoke-virtual {p0}, Ljava/math/BigDecimal;->intValue()I

    .line 461
    .line 462
    .line 463
    move-result p0

    .line 464
    int-to-double v0, p0

    .line 465
    return-wide v0

    .line 466
    :cond_e
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 467
    .line 468
    .line 469
    move-result v0

    .line 470
    new-instance v2, Ljava/lang/String;

    .line 471
    .line 472
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 473
    .line 474
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 475
    .line 476
    invoke-direct {v2, v1, v3, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 477
    .line 478
    .line 479
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 480
    .line 481
    add-int/2addr v1, v0

    .line 482
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 483
    .line 484
    invoke-virtual {v2, v8}, Ljava/lang/String;->indexOf(I)I

    .line 485
    .line 486
    .line 487
    move-result p0

    .line 488
    if-ne p0, v7, :cond_f

    .line 489
    .line 490
    new-instance p0, Ljava/math/BigInteger;

    .line 491
    .line 492
    invoke-direct {p0, v2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {p0}, Ljava/math/BigInteger;->intValue()I

    .line 496
    .line 497
    .line 498
    move-result p0

    .line 499
    int-to-double v0, p0

    .line 500
    return-wide v0

    .line 501
    :cond_f
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 502
    .line 503
    .line 504
    move-result-object p0

    .line 505
    invoke-virtual {p0}, Ljava/math/BigDecimal;->intValue()I

    .line 506
    .line 507
    .line 508
    move-result p0

    .line 509
    int-to-double v0, p0

    .line 510
    return-wide v0

    .line 511
    :cond_10
    :pswitch_7
    invoke-static {v3, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 512
    .line 513
    .line 514
    invoke-static {v1, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 515
    .line 516
    .line 517
    move-result v0

    .line 518
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 519
    .line 520
    add-int/lit8 v1, v1, 0x4

    .line 521
    .line 522
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 523
    .line 524
    int-to-double v0, v0

    .line 525
    return-wide v0

    .line 526
    :cond_11
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 527
    .line 528
    .line 529
    move-result v0

    .line 530
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰世楪哲苏()Ljava/math/BigInteger;

    .line 531
    .line 532
    .line 533
    move-result-object p0

    .line 534
    if-nez v0, :cond_12

    .line 535
    .line 536
    new-instance v0, Ljava/math/BigDecimal;

    .line 537
    .line 538
    invoke-direct {v0, p0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 539
    .line 540
    .line 541
    goto :goto_0

    .line 542
    :cond_12
    new-instance v1, Ljava/math/BigDecimal;

    .line 543
    .line 544
    invoke-direct {v1, p0, v0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 545
    .line 546
    .line 547
    move-object v0, v1

    .line 548
    :goto_0
    invoke-virtual {v0}, Ljava/math/BigDecimal;->intValue()I

    .line 549
    .line 550
    .line 551
    move-result p0

    .line 552
    int-to-double v0, p0

    .line 553
    return-wide v0

    .line 554
    :cond_13
    invoke-static {v3, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 555
    .line 556
    .line 557
    invoke-static {v1, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 558
    .line 559
    .line 560
    move-result v0

    .line 561
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 562
    .line 563
    add-int/lit8 v1, v1, 0x4

    .line 564
    .line 565
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 566
    .line 567
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 568
    .line 569
    .line 570
    move-result p0

    .line 571
    float-to-double v0, p0

    .line 572
    return-wide v0

    .line 573
    :cond_14
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 574
    .line 575
    .line 576
    move-result p0

    .line 577
    int-to-float p0, p0

    .line 578
    float-to-double v0, p0

    .line 579
    return-wide v0

    .line 580
    nop

    .line 581
    :pswitch_data_0
    .packed-switch -0x51
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 582
    .line 583
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
    .line 594
    .line 595
    .line 596
    .line 597
    :pswitch_data_1
    .packed-switch -0x44
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_7
    .end packed-switch
.end method

.method public final 飘花落叶言子兰苏哲世楪()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰苏哲楪世()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public final 飘花落叶言子兰苏哲楪世()J
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 8
    .line 9
    iget-object v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 10
    .line 11
    aget-byte v1, v3, v1

    .line 12
    .line 13
    iput-byte v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪苏哲:B

    .line 14
    .line 15
    const/16 v4, 0x7f

    .line 16
    .line 17
    const/4 v6, 0x1

    .line 18
    if-ne v1, v4, :cond_0

    .line 19
    .line 20
    move v4, v6

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v4, 0x0

    .line 23
    :goto_0
    const/4 v7, 0x0

    .line 24
    const/16 v8, 0x8

    .line 25
    .line 26
    const-wide/16 v9, 0x0

    .line 27
    .line 28
    const/16 v11, 0x20

    .line 29
    .line 30
    if-eqz v4, :cond_7

    .line 31
    .line 32
    aget-byte v1, v3, v2

    .line 33
    .line 34
    iput-byte v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪苏哲:B

    .line 35
    .line 36
    invoke-static {v1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_6

    .line 41
    .line 42
    const/16 v2, 0x2f

    .line 43
    .line 44
    if-gt v1, v2, :cond_1

    .line 45
    .line 46
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 47
    .line 48
    add-int/2addr v2, v6

    .line 49
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    :goto_1
    if-ltz v1, :cond_5

    .line 57
    .line 58
    if-nez v1, :cond_3

    .line 59
    .line 60
    iget-byte v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪世兰哲:B

    .line 61
    .line 62
    iput-byte v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪苏哲:B

    .line 63
    .line 64
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪世哲兰:I

    .line 65
    .line 66
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 67
    .line 68
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰哲苏楪:I

    .line 69
    .line 70
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 71
    .line 72
    iget-wide v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰哲楪苏:J

    .line 73
    .line 74
    cmp-long v1, v1, v9

    .line 75
    .line 76
    if-nez v1, :cond_2

    .line 77
    .line 78
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰哲子世()J

    .line 79
    .line 80
    .line 81
    move-result-wide v1

    .line 82
    iput-wide v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰哲楪苏:J

    .line 83
    .line 84
    :cond_2
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰哲楪苏:J

    .line 85
    .line 86
    return-wide v0

    .line 87
    :cond_3
    mul-int/lit8 v1, v1, 0x2

    .line 88
    .line 89
    iget-object v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪哲世兰:[J

    .line 90
    .line 91
    add-int/lit8 v3, v1, 0x1

    .line 92
    .line 93
    aget-wide v3, v2, v3

    .line 94
    .line 95
    long-to-int v5, v3

    .line 96
    int-to-byte v6, v5

    .line 97
    iput-byte v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪苏哲:B

    .line 98
    .line 99
    shr-int/2addr v5, v8

    .line 100
    iput v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 101
    .line 102
    shr-long/2addr v3, v11

    .line 103
    long-to-int v3, v3

    .line 104
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 105
    .line 106
    aget-wide v3, v2, v1

    .line 107
    .line 108
    cmp-long v2, v3, v9

    .line 109
    .line 110
    if-nez v2, :cond_4

    .line 111
    .line 112
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰哲子世()J

    .line 113
    .line 114
    .line 115
    move-result-wide v2

    .line 116
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪哲世兰:[J

    .line 117
    .line 118
    aput-wide v2, v0, v1

    .line 119
    .line 120
    return-wide v2

    .line 121
    :cond_4
    return-wide v3

    .line 122
    :cond_5
    throw v7

    .line 123
    :cond_6
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 124
    .line 125
    add-int/2addr v2, v6

    .line 126
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 127
    .line 128
    :cond_7
    const/16 v2, 0x49

    .line 129
    .line 130
    if-lt v1, v2, :cond_8

    .line 131
    .line 132
    const/16 v2, 0x78

    .line 133
    .line 134
    if-gt v1, v2, :cond_8

    .line 135
    .line 136
    add-int/lit8 v2, v1, -0x49

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_8
    const/16 v2, 0x79

    .line 140
    .line 141
    if-eq v1, v2, :cond_b

    .line 142
    .line 143
    const/16 v2, 0x7a

    .line 144
    .line 145
    if-ne v1, v2, :cond_9

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    const-string v2, "fieldName not support input type "

    .line 151
    .line 152
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    iget-byte v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪苏哲:B

    .line 156
    .line 157
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(B)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    iget-byte v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪苏哲:B

    .line 165
    .line 166
    const/16 v3, -0x6d

    .line 167
    .line 168
    if-ne v2, v3, :cond_a

    .line 169
    .line 170
    const-string v2, " "

    .line 171
    .line 172
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    :cond_a
    iget v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 183
    .line 184
    const-string v2, ", offset "

    .line 185
    .line 186
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 193
    .line 194
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    throw v0

    .line 202
    :cond_b
    :goto_2
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    :goto_3
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 207
    .line 208
    iget v12, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 209
    .line 210
    iput v12, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 211
    .line 212
    if-ltz v2, :cond_14

    .line 213
    .line 214
    if-gt v2, v8, :cond_c

    .line 215
    .line 216
    add-int v7, v12, v2

    .line 217
    .line 218
    array-length v13, v3

    .line 219
    if-gt v7, v13, :cond_c

    .line 220
    .line 221
    int-to-long v13, v12

    .line 222
    sget-wide v15, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪哲兰世:J

    .line 223
    .line 224
    add-long/2addr v13, v15

    .line 225
    const-wide/32 v15, 0xffff

    .line 226
    .line 227
    .line 228
    const-wide v17, 0xffffffffL

    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    packed-switch v2, :pswitch_data_0

    .line 234
    .line 235
    .line 236
    sget-object v7, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 237
    .line 238
    invoke-virtual {v7, v3, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 239
    .line 240
    .line 241
    move-result-wide v12

    .line 242
    move/from16 v19, v6

    .line 243
    .line 244
    move/from16 v20, v8

    .line 245
    .line 246
    move-wide/from16 v21, v9

    .line 247
    .line 248
    goto/16 :goto_7

    .line 249
    .line 250
    :pswitch_0
    add-int/lit8 v7, v12, 0x6

    .line 251
    .line 252
    aget-byte v7, v3, v7

    .line 253
    .line 254
    move/from16 v19, v6

    .line 255
    .line 256
    int-to-long v5, v7

    .line 257
    const/16 v7, 0x30

    .line 258
    .line 259
    shl-long/2addr v5, v7

    .line 260
    add-int/lit8 v7, v12, 0x5

    .line 261
    .line 262
    aget-byte v7, v3, v7

    .line 263
    .line 264
    move/from16 v20, v8

    .line 265
    .line 266
    move-wide/from16 v21, v9

    .line 267
    .line 268
    int-to-long v8, v7

    .line 269
    const-wide/16 v15, 0xff

    .line 270
    .line 271
    and-long v7, v8, v15

    .line 272
    .line 273
    const/16 v9, 0x28

    .line 274
    .line 275
    shl-long/2addr v7, v9

    .line 276
    add-long/2addr v5, v7

    .line 277
    add-int/lit8 v12, v12, 0x4

    .line 278
    .line 279
    aget-byte v7, v3, v12

    .line 280
    .line 281
    int-to-long v7, v7

    .line 282
    and-long/2addr v7, v15

    .line 283
    shl-long/2addr v7, v11

    .line 284
    add-long/2addr v5, v7

    .line 285
    sget-object v7, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 286
    .line 287
    invoke-virtual {v7, v3, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 288
    .line 289
    .line 290
    move-result v7

    .line 291
    :goto_4
    int-to-long v7, v7

    .line 292
    and-long v7, v7, v17

    .line 293
    .line 294
    :goto_5
    add-long v12, v5, v7

    .line 295
    .line 296
    goto/16 :goto_7

    .line 297
    .line 298
    :pswitch_1
    move/from16 v19, v6

    .line 299
    .line 300
    move/from16 v20, v8

    .line 301
    .line 302
    move-wide/from16 v21, v9

    .line 303
    .line 304
    sget-object v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 305
    .line 306
    const-wide/16 v6, 0x4

    .line 307
    .line 308
    add-long/2addr v6, v13

    .line 309
    invoke-virtual {v5, v3, v6, v7}, Lsun/misc/Unsafe;->getShort(Ljava/lang/Object;J)S

    .line 310
    .line 311
    .line 312
    move-result v6

    .line 313
    int-to-long v6, v6

    .line 314
    shl-long/2addr v6, v11

    .line 315
    invoke-virtual {v5, v3, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 316
    .line 317
    .line 318
    move-result v5

    .line 319
    int-to-long v8, v5

    .line 320
    and-long v8, v8, v17

    .line 321
    .line 322
    add-long v12, v6, v8

    .line 323
    .line 324
    goto :goto_7

    .line 325
    :pswitch_2
    move/from16 v19, v6

    .line 326
    .line 327
    move/from16 v20, v8

    .line 328
    .line 329
    move-wide/from16 v21, v9

    .line 330
    .line 331
    add-int/lit8 v12, v12, 0x4

    .line 332
    .line 333
    aget-byte v5, v3, v12

    .line 334
    .line 335
    int-to-long v5, v5

    .line 336
    shl-long/2addr v5, v11

    .line 337
    sget-object v7, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 338
    .line 339
    invoke-virtual {v7, v3, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 340
    .line 341
    .line 342
    move-result v7

    .line 343
    goto :goto_4

    .line 344
    :pswitch_3
    move/from16 v19, v6

    .line 345
    .line 346
    move/from16 v20, v8

    .line 347
    .line 348
    move-wide/from16 v21, v9

    .line 349
    .line 350
    sget-object v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 351
    .line 352
    invoke-virtual {v5, v3, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 353
    .line 354
    .line 355
    move-result v5

    .line 356
    :goto_6
    int-to-long v12, v5

    .line 357
    goto :goto_7

    .line 358
    :pswitch_4
    move/from16 v19, v6

    .line 359
    .line 360
    move/from16 v20, v8

    .line 361
    .line 362
    move-wide/from16 v21, v9

    .line 363
    .line 364
    add-int/lit8 v12, v12, 0x2

    .line 365
    .line 366
    aget-byte v5, v3, v12

    .line 367
    .line 368
    shl-int/lit8 v5, v5, 0x10

    .line 369
    .line 370
    int-to-long v5, v5

    .line 371
    sget-object v7, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 372
    .line 373
    invoke-virtual {v7, v3, v13, v14}, Lsun/misc/Unsafe;->getShort(Ljava/lang/Object;J)S

    .line 374
    .line 375
    .line 376
    move-result v7

    .line 377
    int-to-long v7, v7

    .line 378
    and-long/2addr v7, v15

    .line 379
    goto :goto_5

    .line 380
    :pswitch_5
    move/from16 v19, v6

    .line 381
    .line 382
    move/from16 v20, v8

    .line 383
    .line 384
    move-wide/from16 v21, v9

    .line 385
    .line 386
    sget-object v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 387
    .line 388
    invoke-virtual {v5, v3, v13, v14}, Lsun/misc/Unsafe;->getShort(Ljava/lang/Object;J)S

    .line 389
    .line 390
    .line 391
    move-result v5

    .line 392
    int-to-long v5, v5

    .line 393
    and-long v12, v5, v15

    .line 394
    .line 395
    goto :goto_7

    .line 396
    :pswitch_6
    move/from16 v19, v6

    .line 397
    .line 398
    move/from16 v20, v8

    .line 399
    .line 400
    move-wide/from16 v21, v9

    .line 401
    .line 402
    aget-byte v5, v3, v12

    .line 403
    .line 404
    goto :goto_6

    .line 405
    :cond_c
    move/from16 v19, v6

    .line 406
    .line 407
    move/from16 v20, v8

    .line 408
    .line 409
    move-wide/from16 v21, v9

    .line 410
    .line 411
    move-wide/from16 v12, v21

    .line 412
    .line 413
    :goto_7
    cmp-long v5, v12, v21

    .line 414
    .line 415
    if-eqz v5, :cond_d

    .line 416
    .line 417
    iget v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 418
    .line 419
    add-int/2addr v5, v2

    .line 420
    iput v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 421
    .line 422
    goto :goto_9

    .line 423
    :cond_d
    const-wide v5, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    move-wide v12, v5

    .line 429
    const/4 v5, 0x0

    .line 430
    :goto_8
    if-ge v5, v2, :cond_e

    .line 431
    .line 432
    iget v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 433
    .line 434
    add-int/lit8 v7, v6, 0x1

    .line 435
    .line 436
    iput v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 437
    .line 438
    aget-byte v6, v3, v6

    .line 439
    .line 440
    int-to-long v6, v6

    .line 441
    xor-long/2addr v6, v12

    .line 442
    const-wide v8, 0x100000001b3L

    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    mul-long v12, v6, v8

    .line 448
    .line 449
    add-int/lit8 v5, v5, 0x1

    .line 450
    .line 451
    goto :goto_8

    .line 452
    :cond_e
    :goto_9
    if-eqz v4, :cond_13

    .line 453
    .line 454
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 455
    .line 456
    aget-byte v3, v3, v4

    .line 457
    .line 458
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(I)Z

    .line 459
    .line 460
    .line 461
    move-result v4

    .line 462
    if-eqz v4, :cond_f

    .line 463
    .line 464
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 465
    .line 466
    add-int/lit8 v4, v4, 0x1

    .line 467
    .line 468
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 469
    .line 470
    goto :goto_a

    .line 471
    :cond_f
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 472
    .line 473
    .line 474
    move-result v3

    .line 475
    :goto_a
    if-nez v3, :cond_10

    .line 476
    .line 477
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 478
    .line 479
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰哲苏楪:I

    .line 480
    .line 481
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪世哲兰:I

    .line 482
    .line 483
    iput-byte v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪世兰哲:B

    .line 484
    .line 485
    iput-wide v12, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰哲楪苏:J

    .line 486
    .line 487
    return-wide v12

    .line 488
    :cond_10
    shl-int/lit8 v3, v3, 0x1

    .line 489
    .line 490
    add-int/lit8 v4, v3, 0x2

    .line 491
    .line 492
    iget-object v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪哲世兰:[J

    .line 493
    .line 494
    if-nez v5, :cond_11

    .line 495
    .line 496
    invoke-static {v4, v11}, Ljava/lang/Math;->max(II)I

    .line 497
    .line 498
    .line 499
    move-result v4

    .line 500
    new-array v4, v4, [J

    .line 501
    .line 502
    iput-object v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪哲世兰:[J

    .line 503
    .line 504
    goto :goto_b

    .line 505
    :cond_11
    array-length v6, v5

    .line 506
    if-ge v6, v4, :cond_12

    .line 507
    .line 508
    add-int/lit8 v4, v3, 0x12

    .line 509
    .line 510
    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 511
    .line 512
    .line 513
    move-result-object v4

    .line 514
    iput-object v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪哲世兰:[J

    .line 515
    .line 516
    :cond_12
    :goto_b
    iget-object v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪哲世兰:[J

    .line 517
    .line 518
    aput-wide v12, v4, v3

    .line 519
    .line 520
    add-int/lit8 v3, v3, 0x1

    .line 521
    .line 522
    iget v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 523
    .line 524
    int-to-long v5, v0

    .line 525
    shl-long/2addr v5, v11

    .line 526
    int-to-long v7, v2

    .line 527
    shl-long v7, v7, v20

    .line 528
    .line 529
    add-long/2addr v5, v7

    .line 530
    int-to-long v0, v1

    .line 531
    add-long/2addr v5, v0

    .line 532
    aput-wide v5, v4, v3

    .line 533
    .line 534
    :cond_13
    return-wide v12

    .line 535
    :cond_14
    throw v7

    .line 536
    nop

    .line 537
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子兰苏楪世哲()Ljava/util/Date;
    .locals 9

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏兰楪:I

    .line 8
    .line 9
    iget-object v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 10
    .line 11
    const-wide/16 v5, 0x3e8

    .line 12
    .line 13
    const/4 v7, 0x1

    .line 14
    const/4 v8, 0x0

    .line 15
    packed-switch v2, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    goto/16 :goto_0

    .line 19
    .line 20
    :pswitch_0
    add-int/2addr v0, v7

    .line 21
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世兰苏哲()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    int-to-long v2, p0

    .line 32
    invoke-static {v0, v1, v2, v3}, Ljava/time/Instant;->ofEpochSecond(JJ)Ljava/time/Instant;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, Ljava/util/Date;->from(Ljava/time/Instant;)Ljava/util/Date;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :pswitch_1
    add-int/2addr v0, v7

    .line 42
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 43
    .line 44
    .line 45
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    int-to-long v0, v0

    .line 50
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 51
    .line 52
    add-int/lit8 v2, v2, 0x5

    .line 53
    .line 54
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 55
    .line 56
    new-instance p0, Ljava/util/Date;

    .line 57
    .line 58
    const-wide/32 v2, 0xea60

    .line 59
    .line 60
    .line 61
    mul-long/2addr v0, v2

    .line 62
    invoke-direct {p0, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 63
    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_2
    add-int/2addr v0, v7

    .line 67
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 68
    .line 69
    .line 70
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    int-to-long v0, v0

    .line 75
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 76
    .line 77
    add-int/lit8 v2, v2, 0x5

    .line 78
    .line 79
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 80
    .line 81
    new-instance p0, Ljava/util/Date;

    .line 82
    .line 83
    mul-long/2addr v0, v5

    .line 84
    invoke-direct {p0, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 85
    .line 86
    .line 87
    return-object p0

    .line 88
    :pswitch_3
    add-int/2addr v0, v7

    .line 89
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲([BI)J

    .line 90
    .line 91
    .line 92
    move-result-wide v0

    .line 93
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 94
    .line 95
    add-int/lit8 v2, v2, 0x9

    .line 96
    .line 97
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 98
    .line 99
    new-instance p0, Ljava/util/Date;

    .line 100
    .line 101
    invoke-direct {p0, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 102
    .line 103
    .line 104
    return-object p0

    .line 105
    :pswitch_4
    add-int/2addr v0, v7

    .line 106
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 107
    .line 108
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲世子兰苏()Ljava/time/ZonedDateTime;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    goto :goto_0

    .line 113
    :pswitch_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子苏世兰哲()Ljava/time/LocalDate;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    sget-object v1, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 118
    .line 119
    invoke-static {v0, v1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世兰苏哲()Ljava/time/ZoneId;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-static {v0, v1, v8}, Ljava/time/ZonedDateTime;->ofLocal(Ljava/time/LocalDateTime;Ljava/time/ZoneId;Ljava/time/ZoneOffset;)Ljava/time/ZonedDateTime;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    goto :goto_0

    .line 132
    :pswitch_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子哲世苏兰()Ljava/time/LocalDateTime;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世兰苏哲()Ljava/time/ZoneId;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-static {v0, v1, v8}, Ljava/time/ZonedDateTime;->ofLocal(Ljava/time/LocalDateTime;Ljava/time/ZoneId;Ljava/time/ZoneOffset;)Ljava/time/ZonedDateTime;

    .line 141
    .line 142
    .line 143
    move-result-object v8

    .line 144
    goto :goto_0

    .line 145
    :pswitch_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子兰苏哲世()Ljava/time/LocalTime;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    const/16 v1, 0x7b2

    .line 150
    .line 151
    invoke-static {v1, v7, v7}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-static {v1, v0}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世兰苏哲()Ljava/time/ZoneId;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-static {v0, v1, v8}, Ljava/time/ZonedDateTime;->ofLocal(Ljava/time/LocalDateTime;Ljava/time/ZoneId;Ljava/time/ZoneOffset;)Ljava/time/ZonedDateTime;

    .line 164
    .line 165
    .line 166
    move-result-object v8

    .line 167
    :goto_0
    if-eqz v8, :cond_1

    .line 168
    .line 169
    invoke-interface {v8}, Ljava/time/chrono/ChronoZonedDateTime;->toEpochSecond()J

    .line 170
    .line 171
    .line 172
    move-result-wide v0

    .line 173
    invoke-virtual {v8}, Ljava/time/ZonedDateTime;->toLocalTime()Ljava/time/LocalTime;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    invoke-virtual {p0}, Ljava/time/LocalTime;->getNano()I

    .line 178
    .line 179
    .line 180
    move-result p0

    .line 181
    const-wide/16 v2, 0x0

    .line 182
    .line 183
    cmp-long v2, v0, v2

    .line 184
    .line 185
    const v3, 0xf4240

    .line 186
    .line 187
    .line 188
    if-gez v2, :cond_0

    .line 189
    .line 190
    if-lez p0, :cond_0

    .line 191
    .line 192
    const-wide/16 v7, 0x1

    .line 193
    .line 194
    add-long/2addr v0, v7

    .line 195
    mul-long/2addr v0, v5

    .line 196
    div-int/2addr p0, v3

    .line 197
    add-int/lit16 p0, p0, -0x3e8

    .line 198
    .line 199
    :goto_1
    int-to-long v2, p0

    .line 200
    add-long/2addr v0, v2

    .line 201
    goto :goto_2

    .line 202
    :cond_0
    mul-long/2addr v0, v5

    .line 203
    div-int/2addr p0, v3

    .line 204
    goto :goto_1

    .line 205
    :goto_2
    new-instance p0, Ljava/util/Date;

    .line 206
    .line 207
    invoke-direct {p0, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 208
    .line 209
    .line 210
    return-object p0

    .line 211
    :cond_1
    invoke-super {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏楪世哲()Ljava/util/Date;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    return-object p0

    .line 216
    nop

    .line 217
    :pswitch_data_0
    .packed-switch -0x59
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

.method public final 飘花落叶言子哲世兰楪苏()Z
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v1, v1, v0

    .line 6
    .line 7
    const/16 v2, -0x6e

    .line 8
    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    add-int/2addr v0, v1

    .line 13
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public final 飘花落叶言子哲世兰苏楪()Z
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v1, v1, v0

    .line 6
    .line 7
    const/16 v2, -0x51

    .line 8
    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    add-int/2addr v0, v1

    .line 13
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public final 飘花落叶言子哲世楪兰苏(CCCC)Z
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

.method public final 飘花落叶言子哲世楪苏兰()Z
    .locals 1

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string v0, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言子哲世苏兰楪()Z
    .locals 1

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string v0, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言子哲世苏楪兰(CCCCCC)Z
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

.method public final 飘花落叶言子哲兰苏世楪(Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 2
    .line 3
    iget-wide v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 4
    .line 5
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 6
    .line 7
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 8
    .line 9
    and-long/2addr v1, v3

    .line 10
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    cmp-long v1, v1, v3

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 22
    .line 23
    invoke-virtual {v0, p1, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const/4 v5, 0x0

    .line 28
    const-wide/16 v6, 0x0

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    move-object v3, p0

    .line 32
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public final 飘花落叶言子哲兰苏楪世(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 2
    .line 3
    iget-wide v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 4
    .line 5
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 6
    .line 7
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 8
    .line 9
    and-long/2addr v1, v3

    .line 10
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    cmp-long v1, v1, v3

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 22
    .line 23
    invoke-virtual {v0, p1, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const/4 v5, 0x0

    .line 28
    const-wide/16 v6, 0x0

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    move-object v3, p0

    .line 32
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public final 飘花落叶言子哲楪世兰苏()Z
    .locals 1

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string v0, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言子哲楪世苏兰()Z
    .locals 1

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string v0, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言子哲楪兰世苏(B)Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v1, v1, v0

    .line 6
    .line 7
    if-ne v1, p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    add-int/2addr v0, p1

    .line 11
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 12
    .line 13
    return p1

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public final 飘花落叶言子哲楪兰苏世(C)Z
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

.method public final 飘花落叶言子哲楪苏世兰()Z
    .locals 1

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string v0, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言子哲楪苏兰世()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final 飘花落叶言子哲苏世兰楪()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final 飘花落叶言子哲苏世楪兰()Z
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v1, v1, v0

    .line 6
    .line 7
    const/16 v2, -0x5a

    .line 8
    .line 9
    if-eq v1, v2, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 v1, 0x1

    .line 14
    add-int/2addr v0, v1

    .line 15
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 16
    .line 17
    return v1
.end method

.method public final 飘花落叶言子哲苏楪世兰()Z
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v1, v1, v0

    .line 6
    .line 7
    const/16 v2, -0x51

    .line 8
    .line 9
    if-eq v1, v2, :cond_0

    .line 10
    .line 11
    const/16 v2, 0x49

    .line 12
    .line 13
    if-eq v1, v2, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 v1, 0x1

    .line 18
    add-int/2addr v0, v1

    .line 19
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    return v1
.end method

.method public final 飘花落叶言子哲苏楪兰世()Z
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v1, v1, v0

    .line 6
    .line 7
    const/16 v2, -0x5b

    .line 8
    .line 9
    if-eq v1, v2, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 v1, 0x1

    .line 14
    add-int/2addr v0, v1

    .line 15
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 16
    .line 17
    return v1
.end method

.method public final 飘花落叶言子楪苏哲兰世(JJLjava/lang/Class;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;
    .locals 9

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    const/16 v3, -0x6e

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-ne v2, v3, :cond_8

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏子世兰哲()J

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    cmp-long p1, p1, v2

    .line 21
    .line 22
    iget-object p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 23
    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    invoke-virtual {p2, p5}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世苏兰哲()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    if-ne v0, p5, :cond_0

    .line 37
    .line 38
    iget-object p0, p2, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 41
    .line 42
    invoke-virtual {p0, v2, v3, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪哲世苏兰(JLcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;)V

    .line 43
    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object p1, p2, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 52
    .line 53
    iget-wide v5, p2, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 54
    .line 55
    or-long p2, v5, p3

    .line 56
    .line 57
    sget-object p4, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 58
    .line 59
    iget-wide v5, p4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 60
    .line 61
    and-long/2addr v5, p2

    .line 62
    const-wide/16 v7, 0x0

    .line 63
    .line 64
    cmp-long p4, v5, v7

    .line 65
    .line 66
    const-string v0, "autoType not support : "

    .line 67
    .line 68
    if-nez p4, :cond_2

    .line 69
    .line 70
    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNotSupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 71
    .line 72
    iget-wide p4, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 73
    .line 74
    and-long p1, p2, p4

    .line 75
    .line 76
    cmp-long p1, p1, v7

    .line 77
    .line 78
    if-nez p1, :cond_1

    .line 79
    .line 80
    goto/16 :goto_1

    .line 81
    .line 82
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-static {p0, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return-object v4

    .line 90
    :cond_2
    invoke-virtual {p1, v2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏世哲兰(J)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 91
    .line 92
    .line 93
    move-result-object p4

    .line 94
    if-eqz p4, :cond_5

    .line 95
    .line 96
    invoke-interface {p4}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世苏兰哲()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    if-eqz v2, :cond_5

    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    if-eqz v3, :cond_5

    .line 107
    .line 108
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-virtual {v5}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    if-eq v3, v5, :cond_5

    .line 117
    .line 118
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    sget-object v6, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世哲楪苏兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 123
    .line 124
    invoke-virtual {v6, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    check-cast v6, Ljava/lang/Class;

    .line 129
    .line 130
    if-nez v6, :cond_4

    .line 131
    .line 132
    if-eqz v5, :cond_3

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_3
    :try_start_0
    const-class v5, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;

    .line 136
    .line 137
    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    :goto_0
    invoke-virtual {v5, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    move-result-object v6
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 145
    :catch_0
    :cond_4
    if-eqz v6, :cond_5

    .line 146
    .line 147
    invoke-virtual {v2, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-nez v2, :cond_5

    .line 152
    .line 153
    invoke-virtual {p0, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲苏兰楪(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 154
    .line 155
    .line 156
    move-result-object p4

    .line 157
    :cond_5
    if-nez p4, :cond_7

    .line 158
    .line 159
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p4

    .line 163
    invoke-virtual {p1, p4, p5, p2, p3}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 164
    .line 165
    .line 166
    move-result-object p4

    .line 167
    if-nez p4, :cond_7

    .line 168
    .line 169
    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNotSupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 170
    .line 171
    iget-wide p4, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 172
    .line 173
    and-long p1, p2, p4

    .line 174
    .line 175
    cmp-long p1, p1, v7

    .line 176
    .line 177
    if-nez p1, :cond_6

    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    invoke-static {p0, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    return-object v4

    .line 188
    :cond_7
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 189
    .line 190
    aget-byte p1, v1, p1

    .line 191
    .line 192
    iput-byte p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰楪苏:B

    .line 193
    .line 194
    return-object p4

    .line 195
    :cond_8
    :goto_1
    return-object v4
.end method

.method public final 飘花落叶言子苏世兰哲楪()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏兰楪:I

    .line 4
    .line 5
    if-lt v0, p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final 飘花落叶言子苏世哲兰楪()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 2
    .line 3
    iget p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 4
    .line 5
    aget-byte p0, v0, p0

    .line 6
    .line 7
    const/16 v0, -0x59

    .line 8
    .line 9
    if-lt p0, v0, :cond_0

    .line 10
    .line 11
    const/16 v0, -0x52

    .line 12
    .line 13
    if-gt p0, v0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final 飘花落叶言子苏世哲楪兰()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 2
    .line 3
    iget p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 4
    .line 5
    aget-byte p0, v0, p0

    .line 6
    .line 7
    const/16 v0, -0x6f

    .line 8
    .line 9
    if-ne p0, v0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final 飘花落叶言子苏世楪兰哲()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏兰楪:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 8
    .line 9
    aget-byte p0, p0, v0

    .line 10
    .line 11
    const/16 v0, -0x6c

    .line 12
    .line 13
    if-lt p0, v0, :cond_0

    .line 14
    .line 15
    const/16 v0, -0x5c

    .line 16
    .line 17
    if-gt p0, v0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public final 飘花落叶言子苏兰哲世楪()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 6
    .line 7
    return-void
.end method

.method public final 飘花落叶言子苏兰哲楪世()Landroidx/compose/foundation/text/飘花落叶言子哲楪苏兰世;
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/foundation/text/飘花落叶言子哲楪苏兰世;

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 4
    .line 5
    iget-byte p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰楪苏:B

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, Landroidx/compose/foundation/text/飘花落叶言子哲楪苏兰世;-><init>(II)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final 飘花落叶言子苏哲世兰楪()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏兰楪:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 8
    .line 9
    aget-byte p0, p0, v0

    .line 10
    .line 11
    const/16 v0, -0x5a

    .line 12
    .line 13
    if-ne p0, v0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final 飘花落叶言子苏哲世楪兰()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 2
    .line 3
    iget p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 4
    .line 5
    aget-byte p0, v0, p0

    .line 6
    .line 7
    const/16 v0, -0x4e

    .line 8
    .line 9
    if-lt p0, v0, :cond_0

    .line 10
    .line 11
    const/16 v0, 0x48

    .line 12
    .line 13
    if-gt p0, v0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final 飘花落叶言子苏哲兰世楪()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏兰楪:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 8
    .line 9
    aget-byte v0, v1, v0

    .line 10
    .line 11
    iput-byte v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰楪苏:B

    .line 12
    .line 13
    const/16 p0, 0x49

    .line 14
    .line 15
    if-lt v0, p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public final 飘花落叶言子苏哲兰楪世()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    array-length v1, p0

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    aget-byte p0, p0, v0

    .line 9
    .line 10
    const/16 v0, -0x6d

    .line 11
    .line 12
    if-ne p0, v0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public final 飘花落叶言子苏哲楪兰世()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 2
    .line 3
    iget p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 4
    .line 5
    aget-byte p0, v0, p0

    .line 6
    .line 7
    const/16 v0, -0x46

    .line 8
    .line 9
    if-lt p0, v0, :cond_0

    .line 10
    .line 11
    const/16 v0, 0x48

    .line 12
    .line 13
    if-le p0, v0, :cond_2

    .line 14
    .line 15
    :cond_0
    const/16 v0, -0x54

    .line 16
    .line 17
    if-eq p0, v0, :cond_2

    .line 18
    .line 19
    const/16 v0, -0x53

    .line 20
    .line 21
    if-eq p0, v0, :cond_2

    .line 22
    .line 23
    const/16 v0, -0x55

    .line 24
    .line 25
    if-ne p0, v0, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 p0, 0x0

    .line 29
    return p0

    .line 30
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 31
    return p0
.end method

.method public final 飘花落叶言子苏楪哲兰世()B
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 2
    .line 3
    iget p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 4
    .line 5
    aget-byte p0, v0, p0

    .line 6
    .line 7
    return p0
.end method

.method public final 飘花落叶言楪世兰哲子苏()Ljava/lang/String;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 8
    .line 9
    iget-object v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 10
    .line 11
    aget-byte v1, v3, v1

    .line 12
    .line 13
    iput-byte v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪苏哲:B

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    const/16 v5, -0x51

    .line 17
    .line 18
    if-ne v1, v5, :cond_0

    .line 19
    .line 20
    move-object/from16 v19, v4

    .line 21
    .line 22
    goto/16 :goto_10

    .line 23
    .line 24
    :cond_0
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 25
    .line 26
    iget-object v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    const/16 v8, 0x79

    .line 30
    .line 31
    const/16 v9, 0x49

    .line 32
    .line 33
    const/4 v10, 0x1

    .line 34
    if-lt v1, v9, :cond_5

    .line 35
    .line 36
    if-gt v1, v8, :cond_5

    .line 37
    .line 38
    if-ne v1, v8, :cond_2

    .line 39
    .line 40
    aget-byte v1, v3, v2

    .line 41
    .line 42
    invoke-static {v1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(I)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 49
    .line 50
    add-int/2addr v2, v10

    .line 51
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    :goto_0
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 59
    .line 60
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    sub-int/2addr v1, v9

    .line 64
    :goto_1
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 65
    .line 66
    if-ltz v1, :cond_4

    .line 67
    .line 68
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世哲苏:Ljava/util/function/BiFunction;

    .line 69
    .line 70
    if-eqz v2, :cond_3

    .line 71
    .line 72
    new-array v11, v1, [B

    .line 73
    .line 74
    iget v12, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 75
    .line 76
    invoke-static {v3, v12, v11, v7, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 77
    .line 78
    .line 79
    invoke-static {v7}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 80
    .line 81
    .line 82
    move-result-object v12

    .line 83
    invoke-interface {v2, v11, v12}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, Ljava/lang/String;

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世苏哲:Ljava/util/function/BiFunction;

    .line 91
    .line 92
    if-eqz v2, :cond_4

    .line 93
    .line 94
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 95
    .line 96
    invoke-static {v2, v3, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰(I[BI)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    goto :goto_2

    .line 101
    :cond_4
    move-object v2, v4

    .line 102
    :goto_2
    if-eqz v2, :cond_5

    .line 103
    .line 104
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 105
    .line 106
    add-int/2addr v3, v1

    .line 107
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 108
    .line 109
    iget-wide v0, v6, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 110
    .line 111
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世兰哲子(JLjava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    return-object v0

    .line 116
    :cond_5
    invoke-static {v10}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    iget-byte v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪苏哲:B

    .line 121
    .line 122
    const/16 v11, -0x20

    .line 123
    .line 124
    const/16 v12, 0x8

    .line 125
    .line 126
    const/4 v13, -0x1

    .line 127
    const/16 v14, 0x2000

    .line 128
    .line 129
    iget-object v15, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰苏哲楪:Lcom/alibaba/fastjson2/飘花落叶言子楪世兰哲苏;

    .line 130
    .line 131
    move/from16 v16, v10

    .line 132
    .line 133
    const/16 v10, 0x7a

    .line 134
    .line 135
    const-wide/16 v17, 0x0

    .line 136
    .line 137
    if-lt v2, v9, :cond_6

    .line 138
    .line 139
    if-gt v2, v8, :cond_6

    .line 140
    .line 141
    sget-object v1, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 142
    .line 143
    goto/16 :goto_8

    .line 144
    .line 145
    :cond_6
    if-ne v2, v10, :cond_e

    .line 146
    .line 147
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 148
    .line 149
    aget-byte v2, v3, v2

    .line 150
    .line 151
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(I)Z

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    if-eqz v5, :cond_7

    .line 156
    .line 157
    iget v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 158
    .line 159
    add-int/lit8 v5, v5, 0x1

    .line 160
    .line 161
    iput v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 162
    .line 163
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_7
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(I)Z

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    if-eqz v5, :cond_8

    .line 171
    .line 172
    iget v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 173
    .line 174
    add-int/lit8 v5, v5, 0x1

    .line 175
    .line 176
    invoke-static {v5, v3, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰子哲世(I[BI)I

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 181
    .line 182
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 183
    .line 184
    add-int/lit8 v2, v2, 0x2

    .line 185
    .line 186
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_8
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 194
    .line 195
    :goto_3
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 196
    .line 197
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 198
    .line 199
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世哲苏:Ljava/util/function/BiFunction;

    .line 200
    .line 201
    if-eqz v2, :cond_c

    .line 202
    .line 203
    sget-boolean v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰苏世:Z

    .line 204
    .line 205
    if-nez v5, :cond_c

    .line 206
    .line 207
    iget-object v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰苏楪哲:[B

    .line 208
    .line 209
    if-nez v5, :cond_9

    .line 210
    .line 211
    sget-object v5, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世哲苏:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 212
    .line 213
    invoke-virtual {v5, v15, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    check-cast v5, [B

    .line 218
    .line 219
    iput-object v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰苏楪哲:[B

    .line 220
    .line 221
    if-nez v5, :cond_9

    .line 222
    .line 223
    new-array v5, v14, [B

    .line 224
    .line 225
    iput-object v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰苏楪哲:[B

    .line 226
    .line 227
    :cond_9
    iget v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 228
    .line 229
    shl-int/lit8 v8, v5, 0x1

    .line 230
    .line 231
    iget-object v9, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰苏楪哲:[B

    .line 232
    .line 233
    array-length v9, v9

    .line 234
    if-le v8, v9, :cond_a

    .line 235
    .line 236
    new-array v8, v8, [B

    .line 237
    .line 238
    iput-object v8, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰苏楪哲:[B

    .line 239
    .line 240
    :cond_a
    iget v8, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 241
    .line 242
    iget-object v9, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰苏楪哲:[B

    .line 243
    .line 244
    invoke-static {v8, v5, v3, v9}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲(II[B[B)I

    .line 245
    .line 246
    .line 247
    move-result v5

    .line 248
    if-eq v5, v13, :cond_c

    .line 249
    .line 250
    new-array v8, v5, [B

    .line 251
    .line 252
    iget-object v9, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰苏楪哲:[B

    .line 253
    .line 254
    invoke-static {v9, v7, v8, v7, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 255
    .line 256
    .line 257
    invoke-interface {v2, v8, v1}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    check-cast v1, Ljava/lang/String;

    .line 262
    .line 263
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 264
    .line 265
    iget v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 266
    .line 267
    add-int/2addr v2, v5

    .line 268
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 269
    .line 270
    iget-wide v8, v6, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 271
    .line 272
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->TrimString:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 273
    .line 274
    iget-wide v4, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 275
    .line 276
    and-long/2addr v4, v8

    .line 277
    cmp-long v2, v4, v17

    .line 278
    .line 279
    if-eqz v2, :cond_b

    .line 280
    .line 281
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    :cond_b
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    if-eqz v2, :cond_d

    .line 290
    .line 291
    iget-wide v4, v6, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 292
    .line 293
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->EmptyStringAsNull:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 294
    .line 295
    iget-wide v8, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 296
    .line 297
    and-long/2addr v4, v8

    .line 298
    cmp-long v2, v4, v17

    .line 299
    .line 300
    if-eqz v2, :cond_d

    .line 301
    .line 302
    :cond_c
    const/4 v1, 0x0

    .line 303
    :cond_d
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 304
    .line 305
    :goto_4
    move-object v4, v1

    .line 306
    move-object v1, v2

    .line 307
    goto/16 :goto_8

    .line 308
    .line 309
    :cond_e
    const/16 v4, 0x7b

    .line 310
    .line 311
    if-ne v2, v4, :cond_f

    .line 312
    .line 313
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 314
    .line 315
    .line 316
    move-result v1

    .line 317
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 318
    .line 319
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 320
    .line 321
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 322
    .line 323
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_16:Ljava/nio/charset/Charset;

    .line 324
    .line 325
    :goto_5
    const/4 v4, 0x0

    .line 326
    goto/16 :goto_8

    .line 327
    .line 328
    :cond_f
    const/16 v4, 0x7c

    .line 329
    .line 330
    if-ne v2, v4, :cond_16

    .line 331
    .line 332
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 333
    .line 334
    aget-byte v2, v3, v2

    .line 335
    .line 336
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(I)Z

    .line 337
    .line 338
    .line 339
    move-result v4

    .line 340
    if-eqz v4, :cond_10

    .line 341
    .line 342
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 343
    .line 344
    add-int/lit8 v4, v4, 0x1

    .line 345
    .line 346
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 347
    .line 348
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 349
    .line 350
    goto :goto_6

    .line 351
    :cond_10
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(I)Z

    .line 352
    .line 353
    .line 354
    move-result v4

    .line 355
    if-eqz v4, :cond_11

    .line 356
    .line 357
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 358
    .line 359
    add-int/lit8 v4, v4, 0x1

    .line 360
    .line 361
    invoke-static {v4, v3, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰子哲世(I[BI)I

    .line 362
    .line 363
    .line 364
    move-result v2

    .line 365
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 366
    .line 367
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 368
    .line 369
    add-int/lit8 v2, v2, 0x2

    .line 370
    .line 371
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 372
    .line 373
    goto :goto_6

    .line 374
    :cond_11
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 375
    .line 376
    .line 377
    move-result v2

    .line 378
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 379
    .line 380
    :goto_6
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 381
    .line 382
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 383
    .line 384
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 385
    .line 386
    if-nez v4, :cond_12

    .line 387
    .line 388
    const-string v1, ""

    .line 389
    .line 390
    goto :goto_7

    .line 391
    :cond_12
    sget-object v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世哲苏:Ljava/util/function/BiFunction;

    .line 392
    .line 393
    if-eqz v5, :cond_14

    .line 394
    .line 395
    sget-boolean v8, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰苏世:Z

    .line 396
    .line 397
    if-nez v8, :cond_14

    .line 398
    .line 399
    new-array v8, v4, [B

    .line 400
    .line 401
    invoke-static {v3, v2, v8, v7, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 402
    .line 403
    .line 404
    invoke-interface {v5, v8, v1}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    check-cast v1, Ljava/lang/String;

    .line 409
    .line 410
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 411
    .line 412
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 413
    .line 414
    add-int/2addr v2, v4

    .line 415
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 416
    .line 417
    iget-wide v4, v6, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 418
    .line 419
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->TrimString:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 420
    .line 421
    iget-wide v8, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 422
    .line 423
    and-long/2addr v4, v8

    .line 424
    cmp-long v2, v4, v17

    .line 425
    .line 426
    if-eqz v2, :cond_13

    .line 427
    .line 428
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    :cond_13
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 433
    .line 434
    .line 435
    move-result v2

    .line 436
    if-eqz v2, :cond_15

    .line 437
    .line 438
    iget-wide v4, v6, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 439
    .line 440
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->EmptyStringAsNull:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 441
    .line 442
    iget-wide v8, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 443
    .line 444
    and-long/2addr v4, v8

    .line 445
    cmp-long v2, v4, v17

    .line 446
    .line 447
    if-eqz v2, :cond_15

    .line 448
    .line 449
    :cond_14
    const/4 v1, 0x0

    .line 450
    :cond_15
    :goto_7
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 451
    .line 452
    goto/16 :goto_4

    .line 453
    .line 454
    :cond_16
    const/16 v4, 0x7d

    .line 455
    .line 456
    if-ne v2, v4, :cond_1b

    .line 457
    .line 458
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 459
    .line 460
    .line 461
    move-result v2

    .line 462
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 463
    .line 464
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 465
    .line 466
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 467
    .line 468
    sget-object v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世哲苏:Ljava/util/function/BiFunction;

    .line 469
    .line 470
    if-eqz v5, :cond_18

    .line 471
    .line 472
    sget-boolean v8, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰苏世:Z

    .line 473
    .line 474
    if-eqz v8, :cond_18

    .line 475
    .line 476
    new-array v8, v2, [B

    .line 477
    .line 478
    invoke-static {v3, v4, v8, v7, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 479
    .line 480
    .line 481
    invoke-interface {v5, v8, v1}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v1

    .line 485
    check-cast v1, Ljava/lang/String;

    .line 486
    .line 487
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 488
    .line 489
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 490
    .line 491
    add-int/2addr v2, v4

    .line 492
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 493
    .line 494
    iget-wide v4, v6, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 495
    .line 496
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->TrimString:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 497
    .line 498
    iget-wide v8, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 499
    .line 500
    and-long/2addr v4, v8

    .line 501
    cmp-long v2, v4, v17

    .line 502
    .line 503
    if-eqz v2, :cond_17

    .line 504
    .line 505
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v1

    .line 509
    :cond_17
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 510
    .line 511
    .line 512
    move-result v2

    .line 513
    if-eqz v2, :cond_19

    .line 514
    .line 515
    iget-wide v4, v6, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 516
    .line 517
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->EmptyStringAsNull:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 518
    .line 519
    iget-wide v8, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 520
    .line 521
    and-long/2addr v4, v8

    .line 522
    cmp-long v2, v4, v17

    .line 523
    .line 524
    if-eqz v2, :cond_19

    .line 525
    .line 526
    :cond_18
    const/4 v1, 0x0

    .line 527
    :cond_19
    if-eqz v1, :cond_1a

    .line 528
    .line 529
    return-object v1

    .line 530
    :cond_1a
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_16BE:Ljava/nio/charset/Charset;

    .line 531
    .line 532
    goto/16 :goto_4

    .line 533
    .line 534
    :cond_1b
    const/16 v1, 0x7e

    .line 535
    .line 536
    if-ne v2, v1, :cond_33

    .line 537
    .line 538
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 539
    .line 540
    .line 541
    move-result v1

    .line 542
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 543
    .line 544
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 545
    .line 546
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 547
    .line 548
    sget-object v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪兰哲世:Ljava/nio/charset/Charset;

    .line 549
    .line 550
    if-nez v1, :cond_1c

    .line 551
    .line 552
    const-string v1, "GB18030"

    .line 553
    .line 554
    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 555
    .line 556
    .line 557
    move-result-object v1

    .line 558
    sput-object v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪兰哲世:Ljava/nio/charset/Charset;

    .line 559
    .line 560
    :cond_1c
    sget-object v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪兰哲世:Ljava/nio/charset/Charset;

    .line 561
    .line 562
    goto/16 :goto_5

    .line 563
    .line 564
    :goto_8
    if-eqz v4, :cond_20

    .line 565
    .line 566
    iget-wide v0, v6, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 567
    .line 568
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->TrimString:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 569
    .line 570
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 571
    .line 572
    and-long/2addr v0, v2

    .line 573
    cmp-long v0, v0, v17

    .line 574
    .line 575
    if-eqz v0, :cond_1d

    .line 576
    .line 577
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v4

    .line 581
    :cond_1d
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 582
    .line 583
    .line 584
    move-result v0

    .line 585
    if-eqz v0, :cond_1f

    .line 586
    .line 587
    iget-wide v0, v6, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 588
    .line 589
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->EmptyStringAsNull:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 590
    .line 591
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 592
    .line 593
    and-long/2addr v0, v2

    .line 594
    cmp-long v0, v0, v17

    .line 595
    .line 596
    if-eqz v0, :cond_1f

    .line 597
    .line 598
    :cond_1e
    :goto_9
    const/16 v19, 0x0

    .line 599
    .line 600
    goto/16 :goto_10

    .line 601
    .line 602
    :cond_1f
    return-object v4

    .line 603
    :cond_20
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 604
    .line 605
    if-ltz v2, :cond_32

    .line 606
    .line 607
    sget v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏:I

    .line 608
    .line 609
    if-ne v4, v12, :cond_21

    .line 610
    .line 611
    iget-byte v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪苏哲:B

    .line 612
    .line 613
    if-ne v4, v10, :cond_21

    .line 614
    .line 615
    if-ge v2, v14, :cond_21

    .line 616
    .line 617
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 618
    .line 619
    .line 620
    move-result-object v2

    .line 621
    invoke-static {v2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 622
    .line 623
    .line 624
    move-result v2

    .line 625
    sget-object v4, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰苏世:[Lcom/alibaba/fastjson2/飘花落叶言子楪世兰哲苏;

    .line 626
    .line 627
    array-length v5, v4

    .line 628
    add-int/lit8 v5, v5, -0x1

    .line 629
    .line 630
    and-int/2addr v2, v5

    .line 631
    aget-object v2, v4, v2

    .line 632
    .line 633
    sget-object v4, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世苏哲:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 634
    .line 635
    const/4 v5, 0x0

    .line 636
    invoke-virtual {v4, v2, v5}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    move-result-object v2

    .line 640
    check-cast v2, [C

    .line 641
    .line 642
    if-nez v2, :cond_22

    .line 643
    .line 644
    new-array v2, v14, [C

    .line 645
    .line 646
    goto :goto_a

    .line 647
    :cond_21
    const/4 v2, 0x0

    .line 648
    :cond_22
    :goto_a
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 649
    .line 650
    iget v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 651
    .line 652
    if-eqz v2, :cond_2e

    .line 653
    .line 654
    sget-short v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:S

    .line 655
    .line 656
    add-int v1, v4, v5

    .line 657
    .line 658
    array-length v8, v2

    .line 659
    invoke-static {v5, v8}, Ljava/lang/Math;->min(II)I

    .line 660
    .line 661
    .line 662
    move-result v5

    .line 663
    move v8, v7

    .line 664
    :goto_b
    if-ge v8, v5, :cond_23

    .line 665
    .line 666
    aget-byte v9, v3, v4

    .line 667
    .line 668
    if-ltz v9, :cond_23

    .line 669
    .line 670
    add-int/lit8 v10, v8, 0x1

    .line 671
    .line 672
    add-int/lit8 v4, v4, 0x1

    .line 673
    .line 674
    int-to-char v9, v9

    .line 675
    aput-char v9, v2, v8

    .line 676
    .line 677
    move v8, v10

    .line 678
    goto :goto_b

    .line 679
    :cond_23
    :goto_c
    if-ge v4, v1, :cond_2c

    .line 680
    .line 681
    add-int/lit8 v5, v4, 0x1

    .line 682
    .line 683
    aget-byte v9, v3, v4

    .line 684
    .line 685
    if-ltz v9, :cond_24

    .line 686
    .line 687
    add-int/lit8 v4, v8, 0x1

    .line 688
    .line 689
    int-to-char v9, v9

    .line 690
    aput-char v9, v2, v8

    .line 691
    .line 692
    move v8, v4

    .line 693
    move v4, v5

    .line 694
    goto :goto_c

    .line 695
    :cond_24
    shr-int/lit8 v10, v9, 0x5

    .line 696
    .line 697
    const/4 v12, -0x2

    .line 698
    const/16 v14, 0x80

    .line 699
    .line 700
    if-ne v10, v12, :cond_26

    .line 701
    .line 702
    and-int/lit8 v10, v9, 0x1e

    .line 703
    .line 704
    if-eqz v10, :cond_26

    .line 705
    .line 706
    if-ge v5, v1, :cond_2d

    .line 707
    .line 708
    add-int/lit8 v4, v4, 0x2

    .line 709
    .line 710
    aget-byte v5, v3, v5

    .line 711
    .line 712
    and-int/lit16 v10, v5, 0xc0

    .line 713
    .line 714
    if-eq v10, v14, :cond_25

    .line 715
    .line 716
    goto/16 :goto_d

    .line 717
    .line 718
    :cond_25
    add-int/lit8 v10, v8, 0x1

    .line 719
    .line 720
    shl-int/lit8 v9, v9, 0x6

    .line 721
    .line 722
    xor-int/2addr v5, v9

    .line 723
    xor-int/lit16 v5, v5, 0xf80

    .line 724
    .line 725
    int-to-char v5, v5

    .line 726
    aput-char v5, v2, v8

    .line 727
    .line 728
    move v8, v10

    .line 729
    goto :goto_c

    .line 730
    :cond_26
    shr-int/lit8 v10, v9, 0x4

    .line 731
    .line 732
    if-ne v10, v12, :cond_2a

    .line 733
    .line 734
    add-int/lit8 v10, v4, 0x2

    .line 735
    .line 736
    if-ge v10, v1, :cond_2d

    .line 737
    .line 738
    aget-byte v5, v3, v5

    .line 739
    .line 740
    aget-byte v10, v3, v10

    .line 741
    .line 742
    add-int/lit8 v4, v4, 0x3

    .line 743
    .line 744
    if-ne v9, v11, :cond_27

    .line 745
    .line 746
    and-int/lit16 v12, v5, 0xe0

    .line 747
    .line 748
    if-eq v12, v14, :cond_2d

    .line 749
    .line 750
    :cond_27
    and-int/lit16 v12, v5, 0xc0

    .line 751
    .line 752
    if-ne v12, v14, :cond_2d

    .line 753
    .line 754
    and-int/lit16 v12, v10, 0xc0

    .line 755
    .line 756
    if-eq v12, v14, :cond_28

    .line 757
    .line 758
    goto/16 :goto_d

    .line 759
    .line 760
    :cond_28
    shl-int/lit8 v9, v9, 0xc

    .line 761
    .line 762
    shl-int/lit8 v5, v5, 0x6

    .line 763
    .line 764
    xor-int/2addr v5, v9

    .line 765
    const v9, -0x1e080

    .line 766
    .line 767
    .line 768
    xor-int/2addr v9, v10

    .line 769
    xor-int/2addr v5, v9

    .line 770
    int-to-char v5, v5

    .line 771
    const v9, 0xd800

    .line 772
    .line 773
    .line 774
    if-lt v5, v9, :cond_29

    .line 775
    .line 776
    const v9, 0xe000

    .line 777
    .line 778
    .line 779
    if-ge v5, v9, :cond_29

    .line 780
    .line 781
    goto :goto_d

    .line 782
    :cond_29
    add-int/lit8 v9, v8, 0x1

    .line 783
    .line 784
    aput-char v5, v2, v8

    .line 785
    .line 786
    move v8, v9

    .line 787
    goto :goto_c

    .line 788
    :cond_2a
    shr-int/lit8 v10, v9, 0x3

    .line 789
    .line 790
    if-ne v10, v12, :cond_2d

    .line 791
    .line 792
    add-int/lit8 v10, v4, 0x3

    .line 793
    .line 794
    if-ge v10, v1, :cond_2d

    .line 795
    .line 796
    aget-byte v5, v3, v5

    .line 797
    .line 798
    add-int/lit8 v12, v4, 0x2

    .line 799
    .line 800
    aget-byte v12, v3, v12

    .line 801
    .line 802
    aget-byte v10, v3, v10

    .line 803
    .line 804
    add-int/lit8 v4, v4, 0x4

    .line 805
    .line 806
    shl-int/lit8 v9, v9, 0x12

    .line 807
    .line 808
    shl-int/lit8 v16, v5, 0xc

    .line 809
    .line 810
    xor-int v9, v9, v16

    .line 811
    .line 812
    shl-int/lit8 v16, v12, 0x6

    .line 813
    .line 814
    xor-int v9, v9, v16

    .line 815
    .line 816
    const v16, 0x381f80

    .line 817
    .line 818
    .line 819
    xor-int v16, v10, v16

    .line 820
    .line 821
    xor-int v9, v9, v16

    .line 822
    .line 823
    and-int/lit16 v5, v5, 0xc0

    .line 824
    .line 825
    if-ne v5, v14, :cond_2d

    .line 826
    .line 827
    and-int/lit16 v5, v12, 0xc0

    .line 828
    .line 829
    if-ne v5, v14, :cond_2d

    .line 830
    .line 831
    and-int/lit16 v5, v10, 0xc0

    .line 832
    .line 833
    if-ne v5, v14, :cond_2d

    .line 834
    .line 835
    const/high16 v5, 0x10000

    .line 836
    .line 837
    if-lt v9, v5, :cond_2d

    .line 838
    .line 839
    const/high16 v5, 0x110000

    .line 840
    .line 841
    if-lt v9, v5, :cond_2b

    .line 842
    .line 843
    goto :goto_d

    .line 844
    :cond_2b
    ushr-int/lit8 v5, v9, 0xa

    .line 845
    .line 846
    const v10, 0xd7c0

    .line 847
    .line 848
    .line 849
    add-int/2addr v5, v10

    .line 850
    int-to-char v5, v5

    .line 851
    aput-char v5, v2, v8

    .line 852
    .line 853
    add-int/lit8 v5, v8, 0x1

    .line 854
    .line 855
    and-int/lit16 v9, v9, 0x3ff

    .line 856
    .line 857
    const v10, 0xdc00

    .line 858
    .line 859
    .line 860
    add-int/2addr v9, v10

    .line 861
    int-to-char v9, v9

    .line 862
    aput-char v9, v2, v5

    .line 863
    .line 864
    add-int/lit8 v8, v8, 0x2

    .line 865
    .line 866
    goto/16 :goto_c

    .line 867
    .line 868
    :cond_2c
    move v13, v8

    .line 869
    :cond_2d
    :goto_d
    new-instance v1, Ljava/lang/String;

    .line 870
    .line 871
    invoke-direct {v1, v2, v7, v13}, Ljava/lang/String;-><init>([CII)V

    .line 872
    .line 873
    .line 874
    array-length v3, v2

    .line 875
    const/high16 v4, 0x800000

    .line 876
    .line 877
    if-ge v3, v4, :cond_2f

    .line 878
    .line 879
    sget-object v3, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世苏哲:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 880
    .line 881
    invoke-virtual {v3, v15, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 882
    .line 883
    .line 884
    goto :goto_e

    .line 885
    :cond_2e
    new-instance v2, Ljava/lang/String;

    .line 886
    .line 887
    invoke-direct {v2, v3, v4, v5, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 888
    .line 889
    .line 890
    move-object v1, v2

    .line 891
    :cond_2f
    :goto_e
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 892
    .line 893
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 894
    .line 895
    add-int/2addr v2, v3

    .line 896
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 897
    .line 898
    iget-wide v2, v6, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 899
    .line 900
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->TrimString:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 901
    .line 902
    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 903
    .line 904
    and-long/2addr v2, v4

    .line 905
    cmp-long v0, v2, v17

    .line 906
    .line 907
    if-eqz v0, :cond_30

    .line 908
    .line 909
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 910
    .line 911
    .line 912
    move-result-object v1

    .line 913
    :cond_30
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 914
    .line 915
    .line 916
    move-result v0

    .line 917
    if-eqz v0, :cond_31

    .line 918
    .line 919
    iget-wide v2, v6, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 920
    .line 921
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->EmptyStringAsNull:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 922
    .line 923
    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 924
    .line 925
    and-long/2addr v2, v4

    .line 926
    cmp-long v0, v2, v17

    .line 927
    .line 928
    if-eqz v0, :cond_31

    .line 929
    .line 930
    goto/16 :goto_9

    .line 931
    .line 932
    :cond_31
    return-object v1

    .line 933
    :cond_32
    const/16 v19, 0x0

    .line 934
    .line 935
    throw v19

    .line 936
    :cond_33
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(I)Z

    .line 937
    .line 938
    .line 939
    move-result v1

    .line 940
    if-eqz v1, :cond_34

    .line 941
    .line 942
    invoke-static {v2}, Ljava/lang/Byte;->toString(B)Ljava/lang/String;

    .line 943
    .line 944
    .line 945
    move-result-object v0

    .line 946
    return-object v0

    .line 947
    :cond_34
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(I)Z

    .line 948
    .line 949
    .line 950
    move-result v1

    .line 951
    if-eqz v1, :cond_35

    .line 952
    .line 953
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 954
    .line 955
    add-int/lit8 v4, v1, 0x1

    .line 956
    .line 957
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 958
    .line 959
    invoke-static {v1, v3, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰子哲世(I[BI)I

    .line 960
    .line 961
    .line 962
    move-result v0

    .line 963
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 964
    .line 965
    .line 966
    move-result-object v0

    .line 967
    return-object v0

    .line 968
    :cond_35
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(I)Z

    .line 969
    .line 970
    .line 971
    move-result v1

    .line 972
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏兰楪:I

    .line 973
    .line 974
    if-eqz v1, :cond_36

    .line 975
    .line 976
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 977
    .line 978
    add-int/lit8 v6, v1, 0x1

    .line 979
    .line 980
    if-ge v6, v4, :cond_36

    .line 981
    .line 982
    invoke-static {v1, v3, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰子世哲(I[BI)I

    .line 983
    .line 984
    .line 985
    move-result v1

    .line 986
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 987
    .line 988
    add-int/lit8 v2, v2, 0x2

    .line 989
    .line 990
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 991
    .line 992
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 993
    .line 994
    .line 995
    move-result-object v0

    .line 996
    return-object v0

    .line 997
    :cond_36
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(I)Z

    .line 998
    .line 999
    .line 1000
    move-result v1

    .line 1001
    if-eqz v1, :cond_37

    .line 1002
    .line 1003
    sub-int/2addr v2, v11

    .line 1004
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v0

    .line 1008
    return-object v0

    .line 1009
    :cond_37
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(I)Z

    .line 1010
    .line 1011
    .line 1012
    move-result v1

    .line 1013
    if-eqz v1, :cond_38

    .line 1014
    .line 1015
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1016
    .line 1017
    add-int/lit8 v4, v1, 0x1

    .line 1018
    .line 1019
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1020
    .line 1021
    invoke-static {v1, v3, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰世哲子(I[BI)I

    .line 1022
    .line 1023
    .line 1024
    move-result v0

    .line 1025
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v0

    .line 1029
    return-object v0

    .line 1030
    :cond_38
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲(I)Z

    .line 1031
    .line 1032
    .line 1033
    move-result v1

    .line 1034
    if-eqz v1, :cond_39

    .line 1035
    .line 1036
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1037
    .line 1038
    add-int/lit8 v6, v1, 0x1

    .line 1039
    .line 1040
    if-ge v6, v4, :cond_39

    .line 1041
    .line 1042
    invoke-static {v1, v3, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰世子哲(I[BI)I

    .line 1043
    .line 1044
    .line 1045
    move-result v1

    .line 1046
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1047
    .line 1048
    add-int/lit8 v2, v2, 0x2

    .line 1049
    .line 1050
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1051
    .line 1052
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v0

    .line 1056
    return-object v0

    .line 1057
    :cond_39
    const/16 v1, -0x6e

    .line 1058
    .line 1059
    if-eq v2, v1, :cond_3d

    .line 1060
    .line 1061
    if-eq v2, v5, :cond_1e

    .line 1062
    .line 1063
    const/16 v1, 0x48

    .line 1064
    .line 1065
    if-eq v2, v1, :cond_3c

    .line 1066
    .line 1067
    const/16 v1, -0x42

    .line 1068
    .line 1069
    if-eq v2, v1, :cond_3b

    .line 1070
    .line 1071
    const/16 v1, -0x41

    .line 1072
    .line 1073
    if-eq v2, v1, :cond_3c

    .line 1074
    .line 1075
    packed-switch v2, :pswitch_data_0

    .line 1076
    .line 1077
    .line 1078
    packed-switch v2, :pswitch_data_1

    .line 1079
    .line 1080
    .line 1081
    iget-byte v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪苏哲:B

    .line 1082
    .line 1083
    invoke-static {v1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(B)Ljava/lang/String;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v1

    .line 1087
    iget v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1088
    .line 1089
    array-length v2, v3

    .line 1090
    const-string v3, "readString not support type "

    .line 1091
    .line 1092
    invoke-static {v3, v1, v0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;Ljava/lang/Object;II)V

    .line 1093
    .line 1094
    .line 1095
    const/16 v19, 0x0

    .line 1096
    .line 1097
    return-object v19

    .line 1098
    :pswitch_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 1099
    .line 1100
    .line 1101
    move-result v1

    .line 1102
    new-array v2, v1, [B

    .line 1103
    .line 1104
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1105
    .line 1106
    invoke-static {v3, v4, v2, v7, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1107
    .line 1108
    .line 1109
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1110
    .line 1111
    add-int/2addr v3, v1

    .line 1112
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1113
    .line 1114
    new-instance v0, Ljava/math/BigInteger;

    .line 1115
    .line 1116
    invoke-direct {v0, v2}, Ljava/math/BigInteger;-><init>([B)V

    .line 1117
    .line 1118
    .line 1119
    invoke-virtual {v0}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v0

    .line 1123
    return-object v0

    .line 1124
    :pswitch_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 1125
    .line 1126
    .line 1127
    move-result v1

    .line 1128
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰世楪哲苏()Ljava/math/BigInteger;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v0

    .line 1132
    if-nez v1, :cond_3a

    .line 1133
    .line 1134
    new-instance v1, Ljava/math/BigDecimal;

    .line 1135
    .line 1136
    invoke-direct {v1, v0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 1137
    .line 1138
    .line 1139
    goto :goto_f

    .line 1140
    :cond_3a
    new-instance v2, Ljava/math/BigDecimal;

    .line 1141
    .line 1142
    invoke-direct {v2, v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 1143
    .line 1144
    .line 1145
    move-object v1, v2

    .line 1146
    :goto_f
    invoke-virtual {v1}, Ljava/math/BigDecimal;->toString()Ljava/lang/String;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v0

    .line 1150
    return-object v0

    .line 1151
    :pswitch_2
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世兰苏哲()J

    .line 1152
    .line 1153
    .line 1154
    move-result-wide v0

    .line 1155
    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v0

    .line 1159
    return-object v0

    .line 1160
    :pswitch_3
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1161
    .line 1162
    invoke-static {v1, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 1163
    .line 1164
    .line 1165
    invoke-static {v3, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 1166
    .line 1167
    .line 1168
    move-result v1

    .line 1169
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1170
    .line 1171
    add-int/lit8 v2, v2, 0x4

    .line 1172
    .line 1173
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1174
    .line 1175
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1176
    .line 1177
    .line 1178
    move-result v0

    .line 1179
    invoke-static {v0}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v0

    .line 1183
    return-object v0

    .line 1184
    :pswitch_4
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 1185
    .line 1186
    .line 1187
    move-result v0

    .line 1188
    int-to-float v0, v0

    .line 1189
    invoke-static {v0}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v0

    .line 1193
    return-object v0

    .line 1194
    :pswitch_5
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1195
    .line 1196
    invoke-static {v1, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲兰子世(II)V

    .line 1197
    .line 1198
    .line 1199
    invoke-static {v3, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲([BI)J

    .line 1200
    .line 1201
    .line 1202
    move-result-wide v1

    .line 1203
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1204
    .line 1205
    add-int/2addr v3, v12

    .line 1206
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1207
    .line 1208
    invoke-static {v1, v2}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 1209
    .line 1210
    .line 1211
    move-result-wide v0

    .line 1212
    invoke-static {v0, v1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v0

    .line 1216
    return-object v0

    .line 1217
    :pswitch_6
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世兰苏哲()J

    .line 1218
    .line 1219
    .line 1220
    move-result-wide v0

    .line 1221
    long-to-double v0, v0

    .line 1222
    invoke-static {v0, v1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v0

    .line 1226
    return-object v0

    .line 1227
    :pswitch_7
    const-string v0, "1.0"

    .line 1228
    .line 1229
    return-object v0

    .line 1230
    :pswitch_8
    const-string v0, "0.0"

    .line 1231
    .line 1232
    return-object v0

    .line 1233
    :pswitch_9
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1234
    .line 1235
    invoke-static {v1, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 1236
    .line 1237
    .line 1238
    invoke-static {v3, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 1239
    .line 1240
    .line 1241
    move-result v1

    .line 1242
    int-to-long v1, v1

    .line 1243
    const-wide/32 v3, 0xea60

    .line 1244
    .line 1245
    .line 1246
    mul-long/2addr v1, v3

    .line 1247
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1248
    .line 1249
    add-int/lit8 v3, v3, 0x4

    .line 1250
    .line 1251
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1252
    .line 1253
    new-instance v0, Ljava/util/Date;

    .line 1254
    .line 1255
    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 1256
    .line 1257
    .line 1258
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 1259
    .line 1260
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 1261
    .line 1262
    .line 1263
    move-result-wide v0

    .line 1264
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 1265
    .line 1266
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏哲世兰楪(JLjava/time/ZoneId;)Ljava/lang/String;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v0

    .line 1270
    return-object v0

    .line 1271
    :pswitch_a
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1272
    .line 1273
    invoke-static {v1, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 1274
    .line 1275
    .line 1276
    invoke-static {v3, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 1277
    .line 1278
    .line 1279
    move-result v1

    .line 1280
    int-to-long v1, v1

    .line 1281
    const-wide/16 v3, 0x3e8

    .line 1282
    .line 1283
    mul-long/2addr v1, v3

    .line 1284
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1285
    .line 1286
    add-int/lit8 v3, v3, 0x4

    .line 1287
    .line 1288
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1289
    .line 1290
    new-instance v0, Ljava/util/Date;

    .line 1291
    .line 1292
    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 1293
    .line 1294
    .line 1295
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 1296
    .line 1297
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 1298
    .line 1299
    .line 1300
    move-result-wide v0

    .line 1301
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 1302
    .line 1303
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏哲世兰楪(JLjava/time/ZoneId;)Ljava/lang/String;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v0

    .line 1307
    return-object v0

    .line 1308
    :pswitch_b
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1309
    .line 1310
    invoke-static {v1, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲兰子世(II)V

    .line 1311
    .line 1312
    .line 1313
    invoke-static {v3, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲([BI)J

    .line 1314
    .line 1315
    .line 1316
    move-result-wide v1

    .line 1317
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1318
    .line 1319
    add-int/2addr v3, v12

    .line 1320
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1321
    .line 1322
    new-instance v0, Ljava/util/Date;

    .line 1323
    .line 1324
    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 1325
    .line 1326
    .line 1327
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 1328
    .line 1329
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 1330
    .line 1331
    .line 1332
    move-result-wide v0

    .line 1333
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 1334
    .line 1335
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏哲世兰楪(JLjava/time/ZoneId;)Ljava/lang/String;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v0

    .line 1339
    return-object v0

    .line 1340
    :cond_3b
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1341
    .line 1342
    invoke-static {v1, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲兰子世(II)V

    .line 1343
    .line 1344
    .line 1345
    invoke-static {v3, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲([BI)J

    .line 1346
    .line 1347
    .line 1348
    move-result-wide v1

    .line 1349
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1350
    .line 1351
    add-int/2addr v3, v12

    .line 1352
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1353
    .line 1354
    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v0

    .line 1358
    return-object v0

    .line 1359
    :cond_3c
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1360
    .line 1361
    invoke-static {v1, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 1362
    .line 1363
    .line 1364
    invoke-static {v3, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 1365
    .line 1366
    .line 1367
    move-result v1

    .line 1368
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1369
    .line 1370
    add-int/lit8 v2, v2, 0x4

    .line 1371
    .line 1372
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1373
    .line 1374
    int-to-long v0, v1

    .line 1375
    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v0

    .line 1379
    return-object v0

    .line 1380
    :cond_3d
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1381
    .line 1382
    add-int/lit8 v1, v1, -0x1

    .line 1383
    .line 1384
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1385
    .line 1386
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰楪苏世哲()Ljava/lang/Object;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v0

    .line 1390
    if-nez v0, :cond_3e

    .line 1391
    .line 1392
    goto/16 :goto_9

    .line 1393
    .line 1394
    :goto_10
    return-object v19

    .line 1395
    :cond_3e
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteThrowableClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 1396
    .line 1397
    filled-new-array {v1}, [Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v1

    .line 1401
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)Ljava/lang/String;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v0

    .line 1405
    return-object v0

    .line 1406
    nop

    .line 1407
    :pswitch_data_0
    .packed-switch -0x55
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch

    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    :pswitch_data_1
    .packed-switch -0x4e
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言楪世兰哲苏子()[Ljava/lang/String;
    .locals 6

    .line 1
    const/16 v0, -0x6e

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子哲楪兰世苏(B)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏子世兰哲()J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    sget-wide v4, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏哲兰;->飘花落叶言子楪世哲兰苏:J

    .line 15
    .line 16
    cmp-long v0, v2, v4

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v2, "not support type "

    .line 24
    .line 25
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v1

    .line 47
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏世兰子哲()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const/4 v2, -0x1

    .line 52
    if-ne v0, v2, :cond_2

    .line 53
    .line 54
    return-object v1

    .line 55
    :cond_2
    new-array v1, v0, [Ljava/lang/String;

    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    :goto_1
    if-ge v2, v0, :cond_3

    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    aput-object v3, v1, v2

    .line 65
    .line 66
    add-int/lit8 v2, v2, 0x1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    return-object v1
.end method

.method public final 飘花落叶言楪世兰子哲苏()Ljava/lang/String;
    .locals 1

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string v0, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言楪世兰子苏哲()Ljava/time/OffsetTime;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏子兰世哲()Ljava/time/ZonedDateTime;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->toOffsetDateTime()Ljava/time/OffsetDateTime;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/time/OffsetDateTime;->toOffsetTime()Ljava/time/OffsetTime;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final 飘花落叶言楪世兰苏哲子(ILjava/util/Collection;)Z
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v1, v1, v0

    .line 6
    .line 7
    const/16 v2, -0x6d

    .line 8
    .line 9
    if-eq v1, v2, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 v1, 0x1

    .line 14
    add-int/2addr v0, v1

    .line 15
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v2, ".."

    .line 22
    .line 23
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-interface {p2, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    return v1

    .line 33
    :cond_1
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p0, p2, p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪世哲苏兰(Ljava/util/Collection;ILcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;)V

    .line 38
    .line 39
    .line 40
    return v1
.end method

.method public final 飘花落叶言楪世兰苏子哲()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v1, v1, v0

    .line 6
    .line 7
    const/16 v2, -0x6d

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eq v1, v2, :cond_0

    .line 11
    .line 12
    return-object v3

    .line 13
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏哲兰世楪()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_1
    iget-byte v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰楪苏:B

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲兰世子(B)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const-string v0, "reference not support input "

    .line 35
    .line 36
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object v3
.end method

.method public final 飘花落叶言楪世哲兰苏子()Ljava/time/OffsetDateTime;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏子兰世哲()Ljava/time/ZonedDateTime;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->toOffsetDateTime()Ljava/time/OffsetDateTime;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final 飘花落叶言楪世哲子兰苏()Ljava/lang/Number;
    .locals 5

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 6
    .line 7
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 8
    .line 9
    aget-byte v0, v1, v0

    .line 10
    .line 11
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(I)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(I)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 29
    .line 30
    add-int/lit8 v3, v2, 0x1

    .line 31
    .line 32
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 33
    .line 34
    invoke-static {v2, v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰子哲世(I[BI)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_1
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(I)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏兰楪:I

    .line 48
    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 52
    .line 53
    add-int/lit8 v4, v2, 0x1

    .line 54
    .line 55
    if-ge v4, v3, :cond_2

    .line 56
    .line 57
    invoke-static {v2, v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰子世哲(I[BI)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 62
    .line 63
    add-int/lit8 v1, v1, 0x2

    .line 64
    .line 65
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 66
    .line 67
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :cond_2
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(I)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_3

    .line 77
    .line 78
    add-int/lit8 v0, v0, 0x28

    .line 79
    .line 80
    int-to-long v0, v0

    .line 81
    const-wide/16 v2, -0x8

    .line 82
    .line 83
    add-long/2addr v0, v2

    .line 84
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0

    .line 89
    :cond_3
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(I)Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-eqz v2, :cond_4

    .line 94
    .line 95
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 96
    .line 97
    add-int/lit8 v3, v2, 0x1

    .line 98
    .line 99
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 100
    .line 101
    invoke-static {v2, v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰世哲子(I[BI)I

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    int-to-long v0, p0

    .line 106
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :cond_4
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲(I)Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-eqz v2, :cond_5

    .line 116
    .line 117
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 118
    .line 119
    add-int/lit8 v4, v2, 0x1

    .line 120
    .line 121
    if-ge v4, v3, :cond_5

    .line 122
    .line 123
    invoke-static {v2, v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰世子哲(I[BI)I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 128
    .line 129
    add-int/lit8 v1, v1, 0x2

    .line 130
    .line 131
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 132
    .line 133
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    return-object p0

    .line 138
    :cond_5
    const/16 v2, -0x6e

    .line 139
    .line 140
    const/4 v4, 0x0

    .line 141
    if-eq v0, v2, :cond_b

    .line 142
    .line 143
    const/16 v2, 0x48

    .line 144
    .line 145
    if-eq v0, v2, :cond_a

    .line 146
    .line 147
    const/16 v2, 0x79

    .line 148
    .line 149
    if-eq v0, v2, :cond_9

    .line 150
    .line 151
    const/16 v2, 0x7a

    .line 152
    .line 153
    if-eq v0, v2, :cond_8

    .line 154
    .line 155
    packed-switch v0, :pswitch_data_0

    .line 156
    .line 157
    .line 158
    const/16 v1, 0x49

    .line 159
    .line 160
    if-lt v0, v1, :cond_6

    .line 161
    .line 162
    const/16 v2, 0x78

    .line 163
    .line 164
    if-gt v0, v2, :cond_6

    .line 165
    .line 166
    sub-int/2addr v0, v1

    .line 167
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子世兰苏(I)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 172
    .line 173
    add-int/2addr v2, v0

    .line 174
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 175
    .line 176
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    return-object p0

    .line 181
    :cond_6
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰哲世子(B)Lcom/alibaba/fastjson2/JSONException;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    throw p0

    .line 186
    :pswitch_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 187
    .line 188
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 189
    .line 190
    .line 191
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 196
    .line 197
    add-int/lit8 v1, v1, 0x4

    .line 198
    .line 199
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 200
    .line 201
    int-to-long v0, v0

    .line 202
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    return-object p0

    .line 207
    :pswitch_1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 208
    .line 209
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲兰子世(II)V

    .line 210
    .line 211
    .line 212
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲([BI)J

    .line 213
    .line 214
    .line 215
    move-result-wide v0

    .line 216
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 217
    .line 218
    add-int/lit8 v2, v2, 0x8

    .line 219
    .line 220
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 221
    .line 222
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    return-object p0

    .line 227
    :pswitch_2
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 228
    .line 229
    add-int/lit8 v2, v0, 0x1

    .line 230
    .line 231
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 232
    .line 233
    aget-byte p0, v1, v0

    .line 234
    .line 235
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    return-object p0

    .line 240
    :pswitch_3
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 241
    .line 242
    add-int/lit8 v2, v0, 0x1

    .line 243
    .line 244
    aget-byte v2, v1, v2

    .line 245
    .line 246
    and-int/lit16 v2, v2, 0xff

    .line 247
    .line 248
    aget-byte v1, v1, v0

    .line 249
    .line 250
    shl-int/lit8 v1, v1, 0x8

    .line 251
    .line 252
    add-int/2addr v2, v1

    .line 253
    add-int/lit8 v0, v0, 0x2

    .line 254
    .line 255
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 256
    .line 257
    int-to-short p0, v2

    .line 258
    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    return-object p0

    .line 263
    :pswitch_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    new-array v2, v0, [B

    .line 268
    .line 269
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 270
    .line 271
    const/4 v4, 0x0

    .line 272
    invoke-static {v1, v3, v2, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 273
    .line 274
    .line 275
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 276
    .line 277
    add-int/2addr v1, v0

    .line 278
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 279
    .line 280
    new-instance p0, Ljava/math/BigInteger;

    .line 281
    .line 282
    invoke-direct {p0, v2}, Ljava/math/BigInteger;-><init>([B)V

    .line 283
    .line 284
    .line 285
    return-object p0

    .line 286
    :pswitch_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世兰苏哲()J

    .line 287
    .line 288
    .line 289
    move-result-wide v0

    .line 290
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 291
    .line 292
    .line 293
    move-result-object p0

    .line 294
    return-object p0

    .line 295
    :pswitch_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰世楪哲苏()Ljava/math/BigInteger;

    .line 300
    .line 301
    .line 302
    move-result-object p0

    .line 303
    if-nez v0, :cond_7

    .line 304
    .line 305
    new-instance v0, Ljava/math/BigDecimal;

    .line 306
    .line 307
    invoke-direct {v0, p0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 308
    .line 309
    .line 310
    return-object v0

    .line 311
    :cond_7
    new-instance v1, Ljava/math/BigDecimal;

    .line 312
    .line 313
    invoke-direct {v1, p0, v0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 314
    .line 315
    .line 316
    return-object v1

    .line 317
    :pswitch_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世兰苏哲()J

    .line 318
    .line 319
    .line 320
    move-result-wide v0

    .line 321
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 322
    .line 323
    .line 324
    move-result-object p0

    .line 325
    return-object p0

    .line 326
    :pswitch_8
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 327
    .line 328
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 329
    .line 330
    .line 331
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 332
    .line 333
    .line 334
    move-result v0

    .line 335
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 336
    .line 337
    add-int/lit8 v1, v1, 0x4

    .line 338
    .line 339
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 340
    .line 341
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 342
    .line 343
    .line 344
    move-result p0

    .line 345
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 346
    .line 347
    .line 348
    move-result-object p0

    .line 349
    return-object p0

    .line 350
    :pswitch_9
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 351
    .line 352
    .line 353
    move-result p0

    .line 354
    int-to-float p0, p0

    .line 355
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 356
    .line 357
    .line 358
    move-result-object p0

    .line 359
    return-object p0

    .line 360
    :pswitch_a
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 361
    .line 362
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲兰子世(II)V

    .line 363
    .line 364
    .line 365
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲([BI)J

    .line 366
    .line 367
    .line 368
    move-result-wide v0

    .line 369
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 370
    .line 371
    add-int/lit8 v2, v2, 0x8

    .line 372
    .line 373
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 374
    .line 375
    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 376
    .line 377
    .line 378
    move-result-wide v0

    .line 379
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 380
    .line 381
    .line 382
    move-result-object p0

    .line 383
    return-object p0

    .line 384
    :pswitch_b
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世兰苏哲()J

    .line 385
    .line 386
    .line 387
    move-result-wide v0

    .line 388
    long-to-double v0, v0

    .line 389
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 390
    .line 391
    .line 392
    move-result-object p0

    .line 393
    return-object p0

    .line 394
    :pswitch_c
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 395
    .line 396
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 397
    .line 398
    .line 399
    move-result-object p0

    .line 400
    return-object p0

    .line 401
    :pswitch_d
    const-wide/16 v0, 0x0

    .line 402
    .line 403
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 404
    .line 405
    .line 406
    move-result-object p0

    .line 407
    return-object p0

    .line 408
    :pswitch_e
    return-object v4

    .line 409
    :cond_8
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    new-instance v2, Ljava/lang/String;

    .line 414
    .line 415
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 416
    .line 417
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 418
    .line 419
    invoke-direct {v2, v1, v3, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 420
    .line 421
    .line 422
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 423
    .line 424
    add-int/2addr v1, v0

    .line 425
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 426
    .line 427
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 428
    .line 429
    .line 430
    move-result-object p0

    .line 431
    return-object p0

    .line 432
    :cond_9
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 433
    .line 434
    .line 435
    move-result v0

    .line 436
    new-instance v2, Ljava/lang/String;

    .line 437
    .line 438
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 439
    .line 440
    sget-object v4, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 441
    .line 442
    invoke-direct {v2, v1, v3, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 443
    .line 444
    .line 445
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 446
    .line 447
    add-int/2addr v1, v0

    .line 448
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 449
    .line 450
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 451
    .line 452
    .line 453
    move-result-object p0

    .line 454
    return-object p0

    .line 455
    :cond_a
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 456
    .line 457
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 458
    .line 459
    .line 460
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 461
    .line 462
    .line 463
    move-result v0

    .line 464
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 465
    .line 466
    add-int/lit8 v1, v1, 0x4

    .line 467
    .line 468
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 469
    .line 470
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 471
    .line 472
    .line 473
    move-result-object p0

    .line 474
    return-object p0

    .line 475
    :cond_b
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object p0

    .line 479
    const-string v0, "not support input type : "

    .line 480
    .line 481
    invoke-static {v0, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object p0

    .line 485
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 486
    .line 487
    .line 488
    return-object v4

    .line 489
    :pswitch_data_0
    .packed-switch -0x51
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
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

.method public final 飘花落叶言楪世哲子苏兰()Ljava/util/Date;
    .locals 1

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string v0, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言楪世哲苏兰子()Ljava/util/Map;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 4
    .line 5
    iget-wide v1, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 6
    .line 7
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 8
    .line 9
    add-int/lit8 v4, v3, 0x1

    .line 10
    .line 11
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 12
    .line 13
    iget-object v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 14
    .line 15
    aget-byte v3, v5, v3

    .line 16
    .line 17
    iput-byte v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰楪苏:B

    .line 18
    .line 19
    const/16 v6, -0x51

    .line 20
    .line 21
    const/4 v7, 0x0

    .line 22
    if-ne v3, v6, :cond_0

    .line 23
    .line 24
    return-object v7

    .line 25
    :cond_0
    const/16 v6, -0x5a

    .line 26
    .line 27
    if-lt v3, v6, :cond_1d

    .line 28
    .line 29
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseNativeObject:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 30
    .line 31
    iget-wide v8, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 32
    .line 33
    and-long/2addr v8, v1

    .line 34
    const-wide/16 v10, 0x0

    .line 35
    .line 36
    cmp-long v3, v8, v10

    .line 37
    .line 38
    const/16 v8, 0xa

    .line 39
    .line 40
    const/16 v9, 0x8

    .line 41
    .line 42
    const/16 v12, -0x5b

    .line 43
    .line 44
    if-eqz v3, :cond_2

    .line 45
    .line 46
    sget v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏:I

    .line 47
    .line 48
    if-ne v3, v9, :cond_1

    .line 49
    .line 50
    aget-byte v3, v5, v4

    .line 51
    .line 52
    if-eq v3, v12, :cond_1

    .line 53
    .line 54
    new-instance v3, Ljava/util/HashMap;

    .line 55
    .line 56
    invoke-direct {v3, v8}, Ljava/util/HashMap;-><init>(I)V

    .line 57
    .line 58
    .line 59
    :goto_0
    move-object v4, v3

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    new-instance v3, Ljava/util/HashMap;

    .line 62
    .line 63
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    sget v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏:I

    .line 68
    .line 69
    if-ne v3, v9, :cond_3

    .line 70
    .line 71
    aget-byte v3, v5, v4

    .line 72
    .line 73
    if-eq v3, v12, :cond_3

    .line 74
    .line 75
    new-instance v3, Lcom/alibaba/fastjson2/JSONObject;

    .line 76
    .line 77
    invoke-direct {v3, v8}, Lcom/alibaba/fastjson2/JSONObject;-><init>(I)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    new-instance v3, Lcom/alibaba/fastjson2/JSONObject;

    .line 82
    .line 83
    invoke-direct {v3}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :goto_1
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 88
    .line 89
    aget-byte v8, v5, v3

    .line 90
    .line 91
    iput-byte v8, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰楪苏:B

    .line 92
    .line 93
    if-ne v8, v12, :cond_4

    .line 94
    .line 95
    add-int/lit8 v3, v3, 0x1

    .line 96
    .line 97
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 98
    .line 99
    return-object v4

    .line 100
    :cond_4
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏哲兰世楪()Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eqz v3, :cond_5

    .line 105
    .line 106
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰苏世哲楪()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    goto :goto_2

    .line 111
    :cond_5
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰楪苏世哲()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    :goto_2
    iget v8, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 116
    .line 117
    array-length v9, v5

    .line 118
    const-string v13, ".."

    .line 119
    .line 120
    if-ge v8, v9, :cond_7

    .line 121
    .line 122
    aget-byte v9, v5, v8

    .line 123
    .line 124
    const/16 v14, -0x6d

    .line 125
    .line 126
    if-ne v9, v14, :cond_7

    .line 127
    .line 128
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世兰苏子哲()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    if-eqz v9, :cond_6

    .line 137
    .line 138
    invoke-interface {v4, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    :goto_3
    move-wide/from16 v16, v10

    .line 142
    .line 143
    goto/16 :goto_b

    .line 144
    .line 145
    :cond_6
    invoke-static {v8}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    invoke-virtual {v0, v4, v3, v8}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪世兰哲苏(Ljava/util/Map;Ljava/lang/Object;Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;)V

    .line 150
    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_7
    aget-byte v8, v5, v8

    .line 154
    .line 155
    const/16 v9, 0x7e

    .line 156
    .line 157
    const/16 v14, 0x49

    .line 158
    .line 159
    if-lt v8, v14, :cond_8

    .line 160
    .line 161
    if-gt v8, v9, :cond_8

    .line 162
    .line 163
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v8

    .line 167
    :goto_4
    move-wide/from16 v16, v10

    .line 168
    .line 169
    goto/16 :goto_a

    .line 170
    .line 171
    :cond_8
    invoke-static {v8}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(I)Z

    .line 172
    .line 173
    .line 174
    move-result v15

    .line 175
    if-eqz v15, :cond_9

    .line 176
    .line 177
    iget v9, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 178
    .line 179
    add-int/lit8 v9, v9, 0x1

    .line 180
    .line 181
    iput v9, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 182
    .line 183
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    goto :goto_4

    .line 188
    :cond_9
    const/16 v15, -0x4f

    .line 189
    .line 190
    if-ne v8, v15, :cond_a

    .line 191
    .line 192
    iget v8, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 193
    .line 194
    add-int/lit8 v8, v8, 0x1

    .line 195
    .line 196
    iput v8, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 197
    .line 198
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_a
    const/16 v15, -0x50

    .line 202
    .line 203
    if-ne v8, v15, :cond_b

    .line 204
    .line 205
    iget v8, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 206
    .line 207
    add-int/lit8 v8, v8, 0x1

    .line 208
    .line 209
    iput v8, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 210
    .line 211
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_b
    if-ne v8, v6, :cond_c

    .line 215
    .line 216
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世哲苏兰子()Ljava/util/Map;

    .line 217
    .line 218
    .line 219
    move-result-object v8

    .line 220
    goto :goto_4

    .line 221
    :cond_c
    const/16 v15, -0x42

    .line 222
    .line 223
    move-wide/from16 v16, v10

    .line 224
    .line 225
    iget v10, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏兰楪:I

    .line 226
    .line 227
    if-ne v8, v15, :cond_d

    .line 228
    .line 229
    iget v8, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 230
    .line 231
    add-int/lit8 v8, v8, 0x1

    .line 232
    .line 233
    invoke-static {v8, v10}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲兰子世(II)V

    .line 234
    .line 235
    .line 236
    invoke-static {v5, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲([BI)J

    .line 237
    .line 238
    .line 239
    move-result-wide v8

    .line 240
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 241
    .line 242
    .line 243
    move-result-object v8

    .line 244
    iget v9, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 245
    .line 246
    add-int/lit8 v9, v9, 0x9

    .line 247
    .line 248
    iput v9, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 249
    .line 250
    goto/16 :goto_a

    .line 251
    .line 252
    :cond_d
    const/16 v11, -0x6c

    .line 253
    .line 254
    if-lt v8, v11, :cond_18

    .line 255
    .line 256
    const/16 v11, -0x5c

    .line 257
    .line 258
    if-gt v8, v11, :cond_18

    .line 259
    .line 260
    iget v10, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 261
    .line 262
    add-int/lit8 v10, v10, 0x1

    .line 263
    .line 264
    iput v10, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 265
    .line 266
    if-ne v8, v11, :cond_f

    .line 267
    .line 268
    aget-byte v8, v5, v10

    .line 269
    .line 270
    invoke-static {v8}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(I)Z

    .line 271
    .line 272
    .line 273
    move-result v10

    .line 274
    if-eqz v10, :cond_e

    .line 275
    .line 276
    iget v10, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 277
    .line 278
    add-int/lit8 v10, v10, 0x1

    .line 279
    .line 280
    iput v10, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 281
    .line 282
    goto :goto_5

    .line 283
    :cond_e
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 284
    .line 285
    .line 286
    move-result v8

    .line 287
    goto :goto_5

    .line 288
    :cond_f
    add-int/lit8 v8, v8, 0x6c

    .line 289
    .line 290
    :goto_5
    if-nez v8, :cond_11

    .line 291
    .line 292
    sget-object v8, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseNativeObject:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 293
    .line 294
    iget-wide v8, v8, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 295
    .line 296
    and-long/2addr v8, v1

    .line 297
    cmp-long v8, v8, v16

    .line 298
    .line 299
    if-eqz v8, :cond_10

    .line 300
    .line 301
    new-instance v8, Ljava/util/ArrayList;

    .line 302
    .line 303
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 304
    .line 305
    .line 306
    goto/16 :goto_a

    .line 307
    .line 308
    :cond_10
    new-instance v8, Lcom/alibaba/fastjson2/JSONArray;

    .line 309
    .line 310
    invoke-direct {v8}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 311
    .line 312
    .line 313
    goto/16 :goto_a

    .line 314
    .line 315
    :cond_11
    sget-object v10, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseNativeObject:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 316
    .line 317
    iget-wide v10, v10, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 318
    .line 319
    and-long/2addr v10, v1

    .line 320
    cmp-long v10, v10, v16

    .line 321
    .line 322
    if-eqz v10, :cond_12

    .line 323
    .line 324
    new-instance v10, Ljava/util/ArrayList;

    .line 325
    .line 326
    invoke-direct {v10, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 327
    .line 328
    .line 329
    goto :goto_6

    .line 330
    :cond_12
    new-instance v10, Lcom/alibaba/fastjson2/JSONArray;

    .line 331
    .line 332
    invoke-direct {v10, v8}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 333
    .line 334
    .line 335
    :goto_6
    const/4 v11, 0x0

    .line 336
    :goto_7
    if-ge v11, v8, :cond_17

    .line 337
    .line 338
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏哲兰楪世()Z

    .line 339
    .line 340
    .line 341
    move-result v15

    .line 342
    if-eqz v15, :cond_14

    .line 343
    .line 344
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世兰苏子哲()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v15

    .line 348
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result v18

    .line 352
    if-eqz v18, :cond_13

    .line 353
    .line 354
    invoke-interface {v10, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    goto :goto_9

    .line 358
    :cond_13
    invoke-interface {v10, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    invoke-static {v15}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;

    .line 362
    .line 363
    .line 364
    move-result-object v15

    .line 365
    invoke-virtual {v0, v10, v11, v15}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪世哲苏兰(Ljava/util/Collection;ILcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;)V

    .line 366
    .line 367
    .line 368
    goto :goto_9

    .line 369
    :cond_14
    iget v15, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 370
    .line 371
    aget-byte v15, v5, v15

    .line 372
    .line 373
    if-lt v15, v14, :cond_15

    .line 374
    .line 375
    if-gt v15, v9, :cond_15

    .line 376
    .line 377
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v15

    .line 381
    goto :goto_8

    .line 382
    :cond_15
    if-ne v15, v6, :cond_16

    .line 383
    .line 384
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世哲苏兰子()Ljava/util/Map;

    .line 385
    .line 386
    .line 387
    move-result-object v15

    .line 388
    goto :goto_8

    .line 389
    :cond_16
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰楪苏世哲()Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v15

    .line 393
    :goto_8
    invoke-interface {v10, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    :goto_9
    add-int/lit8 v11, v11, 0x1

    .line 397
    .line 398
    goto :goto_7

    .line 399
    :cond_17
    move-object v8, v10

    .line 400
    goto :goto_a

    .line 401
    :cond_18
    invoke-static {v8}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(I)Z

    .line 402
    .line 403
    .line 404
    move-result v9

    .line 405
    if-eqz v9, :cond_19

    .line 406
    .line 407
    iget v9, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 408
    .line 409
    add-int/lit8 v9, v9, 0x1

    .line 410
    .line 411
    invoke-static {v9, v5, v8}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰子哲世(I[BI)I

    .line 412
    .line 413
    .line 414
    move-result v8

    .line 415
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 416
    .line 417
    .line 418
    move-result-object v8

    .line 419
    iget v9, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 420
    .line 421
    add-int/lit8 v9, v9, 0x2

    .line 422
    .line 423
    iput v9, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 424
    .line 425
    goto :goto_a

    .line 426
    :cond_19
    invoke-static {v8}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(I)Z

    .line 427
    .line 428
    .line 429
    move-result v9

    .line 430
    if-eqz v9, :cond_1a

    .line 431
    .line 432
    iget v9, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 433
    .line 434
    add-int/lit8 v9, v9, 0x1

    .line 435
    .line 436
    if-ge v9, v10, :cond_1a

    .line 437
    .line 438
    invoke-static {v9, v5, v8}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰子世哲(I[BI)I

    .line 439
    .line 440
    .line 441
    move-result v8

    .line 442
    iget v9, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 443
    .line 444
    add-int/lit8 v9, v9, 0x3

    .line 445
    .line 446
    iput v9, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 447
    .line 448
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 449
    .line 450
    .line 451
    move-result-object v8

    .line 452
    goto :goto_a

    .line 453
    :cond_1a
    const/16 v9, 0x48

    .line 454
    .line 455
    if-ne v8, v9, :cond_1b

    .line 456
    .line 457
    iget v8, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 458
    .line 459
    add-int/lit8 v9, v8, 0x3

    .line 460
    .line 461
    if-ge v9, v10, :cond_1b

    .line 462
    .line 463
    add-int/lit8 v8, v8, 0x1

    .line 464
    .line 465
    invoke-static {v5, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 466
    .line 467
    .line 468
    move-result v8

    .line 469
    iget v9, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 470
    .line 471
    add-int/lit8 v9, v9, 0x5

    .line 472
    .line 473
    iput v9, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 474
    .line 475
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 476
    .line 477
    .line 478
    move-result-object v8

    .line 479
    goto :goto_a

    .line 480
    :cond_1b
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰楪苏世哲()Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v8

    .line 484
    :goto_a
    if-nez v8, :cond_1c

    .line 485
    .line 486
    sget-object v9, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreNullPropertyValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 487
    .line 488
    iget-wide v9, v9, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 489
    .line 490
    and-long/2addr v9, v1

    .line 491
    cmp-long v9, v9, v16

    .line 492
    .line 493
    if-eqz v9, :cond_1c

    .line 494
    .line 495
    goto :goto_b

    .line 496
    :cond_1c
    invoke-interface {v4, v3, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    :goto_b
    move-wide/from16 v10, v16

    .line 500
    .line 501
    goto/16 :goto_1

    .line 502
    .line 503
    :cond_1d
    const/16 v1, -0x6e

    .line 504
    .line 505
    if-ne v3, v1, :cond_1e

    .line 506
    .line 507
    const-wide/16 v1, 0x0

    .line 508
    .line 509
    const-wide/16 v3, 0x0

    .line 510
    .line 511
    const-class v5, Ljava/util/Map;

    .line 512
    .line 513
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪苏哲兰世(JJLjava/lang/Class;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    const/4 v3, 0x0

    .line 518
    const-wide/16 v4, 0x0

    .line 519
    .line 520
    const/4 v2, 0x0

    .line 521
    move-object v0, v1

    .line 522
    move-object/from16 v1, p0

    .line 523
    .line 524
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    check-cast v0, Ljava/util/Map;

    .line 529
    .line 530
    return-object v0

    .line 531
    :cond_1e
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰哲世子(B)Lcom/alibaba/fastjson2/JSONException;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    throw v0
.end method

.method public final 飘花落叶言楪世哲苏子兰()V
    .locals 1

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string v0, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言楪世子兰哲苏()Ljava/time/LocalTime;
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    const/16 v3, 0x50

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏楪哲世兰([BI)Ljava/time/LocalTime;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x8

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string p0, "date only support string input"

    .line 27
    .line 28
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public final 飘花落叶言楪世子兰苏哲()Ljava/time/LocalTime;
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    const/16 v3, 0x4f

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏楪世兰哲([BI)Ljava/time/LocalTime;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x7

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string p0, "date only support string input"

    .line 27
    .line 28
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public final 飘花落叶言楪世子哲兰苏()Ljava/time/LocalTime;
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    const/16 v3, 0x4e

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏楪世哲兰([BI)Ljava/time/LocalTime;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x6

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string p0, "date only support string input"

    .line 27
    .line 28
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public final 飘花落叶言楪世子哲苏兰()Ljava/time/LocalTime;
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    const/16 v3, 0x5b

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世兰哲苏楪([BI)Ljava/time/LocalTime;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x13

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string p0, "date only support string input"

    .line 27
    .line 28
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public final 飘花落叶言楪世子苏兰哲()Ljava/time/LocalTime;
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    const/16 v3, 0x58

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世兰哲楪苏([BI)Ljava/time/LocalTime;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x10

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string p0, "date only support string input"

    .line 27
    .line 28
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public final 飘花落叶言楪世子苏哲兰()Ljava/time/LocalTime;
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    const/16 v3, 0x55

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世兰苏哲楪([BI)Ljava/time/LocalTime;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0xd

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string p0, "date only support string input"

    .line 27
    .line 28
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public final 飘花落叶言楪世苏兰哲子()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 6
    .line 7
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 8
    .line 9
    aget-byte v0, v1, v0

    .line 10
    .line 11
    iput-byte v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰楪苏:B

    .line 12
    .line 13
    const/16 v1, -0x51

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string v0, "null not match, "

    .line 19
    .line 20
    iget-byte p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰楪苏:B

    .line 21
    .line 22
    invoke-static {p0, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世(ILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final 飘花落叶言楪世苏哲子兰()J
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    const/16 v3, 0x5c

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 14
    .line 15
    iget-object v2, v2, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Ljava/time/ZoneId;

    .line 18
    .line 19
    invoke-static {v1, v0, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏世哲楪兰([BILjava/time/ZoneId;)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x14

    .line 26
    .line 27
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 28
    .line 29
    return-wide v0

    .line 30
    :cond_0
    const-string p0, "date only support string input"

    .line 31
    .line 32
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-wide/16 v0, 0x0

    .line 36
    .line 37
    return-wide v0
.end method

.method public final 飘花落叶言楪世苏子兰哲()Ljava/time/LocalTime;
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    const/16 v3, 0x52

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏楪兰世哲([BI)Ljava/time/LocalTime;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0xa

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string p0, "date only support string input"

    .line 27
    .line 28
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public final 飘花落叶言楪世苏子哲兰()Ljava/time/LocalTime;
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    const/16 v3, 0x51

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏楪兰世哲([BI)Ljava/time/LocalTime;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x9

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string p0, "date only support string input"

    .line 27
    .line 28
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public final 飘花落叶言楪哲世子兰苏()Ljava/time/ZonedDateTime;
    .locals 12

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 6
    .line 7
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 8
    .line 9
    aget-byte v3, v2, v0

    .line 10
    .line 11
    shl-int/lit8 v3, v3, 0x8

    .line 12
    .line 13
    add-int/lit8 v4, v0, 0x2

    .line 14
    .line 15
    iput v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 16
    .line 17
    aget-byte v1, v2, v1

    .line 18
    .line 19
    and-int/lit16 v1, v1, 0xff

    .line 20
    .line 21
    add-int v5, v3, v1

    .line 22
    .line 23
    add-int/lit8 v1, v0, 0x3

    .line 24
    .line 25
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 26
    .line 27
    aget-byte v6, v2, v4

    .line 28
    .line 29
    add-int/lit8 v3, v0, 0x4

    .line 30
    .line 31
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 32
    .line 33
    aget-byte v7, v2, v1

    .line 34
    .line 35
    add-int/lit8 v1, v0, 0x5

    .line 36
    .line 37
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 38
    .line 39
    aget-byte v8, v2, v3

    .line 40
    .line 41
    add-int/lit8 v3, v0, 0x6

    .line 42
    .line 43
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 44
    .line 45
    aget-byte v9, v2, v1

    .line 46
    .line 47
    add-int/lit8 v0, v0, 0x7

    .line 48
    .line 49
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 50
    .line 51
    aget-byte v10, v2, v3

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 54
    .line 55
    .line 56
    move-result v11

    .line 57
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 58
    .line 59
    sget-object v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪兰世哲:[B

    .line 60
    .line 61
    array-length v3, v1

    .line 62
    add-int/2addr v0, v3

    .line 63
    array-length v3, v2

    .line 64
    if-ge v0, v3, :cond_2

    .line 65
    .line 66
    const/4 v0, 0x0

    .line 67
    :goto_0
    array-length v3, v1

    .line 68
    iget v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 69
    .line 70
    if-ge v0, v3, :cond_1

    .line 71
    .line 72
    add-int/2addr v4, v0

    .line 73
    aget-byte v3, v2, v4

    .line 74
    .line 75
    aget-byte v4, v1, v0

    .line 76
    .line 77
    if-eq v3, v4, :cond_0

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    array-length v0, v1

    .line 84
    add-int/2addr v4, v0

    .line 85
    iput v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 86
    .line 87
    sget-object p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Ljava/time/ZoneId;

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Ljava/time/ZoneId;

    .line 95
    .line 96
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/time/ZoneId;)Ljava/time/ZoneId;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    :goto_2
    invoke-static/range {v5 .. v11}, Ljava/time/LocalDateTime;->of(IIIIIII)Ljava/time/LocalDateTime;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-static {v0, p0}, Ljava/time/ZonedDateTime;->of(Ljava/time/LocalDateTime;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0
.end method

.method public final 飘花落叶言楪哲世子苏兰()V
    .locals 3

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "string value not support input "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-byte v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰楪苏:B

    .line 11
    .line 12
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(B)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v2, " offset "

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v2, "/"

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 35
    .line 36
    array-length p0, p0

    .line 37
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v0
.end method

.method public final 飘花落叶言楪哲子世兰苏(I)Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne p1, v1, :cond_0

    .line 7
    .line 8
    aget-byte p0, p0, v0

    .line 9
    .line 10
    and-int/lit16 p0, p0, 0xff

    .line 11
    .line 12
    int-to-char p0, p0

    .line 13
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世兰苏楪哲(C)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    const/4 v2, 0x2

    .line 19
    if-ne p1, v2, :cond_1

    .line 20
    .line 21
    aget-byte p1, p0, v0

    .line 22
    .line 23
    and-int/lit16 p1, p1, 0xff

    .line 24
    .line 25
    int-to-char p1, p1

    .line 26
    add-int/2addr v0, v1

    .line 27
    aget-byte p0, p0, v0

    .line 28
    .line 29
    and-int/lit16 p0, p0, 0xff

    .line 30
    .line 31
    int-to-char p0, p0

    .line 32
    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世兰苏哲楪(CC)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_1
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世苏哲:Ljava/util/function/BiFunction;

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    invoke-static {v0, p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰(I[BI)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :cond_2
    new-instance v1, Ljava/lang/String;

    .line 47
    .line 48
    sget-object v2, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 49
    .line 50
    invoke-direct {v1, p0, v0, p1, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 51
    .line 52
    .line 53
    return-object v1
.end method

.method public final 飘花落叶言楪哲子世苏兰(B)Z
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    const/16 v2, -0x51

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    if-eq v1, v2, :cond_1c

    .line 10
    .line 11
    const/16 v2, 0x4a

    .line 12
    .line 13
    const/16 v11, 0x61

    .line 14
    .line 15
    const/16 v12, 0x66

    .line 16
    .line 17
    const/16 v13, 0x75

    .line 18
    .line 19
    const/16 v14, 0x72

    .line 20
    .line 21
    const/16 v15, 0x74

    .line 22
    .line 23
    const/16 v5, 0x59

    .line 24
    .line 25
    const-string v6, "not support input "

    .line 26
    .line 27
    const/16 v7, 0x45

    .line 28
    .line 29
    const/16 v8, 0x4e

    .line 30
    .line 31
    const/16 v9, 0x65

    .line 32
    .line 33
    const/16 v16, 0x5

    .line 34
    .line 35
    const/16 v17, 0x4

    .line 36
    .line 37
    iget-object v10, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 38
    .line 39
    if-eq v1, v2, :cond_e

    .line 40
    .line 41
    if-eqz v1, :cond_d

    .line 42
    .line 43
    if-eq v1, v4, :cond_c

    .line 44
    .line 45
    const/16 v2, 0x4d

    .line 46
    .line 47
    if-eq v1, v2, :cond_b

    .line 48
    .line 49
    if-eq v1, v8, :cond_a

    .line 50
    .line 51
    packed-switch v1, :pswitch_data_0

    .line 52
    .line 53
    .line 54
    invoke-static {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰哲世子(B)Lcom/alibaba/fastjson2/JSONException;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    throw v0

    .line 59
    :pswitch_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 64
    .line 65
    new-array v5, v2, [B

    .line 66
    .line 67
    iget v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 68
    .line 69
    invoke-static {v10, v7, v5, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 70
    .line 71
    .line 72
    const/16 v2, 0x7d

    .line 73
    .line 74
    if-ne v1, v2, :cond_0

    .line 75
    .line 76
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_16BE:Ljava/nio/charset/Charset;

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    const/16 v2, 0x7c

    .line 80
    .line 81
    if-ne v1, v2, :cond_1

    .line 82
    .line 83
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_1
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_16:Ljava/nio/charset/Charset;

    .line 87
    .line 88
    :goto_0
    new-instance v2, Ljava/lang/String;

    .line 89
    .line 90
    invoke-direct {v2, v5, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 91
    .line 92
    .line 93
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 94
    .line 95
    iget v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 96
    .line 97
    add-int/2addr v1, v5

    .line 98
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 99
    .line 100
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    const/4 v1, -0x1

    .line 105
    sparse-switch v0, :sswitch_data_0

    .line 106
    .line 107
    .line 108
    :goto_1
    move v10, v1

    .line 109
    goto/16 :goto_2

    .line 110
    .line 111
    :sswitch_0
    const-string v0, "false"

    .line 112
    .line 113
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-nez v0, :cond_2

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_2
    const/4 v10, 0x7

    .line 121
    goto :goto_2

    .line 122
    :sswitch_1
    const-string v0, "FALSE"

    .line 123
    .line 124
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-nez v0, :cond_3

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_3
    const/4 v10, 0x6

    .line 132
    goto :goto_2

    .line 133
    :sswitch_2
    const-string v0, "true"

    .line 134
    .line 135
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-nez v0, :cond_4

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_4
    move/from16 v10, v16

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :sswitch_3
    const-string v0, "TRUE"

    .line 146
    .line 147
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-nez v0, :cond_5

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_5
    move/from16 v10, v17

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :sswitch_4
    const-string v0, "Y"

    .line 158
    .line 159
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-nez v0, :cond_6

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_6
    const/4 v10, 0x3

    .line 167
    goto :goto_2

    .line 168
    :sswitch_5
    const-string v0, "N"

    .line 169
    .line 170
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-nez v0, :cond_7

    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_7
    const/4 v10, 0x2

    .line 178
    goto :goto_2

    .line 179
    :sswitch_6
    const-string v0, "1"

    .line 180
    .line 181
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-nez v0, :cond_8

    .line 186
    .line 187
    goto :goto_1

    .line 188
    :cond_8
    move v10, v4

    .line 189
    goto :goto_2

    .line 190
    :sswitch_7
    const-string v0, "0"

    .line 191
    .line 192
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-nez v0, :cond_9

    .line 197
    .line 198
    goto :goto_1

    .line 199
    :cond_9
    move v10, v3

    .line 200
    :goto_2
    packed-switch v10, :pswitch_data_1

    .line 201
    .line 202
    .line 203
    invoke-virtual {v6, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    return v3

    .line 211
    :pswitch_1
    move/from16 v18, v3

    .line 212
    .line 213
    goto/16 :goto_5

    .line 214
    .line 215
    :cond_a
    move/from16 v18, v3

    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_b
    move/from16 v18, v3

    .line 219
    .line 220
    goto :goto_3

    .line 221
    :cond_c
    :pswitch_2
    return v4

    .line 222
    :cond_d
    :pswitch_3
    return v3

    .line 223
    :cond_e
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 224
    .line 225
    aget-byte v2, v10, v1

    .line 226
    .line 227
    move/from16 v18, v3

    .line 228
    .line 229
    const/16 v3, 0x31

    .line 230
    .line 231
    if-eq v2, v3, :cond_1b

    .line 232
    .line 233
    if-ne v2, v5, :cond_f

    .line 234
    .line 235
    goto/16 :goto_7

    .line 236
    .line 237
    :cond_f
    const/16 v3, 0x30

    .line 238
    .line 239
    if-eq v2, v3, :cond_1a

    .line 240
    .line 241
    if-ne v2, v8, :cond_10

    .line 242
    .line 243
    goto/16 :goto_6

    .line 244
    .line 245
    :cond_10
    :goto_3
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 246
    .line 247
    aget-byte v2, v10, v1

    .line 248
    .line 249
    if-ne v2, v15, :cond_11

    .line 250
    .line 251
    add-int/lit8 v3, v1, 0x1

    .line 252
    .line 253
    aget-byte v3, v10, v3

    .line 254
    .line 255
    if-ne v3, v14, :cond_11

    .line 256
    .line 257
    add-int/lit8 v3, v1, 0x2

    .line 258
    .line 259
    aget-byte v3, v10, v3

    .line 260
    .line 261
    if-ne v3, v13, :cond_11

    .line 262
    .line 263
    add-int/lit8 v3, v1, 0x3

    .line 264
    .line 265
    aget-byte v3, v10, v3

    .line 266
    .line 267
    if-ne v3, v9, :cond_11

    .line 268
    .line 269
    add-int/lit8 v1, v1, 0x4

    .line 270
    .line 271
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 272
    .line 273
    return v4

    .line 274
    :cond_11
    const/16 v3, 0x54

    .line 275
    .line 276
    if-ne v2, v3, :cond_12

    .line 277
    .line 278
    add-int/lit8 v2, v1, 0x1

    .line 279
    .line 280
    aget-byte v2, v10, v2

    .line 281
    .line 282
    const/16 v3, 0x52

    .line 283
    .line 284
    if-ne v2, v3, :cond_12

    .line 285
    .line 286
    add-int/lit8 v2, v1, 0x2

    .line 287
    .line 288
    aget-byte v2, v10, v2

    .line 289
    .line 290
    const/16 v3, 0x55

    .line 291
    .line 292
    if-ne v2, v3, :cond_12

    .line 293
    .line 294
    add-int/lit8 v2, v1, 0x3

    .line 295
    .line 296
    aget-byte v2, v10, v2

    .line 297
    .line 298
    if-ne v2, v7, :cond_12

    .line 299
    .line 300
    add-int/lit8 v1, v1, 0x4

    .line 301
    .line 302
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 303
    .line 304
    return v4

    .line 305
    :cond_12
    :goto_4
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 306
    .line 307
    aget-byte v2, v10, v1

    .line 308
    .line 309
    if-ne v2, v12, :cond_13

    .line 310
    .line 311
    add-int/lit8 v3, v1, 0x1

    .line 312
    .line 313
    aget-byte v3, v10, v3

    .line 314
    .line 315
    if-ne v3, v11, :cond_13

    .line 316
    .line 317
    add-int/lit8 v3, v1, 0x2

    .line 318
    .line 319
    aget-byte v3, v10, v3

    .line 320
    .line 321
    const/16 v11, 0x6c

    .line 322
    .line 323
    if-ne v3, v11, :cond_13

    .line 324
    .line 325
    add-int/lit8 v3, v1, 0x3

    .line 326
    .line 327
    aget-byte v3, v10, v3

    .line 328
    .line 329
    const/16 v11, 0x73

    .line 330
    .line 331
    if-ne v3, v11, :cond_13

    .line 332
    .line 333
    add-int/lit8 v3, v1, 0x4

    .line 334
    .line 335
    aget-byte v3, v10, v3

    .line 336
    .line 337
    if-ne v3, v9, :cond_13

    .line 338
    .line 339
    add-int/lit8 v1, v1, 0x5

    .line 340
    .line 341
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 342
    .line 343
    return v18

    .line 344
    :cond_13
    const/16 v3, 0x46

    .line 345
    .line 346
    if-ne v2, v3, :cond_14

    .line 347
    .line 348
    add-int/lit8 v2, v1, 0x1

    .line 349
    .line 350
    aget-byte v2, v10, v2

    .line 351
    .line 352
    const/16 v3, 0x41

    .line 353
    .line 354
    if-ne v2, v3, :cond_14

    .line 355
    .line 356
    add-int/lit8 v2, v1, 0x2

    .line 357
    .line 358
    aget-byte v2, v10, v2

    .line 359
    .line 360
    const/16 v3, 0x4c

    .line 361
    .line 362
    if-ne v2, v3, :cond_14

    .line 363
    .line 364
    add-int/lit8 v2, v1, 0x3

    .line 365
    .line 366
    aget-byte v2, v10, v2

    .line 367
    .line 368
    const/16 v3, 0x53

    .line 369
    .line 370
    if-ne v2, v3, :cond_14

    .line 371
    .line 372
    add-int/lit8 v2, v1, 0x4

    .line 373
    .line 374
    aget-byte v2, v10, v2

    .line 375
    .line 376
    if-ne v2, v7, :cond_14

    .line 377
    .line 378
    add-int/lit8 v1, v1, 0x5

    .line 379
    .line 380
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 381
    .line 382
    return v18

    .line 383
    :cond_14
    :goto_5
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 384
    .line 385
    .line 386
    move-result v1

    .line 387
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 388
    .line 389
    if-ne v1, v4, :cond_16

    .line 390
    .line 391
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 392
    .line 393
    aget-byte v3, v10, v2

    .line 394
    .line 395
    if-ne v3, v5, :cond_15

    .line 396
    .line 397
    add-int/2addr v2, v4

    .line 398
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 399
    .line 400
    return v4

    .line 401
    :cond_15
    if-ne v3, v8, :cond_19

    .line 402
    .line 403
    add-int/2addr v2, v4

    .line 404
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 405
    .line 406
    return v4

    .line 407
    :cond_16
    move/from16 v2, v17

    .line 408
    .line 409
    if-ne v1, v2, :cond_17

    .line 410
    .line 411
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 412
    .line 413
    aget-byte v3, v10, v2

    .line 414
    .line 415
    if-ne v3, v15, :cond_17

    .line 416
    .line 417
    add-int/lit8 v3, v2, 0x1

    .line 418
    .line 419
    aget-byte v3, v10, v3

    .line 420
    .line 421
    if-ne v3, v14, :cond_17

    .line 422
    .line 423
    add-int/lit8 v3, v2, 0x2

    .line 424
    .line 425
    aget-byte v3, v10, v3

    .line 426
    .line 427
    if-ne v3, v13, :cond_17

    .line 428
    .line 429
    add-int/lit8 v3, v2, 0x3

    .line 430
    .line 431
    aget-byte v3, v10, v3

    .line 432
    .line 433
    if-ne v3, v9, :cond_17

    .line 434
    .line 435
    const/16 v17, 0x4

    .line 436
    .line 437
    add-int/lit8 v2, v2, 0x4

    .line 438
    .line 439
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 440
    .line 441
    return v4

    .line 442
    :cond_17
    move/from16 v2, v16

    .line 443
    .line 444
    if-ne v1, v2, :cond_19

    .line 445
    .line 446
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 447
    .line 448
    aget-byte v3, v10, v2

    .line 449
    .line 450
    if-ne v3, v12, :cond_18

    .line 451
    .line 452
    add-int/lit8 v4, v2, 0x1

    .line 453
    .line 454
    aget-byte v4, v10, v4

    .line 455
    .line 456
    const/16 v5, 0x61

    .line 457
    .line 458
    if-ne v4, v5, :cond_18

    .line 459
    .line 460
    add-int/lit8 v4, v2, 0x2

    .line 461
    .line 462
    aget-byte v4, v10, v4

    .line 463
    .line 464
    const/16 v11, 0x6c

    .line 465
    .line 466
    if-ne v4, v11, :cond_18

    .line 467
    .line 468
    add-int/lit8 v4, v2, 0x3

    .line 469
    .line 470
    aget-byte v4, v10, v4

    .line 471
    .line 472
    const/16 v11, 0x73

    .line 473
    .line 474
    if-ne v4, v11, :cond_18

    .line 475
    .line 476
    add-int/lit8 v4, v2, 0x4

    .line 477
    .line 478
    aget-byte v4, v10, v4

    .line 479
    .line 480
    if-ne v4, v9, :cond_18

    .line 481
    .line 482
    const/16 v16, 0x5

    .line 483
    .line 484
    add-int/lit8 v2, v2, 0x5

    .line 485
    .line 486
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 487
    .line 488
    return v18

    .line 489
    :cond_18
    const/16 v4, 0x46

    .line 490
    .line 491
    if-ne v3, v4, :cond_19

    .line 492
    .line 493
    add-int/lit8 v3, v2, 0x1

    .line 494
    .line 495
    aget-byte v3, v10, v3

    .line 496
    .line 497
    const/16 v4, 0x41

    .line 498
    .line 499
    if-ne v3, v4, :cond_19

    .line 500
    .line 501
    add-int/lit8 v3, v2, 0x2

    .line 502
    .line 503
    aget-byte v3, v10, v3

    .line 504
    .line 505
    const/16 v4, 0x4c

    .line 506
    .line 507
    if-ne v3, v4, :cond_19

    .line 508
    .line 509
    add-int/lit8 v3, v2, 0x3

    .line 510
    .line 511
    aget-byte v3, v10, v3

    .line 512
    .line 513
    const/16 v4, 0x53

    .line 514
    .line 515
    if-ne v3, v4, :cond_19

    .line 516
    .line 517
    add-int/lit8 v3, v2, 0x4

    .line 518
    .line 519
    aget-byte v3, v10, v3

    .line 520
    .line 521
    if-ne v3, v7, :cond_19

    .line 522
    .line 523
    const/16 v16, 0x5

    .line 524
    .line 525
    add-int/lit8 v2, v2, 0x5

    .line 526
    .line 527
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 528
    .line 529
    return v18

    .line 530
    :cond_19
    new-instance v2, Ljava/lang/String;

    .line 531
    .line 532
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 533
    .line 534
    sget-object v4, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 535
    .line 536
    invoke-direct {v2, v10, v3, v1, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 537
    .line 538
    .line 539
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 540
    .line 541
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 542
    .line 543
    add-int/2addr v1, v3

    .line 544
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 545
    .line 546
    invoke-virtual {v6, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 551
    .line 552
    .line 553
    return v18

    .line 554
    :cond_1a
    :goto_6
    add-int/2addr v1, v4

    .line 555
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 556
    .line 557
    return v18

    .line 558
    :cond_1b
    :goto_7
    add-int/2addr v1, v4

    .line 559
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 560
    .line 561
    return v4

    .line 562
    :cond_1c
    move/from16 v18, v3

    .line 563
    .line 564
    iget-object v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 565
    .line 566
    iget-wide v1, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 567
    .line 568
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNullForPrimitives:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 569
    .line 570
    iget-wide v5, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 571
    .line 572
    and-long/2addr v1, v5

    .line 573
    const-wide/16 v5, 0x0

    .line 574
    .line 575
    cmp-long v1, v1, v5

    .line 576
    .line 577
    if-nez v1, :cond_1d

    .line 578
    .line 579
    iput-boolean v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 580
    .line 581
    return v18

    .line 582
    :cond_1d
    const-string v1, "long value not support input null"

    .line 583
    .line 584
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 589
    .line 590
    .line 591
    return v18

    .line 592
    nop

    .line 593
    :pswitch_data_0
    .packed-switch 0x79
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    :sswitch_data_0
    .sparse-switch
        0x30 -> :sswitch_7
        0x31 -> :sswitch_6
        0x4e -> :sswitch_5
        0x59 -> :sswitch_4
        0x276d8e -> :sswitch_3
        0x36758e -> :sswitch_2
        0x3f92103 -> :sswitch_1
        0x5cb1923 -> :sswitch_0
    .end sparse-switch

    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_3
    .end packed-switch
.end method

.method public final 飘花落叶言楪哲子兰世苏([BB)J
    .locals 7

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    invoke-static {p2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    int-to-long p0, p2

    .line 10
    return-wide p0

    .line 11
    :cond_0
    invoke-static {p2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(I)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-static {v0, p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰子哲世(I[BI)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    int-to-long p1, p1

    .line 23
    add-int/2addr v0, v2

    .line 24
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 25
    .line 26
    return-wide p1

    .line 27
    :cond_1
    invoke-static {p2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(I)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏兰楪:I

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    add-int/lit8 v1, v0, 0x1

    .line 36
    .line 37
    if-ge v1, v3, :cond_2

    .line 38
    .line 39
    add-int/lit8 v1, v0, 0x2

    .line 40
    .line 41
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 42
    .line 43
    invoke-static {v0, p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰子世哲(I[BI)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    int-to-long p0, p0

    .line 48
    return-wide p0

    .line 49
    :cond_2
    const/16 v0, -0x47

    .line 50
    .line 51
    if-eq p2, v0, :cond_f

    .line 52
    .line 53
    const/16 v0, 0x48

    .line 54
    .line 55
    if-eq p2, v0, :cond_e

    .line 56
    .line 57
    const/16 v0, 0x7c

    .line 58
    .line 59
    const/4 v1, -0x1

    .line 60
    const/16 v4, 0x2e

    .line 61
    .line 62
    if-eq p2, v0, :cond_c

    .line 63
    .line 64
    const/16 v0, -0x44

    .line 65
    .line 66
    if-eq p2, v0, :cond_b

    .line 67
    .line 68
    const/16 v0, -0x43

    .line 69
    .line 70
    if-eq p2, v0, :cond_a

    .line 71
    .line 72
    const/16 v0, 0x79

    .line 73
    .line 74
    if-eq p2, v0, :cond_8

    .line 75
    .line 76
    const/16 v0, 0x7a

    .line 77
    .line 78
    if-eq p2, v0, :cond_6

    .line 79
    .line 80
    packed-switch p2, :pswitch_data_0

    .line 81
    .line 82
    .line 83
    const-wide/16 v5, 0x0

    .line 84
    .line 85
    packed-switch p2, :pswitch_data_1

    .line 86
    .line 87
    .line 88
    const/16 p1, 0x49

    .line 89
    .line 90
    if-lt p2, p1, :cond_4

    .line 91
    .line 92
    const/16 v0, 0x78

    .line 93
    .line 94
    if-gt p2, v0, :cond_4

    .line 95
    .line 96
    sub-int/2addr p2, p1

    .line 97
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子世兰苏(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 102
    .line 103
    add-int/2addr v0, p2

    .line 104
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 105
    .line 106
    invoke-virtual {p1, v4}, Ljava/lang/String;->indexOf(I)I

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    if-ne p0, v1, :cond_3

    .line 111
    .line 112
    new-instance p0, Ljava/math/BigInteger;

    .line 113
    .line 114
    invoke-direct {p0, p1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Ljava/math/BigInteger;->longValue()J

    .line 118
    .line 119
    .line 120
    move-result-wide p0

    .line 121
    return-wide p0

    .line 122
    :cond_3
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-virtual {p0}, Ljava/math/BigDecimal;->longValue()J

    .line 127
    .line 128
    .line 129
    move-result-wide p0

    .line 130
    return-wide p0

    .line 131
    :cond_4
    invoke-static {p2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(B)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    iget p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 136
    .line 137
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 138
    .line 139
    array-length p0, p0

    .line 140
    const-string v0, "readInt64Value not support "

    .line 141
    .line 142
    invoke-static {v0, p1, p2, p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;Ljava/lang/Object;II)V

    .line 143
    .line 144
    .line 145
    return-wide v5

    .line 146
    :pswitch_0
    iget p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 147
    .line 148
    invoke-static {p2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 149
    .line 150
    .line 151
    invoke-static {p1, p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    iget p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 156
    .line 157
    add-int/lit8 p2, p2, 0x4

    .line 158
    .line 159
    iput p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 160
    .line 161
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    float-to-long p0, p0

    .line 166
    return-wide p0

    .line 167
    :pswitch_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 168
    .line 169
    .line 170
    move-result p0

    .line 171
    int-to-float p0, p0

    .line 172
    float-to-long p0, p0

    .line 173
    return-wide p0

    .line 174
    :pswitch_2
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 175
    .line 176
    sub-int/2addr p1, v2

    .line 177
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 178
    .line 179
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰苏世楪哲()D

    .line 180
    .line 181
    .line 182
    move-result-wide p0

    .line 183
    double-to-long p0, p0

    .line 184
    return-wide p0

    .line 185
    :pswitch_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世兰苏哲()J

    .line 186
    .line 187
    .line 188
    move-result-wide p0

    .line 189
    long-to-double p0, p0

    .line 190
    double-to-long p0, p0

    .line 191
    return-wide p0

    .line 192
    :pswitch_4
    const-wide/16 p0, 0x1

    .line 193
    .line 194
    return-wide p0

    .line 195
    :pswitch_5
    return-wide v5

    .line 196
    :pswitch_6
    iget-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 197
    .line 198
    iget-wide p1, p1, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 199
    .line 200
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNullForPrimitives:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 201
    .line 202
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 203
    .line 204
    and-long/2addr p1, v0

    .line 205
    cmp-long p1, p1, v5

    .line 206
    .line 207
    if-nez p1, :cond_5

    .line 208
    .line 209
    iput-boolean v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 210
    .line 211
    return-wide v5

    .line 212
    :cond_5
    const-string p1, "long value not support input null"

    .line 213
    .line 214
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    return-wide v5

    .line 222
    :pswitch_7
    iget p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 223
    .line 224
    invoke-static {p2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 225
    .line 226
    .line 227
    invoke-static {p1, p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 228
    .line 229
    .line 230
    move-result p1

    .line 231
    int-to-long p1, p1

    .line 232
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 233
    .line 234
    add-int/lit8 v0, v0, 0x4

    .line 235
    .line 236
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 237
    .line 238
    const-wide/32 v0, 0xea60

    .line 239
    .line 240
    .line 241
    mul-long/2addr p1, v0

    .line 242
    return-wide p1

    .line 243
    :pswitch_8
    iget p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 244
    .line 245
    invoke-static {p2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 246
    .line 247
    .line 248
    invoke-static {p1, p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 249
    .line 250
    .line 251
    move-result p1

    .line 252
    int-to-long p1, p1

    .line 253
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 254
    .line 255
    add-int/lit8 v0, v0, 0x4

    .line 256
    .line 257
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 258
    .line 259
    const-wide/16 v0, 0x3e8

    .line 260
    .line 261
    mul-long/2addr p1, v0

    .line 262
    return-wide p1

    .line 263
    :pswitch_9
    iget p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 264
    .line 265
    invoke-static {p2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲兰子世(II)V

    .line 266
    .line 267
    .line 268
    invoke-static {p1, p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲([BI)J

    .line 269
    .line 270
    .line 271
    move-result-wide p1

    .line 272
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 273
    .line 274
    add-int/lit8 v0, v0, 0x8

    .line 275
    .line 276
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 277
    .line 278
    return-wide p1

    .line 279
    :cond_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 280
    .line 281
    .line 282
    move-result p2

    .line 283
    new-instance v0, Ljava/lang/String;

    .line 284
    .line 285
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 286
    .line 287
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 288
    .line 289
    invoke-direct {v0, p1, v2, p2, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 290
    .line 291
    .line 292
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 293
    .line 294
    add-int/2addr p1, p2

    .line 295
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 296
    .line 297
    invoke-virtual {v0, v4}, Ljava/lang/String;->indexOf(I)I

    .line 298
    .line 299
    .line 300
    move-result p0

    .line 301
    if-ne p0, v1, :cond_7

    .line 302
    .line 303
    new-instance p0, Ljava/math/BigInteger;

    .line 304
    .line 305
    invoke-direct {p0, v0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {p0}, Ljava/math/BigInteger;->intValue()I

    .line 309
    .line 310
    .line 311
    move-result p0

    .line 312
    int-to-long p0, p0

    .line 313
    return-wide p0

    .line 314
    :cond_7
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 315
    .line 316
    .line 317
    move-result-object p0

    .line 318
    invoke-virtual {p0}, Ljava/math/BigDecimal;->intValue()I

    .line 319
    .line 320
    .line 321
    move-result p0

    .line 322
    int-to-long p0, p0

    .line 323
    return-wide p0

    .line 324
    :cond_8
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 325
    .line 326
    .line 327
    move-result p2

    .line 328
    new-instance v0, Ljava/lang/String;

    .line 329
    .line 330
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 331
    .line 332
    sget-object v3, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 333
    .line 334
    invoke-direct {v0, p1, v2, p2, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 335
    .line 336
    .line 337
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 338
    .line 339
    add-int/2addr p1, p2

    .line 340
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 341
    .line 342
    invoke-virtual {v0, v4}, Ljava/lang/String;->indexOf(I)I

    .line 343
    .line 344
    .line 345
    move-result p0

    .line 346
    if-ne p0, v1, :cond_9

    .line 347
    .line 348
    new-instance p0, Ljava/math/BigInteger;

    .line 349
    .line 350
    invoke-direct {p0, v0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {p0}, Ljava/math/BigInteger;->intValue()I

    .line 354
    .line 355
    .line 356
    move-result p0

    .line 357
    int-to-long p0, p0

    .line 358
    return-wide p0

    .line 359
    :cond_9
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 360
    .line 361
    .line 362
    move-result-object p0

    .line 363
    invoke-virtual {p0}, Ljava/math/BigDecimal;->intValue()I

    .line 364
    .line 365
    .line 366
    move-result p0

    .line 367
    int-to-long p0, p0

    .line 368
    return-wide p0

    .line 369
    :cond_a
    iget p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 370
    .line 371
    add-int/lit8 v0, p2, 0x1

    .line 372
    .line 373
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 374
    .line 375
    aget-byte p0, p1, p2

    .line 376
    .line 377
    int-to-long p0, p0

    .line 378
    return-wide p0

    .line 379
    :cond_b
    iget p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 380
    .line 381
    add-int/lit8 v0, p2, 0x1

    .line 382
    .line 383
    aget-byte v0, p1, v0

    .line 384
    .line 385
    and-int/lit16 v0, v0, 0xff

    .line 386
    .line 387
    aget-byte p1, p1, p2

    .line 388
    .line 389
    shl-int/lit8 p1, p1, 0x8

    .line 390
    .line 391
    add-int/2addr v0, p1

    .line 392
    add-int/lit8 p2, p2, 0x2

    .line 393
    .line 394
    iput p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 395
    .line 396
    int-to-long p0, v0

    .line 397
    return-wide p0

    .line 398
    :cond_c
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 399
    .line 400
    .line 401
    move-result p2

    .line 402
    new-instance v0, Ljava/lang/String;

    .line 403
    .line 404
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 405
    .line 406
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 407
    .line 408
    invoke-direct {v0, p1, v2, p2, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 409
    .line 410
    .line 411
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 412
    .line 413
    add-int/2addr p1, p2

    .line 414
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 415
    .line 416
    invoke-virtual {v0, v4}, Ljava/lang/String;->indexOf(I)I

    .line 417
    .line 418
    .line 419
    move-result p0

    .line 420
    if-ne p0, v1, :cond_d

    .line 421
    .line 422
    new-instance p0, Ljava/math/BigInteger;

    .line 423
    .line 424
    invoke-direct {p0, v0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {p0}, Ljava/math/BigInteger;->intValue()I

    .line 428
    .line 429
    .line 430
    move-result p0

    .line 431
    int-to-long p0, p0

    .line 432
    return-wide p0

    .line 433
    :cond_d
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 434
    .line 435
    .line 436
    move-result-object p0

    .line 437
    invoke-virtual {p0}, Ljava/math/BigDecimal;->intValue()I

    .line 438
    .line 439
    .line 440
    move-result p0

    .line 441
    int-to-long p0, p0

    .line 442
    return-wide p0

    .line 443
    :cond_e
    iget p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 444
    .line 445
    invoke-static {p2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 446
    .line 447
    .line 448
    invoke-static {p1, p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 449
    .line 450
    .line 451
    move-result p1

    .line 452
    iget p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 453
    .line 454
    add-int/lit8 p2, p2, 0x4

    .line 455
    .line 456
    iput p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 457
    .line 458
    int-to-long p0, p1

    .line 459
    return-wide p0

    .line 460
    :cond_f
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 461
    .line 462
    .line 463
    move-result p1

    .line 464
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰世楪哲苏()Ljava/math/BigInteger;

    .line 465
    .line 466
    .line 467
    move-result-object p0

    .line 468
    if-nez p1, :cond_10

    .line 469
    .line 470
    new-instance p1, Ljava/math/BigDecimal;

    .line 471
    .line 472
    invoke-direct {p1, p0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 473
    .line 474
    .line 475
    goto :goto_0

    .line 476
    :cond_10
    new-instance p2, Ljava/math/BigDecimal;

    .line 477
    .line 478
    invoke-direct {p2, p0, p1}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 479
    .line 480
    .line 481
    move-object p1, p2

    .line 482
    :goto_0
    invoke-virtual {p1}, Ljava/math/BigDecimal;->longValue()J

    .line 483
    .line 484
    .line 485
    move-result-wide p0

    .line 486
    return-wide p0

    .line 487
    :pswitch_data_0
    .packed-switch -0x55
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch

    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    :pswitch_data_1
    .packed-switch -0x51
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言楪哲子兰苏世()I
    .locals 6

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 6
    .line 7
    aget-byte v3, v2, v0

    .line 8
    .line 9
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(I)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(I)Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-eqz v4, :cond_1

    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x2

    .line 23
    .line 24
    invoke-static {v1, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰子哲世(I[BI)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    move v1, v0

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(I)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    iget v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏兰楪:I

    .line 35
    .line 36
    if-eqz v4, :cond_2

    .line 37
    .line 38
    add-int/lit8 v4, v0, 0x2

    .line 39
    .line 40
    if-ge v4, v5, :cond_2

    .line 41
    .line 42
    invoke-static {v1, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰子世哲(I[BI)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    add-int/lit8 v1, v0, 0x3

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const/16 v4, 0x48

    .line 50
    .line 51
    if-ne v3, v4, :cond_4

    .line 52
    .line 53
    add-int/lit8 v4, v0, 0x4

    .line 54
    .line 55
    if-ge v4, v5, :cond_4

    .line 56
    .line 57
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    add-int/lit8 v1, v0, 0x5

    .line 62
    .line 63
    const/high16 v0, 0x10000000

    .line 64
    .line 65
    if-gt v3, v0, :cond_3

    .line 66
    .line 67
    :goto_0
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 68
    .line 69
    return v3

    .line 70
    :cond_3
    const-string p0, "input length overflow"

    .line 71
    .line 72
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/4 p0, 0x0

    .line 76
    return p0

    .line 77
    :cond_4
    int-to-byte p0, v3

    .line 78
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰哲世子(B)Lcom/alibaba/fastjson2/JSONException;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    throw p0
.end method

.method public final 飘花落叶言楪哲子苏世兰()F
    .locals 8

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 6
    .line 7
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 8
    .line 9
    aget-byte v3, v2, v0

    .line 10
    .line 11
    const/16 v4, -0x47

    .line 12
    .line 13
    if-eq v3, v4, :cond_10

    .line 14
    .line 15
    const/16 v4, 0x48

    .line 16
    .line 17
    iget v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏兰楪:I

    .line 18
    .line 19
    if-eq v3, v4, :cond_f

    .line 20
    .line 21
    const/16 v4, 0x7c

    .line 22
    .line 23
    const/4 v6, -0x1

    .line 24
    const/16 v7, 0x2e

    .line 25
    .line 26
    if-eq v3, v4, :cond_d

    .line 27
    .line 28
    const/16 v4, 0x79

    .line 29
    .line 30
    if-eq v3, v4, :cond_b

    .line 31
    .line 32
    const/16 v4, 0x7a

    .line 33
    .line 34
    if-eq v3, v4, :cond_9

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    packed-switch v3, :pswitch_data_0

    .line 38
    .line 39
    .line 40
    packed-switch v3, :pswitch_data_1

    .line 41
    .line 42
    .line 43
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(I)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    int-to-float p0, v3

    .line 50
    return p0

    .line 51
    :cond_0
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(I)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 58
    .line 59
    add-int/lit8 v1, v0, 0x1

    .line 60
    .line 61
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 62
    .line 63
    invoke-static {v0, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰子哲世(I[BI)I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    int-to-float p0, p0

    .line 68
    return p0

    .line 69
    :cond_1
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(I)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_2

    .line 74
    .line 75
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 76
    .line 77
    add-int/lit8 v1, v0, 0x1

    .line 78
    .line 79
    if-ge v1, v5, :cond_2

    .line 80
    .line 81
    invoke-static {v0, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰子世哲(I[BI)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 86
    .line 87
    add-int/lit8 v1, v1, 0x2

    .line 88
    .line 89
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 90
    .line 91
    int-to-float p0, v0

    .line 92
    return p0

    .line 93
    :cond_2
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(I)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_3

    .line 98
    .line 99
    add-int/lit8 v3, v3, 0x20

    .line 100
    .line 101
    int-to-float p0, v3

    .line 102
    return p0

    .line 103
    :cond_3
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(I)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_4

    .line 108
    .line 109
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 110
    .line 111
    add-int/lit8 v1, v0, 0x1

    .line 112
    .line 113
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 114
    .line 115
    invoke-static {v0, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰世哲子(I[BI)I

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    int-to-float p0, p0

    .line 120
    return p0

    .line 121
    :cond_4
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲(I)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_5

    .line 126
    .line 127
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 128
    .line 129
    add-int/lit8 v1, v0, 0x1

    .line 130
    .line 131
    if-ge v1, v5, :cond_5

    .line 132
    .line 133
    invoke-static {v0, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰世子哲(I[BI)I

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 138
    .line 139
    add-int/lit8 v1, v1, 0x2

    .line 140
    .line 141
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 142
    .line 143
    int-to-float p0, v0

    .line 144
    return p0

    .line 145
    :cond_5
    const/16 v0, 0x49

    .line 146
    .line 147
    if-lt v3, v0, :cond_7

    .line 148
    .line 149
    const/16 v1, 0x78

    .line 150
    .line 151
    if-gt v3, v1, :cond_7

    .line 152
    .line 153
    sub-int/2addr v3, v0

    .line 154
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子世兰苏(I)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 159
    .line 160
    add-int/2addr v1, v3

    .line 161
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 162
    .line 163
    invoke-virtual {v0, v7}, Ljava/lang/String;->indexOf(I)I

    .line 164
    .line 165
    .line 166
    move-result p0

    .line 167
    if-ne p0, v6, :cond_6

    .line 168
    .line 169
    new-instance p0, Ljava/math/BigInteger;

    .line 170
    .line 171
    invoke-direct {p0, v0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0}, Ljava/math/BigInteger;->intValue()I

    .line 175
    .line 176
    .line 177
    move-result p0

    .line 178
    int-to-float p0, p0

    .line 179
    return p0

    .line 180
    :cond_6
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    invoke-virtual {p0}, Ljava/math/BigDecimal;->intValue()I

    .line 185
    .line 186
    .line 187
    move-result p0

    .line 188
    int-to-float p0, p0

    .line 189
    return p0

    .line 190
    :cond_7
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰哲世子(B)Lcom/alibaba/fastjson2/JSONException;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    throw p0

    .line 195
    :pswitch_0
    invoke-static {v1, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲兰子世(II)V

    .line 196
    .line 197
    .line 198
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲([BI)J

    .line 199
    .line 200
    .line 201
    move-result-wide v0

    .line 202
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 203
    .line 204
    add-int/lit8 v2, v2, 0x8

    .line 205
    .line 206
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 207
    .line 208
    long-to-float p0, v0

    .line 209
    return p0

    .line 210
    :pswitch_1
    add-int/lit8 v0, v0, 0x2

    .line 211
    .line 212
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 213
    .line 214
    aget-byte p0, v2, v1

    .line 215
    .line 216
    int-to-float p0, p0

    .line 217
    return p0

    .line 218
    :pswitch_2
    add-int/lit8 v3, v0, 0x2

    .line 219
    .line 220
    aget-byte v3, v2, v3

    .line 221
    .line 222
    and-int/lit16 v3, v3, 0xff

    .line 223
    .line 224
    aget-byte v1, v2, v1

    .line 225
    .line 226
    shl-int/lit8 v1, v1, 0x8

    .line 227
    .line 228
    add-int/2addr v3, v1

    .line 229
    add-int/lit8 v0, v0, 0x3

    .line 230
    .line 231
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 232
    .line 233
    int-to-float p0, v3

    .line 234
    return p0

    .line 235
    :pswitch_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 236
    .line 237
    .line 238
    move-result p0

    .line 239
    int-to-float p0, p0

    .line 240
    return p0

    .line 241
    :pswitch_4
    invoke-static {v1, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲兰子世(II)V

    .line 242
    .line 243
    .line 244
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲([BI)J

    .line 245
    .line 246
    .line 247
    move-result-wide v0

    .line 248
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 249
    .line 250
    add-int/lit8 v2, v2, 0x8

    .line 251
    .line 252
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 253
    .line 254
    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 255
    .line 256
    .line 257
    move-result-wide v0

    .line 258
    double-to-float p0, v0

    .line 259
    return p0

    .line 260
    :pswitch_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世兰苏哲()J

    .line 261
    .line 262
    .line 263
    move-result-wide v0

    .line 264
    long-to-double v0, v0

    .line 265
    double-to-float p0, v0

    .line 266
    return p0

    .line 267
    :pswitch_6
    const/high16 p0, 0x3f800000    # 1.0f

    .line 268
    .line 269
    return p0

    .line 270
    :pswitch_7
    return v4

    .line 271
    :pswitch_8
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 272
    .line 273
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 274
    .line 275
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNullForPrimitives:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 276
    .line 277
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 278
    .line 279
    and-long/2addr v0, v2

    .line 280
    const-wide/16 v2, 0x0

    .line 281
    .line 282
    cmp-long v0, v0, v2

    .line 283
    .line 284
    if-nez v0, :cond_8

    .line 285
    .line 286
    const/4 v0, 0x1

    .line 287
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 288
    .line 289
    return v4

    .line 290
    :cond_8
    const-string v0, "long value not support input null"

    .line 291
    .line 292
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    return v4

    .line 300
    :cond_9
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    new-instance v1, Ljava/lang/String;

    .line 305
    .line 306
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 307
    .line 308
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 309
    .line 310
    invoke-direct {v1, v2, v3, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 311
    .line 312
    .line 313
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 314
    .line 315
    add-int/2addr v2, v0

    .line 316
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 317
    .line 318
    invoke-virtual {v1, v7}, Ljava/lang/String;->indexOf(I)I

    .line 319
    .line 320
    .line 321
    move-result p0

    .line 322
    if-ne p0, v6, :cond_a

    .line 323
    .line 324
    new-instance p0, Ljava/math/BigInteger;

    .line 325
    .line 326
    invoke-direct {p0, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {p0}, Ljava/math/BigInteger;->intValue()I

    .line 330
    .line 331
    .line 332
    move-result p0

    .line 333
    int-to-float p0, p0

    .line 334
    return p0

    .line 335
    :cond_a
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 336
    .line 337
    .line 338
    move-result-object p0

    .line 339
    invoke-virtual {p0}, Ljava/math/BigDecimal;->intValue()I

    .line 340
    .line 341
    .line 342
    move-result p0

    .line 343
    int-to-float p0, p0

    .line 344
    return p0

    .line 345
    :cond_b
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    new-instance v1, Ljava/lang/String;

    .line 350
    .line 351
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 352
    .line 353
    sget-object v4, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 354
    .line 355
    invoke-direct {v1, v2, v3, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 356
    .line 357
    .line 358
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 359
    .line 360
    add-int/2addr v2, v0

    .line 361
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 362
    .line 363
    invoke-virtual {v1, v7}, Ljava/lang/String;->indexOf(I)I

    .line 364
    .line 365
    .line 366
    move-result p0

    .line 367
    if-ne p0, v6, :cond_c

    .line 368
    .line 369
    new-instance p0, Ljava/math/BigInteger;

    .line 370
    .line 371
    invoke-direct {p0, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {p0}, Ljava/math/BigInteger;->intValue()I

    .line 375
    .line 376
    .line 377
    move-result p0

    .line 378
    int-to-float p0, p0

    .line 379
    return p0

    .line 380
    :cond_c
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 381
    .line 382
    .line 383
    move-result-object p0

    .line 384
    invoke-virtual {p0}, Ljava/math/BigDecimal;->intValue()I

    .line 385
    .line 386
    .line 387
    move-result p0

    .line 388
    int-to-float p0, p0

    .line 389
    return p0

    .line 390
    :cond_d
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    new-instance v1, Ljava/lang/String;

    .line 395
    .line 396
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 397
    .line 398
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 399
    .line 400
    invoke-direct {v1, v2, v3, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 401
    .line 402
    .line 403
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 404
    .line 405
    add-int/2addr v2, v0

    .line 406
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 407
    .line 408
    invoke-virtual {v1, v7}, Ljava/lang/String;->indexOf(I)I

    .line 409
    .line 410
    .line 411
    move-result p0

    .line 412
    if-ne p0, v6, :cond_e

    .line 413
    .line 414
    new-instance p0, Ljava/math/BigInteger;

    .line 415
    .line 416
    invoke-direct {p0, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {p0}, Ljava/math/BigInteger;->intValue()I

    .line 420
    .line 421
    .line 422
    move-result p0

    .line 423
    int-to-float p0, p0

    .line 424
    return p0

    .line 425
    :cond_e
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 426
    .line 427
    .line 428
    move-result-object p0

    .line 429
    invoke-virtual {p0}, Ljava/math/BigDecimal;->intValue()I

    .line 430
    .line 431
    .line 432
    move-result p0

    .line 433
    int-to-float p0, p0

    .line 434
    return p0

    .line 435
    :cond_f
    :pswitch_9
    invoke-static {v1, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 436
    .line 437
    .line 438
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 439
    .line 440
    .line 441
    move-result v0

    .line 442
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 443
    .line 444
    add-int/lit8 v1, v1, 0x4

    .line 445
    .line 446
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 447
    .line 448
    int-to-float p0, v0

    .line 449
    return p0

    .line 450
    :cond_10
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 451
    .line 452
    .line 453
    move-result v0

    .line 454
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰世楪哲苏()Ljava/math/BigInteger;

    .line 455
    .line 456
    .line 457
    move-result-object p0

    .line 458
    if-nez v0, :cond_11

    .line 459
    .line 460
    new-instance v0, Ljava/math/BigDecimal;

    .line 461
    .line 462
    invoke-direct {v0, p0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 463
    .line 464
    .line 465
    goto :goto_0

    .line 466
    :cond_11
    new-instance v1, Ljava/math/BigDecimal;

    .line 467
    .line 468
    invoke-direct {v1, p0, v0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 469
    .line 470
    .line 471
    move-object v0, v1

    .line 472
    :goto_0
    invoke-virtual {v0}, Ljava/math/BigDecimal;->intValue()I

    .line 473
    .line 474
    .line 475
    move-result p0

    .line 476
    int-to-float p0, p0

    .line 477
    return p0

    .line 478
    nop

    .line 479
    :pswitch_data_0
    .packed-switch -0x51
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    :pswitch_data_1
    .packed-switch -0x44
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_9
    .end packed-switch
.end method

.method public final 飘花落叶言楪哲子苏兰世([BB)I
    .locals 5

    .line 1
    invoke-static {p2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    add-int/lit8 p2, p2, 0x20

    .line 8
    .line 9
    return p2

    .line 10
    :cond_0
    invoke-static {p2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(I)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 17
    .line 18
    add-int/lit8 v1, v0, 0x1

    .line 19
    .line 20
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 21
    .line 22
    invoke-static {v0, p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰世哲子(I[BI)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_1
    invoke-static {p2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲(I)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏兰楪:I

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 36
    .line 37
    add-int/lit8 v2, v0, 0x1

    .line 38
    .line 39
    if-ge v2, v1, :cond_2

    .line 40
    .line 41
    invoke-static {v0, p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰世子哲(I[BI)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    iget p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 46
    .line 47
    add-int/lit8 p2, p2, 0x2

    .line 48
    .line 49
    iput p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 50
    .line 51
    return p1

    .line 52
    :cond_2
    const/16 v0, -0x47

    .line 53
    .line 54
    if-eq p2, v0, :cond_c

    .line 55
    .line 56
    const/16 v0, 0x7c

    .line 57
    .line 58
    const/4 v2, -0x1

    .line 59
    const/16 v3, 0x2e

    .line 60
    .line 61
    if-eq p2, v0, :cond_a

    .line 62
    .line 63
    const/16 v0, 0x79

    .line 64
    .line 65
    if-eq p2, v0, :cond_8

    .line 66
    .line 67
    const/16 v0, 0x7a

    .line 68
    .line 69
    if-eq p2, v0, :cond_6

    .line 70
    .line 71
    packed-switch p2, :pswitch_data_0

    .line 72
    .line 73
    .line 74
    const/4 v0, 0x0

    .line 75
    const/4 v4, 0x1

    .line 76
    packed-switch p2, :pswitch_data_1

    .line 77
    .line 78
    .line 79
    packed-switch p2, :pswitch_data_2

    .line 80
    .line 81
    .line 82
    const/16 p1, 0x49

    .line 83
    .line 84
    if-lt p2, p1, :cond_4

    .line 85
    .line 86
    const/16 v1, 0x78

    .line 87
    .line 88
    if-gt p2, v1, :cond_4

    .line 89
    .line 90
    sub-int/2addr p2, p1

    .line 91
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子世兰苏(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 96
    .line 97
    add-int/2addr v0, p2

    .line 98
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 99
    .line 100
    invoke-virtual {p1, v3}, Ljava/lang/String;->indexOf(I)I

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    if-ne p0, v2, :cond_3

    .line 105
    .line 106
    new-instance p0, Ljava/math/BigInteger;

    .line 107
    .line 108
    invoke-direct {p0, p1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Ljava/math/BigInteger;->intValue()I

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    return p0

    .line 116
    :cond_3
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {p0}, Ljava/math/BigDecimal;->intValue()I

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    return p0

    .line 125
    :cond_4
    invoke-static {p2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(B)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    iget p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 130
    .line 131
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 132
    .line 133
    array-length p0, p0

    .line 134
    const-string v1, "readInt32Value not support "

    .line 135
    .line 136
    invoke-static {v1, p1, p2, p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;Ljava/lang/Object;II)V

    .line 137
    .line 138
    .line 139
    return v0

    .line 140
    :pswitch_0
    iget p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 141
    .line 142
    invoke-static {p2, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲兰子世(II)V

    .line 143
    .line 144
    .line 145
    invoke-static {p1, p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲([BI)J

    .line 146
    .line 147
    .line 148
    move-result-wide p1

    .line 149
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 150
    .line 151
    add-int/lit8 v0, v0, 0x8

    .line 152
    .line 153
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 154
    .line 155
    long-to-int p0, p1

    .line 156
    return p0

    .line 157
    :pswitch_1
    iget p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 158
    .line 159
    add-int/lit8 v0, p2, 0x1

    .line 160
    .line 161
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 162
    .line 163
    aget-byte p0, p1, p2

    .line 164
    .line 165
    return p0

    .line 166
    :pswitch_2
    iget p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 167
    .line 168
    add-int/lit8 v0, p2, 0x1

    .line 169
    .line 170
    aget-byte v0, p1, v0

    .line 171
    .line 172
    and-int/lit16 v0, v0, 0xff

    .line 173
    .line 174
    aget-byte p1, p1, p2

    .line 175
    .line 176
    shl-int/lit8 p1, p1, 0x8

    .line 177
    .line 178
    add-int/2addr v0, p1

    .line 179
    add-int/lit8 p2, p2, 0x2

    .line 180
    .line 181
    iput p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 182
    .line 183
    return v0

    .line 184
    :pswitch_3
    iget p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 185
    .line 186
    invoke-static {p2, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 187
    .line 188
    .line 189
    invoke-static {p1, p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    iget p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 194
    .line 195
    add-int/lit8 p2, p2, 0x4

    .line 196
    .line 197
    iput p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 198
    .line 199
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 200
    .line 201
    .line 202
    move-result p0

    .line 203
    float-to-int p0, p0

    .line 204
    return p0

    .line 205
    :pswitch_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 206
    .line 207
    .line 208
    move-result p0

    .line 209
    int-to-float p0, p0

    .line 210
    float-to-int p0, p0

    .line 211
    return p0

    .line 212
    :pswitch_5
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 213
    .line 214
    sub-int/2addr p1, v4

    .line 215
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 216
    .line 217
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰苏世楪哲()D

    .line 218
    .line 219
    .line 220
    move-result-wide p0

    .line 221
    double-to-int p0, p0

    .line 222
    return p0

    .line 223
    :pswitch_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世兰苏哲()J

    .line 224
    .line 225
    .line 226
    move-result-wide p0

    .line 227
    long-to-int p0, p0

    .line 228
    return p0

    .line 229
    :pswitch_7
    return v4

    .line 230
    :pswitch_8
    return v0

    .line 231
    :pswitch_9
    iget-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 232
    .line 233
    iget-wide p1, p1, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 234
    .line 235
    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNullForPrimitives:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 236
    .line 237
    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 238
    .line 239
    and-long/2addr p1, v1

    .line 240
    const-wide/16 v1, 0x0

    .line 241
    .line 242
    cmp-long p1, p1, v1

    .line 243
    .line 244
    if-nez p1, :cond_5

    .line 245
    .line 246
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 247
    .line 248
    return v0

    .line 249
    :cond_5
    const-string p1, "int value not support input null"

    .line 250
    .line 251
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    return v0

    .line 259
    :pswitch_a
    iget p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 260
    .line 261
    invoke-static {p2, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 262
    .line 263
    .line 264
    invoke-static {p1, p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 265
    .line 266
    .line 267
    move-result p1

    .line 268
    iget p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 269
    .line 270
    add-int/lit8 p2, p2, 0x4

    .line 271
    .line 272
    iput p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 273
    .line 274
    return p1

    .line 275
    :pswitch_b
    iget p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 276
    .line 277
    invoke-static {p2, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲兰子世(II)V

    .line 278
    .line 279
    .line 280
    invoke-static {p1, p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲([BI)J

    .line 281
    .line 282
    .line 283
    move-result-wide p1

    .line 284
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 285
    .line 286
    add-int/lit8 v0, v0, 0x8

    .line 287
    .line 288
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 289
    .line 290
    long-to-int p0, p1

    .line 291
    return p0

    .line 292
    :cond_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 293
    .line 294
    .line 295
    move-result p2

    .line 296
    new-instance v0, Ljava/lang/String;

    .line 297
    .line 298
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 299
    .line 300
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 301
    .line 302
    invoke-direct {v0, p1, v1, p2, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 303
    .line 304
    .line 305
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 306
    .line 307
    add-int/2addr p1, p2

    .line 308
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 309
    .line 310
    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(I)I

    .line 311
    .line 312
    .line 313
    move-result p0

    .line 314
    if-ne p0, v2, :cond_7

    .line 315
    .line 316
    new-instance p0, Ljava/math/BigInteger;

    .line 317
    .line 318
    invoke-direct {p0, v0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {p0}, Ljava/math/BigInteger;->intValue()I

    .line 322
    .line 323
    .line 324
    move-result p0

    .line 325
    return p0

    .line 326
    :cond_7
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 327
    .line 328
    .line 329
    move-result-object p0

    .line 330
    invoke-virtual {p0}, Ljava/math/BigDecimal;->intValue()I

    .line 331
    .line 332
    .line 333
    move-result p0

    .line 334
    return p0

    .line 335
    :cond_8
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 336
    .line 337
    .line 338
    move-result p2

    .line 339
    new-instance v0, Ljava/lang/String;

    .line 340
    .line 341
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 342
    .line 343
    sget-object v4, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 344
    .line 345
    invoke-direct {v0, p1, v1, p2, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 346
    .line 347
    .line 348
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 349
    .line 350
    add-int/2addr p1, p2

    .line 351
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 352
    .line 353
    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(I)I

    .line 354
    .line 355
    .line 356
    move-result p0

    .line 357
    if-ne p0, v2, :cond_9

    .line 358
    .line 359
    new-instance p0, Ljava/math/BigInteger;

    .line 360
    .line 361
    invoke-direct {p0, v0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {p0}, Ljava/math/BigInteger;->intValue()I

    .line 365
    .line 366
    .line 367
    move-result p0

    .line 368
    return p0

    .line 369
    :cond_9
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 370
    .line 371
    .line 372
    move-result-object p0

    .line 373
    invoke-virtual {p0}, Ljava/math/BigDecimal;->intValue()I

    .line 374
    .line 375
    .line 376
    move-result p0

    .line 377
    return p0

    .line 378
    :cond_a
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 379
    .line 380
    .line 381
    move-result p2

    .line 382
    new-instance v0, Ljava/lang/String;

    .line 383
    .line 384
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 385
    .line 386
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 387
    .line 388
    invoke-direct {v0, p1, v1, p2, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 389
    .line 390
    .line 391
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 392
    .line 393
    add-int/2addr p1, p2

    .line 394
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 395
    .line 396
    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(I)I

    .line 397
    .line 398
    .line 399
    move-result p0

    .line 400
    if-ne p0, v2, :cond_b

    .line 401
    .line 402
    new-instance p0, Ljava/math/BigInteger;

    .line 403
    .line 404
    invoke-direct {p0, v0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {p0}, Ljava/math/BigInteger;->intValue()I

    .line 408
    .line 409
    .line 410
    move-result p0

    .line 411
    return p0

    .line 412
    :cond_b
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 413
    .line 414
    .line 415
    move-result-object p0

    .line 416
    invoke-virtual {p0}, Ljava/math/BigDecimal;->intValue()I

    .line 417
    .line 418
    .line 419
    move-result p0

    .line 420
    return p0

    .line 421
    :cond_c
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 422
    .line 423
    .line 424
    move-result p1

    .line 425
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰世楪哲苏()Ljava/math/BigInteger;

    .line 426
    .line 427
    .line 428
    move-result-object p0

    .line 429
    if-nez p1, :cond_d

    .line 430
    .line 431
    new-instance p1, Ljava/math/BigDecimal;

    .line 432
    .line 433
    invoke-direct {p1, p0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 434
    .line 435
    .line 436
    goto :goto_0

    .line 437
    :cond_d
    new-instance p2, Ljava/math/BigDecimal;

    .line 438
    .line 439
    invoke-direct {p2, p0, p1}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 440
    .line 441
    .line 442
    move-object p1, p2

    .line 443
    :goto_0
    invoke-virtual {p1}, Ljava/math/BigDecimal;->intValue()I

    .line 444
    .line 445
    .line 446
    move-result p0

    .line 447
    return p0

    .line 448
    nop

    .line 449
    :pswitch_data_0
    .packed-switch -0x55
        :pswitch_b
        :pswitch_a
        :pswitch_a
    .end packed-switch

    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    :pswitch_data_1
    .packed-switch -0x51
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    :pswitch_data_2
    .packed-switch -0x44
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_a
    .end packed-switch
.end method

.method public final 飘花落叶言楪子世兰哲苏()[J
    .locals 6

    .line 1
    const/16 v0, -0x6e

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子哲楪兰世苏(B)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏子世兰哲()J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    sget-wide v4, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪苏世哲;->飘花落叶言子楪世兰苏哲:J

    .line 15
    .line 16
    cmp-long v0, v2, v4

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    sget-wide v4, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪世哲苏;->飘花落叶言子楪世哲兰苏:J

    .line 21
    .line 22
    cmp-long v0, v2, v4

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    sget-wide v4, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世哲兰苏:J

    .line 27
    .line 28
    cmp-long v0, v2, v4

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    sget-wide v4, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪世苏哲;->飘花落叶言子楪世兰苏哲:J

    .line 33
    .line 34
    cmp-long v0, v2, v4

    .line 35
    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v2, "not support "

    .line 42
    .line 43
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏世兰子哲()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    const/4 v2, -0x1

    .line 70
    if-ne v0, v2, :cond_2

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_2
    new-array v1, v0, [J

    .line 74
    .line 75
    const/4 v2, 0x0

    .line 76
    :goto_1
    if-ge v2, v0, :cond_3

    .line 77
    .line 78
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世兰苏哲()J

    .line 79
    .line 80
    .line 81
    move-result-wide v3

    .line 82
    aput-wide v3, v1, v2

    .line 83
    .line 84
    add-int/lit8 v2, v2, 0x1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    return-object v1
.end method

.method public final 飘花落叶言楪子世兰苏哲()J
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 3
    .line 4
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 5
    .line 6
    add-int/lit8 v1, v0, 0x1

    .line 7
    .line 8
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 9
    .line 10
    aget-byte v3, v2, v0

    .line 11
    .line 12
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(I)Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    add-int/lit8 v3, v3, 0x20

    .line 19
    .line 20
    int-to-long v2, v3

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(I)Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    add-int/lit8 v0, v0, 0x2

    .line 29
    .line 30
    invoke-static {v1, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰世哲子(I[BI)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    int-to-long v2, v1

    .line 35
    move v1, v0

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲(I)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    iget v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏兰楪:I

    .line 42
    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    add-int/lit8 v4, v0, 0x2

    .line 46
    .line 47
    if-ge v4, v5, :cond_2

    .line 48
    .line 49
    invoke-static {v1, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰世子哲(I[BI)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    int-to-long v2, v1

    .line 54
    add-int/lit8 v1, v0, 0x3

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    const/16 v4, -0x41

    .line 58
    .line 59
    if-ne v3, v4, :cond_3

    .line 60
    .line 61
    add-int/lit8 v4, v0, 0x4

    .line 62
    .line 63
    if-ge v4, v5, :cond_3

    .line 64
    .line 65
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    int-to-long v2, v1

    .line 70
    add-int/lit8 v1, v0, 0x5

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    const/16 v4, -0x42

    .line 74
    .line 75
    if-ne v3, v4, :cond_4

    .line 76
    .line 77
    add-int/lit8 v4, v0, 0x8

    .line 78
    .line 79
    if-ge v4, v5, :cond_4

    .line 80
    .line 81
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲([BI)J

    .line 82
    .line 83
    .line 84
    move-result-wide v2

    .line 85
    add-int/lit8 v1, v0, 0x9

    .line 86
    .line 87
    :goto_0
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 88
    .line 89
    return-wide v2

    .line 90
    :cond_4
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 91
    .line 92
    invoke-virtual {p0, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰世苏([BB)J

    .line 93
    .line 94
    .line 95
    move-result-wide v0

    .line 96
    return-wide v0
.end method

.method public final 飘花落叶言楪子世哲兰苏()Ljava/lang/Long;
    .locals 6

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 6
    .line 7
    aget-byte v3, v2, v0

    .line 8
    .line 9
    const/16 v4, -0x51

    .line 10
    .line 11
    if-ne v3, v4, :cond_0

    .line 12
    .line 13
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(I)Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    add-int/lit8 v3, v3, 0x20

    .line 24
    .line 25
    int-to-long v2, v3

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(I)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_2

    .line 32
    .line 33
    add-int/lit8 v0, v0, 0x2

    .line 34
    .line 35
    invoke-static {v1, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰世哲子(I[BI)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    int-to-long v2, v1

    .line 40
    move v1, v0

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲(I)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    iget v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏兰楪:I

    .line 47
    .line 48
    if-eqz v4, :cond_3

    .line 49
    .line 50
    add-int/lit8 v4, v0, 0x2

    .line 51
    .line 52
    if-ge v4, v5, :cond_3

    .line 53
    .line 54
    invoke-static {v1, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰世子哲(I[BI)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    int-to-long v2, v1

    .line 59
    add-int/lit8 v1, v0, 0x3

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    const/16 v4, -0x41

    .line 63
    .line 64
    if-ne v3, v4, :cond_4

    .line 65
    .line 66
    add-int/lit8 v4, v0, 0x4

    .line 67
    .line 68
    if-ge v4, v5, :cond_4

    .line 69
    .line 70
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    int-to-long v2, v1

    .line 75
    add-int/lit8 v1, v0, 0x5

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_4
    const/16 v4, -0x42

    .line 79
    .line 80
    if-ne v3, v4, :cond_5

    .line 81
    .line 82
    add-int/lit8 v4, v0, 0x8

    .line 83
    .line 84
    if-ge v4, v5, :cond_5

    .line 85
    .line 86
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲([BI)J

    .line 87
    .line 88
    .line 89
    move-result-wide v2

    .line 90
    add-int/lit8 v1, v0, 0x9

    .line 91
    .line 92
    :goto_0
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 93
    .line 94
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :cond_5
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 100
    .line 101
    invoke-virtual {p0, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰世苏([BB)J

    .line 102
    .line 103
    .line 104
    move-result-wide v0

    .line 105
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0
.end method

.method public final 飘花落叶言楪子世苏兰哲()I
    .locals 6

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 6
    .line 7
    aget-byte v3, v2, v0

    .line 8
    .line 9
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(I)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(I)Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-eqz v4, :cond_1

    .line 21
    .line 22
    invoke-static {v1, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰子哲世(I[BI)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    add-int/lit8 v1, v0, 0x2

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(I)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    iget v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏兰楪:I

    .line 34
    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    add-int/lit8 v4, v0, 0x2

    .line 38
    .line 39
    if-ge v4, v5, :cond_2

    .line 40
    .line 41
    invoke-static {v1, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰子世哲(I[BI)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    add-int/lit8 v1, v0, 0x3

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const/16 v4, 0x48

    .line 49
    .line 50
    if-ne v3, v4, :cond_3

    .line 51
    .line 52
    add-int/lit8 v4, v0, 0x4

    .line 53
    .line 54
    if-ge v4, v5, :cond_3

    .line 55
    .line 56
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    add-int/lit8 v1, v0, 0x5

    .line 61
    .line 62
    :goto_0
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 63
    .line 64
    return v3

    .line 65
    :cond_3
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 66
    .line 67
    int-to-byte v0, v3

    .line 68
    invoke-virtual {p0, v2, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子苏兰世([BB)I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    return p0
.end method

.method public final 飘花落叶言楪子世苏哲兰()Ljava/lang/Integer;
    .locals 6

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 6
    .line 7
    aget-byte v3, v2, v0

    .line 8
    .line 9
    const/16 v4, -0x51

    .line 10
    .line 11
    if-ne v3, v4, :cond_0

    .line 12
    .line 13
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(I)Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(I)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_2

    .line 29
    .line 30
    add-int/lit8 v0, v0, 0x2

    .line 31
    .line 32
    invoke-static {v1, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰子哲世(I[BI)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    move v1, v0

    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(I)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    iget v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏兰楪:I

    .line 43
    .line 44
    if-eqz v4, :cond_3

    .line 45
    .line 46
    add-int/lit8 v4, v0, 0x2

    .line 47
    .line 48
    if-ge v4, v5, :cond_3

    .line 49
    .line 50
    invoke-static {v1, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰子世哲(I[BI)I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    add-int/lit8 v1, v0, 0x3

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    const/16 v4, 0x48

    .line 58
    .line 59
    if-ne v3, v4, :cond_4

    .line 60
    .line 61
    add-int/lit8 v4, v0, 0x4

    .line 62
    .line 63
    if-ge v4, v5, :cond_4

    .line 64
    .line 65
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    add-int/lit8 v1, v0, 0x5

    .line 70
    .line 71
    :goto_0
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 72
    .line 73
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0

    .line 78
    :cond_4
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 79
    .line 80
    invoke-virtual {p0, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子苏兰世([BB)I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0
.end method

.method public final 飘花落叶言楪子兰世哲苏()Ljava/time/LocalDateTime;
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    const/16 v3, 0x5d

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲兰楪苏([BI)Ljava/time/LocalDateTime;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x15

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string p0, "date only support string input"

    .line 27
    .line 28
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public final 飘花落叶言楪子兰世苏哲()Ljava/time/LocalDateTime;
    .locals 6

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    iput-byte v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰楪苏:B

    .line 8
    .line 9
    const/16 v3, 0x5c

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const-string v5, "date only support string input"

    .line 13
    .line 14
    if-ne v2, v3, :cond_1

    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲苏楪兰([BI)Ljava/time/LocalDateTime;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x14

    .line 27
    .line 28
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_0
    invoke-static {v5}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object v4

    .line 35
    :cond_1
    invoke-static {v5}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v4
.end method

.method public final 飘花落叶言楪子兰哲世苏()Ljava/time/LocalTime;
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    const/16 v3, 0x53

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世兰楪哲苏([BI)Ljava/time/LocalTime;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0xb

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string p0, "date only support string input"

    .line 27
    .line 28
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public final 飘花落叶言楪子兰哲苏世()Ljava/time/LocalTime;
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    const/16 v3, 0x54

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世兰苏楪哲([BI)Ljava/time/LocalTime;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0xc

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string p0, "date only support string input"

    .line 27
    .line 28
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public final 飘花落叶言楪子兰苏世哲(I)Ljava/time/LocalDateTime;
    .locals 5

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    iput-byte v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰楪苏:B

    .line 8
    .line 9
    const/16 v3, 0x49

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    if-lt v2, v3, :cond_1

    .line 13
    .line 14
    const/16 v3, 0x78

    .line 15
    .line 16
    if-gt v2, v3, :cond_1

    .line 17
    .line 18
    const/16 v2, 0x15

    .line 19
    .line 20
    if-lt p1, v2, :cond_0

    .line 21
    .line 22
    const/16 v2, 0x1d

    .line 23
    .line 24
    if-gt p1, v2, :cond_0

    .line 25
    .line 26
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    invoke-static {v0, v1, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世兰楪苏哲(I[BI)Ljava/time/LocalDateTime;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 35
    .line 36
    add-int/lit8 p1, p1, 0x1

    .line 37
    .line 38
    add-int/2addr p1, v1

    .line 39
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_0
    const-string p1, "illegal LocalDateTime string : "

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0, p1}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v4

    .line 52
    :cond_1
    const-string p0, "date only support string input"

    .line 53
    .line 54
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v4
.end method

.method public final 飘花落叶言楪子兰苏哲世()Ljava/time/LocalTime;
    .locals 5

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    const/16 v3, -0x59

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v2, v0, 0x1

    .line 12
    .line 13
    add-int/lit8 v3, v0, 0x2

    .line 14
    .line 15
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 16
    .line 17
    aget-byte v2, v1, v2

    .line 18
    .line 19
    add-int/lit8 v4, v0, 0x3

    .line 20
    .line 21
    iput v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 22
    .line 23
    aget-byte v3, v1, v3

    .line 24
    .line 25
    add-int/lit8 v0, v0, 0x4

    .line 26
    .line 27
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 28
    .line 29
    aget-byte v0, v1, v4

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-static {v2, v3, v0, p0}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_0
    const/16 v1, -0x51

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    if-ne v2, v1, :cond_1

    .line 44
    .line 45
    add-int/lit8 v0, v0, 0x1

    .line 46
    .line 47
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 48
    .line 49
    return-object v3

    .line 50
    :cond_1
    const/16 v0, 0x49

    .line 51
    .line 52
    if-lt v2, v0, :cond_3

    .line 53
    .line 54
    const/16 v0, 0x78

    .line 55
    .line 56
    if-gt v2, v0, :cond_3

    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰哲苏楪()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    const/16 v1, 0x12

    .line 63
    .line 64
    if-eq v0, v1, :cond_2

    .line 65
    .line 66
    packed-switch v0, :pswitch_data_0

    .line 67
    .line 68
    .line 69
    const-string p0, "not support len : "

    .line 70
    .line 71
    invoke-static {v0, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-object v3

    .line 79
    :pswitch_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世子苏哲兰()Ljava/time/LocalTime;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0

    .line 84
    :pswitch_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子兰哲苏世()Ljava/time/LocalTime;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0

    .line 89
    :pswitch_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子兰哲世苏()Ljava/time/LocalTime;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0

    .line 94
    :pswitch_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世苏子兰哲()Ljava/time/LocalTime;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :pswitch_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世苏子哲兰()Ljava/time/LocalTime;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0

    .line 104
    :pswitch_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世子兰哲苏()Ljava/time/LocalTime;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0

    .line 109
    :pswitch_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世子兰苏哲()Ljava/time/LocalTime;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    return-object p0

    .line 114
    :pswitch_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世子哲兰苏()Ljava/time/LocalTime;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    return-object p0

    .line 119
    :cond_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世子哲苏兰()Ljava/time/LocalTime;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    return-object p0

    .line 124
    :cond_3
    invoke-static {}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世()V

    .line 125
    .line 126
    .line 127
    return-object v3

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x5
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

.method public final 飘花落叶言楪子哲世兰苏()Ljava/time/LocalDateTime;
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    const/16 v3, 0x55

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪兰苏哲([BI)Ljava/time/LocalDateTime;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0xd

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string p0, "date only support string input"

    .line 27
    .line 28
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public final 飘花落叶言楪子哲世苏兰()Ljava/time/LocalDateTime;
    .locals 12

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    const/16 v3, -0x58

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v2, v0, 0x1

    .line 12
    .line 13
    add-int/lit8 v3, v0, 0x2

    .line 14
    .line 15
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 16
    .line 17
    aget-byte v2, v1, v2

    .line 18
    .line 19
    shl-int/lit8 v2, v2, 0x8

    .line 20
    .line 21
    add-int/lit8 v4, v0, 0x3

    .line 22
    .line 23
    iput v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 24
    .line 25
    aget-byte v3, v1, v3

    .line 26
    .line 27
    and-int/lit16 v3, v3, 0xff

    .line 28
    .line 29
    add-int v5, v2, v3

    .line 30
    .line 31
    add-int/lit8 v2, v0, 0x4

    .line 32
    .line 33
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 34
    .line 35
    aget-byte v6, v1, v4

    .line 36
    .line 37
    add-int/lit8 v3, v0, 0x5

    .line 38
    .line 39
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 40
    .line 41
    aget-byte v7, v1, v2

    .line 42
    .line 43
    add-int/lit8 v2, v0, 0x6

    .line 44
    .line 45
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 46
    .line 47
    aget-byte v8, v1, v3

    .line 48
    .line 49
    add-int/lit8 v3, v0, 0x7

    .line 50
    .line 51
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 52
    .line 53
    aget-byte v9, v1, v2

    .line 54
    .line 55
    add-int/lit8 v0, v0, 0x8

    .line 56
    .line 57
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 58
    .line 59
    aget-byte v10, v1, v3

    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    invoke-static/range {v5 .. v11}, Ljava/time/LocalDateTime;->of(IIIIIII)Ljava/time/LocalDateTime;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :cond_0
    const/16 v1, -0x51

    .line 71
    .line 72
    const/4 v3, 0x0

    .line 73
    if-ne v2, v1, :cond_1

    .line 74
    .line 75
    add-int/lit8 v0, v0, 0x1

    .line 76
    .line 77
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 78
    .line 79
    return-object v3

    .line 80
    :cond_1
    const/16 v0, -0x57

    .line 81
    .line 82
    if-ne v2, v0, :cond_3

    .line 83
    .line 84
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子苏世兰哲()Ljava/time/LocalDate;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    if-nez p0, :cond_2

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_2
    sget-object v0, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 92
    .line 93
    invoke-static {p0, v0}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    :cond_3
    const/16 v0, -0x56

    .line 99
    .line 100
    if-ne v2, v0, :cond_4

    .line 101
    .line 102
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏子兰世哲()Ljava/time/ZonedDateTime;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->toLocalDateTime()Ljava/time/LocalDateTime;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :cond_4
    const/16 v0, 0x49

    .line 112
    .line 113
    if-lt v2, v0, :cond_7

    .line 114
    .line 115
    const/16 v0, 0x78

    .line 116
    .line 117
    if-gt v2, v0, :cond_7

    .line 118
    .line 119
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰哲苏楪()I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    packed-switch v0, :pswitch_data_0

    .line 124
    .line 125
    .line 126
    :pswitch_0
    new-instance v1, Lcom/alibaba/fastjson2/JSONException;

    .line 127
    .line 128
    const-string v2, "TODO : "

    .line 129
    .line 130
    const-string v3, ", "

    .line 131
    .line 132
    invoke-static {v0, v2, v3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-direct {v1, p0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw v1

    .line 151
    :pswitch_1
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子兰苏世哲(I)Ljava/time/LocalDateTime;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    return-object p0

    .line 156
    :pswitch_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子兰世哲苏()Ljava/time/LocalDateTime;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    return-object p0

    .line 161
    :pswitch_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子兰世苏哲()Ljava/time/LocalDateTime;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    return-object p0

    .line 166
    :pswitch_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子哲兰苏世()Ljava/time/LocalDateTime;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    return-object p0

    .line 171
    :pswitch_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子哲兰世苏()Ljava/time/LocalDateTime;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    return-object p0

    .line 176
    :pswitch_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子哲苏兰世()Ljava/time/LocalDateTime;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    return-object p0

    .line 181
    :pswitch_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子苏哲兰世()Ljava/time/LocalDate;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    if-nez p0, :cond_5

    .line 186
    .line 187
    goto :goto_0

    .line 188
    :cond_5
    sget-object v0, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 189
    .line 190
    invoke-static {p0, v0}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    return-object p0

    .line 195
    :pswitch_8
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子苏哲世兰()Ljava/time/LocalDate;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    if-nez p0, :cond_6

    .line 200
    .line 201
    :goto_0
    return-object v3

    .line 202
    :cond_6
    sget-object v0, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 203
    .line 204
    invoke-static {p0, v0}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    return-object p0

    .line 209
    :pswitch_9
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子苏兰哲世()Ljava/time/LocalDate;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    sget-object v0, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 214
    .line 215
    invoke-static {p0, v0}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    return-object p0

    .line 220
    :pswitch_a
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子苏兰世哲()Ljava/time/LocalDate;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    sget-object v0, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 225
    .line 226
    invoke-static {p0, v0}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    return-object p0

    .line 231
    :cond_7
    int-to-byte p0, v2

    .line 232
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰哲世子(B)Lcom/alibaba/fastjson2/JSONException;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    throw p0

    .line 237
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
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
    .end packed-switch
.end method

.method public final 飘花落叶言楪子哲兰世苏()Ljava/time/LocalDateTime;
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    const/16 v3, 0x5a

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏兰楪哲([BI)Ljava/time/LocalDateTime;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x12

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string p0, "date only support string input"

    .line 27
    .line 28
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public final 飘花落叶言楪子哲兰苏世()Ljava/time/LocalDateTime;
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    const/16 v3, 0x5b

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲楪苏兰([BI)Ljava/time/LocalDateTime;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x13

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string p0, "date only support string input"

    .line 27
    .line 28
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public final 飘花落叶言楪子哲苏世兰()Ljava/time/LocalDateTime;
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    const/16 v3, 0x57

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪哲兰([BI)Ljava/time/LocalDateTime;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0xf

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string p0, "date only support string input"

    .line 27
    .line 28
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public final 飘花落叶言楪子哲苏兰世()Ljava/time/LocalDateTime;
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    const/16 v3, 0x59

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏哲楪兰([BI)Ljava/time/LocalDateTime;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x11

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string p0, "date only support string input"

    .line 27
    .line 28
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public final 飘花落叶言楪子苏世兰哲()Ljava/time/LocalDate;
    .locals 6

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 6
    .line 7
    aget-byte v3, v2, v0

    .line 8
    .line 9
    const/16 v4, -0x57

    .line 10
    .line 11
    if-ne v3, v4, :cond_0

    .line 12
    .line 13
    add-int/lit8 v4, v0, 0x4

    .line 14
    .line 15
    iget v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏兰楪:I

    .line 16
    .line 17
    if-ge v4, v5, :cond_0

    .line 18
    .line 19
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪苏兰哲([BI)S

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    add-int/lit8 v3, v0, 0x3

    .line 24
    .line 25
    invoke-static {v2, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏兰世哲([BI)B

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-static {v2, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏兰世哲([BI)B

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    add-int/lit8 v0, v0, 0x5

    .line 34
    .line 35
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 36
    .line 37
    invoke-static {v1, v3, v2}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_0
    const/16 v0, -0x51

    .line 43
    .line 44
    if-ne v3, v0, :cond_1

    .line 45
    .line 46
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    return-object p0

    .line 50
    :cond_1
    const/16 v0, -0x58

    .line 51
    .line 52
    if-ne v3, v0, :cond_2

    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子哲世苏兰()Ljava/time/LocalDateTime;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0}, Ljava/time/LocalDateTime;->toLocalDate()Ljava/time/LocalDate;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :cond_2
    const/16 v0, -0x56

    .line 64
    .line 65
    if-ne v3, v0, :cond_3

    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏子兰世哲()Ljava/time/ZonedDateTime;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->toLocalDate()Ljava/time/LocalDate;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :cond_3
    const/16 v0, 0x49

    .line 77
    .line 78
    if-lt v3, v0, :cond_5

    .line 79
    .line 80
    const/16 v0, 0x78

    .line 81
    .line 82
    if-gt v3, v0, :cond_5

    .line 83
    .line 84
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰哲苏楪()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    packed-switch v0, :pswitch_data_0

    .line 89
    .line 90
    .line 91
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 92
    .line 93
    add-int/2addr v1, v0

    .line 94
    aget-byte v1, v2, v1

    .line 95
    .line 96
    const/16 v2, 0x5a

    .line 97
    .line 98
    if-ne v1, v2, :cond_4

    .line 99
    .line 100
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏子兰世哲()Ljava/time/ZonedDateTime;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-interface {v0}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 109
    .line 110
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世兰苏哲()Ljava/time/ZoneId;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {v0, p0}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->toLocalDate()Ljava/time/LocalDate;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    return-object p0

    .line 123
    :cond_4
    new-instance v1, Lcom/alibaba/fastjson2/JSONException;

    .line 124
    .line 125
    const-string v2, "TODO : "

    .line 126
    .line 127
    const-string v3, ", "

    .line 128
    .line 129
    invoke-static {v0, v2, v3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-direct {v1, p0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw v1

    .line 148
    :pswitch_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子苏哲兰世()Ljava/time/LocalDate;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    return-object p0

    .line 153
    :pswitch_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子苏哲世兰()Ljava/time/LocalDate;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    return-object p0

    .line 158
    :pswitch_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子苏兰哲世()Ljava/time/LocalDate;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    return-object p0

    .line 163
    :pswitch_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子苏兰世哲()Ljava/time/LocalDate;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    return-object p0

    .line 168
    :cond_5
    const/16 v0, 0x7a

    .line 169
    .line 170
    if-eq v3, v0, :cond_6

    .line 171
    .line 172
    const/16 v0, 0x79

    .line 173
    .line 174
    if-ne v3, v0, :cond_7

    .line 175
    .line 176
    :cond_6
    int-to-byte v0, v3

    .line 177
    iput-byte v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪苏哲:B

    .line 178
    .line 179
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 180
    .line 181
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 186
    .line 187
    packed-switch v0, :pswitch_data_1

    .line 188
    .line 189
    .line 190
    :cond_7
    int-to-byte p0, v3

    .line 191
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰哲世子(B)Lcom/alibaba/fastjson2/JSONException;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    throw p0

    .line 196
    :pswitch_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子苏哲兰世()Ljava/time/LocalDate;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    return-object p0

    .line 201
    :pswitch_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子苏哲世兰()Ljava/time/LocalDate;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    return-object p0

    .line 206
    :pswitch_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子苏兰哲世()Ljava/time/LocalDate;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    return-object p0

    .line 211
    :pswitch_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子苏兰世哲()Ljava/time/LocalDate;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    return-object p0

    .line 216
    nop

    .line 217
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    :pswitch_data_1
    .packed-switch 0x8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method

.method public final 飘花落叶言楪子苏兰世哲()Ljava/time/LocalDate;
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    const/16 v3, 0x51

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰苏哲世([BI)Ljava/time/LocalDate;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x9

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string p0, "date only support string input"

    .line 27
    .line 28
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public final 飘花落叶言楪子苏兰哲世()Ljava/time/LocalDate;
    .locals 4

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    const/16 v3, 0x52

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰哲苏世([BI)Ljava/time/LocalDate;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0xa

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const-string p0, "date only support string input"

    .line 27
    .line 28
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public final 飘花落叶言楪子苏哲世兰()Ljava/time/LocalDate;
    .locals 4

    .line 1
    iget-byte v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪苏哲:B

    .line 2
    .line 3
    const/16 v1, 0x79

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    const/16 v1, 0x7a

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 14
    .line 15
    const/16 v1, 0xa

    .line 16
    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    invoke-static {v2, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰苏世([BI)Ljava/time/LocalDate;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 27
    .line 28
    aget-byte v1, v2, v0

    .line 29
    .line 30
    const/16 v3, 0x53

    .line 31
    .line 32
    if-ne v1, v3, :cond_2

    .line 33
    .line 34
    add-int/lit8 v0, v0, 0x1

    .line 35
    .line 36
    invoke-static {v2, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰苏世([BI)Ljava/time/LocalDate;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    :goto_0
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 43
    .line 44
    add-int/lit8 v1, v1, 0xb

    .line 45
    .line 46
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_2
    const-string p0, "date only support string input"

    .line 50
    .line 51
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    return-object p0
.end method

.method public final 飘花落叶言楪子苏哲兰世()Ljava/time/LocalDate;
    .locals 4

    .line 1
    iget-byte v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪苏哲:B

    .line 2
    .line 3
    const/16 v1, 0x79

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    const/16 v1, 0x7a

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 14
    .line 15
    const/16 v1, 0xb

    .line 16
    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    invoke-static {v2, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世哲苏([BI)Ljava/time/LocalDate;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 27
    .line 28
    aget-byte v1, v2, v0

    .line 29
    .line 30
    const/16 v3, 0x54

    .line 31
    .line 32
    if-ne v1, v3, :cond_2

    .line 33
    .line 34
    add-int/lit8 v0, v0, 0x1

    .line 35
    .line 36
    invoke-static {v2, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世哲苏([BI)Ljava/time/LocalDate;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    :goto_0
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 43
    .line 44
    add-int/lit8 v1, v1, 0xc

    .line 45
    .line 46
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_2
    const-string p0, "date only support string input"

    .line 50
    .line 51
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    return-object p0
.end method

.method public final 飘花落叶言楪苏世兰子哲()I
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 6
    .line 7
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 8
    .line 9
    aget-byte v0, v1, v0

    .line 10
    .line 11
    iput-byte v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰楪苏:B

    .line 12
    .line 13
    const/16 v1, -0x51

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    const/4 p0, -0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/16 v1, -0x6c

    .line 20
    .line 21
    if-lt v0, v1, :cond_1

    .line 22
    .line 23
    const/16 v2, -0x5d

    .line 24
    .line 25
    if-gt v0, v2, :cond_1

    .line 26
    .line 27
    neg-int v2, v0

    .line 28
    int-to-char v2, v2

    .line 29
    iput-char v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 30
    .line 31
    sub-int/2addr v0, v1

    .line 32
    return v0

    .line 33
    :cond_1
    const/16 v1, -0x6f

    .line 34
    .line 35
    if-ne v0, v1, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0

    .line 42
    :cond_2
    const/16 v1, -0x5c

    .line 43
    .line 44
    if-ne v0, v1, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    return p0

    .line 51
    :cond_3
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲兰世子(B)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    const-string v0, "array not support input "

    .line 56
    .line 57
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 p0, 0x0

    .line 65
    return p0
.end method

.method public final 飘花落叶言楪苏世哲兰子()V
    .locals 7

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 6
    .line 7
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 8
    .line 9
    aget-byte v2, v1, v0

    .line 10
    .line 11
    const/16 v3, 0x48

    .line 12
    .line 13
    if-eq v2, v3, :cond_11

    .line 14
    .line 15
    const/16 v3, 0x49

    .line 16
    .line 17
    if-eq v2, v3, :cond_10

    .line 18
    .line 19
    packed-switch v2, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    sget-object v4, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏世楪哲兰:[B

    .line 23
    .line 24
    const/4 v5, -0x1

    .line 25
    packed-switch v2, :pswitch_data_1

    .line 26
    .line 27
    .line 28
    packed-switch v2, :pswitch_data_2

    .line 29
    .line 30
    .line 31
    packed-switch v2, :pswitch_data_3

    .line 32
    .line 33
    .line 34
    packed-switch v2, :pswitch_data_4

    .line 35
    .line 36
    .line 37
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(I)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_10

    .line 42
    .line 43
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(I)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    goto/16 :goto_7

    .line 50
    .line 51
    :cond_0
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(I)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_9

    .line 56
    .line 57
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(I)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    goto :goto_4

    .line 64
    :cond_1
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(I)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_8

    .line 69
    .line 70
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲(I)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_2
    if-lt v2, v3, :cond_3

    .line 78
    .line 79
    const/16 v0, 0x78

    .line 80
    .line 81
    if-gt v2, v0, :cond_3

    .line 82
    .line 83
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 84
    .line 85
    sub-int/2addr v2, v3

    .line 86
    add-int/2addr v2, v0

    .line 87
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 88
    .line 89
    return-void

    .line 90
    :cond_3
    const/16 v0, -0x6c

    .line 91
    .line 92
    if-lt v2, v0, :cond_7

    .line 93
    .line 94
    const/16 v3, -0x5c

    .line 95
    .line 96
    if-gt v2, v3, :cond_7

    .line 97
    .line 98
    if-ne v2, v3, :cond_4

    .line 99
    .line 100
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    goto :goto_0

    .line 105
    :cond_4
    add-int/lit8 v0, v2, 0x6c

    .line 106
    .line 107
    :goto_0
    const/4 v2, 0x0

    .line 108
    :goto_1
    if-ge v2, v0, :cond_10

    .line 109
    .line 110
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 111
    .line 112
    aget-byte v6, v1, v3

    .line 113
    .line 114
    and-int/lit16 v6, v6, 0xff

    .line 115
    .line 116
    aget-byte v6, v4, v6

    .line 117
    .line 118
    if-lez v6, :cond_5

    .line 119
    .line 120
    add-int/2addr v3, v6

    .line 121
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_5
    if-ne v6, v5, :cond_6

    .line 125
    .line 126
    add-int/lit8 v3, v3, 0x1

    .line 127
    .line 128
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 129
    .line 130
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    iget v6, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 135
    .line 136
    add-int/2addr v6, v3

    .line 137
    iput v6, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏世哲兰子()V

    .line 141
    .line 142
    .line 143
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_7
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰哲世子(B)Lcom/alibaba/fastjson2/JSONException;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    throw p0

    .line 151
    :cond_8
    :goto_3
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 152
    .line 153
    add-int/lit8 v0, v0, 0x2

    .line 154
    .line 155
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 156
    .line 157
    return-void

    .line 158
    :cond_9
    :goto_4
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 159
    .line 160
    add-int/lit8 v0, v0, 0x1

    .line 161
    .line 162
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 163
    .line 164
    return-void

    .line 165
    :pswitch_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 170
    .line 171
    add-int/2addr v1, v0

    .line 172
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 173
    .line 174
    return-void

    .line 175
    :pswitch_1
    add-int/lit8 v0, v0, 0x2

    .line 176
    .line 177
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 178
    .line 179
    return-void

    .line 180
    :pswitch_2
    add-int/lit8 v0, v0, 0x3

    .line 181
    .line 182
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 183
    .line 184
    return-void

    .line 185
    :pswitch_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子兰世楪哲苏()Ljava/math/BigInteger;

    .line 189
    .line 190
    .line 191
    return-void

    .line 192
    :pswitch_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :pswitch_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世兰苏哲()J

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    :pswitch_6
    add-int/lit8 v0, v0, 0x9

    .line 201
    .line 202
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 203
    .line 204
    return-void

    .line 205
    :pswitch_7
    add-int/lit8 v0, v0, 0x8

    .line 206
    .line 207
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 208
    .line 209
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    return-void

    .line 216
    :pswitch_8
    add-int/lit8 v0, v0, 0x8

    .line 217
    .line 218
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 219
    .line 220
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :pswitch_9
    add-int/lit8 v0, v0, 0x4

    .line 225
    .line 226
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 227
    .line 228
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 229
    .line 230
    .line 231
    return-void

    .line 232
    :goto_5
    :pswitch_a
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 233
    .line 234
    aget-byte v2, v1, v0

    .line 235
    .line 236
    const/16 v3, -0x5b

    .line 237
    .line 238
    if-ne v2, v3, :cond_a

    .line 239
    .line 240
    add-int/lit8 v0, v0, 0x1

    .line 241
    .line 242
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 243
    .line 244
    return-void

    .line 245
    :cond_a
    and-int/lit16 v2, v2, 0xff

    .line 246
    .line 247
    aget-byte v2, v4, v2

    .line 248
    .line 249
    if-lez v2, :cond_b

    .line 250
    .line 251
    add-int/2addr v0, v2

    .line 252
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 253
    .line 254
    goto :goto_6

    .line 255
    :cond_b
    if-ne v2, v5, :cond_c

    .line 256
    .line 257
    add-int/lit8 v0, v0, 0x1

    .line 258
    .line 259
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 260
    .line 261
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 266
    .line 267
    add-int/2addr v2, v0

    .line 268
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_c
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏世哲子兰()V

    .line 272
    .line 273
    .line 274
    :goto_6
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 275
    .line 276
    aget-byte v2, v1, v0

    .line 277
    .line 278
    and-int/lit16 v2, v2, 0xff

    .line 279
    .line 280
    aget-byte v2, v4, v2

    .line 281
    .line 282
    if-lez v2, :cond_d

    .line 283
    .line 284
    add-int/2addr v0, v2

    .line 285
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 286
    .line 287
    goto :goto_5

    .line 288
    :cond_d
    if-ne v2, v5, :cond_e

    .line 289
    .line 290
    add-int/lit8 v0, v0, 0x1

    .line 291
    .line 292
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 293
    .line 294
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 299
    .line 300
    add-int/2addr v2, v0

    .line 301
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 302
    .line 303
    goto :goto_5

    .line 304
    :cond_e
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏世哲兰子()V

    .line 305
    .line 306
    .line 307
    goto :goto_5

    .line 308
    :pswitch_b
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏哲兰世楪()Z

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    if-eqz v0, :cond_f

    .line 313
    .line 314
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏世哲子兰()V

    .line 315
    .line 316
    .line 317
    return-void

    .line 318
    :cond_f
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰哲世子(B)Lcom/alibaba/fastjson2/JSONException;

    .line 319
    .line 320
    .line 321
    move-result-object p0

    .line 322
    throw p0

    .line 323
    :pswitch_c
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏子世兰哲()J

    .line 324
    .line 325
    .line 326
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏世哲兰子()V

    .line 327
    .line 328
    .line 329
    return-void

    .line 330
    :pswitch_d
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 335
    .line 336
    add-int/2addr v1, v0

    .line 337
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 338
    .line 339
    :cond_10
    :goto_7
    :pswitch_e
    return-void

    .line 340
    :cond_11
    :pswitch_f
    add-int/lit8 v0, v0, 0x5

    .line 341
    .line 342
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 343
    .line 344
    return-void

    .line 345
    :pswitch_data_0
    .packed-switch -0x6f
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_e
    .end packed-switch

    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    :pswitch_data_1
    .packed-switch -0x5a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_f
        :pswitch_7
        :pswitch_6
        :pswitch_f
        :pswitch_f
    .end packed-switch

    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    :pswitch_data_2
    .packed-switch -0x51
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_5
        :pswitch_6
        :pswitch_4
        :pswitch_f
        :pswitch_5
        :pswitch_3
    .end packed-switch

    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    :pswitch_data_3
    .packed-switch -0x44
        :pswitch_2
        :pswitch_1
        :pswitch_6
        :pswitch_f
    .end packed-switch

    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    :pswitch_data_4
    .packed-switch 0x79
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言楪苏世哲子兰()V
    .locals 5

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 6
    .line 7
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 8
    .line 9
    aget-byte v0, v2, v0

    .line 10
    .line 11
    iput-byte v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪苏哲:B

    .line 12
    .line 13
    const/16 v3, 0x49

    .line 14
    .line 15
    if-lt v0, v3, :cond_0

    .line 16
    .line 17
    const/16 v4, 0x78

    .line 18
    .line 19
    if-gt v0, v4, :cond_0

    .line 20
    .line 21
    sub-int/2addr v0, v3

    .line 22
    add-int/2addr v0, v1

    .line 23
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const/16 v3, 0x79

    .line 27
    .line 28
    if-eq v0, v3, :cond_4

    .line 29
    .line 30
    const/16 v3, 0x7a

    .line 31
    .line 32
    if-eq v0, v3, :cond_4

    .line 33
    .line 34
    const/16 v3, 0x7b

    .line 35
    .line 36
    if-eq v0, v3, :cond_4

    .line 37
    .line 38
    const/16 v3, 0x7c

    .line 39
    .line 40
    if-eq v0, v3, :cond_4

    .line 41
    .line 42
    const/16 v3, 0x7d

    .line 43
    .line 44
    if-ne v0, v3, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/16 v3, 0x7f

    .line 48
    .line 49
    if-ne v0, v3, :cond_3

    .line 50
    .line 51
    aget-byte v0, v2, v1

    .line 52
    .line 53
    const/16 v1, -0x10

    .line 54
    .line 55
    if-lt v0, v1, :cond_2

    .line 56
    .line 57
    const/16 v1, 0x48

    .line 58
    .line 59
    if-gt v0, v1, :cond_2

    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_3
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰哲世子(B)Lcom/alibaba/fastjson2/JSONException;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    throw p0

    .line 77
    :cond_4
    :goto_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 82
    .line 83
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 84
    .line 85
    add-int/2addr v1, v0

    .line 86
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 87
    .line 88
    return-void
.end method

.method public final 飘花落叶言楪苏世子兰哲()V
    .locals 1

    .line 1
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string v0, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言楪苏世子哲兰(Landroidx/compose/foundation/text/飘花落叶言子哲楪苏兰世;)V
    .locals 1

    .line 1
    iget v0, p1, Landroidx/compose/foundation/text/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 4
    .line 5
    iget p1, p1, Landroidx/compose/foundation/text/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪世苏兰哲:I

    .line 6
    .line 7
    int-to-byte p1, p1

    .line 8
    iput-byte p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰楪苏:B

    .line 9
    .line 10
    return-void
.end method

.method public final 飘花落叶言楪苏兰哲子世()J
    .locals 11

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    move-wide v5, v1

    .line 7
    move v4, v3

    .line 8
    :goto_0
    iget v7, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 9
    .line 10
    iget-object v8, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 11
    .line 12
    if-ge v4, v7, :cond_2

    .line 13
    .line 14
    aget-byte v7, v8, v0

    .line 15
    .line 16
    if-ltz v7, :cond_1

    .line 17
    .line 18
    const/16 v9, 0x8

    .line 19
    .line 20
    if-ge v4, v9, :cond_1

    .line 21
    .line 22
    if-nez v4, :cond_0

    .line 23
    .line 24
    iget v9, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 25
    .line 26
    aget-byte v9, v8, v9

    .line 27
    .line 28
    if-nez v9, :cond_0

    .line 29
    .line 30
    goto :goto_3

    .line 31
    :cond_0
    packed-switch v4, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    goto :goto_2

    .line 35
    :pswitch_0
    int-to-long v7, v7

    .line 36
    const/16 v9, 0x38

    .line 37
    .line 38
    shl-long/2addr v7, v9

    .line 39
    const-wide v9, 0xffffffffffffffL

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    :goto_1
    and-long/2addr v5, v9

    .line 45
    add-long/2addr v5, v7

    .line 46
    goto :goto_2

    .line 47
    :pswitch_1
    int-to-long v7, v7

    .line 48
    const/16 v9, 0x30

    .line 49
    .line 50
    shl-long/2addr v7, v9

    .line 51
    const-wide v9, 0xffffffffffffL

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :pswitch_2
    int-to-long v7, v7

    .line 58
    const/16 v9, 0x28

    .line 59
    .line 60
    shl-long/2addr v7, v9

    .line 61
    const-wide v9, 0xffffffffffL

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :pswitch_3
    int-to-long v7, v7

    .line 68
    const/16 v9, 0x20

    .line 69
    .line 70
    shl-long/2addr v7, v9

    .line 71
    const-wide v9, 0xffffffffL

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :pswitch_4
    shl-int/lit8 v7, v7, 0x18

    .line 78
    .line 79
    int-to-long v7, v7

    .line 80
    const-wide/32 v9, 0xffffff

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :pswitch_5
    shl-int/lit8 v7, v7, 0x10

    .line 85
    .line 86
    int-to-long v7, v7

    .line 87
    const-wide/32 v9, 0xffff

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :pswitch_6
    shl-int/lit8 v7, v7, 0x8

    .line 92
    .line 93
    int-to-long v7, v7

    .line 94
    const-wide/16 v9, 0xff

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :pswitch_7
    int-to-long v5, v7

    .line 98
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 99
    .line 100
    add-int/lit8 v0, v0, 0x1

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    :goto_3
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 104
    .line 105
    move-wide v5, v1

    .line 106
    :cond_2
    cmp-long v1, v5, v1

    .line 107
    .line 108
    if-eqz v1, :cond_3

    .line 109
    .line 110
    return-wide v5

    .line 111
    :cond_3
    const-wide v1, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    :goto_4
    iget v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 117
    .line 118
    if-ge v3, v4, :cond_4

    .line 119
    .line 120
    add-int/lit8 v4, v0, 0x1

    .line 121
    .line 122
    aget-byte v0, v8, v0

    .line 123
    .line 124
    int-to-long v5, v0

    .line 125
    xor-long v0, v1, v5

    .line 126
    .line 127
    const-wide v5, 0x100000001b3L

    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    mul-long v1, v0, v5

    .line 133
    .line 134
    add-int/lit8 v3, v3, 0x1

    .line 135
    .line 136
    move v0, v4

    .line 137
    goto :goto_4

    .line 138
    :cond_4
    return-wide v1

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final 飘花落叶言楪苏哲兰世子(B)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(B)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏哲兰世楪()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    add-int/lit8 v1, p1, -0x1

    .line 22
    .line 23
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 24
    .line 25
    :try_start_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    const/4 v1, 0x0

    .line 31
    :goto_0
    if-eqz v1, :cond_0

    .line 32
    .line 33
    const/16 v2, 0x20

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    :cond_0
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 42
    .line 43
    :cond_1
    const-string p1, ", offset "

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 49
    .line 50
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const/16 p1, 0x2f

    .line 54
    .line 55
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 59
    .line 60
    array-length p0, p0

    .line 61
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0
.end method

.method public final 飘花落叶言楪苏子世兰哲()J
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 4
    .line 5
    iget-object v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 6
    .line 7
    aget-byte v3, v2, v1

    .line 8
    .line 9
    iput-byte v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪苏哲:B

    .line 10
    .line 11
    const/16 v9, 0x3f

    .line 12
    .line 13
    const/16 v10, 0x20

    .line 14
    .line 15
    const/16 v11, 0x2f

    .line 16
    .line 17
    const/16 v12, 0x8

    .line 18
    .line 19
    const/16 v13, 0x79

    .line 20
    .line 21
    if-ne v3, v13, :cond_5

    .line 22
    .line 23
    add-int/lit8 v14, v1, 0x1

    .line 24
    .line 25
    aget-byte v14, v2, v14

    .line 26
    .line 27
    if-le v14, v12, :cond_5

    .line 28
    .line 29
    if-gt v14, v9, :cond_5

    .line 30
    .line 31
    if-gt v14, v11, :cond_0

    .line 32
    .line 33
    add-int/lit8 v1, v1, 0x2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    add-int/lit8 v14, v14, -0x38

    .line 37
    .line 38
    shl-int/2addr v14, v12

    .line 39
    add-int/lit8 v15, v1, 0x2

    .line 40
    .line 41
    aget-byte v15, v2, v15

    .line 42
    .line 43
    and-int/lit16 v15, v15, 0xff

    .line 44
    .line 45
    add-int/2addr v14, v15

    .line 46
    add-int/lit8 v1, v1, 0x3

    .line 47
    .line 48
    :goto_0
    move/from16 v16, v1

    .line 49
    .line 50
    const-wide v4, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    const/4 v15, 0x0

    .line 56
    const-wide v17, 0x100000001b3L

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    :goto_1
    if-ge v15, v14, :cond_1

    .line 62
    .line 63
    add-int/lit8 v19, v16, 0x1

    .line 64
    .line 65
    aget-byte v6, v2, v16

    .line 66
    .line 67
    int-to-long v7, v6

    .line 68
    xor-long/2addr v4, v7

    .line 69
    mul-long v4, v4, v17

    .line 70
    .line 71
    add-int/lit8 v15, v15, 0x1

    .line 72
    .line 73
    move/from16 v16, v19

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    aget-byte v6, v2, v16

    .line 77
    .line 78
    if-ltz v6, :cond_6

    .line 79
    .line 80
    if-gt v6, v11, :cond_6

    .line 81
    .line 82
    add-int/lit8 v2, v16, 0x1

    .line 83
    .line 84
    if-nez v6, :cond_2

    .line 85
    .line 86
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰哲苏楪:I

    .line 87
    .line 88
    iput v14, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪世哲兰:I

    .line 89
    .line 90
    iput-byte v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪世兰哲:B

    .line 91
    .line 92
    iput-wide v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰哲楪苏:J

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_2
    mul-int/lit8 v6, v6, 0x2

    .line 96
    .line 97
    add-int/lit8 v7, v6, 0x2

    .line 98
    .line 99
    iget-object v8, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪哲世兰:[J

    .line 100
    .line 101
    if-nez v8, :cond_3

    .line 102
    .line 103
    invoke-static {v7, v10}, Ljava/lang/Math;->max(II)I

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    new-array v7, v7, [J

    .line 108
    .line 109
    iput-object v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪哲世兰:[J

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_3
    array-length v9, v8

    .line 113
    if-ge v9, v7, :cond_4

    .line 114
    .line 115
    add-int/lit8 v7, v6, 0x12

    .line 116
    .line 117
    invoke-static {v8, v7}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    iput-object v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪哲世兰:[J

    .line 122
    .line 123
    :cond_4
    :goto_2
    iget-object v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪哲世兰:[J

    .line 124
    .line 125
    add-int/lit8 v6, v6, 0x1

    .line 126
    .line 127
    int-to-long v8, v1

    .line 128
    shl-long/2addr v8, v10

    .line 129
    int-to-long v10, v14

    .line 130
    shl-long/2addr v10, v12

    .line 131
    add-long/2addr v8, v10

    .line 132
    int-to-long v10, v3

    .line 133
    add-long/2addr v8, v10

    .line 134
    aput-wide v8, v7, v6

    .line 135
    .line 136
    :goto_3
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 137
    .line 138
    iput v14, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 139
    .line 140
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 141
    .line 142
    return-wide v4

    .line 143
    :cond_5
    const-wide v17, 0x100000001b3L

    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    :cond_6
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 149
    .line 150
    aget-byte v3, v2, v1

    .line 151
    .line 152
    iput-byte v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪苏哲:B

    .line 153
    .line 154
    const/16 v4, 0x7f

    .line 155
    .line 156
    const-wide/16 v5, 0x0

    .line 157
    .line 158
    const/4 v7, 0x0

    .line 159
    if-ne v3, v4, :cond_c

    .line 160
    .line 161
    add-int/lit8 v1, v1, 0x1

    .line 162
    .line 163
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 164
    .line 165
    aget-byte v3, v2, v1

    .line 166
    .line 167
    iput-byte v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪苏哲:B

    .line 168
    .line 169
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)Z

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    if-eqz v1, :cond_c

    .line 174
    .line 175
    if-gt v3, v11, :cond_7

    .line 176
    .line 177
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 178
    .line 179
    add-int/lit8 v1, v1, 0x1

    .line 180
    .line 181
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_7
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    :goto_4
    if-ltz v3, :cond_b

    .line 189
    .line 190
    if-nez v3, :cond_9

    .line 191
    .line 192
    iget-byte v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪世兰哲:B

    .line 193
    .line 194
    iput-byte v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪苏哲:B

    .line 195
    .line 196
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪世哲兰:I

    .line 197
    .line 198
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 199
    .line 200
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰哲苏楪:I

    .line 201
    .line 202
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 203
    .line 204
    iget-wide v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰哲楪苏:J

    .line 205
    .line 206
    cmp-long v1, v1, v5

    .line 207
    .line 208
    if-nez v1, :cond_8

    .line 209
    .line 210
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰哲子世()J

    .line 211
    .line 212
    .line 213
    move-result-wide v1

    .line 214
    iput-wide v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰哲楪苏:J

    .line 215
    .line 216
    :cond_8
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰哲楪苏:J

    .line 217
    .line 218
    return-wide v0

    .line 219
    :cond_9
    mul-int/lit8 v3, v3, 0x2

    .line 220
    .line 221
    iget-object v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪哲世兰:[J

    .line 222
    .line 223
    add-int/lit8 v2, v3, 0x1

    .line 224
    .line 225
    aget-wide v7, v1, v2

    .line 226
    .line 227
    long-to-int v2, v7

    .line 228
    int-to-byte v4, v2

    .line 229
    iput-byte v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪苏哲:B

    .line 230
    .line 231
    shr-int/2addr v2, v12

    .line 232
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 233
    .line 234
    shr-long/2addr v7, v10

    .line 235
    long-to-int v2, v7

    .line 236
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 237
    .line 238
    aget-wide v7, v1, v3

    .line 239
    .line 240
    cmp-long v1, v7, v5

    .line 241
    .line 242
    if-nez v1, :cond_a

    .line 243
    .line 244
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰哲子世()J

    .line 245
    .line 246
    .line 247
    move-result-wide v1

    .line 248
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪哲世兰:[J

    .line 249
    .line 250
    aput-wide v1, v0, v3

    .line 251
    .line 252
    return-wide v1

    .line 253
    :cond_a
    return-wide v7

    .line 254
    :cond_b
    throw v7

    .line 255
    :cond_c
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)Z

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    if-eqz v1, :cond_14

    .line 260
    .line 261
    if-gt v3, v11, :cond_d

    .line 262
    .line 263
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 264
    .line 265
    add-int/lit8 v1, v1, 0x1

    .line 266
    .line 267
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 268
    .line 269
    move v8, v3

    .line 270
    goto :goto_5

    .line 271
    :cond_d
    if-gt v3, v9, :cond_e

    .line 272
    .line 273
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 274
    .line 275
    add-int/lit8 v4, v1, 0x1

    .line 276
    .line 277
    add-int/lit8 v8, v3, -0x38

    .line 278
    .line 279
    shl-int/2addr v8, v12

    .line 280
    add-int/lit8 v1, v1, 0x2

    .line 281
    .line 282
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 283
    .line 284
    aget-byte v1, v2, v4

    .line 285
    .line 286
    and-int/lit16 v1, v1, 0xff

    .line 287
    .line 288
    add-int/2addr v8, v1

    .line 289
    goto :goto_5

    .line 290
    :cond_e
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 291
    .line 292
    .line 293
    move-result v8

    .line 294
    :goto_5
    if-nez v8, :cond_10

    .line 295
    .line 296
    iget-byte v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪世兰哲:B

    .line 297
    .line 298
    iput-byte v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪苏哲:B

    .line 299
    .line 300
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪世哲兰:I

    .line 301
    .line 302
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 303
    .line 304
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰哲苏楪:I

    .line 305
    .line 306
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 307
    .line 308
    iget-wide v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰哲楪苏:J

    .line 309
    .line 310
    cmp-long v1, v1, v5

    .line 311
    .line 312
    if-nez v1, :cond_f

    .line 313
    .line 314
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 319
    .line 320
    .line 321
    move-result-wide v1

    .line 322
    iput-wide v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰哲楪苏:J

    .line 323
    .line 324
    :cond_f
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰哲楪苏:J

    .line 325
    .line 326
    goto :goto_6

    .line 327
    :cond_10
    if-ltz v8, :cond_13

    .line 328
    .line 329
    iget-object v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪哲世兰:[J

    .line 330
    .line 331
    mul-int/lit8 v2, v8, 0x2

    .line 332
    .line 333
    aget-wide v3, v1, v2

    .line 334
    .line 335
    cmp-long v7, v3, v5

    .line 336
    .line 337
    if-nez v7, :cond_11

    .line 338
    .line 339
    add-int/lit8 v2, v2, 0x1

    .line 340
    .line 341
    aget-wide v2, v1, v2

    .line 342
    .line 343
    long-to-int v1, v2

    .line 344
    int-to-byte v4, v1

    .line 345
    iput-byte v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪苏哲:B

    .line 346
    .line 347
    shr-int/2addr v1, v12

    .line 348
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 349
    .line 350
    shr-long v1, v2, v10

    .line 351
    .line 352
    long-to-int v1, v1

    .line 353
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 354
    .line 355
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 360
    .line 361
    .line 362
    move-result-wide v0

    .line 363
    goto :goto_6

    .line 364
    :cond_11
    move-wide v0, v3

    .line 365
    :goto_6
    const-wide/16 v2, -0x1

    .line 366
    .line 367
    cmp-long v2, v0, v2

    .line 368
    .line 369
    if-eqz v2, :cond_12

    .line 370
    .line 371
    return-wide v0

    .line 372
    :cond_12
    const-string v0, "type ref not found : "

    .line 373
    .line 374
    invoke-static {v8, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    return-wide v5

    .line 382
    :cond_13
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 383
    .line 384
    throw v7

    .line 385
    :cond_14
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 386
    .line 387
    add-int/lit8 v1, v1, 0x1

    .line 388
    .line 389
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 390
    .line 391
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 392
    .line 393
    const/16 v4, 0x7d

    .line 394
    .line 395
    const/16 v8, 0x7c

    .line 396
    .line 397
    const/16 v9, 0x7b

    .line 398
    .line 399
    const/16 v11, 0x7a

    .line 400
    .line 401
    const/16 v14, 0x49

    .line 402
    .line 403
    if-lt v3, v14, :cond_15

    .line 404
    .line 405
    const/16 v14, 0x78

    .line 406
    .line 407
    if-gt v3, v14, :cond_15

    .line 408
    .line 409
    add-int/lit8 v1, v3, -0x49

    .line 410
    .line 411
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 412
    .line 413
    goto :goto_9

    .line 414
    :cond_15
    if-eq v3, v13, :cond_17

    .line 415
    .line 416
    if-eq v3, v11, :cond_17

    .line 417
    .line 418
    if-eq v3, v9, :cond_17

    .line 419
    .line 420
    if-eq v3, v8, :cond_17

    .line 421
    .line 422
    if-ne v3, v4, :cond_16

    .line 423
    .line 424
    goto :goto_7

    .line 425
    :cond_16
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲世子苏兰()V

    .line 426
    .line 427
    .line 428
    throw v7

    .line 429
    :cond_17
    :goto_7
    aget-byte v1, v2, v1

    .line 430
    .line 431
    invoke-static {v1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(I)Z

    .line 432
    .line 433
    .line 434
    move-result v13

    .line 435
    if-eqz v13, :cond_18

    .line 436
    .line 437
    iget v13, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 438
    .line 439
    add-int/lit8 v13, v13, 0x1

    .line 440
    .line 441
    iput v13, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 442
    .line 443
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 444
    .line 445
    goto :goto_8

    .line 446
    :cond_18
    invoke-static {v1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(I)Z

    .line 447
    .line 448
    .line 449
    move-result v13

    .line 450
    if-eqz v13, :cond_19

    .line 451
    .line 452
    iget v13, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 453
    .line 454
    add-int/lit8 v14, v13, 0x1

    .line 455
    .line 456
    add-int/lit8 v13, v13, 0x2

    .line 457
    .line 458
    iput v13, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 459
    .line 460
    invoke-static {v14, v2, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰子哲世(I[BI)I

    .line 461
    .line 462
    .line 463
    move-result v1

    .line 464
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 465
    .line 466
    goto :goto_8

    .line 467
    :cond_19
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 468
    .line 469
    .line 470
    move-result v1

    .line 471
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 472
    .line 473
    :goto_8
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 474
    .line 475
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 476
    .line 477
    :goto_9
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 478
    .line 479
    if-ltz v1, :cond_29

    .line 480
    .line 481
    if-ne v3, v11, :cond_1b

    .line 482
    .line 483
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 484
    .line 485
    add-int/2addr v4, v1

    .line 486
    const-wide v7, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    :goto_a
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 492
    .line 493
    if-ge v1, v4, :cond_24

    .line 494
    .line 495
    aget-byte v9, v2, v1

    .line 496
    .line 497
    if-ltz v9, :cond_1a

    .line 498
    .line 499
    add-int/lit8 v1, v1, 0x1

    .line 500
    .line 501
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 502
    .line 503
    goto :goto_b

    .line 504
    :cond_1a
    and-int/lit16 v9, v9, 0xff

    .line 505
    .line 506
    shr-int/lit8 v11, v9, 0x4

    .line 507
    .line 508
    packed-switch v11, :pswitch_data_0

    .line 509
    .line 510
    .line 511
    const-string v1, "malformed input around byte "

    .line 512
    .line 513
    iget v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 514
    .line 515
    invoke-static {v0, v1}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世(ILjava/lang/String;)V

    .line 516
    .line 517
    .line 518
    return-wide v5

    .line 519
    :pswitch_0
    add-int/lit8 v11, v1, 0x1

    .line 520
    .line 521
    aget-byte v11, v2, v11

    .line 522
    .line 523
    add-int/lit8 v13, v1, 0x2

    .line 524
    .line 525
    aget-byte v13, v2, v13

    .line 526
    .line 527
    invoke-static {v9, v11, v13, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰苏世;->飘花落叶言楪苏哲兰子世(IIII)I

    .line 528
    .line 529
    .line 530
    move-result v9

    .line 531
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 532
    .line 533
    add-int/lit8 v1, v1, 0x3

    .line 534
    .line 535
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 536
    .line 537
    goto :goto_b

    .line 538
    :pswitch_1
    add-int/lit8 v11, v1, 0x1

    .line 539
    .line 540
    aget-byte v11, v2, v11

    .line 541
    .line 542
    invoke-static {v9, v11, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰苏世;->飘花落叶言楪苏哲世兰子(III)I

    .line 543
    .line 544
    .line 545
    move-result v9

    .line 546
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 547
    .line 548
    add-int/lit8 v1, v1, 0x2

    .line 549
    .line 550
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 551
    .line 552
    :goto_b
    int-to-long v13, v9

    .line 553
    xor-long/2addr v7, v13

    .line 554
    mul-long v7, v7, v17

    .line 555
    .line 556
    goto :goto_a

    .line 557
    :cond_1b
    if-eq v3, v9, :cond_23

    .line 558
    .line 559
    if-ne v3, v4, :cond_1c

    .line 560
    .line 561
    goto/16 :goto_12

    .line 562
    .line 563
    :cond_1c
    if-ne v3, v8, :cond_1d

    .line 564
    .line 565
    const/4 v6, 0x0

    .line 566
    const-wide v7, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    :goto_c
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 572
    .line 573
    if-ge v6, v1, :cond_24

    .line 574
    .line 575
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 576
    .line 577
    add-int/2addr v1, v6

    .line 578
    aget-byte v4, v2, v1

    .line 579
    .line 580
    add-int/lit8 v1, v1, 0x1

    .line 581
    .line 582
    aget-byte v1, v2, v1

    .line 583
    .line 584
    and-int/lit16 v4, v4, 0xff

    .line 585
    .line 586
    and-int/lit16 v1, v1, 0xff

    .line 587
    .line 588
    shl-int/2addr v1, v12

    .line 589
    or-int/2addr v1, v4

    .line 590
    int-to-char v1, v1

    .line 591
    int-to-long v4, v1

    .line 592
    xor-long/2addr v4, v7

    .line 593
    mul-long v7, v4, v17

    .line 594
    .line 595
    add-int/lit8 v6, v6, 0x2

    .line 596
    .line 597
    goto :goto_c

    .line 598
    :cond_1d
    if-gt v1, v12, :cond_20

    .line 599
    .line 600
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 601
    .line 602
    move-wide v7, v5

    .line 603
    const/4 v4, 0x0

    .line 604
    :goto_d
    iget v9, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 605
    .line 606
    if-ge v4, v9, :cond_21

    .line 607
    .line 608
    iget v9, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 609
    .line 610
    aget-byte v11, v2, v9

    .line 611
    .line 612
    if-ltz v11, :cond_1f

    .line 613
    .line 614
    if-nez v11, :cond_1e

    .line 615
    .line 616
    aget-byte v13, v2, v1

    .line 617
    .line 618
    if-nez v13, :cond_1e

    .line 619
    .line 620
    goto :goto_10

    .line 621
    :cond_1e
    packed-switch v4, :pswitch_data_1

    .line 622
    .line 623
    .line 624
    goto :goto_f

    .line 625
    :pswitch_2
    int-to-long v13, v11

    .line 626
    const/16 v11, 0x38

    .line 627
    .line 628
    shl-long/2addr v13, v11

    .line 629
    const-wide v15, 0xffffffffffffffL

    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    :goto_e
    and-long/2addr v7, v15

    .line 635
    add-long/2addr v7, v13

    .line 636
    goto :goto_f

    .line 637
    :pswitch_3
    int-to-long v13, v11

    .line 638
    const/16 v11, 0x30

    .line 639
    .line 640
    shl-long/2addr v13, v11

    .line 641
    const-wide v15, 0xffffffffffffL

    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    goto :goto_e

    .line 647
    :pswitch_4
    int-to-long v13, v11

    .line 648
    const/16 v11, 0x28

    .line 649
    .line 650
    shl-long/2addr v13, v11

    .line 651
    const-wide v15, 0xffffffffffL

    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    goto :goto_e

    .line 657
    :pswitch_5
    int-to-long v13, v11

    .line 658
    shl-long/2addr v13, v10

    .line 659
    const-wide v15, 0xffffffffL

    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    goto :goto_e

    .line 665
    :pswitch_6
    shl-int/lit8 v11, v11, 0x18

    .line 666
    .line 667
    int-to-long v13, v11

    .line 668
    const-wide/32 v15, 0xffffff

    .line 669
    .line 670
    .line 671
    goto :goto_e

    .line 672
    :pswitch_7
    shl-int/lit8 v11, v11, 0x10

    .line 673
    .line 674
    int-to-long v13, v11

    .line 675
    const-wide/32 v15, 0xffff

    .line 676
    .line 677
    .line 678
    goto :goto_e

    .line 679
    :pswitch_8
    shl-int/lit8 v11, v11, 0x8

    .line 680
    .line 681
    int-to-long v13, v11

    .line 682
    const-wide/16 v15, 0xff

    .line 683
    .line 684
    goto :goto_e

    .line 685
    :pswitch_9
    int-to-long v7, v11

    .line 686
    :goto_f
    add-int/lit8 v9, v9, 0x1

    .line 687
    .line 688
    iput v9, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 689
    .line 690
    add-int/lit8 v4, v4, 0x1

    .line 691
    .line 692
    goto :goto_d

    .line 693
    :cond_1f
    :goto_10
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 694
    .line 695
    :cond_20
    move-wide v7, v5

    .line 696
    :cond_21
    cmp-long v1, v7, v5

    .line 697
    .line 698
    if-eqz v1, :cond_22

    .line 699
    .line 700
    goto :goto_14

    .line 701
    :cond_22
    const/4 v6, 0x0

    .line 702
    const-wide v7, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    :goto_11
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 708
    .line 709
    if-ge v6, v1, :cond_24

    .line 710
    .line 711
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 712
    .line 713
    add-int/lit8 v4, v1, 0x1

    .line 714
    .line 715
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 716
    .line 717
    aget-byte v1, v2, v1

    .line 718
    .line 719
    int-to-long v4, v1

    .line 720
    xor-long/2addr v4, v7

    .line 721
    mul-long v7, v4, v17

    .line 722
    .line 723
    add-int/lit8 v6, v6, 0x1

    .line 724
    .line 725
    goto :goto_11

    .line 726
    :cond_23
    :goto_12
    const/4 v6, 0x0

    .line 727
    const-wide v7, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    :goto_13
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 733
    .line 734
    if-ge v6, v1, :cond_24

    .line 735
    .line 736
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 737
    .line 738
    add-int/2addr v1, v6

    .line 739
    aget-byte v4, v2, v1

    .line 740
    .line 741
    add-int/lit8 v1, v1, 0x1

    .line 742
    .line 743
    aget-byte v1, v2, v1

    .line 744
    .line 745
    and-int/lit16 v1, v1, 0xff

    .line 746
    .line 747
    and-int/lit16 v4, v4, 0xff

    .line 748
    .line 749
    shl-int/2addr v4, v12

    .line 750
    or-int/2addr v1, v4

    .line 751
    int-to-char v1, v1

    .line 752
    int-to-long v4, v1

    .line 753
    xor-long/2addr v4, v7

    .line 754
    mul-long v7, v4, v17

    .line 755
    .line 756
    add-int/lit8 v6, v6, 0x2

    .line 757
    .line 758
    goto :goto_13

    .line 759
    :cond_24
    :goto_14
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 760
    .line 761
    aget-byte v1, v2, v1

    .line 762
    .line 763
    iput-byte v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰楪苏:B

    .line 764
    .line 765
    invoke-static {v1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(I)Z

    .line 766
    .line 767
    .line 768
    move-result v1

    .line 769
    if-eqz v1, :cond_25

    .line 770
    .line 771
    iget-byte v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰楪苏:B

    .line 772
    .line 773
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 774
    .line 775
    add-int/lit8 v2, v2, 0x1

    .line 776
    .line 777
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 778
    .line 779
    goto :goto_15

    .line 780
    :cond_25
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 781
    .line 782
    .line 783
    move-result v1

    .line 784
    :goto_15
    if-nez v1, :cond_26

    .line 785
    .line 786
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 787
    .line 788
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰哲苏楪:I

    .line 789
    .line 790
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 791
    .line 792
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪世哲兰:I

    .line 793
    .line 794
    iput-byte v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪世兰哲:B

    .line 795
    .line 796
    iput-wide v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰哲楪苏:J

    .line 797
    .line 798
    return-wide v7

    .line 799
    :cond_26
    mul-int/lit8 v1, v1, 0x2

    .line 800
    .line 801
    add-int/lit8 v2, v1, 0x2

    .line 802
    .line 803
    iget-object v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪哲世兰:[J

    .line 804
    .line 805
    if-nez v4, :cond_27

    .line 806
    .line 807
    invoke-static {v2, v10}, Ljava/lang/Math;->max(II)I

    .line 808
    .line 809
    .line 810
    move-result v2

    .line 811
    new-array v2, v2, [J

    .line 812
    .line 813
    iput-object v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪哲世兰:[J

    .line 814
    .line 815
    goto :goto_16

    .line 816
    :cond_27
    array-length v5, v4

    .line 817
    if-ge v5, v2, :cond_28

    .line 818
    .line 819
    add-int/lit8 v2, v1, 0x12

    .line 820
    .line 821
    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 822
    .line 823
    .line 824
    move-result-object v2

    .line 825
    iput-object v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪哲世兰:[J

    .line 826
    .line 827
    :cond_28
    :goto_16
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 828
    .line 829
    int-to-long v4, v2

    .line 830
    shl-long/2addr v4, v10

    .line 831
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 832
    .line 833
    int-to-long v9, v2

    .line 834
    shl-long/2addr v9, v12

    .line 835
    add-long/2addr v4, v9

    .line 836
    int-to-long v2, v3

    .line 837
    add-long/2addr v4, v2

    .line 838
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子苏楪哲世兰:[J

    .line 839
    .line 840
    add-int/lit8 v1, v1, 0x1

    .line 841
    .line 842
    aput-wide v4, v0, v1

    .line 843
    .line 844
    return-wide v7

    .line 845
    :cond_29
    throw v7

    .line 846
    nop

    .line 847
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public final 飘花落叶言楪苏子兰世哲()Ljava/time/ZonedDateTime;
    .locals 13

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 6
    .line 7
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 8
    .line 9
    aget-byte v3, v2, v0

    .line 10
    .line 11
    const/16 v4, -0x56

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    if-ne v3, v4, :cond_2

    .line 15
    .line 16
    aget-byte v1, v2, v1

    .line 17
    .line 18
    shl-int/lit8 v1, v1, 0x8

    .line 19
    .line 20
    add-int/lit8 v3, v0, 0x2

    .line 21
    .line 22
    aget-byte v3, v2, v3

    .line 23
    .line 24
    and-int/lit16 v3, v3, 0xff

    .line 25
    .line 26
    add-int v6, v1, v3

    .line 27
    .line 28
    add-int/lit8 v1, v0, 0x3

    .line 29
    .line 30
    aget-byte v7, v2, v1

    .line 31
    .line 32
    add-int/lit8 v1, v0, 0x4

    .line 33
    .line 34
    aget-byte v8, v2, v1

    .line 35
    .line 36
    add-int/lit8 v1, v0, 0x5

    .line 37
    .line 38
    aget-byte v9, v2, v1

    .line 39
    .line 40
    add-int/lit8 v1, v0, 0x6

    .line 41
    .line 42
    aget-byte v10, v2, v1

    .line 43
    .line 44
    add-int/lit8 v1, v0, 0x7

    .line 45
    .line 46
    aget-byte v11, v2, v1

    .line 47
    .line 48
    add-int/lit8 v0, v0, 0x8

    .line 49
    .line 50
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 53
    .line 54
    .line 55
    move-result v12

    .line 56
    invoke-static/range {v6 .. v12}, Ljava/time/LocalDateTime;->of(IIIIIII)Ljava/time/LocalDateTime;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏子哲兰世()J

    .line 61
    .line 62
    .line 63
    move-result-wide v1

    .line 64
    const-wide v3, -0x42a0403329fb87bfL    # -4.511835427849096E-13

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    cmp-long v1, v1, v3

    .line 70
    .line 71
    if-nez v1, :cond_0

    .line 72
    .line 73
    sget-object p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Ljava/time/ZoneId;

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世兰苏哲()Ljava/time/ZoneId;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {p0}, Ljava/time/ZoneId;->getId()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_1
    sget-object p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Ljava/time/ZoneId;

    .line 98
    .line 99
    invoke-static {v1, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/time/ZoneId;)Ljava/time/ZoneId;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    :goto_0
    invoke-static {v0, p0, v5}, Ljava/time/ZonedDateTime;->ofLocal(Ljava/time/LocalDateTime;Ljava/time/ZoneId;Ljava/time/ZoneOffset;)Ljava/time/ZonedDateTime;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :cond_2
    const/16 v4, -0x58

    .line 109
    .line 110
    if-eq v3, v4, :cond_6

    .line 111
    .line 112
    const/16 v4, -0x57

    .line 113
    .line 114
    if-eq v3, v4, :cond_5

    .line 115
    .line 116
    const/16 v4, -0x42

    .line 117
    .line 118
    iget v6, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏兰楪:I

    .line 119
    .line 120
    if-eq v3, v4, :cond_4

    .line 121
    .line 122
    packed-switch v3, :pswitch_data_0

    .line 123
    .line 124
    .line 125
    const/16 v1, 0x49

    .line 126
    .line 127
    if-lt v3, v1, :cond_3

    .line 128
    .line 129
    const/16 v2, 0x78

    .line 130
    .line 131
    if-gt v3, v2, :cond_3

    .line 132
    .line 133
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 134
    .line 135
    sub-int/2addr v3, v1

    .line 136
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏子兰哲世(I)Ljava/time/ZonedDateTime;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    return-object p0

    .line 141
    :cond_3
    int-to-byte p0, v3

    .line 142
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰哲世子(B)Lcom/alibaba/fastjson2/JSONException;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    throw p0

    .line 147
    :pswitch_0
    return-object v5

    .line 148
    :pswitch_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世兰苏哲()J

    .line 149
    .line 150
    .line 151
    move-result-wide v0

    .line 152
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 153
    .line 154
    .line 155
    move-result p0

    .line 156
    int-to-long v2, p0

    .line 157
    invoke-static {v0, v1, v2, v3}, Ljava/time/Instant;->ofEpochSecond(JJ)Ljava/time/Instant;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 162
    .line 163
    invoke-static {p0, v0}, Ljava/time/ZonedDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    return-object p0

    .line 168
    :pswitch_2
    invoke-static {v1, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 169
    .line 170
    .line 171
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    int-to-long v0, v0

    .line 176
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 177
    .line 178
    add-int/lit8 v2, v2, 0x4

    .line 179
    .line 180
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 181
    .line 182
    const-wide/16 v2, 0x3c

    .line 183
    .line 184
    mul-long/2addr v0, v2

    .line 185
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochSecond(J)Ljava/time/Instant;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 190
    .line 191
    invoke-static {p0, v0}, Ljava/time/ZonedDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    return-object p0

    .line 196
    :pswitch_3
    invoke-static {v1, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 197
    .line 198
    .line 199
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世([BI)I

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    int-to-long v0, v0

    .line 204
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 205
    .line 206
    add-int/lit8 v2, v2, 0x4

    .line 207
    .line 208
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 209
    .line 210
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochSecond(J)Ljava/time/Instant;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 215
    .line 216
    invoke-static {p0, v0}, Ljava/time/ZonedDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    return-object p0

    .line 221
    :cond_4
    :pswitch_4
    invoke-static {v1, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲兰子世(II)V

    .line 222
    .line 223
    .line 224
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲([BI)J

    .line 225
    .line 226
    .line 227
    move-result-wide v0

    .line 228
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 229
    .line 230
    add-int/lit8 v2, v2, 0x8

    .line 231
    .line 232
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 233
    .line 234
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 239
    .line 240
    invoke-static {p0, v0}, Ljava/time/ZonedDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    return-object p0

    .line 245
    :cond_5
    add-int/lit8 v3, v0, 0x2

    .line 246
    .line 247
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 248
    .line 249
    aget-byte v1, v2, v1

    .line 250
    .line 251
    shl-int/lit8 v1, v1, 0x8

    .line 252
    .line 253
    add-int/lit8 v4, v0, 0x3

    .line 254
    .line 255
    iput v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 256
    .line 257
    aget-byte v3, v2, v3

    .line 258
    .line 259
    and-int/lit16 v3, v3, 0xff

    .line 260
    .line 261
    add-int/2addr v1, v3

    .line 262
    add-int/lit8 v3, v0, 0x4

    .line 263
    .line 264
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 265
    .line 266
    aget-byte v4, v2, v4

    .line 267
    .line 268
    add-int/lit8 v0, v0, 0x5

    .line 269
    .line 270
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 271
    .line 272
    aget-byte p0, v2, v3

    .line 273
    .line 274
    invoke-static {v1, v4, p0}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    sget-object v0, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 279
    .line 280
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 281
    .line 282
    invoke-static {p0, v0, v1}, Ljava/time/ZonedDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    return-object p0

    .line 287
    :cond_6
    add-int/lit8 v3, v0, 0x2

    .line 288
    .line 289
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 290
    .line 291
    aget-byte v1, v2, v1

    .line 292
    .line 293
    shl-int/lit8 v1, v1, 0x8

    .line 294
    .line 295
    add-int/lit8 v4, v0, 0x3

    .line 296
    .line 297
    iput v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 298
    .line 299
    aget-byte v3, v2, v3

    .line 300
    .line 301
    and-int/lit16 v3, v3, 0xff

    .line 302
    .line 303
    add-int v5, v1, v3

    .line 304
    .line 305
    add-int/lit8 v1, v0, 0x4

    .line 306
    .line 307
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 308
    .line 309
    aget-byte v6, v2, v4

    .line 310
    .line 311
    add-int/lit8 v3, v0, 0x5

    .line 312
    .line 313
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 314
    .line 315
    aget-byte v7, v2, v1

    .line 316
    .line 317
    add-int/lit8 v1, v0, 0x6

    .line 318
    .line 319
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 320
    .line 321
    aget-byte v8, v2, v3

    .line 322
    .line 323
    add-int/lit8 v3, v0, 0x7

    .line 324
    .line 325
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 326
    .line 327
    aget-byte v9, v2, v1

    .line 328
    .line 329
    add-int/lit8 v0, v0, 0x8

    .line 330
    .line 331
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 332
    .line 333
    aget-byte v10, v2, v3

    .line 334
    .line 335
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪子世苏兰哲()I

    .line 336
    .line 337
    .line 338
    move-result v11

    .line 339
    invoke-static/range {v5 .. v11}, Ljava/time/LocalDateTime;->of(IIIIIII)Ljava/time/LocalDateTime;

    .line 340
    .line 341
    .line 342
    move-result-object p0

    .line 343
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 344
    .line 345
    invoke-static {p0, v0}, Ljava/time/ZonedDateTime;->of(Ljava/time/LocalDateTime;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 346
    .line 347
    .line 348
    move-result-object p0

    .line 349
    return-object p0

    .line 350
    nop

    .line 351
    :pswitch_data_0
    .packed-switch -0x55
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言楪苏子兰哲世(I)Ljava/time/ZonedDateTime;
    .locals 5

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 4
    .line 5
    aget-byte v2, v1, v0

    .line 6
    .line 7
    iput-byte v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰楪苏:B

    .line 8
    .line 9
    const/16 v3, 0x49

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    if-lt v2, v3, :cond_1

    .line 13
    .line 14
    const/16 v3, 0x78

    .line 15
    .line 16
    if-gt v2, v3, :cond_1

    .line 17
    .line 18
    const/16 v2, 0x13

    .line 19
    .line 20
    if-lt p1, v2, :cond_0

    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 25
    .line 26
    iget-object v2, v2, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Ljava/time/ZoneId;

    .line 29
    .line 30
    invoke-static {v1, v0, p1, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏世兰楪哲([BIILjava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 37
    .line 38
    add-int/lit8 p1, p1, 0x1

    .line 39
    .line 40
    add-int/2addr p1, v1

    .line 41
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_0
    const-string p1, "illegal LocalDateTime string : "

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p0, p1}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v4

    .line 54
    :cond_1
    const-string p0, "date only support string input"

    .line 55
    .line 56
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v4
.end method

.method public final 飘花落叶言楪苏子哲世兰()Ljava/util/UUID;
    .locals 10

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 6
    .line 7
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 8
    .line 9
    aget-byte v3, v2, v0

    .line 10
    .line 11
    const/16 v4, -0x6f

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    if-eq v3, v4, :cond_8

    .line 15
    .line 16
    const/16 v4, -0x51

    .line 17
    .line 18
    if-eq v3, v4, :cond_7

    .line 19
    .line 20
    const/16 v4, 0x69

    .line 21
    .line 22
    const/16 v6, 0x20

    .line 23
    .line 24
    if-eq v3, v4, :cond_6

    .line 25
    .line 26
    const/16 v4, 0x6d

    .line 27
    .line 28
    const-string v7, "Invalid UUID string:  "

    .line 29
    .line 30
    const/16 v8, 0x24

    .line 31
    .line 32
    const/16 v9, 0x2d

    .line 33
    .line 34
    if-eq v3, v4, :cond_4

    .line 35
    .line 36
    const/16 v0, 0x79

    .line 37
    .line 38
    if-eq v3, v0, :cond_1

    .line 39
    .line 40
    const/16 v0, 0x7a

    .line 41
    .line 42
    if-ne v3, v0, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-static {v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏兰哲世子(B)Lcom/alibaba/fastjson2/JSONException;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    throw p0

    .line 50
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-ne v0, v6, :cond_2

    .line 55
    .line 56
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 57
    .line 58
    invoke-static {v2, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰苏世;->飘花落叶言楪哲子世兰苏([BI)Ljava/util/UUID;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 63
    .line 64
    add-int/2addr v1, v6

    .line 65
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 66
    .line 67
    return-object v0

    .line 68
    :cond_2
    if-ne v0, v8, :cond_3

    .line 69
    .line 70
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 71
    .line 72
    add-int/lit8 v3, v1, 0x8

    .line 73
    .line 74
    aget-byte v3, v2, v3

    .line 75
    .line 76
    if-ne v3, v9, :cond_3

    .line 77
    .line 78
    add-int/lit8 v3, v1, 0xd

    .line 79
    .line 80
    aget-byte v3, v2, v3

    .line 81
    .line 82
    if-ne v3, v9, :cond_3

    .line 83
    .line 84
    add-int/lit8 v3, v1, 0x12

    .line 85
    .line 86
    aget-byte v3, v2, v3

    .line 87
    .line 88
    if-ne v3, v9, :cond_3

    .line 89
    .line 90
    add-int/lit8 v3, v1, 0x17

    .line 91
    .line 92
    aget-byte v3, v2, v3

    .line 93
    .line 94
    if-ne v3, v9, :cond_3

    .line 95
    .line 96
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰苏世;->飘花落叶言楪哲子苏世兰([BI)Ljava/util/UUID;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 101
    .line 102
    add-int/2addr v1, v8

    .line 103
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 104
    .line 105
    return-object v0

    .line 106
    :cond_3
    new-instance v1, Ljava/lang/String;

    .line 107
    .line 108
    iget p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 109
    .line 110
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 111
    .line 112
    invoke-direct {v1, v2, p0, v0, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v7, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    return-object v5

    .line 123
    :cond_4
    add-int/lit8 v3, v0, 0x9

    .line 124
    .line 125
    aget-byte v3, v2, v3

    .line 126
    .line 127
    if-ne v3, v9, :cond_5

    .line 128
    .line 129
    add-int/lit8 v3, v0, 0xe

    .line 130
    .line 131
    aget-byte v3, v2, v3

    .line 132
    .line 133
    if-ne v3, v9, :cond_5

    .line 134
    .line 135
    add-int/lit8 v3, v0, 0x13

    .line 136
    .line 137
    aget-byte v3, v2, v3

    .line 138
    .line 139
    if-ne v3, v9, :cond_5

    .line 140
    .line 141
    add-int/lit8 v0, v0, 0x18

    .line 142
    .line 143
    aget-byte v0, v2, v0

    .line 144
    .line 145
    if-ne v0, v9, :cond_5

    .line 146
    .line 147
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰苏世;->飘花落叶言楪哲子苏世兰([BI)Ljava/util/UUID;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 152
    .line 153
    add-int/2addr v1, v8

    .line 154
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 155
    .line 156
    return-object v0

    .line 157
    :cond_5
    new-instance p0, Ljava/lang/String;

    .line 158
    .line 159
    sget-object v0, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 160
    .line 161
    invoke-direct {p0, v2, v1, v8, v0}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v7, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    return-object v5

    .line 172
    :cond_6
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰苏世;->飘花落叶言楪哲子世兰苏([BI)Ljava/util/UUID;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 177
    .line 178
    add-int/2addr v1, v6

    .line 179
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 180
    .line 181
    return-object v0

    .line 182
    :cond_7
    return-object v5

    .line 183
    :cond_8
    add-int/lit8 v3, v0, 0x2

    .line 184
    .line 185
    iput v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 186
    .line 187
    aget-byte v1, v2, v1

    .line 188
    .line 189
    const/16 v3, 0x10

    .line 190
    .line 191
    if-eq v1, v3, :cond_a

    .line 192
    .line 193
    add-int/lit8 v0, v0, 0x11

    .line 194
    .line 195
    iget v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏兰楪:I

    .line 196
    .line 197
    if-ge v0, v4, :cond_9

    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_9
    const-string p0, "uuid not support "

    .line 201
    .line 202
    invoke-static {v1, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    return-object v5

    .line 210
    :cond_a
    :goto_1
    new-instance v0, Ljava/util/UUID;

    .line 211
    .line 212
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 213
    .line 214
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲([BI)J

    .line 215
    .line 216
    .line 217
    move-result-wide v4

    .line 218
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 219
    .line 220
    add-int/lit8 v1, v1, 0x8

    .line 221
    .line 222
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏世哲([BI)J

    .line 223
    .line 224
    .line 225
    move-result-wide v1

    .line 226
    invoke-direct {v0, v4, v5, v1, v2}, Ljava/util/UUID;-><init>(JJ)V

    .line 227
    .line 228
    .line 229
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 230
    .line 231
    add-int/2addr v1, v3

    .line 232
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 233
    .line 234
    return-object v0
.end method

.method public final 飘花落叶言楪苏子哲兰世()J
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 8
    .line 9
    iget-object v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲苏楪兰:[B

    .line 10
    .line 11
    aget-byte v1, v3, v1

    .line 12
    .line 13
    iput-byte v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪苏哲:B

    .line 14
    .line 15
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 16
    .line 17
    const/16 v2, 0x49

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    const/16 v5, 0x7d

    .line 21
    .line 22
    const/16 v6, 0x7c

    .line 23
    .line 24
    const/16 v7, 0x7b

    .line 25
    .line 26
    const/16 v8, 0x7a

    .line 27
    .line 28
    const/16 v9, 0x7f

    .line 29
    .line 30
    if-lt v1, v2, :cond_0

    .line 31
    .line 32
    const/16 v2, 0x78

    .line 33
    .line 34
    if-gt v1, v2, :cond_0

    .line 35
    .line 36
    add-int/lit8 v2, v1, -0x49

    .line 37
    .line 38
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    const/16 v2, 0x79

    .line 42
    .line 43
    if-eq v1, v2, :cond_3

    .line 44
    .line 45
    if-eq v1, v8, :cond_3

    .line 46
    .line 47
    if-eq v1, v7, :cond_3

    .line 48
    .line 49
    if-eq v1, v6, :cond_3

    .line 50
    .line 51
    if-ne v1, v5, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    if-ne v1, v9, :cond_2

    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 61
    .line 62
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 63
    .line 64
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲世子苏兰()V

    .line 68
    .line 69
    .line 70
    throw v4

    .line 71
    :cond_3
    :goto_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪哲子兰苏世()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 76
    .line 77
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 78
    .line 79
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世兰楪哲苏:I

    .line 80
    .line 81
    :goto_1
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 82
    .line 83
    if-ltz v2, :cond_22

    .line 84
    .line 85
    const-wide v12, 0x100000001b3L

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    const-wide/16 v14, 0x0

    .line 91
    .line 92
    const/4 v4, 0x2

    .line 93
    if-ne v1, v8, :cond_6

    .line 94
    .line 95
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 96
    .line 97
    add-int/2addr v1, v2

    .line 98
    const-wide v10, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    :goto_2
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 104
    .line 105
    if-ge v2, v1, :cond_5

    .line 106
    .line 107
    aget-byte v5, v3, v2

    .line 108
    .line 109
    if-ltz v5, :cond_4

    .line 110
    .line 111
    add-int/lit8 v2, v2, 0x1

    .line 112
    .line 113
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_4
    and-int/lit16 v5, v5, 0xff

    .line 117
    .line 118
    shr-int/lit8 v6, v5, 0x4

    .line 119
    .line 120
    packed-switch v6, :pswitch_data_0

    .line 121
    .line 122
    .line 123
    const-string v1, "malformed input around byte "

    .line 124
    .line 125
    iget v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 126
    .line 127
    invoke-static {v0, v1}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世(ILjava/lang/String;)V

    .line 128
    .line 129
    .line 130
    return-wide v14

    .line 131
    :pswitch_0
    add-int/lit8 v6, v2, 0x1

    .line 132
    .line 133
    aget-byte v6, v3, v6

    .line 134
    .line 135
    add-int/lit8 v7, v2, 0x2

    .line 136
    .line 137
    aget-byte v7, v3, v7

    .line 138
    .line 139
    invoke-static {v5, v6, v7, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰苏世;->飘花落叶言楪苏哲兰子世(IIII)I

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 144
    .line 145
    add-int/lit8 v2, v2, 0x3

    .line 146
    .line 147
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :pswitch_1
    add-int/lit8 v6, v2, 0x1

    .line 151
    .line 152
    aget-byte v6, v3, v6

    .line 153
    .line 154
    invoke-static {v5, v6, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰苏世;->飘花落叶言楪苏哲世兰子(III)I

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 159
    .line 160
    add-int/2addr v2, v4

    .line 161
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 162
    .line 163
    :goto_3
    int-to-long v5, v5

    .line 164
    xor-long/2addr v5, v10

    .line 165
    mul-long v10, v5, v12

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_5
    return-wide v10

    .line 169
    :cond_6
    const-wide/16 v16, 0xff

    .line 170
    .line 171
    const-wide/32 v18, 0xffff

    .line 172
    .line 173
    .line 174
    const-wide/32 v20, 0xffffff

    .line 175
    .line 176
    .line 177
    const-wide v22, 0xffffffffL

    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    const-wide v24, 0xffffffffffL

    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    const/16 v26, 0x28

    .line 188
    .line 189
    const-wide v27, 0xffffffffffffL

    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    const/16 v29, 0x30

    .line 195
    .line 196
    const-wide v30, 0xffffffffffffffL

    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    const/16 v32, 0x38

    .line 202
    .line 203
    const/16 v33, 0x0

    .line 204
    .line 205
    const/16 v4, 0x10

    .line 206
    .line 207
    const/16 v34, 0x20

    .line 208
    .line 209
    const/16 v8, 0x8

    .line 210
    .line 211
    if-ne v1, v7, :cond_10

    .line 212
    .line 213
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 214
    .line 215
    aget-byte v5, v3, v1

    .line 216
    .line 217
    const/4 v6, -0x1

    .line 218
    const/4 v7, -0x2

    .line 219
    if-ne v5, v7, :cond_c

    .line 220
    .line 221
    add-int/lit8 v35, v1, 0x1

    .line 222
    .line 223
    aget-byte v10, v3, v35

    .line 224
    .line 225
    if-ne v10, v6, :cond_c

    .line 226
    .line 227
    if-gt v2, v4, :cond_a

    .line 228
    .line 229
    move-wide v4, v14

    .line 230
    const/4 v2, 0x2

    .line 231
    :goto_4
    iget v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 232
    .line 233
    if-ge v2, v6, :cond_9

    .line 234
    .line 235
    add-int v6, v1, v2

    .line 236
    .line 237
    aget-byte v7, v3, v6

    .line 238
    .line 239
    add-int/lit8 v6, v6, 0x1

    .line 240
    .line 241
    aget-byte v6, v3, v6

    .line 242
    .line 243
    and-int/lit16 v6, v6, 0xff

    .line 244
    .line 245
    and-int/lit16 v7, v7, 0xff

    .line 246
    .line 247
    shl-int/2addr v7, v8

    .line 248
    or-int/2addr v6, v7

    .line 249
    int-to-char v6, v6

    .line 250
    if-gt v6, v9, :cond_8

    .line 251
    .line 252
    if-nez v2, :cond_7

    .line 253
    .line 254
    if-nez v6, :cond_7

    .line 255
    .line 256
    goto :goto_7

    .line 257
    :cond_7
    int-to-byte v6, v6

    .line 258
    add-int/lit8 v7, v2, -0x2

    .line 259
    .line 260
    shr-int/lit8 v7, v7, 0x1

    .line 261
    .line 262
    packed-switch v7, :pswitch_data_1

    .line 263
    .line 264
    .line 265
    goto :goto_6

    .line 266
    :pswitch_2
    int-to-long v6, v6

    .line 267
    shl-long v6, v6, v32

    .line 268
    .line 269
    and-long v4, v4, v30

    .line 270
    .line 271
    :goto_5
    add-long/2addr v4, v6

    .line 272
    goto :goto_6

    .line 273
    :pswitch_3
    int-to-long v6, v6

    .line 274
    shl-long v6, v6, v29

    .line 275
    .line 276
    and-long v4, v4, v27

    .line 277
    .line 278
    goto :goto_5

    .line 279
    :pswitch_4
    int-to-long v6, v6

    .line 280
    shl-long v6, v6, v26

    .line 281
    .line 282
    and-long v4, v4, v24

    .line 283
    .line 284
    goto :goto_5

    .line 285
    :pswitch_5
    int-to-long v6, v6

    .line 286
    shl-long v6, v6, v34

    .line 287
    .line 288
    and-long v4, v4, v22

    .line 289
    .line 290
    goto :goto_5

    .line 291
    :pswitch_6
    shl-int/lit8 v6, v6, 0x18

    .line 292
    .line 293
    int-to-long v6, v6

    .line 294
    and-long v4, v4, v20

    .line 295
    .line 296
    goto :goto_5

    .line 297
    :pswitch_7
    shl-int/lit8 v6, v6, 0x10

    .line 298
    .line 299
    int-to-long v6, v6

    .line 300
    and-long v4, v4, v18

    .line 301
    .line 302
    goto :goto_5

    .line 303
    :pswitch_8
    shl-int/lit8 v6, v6, 0x8

    .line 304
    .line 305
    int-to-long v6, v6

    .line 306
    and-long v4, v4, v16

    .line 307
    .line 308
    goto :goto_5

    .line 309
    :pswitch_9
    int-to-long v4, v6

    .line 310
    :goto_6
    add-int/lit8 v2, v2, 0x2

    .line 311
    .line 312
    goto :goto_4

    .line 313
    :cond_8
    :goto_7
    move-wide v4, v14

    .line 314
    :cond_9
    cmp-long v2, v4, v14

    .line 315
    .line 316
    if-eqz v2, :cond_a

    .line 317
    .line 318
    return-wide v4

    .line 319
    :cond_a
    const/4 v4, 0x2

    .line 320
    const-wide v10, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    :goto_8
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 326
    .line 327
    if-ge v4, v2, :cond_b

    .line 328
    .line 329
    add-int v2, v1, v4

    .line 330
    .line 331
    aget-byte v5, v3, v2

    .line 332
    .line 333
    add-int/lit8 v2, v2, 0x1

    .line 334
    .line 335
    aget-byte v2, v3, v2

    .line 336
    .line 337
    and-int/lit16 v2, v2, 0xff

    .line 338
    .line 339
    and-int/lit16 v5, v5, 0xff

    .line 340
    .line 341
    shl-int/2addr v5, v8

    .line 342
    or-int/2addr v2, v5

    .line 343
    int-to-char v2, v2

    .line 344
    int-to-long v5, v2

    .line 345
    xor-long/2addr v5, v10

    .line 346
    mul-long v10, v5, v12

    .line 347
    .line 348
    add-int/lit8 v4, v4, 0x2

    .line 349
    .line 350
    goto :goto_8

    .line 351
    :cond_b
    return-wide v10

    .line 352
    :cond_c
    if-ne v5, v6, :cond_e

    .line 353
    .line 354
    add-int/lit8 v2, v1, 0x1

    .line 355
    .line 356
    aget-byte v2, v3, v2

    .line 357
    .line 358
    if-ne v2, v7, :cond_e

    .line 359
    .line 360
    const/4 v4, 0x2

    .line 361
    const-wide v10, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    :goto_9
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 367
    .line 368
    if-ge v4, v2, :cond_d

    .line 369
    .line 370
    add-int v2, v1, v4

    .line 371
    .line 372
    aget-byte v5, v3, v2

    .line 373
    .line 374
    add-int/lit8 v2, v2, 0x1

    .line 375
    .line 376
    aget-byte v2, v3, v2

    .line 377
    .line 378
    and-int/lit16 v5, v5, 0xff

    .line 379
    .line 380
    and-int/lit16 v2, v2, 0xff

    .line 381
    .line 382
    shl-int/2addr v2, v8

    .line 383
    or-int/2addr v2, v5

    .line 384
    int-to-char v2, v2

    .line 385
    int-to-long v5, v2

    .line 386
    xor-long/2addr v5, v10

    .line 387
    mul-long v10, v5, v12

    .line 388
    .line 389
    add-int/lit8 v4, v4, 0x2

    .line 390
    .line 391
    goto :goto_9

    .line 392
    :cond_d
    return-wide v10

    .line 393
    :cond_e
    move/from16 v2, v33

    .line 394
    .line 395
    const-wide v10, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    :goto_a
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 401
    .line 402
    if-ge v2, v4, :cond_f

    .line 403
    .line 404
    add-int v4, v1, v2

    .line 405
    .line 406
    aget-byte v5, v3, v4

    .line 407
    .line 408
    add-int/lit8 v4, v4, 0x1

    .line 409
    .line 410
    aget-byte v4, v3, v4

    .line 411
    .line 412
    and-int/lit16 v5, v5, 0xff

    .line 413
    .line 414
    and-int/lit16 v4, v4, 0xff

    .line 415
    .line 416
    shl-int/2addr v4, v8

    .line 417
    or-int/2addr v4, v5

    .line 418
    int-to-char v4, v4

    .line 419
    int-to-long v4, v4

    .line 420
    xor-long/2addr v4, v10

    .line 421
    mul-long v10, v4, v12

    .line 422
    .line 423
    add-int/lit8 v2, v2, 0x2

    .line 424
    .line 425
    goto :goto_a

    .line 426
    :cond_f
    return-wide v10

    .line 427
    :cond_10
    if-ne v1, v5, :cond_16

    .line 428
    .line 429
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 430
    .line 431
    if-gt v2, v4, :cond_14

    .line 432
    .line 433
    move-wide v4, v14

    .line 434
    move/from16 v2, v33

    .line 435
    .line 436
    :goto_b
    iget v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 437
    .line 438
    if-ge v2, v6, :cond_13

    .line 439
    .line 440
    add-int v6, v1, v2

    .line 441
    .line 442
    aget-byte v7, v3, v6

    .line 443
    .line 444
    add-int/lit8 v6, v6, 0x1

    .line 445
    .line 446
    aget-byte v6, v3, v6

    .line 447
    .line 448
    and-int/lit16 v6, v6, 0xff

    .line 449
    .line 450
    and-int/lit16 v7, v7, 0xff

    .line 451
    .line 452
    shl-int/2addr v7, v8

    .line 453
    or-int/2addr v6, v7

    .line 454
    int-to-char v6, v6

    .line 455
    if-gt v6, v9, :cond_12

    .line 456
    .line 457
    if-nez v2, :cond_11

    .line 458
    .line 459
    if-nez v6, :cond_11

    .line 460
    .line 461
    goto :goto_e

    .line 462
    :cond_11
    int-to-byte v6, v6

    .line 463
    shr-int/lit8 v7, v2, 0x1

    .line 464
    .line 465
    packed-switch v7, :pswitch_data_2

    .line 466
    .line 467
    .line 468
    goto :goto_d

    .line 469
    :pswitch_a
    int-to-long v6, v6

    .line 470
    shl-long v6, v6, v32

    .line 471
    .line 472
    and-long v4, v4, v30

    .line 473
    .line 474
    :goto_c
    add-long/2addr v4, v6

    .line 475
    goto :goto_d

    .line 476
    :pswitch_b
    int-to-long v6, v6

    .line 477
    shl-long v6, v6, v29

    .line 478
    .line 479
    and-long v4, v4, v27

    .line 480
    .line 481
    goto :goto_c

    .line 482
    :pswitch_c
    int-to-long v6, v6

    .line 483
    shl-long v6, v6, v26

    .line 484
    .line 485
    and-long v4, v4, v24

    .line 486
    .line 487
    goto :goto_c

    .line 488
    :pswitch_d
    int-to-long v6, v6

    .line 489
    shl-long v6, v6, v34

    .line 490
    .line 491
    and-long v4, v4, v22

    .line 492
    .line 493
    goto :goto_c

    .line 494
    :pswitch_e
    shl-int/lit8 v6, v6, 0x18

    .line 495
    .line 496
    int-to-long v6, v6

    .line 497
    and-long v4, v4, v20

    .line 498
    .line 499
    goto :goto_c

    .line 500
    :pswitch_f
    shl-int/lit8 v6, v6, 0x10

    .line 501
    .line 502
    int-to-long v6, v6

    .line 503
    and-long v4, v4, v18

    .line 504
    .line 505
    goto :goto_c

    .line 506
    :pswitch_10
    shl-int/lit8 v6, v6, 0x8

    .line 507
    .line 508
    int-to-long v6, v6

    .line 509
    and-long v4, v4, v16

    .line 510
    .line 511
    goto :goto_c

    .line 512
    :pswitch_11
    int-to-long v4, v6

    .line 513
    :goto_d
    add-int/lit8 v2, v2, 0x2

    .line 514
    .line 515
    goto :goto_b

    .line 516
    :cond_12
    :goto_e
    move-wide v4, v14

    .line 517
    :cond_13
    cmp-long v2, v4, v14

    .line 518
    .line 519
    if-eqz v2, :cond_14

    .line 520
    .line 521
    return-wide v4

    .line 522
    :cond_14
    move/from16 v2, v33

    .line 523
    .line 524
    const-wide v10, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    :goto_f
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 530
    .line 531
    if-ge v2, v4, :cond_15

    .line 532
    .line 533
    add-int v4, v1, v2

    .line 534
    .line 535
    aget-byte v5, v3, v4

    .line 536
    .line 537
    add-int/lit8 v4, v4, 0x1

    .line 538
    .line 539
    aget-byte v4, v3, v4

    .line 540
    .line 541
    and-int/lit16 v4, v4, 0xff

    .line 542
    .line 543
    and-int/lit16 v5, v5, 0xff

    .line 544
    .line 545
    shl-int/2addr v5, v8

    .line 546
    or-int/2addr v4, v5

    .line 547
    int-to-char v4, v4

    .line 548
    int-to-long v4, v4

    .line 549
    xor-long/2addr v4, v10

    .line 550
    mul-long v10, v4, v12

    .line 551
    .line 552
    add-int/lit8 v2, v2, 0x2

    .line 553
    .line 554
    goto :goto_f

    .line 555
    :cond_15
    return-wide v10

    .line 556
    :cond_16
    if-ne v1, v6, :cond_1c

    .line 557
    .line 558
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 559
    .line 560
    if-gt v2, v4, :cond_1a

    .line 561
    .line 562
    move-wide v4, v14

    .line 563
    move/from16 v2, v33

    .line 564
    .line 565
    :goto_10
    iget v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 566
    .line 567
    if-ge v2, v6, :cond_19

    .line 568
    .line 569
    add-int v6, v1, v2

    .line 570
    .line 571
    aget-byte v7, v3, v6

    .line 572
    .line 573
    add-int/lit8 v6, v6, 0x1

    .line 574
    .line 575
    aget-byte v6, v3, v6

    .line 576
    .line 577
    and-int/lit16 v7, v7, 0xff

    .line 578
    .line 579
    and-int/lit16 v6, v6, 0xff

    .line 580
    .line 581
    shl-int/2addr v6, v8

    .line 582
    or-int/2addr v6, v7

    .line 583
    int-to-char v6, v6

    .line 584
    if-gt v6, v9, :cond_18

    .line 585
    .line 586
    if-nez v2, :cond_17

    .line 587
    .line 588
    if-nez v6, :cond_17

    .line 589
    .line 590
    goto :goto_13

    .line 591
    :cond_17
    int-to-byte v6, v6

    .line 592
    shr-int/lit8 v7, v2, 0x1

    .line 593
    .line 594
    packed-switch v7, :pswitch_data_3

    .line 595
    .line 596
    .line 597
    goto :goto_12

    .line 598
    :pswitch_12
    int-to-long v6, v6

    .line 599
    shl-long v6, v6, v32

    .line 600
    .line 601
    and-long v4, v4, v30

    .line 602
    .line 603
    :goto_11
    add-long/2addr v4, v6

    .line 604
    goto :goto_12

    .line 605
    :pswitch_13
    int-to-long v6, v6

    .line 606
    shl-long v6, v6, v29

    .line 607
    .line 608
    and-long v4, v4, v27

    .line 609
    .line 610
    goto :goto_11

    .line 611
    :pswitch_14
    int-to-long v6, v6

    .line 612
    shl-long v6, v6, v26

    .line 613
    .line 614
    and-long v4, v4, v24

    .line 615
    .line 616
    goto :goto_11

    .line 617
    :pswitch_15
    int-to-long v6, v6

    .line 618
    shl-long v6, v6, v34

    .line 619
    .line 620
    and-long v4, v4, v22

    .line 621
    .line 622
    goto :goto_11

    .line 623
    :pswitch_16
    shl-int/lit8 v6, v6, 0x18

    .line 624
    .line 625
    int-to-long v6, v6

    .line 626
    and-long v4, v4, v20

    .line 627
    .line 628
    goto :goto_11

    .line 629
    :pswitch_17
    shl-int/lit8 v6, v6, 0x10

    .line 630
    .line 631
    int-to-long v6, v6

    .line 632
    and-long v4, v4, v18

    .line 633
    .line 634
    goto :goto_11

    .line 635
    :pswitch_18
    shl-int/lit8 v6, v6, 0x8

    .line 636
    .line 637
    int-to-long v6, v6

    .line 638
    and-long v4, v4, v16

    .line 639
    .line 640
    goto :goto_11

    .line 641
    :pswitch_19
    int-to-long v4, v6

    .line 642
    :goto_12
    add-int/lit8 v2, v2, 0x2

    .line 643
    .line 644
    goto :goto_10

    .line 645
    :cond_18
    :goto_13
    move-wide v4, v14

    .line 646
    :cond_19
    cmp-long v2, v4, v14

    .line 647
    .line 648
    if-eqz v2, :cond_1a

    .line 649
    .line 650
    return-wide v4

    .line 651
    :cond_1a
    move/from16 v2, v33

    .line 652
    .line 653
    const-wide v10, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    :goto_14
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 659
    .line 660
    if-ge v2, v4, :cond_1b

    .line 661
    .line 662
    add-int v4, v1, v2

    .line 663
    .line 664
    aget-byte v5, v3, v4

    .line 665
    .line 666
    add-int/lit8 v4, v4, 0x1

    .line 667
    .line 668
    aget-byte v4, v3, v4

    .line 669
    .line 670
    and-int/lit16 v5, v5, 0xff

    .line 671
    .line 672
    and-int/lit16 v4, v4, 0xff

    .line 673
    .line 674
    shl-int/2addr v4, v8

    .line 675
    or-int/2addr v4, v5

    .line 676
    int-to-char v4, v4

    .line 677
    int-to-long v4, v4

    .line 678
    xor-long/2addr v4, v10

    .line 679
    mul-long v10, v4, v12

    .line 680
    .line 681
    add-int/lit8 v2, v2, 0x2

    .line 682
    .line 683
    goto :goto_14

    .line 684
    :cond_1b
    return-wide v10

    .line 685
    :cond_1c
    if-gt v2, v8, :cond_20

    .line 686
    .line 687
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 688
    .line 689
    move-wide v4, v14

    .line 690
    move/from16 v2, v33

    .line 691
    .line 692
    :goto_15
    iget v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 693
    .line 694
    if-ge v2, v6, :cond_1f

    .line 695
    .line 696
    iget v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 697
    .line 698
    aget-byte v7, v3, v6

    .line 699
    .line 700
    if-ltz v7, :cond_1e

    .line 701
    .line 702
    if-nez v7, :cond_1d

    .line 703
    .line 704
    aget-byte v8, v3, v1

    .line 705
    .line 706
    if-nez v8, :cond_1d

    .line 707
    .line 708
    goto :goto_18

    .line 709
    :cond_1d
    packed-switch v2, :pswitch_data_4

    .line 710
    .line 711
    .line 712
    goto :goto_17

    .line 713
    :pswitch_1a
    int-to-long v7, v7

    .line 714
    shl-long v7, v7, v32

    .line 715
    .line 716
    and-long v4, v4, v30

    .line 717
    .line 718
    :goto_16
    add-long/2addr v4, v7

    .line 719
    goto :goto_17

    .line 720
    :pswitch_1b
    int-to-long v7, v7

    .line 721
    shl-long v7, v7, v29

    .line 722
    .line 723
    and-long v4, v4, v27

    .line 724
    .line 725
    goto :goto_16

    .line 726
    :pswitch_1c
    int-to-long v7, v7

    .line 727
    shl-long v7, v7, v26

    .line 728
    .line 729
    and-long v4, v4, v24

    .line 730
    .line 731
    goto :goto_16

    .line 732
    :pswitch_1d
    int-to-long v7, v7

    .line 733
    shl-long v7, v7, v34

    .line 734
    .line 735
    and-long v4, v4, v22

    .line 736
    .line 737
    goto :goto_16

    .line 738
    :pswitch_1e
    shl-int/lit8 v7, v7, 0x18

    .line 739
    .line 740
    int-to-long v7, v7

    .line 741
    and-long v4, v4, v20

    .line 742
    .line 743
    goto :goto_16

    .line 744
    :pswitch_1f
    shl-int/lit8 v7, v7, 0x10

    .line 745
    .line 746
    int-to-long v7, v7

    .line 747
    and-long v4, v4, v18

    .line 748
    .line 749
    goto :goto_16

    .line 750
    :pswitch_20
    shl-int/lit8 v7, v7, 0x8

    .line 751
    .line 752
    int-to-long v7, v7

    .line 753
    and-long v4, v4, v16

    .line 754
    .line 755
    goto :goto_16

    .line 756
    :pswitch_21
    int-to-long v4, v7

    .line 757
    :goto_17
    add-int/lit8 v6, v6, 0x1

    .line 758
    .line 759
    iput v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 760
    .line 761
    add-int/lit8 v2, v2, 0x1

    .line 762
    .line 763
    goto :goto_15

    .line 764
    :cond_1e
    :goto_18
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 765
    .line 766
    move-wide v4, v14

    .line 767
    :cond_1f
    cmp-long v1, v4, v14

    .line 768
    .line 769
    if-eqz v1, :cond_20

    .line 770
    .line 771
    return-wide v4

    .line 772
    :cond_20
    move/from16 v1, v33

    .line 773
    .line 774
    const-wide v10, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    :goto_19
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言子世哲兰苏楪:I

    .line 780
    .line 781
    if-ge v1, v2, :cond_21

    .line 782
    .line 783
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 784
    .line 785
    add-int/lit8 v4, v2, 0x1

    .line 786
    .line 787
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 788
    .line 789
    aget-byte v2, v3, v2

    .line 790
    .line 791
    int-to-long v4, v2

    .line 792
    xor-long/2addr v4, v10

    .line 793
    mul-long v10, v4, v12

    .line 794
    .line 795
    add-int/lit8 v1, v1, 0x1

    .line 796
    .line 797
    goto :goto_19

    .line 798
    :cond_21
    return-wide v10

    .line 799
    :cond_22
    throw v4

    .line 800
    nop

    .line 801
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch

    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch

    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
    .end packed-switch

    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
    .end packed-switch
.end method
