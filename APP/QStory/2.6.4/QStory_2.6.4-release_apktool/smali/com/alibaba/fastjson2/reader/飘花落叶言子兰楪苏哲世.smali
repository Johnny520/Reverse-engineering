.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪苏哲世;
.super Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世兰苏哲:J

.field public static final 飘花落叶言子楪世哲兰苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪苏哲世;


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪苏哲世;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪苏哲世;-><init>(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪苏哲世;->飘花落叶言子楪世哲兰苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪苏哲世;

    .line 8
    .line 9
    const-string v0, "[Byte"

    .line 10
    .line 11
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    sput-wide v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪苏哲世;->飘花落叶言子楪世兰苏哲:J

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-class v0, [Ljava/lang/Byte;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世兰哲;-><init>(Ljava/lang/Class;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪苏哲世;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世苏哲子兰()Z

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
    goto/16 :goto_2

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世哲苏楪()Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    const/4 p4, 0x0

    .line 15
    if-eqz p2, :cond_6

    .line 16
    .line 17
    const/16 p0, 0x10

    .line 18
    .line 19
    new-array p0, p0, [Ljava/lang/Byte;

    .line 20
    .line 21
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世哲楪苏()Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-nez p2, :cond_5

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰世苏楪()Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-nez p2, :cond_4

    .line 32
    .line 33
    add-int/lit8 p2, p4, 0x1

    .line 34
    .line 35
    array-length p5, p0

    .line 36
    sub-int p5, p2, p5

    .line 37
    .line 38
    if-lez p5, :cond_2

    .line 39
    .line 40
    array-length p5, p0

    .line 41
    shr-int/lit8 v0, p5, 0x1

    .line 42
    .line 43
    add-int/2addr p5, v0

    .line 44
    sub-int v0, p5, p2

    .line 45
    .line 46
    if-gez v0, :cond_1

    .line 47
    .line 48
    move p5, p2

    .line 49
    :cond_1
    invoke-static {p0, p5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, [Ljava/lang/Byte;

    .line 54
    .line 55
    :cond_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世苏兰子哲()Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object p5

    .line 59
    if-nez p5, :cond_3

    .line 60
    .line 61
    move-object p5, p3

    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-virtual {p5}, Ljava/lang/Integer;->byteValue()B

    .line 64
    .line 65
    .line 66
    move-result p5

    .line 67
    invoke-static {p5}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 68
    .line 69
    .line 70
    move-result-object p5

    .line 71
    :goto_1
    aput-object p5, p0, p4

    .line 72
    .line 73
    move p4, p2

    .line 74
    goto :goto_0

    .line 75
    :cond_4
    const-string p0, "input end"

    .line 76
    .line 77
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-object p3

    .line 85
    :cond_5
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏楪世哲()Z

    .line 86
    .line 87
    .line 88
    invoke-static {p0, p4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0

    .line 93
    :cond_6
    iget-char p2, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 94
    .line 95
    const/16 p5, 0x78

    .line 96
    .line 97
    if-ne p2, p5, :cond_7

    .line 98
    .line 99
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子兰世苏哲()[B

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0

    .line 104
    :cond_7
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏哲世()Z

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    if-eqz p2, :cond_e

    .line 109
    .line 110
    const-string p2, "hex"

    .line 111
    .line 112
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪苏哲世;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    if-eqz p2, :cond_8

    .line 119
    .line 120
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世苏子兰哲()[B

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :cond_8
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏子兰()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 130
    .line 131
    .line 132
    move-result p5

    .line 133
    if-eqz p5, :cond_9

    .line 134
    .line 135
    :goto_2
    return-object p3

    .line 136
    :cond_9
    const-string p5, "base64"

    .line 137
    .line 138
    invoke-virtual {p5, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result p5

    .line 142
    if-eqz p5, :cond_a

    .line 143
    .line 144
    invoke-static {}, Ljava/util/Base64;->getDecoder()Ljava/util/Base64$Decoder;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-virtual {p0, p2}, Ljava/util/Base64$Decoder;->decode(Ljava/lang/String;)[B

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    return-object p0

    .line 153
    :cond_a
    const-string p5, "gzip,base64"

    .line 154
    .line 155
    invoke-virtual {p5, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result p5

    .line 159
    if-nez p5, :cond_b

    .line 160
    .line 161
    const-string p5, "gzip"

    .line 162
    .line 163
    invoke-virtual {p5, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result p0

    .line 167
    if-eqz p0, :cond_e

    .line 168
    .line 169
    :cond_b
    invoke-static {}, Ljava/util/Base64;->getDecoder()Ljava/util/Base64$Decoder;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    invoke-virtual {p0, p2}, Ljava/util/Base64$Decoder;->decode(Ljava/lang/String;)[B

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    :try_start_0
    new-instance p2, Ljava/util/zip/GZIPInputStream;

    .line 178
    .line 179
    new-instance p5, Ljava/io/ByteArrayInputStream;

    .line 180
    .line 181
    invoke-direct {p5, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 182
    .line 183
    .line 184
    invoke-direct {p2, p5}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    .line 185
    .line 186
    .line 187
    new-instance p0, Ljava/io/ByteArrayOutputStream;

    .line 188
    .line 189
    invoke-direct {p0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 190
    .line 191
    .line 192
    :cond_c
    :goto_3
    const/16 p5, 0x400

    .line 193
    .line 194
    new-array p5, p5, [B

    .line 195
    .line 196
    invoke-virtual {p2, p5}, Ljava/io/InputStream;->read([B)I

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    const/4 v1, -0x1

    .line 201
    if-ne v0, v1, :cond_d

    .line 202
    .line 203
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    return-object p0

    .line 208
    :catch_0
    move-exception p0

    .line 209
    goto :goto_4

    .line 210
    :cond_d
    if-lez v0, :cond_c

    .line 211
    .line 212
    invoke-virtual {p0, p5, p4, v0}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 213
    .line 214
    .line 215
    goto :goto_3

    .line 216
    :goto_4
    const-string p2, "unzip bytes error."

    .line 217
    .line 218
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 223
    .line 224
    .line 225
    return-object p3

    .line 226
    :cond_e
    const-string p0, "TODO"

    .line 227
    .line 228
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    return-object p3
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljava/util/Collection;J)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    new-array p0, p0, [Ljava/lang/Byte;

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 p2, 0x0

    .line 12
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    if-eqz p3, :cond_3

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    const/4 v0, 0x0

    .line 23
    if-nez p3, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    instance-of v1, p3, Ljava/lang/Number;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    check-cast p3, Ljava/lang/Number;

    .line 31
    .line 32
    invoke-virtual {p3}, Ljava/lang/Number;->byteValue()B

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    invoke-static {p3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰()Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    const-class v3, Ljava/lang/Byte;

    .line 50
    .line 51
    invoke-virtual {v1, v2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏兰世哲(Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/util/function/Function;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    invoke-interface {v1, p3}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    move-object v0, p3

    .line 62
    check-cast v0, Ljava/lang/Byte;

    .line 63
    .line 64
    :goto_1
    add-int/lit8 p3, p2, 0x1

    .line 65
    .line 66
    aput-object v0, p0, p2

    .line 67
    .line 68
    move p2, p3

    .line 69
    goto :goto_0

    .line 70
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    const-string p1, "can not cast to Byte "

    .line 73
    .line 74
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-static {p3, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/Object;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-object v0

    .line 85
    :cond_3
    return-object p0
.end method

.method public final 飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 2

    .line 1
    const/16 p2, -0x6e

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏世楪哲(B)Z

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
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世兰苏子()J

    .line 11
    .line 12
    .line 13
    move-result-wide p4

    .line 14
    sget-wide v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪苏哲世;->飘花落叶言子楪世兰苏哲:J

    .line 15
    .line 16
    cmp-long p2, p4, v0

    .line 17
    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-string p0, "not support autoType : "

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object p3

    .line 31
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏哲世()Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_2

    .line 36
    .line 37
    const-string p2, "hex"

    .line 38
    .line 39
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪苏哲世;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-eqz p0, :cond_2

    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世苏子兰哲()[B

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :cond_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲兰世子苏()I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    const/4 p2, -0x1

    .line 57
    if-ne p0, p2, :cond_3

    .line 58
    .line 59
    return-object p3

    .line 60
    :cond_3
    new-array p2, p0, [Ljava/lang/Byte;

    .line 61
    .line 62
    const/4 p4, 0x0

    .line 63
    :goto_1
    if-ge p4, p0, :cond_5

    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世苏兰子哲()Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object p5

    .line 69
    if-nez p5, :cond_4

    .line 70
    .line 71
    move-object p5, p3

    .line 72
    goto :goto_2

    .line 73
    :cond_4
    invoke-virtual {p5}, Ljava/lang/Integer;->byteValue()B

    .line 74
    .line 75
    .line 76
    move-result p5

    .line 77
    invoke-static {p5}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 78
    .line 79
    .line 80
    move-result-object p5

    .line 81
    :goto_2
    aput-object p5, p2, p4

    .line 82
    .line 83
    add-int/lit8 p4, p4, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_5
    return-object p2
.end method
