.class public final synthetic Lwb/qa;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lfg/l;Lq9/g;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwb/qa;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/qa;->m:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/qa;->n:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/qa;->o:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/qa;->h:Li0/a1;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/qa;->i:Li0/a1;

    .line 16
    .line 17
    iput-object p6, p0, Lwb/qa;->j:Li0/a1;

    .line 18
    .line 19
    iput-object p7, p0, Lwb/qa;->k:Li0/a1;

    .line 20
    .line 21
    iput-object p8, p0, Lwb/qa;->l:Li0/a1;

    .line 22
    .line 23
    iput-object p9, p0, Lwb/qa;->p:Ljava/lang/Object;

    .line 24
    .line 25
    iput-object p10, p0, Lwb/qa;->q:Ljava/lang/Object;

    .line 26
    .line 27
    iput-object p11, p0, Lwb/qa;->r:Ljava/lang/Object;

    .line 28
    .line 29
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Lqg/t;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Landroid/content/Context;)V
    .locals 1

    .line 30
    const/4 v0, 0x2

    iput v0, p0, Lwb/qa;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/qa;->n:Ljava/lang/Object;

    iput-object p2, p0, Lwb/qa;->o:Ljava/lang/Object;

    iput-object p3, p0, Lwb/qa;->h:Li0/a1;

    iput-object p4, p0, Lwb/qa;->i:Li0/a1;

    iput-object p5, p0, Lwb/qa;->j:Li0/a1;

    iput-object p6, p0, Lwb/qa;->k:Li0/a1;

    iput-object p7, p0, Lwb/qa;->l:Li0/a1;

    iput-object p8, p0, Lwb/qa;->p:Ljava/lang/Object;

    iput-object p9, p0, Lwb/qa;->q:Ljava/lang/Object;

    iput-object p10, p0, Lwb/qa;->r:Ljava/lang/Object;

    iput-object p11, p0, Lwb/qa;->m:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/SharedPreferences;Ljava/lang/String;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 31
    const/4 v0, 0x1

    iput v0, p0, Lwb/qa;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/qa;->m:Ljava/lang/Object;

    iput-object p2, p0, Lwb/qa;->n:Ljava/lang/Object;

    iput-object p3, p0, Lwb/qa;->o:Ljava/lang/Object;

    iput-object p4, p0, Lwb/qa;->p:Ljava/lang/Object;

    iput-object p5, p0, Lwb/qa;->q:Ljava/lang/Object;

    iput-object p6, p0, Lwb/qa;->r:Ljava/lang/Object;

    iput-object p7, p0, Lwb/qa;->h:Li0/a1;

    iput-object p8, p0, Lwb/qa;->i:Li0/a1;

    iput-object p9, p0, Lwb/qa;->j:Li0/a1;

    iput-object p10, p0, Lwb/qa;->k:Li0/a1;

    iput-object p11, p0, Lwb/qa;->l:Li0/a1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/qa;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lwb/qa;->n:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Landroid/content/SharedPreferences;

    .line 11
    .line 12
    iget-object v2, v0, Lwb/qa;->o:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lqg/t;

    .line 15
    .line 16
    iget-object v3, v0, Lwb/qa;->p:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v9, v3

    .line 19
    check-cast v9, Li0/a1;

    .line 20
    .line 21
    iget-object v3, v0, Lwb/qa;->q:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v10, v3

    .line 24
    check-cast v10, Li0/a1;

    .line 25
    .line 26
    iget-object v3, v0, Lwb/qa;->r:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v14, v3

    .line 29
    check-cast v14, Li0/a1;

    .line 30
    .line 31
    iget-object v3, v0, Lwb/qa;->m:Ljava/lang/Object;

    .line 32
    .line 33
    move-object v12, v3

    .line 34
    check-cast v12, Landroid/content/Context;

    .line 35
    .line 36
    iget-object v4, v0, Lwb/qa;->h:Li0/a1;

    .line 37
    .line 38
    iget-object v5, v0, Lwb/qa;->i:Li0/a1;

    .line 39
    .line 40
    iget-object v6, v0, Lwb/qa;->j:Li0/a1;

    .line 41
    .line 42
    iget-object v7, v0, Lwb/qa;->k:Li0/a1;

    .line 43
    .line 44
    iget-object v8, v0, Lwb/qa;->l:Li0/a1;

    .line 45
    .line 46
    invoke-static/range {v4 .. v10}, Lwb/ho;->r(Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)Lx8/u;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    const-string v4, "ai_stream"

    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    invoke-interface {v1, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 54
    .line 55
    .line 56
    move-result v22

    .line 57
    invoke-virtual {v3}, Lx8/u;->b()Lx8/u;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    new-instance v15, Lx8/a;

    .line 62
    .line 63
    iget-object v3, v1, Lx8/u;->b:Ljava/lang/String;

    .line 64
    .line 65
    iget-object v4, v1, Lx8/u;->c:Ljava/lang/String;

    .line 66
    .line 67
    iget-object v5, v1, Lx8/u;->d:Ljava/lang/String;

    .line 68
    .line 69
    iget-object v6, v1, Lx8/u;->e:Ljava/lang/String;

    .line 70
    .line 71
    iget-object v7, v1, Lx8/u;->f:Ljava/lang/String;

    .line 72
    .line 73
    iget v1, v1, Lx8/u;->g:I

    .line 74
    .line 75
    move/from16 v21, v1

    .line 76
    .line 77
    move-object/from16 v16, v3

    .line 78
    .line 79
    move-object/from16 v17, v4

    .line 80
    .line 81
    move-object/from16 v18, v5

    .line 82
    .line 83
    move-object/from16 v19, v6

    .line 84
    .line 85
    move-object/from16 v20, v7

    .line 86
    .line 87
    invoke-direct/range {v15 .. v22}, Lx8/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 88
    .line 89
    .line 90
    const-string v1, "\u6b63\u5728\u6d4b\u8bd5..."

    .line 91
    .line 92
    invoke-interface {v14, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    new-instance v11, Lci/e;

    .line 96
    .line 97
    const/16 v16, 0x9

    .line 98
    .line 99
    move-object v13, v15

    .line 100
    const/4 v15, 0x0

    .line 101
    invoke-direct/range {v11 .. v16}, Lci/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 102
    .line 103
    .line 104
    const/4 v1, 0x3

    .line 105
    invoke-static {v2, v15, v11, v1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 106
    .line 107
    .line 108
    :goto_0
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 109
    .line 110
    return-object v1

    .line 111
    :pswitch_0
    iget-object v1, v0, Lwb/qa;->m:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v1, Ljava/lang/String;

    .line 114
    .line 115
    iget-object v2, v0, Lwb/qa;->n:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v2, Ljava/lang/String;

    .line 118
    .line 119
    iget-object v3, v0, Lwb/qa;->o:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v3, Ljava/lang/String;

    .line 122
    .line 123
    iget-object v4, v0, Lwb/qa;->p:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v4, Ljava/lang/String;

    .line 126
    .line 127
    iget-object v5, v0, Lwb/qa;->q:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v5, Landroid/content/SharedPreferences;

    .line 130
    .line 131
    iget-object v6, v0, Lwb/qa;->r:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v6, Ljava/lang/String;

    .line 134
    .line 135
    iget-object v7, v0, Lwb/qa;->h:Li0/a1;

    .line 136
    .line 137
    const-string v8, "global"

    .line 138
    .line 139
    invoke-interface {v7, v8}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    iget-object v7, v0, Lwb/qa;->i:Li0/a1;

    .line 143
    .line 144
    invoke-interface {v7, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    iget-object v7, v0, Lwb/qa;->j:Li0/a1;

    .line 148
    .line 149
    invoke-interface {v7, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    iget-object v7, v0, Lwb/qa;->k:Li0/a1;

    .line 153
    .line 154
    invoke-interface {v7, v3}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    iget-object v7, v0, Lwb/qa;->l:Li0/a1;

    .line 158
    .line 159
    invoke-interface {v7, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    invoke-interface {v5}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    const-string v7, "group_rename_prompt_type"

    .line 167
    .line 168
    invoke-static {v7, v6}, Lx6/d;->E(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    invoke-interface {v5, v7, v8}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    const-string v7, "group_rename_both_order"

    .line 177
    .line 178
    invoke-static {v7, v6}, Lx6/d;->E(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    invoke-interface {v5, v7, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    const-string v5, "group_rename_text"

    .line 187
    .line 188
    invoke-static {v5, v6}, Lx6/d;->E(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    invoke-interface {v1, v5, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    const-string v2, "group_rename_card_title"

    .line 197
    .line 198
    invoke-static {v2, v6}, Lx6/d;->E(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    const-string v2, "group_rename_card_desc"

    .line 207
    .line 208
    invoke-static {v2, v6}, Lx6/d;->E(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 217
    .line 218
    .line 219
    goto :goto_0

    .line 220
    :pswitch_1
    iget-object v1, v0, Lwb/qa;->m:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v1, Landroid/content/Context;

    .line 223
    .line 224
    iget-object v2, v0, Lwb/qa;->n:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v2, Lfg/l;

    .line 227
    .line 228
    iget-object v3, v0, Lwb/qa;->o:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v3, Lq9/g;

    .line 231
    .line 232
    iget-object v4, v0, Lwb/qa;->p:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v4, Li0/a1;

    .line 235
    .line 236
    iget-object v5, v0, Lwb/qa;->q:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v5, Li0/a1;

    .line 239
    .line 240
    iget-object v6, v0, Lwb/qa;->r:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v6, Li0/a1;

    .line 243
    .line 244
    iget-object v7, v0, Lwb/qa;->h:Li0/a1;

    .line 245
    .line 246
    invoke-interface {v7}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v8

    .line 250
    check-cast v8, Ljava/lang/String;

    .line 251
    .line 252
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 253
    .line 254
    .line 255
    move-result v8

    .line 256
    const/4 v9, 0x0

    .line 257
    if-eqz v8, :cond_0

    .line 258
    .line 259
    const-string v2, "\u8bf7\u8f93\u5165\u6a21\u677f\u540d\u79f0"

    .line 260
    .line 261
    invoke-static {v1, v2, v9}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 266
    .line 267
    .line 268
    goto/16 :goto_5

    .line 269
    .line 270
    :cond_0
    invoke-interface {v7}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    check-cast v1, Ljava/lang/String;

    .line 275
    .line 276
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v12

    .line 284
    iget-object v1, v0, Lwb/qa;->i:Li0/a1;

    .line 285
    .line 286
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    check-cast v1, Ljava/lang/Boolean;

    .line 291
    .line 292
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 293
    .line 294
    .line 295
    move-result v13

    .line 296
    iget-object v1, v0, Lwb/qa;->j:Li0/a1;

    .line 297
    .line 298
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    check-cast v1, Ljava/lang/String;

    .line 303
    .line 304
    invoke-static {v1}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    if-eqz v1, :cond_1

    .line 309
    .line 310
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    const/16 v7, 0x258

    .line 315
    .line 316
    invoke-static {v1, v9, v7}, Lr9/e0;->r(III)I

    .line 317
    .line 318
    .line 319
    move-result v9

    .line 320
    :cond_1
    move v14, v9

    .line 321
    iget-object v1, v0, Lwb/qa;->k:Li0/a1;

    .line 322
    .line 323
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    check-cast v1, Ljava/lang/String;

    .line 328
    .line 329
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 333
    .line 334
    .line 335
    move-result v7

    .line 336
    const v8, 0x2e3b81

    .line 337
    .line 338
    .line 339
    const-string v9, "text"

    .line 340
    .line 341
    if-eq v7, v8, :cond_4

    .line 342
    .line 343
    const v8, 0x2e7b10

    .line 344
    .line 345
    .line 346
    if-eq v7, v8, :cond_3

    .line 347
    .line 348
    const v8, 0x36452d

    .line 349
    .line 350
    .line 351
    if-eq v7, v8, :cond_2

    .line 352
    .line 353
    goto :goto_1

    .line 354
    :cond_2
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v7

    .line 358
    if-nez v7, :cond_5

    .line 359
    .line 360
    goto :goto_1

    .line 361
    :cond_3
    const-string v7, "card"

    .line 362
    .line 363
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v7

    .line 367
    if-nez v7, :cond_5

    .line 368
    .line 369
    goto :goto_1

    .line 370
    :cond_4
    const-string v7, "both"

    .line 371
    .line 372
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    move-result v7

    .line 376
    if-nez v7, :cond_5

    .line 377
    .line 378
    :goto_1
    move-object v15, v9

    .line 379
    goto :goto_2

    .line 380
    :cond_5
    move-object v15, v1

    .line 381
    :goto_2
    iget-object v1, v0, Lwb/qa;->l:Li0/a1;

    .line 382
    .line 383
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    check-cast v1, Ljava/lang/String;

    .line 388
    .line 389
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    const-string v7, "card_first"

    .line 393
    .line 394
    invoke-virtual {v1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    move-result v1

    .line 398
    if-eqz v1, :cond_6

    .line 399
    .line 400
    :goto_3
    move-object/from16 v16, v7

    .line 401
    .line 402
    goto :goto_4

    .line 403
    :cond_6
    const-string v7, "text_first"

    .line 404
    .line 405
    goto :goto_3

    .line 406
    :goto_4
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    move-object/from16 v17, v1

    .line 411
    .line 412
    check-cast v17, Ljava/lang/String;

    .line 413
    .line 414
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v1

    .line 418
    move-object/from16 v18, v1

    .line 419
    .line 420
    check-cast v18, Ljava/lang/String;

    .line 421
    .line 422
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v1

    .line 426
    move-object/from16 v19, v1

    .line 427
    .line 428
    check-cast v19, Ljava/lang/String;

    .line 429
    .line 430
    iget-object v11, v3, Lq9/g;->a:Ljava/lang/String;

    .line 431
    .line 432
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    new-instance v10, Lq9/g;

    .line 445
    .line 446
    invoke-direct/range {v10 .. v19}, Lq9/g;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    invoke-interface {v2, v10}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    :goto_5
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 453
    .line 454
    return-object v1

    .line 455
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
