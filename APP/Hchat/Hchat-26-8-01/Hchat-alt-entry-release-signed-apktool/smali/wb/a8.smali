.class public final synthetic Lwb/a8;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/a8;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/a8;->h:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/a8;->i:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lwb/a8;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/a8;->i:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const-string v1, "group_rename_prompt_type_"

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Lwb/a8;->h:Landroid/content/SharedPreferences;

    .line 18
    .line 19
    const-string v2, "global"

    .line 20
    .line 21
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    move-object v2, v0

    .line 28
    :cond_0
    invoke-static {v2}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0

    .line 33
    :pswitch_0
    const-string v0, "group_member_reply_both_order"

    .line 34
    .line 35
    iget-object v1, p0, Lwb/a8;->i:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v0, v1}, Lwb/ho;->N5(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v2, p0, Lwb/a8;->h:Landroid/content/SharedPreferences;

    .line 42
    .line 43
    const-string v3, "text_first"

    .line 44
    .line 45
    invoke-interface {v2, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    if-eqz v4, :cond_1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    move-object v4, v3

    .line 53
    :goto_0
    invoke-interface {v2, v1, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    invoke-interface {v2, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    move-object v3, v0

    .line 67
    :cond_3
    move-object v1, v3

    .line 68
    :goto_1
    invoke-static {v1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    return-object v0

    .line 73
    :pswitch_1
    const-string v0, "group_member_reply_favorite_delay_ms"

    .line 74
    .line 75
    const/16 v1, 0x64

    .line 76
    .line 77
    iget-object v2, p0, Lwb/a8;->h:Landroid/content/SharedPreferences;

    .line 78
    .line 79
    iget-object v3, p0, Lwb/a8;->i:Ljava/lang/String;

    .line 80
    .line 81
    invoke-static {v2, v0, v3, v1}, Lwb/ho;->O5(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    return-object v0

    .line 90
    :pswitch_2
    const-string v0, "group_member_reply_file_delay_ms"

    .line 91
    .line 92
    const/16 v1, 0x64

    .line 93
    .line 94
    iget-object v2, p0, Lwb/a8;->h:Landroid/content/SharedPreferences;

    .line 95
    .line 96
    iget-object v3, p0, Lwb/a8;->i:Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {v2, v0, v3, v1}, Lwb/ho;->O5(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    return-object v0

    .line 107
    :pswitch_3
    const-string v0, "group_member_reply_video_delay_ms"

    .line 108
    .line 109
    const/16 v1, 0x64

    .line 110
    .line 111
    iget-object v2, p0, Lwb/a8;->h:Landroid/content/SharedPreferences;

    .line 112
    .line 113
    iget-object v3, p0, Lwb/a8;->i:Ljava/lang/String;

    .line 114
    .line 115
    invoke-static {v2, v0, v3, v1}, Lwb/ho;->O5(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    return-object v0

    .line 124
    :pswitch_4
    iget-object v0, p0, Lwb/a8;->i:Ljava/lang/String;

    .line 125
    .line 126
    const-string v1, "group_member_reply_prompt_type"

    .line 127
    .line 128
    invoke-static {v1, v0}, Lwb/ho;->N5(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    iget-object v1, p0, Lwb/a8;->h:Landroid/content/SharedPreferences;

    .line 133
    .line 134
    const-string v2, "global"

    .line 135
    .line 136
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    if-eqz v0, :cond_4

    .line 141
    .line 142
    move-object v2, v0

    .line 143
    :cond_4
    invoke-static {v2}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    return-object v0

    .line 148
    :pswitch_5
    const-string v0, "group_member_reply_emoji_delay_ms"

    .line 149
    .line 150
    const/16 v1, 0x64

    .line 151
    .line 152
    iget-object v2, p0, Lwb/a8;->h:Landroid/content/SharedPreferences;

    .line 153
    .line 154
    iget-object v3, p0, Lwb/a8;->i:Ljava/lang/String;

    .line 155
    .line 156
    invoke-static {v2, v0, v3, v1}, Lwb/ho;->O5(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    return-object v0

    .line 165
    :pswitch_6
    const-string v0, "group_member_reply_voice_delay_ms"

    .line 166
    .line 167
    const/16 v1, 0x64

    .line 168
    .line 169
    iget-object v2, p0, Lwb/a8;->h:Landroid/content/SharedPreferences;

    .line 170
    .line 171
    iget-object v3, p0, Lwb/a8;->i:Ljava/lang/String;

    .line 172
    .line 173
    invoke-static {v2, v0, v3, v1}, Lwb/ho;->O5(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    return-object v0

    .line 182
    :pswitch_7
    const-string v0, "group_member_reply_image_delay_ms"

    .line 183
    .line 184
    const/16 v1, 0x64

    .line 185
    .line 186
    iget-object v2, p0, Lwb/a8;->h:Landroid/content/SharedPreferences;

    .line 187
    .line 188
    iget-object v3, p0, Lwb/a8;->i:Ljava/lang/String;

    .line 189
    .line 190
    invoke-static {v2, v0, v3, v1}, Lwb/ho;->O5(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    return-object v0

    .line 199
    :pswitch_8
    const-string v0, "group_member_reply_prompt_delay_ms"

    .line 200
    .line 201
    const/4 v1, 0x0

    .line 202
    iget-object v2, p0, Lwb/a8;->h:Landroid/content/SharedPreferences;

    .line 203
    .line 204
    iget-object v3, p0, Lwb/a8;->i:Ljava/lang/String;

    .line 205
    .line 206
    invoke-static {v2, v0, v3, v1}, Lwb/ho;->O5(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    return-object v0

    .line 215
    :pswitch_9
    iget-object v0, p0, Lwb/a8;->i:Ljava/lang/String;

    .line 216
    .line 217
    invoke-static {v0}, Lwb/ho;->L5(Ljava/lang/String;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    iget-object v1, p0, Lwb/a8;->h:Landroid/content/SharedPreferences;

    .line 222
    .line 223
    const-string v2, "global"

    .line 224
    .line 225
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    if-eqz v0, :cond_5

    .line 230
    .line 231
    move-object v2, v0

    .line 232
    :cond_5
    invoke-static {v2}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    return-object v0

    .line 237
    :pswitch_a
    iget-object v0, p0, Lwb/a8;->i:Ljava/lang/String;

    .line 238
    .line 239
    const-string v1, "group_member_reply_left_favorite_paths"

    .line 240
    .line 241
    invoke-static {v1, v0}, Lwb/ho;->N5(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    iget-object v1, p0, Lwb/a8;->h:Landroid/content/SharedPreferences;

    .line 246
    .line 247
    const-string v2, ""

    .line 248
    .line 249
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    if-nez v0, :cond_6

    .line 254
    .line 255
    goto :goto_2

    .line 256
    :cond_6
    move-object v2, v0

    .line 257
    :goto_2
    invoke-static {v2}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    return-object v0

    .line 262
    :pswitch_b
    iget-object v0, p0, Lwb/a8;->i:Ljava/lang/String;

    .line 263
    .line 264
    const-string v1, "group_member_reply_join_favorite_paths"

    .line 265
    .line 266
    invoke-static {v1, v0}, Lwb/ho;->N5(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    iget-object v1, p0, Lwb/a8;->h:Landroid/content/SharedPreferences;

    .line 271
    .line 272
    const-string v2, ""

    .line 273
    .line 274
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    if-nez v0, :cond_7

    .line 279
    .line 280
    goto :goto_3

    .line 281
    :cond_7
    move-object v2, v0

    .line 282
    :goto_3
    invoke-static {v2}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    return-object v0

    .line 287
    :pswitch_c
    iget-object v0, p0, Lwb/a8;->i:Ljava/lang/String;

    .line 288
    .line 289
    const-string v1, "group_member_reply_left_file_paths"

    .line 290
    .line 291
    invoke-static {v1, v0}, Lwb/ho;->N5(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    iget-object v1, p0, Lwb/a8;->h:Landroid/content/SharedPreferences;

    .line 296
    .line 297
    const-string v2, ""

    .line 298
    .line 299
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    if-nez v0, :cond_8

    .line 304
    .line 305
    goto :goto_4

    .line 306
    :cond_8
    move-object v2, v0

    .line 307
    :goto_4
    invoke-static {v2}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    return-object v0

    .line 312
    :pswitch_d
    iget-object v0, p0, Lwb/a8;->i:Ljava/lang/String;

    .line 313
    .line 314
    const-string v1, "group_member_reply_join_file_paths"

    .line 315
    .line 316
    invoke-static {v1, v0}, Lwb/ho;->N5(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    iget-object v1, p0, Lwb/a8;->h:Landroid/content/SharedPreferences;

    .line 321
    .line 322
    const-string v2, ""

    .line 323
    .line 324
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    if-nez v0, :cond_9

    .line 329
    .line 330
    goto :goto_5

    .line 331
    :cond_9
    move-object v2, v0

    .line 332
    :goto_5
    invoke-static {v2}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    return-object v0

    .line 337
    :pswitch_e
    iget-object v0, p0, Lwb/a8;->i:Ljava/lang/String;

    .line 338
    .line 339
    const-string v1, "group_member_reply_left_video_paths"

    .line 340
    .line 341
    invoke-static {v1, v0}, Lwb/ho;->N5(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    iget-object v1, p0, Lwb/a8;->h:Landroid/content/SharedPreferences;

    .line 346
    .line 347
    const-string v2, ""

    .line 348
    .line 349
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    if-nez v0, :cond_a

    .line 354
    .line 355
    goto :goto_6

    .line 356
    :cond_a
    move-object v2, v0

    .line 357
    :goto_6
    invoke-static {v2}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    return-object v0

    .line 362
    :pswitch_f
    iget-object v0, p0, Lwb/a8;->h:Landroid/content/SharedPreferences;

    .line 363
    .line 364
    const-string v1, "group_member_reply_left_disabled_groups"

    .line 365
    .line 366
    const-string v2, ""

    .line 367
    .line 368
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    if-nez v0, :cond_b

    .line 373
    .line 374
    goto :goto_7

    .line 375
    :cond_b
    move-object v2, v0

    .line 376
    :goto_7
    invoke-static {v2}, Lwb/ho;->y6(Ljava/lang/String;)Ljava/util/Set;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    iget-object v1, p0, Lwb/a8;->i:Ljava/lang/String;

    .line 381
    .line 382
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result v0

    .line 386
    xor-int/lit8 v0, v0, 0x1

    .line 387
    .line 388
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    return-object v0

    .line 397
    :pswitch_10
    iget-object v0, p0, Lwb/a8;->i:Ljava/lang/String;

    .line 398
    .line 399
    const-string v1, "group_member_reply_join_video_paths"

    .line 400
    .line 401
    invoke-static {v1, v0}, Lwb/ho;->N5(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    iget-object v1, p0, Lwb/a8;->h:Landroid/content/SharedPreferences;

    .line 406
    .line 407
    const-string v2, ""

    .line 408
    .line 409
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    if-nez v0, :cond_c

    .line 414
    .line 415
    goto :goto_8

    .line 416
    :cond_c
    move-object v2, v0

    .line 417
    :goto_8
    invoke-static {v2}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    return-object v0

    .line 422
    :pswitch_11
    iget-object v0, p0, Lwb/a8;->i:Ljava/lang/String;

    .line 423
    .line 424
    const-string v1, "group_member_reply_left_emoji_paths"

    .line 425
    .line 426
    invoke-static {v1, v0}, Lwb/ho;->N5(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    iget-object v1, p0, Lwb/a8;->h:Landroid/content/SharedPreferences;

    .line 431
    .line 432
    const-string v2, ""

    .line 433
    .line 434
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    if-nez v0, :cond_d

    .line 439
    .line 440
    goto :goto_9

    .line 441
    :cond_d
    move-object v2, v0

    .line 442
    :goto_9
    invoke-static {v2}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    return-object v0

    .line 447
    :pswitch_12
    iget-object v0, p0, Lwb/a8;->i:Ljava/lang/String;

    .line 448
    .line 449
    const-string v1, "group_member_reply_join_emoji_paths"

    .line 450
    .line 451
    invoke-static {v1, v0}, Lwb/ho;->N5(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    iget-object v1, p0, Lwb/a8;->h:Landroid/content/SharedPreferences;

    .line 456
    .line 457
    const-string v2, ""

    .line 458
    .line 459
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    if-nez v0, :cond_e

    .line 464
    .line 465
    goto :goto_a

    .line 466
    :cond_e
    move-object v2, v0

    .line 467
    :goto_a
    invoke-static {v2}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    return-object v0

    .line 472
    :pswitch_13
    iget-object v0, p0, Lwb/a8;->i:Ljava/lang/String;

    .line 473
    .line 474
    const-string v1, "group_member_reply_left_voice_paths"

    .line 475
    .line 476
    invoke-static {v1, v0}, Lwb/ho;->N5(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    iget-object v1, p0, Lwb/a8;->h:Landroid/content/SharedPreferences;

    .line 481
    .line 482
    const-string v2, ""

    .line 483
    .line 484
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    if-nez v0, :cond_f

    .line 489
    .line 490
    goto :goto_b

    .line 491
    :cond_f
    move-object v2, v0

    .line 492
    :goto_b
    invoke-static {v2}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    return-object v0

    .line 497
    :pswitch_14
    iget-object v0, p0, Lwb/a8;->i:Ljava/lang/String;

    .line 498
    .line 499
    const-string v1, "group_member_reply_join_voice_paths"

    .line 500
    .line 501
    invoke-static {v1, v0}, Lwb/ho;->N5(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    iget-object v1, p0, Lwb/a8;->h:Landroid/content/SharedPreferences;

    .line 506
    .line 507
    const-string v2, ""

    .line 508
    .line 509
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    if-nez v0, :cond_10

    .line 514
    .line 515
    goto :goto_c

    .line 516
    :cond_10
    move-object v2, v0

    .line 517
    :goto_c
    invoke-static {v2}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    return-object v0

    .line 522
    :pswitch_15
    iget-object v0, p0, Lwb/a8;->i:Ljava/lang/String;

    .line 523
    .line 524
    const-string v1, "group_member_reply_left_image_paths"

    .line 525
    .line 526
    invoke-static {v1, v0}, Lwb/ho;->N5(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    iget-object v1, p0, Lwb/a8;->h:Landroid/content/SharedPreferences;

    .line 531
    .line 532
    const-string v2, ""

    .line 533
    .line 534
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    if-nez v0, :cond_11

    .line 539
    .line 540
    goto :goto_d

    .line 541
    :cond_11
    move-object v2, v0

    .line 542
    :goto_d
    invoke-static {v2}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    return-object v0

    .line 547
    :pswitch_16
    iget-object v0, p0, Lwb/a8;->i:Ljava/lang/String;

    .line 548
    .line 549
    const-string v1, "group_member_reply_join_image_paths"

    .line 550
    .line 551
    invoke-static {v1, v0}, Lwb/ho;->N5(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    iget-object v1, p0, Lwb/a8;->h:Landroid/content/SharedPreferences;

    .line 556
    .line 557
    const-string v2, ""

    .line 558
    .line 559
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    if-nez v0, :cond_12

    .line 564
    .line 565
    goto :goto_e

    .line 566
    :cond_12
    move-object v2, v0

    .line 567
    :goto_e
    invoke-static {v2}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    return-object v0

    .line 572
    :pswitch_17
    iget-object v0, p0, Lwb/a8;->h:Landroid/content/SharedPreferences;

    .line 573
    .line 574
    const-string v1, "group_member_reply_media_sequence"

    .line 575
    .line 576
    const-string v2, "image,voice,emoji,video,file,favorite"

    .line 577
    .line 578
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v3

    .line 582
    if-eqz v3, :cond_13

    .line 583
    .line 584
    move-object v2, v3

    .line 585
    :cond_13
    iget-object v3, p0, Lwb/a8;->i:Ljava/lang/String;

    .line 586
    .line 587
    invoke-static {v0, v1, v3, v2}, Lwb/ho;->Q5(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    return-object v0

    .line 596
    :pswitch_18
    iget-object v0, p0, Lwb/a8;->h:Landroid/content/SharedPreferences;

    .line 597
    .line 598
    const-string v1, "group_member_reply_media_order"

    .line 599
    .line 600
    const-string v2, "none"

    .line 601
    .line 602
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v3

    .line 606
    if-eqz v3, :cond_14

    .line 607
    .line 608
    move-object v2, v3

    .line 609
    :cond_14
    iget-object v3, p0, Lwb/a8;->i:Ljava/lang/String;

    .line 610
    .line 611
    invoke-static {v0, v1, v3, v2}, Lwb/ho;->Q5(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    return-object v0

    .line 620
    :pswitch_19
    iget-object v0, p0, Lwb/a8;->i:Ljava/lang/String;

    .line 621
    .line 622
    invoke-static {v0}, Lwb/ho;->P5(Ljava/lang/String;)Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    iget-object v1, p0, Lwb/a8;->h:Landroid/content/SharedPreferences;

    .line 627
    .line 628
    const-string v2, "global"

    .line 629
    .line 630
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    if-eqz v0, :cond_15

    .line 635
    .line 636
    move-object v2, v0

    .line 637
    :cond_15
    invoke-static {v2}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    return-object v0

    .line 642
    :pswitch_1a
    iget-object v0, p0, Lwb/a8;->h:Landroid/content/SharedPreferences;

    .line 643
    .line 644
    const-string v1, "group_member_reply_join_disabled_groups"

    .line 645
    .line 646
    const-string v2, ""

    .line 647
    .line 648
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    if-nez v0, :cond_16

    .line 653
    .line 654
    goto :goto_f

    .line 655
    :cond_16
    move-object v2, v0

    .line 656
    :goto_f
    invoke-static {v2}, Lwb/ho;->y6(Ljava/lang/String;)Ljava/util/Set;

    .line 657
    .line 658
    .line 659
    move-result-object v0

    .line 660
    iget-object v1, p0, Lwb/a8;->i:Ljava/lang/String;

    .line 661
    .line 662
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 663
    .line 664
    .line 665
    move-result v0

    .line 666
    xor-int/lit8 v0, v0, 0x1

    .line 667
    .line 668
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    return-object v0

    .line 677
    :pswitch_data_0
    .packed-switch 0x0
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
