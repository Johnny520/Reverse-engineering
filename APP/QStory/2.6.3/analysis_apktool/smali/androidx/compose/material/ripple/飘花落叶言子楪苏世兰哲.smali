.class public final synthetic Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 4
    .line 5
    const/4 v3, 0x2

    .line 6
    const/16 v4, 0x493

    .line 7
    .line 8
    const/16 v5, 0x492

    .line 9
    .line 10
    const-wide/16 v6, 0x3e8

    .line 11
    .line 12
    const/16 v8, 0x3b2

    .line 13
    .line 14
    const/16 v9, 0x490

    .line 15
    .line 16
    const/16 v10, 0x444

    .line 17
    .line 18
    const/4 v11, 0x1

    .line 19
    const/4 v12, 0x0

    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世兰哲苏;

    .line 26
    .line 27
    invoke-virtual {v0}, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    invoke-static {v10}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v0, v0, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1, v0}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void

    .line 43
    :pswitch_0
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世哲苏兰;

    .line 46
    .line 47
    iget-object v0, v0, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;

    .line 48
    .line 49
    :try_start_0
    new-instance v1, Ljava/text/SimpleDateFormat;

    .line 50
    .line 51
    invoke-static {v9}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-direct {v1, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 60
    .line 61
    .line 62
    new-instance v2, Ljava/util/Date;

    .line 63
    .line 64
    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    const/16 v2, 0x4a2

    .line 72
    .line 73
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    const-string v9, ""

    .line 78
    .line 79
    invoke-virtual {v0, v3, v9}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-nez v3, :cond_6

    .line 88
    .line 89
    :goto_0
    invoke-static {v8}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-static {v3}, Llin/xposed/hook/util/qq/Hook_cookie;->getPskey(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    if-nez v3, :cond_1

    .line 98
    .line 99
    invoke-static {v6, v7}, Ljava/lang/Thread;->sleep(J)V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :catch_0
    move-exception v0

    .line 104
    goto :goto_3

    .line 105
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    .line 109
    .line 110
    const/16 v6, 0x4a3

    .line 111
    .line 112
    invoke-static {v6}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    sget-object v6, L飘花落叶言世哲兰楪子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

    .line 127
    .line 128
    const-class v7, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世兰哲苏;

    .line 129
    .line 130
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    check-cast v7, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世兰哲苏;

    .line 135
    .line 136
    if-nez v7, :cond_2

    .line 137
    .line 138
    move v7, v12

    .line 139
    goto :goto_1

    .line 140
    :cond_2
    iget-object v7, v7, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 141
    .line 142
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    :goto_1
    if-eqz v7, :cond_3

    .line 147
    .line 148
    invoke-static {}, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世苏兰()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    :cond_3
    const-class v7, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪苏世哲兰;

    .line 153
    .line 154
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    check-cast v7, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪苏世哲兰;

    .line 159
    .line 160
    if-nez v7, :cond_4

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_4
    iget-object v7, v7, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 164
    .line 165
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 166
    .line 167
    .line 168
    move-result v12

    .line 169
    :goto_2
    invoke-static {v3, v12}, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Z)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    sget v7, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 174
    .line 175
    const-class v7, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世哲兰苏;

    .line 176
    .line 177
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    check-cast v6, L飘花落叶言苏世楪兰子哲/飘花落叶言子楪世苏兰哲;

    .line 182
    .line 183
    iget-object v6, v6, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 184
    .line 185
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 186
    .line 187
    .line 188
    move-result v6

    .line 189
    if-eqz v6, :cond_5

    .line 190
    .line 191
    invoke-static {v3}, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    :cond_5
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    invoke-virtual {v0, v1, v2}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 199
    .line 200
    .line 201
    goto :goto_4

    .line 202
    :goto_3
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    invoke-static {v1, v2, v0, v11}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 211
    .line 212
    .line 213
    :cond_6
    :goto_4
    return-void

    .line 214
    :pswitch_1
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v0, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 217
    .line 218
    iget-object v0, v0, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;

    .line 219
    .line 220
    :try_start_1
    new-instance v1, Ljava/text/SimpleDateFormat;

    .line 221
    .line 222
    invoke-static {v9}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    invoke-direct {v1, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 231
    .line 232
    .line 233
    new-instance v2, Ljava/util/Date;

    .line 234
    .line 235
    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    const/16 v2, 0x491

    .line 243
    .line 244
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    const-string v9, ""

    .line 249
    .line 250
    invoke-virtual {v0, v3, v9}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v3

    .line 258
    if-nez v3, :cond_8

    .line 259
    .line 260
    :goto_5
    invoke-static {v8}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    invoke-static {v3}, Llin/xposed/hook/util/qq/Hook_cookie;->getPskey(Ljava/lang/String;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    if-nez v3, :cond_7

    .line 269
    .line 270
    invoke-static {v6, v7}, Ljava/lang/Thread;->sleep(J)V

    .line 271
    .line 272
    .line 273
    goto :goto_5

    .line 274
    :catch_1
    move-exception v0

    .line 275
    goto :goto_6

    .line 276
    :cond_7
    const-wide/16 v6, 0xbb8

    .line 277
    .line 278
    invoke-static {v6, v7}, Ljava/lang/Thread;->sleep(J)V

    .line 279
    .line 280
    .line 281
    invoke-static {}, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰哲世()Landroid/util/Pair;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    iget-object v6, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v6, Ljava/lang/String;

    .line 288
    .line 289
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v3, Ljava/lang/String;

    .line 292
    .line 293
    invoke-static {v6, v3}, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;Ljava/lang/String;)Z

    .line 294
    .line 295
    .line 296
    move-result v3

    .line 297
    if-eqz v3, :cond_8

    .line 298
    .line 299
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    invoke-virtual {v0, v1, v2}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 304
    .line 305
    .line 306
    goto :goto_7

    .line 307
    :goto_6
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    invoke-static {v1, v2, v0, v11}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 316
    .line 317
    .line 318
    :cond_8
    :goto_7
    return-void

    .line 319
    :pswitch_2
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v0, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪苏哲兰世;

    .line 322
    .line 323
    sget-object v1, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世哲苏:L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏世兰哲;

    .line 324
    .line 325
    new-instance v1, Ljava/io/File;

    .line 326
    .line 327
    sget-object v2, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;

    .line 328
    .line 329
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    invoke-static {}, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 340
    .line 341
    .line 342
    move-result v2

    .line 343
    if-nez v2, :cond_9

    .line 344
    .line 345
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 346
    .line 347
    .line 348
    :cond_9
    invoke-virtual {v0}, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲兰世()V

    .line 349
    .line 350
    .line 351
    return-void

    .line 352
    :pswitch_3
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast v0, Landroidx/compose/ui/platform/飘花落叶言子苏兰世楪哲;

    .line 355
    .line 356
    iput-boolean v12, v0, Landroidx/compose/ui/platform/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏兰哲:Z

    .line 357
    .line 358
    iget-object v1, v0, Landroidx/compose/ui/platform/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 361
    .line 362
    iget-object v2, v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->飘花落叶言子楪苏哲世兰:L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;

    .line 363
    .line 364
    if-eqz v2, :cond_a

    .line 365
    .line 366
    invoke-virtual {v2, v11}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Z)Z

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    if-eqz v2, :cond_a

    .line 371
    .line 372
    iget v1, v0, Landroidx/compose/ui/platform/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世哲苏兰:I

    .line 373
    .line 374
    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰(I)V

    .line 375
    .line 376
    .line 377
    goto :goto_8

    .line 378
    :cond_a
    iget v2, v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->飘花落叶言子楪苏世兰哲:I

    .line 379
    .line 380
    if-ne v2, v3, :cond_b

    .line 381
    .line 382
    iget v0, v0, Landroidx/compose/ui/platform/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世哲苏兰:I

    .line 383
    .line 384
    invoke-virtual {v1, v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->飘花落叶言子楪哲兰苏世(I)V

    .line 385
    .line 386
    .line 387
    :cond_b
    :goto_8
    return-void

    .line 388
    :pswitch_4
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 389
    .line 390
    check-cast v0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;

    .line 391
    .line 392
    iput-boolean v12, v0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世:Z

    .line 393
    .line 394
    sget-object v1, L飘花落叶言楪世兰哲子苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪世兰哲子苏/飘花落叶言子楪世苏兰哲;

    .line 395
    .line 396
    invoke-virtual {v0, v1}, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏(L飘花落叶言世苏楪子兰哲/飘花落叶言子楪世兰哲苏;)V

    .line 397
    .line 398
    .line 399
    iget-object v0, v0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;

    .line 400
    .line 401
    if-eqz v0, :cond_c

    .line 402
    .line 403
    iget-object v0, v0, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 404
    .line 405
    check-cast v0, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世哲兰苏;

    .line 406
    .line 407
    invoke-static {v0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世哲兰苏;)V

    .line 408
    .line 409
    .line 410
    :cond_c
    return-void

    .line 411
    :pswitch_5
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 412
    .line 413
    move-object v1, v0

    .line 414
    check-cast v1, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪哲兰苏世;

    .line 415
    .line 416
    const-string v0, "fetchFonts result is not OK. ("

    .line 417
    .line 418
    iget-object v4, v1, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 419
    .line 420
    monitor-enter v4

    .line 421
    :try_start_2
    iget-object v2, v1, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪兰哲世苏:Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;

    .line 422
    .line 423
    if-nez v2, :cond_d

    .line 424
    .line 425
    monitor-exit v4

    .line 426
    goto/16 :goto_f

    .line 427
    .line 428
    :catchall_0
    move-exception v0

    .line 429
    goto/16 :goto_11

    .line 430
    .line 431
    :cond_d
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 432
    :try_start_3
    invoke-virtual {v1}, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()L飘花落叶言子哲世楪苏兰/飘花落叶言子楪苏世兰哲;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    iget v4, v2, L飘花落叶言子哲世楪苏兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏:I

    .line 437
    .line 438
    if-ne v4, v3, :cond_e

    .line 439
    .line 440
    iget-object v3, v1, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 441
    .line 442
    monitor-enter v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 443
    :try_start_4
    monitor-exit v3

    .line 444
    goto :goto_9

    .line 445
    :catchall_1
    move-exception v0

    .line 446
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 447
    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 448
    :catchall_2
    move-exception v0

    .line 449
    goto/16 :goto_d

    .line 450
    .line 451
    :cond_e
    :goto_9
    if-nez v4, :cond_11

    .line 452
    .line 453
    :try_start_6
    const-string v0, "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"

    .line 454
    .line 455
    sget-object v3, Landroidx/core/os/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Method;

    .line 456
    .line 457
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    iget-object v0, v1, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰苏世:L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏世兰哲;

    .line 461
    .line 462
    iget-object v3, v1, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世:Landroid/content/Context;

    .line 463
    .line 464
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    filled-new-array {v2}, [L飘花落叶言子哲世楪苏兰/飘花落叶言子楪苏世兰哲;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    sget-object v4, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;

    .line 472
    .line 473
    const-string v4, "TypefaceCompat.createFromFontInfo"

    .line 474
    .line 475
    invoke-static {v4}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 476
    .line 477
    .line 478
    :try_start_7
    sget-object v4, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;

    .line 479
    .line 480
    invoke-virtual {v4, v3, v0, v12}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世(Landroid/content/Context;[L飘花落叶言子哲世楪苏兰/飘花落叶言子楪苏世兰哲;I)Landroid/graphics/Typeface;

    .line 481
    .line 482
    .line 483
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 484
    :try_start_8
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 485
    .line 486
    .line 487
    iget-object v3, v1, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世:Landroid/content/Context;

    .line 488
    .line 489
    iget-object v2, v2, L飘花落叶言子哲世楪苏兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroid/net/Uri;

    .line 490
    .line 491
    invoke-static {v3, v2}, L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏兰楪哲(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    .line 492
    .line 493
    .line 494
    move-result-object v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 495
    if-eqz v2, :cond_10

    .line 496
    .line 497
    if-eqz v0, :cond_10

    .line 498
    .line 499
    :try_start_9
    const-string v3, "EmojiCompat.MetadataRepo.create"

    .line 500
    .line 501
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    new-instance v3, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 505
    .line 506
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子苏楪哲世兰(Ljava/nio/MappedByteBuffer;)Landroidx/emoji2/text/flatbuffer/飘花落叶言子楪世苏兰哲;

    .line 507
    .line 508
    .line 509
    move-result-object v2

    .line 510
    invoke-direct {v3, v0, v2}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;-><init>(Landroid/graphics/Typeface;Landroidx/emoji2/text/flatbuffer/飘花落叶言子楪世苏兰哲;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 511
    .line 512
    .line 513
    :try_start_a
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 514
    .line 515
    .line 516
    :try_start_b
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 517
    .line 518
    .line 519
    iget-object v2, v1, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 520
    .line 521
    monitor-enter v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 522
    :try_start_c
    iget-object v0, v1, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪兰哲世苏:Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;

    .line 523
    .line 524
    if-eqz v0, :cond_f

    .line 525
    .line 526
    invoke-virtual {v0, v3}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏楪哲兰(Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;)V

    .line 527
    .line 528
    .line 529
    goto :goto_a

    .line 530
    :catchall_3
    move-exception v0

    .line 531
    goto :goto_b

    .line 532
    :cond_f
    :goto_a
    monitor-exit v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 533
    :try_start_d
    invoke-virtual {v1}, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 534
    .line 535
    .line 536
    goto :goto_f

    .line 537
    :goto_b
    :try_start_e
    monitor-exit v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    .line 538
    :try_start_f
    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    .line 539
    :catchall_4
    move-exception v0

    .line 540
    :try_start_10
    sget-object v2, Landroidx/core/os/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Method;

    .line 541
    .line 542
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 543
    .line 544
    .line 545
    throw v0

    .line 546
    :cond_10
    new-instance v0, Ljava/lang/RuntimeException;

    .line 547
    .line 548
    const-string v2, "Unable to open file."

    .line 549
    .line 550
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 551
    .line 552
    .line 553
    throw v0

    .line 554
    :catchall_5
    move-exception v0

    .line 555
    goto :goto_c

    .line 556
    :catchall_6
    move-exception v0

    .line 557
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 558
    .line 559
    .line 560
    throw v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    .line 561
    :goto_c
    :try_start_11
    sget-object v2, Landroidx/core/os/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Method;

    .line 562
    .line 563
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 564
    .line 565
    .line 566
    throw v0

    .line 567
    :cond_11
    new-instance v2, Ljava/lang/RuntimeException;

    .line 568
    .line 569
    new-instance v3, Ljava/lang/StringBuilder;

    .line 570
    .line 571
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 575
    .line 576
    .line 577
    const-string v0, ")"

    .line 578
    .line 579
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 580
    .line 581
    .line 582
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 587
    .line 588
    .line 589
    throw v2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    .line 590
    :goto_d
    iget-object v2, v1, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 591
    .line 592
    monitor-enter v2

    .line 593
    :try_start_12
    iget-object v3, v1, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪兰哲世苏:Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;

    .line 594
    .line 595
    if-eqz v3, :cond_12

    .line 596
    .line 597
    invoke-virtual {v3, v0}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/Throwable;)V

    .line 598
    .line 599
    .line 600
    goto :goto_e

    .line 601
    :catchall_7
    move-exception v0

    .line 602
    goto :goto_10

    .line 603
    :cond_12
    :goto_e
    monitor-exit v2
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    .line 604
    invoke-virtual {v1}, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲()V

    .line 605
    .line 606
    .line 607
    :goto_f
    return-void

    .line 608
    :goto_10
    :try_start_13
    monitor-exit v2
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_7

    .line 609
    throw v0

    .line 610
    :goto_11
    :try_start_14
    monitor-exit v4
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_0

    .line 611
    throw v0

    .line 612
    :pswitch_6
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 613
    .line 614
    check-cast v0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;

    .line 615
    .line 616
    iget-object v0, v0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;

    .line 617
    .line 618
    iget-object v0, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 619
    .line 620
    check-cast v0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;

    .line 621
    .line 622
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 623
    .line 624
    .line 625
    move-result-wide v3

    .line 626
    iget-object v1, v0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 627
    .line 628
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 629
    .line 630
    .line 631
    move-result-wide v5

    .line 632
    move v7, v12

    .line 633
    :goto_12
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 634
    .line 635
    .line 636
    move-result v8

    .line 637
    if-ge v7, v8, :cond_21

    .line 638
    .line 639
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v8

    .line 643
    check-cast v8, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;

    .line 644
    .line 645
    if-nez v8, :cond_14

    .line 646
    .line 647
    :cond_13
    :goto_13
    move-wide/from16 v25, v3

    .line 648
    .line 649
    goto/16 :goto_1c

    .line 650
    .line 651
    :cond_14
    iget-object v9, v0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/collection/飘花落叶言子苏世哲兰楪;

    .line 652
    .line 653
    invoke-virtual {v9, v8}, Landroidx/collection/飘花落叶言子苏世哲兰楪;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object v10

    .line 657
    check-cast v10, Ljava/lang/Long;

    .line 658
    .line 659
    if-nez v10, :cond_15

    .line 660
    .line 661
    goto :goto_14

    .line 662
    :cond_15
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 663
    .line 664
    .line 665
    move-result-wide v13

    .line 666
    cmp-long v10, v13, v5

    .line 667
    .line 668
    if-gez v10, :cond_13

    .line 669
    .line 670
    invoke-virtual {v9, v8}, Landroidx/collection/飘花落叶言子苏世哲兰楪;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 671
    .line 672
    .line 673
    :goto_14
    iget-wide v9, v8, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰:J

    .line 674
    .line 675
    const-wide/16 v13, 0x0

    .line 676
    .line 677
    cmp-long v15, v9, v13

    .line 678
    .line 679
    if-nez v15, :cond_16

    .line 680
    .line 681
    iput-wide v3, v8, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰:J

    .line 682
    .line 683
    iget v9, v8, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:F

    .line 684
    .line 685
    invoke-virtual {v8, v9}, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(F)V

    .line 686
    .line 687
    .line 688
    goto :goto_13

    .line 689
    :cond_16
    sub-long v9, v3, v9

    .line 690
    .line 691
    iput-wide v3, v8, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰:J

    .line 692
    .line 693
    invoke-static {}, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;

    .line 694
    .line 695
    .line 696
    move-result-object v15

    .line 697
    iget v15, v15, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰:F

    .line 698
    .line 699
    const/4 v13, 0x0

    .line 700
    cmpl-float v14, v15, v13

    .line 701
    .line 702
    if-nez v14, :cond_17

    .line 703
    .line 704
    const-wide/32 v9, 0x7fffffff

    .line 705
    .line 706
    .line 707
    :goto_15
    move-wide/from16 v23, v9

    .line 708
    .line 709
    goto :goto_16

    .line 710
    :cond_17
    long-to-float v9, v9

    .line 711
    div-float/2addr v9, v15

    .line 712
    float-to-long v9, v9

    .line 713
    goto :goto_15

    .line 714
    :goto_16
    move-object v9, v8

    .line 715
    check-cast v9, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;

    .line 716
    .line 717
    iget-boolean v10, v9, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Z

    .line 718
    .line 719
    iget v14, v9, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:F

    .line 720
    .line 721
    const v15, 0x7f7fffff    # Float.MAX_VALUE

    .line 722
    .line 723
    .line 724
    if-eqz v10, :cond_19

    .line 725
    .line 726
    cmpl-float v10, v14, v15

    .line 727
    .line 728
    if-eqz v10, :cond_18

    .line 729
    .line 730
    iget-object v10, v9, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;

    .line 731
    .line 732
    move-wide/from16 v25, v3

    .line 733
    .line 734
    float-to-double v2, v14

    .line 735
    iput-wide v2, v10, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰:D

    .line 736
    .line 737
    iput v15, v9, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:F

    .line 738
    .line 739
    goto :goto_17

    .line 740
    :cond_18
    move-wide/from16 v25, v3

    .line 741
    .line 742
    :goto_17
    iget-object v2, v9, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;

    .line 743
    .line 744
    iget-wide v2, v2, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰:D

    .line 745
    .line 746
    double-to-float v2, v2

    .line 747
    iput v2, v9, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:F

    .line 748
    .line 749
    iput v13, v9, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:F

    .line 750
    .line 751
    iput-boolean v12, v9, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Z

    .line 752
    .line 753
    move v2, v11

    .line 754
    goto/16 :goto_19

    .line 755
    .line 756
    :cond_19
    move-wide/from16 v25, v3

    .line 757
    .line 758
    cmpl-float v2, v14, v15

    .line 759
    .line 760
    iget-object v3, v9, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;

    .line 761
    .line 762
    iget v4, v9, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:F

    .line 763
    .line 764
    iget v10, v9, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:F

    .line 765
    .line 766
    if-eqz v2, :cond_1a

    .line 767
    .line 768
    float-to-double v11, v4

    .line 769
    move-object/from16 v27, v3

    .line 770
    .line 771
    float-to-double v2, v10

    .line 772
    const-wide/16 v18, 0x2

    .line 773
    .line 774
    div-long v32, v23, v18

    .line 775
    .line 776
    move-wide/from16 v30, v2

    .line 777
    .line 778
    move-wide/from16 v28, v11

    .line 779
    .line 780
    invoke-virtual/range {v27 .. v33}, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(DDJ)Landroidx/compose/animation/飘花落叶言子世哲苏楪兰;

    .line 781
    .line 782
    .line 783
    move-result-object v2

    .line 784
    iget-object v3, v9, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;

    .line 785
    .line 786
    iget v4, v9, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:F

    .line 787
    .line 788
    float-to-double v10, v4

    .line 789
    iput-wide v10, v3, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰:D

    .line 790
    .line 791
    iput v15, v9, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:F

    .line 792
    .line 793
    iget v4, v2, Landroidx/compose/animation/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲苏兰世:F

    .line 794
    .line 795
    float-to-double v10, v4

    .line 796
    iget v2, v2, Landroidx/compose/animation/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲兰世苏:F

    .line 797
    .line 798
    float-to-double v13, v2

    .line 799
    move-object/from16 v28, v3

    .line 800
    .line 801
    move-wide/from16 v29, v10

    .line 802
    .line 803
    move-wide/from16 v33, v32

    .line 804
    .line 805
    move-wide/from16 v31, v13

    .line 806
    .line 807
    invoke-virtual/range {v28 .. v34}, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(DDJ)Landroidx/compose/animation/飘花落叶言子世哲苏楪兰;

    .line 808
    .line 809
    .line 810
    move-result-object v2

    .line 811
    iget v3, v2, Landroidx/compose/animation/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲苏兰世:F

    .line 812
    .line 813
    iput v3, v9, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:F

    .line 814
    .line 815
    iget v2, v2, Landroidx/compose/animation/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲兰世苏:F

    .line 816
    .line 817
    iput v2, v9, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:F

    .line 818
    .line 819
    goto :goto_18

    .line 820
    :cond_1a
    move-object/from16 v18, v3

    .line 821
    .line 822
    float-to-double v2, v4

    .line 823
    float-to-double v10, v10

    .line 824
    move-wide/from16 v19, v2

    .line 825
    .line 826
    move-wide/from16 v21, v10

    .line 827
    .line 828
    invoke-virtual/range {v18 .. v24}, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(DDJ)Landroidx/compose/animation/飘花落叶言子世哲苏楪兰;

    .line 829
    .line 830
    .line 831
    move-result-object v2

    .line 832
    iget v3, v2, Landroidx/compose/animation/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲苏兰世:F

    .line 833
    .line 834
    iput v3, v9, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:F

    .line 835
    .line 836
    iget v2, v2, Landroidx/compose/animation/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲兰世苏:F

    .line 837
    .line 838
    iput v2, v9, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:F

    .line 839
    .line 840
    :goto_18
    iget v2, v9, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:F

    .line 841
    .line 842
    iget v3, v9, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏:F

    .line 843
    .line 844
    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    .line 845
    .line 846
    .line 847
    move-result v2

    .line 848
    iput v2, v9, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:F

    .line 849
    .line 850
    invoke-static {v2, v15}, Ljava/lang/Math;->min(FF)F

    .line 851
    .line 852
    .line 853
    move-result v2

    .line 854
    iput v2, v9, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:F

    .line 855
    .line 856
    iget v3, v9, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:F

    .line 857
    .line 858
    iget-object v4, v9, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;

    .line 859
    .line 860
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 861
    .line 862
    .line 863
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 864
    .line 865
    .line 866
    move-result v3

    .line 867
    float-to-double v10, v3

    .line 868
    iget-wide v13, v4, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲:D

    .line 869
    .line 870
    cmpg-double v3, v10, v13

    .line 871
    .line 872
    if-gez v3, :cond_1b

    .line 873
    .line 874
    iget-wide v10, v4, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰:D

    .line 875
    .line 876
    double-to-float v3, v10

    .line 877
    sub-float/2addr v2, v3

    .line 878
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 879
    .line 880
    .line 881
    move-result v2

    .line 882
    float-to-double v2, v2

    .line 883
    iget-wide v10, v4, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:D

    .line 884
    .line 885
    cmpg-double v2, v2, v10

    .line 886
    .line 887
    if-gez v2, :cond_1b

    .line 888
    .line 889
    iget-object v2, v9, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;

    .line 890
    .line 891
    iget-wide v2, v2, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰:D

    .line 892
    .line 893
    double-to-float v2, v2

    .line 894
    iput v2, v9, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:F

    .line 895
    .line 896
    const/4 v12, 0x0

    .line 897
    iput v12, v9, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:F

    .line 898
    .line 899
    const/4 v2, 0x1

    .line 900
    goto :goto_19

    .line 901
    :cond_1b
    const/4 v2, 0x0

    .line 902
    :goto_19
    iget v3, v8, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:F

    .line 903
    .line 904
    invoke-static {v3, v15}, Ljava/lang/Math;->min(FF)F

    .line 905
    .line 906
    .line 907
    move-result v3

    .line 908
    iput v3, v8, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:F

    .line 909
    .line 910
    iget v4, v8, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏:F

    .line 911
    .line 912
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    .line 913
    .line 914
    .line 915
    move-result v3

    .line 916
    iput v3, v8, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:F

    .line 917
    .line 918
    invoke-virtual {v8, v3}, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(F)V

    .line 919
    .line 920
    .line 921
    if-eqz v2, :cond_20

    .line 922
    .line 923
    iget-object v3, v8, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰:Ljava/util/ArrayList;

    .line 924
    .line 925
    const/4 v14, 0x0

    .line 926
    iput-boolean v14, v8, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:Z

    .line 927
    .line 928
    invoke-static {}, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰()L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;

    .line 929
    .line 930
    .line 931
    move-result-object v2

    .line 932
    iget-object v4, v2, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/collection/飘花落叶言子苏世哲兰楪;

    .line 933
    .line 934
    invoke-virtual {v4, v8}, Landroidx/collection/飘花落叶言子苏世哲兰楪;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 935
    .line 936
    .line 937
    iget-object v4, v2, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 938
    .line 939
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 940
    .line 941
    .line 942
    move-result v9

    .line 943
    if-ltz v9, :cond_1c

    .line 944
    .line 945
    const/4 v10, 0x0

    .line 946
    invoke-virtual {v4, v9, v10}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 947
    .line 948
    .line 949
    const/4 v4, 0x1

    .line 950
    iput-boolean v4, v2, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Z

    .line 951
    .line 952
    :cond_1c
    const-wide/16 v9, 0x0

    .line 953
    .line 954
    iput-wide v9, v8, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰:J

    .line 955
    .line 956
    const/4 v4, 0x0

    .line 957
    :goto_1a
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 958
    .line 959
    .line 960
    move-result v8

    .line 961
    if-ge v4, v8, :cond_1e

    .line 962
    .line 963
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 964
    .line 965
    .line 966
    move-result-object v8

    .line 967
    if-nez v8, :cond_1d

    .line 968
    .line 969
    add-int/lit8 v4, v4, 0x1

    .line 970
    .line 971
    goto :goto_1a

    .line 972
    :cond_1d
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 973
    .line 974
    .line 975
    move-result-object v0

    .line 976
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 977
    .line 978
    .line 979
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 980
    .line 981
    .line 982
    goto :goto_1e

    .line 983
    :cond_1e
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 984
    .line 985
    .line 986
    move-result v4

    .line 987
    const/4 v2, 0x1

    .line 988
    sub-int/2addr v4, v2

    .line 989
    :goto_1b
    if-ltz v4, :cond_20

    .line 990
    .line 991
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 992
    .line 993
    .line 994
    move-result-object v8

    .line 995
    if-nez v8, :cond_1f

    .line 996
    .line 997
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 998
    .line 999
    .line 1000
    :cond_1f
    add-int/lit8 v4, v4, -0x1

    .line 1001
    .line 1002
    goto :goto_1b

    .line 1003
    :cond_20
    :goto_1c
    add-int/lit8 v7, v7, 0x1

    .line 1004
    .line 1005
    move-wide/from16 v3, v25

    .line 1006
    .line 1007
    const/4 v11, 0x1

    .line 1008
    const/4 v12, 0x0

    .line 1009
    goto/16 :goto_12

    .line 1010
    .line 1011
    :cond_21
    iget-boolean v3, v0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Z

    .line 1012
    .line 1013
    if-eqz v3, :cond_25

    .line 1014
    .line 1015
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 1016
    .line 1017
    .line 1018
    move-result v3

    .line 1019
    const/4 v2, 0x1

    .line 1020
    sub-int/2addr v3, v2

    .line 1021
    :goto_1d
    if-ltz v3, :cond_23

    .line 1022
    .line 1023
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v2

    .line 1027
    if-nez v2, :cond_22

    .line 1028
    .line 1029
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1030
    .line 1031
    .line 1032
    :cond_22
    add-int/lit8 v3, v3, -0x1

    .line 1033
    .line 1034
    goto :goto_1d

    .line 1035
    :cond_23
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 1036
    .line 1037
    .line 1038
    move-result v2

    .line 1039
    if-nez v2, :cond_24

    .line 1040
    .line 1041
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1042
    .line 1043
    const/16 v3, 0x21

    .line 1044
    .line 1045
    if-lt v2, v3, :cond_24

    .line 1046
    .line 1047
    iget-object v2, v0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世兰苏楪哲;

    .line 1048
    .line 1049
    iget-object v3, v2, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1050
    .line 1051
    check-cast v3, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏哲兰;

    .line 1052
    .line 1053
    invoke-static {v3}, Landroidx/activity/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪苏哲兰(L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏哲兰;)Z

    .line 1054
    .line 1055
    .line 1056
    const/4 v10, 0x0

    .line 1057
    iput-object v10, v2, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1058
    .line 1059
    :cond_24
    const/4 v14, 0x0

    .line 1060
    iput-boolean v14, v0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Z

    .line 1061
    .line 1062
    :cond_25
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 1063
    .line 1064
    .line 1065
    move-result v1

    .line 1066
    if-lez v1, :cond_26

    .line 1067
    .line 1068
    iget-object v1, v0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世兰苏楪哲;

    .line 1069
    .line 1070
    iget-object v0, v0, L飘花落叶言子哲苏世兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

    .line 1071
    .line 1072
    iget-object v1, v1, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1073
    .line 1074
    check-cast v1, Landroid/view/Choreographer;

    .line 1075
    .line 1076
    new-instance v2, Landroidx/profileinstaller/飘花落叶言子楪苏世哲兰;

    .line 1077
    .line 1078
    invoke-direct {v2, v0}, Landroidx/profileinstaller/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/Runnable;)V

    .line 1079
    .line 1080
    .line 1081
    invoke-virtual {v1, v2}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 1082
    .line 1083
    .line 1084
    :cond_26
    :goto_1e
    return-void

    .line 1085
    :pswitch_7
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1086
    .line 1087
    move-object v1, v0

    .line 1088
    check-cast v1, Landroid/app/Activity;

    .line 1089
    .line 1090
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 1091
    .line 1092
    .line 1093
    move-result v0

    .line 1094
    if-nez v0, :cond_2e

    .line 1095
    .line 1096
    sget-object v3, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰:Landroid/os/Handler;

    .line 1097
    .line 1098
    sget-object v0, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Ljava/lang/reflect/Method;

    .line 1099
    .line 1100
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1101
    .line 1102
    const/16 v5, 0x1c

    .line 1103
    .line 1104
    if-lt v4, v5, :cond_27

    .line 1105
    .line 1106
    invoke-virtual {v1}, Landroid/app/Activity;->recreate()V

    .line 1107
    .line 1108
    .line 1109
    goto/16 :goto_23

    .line 1110
    .line 1111
    :cond_27
    const/16 v5, 0x1b

    .line 1112
    .line 1113
    if-ne v4, v5, :cond_28

    .line 1114
    .line 1115
    if-nez v0, :cond_28

    .line 1116
    .line 1117
    goto/16 :goto_22

    .line 1118
    .line 1119
    :cond_28
    sget-object v6, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Method;

    .line 1120
    .line 1121
    if-nez v6, :cond_29

    .line 1122
    .line 1123
    sget-object v6, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Method;

    .line 1124
    .line 1125
    if-nez v6, :cond_29

    .line 1126
    .line 1127
    goto :goto_22

    .line 1128
    :cond_29
    :try_start_15
    sget-object v6, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/reflect/Field;

    .line 1129
    .line 1130
    invoke-virtual {v6, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v15

    .line 1134
    if-nez v15, :cond_2a

    .line 1135
    .line 1136
    goto :goto_22

    .line 1137
    :cond_2a
    sget-object v6, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Field;

    .line 1138
    .line 1139
    invoke-virtual {v6, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v6

    .line 1143
    if-nez v6, :cond_2b

    .line 1144
    .line 1145
    goto :goto_22

    .line 1146
    :cond_2b
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v7

    .line 1150
    new-instance v8, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏哲兰;

    .line 1151
    .line 1152
    invoke-direct {v8, v1}, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏哲兰;-><init>(Landroid/app/Activity;)V

    .line 1153
    .line 1154
    .line 1155
    invoke-virtual {v7, v8}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 1156
    .line 1157
    .line 1158
    new-instance v9, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;

    .line 1159
    .line 1160
    const/16 v10, 0xc

    .line 1161
    .line 1162
    const/4 v14, 0x0

    .line 1163
    invoke-direct {v9, v10, v8, v15, v14}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 1164
    .line 1165
    .line 1166
    invoke-virtual {v3, v9}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_9

    .line 1167
    .line 1168
    .line 1169
    if-ne v4, v5, :cond_2c

    .line 1170
    .line 1171
    const/4 v11, 0x1

    .line 1172
    goto :goto_1f

    .line 1173
    :cond_2c
    move v11, v14

    .line 1174
    :goto_1f
    const/16 v2, 0xd

    .line 1175
    .line 1176
    if-eqz v11, :cond_2d

    .line 1177
    .line 1178
    :try_start_16
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v18

    .line 1182
    sget-object v19, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1183
    .line 1184
    const/16 v20, 0x0

    .line 1185
    .line 1186
    const/16 v21, 0x0

    .line 1187
    .line 1188
    const/16 v16, 0x0

    .line 1189
    .line 1190
    const/16 v17, 0x0

    .line 1191
    .line 1192
    move-object/from16 v22, v19

    .line 1193
    .line 1194
    move-object/from16 v23, v19

    .line 1195
    .line 1196
    filled-new-array/range {v15 .. v23}, [Ljava/lang/Object;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v4

    .line 1200
    invoke-virtual {v0, v6, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1201
    .line 1202
    .line 1203
    goto :goto_20

    .line 1204
    :catchall_8
    move-exception v0

    .line 1205
    goto :goto_21

    .line 1206
    :cond_2d
    invoke-virtual {v1}, Landroid/app/Activity;->recreate()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_8

    .line 1207
    .line 1208
    .line 1209
    :goto_20
    :try_start_17
    new-instance v0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;

    .line 1210
    .line 1211
    const/4 v14, 0x0

    .line 1212
    invoke-direct {v0, v2, v7, v8, v14}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 1213
    .line 1214
    .line 1215
    invoke-virtual {v3, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1216
    .line 1217
    .line 1218
    goto :goto_23

    .line 1219
    :goto_21
    new-instance v4, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;

    .line 1220
    .line 1221
    const/4 v14, 0x0

    .line 1222
    invoke-direct {v4, v2, v7, v8, v14}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 1223
    .line 1224
    .line 1225
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1226
    .line 1227
    .line 1228
    throw v0
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_9

    .line 1229
    :catchall_9
    :goto_22
    invoke-virtual {v1}, Landroid/app/Activity;->recreate()V

    .line 1230
    .line 1231
    .line 1232
    :cond_2e
    :goto_23
    return-void

    .line 1233
    :pswitch_8
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1234
    .line 1235
    check-cast v0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;

    .line 1236
    .line 1237
    iget-object v0, v0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲兰苏;

    .line 1238
    .line 1239
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v1

    .line 1243
    instance-of v2, v1, Landroid/view/ViewGroup;

    .line 1244
    .line 1245
    if-eqz v2, :cond_2f

    .line 1246
    .line 1247
    check-cast v1, Landroid/view/ViewGroup;

    .line 1248
    .line 1249
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1250
    .line 1251
    .line 1252
    :cond_2f
    return-void

    .line 1253
    :pswitch_9
    move v14, v12

    .line 1254
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1255
    .line 1256
    check-cast v0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪兰苏哲世;

    .line 1257
    .line 1258
    new-instance v1, Ljava/io/File;

    .line 1259
    .line 1260
    sget-object v2, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 1261
    .line 1262
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1263
    .line 1264
    .line 1265
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 1266
    .line 1267
    .line 1268
    move-result v2

    .line 1269
    if-nez v2, :cond_30

    .line 1270
    .line 1271
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 1272
    .line 1273
    .line 1274
    :cond_30
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v2

    .line 1278
    array-length v3, v2

    .line 1279
    move v12, v14

    .line 1280
    :goto_24
    if-ge v12, v3, :cond_33

    .line 1281
    .line 1282
    aget-object v4, v2, v12

    .line 1283
    .line 1284
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v5

    .line 1288
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v6

    .line 1292
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1293
    .line 1294
    .line 1295
    move-result v5

    .line 1296
    if-eqz v5, :cond_31

    .line 1297
    .line 1298
    goto :goto_25

    .line 1299
    :cond_31
    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    .line 1300
    .line 1301
    .line 1302
    move-result v4

    .line 1303
    if-eqz v4, :cond_32

    .line 1304
    .line 1305
    add-int/lit8 v14, v14, 0x1

    .line 1306
    .line 1307
    :cond_32
    :goto_25
    add-int/lit8 v12, v12, 0x1

    .line 1308
    .line 1309
    goto :goto_24

    .line 1310
    :cond_33
    if-nez v14, :cond_34

    .line 1311
    .line 1312
    const/16 v1, 0xbe

    .line 1313
    .line 1314
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v1

    .line 1318
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1319
    .line 1320
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1321
    .line 1322
    .line 1323
    const-string v3, "\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5"

    .line 1324
    .line 1325
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v3

    .line 1329
    invoke-static {v3}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)Ljava/lang/String;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v3

    .line 1333
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1334
    .line 1335
    .line 1336
    const/16 v3, 0xbf

    .line 1337
    .line 1338
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v3

    .line 1342
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1343
    .line 1344
    .line 1345
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v2

    .line 1349
    new-instance v3, Ljava/io/File;

    .line 1350
    .line 1351
    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1352
    .line 1353
    .line 1354
    invoke-static {v1, v2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;)V

    .line 1355
    .line 1356
    .line 1357
    :try_start_18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1358
    .line 1359
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1360
    .line 1361
    .line 1362
    sget-object v4, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 1363
    .line 1364
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1365
    .line 1366
    .line 1367
    const-string v4, "\u545c\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u545c\u545c\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u545c\u545c\u545c\u55b5\u55b5\u55b5\u545c\u55b5~\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u545c\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c~\u545c\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u55b5"

    .line 1368
    .line 1369
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v4

    .line 1373
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1374
    .line 1375
    .line 1376
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v1

    .line 1380
    invoke-static {v2, v1}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏哲兰世楪(Ljava/lang/String;Ljava/lang/String;)V

    .line 1381
    .line 1382
    .line 1383
    invoke-virtual {v3}, Ljava/io/File;->delete()Z
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_2

    .line 1384
    .line 1385
    .line 1386
    :catch_2
    :cond_34
    invoke-virtual {v0}, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏兰哲世()V

    .line 1387
    .line 1388
    .line 1389
    return-void

    .line 1390
    :pswitch_a
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1391
    .line 1392
    move-object v1, v0

    .line 1393
    check-cast v1, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世哲兰苏;

    .line 1394
    .line 1395
    :goto_26
    :try_start_19
    invoke-static {}, Landroid/os/Looper;->loop()V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_a

    .line 1396
    .line 1397
    .line 1398
    goto :goto_26

    .line 1399
    :catchall_a
    move-exception v0

    .line 1400
    new-instance v2, Ljava/lang/Thread;

    .line 1401
    .line 1402
    new-instance v3, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;

    .line 1403
    .line 1404
    const/16 v4, 0xe

    .line 1405
    .line 1406
    invoke-direct {v3, v1, v4, v0}, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1407
    .line 1408
    .line 1409
    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 1410
    .line 1411
    .line 1412
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 1413
    .line 1414
    .line 1415
    goto :goto_26

    .line 1416
    :pswitch_b
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1417
    .line 1418
    check-cast v0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰哲世;

    .line 1419
    .line 1420
    iget-object v0, v0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰世苏哲:Lcom/lxj/xpopup/widget/VerticalRecyclerView;

    .line 1421
    .line 1422
    sget v1, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰哲世苏:I

    .line 1423
    .line 1424
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏哲世兰楪(I)V

    .line 1425
    .line 1426
    .line 1427
    return-void

    .line 1428
    :pswitch_c
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1429
    .line 1430
    check-cast v0, Landroid/view/WindowManager;

    .line 1431
    .line 1432
    :try_start_1a
    sget-object v1, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/ref/WeakReference;

    .line 1433
    .line 1434
    if-eqz v1, :cond_35

    .line 1435
    .line 1436
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v1

    .line 1440
    if-eqz v1, :cond_35

    .line 1441
    .line 1442
    sget-object v1, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/ref/WeakReference;

    .line 1443
    .line 1444
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v1

    .line 1448
    check-cast v1, Landroid/view/View;

    .line 1449
    .line 1450
    invoke-interface {v0, v1}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 1451
    .line 1452
    .line 1453
    sget-object v0, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/ref/WeakReference;

    .line 1454
    .line 1455
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->clear()V
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_3

    .line 1456
    .line 1457
    .line 1458
    :catch_3
    :cond_35
    return-void

    .line 1459
    :pswitch_d
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1460
    .line 1461
    check-cast v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏兰哲世;

    .line 1462
    .line 1463
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏兰哲世;->invoke()Ljava/lang/Object;

    .line 1464
    .line 1465
    .line 1466
    return-void

    .line 1467
    :pswitch_e
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1468
    .line 1469
    check-cast v0, Ltop/suzhelan/qstory/ui/activity/SettingActivity;

    .line 1470
    .line 1471
    invoke-static {v0}, Ltop/suzhelan/qstory/ui/activity/SettingActivity;->飘花落叶言子楪哲苏世兰(Ltop/suzhelan/qstory/ui/activity/SettingActivity;)V

    .line 1472
    .line 1473
    .line 1474
    return-void

    .line 1475
    :pswitch_f
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1476
    .line 1477
    check-cast v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;

    .line 1478
    .line 1479
    new-instance v1, Ljava/io/File;

    .line 1480
    .line 1481
    invoke-static {}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏世兰()Ljava/lang/String;

    .line 1482
    .line 1483
    .line 1484
    move-result-object v2

    .line 1485
    const-string v3, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u545c\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c~\u55b5\u545c\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5"

    .line 1486
    .line 1487
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1488
    .line 1489
    .line 1490
    move-result-object v3

    .line 1491
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v2

    .line 1495
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1496
    .line 1497
    .line 1498
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 1499
    .line 1500
    .line 1501
    move-result v2

    .line 1502
    if-nez v2, :cond_36

    .line 1503
    .line 1504
    sget-object v2, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 1505
    .line 1506
    const v3, 0x24080191

    .line 1507
    .line 1508
    .line 1509
    invoke-virtual {v2, v3}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 1510
    .line 1511
    .line 1512
    move-result-object v2

    .line 1513
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1514
    .line 1515
    .line 1516
    move-result-object v3

    .line 1517
    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 1518
    .line 1519
    invoke-static {v2, v3, v4}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世兰哲(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;)V

    .line 1520
    .line 1521
    .line 1522
    const/16 v2, 0x8aa

    .line 1523
    .line 1524
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v2

    .line 1528
    invoke-static {v2}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 1529
    .line 1530
    .line 1531
    :cond_36
    sget-object v2, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 1532
    .line 1533
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1534
    .line 1535
    .line 1536
    move-result-object v1

    .line 1537
    invoke-static {v2, v1}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子世苏楪哲兰(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/BitmapDrawable;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v1

    .line 1541
    iput-object v1, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰苏世哲:Landroid/graphics/drawable/BitmapDrawable;

    .line 1542
    .line 1543
    return-void

    .line 1544
    :pswitch_10
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1545
    .line 1546
    check-cast v0, Landroid/widget/LinearLayout;

    .line 1547
    .line 1548
    const/4 v2, 0x1

    .line 1549
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 1550
    .line 1551
    .line 1552
    return-void

    .line 1553
    :pswitch_11
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1554
    .line 1555
    check-cast v0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰世哲苏;

    .line 1556
    .line 1557
    invoke-virtual {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏哲兰世()Z

    .line 1558
    .line 1559
    .line 1560
    move-result v1

    .line 1561
    if-nez v1, :cond_37

    .line 1562
    .line 1563
    invoke-static {v10}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v1

    .line 1567
    iget-object v0, v0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 1568
    .line 1569
    invoke-static {v1, v0}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;)V

    .line 1570
    .line 1571
    .line 1572
    :cond_37
    return-void

    .line 1573
    :pswitch_12
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1574
    .line 1575
    check-cast v0, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏世哲兰;

    .line 1576
    .line 1577
    sget v1, Ltop/suzhelan/plugin/sdk/online/manager/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 1578
    .line 1579
    invoke-virtual {v0, v1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(I)V

    .line 1580
    .line 1581
    .line 1582
    return-void

    .line 1583
    :pswitch_13
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1584
    .line 1585
    check-cast v0, Llin/xposed/hook/javaplugin/dialog/PluginMenuDialog;

    .line 1586
    .line 1587
    invoke-static {v0}, Llin/xposed/hook/javaplugin/dialog/PluginMenuDialog;->飘花落叶言子楪世苏哲兰(Llin/xposed/hook/javaplugin/dialog/PluginMenuDialog;)V

    .line 1588
    .line 1589
    .line 1590
    return-void

    .line 1591
    :pswitch_14
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1592
    .line 1593
    check-cast v0, Llin/xposed/hook/javaplugin/controller/AutoLoadPlugin;

    .line 1594
    .line 1595
    invoke-static {v0}, Llin/xposed/hook/javaplugin/controller/AutoLoadPlugin;->飘花落叶言子楪世兰哲苏(Llin/xposed/hook/javaplugin/controller/AutoLoadPlugin;)V

    .line 1596
    .line 1597
    .line 1598
    return-void

    .line 1599
    :pswitch_15
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1600
    .line 1601
    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    .line 1602
    .line 1603
    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->飘花落叶言子楪兰世哲苏:Landroid/widget/EditText;

    .line 1604
    .line 1605
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 1606
    .line 1607
    .line 1608
    return-void

    .line 1609
    :pswitch_16
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1610
    .line 1611
    check-cast v0, Lcom/google/android/material/textfield/飘花落叶言子楪苏兰哲世;

    .line 1612
    .line 1613
    iget-object v1, v0, Lcom/google/android/material/textfield/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世兰哲:Landroid/widget/AutoCompleteTextView;

    .line 1614
    .line 1615
    invoke-virtual {v1}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    .line 1616
    .line 1617
    .line 1618
    move-result v1

    .line 1619
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰世苏哲(Z)V

    .line 1620
    .line 1621
    .line 1622
    iput-boolean v1, v0, Lcom/google/android/material/textfield/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲世苏兰:Z

    .line 1623
    .line 1624
    return-void

    .line 1625
    :pswitch_17
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1626
    .line 1627
    check-cast v0, Lcom/google/android/material/textfield/飘花落叶言子楪世兰苏哲;

    .line 1628
    .line 1629
    const/4 v2, 0x1

    .line 1630
    invoke-virtual {v0, v2}, Lcom/google/android/material/textfield/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲(Z)V

    .line 1631
    .line 1632
    .line 1633
    return-void

    .line 1634
    :pswitch_18
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1635
    .line 1636
    check-cast v0, Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 1637
    .line 1638
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子哲世苏兰楪()V

    .line 1639
    .line 1640
    .line 1641
    return-void

    .line 1642
    :pswitch_19
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1643
    .line 1644
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 1645
    .line 1646
    invoke-static {v0}, Lcom/google/android/material/button/MaterialButton;->飘花落叶言子楪世苏哲兰(Lcom/google/android/material/button/MaterialButton;)V

    .line 1647
    .line 1648
    .line 1649
    return-void

    .line 1650
    :pswitch_1a
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1651
    .line 1652
    check-cast v0, Landroidx/core/util/飘花落叶言子楪世苏哲兰;

    .line 1653
    .line 1654
    new-instance v1, Landroidx/window/layout/飘花落叶言子楪苏兰世哲;

    .line 1655
    .line 1656
    sget-object v2, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 1657
    .line 1658
    invoke-direct {v1, v2}, Landroidx/window/layout/飘花落叶言子楪苏兰世哲;-><init>(Ljava/util/List;)V

    .line 1659
    .line 1660
    .line 1661
    invoke-interface {v0, v1}, Landroidx/core/util/飘花落叶言子楪世苏哲兰;->accept(Ljava/lang/Object;)V

    .line 1662
    .line 1663
    .line 1664
    return-void

    .line 1665
    :pswitch_1b
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1666
    .line 1667
    check-cast v0, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 1668
    .line 1669
    iget-object v1, v0, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏世楪哲兰:Landroidx/fragment/app/飘花落叶言子苏楪世兰哲;

    .line 1670
    .line 1671
    iget-object v2, v0, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世苏哲:Landroid/os/Bundle;

    .line 1672
    .line 1673
    iget-object v1, v1, Landroidx/fragment/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪兰苏世哲:L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世兰苏哲;

    .line 1674
    .line 1675
    invoke-virtual {v1, v2}, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Landroid/os/Bundle;)V

    .line 1676
    .line 1677
    .line 1678
    const/4 v10, 0x0

    .line 1679
    iput-object v10, v0, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世苏哲:Landroid/os/Bundle;

    .line 1680
    .line 1681
    return-void

    .line 1682
    :pswitch_1c
    iget-object v0, v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1683
    .line 1684
    check-cast v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;

    .line 1685
    .line 1686
    invoke-static {v0}, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;)V

    .line 1687
    .line 1688
    .line 1689
    return-void

    .line 1690
    nop

    .line 1691
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
