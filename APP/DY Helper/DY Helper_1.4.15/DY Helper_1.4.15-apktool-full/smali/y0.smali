.class public final Ly0;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Ly0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Ly0;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Ly0;->η:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Ly0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ly0;->ζ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/compose/ui/platform/AbstractComposeView;

    .line 9
    .line 10
    iget-object p0, p0, Ly0;->η:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lc92;

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 15
    .line 16
    .line 17
    sget-object p0, Ls62;->α:Ls62;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_0
    iget-object v0, p0, Ly0;->ζ:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, La80;

    .line 23
    .line 24
    sget-object v1, Lq31;->Σ:Lio1;

    .line 25
    .line 26
    invoke-interface {v0, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Ly0;->η:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, Lq31;

    .line 32
    .line 33
    iget-object v0, p0, Lq31;->Ι:Liv1;

    .line 34
    .line 35
    iget-object v2, v1, Lio1;->ξ:Liv1;

    .line 36
    .line 37
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-boolean v2, p0, Lq31;->Κ:Z

    .line 42
    .line 43
    iget-boolean v3, v1, Lio1;->ο:Z

    .line 44
    .line 45
    const/4 v4, 0x1

    .line 46
    if-eq v2, v3, :cond_0

    .line 47
    .line 48
    move v2, v4

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    const/4 v2, 0x0

    .line 51
    :goto_0
    if-eqz v0, :cond_1

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    :cond_1
    iget-object v5, v1, Lio1;->ξ:Liv1;

    .line 56
    .line 57
    iput-object v5, p0, Lq31;->Ι:Liv1;

    .line 58
    .line 59
    iput-boolean v3, p0, Lq31;->Κ:Z

    .line 60
    .line 61
    iget-boolean v5, p0, Lq31;->Λ:Z

    .line 62
    .line 63
    if-eqz v5, :cond_3

    .line 64
    .line 65
    if-nez v2, :cond_2

    .line 66
    .line 67
    if-eqz v3, :cond_3

    .line 68
    .line 69
    if-nez v0, :cond_3

    .line 70
    .line 71
    :cond_2
    iget-object v0, p0, Lq31;->σ:Lyp0;

    .line 72
    .line 73
    invoke-virtual {v0}, Lyp0;->Ε()V

    .line 74
    .line 75
    .line 76
    :cond_3
    iput-boolean v4, p0, Lq31;->Λ:Z

    .line 77
    .line 78
    iget-object p0, v1, Lio1;->ξ:Liv1;

    .line 79
    .line 80
    iget-wide v2, v1, Lio1;->ρ:J

    .line 81
    .line 82
    iget-object v0, v1, Lio1;->τ:Lnp0;

    .line 83
    .line 84
    iget-object v4, v1, Lio1;->σ:Lyr;

    .line 85
    .line 86
    invoke-interface {p0, v2, v3, v0, v4}, Liv1;->α(JLnp0;Lyr;)Lu81;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    iput-object p0, v1, Lio1;->χ:Lu81;

    .line 91
    .line 92
    sget-object p0, Ls62;->α:Ls62;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_1
    iget-object v0, p0, Ly0;->ζ:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, Lyp0;

    .line 98
    .line 99
    iget-object v0, v0, Lyp0;->Κ:Lk31;

    .line 100
    .line 101
    iget-object p0, p0, Ly0;->η:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p0, Lum1;

    .line 104
    .line 105
    iget-object v1, v0, Lk31;->ζ:Lq01;

    .line 106
    .line 107
    iget v1, v1, Lq01;->θ:I

    .line 108
    .line 109
    and-int/lit8 v1, v1, 0x8

    .line 110
    .line 111
    if-eqz v1, :cond_e

    .line 112
    .line 113
    iget-object v0, v0, Lk31;->ε:Lq22;

    .line 114
    .line 115
    :goto_1
    if-eqz v0, :cond_e

    .line 116
    .line 117
    iget v1, v0, Lq01;->η:I

    .line 118
    .line 119
    and-int/lit8 v1, v1, 0x8

    .line 120
    .line 121
    if-eqz v1, :cond_d

    .line 122
    .line 123
    const/4 v1, 0x0

    .line 124
    move-object v2, v0

    .line 125
    move-object v3, v1

    .line 126
    :goto_2
    if-eqz v2, :cond_d

    .line 127
    .line 128
    instance-of v4, v2, Lzr1;

    .line 129
    .line 130
    const/4 v5, 0x1

    .line 131
    if-eqz v4, :cond_6

    .line 132
    .line 133
    check-cast v2, Lzr1;

    .line 134
    .line 135
    invoke-interface {v2}, Lzr1;->з()Z

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    if-eqz v4, :cond_4

    .line 140
    .line 141
    new-instance v4, Lxr1;

    .line 142
    .line 143
    invoke-direct {v4}, Lxr1;-><init>()V

    .line 144
    .line 145
    .line 146
    iput-object v4, p0, Lum1;->ε:Ljava/lang/Object;

    .line 147
    .line 148
    iput-boolean v5, v4, Lxr1;->θ:Z

    .line 149
    .line 150
    :cond_4
    invoke-interface {v2}, Lzr1;->й()Z

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    if-eqz v4, :cond_5

    .line 155
    .line 156
    iget-object v4, p0, Lum1;->ε:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v4, Lxr1;

    .line 159
    .line 160
    iput-boolean v5, v4, Lxr1;->η:Z

    .line 161
    .line 162
    :cond_5
    iget-object v4, p0, Lum1;->ε:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v4, Ljs1;

    .line 165
    .line 166
    invoke-interface {v2, v4}, Lzr1;->Ω(Ljs1;)V

    .line 167
    .line 168
    .line 169
    goto :goto_5

    .line 170
    :cond_6
    iget v4, v2, Lq01;->η:I

    .line 171
    .line 172
    and-int/lit8 v4, v4, 0x8

    .line 173
    .line 174
    if-eqz v4, :cond_c

    .line 175
    .line 176
    instance-of v4, v2, Lya;

    .line 177
    .line 178
    if-eqz v4, :cond_c

    .line 179
    .line 180
    move-object v4, v2

    .line 181
    check-cast v4, Lya;

    .line 182
    .line 183
    iget-object v4, v4, Lya;->υ:Lq01;

    .line 184
    .line 185
    const/4 v6, 0x0

    .line 186
    :goto_3
    if-eqz v4, :cond_b

    .line 187
    .line 188
    iget v7, v4, Lq01;->η:I

    .line 189
    .line 190
    and-int/lit8 v7, v7, 0x8

    .line 191
    .line 192
    if-eqz v7, :cond_a

    .line 193
    .line 194
    add-int/lit8 v6, v6, 0x1

    .line 195
    .line 196
    if-ne v6, v5, :cond_7

    .line 197
    .line 198
    move-object v2, v4

    .line 199
    goto :goto_4

    .line 200
    :cond_7
    if-nez v3, :cond_8

    .line 201
    .line 202
    new-instance v3, Lk21;

    .line 203
    .line 204
    const/16 v7, 0x10

    .line 205
    .line 206
    new-array v7, v7, [Lq01;

    .line 207
    .line 208
    invoke-direct {v3, v7}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    :cond_8
    if-eqz v2, :cond_9

    .line 212
    .line 213
    invoke-virtual {v3, v2}, Lk21;->β(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    move-object v2, v1

    .line 217
    :cond_9
    invoke-virtual {v3, v4}, Lk21;->β(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    :cond_a
    :goto_4
    iget-object v4, v4, Lq01;->κ:Lq01;

    .line 221
    .line 222
    goto :goto_3

    .line 223
    :cond_b
    if-ne v6, v5, :cond_c

    .line 224
    .line 225
    goto :goto_2

    .line 226
    :cond_c
    :goto_5
    invoke-static {v3}, Lh62;->γ(Lk21;)Lq01;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    goto :goto_2

    .line 231
    :cond_d
    iget-object v0, v0, Lq01;->ι:Lq01;

    .line 232
    .line 233
    goto :goto_1

    .line 234
    :cond_e
    sget-object p0, Ls62;->α:Ls62;

    .line 235
    .line 236
    return-object p0

    .line 237
    :pswitch_2
    iget-object v0, p0, Ly0;->ζ:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v0, Lke0;

    .line 240
    .line 241
    iget-object p0, p0, Ly0;->η:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast p0, Lq01;

    .line 244
    .line 245
    invoke-virtual {v0, p0}, Lke0;->δ(Lq01;)V

    .line 246
    .line 247
    .line 248
    sget-object p0, Ls62;->α:Ls62;

    .line 249
    .line 250
    return-object p0

    .line 251
    :pswitch_3
    iget-object v0, p0, Ly0;->ζ:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v0, Lum1;

    .line 254
    .line 255
    iget-object p0, p0, Ly0;->η:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast p0, Lc50;

    .line 258
    .line 259
    invoke-virtual {p0}, Lc50;->Д()Lz40;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    iput-object p0, v0, Lum1;->ε:Ljava/lang/Object;

    .line 264
    .line 265
    sget-object p0, Ls62;->α:Ls62;

    .line 266
    .line 267
    return-object p0

    .line 268
    :pswitch_4
    iget-object v0, p0, Ly0;->ζ:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v0, Lgd;

    .line 271
    .line 272
    iget-object v0, v0, Lgd;->φ:Lθ;

    .line 273
    .line 274
    iget-object p0, p0, Ly0;->η:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast p0, Lhd;

    .line 277
    .line 278
    invoke-virtual {v0, p0}, Lθ;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    sget-object p0, Ls62;->α:Ls62;

    .line 282
    .line 283
    return-object p0

    .line 284
    :pswitch_5
    iget-object v0, p0, Ly0;->ζ:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 287
    .line 288
    iget-object p0, p0, Ly0;->η:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast p0, Landroid/view/MotionEvent;

    .line 291
    .line 292
    invoke-static {p0, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->β(Landroid/view/MotionEvent;Landroidx/compose/ui/platform/AndroidComposeView;)Z

    .line 293
    .line 294
    .line 295
    move-result p0

    .line 296
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    return-object p0

    .line 301
    :pswitch_6
    iget-object v0, p0, Ly0;->ζ:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 304
    .line 305
    iget-object p0, p0, Ly0;->η:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast p0, Landroid/view/KeyEvent;

    .line 308
    .line 309
    invoke-static {v0, p0}, Landroidx/compose/ui/platform/AndroidComposeView;->γ(Landroidx/compose/ui/platform/AndroidComposeView;Landroid/view/KeyEvent;)Z

    .line 310
    .line 311
    .line 312
    move-result p0

    .line 313
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 314
    .line 315
    .line 316
    move-result-object p0

    .line 317
    return-object p0

    .line 318
    nop

    .line 319
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
