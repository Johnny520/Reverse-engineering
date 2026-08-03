.class public final synthetic Lya/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:F

.field public final synthetic h:F

.field public final synthetic i:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Lya/g;FFLjava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lya/d;->g:F

    .line 5
    .line 6
    iput p3, p0, Lya/d;->h:F

    .line 7
    .line 8
    iput-object p4, p0, Lya/d;->i:Ljava/util/ArrayList;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    check-cast p1, Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->isShown()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_9

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto/16 :goto_3

    .line 19
    .line 20
    :cond_0
    sget-object v0, Lya/g;->e:Log/k;

    .line 21
    .line 22
    invoke-static {p1}, Luf/d;->e(Landroid/view/View;)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-static {p1}, Luf/d;->d(Landroid/view/View;)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-lez v0, :cond_9

    .line 31
    .line 32
    if-gtz v1, :cond_1

    .line 33
    .line 34
    goto/16 :goto_3

    .line 35
    .line 36
    :cond_1
    instance-of v2, p1, Landroid/widget/TextView;

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    move-object v2, p1

    .line 42
    check-cast v2, Landroid/widget/TextView;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    move-object v2, v3

    .line 46
    :goto_0
    if-eqz v2, :cond_3

    .line 47
    .line 48
    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    if-eqz v4, :cond_3

    .line 53
    .line 54
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    if-eqz v4, :cond_3

    .line 59
    .line 60
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    :cond_3
    if-nez v3, :cond_4

    .line 69
    .line 70
    const-string v3, ""

    .line 71
    .line 72
    :cond_4
    const/4 v4, 0x1

    .line 73
    const/4 v5, 0x0

    .line 74
    if-eqz v2, :cond_5

    .line 75
    .line 76
    sget-object v6, Lya/g;->e:Log/k;

    .line 77
    .line 78
    invoke-virtual {v6, v3}, Log/k;->d(Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-eqz v6, :cond_5

    .line 83
    .line 84
    move v6, v4

    .line 85
    goto :goto_1

    .line 86
    :cond_5
    move v6, v5

    .line 87
    :goto_1
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-nez v3, :cond_6

    .line 92
    .line 93
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    if-eqz v3, :cond_6

    .line 98
    .line 99
    const/high16 v3, 0x40800000    # 4.0f

    .line 100
    .line 101
    invoke-static {p1, v3}, Luf/d;->b(Landroid/view/View;F)I

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    const/high16 v8, 0x41c00000    # 24.0f

    .line 106
    .line 107
    invoke-static {p1, v8}, Luf/d;->b(Landroid/view/View;F)I

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    if-gt v0, v9, :cond_6

    .line 112
    .line 113
    if-gt v7, v0, :cond_6

    .line 114
    .line 115
    invoke-static {p1, v3}, Luf/d;->b(Landroid/view/View;F)I

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    invoke-static {p1, v8}, Luf/d;->b(Landroid/view/View;F)I

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    if-gt v1, v7, :cond_6

    .line 124
    .line 125
    if-gt v3, v1, :cond_6

    .line 126
    .line 127
    mul-int/lit8 v3, v1, 0x2

    .line 128
    .line 129
    if-gt v0, v3, :cond_6

    .line 130
    .line 131
    mul-int/lit8 v3, v0, 0x2

    .line 132
    .line 133
    if-gt v1, v3, :cond_6

    .line 134
    .line 135
    move v3, v4

    .line 136
    goto :goto_2

    .line 137
    :cond_6
    move v3, v5

    .line 138
    :goto_2
    if-nez v6, :cond_7

    .line 139
    .line 140
    if-nez v3, :cond_7

    .line 141
    .line 142
    goto/16 :goto_3

    .line 143
    .line 144
    :cond_7
    if-eqz v6, :cond_8

    .line 145
    .line 146
    const/high16 v3, 0x40c00000    # 6.0f

    .line 147
    .line 148
    invoke-static {p1, v3}, Luf/d;->b(Landroid/view/View;F)I

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    const/high16 v7, 0x42900000    # 72.0f

    .line 153
    .line 154
    invoke-static {p1, v7}, Luf/d;->b(Landroid/view/View;F)I

    .line 155
    .line 156
    .line 157
    move-result v7

    .line 158
    if-gt v0, v7, :cond_9

    .line 159
    .line 160
    if-gt v6, v0, :cond_9

    .line 161
    .line 162
    invoke-static {p1, v3}, Luf/d;->b(Landroid/view/View;F)I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    const/high16 v3, 0x42100000    # 36.0f

    .line 167
    .line 168
    invoke-static {p1, v3}, Luf/d;->b(Landroid/view/View;F)I

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    if-gt v1, v3, :cond_9

    .line 173
    .line 174
    if-gt v0, v1, :cond_9

    .line 175
    .line 176
    invoke-virtual {v2}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    const/16 v2, 0xb4

    .line 185
    .line 186
    if-lt v1, v2, :cond_9

    .line 187
    .line 188
    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-lt v1, v2, :cond_9

    .line 193
    .line 194
    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-lt v0, v2, :cond_9

    .line 199
    .line 200
    :cond_8
    const/4 v0, 0x2

    .line 201
    new-array v1, v0, [I

    .line 202
    .line 203
    invoke-virtual {p1, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 204
    .line 205
    .line 206
    const/high16 v2, 0x41e00000    # 28.0f

    .line 207
    .line 208
    invoke-static {p1, v2}, Luf/d;->b(Landroid/view/View;F)I

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    aget v3, v1, v5

    .line 213
    .line 214
    sub-int v6, v3, v2

    .line 215
    .line 216
    aget v7, v1, v4

    .line 217
    .line 218
    sub-int/2addr v7, v2

    .line 219
    invoke-static {p1}, Luf/d;->e(Landroid/view/View;)I

    .line 220
    .line 221
    .line 222
    move-result v8

    .line 223
    add-int/2addr v8, v3

    .line 224
    add-int/2addr v8, v2

    .line 225
    aget v1, v1, v4

    .line 226
    .line 227
    invoke-static {p1}, Luf/d;->d(Landroid/view/View;)I

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    add-int/2addr v3, v1

    .line 232
    add-int/2addr v3, v2

    .line 233
    int-to-float v1, v6

    .line 234
    iget v2, p0, Lya/d;->g:F

    .line 235
    .line 236
    cmpl-float v1, v2, v1

    .line 237
    .line 238
    if-ltz v1, :cond_9

    .line 239
    .line 240
    int-to-float v1, v8

    .line 241
    cmpg-float v1, v2, v1

    .line 242
    .line 243
    if-gtz v1, :cond_9

    .line 244
    .line 245
    int-to-float v1, v7

    .line 246
    iget v6, p0, Lya/d;->h:F

    .line 247
    .line 248
    cmpl-float v1, v6, v1

    .line 249
    .line 250
    if-ltz v1, :cond_9

    .line 251
    .line 252
    int-to-float v1, v3

    .line 253
    cmpg-float v1, v6, v1

    .line 254
    .line 255
    if-gtz v1, :cond_9

    .line 256
    .line 257
    invoke-static {p1}, Luf/d;->e(Landroid/view/View;)I

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    invoke-static {p1}, Luf/d;->d(Landroid/view/View;)I

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    new-array v0, v0, [I

    .line 266
    .line 267
    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 268
    .line 269
    .line 270
    aget v5, v0, v5

    .line 271
    .line 272
    int-to-float v5, v5

    .line 273
    int-to-float v7, v1

    .line 274
    const/high16 v8, 0x40000000    # 2.0f

    .line 275
    .line 276
    div-float/2addr v7, v8

    .line 277
    add-float/2addr v7, v5

    .line 278
    sub-float/2addr v2, v7

    .line 279
    aget v0, v0, v4

    .line 280
    .line 281
    int-to-float v0, v0

    .line 282
    int-to-float v4, v3

    .line 283
    div-float/2addr v4, v8

    .line 284
    add-float/2addr v4, v0

    .line 285
    sub-float/2addr v6, v4

    .line 286
    mul-float/2addr v2, v2

    .line 287
    mul-float/2addr v6, v6

    .line 288
    add-float/2addr v6, v2

    .line 289
    mul-int/2addr v1, v3

    .line 290
    new-instance v0, Lya/e;

    .line 291
    .line 292
    invoke-direct {v0, p1, v6, v1}, Lya/e;-><init>(Landroid/view/View;FI)V

    .line 293
    .line 294
    .line 295
    iget-object p1, p0, Lya/d;->i:Ljava/util/ArrayList;

    .line 296
    .line 297
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    :cond_9
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 301
    .line 302
    return-object p1
.end method
