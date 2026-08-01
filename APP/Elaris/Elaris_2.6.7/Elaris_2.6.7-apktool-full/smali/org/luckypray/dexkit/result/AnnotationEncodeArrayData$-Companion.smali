.class public final Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "-Companion"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion$WhenMappings;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lr2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;)Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance p0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;->getValuesLength()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    :goto_0
    if-ge v1, v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p2, v1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;->values(I)Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    sget-object v3, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->Companion:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType$Companion;

    .line 27
    .line 28
    invoke-virtual {v2}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->getValueType-w2LRezQ()B

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-virtual {v3, v4}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType$Companion;->from-7apg3OU(B)Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    sget-object v4, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    aget v4, v4, v5

    .line 43
    .line 44
    packed-switch v4, :pswitch_data_0

    .line 45
    .line 46
    .line 47
    new-instance p0, Lha;

    .line 48
    .line 49
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 50
    .line 51
    .line 52
    throw p0

    .line 53
    :pswitch_0
    new-instance v4, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;

    .line 54
    .line 55
    invoke-direct {v4}, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v4}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lod;)Lod;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    check-cast v2, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;

    .line 66
    .line 67
    invoke-virtual {v2}, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;->getValue()Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    goto/16 :goto_3

    .line 76
    .line 77
    :pswitch_1
    new-instance v4, Lorg/luckypray/dexkit/schema/-EncodeValueNull;

    .line 78
    .line 79
    invoke-direct {v4}, Lorg/luckypray/dexkit/schema/-EncodeValueNull;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v4}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lod;)Lod;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    check-cast v2, Lorg/luckypray/dexkit/schema/-EncodeValueNull;

    .line 90
    .line 91
    goto/16 :goto_3

    .line 92
    .line 93
    :pswitch_2
    sget-object v4, Lorg/luckypray/dexkit/result/AnnotationData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationData$-Companion;

    .line 94
    .line 95
    new-instance v5, Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    .line 96
    .line 97
    invoke-direct {v5}, Lorg/luckypray/dexkit/schema/-AnnotationMeta;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v5}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lod;)Lod;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    check-cast v2, Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    .line 108
    .line 109
    invoke-virtual {v4, p1, v2}, Lorg/luckypray/dexkit/result/AnnotationData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationMeta;)Lorg/luckypray/dexkit/result/AnnotationData;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    goto/16 :goto_3

    .line 114
    .line 115
    :pswitch_3
    sget-object v4, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;

    .line 116
    .line 117
    new-instance v5, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;

    .line 118
    .line 119
    invoke-direct {v5}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;-><init>()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, v5}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lod;)Lod;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    check-cast v2, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;

    .line 130
    .line 131
    invoke-virtual {v4, p1, v2}, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;)Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    goto/16 :goto_3

    .line 136
    .line 137
    :pswitch_4
    sget-object v4, Lorg/luckypray/dexkit/result/FieldData;->-Companion:Lorg/luckypray/dexkit/result/FieldData$-Companion;

    .line 138
    .line 139
    new-instance v5, Lorg/luckypray/dexkit/schema/-FieldMeta;

    .line 140
    .line 141
    invoke-direct {v5}, Lorg/luckypray/dexkit/schema/-FieldMeta;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v5}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lod;)Lod;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    check-cast v2, Lorg/luckypray/dexkit/schema/-FieldMeta;

    .line 152
    .line 153
    invoke-virtual {v4, p1, v2}, Lorg/luckypray/dexkit/result/FieldData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-FieldMeta;)Lorg/luckypray/dexkit/result/FieldData;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    goto/16 :goto_3

    .line 158
    .line 159
    :pswitch_5
    sget-object v4, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    .line 160
    .line 161
    new-instance v5, Lorg/luckypray/dexkit/schema/-MethodMeta;

    .line 162
    .line 163
    invoke-direct {v5}, Lorg/luckypray/dexkit/schema/-MethodMeta;-><init>()V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2, v5}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lod;)Lod;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    check-cast v2, Lorg/luckypray/dexkit/schema/-MethodMeta;

    .line 174
    .line 175
    invoke-virtual {v4, p1, v2}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    goto/16 :goto_3

    .line 180
    .line 181
    :pswitch_6
    sget-object v4, Lorg/luckypray/dexkit/result/ClassData;->-Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;

    .line 182
    .line 183
    new-instance v5, Lorg/luckypray/dexkit/schema/-ClassMeta;

    .line 184
    .line 185
    invoke-direct {v5}, Lorg/luckypray/dexkit/schema/-ClassMeta;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2, v5}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lod;)Lod;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    check-cast v2, Lorg/luckypray/dexkit/schema/-ClassMeta;

    .line 196
    .line 197
    invoke-virtual {v4, p1, v2}, Lorg/luckypray/dexkit/result/ClassData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/result/ClassData;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    goto/16 :goto_3

    .line 202
    .line 203
    :pswitch_7
    new-instance v4, Lorg/luckypray/dexkit/schema/-EncodeValueString;

    .line 204
    .line 205
    invoke-direct {v4}, Lorg/luckypray/dexkit/schema/-EncodeValueString;-><init>()V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2, v4}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lod;)Lod;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    check-cast v2, Lorg/luckypray/dexkit/schema/-EncodeValueString;

    .line 216
    .line 217
    :try_start_0
    invoke-virtual {v2}, Lorg/luckypray/dexkit/schema/-EncodeValueString;->getValue()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 222
    .line 223
    .line 224
    move-object v2, v4

    .line 225
    goto/16 :goto_3

    .line 226
    .line 227
    :catch_0
    :try_start_1
    invoke-virtual {v2}, Lorg/luckypray/dexkit/schema/-EncodeValueString;->getValueAsByteBuffer()Ljava/nio/ByteBuffer;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    invoke-static {v2}, Lorg/luckypray/dexkit/util/MUtf8Util;->decode(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    invoke-static {v2}, Lorg/luckypray/dexkit/util/StringUnicodeEncoderDecoder;->encodeStringToUnicodeSequence(Ljava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 239
    goto :goto_1

    .line 240
    :catchall_0
    move-exception v2

    .line 241
    new-instance v4, Lpc;

    .line 242
    .line 243
    invoke-direct {v4, v2}, Lpc;-><init>(Ljava/lang/Throwable;)V

    .line 244
    .line 245
    .line 246
    move-object v2, v4

    .line 247
    :goto_1
    invoke-static {v2}, Lqc;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    if-nez v4, :cond_0

    .line 252
    .line 253
    goto :goto_2

    .line 254
    :cond_0
    const-string v2, ""

    .line 255
    .line 256
    :goto_2
    check-cast v2, Ljava/lang/String;

    .line 257
    .line 258
    goto/16 :goto_3

    .line 259
    .line 260
    :pswitch_8
    new-instance v4, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;

    .line 261
    .line 262
    invoke-direct {v4}, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;-><init>()V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v2, v4}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lod;)Lod;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    check-cast v2, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;

    .line 273
    .line 274
    invoke-virtual {v2}, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;->getValue()D

    .line 275
    .line 276
    .line 277
    move-result-wide v4

    .line 278
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    goto/16 :goto_3

    .line 283
    .line 284
    :pswitch_9
    new-instance v4, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;

    .line 285
    .line 286
    invoke-direct {v4}, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;-><init>()V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2, v4}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lod;)Lod;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    check-cast v2, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;

    .line 297
    .line 298
    invoke-virtual {v2}, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;->getValue()F

    .line 299
    .line 300
    .line 301
    move-result v2

    .line 302
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    goto :goto_3

    .line 307
    :pswitch_a
    new-instance v4, Lorg/luckypray/dexkit/schema/-EncodeValueLong;

    .line 308
    .line 309
    invoke-direct {v4}, Lorg/luckypray/dexkit/schema/-EncodeValueLong;-><init>()V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v2, v4}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lod;)Lod;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    check-cast v2, Lorg/luckypray/dexkit/schema/-EncodeValueLong;

    .line 320
    .line 321
    invoke-virtual {v2}, Lorg/luckypray/dexkit/schema/-EncodeValueLong;->getValue()J

    .line 322
    .line 323
    .line 324
    move-result-wide v4

    .line 325
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    goto :goto_3

    .line 330
    :pswitch_b
    new-instance v4, Lorg/luckypray/dexkit/schema/-EncodeValueInt;

    .line 331
    .line 332
    invoke-direct {v4}, Lorg/luckypray/dexkit/schema/-EncodeValueInt;-><init>()V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v2, v4}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lod;)Lod;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    check-cast v2, Lorg/luckypray/dexkit/schema/-EncodeValueInt;

    .line 343
    .line 344
    invoke-virtual {v2}, Lorg/luckypray/dexkit/schema/-EncodeValueInt;->getValue()I

    .line 345
    .line 346
    .line 347
    move-result v2

    .line 348
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    goto :goto_3

    .line 353
    :pswitch_c
    new-instance v4, Lorg/luckypray/dexkit/schema/-EncodeValueChar;

    .line 354
    .line 355
    invoke-direct {v4}, Lorg/luckypray/dexkit/schema/-EncodeValueChar;-><init>()V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v2, v4}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lod;)Lod;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    check-cast v2, Lorg/luckypray/dexkit/schema/-EncodeValueChar;

    .line 366
    .line 367
    invoke-virtual {v2}, Lorg/luckypray/dexkit/schema/-EncodeValueChar;->getValue()S

    .line 368
    .line 369
    .line 370
    move-result v2

    .line 371
    invoke-static {v2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    goto :goto_3

    .line 376
    :pswitch_d
    new-instance v4, Lorg/luckypray/dexkit/schema/-EncodeValueShort;

    .line 377
    .line 378
    invoke-direct {v4}, Lorg/luckypray/dexkit/schema/-EncodeValueShort;-><init>()V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v2, v4}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lod;)Lod;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    check-cast v2, Lorg/luckypray/dexkit/schema/-EncodeValueShort;

    .line 389
    .line 390
    invoke-virtual {v2}, Lorg/luckypray/dexkit/schema/-EncodeValueShort;->getValue()S

    .line 391
    .line 392
    .line 393
    move-result v2

    .line 394
    invoke-static {v2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    goto :goto_3

    .line 399
    :pswitch_e
    new-instance v4, Lorg/luckypray/dexkit/schema/-EncodeValueByte;

    .line 400
    .line 401
    invoke-direct {v4}, Lorg/luckypray/dexkit/schema/-EncodeValueByte;-><init>()V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v2, v4}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lod;)Lod;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    check-cast v2, Lorg/luckypray/dexkit/schema/-EncodeValueByte;

    .line 412
    .line 413
    invoke-virtual {v2}, Lorg/luckypray/dexkit/schema/-EncodeValueByte;->getValue()B

    .line 414
    .line 415
    .line 416
    move-result v2

    .line 417
    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    :goto_3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    sget-object v4, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->-Companion:Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;

    .line 425
    .line 426
    invoke-virtual {v4, v2, v3}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;->from(Ljava/lang/Object;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;)Lorg/luckypray/dexkit/result/AnnotationEncodeValue;

    .line 427
    .line 428
    .line 429
    move-result-object v2

    .line 430
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    add-int/lit8 v1, v1, 0x1

    .line 434
    .line 435
    goto/16 :goto_0

    .line 436
    .line 437
    :cond_1
    new-instance p2, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;

    .line 438
    .line 439
    const/4 v0, 0x0

    .line 440
    invoke-direct {p2, p1, p0, v0}, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/List;Lr2;)V

    .line 441
    .line 442
    .line 443
    return-object p2

    .line 444
    nop

    .line 445
    :pswitch_data_0
    .packed-switch 0x1
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
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
