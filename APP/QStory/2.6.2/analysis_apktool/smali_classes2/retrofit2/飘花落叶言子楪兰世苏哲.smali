.class public abstract Lretrofit2/飘花落叶言子楪兰世苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:Lretrofit2/飘花落叶言子楪哲世兰苏;

.field public final 飘花落叶言子楪世苏兰哲:L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;

.field public final 飘花落叶言子楪世苏哲兰:Lretrofit2/飘花落叶言子世兰楪苏哲;


# direct methods
.method public constructor <init>(Lretrofit2/飘花落叶言子世兰楪苏哲;L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;Lretrofit2/飘花落叶言子楪哲世兰苏;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lretrofit2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰:Lretrofit2/飘花落叶言子世兰楪苏哲;

    .line 5
    .line 6
    iput-object p2, p0, Lretrofit2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;

    .line 7
    .line 8
    iput-object p3, p0, Lretrofit2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:Lretrofit2/飘花落叶言子楪哲世兰苏;

    .line 9
    .line 10
    return-void
.end method

.method public static 飘花落叶言子楪世苏兰哲(Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;Ljava/lang/Class;Ljava/lang/reflect/Method;)Lretrofit2/飘花落叶言子楪兰世苏哲;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    new-instance v2, Lretrofit2/飘花落叶言子世哲兰苏楪;

    .line 6
    .line 7
    move-object/from16 v3, p1

    .line 8
    .line 9
    invoke-direct {v2, v0, v3, v1}, Lretrofit2/飘花落叶言子世哲兰苏楪;-><init>(Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    .line 10
    .line 11
    .line 12
    iget-object v3, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲兰苏:[Ljava/lang/annotation/Annotation;

    .line 13
    .line 14
    array-length v4, v3

    .line 15
    const/4 v5, 0x0

    .line 16
    move v6, v5

    .line 17
    :goto_0
    const-string v7, "HEAD"

    .line 18
    .line 19
    const/4 v8, 0x1

    .line 20
    const/4 v9, 0x0

    .line 21
    if-ge v6, v4, :cond_12

    .line 22
    .line 23
    aget-object v10, v3, v6

    .line 24
    .line 25
    instance-of v11, v10, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪世苏兰哲;

    .line 26
    .line 27
    if-eqz v11, :cond_0

    .line 28
    .line 29
    check-cast v10, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪世苏兰哲;

    .line 30
    .line 31
    invoke-interface {v10}, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪世苏兰哲;->value()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    const-string v8, "DELETE"

    .line 36
    .line 37
    invoke-virtual {v2, v8, v7, v5}, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_3

    .line 41
    .line 42
    :cond_0
    instance-of v11, v10, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪世兰哲苏;

    .line 43
    .line 44
    if-eqz v11, :cond_1

    .line 45
    .line 46
    check-cast v10, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪世兰哲苏;

    .line 47
    .line 48
    invoke-interface {v10}, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪世兰哲苏;->value()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    const-string v8, "GET"

    .line 53
    .line 54
    invoke-virtual {v2, v8, v7, v5}, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_3

    .line 58
    .line 59
    :cond_1
    instance-of v11, v10, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪苏世哲兰;

    .line 60
    .line 61
    if-eqz v11, :cond_2

    .line 62
    .line 63
    check-cast v10, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪苏世哲兰;

    .line 64
    .line 65
    invoke-interface {v10}, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪苏世哲兰;->value()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    invoke-virtual {v2, v7, v8, v5}, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 70
    .line 71
    .line 72
    goto/16 :goto_3

    .line 73
    .line 74
    :cond_2
    instance-of v7, v10, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪哲世兰苏;

    .line 75
    .line 76
    if-eqz v7, :cond_3

    .line 77
    .line 78
    check-cast v10, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪哲世兰苏;

    .line 79
    .line 80
    invoke-interface {v10}, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪哲世兰苏;->value()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    const-string v9, "PATCH"

    .line 85
    .line 86
    invoke-virtual {v2, v9, v7, v8}, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 87
    .line 88
    .line 89
    goto/16 :goto_3

    .line 90
    .line 91
    :cond_3
    instance-of v7, v10, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪哲苏世兰;

    .line 92
    .line 93
    if-eqz v7, :cond_4

    .line 94
    .line 95
    check-cast v10, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪哲苏世兰;

    .line 96
    .line 97
    invoke-interface {v10}, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪哲苏世兰;->value()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    const-string v9, "POST"

    .line 102
    .line 103
    invoke-virtual {v2, v9, v7, v8}, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 104
    .line 105
    .line 106
    goto/16 :goto_3

    .line 107
    .line 108
    :cond_4
    instance-of v7, v10, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪哲苏兰世;

    .line 109
    .line 110
    if-eqz v7, :cond_5

    .line 111
    .line 112
    check-cast v10, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪哲苏兰世;

    .line 113
    .line 114
    invoke-interface {v10}, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪哲苏兰世;->value()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    const-string v9, "PUT"

    .line 119
    .line 120
    invoke-virtual {v2, v9, v7, v8}, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 121
    .line 122
    .line 123
    goto/16 :goto_3

    .line 124
    .line 125
    :cond_5
    instance-of v7, v10, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪哲世苏兰;

    .line 126
    .line 127
    if-eqz v7, :cond_6

    .line 128
    .line 129
    check-cast v10, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪哲世苏兰;

    .line 130
    .line 131
    invoke-interface {v10}, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪哲世苏兰;->value()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    const-string v8, "OPTIONS"

    .line 136
    .line 137
    invoke-virtual {v2, v8, v7, v5}, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 138
    .line 139
    .line 140
    goto/16 :goto_3

    .line 141
    .line 142
    :cond_6
    instance-of v7, v10, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪苏世兰哲;

    .line 143
    .line 144
    if-eqz v7, :cond_7

    .line 145
    .line 146
    check-cast v10, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪苏世兰哲;

    .line 147
    .line 148
    invoke-interface {v10}, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪苏世兰哲;->method()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    invoke-interface {v10}, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪苏世兰哲;->path()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v8

    .line 156
    invoke-interface {v10}, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪苏世兰哲;->hasBody()Z

    .line 157
    .line 158
    .line 159
    move-result v9

    .line 160
    invoke-virtual {v2, v7, v8, v9}, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 161
    .line 162
    .line 163
    goto/16 :goto_3

    .line 164
    .line 165
    :cond_7
    instance-of v7, v10, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪苏兰世哲;

    .line 166
    .line 167
    if-eqz v7, :cond_d

    .line 168
    .line 169
    check-cast v10, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪苏兰世哲;

    .line 170
    .line 171
    invoke-interface {v10}, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪苏兰世哲;->value()[Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    array-length v11, v7

    .line 176
    if-eqz v11, :cond_c

    .line 177
    .line 178
    invoke-interface {v10}, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪苏兰世哲;->allowUnsafeNonAsciiValues()Z

    .line 179
    .line 180
    .line 181
    move-result v10

    .line 182
    new-instance v11, Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;

    .line 183
    .line 184
    const/4 v12, 0x6

    .line 185
    invoke-direct {v11, v12, v5}, Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;-><init>(IZ)V

    .line 186
    .line 187
    .line 188
    array-length v12, v7

    .line 189
    move v13, v5

    .line 190
    :goto_1
    if-ge v13, v12, :cond_b

    .line 191
    .line 192
    aget-object v14, v7, v13

    .line 193
    .line 194
    const/16 v15, 0x3a

    .line 195
    .line 196
    invoke-virtual {v14, v15}, Ljava/lang/String;->indexOf(I)I

    .line 197
    .line 198
    .line 199
    move-result v15

    .line 200
    move/from16 p1, v8

    .line 201
    .line 202
    const/4 v8, -0x1

    .line 203
    if-eq v15, v8, :cond_a

    .line 204
    .line 205
    if-eqz v15, :cond_a

    .line 206
    .line 207
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 208
    .line 209
    .line 210
    move-result v8

    .line 211
    add-int/lit8 v8, v8, -0x1

    .line 212
    .line 213
    if-eq v15, v8, :cond_a

    .line 214
    .line 215
    invoke-virtual {v14, v5, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v8

    .line 219
    add-int/lit8 v15, v15, 0x1

    .line 220
    .line 221
    invoke-virtual {v14, v15}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v14

    .line 225
    invoke-virtual {v14}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v14

    .line 229
    const-string v15, "Content-Type"

    .line 230
    .line 231
    invoke-virtual {v15, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 232
    .line 233
    .line 234
    move-result v15

    .line 235
    if-eqz v15, :cond_8

    .line 236
    .line 237
    :try_start_0
    sget-object v8, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲兰苏:Lkotlin/text/Regex;

    .line 238
    .line 239
    invoke-static {v14}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰苏世哲;

    .line 240
    .line 241
    .line 242
    move-result-object v8

    .line 243
    iput-object v8, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪兰苏世哲:L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰苏世哲;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 244
    .line 245
    goto :goto_2

    .line 246
    :catch_0
    move-exception v0

    .line 247
    const-string v2, "Malformed content type: %s"

    .line 248
    .line 249
    filled-new-array {v14}, [Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    invoke-static {v1, v0, v2, v3}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世苏兰(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    throw v0

    .line 258
    :cond_8
    if-eqz v10, :cond_9

    .line 259
    .line 260
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    invoke-static {v8}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子世哲兰楪苏(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    invoke-static {v11, v8, v14}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世(Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;Ljava/lang/String;Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    goto :goto_2

    .line 270
    :cond_9
    invoke-virtual {v11, v8, v14}, Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    :goto_2
    add-int/lit8 v13, v13, 0x1

    .line 274
    .line 275
    move/from16 v8, p1

    .line 276
    .line 277
    goto :goto_1

    .line 278
    :cond_a
    const-string v0, "@Headers value must be in the form \"Name: Value\". Found: \"%s\""

    .line 279
    .line 280
    filled-new-array {v14}, [Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    invoke-static {v1, v9, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世苏兰(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    throw v0

    .line 289
    :cond_b
    invoke-virtual {v11}, Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏()L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲苏兰世;

    .line 290
    .line 291
    .line 292
    move-result-object v7

    .line 293
    iput-object v7, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪兰世哲苏:L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲苏兰世;

    .line 294
    .line 295
    goto :goto_3

    .line 296
    :cond_c
    const-string v0, "@Headers annotation is empty."

    .line 297
    .line 298
    new-array v2, v5, [Ljava/lang/Object;

    .line 299
    .line 300
    invoke-static {v1, v9, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世苏兰(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    throw v0

    .line 305
    :cond_d
    move/from16 p1, v8

    .line 306
    .line 307
    instance-of v7, v10, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪苏兰哲世;

    .line 308
    .line 309
    const-string v8, "Only one encoding annotation is allowed."

    .line 310
    .line 311
    if-eqz v7, :cond_f

    .line 312
    .line 313
    iget-boolean v7, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲兰世苏:Z

    .line 314
    .line 315
    if-nez v7, :cond_e

    .line 316
    .line 317
    move/from16 v7, p1

    .line 318
    .line 319
    iput-boolean v7, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲兰苏世:Z

    .line 320
    .line 321
    goto :goto_3

    .line 322
    :cond_e
    new-array v0, v5, [Ljava/lang/Object;

    .line 323
    .line 324
    invoke-static {v1, v9, v8, v0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世苏兰(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    throw v0

    .line 329
    :cond_f
    move/from16 v7, p1

    .line 330
    .line 331
    instance-of v10, v10, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪世兰苏哲;

    .line 332
    .line 333
    if-eqz v10, :cond_11

    .line 334
    .line 335
    iget-boolean v10, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲兰苏世:Z

    .line 336
    .line 337
    if-nez v10, :cond_10

    .line 338
    .line 339
    iput-boolean v7, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲兰世苏:Z

    .line 340
    .line 341
    goto :goto_3

    .line 342
    :cond_10
    new-array v0, v5, [Ljava/lang/Object;

    .line 343
    .line 344
    invoke-static {v1, v9, v8, v0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世苏兰(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    throw v0

    .line 349
    :cond_11
    :goto_3
    add-int/lit8 v6, v6, 0x1

    .line 350
    .line 351
    goto/16 :goto_0

    .line 352
    .line 353
    :cond_12
    iget-object v4, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲苏世兰:Ljava/lang/String;

    .line 354
    .line 355
    if-eqz v4, :cond_80

    .line 356
    .line 357
    iget-boolean v4, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲苏兰世:Z

    .line 358
    .line 359
    if-nez v4, :cond_15

    .line 360
    .line 361
    iget-boolean v4, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲兰苏世:Z

    .line 362
    .line 363
    if-nez v4, :cond_14

    .line 364
    .line 365
    iget-boolean v4, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲兰世苏:Z

    .line 366
    .line 367
    if-nez v4, :cond_13

    .line 368
    .line 369
    goto :goto_4

    .line 370
    :cond_13
    const-string v0, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST)."

    .line 371
    .line 372
    new-array v2, v5, [Ljava/lang/Object;

    .line 373
    .line 374
    invoke-static {v1, v9, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世苏兰(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    throw v0

    .line 379
    :cond_14
    const-string v0, "Multipart can only be specified on HTTP methods with request body (e.g., @POST)."

    .line 380
    .line 381
    new-array v2, v5, [Ljava/lang/Object;

    .line 382
    .line 383
    invoke-static {v1, v9, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世苏兰(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    throw v0

    .line 388
    :cond_15
    :goto_4
    iget-object v4, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰苏哲:[[Ljava/lang/annotation/Annotation;

    .line 389
    .line 390
    array-length v6, v4

    .line 391
    new-array v8, v6, [Lretrofit2/飘花落叶言子楪兰哲世苏;

    .line 392
    .line 393
    iput-object v8, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪兰哲世苏:[Lretrofit2/飘花落叶言子楪兰哲世苏;

    .line 394
    .line 395
    add-int/lit8 v8, v6, -0x1

    .line 396
    .line 397
    move v10, v5

    .line 398
    :goto_5
    if-ge v10, v6, :cond_69

    .line 399
    .line 400
    iget-object v11, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪兰哲世苏:[Lretrofit2/飘花落叶言子楪兰哲世苏;

    .line 401
    .line 402
    iget-object v12, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰哲苏:[Ljava/lang/reflect/Type;

    .line 403
    .line 404
    aget-object v12, v12, v10

    .line 405
    .line 406
    aget-object v13, v4, v10

    .line 407
    .line 408
    if-ne v10, v8, :cond_16

    .line 409
    .line 410
    const/4 v14, 0x1

    .line 411
    goto :goto_6

    .line 412
    :cond_16
    move v14, v5

    .line 413
    :goto_6
    if-eqz v13, :cond_66

    .line 414
    .line 415
    array-length v15, v13

    .line 416
    move-object/from16 v16, v9

    .line 417
    .line 418
    move v9, v5

    .line 419
    :goto_7
    if-ge v9, v15, :cond_65

    .line 420
    .line 421
    aget-object v5, v13, v9

    .line 422
    .line 423
    move-object/from16 v17, v4

    .line 424
    .line 425
    instance-of v4, v5, L飘花落叶言苏楪世子哲兰/飘花落叶言子世楪苏哲兰;

    .line 426
    .line 427
    move/from16 v18, v4

    .line 428
    .line 429
    const-string v4, "@Path parameters may not be used with @Url."

    .line 430
    .line 431
    move/from16 v19, v6

    .line 432
    .line 433
    const-class v6, Ljava/lang/String;

    .line 434
    .line 435
    if-eqz v18, :cond_1f

    .line 436
    .line 437
    invoke-virtual {v2, v10, v12}, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲苏兰(ILjava/lang/reflect/Type;)V

    .line 438
    .line 439
    .line 440
    iget-boolean v5, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲世兰苏:Z

    .line 441
    .line 442
    if-nez v5, :cond_1e

    .line 443
    .line 444
    iget-boolean v5, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世:Z

    .line 445
    .line 446
    if-nez v5, :cond_1d

    .line 447
    .line 448
    iget-boolean v4, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰世哲:Z

    .line 449
    .line 450
    if-nez v4, :cond_1c

    .line 451
    .line 452
    iget-boolean v4, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰哲世:Z

    .line 453
    .line 454
    if-nez v4, :cond_1b

    .line 455
    .line 456
    iget-boolean v4, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲世苏兰:Z

    .line 457
    .line 458
    if-nez v4, :cond_1a

    .line 459
    .line 460
    iget-object v4, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪兰世苏哲:Ljava/lang/String;

    .line 461
    .line 462
    if-nez v4, :cond_19

    .line 463
    .line 464
    const/4 v4, 0x1

    .line 465
    iput-boolean v4, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲世兰苏:Z

    .line 466
    .line 467
    const-class v4, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲兰苏世;

    .line 468
    .line 469
    if-eq v12, v4, :cond_18

    .line 470
    .line 471
    if-eq v12, v6, :cond_18

    .line 472
    .line 473
    const-class v4, Ljava/net/URI;

    .line 474
    .line 475
    if-eq v12, v4, :cond_18

    .line 476
    .line 477
    instance-of v4, v12, Ljava/lang/Class;

    .line 478
    .line 479
    if-eqz v4, :cond_17

    .line 480
    .line 481
    move-object v4, v12

    .line 482
    check-cast v4, Ljava/lang/Class;

    .line 483
    .line 484
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v4

    .line 488
    const-string v5, "android.net.Uri"

    .line 489
    .line 490
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 491
    .line 492
    .line 493
    move-result v4

    .line 494
    if-eqz v4, :cond_17

    .line 495
    .line 496
    goto :goto_8

    .line 497
    :cond_17
    const-string v0, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type."

    .line 498
    .line 499
    const/4 v2, 0x0

    .line 500
    new-array v2, v2, [Ljava/lang/Object;

    .line 501
    .line 502
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    throw v0

    .line 507
    :cond_18
    :goto_8
    new-instance v4, Lretrofit2/飘花落叶言子世苏楪兰哲;

    .line 508
    .line 509
    const/4 v5, 0x1

    .line 510
    invoke-direct {v4, v1, v10, v5}, Lretrofit2/飘花落叶言子世苏楪兰哲;-><init>(Ljava/lang/reflect/Method;II)V

    .line 511
    .line 512
    .line 513
    move-object/from16 v21, v7

    .line 514
    .line 515
    move/from16 v18, v8

    .line 516
    .line 517
    :goto_9
    move/from16 v22, v9

    .line 518
    .line 519
    move-object/from16 v23, v11

    .line 520
    .line 521
    move/from16 v20, v14

    .line 522
    .line 523
    move/from16 v24, v15

    .line 524
    .line 525
    goto/16 :goto_10

    .line 526
    .line 527
    :cond_19
    iget-object v0, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲苏世兰:Ljava/lang/String;

    .line 528
    .line 529
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    const-string v2, "@Url cannot be used with @%s URL"

    .line 534
    .line 535
    invoke-static {v1, v10, v2, v0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    throw v0

    .line 540
    :cond_1a
    const-string v0, "A @Url parameter must not come after a @QueryMap."

    .line 541
    .line 542
    const/4 v2, 0x0

    .line 543
    new-array v2, v2, [Ljava/lang/Object;

    .line 544
    .line 545
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    throw v0

    .line 550
    :cond_1b
    const/4 v2, 0x0

    .line 551
    const-string v0, "A @Url parameter must not come after a @QueryName."

    .line 552
    .line 553
    new-array v2, v2, [Ljava/lang/Object;

    .line 554
    .line 555
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    throw v0

    .line 560
    :cond_1c
    const/4 v2, 0x0

    .line 561
    const-string v0, "A @Url parameter must not come after a @Query."

    .line 562
    .line 563
    new-array v2, v2, [Ljava/lang/Object;

    .line 564
    .line 565
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    throw v0

    .line 570
    :cond_1d
    const/4 v2, 0x0

    .line 571
    new-array v0, v2, [Ljava/lang/Object;

    .line 572
    .line 573
    invoke-static {v1, v10, v4, v0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    throw v0

    .line 578
    :cond_1e
    const/4 v2, 0x0

    .line 579
    const-string v0, "Multiple @Url method annotations found."

    .line 580
    .line 581
    new-array v2, v2, [Ljava/lang/Object;

    .line 582
    .line 583
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    throw v0

    .line 588
    :cond_1f
    move/from16 v18, v8

    .line 589
    .line 590
    instance-of v8, v5, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪兰世苏哲;

    .line 591
    .line 592
    move/from16 v20, v8

    .line 593
    .line 594
    iget-object v8, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;

    .line 595
    .line 596
    if-eqz v20, :cond_27

    .line 597
    .line 598
    invoke-virtual {v2, v10, v12}, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲苏兰(ILjava/lang/reflect/Type;)V

    .line 599
    .line 600
    .line 601
    iget-boolean v6, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰世哲:Z

    .line 602
    .line 603
    if-nez v6, :cond_26

    .line 604
    .line 605
    iget-boolean v6, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰哲世:Z

    .line 606
    .line 607
    if-nez v6, :cond_25

    .line 608
    .line 609
    iget-boolean v6, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲世苏兰:Z

    .line 610
    .line 611
    if-nez v6, :cond_24

    .line 612
    .line 613
    iget-boolean v6, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲世兰苏:Z

    .line 614
    .line 615
    if-nez v6, :cond_23

    .line 616
    .line 617
    iget-object v4, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪兰世苏哲:Ljava/lang/String;

    .line 618
    .line 619
    if-eqz v4, :cond_22

    .line 620
    .line 621
    const/4 v4, 0x1

    .line 622
    iput-boolean v4, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世:Z

    .line 623
    .line 624
    check-cast v5, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪兰世苏哲;

    .line 625
    .line 626
    invoke-interface {v5}, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪兰世苏哲;->value()Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v4

    .line 630
    sget-object v6, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子世楪苏兰哲:Ljava/util/regex/Pattern;

    .line 631
    .line 632
    invoke-virtual {v6, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 633
    .line 634
    .line 635
    move-result-object v6

    .line 636
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->matches()Z

    .line 637
    .line 638
    .line 639
    move-result v6

    .line 640
    if-eqz v6, :cond_21

    .line 641
    .line 642
    iget-object v6, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪兰苏哲世:Ljava/util/LinkedHashSet;

    .line 643
    .line 644
    invoke-interface {v6, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 645
    .line 646
    .line 647
    move-result v6

    .line 648
    if-eqz v6, :cond_20

    .line 649
    .line 650
    invoke-virtual {v8, v12, v13}, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 651
    .line 652
    .line 653
    new-instance v6, Lretrofit2/飘花落叶言子世苏哲兰楪;

    .line 654
    .line 655
    iget-object v8, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/reflect/Method;

    .line 656
    .line 657
    invoke-interface {v5}, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪兰世苏哲;->encoded()Z

    .line 658
    .line 659
    .line 660
    move-result v5

    .line 661
    invoke-direct {v6, v8, v10, v4, v5}, Lretrofit2/飘花落叶言子世苏哲兰楪;-><init>(Ljava/lang/reflect/Method;ILjava/lang/String;Z)V

    .line 662
    .line 663
    .line 664
    move-object v4, v6

    .line 665
    move-object/from16 v21, v7

    .line 666
    .line 667
    goto/16 :goto_9

    .line 668
    .line 669
    :cond_20
    iget-object v0, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪兰世苏哲:Ljava/lang/String;

    .line 670
    .line 671
    filled-new-array {v0, v4}, [Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v0

    .line 675
    const-string v2, "URL \"%s\" does not contain \"{%s}\"."

    .line 676
    .line 677
    invoke-static {v1, v10, v2, v0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    throw v0

    .line 682
    :cond_21
    sget-object v0, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子世楪苏哲兰:Ljava/util/regex/Pattern;

    .line 683
    .line 684
    invoke-virtual {v0}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    filled-new-array {v0, v4}, [Ljava/lang/Object;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    const-string v2, "@Path parameter name must match %s. Found: %s"

    .line 693
    .line 694
    invoke-static {v1, v10, v2, v0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 695
    .line 696
    .line 697
    move-result-object v0

    .line 698
    throw v0

    .line 699
    :cond_22
    iget-object v0, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲苏世兰:Ljava/lang/String;

    .line 700
    .line 701
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 702
    .line 703
    .line 704
    move-result-object v0

    .line 705
    const-string v2, "@Path can only be used with relative url on @%s"

    .line 706
    .line 707
    invoke-static {v1, v10, v2, v0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 708
    .line 709
    .line 710
    move-result-object v0

    .line 711
    throw v0

    .line 712
    :cond_23
    const/4 v2, 0x0

    .line 713
    new-array v0, v2, [Ljava/lang/Object;

    .line 714
    .line 715
    invoke-static {v1, v10, v4, v0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    throw v0

    .line 720
    :cond_24
    const/4 v2, 0x0

    .line 721
    const-string v0, "A @Path parameter must not come after a @QueryMap."

    .line 722
    .line 723
    new-array v2, v2, [Ljava/lang/Object;

    .line 724
    .line 725
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 726
    .line 727
    .line 728
    move-result-object v0

    .line 729
    throw v0

    .line 730
    :cond_25
    const/4 v2, 0x0

    .line 731
    const-string v0, "A @Path parameter must not come after a @QueryName."

    .line 732
    .line 733
    new-array v2, v2, [Ljava/lang/Object;

    .line 734
    .line 735
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    throw v0

    .line 740
    :cond_26
    const/4 v2, 0x0

    .line 741
    const-string v0, "A @Path parameter must not come after a @Query."

    .line 742
    .line 743
    new-array v2, v2, [Ljava/lang/Object;

    .line 744
    .line 745
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    throw v0

    .line 750
    :cond_27
    instance-of v4, v5, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪兰世哲苏;

    .line 751
    .line 752
    move/from16 v20, v4

    .line 753
    .line 754
    const-string v4, "<String>)"

    .line 755
    .line 756
    move/from16 v22, v9

    .line 757
    .line 758
    const-string v9, " must include generic type (e.g., "

    .line 759
    .line 760
    move-object/from16 v23, v11

    .line 761
    .line 762
    const-class v11, Ljava/lang/Iterable;

    .line 763
    .line 764
    if-eqz v20, :cond_2b

    .line 765
    .line 766
    invoke-virtual {v2, v10, v12}, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲苏兰(ILjava/lang/reflect/Type;)V

    .line 767
    .line 768
    .line 769
    check-cast v5, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪兰世哲苏;

    .line 770
    .line 771
    invoke-interface {v5}, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪兰世哲苏;->value()Ljava/lang/String;

    .line 772
    .line 773
    .line 774
    move-result-object v6

    .line 775
    invoke-interface {v5}, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪兰世哲苏;->encoded()Z

    .line 776
    .line 777
    .line 778
    move-result v5

    .line 779
    move/from16 v20, v14

    .line 780
    .line 781
    invoke-static {v12}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 782
    .line 783
    .line 784
    move-result-object v14

    .line 785
    move/from16 v24, v15

    .line 786
    .line 787
    const/4 v15, 0x1

    .line 788
    iput-boolean v15, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰世哲:Z

    .line 789
    .line 790
    invoke-virtual {v11, v14}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 791
    .line 792
    .line 793
    move-result v11

    .line 794
    if-eqz v11, :cond_29

    .line 795
    .line 796
    instance-of v11, v12, Ljava/lang/reflect/ParameterizedType;

    .line 797
    .line 798
    if-eqz v11, :cond_28

    .line 799
    .line 800
    move-object v4, v12

    .line 801
    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    .line 802
    .line 803
    const/4 v11, 0x0

    .line 804
    invoke-static {v11, v4}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世哲兰(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 805
    .line 806
    .line 807
    move-result-object v4

    .line 808
    invoke-virtual {v8, v4, v13}, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 809
    .line 810
    .line 811
    new-instance v4, Lretrofit2/飘花落叶言子世楪兰哲苏;

    .line 812
    .line 813
    const/4 v8, 0x2

    .line 814
    invoke-direct {v4, v8, v6, v5}, Lretrofit2/飘花落叶言子世楪兰哲苏;-><init>(ILjava/lang/String;Z)V

    .line 815
    .line 816
    .line 817
    new-instance v5, Lretrofit2/飘花落叶言子世楪哲兰苏;

    .line 818
    .line 819
    invoke-direct {v5, v4, v11}, Lretrofit2/飘花落叶言子世楪哲兰苏;-><init>(Lretrofit2/飘花落叶言子楪兰哲世苏;I)V

    .line 820
    .line 821
    .line 822
    :goto_a
    move-object v4, v5

    .line 823
    :goto_b
    move-object/from16 v21, v7

    .line 824
    .line 825
    goto/16 :goto_10

    .line 826
    .line 827
    :cond_28
    const/4 v11, 0x0

    .line 828
    new-instance v0, Ljava/lang/StringBuilder;

    .line 829
    .line 830
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 831
    .line 832
    .line 833
    invoke-virtual {v14}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 834
    .line 835
    .line 836
    move-result-object v2

    .line 837
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 838
    .line 839
    .line 840
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 841
    .line 842
    .line 843
    invoke-virtual {v14}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 844
    .line 845
    .line 846
    move-result-object v2

    .line 847
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 848
    .line 849
    .line 850
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 851
    .line 852
    .line 853
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 854
    .line 855
    .line 856
    move-result-object v0

    .line 857
    new-array v2, v11, [Ljava/lang/Object;

    .line 858
    .line 859
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 860
    .line 861
    .line 862
    move-result-object v0

    .line 863
    throw v0

    .line 864
    :cond_29
    invoke-virtual {v14}, Ljava/lang/Class;->isArray()Z

    .line 865
    .line 866
    .line 867
    move-result v4

    .line 868
    if-eqz v4, :cond_2a

    .line 869
    .line 870
    invoke-virtual {v14}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 871
    .line 872
    .line 873
    move-result-object v4

    .line 874
    invoke-static {v4}, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Ljava/lang/Class;

    .line 875
    .line 876
    .line 877
    move-result-object v4

    .line 878
    invoke-virtual {v8, v4, v13}, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 879
    .line 880
    .line 881
    new-instance v4, Lretrofit2/飘花落叶言子世楪兰哲苏;

    .line 882
    .line 883
    const/4 v9, 0x2

    .line 884
    invoke-direct {v4, v9, v6, v5}, Lretrofit2/飘花落叶言子世楪兰哲苏;-><init>(ILjava/lang/String;Z)V

    .line 885
    .line 886
    .line 887
    new-instance v5, Lretrofit2/飘花落叶言子世楪哲兰苏;

    .line 888
    .line 889
    const/4 v15, 0x1

    .line 890
    invoke-direct {v5, v4, v15}, Lretrofit2/飘花落叶言子世楪哲兰苏;-><init>(Lretrofit2/飘花落叶言子楪兰哲世苏;I)V

    .line 891
    .line 892
    .line 893
    goto :goto_a

    .line 894
    :cond_2a
    const/4 v9, 0x2

    .line 895
    invoke-virtual {v8, v12, v13}, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 896
    .line 897
    .line 898
    new-instance v4, Lretrofit2/飘花落叶言子世楪兰哲苏;

    .line 899
    .line 900
    invoke-direct {v4, v9, v6, v5}, Lretrofit2/飘花落叶言子世楪兰哲苏;-><init>(ILjava/lang/String;Z)V

    .line 901
    .line 902
    .line 903
    goto :goto_b

    .line 904
    :cond_2b
    move/from16 v20, v14

    .line 905
    .line 906
    move/from16 v24, v15

    .line 907
    .line 908
    instance-of v14, v5, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪兰苏哲世;

    .line 909
    .line 910
    if-eqz v14, :cond_2f

    .line 911
    .line 912
    invoke-virtual {v2, v10, v12}, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲苏兰(ILjava/lang/reflect/Type;)V

    .line 913
    .line 914
    .line 915
    check-cast v5, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪兰苏哲世;

    .line 916
    .line 917
    invoke-interface {v5}, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪兰苏哲世;->encoded()Z

    .line 918
    .line 919
    .line 920
    move-result v5

    .line 921
    invoke-static {v12}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 922
    .line 923
    .line 924
    move-result-object v6

    .line 925
    const/4 v15, 0x1

    .line 926
    iput-boolean v15, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰哲世:Z

    .line 927
    .line 928
    invoke-virtual {v11, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 929
    .line 930
    .line 931
    move-result v11

    .line 932
    if-eqz v11, :cond_2d

    .line 933
    .line 934
    instance-of v11, v12, Ljava/lang/reflect/ParameterizedType;

    .line 935
    .line 936
    if-eqz v11, :cond_2c

    .line 937
    .line 938
    move-object v4, v12

    .line 939
    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    .line 940
    .line 941
    const/4 v11, 0x0

    .line 942
    invoke-static {v11, v4}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世哲兰(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 943
    .line 944
    .line 945
    move-result-object v4

    .line 946
    invoke-virtual {v8, v4, v13}, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 947
    .line 948
    .line 949
    new-instance v4, Lretrofit2/飘花落叶言子世苏兰楪哲;

    .line 950
    .line 951
    invoke-direct {v4, v5}, Lretrofit2/飘花落叶言子世苏兰楪哲;-><init>(Z)V

    .line 952
    .line 953
    .line 954
    new-instance v5, Lretrofit2/飘花落叶言子世楪哲兰苏;

    .line 955
    .line 956
    invoke-direct {v5, v4, v11}, Lretrofit2/飘花落叶言子世楪哲兰苏;-><init>(Lretrofit2/飘花落叶言子楪兰哲世苏;I)V

    .line 957
    .line 958
    .line 959
    goto/16 :goto_a

    .line 960
    .line 961
    :cond_2c
    const/4 v11, 0x0

    .line 962
    new-instance v0, Ljava/lang/StringBuilder;

    .line 963
    .line 964
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 965
    .line 966
    .line 967
    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 968
    .line 969
    .line 970
    move-result-object v2

    .line 971
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 972
    .line 973
    .line 974
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 975
    .line 976
    .line 977
    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 978
    .line 979
    .line 980
    move-result-object v2

    .line 981
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 982
    .line 983
    .line 984
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 985
    .line 986
    .line 987
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 988
    .line 989
    .line 990
    move-result-object v0

    .line 991
    new-array v2, v11, [Ljava/lang/Object;

    .line 992
    .line 993
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 994
    .line 995
    .line 996
    move-result-object v0

    .line 997
    throw v0

    .line 998
    :cond_2d
    invoke-virtual {v6}, Ljava/lang/Class;->isArray()Z

    .line 999
    .line 1000
    .line 1001
    move-result v4

    .line 1002
    if-eqz v4, :cond_2e

    .line 1003
    .line 1004
    invoke-virtual {v6}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v4

    .line 1008
    invoke-static {v4}, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Ljava/lang/Class;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v4

    .line 1012
    invoke-virtual {v8, v4, v13}, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 1013
    .line 1014
    .line 1015
    new-instance v4, Lretrofit2/飘花落叶言子世苏兰楪哲;

    .line 1016
    .line 1017
    invoke-direct {v4, v5}, Lretrofit2/飘花落叶言子世苏兰楪哲;-><init>(Z)V

    .line 1018
    .line 1019
    .line 1020
    new-instance v5, Lretrofit2/飘花落叶言子世楪哲兰苏;

    .line 1021
    .line 1022
    const/4 v15, 0x1

    .line 1023
    invoke-direct {v5, v4, v15}, Lretrofit2/飘花落叶言子世楪哲兰苏;-><init>(Lretrofit2/飘花落叶言子楪兰哲世苏;I)V

    .line 1024
    .line 1025
    .line 1026
    goto/16 :goto_a

    .line 1027
    .line 1028
    :cond_2e
    invoke-virtual {v8, v12, v13}, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 1029
    .line 1030
    .line 1031
    new-instance v4, Lretrofit2/飘花落叶言子世苏兰楪哲;

    .line 1032
    .line 1033
    invoke-direct {v4, v5}, Lretrofit2/飘花落叶言子世苏兰楪哲;-><init>(Z)V

    .line 1034
    .line 1035
    .line 1036
    goto/16 :goto_b

    .line 1037
    .line 1038
    :cond_2f
    instance-of v14, v5, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪兰苏世哲;

    .line 1039
    .line 1040
    const-string v15, "Map must include generic types (e.g., Map<String, String>)"

    .line 1041
    .line 1042
    move/from16 v25, v14

    .line 1043
    .line 1044
    const-class v14, Ljava/util/Map;

    .line 1045
    .line 1046
    if-eqz v25, :cond_33

    .line 1047
    .line 1048
    invoke-virtual {v2, v10, v12}, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲苏兰(ILjava/lang/reflect/Type;)V

    .line 1049
    .line 1050
    .line 1051
    invoke-static {v12}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v4

    .line 1055
    const/4 v9, 0x1

    .line 1056
    iput-boolean v9, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲世苏兰:Z

    .line 1057
    .line 1058
    invoke-virtual {v14, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1059
    .line 1060
    .line 1061
    move-result v11

    .line 1062
    if-eqz v11, :cond_32

    .line 1063
    .line 1064
    invoke-static {v4, v12}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v4

    .line 1068
    instance-of v11, v4, Ljava/lang/reflect/ParameterizedType;

    .line 1069
    .line 1070
    if-eqz v11, :cond_31

    .line 1071
    .line 1072
    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    .line 1073
    .line 1074
    const/4 v11, 0x0

    .line 1075
    invoke-static {v11, v4}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世哲兰(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v14

    .line 1079
    if-ne v6, v14, :cond_30

    .line 1080
    .line 1081
    invoke-static {v9, v4}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世哲兰(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v4

    .line 1085
    invoke-virtual {v8, v4, v13}, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 1086
    .line 1087
    .line 1088
    new-instance v4, Lretrofit2/飘花落叶言子世苏楪哲兰;

    .line 1089
    .line 1090
    check-cast v5, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪兰苏世哲;

    .line 1091
    .line 1092
    invoke-interface {v5}, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪兰苏世哲;->encoded()Z

    .line 1093
    .line 1094
    .line 1095
    move-result v5

    .line 1096
    const/4 v8, 0x2

    .line 1097
    invoke-direct {v4, v10, v8, v1, v5}, Lretrofit2/飘花落叶言子世苏楪哲兰;-><init>(IILjava/lang/reflect/Method;Z)V

    .line 1098
    .line 1099
    .line 1100
    goto/16 :goto_b

    .line 1101
    .line 1102
    :cond_30
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1103
    .line 1104
    const-string v2, "@QueryMap keys must be of type String: "

    .line 1105
    .line 1106
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1107
    .line 1108
    .line 1109
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1110
    .line 1111
    .line 1112
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v0

    .line 1116
    const/4 v2, 0x0

    .line 1117
    new-array v2, v2, [Ljava/lang/Object;

    .line 1118
    .line 1119
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v0

    .line 1123
    throw v0

    .line 1124
    :cond_31
    const/4 v2, 0x0

    .line 1125
    new-array v0, v2, [Ljava/lang/Object;

    .line 1126
    .line 1127
    invoke-static {v1, v10, v15, v0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v0

    .line 1131
    throw v0

    .line 1132
    :cond_32
    const/4 v2, 0x0

    .line 1133
    const-string v0, "@QueryMap parameter type must be Map."

    .line 1134
    .line 1135
    new-array v2, v2, [Ljava/lang/Object;

    .line 1136
    .line 1137
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v0

    .line 1141
    throw v0

    .line 1142
    :cond_33
    move-object/from16 v21, v7

    .line 1143
    .line 1144
    instance-of v7, v5, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪苏哲世兰;

    .line 1145
    .line 1146
    if-eqz v7, :cond_37

    .line 1147
    .line 1148
    invoke-virtual {v2, v10, v12}, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲苏兰(ILjava/lang/reflect/Type;)V

    .line 1149
    .line 1150
    .line 1151
    check-cast v5, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪苏哲世兰;

    .line 1152
    .line 1153
    invoke-interface {v5}, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪苏哲世兰;->value()Ljava/lang/String;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v6

    .line 1157
    invoke-static {v12}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v7

    .line 1161
    invoke-virtual {v11, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1162
    .line 1163
    .line 1164
    move-result v11

    .line 1165
    if-eqz v11, :cond_35

    .line 1166
    .line 1167
    instance-of v11, v12, Ljava/lang/reflect/ParameterizedType;

    .line 1168
    .line 1169
    if-eqz v11, :cond_34

    .line 1170
    .line 1171
    move-object v4, v12

    .line 1172
    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    .line 1173
    .line 1174
    const/4 v11, 0x0

    .line 1175
    invoke-static {v11, v4}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世哲兰(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v4

    .line 1179
    invoke-virtual {v8, v4, v13}, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 1180
    .line 1181
    .line 1182
    new-instance v4, Lretrofit2/飘花落叶言子世楪兰哲苏;

    .line 1183
    .line 1184
    invoke-interface {v5}, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪苏哲世兰;->allowUnsafeNonAsciiValues()Z

    .line 1185
    .line 1186
    .line 1187
    move-result v5

    .line 1188
    const/4 v15, 0x1

    .line 1189
    invoke-direct {v4, v15, v6, v5}, Lretrofit2/飘花落叶言子世楪兰哲苏;-><init>(ILjava/lang/String;Z)V

    .line 1190
    .line 1191
    .line 1192
    new-instance v5, Lretrofit2/飘花落叶言子世楪哲兰苏;

    .line 1193
    .line 1194
    invoke-direct {v5, v4, v11}, Lretrofit2/飘花落叶言子世楪哲兰苏;-><init>(Lretrofit2/飘花落叶言子楪兰哲世苏;I)V

    .line 1195
    .line 1196
    .line 1197
    :goto_c
    move-object v4, v5

    .line 1198
    goto/16 :goto_10

    .line 1199
    .line 1200
    :cond_34
    const/4 v11, 0x0

    .line 1201
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1202
    .line 1203
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1204
    .line 1205
    .line 1206
    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v2

    .line 1210
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1211
    .line 1212
    .line 1213
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1214
    .line 1215
    .line 1216
    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v2

    .line 1220
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1221
    .line 1222
    .line 1223
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1224
    .line 1225
    .line 1226
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v0

    .line 1230
    new-array v2, v11, [Ljava/lang/Object;

    .line 1231
    .line 1232
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v0

    .line 1236
    throw v0

    .line 1237
    :cond_35
    invoke-virtual {v7}, Ljava/lang/Class;->isArray()Z

    .line 1238
    .line 1239
    .line 1240
    move-result v4

    .line 1241
    if-eqz v4, :cond_36

    .line 1242
    .line 1243
    invoke-virtual {v7}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v4

    .line 1247
    invoke-static {v4}, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Ljava/lang/Class;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v4

    .line 1251
    invoke-virtual {v8, v4, v13}, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 1252
    .line 1253
    .line 1254
    new-instance v4, Lretrofit2/飘花落叶言子世楪兰哲苏;

    .line 1255
    .line 1256
    invoke-interface {v5}, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪苏哲世兰;->allowUnsafeNonAsciiValues()Z

    .line 1257
    .line 1258
    .line 1259
    move-result v5

    .line 1260
    const/4 v15, 0x1

    .line 1261
    invoke-direct {v4, v15, v6, v5}, Lretrofit2/飘花落叶言子世楪兰哲苏;-><init>(ILjava/lang/String;Z)V

    .line 1262
    .line 1263
    .line 1264
    new-instance v5, Lretrofit2/飘花落叶言子世楪哲兰苏;

    .line 1265
    .line 1266
    invoke-direct {v5, v4, v15}, Lretrofit2/飘花落叶言子世楪哲兰苏;-><init>(Lretrofit2/飘花落叶言子楪兰哲世苏;I)V

    .line 1267
    .line 1268
    .line 1269
    goto :goto_c

    .line 1270
    :cond_36
    const/4 v15, 0x1

    .line 1271
    invoke-virtual {v8, v12, v13}, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 1272
    .line 1273
    .line 1274
    new-instance v4, Lretrofit2/飘花落叶言子世楪兰哲苏;

    .line 1275
    .line 1276
    invoke-interface {v5}, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪苏哲世兰;->allowUnsafeNonAsciiValues()Z

    .line 1277
    .line 1278
    .line 1279
    move-result v5

    .line 1280
    invoke-direct {v4, v15, v6, v5}, Lretrofit2/飘花落叶言子世楪兰哲苏;-><init>(ILjava/lang/String;Z)V

    .line 1281
    .line 1282
    .line 1283
    goto/16 :goto_10

    .line 1284
    .line 1285
    :cond_37
    instance-of v7, v5, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪苏哲兰世;

    .line 1286
    .line 1287
    if-eqz v7, :cond_3c

    .line 1288
    .line 1289
    const-class v4, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲苏兰世;

    .line 1290
    .line 1291
    if-ne v12, v4, :cond_38

    .line 1292
    .line 1293
    new-instance v4, Lretrofit2/飘花落叶言子世苏楪兰哲;

    .line 1294
    .line 1295
    const/4 v11, 0x0

    .line 1296
    invoke-direct {v4, v1, v10, v11}, Lretrofit2/飘花落叶言子世苏楪兰哲;-><init>(Ljava/lang/reflect/Method;II)V

    .line 1297
    .line 1298
    .line 1299
    goto/16 :goto_10

    .line 1300
    .line 1301
    :cond_38
    const/4 v11, 0x0

    .line 1302
    invoke-virtual {v2, v10, v12}, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲苏兰(ILjava/lang/reflect/Type;)V

    .line 1303
    .line 1304
    .line 1305
    invoke-static {v12}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v4

    .line 1309
    invoke-virtual {v14, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1310
    .line 1311
    .line 1312
    move-result v7

    .line 1313
    if-eqz v7, :cond_3b

    .line 1314
    .line 1315
    invoke-static {v4, v12}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v4

    .line 1319
    instance-of v7, v4, Ljava/lang/reflect/ParameterizedType;

    .line 1320
    .line 1321
    if-eqz v7, :cond_3a

    .line 1322
    .line 1323
    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    .line 1324
    .line 1325
    invoke-static {v11, v4}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世哲兰(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v7

    .line 1329
    if-ne v6, v7, :cond_39

    .line 1330
    .line 1331
    const/4 v15, 0x1

    .line 1332
    invoke-static {v15, v4}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世哲兰(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v4

    .line 1336
    invoke-virtual {v8, v4, v13}, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 1337
    .line 1338
    .line 1339
    new-instance v4, Lretrofit2/飘花落叶言子世苏楪哲兰;

    .line 1340
    .line 1341
    check-cast v5, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪苏哲兰世;

    .line 1342
    .line 1343
    invoke-interface {v5}, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪苏哲兰世;->allowUnsafeNonAsciiValues()Z

    .line 1344
    .line 1345
    .line 1346
    move-result v5

    .line 1347
    invoke-direct {v4, v10, v15, v1, v5}, Lretrofit2/飘花落叶言子世苏楪哲兰;-><init>(IILjava/lang/reflect/Method;Z)V

    .line 1348
    .line 1349
    .line 1350
    goto/16 :goto_10

    .line 1351
    .line 1352
    :cond_39
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1353
    .line 1354
    const-string v2, "@HeaderMap keys must be of type String: "

    .line 1355
    .line 1356
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1357
    .line 1358
    .line 1359
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1360
    .line 1361
    .line 1362
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v0

    .line 1366
    const/4 v11, 0x0

    .line 1367
    new-array v2, v11, [Ljava/lang/Object;

    .line 1368
    .line 1369
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v0

    .line 1373
    throw v0

    .line 1374
    :cond_3a
    new-array v0, v11, [Ljava/lang/Object;

    .line 1375
    .line 1376
    invoke-static {v1, v10, v15, v0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v0

    .line 1380
    throw v0

    .line 1381
    :cond_3b
    const-string v0, "@HeaderMap parameter type must be Map or Headers."

    .line 1382
    .line 1383
    new-array v2, v11, [Ljava/lang/Object;

    .line 1384
    .line 1385
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v0

    .line 1389
    throw v0

    .line 1390
    :cond_3c
    instance-of v7, v5, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪世哲苏兰;

    .line 1391
    .line 1392
    if-eqz v7, :cond_41

    .line 1393
    .line 1394
    invoke-virtual {v2, v10, v12}, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲苏兰(ILjava/lang/reflect/Type;)V

    .line 1395
    .line 1396
    .line 1397
    iget-boolean v6, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲兰世苏:Z

    .line 1398
    .line 1399
    if-eqz v6, :cond_40

    .line 1400
    .line 1401
    check-cast v5, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪世哲苏兰;

    .line 1402
    .line 1403
    invoke-interface {v5}, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪世哲苏兰;->value()Ljava/lang/String;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v6

    .line 1407
    invoke-interface {v5}, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪世哲苏兰;->encoded()Z

    .line 1408
    .line 1409
    .line 1410
    move-result v5

    .line 1411
    const/4 v15, 0x1

    .line 1412
    iput-boolean v15, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世哲兰:Z

    .line 1413
    .line 1414
    invoke-static {v12}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v7

    .line 1418
    invoke-virtual {v11, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1419
    .line 1420
    .line 1421
    move-result v11

    .line 1422
    if-eqz v11, :cond_3e

    .line 1423
    .line 1424
    instance-of v11, v12, Ljava/lang/reflect/ParameterizedType;

    .line 1425
    .line 1426
    if-eqz v11, :cond_3d

    .line 1427
    .line 1428
    move-object v4, v12

    .line 1429
    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    .line 1430
    .line 1431
    const/4 v11, 0x0

    .line 1432
    invoke-static {v11, v4}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世哲兰(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1433
    .line 1434
    .line 1435
    move-result-object v4

    .line 1436
    invoke-virtual {v8, v4, v13}, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 1437
    .line 1438
    .line 1439
    new-instance v4, Lretrofit2/飘花落叶言子世楪兰哲苏;

    .line 1440
    .line 1441
    invoke-direct {v4, v11, v6, v5}, Lretrofit2/飘花落叶言子世楪兰哲苏;-><init>(ILjava/lang/String;Z)V

    .line 1442
    .line 1443
    .line 1444
    new-instance v5, Lretrofit2/飘花落叶言子世楪哲兰苏;

    .line 1445
    .line 1446
    invoke-direct {v5, v4, v11}, Lretrofit2/飘花落叶言子世楪哲兰苏;-><init>(Lretrofit2/飘花落叶言子楪兰哲世苏;I)V

    .line 1447
    .line 1448
    .line 1449
    goto/16 :goto_c

    .line 1450
    .line 1451
    :cond_3d
    const/4 v11, 0x0

    .line 1452
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1453
    .line 1454
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1455
    .line 1456
    .line 1457
    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v2

    .line 1461
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1462
    .line 1463
    .line 1464
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1465
    .line 1466
    .line 1467
    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1468
    .line 1469
    .line 1470
    move-result-object v2

    .line 1471
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1472
    .line 1473
    .line 1474
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1475
    .line 1476
    .line 1477
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v0

    .line 1481
    new-array v2, v11, [Ljava/lang/Object;

    .line 1482
    .line 1483
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1484
    .line 1485
    .line 1486
    move-result-object v0

    .line 1487
    throw v0

    .line 1488
    :cond_3e
    const/4 v11, 0x0

    .line 1489
    invoke-virtual {v7}, Ljava/lang/Class;->isArray()Z

    .line 1490
    .line 1491
    .line 1492
    move-result v4

    .line 1493
    if-eqz v4, :cond_3f

    .line 1494
    .line 1495
    invoke-virtual {v7}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 1496
    .line 1497
    .line 1498
    move-result-object v4

    .line 1499
    invoke-static {v4}, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Ljava/lang/Class;

    .line 1500
    .line 1501
    .line 1502
    move-result-object v4

    .line 1503
    invoke-virtual {v8, v4, v13}, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 1504
    .line 1505
    .line 1506
    new-instance v4, Lretrofit2/飘花落叶言子世楪兰哲苏;

    .line 1507
    .line 1508
    invoke-direct {v4, v11, v6, v5}, Lretrofit2/飘花落叶言子世楪兰哲苏;-><init>(ILjava/lang/String;Z)V

    .line 1509
    .line 1510
    .line 1511
    new-instance v5, Lretrofit2/飘花落叶言子世楪哲兰苏;

    .line 1512
    .line 1513
    const/4 v15, 0x1

    .line 1514
    invoke-direct {v5, v4, v15}, Lretrofit2/飘花落叶言子世楪哲兰苏;-><init>(Lretrofit2/飘花落叶言子楪兰哲世苏;I)V

    .line 1515
    .line 1516
    .line 1517
    goto/16 :goto_c

    .line 1518
    .line 1519
    :cond_3f
    invoke-virtual {v8, v12, v13}, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 1520
    .line 1521
    .line 1522
    new-instance v4, Lretrofit2/飘花落叶言子世楪兰哲苏;

    .line 1523
    .line 1524
    invoke-direct {v4, v11, v6, v5}, Lretrofit2/飘花落叶言子世楪兰哲苏;-><init>(ILjava/lang/String;Z)V

    .line 1525
    .line 1526
    .line 1527
    goto/16 :goto_10

    .line 1528
    .line 1529
    :cond_40
    const/4 v11, 0x0

    .line 1530
    const-string v0, "@Field parameters can only be used with form encoding."

    .line 1531
    .line 1532
    new-array v2, v11, [Ljava/lang/Object;

    .line 1533
    .line 1534
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v0

    .line 1538
    throw v0

    .line 1539
    :cond_41
    instance-of v7, v5, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪世哲兰苏;

    .line 1540
    .line 1541
    if-eqz v7, :cond_46

    .line 1542
    .line 1543
    invoke-virtual {v2, v10, v12}, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲苏兰(ILjava/lang/reflect/Type;)V

    .line 1544
    .line 1545
    .line 1546
    iget-boolean v4, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲兰世苏:Z

    .line 1547
    .line 1548
    if-eqz v4, :cond_45

    .line 1549
    .line 1550
    invoke-static {v12}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v4

    .line 1554
    invoke-virtual {v14, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1555
    .line 1556
    .line 1557
    move-result v7

    .line 1558
    if-eqz v7, :cond_44

    .line 1559
    .line 1560
    invoke-static {v4, v12}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v4

    .line 1564
    instance-of v7, v4, Ljava/lang/reflect/ParameterizedType;

    .line 1565
    .line 1566
    if-eqz v7, :cond_43

    .line 1567
    .line 1568
    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    .line 1569
    .line 1570
    const/4 v11, 0x0

    .line 1571
    invoke-static {v11, v4}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世哲兰(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1572
    .line 1573
    .line 1574
    move-result-object v7

    .line 1575
    if-ne v6, v7, :cond_42

    .line 1576
    .line 1577
    const/4 v15, 0x1

    .line 1578
    invoke-static {v15, v4}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世哲兰(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1579
    .line 1580
    .line 1581
    move-result-object v4

    .line 1582
    invoke-virtual {v8, v4, v13}, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 1583
    .line 1584
    .line 1585
    iput-boolean v15, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世哲兰:Z

    .line 1586
    .line 1587
    new-instance v4, Lretrofit2/飘花落叶言子世苏楪哲兰;

    .line 1588
    .line 1589
    check-cast v5, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪世哲兰苏;

    .line 1590
    .line 1591
    invoke-interface {v5}, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪世哲兰苏;->encoded()Z

    .line 1592
    .line 1593
    .line 1594
    move-result v5

    .line 1595
    invoke-direct {v4, v10, v11, v1, v5}, Lretrofit2/飘花落叶言子世苏楪哲兰;-><init>(IILjava/lang/reflect/Method;Z)V

    .line 1596
    .line 1597
    .line 1598
    goto/16 :goto_10

    .line 1599
    .line 1600
    :cond_42
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1601
    .line 1602
    const-string v2, "@FieldMap keys must be of type String: "

    .line 1603
    .line 1604
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1605
    .line 1606
    .line 1607
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1608
    .line 1609
    .line 1610
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1611
    .line 1612
    .line 1613
    move-result-object v0

    .line 1614
    new-array v2, v11, [Ljava/lang/Object;

    .line 1615
    .line 1616
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1617
    .line 1618
    .line 1619
    move-result-object v0

    .line 1620
    throw v0

    .line 1621
    :cond_43
    const/4 v11, 0x0

    .line 1622
    new-array v0, v11, [Ljava/lang/Object;

    .line 1623
    .line 1624
    invoke-static {v1, v10, v15, v0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v0

    .line 1628
    throw v0

    .line 1629
    :cond_44
    const/4 v11, 0x0

    .line 1630
    const-string v0, "@FieldMap parameter type must be Map."

    .line 1631
    .line 1632
    new-array v2, v11, [Ljava/lang/Object;

    .line 1633
    .line 1634
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1635
    .line 1636
    .line 1637
    move-result-object v0

    .line 1638
    throw v0

    .line 1639
    :cond_45
    const/4 v11, 0x0

    .line 1640
    const-string v0, "@FieldMap parameters can only be used with form encoding."

    .line 1641
    .line 1642
    new-array v2, v11, [Ljava/lang/Object;

    .line 1643
    .line 1644
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1645
    .line 1646
    .line 1647
    move-result-object v0

    .line 1648
    throw v0

    .line 1649
    :cond_46
    instance-of v7, v5, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪哲兰世苏;

    .line 1650
    .line 1651
    move/from16 v25, v7

    .line 1652
    .line 1653
    const-class v7, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰苏哲世;

    .line 1654
    .line 1655
    if-eqz v25, :cond_55

    .line 1656
    .line 1657
    invoke-virtual {v2, v10, v12}, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲苏兰(ILjava/lang/reflect/Type;)V

    .line 1658
    .line 1659
    .line 1660
    iget-boolean v6, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲兰苏世:Z

    .line 1661
    .line 1662
    if-eqz v6, :cond_54

    .line 1663
    .line 1664
    check-cast v5, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪哲兰世苏;

    .line 1665
    .line 1666
    const/4 v15, 0x1

    .line 1667
    iput-boolean v15, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世兰哲:Z

    .line 1668
    .line 1669
    invoke-interface {v5}, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪哲兰世苏;->value()Ljava/lang/String;

    .line 1670
    .line 1671
    .line 1672
    move-result-object v6

    .line 1673
    invoke-static {v12}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1674
    .line 1675
    .line 1676
    move-result-object v14

    .line 1677
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    .line 1678
    .line 1679
    .line 1680
    move-result v15

    .line 1681
    if-eqz v15, :cond_4d

    .line 1682
    .line 1683
    invoke-virtual {v11, v14}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1684
    .line 1685
    .line 1686
    move-result v5

    .line 1687
    sget-object v6, Lretrofit2/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世哲兰苏:Lretrofit2/飘花落叶言子世苏兰哲楪;

    .line 1688
    .line 1689
    const-string v8, "@Part annotation must supply a name or use MultipartBody.Part parameter type."

    .line 1690
    .line 1691
    if-eqz v5, :cond_49

    .line 1692
    .line 1693
    instance-of v5, v12, Ljava/lang/reflect/ParameterizedType;

    .line 1694
    .line 1695
    if-eqz v5, :cond_48

    .line 1696
    .line 1697
    move-object v4, v12

    .line 1698
    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    .line 1699
    .line 1700
    const/4 v11, 0x0

    .line 1701
    invoke-static {v11, v4}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世哲兰(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1702
    .line 1703
    .line 1704
    move-result-object v4

    .line 1705
    invoke-static {v4}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1706
    .line 1707
    .line 1708
    move-result-object v4

    .line 1709
    invoke-virtual {v7, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1710
    .line 1711
    .line 1712
    move-result v4

    .line 1713
    if-eqz v4, :cond_47

    .line 1714
    .line 1715
    new-instance v4, Lretrofit2/飘花落叶言子世楪哲兰苏;

    .line 1716
    .line 1717
    invoke-direct {v4, v6, v11}, Lretrofit2/飘花落叶言子世楪哲兰苏;-><init>(Lretrofit2/飘花落叶言子楪兰哲世苏;I)V

    .line 1718
    .line 1719
    .line 1720
    goto/16 :goto_10

    .line 1721
    .line 1722
    :cond_47
    new-array v0, v11, [Ljava/lang/Object;

    .line 1723
    .line 1724
    invoke-static {v1, v10, v8, v0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1725
    .line 1726
    .line 1727
    move-result-object v0

    .line 1728
    throw v0

    .line 1729
    :cond_48
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1730
    .line 1731
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1732
    .line 1733
    .line 1734
    invoke-virtual {v14}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1735
    .line 1736
    .line 1737
    move-result-object v2

    .line 1738
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1739
    .line 1740
    .line 1741
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1742
    .line 1743
    .line 1744
    invoke-virtual {v14}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1745
    .line 1746
    .line 1747
    move-result-object v2

    .line 1748
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1749
    .line 1750
    .line 1751
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1752
    .line 1753
    .line 1754
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1755
    .line 1756
    .line 1757
    move-result-object v0

    .line 1758
    const/4 v11, 0x0

    .line 1759
    new-array v2, v11, [Ljava/lang/Object;

    .line 1760
    .line 1761
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1762
    .line 1763
    .line 1764
    move-result-object v0

    .line 1765
    throw v0

    .line 1766
    :cond_49
    const/4 v11, 0x0

    .line 1767
    invoke-virtual {v14}, Ljava/lang/Class;->isArray()Z

    .line 1768
    .line 1769
    .line 1770
    move-result v4

    .line 1771
    if-eqz v4, :cond_4b

    .line 1772
    .line 1773
    invoke-virtual {v14}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 1774
    .line 1775
    .line 1776
    move-result-object v4

    .line 1777
    invoke-virtual {v7, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1778
    .line 1779
    .line 1780
    move-result v4

    .line 1781
    if-eqz v4, :cond_4a

    .line 1782
    .line 1783
    new-instance v4, Lretrofit2/飘花落叶言子世楪哲兰苏;

    .line 1784
    .line 1785
    const/4 v15, 0x1

    .line 1786
    invoke-direct {v4, v6, v15}, Lretrofit2/飘花落叶言子世楪哲兰苏;-><init>(Lretrofit2/飘花落叶言子楪兰哲世苏;I)V

    .line 1787
    .line 1788
    .line 1789
    goto/16 :goto_10

    .line 1790
    .line 1791
    :cond_4a
    new-array v0, v11, [Ljava/lang/Object;

    .line 1792
    .line 1793
    invoke-static {v1, v10, v8, v0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1794
    .line 1795
    .line 1796
    move-result-object v0

    .line 1797
    throw v0

    .line 1798
    :cond_4b
    invoke-virtual {v7, v14}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1799
    .line 1800
    .line 1801
    move-result v4

    .line 1802
    if-eqz v4, :cond_4c

    .line 1803
    .line 1804
    move-object v4, v6

    .line 1805
    goto/16 :goto_10

    .line 1806
    .line 1807
    :cond_4c
    new-array v0, v11, [Ljava/lang/Object;

    .line 1808
    .line 1809
    invoke-static {v1, v10, v8, v0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1810
    .line 1811
    .line 1812
    move-result-object v0

    .line 1813
    throw v0

    .line 1814
    :cond_4d
    const-string v15, "form-data; name=\""

    .line 1815
    .line 1816
    move-object/from16 v25, v5

    .line 1817
    .line 1818
    const-string v5, "\""

    .line 1819
    .line 1820
    invoke-static {v15, v6, v5}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1821
    .line 1822
    .line 1823
    move-result-object v5

    .line 1824
    const-string v6, "Content-Transfer-Encoding"

    .line 1825
    .line 1826
    invoke-interface/range {v25 .. v25}, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪哲兰世苏;->encoding()Ljava/lang/String;

    .line 1827
    .line 1828
    .line 1829
    move-result-object v15

    .line 1830
    const-string v0, "Content-Disposition"

    .line 1831
    .line 1832
    filled-new-array {v0, v5, v6, v15}, [Ljava/lang/String;

    .line 1833
    .line 1834
    .line 1835
    move-result-object v0

    .line 1836
    sget-object v5, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲苏兰世;

    .line 1837
    .line 1838
    invoke-static {v0}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪兰哲世苏([Ljava/lang/String;)L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲苏兰世;

    .line 1839
    .line 1840
    .line 1841
    move-result-object v0

    .line 1842
    invoke-virtual {v11, v14}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1843
    .line 1844
    .line 1845
    move-result v5

    .line 1846
    const-string v6, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation."

    .line 1847
    .line 1848
    if-eqz v5, :cond_50

    .line 1849
    .line 1850
    instance-of v5, v12, Ljava/lang/reflect/ParameterizedType;

    .line 1851
    .line 1852
    if-eqz v5, :cond_4f

    .line 1853
    .line 1854
    move-object v4, v12

    .line 1855
    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    .line 1856
    .line 1857
    const/4 v11, 0x0

    .line 1858
    invoke-static {v11, v4}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世哲兰(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 1859
    .line 1860
    .line 1861
    move-result-object v4

    .line 1862
    invoke-static {v4}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1863
    .line 1864
    .line 1865
    move-result-object v5

    .line 1866
    invoke-virtual {v7, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1867
    .line 1868
    .line 1869
    move-result v5

    .line 1870
    if-nez v5, :cond_4e

    .line 1871
    .line 1872
    invoke-virtual {v8, v4, v13, v3}, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lretrofit2/飘花落叶言子楪哲世兰苏;

    .line 1873
    .line 1874
    .line 1875
    move-result-object v4

    .line 1876
    new-instance v5, Lretrofit2/飘花落叶言子世苏哲楪兰;

    .line 1877
    .line 1878
    invoke-direct {v5, v1, v10, v0, v4}, Lretrofit2/飘花落叶言子世苏哲楪兰;-><init>(Ljava/lang/reflect/Method;IL飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲苏兰世;Lretrofit2/飘花落叶言子楪哲世兰苏;)V

    .line 1879
    .line 1880
    .line 1881
    new-instance v0, Lretrofit2/飘花落叶言子世楪哲兰苏;

    .line 1882
    .line 1883
    invoke-direct {v0, v5, v11}, Lretrofit2/飘花落叶言子世楪哲兰苏;-><init>(Lretrofit2/飘花落叶言子楪兰哲世苏;I)V

    .line 1884
    .line 1885
    .line 1886
    :goto_d
    move-object v4, v0

    .line 1887
    goto/16 :goto_10

    .line 1888
    .line 1889
    :cond_4e
    new-array v0, v11, [Ljava/lang/Object;

    .line 1890
    .line 1891
    invoke-static {v1, v10, v6, v0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1892
    .line 1893
    .line 1894
    move-result-object v0

    .line 1895
    throw v0

    .line 1896
    :cond_4f
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1897
    .line 1898
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1899
    .line 1900
    .line 1901
    invoke-virtual {v14}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1902
    .line 1903
    .line 1904
    move-result-object v2

    .line 1905
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1906
    .line 1907
    .line 1908
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1909
    .line 1910
    .line 1911
    invoke-virtual {v14}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1912
    .line 1913
    .line 1914
    move-result-object v2

    .line 1915
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1916
    .line 1917
    .line 1918
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1919
    .line 1920
    .line 1921
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1922
    .line 1923
    .line 1924
    move-result-object v0

    .line 1925
    const/4 v11, 0x0

    .line 1926
    new-array v2, v11, [Ljava/lang/Object;

    .line 1927
    .line 1928
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1929
    .line 1930
    .line 1931
    move-result-object v0

    .line 1932
    throw v0

    .line 1933
    :cond_50
    invoke-virtual {v14}, Ljava/lang/Class;->isArray()Z

    .line 1934
    .line 1935
    .line 1936
    move-result v4

    .line 1937
    if-eqz v4, :cond_52

    .line 1938
    .line 1939
    invoke-virtual {v14}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 1940
    .line 1941
    .line 1942
    move-result-object v4

    .line 1943
    invoke-static {v4}, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Ljava/lang/Class;

    .line 1944
    .line 1945
    .line 1946
    move-result-object v4

    .line 1947
    invoke-virtual {v7, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1948
    .line 1949
    .line 1950
    move-result v5

    .line 1951
    if-nez v5, :cond_51

    .line 1952
    .line 1953
    invoke-virtual {v8, v4, v13, v3}, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lretrofit2/飘花落叶言子楪哲世兰苏;

    .line 1954
    .line 1955
    .line 1956
    move-result-object v4

    .line 1957
    new-instance v5, Lretrofit2/飘花落叶言子世苏哲楪兰;

    .line 1958
    .line 1959
    invoke-direct {v5, v1, v10, v0, v4}, Lretrofit2/飘花落叶言子世苏哲楪兰;-><init>(Ljava/lang/reflect/Method;IL飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲苏兰世;Lretrofit2/飘花落叶言子楪哲世兰苏;)V

    .line 1960
    .line 1961
    .line 1962
    new-instance v0, Lretrofit2/飘花落叶言子世楪哲兰苏;

    .line 1963
    .line 1964
    const/4 v15, 0x1

    .line 1965
    invoke-direct {v0, v5, v15}, Lretrofit2/飘花落叶言子世楪哲兰苏;-><init>(Lretrofit2/飘花落叶言子楪兰哲世苏;I)V

    .line 1966
    .line 1967
    .line 1968
    goto :goto_d

    .line 1969
    :cond_51
    const/4 v11, 0x0

    .line 1970
    new-array v0, v11, [Ljava/lang/Object;

    .line 1971
    .line 1972
    invoke-static {v1, v10, v6, v0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1973
    .line 1974
    .line 1975
    move-result-object v0

    .line 1976
    throw v0

    .line 1977
    :cond_52
    const/4 v11, 0x0

    .line 1978
    invoke-virtual {v7, v14}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1979
    .line 1980
    .line 1981
    move-result v4

    .line 1982
    if-nez v4, :cond_53

    .line 1983
    .line 1984
    invoke-virtual {v8, v12, v13, v3}, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lretrofit2/飘花落叶言子楪哲世兰苏;

    .line 1985
    .line 1986
    .line 1987
    move-result-object v4

    .line 1988
    new-instance v5, Lretrofit2/飘花落叶言子世苏哲楪兰;

    .line 1989
    .line 1990
    invoke-direct {v5, v1, v10, v0, v4}, Lretrofit2/飘花落叶言子世苏哲楪兰;-><init>(Ljava/lang/reflect/Method;IL飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲苏兰世;Lretrofit2/飘花落叶言子楪哲世兰苏;)V

    .line 1991
    .line 1992
    .line 1993
    goto/16 :goto_c

    .line 1994
    .line 1995
    :cond_53
    new-array v0, v11, [Ljava/lang/Object;

    .line 1996
    .line 1997
    invoke-static {v1, v10, v6, v0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 1998
    .line 1999
    .line 2000
    move-result-object v0

    .line 2001
    throw v0

    .line 2002
    :cond_54
    const/4 v11, 0x0

    .line 2003
    const-string v0, "@Part parameters can only be used with multipart encoding."

    .line 2004
    .line 2005
    new-array v2, v11, [Ljava/lang/Object;

    .line 2006
    .line 2007
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2008
    .line 2009
    .line 2010
    move-result-object v0

    .line 2011
    throw v0

    .line 2012
    :cond_55
    instance-of v0, v5, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪哲兰苏世;

    .line 2013
    .line 2014
    if-eqz v0, :cond_5b

    .line 2015
    .line 2016
    invoke-virtual {v2, v10, v12}, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲苏兰(ILjava/lang/reflect/Type;)V

    .line 2017
    .line 2018
    .line 2019
    iget-boolean v0, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲兰苏世:Z

    .line 2020
    .line 2021
    if-eqz v0, :cond_5a

    .line 2022
    .line 2023
    const/4 v4, 0x1

    .line 2024
    iput-boolean v4, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世兰哲:Z

    .line 2025
    .line 2026
    invoke-static {v12}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 2027
    .line 2028
    .line 2029
    move-result-object v0

    .line 2030
    invoke-virtual {v14, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 2031
    .line 2032
    .line 2033
    move-result v9

    .line 2034
    if-eqz v9, :cond_59

    .line 2035
    .line 2036
    invoke-static {v0, v12}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 2037
    .line 2038
    .line 2039
    move-result-object v0

    .line 2040
    instance-of v9, v0, Ljava/lang/reflect/ParameterizedType;

    .line 2041
    .line 2042
    if-eqz v9, :cond_58

    .line 2043
    .line 2044
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 2045
    .line 2046
    const/4 v11, 0x0

    .line 2047
    invoke-static {v11, v0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世哲兰(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 2048
    .line 2049
    .line 2050
    move-result-object v9

    .line 2051
    if-ne v6, v9, :cond_57

    .line 2052
    .line 2053
    invoke-static {v4, v0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世哲兰(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 2054
    .line 2055
    .line 2056
    move-result-object v0

    .line 2057
    invoke-static {v0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 2058
    .line 2059
    .line 2060
    move-result-object v4

    .line 2061
    invoke-virtual {v7, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 2062
    .line 2063
    .line 2064
    move-result v4

    .line 2065
    if-nez v4, :cond_56

    .line 2066
    .line 2067
    invoke-virtual {v8, v0, v13, v3}, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lretrofit2/飘花落叶言子楪哲世兰苏;

    .line 2068
    .line 2069
    .line 2070
    move-result-object v0

    .line 2071
    check-cast v5, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪哲兰苏世;

    .line 2072
    .line 2073
    new-instance v4, Lretrofit2/飘花落叶言子世苏哲楪兰;

    .line 2074
    .line 2075
    invoke-interface {v5}, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪哲兰苏世;->encoding()Ljava/lang/String;

    .line 2076
    .line 2077
    .line 2078
    move-result-object v5

    .line 2079
    invoke-direct {v4, v1, v10, v0, v5}, Lretrofit2/飘花落叶言子世苏哲楪兰;-><init>(Ljava/lang/reflect/Method;ILretrofit2/飘花落叶言子楪哲世兰苏;Ljava/lang/String;)V

    .line 2080
    .line 2081
    .line 2082
    goto/16 :goto_10

    .line 2083
    .line 2084
    :cond_56
    const-string v0, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead."

    .line 2085
    .line 2086
    const/4 v11, 0x0

    .line 2087
    new-array v2, v11, [Ljava/lang/Object;

    .line 2088
    .line 2089
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2090
    .line 2091
    .line 2092
    move-result-object v0

    .line 2093
    throw v0

    .line 2094
    :cond_57
    const/4 v11, 0x0

    .line 2095
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2096
    .line 2097
    const-string v2, "@PartMap keys must be of type String: "

    .line 2098
    .line 2099
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2100
    .line 2101
    .line 2102
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2103
    .line 2104
    .line 2105
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2106
    .line 2107
    .line 2108
    move-result-object v0

    .line 2109
    new-array v2, v11, [Ljava/lang/Object;

    .line 2110
    .line 2111
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2112
    .line 2113
    .line 2114
    move-result-object v0

    .line 2115
    throw v0

    .line 2116
    :cond_58
    const/4 v11, 0x0

    .line 2117
    new-array v0, v11, [Ljava/lang/Object;

    .line 2118
    .line 2119
    invoke-static {v1, v10, v15, v0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2120
    .line 2121
    .line 2122
    move-result-object v0

    .line 2123
    throw v0

    .line 2124
    :cond_59
    const/4 v11, 0x0

    .line 2125
    const-string v0, "@PartMap parameter type must be Map."

    .line 2126
    .line 2127
    new-array v2, v11, [Ljava/lang/Object;

    .line 2128
    .line 2129
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2130
    .line 2131
    .line 2132
    move-result-object v0

    .line 2133
    throw v0

    .line 2134
    :cond_5a
    const/4 v11, 0x0

    .line 2135
    const-string v0, "@PartMap parameters can only be used with multipart encoding."

    .line 2136
    .line 2137
    new-array v2, v11, [Ljava/lang/Object;

    .line 2138
    .line 2139
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2140
    .line 2141
    .line 2142
    move-result-object v0

    .line 2143
    throw v0

    .line 2144
    :cond_5b
    instance-of v0, v5, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪世苏哲兰;

    .line 2145
    .line 2146
    if-eqz v0, :cond_5e

    .line 2147
    .line 2148
    invoke-virtual {v2, v10, v12}, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲苏兰(ILjava/lang/reflect/Type;)V

    .line 2149
    .line 2150
    .line 2151
    iget-boolean v0, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲兰世苏:Z

    .line 2152
    .line 2153
    if-nez v0, :cond_5d

    .line 2154
    .line 2155
    iget-boolean v0, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲兰苏世:Z

    .line 2156
    .line 2157
    if-nez v0, :cond_5d

    .line 2158
    .line 2159
    iget-boolean v0, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲世兰:Z

    .line 2160
    .line 2161
    if-nez v0, :cond_5c

    .line 2162
    .line 2163
    :try_start_1
    invoke-virtual {v8, v12, v13, v3}, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lretrofit2/飘花落叶言子楪哲世兰苏;

    .line 2164
    .line 2165
    .line 2166
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 2167
    const/4 v15, 0x1

    .line 2168
    iput-boolean v15, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲世兰:Z

    .line 2169
    .line 2170
    new-instance v4, Lretrofit2/飘花落叶言子世楪兰苏哲;

    .line 2171
    .line 2172
    invoke-direct {v4, v1, v10, v0}, Lretrofit2/飘花落叶言子世楪兰苏哲;-><init>(Ljava/lang/reflect/Method;ILretrofit2/飘花落叶言子楪哲世兰苏;)V

    .line 2173
    .line 2174
    .line 2175
    goto/16 :goto_10

    .line 2176
    .line 2177
    :catch_1
    move-exception v0

    .line 2178
    const-string v2, "Unable to create @Body converter for %s"

    .line 2179
    .line 2180
    filled-new-array {v12}, [Ljava/lang/Object;

    .line 2181
    .line 2182
    .line 2183
    move-result-object v3

    .line 2184
    invoke-static {v1, v0, v10, v2, v3}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲苏世兰(Ljava/lang/reflect/Method;Ljava/lang/Exception;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2185
    .line 2186
    .line 2187
    move-result-object v0

    .line 2188
    throw v0

    .line 2189
    :cond_5c
    const-string v0, "Multiple @Body method annotations found."

    .line 2190
    .line 2191
    const/4 v11, 0x0

    .line 2192
    new-array v2, v11, [Ljava/lang/Object;

    .line 2193
    .line 2194
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2195
    .line 2196
    .line 2197
    move-result-object v0

    .line 2198
    throw v0

    .line 2199
    :cond_5d
    const/4 v11, 0x0

    .line 2200
    const-string v0, "@Body parameters cannot be used with form or multi-part encoding."

    .line 2201
    .line 2202
    new-array v2, v11, [Ljava/lang/Object;

    .line 2203
    .line 2204
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2205
    .line 2206
    .line 2207
    move-result-object v0

    .line 2208
    throw v0

    .line 2209
    :cond_5e
    instance-of v0, v5, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪兰哲苏世;

    .line 2210
    .line 2211
    if-eqz v0, :cond_62

    .line 2212
    .line 2213
    invoke-virtual {v2, v10, v12}, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲苏兰(ILjava/lang/reflect/Type;)V

    .line 2214
    .line 2215
    .line 2216
    invoke-static {v12}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 2217
    .line 2218
    .line 2219
    move-result-object v0

    .line 2220
    invoke-static {v0}, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Ljava/lang/Class;

    .line 2221
    .line 2222
    .line 2223
    move-result-object v0

    .line 2224
    add-int/lit8 v4, v10, -0x1

    .line 2225
    .line 2226
    :goto_e
    if-ltz v4, :cond_61

    .line 2227
    .line 2228
    iget-object v5, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪兰哲世苏:[Lretrofit2/飘花落叶言子楪兰哲世苏;

    .line 2229
    .line 2230
    aget-object v5, v5, v4

    .line 2231
    .line 2232
    instance-of v6, v5, Lretrofit2/飘花落叶言子世哲楪苏兰;

    .line 2233
    .line 2234
    if-eqz v6, :cond_60

    .line 2235
    .line 2236
    check-cast v5, Lretrofit2/飘花落叶言子世哲楪苏兰;

    .line 2237
    .line 2238
    iget-object v5, v5, Lretrofit2/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/Class;

    .line 2239
    .line 2240
    invoke-virtual {v5, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2241
    .line 2242
    .line 2243
    move-result v5

    .line 2244
    if-nez v5, :cond_5f

    .line 2245
    .line 2246
    goto :goto_f

    .line 2247
    :cond_5f
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2248
    .line 2249
    const-string v3, "@Tag type "

    .line 2250
    .line 2251
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2252
    .line 2253
    .line 2254
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2255
    .line 2256
    .line 2257
    move-result-object v0

    .line 2258
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2259
    .line 2260
    .line 2261
    const-string v0, " is duplicate of "

    .line 2262
    .line 2263
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2264
    .line 2265
    .line 2266
    sget-object v0, Lretrofit2/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏兰哲:Lretrofit2/飘花落叶言子楪世苏兰哲;

    .line 2267
    .line 2268
    invoke-virtual {v0, v1, v4}, Lretrofit2/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/reflect/Method;I)Ljava/lang/String;

    .line 2269
    .line 2270
    .line 2271
    move-result-object v0

    .line 2272
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2273
    .line 2274
    .line 2275
    const-string v0, " and would always overwrite its value."

    .line 2276
    .line 2277
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2278
    .line 2279
    .line 2280
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2281
    .line 2282
    .line 2283
    move-result-object v0

    .line 2284
    const/4 v11, 0x0

    .line 2285
    new-array v2, v11, [Ljava/lang/Object;

    .line 2286
    .line 2287
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2288
    .line 2289
    .line 2290
    move-result-object v0

    .line 2291
    throw v0

    .line 2292
    :cond_60
    :goto_f
    add-int/lit8 v4, v4, -0x1

    .line 2293
    .line 2294
    goto :goto_e

    .line 2295
    :cond_61
    new-instance v4, Lretrofit2/飘花落叶言子世哲楪苏兰;

    .line 2296
    .line 2297
    invoke-direct {v4, v0}, Lretrofit2/飘花落叶言子世哲楪苏兰;-><init>(Ljava/lang/Class;)V

    .line 2298
    .line 2299
    .line 2300
    goto :goto_10

    .line 2301
    :cond_62
    const/4 v4, 0x0

    .line 2302
    :goto_10
    if-nez v4, :cond_63

    .line 2303
    .line 2304
    goto :goto_11

    .line 2305
    :cond_63
    if-nez v16, :cond_64

    .line 2306
    .line 2307
    move-object/from16 v16, v4

    .line 2308
    .line 2309
    :goto_11
    add-int/lit8 v9, v22, 0x1

    .line 2310
    .line 2311
    move-object/from16 v0, p0

    .line 2312
    .line 2313
    move-object/from16 v4, v17

    .line 2314
    .line 2315
    move/from16 v8, v18

    .line 2316
    .line 2317
    move/from16 v6, v19

    .line 2318
    .line 2319
    move/from16 v14, v20

    .line 2320
    .line 2321
    move-object/from16 v7, v21

    .line 2322
    .line 2323
    move-object/from16 v11, v23

    .line 2324
    .line 2325
    move/from16 v15, v24

    .line 2326
    .line 2327
    const/4 v5, 0x0

    .line 2328
    goto/16 :goto_7

    .line 2329
    .line 2330
    :cond_64
    const-string v0, "Multiple Retrofit annotations found, only one allowed."

    .line 2331
    .line 2332
    const/4 v11, 0x0

    .line 2333
    new-array v2, v11, [Ljava/lang/Object;

    .line 2334
    .line 2335
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2336
    .line 2337
    .line 2338
    move-result-object v0

    .line 2339
    throw v0

    .line 2340
    :cond_65
    :goto_12
    move-object/from16 v17, v4

    .line 2341
    .line 2342
    move/from16 v19, v6

    .line 2343
    .line 2344
    move-object/from16 v21, v7

    .line 2345
    .line 2346
    move/from16 v18, v8

    .line 2347
    .line 2348
    move-object/from16 v23, v11

    .line 2349
    .line 2350
    move/from16 v20, v14

    .line 2351
    .line 2352
    goto :goto_13

    .line 2353
    :cond_66
    const/16 v16, 0x0

    .line 2354
    .line 2355
    goto :goto_12

    .line 2356
    :goto_13
    if-nez v16, :cond_68

    .line 2357
    .line 2358
    if-eqz v20, :cond_67

    .line 2359
    .line 2360
    :try_start_2
    invoke-static {v12}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 2361
    .line 2362
    .line 2363
    move-result-object v0

    .line 2364
    const-class v4, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2365
    .line 2366
    if-ne v0, v4, :cond_67

    .line 2367
    .line 2368
    const/4 v15, 0x1

    .line 2369
    iput-boolean v15, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪兰哲苏世:Z
    :try_end_2
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_2 .. :try_end_2} :catch_2

    .line 2370
    .line 2371
    const/16 v16, 0x0

    .line 2372
    .line 2373
    goto :goto_14

    .line 2374
    :catch_2
    :cond_67
    const-string v0, "No Retrofit annotation found."

    .line 2375
    .line 2376
    const/4 v11, 0x0

    .line 2377
    new-array v2, v11, [Ljava/lang/Object;

    .line 2378
    .line 2379
    invoke-static {v1, v10, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2380
    .line 2381
    .line 2382
    move-result-object v0

    .line 2383
    throw v0

    .line 2384
    :cond_68
    :goto_14
    aput-object v16, v23, v10

    .line 2385
    .line 2386
    add-int/lit8 v10, v10, 0x1

    .line 2387
    .line 2388
    move-object/from16 v0, p0

    .line 2389
    .line 2390
    move-object/from16 v4, v17

    .line 2391
    .line 2392
    move/from16 v8, v18

    .line 2393
    .line 2394
    move/from16 v6, v19

    .line 2395
    .line 2396
    move-object/from16 v7, v21

    .line 2397
    .line 2398
    const/4 v5, 0x0

    .line 2399
    const/4 v9, 0x0

    .line 2400
    goto/16 :goto_5

    .line 2401
    .line 2402
    :cond_69
    move-object/from16 v21, v7

    .line 2403
    .line 2404
    iget-object v0, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪兰世苏哲:Ljava/lang/String;

    .line 2405
    .line 2406
    if-nez v0, :cond_6b

    .line 2407
    .line 2408
    iget-boolean v0, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲世兰苏:Z

    .line 2409
    .line 2410
    if-eqz v0, :cond_6a

    .line 2411
    .line 2412
    goto :goto_15

    .line 2413
    :cond_6a
    iget-object v0, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲苏世兰:Ljava/lang/String;

    .line 2414
    .line 2415
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 2416
    .line 2417
    .line 2418
    move-result-object v0

    .line 2419
    const-string v2, "Missing either @%s URL or @Url parameter."

    .line 2420
    .line 2421
    const/4 v3, 0x0

    .line 2422
    invoke-static {v1, v3, v2, v0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世苏兰(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2423
    .line 2424
    .line 2425
    move-result-object v0

    .line 2426
    throw v0

    .line 2427
    :cond_6b
    :goto_15
    iget-boolean v0, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲兰世苏:Z

    .line 2428
    .line 2429
    if-nez v0, :cond_6c

    .line 2430
    .line 2431
    iget-boolean v3, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲兰苏世:Z

    .line 2432
    .line 2433
    if-nez v3, :cond_6c

    .line 2434
    .line 2435
    iget-boolean v3, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲苏兰世:Z

    .line 2436
    .line 2437
    if-nez v3, :cond_6c

    .line 2438
    .line 2439
    iget-boolean v3, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲世兰:Z

    .line 2440
    .line 2441
    if-nez v3, :cond_6d

    .line 2442
    .line 2443
    :cond_6c
    const/4 v3, 0x0

    .line 2444
    const/4 v11, 0x0

    .line 2445
    goto :goto_16

    .line 2446
    :cond_6d
    const-string v0, "Non-body HTTP method cannot contain @Body."

    .line 2447
    .line 2448
    const/4 v11, 0x0

    .line 2449
    new-array v2, v11, [Ljava/lang/Object;

    .line 2450
    .line 2451
    const/4 v3, 0x0

    .line 2452
    invoke-static {v1, v3, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世苏兰(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2453
    .line 2454
    .line 2455
    move-result-object v0

    .line 2456
    throw v0

    .line 2457
    :goto_16
    if-eqz v0, :cond_6f

    .line 2458
    .line 2459
    iget-boolean v0, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世哲兰:Z

    .line 2460
    .line 2461
    if-eqz v0, :cond_6e

    .line 2462
    .line 2463
    goto :goto_17

    .line 2464
    :cond_6e
    const-string v0, "Form-encoded method must contain at least one @Field."

    .line 2465
    .line 2466
    new-array v2, v11, [Ljava/lang/Object;

    .line 2467
    .line 2468
    invoke-static {v1, v3, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世苏兰(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2469
    .line 2470
    .line 2471
    move-result-object v0

    .line 2472
    throw v0

    .line 2473
    :cond_6f
    :goto_17
    iget-boolean v0, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲兰苏世:Z

    .line 2474
    .line 2475
    if-eqz v0, :cond_71

    .line 2476
    .line 2477
    iget-boolean v0, v2, Lretrofit2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世兰哲:Z

    .line 2478
    .line 2479
    if-eqz v0, :cond_70

    .line 2480
    .line 2481
    goto :goto_18

    .line 2482
    :cond_70
    const-string v0, "Multipart method must contain at least one @Part."

    .line 2483
    .line 2484
    new-array v2, v11, [Ljava/lang/Object;

    .line 2485
    .line 2486
    invoke-static {v1, v3, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世苏兰(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2487
    .line 2488
    .line 2489
    move-result-object v0

    .line 2490
    throw v0

    .line 2491
    :cond_71
    :goto_18
    new-instance v0, Lretrofit2/飘花落叶言子世兰楪苏哲;

    .line 2492
    .line 2493
    invoke-direct {v0, v2}, Lretrofit2/飘花落叶言子世兰楪苏哲;-><init>(Lretrofit2/飘花落叶言子世哲兰苏楪;)V

    .line 2494
    .line 2495
    .line 2496
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    .line 2497
    .line 2498
    .line 2499
    move-result-object v2

    .line 2500
    invoke-static {v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏哲兰世(Ljava/lang/reflect/Type;)Z

    .line 2501
    .line 2502
    .line 2503
    move-result v3

    .line 2504
    if-nez v3, :cond_7f

    .line 2505
    .line 2506
    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 2507
    .line 2508
    if-eq v2, v3, :cond_7e

    .line 2509
    .line 2510
    invoke-virtual {v1}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 2511
    .line 2512
    .line 2513
    move-result-object v2

    .line 2514
    const-class v3, Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 2515
    .line 2516
    const-class v4, Lretrofit2/飘花落叶言子世兰楪哲苏;

    .line 2517
    .line 2518
    iget-boolean v5, v0, Lretrofit2/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪苏兰哲世:Z

    .line 2519
    .line 2520
    if-eqz v5, :cond_77

    .line 2521
    .line 2522
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 2523
    .line 2524
    .line 2525
    move-result-object v6

    .line 2526
    array-length v7, v6

    .line 2527
    const/4 v15, 0x1

    .line 2528
    sub-int/2addr v7, v15

    .line 2529
    aget-object v6, v6, v7

    .line 2530
    .line 2531
    check-cast v6, Ljava/lang/reflect/ParameterizedType;

    .line 2532
    .line 2533
    invoke-interface {v6}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 2534
    .line 2535
    .line 2536
    move-result-object v6

    .line 2537
    const/4 v11, 0x0

    .line 2538
    aget-object v6, v6, v11

    .line 2539
    .line 2540
    instance-of v7, v6, Ljava/lang/reflect/WildcardType;

    .line 2541
    .line 2542
    if-eqz v7, :cond_72

    .line 2543
    .line 2544
    check-cast v6, Ljava/lang/reflect/WildcardType;

    .line 2545
    .line 2546
    invoke-interface {v6}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 2547
    .line 2548
    .line 2549
    move-result-object v6

    .line 2550
    aget-object v6, v6, v11

    .line 2551
    .line 2552
    :cond_72
    invoke-static {v6}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 2553
    .line 2554
    .line 2555
    move-result-object v7

    .line 2556
    const-class v8, Lretrofit2/飘花落叶言子楪世兰苏哲;

    .line 2557
    .line 2558
    if-ne v7, v4, :cond_73

    .line 2559
    .line 2560
    instance-of v7, v6, Ljava/lang/reflect/ParameterizedType;

    .line 2561
    .line 2562
    if-eqz v7, :cond_73

    .line 2563
    .line 2564
    check-cast v6, Ljava/lang/reflect/ParameterizedType;

    .line 2565
    .line 2566
    invoke-static {v11, v6}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世哲兰(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 2567
    .line 2568
    .line 2569
    move-result-object v6

    .line 2570
    const/4 v7, 0x1

    .line 2571
    const/4 v9, 0x0

    .line 2572
    goto :goto_1a

    .line 2573
    :cond_73
    invoke-static {v6}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 2574
    .line 2575
    .line 2576
    move-result-object v7

    .line 2577
    if-eq v7, v8, :cond_76

    .line 2578
    .line 2579
    sget-boolean v7, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:Z

    .line 2580
    .line 2581
    if-eqz v7, :cond_74

    .line 2582
    .line 2583
    if-ne v6, v3, :cond_74

    .line 2584
    .line 2585
    const/4 v7, 0x1

    .line 2586
    goto :goto_19

    .line 2587
    :cond_74
    const/4 v7, 0x0

    .line 2588
    :goto_19
    move v9, v7

    .line 2589
    const/4 v7, 0x0

    .line 2590
    :goto_1a
    new-instance v10, Lretrofit2/飘花落叶言子苏楪世哲兰;

    .line 2591
    .line 2592
    const/4 v15, 0x1

    .line 2593
    new-array v11, v15, [Ljava/lang/reflect/Type;

    .line 2594
    .line 2595
    const/4 v12, 0x0

    .line 2596
    aput-object v6, v11, v12

    .line 2597
    .line 2598
    const/4 v6, 0x0

    .line 2599
    invoke-direct {v10, v6, v8, v11}, Lretrofit2/飘花落叶言子苏楪世哲兰;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 2600
    .line 2601
    .line 2602
    const-class v6, Lretrofit2/飘花落叶言子世兰苏哲楪;

    .line 2603
    .line 2604
    invoke-static {v2, v6}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏兰哲世([Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Z

    .line 2605
    .line 2606
    .line 2607
    move-result v6

    .line 2608
    if-eqz v6, :cond_75

    .line 2609
    .line 2610
    goto :goto_1b

    .line 2611
    :cond_75
    array-length v6, v2

    .line 2612
    add-int/2addr v6, v15

    .line 2613
    new-array v6, v6, [Ljava/lang/annotation/Annotation;

    .line 2614
    .line 2615
    sget-object v8, Lretrofit2/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:Lretrofit2/飘花落叶言子世兰哲楪苏;

    .line 2616
    .line 2617
    aput-object v8, v6, v12

    .line 2618
    .line 2619
    array-length v8, v2

    .line 2620
    invoke-static {v2, v12, v6, v15, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2621
    .line 2622
    .line 2623
    move-object v2, v6

    .line 2624
    :goto_1b
    move v6, v9

    .line 2625
    :goto_1c
    move-object/from16 v8, p0

    .line 2626
    .line 2627
    goto :goto_1d

    .line 2628
    :cond_76
    const/4 v12, 0x0

    .line 2629
    check-cast v6, Ljava/lang/reflect/ParameterizedType;

    .line 2630
    .line 2631
    invoke-static {v12, v6}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世哲兰(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 2632
    .line 2633
    .line 2634
    move-result-object v0

    .line 2635
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 2636
    .line 2637
    .line 2638
    move-result-object v0

    .line 2639
    const-string v2, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s"

    .line 2640
    .line 2641
    const/4 v3, 0x0

    .line 2642
    invoke-static {v1, v3, v2, v0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世苏兰(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2643
    .line 2644
    .line 2645
    move-result-object v0

    .line 2646
    throw v0

    .line 2647
    :cond_77
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    .line 2648
    .line 2649
    .line 2650
    move-result-object v10

    .line 2651
    const/4 v6, 0x0

    .line 2652
    const/4 v7, 0x0

    .line 2653
    goto :goto_1c

    .line 2654
    :goto_1d
    :try_start_3
    invoke-virtual {v8, v10, v2}, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/飘花落叶言子楪苏世哲兰;

    .line 2655
    .line 2656
    .line 2657
    move-result-object v2
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_4

    .line 2658
    invoke-interface {v2}, Lretrofit2/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪兰苏哲()Ljava/lang/reflect/Type;

    .line 2659
    .line 2660
    .line 2661
    move-result-object v9

    .line 2662
    const-class v10, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;

    .line 2663
    .line 2664
    if-eq v9, v10, :cond_7d

    .line 2665
    .line 2666
    if-eq v9, v4, :cond_7c

    .line 2667
    .line 2668
    iget-object v4, v0, Lretrofit2/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 2669
    .line 2670
    move-object/from16 v10, v21

    .line 2671
    .line 2672
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2673
    .line 2674
    .line 2675
    move-result v4

    .line 2676
    if-eqz v4, :cond_79

    .line 2677
    .line 2678
    const-class v4, Ljava/lang/Void;

    .line 2679
    .line 2680
    invoke-virtual {v4, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2681
    .line 2682
    .line 2683
    move-result v4

    .line 2684
    if-nez v4, :cond_79

    .line 2685
    .line 2686
    sget-boolean v4, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:Z

    .line 2687
    .line 2688
    if-eqz v4, :cond_78

    .line 2689
    .line 2690
    if-ne v9, v3, :cond_78

    .line 2691
    .line 2692
    goto :goto_1e

    .line 2693
    :cond_78
    const-string v0, "HEAD method must use Void or Unit as response type."

    .line 2694
    .line 2695
    const/4 v11, 0x0

    .line 2696
    new-array v2, v11, [Ljava/lang/Object;

    .line 2697
    .line 2698
    const/4 v3, 0x0

    .line 2699
    invoke-static {v1, v3, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世苏兰(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2700
    .line 2701
    .line 2702
    move-result-object v0

    .line 2703
    throw v0

    .line 2704
    :cond_79
    :goto_1e
    invoke-virtual {v1}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 2705
    .line 2706
    .line 2707
    move-result-object v3

    .line 2708
    :try_start_4
    invoke-virtual {v8, v9, v3}, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/飘花落叶言子楪哲世兰苏;

    .line 2709
    .line 2710
    .line 2711
    move-result-object v4
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_3

    .line 2712
    iget-object v1, v8, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 2713
    .line 2714
    move-object v3, v1

    .line 2715
    check-cast v3, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;

    .line 2716
    .line 2717
    if-nez v5, :cond_7a

    .line 2718
    .line 2719
    new-instance v1, Lretrofit2/飘花落叶言子楪哲兰世苏;

    .line 2720
    .line 2721
    const/4 v6, 0x0

    .line 2722
    move-object v5, v2

    .line 2723
    move-object v2, v0

    .line 2724
    invoke-direct/range {v1 .. v6}, Lretrofit2/飘花落叶言子楪哲兰世苏;-><init>(Lretrofit2/飘花落叶言子世兰楪苏哲;L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;Lretrofit2/飘花落叶言子楪哲世兰苏;Lretrofit2/飘花落叶言子楪苏世哲兰;I)V

    .line 2725
    .line 2726
    .line 2727
    return-object v1

    .line 2728
    :cond_7a
    move-object v5, v2

    .line 2729
    move-object v2, v0

    .line 2730
    if-eqz v7, :cond_7b

    .line 2731
    .line 2732
    new-instance v1, Lretrofit2/飘花落叶言子楪哲兰世苏;

    .line 2733
    .line 2734
    const/4 v6, 0x1

    .line 2735
    invoke-direct/range {v1 .. v6}, Lretrofit2/飘花落叶言子楪哲兰世苏;-><init>(Lretrofit2/飘花落叶言子世兰楪苏哲;L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;Lretrofit2/飘花落叶言子楪哲世兰苏;Lretrofit2/飘花落叶言子楪苏世哲兰;I)V

    .line 2736
    .line 2737
    .line 2738
    return-object v1

    .line 2739
    :cond_7b
    new-instance v1, Lretrofit2/飘花落叶言子楪哲兰苏世;

    .line 2740
    .line 2741
    invoke-direct/range {v1 .. v6}, Lretrofit2/飘花落叶言子楪哲兰苏世;-><init>(Lretrofit2/飘花落叶言子世兰楪苏哲;L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;Lretrofit2/飘花落叶言子楪哲世兰苏;Lretrofit2/飘花落叶言子楪苏世哲兰;Z)V

    .line 2742
    .line 2743
    .line 2744
    return-object v1

    .line 2745
    :catch_3
    move-exception v0

    .line 2746
    const-string v2, "Unable to create converter for %s"

    .line 2747
    .line 2748
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 2749
    .line 2750
    .line 2751
    move-result-object v3

    .line 2752
    invoke-static {v1, v0, v2, v3}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世苏兰(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2753
    .line 2754
    .line 2755
    move-result-object v0

    .line 2756
    throw v0

    .line 2757
    :cond_7c
    const-string v0, "Response must include generic type (e.g., Response<String>)"

    .line 2758
    .line 2759
    const/4 v11, 0x0

    .line 2760
    new-array v2, v11, [Ljava/lang/Object;

    .line 2761
    .line 2762
    const/4 v3, 0x0

    .line 2763
    invoke-static {v1, v3, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世苏兰(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2764
    .line 2765
    .line 2766
    move-result-object v0

    .line 2767
    throw v0

    .line 2768
    :cond_7d
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2769
    .line 2770
    const-string v2, "\'"

    .line 2771
    .line 2772
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2773
    .line 2774
    .line 2775
    invoke-static {v9}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 2776
    .line 2777
    .line 2778
    move-result-object v2

    .line 2779
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2780
    .line 2781
    .line 2782
    move-result-object v2

    .line 2783
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2784
    .line 2785
    .line 2786
    const-string v2, "\' is not a valid response body type. Did you mean ResponseBody?"

    .line 2787
    .line 2788
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2789
    .line 2790
    .line 2791
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2792
    .line 2793
    .line 2794
    move-result-object v0

    .line 2795
    const/4 v11, 0x0

    .line 2796
    new-array v2, v11, [Ljava/lang/Object;

    .line 2797
    .line 2798
    const/4 v3, 0x0

    .line 2799
    invoke-static {v1, v3, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世苏兰(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2800
    .line 2801
    .line 2802
    move-result-object v0

    .line 2803
    throw v0

    .line 2804
    :catch_4
    move-exception v0

    .line 2805
    const-string v2, "Unable to create call adapter for %s"

    .line 2806
    .line 2807
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 2808
    .line 2809
    .line 2810
    move-result-object v3

    .line 2811
    invoke-static {v1, v0, v2, v3}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世苏兰(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2812
    .line 2813
    .line 2814
    move-result-object v0

    .line 2815
    throw v0

    .line 2816
    :cond_7e
    const/4 v3, 0x0

    .line 2817
    const/4 v11, 0x0

    .line 2818
    const-string v0, "Service methods cannot return void."

    .line 2819
    .line 2820
    new-array v2, v11, [Ljava/lang/Object;

    .line 2821
    .line 2822
    invoke-static {v1, v3, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世苏兰(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2823
    .line 2824
    .line 2825
    move-result-object v0

    .line 2826
    throw v0

    .line 2827
    :cond_7f
    const/4 v3, 0x0

    .line 2828
    const-string v0, "Method return type must not include a type variable or wildcard: %s"

    .line 2829
    .line 2830
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 2831
    .line 2832
    .line 2833
    move-result-object v2

    .line 2834
    invoke-static {v1, v3, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世苏兰(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2835
    .line 2836
    .line 2837
    move-result-object v0

    .line 2838
    throw v0

    .line 2839
    :cond_80
    move v11, v5

    .line 2840
    move-object v3, v9

    .line 2841
    const-string v0, "HTTP method annotation is required (e.g., @GET, @POST, etc.)."

    .line 2842
    .line 2843
    new-array v2, v11, [Ljava/lang/Object;

    .line 2844
    .line 2845
    invoke-static {v1, v3, v0, v2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世苏兰(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 2846
    .line 2847
    .line 2848
    move-result-object v0

    .line 2849
    throw v0
.end method


# virtual methods
.method public abstract 飘花落叶言子楪世苏哲兰(Lretrofit2/飘花落叶言子世楪哲苏兰;[Ljava/lang/Object;)Ljava/lang/Object;
.end method
