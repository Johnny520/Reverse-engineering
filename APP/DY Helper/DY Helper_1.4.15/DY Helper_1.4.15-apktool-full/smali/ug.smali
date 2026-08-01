.class public abstract Lug;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static volatile Α:J

.field public static volatile Β:Ljava/lang/Long;

.field public static Γ:J

.field public static Δ:F

.field public static Ε:F

.field public static Ζ:Z

.field public static Η:J

.field public static Θ:Ljava/lang/Long;

.field public static volatile Ι:Z

.field public static volatile Κ:Z

.field public static volatile Λ:Z

.field public static volatile Μ:Z

.field public static volatile Ν:Z

.field public static volatile Ξ:Z

.field public static volatile Ο:Z

.field public static volatile Π:Lz81;

.field public static volatile Ρ:Z

.field public static volatile Σ:Z

.field public static volatile Τ:Z

.field public static Υ:Ls0;

.field public static Φ:Lν;

.field public static final Χ:Lwe;

.field public static final Ψ:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final Ω:Ljava/util/LinkedHashSet;

.field public static final α:Ltg;

.field public static volatile β:Z

.field public static final γ:Ljava/util/Set;

.field public static volatile δ:Z

.field public static volatile ε:Ljava/lang/ClassLoader;

.field public static volatile ζ:Z

.field public static η:Ljava/lang/ref/WeakReference;

.field public static volatile θ:Ljava/lang/ClassLoader;

.field public static final ι:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final κ:Landroid/os/Handler;

.field public static final λ:Lrf;

.field public static final μ:La;

.field public static volatile ν:Z

.field public static volatile ξ:I

.field public static volatile ο:I

.field public static volatile π:I

.field public static volatile ρ:Ljava/util/LinkedHashMap;

.field public static volatile σ:Z

.field public static volatile τ:Z

.field public static volatile υ:Z

.field public static volatile φ:Z

.field public static volatile χ:I

.field public static volatile ψ:Z

.field public static volatile ω:Z

.field public static final а:Ljava/util/LinkedHashSet;

.field public static б:Ls0;

.field public static final в:Ljava/util/LinkedHashSet;

.field public static г:Ljava/lang/String;

