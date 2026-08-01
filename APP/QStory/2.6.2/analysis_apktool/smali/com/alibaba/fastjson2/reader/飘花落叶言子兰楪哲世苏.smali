.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪哲世苏;
.super Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世兰哲;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世兰哲苏:J

.field public static final 飘花落叶言子楪世兰苏哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪哲世苏;


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:J

.field public final 飘花落叶言子楪世哲苏兰:Ljava/util/function/Function;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪哲世苏;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪哲世苏;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪哲世苏;->飘花落叶言子楪世兰苏哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪哲世苏;

    .line 7
    .line 8
    const-string v0, "[B"

    .line 9
    .line 10
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    sput-wide v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪哲世苏;->飘花落叶言子楪世兰哲苏:J

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 26
    const-class v0, [B

    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世兰哲;-><init>(Ljava/lang/Class;)V

    const/4 v0, 0x0

    .line 27
    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪哲世苏;->飘花落叶言子楪世哲苏兰:Ljava/util/function/Function;

    const-wide/16 v0, 0x0

    .line 28
    iput-wide v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪哲世苏;->飘花落叶言子楪世哲兰苏:J

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/function/Function;)V
    .locals 2

    .line 1
    const-class v0, [B

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世兰哲;-><init>(Ljava/lang/Class;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "base64"

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->Base64StringAsByteArray:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 15
    .line 16
    iget-wide v0, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-wide/16 v0, 0x0

    .line 20
    .line 21
    :goto_0
    iput-wide v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪哲世苏;->飘花落叶言子楪世哲兰苏:J

    .line 22
    .line 23
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪哲世苏;->飘花落叶言子楪世哲苏兰:Ljava/util/function/Function;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲苏楪世()Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 p3, 0x0

    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    return-object p3

    .line 9
    :cond_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪世兰苏()Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪哲世苏;->飘花落叶言子楪世哲苏兰:Ljava/util/function/Function;

    .line 14
    .line 15
    if-eqz p2, :cond_6

    .line 16
    .line 17
    const/16 p0, 0x10

    .line 18
    .line 19
    new-array p0, p0, [B

    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪世苏兰()Z

    .line 23
    .line 24
    .line 25
    move-result p4

    .line 26
    if-nez p4, :cond_4

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世兰哲楪()Z

    .line 29
    .line 30
    .line 31
    move-result p4

    .line 32
    if-nez p4, :cond_3

    .line 33
    .line 34
    add-int/lit8 p4, p2, 0x1

    .line 35
    .line 36
    array-length p5, p0

    .line 37
    sub-int p5, p4, p5

    .line 38
    .line 39
    if-lez p5, :cond_2

    .line 40
    .line 41
    array-length p5, p0

    .line 42
    shr-int/lit8 v1, p5, 0x1

    .line 43
    .line 44
    add-int/2addr p5, v1

    .line 45
    sub-int v1, p5, p4

    .line 46
    .line 47
    if-gez v1, :cond_1

    .line 48
    .line 49
    move p5, p4

    .line 50
    :cond_1
    invoke-static {p0, p5}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    :cond_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏兰哲()I

    .line 55
    .line 56
    .line 57
    move-result p5

    .line 58
    int-to-byte p5, p5

    .line 59
    aput-byte p5, p0, p2

    .line 60
    .line 61
    move p2, p4

    .line 62
    goto :goto_0

    .line 63
    :cond_3
    const-string p0, "input end"

    .line 64
    .line 65
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-object p3

    .line 73
    :cond_4
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪苏世兰()Z

    .line 74
    .line 75
    .line 76
    invoke-static {p0, p2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    if-eqz v0, :cond_5

    .line 81
    .line 82
    invoke-interface {v0, p0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    :cond_5
    return-object p0

    .line 87
    :cond_6
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲兰世楪()Z

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    if-eqz p2, :cond_b

    .line 92
    .line 93
    iget-wide v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪哲世苏;->飘花落叶言子楪世哲兰苏:J

    .line 94
    .line 95
    or-long/2addr p4, v1

    .line 96
    invoke-virtual {p1, p4, p5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲世苏(J)J

    .line 97
    .line 98
    .line 99
    move-result-wide p4

    .line 100
    sget-object p0, Lcom/alibaba/fastjson2/JSONReader$Feature;->Base64StringAsByteArray:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 101
    .line 102
    iget-wide v1, p0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 103
    .line 104
    and-long/2addr p4, v1

    .line 105
    const-wide/16 v1, 0x0

    .line 106
    .line 107
    cmp-long p0, p4, v1

    .line 108
    .line 109
    if-eqz p0, :cond_7

    .line 110
    .line 111
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪哲苏世()[B

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    goto :goto_1

    .line 116
    :cond_7
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    if-eqz p2, :cond_8

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_8
    const-string p2, ";base64,"

    .line 128
    .line 129
    invoke-virtual {p0, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    const/4 p4, -0x1

    .line 134
    if-eq p2, p4, :cond_a

    .line 135
    .line 136
    add-int/lit8 p2, p2, 0x8

    .line 137
    .line 138
    invoke-virtual {p0, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-static {}, Ljava/util/Base64;->getDecoder()Ljava/util/Base64$Decoder;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-virtual {p1, p0}, Ljava/util/Base64$Decoder;->decode(Ljava/lang/String;)[B

    .line 147
    .line 148
    .line 149
    move-result-object p3

    .line 150
    :goto_1
    if-eqz v0, :cond_9

    .line 151
    .line 152
    invoke-interface {v0, p3}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    return-object p0

    .line 157
    :cond_9
    return-object p3

    .line 158
    :cond_a
    const-string p2, "illegal input : "

    .line 159
    .line 160
    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    return-object p3

    .line 172
    :cond_b
    const-string p0, "TODO"

    .line 173
    .line 174
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    return-object p3
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljava/util/Collection;J)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    new-array p2, p2, [B

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 p3, 0x0

    .line 12
    move v0, p3

    .line 13
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_3

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    move v1, p3

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    instance-of v2, v1, Ljava/lang/Number;

    .line 28
    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    check-cast v1, Ljava/lang/Number;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Number;->byteValue()B

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰()Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    sget-object v4, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 47
    .line 48
    invoke-virtual {v2, v3, v4}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏兰世哲(Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/util/function/Function;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    invoke-interface {v2, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Ljava/lang/Byte;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Byte;->byteValue()B

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    :goto_1
    add-int/lit8 v2, v0, 0x1

    .line 65
    .line 66
    aput-byte v1, p2, v0

    .line 67
    .line 68
    move v0, v2

    .line 69
    goto :goto_0

    .line 70
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    const-string p1, "can not cast to byte "

    .line 73
    .line 74
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v1, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/Object;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const/4 p0, 0x0

    .line 85
    return-object p0

    .line 86
    :cond_3
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪哲世苏;->飘花落叶言子楪世哲苏兰:Ljava/util/function/Function;

    .line 87
    .line 88
    if-eqz p0, :cond_4

    .line 89
    .line 90
    invoke-interface {p0, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0

    .line 95
    :cond_4
    return-object p2
.end method

.method public final 飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 2

    .line 1
    const/16 p2, -0x6e

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪兰世苏(B)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 p3, 0x0

    .line 8
    if-eqz p2, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子世兰哲()J

    .line 11
    .line 12
    .line 13
    move-result-wide p4

    .line 14
    sget-wide v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪哲世苏;->飘花落叶言子楪世兰哲苏:J

    .line 15
    .line 16
    cmp-long p2, p4, v0

    .line 17
    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    sget-wide v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪苏哲世;->飘花落叶言子楪世兰苏哲:J

    .line 21
    .line 22
    cmp-long p2, p4, v0

    .line 23
    .line 24
    if-nez p2, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string p0, "not support autoType : "

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世兰苏楪哲()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object p3

    .line 37
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世哲楪兰()Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-eqz p2, :cond_2

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世苏楪哲()[B

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲兰世楪()Z

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    const/4 p4, -0x1

    .line 53
    if-eqz p2, :cond_4

    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    const-string p2, ";base64,"

    .line 62
    .line 63
    invoke-virtual {p1, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    if-eq p2, p4, :cond_3

    .line 68
    .line 69
    add-int/lit8 p2, p2, 0x8

    .line 70
    .line 71
    invoke-virtual {p1, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    :cond_3
    invoke-static {}, Ljava/util/Base64;->getDecoder()Ljava/util/Base64$Decoder;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-virtual {p2, p1}, Ljava/util/Base64$Decoder;->decode(Ljava/lang/String;)[B

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    goto :goto_2

    .line 84
    :cond_4
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世兰子哲()I

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    if-ne p2, p4, :cond_5

    .line 89
    .line 90
    return-object p3

    .line 91
    :cond_5
    new-array p3, p2, [B

    .line 92
    .line 93
    const/4 p4, 0x0

    .line 94
    :goto_1
    if-ge p4, p2, :cond_6

    .line 95
    .line 96
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏兰哲()I

    .line 97
    .line 98
    .line 99
    move-result p5

    .line 100
    int-to-byte p5, p5

    .line 101
    aput-byte p5, p3, p4

    .line 102
    .line 103
    add-int/lit8 p4, p4, 0x1

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_6
    move-object p1, p3

    .line 107
    :goto_2
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪哲世苏;->飘花落叶言子楪世哲苏兰:Ljava/util/function/Function;

    .line 108
    .line 109
    if-eqz p0, :cond_7

    .line 110
    .line 111
    invoke-interface {p0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0

    .line 116
    :cond_7
    return-object p1
.end method
