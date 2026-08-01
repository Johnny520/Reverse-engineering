.class public final Li3;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Li3;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Li3;->η:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Li3;->ζ:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Li3;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lpn;

    .line 7
    .line 8
    iget-object v0, p0, Li3;->ζ:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Le80;

    .line 11
    .line 12
    iget-object p0, p0, Li3;->η:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lhd2;

    .line 15
    .line 16
    iget-boolean v1, p0, Lhd2;->η:Z

    .line 17
    .line 18
    if-nez v1, :cond_2

    .line 19
    .line 20
    iget-object v1, p1, Lpn;->γ:Lhr0;

    .line 21
    .line 22
    iget-object v2, p1, Lpn;->α:Landroid/view/View;

    .line 23
    .line 24
    invoke-interface {v1}, Lhr0;->δ()Ljr0;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iput-object v0, p0, Lhd2;->ι:Le80;

    .line 29
    .line 30
    iget-object v3, p0, Lhd2;->θ:Ljr0;

    .line 31
    .line 32
    if-nez v3, :cond_1

    .line 33
    .line 34
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {v2}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {p1, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-nez p1, :cond_0

    .line 51
    .line 52
    new-instance p1, Lka2;

    .line 53
    .line 54
    const/4 v0, 0x3

    .line 55
    invoke-direct {p1, p0, v0, v1}, Lka2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    iput-object v1, p0, Lhd2;->θ:Ljr0;

    .line 63
    .line 64
    invoke-virtual {v1, p0}, Ljr0;->α(Lgr0;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    iget-object v1, v1, Ljr0;->γ:Lcr0;

    .line 69
    .line 70
    sget-object v2, Lcr0;->η:Lcr0;

    .line 71
    .line 72
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-ltz v1, :cond_2

    .line 77
    .line 78
    iget-object v1, p0, Lhd2;->ζ:Lzn;

    .line 79
    .line 80
    new-instance v2, Leo;

    .line 81
    .line 82
    invoke-direct {v2, p0, p1, v0}, Leo;-><init>(Lhd2;Lpn;Le80;)V

    .line 83
    .line 84
    .line 85
    new-instance p0, Lan;

    .line 86
    .line 87
    const p1, -0x66c1ecc8

    .line 88
    .line 89
    .line 90
    const/4 v0, 0x1

    .line 91
    invoke-direct {p0, p1, v0, v2}, Lan;-><init>(IZLm80;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, p0}, Lzn;->Β(Le80;)V

    .line 95
    .line 96
    .line 97
    :cond_2
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 98
    .line 99
    return-object p0

    .line 100
    :pswitch_0
    check-cast p1, Lbh1;

    .line 101
    .line 102
    iget-object v0, p0, Li3;->η:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, Lch1;

    .line 105
    .line 106
    iget-object p0, p0, Li3;->ζ:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast p0, Lgw1;

    .line 109
    .line 110
    iget-object p0, p0, Lgw1;->Ε:Lb0;

    .line 111
    .line 112
    invoke-static {p1, v0, p0}, Lbh1;->Α(Lbh1;Lch1;La80;)V

    .line 113
    .line 114
    .line 115
    sget-object p0, Ls62;->α:Ls62;

    .line 116
    .line 117
    return-object p0

    .line 118
    :pswitch_1
    check-cast p1, Lcw;

    .line 119
    .line 120
    iget-object v0, p0, Li3;->η:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, Lcw;

    .line 123
    .line 124
    invoke-interface {p1}, Lcw;->Β()Lm6;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v1}, Lm6;->ω()Lyr;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-interface {p1}, Lcw;->Β()Lm6;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-virtual {v2}, Lm6;->Ε()Lnp0;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-interface {p1}, Lcw;->Β()Lm6;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-virtual {v3}, Lm6;->υ()Lde;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-interface {p1}, Lcw;->Β()Lm6;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    invoke-virtual {v4}, Lm6;->Ζ()J

    .line 153
    .line 154
    .line 155
    move-result-wide v4

    .line 156
    invoke-interface {p1}, Lcw;->Β()Lm6;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    iget-object p1, p1, Lm6;->η:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast p1, Lwa0;

    .line 163
    .line 164
    iget-object p0, p0, Li3;->ζ:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast p0, La80;

    .line 167
    .line 168
    invoke-interface {v0}, Lcw;->Β()Lm6;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    invoke-virtual {v6}, Lm6;->ω()Lyr;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    invoke-interface {v0}, Lcw;->Β()Lm6;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    invoke-virtual {v7}, Lm6;->Ε()Lnp0;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    invoke-interface {v0}, Lcw;->Β()Lm6;

    .line 185
    .line 186
    .line 187
    move-result-object v8

    .line 188
    invoke-virtual {v8}, Lm6;->υ()Lde;

    .line 189
    .line 190
    .line 191
    move-result-object v8

    .line 192
    invoke-interface {v0}, Lcw;->Β()Lm6;

    .line 193
    .line 194
    .line 195
    move-result-object v9

    .line 196
    invoke-virtual {v9}, Lm6;->Ζ()J

    .line 197
    .line 198
    .line 199
    move-result-wide v9

    .line 200
    invoke-interface {v0}, Lcw;->Β()Lm6;

    .line 201
    .line 202
    .line 203
    move-result-object v11

    .line 204
    iget-object v11, v11, Lm6;->η:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v11, Lwa0;

    .line 207
    .line 208
    invoke-interface {v0}, Lcw;->Β()Lm6;

    .line 209
    .line 210
    .line 211
    move-result-object v12

    .line 212
    invoke-virtual {v12, v1}, Lm6;->Σ(Lyr;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v12, v2}, Lm6;->Τ(Lnp0;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12, v3}, Lm6;->Ρ(Lde;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v12, v4, v5}, Lm6;->Υ(J)V

    .line 222
    .line 223
    .line 224
    iput-object p1, v12, Lm6;->η:Ljava/lang/Object;

    .line 225
    .line 226
    invoke-interface {v3}, Lde;->θ()V

    .line 227
    .line 228
    .line 229
    :try_start_0
    invoke-interface {p0, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 230
    .line 231
    .line 232
    invoke-interface {v3}, Lde;->ζ()V

    .line 233
    .line 234
    .line 235
    invoke-interface {v0}, Lcw;->Β()Lm6;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    invoke-virtual {p0, v6}, Lm6;->Σ(Lyr;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p0, v7}, Lm6;->Τ(Lnp0;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p0, v8}, Lm6;->Ρ(Lde;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p0, v9, v10}, Lm6;->Υ(J)V

    .line 249
    .line 250
    .line 251
    iput-object v11, p0, Lm6;->η:Ljava/lang/Object;

    .line 252
    .line 253
    sget-object p0, Ls62;->α:Ls62;

    .line 254
    .line 255
    return-object p0

    .line 256
    :catchall_0
    move-exception p0

    .line 257
    invoke-interface {v3}, Lde;->ζ()V

    .line 258
    .line 259
    .line 260
    invoke-interface {v0}, Lcw;->Β()Lm6;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    invoke-virtual {p1, v6}, Lm6;->Σ(Lyr;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {p1, v7}, Lm6;->Τ(Lnp0;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {p1, v8}, Lm6;->Ρ(Lde;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p1, v9, v10}, Lm6;->Υ(J)V

    .line 274
    .line 275
    .line 276
    iput-object v11, p1, Lm6;->η:Ljava/lang/Object;

    .line 277
    .line 278
    throw p0

    .line 279
    :pswitch_2
    check-cast p1, Lbh1;

    .line 280
    .line 281
    iget-object v0, p0, Li3;->η:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v0, Lch1;

    .line 284
    .line 285
    iget-object p0, p0, Li3;->ζ:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast p0, Lia;

    .line 288
    .line 289
    iget-object p0, p0, Lia;->τ:La80;

    .line 290
    .line 291
    invoke-static {p1, v0, p0}, Lbh1;->Α(Lbh1;Lch1;La80;)V

    .line 292
    .line 293
    .line 294
    sget-object p0, Ls62;->α:Ls62;

    .line 295
    .line 296
    return-object p0

    .line 297
    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    .line 298
    .line 299
    iget-object p1, p0, Li3;->η:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast p1, Lk3;

    .line 302
    .line 303
    iget-object p1, p1, Lk3;->ζ:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast p1, Landroid/view/Choreographer;

    .line 306
    .line 307
    iget-object p0, p0, Li3;->ζ:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast p0, Lj3;

    .line 310
    .line 311
    invoke-virtual {p1, p0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 312
    .line 313
    .line 314
    sget-object p0, Ls62;->α:Ls62;

    .line 315
    .line 316
    return-object p0

    .line 317
    :pswitch_4
    check-cast p1, Ljava/lang/Throwable;

    .line 318
    .line 319
    iget-object p1, p0, Li3;->η:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast p1, Lh3;

    .line 322
    .line 323
    iget-object p0, p0, Li3;->ζ:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast p0, Lj3;

    .line 326
    .line 327
    iget-object v0, p1, Lh3;->ι:Ljava/lang/Object;

    .line 328
    .line 329
    monitor-enter v0

    .line 330
    :try_start_1
    iget-object p1, p1, Lh3;->λ:Ljava/util/ArrayList;

    .line 331
    .line 332
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 333
    .line 334
    .line 335
    monitor-exit v0

    .line 336
    sget-object p0, Ls62;->α:Ls62;

    .line 337
    .line 338
    return-object p0

    .line 339
    :catchall_1
    move-exception p0

    .line 340
    monitor-exit v0

    .line 341
    throw p0

    .line 342
    nop

    .line 343
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
