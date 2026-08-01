.class public final Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/result/AnnotationEncodeValue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "-Companion"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion$WhenMappings;
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
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final from(Ljava/lang/Object;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;)Lorg/luckypray/dexkit/result/AnnotationEncodeValue;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    new-instance p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;-><init>(Ljava/lang/Object;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;Lr2;)V

    return-object p0
.end method

.method public final from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;)Lorg/luckypray/dexkit/result/AnnotationEncodeValue;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object p0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->Companion:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType$Companion;

    .line 8
    .line 9
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->getValueType-w2LRezQ()B

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType$Companion;->from-7apg3OU(B)Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object v0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    aget v0, v0, v1

    .line 24
    .line 25
    packed-switch v0, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    new-instance p0, Lha;

    .line 29
    .line 30
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 31
    .line 32
    .line 33
    throw p0

    .line 34
    :pswitch_0
    new-instance p1, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;

    .line 35
    .line 36
    invoke-direct {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lod;)Lod;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    check-cast p1, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;

    .line 47
    .line 48
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;->getValue()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    goto/16 :goto_0

    .line 57
    .line 58
    :pswitch_1
    new-instance p1, Lorg/luckypray/dexkit/schema/-EncodeValueNull;

    .line 59
    .line 60
    invoke-direct {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueNull;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lod;)Lod;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    check-cast p1, Lorg/luckypray/dexkit/schema/-EncodeValueNull;

    .line 71
    .line 72
    goto/16 :goto_0

    .line 73
    .line 74
    :pswitch_2
    sget-object v0, Lorg/luckypray/dexkit/result/AnnotationData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationData$-Companion;

    .line 75
    .line 76
    new-instance v1, Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    .line 77
    .line 78
    invoke-direct {v1}, Lorg/luckypray/dexkit/schema/-AnnotationMeta;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2, v1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lod;)Lod;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    check-cast p2, Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    .line 89
    .line 90
    invoke-virtual {v0, p1, p2}, Lorg/luckypray/dexkit/result/AnnotationData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationMeta;)Lorg/luckypray/dexkit/result/AnnotationData;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    goto/16 :goto_0

    .line 95
    .line 96
    :pswitch_3
    sget-object v0, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;

    .line 97
    .line 98
    new-instance v1, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;

    .line 99
    .line 100
    invoke-direct {v1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2, v1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lod;)Lod;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    check-cast p2, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;

    .line 111
    .line 112
    invoke-virtual {v0, p1, p2}, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;)Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    goto/16 :goto_0

    .line 117
    .line 118
    :pswitch_4
    sget-object v0, Lorg/luckypray/dexkit/result/FieldData;->-Companion:Lorg/luckypray/dexkit/result/FieldData$-Companion;

    .line 119
    .line 120
    new-instance v1, Lorg/luckypray/dexkit/schema/-FieldMeta;

    .line 121
    .line 122
    invoke-direct {v1}, Lorg/luckypray/dexkit/schema/-FieldMeta;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p2, v1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lod;)Lod;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    check-cast p2, Lorg/luckypray/dexkit/schema/-FieldMeta;

    .line 133
    .line 134
    invoke-virtual {v0, p1, p2}, Lorg/luckypray/dexkit/result/FieldData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-FieldMeta;)Lorg/luckypray/dexkit/result/FieldData;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    goto/16 :goto_0

    .line 139
    .line 140
    :pswitch_5
    sget-object v0, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    .line 141
    .line 142
    new-instance v1, Lorg/luckypray/dexkit/schema/-MethodMeta;

    .line 143
    .line 144
    invoke-direct {v1}, Lorg/luckypray/dexkit/schema/-MethodMeta;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p2, v1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lod;)Lod;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    check-cast p2, Lorg/luckypray/dexkit/schema/-MethodMeta;

    .line 155
    .line 156
    invoke-virtual {v0, p1, p2}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    goto/16 :goto_0

    .line 161
    .line 162
    :pswitch_6
    sget-object v0, Lorg/luckypray/dexkit/result/ClassData;->-Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;

    .line 163
    .line 164
    new-instance v1, Lorg/luckypray/dexkit/schema/-ClassMeta;

    .line 165
    .line 166
    invoke-direct {v1}, Lorg/luckypray/dexkit/schema/-ClassMeta;-><init>()V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p2, v1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lod;)Lod;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    check-cast p2, Lorg/luckypray/dexkit/schema/-ClassMeta;

    .line 177
    .line 178
    invoke-virtual {v0, p1, p2}, Lorg/luckypray/dexkit/result/ClassData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/result/ClassData;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :pswitch_7
    new-instance p1, Lorg/luckypray/dexkit/schema/-EncodeValueString;

    .line 185
    .line 186
    invoke-direct {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueString;-><init>()V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lod;)Lod;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    check-cast p1, Lorg/luckypray/dexkit/schema/-EncodeValueString;

    .line 197
    .line 198
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueString;->getValue()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    goto/16 :goto_0

    .line 206
    .line 207
    :pswitch_8
    new-instance p1, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;

    .line 208
    .line 209
    invoke-direct {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;-><init>()V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lod;)Lod;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    check-cast p1, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;

    .line 220
    .line 221
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;->getValue()D

    .line 222
    .line 223
    .line 224
    move-result-wide p1

    .line 225
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    goto/16 :goto_0

    .line 230
    .line 231
    :pswitch_9
    new-instance p1, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;

    .line 232
    .line 233
    invoke-direct {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;-><init>()V

    .line 234
    .line 235
    .line 236
    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lod;)Lod;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    check-cast p1, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;

    .line 244
    .line 245
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;->getValue()F

    .line 246
    .line 247
    .line 248
    move-result p1

    .line 249
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    goto :goto_0

    .line 254
    :pswitch_a
    new-instance p1, Lorg/luckypray/dexkit/schema/-EncodeValueLong;

    .line 255
    .line 256
    invoke-direct {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueLong;-><init>()V

    .line 257
    .line 258
    .line 259
    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lod;)Lod;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    check-cast p1, Lorg/luckypray/dexkit/schema/-EncodeValueLong;

    .line 267
    .line 268
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueLong;->getValue()J

    .line 269
    .line 270
    .line 271
    move-result-wide p1

    .line 272
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    goto :goto_0

    .line 277
    :pswitch_b
    new-instance p1, Lorg/luckypray/dexkit/schema/-EncodeValueInt;

    .line 278
    .line 279
    invoke-direct {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueInt;-><init>()V

    .line 280
    .line 281
    .line 282
    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lod;)Lod;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    check-cast p1, Lorg/luckypray/dexkit/schema/-EncodeValueInt;

    .line 290
    .line 291
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueInt;->getValue()I

    .line 292
    .line 293
    .line 294
    move-result p1

    .line 295
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    goto :goto_0

    .line 300
    :pswitch_c
    new-instance p1, Lorg/luckypray/dexkit/schema/-EncodeValueChar;

    .line 301
    .line 302
    invoke-direct {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueChar;-><init>()V

    .line 303
    .line 304
    .line 305
    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lod;)Lod;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    check-cast p1, Lorg/luckypray/dexkit/schema/-EncodeValueChar;

    .line 313
    .line 314
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueChar;->getValue()S

    .line 315
    .line 316
    .line 317
    move-result p1

    .line 318
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    goto :goto_0

    .line 323
    :pswitch_d
    new-instance p1, Lorg/luckypray/dexkit/schema/-EncodeValueShort;

    .line 324
    .line 325
    invoke-direct {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueShort;-><init>()V

    .line 326
    .line 327
    .line 328
    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lod;)Lod;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    check-cast p1, Lorg/luckypray/dexkit/schema/-EncodeValueShort;

    .line 336
    .line 337
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueShort;->getValue()S

    .line 338
    .line 339
    .line 340
    move-result p1

    .line 341
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 342
    .line 343
    .line 344
    move-result-object p1

    .line 345
    goto :goto_0

    .line 346
    :pswitch_e
    new-instance p1, Lorg/luckypray/dexkit/schema/-EncodeValueByte;

    .line 347
    .line 348
    invoke-direct {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueByte;-><init>()V

    .line 349
    .line 350
    .line 351
    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lod;)Lod;

    .line 352
    .line 353
    .line 354
    move-result-object p1

    .line 355
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    check-cast p1, Lorg/luckypray/dexkit/schema/-EncodeValueByte;

    .line 359
    .line 360
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueByte;->getValue()B

    .line 361
    .line 362
    .line 363
    move-result p1

    .line 364
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 365
    .line 366
    .line 367
    move-result-object p1

    .line 368
    :goto_0
    new-instance p2, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;

    .line 369
    .line 370
    const/4 v0, 0x0

    .line 371
    invoke-direct {p2, p1, p0, v0}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;-><init>(Ljava/lang/Object;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;Lr2;)V

    .line 372
    .line 373
    .line 374
    return-object p2

    .line 375
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
