.class public final Lp80;
.super Landroid/app/Dialog;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lia1;
.implements Lpt1;
.implements Lgm1;
.implements Ltc2;


# instance fields
.field public h:Lla1;

.field public final i:Lrc2;

.field public final j:Lhx2;

.field public final k:Lhx2;

.field public l:Lxm0;

.field public m:Ln80;

.field public final n:Landroid/view/View;

.field public final o:Lm80;

.field public p:Z


# direct methods
.method public constructor <init>(Lxm0;Ln80;Landroid/view/View;Ld61;Le70;Ljava/util/UUID;)V
    .locals 5

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
    iget-boolean v2, p2, Ln80;->e:Z

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    const/high16 v2, 0x790c0000

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const v2, 0x790c0003

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
    new-instance v0, Lsc2;

    .line 25
    .line 26
    new-instance v2, Lta;

    .line 27
    .line 28
    const/16 v3, 0x14

    .line 29
    .line 30
    invoke-direct {v2, v3, p0}, Lta;-><init>(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, p0, v2}, Lsc2;-><init>(Ltc2;Lta;)V

    .line 34
    .line 35
    .line 36
    new-instance v2, Lrc2;

    .line 37
    .line 38
    invoke-direct {v2, v0}, Lrc2;-><init>(Lsc2;)V

    .line 39
    .line 40
    .line 41
    iput-object v2, p0, Lp80;->i:Lrc2;

    .line 42
    .line 43
    new-instance v0, Lfw;

    .line 44
    .line 45
    invoke-direct {v0, p0, v1}, Lfw;-><init>(Lp80;I)V

    .line 46
    .line 47
    .line 48
    new-instance v2, Lhx2;

    .line 49
    .line 50
    invoke-direct {v2, v0}, Lhx2;-><init>(Lxm0;)V

    .line 51
    .line 52
    .line 53
    iput-object v2, p0, Lp80;->j:Lhx2;

    .line 54
    .line 55
    new-instance v0, Lfw;

    .line 56
    .line 57
    const/4 v2, 0x1

    .line 58
    invoke-direct {v0, p0, v2}, Lfw;-><init>(Lp80;I)V

    .line 59
    .line 60
    .line 61
    new-instance v3, Lhx2;

    .line 62
    .line 63
    invoke-direct {v3, v0}, Lhx2;-><init>(Lxm0;)V

    .line 64
    .line 65
    .line 66
    iput-object v3, p0, Lp80;->k:Lhx2;

    .line 67
    .line 68
    iput-object p1, p0, Lp80;->l:Lxm0;

    .line 69
    .line 70
    iput-object p2, p0, Lp80;->m:Ln80;

    .line 71
    .line 72
    iput-object p3, p0, Lp80;->n:Landroid/view/View;

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
    if-eqz p1, :cond_8

    .line 80
    .line 81
    iget-object v0, p0, Lp80;->m:Ln80;

    .line 82
    .line 83
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    if-eqz v3, :cond_1

    .line 88
    .line 89
    invoke-virtual {v3}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    iget v0, v0, Ln80;->g:I

    .line 94
    .line 95
    iput v0, v4, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 96
    .line 97
    invoke-virtual {v3, v4}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 98
    .line 99
    .line 100
    :cond_1
    invoke-virtual {p1, v2}, Landroid/view/Window;->requestFeature(I)Z

    .line 101
    .line 102
    .line 103
    const v0, 0x106000d

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v0}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 107
    .line 108
    .line 109
    iget-object v0, p0, Lp80;->m:Ln80;

    .line 110
    .line 111
    iget-boolean v0, v0, Ln80;->e:Z

    .line 112
    .line 113
    invoke-static {p1, v0}, Lrd3;->a(Landroid/view/Window;Z)V

    .line 114
    .line 115
    .line 116
    const/16 v0, 0x11

    .line 117
    .line 118
    invoke-virtual {p1, v0}, Landroid/view/Window;->setGravity(I)V

    .line 119
    .line 120
    .line 121
    iget-object v0, p0, Lp80;->m:Ln80;

    .line 122
    .line 123
    iget-boolean v0, v0, Ln80;->e:Z

    .line 124
    .line 125
    if-nez v0, :cond_4

    .line 126
    .line 127
    const v0, 0x10100

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, v0}, Landroid/view/Window;->addFlags(I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 138
    .line 139
    const/16 v4, 0x1c

    .line 140
    .line 141
    if-lt v3, v4, :cond_2

    .line 142
    .line 143
    sget-object v4, Lke;->a:Lke;

    .line 144
    .line 145
    invoke-virtual {v4, v0}, Lke;->a(Landroid/view/WindowManager$LayoutParams;)V

    .line 146
    .line 147
    .line 148
    :cond_2
    const/16 v4, 0x1e

    .line 149
    .line 150
    if-lt v3, v4, :cond_3

    .line 151
    .line 152
    sget-object v3, Lle;->a:Lle;

    .line 153
    .line 154
    invoke-virtual {v3, v0, v1}, Lle;->b(Landroid/view/WindowManager$LayoutParams;I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v3, v0, v1}, Lle;->c(Landroid/view/WindowManager$LayoutParams;I)V

    .line 158
    .line 159
    .line 160
    :cond_3
    invoke-virtual {p1, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 161
    .line 162
    .line 163
    :cond_4
    new-instance v0, Lm80;

    .line 164
    .line 165
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-direct {v0, v3, p1}, Lm80;-><init>(Landroid/content/Context;Landroid/view/Window;)V

    .line 170
    .line 171
    .line 172
    iget-object v3, p0, Lp80;->m:Ln80;

    .line 173
    .line 174
    iget-object v3, v3, Ln80;->f:Ljava/lang/String;

    .line 175
    .line 176
    invoke-virtual {p0, v3}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 177
    .line 178
    .line 179
    new-instance v3, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    const-string v4, "Dialog:"

    .line 182
    .line 183
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v3, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p6

    .line 193
    const v3, 0x79080033

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0, v3, p6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 200
    .line 201
    .line 202
    const/high16 p6, 0x41000000    # 8.0f

    .line 203
    .line 204
    invoke-interface {p5, p6}, Le70;->A(F)F

    .line 205
    .line 206
    .line 207
    move-result p5

    .line 208
    invoke-virtual {v0, p5}, Landroid/view/View;->setElevation(F)V

    .line 209
    .line 210
    .line 211
    new-instance p5, Lo80;

    .line 212
    .line 213
    invoke-direct {p5, v1}, Lo80;-><init>(I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, p5}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 217
    .line 218
    .line 219
    iput-object v0, p0, Lp80;->o:Lm80;

    .line 220
    .line 221
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    instance-of p5, p1, Landroid/view/ViewGroup;

    .line 226
    .line 227
    if-eqz p5, :cond_5

    .line 228
    .line 229
    move-object p2, p1

    .line 230
    check-cast p2, Landroid/view/ViewGroup;

    .line 231
    .line 232
    :cond_5
    if-eqz p2, :cond_6

    .line 233
    .line 234
    invoke-static {p2}, Lp80;->b(Landroid/view/ViewGroup;)V

    .line 235
    .line 236
    .line 237
    :cond_6
    invoke-virtual {p0, v0}, Lp80;->setContentView(Landroid/view/View;)V

    .line 238
    .line 239
    .line 240
    invoke-static {p3}, Lrb3;->b(Landroid/view/View;)Lia1;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    const p2, 0x79080080

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0, p2, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    invoke-static {p3}, Ltb3;->b(Landroid/view/View;)Llb3;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    const p2, 0x79080084

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0, p2, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    invoke-static {p3}, Lsb3;->b(Landroid/view/View;)Ltc2;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    const p2, 0x79080083

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0, p2, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    iget-object p1, p0, Lp80;->l:Lxm0;

    .line 271
    .line 272
    iget-object p2, p0, Lp80;->m:Ln80;

    .line 273
    .line 274
    invoke-virtual {p0, p1, p2, p4}, Lp80;->e(Lxm0;Ln80;Ld61;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {p0}, Lp80;->getOnBackPressedDispatcher()Lot1;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    new-instance p2, Lg8;

    .line 282
    .line 283
    invoke-direct {p2, p0, v2}, Lg8;-><init>(Lp80;I)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    new-instance p3, Lfj;

    .line 290
    .line 291
    invoke-direct {p3, p2}, Lfj;-><init>(Lg8;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {p0}, Lp80;->c()Lla1;

    .line 295
    .line 296
    .line 297
    move-result-object p2

    .line 298
    iget-object p4, p2, Lla1;->h:Laa1;

    .line 299
    .line 300
    sget-object p5, Laa1;->h:Laa1;

    .line 301
    .line 302
    if-ne p4, p5, :cond_7

    .line 303
    .line 304
    return-void

    .line 305
    :cond_7
    new-instance p4, Lkt1;

    .line 306
    .line 307
    invoke-direct {p4, p3, p0}, Lkt1;-><init>(Lfj;Lia1;)V

    .line 308
    .line 309
    .line 310
    new-instance p0, Ljt1;

    .line 311
    .line 312
    invoke-direct {p0, p3, p4}, Ljt1;-><init>(Lfj;Lkt1;)V

    .line 313
    .line 314
    .line 315
    iget-object p4, p3, Lfj;->a:Ljava/util/ArrayList;

    .line 316
    .line 317
    invoke-virtual {p4, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    invoke-virtual {p0, v1}, Ljt1;->g(Z)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {p1}, Lot1;->a()Lfm1;

    .line 324
    .line 325
    .line 326
    move-result-object p4

    .line 327
    invoke-static {p4, p0}, Lfm1;->a(Lfm1;Lhm1;)V

    .line 328
    .line 329
    .line 330
    new-instance p4, Ly50;

    .line 331
    .line 332
    invoke-direct {p4, p0, p1, p2}, Ly50;-><init>(Ljt1;Lot1;Lba1;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {p2, p4}, Lla1;->a(Lha1;)V

    .line 336
    .line 337
    .line 338
    new-instance p0, Llt1;

    .line 339
    .line 340
    invoke-direct {p0, p2, p4}, Llt1;-><init>(Lba1;Ly50;)V

    .line 341
    .line 342
    .line 343
    iget-object p1, p3, Lfj;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 344
    .line 345
    invoke-virtual {p1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    return-void

    .line 349
    :cond_8
    const-string p0, "Dialog has no window"

    .line 350
    .line 351
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    throw p2
.end method

.method public static a(Lp80;)V
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
    instance-of v1, p0, Lm80;

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
    invoke-static {v2}, Lp80;->b(Landroid/view/ViewGroup;)V

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
    invoke-virtual {p0}, Lp80;->d()V

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final c()Lla1;
    .locals 2

    .line 1
    iget-object v0, p0, Lp80;->h:Lla1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lla1;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, p0, v1}, Lla1;-><init>(Lia1;Z)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lp80;->h:Lla1;

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
    const v1, 0x79080080

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
    const v1, 0x79080082

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
    const v1, 0x79080083

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
    const v1, 0x79080081

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public final e(Lxm0;Ln80;Ld61;)V
    .locals 6

    .line 1
    iput-object p1, p0, Lp80;->l:Lxm0;

    .line 2
    .line 3
    iput-object p2, p0, Lp80;->m:Ln80;

    .line 4
    .line 5
    iget-object p1, p2, Ln80;->c:Lkm2;

    .line 6
    .line 7
    iget-object v0, p0, Lp80;->n:Landroid/view/View;

    .line 8
    .line 9
    invoke-static {v0}, Lpa;->b(Landroid/view/View;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x1

    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    if-eq p1, v2, :cond_1

    .line 22
    .line 23
    const/4 v0, 0x2

    .line 24
    if-ne p1, v0, :cond_0

    .line 25
    .line 26
    move v0, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {}, Lc80;->s()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    move v0, v2

    .line 33
    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    const/16 v3, 0x2000

    .line 41
    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    move v0, v3

    .line 45
    goto :goto_1

    .line 46
    :cond_3
    const/16 v0, -0x2001

    .line 47
    .line 48
    :goto_1
    invoke-virtual {p1, v0, v3}, Landroid/view/Window;->setFlags(II)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_5

    .line 56
    .line 57
    if-ne p1, v2, :cond_4

    .line 58
    .line 59
    move p1, v2

    .line 60
    goto :goto_2

    .line 61
    :cond_4
    invoke-static {}, Lc80;->s()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_5
    move p1, v1

    .line 66
    :goto_2
    iget-object p3, p0, Lp80;->o:Lm80;

    .line 67
    .line 68
    invoke-virtual {p3, p1}, Landroid/view/View;->setLayoutDirection(I)V

    .line 69
    .line 70
    .line 71
    iget-boolean p1, p2, Ln80;->e:Z

    .line 72
    .line 73
    iget-boolean v0, p2, Ln80;->d:Z

    .line 74
    .line 75
    iget-object v3, p3, Lm80;->q:Landroid/view/Window;

    .line 76
    .line 77
    iget-boolean v4, p3, Lm80;->u:Z

    .line 78
    .line 79
    if-eqz v4, :cond_7

    .line 80
    .line 81
    iget-boolean v4, p3, Lm80;->s:Z

    .line 82
    .line 83
    if-ne v0, v4, :cond_7

    .line 84
    .line 85
    iget-boolean v4, p3, Lm80;->t:Z

    .line 86
    .line 87
    if-eq p1, v4, :cond_6

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_6
    move v4, v1

    .line 91
    goto :goto_4

    .line 92
    :cond_7
    :goto_3
    move v4, v2

    .line 93
    :goto_4
    iput-boolean v0, p3, Lm80;->s:Z

    .line 94
    .line 95
    iput-boolean p1, p3, Lm80;->t:Z

    .line 96
    .line 97
    if-eqz v4, :cond_a

    .line 98
    .line 99
    invoke-virtual {v3}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    const/4 v5, -0x2

    .line 104
    if-eqz v0, :cond_8

    .line 105
    .line 106
    move v0, v5

    .line 107
    goto :goto_5

    .line 108
    :cond_8
    const/4 v0, -0x1

    .line 109
    :goto_5
    iget v4, v4, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 110
    .line 111
    if-ne v0, v4, :cond_9

    .line 112
    .line 113
    iget-boolean v4, p3, Lm80;->u:Z

    .line 114
    .line 115
    if-nez v4, :cond_a

    .line 116
    .line 117
    :cond_9
    invoke-virtual {v3, v0, v5}, Landroid/view/Window;->setLayout(II)V

    .line 118
    .line 119
    .line 120
    iput-boolean v2, p3, Lm80;->u:Z

    .line 121
    .line 122
    :cond_a
    iget-boolean p2, p2, Ln80;->b:Z

    .line 123
    .line 124
    invoke-virtual {p0, p2}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    if-eqz p0, :cond_d

    .line 132
    .line 133
    if-eqz p1, :cond_b

    .line 134
    .line 135
    goto :goto_6

    .line 136
    :cond_b
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 137
    .line 138
    const/16 p2, 0x1f

    .line 139
    .line 140
    if-ge p1, p2, :cond_c

    .line 141
    .line 142
    const/16 v1, 0x10

    .line 143
    .line 144
    goto :goto_6

    .line 145
    :cond_c
    const/16 v1, 0x30

    .line 146
    .line 147
    :goto_6
    invoke-virtual {p0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 148
    .line 149
    .line 150
    :cond_d
    return-void
.end method

.method public final getLifecycle()Lba1;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lp80;->c()Lla1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getNavigationEventDispatcher()Lfm1;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lp80;->getOnBackPressedDispatcher()Lot1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lot1;->a()Lfm1;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final getOnBackPressedDispatcher()Lot1;
    .locals 0

    .line 1
    iget-object p0, p0, Lp80;->k:Lhx2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lot1;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getSavedStateRegistry()Lqc2;
    .locals 0

    .line 1
    iget-object p0, p0, Lp80;->i:Lrc2;

    .line 2
    .line 3
    iget-object p0, p0, Lrc2;->b:Lqc2;

    .line 4
    .line 5
    return-object p0
.end method

.method public final onBackPressed()V
    .locals 0

    .line 1
    iget-object p0, p0, Lp80;->j:Lhx2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lq80;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljm1;->a()V

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
    invoke-virtual {p0}, Lp80;->getOnBackPressedDispatcher()Lot1;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {p0}, Ld4;->l(Lp80;)Landroid/window/OnBackInvokedDispatcher;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lot1;->b(Landroid/window/OnBackInvokedDispatcher;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lp80;->i:Lrc2;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lrc2;->a(Landroid/os/Bundle;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lp80;->c()Lla1;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    sget-object p1, Lz91;->ON_CREATE:Lz91;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lla1;->e(Lz91;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lp80;->m:Ln80;

    .line 2
    .line 3
    iget-boolean v0, v0, Ln80;->a:Z

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
    iget-object p0, p0, Lp80;->l:Lxm0;

    .line 24
    .line 25
    invoke-interface {p0}, Lxm0;->a()Ljava/lang/Object;

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
    iget-object p0, p0, Lp80;->i:Lrc2;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lrc2;->b(Landroid/os/Bundle;)V

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
    invoke-virtual {p0}, Lp80;->c()Lla1;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, Lz91;->ON_RESUME:Lz91;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lla1;->e(Lz91;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onStop()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lp80;->c()Lla1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lz91;->ON_DESTROY:Lz91;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lla1;->e(Lz91;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lp80;->h:Lla1;

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
    iget-object v1, p0, Lp80;->m:Ln80;

    .line 6
    .line 7
    iget-boolean v1, v1, Ln80;->b:Z

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
    iget-object v1, p0, Lp80;->o:Lm80;

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
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    const v6, 0x7f7fffff    # Float.MAX_VALUE

    .line 28
    .line 29
    .line 30
    cmpg-float v5, v5, v6

    .line 31
    .line 32
    if-gtz v5, :cond_1

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    cmpg-float v5, v5, v6

    .line 43
    .line 44
    if-gtz v5, :cond_1

    .line 45
    .line 46
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    if-nez v5, :cond_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    add-int/2addr v7, v6

    .line 62
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    add-int/2addr v6, v7

    .line 67
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    add-int/2addr v8, v1

    .line 76
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    add-int/2addr v1, v8

    .line 81
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    invoke-static {v5}, Lgf1;->Q(F)I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-gt v7, v5, :cond_1

    .line 90
    .line 91
    if-gt v5, v6, :cond_1

    .line 92
    .line 93
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    invoke-static {v5}, Lgf1;->Q(F)I

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-gt v8, v5, :cond_1

    .line 102
    .line 103
    if-gt v5, v1, :cond_1

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-eqz p1, :cond_4

    .line 111
    .line 112
    if-eq p1, v4, :cond_3

    .line 113
    .line 114
    if-eq p1, v2, :cond_2

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_2
    iput-boolean v3, p0, Lp80;->p:Z

    .line 118
    .line 119
    return v0

    .line 120
    :cond_3
    iget-boolean p1, p0, Lp80;->p:Z

    .line 121
    .line 122
    if-eqz p1, :cond_6

    .line 123
    .line 124
    iget-object p1, p0, Lp80;->l:Lxm0;

    .line 125
    .line 126
    invoke-interface {p1}, Lxm0;->a()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    iput-boolean v3, p0, Lp80;->p:Z

    .line 130
    .line 131
    return v4

    .line 132
    :cond_4
    iput-boolean v4, p0, Lp80;->p:Z

    .line 133
    .line 134
    return v4

    .line 135
    :cond_5
    :goto_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-eqz p1, :cond_7

    .line 140
    .line 141
    if-eq p1, v4, :cond_7

    .line 142
    .line 143
    if-eq p1, v2, :cond_7

    .line 144
    .line 145
    :cond_6
    :goto_2
    return v0

    .line 146
    :cond_7
    iput-boolean v3, p0, Lp80;->p:Z

    .line 147
    .line 148
    return v0
.end method

.method public final setContentView(I)V
    .locals 0

    .line 11
    invoke-virtual {p0}, Lp80;->d()V

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
    invoke-virtual {p0}, Lp80;->d()V

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
    invoke-virtual {p0}, Lp80;->d()V

    .line 14
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method
