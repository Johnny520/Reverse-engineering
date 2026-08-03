.class public abstract Lcom/alibaba/fastjson2/writer/FieldWriter;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable;"
    }
.end annotation


# static fields
.field static final initObjectWriterUpdater:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater<",
            "Lcom/alibaba/fastjson2/writer/FieldWriter;",
            "Lcom/alibaba/fastjson2/writer/ObjectWriter;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final backReference:Z

.field public final decimalFormat:Ljava/text/DecimalFormat;

.field public final features:J

.field public final field:Ljava/lang/reflect/Field;

.field public final fieldClass:Ljava/lang/Class;

.field final fieldClassSerializable:Z

.field public final fieldName:Ljava/lang/String;

.field protected final fieldOffset:J

.field public final fieldType:Ljava/lang/reflect/Type;

.field public final format:Ljava/lang/String;

.field final hashCode:J

.field volatile initObjectWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

.field public final label:Ljava/lang/String;

.field final managedReference:Z

.field public final method:Ljava/lang/reflect/Method;

.field final nameJSONB:[B

.field nameSymbolCache:J

.field final nameWithColonUTF16:[C

.field final nameWithColonUTF8:[B

.field public final ordinal:I

.field transient path:Lcom/alibaba/fastjson2/JSONWriter$Path;

.field protected final primitive:Z

.field final raw:Z

.field final rootParentPath:Lcom/alibaba/fastjson2/JSONWriter$Path;

.field final symbol:Z

.field final trim:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 2
    .line 3
    const-string v1, "initObjectWriter"

    .line 4
    .line 5
    const-class v2, Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->initObjectWriterUpdater:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "string"

    .line 5
    .line 6
    invoke-virtual {v0, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-class v0, Ljava/lang/String;

    .line 13
    .line 14
    if-eq p8, v0, :cond_0

    .line 15
    .line 16
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 17
    .line 18
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 19
    .line 20
    or-long/2addr p3, v0

    .line 21
    :cond_0
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 22
    .line 23
    iput p2, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->ordinal:I

    .line 24
    .line 25
    iput-object p5, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->format:Ljava/lang/String;

    .line 26
    .line 27
    iput-object p6, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->label:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    iput-wide v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->hashCode:J

    .line 34
    .line 35
    iput-wide p3, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 36
    .line 37
    invoke-static {p7}, Lcom/alibaba/fastjson2/util/TypeUtils;->intern(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    iput-object p2, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldType:Ljava/lang/reflect/Type;

    .line 42
    .line 43
    iput-object p8, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldClass:Ljava/lang/Class;

    .line 44
    .line 45
    const/4 p2, 0x0

    .line 46
    const/4 p6, 0x1

    .line 47
    if-eqz p8, :cond_2

    .line 48
    .line 49
    const-class p7, Ljava/io/Serializable;

    .line 50
    .line 51
    invoke-virtual {p7, p8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 52
    .line 53
    .line 54
    move-result p7

    .line 55
    if-nez p7, :cond_1

    .line 56
    .line 57
    invoke-virtual {p8}, Ljava/lang/Class;->getModifiers()I

    .line 58
    .line 59
    .line 60
    move-result p7

    .line 61
    invoke-static {p7}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 62
    .line 63
    .line 64
    move-result p7

    .line 65
    if-nez p7, :cond_2

    .line 66
    .line 67
    :cond_1
    move p7, p6

    .line 68
    goto :goto_0

    .line 69
    :cond_2
    move p7, p2

    .line 70
    :goto_0
    iput-boolean p7, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldClassSerializable:Z

    .line 71
    .line 72
    iput-object p9, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->field:Ljava/lang/reflect/Field;

    .line 73
    .line 74
    iput-object p10, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->method:Ljava/lang/reflect/Method;

    .line 75
    .line 76
    invoke-virtual {p8}, Ljava/lang/Class;->isPrimitive()Z

    .line 77
    .line 78
    .line 79
    move-result p7

    .line 80
    iput-boolean p7, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->primitive:Z

    .line 81
    .line 82
    invoke-static {p1}, Lcom/alibaba/fastjson2/JSONB;->toBytes(Ljava/lang/String;)[B

    .line 83
    .line 84
    .line 85
    move-result-object p7

    .line 86
    iput-object p7, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->nameJSONB:[B

    .line 87
    .line 88
    if-eqz p5, :cond_4

    .line 89
    .line 90
    sget-object p7, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 91
    .line 92
    if-eq p8, p7, :cond_3

    .line 93
    .line 94
    const-class p7, [F

    .line 95
    .line 96
    if-eq p8, p7, :cond_3

    .line 97
    .line 98
    const-class p7, Ljava/lang/Float;

    .line 99
    .line 100
    if-eq p8, p7, :cond_3

    .line 101
    .line 102
    const-class p7, [Ljava/lang/Float;

    .line 103
    .line 104
    if-eq p8, p7, :cond_3

    .line 105
    .line 106
    sget-object p7, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 107
    .line 108
    if-eq p8, p7, :cond_3

    .line 109
    .line 110
    const-class p7, [D

    .line 111
    .line 112
    if-eq p8, p7, :cond_3

    .line 113
    .line 114
    const-class p7, Ljava/lang/Double;

    .line 115
    .line 116
    if-eq p8, p7, :cond_3

    .line 117
    .line 118
    const-class p7, [Ljava/lang/Double;

    .line 119
    .line 120
    if-eq p8, p7, :cond_3

    .line 121
    .line 122
    const-class p7, Ljava/math/BigDecimal;

    .line 123
    .line 124
    if-eq p8, p7, :cond_3

    .line 125
    .line 126
    const-class p7, [Ljava/math/BigDecimal;

    .line 127
    .line 128
    if-ne p8, p7, :cond_4

    .line 129
    .line 130
    :cond_3
    new-instance p7, Ljava/text/DecimalFormat;

    .line 131
    .line 132
    invoke-direct {p7, p5}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_4
    const/4 p7, 0x0

    .line 137
    :goto_1
    iput-object p7, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->decimalFormat:Ljava/text/DecimalFormat;

    .line 138
    .line 139
    if-eqz p9, :cond_5

    .line 140
    .line 141
    sget-object p7, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 142
    .line 143
    invoke-virtual {p7, p9}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 144
    .line 145
    .line 146
    move-result-wide p7

    .line 147
    goto :goto_2

    .line 148
    :cond_5
    const-wide/16 p7, -0x1

    .line 149
    .line 150
    :goto_2
    iput-wide p7, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldOffset:J

    .line 151
    .line 152
    const-string p7, "symbol"

    .line 153
    .line 154
    invoke-virtual {p7, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result p7

    .line 158
    iput-boolean p7, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->symbol:Z

    .line 159
    .line 160
    const-string p7, "trim"

    .line 161
    .line 162
    invoke-virtual {p7, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result p5

    .line 166
    iput-boolean p5, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->trim:Z

    .line 167
    .line 168
    const-wide/high16 p7, 0x4000000000000L

    .line 169
    .line 170
    and-long/2addr p7, p3

    .line 171
    const-wide/16 p9, 0x0

    .line 172
    .line 173
    cmp-long p5, p7, p9

    .line 174
    .line 175
    if-eqz p5, :cond_6

    .line 176
    .line 177
    move p5, p6

    .line 178
    goto :goto_3

    .line 179
    :cond_6
    move p5, p2

    .line 180
    :goto_3
    iput-boolean p5, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->raw:Z

    .line 181
    .line 182
    sget-object p5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->ReferenceDetection:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 183
    .line 184
    iget-wide p7, p5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 185
    .line 186
    and-long/2addr p7, p3

    .line 187
    cmp-long p5, p7, p9

    .line 188
    .line 189
    if-eqz p5, :cond_7

    .line 190
    .line 191
    move p5, p6

    .line 192
    goto :goto_4

    .line 193
    :cond_7
    move p5, p2

    .line 194
    :goto_4
    iput-boolean p5, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->managedReference:Z

    .line 195
    .line 196
    const-wide/high16 p7, 0x2000000000000000L

    .line 197
    .line 198
    and-long/2addr p3, p7

    .line 199
    cmp-long p3, p3, p9

    .line 200
    .line 201
    if-eqz p3, :cond_8

    .line 202
    .line 203
    move p3, p6

    .line 204
    goto :goto_5

    .line 205
    :cond_8
    move p3, p2

    .line 206
    :goto_5
    iput-boolean p3, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->backReference:Z

    .line 207
    .line 208
    new-instance p3, Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 209
    .line 210
    sget-object p4, Lcom/alibaba/fastjson2/JSONWriter$Path;->ROOT:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 211
    .line 212
    invoke-direct {p3, p4, p1}, Lcom/alibaba/fastjson2/JSONWriter$Path;-><init>(Lcom/alibaba/fastjson2/JSONWriter$Path;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    iput-object p3, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->rootParentPath:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 216
    .line 217
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 218
    .line 219
    .line 220
    move-result p3

    .line 221
    add-int/lit8 p4, p3, 0x3

    .line 222
    .line 223
    move p5, p2

    .line 224
    move p7, p4

    .line 225
    :goto_6
    const/16 p8, 0x7ff

    .line 226
    .line 227
    const/16 p9, 0x7f

    .line 228
    .line 229
    if-ge p5, p3, :cond_b

    .line 230
    .line 231
    invoke-virtual {p1, p5}, Ljava/lang/String;->charAt(I)C

    .line 232
    .line 233
    .line 234
    move-result p10

    .line 235
    if-lt p10, p6, :cond_9

    .line 236
    .line 237
    if-gt p10, p9, :cond_9

    .line 238
    .line 239
    goto :goto_7

    .line 240
    :cond_9
    if-le p10, p8, :cond_a

    .line 241
    .line 242
    add-int/lit8 p7, p7, 0x2

    .line 243
    .line 244
    goto :goto_7

    .line 245
    :cond_a
    add-int/lit8 p7, p7, 0x1

    .line 246
    .line 247
    :goto_7
    add-int/lit8 p5, p5, 0x1

    .line 248
    .line 249
    goto :goto_6

    .line 250
    :cond_b
    new-array p5, p7, [B

    .line 251
    .line 252
    const/16 p7, 0x22

    .line 253
    .line 254
    aput-byte p7, p5, p2

    .line 255
    .line 256
    move p10, p2

    .line 257
    move v0, p6

    .line 258
    :goto_8
    if-ge p10, p3, :cond_e

    .line 259
    .line 260
    invoke-virtual {p1, p10}, Ljava/lang/String;->charAt(I)C

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    if-lt v1, p6, :cond_c

    .line 265
    .line 266
    if-gt v1, p9, :cond_c

    .line 267
    .line 268
    add-int/lit8 v2, v0, 0x1

    .line 269
    .line 270
    int-to-byte v1, v1

    .line 271
    aput-byte v1, p5, v0

    .line 272
    .line 273
    move v0, v2

    .line 274
    goto :goto_9

    .line 275
    :cond_c
    if-le v1, p8, :cond_d

    .line 276
    .line 277
    add-int/lit8 v2, v0, 0x1

    .line 278
    .line 279
    shr-int/lit8 v3, v1, 0xc

    .line 280
    .line 281
    and-int/lit8 v3, v3, 0xf

    .line 282
    .line 283
    or-int/lit16 v3, v3, 0xe0

    .line 284
    .line 285
    int-to-byte v3, v3

    .line 286
    aput-byte v3, p5, v0

    .line 287
    .line 288
    add-int/lit8 v3, v0, 0x2

    .line 289
    .line 290
    shr-int/lit8 v4, v1, 0x6

    .line 291
    .line 292
    and-int/lit8 v4, v4, 0x3f

    .line 293
    .line 294
    or-int/lit16 v4, v4, 0x80

    .line 295
    .line 296
    int-to-byte v4, v4

    .line 297
    aput-byte v4, p5, v2

    .line 298
    .line 299
    add-int/lit8 v0, v0, 0x3

    .line 300
    .line 301
    and-int/lit8 v1, v1, 0x3f

    .line 302
    .line 303
    or-int/lit16 v1, v1, 0x80

    .line 304
    .line 305
    int-to-byte v1, v1

    .line 306
    aput-byte v1, p5, v3

    .line 307
    .line 308
    goto :goto_9

    .line 309
    :cond_d
    add-int/lit8 v2, v0, 0x1

    .line 310
    .line 311
    shr-int/lit8 v3, v1, 0x6

    .line 312
    .line 313
    and-int/lit8 v3, v3, 0x1f

    .line 314
    .line 315
    or-int/lit16 v3, v3, 0xc0

    .line 316
    .line 317
    int-to-byte v3, v3

    .line 318
    aput-byte v3, p5, v0

    .line 319
    .line 320
    add-int/lit8 v0, v0, 0x2

    .line 321
    .line 322
    and-int/lit8 v1, v1, 0x3f

    .line 323
    .line 324
    or-int/lit16 v1, v1, 0x80

    .line 325
    .line 326
    int-to-byte v1, v1

    .line 327
    aput-byte v1, p5, v2

    .line 328
    .line 329
    :goto_9
    add-int/lit8 p10, p10, 0x1

    .line 330
    .line 331
    goto :goto_8

    .line 332
    :cond_e
    add-int/lit8 p8, v0, 0x1

    .line 333
    .line 334
    aput-byte p7, p5, v0

    .line 335
    .line 336
    const/16 p9, 0x3a

    .line 337
    .line 338
    aput-byte p9, p5, p8

    .line 339
    .line 340
    iput-object p5, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->nameWithColonUTF8:[B

    .line 341
    .line 342
    new-array p4, p4, [C

    .line 343
    .line 344
    aput-char p7, p4, p2

    .line 345
    .line 346
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 347
    .line 348
    .line 349
    move-result p5

    .line 350
    invoke-virtual {p1, p2, p5, p4, p6}, Ljava/lang/String;->getChars(II[CI)V

    .line 351
    .line 352
    .line 353
    add-int/lit8 p1, p3, 0x1

    .line 354
    .line 355
    aput-char p7, p4, p1

    .line 356
    .line 357
    add-int/lit8 p3, p3, 0x2

    .line 358
    .line 359
    aput-char p9, p4, p3

    .line 360
    .line 361
    iput-object p4, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->nameWithColonUTF16:[C

    .line 362
    .line 363
    return-void
.end method

.method public static getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 1

    .line 1
    const-class v0, Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {v0, p4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1, p4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-static {p0, p4}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->of(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    invoke-static {p4}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->of(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_1
    const-class p0, Ljava/util/Calendar;

    .line 26
    .line 27
    invoke-virtual {p0, p4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_4

    .line 32
    .line 33
    if-eqz p2, :cond_3

    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    new-instance p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCalendar;

    .line 43
    .line 44
    invoke-direct {p0, p2, p3}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCalendar;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 45
    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_3
    :goto_0
    sget-object p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCalendar;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplCalendar;

    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_4
    const-class p0, Ljava/time/ZonedDateTime;

    .line 52
    .line 53
    invoke-virtual {p0, p4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-eqz p0, :cond_7

    .line 58
    .line 59
    if-eqz p2, :cond_6

    .line 60
    .line 61
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-eqz p0, :cond_5

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_5
    new-instance p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplZonedDateTime;

    .line 69
    .line 70
    invoke-direct {p0, p2, p3}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplZonedDateTime;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 71
    .line 72
    .line 73
    return-object p0

    .line 74
    :cond_6
    :goto_1
    sget-object p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplZonedDateTime;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplZonedDateTime;

    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_7
    const-class p0, Ljava/time/OffsetDateTime;

    .line 78
    .line 79
    invoke-virtual {p0, p4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-eqz p0, :cond_a

    .line 84
    .line 85
    if-eqz p2, :cond_9

    .line 86
    .line 87
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    if-eqz p0, :cond_8

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_8
    invoke-static {p2, p3}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplOffsetDateTime;->of(Ljava/lang/String;Ljava/util/Locale;)Lcom/alibaba/fastjson2/writer/ObjectWriterImplOffsetDateTime;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :cond_9
    :goto_2
    sget-object p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplOffsetDateTime;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplOffsetDateTime;

    .line 100
    .line 101
    return-object p0

    .line 102
    :cond_a
    const-class p0, Ljava/time/LocalDateTime;

    .line 103
    .line 104
    invoke-virtual {p0, p4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    if-eqz p1, :cond_e

    .line 109
    .line 110
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getDefaultObjectWriterProvider()Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    if-eqz p0, :cond_b

    .line 119
    .line 120
    sget-object p1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDateTime;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDateTime;

    .line 121
    .line 122
    if-eq p0, p1, :cond_b

    .line 123
    .line 124
    return-object p0

    .line 125
    :cond_b
    if-eqz p2, :cond_d

    .line 126
    .line 127
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    if-eqz p0, :cond_c

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_c
    new-instance p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDateTime;

    .line 135
    .line 136
    invoke-direct {p0, p2, p3}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDateTime;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 137
    .line 138
    .line 139
    return-object p0

    .line 140
    :cond_d
    :goto_3
    sget-object p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDateTime;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDateTime;

    .line 141
    .line 142
    return-object p0

    .line 143
    :cond_e
    const-class p0, Ljava/time/LocalDate;

    .line 144
    .line 145
    invoke-virtual {p0, p4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    if-eqz p1, :cond_10

    .line 150
    .line 151
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getDefaultObjectWriterProvider()Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    if-eqz p0, :cond_f

    .line 160
    .line 161
    sget-object p1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDate;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDate;

    .line 162
    .line 163
    if-eq p0, p1, :cond_f

    .line 164
    .line 165
    return-object p0

    .line 166
    :cond_f
    invoke-static {p2, p3}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDate;->of(Ljava/lang/String;Ljava/util/Locale;)Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDate;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    return-object p0

    .line 171
    :cond_10
    const-class p0, Ljava/time/LocalTime;

    .line 172
    .line 173
    invoke-virtual {p0, p4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    if-eqz p1, :cond_14

    .line 178
    .line 179
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getDefaultObjectWriterProvider()Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    if-eqz p0, :cond_11

    .line 188
    .line 189
    sget-object p1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalTime;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalTime;

    .line 190
    .line 191
    if-eq p0, p1, :cond_11

    .line 192
    .line 193
    return-object p0

    .line 194
    :cond_11
    if-eqz p2, :cond_13

    .line 195
    .line 196
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 197
    .line 198
    .line 199
    move-result p0

    .line 200
    if-eqz p0, :cond_12

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_12
    new-instance p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalTime;

    .line 204
    .line 205
    invoke-direct {p0, p2, p3}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalTime;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 206
    .line 207
    .line 208
    return-object p0

    .line 209
    :cond_13
    :goto_4
    sget-object p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalTime;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalTime;

    .line 210
    .line 211
    return-object p0

    .line 212
    :cond_14
    const-class p0, Ljava/time/Instant;

    .line 213
    .line 214
    if-ne p0, p4, :cond_17

    .line 215
    .line 216
    if-eqz p2, :cond_16

    .line 217
    .line 218
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 219
    .line 220
    .line 221
    move-result p0

    .line 222
    if-eqz p0, :cond_15

    .line 223
    .line 224
    goto :goto_5

    .line 225
    :cond_15
    new-instance p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplInstant;

    .line 226
    .line 227
    invoke-direct {p0, p2, p3}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplInstant;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 228
    .line 229
    .line 230
    return-object p0

    .line 231
    :cond_16
    :goto_5
    sget-object p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplInstant;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplInstant;

    .line 232
    .line 233
    return-object p0

    .line 234
    :cond_17
    const/4 p0, 0x0

    .line 235
    const-class p1, Ljava/math/BigDecimal;

    .line 236
    .line 237
    if-ne p1, p4, :cond_1a

    .line 238
    .line 239
    if-eqz p2, :cond_19

    .line 240
    .line 241
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    if-eqz p1, :cond_18

    .line 246
    .line 247
    goto :goto_6

    .line 248
    :cond_18
    new-instance p1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplBigDecimal;

    .line 249
    .line 250
    new-instance p3, Ljava/text/DecimalFormat;

    .line 251
    .line 252
    invoke-direct {p3, p2}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    invoke-direct {p1, p3, p0}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplBigDecimal;-><init>(Ljava/text/DecimalFormat;Ljava/util/function/Function;)V

    .line 256
    .line 257
    .line 258
    return-object p1

    .line 259
    :cond_19
    :goto_6
    sget-object p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplBigDecimal;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplBigDecimal;

    .line 260
    .line 261
    return-object p0

    .line 262
    :cond_1a
    const-class v0, [Ljava/math/BigDecimal;

    .line 263
    .line 264
    if-ne v0, p4, :cond_1d

    .line 265
    .line 266
    if-eqz p2, :cond_1c

    .line 267
    .line 268
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 269
    .line 270
    .line 271
    move-result p3

    .line 272
    if-eqz p3, :cond_1b

    .line 273
    .line 274
    goto :goto_7

    .line 275
    :cond_1b
    new-instance p0, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;

    .line 276
    .line 277
    new-instance p3, Ljava/text/DecimalFormat;

    .line 278
    .line 279
    invoke-direct {p3, p2}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    invoke-direct {p0, p1, p3}, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;-><init>(Ljava/lang/Class;Ljava/text/DecimalFormat;)V

    .line 283
    .line 284
    .line 285
    return-object p0

    .line 286
    :cond_1c
    :goto_7
    new-instance p2, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;

    .line 287
    .line 288
    invoke-direct {p2, p1, p0}, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;-><init>(Ljava/lang/Class;Ljava/text/DecimalFormat;)V

    .line 289
    .line 290
    .line 291
    return-object p2

    .line 292
    :cond_1d
    const-class p1, Ljava/util/Optional;

    .line 293
    .line 294
    if-ne p1, p4, :cond_1e

    .line 295
    .line 296
    invoke-static {p2, p3}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplOptional;->of(Ljava/lang/String;Ljava/util/Locale;)Lcom/alibaba/fastjson2/writer/ObjectWriterImplOptional;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    return-object p0

    .line 301
    :cond_1e
    invoke-virtual {p4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    const-string p4, "java.sql.Date"

    .line 306
    .line 307
    invoke-virtual {p1, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result p4

    .line 311
    if-nez p4, :cond_21

    .line 312
    .line 313
    const-string p3, "java.sql.Time"

    .line 314
    .line 315
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result p3

    .line 319
    if-nez p3, :cond_20

    .line 320
    .line 321
    const-string p3, "java.sql.Timestamp"

    .line 322
    .line 323
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result p1

    .line 327
    if-nez p1, :cond_1f

    .line 328
    .line 329
    return-object p0

    .line 330
    :cond_1f
    new-instance p0, Lcom/alibaba/fastjson2/util/JdbcSupport$TimestampWriter;

    .line 331
    .line 332
    invoke-direct {p0, p2}, Lcom/alibaba/fastjson2/util/JdbcSupport$TimestampWriter;-><init>(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    return-object p0

    .line 336
    :cond_20
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/JdbcSupport$TimeWriter;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/util/JdbcSupport$TimeWriter;

    .line 337
    .line 338
    .line 339
    move-result-object p0

    .line 340
    return-object p0

    .line 341
    :cond_21
    new-instance p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDate;

    .line 342
    .line 343
    invoke-direct {p0, p2, p3}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDate;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 344
    .line 345
    .line 346
    return-object p0
.end method

.method private writeFieldNameSymbol(Lcom/alibaba/fastjson2/JSONWriter;Lcom/alibaba/fastjson2/SymbolTable;)Z
    .locals 5

    .line 1
    invoke-static {p2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-wide v1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->nameSymbolCache:J

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    cmp-long v3, v1, v3

    .line 10
    .line 11
    const/16 v4, 0x20

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    iget-wide v1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->hashCode:J

    .line 16
    .line 17
    invoke-virtual {p2, v1, v2}, Lcom/alibaba/fastjson2/SymbolTable;->getOrdinalByHashCode(J)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    int-to-long v1, p2

    .line 22
    shl-long/2addr v1, v4

    .line 23
    int-to-long v3, v0

    .line 24
    or-long v0, v1, v3

    .line 25
    .line 26
    iput-wide v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->nameSymbolCache:J

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    long-to-int v3, v1

    .line 30
    if-ne v3, v0, :cond_1

    .line 31
    .line 32
    shr-long v0, v1, v4

    .line 33
    .line 34
    long-to-int p2, v0

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget-wide v1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->hashCode:J

    .line 37
    .line 38
    invoke-virtual {p2, v1, v2}, Lcom/alibaba/fastjson2/SymbolTable;->getOrdinalByHashCode(J)I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    int-to-long v1, p2

    .line 43
    shl-long/2addr v1, v4

    .line 44
    int-to-long v3, v0

    .line 45
    or-long v0, v1, v3

    .line 46
    .line 47
    iput-wide v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->nameSymbolCache:J

    .line 48
    .line 49
    :goto_0
    const/4 v0, -0x1

    .line 50
    if-eq p2, v0, :cond_2

    .line 51
    .line 52
    neg-int p2, p2

    .line 53
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeSymbol(I)V

    .line 54
    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    return p1

    .line 58
    :cond_2
    const/4 p1, 0x0

    .line 59
    return p1
.end method


# virtual methods
.method public compareTo(Ljava/lang/Object;)I
    .locals 14

    .line 1
    check-cast p1, Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 2
    .line 3
    iget v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->ordinal:I

    .line 4
    .line 5
    iget v1, p1, Lcom/alibaba/fastjson2/writer/FieldWriter;->ordinal:I

    .line 6
    .line 7
    const/4 v2, -0x1

    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    const/4 v3, 0x1

    .line 12
    if-le v0, v1, :cond_1

    .line 13
    .line 14
    return v3

    .line 15
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v1, p1, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    goto/16 :goto_6

    .line 26
    .line 27
    :cond_2
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->method:Ljava/lang/reflect/Method;

    .line 28
    .line 29
    if-eqz v1, :cond_4

    .line 30
    .line 31
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->field:Ljava/lang/reflect/Field;

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->method:Ljava/lang/reflect/Method;

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_4
    :goto_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->field:Ljava/lang/reflect/Field;

    .line 50
    .line 51
    :goto_1
    iget-object v4, p1, Lcom/alibaba/fastjson2/writer/FieldWriter;->method:Ljava/lang/reflect/Method;

    .line 52
    .line 53
    if-eqz v4, :cond_6

    .line 54
    .line 55
    iget-object v4, p1, Lcom/alibaba/fastjson2/writer/FieldWriter;->field:Ljava/lang/reflect/Field;

    .line 56
    .line 57
    if-eqz v4, :cond_5

    .line 58
    .line 59
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_5

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_5
    iget-object v4, p1, Lcom/alibaba/fastjson2/writer/FieldWriter;->method:Ljava/lang/reflect/Method;

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_6
    :goto_2
    iget-object v4, p1, Lcom/alibaba/fastjson2/writer/FieldWriter;->field:Ljava/lang/reflect/Field;

    .line 74
    .line 75
    :goto_3
    const/4 v5, 0x0

    .line 76
    if-eqz v1, :cond_e

    .line 77
    .line 78
    if-eqz v4, :cond_e

    .line 79
    .line 80
    invoke-interface {v4}, Ljava/lang/reflect/Member;->getDeclaringClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    invoke-interface {v1}, Ljava/lang/reflect/Member;->getDeclaringClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    if-eq v7, v6, :cond_8

    .line 89
    .line 90
    invoke-virtual {v7, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    if-eqz v8, :cond_7

    .line 95
    .line 96
    return v3

    .line 97
    :cond_7
    invoke-virtual {v6, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    if-eqz v6, :cond_8

    .line 102
    .line 103
    return v2

    .line 104
    :cond_8
    instance-of v6, v1, Ljava/lang/reflect/Field;

    .line 105
    .line 106
    const-class v7, Lcom/alibaba/fastjson2/annotation/JSONField;

    .line 107
    .line 108
    if-eqz v6, :cond_9

    .line 109
    .line 110
    move-object v6, v1

    .line 111
    check-cast v6, Ljava/lang/reflect/Field;

    .line 112
    .line 113
    invoke-virtual {v6, v7}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    check-cast v6, Lcom/alibaba/fastjson2/annotation/JSONField;

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_9
    instance-of v6, v1, Ljava/lang/reflect/Method;

    .line 121
    .line 122
    if-eqz v6, :cond_a

    .line 123
    .line 124
    move-object v6, v1

    .line 125
    check-cast v6, Ljava/lang/reflect/Method;

    .line 126
    .line 127
    invoke-virtual {v6, v7}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    check-cast v6, Lcom/alibaba/fastjson2/annotation/JSONField;

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_a
    move-object v6, v5

    .line 135
    :goto_4
    instance-of v8, v4, Ljava/lang/reflect/Field;

    .line 136
    .line 137
    if-eqz v8, :cond_b

    .line 138
    .line 139
    move-object v8, v4

    .line 140
    check-cast v8, Ljava/lang/reflect/Field;

    .line 141
    .line 142
    invoke-virtual {v8, v7}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    check-cast v7, Lcom/alibaba/fastjson2/annotation/JSONField;

    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_b
    instance-of v8, v1, Ljava/lang/reflect/Method;

    .line 150
    .line 151
    if-eqz v8, :cond_c

    .line 152
    .line 153
    move-object v8, v4

    .line 154
    check-cast v8, Ljava/lang/reflect/Method;

    .line 155
    .line 156
    invoke-virtual {v8, v7}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    check-cast v7, Lcom/alibaba/fastjson2/annotation/JSONField;

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_c
    move-object v7, v5

    .line 164
    :goto_5
    if-eqz v6, :cond_d

    .line 165
    .line 166
    if-nez v7, :cond_d

    .line 167
    .line 168
    return v2

    .line 169
    :cond_d
    if-nez v6, :cond_e

    .line 170
    .line 171
    if-eqz v7, :cond_e

    .line 172
    .line 173
    return v3

    .line 174
    :cond_e
    instance-of v6, v1, Ljava/lang/reflect/Field;

    .line 175
    .line 176
    if-eqz v6, :cond_f

    .line 177
    .line 178
    instance-of v6, v4, Ljava/lang/reflect/Method;

    .line 179
    .line 180
    if-eqz v6, :cond_f

    .line 181
    .line 182
    move-object v6, v1

    .line 183
    check-cast v6, Ljava/lang/reflect/Field;

    .line 184
    .line 185
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    move-object v7, v4

    .line 190
    check-cast v7, Ljava/lang/reflect/Method;

    .line 191
    .line 192
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    move-result-object v7

    .line 196
    if-ne v6, v7, :cond_f

    .line 197
    .line 198
    return v2

    .line 199
    :cond_f
    instance-of v6, v1, Ljava/lang/reflect/Method;

    .line 200
    .line 201
    if-eqz v6, :cond_10

    .line 202
    .line 203
    instance-of v7, v4, Ljava/lang/reflect/Field;

    .line 204
    .line 205
    if-eqz v7, :cond_10

    .line 206
    .line 207
    move-object v7, v1

    .line 208
    check-cast v7, Ljava/lang/reflect/Method;

    .line 209
    .line 210
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    move-result-object v7

    .line 214
    move-object v8, v4

    .line 215
    check-cast v8, Ljava/lang/reflect/Field;

    .line 216
    .line 217
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    move-result-object v8

    .line 221
    if-ne v7, v8, :cond_10

    .line 222
    .line 223
    return v3

    .line 224
    :cond_10
    iget-object v7, p1, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldClass:Ljava/lang/Class;

    .line 225
    .line 226
    iget-object v8, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldClass:Ljava/lang/Class;

    .line 227
    .line 228
    if-eq v8, v7, :cond_12

    .line 229
    .line 230
    if-eqz v8, :cond_12

    .line 231
    .line 232
    if-eqz v7, :cond_12

    .line 233
    .line 234
    invoke-virtual {v8, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 235
    .line 236
    .line 237
    move-result v9

    .line 238
    if-eqz v9, :cond_11

    .line 239
    .line 240
    return v3

    .line 241
    :cond_11
    invoke-virtual {v7, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 242
    .line 243
    .line 244
    move-result v9

    .line 245
    if-eqz v9, :cond_12

    .line 246
    .line 247
    return v2

    .line 248
    :cond_12
    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 249
    .line 250
    if-ne v8, v9, :cond_13

    .line 251
    .line 252
    if-eq v7, v9, :cond_13

    .line 253
    .line 254
    return v3

    .line 255
    :cond_13
    const-class v9, Ljava/lang/Boolean;

    .line 256
    .line 257
    if-ne v8, v9, :cond_15

    .line 258
    .line 259
    if-ne v7, v9, :cond_15

    .line 260
    .line 261
    if-eqz v6, :cond_15

    .line 262
    .line 263
    instance-of v9, v4, Ljava/lang/reflect/Method;

    .line 264
    .line 265
    if-eqz v9, :cond_15

    .line 266
    .line 267
    move-object v9, v1

    .line 268
    check-cast v9, Ljava/lang/reflect/Method;

    .line 269
    .line 270
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v9

    .line 274
    move-object v10, v4

    .line 275
    check-cast v10, Ljava/lang/reflect/Method;

    .line 276
    .line 277
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v10

    .line 281
    const-string v11, "is"

    .line 282
    .line 283
    invoke-virtual {v9, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 284
    .line 285
    .line 286
    move-result v12

    .line 287
    const-string v13, "get"

    .line 288
    .line 289
    if-eqz v12, :cond_14

    .line 290
    .line 291
    invoke-virtual {v10, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 292
    .line 293
    .line 294
    move-result v12

    .line 295
    if-eqz v12, :cond_14

    .line 296
    .line 297
    return v3

    .line 298
    :cond_14
    invoke-virtual {v9, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 299
    .line 300
    .line 301
    move-result v9

    .line 302
    if-eqz v9, :cond_15

    .line 303
    .line 304
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 305
    .line 306
    .line 307
    move-result v9

    .line 308
    if-eqz v9, :cond_15

    .line 309
    .line 310
    return v2

    .line 311
    :cond_15
    if-eqz v6, :cond_17

    .line 312
    .line 313
    instance-of v6, v4, Ljava/lang/reflect/Method;

    .line 314
    .line 315
    if-eqz v6, :cond_17

    .line 316
    .line 317
    check-cast v1, Ljava/lang/reflect/Method;

    .line 318
    .line 319
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    check-cast v4, Ljava/lang/reflect/Method;

    .line 324
    .line 325
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v4

    .line 329
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v6

    .line 333
    if-nez v6, :cond_17

    .line 334
    .line 335
    invoke-static {v1, v5}, Lcom/alibaba/fastjson2/util/BeanUtils;->getterName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    invoke-static {v4, v5}, Lcom/alibaba/fastjson2/util/BeanUtils;->getterName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v4

    .line 343
    iget-object v5, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 344
    .line 345
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v5

    .line 349
    if-eqz v5, :cond_16

    .line 350
    .line 351
    iget-object v5, p1, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 352
    .line 353
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    move-result v5

    .line 357
    if-nez v5, :cond_16

    .line 358
    .line 359
    return v3

    .line 360
    :cond_16
    iget-object v5, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 361
    .line 362
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result v4

    .line 366
    if-eqz v4, :cond_17

    .line 367
    .line 368
    iget-object v4, p1, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 369
    .line 370
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    move-result v1

    .line 374
    if-nez v1, :cond_17

    .line 375
    .line 376
    return v2

    .line 377
    :cond_17
    invoke-virtual {v8}, Ljava/lang/Class;->isPrimitive()Z

    .line 378
    .line 379
    .line 380
    move-result v1

    .line 381
    if-eqz v1, :cond_18

    .line 382
    .line 383
    invoke-virtual {v7}, Ljava/lang/Class;->isPrimitive()Z

    .line 384
    .line 385
    .line 386
    move-result v1

    .line 387
    if-nez v1, :cond_18

    .line 388
    .line 389
    return v2

    .line 390
    :cond_18
    invoke-virtual {v8}, Ljava/lang/Class;->isPrimitive()Z

    .line 391
    .line 392
    .line 393
    move-result v1

    .line 394
    if-nez v1, :cond_19

    .line 395
    .line 396
    invoke-virtual {v7}, Ljava/lang/Class;->isPrimitive()Z

    .line 397
    .line 398
    .line 399
    move-result v1

    .line 400
    if-eqz v1, :cond_19

    .line 401
    .line 402
    return v3

    .line 403
    :cond_19
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    const-string v4, "java."

    .line 408
    .line 409
    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 410
    .line 411
    .line 412
    move-result v1

    .line 413
    if-eqz v1, :cond_1a

    .line 414
    .line 415
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 420
    .line 421
    .line 422
    move-result v1

    .line 423
    if-nez v1, :cond_1a

    .line 424
    .line 425
    return v2

    .line 426
    :cond_1a
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 431
    .line 432
    .line 433
    move-result v1

    .line 434
    if-nez v1, :cond_1b

    .line 435
    .line 436
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 441
    .line 442
    .line 443
    move-result v1

    .line 444
    if-eqz v1, :cond_1b

    .line 445
    .line 446
    return v3

    .line 447
    :cond_1b
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->method:Ljava/lang/reflect/Method;

    .line 448
    .line 449
    if-eqz v1, :cond_1c

    .line 450
    .line 451
    iget-object v4, p1, Lcom/alibaba/fastjson2/writer/FieldWriter;->method:Ljava/lang/reflect/Method;

    .line 452
    .line 453
    if-nez v4, :cond_1c

    .line 454
    .line 455
    return v2

    .line 456
    :cond_1c
    if-nez v1, :cond_1d

    .line 457
    .line 458
    iget-object p1, p1, Lcom/alibaba/fastjson2/writer/FieldWriter;->method:Ljava/lang/reflect/Method;

    .line 459
    .line 460
    if-eqz p1, :cond_1d

    .line 461
    .line 462
    return v3

    .line 463
    :cond_1d
    :goto_6
    return v0
.end method

.method public getFieldValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    const-string v0, "field.get error, "

    .line 2
    .line 3
    if-eqz p1, :cond_2

    .line 4
    .line 5
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->field:Ljava/lang/reflect/Field;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    :try_start_0
    iget-wide v2, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldOffset:J

    .line 10
    .line 11
    const-wide/16 v4, -0x1

    .line 12
    .line 13
    cmp-long v4, v2, v4

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    iget-boolean v4, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->primitive:Z

    .line 18
    .line 19
    if-nez v4, :cond_0

    .line 20
    .line 21
    sget-object v1, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 22
    .line 23
    invoke-virtual {v1, p1, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :catch_0
    move-exception p1

    .line 29
    goto :goto_0

    .line 30
    :catch_1
    move-exception p1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    return-object p1

    .line 37
    :goto_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v0, v1, p1}, Lah/a;->o(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    :goto_1
    const/4 p1, 0x0

    .line 43
    return-object p1

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    iget-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {p1, v0}, Lah/a;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1
.end method

.method public getInitWriter()Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public getItemClass()Ljava/lang/Class;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public getItemType()Ljava/lang/reflect/Type;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public getItemWriter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p2, v0}, Lcom/alibaba/fastjson2/JSONWriter;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public getObjectWriter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 1

    .line 347
    const-class v0, [Ljava/lang/Float;

    if-ne p2, v0, :cond_1

    .line 348
    iget-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->decimalFormat:Ljava/text/DecimalFormat;

    if-eqz p1, :cond_0

    .line 349
    new-instance p1, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;

    const-class p2, Ljava/lang/Float;

    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->decimalFormat:Ljava/text/DecimalFormat;

    invoke-direct {p1, p2, v0}, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;-><init>(Ljava/lang/Class;Ljava/text/DecimalFormat;)V

    return-object p1

    .line 350
    :cond_0
    sget-object p1, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;->FLOAT_ARRAY:Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;

    return-object p1

    .line 351
    :cond_1
    const-class v0, [Ljava/lang/Double;

    if-ne p2, v0, :cond_3

    .line 352
    iget-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->decimalFormat:Ljava/text/DecimalFormat;

    if-eqz p1, :cond_2

    .line 353
    new-instance p1, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;

    const-class p2, Ljava/lang/Double;

    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->decimalFormat:Ljava/text/DecimalFormat;

    invoke-direct {p1, p2, v0}, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;-><init>(Ljava/lang/Class;Ljava/text/DecimalFormat;)V

    return-object p1

    .line 354
    :cond_2
    sget-object p1, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;->DOUBLE_ARRAY:Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;

    return-object p1

    .line 355
    :cond_3
    const-class v0, [Ljava/math/BigDecimal;

    if-ne p2, v0, :cond_5

    .line 356
    iget-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->decimalFormat:Ljava/text/DecimalFormat;

    if-eqz p1, :cond_4

    .line 357
    new-instance p1, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;

    const-class p2, Ljava/math/BigDecimal;

    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->decimalFormat:Ljava/text/DecimalFormat;

    invoke-direct {p1, p2, v0}, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;-><init>(Ljava/lang/Class;Ljava/text/DecimalFormat;)V

    return-object p1

    .line 358
    :cond_4
    sget-object p1, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;->DECIMAL_ARRAY:Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;

    return-object p1

    .line 359
    :cond_5
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object p1

    return-object p1
.end method

.method public final getPath(Lcom/alibaba/fastjson2/JSONWriter$Path;)Lcom/alibaba/fastjson2/JSONWriter$Path;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->path:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {v0, p1, v1}, Lcom/alibaba/fastjson2/JSONWriter$Path;-><init>(Lcom/alibaba/fastjson2/JSONWriter$Path;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->path:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONWriter$Path;->parent:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 16
    .line 17
    if-ne v1, p1, :cond_1

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_1
    new-instance v0, Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 23
    .line 24
    invoke-direct {v0, p1, v1}, Lcom/alibaba/fastjson2/JSONWriter$Path;-><init>(Lcom/alibaba/fastjson2/JSONWriter$Path;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public final getRootParentPath()Lcom/alibaba/fastjson2/JSONWriter$Path;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->rootParentPath:Lcom/alibaba/fastjson2/JSONWriter$Path;

    .line 2
    .line 3
    return-object v0
.end method

.method public isDateFormatISO8601()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public isDateFormatMillis()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public isFieldClassSerializable()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldClassSerializable:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public unwrapped()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public abstract write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/JSONWriter;",
            "TT;)Z"
        }
    .end annotation
.end method

.method public writeBinary(Lcom/alibaba/fastjson2/JSONWriter;[B)V
    .locals 6

    .line 1
    if-nez p2, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->isWriteNulls()Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeArrayNull()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 18
    .line 19
    .line 20
    iget-wide v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 21
    .line 22
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 23
    .line 24
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 25
    .line 26
    and-long/2addr v0, v2

    .line 27
    const-wide/16 v2, 0x0

    .line 28
    .line 29
    cmp-long v0, v0, v2

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeString([B)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_2
    const-string v0, "base64"

    .line 38
    .line 39
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->format:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_8

    .line 46
    .line 47
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->format:Ljava/lang/String;

    .line 48
    .line 49
    if-nez v0, :cond_3

    .line 50
    .line 51
    iget-wide v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 52
    .line 53
    invoke-virtual {p1, v0, v1}, Lcom/alibaba/fastjson2/JSONWriter;->getFeatures(J)J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteByteArrayAsBase64:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 58
    .line 59
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 60
    .line 61
    and-long/2addr v0, v4

    .line 62
    cmp-long v0, v0, v2

    .line 63
    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    goto :goto_5

    .line 67
    :cond_3
    const-string v0, "hex"

    .line 68
    .line 69
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->format:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeHex([B)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_4
    const-string v0, "gzip,base64"

    .line 82
    .line 83
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->format:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_6

    .line 90
    .line 91
    const-string v0, "gzip"

    .line 92
    .line 93
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->format:Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_5

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_5
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeBinary([B)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :cond_6
    :goto_0
    const/4 v0, 0x0

    .line 107
    :try_start_0
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 108
    .line 109
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 110
    .line 111
    .line 112
    array-length v2, p2

    .line 113
    const/16 v3, 0x200

    .line 114
    .line 115
    if-ge v2, v3, :cond_7

    .line 116
    .line 117
    new-instance v2, Ljava/util/zip/GZIPOutputStream;

    .line 118
    .line 119
    array-length v3, p2

    .line 120
    invoke-direct {v2, v1, v3}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;I)V

    .line 121
    .line 122
    .line 123
    :goto_1
    move-object v0, v2

    .line 124
    goto :goto_2

    .line 125
    :catchall_0
    move-exception p1

    .line 126
    goto :goto_4

    .line 127
    :catch_0
    move-exception p1

    .line 128
    goto :goto_3

    .line 129
    :cond_7
    new-instance v2, Ljava/util/zip/GZIPOutputStream;

    .line 130
    .line 131
    invoke-direct {v2, v1}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :goto_2
    invoke-virtual {v0, p2}, Ljava/io/OutputStream;->write([B)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, Ljava/util/zip/GZIPOutputStream;->finish()V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 142
    .line 143
    .line 144
    move-result-object p2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/IOUtils;->close(Ljava/io/Closeable;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeBase64([B)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :goto_3
    :try_start_1
    new-instance p2, Lcom/alibaba/fastjson2/JSONException;

    .line 153
    .line 154
    const-string v1, "write gzipBytes error"

    .line 155
    .line 156
    invoke-direct {p2, v1, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 157
    .line 158
    .line 159
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 160
    :goto_4
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/IOUtils;->close(Ljava/io/Closeable;)V

    .line 161
    .line 162
    .line 163
    throw p1

    .line 164
    :cond_8
    :goto_5
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeBase64([B)V

    .line 165
    .line 166
    .line 167
    return-void
.end method

.method public writeBool(Lcom/alibaba/fastjson2/JSONWriter;Z)V
    .locals 0

    .line 17
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public writeBool(Lcom/alibaba/fastjson2/JSONWriter;[Z)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->isWriteNulls()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeBool([Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public writeDate(Lcom/alibaba/fastjson2/JSONWriter;J)V
    .locals 1

    const/4 v0, 0x1

    .line 327
    invoke-virtual {p0, p1, v0, p2, p3}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeDate(Lcom/alibaba/fastjson2/JSONWriter;ZJ)V

    return-void
.end method

.method public writeDate(Lcom/alibaba/fastjson2/JSONWriter;ZJ)V
    .locals 26

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-wide/from16 v1, p3

    .line 4
    .line 5
    iget-boolean v3, v0, Lcom/alibaba/fastjson2/JSONWriter;->jsonb:Z

    .line 6
    .line 7
    if-eqz v3, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeMillis(J)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 14
    .line 15
    invoke-virtual/range {p0 .. p0}, Lcom/alibaba/fastjson2/writer/FieldWriter;->isDateFormatMillis()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-nez v4, :cond_9

    .line 20
    .line 21
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isDateFormatMillis()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    goto/16 :goto_2

    .line 28
    .line 29
    :cond_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getZoneId()Ljava/time/ZoneId;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getDateFormat()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    if-nez v5, :cond_5

    .line 38
    .line 39
    invoke-static {v1, v2}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Ljava/time/Instant;->getEpochSecond()J

    .line 44
    .line 45
    .line 46
    move-result-wide v2

    .line 47
    invoke-virtual {v4}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {v4, v1}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/Instant;)Ljava/time/ZoneOffset;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    int-to-long v4, v1

    .line 60
    add-long/2addr v2, v4

    .line 61
    const-wide/32 v4, 0x15180

    .line 62
    .line 63
    .line 64
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->floorDiv(JJ)J

    .line 65
    .line 66
    .line 67
    move-result-wide v6

    .line 68
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->floorMod(JJ)J

    .line 69
    .line 70
    .line 71
    move-result-wide v1

    .line 72
    long-to-int v1, v1

    .line 73
    const-wide/32 v2, 0xafa6c

    .line 74
    .line 75
    .line 76
    add-long/2addr v2, v6

    .line 77
    const-wide/16 v4, 0x0

    .line 78
    .line 79
    cmp-long v8, v2, v4

    .line 80
    .line 81
    const-wide/16 v9, 0x1

    .line 82
    .line 83
    const-wide/32 v11, 0x23ab1

    .line 84
    .line 85
    .line 86
    const-wide/16 v13, 0x190

    .line 87
    .line 88
    if-gez v8, :cond_2

    .line 89
    .line 90
    const-wide/32 v15, 0xafa6d

    .line 91
    .line 92
    .line 93
    add-long/2addr v6, v15

    .line 94
    div-long/2addr v6, v11

    .line 95
    sub-long/2addr v6, v9

    .line 96
    mul-long v15, v6, v13

    .line 97
    .line 98
    neg-long v6, v6

    .line 99
    mul-long/2addr v6, v11

    .line 100
    add-long/2addr v2, v6

    .line 101
    goto :goto_0

    .line 102
    :cond_2
    move-wide v15, v4

    .line 103
    :goto_0
    mul-long v6, v2, v13

    .line 104
    .line 105
    const-wide/16 v17, 0x24f

    .line 106
    .line 107
    add-long v6, v6, v17

    .line 108
    .line 109
    div-long/2addr v6, v11

    .line 110
    const-wide/16 v11, 0x16d

    .line 111
    .line 112
    mul-long v17, v6, v11

    .line 113
    .line 114
    const-wide/16 v19, 0x4

    .line 115
    .line 116
    div-long v21, v6, v19

    .line 117
    .line 118
    add-long v21, v21, v17

    .line 119
    .line 120
    const-wide/16 v17, 0x64

    .line 121
    .line 122
    div-long v23, v6, v17

    .line 123
    .line 124
    sub-long v21, v21, v23

    .line 125
    .line 126
    div-long v23, v6, v13

    .line 127
    .line 128
    add-long v23, v23, v21

    .line 129
    .line 130
    sub-long v21, v2, v23

    .line 131
    .line 132
    cmp-long v4, v21, v4

    .line 133
    .line 134
    if-gez v4, :cond_3

    .line 135
    .line 136
    sub-long/2addr v6, v9

    .line 137
    mul-long/2addr v11, v6

    .line 138
    div-long v4, v6, v19

    .line 139
    .line 140
    add-long/2addr v4, v11

    .line 141
    div-long v8, v6, v17

    .line 142
    .line 143
    sub-long/2addr v4, v8

    .line 144
    div-long v8, v6, v13

    .line 145
    .line 146
    add-long/2addr v8, v4

    .line 147
    sub-long v21, v2, v8

    .line 148
    .line 149
    :cond_3
    move-wide/from16 v2, v21

    .line 150
    .line 151
    add-long/2addr v6, v15

    .line 152
    long-to-int v2, v2

    .line 153
    mul-int/lit8 v3, v2, 0x5

    .line 154
    .line 155
    add-int/lit8 v3, v3, 0x2

    .line 156
    .line 157
    div-int/lit16 v3, v3, 0x99

    .line 158
    .line 159
    add-int/lit8 v4, v3, 0x2

    .line 160
    .line 161
    rem-int/lit8 v4, v4, 0xc

    .line 162
    .line 163
    add-int/lit8 v4, v4, 0x1

    .line 164
    .line 165
    mul-int/lit16 v5, v3, 0x132

    .line 166
    .line 167
    add-int/lit8 v5, v5, 0x5

    .line 168
    .line 169
    div-int/lit8 v5, v5, 0xa

    .line 170
    .line 171
    sub-int/2addr v2, v5

    .line 172
    add-int/lit8 v2, v2, 0x1

    .line 173
    .line 174
    div-int/lit8 v3, v3, 0xa

    .line 175
    .line 176
    int-to-long v8, v3

    .line 177
    add-long/2addr v6, v8

    .line 178
    sget-object v3, Ljava/time/temporal/ChronoField;->YEAR:Ljava/time/temporal/ChronoField;

    .line 179
    .line 180
    invoke-virtual {v3, v6, v7}, Ljava/time/temporal/ChronoField;->checkValidIntValue(J)I

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    int-to-long v5, v1

    .line 185
    sget-object v1, Ljava/time/temporal/ChronoField;->SECOND_OF_DAY:Ljava/time/temporal/ChronoField;

    .line 186
    .line 187
    invoke-virtual {v1, v5, v6}, Ljava/time/temporal/ChronoField;->checkValidValue(J)J

    .line 188
    .line 189
    .line 190
    const-wide/16 v7, 0xe10

    .line 191
    .line 192
    div-long v7, v5, v7

    .line 193
    .line 194
    long-to-int v1, v7

    .line 195
    mul-int/lit16 v7, v1, 0xe10

    .line 196
    .line 197
    int-to-long v7, v7

    .line 198
    sub-long/2addr v5, v7

    .line 199
    const-wide/16 v7, 0x3c

    .line 200
    .line 201
    div-long v7, v5, v7

    .line 202
    .line 203
    long-to-int v7, v7

    .line 204
    mul-int/lit8 v8, v7, 0x3c

    .line 205
    .line 206
    int-to-long v8, v8

    .line 207
    sub-long/2addr v5, v8

    .line 208
    long-to-int v6, v5

    .line 209
    if-eqz p2, :cond_4

    .line 210
    .line 211
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 212
    .line 213
    .line 214
    :cond_4
    move v5, v4

    .line 215
    move v4, v1

    .line 216
    move v1, v3

    .line 217
    move v3, v2

    .line 218
    move v2, v5

    .line 219
    move v5, v7

    .line 220
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateTime19(IIIIII)V

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :cond_5
    invoke-static {v1, v2}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-static {v1, v4}, Ljava/time/ZonedDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    invoke-virtual/range {p0 .. p0}, Lcom/alibaba/fastjson2/writer/FieldWriter;->isDateFormatISO8601()Z

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    if-nez v2, :cond_6

    .line 237
    .line 238
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isDateFormatISO8601()Z

    .line 239
    .line 240
    .line 241
    move-result v2

    .line 242
    if-eqz v2, :cond_7

    .line 243
    .line 244
    :cond_6
    move-object v2, v1

    .line 245
    goto :goto_1

    .line 246
    :cond_7
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getDateFormatter()Ljava/time/format/DateTimeFormatter;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    invoke-virtual {v2, v1}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    if-eqz p2, :cond_8

    .line 255
    .line 256
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 257
    .line 258
    .line 259
    :cond_8
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    return-void

    .line 263
    :goto_1
    invoke-virtual {v2}, Ljava/time/ZonedDateTime;->getYear()I

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    move-object v3, v2

    .line 268
    invoke-virtual {v3}, Ljava/time/ZonedDateTime;->getMonthValue()I

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    move-object v4, v3

    .line 273
    invoke-virtual {v4}, Ljava/time/ZonedDateTime;->getDayOfMonth()I

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    move-object v5, v4

    .line 278
    invoke-virtual {v5}, Ljava/time/ZonedDateTime;->getHour()I

    .line 279
    .line 280
    .line 281
    move-result v4

    .line 282
    move-object v6, v5

    .line 283
    invoke-virtual {v6}, Ljava/time/ZonedDateTime;->getMinute()I

    .line 284
    .line 285
    .line 286
    move-result v5

    .line 287
    move-object v7, v6

    .line 288
    invoke-virtual {v7}, Ljava/time/ZonedDateTime;->getSecond()I

    .line 289
    .line 290
    .line 291
    move-result v6

    .line 292
    invoke-virtual {v7}, Ljava/time/ZonedDateTime;->getNano()I

    .line 293
    .line 294
    .line 295
    move-result v8

    .line 296
    const v9, 0xf4240

    .line 297
    .line 298
    .line 299
    div-int/2addr v8, v9

    .line 300
    invoke-virtual {v7}, Ljava/time/ZonedDateTime;->getOffset()Ljava/time/ZoneOffset;

    .line 301
    .line 302
    .line 303
    move-result-object v7

    .line 304
    invoke-virtual {v7}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 305
    .line 306
    .line 307
    move-result v7

    .line 308
    const/4 v9, 0x1

    .line 309
    move/from16 v25, v8

    .line 310
    .line 311
    move v8, v7

    .line 312
    move/from16 v7, v25

    .line 313
    .line 314
    invoke-virtual/range {v0 .. v9}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateTimeISO8601(IIIIIIIIZ)V

    .line 315
    .line 316
    .line 317
    return-void

    .line 318
    :cond_9
    :goto_2
    if-eqz p2, :cond_a

    .line 319
    .line 320
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 321
    .line 322
    .line 323
    :cond_a
    invoke-virtual {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(J)V

    .line 324
    .line 325
    .line 326
    return-void
.end method

.method public writeDate(Lcom/alibaba/fastjson2/JSONWriter;ZLjava/util/Date;)V
    .locals 2

    if-nez p3, :cond_1

    if-eqz p2, :cond_0

    .line 328
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 329
    :cond_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    return-void

    .line 330
    :cond_1
    invoke-virtual {p3}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeDate(Lcom/alibaba/fastjson2/JSONWriter;ZJ)V

    return-void
.end method

.method public writeDouble(Lcom/alibaba/fastjson2/JSONWriter;D)V
    .locals 1

    .line 50
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 51
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->decimalFormat:Ljava/text/DecimalFormat;

    if-eqz v0, :cond_0

    .line 52
    invoke-virtual {p1, p2, p3, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeDouble(DLjava/text/DecimalFormat;)V

    return-void

    .line 53
    :cond_0
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/JSONWriter;->writeDouble(D)V

    return-void
.end method

.method public writeDouble(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Double;)V
    .locals 6

    .line 1
    if-nez p2, :cond_1

    .line 2
    .line 3
    iget-wide v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, Lcom/alibaba/fastjson2/JSONWriter;->getFeatures(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNulls:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 10
    .line 11
    iget-wide v2, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 12
    .line 13
    and-long/2addr v2, v0

    .line 14
    const-wide/16 v4, 0x0

    .line 15
    .line 16
    cmp-long p2, v2, v4

    .line 17
    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 21
    .line 22
    iget-wide v2, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 23
    .line 24
    and-long/2addr v0, v2

    .line 25
    cmp-long p2, v0, v4

    .line 26
    .line 27
    if-nez p2, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNumberNull()V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void

    .line 36
    :cond_1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    invoke-virtual {p1, v0, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeDouble(D)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public writeDouble(Lcom/alibaba/fastjson2/JSONWriter;[D)V
    .locals 1

    if-nez p2, :cond_0

    .line 47
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->isWriteNulls()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 48
    :cond_0
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 49
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeDouble([D)V

    return-void
.end method

.method public writeEnum(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Enum;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeEnum(Ljava/lang/Enum;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public writeEnumJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Enum;)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
.end method

.method public final writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V
    .locals 4

    .line 1
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/JSONWriter;->jsonb:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p1, Lcom/alibaba/fastjson2/JSONWriter;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, p1, v0}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldNameSymbol(Lcom/alibaba/fastjson2/JSONWriter;Lcom/alibaba/fastjson2/SymbolTable;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->nameJSONB:[B

    .line 17
    .line 18
    iget-wide v1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->hashCode:J

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeNameRaw([BJ)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/JSONWriter;->useSingleQuote:Z

    .line 25
    .line 26
    if-nez v0, :cond_3

    .line 27
    .line 28
    iget-object v0, p1, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getFeatures()J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->UnquoteFieldName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 35
    .line 36
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 37
    .line 38
    and-long/2addr v0, v2

    .line 39
    const-wide/16 v2, 0x0

    .line 40
    .line 41
    cmp-long v0, v0, v2

    .line 42
    .line 43
    if-nez v0, :cond_3

    .line 44
    .line 45
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/JSONWriter;->utf8:Z

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->nameWithColonUTF8:[B

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeNameRaw([B)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/JSONWriter;->utf16:Z

    .line 56
    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->nameWithColonUTF16:[C

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeNameRaw([C)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_3
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeName(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeColon()V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public writeFloat(Lcom/alibaba/fastjson2/JSONWriter;F)V
    .locals 1

    .line 17
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 18
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->decimalFormat:Ljava/text/DecimalFormat;

    if-eqz v0, :cond_0

    .line 19
    invoke-virtual {p1, p2, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeFloat(FLjava/text/DecimalFormat;)V

    return-void

    .line 20
    :cond_0
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeFloat(F)V

    return-void
.end method

.method public writeFloat(Lcom/alibaba/fastjson2/JSONWriter;[F)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->isWriteNulls()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeFloat([F)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final writeFloatNull(Lcom/alibaba/fastjson2/JSONWriter;)Z
    .locals 10

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 2
    .line 3
    invoke-virtual {p1, v0, v1}, Lcom/alibaba/fastjson2/JSONWriter;->getFeatures(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNulls:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 8
    .line 9
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 10
    .line 11
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NullAsDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 12
    .line 13
    iget-wide v5, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 14
    .line 15
    or-long/2addr v2, v5

    .line 16
    sget-object v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNullNumberAsZero:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 17
    .line 18
    iget-wide v6, v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 19
    .line 20
    or-long/2addr v2, v6

    .line 21
    and-long/2addr v2, v0

    .line 22
    const-wide/16 v6, 0x0

    .line 23
    .line 24
    cmp-long v2, v2, v6

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    return v3

    .line 30
    :cond_0
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 31
    .line 32
    .line 33
    iget-wide v8, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 34
    .line 35
    and-long/2addr v8, v0

    .line 36
    cmp-long v2, v8, v6

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeFloat(F)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iget-wide v4, v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 46
    .line 47
    and-long/2addr v0, v4

    .line 48
    cmp-long v0, v0, v6

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    invoke-virtual {p1, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt32(I)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 57
    .line 58
    .line 59
    :goto_0
    const/4 p1, 0x1

    .line 60
    return p1
.end method

.method public writeInt16(Lcom/alibaba/fastjson2/JSONWriter;[S)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->isWriteNulls()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt16([S)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public writeInt32(Lcom/alibaba/fastjson2/JSONWriter;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt32(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public writeInt64(Lcom/alibaba/fastjson2/JSONWriter;J)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 5
    .line 6
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 7
    .line 8
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

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
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(J)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final writeIntNull(Lcom/alibaba/fastjson2/JSONWriter;)Z
    .locals 10

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->getFeatures()J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    or-long/2addr v0, v2

    .line 8
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNulls:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 9
    .line 10
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 11
    .line 12
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NullAsDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 13
    .line 14
    iget-wide v5, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 15
    .line 16
    or-long/2addr v2, v5

    .line 17
    sget-object v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNullNumberAsZero:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 18
    .line 19
    iget-wide v6, v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 20
    .line 21
    or-long/2addr v2, v6

    .line 22
    and-long/2addr v2, v0

    .line 23
    const-wide/16 v6, 0x0

    .line 24
    .line 25
    cmp-long v2, v2, v6

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    if-nez v2, :cond_0

    .line 29
    .line 30
    return v3

    .line 31
    :cond_0
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 32
    .line 33
    .line 34
    iget-wide v8, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 35
    .line 36
    iget-wide v4, v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 37
    .line 38
    or-long/2addr v4, v8

    .line 39
    and-long/2addr v0, v4

    .line 40
    cmp-long v0, v0, v6

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-virtual {p1, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt32(I)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 49
    .line 50
    .line 51
    :goto_0
    const/4 p1, 0x1

    .line 52
    return p1
.end method

.method public writeList(Lcom/alibaba/fastjson2/JSONWriter;ZLjava/util/List;)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
.end method

.method public writeListJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/util/List;)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
.end method

.method public writeListStr(Lcom/alibaba/fastjson2/JSONWriter;ZLjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/JSONWriter;",
            "Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
.end method

.method public writeListValue(Lcom/alibaba/fastjson2/JSONWriter;Ljava/util/List;)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
.end method

.method public writeListValueJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/util/List;)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
.end method

.method public writeString(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 2
    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    iget-wide v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 7
    .line 8
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NullAsDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 9
    .line 10
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 11
    .line 12
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNullStringAsEmpty:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 13
    .line 14
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 15
    .line 16
    or-long/2addr v2, v4

    .line 17
    and-long/2addr v0, v2

    .line 18
    const-wide/16 v2, 0x0

    .line 19
    .line 20
    cmp-long v0, v0, v2

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    const-string p2, ""

    .line 25
    .line 26
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->trim:Z

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    if-eqz p2, :cond_1

    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    :cond_1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->symbol:Z

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/JSONWriter;->jsonb:Z

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeSymbol(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->raw:Z

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeRaw(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_3
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public writeString(Lcom/alibaba/fastjson2/JSONWriter;[C)V
    .locals 2

    if-nez p2, :cond_0

    .line 64
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->isWriteNulls()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 65
    :cond_0
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    if-nez p2, :cond_1

    .line 66
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeStringNull()V

    return-void

    :cond_1
    const/4 v0, 0x0

    .line 67
    array-length v1, p2

    invoke-virtual {p1, p2, v0, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeString([CII)V

    return-void
.end method

.method public abstract writeValue(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/JSONWriter;",
            "TT;)V"
        }
    .end annotation
.end method
