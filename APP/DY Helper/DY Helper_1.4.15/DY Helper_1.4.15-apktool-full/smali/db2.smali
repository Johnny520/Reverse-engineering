.class public final Ldb2;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Lib2;


# direct methods
.method public synthetic constructor <init>(Lib2;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldb2;->α:I

    .line 2
    .line 3
    iput-object p1, p0, Ldb2;->β:Lib2;

    .line 4
    .line 5
    invoke-direct {p0}, Lm01;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lk01;)V
    .locals 1

    .line 1
    iget v0, p0, Ldb2;->α:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lm01;->afterHookedMethod(Lk01;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Ldb2;->β:Lib2;

    .line 14
    .line 15
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-static {p0, p1}, Lib2;->β(Lib2;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Ldb2;->β:Lib2;

    .line 25
    .line 26
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-static {p0, p1}, Lib2;->β(Lib2;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lk01;)V
    .locals 9

    .line 1
    iget v0, p0, Ldb2;->α:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lm01;->beforeHookedMethod(Lk01;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lib2;->τ()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object p0, p0, Ldb2;->β:Lib2;

    .line 21
    .line 22
    invoke-static {p0, p1}, Lib2;->γ(Lib2;Lk01;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-nez p0, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {p0}, Lib2;->κ([Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    if-nez p0, :cond_2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    sget-object v0, Lya2;->η:Lya2;

    .line 39
    .line 40
    const-string v1, "im"

    .line 41
    .line 42
    invoke-static {p1, v0, p0, v1}, Lib2;->λ(Lk01;Lya2;Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    return-void

    .line 46
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {}, Lib2;->τ()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    iget-object p0, p0, Ldb2;->β:Lib2;

    .line 57
    .line 58
    invoke-static {p0, p1}, Lib2;->γ(Lib2;Lk01;)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-nez p0, :cond_4

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_4
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 66
    .line 67
    invoke-static {p0}, Lib2;->κ([Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    if-nez p0, :cond_5

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_5
    sget-object v0, Lya2;->η:Lya2;

    .line 75
    .line 76
    const-string v1, "im-runtime"

    .line 77
    .line 78
    invoke-static {p1, v0, p0, v1}, Lib2;->λ(Lk01;Lya2;Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :goto_1
    return-void

    .line 82
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-static {}, Lib2;->τ()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_6

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_6
    iget-object p0, p0, Ldb2;->β:Lib2;

    .line 93
    .line 94
    invoke-static {p0, p1}, Lib2;->γ(Lib2;Lk01;)Z

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    if-nez p0, :cond_7

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_7
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 102
    .line 103
    invoke-static {p0}, Lib2;->κ([Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    if-nez p0, :cond_8

    .line 108
    .line 109
    const-string p0, "rb360b99c73f2f647"

    .line 110
    .line 111
    const-string p1, "skip comment voice replace: info arg missing"

    .line 112
    .line 113
    invoke-static {p0, p1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_8
    sget-object v0, Lya2;->ζ:Lya2;

    .line 118
    .line 119
    const-string v1, "comment"

    .line 120
    .line 121
    invoke-static {p1, v0, p0, v1}, Lib2;->λ(Lk01;Lya2;Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    :goto_2
    return-void

    .line 125
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    iget-object p1, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    const/4 v0, 0x0

    .line 134
    invoke-static {v0, p1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    if-nez p1, :cond_9

    .line 139
    .line 140
    goto/16 :goto_9

    .line 141
    .line 142
    :cond_9
    iget-object p0, p0, Ldb2;->β:Lib2;

    .line 143
    .line 144
    invoke-static {p0, p1}, Lib2;->α(Lib2;Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    new-instance v2, Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 161
    .line 162
    .line 163
    array-length v3, v1

    .line 164
    move v4, v0

    .line 165
    :goto_3
    const/4 v5, 0x1

    .line 166
    if-ge v4, v3, :cond_b

    .line 167
    .line 168
    aget-object v6, v1, v4

    .line 169
    .line 170
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 171
    .line 172
    .line 173
    move-result v7

    .line 174
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 175
    .line 176
    .line 177
    move-result v7

    .line 178
    if-nez v7, :cond_a

    .line 179
    .line 180
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 181
    .line 182
    .line 183
    move-result v7

    .line 184
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 185
    .line 186
    .line 187
    move-result v7

    .line 188
    if-nez v7, :cond_a

    .line 189
    .line 190
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 191
    .line 192
    .line 193
    move-result v7

    .line 194
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isNative(I)Z

    .line 195
    .line 196
    .line 197
    move-result v7

    .line 198
    if-nez v7, :cond_a

    .line 199
    .line 200
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    sget-object v8, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 205
    .line 206
    invoke-static {v7, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v7

    .line 210
    if-eqz v7, :cond_a

    .line 211
    .line 212
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    move-result-object v7

    .line 216
    array-length v7, v7

    .line 217
    if-ne v7, v5, :cond_a

    .line 218
    .line 219
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    aget-object v5, v5, v0

    .line 224
    .line 225
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    invoke-static {v5}, Lib2;->θ(Ljava/lang/Class;)Lra2;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    if-eqz v5, :cond_a

    .line 233
    .line 234
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    goto :goto_4

    .line 238
    :catchall_0
    move-exception p0

    .line 239
    goto :goto_7

    .line 240
    :cond_a
    :goto_4
    add-int/lit8 v4, v4, 0x1

    .line 241
    .line 242
    goto :goto_3

    .line 243
    :cond_b
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    if-eqz v1, :cond_c

    .line 252
    .line 253
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    check-cast v1, Ljava/lang/reflect/Method;

    .line 258
    .line 259
    invoke-virtual {v1, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 260
    .line 261
    .line 262
    goto :goto_5

    .line 263
    :cond_c
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    if-nez v0, :cond_d

    .line 268
    .line 269
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    if-eqz v1, :cond_d

    .line 278
    .line 279
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    check-cast v1, Ljava/lang/reflect/Method;

    .line 284
    .line 285
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    new-instance v2, Lia2;

    .line 289
    .line 290
    const/4 v3, 0x0

    .line 291
    invoke-direct {v2, p0, v3}, Lia2;-><init>(Lib2;I)V

    .line 292
    .line 293
    .line 294
    invoke-static {v1, v2}, Lib2;->μ(Ljava/lang/reflect/Method;Lp70;)V

    .line 295
    .line 296
    .line 297
    goto :goto_6

    .line 298
    :cond_d
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 299
    .line 300
    goto :goto_8

    .line 301
    :goto_7
    new-instance v0, Leo1;

    .line 302
    .line 303
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 304
    .line 305
    .line 306
    move-object p0, v0

    .line 307
    :goto_8
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    if-eqz p0, :cond_e

    .line 312
    .line 313
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    const-string v0, "install comment audio event consumer hook failed "

    .line 318
    .line 319
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    const-string v0, "rb360b99c73f2f647"

    .line 324
    .line 325
    invoke-static {v0, p1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 326
    .line 327
    .line 328
    :cond_e
    :goto_9
    return-void

    .line 329
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    iget-object p1, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 333
    .line 334
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    const/4 v0, 0x0

    .line 338
    invoke-static {v0, p1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object p1

    .line 342
    if-nez p1, :cond_f

    .line 343
    .line 344
    goto :goto_a

    .line 345
    :cond_f
    iget-object p0, p0, Ldb2;->β:Lib2;

    .line 346
    .line 347
    invoke-static {p0, p1}, Lib2;->α(Lib2;Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    :goto_a
    return-void

    .line 351
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
