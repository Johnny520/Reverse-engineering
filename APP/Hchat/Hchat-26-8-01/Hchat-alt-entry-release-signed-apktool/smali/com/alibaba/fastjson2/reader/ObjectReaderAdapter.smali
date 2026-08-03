.class public Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;
.super Lcom/alibaba/fastjson2/reader/ObjectReaderBean;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/alibaba/fastjson2/reader/ObjectReaderBean<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final constructor:Ljava/lang/reflect/Constructor;

.field protected final fieldReaders:[Lcom/alibaba/fastjson2/reader/FieldReader;

.field final hashCodes:[J

.field final hashCodesLCase:[J

.field final mapping:[S

.field final mappingLCase:[S

.field final parameterCount:I

.field final seeAlso:[Ljava/lang/Class;

.field final seeAlsoDefault:Ljava/lang/Class;

.field final seeAlsoMapping:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/Class;",
            ">;"
        }
    .end annotation
.end field

.field final seeAlsoNames:[Ljava/lang/String;

.field protected final typeKey:Ljava/lang/String;

.field protected final typeKeyHashCode:J


# direct methods
.method public varargs constructor <init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Lcom/alibaba/fastjson2/reader/FieldReader;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "J",
            "Ljava/util/function/Supplier<",
            "TT;>;",
            "Ljava/util/function/Function;",
            "[",
            "Lcom/alibaba/fastjson2/reader/FieldReader;",
            ")V"
        }
    .end annotation

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide/from16 v4, p4

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v11, p8

    .line 281
    invoke-direct/range {v0 .. v11}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Ljava/lang/Class;[Ljava/lang/String;Ljava/lang/Class;[Lcom/alibaba/fastjson2/reader/FieldReader;)V

    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Ljava/lang/Class;[Ljava/lang/String;Ljava/lang/Class;[Lcom/alibaba/fastjson2/reader/FieldReader;)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "J",
            "Ljava/util/function/Supplier<",
            "TT;>;",
            "Ljava/util/function/Function;",
            "[",
            "Ljava/lang/Class;",
            "[",
            "Ljava/lang/String;",
            "Ljava/lang/Class;",
            "[",
            "Lcom/alibaba/fastjson2/reader/FieldReader;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v7, p2

    .line 2
    .line 3
    move-object/from16 v8, p8

    .line 4
    .line 5
    move-object/from16 v9, p9

    .line 6
    .line 7
    move-object v0, p0

    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    move-object/from16 v3, p3

    .line 11
    .line 12
    move-wide/from16 v4, p4

    .line 13
    .line 14
    move-object/from16 v2, p6

    .line 15
    .line 16
    move-object/from16 v6, p7

    .line 17
    .line 18
    move-object/from16 v10, p11

    .line 19
    .line 20
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;-><init>(Ljava/lang/Class;Ljava/util/function/Supplier;Ljava/lang/String;JLjava/util/function/Function;)V

    .line 21
    .line 22
    .line 23
    instance-of v3, v2, Lcom/alibaba/fastjson2/reader/ConstructorSupplier;

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x1

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    move-object v1, v2

    .line 30
    check-cast v1, Lcom/alibaba/fastjson2/reader/ConstructorSupplier;

    .line 31
    .line 32
    iget-object v1, v1, Lcom/alibaba/fastjson2/reader/ConstructorSupplier;->constructor:Ljava/lang/reflect/Constructor;

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    if-nez v1, :cond_1

    .line 36
    .line 37
    move-object v1, v4

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-static {v1, v5}, Lcom/alibaba/fastjson2/util/BeanUtils;->getDefaultConstructor(Ljava/lang/Class;Z)Ljava/lang/reflect/Constructor;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    :goto_0
    if-eqz v1, :cond_2

    .line 44
    .line 45
    invoke-virtual {v1, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 46
    .line 47
    .line 48
    :cond_2
    :goto_1
    if-eqz v1, :cond_3

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/reflect/Constructor;->getParameterCount()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    iput v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->parameterCount:I

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    const/4 v2, -0x1

    .line 58
    iput v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->parameterCount:I

    .line 59
    .line 60
    :goto_2
    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->constructor:Ljava/lang/reflect/Constructor;

    .line 61
    .line 62
    if-eqz v7, :cond_5

    .line 63
    .line 64
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_4

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_4
    iput-object v7, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->typeKey:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v7}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 74
    .line 75
    .line 76
    move-result-wide v1

    .line 77
    iput-wide v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->typeKeyHashCode:J

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_5
    :goto_3
    const-string v1, "@type"

    .line 81
    .line 82
    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->typeKey:Ljava/lang/String;

    .line 83
    .line 84
    const-wide v1, 0x6570797440L

    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    iput-wide v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->typeKeyHashCode:J

    .line 90
    .line 91
    :goto_4
    iput-object v10, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->fieldReaders:[Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 92
    .line 93
    array-length v1, v10

    .line 94
    new-array v2, v1, [J

    .line 95
    .line 96
    array-length v3, v10

    .line 97
    new-array v6, v3, [J

    .line 98
    .line 99
    const/4 v7, 0x0

    .line 100
    move v11, v7

    .line 101
    :goto_5
    array-length v12, v10

    .line 102
    if-ge v11, v12, :cond_9

    .line 103
    .line 104
    aget-object v12, v10, v11

    .line 105
    .line 106
    iget-wide v13, v12, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 107
    .line 108
    aput-wide v13, v2, v11

    .line 109
    .line 110
    iget-wide v13, v12, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 111
    .line 112
    aput-wide v13, v6, v11

    .line 113
    .line 114
    invoke-virtual {v12}, Lcom/alibaba/fastjson2/reader/FieldReader;->isUnwrapped()Z

    .line 115
    .line 116
    .line 117
    move-result v13

    .line 118
    if-eqz v13, :cond_7

    .line 119
    .line 120
    iget-object v13, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->extraFieldReader:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 121
    .line 122
    if-eqz v13, :cond_6

    .line 123
    .line 124
    instance-of v13, v13, Lcom/alibaba/fastjson2/reader/FieldReaderAnySetter;

    .line 125
    .line 126
    if-nez v13, :cond_7

    .line 127
    .line 128
    :cond_6
    iput-object v12, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->extraFieldReader:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 129
    .line 130
    :cond_7
    iget-object v12, v12, Lcom/alibaba/fastjson2/reader/FieldReader;->defaultValue:Ljava/lang/Object;

    .line 131
    .line 132
    if-eqz v12, :cond_8

    .line 133
    .line 134
    iput-boolean v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->hasDefaultValue:Z

    .line 135
    .line 136
    :cond_8
    add-int/lit8 v11, v11, 0x1

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_9
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    iput-object v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->hashCodes:[J

    .line 144
    .line 145
    invoke-static {v5}, Ljava/util/Arrays;->sort([J)V

    .line 146
    .line 147
    .line 148
    array-length v5, v5

    .line 149
    new-array v5, v5, [S

    .line 150
    .line 151
    iput-object v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->mapping:[S

    .line 152
    .line 153
    move v5, v7

    .line 154
    :goto_6
    if-ge v5, v1, :cond_a

    .line 155
    .line 156
    aget-wide v10, v2, v5

    .line 157
    .line 158
    iget-object v12, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->hashCodes:[J

    .line 159
    .line 160
    invoke-static {v12, v10, v11}, Ljava/util/Arrays;->binarySearch([JJ)I

    .line 161
    .line 162
    .line 163
    move-result v10

    .line 164
    iget-object v11, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->mapping:[S

    .line 165
    .line 166
    int-to-short v12, v5

    .line 167
    aput-short v12, v11, v10

    .line 168
    .line 169
    add-int/lit8 v5, v5, 0x1

    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_a
    invoke-static {v6, v3}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->hashCodesLCase:[J

    .line 177
    .line 178
    invoke-static {v1}, Ljava/util/Arrays;->sort([J)V

    .line 179
    .line 180
    .line 181
    array-length v1, v1

    .line 182
    new-array v1, v1, [S

    .line 183
    .line 184
    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->mappingLCase:[S

    .line 185
    .line 186
    move v1, v7

    .line 187
    :goto_7
    if-ge v1, v3, :cond_b

    .line 188
    .line 189
    aget-wide v10, v6, v1

    .line 190
    .line 191
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->hashCodesLCase:[J

    .line 192
    .line 193
    invoke-static {v2, v10, v11}, Ljava/util/Arrays;->binarySearch([JJ)I

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    iget-object v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->mappingLCase:[S

    .line 198
    .line 199
    int-to-short v10, v1

    .line 200
    aput-short v10, v5, v2

    .line 201
    .line 202
    add-int/lit8 v1, v1, 0x1

    .line 203
    .line 204
    goto :goto_7

    .line 205
    :cond_b
    iput-object v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->seeAlso:[Ljava/lang/Class;

    .line 206
    .line 207
    if-eqz v8, :cond_10

    .line 208
    .line 209
    new-instance v1, Ljava/util/HashMap;

    .line 210
    .line 211
    array-length v2, v8

    .line 212
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 213
    .line 214
    .line 215
    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->seeAlsoMapping:Ljava/util/Map;

    .line 216
    .line 217
    array-length v1, v8

    .line 218
    new-array v1, v1, [Ljava/lang/String;

    .line 219
    .line 220
    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->seeAlsoNames:[Ljava/lang/String;

    .line 221
    .line 222
    :goto_8
    array-length v1, v8

    .line 223
    if-ge v7, v1, :cond_f

    .line 224
    .line 225
    aget-object v1, v8, v7

    .line 226
    .line 227
    if-eqz v9, :cond_c

    .line 228
    .line 229
    array-length v2, v9

    .line 230
    add-int/lit8 v3, v7, 0x1

    .line 231
    .line 232
    if-lt v2, v3, :cond_c

    .line 233
    .line 234
    aget-object v2, v9, v7

    .line 235
    .line 236
    goto :goto_9

    .line 237
    :cond_c
    move-object v2, v4

    .line 238
    :goto_9
    if-eqz v2, :cond_d

    .line 239
    .line 240
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    if-eqz v3, :cond_e

    .line 245
    .line 246
    :cond_d
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    :cond_e
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 251
    .line 252
    .line 253
    move-result-wide v5

    .line 254
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->seeAlsoMapping:Ljava/util/Map;

    .line 255
    .line 256
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    invoke-interface {v3, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->seeAlsoNames:[Ljava/lang/String;

    .line 264
    .line 265
    aput-object v2, v1, v7

    .line 266
    .line 267
    add-int/lit8 v7, v7, 0x1

    .line 268
    .line 269
    goto :goto_8

    .line 270
    :cond_f
    :goto_a
    move-object/from16 v1, p10

    .line 271
    .line 272
    goto :goto_b

    .line 273
    :cond_10
    iput-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->seeAlsoMapping:Ljava/util/Map;

    .line 274
    .line 275
    iput-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->seeAlsoNames:[Ljava/lang/String;

    .line 276
    .line 277
    goto :goto_a

    .line 278
    :goto_b
    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->seeAlsoDefault:Ljava/lang/Class;

    .line 279
    .line 280
    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Ljava/lang/Class;[Ljava/lang/String;[Lcom/alibaba/fastjson2/reader/FieldReader;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "J",
            "Ljava/util/function/Supplier<",
            "TT;>;",
            "Ljava/util/function/Function;",
            "[",
            "Ljava/lang/Class;",
            "[",
            "Ljava/lang/String;",
            "[",
            "Lcom/alibaba/fastjson2/reader/FieldReader;",
            ")V"
        }
    .end annotation

    const/4 v10, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide/from16 v4, p4

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v11, p10

    .line 282
    invoke-direct/range {v0 .. v11}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Ljava/lang/Class;[Ljava/lang/String;Ljava/lang/Class;[Lcom/alibaba/fastjson2/reader/FieldReader;)V

    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/Class;Ljava/util/function/Supplier;[Lcom/alibaba/fastjson2/reader/FieldReader;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class;",
            "Ljava/util/function/Supplier<",
            "TT;>;[",
            "Lcom/alibaba/fastjson2/reader/FieldReader;",
            ")V"
        }
    .end annotation

    const-wide/16 v4, 0x0

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v6, p2

    move-object v8, p3

    .line 283
    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Lcom/alibaba/fastjson2/reader/FieldReader;)V

    return-void
.end method


# virtual methods
.method public autoType(Lcom/alibaba/fastjson2/JSONReader$Context;J)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->seeAlsoMapping:Ljava/util/Map;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 88
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->seeAlsoMapping:Ljava/util/Map;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Class;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 89
    :cond_0
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object p1

    return-object p1

    .line 90
    :cond_1
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object p1

    return-object p1
.end method

.method public autoType(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;J)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->seeAlsoMapping:Ljava/util/Map;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 84
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->seeAlsoMapping:Ljava/util/Map;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Class;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 85
    :cond_0
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object p1

    return-object p1

    .line 86
    :cond_1
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object p1

    return-object p1
.end method

.method public autoType(Lcom/alibaba/fastjson2/JSONReader;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/JSONReader;",
            ")TT;"
        }
    .end annotation

    .line 76
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readTypeHashCode()J

    move-result-wide v0

    .line 77
    iget-object v2, p1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 78
    invoke-virtual {p0, v2, v0, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->autoType(Lcom/alibaba/fastjson2/JSONReader$Context;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v0

    if-nez v0, :cond_1

    .line 79
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 80
    invoke-virtual {v2, v0, v1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(Ljava/lang/String;Ljava/lang/Class;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v1

    if-eqz v1, :cond_0

    move-object v0, v1

    goto :goto_0

    .line 81
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "auotype not support : "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1

    :cond_1
    :goto_0
    const/4 v3, 0x0

    .line 82
    iget-wide v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    const/4 v2, 0x0

    move-object v1, p1

    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public autoType(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Class;J)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readTypeHashCode()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 6
    .line 7
    invoke-virtual {p1, p3, p4}, Lcom/alibaba/fastjson2/JSONReader;->isSupportAutoTypeOrHandler(J)Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    invoke-virtual {v2, v0, v1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    if-nez v0, :cond_3

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-wide v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 26
    .line 27
    or-long/2addr v3, p3

    .line 28
    iget-wide v5, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 29
    .line 30
    or-long/2addr v3, v5

    .line 31
    invoke-virtual {v2, v0, p2, v3, v4}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(Ljava/lang/String;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 38
    .line 39
    if-ne p2, v1, :cond_1

    .line 40
    .line 41
    move-object v0, p0

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string p3, "auotype not support : "

    .line 46
    .line 47
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 p1, 0x0

    .line 65
    return-object p1

    .line 66
    :cond_2
    move-object v0, v1

    .line 67
    :cond_3
    :goto_1
    const/4 v2, 0x0

    .line 68
    const/4 v3, 0x0

    .line 69
    move-object v1, p1

    .line 70
    move-wide v4, p3

    .line 71
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1
.end method

.method public createInstance(J)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)TT;"
        }
    .end annotation

    .line 334
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->constructor:Ljava/lang/reflect/Constructor;

    const-string p2, "create instance error, "

    if-eqz p1, :cond_0

    iget v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->parameterCount:I

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 335
    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    .line 336
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    invoke-static {p2, v0, p1}, Lah/a;->o(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    :goto_1
    const/4 p1, 0x0

    return-object p1

    .line 337
    :cond_0
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->creator:Ljava/util/function/Supplier;

    if-eqz p1, :cond_2

    .line 338
    invoke-interface {p1}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object p1

    .line 339
    :goto_2
    iget-boolean p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->hasDefaultValue:Z

    if-eqz p2, :cond_1

    .line 340
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->initDefaultValue(Ljava/lang/Object;)V

    :cond_1
    return-object p1

    .line 341
    :cond_2
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    invoke-static {p1, p2}, Lah/a;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1
.end method

.method public createInstance(Ljava/util/Collection;J)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection;",
            "J)TT;"
        }
    .end annotation

    const-wide/16 p2, 0x0

    .line 342
    invoke-virtual {p0, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->createInstance(J)Ljava/lang/Object;

    move-result-object p2

    .line 343
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p3, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 344
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 345
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->fieldReaders:[Lcom/alibaba/fastjson2/reader/FieldReader;

    array-length v2, v1

    if-lt p3, v2, :cond_0

    goto :goto_1

    .line 346
    :cond_0
    aget-object v1, v1, p3

    .line 347
    invoke-virtual {v1, p2, v0}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-object p2
.end method

.method public createInstance(Ljava/util/Map;J)Ljava/lang/Object;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map;",
            "J)TT;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v4, p2

    .line 6
    .line 7
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getDefaultObjectReaderProvider()Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v3, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->typeKey:Ljava/lang/String;

    .line 12
    .line 13
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    iget-wide v6, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 18
    .line 19
    or-long/2addr v6, v4

    .line 20
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getDefaultReaderFeatures()J

    .line 21
    .line 22
    .line 23
    move-result-wide v8

    .line 24
    or-long/2addr v6, v8

    .line 25
    instance-of v8, v3, Ljava/lang/String;

    .line 26
    .line 27
    const/4 v9, 0x0

    .line 28
    const-wide/16 v10, 0x0

    .line 29
    .line 30
    if-eqz v8, :cond_3

    .line 31
    .line 32
    check-cast v3, Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v3}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 35
    .line 36
    .line 37
    move-result-wide v12

    .line 38
    sget-object v8, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 39
    .line 40
    iget-wide v14, v8, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 41
    .line 42
    and-long/2addr v14, v4

    .line 43
    cmp-long v8, v14, v10

    .line 44
    .line 45
    if-nez v8, :cond_1

    .line 46
    .line 47
    instance-of v8, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderSeeAlso;

    .line 48
    .line 49
    if-eqz v8, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move-object v8, v9

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    :goto_0
    invoke-virtual {v0, v2, v12, v13}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->autoType(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    :goto_1
    if-nez v8, :cond_2

    .line 59
    .line 60
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->getObjectClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    invoke-virtual {v2, v3, v8, v6, v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/String;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    :cond_2
    if-eq v8, v0, :cond_3

    .line 69
    .line 70
    if-eqz v8, :cond_3

    .line 71
    .line 72
    invoke-interface {v8, v1, v4, v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(Ljava/util/Map;J)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    return-object v1

    .line 77
    :cond_3
    invoke-virtual {v0, v10, v11}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->createInstance(J)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    iget-object v8, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->extraFieldReader:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 82
    .line 83
    if-nez v8, :cond_e

    .line 84
    .line 85
    sget-object v8, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportSmartMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 86
    .line 87
    iget-wide v12, v8, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 88
    .line 89
    sget-object v8, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnUnknownProperties:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 90
    .line 91
    iget-wide v14, v8, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 92
    .line 93
    or-long/2addr v12, v14

    .line 94
    and-long/2addr v12, v6

    .line 95
    cmp-long v8, v12, v10

    .line 96
    .line 97
    if-nez v8, :cond_e

    .line 98
    .line 99
    sget-object v8, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 100
    .line 101
    iget-wide v12, v8, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 102
    .line 103
    and-long/2addr v12, v6

    .line 104
    cmp-long v8, v12, v10

    .line 105
    .line 106
    const/4 v12, 0x0

    .line 107
    if-eqz v8, :cond_4

    .line 108
    .line 109
    const/4 v8, 0x1

    .line 110
    goto :goto_2

    .line 111
    :cond_4
    move v8, v12

    .line 112
    :goto_2
    iget-object v13, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->fieldReaders:[Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 113
    .line 114
    array-length v14, v13

    .line 115
    if-ge v12, v14, :cond_d

    .line 116
    .line 117
    aget-object v13, v13, v12

    .line 118
    .line 119
    iget-object v14, v13, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldName:Ljava/lang/String;

    .line 120
    .line 121
    invoke-interface {v1, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v14

    .line 125
    if-nez v14, :cond_5

    .line 126
    .line 127
    sget-object v15, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreSetNullValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 128
    .line 129
    move-wide/from16 v16, v10

    .line 130
    .line 131
    iget-wide v10, v15, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 132
    .line 133
    and-long/2addr v10, v6

    .line 134
    cmp-long v10, v10, v16

    .line 135
    .line 136
    if-nez v10, :cond_c

    .line 137
    .line 138
    iget-object v10, v13, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldName:Ljava/lang/String;

    .line 139
    .line 140
    invoke-interface {v1, v10}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v10

    .line 144
    if-nez v10, :cond_6

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_5
    move-wide/from16 v16, v10

    .line 148
    .line 149
    :cond_6
    iget-object v10, v13, Lcom/alibaba/fastjson2/reader/FieldReader;->field:Ljava/lang/reflect/Field;

    .line 150
    .line 151
    if-eqz v10, :cond_7

    .line 152
    .line 153
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 154
    .line 155
    .line 156
    move-result v10

    .line 157
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 158
    .line 159
    .line 160
    move-result v10

    .line 161
    if-eqz v10, :cond_7

    .line 162
    .line 163
    :try_start_0
    iget-object v10, v13, Lcom/alibaba/fastjson2/reader/FieldReader;->method:Ljava/lang/reflect/Method;

    .line 164
    .line 165
    invoke-virtual {v10, v3, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v10

    .line 169
    instance-of v11, v10, Ljava/util/Collection;

    .line 170
    .line 171
    if-eqz v11, :cond_7

    .line 172
    .line 173
    check-cast v10, Ljava/util/Collection;

    .line 174
    .line 175
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 176
    .line 177
    .line 178
    move-result v10
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 179
    if-nez v10, :cond_7

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :catch_0
    :cond_7
    if-eqz v14, :cond_b

    .line 183
    .line 184
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    move-result-object v10

    .line 188
    iget-object v11, v13, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldType:Ljava/lang/reflect/Type;

    .line 189
    .line 190
    if-ne v10, v11, :cond_8

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_8
    instance-of v10, v13, Lcom/alibaba/fastjson2/reader/FieldReaderList;

    .line 194
    .line 195
    if-eqz v10, :cond_9

    .line 196
    .line 197
    instance-of v10, v14, Lcom/alibaba/fastjson2/JSONArray;

    .line 198
    .line 199
    if-eqz v10, :cond_9

    .line 200
    .line 201
    invoke-virtual {v13, v2}, Lcom/alibaba/fastjson2/reader/FieldReader;->getObjectReader(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 202
    .line 203
    .line 204
    move-result-object v10

    .line 205
    check-cast v14, Lcom/alibaba/fastjson2/JSONArray;

    .line 206
    .line 207
    invoke-interface {v10, v14, v4, v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(Ljava/util/Collection;J)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v10

    .line 211
    invoke-virtual {v13, v3, v10}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    goto :goto_4

    .line 215
    :cond_9
    instance-of v10, v14, Lcom/alibaba/fastjson2/JSONObject;

    .line 216
    .line 217
    if-eqz v10, :cond_a

    .line 218
    .line 219
    const-class v10, Lcom/alibaba/fastjson2/JSONObject;

    .line 220
    .line 221
    if-eq v11, v10, :cond_a

    .line 222
    .line 223
    check-cast v14, Lcom/alibaba/fastjson2/JSONObject;

    .line 224
    .line 225
    invoke-virtual {v2, v11, v8}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 226
    .line 227
    .line 228
    move-result-object v10

    .line 229
    invoke-interface {v10, v14, v4, v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(Ljava/util/Map;J)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v10

    .line 233
    invoke-virtual {v13, v3, v10}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    goto :goto_4

    .line 237
    :cond_a
    invoke-virtual {v13, v3, v14, v4, v5}, Lcom/alibaba/fastjson2/reader/FieldReader;->acceptAny(Ljava/lang/Object;Ljava/lang/Object;J)V

    .line 238
    .line 239
    .line 240
    goto :goto_4

    .line 241
    :cond_b
    :goto_3
    invoke-virtual {v13, v3, v14}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    :cond_c
    :goto_4
    add-int/lit8 v12, v12, 0x1

    .line 245
    .line 246
    move-wide/from16 v10, v16

    .line 247
    .line 248
    goto/16 :goto_2

    .line 249
    .line 250
    :cond_d
    move-object v1, v3

    .line 251
    goto :goto_7

    .line 252
    :cond_e
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 257
    .line 258
    .line 259
    move-result-object v6

    .line 260
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    if-eqz v1, :cond_d

    .line 265
    .line 266
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    check-cast v1, Ljava/util/Map$Entry;

    .line 271
    .line 272
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v7

    .line 284
    invoke-interface {v0, v2}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getFieldReader(Ljava/lang/String;)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 285
    .line 286
    .line 287
    move-result-object v8

    .line 288
    if-nez v8, :cond_f

    .line 289
    .line 290
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    move-object/from16 v18, v3

    .line 295
    .line 296
    move-object v3, v1

    .line 297
    move-object/from16 v1, v18

    .line 298
    .line 299
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->acceptExtra(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;J)V

    .line 300
    .line 301
    .line 302
    :goto_6
    move-object v3, v1

    .line 303
    goto :goto_5

    .line 304
    :cond_f
    move-object v1, v3

    .line 305
    if-eqz v7, :cond_10

    .line 306
    .line 307
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    iget-object v3, v8, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldType:Ljava/lang/reflect/Type;

    .line 312
    .line 313
    if-ne v2, v3, :cond_10

    .line 314
    .line 315
    invoke-virtual {v8, v1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    goto :goto_6

    .line 319
    :cond_10
    invoke-virtual {v8, v1, v7, v4, v5}, Lcom/alibaba/fastjson2/reader/FieldReader;->acceptAny(Ljava/lang/Object;Ljava/lang/Object;J)V

    .line 320
    .line 321
    .line 322
    goto :goto_6

    .line 323
    :goto_7
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->buildFunction:Ljava/util/function/Function;

    .line 324
    .line 325
    if-eqz v2, :cond_11

    .line 326
    .line 327
    invoke-interface {v2, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    goto :goto_8

    .line 332
    :cond_11
    move-object v3, v1

    .line 333
    :goto_8
    return-object v3
.end method

.method public createInstance0(J)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseDefaultConstructorAsPossible:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 4
    .line 5
    and-long/2addr p1, v0

    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    cmp-long p1, p1, v0

    .line 9
    .line 10
    const-string p2, "create instance error, "

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->constructor:Ljava/lang/reflect/Constructor;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getParameterCount()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    :try_start_0
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->constructor:Ljava/lang/reflect/Constructor;

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-virtual {p1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    iget-boolean p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->hasDefaultValue:Z

    .line 32
    .line 33
    if-eqz p2, :cond_0

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->initDefaultValue(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    return-object p1

    .line 39
    :catch_0
    move-exception p1

    .line 40
    goto :goto_0

    .line 41
    :catch_1
    move-exception p1

    .line 42
    goto :goto_0

    .line 43
    :catch_2
    move-exception p1

    .line 44
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 45
    .line 46
    invoke-static {p2, v0, p1}, Lah/a;->o(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    :goto_1
    const/4 p1, 0x0

    .line 50
    return-object p1

    .line 51
    :cond_1
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->creator:Ljava/util/function/Supplier;

    .line 52
    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    invoke-interface {p1}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1

    .line 60
    :cond_2
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 61
    .line 62
    invoke-static {p1, p2}, Lah/a;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1
.end method

.method public final getBuildFunction()Ljava/util/function/Function;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->buildFunction:Ljava/util/function/Function;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFeatures()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getFieldReader(J)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->hashCodes:[J

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Ljava/util/Arrays;->binarySearch([JJ)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-gez p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1

    .line 11
    :cond_0
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->mapping:[S

    .line 12
    .line 13
    aget-short p1, p2, p1

    .line 14
    .line 15
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->fieldReaders:[Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 16
    .line 17
    aget-object p1, p2, p1

    .line 18
    .line 19
    return-object p1
.end method

.method public getFieldReaderLCase(J)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->hashCodesLCase:[J

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Ljava/util/Arrays;->binarySearch([JJ)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-gez p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1

    .line 11
    :cond_0
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->mappingLCase:[S

    .line 12
    .line 13
    aget-short p1, p2, p1

    .line 14
    .line 15
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->fieldReaders:[Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 16
    .line 17
    aget-object p1, p2, p1

    .line 18
    .line 19
    return-object p1
.end method

.method public getFieldReaders()[Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->fieldReaders:[Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, [Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 9
    .line 10
    return-object v0
.end method

.method public final getTypeKey()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->typeKey:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTypeKeyHash()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->typeKeyHashCode:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public initDefaultValue(Ljava/lang/Object;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->fieldReaders:[Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_1

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    iget-object v4, v3, Lcom/alibaba/fastjson2/reader/FieldReader;->defaultValue:Ljava/lang/Object;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    invoke-virtual {v3, p1, v4}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    return-void
.end method

.method public initStringFieldAsEmpty(Ljava/lang/Object;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->fieldReaders:[Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 3
    .line 4
    array-length v2, v1

    .line 5
    if-ge v0, v2, :cond_1

    .line 6
    .line 7
    aget-object v1, v1, v0

    .line 8
    .line 9
    iget-object v2, v1, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldClass:Ljava/lang/Class;

    .line 10
    .line 11
    const-class v3, Ljava/lang/String;

    .line 12
    .line 13
    if-ne v2, v3, :cond_0

    .line 14
    .line 15
    const-string v2, ""

    .line 16
    .line 17
    invoke-virtual {v1, p1, v2}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return-void
.end method

.method public readArrayMappingJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/JSONReader;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            "J)TT;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->serializable:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->errorOnNoneSerializable(Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 11
    .line 12
    iget-wide v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 13
    .line 14
    or-long/2addr v1, p4

    .line 15
    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->checkAutoType(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    if-eq v3, p0, :cond_1

    .line 22
    .line 23
    invoke-interface {v3}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getObjectClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 28
    .line 29
    if-eq v0, v1, :cond_1

    .line 30
    .line 31
    move-object v4, p1

    .line 32
    move-object v5, p2

    .line 33
    move-object v6, p3

    .line 34
    move-wide v7, p4

    .line 35
    invoke-interface/range {v3 .. v8}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readArrayMappingJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :cond_1
    move-object v4, p1

    .line 41
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->startArray()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    const-wide/16 p2, 0x0

    .line 46
    .line 47
    invoke-virtual {p0, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->createInstance(J)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    const/4 p3, 0x0

    .line 52
    :goto_0
    iget-object p4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->fieldReaders:[Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 53
    .line 54
    array-length p5, p4

    .line 55
    if-ge p3, p5, :cond_3

    .line 56
    .line 57
    if-lt p3, p1, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    aget-object p4, p4, p3

    .line 61
    .line 62
    invoke-virtual {p4, v4, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :goto_1
    add-int/lit8 p3, p3, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    array-length p3, p4

    .line 69
    :goto_2
    if-ge p3, p1, :cond_4

    .line 70
    .line 71
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->skipValue()V

    .line 72
    .line 73
    .line 74
    add-int/lit8 p3, p3, 0x1

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->buildFunction:Ljava/util/function/Function;

    .line 78
    .line 79
    if-eqz p1, :cond_5

    .line 80
    .line 81
    invoke-interface {p1, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    return-object p1

    .line 86
    :cond_5
    return-object p2
.end method

.method public readArrayMappingObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/JSONReader;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            "J)TT;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/JSONReader;->jsonb:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->readArrayMappingJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    move-object p2, p0

    .line 10
    return-object p1

    .line 11
    :cond_0
    move-object p2, p0

    .line 12
    iget-boolean p3, p2, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->serializable:Z

    .line 13
    .line 14
    if-nez p3, :cond_1

    .line 15
    .line 16
    iget-object p3, p2, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 17
    .line 18
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/JSONReader;->errorOnNoneSerializable(Ljava/lang/Class;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayStart()Z

    .line 22
    .line 23
    .line 24
    iget-object p3, p2, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->creator:Ljava/util/function/Supplier;

    .line 25
    .line 26
    invoke-interface {p3}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    const/4 p4, 0x0

    .line 31
    :goto_0
    iget-object p5, p2, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->fieldReaders:[Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 32
    .line 33
    array-length v0, p5

    .line 34
    if-ge p4, v0, :cond_2

    .line 35
    .line 36
    aget-object p5, p5, p4

    .line 37
    .line 38
    invoke-virtual {p5, p1, p3}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    add-int/lit8 p4, p4, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayEnd()Z

    .line 45
    .line 46
    .line 47
    move-result p4

    .line 48
    if-eqz p4, :cond_4

    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 51
    .line 52
    .line 53
    iget-object p1, p2, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->buildFunction:Ljava/util/function/Function;

    .line 54
    .line 55
    if-eqz p1, :cond_3

    .line 56
    .line 57
    invoke-interface {p1, p3}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1

    .line 62
    :cond_3
    return-object p3

    .line 63
    :cond_4
    const-string p3, "array to bean end error"

    .line 64
    .line 65
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    return-object p1
.end method

.method public final readFieldValue(JLcom/alibaba/fastjson2/JSONReader;JLjava/lang/Object;)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getFieldReader(J)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->disableSmartMatch:Z

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    iget-wide v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 12
    .line 13
    or-long/2addr p4, v1

    .line 14
    invoke-virtual {p3, p4, p5}, Lcom/alibaba/fastjson2/JSONReader;->isSupportSmartMatch(J)Z

    .line 15
    .line 16
    .line 17
    move-result p4

    .line 18
    if-eqz p4, :cond_1

    .line 19
    .line 20
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONReader;->getNameHashCodeLCase()J

    .line 21
    .line 22
    .line 23
    move-result-wide p4

    .line 24
    cmp-long v0, p4, p1

    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-wide p1, p4

    .line 30
    :goto_0
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getFieldReaderLCase(J)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :cond_1
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {v0, p3, p6}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    const-wide/16 p1, 0x0

    .line 41
    .line 42
    invoke-virtual {p0, p3, p6, p1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->processExtra(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;J)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/JSONReader;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            "J)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v6, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-object v6

    .line 9
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->getTypeNameHash()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    iget-wide v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 16
    .line 17
    or-long/2addr v4, p4

    .line 18
    move-object v0, p1

    .line 19
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/JSONReader;->checkAutoType(Ljava/lang/Class;JJ)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-interface {v1}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getObjectClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 30
    .line 31
    if-eq v0, v2, :cond_1

    .line 32
    .line 33
    move-object v2, p2

    .line 34
    move-object v3, p3

    .line 35
    move-wide v4, p4

    .line 36
    move-object v0, v1

    .line 37
    move-object v1, p1

    .line 38
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0

    .line 43
    :cond_1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->serializable:Z

    .line 44
    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->errorOnNoneSerializable(Ljava/lang/Class;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isArray()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isSupportBeanArray()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->readArrayMappingJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    return-object v0

    .line 69
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string v2, "expect object, but "

    .line 72
    .line 73
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getType()B

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    invoke-static {v2}, Lcom/alibaba/fastjson2/JSONB;->typeName(B)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    const/4 v0, 0x0

    .line 99
    return-object v0

    .line 100
    :cond_4
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectStart()Z

    .line 101
    .line 102
    .line 103
    const/4 v0, 0x0

    .line 104
    move-object v2, v6

    .line 105
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectEnd()Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-eqz v3, :cond_6

    .line 110
    .line 111
    if-nez v2, :cond_5

    .line 112
    .line 113
    iget-object v0, p1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 114
    .line 115
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 116
    .line 117
    or-long/2addr v0, p4

    .line 118
    invoke-virtual {p0, v0, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->createInstance(J)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    return-object v0

    .line 123
    :cond_5
    return-object v2

    .line 124
    :cond_6
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readFieldNameHashCode()J

    .line 125
    .line 126
    .line 127
    move-result-wide v3

    .line 128
    iget-wide v7, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->typeKeyHashCode:J

    .line 129
    .line 130
    cmp-long v5, v3, v7

    .line 131
    .line 132
    if-nez v5, :cond_a

    .line 133
    .line 134
    if-nez v0, :cond_a

    .line 135
    .line 136
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readValueHashCode()J

    .line 137
    .line 138
    .line 139
    move-result-wide v3

    .line 140
    iget-object v5, p1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 141
    .line 142
    invoke-virtual {p0, v5, v3, v4}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->autoType(Lcom/alibaba/fastjson2/JSONReader$Context;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    if-nez v3, :cond_8

    .line 147
    .line 148
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    invoke-virtual {v5, v3, v6}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(Ljava/lang/String;Ljava/lang/Class;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    if-eqz v4, :cond_7

    .line 157
    .line 158
    move-object v3, v4

    .line 159
    goto :goto_1

    .line 160
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    const-string v2, "auotype not support : "

    .line 163
    .line 164
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    const/4 v0, 0x0

    .line 182
    return-object v0

    .line 183
    :cond_8
    :goto_1
    if-ne v3, p0, :cond_9

    .line 184
    .line 185
    move-wide v7, p4

    .line 186
    goto :goto_2

    .line 187
    :cond_9
    const/4 v0, 0x1

    .line 188
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->setTypeRedirect(Z)V

    .line 189
    .line 190
    .line 191
    move-object v1, p1

    .line 192
    move-object v2, p2

    .line 193
    move-wide v4, p4

    .line 194
    move-object v0, v3

    .line 195
    move-object v3, p3

    .line 196
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    return-object v0

    .line 201
    :cond_a
    move-wide v7, p4

    .line 202
    const-wide/16 v9, 0x0

    .line 203
    .line 204
    cmp-long v5, v3, v9

    .line 205
    .line 206
    if-nez v5, :cond_b

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_b
    invoke-virtual {p0, v3, v4}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getFieldReader(J)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    if-nez v3, :cond_c

    .line 214
    .line 215
    iget-wide v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 216
    .line 217
    or-long/2addr v4, v7

    .line 218
    invoke-virtual {p1, v4, v5}, Lcom/alibaba/fastjson2/JSONReader;->isSupportSmartMatch(J)Z

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    if-eqz v4, :cond_c

    .line 223
    .line 224
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getNameHashCodeLCase()J

    .line 225
    .line 226
    .line 227
    move-result-wide v3

    .line 228
    invoke-virtual {p0, v3, v4}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getFieldReaderLCase(J)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    :cond_c
    if-nez v3, :cond_d

    .line 233
    .line 234
    invoke-virtual {p0, p1, v2, v7, v8}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->processExtra(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;J)V

    .line 235
    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_d
    if-nez v2, :cond_e

    .line 239
    .line 240
    iget-object v2, p1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 241
    .line 242
    iget-wide v4, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 243
    .line 244
    or-long/2addr v4, v7

    .line 245
    invoke-virtual {p0, v4, v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->createInstance(J)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    :cond_e
    invoke-virtual {v3, p1, v2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 253
    .line 254
    goto/16 :goto_0
.end method
