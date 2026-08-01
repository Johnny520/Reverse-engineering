.class public final synthetic L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 12
    iput p2, p0, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    iput-object p1, p0, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    iput-object p3, p0, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    .line 1
    iget v0, p0, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const-wide v1, -0x36a594ab051405a7L    # -2.356677228030329E45

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const-wide v3, -0x36a57a37051405a7L    # -2.3658947967854835E45

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x1

    .line 15
    iget-object v7, p0, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object p0, p0, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 18
    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    check-cast p0, Landroid/content/res/Resources;

    .line 23
    .line 24
    check-cast v7, Ljava/lang/String;

    .line 25
    .line 26
    :try_start_0
    new-array v0, v6, [Landroid/content/res/loader/ResourcesLoader;

    .line 27
    .line 28
    sget-object v1, L飘花落叶言世兰哲子楪苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:Landroid/content/res/loader/ResourcesLoader;

    .line 29
    .line 30
    aput-object v1, v0, v5

    .line 31
    .line 32
    invoke-static {p0, v0}, Landroidx/core/view/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪苏兰世哲(Landroid/content/res/Resources;[Landroid/content/res/loader/ResourcesLoader;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p0, v7}, L飘花落叶言世兰哲子楪苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏哲兰楪(Landroid/content/res/Resources;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catch_0
    move-exception v0

    .line 40
    const-string v1, "Cannot modify resource loaders of ResourcesImpl not registered with ResourcesManager"

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    const-string v1, "ActivityProxy"

    .line 53
    .line 54
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    invoke-static {p0, v7}, L飘花落叶言世兰哲子楪苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏哲兰楪(Landroid/content/res/Resources;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :goto_0
    return-void

    .line 65
    :cond_0
    throw v0

    .line 66
    :pswitch_0
    move-object v10, p0

    .line 67
    check-cast v10, Ljava/util/List;

    .line 68
    .line 69
    check-cast v7, L飘花落叶言子苏世兰楪哲/飘花落叶言子楪苏兰哲世;

    .line 70
    .line 71
    iget-object p0, v7, L飘花落叶言子苏世兰楪哲/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p0, Landroid/os/Handler;

    .line 74
    .line 75
    new-instance v0, Lkotlin/jvm/internal/Ref$IntRef;

    .line 76
    .line 77
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 78
    .line 79
    .line 80
    new-instance v1, Lkotlin/jvm/internal/Ref$IntRef;

    .line 81
    .line 82
    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    :goto_1
    move v9, v5

    .line 90
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_1

    .line 95
    .line 96
    add-int/lit8 v5, v9, 0x1

    .line 97
    .line 98
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    move-object v11, v3

    .line 103
    check-cast v11, Ljava/lang/String;

    .line 104
    .line 105
    int-to-float v3, v5

    .line 106
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    int-to-float v4, v4

    .line 111
    div-float v12, v3, v4

    .line 112
    .line 113
    new-instance v8, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪世苏兰哲;

    .line 114
    .line 115
    const/4 v13, 0x1

    .line 116
    invoke-direct/range {v8 .. v13}, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪世苏兰哲;-><init>(ILjava/util/List;Ljava/lang/String;FI)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 120
    .line 121
    .line 122
    :try_start_1
    invoke-static {v11}, Llin/xposed/hook/util/qq/QQNTTroopSettingTool;->quitGroup(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    iget v3, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 126
    .line 127
    add-int/2addr v3, v6

    .line 128
    iput v3, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :catch_1
    iget v3, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 132
    .line 133
    add-int/2addr v3, v6

    .line 134
    iput v3, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_1
    new-instance v2, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪世哲苏兰;

    .line 138
    .line 139
    invoke-direct {v2, v1, v10, v0, v6}, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪世哲苏兰;-><init>(Lkotlin/jvm/internal/Ref$IntRef;Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;I)V

    .line 140
    .line 141
    .line 142
    const-wide/16 v0, 0x12c

    .line 143
    .line 144
    invoke-virtual {p0, v2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :pswitch_1
    check-cast p0, Ljava/util/ArrayList;

    .line 149
    .line 150
    check-cast v7, L飘花落叶言子苏世兰楪哲/飘花落叶言子楪苏兰哲世;

    .line 151
    .line 152
    invoke-static {}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世哲苏兰楪()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_2

    .line 160
    .line 161
    const-wide v0, -0x36a4325b051405a7L    # -2.4801371152671163E45

    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    sget-object v0, Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;->WARNING:Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 171
    .line 172
    invoke-static {p0, v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰哲楪;->飘花落叶言子世兰哲楪苏(Ljava/lang/String;Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;)V

    .line 173
    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_2
    new-instance v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 177
    .line 178
    invoke-direct {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;-><init>()V

    .line 179
    .line 180
    .line 181
    new-instance v1, Ljava/lang/StringBuilder;

    .line 182
    .line 183
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 184
    .line 185
    .line 186
    const-wide v2, -0x36a43294051405a7L    # -2.4800595308874583E45

    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    const/16 v2, 0x29

    .line 206
    .line 207
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    iput-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪:Ljava/lang/CharSequence;

    .line 215
    .line 216
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 217
    .line 218
    .line 219
    const-wide v1, -0x36a4329c051405a7L    # -2.4800486418517168E45

    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    iput-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰:Ljava/lang/CharSequence;

    .line 229
    .line 230
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0, v6}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪哲苏(Z)V

    .line 234
    .line 235
    .line 236
    new-instance v1, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世哲兰苏;

    .line 237
    .line 238
    invoke-direct {v1, v7, p0}, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世哲兰苏;-><init>(L飘花落叶言子苏世兰楪哲/飘花落叶言子楪苏兰哲世;Ljava/util/ArrayList;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0, v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰苏楪哲(Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 242
    .line 243
    .line 244
    const-wide v1, -0x36a519a9051405a7L    # -2.3995391949676905E45

    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    iput-object p0, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世兰哲:Ljava/lang/String;

    .line 254
    .line 255
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰()V

    .line 259
    .line 260
    .line 261
    iput-object v0, v7, L飘花落叶言子苏世兰楪哲/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 262
    .line 263
    :goto_2
    return-void

    .line 264
    :pswitch_2
    move-object v10, p0

    .line 265
    check-cast v10, Ljava/util/List;

    .line 266
    .line 267
    check-cast v7, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪世兰苏哲;

    .line 268
    .line 269
    iget-object p0, v7, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:Landroid/os/Handler;

    .line 270
    .line 271
    new-instance v0, Lkotlin/jvm/internal/Ref$IntRef;

    .line 272
    .line 273
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 274
    .line 275
    .line 276
    new-instance v1, Lkotlin/jvm/internal/Ref$IntRef;

    .line 277
    .line 278
    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 279
    .line 280
    .line 281
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    move v9, v5

    .line 286
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 287
    .line 288
    .line 289
    move-result v3

    .line 290
    if-eqz v3, :cond_3

    .line 291
    .line 292
    add-int/lit8 v3, v9, 0x1

    .line 293
    .line 294
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    move-object v11, v4

    .line 299
    check-cast v11, Ljava/lang/String;

    .line 300
    .line 301
    int-to-float v4, v3

    .line 302
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 303
    .line 304
    .line 305
    move-result v7

    .line 306
    int-to-float v7, v7

    .line 307
    div-float v12, v4, v7

    .line 308
    .line 309
    new-instance v8, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪世苏兰哲;

    .line 310
    .line 311
    const/4 v13, 0x0

    .line 312
    invoke-direct/range {v8 .. v13}, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪世苏兰哲;-><init>(ILjava/util/List;Ljava/lang/String;FI)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {p0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 316
    .line 317
    .line 318
    :try_start_2
    sget-object v4, L飘花落叶言苏世楪子兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世楪子兰哲/飘花落叶言子楪世苏哲兰;

    .line 319
    .line 320
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    invoke-static {v11}, L飘花落叶言苏世楪子兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    iget v4, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 327
    .line 328
    add-int/2addr v4, v6

    .line 329
    iput v4, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 330
    .line 331
    goto :goto_4

    .line 332
    :catch_2
    iget v4, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 333
    .line 334
    add-int/2addr v4, v6

    .line 335
    iput v4, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 336
    .line 337
    :goto_4
    move v9, v3

    .line 338
    goto :goto_3

    .line 339
    :cond_3
    new-instance v2, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪世哲苏兰;

    .line 340
    .line 341
    invoke-direct {v2, v1, v10, v0, v5}, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪世哲苏兰;-><init>(Lkotlin/jvm/internal/Ref$IntRef;Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;I)V

    .line 342
    .line 343
    .line 344
    const-wide/16 v0, 0xc8

    .line 345
    .line 346
    invoke-virtual {p0, v2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 347
    .line 348
    .line 349
    return-void

    .line 350
    :pswitch_3
    check-cast p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子世兰楪苏哲;

    .line 351
    .line 352
    check-cast v7, Ljava/lang/String;

    .line 353
    .line 354
    invoke-virtual {p0, v7}, L飘花落叶言世苏兰哲子楪/飘花落叶言子世兰楪苏哲;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    return-void

    .line 358
    :pswitch_4
    check-cast v7, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;

    .line 359
    .line 360
    check-cast p0, Ljava/lang/String;

    .line 361
    .line 362
    invoke-virtual {v7, p0}, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    return-void

    .line 366
    :pswitch_5
    check-cast p0, Landroid/content/Context;

    .line 367
    .line 368
    check-cast v7, L飘花落叶言世苏兰哲子楪/飘花落叶言子世兰楪苏哲;

    .line 369
    .line 370
    sget-object v6, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Landroid/os/Handler;

    .line 371
    .line 372
    :try_start_3
    invoke-static {p0}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(Landroid/content/Context;)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object p0

    .line 376
    new-instance v0, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲苏兰;

    .line 377
    .line 378
    const/4 v8, 0x3

    .line 379
    invoke-direct {v0, v7, v8, p0}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v6, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 383
    .line 384
    .line 385
    goto :goto_5

    .line 386
    :catch_3
    move-exception v0

    .line 387
    move-object p0, v0

    .line 388
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    invoke-static {v0, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 404
    .line 405
    .line 406
    new-instance p0, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲兰苏;

    .line 407
    .line 408
    invoke-direct {p0, v7, v5}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;I)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v6, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 412
    .line 413
    .line 414
    :goto_5
    return-void

    .line 415
    :pswitch_6
    check-cast p0, Landroid/content/Context;

    .line 416
    .line 417
    check-cast v7, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;

    .line 418
    .line 419
    sget-object v0, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Landroid/os/Handler;

    .line 420
    .line 421
    const-wide v8, -0x36a44e96051405a7L    # -2.4703002326041658E45

    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    :try_start_4
    invoke-static {v8, v9}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    invoke-static {p0, v0}, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Landroid/content/Context;Ljava/lang/String;)I

    .line 431
    .line 432
    .line 433
    move-result v0

    .line 434
    const-wide v8, -0x36a44e7e051405a7L    # -2.4703328997113902E45

    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    invoke-static {v8, v9}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v8

    .line 443
    invoke-static {p0, v8}, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Landroid/content/Context;Ljava/lang/String;)I

    .line 444
    .line 445
    .line 446
    move-result v8

    .line 447
    if-eqz v0, :cond_4

    .line 448
    .line 449
    if-nez v8, :cond_5

    .line 450
    .line 451
    :cond_4
    move v5, v6

    .line 452
    :cond_5
    if-nez v5, :cond_6

    .line 453
    .line 454
    goto/16 :goto_9

    .line 455
    .line 456
    :cond_6
    :goto_6
    invoke-static {p0}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Landroid/content/Context;)Z

    .line 457
    .line 458
    .line 459
    move-result v0

    .line 460
    if-nez v0, :cond_7

    .line 461
    .line 462
    const-wide/16 v5, 0x3e8

    .line 463
    .line 464
    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V

    .line 465
    .line 466
    .line 467
    goto :goto_6

    .line 468
    :catch_4
    move-exception v0

    .line 469
    move-object p0, v0

    .line 470
    goto :goto_8

    .line 471
    :cond_7
    const-wide v5, -0x36a570c0051405a7L    # -2.3691928134856812E45

    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    const-wide v5, -0x36a44ee4051405a7L    # -2.4701940645056865E45

    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 493
    .line 494
    .line 495
    check-cast v0, Landroid/location/LocationManager;

    .line 496
    .line 497
    const-wide v5, -0x36a44ea2051405a7L    # -2.4702838990505536E45

    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object v5

    .line 506
    invoke-virtual {v0, v5}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    .line 507
    .line 508
    .line 509
    move-result v5

    .line 510
    if-eqz v5, :cond_8

    .line 511
    .line 512
    goto :goto_7

    .line 513
    :cond_8
    const-wide v5, -0x36a44eae051405a7L    # -2.4702675654969414E45

    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v5

    .line 522
    invoke-virtual {v0, v5}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    .line 523
    .line 524
    .line 525
    move-result v0

    .line 526
    if-eqz v0, :cond_9

    .line 527
    .line 528
    :goto_7
    invoke-static {p0}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Landroid/content/Context;)Z

    .line 529
    .line 530
    .line 531
    move-result v0

    .line 532
    if-eqz v0, :cond_9

    .line 533
    .line 534
    const-wide/32 v5, 0x1b7740

    .line 535
    .line 536
    .line 537
    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V

    .line 538
    .line 539
    .line 540
    invoke-static {p0}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(Landroid/content/Context;)Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    sget-object v5, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Landroid/os/Handler;

    .line 545
    .line 546
    new-instance v6, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲苏兰;

    .line 547
    .line 548
    invoke-direct {v6, v7, v0}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;Ljava/lang/String;)V

    .line 549
    .line 550
    .line 551
    invoke-virtual {v5, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 552
    .line 553
    .line 554
    goto :goto_7

    .line 555
    :goto_8
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v1

    .line 570
    invoke-static {v0, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 571
    .line 572
    .line 573
    :cond_9
    :goto_9
    return-void

    .line 574
    nop

    .line 575
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
