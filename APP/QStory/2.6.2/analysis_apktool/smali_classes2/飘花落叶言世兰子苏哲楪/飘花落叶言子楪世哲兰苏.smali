.class public final synthetic L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/String;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

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
    iget v0, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    :try_start_0
    invoke-static {}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪兰哲苏世()Lcom/alibaba/fastjson2/JSONObject;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-wide v2, -0x36a40225051405a7L    # -2.4969361751572692E45

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    const-wide v2, -0x36a40221051405a7L    # -2.49694161967514E45

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentAccountNickName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲兰世()Landroid/util/Pair;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    if-eqz v2, :cond_0

    .line 50
    .line 51
    const-wide v3, -0x36a4022a051405a7L    # -2.4969293695099308E45

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    iget-object v4, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 61
    .line 62
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    const-wide v3, -0x36a40215051405a7L    # -2.496957953228752E45

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 75
    .line 76
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :catch_0
    move-exception p0

    .line 81
    goto :goto_1

    .line 82
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-lez v2, :cond_1

    .line 87
    .line 88
    const-wide v2, -0x36a40218051405a7L    # -2.496953869840349E45

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v0, v2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    const-wide v2, -0x36a40201051405a7L    # -2.4969851758181058E45

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    const-wide v2, -0x36a4020c051405a7L    # -2.4969702033939613E45

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-virtual {v0, p0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    :cond_1
    invoke-static {}, L飘花落叶言苏哲子兰楪世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲()L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世兰哲苏;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-interface {p0, v0}, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(Lcom/alibaba/fastjson2/JSONObject;)Lretrofit2/飘花落叶言子楪世兰苏哲;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-interface {p0}, Lretrofit2/飘花落叶言子楪世兰苏哲;->execute()Lretrofit2/飘花落叶言子世兰楪哲苏;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :goto_1
    const-wide v2, -0x36a401f6051405a7L    # -2.4970001482422503E45

    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-static {v0, v2, p0, v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 147
    .line 148
    .line 149
    :goto_2
    return-void

    .line 150
    :pswitch_0
    sget-object v0, L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;

    .line 151
    .line 152
    sget-object v2, L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Ljava/util/Set;

    .line 153
    .line 154
    sget-object v3, L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世哲苏兰;

    .line 155
    .line 156
    :try_start_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-static {p0}, L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    new-instance v4, L飘花落叶言世苏兰哲子楪/飘花落叶言子世楪兰哲苏;

    .line 164
    .line 165
    sget-object v5, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰哲子楪/飘花落叶言子苏兰楪哲世;

    .line 166
    .line 167
    invoke-direct {v4, v5, v5, v1}, L飘花落叶言世苏兰哲子楪/飘花落叶言子世楪兰哲苏;-><init>(L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;I)V

    .line 168
    .line 169
    .line 170
    invoke-static {v4}, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;)L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    invoke-virtual {v0, v3, v4}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    check-cast v3, Ljava/util/Map;

    .line 179
    .line 180
    if-nez v3, :cond_2

    .line 181
    .line 182
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 183
    .line 184
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 185
    .line 186
    .line 187
    goto :goto_3

    .line 188
    :catchall_0
    move-exception v0

    .line 189
    goto/16 :goto_8

    .line 190
    .line 191
    :catch_1
    move-exception v0

    .line 192
    goto/16 :goto_6

    .line 193
    .line 194
    :cond_2
    :goto_3
    invoke-static {p0}, L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    const-wide v5, -0x36a57fc1051405a7L    # -2.363964715200308E45

    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    :cond_3
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 214
    .line 215
    .line 216
    move-result v5

    .line 217
    if-eqz v5, :cond_4

    .line 218
    .line 219
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    const-wide v6, -0x36a57fb7051405a7L    # -2.3639783264949847E45

    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    check-cast v5, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;

    .line 235
    .line 236
    iget-object v6, v5, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->NickName:Ljava/lang/String;

    .line 237
    .line 238
    iget-object v7, v5, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->UserUin:Ljava/lang/String;

    .line 239
    .line 240
    const-wide v8, -0x36a403be051405a7L    # -2.4963794732049865E45

    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    invoke-static {v8, v9}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    invoke-static {v6, v7}, L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/String;)Z

    .line 252
    .line 253
    .line 254
    move-result v6

    .line 255
    if-eqz v6, :cond_3

    .line 256
    .line 257
    iget-object v6, v5, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->UserUin:Ljava/lang/String;

    .line 258
    .line 259
    iget-object v5, v5, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->NickName:Ljava/lang/String;

    .line 260
    .line 261
    invoke-interface {v3, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    goto :goto_4

    .line 265
    :cond_4
    invoke-static {p0}, L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    invoke-virtual {v0, v3, v4}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    invoke-static {p0}, L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    const-wide v4, -0x36a571ef051405a7L    # -2.368780391256973E45

    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    new-instance v4, Ljava/util/Date;

    .line 290
    .line 291
    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    .line 292
    .line 293
    .line 294
    new-instance v5, Ljava/text/SimpleDateFormat;

    .line 295
    .line 296
    const-wide v6, -0x36a575f0051405a7L    # -2.3673852335525972E45

    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v6

    .line 305
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 306
    .line 307
    .line 308
    move-result-object v7

    .line 309
    invoke-direct {v5, v6, v7}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v5, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v4

    .line 316
    const-wide v5, -0x36a403a6051405a7L    # -2.496412140312211E45

    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v0, v4, v3}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 328
    .line 329
    .line 330
    :goto_5
    invoke-interface {v2, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    goto :goto_7

    .line 334
    :goto_6
    const-wide v3, -0x36a404e4051405a7L    # -2.4959793011414875E45

    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    :try_start_2
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    sget-object v4, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 344
    .line 345
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v4

    .line 349
    invoke-static {v3, v4, v0, v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 350
    .line 351
    .line 352
    goto :goto_5

    .line 353
    :goto_7
    return-void

    .line 354
    :goto_8
    invoke-interface {v2, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    throw v0

    .line 358
    :pswitch_1
    new-instance v0, Ljava/util/ArrayList;

    .line 359
    .line 360
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 361
    .line 362
    .line 363
    invoke-static {p0}, L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    :cond_5
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 372
    .line 373
    .line 374
    move-result v2

    .line 375
    if-eqz v2, :cond_6

    .line 376
    .line 377
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    check-cast v2, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;

    .line 382
    .line 383
    iget-boolean v3, v2, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->IsAdmin:Z

    .line 384
    .line 385
    if-eqz v3, :cond_5

    .line 386
    .line 387
    iget-object v2, v2, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->UserUin:Ljava/lang/String;

    .line 388
    .line 389
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    goto :goto_9

    .line 393
    :cond_6
    invoke-static {p0, v0}, L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 394
    .line 395
    .line 396
    invoke-static {p0}, L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    return-void

    .line 400
    :pswitch_2
    invoke-static {p0}, L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 401
    .line 402
    .line 403
    return-void

    .line 404
    :pswitch_3
    sget-object v0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 405
    .line 406
    const/high16 v1, 0x42a00000    # 80.0f

    .line 407
    .line 408
    const/4 v2, 0x0

    .line 409
    :try_start_3
    invoke-static {}, L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏兰哲()Landroid/app/Activity;

    .line 410
    .line 411
    .line 412
    move-result-object v3
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 413
    if-eqz v3, :cond_9

    .line 414
    .line 415
    :try_start_4
    sget-object v3, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Landroid/widget/Toast;

    .line 416
    .line 417
    if-eqz v3, :cond_7

    .line 418
    .line 419
    invoke-virtual {v3}, Landroid/widget/Toast;->cancel()V

    .line 420
    .line 421
    .line 422
    :cond_7
    invoke-static {}, L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏兰哲()Landroid/app/Activity;

    .line 423
    .line 424
    .line 425
    move-result-object v3

    .line 426
    if-nez v3, :cond_8

    .line 427
    .line 428
    move-object v3, v0

    .line 429
    :cond_8
    new-instance v4, Landroid/widget/Toast;

    .line 430
    .line 431
    invoke-direct {v4, v3}, Landroid/widget/Toast;-><init>(Landroid/content/Context;)V

    .line 432
    .line 433
    .line 434
    sput-object v4, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Landroid/widget/Toast;

    .line 435
    .line 436
    invoke-static {v3, v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;F)I

    .line 437
    .line 438
    .line 439
    move-result v1

    .line 440
    const/16 v5, 0x30

    .line 441
    .line 442
    invoke-virtual {v4, v5, v2, v1}, Landroid/widget/Toast;->setGravity(III)V

    .line 443
    .line 444
    .line 445
    sget-object v1, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Landroid/widget/Toast;

    .line 446
    .line 447
    invoke-virtual {v1, v2}, Landroid/widget/Toast;->setDuration(I)V

    .line 448
    .line 449
    .line 450
    sget-object v1, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Landroid/widget/Toast;

    .line 451
    .line 452
    invoke-static {v3, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/LinearLayout;

    .line 453
    .line 454
    .line 455
    move-result-object v3

    .line 456
    invoke-virtual {v1, v3}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    .line 457
    .line 458
    .line 459
    sget-object v1, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Landroid/widget/Toast;

    .line 460
    .line 461
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 462
    .line 463
    .line 464
    goto/16 :goto_b

    .line 465
    .line 466
    :catch_2
    :try_start_5
    invoke-static {v0, p0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 467
    .line 468
    .line 469
    move-result-object p0

    .line 470
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_7

    .line 471
    .line 472
    .line 473
    goto/16 :goto_b

    .line 474
    .line 475
    :catch_3
    :cond_9
    :try_start_6
    invoke-static {v0}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    .line 476
    .line 477
    .line 478
    move-result v3
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    .line 479
    goto :goto_a

    .line 480
    :catch_4
    move v3, v2

    .line 481
    :goto_a
    if-eqz v3, :cond_d

    .line 482
    .line 483
    sget-object v3, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Landroid/os/Handler;

    .line 484
    .line 485
    const-wide v4, -0x36a5551e051405a7L    # -2.378821443340076E45

    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    :try_start_7
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v4

    .line 494
    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v4

    .line 498
    check-cast v4, Landroid/view/WindowManager;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6

    .line 499
    .line 500
    if-nez v4, :cond_a

    .line 501
    .line 502
    :try_start_8
    invoke-static {v0, p0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 503
    .line 504
    .line 505
    move-result-object p0

    .line 506
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7

    .line 507
    .line 508
    .line 509
    goto :goto_b

    .line 510
    :cond_a
    :try_start_9
    sget-object v5, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/ref/WeakReference;

    .line 511
    .line 512
    if-eqz v5, :cond_b

    .line 513
    .line 514
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v5
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6

    .line 518
    if-eqz v5, :cond_b

    .line 519
    .line 520
    :try_start_a
    sget-object v5, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/ref/WeakReference;

    .line 521
    .line 522
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v5

    .line 526
    check-cast v5, Landroid/view/View;

    .line 527
    .line 528
    invoke-interface {v4, v5}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_5

    .line 529
    .line 530
    .line 531
    :catch_5
    :cond_b
    :try_start_b
    sget-object v5, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

    .line 532
    .line 533
    if-eqz v5, :cond_c

    .line 534
    .line 535
    invoke-virtual {v3, v5}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 536
    .line 537
    .line 538
    :cond_c
    new-instance v5, Landroid/view/WindowManager$LayoutParams;

    .line 539
    .line 540
    invoke-direct {v5}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 541
    .line 542
    .line 543
    const/16 v6, 0x7f6

    .line 544
    .line 545
    iput v6, v5, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 546
    .line 547
    const/16 v6, 0xa8

    .line 548
    .line 549
    iput v6, v5, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 550
    .line 551
    const/4 v6, -0x3

    .line 552
    iput v6, v5, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 553
    .line 554
    const/4 v6, -0x2

    .line 555
    iput v6, v5, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 556
    .line 557
    iput v6, v5, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 558
    .line 559
    const/16 v6, 0x31

    .line 560
    .line 561
    iput v6, v5, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 562
    .line 563
    invoke-static {v0, v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;F)I

    .line 564
    .line 565
    .line 566
    move-result v1

    .line 567
    iput v1, v5, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 568
    .line 569
    const v1, 0x1030004

    .line 570
    .line 571
    .line 572
    iput v1, v5, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 573
    .line 574
    invoke-static {v0, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/LinearLayout;

    .line 575
    .line 576
    .line 577
    move-result-object v1

    .line 578
    invoke-interface {v4, v1, v5}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 579
    .line 580
    .line 581
    new-instance v5, Ljava/lang/ref/WeakReference;

    .line 582
    .line 583
    invoke-direct {v5, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 584
    .line 585
    .line 586
    sput-object v5, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/ref/WeakReference;

    .line 587
    .line 588
    new-instance v1, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

    .line 589
    .line 590
    const/16 v5, 0x10

    .line 591
    .line 592
    invoke-direct {v1, v4, v5}, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/Object;I)V

    .line 593
    .line 594
    .line 595
    sput-object v1, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

    .line 596
    .line 597
    const-wide/16 v4, 0xbb8

    .line 598
    .line 599
    invoke-virtual {v3, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_6

    .line 600
    .line 601
    .line 602
    goto :goto_b

    .line 603
    :catch_6
    :try_start_c
    invoke-static {v0, p0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 604
    .line 605
    .line 606
    move-result-object p0

    .line 607
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 608
    .line 609
    .line 610
    goto :goto_b

    .line 611
    :cond_d
    invoke-static {v0, p0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 612
    .line 613
    .line 614
    move-result-object p0

    .line 615
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_7

    .line 616
    .line 617
    .line 618
    :catch_7
    :goto_b
    return-void

    .line 619
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
