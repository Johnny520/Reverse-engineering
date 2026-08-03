.class public final Lci/e;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lfg/l;Ljava/util/concurrent/atomic/AtomicReference;Lfg/p;Lwf/c;)V
    .locals 1

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    iput v0, p0, Lci/e;->h:I

    .line 4
    .line 5
    check-cast p1, Lgg/m;

    .line 6
    .line 7
    iput-object p1, p0, Lci/e;->k:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lci/e;->l:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lci/e;->m:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p4}, Lyf/i;-><init>(ILwf/c;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Lh0/p;Lfg/p;Lwf/c;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lci/e;->h:I

    .line 18
    iput-object p1, p0, Lci/e;->l:Ljava/lang/Object;

    check-cast p2, Lyf/i;

    iput-object p2, p0, Lci/e;->m:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method

.method public constructor <init>(Li0/a1;Li/g0;Lwf/c;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lci/e;->h:I

    .line 19
    iput-object p1, p0, Lci/e;->l:Ljava/lang/Object;

    iput-object p2, p0, Lci/e;->m:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V
    .locals 0

    .line 20
    iput p6, p0, Lci/e;->h:I

    iput-object p1, p0, Lci/e;->j:Ljava/lang/Object;

    iput-object p2, p0, Lci/e;->k:Ljava/lang/Object;

    iput-object p3, p0, Lci/e;->l:Ljava/lang/Object;

    iput-object p4, p0, Lci/e;->m:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V
    .locals 0

    .line 21
    iput p5, p0, Lci/e;->h:I

    iput-object p1, p0, Lci/e;->k:Ljava/lang/Object;

    iput-object p2, p0, Lci/e;->l:Ljava/lang/Object;

    iput-object p3, p0, Lci/e;->m:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method

.method public constructor <init>(Lm/d3;Lwf/c;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lci/e;->h:I

    .line 22
    iput-object p1, p0, Lci/e;->m:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 9

    .line 1
    iget v0, p0, Lci/e;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, Lci/e;

    .line 7
    .line 8
    iget-object p1, p0, Lci/e;->j:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v2, p1

    .line 11
    check-cast v2, Lgg/u;

    .line 12
    .line 13
    iget-object p1, p0, Lci/e;->k:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v3, p1

    .line 16
    check-cast v3, Li0/y1;

    .line 17
    .line 18
    iget-object p1, p0, Lci/e;->l:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v4, p1

    .line 21
    check-cast v4, Landroidx/lifecycle/q;

    .line 22
    .line 23
    iget-object p1, p0, Lci/e;->m:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v5, p1

    .line 26
    check-cast v5, Lb/d;

    .line 27
    .line 28
    const/16 v7, 0xd

    .line 29
    .line 30
    move-object v6, p2

    .line 31
    invoke-direct/range {v1 .. v7}, Lci/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :pswitch_0
    move-object v6, p2

    .line 36
    new-instance p2, Lci/e;

    .line 37
    .line 38
    iget-object v0, p0, Lci/e;->k:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Lgg/m;

    .line 41
    .line 42
    iget-object v1, p0, Lci/e;->l:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 45
    .line 46
    iget-object v2, p0, Lci/e;->m:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Lfg/p;

    .line 49
    .line 50
    invoke-direct {p2, v0, v1, v2, v6}, Lci/e;-><init>(Lfg/l;Ljava/util/concurrent/atomic/AtomicReference;Lfg/p;Lwf/c;)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p2, Lci/e;->j:Ljava/lang/Object;

    .line 54
    .line 55
    return-object p2

    .line 56
    :pswitch_1
    move-object v6, p2

    .line 57
    new-instance v2, Lci/e;

    .line 58
    .line 59
    iget-object p1, p0, Lci/e;->j:Ljava/lang/Object;

    .line 60
    .line 61
    move-object v3, p1

    .line 62
    check-cast v3, Lr/z;

    .line 63
    .line 64
    iget-object p1, p0, Lci/e;->k:Ljava/lang/Object;

    .line 65
    .line 66
    move-object v4, p1

    .line 67
    check-cast v4, Ljava/util/List;

    .line 68
    .line 69
    iget-object p1, p0, Lci/e;->l:Ljava/lang/Object;

    .line 70
    .line 71
    move-object v5, p1

    .line 72
    check-cast v5, Li0/a1;

    .line 73
    .line 74
    iget-object p1, p0, Lci/e;->m:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p1, Li0/a1;

    .line 77
    .line 78
    const/16 v8, 0xb

    .line 79
    .line 80
    move-object v7, v6

    .line 81
    move-object v6, p1

    .line 82
    invoke-direct/range {v2 .. v8}, Lci/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 83
    .line 84
    .line 85
    return-object v2

    .line 86
    :pswitch_2
    move-object v6, p2

    .line 87
    new-instance v2, Lci/e;

    .line 88
    .line 89
    iget-object p1, p0, Lci/e;->j:Ljava/lang/Object;

    .line 90
    .line 91
    move-object v3, p1

    .line 92
    check-cast v3, Ljava/util/List;

    .line 93
    .line 94
    iget-object p1, p0, Lci/e;->k:Ljava/lang/Object;

    .line 95
    .line 96
    move-object v4, p1

    .line 97
    check-cast v4, Lr/z;

    .line 98
    .line 99
    iget-object p1, p0, Lci/e;->l:Ljava/lang/Object;

    .line 100
    .line 101
    move-object v5, p1

    .line 102
    check-cast v5, Ljava/util/List;

    .line 103
    .line 104
    iget-object p1, p0, Lci/e;->m:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast p1, Li0/a1;

    .line 107
    .line 108
    const/16 v8, 0xa

    .line 109
    .line 110
    move-object v7, v6

    .line 111
    move-object v6, p1

    .line 112
    invoke-direct/range {v2 .. v8}, Lci/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 113
    .line 114
    .line 115
    return-object v2

    .line 116
    :pswitch_3
    move-object v6, p2

    .line 117
    new-instance v2, Lci/e;

    .line 118
    .line 119
    iget-object p1, p0, Lci/e;->k:Ljava/lang/Object;

    .line 120
    .line 121
    move-object v3, p1

    .line 122
    check-cast v3, Landroid/content/Context;

    .line 123
    .line 124
    iget-object p1, p0, Lci/e;->l:Ljava/lang/Object;

    .line 125
    .line 126
    move-object v4, p1

    .line 127
    check-cast v4, Lx8/a;

    .line 128
    .line 129
    iget-object p1, p0, Lci/e;->m:Ljava/lang/Object;

    .line 130
    .line 131
    move-object v5, p1

    .line 132
    check-cast v5, Li0/a1;

    .line 133
    .line 134
    const/16 v7, 0x9

    .line 135
    .line 136
    invoke-direct/range {v2 .. v7}, Lci/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 137
    .line 138
    .line 139
    return-object v2

    .line 140
    :pswitch_4
    move-object v6, p2

    .line 141
    new-instance v2, Lci/e;

    .line 142
    .line 143
    iget-object p1, p0, Lci/e;->j:Ljava/lang/Object;

    .line 144
    .line 145
    move-object v3, p1

    .line 146
    check-cast v3, Ltg/y;

    .line 147
    .line 148
    iget-object p1, p0, Lci/e;->k:Ljava/lang/Object;

    .line 149
    .line 150
    move-object v4, p1

    .line 151
    check-cast v4, Ltg/d;

    .line 152
    .line 153
    iget-object p1, p0, Lci/e;->l:Ljava/lang/Object;

    .line 154
    .line 155
    move-object v5, p1

    .line 156
    check-cast v5, Ltg/b0;

    .line 157
    .line 158
    iget-object p1, p0, Lci/e;->m:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast p1, Ljava/lang/Float;

    .line 161
    .line 162
    const/16 v8, 0x8

    .line 163
    .line 164
    move-object v7, v6

    .line 165
    move-object v6, p1

    .line 166
    invoke-direct/range {v2 .. v8}, Lci/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 167
    .line 168
    .line 169
    return-object v2

    .line 170
    :pswitch_5
    move-object v6, p2

    .line 171
    new-instance v2, Lci/e;

    .line 172
    .line 173
    iget-object p2, p0, Lci/e;->k:Ljava/lang/Object;

    .line 174
    .line 175
    move-object v3, p2

    .line 176
    check-cast v3, Ltg/d;

    .line 177
    .line 178
    iget-object p2, p0, Lci/e;->l:Ljava/lang/Object;

    .line 179
    .line 180
    move-object v4, p2

    .line 181
    check-cast v4, Ltg/b0;

    .line 182
    .line 183
    iget-object p2, p0, Lci/e;->m:Ljava/lang/Object;

    .line 184
    .line 185
    move-object v5, p2

    .line 186
    check-cast v5, Ljava/lang/Float;

    .line 187
    .line 188
    const/4 v7, 0x7

    .line 189
    invoke-direct/range {v2 .. v7}, Lci/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 190
    .line 191
    .line 192
    iput-object p1, v2, Lci/e;->j:Ljava/lang/Object;

    .line 193
    .line 194
    return-object v2

    .line 195
    :pswitch_6
    move-object v6, p2

    .line 196
    new-instance p2, Lci/e;

    .line 197
    .line 198
    iget-object v0, p0, Lci/e;->m:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v0, Lm/d3;

    .line 201
    .line 202
    invoke-direct {p2, v0, v6}, Lci/e;-><init>(Lm/d3;Lwf/c;)V

    .line 203
    .line 204
    .line 205
    iput-object p1, p2, Lci/e;->j:Ljava/lang/Object;

    .line 206
    .line 207
    return-object p2

    .line 208
    :pswitch_7
    move-object v6, p2

    .line 209
    new-instance p2, Lci/e;

    .line 210
    .line 211
    iget-object v0, p0, Lci/e;->l:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v0, Li0/a1;

    .line 214
    .line 215
    iget-object v1, p0, Lci/e;->m:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v1, Li/g0;

    .line 218
    .line 219
    invoke-direct {p2, v0, v1, v6}, Lci/e;-><init>(Li0/a1;Li/g0;Lwf/c;)V

    .line 220
    .line 221
    .line 222
    iput-object p1, p2, Lci/e;->j:Ljava/lang/Object;

    .line 223
    .line 224
    return-object p2

    .line 225
    :pswitch_8
    move-object v6, p2

    .line 226
    new-instance v2, Lci/e;

    .line 227
    .line 228
    iget-object v3, p0, Lci/e;->j:Ljava/lang/Object;

    .line 229
    .line 230
    iget-object p1, p0, Lci/e;->k:Ljava/lang/Object;

    .line 231
    .line 232
    move-object v4, p1

    .line 233
    check-cast v4, Li/c;

    .line 234
    .line 235
    iget-object p1, p0, Lci/e;->l:Ljava/lang/Object;

    .line 236
    .line 237
    move-object v5, p1

    .line 238
    check-cast v5, Li0/a1;

    .line 239
    .line 240
    iget-object p1, p0, Lci/e;->m:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast p1, Li0/a1;

    .line 243
    .line 244
    const/4 v8, 0x4

    .line 245
    move-object v7, v6

    .line 246
    move-object v6, p1

    .line 247
    invoke-direct/range {v2 .. v8}, Lci/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 248
    .line 249
    .line 250
    return-object v2

    .line 251
    :pswitch_9
    move-object v6, p2

    .line 252
    new-instance p1, Lci/e;

    .line 253
    .line 254
    iget-object p2, p0, Lci/e;->l:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast p2, Lh0/p;

    .line 257
    .line 258
    iget-object v0, p0, Lci/e;->m:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v0, Lyf/i;

    .line 261
    .line 262
    invoke-direct {p1, p2, v0, v6}, Lci/e;-><init>(Lh0/p;Lfg/p;Lwf/c;)V

    .line 263
    .line 264
    .line 265
    return-object p1

    .line 266
    :pswitch_a
    move-object v6, p2

    .line 267
    new-instance v2, Lci/e;

    .line 268
    .line 269
    iget-object p2, p0, Lci/e;->k:Ljava/lang/Object;

    .line 270
    .line 271
    move-object v3, p2

    .line 272
    check-cast v3, Lfg/l;

    .line 273
    .line 274
    iget-object p2, p0, Lci/e;->l:Ljava/lang/Object;

    .line 275
    .line 276
    move-object v4, p2

    .line 277
    check-cast v4, Lf0/c;

    .line 278
    .line 279
    iget-object p2, p0, Lci/e;->m:Ljava/lang/Object;

    .line 280
    .line 281
    move-object v5, p2

    .line 282
    check-cast v5, Lf0/p;

    .line 283
    .line 284
    const/4 v7, 0x2

    .line 285
    invoke-direct/range {v2 .. v7}, Lci/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 286
    .line 287
    .line 288
    iput-object p1, v2, Lci/e;->j:Ljava/lang/Object;

    .line 289
    .line 290
    return-object v2

    .line 291
    :pswitch_b
    move-object v6, p2

    .line 292
    new-instance v2, Lci/e;

    .line 293
    .line 294
    iget-object p1, p0, Lci/e;->j:Ljava/lang/Object;

    .line 295
    .line 296
    move-object v3, p1

    .line 297
    check-cast v3, Le2/c;

    .line 298
    .line 299
    iget-object p1, p0, Lci/e;->k:Ljava/lang/Object;

    .line 300
    .line 301
    move-object v4, p1

    .line 302
    check-cast v4, Landroid/view/ScrollCaptureSession;

    .line 303
    .line 304
    iget-object p1, p0, Lci/e;->l:Ljava/lang/Object;

    .line 305
    .line 306
    move-object v5, p1

    .line 307
    check-cast v5, Landroid/graphics/Rect;

    .line 308
    .line 309
    iget-object p1, p0, Lci/e;->m:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast p1, Ljava/util/function/Consumer;

    .line 312
    .line 313
    const/4 v8, 0x1

    .line 314
    move-object v7, v6

    .line 315
    move-object v6, p1

    .line 316
    invoke-direct/range {v2 .. v8}, Lci/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 317
    .line 318
    .line 319
    return-object v2

    .line 320
    :pswitch_c
    move-object v6, p2

    .line 321
    new-instance v2, Lci/e;

    .line 322
    .line 323
    iget-object p2, p0, Lci/e;->k:Ljava/lang/Object;

    .line 324
    .line 325
    move-object v3, p2

    .line 326
    check-cast v3, Ls1/x;

    .line 327
    .line 328
    iget-object p2, p0, Lci/e;->l:Ljava/lang/Object;

    .line 329
    .line 330
    move-object v4, p2

    .line 331
    check-cast v4, Lci/l0;

    .line 332
    .line 333
    iget-object p2, p0, Lci/e;->m:Ljava/lang/Object;

    .line 334
    .line 335
    move-object v5, p2

    .line 336
    check-cast v5, Lci/f;

    .line 337
    .line 338
    const/4 v7, 0x0

    .line 339
    invoke-direct/range {v2 .. v7}, Lci/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 340
    .line 341
    .line 342
    iput-object p1, v2, Lci/e;->j:Ljava/lang/Object;

    .line 343
    .line 344
    return-object v2

    .line 345
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lci/e;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lqg/t;

    .line 7
    .line 8
    check-cast p2, Lwf/c;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lci/e;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lci/e;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lci/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    check-cast p1, Lqg/t;

    .line 24
    .line 25
    check-cast p2, Lwf/c;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Lci/e;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lci/e;

    .line 32
    .line 33
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lci/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :pswitch_1
    check-cast p1, Lqg/t;

    .line 41
    .line 42
    check-cast p2, Lwf/c;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, Lci/e;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Lci/e;

    .line 49
    .line 50
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Lci/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :pswitch_2
    check-cast p1, Lqg/t;

    .line 58
    .line 59
    check-cast p2, Lwf/c;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, Lci/e;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Lci/e;

    .line 66
    .line 67
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 68
    .line 69
    invoke-virtual {p1, p2}, Lci/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :pswitch_3
    check-cast p1, Lqg/t;

    .line 75
    .line 76
    check-cast p2, Lwf/c;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, Lci/e;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, Lci/e;

    .line 83
    .line 84
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 85
    .line 86
    invoke-virtual {p1, p2}, Lci/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    return-object p1

    .line 91
    :pswitch_4
    check-cast p1, Lqg/t;

    .line 92
    .line 93
    check-cast p2, Lwf/c;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, Lci/e;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    check-cast p1, Lci/e;

    .line 100
    .line 101
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 102
    .line 103
    invoke-virtual {p1, p2}, Lci/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    return-object p1

    .line 108
    :pswitch_5
    check-cast p1, Ltg/u;

    .line 109
    .line 110
    check-cast p2, Lwf/c;

    .line 111
    .line 112
    invoke-virtual {p0, p1, p2}, Lci/e;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    check-cast p1, Lci/e;

    .line 117
    .line 118
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 119
    .line 120
    invoke-virtual {p1, p2}, Lci/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    return-object p1

    .line 125
    :pswitch_6
    check-cast p1, Lqg/t;

    .line 126
    .line 127
    check-cast p2, Lwf/c;

    .line 128
    .line 129
    invoke-virtual {p0, p1, p2}, Lci/e;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    check-cast p1, Lci/e;

    .line 134
    .line 135
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 136
    .line 137
    invoke-virtual {p1, p2}, Lci/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    return-object p1

    .line 142
    :pswitch_7
    check-cast p1, Lqg/t;

    .line 143
    .line 144
    check-cast p2, Lwf/c;

    .line 145
    .line 146
    invoke-virtual {p0, p1, p2}, Lci/e;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    check-cast p1, Lci/e;

    .line 151
    .line 152
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 153
    .line 154
    invoke-virtual {p1, p2}, Lci/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    sget-object p1, Lxf/a;->g:Lxf/a;

    .line 158
    .line 159
    return-object p1

    .line 160
    :pswitch_8
    check-cast p1, Lqg/t;

    .line 161
    .line 162
    check-cast p2, Lwf/c;

    .line 163
    .line 164
    invoke-virtual {p0, p1, p2}, Lci/e;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    check-cast p1, Lci/e;

    .line 169
    .line 170
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 171
    .line 172
    invoke-virtual {p1, p2}, Lci/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    return-object p1

    .line 177
    :pswitch_9
    check-cast p1, Lqg/t;

    .line 178
    .line 179
    check-cast p2, Lwf/c;

    .line 180
    .line 181
    invoke-virtual {p0, p1, p2}, Lci/e;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    check-cast p1, Lci/e;

    .line 186
    .line 187
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 188
    .line 189
    invoke-virtual {p1, p2}, Lci/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    return-object p1

    .line 194
    :pswitch_a
    check-cast p1, Ly1/k0;

    .line 195
    .line 196
    check-cast p2, Lwf/c;

    .line 197
    .line 198
    invoke-virtual {p0, p1, p2}, Lci/e;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    check-cast p1, Lci/e;

    .line 203
    .line 204
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 205
    .line 206
    invoke-virtual {p1, p2}, Lci/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    sget-object p1, Lxf/a;->g:Lxf/a;

    .line 210
    .line 211
    return-object p1

    .line 212
    :pswitch_b
    check-cast p1, Lqg/t;

    .line 213
    .line 214
    check-cast p2, Lwf/c;

    .line 215
    .line 216
    invoke-virtual {p0, p1, p2}, Lci/e;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    check-cast p1, Lci/e;

    .line 221
    .line 222
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 223
    .line 224
    invoke-virtual {p1, p2}, Lci/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    return-object p1

    .line 229
    :pswitch_c
    check-cast p1, Lqg/t;

    .line 230
    .line 231
    check-cast p2, Lwf/c;

    .line 232
    .line 233
    invoke-virtual {p0, p1, p2}, Lci/e;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    check-cast p1, Lci/e;

    .line 238
    .line 239
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 240
    .line 241
    invoke-virtual {p1, p2}, Lci/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    return-object p1

    .line 246
    nop

    .line 247
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v4, p0

    .line 2
    .line 3
    iget v0, v4, Lci/e;->h:I

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x2

    .line 8
    sget-object v6, Lsf/n;->a:Lsf/n;

    .line 9
    .line 10
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    sget-object v7, Lxf/a;->g:Lxf/a;

    .line 13
    .line 14
    iget-object v8, v4, Lci/e;->m:Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v9, 0x1

    .line 17
    const/4 v10, 0x0

    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast v8, Lb/d;

    .line 22
    .line 23
    iget-object v0, v4, Lci/e;->l:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v1, v0

    .line 26
    check-cast v1, Landroidx/lifecycle/q;

    .line 27
    .line 28
    iget-object v0, v4, Lci/e;->k:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v12, v0

    .line 31
    check-cast v12, Li0/y1;

    .line 32
    .line 33
    iget v0, v4, Lci/e;->i:I

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    if-ne v0, v9, :cond_0

    .line 38
    .line 39
    :try_start_0
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    goto :goto_2

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    goto :goto_4

    .line 45
    :cond_0
    invoke-static {v5}, Lj8/o;->A(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    move-object v6, v10

    .line 49
    goto :goto_3

    .line 50
    :cond_1
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, v4, Lci/e;->j:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Lgg/u;

    .line 56
    .line 57
    iget-object v0, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Ly1/z1;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    iget-object v2, v12, Li0/y1;->x:Lwf/g;

    .line 64
    .line 65
    invoke-static {v2}, Lqg/v;->a(Lwf/g;)Lvg/c;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    iput-object v2, v0, Ly1/z1;->h:Lvg/c;

    .line 70
    .line 71
    :cond_2
    :try_start_1
    iput v9, v4, Lci/e;->i:I

    .line 72
    .line 73
    new-instance v13, Li0/x1;

    .line 74
    .line 75
    const/4 v15, 0x0

    .line 76
    invoke-direct {v13, v12, v15}, Li0/x1;-><init>(Li0/y1;Lwf/c;)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v4}, Lwf/c;->getContext()Lwf/g;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {v0}, Li0/r;->s(Lwf/g;)Li0/d;

    .line 84
    .line 85
    .line 86
    move-result-object v14

    .line 87
    iget-object v0, v12, Li0/y1;->a:Li0/d;

    .line 88
    .line 89
    new-instance v11, Lf0/b;

    .line 90
    .line 91
    const/16 v16, 0x1

    .line 92
    .line 93
    invoke-direct/range {v11 .. v16}, Lf0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 94
    .line 95
    .line 96
    invoke-static {v0, v11, v4}, Lqg/v;->x(Lwf/g;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 100
    if-ne v0, v7, :cond_3

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_3
    move-object v0, v6

    .line 104
    :goto_0
    if-ne v0, v7, :cond_4

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_4
    move-object v0, v6

    .line 108
    :goto_1
    if-ne v0, v7, :cond_5

    .line 109
    .line 110
    move-object v6, v7

    .line 111
    goto :goto_3

    .line 112
    :cond_5
    :goto_2
    invoke-interface {v1}, Landroidx/lifecycle/q;->f()Landroidx/lifecycle/s;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0, v8}, Landroidx/lifecycle/s;->f(Landroidx/lifecycle/p;)V

    .line 117
    .line 118
    .line 119
    :goto_3
    return-object v6

    .line 120
    :goto_4
    invoke-interface {v1}, Landroidx/lifecycle/q;->f()Landroidx/lifecycle/s;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {v1, v8}, Landroidx/lifecycle/s;->f(Landroidx/lifecycle/p;)V

    .line 125
    .line 126
    .line 127
    throw v0

    .line 128
    :pswitch_0
    iget-object v0, v4, Lci/e;->l:Ljava/lang/Object;

    .line 129
    .line 130
    move-object v1, v0

    .line 131
    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 132
    .line 133
    iget v0, v4, Lci/e;->i:I

    .line 134
    .line 135
    if-eqz v0, :cond_9

    .line 136
    .line 137
    if-eq v0, v9, :cond_8

    .line 138
    .line 139
    if-ne v0, v3, :cond_7

    .line 140
    .line 141
    iget-object v0, v4, Lci/e;->j:Ljava/lang/Object;

    .line 142
    .line 143
    move-object v2, v0

    .line 144
    check-cast v2, Ly0/q;

    .line 145
    .line 146
    :try_start_2
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 147
    .line 148
    .line 149
    move-object/from16 v0, p1

    .line 150
    .line 151
    :cond_6
    move-object v3, v2

    .line 152
    goto :goto_6

    .line 153
    :catchall_1
    move-exception v0

    .line 154
    goto :goto_9

    .line 155
    :cond_7
    invoke-static {v5}, Lj8/o;->A(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    move-object v7, v10

    .line 159
    goto :goto_8

    .line 160
    :cond_8
    iget-object v0, v4, Lci/e;->j:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v0, Ly0/q;

    .line 163
    .line 164
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_9
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    iget-object v0, v4, Lci/e;->j:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v0, Lqg/t;

    .line 174
    .line 175
    new-instance v2, Ly0/q;

    .line 176
    .line 177
    invoke-interface {v0}, Lqg/t;->n()Lwf/g;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    invoke-static {v5}, Lqg/v;->k(Lwf/g;)Lqg/r0;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    iget-object v6, v4, Lci/e;->k:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v6, Lgg/m;

    .line 188
    .line 189
    invoke-interface {v6, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-direct {v2, v5, v0}, Ly0/q;-><init>(Lqg/r0;Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    check-cast v0, Ly0/q;

    .line 201
    .line 202
    if-eqz v0, :cond_b

    .line 203
    .line 204
    iget-object v0, v0, Ly0/q;->a:Lqg/r0;

    .line 205
    .line 206
    iput-object v2, v4, Lci/e;->j:Ljava/lang/Object;

    .line 207
    .line 208
    iput v9, v4, Lci/e;->i:I

    .line 209
    .line 210
    invoke-static {v0, v4}, Lqg/v;->d(Lqg/r0;Lyf/i;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    if-ne v0, v7, :cond_a

    .line 215
    .line 216
    goto :goto_8

    .line 217
    :cond_a
    move-object v0, v2

    .line 218
    :goto_5
    move-object v2, v0

    .line 219
    :cond_b
    :try_start_3
    check-cast v8, Lfg/p;

    .line 220
    .line 221
    iget-object v0, v2, Ly0/q;->b:Ljava/lang/Object;

    .line 222
    .line 223
    iput-object v2, v4, Lci/e;->j:Ljava/lang/Object;

    .line 224
    .line 225
    iput v3, v4, Lci/e;->i:I

    .line 226
    .line 227
    invoke-interface {v8, v0, v4}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 231
    if-ne v0, v7, :cond_6

    .line 232
    .line 233
    goto :goto_8

    .line 234
    :cond_c
    :goto_6
    invoke-virtual {v1, v3, v10}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v2

    .line 238
    if-eqz v2, :cond_d

    .line 239
    .line 240
    goto :goto_7

    .line 241
    :cond_d
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    if-eq v2, v3, :cond_c

    .line 246
    .line 247
    :goto_7
    move-object v7, v0

    .line 248
    :goto_8
    return-object v7

    .line 249
    :goto_9
    invoke-virtual {v1, v2, v10}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    if-nez v3, :cond_e

    .line 254
    .line 255
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    if-ne v3, v2, :cond_e

    .line 260
    .line 261
    goto :goto_9

    .line 262
    :cond_e
    throw v0

    .line 263
    :pswitch_1
    iget v0, v4, Lci/e;->i:I

    .line 264
    .line 265
    if-eqz v0, :cond_10

    .line 266
    .line 267
    if-ne v0, v9, :cond_f

    .line 268
    .line 269
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    goto :goto_a

    .line 273
    :cond_f
    invoke-static {v5}, Lj8/o;->A(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    move-object v6, v10

    .line 277
    goto :goto_a

    .line 278
    :cond_10
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    iget-object v0, v4, Lci/e;->j:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v0, Lr/z;

    .line 284
    .line 285
    new-instance v1, Lr/e;

    .line 286
    .line 287
    invoke-direct {v1, v0, v9}, Lr/e;-><init>(Lr/z;I)V

    .line 288
    .line 289
    .line 290
    invoke-static {v1}, Li0/r;->B(Lfg/a;)Lm/a;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    new-instance v1, Lh/w;

    .line 295
    .line 296
    iget-object v2, v4, Lci/e;->k:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v2, Ljava/util/List;

    .line 299
    .line 300
    iget-object v3, v4, Lci/e;->l:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v3, Li0/a1;

    .line 303
    .line 304
    check-cast v8, Li0/a1;

    .line 305
    .line 306
    invoke-direct {v1, v2, v3, v8}, Lh/w;-><init>(Ljava/util/List;Li0/a1;Li0/a1;)V

    .line 307
    .line 308
    .line 309
    iput v9, v4, Lci/e;->i:I

    .line 310
    .line 311
    invoke-virtual {v0, v1, v4}, Lm/a;->b(Ltg/e;Lwf/c;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    if-ne v0, v7, :cond_11

    .line 316
    .line 317
    move-object v6, v7

    .line 318
    :cond_11
    :goto_a
    return-object v6

    .line 319
    :pswitch_2
    iget v0, v4, Lci/e;->i:I

    .line 320
    .line 321
    if-eqz v0, :cond_14

    .line 322
    .line 323
    if-eq v0, v9, :cond_13

    .line 324
    .line 325
    if-ne v0, v3, :cond_12

    .line 326
    .line 327
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    goto :goto_d

    .line 331
    :cond_12
    invoke-static {v5}, Lj8/o;->A(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    move-object v6, v10

    .line 335
    goto :goto_d

    .line 336
    :cond_13
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    goto :goto_b

    .line 340
    :cond_14
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    iget-object v0, v4, Lci/e;->j:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast v0, Ljava/util/List;

    .line 346
    .line 347
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    if-nez v0, :cond_16

    .line 352
    .line 353
    check-cast v8, Li0/a1;

    .line 354
    .line 355
    invoke-interface {v8}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    check-cast v0, Ljava/lang/Boolean;

    .line 360
    .line 361
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 362
    .line 363
    .line 364
    move-result v0

    .line 365
    if-eqz v0, :cond_16

    .line 366
    .line 367
    iput v9, v4, Lci/e;->i:I

    .line 368
    .line 369
    const-wide/16 v0, 0x28

    .line 370
    .line 371
    invoke-static {v0, v1, v4}, Lqg/v;->f(JLwf/c;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    if-ne v0, v7, :cond_15

    .line 376
    .line 377
    goto :goto_c

    .line 378
    :cond_15
    :goto_b
    iget-object v0, v4, Lci/e;->k:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v0, Lr/z;

    .line 381
    .line 382
    iget-object v1, v4, Lci/e;->l:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast v1, Ljava/util/List;

    .line 385
    .line 386
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 387
    .line 388
    .line 389
    move-result v1

    .line 390
    iput v3, v4, Lci/e;->i:I

    .line 391
    .line 392
    invoke-static {v0, v1, v4}, Lr/z;->m(Lr/z;ILyf/i;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    if-ne v0, v7, :cond_16

    .line 397
    .line 398
    :goto_c
    move-object v6, v7

    .line 399
    :cond_16
    :goto_d
    return-object v6

    .line 400
    :pswitch_3
    check-cast v8, Li0/a1;

    .line 401
    .line 402
    iget v0, v4, Lci/e;->i:I

    .line 403
    .line 404
    if-eqz v0, :cond_18

    .line 405
    .line 406
    if-ne v0, v9, :cond_17

    .line 407
    .line 408
    iget-object v0, v4, Lci/e;->j:Ljava/lang/Object;

    .line 409
    .line 410
    check-cast v0, Li0/a1;

    .line 411
    .line 412
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    move-object v1, v0

    .line 416
    move-object/from16 v0, p1

    .line 417
    .line 418
    goto :goto_e

    .line 419
    :cond_17
    invoke-static {v5}, Lj8/o;->A(Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    move-object v6, v10

    .line 423
    goto :goto_f

    .line 424
    :cond_18
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 425
    .line 426
    .line 427
    sget-object v0, Lqg/c0;->a:Lxg/e;

    .line 428
    .line 429
    sget-object v0, Lxg/d;->i:Lxg/d;

    .line 430
    .line 431
    new-instance v1, Lh0/n;

    .line 432
    .line 433
    iget-object v3, v4, Lci/e;->l:Ljava/lang/Object;

    .line 434
    .line 435
    check-cast v3, Lx8/a;

    .line 436
    .line 437
    invoke-direct {v1, v3, v10, v9}, Lh0/n;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 438
    .line 439
    .line 440
    iput-object v8, v4, Lci/e;->j:Ljava/lang/Object;

    .line 441
    .line 442
    iput v9, v4, Lci/e;->i:I

    .line 443
    .line 444
    invoke-static {v0, v1, v4}, Lqg/v;->x(Lwf/g;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    if-ne v0, v7, :cond_19

    .line 449
    .line 450
    move-object v6, v7

    .line 451
    goto :goto_f

    .line 452
    :cond_19
    move-object v1, v8

    .line 453
    :goto_e
    check-cast v0, Ljava/lang/String;

    .line 454
    .line 455
    sget-object v3, Lwb/ho;->a:Log/k;

    .line 456
    .line 457
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 458
    .line 459
    .line 460
    iget-object v0, v4, Lci/e;->k:Ljava/lang/Object;

    .line 461
    .line 462
    check-cast v0, Landroid/content/Context;

    .line 463
    .line 464
    invoke-interface {v8}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    check-cast v1, Ljava/lang/String;

    .line 469
    .line 470
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 475
    .line 476
    .line 477
    :goto_f
    return-object v6

    .line 478
    :pswitch_4
    iget-object v0, v4, Lci/e;->k:Ljava/lang/Object;

    .line 479
    .line 480
    move-object v12, v0

    .line 481
    check-cast v12, Ltg/d;

    .line 482
    .line 483
    iget-object v0, v4, Lci/e;->l:Ljava/lang/Object;

    .line 484
    .line 485
    move-object v13, v0

    .line 486
    check-cast v13, Ltg/b0;

    .line 487
    .line 488
    iget v0, v4, Lci/e;->i:I

    .line 489
    .line 490
    const/4 v11, 0x4

    .line 491
    if-eqz v0, :cond_1d

    .line 492
    .line 493
    if-eq v0, v9, :cond_1c

    .line 494
    .line 495
    if-eq v0, v3, :cond_1b

    .line 496
    .line 497
    if-eq v0, v1, :cond_1c

    .line 498
    .line 499
    if-ne v0, v11, :cond_1a

    .line 500
    .line 501
    goto :goto_10

    .line 502
    :cond_1a
    invoke-static {v5}, Lj8/o;->A(Ljava/lang/String;)V

    .line 503
    .line 504
    .line 505
    move-object v6, v10

    .line 506
    goto/16 :goto_19

    .line 507
    .line 508
    :cond_1b
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 509
    .line 510
    .line 511
    goto :goto_11

    .line 512
    :cond_1c
    :goto_10
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 513
    .line 514
    .line 515
    goto/16 :goto_19

    .line 516
    .line 517
    :cond_1d
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 518
    .line 519
    .line 520
    iget-object v0, v4, Lci/e;->j:Ljava/lang/Object;

    .line 521
    .line 522
    check-cast v0, Ltg/y;

    .line 523
    .line 524
    sget-object v5, Ltg/v;->a:Ltg/w;

    .line 525
    .line 526
    if-ne v0, v5, :cond_1e

    .line 527
    .line 528
    iput v9, v4, Lci/e;->i:I

    .line 529
    .line 530
    invoke-interface {v12, v13, v4}, Ltg/d;->b(Ltg/e;Lwf/c;)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    if-ne v0, v7, :cond_28

    .line 535
    .line 536
    goto/16 :goto_18

    .line 537
    .line 538
    :cond_1e
    sget-object v5, Ltg/v;->b:Ltg/w;

    .line 539
    .line 540
    const/4 v15, 0x0

    .line 541
    if-ne v0, v5, :cond_20

    .line 542
    .line 543
    invoke-virtual {v13}, Lug/b;->g()Lug/p;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    new-instance v2, Ltg/m;

    .line 548
    .line 549
    invoke-direct {v2, v3, v15}, Lyf/i;-><init>(ILwf/c;)V

    .line 550
    .line 551
    .line 552
    iput v3, v4, Lci/e;->i:I

    .line 553
    .line 554
    invoke-static {v0, v2, v4}, Ltg/s;->f(Ltg/d;Lfg/p;Lyf/c;)Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    if-ne v0, v7, :cond_1f

    .line 559
    .line 560
    goto/16 :goto_18

    .line 561
    .line 562
    :cond_1f
    :goto_11
    iput v1, v4, Lci/e;->i:I

    .line 563
    .line 564
    invoke-interface {v12, v13, v4}, Ltg/d;->b(Ltg/e;Lwf/c;)Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    if-ne v0, v7, :cond_28

    .line 569
    .line 570
    goto/16 :goto_18

    .line 571
    .line 572
    :cond_20
    invoke-virtual {v13}, Lug/b;->g()Lug/p;

    .line 573
    .line 574
    .line 575
    move-result-object v18

    .line 576
    new-instance v1, Ltg/x;

    .line 577
    .line 578
    invoke-direct {v1, v0, v15}, Ltg/x;-><init>(Ltg/y;Lwf/c;)V

    .line 579
    .line 580
    .line 581
    sget v0, Ltg/i;->a:I

    .line 582
    .line 583
    new-instance v16, Lug/g;

    .line 584
    .line 585
    sget-object v19, Lwf/h;->g:Lwf/h;

    .line 586
    .line 587
    const/16 v20, -0x2

    .line 588
    .line 589
    sget-object v21, Lsg/a;->g:Lsg/a;

    .line 590
    .line 591
    move-object/from16 v17, v1

    .line 592
    .line 593
    invoke-direct/range {v16 .. v21}, Lug/g;-><init>(Lfg/q;Ltg/d;Lwf/g;ILsg/a;)V

    .line 594
    .line 595
    .line 596
    move-object/from16 v0, v16

    .line 597
    .line 598
    new-instance v1, Li0/v1;

    .line 599
    .line 600
    invoke-direct {v1, v3, v15, v9}, Li0/v1;-><init>(ILwf/c;I)V

    .line 601
    .line 602
    .line 603
    new-instance v3, Lp4/t;

    .line 604
    .line 605
    const/16 v5, 0x8

    .line 606
    .line 607
    invoke-direct {v3, v0, v5, v1}, Lp4/t;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 608
    .line 609
    .line 610
    invoke-static {v3}, Ltg/s;->d(Ltg/d;)Ltg/d;

    .line 611
    .line 612
    .line 613
    move-result-object v0

    .line 614
    invoke-static {v0}, Ltg/s;->d(Ltg/d;)Ltg/d;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    move v1, v11

    .line 619
    new-instance v11, Lci/e;

    .line 620
    .line 621
    move-object v14, v8

    .line 622
    check-cast v14, Ljava/lang/Float;

    .line 623
    .line 624
    const/16 v16, 0x7

    .line 625
    .line 626
    invoke-direct/range {v11 .. v16}, Lci/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 627
    .line 628
    .line 629
    iput v1, v4, Lci/e;->i:I

    .line 630
    .line 631
    new-instance v1, Ltg/h;

    .line 632
    .line 633
    invoke-direct {v1, v11, v15}, Ltg/h;-><init>(Lfg/p;Lwf/c;)V

    .line 634
    .line 635
    .line 636
    move-object/from16 v22, v19

    .line 637
    .line 638
    new-instance v19, Lug/g;

    .line 639
    .line 640
    const/16 v23, -0x2

    .line 641
    .line 642
    move-object/from16 v20, v1

    .line 643
    .line 644
    move-object/from16 v24, v21

    .line 645
    .line 646
    move-object/from16 v21, v0

    .line 647
    .line 648
    invoke-direct/range {v19 .. v24}, Lug/g;-><init>(Lfg/q;Ltg/d;Lwf/g;ILsg/a;)V

    .line 649
    .line 650
    .line 651
    move-object/from16 v0, v19

    .line 652
    .line 653
    move-object/from16 v3, v22

    .line 654
    .line 655
    move-object/from16 v1, v24

    .line 656
    .line 657
    iget-object v11, v0, Lug/g;->g:Lwf/g;

    .line 658
    .line 659
    invoke-interface {v3, v11}, Lwf/g;->e(Lwf/g;)Lwf/g;

    .line 660
    .line 661
    .line 662
    sget-object v3, Lsg/a;->g:Lsg/a;

    .line 663
    .line 664
    iget-object v5, v0, Lug/g;->i:Lsg/a;

    .line 665
    .line 666
    iget v8, v0, Lug/g;->h:I

    .line 667
    .line 668
    if-eq v1, v3, :cond_21

    .line 669
    .line 670
    move-object v13, v1

    .line 671
    :goto_12
    move v12, v2

    .line 672
    goto :goto_14

    .line 673
    :cond_21
    const/4 v1, -0x3

    .line 674
    if-ne v8, v1, :cond_22

    .line 675
    .line 676
    goto :goto_13

    .line 677
    :cond_22
    const/4 v1, -0x2

    .line 678
    if-ne v8, v1, :cond_23

    .line 679
    .line 680
    goto :goto_13

    .line 681
    :cond_23
    add-int/lit8 v2, v8, 0x0

    .line 682
    .line 683
    if-ltz v2, :cond_24

    .line 684
    .line 685
    goto :goto_13

    .line 686
    :cond_24
    const v2, 0x7fffffff

    .line 687
    .line 688
    .line 689
    :goto_13
    move-object v13, v5

    .line 690
    goto :goto_12

    .line 691
    :goto_14
    invoke-static {v11, v11}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 692
    .line 693
    .line 694
    move-result v1

    .line 695
    if-eqz v1, :cond_25

    .line 696
    .line 697
    if-ne v12, v8, :cond_25

    .line 698
    .line 699
    if-ne v13, v5, :cond_25

    .line 700
    .line 701
    goto :goto_15

    .line 702
    :cond_25
    new-instance v8, Lug/g;

    .line 703
    .line 704
    iget-object v9, v0, Lug/g;->k:Lyf/i;

    .line 705
    .line 706
    iget-object v10, v0, Lug/g;->j:Ltg/d;

    .line 707
    .line 708
    invoke-direct/range {v8 .. v13}, Lug/g;-><init>(Lfg/q;Ltg/d;Lwf/g;ILsg/a;)V

    .line 709
    .line 710
    .line 711
    move-object v0, v8

    .line 712
    :goto_15
    sget-object v1, Lug/j;->g:Lug/j;

    .line 713
    .line 714
    invoke-interface {v0, v1, v4}, Ltg/d;->b(Ltg/e;Lwf/c;)Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    move-result-object v0

    .line 718
    if-ne v0, v7, :cond_26

    .line 719
    .line 720
    goto :goto_16

    .line 721
    :cond_26
    move-object v0, v6

    .line 722
    :goto_16
    if-ne v0, v7, :cond_27

    .line 723
    .line 724
    goto :goto_17

    .line 725
    :cond_27
    move-object v0, v6

    .line 726
    :goto_17
    if-ne v0, v7, :cond_28

    .line 727
    .line 728
    :goto_18
    move-object v6, v7

    .line 729
    :cond_28
    :goto_19
    return-object v6

    .line 730
    :pswitch_5
    iget-object v0, v4, Lci/e;->l:Ljava/lang/Object;

    .line 731
    .line 732
    check-cast v0, Ltg/b0;

    .line 733
    .line 734
    iget v1, v4, Lci/e;->i:I

    .line 735
    .line 736
    if-eqz v1, :cond_2a

    .line 737
    .line 738
    if-ne v1, v9, :cond_29

    .line 739
    .line 740
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 741
    .line 742
    .line 743
    goto :goto_1b

    .line 744
    :cond_29
    invoke-static {v5}, Lj8/o;->A(Ljava/lang/String;)V

    .line 745
    .line 746
    .line 747
    :goto_1a
    move-object v6, v10

    .line 748
    goto :goto_1b

    .line 749
    :cond_2a
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 750
    .line 751
    .line 752
    iget-object v1, v4, Lci/e;->j:Ljava/lang/Object;

    .line 753
    .line 754
    check-cast v1, Ltg/u;

    .line 755
    .line 756
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 757
    .line 758
    .line 759
    move-result v1

    .line 760
    if-eqz v1, :cond_2d

    .line 761
    .line 762
    if-eq v1, v9, :cond_2e

    .line 763
    .line 764
    if-ne v1, v3, :cond_2c

    .line 765
    .line 766
    check-cast v8, Ljava/lang/Float;

    .line 767
    .line 768
    sget-object v1, Ltg/s;->a:Ll3/q;

    .line 769
    .line 770
    if-eq v8, v1, :cond_2b

    .line 771
    .line 772
    invoke-virtual {v0, v10, v8}, Ltg/b0;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 773
    .line 774
    .line 775
    goto :goto_1b

    .line 776
    :cond_2b
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 777
    .line 778
    .line 779
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 780
    .line 781
    const-string v1, "MutableStateFlow.resetReplayCache is not supported"

    .line 782
    .line 783
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 784
    .line 785
    .line 786
    throw v0

    .line 787
    :cond_2c
    invoke-static {}, Lokio/a;->k()V

    .line 788
    .line 789
    .line 790
    goto :goto_1a

    .line 791
    :cond_2d
    iget-object v1, v4, Lci/e;->k:Ljava/lang/Object;

    .line 792
    .line 793
    check-cast v1, Ltg/d;

    .line 794
    .line 795
    iput v9, v4, Lci/e;->i:I

    .line 796
    .line 797
    invoke-interface {v1, v0, v4}, Ltg/d;->b(Ltg/e;Lwf/c;)Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object v0

    .line 801
    if-ne v0, v7, :cond_2e

    .line 802
    .line 803
    move-object v6, v7

    .line 804
    :cond_2e
    :goto_1b
    return-object v6

    .line 805
    :pswitch_6
    check-cast v8, Lm/d3;

    .line 806
    .line 807
    iget v0, v4, Lci/e;->i:I

    .line 808
    .line 809
    if-eqz v0, :cond_31

    .line 810
    .line 811
    if-eq v0, v9, :cond_30

    .line 812
    .line 813
    if-ne v0, v3, :cond_2f

    .line 814
    .line 815
    iget-object v0, v4, Lci/e;->j:Ljava/lang/Object;

    .line 816
    .line 817
    check-cast v0, Lqg/t;

    .line 818
    .line 819
    :try_start_4
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 820
    .line 821
    .line 822
    goto :goto_1c

    .line 823
    :catchall_2
    move-exception v0

    .line 824
    goto :goto_20

    .line 825
    :cond_2f
    invoke-static {v5}, Lj8/o;->A(Ljava/lang/String;)V

    .line 826
    .line 827
    .line 828
    move-object v6, v10

    .line 829
    goto :goto_1f

    .line 830
    :cond_30
    iget-object v0, v4, Lci/e;->l:Ljava/lang/Object;

    .line 831
    .line 832
    check-cast v0, Lm/o2;

    .line 833
    .line 834
    iget-object v1, v4, Lci/e;->k:Ljava/lang/Object;

    .line 835
    .line 836
    check-cast v1, Lm/d3;

    .line 837
    .line 838
    iget-object v2, v4, Lci/e;->j:Ljava/lang/Object;

    .line 839
    .line 840
    check-cast v2, Lqg/t;

    .line 841
    .line 842
    :try_start_5
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 843
    .line 844
    .line 845
    move-object v5, v1

    .line 846
    move-object v1, v2

    .line 847
    move-object/from16 v2, p1

    .line 848
    .line 849
    goto :goto_1d

    .line 850
    :cond_31
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 851
    .line 852
    .line 853
    iget-object v0, v4, Lci/e;->j:Ljava/lang/Object;

    .line 854
    .line 855
    check-cast v0, Lqg/t;

    .line 856
    .line 857
    :goto_1c
    :try_start_6
    invoke-interface {v0}, Lqg/t;->n()Lwf/g;

    .line 858
    .line 859
    .line 860
    move-result-object v1

    .line 861
    invoke-static {v1}, Lqg/v;->p(Lwf/g;)Z

    .line 862
    .line 863
    .line 864
    move-result v1

    .line 865
    if-eqz v1, :cond_34

    .line 866
    .line 867
    iget-object v1, v8, Lm/o1;->a:Lm/o2;

    .line 868
    .line 869
    iget-object v2, v8, Lm/d3;->f:Lsg/c;

    .line 870
    .line 871
    iput-object v0, v4, Lci/e;->j:Ljava/lang/Object;

    .line 872
    .line 873
    iput-object v8, v4, Lci/e;->k:Ljava/lang/Object;

    .line 874
    .line 875
    iput-object v1, v4, Lci/e;->l:Ljava/lang/Object;

    .line 876
    .line 877
    iput v9, v4, Lci/e;->i:I

    .line 878
    .line 879
    invoke-virtual {v2, v4}, Lsg/c;->f(Lwf/c;)Ljava/lang/Object;

    .line 880
    .line 881
    .line 882
    move-result-object v2

    .line 883
    if-ne v2, v7, :cond_32

    .line 884
    .line 885
    goto :goto_1e

    .line 886
    :cond_32
    move-object v5, v1

    .line 887
    move-object v1, v0

    .line 888
    move-object v0, v5

    .line 889
    move-object v5, v8

    .line 890
    :goto_1d
    check-cast v2, Lm/b3;

    .line 891
    .line 892
    iput-object v1, v4, Lci/e;->j:Ljava/lang/Object;

    .line 893
    .line 894
    iput-object v10, v4, Lci/e;->k:Ljava/lang/Object;

    .line 895
    .line 896
    iput-object v10, v4, Lci/e;->l:Ljava/lang/Object;

    .line 897
    .line 898
    iput v3, v4, Lci/e;->i:I

    .line 899
    .line 900
    invoke-static {v5, v0, v2, v4}, Lm/d3;->c(Lm/d3;Lm/o2;Lm/b3;Lyf/c;)Ljava/lang/Object;

    .line 901
    .line 902
    .line 903
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 904
    if-ne v0, v7, :cond_33

    .line 905
    .line 906
    :goto_1e
    move-object v6, v7

    .line 907
    goto :goto_1f

    .line 908
    :cond_33
    move-object v0, v1

    .line 909
    goto :goto_1c

    .line 910
    :cond_34
    iput-object v10, v8, Lm/d3;->g:Lqg/e1;

    .line 911
    .line 912
    :goto_1f
    return-object v6

    .line 913
    :goto_20
    iput-object v10, v8, Lm/d3;->g:Lqg/e1;

    .line 914
    .line 915
    throw v0

    .line 916
    :pswitch_7
    iget v0, v4, Lci/e;->i:I

    .line 917
    .line 918
    if-eqz v0, :cond_37

    .line 919
    .line 920
    if-eq v0, v9, :cond_36

    .line 921
    .line 922
    if-ne v0, v3, :cond_35

    .line 923
    .line 924
    iget-object v0, v4, Lci/e;->k:Ljava/lang/Object;

    .line 925
    .line 926
    check-cast v0, Lgg/r;

    .line 927
    .line 928
    iget-object v1, v4, Lci/e;->j:Ljava/lang/Object;

    .line 929
    .line 930
    check-cast v1, Lqg/t;

    .line 931
    .line 932
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 933
    .line 934
    .line 935
    move-object v14, v0

    .line 936
    move-object v15, v1

    .line 937
    goto :goto_22

    .line 938
    :cond_35
    invoke-static {v5}, Lj8/o;->A(Ljava/lang/String;)V

    .line 939
    .line 940
    .line 941
    :goto_21
    move-object v7, v10

    .line 942
    goto/16 :goto_24

    .line 943
    .line 944
    :cond_36
    iget-object v0, v4, Lci/e;->k:Ljava/lang/Object;

    .line 945
    .line 946
    check-cast v0, Lgg/r;

    .line 947
    .line 948
    iget-object v1, v4, Lci/e;->j:Ljava/lang/Object;

    .line 949
    .line 950
    check-cast v1, Lqg/t;

    .line 951
    .line 952
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 953
    .line 954
    .line 955
    move-object v14, v0

    .line 956
    move-object v15, v1

    .line 957
    goto :goto_23

    .line 958
    :cond_37
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 959
    .line 960
    .line 961
    iget-object v0, v4, Lci/e;->j:Ljava/lang/Object;

    .line 962
    .line 963
    check-cast v0, Lqg/t;

    .line 964
    .line 965
    new-instance v1, Lgg/r;

    .line 966
    .line 967
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 968
    .line 969
    .line 970
    const/high16 v5, 0x3f800000    # 1.0f

    .line 971
    .line 972
    iput v5, v1, Lgg/r;->g:F

    .line 973
    .line 974
    move-object v15, v0

    .line 975
    move-object v14, v1

    .line 976
    :cond_38
    :goto_22
    iget-object v0, v4, Lci/e;->l:Ljava/lang/Object;

    .line 977
    .line 978
    move-object v12, v0

    .line 979
    check-cast v12, Li0/a1;

    .line 980
    .line 981
    move-object v13, v8

    .line 982
    check-cast v13, Li/g0;

    .line 983
    .line 984
    new-instance v11, Lc9/k;

    .line 985
    .line 986
    const/16 v16, 0x6

    .line 987
    .line 988
    invoke-direct/range {v11 .. v16}, Lc9/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 989
    .line 990
    .line 991
    iput-object v15, v4, Lci/e;->j:Ljava/lang/Object;

    .line 992
    .line 993
    iput-object v14, v4, Lci/e;->k:Ljava/lang/Object;

    .line 994
    .line 995
    iput v9, v4, Lci/e;->i:I

    .line 996
    .line 997
    invoke-interface {v4}, Lwf/c;->getContext()Lwf/g;

    .line 998
    .line 999
    .line 1000
    move-result-object v0

    .line 1001
    sget-object v1, Ly1/r1;->g:Ly1/r1;

    .line 1002
    .line 1003
    invoke-interface {v0, v1}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v0

    .line 1007
    if-nez v0, :cond_3a

    .line 1008
    .line 1009
    invoke-interface {v4}, Lwf/c;->getContext()Lwf/g;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v0

    .line 1013
    invoke-static {v0}, Li0/r;->s(Lwf/g;)Li0/d;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v0

    .line 1017
    invoke-virtual {v0, v11, v4}, Li0/d;->d(Lfg/l;Lwf/c;)Ljava/lang/Object;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v0

    .line 1021
    if-ne v0, v7, :cond_39

    .line 1022
    .line 1023
    goto :goto_24

    .line 1024
    :cond_39
    :goto_23
    iget v0, v14, Lgg/r;->g:F

    .line 1025
    .line 1026
    const/4 v1, 0x0

    .line 1027
    cmpg-float v0, v0, v1

    .line 1028
    .line 1029
    if-nez v0, :cond_38

    .line 1030
    .line 1031
    new-instance v0, Li/e0;

    .line 1032
    .line 1033
    invoke-direct {v0, v15, v2}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 1034
    .line 1035
    .line 1036
    invoke-static {v0}, Li0/r;->B(Lfg/a;)Lm/a;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v0

    .line 1040
    new-instance v1, Li/f0;

    .line 1041
    .line 1042
    invoke-direct {v1, v3, v10}, Lyf/i;-><init>(ILwf/c;)V

    .line 1043
    .line 1044
    .line 1045
    iput-object v15, v4, Lci/e;->j:Ljava/lang/Object;

    .line 1046
    .line 1047
    iput-object v14, v4, Lci/e;->k:Ljava/lang/Object;

    .line 1048
    .line 1049
    iput v3, v4, Lci/e;->i:I

    .line 1050
    .line 1051
    invoke-static {v0, v1, v4}, Ltg/s;->f(Ltg/d;Lfg/p;Lyf/c;)Ljava/lang/Object;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v0

    .line 1055
    if-ne v0, v7, :cond_38

    .line 1056
    .line 1057
    goto :goto_24

    .line 1058
    :cond_3a
    invoke-static {}, Lah/a;->d()V

    .line 1059
    .line 1060
    .line 1061
    goto :goto_21

    .line 1062
    :goto_24
    return-object v7

    .line 1063
    :pswitch_8
    iget-object v0, v4, Lci/e;->k:Ljava/lang/Object;

    .line 1064
    .line 1065
    move-object v11, v0

    .line 1066
    check-cast v11, Li/c;

    .line 1067
    .line 1068
    iget v0, v4, Lci/e;->i:I

    .line 1069
    .line 1070
    if-eqz v0, :cond_3c

    .line 1071
    .line 1072
    if-ne v0, v9, :cond_3b

    .line 1073
    .line 1074
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1075
    .line 1076
    .line 1077
    goto :goto_25

    .line 1078
    :cond_3b
    invoke-static {v5}, Lj8/o;->A(Ljava/lang/String;)V

    .line 1079
    .line 1080
    .line 1081
    move-object v6, v10

    .line 1082
    goto :goto_26

    .line 1083
    :cond_3c
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1084
    .line 1085
    .line 1086
    iget-object v0, v4, Lci/e;->j:Ljava/lang/Object;

    .line 1087
    .line 1088
    iget-object v1, v11, Li/c;->e:Li0/j1;

    .line 1089
    .line 1090
    invoke-virtual {v1}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v1

    .line 1094
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1095
    .line 1096
    .line 1097
    move-result v0

    .line 1098
    if-nez v0, :cond_3e

    .line 1099
    .line 1100
    iget-object v0, v4, Lci/e;->k:Ljava/lang/Object;

    .line 1101
    .line 1102
    check-cast v0, Li/c;

    .line 1103
    .line 1104
    iget-object v1, v4, Lci/e;->j:Ljava/lang/Object;

    .line 1105
    .line 1106
    iget-object v2, v4, Lci/e;->l:Ljava/lang/Object;

    .line 1107
    .line 1108
    check-cast v2, Li0/a1;

    .line 1109
    .line 1110
    sget-object v3, Li/f;->a:Li/r0;

    .line 1111
    .line 1112
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v2

    .line 1116
    check-cast v2, Li/k;

    .line 1117
    .line 1118
    iput v9, v4, Lci/e;->i:I

    .line 1119
    .line 1120
    const/4 v3, 0x0

    .line 1121
    const/16 v5, 0xc

    .line 1122
    .line 1123
    invoke-static/range {v0 .. v5}, Li/c;->c(Li/c;Ljava/lang/Object;Li/k;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v0

    .line 1127
    if-ne v0, v7, :cond_3d

    .line 1128
    .line 1129
    move-object v6, v7

    .line 1130
    goto :goto_26

    .line 1131
    :cond_3d
    :goto_25
    check-cast v8, Li0/a1;

    .line 1132
    .line 1133
    sget-object v0, Li/f;->a:Li/r0;

    .line 1134
    .line 1135
    invoke-interface {v8}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v0

    .line 1139
    check-cast v0, Lfg/l;

    .line 1140
    .line 1141
    if-eqz v0, :cond_3e

    .line 1142
    .line 1143
    invoke-virtual {v11}, Li/c;->d()Ljava/lang/Object;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v1

    .line 1147
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1148
    .line 1149
    .line 1150
    :cond_3e
    :goto_26
    return-object v6

    .line 1151
    :pswitch_9
    iget v0, v4, Lci/e;->i:I

    .line 1152
    .line 1153
    if-eqz v0, :cond_42

    .line 1154
    .line 1155
    if-eq v0, v9, :cond_41

    .line 1156
    .line 1157
    if-eq v0, v3, :cond_40

    .line 1158
    .line 1159
    if-ne v0, v1, :cond_3f

    .line 1160
    .line 1161
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1162
    .line 1163
    .line 1164
    move-object/from16 v0, p1

    .line 1165
    .line 1166
    goto/16 :goto_2b

    .line 1167
    .line 1168
    :cond_3f
    invoke-static {v5}, Lj8/o;->A(Ljava/lang/String;)V

    .line 1169
    .line 1170
    .line 1171
    move-object v0, v10

    .line 1172
    goto/16 :goto_2b

    .line 1173
    .line 1174
    :cond_40
    iget-object v0, v4, Lci/e;->j:Ljava/lang/Object;

    .line 1175
    .line 1176
    move-object v2, v0

    .line 1177
    check-cast v2, Lyg/b;

    .line 1178
    .line 1179
    :try_start_7
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 1180
    .line 1181
    .line 1182
    move-object/from16 v0, p1

    .line 1183
    .line 1184
    goto :goto_29

    .line 1185
    :catchall_3
    move-exception v0

    .line 1186
    goto :goto_2c

    .line 1187
    :cond_41
    iget-object v0, v4, Lci/e;->k:Ljava/lang/Object;

    .line 1188
    .line 1189
    check-cast v0, Lh0/p;

    .line 1190
    .line 1191
    iget-object v5, v4, Lci/e;->j:Ljava/lang/Object;

    .line 1192
    .line 1193
    check-cast v5, Lyg/b;

    .line 1194
    .line 1195
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1196
    .line 1197
    .line 1198
    goto :goto_27

    .line 1199
    :cond_42
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1200
    .line 1201
    .line 1202
    iget-object v0, v4, Lci/e;->l:Ljava/lang/Object;

    .line 1203
    .line 1204
    check-cast v0, Lh0/p;

    .line 1205
    .line 1206
    iget-object v5, v0, Lh0/p;->e:Lyg/b;

    .line 1207
    .line 1208
    iput-object v5, v4, Lci/e;->j:Ljava/lang/Object;

    .line 1209
    .line 1210
    iput-object v0, v4, Lci/e;->k:Ljava/lang/Object;

    .line 1211
    .line 1212
    iput v9, v4, Lci/e;->i:I

    .line 1213
    .line 1214
    invoke-virtual {v5, v4}, Lyg/b;->d(Lyf/c;)Ljava/lang/Object;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v6

    .line 1218
    if-ne v6, v7, :cond_43

    .line 1219
    .line 1220
    goto :goto_2a

    .line 1221
    :cond_43
    :goto_27
    :try_start_8
    iget-object v6, v0, Lh0/p;->f:Landroid/view/textclassifier/TextClassifier;

    .line 1222
    .line 1223
    if-eqz v6, :cond_44

    .line 1224
    .line 1225
    invoke-static {v6}, Lb0/b0;->w(Landroid/view/textclassifier/TextClassifier;)Z

    .line 1226
    .line 1227
    .line 1228
    move-result v9

    .line 1229
    if-eqz v9, :cond_46

    .line 1230
    .line 1231
    goto :goto_28

    .line 1232
    :catchall_4
    move-exception v0

    .line 1233
    move-object v2, v5

    .line 1234
    goto :goto_2c

    .line 1235
    :cond_44
    :goto_28
    new-instance v6, Lh0/n;

    .line 1236
    .line 1237
    invoke-direct {v6, v0, v10, v2}, Lh0/n;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 1238
    .line 1239
    .line 1240
    iput-object v5, v4, Lci/e;->j:Ljava/lang/Object;

    .line 1241
    .line 1242
    iput-object v10, v4, Lci/e;->k:Ljava/lang/Object;

    .line 1243
    .line 1244
    iput v3, v4, Lci/e;->i:I

    .line 1245
    .line 1246
    const-wide/16 v2, 0x12c

    .line 1247
    .line 1248
    invoke-static {v2, v3, v6, v4}, Lqg/v;->y(JLfg/p;Lyf/c;)Ljava/lang/Object;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 1252
    if-ne v0, v7, :cond_45

    .line 1253
    .line 1254
    goto :goto_2a

    .line 1255
    :cond_45
    move-object v2, v5

    .line 1256
    :goto_29
    :try_start_9
    move-object v6, v0

    .line 1257
    check-cast v6, Landroid/view/textclassifier/TextClassifier;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 1258
    .line 1259
    move-object v5, v2

    .line 1260
    :cond_46
    invoke-virtual {v5, v10}, Lyg/b;->f(Ljava/lang/Object;)V

    .line 1261
    .line 1262
    .line 1263
    new-instance v0, Lci/j;

    .line 1264
    .line 1265
    check-cast v8, Lyf/i;

    .line 1266
    .line 1267
    invoke-direct {v0, v6, v8, v10}, Lci/j;-><init>(Landroid/view/textclassifier/TextClassifier;Lfg/p;Lwf/c;)V

    .line 1268
    .line 1269
    .line 1270
    iput-object v10, v4, Lci/e;->j:Ljava/lang/Object;

    .line 1271
    .line 1272
    iput-object v10, v4, Lci/e;->k:Ljava/lang/Object;

    .line 1273
    .line 1274
    iput v1, v4, Lci/e;->i:I

    .line 1275
    .line 1276
    const-wide/16 v1, 0xc8

    .line 1277
    .line 1278
    invoke-static {v1, v2, v0, v4}, Lqg/v;->y(JLfg/p;Lyf/c;)Ljava/lang/Object;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v0

    .line 1282
    if-ne v0, v7, :cond_47

    .line 1283
    .line 1284
    :goto_2a
    move-object v0, v7

    .line 1285
    :cond_47
    :goto_2b
    return-object v0

    .line 1286
    :goto_2c
    invoke-virtual {v2, v10}, Lyg/b;->f(Ljava/lang/Object;)V

    .line 1287
    .line 1288
    .line 1289
    throw v0

    .line 1290
    :pswitch_a
    iget v0, v4, Lci/e;->i:I

    .line 1291
    .line 1292
    if-eqz v0, :cond_49

    .line 1293
    .line 1294
    if-eq v0, v9, :cond_48

    .line 1295
    .line 1296
    invoke-static {v5}, Lj8/o;->A(Ljava/lang/String;)V

    .line 1297
    .line 1298
    .line 1299
    :goto_2d
    move-object v7, v10

    .line 1300
    goto :goto_2f

    .line 1301
    :cond_48
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1302
    .line 1303
    .line 1304
    goto :goto_2e

    .line 1305
    :cond_49
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1306
    .line 1307
    .line 1308
    iget-object v0, v4, Lci/e;->j:Ljava/lang/Object;

    .line 1309
    .line 1310
    move-object v12, v0

    .line 1311
    check-cast v12, Ly1/k0;

    .line 1312
    .line 1313
    new-instance v11, Lf0/b;

    .line 1314
    .line 1315
    iget-object v0, v4, Lci/e;->k:Ljava/lang/Object;

    .line 1316
    .line 1317
    move-object v13, v0

    .line 1318
    check-cast v13, Lfg/l;

    .line 1319
    .line 1320
    iget-object v0, v4, Lci/e;->l:Ljava/lang/Object;

    .line 1321
    .line 1322
    move-object v14, v0

    .line 1323
    check-cast v14, Lf0/c;

    .line 1324
    .line 1325
    move-object v15, v8

    .line 1326
    check-cast v15, Lf0/p;

    .line 1327
    .line 1328
    const/16 v16, 0x0

    .line 1329
    .line 1330
    const/16 v17, 0x0

    .line 1331
    .line 1332
    invoke-direct/range {v11 .. v17}, Lf0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 1333
    .line 1334
    .line 1335
    iput v9, v4, Lci/e;->i:I

    .line 1336
    .line 1337
    invoke-static {v11, v4}, Lqg/v;->e(Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v0

    .line 1341
    if-ne v0, v7, :cond_4a

    .line 1342
    .line 1343
    goto :goto_2f

    .line 1344
    :cond_4a
    :goto_2e
    invoke-static {}, Lokio/a;->c()V

    .line 1345
    .line 1346
    .line 1347
    goto :goto_2d

    .line 1348
    :goto_2f
    return-object v7

    .line 1349
    :pswitch_b
    iget v0, v4, Lci/e;->i:I

    .line 1350
    .line 1351
    if-eqz v0, :cond_4c

    .line 1352
    .line 1353
    if-ne v0, v9, :cond_4b

    .line 1354
    .line 1355
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1356
    .line 1357
    .line 1358
    move-object/from16 v0, p1

    .line 1359
    .line 1360
    goto :goto_30

    .line 1361
    :cond_4b
    invoke-static {v5}, Lj8/o;->A(Ljava/lang/String;)V

    .line 1362
    .line 1363
    .line 1364
    move-object v6, v10

    .line 1365
    goto :goto_31

    .line 1366
    :cond_4c
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1367
    .line 1368
    .line 1369
    iget-object v0, v4, Lci/e;->j:Ljava/lang/Object;

    .line 1370
    .line 1371
    check-cast v0, Le2/c;

    .line 1372
    .line 1373
    iget-object v1, v4, Lci/e;->k:Ljava/lang/Object;

    .line 1374
    .line 1375
    check-cast v1, Landroid/view/ScrollCaptureSession;

    .line 1376
    .line 1377
    iget-object v2, v4, Lci/e;->l:Ljava/lang/Object;

    .line 1378
    .line 1379
    check-cast v2, Landroid/graphics/Rect;

    .line 1380
    .line 1381
    new-instance v3, Lu2/k;

    .line 1382
    .line 1383
    iget v5, v2, Landroid/graphics/Rect;->left:I

    .line 1384
    .line 1385
    iget v10, v2, Landroid/graphics/Rect;->top:I

    .line 1386
    .line 1387
    iget v11, v2, Landroid/graphics/Rect;->right:I

    .line 1388
    .line 1389
    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    .line 1390
    .line 1391
    invoke-direct {v3, v5, v10, v11, v2}, Lu2/k;-><init>(IIII)V

    .line 1392
    .line 1393
    .line 1394
    iput v9, v4, Lci/e;->i:I

    .line 1395
    .line 1396
    invoke-static {v0, v1, v3, v4}, Le2/c;->a(Le2/c;Landroid/view/ScrollCaptureSession;Lu2/k;Lyf/c;)Ljava/lang/Object;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v0

    .line 1400
    if-ne v0, v7, :cond_4d

    .line 1401
    .line 1402
    move-object v6, v7

    .line 1403
    goto :goto_31

    .line 1404
    :cond_4d
    :goto_30
    check-cast v0, Lu2/k;

    .line 1405
    .line 1406
    check-cast v8, Ljava/util/function/Consumer;

    .line 1407
    .line 1408
    invoke-static {v0}, Lf1/c0;->t(Lu2/k;)Landroid/graphics/Rect;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v0

    .line 1412
    invoke-interface {v8, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 1413
    .line 1414
    .line 1415
    :goto_31
    return-object v6

    .line 1416
    :pswitch_c
    iget-object v0, v4, Lci/e;->k:Ljava/lang/Object;

    .line 1417
    .line 1418
    check-cast v0, Ls1/x;

    .line 1419
    .line 1420
    iget-object v1, v4, Lci/e;->j:Ljava/lang/Object;

    .line 1421
    .line 1422
    move-object v12, v1

    .line 1423
    check-cast v12, Lqg/t;

    .line 1424
    .line 1425
    iget v1, v4, Lci/e;->i:I

    .line 1426
    .line 1427
    if-eqz v1, :cond_4f

    .line 1428
    .line 1429
    if-ne v1, v9, :cond_4e

    .line 1430
    .line 1431
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1432
    .line 1433
    .line 1434
    goto :goto_32

    .line 1435
    :cond_4e
    invoke-static {v5}, Lj8/o;->A(Ljava/lang/String;)V

    .line 1436
    .line 1437
    .line 1438
    move-object v6, v10

    .line 1439
    goto :goto_32

    .line 1440
    :cond_4f
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1441
    .line 1442
    .line 1443
    new-instance v14, Lci/h0;

    .line 1444
    .line 1445
    invoke-direct {v14, v0}, Lci/h0;-><init>(Lu2/c;)V

    .line 1446
    .line 1447
    .line 1448
    new-instance v11, Lci/d;

    .line 1449
    .line 1450
    iget-object v1, v4, Lci/e;->l:Ljava/lang/Object;

    .line 1451
    .line 1452
    move-object v13, v1

    .line 1453
    check-cast v13, Lci/l0;

    .line 1454
    .line 1455
    move-object v15, v8

    .line 1456
    check-cast v15, Lci/f;

    .line 1457
    .line 1458
    const/16 v16, 0x0

    .line 1459
    .line 1460
    const/16 v17, 0x0

    .line 1461
    .line 1462
    invoke-direct/range {v11 .. v17}, Lci/d;-><init>(Lqg/t;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 1463
    .line 1464
    .line 1465
    iput-object v10, v4, Lci/e;->j:Ljava/lang/Object;

    .line 1466
    .line 1467
    iput v9, v4, Lci/e;->i:I

    .line 1468
    .line 1469
    invoke-static {v0, v11, v4}, La/a;->n(Ls1/x;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 1470
    .line 1471
    .line 1472
    move-result-object v0

    .line 1473
    if-ne v0, v7, :cond_50

    .line 1474
    .line 1475
    move-object v6, v7

    .line 1476
    :cond_50
    :goto_32
    return-object v6

    .line 1477
    :pswitch_data_0
    .packed-switch 0x0
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
