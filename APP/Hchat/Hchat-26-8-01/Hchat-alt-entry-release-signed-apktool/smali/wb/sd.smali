.class public final synthetic Lwb/sd;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Li0/a1;

.field public final synthetic q:Li0/a1;

.field public final synthetic r:Li0/a1;

.field public final synthetic s:Li0/a1;

.field public final synthetic t:Li0/a1;

.field public final synthetic u:Li0/a1;

.field public final synthetic v:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 1

    .line 1
    move/from16 v0, p16

    .line 2
    .line 3
    iput v0, p0, Lwb/sd;->g:I

    .line 4
    .line 5
    iput-object p1, p0, Lwb/sd;->h:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p2, p0, Lwb/sd;->i:Li0/a1;

    .line 8
    .line 9
    iput-object p3, p0, Lwb/sd;->j:Li0/a1;

    .line 10
    .line 11
    iput-object p4, p0, Lwb/sd;->k:Li0/a1;

    .line 12
    .line 13
    iput-object p5, p0, Lwb/sd;->l:Li0/a1;

    .line 14
    .line 15
    iput-object p6, p0, Lwb/sd;->m:Li0/a1;

    .line 16
    .line 17
    iput-object p7, p0, Lwb/sd;->n:Li0/a1;

    .line 18
    .line 19
    iput-object p8, p0, Lwb/sd;->o:Li0/a1;

    .line 20
    .line 21
    iput-object p9, p0, Lwb/sd;->p:Li0/a1;

    .line 22
    .line 23
    iput-object p10, p0, Lwb/sd;->q:Li0/a1;

    .line 24
    .line 25
    iput-object p11, p0, Lwb/sd;->r:Li0/a1;

    .line 26
    .line 27
    iput-object p12, p0, Lwb/sd;->s:Li0/a1;

    .line 28
    .line 29
    iput-object p13, p0, Lwb/sd;->t:Li0/a1;

    .line 30
    .line 31
    iput-object p14, p0, Lwb/sd;->u:Li0/a1;

    .line 32
    .line 33
    move-object/from16 p1, p15

    .line 34
    .line 35
    iput-object p1, p0, Lwb/sd;->v:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Landroid/content/Context;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 41
    const/4 v0, 0x2

    iput v0, p0, Lwb/sd;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/sd;->v:Ljava/lang/Object;

    iput-object p2, p0, Lwb/sd;->h:Landroid/content/Context;

    iput-object p3, p0, Lwb/sd;->i:Li0/a1;

    iput-object p4, p0, Lwb/sd;->j:Li0/a1;

    iput-object p5, p0, Lwb/sd;->k:Li0/a1;

    iput-object p6, p0, Lwb/sd;->l:Li0/a1;

    iput-object p7, p0, Lwb/sd;->m:Li0/a1;

    iput-object p8, p0, Lwb/sd;->n:Li0/a1;

    iput-object p9, p0, Lwb/sd;->o:Li0/a1;

    iput-object p10, p0, Lwb/sd;->p:Li0/a1;

    iput-object p11, p0, Lwb/sd;->q:Li0/a1;

    iput-object p12, p0, Lwb/sd;->r:Li0/a1;

    iput-object p13, p0, Lwb/sd;->s:Li0/a1;

    iput-object p14, p0, Lwb/sd;->t:Li0/a1;

    move-object/from16 p1, p15

    iput-object p1, p0, Lwb/sd;->u:Li0/a1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lwb/sd;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/sd;->v:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/content/SharedPreferences;

    .line 9
    .line 10
    iget-object v1, p0, Lwb/sd;->i:Li0/a1;

    .line 11
    .line 12
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Ljava/lang/String;

    .line 17
    .line 18
    const/16 v3, 0x2c

    .line 19
    .line 20
    invoke-static {v2, v3}, Log/m;->M0(Ljava/lang/String;C)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v2}, La7/a;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-nez v3, :cond_0

    .line 33
    .line 34
    const-string v2, "#576B95"

    .line 35
    .line 36
    :cond_0
    invoke-interface {v1, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v1, p0, Lwb/sd;->j:Li0/a1;

    .line 44
    .line 45
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    const-string v3, "group_rename_notice_enable"

    .line 56
    .line 57
    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-object v1, p0, Lwb/sd;->k:Li0/a1;

    .line 62
    .line 63
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Ljava/lang/String;

    .line 68
    .line 69
    const-string v3, "group_rename_notice_text"

    .line 70
    .line 71
    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget-object v1, p0, Lwb/sd;->l:Li0/a1;

    .line 76
    .line 77
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, Ljava/lang/String;

    .line 82
    .line 83
    const-string v3, "group_rename_notice_scope"

    .line 84
    .line 85
    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iget-object v1, p0, Lwb/sd;->m:Li0/a1;

    .line 90
    .line 91
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    check-cast v1, Ljava/lang/String;

    .line 96
    .line 97
    const-string v3, "group_rename_notice_groups"

    .line 98
    .line 99
    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    iget-object v1, p0, Lwb/sd;->n:Li0/a1;

    .line 104
    .line 105
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    check-cast v1, Ljava/lang/Boolean;

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    const-string v3, "group_rename_send_enable"

    .line 116
    .line 117
    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    iget-object v1, p0, Lwb/sd;->o:Li0/a1;

    .line 122
    .line 123
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    check-cast v1, Ljava/lang/String;

    .line 128
    .line 129
    const-string v3, "group_rename_listen_groups"

    .line 130
    .line 131
    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    iget-object v1, p0, Lwb/sd;->p:Li0/a1;

    .line 136
    .line 137
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    check-cast v1, Ljava/lang/String;

    .line 142
    .line 143
    invoke-static {v1}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    const/4 v3, 0x0

    .line 148
    if-eqz v1, :cond_1

    .line 149
    .line 150
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    const/16 v4, 0x258

    .line 155
    .line 156
    invoke-static {v1, v3, v4}, Lr9/e0;->r(III)I

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    goto :goto_0

    .line 161
    :cond_1
    move v1, v3

    .line 162
    :goto_0
    const-string v4, "group_rename_delay_seconds"

    .line 163
    .line 164
    invoke-interface {v0, v4, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    iget-object v1, p0, Lwb/sd;->q:Li0/a1;

    .line 169
    .line 170
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    check-cast v1, Ljava/lang/String;

    .line 175
    .line 176
    const-string v4, "group_rename_prompt_type"

    .line 177
    .line 178
    invoke-interface {v0, v4, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    iget-object v1, p0, Lwb/sd;->r:Li0/a1;

    .line 183
    .line 184
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    check-cast v1, Ljava/lang/String;

    .line 189
    .line 190
    const-string v4, "group_rename_both_order"

    .line 191
    .line 192
    invoke-interface {v0, v4, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    iget-object v1, p0, Lwb/sd;->s:Li0/a1;

    .line 197
    .line 198
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    check-cast v1, Ljava/lang/String;

    .line 203
    .line 204
    const-string v4, "group_rename_text"

    .line 205
    .line 206
    invoke-interface {v0, v4, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    iget-object v1, p0, Lwb/sd;->t:Li0/a1;

    .line 211
    .line 212
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    check-cast v1, Ljava/lang/String;

    .line 217
    .line 218
    const-string v4, "group_rename_card_title"

    .line 219
    .line 220
    invoke-interface {v0, v4, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    iget-object v1, p0, Lwb/sd;->u:Li0/a1;

    .line 225
    .line 226
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    check-cast v1, Ljava/lang/String;

    .line 231
    .line 232
    const-string v4, "group_rename_card_desc"

    .line 233
    .line 234
    invoke-interface {v0, v4, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    const-string v1, "group_rename_wxid_color"

    .line 239
    .line 240
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 245
    .line 246
    .line 247
    const-string v0, "\u6539\u540d\u76d1\u63a7\u8bbe\u7f6e\u5df2\u4fdd\u5b58"

    .line 248
    .line 249
    iget-object v1, p0, Lwb/sd;->h:Landroid/content/Context;

    .line 250
    .line 251
    invoke-static {v1, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 256
    .line 257
    .line 258
    :goto_1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 259
    .line 260
    return-object v0

    .line 261
    :pswitch_0
    iget-object v0, p0, Lwb/sd;->v:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v0, Li0/a1;

    .line 264
    .line 265
    iget-object v7, p0, Lwb/sd;->i:Li0/a1;

    .line 266
    .line 267
    invoke-interface {v7}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    check-cast v1, Ljava/lang/String;

    .line 272
    .line 273
    invoke-static {v1}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    iget-object v11, p0, Lwb/sd;->h:Landroid/content/Context;

    .line 278
    .line 279
    const/4 v12, 0x0

    .line 280
    if-eqz v1, :cond_9

    .line 281
    .line 282
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    const/16 v2, 0x7d0

    .line 287
    .line 288
    if-gt v2, v1, :cond_9

    .line 289
    .line 290
    const v2, 0xf4241

    .line 291
    .line 292
    .line 293
    if-ge v1, v2, :cond_9

    .line 294
    .line 295
    iget-object v1, p0, Lwb/sd;->j:Li0/a1;

    .line 296
    .line 297
    iget-object v2, p0, Lwb/sd;->k:Li0/a1;

    .line 298
    .line 299
    iget-object v3, p0, Lwb/sd;->l:Li0/a1;

    .line 300
    .line 301
    iget-object v4, p0, Lwb/sd;->m:Li0/a1;

    .line 302
    .line 303
    iget-object v5, p0, Lwb/sd;->n:Li0/a1;

    .line 304
    .line 305
    iget-object v6, p0, Lwb/sd;->o:Li0/a1;

    .line 306
    .line 307
    iget-object v8, p0, Lwb/sd;->p:Li0/a1;

    .line 308
    .line 309
    iget-object v9, p0, Lwb/sd;->q:Li0/a1;

    .line 310
    .line 311
    iget-object v10, p0, Lwb/sd;->r:Li0/a1;

    .line 312
    .line 313
    invoke-static/range {v1 .. v10}, Lwb/y2;->B0(Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)Lfb/v;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    iget-object v3, v2, Lfb/v;->a:Ljava/lang/String;

    .line 318
    .line 319
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 320
    .line 321
    .line 322
    move-result v4

    .line 323
    if-nez v4, :cond_8

    .line 324
    .line 325
    iget-object v4, v2, Lfb/v;->d:Ljava/lang/String;

    .line 326
    .line 327
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 328
    .line 329
    .line 330
    move-result v4

    .line 331
    if-eqz v4, :cond_2

    .line 332
    .line 333
    goto/16 :goto_4

    .line 334
    .line 335
    :cond_2
    invoke-static {v2}, Lwb/y2;->H0(Lfb/v;)Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v4

    .line 339
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 340
    .line 341
    .line 342
    move-result v5

    .line 343
    if-nez v5, :cond_3

    .line 344
    .line 345
    goto :goto_2

    .line 346
    :cond_3
    const/4 v4, 0x0

    .line 347
    :goto_2
    if-eqz v4, :cond_4

    .line 348
    .line 349
    invoke-static {v11, v4, v12}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 354
    .line 355
    .line 356
    goto/16 :goto_5

    .line 357
    .line 358
    :cond_4
    iget-object v4, v2, Lfb/v;->e:Ljava/util/List;

    .line 359
    .line 360
    if-eqz v4, :cond_5

    .line 361
    .line 362
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 363
    .line 364
    .line 365
    move-result v5

    .line 366
    if-eqz v5, :cond_5

    .line 367
    .line 368
    goto :goto_3

    .line 369
    :cond_5
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 370
    .line 371
    .line 372
    move-result-object v4

    .line 373
    :cond_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 374
    .line 375
    .line 376
    move-result v5

    .line 377
    if-eqz v5, :cond_7

    .line 378
    .line 379
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v5

    .line 383
    check-cast v5, Lfb/r0;

    .line 384
    .line 385
    iget-boolean v6, v5, Lfb/r0;->c:Z

    .line 386
    .line 387
    if-eqz v6, :cond_6

    .line 388
    .line 389
    iget-object v5, v5, Lfb/r0;->d:Ljava/lang/String;

    .line 390
    .line 391
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 392
    .line 393
    .line 394
    move-result v5

    .line 395
    if-eqz v5, :cond_6

    .line 396
    .line 397
    const-string v0, "\u5df2\u542f\u7528 MCP \u7684 Endpoint \u4e0d\u80fd\u4e3a\u7a7a"

    .line 398
    .line 399
    invoke-static {v11, v0, v12}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 404
    .line 405
    .line 406
    goto :goto_5

    .line 407
    :cond_7
    :goto_3
    invoke-static {v11, v2}, Lfb/w;->w(Landroid/content/Context;Lfb/v;)V

    .line 408
    .line 409
    .line 410
    invoke-interface {v1, v3}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    invoke-static {v11}, Lfb/w;->n(Landroid/content/Context;)Lfb/t0;

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    iget-object v2, v1, Lfb/t0;->a:Ljava/lang/String;

    .line 418
    .line 419
    iget-object v3, p0, Lwb/sd;->s:Li0/a1;

    .line 420
    .line 421
    invoke-interface {v3, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 422
    .line 423
    .line 424
    iget-object v1, v1, Lfb/t0;->b:Ljava/lang/String;

    .line 425
    .line 426
    iget-object v2, p0, Lwb/sd;->t:Li0/a1;

    .line 427
    .line 428
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    iget-object v1, p0, Lwb/sd;->u:Li0/a1;

    .line 432
    .line 433
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    check-cast v2, Ljava/lang/Number;

    .line 438
    .line 439
    const/4 v3, 0x1

    .line 440
    invoke-static {v2, v3, v1}, Lp/a;->u(Ljava/lang/Number;ILi0/a1;)V

    .line 441
    .line 442
    .line 443
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 444
    .line 445
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 446
    .line 447
    .line 448
    const-string v0, "Agent \u914d\u7f6e\u5df2\u4fdd\u5b58"

    .line 449
    .line 450
    invoke-static {v11, v0, v12}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 455
    .line 456
    .line 457
    goto :goto_5

    .line 458
    :cond_8
    :goto_4
    const-string v0, "API \u5730\u5740\u548c\u6a21\u578b\u4e0d\u80fd\u4e3a\u7a7a"

    .line 459
    .line 460
    invoke-static {v11, v0, v12}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 465
    .line 466
    .line 467
    goto :goto_5

    .line 468
    :cond_9
    const-string v0, "\u81ea\u52a8\u538b\u7f29\u9608\u503c\u9700\u4e3a 2000 \u5230 1000000"

    .line 469
    .line 470
    invoke-static {v11, v0, v12}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 475
    .line 476
    .line 477
    :goto_5
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 478
    .line 479
    return-object v0

    .line 480
    :pswitch_1
    iget-object v0, p0, Lwb/sd;->v:Ljava/lang/Object;

    .line 481
    .line 482
    check-cast v0, Li0/a1;

    .line 483
    .line 484
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 485
    .line 486
    iget-object v2, p0, Lwb/sd;->i:Li0/a1;

    .line 487
    .line 488
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 489
    .line 490
    .line 491
    iget-object v2, p0, Lwb/sd;->j:Li0/a1;

    .line 492
    .line 493
    const-string v3, "#00000000"

    .line 494
    .line 495
    invoke-interface {v2, v3}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 496
    .line 497
    .line 498
    iget-object v2, p0, Lwb/sd;->k:Li0/a1;

    .line 499
    .line 500
    const-string v4, "#FFFF0000"

    .line 501
    .line 502
    invoke-interface {v2, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 503
    .line 504
    .line 505
    iget-object v2, p0, Lwb/sd;->l:Li0/a1;

    .line 506
    .line 507
    invoke-interface {v2, v3}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 508
    .line 509
    .line 510
    iget-object v2, p0, Lwb/sd;->m:Li0/a1;

    .line 511
    .line 512
    invoke-interface {v2, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 513
    .line 514
    .line 515
    const-string v2, "${time}"

    .line 516
    .line 517
    iget-object v3, p0, Lwb/sd;->n:Li0/a1;

    .line 518
    .line 519
    invoke-interface {v3, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 520
    .line 521
    .line 522
    const-string v2, "HH:mm:ss"

    .line 523
    .line 524
    iget-object v3, p0, Lwb/sd;->o:Li0/a1;

    .line 525
    .line 526
    invoke-interface {v3, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 527
    .line 528
    .line 529
    const-string v2, "message_bottom"

    .line 530
    .line 531
    iget-object v3, p0, Lwb/sd;->p:Li0/a1;

    .line 532
    .line 533
    invoke-interface {v3, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 534
    .line 535
    .line 536
    const-string v2, "2"

    .line 537
    .line 538
    iget-object v3, p0, Lwb/sd;->q:Li0/a1;

    .line 539
    .line 540
    invoke-interface {v3, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 541
    .line 542
    .line 543
    iget-object v2, p0, Lwb/sd;->r:Li0/a1;

    .line 544
    .line 545
    const-string v3, "64"

    .line 546
    .line 547
    invoke-interface {v2, v3}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 548
    .line 549
    .line 550
    iget-object v2, p0, Lwb/sd;->s:Li0/a1;

    .line 551
    .line 552
    invoke-interface {v2, v3}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 553
    .line 554
    .line 555
    const-string v2, "10"

    .line 556
    .line 557
    iget-object v3, p0, Lwb/sd;->t:Li0/a1;

    .line 558
    .line 559
    invoke-interface {v3, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 560
    .line 561
    .line 562
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 563
    .line 564
    iget-object v3, p0, Lwb/sd;->u:Li0/a1;

    .line 565
    .line 566
    invoke-interface {v3, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 567
    .line 568
    .line 569
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 570
    .line 571
    .line 572
    const-string v0, "\u5df2\u6062\u590d\u9ed8\u8ba4\uff0c\u4fdd\u5b58\u540e\u751f\u6548"

    .line 573
    .line 574
    iget-object v1, p0, Lwb/sd;->h:Landroid/content/Context;

    .line 575
    .line 576
    const/4 v2, 0x0

    .line 577
    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 582
    .line 583
    .line 584
    goto/16 :goto_1

    .line 585
    .line 586
    nop

    .line 587
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
