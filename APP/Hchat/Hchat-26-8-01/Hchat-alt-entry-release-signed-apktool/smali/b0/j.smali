.class public final synthetic Lb0/j;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Li0/a1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb0/j;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lb0/j;->h:Li0/a1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lb0/j;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb0/j;->h:Li0/a1;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    iget-object v0, p0, Lb0/j;->h:Li0/a1;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_1
    iget-object v0, p0, Lb0/j;->h:Li0/a1;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 31
    .line 32
    return-object v0

    .line 33
    :pswitch_2
    iget-object v0, p0, Lb0/j;->h:Li0/a1;

    .line 34
    .line 35
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 41
    .line 42
    return-object v0

    .line 43
    :pswitch_3
    iget-object v0, p0, Lb0/j;->h:Li0/a1;

    .line 44
    .line 45
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_4
    iget-object v0, p0, Lb0/j;->h:Li0/a1;

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 60
    .line 61
    return-object v0

    .line 62
    :pswitch_5
    iget-object v0, p0, Lb0/j;->h:Li0/a1;

    .line 63
    .line 64
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_6
    iget-object v0, p0, Lb0/j;->h:Li0/a1;

    .line 73
    .line 74
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    check-cast v1, Ljava/lang/Boolean;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    xor-int/lit8 v1, v1, 0x1

    .line 85
    .line 86
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 94
    .line 95
    return-object v0

    .line 96
    :pswitch_7
    iget-object v0, p0, Lb0/j;->h:Li0/a1;

    .line 97
    .line 98
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 99
    .line 100
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 104
    .line 105
    return-object v0

    .line 106
    :pswitch_8
    iget-object v0, p0, Lb0/j;->h:Li0/a1;

    .line 107
    .line 108
    sget-object v1, Lwb/y0;->a:Lwb/y0;

    .line 109
    .line 110
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 114
    .line 115
    return-object v0

    .line 116
    :pswitch_9
    new-instance v0, Lwb/x0;

    .line 117
    .line 118
    const/4 v1, 0x0

    .line 119
    invoke-static {v1}, Lc9/o2;->k(Ljava/lang/String;)Lc9/a;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    const/4 v2, 0x0

    .line 124
    invoke-direct {v0, v1, v2}, Lwb/x0;-><init>(Lc9/a;Z)V

    .line 125
    .line 126
    .line 127
    iget-object v1, p0, Lb0/j;->h:Li0/a1;

    .line 128
    .line 129
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 133
    .line 134
    return-object v0

    .line 135
    :pswitch_a
    iget-object v0, p0, Lb0/j;->h:Li0/a1;

    .line 136
    .line 137
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 138
    .line 139
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 143
    .line 144
    return-object v0

    .line 145
    :pswitch_b
    iget-object v0, p0, Lb0/j;->h:Li0/a1;

    .line 146
    .line 147
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 148
    .line 149
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 153
    .line 154
    return-object v0

    .line 155
    :pswitch_c
    iget-object v0, p0, Lb0/j;->h:Li0/a1;

    .line 156
    .line 157
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 158
    .line 159
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 163
    .line 164
    return-object v0

    .line 165
    :pswitch_d
    iget-object v0, p0, Lb0/j;->h:Li0/a1;

    .line 166
    .line 167
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    check-cast v0, Ljava/lang/Boolean;

    .line 172
    .line 173
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 174
    .line 175
    .line 176
    return-object v0

    .line 177
    :pswitch_e
    iget-object v0, p0, Lb0/j;->h:Li0/a1;

    .line 178
    .line 179
    if-eqz v0, :cond_0

    .line 180
    .line 181
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    check-cast v0, Ljava/util/List;

    .line 186
    .line 187
    goto :goto_0

    .line 188
    :cond_0
    const/4 v0, 0x0

    .line 189
    :goto_0
    return-object v0

    .line 190
    :pswitch_f
    iget-object v0, p0, Lb0/j;->h:Li0/a1;

    .line 191
    .line 192
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    check-cast v0, Lfg/a;

    .line 197
    .line 198
    if-eqz v0, :cond_1

    .line 199
    .line 200
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    :cond_1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 204
    .line 205
    return-object v0

    .line 206
    :pswitch_10
    iget-object v0, p0, Lb0/j;->h:Li0/a1;

    .line 207
    .line 208
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    check-cast v0, Lfg/a;

    .line 213
    .line 214
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    check-cast v0, Lr/k;

    .line 219
    .line 220
    return-object v0

    .line 221
    :pswitch_11
    new-instance v0, Lr/h;

    .line 222
    .line 223
    iget-object v1, p0, Lb0/j;->h:Li0/a1;

    .line 224
    .line 225
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    check-cast v1, Lfg/l;

    .line 230
    .line 231
    invoke-direct {v0, v1}, Lr/h;-><init>(Lfg/l;)V

    .line 232
    .line 233
    .line 234
    return-object v0

    .line 235
    :pswitch_12
    iget-object v0, p0, Lb0/j;->h:Li0/a1;

    .line 236
    .line 237
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    check-cast v0, Lv1/t;

    .line 242
    .line 243
    if-eqz v0, :cond_2

    .line 244
    .line 245
    goto :goto_1

    .line 246
    :cond_2
    const-string v0, "Required value was null."

    .line 247
    .line 248
    invoke-static {v0}, Lo/b;->d(Ljava/lang/String;)Ljava/lang/Void;

    .line 249
    .line 250
    .line 251
    invoke-static {}, Lokio/a;->c()V

    .line 252
    .line 253
    .line 254
    const/4 v0, 0x0

    .line 255
    :goto_1
    return-object v0

    .line 256
    :pswitch_13
    iget-object v0, p0, Lb0/j;->h:Li0/a1;

    .line 257
    .line 258
    sget-object v1, Lc9/e1;->g:Lc9/e1;

    .line 259
    .line 260
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 264
    .line 265
    return-object v0

    .line 266
    :pswitch_14
    iget-object v0, p0, Lb0/j;->h:Li0/a1;

    .line 267
    .line 268
    sget-object v1, Lc9/e1;->m:Lc9/e1;

    .line 269
    .line 270
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 274
    .line 275
    return-object v0

    .line 276
    :pswitch_15
    iget-object v0, p0, Lb0/j;->h:Li0/a1;

    .line 277
    .line 278
    sget-object v1, Lc9/e1;->h:Lc9/e1;

    .line 279
    .line 280
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 284
    .line 285
    return-object v0

    .line 286
    :pswitch_16
    iget-object v0, p0, Lb0/j;->h:Li0/a1;

    .line 287
    .line 288
    sget-object v1, Lc9/e1;->h:Lc9/e1;

    .line 289
    .line 290
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 294
    .line 295
    return-object v0

    .line 296
    :pswitch_17
    iget-object v0, p0, Lb0/j;->h:Li0/a1;

    .line 297
    .line 298
    sget-object v1, Lc9/e1;->j:Lc9/e1;

    .line 299
    .line 300
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 304
    .line 305
    return-object v0

    .line 306
    :pswitch_18
    iget-object v0, p0, Lb0/j;->h:Li0/a1;

    .line 307
    .line 308
    sget-object v1, Lc9/e1;->h:Lc9/e1;

    .line 309
    .line 310
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 314
    .line 315
    return-object v0

    .line 316
    :pswitch_19
    iget-object v0, p0, Lb0/j;->h:Li0/a1;

    .line 317
    .line 318
    sget-object v1, Lc9/e1;->h:Lc9/e1;

    .line 319
    .line 320
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 324
    .line 325
    return-object v0

    .line 326
    :pswitch_1a
    iget-object v0, p0, Lb0/j;->h:Li0/a1;

    .line 327
    .line 328
    sget-object v1, Lc9/e1;->h:Lc9/e1;

    .line 329
    .line 330
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 334
    .line 335
    return-object v0

    .line 336
    :pswitch_1b
    iget-object v0, p0, Lb0/j;->h:Li0/a1;

    .line 337
    .line 338
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    check-cast v0, Lv1/t;

    .line 343
    .line 344
    if-eqz v0, :cond_3

    .line 345
    .line 346
    goto :goto_2

    .line 347
    :cond_3
    const-string v0, "Required value was null."

    .line 348
    .line 349
    invoke-static {v0}, Lo/b;->d(Ljava/lang/String;)Ljava/lang/Void;

    .line 350
    .line 351
    .line 352
    invoke-static {}, Lokio/a;->c()V

    .line 353
    .line 354
    .line 355
    const/4 v0, 0x0

    .line 356
    :goto_2
    return-object v0

    .line 357
    :pswitch_1c
    iget-object v0, p0, Lb0/j;->h:Li0/a1;

    .line 358
    .line 359
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    check-cast v0, Lv1/t;

    .line 364
    .line 365
    if-eqz v0, :cond_4

    .line 366
    .line 367
    goto :goto_3

    .line 368
    :cond_4
    const-string v0, "Required value was null."

    .line 369
    .line 370
    invoke-static {v0}, Lo/b;->d(Ljava/lang/String;)Ljava/lang/Void;

    .line 371
    .line 372
    .line 373
    invoke-static {}, Lokio/a;->c()V

    .line 374
    .line 375
    .line 376
    const/4 v0, 0x0

    .line 377
    :goto_3
    return-object v0

    .line 378
    nop

    .line 379
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
