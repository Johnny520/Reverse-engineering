.class public final Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪世兰哲苏:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

.field public 飘花落叶言子楪世兰苏哲:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

.field public 飘花落叶言子楪世哲兰苏:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

.field public 飘花落叶言子楪世哲苏兰:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

.field public 飘花落叶言子楪世苏兰哲:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

.field public final 飘花落叶言子楪世苏哲兰:Landroid/widget/TextView;

.field public 飘花落叶言子楪哲世苏兰:Z

.field public 飘花落叶言子楪苏世兰哲:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

.field public 飘花落叶言子楪苏世哲兰:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

.field public 飘花落叶言子楪苏兰世哲:I

.field public 飘花落叶言子楪苏兰哲世:Landroid/graphics/Typeface;

.field public final 飘花落叶言子楪苏哲世兰:Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;

.field public 飘花落叶言子楪苏哲兰世:I


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲兰世:I

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰世哲:I

    .line 9
    .line 10
    iput-object p1, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰:Landroid/widget/TextView;

    .line 11
    .line 12
    new-instance v0, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;-><init>(Landroid/widget/TextView;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲世兰:Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;

    .line 18
    .line 19
    return-void
.end method

.method public static 飘花落叶言子楪世哲苏兰(Landroid/content/Context;Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;I)Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;
    .locals 1

    .line 1
    monitor-enter p1

    .line 2
    :try_start_0
    iget-object v0, p1, Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/飘花落叶言子哲兰苏世楪;

    .line 3
    .line 4
    invoke-virtual {v0, p0, p2}, Landroidx/appcompat/widget/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世兰哲苏(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 5
    .line 6
    .line 7
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit p1

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    new-instance p1, Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 p2, 0x1

    .line 17
    iput-boolean p2, p1, Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;->飘花落叶言子楪世苏兰哲:Z

    .line 18
    .line 19
    iput-object p0, p1, Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw p0
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏(Landroid/util/AttributeSet;I)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    move/from16 v5, p2

    .line 6
    .line 7
    iget-object v1, v0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰:Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v7

    .line 13
    invoke-static {}, Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏哲兰()Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;

    .line 14
    .line 15
    .line 16
    move-result-object v8

    .line 17
    const/4 v9, 0x0

    .line 18
    sget-object v2, L飘花落叶言子楪苏世兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲:[I

    .line 19
    .line 20
    invoke-static {v5, v9, v7, v3, v2}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世苏哲楪兰(IILandroid/content/Context;Landroid/util/AttributeSet;[I)Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 21
    .line 22
    .line 23
    move-result-object v10

    .line 24
    move-object v3, v2

    .line 25
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iget-object v4, v10, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v4, Landroid/content/res/TypedArray;

    .line 32
    .line 33
    move v6, v5

    .line 34
    move-object v5, v4

    .line 35
    move-object/from16 v4, p1

    .line 36
    .line 37
    invoke-static/range {v1 .. v6}, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲苏世兰(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 38
    .line 39
    .line 40
    move-object v3, v4

    .line 41
    move v5, v6

    .line 42
    move-object v6, v1

    .line 43
    iget-object v1, v10, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Landroid/content/res/TypedArray;

    .line 46
    .line 47
    const/4 v11, -0x1

    .line 48
    invoke-virtual {v1, v9, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    const/4 v12, 0x3

    .line 53
    invoke-virtual {v1, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_0

    .line 58
    .line 59
    invoke-virtual {v1, v12, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    invoke-static {v7, v8, v4}, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰(Landroid/content/Context;Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;I)Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    iput-object v4, v0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏兰哲:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 68
    .line 69
    :cond_0
    const/4 v13, 0x1

    .line 70
    invoke-virtual {v1, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_1

    .line 75
    .line 76
    invoke-virtual {v1, v13, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    invoke-static {v7, v8, v4}, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰(Landroid/content/Context;Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;I)Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    iput-object v4, v0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 85
    .line 86
    :cond_1
    const/4 v14, 0x4

    .line 87
    invoke-virtual {v1, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    if-eqz v4, :cond_2

    .line 92
    .line 93
    invoke-virtual {v1, v14, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    invoke-static {v7, v8, v4}, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰(Landroid/content/Context;Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;I)Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    iput-object v4, v0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲兰苏:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 102
    .line 103
    :cond_2
    const/4 v15, 0x2

    .line 104
    invoke-virtual {v1, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    if-eqz v4, :cond_3

    .line 109
    .line 110
    invoke-virtual {v1, v15, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    invoke-static {v7, v8, v4}, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰(Landroid/content/Context;Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;I)Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    iput-object v4, v0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世兰苏哲:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 119
    .line 120
    :cond_3
    const/4 v4, 0x5

    .line 121
    invoke-virtual {v1, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 122
    .line 123
    .line 124
    move-result v16

    .line 125
    if-eqz v16, :cond_4

    .line 126
    .line 127
    invoke-virtual {v1, v4, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 128
    .line 129
    .line 130
    move-result v12

    .line 131
    invoke-static {v7, v8, v12}, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰(Landroid/content/Context;Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;I)Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 132
    .line 133
    .line 134
    move-result-object v12

    .line 135
    iput-object v12, v0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世兰哲苏:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 136
    .line 137
    :cond_4
    const/4 v12, 0x6

    .line 138
    invoke-virtual {v1, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 139
    .line 140
    .line 141
    move-result v17

    .line 142
    if-eqz v17, :cond_5

    .line 143
    .line 144
    invoke-virtual {v1, v12, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    invoke-static {v7, v8, v1}, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰(Landroid/content/Context;Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;I)Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    iput-object v1, v0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏世哲兰:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 153
    .line 154
    :cond_5
    invoke-virtual {v10}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世哲楪苏兰()V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v6}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    instance-of v1, v1, Landroid/text/method/PasswordTransformationMethod;

    .line 162
    .line 163
    sget-object v10, L飘花落叶言子楪苏世兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏哲世:[I

    .line 164
    .line 165
    const/16 v4, 0xe

    .line 166
    .line 167
    const/16 v12, 0xd

    .line 168
    .line 169
    const/16 v13, 0xf

    .line 170
    .line 171
    if-eq v2, v11, :cond_9

    .line 172
    .line 173
    new-instance v15, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 174
    .line 175
    invoke-virtual {v7, v2, v10}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    invoke-direct {v15, v7, v2}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 180
    .line 181
    .line 182
    if-nez v1, :cond_6

    .line 183
    .line 184
    invoke-virtual {v2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 185
    .line 186
    .line 187
    move-result v20

    .line 188
    if-eqz v20, :cond_6

    .line 189
    .line 190
    invoke-virtual {v2, v4, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 191
    .line 192
    .line 193
    move-result v20

    .line 194
    move/from16 v21, v20

    .line 195
    .line 196
    const/16 v20, 0x1

    .line 197
    .line 198
    goto :goto_0

    .line 199
    :cond_6
    move/from16 v20, v9

    .line 200
    .line 201
    move/from16 v21, v20

    .line 202
    .line 203
    :goto_0
    invoke-virtual {v0, v7, v15}, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲兰世(Landroid/content/Context;Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 207
    .line 208
    .line 209
    move-result v22

    .line 210
    if-eqz v22, :cond_7

    .line 211
    .line 212
    invoke-virtual {v2, v13}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v22

    .line 216
    goto :goto_1

    .line 217
    :cond_7
    const/16 v22, 0x0

    .line 218
    .line 219
    :goto_1
    invoke-virtual {v2, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 220
    .line 221
    .line 222
    move-result v23

    .line 223
    if-eqz v23, :cond_8

    .line 224
    .line 225
    invoke-virtual {v2, v12}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    goto :goto_2

    .line 230
    :cond_8
    const/4 v2, 0x0

    .line 231
    :goto_2
    invoke-virtual {v15}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世哲楪苏兰()V

    .line 232
    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_9
    move/from16 v20, v9

    .line 236
    .line 237
    move/from16 v21, v20

    .line 238
    .line 239
    const/4 v2, 0x0

    .line 240
    const/16 v22, 0x0

    .line 241
    .line 242
    :goto_3
    new-instance v15, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 243
    .line 244
    invoke-virtual {v7, v3, v10, v5, v9}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 245
    .line 246
    .line 247
    move-result-object v10

    .line 248
    invoke-direct {v15, v7, v10}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 249
    .line 250
    .line 251
    if-nez v1, :cond_a

    .line 252
    .line 253
    invoke-virtual {v10, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 254
    .line 255
    .line 256
    move-result v23

    .line 257
    if-eqz v23, :cond_a

    .line 258
    .line 259
    invoke-virtual {v10, v4, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 260
    .line 261
    .line 262
    move-result v21

    .line 263
    const/16 v20, 0x1

    .line 264
    .line 265
    :cond_a
    move/from16 v4, v21

    .line 266
    .line 267
    invoke-virtual {v10, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 268
    .line 269
    .line 270
    move-result v21

    .line 271
    if-eqz v21, :cond_b

    .line 272
    .line 273
    invoke-virtual {v10, v13}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v22

    .line 277
    :cond_b
    invoke-virtual {v10, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 278
    .line 279
    .line 280
    move-result v21

    .line 281
    if-eqz v21, :cond_c

    .line 282
    .line 283
    invoke-virtual {v10, v12}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    :cond_c
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 288
    .line 289
    const/16 v12, 0x1c

    .line 290
    .line 291
    const/4 v14, 0x0

    .line 292
    if-lt v13, v12, :cond_d

    .line 293
    .line 294
    invoke-virtual {v10, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 295
    .line 296
    .line 297
    move-result v12

    .line 298
    if-eqz v12, :cond_d

    .line 299
    .line 300
    invoke-virtual {v10, v9, v11}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 301
    .line 302
    .line 303
    move-result v10

    .line 304
    if-nez v10, :cond_d

    .line 305
    .line 306
    invoke-virtual {v6, v9, v14}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 307
    .line 308
    .line 309
    :cond_d
    invoke-virtual {v0, v7, v15}, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲兰世(Landroid/content/Context;Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v15}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世哲楪苏兰()V

    .line 313
    .line 314
    .line 315
    if-nez v1, :cond_e

    .line 316
    .line 317
    if-eqz v20, :cond_e

    .line 318
    .line 319
    invoke-virtual {v6, v4}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 320
    .line 321
    .line 322
    :cond_e
    iget-object v1, v0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰哲世:Landroid/graphics/Typeface;

    .line 323
    .line 324
    if-eqz v1, :cond_10

    .line 325
    .line 326
    iget v4, v0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰世哲:I

    .line 327
    .line 328
    if-ne v4, v11, :cond_f

    .line 329
    .line 330
    iget v4, v0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲兰世:I

    .line 331
    .line 332
    invoke-virtual {v6, v1, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 333
    .line 334
    .line 335
    goto :goto_4

    .line 336
    :cond_f
    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 337
    .line 338
    .line 339
    :cond_10
    :goto_4
    if-eqz v2, :cond_11

    .line 340
    .line 341
    invoke-static {v6, v2}, Landroidx/appcompat/widget/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世哲兰苏(Landroid/widget/TextView;Ljava/lang/String;)Z

    .line 342
    .line 343
    .line 344
    :cond_11
    if-eqz v22, :cond_12

    .line 345
    .line 346
    invoke-static/range {v22 .. v22}, Landroidx/appcompat/widget/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Landroid/os/LocaleList;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    invoke-static {v6, v1}, Landroidx/appcompat/widget/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世苏兰哲(Landroid/widget/TextView;Landroid/os/LocaleList;)V

    .line 351
    .line 352
    .line 353
    :cond_12
    iget-object v10, v0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲世兰:Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;

    .line 354
    .line 355
    iget-object v12, v10, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏世兰哲:Landroid/content/Context;

    .line 356
    .line 357
    sget-object v2, L飘花落叶言子楪苏世兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰:[I

    .line 358
    .line 359
    invoke-virtual {v12, v3, v2, v5, v9}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 360
    .line 361
    .line 362
    move-result-object v4

    .line 363
    iget-object v0, v10, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏世哲兰:Landroid/widget/TextView;

    .line 364
    .line 365
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    const/4 v13, 0x5

    .line 370
    invoke-static/range {v0 .. v5}, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲苏世兰(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v4, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    if-eqz v0, :cond_13

    .line 378
    .line 379
    invoke-virtual {v4, v13, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 380
    .line 381
    .line 382
    move-result v0

    .line 383
    iput v0, v10, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏哲兰:I

    .line 384
    .line 385
    :cond_13
    const/4 v0, 0x4

    .line 386
    invoke-virtual {v4, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 387
    .line 388
    .line 389
    move-result v1

    .line 390
    const/high16 v5, -0x40800000    # -1.0f

    .line 391
    .line 392
    if-eqz v1, :cond_14

    .line 393
    .line 394
    invoke-virtual {v4, v0, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 395
    .line 396
    .line 397
    move-result v0

    .line 398
    :goto_5
    const/4 v1, 0x2

    .line 399
    goto :goto_6

    .line 400
    :cond_14
    move v0, v5

    .line 401
    goto :goto_5

    .line 402
    :goto_6
    invoke-virtual {v4, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 403
    .line 404
    .line 405
    move-result v15

    .line 406
    if-eqz v15, :cond_15

    .line 407
    .line 408
    invoke-virtual {v4, v1, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 409
    .line 410
    .line 411
    move-result v15

    .line 412
    :goto_7
    const/4 v1, 0x1

    .line 413
    goto :goto_8

    .line 414
    :cond_15
    move v15, v5

    .line 415
    goto :goto_7

    .line 416
    :goto_8
    invoke-virtual {v4, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 417
    .line 418
    .line 419
    move-result v17

    .line 420
    if-eqz v17, :cond_16

    .line 421
    .line 422
    invoke-virtual {v4, v1, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 423
    .line 424
    .line 425
    move-result v17

    .line 426
    :goto_9
    const/4 v1, 0x3

    .line 427
    goto :goto_a

    .line 428
    :cond_16
    move/from16 v17, v5

    .line 429
    .line 430
    goto :goto_9

    .line 431
    :goto_a
    invoke-virtual {v4, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 432
    .line 433
    .line 434
    move-result v16

    .line 435
    if-eqz v16, :cond_1c

    .line 436
    .line 437
    move/from16 v20, v14

    .line 438
    .line 439
    invoke-virtual {v4, v1, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 440
    .line 441
    .line 442
    move-result v14

    .line 443
    if-lez v14, :cond_1b

    .line 444
    .line 445
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    invoke-virtual {v1, v14}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    .line 450
    .line 451
    .line 452
    move-result-object v1

    .line 453
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->length()I

    .line 454
    .line 455
    .line 456
    move-result v14

    .line 457
    new-array v13, v14, [I

    .line 458
    .line 459
    if-lez v14, :cond_19

    .line 460
    .line 461
    move/from16 v24, v9

    .line 462
    .line 463
    :goto_b
    if-ge v9, v14, :cond_17

    .line 464
    .line 465
    invoke-virtual {v1, v9, v11}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 466
    .line 467
    .line 468
    move-result v25

    .line 469
    aput v25, v13, v9

    .line 470
    .line 471
    add-int/lit8 v9, v9, 0x1

    .line 472
    .line 473
    goto :goto_b

    .line 474
    :cond_17
    invoke-static {v13}, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏哲兰([I)[I

    .line 475
    .line 476
    .line 477
    move-result-object v9

    .line 478
    iput-object v9, v10, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世兰苏哲:[I

    .line 479
    .line 480
    array-length v13, v9

    .line 481
    if-lez v13, :cond_18

    .line 482
    .line 483
    const/4 v14, 0x1

    .line 484
    goto :goto_c

    .line 485
    :cond_18
    move/from16 v14, v24

    .line 486
    .line 487
    :goto_c
    iput-boolean v14, v10, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世兰哲苏:Z

    .line 488
    .line 489
    if-eqz v14, :cond_1a

    .line 490
    .line 491
    const/4 v14, 0x1

    .line 492
    iput v14, v10, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏哲兰:I

    .line 493
    .line 494
    move/from16 v18, v14

    .line 495
    .line 496
    aget v14, v9, v24

    .line 497
    .line 498
    int-to-float v14, v14

    .line 499
    iput v14, v10, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世哲苏兰:F

    .line 500
    .line 501
    add-int/lit8 v13, v13, -0x1

    .line 502
    .line 503
    aget v9, v9, v13

    .line 504
    .line 505
    int-to-float v9, v9

    .line 506
    iput v9, v10, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世哲兰苏:F

    .line 507
    .line 508
    iput v5, v10, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏兰哲:F

    .line 509
    .line 510
    goto :goto_d

    .line 511
    :cond_19
    move/from16 v24, v9

    .line 512
    .line 513
    :cond_1a
    :goto_d
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 514
    .line 515
    .line 516
    goto :goto_e

    .line 517
    :cond_1b
    move/from16 v24, v9

    .line 518
    .line 519
    goto :goto_e

    .line 520
    :cond_1c
    move/from16 v24, v9

    .line 521
    .line 522
    move/from16 v20, v14

    .line 523
    .line 524
    :goto_e
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v10}, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏兰哲()Z

    .line 528
    .line 529
    .line 530
    move-result v1

    .line 531
    if-eqz v1, :cond_26

    .line 532
    .line 533
    iget v1, v10, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏哲兰:I

    .line 534
    .line 535
    const/4 v14, 0x1

    .line 536
    if-ne v1, v14, :cond_27

    .line 537
    .line 538
    iget-boolean v1, v10, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世兰哲苏:Z

    .line 539
    .line 540
    if-nez v1, :cond_23

    .line 541
    .line 542
    invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 543
    .line 544
    .line 545
    move-result-object v1

    .line 546
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 547
    .line 548
    .line 549
    move-result-object v1

    .line 550
    cmpl-float v4, v15, v5

    .line 551
    .line 552
    if-nez v4, :cond_1d

    .line 553
    .line 554
    const/high16 v4, 0x41400000    # 12.0f

    .line 555
    .line 556
    const/4 v9, 0x2

    .line 557
    invoke-static {v9, v4, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 558
    .line 559
    .line 560
    move-result v15

    .line 561
    goto :goto_f

    .line 562
    :cond_1d
    const/4 v9, 0x2

    .line 563
    :goto_f
    cmpl-float v4, v17, v5

    .line 564
    .line 565
    if-nez v4, :cond_1e

    .line 566
    .line 567
    const/high16 v4, 0x42e00000    # 112.0f

    .line 568
    .line 569
    invoke-static {v9, v4, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 570
    .line 571
    .line 572
    move-result v17

    .line 573
    :cond_1e
    move/from16 v1, v17

    .line 574
    .line 575
    cmpl-float v4, v0, v5

    .line 576
    .line 577
    if-nez v4, :cond_1f

    .line 578
    .line 579
    const/high16 v0, 0x3f800000    # 1.0f

    .line 580
    .line 581
    :cond_1f
    cmpg-float v4, v15, v20

    .line 582
    .line 583
    const-string v9, "px) is less or equal to (0px)"

    .line 584
    .line 585
    if-lez v4, :cond_22

    .line 586
    .line 587
    cmpg-float v4, v1, v15

    .line 588
    .line 589
    if-lez v4, :cond_21

    .line 590
    .line 591
    cmpg-float v4, v0, v20

    .line 592
    .line 593
    if-lez v4, :cond_20

    .line 594
    .line 595
    const/4 v14, 0x1

    .line 596
    iput v14, v10, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏哲兰:I

    .line 597
    .line 598
    iput v15, v10, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世哲苏兰:F

    .line 599
    .line 600
    iput v1, v10, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世哲兰苏:F

    .line 601
    .line 602
    iput v0, v10, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏兰哲:F

    .line 603
    .line 604
    move/from16 v0, v24

    .line 605
    .line 606
    iput-boolean v0, v10, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世兰哲苏:Z

    .line 607
    .line 608
    goto :goto_10

    .line 609
    :cond_20
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 610
    .line 611
    new-instance v2, Ljava/lang/StringBuilder;

    .line 612
    .line 613
    const-string v3, "The auto-size step granularity ("

    .line 614
    .line 615
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 616
    .line 617
    .line 618
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 622
    .line 623
    .line 624
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 629
    .line 630
    .line 631
    throw v1

    .line 632
    :cond_21
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 633
    .line 634
    new-instance v2, Ljava/lang/StringBuilder;

    .line 635
    .line 636
    const-string v3, "Maximum auto-size text size ("

    .line 637
    .line 638
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 639
    .line 640
    .line 641
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 642
    .line 643
    .line 644
    const-string v1, "px) is less or equal to minimum auto-size text size ("

    .line 645
    .line 646
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 647
    .line 648
    .line 649
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 650
    .line 651
    .line 652
    const-string v1, "px)"

    .line 653
    .line 654
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 655
    .line 656
    .line 657
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v1

    .line 661
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 662
    .line 663
    .line 664
    throw v0

    .line 665
    :cond_22
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 666
    .line 667
    new-instance v1, Ljava/lang/StringBuilder;

    .line 668
    .line 669
    const-string v2, "Minimum auto-size text size ("

    .line 670
    .line 671
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 672
    .line 673
    .line 674
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 678
    .line 679
    .line 680
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object v1

    .line 684
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 685
    .line 686
    .line 687
    throw v0

    .line 688
    :cond_23
    :goto_10
    invoke-virtual {v10}, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏兰哲()Z

    .line 689
    .line 690
    .line 691
    move-result v0

    .line 692
    if-eqz v0, :cond_27

    .line 693
    .line 694
    iget v0, v10, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏哲兰:I

    .line 695
    .line 696
    const/4 v14, 0x1

    .line 697
    if-ne v0, v14, :cond_27

    .line 698
    .line 699
    iget-boolean v0, v10, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世兰哲苏:Z

    .line 700
    .line 701
    if-eqz v0, :cond_24

    .line 702
    .line 703
    iget-object v0, v10, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世兰苏哲:[I

    .line 704
    .line 705
    array-length v0, v0

    .line 706
    if-nez v0, :cond_27

    .line 707
    .line 708
    :cond_24
    iget v0, v10, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世哲兰苏:F

    .line 709
    .line 710
    iget v1, v10, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世哲苏兰:F

    .line 711
    .line 712
    sub-float/2addr v0, v1

    .line 713
    iget v1, v10, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏兰哲:F

    .line 714
    .line 715
    div-float/2addr v0, v1

    .line 716
    float-to-double v0, v0

    .line 717
    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    .line 718
    .line 719
    .line 720
    move-result-wide v0

    .line 721
    double-to-int v0, v0

    .line 722
    const/16 v18, 0x1

    .line 723
    .line 724
    add-int/lit8 v0, v0, 0x1

    .line 725
    .line 726
    new-array v1, v0, [I

    .line 727
    .line 728
    const/4 v4, 0x0

    .line 729
    :goto_11
    if-ge v4, v0, :cond_25

    .line 730
    .line 731
    iget v9, v10, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世哲苏兰:F

    .line 732
    .line 733
    int-to-float v12, v4

    .line 734
    iget v13, v10, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏兰哲:F

    .line 735
    .line 736
    mul-float/2addr v12, v13

    .line 737
    add-float/2addr v12, v9

    .line 738
    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    .line 739
    .line 740
    .line 741
    move-result v9

    .line 742
    aput v9, v1, v4

    .line 743
    .line 744
    add-int/lit8 v4, v4, 0x1

    .line 745
    .line 746
    goto :goto_11

    .line 747
    :cond_25
    invoke-static {v1}, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏哲兰([I)[I

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    iput-object v0, v10, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世兰苏哲:[I

    .line 752
    .line 753
    goto :goto_12

    .line 754
    :cond_26
    move/from16 v0, v24

    .line 755
    .line 756
    iput v0, v10, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏哲兰:I

    .line 757
    .line 758
    :cond_27
    :goto_12
    iget v0, v10, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏哲兰:I

    .line 759
    .line 760
    if-eqz v0, :cond_29

    .line 761
    .line 762
    iget-object v0, v10, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世兰苏哲:[I

    .line 763
    .line 764
    array-length v1, v0

    .line 765
    if-lez v1, :cond_29

    .line 766
    .line 767
    invoke-static {v6}, Landroidx/appcompat/widget/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰(Landroid/widget/TextView;)I

    .line 768
    .line 769
    .line 770
    move-result v1

    .line 771
    int-to-float v1, v1

    .line 772
    cmpl-float v1, v1, v5

    .line 773
    .line 774
    if-eqz v1, :cond_28

    .line 775
    .line 776
    iget v0, v10, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世哲苏兰:F

    .line 777
    .line 778
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 779
    .line 780
    .line 781
    move-result v0

    .line 782
    iget v1, v10, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世哲兰苏:F

    .line 783
    .line 784
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 785
    .line 786
    .line 787
    move-result v1

    .line 788
    iget v4, v10, Landroidx/appcompat/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏兰哲:F

    .line 789
    .line 790
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 791
    .line 792
    .line 793
    move-result v4

    .line 794
    const/4 v9, 0x0

    .line 795
    invoke-static {v6, v0, v1, v4, v9}, Landroidx/appcompat/widget/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏兰哲(Landroid/widget/TextView;IIII)V

    .line 796
    .line 797
    .line 798
    goto :goto_13

    .line 799
    :cond_28
    const/4 v9, 0x0

    .line 800
    invoke-static {v6, v0, v9}, Landroidx/appcompat/widget/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世哲苏兰(Landroid/widget/TextView;[II)V

    .line 801
    .line 802
    .line 803
    :cond_29
    :goto_13
    invoke-virtual {v7, v3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 804
    .line 805
    .line 806
    move-result-object v0

    .line 807
    const/16 v1, 0x8

    .line 808
    .line 809
    invoke-virtual {v0, v1, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 810
    .line 811
    .line 812
    move-result v1

    .line 813
    if-eq v1, v11, :cond_2a

    .line 814
    .line 815
    invoke-virtual {v8, v7, v1}, Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 816
    .line 817
    .line 818
    move-result-object v1

    .line 819
    :goto_14
    const/16 v2, 0xd

    .line 820
    .line 821
    goto :goto_15

    .line 822
    :cond_2a
    const/4 v1, 0x0

    .line 823
    goto :goto_14

    .line 824
    :goto_15
    invoke-virtual {v0, v2, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 825
    .line 826
    .line 827
    move-result v2

    .line 828
    if-eq v2, v11, :cond_2b

    .line 829
    .line 830
    invoke-virtual {v8, v7, v2}, Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 831
    .line 832
    .line 833
    move-result-object v2

    .line 834
    goto :goto_16

    .line 835
    :cond_2b
    const/4 v2, 0x0

    .line 836
    :goto_16
    const/16 v3, 0x9

    .line 837
    .line 838
    invoke-virtual {v0, v3, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 839
    .line 840
    .line 841
    move-result v3

    .line 842
    if-eq v3, v11, :cond_2c

    .line 843
    .line 844
    invoke-virtual {v8, v7, v3}, Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 845
    .line 846
    .line 847
    move-result-object v3

    .line 848
    :goto_17
    const/4 v4, 0x6

    .line 849
    goto :goto_18

    .line 850
    :cond_2c
    const/4 v3, 0x0

    .line 851
    goto :goto_17

    .line 852
    :goto_18
    invoke-virtual {v0, v4, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 853
    .line 854
    .line 855
    move-result v4

    .line 856
    if-eq v4, v11, :cond_2d

    .line 857
    .line 858
    invoke-virtual {v8, v7, v4}, Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 859
    .line 860
    .line 861
    move-result-object v4

    .line 862
    goto :goto_19

    .line 863
    :cond_2d
    const/4 v4, 0x0

    .line 864
    :goto_19
    const/16 v9, 0xa

    .line 865
    .line 866
    invoke-virtual {v0, v9, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 867
    .line 868
    .line 869
    move-result v9

    .line 870
    if-eq v9, v11, :cond_2e

    .line 871
    .line 872
    invoke-virtual {v8, v7, v9}, Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 873
    .line 874
    .line 875
    move-result-object v9

    .line 876
    goto :goto_1a

    .line 877
    :cond_2e
    const/4 v9, 0x0

    .line 878
    :goto_1a
    const/4 v10, 0x7

    .line 879
    invoke-virtual {v0, v10, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 880
    .line 881
    .line 882
    move-result v10

    .line 883
    if-eq v10, v11, :cond_2f

    .line 884
    .line 885
    invoke-virtual {v8, v7, v10}, Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 886
    .line 887
    .line 888
    move-result-object v8

    .line 889
    goto :goto_1b

    .line 890
    :cond_2f
    const/4 v8, 0x0

    .line 891
    :goto_1b
    if-nez v9, :cond_3a

    .line 892
    .line 893
    if-eqz v8, :cond_30

    .line 894
    .line 895
    goto :goto_24

    .line 896
    :cond_30
    if-nez v1, :cond_31

    .line 897
    .line 898
    if-nez v2, :cond_31

    .line 899
    .line 900
    if-nez v3, :cond_31

    .line 901
    .line 902
    if-eqz v4, :cond_3f

    .line 903
    .line 904
    :cond_31
    invoke-virtual {v6}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 905
    .line 906
    .line 907
    move-result-object v8

    .line 908
    const/16 v24, 0x0

    .line 909
    .line 910
    aget-object v9, v8, v24

    .line 911
    .line 912
    if-nez v9, :cond_32

    .line 913
    .line 914
    const/16 v19, 0x2

    .line 915
    .line 916
    aget-object v10, v8, v19

    .line 917
    .line 918
    if-eqz v10, :cond_33

    .line 919
    .line 920
    :cond_32
    const/16 v16, 0x3

    .line 921
    .line 922
    goto :goto_20

    .line 923
    :cond_33
    invoke-virtual {v6}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    .line 924
    .line 925
    .line 926
    move-result-object v8

    .line 927
    if-eqz v1, :cond_34

    .line 928
    .line 929
    goto :goto_1c

    .line 930
    :cond_34
    aget-object v1, v8, v24

    .line 931
    .line 932
    :goto_1c
    if-eqz v2, :cond_35

    .line 933
    .line 934
    goto :goto_1d

    .line 935
    :cond_35
    const/16 v18, 0x1

    .line 936
    .line 937
    aget-object v2, v8, v18

    .line 938
    .line 939
    :goto_1d
    if-eqz v3, :cond_36

    .line 940
    .line 941
    goto :goto_1e

    .line 942
    :cond_36
    const/16 v19, 0x2

    .line 943
    .line 944
    aget-object v3, v8, v19

    .line 945
    .line 946
    :goto_1e
    if-eqz v4, :cond_37

    .line 947
    .line 948
    goto :goto_1f

    .line 949
    :cond_37
    const/16 v16, 0x3

    .line 950
    .line 951
    aget-object v4, v8, v16

    .line 952
    .line 953
    :goto_1f
    invoke-virtual {v6, v1, v2, v3, v4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 954
    .line 955
    .line 956
    goto :goto_29

    .line 957
    :goto_20
    if-eqz v2, :cond_38

    .line 958
    .line 959
    goto :goto_21

    .line 960
    :cond_38
    const/16 v18, 0x1

    .line 961
    .line 962
    aget-object v2, v8, v18

    .line 963
    .line 964
    :goto_21
    if-eqz v4, :cond_39

    .line 965
    .line 966
    :goto_22
    const/16 v19, 0x2

    .line 967
    .line 968
    goto :goto_23

    .line 969
    :cond_39
    aget-object v4, v8, v16

    .line 970
    .line 971
    goto :goto_22

    .line 972
    :goto_23
    aget-object v1, v8, v19

    .line 973
    .line 974
    invoke-virtual {v6, v9, v2, v1, v4}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 975
    .line 976
    .line 977
    goto :goto_29

    .line 978
    :cond_3a
    :goto_24
    invoke-virtual {v6}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 979
    .line 980
    .line 981
    move-result-object v1

    .line 982
    if-eqz v9, :cond_3b

    .line 983
    .line 984
    goto :goto_25

    .line 985
    :cond_3b
    const/16 v24, 0x0

    .line 986
    .line 987
    aget-object v9, v1, v24

    .line 988
    .line 989
    :goto_25
    if-eqz v2, :cond_3c

    .line 990
    .line 991
    goto :goto_26

    .line 992
    :cond_3c
    const/16 v18, 0x1

    .line 993
    .line 994
    aget-object v2, v1, v18

    .line 995
    .line 996
    :goto_26
    if-eqz v8, :cond_3d

    .line 997
    .line 998
    goto :goto_27

    .line 999
    :cond_3d
    const/16 v19, 0x2

    .line 1000
    .line 1001
    aget-object v8, v1, v19

    .line 1002
    .line 1003
    :goto_27
    if-eqz v4, :cond_3e

    .line 1004
    .line 1005
    goto :goto_28

    .line 1006
    :cond_3e
    const/16 v16, 0x3

    .line 1007
    .line 1008
    aget-object v4, v1, v16

    .line 1009
    .line 1010
    :goto_28
    invoke-virtual {v6, v9, v2, v8, v4}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 1011
    .line 1012
    .line 1013
    :cond_3f
    :goto_29
    const/16 v1, 0xb

    .line 1014
    .line 1015
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 1016
    .line 1017
    .line 1018
    move-result v2

    .line 1019
    if-eqz v2, :cond_41

    .line 1020
    .line 1021
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 1022
    .line 1023
    .line 1024
    move-result v2

    .line 1025
    if-eqz v2, :cond_40

    .line 1026
    .line 1027
    const/4 v9, 0x0

    .line 1028
    invoke-virtual {v0, v1, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 1029
    .line 1030
    .line 1031
    move-result v2

    .line 1032
    if-eqz v2, :cond_40

    .line 1033
    .line 1034
    invoke-static {v7, v2}, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v2

    .line 1038
    if-eqz v2, :cond_40

    .line 1039
    .line 1040
    goto :goto_2a

    .line 1041
    :cond_40
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v2

    .line 1045
    :goto_2a
    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setCompoundDrawableTintList(Landroid/content/res/ColorStateList;)V

    .line 1046
    .line 1047
    .line 1048
    :cond_41
    const/16 v1, 0xc

    .line 1049
    .line 1050
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 1051
    .line 1052
    .line 1053
    move-result v2

    .line 1054
    if-eqz v2, :cond_42

    .line 1055
    .line 1056
    invoke-virtual {v0, v1, v11}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 1057
    .line 1058
    .line 1059
    move-result v1

    .line 1060
    const/4 v2, 0x0

    .line 1061
    invoke-static {v1, v2}, Landroidx/appcompat/widget/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏兰哲(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v1

    .line 1065
    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setCompoundDrawableTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 1066
    .line 1067
    .line 1068
    :cond_42
    const/16 v1, 0xf

    .line 1069
    .line 1070
    invoke-virtual {v0, v1, v11}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 1071
    .line 1072
    .line 1073
    move-result v1

    .line 1074
    const/16 v2, 0x12

    .line 1075
    .line 1076
    invoke-virtual {v0, v2, v11}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 1077
    .line 1078
    .line 1079
    move-result v2

    .line 1080
    const/16 v3, 0x13

    .line 1081
    .line 1082
    invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 1083
    .line 1084
    .line 1085
    move-result v4

    .line 1086
    if-eqz v4, :cond_44

    .line 1087
    .line 1088
    invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v4

    .line 1092
    if-eqz v4, :cond_43

    .line 1093
    .line 1094
    iget v7, v4, Landroid/util/TypedValue;->type:I

    .line 1095
    .line 1096
    const/4 v13, 0x5

    .line 1097
    if-ne v7, v13, :cond_43

    .line 1098
    .line 1099
    iget v3, v4, Landroid/util/TypedValue;->data:I

    .line 1100
    .line 1101
    and-int/lit8 v4, v3, 0xf

    .line 1102
    .line 1103
    invoke-static {v3}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 1104
    .line 1105
    .line 1106
    move-result v3

    .line 1107
    goto :goto_2c

    .line 1108
    :cond_43
    invoke-virtual {v0, v3, v11}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 1109
    .line 1110
    .line 1111
    move-result v3

    .line 1112
    int-to-float v3, v3

    .line 1113
    :goto_2b
    move v4, v11

    .line 1114
    goto :goto_2c

    .line 1115
    :cond_44
    move v3, v5

    .line 1116
    goto :goto_2b

    .line 1117
    :goto_2c
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 1118
    .line 1119
    .line 1120
    if-eq v1, v11, :cond_45

    .line 1121
    .line 1122
    invoke-static {v6, v1}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏楪兰哲(Landroid/widget/TextView;I)V

    .line 1123
    .line 1124
    .line 1125
    :cond_45
    if-eq v2, v11, :cond_46

    .line 1126
    .line 1127
    invoke-static {v6, v2}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏哲楪兰(Landroid/widget/TextView;I)V

    .line 1128
    .line 1129
    .line 1130
    :cond_46
    cmpl-float v0, v3, v5

    .line 1131
    .line 1132
    if-eqz v0, :cond_49

    .line 1133
    .line 1134
    if-ne v4, v11, :cond_47

    .line 1135
    .line 1136
    float-to-int v0, v3

    .line 1137
    invoke-static {v6, v0}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏哲兰楪(Landroid/widget/TextView;I)V

    .line 1138
    .line 1139
    .line 1140
    return-void

    .line 1141
    :cond_47
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1142
    .line 1143
    const/16 v1, 0x22

    .line 1144
    .line 1145
    if-lt v0, v1, :cond_48

    .line 1146
    .line 1147
    invoke-static {v6, v4, v3}, Landroidx/core/widget/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Landroid/widget/TextView;IF)V

    .line 1148
    .line 1149
    .line 1150
    return-void

    .line 1151
    :cond_48
    invoke-virtual {v6}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v0

    .line 1155
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v0

    .line 1159
    invoke-static {v4, v3, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 1160
    .line 1161
    .line 1162
    move-result v0

    .line 1163
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 1164
    .line 1165
    .line 1166
    move-result v0

    .line 1167
    invoke-static {v6, v0}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏哲兰楪(Landroid/widget/TextView;I)V

    .line 1168
    .line 1169
    .line 1170
    :cond_49
    return-void
.end method

.method public final 飘花落叶言子楪世兰苏哲()Landroid/graphics/PorterDuff$Mode;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏世兰哲:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;->飘花落叶言子楪世哲兰苏:Ljava/io/Serializable;

    .line 6
    .line 7
    check-cast p0, Landroid/graphics/PorterDuff$Mode;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲兰苏()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏世兰哲:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲()V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏兰哲:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰:Landroid/widget/TextView;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲兰苏:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世兰苏哲:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    :cond_0
    invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    aget-object v4, v0, v2

    .line 26
    .line 27
    iget-object v5, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏兰哲:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 28
    .line 29
    invoke-virtual {p0, v4, v5}, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰(Landroid/graphics/drawable/Drawable;Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;)V

    .line 30
    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    aget-object v4, v0, v4

    .line 34
    .line 35
    iget-object v5, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 36
    .line 37
    invoke-virtual {p0, v4, v5}, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰(Landroid/graphics/drawable/Drawable;Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;)V

    .line 38
    .line 39
    .line 40
    aget-object v4, v0, v1

    .line 41
    .line 42
    iget-object v5, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲兰苏:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 43
    .line 44
    invoke-virtual {p0, v4, v5}, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰(Landroid/graphics/drawable/Drawable;Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;)V

    .line 45
    .line 46
    .line 47
    const/4 v4, 0x3

    .line 48
    aget-object v0, v0, v4

    .line 49
    .line 50
    iget-object v4, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世兰苏哲:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 51
    .line 52
    invoke-virtual {p0, v0, v4}, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰(Landroid/graphics/drawable/Drawable;Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    iget-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世兰哲苏:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 56
    .line 57
    if-nez v0, :cond_3

    .line 58
    .line 59
    iget-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏世哲兰:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    return-void

    .line 65
    :cond_3
    :goto_0
    invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    aget-object v2, v0, v2

    .line 70
    .line 71
    iget-object v3, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世兰哲苏:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 72
    .line 73
    invoke-virtual {p0, v2, v3}, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰(Landroid/graphics/drawable/Drawable;Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;)V

    .line 74
    .line 75
    .line 76
    aget-object v0, v0, v1

    .line 77
    .line 78
    iget-object v1, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏世哲兰:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 79
    .line 80
    invoke-virtual {p0, v0, v1}, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰(Landroid/graphics/drawable/Drawable;Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroid/graphics/drawable/Drawable;Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p1, p2, p0}, Landroidx/appcompat/widget/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世兰苏哲(Landroid/graphics/drawable/Drawable;Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;[I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪苏世兰哲(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏世兰哲:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏世兰哲:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏世兰哲:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 13
    .line 14
    iput-object p1, v0, Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    :goto_0
    iput-boolean p1, v0, Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;->飘花落叶言子楪世苏兰哲:Z

    .line 22
    .line 23
    iput-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏兰哲:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 24
    .line 25
    iput-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 26
    .line 27
    iput-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲兰苏:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 28
    .line 29
    iput-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世兰苏哲:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 30
    .line 31
    iput-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世兰哲苏:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 32
    .line 33
    iput-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏世哲兰:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 34
    .line 35
    return-void
.end method

.method public final 飘花落叶言子楪苏世哲兰(Landroid/content/Context;I)V
    .locals 5

    .line 1
    new-instance v0, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 2
    .line 3
    sget-object v1, L飘花落叶言子楪苏世兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏哲世:[I

    .line 4
    .line 5
    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-direct {v0, p1, p2}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0xe

    .line 13
    .line 14
    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    iget-object v3, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰:Landroid/widget/TextView;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {p2, v1, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {p2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    const/4 v1, -0x1

    .line 37
    invoke-virtual {p2, v4, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-virtual {v3, v4, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲兰世(Landroid/content/Context;Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;)V

    .line 48
    .line 49
    .line 50
    const/16 p1, 0xd

    .line 51
    .line 52
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-eqz p1, :cond_2

    .line 63
    .line 64
    invoke-static {v3, p1}, Landroidx/appcompat/widget/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世哲兰苏(Landroid/widget/TextView;Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    :cond_2
    invoke-virtual {v0}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世哲楪苏兰()V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰哲世:Landroid/graphics/Typeface;

    .line 71
    .line 72
    if-eqz p1, :cond_3

    .line 73
    .line 74
    iget p0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲兰世:I

    .line 75
    .line 76
    invoke-virtual {v3, p1, p0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 77
    .line 78
    .line 79
    :cond_3
    return-void
.end method

.method public final 飘花落叶言子楪苏哲世兰(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏世兰哲:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏世兰哲:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏世兰哲:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 13
    .line 14
    iput-object p1, v0, Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;->飘花落叶言子楪世哲兰苏:Ljava/io/Serializable;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    :goto_0
    iput-boolean p1, v0, Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 22
    .line 23
    iput-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏兰哲:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 24
    .line 25
    iput-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 26
    .line 27
    iput-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲兰苏:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 28
    .line 29
    iput-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世兰苏哲:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 30
    .line 31
    iput-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世兰哲苏:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 32
    .line 33
    iput-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏世哲兰:Landroidx/appcompat/widget/飘花落叶言子兰世楪哲苏;

    .line 34
    .line 35
    return-void
.end method

.method public final 飘花落叶言子楪苏哲兰世(Landroid/content/Context;Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;)V
    .locals 11

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲兰世:I

    .line 2
    .line 3
    iget-object v1, p2, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/content/res/TypedArray;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iput v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲兰世:I

    .line 13
    .line 14
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 15
    .line 16
    const/4 v3, -0x1

    .line 17
    const/16 v4, 0x1c

    .line 18
    .line 19
    if-lt v0, v4, :cond_0

    .line 20
    .line 21
    const/16 v5, 0xb

    .line 22
    .line 23
    invoke-virtual {v1, v5, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    iput v5, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰世哲:I

    .line 28
    .line 29
    if-eq v5, v3, :cond_0

    .line 30
    .line 31
    iget v5, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲兰世:I

    .line 32
    .line 33
    and-int/2addr v5, v2

    .line 34
    iput v5, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲兰世:I

    .line 35
    .line 36
    :cond_0
    const/16 v5, 0xa

    .line 37
    .line 38
    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    const/16 v7, 0xc

    .line 43
    .line 44
    const/4 v8, 0x0

    .line 45
    const/4 v9, 0x1

    .line 46
    if-nez v6, :cond_5

    .line 47
    .line 48
    invoke-virtual {v1, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {v1, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_e

    .line 60
    .line 61
    iput-boolean v8, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲世苏兰:Z

    .line 62
    .line 63
    invoke-virtual {v1, v9, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eq p1, v9, :cond_4

    .line 68
    .line 69
    if-eq p1, v2, :cond_3

    .line 70
    .line 71
    const/4 p2, 0x3

    .line 72
    if-eq p1, p2, :cond_2

    .line 73
    .line 74
    goto/16 :goto_4

    .line 75
    .line 76
    :cond_2
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    .line 77
    .line 78
    iput-object p1, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰哲世:Landroid/graphics/Typeface;

    .line 79
    .line 80
    return-void

    .line 81
    :cond_3
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    .line 82
    .line 83
    iput-object p1, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰哲世:Landroid/graphics/Typeface;

    .line 84
    .line 85
    return-void

    .line 86
    :cond_4
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    .line 87
    .line 88
    iput-object p1, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰哲世:Landroid/graphics/Typeface;

    .line 89
    .line 90
    return-void

    .line 91
    :cond_5
    :goto_0
    const/4 v6, 0x0

    .line 92
    iput-object v6, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰哲世:Landroid/graphics/Typeface;

    .line 93
    .line 94
    invoke-virtual {v1, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    if-eqz v6, :cond_6

    .line 99
    .line 100
    move v5, v7

    .line 101
    :cond_6
    iget v6, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰世哲:I

    .line 102
    .line 103
    iget v7, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲兰世:I

    .line 104
    .line 105
    invoke-virtual {p1}, Landroid/content/Context;->isRestricted()Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-nez p1, :cond_b

    .line 110
    .line 111
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 112
    .line 113
    iget-object v10, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰:Landroid/widget/TextView;

    .line 114
    .line 115
    invoke-direct {p1, v10}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    new-instance v10, Landroidx/appcompat/widget/飘花落叶言子苏楪哲兰世;

    .line 119
    .line 120
    invoke-direct {v10, p0, v6, v7, p1}, Landroidx/appcompat/widget/飘花落叶言子苏楪哲兰世;-><init>(Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;IILjava/lang/ref/WeakReference;)V

    .line 121
    .line 122
    .line 123
    :try_start_0
    iget p1, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲兰世:I

    .line 124
    .line 125
    invoke-virtual {p2, v5, p1, v10}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪兰哲苏世(IILandroidx/appcompat/widget/飘花落叶言子苏楪哲兰世;)Landroid/graphics/Typeface;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    if-eqz p1, :cond_9

    .line 130
    .line 131
    if-lt v0, v4, :cond_8

    .line 132
    .line 133
    iget p2, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰世哲:I

    .line 134
    .line 135
    if-eq p2, v3, :cond_8

    .line 136
    .line 137
    invoke-static {p1, v8}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iget p2, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰世哲:I

    .line 142
    .line 143
    iget v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲兰世:I

    .line 144
    .line 145
    and-int/2addr v0, v2

    .line 146
    if-eqz v0, :cond_7

    .line 147
    .line 148
    move v0, v9

    .line 149
    goto :goto_1

    .line 150
    :cond_7
    move v0, v8

    .line 151
    :goto_1
    invoke-static {p1, p2, v0}, Landroidx/appcompat/widget/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    iput-object p1, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰哲世:Landroid/graphics/Typeface;

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_8
    iput-object p1, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰哲世:Landroid/graphics/Typeface;

    .line 159
    .line 160
    :cond_9
    :goto_2
    iget-object p1, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰哲世:Landroid/graphics/Typeface;

    .line 161
    .line 162
    if-nez p1, :cond_a

    .line 163
    .line 164
    move p1, v9

    .line 165
    goto :goto_3

    .line 166
    :cond_a
    move p1, v8

    .line 167
    :goto_3
    iput-boolean p1, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲世苏兰:Z
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 168
    .line 169
    :catch_0
    :cond_b
    iget-object p1, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰哲世:Landroid/graphics/Typeface;

    .line 170
    .line 171
    if-nez p1, :cond_e

    .line 172
    .line 173
    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    if-eqz p1, :cond_e

    .line 178
    .line 179
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 180
    .line 181
    if-lt p2, v4, :cond_d

    .line 182
    .line 183
    iget p2, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰世哲:I

    .line 184
    .line 185
    if-eq p2, v3, :cond_d

    .line 186
    .line 187
    invoke-static {p1, v8}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    iget p2, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰世哲:I

    .line 192
    .line 193
    iget v0, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲兰世:I

    .line 194
    .line 195
    and-int/2addr v0, v2

    .line 196
    if-eqz v0, :cond_c

    .line 197
    .line 198
    move v8, v9

    .line 199
    :cond_c
    invoke-static {p1, p2, v8}, Landroidx/appcompat/widget/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    iput-object p1, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰哲世:Landroid/graphics/Typeface;

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_d
    iget p2, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲兰世:I

    .line 207
    .line 208
    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    iput-object p1, p0, Landroidx/appcompat/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏兰哲世:Landroid/graphics/Typeface;

    .line 213
    .line 214
    :cond_e
    :goto_4
    return-void
.end method
