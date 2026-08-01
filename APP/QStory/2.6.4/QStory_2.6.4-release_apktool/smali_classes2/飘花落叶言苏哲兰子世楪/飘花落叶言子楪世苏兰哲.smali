.class public final synthetic L飘花落叶言苏哲兰子世楪/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言苏哲兰子世楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言苏哲兰子世楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

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
    .locals 10

    .line 1
    iget v0, p0, L飘花落叶言苏哲兰子世楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/16 v2, 0x477

    .line 5
    .line 6
    const/16 v3, 0x476

    .line 7
    .line 8
    const-wide/16 v4, 0x3e8

    .line 9
    .line 10
    const/16 v6, 0x399

    .line 11
    .line 12
    const/16 v7, 0x474

    .line 13
    .line 14
    const-string v8, ""

    .line 15
    .line 16
    iget-object p0, p0, L飘花落叶言苏哲兰子世楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 17
    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast p0, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世兰哲苏;

    .line 22
    .line 23
    invoke-virtual {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    const/16 v0, 0x427

    .line 30
    .line 31
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object p0, p0, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v0, p0}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void

    .line 41
    :pswitch_0
    check-cast p0, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世苏兰哲;

    .line 42
    .line 43
    iget-object p0, p0, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 44
    .line 45
    :try_start_0
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 46
    .line 47
    invoke-static {v7}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    invoke-direct {v0, v7, v9}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 56
    .line 57
    .line 58
    new-instance v7, Ljava/util/Date;

    .line 59
    .line 60
    invoke-direct {v7}, Ljava/util/Date;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v7}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const/16 v7, 0x486

    .line 68
    .line 69
    invoke-static {v7}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    invoke-virtual {p0, v9, v8}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    if-nez v8, :cond_6

    .line 82
    .line 83
    :goto_0
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    invoke-static {v8}, Llin/xposed/hook/util/qq/Hook_cookie;->getPskey(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    if-nez v8, :cond_1

    .line 92
    .line 93
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :catch_0
    move-exception p0

    .line 98
    goto :goto_3

    .line 99
    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 102
    .line 103
    .line 104
    const/16 v5, 0x487

    .line 105
    .line 106
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    sget-object v5, L飘花落叶言世兰子楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

    .line 121
    .line 122
    const-class v6, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世兰哲苏;

    .line 123
    .line 124
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    check-cast v6, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世兰哲苏;

    .line 129
    .line 130
    const/4 v8, 0x0

    .line 131
    if-nez v6, :cond_2

    .line 132
    .line 133
    move v6, v8

    .line 134
    goto :goto_1

    .line 135
    :cond_2
    iget-object v6, v6, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 136
    .line 137
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    :goto_1
    if-eqz v6, :cond_3

    .line 142
    .line 143
    invoke-static {}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世苏兰()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    :cond_3
    const-class v6, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪苏世哲兰;

    .line 148
    .line 149
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    check-cast v6, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪苏世哲兰;

    .line 154
    .line 155
    if-nez v6, :cond_4

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_4
    iget-object v6, v6, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 159
    .line 160
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 161
    .line 162
    .line 163
    move-result v8

    .line 164
    :goto_2
    invoke-static {v4, v8}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Z)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    sget v6, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:I

    .line 169
    .line 170
    const-class v6, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲苏兰;

    .line 171
    .line 172
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    check-cast v5, L飘花落叶言苏世哲兰楪子/飘花落叶言子楪世苏兰哲;

    .line 177
    .line 178
    iget-object v5, v5, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 179
    .line 180
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    if-eqz v5, :cond_5

    .line 185
    .line 186
    invoke-static {v4}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    :cond_5
    invoke-static {v7}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    invoke-virtual {p0, v0, v4}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 194
    .line 195
    .line 196
    goto :goto_4

    .line 197
    :goto_3
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    invoke-static {v0, v2, p0, v1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 206
    .line 207
    .line 208
    :cond_6
    :goto_4
    return-void

    .line 209
    :pswitch_1
    check-cast p0, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世苏哲兰;

    .line 210
    .line 211
    iget-object p0, p0, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 212
    .line 213
    :try_start_1
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 214
    .line 215
    invoke-static {v7}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v7

    .line 219
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 220
    .line 221
    .line 222
    move-result-object v9

    .line 223
    invoke-direct {v0, v7, v9}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 224
    .line 225
    .line 226
    new-instance v7, Ljava/util/Date;

    .line 227
    .line 228
    invoke-direct {v7}, Ljava/util/Date;-><init>()V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0, v7}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    const/16 v7, 0x475

    .line 236
    .line 237
    invoke-static {v7}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v9

    .line 241
    invoke-virtual {p0, v9, v8}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v8

    .line 245
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v8

    .line 249
    if-nez v8, :cond_8

    .line 250
    .line 251
    :goto_5
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v8

    .line 255
    invoke-static {v8}, Llin/xposed/hook/util/qq/Hook_cookie;->getPskey(Ljava/lang/String;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v8

    .line 259
    if-nez v8, :cond_7

    .line 260
    .line 261
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V

    .line 262
    .line 263
    .line 264
    goto :goto_5

    .line 265
    :catch_1
    move-exception p0

    .line 266
    goto :goto_6

    .line 267
    :cond_7
    const-wide/16 v4, 0xbb8

    .line 268
    .line 269
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V

    .line 270
    .line 271
    .line 272
    invoke-static {}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰哲世()Landroid/util/Pair;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    iget-object v5, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v5, Ljava/lang/String;

    .line 279
    .line 280
    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v4, Ljava/lang/String;

    .line 283
    .line 284
    invoke-static {v5, v4}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;Ljava/lang/String;)Z

    .line 285
    .line 286
    .line 287
    move-result v4

    .line 288
    if-eqz v4, :cond_8

    .line 289
    .line 290
    invoke-static {v7}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v4

    .line 294
    invoke-virtual {p0, v0, v4}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 295
    .line 296
    .line 297
    goto :goto_7

    .line 298
    :goto_6
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    invoke-static {v0, v2, p0, v1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 307
    .line 308
    .line 309
    :cond_8
    :goto_7
    return-void

    .line 310
    :pswitch_2
    check-cast p0, L飘花落叶言苏哲子世楪兰/飘花落叶言子楪苏哲兰世;

    .line 311
    .line 312
    sget-object v0, L飘花落叶言苏哲子世楪兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世哲苏:L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏哲兰;

    .line 313
    .line 314
    new-instance v0, Ljava/io/File;

    .line 315
    .line 316
    sget-object v1, L飘花落叶言苏哲子世楪兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏哲子世楪兰/飘花落叶言子楪世兰苏哲;

    .line 317
    .line 318
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    invoke-static {}, L飘花落叶言苏哲子世楪兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 329
    .line 330
    .line 331
    move-result v1

    .line 332
    if-nez v1, :cond_9

    .line 333
    .line 334
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 335
    .line 336
    .line 337
    :cond_9
    invoke-virtual {p0}, L飘花落叶言苏哲子世楪兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲兰世()V

    .line 338
    .line 339
    .line 340
    return-void

    .line 341
    :pswitch_3
    check-cast p0, L飘花落叶言世哲子苏楪兰/飘花落叶言子世哲兰苏楪;

    .line 342
    .line 343
    invoke-virtual {p0, v8}, L飘花落叶言世哲子苏楪兰/飘花落叶言子世哲兰苏楪;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    return-void

    .line 347
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
