.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪世苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:[Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

.field public final 飘花落叶言子楪世兰苏哲:Z

.field public final 飘花落叶言子楪世哲兰苏:Z

.field public final 飘花落叶言子楪世哲苏兰:L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世哲苏兰;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

.field public final 飘花落叶言子楪世苏哲兰:L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;

.field public final 飘花落叶言子楪哲世兰苏:Ljava/lang/String;

.field public 飘花落叶言子楪哲世苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;

.field public final 飘花落叶言子楪苏世兰哲:I

.field public final 飘花落叶言子楪苏世哲兰:Z

.field public final 飘花落叶言子楪苏兰世哲:Ljava/lang/String;

.field public final 飘花落叶言子楪苏兰哲世:Ljava/lang/reflect/Constructor;

.field public final 飘花落叶言子楪苏哲世兰:I

.field public final 飘花落叶言子楪苏哲兰世:Ljava/lang/String;


# direct methods
.method public constructor <init>(L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;Ljava/lang/Class;L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世哲苏兰;Z[Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;Ljava/lang/reflect/Constructor;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世哲苏兰;

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    const/4 p3, 0x0

    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Class;->getModifiers()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v0, p3

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    :goto_0
    move v0, p1

    .line 28
    :goto_1
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪世哲兰苏:Z

    .line 29
    .line 30
    iput-boolean p4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪世兰苏哲:Z

    .line 31
    .line 32
    iput-object p5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪世兰哲苏:[Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    .line 33
    .line 34
    iput-object p6, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪苏兰哲世:Ljava/lang/reflect/Constructor;

    .line 35
    .line 36
    if-nez p2, :cond_2

    .line 37
    .line 38
    const-string p4, "java/lang/Object"

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_2
    invoke-static {p2}, L飘花落叶言楪子苏兰世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Class;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p4

    .line 45
    :goto_2
    iput-object p4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪哲世兰苏:Ljava/lang/String;

    .line 46
    .line 47
    move p4, p3

    .line 48
    move p6, p4

    .line 49
    move v0, p6

    .line 50
    move v1, v0

    .line 51
    :goto_3
    array-length v2, p5

    .line 52
    if-ge p4, v2, :cond_7

    .line 53
    .line 54
    aget-object v2, p5, p4

    .line 55
    .line 56
    iget-object v3, v2, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 57
    .line 58
    const-class v4, Ljava/lang/String;

    .line 59
    .line 60
    if-ne v3, v4, :cond_3

    .line 61
    .line 62
    move p6, p1

    .line 63
    :cond_3
    iget-object v2, v2, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 64
    .line 65
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 66
    .line 67
    invoke-virtual {v2, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    array-length v3, v2

    .line 72
    array-length v4, v2

    .line 73
    move v5, p3

    .line 74
    :goto_4
    if-ge v5, v4, :cond_5

    .line 75
    .line 76
    aget-byte v6, v2, v5

    .line 77
    .line 78
    if-gtz v6, :cond_4

    .line 79
    .line 80
    const/4 v3, -0x1

    .line 81
    goto :goto_5

    .line 82
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_5
    :goto_5
    if-nez p4, :cond_6

    .line 86
    .line 87
    move v0, v3

    .line 88
    move v1, v0

    .line 89
    goto :goto_6

    .line 90
    :cond_6
    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    :goto_6
    add-int/lit8 p4, p4, 0x1

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_7
    iput-boolean p6, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪苏世哲兰:Z

    .line 102
    .line 103
    iput v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪苏世兰哲:I

    .line 104
    .line 105
    iput v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪苏哲世兰:I

    .line 106
    .line 107
    new-instance p1, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    const-string p3, "ORG_"

    .line 110
    .line 111
    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    sget-object p3, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏世哲兰:Ljava/util/concurrent/atomic/AtomicLong;

    .line 115
    .line 116
    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 117
    .line 118
    .line 119
    move-result-wide p3

    .line 120
    invoke-virtual {p1, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string p3, "_"

    .line 124
    .line 125
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    array-length p4, p5

    .line 129
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    if-nez p2, :cond_8

    .line 133
    .line 134
    const-string p2, ""

    .line 135
    .line 136
    goto :goto_7

    .line 137
    :cond_8
    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    :goto_7
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    const-class p2, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪世兰苏;

    .line 153
    .line 154
    invoke-virtual {p2}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 155
    .line 156
    .line 157
    move-result-object p2

    .line 158
    if-eqz p2, :cond_9

    .line 159
    .line 160
    new-instance p2, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 163
    .line 164
    .line 165
    sget-object p3, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    const/16 p3, 0x2e

    .line 171
    .line 172
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪苏兰世哲:Ljava/lang/String;

    .line 183
    .line 184
    const/16 p2, 0x2f

    .line 185
    .line 186
    invoke-virtual {p1, p3, p2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪苏哲兰世:Ljava/lang/String;

    .line 191
    .line 192
    return-void

    .line 193
    :cond_9
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪苏哲兰世:Ljava/lang/String;

    .line 194
    .line 195
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪苏兰世哲:Ljava/lang/String;

    .line 196
    .line 197
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰()Z
    .locals 4

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    iget-wide v0, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰:J

    .line 4
    .line 5
    const-wide/high16 v2, 0x400000000000000L

    .line 6
    .line 7
    and-long/2addr v0, v2

    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long p0, v0, v2

    .line 11
    .line 12
    if-eqz p0, :cond_0

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

.method public final 飘花落叶言子楪世苏兰哲()Z
    .locals 4

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    iget-wide v0, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰:J

    .line 4
    .line 5
    const-wide/high16 v2, 0x1000000000000000L

    .line 6
    .line 7
    and-long/2addr v0, v2

    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long p0, v0, v2

    .line 11
    .line 12
    if-eqz p0, :cond_0

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

.method public final 飘花落叶言子楪世苏哲兰()Z
    .locals 4

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    iget-wide v0, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰:J

    .line 4
    .line 5
    const-wide/high16 v2, 0x800000000000000L

    .line 6
    .line 7
    and-long/2addr v0, v2

    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long p0, v0, v2

    .line 11
    .line 12
    if-eqz p0, :cond_0

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
