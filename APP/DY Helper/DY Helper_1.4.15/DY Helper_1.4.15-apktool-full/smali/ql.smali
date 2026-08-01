.class public final Lql;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lql;

.field public static final β:Landroid/os/Handler;

.field public static volatile γ:Z

.field public static volatile δ:Z

.field public static final ε:Ljava/util/List;

.field public static final ζ:Ljava/util/Map;

.field public static final η:Ljava/util/Map;

.field public static final θ:Ljava/util/Map;

.field public static final ι:Ljava/util/Map;

.field public static final κ:Ljava/util/Set;

.field public static final λ:Ljava/util/Set;

.field public static final μ:Ljava/util/Map;

.field public static final ν:Ljava/util/Map;

.field public static volatile ξ:Lol;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lql;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lql;->α:Lql;

    .line 7
    .line 8
    new-instance v0, Landroid/os/Handler;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lql;->β:Landroid/os/Handler;

    .line 18
    .line 19
    const-string v0, "~789325E9C4B2AA228E18888457F2F91C62869634665744D07389DD4580D7D29766759B86358C6483A22357F629DC167AD77FCE14324A943E44AA13916C5DBBB74D"

    .line 20
    .line 21
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "~7970EC7DC8C1E9D1DCDC9F0020E48B764591F776A2B2A0F654AFAE24985FA802AAC115510920204EFD556923FD17B45EBDC6791A07EA33B080"

    .line 26
    .line 27
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lql;->ε:Ljava/util/List;

    .line 40
    .line 41
    new-instance v0, Ljava/util/WeakHashMap;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    sput-object v0, Lql;->ζ:Ljava/util/Map;

    .line 54
    .line 55
    new-instance v0, Ljava/util/WeakHashMap;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    sput-object v0, Lql;->η:Ljava/util/Map;

    .line 68
    .line 69
    new-instance v0, Ljava/util/WeakHashMap;

    .line 70
    .line 71
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    sput-object v0, Lql;->θ:Ljava/util/Map;

    .line 82
    .line 83
    new-instance v0, Ljava/util/WeakHashMap;

    .line 84
    .line 85
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    sput-object v0, Lql;->ι:Ljava/util/Map;

    .line 96
    .line 97
    new-instance v0, Ljava/util/WeakHashMap;

    .line 98
    .line 99
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    sput-object v0, Lql;->κ:Ljava/util/Set;

    .line 114
    .line 115
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 116
    .line 117
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    sput-object v0, Lql;->λ:Ljava/util/Set;

    .line 128
    .line 129
    new-instance v0, Ljava/util/WeakHashMap;

    .line 130
    .line 131
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    sput-object v0, Lql;->μ:Ljava/util/Map;

    .line 142
    .line 143
    new-instance v0, Ljava/util/WeakHashMap;

    .line 144
    .line 145
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    sput-object v0, Lql;->ν:Ljava/util/Map;

    .line 156
    .line 157
    return-void
.end method

