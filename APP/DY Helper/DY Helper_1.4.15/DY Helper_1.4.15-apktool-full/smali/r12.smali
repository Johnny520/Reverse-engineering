.class public final Lr12;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public Α:Ljava/lang/String;

.field public Β:Lｘ;

.field public Γ:Ljava/lang/CharSequence;

.field public Δ:Ljava/lang/CharSequence;

.field public Ε:Landroid/content/res/ColorStateList;

.field public Ζ:Landroid/graphics/PorterDuff$Mode;

.field public final synthetic Η:Ls12;

.field public final α:Landroid/view/Menu;

.field public β:I

.field public γ:I

.field public δ:I

.field public ε:I

.field public ζ:Z

.field public η:Z

.field public θ:Z

.field public ι:I

.field public κ:I

.field public λ:Ljava/lang/CharSequence;

.field public μ:Ljava/lang/CharSequence;

.field public ν:I

.field public ξ:C

.field public ο:I

.field public π:C

.field public ρ:I

.field public σ:I

.field public τ:Z

.field public υ:Z

.field public φ:Z

.field public χ:I

.field public ψ:I

.field public ω:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ls12;Landroid/view/Menu;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr12;->Η:Ls12;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lr12;->Ε:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    iput-object p1, p0, Lr12;->Ζ:Landroid/graphics/PorterDuff$Mode;

    .line 10
    .line 11
    iput-object p2, p0, Lr12;->α:Landroid/view/Menu;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput p1, p0, Lr12;->β:I

    .line 15
    .line 16
    iput p1, p0, Lr12;->γ:I

    .line 17
    .line 18
    iput p1, p0, Lr12;->δ:I

    .line 19
    .line 20
    iput p1, p0, Lr12;->ε:I

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Lr12;->ζ:Z

    .line 24
    .line 25
    iput-boolean p1, p0, Lr12;->η:Z

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final α(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    :try_start_0
    iget-object p0, p0, Lr12;->Η:Ls12;

    .line 2
    .line 3
    iget-object p0, p0, Ls12;->γ:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {p1, v0, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0, p2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const/4 p2, 0x1

    .line 19
    invoke-virtual {p0, p2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    return-object p0

    .line 27
    :catch_0
    move-exception p0

    .line 28
    new-instance p2, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string p3, "Cannot instantiate class: "

    .line 31
    .line 32
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const-string p2, "SupportMenuInflater"

    .line 43
    .line 44
    invoke-static {p2, p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0
.end method

.method public final β(Landroid/view/MenuItem;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lr12;->Η:Ls12;

    .line 2
    .line 3
    iget-object v1, v0, Ls12;->γ:Landroid/content/Context;

    .line 4
    .line 5
    iget-boolean v2, p0, Lr12;->τ:Z

    .line 6
    .line 7
    invoke-interface {p1, v2}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-boolean v3, p0, Lr12;->υ:Z

    .line 12
    .line 13
    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-boolean v3, p0, Lr12;->φ:Z

    .line 18
    .line 19
    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget v3, p0, Lr12;->σ:I

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
    iget-object v3, p0, Lr12;->μ:Ljava/lang/CharSequence;

    .line 37
    .line 38
    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    iget v3, p0, Lr12;->ν:I

    .line 43
    .line 44
    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 45
    .line 46
    .line 47
    iget v2, p0, Lr12;->χ:I

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
    iget-object v2, p0, Lr12;->Α:Ljava/lang/String;

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
    new-instance v2, Lq12;

    .line 65
    .line 66
    iget-object v3, v0, Ls12;->δ:Ljava/lang/Object;

    .line 67
    .line 68
    if-nez v3, :cond_2

    .line 69
    .line 70
    invoke-static {v1}, Ls12;->α(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iput-object v1, v0, Ls12;->δ:Ljava/lang/Object;

    .line 75
    .line 76
    :cond_2
    iget-object v1, v0, Ls12;->δ:Ljava/lang/Object;

    .line 77
    .line 78
    iget-object v3, p0, Lr12;->Α:Ljava/lang/String;

    .line 79
    .line 80
    invoke-direct {v2}, Lq12;-><init>()V

    .line 81
    .line 82
    .line 83
    iput-object v1, v2, Lq12;->β:Ljava/lang/Object;

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    :try_start_0
    sget-object v6, Lq12;->δ:[Ljava/lang/Class;

    .line 90
    .line 91
    invoke-virtual {v1, v3, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    iput-object v6, v2, Lq12;->γ:Ljava/lang/Object;
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
    move-exception p0

    .line 102
    new-instance p1, Landroid/view/InflateException;

    .line 103
    .line 104
    new-instance v0, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    const-string v2, "Couldn\'t resolve menu item onClick handler "

    .line 107
    .line 108
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v2, " in class "

    .line 115
    .line 116
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-direct {p1, v0}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 134
    .line 135
    .line 136
    throw p1

    .line 137
    :cond_3
    const-string p0, "The android:onClick attribute cannot be used within a restricted context"

    .line 138
    .line 139
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :cond_4
    :goto_1
    iget v1, p0, Lr12;->σ:I

    .line 144
    .line 145
    const/4 v2, 0x2

    .line 146
    if-lt v1, v2, :cond_7

    .line 147
    .line 148
    instance-of v1, p1, Llz0;

    .line 149
    .line 150
    if-eqz v1, :cond_5

    .line 151
    .line 152
    move-object v1, p1

    .line 153
    check-cast v1, Llz0;

    .line 154
    .line 155
    iget v2, v1, Llz0;->ω:I

    .line 156
    .line 157
    and-int/lit8 v2, v2, -0x5

    .line 158
    .line 159
    or-int/lit8 v2, v2, 0x4

    .line 160
    .line 161
    iput v2, v1, Llz0;->ω:I

    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_5
    instance-of v1, p1, Landroidx/appcompat/view/menu/α;

    .line 165
    .line 166
    if-eqz v1, :cond_7

    .line 167
    .line 168
    move-object v1, p1

    .line 169
    check-cast v1, Landroidx/appcompat/view/menu/α;

    .line 170
    .line 171
    iget-object v2, v1, Landroidx/appcompat/view/menu/α;->γ:Lt12;

    .line 172
    .line 173
    :try_start_1
    iget-object v3, v1, Landroidx/appcompat/view/menu/α;->δ:Ljava/lang/reflect/Method;

    .line 174
    .line 175
    if-nez v3, :cond_6

    .line 176
    .line 177
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    const-string v6, "setExclusiveCheckable"

    .line 182
    .line 183
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 184
    .line 185
    filled-new-array {v7}, [Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    invoke-virtual {v3, v6, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    iput-object v3, v1, Landroidx/appcompat/view/menu/α;->δ:Ljava/lang/reflect/Method;

    .line 194
    .line 195
    goto :goto_2

    .line 196
    :catch_1
    move-exception v1

    .line 197
    goto :goto_3

    .line 198
    :cond_6
    :goto_2
    iget-object v1, v1, Landroidx/appcompat/view/menu/α;->δ:Ljava/lang/reflect/Method;

    .line 199
    .line 200
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 201
    .line 202
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 207
    .line 208
    .line 209
    goto :goto_4

    .line 210
    :goto_3
    const-string v2, "MenuItemWrapper"

    .line 211
    .line 212
    const-string v3, "Error while calling setExclusiveCheckable"

    .line 213
    .line 214
    invoke-static {v2, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 215
    .line 216
    .line 217
    :cond_7
    :goto_4
    iget-object v1, p0, Lr12;->ω:Ljava/lang/String;

    .line 218
    .line 219
    if-eqz v1, :cond_8

    .line 220
    .line 221
    sget-object v2, Ls12;->ε:[Ljava/lang/Class;

    .line 222
    .line 223
    iget-object v0, v0, Ls12;->α:[Ljava/lang/Object;

    .line 224
    .line 225
    invoke-virtual {p0, v1, v2, v0}, Lr12;->α(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    check-cast v0, Landroid/view/View;

    .line 230
    .line 231
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setActionView(Landroid/view/View;)Landroid/view/MenuItem;

    .line 232
    .line 233
    .line 234
    move v4, v5

    .line 235
    :cond_8
    iget v0, p0, Lr12;->ψ:I

    .line 236
    .line 237
    if-lez v0, :cond_a

    .line 238
    .line 239
    if-nez v4, :cond_9

    .line 240
    .line 241
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setActionView(I)Landroid/view/MenuItem;

    .line 242
    .line 243
    .line 244
    goto :goto_5

    .line 245
    :cond_9
    const-string v0, "SupportMenuInflater"

    .line 246
    .line 247
    const-string v1, "Ignoring attribute \'itemActionViewLayout\'. Action view already specified."

    .line 248
    .line 249
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 250
    .line 251
    .line 252
    :cond_a
    :goto_5
    iget-object v0, p0, Lr12;->Β:Lｘ;

    .line 253
    .line 254
    if-eqz v0, :cond_c

    .line 255
    .line 256
    instance-of v1, p1, Lt12;

    .line 257
    .line 258
    if-eqz v1, :cond_b

    .line 259
    .line 260
    move-object v1, p1

    .line 261
    check-cast v1, Lt12;

    .line 262
    .line 263
    invoke-interface {v1, v0}, Lt12;->β(Lｘ;)Lt12;

    .line 264
    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_b
    const-string v0, "MenuItemCompat"

    .line 268
    .line 269
    const-string v1, "setActionProvider: item does not implement SupportMenuItem; ignoring"

    .line 270
    .line 271
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 272
    .line 273
    .line 274
    :cond_c
    :goto_6
    iget-object v0, p0, Lr12;->Γ:Ljava/lang/CharSequence;

    .line 275
    .line 276
    instance-of v1, p1, Lt12;

    .line 277
    .line 278
    if-eqz v1, :cond_d

    .line 279
    .line 280
    move-object v2, p1

    .line 281
    check-cast v2, Lt12;

    .line 282
    .line 283
    invoke-interface {v2, v0}, Lt12;->setContentDescription(Ljava/lang/CharSequence;)Lt12;

    .line 284
    .line 285
    .line 286
    goto :goto_7

    .line 287
    :cond_d
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setContentDescription(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 288
    .line 289
    .line 290
    :goto_7
    iget-object v0, p0, Lr12;->Δ:Ljava/lang/CharSequence;

    .line 291
    .line 292
    if-eqz v1, :cond_e

    .line 293
    .line 294
    move-object v2, p1

    .line 295
    check-cast v2, Lt12;

    .line 296
    .line 297
    invoke-interface {v2, v0}, Lt12;->setTooltipText(Ljava/lang/CharSequence;)Lt12;

    .line 298
    .line 299
    .line 300
    goto :goto_8

    .line 301
    :cond_e
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setTooltipText(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 302
    .line 303
    .line 304
    :goto_8
    iget-char v0, p0, Lr12;->ξ:C

    .line 305
    .line 306
    iget v2, p0, Lr12;->ο:I

    .line 307
    .line 308
    if-eqz v1, :cond_f

    .line 309
    .line 310
    move-object v3, p1

    .line 311
    check-cast v3, Lt12;

    .line 312
    .line 313
    invoke-interface {v3, v0, v2}, Lt12;->setAlphabeticShortcut(CI)Landroid/view/MenuItem;

    .line 314
    .line 315
    .line 316
    goto :goto_9

    .line 317
    :cond_f
    invoke-interface {p1, v0, v2}, Landroid/view/MenuItem;->setAlphabeticShortcut(CI)Landroid/view/MenuItem;

    .line 318
    .line 319
    .line 320
    :goto_9
    iget-char v0, p0, Lr12;->π:C

    .line 321
    .line 322
    iget v2, p0, Lr12;->ρ:I

    .line 323
    .line 324
    if-eqz v1, :cond_10

    .line 325
    .line 326
    move-object v3, p1

    .line 327
    check-cast v3, Lt12;

    .line 328
    .line 329
    invoke-interface {v3, v0, v2}, Lt12;->setNumericShortcut(CI)Landroid/view/MenuItem;

    .line 330
    .line 331
    .line 332
    goto :goto_a

    .line 333
    :cond_10
    invoke-interface {p1, v0, v2}, Landroid/view/MenuItem;->setNumericShortcut(CI)Landroid/view/MenuItem;

    .line 334
    .line 335
    .line 336
    :goto_a
    iget-object v0, p0, Lr12;->Ζ:Landroid/graphics/PorterDuff$Mode;

    .line 337
    .line 338
    if-eqz v0, :cond_12

    .line 339
    .line 340
    if-eqz v1, :cond_11

    .line 341
    .line 342
    move-object v2, p1

    .line 343
    check-cast v2, Lt12;

    .line 344
    .line 345
    invoke-interface {v2, v0}, Lt12;->setIconTintMode(Landroid/graphics/PorterDuff$Mode;)Landroid/view/MenuItem;

    .line 346
    .line 347
    .line 348
    goto :goto_b

    .line 349
    :cond_11
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setIconTintMode(Landroid/graphics/PorterDuff$Mode;)Landroid/view/MenuItem;

    .line 350
    .line 351
    .line 352
    :cond_12
    :goto_b
    iget-object p0, p0, Lr12;->Ε:Landroid/content/res/ColorStateList;

    .line 353
    .line 354
    if-eqz p0, :cond_14

    .line 355
    .line 356
    if-eqz v1, :cond_13

    .line 357
    .line 358
    check-cast p1, Lt12;

    .line 359
    .line 360
    invoke-interface {p1, p0}, Lt12;->setIconTintList(Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;

    .line 361
    .line 362
    .line 363
    goto :goto_c

    .line 364
    :cond_13
    invoke-interface {p1, p0}, Landroid/view/MenuItem;->setIconTintList(Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;

    .line 365
    .line 366
    .line 367
    :cond_14
    :goto_c
    return-void
.end method
