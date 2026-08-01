.class public final Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


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

.method public synthetic constructor <init>(Lzq;)V
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
    invoke-static {}, Lγ;->κ()V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return-object p0

    .line 52
    :pswitch_0
    new-instance v4, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;

    .line 53
    .line 54
    invoke-direct {v4}, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, v4}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lp22;)Lp22;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    check-cast v2, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;

    .line 65
    .line 66
    invoke-virtual {v2}, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;->getValue()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    goto/16 :goto_3

    .line 75
    .line 76
    :pswitch_1
    new-instance v4, Lorg/luckypray/dexkit/schema/-EncodeValueNull;

    .line 77
    .line 78
    invoke-direct {v4}, Lorg/luckypray/dexkit/schema/-EncodeValueNull;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v4}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lp22;)Lp22;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    check-cast v2, Lorg/luckypray/dexkit/schema/-EncodeValueNull;

    .line 89
    .line 90
    goto/16 :goto_3

    .line 91
    .line 92
    :pswitch_2
    sget-object v4, Lorg/luckypray/dexkit/result/AnnotationData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationData$-Companion;

    .line 93
    .line 94
    new-instance v5, Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    .line 95
    .line 96
    invoke-direct {v5}, Lorg/luckypray/dexkit/schema/-AnnotationMeta;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v5}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lp22;)Lp22;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    check-cast v2, Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    .line 107
    .line 108
    invoke-virtual {v4, p1, v2}, Lorg/luckypray/dexkit/result/AnnotationData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationMeta;)Lorg/luckypray/dexkit/result/AnnotationData;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    goto/16 :goto_3

    .line 113
    .line 114
    :pswitch_3
    sget-object v4, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;

    .line 115
    .line 116
    new-instance v5, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;

    .line 117
    .line 118
    invoke-direct {v5}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, v5}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lp22;)Lp22;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    check-cast v2, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;

    .line 129
    .line 130
    invoke-virtual {v4, p1, v2}, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;)Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    goto/16 :goto_3

    .line 135
    .line 136
    :pswitch_4
    sget-object v4, Lorg/luckypray/dexkit/result/FieldData;->-Companion:Lorg/luckypray/dexkit/result/FieldData$-Companion;

    .line 137
    .line 138
    new-instance v5, Lorg/luckypray/dexkit/schema/-FieldMeta;

    .line 139
    .line 140
    invoke-direct {v5}, Lorg/luckypray/dexkit/schema/-FieldMeta;-><init>()V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2, v5}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lp22;)Lp22;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    check-cast v2, Lorg/luckypray/dexkit/schema/-FieldMeta;

    .line 151
    .line 152
    invoke-virtual {v4, p1, v2}, Lorg/luckypray/dexkit/result/FieldData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-FieldMeta;)Lorg/luckypray/dexkit/result/FieldData;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    goto/16 :goto_3

    .line 157
    .line 158
    :pswitch_5
    sget-object v4, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    .line 159
    .line 160
    new-instance v5, Lorg/luckypray/dexkit/schema/-MethodMeta;

    .line 161
    .line 162
    invoke-direct {v5}, Lorg/luckypray/dexkit/schema/-MethodMeta;-><init>()V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v5}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lp22;)Lp22;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    check-cast v2, Lorg/luckypray/dexkit/schema/-MethodMeta;

    .line 173
    .line 174
    invoke-virtual {v4, p1, v2}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    goto/16 :goto_3

    .line 179
    .line 180
    :pswitch_6
    sget-object v4, Lorg/luckypray/dexkit/result/ClassData;->-Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;

    .line 181
    .line 182
    new-instance v5, Lorg/luckypray/dexkit/schema/-ClassMeta;

    .line 183
    .line 184
    invoke-direct {v5}, Lorg/luckypray/dexkit/schema/-ClassMeta;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2, v5}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lp22;)Lp22;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    check-cast v2, Lorg/luckypray/dexkit/schema/-ClassMeta;

    .line 195
    .line 196
    invoke-virtual {v4, p1, v2}, Lorg/luckypray/dexkit/result/ClassData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/result/ClassData;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    goto/16 :goto_3

    .line 201
    .line 202
    :pswitch_7
    new-instance v4, Lorg/luckypray/dexkit/schema/-EncodeValueString;

    .line 203
    .line 204
    invoke-direct {v4}, Lorg/luckypray/dexkit/schema/-EncodeValueString;-><init>()V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v2, v4}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lp22;)Lp22;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    check-cast v2, Lorg/luckypray/dexkit/schema/-EncodeValueString;

    .line 215
    .line 216
    :try_start_0
    invoke-virtual {v2}, Lorg/luckypray/dexkit/schema/-EncodeValueString;->getValue()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 221
    .line 222
    .line 223
    move-object v2, v4

    .line 224
    goto/16 :goto_3

    .line 225
    .line 226
    :catch_0
    :try_start_1
    invoke-virtual {v2}, Lorg/luckypray/dexkit/schema/-EncodeValueString;->getValueAsByteBuffer()Ljava/nio/ByteBuffer;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    invoke-static {v2}, Lorg/luckypray/dexkit/util/MUtf8Util;->decode(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    invoke-static {v2}, Lorg/luckypray/dexkit/util/StringUnicodeEncoderDecoder;->encodeStringToUnicodeSequence(Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 238
    goto :goto_1

    .line 239
    :catchall_0
    move-exception v2

    .line 240
    new-instance v4, Leo1;

    .line 241
    .line 242
    invoke-direct {v4, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 243
    .line 244
    .line 245
    move-object v2, v4

    .line 246
    :goto_1
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    if-nez v4, :cond_0

    .line 251
    .line 252
    goto :goto_2

    .line 253
    :cond_0
    const-string v2, ""

    .line 254
    .line 255
    :goto_2
    check-cast v2, Ljava/lang/String;

    .line 256
    .line 257
    goto/16 :goto_3

    .line 258
    .line 259
    :pswitch_8
    new-instance v4, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;

    .line 260
    .line 261
    invoke-direct {v4}, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;-><init>()V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2, v4}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lp22;)Lp22;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    check-cast v2, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;

    .line 272
    .line 273
    invoke-virtual {v2}, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;->getValue()D

    .line 274
    .line 275
    .line 276
    move-result-wide v4

    .line 277
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    goto/16 :goto_3

    .line 282
    .line 283
    :pswitch_9
    new-instance v4, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;

    .line 284
    .line 285
    invoke-direct {v4}, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;-><init>()V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v2, v4}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lp22;)Lp22;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    check-cast v2, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;

    .line 296
    .line 297
    invoke-virtual {v2}, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;->getValue()F

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    goto :goto_3

    .line 306
    :pswitch_a
    new-instance v4, Lorg/luckypray/dexkit/schema/-EncodeValueLong;

    .line 307
    .line 308
    invoke-direct {v4}, Lorg/luckypray/dexkit/schema/-EncodeValueLong;-><init>()V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v2, v4}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lp22;)Lp22;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    check-cast v2, Lorg/luckypray/dexkit/schema/-EncodeValueLong;

    .line 319
    .line 320
    invoke-virtual {v2}, Lorg/luckypray/dexkit/schema/-EncodeValueLong;->getValue()J

    .line 321
    .line 322
    .line 323
    move-result-wide v4

    .line 324
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    goto :goto_3

    .line 329
    :pswitch_b
    new-instance v4, Lorg/luckypray/dexkit/schema/-EncodeValueInt;

    .line 330
    .line 331
    invoke-direct {v4}, Lorg/luckypray/dexkit/schema/-EncodeValueInt;-><init>()V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v2, v4}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lp22;)Lp22;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    check-cast v2, Lorg/luckypray/dexkit/schema/-EncodeValueInt;

    .line 342
    .line 343
    invoke-virtual {v2}, Lorg/luckypray/dexkit/schema/-EncodeValueInt;->getValue()I

    .line 344
    .line 345
    .line 346
    move-result v2

    .line 347
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    goto :goto_3

    .line 352
    :pswitch_c
    new-instance v4, Lorg/luckypray/dexkit/schema/-EncodeValueChar;

    .line 353
    .line 354
    invoke-direct {v4}, Lorg/luckypray/dexkit/schema/-EncodeValueChar;-><init>()V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v2, v4}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lp22;)Lp22;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    check-cast v2, Lorg/luckypray/dexkit/schema/-EncodeValueChar;

    .line 365
    .line 366
    invoke-virtual {v2}, Lorg/luckypray/dexkit/schema/-EncodeValueChar;->getValue()S

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    invoke-static {v2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    goto :goto_3

    .line 375
    :pswitch_d
    new-instance v4, Lorg/luckypray/dexkit/schema/-EncodeValueShort;

    .line 376
    .line 377
    invoke-direct {v4}, Lorg/luckypray/dexkit/schema/-EncodeValueShort;-><init>()V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v2, v4}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lp22;)Lp22;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 385
    .line 386
    .line 387
    check-cast v2, Lorg/luckypray/dexkit/schema/-EncodeValueShort;

    .line 388
    .line 389
    invoke-virtual {v2}, Lorg/luckypray/dexkit/schema/-EncodeValueShort;->getValue()S

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    invoke-static {v2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    goto :goto_3

    .line 398
    :pswitch_e
    new-instance v4, Lorg/luckypray/dexkit/schema/-EncodeValueByte;

    .line 399
    .line 400
    invoke-direct {v4}, Lorg/luckypray/dexkit/schema/-EncodeValueByte;-><init>()V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v2, v4}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lp22;)Lp22;

    .line 404
    .line 405
    .line 406
    move-result-object v2

    .line 407
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    .line 409
    .line 410
    check-cast v2, Lorg/luckypray/dexkit/schema/-EncodeValueByte;

    .line 411
    .line 412
    invoke-virtual {v2}, Lorg/luckypray/dexkit/schema/-EncodeValueByte;->getValue()B

    .line 413
    .line 414
    .line 415
    move-result v2

    .line 416
    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    :goto_3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 421
    .line 422
    .line 423
    sget-object v4, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->-Companion:Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;

    .line 424
    .line 425
    invoke-virtual {v4, v2, v3}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;->from(Ljava/lang/Object;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;)Lorg/luckypray/dexkit/result/AnnotationEncodeValue;

    .line 426
    .line 427
    .line 428
    move-result-object v2

    .line 429
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    add-int/lit8 v1, v1, 0x1

    .line 433
    .line 434
    goto/16 :goto_0

    .line 435
    .line 436
    :cond_1
    new-instance p2, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;

    .line 437
    .line 438
    const/4 v0, 0x0

    .line 439
    invoke-direct {p2, p1, p0, v0}, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/List;Lzq;)V

    .line 440
    .line 441
    .line 442
    return-object p2

    .line 443
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
