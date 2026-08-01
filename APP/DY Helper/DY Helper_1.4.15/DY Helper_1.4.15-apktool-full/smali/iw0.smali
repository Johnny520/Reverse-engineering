.class public final Liw0;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljw0;


# direct methods
.method public synthetic constructor <init>(Ljw0;I)V
    .locals 0

    .line 1
    iput p2, p0, Liw0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Liw0;->ζ:Ljw0;

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
    .locals 8

    .line 1
    iget v0, p0, Liw0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Liw0;->ζ:Ljw0;

    .line 7
    .line 8
    iget-object v0, p0, Ljw0;->κ:Lbq0;

    .line 9
    .line 10
    invoke-virtual {v0}, Lbq0;->α()Lq31;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lq31;->У()Lfw0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-wide v1, p0, Ljw0;->Δ:J

    .line 22
    .line 23
    invoke-interface {v0, v1, v2}, Lkx0;->ζ(J)Lch1;

    .line 24
    .line 25
    .line 26
    sget-object p0, Ls62;->α:Ls62;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_0
    iget-object p0, p0, Liw0;->ζ:Ljw0;

    .line 30
    .line 31
    iget-object v0, p0, Ljw0;->κ:Lbq0;

    .line 32
    .line 33
    iget-object v1, v0, Lbq0;->α:Lyp0;

    .line 34
    .line 35
    invoke-static {v1}, Lyh;->Ψ(Lyp0;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    const/4 v2, 0x0

    .line 40
    if-nez v1, :cond_0

    .line 41
    .line 42
    iget-boolean v1, v0, Lbq0;->γ:Z

    .line 43
    .line 44
    if-nez v1, :cond_0

    .line 45
    .line 46
    invoke-virtual {v0}, Lbq0;->α()Lq31;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v1, v1, Lq31;->υ:Lq31;

    .line 51
    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    invoke-virtual {v1}, Lq31;->У()Lfw0;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    iget-object v2, v1, Ldw0;->ο:Lew0;

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    invoke-virtual {v0}, Lbq0;->α()Lq31;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget-object v1, v1, Lq31;->υ:Lq31;

    .line 68
    .line 69
    if-eqz v1, :cond_1

    .line 70
    .line 71
    iget-object v2, v1, Ldw0;->ο:Lew0;

    .line 72
    .line 73
    :cond_1
    :goto_0
    if-nez v2, :cond_2

    .line 74
    .line 75
    iget-object v1, v0, Lbq0;->α:Lyp0;

    .line 76
    .line 77
    invoke-static {v1}, Lln0;->д(Lyp0;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->getPlacementScope()Lbh1;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    :cond_2
    invoke-virtual {v0}, Lbq0;->α()Lq31;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0}, Lq31;->У()Lfw0;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    iget-wide v3, p0, Ljw0;->σ:J

    .line 97
    .line 98
    invoke-static {v2, v0, v3, v4}, Lbh1;->μ(Lbh1;Lch1;J)V

    .line 99
    .line 100
    .line 101
    sget-object p0, Ls62;->α:Ls62;

    .line 102
    .line 103
    return-object p0

    .line 104
    :pswitch_1
    iget-object p0, p0, Liw0;->ζ:Ljw0;

    .line 105
    .line 106
    iget-object v0, p0, Ljw0;->κ:Lbq0;

    .line 107
    .line 108
    const/4 v1, 0x0

    .line 109
    iput v1, v0, Lbq0;->θ:I

    .line 110
    .line 111
    iget-object v2, v0, Lbq0;->α:Lyp0;

    .line 112
    .line 113
    invoke-virtual {v2}, Lyp0;->ψ()Lk21;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    iget-object v3, v2, Lk21;->ε:[Ljava/lang/Object;

    .line 118
    .line 119
    iget v2, v2, Lk21;->η:I

    .line 120
    .line 121
    move v4, v1

    .line 122
    :goto_1
    const v5, 0x7fffffff

    .line 123
    .line 124
    .line 125
    if-ge v4, v2, :cond_4

    .line 126
    .line 127
    aget-object v6, v3, v4

    .line 128
    .line 129
    check-cast v6, Lyp0;

    .line 130
    .line 131
    iget-object v6, v6, Lyp0;->Λ:Lbq0;

    .line 132
    .line 133
    iget-object v6, v6, Lbq0;->ρ:Ljw0;

    .line 134
    .line 135
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    iget v7, v6, Ljw0;->ν:I

    .line 139
    .line 140
    iput v7, v6, Ljw0;->μ:I

    .line 141
    .line 142
    iput v5, v6, Ljw0;->ν:I

    .line 143
    .line 144
    iget-object v5, v6, Ljw0;->ξ:Lwp0;

    .line 145
    .line 146
    sget-object v7, Lwp0;->ζ:Lwp0;

    .line 147
    .line 148
    if-ne v5, v7, :cond_3

    .line 149
    .line 150
    sget-object v5, Lwp0;->η:Lwp0;

    .line 151
    .line 152
    iput-object v5, v6, Ljw0;->ξ:Lwp0;

    .line 153
    .line 154
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_4
    iget-object v2, v0, Lbq0;->α:Lyp0;

    .line 158
    .line 159
    iget-object v0, v0, Lbq0;->α:Lyp0;

    .line 160
    .line 161
    invoke-virtual {v2}, Lyp0;->ψ()Lk21;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    iget-object v3, v2, Lk21;->ε:[Ljava/lang/Object;

    .line 166
    .line 167
    iget v2, v2, Lk21;->η:I

    .line 168
    .line 169
    move v4, v1

    .line 170
    :goto_2
    if-ge v4, v2, :cond_5

    .line 171
    .line 172
    aget-object v6, v3, v4

    .line 173
    .line 174
    check-cast v6, Lyp0;

    .line 175
    .line 176
    iget-object v6, v6, Lyp0;->Λ:Lbq0;

    .line 177
    .line 178
    iget-object v6, v6, Lbq0;->ρ:Ljw0;

    .line 179
    .line 180
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    iget-object v6, v6, Ljw0;->φ:Lzp0;

    .line 184
    .line 185
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    add-int/lit8 v4, v4, 0x1

    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_5
    invoke-virtual {p0}, Ljw0;->Ζ()Lgm0;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    iget-object v2, v2, Lgm0;->Ψ:Lfm0;

    .line 196
    .line 197
    if-eqz v2, :cond_7

    .line 198
    .line 199
    iget-boolean v2, v2, Ldw0;->ξ:Z

    .line 200
    .line 201
    invoke-virtual {v0}, Lyp0;->μ()Ljava/util/List;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    check-cast v3, Lh21;

    .line 206
    .line 207
    iget-object v4, v3, Lh21;->ε:Lk21;

    .line 208
    .line 209
    iget v4, v4, Lk21;->η:I

    .line 210
    .line 211
    move v6, v1

    .line 212
    :goto_3
    if-ge v6, v4, :cond_7

    .line 213
    .line 214
    invoke-virtual {v3, v6}, Lh21;->get(I)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v7

    .line 218
    check-cast v7, Lyp0;

    .line 219
    .line 220
    iget-object v7, v7, Lyp0;->Κ:Lk31;

    .line 221
    .line 222
    iget-object v7, v7, Lk31;->δ:Lq31;

    .line 223
    .line 224
    invoke-virtual {v7}, Lq31;->У()Lfw0;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    if-eqz v7, :cond_6

    .line 229
    .line 230
    iput-boolean v2, v7, Ldw0;->ξ:Z

    .line 231
    .line 232
    :cond_6
    add-int/lit8 v6, v6, 0x1

    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_7
    invoke-virtual {p0}, Ljw0;->Ζ()Lgm0;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    iget-object v2, v2, Lgm0;->Ψ:Lfm0;

    .line 240
    .line 241
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2}, Lfw0;->В()Lqx0;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    invoke-interface {v2}, Lqx0;->α()V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p0}, Ljw0;->Ζ()Lgm0;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    iget-object p0, p0, Lgm0;->Ψ:Lfm0;

    .line 256
    .line 257
    if-eqz p0, :cond_9

    .line 258
    .line 259
    invoke-virtual {v0}, Lyp0;->μ()Ljava/util/List;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    check-cast p0, Lh21;

    .line 264
    .line 265
    iget-object v2, p0, Lh21;->ε:Lk21;

    .line 266
    .line 267
    iget v2, v2, Lk21;->η:I

    .line 268
    .line 269
    move v3, v1

    .line 270
    :goto_4
    if-ge v3, v2, :cond_9

    .line 271
    .line 272
    invoke-virtual {p0, v3}, Lh21;->get(I)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    check-cast v4, Lyp0;

    .line 277
    .line 278
    iget-object v4, v4, Lyp0;->Κ:Lk31;

    .line 279
    .line 280
    iget-object v4, v4, Lk31;->δ:Lq31;

    .line 281
    .line 282
    invoke-virtual {v4}, Lq31;->У()Lfw0;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    if-eqz v4, :cond_8

    .line 287
    .line 288
    iput-boolean v1, v4, Ldw0;->ξ:Z

    .line 289
    .line 290
    :cond_8
    add-int/lit8 v3, v3, 0x1

    .line 291
    .line 292
    goto :goto_4

    .line 293
    :cond_9
    invoke-virtual {v0}, Lyp0;->ψ()Lk21;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    iget-object v2, p0, Lk21;->ε:[Ljava/lang/Object;

    .line 298
    .line 299
    iget p0, p0, Lk21;->η:I

    .line 300
    .line 301
    move v3, v1

    .line 302
    :goto_5
    if-ge v3, p0, :cond_b

    .line 303
    .line 304
    aget-object v4, v2, v3

    .line 305
    .line 306
    check-cast v4, Lyp0;

    .line 307
    .line 308
    iget-object v4, v4, Lyp0;->Λ:Lbq0;

    .line 309
    .line 310
    iget-object v4, v4, Lbq0;->ρ:Ljw0;

    .line 311
    .line 312
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    iget v6, v4, Ljw0;->μ:I

    .line 316
    .line 317
    iget v7, v4, Ljw0;->ν:I

    .line 318
    .line 319
    if-eq v6, v7, :cond_a

    .line 320
    .line 321
    if-ne v7, v5, :cond_a

    .line 322
    .line 323
    const/4 v6, 0x1

    .line 324
    invoke-virtual {v4, v6}, Ljw0;->ч(Z)V

    .line 325
    .line 326
    .line 327
    :cond_a
    add-int/lit8 v3, v3, 0x1

    .line 328
    .line 329
    goto :goto_5

    .line 330
    :cond_b
    invoke-virtual {v0}, Lyp0;->ψ()Lk21;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    iget-object v0, p0, Lk21;->ε:[Ljava/lang/Object;

    .line 335
    .line 336
    iget p0, p0, Lk21;->η:I

    .line 337
    .line 338
    move v2, v1

    .line 339
    :goto_6
    if-ge v2, p0, :cond_c

    .line 340
    .line 341
    aget-object v3, v0, v2

    .line 342
    .line 343
    check-cast v3, Lyp0;

    .line 344
    .line 345
    iget-object v3, v3, Lyp0;->Λ:Lbq0;

    .line 346
    .line 347
    iget-object v3, v3, Lbq0;->ρ:Ljw0;

    .line 348
    .line 349
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    iget-object v3, v3, Ljw0;->φ:Lzp0;

    .line 353
    .line 354
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    iput-boolean v1, v3, Lzp0;->γ:Z

    .line 358
    .line 359
    add-int/lit8 v2, v2, 0x1

    .line 360
    .line 361
    goto :goto_6

    .line 362
    :cond_c
    sget-object p0, Ls62;->α:Ls62;

    .line 363
    .line 364
    return-object p0

    .line 365
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
