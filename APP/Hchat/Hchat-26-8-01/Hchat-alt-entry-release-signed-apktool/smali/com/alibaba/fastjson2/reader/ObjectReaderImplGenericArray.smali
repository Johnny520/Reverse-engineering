.class Lcom/alibaba/fastjson2/reader/ObjectReaderImplGenericArray;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lcom/alibaba/fastjson2/reader/ObjectReader;


# instance fields
.field final arrayClass:Ljava/lang/Class;

.field final arrayClassName:Ljava/lang/String;

.field final arrayClassNameHash:J

.field final arrayType:Ljava/lang/reflect/Type;

.field final componentClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field itemObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field final itemType:Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/GenericArrayType;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplGenericArray;->arrayType:Ljava/lang/reflect/Type;

    .line 5
    .line 6
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/TypeUtils;->getClass(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplGenericArray;->arrayClass:Ljava/lang/Class;

    .line 11
    .line 12
    invoke-interface {p1}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplGenericArray;->itemType:Ljava/lang/reflect/Type;

    .line 17
    .line 18
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/TypeUtils;->getMapping(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplGenericArray;->componentClass:Ljava/lang/Class;

    .line 23
    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v1, "["

    .line 27
    .line 28
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplGenericArray;->arrayClassName:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    iput-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplGenericArray;->arrayClassNameHash:J

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 6

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
    iget-wide p4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplGenericArray;->arrayClassNameHash:J

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
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string p2, "not support input typeName "

    .line 25
    .line 26
    invoke-static {p2, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    return-object p1

    .line 35
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->startArray()I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-lez p2, :cond_2

    .line 40
    .line 41
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplGenericArray;->itemObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 42
    .line 43
    if-nez p3, :cond_2

    .line 44
    .line 45
    iget-object p3, p1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 46
    .line 47
    iget-object p4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplGenericArray;->itemType:Ljava/lang/reflect/Type;

    .line 48
    .line 49
    invoke-virtual {p3, p4}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    iput-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplGenericArray;->itemObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 54
    .line 55
    :cond_2
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplGenericArray;->componentClass:Ljava/lang/Class;

    .line 56
    .line 57
    invoke-static {p3, p2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    const/4 p4, 0x0

    .line 62
    :goto_1
    if-ge p4, p2, :cond_3

    .line 63
    .line 64
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplGenericArray;->itemObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 65
    .line 66
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplGenericArray;->itemType:Ljava/lang/reflect/Type;

    .line 67
    .line 68
    const/4 v3, 0x0

    .line 69
    const-wide/16 v4, 0x0

    .line 70
    .line 71
    move-object v1, p1

    .line 72
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-static {p3, p4, p1}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    add-int/lit8 p4, p4, 0x1

    .line 80
    .line 81
    move-object p1, v1

    .line 82
    goto :goto_1

    .line 83
    :cond_3
    return-object p3
.end method

.method public readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplGenericArray;->itemObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplGenericArray;->itemType:Ljava/lang/reflect/Type;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplGenericArray;->itemObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 14
    .line 15
    :cond_0
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/JSONReader;->jsonb:Z

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    const-wide/16 v5, 0x0

    .line 20
    .line 21
    move-object v1, p0

    .line 22
    move-object v2, p1

    .line 23
    move-object v3, p2

    .line 24
    move-object v4, p3

    .line 25
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplGenericArray;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :cond_1
    move-object v1, p0

    .line 31
    move-object v2, p1

    .line 32
    move-object v3, p2

    .line 33
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->readIfNull()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    const/4 p2, 0x0

    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    return-object p2

    .line 41
    :cond_2
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    const/16 p3, 0x22

    .line 46
    .line 47
    if-ne p1, p3, :cond_6

    .line 48
    .line 49
    instance-of p1, v3, Ljava/lang/reflect/GenericArrayType;

    .line 50
    .line 51
    if-eqz p1, :cond_4

    .line 52
    .line 53
    move-object p1, v3

    .line 54
    check-cast p1, Ljava/lang/reflect/GenericArrayType;

    .line 55
    .line 56
    invoke-interface {p1}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    sget-object p3, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 61
    .line 62
    if-ne p1, p3, :cond_4

    .line 63
    .line 64
    invoke-virtual {v2, p4, p5}, Lcom/alibaba/fastjson2/JSONReader;->features(J)J

    .line 65
    .line 66
    .line 67
    move-result-wide p1

    .line 68
    sget-object p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->Base64StringAsByteArray:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 69
    .line 70
    iget-wide p3, p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 71
    .line 72
    and-long/2addr p1, p3

    .line 73
    const-wide/16 p3, 0x0

    .line 74
    .line 75
    cmp-long p1, p1, p3

    .line 76
    .line 77
    if-eqz p1, :cond_3

    .line 78
    .line 79
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/IOUtils;->decodeBase64(Ljava/lang/String;)[B

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    return-object p1

    .line 88
    :cond_3
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->readBinary()[B

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    return-object p1

    .line 93
    :cond_4
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_5

    .line 102
    .line 103
    return-object p2

    .line 104
    :cond_5
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->info()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    const/4 p1, 0x0

    .line 112
    return-object p1

    .line 113
    :cond_6
    new-instance p2, Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 116
    .line 117
    .line 118
    const/16 p3, 0x5b

    .line 119
    .line 120
    if-ne p1, p3, :cond_b

    .line 121
    .line 122
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 123
    .line 124
    .line 125
    :goto_0
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayEnd()Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-eqz p1, :cond_8

    .line 130
    .line 131
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 132
    .line 133
    .line 134
    iget-object p1, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplGenericArray;->componentClass:Ljava/lang/Class;

    .line 135
    .line 136
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 137
    .line 138
    .line 139
    move-result p3

    .line 140
    invoke-static {p1, p3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    const/4 p3, 0x0

    .line 145
    :goto_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 146
    .line 147
    .line 148
    move-result p4

    .line 149
    if-ge p3, p4, :cond_7

    .line 150
    .line 151
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p4

    .line 155
    invoke-static {p1, p3, p4}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    add-int/lit8 p3, p3, 0x1

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_7
    return-object p1

    .line 162
    :cond_8
    move-object v3, v2

    .line 163
    iget-object v2, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplGenericArray;->itemObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 164
    .line 165
    iget-object v4, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplGenericArray;->itemType:Ljava/lang/reflect/Type;

    .line 166
    .line 167
    if-eqz v2, :cond_9

    .line 168
    .line 169
    const/4 v5, 0x0

    .line 170
    const-wide/16 v6, 0x0

    .line 171
    .line 172
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    move-object v2, v3

    .line 177
    goto :goto_2

    .line 178
    :cond_9
    move-object v2, v3

    .line 179
    const-class p1, Ljava/lang/String;

    .line 180
    .line 181
    if-ne v4, p1, :cond_a

    .line 182
    .line 183
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    :goto_2
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 191
    .line 192
    .line 193
    goto :goto_0

    .line 194
    :cond_a
    new-instance p1, Ljava/lang/StringBuilder;

    .line 195
    .line 196
    const-string p2, "TODO : "

    .line 197
    .line 198
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    iget-object p2, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplGenericArray;->itemType:Ljava/lang/reflect/Type;

    .line 202
    .line 203
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-virtual {v2, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    const/4 p1, 0x0

    .line 218
    return-object p1

    .line 219
    :cond_b
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->info()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    const/4 p1, 0x0

    .line 227
    return-object p1
.end method