.method public static Α(Landroid/view/ViewGroup;)Z
    .locals 14

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_8

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-gtz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-gtz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-gtz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-lez v0, :cond_14

    .line 33
    .line 34
    :cond_1
    invoke-static {p0}, Lql;->π(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    sget p0, Lcom/example/dyhelper/MainHook;->β:I

    .line 41
    .line 42
    return v1

    .line 43
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    sget-object v3, Lql;->ε:Ljava/util/List;

    .line 52
    .line 53
    const/4 v4, 0x1

    .line 54
    if-eqz v3, :cond_3

    .line 55
    .line 56
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_3

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_5

    .line 72
    .line 73
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    check-cast v5, Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v5, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-eqz v5, :cond_4

    .line 84
    .line 85
    goto/16 :goto_4

    .line 86
    .line 87
    :cond_5
    :goto_0
    const-string v3, "SimilarEmojiContainer"

    .line 88
    .line 89
    invoke-static {v2, v3, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-nez v3, :cond_c

    .line 94
    .line 95
    const-string v3, "similaremoji"

    .line 96
    .line 97
    invoke-static {v2, v3, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_6

    .line 102
    .line 103
    goto/16 :goto_4

    .line 104
    .line 105
    :cond_6
    sget-object v2, Lql;->κ:Ljava/util/Set;

    .line 106
    .line 107
    monitor-enter v2

    .line 108
    :try_start_0
    move-object v3, v2

    .line 109
    check-cast v3, Ljava/lang/Iterable;

    .line 110
    .line 111
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    :cond_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    if-eqz v5, :cond_8

    .line 120
    .line 121
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    check-cast v5, Ljava/lang/Class;

    .line 126
    .line 127
    invoke-virtual {v5, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    if-eqz v5, :cond_7

    .line 132
    .line 133
    monitor-exit v2

    .line 134
    goto :goto_4

    .line 135
    :catchall_0
    move-exception p0

    .line 136
    goto :goto_3

    .line 137
    :cond_8
    monitor-exit v2

    .line 138
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    const/high16 v5, 0x43480000    # 200.0f

    .line 158
    .line 159
    invoke-static {v3, v5}, Lql;->ν(Landroid/content/Context;F)I

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    if-lt v2, v3, :cond_9

    .line 164
    .line 165
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    const/high16 v5, 0x43960000    # 300.0f

    .line 185
    .line 186
    invoke-static {v3, v5}, Lql;->ν(Landroid/content/Context;F)I

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    if-lt v2, v3, :cond_9

    .line 191
    .line 192
    move v2, v4

    .line 193
    goto :goto_1

    .line 194
    :cond_9
    move v2, v1

    .line 195
    :goto_1
    invoke-static {v0}, Lql;->ο(Landroid/view/ViewGroup;)Landroid/view/View;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    if-eqz v3, :cond_a

    .line 200
    .line 201
    move v3, v4

    .line 202
    goto :goto_2

    .line 203
    :cond_a
    move v3, v1

    .line 204
    :goto_2
    if-eqz v2, :cond_b

    .line 205
    .line 206
    if-eqz v3, :cond_b

    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_b
    sget p0, Lcom/example/dyhelper/MainHook;->β:I

    .line 210
    .line 211
    return v1

    .line 212
    :goto_3
    monitor-exit v2

    .line 213
    throw p0

    .line 214
    :cond_c
    :goto_4
    sget-object v2, Lql;->ν:Ljava/util/Map;

    .line 215
    .line 216
    monitor-enter v2

    .line 217
    :try_start_1
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    check-cast v3, Ljava/lang/Integer;

    .line 222
    .line 223
    if-eqz v3, :cond_d

    .line 224
    .line 225
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    goto :goto_5

    .line 230
    :catchall_1
    move-exception p0

    .line 231
    goto/16 :goto_10

    .line 232
    .line 233
    :cond_d
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    invoke-interface {v2, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 242
    .line 243
    .line 244
    :goto_5
    monitor-exit v2

    .line 245
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    const/high16 v5, 0x42a40000    # 82.0f

    .line 253
    .line 254
    invoke-static {v2, v5}, Lql;->ν(Landroid/content/Context;F)I

    .line 255
    .line 256
    .line 257
    move-result v2

    .line 258
    add-int/2addr v2, v3

    .line 259
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 260
    .line 261
    .line 262
    move-result v3

    .line 263
    if-ge v3, v2, :cond_e

    .line 264
    .line 265
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 270
    .line 271
    .line 272
    move-result v5

    .line 273
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 274
    .line 275
    .line 276
    move-result v6

    .line 277
    invoke-virtual {v0, v3, v5, v6, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 281
    .line 282
    .line 283
    sget v0, Lcom/example/dyhelper/MainHook;->β:I

    .line 284
    .line 285
    :cond_e
    invoke-static {p0}, Lql;->ρ(Landroid/view/View;)Landroid/view/View;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    const/4 v2, 0x2

    .line 290
    if-eqz v0, :cond_f

    .line 291
    .line 292
    new-instance v1, Lhi;

    .line 293
    .line 294
    invoke-direct {v1, v2, p0}, Lhi;-><init>(ILjava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0}, Landroid/view/View;->bringToFront()V

    .line 301
    .line 302
    .line 303
    return v4

    .line 304
    :cond_f
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    new-instance v3, Landroid/widget/TextView;

    .line 312
    .line 313
    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 314
    .line 315
    .line 316
    const-string v5, "dyhelper_similar_emoji_download"

    .line 317
    .line 318
    invoke-virtual {v3, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    const-string v5, "\u4e0b\u8f7d\u8868\u60c5\u5305"

    .line 322
    .line 323
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 324
    .line 325
    .line 326
    const/16 v5, 0x11

    .line 327
    .line 328
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setGravity(I)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 332
    .line 333
    .line 334
    sget-object v5, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 335
    .line 336
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 340
    .line 341
    .line 342
    const/4 v5, -0x1

    .line 343
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 344
    .line 345
    .line 346
    const/high16 v6, 0x41700000    # 15.0f

    .line 347
    .line 348
    invoke-virtual {v3, v2, v6}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 349
    .line 350
    .line 351
    sget-object v6, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 352
    .line 353
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 354
    .line 355
    .line 356
    const/high16 v6, 0x42400000    # 48.0f

    .line 357
    .line 358
    invoke-static {v0, v6}, Lql;->ν(Landroid/content/Context;F)I

    .line 359
    .line 360
    .line 361
    move-result v6

    .line 362
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v3, v4}, Landroid/view/View;->setClickable(Z)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v3, v4}, Landroid/view/View;->setFocusable(Z)V

    .line 369
    .line 370
    .line 371
    const/high16 v6, 0x41000000    # 8.0f

    .line 372
    .line 373
    invoke-static {v0, v6}, Lql;->ν(Landroid/content/Context;F)I

    .line 374
    .line 375
    .line 376
    move-result v6

    .line 377
    int-to-float v6, v6

    .line 378
    invoke-virtual {v3, v6}, Landroid/view/View;->setElevation(F)V

    .line 379
    .line 380
    .line 381
    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    .line 382
    .line 383
    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 384
    .line 385
    .line 386
    const/high16 v7, 0x41c00000    # 24.0f

    .line 387
    .line 388
    invoke-static {v0, v7}, Lql;->ν(Landroid/content/Context;F)I

    .line 389
    .line 390
    .line 391
    move-result v7

    .line 392
    int-to-float v7, v7

    .line 393
    invoke-virtual {v6, v7}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 394
    .line 395
    .line 396
    const v7, -0x11e9e9ea

    .line 397
    .line 398
    .line 399
    invoke-virtual {v6, v7}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 400
    .line 401
    .line 402
    const/high16 v7, 0x3f000000    # 0.5f

    .line 403
    .line 404
    invoke-static {v0, v7}, Lql;->ν(Landroid/content/Context;F)I

    .line 405
    .line 406
    .line 407
    move-result v0

    .line 408
    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    const v7, 0x33ffffff

    .line 413
    .line 414
    .line 415
    invoke-virtual {v6, v0, v7}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v3, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 419
    .line 420
    .line 421
    new-instance v0, Lhi;

    .line 422
    .line 423
    invoke-direct {v0, v2, p0}, Lhi;-><init>(ILjava/lang/Object;)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 433
    .line 434
    .line 435
    instance-of v0, p0, Landroid/widget/FrameLayout;

    .line 436
    .line 437
    if-eqz v0, :cond_10

    .line 438
    .line 439
    move-object v0, p0

    .line 440
    check-cast v0, Landroid/widget/FrameLayout;

    .line 441
    .line 442
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 447
    .line 448
    .line 449
    invoke-static {v0}, Lql;->Ο(Landroid/content/Context;)Landroid/widget/FrameLayout$LayoutParams;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    invoke-virtual {p0, v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v3}, Landroid/view/View;->bringToFront()V

    .line 457
    .line 458
    .line 459
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 460
    .line 461
    .line 462
    sget p0, Lcom/example/dyhelper/MainHook;->β:I

    .line 463
    .line 464
    return v4

    .line 465
    :cond_10
    const-string v0, "dyhelper_similar_emoji_wrapper"

    .line 466
    .line 467
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 468
    .line 469
    .line 470
    move-result-object v2

    .line 471
    new-instance v6, Ljava/util/ArrayList;

    .line 472
    .line 473
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 474
    .line 475
    .line 476
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 477
    .line 478
    .line 479
    move-result v7

    .line 480
    move v8, v1

    .line 481
    :goto_6
    if-ge v8, v7, :cond_13

    .line 482
    .line 483
    invoke-virtual {p0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 484
    .line 485
    .line 486
    move-result-object v9

    .line 487
    invoke-virtual {v9}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v10

    .line 491
    const-string v11, "dyhelper_similar_emoji_download"

    .line 492
    .line 493
    invoke-static {v10, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    move-result v10

    .line 497
    if-nez v10, :cond_12

    .line 498
    .line 499
    invoke-virtual {v9}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v10

    .line 503
    invoke-static {v10, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    move-result v10

    .line 507
    if-eqz v10, :cond_11

    .line 508
    .line 509
    goto :goto_7

    .line 510
    :cond_11
    new-instance v10, Lml;

    .line 511
    .line 512
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 513
    .line 514
    .line 515
    move-result-object v11

    .line 516
    invoke-direct {v10, v9, v11}, Lml;-><init>(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 517
    .line 518
    .line 519
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 520
    .line 521
    .line 522
    :cond_12
    :goto_7
    add-int/lit8 v8, v8, 0x1

    .line 523
    .line 524
    goto :goto_6

    .line 525
    :cond_13
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 526
    .line 527
    .line 528
    move-result v7

    .line 529
    if-eqz v7, :cond_15

    .line 530
    .line 531
    :cond_14
    :goto_8
    return v1

    .line 532
    :cond_15
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 533
    .line 534
    .line 535
    move-result-object v7

    .line 536
    :cond_16
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 537
    .line 538
    .line 539
    move-result v8

    .line 540
    if-eqz v8, :cond_17

    .line 541
    .line 542
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v8

    .line 546
    move-object v9, v8

    .line 547
    check-cast v9, Lml;

    .line 548
    .line 549
    iget-object v9, v9, Lml;->α:Landroid/view/View;

    .line 550
    .line 551
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 552
    .line 553
    .line 554
    move-result-object v9

    .line 555
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object v9

    .line 559
    const-string v10, "RecyclerView"

    .line 560
    .line 561
    invoke-static {v9, v10, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 562
    .line 563
    .line 564
    move-result v9

    .line 565
    if-eqz v9, :cond_16

    .line 566
    .line 567
    goto :goto_9

    .line 568
    :cond_17
    const/4 v8, 0x0

    .line 569
    :goto_9
    check-cast v8, Lml;

    .line 570
    .line 571
    if-eqz v8, :cond_18

    .line 572
    .line 573
    iget-object v7, v8, Lml;->β:Landroid/view/ViewGroup$LayoutParams;

    .line 574
    .line 575
    if-eqz v7, :cond_18

    .line 576
    .line 577
    goto :goto_a

    .line 578
    :cond_18
    invoke-static {v6}, Lxh;->З(Ljava/util/List;)Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v7

    .line 582
    check-cast v7, Lml;

    .line 583
    .line 584
    iget-object v7, v7, Lml;->β:Landroid/view/ViewGroup$LayoutParams;

    .line 585
    .line 586
    if-nez v7, :cond_19

    .line 587
    .line 588
    new-instance v7, Landroid/view/ViewGroup$LayoutParams;

    .line 589
    .line 590
    invoke-direct {v7, v5, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 591
    .line 592
    .line 593
    :cond_19
    :goto_a
    new-instance v8, Landroid/widget/FrameLayout;

    .line 594
    .line 595
    invoke-direct {v8, v2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 596
    .line 597
    .line 598
    invoke-virtual {v8, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 599
    .line 600
    .line 601
    invoke-virtual {v8, v1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 602
    .line 603
    .line 604
    invoke-virtual {v8, v1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 605
    .line 606
    .line 607
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 608
    .line 609
    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v8, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 613
    .line 614
    .line 615
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 616
    .line 617
    .line 618
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 623
    .line 624
    .line 625
    move-result v1

    .line 626
    if-eqz v1, :cond_22

    .line 627
    .line 628
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v1

    .line 632
    check-cast v1, Lml;

    .line 633
    .line 634
    iget-object v6, v1, Lml;->α:Landroid/view/View;

    .line 635
    .line 636
    iget-object v1, v1, Lml;->β:Landroid/view/ViewGroup$LayoutParams;

    .line 637
    .line 638
    if-nez v1, :cond_1a

    .line 639
    .line 640
    :goto_c
    move v9, v5

    .line 641
    goto :goto_d

    .line 642
    :cond_1a
    iget v9, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 643
    .line 644
    if-nez v9, :cond_1b

    .line 645
    .line 646
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    .line 647
    .line 648
    .line 649
    move-result v9

    .line 650
    if-lez v9, :cond_1b

    .line 651
    .line 652
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    .line 653
    .line 654
    .line 655
    move-result v9

    .line 656
    goto :goto_d

    .line 657
    :cond_1b
    iget v9, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 658
    .line 659
    if-nez v9, :cond_1c

    .line 660
    .line 661
    goto :goto_c

    .line 662
    :cond_1c
    :goto_d
    if-nez v1, :cond_1d

    .line 663
    .line 664
    :goto_e
    move v10, v5

    .line 665
    goto :goto_f

    .line 666
    :cond_1d
    iget v10, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 667
    .line 668
    if-nez v10, :cond_1e

    .line 669
    .line 670
    invoke-virtual {v6}, Landroid/view/View;->getHeight()I

    .line 671
    .line 672
    .line 673
    move-result v10

    .line 674
    if-lez v10, :cond_1e

    .line 675
    .line 676
    invoke-virtual {v6}, Landroid/view/View;->getHeight()I

    .line 677
    .line 678
    .line 679
    move-result v10

    .line 680
    goto :goto_f

    .line 681
    :cond_1e
    iget v10, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 682
    .line 683
    if-nez v10, :cond_1f

    .line 684
    .line 685
    goto :goto_e

    .line 686
    :cond_1f
    :goto_f
    new-instance v11, Landroid/widget/FrameLayout$LayoutParams;

    .line 687
    .line 688
    invoke-direct {v11, v9, v10}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 689
    .line 690
    .line 691
    const v9, 0x800033

    .line 692
    .line 693
    .line 694
    iput v9, v11, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 695
    .line 696
    instance-of v9, v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 697
    .line 698
    if-eqz v9, :cond_20

    .line 699
    .line 700
    move-object v9, v1

    .line 701
    check-cast v9, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 702
    .line 703
    iget v10, v9, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 704
    .line 705
    iget v12, v9, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 706
    .line 707
    iget v13, v9, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 708
    .line 709
    iget v9, v9, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 710
    .line 711
    invoke-virtual {v11, v10, v12, v13, v9}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 712
    .line 713
    .line 714
    :cond_20
    instance-of v9, v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 715
    .line 716
    if-eqz v9, :cond_21

    .line 717
    .line 718
    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 719
    .line 720
    iget v1, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 721
    .line 722
    if-eq v1, v5, :cond_21

    .line 723
    .line 724
    iput v1, v11, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 725
    .line 726
    :cond_21
    invoke-virtual {v8, v6, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 727
    .line 728
    .line 729
    goto :goto_b

    .line 730
    :cond_22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 731
    .line 732
    .line 733
    invoke-static {v2}, Lql;->Ο(Landroid/content/Context;)Landroid/widget/FrameLayout$LayoutParams;

    .line 734
    .line 735
    .line 736
    move-result-object v0

    .line 737
    invoke-virtual {v8, v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 738
    .line 739
    .line 740
    invoke-virtual {p0, v8, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 741
    .line 742
    .line 743
    invoke-virtual {v3}, Landroid/view/View;->bringToFront()V

    .line 744
    .line 745
    .line 746
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 747
    .line 748
    .line 749
    sget p0, Lcom/example/dyhelper/MainHook;->β:I

    .line 750
    .line 751
    return v4

    .line 752
    :goto_10
    monitor-exit v2

    .line 753
    throw p0
.end method

.method public static Β(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, Lql;->Μ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/lang/reflect/Method;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lql;->Κ(Ljava/lang/Class;)V

    .line 30
    .line 31
    .line 32
    sget-object v2, Lql;->α:Lql;

    .line 33
    .line 34
    invoke-virtual {v2, v1}, Lql;->ω(Ljava/lang/reflect/Method;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    if-lez v0, :cond_2

    .line 44
    .line 45
    sget p0, Lcom/example/dyhelper/MainHook;->β:I

    .line 46
    .line 47
    :cond_2
    return-void
.end method

.method public static Γ(Landroid/view/View;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_2

    .line 7
    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "RemoteImageView"

    .line 21
    .line 22
    invoke-static {v1, v2, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    const-string v2, "SimpleDraweeView"

    .line 29
    .line 30
    invoke-static {v1, v2, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    const-string v2, "DraweeView"

    .line 37
    .line 38
    invoke-static {v1, v2, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    :goto_1
    const/4 p0, 0x1

    .line 51
    return p0

    .line 52
    :cond_2
    return v0
.end method

.method public static Δ(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {p0}, Lql;->Ι(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 6
    .line 7
    invoke-static {v0, p0, v0}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, "http"

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-static {p0, v0, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const-string v0, "mime_type=video"

    .line 21
    .line 22
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    const-string v0, "mime_type=audio"

    .line 29
    .line 30
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    const-string v0, ".mp4"

    .line 37
    .line 38
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_0

    .line 43
    .line 44
    const-string v0, ".mp3"

    .line 45
    .line 46
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-nez p0, :cond_0

    .line 51
    .line 52
    const/4 p0, 0x1

    .line 53
    return p0

    .line 54
    :cond_0
    return v1
.end method

.method public static Ε(Ljava/lang/reflect/Method;Z)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_0

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 19
    .line 20
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    goto/16 :goto_0

    .line 27
    .line 28
    :cond_1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    array-length v2, v0

    .line 33
    const/4 v3, 0x5

    .line 34
    if-eq v2, v3, :cond_2

    .line 35
    .line 36
    goto/16 :goto_0

    .line 37
    .line 38
    :cond_2
    aget-object v2, v0, v1

    .line 39
    .line 40
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 41
    .line 42
    invoke-static {v2, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-nez v2, :cond_3

    .line 47
    .line 48
    goto/16 :goto_0

    .line 49
    .line 50
    :cond_3
    const-class v2, Landroid/view/View;

    .line 51
    .line 52
    const/4 v3, 0x1

    .line 53
    aget-object v4, v0, v3

    .line 54
    .line 55
    invoke-virtual {v2, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_4

    .line 60
    .line 61
    goto/16 :goto_0

    .line 62
    .line 63
    :cond_4
    const/4 v2, 0x3

    .line 64
    aget-object v2, v0, v2

    .line 65
    .line 66
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 67
    .line 68
    invoke-static {v2, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-nez v2, :cond_5

    .line 73
    .line 74
    goto/16 :goto_0

    .line 75
    .line 76
    :cond_5
    const/4 v2, 0x4

    .line 77
    aget-object v2, v0, v2

    .line 78
    .line 79
    const-class v4, Ljava/lang/String;

    .line 80
    .line 81
    invoke-static {v2, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-nez v2, :cond_6

    .line 86
    .line 87
    goto/16 :goto_0

    .line 88
    .line 89
    :cond_6
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    const-class v4, Landroid/view/ViewGroup;

    .line 94
    .line 95
    invoke-virtual {v4, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-nez v4, :cond_7

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_7
    if-nez p1, :cond_8

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_8
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 110
    .line 111
    invoke-static {v2, p1, v2}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    const/4 v4, 0x2

    .line 116
    aget-object v0, v0, v4

    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    const-string v2, "emoji"

    .line 144
    .line 145
    invoke-static {p1, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    if-nez v4, :cond_a

    .line 150
    .line 151
    const-string v4, "sticker"

    .line 152
    .line 153
    invoke-static {p1, v4, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    if-nez v5, :cond_a

    .line 158
    .line 159
    const-string v5, "similaremoji"

    .line 160
    .line 161
    invoke-static {p1, v5, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    if-nez p1, :cond_a

    .line 166
    .line 167
    invoke-static {v0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    if-nez p1, :cond_a

    .line 172
    .line 173
    invoke-static {v0, v4, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    if-nez p1, :cond_a

    .line 178
    .line 179
    invoke-static {v0, v5, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 180
    .line 181
    .line 182
    move-result p1

    .line 183
    if-nez p1, :cond_a

    .line 184
    .line 185
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    if-nez p1, :cond_a

    .line 190
    .line 191
    invoke-static {p0, v4, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    if-nez p1, :cond_a

    .line 196
    .line 197
    invoke-static {p0, v5, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 198
    .line 199
    .line 200
    move-result p0

    .line 201
    if-eqz p0, :cond_9

    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_9
    :goto_0
    return v1

    .line 205
    :cond_a
    :goto_1
    return v3
.end method

.method public static Ζ(Landroid/view/View;)Z
    .locals 5

    .line 1
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v2, Lql;->ε:Ljava/util/List;

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_3

    .line 36
    .line 37
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v4, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_3
    :goto_0
    const-string v2, "SimilarEmojiContainer"

    .line 51
    .line 52
    invoke-static {v0, v2, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-nez v2, :cond_7

    .line 57
    .line 58
    const-string v2, "similaremoji"

    .line 59
    .line 60
    invoke-static {v0, v2, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_4

    .line 65
    .line 66
    const-string v2, "container"

    .line 67
    .line 68
    invoke-static {v0, v2, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_4
    sget-object v0, Lql;->κ:Ljava/util/Set;

    .line 76
    .line 77
    monitor-enter v0

    .line 78
    :try_start_0
    move-object v2, v0

    .line 79
    check-cast v2, Ljava/lang/Iterable;

    .line 80
    .line 81
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-eqz v4, :cond_6

    .line 90
    .line 91
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    check-cast v4, Ljava/lang/Class;

    .line 96
    .line 97
    invoke-virtual {v4, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    if-eqz v4, :cond_5

    .line 102
    .line 103
    monitor-exit v0

    .line 104
    return v3

    .line 105
    :catchall_0
    move-exception p0

    .line 106
    goto :goto_1

    .line 107
    :cond_6
    monitor-exit v0

    .line 108
    return v1

    .line 109
    :goto_1
    monitor-exit v0

    .line 110
    throw p0

    .line 111
    :cond_7
    :goto_2
    return v3
.end method

.method public static Η(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lql;->ε:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_4

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {p0, v2}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-nez v2, :cond_0

    .line 29
    .line 30
    sget-object v2, Ljz;->ε:Ljz;

    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    new-instance v3, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    array-length v4, v2

    .line 46
    const/4 v5, 0x0

    .line 47
    move v6, v5

    .line 48
    :goto_1
    if-ge v6, v4, :cond_2

    .line 49
    .line 50
    aget-object v7, v2, v6

    .line 51
    .line 52
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {v7, v5}, Lql;->Ε(Ljava/lang/reflect/Method;Z)Z

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    if-eqz v8, :cond_1

    .line 60
    .line 61
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eqz v4, :cond_3

    .line 76
    .line 77
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    check-cast v4, Ljava/lang/reflect/Method;

    .line 82
    .line 83
    const/4 v5, 0x1

    .line 84
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    move-object v2, v3

    .line 89
    :goto_3
    invoke-static {v0, v2}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_4
    new-instance p0, Ljava/util/HashSet;

    .line 94
    .line 95
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 96
    .line 97
    .line 98
    new-instance v1, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    :cond_5
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-eqz v2, :cond_6

    .line 112
    .line 113
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    move-object v3, v2

    .line 118
    check-cast v3, Ljava/lang/reflect/Method;

    .line 119
    .line 120
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-static {v3}, Lql;->Θ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-virtual {p0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-eqz v3, :cond_5

    .line 132
    .line 133
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_6
    return-object v1
.end method

.method public static Θ(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, "#"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v1, "("

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v2, Lwj;

    .line 42
    .line 43
    const/16 v3, 0x17

    .line 44
    .line 45
    invoke-direct {v2, v3}, Lwj;-><init>(I)V

    .line 46
    .line 47
    .line 48
    const/16 v3, 0x1e

    .line 49
    .line 50
    const-string v4, ","

    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    invoke-static {v1, v4, v5, v2, v3}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    const-string v2, "):"

    .line 58
    .line 59
    invoke-static {v0, v1, v2, p0}, Llz1;->ρ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method

.method public static Ι(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "//"

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-static {p0, v0, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const-string v0, "https:"

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :cond_0
    const-string v0, "&amp;"

    .line 25
    .line 26
    const-string v1, "&"

    .line 27
    .line 28
    invoke-static {p0, v0, v1}, Lx02;->Ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const-string v0, "\\u0026"

    .line 33
    .line 34
    invoke-static {p0, v0, v1}, Lx02;->Ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method public static Κ(Ljava/lang/Class;)V
    .locals 1

    .line 1
    const-class v0, Landroid/view/ViewGroup;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    sget-object v0, Lql;->κ:Ljava/util/Set;

    .line 11
    .line 12
    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    sget p0, Lcom/example/dyhelper/MainHook;->β:I

    .line 16
    .line 17
    return-void
.end method

.method public static Λ(Landroid/view/View;Ljava/util/List;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-static {p1, v1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v1}, Lql;->Ι(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    move-object v2, v1

    .line 56
    check-cast v2, Ljava/lang/String;

    .line 57
    .line 58
    const-string v3, "http"

    .line 59
    .line 60
    const/4 v4, 0x0

    .line 61
    invoke-static {v2, v3, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    return-void

    .line 78
    :cond_3
    sget-object v0, Lql;->η:Ljava/util/Map;

    .line 79
    .line 80
    monitor-enter v0

    .line 81
    :try_start_0
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    if-nez v1, :cond_4

    .line 86
    .line 87
    new-instance v1, Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :catchall_0
    move-exception p0

    .line 97
    goto :goto_5

    .line 98
    :cond_4
    :goto_2
    check-cast v1, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    .line 100
    monitor-exit v0

    .line 101
    monitor-enter v1

    .line 102
    :try_start_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    :cond_5
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_6

    .line 111
    .line 112
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, Ljava/lang/String;

    .line 117
    .line 118
    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-nez v2, :cond_5

    .line 123
    .line 124
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    goto :goto_3

    .line 128
    :catchall_1
    move-exception p0

    .line 129
    goto :goto_4

    .line 130
    :cond_6
    invoke-static {v1}, Lql;->ζ(Ljava/util/List;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    if-eqz p1, :cond_7

    .line 135
    .line 136
    sget-object v0, Lql;->ζ:Ljava/util/Map;

    .line 137
    .line 138
    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 139
    .line 140
    .line 141
    :cond_7
    monitor-exit v1

    .line 142
    return-void

    .line 143
    :goto_4
    monitor-exit v1

    .line 144
    throw p0

    .line 145
    :goto_5
    monitor-exit v0

    .line 146
    throw p0
.end method

.method public static Μ(Ljava/lang/ClassLoader;Z)Ljava/util/List;
    .locals 6

    .line 1
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v0, Lkx;->д:Lkx;

    .line 4
    .line 5
    invoke-static {v0, p0}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_4

    .line 10
    .line 11
    new-instance v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    const/4 v4, 0x1

    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    move-object v5, v3

    .line 32
    check-cast v5, Ljava/lang/reflect/Method;

    .line 33
    .line 34
    invoke-static {v5, v4}, Lql;->Ε(Ljava/lang/reflect/Method;Z)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_0

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    const/4 v2, 0x0

    .line 52
    :goto_1
    if-eqz v2, :cond_4

    .line 53
    .line 54
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_3

    .line 63
    .line 64
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    check-cast p1, Ljava/lang/reflect/Method;

    .line 69
    .line 70
    invoke-virtual {p1, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    return-object v2

    .line 75
    :cond_4
    invoke-static {p0}, Lql;->Η(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-nez v2, :cond_5

    .line 84
    .line 85
    :try_start_0
    sget-object p0, Lox;->α:Ljava/lang/Object;

    .line 86
    .line 87
    invoke-static {v0, v1}, Lox;->χ(Lkx;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    .line 89
    .line 90
    :catchall_0
    return-object v1

    .line 91
    :cond_5
    if-eqz p1, :cond_7

    .line 92
    .line 93
    sget-object p1, Lox;->α:Ljava/lang/Object;

    .line 94
    .line 95
    sget-object p1, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-nez p1, :cond_6

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_6
    new-instance p1, Lbb;

    .line 105
    .line 106
    const/16 v1, 0x11

    .line 107
    .line 108
    invoke-direct {p1, p0, v1}, Lbb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 109
    .line 110
    .line 111
    const-string v1, "\u5b9a\u4f4d\u8bc4\u8bba\u76f8\u4f3c\u8868\u60c5\u5165\u53e3\u65b9\u6cd5"

    .line 112
    .line 113
    invoke-static {v0, p0, v1, p1}, Lox;->λ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0

    .line 118
    :cond_7
    :goto_3
    sget-object p0, Ljz;->ε:Ljz;

    .line 119
    .line 120
    return-object p0
.end method

.method public static Ν(Ljava/lang/String;)I
    .locals 3

    .line 1
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-static {v0, p0, v0}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, ".gif"

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    const-string v0, "format=gif"

    .line 17
    .line 18
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v0, v1

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    :goto_0
    const/16 v0, 0x3e8

    .line 28
    .line 29
    :goto_1
    const-string v2, "animated"

    .line 30
    .line 31
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_2

    .line 36
    .line 37
    const-string v2, "awebp"

    .line 38
    .line 39
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    :cond_2
    add-int/lit16 v0, v0, 0x320

    .line 46
    .line 47
    :cond_3
    const-string v2, ".webp"

    .line 48
    .line 49
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_4

    .line 54
    .line 55
    add-int/lit16 v0, v0, 0x1f4

    .line 56
    .line 57
    :cond_4
    const-string v2, "sticker"

    .line 58
    .line 59
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_5

    .line 64
    .line 65
    const-string v2, "emoji"

    .line 66
    .line 67
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_6

    .line 72
    .line 73
    :cond_5
    add-int/lit16 v0, v0, 0x12c

    .line 74
    .line 75
    :cond_6
    const-string v2, "thumb"

    .line 76
    .line 77
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_7

    .line 82
    .line 83
    add-int/lit16 v0, v0, -0x1f4

    .line 84
    .line 85
    :cond_7
    const-string v2, "cover"

    .line 86
    .line 87
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_8

    .line 92
    .line 93
    add-int/lit16 v0, v0, -0x1f4

    .line 94
    .line 95
    :cond_8
    const-string v2, "avatar"

    .line 96
    .line 97
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_9

    .line 102
    .line 103
    add-int/lit16 v0, v0, -0x4b0

    .line 104
    .line 105
    :cond_9
    const-string v2, "profile"

    .line 106
    .line 107
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-eqz v2, :cond_a

    .line 112
    .line 113
    add-int/lit16 v0, v0, -0x4b0

    .line 114
    .line 115
    :cond_a
    const-string v2, "user_avatar"

    .line 116
    .line 117
    invoke-static {p0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    if-eqz p0, :cond_b

    .line 122
    .line 123
    add-int/lit16 v0, v0, -0x4b0

    .line 124
    .line 125
    :cond_b
    return v0
.end method

.method public static Ξ(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_0

    .line 5
    :cond_0
    instance-of v1, p0, Ljava/lang/String;

    .line 6
    .line 7
    if-nez v1, :cond_6

    .line 8
    .line 9
    instance-of v1, p0, Landroid/net/Uri;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    return v0

    .line 14
    :cond_1
    instance-of v1, p0, Ljava/lang/Number;

    .line 15
    .line 16
    if-nez v1, :cond_6

    .line 17
    .line 18
    instance-of v1, p0, Ljava/lang/Boolean;

    .line 19
    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    return v0

    .line 23
    :cond_2
    instance-of v1, p0, Landroid/view/View;

    .line 24
    .line 25
    if-nez v1, :cond_6

    .line 26
    .line 27
    instance-of v1, p0, Landroid/content/Context;

    .line 28
    .line 29
    if-eqz v1, :cond_3

    .line 30
    .line 31
    return v0

    .line 32
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 41
    .line 42
    invoke-static {v2, v1, v2}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const-string v2, "emoji"

    .line 47
    .line 48
    invoke-static {v1, v2, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_5

    .line 53
    .line 54
    const-string v2, "url"

    .line 55
    .line 56
    invoke-static {v1, v2, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-nez v2, :cond_5

    .line 61
    .line 62
    const-string v2, "image"

    .line 63
    .line 64
    invoke-static {v1, v2, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-nez v2, :cond_5

    .line 69
    .line 70
    const-string v2, "icon"

    .line 71
    .line 72
    invoke-static {v1, v2, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-nez v2, :cond_5

    .line 77
    .line 78
    const-string v2, "model"

    .line 79
    .line 80
    invoke-static {v1, v2, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-nez v2, :cond_5

    .line 85
    .line 86
    const-string v2, "x."

    .line 87
    .line 88
    invoke-static {v1, v2, v0}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-nez v1, :cond_5

    .line 93
    .line 94
    instance-of v1, p0, Ljava/lang/Iterable;

    .line 95
    .line 96
    if-nez v1, :cond_5

    .line 97
    .line 98
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    if-eqz p0, :cond_4

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_4
    :goto_0
    return v0

    .line 110
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 111
    return p0

    .line 112
    :cond_6
    return v0
.end method

.method public static Ο(Landroid/content/Context;)Landroid/widget/FrameLayout$LayoutParams;
    .locals 4

    .line 1
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 2
    .line 3
    const/high16 v1, 0x42400000    # 48.0f

    .line 4
    .line 5
    invoke-static {p0, v1}, Lql;->ν(Landroid/content/Context;F)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/16 v2, 0x51

    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    invoke-direct {v0, v3, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 13
    .line 14
    .line 15
    const/high16 v1, 0x41800000    # 16.0f

    .line 16
    .line 17
    invoke-static {p0, v1}, Lql;->ν(Landroid/content/Context;F)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 22
    .line 23
    invoke-static {p0, v1}, Lql;->ν(Landroid/content/Context;F)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 28
    .line 29
    const/high16 v1, 0x41b00000    # 22.0f

    .line 30
    .line 31
    invoke-static {p0, v1}, Lql;->ν(Landroid/content/Context;F)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    iput p0, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 36
    .line 37
    return-object v0
.end method

.method public static final α(Lql;Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 12

    .line 1
    const/4 p0, 0x0

    .line 2
    const/4 v0, 0x0

    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    array-length v1, p2

    .line 6
    move v2, p0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_1

    .line 8
    .line 9
    aget-object v3, p2, v2

    .line 10
    .line 11
    instance-of v4, v3, Landroid/view/View;

    .line 12
    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    move-object v3, v0

    .line 20
    :goto_1
    instance-of v1, v3, Landroid/view/View;

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    check-cast v3, Landroid/view/View;

    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_2
    move-object v3, v0

    .line 28
    :goto_2
    instance-of v1, p1, Landroid/view/ViewGroup;

    .line 29
    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    check-cast p1, Landroid/view/ViewGroup;

    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_3
    move-object p1, v0

    .line 36
    :goto_3
    if-nez p1, :cond_7

    .line 37
    .line 38
    move-object p1, v3

    .line 39
    :goto_4
    if-eqz p1, :cond_4

    .line 40
    .line 41
    invoke-static {p1}, Lql;->Ζ(Landroid/view/View;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_5

    .line 46
    .line 47
    instance-of v1, p1, Landroid/view/ViewGroup;

    .line 48
    .line 49
    if-eqz v1, :cond_4

    .line 50
    .line 51
    check-cast p1, Landroid/view/ViewGroup;

    .line 52
    .line 53
    goto :goto_5

    .line 54
    :cond_4
    move-object p1, v0

    .line 55
    goto :goto_5

    .line 56
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    instance-of v1, p1, Landroid/view/View;

    .line 61
    .line 62
    if-eqz v1, :cond_6

    .line 63
    .line 64
    check-cast p1, Landroid/view/View;

    .line 65
    .line 66
    goto :goto_4

    .line 67
    :cond_6
    move-object p1, v0

    .line 68
    goto :goto_4

    .line 69
    :cond_7
    :goto_5
    const/4 v1, 0x1

    .line 70
    if-eqz p2, :cond_d

    .line 71
    .line 72
    array-length v2, p2

    .line 73
    if-nez v2, :cond_8

    .line 74
    .line 75
    goto :goto_8

    .line 76
    :cond_8
    array-length v2, p2

    .line 77
    move v4, p0

    .line 78
    :goto_6
    if-ge v4, v2, :cond_a

    .line 79
    .line 80
    aget-object v5, p2, v4

    .line 81
    .line 82
    if-eqz v5, :cond_9

    .line 83
    .line 84
    instance-of v6, v5, Landroid/view/View;

    .line 85
    .line 86
    if-nez v6, :cond_9

    .line 87
    .line 88
    instance-of v6, v5, Ljava/lang/String;

    .line 89
    .line 90
    if-nez v6, :cond_9

    .line 91
    .line 92
    instance-of v6, v5, Ljava/lang/Boolean;

    .line 93
    .line 94
    if-nez v6, :cond_9

    .line 95
    .line 96
    instance-of v6, v5, Ljava/lang/Integer;

    .line 97
    .line 98
    if-nez v6, :cond_9

    .line 99
    .line 100
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    const-string v7, "emoji"

    .line 109
    .line 110
    invoke-static {v6, v7, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    if-nez v6, :cond_b

    .line 115
    .line 116
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    const-string v7, "sticker"

    .line 125
    .line 126
    invoke-static {v6, v7, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    if-eqz v6, :cond_9

    .line 131
    .line 132
    goto :goto_7

    .line 133
    :cond_9
    add-int/lit8 v4, v4, 0x1

    .line 134
    .line 135
    goto :goto_6

    .line 136
    :cond_a
    move-object v5, v0

    .line 137
    :cond_b
    :goto_7
    if-eqz v5, :cond_c

    .line 138
    .line 139
    goto :goto_9

    .line 140
    :cond_c
    const/4 v2, 0x2

    .line 141
    invoke-static {v2, p2}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    goto :goto_9

    .line 146
    :cond_d
    :goto_8
    move-object v5, v0

    .line 147
    :goto_9
    const-string p2, "sticker"

    .line 148
    .line 149
    if-nez v5, :cond_e

    .line 150
    .line 151
    new-instance p2, Lrl;

    .line 152
    .line 153
    sget-object v2, Ljz;->ε:Ljz;

    .line 154
    .line 155
    invoke-direct {p2, v2, v2}, Lrl;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 156
    .line 157
    .line 158
    goto :goto_a

    .line 159
    :cond_e
    const-string v2, "emoji"

    .line 160
    .line 161
    filled-new-array {p2, v2}, [Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-static {v2}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-static {v5, p2, v2}, Lxb;->Τ(Ljava/lang/Object;Ljava/lang/String;Ljava/util/Set;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    if-nez p2, :cond_f

    .line 174
    .line 175
    move-object p2, v5

    .line 176
    :cond_f
    const-string v2, "animate_url"

    .line 177
    .line 178
    const-string v4, "animateUrl"

    .line 179
    .line 180
    const-string v6, "animatedUrl"

    .line 181
    .line 182
    filled-new-array {v4, v6}, [Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    invoke-static {v4}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    invoke-static {p2, v2, v4}, Lxb;->Τ(Ljava/lang/Object;Ljava/lang/String;Ljava/util/Set;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    const-string v4, "static_url"

    .line 195
    .line 196
    const-string v6, "staticUrl"

    .line 197
    .line 198
    invoke-static {v6}, Lg81;->φ(Ljava/lang/Object;)Ljava/util/Set;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    invoke-static {p2, v4, v6}, Lxb;->Τ(Ljava/lang/Object;Ljava/lang/String;Ljava/util/Set;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    new-instance v4, Lrl;

    .line 207
    .line 208
    invoke-static {v2}, Lxb;->μ(Ljava/lang/Object;)Ljava/util/List;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-static {p2}, Lxb;->μ(Ljava/lang/Object;)Ljava/util/List;

    .line 213
    .line 214
    .line 215
    move-result-object p2

    .line 216
    invoke-direct {v4, v2, p2}, Lrl;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 217
    .line 218
    .line 219
    move-object p2, v4

    .line 220
    :goto_a
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 221
    .line 222
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 223
    .line 224
    .line 225
    iget-object v4, p2, Lrl;->α:Ljava/util/List;

    .line 226
    .line 227
    invoke-virtual {v2, v4}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 228
    .line 229
    .line 230
    iget-object v4, p2, Lrl;->β:Ljava/util/List;

    .line 231
    .line 232
    invoke-virtual {v2, v4}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 233
    .line 234
    .line 235
    sget-object v4, Ljz;->ε:Ljz;

    .line 236
    .line 237
    if-nez v5, :cond_10

    .line 238
    .line 239
    goto/16 :goto_10

    .line 240
    .line 241
    :cond_10
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 242
    .line 243
    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    .line 244
    .line 245
    .line 246
    invoke-static {v5}, Lql;->ξ(Ljava/lang/Object;)Ljava/util/List;

    .line 247
    .line 248
    .line 249
    move-result-object v7

    .line 250
    invoke-virtual {v6, v7}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 251
    .line 252
    .line 253
    instance-of v7, v5, Landroid/view/View;

    .line 254
    .line 255
    const/16 v8, 0xa

    .line 256
    .line 257
    if-nez v7, :cond_15

    .line 258
    .line 259
    instance-of v7, v5, Landroid/content/Context;

    .line 260
    .line 261
    if-eqz v7, :cond_11

    .line 262
    .line 263
    goto :goto_d

    .line 264
    :cond_11
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 265
    .line 266
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 267
    .line 268
    .line 269
    new-instance v7, Ljava/util/IdentityHashMap;

    .line 270
    .line 271
    invoke-direct {v7}, Ljava/util/IdentityHashMap;-><init>()V

    .line 272
    .line 273
    .line 274
    invoke-static {v7}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 275
    .line 276
    .line 277
    move-result-object v7

    .line 278
    invoke-static {p0, v5, v4, v7}, Lql;->λ(ILjava/lang/Object;Ljava/util/LinkedHashSet;Ljava/util/Set;)V

    .line 279
    .line 280
    .line 281
    new-instance v5, Ljava/util/ArrayList;

    .line 282
    .line 283
    invoke-static {v4, v8}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 284
    .line 285
    .line 286
    move-result v7

    .line 287
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 288
    .line 289
    .line 290
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 291
    .line 292
    .line 293
    move-result-object v4

    .line 294
    :goto_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 295
    .line 296
    .line 297
    move-result v7

    .line 298
    if-eqz v7, :cond_12

    .line 299
    .line 300
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v7

    .line 304
    check-cast v7, Ljava/lang/String;

    .line 305
    .line 306
    invoke-static {v7}, Lql;->Ι(Ljava/lang/String;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v7

    .line 310
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    goto :goto_b

    .line 314
    :cond_12
    new-instance v4, Ljava/util/ArrayList;

    .line 315
    .line 316
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 320
    .line 321
    .line 322
    move-result-object v5

    .line 323
    :cond_13
    :goto_c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 324
    .line 325
    .line 326
    move-result v7

    .line 327
    if-eqz v7, :cond_14

    .line 328
    .line 329
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v7

    .line 333
    move-object v9, v7

    .line 334
    check-cast v9, Ljava/lang/String;

    .line 335
    .line 336
    invoke-static {v9}, Lql;->Δ(Ljava/lang/String;)Z

    .line 337
    .line 338
    .line 339
    move-result v9

    .line 340
    if-eqz v9, :cond_13

    .line 341
    .line 342
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    goto :goto_c

    .line 346
    :cond_14
    invoke-static {v4}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 347
    .line 348
    .line 349
    move-result-object v4

    .line 350
    invoke-static {v4}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 351
    .line 352
    .line 353
    move-result-object v4

    .line 354
    :cond_15
    :goto_d
    invoke-virtual {v6, v4}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 355
    .line 356
    .line 357
    new-instance v4, Ljava/util/ArrayList;

    .line 358
    .line 359
    invoke-static {v6, v8}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 360
    .line 361
    .line 362
    move-result v5

    .line 363
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 364
    .line 365
    .line 366
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 367
    .line 368
    .line 369
    move-result-object v5

    .line 370
    :goto_e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 371
    .line 372
    .line 373
    move-result v6

    .line 374
    if-eqz v6, :cond_16

    .line 375
    .line 376
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v6

    .line 380
    check-cast v6, Ljava/lang/String;

    .line 381
    .line 382
    invoke-static {v6}, Lql;->Ι(Ljava/lang/String;)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v6

    .line 386
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    goto :goto_e

    .line 390
    :cond_16
    new-instance v5, Ljava/util/ArrayList;

    .line 391
    .line 392
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 396
    .line 397
    .line 398
    move-result-object v4

    .line 399
    :cond_17
    :goto_f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 400
    .line 401
    .line 402
    move-result v6

    .line 403
    if-eqz v6, :cond_18

    .line 404
    .line 405
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v6

    .line 409
    move-object v7, v6

    .line 410
    check-cast v7, Ljava/lang/String;

    .line 411
    .line 412
    invoke-static {v7}, Lql;->Δ(Ljava/lang/String;)Z

    .line 413
    .line 414
    .line 415
    move-result v7

    .line 416
    if-eqz v7, :cond_17

    .line 417
    .line 418
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    goto :goto_f

    .line 422
    :cond_18
    invoke-static {v5}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 423
    .line 424
    .line 425
    move-result-object v4

    .line 426
    invoke-static {v4}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 427
    .line 428
    .line 429
    move-result-object v4

    .line 430
    :goto_10
    invoke-virtual {v2, v4}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 431
    .line 432
    .line 433
    if-eqz v3, :cond_19

    .line 434
    .line 435
    const/16 v4, 0x8

    .line 436
    .line 437
    invoke-static {v3, v4}, Lql;->ι(Landroid/view/View;I)Ljava/util/List;

    .line 438
    .line 439
    .line 440
    move-result-object v4

    .line 441
    invoke-virtual {v2, v4}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 442
    .line 443
    .line 444
    :cond_19
    if-eqz p1, :cond_1a

    .line 445
    .line 446
    const/4 v4, 0x5

    .line 447
    invoke-static {p1, v4}, Lql;->ι(Landroid/view/View;I)Ljava/util/List;

    .line 448
    .line 449
    .line 450
    move-result-object v4

    .line 451
    invoke-virtual {v2, v4}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 452
    .line 453
    .line 454
    :cond_1a
    iget-object p2, p2, Lrl;->α:Ljava/util/List;

    .line 455
    .line 456
    invoke-static {p2}, Lql;->ζ(Ljava/util/List;)Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object p2

    .line 460
    if-nez p2, :cond_1b

    .line 461
    .line 462
    invoke-static {v2}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 463
    .line 464
    .line 465
    move-result-object v2

    .line 466
    invoke-static {v2}, Lql;->ζ(Ljava/util/List;)Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    if-nez v2, :cond_1c

    .line 471
    .line 472
    sget p0, Lcom/example/dyhelper/MainHook;->β:I

    .line 473
    .line 474
    return-void

    .line 475
    :cond_1b
    move-object v2, p2

    .line 476
    :cond_1c
    if-eqz p1, :cond_1d

    .line 477
    .line 478
    new-instance v4, Ljava/lang/ref/WeakReference;

    .line 479
    .line 480
    invoke-direct {v4, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 481
    .line 482
    .line 483
    move-object v6, v4

    .line 484
    goto :goto_11

    .line 485
    :cond_1d
    move-object v6, v0

    .line 486
    :goto_11
    if-eqz v3, :cond_1e

    .line 487
    .line 488
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 489
    .line 490
    invoke-direct {v0, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    :cond_1e
    move-object v7, v0

    .line 494
    invoke-static {v2}, Lql;->Ι(Ljava/lang/String;)Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v8

    .line 498
    if-nez p2, :cond_20

    .line 499
    .line 500
    invoke-static {v2}, Lql;->υ(Ljava/lang/String;)Z

    .line 501
    .line 502
    .line 503
    move-result p2

    .line 504
    if-eqz p2, :cond_1f

    .line 505
    .line 506
    goto :goto_12

    .line 507
    :cond_1f
    move v9, p0

    .line 508
    goto :goto_13

    .line 509
    :cond_20
    :goto_12
    move v9, v1

    .line 510
    :goto_13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 511
    .line 512
    .line 513
    move-result-wide v10

    .line 514
    new-instance v5, Lol;

    .line 515
    .line 516
    invoke-direct/range {v5 .. v11}, Lol;-><init>(Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;Ljava/lang/String;ZJ)V

    .line 517
    .line 518
    .line 519
    sput-object v5, Lql;->ξ:Lol;

    .line 520
    .line 521
    if-eqz p1, :cond_21

    .line 522
    .line 523
    sget-object p0, Lql;->μ:Ljava/util/Map;

    .line 524
    .line 525
    monitor-enter p0

    .line 526
    :try_start_0
    invoke-interface {p0, p1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 527
    .line 528
    .line 529
    monitor-exit p0

    .line 530
    goto :goto_14

    .line 531
    :catchall_0
    move-exception v0

    .line 532
    move-object p1, v0

    .line 533
    monitor-exit p0

    .line 534
    throw p1

    .line 535
    :cond_21
    :goto_14
    invoke-static {v8}, Lql;->μ(Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    sget p0, Lcom/example/dyhelper/MainHook;->β:I

    .line 539
    .line 540
    return-void
.end method

.method public static final β(Ljava/lang/Object;Ljava/util/List;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-static {p1, v1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v1}, Lql;->Ι(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    move-object v2, v1

    .line 56
    check-cast v2, Ljava/lang/String;

    .line 57
    .line 58
    const-string v3, "http"

    .line 59
    .line 60
    const/4 v4, 0x0

    .line 61
    invoke-static {v2, v3, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    return-void

    .line 78
    :cond_3
    sget-object v0, Lql;->θ:Ljava/util/Map;

    .line 79
    .line 80
    monitor-enter v0

    .line 81
    :try_start_0
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    if-nez v1, :cond_4

    .line 86
    .line 87
    new-instance v1, Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :catchall_0
    move-exception p0

    .line 97
    goto :goto_5

    .line 98
    :cond_4
    :goto_2
    check-cast v1, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    .line 100
    monitor-exit v0

    .line 101
    monitor-enter v1

    .line 102
    :try_start_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    :cond_5
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-eqz p1, :cond_6

    .line 111
    .line 112
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    check-cast p1, Ljava/lang/String;

    .line 117
    .line 118
    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-nez v0, :cond_5

    .line 123
    .line 124
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 125
    .line 126
    .line 127
    goto :goto_3

    .line 128
    :catchall_1
    move-exception p0

    .line 129
    goto :goto_4

    .line 130
    :cond_6
    monitor-exit v1

    .line 131
    return-void

    .line 132
    :goto_4
    monitor-exit v1

    .line 133
    throw p0

    .line 134
    :goto_5
    monitor-exit v0

    .line 135
    throw p0
.end method

.method public static final γ(Lql;Landroid/view/ViewGroup;)V
    .locals 5

    .line 1
    const/4 p0, 0x7

    .line 2
    new-array v0, p0, [J

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, p0, :cond_0

    .line 9
    .line 10
    aget-wide v2, v0, v1

    .line 11
    .line 12
    new-instance v4, Lgj;

    .line 13
    .line 14
    invoke-direct {v4, p1, v2, v3}, Lgj;-><init>(Landroid/view/ViewGroup;J)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v4, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 18
    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void

    .line 24
    nop

    .line 25
    :array_0
    .array-data 8
        0x0
        0x78
        0x12c
        0x258
        0x3e8
        0x5dc
        0x7d0
    .end array-data
.end method

.method public static final δ(Ljava/lang/reflect/Method;)I
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 10
    .line 11
    invoke-static {v1, v0, v1}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    invoke-static {v3, v2}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Ljava/lang/Class;

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 v2, 0x0

    .line 44
    :goto_0
    if-nez v2, :cond_1

    .line 45
    .line 46
    const-string v2, ""

    .line 47
    .line 48
    :cond_1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    const-string v3, "similaremoji"

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    invoke-static {v0, v3, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_2

    .line 70
    .line 71
    const/16 v3, 0x3e8

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    move v3, v4

    .line 75
    :goto_1
    const-string v5, "emoji"

    .line 76
    .line 77
    invoke-static {v0, v5, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-eqz v6, :cond_3

    .line 82
    .line 83
    add-int/lit16 v3, v3, 0x2bc

    .line 84
    .line 85
    :cond_3
    const-string v6, "sticker"

    .line 86
    .line 87
    invoke-static {v0, v6, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_4

    .line 92
    .line 93
    add-int/lit16 v3, v3, 0x1f4

    .line 94
    .line 95
    :cond_4
    invoke-static {v2, v5, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-nez v0, :cond_5

    .line 100
    .line 101
    invoke-static {v2, v6, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_6

    .line 106
    .line 107
    :cond_5
    add-int/lit16 v3, v3, 0x12c

    .line 108
    .line 109
    :cond_6
    invoke-static {v1, v5, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-nez v0, :cond_7

    .line 114
    .line 115
    invoke-static {v1, v6, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_8

    .line 120
    .line 121
    :cond_7
    add-int/lit16 v3, v3, 0xc8

    .line 122
    .line 123
    :cond_8
    const-class v0, Landroid/view/ViewGroup;

    .line 124
    .line 125
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    if-eqz p0, :cond_9

    .line 134
    .line 135
    add-int/lit8 v3, v3, 0x64

    .line 136
    .line 137
    :cond_9
    return v3
.end method

.method public static ε(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {v1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    array-length v2, v1

    .line 14
    const/4 v3, 0x0

    .line 15
    :goto_0
    if-ge v3, v2, :cond_1

    .line 16
    .line 17
    aget-object v4, v1, v3

    .line 18
    .line 19
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    invoke-static {v5, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    array-length v5, v5

    .line 37
    if-nez v5, :cond_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    goto :goto_2

    .line 42
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move-object v4, v0

    .line 46
    :goto_1
    if-nez v4, :cond_2

    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_2
    const/4 p1, 0x1

    .line 50
    invoke-virtual {v4, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    goto :goto_3

    .line 58
    :goto_2
    new-instance p1, Leo1;

    .line 59
    .line 60
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    move-object p0, p1

    .line 64
    :goto_3
    instance-of p1, p0, Leo1;

    .line 65
    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_3
    move-object v0, p0

    .line 70
    :goto_4
    return-object v0
.end method

.method public static ζ(Ljava/util/List;)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-static {p0, v1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v1}, Lql;->Ι(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    move-object v2, v1

    .line 56
    check-cast v2, Ljava/lang/String;

    .line 57
    .line 58
    const-string v3, "http"

    .line 59
    .line 60
    const/4 v4, 0x0

    .line 61
    invoke-static {v2, v3, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    :cond_3
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_4

    .line 85
    .line 86
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    move-object v2, v1

    .line 91
    check-cast v2, Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {v2}, Lql;->Δ(Ljava/lang/String;)Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-eqz v2, :cond_3

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    invoke-static {v0}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-static {p0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    new-instance v0, Ltf;

    .line 112
    .line 113
    const/16 v1, 0x13

    .line 114
    .line 115
    invoke-direct {v0, v1}, Ltf;-><init>(I)V

    .line 116
    .line 117
    .line 118
    invoke-static {p0, v0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-static {p0}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    check-cast p0, Ljava/lang/String;

    .line 127
    .line 128
    return-object p0
.end method

.method public static η(Landroid/view/View;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Lum1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lsm1;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    iput v2, v1, Lsm1;->ε:I

    .line 14
    .line 15
    new-instance v2, Ljava/util/IdentityHashMap;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/util/IdentityHashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-static {v2}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-static {v2, v1, v0, p0, v3}, Lql;->θ(Ljava/util/Set;Lsm1;Lum1;Landroid/view/View;I)V

    .line 26
    .line 27
    .line 28
    iget-object p0, v0, Lum1;->ε:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Ljava/lang/CharSequence;

    .line 31
    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget-object p0, v0, Lum1;->ε:Ljava/lang/Object;

    .line 42
    .line 43
    invoke-static {p0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    sget p0, Lcom/example/dyhelper/MainHook;->β:I

    .line 47
    .line 48
    :cond_1
    :goto_0
    iget-object p0, v0, Lum1;->ε:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, Ljava/lang/String;

    .line 51
    .line 52
    return-object p0
.end method

.method public static final θ(Ljava/util/Set;Lsm1;Lum1;Landroid/view/View;I)V
    .locals 10

    .line 1
    const/16 v0, 0xe

    .line 2
    .line 3
    if-le p4, v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_8

    .line 6
    .line 7
    :cond_0
    invoke-interface {p0, p3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    goto/16 :goto_8

    .line 14
    .line 15
    :cond_1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-static {p3}, Lql;->σ(Landroid/view/View;)Ljava/util/ArrayList;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 25
    .line 26
    .line 27
    invoke-static {p3}, Lql;->Γ(Landroid/view/View;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/16 v2, 0xa

    .line 32
    .line 33
    if-nez v1, :cond_5

    .line 34
    .line 35
    new-instance v1, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-static {v0, v2}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v2}, Lql;->Ι(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_4

    .line 82
    .line 83
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    move-object v3, v2

    .line 88
    check-cast v3, Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {v3}, Lql;->Δ(Ljava/lang/String;)Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_3

    .line 95
    .line 96
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    invoke-static {v0}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    goto/16 :goto_5

    .line 109
    .line 110
    :cond_5
    const-string v8, "getSourceUri"

    .line 111
    .line 112
    const-string v9, "getUri"

    .line 113
    .line 114
    const-string v3, "getController"

    .line 115
    .line 116
    const-string v4, "getImageRequest"

    .line 117
    .line 118
    const-string v5, "getImageURI"

    .line 119
    .line 120
    const-string v6, "getImageUri"

    .line 121
    .line 122
    const-string v7, "getImageUrl"

    .line 123
    .line 124
    filled-new-array/range {v3 .. v9}, [Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-static {v1}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    :cond_6
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    if-eqz v3, :cond_7

    .line 141
    .line 142
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    check-cast v3, Ljava/lang/String;

    .line 147
    .line 148
    invoke-static {p3, v3}, Lql;->ε(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    if-eqz v3, :cond_6

    .line 153
    .line 154
    invoke-static {v3}, Lql;->ξ(Ljava/lang/Object;)Ljava/util/List;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 159
    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_7
    new-instance v1, Ljava/util/ArrayList;

    .line 163
    .line 164
    invoke-static {v0, v2}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 169
    .line 170
    .line 171
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    if-eqz v2, :cond_8

    .line 180
    .line 181
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    check-cast v2, Ljava/lang/String;

    .line 186
    .line 187
    invoke-static {v2}, Lql;->Ι(Ljava/lang/String;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_8
    new-instance v0, Ljava/util/ArrayList;

    .line 196
    .line 197
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    :cond_9
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    if-eqz v2, :cond_a

    .line 209
    .line 210
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    move-object v3, v2

    .line 215
    check-cast v3, Ljava/lang/String;

    .line 216
    .line 217
    invoke-static {v3}, Lql;->Δ(Ljava/lang/String;)Z

    .line 218
    .line 219
    .line 220
    move-result v3

    .line 221
    if-eqz v3, :cond_9

    .line 222
    .line 223
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    goto :goto_4

    .line 227
    :cond_a
    invoke-static {v0}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    if-nez v1, :cond_b

    .line 240
    .line 241
    invoke-static {p3, v0}, Lql;->Λ(Landroid/view/View;Ljava/util/List;)V

    .line 242
    .line 243
    .line 244
    :cond_b
    :goto_5
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    const/4 v2, 0x0

    .line 249
    if-nez v1, :cond_16

    .line 250
    .line 251
    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    .line 256
    .line 257
    .line 258
    move-result v3

    .line 259
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 260
    .line 261
    .line 262
    move-result v1

    .line 263
    if-gez v1, :cond_c

    .line 264
    .line 265
    move v1, v2

    .line 266
    :cond_c
    invoke-virtual {p3}, Landroid/view/View;->getHeight()I

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    .line 271
    .line 272
    .line 273
    move-result v4

    .line 274
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 275
    .line 276
    .line 277
    move-result v3

    .line 278
    if-gez v3, :cond_d

    .line 279
    .line 280
    move v3, v2

    .line 281
    :cond_d
    int-to-long v4, v1

    .line 282
    int-to-long v6, v3

    .line 283
    mul-long/2addr v4, v6

    .line 284
    const-wide/16 v6, 0x96

    .line 285
    .line 286
    div-long/2addr v4, v6

    .line 287
    const-wide/16 v6, 0x9c4

    .line 288
    .line 289
    cmp-long v1, v4, v6

    .line 290
    .line 291
    if-lez v1, :cond_e

    .line 292
    .line 293
    move-wide v4, v6

    .line 294
    :cond_e
    long-to-int v1, v4

    .line 295
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    :cond_f
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 300
    .line 301
    .line 302
    move-result v3

    .line 303
    if-eqz v3, :cond_16

    .line 304
    .line 305
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    check-cast v3, Ljava/lang/String;

    .line 310
    .line 311
    invoke-static {v3}, Lql;->Ι(Ljava/lang/String;)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    invoke-static {v3}, Lql;->Δ(Ljava/lang/String;)Z

    .line 316
    .line 317
    .line 318
    move-result v4

    .line 319
    if-eqz v4, :cond_f

    .line 320
    .line 321
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 322
    .line 323
    invoke-static {v4, v3, v4}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    invoke-static {v3}, Lql;->Ν(Ljava/lang/String;)I

    .line 328
    .line 329
    .line 330
    move-result v5

    .line 331
    add-int/2addr v5, v1

    .line 332
    invoke-static {p3}, Lql;->Γ(Landroid/view/View;)Z

    .line 333
    .line 334
    .line 335
    move-result v6

    .line 336
    if-eqz v6, :cond_10

    .line 337
    .line 338
    add-int/lit16 v5, v5, 0xfa

    .line 339
    .line 340
    :cond_10
    invoke-virtual {p3}, Landroid/view/View;->getVisibility()I

    .line 341
    .line 342
    .line 343
    move-result v6

    .line 344
    if-nez v6, :cond_11

    .line 345
    .line 346
    add-int/lit8 v5, v5, 0x50

    .line 347
    .line 348
    :cond_11
    const-string v6, "avatar"

    .line 349
    .line 350
    invoke-static {v4, v6, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 351
    .line 352
    .line 353
    move-result v6

    .line 354
    if-nez v6, :cond_12

    .line 355
    .line 356
    const-string v6, "profile"

    .line 357
    .line 358
    invoke-static {v4, v6, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 359
    .line 360
    .line 361
    move-result v6

    .line 362
    if-nez v6, :cond_12

    .line 363
    .line 364
    const-string v6, "user_avatar"

    .line 365
    .line 366
    invoke-static {v4, v6, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 367
    .line 368
    .line 369
    move-result v6

    .line 370
    if-eqz v6, :cond_13

    .line 371
    .line 372
    :cond_12
    add-int/lit16 v5, v5, -0x5dc

    .line 373
    .line 374
    :cond_13
    const-string v6, "thumb"

    .line 375
    .line 376
    invoke-static {v4, v6, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 377
    .line 378
    .line 379
    move-result v6

    .line 380
    if-nez v6, :cond_14

    .line 381
    .line 382
    const-string v6, "cover"

    .line 383
    .line 384
    invoke-static {v4, v6, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 385
    .line 386
    .line 387
    move-result v4

    .line 388
    if-eqz v4, :cond_15

    .line 389
    .line 390
    :cond_14
    add-int/lit16 v5, v5, -0x320

    .line 391
    .line 392
    :cond_15
    iget v4, p1, Lsm1;->ε:I

    .line 393
    .line 394
    if-le v5, v4, :cond_f

    .line 395
    .line 396
    iput v5, p1, Lsm1;->ε:I

    .line 397
    .line 398
    iput-object v3, p2, Lum1;->ε:Ljava/lang/Object;

    .line 399
    .line 400
    goto :goto_6

    .line 401
    :cond_16
    instance-of v0, p3, Landroid/view/ViewGroup;

    .line 402
    .line 403
    if-eqz v0, :cond_17

    .line 404
    .line 405
    check-cast p3, Landroid/view/ViewGroup;

    .line 406
    .line 407
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getChildCount()I

    .line 408
    .line 409
    .line 410
    move-result v0

    .line 411
    :goto_7
    if-ge v2, v0, :cond_17

    .line 412
    .line 413
    invoke-virtual {p3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 418
    .line 419
    .line 420
    add-int/lit8 v3, p4, 0x1

    .line 421
    .line 422
    invoke-static {p0, p1, p2, v1, v3}, Lql;->θ(Ljava/util/Set;Lsm1;Lum1;Landroid/view/View;I)V

    .line 423
    .line 424
    .line 425
    add-int/lit8 v2, v2, 0x1

    .line 426
    .line 427
    goto :goto_7

    .line 428
    :cond_17
    :goto_8
    return-void
.end method

.method public static ι(Landroid/view/View;I)Ljava/util/List;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/IdentityHashMap;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-static {p1, v1, v0, p0, v2}, Lql;->κ(ILjava/util/Set;Ljava/util/LinkedHashSet;Landroid/view/View;I)V

    .line 17
    .line 18
    .line 19
    new-instance p0, Ljava/util/ArrayList;

    .line 20
    .line 21
    const/16 p1, 0xa

    .line 22
    .line 23
    invoke-static {v0, p1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v0}, Lql;->Ι(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    move-object v1, v0

    .line 74
    check-cast v1, Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {v1}, Lql;->Δ(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_1

    .line 81
    .line 82
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    invoke-static {p1}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {p0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0
.end method

.method public static final κ(ILjava/util/Set;Ljava/util/LinkedHashSet;Landroid/view/View;I)V
    .locals 4

    .line 1
    if-le p4, p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-interface {p1, p3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_1
    invoke-static {p3}, Lql;->σ(Landroid/view/View;)Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p2, v0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 16
    .line 17
    .line 18
    instance-of v0, p3, Landroid/view/ViewGroup;

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    check-cast p3, Landroid/view/ViewGroup;

    .line 23
    .line 24
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getChildCount()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v1, 0x0

    .line 29
    :goto_0
    if-ge v1, v0, :cond_2

    .line 30
    .line 31
    invoke-virtual {p3, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    add-int/lit8 v3, p4, 0x1

    .line 39
    .line 40
    invoke-static {p0, p1, p2, v2, v3}, Lql;->κ(ILjava/util/Set;Ljava/util/LinkedHashSet;Landroid/view/View;I)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    :goto_1
    return-void
.end method

.method public static final λ(ILjava/lang/Object;Ljava/util/LinkedHashSet;Ljava/util/Set;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_8

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    if-gt p0, v0, :cond_8

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v1, 0x1e

    .line 11
    .line 12
    if-le v0, v1, :cond_0

    .line 13
    .line 14
    goto/16 :goto_4

    .line 15
    .line 16
    :cond_0
    instance-of v0, p1, Ljava/lang/String;

    .line 17
    .line 18
    if-nez v0, :cond_7

    .line 19
    .line 20
    instance-of v0, p1, Landroid/net/Uri;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto/16 :goto_3

    .line 25
    .line 26
    :cond_1
    instance-of v0, p1, Ljava/lang/Number;

    .line 27
    .line 28
    if-nez v0, :cond_6

    .line 29
    .line 30
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 31
    .line 32
    if-nez v0, :cond_6

    .line 33
    .line 34
    instance-of v0, p1, Landroid/view/View;

    .line 35
    .line 36
    if-nez v0, :cond_6

    .line 37
    .line 38
    instance-of v0, p1, Landroid/content/Context;

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    invoke-interface {p3, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_3

    .line 48
    .line 49
    goto/16 :goto_4

    .line 50
    .line 51
    :cond_3
    invoke-static {p1}, Lql;->ξ(Ljava/lang/Object;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {p2, v0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 56
    .line 57
    .line 58
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-static {v0}, Lg7;->н([Ljava/lang/Object;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    goto :goto_0

    .line 74
    :catchall_0
    move-exception v0

    .line 75
    new-instance v1, Leo1;

    .line 76
    .line 77
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    move-object v0, v1

    .line 81
    :goto_0
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    if-nez v1, :cond_4

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    sget-object v0, Ljz;->ε:Ljz;

    .line 89
    .line 90
    :goto_1
    check-cast v0, Ljava/util/List;

    .line 91
    .line 92
    new-instance v1, Lf7;

    .line 93
    .line 94
    const/4 v2, 0x1

    .line 95
    invoke-direct {v1, v2, v0}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    new-instance v0, Lwj;

    .line 99
    .line 100
    const/16 v2, 0x1b

    .line 101
    .line 102
    invoke-direct {v0, v2}, Lwj;-><init>(I)V

    .line 103
    .line 104
    .line 105
    new-instance v2, Ly30;

    .line 106
    .line 107
    const/4 v3, 0x1

    .line 108
    invoke-direct {v2, v1, v3, v0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 109
    .line 110
    .line 111
    const/16 v0, 0x28

    .line 112
    .line 113
    invoke-static {v2, v0}, Lus1;->Ε(Lss1;I)Lss1;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-interface {v0}, Lss1;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    :catchall_1
    :cond_5
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-eqz v1, :cond_8

    .line 126
    .line 127
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    check-cast v1, Ljava/lang/reflect/Method;

    .line 132
    .line 133
    :try_start_1
    invoke-virtual {v1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 134
    .line 135
    .line 136
    const/4 v2, 0x0

    .line 137
    invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-static {v1}, Lql;->ξ(Ljava/lang/Object;)Ljava/util/List;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-virtual {p2, v2}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 146
    .line 147
    .line 148
    invoke-static {v1}, Lql;->Ξ(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-eqz v2, :cond_5

    .line 153
    .line 154
    add-int/lit8 v2, p0, 0x1

    .line 155
    .line 156
    invoke-static {v2, v1, p2, p3}, Lql;->λ(ILjava/lang/Object;Ljava/util/LinkedHashSet;Ljava/util/Set;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_6
    return-void

    .line 161
    :cond_7
    :goto_3
    invoke-static {p1}, Lql;->ξ(Ljava/lang/Object;)Ljava/util/List;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-virtual {p2, p0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 166
    .line 167
    .line 168
    :cond_8
    :goto_4
    return-void
.end method

.method public static μ(Ljava/lang/String;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {p0}, Lql;->Ι(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/16 v1, 0x3f

    .line 16
    .line 17
    invoke-static {v0, v1, v0}, Lq02;->ш(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/16 v1, 0x30

    .line 22
    .line 23
    invoke-static {v0, v1}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    :goto_0
    if-nez v0, :cond_1

    .line 30
    .line 31
    const-string v0, ""

    .line 32
    .line 33
    :cond_1
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {p0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    new-instance v2, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v1, "://"

    .line 50
    .line 51
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string p0, "/\u2026/"

    .line 58
    .line 59
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    goto :goto_1

    .line 70
    :catchall_0
    move-exception p0

    .line 71
    new-instance v0, Leo1;

    .line 72
    .line 73
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    move-object p0, v0

    .line 77
    :goto_1
    instance-of v0, p0, Leo1;

    .line 78
    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    const-string p0, "<invalid-emoji-url>"

    .line 82
    .line 83
    :cond_2
    check-cast p0, Ljava/lang/String;

    .line 84
    .line 85
    return-void
.end method

.method public static ν(Landroid/content/Context;F)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {v0, p1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    float-to-int p0, p0

    .line 15
    return p0
.end method

.method public static ξ(Ljava/lang/Object;)Ljava/util/List;
    .locals 5

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Ljz;->ε:Ljz;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    instance-of v1, p0, Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    goto/16 :goto_4

    .line 19
    .line 20
    :cond_1
    instance-of v1, p0, Landroid/net/Uri;

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    check-cast p0, Landroid/net/Uri;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {v0, p0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    goto/16 :goto_4

    .line 34
    .line 35
    :cond_2
    instance-of v1, p0, [Ljava/lang/Object;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    check-cast p0, [Ljava/lang/Object;

    .line 41
    .line 42
    array-length v1, p0

    .line 43
    :goto_0
    if-ge v2, v1, :cond_8

    .line 44
    .line 45
    aget-object v3, p0, v2

    .line 46
    .line 47
    invoke-static {v3}, Lql;->ξ(Ljava/lang/Object;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 52
    .line 53
    .line 54
    add-int/lit8 v2, v2, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    instance-of v1, p0, Ljava/lang/Iterable;

    .line 58
    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    check-cast p0, Ljava/lang/Iterable;

    .line 62
    .line 63
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_8

    .line 72
    .line 73
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-static {v1}, Lql;->ξ(Ljava/lang/Object;)Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_4
    const-string v1, "getSourceUri"

    .line 86
    .line 87
    invoke-static {p0, v1}, Lql;->ε(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    instance-of v3, v1, Landroid/net/Uri;

    .line 92
    .line 93
    if-eqz v3, :cond_5

    .line 94
    .line 95
    check-cast v1, Landroid/net/Uri;

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_5
    const/4 v1, 0x0

    .line 99
    :goto_2
    if-eqz v1, :cond_6

    .line 100
    .line 101
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    :cond_6
    invoke-static {p0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 113
    .line 114
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 115
    .line 116
    .line 117
    new-instance v3, Ljava/util/IdentityHashMap;

    .line 118
    .line 119
    invoke-direct {v3}, Ljava/util/IdentityHashMap;-><init>()V

    .line 120
    .line 121
    .line 122
    invoke-static {v3}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    if-eqz v4, :cond_7

    .line 135
    .line 136
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-static {v2, v4, v1, v3}, Ls1;->ζ(ILjava/lang/Object;Ljava/util/LinkedHashSet;Ljava/util/Set;)V

    .line 144
    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_7
    invoke-static {v1}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-virtual {v0, p0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 152
    .line 153
    .line 154
    :cond_8
    :goto_4
    new-instance p0, Ljava/util/ArrayList;

    .line 155
    .line 156
    const/16 v1, 0xa

    .line 157
    .line 158
    invoke-static {v0, v1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 163
    .line 164
    .line 165
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    if-eqz v1, :cond_9

    .line 174
    .line 175
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    check-cast v1, Ljava/lang/String;

    .line 180
    .line 181
    invoke-static {v1}, Lql;->Ι(Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_9
    new-instance v0, Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    :cond_a
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    if-eqz v1, :cond_b

    .line 203
    .line 204
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    move-object v2, v1

    .line 209
    check-cast v2, Ljava/lang/String;

    .line 210
    .line 211
    invoke-static {v2}, Lql;->Δ(Ljava/lang/String;)Z

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    if-eqz v2, :cond_a

    .line 216
    .line 217
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    goto :goto_6

    .line 221
    :cond_b
    return-object v0
.end method

.method public static ο(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {v2}, Lql;->Γ(Landroid/view/View;)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    return-object v2

    .line 22
    :cond_0
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 23
    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    check-cast v2, Landroid/view/ViewGroup;

    .line 27
    .line 28
    invoke-static {v2}, Lql;->ο(Landroid/view/ViewGroup;)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    return-object v2

    .line 35
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    const/4 p0, 0x0

    .line 39
    return-object p0
.end method

.method public static π(Landroid/view/View;)Landroid/view/ViewGroup;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    const-string v2, "RecyclerView"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-static {v0, v2, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_0

    .line 21
    .line 22
    const-string v2, "ListView"

    .line 23
    .line 24
    invoke-static {v0, v2, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_0

    .line 29
    .line 30
    const-string v2, "GridView"

    .line 31
    .line 32
    invoke-static {v0, v2, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    :cond_0
    check-cast p0, Landroid/view/ViewGroup;

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_1
    if-eqz v1, :cond_3

    .line 42
    .line 43
    check-cast p0, Landroid/view/ViewGroup;

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const/4 v1, 0x0

    .line 50
    :goto_0
    if-ge v1, v0, :cond_3

    .line 51
    .line 52
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {v2}, Lql;->π(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    return-object v2

    .line 66
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    const/4 p0, 0x0

    .line 70
    return-object p0
.end method

.method public static ρ(Landroid/view/View;)Landroid/view/View;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "dyhelper_similar_emoji_download"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    check-cast p0, Landroid/view/ViewGroup;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v1, 0x0

    .line 25
    :goto_0
    if-ge v1, v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {v2}, Lql;->ρ(Landroid/view/View;)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    return-object v2

    .line 41
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/4 p0, 0x0

    .line 45
    return-object p0
.end method

.method public static σ(Landroid/view/View;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lql;->η:Ljava/util/Map;

    .line 7
    .line 8
    monitor-enter v1

    .line 9
    :try_start_0
    invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Ljava/util/List;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    goto :goto_2

    .line 23
    :cond_0
    :goto_0
    monitor-exit v1

    .line 24
    sget-object v1, Lql;->ζ:Ljava/util/Map;

    .line 25
    .line 26
    invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Ljava/lang/String;

    .line 31
    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 38
    .line 39
    const/16 v1, 0xa

    .line 40
    .line 41
    invoke-static {v0, v1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v1}, Lql;->Ι(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    return-object p0

    .line 73
    :goto_2
    monitor-exit v1

    .line 74
    throw p0
.end method

.method public static τ(Landroid/view/ViewGroup;)Lol;
    .locals 8

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-object v2, Lql;->μ:Ljava/util/Map;

    .line 6
    .line 7
    monitor-enter v2

    .line 8
    :try_start_0
    invoke-interface {v2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    check-cast v3, Lol;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    .line 14
    monitor-exit v2

    .line 15
    const-wide/32 v4, 0xea60

    .line 16
    .line 17
    .line 18
    if-eqz v3, :cond_2

    .line 19
    .line 20
    iget-wide v6, v3, Lol;->ε:J

    .line 21
    .line 22
    sub-long v6, v0, v6

    .line 23
    .line 24
    cmp-long v6, v6, v4

    .line 25
    .line 26
    if-gtz v6, :cond_0

    .line 27
    .line 28
    return-object v3

    .line 29
    :cond_0
    monitor-enter v2

    .line 30
    :try_start_1
    invoke-interface {v2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    if-ne v6, v3, :cond_1

    .line 35
    .line 36
    invoke-interface {v2, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    :goto_0
    monitor-exit v2

    .line 43
    goto :goto_2

    .line 44
    :goto_1
    monitor-exit v2

    .line 45
    throw p0

    .line 46
    :cond_2
    :goto_2
    sget-object v2, Lql;->ξ:Lol;

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    if-nez v2, :cond_3

    .line 50
    .line 51
    goto :goto_7

    .line 52
    :cond_3
    iget-wide v6, v2, Lol;->ε:J

    .line 53
    .line 54
    sub-long/2addr v0, v6

    .line 55
    cmp-long v0, v0, v4

    .line 56
    .line 57
    if-lez v0, :cond_4

    .line 58
    .line 59
    goto :goto_7

    .line 60
    :cond_4
    iget-object v0, v2, Lol;->α:Ljava/lang/ref/WeakReference;

    .line 61
    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Landroid/view/ViewGroup;

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_5
    move-object v0, v3

    .line 72
    :goto_3
    if-ne v0, p0, :cond_6

    .line 73
    .line 74
    goto :goto_6

    .line 75
    :cond_6
    iget-object v0, v2, Lol;->β:Ljava/lang/ref/WeakReference;

    .line 76
    .line 77
    if-eqz v0, :cond_7

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    check-cast v0, Landroid/view/View;

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_7
    move-object v0, v3

    .line 87
    :goto_4
    if-eqz v0, :cond_a

    .line 88
    .line 89
    :goto_5
    if-eqz v0, :cond_a

    .line 90
    .line 91
    if-ne v0, p0, :cond_8

    .line 92
    .line 93
    :goto_6
    return-object v2

    .line 94
    :cond_8
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    instance-of v1, v0, Landroid/view/View;

    .line 99
    .line 100
    if-eqz v1, :cond_9

    .line 101
    .line 102
    check-cast v0, Landroid/view/View;

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_9
    move-object v0, v3

    .line 106
    goto :goto_5

    .line 107
    :cond_a
    :goto_7
    return-object v3

    .line 108
    :catchall_1
    move-exception p0

    .line 109
    monitor-exit v2

    .line 110
    throw p0
.end method

.method public static υ(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {p0}, Lql;->Ι(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 6
    .line 7
    invoke-static {v0, p0, v0}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, ".gif"

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    const-string v0, "format=gif"

    .line 21
    .line 22
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    const-string v0, ".apng"

    .line 29
    .line 30
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    const-string v0, "format=apng"

    .line 37
    .line 38
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    const-string v0, "awebp"

    .line 45
    .line 46
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    const-string v0, "animated"

    .line 53
    .line 54
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-eqz p0, :cond_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    return v1

    .line 62
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 63
    return p0
.end method


# virtual methods
.method public final φ(Ljava/lang/ClassLoader;)V
    .locals 5

    .line 1
    sget-object v0, Ls62;->α:Ls62;

    .line 2
    .line 3
    sget-object v1, Lqe0;->α:Ljava/lang/Object;

    .line 4
    .line 5
    const-string v1, "~7930256E7ABA5C12FF51912E81E1AE7426E0C157C10C5B9606215821C8BF5A7D5314FC6042B497E6A9"

    .line 6
    .line 7
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {p1, v1}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    :try_start_0
    sget-object v1, Lxq0;->α:Lxq0;

    .line 19
    .line 20
    const-string v2, "setImageURI"

    .line 21
    .line 22
    new-instance v3, Lh;

    .line 23
    .line 24
    const/16 v4, 0x15

    .line 25
    .line 26
    invoke-direct {v3, v4, p0}, Lh;-><init>(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p1, v2, v3}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    sget v1, Lcom/example/dyhelper/MainHook;->β:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    move-object v2, v0

    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception v1

    .line 37
    new-instance v2, Leo1;

    .line 38
    .line 39
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    sget v1, Lcom/example/dyhelper/MainHook;->β:I

    .line 52
    .line 53
    :cond_1
    :try_start_1
    sget-object v1, Lxq0;->α:Lxq0;

    .line 54
    .line 55
    const-string v2, "setImageRequest"

    .line 56
    .line 57
    new-instance v3, Lh;

    .line 58
    .line 59
    const/16 v4, 0x16

    .line 60
    .line 61
    invoke-direct {v3, v4, p0}, Lh;-><init>(ILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, p1, v2, v3}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 65
    .line 66
    .line 67
    sget p0, Lcom/example/dyhelper/MainHook;->β:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :catchall_1
    move-exception p0

    .line 71
    new-instance v0, Leo1;

    .line 72
    .line 73
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    :goto_1
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    if-eqz p0, :cond_2

    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    sget p0, Lcom/example/dyhelper/MainHook;->β:I

    .line 86
    .line 87
    :cond_2
    :goto_2
    return-void
.end method

.method public final χ(Ljava/lang/ClassLoader;)V
    .locals 7

    .line 1
    const-string v0, "~796C0BCB77AEABFA8EC367210A6EB7B3EF72CF5CA83249201C21F5BFD436DBA92B1217F9D98A8D0C6FFBCD5D684A5F4A89EFF07E808BEFB713014B4BD428"

    .line 2
    .line 3
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "~7883762E16C12543E3F8A703D4C0C39A12F0A7D125B06A105A1F1A4BEAE04D56A284CB5FD4779D7E65875D959926B0D224164722C014BFB5F15BDC93D1F592B6B0FDFF9915"

    .line 8
    .line 9
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_4

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {p1, v1}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const-string v2, "setFirstAvailableImageRequests"

    .line 45
    .line 46
    const-string v3, "setImageRequests"

    .line 47
    .line 48
    const-string v4, "setUri"

    .line 49
    .line 50
    const-string v5, "setImageRequest"

    .line 51
    .line 52
    const-string v6, "setLowResImageRequest"

    .line 53
    .line 54
    filled-new-array {v4, v5, v6, v2, v3}, [Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {v2}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_3

    .line 71
    .line 72
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    check-cast v3, Ljava/lang/String;

    .line 77
    .line 78
    :try_start_0
    sget-object v4, Lxq0;->α:Lxq0;

    .line 79
    .line 80
    new-instance v5, Lh;

    .line 81
    .line 82
    invoke-direct {v5, v3}, Lh;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4, v1, v3, v5}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 86
    .line 87
    .line 88
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    goto :goto_2

    .line 90
    :catchall_0
    move-exception v3

    .line 91
    new-instance v4, Leo1;

    .line 92
    .line 93
    invoke-direct {v4, v3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    move-object v3, v4

    .line 97
    :goto_2
    invoke-static {v3}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    if-eqz v3, :cond_2

    .line 102
    .line 103
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    sget v3, Lcom/example/dyhelper/MainHook;->β:I

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    :try_start_1
    sget-object v2, Lxq0;->α:Lxq0;

    .line 110
    .line 111
    const-string v3, "build"

    .line 112
    .line 113
    new-instance v4, Lh;

    .line 114
    .line 115
    const/16 v5, 0x18

    .line 116
    .line 117
    invoke-direct {v4, v5}, Lh;-><init>(I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v1, v3, v4}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 121
    .line 122
    .line 123
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 124
    goto :goto_3

    .line 125
    :catchall_1
    move-exception v1

    .line 126
    new-instance v2, Leo1;

    .line 127
    .line 128
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 129
    .line 130
    .line 131
    move-object v1, v2

    .line 132
    :goto_3
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    if-eqz v1, :cond_0

    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    sget v1, Lcom/example/dyhelper/MainHook;->β:I

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_4
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 145
    .line 146
    const-string v0, "~7918AA8392D04C927673C5C14F855467DE3F5C8865926CBCFEDB9C06AC6EB6D33448CA"

    .line 147
    .line 148
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-static {p1, v0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    if-nez p1, :cond_5

    .line 157
    .line 158
    goto :goto_5

    .line 159
    :cond_5
    :try_start_2
    sget-object v0, Lxq0;->α:Lxq0;

    .line 160
    .line 161
    const-string v1, "setController"

    .line 162
    .line 163
    new-instance v2, Lh;

    .line 164
    .line 165
    const/16 v3, 0x19

    .line 166
    .line 167
    invoke-direct {v2, v3, p0}, Lh;-><init>(ILjava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, p1, v1, v2}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 171
    .line 172
    .line 173
    sget p0, Lcom/example/dyhelper/MainHook;->β:I

    .line 174
    .line 175
    sget-object p0, Ls62;->α:Ls62;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :catchall_2
    move-exception p0

    .line 179
    new-instance p1, Leo1;

    .line 180
    .line 181
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 182
    .line 183
    .line 184
    move-object p0, p1

    .line 185
    :goto_4
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    if-eqz p0, :cond_6

    .line 190
    .line 191
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    sget p0, Lcom/example/dyhelper/MainHook;->β:I

    .line 195
    .line 196
    :cond_6
    :goto_5
    return-void
.end method

.method public final ψ(Lz81;)V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-boolean v0, Lql;->δ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    goto :goto_2

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    :try_start_1
    sput-boolean v0, Lql;->δ:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 10
    .line 11
    :try_start_2
    sget-object v1, Lxq0;->α:Lxq0;

    .line 12
    .line 13
    const-class v2, Landroid/view/View;

    .line 14
    .line 15
    const-string v3, "onAttachedToWindow"

    .line 16
    .line 17
    new-instance v4, Lpl;

    .line 18
    .line 19
    invoke-direct {v4, p0, v0}, Lpl;-><init>(Lql;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2, v3, v4}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    sget v0, Lcom/example/dyhelper/MainHook;->β:I

    .line 26
    .line 27
    sget-object v0, Ls62;->α:Ls62;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    :try_start_3
    new-instance v1, Leo1;

    .line 32
    .line 33
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object v0, v1

    .line 37
    :goto_0
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    sget v0, Lcom/example/dyhelper/MainHook;->β:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :catchall_1
    move-exception p1

    .line 50
    goto :goto_4

    .line 51
    :cond_1
    :goto_1
    monitor-exit p0

    .line 52
    :goto_2
    iget-object p0, p1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 53
    .line 54
    invoke-static {p0}, Lql;->Η(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Ljava/lang/reflect/Method;

    .line 73
    .line 74
    sget-object v1, Lql;->α:Lql;

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-static {v2}, Lql;->Κ(Ljava/lang/Class;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1, v0}, Lql;->ω(Ljava/lang/reflect/Method;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_2
    iget-object p0, p1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 91
    .line 92
    invoke-static {p0}, Lql;->Β(Ljava/lang/ClassLoader;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :goto_4
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 97
    throw p1
.end method

.method public final ω(Ljava/lang/reflect/Method;)Z
    .locals 5

    .line 1
    invoke-static {p1}, Lql;->Θ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lql;->λ:Ljava/util/Set;

    .line 6
    .line 7
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    return v3

    .line 15
    :cond_0
    const/4 v2, 0x1

    .line 16
    :try_start_0
    invoke-virtual {p1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 17
    .line 18
    .line 19
    sget-object v2, Lxq0;->α:Lxq0;

    .line 20
    .line 21
    new-instance v4, Lpl;

    .line 22
    .line 23
    invoke-direct {v4, p0, v3}, Lpl;-><init>(Lql;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, p1, v4}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 27
    .line 28
    .line 29
    sget p0, Lcom/example/dyhelper/MainHook;->β:I

    .line 30
    .line 31
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p0

    .line 35
    new-instance p1, Leo1;

    .line 36
    .line 37
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    move-object p0, p1

    .line 41
    :goto_0
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    invoke-interface {v1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    sget p0, Lcom/example/dyhelper/MainHook;->β:I

    .line 55
    .line 56
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 57
    .line 58
    :goto_1
    check-cast p0, Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    return p0
.end method
