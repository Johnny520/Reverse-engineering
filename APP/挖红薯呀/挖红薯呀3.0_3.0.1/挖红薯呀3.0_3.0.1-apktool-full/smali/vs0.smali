.class public final Lvs0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Lvs0;

.field private static volatile b:Z = false

.field private static final c:I

.field private static final d:Lu60;

.field private static final e:Lu60;

.field private static final f:Lu60;

.field private static final g:Lu60;

.field private static final h:Lu60;

.field private static final i:Z = true

.field private static final j:I = 0x30

.field private static final k:I = 0x1e

.field private static final l:I = 0x50

.field public static final m:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lvs0;

    .line 2
    .line 3
    invoke-direct {v0}, Lvs0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lvs0;->a:Lvs0;

    .line 7
    .line 8
    const v0, 0x7f0e0001

    .line 9
    .line 10
    .line 11
    sput v0, Lvs0;->c:I

    .line 12
    .line 13
    new-instance v0, Lsc0;

    .line 14
    .line 15
    const/16 v1, 0x1d

    .line 16
    .line 17
    invoke-direct {v0, v1}, Lsc0;-><init>(I)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lx51;

    .line 21
    .line 22
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 23
    .line 24
    .line 25
    sput-object v1, Lvs0;->d:Lu60;

    .line 26
    .line 27
    new-instance v0, Lus0;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {v0, v1}, Lus0;-><init>(I)V

    .line 31
    .line 32
    .line 33
    new-instance v1, Lx51;

    .line 34
    .line 35
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 36
    .line 37
    .line 38
    sput-object v1, Lvs0;->e:Lu60;

    .line 39
    .line 40
    new-instance v0, Lus0;

    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    invoke-direct {v0, v1}, Lus0;-><init>(I)V

    .line 44
    .line 45
    .line 46
    new-instance v1, Lx51;

    .line 47
    .line 48
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 49
    .line 50
    .line 51
    sput-object v1, Lvs0;->f:Lu60;

    .line 52
    .line 53
    new-instance v0, Lus0;

    .line 54
    .line 55
    const/4 v1, 0x2

    .line 56
    invoke-direct {v0, v1}, Lus0;-><init>(I)V

    .line 57
    .line 58
    .line 59
    new-instance v1, Lx51;

    .line 60
    .line 61
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 62
    .line 63
    .line 64
    sput-object v1, Lvs0;->g:Lu60;

    .line 65
    .line 66
    new-instance v0, Lus0;

    .line 67
    .line 68
    const/4 v1, 0x3

    .line 69
    invoke-direct {v0, v1}, Lus0;-><init>(I)V

    .line 70
    .line 71
    .line 72
    new-instance v1, Lx51;

    .line 73
    .line 74
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 75
    .line 76
    .line 77
    sput-object v1, Lvs0;->h:Lu60;

    .line 78
    .line 79
    const/16 v0, 0x8

    .line 80
    .line 81
    sput v0, Lvs0;->m:I

    .line 82
    .line 83
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final A(Landroid/view/ViewGroup;Ljava/lang/Object;Landroid/app/Activity;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v13

    .line 9
    invoke-direct {v0}, Lvs0;->u()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-virtual {v13, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-direct {v0}, Lvs0;->q()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    const/4 v5, 0x1

    .line 23
    invoke-interface {v2, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-nez v4, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    sget v4, Lvs0;->c:I

    .line 31
    .line 32
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    if-eqz v5, :cond_1

    .line 41
    .line 42
    :goto_0
    return-void

    .line 43
    :cond_1
    invoke-direct {v0}, Lvs0;->s()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    const/16 v6, 0x30

    .line 48
    .line 49
    invoke-interface {v2, v5, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    const/16 v6, 0x1e

    .line 54
    .line 55
    const/16 v7, 0x50

    .line 56
    .line 57
    invoke-static {v5, v6, v7}, Lw60;->n(III)I

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    int-to-float v5, v5

    .line 62
    invoke-direct {v0, v13, v5}, Lvs0;->p(Landroid/content/Context;F)I

    .line 63
    .line 64
    .line 65
    move-result v9

    .line 66
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    iget v8, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 75
    .line 76
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    iget v11, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 85
    .line 86
    move-object/from16 v6, p3

    .line 87
    .line 88
    invoke-direct {v0, v6}, Lvs0;->v(Landroid/app/Activity;)I

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    invoke-direct {v0}, Lvs0;->r()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    const/4 v7, -0x1

    .line 97
    invoke-interface {v2, v6, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    invoke-direct {v0}, Lvs0;->t()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-interface {v2, v0, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    new-instance v14, Landroid/widget/FrameLayout$LayoutParams;

    .line 110
    .line 111
    invoke-direct {v14, v9, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 112
    .line 113
    .line 114
    const v2, 0x800033

    .line 115
    .line 116
    .line 117
    iput v2, v14, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 118
    .line 119
    if-ltz v6, :cond_2

    .line 120
    .line 121
    if-ltz v0, :cond_2

    .line 122
    .line 123
    sub-int v2, v8, v9

    .line 124
    .line 125
    invoke-static {v6, v3, v2}, Lw60;->n(III)I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    iput v2, v14, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 130
    .line 131
    sub-int v2, v11, v9

    .line 132
    .line 133
    invoke-static {v0, v10, v2}, Lw60;->n(III)I

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    iput v0, v14, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_2
    sget-object v0, Lvs0;->a:Lvs0;

    .line 141
    .line 142
    const/high16 v2, 0x41800000    # 16.0f

    .line 143
    .line 144
    invoke-direct {v0, v13, v2}, Lvs0;->p(Landroid/content/Context;F)I

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    sub-int v2, v8, v2

    .line 149
    .line 150
    sub-int/2addr v2, v9

    .line 151
    iput v2, v14, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 152
    .line 153
    const/high16 v2, 0x42f00000    # 120.0f

    .line 154
    .line 155
    invoke-direct {v0, v13, v2}, Lvs0;->p(Landroid/content/Context;F)I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    sub-int v0, v11, v0

    .line 160
    .line 161
    sub-int/2addr v0, v9

    .line 162
    iput v0, v14, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 163
    .line 164
    :goto_1
    invoke-static {v3}, Lt1;->h(I)Landroid/graphics/drawable/GradientDrawable;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    const/high16 v2, 0x3e800000    # 0.25f

    .line 169
    .line 170
    mul-float/2addr v2, v5

    .line 171
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 180
    .line 181
    mul-float/2addr v2, v3

    .line 182
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 183
    .line 184
    .line 185
    const/16 v2, 0x2c

    .line 186
    .line 187
    const/16 v3, 0x55

    .line 188
    .line 189
    const/16 v6, 0xcc

    .line 190
    .line 191
    const/16 v12, 0xfe

    .line 192
    .line 193
    invoke-static {v6, v12, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 198
    .line 199
    .line 200
    new-instance v3, Lwt0;

    .line 201
    .line 202
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 203
    .line 204
    .line 205
    move v2, v4

    .line 206
    new-instance v4, Lwt0;

    .line 207
    .line 208
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 209
    .line 210
    .line 211
    move v6, v5

    .line 212
    new-instance v5, Lxt0;

    .line 213
    .line 214
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 215
    .line 216
    .line 217
    move v12, v6

    .line 218
    new-instance v6, Lxt0;

    .line 219
    .line 220
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 221
    .line 222
    .line 223
    new-instance v15, Lvt0;

    .line 224
    .line 225
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 226
    .line 227
    .line 228
    new-instance v7, Landroid/widget/TextView;

    .line 229
    .line 230
    invoke-direct {v7, v13}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 231
    .line 232
    .line 233
    move/from16 p0, v2

    .line 234
    .line 235
    const-string v2, "\u2b06"

    .line 236
    .line 237
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 238
    .line 239
    .line 240
    const v2, 0x3ec28f5c    # 0.38f

    .line 241
    .line 242
    .line 243
    mul-float/2addr v2, v12

    .line 244
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 245
    .line 246
    .line 247
    const/4 v2, -0x1

    .line 248
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 249
    .line 250
    .line 251
    const/16 v2, 0x11

    .line 252
    .line 253
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 254
    .line 255
    .line 256
    invoke-static/range {p0 .. p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    invoke-virtual {v7, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v7, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 264
    .line 265
    .line 266
    sget-object v0, Lvs0;->a:Lvs0;

    .line 267
    .line 268
    const/high16 v2, 0x40800000    # 4.0f

    .line 269
    .line 270
    invoke-direct {v0, v13, v2}, Lvs0;->p(Landroid/content/Context;F)I

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    int-to-float v0, v0

    .line 275
    invoke-virtual {v7, v0}, Landroid/view/View;->setElevation(F)V

    .line 276
    .line 277
    .line 278
    new-instance v2, Ldk0;

    .line 279
    .line 280
    move-object/from16 v12, p2

    .line 281
    .line 282
    move-object v0, v7

    .line 283
    move-object v7, v15

    .line 284
    invoke-direct/range {v2 .. v13}, Ldk0;-><init>(Lwt0;Lwt0;Lxt0;Lxt0;Lvt0;IIIILjava/lang/Object;Landroid/content/Context;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v1, v0, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 291
    .line 292
    .line 293
    return-void
.end method

.method private static final B(Lwt0;Lwt0;Lxt0;Lxt0;Lvt0;IIIILjava/lang/Object;Landroid/content/Context;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 8

    .line 1
    const-string v1, "commitNow"

    .line 2
    .line 3
    const-string v2, "setReorderingAllowed"

    .line 4
    .line 5
    const-string v3, "beginTransaction"

    .line 6
    .line 7
    invoke-virtual/range {p11 .. p11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    check-cast v4, Landroid/widget/FrameLayout$LayoutParams;

    .line 15
    .line 16
    invoke-virtual/range {p12 .. p12}, Landroid/view/MotionEvent;->getAction()I

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    const/4 v6, 0x1

    .line 21
    const/4 v7, 0x0

    .line 22
    if-eqz v5, :cond_5

    .line 23
    .line 24
    if-eq v5, v6, :cond_3

    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    if-eq v5, v1, :cond_0

    .line 28
    .line 29
    return v7

    .line 30
    :cond_0
    invoke-virtual/range {p12 .. p12}, Landroid/view/MotionEvent;->getRawX()F

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    iget p0, p0, Lwt0;->d:F

    .line 35
    .line 36
    sub-float/2addr v1, p0

    .line 37
    float-to-int p0, v1

    .line 38
    invoke-virtual/range {p12 .. p12}, Landroid/view/MotionEvent;->getRawY()F

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    iget p1, p1, Lwt0;->d:F

    .line 43
    .line 44
    sub-float/2addr v1, p1

    .line 45
    float-to-int p1, v1

    .line 46
    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    const/16 v2, 0x8

    .line 51
    .line 52
    if-gt v1, v2, :cond_1

    .line 53
    .line 54
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-le v1, v2, :cond_2

    .line 59
    .line 60
    :cond_1
    iput-boolean v6, p4, Lvt0;->d:Z

    .line 61
    .line 62
    iget p2, p2, Lxt0;->d:I

    .line 63
    .line 64
    add-int/2addr p2, p0

    .line 65
    sub-int p0, p5, p6

    .line 66
    .line 67
    invoke-static {p2, v7, p0}, Lw60;->n(III)I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    iput p0, v4, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 72
    .line 73
    iget p0, p3, Lxt0;->d:I

    .line 74
    .line 75
    add-int/2addr p0, p1

    .line 76
    sub-int p1, p8, p6

    .line 77
    .line 78
    invoke-static {p0, p7, p1}, Lw60;->n(III)I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    iput p0, v4, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 83
    .line 84
    move-object/from16 p0, p11

    .line 85
    .line 86
    invoke-virtual {p0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 87
    .line 88
    .line 89
    :cond_2
    return v6

    .line 90
    :cond_3
    iget-boolean p0, p4, Lvt0;->d:Z

    .line 91
    .line 92
    if-nez p0, :cond_4

    .line 93
    .line 94
    sput-boolean v6, Lvs0;->b:Z

    .line 95
    .line 96
    :try_start_0
    sget-object p0, Lvs0;->a:Lvs0;

    .line 97
    .line 98
    const-string p1, "getParentFragmentManager"

    .line 99
    .line 100
    new-array p2, v7, [Ljava/lang/Object;

    .line 101
    .line 102
    move-object/from16 p3, p9

    .line 103
    .line 104
    invoke-direct {p0, p3, p1, p2}, Lvs0;->o(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    new-array p2, v7, [Ljava/lang/Object;

    .line 109
    .line 110
    invoke-direct {p0, p1, v3, p2}, Lvs0;->o(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 115
    .line 116
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-direct {p0, p2, v2, v4}, Lvs0;->o(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    const-string v4, "detach"

    .line 124
    .line 125
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    invoke-direct {p0, p2, v4, v5}, Lvs0;->o(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    new-array v4, v7, [Ljava/lang/Object;

    .line 133
    .line 134
    invoke-direct {p0, p2, v1, v4}, Lvs0;->o(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    new-array p2, v7, [Ljava/lang/Object;

    .line 138
    .line 139
    invoke-direct {p0, p1, v3, p2}, Lvs0;->o(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    invoke-direct {p0, p1, v2, p2}, Lvs0;->o(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    const-string p2, "attach"

    .line 151
    .line 152
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p3

    .line 156
    invoke-direct {p0, p1, p2, p3}, Lvs0;->o(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    new-array p2, v7, [Ljava/lang/Object;

    .line 160
    .line 161
    invoke-direct {p0, p1, v1, p2}, Lvs0;->o(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 162
    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_4
    sget-object p0, Lvs0;->a:Lvs0;

    .line 166
    .line 167
    invoke-direct {p0}, Lvs0;->u()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    move-object/from16 p2, p10

    .line 172
    .line 173
    invoke-virtual {p2, p1, v7}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-direct {p0}, Lvs0;->r()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    iget p3, v4, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 186
    .line 187
    invoke-interface {p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-direct {p0}, Lvs0;->t()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    iget p2, v4, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 196
    .line 197
    invoke-interface {p1, p0, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 202
    .line 203
    .line 204
    :catch_0
    :goto_0
    return v6

    .line 205
    :cond_5
    invoke-virtual/range {p12 .. p12}, Landroid/view/MotionEvent;->getRawX()F

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    iput v1, p0, Lwt0;->d:F

    .line 210
    .line 211
    invoke-virtual/range {p12 .. p12}, Landroid/view/MotionEvent;->getRawY()F

    .line 212
    .line 213
    .line 214
    move-result p0

    .line 215
    iput p0, p1, Lwt0;->d:F

    .line 216
    .line 217
    iget p0, v4, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 218
    .line 219
    iput p0, p2, Lxt0;->d:I

    .line 220
    .line 221
    iget p0, v4, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 222
    .line 223
    iput p0, p3, Lxt0;->d:I

    .line 224
    .line 225
    iput-boolean v7, p4, Lvt0;->d:Z

    .line 226
    .line 227
    return v6
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lvs0;->l()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic b(Lwt0;Lwt0;Lxt0;Lxt0;Lvt0;IIIILjava/lang/Object;Landroid/content/Context;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-static/range {p0 .. p12}, Lvs0;->B(Lwt0;Lwt0;Lxt0;Lxt0;Lvt0;IIIILjava/lang/Object;Landroid/content/Context;Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic c()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lvs0;->n()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic d(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lvs0;->x(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lvs0;->m()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic f()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lvs0;->k()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic g(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lvs0;->z(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic h(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lvs0;->y(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic i()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lvs0;->j()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static final j()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lm00;->S:Lm00$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm00$a;->R()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private static final k()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lm00;->S:Lm00$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm00$a;->S()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private static final l()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lm00;->S:Lm00$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm00$a;->T()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private static final m()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lm00;->S:Lm00$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm00$a;->U()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private static final n()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lm00;->S:Lm00$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm00$a;->Y()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private final varargs o(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    const/4 p0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object p0

    .line 5
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    array-length v2, v0

    .line 22
    const/4 v3, 0x0

    .line 23
    :goto_0
    if-ge v3, v2, :cond_2

    .line 24
    .line 25
    aget-object v4, v0, v3

    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-static {v5, p2}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-eqz v5, :cond_1

    .line 36
    .line 37
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    array-length v5, v5

    .line 42
    array-length v6, p3

    .line 43
    if-ne v5, v6, :cond_1

    .line 44
    .line 45
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    :catch_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 66
    .line 67
    :try_start_1
    array-length v1, p3

    .line 68
    invoke-static {p3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 76
    :catch_1
    :cond_3
    return-object p0
.end method

.method private final p(Landroid/content/Context;F)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

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
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 10
    .line 11
    mul-float/2addr p2, p0

    .line 12
    const/high16 p0, 0x3f000000    # 0.5f

    .line 13
    .line 14
    add-float/2addr p2, p0

    .line 15
    float-to-int p0, p2

    .line 16
    return p0
.end method

.method private final q()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lvs0;->e:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method private final r()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lvs0;->g:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method private final s()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lvs0;->f:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method private final t()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lvs0;->h:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method private final u()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lvs0;->d:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method private final v(Landroid/app/Activity;)I
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "dimen"

    .line 6
    .line 7
    const-string v2, "android"

    .line 8
    .line 9
    const-string v3, "status_bar_height"

    .line 10
    .line 11
    invoke-virtual {v0, v3, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-lez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :cond_0
    const/high16 v0, 0x41c00000    # 24.0f

    .line 27
    .line 28
    invoke-direct {p0, p1, v0}, Lvs0;->p(Landroid/content/Context;F)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0
.end method

.method private static final x(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-boolean v1, Lvs0;->b:Z

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    sput-boolean v2, Lvs0;->b:Z

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    :try_start_0
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    sget-object v1, Lvs0;->a:Lvs0;

    .line 21
    .line 22
    const-string v3, "getArguments"

    .line 23
    .line 24
    new-array v2, v2, [Ljava/lang/Object;

    .line 25
    .line 26
    invoke-direct {v1, p0, v3, v2}, Lvs0;->o(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    instance-of v2, v1, Landroid/os/Bundle;

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    check-cast v1, Landroid/os/Bundle;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v1, 0x0

    .line 38
    :goto_0
    const/4 v2, -0x1

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    const-string v3, "pageSource"

    .line 42
    .line 43
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    :cond_2
    if-nez v2, :cond_3

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    new-instance v1, Landroid/os/Handler;

    .line 51
    .line 52
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 57
    .line 58
    .line 59
    new-instance v2, Lzd;

    .line 60
    .line 61
    const/4 v3, 0x1

    .line 62
    invoke-direct {v2, v3, p0}, Lzd;-><init>(ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    .line 67
    .line 68
    :catch_0
    :goto_1
    return-object v0
.end method

.method private static final y(Ljava/lang/Object;)V
    .locals 5

    .line 1
    :try_start_0
    sget-object v0, Lvs0;->a:Lvs0;

    .line 2
    .line 3
    const-string v1, "getActivity"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    new-array v2, v2, [Ljava/lang/Object;

    .line 7
    .line 8
    invoke-direct {v0, p0, v1, v2}, Lvs0;->o(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    instance-of v2, v1, Landroid/app/Activity;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    check-cast v1, Landroid/app/Activity;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v1, v3

    .line 21
    :goto_0
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move-object v2, v3

    .line 35
    :goto_1
    instance-of v4, v2, Landroid/view/ViewGroup;

    .line 36
    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    move-object v3, v2

    .line 40
    check-cast v3, Landroid/view/ViewGroup;

    .line 41
    .line 42
    :cond_2
    if-nez v3, :cond_3

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, v3, p0, v1}, Lvs0;->A(Landroid/view/ViewGroup;Ljava/lang/Object;Landroid/app/Activity;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    :catch_0
    :goto_2
    return-void
.end method

.method private static final z(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-boolean v1, Lvs0;->b:Z

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_4

    .line 13
    .line 14
    :cond_0
    :try_start_0
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    check-cast v1, Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    sget-object v3, Lvs0;->a:Lvs0;

    .line 37
    .line 38
    const-string v4, "getArguments"

    .line 39
    .line 40
    new-array v5, v2, [Ljava/lang/Object;

    .line 41
    .line 42
    invoke-direct {v3, p0, v4, v5}, Lvs0;->o(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    instance-of v5, v4, Landroid/os/Bundle;

    .line 47
    .line 48
    const/4 v6, 0x0

    .line 49
    if-eqz v5, :cond_1

    .line 50
    .line 51
    check-cast v4, Landroid/os/Bundle;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    move-object v4, v6

    .line 55
    :goto_0
    const/4 v5, -0x1

    .line 56
    if-eqz v4, :cond_2

    .line 57
    .line 58
    const-string v7, "pageSource"

    .line 59
    .line 60
    invoke-virtual {v4, v7, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    :cond_2
    if-nez v5, :cond_3

    .line 65
    .line 66
    goto :goto_4

    .line 67
    :cond_3
    const-string v4, "getActivity"

    .line 68
    .line 69
    new-array v5, v2, [Ljava/lang/Object;

    .line 70
    .line 71
    invoke-direct {v3, p0, v4, v5}, Lvs0;->o(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    instance-of v3, p0, Landroid/app/Activity;

    .line 76
    .line 77
    if-eqz v3, :cond_4

    .line 78
    .line 79
    check-cast p0, Landroid/app/Activity;

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_4
    move-object p0, v6

    .line 83
    :goto_1
    if-eqz p0, :cond_5

    .line 84
    .line 85
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    if-eqz v3, :cond_5

    .line 90
    .line 91
    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    goto :goto_2

    .line 96
    :cond_5
    move-object v3, v6

    .line 97
    :goto_2
    instance-of v4, v3, Landroid/view/ViewGroup;

    .line 98
    .line 99
    if-eqz v4, :cond_6

    .line 100
    .line 101
    move-object v6, v3

    .line 102
    check-cast v6, Landroid/view/ViewGroup;

    .line 103
    .line 104
    :cond_6
    if-nez v6, :cond_7

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_7
    sget v3, Lvs0;->c:I

    .line 108
    .line 109
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-virtual {v6, v3}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    if-nez v3, :cond_8

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_8
    if-eqz v1, :cond_9

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_9
    const/16 v2, 0x8

    .line 124
    .line 125
    :goto_3
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 126
    .line 127
    .line 128
    sget-object v2, Lck0;->a:Lck0;

    .line 129
    .line 130
    xor-int/lit8 v3, v1, 0x1

    .line 131
    .line 132
    invoke-virtual {v2, p0, v3}, Lck0;->L(Landroid/app/Activity;Z)V

    .line 133
    .line 134
    .line 135
    sget-object v2, Lfk0;->a:Lfk0;

    .line 136
    .line 137
    xor-int/lit8 v1, v1, 0x1

    .line 138
    .line 139
    invoke-virtual {v2, p0, v1}, Lfk0;->g0(Landroid/app/Activity;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 140
    .line 141
    .line 142
    :catch_0
    :goto_4
    return-object v0
.end method


# virtual methods
.method public final w(Ljava/lang/ClassLoader;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_2

    .line 5
    .line 6
    if-nez p3, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    :try_start_0
    const-class p0, Landroid/view/LayoutInflater;

    .line 10
    .line 11
    const-class p1, Landroid/view/ViewGroup;

    .line 12
    .line 13
    filled-new-array {p0, p1}, [Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p2, p3, p0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    sget-object p1, Lkf1;->G:Lkf1$a;

    .line 22
    .line 23
    invoke-virtual {p1}, Lkf1$a;->b()Lkf1;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    if-eqz p3, :cond_1

    .line 28
    .line 29
    invoke-virtual {p3, p0}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    new-instance p3, Lua;

    .line 36
    .line 37
    const/16 v0, 0x15

    .line 38
    .line 39
    invoke-direct {p3, v0}, Lua;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-interface {p0, p3}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    if-eqz p0, :cond_2

    .line 50
    .line 51
    const-string p2, "setUserVisibleHint"

    .line 52
    .line 53
    sget-object p3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 54
    .line 55
    filled-new-array {p3}, [Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    invoke-virtual {p0, p2, p3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p1}, Lkf1$a;->b()Lkf1;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-eqz p1, :cond_2

    .line 68
    .line 69
    invoke-virtual {p1, p0}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    if-eqz p0, :cond_2

    .line 74
    .line 75
    new-instance p1, Lua;

    .line 76
    .line 77
    const/16 p2, 0x16

    .line 78
    .line 79
    invoke-direct {p1, p2}, Lua;-><init>(I)V

    .line 80
    .line 81
    .line 82
    invoke-interface {p0, p1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    .line 84
    .line 85
    :catch_0
    :cond_2
    :goto_0
    return-void
.end method
