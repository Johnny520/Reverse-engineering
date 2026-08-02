.class public final synthetic Lxq2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 10
    iput p1, p0, Lxq2;->h:I

    iput-object p2, p0, Lxq2;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lxq2;Le2;)V
    .locals 0

    .line 1
    const/4 p2, 0x6

    .line 2
    iput p2, p0, Lxq2;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lxq2;->i:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lxq2;->h:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, Lxq2;->i:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Ljava/util/Set;

    .line 11
    .line 12
    check-cast p1, Ljava/lang/Class;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p0, Ly33;

    .line 27
    .line 28
    check-cast p1, Lba0;

    .line 29
    .line 30
    new-instance p1, Lf8;

    .line 31
    .line 32
    const/16 v0, 0xa

    .line 33
    .line 34
    invoke-direct {p1, v0, p0}, Lf8;-><init>(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-object p1

    .line 38
    :pswitch_1
    check-cast p0, Ltz2;

    .line 39
    .line 40
    check-cast p1, Ljava/lang/Float;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    iget-object v0, p0, Ltz2;->a:Ljx1;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljx1;->g()F

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    add-float/2addr v1, p1

    .line 53
    iget-object p0, p0, Ltz2;->b:Ljx1;

    .line 54
    .line 55
    invoke-virtual {p0}, Ljx1;->g()F

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    cmpl-float v2, v1, v2

    .line 60
    .line 61
    if-lez v2, :cond_0

    .line 62
    .line 63
    invoke-virtual {p0}, Ljx1;->g()F

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    invoke-virtual {v0}, Ljx1;->g()F

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    sub-float p1, p0, p1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    const/4 p0, 0x0

    .line 75
    cmpg-float p0, v1, p0

    .line 76
    .line 77
    if-gez p0, :cond_1

    .line 78
    .line 79
    invoke-virtual {v0}, Ljx1;->g()F

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    neg-float p1, p0

    .line 84
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljx1;->g()F

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    add-float/2addr p0, p1

    .line 89
    invoke-virtual {v0, p0}, Ljx1;->h(F)V

    .line 90
    .line 91
    .line 92
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :pswitch_2
    check-cast p0, Lxq2;

    .line 98
    .line 99
    check-cast p1, Ld43;

    .line 100
    .line 101
    instance-of v0, p1, Ln5;

    .line 102
    .line 103
    if-eqz v0, :cond_2

    .line 104
    .line 105
    check-cast p1, Ln5;

    .line 106
    .line 107
    iget-object p1, p1, Ln5;->v:Lv;

    .line 108
    .line 109
    invoke-virtual {p0, p1}, Lxq2;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_2
    const-string p0, "TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode."

    .line 116
    .line 117
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :goto_1
    return-object v2

    .line 121
    :pswitch_3
    check-cast p0, Loy2;

    .line 122
    .line 123
    check-cast p1, Lin0;

    .line 124
    .line 125
    invoke-interface {p1, p0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    sget-object p0, La83;->a:La83;

    .line 129
    .line 130
    return-object p0

    .line 131
    :pswitch_4
    check-cast p0, Landroid/graphics/drawable/Drawable;

    .line 132
    .line 133
    check-cast p1, Lnc0;

    .line 134
    .line 135
    invoke-interface {p1}, Lnc0;->E()Lb5;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {v0}, Lb5;->q()Lqp;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-interface {p1}, Lnc0;->d()J

    .line 144
    .line 145
    .line 146
    move-result-wide v2

    .line 147
    const/16 v4, 0x20

    .line 148
    .line 149
    shr-long/2addr v2, v4

    .line 150
    long-to-int v2, v2

    .line 151
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    float-to-int v2, v2

    .line 156
    invoke-interface {p1}, Lnc0;->d()J

    .line 157
    .line 158
    .line 159
    move-result-wide v3

    .line 160
    const-wide v5, 0xffffffffL

    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    and-long/2addr v3, v5

    .line 166
    long-to-int p1, v3

    .line 167
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    float-to-int p1, p1

    .line 172
    invoke-virtual {p0, v1, v1, v2, p1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 173
    .line 174
    .line 175
    invoke-static {v0}, Lg6;->a(Lqp;)Landroid/graphics/Canvas;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 180
    .line 181
    .line 182
    sget-object p0, La83;->a:La83;

    .line 183
    .line 184
    return-object p0

    .line 185
    :pswitch_5
    check-cast p0, Ltt0;

    .line 186
    .line 187
    sget-object v0, Lrg3;->n:Ln43;

    .line 188
    .line 189
    check-cast p1, Lgd;

    .line 190
    .line 191
    iget-object v1, p1, Lgd;->e:Lnx1;

    .line 192
    .line 193
    invoke-virtual {v1}, Lnx1;->getValue()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    iget-object v0, v0, Ln43;->b:Lin0;

    .line 198
    .line 199
    iget-object p1, p1, Lgd;->f:Lnd;

    .line 200
    .line 201
    invoke-interface {v0, p1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-virtual {p0, v1, p1}, Ltt0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    sget-object p0, La83;->a:La83;

    .line 209
    .line 210
    return-object p0

    .line 211
    :pswitch_6
    check-cast p0, Lts2;

    .line 212
    .line 213
    iget-object v0, p0, Lts2;->g:Ljava/lang/Object;

    .line 214
    .line 215
    monitor-enter v0

    .line 216
    :try_start_0
    iget-object p0, p0, Lts2;->i:Lss2;

    .line 217
    .line 218
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    iget-object v1, p0, Lss2;->b:Ljava/lang/Object;

    .line 222
    .line 223
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    iget v2, p0, Lss2;->d:I

    .line 227
    .line 228
    iget-object v3, p0, Lss2;->c:Lgk1;

    .line 229
    .line 230
    if-nez v3, :cond_3

    .line 231
    .line 232
    new-instance v3, Lgk1;

    .line 233
    .line 234
    invoke-direct {v3}, Lgk1;-><init>()V

    .line 235
    .line 236
    .line 237
    iput-object v3, p0, Lss2;->c:Lgk1;

    .line 238
    .line 239
    iget-object v4, p0, Lss2;->f:Lrk1;

    .line 240
    .line 241
    invoke-virtual {v4, v1, v3}, Lrk1;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    :cond_3
    invoke-virtual {p0, p1, v2, v1, v3}, Lss2;->b(Ljava/lang/Object;ILjava/lang/Object;Lgk1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 245
    .line 246
    .line 247
    monitor-exit v0

    .line 248
    sget-object p0, La83;->a:La83;

    .line 249
    .line 250
    return-object p0

    .line 251
    :catchall_0
    move-exception p0

    .line 252
    monitor-exit v0

    .line 253
    throw p0

    .line 254
    :pswitch_7
    check-cast p0, Lzq2;

    .line 255
    .line 256
    iget-object v0, p0, Lzq2;->m:Lho2;

    .line 257
    .line 258
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    iget-object v1, p0, Lzq2;->m:Lho2;

    .line 262
    .line 263
    invoke-static {v1, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    if-nez v0, :cond_4

    .line 268
    .line 269
    const-string v0, "Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions"

    .line 270
    .line 271
    invoke-static {v0}, Lj22;->b(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    :cond_4
    iget-object v0, p0, Lzq2;->l:Lsk1;

    .line 275
    .line 276
    iget-object v1, p0, Lzq2;->j:Ljava/lang/Object;

    .line 277
    .line 278
    if-nez v0, :cond_6

    .line 279
    .line 280
    if-nez v1, :cond_5

    .line 281
    .line 282
    iput-object p1, p0, Lzq2;->j:Ljava/lang/Object;

    .line 283
    .line 284
    goto :goto_3

    .line 285
    :cond_5
    sget-object v0, Lfd2;->a:Lsk1;

    .line 286
    .line 287
    new-instance v0, Lsk1;

    .line 288
    .line 289
    invoke-direct {v0}, Lsk1;-><init>()V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0, v1}, Lsk1;->a(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0, p1}, Lsk1;->a(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    iput-object v0, p0, Lzq2;->l:Lsk1;

    .line 299
    .line 300
    iput-object v2, p0, Lzq2;->j:Ljava/lang/Object;

    .line 301
    .line 302
    goto :goto_3

    .line 303
    :cond_6
    if-nez v1, :cond_7

    .line 304
    .line 305
    goto :goto_2

    .line 306
    :cond_7
    const-string p0, "workingSoleWatchedObject must be null when workingWatchSet is non-null"

    .line 307
    .line 308
    invoke-static {p0}, Lj22;->b(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    :goto_2
    invoke-virtual {v0, p1}, Lsk1;->a(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    :goto_3
    sget-object p0, La83;->a:La83;

    .line 315
    .line 316
    return-object p0

    .line 317
    :pswitch_8
    check-cast p0, Ljava/util/ArrayList;

    .line 318
    .line 319
    check-cast p1, Lrz1;

    .line 320
    .line 321
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    move v2, v1

    .line 326
    :goto_4
    if-ge v2, v0, :cond_8

    .line 327
    .line 328
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v3

    .line 332
    check-cast v3, Lsz1;

    .line 333
    .line 334
    invoke-static {p1, v3, v1, v1}, Lrz1;->g(Lrz1;Lsz1;II)V

    .line 335
    .line 336
    .line 337
    add-int/lit8 v2, v2, 0x1

    .line 338
    .line 339
    goto :goto_4

    .line 340
    :cond_8
    sget-object p0, La83;->a:La83;

    .line 341
    .line 342
    return-object p0

    .line 343
    :pswitch_data_0
    .packed-switch 0x0
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
