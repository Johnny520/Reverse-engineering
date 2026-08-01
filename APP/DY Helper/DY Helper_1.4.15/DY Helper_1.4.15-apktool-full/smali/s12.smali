.class public final Ls12;
.super Landroid/view/MenuInflater;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final ε:[Ljava/lang/Class;

.field public static final ζ:[Ljava/lang/Class;


# instance fields
.field public final α:[Ljava/lang/Object;

.field public final β:[Ljava/lang/Object;

.field public final γ:Landroid/content/Context;

.field public δ:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Landroid/content/Context;

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Ls12;->ε:[Ljava/lang/Class;

    .line 8
    .line 9
    sput-object v0, Ls12;->ζ:[Ljava/lang/Class;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/view/MenuInflater;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls12;->γ:Landroid/content/Context;

    .line 5
    .line 6
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Ls12;->α:[Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p1, p0, Ls12;->β:[Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method

.method public static α(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p0, Landroid/app/Activity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    check-cast p0, Landroid/content/ContextWrapper;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Ls12;->α(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :cond_1
    return-object p0
.end method


# virtual methods
.method public final inflate(ILandroid/view/Menu;)V
    .locals 5

    .line 1
    const-string v0, "Error inflating menu XML"

    .line 2
    .line 3
    instance-of v1, p2, Liz0;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-super {p0, p1, p2}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    :try_start_0
    iget-object v3, p0, Ls12;->γ:Landroid/content/Context;

    .line 14
    .line 15
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v3, p1}, Landroid/content/res/Resources;->getLayout(I)Landroid/content/res/XmlResourceParser;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    instance-of v3, p2, Liz0;

    .line 28
    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    move-object v3, p2

    .line 32
    check-cast v3, Liz0;

    .line 33
    .line 34
    iget-boolean v4, v3, Liz0;->π:Z

    .line 35
    .line 36
    if-nez v4, :cond_1

    .line 37
    .line 38
    invoke-virtual {v3}, Liz0;->ψ()V

    .line 39
    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    goto :goto_3

    .line 45
    :catch_0
    move-exception p0

    .line 46
    goto :goto_1

    .line 47
    :catch_1
    move-exception p0

    .line 48
    goto :goto_2

    .line 49
    :cond_1
    :goto_0
    invoke-virtual {p0, v1, p1, p2}, Ls12;->β(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    check-cast p2, Liz0;

    .line 55
    .line 56
    invoke-virtual {p2}, Liz0;->χ()V

    .line 57
    .line 58
    .line 59
    :cond_2
    invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->close()V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :goto_1
    :try_start_1
    new-instance p1, Landroid/view/InflateException;

    .line 64
    .line 65
    invoke-direct {p1, v0, p0}, Landroid/view/InflateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :goto_2
    new-instance p1, Landroid/view/InflateException;

    .line 70
    .line 71
    invoke-direct {p1, v0, p0}, Landroid/view/InflateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    :goto_3
    if-eqz v2, :cond_3

    .line 76
    .line 77
    check-cast p2, Liz0;

    .line 78
    .line 79
    invoke-virtual {p2}, Liz0;->χ()V

    .line 80
    .line 81
    .line 82
    :cond_3
    if-eqz v1, :cond_4

    .line 83
    .line 84
    invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->close()V

    .line 85
    .line 86
    .line 87
    :cond_4
    throw p0
.end method

.method public final β(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    new-instance v2, Lr12;

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    invoke-direct {v2, v0, v3}, Lr12;-><init>(Ls12;Landroid/view/Menu;)V

    .line 10
    .line 11
    .line 12
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    :goto_0
    const/4 v4, 0x2

    .line 17
    const/4 v5, 0x1

    .line 18
    const-string v6, "menu"

    .line 19
    .line 20
    if-ne v3, v4, :cond_1

    .line 21
    .line 22
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    if-eqz v7, :cond_0

    .line 31
    .line 32
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 38
    .line 39
    const-string v1, "Expecting menu, got "

    .line 40
    .line 41
    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0

    .line 49
    :cond_1
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-ne v3, v5, :cond_18

    .line 54
    .line 55
    :goto_1
    const/4 v7, 0x0

    .line 56
    move v9, v7

    .line 57
    move v10, v9

    .line 58
    const/4 v11, 0x0

    .line 59
    :goto_2
    if-nez v9, :cond_17

    .line 60
    .line 61
    if-eq v3, v5, :cond_16

    .line 62
    .line 63
    const/4 v12, 0x3

    .line 64
    const-string v13, "item"

    .line 65
    .line 66
    const-string v14, "group"

    .line 67
    .line 68
    iget-object v15, v2, Lr12;->α:Landroid/view/Menu;

    .line 69
    .line 70
    if-eq v3, v4, :cond_8

    .line 71
    .line 72
    if-eq v3, v12, :cond_3

    .line 73
    .line 74
    :cond_2
    :goto_3
    move-object/from16 v8, p1

    .line 75
    .line 76
    goto/16 :goto_4

    .line 77
    .line 78
    :cond_3
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    if-eqz v10, :cond_4

    .line 83
    .line 84
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v12

    .line 88
    if-eqz v12, :cond_4

    .line 89
    .line 90
    move-object/from16 v8, p1

    .line 91
    .line 92
    move v10, v7

    .line 93
    const/4 v4, 0x0

    .line 94
    const/4 v11, 0x0

    .line 95
    goto/16 :goto_d

    .line 96
    .line 97
    :cond_4
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v12

    .line 101
    if-eqz v12, :cond_5

    .line 102
    .line 103
    iput v7, v2, Lr12;->β:I

    .line 104
    .line 105
    iput v7, v2, Lr12;->γ:I

    .line 106
    .line 107
    iput v7, v2, Lr12;->δ:I

    .line 108
    .line 109
    iput v7, v2, Lr12;->ε:I

    .line 110
    .line 111
    iput-boolean v5, v2, Lr12;->ζ:Z

    .line 112
    .line 113
    iput-boolean v5, v2, Lr12;->η:Z

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_5
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v12

    .line 120
    if-eqz v12, :cond_7

    .line 121
    .line 122
    iget-boolean v3, v2, Lr12;->θ:Z

    .line 123
    .line 124
    if-nez v3, :cond_2

    .line 125
    .line 126
    iget-object v3, v2, Lr12;->Β:Lｘ;

    .line 127
    .line 128
    if-eqz v3, :cond_6

    .line 129
    .line 130
    check-cast v3, Lmz0;

    .line 131
    .line 132
    iget-object v3, v3, Lmz0;->γ:Landroid/view/ActionProvider;

    .line 133
    .line 134
    invoke-virtual {v3}, Landroid/view/ActionProvider;->hasSubMenu()Z

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    if-eqz v3, :cond_6

    .line 139
    .line 140
    iput-boolean v5, v2, Lr12;->θ:Z

    .line 141
    .line 142
    iget v3, v2, Lr12;->β:I

    .line 143
    .line 144
    iget v12, v2, Lr12;->ι:I

    .line 145
    .line 146
    iget v13, v2, Lr12;->κ:I

    .line 147
    .line 148
    iget-object v14, v2, Lr12;->λ:Ljava/lang/CharSequence;

    .line 149
    .line 150
    invoke-interface {v15, v3, v12, v13, v14}, Landroid/view/Menu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    invoke-interface {v3}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    invoke-virtual {v2, v3}, Lr12;->β(Landroid/view/MenuItem;)V

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_6
    iput-boolean v5, v2, Lr12;->θ:Z

    .line 163
    .line 164
    iget v3, v2, Lr12;->β:I

    .line 165
    .line 166
    iget v12, v2, Lr12;->ι:I

    .line 167
    .line 168
    iget v13, v2, Lr12;->κ:I

    .line 169
    .line 170
    iget-object v14, v2, Lr12;->λ:Ljava/lang/CharSequence;

    .line 171
    .line 172
    invoke-interface {v15, v3, v12, v13, v14}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    invoke-virtual {v2, v3}, Lr12;->β(Landroid/view/MenuItem;)V

    .line 177
    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_7
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    if-eqz v3, :cond_2

    .line 185
    .line 186
    move-object/from16 v8, p1

    .line 187
    .line 188
    move v9, v5

    .line 189
    :goto_4
    const/4 v4, 0x0

    .line 190
    goto/16 :goto_d

    .line 191
    .line 192
    :cond_8
    if-eqz v10, :cond_9

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_9
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v14

    .line 203
    iget-object v8, v0, Ls12;->γ:Landroid/content/Context;

    .line 204
    .line 205
    const/4 v4, 0x4

    .line 206
    if-eqz v14, :cond_a

    .line 207
    .line 208
    sget-object v3, Lkk1;->ρ:[I

    .line 209
    .line 210
    invoke-virtual {v8, v1, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    invoke-virtual {v3, v5, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 215
    .line 216
    .line 217
    move-result v8

    .line 218
    iput v8, v2, Lr12;->β:I

    .line 219
    .line 220
    invoke-virtual {v3, v12, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 221
    .line 222
    .line 223
    move-result v8

    .line 224
    iput v8, v2, Lr12;->γ:I

    .line 225
    .line 226
    invoke-virtual {v3, v4, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 227
    .line 228
    .line 229
    move-result v4

    .line 230
    iput v4, v2, Lr12;->δ:I

    .line 231
    .line 232
    const/4 v4, 0x5

    .line 233
    invoke-virtual {v3, v4, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 234
    .line 235
    .line 236
    move-result v4

    .line 237
    iput v4, v2, Lr12;->ε:I

    .line 238
    .line 239
    const/4 v14, 0x2

    .line 240
    invoke-virtual {v3, v14, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 241
    .line 242
    .line 243
    move-result v4

    .line 244
    iput-boolean v4, v2, Lr12;->ζ:Z

    .line 245
    .line 246
    invoke-virtual {v3, v7, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 247
    .line 248
    .line 249
    move-result v4

    .line 250
    iput-boolean v4, v2, Lr12;->η:Z

    .line 251
    .line 252
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 253
    .line 254
    .line 255
    goto/16 :goto_3

    .line 256
    .line 257
    :cond_a
    const/4 v14, 0x2

    .line 258
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v13

    .line 262
    if-eqz v13, :cond_14

    .line 263
    .line 264
    sget-object v3, Lkk1;->σ:[I

    .line 265
    .line 266
    invoke-virtual {v8, v1, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    invoke-virtual {v3, v14, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 271
    .line 272
    .line 273
    move-result v13

    .line 274
    iput v13, v2, Lr12;->ι:I

    .line 275
    .line 276
    iget v13, v2, Lr12;->γ:I

    .line 277
    .line 278
    const/4 v15, 0x5

    .line 279
    invoke-virtual {v3, v15, v13}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 280
    .line 281
    .line 282
    move-result v13

    .line 283
    const/4 v15, 0x6

    .line 284
    iget v14, v2, Lr12;->δ:I

    .line 285
    .line 286
    invoke-virtual {v3, v15, v14}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 287
    .line 288
    .line 289
    move-result v14

    .line 290
    const/high16 v15, -0x10000

    .line 291
    .line 292
    and-int/2addr v13, v15

    .line 293
    const v15, 0xffff

    .line 294
    .line 295
    .line 296
    and-int/2addr v14, v15

    .line 297
    or-int/2addr v13, v14

    .line 298
    iput v13, v2, Lr12;->κ:I

    .line 299
    .line 300
    const/4 v13, 0x7

    .line 301
    invoke-virtual {v3, v13}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 302
    .line 303
    .line 304
    move-result-object v13

    .line 305
    iput-object v13, v2, Lr12;->λ:Ljava/lang/CharSequence;

    .line 306
    .line 307
    const/16 v13, 0x8

    .line 308
    .line 309
    invoke-virtual {v3, v13}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 310
    .line 311
    .line 312
    move-result-object v13

    .line 313
    iput-object v13, v2, Lr12;->μ:Ljava/lang/CharSequence;

    .line 314
    .line 315
    invoke-virtual {v3, v7, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 316
    .line 317
    .line 318
    move-result v13

    .line 319
    iput v13, v2, Lr12;->ν:I

    .line 320
    .line 321
    const/16 v13, 0x9

    .line 322
    .line 323
    invoke-virtual {v3, v13}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v13

    .line 327
    if-nez v13, :cond_b

    .line 328
    .line 329
    move v13, v7

    .line 330
    goto :goto_5

    .line 331
    :cond_b
    invoke-virtual {v13, v7}, Ljava/lang/String;->charAt(I)C

    .line 332
    .line 333
    .line 334
    move-result v13

    .line 335
    :goto_5
    iput-char v13, v2, Lr12;->ξ:C

    .line 336
    .line 337
    const/16 v13, 0x10

    .line 338
    .line 339
    const/16 v14, 0x1000

    .line 340
    .line 341
    invoke-virtual {v3, v13, v14}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 342
    .line 343
    .line 344
    move-result v13

    .line 345
    iput v13, v2, Lr12;->ο:I

    .line 346
    .line 347
    const/16 v13, 0xa

    .line 348
    .line 349
    invoke-virtual {v3, v13}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v13

    .line 353
    if-nez v13, :cond_c

    .line 354
    .line 355
    move v13, v7

    .line 356
    goto :goto_6

    .line 357
    :cond_c
    invoke-virtual {v13, v7}, Ljava/lang/String;->charAt(I)C

    .line 358
    .line 359
    .line 360
    move-result v13

    .line 361
    :goto_6
    iput-char v13, v2, Lr12;->π:C

    .line 362
    .line 363
    const/16 v13, 0x14

    .line 364
    .line 365
    invoke-virtual {v3, v13, v14}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 366
    .line 367
    .line 368
    move-result v13

    .line 369
    iput v13, v2, Lr12;->ρ:I

    .line 370
    .line 371
    const/16 v13, 0xb

    .line 372
    .line 373
    invoke-virtual {v3, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 374
    .line 375
    .line 376
    move-result v14

    .line 377
    if-eqz v14, :cond_d

    .line 378
    .line 379
    invoke-virtual {v3, v13, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 380
    .line 381
    .line 382
    move-result v13

    .line 383
    iput v13, v2, Lr12;->σ:I

    .line 384
    .line 385
    goto :goto_7

    .line 386
    :cond_d
    iget v13, v2, Lr12;->ε:I

    .line 387
    .line 388
    iput v13, v2, Lr12;->σ:I

    .line 389
    .line 390
    :goto_7
    invoke-virtual {v3, v12, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 391
    .line 392
    .line 393
    move-result v12

    .line 394
    iput-boolean v12, v2, Lr12;->τ:Z

    .line 395
    .line 396
    iget-boolean v12, v2, Lr12;->ζ:Z

    .line 397
    .line 398
    invoke-virtual {v3, v4, v12}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 399
    .line 400
    .line 401
    move-result v4

    .line 402
    iput-boolean v4, v2, Lr12;->υ:Z

    .line 403
    .line 404
    iget-boolean v4, v2, Lr12;->η:Z

    .line 405
    .line 406
    invoke-virtual {v3, v5, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 407
    .line 408
    .line 409
    move-result v4

    .line 410
    iput-boolean v4, v2, Lr12;->φ:Z

    .line 411
    .line 412
    const/16 v4, 0x15

    .line 413
    .line 414
    const/4 v12, -0x1

    .line 415
    invoke-virtual {v3, v4, v12}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 416
    .line 417
    .line 418
    move-result v4

    .line 419
    iput v4, v2, Lr12;->χ:I

    .line 420
    .line 421
    const/16 v4, 0xc

    .line 422
    .line 423
    invoke-virtual {v3, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v4

    .line 427
    iput-object v4, v2, Lr12;->Α:Ljava/lang/String;

    .line 428
    .line 429
    const/16 v4, 0xd

    .line 430
    .line 431
    invoke-virtual {v3, v4, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 432
    .line 433
    .line 434
    move-result v4

    .line 435
    iput v4, v2, Lr12;->ψ:I

    .line 436
    .line 437
    const/16 v4, 0xf

    .line 438
    .line 439
    invoke-virtual {v3, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v4

    .line 443
    iput-object v4, v2, Lr12;->ω:Ljava/lang/String;

    .line 444
    .line 445
    const/16 v4, 0xe

    .line 446
    .line 447
    invoke-virtual {v3, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v4

    .line 451
    if-eqz v4, :cond_e

    .line 452
    .line 453
    move v13, v5

    .line 454
    goto :goto_8

    .line 455
    :cond_e
    move v13, v7

    .line 456
    :goto_8
    if-eqz v13, :cond_f

    .line 457
    .line 458
    iget v14, v2, Lr12;->ψ:I

    .line 459
    .line 460
    if-nez v14, :cond_f

    .line 461
    .line 462
    iget-object v14, v2, Lr12;->ω:Ljava/lang/String;

    .line 463
    .line 464
    if-nez v14, :cond_f

    .line 465
    .line 466
    sget-object v13, Ls12;->ζ:[Ljava/lang/Class;

    .line 467
    .line 468
    iget-object v14, v0, Ls12;->β:[Ljava/lang/Object;

    .line 469
    .line 470
    invoke-virtual {v2, v4, v13, v14}, Lr12;->α(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v4

    .line 474
    check-cast v4, Lｘ;

    .line 475
    .line 476
    iput-object v4, v2, Lr12;->Β:Lｘ;

    .line 477
    .line 478
    goto :goto_9

    .line 479
    :cond_f
    if-eqz v13, :cond_10

    .line 480
    .line 481
    const-string v4, "SupportMenuInflater"

    .line 482
    .line 483
    const-string v13, "Ignoring attribute \'actionProviderClass\'. Action view already specified."

    .line 484
    .line 485
    invoke-static {v4, v13}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 486
    .line 487
    .line 488
    :cond_10
    const/4 v4, 0x0

    .line 489
    iput-object v4, v2, Lr12;->Β:Lｘ;

    .line 490
    .line 491
    :goto_9
    const/16 v4, 0x11

    .line 492
    .line 493
    invoke-virtual {v3, v4}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 494
    .line 495
    .line 496
    move-result-object v4

    .line 497
    iput-object v4, v2, Lr12;->Γ:Ljava/lang/CharSequence;

    .line 498
    .line 499
    const/16 v4, 0x16

    .line 500
    .line 501
    invoke-virtual {v3, v4}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 502
    .line 503
    .line 504
    move-result-object v4

    .line 505
    iput-object v4, v2, Lr12;->Δ:Ljava/lang/CharSequence;

    .line 506
    .line 507
    const/16 v4, 0x13

    .line 508
    .line 509
    invoke-virtual {v3, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 510
    .line 511
    .line 512
    move-result v13

    .line 513
    if-eqz v13, :cond_11

    .line 514
    .line 515
    invoke-virtual {v3, v4, v12}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 516
    .line 517
    .line 518
    move-result v4

    .line 519
    iget-object v12, v2, Lr12;->Ζ:Landroid/graphics/PorterDuff$Mode;

    .line 520
    .line 521
    invoke-static {v4, v12}, Lfw;->γ(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 522
    .line 523
    .line 524
    move-result-object v4

    .line 525
    iput-object v4, v2, Lr12;->Ζ:Landroid/graphics/PorterDuff$Mode;

    .line 526
    .line 527
    goto :goto_a

    .line 528
    :cond_11
    const/4 v4, 0x0

    .line 529
    iput-object v4, v2, Lr12;->Ζ:Landroid/graphics/PorterDuff$Mode;

    .line 530
    .line 531
    :goto_a
    const/16 v4, 0x12

    .line 532
    .line 533
    invoke-virtual {v3, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 534
    .line 535
    .line 536
    move-result v12

    .line 537
    if-eqz v12, :cond_13

    .line 538
    .line 539
    invoke-virtual {v3, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 540
    .line 541
    .line 542
    move-result v12

    .line 543
    if-eqz v12, :cond_12

    .line 544
    .line 545
    invoke-virtual {v3, v4, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 546
    .line 547
    .line 548
    move-result v12

    .line 549
    if-eqz v12, :cond_12

    .line 550
    .line 551
    invoke-static {v8, v12}, Lln0;->Η(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 552
    .line 553
    .line 554
    move-result-object v8

    .line 555
    if-eqz v8, :cond_12

    .line 556
    .line 557
    goto :goto_b

    .line 558
    :cond_12
    invoke-virtual {v3, v4}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 559
    .line 560
    .line 561
    move-result-object v8

    .line 562
    :goto_b
    iput-object v8, v2, Lr12;->Ε:Landroid/content/res/ColorStateList;

    .line 563
    .line 564
    const/4 v4, 0x0

    .line 565
    goto :goto_c

    .line 566
    :cond_13
    const/4 v4, 0x0

    .line 567
    iput-object v4, v2, Lr12;->Ε:Landroid/content/res/ColorStateList;

    .line 568
    .line 569
    :goto_c
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 570
    .line 571
    .line 572
    iput-boolean v7, v2, Lr12;->θ:Z

    .line 573
    .line 574
    move-object/from16 v8, p1

    .line 575
    .line 576
    goto :goto_d

    .line 577
    :cond_14
    const/4 v4, 0x0

    .line 578
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 579
    .line 580
    .line 581
    move-result v8

    .line 582
    if-eqz v8, :cond_15

    .line 583
    .line 584
    iput-boolean v5, v2, Lr12;->θ:Z

    .line 585
    .line 586
    iget v3, v2, Lr12;->β:I

    .line 587
    .line 588
    iget v8, v2, Lr12;->ι:I

    .line 589
    .line 590
    iget v12, v2, Lr12;->κ:I

    .line 591
    .line 592
    iget-object v13, v2, Lr12;->λ:Ljava/lang/CharSequence;

    .line 593
    .line 594
    invoke-interface {v15, v3, v8, v12, v13}, Landroid/view/Menu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    .line 595
    .line 596
    .line 597
    move-result-object v3

    .line 598
    invoke-interface {v3}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;

    .line 599
    .line 600
    .line 601
    move-result-object v8

    .line 602
    invoke-virtual {v2, v8}, Lr12;->β(Landroid/view/MenuItem;)V

    .line 603
    .line 604
    .line 605
    move-object/from16 v8, p1

    .line 606
    .line 607
    invoke-virtual {v0, v8, v1, v3}, Ls12;->β(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V

    .line 608
    .line 609
    .line 610
    goto :goto_d

    .line 611
    :cond_15
    move-object/from16 v8, p1

    .line 612
    .line 613
    move-object v11, v3

    .line 614
    move v10, v5

    .line 615
    :goto_d
    invoke-interface {v8}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 616
    .line 617
    .line 618
    move-result v3

    .line 619
    const/4 v4, 0x2

    .line 620
    goto/16 :goto_2

    .line 621
    .line 622
    :cond_16
    new-instance v0, Ljava/lang/RuntimeException;

    .line 623
    .line 624
    const-string v1, "Unexpected end of document"

    .line 625
    .line 626
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 627
    .line 628
    .line 629
    throw v0

    .line 630
    :cond_17
    return-void

    .line 631
    :cond_18
    move-object/from16 v8, p1

    .line 632
    .line 633
    goto/16 :goto_0
.end method
