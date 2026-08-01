.class public final Lm52;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lm52;

.field public static final β:Ljava/lang/String;

.field public static final γ:Ljava/lang/String;

.field public static final δ:Ljava/lang/String;

.field public static final ε:Ljava/lang/String;

.field public static final ζ:Ljava/util/Set;

.field public static volatile η:Ljava/util/Set;

.field public static volatile θ:Ljava/util/Set;

.field public static volatile ι:J

.field public static volatile κ:Ljava/lang/String;

.field public static volatile λ:Ljava/lang/Object;

.field public static volatile μ:Ljava/util/Set;

.field public static volatile ν:I

.field public static volatile ξ:Ljava/lang/String;

.field public static volatile ο:Ljava/lang/ref/WeakReference;

.field public static volatile π:Ljava/lang/Object;

.field public static volatile ρ:I

.field public static volatile σ:J

.field public static volatile τ:J

.field public static volatile υ:Ljava/lang/Class;

.field public static volatile φ:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lm52;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lm52;->α:Lm52;

    .line 7
    .line 8
    sget-object v0, Lef0;->α:Lef0;

    .line 9
    .line 10
    const-string v1, "~797C580DA5DD259BE32348A6895C8C359F04FFB9EADB6AFF23BB38ACFA1A4C4DE4BE4639723A5CC5A954D77DF2D0F2F66A8C556D44DCD72183EB"

    .line 11
    .line 12
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Lef0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    sput-object v1, Lm52;->β:Ljava/lang/String;

    .line 21
    .line 22
    const-string v1, "~78F7D767E6AD8E2F174318E7D62B7D5A33BB7E4AE8124A81AEC866E1CBAF632CB68B084656F39F98EA96A2267D23F971626F18950512BFF559DAFF7B146B6B9C790579339F39C94C775DAE87B6A3127DFDF9F44EAEF3989A"

    .line 23
    .line 24
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Lef0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    sput-object v1, Lm52;->γ:Ljava/lang/String;

    .line 33
    .line 34
    const-string v1, "~7897B8FA4A9E8E3BF9B516DDE3F6FDD5574084CBE8B4160970D94E54B26B9E48699BDEB9B4CC59F2C2D33B371762E2FF6FD29CF22E9EF0315ED2074F6D449992"

    .line 35
    .line 36
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, v1}, Lef0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    sput-object v1, Lm52;->δ:Ljava/lang/String;

    .line 45
    .line 46
    const-string v1, "~7958639120ABF85155FECBEFEE807065BD4E6BA9062C97DCAD437F11F3CD5FA3D7AA268A26EA1072EE8CEB3E60897395C66F47"

    .line 47
    .line 48
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0, v1}, Lef0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    sput-object v0, Lm52;->ε:Ljava/lang/String;

    .line 57
    .line 58
    const-string v0, "\u63a8\u8350"

    .line 59
    .line 60
    invoke-static {v0}, Lg81;->φ(Ljava/lang/Object;)Ljava/util/Set;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Ljava/lang/Iterable;

    .line 65
    .line 66
    new-instance v1, Ljava/util/ArrayList;

    .line 67
    .line 68
    const/16 v2, 0xa

    .line 69
    .line 70
    invoke-static {v0, v2}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 75
    .line 76
    .line 77
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_0

    .line 86
    .line 87
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    check-cast v2, Ljava/lang/String;

    .line 92
    .line 93
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 94
    .line 95
    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_0
    invoke-static {v1}, Lxh;->ｊ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    sput-object v0, Lm52;->ζ:Ljava/util/Set;

    .line 111
    .line 112
    sget-object v0, Lnz;->ε:Lnz;

    .line 113
    .line 114
    sput-object v0, Lm52;->η:Ljava/util/Set;

    .line 115
    .line 116
    sput-object v0, Lm52;->θ:Ljava/util/Set;

    .line 117
    .line 118
    const-wide/16 v1, -0x1

    .line 119
    .line 120
    sput-wide v1, Lm52;->ι:J

    .line 121
    .line 122
    const-string v1, ""

    .line 123
    .line 124
    sput-object v1, Lm52;->κ:Ljava/lang/String;

    .line 125
    .line 126
    sget-object v2, Ljz;->ε:Ljz;

    .line 127
    .line 128
    sput-object v2, Lm52;->λ:Ljava/lang/Object;

    .line 129
    .line 130
    sput-object v0, Lm52;->μ:Ljava/util/Set;

    .line 131
    .line 132
    const/4 v0, -0x1

    .line 133
    sput v0, Lm52;->ν:I

    .line 134
    .line 135
    sput-object v1, Lm52;->ξ:Ljava/lang/String;

    .line 136
    .line 137
    sput-object v2, Lm52;->π:Ljava/lang/Object;

    .line 138
    .line 139
    return-void
.end method

