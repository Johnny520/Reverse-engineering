.class public Landroidx/appcompat/app/AppCompatActivity;
.super Landroidx/fragment/app/FragmentActivity;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp4;


# instance fields
.field public Ε:Landroidx/appcompat/app/β;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/FragmentActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->ι:Ln5;

    .line 5
    .line 6
    iget-object v0, v0, Ln5;->η:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ln5;

    .line 9
    .line 10
    new-instance v1, Lm4;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lm4;-><init>(Landroidx/appcompat/app/AppCompatActivity;)V

    .line 13
    .line 14
    .line 15
    const-string v2, "androidx:appcompat"

    .line 16
    .line 17
    invoke-virtual {v0, v2, v1}, Ln5;->Σ(Ljava/lang/String;Lhq1;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Ln4;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Ln4;-><init>(Landroidx/appcompat/app/AppCompatActivity;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->η(Le51;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->ι()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->λ()Landroidx/appcompat/app/α;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Landroidx/appcompat/app/β;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/appcompat/app/β;->χ()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Landroidx/appcompat/app/β;->Η:Landroid/view/ViewGroup;

    .line 14
    .line 15
    const v1, 0x1020002

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Landroid/view/ViewGroup;

    .line 23
    .line 24
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Landroidx/appcompat/app/β;->ρ:Ld5;

    .line 28
    .line 29
    iget-object p0, p0, Landroidx/appcompat/app/β;->π:Landroid/view/Window;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p1, p0}, Ld5;->α(Landroid/view/Window$Callback;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final attachBaseContext(Landroid/content/Context;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->λ()Landroidx/appcompat/app/α;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroidx/appcompat/app/β;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, v0, Landroidx/appcompat/app/β;->Φ:Z

    .line 9
    .line 10
    iget v2, v0, Landroidx/appcompat/app/β;->а:I

    .line 11
    .line 12
    const/16 v3, -0x64

    .line 13
    .line 14
    if-eq v2, v3, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget v2, Landroidx/appcompat/app/α;->ζ:I

    .line 18
    .line 19
    :goto_0
    invoke-virtual {v0, p1, v2}, Landroidx/appcompat/app/β;->Δ(Landroid/content/Context;I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {p1}, Landroidx/appcompat/app/α;->β(Landroid/content/Context;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x0

    .line 28
    if-eqz v2, :cond_7

    .line 29
    .line 30
    invoke-static {p1}, Landroidx/appcompat/app/α;->β(Landroid/content/Context;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    goto :goto_4

    .line 37
    :cond_1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 38
    .line 39
    const/16 v4, 0x21

    .line 40
    .line 41
    if-lt v2, v4, :cond_2

    .line 42
    .line 43
    sget-boolean v2, Landroidx/appcompat/app/α;->κ:Z

    .line 44
    .line 45
    if-nez v2, :cond_7

    .line 46
    .line 47
    sget-object v2, Landroidx/appcompat/app/α;->ε:Lu4;

    .line 48
    .line 49
    new-instance v4, Lr4;

    .line 50
    .line 51
    invoke-direct {v4, p1, v3}, Lr4;-><init>(Landroid/content/Context;I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v4}, Lu4;->execute(Ljava/lang/Runnable;)V

    .line 55
    .line 56
    .line 57
    goto :goto_4

    .line 58
    :cond_2
    sget-object v2, Landroidx/appcompat/app/α;->ν:Ljava/lang/Object;

    .line 59
    .line 60
    monitor-enter v2

    .line 61
    :try_start_0
    sget-object v4, Landroidx/appcompat/app/α;->η:Lcv0;

    .line 62
    .line 63
    if-nez v4, :cond_5

    .line 64
    .line 65
    sget-object v4, Landroidx/appcompat/app/α;->θ:Lcv0;

    .line 66
    .line 67
    if-nez v4, :cond_3

    .line 68
    .line 69
    invoke-static {p1}, Lyh;->м(Landroid/content/Context;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-static {v4}, Lcv0;->α(Ljava/lang/String;)Lcv0;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    sput-object v4, Landroidx/appcompat/app/α;->θ:Lcv0;

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :catchall_0
    move-exception p0

    .line 81
    goto :goto_3

    .line 82
    :cond_3
    :goto_1
    sget-object v4, Landroidx/appcompat/app/α;->θ:Lcv0;

    .line 83
    .line 84
    iget-object v4, v4, Lcv0;->α:Ldv0;

    .line 85
    .line 86
    iget-object v4, v4, Ldv0;->α:Landroid/os/LocaleList;

    .line 87
    .line 88
    invoke-virtual {v4}, Landroid/os/LocaleList;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_4

    .line 93
    .line 94
    monitor-exit v2

    .line 95
    goto :goto_4

    .line 96
    :cond_4
    sget-object v4, Landroidx/appcompat/app/α;->θ:Lcv0;

    .line 97
    .line 98
    sput-object v4, Landroidx/appcompat/app/α;->η:Lcv0;

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_5
    sget-object v5, Landroidx/appcompat/app/α;->θ:Lcv0;

    .line 102
    .line 103
    invoke-virtual {v4, v5}, Lcv0;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-nez v4, :cond_6

    .line 108
    .line 109
    sget-object v4, Landroidx/appcompat/app/α;->η:Lcv0;

    .line 110
    .line 111
    sput-object v4, Landroidx/appcompat/app/α;->θ:Lcv0;

    .line 112
    .line 113
    iget-object v4, v4, Lcv0;->α:Ldv0;

    .line 114
    .line 115
    iget-object v4, v4, Ldv0;->α:Landroid/os/LocaleList;

    .line 116
    .line 117
    invoke-virtual {v4}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    invoke-static {p1, v4}, Lyh;->з(Landroid/content/Context;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    :cond_6
    :goto_2
    monitor-exit v2

    .line 125
    goto :goto_4

    .line 126
    :goto_3
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    throw p0

    .line 128
    :cond_7
    :goto_4
    invoke-static {p1}, Landroidx/appcompat/app/β;->ο(Landroid/content/Context;)Lcv0;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    instance-of v4, p1, Landroid/view/ContextThemeWrapper;

    .line 133
    .line 134
    const/4 v5, 0x0

    .line 135
    if-eqz v4, :cond_8

    .line 136
    .line 137
    invoke-static {p1, v0, v2, v5, v3}, Landroidx/appcompat/app/β;->τ(Landroid/content/Context;ILcv0;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    :try_start_1
    move-object v6, p1

    .line 142
    check-cast v6, Landroid/view/ContextThemeWrapper;

    .line 143
    .line 144
    invoke-virtual {v6, v4}, Landroid/view/ContextThemeWrapper;->applyOverrideConfiguration(Landroid/content/res/Configuration;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    .line 145
    .line 146
    .line 147
    goto/16 :goto_6

    .line 148
    .line 149
    :catch_0
    :cond_8
    instance-of v4, p1, Lnp;

    .line 150
    .line 151
    if-eqz v4, :cond_9

    .line 152
    .line 153
    invoke-static {p1, v0, v2, v5, v3}, Landroidx/appcompat/app/β;->τ(Landroid/content/Context;ILcv0;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    :try_start_2
    move-object v4, p1

    .line 158
    check-cast v4, Lnp;

    .line 159
    .line 160
    invoke-virtual {v4, v3}, Lnp;->α(Landroid/content/res/Configuration;)V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1

    .line 161
    .line 162
    .line 163
    goto/16 :goto_6

    .line 164
    .line 165
    :catch_1
    :cond_9
    sget-boolean v3, Landroidx/appcompat/app/β;->с:Z

    .line 166
    .line 167
    if-nez v3, :cond_a

    .line 168
    .line 169
    goto/16 :goto_6

    .line 170
    .line 171
    :cond_a
    new-instance v3, Landroid/content/res/Configuration;

    .line 172
    .line 173
    invoke-direct {v3}, Landroid/content/res/Configuration;-><init>()V

    .line 174
    .line 175
    .line 176
    const/4 v4, -0x1

    .line 177
    iput v4, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 178
    .line 179
    const/4 v4, 0x0

    .line 180
    iput v4, v3, Landroid/content/res/Configuration;->fontScale:F

    .line 181
    .line 182
    invoke-virtual {p1, v3}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    iget v7, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 203
    .line 204
    iput v7, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 205
    .line 206
    invoke-virtual {v3, v6}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z

    .line 207
    .line 208
    .line 209
    move-result v7

    .line 210
    if-nez v7, :cond_20

    .line 211
    .line 212
    new-instance v5, Landroid/content/res/Configuration;

    .line 213
    .line 214
    invoke-direct {v5}, Landroid/content/res/Configuration;-><init>()V

    .line 215
    .line 216
    .line 217
    iput v4, v5, Landroid/content/res/Configuration;->fontScale:F

    .line 218
    .line 219
    invoke-virtual {v3, v6}, Landroid/content/res/Configuration;->diff(Landroid/content/res/Configuration;)I

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    if-nez v4, :cond_b

    .line 224
    .line 225
    goto/16 :goto_5

    .line 226
    .line 227
    :cond_b
    iget v4, v3, Landroid/content/res/Configuration;->fontScale:F

    .line 228
    .line 229
    iget v7, v6, Landroid/content/res/Configuration;->fontScale:F

    .line 230
    .line 231
    cmpl-float v4, v4, v7

    .line 232
    .line 233
    if-eqz v4, :cond_c

    .line 234
    .line 235
    iput v7, v5, Landroid/content/res/Configuration;->fontScale:F

    .line 236
    .line 237
    :cond_c
    iget v4, v3, Landroid/content/res/Configuration;->mcc:I

    .line 238
    .line 239
    iget v7, v6, Landroid/content/res/Configuration;->mcc:I

    .line 240
    .line 241
    if-eq v4, v7, :cond_d

    .line 242
    .line 243
    iput v7, v5, Landroid/content/res/Configuration;->mcc:I

    .line 244
    .line 245
    :cond_d
    iget v4, v3, Landroid/content/res/Configuration;->mnc:I

    .line 246
    .line 247
    iget v7, v6, Landroid/content/res/Configuration;->mnc:I

    .line 248
    .line 249
    if-eq v4, v7, :cond_e

    .line 250
    .line 251
    iput v7, v5, Landroid/content/res/Configuration;->mnc:I

    .line 252
    .line 253
    :cond_e
    invoke-static {v3, v6, v5}, La5;->α(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    .line 254
    .line 255
    .line 256
    iget v4, v3, Landroid/content/res/Configuration;->touchscreen:I

    .line 257
    .line 258
    iget v7, v6, Landroid/content/res/Configuration;->touchscreen:I

    .line 259
    .line 260
    if-eq v4, v7, :cond_f

    .line 261
    .line 262
    iput v7, v5, Landroid/content/res/Configuration;->touchscreen:I

    .line 263
    .line 264
    :cond_f
    iget v4, v3, Landroid/content/res/Configuration;->keyboard:I

    .line 265
    .line 266
    iget v7, v6, Landroid/content/res/Configuration;->keyboard:I

    .line 267
    .line 268
    if-eq v4, v7, :cond_10

    .line 269
    .line 270
    iput v7, v5, Landroid/content/res/Configuration;->keyboard:I

    .line 271
    .line 272
    :cond_10
    iget v4, v3, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 273
    .line 274
    iget v7, v6, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 275
    .line 276
    if-eq v4, v7, :cond_11

    .line 277
    .line 278
    iput v7, v5, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 279
    .line 280
    :cond_11
    iget v4, v3, Landroid/content/res/Configuration;->navigation:I

    .line 281
    .line 282
    iget v7, v6, Landroid/content/res/Configuration;->navigation:I

    .line 283
    .line 284
    if-eq v4, v7, :cond_12

    .line 285
    .line 286
    iput v7, v5, Landroid/content/res/Configuration;->navigation:I

    .line 287
    .line 288
    :cond_12
    iget v4, v3, Landroid/content/res/Configuration;->navigationHidden:I

    .line 289
    .line 290
    iget v7, v6, Landroid/content/res/Configuration;->navigationHidden:I

    .line 291
    .line 292
    if-eq v4, v7, :cond_13

    .line 293
    .line 294
    iput v7, v5, Landroid/content/res/Configuration;->navigationHidden:I

    .line 295
    .line 296
    :cond_13
    iget v4, v3, Landroid/content/res/Configuration;->orientation:I

    .line 297
    .line 298
    iget v7, v6, Landroid/content/res/Configuration;->orientation:I

    .line 299
    .line 300
    if-eq v4, v7, :cond_14

    .line 301
    .line 302
    iput v7, v5, Landroid/content/res/Configuration;->orientation:I

    .line 303
    .line 304
    :cond_14
    iget v4, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 305
    .line 306
    and-int/lit8 v4, v4, 0xf

    .line 307
    .line 308
    iget v7, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 309
    .line 310
    and-int/lit8 v7, v7, 0xf

    .line 311
    .line 312
    if-eq v4, v7, :cond_15

    .line 313
    .line 314
    iget v4, v5, Landroid/content/res/Configuration;->screenLayout:I

    .line 315
    .line 316
    or-int/2addr v4, v7

    .line 317
    iput v4, v5, Landroid/content/res/Configuration;->screenLayout:I

    .line 318
    .line 319
    :cond_15
    iget v4, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 320
    .line 321
    and-int/lit16 v4, v4, 0xc0

    .line 322
    .line 323
    iget v7, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 324
    .line 325
    and-int/lit16 v7, v7, 0xc0

    .line 326
    .line 327
    if-eq v4, v7, :cond_16

    .line 328
    .line 329
    iget v4, v5, Landroid/content/res/Configuration;->screenLayout:I

    .line 330
    .line 331
    or-int/2addr v4, v7

    .line 332
    iput v4, v5, Landroid/content/res/Configuration;->screenLayout:I

    .line 333
    .line 334
    :cond_16
    iget v4, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 335
    .line 336
    and-int/lit8 v4, v4, 0x30

    .line 337
    .line 338
    iget v7, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 339
    .line 340
    and-int/lit8 v7, v7, 0x30

    .line 341
    .line 342
    if-eq v4, v7, :cond_17

    .line 343
    .line 344
    iget v4, v5, Landroid/content/res/Configuration;->screenLayout:I

    .line 345
    .line 346
    or-int/2addr v4, v7

    .line 347
    iput v4, v5, Landroid/content/res/Configuration;->screenLayout:I

    .line 348
    .line 349
    :cond_17
    iget v4, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 350
    .line 351
    and-int/lit16 v4, v4, 0x300

    .line 352
    .line 353
    iget v7, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 354
    .line 355
    and-int/lit16 v7, v7, 0x300

    .line 356
    .line 357
    if-eq v4, v7, :cond_18

    .line 358
    .line 359
    iget v4, v5, Landroid/content/res/Configuration;->screenLayout:I

    .line 360
    .line 361
    or-int/2addr v4, v7

    .line 362
    iput v4, v5, Landroid/content/res/Configuration;->screenLayout:I

    .line 363
    .line 364
    :cond_18
    iget v4, v3, Landroid/content/res/Configuration;->colorMode:I

    .line 365
    .line 366
    and-int/lit8 v4, v4, 0x3

    .line 367
    .line 368
    iget v7, v6, Landroid/content/res/Configuration;->colorMode:I

    .line 369
    .line 370
    and-int/lit8 v7, v7, 0x3

    .line 371
    .line 372
    if-eq v4, v7, :cond_19

    .line 373
    .line 374
    iget v4, v5, Landroid/content/res/Configuration;->colorMode:I

    .line 375
    .line 376
    or-int/2addr v4, v7

    .line 377
    iput v4, v5, Landroid/content/res/Configuration;->colorMode:I

    .line 378
    .line 379
    :cond_19
    iget v4, v3, Landroid/content/res/Configuration;->colorMode:I

    .line 380
    .line 381
    and-int/lit8 v4, v4, 0xc

    .line 382
    .line 383
    iget v7, v6, Landroid/content/res/Configuration;->colorMode:I

    .line 384
    .line 385
    and-int/lit8 v7, v7, 0xc

    .line 386
    .line 387
    if-eq v4, v7, :cond_1a

    .line 388
    .line 389
    iget v4, v5, Landroid/content/res/Configuration;->colorMode:I

    .line 390
    .line 391
    or-int/2addr v4, v7

    .line 392
    iput v4, v5, Landroid/content/res/Configuration;->colorMode:I

    .line 393
    .line 394
    :cond_1a
    iget v4, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 395
    .line 396
    and-int/lit8 v4, v4, 0xf

    .line 397
    .line 398
    iget v7, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 399
    .line 400
    and-int/lit8 v7, v7, 0xf

    .line 401
    .line 402
    if-eq v4, v7, :cond_1b

    .line 403
    .line 404
    iget v4, v5, Landroid/content/res/Configuration;->uiMode:I

    .line 405
    .line 406
    or-int/2addr v4, v7

    .line 407
    iput v4, v5, Landroid/content/res/Configuration;->uiMode:I

    .line 408
    .line 409
    :cond_1b
    iget v4, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 410
    .line 411
    and-int/lit8 v4, v4, 0x30

    .line 412
    .line 413
    iget v7, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 414
    .line 415
    and-int/lit8 v7, v7, 0x30

    .line 416
    .line 417
    if-eq v4, v7, :cond_1c

    .line 418
    .line 419
    iget v4, v5, Landroid/content/res/Configuration;->uiMode:I

    .line 420
    .line 421
    or-int/2addr v4, v7

    .line 422
    iput v4, v5, Landroid/content/res/Configuration;->uiMode:I

    .line 423
    .line 424
    :cond_1c
    iget v4, v3, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 425
    .line 426
    iget v7, v6, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 427
    .line 428
    if-eq v4, v7, :cond_1d

    .line 429
    .line 430
    iput v7, v5, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 431
    .line 432
    :cond_1d
    iget v4, v3, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 433
    .line 434
    iget v7, v6, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 435
    .line 436
    if-eq v4, v7, :cond_1e

    .line 437
    .line 438
    iput v7, v5, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 439
    .line 440
    :cond_1e
    iget v4, v3, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 441
    .line 442
    iget v7, v6, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 443
    .line 444
    if-eq v4, v7, :cond_1f

    .line 445
    .line 446
    iput v7, v5, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 447
    .line 448
    :cond_1f
    iget v3, v3, Landroid/content/res/Configuration;->densityDpi:I

    .line 449
    .line 450
    iget v4, v6, Landroid/content/res/Configuration;->densityDpi:I

    .line 451
    .line 452
    if-eq v3, v4, :cond_20

    .line 453
    .line 454
    iput v4, v5, Landroid/content/res/Configuration;->densityDpi:I

    .line 455
    .line 456
    :cond_20
    :goto_5
    invoke-static {p1, v0, v2, v5, v1}, Landroidx/appcompat/app/β;->τ(Landroid/content/Context;ILcv0;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    new-instance v1, Lnp;

    .line 461
    .line 462
    const v2, 0x7f100118

    .line 463
    .line 464
    .line 465
    invoke-direct {v1, p1, v2}, Lnp;-><init>(Landroid/content/Context;I)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v1, v0}, Lnp;->α(Landroid/content/res/Configuration;)V

    .line 469
    .line 470
    .line 471
    :try_start_3
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 472
    .line 473
    .line 474
    move-result-object p1
    :try_end_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_2

    .line 475
    if-eqz p1, :cond_21

    .line 476
    .line 477
    invoke-virtual {v1}, Lnp;->getTheme()Landroid/content/res/Resources$Theme;

    .line 478
    .line 479
    .line 480
    move-result-object p1

    .line 481
    invoke-virtual {p1}, Landroid/content/res/Resources$Theme;->rebase()V

    .line 482
    .line 483
    .line 484
    :catch_2
    :cond_21
    move-object p1, v1

    .line 485
    :goto_6
    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    .line 486
    .line 487
    .line 488
    return-void
.end method

.method public final closeOptionsMenu()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->λ()Landroidx/appcompat/app/α;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroidx/appcompat/app/β;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/appcompat/app/β;->Β()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Landroid/view/Window;->hasFeature(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-super {p0}, Landroid/app/Activity;->closeOptionsMenu()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->λ()Landroidx/appcompat/app/α;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Landroidx/appcompat/app/β;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/appcompat/app/β;->Β()V

    .line 11
    .line 12
    .line 13
    invoke-super {p0, p1}, Landroidx/core/app/ComponentActivity;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public final findViewById(I)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->λ()Landroidx/appcompat/app/α;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/appcompat/app/β;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/appcompat/app/β;->χ()V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Landroidx/appcompat/app/β;->π:Landroid/view/Window;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final getMenuInflater()Landroid/view/MenuInflater;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->λ()Landroidx/appcompat/app/α;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/appcompat/app/β;

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/appcompat/app/β;->υ:Ls12;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/appcompat/app/β;->Β()V

    .line 12
    .line 13
    .line 14
    new-instance v0, Ls12;

    .line 15
    .line 16
    iget-object v1, p0, Landroidx/appcompat/app/β;->τ:Ltb2;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1}, Ltb2;->β()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v1, p0, Landroidx/appcompat/app/β;->ο:Landroid/content/Context;

    .line 26
    .line 27
    :goto_0
    invoke-direct {v0, v1}, Ls12;-><init>(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Landroidx/appcompat/app/β;->υ:Ls12;

    .line 31
    .line 32
    :cond_1
    iget-object p0, p0, Landroidx/appcompat/app/β;->υ:Ls12;

    .line 33
    .line 34
    return-object p0
.end method

.method public final getResources()Landroid/content/res/Resources;
    .locals 1

    .line 1
    sget v0, Lk72;->α:I

    .line 2
    .line 3
    invoke-super {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final invalidateOptionsMenu()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->λ()Landroidx/appcompat/app/α;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/appcompat/app/β;

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/appcompat/app/β;->τ:Ltb2;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/appcompat/app/β;->Β()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Landroidx/appcompat/app/β;->τ:Ltb2;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/β;->Γ(I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->λ()Landroidx/appcompat/app/α;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Landroidx/appcompat/app/β;

    .line 9
    .line 10
    iget-boolean p1, p0, Landroidx/appcompat/app/β;->Μ:Z

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-boolean p1, p0, Landroidx/appcompat/app/β;->Ζ:Z

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/appcompat/app/β;->Β()V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Landroidx/appcompat/app/β;->τ:Ltb2;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object v0, p1, Ltb2;->α:Landroid/content/Context;

    .line 26
    .line 27
    invoke-static {v0}, Lｍ;->β(Landroid/content/Context;)Lｍ;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v0, v0, Lｍ;->α:Landroid/content/Context;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const/high16 v1, 0x7f050000

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-virtual {p1, v0}, Ltb2;->ε(Z)V

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-static {}, Lj5;->α()Lj5;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object v0, p0, Landroidx/appcompat/app/β;->ο:Landroid/content/Context;

    .line 51
    .line 52
    monitor-enter p1

    .line 53
    :try_start_0
    iget-object v1, p1, Lj5;->α:Ltn1;

    .line 54
    .line 55
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 56
    :try_start_1
    iget-object v2, v1, Ltn1;->β:Ljava/util/WeakHashMap;

    .line 57
    .line 58
    invoke-virtual {v2, v0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Lzv0;

    .line 63
    .line 64
    if-eqz v0, :cond_1

    .line 65
    .line 66
    invoke-virtual {v0}, Lzv0;->α()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catchall_0
    move-exception p0

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    :goto_0
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 73
    monitor-exit p1

    .line 74
    new-instance p1, Landroid/content/res/Configuration;

    .line 75
    .line 76
    iget-object v0, p0, Landroidx/appcompat/app/β;->ο:Landroid/content/Context;

    .line 77
    .line 78
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-direct {p1, v0}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 87
    .line 88
    .line 89
    iput-object p1, p0, Landroidx/appcompat/app/β;->Ω:Landroid/content/res/Configuration;

    .line 90
    .line 91
    const/4 p1, 0x0

    .line 92
    invoke-virtual {p0, p1, p1}, Landroidx/appcompat/app/β;->ν(ZZ)Z

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :goto_1
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 97
    :try_start_4
    throw p0

    .line 98
    :catchall_1
    move-exception p0

    .line 99
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 100
    throw p0
.end method

.method public final onContentChanged()V
    .locals 0

    .line 1
    return-void
.end method

.method public final onDestroy()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->λ()Landroidx/appcompat/app/α;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Landroidx/appcompat/app/α;->ε()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 4

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/FragmentActivity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    goto/16 :goto_2

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->λ()Landroidx/appcompat/app/α;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Landroidx/appcompat/app/β;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroidx/appcompat/app/β;->Β()V

    .line 17
    .line 18
    .line 19
    iget-object p1, p1, Landroidx/appcompat/app/β;->τ:Ltb2;

    .line 20
    .line 21
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    const v1, 0x102002c

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    if-ne p2, v1, :cond_7

    .line 30
    .line 31
    if-eqz p1, :cond_7

    .line 32
    .line 33
    iget-object p1, p1, Ltb2;->ε:Lyq;

    .line 34
    .line 35
    check-cast p1, Lb52;

    .line 36
    .line 37
    iget p1, p1, Lb52;->β:I

    .line 38
    .line 39
    and-int/lit8 p1, p1, 0x4

    .line 40
    .line 41
    if-eqz p1, :cond_7

    .line 42
    .line 43
    invoke-static {p0}, Lyh;->Μ(Landroidx/appcompat/app/AppCompatActivity;)Landroid/content/Intent;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-eqz p1, :cond_7

    .line 48
    .line 49
    invoke-virtual {p0, p1}, Landroid/app/Activity;->shouldUpRecreateTask(Landroid/content/Intent;)Z

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    if-eqz p2, :cond_6

    .line 54
    .line 55
    new-instance p1, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-static {p0}, Lyh;->Μ(Landroidx/appcompat/app/AppCompatActivity;)Landroid/content/Intent;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    if-nez p2, :cond_1

    .line 65
    .line 66
    invoke-static {p0}, Lyh;->Μ(Landroidx/appcompat/app/AppCompatActivity;)Landroid/content/Intent;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    :cond_1
    if-eqz p2, :cond_4

    .line 71
    .line 72
    invoke-virtual {p2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    if-nez v1, :cond_2

    .line 77
    .line 78
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {p2, v1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    :try_start_0
    invoke-static {p0, v1}, Lyh;->Ν(Landroidx/appcompat/app/AppCompatActivity;Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    :goto_0
    if-eqz v1, :cond_3

    .line 95
    .line 96
    invoke-virtual {p1, v3, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-static {p0, v1}, Lyh;->Ν(Landroidx/appcompat/app/AppCompatActivity;Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 104
    .line 105
    .line 106
    move-result-object v1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    goto :goto_0

    .line 108
    :cond_3
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :catch_0
    move-exception p0

    .line 113
    const-string p1, "TaskStackBuilder"

    .line 114
    .line 115
    const-string p2, "Bad ComponentName while traversing activity parent metadata"

    .line 116
    .line 117
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 121
    .line 122
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    throw p1

    .line 126
    :cond_4
    :goto_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    if-nez p2, :cond_5

    .line 131
    .line 132
    new-array p2, v2, [Landroid/content/Intent;

    .line 133
    .line 134
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    check-cast p1, [Landroid/content/Intent;

    .line 139
    .line 140
    new-instance p2, Landroid/content/Intent;

    .line 141
    .line 142
    aget-object v1, p1, v2

    .line 143
    .line 144
    invoke-direct {p2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 145
    .line 146
    .line 147
    const v1, 0x1000c000

    .line 148
    .line 149
    .line 150
    invoke-virtual {p2, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 151
    .line 152
    .line 153
    move-result-object p2

    .line 154
    aput-object p2, p1, v2

    .line 155
    .line 156
    const/4 p2, 0x0

    .line 157
    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->startActivities([Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 158
    .line 159
    .line 160
    :try_start_1
    invoke-virtual {p0}, Landroid/app/Activity;->finishAffinity()V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 161
    .line 162
    .line 163
    goto :goto_2

    .line 164
    :catch_1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 165
    .line 166
    .line 167
    :goto_2
    return v0

    .line 168
    :cond_5
    const-string p0, "No intents added to TaskStackBuilder; cannot startActivities"

    .line 169
    .line 170
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    const/4 p0, 0x0

    .line 174
    return p0

    .line 175
    :cond_6
    invoke-virtual {p0, p1}, Landroid/app/Activity;->navigateUpTo(Landroid/content/Intent;)Z

    .line 176
    .line 177
    .line 178
    return v0

    .line 179
    :cond_7
    return v2
.end method

.method public final onPostCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onPostCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->λ()Landroidx/appcompat/app/α;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Landroidx/appcompat/app/β;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/appcompat/app/β;->χ()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onPostResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPostResume()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->λ()Landroidx/appcompat/app/α;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Landroidx/appcompat/app/β;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/appcompat/app/β;->Β()V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Landroidx/appcompat/app/β;->τ:Ltb2;

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Ltb2;->υ:Z

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final onStart()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onStart()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->λ()Landroidx/appcompat/app/α;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Landroidx/appcompat/app/β;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {p0, v0, v1}, Landroidx/appcompat/app/β;->ν(ZZ)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final onStop()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onStop()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->λ()Landroidx/appcompat/app/α;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Landroidx/appcompat/app/β;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/appcompat/app/β;->Β()V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Landroidx/appcompat/app/β;->τ:Ltb2;

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Ltb2;->υ:Z

    .line 19
    .line 20
    iget-object p0, p0, Ltb2;->τ:Ly92;

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Ly92;->α()V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final onTitleChanged(Ljava/lang/CharSequence;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onTitleChanged(Ljava/lang/CharSequence;I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->λ()Landroidx/appcompat/app/α;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/α;->μ(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final openOptionsMenu()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->λ()Landroidx/appcompat/app/α;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroidx/appcompat/app/β;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/appcompat/app/β;->Β()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Landroid/view/Window;->hasFeature(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-super {p0}, Landroid/app/Activity;->openOptionsMenu()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final setContentView(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->ι()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->λ()Landroidx/appcompat/app/α;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/α;->ι(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 12
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->ι()V

    .line 13
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->λ()Landroidx/appcompat/app/α;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/α;->κ(Landroid/view/View;)V

    return-void
.end method

.method public final setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 14
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->ι()V

    .line 15
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->λ()Landroidx/appcompat/app/α;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/app/α;->λ(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final setTheme(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/content/Context;->setTheme(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->λ()Landroidx/appcompat/app/α;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Landroidx/appcompat/app/β;

    .line 9
    .line 10
    iput p1, p0, Landroidx/appcompat/app/β;->б:I

    .line 11
    .line 12
    return-void
.end method

.method public final λ()Landroidx/appcompat/app/α;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/AppCompatActivity;->Ε:Landroidx/appcompat/app/β;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Landroidx/appcompat/app/α;->ε:Lu4;

    .line 6
    .line 7
    new-instance v0, Landroidx/appcompat/app/β;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1, p0, p0}, Landroidx/appcompat/app/β;-><init>(Landroid/content/Context;Landroid/view/Window;Lp4;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Landroidx/appcompat/app/AppCompatActivity;->Ε:Landroidx/appcompat/app/β;

    .line 14
    .line 15
    :cond_0
    iget-object p0, p0, Landroidx/appcompat/app/AppCompatActivity;->Ε:Landroidx/appcompat/app/β;

    .line 16
    .line 17
    return-object p0
.end method
