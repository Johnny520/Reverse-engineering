.class public final synthetic Llb/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ILx8/r;Landroid/content/Context;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Llb/a;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Llb/a;->h:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, Llb/a;->i:Ljava/lang/Object;

    .line 10
    .line 11
    iput p3, p0, Llb/a;->j:I

    .line 12
    .line 13
    iput-object p4, p0, Llb/a;->k:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Llb/a;->l:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(Llb/i;Lj8/y;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .line 18
    const/4 v0, 0x0

    iput v0, p0, Llb/a;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb/a;->k:Ljava/lang/Object;

    iput-object p2, p0, Llb/a;->l:Ljava/lang/Object;

    iput-object p3, p0, Llb/a;->h:Ljava/lang/String;

    iput-object p4, p0, Llb/a;->i:Ljava/lang/Object;

    iput p5, p0, Llb/a;->j:I

    return-void
.end method

.method public synthetic constructor <init>(Lra/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .line 19
    const/4 v0, 0x1

    iput v0, p0, Llb/a;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb/a;->k:Ljava/lang/Object;

    iput-object p2, p0, Llb/a;->h:Ljava/lang/String;

    iput-object p3, p0, Llb/a;->i:Ljava/lang/Object;

    iput-object p4, p0, Llb/a;->l:Ljava/lang/Object;

    iput p5, p0, Llb/a;->j:I

    return-void
.end method

.method public synthetic constructor <init>(Lrb/k;Lrb/h;ILjava/lang/String;Lorg/json/JSONObject;)V
    .locals 1

    .line 20
    const/4 v0, 0x2

    iput v0, p0, Llb/a;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb/a;->k:Ljava/lang/Object;

    iput-object p2, p0, Llb/a;->l:Ljava/lang/Object;

    iput p3, p0, Llb/a;->j:I

    iput-object p4, p0, Llb/a;->h:Ljava/lang/String;

    iput-object p5, p0, Llb/a;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Llb/a;->g:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, ""

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v5, v1, Llb/a;->h:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v6, v1, Llb/a;->l:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v7, v1, Llb/a;->k:Ljava/lang/Object;

    .line 14
    .line 15
    iget v8, v1, Llb/a;->j:I

    .line 16
    .line 17
    iget-object v9, v1, Llb/a;->i:Ljava/lang/Object;

    .line 18
    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    iget-object v11, v1, Llb/a;->h:Ljava/lang/String;

    .line 23
    .line 24
    check-cast v9, Ljava/lang/String;

    .line 25
    .line 26
    check-cast v7, Lx8/r;

    .line 27
    .line 28
    move-object v10, v6

    .line 29
    check-cast v10, Landroid/content/Context;

    .line 30
    .line 31
    sget-object v0, Lx8/q;->a:Ljava/util/concurrent/ExecutorService;

    .line 32
    .line 33
    :try_start_0
    sget-object v0, Leb/k;->a:Leb/k;

    .line 34
    .line 35
    invoke-static {v8, v11, v9}, Leb/k;->p(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->s()Lg8/l;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    if-eqz v5, :cond_0

    .line 51
    .line 52
    invoke-virtual {v5, v0, v9, v8, v4}, Lg8/l;->c(Ljava/lang/String;Ljava/lang/String;II)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    goto :goto_2

    .line 58
    :cond_0
    :goto_0
    const-string v0, "auto_accept_tag_enable"

    .line 59
    .line 60
    invoke-virtual {v7, v0}, Lx8/r;->e(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    const-string v4, "auto_accept_tag_name"

    .line 65
    .line 66
    invoke-virtual {v7, v4, v3}, Lx8/r;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-static {v11, v3, v0}, Lx8/q;->w(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    sget-object v0, Lx8/q;->m:Lx8/f;

    .line 74
    .line 75
    invoke-static {v7, v11, v0}, Lx8/q;->c(Lx8/r;Ljava/lang/String;Lx8/f;)V

    .line 76
    .line 77
    .line 78
    invoke-static {v7, v11, v0}, Lx8/q;->d(Lx8/r;Ljava/lang/String;Lx8/f;)V

    .line 79
    .line 80
    .line 81
    const-string v0, "auto_accept_delay_ms"

    .line 82
    .line 83
    invoke-virtual {v7, v0}, Lx8/r;->g(Ljava/lang/String;)J

    .line 84
    .line 85
    .line 86
    move-result-wide v3

    .line 87
    const-wide/16 v5, 0x0

    .line 88
    .line 89
    cmp-long v0, v3, v5

    .line 90
    .line 91
    if-gez v0, :cond_1

    .line 92
    .line 93
    move-wide v14, v5

    .line 94
    goto :goto_1

    .line 95
    :cond_1
    move-wide v14, v3

    .line 96
    :goto_1
    invoke-virtual {v7}, Lx8/r;->c()Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v12

    .line 100
    new-instance v13, Lx8/g;

    .line 101
    .line 102
    const/16 v0, 0xfc

    .line 103
    .line 104
    invoke-direct {v13, v0, v11, v11, v2}, Lx8/g;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    const/16 v16, 0x0

    .line 108
    .line 109
    invoke-static/range {v10 .. v16}, Lx8/q;->k(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Lx8/g;JZ)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 114
    .line 115
    .line 116
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    goto :goto_3

    .line 118
    :goto_2
    new-instance v2, Lsf/f;

    .line 119
    .line 120
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 121
    .line 122
    .line 123
    move-object v0, v2

    .line 124
    :goto_3
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    if-eqz v0, :cond_2

    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    const-string v3, "[Hchat:AutoReply] \u597d\u53cb\u7533\u8bf7\u5904\u7406\u5931\u8d25: "

    .line 135
    .line 136
    invoke-static {v3, v2, v0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 137
    .line 138
    .line 139
    :cond_2
    return-void

    .line 140
    :pswitch_0
    check-cast v7, Lrb/k;

    .line 141
    .line 142
    check-cast v6, Lrb/h;

    .line 143
    .line 144
    check-cast v9, Lorg/json/JSONObject;

    .line 145
    .line 146
    iget-object v0, v6, Lrb/h;->a:Lrb/j;

    .line 147
    .line 148
    iget-object v0, v0, Lrb/j;->a:Ljava/lang/String;

    .line 149
    .line 150
    iget-object v6, v7, Lrb/k;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 151
    .line 152
    invoke-virtual {v6, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    check-cast v6, Ljava/lang/String;

    .line 157
    .line 158
    if-nez v6, :cond_3

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_3
    move-object v3, v6

    .line 162
    :goto_4
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    if-eqz v6, :cond_4

    .line 167
    .line 168
    move-object v3, v0

    .line 169
    :cond_4
    invoke-static {v5}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 178
    .line 179
    .line 180
    move-result v6

    .line 181
    if-eqz v6, :cond_5

    .line 182
    .line 183
    goto :goto_5

    .line 184
    :cond_5
    const-string v6, "\u4e0d\u662f\u6536\u6b3e\u65b9\u597d\u53cb"

    .line 185
    .line 186
    invoke-static {v5, v6, v4}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 187
    .line 188
    .line 189
    move-result v6

    .line 190
    if-nez v6, :cond_c

    .line 191
    .line 192
    const-string v6, "\u62d2\u7edd\u63a5\u6536\u4f60\u7684"

    .line 193
    .line 194
    invoke-static {v5, v6, v4}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    if-nez v6, :cond_c

    .line 199
    .line 200
    const-string v6, "\u5bf9\u65b9\u62d2\u7edd\u63a5\u6536"

    .line 201
    .line 202
    invoke-static {v5, v6, v4}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 203
    .line 204
    .line 205
    move-result v6

    .line 206
    if-nez v6, :cond_c

    .line 207
    .line 208
    const-string v6, "\u597d\u53cb\u5173\u7cfb\u662f\u5426\u6b63\u5e38"

    .line 209
    .line 210
    invoke-static {v5, v6, v4}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 211
    .line 212
    .line 213
    move-result v6

    .line 214
    if-nez v6, :cond_c

    .line 215
    .line 216
    const-string v6, "\u786e\u8ba4\u4f60\u548c"

    .line 217
    .line 218
    invoke-static {v5, v6, v4}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 219
    .line 220
    .line 221
    move-result v6

    .line 222
    if-eqz v6, :cond_6

    .line 223
    .line 224
    const-string v6, "\u597d\u53cb\u5173\u7cfb"

    .line 225
    .line 226
    invoke-static {v5, v6, v4}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 227
    .line 228
    .line 229
    move-result v4

    .line 230
    if-eqz v4, :cond_6

    .line 231
    .line 232
    goto :goto_7

    .line 233
    :cond_6
    :goto_5
    if-eqz v8, :cond_7

    .line 234
    .line 235
    const/4 v4, 0x2

    .line 236
    if-ne v8, v4, :cond_a

    .line 237
    .line 238
    :cond_7
    if-eqz v9, :cond_8

    .line 239
    .line 240
    const-string v2, "req_key"

    .line 241
    .line 242
    invoke-virtual {v9, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    :cond_8
    if-eqz v2, :cond_a

    .line 247
    .line 248
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    if-eqz v2, :cond_9

    .line 253
    .line 254
    goto :goto_6

    .line 255
    :cond_9
    new-instance v2, Lrb/d;

    .line 256
    .line 257
    sget-object v4, Lrb/e;->g:Lrb/e;

    .line 258
    .line 259
    const-string v5, "\u597d\u53cb\u5173\u7cfb\u6b63\u5e38"

    .line 260
    .line 261
    invoke-direct {v2, v0, v3, v4, v5}, Lrb/d;-><init>(Ljava/lang/String;Ljava/lang/String;Lrb/e;Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    goto :goto_8

    .line 265
    :cond_a
    :goto_6
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    if-eqz v2, :cond_b

    .line 270
    .line 271
    const-string v2, "\u68c0\u6d4b\u8fd4\u56de\u5f02\u5e38\u7801 "

    .line 272
    .line 273
    invoke-static {v8, v2}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    :cond_b
    new-instance v2, Lrb/d;

    .line 278
    .line 279
    sget-object v4, Lrb/e;->i:Lrb/e;

    .line 280
    .line 281
    invoke-direct {v2, v0, v3, v4, v5}, Lrb/d;-><init>(Ljava/lang/String;Ljava/lang/String;Lrb/e;Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    goto :goto_8

    .line 285
    :cond_c
    :goto_7
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    if-eqz v2, :cond_d

    .line 290
    .line 291
    const-string v5, "\u597d\u53cb\u5173\u7cfb\u5f02\u5e38"

    .line 292
    .line 293
    :cond_d
    new-instance v2, Lrb/d;

    .line 294
    .line 295
    sget-object v4, Lrb/e;->h:Lrb/e;

    .line 296
    .line 297
    invoke-direct {v2, v0, v3, v4, v5}, Lrb/d;-><init>(Ljava/lang/String;Ljava/lang/String;Lrb/e;Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    :goto_8
    invoke-virtual {v7, v2}, Lrb/k;->i(Lrb/d;)V

    .line 301
    .line 302
    .line 303
    return-void

    .line 304
    :pswitch_1
    check-cast v7, Lra/c;

    .line 305
    .line 306
    check-cast v9, Ljava/lang/String;

    .line 307
    .line 308
    check-cast v6, Ljava/lang/String;

    .line 309
    .line 310
    invoke-virtual {v7, v8, v5, v9, v6}, Lra/c;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    return-void

    .line 314
    :pswitch_2
    check-cast v7, Llb/i;

    .line 315
    .line 316
    check-cast v6, Lj8/y;

    .line 317
    .line 318
    check-cast v9, Ljava/lang/String;

    .line 319
    .line 320
    :try_start_1
    invoke-virtual {v6, v8, v5, v9}, Lj8/y;->s(ILjava/lang/String;Ljava/lang/String;)Z

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 325
    .line 326
    .line 327
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 328
    goto :goto_9

    .line 329
    :catchall_1
    move-exception v0

    .line 330
    new-instance v2, Lsf/f;

    .line 331
    .line 332
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 333
    .line 334
    .line 335
    move-object v0, v2

    .line 336
    :goto_9
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    if-eqz v0, :cond_e

    .line 341
    .line 342
    iget-object v2, v7, Llb/i;->b:Lia/t;

    .line 343
    .line 344
    const-string v3, "\u590d\u8bfb\u8bed\u97f3\u53d1\u9001\u5931\u8d25"

    .line 345
    .line 346
    invoke-virtual {v2, v3, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    :cond_e
    return-void

    .line 350
    nop

    .line 351
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