.method public static α(Ljava/util/List;)V
    .locals 20

    .line 1
    new-instance v1, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface/range {p0 .. p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    instance-of v3, v2, Landroid/view/View;

    .line 21
    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    goto/16 :goto_1e

    .line 35
    .line 36
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 37
    .line 38
    const/16 v2, 0xa

    .line 39
    .line 40
    invoke-static {v1, v2}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eqz v4, :cond_3

    .line 56
    .line 57
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    check-cast v4, Landroid/view/View;

    .line 62
    .line 63
    new-instance v5, Ljava/lang/ref/WeakReference;

    .line 64
    .line 65
    invoke-direct {v5, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    sput-object v0, Lm52;->π:Ljava/lang/Object;

    .line 73
    .line 74
    invoke-static {}, Lm52;->δ()V

    .line 75
    .line 76
    .line 77
    new-instance v3, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 80
    .line 81
    .line 82
    new-instance v4, Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-static {}, Lm52;->ι()Ljava/util/Set;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    const/4 v7, 0x1

    .line 100
    const/4 v8, 0x0

    .line 101
    const/4 v9, 0x0

    .line 102
    if-eqz v6, :cond_9

    .line 103
    .line 104
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    check-cast v6, Landroid/view/View;

    .line 109
    .line 110
    invoke-static {v6}, Lm52;->η(Landroid/view/View;)Landroid/widget/TextView;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    if-nez v6, :cond_5

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_5
    invoke-virtual {v6}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 118
    .line 119
    .line 120
    move-result-object v10

    .line 121
    if-eqz v10, :cond_6

    .line 122
    .line 123
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v10

    .line 127
    if-eqz v10, :cond_6

    .line 128
    .line 129
    invoke-static {v10}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    :cond_6
    if-nez v8, :cond_7

    .line 138
    .line 139
    const-string v8, ""

    .line 140
    .line 141
    :cond_7
    move-object v11, v8

    .line 142
    invoke-static {v11}, Lm52;->π(Ljava/lang/String;)Z

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    if-eqz v8, :cond_4

    .line 147
    .line 148
    const/4 v8, 0x2

    .line 149
    new-array v8, v8, [I

    .line 150
    .line 151
    invoke-virtual {v6, v8}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 152
    .line 153
    .line 154
    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 155
    .line 156
    invoke-virtual {v11, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v10

    .line 160
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    new-instance v12, Lj52;

    .line 164
    .line 165
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    move-result-object v13

    .line 169
    invoke-virtual {v13}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v13

    .line 173
    move-object v14, v12

    .line 174
    move-object v12, v13

    .line 175
    aget v13, v8, v9

    .line 176
    .line 177
    aget v8, v8, v7

    .line 178
    .line 179
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    .line 180
    .line 181
    .line 182
    move-result v15

    .line 183
    invoke-virtual {v6}, Landroid/view/View;->getHeight()I

    .line 184
    .line 185
    .line 186
    move-result v16

    .line 187
    move/from16 p0, v7

    .line 188
    .line 189
    sget-object v7, Lm52;->θ:Ljava/util/Set;

    .line 190
    .line 191
    invoke-interface {v7, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v17

    .line 195
    sget-object v7, Lm52;->ζ:Ljava/util/Set;

    .line 196
    .line 197
    invoke-interface {v7, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v18

    .line 201
    invoke-interface {v7, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v7

    .line 205
    if-nez v7, :cond_8

    .line 206
    .line 207
    invoke-interface {v5, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v7

    .line 211
    if-eqz v7, :cond_8

    .line 212
    .line 213
    move/from16 v19, p0

    .line 214
    .line 215
    :goto_3
    move-object v10, v14

    .line 216
    move v14, v8

    .line 217
    goto :goto_4

    .line 218
    :cond_8
    move/from16 v19, v9

    .line 219
    .line 220
    goto :goto_3

    .line 221
    :goto_4
    invoke-direct/range {v10 .. v19}, Lj52;-><init>(Ljava/lang/String;Ljava/lang/String;IIIIZZZ)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    goto/16 :goto_2

    .line 231
    .line 232
    :cond_9
    move/from16 p0, v7

    .line 233
    .line 234
    invoke-static {}, Lui1;->Α()Z

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    const-string v6, "r14983b95b84acb5"

    .line 239
    .line 240
    if-nez v0, :cond_a

    .line 241
    .line 242
    goto/16 :goto_9

    .line 243
    .line 244
    :cond_a
    sget-object v0, Lm52;->η:Ljava/util/Set;

    .line 245
    .line 246
    check-cast v0, Ljava/lang/Iterable;

    .line 247
    .line 248
    invoke-static {v0}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 253
    .line 254
    .line 255
    move-result-object v7

    .line 256
    move v10, v9

    .line 257
    :cond_b
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 258
    .line 259
    .line 260
    move-result v11

    .line 261
    if-eqz v11, :cond_f

    .line 262
    .line 263
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v11

    .line 267
    check-cast v11, Lj52;

    .line 268
    .line 269
    iget-object v12, v11, Lj52;->α:Ljava/lang/String;

    .line 270
    .line 271
    sget-object v13, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 272
    .line 273
    invoke-virtual {v12, v13}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v12

    .line 277
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    sget-object v13, Lm52;->ζ:Ljava/util/Set;

    .line 281
    .line 282
    invoke-interface {v13, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v13

    .line 286
    if-nez v13, :cond_b

    .line 287
    .line 288
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 289
    .line 290
    .line 291
    move-result v13

    .line 292
    if-eqz v13, :cond_c

    .line 293
    .line 294
    goto :goto_6

    .line 295
    :cond_c
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 296
    .line 297
    .line 298
    move-result-object v13

    .line 299
    :cond_d
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 300
    .line 301
    .line 302
    move-result v14

    .line 303
    if-eqz v14, :cond_e

    .line 304
    .line 305
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v14

    .line 309
    check-cast v14, Ljava/lang/String;

    .line 310
    .line 311
    sget-object v15, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 312
    .line 313
    invoke-virtual {v14, v15}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v14

    .line 317
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v14, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v14

    .line 324
    if-eqz v14, :cond_d

    .line 325
    .line 326
    goto :goto_5

    .line 327
    :cond_e
    :goto_6
    iget-object v10, v11, Lj52;->α:Ljava/lang/String;

    .line 328
    .line 329
    invoke-interface {v0, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    iget-object v10, v11, Lj52;->α:Ljava/lang/String;

    .line 333
    .line 334
    const-string v11, "\u53d1\u73b0\u65b0Tab: "

    .line 335
    .line 336
    invoke-virtual {v11, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v10

    .line 340
    invoke-static {v6, v10}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    move/from16 v10, p0

    .line 344
    .line 345
    goto :goto_5

    .line 346
    :cond_f
    if-eqz v10, :cond_11

    .line 347
    .line 348
    :try_start_0
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 349
    .line 350
    .line 351
    move-result-object v7

    .line 352
    invoke-static {v7}, Lxh;->Ю(Ljava/lang/Iterable;)Ljava/util/List;

    .line 353
    .line 354
    .line 355
    move-result-object v7

    .line 356
    new-instance v10, Lorg/json/JSONArray;

    .line 357
    .line 358
    invoke-direct {v10, v7}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 359
    .line 360
    .line 361
    sget-object v11, Lui1;->α:Ljava/lang/Object;

    .line 362
    .line 363
    const-string v11, "toptab_discovered_tabs"

    .line 364
    .line 365
    invoke-virtual {v10}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v10

    .line 369
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    invoke-static {v11, v10}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    sput-object v0, Lm52;->η:Ljava/util/Set;

    .line 376
    .line 377
    new-instance v10, Ljava/util/ArrayList;

    .line 378
    .line 379
    invoke-static {v0, v2}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 380
    .line 381
    .line 382
    move-result v2

    .line 383
    invoke-direct {v10, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 384
    .line 385
    .line 386
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 391
    .line 392
    .line 393
    move-result v11

    .line 394
    if-eqz v11, :cond_10

    .line 395
    .line 396
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v11

    .line 400
    check-cast v11, Ljava/lang/String;

    .line 401
    .line 402
    sget-object v12, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 403
    .line 404
    invoke-virtual {v11, v12}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v11

    .line 408
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    goto :goto_7

    .line 415
    :catchall_0
    move-exception v0

    .line 416
    goto :goto_8

    .line 417
    :cond_10
    invoke-static {v10}, Lxh;->ｊ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    sput-object v2, Lm52;->θ:Ljava/util/Set;

    .line 422
    .line 423
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 424
    .line 425
    .line 426
    move-result v0

    .line 427
    new-instance v2, Ljava/lang/StringBuilder;

    .line 428
    .line 429
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 430
    .line 431
    .line 432
    const-string v10, "\u4fdd\u5b58\u8d26\u53f7\u9876\u680fTab("

    .line 433
    .line 434
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 435
    .line 436
    .line 437
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 438
    .line 439
    .line 440
    const-string v0, "\u4e2a): "

    .line 441
    .line 442
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    invoke-static {v6, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 453
    .line 454
    .line 455
    goto :goto_9

    .line 456
    :goto_8
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v2

    .line 460
    const-string v7, "\u4fdd\u5b58\u5df2\u53d1\u73b0Tab\u5931\u8d25: "

    .line 461
    .line 462
    invoke-static {v7, v2, v6, v0}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 463
    .line 464
    .line 465
    :cond_11
    :goto_9
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 466
    .line 467
    .line 468
    move-result v0

    .line 469
    if-eqz v0, :cond_12

    .line 470
    .line 471
    goto :goto_a

    .line 472
    :cond_12
    new-instance v0, Lqy1;

    .line 473
    .line 474
    const/4 v2, 0x6

    .line 475
    invoke-direct {v0, v2}, Lqy1;-><init>(I)V

    .line 476
    .line 477
    .line 478
    invoke-static {v3, v0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 479
    .line 480
    .line 481
    move-result-object v10

    .line 482
    new-instance v15, Lby1;

    .line 483
    .line 484
    const/16 v0, 0xf

    .line 485
    .line 486
    invoke-direct {v15, v0}, Lby1;-><init>(I)V

    .line 487
    .line 488
    .line 489
    const/16 v16, 0x1e

    .line 490
    .line 491
    const-string v11, " | "

    .line 492
    .line 493
    const/4 v12, 0x0

    .line 494
    const/4 v13, 0x0

    .line 495
    const/4 v14, 0x0

    .line 496
    invoke-static/range {v10 .. v16}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    sget-object v2, Lm52;->κ:Ljava/lang/String;

    .line 501
    .line 502
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 503
    .line 504
    .line 505
    move-result v2

    .line 506
    if-eqz v2, :cond_13

    .line 507
    .line 508
    goto :goto_a

    .line 509
    :cond_13
    const-string v2, "\u9876\u680f Tab \u68c0\u6d4b: "

    .line 510
    .line 511
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    invoke-static {v6, v2}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 516
    .line 517
    .line 518
    sput-object v0, Lm52;->κ:Ljava/lang/String;

    .line 519
    .line 520
    :goto_a
    new-instance v10, Ljava/util/ArrayList;

    .line 521
    .line 522
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 523
    .line 524
    .line 525
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 526
    .line 527
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 531
    .line 532
    .line 533
    move-result-object v2

    .line 534
    :cond_14
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 535
    .line 536
    .line 537
    move-result v3

    .line 538
    if-eqz v3, :cond_1a

    .line 539
    .line 540
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v3

    .line 544
    instance-of v7, v3, Landroid/view/View;

    .line 545
    .line 546
    if-eqz v7, :cond_15

    .line 547
    .line 548
    check-cast v3, Landroid/view/View;

    .line 549
    .line 550
    goto :goto_c

    .line 551
    :cond_15
    move-object v3, v8

    .line 552
    :goto_c
    if-nez v3, :cond_16

    .line 553
    .line 554
    goto :goto_b

    .line 555
    :cond_16
    invoke-static {v3}, Lm52;->η(Landroid/view/View;)Landroid/widget/TextView;

    .line 556
    .line 557
    .line 558
    move-result-object v3

    .line 559
    if-eqz v3, :cond_17

    .line 560
    .line 561
    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 562
    .line 563
    .line 564
    move-result-object v3

    .line 565
    if-eqz v3, :cond_17

    .line 566
    .line 567
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v3

    .line 571
    if-eqz v3, :cond_17

    .line 572
    .line 573
    invoke-static {v3}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 574
    .line 575
    .line 576
    move-result-object v3

    .line 577
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v3

    .line 581
    goto :goto_d

    .line 582
    :cond_17
    move-object v3, v8

    .line 583
    :goto_d
    if-eqz v3, :cond_14

    .line 584
    .line 585
    invoke-static {v3}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 586
    .line 587
    .line 588
    move-result-object v3

    .line 589
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 590
    .line 591
    .line 592
    move-result-object v3

    .line 593
    if-nez v3, :cond_18

    .line 594
    .line 595
    goto :goto_b

    .line 596
    :cond_18
    invoke-static {v3}, Lm52;->π(Ljava/lang/String;)Z

    .line 597
    .line 598
    .line 599
    move-result v7

    .line 600
    if-eqz v7, :cond_14

    .line 601
    .line 602
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 603
    .line 604
    invoke-virtual {v3, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object v3

    .line 608
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 609
    .line 610
    .line 611
    sget-object v7, Lm52;->ζ:Ljava/util/Set;

    .line 612
    .line 613
    invoke-interface {v7, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 614
    .line 615
    .line 616
    move-result v7

    .line 617
    if-nez v7, :cond_19

    .line 618
    .line 619
    sget-object v7, Lm52;->θ:Ljava/util/Set;

    .line 620
    .line 621
    invoke-interface {v7, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 622
    .line 623
    .line 624
    move-result v7

    .line 625
    if-eqz v7, :cond_14

    .line 626
    .line 627
    :cond_19
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 628
    .line 629
    .line 630
    move-result v7

    .line 631
    if-eqz v7, :cond_14

    .line 632
    .line 633
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 634
    .line 635
    .line 636
    goto :goto_b

    .line 637
    :cond_1a
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 638
    .line 639
    .line 640
    move-result v0

    .line 641
    if-eqz v0, :cond_1b

    .line 642
    .line 643
    goto :goto_e

    .line 644
    :cond_1b
    sget-object v0, Lm52;->λ:Ljava/lang/Object;

    .line 645
    .line 646
    invoke-virtual {v10, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 647
    .line 648
    .line 649
    move-result v0

    .line 650
    if-nez v0, :cond_1c

    .line 651
    .line 652
    sput-object v10, Lm52;->λ:Ljava/lang/Object;

    .line 653
    .line 654
    const/4 v15, 0x0

    .line 655
    const/16 v16, 0x3e

    .line 656
    .line 657
    const-string v11, ", "

    .line 658
    .line 659
    const/4 v12, 0x0

    .line 660
    const/4 v13, 0x0

    .line 661
    const/4 v14, 0x0

    .line 662
    invoke-static/range {v10 .. v16}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    const-string v2, "\u9876\u680f\u5bbf\u4e3b\u9875\u5e8f: "

    .line 667
    .line 668
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    invoke-static {v6, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 673
    .line 674
    .line 675
    :cond_1c
    invoke-static {}, Lm52;->σ()V

    .line 676
    .line 677
    .line 678
    :goto_e
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    :cond_1d
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 683
    .line 684
    .line 685
    move-result v1

    .line 686
    if-eqz v1, :cond_29

    .line 687
    .line 688
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 689
    .line 690
    .line 691
    move-result-object v1

    .line 692
    check-cast v1, Landroid/view/View;

    .line 693
    .line 694
    invoke-static {v1}, Lm52;->η(Landroid/view/View;)Landroid/widget/TextView;

    .line 695
    .line 696
    .line 697
    move-result-object v2

    .line 698
    if-eqz v2, :cond_1e

    .line 699
    .line 700
    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 701
    .line 702
    .line 703
    move-result-object v2

    .line 704
    if-eqz v2, :cond_1e

    .line 705
    .line 706
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v2

    .line 710
    if-eqz v2, :cond_1e

    .line 711
    .line 712
    invoke-static {v2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 713
    .line 714
    .line 715
    move-result-object v2

    .line 716
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 717
    .line 718
    .line 719
    move-result-object v2

    .line 720
    goto :goto_10

    .line 721
    :cond_1e
    move-object v2, v8

    .line 722
    :goto_10
    if-eqz v2, :cond_1d

    .line 723
    .line 724
    invoke-static {v2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 725
    .line 726
    .line 727
    move-result-object v2

    .line 728
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 729
    .line 730
    .line 731
    move-result-object v2

    .line 732
    if-eqz v2, :cond_1d

    .line 733
    .line 734
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 735
    .line 736
    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object v2

    .line 740
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 741
    .line 742
    .line 743
    sget-object v3, Lm52;->ζ:Ljava/util/Set;

    .line 744
    .line 745
    invoke-interface {v3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 746
    .line 747
    .line 748
    move-result v3

    .line 749
    const v6, 0x7f0dca02

    .line 750
    .line 751
    .line 752
    const v7, 0x7f0dca01

    .line 753
    .line 754
    .line 755
    if-nez v3, :cond_23

    .line 756
    .line 757
    invoke-interface {v5, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 758
    .line 759
    .line 760
    move-result v2

    .line 761
    if-eqz v2, :cond_23

    .line 762
    .line 763
    invoke-static {v1}, Lm52;->ζ(Landroid/view/View;)Landroid/view/View;

    .line 764
    .line 765
    .line 766
    move-result-object v2

    .line 767
    if-nez v2, :cond_1f

    .line 768
    .line 769
    goto :goto_11

    .line 770
    :cond_1f
    move-object v1, v2

    .line 771
    :goto_11
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 772
    .line 773
    .line 774
    move-result v2

    .line 775
    const/16 v3, 0x8

    .line 776
    .line 777
    if-ne v2, v3, :cond_20

    .line 778
    .line 779
    goto :goto_f

    .line 780
    :cond_20
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 781
    .line 782
    invoke-virtual {v1, v7, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 783
    .line 784
    .line 785
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 786
    .line 787
    .line 788
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 789
    .line 790
    .line 791
    move-result-object v2

    .line 792
    if-nez v2, :cond_21

    .line 793
    .line 794
    goto :goto_f

    .line 795
    :cond_21
    invoke-virtual {v1, v6}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 796
    .line 797
    .line 798
    move-result-object v3

    .line 799
    if-nez v3, :cond_22

    .line 800
    .line 801
    iget v3, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 802
    .line 803
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 804
    .line 805
    .line 806
    move-result-object v3

    .line 807
    invoke-virtual {v1, v6, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 808
    .line 809
    .line 810
    :cond_22
    iput v9, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 811
    .line 812
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 813
    .line 814
    .line 815
    goto/16 :goto_f

    .line 816
    .line 817
    :cond_23
    invoke-static {v1}, Lm52;->ζ(Landroid/view/View;)Landroid/view/View;

    .line 818
    .line 819
    .line 820
    move-result-object v2

    .line 821
    if-nez v2, :cond_24

    .line 822
    .line 823
    goto :goto_12

    .line 824
    :cond_24
    move-object v1, v2

    .line 825
    :goto_12
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 826
    .line 827
    .line 828
    move-result v2

    .line 829
    if-nez v2, :cond_25

    .line 830
    .line 831
    invoke-virtual {v1, v7}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 832
    .line 833
    .line 834
    move-result-object v2

    .line 835
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 836
    .line 837
    invoke-static {v2, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 838
    .line 839
    .line 840
    move-result v2

    .line 841
    if-nez v2, :cond_25

    .line 842
    .line 843
    goto/16 :goto_f

    .line 844
    .line 845
    :cond_25
    invoke-virtual {v1, v7, v8}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 846
    .line 847
    .line 848
    invoke-virtual {v1, v9}, Landroid/view/View;->setVisibility(I)V

    .line 849
    .line 850
    .line 851
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 852
    .line 853
    .line 854
    move-result-object v2

    .line 855
    if-nez v2, :cond_26

    .line 856
    .line 857
    goto/16 :goto_f

    .line 858
    .line 859
    :cond_26
    invoke-virtual {v1, v6}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 860
    .line 861
    .line 862
    move-result-object v3

    .line 863
    instance-of v7, v3, Ljava/lang/Integer;

    .line 864
    .line 865
    if-eqz v7, :cond_27

    .line 866
    .line 867
    check-cast v3, Ljava/lang/Integer;

    .line 868
    .line 869
    goto :goto_13

    .line 870
    :cond_27
    move-object v3, v8

    .line 871
    :goto_13
    invoke-virtual {v1, v6, v8}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 872
    .line 873
    .line 874
    if-eqz v3, :cond_28

    .line 875
    .line 876
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 877
    .line 878
    .line 879
    move-result v3

    .line 880
    goto :goto_14

    .line 881
    :cond_28
    const/4 v3, -0x2

    .line 882
    :goto_14
    iput v3, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 883
    .line 884
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 885
    .line 886
    .line 887
    goto/16 :goto_f

    .line 888
    .line 889
    :cond_29
    invoke-static {}, Lui1;->Α()Z

    .line 890
    .line 891
    .line 892
    move-result v0

    .line 893
    if-nez v0, :cond_2a

    .line 894
    .line 895
    goto/16 :goto_1e

    .line 896
    .line 897
    :cond_2a
    const-string v0, "toptab_center_align"

    .line 898
    .line 899
    invoke-static {v0, v9}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 900
    .line 901
    .line 902
    move-result v0

    .line 903
    if-nez v0, :cond_2b

    .line 904
    .line 905
    goto/16 :goto_1e

    .line 906
    .line 907
    :cond_2b
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 908
    .line 909
    .line 910
    move-result v0

    .line 911
    if-eqz v0, :cond_2c

    .line 912
    .line 913
    goto/16 :goto_1e

    .line 914
    .line 915
    :cond_2c
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 916
    .line 917
    .line 918
    move-result v0

    .line 919
    if-eqz v0, :cond_2d

    .line 920
    .line 921
    :goto_15
    move-object v0, v8

    .line 922
    goto/16 :goto_1a

    .line 923
    .line 924
    :cond_2d
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 925
    .line 926
    .line 927
    move-result-object v0

    .line 928
    check-cast v0, Landroid/view/View;

    .line 929
    .line 930
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 931
    .line 932
    .line 933
    move-result v1

    .line 934
    move/from16 v2, p0

    .line 935
    .line 936
    :goto_16
    if-ge v2, v1, :cond_34

    .line 937
    .line 938
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 939
    .line 940
    .line 941
    move-result-object v3

    .line 942
    check-cast v3, Landroid/view/View;

    .line 943
    .line 944
    new-instance v5, Ljava/util/ArrayList;

    .line 945
    .line 946
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 947
    .line 948
    .line 949
    :goto_17
    if-eqz v0, :cond_2f

    .line 950
    .line 951
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 952
    .line 953
    .line 954
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 955
    .line 956
    .line 957
    move-result-object v0

    .line 958
    instance-of v6, v0, Landroid/view/View;

    .line 959
    .line 960
    if-eqz v6, :cond_2e

    .line 961
    .line 962
    check-cast v0, Landroid/view/View;

    .line 963
    .line 964
    goto :goto_17

    .line 965
    :cond_2e
    move-object v0, v8

    .line 966
    goto :goto_17

    .line 967
    :cond_2f
    new-instance v0, Ljava/util/ArrayList;

    .line 968
    .line 969
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 970
    .line 971
    .line 972
    :goto_18
    if-eqz v3, :cond_31

    .line 973
    .line 974
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 975
    .line 976
    .line 977
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 978
    .line 979
    .line 980
    move-result-object v3

    .line 981
    instance-of v6, v3, Landroid/view/View;

    .line 982
    .line 983
    if-eqz v6, :cond_30

    .line 984
    .line 985
    check-cast v3, Landroid/view/View;

    .line 986
    .line 987
    goto :goto_18

    .line 988
    :cond_30
    move-object v3, v8

    .line 989
    goto :goto_18

    .line 990
    :cond_31
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 991
    .line 992
    .line 993
    move-result v3

    .line 994
    add-int/lit8 v3, v3, -0x1

    .line 995
    .line 996
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 997
    .line 998
    .line 999
    move-result v6

    .line 1000
    add-int/lit8 v6, v6, -0x1

    .line 1001
    .line 1002
    move v7, v6

    .line 1003
    move v6, v3

    .line 1004
    move-object v3, v8

    .line 1005
    :goto_19
    if-ltz v6, :cond_32

    .line 1006
    .line 1007
    if-ltz v7, :cond_32

    .line 1008
    .line 1009
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v10

    .line 1013
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v11

    .line 1017
    invoke-static {v10, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1018
    .line 1019
    .line 1020
    move-result v10

    .line 1021
    if-eqz v10, :cond_32

    .line 1022
    .line 1023
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v3

    .line 1027
    check-cast v3, Landroid/view/View;

    .line 1028
    .line 1029
    add-int/lit8 v6, v6, -0x1

    .line 1030
    .line 1031
    add-int/lit8 v7, v7, -0x1

    .line 1032
    .line 1033
    goto :goto_19

    .line 1034
    :cond_32
    if-nez v3, :cond_33

    .line 1035
    .line 1036
    goto :goto_15

    .line 1037
    :cond_33
    add-int/lit8 v2, v2, 0x1

    .line 1038
    .line 1039
    move-object v0, v3

    .line 1040
    goto :goto_16

    .line 1041
    :cond_34
    :goto_1a
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 1042
    .line 1043
    if-eqz v1, :cond_35

    .line 1044
    .line 1045
    check-cast v0, Landroid/view/ViewGroup;

    .line 1046
    .line 1047
    goto :goto_1b

    .line 1048
    :cond_35
    move-object v0, v8

    .line 1049
    :goto_1b
    if-nez v0, :cond_36

    .line 1050
    .line 1051
    goto :goto_1e

    .line 1052
    :cond_36
    new-instance v1, Lum1;

    .line 1053
    .line 1054
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1055
    .line 1056
    .line 1057
    iput-object v0, v1, Lum1;->ε:Ljava/lang/Object;

    .line 1058
    .line 1059
    :goto_1c
    if-eqz v0, :cond_3a

    .line 1060
    .line 1061
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v2

    .line 1065
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v2

    .line 1069
    sget-object v3, Lm52;->β:Ljava/lang/String;

    .line 1070
    .line 1071
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1072
    .line 1073
    .line 1074
    move-result v2

    .line 1075
    if-nez v2, :cond_3a

    .line 1076
    .line 1077
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v2

    .line 1081
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v2

    .line 1085
    const-string v3, "ScrollView"

    .line 1086
    .line 1087
    move/from16 v4, p0

    .line 1088
    .line 1089
    invoke-static {v2, v3, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1090
    .line 1091
    .line 1092
    move-result v3

    .line 1093
    if-nez v3, :cond_37

    .line 1094
    .line 1095
    const-string v3, "MainTab"

    .line 1096
    .line 1097
    invoke-static {v2, v3, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1098
    .line 1099
    .line 1100
    move-result v2

    .line 1101
    if-eqz v2, :cond_38

    .line 1102
    .line 1103
    :cond_37
    iput-object v0, v1, Lum1;->ε:Ljava/lang/Object;

    .line 1104
    .line 1105
    :cond_38
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v0

    .line 1109
    instance-of v2, v0, Landroid/view/ViewGroup;

    .line 1110
    .line 1111
    if-eqz v2, :cond_39

    .line 1112
    .line 1113
    check-cast v0, Landroid/view/ViewGroup;

    .line 1114
    .line 1115
    goto :goto_1d

    .line 1116
    :cond_39
    move-object v0, v8

    .line 1117
    :goto_1d
    move/from16 p0, v4

    .line 1118
    .line 1119
    goto :goto_1c

    .line 1120
    :cond_3a
    iget-object v0, v1, Lum1;->ε:Ljava/lang/Object;

    .line 1121
    .line 1122
    check-cast v0, Landroid/view/ViewGroup;

    .line 1123
    .line 1124
    new-instance v2, Li52;

    .line 1125
    .line 1126
    invoke-direct {v2, v1, v9}, Li52;-><init>(Lum1;I)V

    .line 1127
    .line 1128
    .line 1129
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 1130
    .line 1131
    .line 1132
    :goto_1e
    return-void
.end method

.method public static β(Landroid/view/View;Ljava/util/LinkedHashSet;)V
    .locals 3

    .line 1
    instance-of v0, p0, Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_2

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p0, :cond_2

    .line 18
    .line 19
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-lez v0, :cond_2

    .line 43
    .line 44
    sget-object v0, Lm52;->θ:Ljava/util/Set;

    .line 45
    .line 46
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    invoke-interface {p1, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 57
    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    check-cast p0, Landroid/view/ViewGroup;

    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    const/4 v1, 0x0

    .line 67
    :goto_0
    if-ge v1, v0, :cond_2

    .line 68
    .line 69
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    if-nez v2, :cond_1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    invoke-static {v2, p1}, Lm52;->β(Landroid/view/View;Ljava/util/LinkedHashSet;)V

    .line 77
    .line 78
    .line 79
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    return-void
.end method

.method public static γ(Landroid/view/View;)Z
    .locals 4

    .line 1
    instance-of v0, p0, Landroid/widget/TextView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p0, Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_3

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-eqz p0, :cond_3

    .line 19
    .line 20
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    if-eqz p0, :cond_3

    .line 29
    .line 30
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    sget-object v0, Lm52;->θ:Ljava/util/Set;

    .line 40
    .line 41
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0

    .line 46
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 47
    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    check-cast p0, Landroid/view/ViewGroup;

    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    move v2, v1

    .line 57
    :goto_0
    if-ge v2, v0, :cond_3

    .line 58
    .line 59
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    if-nez v3, :cond_1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    invoke-static {v3}, Lm52;->γ(Landroid/view/View;)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_2

    .line 71
    .line 72
    const/4 p0, 0x1

    .line 73
    return p0

    .line 74
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    return v1
.end method

.method public static δ()V
    .locals 9

    .line 1
    invoke-static {}, Lui1;->Α()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-wide v0, Lui1;->θ:J

    .line 9
    .line 10
    sget-wide v2, Lm52;->ι:J

    .line 11
    .line 12
    cmp-long v2, v2, v0

    .line 13
    .line 14
    if-nez v2, :cond_1

    .line 15
    .line 16
    :goto_0
    return-void

    .line 17
    :cond_1
    const-string v2, "r14983b95b84acb5"

    .line 18
    .line 19
    :try_start_0
    const-string v3, "toptab_discovered_tabs"

    .line 20
    .line 21
    const-string v4, "[]"

    .line 22
    .line 23
    invoke-static {v3, v4}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    new-instance v4, Lorg/json/JSONArray;

    .line 28
    .line 29
    invoke-direct {v4, v3}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 33
    .line 34
    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    const/4 v6, 0x0

    .line 42
    :goto_1
    if-ge v6, v5, :cond_3

    .line 43
    .line 44
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {v7}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    if-lez v8, :cond_2

    .line 64
    .line 65
    invoke-interface {v3, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :catchall_0
    move-exception v3

    .line 70
    goto :goto_4

    .line 71
    :cond_2
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    sput-object v3, Lm52;->η:Ljava/util/Set;

    .line 75
    .line 76
    new-instance v4, Ljava/util/ArrayList;

    .line 77
    .line 78
    const/16 v5, 0xa

    .line 79
    .line 80
    invoke-static {v3, v5}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 85
    .line 86
    .line 87
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    if-eqz v6, :cond_4

    .line 96
    .line 97
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    check-cast v6, Ljava/lang/String;

    .line 102
    .line 103
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 104
    .line 105
    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_4
    invoke-static {v4}, Lxh;->ｊ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    sput-object v4, Lm52;->θ:Ljava/util/Set;

    .line 121
    .line 122
    invoke-interface {v3}, Ljava/util/Set;->size()I

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    new-instance v5, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 129
    .line 130
    .line 131
    const-string v6, "\u52a0\u8f7d\u8d26\u53f7\u9876\u680fTab("

    .line 132
    .line 133
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    const-string v4, "\u4e2a): "

    .line 140
    .line 141
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    invoke-static {v2, v3}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    .line 153
    .line 154
    goto :goto_5

    .line 155
    :goto_4
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    const-string v5, "\u52a0\u8f7d\u5df2\u53d1\u73b0Tab\u5931\u8d25: "

    .line 160
    .line 161
    invoke-static {v5, v4, v2, v3}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 162
    .line 163
    .line 164
    :goto_5
    sput-wide v0, Lm52;->ι:J

    .line 165
    .line 166
    return-void
.end method

.method public static ε(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 12

    .line 1
    :goto_0
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_6

    .line 3
    .line 4
    const-class v1, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_6

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    array-length v2, v1

    .line 20
    const/4 v3, 0x0

    .line 21
    move v4, v3

    .line 22
    :goto_1
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 23
    .line 24
    sget-object v6, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 25
    .line 26
    const-string v7, "setCurrentItem"

    .line 27
    .line 28
    const/4 v8, 0x1

    .line 29
    if-ge v4, v2, :cond_1

    .line 30
    .line 31
    aget-object v9, v1, v4

    .line 32
    .line 33
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v10

    .line 37
    invoke-static {v10, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v10

    .line 41
    if-eqz v10, :cond_0

    .line 42
    .line 43
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v10

    .line 47
    invoke-static {v10, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v10

    .line 51
    if-eqz v10, :cond_0

    .line 52
    .line 53
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    array-length v10, v10

    .line 58
    const/4 v11, 0x2

    .line 59
    if-ne v10, v11, :cond_0

    .line 60
    .line 61
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    aget-object v10, v10, v3

    .line 66
    .line 67
    invoke-static {v10, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v10

    .line 71
    if-eqz v10, :cond_0

    .line 72
    .line 73
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    aget-object v10, v10, v8

    .line 78
    .line 79
    sget-object v11, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 80
    .line 81
    invoke-static {v10, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    if-eqz v10, :cond_0

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    move-object v9, v0

    .line 92
    :goto_2
    if-eqz v9, :cond_2

    .line 93
    .line 94
    return-object v9

    .line 95
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    array-length v2, v1

    .line 103
    move v4, v3

    .line 104
    :goto_3
    if-ge v4, v2, :cond_4

    .line 105
    .line 106
    aget-object v9, v1, v4

    .line 107
    .line 108
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    invoke-static {v10, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v10

    .line 116
    if-eqz v10, :cond_3

    .line 117
    .line 118
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-result-object v10

    .line 122
    invoke-static {v10, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v10

    .line 126
    if-eqz v10, :cond_3

    .line 127
    .line 128
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    move-result-object v10

    .line 132
    array-length v10, v10

    .line 133
    if-ne v10, v8, :cond_3

    .line 134
    .line 135
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    move-result-object v10

    .line 139
    aget-object v10, v10, v3

    .line 140
    .line 141
    invoke-static {v10, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v10

    .line 145
    if-eqz v10, :cond_3

    .line 146
    .line 147
    move-object v0, v9

    .line 148
    goto :goto_4

    .line 149
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_4
    :goto_4
    if-eqz v0, :cond_5

    .line 153
    .line 154
    return-object v0

    .line 155
    :cond_5
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    goto/16 :goto_0

    .line 160
    .line 161
    :cond_6
    return-object v0
.end method

.method public static ζ(Landroid/view/View;)Landroid/view/View;
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Landroid/view/ViewGroup;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v2

    .line 14
    :goto_0
    if-nez v0, :cond_1

    .line 15
    .line 16
    return-object v2

    .line 17
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    instance-of v3, v1, Landroid/view/ViewGroup;

    .line 22
    .line 23
    if-eqz v3, :cond_2

    .line 24
    .line 25
    check-cast v1, Landroid/view/ViewGroup;

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    move-object v1, v2

    .line 29
    :goto_1
    const/4 v3, 0x0

    .line 30
    const/4 v4, 0x2

    .line 31
    if-eqz v1, :cond_6

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    move v6, v3

    .line 38
    move v7, v6

    .line 39
    :goto_2
    if-ge v6, v5, :cond_5

    .line 40
    .line 41
    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    if-nez v8, :cond_3

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_3
    invoke-static {v8}, Lm52;->γ(Landroid/view/View;)Z

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    if-eqz v8, :cond_4

    .line 53
    .line 54
    add-int/lit8 v7, v7, 0x1

    .line 55
    .line 56
    :cond_4
    :goto_3
    add-int/lit8 v6, v6, 0x1

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_5
    if-lt v7, v4, :cond_6

    .line 60
    .line 61
    invoke-static {p0, v0}, Lm52;->ξ(Landroid/view/View;Landroid/view/ViewGroup;)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_6

    .line 66
    .line 67
    goto :goto_6

    .line 68
    :cond_6
    if-eqz v1, :cond_b

    .line 69
    .line 70
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    instance-of v6, v5, Landroid/view/ViewGroup;

    .line 75
    .line 76
    if-eqz v6, :cond_7

    .line 77
    .line 78
    move-object v2, v5

    .line 79
    check-cast v2, Landroid/view/ViewGroup;

    .line 80
    .line 81
    :cond_7
    if-eqz v2, :cond_b

    .line 82
    .line 83
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    move v6, v3

    .line 88
    :goto_4
    if-ge v3, v5, :cond_a

    .line 89
    .line 90
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    if-nez v7, :cond_8

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_8
    invoke-static {v7}, Lm52;->γ(Landroid/view/View;)Z

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    if-eqz v7, :cond_9

    .line 102
    .line 103
    add-int/lit8 v6, v6, 0x1

    .line 104
    .line 105
    :cond_9
    :goto_5
    add-int/lit8 v3, v3, 0x1

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_a
    if-lt v6, v4, :cond_b

    .line 109
    .line 110
    invoke-static {p0, v1}, Lm52;->ξ(Landroid/view/View;Landroid/view/ViewGroup;)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_b

    .line 115
    .line 116
    return-object v1

    .line 117
    :cond_b
    invoke-static {p0, v0}, Lm52;->ξ(Landroid/view/View;Landroid/view/ViewGroup;)Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-eqz v1, :cond_c

    .line 122
    .line 123
    :goto_6
    return-object v0

    .line 124
    :cond_c
    return-object p0
.end method

.method public static η(Landroid/view/View;)Landroid/widget/TextView;
    .locals 4

    .line 1
    instance-of v0, p0, Landroid/widget/TextView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    move-object v0, p0

    .line 7
    check-cast v0, Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-static {v2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v2, v1

    .line 31
    :goto_0
    if-nez v2, :cond_1

    .line 32
    .line 33
    const-string v2, ""

    .line 34
    .line 35
    :cond_1
    invoke-static {v2}, Lm52;->π(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 43
    .line 44
    if-eqz v0, :cond_5

    .line 45
    .line 46
    check-cast p0, Landroid/view/ViewGroup;

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const/4 v2, 0x0

    .line 53
    :goto_1
    if-ge v2, v0, :cond_5

    .line 54
    .line 55
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    if-nez v3, :cond_3

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    invoke-static {v3}, Lm52;->η(Landroid/view/View;)Landroid/widget/TextView;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    if-eqz v3, :cond_4

    .line 67
    .line 68
    return-object v3

    .line 69
    :cond_4
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_5
    return-object v1
.end method

.method public static θ(Landroid/view/View;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {p0}, Lm52;->ν(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lm52;->ο:Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "\u4ece\u89c6\u56fe\u6811\u6355\u83b7\u9876\u680f ViewPager: "

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "r14983b95b84acb5"

    .line 29
    .line 30
    invoke-static {v1, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 35
    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    check-cast p0, Landroid/view/ViewGroup;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/4 v1, 0x0

    .line 45
    :goto_0
    if-ge v1, v0, :cond_3

    .line 46
    .line 47
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    if-nez v2, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-static {v2}, Lm52;->θ(Landroid/view/View;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    if-eqz v2, :cond_2

    .line 59
    .line 60
    return-object v2

    .line 61
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    const/4 p0, 0x0

    .line 65
    return-object p0
.end method

.method public static ι()Ljava/util/Set;
    .locals 5

    .line 1
    sget-object v0, Lnz;->ε:Lnz;

    .line 2
    .line 3
    invoke-static {}, Lui1;->Α()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {}, Lx9;->ι()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    :goto_0
    return-object v0

    .line 17
    :cond_1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 20
    .line 21
    .line 22
    sget-object v1, Lm52;->η:Ljava/util/Set;

    .line 23
    .line 24
    check-cast v1, Ljava/lang/Iterable;

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Ljava/lang/String;

    .line 41
    .line 42
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    sget-object v4, Lm52;->ζ:Ljava/util/Set;

    .line 52
    .line 53
    invoke-interface {v4, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-nez v4, :cond_2

    .line 58
    .line 59
    const-string v4, "toptab_hide_"

    .line 60
    .line 61
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    const/4 v4, 0x0

    .line 66
    invoke-static {v2, v4}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_2

    .line 71
    .line 72
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    return-object v0
.end method

.method public static κ(Ljava/lang/Object;)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "getAdapter"

    .line 3
    .line 4
    new-array v2, v0, [Ljava/lang/Object;

    .line 5
    .line 6
    invoke-static {p0, v1, v2}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    return v0

    .line 13
    :cond_0
    const-string v1, "getCount"

    .line 14
    .line 15
    new-array v2, v0, [Ljava/lang/Object;

    .line 16
    .line 17
    invoke-static {p0, v1, v2}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    instance-of v1, p0, Ljava/lang/Integer;

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    check-cast p0, Ljava/lang/Integer;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    goto :goto_2

    .line 30
    :cond_1
    const/4 p0, 0x0

    .line 31
    :goto_0
    if-eqz p0, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move p0, v0

    .line 39
    :goto_1
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    goto :goto_3

    .line 44
    :goto_2
    new-instance v1, Leo1;

    .line 45
    .line 46
    invoke-direct {v1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    move-object p0, v1

    .line 50
    :goto_3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    instance-of v1, p0, Leo1;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    move-object p0, v0

    .line 59
    :cond_3
    check-cast p0, Ljava/lang/Number;

    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    return p0
.end method

.method public static λ(Ljava/lang/Object;)I
    .locals 3

    .line 1
    const/4 v0, -0x1

    .line 2
    :try_start_0
    const-string v1, "getCurrentItem"

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    new-array v2, v2, [Ljava/lang/Object;

    .line 6
    .line 7
    invoke-static {p0, v1, v2}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    instance-of v1, p0, Ljava/lang/Integer;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    check-cast p0, Ljava/lang/Integer;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    goto :goto_2

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    :goto_0
    if-eqz p0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move p0, v0

    .line 29
    :goto_1
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    goto :goto_3

    .line 34
    :goto_2
    new-instance v1, Leo1;

    .line 35
    .line 36
    invoke-direct {v1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    move-object p0, v1

    .line 40
    :goto_3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    instance-of v1, p0, Leo1;

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    move-object p0, v0

    .line 49
    :cond_2
    check-cast p0, Ljava/lang/Number;

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    return p0
.end method

.method public static μ(Ljava/lang/Class;)V
    .locals 15

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v2, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    array-length v3, v1

    .line 19
    const/4 v4, 0x0

    .line 20
    move v5, v4

    .line 21
    :goto_0
    const/4 v6, 0x2

    .line 22
    sget-object v7, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 23
    .line 24
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 25
    .line 26
    const/4 v9, 0x3

    .line 27
    sget-object v10, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 28
    .line 29
    const/4 v11, 0x1

    .line 30
    if-ge v5, v3, :cond_1

    .line 31
    .line 32
    aget-object v12, v1, v5

    .line 33
    .line 34
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v13

    .line 38
    const-string v14, "onPageScrolled"

    .line 39
    .line 40
    invoke-static {v13, v14}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v13

    .line 44
    if-eqz v13, :cond_0

    .line 45
    .line 46
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v13

    .line 50
    invoke-static {v13, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v10

    .line 54
    if-eqz v10, :cond_0

    .line 55
    .line 56
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v10

    .line 60
    array-length v10, v10

    .line 61
    if-ne v10, v9, :cond_0

    .line 62
    .line 63
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    aget-object v9, v9, v4

    .line 68
    .line 69
    invoke-static {v9, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v9

    .line 73
    if-eqz v9, :cond_0

    .line 74
    .line 75
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    aget-object v9, v9, v11

    .line 80
    .line 81
    invoke-static {v9, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    if-eqz v7, :cond_0

    .line 86
    .line 87
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    aget-object v6, v7, v6

    .line 92
    .line 93
    invoke-static {v6, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    if-eqz v6, :cond_0

    .line 98
    .line 99
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_3

    .line 114
    .line 115
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    check-cast v2, Ljava/lang/reflect/Method;

    .line 120
    .line 121
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-static {v2}, Lm52;->ρ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-nez v3, :cond_2

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_2
    invoke-virtual {v2, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 136
    .line 137
    .line 138
    sget-object v3, Lxq0;->α:Lxq0;

    .line 139
    .line 140
    new-instance v5, Lpy1;

    .line 141
    .line 142
    const/16 v12, 0xa

    .line 143
    .line 144
    invoke-direct {v5, v12}, Lpy1;-><init>(I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v3, v2, v5}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    new-instance v1, Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 161
    .line 162
    .line 163
    array-length v2, p0

    .line 164
    move v3, v4

    .line 165
    :goto_2
    if-ge v3, v2, :cond_5

    .line 166
    .line 167
    aget-object v5, p0, v3

    .line 168
    .line 169
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    move-result-object v12

    .line 173
    invoke-static {v12, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v12

    .line 177
    if-eqz v12, :cond_4

    .line 178
    .line 179
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    move-result-object v12

    .line 183
    array-length v12, v12

    .line 184
    const/4 v13, 0x4

    .line 185
    if-ne v12, v13, :cond_4

    .line 186
    .line 187
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    move-result-object v12

    .line 191
    aget-object v12, v12, v4

    .line 192
    .line 193
    invoke-static {v12, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v12

    .line 197
    if-eqz v12, :cond_4

    .line 198
    .line 199
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    move-result-object v12

    .line 203
    aget-object v12, v12, v11

    .line 204
    .line 205
    invoke-static {v12, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v12

    .line 209
    if-eqz v12, :cond_4

    .line 210
    .line 211
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    move-result-object v12

    .line 215
    aget-object v12, v12, v6

    .line 216
    .line 217
    invoke-static {v12, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v12

    .line 221
    if-eqz v12, :cond_4

    .line 222
    .line 223
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    move-result-object v12

    .line 227
    aget-object v12, v12, v9

    .line 228
    .line 229
    invoke-static {v12, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v12

    .line 233
    if-eqz v12, :cond_4

    .line 234
    .line 235
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 239
    .line 240
    goto :goto_2

    .line 241
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    if-eqz v1, :cond_7

    .line 250
    .line 251
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    check-cast v1, Ljava/lang/reflect/Method;

    .line 256
    .line 257
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    invoke-static {v1}, Lm52;->ρ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v2

    .line 268
    if-nez v2, :cond_6

    .line 269
    .line 270
    goto :goto_3

    .line 271
    :cond_6
    invoke-virtual {v1, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 272
    .line 273
    .line 274
    sget-object v2, Lxq0;->α:Lxq0;

    .line 275
    .line 276
    new-instance v3, Lpy1;

    .line 277
    .line 278
    const/16 v4, 0xa

    .line 279
    .line 280
    invoke-direct {v3, v4}, Lpy1;-><init>(I)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v2, v1, v3}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 284
    .line 285
    .line 286
    goto :goto_3

    .line 287
    :cond_7
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 288
    .line 289
    .line 290
    move-result p0

    .line 291
    new-instance v0, Ljava/lang/StringBuilder;

    .line 292
    .line 293
    const-string v1, "Hook \u9876\u680f\u6ed1\u52a8\u65b9\u5411\u6210\u529f methods="

    .line 294
    .line 295
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object p0

    .line 305
    const-string v0, "r14983b95b84acb5"

    .line 306
    .line 307
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    return-void
.end method

.method public static ν(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "ViewPager"

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-static {v0, v1, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    invoke-static {p0}, Lm52;->κ(Ljava/lang/Object;)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-lez v0, :cond_2

    .line 27
    .line 28
    sget-object v1, Lm52;->λ:Ljava/lang/Object;

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    sget-object v1, Lm52;->λ:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-ge v0, v1, :cond_2

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p0}, Lm52;->ε(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-eqz p0, :cond_3

    .line 54
    .line 55
    return v2

    .line 56
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 57
    return p0
.end method

.method public static ξ(Landroid/view/View;Landroid/view/ViewGroup;)Z
    .locals 2

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lm52;->β(Landroid/view/View;Ljava/util/LinkedHashSet;)V

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 v1, 0x1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    instance-of p1, p0, Landroid/widget/TextView;

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    check-cast p0, Landroid/widget/TextView;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 p0, 0x0

    .line 25
    :goto_0
    if-eqz p0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    if-eqz p0, :cond_2

    .line 38
    .line 39
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-eqz p0, :cond_2

    .line 48
    .line 49
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 50
    .line 51
    invoke-virtual {p0, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-ne p1, v1, :cond_2

    .line 63
    .line 64
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-eqz p0, :cond_2

    .line 69
    .line 70
    :goto_1
    return v1

    .line 71
    :cond_2
    const/4 p0, 0x0

    .line 72
    return p0
.end method

.method public static ο()Z
    .locals 2

    .line 1
    invoke-static {}, Lui1;->Α()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const-string v0, "toptab_skip_hidden_page_enabled"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
.end method

.method public static π(Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_2

    .line 9
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v2, 0x8

    .line 14
    .line 15
    if-le v0, v2, :cond_1

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_1
    move v0, v1

    .line 19
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-ge v0, v2, :cond_4

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/16 v3, 0x4e00

    .line 30
    .line 31
    if-gt v3, v2, :cond_2

    .line 32
    .line 33
    const v3, 0xa000

    .line 34
    .line 35
    .line 36
    if-ge v2, v3, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    invoke-static {v2}, Ljava/lang/Character;->isLetter(C)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    :goto_1
    const/4 p0, 0x1

    .line 46
    return p0

    .line 47
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_4
    :goto_2
    return v1
.end method

.method public static ρ(Ljava/lang/reflect/Method;)Ljava/lang/String;
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
    new-instance v2, Lby1;

    .line 42
    .line 43
    const/16 v3, 0xd

    .line 44
    .line 45
    invoke-direct {v2, v3}, Lby1;-><init>(I)V

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

.method public static σ()V
    .locals 8

    .line 1
    sget-object v0, Lm52;->λ:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-static {}, Lm52;->ι()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v2, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v3, 0x0

    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_4

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    add-int/lit8 v5, v3, 0x1

    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    if-ltz v3, :cond_3

    .line 38
    .line 39
    check-cast v4, Ljava/lang/String;

    .line 40
    .line 41
    invoke-interface {v1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_1

    .line 46
    .line 47
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    :cond_1
    if-eqz v6, :cond_2

    .line 52
    .line 53
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    :cond_2
    move v3, v5

    .line 57
    goto :goto_0

    .line 58
    :cond_3
    invoke-static {}, Lyh;->х()V

    .line 59
    .line 60
    .line 61
    throw v6

    .line 62
    :cond_4
    invoke-static {v2}, Lxh;->ｊ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sput-object v0, Lm52;->μ:Ljava/util/Set;

    .line 67
    .line 68
    check-cast v0, Ljava/lang/Iterable;

    .line 69
    .line 70
    invoke-static {v0}, Lxh;->Ю(Ljava/lang/Iterable;)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    const/4 v6, 0x0

    .line 75
    const/16 v7, 0x3e

    .line 76
    .line 77
    const-string v2, ","

    .line 78
    .line 79
    const/4 v3, 0x0

    .line 80
    const/4 v4, 0x0

    .line 81
    const/4 v5, 0x0

    .line 82
    invoke-static/range {v1 .. v7}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    sget-object v1, Lm52;->ξ:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-nez v1, :cond_5

    .line 93
    .line 94
    new-instance v1, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    const-string v2, "\u9876\u680f\u9690\u85cf\u9875\u7d22\u5f15: ["

    .line 97
    .line 98
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v2, "]"

    .line 105
    .line 106
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    const-string v2, "r14983b95b84acb5"

    .line 114
    .line 115
    invoke-static {v2, v1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    sput-object v0, Lm52;->ξ:Ljava/lang/String;

    .line 119
    .line 120
    :cond_5
    :goto_1
    return-void
.end method

.method public static τ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, Lm52;->ο:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    if-eqz p0, :cond_5

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :goto_0
    if-eqz v1, :cond_4

    .line 20
    .line 21
    const-class v2, Ljava/lang/Object;

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_4

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    array-length v3, v2

    .line 37
    const/4 v4, 0x0

    .line 38
    :goto_1
    if-ge v4, v3, :cond_3

    .line 39
    .line 40
    aget-object v5, v2, v4

    .line 41
    .line 42
    const/4 v6, 0x1

    .line 43
    :try_start_0
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    if-nez v5, :cond_1

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_1
    invoke-static {v5}, Lm52;->ν(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    if-eqz v6, :cond_2

    .line 58
    .line 59
    new-instance v6, Ljava/lang/ref/WeakReference;

    .line 60
    .line 61
    invoke-direct {v6, v5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    sput-object v6, Lm52;->ο:Ljava/lang/ref/WeakReference;

    .line 65
    .line 66
    const-string v6, "r14983b95b84acb5"

    .line 67
    .line 68
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    new-instance v8, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    const-string v9, "\u4ece\u5b57\u6bb5\u6355\u83b7\u9876\u680f ViewPager: "

    .line 82
    .line 83
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    invoke-static {v6, v7}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    .line 95
    .line 96
    goto :goto_3

    .line 97
    :catchall_0
    :cond_2
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    goto :goto_0

    .line 105
    :cond_4
    move-object v5, v0

    .line 106
    :goto_3
    if-eqz v5, :cond_5

    .line 107
    .line 108
    return-object v5

    .line 109
    :cond_5
    sget-object p0, Lm52;->π:Ljava/lang/Object;

    .line 110
    .line 111
    invoke-static {p0}, Lxh;->я(Ljava/lang/Iterable;)Lf7;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    new-instance v1, Lby1;

    .line 116
    .line 117
    const/16 v2, 0xe

    .line 118
    .line 119
    invoke-direct {v1, v2}, Lby1;-><init>(I)V

    .line 120
    .line 121
    .line 122
    invoke-static {p0, v1}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-static {p0}, Lus1;->φ(Lss1;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    check-cast p0, Landroid/view/View;

    .line 131
    .line 132
    if-nez p0, :cond_6

    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_6
    invoke-static {p0}, Lm52;->θ(Landroid/view/View;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    :goto_4
    return-object v0
.end method

.method public static υ(ILjava/lang/Object;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lm52;->ε(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    array-length v1, v1

    .line 20
    const/4 v2, 0x2

    .line 21
    if-ne v1, v2, :cond_0

    .line 22
    .line 23
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 28
    .line 29
    filled-new-array {p0, v1}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {v0, p1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {v0, p1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    const-string p1, "#setCurrentItem"

    .line 58
    .line 59
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-static {p0}, Lql1;->δ(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method
