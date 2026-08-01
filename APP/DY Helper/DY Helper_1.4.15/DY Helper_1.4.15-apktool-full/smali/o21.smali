.class public final Lo21;
.super Ly12;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ι:I

.field public κ:I

.field public λ:Ljava/lang/Object;

.field public μ:Ljava/lang/Object;

.field public synthetic ν:Ljava/lang/Object;

.field public ξ:Ljava/lang/Object;

.field public final synthetic ο:Ljava/lang/Object;

.field public final synthetic π:Ljava/lang/Object;

.field public final synthetic ρ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/ContentResolver;Landroid/net/Uri;Lqq;Lwc;Landroid/content/Context;Lop;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lo21;->ι:I

    .line 3
    .line 4
    iput-object p1, p0, Lo21;->ν:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lo21;->ξ:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lo21;->ο:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, Lo21;->π:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p5, p0, Lo21;->ρ:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-direct {p0, p1, p6}, Ly12;-><init>(ILop;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Lm21;Lp21;Ln3;Lop;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lo21;->ι:I

    .line 19
    iput-object p1, p0, Lo21;->π:Ljava/lang/Object;

    iput-object p2, p0, Lo21;->ο:Ljava/lang/Object;

    iput-object p3, p0, Lo21;->ρ:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ly12;-><init>(ILop;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lo21;->ι:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lg40;

    .line 7
    .line 8
    check-cast p2, Lop;

    .line 9
    .line 10
    invoke-virtual {p0, p2, p1}, Lo21;->η(Lop;Ljava/lang/Object;)Lop;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lo21;

    .line 15
    .line 16
    sget-object p1, Ls62;->α:Ls62;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lo21;->κ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Lbq;

    .line 24
    .line 25
    check-cast p2, Lop;

    .line 26
    .line 27
    invoke-virtual {p0, p2, p1}, Lo21;->η(Lop;Ljava/lang/Object;)Lop;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lo21;

    .line 32
    .line 33
    sget-object p1, Ls62;->α:Ls62;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lo21;->κ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final η(Lop;Ljava/lang/Object;)Lop;
    .locals 8

    .line 1
    iget v0, p0, Lo21;->ι:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, Lo21;

    .line 7
    .line 8
    iget-object v0, p0, Lo21;->ν:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v2, v0

    .line 11
    check-cast v2, Landroid/content/ContentResolver;

    .line 12
    .line 13
    iget-object v0, p0, Lo21;->ξ:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v3, v0

    .line 16
    check-cast v3, Landroid/net/Uri;

    .line 17
    .line 18
    iget-object v0, p0, Lo21;->ο:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v4, v0

    .line 21
    check-cast v4, Lqq;

    .line 22
    .line 23
    iget-object v0, p0, Lo21;->π:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v5, v0

    .line 26
    check-cast v5, Lwc;

    .line 27
    .line 28
    iget-object p0, p0, Lo21;->ρ:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v6, p0

    .line 31
    check-cast v6, Landroid/content/Context;

    .line 32
    .line 33
    move-object v7, p1

    .line 34
    invoke-direct/range {v1 .. v7}, Lo21;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;Lqq;Lwc;Landroid/content/Context;Lop;)V

    .line 35
    .line 36
    .line 37
    iput-object p2, v1, Lo21;->λ:Ljava/lang/Object;

    .line 38
    .line 39
    return-object v1

    .line 40
    :pswitch_0
    move-object v7, p1

    .line 41
    new-instance p1, Lo21;

    .line 42
    .line 43
    iget-object v0, p0, Lo21;->π:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Lm21;

    .line 46
    .line 47
    iget-object v1, p0, Lo21;->ο:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Lp21;

    .line 50
    .line 51
    iget-object p0, p0, Lo21;->ρ:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p0, Ln3;

    .line 54
    .line 55
    invoke-direct {p1, v0, v1, p0, v7}, Lo21;-><init>(Lm21;Lp21;Ln3;Lop;)V

    .line 56
    .line 57
    .line 58
    iput-object p2, p1, Lo21;->ν:Ljava/lang/Object;

    .line 59
    .line 60
    return-object p1

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final κ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lo21;->ι:I

    .line 2
    .line 3
    sget-object v1, Ls62;->α:Ls62;

    .line 4
    .line 5
    iget-object v2, p0, Lo21;->ρ:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lo21;->π:Ljava/lang/Object;

    .line 8
    .line 9
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    sget-object v5, Lcq;->ε:Lcq;

    .line 12
    .line 13
    iget-object v6, p0, Lo21;->ο:Ljava/lang/Object;

    .line 14
    .line 15
    const/4 v7, 0x1

    .line 16
    const/4 v8, 0x0

    .line 17
    const/4 v9, 0x2

    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast v6, Lqq;

    .line 22
    .line 23
    iget-object v0, p0, Lo21;->ν:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Landroid/content/ContentResolver;

    .line 26
    .line 27
    iget v10, p0, Lo21;->κ:I

    .line 28
    .line 29
    if-eqz v10, :cond_3

    .line 30
    .line 31
    if-eq v10, v7, :cond_2

    .line 32
    .line 33
    if-ne v10, v9, :cond_1

    .line 34
    .line 35
    iget-object v3, p0, Lo21;->μ:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v3, Lvc;

    .line 38
    .line 39
    iget-object v4, p0, Lo21;->λ:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v4, Lg40;

    .line 42
    .line 43
    :try_start_0
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    :cond_0
    move-object p1, v4

    .line 47
    move-object v4, v3

    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    goto/16 :goto_4

    .line 51
    .line 52
    :cond_1
    invoke-static {v4}, Lγ;->ρ(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    move-object v1, v8

    .line 56
    goto :goto_3

    .line 57
    :cond_2
    iget-object v3, p0, Lo21;->μ:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v3, Lvc;

    .line 60
    .line 61
    iget-object v4, p0, Lo21;->λ:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v4, Lg40;

    .line 64
    .line 65
    :try_start_1
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lo21;->λ:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p1, Lg40;

    .line 75
    .line 76
    iget-object v4, p0, Lo21;->ξ:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v4, Landroid/net/Uri;

    .line 79
    .line 80
    const/4 v8, 0x0

    .line 81
    invoke-virtual {v0, v4, v8, v6}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 82
    .line 83
    .line 84
    :try_start_2
    check-cast v3, Lwc;

    .line 85
    .line 86
    new-instance v4, Lvc;

    .line 87
    .line 88
    invoke-direct {v4, v3}, Lvc;-><init>(Lwc;)V

    .line 89
    .line 90
    .line 91
    :goto_0
    iput-object p1, p0, Lo21;->λ:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object v4, p0, Lo21;->μ:Ljava/lang/Object;

    .line 94
    .line 95
    iput v7, p0, Lo21;->κ:I

    .line 96
    .line 97
    invoke-virtual {v4, p0}, Lvc;->β(Lpp;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    if-ne v3, v5, :cond_4

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_4
    move-object v12, v4

    .line 105
    move-object v4, p1

    .line 106
    move-object p1, v3

    .line 107
    move-object v3, v12

    .line 108
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-eqz p1, :cond_5

    .line 115
    .line 116
    invoke-virtual {v3}, Lvc;->γ()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-object p1, v2

    .line 120
    check-cast p1, Landroid/content/Context;

    .line 121
    .line 122
    sget-object v8, Ldd2;->α:Lb21;

    .line 123
    .line 124
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    const-string v8, "animator_duration_scale"

    .line 129
    .line 130
    const/high16 v10, 0x3f800000    # 1.0f

    .line 131
    .line 132
    invoke-static {p1, v8, v10}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    new-instance v8, Ljava/lang/Float;

    .line 137
    .line 138
    invoke-direct {v8, p1}, Ljava/lang/Float;-><init>(F)V

    .line 139
    .line 140
    .line 141
    iput-object v4, p0, Lo21;->λ:Ljava/lang/Object;

    .line 142
    .line 143
    iput-object v3, p0, Lo21;->μ:Ljava/lang/Object;

    .line 144
    .line 145
    iput v9, p0, Lo21;->κ:I

    .line 146
    .line 147
    invoke-interface {v4, v8, p0}, Lg40;->δ(Ljava/lang/Object;Lop;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 151
    if-ne p1, v5, :cond_0

    .line 152
    .line 153
    :goto_2
    move-object v1, v5

    .line 154
    goto :goto_3

    .line 155
    :cond_5
    invoke-virtual {v0, v6}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 156
    .line 157
    .line 158
    :goto_3
    return-object v1

    .line 159
    :goto_4
    invoke-virtual {v0, v6}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 160
    .line 161
    .line 162
    throw p0

    .line 163
    :pswitch_0
    check-cast v6, Lp21;

    .line 164
    .line 165
    iget v0, p0, Lo21;->κ:I

    .line 166
    .line 167
    if-eqz v0, :cond_8

    .line 168
    .line 169
    if-eq v0, v7, :cond_7

    .line 170
    .line 171
    if-ne v0, v9, :cond_6

    .line 172
    .line 173
    iget-object v0, p0, Lo21;->λ:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v0, Lp21;

    .line 176
    .line 177
    iget-object v1, p0, Lo21;->μ:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v1, Lr21;

    .line 180
    .line 181
    iget-object p0, p0, Lo21;->ν:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast p0, Ln21;

    .line 184
    .line 185
    :try_start_3
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 186
    .line 187
    .line 188
    goto/16 :goto_b

    .line 189
    .line 190
    :catchall_1
    move-exception p1

    .line 191
    goto/16 :goto_e

    .line 192
    .line 193
    :cond_6
    invoke-static {v4}, Lγ;->ρ(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    move-object v5, v8

    .line 197
    goto/16 :goto_d

    .line 198
    .line 199
    :cond_7
    iget-object v0, p0, Lo21;->ξ:Ljava/lang/Object;

    .line 200
    .line 201
    move-object v6, v0

    .line 202
    check-cast v6, Lp21;

    .line 203
    .line 204
    iget-object v0, p0, Lo21;->λ:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v0, La80;

    .line 207
    .line 208
    iget-object v1, p0, Lo21;->μ:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v1, Lr21;

    .line 211
    .line 212
    iget-object v2, p0, Lo21;->ν:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v2, Ln21;

    .line 215
    .line 216
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    move-object v10, v0

    .line 220
    move-object v0, v2

    .line 221
    goto/16 :goto_a

    .line 222
    .line 223
    :cond_8
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    iget-object p1, p0, Lo21;->ν:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast p1, Lbq;

    .line 229
    .line 230
    new-instance v0, Ln21;

    .line 231
    .line 232
    check-cast v3, Lm21;

    .line 233
    .line 234
    invoke-interface {p1}, Lbq;->δ()Lup;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    sget-object v4, Lxn0;->ζ:Lxn0;

    .line 239
    .line 240
    invoke-interface {p1, v4}, Lup;->θ(Ltp;)Lsp;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    check-cast p1, Lfo0;

    .line 248
    .line 249
    invoke-direct {v0, v3, p1}, Ln21;-><init>(Lm21;Lfo0;)V

    .line 250
    .line 251
    .line 252
    iget-object p1, v6, Lp21;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 253
    .line 254
    :goto_5
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    check-cast v3, Ln21;

    .line 259
    .line 260
    if-eqz v3, :cond_a

    .line 261
    .line 262
    iget-object v4, v0, Ln21;->α:Lm21;

    .line 263
    .line 264
    iget-object v10, v3, Ln21;->α:Lm21;

    .line 265
    .line 266
    invoke-virtual {v4, v10}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 267
    .line 268
    .line 269
    move-result v4

    .line 270
    if-ltz v4, :cond_9

    .line 271
    .line 272
    goto :goto_6

    .line 273
    :cond_9
    new-instance p0, Ljava/util/concurrent/CancellationException;

    .line 274
    .line 275
    const-string p1, "Current mutation had a higher priority"

    .line 276
    .line 277
    invoke-direct {p0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    throw p0

    .line 281
    :cond_a
    :goto_6
    invoke-virtual {p1, v3, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v4

    .line 285
    if-eqz v4, :cond_17

    .line 286
    .line 287
    if-eqz v3, :cond_b

    .line 288
    .line 289
    iget-object p1, v3, Ln21;->β:Lfo0;

    .line 290
    .line 291
    new-instance v3, Lnf;

    .line 292
    .line 293
    const-string v4, "Mutation interrupted"

    .line 294
    .line 295
    invoke-direct {v3, v4, v9}, Lnf;-><init>(Ljava/lang/String;I)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {p1, v3}, Lfo0;->ν(Ljava/util/concurrent/CancellationException;)V

    .line 299
    .line 300
    .line 301
    :cond_b
    iget-object v4, v6, Lp21;->β:Lr21;

    .line 302
    .line 303
    move-object v10, v2

    .line 304
    check-cast v10, Ln3;

    .line 305
    .line 306
    iput-object v0, p0, Lo21;->ν:Ljava/lang/Object;

    .line 307
    .line 308
    iput-object v4, p0, Lo21;->μ:Ljava/lang/Object;

    .line 309
    .line 310
    iput-object v10, p0, Lo21;->λ:Ljava/lang/Object;

    .line 311
    .line 312
    iput-object v6, p0, Lo21;->ξ:Ljava/lang/Object;

    .line 313
    .line 314
    iput v7, p0, Lo21;->κ:I

    .line 315
    .line 316
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    sget-object v11, Lr21;->η:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 320
    .line 321
    :cond_c
    :goto_7
    sget-object p1, Lns1;->ζ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 322
    .line 323
    invoke-virtual {p1, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 324
    .line 325
    .line 326
    move-result v2

    .line 327
    if-le v2, v7, :cond_e

    .line 328
    .line 329
    :cond_d
    sget-object p1, Lns1;->ζ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 330
    .line 331
    invoke-virtual {p1, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    if-le v2, v7, :cond_c

    .line 336
    .line 337
    invoke-virtual {p1, v4, v2, v7}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 338
    .line 339
    .line 340
    move-result p1

    .line 341
    if-eqz p1, :cond_d

    .line 342
    .line 343
    goto :goto_7

    .line 344
    :cond_e
    if-gtz v2, :cond_10

    .line 345
    .line 346
    invoke-static {p0}, Lxb;->Θ(Lop;)Lop;

    .line 347
    .line 348
    .line 349
    move-result-object p1

    .line 350
    invoke-static {p1}, Lxb;->Δ(Lop;)Lae;

    .line 351
    .line 352
    .line 353
    move-result-object p1

    .line 354
    :try_start_4
    new-instance v2, Lq21;

    .line 355
    .line 356
    invoke-direct {v2, v4, p1}, Lq21;-><init>(Lr21;Lae;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v4, v2}, Lns1;->α(Lq21;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 360
    .line 361
    .line 362
    invoke-virtual {p1}, Lae;->σ()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object p1

    .line 366
    if-ne p1, v5, :cond_f

    .line 367
    .line 368
    goto :goto_8

    .line 369
    :cond_f
    move-object p1, v1

    .line 370
    :goto_8
    if-ne p1, v5, :cond_11

    .line 371
    .line 372
    move-object v1, p1

    .line 373
    goto :goto_9

    .line 374
    :catchall_2
    move-exception p0

    .line 375
    invoke-virtual {p1}, Lae;->Β()V

    .line 376
    .line 377
    .line 378
    throw p0

    .line 379
    :cond_10
    add-int/lit8 v3, v2, -0x1

    .line 380
    .line 381
    invoke-virtual {p1, v4, v2, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 382
    .line 383
    .line 384
    move-result p1

    .line 385
    if-eqz p1, :cond_c

    .line 386
    .line 387
    invoke-virtual {v11, v4, v8}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    :cond_11
    :goto_9
    if-ne v1, v5, :cond_12

    .line 391
    .line 392
    goto :goto_d

    .line 393
    :cond_12
    move-object v1, v4

    .line 394
    :goto_a
    :try_start_5
    iput-object v0, p0, Lo21;->ν:Ljava/lang/Object;

    .line 395
    .line 396
    iput-object v1, p0, Lo21;->μ:Ljava/lang/Object;

    .line 397
    .line 398
    iput-object v6, p0, Lo21;->λ:Ljava/lang/Object;

    .line 399
    .line 400
    iput-object v8, p0, Lo21;->ξ:Ljava/lang/Object;

    .line 401
    .line 402
    iput v9, p0, Lo21;->κ:I

    .line 403
    .line 404
    invoke-interface {v10, p0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 408
    if-ne p1, v5, :cond_13

    .line 409
    .line 410
    goto :goto_d

    .line 411
    :cond_13
    move-object p0, v0

    .line 412
    move-object v0, v6

    .line 413
    :goto_b
    :try_start_6
    iget-object v0, v0, Lp21;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 414
    .line 415
    :cond_14
    invoke-virtual {v0, p0, v8}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result v2

    .line 419
    if-eqz v2, :cond_15

    .line 420
    .line 421
    goto :goto_c

    .line 422
    :cond_15
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 426
    if-eq v2, p0, :cond_14

    .line 427
    .line 428
    :goto_c
    invoke-virtual {v1, v8}, Lr21;->γ(Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    move-object v5, p1

    .line 432
    :goto_d
    return-object v5

    .line 433
    :catchall_3
    move-exception p0

    .line 434
    goto :goto_10

    .line 435
    :catchall_4
    move-exception p1

    .line 436
    move-object p0, v0

    .line 437
    move-object v0, v6

    .line 438
    :goto_e
    :try_start_7
    iget-object v0, v0, Lp21;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 439
    .line 440
    :goto_f
    invoke-virtual {v0, p0, v8}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-result v2

    .line 444
    if-nez v2, :cond_16

    .line 445
    .line 446
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    if-ne v2, p0, :cond_16

    .line 451
    .line 452
    goto :goto_f

    .line 453
    :cond_16
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 454
    :goto_10
    invoke-virtual {v1, v8}, Lr21;->γ(Ljava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    throw p0

    .line 458
    :cond_17
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v4

    .line 462
    if-eq v4, v3, :cond_a

    .line 463
    .line 464
    goto/16 :goto_5

    .line 465
    .line 466
    nop

    .line 467
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
