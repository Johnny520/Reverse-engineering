.class public final Lgc0;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# instance fields
.field public final a:Lkd;

.field public b:Lbd0;


# direct methods
.method public constructor <init>(Landroid/view/View;Lkd;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lgc0;->a:Lkd;

    .line 5
    .line 6
    sget-object p2, Loa0;->a:Ljava/util/WeakHashMap;

    .line 7
    .line 8
    invoke-static {p1}, Lea0;->a(Landroid/view/View;)Lbd0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_2

    .line 13
    .line 14
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 15
    .line 16
    const/16 v0, 0x1e

    .line 17
    .line 18
    if-lt p2, v0, :cond_0

    .line 19
    .line 20
    new-instance p2, Lqc0;

    .line 21
    .line 22
    invoke-direct {p2, p1}, Lqc0;-><init>(Lbd0;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/16 v0, 0x1d

    .line 27
    .line 28
    if-lt p2, v0, :cond_1

    .line 29
    .line 30
    new-instance p2, Lpc0;

    .line 31
    .line 32
    invoke-direct {p2, p1}, Lpc0;-><init>(Lbd0;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    new-instance p2, Lnc0;

    .line 37
    .line 38
    invoke-direct {p2, p1}, Lnc0;-><init>(Lbd0;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    invoke-virtual {p2}, Lrc0;->b()Lbd0;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    const/4 p1, 0x0

    .line 47
    :goto_1
    iput-object p1, p0, Lgc0;->b:Lbd0;

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    move-object/from16 v7, p2

    .line 6
    .line 7
    invoke-virtual {v6}, Landroid/view/View;->isLaidOut()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-static/range {p1 .. p2}, Lbd0;->g(Landroid/view/View;Landroid/view/WindowInsets;)Lbd0;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iput-object v1, v0, Lgc0;->b:Lbd0;

    .line 18
    .line 19
    invoke-static/range {p1 .. p2}, Lhc0;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    return-object v1

    .line 24
    :cond_0
    invoke-static/range {p1 .. p2}, Lbd0;->g(Landroid/view/View;Landroid/view/WindowInsets;)Lbd0;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    iget-object v1, v3, Lbd0;->a:Lyc0;

    .line 29
    .line 30
    iget-object v2, v0, Lgc0;->b:Lbd0;

    .line 31
    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    sget-object v2, Loa0;->a:Ljava/util/WeakHashMap;

    .line 35
    .line 36
    invoke-static {v6}, Lea0;->a(Landroid/view/View;)Lbd0;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iput-object v2, v0, Lgc0;->b:Lbd0;

    .line 41
    .line 42
    :cond_1
    iget-object v2, v0, Lgc0;->b:Lbd0;

    .line 43
    .line 44
    if-nez v2, :cond_2

    .line 45
    .line 46
    iput-object v3, v0, Lgc0;->b:Lbd0;

    .line 47
    .line 48
    invoke-static/range {p1 .. p2}, Lhc0;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    return-object v1

    .line 53
    :cond_2
    invoke-static {v6}, Lhc0;->j(Landroid/view/View;)Lkd;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    iget-object v2, v2, Lkd;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, Landroid/view/WindowInsets;

    .line 62
    .line 63
    invoke-static {v2, v7}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_3

    .line 68
    .line 69
    invoke-static/range {p1 .. p2}, Lhc0;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    return-object v1

    .line 74
    :cond_3
    iget-object v2, v0, Lgc0;->b:Lbd0;

    .line 75
    .line 76
    const/4 v5, 0x1

    .line 77
    const/4 v8, 0x0

    .line 78
    :goto_0
    const/16 v9, 0x100

    .line 79
    .line 80
    if-gt v5, v9, :cond_5

    .line 81
    .line 82
    invoke-virtual {v1, v5}, Lyc0;->f(I)Lip;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    iget-object v10, v2, Lbd0;->a:Lyc0;

    .line 87
    .line 88
    invoke-virtual {v10, v5}, Lyc0;->f(I)Lip;

    .line 89
    .line 90
    .line 91
    move-result-object v10

    .line 92
    invoke-virtual {v9, v10}, Lip;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    if-nez v9, :cond_4

    .line 97
    .line 98
    or-int/2addr v8, v5

    .line 99
    :cond_4
    shl-int/lit8 v5, v5, 0x1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_5
    if-nez v8, :cond_6

    .line 103
    .line 104
    invoke-static/range {p1 .. p2}, Lhc0;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    return-object v1

    .line 109
    :cond_6
    iget-object v2, v0, Lgc0;->b:Lbd0;

    .line 110
    .line 111
    new-instance v5, Llc0;

    .line 112
    .line 113
    new-instance v9, Landroid/view/animation/DecelerateInterpolator;

    .line 114
    .line 115
    invoke-direct {v9}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 116
    .line 117
    .line 118
    const-wide/16 v10, 0xa0

    .line 119
    .line 120
    invoke-direct {v5, v8, v9, v10, v11}, Llc0;-><init>(ILandroid/view/animation/DecelerateInterpolator;J)V

    .line 121
    .line 122
    .line 123
    iget-object v9, v5, Llc0;->a:Lkc0;

    .line 124
    .line 125
    const/4 v10, 0x0

    .line 126
    invoke-virtual {v9, v10}, Lkc0;->d(F)V

    .line 127
    .line 128
    .line 129
    const/4 v9, 0x2

    .line 130
    new-array v10, v9, [F

    .line 131
    .line 132
    fill-array-data v10, :array_0

    .line 133
    .line 134
    .line 135
    invoke-static {v10}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 136
    .line 137
    .line 138
    move-result-object v10

    .line 139
    iget-object v11, v5, Llc0;->a:Lkc0;

    .line 140
    .line 141
    invoke-virtual {v11}, Lkc0;->a()J

    .line 142
    .line 143
    .line 144
    move-result-wide v11

    .line 145
    invoke-virtual {v10, v11, v12}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 146
    .line 147
    .line 148
    move-result-object v10

    .line 149
    invoke-virtual {v1, v8}, Lyc0;->f(I)Lip;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    iget-object v11, v2, Lbd0;->a:Lyc0;

    .line 154
    .line 155
    invoke-virtual {v11, v8}, Lyc0;->f(I)Lip;

    .line 156
    .line 157
    .line 158
    move-result-object v11

    .line 159
    iget v12, v1, Lip;->a:I

    .line 160
    .line 161
    iget v13, v11, Lip;->a:I

    .line 162
    .line 163
    invoke-static {v12, v13}, Ljava/lang/Math;->min(II)I

    .line 164
    .line 165
    .line 166
    move-result v12

    .line 167
    iget v13, v1, Lip;->b:I

    .line 168
    .line 169
    iget v14, v11, Lip;->b:I

    .line 170
    .line 171
    invoke-static {v13, v14}, Ljava/lang/Math;->min(II)I

    .line 172
    .line 173
    .line 174
    move-result v15

    .line 175
    iget v9, v1, Lip;->c:I

    .line 176
    .line 177
    iget v4, v11, Lip;->c:I

    .line 178
    .line 179
    move-object/from16 v16, v2

    .line 180
    .line 181
    invoke-static {v9, v4}, Ljava/lang/Math;->min(II)I

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    move-object/from16 v17, v3

    .line 186
    .line 187
    iget v3, v1, Lip;->d:I

    .line 188
    .line 189
    move-object/from16 v18, v5

    .line 190
    .line 191
    iget v5, v11, Lip;->d:I

    .line 192
    .line 193
    move/from16 v19, v8

    .line 194
    .line 195
    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    .line 196
    .line 197
    .line 198
    move-result v8

    .line 199
    invoke-static {v12, v15, v2, v8}, Lip;->b(IIII)Lip;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    iget v1, v1, Lip;->a:I

    .line 204
    .line 205
    iget v8, v11, Lip;->a:I

    .line 206
    .line 207
    invoke-static {v1, v8}, Ljava/lang/Math;->max(II)I

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    invoke-static {v13, v14}, Ljava/lang/Math;->max(II)I

    .line 212
    .line 213
    .line 214
    move-result v8

    .line 215
    invoke-static {v9, v4}, Ljava/lang/Math;->max(II)I

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    invoke-static {v1, v8, v4, v3}, Lip;->b(IIII)Lip;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    new-instance v8, Ld4;

    .line 228
    .line 229
    const/16 v3, 0x15

    .line 230
    .line 231
    const/4 v4, 0x0

    .line 232
    invoke-direct {v8, v2, v1, v3, v4}, Ld4;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 233
    .line 234
    .line 235
    invoke-static {v6, v7, v4}, Lhc0;->f(Landroid/view/View;Landroid/view/WindowInsets;Z)V

    .line 236
    .line 237
    .line 238
    new-instance v1, Lfc0;

    .line 239
    .line 240
    move-object/from16 v4, v16

    .line 241
    .line 242
    move-object/from16 v3, v17

    .line 243
    .line 244
    move-object/from16 v2, v18

    .line 245
    .line 246
    move/from16 v5, v19

    .line 247
    .line 248
    invoke-direct/range {v1 .. v6}, Lfc0;-><init>(Llc0;Lbd0;Lbd0;ILandroid/view/View;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v10, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 252
    .line 253
    .line 254
    new-instance v1, Lu70;

    .line 255
    .line 256
    const/4 v4, 0x2

    .line 257
    invoke-direct {v1, v2, v6, v4}, Lu70;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v10, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 261
    .line 262
    .line 263
    new-instance v1, Lz00;

    .line 264
    .line 265
    invoke-direct {v1, v6, v2, v8, v10}, Lz00;-><init>(Landroid/view/View;Llc0;Ld4;Landroid/animation/ValueAnimator;)V

    .line 266
    .line 267
    .line 268
    invoke-static {v6, v1}, Lkx;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 269
    .line 270
    .line 271
    iput-object v3, v0, Lgc0;->b:Lbd0;

    .line 272
    .line 273
    invoke-static/range {p1 .. p2}, Lhc0;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    return-object v1

    .line 278
    nop

    .line 279
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method