.field public static final д:Lsg;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Ltg;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lug;->α:Ltg;

    .line 7
    .line 8
    const-string v0, "android.telephony.PhaeshVadZenaith"

    .line 9
    .line 10
    invoke-static {v0}, Lg81;->φ(Ljava/lang/Object;)Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lug;->γ:Ljava/util/Set;

    .line 15
    .line 16
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Lug;->ι:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 21
    .line 22
    new-instance v0, Landroid/os/Handler;

    .line 23
    .line 24
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lug;->κ:Landroid/os/Handler;

    .line 32
    .line 33
    new-instance v0, Lrf;

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    invoke-direct {v0, v1}, Lrf;-><init>(I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lug;->λ:Lrf;

    .line 40
    .line 41
    new-instance v0, La;

    .line 42
    .line 43
    const-string v1, "~793C911F02B4DC5CCCA55B8C6F59F423EC7383D78869998D7000C6ADBCAD99044D3E8549548CF07CFE2D"

    .line 44
    .line 45
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-string v2, "~79504AF3C39B11021DAC8210F33C72EF521D7099C0A60F0CD8077C8DA07EAE738B0C72B2FBAD5996C21838D778B6E6AD93"

    .line 50
    .line 51
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {v1}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-direct {v0, v1}, La;-><init>(Ljava/util/Set;)V

    .line 64
    .line 65
    .line 66
    sput-object v0, Lug;->μ:La;

    .line 67
    .line 68
    const/16 v0, 0x28

    .line 69
    .line 70
    sput v0, Lug;->ξ:I

    .line 71
    .line 72
    sput v0, Lug;->ο:I

    .line 73
    .line 74
    sput v0, Lug;->π:I

    .line 75
    .line 76
    sget-object v0, Lbh;->κ:Lrz;

    .line 77
    .line 78
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 79
    .line 80
    const/16 v2, 0xa

    .line 81
    .line 82
    invoke-static {v0, v2}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    invoke-static {v2}, Lex0;->Κ(I)I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    const/16 v3, 0x10

    .line 91
    .line 92
    if-ge v2, v3, :cond_0

    .line 93
    .line 94
    move v2, v3

    .line 95
    :cond_0
    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 96
    .line 97
    .line 98
    new-instance v2, Lτ;

    .line 99
    .line 100
    invoke-direct {v2, v0}, Lτ;-><init>(Lχ;)V

    .line 101
    .line 102
    .line 103
    :goto_0
    invoke-virtual {v2}, Lτ;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    const/4 v3, 0x1

    .line 108
    if-eqz v0, :cond_1

    .line 109
    .line 110
    invoke-virtual {v2}, Lτ;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    move-object v4, v0

    .line 115
    check-cast v4, Lbh;

    .line 116
    .line 117
    new-instance v4, Lch;

    .line 118
    .line 119
    const/4 v5, 0x0

    .line 120
    invoke-direct {v4, v5, v5, v3}, Lch;-><init>(IZZ)V

    .line 121
    .line 122
    .line 123
    invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_1
    sput-object v1, Lug;->ρ:Ljava/util/LinkedHashMap;

    .line 128
    .line 129
    const-wide/high16 v0, -0x8000000000000000L

    .line 130
    .line 131
    sput-wide v0, Lug;->Η:J

    .line 132
    .line 133
    new-instance v0, Lwe;

    .line 134
    .line 135
    const/16 v1, 0x16

    .line 136
    .line 137
    invoke-direct {v0, v1}, Lwe;-><init>(I)V

    .line 138
    .line 139
    .line 140
    sput-object v0, Lug;->Χ:Lwe;

    .line 141
    .line 142
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 143
    .line 144
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 145
    .line 146
    .line 147
    sput-object v0, Lug;->Ψ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 148
    .line 149
    const-string v13, "clean_progress_bar_restore_alpha_on_pause"

    .line 150
    .line 151
    const-string v14, "clean_progress_bar_only_in_clean_mode"

    .line 152
    .line 153
    const-string v4, "clean_mode_enabled"

    .line 154
    .line 155
    const-string v5, "clean_right_panel_alpha"

    .line 156
    .line 157
    const-string v6, "clean_bottom_info_alpha"

    .line 158
    .line 159
    const-string v7, "clean_top_bar_alpha"

    .line 160
    .line 161
    const-string v8, "clean_auto_hide"

    .line 162
    .line 163
    const-string v9, "clean_touch_restore_controls"

    .line 164
    .line 165
    const-string v10, "clean_pause_show_bottom_bar"

    .line 166
    .line 167
    const-string v11, "clean_progress_bar_enabled"

    .line 168
    .line 169
    const-string v12, "clean_progress_bar_alpha"

    .line 170
    .line 171
    filled-new-array/range {v4 .. v14}, [Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-static {}, Ls1;->ω()Ljava/util/LinkedHashSet;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-static {v0, v1}, Lg81;->ο(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    sput-object v0, Lug;->Ω:Ljava/util/LinkedHashSet;

    .line 188
    .line 189
    const-string v9, "clean_progress_bar_restore_alpha_on_pause"

    .line 190
    .line 191
    const-string v10, "clean_progress_bar_only_in_clean_mode"

    .line 192
    .line 193
    const-string v4, "clean_mode_enabled"

    .line 194
    .line 195
    const-string v5, "clean_auto_hide"

    .line 196
    .line 197
    const-string v6, "clean_touch_restore_controls"

    .line 198
    .line 199
    const-string v7, "clean_pause_show_bottom_bar"

    .line 200
    .line 201
    const-string v8, "clean_progress_bar_enabled"

    .line 202
    .line 203
    filled-new-array/range {v4 .. v10}, [Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    sget-object v1, Lbh;->κ:Lrz;

    .line 212
    .line 213
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 214
    .line 215
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    new-instance v4, Lτ;

    .line 222
    .line 223
    invoke-direct {v4, v1}, Lτ;-><init>(Lχ;)V

    .line 224
    .line 225
    .line 226
    :goto_1
    invoke-virtual {v4}, Lτ;->hasNext()Z

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    if-eqz v1, :cond_2

    .line 231
    .line 232
    invoke-virtual {v4}, Lτ;->next()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    check-cast v1, Lbh;

    .line 237
    .line 238
    iget-object v5, v1, Lbh;->ε:Ljava/lang/String;

    .line 239
    .line 240
    const-string v6, "_enabled"

    .line 241
    .line 242
    const-string v7, "clean_misc_control_"

    .line 243
    .line 244
    invoke-static {v7, v5, v6}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v5

    .line 248
    iget-object v1, v1, Lbh;->ε:Ljava/lang/String;

    .line 249
    .line 250
    const-string v6, "_follow_restore"

    .line 251
    .line 252
    invoke-static {v7, v1, v6}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    filled-new-array {v5, v1}, [Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    invoke-static {v1}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    invoke-static {v2, v1}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 265
    .line 266
    .line 267
    goto :goto_1

    .line 268
    :cond_2
    invoke-static {v0, v2}, Lg81;->ο(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    sput-object v0, Lug;->а:Ljava/util/LinkedHashSet;

    .line 273
    .line 274
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 275
    .line 276
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 277
    .line 278
    .line 279
    sput-object v0, Lug;->в:Ljava/util/LinkedHashSet;

    .line 280
    .line 281
    const-string v0, ""

    .line 282
    .line 283
    sput-object v0, Lug;->г:Ljava/lang/String;

    .line 284
    .line 285
    new-instance v0, Lsg;

    .line 286
    .line 287
    const/4 v1, 0x0

    .line 288
    invoke-direct {v0, v1}, Lsg;-><init>(I)V

    .line 289
    .line 290
    .line 291
    sput-object v0, Lug;->д:Lsg;

    .line 292
    .line 293
    sget-object v0, Lug;->Ψ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 294
    .line 295
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    const/4 v1, 0x2

    .line 307
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    const/4 v1, 0x3

    .line 319
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    const/4 v1, 0x4

    .line 331
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    const/4 v1, 0x6

    .line 343
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    const/4 v1, 0x7

    .line 355
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    const/16 v1, 0x8

    .line 367
    .line 368
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    const/4 v1, 0x5

    .line 380
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    return-void
.end method
