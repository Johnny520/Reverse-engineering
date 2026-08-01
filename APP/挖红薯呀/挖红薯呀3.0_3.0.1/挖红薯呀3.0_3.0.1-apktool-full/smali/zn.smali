.class public final Lzn;
.super Landroid/app/Dialog;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lx90;
.implements Lnx0;


# instance fields
.field public d:Lz90;

.field public final e:Llx0;

.field public final f:Lx51;

.field public final g:Lx51;

.field public h:Lhw;

.field public i:Lxn;

.field public final j:Landroid/view/View;

.field public final k:Lwn;

.field public l:Z


# direct methods
.method public constructor <init>(Lhw;Lxn;Landroid/view/View;Lk50;Lym;Ljava/util/UUID;)V
    .locals 6

    .line 1
    new-instance v0, Landroid/view/ContextThemeWrapper;

    .line 2
    .line 3
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-boolean v2, p2, Lxn;->e:Z

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    const/high16 v2, 0x7f0b0000

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const v2, 0x7f0b0003

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-direct {v0, v1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {p0, v0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 22
    .line 23
    .line 24
    new-instance v0, Lmx0;

    .line 25
    .line 26
    new-instance v2, Lk6;

    .line 27
    .line 28
    const/16 v3, 0x9

    .line 29
    .line 30
    invoke-direct {v2, v3, p0}, Lk6;-><init>(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, p0, v2}, Lmx0;-><init>(Lnx0;Lk6;)V

    .line 34
    .line 35
    .line 36
    new-instance v2, Llx0;

    .line 37
    .line 38
    invoke-direct {v2, v0}, Llx0;-><init>(Lmx0;)V

    .line 39
    .line 40
    .line 41
    iput-object v2, p0, Lzn;->e:Llx0;

    .line 42
    .line 43
    new-instance v0, Lih;

    .line 44
    .line 45
    invoke-direct {v0, p0, v1}, Lih;-><init>(Lzn;I)V

    .line 46
    .line 47
    .line 48
    new-instance v2, Lx51;

    .line 49
    .line 50
    invoke-direct {v2, v0}, Lx51;-><init>(Lhw;)V

    .line 51
    .line 52
    .line 53
    iput-object v2, p0, Lzn;->f:Lx51;

    .line 54
    .line 55
    new-instance v0, Lih;

    .line 56
    .line 57
    const/4 v2, 0x1

    .line 58
    invoke-direct {v0, p0, v2}, Lih;-><init>(Lzn;I)V

    .line 59
    .line 60
    .line 61
    new-instance v3, Lx51;

    .line 62
    .line 63
    invoke-direct {v3, v0}, Lx51;-><init>(Lhw;)V

    .line 64
    .line 65
    .line 66
    iput-object v3, p0, Lzn;->g:Lx51;

    .line 67
    .line 68
    iput-object p1, p0, Lzn;->h:Lhw;

    .line 69
    .line 70
    iput-object p2, p0, Lzn;->i:Lxn;

    .line 71
    .line 72
    iput-object p3, p0, Lzn;->j:Landroid/view/View;

    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    const/4 p2, 0x0

    .line 79
    if-eqz p1, :cond_7

    .line 80
    .line 81
    invoke-virtual {p1, v2}, Landroid/view/Window;->requestFeature(I)Z

    .line 82
    .line 83
    .line 84
    const v0, 0x106000d

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v0}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Lzn;->i:Lxn;

    .line 91
    .line 92
    iget-boolean v0, v0, Lxn;->e:Z

    .line 93
    .line 94
    invoke-static {p1, v0}, Lw60;->K(Landroid/view/Window;Z)V

    .line 95
    .line 96
    .line 97
    const/16 v0, 0x11

    .line 98
    .line 99
    invoke-virtual {p1, v0}, Landroid/view/Window;->setGravity(I)V

    .line 100
    .line 101
    .line 102
    iget-object v0, p0, Lzn;->i:Lxn;

    .line 103
    .line 104
    iget-boolean v0, v0, Lxn;->e:Z

    .line 105
    .line 106
    if-nez v0, :cond_1

    .line 107
    .line 108
    const v0, 0x10100

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v0}, Landroid/view/Window;->addFlags(I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    sget-object v4, Lj8;->a:Lj8;

    .line 119
    .line 120
    invoke-virtual {v4, v0}, Lj8;->a(Landroid/view/WindowManager$LayoutParams;)V

    .line 121
    .line 122
    .line 123
    sget-object v4, Lk8;->a:Lk8;

    .line 124
    .line 125
    invoke-virtual {v4, v0, v1}, Lk8;->b(Landroid/view/WindowManager$LayoutParams;I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v4, v0, v1}, Lk8;->c(Landroid/view/WindowManager$LayoutParams;I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 132
    .line 133
    .line 134
    :cond_1
    new-instance v0, Lwn;

    .line 135
    .line 136
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    invoke-direct {v0, v4, p1}, Lwn;-><init>(Landroid/content/Context;Landroid/view/Window;)V

    .line 141
    .line 142
    .line 143
    iget-object v4, p0, Lzn;->i:Lxn;

    .line 144
    .line 145
    iget-object v4, v4, Lxn;->f:Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {p0, v4}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 148
    .line 149
    .line 150
    new-instance v4, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    const-string v5, "Dialog:"

    .line 153
    .line 154
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v4, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p6

    .line 164
    const v4, 0x7f060032

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, v4, p6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 171
    .line 172
    .line 173
    const/high16 p6, 0x41000000    # 8.0f

    .line 174
    .line 175
    invoke-interface {p5, p6}, Lym;->p(F)F

    .line 176
    .line 177
    .line 178
    move-result p5

    .line 179
    invoke-virtual {v0, p5}, Landroid/view/View;->setElevation(F)V

    .line 180
    .line 181
    .line 182
    new-instance p5, Lyn;

    .line 183
    .line 184
    invoke-direct {p5, v1}, Lyn;-><init>(I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, p5}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 188
    .line 189
    .line 190
    iput-object v0, p0, Lzn;->k:Lwn;

    .line 191
    .line 192
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    instance-of p5, p1, Landroid/view/ViewGroup;

    .line 197
    .line 198
    if-eqz p5, :cond_2

    .line 199
    .line 200
    check-cast p1, Landroid/view/ViewGroup;

    .line 201
    .line 202
    goto :goto_1

    .line 203
    :cond_2
    move-object p1, p2

    .line 204
    :goto_1
    if-eqz p1, :cond_3

    .line 205
    .line 206
    invoke-static {p1}, Lzn;->b(Landroid/view/ViewGroup;)V

    .line 207
    .line 208
    .line 209
    :cond_3
    invoke-virtual {p0, v0}, Lzn;->setContentView(Landroid/view/View;)V

    .line 210
    .line 211
    .line 212
    invoke-static {p3}, Lj50;->m(Landroid/view/View;)Lx90;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    const p5, 0x7f060074

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, p5, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    invoke-static {p3}, Lv50;->i(Landroid/view/View;)Lwc1;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    const p5, 0x7f060078

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0, p5, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    invoke-static {p3}, Lu50;->j(Landroid/view/View;)Lnx0;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    const p3, 0x7f060077

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0, p3, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    iget-object p1, p0, Lzn;->h:Lhw;

    .line 243
    .line 244
    iget-object p3, p0, Lzn;->i:Lxn;

    .line 245
    .line 246
    invoke-virtual {p0, p1, p3, p4}, Lzn;->e(Lhw;Lxn;Lk50;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v3}, Lx51;->getValue()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    check-cast p1, Lbl0;

    .line 254
    .line 255
    new-instance p3, Ly4;

    .line 256
    .line 257
    invoke-direct {p3, p0, v2}, Ly4;-><init>(Lzn;I)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    new-instance p4, Lcl0;

    .line 264
    .line 265
    invoke-direct {p4, p3}, Lcl0;-><init>(Ly4;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {p0}, Lzn;->c()Lz90;

    .line 269
    .line 270
    .line 271
    move-result-object p3

    .line 272
    iget-object p5, p3, Lz90;->c:Lr90;

    .line 273
    .line 274
    sget-object p6, Lr90;->d:Lr90;

    .line 275
    .line 276
    if-ne p5, p6, :cond_4

    .line 277
    .line 278
    return-void

    .line 279
    :cond_4
    new-instance p5, Lwk0;

    .line 280
    .line 281
    invoke-direct {p5, p4, p0}, Lwk0;-><init>(Lcl0;Lx90;)V

    .line 282
    .line 283
    .line 284
    new-instance p0, Lvk0;

    .line 285
    .line 286
    invoke-direct {p0, p4, p5}, Lvk0;-><init>(Lcl0;Lwk0;)V

    .line 287
    .line 288
    .line 289
    iget-object p5, p4, Lcl0;->a:Ljava/util/ArrayList;

    .line 290
    .line 291
    invoke-virtual {p5, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    invoke-virtual {p0, v1}, Lvk0;->a(Z)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {p1}, Lbl0;->a()Lri0;

    .line 298
    .line 299
    .line 300
    move-result-object p5

    .line 301
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    iget-object p6, p5, Lri0;->c:Ljava/util/LinkedHashSet;

    .line 305
    .line 306
    invoke-interface {p6, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result p6

    .line 310
    if-eqz p6, :cond_6

    .line 311
    .line 312
    iget-object p6, p5, Lri0;->b:Lui0;

    .line 313
    .line 314
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    iget-object v0, p0, Lvk0;->c:Lri0;

    .line 318
    .line 319
    if-nez v0, :cond_5

    .line 320
    .line 321
    iget-object p2, p6, Lui0;->e:Lx8;

    .line 322
    .line 323
    invoke-virtual {p2, p0}, Lx8;->addFirst(Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    iput-object p5, p0, Lvk0;->c:Lri0;

    .line 327
    .line 328
    invoke-virtual {p6}, Lui0;->b()V

    .line 329
    .line 330
    .line 331
    goto :goto_2

    .line 332
    :cond_5
    const-string p1, "Handler \'"

    .line 333
    .line 334
    const-string p3, "\' is already registered with a dispatcher"

    .line 335
    .line 336
    invoke-static {p1, p0, p3}, Lxc;->h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    throw p2

    .line 340
    :cond_6
    :goto_2
    new-instance p2, Lgm;

    .line 341
    .line 342
    invoke-direct {p2, p0, p1, p3}, Lgm;-><init>(Lvk0;Lbl0;Ls90;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {p3, p2}, Lz90;->a(Lw90;)V

    .line 346
    .line 347
    .line 348
    new-instance p0, Lxk0;

    .line 349
    .line 350
    invoke-direct {p0, p3, p2}, Lxk0;-><init>(Ls90;Lgm;)V

    .line 351
    .line 352
    .line 353
    iget-object p1, p4, Lcl0;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 354
    .line 355
    invoke-virtual {p1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    return-void

    .line 359
    :cond_7
    const-string p0, "Dialog has no window"

    .line 360
    .line 361
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    throw p2
.end method

.method public static a(Lzn;)V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->onBackPressed()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final b(Landroid/view/ViewGroup;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 3
    .line 4
    .line 5
    instance-of v1, p0, Lwn;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    :goto_0
    if-ge v0, v1, :cond_3

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    check-cast v2, Landroid/view/ViewGroup;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/4 v2, 0x0

    .line 28
    :goto_1
    if-eqz v2, :cond_2

    .line 29
    .line 30
    invoke-static {v2}, Lzn;->b(Landroid/view/ViewGroup;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    :goto_2
    return-void
.end method


# virtual methods
.method public final addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lzn;->d()V

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final c()Lz90;
    .locals 2

    .line 1
    iget-object v0, p0, Lzn;->d:Lz90;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lz90;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, p0, v1}, Lz90;-><init>(Lx90;Z)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lzn;->d:Lz90;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public final cancel()V
    .locals 0

    .line 1
    return-void
.end method

.method public final d()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const v1, 0x7f060074

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    const v1, 0x7f060076

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    const v1, 0x7f060077

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    const v1, 0x7f060075

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public final e(Lhw;Lxn;Lk50;)V
    .locals 6

    .line 1
    iput-object p1, p0, Lzn;->h:Lhw;

    .line 2
    .line 3
    iput-object p2, p0, Lzn;->i:Lxn;

    .line 4
    .line 5
    iget-object p1, p2, Lxn;->c:Lmz0;

    .line 6
    .line 7
    sget v0, Lg6;->a:I

    .line 8
    .line 9
    iget-object v0, p0, Lzn;->j:Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    instance-of v1, v0, Landroid/view/WindowManager$LayoutParams;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    check-cast v0, Landroid/view/WindowManager$LayoutParams;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    :goto_0
    const/4 v1, 0x1

    .line 28
    const/16 v2, 0x2000

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 34
    .line 35
    and-int/2addr v0, v2

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    move v0, v1

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move v0, v3

    .line 41
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_4

    .line 46
    .line 47
    if-eq p1, v1, :cond_3

    .line 48
    .line 49
    const/4 v0, 0x2

    .line 50
    if-ne p1, v0, :cond_2

    .line 51
    .line 52
    move v0, v3

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    invoke-static {}, Lxc;->j()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_3
    move v0, v1

    .line 59
    :cond_4
    :goto_2
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    if-eqz v0, :cond_5

    .line 67
    .line 68
    move v0, v2

    .line 69
    goto :goto_3

    .line 70
    :cond_5
    const/16 v0, -0x2001

    .line 71
    .line 72
    :goto_3
    invoke-virtual {p1, v0, v2}, Landroid/view/Window;->setFlags(II)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-eqz p1, :cond_7

    .line 80
    .line 81
    if-ne p1, v1, :cond_6

    .line 82
    .line 83
    move p1, v1

    .line 84
    goto :goto_4

    .line 85
    :cond_6
    invoke-static {}, Lxc;->j()V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_7
    move p1, v3

    .line 90
    :goto_4
    iget-object p3, p0, Lzn;->k:Lwn;

    .line 91
    .line 92
    invoke-virtual {p3, p1}, Landroid/view/View;->setLayoutDirection(I)V

    .line 93
    .line 94
    .line 95
    iget-boolean p1, p2, Lxn;->e:Z

    .line 96
    .line 97
    iget-boolean v0, p2, Lxn;->d:Z

    .line 98
    .line 99
    iget-object v2, p3, Lwn;->l:Landroid/view/Window;

    .line 100
    .line 101
    iget-boolean v4, p3, Lwn;->p:Z

    .line 102
    .line 103
    if-eqz v4, :cond_9

    .line 104
    .line 105
    iget-boolean v4, p3, Lwn;->n:Z

    .line 106
    .line 107
    if-ne v0, v4, :cond_9

    .line 108
    .line 109
    iget-boolean v4, p3, Lwn;->o:Z

    .line 110
    .line 111
    if-eq p1, v4, :cond_8

    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_8
    move v4, v3

    .line 115
    goto :goto_6

    .line 116
    :cond_9
    :goto_5
    move v4, v1

    .line 117
    :goto_6
    iput-boolean v0, p3, Lwn;->n:Z

    .line 118
    .line 119
    iput-boolean p1, p3, Lwn;->o:Z

    .line 120
    .line 121
    if-eqz v4, :cond_c

    .line 122
    .line 123
    invoke-virtual {v2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    const/4 v5, -0x2

    .line 128
    if-eqz v0, :cond_a

    .line 129
    .line 130
    move v0, v5

    .line 131
    goto :goto_7

    .line 132
    :cond_a
    const/4 v0, -0x1

    .line 133
    :goto_7
    iget v4, v4, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 134
    .line 135
    if-ne v0, v4, :cond_b

    .line 136
    .line 137
    iget-boolean v4, p3, Lwn;->p:Z

    .line 138
    .line 139
    if-nez v4, :cond_c

    .line 140
    .line 141
    :cond_b
    invoke-virtual {v2, v0, v5}, Landroid/view/Window;->setLayout(II)V

    .line 142
    .line 143
    .line 144
    iput-boolean v1, p3, Lwn;->p:Z

    .line 145
    .line 146
    :cond_c
    iget-boolean p2, p2, Lxn;->b:Z

    .line 147
    .line 148
    invoke-virtual {p0, p2}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    if-eqz p0, :cond_f

    .line 156
    .line 157
    if-eqz p1, :cond_d

    .line 158
    .line 159
    goto :goto_8

    .line 160
    :cond_d
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 161
    .line 162
    const/16 p2, 0x1f

    .line 163
    .line 164
    if-ge p1, p2, :cond_e

    .line 165
    .line 166
    const/16 v3, 0x10

    .line 167
    .line 168
    goto :goto_8

    .line 169
    :cond_e
    const/16 v3, 0x30

    .line 170
    .line 171
    :goto_8
    invoke-virtual {p0, v3}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 172
    .line 173
    .line 174
    :cond_f
    return-void
.end method

.method public final getLifecycle()Ls90;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lzn;->c()Lz90;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getSavedStateRegistry()Lkx0;
    .locals 0

    .line 1
    iget-object p0, p0, Lzn;->e:Llx0;

    .line 2
    .line 3
    iget-object p0, p0, Llx0;->b:Lkx0;

    .line 4
    .line 5
    return-object p0
.end method

.method public final onBackPressed()V
    .locals 0

    .line 1
    iget-object p0, p0, Lzn;->f:Lx51;

    .line 2
    .line 3
    invoke-virtual {p0}, Lx51;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lao;

    .line 8
    .line 9
    invoke-virtual {p0}, Lti0;->a()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x21

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lzn;->g:Lx51;

    .line 11
    .line 12
    invoke-virtual {v0}, Lx51;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lbl0;

    .line 17
    .line 18
    invoke-static {p0}, Lz0;->h(Lzn;)Landroid/window/OnBackInvokedDispatcher;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lbl0;->b(Landroid/window/OnBackInvokedDispatcher;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lzn;->e:Llx0;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Llx0;->a(Landroid/os/Bundle;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lzn;->c()Lz90;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    sget-object p1, Lq90;->ON_CREATE:Lq90;

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Lz90;->e(Lq90;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lzn;->i:Lxn;

    .line 2
    .line 3
    iget-boolean v0, v0, Lxn;->a:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isTracking()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isCanceled()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const/16 v0, 0x6f

    .line 20
    .line 21
    if-ne p1, v0, :cond_0

    .line 22
    .line 23
    iget-object p0, p0, Lzn;->h:Lhw;

    .line 24
    .line 25
    invoke-interface {p0}, Lhw;->invoke()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x1

    .line 29
    return p0

    .line 30
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyUp(ILandroid/view/KeyEvent;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0
.end method

.method public final onSaveInstanceState()Landroid/os/Bundle;
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->onSaveInstanceState()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lzn;->e:Llx0;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Llx0;->b(Landroid/os/Bundle;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final onStart()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->onStart()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lzn;->c()Lz90;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, Lq90;->ON_RESUME:Lq90;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lz90;->e(Lq90;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onStop()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lzn;->c()Lz90;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lq90;->ON_DESTROY:Lq90;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lz90;->e(Lq90;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lzn;->d:Lz90;

    .line 12
    .line 13
    invoke-super {p0}, Landroid/app/Dialog;->onStop()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 9

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lzn;->i:Lxn;

    .line 6
    .line 7
    iget-boolean v1, v1, Lxn;->b:Z

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x1

    .line 12
    if-eqz v1, :cond_5

    .line 13
    .line 14
    iget-object v1, p0, Lzn;->k:Lwn;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    invoke-static {v5}, Ljava/lang/Float;->isInfinite(F)Z

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    if-nez v6, :cond_1

    .line 28
    .line 29
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-nez v5, :cond_1

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    invoke-static {v5}, Ljava/lang/Float;->isInfinite(F)Z

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-nez v6, :cond_1

    .line 44
    .line 45
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-nez v5, :cond_1

    .line 50
    .line 51
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    if-nez v5, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    add-int/2addr v7, v6

    .line 67
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    add-int/2addr v6, v7

    .line 72
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    add-int/2addr v8, v1

    .line 81
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    add-int/2addr v1, v8

    .line 86
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    invoke-static {v5}, Lrd0;->Q(F)I

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-gt v7, v5, :cond_1

    .line 95
    .line 96
    if-gt v5, v6, :cond_1

    .line 97
    .line 98
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    invoke-static {v5}, Lrd0;->Q(F)I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-gt v8, v5, :cond_1

    .line 107
    .line 108
    if-gt v5, v1, :cond_1

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-eqz p1, :cond_4

    .line 116
    .line 117
    if-eq p1, v4, :cond_3

    .line 118
    .line 119
    if-eq p1, v2, :cond_2

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_2
    iput-boolean v3, p0, Lzn;->l:Z

    .line 123
    .line 124
    return v0

    .line 125
    :cond_3
    iget-boolean p1, p0, Lzn;->l:Z

    .line 126
    .line 127
    if-eqz p1, :cond_6

    .line 128
    .line 129
    iget-object p1, p0, Lzn;->h:Lhw;

    .line 130
    .line 131
    invoke-interface {p1}, Lhw;->invoke()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    iput-boolean v3, p0, Lzn;->l:Z

    .line 135
    .line 136
    return v4

    .line 137
    :cond_4
    iput-boolean v4, p0, Lzn;->l:Z

    .line 138
    .line 139
    return v4

    .line 140
    :cond_5
    :goto_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    if-eqz p1, :cond_7

    .line 145
    .line 146
    if-eq p1, v4, :cond_7

    .line 147
    .line 148
    if-eq p1, v2, :cond_7

    .line 149
    .line 150
    :cond_6
    :goto_2
    return v0

    .line 151
    :cond_7
    iput-boolean v3, p0, Lzn;->l:Z

    .line 152
    .line 153
    return v0
.end method

.method public final setContentView(I)V
    .locals 0

    .line 11
    invoke-virtual {p0}, Lzn;->d()V

    .line 12
    invoke-super {p0, p1}, Landroid/app/Dialog;->setContentView(I)V

    return-void
.end method

.method public final setContentView(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lzn;->d()V

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    invoke-virtual {p0}, Lzn;->d()V

    .line 14
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method
