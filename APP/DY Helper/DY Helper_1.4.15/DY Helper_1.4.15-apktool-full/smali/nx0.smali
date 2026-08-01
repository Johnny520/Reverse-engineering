.class public final Lnx0;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lox0;


# direct methods
.method public synthetic constructor <init>(Lox0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lnx0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lnx0;->ζ:Lox0;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lnx0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lnx0;->ζ:Lox0;

    .line 7
    .line 8
    iget-object v0, p0, Lox0;->κ:Lbq0;

    .line 9
    .line 10
    invoke-virtual {v0}, Lbq0;->α()Lq31;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v1, v1, Lq31;->υ:Lq31;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object v1, v1, Ldw0;->ο:Lew0;

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    :cond_0
    iget-object v1, v0, Lbq0;->α:Lyp0;

    .line 23
    .line 24
    invoke-static {v1}, Lln0;->д(Lyp0;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->getPlacementScope()Lbh1;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :cond_1
    iget-object v2, p0, Lox0;->Λ:La80;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    if-nez v2, :cond_2

    .line 36
    .line 37
    invoke-virtual {v0}, Lbq0;->α()Lq31;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-wide v4, p0, Lox0;->Μ:J

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-static {v1, v0}, Lbh1;->γ(Lbh1;Lch1;)V

    .line 47
    .line 48
    .line 49
    iget-wide v1, v0, Lch1;->ι:J

    .line 50
    .line 51
    invoke-static {v4, v5, v1, v2}, Lum0;->γ(JJ)J

    .line 52
    .line 53
    .line 54
    move-result-wide v1

    .line 55
    const/4 p0, 0x0

    .line 56
    invoke-virtual {v0, v1, v2, v3, p0}, Lch1;->у(JFLa80;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-virtual {v0}, Lbq0;->α()Lq31;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-wide v4, p0, Lox0;->Μ:J

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-static {v1, v0}, Lbh1;->γ(Lbh1;Lch1;)V

    .line 70
    .line 71
    .line 72
    iget-wide v6, v0, Lch1;->ι:J

    .line 73
    .line 74
    invoke-static {v4, v5, v6, v7}, Lum0;->γ(JJ)J

    .line 75
    .line 76
    .line 77
    move-result-wide v4

    .line 78
    invoke-virtual {v0, v4, v5, v3, v2}, Lch1;->у(JFLa80;)V

    .line 79
    .line 80
    .line 81
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_0
    iget-object p0, p0, Lnx0;->ζ:Lox0;

    .line 85
    .line 86
    iget-object v0, p0, Lox0;->κ:Lbq0;

    .line 87
    .line 88
    invoke-virtual {v0}, Lbq0;->α()Lq31;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iget-wide v1, p0, Lox0;->Ζ:J

    .line 93
    .line 94
    invoke-interface {v0, v1, v2}, Lkx0;->ζ(J)Lch1;

    .line 95
    .line 96
    .line 97
    sget-object p0, Ls62;->α:Ls62;

    .line 98
    .line 99
    return-object p0

    .line 100
    :pswitch_1
    iget-object p0, p0, Lnx0;->ζ:Lox0;

    .line 101
    .line 102
    iget-object v0, p0, Lox0;->κ:Lbq0;

    .line 103
    .line 104
    const/4 v1, 0x0

    .line 105
    iput v1, v0, Lbq0;->ι:I

    .line 106
    .line 107
    iget-object v2, v0, Lbq0;->α:Lyp0;

    .line 108
    .line 109
    invoke-virtual {v2}, Lyp0;->ψ()Lk21;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    iget-object v3, v2, Lk21;->ε:[Ljava/lang/Object;

    .line 114
    .line 115
    iget v2, v2, Lk21;->η:I

    .line 116
    .line 117
    move v4, v1

    .line 118
    :goto_1
    const v5, 0x7fffffff

    .line 119
    .line 120
    .line 121
    if-ge v4, v2, :cond_4

    .line 122
    .line 123
    aget-object v6, v3, v4

    .line 124
    .line 125
    check-cast v6, Lyp0;

    .line 126
    .line 127
    iget-object v6, v6, Lyp0;->Λ:Lbq0;

    .line 128
    .line 129
    iget-object v6, v6, Lbq0;->π:Lox0;

    .line 130
    .line 131
    iget v7, v6, Lox0;->ν:I

    .line 132
    .line 133
    iput v7, v6, Lox0;->μ:I

    .line 134
    .line 135
    iput v5, v6, Lox0;->ν:I

    .line 136
    .line 137
    iput-boolean v1, v6, Lox0;->χ:Z

    .line 138
    .line 139
    iget-object v5, v6, Lox0;->π:Lwp0;

    .line 140
    .line 141
    sget-object v7, Lwp0;->ζ:Lwp0;

    .line 142
    .line 143
    if-ne v5, v7, :cond_3

    .line 144
    .line 145
    sget-object v5, Lwp0;->η:Lwp0;

    .line 146
    .line 147
    iput-object v5, v6, Lox0;->π:Lwp0;

    .line 148
    .line 149
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_4
    iget-object v2, v0, Lbq0;->α:Lyp0;

    .line 153
    .line 154
    iget-object v0, v0, Lbq0;->α:Lyp0;

    .line 155
    .line 156
    invoke-virtual {v2}, Lyp0;->ψ()Lk21;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    iget-object v3, v2, Lk21;->ε:[Ljava/lang/Object;

    .line 161
    .line 162
    iget v2, v2, Lk21;->η:I

    .line 163
    .line 164
    move v4, v1

    .line 165
    :goto_2
    if-ge v4, v2, :cond_5

    .line 166
    .line 167
    aget-object v6, v3, v4

    .line 168
    .line 169
    check-cast v6, Lyp0;

    .line 170
    .line 171
    iget-object v6, v6, Lyp0;->Λ:Lbq0;

    .line 172
    .line 173
    iget-object v6, v6, Lbq0;->π:Lox0;

    .line 174
    .line 175
    iget-object v6, v6, Lox0;->Β:Lzp0;

    .line 176
    .line 177
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    add-int/lit8 v4, v4, 0x1

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_5
    invoke-virtual {p0}, Lox0;->Ζ()Lgm0;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    iget-boolean v2, v2, Ldw0;->ξ:Z

    .line 188
    .line 189
    if-eqz v2, :cond_6

    .line 190
    .line 191
    invoke-virtual {v0}, Lyp0;->μ()Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    check-cast v2, Lh21;

    .line 196
    .line 197
    iget-object v3, v2, Lh21;->ε:Lk21;

    .line 198
    .line 199
    iget v3, v3, Lk21;->η:I

    .line 200
    .line 201
    move v4, v1

    .line 202
    :goto_3
    if-ge v4, v3, :cond_6

    .line 203
    .line 204
    invoke-virtual {v2, v4}, Lh21;->get(I)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    check-cast v6, Lyp0;

    .line 209
    .line 210
    iget-object v6, v6, Lyp0;->Κ:Lk31;

    .line 211
    .line 212
    iget-object v6, v6, Lk31;->δ:Lq31;

    .line 213
    .line 214
    const/4 v7, 0x1

    .line 215
    iput-boolean v7, v6, Ldw0;->ξ:Z

    .line 216
    .line 217
    add-int/lit8 v4, v4, 0x1

    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_6
    invoke-virtual {p0}, Lox0;->Ζ()Lgm0;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    invoke-virtual {v2}, Lq31;->В()Lqx0;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    invoke-interface {v2}, Lqx0;->α()V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0}, Lox0;->Ζ()Lgm0;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    iget-boolean p0, p0, Ldw0;->ξ:Z

    .line 236
    .line 237
    if-eqz p0, :cond_7

    .line 238
    .line 239
    invoke-virtual {v0}, Lyp0;->μ()Ljava/util/List;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    check-cast p0, Lh21;

    .line 244
    .line 245
    iget-object v2, p0, Lh21;->ε:Lk21;

    .line 246
    .line 247
    iget v2, v2, Lk21;->η:I

    .line 248
    .line 249
    move v3, v1

    .line 250
    :goto_4
    if-ge v3, v2, :cond_7

    .line 251
    .line 252
    invoke-virtual {p0, v3}, Lh21;->get(I)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    check-cast v4, Lyp0;

    .line 257
    .line 258
    iget-object v4, v4, Lyp0;->Κ:Lk31;

    .line 259
    .line 260
    iget-object v4, v4, Lk31;->δ:Lq31;

    .line 261
    .line 262
    iput-boolean v1, v4, Ldw0;->ξ:Z

    .line 263
    .line 264
    add-int/lit8 v3, v3, 0x1

    .line 265
    .line 266
    goto :goto_4

    .line 267
    :cond_7
    invoke-virtual {v0}, Lyp0;->ψ()Lk21;

    .line 268
    .line 269
    .line 270
    move-result-object p0

    .line 271
    iget-object v2, p0, Lk21;->ε:[Ljava/lang/Object;

    .line 272
    .line 273
    iget p0, p0, Lk21;->η:I

    .line 274
    .line 275
    move v3, v1

    .line 276
    :goto_5
    if-ge v3, p0, :cond_b

    .line 277
    .line 278
    aget-object v4, v2, v3

    .line 279
    .line 280
    check-cast v4, Lyp0;

    .line 281
    .line 282
    iget-object v6, v4, Lyp0;->Λ:Lbq0;

    .line 283
    .line 284
    iget-object v7, v6, Lbq0;->π:Lox0;

    .line 285
    .line 286
    iget v7, v7, Lox0;->μ:I

    .line 287
    .line 288
    invoke-virtual {v4}, Lyp0;->τ()I

    .line 289
    .line 290
    .line 291
    move-result v8

    .line 292
    if-eq v7, v8, :cond_a

    .line 293
    .line 294
    invoke-virtual {v0}, Lyp0;->Ν()V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0}, Lyp0;->Β()V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v4}, Lyp0;->τ()I

    .line 301
    .line 302
    .line 303
    move-result v7

    .line 304
    if-ne v7, v5, :cond_a

    .line 305
    .line 306
    iget-boolean v7, v6, Lbq0;->γ:Z

    .line 307
    .line 308
    if-nez v7, :cond_8

    .line 309
    .line 310
    invoke-static {v4}, Lyh;->Ψ(Lyp0;)Z

    .line 311
    .line 312
    .line 313
    move-result v4

    .line 314
    if-eqz v4, :cond_9

    .line 315
    .line 316
    :cond_8
    iget-object v4, v6, Lbq0;->ρ:Ljw0;

    .line 317
    .line 318
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v4, v1}, Ljw0;->ч(Z)V

    .line 322
    .line 323
    .line 324
    :cond_9
    iget-object v4, v6, Lbq0;->π:Lox0;

    .line 325
    .line 326
    invoke-virtual {v4}, Lox0;->ш()V

    .line 327
    .line 328
    .line 329
    :cond_a
    add-int/lit8 v3, v3, 0x1

    .line 330
    .line 331
    goto :goto_5

    .line 332
    :cond_b
    invoke-virtual {v0}, Lyp0;->ψ()Lk21;

    .line 333
    .line 334
    .line 335
    move-result-object p0

    .line 336
    iget-object v0, p0, Lk21;->ε:[Ljava/lang/Object;

    .line 337
    .line 338
    iget p0, p0, Lk21;->η:I

    .line 339
    .line 340
    move v2, v1

    .line 341
    :goto_6
    if-ge v2, p0, :cond_c

    .line 342
    .line 343
    aget-object v3, v0, v2

    .line 344
    .line 345
    check-cast v3, Lyp0;

    .line 346
    .line 347
    iget-object v3, v3, Lyp0;->Λ:Lbq0;

    .line 348
    .line 349
    iget-object v3, v3, Lbq0;->π:Lox0;

    .line 350
    .line 351
    iget-object v3, v3, Lox0;->Β:Lzp0;

    .line 352
    .line 353
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    iput-boolean v1, v3, Lzp0;->γ:Z

    .line 357
    .line 358
    add-int/lit8 v2, v2, 0x1

    .line 359
    .line 360
    goto :goto_6

    .line 361
    :cond_c
    sget-object p0, Ls62;->α:Ls62;

    .line 362
    .line 363
    return-object p0

    .line 364
    nop

    .line 365
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
