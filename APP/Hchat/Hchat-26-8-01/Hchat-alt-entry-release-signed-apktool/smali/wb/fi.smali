.class public final synthetic Lwb/fi;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;

.field public final synthetic i:Landroid/content/Context;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;


# direct methods
.method public synthetic constructor <init>(ILandroid/content/Context;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;)V
    .locals 0

    .line 16
    iput p1, p0, Lwb/fi;->g:I

    iput-object p3, p0, Lwb/fi;->h:Landroid/content/SharedPreferences;

    iput-object p2, p0, Lwb/fi;->i:Landroid/content/Context;

    iput-object p4, p0, Lwb/fi;->j:Li0/a1;

    iput-object p5, p0, Lwb/fi;->k:Li0/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Li0/a1;Li0/a1;Landroid/content/SharedPreferences;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lwb/fi;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/fi;->i:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/fi;->j:Li0/a1;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/fi;->k:Li0/a1;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/fi;->h:Landroid/content/SharedPreferences;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Landroid/content/Context;)V
    .locals 1

    .line 17
    const/4 v0, 0x0

    iput v0, p0, Lwb/fi;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/fi;->h:Landroid/content/SharedPreferences;

    iput-object p2, p0, Lwb/fi;->j:Li0/a1;

    iput-object p3, p0, Lwb/fi;->k:Li0/a1;

    iput-object p4, p0, Lwb/fi;->i:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lwb/fi;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/List;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lwb/fi;->j:Li0/a1;

    .line 12
    .line 13
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ljava/util/List;

    .line 18
    .line 19
    invoke-static {v1, p1}, Lwb/ho;->q7(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lwb/fi;->h:Landroid/content/SharedPreferences;

    .line 27
    .line 28
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v2, "group_member_reply_template_bindings"

    .line 33
    .line 34
    invoke-static {v1}, Lr9/e0;->A(Ljava/util/List;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 43
    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    const-string v0, " \u4e2a\u7fa4"

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    const-string v2, "\u6a21\u677f\u5df2\u5957\u7528\u5230 "

    .line 53
    .line 54
    iget-object v3, p0, Lwb/fi;->i:Landroid/content/Context;

    .line 55
    .line 56
    invoke-static {v2, p1, v0, v3, v1}, Lwb/en;->o(Ljava/lang/String;ILjava/lang/String;Landroid/content/Context;I)V

    .line 57
    .line 58
    .line 59
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 60
    .line 61
    iget-object v0, p0, Lwb/fi;->k:Li0/a1;

    .line 62
    .line 63
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Lwb/fi;->j:Li0/a1;

    .line 75
    .line 76
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, Ljava/util/List;

    .line 81
    .line 82
    invoke-static {v1, p1}, Lwb/ho;->s7(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, Lwb/fi;->h:Landroid/content/SharedPreferences;

    .line 90
    .line 91
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    const-string v2, "message_block_bindings"

    .line 96
    .line 97
    invoke-static {v1}, La2/a;->e(Ljava/util/List;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 106
    .line 107
    .line 108
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    const-string v0, " \u4e2a\u540d\u5355\u9879"

    .line 113
    .line 114
    const/4 v1, 0x0

    .line 115
    const-string v2, "\u5df2\u4fdd\u5b58 "

    .line 116
    .line 117
    iget-object v3, p0, Lwb/fi;->i:Landroid/content/Context;

    .line 118
    .line 119
    invoke-static {v2, p1, v0, v3, v1}, Lwb/en;->o(Ljava/lang/String;ILjava/lang/String;Landroid/content/Context;I)V

    .line 120
    .line 121
    .line 122
    const/4 p1, 0x0

    .line 123
    iget-object v0, p0, Lwb/fi;->k:Li0/a1;

    .line 124
    .line 125
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 130
    .line 131
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    new-instance v0, Ljava/util/HashSet;

    .line 135
    .line 136
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 137
    .line 138
    .line 139
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    if-eqz v2, :cond_0

    .line 148
    .line 149
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    check-cast v2, Lwb/s0;

    .line 154
    .line 155
    iget-object v2, v2, Lwb/s0;->a:Ljava/lang/String;

    .line 156
    .line 157
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_0
    iget-object v1, p0, Lwb/fi;->j:Li0/a1;

    .line 162
    .line 163
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    check-cast v2, Ljava/lang/String;

    .line 168
    .line 169
    invoke-static {v2}, Lwb/ho;->y6(Ljava/lang/String;)Ljava/util/Set;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    invoke-static {v2, v0}, Ltf/d0;->T(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    check-cast v2, Ljava/lang/Iterable;

    .line 178
    .line 179
    invoke-static {v2}, Lwb/ho;->D5(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    iget-object v3, p0, Lwb/fi;->k:Li0/a1;

    .line 184
    .line 185
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    check-cast v4, Ljava/util/List;

    .line 190
    .line 191
    new-instance v5, Ljava/util/ArrayList;

    .line 192
    .line 193
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 194
    .line 195
    .line 196
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    :cond_1
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 201
    .line 202
    .line 203
    move-result v6

    .line 204
    if-eqz v6, :cond_2

    .line 205
    .line 206
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v6

    .line 210
    move-object v7, v6

    .line 211
    check-cast v7, Lq9/h;

    .line 212
    .line 213
    iget-object v7, v7, Lq9/h;->a:Ljava/lang/String;

    .line 214
    .line 215
    invoke-virtual {v0, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v7

    .line 219
    if-nez v7, :cond_1

    .line 220
    .line 221
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    goto :goto_2

    .line 225
    :cond_2
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 230
    .line 231
    .line 232
    move-result v4

    .line 233
    if-eqz v4, :cond_3

    .line 234
    .line 235
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    check-cast v4, Ljava/lang/String;

    .line 240
    .line 241
    iget-object v6, p0, Lwb/fi;->h:Landroid/content/SharedPreferences;

    .line 242
    .line 243
    invoke-static {v6, v4, v2, v5}, Lwb/ho;->j5(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 244
    .line 245
    .line 246
    goto :goto_3

    .line 247
    :cond_3
    invoke-interface {v1, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    invoke-interface {v3, v5}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 254
    .line 255
    .line 256
    move-result p1

    .line 257
    const-string v0, " \u4e2a\u76d1\u542c\u7fa4"

    .line 258
    .line 259
    const/4 v1, 0x0

    .line 260
    const-string v2, "\u5df2\u5220\u9664 "

    .line 261
    .line 262
    iget-object v3, p0, Lwb/fi;->i:Landroid/content/Context;

    .line 263
    .line 264
    invoke-static {v2, p1, v0, v3, v1}, Lwb/en;->o(Ljava/lang/String;ILjava/lang/String;Landroid/content/Context;I)V

    .line 265
    .line 266
    .line 267
    goto/16 :goto_0

    .line 268
    .line 269
    :pswitch_2
    check-cast p1, Ljava/util/List;

    .line 270
    .line 271
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    iget-object v0, p0, Lwb/fi;->j:Li0/a1;

    .line 275
    .line 276
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    check-cast v1, Ljava/util/List;

    .line 281
    .line 282
    invoke-static {v1, p1}, Lwb/ho;->r7(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    iget-object v1, p0, Lwb/fi;->h:Landroid/content/SharedPreferences;

    .line 290
    .line 291
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    check-cast v0, Ljava/util/List;

    .line 300
    .line 301
    invoke-static {v0}, Lx6/d;->t(Ljava/util/List;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    const-string v2, "group_rename_template_bindings"

    .line 306
    .line 307
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 312
    .line 313
    .line 314
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 315
    .line 316
    .line 317
    move-result p1

    .line 318
    const-string v0, " \u4e2a\u7fa4"

    .line 319
    .line 320
    const/4 v1, 0x0

    .line 321
    const-string v2, "\u6a21\u677f\u5df2\u5957\u7528\u5230 "

    .line 322
    .line 323
    iget-object v3, p0, Lwb/fi;->i:Landroid/content/Context;

    .line 324
    .line 325
    invoke-static {v2, p1, v0, v3, v1}, Lwb/en;->o(Ljava/lang/String;ILjava/lang/String;Landroid/content/Context;I)V

    .line 326
    .line 327
    .line 328
    sget-object p1, Lwb/h4;->b:Lwb/h4;

    .line 329
    .line 330
    iget-object v0, p0, Lwb/fi;->k:Li0/a1;

    .line 331
    .line 332
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    goto/16 :goto_0

    .line 336
    .line 337
    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    .line 338
    .line 339
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 340
    .line 341
    .line 342
    move-result v0

    .line 343
    const-string v1, "zombie_check_enable"

    .line 344
    .line 345
    iget-object v2, p0, Lwb/fi;->j:Li0/a1;

    .line 346
    .line 347
    iget-object v3, p0, Lwb/fi;->h:Landroid/content/SharedPreferences;

    .line 348
    .line 349
    invoke-static {v2, p1, v3, v1, v0}, Lwb/en;->m(Li0/a1;Ljava/lang/Boolean;Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    .line 350
    .line 351
    .line 352
    if-nez v0, :cond_5

    .line 353
    .line 354
    iget-object p1, p0, Lwb/fi;->k:Li0/a1;

    .line 355
    .line 356
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    check-cast v0, Lrb/m;

    .line 361
    .line 362
    iget-boolean v0, v0, Lrb/m;->b:Z

    .line 363
    .line 364
    if-nez v0, :cond_4

    .line 365
    .line 366
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    check-cast v0, Lrb/m;

    .line 371
    .line 372
    iget-boolean v0, v0, Lrb/m;->i:Z

    .line 373
    .line 374
    if-eqz v0, :cond_5

    .line 375
    .line 376
    :cond_4
    invoke-static {}, Lfb/v0;->I()Lrb/a;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    iget-object v1, p0, Lwb/fi;->i:Landroid/content/Context;

    .line 381
    .line 382
    invoke-static {v1, p1, v0}, Lwb/ho;->t4(Landroid/content/Context;Li0/a1;Lrb/a;)V

    .line 383
    .line 384
    .line 385
    :cond_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 386
    .line 387
    return-object p1

    .line 388
    nop

    .line 389
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
