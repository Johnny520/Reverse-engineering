.class public final synthetic Ls9;
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
    iput p2, p0, Ls9;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Ls9;->ζ:Ljava/lang/String;

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
    .locals 7

    .line 1
    iget v0, p0, Ls9;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v1, p1

    .line 7
    check-cast v1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v5, 0x6

    .line 13
    const/4 v6, 0x0

    .line 14
    iget-object v2, p0, Ls9;->ζ:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 19
    .line 20
    .line 21
    const-string p0, "~795CFE82BF8D864C285649BA56CE33B4C18838459A84C50FE419E35FE204466F8D2561AAF8AA290694109CAA750A811D72F9"

    .line 22
    .line 23
    invoke-static {p0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 31
    .line 32
    .line 33
    sget-object p0, Ls62;->α:Ls62;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_0
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v0, Ls9;

    .line 42
    .line 43
    const/16 v1, 0x1d

    .line 44
    .line 45
    iget-object p0, p0, Ls9;->ζ:Ljava/lang/String;

    .line 46
    .line 47
    invoke-direct {v0, p0, v1}, Ls9;-><init>(Ljava/lang/String;I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 51
    .line 52
    .line 53
    sget-object p0, Ls62;->α:Ls62;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_1
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    new-instance v0, Lyh0;

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    iget-object p0, p0, Ls9;->ζ:Ljava/lang/String;

    .line 65
    .line 66
    invoke-direct {v0, p0, v1}, Lyh0;-><init>(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 70
    .line 71
    .line 72
    sget-object p0, Ls62;->α:Ls62;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_2
    check-cast p1, Lxd0;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iget-object p1, p1, Lxd0;->α:Ljava/lang/String;

    .line 81
    .line 82
    iget-object p0, p0, Ls9;->ζ:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {p1, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0

    .line 93
    :pswitch_3
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    new-instance v0, Ls9;

    .line 99
    .line 100
    const/16 v1, 0x17

    .line 101
    .line 102
    iget-object p0, p0, Ls9;->ζ:Ljava/lang/String;

    .line 103
    .line 104
    invoke-direct {v0, p0, v1}, Ls9;-><init>(Ljava/lang/String;I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 108
    .line 109
    .line 110
    sget-object p0, Ls62;->α:Ls62;

    .line 111
    .line 112
    return-object p0

    .line 113
    :pswitch_4
    check-cast p1, Ljava/lang/reflect/Field;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iget-object p0, p0, Ls9;->ζ:Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-nez v0, :cond_2

    .line 133
    .line 134
    const-string v0, "java.util.List"

    .line 135
    .line 136
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_0

    .line 141
    .line 142
    const-class v0, Ljava/util/List;

    .line 143
    .line 144
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-nez v0, :cond_2

    .line 153
    .line 154
    :cond_0
    const-string v0, "boolean"

    .line 155
    .line 156
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result p0

    .line 160
    if-eqz p0, :cond_1

    .line 161
    .line 162
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 167
    .line 168
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result p0

    .line 172
    if-nez p0, :cond_2

    .line 173
    .line 174
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    const-class p1, Ljava/lang/Boolean;

    .line 179
    .line 180
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result p0

    .line 184
    if-eqz p0, :cond_1

    .line 185
    .line 186
    goto :goto_0

    .line 187
    :cond_1
    const/4 p0, 0x0

    .line 188
    goto :goto_1

    .line 189
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 190
    :goto_1
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    return-object p0

    .line 195
    :pswitch_5
    move-object v0, p1

    .line 196
    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 197
    .line 198
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    const-string p1, "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B718B9AE6B1"

    .line 202
    .line 203
    invoke-static {p1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    const/4 v4, 0x6

    .line 208
    const/4 v5, 0x0

    .line 209
    const/4 v2, 0x0

    .line 210
    const/4 v3, 0x0

    .line 211
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 212
    .line 213
    .line 214
    iget-object v1, p0, Ls9;->ζ:Ljava/lang/String;

    .line 215
    .line 216
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 220
    .line 221
    .line 222
    sget-object p0, Ls62;->α:Ls62;

    .line 223
    .line 224
    return-object p0

    .line 225
    :pswitch_6
    move-object v0, p1

    .line 226
    check-cast v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 227
    .line 228
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    const/4 v4, 0x6

    .line 232
    const/4 v5, 0x0

    .line 233
    iget-object v1, p0, Ls9;->ζ:Ljava/lang/String;

    .line 234
    .line 235
    const/4 v2, 0x0

    .line 236
    const/4 v3, 0x0

    .line 237
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 238
    .line 239
    .line 240
    sget-object p0, Ls62;->α:Ls62;

    .line 241
    .line 242
    return-object p0

    .line 243
    :pswitch_7
    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    .line 244
    .line 245
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    new-instance v0, Ls9;

    .line 249
    .line 250
    const/16 v1, 0x16

    .line 251
    .line 252
    iget-object p0, p0, Ls9;->ζ:Ljava/lang/String;

    .line 253
    .line 254
    invoke-direct {v0, p0, v1}, Ls9;-><init>(Ljava/lang/String;I)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindClass;->matcher(La80;)Lorg/luckypray/dexkit/query/FindClass;

    .line 258
    .line 259
    .line 260
    sget-object p0, Ls62;->α:Ls62;

    .line 261
    .line 262
    return-object p0

    .line 263
    :pswitch_8
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 264
    .line 265
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    const-string v0, "~791C379109EE249A17C75D97B08A46A1FBF5443CB34C0F44BBA61A1BA3C0B72730E4"

    .line 269
    .line 270
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->setDeclaredClass(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    iget-object p0, p0, Ls9;->ζ:Ljava/lang/String;

    .line 278
    .line 279
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->setName(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    sget-object p0, Ls62;->α:Ls62;

    .line 283
    .line 284
    return-object p0

    .line 285
    :pswitch_9
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 286
    .line 287
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    new-instance v0, Ls9;

    .line 291
    .line 292
    const/16 v1, 0x14

    .line 293
    .line 294
    iget-object p0, p0, Ls9;->ζ:Ljava/lang/String;

    .line 295
    .line 296
    invoke-direct {v0, p0, v1}, Ls9;-><init>(Ljava/lang/String;I)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 300
    .line 301
    .line 302
    sget-object p0, Ls62;->α:Ls62;

    .line 303
    .line 304
    return-object p0

    .line 305
    :pswitch_a
    move-object v0, p1

    .line 306
    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 307
    .line 308
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    const-string p1, "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"

    .line 312
    .line 313
    invoke-static {p1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    const/4 v4, 0x6

    .line 318
    const/4 v5, 0x0

    .line 319
    const/4 v2, 0x0

    .line 320
    const/4 v3, 0x0

    .line 321
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 322
    .line 323
    .line 324
    iget-object v1, p0, Ls9;->ζ:Ljava/lang/String;

    .line 325
    .line 326
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 327
    .line 328
    .line 329
    sget-object p0, Ls62;->α:Ls62;

    .line 330
    .line 331
    return-object p0

    .line 332
    :pswitch_b
    check-cast p1, Lorg/luckypray/dexkit/query/FindField;

    .line 333
    .line 334
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    new-instance v0, Ls9;

    .line 338
    .line 339
    const/16 v1, 0x12

    .line 340
    .line 341
    iget-object p0, p0, Ls9;->ζ:Ljava/lang/String;

    .line 342
    .line 343
    invoke-direct {v0, p0, v1}, Ls9;-><init>(Ljava/lang/String;I)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindField;->matcher(La80;)Lorg/luckypray/dexkit/query/FindField;

    .line 347
    .line 348
    .line 349
    sget-object p0, Ls62;->α:Ls62;

    .line 350
    .line 351
    return-object p0

    .line 352
    :pswitch_c
    move-object v0, p1

    .line 353
    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 354
    .line 355
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    const/4 v4, 0x6

    .line 359
    const/4 v5, 0x0

    .line 360
    iget-object v1, p0, Ls9;->ζ:Ljava/lang/String;

    .line 361
    .line 362
    const/4 v2, 0x0

    .line 363
    const/4 v3, 0x0

    .line 364
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 365
    .line 366
    .line 367
    const-string v1, "void"

    .line 368
    .line 369
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 370
    .line 371
    .line 372
    const-string p0, "android.view.View"

    .line 373
    .line 374
    const-string p1, "android.os.Bundle"

    .line 375
    .line 376
    filled-new-array {p0, p1}, [Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object p0

    .line 380
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 381
    .line 382
    .line 383
    sget-object p0, Ls62;->α:Ls62;

    .line 384
    .line 385
    return-object p0

    .line 386
    :pswitch_d
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 387
    .line 388
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 389
    .line 390
    .line 391
    new-instance v0, Ls9;

    .line 392
    .line 393
    const/16 v1, 0x10

    .line 394
    .line 395
    iget-object p0, p0, Ls9;->ζ:Ljava/lang/String;

    .line 396
    .line 397
    invoke-direct {v0, p0, v1}, Ls9;-><init>(Ljava/lang/String;I)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 401
    .line 402
    .line 403
    sget-object p0, Ls62;->α:Ls62;

    .line 404
    .line 405
    return-object p0

    .line 406
    :pswitch_e
    iget-object p0, p0, Ls9;->ζ:Ljava/lang/String;

    .line 407
    .line 408
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 409
    .line 410
    invoke-static {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->ι(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindMethod;)Ls62;

    .line 411
    .line 412
    .line 413
    move-result-object p0

    .line 414
    return-object p0

    .line 415
    :pswitch_f
    iget-object p0, p0, Ls9;->ζ:Ljava/lang/String;

    .line 416
    .line 417
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 418
    .line 419
    invoke-static {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->α(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindMethod;)Ls62;

    .line 420
    .line 421
    .line 422
    move-result-object p0

    .line 423
    return-object p0

    .line 424
    :pswitch_10
    iget-object p0, p0, Ls9;->ζ:Ljava/lang/String;

    .line 425
    .line 426
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 427
    .line 428
    invoke-static {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->η(Ljava/lang/String;Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Ls62;

    .line 429
    .line 430
    .line 431
    move-result-object p0

    .line 432
    return-object p0

    .line 433
    :pswitch_11
    iget-object p0, p0, Ls9;->ζ:Ljava/lang/String;

    .line 434
    .line 435
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 436
    .line 437
    invoke-static {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->ν(Ljava/lang/String;Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Ls62;

    .line 438
    .line 439
    .line 440
    move-result-object p0

    .line 441
    return-object p0

    .line 442
    :pswitch_12
    iget-object p0, p0, Ls9;->ζ:Ljava/lang/String;

    .line 443
    .line 444
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 445
    .line 446
    invoke-static {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->ο(Ljava/lang/String;Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Ls62;

    .line 447
    .line 448
    .line 449
    move-result-object p0

    .line 450
    return-object p0

    .line 451
    :pswitch_13
    iget-object p0, p0, Ls9;->ζ:Ljava/lang/String;

    .line 452
    .line 453
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 454
    .line 455
    invoke-static {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->Β(Ljava/lang/String;Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Ls62;

    .line 456
    .line 457
    .line 458
    move-result-object p0

    .line 459
    return-object p0

    .line 460
    :pswitch_14
    iget-object p0, p0, Ls9;->ζ:Ljava/lang/String;

    .line 461
    .line 462
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 463
    .line 464
    invoke-static {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->ρ(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindMethod;)Ls62;

    .line 465
    .line 466
    .line 467
    move-result-object p0

    .line 468
    return-object p0

    .line 469
    :pswitch_15
    iget-object p0, p0, Ls9;->ζ:Ljava/lang/String;

    .line 470
    .line 471
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 472
    .line 473
    invoke-static {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->σ(Ljava/lang/String;Lorg/luckypray/dexkit/query/FindMethod;)Ls62;

    .line 474
    .line 475
    .line 476
    move-result-object p0

    .line 477
    return-object p0

    .line 478
    :pswitch_16
    move-object v0, p1

    .line 479
    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 480
    .line 481
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 482
    .line 483
    .line 484
    const/4 v4, 0x6

    .line 485
    const/4 v5, 0x0

    .line 486
    iget-object v1, p0, Ls9;->ζ:Ljava/lang/String;

    .line 487
    .line 488
    const/4 v2, 0x0

    .line 489
    const/4 v3, 0x0

    .line 490
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 491
    .line 492
    .line 493
    const-string p0, "void"

    .line 494
    .line 495
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->setReturnType(Ljava/lang/String;)V

    .line 496
    .line 497
    .line 498
    const-string p0, "~7970EC7DC8C1E9D1DCDC9F0020E48B764591F776A2B2A0F654AFAE24985FA802AAD9131B3F256364FE597603FE0C9F429AC0783D12F128B686"

    .line 499
    .line 500
    invoke-static {p0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object p0

    .line 504
    const/4 p1, 0x0

    .line 505
    filled-new-array {p1, p1, p1, p1, p0}, [Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object p0

    .line 509
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 510
    .line 511
    .line 512
    sget-object p0, Ls62;->α:Ls62;

    .line 513
    .line 514
    return-object p0

    .line 515
    :pswitch_17
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 516
    .line 517
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 518
    .line 519
    .line 520
    new-instance v0, Ls9;

    .line 521
    .line 522
    const/4 v1, 0x6

    .line 523
    iget-object p0, p0, Ls9;->ζ:Ljava/lang/String;

    .line 524
    .line 525
    invoke-direct {v0, p0, v1}, Ls9;-><init>(Ljava/lang/String;I)V

    .line 526
    .line 527
    .line 528
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 529
    .line 530
    .line 531
    sget-object p0, Ls62;->α:Ls62;

    .line 532
    .line 533
    return-object p0

    .line 534
    :pswitch_18
    check-cast p1, Ljava/lang/reflect/Method;

    .line 535
    .line 536
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    iget-object p0, p0, Ls9;->ζ:Ljava/lang/String;

    .line 541
    .line 542
    invoke-static {v0, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 543
    .line 544
    .line 545
    move-result p0

    .line 546
    if-eqz p0, :cond_4

    .line 547
    .line 548
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 549
    .line 550
    .line 551
    move-result-object p0

    .line 552
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 553
    .line 554
    .line 555
    array-length p0, p0

    .line 556
    if-nez p0, :cond_4

    .line 557
    .line 558
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 559
    .line 560
    .line 561
    move-result-object p0

    .line 562
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 563
    .line 564
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    move-result p0

    .line 568
    if-nez p0, :cond_3

    .line 569
    .line 570
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 571
    .line 572
    .line 573
    move-result-object p0

    .line 574
    const-class p1, Ljava/lang/Long;

    .line 575
    .line 576
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 577
    .line 578
    .line 579
    move-result p0

    .line 580
    if-eqz p0, :cond_4

    .line 581
    .line 582
    :cond_3
    const/4 p0, 0x1

    .line 583
    goto :goto_2

    .line 584
    :cond_4
    const/4 p0, 0x0

    .line 585
    :goto_2
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 586
    .line 587
    .line 588
    move-result-object p0

    .line 589
    return-object p0

    .line 590
    :pswitch_19
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 591
    .line 592
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    iget-object p0, p0, Ls9;->ζ:Ljava/lang/String;

    .line 596
    .line 597
    filled-new-array {p0}, [Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object p0

    .line 601
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 602
    .line 603
    .line 604
    sget-object p0, Ls62;->α:Ls62;

    .line 605
    .line 606
    return-object p0

    .line 607
    :pswitch_1a
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 608
    .line 609
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 610
    .line 611
    .line 612
    new-instance v0, Ls9;

    .line 613
    .line 614
    const/4 v1, 0x3

    .line 615
    iget-object p0, p0, Ls9;->ζ:Ljava/lang/String;

    .line 616
    .line 617
    invoke-direct {v0, p0, v1}, Ls9;-><init>(Ljava/lang/String;I)V

    .line 618
    .line 619
    .line 620
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 621
    .line 622
    .line 623
    sget-object p0, Ls62;->α:Ls62;

    .line 624
    .line 625
    return-object p0

    .line 626
    :pswitch_1b
    check-cast p1, Ljava/lang/reflect/Method;

    .line 627
    .line 628
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 629
    .line 630
    .line 631
    move-result-object p1

    .line 632
    iget-object p0, p0, Ls9;->ζ:Ljava/lang/String;

    .line 633
    .line 634
    invoke-static {p1, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 635
    .line 636
    .line 637
    move-result p0

    .line 638
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 639
    .line 640
    .line 641
    move-result-object p0

    .line 642
    return-object p0

    .line 643
    :pswitch_1c
    check-cast p1, Lv9;

    .line 644
    .line 645
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 646
    .line 647
    .line 648
    iget-boolean v0, p1, Lv9;->α:Z

    .line 649
    .line 650
    iget-object p1, p1, Lv9;->β:Ljava/lang/String;

    .line 651
    .line 652
    new-instance v1, Ljava/lang/StringBuilder;

    .line 653
    .line 654
    const-string v2, "online beta refresh uid="

    .line 655
    .line 656
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 657
    .line 658
    .line 659
    iget-object p0, p0, Ls9;->ζ:Ljava/lang/String;

    .line 660
    .line 661
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 662
    .line 663
    .line 664
    const-string p0, " found="

    .line 665
    .line 666
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 667
    .line 668
    .line 669
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 670
    .line 671
    .line 672
    const-string p0, " msg="

    .line 673
    .line 674
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 678
    .line 679
    .line 680
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object p0

    .line 684
    const/4 p1, 0x0

    .line 685
    const/4 v0, 0x4

    .line 686
    const-string v1, "r267d1c3d8cdbcdb7"

    .line 687
    .line 688
    invoke-static {v1, p0, p1, v0, p1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 689
    .line 690
    .line 691
    sget-object p0, Ls62;->α:Ls62;

    .line 692
    .line 693
    return-object p0

    .line 694
    nop

    .line 695
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
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
