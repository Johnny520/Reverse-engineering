.class public final synthetic Lwb/r9;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 26
    iput p10, p0, Lwb/r9;->g:I

    iput-object p1, p0, Lwb/r9;->h:Landroid/content/SharedPreferences;

    iput-object p2, p0, Lwb/r9;->i:Li0/a1;

    iput-object p3, p0, Lwb/r9;->j:Li0/a1;

    iput-object p4, p0, Lwb/r9;->k:Li0/a1;

    iput-object p5, p0, Lwb/r9;->l:Li0/a1;

    iput-object p6, p0, Lwb/r9;->m:Li0/a1;

    iput-object p7, p0, Lwb/r9;->n:Li0/a1;

    iput-object p8, p0, Lwb/r9;->o:Li0/a1;

    iput-object p9, p0, Lwb/r9;->p:Li0/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Landroid/content/SharedPreferences;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lwb/r9;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/r9;->i:Li0/a1;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/r9;->j:Li0/a1;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/r9;->k:Li0/a1;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/r9;->l:Li0/a1;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/r9;->m:Li0/a1;

    .line 16
    .line 17
    iput-object p6, p0, Lwb/r9;->n:Li0/a1;

    .line 18
    .line 19
    iput-object p7, p0, Lwb/r9;->o:Li0/a1;

    .line 20
    .line 21
    iput-object p8, p0, Lwb/r9;->h:Landroid/content/SharedPreferences;

    .line 22
    .line 23
    iput-object p9, p0, Lwb/r9;->p:Li0/a1;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/r9;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Lr/d;

    .line 11
    .line 12
    move-object/from16 v2, p2

    .line 13
    .line 14
    check-cast v2, Li0/h0;

    .line 15
    .line 16
    move-object/from16 v3, p3

    .line 17
    .line 18
    check-cast v3, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    and-int/lit8 v1, v3, 0x11

    .line 28
    .line 29
    const/16 v4, 0x10

    .line 30
    .line 31
    const/4 v5, 0x1

    .line 32
    if-eq v1, v4, :cond_0

    .line 33
    .line 34
    move v1, v5

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v1, 0x0

    .line 37
    :goto_0
    and-int/2addr v3, v5

    .line 38
    invoke-virtual {v2, v3, v1}, Li0/h0;->S(IZ)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    new-instance v6, Lwb/md;

    .line 45
    .line 46
    const/16 v16, 0x3

    .line 47
    .line 48
    iget-object v7, v0, Lwb/r9;->h:Landroid/content/SharedPreferences;

    .line 49
    .line 50
    iget-object v8, v0, Lwb/r9;->i:Li0/a1;

    .line 51
    .line 52
    iget-object v9, v0, Lwb/r9;->j:Li0/a1;

    .line 53
    .line 54
    iget-object v10, v0, Lwb/r9;->k:Li0/a1;

    .line 55
    .line 56
    iget-object v11, v0, Lwb/r9;->l:Li0/a1;

    .line 57
    .line 58
    iget-object v12, v0, Lwb/r9;->m:Li0/a1;

    .line 59
    .line 60
    iget-object v13, v0, Lwb/r9;->n:Li0/a1;

    .line 61
    .line 62
    iget-object v14, v0, Lwb/r9;->o:Li0/a1;

    .line 63
    .line 64
    iget-object v15, v0, Lwb/r9;->p:Li0/a1;

    .line 65
    .line 66
    invoke-direct/range {v6 .. v16}, Lwb/md;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 67
    .line 68
    .line 69
    const v1, -0x3a4cc5a5

    .line 70
    .line 71
    .line 72
    invoke-static {v1, v6, v2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    const/16 v3, 0x30

    .line 77
    .line 78
    const/4 v4, 0x0

    .line 79
    invoke-static {v4, v1, v2, v3, v5}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 84
    .line 85
    .line 86
    :goto_1
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 87
    .line 88
    return-object v1

    .line 89
    :pswitch_0
    move-object/from16 v1, p1

    .line 90
    .line 91
    check-cast v1, Lr/d;

    .line 92
    .line 93
    move-object/from16 v2, p2

    .line 94
    .line 95
    check-cast v2, Li0/h0;

    .line 96
    .line 97
    move-object/from16 v3, p3

    .line 98
    .line 99
    check-cast v3, Ljava/lang/Integer;

    .line 100
    .line 101
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    and-int/lit8 v1, v3, 0x11

    .line 109
    .line 110
    const/16 v4, 0x10

    .line 111
    .line 112
    const/4 v5, 0x1

    .line 113
    if-eq v1, v4, :cond_2

    .line 114
    .line 115
    move v1, v5

    .line 116
    goto :goto_2

    .line 117
    :cond_2
    const/4 v1, 0x0

    .line 118
    :goto_2
    and-int/2addr v3, v5

    .line 119
    invoke-virtual {v2, v3, v1}, Li0/h0;->S(IZ)Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-eqz v1, :cond_3

    .line 124
    .line 125
    new-instance v6, Lwb/md;

    .line 126
    .line 127
    iget-object v7, v0, Lwb/r9;->i:Li0/a1;

    .line 128
    .line 129
    iget-object v8, v0, Lwb/r9;->j:Li0/a1;

    .line 130
    .line 131
    iget-object v9, v0, Lwb/r9;->k:Li0/a1;

    .line 132
    .line 133
    iget-object v10, v0, Lwb/r9;->l:Li0/a1;

    .line 134
    .line 135
    iget-object v11, v0, Lwb/r9;->m:Li0/a1;

    .line 136
    .line 137
    iget-object v12, v0, Lwb/r9;->n:Li0/a1;

    .line 138
    .line 139
    iget-object v13, v0, Lwb/r9;->o:Li0/a1;

    .line 140
    .line 141
    iget-object v14, v0, Lwb/r9;->h:Landroid/content/SharedPreferences;

    .line 142
    .line 143
    iget-object v15, v0, Lwb/r9;->p:Li0/a1;

    .line 144
    .line 145
    invoke-direct/range {v6 .. v15}, Lwb/md;-><init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Landroid/content/SharedPreferences;Li0/a1;)V

    .line 146
    .line 147
    .line 148
    const v1, -0xc68d67b

    .line 149
    .line 150
    .line 151
    invoke-static {v1, v6, v2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    const/16 v3, 0x30

    .line 156
    .line 157
    const/4 v4, 0x0

    .line 158
    invoke-static {v4, v1, v2, v3, v5}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_3
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 163
    .line 164
    .line 165
    :goto_3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 166
    .line 167
    return-object v1

    .line 168
    :pswitch_1
    move-object/from16 v1, p1

    .line 169
    .line 170
    check-cast v1, Lr/d;

    .line 171
    .line 172
    move-object/from16 v2, p2

    .line 173
    .line 174
    check-cast v2, Li0/h0;

    .line 175
    .line 176
    move-object/from16 v3, p3

    .line 177
    .line 178
    check-cast v3, Ljava/lang/Integer;

    .line 179
    .line 180
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    and-int/lit8 v1, v3, 0x11

    .line 188
    .line 189
    const/16 v4, 0x10

    .line 190
    .line 191
    const/4 v5, 0x1

    .line 192
    if-eq v1, v4, :cond_4

    .line 193
    .line 194
    move v1, v5

    .line 195
    goto :goto_4

    .line 196
    :cond_4
    const/4 v1, 0x0

    .line 197
    :goto_4
    and-int/2addr v3, v5

    .line 198
    invoke-virtual {v2, v3, v1}, Li0/h0;->S(IZ)Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    if-eqz v1, :cond_5

    .line 203
    .line 204
    new-instance v6, Lwb/md;

    .line 205
    .line 206
    const/16 v16, 0x1

    .line 207
    .line 208
    iget-object v7, v0, Lwb/r9;->h:Landroid/content/SharedPreferences;

    .line 209
    .line 210
    iget-object v8, v0, Lwb/r9;->i:Li0/a1;

    .line 211
    .line 212
    iget-object v9, v0, Lwb/r9;->j:Li0/a1;

    .line 213
    .line 214
    iget-object v10, v0, Lwb/r9;->k:Li0/a1;

    .line 215
    .line 216
    iget-object v11, v0, Lwb/r9;->l:Li0/a1;

    .line 217
    .line 218
    iget-object v12, v0, Lwb/r9;->m:Li0/a1;

    .line 219
    .line 220
    iget-object v13, v0, Lwb/r9;->n:Li0/a1;

    .line 221
    .line 222
    iget-object v14, v0, Lwb/r9;->o:Li0/a1;

    .line 223
    .line 224
    iget-object v15, v0, Lwb/r9;->p:Li0/a1;

    .line 225
    .line 226
    invoke-direct/range {v6 .. v16}, Lwb/md;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 227
    .line 228
    .line 229
    const v1, -0x2e3882ea

    .line 230
    .line 231
    .line 232
    invoke-static {v1, v6, v2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    const/16 v3, 0x30

    .line 237
    .line 238
    const/4 v4, 0x0

    .line 239
    invoke-static {v4, v1, v2, v3, v5}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 240
    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_5
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 244
    .line 245
    .line 246
    :goto_5
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 247
    .line 248
    return-object v1

    .line 249
    :pswitch_2
    move-object/from16 v1, p1

    .line 250
    .line 251
    check-cast v1, Lr/d;

    .line 252
    .line 253
    move-object/from16 v2, p2

    .line 254
    .line 255
    check-cast v2, Li0/h0;

    .line 256
    .line 257
    move-object/from16 v3, p3

    .line 258
    .line 259
    check-cast v3, Ljava/lang/Integer;

    .line 260
    .line 261
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    and-int/lit8 v1, v3, 0x11

    .line 269
    .line 270
    const/16 v4, 0x10

    .line 271
    .line 272
    const/4 v5, 0x1

    .line 273
    if-eq v1, v4, :cond_6

    .line 274
    .line 275
    move v1, v5

    .line 276
    goto :goto_6

    .line 277
    :cond_6
    const/4 v1, 0x0

    .line 278
    :goto_6
    and-int/2addr v3, v5

    .line 279
    invoke-virtual {v2, v3, v1}, Li0/h0;->S(IZ)Z

    .line 280
    .line 281
    .line 282
    move-result v1

    .line 283
    if-eqz v1, :cond_7

    .line 284
    .line 285
    new-instance v6, Lwb/md;

    .line 286
    .line 287
    const/16 v16, 0x0

    .line 288
    .line 289
    iget-object v7, v0, Lwb/r9;->h:Landroid/content/SharedPreferences;

    .line 290
    .line 291
    iget-object v8, v0, Lwb/r9;->i:Li0/a1;

    .line 292
    .line 293
    iget-object v9, v0, Lwb/r9;->j:Li0/a1;

    .line 294
    .line 295
    iget-object v10, v0, Lwb/r9;->k:Li0/a1;

    .line 296
    .line 297
    iget-object v11, v0, Lwb/r9;->l:Li0/a1;

    .line 298
    .line 299
    iget-object v12, v0, Lwb/r9;->m:Li0/a1;

    .line 300
    .line 301
    iget-object v13, v0, Lwb/r9;->n:Li0/a1;

    .line 302
    .line 303
    iget-object v14, v0, Lwb/r9;->o:Li0/a1;

    .line 304
    .line 305
    iget-object v15, v0, Lwb/r9;->p:Li0/a1;

    .line 306
    .line 307
    invoke-direct/range {v6 .. v16}, Lwb/md;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 308
    .line 309
    .line 310
    const v1, 0x7bfd5bc9

    .line 311
    .line 312
    .line 313
    invoke-static {v1, v6, v2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    const/16 v3, 0x30

    .line 318
    .line 319
    const/4 v4, 0x0

    .line 320
    invoke-static {v4, v1, v2, v3, v5}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 321
    .line 322
    .line 323
    goto :goto_7

    .line 324
    :cond_7
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 325
    .line 326
    .line 327
    :goto_7
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 328
    .line 329
    return-object v1

    .line 330
    nop

    .line 331
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
