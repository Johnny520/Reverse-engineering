.class public final synthetic Lbk2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Lxk1;

.field public final synthetic j:Lxk1;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Lj20;

.field public final synthetic r:Lxk1;

.field public final synthetic s:Lxk1;

.field public final synthetic t:Lxk1;

.field public final synthetic u:Lxk1;

.field public final synthetic v:Lxk1;

.field public final synthetic w:Lxk1;

.field public final synthetic x:Lxk1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lxk1;Lxk1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj20;Lxk1;Lxk1;Lxk1;Lxk1;Lxk1;Lxk1;Lxk1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbk2;->h:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lbk2;->i:Lxk1;

    .line 7
    .line 8
    iput-object p3, p0, Lbk2;->j:Lxk1;

    .line 9
    .line 10
    iput-object p4, p0, Lbk2;->k:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lbk2;->l:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lbk2;->m:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, Lbk2;->n:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p8, p0, Lbk2;->o:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p9, p0, Lbk2;->p:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p10, p0, Lbk2;->q:Lj20;

    .line 23
    .line 24
    iput-object p11, p0, Lbk2;->r:Lxk1;

    .line 25
    .line 26
    iput-object p12, p0, Lbk2;->s:Lxk1;

    .line 27
    .line 28
    iput-object p13, p0, Lbk2;->t:Lxk1;

    .line 29
    .line 30
    iput-object p14, p0, Lbk2;->u:Lxk1;

    .line 31
    .line 32
    iput-object p15, p0, Lbk2;->v:Lxk1;

    .line 33
    .line 34
    move-object/from16 p1, p16

    .line 35
    .line 36
    iput-object p1, p0, Lbk2;->w:Lxk1;

    .line 37
    .line 38
    move-object/from16 p1, p17

    .line 39
    .line 40
    iput-object p1, p0, Lbk2;->x:Lxk1;

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Ls81;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v2, Lwt0;

    .line 11
    .line 12
    const/16 v3, 0x8

    .line 13
    .line 14
    iget-object v14, v0, Lbk2;->h:Landroid/content/Context;

    .line 15
    .line 16
    invoke-direct {v2, v3, v14}, Lwt0;-><init>(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    new-instance v3, Lkw;

    .line 20
    .line 21
    const v4, 0xb0b59a1

    .line 22
    .line 23
    .line 24
    const/4 v5, 0x1

    .line 25
    invoke-direct {v3, v4, v5, v2}, Lkw;-><init>(IZLun0;)V

    .line 26
    .line 27
    .line 28
    const-string v2, "script_directory"

    .line 29
    .line 30
    const/4 v4, 0x2

    .line 31
    invoke-static {v1, v2, v3, v4}, Ls81;->a(Ls81;Ljava/lang/String;Lkw;I)V

    .line 32
    .line 33
    .line 34
    iget-object v2, v0, Lbk2;->i:Lxk1;

    .line 35
    .line 36
    invoke-interface {v2}, Lgu2;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Ltq1;

    .line 41
    .line 42
    iget-object v3, v3, Ltq1;->a:Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    iget-object v6, v0, Lbk2;->j:Lxk1;

    .line 49
    .line 50
    iget-object v8, v0, Lbk2;->l:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v9, v0, Lbk2;->m:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v11, v0, Lbk2;->o:Ljava/lang/String;

    .line 55
    .line 56
    iget-object v12, v0, Lbk2;->p:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v13, v0, Lbk2;->q:Lj20;

    .line 59
    .line 60
    iget-object v15, v0, Lbk2;->r:Lxk1;

    .line 61
    .line 62
    iget-object v7, v0, Lbk2;->s:Lxk1;

    .line 63
    .line 64
    if-eqz v3, :cond_0

    .line 65
    .line 66
    new-instance v3, Ly30;

    .line 67
    .line 68
    invoke-direct {v3, v2, v4}, Ly30;-><init>(Lxk1;I)V

    .line 69
    .line 70
    .line 71
    new-instance v10, Lkw;

    .line 72
    .line 73
    const v4, -0x30d87184

    .line 74
    .line 75
    .line 76
    invoke-direct {v10, v4, v5, v3}, Lkw;-><init>(IZLun0;)V

    .line 77
    .line 78
    .line 79
    const-string v3, "script_empty"

    .line 80
    .line 81
    const/4 v4, 0x2

    .line 82
    invoke-static {v1, v3, v10, v4}, Ls81;->a(Ls81;Ljava/lang/String;Lkw;I)V

    .line 83
    .line 84
    .line 85
    move v3, v5

    .line 86
    move-object v5, v2

    .line 87
    move v2, v3

    .line 88
    move v3, v4

    .line 89
    move-object/from16 v16, v7

    .line 90
    .line 91
    move-object/from16 v18, v8

    .line 92
    .line 93
    move-object/from16 v17, v9

    .line 94
    .line 95
    move-object/from16 v19, v11

    .line 96
    .line 97
    move-object/from16 v20, v12

    .line 98
    .line 99
    move-object v8, v13

    .line 100
    goto :goto_0

    .line 101
    :cond_0
    move v3, v4

    .line 102
    new-instance v4, Ldk2;

    .line 103
    .line 104
    move-object/from16 v16, v7

    .line 105
    .line 106
    iget-object v7, v0, Lbk2;->k:Ljava/lang/String;

    .line 107
    .line 108
    iget-object v10, v0, Lbk2;->n:Ljava/lang/String;

    .line 109
    .line 110
    move/from16 v24, v5

    .line 111
    .line 112
    move-object v5, v2

    .line 113
    move/from16 v2, v24

    .line 114
    .line 115
    invoke-direct/range {v4 .. v16}, Ldk2;-><init>(Lxk1;Lxk1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj20;Landroid/content/Context;Lxk1;Lxk1;)V

    .line 116
    .line 117
    .line 118
    move-object/from16 v18, v8

    .line 119
    .line 120
    move-object/from16 v17, v9

    .line 121
    .line 122
    move-object/from16 v19, v11

    .line 123
    .line 124
    move-object/from16 v20, v12

    .line 125
    .line 126
    move-object v8, v13

    .line 127
    new-instance v7, Lkw;

    .line 128
    .line 129
    const v9, 0x55058a45

    .line 130
    .line 131
    .line 132
    invoke-direct {v7, v9, v2, v4}, Lkw;-><init>(IZLun0;)V

    .line 133
    .line 134
    .line 135
    const-string v4, "script_list"

    .line 136
    .line 137
    invoke-static {v1, v4, v7, v3}, Ls81;->a(Ls81;Ljava/lang/String;Lkw;I)V

    .line 138
    .line 139
    .line 140
    :goto_0
    invoke-interface {v5}, Lgu2;->getValue()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    check-cast v4, Ltq1;

    .line 145
    .line 146
    iget-object v4, v4, Ltq1;->a:Ljava/util/List;

    .line 147
    .line 148
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    if-eqz v5, :cond_2

    .line 157
    .line 158
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    move-object v7, v5

    .line 163
    check-cast v7, Lcq1;

    .line 164
    .line 165
    iget-object v7, v7, Lcq1;->a:Ljava/lang/String;

    .line 166
    .line 167
    invoke-interface {v6}, Lgu2;->getValue()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v9

    .line 171
    check-cast v9, Ljava/lang/String;

    .line 172
    .line 173
    invoke-static {v7, v9}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v7

    .line 177
    if-eqz v7, :cond_1

    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_2
    const/4 v5, 0x0

    .line 181
    :goto_1
    check-cast v5, Lcq1;

    .line 182
    .line 183
    if-eqz v5, :cond_3

    .line 184
    .line 185
    iget-object v4, v5, Lcq1;->a:Ljava/lang/String;

    .line 186
    .line 187
    const-string v7, "script_permissions_"

    .line 188
    .line 189
    invoke-static {v7, v4}, Lvi0;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    move-object/from16 v22, v15

    .line 194
    .line 195
    new-instance v15, Lek2;

    .line 196
    .line 197
    iget-object v7, v0, Lbk2;->t:Lxk1;

    .line 198
    .line 199
    move-object/from16 v21, v7

    .line 200
    .line 201
    move-object/from16 v23, v16

    .line 202
    .line 203
    move-object/from16 v16, v5

    .line 204
    .line 205
    invoke-direct/range {v15 .. v23}, Lek2;-><init>(Lcq1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxk1;Lxk1;Lxk1;)V

    .line 206
    .line 207
    .line 208
    move-object/from16 v16, v23

    .line 209
    .line 210
    new-instance v7, Lkw;

    .line 211
    .line 212
    const v9, 0x7a9f6473

    .line 213
    .line 214
    .line 215
    invoke-direct {v7, v9, v2, v15}, Lkw;-><init>(IZLun0;)V

    .line 216
    .line 217
    .line 218
    invoke-static {v1, v4, v7, v3}, Ls81;->a(Ls81;Ljava/lang/String;Lkw;I)V

    .line 219
    .line 220
    .line 221
    :cond_3
    if-eqz v5, :cond_4

    .line 222
    .line 223
    iget-boolean v4, v5, Lcq1;->e:Z

    .line 224
    .line 225
    if-nez v4, :cond_4

    .line 226
    .line 227
    new-instance v4, Lfk2;

    .line 228
    .line 229
    const/4 v7, 0x0

    .line 230
    invoke-direct {v4, v5, v7}, Lfk2;-><init>(Lcq1;I)V

    .line 231
    .line 232
    .line 233
    new-instance v5, Lkw;

    .line 234
    .line 235
    const v7, 0x23d04af4

    .line 236
    .line 237
    .line 238
    invoke-direct {v5, v7, v2, v4}, Lkw;-><init>(IZLun0;)V

    .line 239
    .line 240
    .line 241
    const-string v4, "script_no_schema"

    .line 242
    .line 243
    invoke-static {v1, v4, v5, v3}, Ls81;->a(Ls81;Ljava/lang/String;Lkw;I)V

    .line 244
    .line 245
    .line 246
    :cond_4
    iget-object v4, v0, Lbk2;->u:Lxk1;

    .line 247
    .line 248
    invoke-interface {v4}, Lgu2;->getValue()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    check-cast v4, Ljava/lang/Boolean;

    .line 253
    .line 254
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 255
    .line 256
    .line 257
    move-result v4

    .line 258
    if-eqz v4, :cond_5

    .line 259
    .line 260
    const-string v4, "script_settings_loading"

    .line 261
    .line 262
    sget-object v5, Lt11;->a:Lkw;

    .line 263
    .line 264
    invoke-static {v1, v4, v5, v3}, Ls81;->a(Ls81;Ljava/lang/String;Lkw;I)V

    .line 265
    .line 266
    .line 267
    :cond_5
    iget-object v10, v0, Lbk2;->v:Lxk1;

    .line 268
    .line 269
    invoke-interface {v10}, Lgu2;->getValue()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    check-cast v4, Luq1;

    .line 274
    .line 275
    if-eqz v4, :cond_6

    .line 276
    .line 277
    iget-object v5, v4, Luq1;->b:Llf2;

    .line 278
    .line 279
    iget-object v5, v5, Llf2;->b:Ljava/util/List;

    .line 280
    .line 281
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 282
    .line 283
    .line 284
    move-result-object v15

    .line 285
    :goto_2
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 286
    .line 287
    .line 288
    move-result v5

    .line 289
    if-eqz v5, :cond_6

    .line 290
    .line 291
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v5

    .line 295
    check-cast v5, Lqf2;

    .line 296
    .line 297
    iget-object v7, v5, Lqf2;->a:Ljava/lang/String;

    .line 298
    .line 299
    const-string v9, "script_section_"

    .line 300
    .line 301
    invoke-static {v9, v7}, Lvi0;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v7

    .line 305
    move-object v9, v7

    .line 306
    move-object v7, v6

    .line 307
    move-object v6, v4

    .line 308
    new-instance v4, Lgk2;

    .line 309
    .line 310
    iget-object v12, v0, Lbk2;->w:Lxk1;

    .line 311
    .line 312
    iget-object v13, v0, Lbk2;->x:Lxk1;

    .line 313
    .line 314
    move-object v11, v14

    .line 315
    move-object v14, v9

    .line 316
    move-object v9, v11

    .line 317
    move-object/from16 v11, v16

    .line 318
    .line 319
    invoke-direct/range {v4 .. v13}, Lgk2;-><init>(Lqf2;Luq1;Lxk1;Lj20;Landroid/content/Context;Lxk1;Lxk1;Lxk1;Lxk1;)V

    .line 320
    .line 321
    .line 322
    new-instance v5, Lkw;

    .line 323
    .line 324
    const v11, -0x67fb5f82

    .line 325
    .line 326
    .line 327
    invoke-direct {v5, v11, v2, v4}, Lkw;-><init>(IZLun0;)V

    .line 328
    .line 329
    .line 330
    invoke-static {v1, v14, v5, v3}, Ls81;->a(Ls81;Ljava/lang/String;Lkw;I)V

    .line 331
    .line 332
    .line 333
    move-object v4, v6

    .line 334
    move-object v6, v7

    .line 335
    move-object v14, v9

    .line 336
    goto :goto_2

    .line 337
    :cond_6
    invoke-interface/range {v16 .. v16}, Lgu2;->getValue()Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    check-cast v0, Ljava/lang/String;

    .line 342
    .line 343
    if-eqz v0, :cond_7

    .line 344
    .line 345
    new-instance v4, Lx1;

    .line 346
    .line 347
    const/4 v5, 0x4

    .line 348
    invoke-direct {v4, v0, v5}, Lx1;-><init>(Ljava/lang/String;I)V

    .line 349
    .line 350
    .line 351
    new-instance v0, Lkw;

    .line 352
    .line 353
    const v5, 0x1759b538

    .line 354
    .line 355
    .line 356
    invoke-direct {v0, v5, v2, v4}, Lkw;-><init>(IZLun0;)V

    .line 357
    .line 358
    .line 359
    const-string v2, "script_error"

    .line 360
    .line 361
    invoke-static {v1, v2, v0, v3}, Ls81;->a(Ls81;Ljava/lang/String;Lkw;I)V

    .line 362
    .line 363
    .line 364
    :cond_7
    sget-object v0, La83;->a:La83;

    .line 365
    .line 366
    return-object v0
.end method
