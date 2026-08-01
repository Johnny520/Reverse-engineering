.class public final Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


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

.method public synthetic constructor <init>(Lzq;)V
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

    invoke-direct {p0, p1, p2, v0}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;-><init>(Ljava/lang/Object;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;Lzq;)V

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
    invoke-static {}, Lγ;->κ()V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0

    .line 33
    :pswitch_0
    new-instance p1, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;

    .line 34
    .line 35
    invoke-direct {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lp22;)Lp22;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    check-cast p1, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;

    .line 46
    .line 47
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;->getValue()Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    goto/16 :goto_0

    .line 56
    .line 57
    :pswitch_1
    new-instance p1, Lorg/luckypray/dexkit/schema/-EncodeValueNull;

    .line 58
    .line 59
    invoke-direct {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueNull;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lp22;)Lp22;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    check-cast p1, Lorg/luckypray/dexkit/schema/-EncodeValueNull;

    .line 70
    .line 71
    goto/16 :goto_0

    .line 72
    .line 73
    :pswitch_2
    sget-object v0, Lorg/luckypray/dexkit/result/AnnotationData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationData$-Companion;

    .line 74
    .line 75
    new-instance v1, Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    .line 76
    .line 77
    invoke-direct {v1}, Lorg/luckypray/dexkit/schema/-AnnotationMeta;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2, v1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lp22;)Lp22;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    check-cast p2, Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    .line 88
    .line 89
    invoke-virtual {v0, p1, p2}, Lorg/luckypray/dexkit/result/AnnotationData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationMeta;)Lorg/luckypray/dexkit/result/AnnotationData;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    goto/16 :goto_0

    .line 94
    .line 95
    :pswitch_3
    sget-object v0, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;

    .line 96
    .line 97
    new-instance v1, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;

    .line 98
    .line 99
    invoke-direct {v1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p2, v1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lp22;)Lp22;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    check-cast p2, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;

    .line 110
    .line 111
    invoke-virtual {v0, p1, p2}, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;)Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    goto/16 :goto_0

    .line 116
    .line 117
    :pswitch_4
    sget-object v0, Lorg/luckypray/dexkit/result/FieldData;->-Companion:Lorg/luckypray/dexkit/result/FieldData$-Companion;

    .line 118
    .line 119
    new-instance v1, Lorg/luckypray/dexkit/schema/-FieldMeta;

    .line 120
    .line 121
    invoke-direct {v1}, Lorg/luckypray/dexkit/schema/-FieldMeta;-><init>()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2, v1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lp22;)Lp22;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    check-cast p2, Lorg/luckypray/dexkit/schema/-FieldMeta;

    .line 132
    .line 133
    invoke-virtual {v0, p1, p2}, Lorg/luckypray/dexkit/result/FieldData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-FieldMeta;)Lorg/luckypray/dexkit/result/FieldData;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    goto/16 :goto_0

    .line 138
    .line 139
    :pswitch_5
    sget-object v0, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    .line 140
    .line 141
    new-instance v1, Lorg/luckypray/dexkit/schema/-MethodMeta;

    .line 142
    .line 143
    invoke-direct {v1}, Lorg/luckypray/dexkit/schema/-MethodMeta;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p2, v1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lp22;)Lp22;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    check-cast p2, Lorg/luckypray/dexkit/schema/-MethodMeta;

    .line 154
    .line 155
    invoke-virtual {v0, p1, p2}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    goto/16 :goto_0

    .line 160
    .line 161
    :pswitch_6
    sget-object v0, Lorg/luckypray/dexkit/result/ClassData;->-Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;

    .line 162
    .line 163
    new-instance v1, Lorg/luckypray/dexkit/schema/-ClassMeta;

    .line 164
    .line 165
    invoke-direct {v1}, Lorg/luckypray/dexkit/schema/-ClassMeta;-><init>()V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p2, v1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lp22;)Lp22;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    check-cast p2, Lorg/luckypray/dexkit/schema/-ClassMeta;

    .line 176
    .line 177
    invoke-virtual {v0, p1, p2}, Lorg/luckypray/dexkit/result/ClassData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/result/ClassData;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    goto/16 :goto_0

    .line 182
    .line 183
    :pswitch_7
    new-instance p1, Lorg/luckypray/dexkit/schema/-EncodeValueString;

    .line 184
    .line 185
    invoke-direct {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueString;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lp22;)Lp22;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    check-cast p1, Lorg/luckypray/dexkit/schema/-EncodeValueString;

    .line 196
    .line 197
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueString;->getValue()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    goto/16 :goto_0

    .line 205
    .line 206
    :pswitch_8
    new-instance p1, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;

    .line 207
    .line 208
    invoke-direct {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;-><init>()V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lp22;)Lp22;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    check-cast p1, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;

    .line 219
    .line 220
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;->getValue()D

    .line 221
    .line 222
    .line 223
    move-result-wide p1

    .line 224
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    goto/16 :goto_0

    .line 229
    .line 230
    :pswitch_9
    new-instance p1, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;

    .line 231
    .line 232
    invoke-direct {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;-><init>()V

    .line 233
    .line 234
    .line 235
    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lp22;)Lp22;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    check-cast p1, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;

    .line 243
    .line 244
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;->getValue()F

    .line 245
    .line 246
    .line 247
    move-result p1

    .line 248
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    goto :goto_0

    .line 253
    :pswitch_a
    new-instance p1, Lorg/luckypray/dexkit/schema/-EncodeValueLong;

    .line 254
    .line 255
    invoke-direct {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueLong;-><init>()V

    .line 256
    .line 257
    .line 258
    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lp22;)Lp22;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    check-cast p1, Lorg/luckypray/dexkit/schema/-EncodeValueLong;

    .line 266
    .line 267
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueLong;->getValue()J

    .line 268
    .line 269
    .line 270
    move-result-wide p1

    .line 271
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    goto :goto_0

    .line 276
    :pswitch_b
    new-instance p1, Lorg/luckypray/dexkit/schema/-EncodeValueInt;

    .line 277
    .line 278
    invoke-direct {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueInt;-><init>()V

    .line 279
    .line 280
    .line 281
    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lp22;)Lp22;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    check-cast p1, Lorg/luckypray/dexkit/schema/-EncodeValueInt;

    .line 289
    .line 290
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueInt;->getValue()I

    .line 291
    .line 292
    .line 293
    move-result p1

    .line 294
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    goto :goto_0

    .line 299
    :pswitch_c
    new-instance p1, Lorg/luckypray/dexkit/schema/-EncodeValueChar;

    .line 300
    .line 301
    invoke-direct {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueChar;-><init>()V

    .line 302
    .line 303
    .line 304
    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lp22;)Lp22;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    check-cast p1, Lorg/luckypray/dexkit/schema/-EncodeValueChar;

    .line 312
    .line 313
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueChar;->getValue()S

    .line 314
    .line 315
    .line 316
    move-result p1

    .line 317
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    goto :goto_0

    .line 322
    :pswitch_d
    new-instance p1, Lorg/luckypray/dexkit/schema/-EncodeValueShort;

    .line 323
    .line 324
    invoke-direct {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueShort;-><init>()V

    .line 325
    .line 326
    .line 327
    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lp22;)Lp22;

    .line 328
    .line 329
    .line 330
    move-result-object p1

    .line 331
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    check-cast p1, Lorg/luckypray/dexkit/schema/-EncodeValueShort;

    .line 335
    .line 336
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueShort;->getValue()S

    .line 337
    .line 338
    .line 339
    move-result p1

    .line 340
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 341
    .line 342
    .line 343
    move-result-object p1

    .line 344
    goto :goto_0

    .line 345
    :pswitch_e
    new-instance p1, Lorg/luckypray/dexkit/schema/-EncodeValueByte;

    .line 346
    .line 347
    invoke-direct {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueByte;-><init>()V

    .line 348
    .line 349
    .line 350
    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lp22;)Lp22;

    .line 351
    .line 352
    .line 353
    move-result-object p1

    .line 354
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    check-cast p1, Lorg/luckypray/dexkit/schema/-EncodeValueByte;

    .line 358
    .line 359
    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueByte;->getValue()B

    .line 360
    .line 361
    .line 362
    move-result p1

    .line 363
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 364
    .line 365
    .line 366
    move-result-object p1

    .line 367
    :goto_0
    new-instance p2, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;

    .line 368
    .line 369
    const/4 v0, 0x0

    .line 370
    invoke-direct {p2, p1, p0, v0}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;-><init>(Ljava/lang/Object;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;Lzq;)V

    .line 371
    .line 372
    .line 373
    return-object p2

    .line 374
    nop

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
