.class Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt8Array;
.super Lcom/alibaba/fastjson2/reader/ObjectReaderPrimitive;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field static final HASH_TYPE:J

.field static final INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt8Array;


# instance fields
.field final format:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt8Array;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt8Array;-><init>(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt8Array;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt8Array;

    .line 8
    .line 9
    const-string v0, "[Byte"

    .line 10
    .line 11
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    sput-wide v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt8Array;->HASH_TYPE:J

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
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderPrimitive;-><init>(Ljava/lang/Class;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt8Array;->format:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public createInstance(Ljava/util/Collection;J)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    new-array p2, p2, [Ljava/lang/Byte;

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
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    instance-of v1, v0, Ljava/lang/Number;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    check-cast v0, Ljava/lang/Number;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Number;->byteValue()B

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    const-class v3, Ljava/lang/Byte;

    .line 48
    .line 49
    invoke-virtual {v1, v2, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getTypeConvert(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/util/function/Function;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    invoke-interface {v1, v0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Ljava/lang/Byte;

    .line 60
    .line 61
    :goto_1
    add-int/lit8 v1, p3, 0x1

    .line 62
    .line 63
    aput-object v0, p2, p3

    .line 64
    .line 65
    move p3, v1

    .line 66
    goto :goto_0

    .line 67
    :cond_2
    const-string p1, "can not cast to Byte "

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-static {p2, p1}, Lah/a;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const/4 p1, 0x0

    .line 77
    return-object p1

    .line 78
    :cond_3
    return-object p2
.end method

.method public readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 1

    .line 1
    const/16 p2, -0x6e

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfMatch(B)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-eqz p2, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readTypeHashCode()J

    .line 10
    .line 11
    .line 12
    move-result-wide p2

    .line 13
    sget-wide p4, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt8Array;->HASH_TYPE:J

    .line 14
    .line 15
    cmp-long p2, p2, p4

    .line 16
    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string p2, "not support autoType : "

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1, p2}, Lah/a;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    return-object p1

    .line 31
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

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
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt8Array;->format:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-eqz p2, :cond_2

    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readHex()[B

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1

    .line 52
    :cond_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->startArray()I

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    const/4 p3, -0x1

    .line 57
    const/4 p4, 0x0

    .line 58
    if-ne p2, p3, :cond_3

    .line 59
    .line 60
    return-object p4

    .line 61
    :cond_3
    new-array p3, p2, [Ljava/lang/Byte;

    .line 62
    .line 63
    const/4 p5, 0x0

    .line 64
    :goto_1
    if-ge p5, p2, :cond_5

    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readInt32()Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-nez v0, :cond_4

    .line 71
    .line 72
    move-object v0, p4

    .line 73
    goto :goto_2

    .line 74
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Integer;->byteValue()B

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    :goto_2
    aput-object v0, p3, p5

    .line 83
    .line 84
    add-int/lit8 p5, p5, 0x1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_5
    return-object p3
.end method

.method public readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readIfNull()Z

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
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayStart()Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    const/4 p4, 0x0

    .line 14
    if-eqz p2, :cond_6

    .line 15
    .line 16
    const/16 p2, 0x10

    .line 17
    .line 18
    new-array p2, p2, [Ljava/lang/Byte;

    .line 19
    .line 20
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayEnd()Z

    .line 21
    .line 22
    .line 23
    move-result p5

    .line 24
    if-eqz p5, :cond_1

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 27
    .line 28
    .line 29
    invoke-static {p2, p4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :cond_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isEnd()Z

    .line 35
    .line 36
    .line 37
    move-result p5

    .line 38
    if-nez p5, :cond_5

    .line 39
    .line 40
    add-int/lit8 p5, p4, 0x1

    .line 41
    .line 42
    array-length v0, p2

    .line 43
    sub-int v0, p5, v0

    .line 44
    .line 45
    if-lez v0, :cond_3

    .line 46
    .line 47
    array-length v0, p2

    .line 48
    shr-int/lit8 v1, v0, 0x1

    .line 49
    .line 50
    add-int/2addr v0, v1

    .line 51
    sub-int v1, v0, p5

    .line 52
    .line 53
    if-gez v1, :cond_2

    .line 54
    .line 55
    move v0, p5

    .line 56
    :cond_2
    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    check-cast p2, [Ljava/lang/Byte;

    .line 61
    .line 62
    :cond_3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readInt32()Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-nez v0, :cond_4

    .line 67
    .line 68
    move-object v0, p3

    .line 69
    goto :goto_1

    .line 70
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Integer;->byteValue()B

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    :goto_1
    aput-object v0, p2, p4

    .line 79
    .line 80
    move p4, p5

    .line 81
    goto :goto_0

    .line 82
    :cond_5
    const-string p2, "input end"

    .line 83
    .line 84
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    const/4 p1, 0x0

    .line 92
    return-object p1

    .line 93
    :cond_6
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    const/16 p5, 0x78

    .line 98
    .line 99
    if-ne p2, p5, :cond_7

    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readBinary()[B

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    return-object p1

    .line 106
    :cond_7
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    if-eqz p2, :cond_e

    .line 111
    .line 112
    const-string p2, "hex"

    .line 113
    .line 114
    iget-object p5, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt8Array;->format:Ljava/lang/String;

    .line 115
    .line 116
    invoke-virtual {p2, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    if-eqz p2, :cond_8

    .line 121
    .line 122
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readHex()[B

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    return-object p1

    .line 127
    :cond_8
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 132
    .line 133
    .line 134
    move-result p5

    .line 135
    if-eqz p5, :cond_9

    .line 136
    .line 137
    return-object p3

    .line 138
    :cond_9
    const-string p3, "base64"

    .line 139
    .line 140
    iget-object p5, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt8Array;->format:Ljava/lang/String;

    .line 141
    .line 142
    invoke-virtual {p3, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result p3

    .line 146
    if-eqz p3, :cond_a

    .line 147
    .line 148
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/IOUtils;->decodeBase64(Ljava/lang/String;)[B

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    return-object p1

    .line 153
    :cond_a
    const-string p3, "gzip,base64"

    .line 154
    .line 155
    iget-object p5, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt8Array;->format:Ljava/lang/String;

    .line 156
    .line 157
    invoke-virtual {p3, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result p3

    .line 161
    if-nez p3, :cond_b

    .line 162
    .line 163
    const-string p3, "gzip"

    .line 164
    .line 165
    iget-object p5, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt8Array;->format:Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {p3, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result p3

    .line 171
    if-eqz p3, :cond_e

    .line 172
    .line 173
    :cond_b
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/IOUtils;->decodeBase64(Ljava/lang/String;)[B

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    :try_start_0
    new-instance p3, Ljava/util/zip/GZIPInputStream;

    .line 178
    .line 179
    new-instance p5, Ljava/io/ByteArrayInputStream;

    .line 180
    .line 181
    invoke-direct {p5, p2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 182
    .line 183
    .line 184
    invoke-direct {p3, p5}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    .line 185
    .line 186
    .line 187
    new-instance p2, Ljava/io/ByteArrayOutputStream;

    .line 188
    .line 189
    invoke-direct {p2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 190
    .line 191
    .line 192
    :cond_c
    :goto_2
    const/16 p5, 0x400

    .line 193
    .line 194
    new-array p5, p5, [B

    .line 195
    .line 196
    invoke-virtual {p3, p5}, Ljava/io/InputStream;->read([B)I

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
    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    return-object p1

    .line 208
    :catch_0
    move-exception p2

    .line 209
    goto :goto_3

    .line 210
    :cond_d
    if-lez v0, :cond_c

    .line 211
    .line 212
    invoke-virtual {p2, p5, p4, v0}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 213
    .line 214
    .line 215
    goto :goto_2

    .line 216
    :goto_3
    const-string p3, "unzip bytes error."

    .line 217
    .line 218
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-static {p1, p2}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 223
    .line 224
    .line 225
    const/4 p1, 0x0

    .line 226
    return-object p1

    .line 227
    :cond_e
    const-string p2, "TODO"

    .line 228
    .line 229
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    const/4 p1, 0x0

    .line 237
    return-object p1
.end method
