.class public final Lj50;
.super Ljava/lang/Object;


# instance fields
.field public A:Ljava/lang/CharSequence;

.field public B:Ljava/lang/CharSequence;

.field public C:Landroid/content/res/ColorStateList;

.field public D:Landroid/graphics/PorterDuff$Mode;

.field public final synthetic E:Lk50;

.field public final a:Landroid/view/Menu;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:I

.field public j:I

.field public k:Ljava/lang/CharSequence;

.field public l:Ljava/lang/CharSequence;

.field public m:I

.field public n:C

.field public o:I

.field public p:C

.field public q:I

.field public r:I

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:I

.field public w:I

.field public x:Ljava/lang/String;

.field public y:Ljava/lang/String;

.field public z:Lpu;


# direct methods
.method public constructor <init>(Lk50;Landroid/view/Menu;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj50;->E:Lk50;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lj50;->C:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    iput-object p1, p0, Lj50;->D:Landroid/graphics/PorterDuff$Mode;

    .line 10
    .line 11
    iput-object p2, p0, Lj50;->a:Landroid/view/Menu;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput p1, p0, Lj50;->b:I

    .line 15
    .line 16
    iput p1, p0, Lj50;->c:I

    .line 17
    .line 18
    iput p1, p0, Lj50;->d:I

    .line 19
    .line 20
    iput p1, p0, Lj50;->e:I

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Lj50;->f:Z

    .line 24
    .line 25
    iput-boolean p1, p0, Lj50;->g:Z

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lj50;->E:Lk50;

    .line 2
    .line 3
    iget-object v0, v0, Lk50;->c:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {p1, v1, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-virtual {p2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2, p3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    return-object p1

    .line 27
    :catch_0
    move-exception p2

    .line 28
    new-instance p3, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v0, "Cannot instantiate class: "

    .line 31
    .line 32
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const-string p3, "SupportMenuInflater"

    .line 43
    .line 44
    invoke-static {p3, p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    return-object p1
.end method

.method public final b(Landroid/view/MenuItem;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lj50;->E:Lk50;

    .line 2
    .line 3
    iget-object v1, v0, Lk50;->c:Landroid/content/Context;

    .line 4
    .line 5
    iget-boolean v2, p0, Lj50;->s:Z

    .line 6
    .line 7
    invoke-interface {p1, v2}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-boolean v3, p0, Lj50;->t:Z

    .line 12
    .line 13
    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-boolean v3, p0, Lj50;->u:Z

    .line 18
    .line 19
    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget v3, p0, Lj50;->r:I

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x1

    .line 27
    if-lt v3, v5, :cond_0

    .line 28
    .line 29
    move v3, v5

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v3, v4

    .line 32
    :goto_0
    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iget-object v3, p0, Lj50;->l:Ljava/lang/CharSequence;

    .line 37
    .line 38
    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    iget v3, p0, Lj50;->m:I

    .line 43
    .line 44
    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 45
    .line 46
    .line 47
    iget v2, p0, Lj50;->v:I

    .line 48
    .line 49
    if-ltz v2, :cond_1

    .line 50
    .line 51
    invoke-interface {p1, v2}, Landroid/view/MenuItem;->setShowAsAction(I)V

    .line 52
    .line 53
    .line 54
    :cond_1
    iget-object v2, p0, Lj50;->y:Ljava/lang/String;

    .line 55
    .line 56
    if-eqz v2, :cond_4

    .line 57
    .line 58
    invoke-virtual {v1}, Landroid/content/Context;->isRestricted()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-nez v2, :cond_3

    .line 63
    .line 64
    new-instance v2, Li50;

    .line 65
    .line 66
    iget-object v3, v0, Lk50;->d:Ljava/lang/Object;

    .line 67
    .line 68
    if-nez v3, :cond_2

    .line 69
    .line 70
    invoke-static {v1}, Lk50;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iput-object v1, v0, Lk50;->d:Ljava/lang/Object;

    .line 75
    .line 76
    :cond_2
    iget-object v1, v0, Lk50;->d:Ljava/lang/Object;

    .line 77
    .line 78
    iget-object v3, p0, Lj50;->y:Ljava/lang/String;

    .line 79
    .line 80
    invoke-direct {v2}, Li50;-><init>()V

    .line 81
    .line 82
    .line 83
    iput-object v1, v2, Li50;->b:Ljava/lang/Object;

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    :try_start_0
    sget-object v6, Li50;->d:[Ljava/lang/Class;

    .line 90
    .line 91
    invoke-virtual {v1, v3, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    iput-object v6, v2, Li50;->c:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 96
    .line 97
    invoke-interface {p1, v2}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :catch_0
    move-exception p1

    .line 102
    new-instance v0, Landroid/view/InflateException;

    .line 103
    .line 104
    new-instance v2, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    const-string v4, "Couldn\'t resolve menu item onClick handler "

    .line 107
    .line 108
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v3, " in class "

    .line 115
    .line 116
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-direct {v0, v1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 134
    .line 135
    .line 136
    throw v0

    .line 137
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 138
    .line 139
    const-string v0, "The android:onClick attribute cannot be used within a restricted context"

    .line 140
    .line 141
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw p1

    .line 145
    :cond_4
    :goto_1
    iget v1, p0, Lj50;->r:I

    .line 146
    .line 147
    const/4 v2, 0x2

    .line 148
    if-lt v1, v2, :cond_7

    .line 149
    .line 150
    instance-of v1, p1, Lou;

    .line 151
    .line 152
    if-eqz v1, :cond_5

    .line 153
    .line 154
    move-object v1, p1

    .line 155
    check-cast v1, Lou;

    .line 156
    .line 157
    iget v2, v1, Lou;->x:I

    .line 158
    .line 159
    and-int/lit8 v2, v2, -0x5

    .line 160
    .line 161
    or-int/lit8 v2, v2, 0x4

    .line 162
    .line 163
    iput v2, v1, Lou;->x:I

    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_5
    instance-of v1, p1, Lsu;

    .line 167
    .line 168
    if-eqz v1, :cond_7

    .line 169
    .line 170
    move-object v1, p1

    .line 171
    check-cast v1, Lsu;

    .line 172
    .line 173
    iget-object v2, v1, Lsu;->c:Ll50;

    .line 174
    .line 175
    :try_start_1
    iget-object v3, v1, Lsu;->d:Ljava/lang/reflect/Method;

    .line 176
    .line 177
    if-nez v3, :cond_6

    .line 178
    .line 179
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    const-string v6, "setExclusiveCheckable"

    .line 184
    .line 185
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 186
    .line 187
    filled-new-array {v7}, [Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    invoke-virtual {v3, v6, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    iput-object v3, v1, Lsu;->d:Ljava/lang/reflect/Method;

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :catch_1
    move-exception v1

    .line 199
    goto :goto_3

    .line 200
    :cond_6
    :goto_2
    iget-object v1, v1, Lsu;->d:Ljava/lang/reflect/Method;

    .line 201
    .line 202
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 203
    .line 204
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 209
    .line 210
    .line 211
    goto :goto_4

    .line 212
    :goto_3
    const-string v2, "MenuItemWrapper"

    .line 213
    .line 214
    const-string v3, "Error while calling setExclusiveCheckable"

    .line 215
    .line 216
    invoke-static {v2, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 217
    .line 218
    .line 219
    :cond_7
    :goto_4
    iget-object v1, p0, Lj50;->x:Ljava/lang/String;

    .line 220
    .line 221
    if-eqz v1, :cond_8

    .line 222
    .line 223
    sget-object v2, Lk50;->e:[Ljava/lang/Class;

    .line 224
    .line 225
    iget-object v0, v0, Lk50;->a:[Ljava/lang/Object;

    .line 226
    .line 227
    invoke-virtual {p0, v1, v2, v0}, Lj50;->a(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    check-cast v0, Landroid/view/View;

    .line 232
    .line 233
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setActionView(Landroid/view/View;)Landroid/view/MenuItem;

    .line 234
    .line 235
    .line 236
    move v4, v5

    .line 237
    :cond_8
    iget v0, p0, Lj50;->w:I

    .line 238
    .line 239
    if-lez v0, :cond_a

    .line 240
    .line 241
    if-nez v4, :cond_9

    .line 242
    .line 243
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setActionView(I)Landroid/view/MenuItem;

    .line 244
    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_9
    const-string v0, "SupportMenuInflater"

    .line 248
    .line 249
    const-string v1, "Ignoring attribute \'itemActionViewLayout\'. Action view already specified."

    .line 250
    .line 251
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 252
    .line 253
    .line 254
    :cond_a
    :goto_5
    iget-object v0, p0, Lj50;->z:Lpu;

    .line 255
    .line 256
    if-eqz v0, :cond_c

    .line 257
    .line 258
    instance-of v1, p1, Ll50;

    .line 259
    .line 260
    if-eqz v1, :cond_b

    .line 261
    .line 262
    move-object v1, p1

    .line 263
    check-cast v1, Ll50;

    .line 264
    .line 265
    invoke-interface {v1, v0}, Ll50;->a(Lpu;)Ll50;

    .line 266
    .line 267
    .line 268
    goto :goto_6

    .line 269
    :cond_b
    const-string v0, "MenuItemCompat"

    .line 270
    .line 271
    const-string v1, "setActionProvider: item does not implement SupportMenuItem; ignoring"

    .line 272
    .line 273
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 274
    .line 275
    .line 276
    :cond_c
    :goto_6
    iget-object v0, p0, Lj50;->A:Ljava/lang/CharSequence;

    .line 277
    .line 278
    instance-of v1, p1, Ll50;

    .line 279
    .line 280
    if-eqz v1, :cond_d

    .line 281
    .line 282
    move-object v2, p1

    .line 283
    check-cast v2, Ll50;

    .line 284
    .line 285
    invoke-interface {v2, v0}, Ll50;->setContentDescription(Ljava/lang/CharSequence;)Ll50;

    .line 286
    .line 287
    .line 288
    goto :goto_7

    .line 289
    :cond_d
    invoke-static {p1, v0}, Lmu;->h(Landroid/view/MenuItem;Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 290
    .line 291
    .line 292
    :goto_7
    iget-object v0, p0, Lj50;->B:Ljava/lang/CharSequence;

    .line 293
    .line 294
    if-eqz v1, :cond_e

    .line 295
    .line 296
    move-object v2, p1

    .line 297
    check-cast v2, Ll50;

    .line 298
    .line 299
    invoke-interface {v2, v0}, Ll50;->setTooltipText(Ljava/lang/CharSequence;)Ll50;

    .line 300
    .line 301
    .line 302
    goto :goto_8

    .line 303
    :cond_e
    invoke-static {p1, v0}, Lmu;->m(Landroid/view/MenuItem;Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 304
    .line 305
    .line 306
    :goto_8
    iget-char v0, p0, Lj50;->n:C

    .line 307
    .line 308
    iget v2, p0, Lj50;->o:I

    .line 309
    .line 310
    if-eqz v1, :cond_f

    .line 311
    .line 312
    move-object v3, p1

    .line 313
    check-cast v3, Ll50;

    .line 314
    .line 315
    invoke-interface {v3, v0, v2}, Ll50;->setAlphabeticShortcut(CI)Landroid/view/MenuItem;

    .line 316
    .line 317
    .line 318
    goto :goto_9

    .line 319
    :cond_f
    invoke-static {p1, v0, v2}, Lmu;->g(Landroid/view/MenuItem;CI)Landroid/view/MenuItem;

    .line 320
    .line 321
    .line 322
    :goto_9
    iget-char v0, p0, Lj50;->p:C

    .line 323
    .line 324
    iget v2, p0, Lj50;->q:I

    .line 325
    .line 326
    if-eqz v1, :cond_10

    .line 327
    .line 328
    move-object v3, p1

    .line 329
    check-cast v3, Ll50;

    .line 330
    .line 331
    invoke-interface {v3, v0, v2}, Ll50;->setNumericShortcut(CI)Landroid/view/MenuItem;

    .line 332
    .line 333
    .line 334
    goto :goto_a

    .line 335
    :cond_10
    invoke-static {p1, v0, v2}, Lmu;->k(Landroid/view/MenuItem;CI)Landroid/view/MenuItem;

    .line 336
    .line 337
    .line 338
    :goto_a
    iget-object v0, p0, Lj50;->D:Landroid/graphics/PorterDuff$Mode;

    .line 339
    .line 340
    if-eqz v0, :cond_12

    .line 341
    .line 342
    if-eqz v1, :cond_11

    .line 343
    .line 344
    move-object v2, p1

    .line 345
    check-cast v2, Ll50;

    .line 346
    .line 347
    invoke-interface {v2, v0}, Ll50;->setIconTintMode(Landroid/graphics/PorterDuff$Mode;)Landroid/view/MenuItem;

    .line 348
    .line 349
    .line 350
    goto :goto_b

    .line 351
    :cond_11
    invoke-static {p1, v0}, Lmu;->j(Landroid/view/MenuItem;Landroid/graphics/PorterDuff$Mode;)Landroid/view/MenuItem;

    .line 352
    .line 353
    .line 354
    :cond_12
    :goto_b
    iget-object v0, p0, Lj50;->C:Landroid/content/res/ColorStateList;

    .line 355
    .line 356
    if-eqz v0, :cond_14

    .line 357
    .line 358
    if-eqz v1, :cond_13

    .line 359
    .line 360
    check-cast p1, Ll50;

    .line 361
    .line 362
    invoke-interface {p1, v0}, Ll50;->setIconTintList(Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;

    .line 363
    .line 364
    .line 365
    goto :goto_c

    .line 366
    :cond_13
    invoke-static {p1, v0}, Lmu;->i(Landroid/view/MenuItem;Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;

    .line 367
    .line 368
    .line 369
    :cond_14
    :goto_c
    return-void
.end method
