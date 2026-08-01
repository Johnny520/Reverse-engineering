.class public final synthetic Lyh0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyh0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lyh0;->ζ:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lyh0;->ε:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, Lyh0;->ζ:Ljava/lang/String;

    .line 7
    .line 8
    sget-object v4, Ls62;->α:Ls62;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0

    .line 33
    :pswitch_0
    move-object/from16 v0, p1

    .line 34
    .line 35
    check-cast v0, Lorg/luckypray/dexkit/query/FindClass;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    new-instance v1, Lyh0;

    .line 41
    .line 42
    const/16 v2, 0xf

    .line 43
    .line 44
    invoke-direct {v1, v3, v2}, Lyh0;-><init>(Ljava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/FindClass;->matcher(La80;)Lorg/luckypray/dexkit/query/FindClass;

    .line 48
    .line 49
    .line 50
    return-object v4

    .line 51
    :pswitch_1
    move-object/from16 v5, p1

    .line 52
    .line 53
    check-cast v5, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    const/4 v9, 0x6

    .line 59
    const/4 v10, 0x0

    .line 60
    iget-object v6, v0, Lyh0;->ζ:Ljava/lang/String;

    .line 61
    .line 62
    const/4 v7, 0x0

    .line 63
    const/4 v8, 0x0

    .line 64
    invoke-static/range {v5 .. v10}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 65
    .line 66
    .line 67
    return-object v4

    .line 68
    :pswitch_2
    move-object/from16 v0, p1

    .line 69
    .line 70
    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    filled-new-array {v3}, [Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 80
    .line 81
    .line 82
    return-object v4

    .line 83
    :pswitch_3
    move-object/from16 v0, p1

    .line 84
    .line 85
    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    new-instance v1, Lyh0;

    .line 91
    .line 92
    const/16 v2, 0xe

    .line 93
    .line 94
    invoke-direct {v1, v3, v2}, Lyh0;-><init>(Ljava/lang/String;I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 98
    .line 99
    .line 100
    return-object v4

    .line 101
    :pswitch_4
    move-object/from16 v5, p1

    .line 102
    .line 103
    check-cast v5, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 104
    .line 105
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    const/4 v9, 0x6

    .line 109
    const/4 v10, 0x0

    .line 110
    iget-object v6, v0, Lyh0;->ζ:Ljava/lang/String;

    .line 111
    .line 112
    const/4 v7, 0x0

    .line 113
    const/4 v8, 0x0

    .line 114
    invoke-static/range {v5 .. v10}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 115
    .line 116
    .line 117
    return-object v4

    .line 118
    :pswitch_5
    move-object/from16 v0, p1

    .line 119
    .line 120
    check-cast v0, Lorg/luckypray/dexkit/query/FindClass;

    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    new-instance v1, Lyh0;

    .line 126
    .line 127
    const/16 v2, 0xc

    .line 128
    .line 129
    invoke-direct {v1, v3, v2}, Lyh0;-><init>(Ljava/lang/String;I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/FindClass;->matcher(La80;)Lorg/luckypray/dexkit/query/FindClass;

    .line 133
    .line 134
    .line 135
    return-object v4

    .line 136
    :pswitch_6
    move-object/from16 v0, p1

    .line 137
    .line 138
    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    new-instance v1, Lyh0;

    .line 144
    .line 145
    const/16 v2, 0x8

    .line 146
    .line 147
    invoke-direct {v1, v3, v2}, Lyh0;-><init>(Ljava/lang/String;I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 151
    .line 152
    .line 153
    return-object v4

    .line 154
    :pswitch_7
    move-object/from16 v0, p1

    .line 155
    .line 156
    check-cast v0, Lorg/luckypray/dexkit/query/FindClass;

    .line 157
    .line 158
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    new-instance v1, Lyh0;

    .line 162
    .line 163
    const/4 v2, 0x7

    .line 164
    invoke-direct {v1, v3, v2}, Lyh0;-><init>(Ljava/lang/String;I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/FindClass;->matcher(La80;)Lorg/luckypray/dexkit/query/FindClass;

    .line 168
    .line 169
    .line 170
    return-object v4

    .line 171
    :pswitch_8
    move-object/from16 v5, p1

    .line 172
    .line 173
    check-cast v5, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 174
    .line 175
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    const/4 v9, 0x6

    .line 179
    const/4 v10, 0x0

    .line 180
    iget-object v6, v0, Lyh0;->ζ:Ljava/lang/String;

    .line 181
    .line 182
    const/4 v7, 0x0

    .line 183
    const/4 v8, 0x0

    .line 184
    invoke-static/range {v5 .. v10}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 185
    .line 186
    .line 187
    const-string v6, "java.lang.String"

    .line 188
    .line 189
    invoke-static/range {v5 .. v10}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 190
    .line 191
    .line 192
    sget-object v0, Lki1;->β:Ljava/util/List;

    .line 193
    .line 194
    new-array v1, v2, [Ljava/lang/String;

    .line 195
    .line 196
    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    check-cast v0, [Ljava/lang/String;

    .line 201
    .line 202
    array-length v1, v0

    .line 203
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    check-cast v0, [Ljava/lang/String;

    .line 208
    .line 209
    invoke-virtual {v5, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 210
    .line 211
    .line 212
    return-object v4

    .line 213
    :pswitch_9
    move-object/from16 v6, p1

    .line 214
    .line 215
    check-cast v6, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 216
    .line 217
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    const/4 v10, 0x6

    .line 221
    const/4 v11, 0x0

    .line 222
    iget-object v7, v0, Lyh0;->ζ:Ljava/lang/String;

    .line 223
    .line 224
    const/4 v8, 0x0

    .line 225
    const/4 v9, 0x0

    .line 226
    invoke-static/range {v6 .. v11}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 227
    .line 228
    .line 229
    return-object v4

    .line 230
    :pswitch_a
    move-object/from16 v12, p1

    .line 231
    .line 232
    check-cast v12, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 233
    .line 234
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    const/16 v16, 0x6

    .line 238
    .line 239
    const/16 v17, 0x0

    .line 240
    .line 241
    iget-object v13, v0, Lyh0;->ζ:Ljava/lang/String;

    .line 242
    .line 243
    const/4 v14, 0x0

    .line 244
    const/4 v15, 0x0

    .line 245
    invoke-static/range {v12 .. v17}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 246
    .line 247
    .line 248
    const-string v13, "void"

    .line 249
    .line 250
    invoke-static/range {v12 .. v17}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 251
    .line 252
    .line 253
    const-string v0, "int"

    .line 254
    .line 255
    filled-new-array {v0}, [Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-virtual {v12, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 260
    .line 261
    .line 262
    return-object v4

    .line 263
    :pswitch_b
    move-object/from16 v0, p1

    .line 264
    .line 265
    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .line 266
    .line 267
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    new-instance v1, Lyh0;

    .line 271
    .line 272
    const/4 v2, 0x6

    .line 273
    invoke-direct {v1, v3, v2}, Lyh0;-><init>(Ljava/lang/String;I)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 277
    .line 278
    .line 279
    return-object v4

    .line 280
    :pswitch_c
    move-object/from16 v0, p1

    .line 281
    .line 282
    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .line 283
    .line 284
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    new-instance v1, Lyh0;

    .line 288
    .line 289
    const/4 v2, 0x3

    .line 290
    invoke-direct {v1, v3, v2}, Lyh0;-><init>(Ljava/lang/String;I)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 294
    .line 295
    .line 296
    return-object v4

    .line 297
    :pswitch_d
    move-object/from16 v5, p1

    .line 298
    .line 299
    check-cast v5, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 300
    .line 301
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    const/4 v9, 0x6

    .line 305
    const/4 v10, 0x0

    .line 306
    iget-object v6, v0, Lyh0;->ζ:Ljava/lang/String;

    .line 307
    .line 308
    const/4 v7, 0x0

    .line 309
    const/4 v8, 0x0

    .line 310
    invoke-static/range {v5 .. v10}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 311
    .line 312
    .line 313
    const-string v6, "java.util.List"

    .line 314
    .line 315
    invoke-static/range {v5 .. v10}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v5, v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramCount(I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 319
    .line 320
    .line 321
    return-object v4

    .line 322
    :pswitch_e
    move-object/from16 v0, p1

    .line 323
    .line 324
    check-cast v0, Ljava/lang/reflect/Method;

    .line 325
    .line 326
    invoke-static {v3, v0}, Lxq0;->α(Ljava/lang/String;Ljava/lang/reflect/Method;)Z

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    goto/16 :goto_0

    .line 331
    .line 332
    :pswitch_f
    move-object/from16 v0, p1

    .line 333
    .line 334
    check-cast v0, Ljs1;

    .line 335
    .line 336
    sget-object v1, Lhs1;->α:[Lso0;

    .line 337
    .line 338
    sget-object v1, Lfs1;->α:Lis1;

    .line 339
    .line 340
    invoke-static {v3}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    invoke-interface {v0, v1, v2}, Ljs1;->α(Lis1;Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    const/4 v1, 0x5

    .line 348
    invoke-static {v0, v1}, Lhs1;->α(Ljs1;I)V

    .line 349
    .line 350
    .line 351
    return-object v4

    .line 352
    :pswitch_10
    move-object/from16 v5, p1

    .line 353
    .line 354
    check-cast v5, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 355
    .line 356
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    const/4 v9, 0x6

    .line 360
    const/4 v10, 0x0

    .line 361
    iget-object v6, v0, Lyh0;->ζ:Ljava/lang/String;

    .line 362
    .line 363
    const/4 v7, 0x0

    .line 364
    const/4 v8, 0x0

    .line 365
    invoke-static/range {v5 .. v10}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 369
    .line 370
    .line 371
    return-object v4

    .line 372
    nop

    .line 373
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
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
