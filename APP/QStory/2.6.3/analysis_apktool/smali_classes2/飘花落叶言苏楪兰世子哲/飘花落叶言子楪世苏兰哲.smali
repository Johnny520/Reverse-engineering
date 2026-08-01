.class public final synthetic L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世哲兰苏;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世哲兰苏;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世哲兰苏;

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
    .locals 8

    .line 1
    iget v0, p0, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    sget-object v3, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 6
    .line 7
    iget-object p0, p0, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世哲兰苏;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1, v1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    return-object v3

    .line 21
    :pswitch_0
    check-cast p1, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲兰苏;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1, v1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏(L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲兰苏;Z)V

    .line 27
    .line 28
    .line 29
    return-object v3

    .line 30
    :pswitch_1
    check-cast p1, Ltop/suzhelan/plugin/sdk/online/entity/Message;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Ltop/suzhelan/plugin/sdk/online/entity/Message;->飘花落叶言子楪世苏兰哲()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object p0, p0, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroid/content/Context;

    .line 40
    .line 41
    const-string v0, "clipboard"

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    check-cast p0, Landroid/content/ClipboardManager;

    .line 51
    .line 52
    const-string v0, "\u6d88\u606f\u5185\u5bb9"

    .line 53
    .line 54
    invoke-static {v0, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p0, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 59
    .line 60
    .line 61
    const-string p0, "\u5df2\u590d\u5236\u6d88\u606f\u5185\u5bb9"

    .line 62
    .line 63
    invoke-static {p0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子世哲兰苏楪(Ljava/lang/String;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰楪哲;

    .line 64
    .line 65
    .line 66
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_2
    check-cast p1, Ltop/suzhelan/plugin/sdk/online/entity/Message;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Ltop/suzhelan/plugin/sdk/online/entity/Message;->飘花落叶言子楪苏哲世兰()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_0

    .line 79
    .line 80
    iget-object v0, p0, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世哲苏兰;

    .line 81
    .line 82
    invoke-virtual {p1}, Ltop/suzhelan/plugin/sdk/online/entity/Message;->飘花落叶言子楪世兰苏哲()I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    new-instance v4, Landroidx/activity/compose/飘花落叶言子楪世苏兰哲;

    .line 87
    .line 88
    const/16 v5, 0x15

    .line 89
    .line 90
    invoke-direct {v4, p0, v5, p1}, Landroidx/activity/compose/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v1, v4}, Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(ILandroidx/activity/compose/飘花落叶言子楪世苏兰哲;)V

    .line 94
    .line 95
    .line 96
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Ltop/suzhelan/plugin/sdk/online/entity/Message;->飘花落叶言子楪世苏兰哲()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v0, "\n\n"

    .line 109
    .line 110
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    sget v1, L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 114
    .line 115
    invoke-virtual {p1}, Ltop/suzhelan/plugin/sdk/online/entity/Message;->飘花落叶言子楪世哲苏兰()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-static {v1}, Ljava/time/Instant;->parse(Ljava/lang/CharSequence;)Ljava/time/Instant;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    const-string v4, "yyyy-MM-dd HH:mm:ss"

    .line 127
    .line 128
    invoke-static {v4}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    invoke-static {}, Ljava/time/ZoneId;->systemDefault()Ljava/time/ZoneId;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    invoke-virtual {v1, v5}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {v1, v4}, Ljava/time/ZonedDateTime;->format(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    const-string v4, "\u65f6\u95f4: "

    .line 148
    .line 149
    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1}, Ltop/suzhelan/plugin/sdk/online/entity/Message;->飘花落叶言子楪苏世哲兰()I

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    const/4 v4, 0x5

    .line 161
    const-string v5, "\n\n\u811a\u672c\u540d\u79f0: "

    .line 162
    .line 163
    const-string v6, "\u672a\u77e5"

    .line 164
    .line 165
    if-eq v1, v2, :cond_b

    .line 166
    .line 167
    const/4 v2, 0x2

    .line 168
    if-eq v1, v2, :cond_8

    .line 169
    .line 170
    const/4 v2, 0x3

    .line 171
    if-eq v1, v2, :cond_8

    .line 172
    .line 173
    const/4 v2, 0x4

    .line 174
    const-string v7, "\u533f\u540d"

    .line 175
    .line 176
    if-eq v1, v2, :cond_4

    .line 177
    .line 178
    if-eq v1, v4, :cond_1

    .line 179
    .line 180
    goto/16 :goto_6

    .line 181
    .line 182
    :cond_1
    invoke-virtual {p1}, Ltop/suzhelan/plugin/sdk/online/entity/Message;->飘花落叶言子楪世哲兰苏()L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲苏兰;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    if-eqz v1, :cond_d

    .line 187
    .line 188
    invoke-virtual {v1}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    if-nez v2, :cond_2

    .line 193
    .line 194
    goto :goto_0

    .line 195
    :cond_2
    move-object v6, v2

    .line 196
    :goto_0
    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰()L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    if-eqz v1, :cond_d

    .line 208
    .line 209
    invoke-virtual {v1}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    if-nez v2, :cond_3

    .line 214
    .line 215
    goto :goto_1

    .line 216
    :cond_3
    move-object v7, v2

    .line 217
    :goto_1
    invoke-virtual {v1}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    new-instance v2, Ljava/lang/StringBuilder;

    .line 222
    .line 223
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    const-string v0, "\u8bc4\u8bba:\n"

    .line 230
    .line 231
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    goto/16 :goto_6

    .line 245
    .line 246
    :cond_4
    invoke-virtual {p1}, Ltop/suzhelan/plugin/sdk/online/entity/Message;->飘花落叶言子楪世哲兰苏()L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲苏兰;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    if-eqz v1, :cond_d

    .line 251
    .line 252
    invoke-virtual {v1}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    if-nez v2, :cond_5

    .line 257
    .line 258
    goto :goto_2

    .line 259
    :cond_5
    move-object v6, v2

    .line 260
    :goto_2
    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲()L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    if-eqz v2, :cond_6

    .line 272
    .line 273
    invoke-virtual {v2}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    new-instance v5, Ljava/lang/StringBuilder;

    .line 278
    .line 279
    const-string v6, "\n\n\u6211\u7684\u8bc4\u8bba:\n"

    .line 280
    .line 281
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    :cond_6
    invoke-virtual {v1}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏()L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    if-eqz v1, :cond_d

    .line 299
    .line 300
    invoke-virtual {v1}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    if-nez v2, :cond_7

    .line 305
    .line 306
    goto :goto_3

    .line 307
    :cond_7
    move-object v7, v2

    .line 308
    :goto_3
    invoke-virtual {v1}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    new-instance v2, Ljava/lang/StringBuilder;

    .line 313
    .line 314
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    const-string v0, "\u7684\u56de\u590d:\n"

    .line 321
    .line 322
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    goto :goto_6

    .line 336
    :cond_8
    invoke-virtual {p1}, Ltop/suzhelan/plugin/sdk/online/entity/Message;->飘花落叶言子楪世哲兰苏()L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲苏兰;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    if-eqz v0, :cond_d

    .line 341
    .line 342
    invoke-virtual {v0}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    if-nez v1, :cond_9

    .line 347
    .line 348
    goto :goto_4

    .line 349
    :cond_9
    move-object v6, v1

    .line 350
    :goto_4
    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v0}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    if-eqz v1, :cond_a

    .line 362
    .line 363
    const-string v2, "\n\u5904\u7406\u4eba: "

    .line 364
    .line 365
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    :cond_a
    invoke-virtual {v0}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲()Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    if-eqz v0, :cond_d

    .line 377
    .line 378
    const-string v1, "\n\u8bf4\u660e: "

    .line 379
    .line 380
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    goto :goto_6

    .line 388
    :cond_b
    invoke-virtual {p1}, Ltop/suzhelan/plugin/sdk/online/entity/Message;->飘花落叶言子楪世哲兰苏()L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲苏兰;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    if-eqz v0, :cond_d

    .line 393
    .line 394
    invoke-virtual {v0}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    if-nez v0, :cond_c

    .line 399
    .line 400
    goto :goto_5

    .line 401
    :cond_c
    move-object v6, v0

    .line 402
    :goto_5
    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    :cond_d
    :goto_6
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object p0

    .line 413
    invoke-virtual {p1}, Ltop/suzhelan/plugin/sdk/online/entity/Message;->飘花落叶言子楪世兰哲苏()Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object p1

    .line 417
    invoke-static {p0, p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪(Ljava/lang/CharSequence;Ljava/lang/String;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 418
    .line 419
    .line 420
    move-result-object p0

    .line 421
    new-instance p1, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏哲兰世;

    .line 422
    .line 423
    invoke-direct {p1, v4}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏哲兰世;-><init>(I)V

    .line 424
    .line 425
    .line 426
    const-string v0, "\u786e\u5b9a"

    .line 427
    .line 428
    invoke-virtual {p0, v0, p1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲楪苏(Ljava/lang/String;Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰哲世;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 429
    .line 430
    .line 431
    return-object v3

    .line 432
    :pswitch_3
    check-cast p1, Ljava/lang/String;

    .line 433
    .line 434
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    invoke-virtual {p0, p1, v2}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;Z)V

    .line 438
    .line 439
    .line 440
    return-object v3

    .line 441
    :pswitch_4
    check-cast p1, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲兰苏;

    .line 442
    .line 443
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    invoke-virtual {p0, p1, v2}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏(L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲兰苏;Z)V

    .line 447
    .line 448
    .line 449
    return-object v3

    .line 450
    nop

    .line 451
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
