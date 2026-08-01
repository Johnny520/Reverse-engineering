.class public final Lvf0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvf0$a;
    }
.end annotation


# static fields
.field public static final a:Lvf0;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lvf0;

    .line 2
    .line 3
    invoke-direct {v0}, Lvf0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lvf0;->a:Lvf0;

    .line 7
    .line 8
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

.method public static synthetic A(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->y3(Landroid/app/Dialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic A0(Landroid/app/Dialog;Landroid/content/Context;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lvf0;->h3(Landroid/app/Dialog;Landroid/content/Context;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final A1(Landroid/content/Context;ILandroid/app/Dialog;)V
    .locals 1

    .line 1
    sget-object v0, Lvf0;->a:Lvf0;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    int-to-float p0, p0

    .line 8
    invoke-virtual {p2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    const/4 p2, 0x1

    .line 21
    invoke-virtual {p1, p2}, Landroid/view/View;->setClipToOutline(Z)V

    .line 22
    .line 23
    .line 24
    new-instance p2, Lvf0$b;

    .line 25
    .line 26
    invoke-direct {p2, p0}, Lvf0$b;-><init>(F)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p2}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method private static final A2(Landroid/app/Dialog;Landroid/content/Context;)Lna1;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lvf0;->a:Lvf0;

    .line 5
    .line 6
    invoke-direct {p0, p1}, Lvf0;->f3(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lna1;->a:Lna1;

    .line 10
    .line 11
    return-object p0
.end method

.method private final A3(Landroid/app/Dialog;Landroid/content/Context;Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-virtual {p1, p3}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 5
    .line 6
    .line 7
    move-result-object p3

    .line 8
    if-eqz p3, :cond_0

    .line 9
    .line 10
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 19
    .line 20
    int-to-double v0, v0

    .line 21
    const-wide v2, 0x3feb333333333333L    # 0.85

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    mul-double/2addr v0, v2

    .line 27
    double-to-int v0, v0

    .line 28
    const/4 v1, -0x2

    .line 29
    invoke-virtual {p3, v0, v1}, Landroid/view/Window;->setLayout(II)V

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    if-eqz p3, :cond_1

    .line 37
    .line 38
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p3, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 48
    .line 49
    .line 50
    const/16 p3, 0x1c

    .line 51
    .line 52
    invoke-direct {p0, p2, p1, p3}, Lvf0;->z1(Landroid/content/Context;Landroid/app/Dialog;I)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public static synthetic B(Landroid/content/Context;Lsw;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lvf0;->y1(Landroid/content/Context;Lsw;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic B0(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->g3(Landroid/app/Dialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final B2(Landroid/content/Context;Landroid/app/Dialog;)Lna1;
    .locals 1

    .line 1
    :goto_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    instance-of v0, p0, Landroid/app/Activity;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, Landroid/app/Activity;

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    check-cast p0, Landroid/content/ContextWrapper;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 p0, 0x0

    .line 23
    :goto_1
    if-eqz p0, :cond_2

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 26
    .line 27
    .line 28
    new-instance p1, Lc2;

    .line 29
    .line 30
    invoke-direct {p1, p0}, Lc2;-><init>(Landroid/content/Context;)V

    .line 31
    .line 32
    .line 33
    new-instance p0, Lb2;

    .line 34
    .line 35
    const/4 v0, 0x2

    .line 36
    invoke-direct {p0, v0}, Lb2;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, p0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 43
    .line 44
    .line 45
    :cond_2
    sget-object p0, Lna1;->a:Lna1;

    .line 46
    .line 47
    return-object p0
.end method

.method private final B3(Landroid/content/Context;IIILandroid/content/SharedPreferences;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move/from16 v6, p2

    .line 6
    .line 7
    move-object/from16 v11, p5

    .line 8
    .line 9
    new-instance v1, Lvf0$l;

    .line 10
    .line 11
    const-string v3, "\u5173\u6ce8"

    .line 12
    .line 13
    const-string v4, "\u2b50"

    .line 14
    .line 15
    const-string v5, "hide_home_follow"

    .line 16
    .line 17
    const/4 v12, 0x0

    .line 18
    invoke-direct {v1, v5, v12, v3, v4}, Lvf0$l;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Lvf0$l;

    .line 22
    .line 23
    const-string v4, "\u53d1\u73b0"

    .line 24
    .line 25
    const-string v7, "\ud83d\udd0d"

    .line 26
    .line 27
    const-string v8, "hide_home_explore"

    .line 28
    .line 29
    invoke-direct {v3, v8, v12, v4, v7}, Lvf0$l;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    new-instance v4, Lvf0$l;

    .line 33
    .line 34
    const-string v7, "\u4e16\u754c\u676f"

    .line 35
    .line 36
    const-string v9, "\u26bd"

    .line 37
    .line 38
    const-string v10, "hide_home_worldcup"

    .line 39
    .line 40
    invoke-direct {v4, v10, v12, v7, v9}, Lvf0$l;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    new-instance v7, Lvf0$l;

    .line 44
    .line 45
    const-string v9, "\u540c\u57ce"

    .line 46
    .line 47
    const-string v13, "\ud83d\udccd"

    .line 48
    .line 49
    const-string v14, "hide_home_local"

    .line 50
    .line 51
    invoke-direct {v7, v14, v12, v9, v13}, Lvf0$l;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    filled-new-array {v1, v3, v4, v7}, [Lvf0$l;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v1}, Lo30;->w([Ljava/lang/Object;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    new-instance v13, Landroid/app/Dialog;

    .line 63
    .line 64
    invoke-direct {v13, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 65
    .line 66
    .line 67
    invoke-direct/range {p0 .. p1}, Lvf0;->f1(Landroid/content/Context;)Z

    .line 68
    .line 69
    .line 70
    move-result v15

    .line 71
    const/16 v3, 0xff

    .line 72
    .line 73
    const/16 v4, 0x1c

    .line 74
    .line 75
    if-eqz v15, :cond_0

    .line 76
    .line 77
    const/16 v7, 0x16

    .line 78
    .line 79
    invoke-static {v3, v7, v7, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    goto :goto_0

    .line 84
    :cond_0
    const/16 v7, 0xfc

    .line 85
    .line 86
    const/16 v9, 0xf8

    .line 87
    .line 88
    invoke-static {v3, v9, v9, v7}, Landroid/graphics/Color;->argb(IIII)I

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    :goto_0
    new-instance v9, Landroid/widget/LinearLayout;

    .line 93
    .line 94
    invoke-direct {v9, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 95
    .line 96
    .line 97
    const/4 v3, 0x1

    .line 98
    invoke-virtual {v9, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v9, v7}, Landroid/view/View;->setBackgroundColor(I)V

    .line 102
    .line 103
    .line 104
    new-instance v3, Landroid/widget/ScrollView;

    .line 105
    .line 106
    invoke-direct {v3, v2}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 107
    .line 108
    .line 109
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 110
    .line 111
    move/from16 v16, v15

    .line 112
    .line 113
    const/4 v15, -0x1

    .line 114
    move-object/from16 v17, v13

    .line 115
    .line 116
    const/high16 v13, 0x3f800000    # 1.0f

    .line 117
    .line 118
    invoke-direct {v4, v15, v12, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 122
    .line 123
    .line 124
    const/4 v4, 0x1

    .line 125
    invoke-virtual {v3, v4}, Landroid/widget/ScrollView;->setFillViewport(Z)V

    .line 126
    .line 127
    .line 128
    new-instance v13, Landroid/widget/LinearLayout;

    .line 129
    .line 130
    invoke-direct {v13, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v13, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 134
    .line 135
    .line 136
    sget-object v4, Lvf0;->a:Lvf0;

    .line 137
    .line 138
    const/16 v15, 0x10

    .line 139
    .line 140
    invoke-direct {v4, v2, v15}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 141
    .line 142
    .line 143
    move-result v12

    .line 144
    move-object/from16 v18, v1

    .line 145
    .line 146
    invoke-direct {v4, v2, v15}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    move-object/from16 v19, v3

    .line 151
    .line 152
    invoke-direct {v4, v2, v15}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    const/16 v15, 0x8

    .line 157
    .line 158
    move-object/from16 v20, v9

    .line 159
    .line 160
    invoke-direct {v4, v2, v15}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 161
    .line 162
    .line 163
    move-result v9

    .line 164
    invoke-virtual {v13, v12, v1, v3, v9}, Landroid/view/View;->setPadding(IIII)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v13, v7}, Landroid/view/View;->setBackgroundColor(I)V

    .line 168
    .line 169
    .line 170
    new-instance v1, Landroid/widget/LinearLayout;

    .line 171
    .line 172
    invoke-direct {v1, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 173
    .line 174
    .line 175
    const/4 v3, 0x0

    .line 176
    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 177
    .line 178
    .line 179
    const/16 v3, 0x10

    .line 180
    .line 181
    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 182
    .line 183
    .line 184
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 185
    .line 186
    const/4 v12, -0x2

    .line 187
    const/4 v7, -0x1

    .line 188
    invoke-direct {v3, v7, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 192
    .line 193
    .line 194
    new-instance v3, Landroid/widget/TextView;

    .line 195
    .line 196
    invoke-direct {v3, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 197
    .line 198
    .line 199
    const-string v7, "\u9876\u90e8Tab\u8bbe\u7f6e"

    .line 200
    .line 201
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 202
    .line 203
    .line 204
    const/high16 v7, 0x41900000    # 18.0f

    .line 205
    .line 206
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 210
    .line 211
    .line 212
    sget-object v7, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 213
    .line 214
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 215
    .line 216
    .line 217
    invoke-direct {v4, v2, v15}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 218
    .line 219
    .line 220
    move-result v7

    .line 221
    const/16 v9, 0x10

    .line 222
    .line 223
    invoke-direct {v4, v2, v9}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 224
    .line 225
    .line 226
    move-result v15

    .line 227
    const/4 v9, 0x0

    .line 228
    invoke-virtual {v3, v9, v7, v9, v15}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v13, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 235
    .line 236
    .line 237
    new-instance v1, Lvt0;

    .line 238
    .line 239
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 240
    .line 241
    .line 242
    invoke-interface {v11, v5, v9}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    if-nez v3, :cond_2

    .line 247
    .line 248
    invoke-interface {v11, v8, v9}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 249
    .line 250
    .line 251
    move-result v3

    .line 252
    if-nez v3, :cond_2

    .line 253
    .line 254
    invoke-interface {v11, v10, v9}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 255
    .line 256
    .line 257
    move-result v3

    .line 258
    if-nez v3, :cond_2

    .line 259
    .line 260
    invoke-interface {v11, v14, v9}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 261
    .line 262
    .line 263
    move-result v3

    .line 264
    if-eqz v3, :cond_1

    .line 265
    .line 266
    goto :goto_1

    .line 267
    :cond_1
    move v3, v9

    .line 268
    goto :goto_2

    .line 269
    :cond_2
    :goto_1
    const/4 v3, 0x1

    .line 270
    :goto_2
    iput-boolean v3, v1, Lvt0;->d:Z

    .line 271
    .line 272
    new-instance v3, Landroid/widget/LinearLayout;

    .line 273
    .line 274
    invoke-direct {v3, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v3, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 278
    .line 279
    .line 280
    const/16 v9, 0x10

    .line 281
    .line 282
    invoke-virtual {v3, v9}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 283
    .line 284
    .line 285
    const/4 v14, 0x4

    .line 286
    invoke-direct {v4, v2, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 287
    .line 288
    .line 289
    move-result v5

    .line 290
    invoke-direct {v4, v2, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 291
    .line 292
    .line 293
    move-result v7

    .line 294
    invoke-direct {v4, v2, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 295
    .line 296
    .line 297
    move-result v8

    .line 298
    invoke-direct {v4, v2, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 299
    .line 300
    .line 301
    move-result v9

    .line 302
    invoke-virtual {v3, v5, v7, v8, v9}, Landroid/view/View;->setPadding(IIII)V

    .line 303
    .line 304
    .line 305
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 306
    .line 307
    const/4 v7, -0x1

    .line 308
    invoke-direct {v5, v7, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 309
    .line 310
    .line 311
    const/16 v7, 0xa

    .line 312
    .line 313
    invoke-direct {v4, v2, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 314
    .line 315
    .line 316
    move-result v8

    .line 317
    const/4 v9, 0x0

    .line 318
    invoke-virtual {v5, v9, v9, v9, v8}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v3, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 322
    .line 323
    .line 324
    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    .line 325
    .line 326
    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v5, v9}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 330
    .line 331
    .line 332
    const/16 v15, 0xc

    .line 333
    .line 334
    invoke-direct {v4, v2, v15}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 335
    .line 336
    .line 337
    move-result v8

    .line 338
    int-to-float v8, v8

    .line 339
    invoke-virtual {v5, v8}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 340
    .line 341
    .line 342
    move/from16 v8, p4

    .line 343
    .line 344
    invoke-virtual {v5, v8}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v3, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 348
    .line 349
    .line 350
    const-string v5, "\u542f\u7528\u9690\u85cf"

    .line 351
    .line 352
    const/high16 v9, 0x41700000    # 15.0f

    .line 353
    .line 354
    invoke-static {v2, v5, v9, v6}, Lt1;->i(Landroid/content/Context;Ljava/lang/String;FI)Landroid/widget/TextView;

    .line 355
    .line 356
    .line 357
    move-result-object v5

    .line 358
    invoke-direct {v4, v2, v15}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 359
    .line 360
    .line 361
    move-result v9

    .line 362
    invoke-direct {v4, v2, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 363
    .line 364
    .line 365
    move-result v10

    .line 366
    const/16 v14, 0x8

    .line 367
    .line 368
    invoke-direct {v4, v2, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 369
    .line 370
    .line 371
    move-result v15

    .line 372
    invoke-direct {v4, v2, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 373
    .line 374
    .line 375
    move-result v7

    .line 376
    invoke-virtual {v5, v9, v10, v15, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 377
    .line 378
    .line 379
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 380
    .line 381
    const/high16 v9, 0x3f800000    # 1.0f

    .line 382
    .line 383
    const/4 v10, 0x0

    .line 384
    invoke-direct {v7, v10, v12, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v5, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 391
    .line 392
    .line 393
    new-instance v5, Landroid/widget/TextView;

    .line 394
    .line 395
    invoke-direct {v5, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 396
    .line 397
    .line 398
    const/16 v7, 0xe

    .line 399
    .line 400
    invoke-direct {v4, v2, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 401
    .line 402
    .line 403
    move-result v9

    .line 404
    invoke-direct {v4, v2, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 405
    .line 406
    .line 407
    move-result v10

    .line 408
    invoke-direct {v4, v2, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 409
    .line 410
    .line 411
    move-result v7

    .line 412
    invoke-direct {v4, v2, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 413
    .line 414
    .line 415
    move-result v15

    .line 416
    invoke-virtual {v5, v9, v10, v7, v15}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 417
    .line 418
    .line 419
    const/16 v14, 0x11

    .line 420
    .line 421
    invoke-virtual {v5, v14}, Landroid/widget/TextView;->setGravity(I)V

    .line 422
    .line 423
    .line 424
    const/high16 v7, 0x41500000    # 13.0f

    .line 425
    .line 426
    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 427
    .line 428
    .line 429
    iget-boolean v7, v1, Lvt0;->d:Z

    .line 430
    .line 431
    invoke-direct {v4, v2, v5, v7}, Lvf0;->G3(Landroid/content/Context;Landroid/widget/TextView;Z)V

    .line 432
    .line 433
    .line 434
    iget-boolean v4, v1, Lvt0;->d:Z

    .line 435
    .line 436
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 437
    .line 438
    .line 439
    move-result-object v4

    .line 440
    invoke-virtual {v5, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    new-instance v4, Lxe0;

    .line 444
    .line 445
    const/4 v9, 0x0

    .line 446
    invoke-direct {v4, v2, v1, v11, v9}, Lxe0;-><init>(Landroid/content/Context;Lvt0;Landroid/content/SharedPreferences;I)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v5, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v13, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 456
    .line 457
    .line 458
    const/4 v1, 0x2

    .line 459
    invoke-direct {v0, v2, v1}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 460
    .line 461
    .line 462
    move-result v1

    .line 463
    invoke-direct {v0, v2, v13, v1}, Lvf0;->Z0(Landroid/content/Context;Landroid/widget/LinearLayout;I)V

    .line 464
    .line 465
    .line 466
    invoke-interface/range {v18 .. v18}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 467
    .line 468
    .line 469
    move-result-object v15

    .line 470
    :goto_3
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 471
    .line 472
    .line 473
    move-result v1

    .line 474
    if-eqz v1, :cond_3

    .line 475
    .line 476
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v1

    .line 480
    check-cast v1, Lvf0$l;

    .line 481
    .line 482
    invoke-virtual {v1}, Lvf0$l;->j()Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v3

    .line 486
    invoke-virtual {v1}, Lvf0$l;->g()Z

    .line 487
    .line 488
    .line 489
    move-result v4

    .line 490
    invoke-interface {v11, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 491
    .line 492
    .line 493
    move-result v9

    .line 494
    sget-object v3, Lvf0;->a:Lvf0;

    .line 495
    .line 496
    move-object v4, v3

    .line 497
    invoke-virtual {v1}, Lvf0$l;->i()Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v3

    .line 501
    move-object v5, v4

    .line 502
    invoke-virtual {v1}, Lvf0$l;->h()Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object v4

    .line 506
    invoke-virtual {v1}, Lvf0$l;->h()Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v7

    .line 510
    new-instance v10, Ljava/lang/StringBuilder;

    .line 511
    .line 512
    const-string v14, "\u9996\u9875\u9876\u90e8"

    .line 513
    .line 514
    invoke-direct {v10, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 518
    .line 519
    .line 520
    const-string v7, "Tab\u6309\u94ae\uff0c\u8bbe\u7f6e\u540e\u5de6\u53f3\u6ed1\u52a8\u9996\u9875\u751f\u6548\uff0c\u91cd\u542f\u4e5f\u9700\u6ed1\u52a8\u89e6\u53d1"

    .line 521
    .line 522
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v7

    .line 529
    new-instance v10, Lc;

    .line 530
    .line 531
    const/16 v14, 0xc

    .line 532
    .line 533
    invoke-direct {v10, v14, v11, v1}, Lc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 534
    .line 535
    .line 536
    move-object v1, v5

    .line 537
    move-object v5, v7

    .line 538
    move-object/from16 v21, v19

    .line 539
    .line 540
    move-object/from16 v14, v20

    .line 541
    .line 542
    move/from16 v7, p3

    .line 543
    .line 544
    invoke-direct/range {v1 .. v10}, Lvf0;->x1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIZLsw;)Landroid/view/View;

    .line 545
    .line 546
    .line 547
    move-result-object v1

    .line 548
    invoke-virtual {v13, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 549
    .line 550
    .line 551
    move/from16 v6, p2

    .line 552
    .line 553
    move/from16 v8, p4

    .line 554
    .line 555
    const/16 v14, 0x11

    .line 556
    .line 557
    goto :goto_3

    .line 558
    :cond_3
    move-object/from16 v21, v19

    .line 559
    .line 560
    move-object/from16 v14, v20

    .line 561
    .line 562
    new-instance v1, Landroid/widget/LinearLayout;

    .line 563
    .line 564
    invoke-direct {v1, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 565
    .line 566
    .line 567
    const/4 v9, 0x0

    .line 568
    invoke-virtual {v1, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 569
    .line 570
    .line 571
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 572
    .line 573
    const/4 v7, -0x1

    .line 574
    invoke-direct {v3, v7, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 575
    .line 576
    .line 577
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 578
    .line 579
    .line 580
    const/16 v3, 0x8c

    .line 581
    .line 582
    const/16 v4, 0x50

    .line 583
    .line 584
    if-eqz v16, :cond_4

    .line 585
    .line 586
    const/16 v5, 0x5a

    .line 587
    .line 588
    invoke-static {v3, v4, v4, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 589
    .line 590
    .line 591
    move-result v3

    .line 592
    goto :goto_4

    .line 593
    :cond_4
    const/16 v5, 0xd2

    .line 594
    .line 595
    const/16 v6, 0xc8

    .line 596
    .line 597
    invoke-static {v3, v6, v6, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 598
    .line 599
    .line 600
    move-result v3

    .line 601
    :goto_4
    if-eqz v16, :cond_5

    .line 602
    .line 603
    const/4 v7, -0x1

    .line 604
    goto :goto_5

    .line 605
    :cond_5
    const/16 v5, 0x3c

    .line 606
    .line 607
    const/16 v6, 0x32

    .line 608
    .line 609
    const/16 v7, 0xff

    .line 610
    .line 611
    invoke-static {v7, v6, v6, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 612
    .line 613
    .line 614
    move-result v7

    .line 615
    :goto_5
    const-string v5, "\u5173\u95ed"

    .line 616
    .line 617
    const/high16 v6, 0x41600000    # 14.0f

    .line 618
    .line 619
    const/16 v8, 0x11

    .line 620
    .line 621
    invoke-static {v2, v5, v6, v7, v8}, Lt1;->j(Landroid/content/Context;Ljava/lang/String;FII)Landroid/widget/TextView;

    .line 622
    .line 623
    .line 624
    move-result-object v5

    .line 625
    const/4 v9, 0x0

    .line 626
    invoke-static {v9}, Lt1;->h(I)Landroid/graphics/drawable/GradientDrawable;

    .line 627
    .line 628
    .line 629
    move-result-object v7

    .line 630
    sget-object v8, Lvf0;->a:Lvf0;

    .line 631
    .line 632
    const/16 v10, 0x1c

    .line 633
    .line 634
    invoke-direct {v8, v2, v10}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 635
    .line 636
    .line 637
    move-result v11

    .line 638
    int-to-float v11, v11

    .line 639
    invoke-virtual {v7, v11}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 640
    .line 641
    .line 642
    invoke-virtual {v7, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 643
    .line 644
    .line 645
    invoke-virtual {v5, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 646
    .line 647
    .line 648
    const/16 v3, 0xc

    .line 649
    .line 650
    invoke-direct {v8, v2, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 651
    .line 652
    .line 653
    move-result v7

    .line 654
    invoke-direct {v8, v2, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 655
    .line 656
    .line 657
    move-result v11

    .line 658
    invoke-virtual {v5, v9, v7, v9, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 659
    .line 660
    .line 661
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 662
    .line 663
    const/high16 v7, 0x3f800000    # 1.0f

    .line 664
    .line 665
    invoke-direct {v3, v9, v12, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 666
    .line 667
    .line 668
    const/4 v7, 0x6

    .line 669
    invoke-direct {v8, v2, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 670
    .line 671
    .line 672
    move-result v11

    .line 673
    invoke-virtual {v3, v9, v9, v11, v9}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 674
    .line 675
    .line 676
    invoke-virtual {v5, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 677
    .line 678
    .line 679
    new-instance v3, Luy;

    .line 680
    .line 681
    move-object/from16 v11, v17

    .line 682
    .line 683
    const/4 v15, 0x4

    .line 684
    invoke-direct {v3, v11, v15}, Luy;-><init>(Landroid/app/Dialog;I)V

    .line 685
    .line 686
    .line 687
    invoke-virtual {v5, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 688
    .line 689
    .line 690
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 691
    .line 692
    .line 693
    const-string v3, "\u5b8c\u6210"

    .line 694
    .line 695
    const/16 v5, 0x11

    .line 696
    .line 697
    const/4 v15, -0x1

    .line 698
    invoke-static {v2, v3, v6, v15, v5}, Lt1;->j(Landroid/content/Context;Ljava/lang/String;FII)Landroid/widget/TextView;

    .line 699
    .line 700
    .line 701
    move-result-object v3

    .line 702
    invoke-static {v9}, Lt1;->h(I)Landroid/graphics/drawable/GradientDrawable;

    .line 703
    .line 704
    .line 705
    move-result-object v5

    .line 706
    invoke-direct {v8, v2, v10}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 707
    .line 708
    .line 709
    move-result v6

    .line 710
    int-to-float v6, v6

    .line 711
    invoke-virtual {v5, v6}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 712
    .line 713
    .line 714
    const/16 v6, 0xdc

    .line 715
    .line 716
    const/16 v15, 0xb4

    .line 717
    .line 718
    invoke-static {v6, v9, v15, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 719
    .line 720
    .line 721
    move-result v4

    .line 722
    invoke-virtual {v5, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 723
    .line 724
    .line 725
    invoke-virtual {v3, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 726
    .line 727
    .line 728
    const/16 v4, 0xc

    .line 729
    .line 730
    invoke-direct {v8, v2, v4}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 731
    .line 732
    .line 733
    move-result v5

    .line 734
    invoke-direct {v8, v2, v4}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 735
    .line 736
    .line 737
    move-result v4

    .line 738
    invoke-virtual {v3, v9, v5, v9, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 739
    .line 740
    .line 741
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 742
    .line 743
    const/high16 v5, 0x3f800000    # 1.0f

    .line 744
    .line 745
    invoke-direct {v4, v9, v12, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 746
    .line 747
    .line 748
    invoke-direct {v8, v2, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 749
    .line 750
    .line 751
    move-result v5

    .line 752
    invoke-virtual {v4, v5, v9, v9, v9}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 753
    .line 754
    .line 755
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 756
    .line 757
    .line 758
    new-instance v4, Luy;

    .line 759
    .line 760
    const/4 v5, 0x5

    .line 761
    invoke-direct {v4, v11, v5}, Luy;-><init>(Landroid/app/Dialog;I)V

    .line 762
    .line 763
    .line 764
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 765
    .line 766
    .line 767
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 768
    .line 769
    .line 770
    const/16 v9, 0x10

    .line 771
    .line 772
    invoke-direct {v0, v2, v9}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 773
    .line 774
    .line 775
    move-result v3

    .line 776
    const/16 v4, 0x8

    .line 777
    .line 778
    invoke-direct {v0, v2, v4}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 779
    .line 780
    .line 781
    move-result v4

    .line 782
    invoke-direct {v0, v2, v9}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 783
    .line 784
    .line 785
    move-result v5

    .line 786
    invoke-direct {v0, v2, v9}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 787
    .line 788
    .line 789
    move-result v6

    .line 790
    invoke-virtual {v1, v3, v4, v5, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 791
    .line 792
    .line 793
    move-object/from16 v3, v21

    .line 794
    .line 795
    invoke-virtual {v3, v13}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 796
    .line 797
    .line 798
    invoke-virtual {v14, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 799
    .line 800
    .line 801
    invoke-virtual {v14, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 802
    .line 803
    .line 804
    invoke-virtual {v11, v14}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 805
    .line 806
    .line 807
    invoke-virtual {v11}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 808
    .line 809
    .line 810
    move-result-object v1

    .line 811
    if-eqz v1, :cond_6

    .line 812
    .line 813
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 814
    .line 815
    .line 816
    move-result-object v3

    .line 817
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 818
    .line 819
    .line 820
    move-result-object v3

    .line 821
    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 822
    .line 823
    int-to-double v3, v3

    .line 824
    const-wide v5, 0x3feb333333333333L    # 0.85

    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    mul-double/2addr v3, v5

    .line 830
    double-to-int v3, v3

    .line 831
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 832
    .line 833
    .line 834
    move-result-object v4

    .line 835
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 836
    .line 837
    .line 838
    move-result-object v4

    .line 839
    iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 840
    .line 841
    int-to-double v4, v4

    .line 842
    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    .line 843
    .line 844
    mul-double/2addr v4, v6

    .line 845
    double-to-int v4, v4

    .line 846
    invoke-virtual {v1, v3, v4}, Landroid/view/Window;->setLayout(II)V

    .line 847
    .line 848
    .line 849
    :cond_6
    invoke-virtual {v11}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 850
    .line 851
    .line 852
    move-result-object v1

    .line 853
    if-eqz v1, :cond_7

    .line 854
    .line 855
    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    .line 856
    .line 857
    const/4 v9, 0x0

    .line 858
    invoke-direct {v3, v9}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 859
    .line 860
    .line 861
    invoke-virtual {v1, v3}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 862
    .line 863
    .line 864
    :cond_7
    invoke-virtual {v11}, Landroid/app/Dialog;->show()V

    .line 865
    .line 866
    .line 867
    invoke-direct {v0, v2, v11, v10}, Lvf0;->z1(Landroid/content/Context;Landroid/app/Dialog;I)V

    .line 868
    .line 869
    .line 870
    return-void
.end method

.method public static synthetic C(Landroid/content/Context;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->I1(Landroid/content/Context;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic C0(Landroid/content/Context;IIILandroid/content/SharedPreferences;Landroid/widget/LinearLayout;)Lna1;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lvf0;->t2(Landroid/content/Context;IIILandroid/content/SharedPreferences;Landroid/widget/LinearLayout;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final C1(Landroid/content/Context;IIILjava/lang/String;JLjava/lang/String;Landroid/widget/LinearLayout;)Lna1;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p8

    .line 10
    .line 11
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v5, Landroid/widget/LinearLayout;

    .line 15
    .line 16
    invoke-direct {v5, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 21
    .line 22
    .line 23
    const/16 v7, 0x10

    .line 24
    .line 25
    invoke-virtual {v5, v7}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 26
    .line 27
    .line 28
    sget-object v8, Lvf0;->a:Lvf0;

    .line 29
    .line 30
    const/16 v9, 0xe

    .line 31
    .line 32
    invoke-direct {v8, v0, v9}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 33
    .line 34
    .line 35
    move-result v10

    .line 36
    const/16 v11, 0x8

    .line 37
    .line 38
    invoke-direct {v8, v0, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 39
    .line 40
    .line 41
    move-result v12

    .line 42
    invoke-direct {v8, v0, v9}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 43
    .line 44
    .line 45
    move-result v13

    .line 46
    const/4 v14, 0x4

    .line 47
    invoke-direct {v8, v0, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 48
    .line 49
    .line 50
    move-result v15

    .line 51
    invoke-virtual {v5, v10, v12, v13, v15}, Landroid/view/View;->setPadding(IIII)V

    .line 52
    .line 53
    .line 54
    const-string v10, "\u6a21\u5757\u7248\u672c"

    .line 55
    .line 56
    const/high16 v12, 0x41500000    # 13.0f

    .line 57
    .line 58
    invoke-static {v0, v10, v12, v2}, Lt1;->i(Landroid/content/Context;Ljava/lang/String;FI)Landroid/widget/TextView;

    .line 59
    .line 60
    .line 61
    move-result-object v10

    .line 62
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    .line 63
    .line 64
    const/4 v15, -0x2

    .line 65
    const/high16 v11, 0x3f800000    # 1.0f

    .line 66
    .line 67
    invoke-direct {v13, v6, v15, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v10, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 71
    .line 72
    .line 73
    new-instance v13, Landroid/widget/TextView;

    .line 74
    .line 75
    invoke-direct {v13, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 76
    .line 77
    .line 78
    const-string v11, "v3.0.1 (30121)"

    .line 79
    .line 80
    invoke-virtual {v13, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v13, v12}, Landroid/widget/TextView;->setTextSize(F)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v13, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v5, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v5, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 96
    .line 97
    .line 98
    invoke-direct {v8, v0, v1}, Lvf0;->g1(Landroid/content/Context;I)Landroid/view/View;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 103
    .line 104
    .line 105
    new-instance v5, Landroid/widget/LinearLayout;

    .line 106
    .line 107
    invoke-direct {v5, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v5, v7}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 114
    .line 115
    .line 116
    invoke-direct {v8, v0, v9}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 117
    .line 118
    .line 119
    move-result v10

    .line 120
    invoke-direct {v8, v0, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 121
    .line 122
    .line 123
    move-result v11

    .line 124
    invoke-direct {v8, v0, v9}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 125
    .line 126
    .line 127
    move-result v13

    .line 128
    const/16 v14, 0x8

    .line 129
    .line 130
    invoke-direct {v8, v0, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 131
    .line 132
    .line 133
    move-result v9

    .line 134
    invoke-virtual {v5, v10, v11, v13, v9}, Landroid/view/View;->setPadding(IIII)V

    .line 135
    .line 136
    .line 137
    const-string v9, "\u5f53\u524d\u7248\u672c"

    .line 138
    .line 139
    invoke-static {v0, v9, v12, v2}, Lt1;->i(Landroid/content/Context;Ljava/lang/String;FI)Landroid/widget/TextView;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 144
    .line 145
    const/high16 v11, 0x3f800000    # 1.0f

    .line 146
    .line 147
    invoke-direct {v10, v6, v15, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v9, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 151
    .line 152
    .line 153
    new-instance v10, Landroid/widget/TextView;

    .line 154
    .line 155
    invoke-direct {v10, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 156
    .line 157
    .line 158
    new-instance v11, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 161
    .line 162
    .line 163
    move-object/from16 v13, p4

    .line 164
    .line 165
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    const-string v13, " ("

    .line 169
    .line 170
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    move-wide/from16 v13, p5

    .line 174
    .line 175
    invoke-virtual {v11, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    const-string v13, ")"

    .line 179
    .line 180
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v11

    .line 187
    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v10, v12}, Landroid/widget/TextView;->setTextSize(F)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v10, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v5, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v5, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 203
    .line 204
    .line 205
    invoke-direct {v8, v0, v1}, Lvf0;->g1(Landroid/content/Context;I)Landroid/view/View;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-virtual {v4, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 210
    .line 211
    .line 212
    new-instance v1, Landroid/widget/LinearLayout;

    .line 213
    .line 214
    invoke-direct {v1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1, v7}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 221
    .line 222
    .line 223
    const/16 v5, 0xe

    .line 224
    .line 225
    invoke-direct {v8, v0, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 226
    .line 227
    .line 228
    move-result v7

    .line 229
    const/4 v9, 0x4

    .line 230
    invoke-direct {v8, v0, v9}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 231
    .line 232
    .line 233
    move-result v9

    .line 234
    invoke-direct {v8, v0, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    const/16 v14, 0x8

    .line 239
    .line 240
    invoke-direct {v8, v0, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 241
    .line 242
    .line 243
    move-result v8

    .line 244
    invoke-virtual {v1, v7, v9, v5, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 245
    .line 246
    .line 247
    const-string v5, "\u63a8\u8350\u7248\u672c"

    .line 248
    .line 249
    invoke-static {v0, v5, v12, v2}, Lt1;->i(Landroid/content/Context;Ljava/lang/String;FI)Landroid/widget/TextView;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 254
    .line 255
    const/high16 v11, 0x3f800000    # 1.0f

    .line 256
    .line 257
    invoke-direct {v5, v6, v15, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v2, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 261
    .line 262
    .line 263
    new-instance v5, Landroid/widget/TextView;

    .line 264
    .line 265
    invoke-direct {v5, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 266
    .line 267
    .line 268
    move-object/from16 v0, p7

    .line 269
    .line 270
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v5, v12}, Landroid/widget/TextView;->setTextSize(F)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v4, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 286
    .line 287
    .line 288
    sget-object v0, Lna1;->a:Lna1;

    .line 289
    .line 290
    return-object v0
.end method

.method private static final C2(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    return-void
.end method

.method private static final C3(Landroid/content/Context;Lvt0;Landroid/content/SharedPreferences;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    check-cast v0, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    xor-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p3, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    sget-object v1, Lvf0;->a:Lvf0;

    .line 24
    .line 25
    check-cast p3, Landroid/widget/TextView;

    .line 26
    .line 27
    invoke-direct {v1, p0, p3, v0}, Lvf0;->G3(Landroid/content/Context;Landroid/widget/TextView;Z)V

    .line 28
    .line 29
    .line 30
    iput-boolean v0, p1, Lvt0;->d:Z

    .line 31
    .line 32
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const-string p1, "hide_home_follow"

    .line 37
    .line 38
    invoke-interface {p0, p1, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const-string p1, "hide_home_explore"

    .line 43
    .line 44
    invoke-interface {p0, p1, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    const-string p1, "hide_home_worldcup"

    .line 49
    .line 50
    invoke-interface {p0, p1, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    const-string p1, "hide_home_local"

    .line 55
    .line 56
    invoke-interface {p0, p1, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public static synthetic D(Landroid/content/Context;IIZLandroid/content/SharedPreferences;Landroid/widget/LinearLayout;)Lna1;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lvf0;->k2(Landroid/content/Context;IIZLandroid/content/SharedPreferences;Landroid/widget/LinearLayout;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic D0(Landroid/content/SharedPreferences;Z)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->g2(Landroid/content/SharedPreferences;Z)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final D1(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;)Z
    .locals 3

    .line 1
    const-string p2, "vibrator"

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p2, Landroid/os/Vibrator;

    .line 11
    .line 12
    const-wide/16 v0, 0x32

    .line 13
    .line 14
    const/4 v2, -0x1

    .line 15
    invoke-static {v0, v1, v2}, Landroid/os/VibrationEffect;->createOneShot(JI)Landroid/os/VibrationEffect;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p2, v0}, Landroid/os/Vibrator;->vibrate(Landroid/os/VibrationEffect;)V

    .line 20
    .line 21
    .line 22
    const-string p2, "clipboard"

    .line 23
    .line 24
    invoke-virtual {p0, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    check-cast p2, Landroid/content/ClipboardManager;

    .line 32
    .line 33
    const-string v0, "version_info"

    .line 34
    .line 35
    invoke-static {v0, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p2, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 40
    .line 41
    .line 42
    const-string p1, "\u5df2\u5168\u90e8\u590d\u5236"

    .line 43
    .line 44
    const/4 p2, 0x0

    .line 45
    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x1

    .line 53
    return p0
.end method

.method private static final D2(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final D3(Landroid/content/SharedPreferences;Lvf0$l;Z)Lna1;
    .locals 0

    .line 1
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1}, Lvf0$l;->j()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lna1;->a:Lna1;

    .line 17
    .line 18
    return-object p0
.end method

.method public static synthetic E(Landroid/content/Context;IIILandroid/widget/LinearLayout;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lvf0;->v2(Landroid/content/Context;IIILandroid/widget/LinearLayout;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic E0(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->d3(Landroid/app/Dialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final E1(Landroid/content/Context;Landroid/widget/LinearLayout;)Lna1;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/widget/LinearLayout;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x11

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 16
    .line 17
    .line 18
    sget-object v2, Lvf0;->a:Lvf0;

    .line 19
    .line 20
    const/16 v3, 0xe

    .line 21
    .line 22
    invoke-direct {v2, p0, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    const/16 v5, 0xc

    .line 27
    .line 28
    invoke-direct {v2, p0, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    invoke-direct {v2, p0, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-direct {v2, p0, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-virtual {v0, v4, v6, v3, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 41
    .line 42
    .line 43
    new-instance v2, Landroid/widget/TextView;

    .line 44
    .line 45
    invoke-direct {v2, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 46
    .line 47
    .line 48
    const-string p0, "\u81f4\u8c22\u540d\u5355 \u2192"

    .line 49
    .line 50
    invoke-virtual {v2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    const/high16 p0, 0x41600000    # 14.0f

    .line 54
    .line 55
    invoke-virtual {v2, p0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 56
    .line 57
    .line 58
    const/16 p0, 0x2c

    .line 59
    .line 60
    const/16 v3, 0x55

    .line 61
    .line 62
    const/16 v4, 0xff

    .line 63
    .line 64
    const/16 v5, 0xfe

    .line 65
    .line 66
    invoke-static {v4, v5, p0, v3}, Landroid/graphics/Color;->argb(IIII)I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    invoke-virtual {v2, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 71
    .line 72
    .line 73
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 74
    .line 75
    invoke-virtual {v2, p0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 85
    .line 86
    .line 87
    sget-object p0, Lna1;->a:Lna1;

    .line 88
    .line 89
    return-object p0
.end method

.method private final E2(Landroid/content/Context;IIILandroid/content/SharedPreferences;)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    sget-object v2, Lm00;->S:Lm00$a;

    .line 6
    .line 7
    invoke-virtual {v2}, Lm00$a;->n()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const-string v3, "666"

    .line 12
    .line 13
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v3, v2

    .line 21
    :goto_0
    new-instance v2, Landroid/app/Dialog;

    .line 22
    .line 23
    invoke-direct {v2, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    new-instance v4, Landroid/widget/LinearLayout;

    .line 27
    .line 28
    invoke-direct {v4, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 29
    .line 30
    .line 31
    const/4 v5, 0x1

    .line 32
    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 33
    .line 34
    .line 35
    sget-object v5, Lvf0;->a:Lvf0;

    .line 36
    .line 37
    const/16 v6, 0x18

    .line 38
    .line 39
    invoke-direct {v5, v0, v6}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    invoke-direct {v5, v0, v6}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    invoke-direct {v5, v0, v6}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    const/16 v10, 0x10

    .line 52
    .line 53
    invoke-direct {v5, v0, v10}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 54
    .line 55
    .line 56
    move-result v11

    .line 57
    invoke-virtual {v4, v7, v8, v9, v11}, Landroid/view/View;->setPadding(IIII)V

    .line 58
    .line 59
    .line 60
    const/4 v7, -0x1

    .line 61
    invoke-virtual {v4, v7}, Landroid/view/View;->setBackgroundColor(I)V

    .line 62
    .line 63
    .line 64
    new-instance v8, Landroid/widget/TextView;

    .line 65
    .line 66
    invoke-direct {v8, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 67
    .line 68
    .line 69
    const-string v9, "\u8bbe\u7f6e\u7c89\u4e1d\u6570"

    .line 70
    .line 71
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 72
    .line 73
    .line 74
    const/high16 v9, 0x41900000    # 18.0f

    .line 75
    .line 76
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 77
    .line 78
    .line 79
    const/16 v9, 0xff

    .line 80
    .line 81
    const/16 v11, 0x1e

    .line 82
    .line 83
    invoke-static {v9, v11, v11, v11}, Landroid/graphics/Color;->argb(IIII)I

    .line 84
    .line 85
    .line 86
    move-result v12

    .line 87
    invoke-virtual {v8, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 88
    .line 89
    .line 90
    const/16 v12, 0xc

    .line 91
    .line 92
    invoke-direct {v5, v0, v12}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 93
    .line 94
    .line 95
    move-result v13

    .line 96
    const/4 v14, 0x0

    .line 97
    invoke-virtual {v8, v14, v14, v14, v13}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 101
    .line 102
    .line 103
    new-instance v8, Landroid/widget/EditText;

    .line 104
    .line 105
    invoke-direct {v8, v0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v8, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 109
    .line 110
    .line 111
    const/high16 v13, 0x41800000    # 16.0f

    .line 112
    .line 113
    invoke-virtual {v8, v13}, Landroid/widget/TextView;->setTextSize(F)V

    .line 114
    .line 115
    .line 116
    invoke-static {v9, v11, v11, v11}, Landroid/graphics/Color;->argb(IIII)I

    .line 117
    .line 118
    .line 119
    move-result v11

    .line 120
    invoke-virtual {v8, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 121
    .line 122
    .line 123
    invoke-direct {v5, v0, v12}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 124
    .line 125
    .line 126
    move-result v11

    .line 127
    const/16 v13, 0xa

    .line 128
    .line 129
    invoke-direct {v5, v0, v13}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 130
    .line 131
    .line 132
    move-result v15

    .line 133
    invoke-direct {v5, v0, v12}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 134
    .line 135
    .line 136
    move-result v6

    .line 137
    invoke-direct {v5, v0, v13}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 138
    .line 139
    .line 140
    move-result v12

    .line 141
    invoke-virtual {v8, v11, v15, v6, v12}, Landroid/view/View;->setPadding(IIII)V

    .line 142
    .line 143
    .line 144
    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    .line 145
    .line 146
    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v6, v14}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 150
    .line 151
    .line 152
    invoke-direct {v5, v0, v13}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 153
    .line 154
    .line 155
    move-result v11

    .line 156
    int-to-float v11, v11

    .line 157
    invoke-virtual {v6, v11}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 158
    .line 159
    .line 160
    const/16 v11, 0x28

    .line 161
    .line 162
    invoke-static {v11, v14, v14, v14}, Landroid/graphics/Color;->argb(IIII)I

    .line 163
    .line 164
    .line 165
    move-result v11

    .line 166
    invoke-virtual {v6, v11}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v8, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 170
    .line 171
    .line 172
    const/4 v6, 0x2

    .line 173
    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setInputType(I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    invoke-virtual {v8, v3}, Landroid/widget/EditText;->setSelection(I)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v4, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 184
    .line 185
    .line 186
    new-instance v3, Landroid/widget/TextView;

    .line 187
    .line 188
    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 189
    .line 190
    .line 191
    const-string v6, "\u4fee\u6539\u5b8c\u6bd5\u540e\u9700\u5728\u4e2a\u4eba\u4e3b\u9875\u4e0b\u62c9\u5237\u65b0\u751f\u6548"

    .line 192
    .line 193
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 194
    .line 195
    .line 196
    const/high16 v6, 0x41400000    # 12.0f

    .line 197
    .line 198
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setTextSize(F)V

    .line 199
    .line 200
    .line 201
    const/16 v6, 0x96

    .line 202
    .line 203
    const/16 v11, 0x64

    .line 204
    .line 205
    invoke-static {v6, v11, v11, v11}, Landroid/graphics/Color;->argb(IIII)I

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 210
    .line 211
    .line 212
    const/16 v6, 0x11

    .line 213
    .line 214
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 215
    .line 216
    .line 217
    const/4 v12, 0x6

    .line 218
    invoke-direct {v5, v0, v12}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 219
    .line 220
    .line 221
    move-result v12

    .line 222
    invoke-virtual {v3, v14, v12, v14, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 226
    .line 227
    .line 228
    new-instance v3, Landroid/widget/LinearLayout;

    .line 229
    .line 230
    invoke-direct {v3, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v3, v14}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 234
    .line 235
    .line 236
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    .line 237
    .line 238
    const/4 v13, -0x2

    .line 239
    invoke-direct {v12, v7, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 240
    .line 241
    .line 242
    invoke-direct {v5, v0, v10}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 243
    .line 244
    .line 245
    move-result v15

    .line 246
    invoke-virtual {v12, v14, v15, v14, v14}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v3, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 250
    .line 251
    .line 252
    new-instance v12, Landroid/widget/TextView;

    .line 253
    .line 254
    invoke-direct {v12, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 255
    .line 256
    .line 257
    const-string v15, "\u53d6\u6d88"

    .line 258
    .line 259
    invoke-virtual {v12, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 260
    .line 261
    .line 262
    const/high16 v15, 0x41600000    # 14.0f

    .line 263
    .line 264
    invoke-virtual {v12, v15}, Landroid/widget/TextView;->setTextSize(F)V

    .line 265
    .line 266
    .line 267
    invoke-static {v9, v11, v11, v11}, Landroid/graphics/Color;->argb(IIII)I

    .line 268
    .line 269
    .line 270
    move-result v9

    .line 271
    invoke-virtual {v12, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v12, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 275
    .line 276
    .line 277
    new-instance v9, Landroid/graphics/drawable/GradientDrawable;

    .line 278
    .line 279
    invoke-direct {v9}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v9, v14}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 283
    .line 284
    .line 285
    const/16 v11, 0x18

    .line 286
    .line 287
    invoke-direct {v5, v0, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 288
    .line 289
    .line 290
    move-result v6

    .line 291
    int-to-float v6, v6

    .line 292
    invoke-virtual {v9, v6}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 293
    .line 294
    .line 295
    const/16 v6, 0x3c

    .line 296
    .line 297
    const/16 v11, 0xc8

    .line 298
    .line 299
    invoke-static {v6, v11, v11, v11}, Landroid/graphics/Color;->argb(IIII)I

    .line 300
    .line 301
    .line 302
    move-result v6

    .line 303
    invoke-virtual {v9, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v12, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 307
    .line 308
    .line 309
    const/16 v6, 0xc

    .line 310
    .line 311
    invoke-direct {v5, v0, v6}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 312
    .line 313
    .line 314
    move-result v9

    .line 315
    invoke-direct {v5, v0, v6}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 316
    .line 317
    .line 318
    move-result v11

    .line 319
    invoke-virtual {v12, v14, v9, v14, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 320
    .line 321
    .line 322
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 323
    .line 324
    const/high16 v9, 0x3f800000    # 1.0f

    .line 325
    .line 326
    invoke-direct {v6, v14, v13, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 327
    .line 328
    .line 329
    const/16 v11, 0x8

    .line 330
    .line 331
    invoke-direct {v5, v0, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 332
    .line 333
    .line 334
    move-result v9

    .line 335
    invoke-virtual {v6, v14, v14, v9, v14}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 339
    .line 340
    .line 341
    new-instance v6, Luy;

    .line 342
    .line 343
    invoke-direct {v6, v2, v10}, Luy;-><init>(Landroid/app/Dialog;I)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v3, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 350
    .line 351
    .line 352
    const-string v6, "\u4fdd\u5b58"

    .line 353
    .line 354
    const/16 v9, 0x11

    .line 355
    .line 356
    invoke-static {v0, v6, v15, v7, v9}, Lt1;->j(Landroid/content/Context;Ljava/lang/String;FII)Landroid/widget/TextView;

    .line 357
    .line 358
    .line 359
    move-result-object v6

    .line 360
    invoke-static {v14}, Lt1;->h(I)Landroid/graphics/drawable/GradientDrawable;

    .line 361
    .line 362
    .line 363
    move-result-object v7

    .line 364
    const/16 v9, 0x18

    .line 365
    .line 366
    invoke-direct {v5, v0, v9}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 367
    .line 368
    .line 369
    move-result v9

    .line 370
    int-to-float v9, v9

    .line 371
    invoke-virtual {v7, v9}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 372
    .line 373
    .line 374
    const/16 v9, 0xb4

    .line 375
    .line 376
    const/16 v10, 0x50

    .line 377
    .line 378
    const/16 v12, 0xdc

    .line 379
    .line 380
    invoke-static {v12, v14, v9, v10}, Landroid/graphics/Color;->argb(IIII)I

    .line 381
    .line 382
    .line 383
    move-result v9

    .line 384
    invoke-virtual {v7, v9}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v6, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 388
    .line 389
    .line 390
    const/16 v7, 0xc

    .line 391
    .line 392
    invoke-direct {v5, v0, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 393
    .line 394
    .line 395
    move-result v9

    .line 396
    invoke-direct {v5, v0, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 397
    .line 398
    .line 399
    move-result v7

    .line 400
    invoke-virtual {v6, v14, v9, v14, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 401
    .line 402
    .line 403
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 404
    .line 405
    const/high16 v9, 0x3f800000    # 1.0f

    .line 406
    .line 407
    invoke-direct {v7, v14, v13, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 408
    .line 409
    .line 410
    invoke-direct {v5, v0, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 411
    .line 412
    .line 413
    move-result v5

    .line 414
    invoke-virtual {v7, v5, v14, v14, v14}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v6, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 418
    .line 419
    .line 420
    new-instance v5, Lvy;

    .line 421
    .line 422
    const/4 v7, 0x3

    .line 423
    invoke-direct {v5, v8, v1, v2, v7}, Lvy;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroid/app/Dialog;I)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v6, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v3, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v2, v4}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    if-eqz v1, :cond_1

    .line 443
    .line 444
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 445
    .line 446
    .line 447
    move-result-object v3

    .line 448
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 453
    .line 454
    int-to-double v3, v3

    .line 455
    const-wide v5, 0x3fe999999999999aL    # 0.8

    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    mul-double/2addr v3, v5

    .line 461
    double-to-int v3, v3

    .line 462
    invoke-virtual {v1, v3, v13}, Landroid/view/Window;->setLayout(II)V

    .line 463
    .line 464
    .line 465
    :cond_1
    invoke-virtual {v2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    if-eqz v1, :cond_2

    .line 470
    .line 471
    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    .line 472
    .line 473
    invoke-direct {v3, v14}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v1, v3}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 477
    .line 478
    .line 479
    :cond_2
    invoke-virtual {v2}, Landroid/app/Dialog;->show()V

    .line 480
    .line 481
    .line 482
    const/16 v1, 0x14

    .line 483
    .line 484
    move-object/from16 v3, p0

    .line 485
    .line 486
    invoke-direct {v3, v0, v2, v1}, Lvf0;->z1(Landroid/content/Context;Landroid/app/Dialog;I)V

    .line 487
    .line 488
    .line 489
    return-void
.end method

.method private static final E3(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic F(Landroid/content/Context;II)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lvf0;->a2(Landroid/content/Context;II)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic F0(Landroid/content/Context;II)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lvf0;->Y1(Landroid/content/Context;II)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final F1(Landroid/content/Context;Landroid/view/View;)V
    .locals 2

    .line 1
    sget-object p1, Lvf0;->a:Lvf0;

    .line 2
    .line 3
    new-instance v0, Lbf0;

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-direct {v0, p0, v1}, Lbf0;-><init>(Landroid/content/Context;I)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p1, p0, v0}, Lvf0;->S2(Landroid/content/Context;Lhw;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private static final F2(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final F3(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic G(Lhw;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->Y0(Lhw;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic G0()V
    .locals 0

    .line 1
    invoke-static {}, Lvf0;->i3()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final G1(Landroid/content/Context;)Lna1;
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "top.anjao2024.xp1whs"

    .line 7
    .line 8
    const-string v2, "top.anjao2024.xp1whs.MainActivity"

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 11
    .line 12
    .line 13
    const-string v1, "open_tab"

    .line 14
    .line 15
    const-string v2, "thanks"

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 18
    .line 19
    .line 20
    const/high16 v1, 0x10000000

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lna1;->a:Lna1;

    .line 29
    .line 30
    return-object p0
.end method

.method private static final G2(Landroid/widget/EditText;Landroid/content/SharedPreferences;Landroid/app/Dialog;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

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
    invoke-static {p0}, Lk41;->g0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    if-lez p3, :cond_2

    .line 22
    .line 23
    const/4 p3, 0x0

    .line 24
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-ge p3, v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0, p3}, Ljava/lang/String;->charAt(I)C

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-static {v0}, Ljava/lang/Character;->isDigit(C)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    add-int/lit8 p3, p3, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-static {p0}, Lr41;->T(Ljava/lang/String;)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    if-eqz p3, :cond_2

    .line 49
    .line 50
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    sget-object p3, Lm00;->S:Lm00$a;

    .line 55
    .line 56
    invoke-virtual {p3}, Lm00$a;->n()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    invoke-interface {p1, p3, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 65
    .line 66
    .line 67
    :cond_2
    :goto_1
    invoke-virtual {p2}, Landroid/app/Dialog;->dismiss()V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method private final G3(Landroid/content/Context;Landroid/widget/TextView;Z)V
    .locals 2

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    const-string p0, "\u2713 \u5df2\u5f00\u542f"

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string p0, "\u2717 \u5df2\u5173\u95ed"

    .line 7
    .line 8
    :goto_0
    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    new-instance p0, Landroid/graphics/drawable/GradientDrawable;

    .line 12
    .line 13
    invoke-direct {p0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 18
    .line 19
    .line 20
    sget-object v0, Lvf0;->a:Lvf0;

    .line 21
    .line 22
    const/16 v1, 0xa

    .line 23
    .line 24
    invoke-direct {v0, p1, v1}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    int-to-float p1, p1

    .line 29
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 30
    .line 31
    .line 32
    if-eqz p3, :cond_1

    .line 33
    .line 34
    const/16 p1, 0x2c

    .line 35
    .line 36
    const/16 p3, 0x55

    .line 37
    .line 38
    const/16 v0, 0xc8

    .line 39
    .line 40
    const/16 v1, 0xfe

    .line 41
    .line 42
    invoke-static {v0, v1, p1, p3}, Landroid/graphics/Color;->argb(IIII)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    const/16 p1, 0x64

    .line 51
    .line 52
    const/16 p3, 0x82

    .line 53
    .line 54
    const/16 v0, 0x78

    .line 55
    .line 56
    invoke-static {p1, v0, v0, p3}, Landroid/graphics/Color;->argb(IIII)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 61
    .line 62
    .line 63
    :goto_1
    invoke-virtual {p2, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 64
    .line 65
    .line 66
    const/4 p0, -0x1

    .line 67
    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public static synthetic H(Landroid/content/SharedPreferences;Landroid/content/Context;IILandroid/widget/LinearLayout;IIILandroid/widget/LinearLayout;)Lna1;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p8}, Lvf0;->W1(Landroid/content/SharedPreferences;Landroid/content/Context;IILandroid/widget/LinearLayout;IIILandroid/widget/LinearLayout;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic H0(Lhw;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->w1(Lhw;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final H1(Landroid/content/Context;ILandroid/widget/LinearLayout;)Lna1;
    .locals 8

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/widget/LinearLayout;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x11

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 16
    .line 17
    .line 18
    sget-object v2, Lvf0;->a:Lvf0;

    .line 19
    .line 20
    const/16 v3, 0xe

    .line 21
    .line 22
    invoke-direct {v2, p0, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    const/16 v5, 0xa

    .line 27
    .line 28
    invoke-direct {v2, p0, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    invoke-direct {v2, p0, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-direct {v2, p0, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    invoke-virtual {v0, v4, v6, v3, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 41
    .line 42
    .line 43
    new-instance v3, Landroid/widget/TextView;

    .line 44
    .line 45
    invoke-direct {v3, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 46
    .line 47
    .line 48
    const-string v4, "\u2764 \u81ea\u613f\u6253\u8d4f \u2192"

    .line 49
    .line 50
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    const/high16 v4, 0x41600000    # 14.0f

    .line 54
    .line 55
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 56
    .line 57
    .line 58
    const/16 v4, 0x2c

    .line 59
    .line 60
    const/16 v5, 0x55

    .line 61
    .line 62
    const/16 v6, 0xff

    .line 63
    .line 64
    const/16 v7, 0xfe

    .line 65
    .line 66
    invoke-static {v6, v7, v4, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 71
    .line 72
    .line 73
    sget-object v4, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 74
    .line 75
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 79
    .line 80
    .line 81
    new-instance v4, Landroid/widget/TextView;

    .line 82
    .line 83
    invoke-direct {v4, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 84
    .line 85
    .line 86
    const-string v5, "\u89c9\u5f97\u6a21\u5757\u4e0d\u9519\uff1f\u70b9\u51fb\u652f\u6301\u4f5c\u8005\uff0c\u611f\u8c22\u4f60\u7684\u9f13\u52b1\uff01"

    .line 87
    .line 88
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    .line 90
    .line 91
    const/high16 v5, 0x41200000    # 10.0f

    .line 92
    .line 93
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 100
    .line 101
    .line 102
    const/4 p1, 0x2

    .line 103
    invoke-direct {v2, p0, p1}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    const/4 p1, 0x0

    .line 108
    invoke-virtual {v4, p1, p0, p1, p1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 118
    .line 119
    .line 120
    sget-object p0, Lna1;->a:Lna1;

    .line 121
    .line 122
    return-object p0
.end method

.method private final H2(Landroid/content/Context;II)V
    .locals 16

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move/from16 v3, p2

    .line 4
    .line 5
    invoke-direct/range {p0 .. p1}, Lvf0;->f1(Landroid/content/Context;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v2, 0xff

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/16 v4, 0x1c

    .line 14
    .line 15
    const/16 v5, 0x16

    .line 16
    .line 17
    :goto_0
    invoke-static {v2, v5, v5, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    const/16 v4, 0xfc

    .line 23
    .line 24
    const/16 v5, 0xf8

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    const/16 v5, 0x8c

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    const/16 v6, 0x5a

    .line 32
    .line 33
    const/16 v7, 0x50

    .line 34
    .line 35
    :goto_2
    invoke-static {v5, v7, v7, v6}, Landroid/graphics/Color;->argb(IIII)I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    move v6, v5

    .line 40
    goto :goto_3

    .line 41
    :cond_1
    const/16 v6, 0xd2

    .line 42
    .line 43
    const/16 v7, 0xc8

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :goto_3
    if-eqz v0, :cond_2

    .line 47
    .line 48
    const/4 v0, -0x1

    .line 49
    :goto_4
    move v7, v0

    .line 50
    goto :goto_5

    .line 51
    :cond_2
    const/16 v0, 0x3c

    .line 52
    .line 53
    const/16 v5, 0x32

    .line 54
    .line 55
    invoke-static {v2, v5, v5, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    goto :goto_4

    .line 60
    :goto_5
    sget-object v8, Lm00;->S:Lm00$a;

    .line 61
    .line 62
    invoke-virtual {v8}, Lm00$a;->Y()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const/4 v9, 0x0

    .line 67
    invoke-virtual {v1, v0, v9}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 68
    .line 69
    .line 70
    move-result-object v10

    .line 71
    new-instance v11, Landroid/app/Dialog;

    .line 72
    .line 73
    const v0, 0x103000a

    .line 74
    .line 75
    .line 76
    invoke-direct {v11, v1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 77
    .line 78
    .line 79
    const/4 v0, 0x1

    .line 80
    invoke-virtual {v11, v0}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 81
    .line 82
    .line 83
    new-instance v12, Landroid/widget/LinearLayout;

    .line 84
    .line 85
    invoke-direct {v12, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v12, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v12, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 92
    .line 93
    .line 94
    sget-object v13, Lvf0;->a:Lvf0;

    .line 95
    .line 96
    const/16 v0, 0x14

    .line 97
    .line 98
    invoke-direct {v13, v1, v0}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    const/16 v4, 0x12

    .line 103
    .line 104
    invoke-direct {v13, v1, v4}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    invoke-direct {v13, v1, v0}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    const/16 v14, 0x10

    .line 113
    .line 114
    invoke-direct {v13, v1, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    invoke-virtual {v12, v2, v4, v0, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 119
    .line 120
    .line 121
    const-string v0, "\u6d6e\u52a8\u4e0b\u8f7d\u6309\u94ae"

    .line 122
    .line 123
    const/high16 v2, 0x41a00000    # 20.0f

    .line 124
    .line 125
    const/16 v15, 0x11

    .line 126
    .line 127
    invoke-static {v1, v0, v2, v3, v15}, Lt1;->j(Landroid/content/Context;Ljava/lang/String;FII)Landroid/widget/TextView;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-direct {v13, v1, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    invoke-virtual {v0, v9, v9, v9, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v12, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 139
    .line 140
    .line 141
    new-instance v0, Lvt0;

    .line 142
    .line 143
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v8}, Lm00$a;->o()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-virtual {v8}, Lm00$a;->c()Z

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    invoke-interface {v10, v2, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    iput-boolean v4, v0, Lvt0;->d:Z

    .line 159
    .line 160
    new-instance v5, Lve0;

    .line 161
    .line 162
    invoke-direct {v5, v0, v10, v9}, Lve0;-><init>(Lvt0;Landroid/content/SharedPreferences;I)V

    .line 163
    .line 164
    .line 165
    const-string v2, "\u542f\u7528\u6d6e\u52a8\u6309\u94ae"

    .line 166
    .line 167
    move-object/from16 v0, p0

    .line 168
    .line 169
    invoke-direct/range {v0 .. v5}, Lvf0;->c1(Landroid/content/Context;Ljava/lang/String;IZLsw;)Landroid/view/View;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    invoke-virtual {v12, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v8}, Lm00$a;->p()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-virtual {v8}, Lm00$a;->d()I

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    invoke-interface {v10, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    new-instance v4, Landroid/widget/TextView;

    .line 189
    .line 190
    invoke-direct {v4, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 191
    .line 192
    .line 193
    new-instance v5, Ljava/lang/StringBuilder;

    .line 194
    .line 195
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    const-string v8, "dp"

    .line 202
    .line 203
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 211
    .line 212
    .line 213
    const/high16 v5, 0x41c00000    # 24.0f

    .line 214
    .line 215
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v4, v15}, Landroid/widget/TextView;->setGravity(I)V

    .line 222
    .line 223
    .line 224
    const/16 v3, 0x8

    .line 225
    .line 226
    invoke-direct {v13, v1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    const/16 v5, 0xa

    .line 231
    .line 232
    invoke-direct {v13, v1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 233
    .line 234
    .line 235
    move-result v8

    .line 236
    invoke-virtual {v4, v9, v3, v9, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v12, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 240
    .line 241
    .line 242
    invoke-direct {v0, v1, v2}, Lvf0;->b1(Landroid/content/Context;I)Landroid/widget/SeekBar;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    const/16 v8, 0x46

    .line 247
    .line 248
    invoke-virtual {v3, v8}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 249
    .line 250
    .line 251
    add-int/lit8 v2, v2, -0x1e

    .line 252
    .line 253
    invoke-virtual {v3}, Landroid/widget/ProgressBar;->getMax()I

    .line 254
    .line 255
    .line 256
    move-result v8

    .line 257
    invoke-static {v2, v9, v8}, Lw60;->n(III)I

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    invoke-virtual {v3, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 262
    .line 263
    .line 264
    new-instance v2, Lvf0$c;

    .line 265
    .line 266
    invoke-direct {v2, v4, v10}, Lvf0$c;-><init>(Landroid/widget/TextView;Landroid/content/SharedPreferences;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v3, v2}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 273
    .line 274
    .line 275
    new-instance v2, Landroid/widget/TextView;

    .line 276
    .line 277
    invoke-direct {v2, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 278
    .line 279
    .line 280
    const-string v3, "\u62d6\u52a8\u6ed1\u5757\u8c03\u6574\u5927\u5c0f\uff0c\u4e0b\u6b21\u8fdb\u5165\u7b14\u8bb0\u65f6\u751f\u6548"

    .line 281
    .line 282
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 283
    .line 284
    .line 285
    const/high16 v3, 0x41300000    # 11.0f

    .line 286
    .line 287
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 288
    .line 289
    .line 290
    move/from16 v3, p3

    .line 291
    .line 292
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 293
    .line 294
    .line 295
    invoke-direct {v13, v1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 296
    .line 297
    .line 298
    move-result v3

    .line 299
    invoke-direct {v13, v1, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 300
    .line 301
    .line 302
    move-result v4

    .line 303
    invoke-virtual {v2, v9, v3, v9, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v12, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 307
    .line 308
    .line 309
    new-instance v5, Lwe0;

    .line 310
    .line 311
    invoke-direct {v5, v11, v9}, Lwe0;-><init>(Landroid/app/Dialog;I)V

    .line 312
    .line 313
    .line 314
    move v4, v6

    .line 315
    move v3, v7

    .line 316
    move-object v2, v12

    .line 317
    invoke-direct/range {v0 .. v5}, Lvf0;->W0(Landroid/content/Context;Landroid/widget/LinearLayout;IILhw;)V

    .line 318
    .line 319
    .line 320
    invoke-direct {v0, v11, v1, v2}, Lvf0;->A3(Landroid/app/Dialog;Landroid/content/Context;Landroid/view/View;)V

    .line 321
    .line 322
    .line 323
    return-void
.end method

.method public static synthetic I(Lvt0;Landroid/content/SharedPreferences;Z)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lvf0;->I2(Lvt0;Landroid/content/SharedPreferences;Z)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic I0(Landroid/widget/EditText;Landroid/content/SharedPreferences;Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lvf0;->G2(Landroid/widget/EditText;Landroid/content/SharedPreferences;Landroid/app/Dialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final I1(Landroid/content/Context;Landroid/view/View;)V
    .locals 2

    .line 1
    sget-object p1, Lvf0;->a:Lvf0;

    .line 2
    .line 3
    new-instance v0, Lbf0;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-direct {v0, p0, v1}, Lbf0;-><init>(Landroid/content/Context;I)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p1, p0, v0}, Lvf0;->S2(Landroid/content/Context;Lhw;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private static final I2(Lvt0;Landroid/content/SharedPreferences;Z)Lna1;
    .locals 0

    .line 1
    iput-boolean p2, p0, Lvt0;->d:Z

    .line 2
    .line 3
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, Lm00;->S:Lm00$a;

    .line 8
    .line 9
    invoke-virtual {p1}, Lm00$a;->o()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 18
    .line 19
    .line 20
    sget-object p0, Lna1;->a:Lna1;

    .line 21
    .line 22
    return-object p0
.end method

.method public static synthetic J(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->Y2(Landroid/app/Dialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic J0(Landroid/content/Context;Lsw;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lvf0;->n1(Landroid/content/Context;Lsw;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final J1(Landroid/content/Context;)Lna1;
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "top.anjao2024.xp1whs"

    .line 7
    .line 8
    const-string v2, "top.anjao2024.xp1whs.MainActivity"

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 11
    .line 12
    .line 13
    const-string v1, "open_tab"

    .line 14
    .line 15
    const-string v2, "thanks"

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 18
    .line 19
    .line 20
    const-string v1, "open_donate"

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 24
    .line 25
    .line 26
    const/high16 v1, 0x10000000

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lna1;->a:Lna1;

    .line 35
    .line 36
    return-object p0
.end method

.method private static final J2(Landroid/app/Dialog;)Lna1;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lna1;->a:Lna1;

    .line 5
    .line 6
    return-object p0
.end method

.method public static synthetic K(Landroid/content/SharedPreferences;Z)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->V1(Landroid/content/SharedPreferences;Z)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic K0(Landroid/content/SharedPreferences;Z)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->i2(Landroid/content/SharedPreferences;Z)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final K1(Lcf1$a;Landroid/content/Context;Landroid/view/View;)Z
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcf1$a;->f()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    :goto_0
    const/4 p2, 0x0

    .line 10
    if-eqz p0, :cond_2

    .line 11
    .line 12
    invoke-static {p0}, Lk41;->a0(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    const-string v0, "clipboard"

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    check-cast v0, Landroid/content/ClipboardManager;

    .line 29
    .line 30
    const-string v1, "user_id"

    .line 31
    .line 32
    invoke-static {v1, p0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 37
    .line 38
    .line 39
    const-string v0, "\u590d\u5236\u5c0f\u7ea2\u4e66ID\u6210\u529f: "

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {p1, p0, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 50
    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    :goto_1
    const-string p0, "\u5f53\u524d\u672a\u767b\u5f55\uff0c\u65e0\u6cd5\u590d\u5236"

    .line 54
    .line 55
    invoke-static {p1, p0, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 60
    .line 61
    .line 62
    :goto_2
    const/4 p0, 0x1

    .line 63
    return p0
.end method

.method private final K2(Landroid/content/Context;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-direct/range {p0 .. p1}, Lvf0;->f1(Landroid/content/Context;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/16 v3, 0x16

    .line 10
    .line 11
    const/16 v4, 0x1c

    .line 12
    .line 13
    const/16 v5, 0xff

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-static {v5, v3, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/16 v6, 0xfc

    .line 23
    .line 24
    const/16 v7, 0xf8

    .line 25
    .line 26
    invoke-static {v5, v7, v7, v6}, Landroid/graphics/Color;->argb(IIII)I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    :goto_0
    if-eqz v2, :cond_1

    .line 31
    .line 32
    const/4 v3, -0x1

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-static {v5, v3, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    :goto_1
    const/16 v8, 0x5a

    .line 39
    .line 40
    const/16 v9, 0x96

    .line 41
    .line 42
    const/16 v10, 0x50

    .line 43
    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    invoke-static {v9, v5, v5, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 47
    .line 48
    .line 49
    move-result v9

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    invoke-static {v9, v10, v10, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 52
    .line 53
    .line 54
    move-result v9

    .line 55
    :goto_2
    const/16 v11, 0x8c

    .line 56
    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    invoke-static {v11, v10, v10, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    goto :goto_3

    .line 64
    :cond_3
    const/16 v8, 0xd2

    .line 65
    .line 66
    const/16 v12, 0xc8

    .line 67
    .line 68
    invoke-static {v11, v12, v12, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    :goto_3
    if-eqz v2, :cond_4

    .line 73
    .line 74
    const/4 v2, -0x1

    .line 75
    goto :goto_4

    .line 76
    :cond_4
    const/16 v2, 0x3c

    .line 77
    .line 78
    const/16 v11, 0x32

    .line 79
    .line 80
    invoke-static {v5, v11, v11, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    :goto_4
    new-instance v5, Landroid/app/Dialog;

    .line 85
    .line 86
    const v11, 0x103000a

    .line 87
    .line 88
    .line 89
    invoke-direct {v5, v1, v11}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 90
    .line 91
    .line 92
    const/4 v11, 0x1

    .line 93
    invoke-virtual {v5, v11}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 94
    .line 95
    .line 96
    sget-object v12, Lm00;->S:Lm00$a;

    .line 97
    .line 98
    invoke-virtual {v12}, Lm00$a;->Y()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v13

    .line 102
    const/4 v14, 0x0

    .line 103
    invoke-virtual {v1, v13, v14}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 104
    .line 105
    .line 106
    move-result-object v13

    .line 107
    new-instance v15, Lxt0;

    .line 108
    .line 109
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v12}, Lm00$a;->p()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    invoke-virtual {v12}, Lm00$a;->d()I

    .line 117
    .line 118
    .line 119
    move-result v12

    .line 120
    invoke-interface {v13, v10, v12}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 121
    .line 122
    .line 123
    move-result v10

    .line 124
    iput v10, v15, Lxt0;->d:I

    .line 125
    .line 126
    new-instance v10, Landroid/widget/LinearLayout;

    .line 127
    .line 128
    invoke-direct {v10, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v10, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v10, v6}, Landroid/view/View;->setBackgroundColor(I)V

    .line 135
    .line 136
    .line 137
    sget-object v6, Lvf0;->a:Lvf0;

    .line 138
    .line 139
    const/16 v11, 0x14

    .line 140
    .line 141
    invoke-direct {v6, v1, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 142
    .line 143
    .line 144
    move-result v12

    .line 145
    const/16 v4, 0x12

    .line 146
    .line 147
    invoke-direct {v6, v1, v4}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 148
    .line 149
    .line 150
    move-result v7

    .line 151
    invoke-direct {v6, v1, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    const/16 v14, 0x10

    .line 156
    .line 157
    invoke-direct {v6, v1, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 158
    .line 159
    .line 160
    move-result v11

    .line 161
    invoke-virtual {v10, v12, v7, v4, v11}, Landroid/view/View;->setPadding(IIII)V

    .line 162
    .line 163
    .line 164
    const-string v4, "\u6d6e\u52a8\u6309\u94ae\u5927\u5c0f"

    .line 165
    .line 166
    const/high16 v7, 0x41a00000    # 20.0f

    .line 167
    .line 168
    const/16 v11, 0x11

    .line 169
    .line 170
    invoke-static {v1, v4, v7, v3, v11}, Lt1;->j(Landroid/content/Context;Ljava/lang/String;FII)Landroid/widget/TextView;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    const/16 v7, 0x14

    .line 175
    .line 176
    invoke-direct {v6, v1, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 177
    .line 178
    .line 179
    move-result v7

    .line 180
    const/4 v12, 0x0

    .line 181
    invoke-virtual {v4, v12, v12, v12, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v10, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 185
    .line 186
    .line 187
    new-instance v4, Landroid/widget/TextView;

    .line 188
    .line 189
    invoke-direct {v4, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 190
    .line 191
    .line 192
    iget v7, v15, Lxt0;->d:I

    .line 193
    .line 194
    new-instance v12, Ljava/lang/StringBuilder;

    .line 195
    .line 196
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    const-string v7, "dp"

    .line 203
    .line 204
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 212
    .line 213
    .line 214
    const/high16 v7, 0x41e00000    # 28.0f

    .line 215
    .line 216
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v4, v11}, Landroid/widget/TextView;->setGravity(I)V

    .line 223
    .line 224
    .line 225
    const/16 v3, 0xe

    .line 226
    .line 227
    invoke-direct {v6, v1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    const/4 v12, 0x0

    .line 232
    invoke-virtual {v4, v12, v12, v12, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v10, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 236
    .line 237
    .line 238
    iget v3, v15, Lxt0;->d:I

    .line 239
    .line 240
    invoke-direct {v0, v1, v3}, Lvf0;->b1(Landroid/content/Context;I)Landroid/widget/SeekBar;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    new-instance v7, Lvf0$d;

    .line 245
    .line 246
    invoke-direct {v7, v15, v4, v13}, Lvf0$d;-><init>(Lxt0;Landroid/widget/TextView;Landroid/content/SharedPreferences;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v3, v7}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v10, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 253
    .line 254
    .line 255
    new-instance v3, Landroid/widget/TextView;

    .line 256
    .line 257
    invoke-direct {v3, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 258
    .line 259
    .line 260
    const-string v4, "\u62d6\u52a8\u6ed1\u5757\u8c03\u6574\u5927\u5c0f\uff0c\u4e0b\u6b21\u8fdb\u5165\u7b14\u8bb0\u65f6\u751f\u6548"

    .line 261
    .line 262
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 263
    .line 264
    .line 265
    const/high16 v4, 0x41300000    # 11.0f

    .line 266
    .line 267
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 271
    .line 272
    .line 273
    const/16 v4, 0xa

    .line 274
    .line 275
    invoke-direct {v6, v1, v4}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 276
    .line 277
    .line 278
    move-result v4

    .line 279
    invoke-direct {v6, v1, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 280
    .line 281
    .line 282
    move-result v7

    .line 283
    const/4 v12, 0x0

    .line 284
    invoke-virtual {v3, v12, v4, v12, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v10, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 288
    .line 289
    .line 290
    new-instance v3, Landroid/widget/LinearLayout;

    .line 291
    .line 292
    invoke-direct {v3, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v3, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 296
    .line 297
    .line 298
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 299
    .line 300
    const/4 v7, -0x2

    .line 301
    const/4 v9, -0x1

    .line 302
    invoke-direct {v4, v9, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 306
    .line 307
    .line 308
    new-instance v4, Landroid/widget/TextView;

    .line 309
    .line 310
    invoke-direct {v4, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 311
    .line 312
    .line 313
    const-string v9, "\u2190 \u8fd4\u56de"

    .line 314
    .line 315
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 316
    .line 317
    .line 318
    const/high16 v9, 0x41600000    # 14.0f

    .line 319
    .line 320
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v4, v11}, Landroid/widget/TextView;->setGravity(I)V

    .line 327
    .line 328
    .line 329
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    .line 330
    .line 331
    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 332
    .line 333
    .line 334
    const/4 v12, 0x0

    .line 335
    invoke-virtual {v2, v12}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 336
    .line 337
    .line 338
    const/16 v13, 0x1c

    .line 339
    .line 340
    invoke-direct {v6, v1, v13}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 341
    .line 342
    .line 343
    move-result v14

    .line 344
    int-to-float v13, v14

    .line 345
    invoke-virtual {v2, v13}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v2, v8}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v4, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 352
    .line 353
    .line 354
    const/16 v2, 0xc

    .line 355
    .line 356
    invoke-direct {v6, v1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 357
    .line 358
    .line 359
    move-result v8

    .line 360
    invoke-direct {v6, v1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 361
    .line 362
    .line 363
    move-result v13

    .line 364
    invoke-virtual {v4, v12, v8, v12, v13}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 365
    .line 366
    .line 367
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 368
    .line 369
    const/high16 v13, 0x3f800000    # 1.0f

    .line 370
    .line 371
    invoke-direct {v8, v12, v7, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 372
    .line 373
    .line 374
    const/4 v14, 0x6

    .line 375
    invoke-direct {v6, v1, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 376
    .line 377
    .line 378
    move-result v15

    .line 379
    invoke-virtual {v8, v12, v12, v15, v12}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v4, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 383
    .line 384
    .line 385
    new-instance v8, Luy;

    .line 386
    .line 387
    invoke-direct {v8, v5, v11}, Luy;-><init>(Landroid/app/Dialog;I)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v4, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 394
    .line 395
    .line 396
    const-string v4, "\u5b8c\u6210"

    .line 397
    .line 398
    const/4 v8, -0x1

    .line 399
    invoke-static {v1, v4, v9, v8, v11}, Lt1;->j(Landroid/content/Context;Ljava/lang/String;FII)Landroid/widget/TextView;

    .line 400
    .line 401
    .line 402
    move-result-object v4

    .line 403
    invoke-static {v12}, Lt1;->h(I)Landroid/graphics/drawable/GradientDrawable;

    .line 404
    .line 405
    .line 406
    move-result-object v8

    .line 407
    const/16 v9, 0x1c

    .line 408
    .line 409
    invoke-direct {v6, v1, v9}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 410
    .line 411
    .line 412
    move-result v11

    .line 413
    int-to-float v9, v11

    .line 414
    invoke-virtual {v8, v9}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 415
    .line 416
    .line 417
    const/16 v9, 0xdc

    .line 418
    .line 419
    const/16 v11, 0xb4

    .line 420
    .line 421
    const/16 v15, 0x50

    .line 422
    .line 423
    invoke-static {v9, v12, v11, v15}, Landroid/graphics/Color;->argb(IIII)I

    .line 424
    .line 425
    .line 426
    move-result v9

    .line 427
    invoke-virtual {v8, v9}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v4, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 431
    .line 432
    .line 433
    invoke-direct {v6, v1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 434
    .line 435
    .line 436
    move-result v8

    .line 437
    invoke-direct {v6, v1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 438
    .line 439
    .line 440
    move-result v2

    .line 441
    invoke-virtual {v4, v12, v8, v12, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 442
    .line 443
    .line 444
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 445
    .line 446
    invoke-direct {v2, v12, v7, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 447
    .line 448
    .line 449
    invoke-direct {v6, v1, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 450
    .line 451
    .line 452
    move-result v6

    .line 453
    invoke-virtual {v2, v6, v12, v12, v12}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v4, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 457
    .line 458
    .line 459
    new-instance v2, Luy;

    .line 460
    .line 461
    const/16 v6, 0x12

    .line 462
    .line 463
    invoke-direct {v2, v5, v6}, Luy;-><init>(Landroid/app/Dialog;I)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v4, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v10, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {v5, v10}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {v5}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 479
    .line 480
    .line 481
    move-result-object v2

    .line 482
    if-eqz v2, :cond_5

    .line 483
    .line 484
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 485
    .line 486
    .line 487
    move-result-object v3

    .line 488
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 489
    .line 490
    .line 491
    move-result-object v3

    .line 492
    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 493
    .line 494
    int-to-double v3, v3

    .line 495
    const-wide v8, 0x3feb333333333333L    # 0.85

    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    mul-double/2addr v3, v8

    .line 501
    double-to-int v3, v3

    .line 502
    invoke-virtual {v2, v3, v7}, Landroid/view/Window;->setLayout(II)V

    .line 503
    .line 504
    .line 505
    :cond_5
    invoke-virtual {v5}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 506
    .line 507
    .line 508
    move-result-object v2

    .line 509
    if-eqz v2, :cond_6

    .line 510
    .line 511
    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    .line 512
    .line 513
    const/4 v12, 0x0

    .line 514
    invoke-direct {v3, v12}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v2, v3}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 518
    .line 519
    .line 520
    :cond_6
    invoke-virtual {v5}, Landroid/app/Dialog;->show()V

    .line 521
    .line 522
    .line 523
    const/16 v9, 0x1c

    .line 524
    .line 525
    invoke-direct {v0, v1, v5, v9}, Lvf0;->z1(Landroid/content/Context;Landroid/app/Dialog;I)V

    .line 526
    .line 527
    .line 528
    return-void
.end method

.method public static synthetic L(Landroid/app/Dialog;Landroid/content/Context;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->y2(Landroid/app/Dialog;Landroid/content/Context;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic L0(Landroid/content/Context;IILandroid/widget/LinearLayout;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lvf0;->X1(Landroid/content/Context;IILandroid/widget/LinearLayout;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final L1(Landroid/content/Context;IILandroid/widget/LinearLayout;)Lna1;
    .locals 8

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/widget/LinearLayout;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 11
    .line 12
    .line 13
    const/16 v2, 0x10

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 16
    .line 17
    .line 18
    sget-object v2, Lvf0;->a:Lvf0;

    .line 19
    .line 20
    const/16 v3, 0xe

    .line 21
    .line 22
    invoke-direct {v2, p0, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    const/16 v5, 0xa

    .line 27
    .line 28
    invoke-direct {v2, p0, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    invoke-direct {v2, p0, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-direct {v2, p0, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    invoke-virtual {v0, v4, v6, v3, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 41
    .line 42
    .line 43
    new-instance v3, Landroid/widget/TextView;

    .line 44
    .line 45
    invoke-direct {v3, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 46
    .line 47
    .line 48
    const-string v4, "\ud83d\udce2"

    .line 49
    .line 50
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    const/high16 v4, 0x41900000    # 18.0f

    .line 54
    .line 55
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 56
    .line 57
    .line 58
    const/16 v4, 0x11

    .line 59
    .line 60
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 61
    .line 62
    .line 63
    const/16 v5, 0x8

    .line 64
    .line 65
    invoke-direct {v2, p0, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    invoke-virtual {v3, v1, v1, v6, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 73
    .line 74
    .line 75
    new-instance v3, Landroid/widget/TextView;

    .line 76
    .line 77
    invoke-direct {v3, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 78
    .line 79
    .line 80
    const-string v6, "\u67e5\u770b\u6700\u65b0\u5728\u7ebf\u901a\u77e5"

    .line 81
    .line 82
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    .line 84
    .line 85
    const/high16 v6, 0x41600000    # 14.0f

    .line 86
    .line 87
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setTextSize(F)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 91
    .line 92
    .line 93
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 94
    .line 95
    const/4 v6, -0x2

    .line 96
    const/high16 v7, 0x3f800000    # 1.0f

    .line 97
    .line 98
    invoke-direct {p1, v1, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 105
    .line 106
    .line 107
    new-instance p1, Landroid/widget/TextView;

    .line 108
    .line 109
    invoke-direct {p1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 110
    .line 111
    .line 112
    const-string v3, "\u203a"

    .line 113
    .line 114
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 115
    .line 116
    .line 117
    const/high16 v3, 0x41b00000    # 22.0f

    .line 118
    .line 119
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 126
    .line 127
    .line 128
    invoke-direct {v2, p0, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    invoke-virtual {p1, p0, v1, v1, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 139
    .line 140
    .line 141
    sget-object p0, Lna1;->a:Lna1;

    .line 142
    .line 143
    return-object p0
.end method

.method private static final L2(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic M(Landroid/content/Context;IIILandroid/content/SharedPreferences;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lvf0;->s2(Landroid/content/Context;IIILandroid/content/SharedPreferences;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic M0(Landroid/content/Context;Landroid/content/SharedPreferences;IIIILandroid/widget/LinearLayout;)Lna1;
    .locals 1

    .line 1
    move-object v0, p1

    .line 2
    move-object p1, p0

    .line 3
    move-object p0, v0

    .line 4
    invoke-static/range {p0 .. p6}, Lvf0;->q2(Landroid/content/SharedPreferences;Landroid/content/Context;IIIILandroid/widget/LinearLayout;)Lna1;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method private static final M1(Landroid/content/Context;Landroid/view/View;)V
    .locals 3

    .line 1
    const/4 p1, 0x0

    .line 2
    :try_start_0
    instance-of v0, p0, Landroid/app/Activity;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object v0, p0

    .line 7
    check-cast v0, Landroid/app/Activity;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    move-object p1, v0

    .line 10
    :catch_0
    :cond_0
    if-eqz p1, :cond_1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    move-object p1, p0

    .line 14
    :goto_0
    sget-object v0, Lhk0;->a:Lhk0;

    .line 15
    .line 16
    new-instance v1, Lbf0;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-direct {v1, p0, v2}, Lbf0;-><init>(Landroid/content/Context;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1, v1}, Lhk0;->y(Landroid/content/Context;Lhw;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method private static final M2(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic N(Landroid/app/Dialog;Landroid/content/Context;)Lna1;
    .locals 0

    .line 1
    invoke-static {p1, p0}, Lvf0;->B2(Landroid/content/Context;Landroid/app/Dialog;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic N0(Landroid/content/SharedPreferences;ILandroid/content/Context;Ljava/util/ArrayList;IIILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lvf0;->l3(Landroid/content/SharedPreferences;ILandroid/content/Context;Ljava/util/List;IIILandroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final N1(Landroid/content/Context;)Lna1;
    .locals 2

    .line 1
    const-string v0, "\u5f53\u524d\u6ca1\u6709\u65b0\u7684\u5728\u7ebf\u901a\u77e5\u516c\u544a"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lna1;->a:Lna1;

    .line 12
    .line 13
    return-object p0
.end method

.method private final N2(Landroid/content/Context;III)V
    .locals 20

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    invoke-direct/range {p0 .. p1}, Lvf0;->f1(Landroid/content/Context;)Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/16 v4, 0x1c

    .line 12
    .line 13
    const/16 v5, 0xff

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    const/16 v6, 0x16

    .line 18
    .line 19
    invoke-static {v5, v6, v6, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/16 v6, 0xfc

    .line 25
    .line 26
    const/16 v7, 0xf8

    .line 27
    .line 28
    invoke-static {v5, v7, v7, v6}, Landroid/graphics/Color;->argb(IIII)I

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    :goto_0
    const/16 v7, 0x8c

    .line 33
    .line 34
    const/16 v8, 0x50

    .line 35
    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    const/16 v9, 0x5a

    .line 39
    .line 40
    invoke-static {v7, v8, v8, v9}, Landroid/graphics/Color;->argb(IIII)I

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const/16 v9, 0xd2

    .line 46
    .line 47
    const/16 v10, 0xc8

    .line 48
    .line 49
    invoke-static {v7, v10, v10, v9}, Landroid/graphics/Color;->argb(IIII)I

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    :goto_1
    if-eqz v3, :cond_2

    .line 54
    .line 55
    const/4 v3, -0x1

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    const/16 v3, 0x3c

    .line 58
    .line 59
    const/16 v10, 0x32

    .line 60
    .line 61
    invoke-static {v5, v10, v10, v3}, Landroid/graphics/Color;->argb(IIII)I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    :goto_2
    new-instance v10, Landroid/app/Dialog;

    .line 66
    .line 67
    const v11, 0x103000a

    .line 68
    .line 69
    .line 70
    invoke-direct {v10, v0, v11}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 71
    .line 72
    .line 73
    const/4 v11, 0x1

    .line 74
    invoke-virtual {v10, v11}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 75
    .line 76
    .line 77
    new-instance v12, Landroid/widget/LinearLayout;

    .line 78
    .line 79
    invoke-direct {v12, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v12, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v6}, Landroid/view/View;->setBackgroundColor(I)V

    .line 86
    .line 87
    .line 88
    sget-object v6, Lvf0;->a:Lvf0;

    .line 89
    .line 90
    const/16 v13, 0x14

    .line 91
    .line 92
    invoke-direct {v6, v0, v13}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 93
    .line 94
    .line 95
    move-result v14

    .line 96
    const/16 v15, 0x12

    .line 97
    .line 98
    invoke-direct {v6, v0, v15}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 99
    .line 100
    .line 101
    move-result v15

    .line 102
    invoke-direct {v6, v0, v13}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 103
    .line 104
    .line 105
    move-result v13

    .line 106
    move/from16 v16, v11

    .line 107
    .line 108
    const/16 v11, 0x10

    .line 109
    .line 110
    invoke-direct {v6, v0, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    invoke-virtual {v12, v14, v15, v13, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 115
    .line 116
    .line 117
    const-string v8, "\u9690\u85cf\u539f\u751f\u5bfc\u822a\u680f\u6309\u94ae"

    .line 118
    .line 119
    const/high16 v13, 0x41a00000    # 20.0f

    .line 120
    .line 121
    const/16 v14, 0x11

    .line 122
    .line 123
    invoke-static {v0, v8, v13, v1, v14}, Lt1;->j(Landroid/content/Context;Ljava/lang/String;FII)Landroid/widget/TextView;

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    const/16 v13, 0x8

    .line 128
    .line 129
    invoke-direct {v6, v0, v13}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 130
    .line 131
    .line 132
    move-result v15

    .line 133
    const/4 v4, 0x0

    .line 134
    invoke-virtual {v8, v4, v4, v4, v15}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v12, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 138
    .line 139
    .line 140
    sget-object v8, Lm00;->S:Lm00$a;

    .line 141
    .line 142
    invoke-virtual {v8}, Lm00$a;->Y()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v15

    .line 146
    invoke-virtual {v0, v15, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 147
    .line 148
    .line 149
    move-result-object v15

    .line 150
    new-instance v5, Lvt0;

    .line 151
    .line 152
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v8, v0}, Lm00$a;->f0(Landroid/content/Context;)Z

    .line 156
    .line 157
    .line 158
    move-result v14

    .line 159
    iput-boolean v14, v5, Lvt0;->d:Z

    .line 160
    .line 161
    new-instance v14, Landroid/widget/LinearLayout;

    .line 162
    .line 163
    invoke-direct {v14, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v14, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v14, v11}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 170
    .line 171
    .line 172
    const/4 v11, 0x4

    .line 173
    invoke-direct {v6, v0, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    invoke-direct {v6, v0, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 178
    .line 179
    .line 180
    move-result v9

    .line 181
    move-object/from16 v17, v10

    .line 182
    .line 183
    invoke-direct {v6, v0, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 184
    .line 185
    .line 186
    move-result v10

    .line 187
    invoke-direct {v6, v0, v13}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 188
    .line 189
    .line 190
    move-result v11

    .line 191
    invoke-virtual {v14, v4, v9, v10, v11}, Landroid/view/View;->setPadding(IIII)V

    .line 192
    .line 193
    .line 194
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 195
    .line 196
    const/4 v9, -0x2

    .line 197
    const/4 v10, -0x1

    .line 198
    invoke-direct {v4, v10, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 199
    .line 200
    .line 201
    invoke-direct {v6, v0, v13}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 202
    .line 203
    .line 204
    move-result v10

    .line 205
    const/4 v11, 0x0

    .line 206
    invoke-virtual {v4, v11, v11, v11, v10}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v14, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 210
    .line 211
    .line 212
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    .line 213
    .line 214
    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v4, v11}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 218
    .line 219
    .line 220
    const/16 v10, 0xc

    .line 221
    .line 222
    invoke-direct {v6, v0, v10}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 223
    .line 224
    .line 225
    move-result v11

    .line 226
    int-to-float v11, v11

    .line 227
    invoke-virtual {v4, v11}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v4, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v14, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 234
    .line 235
    .line 236
    const-string v4, "\u542f\u7528\u9690\u85cf"

    .line 237
    .line 238
    const/high16 v11, 0x41700000    # 15.0f

    .line 239
    .line 240
    invoke-static {v0, v4, v11, v1}, Lt1;->i(Landroid/content/Context;Ljava/lang/String;FI)Landroid/widget/TextView;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    invoke-direct {v6, v0, v10}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 245
    .line 246
    .line 247
    move-result v11

    .line 248
    const/16 v10, 0xa

    .line 249
    .line 250
    invoke-direct {v6, v0, v10}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 251
    .line 252
    .line 253
    move-result v9

    .line 254
    move/from16 v18, v7

    .line 255
    .line 256
    invoke-direct {v6, v0, v13}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 257
    .line 258
    .line 259
    move-result v7

    .line 260
    invoke-direct {v6, v0, v10}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 261
    .line 262
    .line 263
    move-result v13

    .line 264
    invoke-virtual {v4, v11, v9, v7, v13}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 265
    .line 266
    .line 267
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 268
    .line 269
    const/high16 v9, 0x3f800000    # 1.0f

    .line 270
    .line 271
    const/4 v11, -0x2

    .line 272
    const/4 v13, 0x0

    .line 273
    invoke-direct {v7, v13, v11, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v4, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v14, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 280
    .line 281
    .line 282
    new-instance v4, Landroid/widget/TextView;

    .line 283
    .line 284
    invoke-direct {v4, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 285
    .line 286
    .line 287
    const/16 v7, 0xe

    .line 288
    .line 289
    invoke-direct {v6, v0, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 290
    .line 291
    .line 292
    move-result v11

    .line 293
    const/16 v13, 0x8

    .line 294
    .line 295
    invoke-direct {v6, v0, v13}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 296
    .line 297
    .line 298
    move-result v9

    .line 299
    invoke-direct {v6, v0, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 300
    .line 301
    .line 302
    move-result v10

    .line 303
    invoke-direct {v6, v0, v13}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 304
    .line 305
    .line 306
    move-result v7

    .line 307
    invoke-virtual {v4, v11, v9, v10, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 308
    .line 309
    .line 310
    const/16 v7, 0x11

    .line 311
    .line 312
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setGravity(I)V

    .line 313
    .line 314
    .line 315
    const/high16 v7, 0x41500000    # 13.0f

    .line 316
    .line 317
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 318
    .line 319
    .line 320
    iget-boolean v7, v5, Lvt0;->d:Z

    .line 321
    .line 322
    invoke-direct {v6, v0, v4, v7}, Lvf0;->G3(Landroid/content/Context;Landroid/widget/TextView;Z)V

    .line 323
    .line 324
    .line 325
    iget-boolean v7, v5, Lvt0;->d:Z

    .line 326
    .line 327
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 328
    .line 329
    .line 330
    move-result-object v7

    .line 331
    invoke-virtual {v4, v7}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    new-instance v7, Lxe0;

    .line 335
    .line 336
    const/4 v9, 0x2

    .line 337
    invoke-direct {v7, v0, v5, v15, v9}, Lxe0;-><init>(Landroid/content/Context;Lvt0;Landroid/content/SharedPreferences;I)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v4, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v14, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 347
    .line 348
    .line 349
    new-instance v4, Landroid/widget/TextView;

    .line 350
    .line 351
    invoke-direct {v4, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 352
    .line 353
    .line 354
    const-string v5, "\u53d6\u6d88\u52fe\u9009\u5373\u9690\u85cf\u5bf9\u5e94\u539f\u751f\u6309\u94ae\uff0c\u4fee\u6539\u7acb\u5373\u751f\u6548"

    .line 355
    .line 356
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 357
    .line 358
    .line 359
    const/high16 v5, 0x41400000    # 12.0f

    .line 360
    .line 361
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 362
    .line 363
    .line 364
    move/from16 v5, p3

    .line 365
    .line 366
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 367
    .line 368
    .line 369
    const/16 v7, 0x11

    .line 370
    .line 371
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setGravity(I)V

    .line 372
    .line 373
    .line 374
    const/16 v5, 0xc

    .line 375
    .line 376
    invoke-direct {v6, v0, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 377
    .line 378
    .line 379
    move-result v6

    .line 380
    const/4 v11, 0x0

    .line 381
    invoke-virtual {v4, v11, v11, v11, v6}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 385
    .line 386
    .line 387
    const-string v4, "\u2709 \u6d88\u606f"

    .line 388
    .line 389
    const-string v5, "\u263a \u6211\u7684"

    .line 390
    .line 391
    const-string v6, "\u2605 \u53d1\u73b0"

    .line 392
    .line 393
    const-string v7, "\ud83d\uded2 \u5546\u57ce"

    .line 394
    .line 395
    const-string v9, "\u2795 \u53d1\u5e03"

    .line 396
    .line 397
    filled-new-array {v6, v7, v9, v4, v5}, [Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v4

    .line 401
    invoke-static {v4}, Lo30;->w([Ljava/lang/Object;)Ljava/util/List;

    .line 402
    .line 403
    .line 404
    move-result-object v4

    .line 405
    new-instance v5, Lxt0;

    .line 406
    .line 407
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v8, v0}, Lm00$a;->g(Landroid/content/Context;)I

    .line 411
    .line 412
    .line 413
    move-result v6

    .line 414
    iput v6, v5, Lxt0;->d:I

    .line 415
    .line 416
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 417
    .line 418
    .line 419
    move-result-object v4

    .line 420
    const/4 v6, 0x0

    .line 421
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 422
    .line 423
    .line 424
    move-result v7

    .line 425
    if-eqz v7, :cond_7

    .line 426
    .line 427
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v7

    .line 431
    add-int/lit8 v9, v6, 0x1

    .line 432
    .line 433
    if-ltz v6, :cond_6

    .line 434
    .line 435
    check-cast v7, Ljava/lang/String;

    .line 436
    .line 437
    iget v10, v5, Lxt0;->d:I

    .line 438
    .line 439
    shl-int v11, v16, v6

    .line 440
    .line 441
    and-int/2addr v10, v11

    .line 442
    if-eqz v10, :cond_3

    .line 443
    .line 444
    move/from16 v10, v16

    .line 445
    .line 446
    goto :goto_4

    .line 447
    :cond_3
    const/4 v10, 0x0

    .line 448
    :goto_4
    const/high16 v11, 0x41800000    # 16.0f

    .line 449
    .line 450
    invoke-static {v0, v7, v11, v1}, Lt1;->i(Landroid/content/Context;Ljava/lang/String;FI)Landroid/widget/TextView;

    .line 451
    .line 452
    .line 453
    move-result-object v7

    .line 454
    sget-object v11, Lvf0;->a:Lvf0;

    .line 455
    .line 456
    const/16 v13, 0xe

    .line 457
    .line 458
    invoke-direct {v11, v0, v13}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 459
    .line 460
    .line 461
    move-result v14

    .line 462
    const/16 v15, 0xa

    .line 463
    .line 464
    invoke-direct {v11, v0, v15}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 465
    .line 466
    .line 467
    move-result v13

    .line 468
    const/16 v8, 0x8

    .line 469
    .line 470
    invoke-direct {v11, v0, v8}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 471
    .line 472
    .line 473
    move-result v1

    .line 474
    invoke-direct {v11, v0, v15}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 475
    .line 476
    .line 477
    move-result v8

    .line 478
    invoke-virtual {v7, v14, v13, v1, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 479
    .line 480
    .line 481
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 482
    .line 483
    const/high16 v8, 0x3f800000    # 1.0f

    .line 484
    .line 485
    const/4 v13, -0x2

    .line 486
    const/4 v14, 0x0

    .line 487
    invoke-direct {v1, v14, v13, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v7, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 491
    .line 492
    .line 493
    new-instance v1, Landroid/widget/TextView;

    .line 494
    .line 495
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 496
    .line 497
    .line 498
    if-eqz v10, :cond_4

    .line 499
    .line 500
    const-string v8, "\u2610"

    .line 501
    .line 502
    goto :goto_5

    .line 503
    :cond_4
    const-string v8, "\u2611"

    .line 504
    .line 505
    :goto_5
    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 506
    .line 507
    .line 508
    const/high16 v8, 0x41c00000    # 24.0f

    .line 509
    .line 510
    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 511
    .line 512
    .line 513
    const/16 v8, 0x11

    .line 514
    .line 515
    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 516
    .line 517
    .line 518
    const/16 v8, 0xc

    .line 519
    .line 520
    invoke-direct {v11, v0, v8}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 521
    .line 522
    .line 523
    move-result v13

    .line 524
    const/16 v14, 0x8

    .line 525
    .line 526
    invoke-direct {v11, v0, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 527
    .line 528
    .line 529
    move-result v15

    .line 530
    move-object/from16 v19, v4

    .line 531
    .line 532
    invoke-direct {v11, v0, v8}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 533
    .line 534
    .line 535
    move-result v4

    .line 536
    invoke-direct {v11, v0, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 537
    .line 538
    .line 539
    move-result v8

    .line 540
    invoke-virtual {v1, v13, v15, v4, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 541
    .line 542
    .line 543
    if-nez v10, :cond_5

    .line 544
    .line 545
    const/16 v4, 0x2c

    .line 546
    .line 547
    const/16 v8, 0x55

    .line 548
    .line 549
    const/16 v13, 0xfe

    .line 550
    .line 551
    const/16 v15, 0xff

    .line 552
    .line 553
    invoke-static {v15, v13, v4, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 554
    .line 555
    .line 556
    move-result v4

    .line 557
    goto :goto_6

    .line 558
    :cond_5
    const/16 v15, 0xff

    .line 559
    .line 560
    const/16 v4, 0x82

    .line 561
    .line 562
    const/16 v8, 0x78

    .line 563
    .line 564
    invoke-static {v8, v8, v8, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 565
    .line 566
    .line 567
    move-result v4

    .line 568
    :goto_6
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 569
    .line 570
    .line 571
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 572
    .line 573
    .line 574
    move-result-object v4

    .line 575
    invoke-virtual {v1, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 576
    .line 577
    .line 578
    new-instance v4, Lhf0;

    .line 579
    .line 580
    invoke-direct {v4, v1, v5, v6}, Lhf0;-><init>(Landroid/widget/TextView;Lxt0;I)V

    .line 581
    .line 582
    .line 583
    invoke-virtual {v1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 584
    .line 585
    .line 586
    new-instance v4, Landroid/widget/LinearLayout;

    .line 587
    .line 588
    invoke-direct {v4, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 589
    .line 590
    .line 591
    const/4 v13, 0x0

    .line 592
    invoke-virtual {v4, v13}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 593
    .line 594
    .line 595
    const/16 v6, 0x10

    .line 596
    .line 597
    invoke-virtual {v4, v6}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 598
    .line 599
    .line 600
    const/4 v8, 0x4

    .line 601
    invoke-direct {v11, v0, v8}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 602
    .line 603
    .line 604
    move-result v10

    .line 605
    invoke-direct {v11, v0, v8}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 606
    .line 607
    .line 608
    move-result v6

    .line 609
    invoke-direct {v11, v0, v8}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 610
    .line 611
    .line 612
    move-result v14

    .line 613
    invoke-direct {v11, v0, v8}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 614
    .line 615
    .line 616
    move-result v15

    .line 617
    invoke-virtual {v4, v10, v6, v14, v15}, Landroid/view/View;->setPadding(IIII)V

    .line 618
    .line 619
    .line 620
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 621
    .line 622
    const/4 v8, -0x2

    .line 623
    const/4 v10, -0x1

    .line 624
    invoke-direct {v6, v10, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 625
    .line 626
    .line 627
    const/4 v8, 0x6

    .line 628
    invoke-direct {v11, v0, v8}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 629
    .line 630
    .line 631
    move-result v8

    .line 632
    invoke-virtual {v6, v13, v13, v13, v8}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 633
    .line 634
    .line 635
    invoke-virtual {v4, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 636
    .line 637
    .line 638
    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    .line 639
    .line 640
    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 641
    .line 642
    .line 643
    invoke-virtual {v6, v13}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 644
    .line 645
    .line 646
    const/16 v8, 0xc

    .line 647
    .line 648
    invoke-direct {v11, v0, v8}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 649
    .line 650
    .line 651
    move-result v10

    .line 652
    int-to-float v8, v10

    .line 653
    invoke-virtual {v6, v8}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 654
    .line 655
    .line 656
    invoke-virtual {v6, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 657
    .line 658
    .line 659
    invoke-virtual {v4, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 660
    .line 661
    .line 662
    invoke-virtual {v4, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 663
    .line 664
    .line 665
    invoke-virtual {v4, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 666
    .line 667
    .line 668
    invoke-virtual {v12, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 669
    .line 670
    .line 671
    move/from16 v1, p2

    .line 672
    .line 673
    move v6, v9

    .line 674
    move-object/from16 v4, v19

    .line 675
    .line 676
    goto/16 :goto_3

    .line 677
    .line 678
    :cond_6
    invoke-static {}, Lo30;->A()V

    .line 679
    .line 680
    .line 681
    const/4 v0, 0x0

    .line 682
    throw v0

    .line 683
    :cond_7
    new-instance v1, Landroid/widget/LinearLayout;

    .line 684
    .line 685
    invoke-direct {v1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 686
    .line 687
    .line 688
    const/4 v11, 0x0

    .line 689
    invoke-virtual {v1, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 690
    .line 691
    .line 692
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 693
    .line 694
    const/4 v10, -0x1

    .line 695
    const/4 v13, -0x2

    .line 696
    invoke-direct {v2, v10, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 697
    .line 698
    .line 699
    sget-object v4, Lvf0;->a:Lvf0;

    .line 700
    .line 701
    const/4 v8, 0x4

    .line 702
    invoke-direct {v4, v0, v8}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 703
    .line 704
    .line 705
    move-result v6

    .line 706
    invoke-virtual {v2, v11, v6, v11, v11}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 707
    .line 708
    .line 709
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 710
    .line 711
    .line 712
    new-instance v2, Landroid/widget/TextView;

    .line 713
    .line 714
    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 715
    .line 716
    .line 717
    const-string v6, "\u53d6\u6d88"

    .line 718
    .line 719
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 720
    .line 721
    .line 722
    const/high16 v6, 0x41600000    # 14.0f

    .line 723
    .line 724
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTextSize(F)V

    .line 725
    .line 726
    .line 727
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 728
    .line 729
    .line 730
    const/16 v7, 0x11

    .line 731
    .line 732
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setGravity(I)V

    .line 733
    .line 734
    .line 735
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    .line 736
    .line 737
    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 738
    .line 739
    .line 740
    const/4 v11, 0x0

    .line 741
    invoke-virtual {v3, v11}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 742
    .line 743
    .line 744
    const/16 v7, 0x1c

    .line 745
    .line 746
    invoke-direct {v4, v0, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 747
    .line 748
    .line 749
    move-result v8

    .line 750
    int-to-float v7, v8

    .line 751
    invoke-virtual {v3, v7}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 752
    .line 753
    .line 754
    move/from16 v7, v18

    .line 755
    .line 756
    invoke-virtual {v3, v7}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 757
    .line 758
    .line 759
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 760
    .line 761
    .line 762
    const/16 v8, 0xc

    .line 763
    .line 764
    invoke-direct {v4, v0, v8}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 765
    .line 766
    .line 767
    move-result v3

    .line 768
    invoke-direct {v4, v0, v8}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 769
    .line 770
    .line 771
    move-result v7

    .line 772
    invoke-virtual {v2, v11, v3, v11, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 773
    .line 774
    .line 775
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 776
    .line 777
    const/high16 v8, 0x3f800000    # 1.0f

    .line 778
    .line 779
    const/4 v13, -0x2

    .line 780
    invoke-direct {v3, v11, v13, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 781
    .line 782
    .line 783
    const/4 v8, 0x6

    .line 784
    invoke-direct {v4, v0, v8}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 785
    .line 786
    .line 787
    move-result v7

    .line 788
    invoke-virtual {v3, v11, v11, v7, v11}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 789
    .line 790
    .line 791
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 792
    .line 793
    .line 794
    new-instance v3, Luy;

    .line 795
    .line 796
    const/16 v7, 0x9

    .line 797
    .line 798
    move-object/from16 v8, v17

    .line 799
    .line 800
    invoke-direct {v3, v8, v7}, Luy;-><init>(Landroid/app/Dialog;I)V

    .line 801
    .line 802
    .line 803
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 804
    .line 805
    .line 806
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 807
    .line 808
    .line 809
    const-string v2, "\u4fdd\u5b58"

    .line 810
    .line 811
    const/16 v7, 0x11

    .line 812
    .line 813
    const/4 v10, -0x1

    .line 814
    invoke-static {v0, v2, v6, v10, v7}, Lt1;->j(Landroid/content/Context;Ljava/lang/String;FII)Landroid/widget/TextView;

    .line 815
    .line 816
    .line 817
    move-result-object v2

    .line 818
    invoke-static {v11}, Lt1;->h(I)Landroid/graphics/drawable/GradientDrawable;

    .line 819
    .line 820
    .line 821
    move-result-object v3

    .line 822
    const/16 v7, 0x1c

    .line 823
    .line 824
    invoke-direct {v4, v0, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 825
    .line 826
    .line 827
    move-result v6

    .line 828
    int-to-float v6, v6

    .line 829
    invoke-virtual {v3, v6}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 830
    .line 831
    .line 832
    const/16 v6, 0xdc

    .line 833
    .line 834
    const/16 v7, 0xb4

    .line 835
    .line 836
    const/16 v9, 0x50

    .line 837
    .line 838
    invoke-static {v6, v11, v7, v9}, Landroid/graphics/Color;->argb(IIII)I

    .line 839
    .line 840
    .line 841
    move-result v6

    .line 842
    invoke-virtual {v3, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 843
    .line 844
    .line 845
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 846
    .line 847
    .line 848
    const/16 v3, 0xc

    .line 849
    .line 850
    invoke-direct {v4, v0, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 851
    .line 852
    .line 853
    move-result v6

    .line 854
    invoke-direct {v4, v0, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 855
    .line 856
    .line 857
    move-result v3

    .line 858
    invoke-virtual {v2, v11, v6, v11, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 859
    .line 860
    .line 861
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 862
    .line 863
    const/high16 v6, 0x3f800000    # 1.0f

    .line 864
    .line 865
    const/4 v13, -0x2

    .line 866
    invoke-direct {v3, v11, v13, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 867
    .line 868
    .line 869
    const/4 v6, 0x6

    .line 870
    invoke-direct {v4, v0, v6}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 871
    .line 872
    .line 873
    move-result v4

    .line 874
    invoke-virtual {v3, v4, v11, v11, v11}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 875
    .line 876
    .line 877
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 878
    .line 879
    .line 880
    new-instance v3, Lvy;

    .line 881
    .line 882
    move/from16 v4, v16

    .line 883
    .line 884
    invoke-direct {v3, v0, v5, v8, v4}, Lvy;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroid/app/Dialog;I)V

    .line 885
    .line 886
    .line 887
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 888
    .line 889
    .line 890
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 891
    .line 892
    .line 893
    invoke-virtual {v12, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 894
    .line 895
    .line 896
    invoke-virtual {v8, v12}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 897
    .line 898
    .line 899
    invoke-virtual {v8}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 900
    .line 901
    .line 902
    move-result-object v1

    .line 903
    if-eqz v1, :cond_8

    .line 904
    .line 905
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 906
    .line 907
    .line 908
    move-result-object v2

    .line 909
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 910
    .line 911
    .line 912
    move-result-object v2

    .line 913
    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 914
    .line 915
    int-to-double v2, v2

    .line 916
    const-wide v4, 0x3feb333333333333L    # 0.85

    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    mul-double/2addr v2, v4

    .line 922
    double-to-int v2, v2

    .line 923
    const/4 v13, -0x2

    .line 924
    invoke-virtual {v1, v2, v13}, Landroid/view/Window;->setLayout(II)V

    .line 925
    .line 926
    .line 927
    :cond_8
    invoke-virtual {v8}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 928
    .line 929
    .line 930
    move-result-object v1

    .line 931
    if-eqz v1, :cond_9

    .line 932
    .line 933
    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    .line 934
    .line 935
    const/4 v11, 0x0

    .line 936
    invoke-direct {v2, v11}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 937
    .line 938
    .line 939
    invoke-virtual {v1, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 940
    .line 941
    .line 942
    :cond_9
    invoke-virtual {v8}, Landroid/app/Dialog;->show()V

    .line 943
    .line 944
    .line 945
    const/16 v7, 0x1c

    .line 946
    .line 947
    move-object/from16 v1, p0

    .line 948
    .line 949
    invoke-direct {v1, v0, v8, v7}, Lvf0;->z1(Landroid/content/Context;Landroid/app/Dialog;I)V

    .line 950
    .line 951
    .line 952
    return-void
.end method

.method public static synthetic O(Lhw;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->X0(Lhw;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic O0(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->M2(Landroid/app/Dialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final O1(Landroid/content/SharedPreferences;Landroid/content/Context;IIIIILandroid/widget/TextView;Landroid/widget/LinearLayout;)Lna1;
    .locals 9

    .line 1
    move-object/from16 v7, p8

    .line 2
    .line 3
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lm00;->S:Lm00$a;

    .line 7
    .line 8
    invoke-virtual {v0}, Lm00$a;->o()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v0}, Lm00$a;->c()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-interface {p0, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 17
    .line 18
    .line 19
    sget-object v8, Lvf0;->a:Lvf0;

    .line 20
    .line 21
    new-instance v0, Lcf0;

    .line 22
    .line 23
    const/4 v2, 0x3

    .line 24
    move v4, p5

    .line 25
    invoke-direct {v0, p4, p1, p5, v2}, Lcf0;-><init>(ILandroid/content/Context;II)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v8, p1, p2, p3, v0}, Lvf0;->r1(Landroid/content/Context;IILsw;)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 33
    .line 34
    .line 35
    new-instance v0, Luf0;

    .line 36
    .line 37
    move-object v5, p0

    .line 38
    move-object v1, p1

    .line 39
    move v2, p4

    .line 40
    move-object/from16 v6, p7

    .line 41
    .line 42
    move v3, v4

    .line 43
    move v4, p6

    .line 44
    invoke-direct/range {v0 .. v6}, Luf0;-><init>(Landroid/content/Context;IIILandroid/content/SharedPreferences;Landroid/widget/TextView;)V

    .line 45
    .line 46
    .line 47
    invoke-direct {v8, p1, p2, p3, v0}, Lvf0;->r1(Landroid/content/Context;IILsw;)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 52
    .line 53
    .line 54
    sget-object v0, Lna1;->a:Lna1;

    .line 55
    .line 56
    return-object v0
.end method

.method private static final O2(Landroid/content/Context;Lvt0;Landroid/content/SharedPreferences;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    check-cast v0, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    xor-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p3, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    sget-object v1, Lvf0;->a:Lvf0;

    .line 24
    .line 25
    check-cast p3, Landroid/widget/TextView;

    .line 26
    .line 27
    invoke-direct {v1, p0, p3, v0}, Lvf0;->G3(Landroid/content/Context;Landroid/widget/TextView;Z)V

    .line 28
    .line 29
    .line 30
    iput-boolean v0, p1, Lvt0;->d:Z

    .line 31
    .line 32
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    sget-object p1, Lm00;->S:Lm00$a;

    .line 37
    .line 38
    invoke-virtual {p1}, Lm00$a;->B()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-interface {p0, p1, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public static synthetic P(Lvt0;Landroid/content/SharedPreferences;Z)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lvf0;->q3(Lvt0;Landroid/content/SharedPreferences;Z)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic P0(Landroid/content/Context;IIZLandroid/content/SharedPreferences;Landroid/widget/LinearLayout;)Lna1;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lvf0;->b2(Landroid/content/Context;IIZLandroid/content/SharedPreferences;Landroid/widget/LinearLayout;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final P1(Landroid/content/Context;IILandroid/widget/LinearLayout;)Lna1;
    .locals 8

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lvf0;->a:Lvf0;

    .line 5
    .line 6
    new-instance v7, Lgf0;

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    invoke-direct {v7, p1, p0, p2, v1}, Lgf0;-><init>(ILandroid/content/Context;II)V

    .line 10
    .line 11
    .line 12
    const-string v2, "\ud83d\udccb"

    .line 13
    .line 14
    const-string v3, "\u6d6e\u52a8\u4e0b\u8f7d\u6309\u94ae"

    .line 15
    .line 16
    const-string v4, "\u5728\u7b14\u8bb0\u9875\u9762\u663e\u793a\u6d6e\u52a8\u4e0b\u8f7d\u6309\u94ae"

    .line 17
    .line 18
    move-object v1, p0

    .line 19
    move v5, p1

    .line 20
    move v6, p2

    .line 21
    invoke-direct/range {v0 .. v7}, Lvf0;->h1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILhw;)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p3, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lna1;->a:Lna1;

    .line 29
    .line 30
    return-object p0
.end method

.method private static final P2(Landroid/widget/TextView;Lxt0;ILandroid/view/View;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    check-cast p3, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result p3

    .line 14
    xor-int/lit8 v0, p3, 0x1

    .line 15
    .line 16
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p0, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    if-nez p3, :cond_0

    .line 24
    .line 25
    const-string v0, "\u2610"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-string v0, "\u2611"

    .line 29
    .line 30
    :goto_0
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    if-eqz p3, :cond_1

    .line 34
    .line 35
    const/16 v0, 0x2c

    .line 36
    .line 37
    const/16 v1, 0x55

    .line 38
    .line 39
    const/16 v2, 0xff

    .line 40
    .line 41
    const/16 v3, 0xfe

    .line 42
    .line 43
    invoke-static {v2, v3, v0, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const/16 v0, 0x82

    .line 49
    .line 50
    const/16 v1, 0x78

    .line 51
    .line 52
    invoke-static {v1, v1, v1, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    :goto_1
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x1

    .line 60
    if-nez p3, :cond_2

    .line 61
    .line 62
    iget p3, p1, Lxt0;->d:I

    .line 63
    .line 64
    shl-int/2addr p0, p2

    .line 65
    or-int/2addr p0, p3

    .line 66
    goto :goto_2

    .line 67
    :cond_2
    iget p3, p1, Lxt0;->d:I

    .line 68
    .line 69
    shl-int/2addr p0, p2

    .line 70
    not-int p0, p0

    .line 71
    and-int/2addr p0, p3

    .line 72
    :goto_2
    iput p0, p1, Lxt0;->d:I

    .line 73
    .line 74
    return-void
.end method

.method public static synthetic Q(ILandroid/content/Context;II)Lna1;
    .locals 0

    .line 1
    invoke-static {p1, p0, p2, p3}, Lvf0;->w2(Landroid/content/Context;III)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic Q0(Landroid/widget/EditText;Landroid/content/SharedPreferences;Landroid/widget/TextView;Landroid/content/Context;Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lvf0;->n3(Landroid/widget/EditText;Landroid/content/SharedPreferences;Landroid/widget/TextView;Landroid/content/Context;Landroid/app/Dialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final Q1(Landroid/content/Context;II)Lna1;
    .locals 1

    .line 1
    sget-object v0, Lvf0;->a:Lvf0;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lvf0;->H2(Landroid/content/Context;II)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lna1;->a:Lna1;

    .line 7
    .line 8
    return-object p0
.end method

.method private static final Q2(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic R(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->t3(Landroid/app/Dialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic R0(Lhw;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->i1(Lhw;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final R1(Landroid/content/Context;IIILandroid/content/SharedPreferences;Landroid/widget/TextView;Landroid/widget/LinearLayout;)Lna1;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v12, p3

    .line 4
    .line 5
    move-object/from16 v13, p4

    .line 6
    .line 7
    move-object/from16 v14, p6

    .line 8
    .line 9
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v0, Lvf0;->a:Lvf0;

    .line 13
    .line 14
    sget-object v15, Lm00;->S:Lm00$a;

    .line 15
    .line 16
    invoke-virtual {v15, v1}, Lm00$a;->b0(Landroid/content/Context;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    new-instance v3, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v4, "\u5f53\u524d\uff1a"

    .line 23
    .line 24
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    new-instance v7, Lc7;

    .line 35
    .line 36
    const/4 v8, 0x7

    .line 37
    move-object/from16 v2, p5

    .line 38
    .line 39
    invoke-direct {v7, v8, v1, v2}, Lc7;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    const-string v2, "\ud83d\udcc1"

    .line 43
    .line 44
    const-string v3, "\u4fdd\u5b58\u76ee\u5f55"

    .line 45
    .line 46
    move/from16 v5, p1

    .line 47
    .line 48
    move/from16 v6, p2

    .line 49
    .line 50
    invoke-direct/range {v0 .. v7}, Lvf0;->j1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILhw;)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v14, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 55
    .line 56
    .line 57
    invoke-direct {v0, v1, v12}, Lvf0;->g1(Landroid/content/Context;I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v14, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v15, v1}, Lm00$a;->d0(Landroid/content/Context;)Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    new-instance v9, Lye0;

    .line 69
    .line 70
    const/4 v2, 0x6

    .line 71
    invoke-direct {v9, v13, v2}, Lye0;-><init>(Landroid/content/SharedPreferences;I)V

    .line 72
    .line 73
    .line 74
    const/16 v10, 0x80

    .line 75
    .line 76
    const/4 v11, 0x0

    .line 77
    const-string v2, "\ud83d\udcc2"

    .line 78
    .line 79
    const-string v3, "\u5206\u7c7b\u4fdd\u5b58"

    .line 80
    .line 81
    const-string v4, "\u539f\u56fe/\u52a8\u6001\u56fe/\u89c6\u9891\u5206\u522b\u521b\u5efa\u5bf9\u5e94\u6587\u4ef6\u5939\u5206\u7c7b\u5b58\u653e"

    .line 82
    .line 83
    move v5, v8

    .line 84
    const/4 v8, 0x0

    .line 85
    move/from16 v5, p1

    .line 86
    .line 87
    invoke-static/range {v0 .. v11}, Lvf0;->m1(Lvf0;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZLsw;ILjava/lang/Object;)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v14, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 92
    .line 93
    .line 94
    invoke-direct {v0, v1, v12}, Lvf0;->g1(Landroid/content/Context;I)Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v14, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v15, v1}, Lm00$a;->e0(Landroid/content/Context;)Z

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    new-instance v9, Lye0;

    .line 106
    .line 107
    const/4 v5, 0x7

    .line 108
    invoke-direct {v9, v13, v5}, Lye0;-><init>(Landroid/content/SharedPreferences;I)V

    .line 109
    .line 110
    .line 111
    const-string v2, "\ud83d\udcc5"

    .line 112
    .line 113
    const-string v3, "\u6309\u65e5\u671f\u4fdd\u5b58"

    .line 114
    .line 115
    const-string v4, "\u4e0b\u8f7d\u65f6\u81ea\u52a8\u521b\u5efa\u5f53\u5929\u65e5\u671f\u547d\u540d\u7684\u6587\u4ef6\u5939\uff08\u5982 2026.5.1\uff09"

    .line 116
    .line 117
    move/from16 v5, p1

    .line 118
    .line 119
    invoke-static/range {v0 .. v11}, Lvf0;->m1(Lvf0;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZLsw;ILjava/lang/Object;)Landroid/view/View;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-virtual {v14, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 124
    .line 125
    .line 126
    invoke-direct {v0, v1, v12}, Lvf0;->g1(Landroid/content/Context;I)Landroid/view/View;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {v14, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v15}, Lm00$a;->j()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    const/4 v3, 0x0

    .line 138
    invoke-interface {v13, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 139
    .line 140
    .line 141
    move-result v7

    .line 142
    new-instance v9, Lye0;

    .line 143
    .line 144
    const/16 v2, 0x8

    .line 145
    .line 146
    invoke-direct {v9, v13, v2}, Lye0;-><init>(Landroid/content/SharedPreferences;I)V

    .line 147
    .line 148
    .line 149
    const-string v2, "\ud83d\udcca"

    .line 150
    .line 151
    const-string v3, "\u4e0b\u8f7d\u8fdb\u5ea6\u5f39\u7a97"

    .line 152
    .line 153
    const-string v4, "\u4e0b\u8f7d\u65f6\u663e\u793a\u8fdb\u5ea6\u5f39\u7a97\uff0c\u53ef\u67e5\u770b\u8fdb\u5ea6\u3001\u901f\u5ea6\u548c\u53d6\u6d88\u4e0b\u8f7d"

    .line 154
    .line 155
    invoke-static/range {v0 .. v11}, Lvf0;->m1(Lvf0;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZLsw;ILjava/lang/Object;)Landroid/view/View;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v14, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 160
    .line 161
    .line 162
    sget-object v0, Lna1;->a:Lna1;

    .line 163
    .line 164
    return-object v0
.end method

.method private static final R2(Landroid/content/Context;Lxt0;Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    sget-object p3, Lm00;->S:Lm00$a;

    .line 2
    .line 3
    iget p1, p1, Lxt0;->d:I

    .line 4
    .line 5
    invoke-virtual {p3, p0, p1}, Lm00$a;->j0(Landroid/content/Context;I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Landroid/app/Dialog;->dismiss()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static synthetic S(Landroid/content/SharedPreferences;Z)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->c2(Landroid/content/SharedPreferences;Z)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic S0(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->b3(Landroid/app/Dialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final S1(Landroid/content/Context;Landroid/widget/TextView;)Lna1;
    .locals 1

    .line 1
    sget-object v0, Lvf0;->a:Lvf0;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lvf0;->j3(Landroid/content/Context;Landroid/widget/TextView;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lna1;->a:Lna1;

    .line 7
    .line 8
    return-object p0
.end method

.method private final S2(Landroid/content/Context;Lhw;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lhw;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lvf0;->f1(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x1c

    .line 6
    .line 7
    const/16 v2, 0x16

    .line 8
    .line 9
    const/16 v3, 0xff

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {v3, v2, v2, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 v4, 0xfc

    .line 19
    .line 20
    const/16 v5, 0xf8

    .line 21
    .line 22
    invoke-static {v3, v5, v5, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    :goto_0
    if-eqz v0, :cond_1

    .line 27
    .line 28
    const/4 v2, -0x1

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-static {v3, v2, v2, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    :goto_1
    const/16 v5, 0xb4

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-static {v5, v3, v3, v3}, Landroid/graphics/Color;->argb(IIII)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    const/16 v0, 0x5a

    .line 44
    .line 45
    const/16 v3, 0x50

    .line 46
    .line 47
    invoke-static {v5, v3, v3, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    :goto_2
    new-instance v7, Landroid/app/Dialog;

    .line 52
    .line 53
    const v3, 0x103000a

    .line 54
    .line 55
    .line 56
    invoke-direct {v7, p1, v3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 57
    .line 58
    .line 59
    const/4 v3, 0x0

    .line 60
    invoke-virtual {v7, v3}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 61
    .line 62
    .line 63
    new-instance v5, Landroid/widget/LinearLayout;

    .line 64
    .line 65
    invoke-direct {v5, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 66
    .line 67
    .line 68
    const/4 v6, 0x1

    .line 69
    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v5, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 73
    .line 74
    .line 75
    sget-object v4, Lvf0;->a:Lvf0;

    .line 76
    .line 77
    const/16 v6, 0x14

    .line 78
    .line 79
    invoke-direct {v4, p1, v6}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    const/16 v9, 0x18

    .line 84
    .line 85
    invoke-direct {v4, p1, v9}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 86
    .line 87
    .line 88
    move-result v9

    .line 89
    invoke-direct {v4, p1, v6}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    const/16 v10, 0x10

    .line 94
    .line 95
    invoke-direct {v4, p1, v10}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 96
    .line 97
    .line 98
    move-result v11

    .line 99
    invoke-virtual {v5, v8, v9, v6, v11}, Landroid/view/View;->setPadding(IIII)V

    .line 100
    .line 101
    .line 102
    const-string v6, "\u26a0\ufe0f \u63d0\u793a"

    .line 103
    .line 104
    const/high16 v8, 0x41900000    # 18.0f

    .line 105
    .line 106
    invoke-static {p1, v6, v8, v2}, Lt1;->i(Landroid/content/Context;Ljava/lang/String;FI)Landroid/widget/TextView;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    sget-object v6, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 111
    .line 112
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 113
    .line 114
    .line 115
    const/16 v8, 0x11

    .line 116
    .line 117
    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 118
    .line 119
    .line 120
    const/16 v9, 0xc

    .line 121
    .line 122
    invoke-direct {v4, p1, v9}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 123
    .line 124
    .line 125
    move-result v11

    .line 126
    invoke-virtual {v2, v3, v3, v3, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v5, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 130
    .line 131
    .line 132
    new-instance v2, Landroid/widget/TextView;

    .line 133
    .line 134
    invoke-direct {v2, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 135
    .line 136
    .line 137
    const-string v11, "\u5373\u5c06\u8df3\u8f6c\u6a21\u5757\u4e3b\u754c\u9762\uff0c\u82e5\u8df3\u8f6c\u5931\u8d25\u6216\u95ea\u9000\uff0c\u8bf7\u68c0\u67e5\u662f\u5426\u5bf9\u5c0f\u7ea2\u4e66\u9690\u85cf\u4e86\u6a21\u5757\u3002\u53ef\u6253\u5f00\u684c\u9762\u6a21\u5757APP\u67e5\u770b\uff0c\u6216\u4eceLSPosed\u7ba1\u7406\u5668\u542f\u52a8\u6a21\u5757\u3002"

    .line 138
    .line 139
    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 140
    .line 141
    .line 142
    const/high16 v11, 0x41500000    # 13.0f

    .line 143
    .line 144
    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setTextSize(F)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 151
    .line 152
    .line 153
    invoke-direct {v4, p1, v10}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    invoke-virtual {v2, v3, v3, v3, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v5, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 161
    .line 162
    .line 163
    move v0, v9

    .line 164
    new-instance v9, Landroid/widget/TextView;

    .line 165
    .line 166
    invoke-direct {v9, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 167
    .line 168
    .line 169
    const-string v2, "3s \u540e\u8df3\u8f6c..."

    .line 170
    .line 171
    invoke-virtual {v9, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 172
    .line 173
    .line 174
    const/high16 v2, 0x41600000    # 14.0f

    .line 175
    .line 176
    invoke-virtual {v9, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 177
    .line 178
    .line 179
    const/16 v2, 0x2c

    .line 180
    .line 181
    const/16 v10, 0x55

    .line 182
    .line 183
    const/16 v11, 0xdc

    .line 184
    .line 185
    const/16 v12, 0xfe

    .line 186
    .line 187
    invoke-static {v11, v12, v2, v10}, Landroid/graphics/Color;->argb(IIII)I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    invoke-virtual {v9, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v9, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v9, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 198
    .line 199
    .line 200
    invoke-direct {v4, p1, v0}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    invoke-virtual {v9, v3, v3, v3, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v5, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v7, v5}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v7}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    if-eqz v0, :cond_3

    .line 218
    .line 219
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 228
    .line 229
    int-to-double v4, v2

    .line 230
    const-wide v10, 0x3feb333333333333L    # 0.85

    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    mul-double/2addr v4, v10

    .line 236
    double-to-int v2, v4

    .line 237
    const/4 v4, -0x2

    .line 238
    invoke-virtual {v0, v2, v4}, Landroid/view/Window;->setLayout(II)V

    .line 239
    .line 240
    .line 241
    :cond_3
    invoke-virtual {v7}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    if-eqz v0, :cond_4

    .line 246
    .line 247
    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    .line 248
    .line 249
    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 253
    .line 254
    .line 255
    :cond_4
    invoke-virtual {v7}, Landroid/app/Dialog;->show()V

    .line 256
    .line 257
    .line 258
    invoke-direct {p0, p1, v7, v1}, Lvf0;->z1(Landroid/content/Context;Landroid/app/Dialog;I)V

    .line 259
    .line 260
    .line 261
    new-instance v10, Landroid/os/Handler;

    .line 262
    .line 263
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    invoke-direct {v10, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 268
    .line 269
    .line 270
    new-instance v6, Lxt0;

    .line 271
    .line 272
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 273
    .line 274
    .line 275
    const/4 p0, 0x3

    .line 276
    iput p0, v6, Lxt0;->d:I

    .line 277
    .line 278
    new-instance v5, Lvf0$e;

    .line 279
    .line 280
    move-object v8, p2

    .line 281
    invoke-direct/range {v5 .. v10}, Lvf0$e;-><init>(Lxt0;Landroid/app/Dialog;Lhw;Landroid/widget/TextView;Landroid/os/Handler;)V

    .line 282
    .line 283
    .line 284
    const-wide/16 p0, 0x3e8

    .line 285
    .line 286
    invoke-virtual {v10, v5, p0, p1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 287
    .line 288
    .line 289
    return-void
.end method

.method public static synthetic T(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->Q2(Landroid/app/Dialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic T0(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->D2(Landroid/app/Dialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final T1(Landroid/content/SharedPreferences;Z)Lna1;
    .locals 1

    .line 1
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lm00;->S:Lm00$a;

    .line 6
    .line 7
    invoke-virtual {v0}, Lm00$a;->h()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p0, v0, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lna1;->a:Lna1;

    .line 19
    .line 20
    return-object p0
.end method

.method private final T2(Landroid/content/Context;II)V
    .locals 16

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move/from16 v3, p2

    .line 4
    .line 5
    invoke-direct/range {p0 .. p1}, Lvf0;->f1(Landroid/content/Context;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v2, 0xff

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/16 v4, 0x1c

    .line 14
    .line 15
    const/16 v5, 0x16

    .line 16
    .line 17
    :goto_0
    invoke-static {v2, v5, v5, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    const/16 v4, 0xfc

    .line 23
    .line 24
    const/16 v5, 0xf8

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    const/16 v5, 0x8c

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    const/16 v6, 0x5a

    .line 32
    .line 33
    const/16 v7, 0x50

    .line 34
    .line 35
    :goto_2
    invoke-static {v5, v7, v7, v6}, Landroid/graphics/Color;->argb(IIII)I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    move v6, v5

    .line 40
    goto :goto_3

    .line 41
    :cond_1
    const/16 v6, 0xd2

    .line 42
    .line 43
    const/16 v7, 0xc8

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :goto_3
    if-eqz v0, :cond_2

    .line 47
    .line 48
    const/4 v0, -0x1

    .line 49
    :goto_4
    move v7, v0

    .line 50
    goto :goto_5

    .line 51
    :cond_2
    const/16 v0, 0x3c

    .line 52
    .line 53
    const/16 v5, 0x32

    .line 54
    .line 55
    invoke-static {v2, v5, v5, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    goto :goto_4

    .line 60
    :goto_5
    sget-object v8, Lm00;->S:Lm00$a;

    .line 61
    .line 62
    invoke-virtual {v8}, Lm00$a;->Y()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const/4 v9, 0x0

    .line 67
    invoke-virtual {v1, v0, v9}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 68
    .line 69
    .line 70
    move-result-object v10

    .line 71
    new-instance v11, Landroid/app/Dialog;

    .line 72
    .line 73
    const v0, 0x103000a

    .line 74
    .line 75
    .line 76
    invoke-direct {v11, v1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 77
    .line 78
    .line 79
    const/4 v12, 0x1

    .line 80
    invoke-virtual {v11, v12}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 81
    .line 82
    .line 83
    new-instance v13, Landroid/widget/LinearLayout;

    .line 84
    .line 85
    invoke-direct {v13, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v13, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v13, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 92
    .line 93
    .line 94
    sget-object v14, Lvf0;->a:Lvf0;

    .line 95
    .line 96
    const/16 v0, 0x14

    .line 97
    .line 98
    invoke-direct {v14, v1, v0}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    const/16 v4, 0x12

    .line 103
    .line 104
    invoke-direct {v14, v1, v4}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    invoke-direct {v14, v1, v0}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    const/16 v15, 0x10

    .line 113
    .line 114
    invoke-direct {v14, v1, v15}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    invoke-virtual {v13, v2, v4, v0, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 119
    .line 120
    .line 121
    const-string v0, "\u7b14\u8bb0\u9875\u56de\u5230\u9876\u90e8\u6309\u94ae"

    .line 122
    .line 123
    const/high16 v2, 0x41a00000    # 20.0f

    .line 124
    .line 125
    const/16 v4, 0x11

    .line 126
    .line 127
    invoke-static {v1, v0, v2, v3, v4}, Lt1;->j(Landroid/content/Context;Ljava/lang/String;FII)Landroid/widget/TextView;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-direct {v14, v1, v15}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    invoke-virtual {v0, v9, v9, v9, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v13, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 139
    .line 140
    .line 141
    new-instance v0, Lvt0;

    .line 142
    .line 143
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v8}, Lm00$a;->I()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-interface {v10, v2, v12}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    iput-boolean v2, v0, Lvt0;->d:Z

    .line 155
    .line 156
    new-instance v5, Lve0;

    .line 157
    .line 158
    invoke-direct {v5, v0, v10, v12}, Lve0;-><init>(Lvt0;Landroid/content/SharedPreferences;I)V

    .line 159
    .line 160
    .line 161
    move v0, v4

    .line 162
    move v4, v2

    .line 163
    const-string v2, "\u542f\u7528\u56de\u5230\u9876\u90e8"

    .line 164
    .line 165
    move v12, v0

    .line 166
    move-object/from16 v0, p0

    .line 167
    .line 168
    invoke-direct/range {v0 .. v5}, Lvf0;->c1(Landroid/content/Context;Ljava/lang/String;IZLsw;)Landroid/view/View;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-virtual {v13, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v8}, Lm00$a;->K()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    const/16 v4, 0x2c

    .line 180
    .line 181
    invoke-interface {v10, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    new-instance v4, Landroid/widget/TextView;

    .line 186
    .line 187
    invoke-direct {v4, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 188
    .line 189
    .line 190
    new-instance v5, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    const-string v8, "dp"

    .line 199
    .line 200
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 208
    .line 209
    .line 210
    const/high16 v5, 0x41c00000    # 24.0f

    .line 211
    .line 212
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v4, v12}, Landroid/widget/TextView;->setGravity(I)V

    .line 219
    .line 220
    .line 221
    const/16 v3, 0x8

    .line 222
    .line 223
    invoke-direct {v14, v1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    const/16 v5, 0xa

    .line 228
    .line 229
    invoke-direct {v14, v1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 230
    .line 231
    .line 232
    move-result v8

    .line 233
    invoke-virtual {v4, v9, v3, v9, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v13, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 237
    .line 238
    .line 239
    invoke-direct {v0, v1, v2}, Lvf0;->b1(Landroid/content/Context;I)Landroid/widget/SeekBar;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    const/16 v8, 0x2a

    .line 244
    .line 245
    invoke-virtual {v3, v8}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 246
    .line 247
    .line 248
    add-int/lit8 v2, v2, -0x1e

    .line 249
    .line 250
    invoke-virtual {v3}, Landroid/widget/ProgressBar;->getMax()I

    .line 251
    .line 252
    .line 253
    move-result v8

    .line 254
    invoke-static {v2, v9, v8}, Lw60;->n(III)I

    .line 255
    .line 256
    .line 257
    move-result v2

    .line 258
    invoke-virtual {v3, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 259
    .line 260
    .line 261
    new-instance v2, Lvf0$f;

    .line 262
    .line 263
    invoke-direct {v2, v4, v10}, Lvf0$f;-><init>(Landroid/widget/TextView;Landroid/content/SharedPreferences;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v3, v2}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v13, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 270
    .line 271
    .line 272
    new-instance v2, Landroid/widget/TextView;

    .line 273
    .line 274
    invoke-direct {v2, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 275
    .line 276
    .line 277
    const-string v3, "\u62d6\u52a8\u6ed1\u5757\u8c03\u6574\u5927\u5c0f\uff0c\u4e0b\u6b21\u8fdb\u5165\u7b14\u8bb0\u9875\u65f6\u751f\u6548"

    .line 278
    .line 279
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 280
    .line 281
    .line 282
    const/high16 v3, 0x41300000    # 11.0f

    .line 283
    .line 284
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 285
    .line 286
    .line 287
    move/from16 v3, p3

    .line 288
    .line 289
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 290
    .line 291
    .line 292
    invoke-direct {v14, v1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 293
    .line 294
    .line 295
    move-result v3

    .line 296
    invoke-direct {v14, v1, v15}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 297
    .line 298
    .line 299
    move-result v4

    .line 300
    invoke-virtual {v2, v9, v3, v9, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v13, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 304
    .line 305
    .line 306
    new-instance v5, Lwe0;

    .line 307
    .line 308
    const/4 v2, 0x1

    .line 309
    invoke-direct {v5, v11, v2}, Lwe0;-><init>(Landroid/app/Dialog;I)V

    .line 310
    .line 311
    .line 312
    move v4, v6

    .line 313
    move v3, v7

    .line 314
    move-object v2, v13

    .line 315
    invoke-direct/range {v0 .. v5}, Lvf0;->W0(Landroid/content/Context;Landroid/widget/LinearLayout;IILhw;)V

    .line 316
    .line 317
    .line 318
    invoke-direct {v0, v11, v1, v2}, Lvf0;->A3(Landroid/app/Dialog;Landroid/content/Context;Landroid/view/View;)V

    .line 319
    .line 320
    .line 321
    return-void
.end method

.method public static synthetic U(Landroid/content/Context;IIILandroid/content/SharedPreferences;Landroid/widget/LinearLayout;)Lna1;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lvf0;->r2(Landroid/content/Context;IIILandroid/content/SharedPreferences;Landroid/widget/LinearLayout;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic U0(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->e3(Landroid/app/Dialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final U1(Landroid/content/SharedPreferences;Z)Lna1;
    .locals 1

    .line 1
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lm00;->S:Lm00$a;

    .line 6
    .line 7
    invoke-virtual {v0}, Lm00$a;->i()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p0, v0, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lna1;->a:Lna1;

    .line 19
    .line 20
    return-object p0
.end method

.method private static final U2(Lvt0;Landroid/content/SharedPreferences;Z)Lna1;
    .locals 0

    .line 1
    iput-boolean p2, p0, Lvt0;->d:Z

    .line 2
    .line 3
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, Lm00;->S:Lm00$a;

    .line 8
    .line 9
    invoke-virtual {p1}, Lm00$a;->I()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 18
    .line 19
    .line 20
    sget-object p0, Lna1;->a:Lna1;

    .line 21
    .line 22
    return-object p0
.end method

.method public static synthetic V(Landroid/content/Context;ILandroid/widget/LinearLayout;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lvf0;->H1(Landroid/content/Context;ILandroid/widget/LinearLayout;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic V0(Lvf0;Landroid/content/Context;I)I
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final V1(Landroid/content/SharedPreferences;Z)Lna1;
    .locals 1

    .line 1
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lm00;->S:Lm00$a;

    .line 6
    .line 7
    invoke-virtual {v0}, Lm00$a;->j()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p0, v0, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lna1;->a:Lna1;

    .line 19
    .line 20
    return-object p0
.end method

.method private static final V2(Landroid/app/Dialog;)Lna1;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lna1;->a:Lna1;

    .line 5
    .line 6
    return-object p0
.end method

.method public static synthetic W(Landroid/content/SharedPreferences;Z)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->n2(Landroid/content/SharedPreferences;Z)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final W0(Landroid/content/Context;Landroid/widget/LinearLayout;IILhw;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/widget/LinearLayout;",
            "II",
            "Lhw;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    new-instance v2, Landroid/widget/LinearLayout;

    .line 6
    .line 7
    invoke-direct {v2, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 12
    .line 13
    .line 14
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 15
    .line 16
    const/4 v5, -0x1

    .line 17
    const/4 v6, -0x2

    .line 18
    invoke-direct {v4, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 22
    .line 23
    .line 24
    new-instance v4, Landroid/widget/TextView;

    .line 25
    .line 26
    invoke-direct {v4, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 27
    .line 28
    .line 29
    const-string v7, "\u53d6\u6d88"

    .line 30
    .line 31
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    const/high16 v7, 0x41600000    # 14.0f

    .line 35
    .line 36
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 37
    .line 38
    .line 39
    move/from16 v8, p3

    .line 40
    .line 41
    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 42
    .line 43
    .line 44
    const/16 v8, 0x11

    .line 45
    .line 46
    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 47
    .line 48
    .line 49
    new-instance v9, Landroid/graphics/drawable/GradientDrawable;

    .line 50
    .line 51
    invoke-direct {v9}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v9, v3}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 55
    .line 56
    .line 57
    sget-object v10, Lvf0;->a:Lvf0;

    .line 58
    .line 59
    const/16 v11, 0x1c

    .line 60
    .line 61
    invoke-direct {v10, v0, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 62
    .line 63
    .line 64
    move-result v12

    .line 65
    int-to-float v12, v12

    .line 66
    invoke-virtual {v9, v12}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 67
    .line 68
    .line 69
    move/from16 v12, p4

    .line 70
    .line 71
    invoke-virtual {v9, v12}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 75
    .line 76
    .line 77
    const/16 v9, 0xc

    .line 78
    .line 79
    invoke-direct {v10, v0, v9}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 80
    .line 81
    .line 82
    move-result v12

    .line 83
    invoke-direct {v10, v0, v9}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 84
    .line 85
    .line 86
    move-result v13

    .line 87
    invoke-virtual {v4, v3, v12, v3, v13}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 88
    .line 89
    .line 90
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    .line 91
    .line 92
    const/high16 v13, 0x3f800000    # 1.0f

    .line 93
    .line 94
    invoke-direct {v12, v3, v6, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 95
    .line 96
    .line 97
    const/4 v14, 0x6

    .line 98
    invoke-direct {v10, v0, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 99
    .line 100
    .line 101
    move-result v15

    .line 102
    invoke-virtual {v12, v3, v3, v15, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 106
    .line 107
    .line 108
    new-instance v12, Ld00;

    .line 109
    .line 110
    const/4 v15, 0x2

    .line 111
    invoke-direct {v12, v15, v1}, Ld00;-><init>(ILhw;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v4, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 118
    .line 119
    .line 120
    const-string v4, "\u5b8c\u6210"

    .line 121
    .line 122
    invoke-static {v0, v4, v7, v5, v8}, Lt1;->j(Landroid/content/Context;Ljava/lang/String;FII)Landroid/widget/TextView;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    invoke-static {v3}, Lt1;->h(I)Landroid/graphics/drawable/GradientDrawable;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    invoke-direct {v10, v0, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    int-to-float v7, v7

    .line 135
    invoke-virtual {v5, v7}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 136
    .line 137
    .line 138
    const/16 v7, 0x2c

    .line 139
    .line 140
    const/16 v8, 0x55

    .line 141
    .line 142
    const/16 v11, 0xdc

    .line 143
    .line 144
    const/16 v12, 0xfe

    .line 145
    .line 146
    invoke-static {v11, v12, v7, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 147
    .line 148
    .line 149
    move-result v7

    .line 150
    invoke-virtual {v5, v7}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v4, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 154
    .line 155
    .line 156
    invoke-direct {v10, v0, v9}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    invoke-direct {v10, v0, v9}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 161
    .line 162
    .line 163
    move-result v7

    .line 164
    invoke-virtual {v4, v3, v5, v3, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 165
    .line 166
    .line 167
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 168
    .line 169
    invoke-direct {v5, v3, v6, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 170
    .line 171
    .line 172
    invoke-direct {v10, v0, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    invoke-virtual {v5, v0, v3, v3, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 180
    .line 181
    .line 182
    new-instance v0, Ld00;

    .line 183
    .line 184
    const/4 v3, 0x3

    .line 185
    invoke-direct {v0, v3, v1}, Ld00;-><init>(ILhw;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 192
    .line 193
    .line 194
    move-object/from16 v0, p2

    .line 195
    .line 196
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 197
    .line 198
    .line 199
    return-void
.end method

.method private static final W1(Landroid/content/SharedPreferences;Landroid/content/Context;IILandroid/widget/LinearLayout;IIILandroid/widget/LinearLayout;)Lna1;
    .locals 16

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move/from16 v7, p2

    .line 6
    .line 7
    move/from16 v8, p3

    .line 8
    .line 9
    move-object/from16 v9, p4

    .line 10
    .line 11
    move/from16 v3, p5

    .line 12
    .line 13
    move/from16 v4, p6

    .line 14
    .line 15
    move-object/from16 v10, p8

    .line 16
    .line 17
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object v11, Lm00;->S:Lm00$a;

    .line 21
    .line 22
    invoke-virtual {v11}, Lm00$a;->R()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v12, 0x1

    .line 27
    invoke-interface {v6, v0, v12}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 28
    .line 29
    .line 30
    sget-object v13, Lvf0;->a:Lvf0;

    .line 31
    .line 32
    new-instance v0, Lcf0;

    .line 33
    .line 34
    const/4 v14, 0x0

    .line 35
    invoke-direct {v0, v3, v2, v4, v14}, Lcf0;-><init>(ILandroid/content/Context;II)V

    .line 36
    .line 37
    .line 38
    invoke-direct {v13, v2, v7, v8, v0}, Lvf0;->r1(Landroid/content/Context;IILsw;)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v10, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 43
    .line 44
    .line 45
    const/4 v15, 0x4

    .line 46
    invoke-direct {v13, v2, v15}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-direct {v13, v2, v9, v0}, Lvf0;->Z0(Landroid/content/Context;Landroid/widget/LinearLayout;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v11}, Lm00$a;->I()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-interface {v6, v0, v12}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 58
    .line 59
    .line 60
    new-instance v0, Lcf0;

    .line 61
    .line 62
    invoke-direct {v0, v3, v2, v4, v12}, Lcf0;-><init>(ILandroid/content/Context;II)V

    .line 63
    .line 64
    .line 65
    invoke-direct {v13, v2, v7, v8, v0}, Lvf0;->r1(Landroid/content/Context;IILsw;)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v10, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v11}, Lm00$a;->H()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-interface {v6, v0, v14}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    new-instance v0, Ldf0;

    .line 81
    .line 82
    const/4 v5, 0x0

    .line 83
    invoke-direct/range {v0 .. v6}, Ldf0;-><init>(ZLandroid/content/Context;IIILandroid/content/SharedPreferences;)V

    .line 84
    .line 85
    .line 86
    invoke-direct {v13, v2, v7, v8, v0}, Lvf0;->r1(Landroid/content/Context;IILsw;)Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v10, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 91
    .line 92
    .line 93
    sget-object v0, Ln90;->a:Ln90;

    .line 94
    .line 95
    invoke-virtual {v0, v2}, Ln90;->y(Landroid/content/Context;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    const-string v1, "X"

    .line 100
    .line 101
    invoke-static {v0, v1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_0

    .line 106
    .line 107
    invoke-virtual {v11}, Lm00$a;->N()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-interface {v6, v1, v14}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    move v5, v1

    .line 116
    :goto_0
    move v2, v0

    .line 117
    goto :goto_1

    .line 118
    :cond_0
    move v5, v14

    .line 119
    goto :goto_0

    .line 120
    :goto_1
    new-instance v0, Lef0;

    .line 121
    .line 122
    move-object/from16 v1, p1

    .line 123
    .line 124
    move/from16 v3, p5

    .line 125
    .line 126
    move/from16 v4, p6

    .line 127
    .line 128
    invoke-direct/range {v0 .. v6}, Lef0;-><init>(Landroid/content/Context;ZIIZLandroid/content/SharedPreferences;)V

    .line 129
    .line 130
    .line 131
    move-object v2, v1

    .line 132
    invoke-direct {v13, v2, v7, v8, v0}, Lvf0;->r1(Landroid/content/Context;IILsw;)Landroid/view/View;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {v10, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v11}, Lm00$a;->k()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-interface {v6, v0, v14}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    new-instance v0, Ldf0;

    .line 148
    .line 149
    const/4 v5, 0x1

    .line 150
    invoke-direct/range {v0 .. v6}, Ldf0;-><init>(ZLandroid/content/Context;IIILandroid/content/SharedPreferences;)V

    .line 151
    .line 152
    .line 153
    invoke-direct {v13, v2, v7, v8, v0}, Lvf0;->r1(Landroid/content/Context;IILsw;)Landroid/view/View;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v10, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 158
    .line 159
    .line 160
    new-instance v0, Lff0;

    .line 161
    .line 162
    move/from16 v5, p7

    .line 163
    .line 164
    move-object v1, v2

    .line 165
    move v6, v7

    .line 166
    move-object/from16 v2, p0

    .line 167
    .line 168
    invoke-direct/range {v0 .. v6}, Lff0;-><init>(Landroid/content/Context;Landroid/content/SharedPreferences;IIII)V

    .line 169
    .line 170
    .line 171
    move-object v6, v2

    .line 172
    move-object v2, v1

    .line 173
    invoke-direct {v13, v2, v7, v8, v0}, Lvf0;->r1(Landroid/content/Context;IILsw;)Landroid/view/View;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-virtual {v10, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v11}, Lm00$a;->O()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-interface {v6, v0, v14}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    new-instance v0, Ldf0;

    .line 189
    .line 190
    const/4 v5, 0x2

    .line 191
    invoke-direct/range {v0 .. v6}, Ldf0;-><init>(ZLandroid/content/Context;IIILandroid/content/SharedPreferences;)V

    .line 192
    .line 193
    .line 194
    invoke-direct {v13, v2, v7, v8, v0}, Lvf0;->r1(Landroid/content/Context;IILsw;)Landroid/view/View;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-virtual {v10, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 199
    .line 200
    .line 201
    invoke-direct {v13, v2, v15}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    invoke-direct {v13, v2, v9, v0}, Lvf0;->Z0(Landroid/content/Context;Landroid/widget/LinearLayout;I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v11}, Lm00$a;->X()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-interface {v6, v0, v12}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    new-instance v0, Ldf0;

    .line 217
    .line 218
    const/4 v5, 0x3

    .line 219
    invoke-direct/range {v0 .. v6}, Ldf0;-><init>(ZLandroid/content/Context;IIILandroid/content/SharedPreferences;)V

    .line 220
    .line 221
    .line 222
    invoke-direct {v13, v2, v7, v8, v0}, Lvf0;->r1(Landroid/content/Context;IILsw;)Landroid/view/View;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-virtual {v10, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 227
    .line 228
    .line 229
    sget-object v0, Lna1;->a:Lna1;

    .line 230
    .line 231
    return-object v0
.end method

.method private final W2(Landroid/content/Context;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-direct/range {p0 .. p1}, Lvf0;->f1(Landroid/content/Context;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/16 v3, 0x16

    .line 10
    .line 11
    const/16 v4, 0x1c

    .line 12
    .line 13
    const/16 v5, 0xff

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-static {v5, v3, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/16 v6, 0xfc

    .line 23
    .line 24
    const/16 v7, 0xf8

    .line 25
    .line 26
    invoke-static {v5, v7, v7, v6}, Landroid/graphics/Color;->argb(IIII)I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    :goto_0
    if-eqz v2, :cond_1

    .line 31
    .line 32
    const/4 v3, -0x1

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-static {v5, v3, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    :goto_1
    const/16 v8, 0x5a

    .line 39
    .line 40
    const/16 v9, 0x96

    .line 41
    .line 42
    const/16 v10, 0x50

    .line 43
    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    invoke-static {v9, v5, v5, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 47
    .line 48
    .line 49
    move-result v9

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    invoke-static {v9, v10, v10, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 52
    .line 53
    .line 54
    move-result v9

    .line 55
    :goto_2
    const/16 v11, 0x8c

    .line 56
    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    invoke-static {v11, v10, v10, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    goto :goto_3

    .line 64
    :cond_3
    const/16 v8, 0xd2

    .line 65
    .line 66
    const/16 v12, 0xc8

    .line 67
    .line 68
    invoke-static {v11, v12, v12, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    :goto_3
    if-eqz v2, :cond_4

    .line 73
    .line 74
    const/4 v2, -0x1

    .line 75
    goto :goto_4

    .line 76
    :cond_4
    const/16 v2, 0x3c

    .line 77
    .line 78
    const/16 v11, 0x32

    .line 79
    .line 80
    invoke-static {v5, v11, v11, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    :goto_4
    new-instance v5, Landroid/app/Dialog;

    .line 85
    .line 86
    const v11, 0x103000a

    .line 87
    .line 88
    .line 89
    invoke-direct {v5, v1, v11}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 90
    .line 91
    .line 92
    const/4 v11, 0x1

    .line 93
    invoke-virtual {v5, v11}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 94
    .line 95
    .line 96
    sget-object v12, Lm00;->S:Lm00$a;

    .line 97
    .line 98
    invoke-virtual {v12}, Lm00$a;->Y()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v13

    .line 102
    const/4 v14, 0x0

    .line 103
    invoke-virtual {v1, v13, v14}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 104
    .line 105
    .line 106
    move-result-object v13

    .line 107
    new-instance v15, Lxt0;

    .line 108
    .line 109
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v12}, Lm00$a;->K()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v12

    .line 116
    const/16 v10, 0x2c

    .line 117
    .line 118
    invoke-interface {v13, v12, v10}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 119
    .line 120
    .line 121
    move-result v10

    .line 122
    iput v10, v15, Lxt0;->d:I

    .line 123
    .line 124
    new-instance v10, Landroid/widget/LinearLayout;

    .line 125
    .line 126
    invoke-direct {v10, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v10, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v10, v6}, Landroid/view/View;->setBackgroundColor(I)V

    .line 133
    .line 134
    .line 135
    sget-object v6, Lvf0;->a:Lvf0;

    .line 136
    .line 137
    const/16 v11, 0x14

    .line 138
    .line 139
    invoke-direct {v6, v1, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 140
    .line 141
    .line 142
    move-result v12

    .line 143
    const/16 v4, 0x12

    .line 144
    .line 145
    invoke-direct {v6, v1, v4}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    invoke-direct {v6, v1, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 150
    .line 151
    .line 152
    move-result v7

    .line 153
    const/16 v14, 0x10

    .line 154
    .line 155
    invoke-direct {v6, v1, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 156
    .line 157
    .line 158
    move-result v11

    .line 159
    invoke-virtual {v10, v12, v4, v7, v11}, Landroid/view/View;->setPadding(IIII)V

    .line 160
    .line 161
    .line 162
    const-string v4, "\u7b14\u8bb0\u9875\u56de\u5230\u9876\u90e8\u6309\u94ae\u5927\u5c0f"

    .line 163
    .line 164
    const/high16 v7, 0x41a00000    # 20.0f

    .line 165
    .line 166
    const/16 v11, 0x11

    .line 167
    .line 168
    invoke-static {v1, v4, v7, v3, v11}, Lt1;->j(Landroid/content/Context;Ljava/lang/String;FII)Landroid/widget/TextView;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    const/16 v7, 0x14

    .line 173
    .line 174
    invoke-direct {v6, v1, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 175
    .line 176
    .line 177
    move-result v7

    .line 178
    const/4 v12, 0x0

    .line 179
    invoke-virtual {v4, v12, v12, v12, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v10, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 183
    .line 184
    .line 185
    new-instance v4, Landroid/widget/TextView;

    .line 186
    .line 187
    invoke-direct {v4, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 188
    .line 189
    .line 190
    iget v7, v15, Lxt0;->d:I

    .line 191
    .line 192
    new-instance v12, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    const-string v7, "dp"

    .line 201
    .line 202
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v7

    .line 209
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 210
    .line 211
    .line 212
    const/high16 v7, 0x41e00000    # 28.0f

    .line 213
    .line 214
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v4, v11}, Landroid/widget/TextView;->setGravity(I)V

    .line 221
    .line 222
    .line 223
    const/16 v3, 0xe

    .line 224
    .line 225
    invoke-direct {v6, v1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    const/4 v12, 0x0

    .line 230
    invoke-virtual {v4, v12, v12, v12, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v10, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 234
    .line 235
    .line 236
    iget v3, v15, Lxt0;->d:I

    .line 237
    .line 238
    invoke-direct {v0, v1, v3}, Lvf0;->b1(Landroid/content/Context;I)Landroid/widget/SeekBar;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    const/16 v7, 0x2a

    .line 243
    .line 244
    invoke-virtual {v3, v7}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 245
    .line 246
    .line 247
    iget v7, v15, Lxt0;->d:I

    .line 248
    .line 249
    add-int/lit8 v7, v7, -0x1e

    .line 250
    .line 251
    invoke-virtual {v3}, Landroid/widget/ProgressBar;->getMax()I

    .line 252
    .line 253
    .line 254
    move-result v11

    .line 255
    invoke-static {v7, v12, v11}, Lw60;->n(III)I

    .line 256
    .line 257
    .line 258
    move-result v7

    .line 259
    invoke-virtual {v3, v7}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 260
    .line 261
    .line 262
    new-instance v7, Lvf0$g;

    .line 263
    .line 264
    invoke-direct {v7, v15, v4, v13}, Lvf0$g;-><init>(Lxt0;Landroid/widget/TextView;Landroid/content/SharedPreferences;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v3, v7}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v10, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 271
    .line 272
    .line 273
    new-instance v3, Landroid/widget/TextView;

    .line 274
    .line 275
    invoke-direct {v3, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 276
    .line 277
    .line 278
    const-string v4, "\u62d6\u52a8\u6ed1\u5757\u8c03\u6574\u5927\u5c0f\uff0c\u4e0b\u6b21\u8fdb\u5165\u7b14\u8bb0\u9875\u65f6\u751f\u6548"

    .line 279
    .line 280
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 281
    .line 282
    .line 283
    const/high16 v4, 0x41300000    # 11.0f

    .line 284
    .line 285
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 289
    .line 290
    .line 291
    const/16 v4, 0xa

    .line 292
    .line 293
    invoke-direct {v6, v1, v4}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 294
    .line 295
    .line 296
    move-result v4

    .line 297
    invoke-direct {v6, v1, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 298
    .line 299
    .line 300
    move-result v7

    .line 301
    const/4 v12, 0x0

    .line 302
    invoke-virtual {v3, v12, v4, v12, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v10, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 306
    .line 307
    .line 308
    new-instance v3, Landroid/widget/LinearLayout;

    .line 309
    .line 310
    invoke-direct {v3, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v3, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 314
    .line 315
    .line 316
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 317
    .line 318
    const/4 v7, -0x2

    .line 319
    const/4 v9, -0x1

    .line 320
    invoke-direct {v4, v9, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 324
    .line 325
    .line 326
    new-instance v4, Landroid/widget/TextView;

    .line 327
    .line 328
    invoke-direct {v4, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 329
    .line 330
    .line 331
    const-string v9, "\u2190 \u8fd4\u56de"

    .line 332
    .line 333
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 334
    .line 335
    .line 336
    const/high16 v9, 0x41600000    # 14.0f

    .line 337
    .line 338
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 342
    .line 343
    .line 344
    const/16 v2, 0x11

    .line 345
    .line 346
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 347
    .line 348
    .line 349
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    .line 350
    .line 351
    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 352
    .line 353
    .line 354
    const/4 v12, 0x0

    .line 355
    invoke-virtual {v2, v12}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 356
    .line 357
    .line 358
    const/16 v11, 0x1c

    .line 359
    .line 360
    invoke-direct {v6, v1, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 361
    .line 362
    .line 363
    move-result v13

    .line 364
    int-to-float v11, v13

    .line 365
    invoke-virtual {v2, v11}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v2, v8}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v4, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 372
    .line 373
    .line 374
    const/16 v2, 0xc

    .line 375
    .line 376
    invoke-direct {v6, v1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 377
    .line 378
    .line 379
    move-result v8

    .line 380
    invoke-direct {v6, v1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 381
    .line 382
    .line 383
    move-result v11

    .line 384
    invoke-virtual {v4, v12, v8, v12, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 385
    .line 386
    .line 387
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 388
    .line 389
    const/high16 v11, 0x3f800000    # 1.0f

    .line 390
    .line 391
    invoke-direct {v8, v12, v7, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 392
    .line 393
    .line 394
    const/4 v13, 0x6

    .line 395
    invoke-direct {v6, v1, v13}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 396
    .line 397
    .line 398
    move-result v14

    .line 399
    invoke-virtual {v8, v12, v12, v14, v12}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v4, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 403
    .line 404
    .line 405
    new-instance v8, Luy;

    .line 406
    .line 407
    const/16 v14, 0xb

    .line 408
    .line 409
    invoke-direct {v8, v5, v14}, Luy;-><init>(Landroid/app/Dialog;I)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v4, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 416
    .line 417
    .line 418
    const-string v4, "\u5b8c\u6210"

    .line 419
    .line 420
    const/16 v8, 0x11

    .line 421
    .line 422
    const/4 v14, -0x1

    .line 423
    invoke-static {v1, v4, v9, v14, v8}, Lt1;->j(Landroid/content/Context;Ljava/lang/String;FII)Landroid/widget/TextView;

    .line 424
    .line 425
    .line 426
    move-result-object v4

    .line 427
    invoke-static {v12}, Lt1;->h(I)Landroid/graphics/drawable/GradientDrawable;

    .line 428
    .line 429
    .line 430
    move-result-object v8

    .line 431
    const/16 v9, 0x1c

    .line 432
    .line 433
    invoke-direct {v6, v1, v9}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 434
    .line 435
    .line 436
    move-result v14

    .line 437
    int-to-float v9, v14

    .line 438
    invoke-virtual {v8, v9}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 439
    .line 440
    .line 441
    const/16 v9, 0xdc

    .line 442
    .line 443
    const/16 v14, 0xb4

    .line 444
    .line 445
    const/16 v15, 0x50

    .line 446
    .line 447
    invoke-static {v9, v12, v14, v15}, Landroid/graphics/Color;->argb(IIII)I

    .line 448
    .line 449
    .line 450
    move-result v9

    .line 451
    invoke-virtual {v8, v9}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v4, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 455
    .line 456
    .line 457
    invoke-direct {v6, v1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 458
    .line 459
    .line 460
    move-result v8

    .line 461
    invoke-direct {v6, v1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 462
    .line 463
    .line 464
    move-result v9

    .line 465
    invoke-virtual {v4, v12, v8, v12, v9}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 466
    .line 467
    .line 468
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 469
    .line 470
    invoke-direct {v8, v12, v7, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 471
    .line 472
    .line 473
    invoke-direct {v6, v1, v13}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 474
    .line 475
    .line 476
    move-result v6

    .line 477
    invoke-virtual {v8, v6, v12, v12, v12}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v4, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 481
    .line 482
    .line 483
    new-instance v6, Luy;

    .line 484
    .line 485
    invoke-direct {v6, v5, v2}, Luy;-><init>(Landroid/app/Dialog;I)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v4, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v10, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v5, v10}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 498
    .line 499
    .line 500
    invoke-virtual {v5}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 501
    .line 502
    .line 503
    move-result-object v2

    .line 504
    if-eqz v2, :cond_5

    .line 505
    .line 506
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 507
    .line 508
    .line 509
    move-result-object v3

    .line 510
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 511
    .line 512
    .line 513
    move-result-object v3

    .line 514
    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 515
    .line 516
    int-to-double v3, v3

    .line 517
    const-wide v8, 0x3feb333333333333L    # 0.85

    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    mul-double/2addr v3, v8

    .line 523
    double-to-int v3, v3

    .line 524
    invoke-virtual {v2, v3, v7}, Landroid/view/Window;->setLayout(II)V

    .line 525
    .line 526
    .line 527
    :cond_5
    invoke-virtual {v5}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 528
    .line 529
    .line 530
    move-result-object v2

    .line 531
    if-eqz v2, :cond_6

    .line 532
    .line 533
    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    .line 534
    .line 535
    const/4 v12, 0x0

    .line 536
    invoke-direct {v3, v12}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v2, v3}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 540
    .line 541
    .line 542
    :cond_6
    invoke-virtual {v5}, Landroid/app/Dialog;->show()V

    .line 543
    .line 544
    .line 545
    const/16 v9, 0x1c

    .line 546
    .line 547
    invoke-direct {v0, v1, v5, v9}, Lvf0;->z1(Landroid/content/Context;Landroid/app/Dialog;I)V

    .line 548
    .line 549
    .line 550
    return-void
.end method

.method public static synthetic X(Landroid/content/Context;IILandroid/widget/LinearLayout;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lvf0;->Z1(Landroid/content/Context;IILandroid/widget/LinearLayout;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final X0(Lhw;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Lhw;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final X1(Landroid/content/Context;IILandroid/widget/LinearLayout;)Lna1;
    .locals 8

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lvf0;->a:Lvf0;

    .line 5
    .line 6
    new-instance v7, Lgf0;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v7, p1, p0, p2, v1}, Lgf0;-><init>(ILandroid/content/Context;II)V

    .line 10
    .line 11
    .line 12
    const-string v2, "\u2b06"

    .line 13
    .line 14
    const-string v3, "\u4e3b\u9875\u56de\u5230\u9876\u90e8\u6309\u94ae"

    .line 15
    .line 16
    const-string v4, "\u5728\u522b\u4eba\u4e3b\u9875\u53ef\u4ee5\u4e00\u952e\u91cd\u7f6e\u56de\u5230\u9876\u90e8\uff0c\u5f00\u5173\u9700\u8981\u4e0b\u6b21\u8fdb\u5165\u7b14\u8bb0\u751f\u6548"

    .line 17
    .line 18
    move-object v1, p0

    .line 19
    move v5, p1

    .line 20
    move v6, p2

    .line 21
    invoke-direct/range {v0 .. v7}, Lvf0;->h1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILhw;)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p3, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lna1;->a:Lna1;

    .line 29
    .line 30
    return-object p0
.end method

.method private static final X2(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic Y(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->a3(Landroid/app/Dialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final Y0(Lhw;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Lhw;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final Y1(Landroid/content/Context;II)Lna1;
    .locals 1

    .line 1
    sget-object v0, Lvf0;->a:Lvf0;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lvf0;->p3(Landroid/content/Context;II)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lna1;->a:Lna1;

    .line 7
    .line 8
    return-object p0
.end method

.method private static final Y2(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic Z(Landroid/content/SharedPreferences;Z)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->T1(Landroid/content/SharedPreferences;Z)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final Z0(Landroid/content/Context;Landroid/widget/LinearLayout;I)V
    .locals 1

    .line 1
    new-instance p0, Landroid/view/View;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    invoke-direct {p1, v0, p3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private static final Z1(Landroid/content/Context;IILandroid/widget/LinearLayout;)Lna1;
    .locals 8

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lvf0;->a:Lvf0;

    .line 5
    .line 6
    new-instance v7, Lgf0;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-direct {v7, p1, p0, p2, v1}, Lgf0;-><init>(ILandroid/content/Context;II)V

    .line 10
    .line 11
    .line 12
    const-string v2, "\u2b06"

    .line 13
    .line 14
    const-string v3, "\u7b14\u8bb0\u9875\u56de\u5230\u9876\u90e8\u6309\u94ae"

    .line 15
    .line 16
    const-string v4, "\u5728\u7b14\u8bb0\u8be6\u60c5\u9875\u53ef\u4ee5\u4e00\u952e\u56de\u5230\u9876\u90e8\uff0c\u6ed1\u52a8\u8fdb\u4ed6\u4eba\u4e3b\u9875\u65f6\u81ea\u52a8\u9690\u85cf"

    .line 17
    .line 18
    move-object v1, p0

    .line 19
    move v5, p1

    .line 20
    move v6, p2

    .line 21
    invoke-direct/range {v0 .. v7}, Lvf0;->h1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILhw;)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p3, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lna1;->a:Lna1;

    .line 29
    .line 30
    return-object p0
.end method

.method private final Z2(Landroid/content/Context;)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-direct/range {p0 .. p1}, Lvf0;->f1(Landroid/content/Context;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/16 v2, 0x1c

    .line 8
    .line 9
    const/16 v3, 0x16

    .line 10
    .line 11
    const/16 v4, 0xff

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-static {v4, v3, v3, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/16 v5, 0xfc

    .line 21
    .line 22
    const/16 v6, 0xf8

    .line 23
    .line 24
    invoke-static {v4, v6, v6, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    :goto_0
    const/4 v6, -0x1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    move v7, v6

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-static {v4, v3, v3, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    :goto_1
    const/16 v8, 0x5a

    .line 38
    .line 39
    const/16 v9, 0xb4

    .line 40
    .line 41
    const/16 v10, 0x50

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    invoke-static {v9, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 46
    .line 47
    .line 48
    move-result v11

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    invoke-static {v9, v10, v10, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 51
    .line 52
    .line 53
    move-result v11

    .line 54
    :goto_2
    const/16 v12, 0x8c

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    invoke-static {v12, v10, v10, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    goto :goto_3

    .line 63
    :cond_3
    const/16 v8, 0xd2

    .line 64
    .line 65
    const/16 v13, 0xc8

    .line 66
    .line 67
    invoke-static {v12, v13, v13, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    :goto_3
    if-eqz v1, :cond_4

    .line 72
    .line 73
    move v1, v6

    .line 74
    goto :goto_4

    .line 75
    :cond_4
    const/16 v1, 0x3c

    .line 76
    .line 77
    const/16 v12, 0x32

    .line 78
    .line 79
    invoke-static {v4, v12, v12, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    :goto_4
    new-instance v4, Landroid/app/Dialog;

    .line 84
    .line 85
    const v12, 0x103000a

    .line 86
    .line 87
    .line 88
    invoke-direct {v4, v0, v12}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 89
    .line 90
    .line 91
    const/4 v12, 0x1

    .line 92
    invoke-virtual {v4, v12}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 93
    .line 94
    .line 95
    new-instance v13, Landroid/widget/LinearLayout;

    .line 96
    .line 97
    invoke-direct {v13, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v13, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v13, v5}, Landroid/view/View;->setBackgroundColor(I)V

    .line 104
    .line 105
    .line 106
    sget-object v5, Lvf0;->a:Lvf0;

    .line 107
    .line 108
    const/16 v12, 0x14

    .line 109
    .line 110
    invoke-direct {v5, v0, v12}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 111
    .line 112
    .line 113
    move-result v14

    .line 114
    invoke-direct {v5, v0, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    invoke-direct {v5, v0, v12}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 119
    .line 120
    .line 121
    move-result v15

    .line 122
    const/16 v9, 0x10

    .line 123
    .line 124
    invoke-direct {v5, v0, v9}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 125
    .line 126
    .line 127
    move-result v9

    .line 128
    invoke-virtual {v13, v14, v3, v15, v9}, Landroid/view/View;->setPadding(IIII)V

    .line 129
    .line 130
    .line 131
    new-instance v3, Landroid/widget/TextView;

    .line 132
    .line 133
    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 134
    .line 135
    .line 136
    const-string v9, "\u2716"

    .line 137
    .line 138
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 139
    .line 140
    .line 141
    const/high16 v9, 0x42100000    # 36.0f

    .line 142
    .line 143
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 144
    .line 145
    .line 146
    const/16 v9, 0x11

    .line 147
    .line 148
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setGravity(I)V

    .line 149
    .line 150
    .line 151
    const/16 v14, 0x8

    .line 152
    .line 153
    invoke-direct {v5, v0, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 154
    .line 155
    .line 156
    move-result v14

    .line 157
    const/4 v15, 0x0

    .line 158
    invoke-virtual {v3, v15, v15, v15, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v13, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 162
    .line 163
    .line 164
    new-instance v3, Landroid/widget/TextView;

    .line 165
    .line 166
    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 167
    .line 168
    .line 169
    const-string v14, "\u5feb\u6377\u91cd\u542f"

    .line 170
    .line 171
    invoke-virtual {v3, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 172
    .line 173
    .line 174
    const/high16 v14, 0x41900000    # 18.0f

    .line 175
    .line 176
    invoke-virtual {v3, v14}, Landroid/widget/TextView;->setTextSize(F)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setGravity(I)V

    .line 183
    .line 184
    .line 185
    const/16 v7, 0xc

    .line 186
    .line 187
    invoke-direct {v5, v0, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 188
    .line 189
    .line 190
    move-result v14

    .line 191
    invoke-virtual {v3, v15, v15, v15, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v13, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 195
    .line 196
    .line 197
    new-instance v3, Landroid/widget/TextView;

    .line 198
    .line 199
    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 200
    .line 201
    .line 202
    const-string v14, "\u786e\u5b9a\u8981\u7acb\u5373\u91cd\u542f\u5c0f\u7ea2\u4e66\u5417\uff1f\n\n\u8fd9\u5c06\u5f3a\u5236\u5173\u95ed\u5c0f\u7ea2\u4e66\u5e94\u7528\uff0c\u8bf7\u786e\u4fdd\u5f53\u524d\u6570\u636e\u5df2\u4fdd\u5b58\u3002"

    .line 203
    .line 204
    invoke-virtual {v3, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 205
    .line 206
    .line 207
    const/high16 v14, 0x41600000    # 14.0f

    .line 208
    .line 209
    invoke-virtual {v3, v14}, Landroid/widget/TextView;->setTextSize(F)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v3, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setGravity(I)V

    .line 216
    .line 217
    .line 218
    invoke-direct {v5, v0, v12}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 219
    .line 220
    .line 221
    move-result v11

    .line 222
    invoke-virtual {v3, v15, v15, v15, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v13, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 226
    .line 227
    .line 228
    new-instance v3, Landroid/widget/LinearLayout;

    .line 229
    .line 230
    invoke-direct {v3, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v3, v15}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 234
    .line 235
    .line 236
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    .line 237
    .line 238
    const/4 v12, -0x2

    .line 239
    invoke-direct {v11, v6, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v3, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 243
    .line 244
    .line 245
    new-instance v11, Landroid/widget/TextView;

    .line 246
    .line 247
    invoke-direct {v11, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 248
    .line 249
    .line 250
    const-string v10, "\u53d6\u6d88"

    .line 251
    .line 252
    invoke-virtual {v11, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v11, v14}, Landroid/widget/TextView;->setTextSize(F)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v11, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v11, v9}, Landroid/widget/TextView;->setGravity(I)V

    .line 262
    .line 263
    .line 264
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    .line 265
    .line 266
    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v1, v15}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 270
    .line 271
    .line 272
    invoke-direct {v5, v0, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 273
    .line 274
    .line 275
    move-result v10

    .line 276
    int-to-float v10, v10

    .line 277
    invoke-virtual {v1, v10}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1, v8}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v11, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 284
    .line 285
    .line 286
    invoke-direct {v5, v0, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 287
    .line 288
    .line 289
    move-result v1

    .line 290
    invoke-direct {v5, v0, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 291
    .line 292
    .line 293
    move-result v8

    .line 294
    invoke-virtual {v11, v15, v1, v15, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 295
    .line 296
    .line 297
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 298
    .line 299
    const/high16 v8, 0x3f800000    # 1.0f

    .line 300
    .line 301
    invoke-direct {v1, v15, v12, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 302
    .line 303
    .line 304
    const/4 v10, 0x6

    .line 305
    invoke-direct {v5, v0, v10}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 306
    .line 307
    .line 308
    move-result v8

    .line 309
    invoke-virtual {v1, v15, v15, v8, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v11, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 313
    .line 314
    .line 315
    new-instance v1, Luy;

    .line 316
    .line 317
    const/16 v8, 0xd

    .line 318
    .line 319
    invoke-direct {v1, v4, v8}, Luy;-><init>(Landroid/app/Dialog;I)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v11, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v3, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 326
    .line 327
    .line 328
    const-string v1, "\u786e\u5b9a"

    .line 329
    .line 330
    invoke-static {v0, v1, v14, v6, v9}, Lt1;->j(Landroid/content/Context;Ljava/lang/String;FII)Landroid/widget/TextView;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    invoke-static {v15}, Lt1;->h(I)Landroid/graphics/drawable/GradientDrawable;

    .line 335
    .line 336
    .line 337
    move-result-object v6

    .line 338
    invoke-direct {v5, v0, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 339
    .line 340
    .line 341
    move-result v8

    .line 342
    int-to-float v8, v8

    .line 343
    invoke-virtual {v6, v8}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 344
    .line 345
    .line 346
    const/16 v8, 0xdc

    .line 347
    .line 348
    const/16 v9, 0xb4

    .line 349
    .line 350
    const/16 v11, 0x50

    .line 351
    .line 352
    invoke-static {v8, v15, v9, v11}, Landroid/graphics/Color;->argb(IIII)I

    .line 353
    .line 354
    .line 355
    move-result v8

    .line 356
    invoke-virtual {v6, v8}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v1, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 360
    .line 361
    .line 362
    invoke-direct {v5, v0, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 363
    .line 364
    .line 365
    move-result v6

    .line 366
    invoke-direct {v5, v0, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 367
    .line 368
    .line 369
    move-result v7

    .line 370
    invoke-virtual {v1, v15, v6, v15, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 371
    .line 372
    .line 373
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 374
    .line 375
    const/high16 v7, 0x3f800000    # 1.0f

    .line 376
    .line 377
    invoke-direct {v6, v15, v12, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 378
    .line 379
    .line 380
    invoke-direct {v5, v0, v10}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 381
    .line 382
    .line 383
    move-result v5

    .line 384
    invoke-virtual {v6, v5, v15, v15, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v1, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 388
    .line 389
    .line 390
    new-instance v5, Luy;

    .line 391
    .line 392
    const/16 v6, 0xe

    .line 393
    .line 394
    invoke-direct {v5, v4, v6}, Luy;-><init>(Landroid/app/Dialog;I)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v1, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v13, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v4, v13}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v4}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    if-eqz v1, :cond_5

    .line 414
    .line 415
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 416
    .line 417
    .line 418
    move-result-object v3

    .line 419
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 420
    .line 421
    .line 422
    move-result-object v3

    .line 423
    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 424
    .line 425
    int-to-double v5, v3

    .line 426
    const-wide v7, 0x3fea3d70a3d70a3dL    # 0.82

    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    mul-double/2addr v5, v7

    .line 432
    double-to-int v3, v5

    .line 433
    invoke-virtual {v1, v3, v12}, Landroid/view/Window;->setLayout(II)V

    .line 434
    .line 435
    .line 436
    :cond_5
    invoke-virtual {v4}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    if-eqz v1, :cond_6

    .line 441
    .line 442
    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    .line 443
    .line 444
    invoke-direct {v3, v15}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v1, v3}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 448
    .line 449
    .line 450
    :cond_6
    invoke-virtual {v4}, Landroid/app/Dialog;->show()V

    .line 451
    .line 452
    .line 453
    move-object/from16 v1, p0

    .line 454
    .line 455
    invoke-direct {v1, v0, v4, v2}, Lvf0;->z1(Landroid/content/Context;Landroid/app/Dialog;I)V

    .line 456
    .line 457
    .line 458
    return-void
.end method

.method public static synthetic a(Landroid/content/Context;IILandroid/widget/LinearLayout;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lvf0;->L1(Landroid/content/Context;IILandroid/widget/LinearLayout;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic a0(Landroid/content/Context;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->M1(Landroid/content/Context;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final a1(Landroid/content/Context;Landroid/widget/TextView;Z)V
    .locals 3

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    const-string v0, "\u2611"

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string v0, "\u2610"

    .line 7
    .line 8
    :goto_0
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 13
    .line 14
    .line 15
    if-eqz p3, :cond_1

    .line 16
    .line 17
    const/16 p3, 0x2c

    .line 18
    .line 19
    const/16 v0, 0x55

    .line 20
    .line 21
    const/16 v1, 0xff

    .line 22
    .line 23
    const/16 v2, 0xfe

    .line 24
    .line 25
    invoke-static {v1, v2, p3, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const/16 p3, 0x82

    .line 31
    .line 32
    const/16 v0, 0x78

    .line 33
    .line 34
    invoke-static {v0, v0, v0, p3}, Landroid/graphics/Color;->argb(IIII)I

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    :goto_1
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 39
    .line 40
    .line 41
    const/16 p3, 0xc

    .line 42
    .line 43
    invoke-direct {p0, p1, p3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const/16 v1, 0x8

    .line 48
    .line 49
    invoke-direct {p0, p1, v1}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    invoke-direct {p0, p1, p3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 54
    .line 55
    .line 56
    move-result p3

    .line 57
    invoke-direct {p0, p1, v1}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    invoke-virtual {p2, v0, v2, p3, p0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method private static final a2(Landroid/content/Context;II)Lna1;
    .locals 1

    .line 1
    sget-object v0, Lvf0;->a:Lvf0;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lvf0;->T2(Landroid/content/Context;II)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lna1;->a:Lna1;

    .line 7
    .line 8
    return-object p0
.end method

.method private static final a3(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Landroid/content/Context;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0}, Lvf0;->J1(Landroid/content/Context;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b0(Landroid/content/Context;ZIIZLandroid/content/SharedPreferences;Landroid/widget/LinearLayout;)Lna1;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lvf0;->d2(Landroid/content/Context;ZIIZLandroid/content/SharedPreferences;Landroid/widget/LinearLayout;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final b1(Landroid/content/Context;I)Landroid/widget/SeekBar;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/16 v2, 0xe6

    .line 6
    .line 7
    const/16 v3, 0xff

    .line 8
    .line 9
    invoke-static {v3, v2, v2, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v4, 0x4

    .line 14
    invoke-direct {v0, v1, v4}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    const/16 v6, 0x8

    .line 19
    .line 20
    invoke-direct {v0, v1, v6}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v6, 0x0

    .line 25
    invoke-static {v6}, Lt1;->h(I)Landroid/graphics/drawable/GradientDrawable;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    int-to-float v5, v5

    .line 30
    const/high16 v8, 0x40000000    # 2.0f

    .line 31
    .line 32
    div-float/2addr v5, v8

    .line 33
    invoke-virtual {v7, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 34
    .line 35
    .line 36
    const/16 v8, 0x3c

    .line 37
    .line 38
    invoke-static {v8, v3, v3, v3}, Landroid/graphics/Color;->argb(IIII)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    invoke-virtual {v7, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 43
    .line 44
    .line 45
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    .line 46
    .line 47
    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v6}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 57
    .line 58
    .line 59
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    .line 60
    .line 61
    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 62
    .line 63
    .line 64
    const/4 v5, 0x1

    .line 65
    invoke-virtual {v2, v5}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 66
    .line 67
    .line 68
    const/4 v8, -0x1

    .line 69
    invoke-virtual {v2, v8}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 70
    .line 71
    .line 72
    const/4 v9, 0x2

    .line 73
    mul-int/2addr v0, v9

    .line 74
    invoke-virtual {v2, v0, v0}, Landroid/graphics/drawable/GradientDrawable;->setSize(II)V

    .line 75
    .line 76
    .line 77
    new-instance v10, Landroid/graphics/drawable/LayerDrawable;

    .line 78
    .line 79
    new-instance v0, Landroid/graphics/drawable/ClipDrawable;

    .line 80
    .line 81
    const v11, 0x800003

    .line 82
    .line 83
    .line 84
    invoke-direct {v0, v3, v11, v5}, Landroid/graphics/drawable/ClipDrawable;-><init>(Landroid/graphics/drawable/Drawable;II)V

    .line 85
    .line 86
    .line 87
    new-array v3, v9, [Landroid/graphics/drawable/Drawable;

    .line 88
    .line 89
    aput-object v7, v3, v6

    .line 90
    .line 91
    aput-object v0, v3, v5

    .line 92
    .line 93
    invoke-direct {v10, v3}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 94
    .line 95
    .line 96
    sget-object v0, Lvf0;->a:Lvf0;

    .line 97
    .line 98
    const/4 v3, 0x6

    .line 99
    invoke-direct {v0, v1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 100
    .line 101
    .line 102
    move-result v13

    .line 103
    const/4 v14, 0x0

    .line 104
    invoke-direct {v0, v1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 105
    .line 106
    .line 107
    move-result v15

    .line 108
    const/4 v11, 0x0

    .line 109
    const/4 v12, 0x0

    .line 110
    invoke-virtual/range {v10 .. v15}, Landroid/graphics/drawable/LayerDrawable;->setLayerInset(IIIII)V

    .line 111
    .line 112
    .line 113
    invoke-direct {v0, v1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 114
    .line 115
    .line 116
    move-result v13

    .line 117
    invoke-direct {v0, v1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 118
    .line 119
    .line 120
    move-result v15

    .line 121
    const/4 v11, 0x1

    .line 122
    invoke-virtual/range {v10 .. v15}, Landroid/graphics/drawable/LayerDrawable;->setLayerInset(IIIII)V

    .line 123
    .line 124
    .line 125
    const/high16 v3, 0x1020000

    .line 126
    .line 127
    invoke-virtual {v10, v6, v3}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    .line 128
    .line 129
    .line 130
    const v3, 0x102000d

    .line 131
    .line 132
    .line 133
    invoke-virtual {v10, v5, v3}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    .line 134
    .line 135
    .line 136
    new-instance v3, Landroid/widget/SeekBar;

    .line 137
    .line 138
    invoke-direct {v3, v1}, Landroid/widget/SeekBar;-><init>(Landroid/content/Context;)V

    .line 139
    .line 140
    .line 141
    const/16 v5, 0x46

    .line 142
    .line 143
    invoke-virtual {v3, v5}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 144
    .line 145
    .line 146
    add-int/lit8 v5, p2, -0x1e

    .line 147
    .line 148
    invoke-virtual {v3}, Landroid/widget/ProgressBar;->getMax()I

    .line 149
    .line 150
    .line 151
    move-result v7

    .line 152
    invoke-static {v5, v6, v7}, Lw60;->n(III)I

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    invoke-virtual {v3, v5}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 157
    .line 158
    .line 159
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 160
    .line 161
    const/4 v7, -0x2

    .line 162
    invoke-direct {v5, v8, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 163
    .line 164
    .line 165
    invoke-direct {v0, v1, v4}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    invoke-direct {v0, v1, v4}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    invoke-virtual {v5, v6, v7, v6, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v3, v10}, Landroid/widget/ProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v3, v6}, Landroid/widget/AbsSeekBar;->setThumbOffset(I)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v3, v2}, Landroid/widget/AbsSeekBar;->setThumb(Landroid/graphics/drawable/Drawable;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v3, v6}, Landroid/widget/AbsSeekBar;->setSplitTrack(Z)V

    .line 189
    .line 190
    .line 191
    invoke-direct {v0, v1, v9}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    invoke-direct {v0, v1, v9}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    invoke-virtual {v3, v2, v6, v0, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 200
    .line 201
    .line 202
    return-object v3
.end method

.method private static final b2(Landroid/content/Context;IIZLandroid/content/SharedPreferences;Landroid/widget/LinearLayout;)Lna1;
    .locals 12

    .line 1
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lvf0;->a:Lvf0;

    .line 5
    .line 6
    new-instance v9, Lye0;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    move-object/from16 v2, p4

    .line 10
    .line 11
    invoke-direct {v9, v2, v1}, Lye0;-><init>(Landroid/content/SharedPreferences;I)V

    .line 12
    .line 13
    .line 14
    const/16 v10, 0x80

    .line 15
    .line 16
    const/4 v11, 0x0

    .line 17
    const-string v2, "\ud83d\uded1"

    .line 18
    .line 19
    const-string v3, "\u9996\u9875\u5237\u65b0\u786e\u8ba4"

    .line 20
    .line 21
    const-string v4, "\u62e6\u622aTab\u70b9\u51fb\u3001\u8fd4\u56de\u624b\u52bf\u3001\u4e0b\u62c9\u5237\u65b0\uff0c\u5f39\u7a97\u4e8c\u6b21\u786e\u8ba4\uff0c\u4fee\u6539\u7acb\u5373\u751f\u6548"

    .line 22
    .line 23
    const/4 v8, 0x0

    .line 24
    move-object v1, p0

    .line 25
    move v5, p1

    .line 26
    move v6, p2

    .line 27
    move v7, p3

    .line 28
    invoke-static/range {v0 .. v11}, Lvf0;->m1(Lvf0;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZLsw;ILjava/lang/Object;)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    move-object/from16 p1, p5

    .line 33
    .line 34
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lna1;->a:Lna1;

    .line 38
    .line 39
    return-object p0
.end method

.method private static final b3(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    invoke-static {p0}, Landroid/os/Process;->killProcess(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static synthetic c(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lvf0;->D1(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic c0(Landroid/content/Context;IIZLandroid/content/SharedPreferences;Landroid/widget/LinearLayout;)Lna1;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lvf0;->f2(Landroid/content/Context;IIZLandroid/content/SharedPreferences;Landroid/widget/LinearLayout;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final c1(Landroid/content/Context;Ljava/lang/String;IZLsw;)Landroid/view/View;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "IZ",
            "Lsw;",
            ")",
            "Landroid/view/View;"
        }
    .end annotation

    .line 1
    new-instance p0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 8
    .line 9
    .line 10
    const/16 v1, 0x10

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 13
    .line 14
    .line 15
    sget-object v1, Lvf0;->a:Lvf0;

    .line 16
    .line 17
    const/4 v2, 0x4

    .line 18
    invoke-direct {v1, p1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-direct {v1, p1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    invoke-direct {v1, p1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-direct {v1, p1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-virtual {p0, v3, v4, v5, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 35
    .line 36
    .line 37
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 38
    .line 39
    const/4 v3, -0x1

    .line 40
    const/4 v4, -0x2

    .line 41
    invoke-direct {v2, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 42
    .line 43
    .line 44
    const/16 v3, 0xc

    .line 45
    .line 46
    invoke-direct {v1, p1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    invoke-virtual {v2, v0, v0, v0, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 54
    .line 55
    .line 56
    new-instance v2, Landroid/widget/TextView;

    .line 57
    .line 58
    invoke-direct {v2, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 62
    .line 63
    .line 64
    const/high16 p2, 0x41700000    # 15.0f

    .line 65
    .line 66
    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 70
    .line 71
    .line 72
    invoke-direct {v1, p1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    const/16 p3, 0xa

    .line 77
    .line 78
    invoke-direct {v1, p1, p3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    const/16 v5, 0x8

    .line 83
    .line 84
    invoke-direct {v1, p1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    invoke-direct {v1, p1, p3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 89
    .line 90
    .line 91
    move-result p3

    .line 92
    invoke-virtual {v2, p2, v3, v6, p3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 93
    .line 94
    .line 95
    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    .line 96
    .line 97
    const/high16 p3, 0x3f800000    # 1.0f

    .line 98
    .line 99
    invoke-direct {p2, v0, v4, p3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 106
    .line 107
    .line 108
    new-instance p2, Landroid/widget/TextView;

    .line 109
    .line 110
    invoke-direct {p2, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 111
    .line 112
    .line 113
    const/16 p3, 0xe

    .line 114
    .line 115
    invoke-direct {v1, p1, p3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    invoke-direct {v1, p1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    invoke-direct {v1, p1, p3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 124
    .line 125
    .line 126
    move-result p3

    .line 127
    invoke-direct {v1, p1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    invoke-virtual {p2, v2, v3, p3, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 132
    .line 133
    .line 134
    const/16 p3, 0x11

    .line 135
    .line 136
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setGravity(I)V

    .line 137
    .line 138
    .line 139
    const/high16 p3, 0x41500000    # 13.0f

    .line 140
    .line 141
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 142
    .line 143
    .line 144
    invoke-direct {v1, p1, p2, p4}, Lvf0;->G3(Landroid/content/Context;Landroid/widget/TextView;Z)V

    .line 145
    .line 146
    .line 147
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 148
    .line 149
    .line 150
    move-result-object p3

    .line 151
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    new-instance p3, Lif0;

    .line 155
    .line 156
    invoke-direct {p3, p1, p5, v0}, Lif0;-><init>(Landroid/content/Context;Lsw;I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 163
    .line 164
    .line 165
    return-object p0
.end method

.method private static final c2(Landroid/content/SharedPreferences;Z)Lna1;
    .locals 1

    .line 1
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lm00;->S:Lm00$a;

    .line 6
    .line 7
    invoke-virtual {v0}, Lm00$a;->H()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p0, v0, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lna1;->a:Lna1;

    .line 19
    .line 20
    return-object p0
.end method

.method private final c3(Landroid/content/Context;)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-direct/range {p0 .. p1}, Lvf0;->f1(Landroid/content/Context;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/16 v2, 0x1c

    .line 8
    .line 9
    const/16 v3, 0x16

    .line 10
    .line 11
    const/16 v4, 0xff

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-static {v4, v3, v3, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/16 v5, 0xfc

    .line 21
    .line 22
    const/16 v6, 0xf8

    .line 23
    .line 24
    invoke-static {v4, v6, v6, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    :goto_0
    const/4 v6, -0x1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    move v7, v6

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-static {v4, v3, v3, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    :goto_1
    const/16 v8, 0x5a

    .line 38
    .line 39
    const/16 v9, 0xb4

    .line 40
    .line 41
    const/16 v10, 0x50

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    invoke-static {v9, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 46
    .line 47
    .line 48
    move-result v11

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    invoke-static {v9, v10, v10, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 51
    .line 52
    .line 53
    move-result v11

    .line 54
    :goto_2
    const/16 v12, 0x8c

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    invoke-static {v12, v10, v10, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    goto :goto_3

    .line 63
    :cond_3
    const/16 v8, 0xd2

    .line 64
    .line 65
    const/16 v13, 0xc8

    .line 66
    .line 67
    invoke-static {v12, v13, v13, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    :goto_3
    if-eqz v1, :cond_4

    .line 72
    .line 73
    move v1, v6

    .line 74
    goto :goto_4

    .line 75
    :cond_4
    const/16 v1, 0x3c

    .line 76
    .line 77
    const/16 v12, 0x32

    .line 78
    .line 79
    invoke-static {v4, v12, v12, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    :goto_4
    new-instance v4, Landroid/app/Dialog;

    .line 84
    .line 85
    const v12, 0x103000a

    .line 86
    .line 87
    .line 88
    invoke-direct {v4, v0, v12}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 89
    .line 90
    .line 91
    const/4 v12, 0x1

    .line 92
    invoke-virtual {v4, v12}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 93
    .line 94
    .line 95
    new-instance v13, Landroid/widget/LinearLayout;

    .line 96
    .line 97
    invoke-direct {v13, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v13, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v13, v5}, Landroid/view/View;->setBackgroundColor(I)V

    .line 104
    .line 105
    .line 106
    sget-object v5, Lvf0;->a:Lvf0;

    .line 107
    .line 108
    const/16 v14, 0x14

    .line 109
    .line 110
    invoke-direct {v5, v0, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 111
    .line 112
    .line 113
    move-result v15

    .line 114
    invoke-direct {v5, v0, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    invoke-direct {v5, v0, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    const/16 v10, 0x10

    .line 123
    .line 124
    invoke-direct {v5, v0, v10}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 125
    .line 126
    .line 127
    move-result v10

    .line 128
    invoke-virtual {v13, v15, v3, v9, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 129
    .line 130
    .line 131
    new-instance v3, Landroid/widget/TextView;

    .line 132
    .line 133
    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 134
    .line 135
    .line 136
    const-string v9, "\u26a0\ufe0f"

    .line 137
    .line 138
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 139
    .line 140
    .line 141
    const/high16 v9, 0x42100000    # 36.0f

    .line 142
    .line 143
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 144
    .line 145
    .line 146
    const/16 v9, 0x11

    .line 147
    .line 148
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setGravity(I)V

    .line 149
    .line 150
    .line 151
    const/16 v10, 0x8

    .line 152
    .line 153
    invoke-direct {v5, v0, v10}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 154
    .line 155
    .line 156
    move-result v10

    .line 157
    const/4 v15, 0x0

    .line 158
    invoke-virtual {v3, v15, v15, v15, v10}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v13, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 162
    .line 163
    .line 164
    new-instance v3, Landroid/widget/TextView;

    .line 165
    .line 166
    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 167
    .line 168
    .line 169
    const-string v10, "\u91cd\u65b0\u9002\u914d"

    .line 170
    .line 171
    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 172
    .line 173
    .line 174
    const/high16 v10, 0x41900000    # 18.0f

    .line 175
    .line 176
    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setGravity(I)V

    .line 183
    .line 184
    .line 185
    const/16 v7, 0xc

    .line 186
    .line 187
    invoke-direct {v5, v0, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 188
    .line 189
    .line 190
    move-result v10

    .line 191
    invoke-virtual {v3, v15, v15, v15, v10}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v13, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 195
    .line 196
    .line 197
    new-instance v3, Landroid/widget/TextView;

    .line 198
    .line 199
    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 200
    .line 201
    .line 202
    const-string v10, "\u786e\u5b9a\u8981\u5220\u9664\u9002\u914d\u7f13\u5b58\u5e76\u91cd\u65b0\u626b\u63cf\u5417\uff1f\n\n\u5c0f\u7ea2\u4e66\u5c06\u88ab\u5173\u95ed\uff0c\u4e0b\u6b21\u6253\u5f00\u65f6\u4f1a\u91cd\u65b0\u67e5\u627eHook\u70b9\u3002"

    .line 203
    .line 204
    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 205
    .line 206
    .line 207
    const/high16 v10, 0x41600000    # 14.0f

    .line 208
    .line 209
    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v3, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setGravity(I)V

    .line 216
    .line 217
    .line 218
    invoke-direct {v5, v0, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 219
    .line 220
    .line 221
    move-result v11

    .line 222
    invoke-virtual {v3, v15, v15, v15, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v13, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 226
    .line 227
    .line 228
    new-instance v3, Landroid/widget/LinearLayout;

    .line 229
    .line 230
    invoke-direct {v3, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v3, v15}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 234
    .line 235
    .line 236
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    .line 237
    .line 238
    const/4 v14, -0x2

    .line 239
    invoke-direct {v11, v6, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v3, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 243
    .line 244
    .line 245
    new-instance v11, Landroid/widget/TextView;

    .line 246
    .line 247
    invoke-direct {v11, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 248
    .line 249
    .line 250
    const-string v6, "\u53d6\u6d88"

    .line 251
    .line 252
    invoke-virtual {v11, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v11, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v11, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v11, v9}, Landroid/widget/TextView;->setGravity(I)V

    .line 262
    .line 263
    .line 264
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    .line 265
    .line 266
    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v1, v15}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 270
    .line 271
    .line 272
    invoke-direct {v5, v0, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 273
    .line 274
    .line 275
    move-result v6

    .line 276
    int-to-float v6, v6

    .line 277
    invoke-virtual {v1, v6}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1, v8}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v11, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 284
    .line 285
    .line 286
    invoke-direct {v5, v0, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 287
    .line 288
    .line 289
    move-result v1

    .line 290
    invoke-direct {v5, v0, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 291
    .line 292
    .line 293
    move-result v6

    .line 294
    invoke-virtual {v11, v15, v1, v15, v6}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 295
    .line 296
    .line 297
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 298
    .line 299
    const/high16 v6, 0x3f800000    # 1.0f

    .line 300
    .line 301
    invoke-direct {v1, v15, v14, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 302
    .line 303
    .line 304
    const/4 v8, 0x6

    .line 305
    invoke-direct {v5, v0, v8}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 306
    .line 307
    .line 308
    move-result v6

    .line 309
    invoke-virtual {v1, v15, v15, v6, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v11, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 313
    .line 314
    .line 315
    new-instance v1, Luy;

    .line 316
    .line 317
    invoke-direct {v1, v4, v12}, Luy;-><init>(Landroid/app/Dialog;I)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v11, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v3, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 324
    .line 325
    .line 326
    const-string v1, "\u786e\u5b9a"

    .line 327
    .line 328
    const/4 v6, -0x1

    .line 329
    invoke-static {v0, v1, v10, v6, v9}, Lt1;->j(Landroid/content/Context;Ljava/lang/String;FII)Landroid/widget/TextView;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    invoke-static {v15}, Lt1;->h(I)Landroid/graphics/drawable/GradientDrawable;

    .line 334
    .line 335
    .line 336
    move-result-object v6

    .line 337
    invoke-direct {v5, v0, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 338
    .line 339
    .line 340
    move-result v9

    .line 341
    int-to-float v9, v9

    .line 342
    invoke-virtual {v6, v9}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 343
    .line 344
    .line 345
    const/16 v9, 0xdc

    .line 346
    .line 347
    const/16 v10, 0xb4

    .line 348
    .line 349
    const/16 v11, 0x50

    .line 350
    .line 351
    invoke-static {v9, v15, v10, v11}, Landroid/graphics/Color;->argb(IIII)I

    .line 352
    .line 353
    .line 354
    move-result v9

    .line 355
    invoke-virtual {v6, v9}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v1, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 359
    .line 360
    .line 361
    invoke-direct {v5, v0, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 362
    .line 363
    .line 364
    move-result v6

    .line 365
    invoke-direct {v5, v0, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 366
    .line 367
    .line 368
    move-result v7

    .line 369
    invoke-virtual {v1, v15, v6, v15, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 370
    .line 371
    .line 372
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 373
    .line 374
    const/high16 v7, 0x3f800000    # 1.0f

    .line 375
    .line 376
    invoke-direct {v6, v15, v14, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 377
    .line 378
    .line 379
    invoke-direct {v5, v0, v8}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 380
    .line 381
    .line 382
    move-result v5

    .line 383
    invoke-virtual {v6, v5, v15, v15, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v1, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 387
    .line 388
    .line 389
    new-instance v5, Luy;

    .line 390
    .line 391
    invoke-direct {v5, v4, v8}, Luy;-><init>(Landroid/app/Dialog;I)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v1, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v13, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v4, v13}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v4}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    if-eqz v1, :cond_5

    .line 411
    .line 412
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 413
    .line 414
    .line 415
    move-result-object v3

    .line 416
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 417
    .line 418
    .line 419
    move-result-object v3

    .line 420
    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 421
    .line 422
    int-to-double v5, v3

    .line 423
    const-wide v7, 0x3fea3d70a3d70a3dL    # 0.82

    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    mul-double/2addr v5, v7

    .line 429
    double-to-int v3, v5

    .line 430
    invoke-virtual {v1, v3, v14}, Landroid/view/Window;->setLayout(II)V

    .line 431
    .line 432
    .line 433
    :cond_5
    invoke-virtual {v4}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    if-eqz v1, :cond_6

    .line 438
    .line 439
    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    .line 440
    .line 441
    invoke-direct {v3, v15}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v1, v3}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 445
    .line 446
    .line 447
    :cond_6
    invoke-virtual {v4}, Landroid/app/Dialog;->show()V

    .line 448
    .line 449
    .line 450
    move-object/from16 v1, p0

    .line 451
    .line 452
    invoke-direct {v1, v0, v4, v2}, Lvf0;->z1(Landroid/content/Context;Landroid/app/Dialog;I)V

    .line 453
    .line 454
    .line 455
    return-void
.end method

.method public static synthetic d(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->m3(Landroid/app/Dialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d0(Landroid/app/Dialog;Landroid/content/Context;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->A2(Landroid/app/Dialog;Landroid/content/Context;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final d1(Landroid/content/Context;Lsw;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    check-cast v0, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    xor-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    sget-object v1, Lvf0;->a:Lvf0;

    .line 24
    .line 25
    check-cast p2, Landroid/widget/TextView;

    .line 26
    .line 27
    invoke-direct {v1, p0, p2, v0}, Lvf0;->G3(Landroid/content/Context;Landroid/widget/TextView;Z)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-interface {p1, p0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method private static final d2(Landroid/content/Context;ZIIZLandroid/content/SharedPreferences;Landroid/widget/LinearLayout;)Lna1;
    .locals 10

    .line 1
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lvf0;->a:Lvf0;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const-string v1, "\u2728"

    .line 9
    .line 10
    :goto_0
    move-object v2, v1

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    const-string v1, "\ud83d\udcac"

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :goto_1
    if-eqz p1, :cond_1

    .line 16
    .line 17
    const-string v1, "\u6d88\u606f\u9632\u64a4\u56de \u00b7 X\u5185\u6d4b\u4e13\u5c5e"

    .line 18
    .line 19
    :goto_2
    move-object v3, v1

    .line 20
    goto :goto_3

    .line 21
    :cond_1
    const-string v1, "\u6d88\u606f\u9632\u64a4\u56de"

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :goto_3
    if-eqz p1, :cond_2

    .line 25
    .line 26
    const-string v1, "\u62e6\u622a\u597d\u53cb\u79c1\u804a\u6d88\u606f\u64a4\u56de\uff0c\u88ab\u64a4\u56de\u6d88\u606f\u6c14\u6ce1\u53d8\u7ea2\uff0c\u9700\u91cd\u542f\u751f\u6548"

    .line 27
    .line 28
    :goto_4
    move-object v4, v1

    .line 29
    goto :goto_5

    .line 30
    :cond_2
    const-string v1, "\u4ec5\u9650\u5185\u6d4b\u7528\u6237 (X) \u53ef\u7528"

    .line 31
    .line 32
    goto :goto_4

    .line 33
    :goto_5
    new-instance v9, Lye0;

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    invoke-direct {v9, p5, v1}, Lye0;-><init>(Landroid/content/SharedPreferences;I)V

    .line 37
    .line 38
    .line 39
    move-object v1, p0

    .line 40
    move v8, p1

    .line 41
    move v5, p2

    .line 42
    move v6, p3

    .line 43
    move v7, p4

    .line 44
    invoke-direct/range {v0 .. v9}, Lvf0;->l1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZLsw;)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    move-object/from16 p1, p6

    .line 49
    .line 50
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 51
    .line 52
    .line 53
    sget-object p0, Lna1;->a:Lna1;

    .line 54
    .line 55
    return-object p0
.end method

.method private static final d3(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Landroid/content/Context;Lvt0;Landroid/content/SharedPreferences;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lvf0;->O2(Landroid/content/Context;Lvt0;Landroid/content/SharedPreferences;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e0(Landroid/content/Context;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0}, Lvf0;->G1(Landroid/content/Context;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final e1(Landroid/content/Context;I)I
    .locals 0

    .line 1
    int-to-float p0, p2

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 11
    .line 12
    mul-float/2addr p0, p1

    .line 13
    float-to-int p0, p0

    .line 14
    return p0
.end method

.method private static final e2(Landroid/content/SharedPreferences;Z)Lna1;
    .locals 1

    .line 1
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lm00;->S:Lm00$a;

    .line 6
    .line 7
    invoke-virtual {v0}, Lm00$a;->N()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p0, v0, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lna1;->a:Lna1;

    .line 19
    .line 20
    return-object p0
.end method

.method private static final e3(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    sget-object p0, Lhn;->a:Lhn;

    .line 5
    .line 6
    invoke-virtual {p0}, Lhn;->G()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    :catch_0
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-static {p0}, Landroid/os/Process;->killProcess(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static synthetic f(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->E3(Landroid/app/Dialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f0(Landroid/content/Context;Lsw;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lvf0;->d1(Landroid/content/Context;Lsw;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final f1(Landroid/content/Context;)Z
    .locals 0

    .line 1
    const-string p0, "uimode"

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Landroid/app/UiModeManager;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/app/UiModeManager;->getNightMode()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    const/4 p1, 0x2

    .line 17
    if-ne p0, p1, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method private static final f2(Landroid/content/Context;IIZLandroid/content/SharedPreferences;Landroid/widget/LinearLayout;)Lna1;
    .locals 12

    .line 1
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lvf0;->a:Lvf0;

    .line 5
    .line 6
    new-instance v9, Lye0;

    .line 7
    .line 8
    const/4 v1, 0x5

    .line 9
    move-object/from16 v2, p4

    .line 10
    .line 11
    invoke-direct {v9, v2, v1}, Lye0;-><init>(Landroid/content/SharedPreferences;I)V

    .line 12
    .line 13
    .line 14
    const/16 v10, 0x80

    .line 15
    .line 16
    const/4 v11, 0x0

    .line 17
    const-string v2, "\ud83d\udc46"

    .line 18
    .line 19
    const-string v3, "\u53cc\u51fb\u70b9\u8d5e\u62e6\u622a"

    .line 20
    .line 21
    const-string v4, "\u62e6\u622a\u7b14\u8bb0\u8be6\u60c5\u9875\u53cc\u51fb\u70b9\u8d5e\uff0c\u9632\u6b62\u8bef\u89e6\uff0c\u4fee\u6539\u7acb\u5373\u751f\u6548"

    .line 22
    .line 23
    const/4 v8, 0x0

    .line 24
    move-object v1, p0

    .line 25
    move v5, p1

    .line 26
    move v6, p2

    .line 27
    move v7, p3

    .line 28
    invoke-static/range {v0 .. v11}, Lvf0;->m1(Lvf0;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZLsw;ILjava/lang/Object;)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    move-object/from16 p1, p5

    .line 33
    .line 34
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lna1;->a:Lna1;

    .line 38
    .line 39
    return-object p0
.end method

.method private final f3(Landroid/content/Context;)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-direct/range {p0 .. p1}, Lvf0;->f1(Landroid/content/Context;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/16 v2, 0x1c

    .line 8
    .line 9
    const/16 v3, 0x16

    .line 10
    .line 11
    const/16 v4, 0xff

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-static {v4, v3, v3, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/16 v5, 0xfc

    .line 21
    .line 22
    const/16 v6, 0xf8

    .line 23
    .line 24
    invoke-static {v4, v6, v6, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    :goto_0
    const/4 v6, -0x1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    move v7, v6

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-static {v4, v3, v3, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    :goto_1
    const/16 v8, 0x5a

    .line 38
    .line 39
    const/16 v9, 0xb4

    .line 40
    .line 41
    const/16 v10, 0x50

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    invoke-static {v9, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    invoke-static {v9, v10, v10, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 51
    .line 52
    .line 53
    move-result v9

    .line 54
    :goto_2
    const/16 v11, 0x8c

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    invoke-static {v11, v10, v10, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    goto :goto_3

    .line 63
    :cond_3
    const/16 v8, 0xd2

    .line 64
    .line 65
    const/16 v12, 0xc8

    .line 66
    .line 67
    invoke-static {v11, v12, v12, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    :goto_3
    const/16 v11, 0x32

    .line 72
    .line 73
    if-eqz v1, :cond_4

    .line 74
    .line 75
    move v12, v6

    .line 76
    goto :goto_4

    .line 77
    :cond_4
    const/16 v12, 0x3c

    .line 78
    .line 79
    invoke-static {v4, v11, v11, v12}, Landroid/graphics/Color;->argb(IIII)I

    .line 80
    .line 81
    .line 82
    move-result v12

    .line 83
    :goto_4
    const/16 v13, 0xdc

    .line 84
    .line 85
    if-eqz v1, :cond_5

    .line 86
    .line 87
    invoke-static {v13, v4, v10, v10}, Landroid/graphics/Color;->argb(IIII)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    goto :goto_5

    .line 92
    :cond_5
    const-string v1, "#CC2222"

    .line 93
    .line 94
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    :goto_5
    new-instance v10, Landroid/app/Dialog;

    .line 99
    .line 100
    const v14, 0x103000a

    .line 101
    .line 102
    .line 103
    invoke-direct {v10, v0, v14}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 104
    .line 105
    .line 106
    const/4 v14, 0x1

    .line 107
    invoke-virtual {v10, v14}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 108
    .line 109
    .line 110
    new-instance v15, Landroid/widget/LinearLayout;

    .line 111
    .line 112
    invoke-direct {v15, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v15, v14}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v15, v5}, Landroid/view/View;->setBackgroundColor(I)V

    .line 119
    .line 120
    .line 121
    sget-object v5, Lvf0;->a:Lvf0;

    .line 122
    .line 123
    const/16 v14, 0x14

    .line 124
    .line 125
    invoke-direct {v5, v0, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 126
    .line 127
    .line 128
    move-result v11

    .line 129
    invoke-direct {v5, v0, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    invoke-direct {v5, v0, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 134
    .line 135
    .line 136
    move-result v13

    .line 137
    const/16 v4, 0x10

    .line 138
    .line 139
    invoke-direct {v5, v0, v4}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    invoke-virtual {v15, v11, v3, v13, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 144
    .line 145
    .line 146
    new-instance v3, Landroid/widget/TextView;

    .line 147
    .line 148
    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 149
    .line 150
    .line 151
    const-string v4, "\u26a0\ufe0f"

    .line 152
    .line 153
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 154
    .line 155
    .line 156
    const/high16 v4, 0x42100000    # 36.0f

    .line 157
    .line 158
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 159
    .line 160
    .line 161
    const/16 v4, 0x11

    .line 162
    .line 163
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 164
    .line 165
    .line 166
    const/16 v11, 0x8

    .line 167
    .line 168
    invoke-direct {v5, v0, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 169
    .line 170
    .line 171
    move-result v13

    .line 172
    const/4 v2, 0x0

    .line 173
    invoke-virtual {v3, v2, v2, v2, v13}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v15, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 177
    .line 178
    .line 179
    new-instance v3, Landroid/widget/TextView;

    .line 180
    .line 181
    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 182
    .line 183
    .line 184
    const-string v13, "\u91cd\u65b0\u9a8c\u8bc1\u6fc0\u6d3b"

    .line 185
    .line 186
    invoke-virtual {v3, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 187
    .line 188
    .line 189
    const/high16 v13, 0x41900000    # 18.0f

    .line 190
    .line 191
    invoke-virtual {v3, v13}, Landroid/widget/TextView;->setTextSize(F)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 198
    .line 199
    .line 200
    const/16 v7, 0xc

    .line 201
    .line 202
    invoke-direct {v5, v0, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 203
    .line 204
    .line 205
    move-result v13

    .line 206
    invoke-virtual {v3, v2, v2, v2, v13}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v15, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 210
    .line 211
    .line 212
    new-instance v3, Landroid/widget/TextView;

    .line 213
    .line 214
    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 215
    .line 216
    .line 217
    const-string v13, "\u786e\u5b9a\u8981\u91cd\u65b0\u8fdb\u884c\u6388\u6743\u9a8c\u8bc1\u5417\uff1f\n\n\u91cd\u65b0\u9a8c\u8bc1\u5c06\u6e05\u9664\u5f53\u524d\u7684\u6388\u6743\u72b6\u6001\uff0c\u9700\u8981\u91cd\u65b0\u8f93\u5165\u6388\u6743\u7801\u8fdb\u884c\u9a8c\u8bc1\u3002\n\n\u26a0\ufe0f \u8b66\u544a\uff1a\u5982\u679c\u9891\u7e41\u91cd\u65b0\u6fc0\u6d3b\u9a8c\u8bc1\uff0c\u5c06\u5bfc\u81f4\u5c01\u7981\u4f7f\u7528\u6a21\u5757\uff01"

    .line 218
    .line 219
    invoke-virtual {v3, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 220
    .line 221
    .line 222
    const/high16 v13, 0x41600000    # 14.0f

    .line 223
    .line 224
    invoke-virtual {v3, v13}, Landroid/widget/TextView;->setTextSize(F)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 231
    .line 232
    .line 233
    invoke-direct {v5, v0, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 234
    .line 235
    .line 236
    move-result v9

    .line 237
    invoke-virtual {v3, v2, v2, v2, v9}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v15, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 241
    .line 242
    .line 243
    new-instance v3, Landroid/widget/TextView;

    .line 244
    .line 245
    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 246
    .line 247
    .line 248
    const-string v9, "\u8bf7\u786e\u8ba4\u4f60\u786e\u5b9e\u9700\u8981\u91cd\u65b0\u9a8c\u8bc1\u540e\u518d\u64cd\u4f5c"

    .line 249
    .line 250
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 251
    .line 252
    .line 253
    const/high16 v9, 0x41400000    # 12.0f

    .line 254
    .line 255
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 262
    .line 263
    .line 264
    invoke-direct {v5, v0, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    invoke-virtual {v3, v2, v2, v2, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v15, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 272
    .line 273
    .line 274
    new-instance v1, Landroid/widget/LinearLayout;

    .line 275
    .line 276
    invoke-direct {v1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 280
    .line 281
    .line 282
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 283
    .line 284
    const/4 v9, -0x2

    .line 285
    invoke-direct {v3, v6, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 289
    .line 290
    .line 291
    new-instance v3, Landroid/widget/TextView;

    .line 292
    .line 293
    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 294
    .line 295
    .line 296
    const-string v6, "\u53d6\u6d88"

    .line 297
    .line 298
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v3, v13}, Landroid/widget/TextView;->setTextSize(F)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v3, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 308
    .line 309
    .line 310
    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    .line 311
    .line 312
    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v6, v2}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 316
    .line 317
    .line 318
    const/16 v11, 0x1c

    .line 319
    .line 320
    invoke-direct {v5, v0, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 321
    .line 322
    .line 323
    move-result v12

    .line 324
    int-to-float v11, v12

    .line 325
    invoke-virtual {v6, v11}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v6, v8}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v3, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 332
    .line 333
    .line 334
    invoke-direct {v5, v0, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 335
    .line 336
    .line 337
    move-result v6

    .line 338
    invoke-direct {v5, v0, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 339
    .line 340
    .line 341
    move-result v8

    .line 342
    invoke-virtual {v3, v2, v6, v2, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 343
    .line 344
    .line 345
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 346
    .line 347
    const/high16 v8, 0x3f800000    # 1.0f

    .line 348
    .line 349
    invoke-direct {v6, v2, v9, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 350
    .line 351
    .line 352
    const/4 v11, 0x6

    .line 353
    invoke-direct {v5, v0, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 354
    .line 355
    .line 356
    move-result v12

    .line 357
    invoke-virtual {v6, v2, v2, v12, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v3, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 361
    .line 362
    .line 363
    new-instance v6, Luy;

    .line 364
    .line 365
    const/16 v12, 0xa

    .line 366
    .line 367
    invoke-direct {v6, v10, v12}, Luy;-><init>(Landroid/app/Dialog;I)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v3, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 374
    .line 375
    .line 376
    new-instance v3, Landroid/widget/TextView;

    .line 377
    .line 378
    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 379
    .line 380
    .line 381
    const-string v6, "\u786e\u5b9a\uff085s\uff09"

    .line 382
    .line 383
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v3, v13}, Landroid/widget/TextView;->setTextSize(F)V

    .line 387
    .line 388
    .line 389
    const/16 v6, 0x78

    .line 390
    .line 391
    const/16 v12, 0xff

    .line 392
    .line 393
    invoke-static {v6, v12, v12, v12}, Landroid/graphics/Color;->argb(IIII)I

    .line 394
    .line 395
    .line 396
    move-result v6

    .line 397
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 404
    .line 405
    .line 406
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    .line 407
    .line 408
    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v4, v2}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 412
    .line 413
    .line 414
    const/16 v6, 0x1c

    .line 415
    .line 416
    invoke-direct {v5, v0, v6}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 417
    .line 418
    .line 419
    move-result v12

    .line 420
    int-to-float v6, v12

    .line 421
    invoke-virtual {v4, v6}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 422
    .line 423
    .line 424
    const/16 v6, 0x64

    .line 425
    .line 426
    const/16 v12, 0xdc

    .line 427
    .line 428
    const/16 v13, 0x32

    .line 429
    .line 430
    invoke-static {v6, v12, v13, v13}, Landroid/graphics/Color;->argb(IIII)I

    .line 431
    .line 432
    .line 433
    move-result v6

    .line 434
    invoke-virtual {v4, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v3, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 438
    .line 439
    .line 440
    invoke-direct {v5, v0, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 441
    .line 442
    .line 443
    move-result v4

    .line 444
    invoke-direct {v5, v0, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 445
    .line 446
    .line 447
    move-result v6

    .line 448
    invoke-virtual {v3, v2, v4, v2, v6}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 449
    .line 450
    .line 451
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 452
    .line 453
    invoke-direct {v4, v2, v9, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 454
    .line 455
    .line 456
    invoke-direct {v5, v0, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 457
    .line 458
    .line 459
    move-result v5

    .line 460
    invoke-virtual {v4, v5, v2, v2, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 464
    .line 465
    .line 466
    new-instance v4, Lhg;

    .line 467
    .line 468
    invoke-direct {v4, v10, v0}, Lhg;-><init>(Landroid/app/Dialog;Landroid/content/Context;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v15, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v10, v15}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v10}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    if-eqz v1, :cond_6

    .line 488
    .line 489
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 490
    .line 491
    .line 492
    move-result-object v4

    .line 493
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 494
    .line 495
    .line 496
    move-result-object v4

    .line 497
    iget v4, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 498
    .line 499
    int-to-double v4, v4

    .line 500
    const-wide v6, 0x3fea3d70a3d70a3dL    # 0.82

    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    mul-double/2addr v4, v6

    .line 506
    double-to-int v4, v4

    .line 507
    invoke-virtual {v1, v4, v9}, Landroid/view/Window;->setLayout(II)V

    .line 508
    .line 509
    .line 510
    :cond_6
    invoke-virtual {v10}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    if-eqz v1, :cond_7

    .line 515
    .line 516
    new-instance v4, Landroid/graphics/drawable/ColorDrawable;

    .line 517
    .line 518
    invoke-direct {v4, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v1, v4}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 522
    .line 523
    .line 524
    :cond_7
    invoke-virtual {v10}, Landroid/app/Dialog;->show()V

    .line 525
    .line 526
    .line 527
    const/16 v6, 0x1c

    .line 528
    .line 529
    move-object/from16 v1, p0

    .line 530
    .line 531
    invoke-direct {v1, v0, v10, v6}, Lvf0;->z1(Landroid/content/Context;Landroid/app/Dialog;I)V

    .line 532
    .line 533
    .line 534
    new-instance v1, Landroid/os/Handler;

    .line 535
    .line 536
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 537
    .line 538
    .line 539
    move-result-object v2

    .line 540
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 541
    .line 542
    .line 543
    new-instance v2, Lxt0;

    .line 544
    .line 545
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 546
    .line 547
    .line 548
    const/4 v4, 0x5

    .line 549
    iput v4, v2, Lxt0;->d:I

    .line 550
    .line 551
    new-instance v4, Lvf0$h;

    .line 552
    .line 553
    invoke-direct {v4, v2, v3, v1, v0}, Lvf0$h;-><init>(Lxt0;Landroid/widget/TextView;Landroid/os/Handler;Landroid/content/Context;)V

    .line 554
    .line 555
    .line 556
    const-wide/16 v2, 0x3e8

    .line 557
    .line 558
    invoke-virtual {v1, v4, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 559
    .line 560
    .line 561
    return-void
.end method

.method public static synthetic g(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->F3(Landroid/app/Dialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g0(Landroid/content/Context;Lvt0;Landroid/content/SharedPreferences;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lvf0;->w3(Landroid/content/Context;Lvt0;Landroid/content/SharedPreferences;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final g1(Landroid/content/Context;I)Landroid/view/View;
    .locals 5

    .line 1
    new-instance p0, Landroid/view/View;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 7
    .line 8
    sget-object v1, Lvf0;->a:Lvf0;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-direct {v1, p1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, -0x1

    .line 16
    invoke-direct {v0, v3, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 17
    .line 18
    .line 19
    const/16 v2, 0xc

    .line 20
    .line 21
    invoke-direct {v1, p1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const/4 v4, 0x0

    .line 26
    invoke-direct {v1, p1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-virtual {v0, v3, v4, p1, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 37
    .line 38
    .line 39
    return-object p0
.end method

.method private static final g2(Landroid/content/SharedPreferences;Z)Lna1;
    .locals 1

    .line 1
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lm00;->S:Lm00$a;

    .line 6
    .line 7
    invoke-virtual {v0}, Lm00$a;->k()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p0, v0, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lna1;->a:Lna1;

    .line 19
    .line 20
    return-object p0
.end method

.method private static final g3(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic h(Landroid/app/Dialog;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0}, Lvf0;->r3(Landroid/app/Dialog;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic h0(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->u3(Landroid/app/Dialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final h1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILhw;)Landroid/view/View;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Lhw;",
            ")",
            "Landroid/view/View;"
        }
    .end annotation

    .line 1
    move/from16 p0, p6

    .line 2
    .line 3
    new-instance v0, Landroid/widget/LinearLayout;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 10
    .line 11
    .line 12
    const/16 v2, 0x10

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 15
    .line 16
    .line 17
    sget-object v2, Lvf0;->a:Lvf0;

    .line 18
    .line 19
    const/4 v3, 0x4

    .line 20
    invoke-direct {v2, p1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    invoke-direct {v2, p1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    invoke-direct {v2, p1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    invoke-direct {v2, p1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    invoke-virtual {v0, v4, v5, v6, v7}, Landroid/view/View;->setPadding(IIII)V

    .line 37
    .line 38
    .line 39
    new-instance v4, Landroid/widget/TextView;

    .line 40
    .line 41
    invoke-direct {v4, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    const/high16 p2, 0x41a00000    # 20.0f

    .line 48
    .line 49
    invoke-virtual {v4, p2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 50
    .line 51
    .line 52
    const/16 p2, 0x11

    .line 53
    .line 54
    invoke-virtual {v4, p2}, Landroid/widget/TextView;->setGravity(I)V

    .line 55
    .line 56
    .line 57
    const/16 v5, 0x8

    .line 58
    .line 59
    invoke-direct {v2, p1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    invoke-direct {v2, p1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    invoke-direct {v2, p1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    invoke-direct {v2, p1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    invoke-virtual {v4, v6, v7, v8, v9}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 79
    .line 80
    .line 81
    new-instance v4, Landroid/widget/LinearLayout;

    .line 82
    .line 83
    invoke-direct {v4, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 84
    .line 85
    .line 86
    const/4 v6, 0x1

    .line 87
    invoke-virtual {v4, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 88
    .line 89
    .line 90
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 91
    .line 92
    const/4 v7, -0x2

    .line 93
    const/high16 v8, 0x3f800000    # 1.0f

    .line 94
    .line 95
    invoke-direct {v6, v1, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 99
    .line 100
    .line 101
    invoke-direct {v2, p1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    invoke-direct {v2, p1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    invoke-direct {v2, p1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    invoke-virtual {v4, v1, v6, v7, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 114
    .line 115
    .line 116
    new-instance v6, Landroid/widget/TextView;

    .line 117
    .line 118
    invoke-direct {v6, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v6, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 122
    .line 123
    .line 124
    const/high16 v7, 0x41600000    # 14.0f

    .line 125
    .line 126
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v6, p5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v4, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 133
    .line 134
    .line 135
    const/high16 v6, 0x41300000    # 11.0f

    .line 136
    .line 137
    invoke-static {p1, p4, v6, p0}, Lt1;->i(Landroid/content/Context;Ljava/lang/String;FI)Landroid/widget/TextView;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    const/4 v7, 0x2

    .line 142
    invoke-direct {v2, p1, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    invoke-virtual {v6, v1, v7, v1, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v4, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 153
    .line 154
    .line 155
    new-instance v1, Landroid/widget/TextView;

    .line 156
    .line 157
    invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 158
    .line 159
    .line 160
    const-string v4, "\u203a"

    .line 161
    .line 162
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 163
    .line 164
    .line 165
    const/high16 v4, 0x41b00000    # 22.0f

    .line 166
    .line 167
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setGravity(I)V

    .line 174
    .line 175
    .line 176
    invoke-direct {v2, p1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 177
    .line 178
    .line 179
    move-result p0

    .line 180
    invoke-direct {v2, p1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 181
    .line 182
    .line 183
    move-result p2

    .line 184
    invoke-direct {v2, p1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    invoke-direct {v2, p1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 189
    .line 190
    .line 191
    move-result p1

    .line 192
    invoke-virtual {v1, p0, p2, v4, p1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 196
    .line 197
    .line 198
    new-instance p0, Ld00;

    .line 199
    .line 200
    move-object/from16 p1, p7

    .line 201
    .line 202
    invoke-direct {p0, v3, p1}, Ld00;-><init>(ILhw;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 206
    .line 207
    .line 208
    return-object v0
.end method

.method private static final h2(Landroid/content/Context;Landroid/content/SharedPreferences;IIIILandroid/widget/LinearLayout;)Lna1;
    .locals 11

    .line 1
    move-object/from16 v10, p6

    .line 2
    .line 3
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Ln90;->a:Ln90;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ln90;->y(Landroid/content/Context;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v2, "X"

    .line 13
    .line 14
    invoke-static {v0, v2}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v8

    .line 18
    const/4 v0, 0x0

    .line 19
    if-eqz v8, :cond_0

    .line 20
    .line 21
    sget-object v2, Lm00;->S:Lm00$a;

    .line 22
    .line 23
    invoke-virtual {v2}, Lm00$a;->m()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-interface {p1, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    :cond_0
    move v7, v0

    .line 32
    sget-object v0, Lvf0;->a:Lvf0;

    .line 33
    .line 34
    if-eqz v8, :cond_1

    .line 35
    .line 36
    const-string v2, "\u2728"

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const-string v2, "\ud83d\udcc8"

    .line 40
    .line 41
    :goto_0
    if-eqz v8, :cond_2

    .line 42
    .line 43
    const-string v3, "\u7c89\u4e1d\u6570\u4f2a\u88c5 \u00b7 X\u5185\u6d4b\u4e13\u5c5e"

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    const-string v3, "\u7c89\u4e1d\u6570\u4f2a\u88c5"

    .line 47
    .line 48
    :goto_1
    if-eqz v8, :cond_3

    .line 49
    .line 50
    const-string v4, "\u663e\u793a\u81ea\u5b9a\u4e49\u7c89\u4e1d\u6570\uff0c\u4fee\u6539\u7acb\u5373\u751f\u6548"

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_3
    const-string v4, "\u4ec5\u9650\u5185\u6d4b\u7528\u6237 (X) \u53ef\u7528"

    .line 54
    .line 55
    :goto_2
    new-instance v9, Lye0;

    .line 56
    .line 57
    const/4 v5, 0x3

    .line 58
    invoke-direct {v9, p1, v5}, Lye0;-><init>(Landroid/content/SharedPreferences;I)V

    .line 59
    .line 60
    .line 61
    move-object v1, p0

    .line 62
    move v5, p2

    .line 63
    move v6, p3

    .line 64
    invoke-direct/range {v0 .. v9}, Lvf0;->l1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZLsw;)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    move-object v7, v0

    .line 69
    invoke-virtual {v10, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 70
    .line 71
    .line 72
    move v0, p4

    .line 73
    invoke-direct {v7, p0, p4}, Lvf0;->g1(Landroid/content/Context;I)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v10, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 78
    .line 79
    .line 80
    if-eqz v8, :cond_5

    .line 81
    .line 82
    sget-object v0, Lm00;->S:Lm00$a;

    .line 83
    .line 84
    invoke-virtual {v0}, Lm00$a;->n()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    const-string v2, "666"

    .line 89
    .line 90
    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    if-nez v0, :cond_4

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_4
    move-object v2, v0

    .line 98
    goto :goto_3

    .line 99
    :cond_5
    const-string v2, "--"

    .line 100
    .line 101
    :goto_3
    if-eqz v8, :cond_6

    .line 102
    .line 103
    const-string v0, "\u5f53\u524d: "

    .line 104
    .line 105
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    :goto_4
    move-object v9, v0

    .line 110
    goto :goto_5

    .line 111
    :cond_6
    const-string v0, "\u4ec5\u9650\u5185\u6d4b\u7528\u6237\u53ef\u7528"

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :goto_5
    new-instance v0, Lnf0;

    .line 115
    .line 116
    move-object v2, p0

    .line 117
    move-object v6, p1

    .line 118
    move v3, p2

    .line 119
    move v4, p3

    .line 120
    move/from16 v5, p5

    .line 121
    .line 122
    move v1, v8

    .line 123
    invoke-direct/range {v0 .. v6}, Lnf0;-><init>(ZLandroid/content/Context;IIILandroid/content/SharedPreferences;)V

    .line 124
    .line 125
    .line 126
    const-string v2, "\u270f"

    .line 127
    .line 128
    const-string v3, "\u8bbe\u7f6e\u7c89\u4e1d\u6570"

    .line 129
    .line 130
    move-object v1, v7

    .line 131
    move-object v7, v0

    .line 132
    move-object v0, v1

    .line 133
    move-object v1, p0

    .line 134
    move v5, p2

    .line 135
    move v6, p3

    .line 136
    move-object v4, v9

    .line 137
    invoke-direct/range {v0 .. v7}, Lvf0;->h1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILhw;)Landroid/view/View;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v10, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 142
    .line 143
    .line 144
    sget-object v0, Lna1;->a:Lna1;

    .line 145
    .line 146
    return-object v0
.end method

.method private static final h3(Landroid/app/Dialog;Landroid/content/Context;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    sget-object p0, Ln90;->a:Ln90;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ln90;->v(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    :catch_0
    new-instance p0, Landroid/os/Handler;

    .line 10
    .line 11
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 16
    .line 17
    .line 18
    new-instance p1, Lh3;

    .line 19
    .line 20
    const/4 p2, 0x2

    .line 21
    invoke-direct {p1, p2}, Lh3;-><init>(I)V

    .line 22
    .line 23
    .line 24
    const-wide/16 v0, 0x12c

    .line 25
    .line 26
    invoke-virtual {p0, p1, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static synthetic i(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->F2(Landroid/app/Dialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic i0(Landroid/content/Context;IIZLandroid/content/SharedPreferences;Landroid/widget/LinearLayout;)Lna1;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lvf0;->m2(Landroid/content/Context;IIZLandroid/content/SharedPreferences;Landroid/widget/LinearLayout;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final i1(Lhw;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Lhw;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final i2(Landroid/content/SharedPreferences;Z)Lna1;
    .locals 1

    .line 1
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lm00;->S:Lm00$a;

    .line 6
    .line 7
    invoke-virtual {v0}, Lm00$a;->m()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p0, v0, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lna1;->a:Lna1;

    .line 19
    .line 20
    return-object p0
.end method

.method private static final i3()V
    .locals 1

    .line 1
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic j(Landroid/content/Context;IIILandroid/content/SharedPreferences;Landroid/widget/TextView;Landroid/widget/LinearLayout;)Lna1;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lvf0;->R1(Landroid/content/Context;IIILandroid/content/SharedPreferences;Landroid/widget/TextView;Landroid/widget/LinearLayout;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic j0(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->z3(Landroid/app/Dialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final j1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILhw;)Landroid/view/View;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Lhw;",
            ")",
            "Landroid/view/View;"
        }
    .end annotation

    .line 1
    move/from16 p0, p6

    .line 2
    .line 3
    new-instance v0, Landroid/widget/LinearLayout;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 10
    .line 11
    .line 12
    const/16 v2, 0x10

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 15
    .line 16
    .line 17
    sget-object v2, Lvf0;->a:Lvf0;

    .line 18
    .line 19
    const/4 v3, 0x4

    .line 20
    invoke-direct {v2, p1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    invoke-direct {v2, p1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    invoke-direct {v2, p1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    invoke-direct {v2, p1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    invoke-virtual {v0, v4, v5, v6, v7}, Landroid/view/View;->setPadding(IIII)V

    .line 37
    .line 38
    .line 39
    new-instance v4, Landroid/widget/TextView;

    .line 40
    .line 41
    invoke-direct {v4, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    const/high16 p2, 0x41a00000    # 20.0f

    .line 48
    .line 49
    invoke-virtual {v4, p2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 50
    .line 51
    .line 52
    const/16 p2, 0x11

    .line 53
    .line 54
    invoke-virtual {v4, p2}, Landroid/widget/TextView;->setGravity(I)V

    .line 55
    .line 56
    .line 57
    const/16 v5, 0x8

    .line 58
    .line 59
    invoke-direct {v2, p1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    invoke-direct {v2, p1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    invoke-direct {v2, p1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    invoke-direct {v2, p1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    invoke-virtual {v4, v6, v7, v8, v9}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 79
    .line 80
    .line 81
    new-instance v4, Landroid/widget/LinearLayout;

    .line 82
    .line 83
    invoke-direct {v4, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 84
    .line 85
    .line 86
    const/4 v6, 0x1

    .line 87
    invoke-virtual {v4, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 88
    .line 89
    .line 90
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 91
    .line 92
    const/4 v8, -0x2

    .line 93
    const/high16 v9, 0x3f800000    # 1.0f

    .line 94
    .line 95
    invoke-direct {v7, v1, v8, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 99
    .line 100
    .line 101
    invoke-direct {v2, p1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    invoke-direct {v2, p1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    invoke-direct {v2, p1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 110
    .line 111
    .line 112
    move-result v9

    .line 113
    invoke-virtual {v4, v1, v7, v8, v9}, Landroid/view/View;->setPadding(IIII)V

    .line 114
    .line 115
    .line 116
    new-instance v7, Landroid/widget/TextView;

    .line 117
    .line 118
    invoke-direct {v7, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v7, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 122
    .line 123
    .line 124
    const/high16 v8, 0x41600000    # 14.0f

    .line 125
    .line 126
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v7, p5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v4, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 133
    .line 134
    .line 135
    const/high16 v7, 0x41300000    # 11.0f

    .line 136
    .line 137
    invoke-static {p1, p4, v7, p0}, Lt1;->i(Landroid/content/Context;Ljava/lang/String;FI)Landroid/widget/TextView;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    const/4 v8, 0x2

    .line 142
    invoke-direct {v2, p1, v8}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    invoke-virtual {v7, v1, v8, v1, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v4, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 153
    .line 154
    .line 155
    new-instance v1, Landroid/widget/TextView;

    .line 156
    .line 157
    invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 158
    .line 159
    .line 160
    const-string v4, "\u203a"

    .line 161
    .line 162
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 163
    .line 164
    .line 165
    const/high16 v4, 0x41b00000    # 22.0f

    .line 166
    .line 167
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setGravity(I)V

    .line 174
    .line 175
    .line 176
    invoke-direct {v2, p1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 177
    .line 178
    .line 179
    move-result p0

    .line 180
    invoke-direct {v2, p1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 181
    .line 182
    .line 183
    move-result p2

    .line 184
    invoke-direct {v2, p1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    invoke-direct {v2, p1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 189
    .line 190
    .line 191
    move-result p1

    .line 192
    invoke-virtual {v1, p0, p2, v3, p1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 196
    .line 197
    .line 198
    new-instance p0, Ld00;

    .line 199
    .line 200
    move-object/from16 p1, p7

    .line 201
    .line 202
    invoke-direct {p0, v6, p1}, Ld00;-><init>(ILhw;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 206
    .line 207
    .line 208
    return-object v0
.end method

.method private static final j2(ZLandroid/content/Context;IIILandroid/content/SharedPreferences;)Lna1;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lvf0;->a:Lvf0;

    .line 4
    .line 5
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-direct/range {p0 .. p5}, Lvf0;->E2(Landroid/content/Context;IIILandroid/content/SharedPreferences;)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string p0, "\u4ec5\u9650\u5185\u6d4b\u7528\u6237\u53ef\u7528"

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-static {p1, p0, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 20
    .line 21
    .line 22
    :goto_0
    sget-object p0, Lna1;->a:Lna1;

    .line 23
    .line 24
    return-object p0
.end method

.method private final j3(Landroid/content/Context;Landroid/widget/TextView;)V
    .locals 22

    .line 1
    move-object/from16 v3, p1

    .line 2
    .line 3
    const/16 v0, 0xe6

    .line 4
    .line 5
    const/16 v1, 0xff

    .line 6
    .line 7
    invoke-static {v1, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 8
    .line 9
    .line 10
    move-result v6

    .line 11
    invoke-direct/range {p0 .. p1}, Lvf0;->f1(Landroid/content/Context;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/16 v8, 0x1c

    .line 16
    .line 17
    const/16 v2, 0x16

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-static {v1, v2, v2, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/16 v4, 0xfc

    .line 27
    .line 28
    const/16 v5, 0xf8

    .line 29
    .line 30
    invoke-static {v1, v5, v5, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    :goto_0
    if-eqz v0, :cond_1

    .line 35
    .line 36
    const/4 v10, -0x1

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-static {v1, v2, v2, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    move v10, v5

    .line 43
    :goto_1
    const/16 v5, 0x5a

    .line 44
    .line 45
    const/16 v11, 0xb4

    .line 46
    .line 47
    const/16 v12, 0x50

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    invoke-static {v11, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    :goto_2
    move v13, v7

    .line 56
    goto :goto_3

    .line 57
    :cond_2
    invoke-static {v11, v12, v12, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    goto :goto_2

    .line 62
    :goto_3
    const/16 v7, 0x3c

    .line 63
    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    const/16 v14, 0x64

    .line 67
    .line 68
    const/16 v15, 0x46

    .line 69
    .line 70
    invoke-static {v14, v7, v7, v15}, Landroid/graphics/Color;->argb(IIII)I

    .line 71
    .line 72
    .line 73
    move-result v14

    .line 74
    goto :goto_4

    .line 75
    :cond_3
    const/16 v14, 0xbe

    .line 76
    .line 77
    invoke-static {v12, v11, v11, v14}, Landroid/graphics/Color;->argb(IIII)I

    .line 78
    .line 79
    .line 80
    move-result v14

    .line 81
    :goto_4
    const/16 v15, 0x8c

    .line 82
    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    invoke-static {v15, v12, v12, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    goto :goto_5

    .line 90
    :cond_4
    const/16 v5, 0xd2

    .line 91
    .line 92
    const/16 v11, 0xc8

    .line 93
    .line 94
    invoke-static {v15, v11, v11, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    :goto_5
    if-eqz v0, :cond_5

    .line 99
    .line 100
    const/4 v0, -0x1

    .line 101
    goto :goto_6

    .line 102
    :cond_5
    const/16 v0, 0x32

    .line 103
    .line 104
    invoke-static {v1, v0, v0, v7}, Landroid/graphics/Color;->argb(IIII)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    :goto_6
    sget-object v1, Lm00;->S:Lm00$a;

    .line 109
    .line 110
    invoke-virtual {v1}, Lm00$a;->Y()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    const/4 v11, 0x0

    .line 115
    invoke-virtual {v3, v7, v11}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    new-instance v15, Landroid/app/Dialog;

    .line 120
    .line 121
    const v12, 0x103000a

    .line 122
    .line 123
    .line 124
    invoke-direct {v15, v3, v12}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 125
    .line 126
    .line 127
    const/4 v12, 0x1

    .line 128
    invoke-virtual {v15, v12}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 129
    .line 130
    .line 131
    new-instance v8, Landroid/widget/LinearLayout;

    .line 132
    .line 133
    invoke-direct {v8, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v8, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v8, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 140
    .line 141
    .line 142
    sget-object v4, Lvf0;->a:Lvf0;

    .line 143
    .line 144
    const/16 v12, 0x14

    .line 145
    .line 146
    invoke-direct {v4, v3, v12}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 147
    .line 148
    .line 149
    move-result v9

    .line 150
    invoke-direct {v4, v3, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    invoke-direct {v4, v3, v12}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 155
    .line 156
    .line 157
    move-result v12

    .line 158
    const/16 v11, 0x10

    .line 159
    .line 160
    move/from16 v17, v0

    .line 161
    .line 162
    invoke-direct {v4, v3, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    invoke-virtual {v8, v9, v2, v12, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 167
    .line 168
    .line 169
    const-string v0, "\u4fdd\u5b58\u76ee\u5f55\u8bbe\u7f6e"

    .line 170
    .line 171
    const/high16 v2, 0x41900000    # 18.0f

    .line 172
    .line 173
    const/16 v9, 0x11

    .line 174
    .line 175
    invoke-static {v3, v0, v2, v10, v9}, Lt1;->j(Landroid/content/Context;Ljava/lang/String;FII)Landroid/widget/TextView;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    const/4 v2, 0x4

    .line 180
    invoke-direct {v4, v3, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 181
    .line 182
    .line 183
    move-result v12

    .line 184
    const/4 v2, 0x0

    .line 185
    invoke-virtual {v0, v2, v2, v2, v12}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v8, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 189
    .line 190
    .line 191
    new-instance v0, Landroid/widget/TextView;

    .line 192
    .line 193
    invoke-direct {v0, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 194
    .line 195
    .line 196
    const-string v2, "\u4ec5\u652f\u6301\u7cfb\u7edf\u516c\u5171\u76ee\u5f55\uff0c\u9009\u62e9\u540e\u53ef\u81ea\u5b9a\u4e49\u5b50\u76ee\u5f55\u540d"

    .line 197
    .line 198
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 199
    .line 200
    .line 201
    const/high16 v2, 0x41400000    # 12.0f

    .line 202
    .line 203
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0, v13}, Landroid/widget/TextView;->setTextColor(I)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setGravity(I)V

    .line 210
    .line 211
    .line 212
    const/16 v12, 0xc

    .line 213
    .line 214
    invoke-direct {v4, v3, v12}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    const/4 v4, 0x0

    .line 219
    invoke-virtual {v0, v4, v4, v4, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v8, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v1, v3}, Lm00$a;->c0(Landroid/content/Context;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-virtual {v1}, Lm00$a;->Z()Ljava/util/List;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    const/4 v2, 0x0

    .line 238
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 239
    .line 240
    .line 241
    move-result v4

    .line 242
    if-eqz v4, :cond_7

    .line 243
    .line 244
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    check-cast v4, Luo0;

    .line 249
    .line 250
    iget-object v4, v4, Luo0;->d:Ljava/lang/Object;

    .line 251
    .line 252
    invoke-static {v4, v0}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v4

    .line 256
    if-eqz v4, :cond_6

    .line 257
    .line 258
    goto :goto_8

    .line 259
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 260
    .line 261
    goto :goto_7

    .line 262
    :cond_7
    const/4 v2, -0x1

    .line 263
    :goto_8
    new-instance v0, Landroid/widget/LinearLayout;

    .line 264
    .line 265
    invoke-direct {v0, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 266
    .line 267
    .line 268
    const/4 v4, 0x0

    .line 269
    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 270
    .line 271
    .line 272
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 273
    .line 274
    const/4 v11, -0x2

    .line 275
    const/4 v9, -0x1

    .line 276
    invoke-direct {v1, v9, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 277
    .line 278
    .line 279
    sget-object v9, Lvf0;->a:Lvf0;

    .line 280
    .line 281
    invoke-direct {v9, v3, v12}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 282
    .line 283
    .line 284
    move-result v9

    .line 285
    invoke-virtual {v1, v4, v4, v4, v9}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 289
    .line 290
    .line 291
    sget-object v1, Lm00;->S:Lm00$a;

    .line 292
    .line 293
    invoke-virtual {v1}, Lm00$a;->Z()Ljava/util/List;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    invoke-static {v1}, Lo30;->q(Ljava/util/Collection;)Lz20;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    new-instance v4, Ljava/util/ArrayList;

    .line 302
    .line 303
    invoke-static {v1}, Lze;->E(Ljava/lang/Iterable;)I

    .line 304
    .line 305
    .line 306
    move-result v9

    .line 307
    invoke-direct {v4, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v1}, Lx20;->iterator()Ljava/util/Iterator;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    :goto_9
    move-object v9, v1

    .line 315
    check-cast v9, Ly20;

    .line 316
    .line 317
    iget-boolean v12, v9, Ly20;->f:Z

    .line 318
    .line 319
    if-eqz v12, :cond_d

    .line 320
    .line 321
    invoke-virtual {v9}, Ly20;->nextInt()I

    .line 322
    .line 323
    .line 324
    move-result v9

    .line 325
    sget-object v12, Lm00;->S:Lm00$a;

    .line 326
    .line 327
    invoke-virtual {v12}, Lm00$a;->Z()Ljava/util/List;

    .line 328
    .line 329
    .line 330
    move-result-object v12

    .line 331
    invoke-interface {v12, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v12

    .line 335
    check-cast v12, Luo0;

    .line 336
    .line 337
    iget-object v12, v12, Luo0;->e:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast v12, Ljava/lang/String;

    .line 340
    .line 341
    if-gez v2, :cond_8

    .line 342
    .line 343
    const/4 v11, 0x0

    .line 344
    goto :goto_a

    .line 345
    :cond_8
    move v11, v2

    .line 346
    :goto_a
    if-ne v9, v11, :cond_9

    .line 347
    .line 348
    const/4 v11, 0x1

    .line 349
    :goto_b
    move-object/from16 v19, v1

    .line 350
    .line 351
    goto :goto_c

    .line 352
    :cond_9
    const/4 v11, 0x0

    .line 353
    goto :goto_b

    .line 354
    :goto_c
    new-instance v1, Landroid/widget/TextView;

    .line 355
    .line 356
    invoke-direct {v1, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v1, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 360
    .line 361
    .line 362
    const/high16 v12, 0x41500000    # 13.0f

    .line 363
    .line 364
    invoke-virtual {v1, v12}, Landroid/widget/TextView;->setTextSize(F)V

    .line 365
    .line 366
    .line 367
    if-eqz v11, :cond_a

    .line 368
    .line 369
    const/4 v12, -0x1

    .line 370
    goto :goto_d

    .line 371
    :cond_a
    move/from16 v12, v17

    .line 372
    .line 373
    :goto_d
    invoke-virtual {v1, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 374
    .line 375
    .line 376
    const/16 v12, 0x11

    .line 377
    .line 378
    invoke-virtual {v1, v12}, Landroid/widget/TextView;->setGravity(I)V

    .line 379
    .line 380
    .line 381
    new-instance v12, Landroid/graphics/drawable/GradientDrawable;

    .line 382
    .line 383
    invoke-direct {v12}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 384
    .line 385
    .line 386
    move/from16 v20, v2

    .line 387
    .line 388
    const/4 v2, 0x0

    .line 389
    invoke-virtual {v12, v2}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 390
    .line 391
    .line 392
    sget-object v2, Lvf0;->a:Lvf0;

    .line 393
    .line 394
    move/from16 v21, v5

    .line 395
    .line 396
    move/from16 v18, v6

    .line 397
    .line 398
    const/16 v5, 0x10

    .line 399
    .line 400
    invoke-direct {v2, v3, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 401
    .line 402
    .line 403
    move-result v6

    .line 404
    int-to-float v6, v6

    .line 405
    invoke-virtual {v12, v6}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 406
    .line 407
    .line 408
    if-eqz v11, :cond_b

    .line 409
    .line 410
    move/from16 v6, v18

    .line 411
    .line 412
    goto :goto_e

    .line 413
    :cond_b
    move/from16 v6, v21

    .line 414
    .line 415
    :goto_e
    invoke-virtual {v12, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v1, v12}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 419
    .line 420
    .line 421
    const/16 v6, 0xa

    .line 422
    .line 423
    invoke-direct {v2, v3, v6}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 424
    .line 425
    .line 426
    move-result v11

    .line 427
    const/16 v12, 0x8

    .line 428
    .line 429
    invoke-direct {v2, v3, v12}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 430
    .line 431
    .line 432
    move-result v5

    .line 433
    invoke-direct {v2, v3, v6}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 434
    .line 435
    .line 436
    move-result v6

    .line 437
    invoke-direct {v2, v3, v12}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 438
    .line 439
    .line 440
    move-result v12

    .line 441
    invoke-virtual {v1, v11, v5, v6, v12}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 442
    .line 443
    .line 444
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 445
    .line 446
    const/4 v6, 0x0

    .line 447
    const/high16 v11, 0x3f800000    # 1.0f

    .line 448
    .line 449
    const/4 v12, -0x2

    .line 450
    invoke-direct {v5, v6, v12, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 451
    .line 452
    .line 453
    if-lez v9, :cond_c

    .line 454
    .line 455
    const/4 v9, 0x4

    .line 456
    invoke-direct {v2, v3, v9}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 457
    .line 458
    .line 459
    move-result v16

    .line 460
    move/from16 v2, v16

    .line 461
    .line 462
    goto :goto_f

    .line 463
    :cond_c
    const/4 v9, 0x4

    .line 464
    move v2, v6

    .line 465
    :goto_f
    invoke-virtual {v5, v2, v6, v6, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v1, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    move/from16 v6, v18

    .line 475
    .line 476
    move-object/from16 v1, v19

    .line 477
    .line 478
    move/from16 v2, v20

    .line 479
    .line 480
    move/from16 v5, v21

    .line 481
    .line 482
    const/4 v11, -0x2

    .line 483
    const/16 v12, 0xc

    .line 484
    .line 485
    goto/16 :goto_9

    .line 486
    .line 487
    :cond_d
    move/from16 v21, v5

    .line 488
    .line 489
    move/from16 v18, v6

    .line 490
    .line 491
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 492
    .line 493
    .line 494
    move-result-object v1

    .line 495
    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 496
    .line 497
    .line 498
    move-result v2

    .line 499
    if-eqz v2, :cond_e

    .line 500
    .line 501
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v2

    .line 505
    check-cast v2, Landroid/widget/TextView;

    .line 506
    .line 507
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 508
    .line 509
    .line 510
    goto :goto_10

    .line 511
    :cond_e
    invoke-virtual {v8, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 515
    .line 516
    .line 517
    move-result-object v9

    .line 518
    const/4 v2, 0x0

    .line 519
    :goto_11
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 520
    .line 521
    .line 522
    move-result v0

    .line 523
    if-eqz v0, :cond_10

    .line 524
    .line 525
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    add-int/lit8 v11, v2, 0x1

    .line 530
    .line 531
    if-ltz v2, :cond_f

    .line 532
    .line 533
    move-object v12, v0

    .line 534
    check-cast v12, Landroid/widget/TextView;

    .line 535
    .line 536
    new-instance v0, Lsf0;

    .line 537
    .line 538
    move-object v1, v7

    .line 539
    move/from16 v5, v17

    .line 540
    .line 541
    move/from16 v6, v18

    .line 542
    .line 543
    move/from16 v7, v21

    .line 544
    .line 545
    invoke-direct/range {v0 .. v7}, Lsf0;-><init>(Landroid/content/SharedPreferences;ILandroid/content/Context;Ljava/util/ArrayList;III)V

    .line 546
    .line 547
    .line 548
    invoke-virtual {v12, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 549
    .line 550
    .line 551
    move v2, v11

    .line 552
    move-object v7, v1

    .line 553
    goto :goto_11

    .line 554
    :cond_f
    invoke-static {}, Lo30;->A()V

    .line 555
    .line 556
    .line 557
    const/4 v0, 0x0

    .line 558
    throw v0

    .line 559
    :cond_10
    move-object v1, v7

    .line 560
    move/from16 v5, v17

    .line 561
    .line 562
    move/from16 v7, v21

    .line 563
    .line 564
    const-string v0, "\u81ea\u5b9a\u4e49\u5b50\u76ee\u5f55\u540d"

    .line 565
    .line 566
    const/high16 v12, 0x41500000    # 13.0f

    .line 567
    .line 568
    invoke-static {v3, v0, v12, v10}, Lt1;->i(Landroid/content/Context;Ljava/lang/String;FI)Landroid/widget/TextView;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    sget-object v2, Lvf0;->a:Lvf0;

    .line 573
    .line 574
    const/4 v4, 0x6

    .line 575
    invoke-direct {v2, v3, v4}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 576
    .line 577
    .line 578
    move-result v6

    .line 579
    const/4 v9, 0x0

    .line 580
    invoke-virtual {v0, v9, v9, v9, v6}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 581
    .line 582
    .line 583
    invoke-virtual {v8, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 584
    .line 585
    .line 586
    sget-object v0, Lm00;->S:Lm00$a;

    .line 587
    .line 588
    invoke-virtual {v0, v3}, Lm00$a;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    move-object v6, v1

    .line 593
    new-instance v1, Landroid/widget/EditText;

    .line 594
    .line 595
    invoke-direct {v1, v3}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 596
    .line 597
    .line 598
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 599
    .line 600
    .line 601
    invoke-virtual {v1, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 602
    .line 603
    .line 604
    invoke-virtual {v1, v13}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 605
    .line 606
    .line 607
    const-string v0, "\u4f8b\u5982\uff1a\u7ea2\u85af\u4ed3"

    .line 608
    .line 609
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 610
    .line 611
    .line 612
    const/high16 v0, 0x41600000    # 14.0f

    .line 613
    .line 614
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 615
    .line 616
    .line 617
    new-instance v9, Landroid/graphics/drawable/GradientDrawable;

    .line 618
    .line 619
    invoke-direct {v9}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 620
    .line 621
    .line 622
    const/4 v10, 0x0

    .line 623
    invoke-virtual {v9, v10}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 624
    .line 625
    .line 626
    const/16 v10, 0xa

    .line 627
    .line 628
    invoke-direct {v2, v3, v10}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 629
    .line 630
    .line 631
    move-result v10

    .line 632
    int-to-float v10, v10

    .line 633
    invoke-virtual {v9, v10}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 634
    .line 635
    .line 636
    invoke-virtual {v9, v14}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 637
    .line 638
    .line 639
    invoke-virtual {v1, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 640
    .line 641
    .line 642
    const/16 v9, 0xe

    .line 643
    .line 644
    invoke-direct {v2, v3, v9}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 645
    .line 646
    .line 647
    move-result v10

    .line 648
    const/16 v11, 0xc

    .line 649
    .line 650
    invoke-direct {v2, v3, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 651
    .line 652
    .line 653
    move-result v12

    .line 654
    invoke-direct {v2, v3, v9}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 655
    .line 656
    .line 657
    move-result v13

    .line 658
    invoke-direct {v2, v3, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 659
    .line 660
    .line 661
    move-result v14

    .line 662
    invoke-virtual {v1, v10, v12, v13, v14}, Landroid/view/View;->setPadding(IIII)V

    .line 663
    .line 664
    .line 665
    const/4 v10, 0x1

    .line 666
    invoke-virtual {v1, v10}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 667
    .line 668
    .line 669
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 670
    .line 671
    const/4 v11, -0x1

    .line 672
    const/4 v12, -0x2

    .line 673
    invoke-direct {v10, v11, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 674
    .line 675
    .line 676
    invoke-direct {v2, v3, v9}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 677
    .line 678
    .line 679
    move-result v9

    .line 680
    const/4 v13, 0x0

    .line 681
    invoke-virtual {v10, v13, v13, v13, v9}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 682
    .line 683
    .line 684
    invoke-virtual {v1, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 685
    .line 686
    .line 687
    invoke-virtual {v8, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 688
    .line 689
    .line 690
    new-instance v9, Landroid/widget/LinearLayout;

    .line 691
    .line 692
    invoke-direct {v9, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 693
    .line 694
    .line 695
    invoke-virtual {v9, v13}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 696
    .line 697
    .line 698
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 699
    .line 700
    invoke-direct {v10, v11, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 701
    .line 702
    .line 703
    invoke-virtual {v9, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 704
    .line 705
    .line 706
    new-instance v10, Landroid/widget/TextView;

    .line 707
    .line 708
    invoke-direct {v10, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 709
    .line 710
    .line 711
    const-string v11, "\u53d6\u6d88"

    .line 712
    .line 713
    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 714
    .line 715
    .line 716
    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 717
    .line 718
    .line 719
    invoke-virtual {v10, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 720
    .line 721
    .line 722
    const/16 v12, 0x11

    .line 723
    .line 724
    invoke-virtual {v10, v12}, Landroid/widget/TextView;->setGravity(I)V

    .line 725
    .line 726
    .line 727
    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    .line 728
    .line 729
    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 730
    .line 731
    .line 732
    const/4 v13, 0x0

    .line 733
    invoke-virtual {v5, v13}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 734
    .line 735
    .line 736
    const/16 v11, 0x1c

    .line 737
    .line 738
    invoke-direct {v2, v3, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 739
    .line 740
    .line 741
    move-result v12

    .line 742
    int-to-float v11, v12

    .line 743
    invoke-virtual {v5, v11}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 744
    .line 745
    .line 746
    invoke-virtual {v5, v7}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 747
    .line 748
    .line 749
    invoke-virtual {v10, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 750
    .line 751
    .line 752
    const/16 v11, 0xc

    .line 753
    .line 754
    invoke-direct {v2, v3, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 755
    .line 756
    .line 757
    move-result v5

    .line 758
    invoke-direct {v2, v3, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 759
    .line 760
    .line 761
    move-result v7

    .line 762
    invoke-virtual {v10, v13, v5, v13, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 763
    .line 764
    .line 765
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 766
    .line 767
    const/high16 v11, 0x3f800000    # 1.0f

    .line 768
    .line 769
    const/4 v12, -0x2

    .line 770
    invoke-direct {v5, v13, v12, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 771
    .line 772
    .line 773
    invoke-direct {v2, v3, v4}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 774
    .line 775
    .line 776
    move-result v7

    .line 777
    invoke-virtual {v5, v13, v13, v7, v13}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 778
    .line 779
    .line 780
    invoke-virtual {v10, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 781
    .line 782
    .line 783
    new-instance v5, Luy;

    .line 784
    .line 785
    const/16 v7, 0x13

    .line 786
    .line 787
    invoke-direct {v5, v15, v7}, Luy;-><init>(Landroid/app/Dialog;I)V

    .line 788
    .line 789
    .line 790
    invoke-virtual {v10, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 791
    .line 792
    .line 793
    invoke-virtual {v9, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 794
    .line 795
    .line 796
    const-string v5, "\u4fdd\u5b58"

    .line 797
    .line 798
    const/4 v11, -0x1

    .line 799
    const/16 v12, 0x11

    .line 800
    .line 801
    invoke-static {v3, v5, v0, v11, v12}, Lt1;->j(Landroid/content/Context;Ljava/lang/String;FII)Landroid/widget/TextView;

    .line 802
    .line 803
    .line 804
    move-result-object v7

    .line 805
    invoke-static {v13}, Lt1;->h(I)Landroid/graphics/drawable/GradientDrawable;

    .line 806
    .line 807
    .line 808
    move-result-object v0

    .line 809
    const/16 v11, 0x1c

    .line 810
    .line 811
    invoke-direct {v2, v3, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 812
    .line 813
    .line 814
    move-result v5

    .line 815
    int-to-float v5, v5

    .line 816
    invoke-virtual {v0, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 817
    .line 818
    .line 819
    const/16 v5, 0xdc

    .line 820
    .line 821
    const/16 v10, 0xb4

    .line 822
    .line 823
    const/16 v11, 0x50

    .line 824
    .line 825
    invoke-static {v5, v13, v10, v11}, Landroid/graphics/Color;->argb(IIII)I

    .line 826
    .line 827
    .line 828
    move-result v5

    .line 829
    invoke-virtual {v0, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 830
    .line 831
    .line 832
    invoke-virtual {v7, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 833
    .line 834
    .line 835
    const/16 v11, 0xc

    .line 836
    .line 837
    invoke-direct {v2, v3, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 838
    .line 839
    .line 840
    move-result v0

    .line 841
    invoke-direct {v2, v3, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 842
    .line 843
    .line 844
    move-result v5

    .line 845
    invoke-virtual {v7, v13, v0, v13, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 846
    .line 847
    .line 848
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 849
    .line 850
    const/high16 v11, 0x3f800000    # 1.0f

    .line 851
    .line 852
    const/4 v12, -0x2

    .line 853
    invoke-direct {v0, v13, v12, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 854
    .line 855
    .line 856
    invoke-direct {v2, v3, v4}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 857
    .line 858
    .line 859
    move-result v2

    .line 860
    invoke-virtual {v0, v2, v13, v13, v13}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 861
    .line 862
    .line 863
    invoke-virtual {v7, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 864
    .line 865
    .line 866
    new-instance v0, Ltf0;

    .line 867
    .line 868
    move-object v4, v3

    .line 869
    move-object v2, v6

    .line 870
    move-object v5, v15

    .line 871
    move-object/from16 v3, p2

    .line 872
    .line 873
    invoke-direct/range {v0 .. v5}, Ltf0;-><init>(Landroid/widget/EditText;Landroid/content/SharedPreferences;Landroid/widget/TextView;Landroid/content/Context;Landroid/app/Dialog;)V

    .line 874
    .line 875
    .line 876
    move-object v3, v4

    .line 877
    invoke-virtual {v7, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 878
    .line 879
    .line 880
    invoke-virtual {v9, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 881
    .line 882
    .line 883
    invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 884
    .line 885
    .line 886
    invoke-virtual {v5, v8}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 887
    .line 888
    .line 889
    invoke-virtual {v5}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 890
    .line 891
    .line 892
    move-result-object v0

    .line 893
    if-eqz v0, :cond_11

    .line 894
    .line 895
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 896
    .line 897
    .line 898
    move-result-object v1

    .line 899
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 900
    .line 901
    .line 902
    move-result-object v1

    .line 903
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 904
    .line 905
    int-to-double v1, v1

    .line 906
    const-wide v6, 0x3feb333333333333L    # 0.85

    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    mul-double/2addr v1, v6

    .line 912
    double-to-int v1, v1

    .line 913
    const/4 v12, -0x2

    .line 914
    invoke-virtual {v0, v1, v12}, Landroid/view/Window;->setLayout(II)V

    .line 915
    .line 916
    .line 917
    :cond_11
    invoke-virtual {v5}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 918
    .line 919
    .line 920
    move-result-object v0

    .line 921
    if-eqz v0, :cond_12

    .line 922
    .line 923
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 924
    .line 925
    const/4 v13, 0x0

    .line 926
    invoke-direct {v1, v13}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 927
    .line 928
    .line 929
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 930
    .line 931
    .line 932
    :cond_12
    invoke-virtual {v5}, Landroid/app/Dialog;->show()V

    .line 933
    .line 934
    .line 935
    const/16 v11, 0x1c

    .line 936
    .line 937
    move-object/from16 v0, p0

    .line 938
    .line 939
    invoke-direct {v0, v3, v5, v11}, Lvf0;->z1(Landroid/content/Context;Landroid/app/Dialog;I)V

    .line 940
    .line 941
    .line 942
    return-void
.end method

.method public static synthetic k(Landroid/content/SharedPreferences;Z)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->e2(Landroid/content/SharedPreferences;Z)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic k0(Landroid/content/Context;IILandroid/widget/LinearLayout;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lvf0;->P1(Landroid/content/Context;IILandroid/widget/LinearLayout;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final k1(Lhw;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Lhw;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final k2(Landroid/content/Context;IIZLandroid/content/SharedPreferences;Landroid/widget/LinearLayout;)Lna1;
    .locals 12

    .line 1
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lvf0;->a:Lvf0;

    .line 5
    .line 6
    new-instance v9, Lye0;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    move-object/from16 v2, p4

    .line 10
    .line 11
    invoke-direct {v9, v2, v1}, Lye0;-><init>(Landroid/content/SharedPreferences;I)V

    .line 12
    .line 13
    .line 14
    const/16 v10, 0x80

    .line 15
    .line 16
    const/4 v11, 0x0

    .line 17
    const-string v2, "\u2630"

    .line 18
    .line 19
    const-string v3, "\u4fa7\u8fb9\u680f\u5165\u53e3\u8fd8\u539f"

    .line 20
    .line 21
    const-string v4, "\u4e3b\u9875\u5de6\u4e0a\u89d2\u70b9\u70b9\u5165\u53e3\u8fd8\u539f\u4e3a\u539f\u751f\u4fa7\u8fb9\u680f\u83dc\u5355\uff0c\u4fee\u6539\u7acb\u5373\u751f\u6548"

    .line 22
    .line 23
    const/4 v8, 0x0

    .line 24
    move-object v1, p0

    .line 25
    move v5, p1

    .line 26
    move v6, p2

    .line 27
    move v7, p3

    .line 28
    invoke-static/range {v0 .. v11}, Lvf0;->m1(Lvf0;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZLsw;ILjava/lang/Object;)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    move-object/from16 p1, p5

    .line 33
    .line 34
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lna1;->a:Lna1;

    .line 38
    .line 39
    return-object p0
.end method

.method public static synthetic k3(Lvf0;Landroid/content/Context;Landroid/widget/TextView;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2}, Lvf0;->j3(Landroid/content/Context;Landroid/widget/TextView;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic l(Landroid/content/Context;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->F1(Landroid/content/Context;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic l0(Lvf0$a;Ljava/util/List;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lvf0;->q1(Lvf0$a;Ljava/util/List;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final l1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZLsw;)Landroid/view/View;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "IIZZ",
            "Lsw;",
            ")",
            "Landroid/view/View;"
        }
    .end annotation

    .line 1
    new-instance p0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 8
    .line 9
    .line 10
    const/16 v1, 0x10

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 13
    .line 14
    .line 15
    sget-object v1, Lvf0;->a:Lvf0;

    .line 16
    .line 17
    const/4 v2, 0x4

    .line 18
    invoke-direct {v1, p1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-direct {v1, p1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    invoke-direct {v1, p1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-direct {v1, p1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    invoke-virtual {p0, v3, v4, v5, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 35
    .line 36
    .line 37
    if-nez p8, :cond_0

    .line 38
    .line 39
    const v3, 0x3ee66666    # 0.45f

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v3}, Landroid/view/View;->setAlpha(F)V

    .line 43
    .line 44
    .line 45
    :cond_0
    new-instance v3, Landroid/widget/TextView;

    .line 46
    .line 47
    invoke-direct {v3, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    const/high16 p2, 0x41a00000    # 20.0f

    .line 54
    .line 55
    invoke-virtual {v3, p2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 56
    .line 57
    .line 58
    const/16 p2, 0x11

    .line 59
    .line 60
    invoke-virtual {v3, p2}, Landroid/widget/TextView;->setGravity(I)V

    .line 61
    .line 62
    .line 63
    const/16 v4, 0x8

    .line 64
    .line 65
    invoke-direct {v1, p1, v4}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    invoke-direct {v1, p1, v4}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    invoke-direct {v1, p1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    invoke-direct {v1, p1, v4}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    invoke-virtual {v3, v5, v6, v7, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 85
    .line 86
    .line 87
    new-instance v3, Landroid/widget/LinearLayout;

    .line 88
    .line 89
    invoke-direct {v3, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 90
    .line 91
    .line 92
    const/4 v5, 0x1

    .line 93
    invoke-virtual {v3, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 94
    .line 95
    .line 96
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 97
    .line 98
    const/4 v7, -0x2

    .line 99
    const/high16 v8, 0x3f800000    # 1.0f

    .line 100
    .line 101
    invoke-direct {v6, v0, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 105
    .line 106
    .line 107
    invoke-direct {v1, p1, v4}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    invoke-direct {v1, p1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    invoke-direct {v1, p1, v4}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    invoke-virtual {v3, v0, v6, v2, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 120
    .line 121
    .line 122
    new-instance v2, Landroid/widget/TextView;

    .line 123
    .line 124
    invoke-direct {v2, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 128
    .line 129
    .line 130
    const/high16 p3, 0x41600000    # 14.0f

    .line 131
    .line 132
    invoke-virtual {v2, p3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2, p5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 139
    .line 140
    .line 141
    const/high16 p3, 0x41300000    # 11.0f

    .line 142
    .line 143
    invoke-static {p1, p4, p3, p6}, Lt1;->i(Landroid/content/Context;Ljava/lang/String;FI)Landroid/widget/TextView;

    .line 144
    .line 145
    .line 146
    move-result-object p3

    .line 147
    const/4 v2, 0x2

    .line 148
    invoke-direct {v1, p1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    invoke-virtual {p3, v0, v2, v0, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v3, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 159
    .line 160
    .line 161
    new-instance p3, Landroid/widget/TextView;

    .line 162
    .line 163
    invoke-direct {p3, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 164
    .line 165
    .line 166
    if-eqz p7, :cond_1

    .line 167
    .line 168
    if-eqz p8, :cond_1

    .line 169
    .line 170
    move v0, v5

    .line 171
    :cond_1
    const/16 v2, 0xc

    .line 172
    .line 173
    invoke-direct {v1, p1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    const/4 v4, 0x6

    .line 178
    invoke-direct {v1, p1, v4}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 179
    .line 180
    .line 181
    move-result v6

    .line 182
    invoke-direct {v1, p1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    invoke-direct {v1, p1, v4}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    invoke-virtual {p3, v3, v6, v2, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setGravity(I)V

    .line 194
    .line 195
    .line 196
    const/high16 p2, 0x41400000    # 12.0f

    .line 197
    .line 198
    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 199
    .line 200
    .line 201
    invoke-direct {v1, p1, p3, v0}, Lvf0;->G3(Landroid/content/Context;Landroid/widget/TextView;Z)V

    .line 202
    .line 203
    .line 204
    if-eqz p8, :cond_2

    .line 205
    .line 206
    new-instance p2, Lif0;

    .line 207
    .line 208
    move-object/from16 v1, p9

    .line 209
    .line 210
    invoke-direct {p2, p1, v1, v5}, Lif0;-><init>(Landroid/content/Context;Lsw;I)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p3, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 214
    .line 215
    .line 216
    :cond_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-virtual {p3, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 224
    .line 225
    .line 226
    return-object p0
.end method

.method private static final l2(Landroid/content/SharedPreferences;Z)Lna1;
    .locals 1

    .line 1
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lm00;->S:Lm00$a;

    .line 6
    .line 7
    invoke-virtual {v0}, Lm00$a;->O()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p0, v0, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lna1;->a:Lna1;

    .line 19
    .line 20
    return-object p0
.end method

.method private static final l3(Landroid/content/SharedPreferences;ILandroid/content/Context;Ljava/util/List;IIILandroid/view/View;)V
    .locals 1

    .line 1
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object p7, Lm00;->S:Lm00$a;

    .line 6
    .line 7
    invoke-virtual {p7}, Lm00$a;->Q()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p7}, Lm00$a;->Z()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p7

    .line 15
    invoke-interface {p7, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Luo0;

    .line 20
    .line 21
    iget-object p1, p1, Luo0;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p1, Ljava/lang/String;

    .line 24
    .line 25
    invoke-interface {p0, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 30
    .line 31
    .line 32
    invoke-static {p2, p3, p4, p5, p6}, Lvf0;->o3(Landroid/content/Context;Ljava/util/List;III)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public static synthetic m(Landroid/content/SharedPreferences;Lvf0$l;Z)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lvf0;->D3(Landroid/content/SharedPreferences;Lvf0$l;Z)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic m0(Landroid/content/Context;ILandroid/app/Dialog;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lvf0;->A1(Landroid/content/Context;ILandroid/app/Dialog;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic m1(Lvf0;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZLsw;ILjava/lang/Object;)Landroid/view/View;
    .locals 11

    .line 1
    move/from16 v0, p10

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0x80

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    move v9, v0

    .line 9
    :goto_0
    move-object v1, p0

    .line 10
    move-object v2, p1

    .line 11
    move-object v3, p2

    .line 12
    move-object v4, p3

    .line 13
    move-object v5, p4

    .line 14
    move/from16 v6, p5

    .line 15
    .line 16
    move/from16 v7, p6

    .line 17
    .line 18
    move/from16 v8, p7

    .line 19
    .line 20
    move-object/from16 v10, p9

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    move/from16 v9, p8

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :goto_1
    invoke-direct/range {v1 .. v10}, Lvf0;->l1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZLsw;)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method private static final m2(Landroid/content/Context;IIZLandroid/content/SharedPreferences;Landroid/widget/LinearLayout;)Lna1;
    .locals 13

    .line 1
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lvf0;->a:Lvf0;

    .line 5
    .line 6
    new-instance v9, Lye0;

    .line 7
    .line 8
    const/4 v12, 0x2

    .line 9
    move-object/from16 v1, p4

    .line 10
    .line 11
    invoke-direct {v9, v1, v12}, Lye0;-><init>(Landroid/content/SharedPreferences;I)V

    .line 12
    .line 13
    .line 14
    const/16 v10, 0x80

    .line 15
    .line 16
    const/4 v11, 0x0

    .line 17
    const-string v2, "\ud83d\udeab"

    .line 18
    .line 19
    const-string v3, "\u5c0f\u7ea2\u4e66\u5347\u7ea7\u62e6\u622a"

    .line 20
    .line 21
    const-string v4, "\u5f00\u542f\u540e\u963b\u6b62\u6240\u6709\u5347\u7ea7\u68c0\u6d4b\u3001\u5f39\u7a97\u3001\u4e0b\u8f7d\u94fe\u8def"

    .line 22
    .line 23
    const/4 v8, 0x0

    .line 24
    move-object v1, p0

    .line 25
    move v5, p1

    .line 26
    move v6, p2

    .line 27
    move/from16 v7, p3

    .line 28
    .line 29
    invoke-static/range {v0 .. v11}, Lvf0;->m1(Lvf0;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZLsw;ILjava/lang/Object;)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    new-instance p2, Lxt0;

    .line 34
    .line 35
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance v0, Lyt0;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    new-instance v2, Lvy;

    .line 44
    .line 45
    invoke-direct {v2, v0, p2, p0, v12}, Lvy;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 46
    .line 47
    .line 48
    invoke-static {v2, p1}, Lvf0;->p2(Landroid/view/View$OnClickListener;Landroid/view/View;)V

    .line 49
    .line 50
    .line 51
    move-object/from16 p0, p5

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 54
    .line 55
    .line 56
    sget-object p0, Lna1;->a:Lna1;

    .line 57
    .line 58
    return-object p0
.end method

.method private static final m3(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic n(Landroid/content/Context;II)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lvf0;->Q1(Landroid/content/Context;II)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic n0(Landroid/content/Context;Landroid/widget/LinearLayout;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->E1(Landroid/content/Context;Landroid/widget/LinearLayout;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final n1(Landroid/content/Context;Lsw;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Ljava/lang/Boolean;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Ljava/lang/Boolean;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    :goto_1
    xor-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    sget-object v1, Lvf0;->a:Lvf0;

    .line 31
    .line 32
    check-cast p2, Landroid/widget/TextView;

    .line 33
    .line 34
    invoke-direct {v1, p0, p2, v0}, Lvf0;->G3(Landroid/content/Context;Landroid/widget/TextView;Z)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-interface {p1, p0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method private static final n2(Landroid/content/SharedPreferences;Z)Lna1;
    .locals 1

    .line 1
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lm00;->S:Lm00$a;

    .line 6
    .line 7
    invoke-virtual {v0}, Lm00$a;->X()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p0, v0, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lna1;->a:Lna1;

    .line 19
    .line 20
    return-object p0
.end method

.method private static final n3(Landroid/widget/EditText;Landroid/content/SharedPreferences;Landroid/widget/TextView;Landroid/content/Context;Landroid/app/Dialog;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

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
    invoke-static {p0}, Lk41;->g0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    sget-object p5, Lm00;->S:Lm00$a;

    .line 22
    .line 23
    invoke-virtual {p5}, Lm00$a;->P()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {p1, v0, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 32
    .line 33
    .line 34
    if-eqz p2, :cond_0

    .line 35
    .line 36
    invoke-virtual {p5, p3}, Lm00$a;->b0(Landroid/content/Context;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    new-instance p1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v0, "\u5f53\u524d\uff1a"

    .line 43
    .line 44
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    invoke-virtual {p4}, Landroid/app/Dialog;->dismiss()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p5, p3}, Lm00$a;->b0(Landroid/content/Context;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    new-instance p1, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    const-string p2, "\u4fdd\u5b58\u6210\u529f\uff1a"

    .line 67
    .line 68
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    const/4 p1, 0x0

    .line 79
    invoke-static {p3, p0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public static synthetic o(Landroid/app/Dialog;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0}, Lvf0;->J2(Landroid/app/Dialog;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic o0(Lhw;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->k1(Lhw;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final o1(Landroid/content/Context;Ljava/lang/String;IIIIZLjava/util/List;Lsw;)Landroid/view/View;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "IIIIZ",
            "Ljava/util/List<",
            "Lvf0$a;",
            ">;",
            "Lsw;",
            ")",
            "Landroid/view/View;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p8

    .line 4
    .line 5
    new-instance v2, Landroid/widget/LinearLayout;

    .line 6
    .line 7
    invoke-direct {v2, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 12
    .line 13
    .line 14
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 15
    .line 16
    const/4 v5, -0x1

    .line 17
    const/4 v6, -0x2

    .line 18
    invoke-direct {v4, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 22
    .line 23
    .line 24
    new-instance v4, Landroid/widget/LinearLayout;

    .line 25
    .line 26
    invoke-direct {v4, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v4, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 30
    .line 31
    .line 32
    const/16 v3, 0x8

    .line 33
    .line 34
    const/4 v7, 0x0

    .line 35
    if-eqz p7, :cond_0

    .line 36
    .line 37
    move v8, v7

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v8, v3

    .line 40
    :goto_0
    invoke-virtual {v4, v8}, Landroid/view/View;->setVisibility(I)V

    .line 41
    .line 42
    .line 43
    sget-object v8, Lvf0;->a:Lvf0;

    .line 44
    .line 45
    const/4 v9, 0x6

    .line 46
    invoke-direct {v8, v0, v9}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 47
    .line 48
    .line 49
    move-result v10

    .line 50
    invoke-direct {v8, v0, v9}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 51
    .line 52
    .line 53
    move-result v9

    .line 54
    invoke-virtual {v4, v7, v10, v7, v9}, Landroid/view/View;->setPadding(IIII)V

    .line 55
    .line 56
    .line 57
    move-object/from16 v9, p9

    .line 58
    .line 59
    invoke-interface {v9, v4}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    new-instance v9, Landroid/widget/TextView;

    .line 63
    .line 64
    invoke-direct {v9, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 65
    .line 66
    .line 67
    if-eqz p7, :cond_1

    .line 68
    .line 69
    const-string v10, "\u25bc"

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    const-string v10, "\u25b6"

    .line 73
    .line 74
    :goto_1
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    .line 76
    .line 77
    const/high16 v10, 0x41800000    # 16.0f

    .line 78
    .line 79
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 80
    .line 81
    .line 82
    const/16 v11, 0x2c

    .line 83
    .line 84
    const/16 v12, 0x55

    .line 85
    .line 86
    const/16 v13, 0xc8

    .line 87
    .line 88
    const/16 v14, 0xfe

    .line 89
    .line 90
    invoke-static {v13, v14, v11, v12}, Landroid/graphics/Color;->argb(IIII)I

    .line 91
    .line 92
    .line 93
    move-result v11

    .line 94
    invoke-virtual {v9, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 95
    .line 96
    .line 97
    sget-object v11, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 98
    .line 99
    invoke-virtual {v9, v11}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 100
    .line 101
    .line 102
    const/16 v12, 0x11

    .line 103
    .line 104
    invoke-virtual {v9, v12}, Landroid/widget/TextView;->setGravity(I)V

    .line 105
    .line 106
    .line 107
    invoke-direct {v8, v0, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    const/4 v12, 0x4

    .line 112
    invoke-direct {v8, v0, v12}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 113
    .line 114
    .line 115
    move-result v12

    .line 116
    invoke-virtual {v9, v3, v7, v12, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 117
    .line 118
    .line 119
    new-instance v3, Lvf0$a;

    .line 120
    .line 121
    invoke-direct {v3, v9, v4}, Lvf0$a;-><init>(Landroid/widget/TextView;Landroid/widget/LinearLayout;)V

    .line 122
    .line 123
    .line 124
    if-eqz p7, :cond_2

    .line 125
    .line 126
    invoke-virtual {v3}, Lvf0$a;->b()V

    .line 127
    .line 128
    .line 129
    :cond_2
    if-eqz v1, :cond_3

    .line 130
    .line 131
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    :cond_3
    new-instance v12, Landroid/widget/LinearLayout;

    .line 135
    .line 136
    invoke-direct {v12, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v12, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 140
    .line 141
    .line 142
    const/16 v13, 0x10

    .line 143
    .line 144
    invoke-virtual {v12, v13}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 145
    .line 146
    .line 147
    const/16 v13, 0xc

    .line 148
    .line 149
    invoke-direct {v8, v0, v13}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 150
    .line 151
    .line 152
    move-result v14

    .line 153
    const/16 v15, 0xa

    .line 154
    .line 155
    invoke-direct {v8, v0, v15}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 156
    .line 157
    .line 158
    move-result v10

    .line 159
    invoke-direct {v8, v0, v13}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 160
    .line 161
    .line 162
    move-result v7

    .line 163
    invoke-direct {v8, v0, v15}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 164
    .line 165
    .line 166
    move-result v15

    .line 167
    invoke-virtual {v12, v14, v10, v7, v15}, Landroid/view/View;->setPadding(IIII)V

    .line 168
    .line 169
    .line 170
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 171
    .line 172
    invoke-direct {v7, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 173
    .line 174
    .line 175
    const/4 v5, 0x2

    .line 176
    invoke-direct {v8, v0, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    const/4 v10, 0x0

    .line 181
    invoke-virtual {v7, v10, v10, v10, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v12, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 185
    .line 186
    .line 187
    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    .line 188
    .line 189
    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v5, v10}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 193
    .line 194
    .line 195
    invoke-direct {v8, v0, v13}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 196
    .line 197
    .line 198
    move-result v7

    .line 199
    int-to-float v7, v7

    .line 200
    invoke-virtual {v5, v7}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 201
    .line 202
    .line 203
    move/from16 v7, p5

    .line 204
    .line 205
    invoke-virtual {v5, v7}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 209
    .line 210
    .line 211
    new-instance v5, Landroid/widget/TextView;

    .line 212
    .line 213
    invoke-direct {v5, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 214
    .line 215
    .line 216
    move-object/from16 v0, p2

    .line 217
    .line 218
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 219
    .line 220
    .line 221
    const/high16 v0, 0x41800000    # 16.0f

    .line 222
    .line 223
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 224
    .line 225
    .line 226
    move/from16 v0, p3

    .line 227
    .line 228
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v5, v11}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 232
    .line 233
    .line 234
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 235
    .line 236
    const/high16 v7, 0x3f800000    # 1.0f

    .line 237
    .line 238
    const/4 v10, 0x0

    .line 239
    invoke-direct {v0, v10, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v5, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v12, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v12, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 249
    .line 250
    .line 251
    new-instance v0, Lqf0;

    .line 252
    .line 253
    invoke-direct {v0, v10, v3, v1}, Lqf0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 263
    .line 264
    .line 265
    return-object v2
.end method

.method private static final o2(Lyt0;Lxt0;Landroid/content/Context;Landroid/view/View;)V
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lyt0;->d:J

    .line 6
    .line 7
    sub-long v2, v0, v2

    .line 8
    .line 9
    const-wide/16 v4, 0x320

    .line 10
    .line 11
    cmp-long p3, v2, v4

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-lez p3, :cond_0

    .line 15
    .line 16
    iput v2, p1, Lxt0;->d:I

    .line 17
    .line 18
    :cond_0
    iput-wide v0, p0, Lyt0;->d:J

    .line 19
    .line 20
    iget p0, p1, Lxt0;->d:I

    .line 21
    .line 22
    add-int/lit8 p0, p0, 0x1

    .line 23
    .line 24
    iput p0, p1, Lxt0;->d:I

    .line 25
    .line 26
    const/4 p3, 0x5

    .line 27
    if-lt p0, p3, :cond_3

    .line 28
    .line 29
    iput v2, p1, Lxt0;->d:I

    .line 30
    .line 31
    const-string p0, "vibrator"

    .line 32
    .line 33
    invoke-virtual {p2, p0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    instance-of p1, p0, Landroid/os/Vibrator;

    .line 38
    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    check-cast p0, Landroid/os/Vibrator;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 p0, 0x0

    .line 45
    :goto_0
    if-eqz p0, :cond_2

    .line 46
    .line 47
    const-wide/16 p1, 0x32

    .line 48
    .line 49
    const/4 p3, -0x1

    .line 50
    invoke-static {p1, p2, p3}, Landroid/os/VibrationEffect;->createOneShot(JI)Landroid/os/VibrationEffect;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p0, p1}, Landroid/os/Vibrator;->vibrate(Landroid/os/VibrationEffect;)V

    .line 55
    .line 56
    .line 57
    :cond_2
    sget-object p0, Laf1;->a:Laf1;

    .line 58
    .line 59
    invoke-virtual {p0}, Laf1;->J()V

    .line 60
    .line 61
    .line 62
    :cond_3
    return-void
.end method

.method private static final o3(Landroid/content/Context;Ljava/util/List;III)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "+",
            "Landroid/widget/TextView;",
            ">;III)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lm00;->S:Lm00$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm00$a;->Z()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lo30;->q(Ljava/util/Collection;)Lz20;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    move-object v1, v0

    .line 22
    check-cast v1, Ly20;

    .line 23
    .line 24
    invoke-virtual {v1}, Ly20;->nextInt()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    sget-object v2, Lm00;->S:Lm00$a;

    .line 29
    .line 30
    invoke-virtual {v2}, Lm00$a;->Z()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Luo0;

    .line 39
    .line 40
    iget-object v3, v3, Luo0;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v2, p0}, Lm00$a;->c0(Landroid/content/Context;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-static {v2, v3}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Landroid/widget/TextView;

    .line 57
    .line 58
    const/4 v4, 0x0

    .line 59
    invoke-static {v4}, Lt1;->h(I)Landroid/graphics/drawable/GradientDrawable;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    sget-object v5, Lvf0;->a:Lvf0;

    .line 64
    .line 65
    const/16 v6, 0x10

    .line 66
    .line 67
    invoke-direct {v5, p0, v6}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    int-to-float v5, v5

    .line 72
    invoke-virtual {v4, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 73
    .line 74
    .line 75
    if-eqz v2, :cond_0

    .line 76
    .line 77
    move v5, p3

    .line 78
    goto :goto_1

    .line 79
    :cond_0
    move v5, p4

    .line 80
    :goto_1
    invoke-virtual {v4, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 84
    .line 85
    .line 86
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    check-cast v1, Landroid/widget/TextView;

    .line 91
    .line 92
    if-eqz v2, :cond_1

    .line 93
    .line 94
    const/4 v2, -0x1

    .line 95
    goto :goto_2

    .line 96
    :cond_1
    move v2, p2

    .line 97
    :goto_2
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_2
    return-void
.end method

.method public static synthetic p(Lyt0;Lxt0;Landroid/content/Context;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lvf0;->o2(Lyt0;Lxt0;Landroid/content/Context;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic p0(Landroid/content/SharedPreferences;Lvf0$k;Z)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lvf0;->x3(Landroid/content/SharedPreferences;Lvf0$k;Z)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic p1(Lvf0;Landroid/content/Context;Ljava/lang/String;IIIIZLjava/util/List;Lsw;ILjava/lang/Object;)Landroid/view/View;
    .locals 12

    .line 1
    move/from16 v0, p10

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x40

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    move v9, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move/from16 v9, p7

    .line 11
    .line 12
    :goto_0
    and-int/lit16 v0, v0, 0x80

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    move-object v10, v0

    .line 18
    :goto_1
    move-object v2, p0

    .line 19
    move-object v3, p1

    .line 20
    move-object v4, p2

    .line 21
    move v5, p3

    .line 22
    move/from16 v6, p4

    .line 23
    .line 24
    move/from16 v7, p5

    .line 25
    .line 26
    move/from16 v8, p6

    .line 27
    .line 28
    move-object/from16 v11, p9

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_1
    move-object/from16 v10, p8

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :goto_2
    invoke-direct/range {v2 .. v11}, Lvf0;->o1(Landroid/content/Context;Ljava/lang/String;IIIIZLjava/util/List;Lsw;)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method private static final p2(Landroid/view/View$OnClickListener;Landroid/view/View;)V
    .locals 4

    .line 1
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroid/view/ViewGroup;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    if-ge v2, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {p0, v3}, Lvf0;->p2(Landroid/view/View$OnClickListener;Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->isClickable()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method

.method private final p3(Landroid/content/Context;II)V
    .locals 16

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move/from16 v3, p2

    .line 4
    .line 5
    invoke-direct/range {p0 .. p1}, Lvf0;->f1(Landroid/content/Context;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v2, 0xff

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/16 v4, 0x1c

    .line 14
    .line 15
    const/16 v5, 0x16

    .line 16
    .line 17
    :goto_0
    invoke-static {v2, v5, v5, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    const/16 v4, 0xfc

    .line 23
    .line 24
    const/16 v5, 0xf8

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    const/16 v5, 0x8c

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    const/16 v6, 0x5a

    .line 32
    .line 33
    const/16 v7, 0x50

    .line 34
    .line 35
    :goto_2
    invoke-static {v5, v7, v7, v6}, Landroid/graphics/Color;->argb(IIII)I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    move v6, v5

    .line 40
    goto :goto_3

    .line 41
    :cond_1
    const/16 v6, 0xd2

    .line 42
    .line 43
    const/16 v7, 0xc8

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :goto_3
    const/16 v7, 0x32

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    const/4 v0, -0x1

    .line 51
    :goto_4
    move v8, v0

    .line 52
    goto :goto_5

    .line 53
    :cond_2
    const/16 v0, 0x3c

    .line 54
    .line 55
    invoke-static {v2, v7, v7, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    goto :goto_4

    .line 60
    :goto_5
    sget-object v9, Lm00;->S:Lm00$a;

    .line 61
    .line 62
    invoke-virtual {v9}, Lm00$a;->Y()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const/4 v10, 0x0

    .line 67
    invoke-virtual {v1, v0, v10}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 68
    .line 69
    .line 70
    move-result-object v11

    .line 71
    new-instance v12, Landroid/app/Dialog;

    .line 72
    .line 73
    const v0, 0x103000a

    .line 74
    .line 75
    .line 76
    invoke-direct {v12, v1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 77
    .line 78
    .line 79
    const/4 v0, 0x1

    .line 80
    invoke-virtual {v12, v0}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 81
    .line 82
    .line 83
    new-instance v13, Landroid/widget/LinearLayout;

    .line 84
    .line 85
    invoke-direct {v13, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v13, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v13, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 92
    .line 93
    .line 94
    sget-object v14, Lvf0;->a:Lvf0;

    .line 95
    .line 96
    const/16 v2, 0x14

    .line 97
    .line 98
    invoke-direct {v14, v1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    const/16 v5, 0x12

    .line 103
    .line 104
    invoke-direct {v14, v1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    invoke-direct {v14, v1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    const/16 v15, 0x10

    .line 113
    .line 114
    invoke-direct {v14, v1, v15}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    invoke-virtual {v13, v4, v5, v2, v7}, Landroid/view/View;->setPadding(IIII)V

    .line 119
    .line 120
    .line 121
    const-string v2, "\u56de\u5230\u9876\u90e8\u6309\u94ae"

    .line 122
    .line 123
    const/high16 v4, 0x41a00000    # 20.0f

    .line 124
    .line 125
    const/16 v7, 0x11

    .line 126
    .line 127
    invoke-static {v1, v2, v4, v3, v7}, Lt1;->j(Landroid/content/Context;Ljava/lang/String;FII)Landroid/widget/TextView;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-direct {v14, v1, v15}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    invoke-virtual {v2, v10, v10, v10, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v13, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 139
    .line 140
    .line 141
    new-instance v2, Lvt0;

    .line 142
    .line 143
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v9}, Lm00$a;->R()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    invoke-interface {v11, v4, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    iput-boolean v4, v2, Lvt0;->d:Z

    .line 155
    .line 156
    new-instance v5, Lve0;

    .line 157
    .line 158
    const/4 v0, 0x2

    .line 159
    invoke-direct {v5, v2, v11, v0}, Lve0;-><init>(Lvt0;Landroid/content/SharedPreferences;I)V

    .line 160
    .line 161
    .line 162
    const-string v2, "\u542f\u7528\u56de\u5230\u9876\u90e8"

    .line 163
    .line 164
    move-object/from16 v0, p0

    .line 165
    .line 166
    invoke-direct/range {v0 .. v5}, Lvf0;->c1(Landroid/content/Context;Ljava/lang/String;IZLsw;)Landroid/view/View;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-virtual {v13, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v9}, Lm00$a;->T()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    const/16 v4, 0x30

    .line 178
    .line 179
    invoke-interface {v11, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    new-instance v4, Landroid/widget/TextView;

    .line 184
    .line 185
    invoke-direct {v4, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 186
    .line 187
    .line 188
    new-instance v5, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    const-string v9, "dp"

    .line 197
    .line 198
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 206
    .line 207
    .line 208
    const/high16 v5, 0x41c00000    # 24.0f

    .line 209
    .line 210
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setGravity(I)V

    .line 217
    .line 218
    .line 219
    const/16 v3, 0x8

    .line 220
    .line 221
    invoke-direct {v14, v1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    const/16 v5, 0xa

    .line 226
    .line 227
    invoke-direct {v14, v1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 228
    .line 229
    .line 230
    move-result v7

    .line 231
    invoke-virtual {v4, v10, v3, v10, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v13, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 235
    .line 236
    .line 237
    invoke-direct {v0, v1, v2}, Lvf0;->b1(Landroid/content/Context;I)Landroid/widget/SeekBar;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    const/16 v7, 0x32

    .line 242
    .line 243
    invoke-virtual {v3, v7}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 244
    .line 245
    .line 246
    add-int/lit8 v2, v2, -0x1e

    .line 247
    .line 248
    invoke-virtual {v3}, Landroid/widget/ProgressBar;->getMax()I

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    invoke-static {v2, v10, v7}, Lw60;->n(III)I

    .line 253
    .line 254
    .line 255
    move-result v2

    .line 256
    invoke-virtual {v3, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 257
    .line 258
    .line 259
    new-instance v2, Lvf0$i;

    .line 260
    .line 261
    invoke-direct {v2, v4, v11}, Lvf0$i;-><init>(Landroid/widget/TextView;Landroid/content/SharedPreferences;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v3, v2}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v13, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 268
    .line 269
    .line 270
    new-instance v2, Landroid/widget/TextView;

    .line 271
    .line 272
    invoke-direct {v2, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 273
    .line 274
    .line 275
    const-string v3, "\u62d6\u52a8\u6ed1\u5757\u8c03\u6574\u5927\u5c0f\uff0c\u4e0b\u6b21\u8fdb\u5165\u4e3b\u9875\u65f6\u751f\u6548"

    .line 276
    .line 277
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 278
    .line 279
    .line 280
    const/high16 v3, 0x41300000    # 11.0f

    .line 281
    .line 282
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 283
    .line 284
    .line 285
    move/from16 v3, p3

    .line 286
    .line 287
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 288
    .line 289
    .line 290
    invoke-direct {v14, v1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    invoke-direct {v14, v1, v15}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 295
    .line 296
    .line 297
    move-result v4

    .line 298
    invoke-virtual {v2, v10, v3, v10, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v13, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 302
    .line 303
    .line 304
    new-instance v5, Lwe0;

    .line 305
    .line 306
    const/4 v2, 0x2

    .line 307
    invoke-direct {v5, v12, v2}, Lwe0;-><init>(Landroid/app/Dialog;I)V

    .line 308
    .line 309
    .line 310
    move v4, v6

    .line 311
    move v3, v8

    .line 312
    move-object v2, v13

    .line 313
    invoke-direct/range {v0 .. v5}, Lvf0;->W0(Landroid/content/Context;Landroid/widget/LinearLayout;IILhw;)V

    .line 314
    .line 315
    .line 316
    invoke-direct {v0, v12, v1, v2}, Lvf0;->A3(Landroid/app/Dialog;Landroid/content/Context;Landroid/view/View;)V

    .line 317
    .line 318
    .line 319
    return-void
.end method

.method public static synthetic q(Landroid/content/SharedPreferences;Z)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->U1(Landroid/content/SharedPreferences;Z)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic q0(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lvf0;->C2(Landroid/content/DialogInterface;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final q1(Lvf0$a;Ljava/util/List;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lvf0$a;->e()Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lvf0$a;->a()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    if-eqz p1, :cond_1

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    check-cast p2, Lvf0$a;

    .line 28
    .line 29
    invoke-virtual {p2}, Lvf0$a;->a()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {p0}, Lvf0$a;->b()V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method private static final q2(Landroid/content/SharedPreferences;Landroid/content/Context;IIIILandroid/widget/LinearLayout;)Lna1;
    .locals 10

    .line 1
    move-object/from16 v7, p6

    .line 2
    .line 3
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v0, "hide_home_follow"

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 10
    .line 11
    .line 12
    const-string v0, "hide_home_explore"

    .line 13
    .line 14
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 15
    .line 16
    .line 17
    const-string v0, "hide_home_worldcup"

    .line 18
    .line 19
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 20
    .line 21
    .line 22
    const-string v0, "hide_home_local"

    .line 23
    .line 24
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 25
    .line 26
    .line 27
    sget-object v8, Lvf0;->a:Lvf0;

    .line 28
    .line 29
    new-instance v0, Lof0;

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    move-object v2, p0

    .line 33
    move-object v1, p1

    .line 34
    move v5, p2

    .line 35
    move v3, p4

    .line 36
    move v4, p5

    .line 37
    invoke-direct/range {v0 .. v6}, Lof0;-><init>(Landroid/content/Context;Landroid/content/SharedPreferences;IIII)V

    .line 38
    .line 39
    .line 40
    invoke-direct {v8, p1, p2, p3, v0}, Lvf0;->r1(Landroid/content/Context;IILsw;)Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 45
    .line 46
    .line 47
    sget-object v9, Lm00;->S:Lm00$a;

    .line 48
    .line 49
    invoke-virtual {v9, p1}, Lm00$a;->h0(Landroid/content/Context;)Z

    .line 50
    .line 51
    .line 52
    new-instance v0, Lof0;

    .line 53
    .line 54
    const/4 v6, 0x1

    .line 55
    invoke-direct/range {v0 .. v6}, Lof0;-><init>(Landroid/content/Context;Landroid/content/SharedPreferences;IIII)V

    .line 56
    .line 57
    .line 58
    invoke-direct {v8, p1, p2, p3, v0}, Lvf0;->r1(Landroid/content/Context;IILsw;)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v9, p1}, Lm00$a;->f0(Landroid/content/Context;)Z

    .line 66
    .line 67
    .line 68
    new-instance v0, Lpf0;

    .line 69
    .line 70
    invoke-direct {v0, p4, p1, p5, p2}, Lpf0;-><init>(ILandroid/content/Context;II)V

    .line 71
    .line 72
    .line 73
    invoke-direct {v8, p1, p2, p3, v0}, Lvf0;->r1(Landroid/content/Context;IILsw;)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 78
    .line 79
    .line 80
    sget-object v0, Lna1;->a:Lna1;

    .line 81
    .line 82
    return-object v0
.end method

.method private static final q3(Lvt0;Landroid/content/SharedPreferences;Z)Lna1;
    .locals 0

    .line 1
    iput-boolean p2, p0, Lvt0;->d:Z

    .line 2
    .line 3
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, Lm00;->S:Lm00$a;

    .line 8
    .line 9
    invoke-virtual {p1}, Lm00$a;->R()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 18
    .line 19
    .line 20
    sget-object p0, Lna1;->a:Lna1;

    .line 21
    .line 22
    return-object p0
.end method

.method public static synthetic r(Landroid/content/Context;IIIILandroid/app/Dialog;Landroid/widget/LinearLayout;)Lna1;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lvf0;->x2(Landroid/content/Context;IIIILandroid/app/Dialog;Landroid/widget/LinearLayout;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic r0(Landroid/content/Context;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0}, Lvf0;->N1(Landroid/content/Context;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final r1(Landroid/content/Context;IILsw;)Landroid/view/View;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "II",
            "Lsw;",
            ")",
            "Landroid/view/View;"
        }
    .end annotation

    .line 1
    new-instance p0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 11
    .line 12
    const/4 v2, -0x1

    .line 13
    const/4 v3, -0x2

    .line 14
    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 15
    .line 16
    .line 17
    sget-object v2, Lvf0;->a:Lvf0;

    .line 18
    .line 19
    const/16 v3, 0x8

    .line 20
    .line 21
    invoke-direct {v2, p1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const/4 v4, 0x0

    .line 26
    invoke-virtual {v1, v4, v4, v4, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 30
    .line 31
    .line 32
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    .line 33
    .line 34
    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v4}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 38
    .line 39
    .line 40
    const/16 v3, 0xc

    .line 41
    .line 42
    invoke-direct {v2, p1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    int-to-float v3, v3

    .line 47
    invoke-virtual {v1, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 51
    .line 52
    .line 53
    invoke-direct {v2, p1, v0}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-virtual {v1, p1, p3}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p4, p0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    return-object p0
.end method

.method private static final r2(Landroid/content/Context;IIILandroid/content/SharedPreferences;Landroid/widget/LinearLayout;)Lna1;
    .locals 8

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lvf0;->a:Lvf0;

    .line 5
    .line 6
    new-instance v1, Laf0;

    .line 7
    .line 8
    const/4 v7, 0x0

    .line 9
    move-object v2, p0

    .line 10
    move v4, p1

    .line 11
    move v5, p2

    .line 12
    move v6, p3

    .line 13
    move-object v3, p4

    .line 14
    invoke-direct/range {v1 .. v7}, Laf0;-><init>(Landroid/content/Context;Landroid/content/SharedPreferences;IIII)V

    .line 15
    .line 16
    .line 17
    move-object v7, v1

    .line 18
    move-object v1, v2

    .line 19
    const-string v2, "\ud83c\udff7"

    .line 20
    .line 21
    const-string v3, "\u9876\u90e8\u5bfc\u822a\u680fTab"

    .line 22
    .line 23
    move v6, v5

    .line 24
    move v5, v4

    .line 25
    const-string v4, "\u81ea\u5b9a\u4e49\u9009\u62e9\u9690\u85cf\u54ea\u4e9b\u9876\u90e8Tab\uff0c\u8bbe\u7f6e\u540e\u5de6\u53f3\u6ed1\u52a8\u9996\u9875\u751f\u6548\uff0c\u91cd\u542f\u4e5f\u9700\u6ed1\u52a8\u89e6\u53d1"

    .line 26
    .line 27
    invoke-direct/range {v0 .. v7}, Lvf0;->h1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILhw;)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p5, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lna1;->a:Lna1;

    .line 35
    .line 36
    return-object p0
.end method

.method private static final r3(Landroid/app/Dialog;)Lna1;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lna1;->a:Lna1;

    .line 5
    .line 6
    return-object p0
.end method

.method public static synthetic s(Lcf1$a;Landroid/content/Context;Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lvf0;->K1(Lcf1$a;Landroid/content/Context;Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic s0(Landroid/content/SharedPreferences;Z)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->l2(Landroid/content/SharedPreferences;Z)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final s1(Landroid/content/Context;ZZ)Landroid/view/View;
    .locals 8

    .line 1
    new-instance p0, Landroid/view/View;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const/16 v0, 0xa0

    .line 7
    .line 8
    const/16 v1, 0x50

    .line 9
    .line 10
    const/16 v2, 0xb4

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz p3, :cond_1

    .line 14
    .line 15
    const/16 p3, 0x32

    .line 16
    .line 17
    const/16 v4, 0x8c

    .line 18
    .line 19
    const/16 v5, 0xff

    .line 20
    .line 21
    invoke-static {v3, v5, v4, p3}, Landroid/graphics/Color;->argb(IIII)I

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    invoke-static {v0, v5, v2, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/16 v1, 0x3c

    .line 33
    .line 34
    invoke-static {v2, v5, v0, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    :goto_0
    invoke-static {v3, v5, v4, p3}, Landroid/graphics/Color;->argb(IIII)I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    goto :goto_3

    .line 43
    :cond_1
    invoke-static {v3, v3, v2, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 44
    .line 45
    .line 46
    move-result p3

    .line 47
    move v6, p3

    .line 48
    if-eqz p2, :cond_2

    .line 49
    .line 50
    const/16 p3, 0xdc

    .line 51
    .line 52
    const/16 v4, 0x78

    .line 53
    .line 54
    invoke-static {v0, v1, p3, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 55
    .line 56
    .line 57
    move-result p3

    .line 58
    :goto_1
    move v0, p3

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    const/16 p3, 0x64

    .line 61
    .line 62
    invoke-static {v2, v3, v2, p3}, Landroid/graphics/Color;->argb(IIII)I

    .line 63
    .line 64
    .line 65
    move-result p3

    .line 66
    goto :goto_1

    .line 67
    :goto_2
    invoke-static {v3, v3, v2, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    :goto_3
    new-instance p3, Landroid/widget/LinearLayout$LayoutParams;

    .line 72
    .line 73
    sget-object v1, Lvf0;->a:Lvf0;

    .line 74
    .line 75
    const/4 v2, 0x3

    .line 76
    invoke-direct {v1, p1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    const/4 v4, -0x1

    .line 81
    invoke-direct {p3, v4, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 82
    .line 83
    .line 84
    const/16 v2, 0x10

    .line 85
    .line 86
    invoke-direct {v1, p1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    const/16 v5, 0xa

    .line 91
    .line 92
    invoke-direct {v1, p1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    invoke-direct {v1, p1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    invoke-direct {v1, p1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    invoke-virtual {p3, v4, v7, v2, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 108
    .line 109
    .line 110
    new-instance p3, Landroid/graphics/drawable/GradientDrawable;

    .line 111
    .line 112
    invoke-direct {p3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p3, v3}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 116
    .line 117
    .line 118
    const/4 v2, 0x2

    .line 119
    invoke-direct {v1, p1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    int-to-float p1, p1

    .line 124
    invoke-virtual {p3, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 125
    .line 126
    .line 127
    filled-new-array {v6, v0, p2}, [I

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {p3, p1}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p3, v3}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V

    .line 135
    .line 136
    .line 137
    sget-object p1, Landroid/graphics/drawable/GradientDrawable$Orientation;->LEFT_RIGHT:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 138
    .line 139
    invoke-virtual {p3, p1}, Landroid/graphics/drawable/GradientDrawable;->setOrientation(Landroid/graphics/drawable/GradientDrawable$Orientation;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0, p3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 143
    .line 144
    .line 145
    return-object p0
.end method

.method private static final s2(Landroid/content/Context;IIILandroid/content/SharedPreferences;)Lna1;
    .locals 6

    .line 1
    sget-object v0, Lvf0;->a:Lvf0;

    .line 2
    .line 3
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-object v1, p0

    .line 7
    move v2, p1

    .line 8
    move v3, p2

    .line 9
    move v4, p3

    .line 10
    move-object v5, p4

    .line 11
    invoke-direct/range {v0 .. v5}, Lvf0;->B3(Landroid/content/Context;IIILandroid/content/SharedPreferences;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lna1;->a:Lna1;

    .line 15
    .line 16
    return-object p0
.end method

.method private final s3(Landroid/content/Context;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-direct/range {p0 .. p1}, Lvf0;->f1(Landroid/content/Context;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/16 v3, 0x16

    .line 10
    .line 11
    const/16 v4, 0x1c

    .line 12
    .line 13
    const/16 v5, 0xff

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-static {v5, v3, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/16 v6, 0xfc

    .line 23
    .line 24
    const/16 v7, 0xf8

    .line 25
    .line 26
    invoke-static {v5, v7, v7, v6}, Landroid/graphics/Color;->argb(IIII)I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    :goto_0
    if-eqz v2, :cond_1

    .line 31
    .line 32
    const/4 v3, -0x1

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-static {v5, v3, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    :goto_1
    const/16 v8, 0x5a

    .line 39
    .line 40
    const/16 v9, 0x96

    .line 41
    .line 42
    const/16 v10, 0x50

    .line 43
    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    invoke-static {v9, v5, v5, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 47
    .line 48
    .line 49
    move-result v9

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    invoke-static {v9, v10, v10, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 52
    .line 53
    .line 54
    move-result v9

    .line 55
    :goto_2
    const/16 v11, 0x8c

    .line 56
    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    invoke-static {v11, v10, v10, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    goto :goto_3

    .line 64
    :cond_3
    const/16 v8, 0xd2

    .line 65
    .line 66
    const/16 v12, 0xc8

    .line 67
    .line 68
    invoke-static {v11, v12, v12, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    :goto_3
    const/16 v11, 0x32

    .line 73
    .line 74
    if-eqz v2, :cond_4

    .line 75
    .line 76
    const/4 v2, -0x1

    .line 77
    goto :goto_4

    .line 78
    :cond_4
    const/16 v2, 0x3c

    .line 79
    .line 80
    invoke-static {v5, v11, v11, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    :goto_4
    new-instance v5, Landroid/app/Dialog;

    .line 85
    .line 86
    const v12, 0x103000a

    .line 87
    .line 88
    .line 89
    invoke-direct {v5, v1, v12}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 90
    .line 91
    .line 92
    const/4 v12, 0x1

    .line 93
    invoke-virtual {v5, v12}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 94
    .line 95
    .line 96
    sget-object v13, Lm00;->S:Lm00$a;

    .line 97
    .line 98
    invoke-virtual {v13}, Lm00$a;->Y()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v14

    .line 102
    const/4 v15, 0x0

    .line 103
    invoke-virtual {v1, v14, v15}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 104
    .line 105
    .line 106
    move-result-object v14

    .line 107
    new-instance v10, Lxt0;

    .line 108
    .line 109
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v13}, Lm00$a;->T()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v13

    .line 116
    const/16 v4, 0x30

    .line 117
    .line 118
    invoke-interface {v14, v13, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    iput v4, v10, Lxt0;->d:I

    .line 123
    .line 124
    new-instance v4, Landroid/widget/LinearLayout;

    .line 125
    .line 126
    invoke-direct {v4, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v4, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v4, v6}, Landroid/view/View;->setBackgroundColor(I)V

    .line 133
    .line 134
    .line 135
    sget-object v6, Lvf0;->a:Lvf0;

    .line 136
    .line 137
    const/16 v12, 0x14

    .line 138
    .line 139
    invoke-direct {v6, v1, v12}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 140
    .line 141
    .line 142
    move-result v13

    .line 143
    const/16 v7, 0x12

    .line 144
    .line 145
    invoke-direct {v6, v1, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 146
    .line 147
    .line 148
    move-result v7

    .line 149
    invoke-direct {v6, v1, v12}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 150
    .line 151
    .line 152
    move-result v11

    .line 153
    const/16 v15, 0x10

    .line 154
    .line 155
    invoke-direct {v6, v1, v15}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 156
    .line 157
    .line 158
    move-result v12

    .line 159
    invoke-virtual {v4, v13, v7, v11, v12}, Landroid/view/View;->setPadding(IIII)V

    .line 160
    .line 161
    .line 162
    const-string v7, "\u56de\u5230\u9876\u90e8\u6309\u94ae\u5927\u5c0f"

    .line 163
    .line 164
    const/high16 v11, 0x41a00000    # 20.0f

    .line 165
    .line 166
    const/16 v12, 0x11

    .line 167
    .line 168
    invoke-static {v1, v7, v11, v3, v12}, Lt1;->j(Landroid/content/Context;Ljava/lang/String;FII)Landroid/widget/TextView;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    const/16 v11, 0x14

    .line 173
    .line 174
    invoke-direct {v6, v1, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 175
    .line 176
    .line 177
    move-result v11

    .line 178
    const/4 v13, 0x0

    .line 179
    invoke-virtual {v7, v13, v13, v13, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v4, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 183
    .line 184
    .line 185
    new-instance v7, Landroid/widget/TextView;

    .line 186
    .line 187
    invoke-direct {v7, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 188
    .line 189
    .line 190
    iget v11, v10, Lxt0;->d:I

    .line 191
    .line 192
    new-instance v13, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    const-string v11, "dp"

    .line 201
    .line 202
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v11

    .line 209
    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 210
    .line 211
    .line 212
    const/high16 v11, 0x41e00000    # 28.0f

    .line 213
    .line 214
    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setTextSize(F)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v7, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v7, v12}, Landroid/widget/TextView;->setGravity(I)V

    .line 221
    .line 222
    .line 223
    const/16 v3, 0xe

    .line 224
    .line 225
    invoke-direct {v6, v1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    const/4 v13, 0x0

    .line 230
    invoke-virtual {v7, v13, v13, v13, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v4, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 234
    .line 235
    .line 236
    iget v3, v10, Lxt0;->d:I

    .line 237
    .line 238
    invoke-direct {v0, v1, v3}, Lvf0;->b1(Landroid/content/Context;I)Landroid/widget/SeekBar;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    const/16 v11, 0x32

    .line 243
    .line 244
    invoke-virtual {v3, v11}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 245
    .line 246
    .line 247
    iget v11, v10, Lxt0;->d:I

    .line 248
    .line 249
    add-int/lit8 v11, v11, -0x1e

    .line 250
    .line 251
    invoke-virtual {v3}, Landroid/widget/ProgressBar;->getMax()I

    .line 252
    .line 253
    .line 254
    move-result v12

    .line 255
    invoke-static {v11, v13, v12}, Lw60;->n(III)I

    .line 256
    .line 257
    .line 258
    move-result v11

    .line 259
    invoke-virtual {v3, v11}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 260
    .line 261
    .line 262
    new-instance v11, Lvf0$j;

    .line 263
    .line 264
    invoke-direct {v11, v10, v7, v14}, Lvf0$j;-><init>(Lxt0;Landroid/widget/TextView;Landroid/content/SharedPreferences;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v3, v11}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 271
    .line 272
    .line 273
    new-instance v3, Landroid/widget/TextView;

    .line 274
    .line 275
    invoke-direct {v3, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 276
    .line 277
    .line 278
    const-string v7, "\u62d6\u52a8\u6ed1\u5757\u8c03\u6574\u5927\u5c0f\uff0c\u4e0b\u6b21\u8fdb\u5165\u4e3b\u9875\u65f6\u751f\u6548"

    .line 279
    .line 280
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 281
    .line 282
    .line 283
    const/high16 v7, 0x41300000    # 11.0f

    .line 284
    .line 285
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 289
    .line 290
    .line 291
    const/16 v7, 0xa

    .line 292
    .line 293
    invoke-direct {v6, v1, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 294
    .line 295
    .line 296
    move-result v7

    .line 297
    invoke-direct {v6, v1, v15}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 298
    .line 299
    .line 300
    move-result v9

    .line 301
    const/4 v13, 0x0

    .line 302
    invoke-virtual {v3, v13, v7, v13, v9}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 306
    .line 307
    .line 308
    new-instance v3, Landroid/widget/LinearLayout;

    .line 309
    .line 310
    invoke-direct {v3, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v3, v13}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 314
    .line 315
    .line 316
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 317
    .line 318
    const/4 v9, -0x2

    .line 319
    const/4 v10, -0x1

    .line 320
    invoke-direct {v7, v10, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v3, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 324
    .line 325
    .line 326
    new-instance v7, Landroid/widget/TextView;

    .line 327
    .line 328
    invoke-direct {v7, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 329
    .line 330
    .line 331
    const-string v10, "\u2190 \u8fd4\u56de"

    .line 332
    .line 333
    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 334
    .line 335
    .line 336
    const/high16 v10, 0x41600000    # 14.0f

    .line 337
    .line 338
    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 342
    .line 343
    .line 344
    const/16 v2, 0x11

    .line 345
    .line 346
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 347
    .line 348
    .line 349
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    .line 350
    .line 351
    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 352
    .line 353
    .line 354
    const/4 v13, 0x0

    .line 355
    invoke-virtual {v2, v13}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 356
    .line 357
    .line 358
    const/16 v11, 0x1c

    .line 359
    .line 360
    invoke-direct {v6, v1, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 361
    .line 362
    .line 363
    move-result v12

    .line 364
    int-to-float v11, v12

    .line 365
    invoke-virtual {v2, v11}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v2, v8}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v7, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 372
    .line 373
    .line 374
    const/16 v2, 0xc

    .line 375
    .line 376
    invoke-direct {v6, v1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 377
    .line 378
    .line 379
    move-result v8

    .line 380
    invoke-direct {v6, v1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 381
    .line 382
    .line 383
    move-result v11

    .line 384
    invoke-virtual {v7, v13, v8, v13, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 385
    .line 386
    .line 387
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 388
    .line 389
    const/high16 v11, 0x3f800000    # 1.0f

    .line 390
    .line 391
    invoke-direct {v8, v13, v9, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 392
    .line 393
    .line 394
    const/4 v12, 0x6

    .line 395
    invoke-direct {v6, v1, v12}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 396
    .line 397
    .line 398
    move-result v14

    .line 399
    invoke-virtual {v8, v13, v13, v14, v13}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v7, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 403
    .line 404
    .line 405
    new-instance v8, Luy;

    .line 406
    .line 407
    const/4 v14, 0x2

    .line 408
    invoke-direct {v8, v5, v14}, Luy;-><init>(Landroid/app/Dialog;I)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v7, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v3, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 415
    .line 416
    .line 417
    const-string v7, "\u5b8c\u6210"

    .line 418
    .line 419
    const/16 v8, 0x11

    .line 420
    .line 421
    const/4 v14, -0x1

    .line 422
    invoke-static {v1, v7, v10, v14, v8}, Lt1;->j(Landroid/content/Context;Ljava/lang/String;FII)Landroid/widget/TextView;

    .line 423
    .line 424
    .line 425
    move-result-object v7

    .line 426
    invoke-static {v13}, Lt1;->h(I)Landroid/graphics/drawable/GradientDrawable;

    .line 427
    .line 428
    .line 429
    move-result-object v8

    .line 430
    const/16 v10, 0x1c

    .line 431
    .line 432
    invoke-direct {v6, v1, v10}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 433
    .line 434
    .line 435
    move-result v14

    .line 436
    int-to-float v10, v14

    .line 437
    invoke-virtual {v8, v10}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 438
    .line 439
    .line 440
    const/16 v10, 0xdc

    .line 441
    .line 442
    const/16 v14, 0xb4

    .line 443
    .line 444
    const/16 v15, 0x50

    .line 445
    .line 446
    invoke-static {v10, v13, v14, v15}, Landroid/graphics/Color;->argb(IIII)I

    .line 447
    .line 448
    .line 449
    move-result v10

    .line 450
    invoke-virtual {v8, v10}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v7, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 454
    .line 455
    .line 456
    invoke-direct {v6, v1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 457
    .line 458
    .line 459
    move-result v8

    .line 460
    invoke-direct {v6, v1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 461
    .line 462
    .line 463
    move-result v2

    .line 464
    invoke-virtual {v7, v13, v8, v13, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 465
    .line 466
    .line 467
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 468
    .line 469
    invoke-direct {v2, v13, v9, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 470
    .line 471
    .line 472
    invoke-direct {v6, v1, v12}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 473
    .line 474
    .line 475
    move-result v6

    .line 476
    invoke-virtual {v2, v6, v13, v13, v13}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v7, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 480
    .line 481
    .line 482
    new-instance v2, Luy;

    .line 483
    .line 484
    const/4 v6, 0x3

    .line 485
    invoke-direct {v2, v5, v6}, Luy;-><init>(Landroid/app/Dialog;I)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v7, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v3, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v5, v4}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 498
    .line 499
    .line 500
    invoke-virtual {v5}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 501
    .line 502
    .line 503
    move-result-object v2

    .line 504
    if-eqz v2, :cond_5

    .line 505
    .line 506
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 507
    .line 508
    .line 509
    move-result-object v3

    .line 510
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 511
    .line 512
    .line 513
    move-result-object v3

    .line 514
    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 515
    .line 516
    int-to-double v3, v3

    .line 517
    const-wide v6, 0x3feb333333333333L    # 0.85

    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    mul-double/2addr v3, v6

    .line 523
    double-to-int v3, v3

    .line 524
    invoke-virtual {v2, v3, v9}, Landroid/view/Window;->setLayout(II)V

    .line 525
    .line 526
    .line 527
    :cond_5
    invoke-virtual {v5}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 528
    .line 529
    .line 530
    move-result-object v2

    .line 531
    if-eqz v2, :cond_6

    .line 532
    .line 533
    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    .line 534
    .line 535
    const/4 v13, 0x0

    .line 536
    invoke-direct {v3, v13}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v2, v3}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 540
    .line 541
    .line 542
    :cond_6
    invoke-virtual {v5}, Landroid/app/Dialog;->show()V

    .line 543
    .line 544
    .line 545
    const/16 v10, 0x1c

    .line 546
    .line 547
    invoke-direct {v0, v1, v5, v10}, Lvf0;->z1(Landroid/content/Context;Landroid/app/Dialog;I)V

    .line 548
    .line 549
    .line 550
    return-void
.end method

.method public static synthetic t(Landroid/app/Dialog;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0}, Lvf0;->V2(Landroid/app/Dialog;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic t0(Landroid/content/SharedPreferences;Landroid/content/Context;IIIIILandroid/widget/TextView;Landroid/widget/LinearLayout;)Lna1;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p8}, Lvf0;->O1(Landroid/content/SharedPreferences;Landroid/content/Context;IIIIILandroid/widget/TextView;Landroid/widget/LinearLayout;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic t1(Lvf0;Landroid/content/Context;ZZILjava/lang/Object;)Landroid/view/View;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lvf0;->s1(Landroid/content/Context;ZZ)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static final t2(Landroid/content/Context;IIILandroid/content/SharedPreferences;Landroid/widget/LinearLayout;)Lna1;
    .locals 8

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lvf0;->a:Lvf0;

    .line 5
    .line 6
    new-instance v1, Laf0;

    .line 7
    .line 8
    const/4 v7, 0x1

    .line 9
    move-object v2, p0

    .line 10
    move v4, p1

    .line 11
    move v5, p2

    .line 12
    move v6, p3

    .line 13
    move-object v3, p4

    .line 14
    invoke-direct/range {v1 .. v7}, Laf0;-><init>(Landroid/content/Context;Landroid/content/SharedPreferences;IIII)V

    .line 15
    .line 16
    .line 17
    move-object v7, v1

    .line 18
    move-object v1, v2

    .line 19
    const-string v2, "\ud83d\udccb"

    .line 20
    .line 21
    const-string v3, "\u4fa7\u8fb9\u680f"

    .line 22
    .line 23
    move v6, v5

    .line 24
    move v5, v4

    .line 25
    const-string v4, "\u81ea\u5b9a\u4e49\u9690\u85cf\u4fa7\u8fb9\u680f\u83dc\u5355\u4e2d\u7684\u529f\u80fd\u9009\u9879\uff0c\u4fee\u6539\u7acb\u5373\u751f\u6548"

    .line 26
    .line 27
    invoke-direct/range {v0 .. v7}, Lvf0;->h1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILhw;)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p5, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lna1;->a:Lna1;

    .line 35
    .line 36
    return-object p0
.end method

.method private static final t3(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic u(Landroid/content/Context;Lvt0;Landroid/content/SharedPreferences;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lvf0;->C3(Landroid/content/Context;Lvt0;Landroid/content/SharedPreferences;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic u0(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->L2(Landroid/app/Dialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final u1(Landroid/content/Context;Ljava/lang/String;)Landroid/view/View;
    .locals 4

    .line 1
    const/high16 p0, 0x41400000    # 12.0f

    .line 2
    .line 3
    const v0, -0x7f7f80

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2, p0, v0}, Lt1;->i(Landroid/content/Context;Ljava/lang/String;FI)Landroid/widget/TextView;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget-object p2, Lvf0;->a:Lvf0;

    .line 11
    .line 12
    const/16 v0, 0x18

    .line 13
    .line 14
    invoke-direct {p2, p1, v0}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/16 v1, 0x10

    .line 19
    .line 20
    invoke-direct {p2, p1, v1}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/16 v2, 0x8

    .line 25
    .line 26
    invoke-direct {p2, p1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    invoke-direct {p2, p1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-virtual {p0, v0, v1, v3, p1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 35
    .line 36
    .line 37
    return-object p0
.end method

.method private static final u2(Landroid/content/Context;IIILandroid/content/SharedPreferences;)Lna1;
    .locals 6

    .line 1
    sget-object v0, Lvf0;->a:Lvf0;

    .line 2
    .line 3
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-object v1, p0

    .line 7
    move v2, p1

    .line 8
    move v3, p2

    .line 9
    move v4, p3

    .line 10
    move-object v5, p4

    .line 11
    invoke-direct/range {v0 .. v5}, Lvf0;->v3(Landroid/content/Context;IIILandroid/content/SharedPreferences;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lna1;->a:Lna1;

    .line 15
    .line 16
    return-object p0
.end method

.method private static final u3(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic v(Landroid/content/Context;Landroid/content/SharedPreferences;IIIILandroid/widget/LinearLayout;)Lna1;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lvf0;->h2(Landroid/content/Context;Landroid/content/SharedPreferences;IIIILandroid/widget/LinearLayout;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic v0(Landroid/content/Context;Lxt0;Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lvf0;->R2(Landroid/content/Context;Lxt0;Landroid/app/Dialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final v1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIILhw;)Landroid/view/View;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "IIIII",
            "Lhw;",
            ")",
            "Landroid/view/View;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 8
    .line 9
    .line 10
    const/16 v2, 0x10

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 13
    .line 14
    .line 15
    sget-object v2, Lvf0;->a:Lvf0;

    .line 16
    .line 17
    const/4 v3, 0x4

    .line 18
    invoke-direct {v2, p1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    invoke-direct {v2, p1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    invoke-direct {v2, p1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    invoke-direct {v2, p1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    invoke-virtual {v0, v4, v5, v6, v7}, Landroid/view/View;->setPadding(IIII)V

    .line 35
    .line 36
    .line 37
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 38
    .line 39
    const/4 v5, -0x1

    .line 40
    const/4 v6, -0x2

    .line 41
    invoke-direct {v4, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 42
    .line 43
    .line 44
    const/16 v5, 0x8

    .line 45
    .line 46
    invoke-direct {v2, p1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    invoke-virtual {v4, v1, v1, v1, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 54
    .line 55
    .line 56
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    .line 57
    .line 58
    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v4, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 62
    .line 63
    .line 64
    const/16 v7, 0xc

    .line 65
    .line 66
    invoke-direct {v2, p1, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    int-to-float v8, v8

    .line 71
    invoke-virtual {v4, v8}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 72
    .line 73
    .line 74
    move/from16 v8, p7

    .line 75
    .line 76
    invoke-virtual {v4, v8}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 77
    .line 78
    .line 79
    const/4 v8, 0x1

    .line 80
    invoke-direct {v2, p1, v8}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 81
    .line 82
    .line 83
    move-result v9

    .line 84
    move/from16 v10, p8

    .line 85
    .line 86
    invoke-virtual {v4, v9, v10}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 90
    .line 91
    .line 92
    new-instance v4, Landroid/widget/TextView;

    .line 93
    .line 94
    invoke-direct {v4, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 95
    .line 96
    .line 97
    move-object/from16 v9, p2

    .line 98
    .line 99
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 100
    .line 101
    .line 102
    const/high16 v9, 0x41b00000    # 22.0f

    .line 103
    .line 104
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 105
    .line 106
    .line 107
    const/16 v9, 0x11

    .line 108
    .line 109
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setGravity(I)V

    .line 110
    .line 111
    .line 112
    invoke-direct {v2, p1, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    const/16 v10, 0xa

    .line 117
    .line 118
    invoke-direct {v2, p1, v10}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 119
    .line 120
    .line 121
    move-result v11

    .line 122
    invoke-direct {v2, p1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 123
    .line 124
    .line 125
    move-result v12

    .line 126
    invoke-direct {v2, p1, v10}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 127
    .line 128
    .line 129
    move-result v13

    .line 130
    invoke-virtual {v4, v7, v11, v12, v13}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 134
    .line 135
    .line 136
    new-instance v4, Landroid/widget/LinearLayout;

    .line 137
    .line 138
    invoke-direct {v4, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v4, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 142
    .line 143
    .line 144
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 145
    .line 146
    const/high16 v8, 0x3f800000    # 1.0f

    .line 147
    .line 148
    invoke-direct {v7, v1, v6, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v4, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 152
    .line 153
    .line 154
    invoke-direct {v2, p1, v10}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 155
    .line 156
    .line 157
    move-result v6

    .line 158
    invoke-direct {v2, p1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    invoke-direct {v2, p1, v10}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 163
    .line 164
    .line 165
    move-result v7

    .line 166
    invoke-virtual {v4, v1, v6, v5, v7}, Landroid/view/View;->setPadding(IIII)V

    .line 167
    .line 168
    .line 169
    new-instance v5, Landroid/widget/TextView;

    .line 170
    .line 171
    invoke-direct {v5, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 172
    .line 173
    .line 174
    move-object/from16 v6, p3

    .line 175
    .line 176
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 177
    .line 178
    .line 179
    const/high16 v6, 0x41700000    # 15.0f

    .line 180
    .line 181
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextSize(F)V

    .line 182
    .line 183
    .line 184
    move/from16 v6, p5

    .line 185
    .line 186
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 190
    .line 191
    .line 192
    const/high16 v5, 0x41400000    # 12.0f

    .line 193
    .line 194
    move-object/from16 v6, p4

    .line 195
    .line 196
    move/from16 v7, p6

    .line 197
    .line 198
    invoke-static {p1, v6, v5, v7}, Lt1;->i(Landroid/content/Context;Ljava/lang/String;FI)Landroid/widget/TextView;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    const/4 v6, 0x2

    .line 203
    invoke-direct {v2, p1, v6}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    invoke-virtual {v5, v1, v6, v1, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 214
    .line 215
    .line 216
    new-instance v1, Landroid/widget/TextView;

    .line 217
    .line 218
    invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 219
    .line 220
    .line 221
    const-string v4, "\u203a"

    .line 222
    .line 223
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 224
    .line 225
    .line 226
    const/high16 v4, 0x41c00000    # 24.0f

    .line 227
    .line 228
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 229
    .line 230
    .line 231
    move/from16 v4, p9

    .line 232
    .line 233
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setGravity(I)V

    .line 237
    .line 238
    .line 239
    invoke-direct {v2, p1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    invoke-direct {v2, p1, v10}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 244
    .line 245
    .line 246
    move-result v4

    .line 247
    invoke-direct {v2, p1, v10}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 248
    .line 249
    .line 250
    move-result v5

    .line 251
    invoke-direct {v2, p1, v10}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 252
    .line 253
    .line 254
    move-result p0

    .line 255
    invoke-virtual {v1, v3, v4, v5, p0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 259
    .line 260
    .line 261
    new-instance p0, Ld00;

    .line 262
    .line 263
    const/4 v1, 0x5

    .line 264
    move-object/from16 v2, p10

    .line 265
    .line 266
    invoke-direct {p0, v1, v2}, Ld00;-><init>(ILhw;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 270
    .line 271
    .line 272
    return-object v0
.end method

.method private static final v2(Landroid/content/Context;IIILandroid/widget/LinearLayout;)Lna1;
    .locals 8

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lvf0;->a:Lvf0;

    .line 5
    .line 6
    new-instance v7, Lze0;

    .line 7
    .line 8
    invoke-direct {v7, p1, p0, p2, p3}, Lze0;-><init>(ILandroid/content/Context;II)V

    .line 9
    .line 10
    .line 11
    const-string v2, "\ud83d\udce6"

    .line 12
    .line 13
    const-string v3, "\u5e95\u90e8\u5bfc\u822a\u680f"

    .line 14
    .line 15
    const-string v4, "\u81ea\u5b9a\u4e49\u9009\u62e9\u9690\u85cf\u54ea\u4e9b\u5e95\u90e8\u5bfc\u822a\u680f\u6309\u94ae\uff0c\u4fee\u6539\u7acb\u5373\u751f\u6548"

    .line 16
    .line 17
    move-object v1, p0

    .line 18
    move v5, p1

    .line 19
    move v6, p2

    .line 20
    invoke-direct/range {v0 .. v7}, Lvf0;->h1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILhw;)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p4, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lna1;->a:Lna1;

    .line 28
    .line 29
    return-object p0
.end method

.method private final v3(Landroid/content/Context;IIILandroid/content/SharedPreferences;)V
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move/from16 v6, p2

    .line 6
    .line 7
    move-object/from16 v11, p5

    .line 8
    .line 9
    new-instance v12, Lvf0$k;

    .line 10
    .line 11
    sget-object v1, Lm00;->S:Lm00$a;

    .line 12
    .line 13
    invoke-virtual {v1}, Lm00$a;->q()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v14

    .line 17
    const-string v16, "\u6dfb\u52a0\u597d\u53cb"

    .line 18
    .line 19
    const-string v17, "\ud83d\udc64"

    .line 20
    .line 21
    const-string v13, "discover_friends"

    .line 22
    .line 23
    const/4 v15, 0x0

    .line 24
    invoke-direct/range {v12 .. v17}, Lvf0$k;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    new-instance v13, Lvf0$k;

    .line 28
    .line 29
    invoke-virtual {v1}, Lm00$a;->t()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v15

    .line 33
    const-string v17, "\u521b\u4f5c\u8005\u4e2d\u5fc3"

    .line 34
    .line 35
    const-string v18, "\ud83c\udfa8"

    .line 36
    .line 37
    const-string v14, "creator_center"

    .line 38
    .line 39
    const/16 v16, 0x0

    .line 40
    .line 41
    invoke-direct/range {v13 .. v18}, Lvf0$k;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    new-instance v14, Lvf0$k;

    .line 45
    .line 46
    invoke-virtual {v1}, Lm00$a;->z()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v16

    .line 50
    const-string v18, "\u6211\u7684\u8349\u7a3f"

    .line 51
    .line 52
    const-string v19, "\ud83d\udcdd"

    .line 53
    .line 54
    const-string v15, "draft"

    .line 55
    .line 56
    const/16 v17, 0x0

    .line 57
    .line 58
    invoke-direct/range {v14 .. v19}, Lvf0$k;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    new-instance v15, Lvf0$k;

    .line 62
    .line 63
    invoke-virtual {v1}, Lm00$a;->A()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v17

    .line 67
    const-string v19, "\u6211\u7684\u6d3b\u52a8"

    .line 68
    .line 69
    const-string v20, "\ud83c\udf9f\ufe0f"

    .line 70
    .line 71
    const-string v16, "my_events"

    .line 72
    .line 73
    const/16 v18, 0x0

    .line 74
    .line 75
    invoke-direct/range {v15 .. v20}, Lvf0$k;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    new-instance v16, Lvf0$k;

    .line 79
    .line 80
    invoke-virtual {v1}, Lm00$a;->v()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v18

    .line 84
    const-string v20, "\u6d4f\u89c8\u8bb0\u5f55"

    .line 85
    .line 86
    const-string v21, "\ud83d\udcd6"

    .line 87
    .line 88
    const-string v17, "history"

    .line 89
    .line 90
    const/16 v19, 0x0

    .line 91
    .line 92
    invoke-direct/range {v16 .. v21}, Lvf0$k;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    new-instance v17, Lvf0$k;

    .line 96
    .line 97
    invoke-virtual {v1}, Lm00$a;->y()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v19

    .line 101
    const-string v21, "\u6211\u7684\u4e0b\u8f7d"

    .line 102
    .line 103
    const-string v22, "\u2b07\ufe0f"

    .line 104
    .line 105
    const-string v18, "download"

    .line 106
    .line 107
    const/16 v20, 0x0

    .line 108
    .line 109
    invoke-direct/range {v17 .. v22}, Lvf0$k;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    new-instance v18, Lvf0$k;

    .line 113
    .line 114
    invoke-virtual {v1}, Lm00$a;->D()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v20

    .line 118
    const-string v22, "\u8ba2\u5355"

    .line 119
    .line 120
    const-string v23, "\ud83d\udce6"

    .line 121
    .line 122
    const-string v19, "order"

    .line 123
    .line 124
    const/16 v21, 0x0

    .line 125
    .line 126
    invoke-direct/range {v18 .. v23}, Lvf0$k;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    new-instance v19, Lvf0$k;

    .line 130
    .line 131
    invoke-virtual {v1}, Lm00$a;->r()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v21

    .line 135
    const-string v23, "\u8d2d\u7269\u8f66"

    .line 136
    .line 137
    const-string v24, "\ud83d\uded2"

    .line 138
    .line 139
    const-string v20, "cart"

    .line 140
    .line 141
    const/16 v22, 0x0

    .line 142
    .line 143
    invoke-direct/range {v19 .. v24}, Lvf0$k;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    new-instance v20, Lvf0$k;

    .line 147
    .line 148
    invoke-virtual {v1}, Lm00$a;->G()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v22

    .line 152
    const-string v24, "\u94b1\u5305"

    .line 153
    .line 154
    const-string v25, "\ud83d\udcb0"

    .line 155
    .line 156
    const-string v21, "wallet"

    .line 157
    .line 158
    const/16 v23, 0x0

    .line 159
    .line 160
    invoke-direct/range {v20 .. v25}, Lvf0$k;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    new-instance v21, Lvf0$k;

    .line 164
    .line 165
    invoke-virtual {v1}, Lm00$a;->w()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v23

    .line 169
    const-string v25, "\u5c0f\u7a0b\u5e8f"

    .line 170
    .line 171
    const-string v26, "\ud83d\udcf1"

    .line 172
    .line 173
    const-string v22, "applets"

    .line 174
    .line 175
    const/16 v24, 0x0

    .line 176
    .line 177
    invoke-direct/range {v21 .. v26}, Lvf0$k;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    new-instance v22, Lvf0$k;

    .line 181
    .line 182
    invoke-virtual {v1}, Lm00$a;->x()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v24

    .line 186
    const-string v26, "\u77ac\u95f4"

    .line 187
    .line 188
    const-string v27, "\u2728"

    .line 189
    .line 190
    const-string v23, "hey_post"

    .line 191
    .line 192
    const/16 v25, 0x0

    .line 193
    .line 194
    invoke-direct/range {v22 .. v27}, Lvf0$k;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    new-instance v23, Lvf0$k;

    .line 198
    .line 199
    invoke-virtual {v1}, Lm00$a;->s()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v25

    .line 203
    const-string v27, "\u793e\u533a\u516c\u7ea6"

    .line 204
    .line 205
    const-string v28, "\ud83d\udcdc"

    .line 206
    .line 207
    const-string v24, "community_rule"

    .line 208
    .line 209
    const/16 v26, 0x0

    .line 210
    .line 211
    invoke-direct/range {v23 .. v28}, Lvf0$k;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    new-instance v24, Lvf0$k;

    .line 215
    .line 216
    invoke-virtual {v1}, Lm00$a;->E()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v26

    .line 220
    const-string v28, "\u626b\u4e00\u626b"

    .line 221
    .line 222
    const-string v29, "\ud83d\udcf7"

    .line 223
    .line 224
    const-string v25, "scan"

    .line 225
    .line 226
    const/16 v27, 0x0

    .line 227
    .line 228
    invoke-direct/range {v24 .. v29}, Lvf0$k;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    new-instance v25, Lvf0$k;

    .line 232
    .line 233
    invoke-virtual {v1}, Lm00$a;->u()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v27

    .line 237
    const-string v29, "\u5e2e\u52a9\u4e0e\u5ba2\u670d"

    .line 238
    .line 239
    const-string v30, "\u2753"

    .line 240
    .line 241
    const-string v26, "help_center"

    .line 242
    .line 243
    const/16 v28, 0x0

    .line 244
    .line 245
    invoke-direct/range {v25 .. v30}, Lvf0$k;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    new-instance v26, Lvf0$k;

    .line 249
    .line 250
    invoke-virtual {v1}, Lm00$a;->F()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v28

    .line 254
    const-string v30, "\u8bbe\u7f6e"

    .line 255
    .line 256
    const-string v31, "\u2699\ufe0f"

    .line 257
    .line 258
    const-string v27, "setting"

    .line 259
    .line 260
    const/16 v29, 0x0

    .line 261
    .line 262
    invoke-direct/range {v26 .. v31}, Lvf0$k;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    filled-new-array/range {v12 .. v26}, [Lvf0$k;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    invoke-static {v3}, Lo30;->w([Ljava/lang/Object;)Ljava/util/List;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    new-instance v12, Landroid/app/Dialog;

    .line 274
    .line 275
    invoke-direct {v12, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 276
    .line 277
    .line 278
    invoke-direct/range {p0 .. p1}, Lvf0;->f1(Landroid/content/Context;)Z

    .line 279
    .line 280
    .line 281
    move-result v13

    .line 282
    const/16 v14, 0xff

    .line 283
    .line 284
    const/16 v15, 0x1c

    .line 285
    .line 286
    if-eqz v13, :cond_0

    .line 287
    .line 288
    const/16 v4, 0x16

    .line 289
    .line 290
    invoke-static {v14, v4, v4, v15}, Landroid/graphics/Color;->argb(IIII)I

    .line 291
    .line 292
    .line 293
    move-result v4

    .line 294
    goto :goto_0

    .line 295
    :cond_0
    const/16 v4, 0xfc

    .line 296
    .line 297
    const/16 v5, 0xf8

    .line 298
    .line 299
    invoke-static {v14, v5, v5, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 300
    .line 301
    .line 302
    move-result v4

    .line 303
    :goto_0
    new-instance v5, Landroid/widget/LinearLayout;

    .line 304
    .line 305
    invoke-direct {v5, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 306
    .line 307
    .line 308
    const/4 v7, 0x1

    .line 309
    invoke-virtual {v5, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v5, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 313
    .line 314
    .line 315
    new-instance v8, Landroid/widget/ScrollView;

    .line 316
    .line 317
    invoke-direct {v8, v2}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 318
    .line 319
    .line 320
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 321
    .line 322
    const/4 v10, -0x1

    .line 323
    const/4 v15, 0x0

    .line 324
    const/high16 v14, 0x3f800000    # 1.0f

    .line 325
    .line 326
    invoke-direct {v9, v10, v15, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v8, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v8, v7}, Landroid/widget/ScrollView;->setFillViewport(Z)V

    .line 333
    .line 334
    .line 335
    new-instance v9, Landroid/widget/LinearLayout;

    .line 336
    .line 337
    invoke-direct {v9, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v9, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 341
    .line 342
    .line 343
    sget-object v7, Lvf0;->a:Lvf0;

    .line 344
    .line 345
    const/16 v14, 0x10

    .line 346
    .line 347
    invoke-direct {v7, v2, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 348
    .line 349
    .line 350
    move-result v10

    .line 351
    invoke-direct {v7, v2, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 352
    .line 353
    .line 354
    move-result v15

    .line 355
    move-object/from16 v22, v3

    .line 356
    .line 357
    invoke-direct {v7, v2, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 358
    .line 359
    .line 360
    move-result v3

    .line 361
    const/16 v14, 0x8

    .line 362
    .line 363
    move-object/from16 v24, v5

    .line 364
    .line 365
    invoke-direct {v7, v2, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 366
    .line 367
    .line 368
    move-result v5

    .line 369
    invoke-virtual {v9, v10, v15, v3, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v9, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 373
    .line 374
    .line 375
    new-instance v3, Landroid/widget/LinearLayout;

    .line 376
    .line 377
    invoke-direct {v3, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 378
    .line 379
    .line 380
    const/4 v4, 0x0

    .line 381
    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 382
    .line 383
    .line 384
    const/16 v4, 0x10

    .line 385
    .line 386
    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 387
    .line 388
    .line 389
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 390
    .line 391
    const/4 v15, -0x2

    .line 392
    const/4 v5, -0x1

    .line 393
    invoke-direct {v4, v5, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 397
    .line 398
    .line 399
    new-instance v4, Landroid/widget/TextView;

    .line 400
    .line 401
    invoke-direct {v4, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 402
    .line 403
    .line 404
    const-string v5, "\u4fa7\u8fb9\u680f\u9009\u9879"

    .line 405
    .line 406
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 407
    .line 408
    .line 409
    const/high16 v5, 0x41900000    # 18.0f

    .line 410
    .line 411
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 415
    .line 416
    .line 417
    sget-object v5, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 418
    .line 419
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 420
    .line 421
    .line 422
    invoke-direct {v7, v2, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 423
    .line 424
    .line 425
    move-result v5

    .line 426
    const/16 v10, 0x10

    .line 427
    .line 428
    invoke-direct {v7, v2, v10}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 429
    .line 430
    .line 431
    move-result v14

    .line 432
    const/4 v15, 0x0

    .line 433
    invoke-virtual {v4, v15, v5, v15, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v9, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 440
    .line 441
    .line 442
    new-instance v3, Lvt0;

    .line 443
    .line 444
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v1, v2}, Lm00$a;->h0(Landroid/content/Context;)Z

    .line 448
    .line 449
    .line 450
    move-result v1

    .line 451
    iput-boolean v1, v3, Lvt0;->d:Z

    .line 452
    .line 453
    new-instance v1, Landroid/widget/LinearLayout;

    .line 454
    .line 455
    invoke-direct {v1, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v1, v15}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v1, v10}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 462
    .line 463
    .line 464
    const/4 v4, 0x4

    .line 465
    invoke-direct {v7, v2, v4}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 466
    .line 467
    .line 468
    move-result v5

    .line 469
    invoke-direct {v7, v2, v4}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 470
    .line 471
    .line 472
    move-result v10

    .line 473
    invoke-direct {v7, v2, v4}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 474
    .line 475
    .line 476
    move-result v14

    .line 477
    invoke-direct {v7, v2, v4}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 478
    .line 479
    .line 480
    move-result v4

    .line 481
    invoke-virtual {v1, v5, v10, v14, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 482
    .line 483
    .line 484
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 485
    .line 486
    const/4 v5, -0x2

    .line 487
    const/4 v10, -0x1

    .line 488
    invoke-direct {v4, v10, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 489
    .line 490
    .line 491
    const/16 v5, 0xa

    .line 492
    .line 493
    invoke-direct {v7, v2, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 494
    .line 495
    .line 496
    move-result v14

    .line 497
    const/4 v15, 0x0

    .line 498
    invoke-virtual {v4, v15, v15, v15, v14}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v1, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 502
    .line 503
    .line 504
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    .line 505
    .line 506
    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v4, v15}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 510
    .line 511
    .line 512
    const/16 v14, 0xc

    .line 513
    .line 514
    invoke-direct {v7, v2, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 515
    .line 516
    .line 517
    move-result v15

    .line 518
    int-to-float v15, v15

    .line 519
    invoke-virtual {v4, v15}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 520
    .line 521
    .line 522
    move/from16 v15, p4

    .line 523
    .line 524
    invoke-virtual {v4, v15}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v1, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 528
    .line 529
    .line 530
    const-string v4, "\u542f\u7528\u9690\u85cf"

    .line 531
    .line 532
    const/high16 v10, 0x41700000    # 15.0f

    .line 533
    .line 534
    invoke-static {v2, v4, v10, v6}, Lt1;->i(Landroid/content/Context;Ljava/lang/String;FI)Landroid/widget/TextView;

    .line 535
    .line 536
    .line 537
    move-result-object v4

    .line 538
    invoke-direct {v7, v2, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 539
    .line 540
    .line 541
    move-result v10

    .line 542
    invoke-direct {v7, v2, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 543
    .line 544
    .line 545
    move-result v14

    .line 546
    move-object/from16 v28, v8

    .line 547
    .line 548
    const/16 v6, 0x8

    .line 549
    .line 550
    invoke-direct {v7, v2, v6}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 551
    .line 552
    .line 553
    move-result v8

    .line 554
    invoke-direct {v7, v2, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 555
    .line 556
    .line 557
    move-result v5

    .line 558
    invoke-virtual {v4, v10, v14, v8, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 559
    .line 560
    .line 561
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 562
    .line 563
    const/high16 v8, 0x3f800000    # 1.0f

    .line 564
    .line 565
    const/4 v10, -0x2

    .line 566
    const/4 v14, 0x0

    .line 567
    invoke-direct {v5, v14, v10, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 574
    .line 575
    .line 576
    new-instance v4, Landroid/widget/TextView;

    .line 577
    .line 578
    invoke-direct {v4, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 579
    .line 580
    .line 581
    const/16 v5, 0xe

    .line 582
    .line 583
    invoke-direct {v7, v2, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 584
    .line 585
    .line 586
    move-result v8

    .line 587
    invoke-direct {v7, v2, v6}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 588
    .line 589
    .line 590
    move-result v10

    .line 591
    invoke-direct {v7, v2, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 592
    .line 593
    .line 594
    move-result v5

    .line 595
    invoke-direct {v7, v2, v6}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 596
    .line 597
    .line 598
    move-result v14

    .line 599
    invoke-virtual {v4, v8, v10, v5, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 600
    .line 601
    .line 602
    const/16 v14, 0x11

    .line 603
    .line 604
    invoke-virtual {v4, v14}, Landroid/widget/TextView;->setGravity(I)V

    .line 605
    .line 606
    .line 607
    const/high16 v5, 0x41500000    # 13.0f

    .line 608
    .line 609
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 610
    .line 611
    .line 612
    iget-boolean v5, v3, Lvt0;->d:Z

    .line 613
    .line 614
    invoke-direct {v7, v2, v4, v5}, Lvf0;->G3(Landroid/content/Context;Landroid/widget/TextView;Z)V

    .line 615
    .line 616
    .line 617
    iget-boolean v5, v3, Lvt0;->d:Z

    .line 618
    .line 619
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 620
    .line 621
    .line 622
    move-result-object v5

    .line 623
    invoke-virtual {v4, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 624
    .line 625
    .line 626
    new-instance v5, Lxe0;

    .line 627
    .line 628
    const/4 v6, 0x1

    .line 629
    invoke-direct {v5, v2, v3, v11, v6}, Lxe0;-><init>(Landroid/content/Context;Lvt0;Landroid/content/SharedPreferences;I)V

    .line 630
    .line 631
    .line 632
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 633
    .line 634
    .line 635
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 636
    .line 637
    .line 638
    invoke-virtual {v9, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 639
    .line 640
    .line 641
    const/4 v1, 0x2

    .line 642
    invoke-direct {v0, v2, v1}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 643
    .line 644
    .line 645
    move-result v1

    .line 646
    invoke-direct {v0, v2, v9, v1}, Lvf0;->Z0(Landroid/content/Context;Landroid/widget/LinearLayout;I)V

    .line 647
    .line 648
    .line 649
    invoke-interface/range {v22 .. v22}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 650
    .line 651
    .line 652
    move-result-object v18

    .line 653
    :goto_1
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    .line 654
    .line 655
    .line 656
    move-result v1

    .line 657
    if-eqz v1, :cond_1

    .line 658
    .line 659
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v1

    .line 663
    check-cast v1, Lvf0$k;

    .line 664
    .line 665
    invoke-virtual {v1}, Lvf0$k;->k()Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v3

    .line 669
    invoke-virtual {v1}, Lvf0$k;->h()Z

    .line 670
    .line 671
    .line 672
    move-result v4

    .line 673
    invoke-interface {v11, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 674
    .line 675
    .line 676
    move-result v3

    .line 677
    sget-object v4, Lvf0;->a:Lvf0;

    .line 678
    .line 679
    move-object v5, v9

    .line 680
    move v9, v3

    .line 681
    invoke-virtual {v1}, Lvf0$k;->j()Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object v3

    .line 685
    move-object v6, v4

    .line 686
    invoke-virtual {v1}, Lvf0$k;->i()Ljava/lang/String;

    .line 687
    .line 688
    .line 689
    move-result-object v4

    .line 690
    invoke-virtual {v1}, Lvf0$k;->i()Ljava/lang/String;

    .line 691
    .line 692
    .line 693
    move-result-object v7

    .line 694
    new-instance v8, Ljava/lang/StringBuilder;

    .line 695
    .line 696
    const-string v10, "\u4fa7\u8fb9\u680f\u4e2d\u7684"

    .line 697
    .line 698
    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 699
    .line 700
    .line 701
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 702
    .line 703
    .line 704
    const-string v7, "\u9009\u9879"

    .line 705
    .line 706
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 707
    .line 708
    .line 709
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v7

    .line 713
    new-instance v10, Lc;

    .line 714
    .line 715
    const/16 v8, 0xd

    .line 716
    .line 717
    invoke-direct {v10, v8, v11, v1}, Lc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 718
    .line 719
    .line 720
    move-object v14, v5

    .line 721
    move-object v1, v6

    .line 722
    move-object v5, v7

    .line 723
    move v8, v15

    .line 724
    move-object/from16 v32, v24

    .line 725
    .line 726
    move-object/from16 v33, v28

    .line 727
    .line 728
    const/4 v15, -0x1

    .line 729
    move/from16 v6, p2

    .line 730
    .line 731
    move/from16 v7, p3

    .line 732
    .line 733
    invoke-direct/range {v1 .. v10}, Lvf0;->x1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIZLsw;)Landroid/view/View;

    .line 734
    .line 735
    .line 736
    move-result-object v1

    .line 737
    invoke-virtual {v14, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 738
    .line 739
    .line 740
    move/from16 v15, p4

    .line 741
    .line 742
    move-object v9, v14

    .line 743
    const/16 v14, 0x11

    .line 744
    .line 745
    goto :goto_1

    .line 746
    :cond_1
    move-object v14, v9

    .line 747
    move-object/from16 v32, v24

    .line 748
    .line 749
    move-object/from16 v33, v28

    .line 750
    .line 751
    const/4 v15, -0x1

    .line 752
    new-instance v1, Landroid/widget/LinearLayout;

    .line 753
    .line 754
    invoke-direct {v1, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 755
    .line 756
    .line 757
    const/4 v4, 0x0

    .line 758
    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 759
    .line 760
    .line 761
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 762
    .line 763
    const/4 v10, -0x2

    .line 764
    invoke-direct {v3, v15, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 765
    .line 766
    .line 767
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 768
    .line 769
    .line 770
    const/16 v3, 0x8c

    .line 771
    .line 772
    const/16 v4, 0x50

    .line 773
    .line 774
    if-eqz v13, :cond_2

    .line 775
    .line 776
    const/16 v5, 0x5a

    .line 777
    .line 778
    invoke-static {v3, v4, v4, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 779
    .line 780
    .line 781
    move-result v3

    .line 782
    goto :goto_2

    .line 783
    :cond_2
    const/16 v5, 0xd2

    .line 784
    .line 785
    const/16 v6, 0xc8

    .line 786
    .line 787
    invoke-static {v3, v6, v6, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 788
    .line 789
    .line 790
    move-result v3

    .line 791
    :goto_2
    if-eqz v13, :cond_3

    .line 792
    .line 793
    move v10, v15

    .line 794
    goto :goto_3

    .line 795
    :cond_3
    const/16 v5, 0x3c

    .line 796
    .line 797
    const/16 v6, 0x32

    .line 798
    .line 799
    const/16 v7, 0xff

    .line 800
    .line 801
    invoke-static {v7, v6, v6, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 802
    .line 803
    .line 804
    move-result v10

    .line 805
    :goto_3
    const-string v5, "\u53d6\u6d88"

    .line 806
    .line 807
    const/high16 v6, 0x41600000    # 14.0f

    .line 808
    .line 809
    const/16 v7, 0x11

    .line 810
    .line 811
    invoke-static {v2, v5, v6, v10, v7}, Lt1;->j(Landroid/content/Context;Ljava/lang/String;FII)Landroid/widget/TextView;

    .line 812
    .line 813
    .line 814
    move-result-object v5

    .line 815
    const/4 v7, 0x0

    .line 816
    invoke-static {v7}, Lt1;->h(I)Landroid/graphics/drawable/GradientDrawable;

    .line 817
    .line 818
    .line 819
    move-result-object v8

    .line 820
    sget-object v9, Lvf0;->a:Lvf0;

    .line 821
    .line 822
    const/16 v10, 0x1c

    .line 823
    .line 824
    invoke-direct {v9, v2, v10}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 825
    .line 826
    .line 827
    move-result v11

    .line 828
    int-to-float v10, v11

    .line 829
    invoke-virtual {v8, v10}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 830
    .line 831
    .line 832
    invoke-virtual {v8, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 833
    .line 834
    .line 835
    invoke-virtual {v5, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 836
    .line 837
    .line 838
    const/16 v3, 0xc

    .line 839
    .line 840
    invoke-direct {v9, v2, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 841
    .line 842
    .line 843
    move-result v8

    .line 844
    invoke-direct {v9, v2, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 845
    .line 846
    .line 847
    move-result v10

    .line 848
    invoke-virtual {v5, v7, v8, v7, v10}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 849
    .line 850
    .line 851
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 852
    .line 853
    const/high16 v8, 0x3f800000    # 1.0f

    .line 854
    .line 855
    const/4 v10, -0x2

    .line 856
    invoke-direct {v3, v7, v10, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 857
    .line 858
    .line 859
    const/4 v8, 0x6

    .line 860
    invoke-direct {v9, v2, v8}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 861
    .line 862
    .line 863
    move-result v10

    .line 864
    invoke-virtual {v3, v7, v7, v10, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 865
    .line 866
    .line 867
    invoke-virtual {v5, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 868
    .line 869
    .line 870
    new-instance v3, Luy;

    .line 871
    .line 872
    const/4 v10, 0x7

    .line 873
    invoke-direct {v3, v12, v10}, Luy;-><init>(Landroid/app/Dialog;I)V

    .line 874
    .line 875
    .line 876
    invoke-virtual {v5, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 877
    .line 878
    .line 879
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 880
    .line 881
    .line 882
    const-string v3, "\u4fdd\u5b58"

    .line 883
    .line 884
    const/16 v5, 0x11

    .line 885
    .line 886
    invoke-static {v2, v3, v6, v15, v5}, Lt1;->j(Landroid/content/Context;Ljava/lang/String;FII)Landroid/widget/TextView;

    .line 887
    .line 888
    .line 889
    move-result-object v3

    .line 890
    invoke-static {v7}, Lt1;->h(I)Landroid/graphics/drawable/GradientDrawable;

    .line 891
    .line 892
    .line 893
    move-result-object v5

    .line 894
    const/16 v10, 0x1c

    .line 895
    .line 896
    invoke-direct {v9, v2, v10}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 897
    .line 898
    .line 899
    move-result v6

    .line 900
    int-to-float v6, v6

    .line 901
    invoke-virtual {v5, v6}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 902
    .line 903
    .line 904
    const/16 v6, 0xdc

    .line 905
    .line 906
    const/16 v10, 0xb4

    .line 907
    .line 908
    invoke-static {v6, v7, v10, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 909
    .line 910
    .line 911
    move-result v4

    .line 912
    invoke-virtual {v5, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 913
    .line 914
    .line 915
    invoke-virtual {v3, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 916
    .line 917
    .line 918
    const/16 v4, 0xc

    .line 919
    .line 920
    invoke-direct {v9, v2, v4}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 921
    .line 922
    .line 923
    move-result v5

    .line 924
    invoke-direct {v9, v2, v4}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 925
    .line 926
    .line 927
    move-result v4

    .line 928
    invoke-virtual {v3, v7, v5, v7, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 929
    .line 930
    .line 931
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 932
    .line 933
    const/high16 v5, 0x3f800000    # 1.0f

    .line 934
    .line 935
    const/4 v10, -0x2

    .line 936
    invoke-direct {v4, v7, v10, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 937
    .line 938
    .line 939
    invoke-direct {v9, v2, v8}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 940
    .line 941
    .line 942
    move-result v5

    .line 943
    invoke-virtual {v4, v5, v7, v7, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 944
    .line 945
    .line 946
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 947
    .line 948
    .line 949
    new-instance v4, Luy;

    .line 950
    .line 951
    const/16 v6, 0x8

    .line 952
    .line 953
    invoke-direct {v4, v12, v6}, Luy;-><init>(Landroid/app/Dialog;I)V

    .line 954
    .line 955
    .line 956
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 957
    .line 958
    .line 959
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 960
    .line 961
    .line 962
    const/16 v10, 0x10

    .line 963
    .line 964
    invoke-direct {v0, v2, v10}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 965
    .line 966
    .line 967
    move-result v3

    .line 968
    invoke-direct {v0, v2, v6}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 969
    .line 970
    .line 971
    move-result v4

    .line 972
    invoke-direct {v0, v2, v10}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 973
    .line 974
    .line 975
    move-result v5

    .line 976
    invoke-direct {v0, v2, v10}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 977
    .line 978
    .line 979
    move-result v6

    .line 980
    invoke-virtual {v1, v3, v4, v5, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 981
    .line 982
    .line 983
    move-object/from16 v3, v33

    .line 984
    .line 985
    invoke-virtual {v3, v14}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 986
    .line 987
    .line 988
    move-object/from16 v4, v32

    .line 989
    .line 990
    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 991
    .line 992
    .line 993
    invoke-virtual {v4, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 994
    .line 995
    .line 996
    invoke-virtual {v12, v4}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 997
    .line 998
    .line 999
    invoke-virtual {v12}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v1

    .line 1003
    if-eqz v1, :cond_4

    .line 1004
    .line 1005
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v3

    .line 1009
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v3

    .line 1013
    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 1014
    .line 1015
    int-to-double v3, v3

    .line 1016
    const-wide v5, 0x3feb333333333333L    # 0.85

    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    mul-double/2addr v3, v5

    .line 1022
    double-to-int v3, v3

    .line 1023
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v4

    .line 1027
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v4

    .line 1031
    iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 1032
    .line 1033
    int-to-double v4, v4

    .line 1034
    const-wide v6, 0x3fe6666666666666L    # 0.7

    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    mul-double/2addr v4, v6

    .line 1040
    double-to-int v4, v4

    .line 1041
    invoke-virtual {v1, v3, v4}, Landroid/view/Window;->setLayout(II)V

    .line 1042
    .line 1043
    .line 1044
    :cond_4
    invoke-virtual {v12}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v1

    .line 1048
    if-eqz v1, :cond_5

    .line 1049
    .line 1050
    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    .line 1051
    .line 1052
    const/4 v15, 0x0

    .line 1053
    invoke-direct {v3, v15}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 1054
    .line 1055
    .line 1056
    invoke-virtual {v1, v3}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1057
    .line 1058
    .line 1059
    :cond_5
    invoke-virtual {v12}, Landroid/app/Dialog;->show()V

    .line 1060
    .line 1061
    .line 1062
    const/16 v10, 0x1c

    .line 1063
    .line 1064
    invoke-direct {v0, v2, v12, v10}, Lvf0;->z1(Landroid/content/Context;Landroid/app/Dialog;I)V

    .line 1065
    .line 1066
    .line 1067
    return-void
.end method

.method public static synthetic w(Landroid/content/Context;Landroid/widget/TextView;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->S1(Landroid/content/Context;Landroid/widget/TextView;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic w0(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->X2(Landroid/app/Dialog;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final w1(Lhw;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Lhw;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final w2(Landroid/content/Context;III)Lna1;
    .locals 1

    .line 1
    sget-object v0, Lvf0;->a:Lvf0;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, Lvf0;->N2(Landroid/content/Context;III)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lna1;->a:Lna1;

    .line 7
    .line 8
    return-object p0
.end method

.method private static final w3(Landroid/content/Context;Lvt0;Landroid/content/SharedPreferences;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    check-cast v0, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    xor-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p3, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    sget-object v1, Lvf0;->a:Lvf0;

    .line 24
    .line 25
    check-cast p3, Landroid/widget/TextView;

    .line 26
    .line 27
    invoke-direct {v1, p0, p3, v0}, Lvf0;->G3(Landroid/content/Context;Landroid/widget/TextView;Z)V

    .line 28
    .line 29
    .line 30
    iput-boolean v0, p1, Lvt0;->d:Z

    .line 31
    .line 32
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    sget-object p1, Lm00;->S:Lm00$a;

    .line 37
    .line 38
    invoke-virtual {p1}, Lm00$a;->l()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-interface {p0, p1, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public static synthetic x(Landroid/content/Context;IIILjava/lang/String;JLjava/lang/String;Landroid/widget/LinearLayout;)Lna1;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p8}, Lvf0;->C1(Landroid/content/Context;IIILjava/lang/String;JLjava/lang/String;Landroid/widget/LinearLayout;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic x0(Landroid/app/Dialog;Landroid/content/Context;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lvf0;->z2(Landroid/app/Dialog;Landroid/content/Context;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final x1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIZLsw;)Landroid/view/View;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "IIIZ",
            "Lsw;",
            ")",
            "Landroid/view/View;"
        }
    .end annotation

    .line 1
    new-instance p0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 8
    .line 9
    .line 10
    const/16 v1, 0x10

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 13
    .line 14
    .line 15
    sget-object v1, Lvf0;->a:Lvf0;

    .line 16
    .line 17
    const/4 v2, 0x4

    .line 18
    invoke-direct {v1, p1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-direct {v1, p1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    invoke-direct {v1, p1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-direct {v1, p1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-virtual {p0, v3, v4, v5, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 35
    .line 36
    .line 37
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 38
    .line 39
    const/4 v3, -0x1

    .line 40
    const/4 v4, -0x2

    .line 41
    invoke-direct {v2, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 42
    .line 43
    .line 44
    const/16 v3, 0x8

    .line 45
    .line 46
    invoke-direct {v1, p1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    invoke-virtual {v2, v0, v0, v0, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 54
    .line 55
    .line 56
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    .line 57
    .line 58
    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v0}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 62
    .line 63
    .line 64
    const/16 v5, 0xc

    .line 65
    .line 66
    invoke-direct {v1, p1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    int-to-float v6, v6

    .line 71
    invoke-virtual {v2, v6}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 72
    .line 73
    .line 74
    move/from16 v6, p7

    .line 75
    .line 76
    invoke-virtual {v2, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 80
    .line 81
    .line 82
    new-instance v2, Landroid/widget/TextView;

    .line 83
    .line 84
    invoke-direct {v2, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 88
    .line 89
    .line 90
    const/high16 v6, 0x41b00000    # 22.0f

    .line 91
    .line 92
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTextSize(F)V

    .line 93
    .line 94
    .line 95
    const/16 v7, 0x11

    .line 96
    .line 97
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setGravity(I)V

    .line 98
    .line 99
    .line 100
    invoke-direct {v1, p1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    const/16 v8, 0xa

    .line 105
    .line 106
    invoke-direct {v1, p1, v8}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    invoke-direct {v1, p1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 111
    .line 112
    .line 113
    move-result v10

    .line 114
    invoke-direct {v1, p1, v8}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 115
    .line 116
    .line 117
    move-result v11

    .line 118
    invoke-virtual {v2, v5, v9, v10, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 122
    .line 123
    .line 124
    new-instance v2, Landroid/widget/LinearLayout;

    .line 125
    .line 126
    invoke-direct {v2, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 127
    .line 128
    .line 129
    const/4 v5, 0x1

    .line 130
    invoke-virtual {v2, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 131
    .line 132
    .line 133
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 134
    .line 135
    const/high16 v9, 0x3f800000    # 1.0f

    .line 136
    .line 137
    invoke-direct {v5, v0, v4, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 141
    .line 142
    .line 143
    invoke-direct {v1, p1, v8}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    invoke-direct {v1, p1, v3}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    invoke-direct {v1, p1, v8}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    invoke-virtual {v2, v0, v4, v3, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 156
    .line 157
    .line 158
    new-instance v3, Landroid/widget/TextView;

    .line 159
    .line 160
    invoke-direct {v3, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v3, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 164
    .line 165
    .line 166
    const/high16 v4, 0x41700000    # 15.0f

    .line 167
    .line 168
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 169
    .line 170
    .line 171
    move/from16 v4, p5

    .line 172
    .line 173
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 177
    .line 178
    .line 179
    const/high16 v3, 0x41400000    # 12.0f

    .line 180
    .line 181
    move-object/from16 v4, p4

    .line 182
    .line 183
    move/from16 v5, p6

    .line 184
    .line 185
    invoke-static {p1, v4, v3, v5}, Lt1;->i(Landroid/content/Context;Ljava/lang/String;FI)Landroid/widget/TextView;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    const/4 v4, 0x2

    .line 190
    invoke-direct {v1, p1, v4}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 191
    .line 192
    .line 193
    move-result v5

    .line 194
    invoke-virtual {v3, v0, v5, v0, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 201
    .line 202
    .line 203
    new-instance v0, Landroid/widget/TextView;

    .line 204
    .line 205
    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setGravity(I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setTextSize(F)V

    .line 212
    .line 213
    .line 214
    move/from16 v2, p8

    .line 215
    .line 216
    invoke-direct {v1, p1, v0, v2}, Lvf0;->a1(Landroid/content/Context;Landroid/widget/TextView;Z)V

    .line 217
    .line 218
    .line 219
    new-instance v1, Lif0;

    .line 220
    .line 221
    move-object/from16 v3, p9

    .line 222
    .line 223
    invoke-direct {v1, p1, v3, v4}, Lif0;-><init>(Landroid/content/Context;Lsw;I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 227
    .line 228
    .line 229
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-virtual {v0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 237
    .line 238
    .line 239
    return-object p0
.end method

.method private static final x2(Landroid/content/Context;IIIILandroid/app/Dialog;Landroid/widget/LinearLayout;)Lna1;
    .locals 13

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    move-object/from16 v1, p6

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v2, Lvf0;->a:Lvf0;

    .line 9
    .line 10
    new-instance v12, Lrf0;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-direct {v12, p0, v3, v0}, Lrf0;-><init>(Landroid/content/Context;ILandroid/app/Dialog;)V

    .line 14
    .line 15
    .line 16
    const-string v4, "\u2716"

    .line 17
    .line 18
    const-string v5, "\u5feb\u6377\u91cd\u542f"

    .line 19
    .line 20
    const-string v6, "\u7acb\u5373\u91cd\u542f\u5c0f\u7ea2\u4e66\uff0c\u5feb\u901f\u751f\u6548\u8bbe\u7f6e\u53d8\u66f4"

    .line 21
    .line 22
    move v11, p2

    .line 23
    move-object v3, p0

    .line 24
    move v7, p1

    .line 25
    move v8, p2

    .line 26
    move/from16 v9, p3

    .line 27
    .line 28
    move/from16 v10, p4

    .line 29
    .line 30
    invoke-direct/range {v2 .. v12}, Lvf0;->v1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIILhw;)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    new-instance v12, Lrf0;

    .line 38
    .line 39
    const/4 v4, 0x1

    .line 40
    invoke-direct {v12, p0, v4, v0}, Lrf0;-><init>(Landroid/content/Context;ILandroid/app/Dialog;)V

    .line 41
    .line 42
    .line 43
    const-string v4, "\ud83d\udd04"

    .line 44
    .line 45
    const-string v5, "\u91cd\u65b0\u9002\u914d"

    .line 46
    .line 47
    const-string v6, "\u5220\u9664\u7f13\u5b58\u5e76\u91cd\u65b0\u626b\u63cf\u5bbf\u4e3bAPP\u7684Hook\u70b9"

    .line 48
    .line 49
    invoke-direct/range {v2 .. v12}, Lvf0;->v1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIILhw;)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 54
    .line 55
    .line 56
    new-instance v12, Lrf0;

    .line 57
    .line 58
    const/4 v4, 0x2

    .line 59
    invoke-direct {v12, p0, v4, v0}, Lrf0;-><init>(Landroid/content/Context;ILandroid/app/Dialog;)V

    .line 60
    .line 61
    .line 62
    const-string v4, "\ud83d\udd10"

    .line 63
    .line 64
    const-string v5, "\u91cd\u65b0\u9a8c\u8bc1\u6fc0\u6d3b"

    .line 65
    .line 66
    const-string v6, "\u6e05\u9664\u6388\u6743\u72b6\u6001\uff0c\u91cd\u65b0\u8fdb\u884c\u6388\u6743\u9a8c\u8bc1"

    .line 67
    .line 68
    invoke-direct/range {v2 .. v12}, Lvf0;->v1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIILhw;)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 73
    .line 74
    .line 75
    new-instance v12, Lrf0;

    .line 76
    .line 77
    invoke-direct {v12, v0, p0}, Lrf0;-><init>(Landroid/app/Dialog;Landroid/content/Context;)V

    .line 78
    .line 79
    .line 80
    const-string v4, "\ud83d\udcdc"

    .line 81
    .line 82
    const-string v5, "\u67e5\u770b\u4f7f\u7528\u534f\u8bae"

    .line 83
    .line 84
    const-string v6, "\u91cd\u65b0\u67e5\u770b\u5e76\u786e\u8ba4\u5b8c\u6574\u7684\u4f7f\u7528\u534f\u8bae\u4e0e\u627f\u8bfa"

    .line 85
    .line 86
    invoke-direct/range {v2 .. v12}, Lvf0;->v1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIILhw;)Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-virtual {v1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 91
    .line 92
    .line 93
    sget-object p0, Lna1;->a:Lna1;

    .line 94
    .line 95
    return-object p0
.end method

.method private static final x3(Landroid/content/SharedPreferences;Lvf0$k;Z)Lna1;
    .locals 0

    .line 1
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1}, Lvf0$k;->k()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lna1;->a:Lna1;

    .line 17
    .line 18
    return-object p0
.end method

.method public static synthetic y(Landroid/widget/TextView;Lxt0;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lvf0;->P2(Landroid/widget/TextView;Lxt0;ILandroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic y0(ZLandroid/content/Context;IIILandroid/content/SharedPreferences;)Lna1;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lvf0;->j2(ZLandroid/content/Context;IIILandroid/content/SharedPreferences;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final y1(Landroid/content/Context;Lsw;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Ljava/lang/Boolean;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Ljava/lang/Boolean;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    :goto_1
    xor-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    sget-object v1, Lvf0;->a:Lvf0;

    .line 31
    .line 32
    check-cast p2, Landroid/widget/TextView;

    .line 33
    .line 34
    invoke-direct {v1, p0, p2, v0}, Lvf0;->a1(Landroid/content/Context;Landroid/widget/TextView;Z)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-interface {p1, p0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method private static final y2(Landroid/app/Dialog;Landroid/content/Context;)Lna1;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lvf0;->a:Lvf0;

    .line 5
    .line 6
    invoke-direct {p0, p1}, Lvf0;->Z2(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lna1;->a:Lna1;

    .line 10
    .line 11
    return-object p0
.end method

.method private static final y3(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic z(Lvt0;Landroid/content/SharedPreferences;Z)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lvf0;->U2(Lvt0;Landroid/content/SharedPreferences;Z)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic z0(Landroid/content/Context;IIILandroid/content/SharedPreferences;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lvf0;->u2(Landroid/content/Context;IIILandroid/content/SharedPreferences;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final z1(Landroid/content/Context;Landroid/app/Dialog;I)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    new-instance v0, Len;

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    invoke-direct {v0, p3, v1, p1, p2}, Len;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method private static final z2(Landroid/app/Dialog;Landroid/content/Context;)Lna1;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lvf0;->a:Lvf0;

    .line 5
    .line 6
    invoke-direct {p0, p1}, Lvf0;->c3(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lna1;->a:Lna1;

    .line 10
    .line 11
    return-object p0
.end method

.method private static final z3(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final B1(Landroid/content/Context;)V
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-direct/range {p0 .. p1}, Lvf0;->f1(Landroid/content/Context;)Z

    .line 9
    .line 10
    .line 11
    move-result v10

    .line 12
    const/16 v11, 0x1c

    .line 13
    .line 14
    const/16 v2, 0x16

    .line 15
    .line 16
    const/16 v12, 0xff

    .line 17
    .line 18
    if-eqz v10, :cond_0

    .line 19
    .line 20
    invoke-static {v12, v2, v2, v11}, Landroid/graphics/Color;->argb(IIII)I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    :goto_0
    move v13, v3

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    const/16 v3, 0xfc

    .line 27
    .line 28
    const/16 v4, 0xf8

    .line 29
    .line 30
    invoke-static {v12, v4, v4, v3}, Landroid/graphics/Color;->argb(IIII)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    goto :goto_0

    .line 35
    :goto_1
    if-eqz v10, :cond_1

    .line 36
    .line 37
    const/4 v3, -0x1

    .line 38
    goto :goto_2

    .line 39
    :cond_1
    invoke-static {v12, v2, v2, v11}, Landroid/graphics/Color;->argb(IIII)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    move v3, v2

    .line 44
    :goto_2
    const/16 v15, 0x64

    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    if-eqz v10, :cond_2

    .line 48
    .line 49
    invoke-static {v15, v12, v12, v12}, Landroid/graphics/Color;->argb(IIII)I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    goto :goto_3

    .line 54
    :cond_2
    invoke-static {v15, v2, v2, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    :goto_3
    const/16 v5, 0xd2

    .line 59
    .line 60
    const/16 v6, 0x50

    .line 61
    .line 62
    const/16 v7, 0x32

    .line 63
    .line 64
    const/16 v8, 0xc8

    .line 65
    .line 66
    if-eqz v10, :cond_3

    .line 67
    .line 68
    const/16 v9, 0x3a

    .line 69
    .line 70
    invoke-static {v6, v7, v7, v9}, Landroid/graphics/Color;->argb(IIII)I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    goto :goto_4

    .line 75
    :cond_3
    invoke-static {v6, v8, v8, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    :goto_4
    const/16 v9, 0x1e

    .line 80
    .line 81
    if-eqz v10, :cond_4

    .line 82
    .line 83
    invoke-static {v9, v12, v12, v12}, Landroid/graphics/Color;->argb(IIII)I

    .line 84
    .line 85
    .line 86
    move-result v16

    .line 87
    goto :goto_5

    .line 88
    :cond_4
    invoke-static {v9, v2, v2, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 89
    .line 90
    .line 91
    move-result v16

    .line 92
    :goto_5
    const/16 v11, 0xa0

    .line 93
    .line 94
    const/16 v12, 0xb4

    .line 95
    .line 96
    const/16 v14, 0x3c

    .line 97
    .line 98
    if-eqz v10, :cond_5

    .line 99
    .line 100
    const/16 v5, 0xbe

    .line 101
    .line 102
    invoke-static {v14, v12, v12, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    goto :goto_6

    .line 107
    :cond_5
    const/16 v5, 0xaa

    .line 108
    .line 109
    invoke-static {v15, v11, v11, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    :goto_6
    sget-object v19, Lm00;->S:Lm00$a;

    .line 114
    .line 115
    invoke-virtual/range {v19 .. v19}, Lm00$a;->Y()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    invoke-virtual {v1, v7, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 120
    .line 121
    .line 122
    move-result-object v19

    .line 123
    const/16 v21, 0x0

    .line 124
    .line 125
    :try_start_0
    sget-object v7, Lcf1;->a:Lcf1;

    .line 126
    .line 127
    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v7, v8}, Lcf1;->d(Ljava/lang/ClassLoader;)Lcf1$a;

    .line 135
    .line 136
    .line 137
    move-result-object v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 138
    goto :goto_7

    .line 139
    :catch_0
    move-object/from16 v7, v21

    .line 140
    .line 141
    :goto_7
    const-string v8, "\u672a\u767b\u5f55"

    .line 142
    .line 143
    const-string v9, " ("

    .line 144
    .line 145
    if-eqz v7, :cond_6

    .line 146
    .line 147
    invoke-virtual {v7}, Lcf1$a;->f()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v11

    .line 151
    invoke-virtual {v7}, Lcf1$a;->g()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v15

    .line 155
    invoke-static {v11}, Lk41;->a0(Ljava/lang/String;)Z

    .line 156
    .line 157
    .line 158
    move-result v26

    .line 159
    if-nez v26, :cond_6

    .line 160
    .line 161
    invoke-static {v15}, Lk41;->a0(Ljava/lang/String;)Z

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    if-nez v8, :cond_7

    .line 166
    .line 167
    new-instance v8, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    const-string v11, ")"

    .line 182
    .line 183
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v8

    .line 190
    :cond_6
    move-object v11, v8

    .line 191
    :cond_7
    new-instance v15, Landroid/app/Dialog;

    .line 192
    .line 193
    const v8, 0x103000a

    .line 194
    .line 195
    .line 196
    invoke-direct {v15, v1, v8}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 197
    .line 198
    .line 199
    const/4 v8, 0x1

    .line 200
    invoke-virtual {v15, v8}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 201
    .line 202
    .line 203
    new-instance v14, Landroid/widget/LinearLayout;

    .line 204
    .line 205
    invoke-direct {v14, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v14, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v14, v13}, Landroid/view/View;->setBackgroundColor(I)V

    .line 212
    .line 213
    .line 214
    sget-object v8, Lvf0;->a:Lvf0;

    .line 215
    .line 216
    const/16 v12, 0x14

    .line 217
    .line 218
    invoke-direct {v8, v1, v12}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    move/from16 v27, v4

    .line 223
    .line 224
    invoke-direct {v8, v1, v12}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 225
    .line 226
    .line 227
    move-result v4

    .line 228
    const/16 v12, 0x10

    .line 229
    .line 230
    move/from16 v28, v5

    .line 231
    .line 232
    invoke-direct {v8, v1, v12}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 233
    .line 234
    .line 235
    move-result v5

    .line 236
    const/4 v12, 0x0

    .line 237
    invoke-virtual {v14, v2, v12, v4, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 238
    .line 239
    .line 240
    new-instance v2, Landroid/widget/LinearLayout;

    .line 241
    .line 242
    invoke-direct {v2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 246
    .line 247
    .line 248
    const/16 v4, 0x10

    .line 249
    .line 250
    invoke-virtual {v2, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 251
    .line 252
    .line 253
    invoke-direct {v8, v1, v4}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 254
    .line 255
    .line 256
    move-result v5

    .line 257
    invoke-virtual {v2, v12, v12, v12, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 258
    .line 259
    .line 260
    const-string v4, "\u6316\u7ea2\u85af\u5440-WHS"

    .line 261
    .line 262
    const/high16 v12, 0x41a00000    # 20.0f

    .line 263
    .line 264
    invoke-static {v1, v4, v12, v3}, Lt1;->i(Landroid/content/Context;Ljava/lang/String;FI)Landroid/widget/TextView;

    .line 265
    .line 266
    .line 267
    move-result-object v4

    .line 268
    sget-object v5, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 269
    .line 270
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 274
    .line 275
    .line 276
    new-instance v4, Landroid/widget/TextView;

    .line 277
    .line 278
    invoke-direct {v4, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 279
    .line 280
    .line 281
    const-string v12, "3.0"

    .line 282
    .line 283
    invoke-virtual {v4, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 284
    .line 285
    .line 286
    const/high16 v12, 0x41500000    # 13.0f

    .line 287
    .line 288
    invoke-virtual {v4, v12}, Landroid/widget/TextView;->setTextSize(F)V

    .line 289
    .line 290
    .line 291
    const/4 v12, -0x1

    .line 292
    invoke-virtual {v4, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 296
    .line 297
    .line 298
    const/16 v12, 0x11

    .line 299
    .line 300
    invoke-virtual {v4, v12}, Landroid/widget/TextView;->setGravity(I)V

    .line 301
    .line 302
    .line 303
    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    .line 304
    .line 305
    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 306
    .line 307
    .line 308
    const/4 v12, 0x0

    .line 309
    invoke-virtual {v5, v12}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 310
    .line 311
    .line 312
    const/4 v12, 0x4

    .line 313
    move/from16 v29, v3

    .line 314
    .line 315
    invoke-direct {v8, v1, v12}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 316
    .line 317
    .line 318
    move-result v3

    .line 319
    int-to-float v3, v3

    .line 320
    invoke-virtual {v5, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 321
    .line 322
    .line 323
    const/16 v3, 0x96

    .line 324
    .line 325
    const/16 v12, 0xf3

    .line 326
    .line 327
    move/from16 v30, v6

    .line 328
    .line 329
    const/16 v6, 0x21

    .line 330
    .line 331
    move-object/from16 v31, v7

    .line 332
    .line 333
    const/16 v7, 0xff

    .line 334
    .line 335
    invoke-static {v7, v6, v3, v12}, Landroid/graphics/Color;->argb(IIII)I

    .line 336
    .line 337
    .line 338
    move-result v3

    .line 339
    invoke-virtual {v5, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v4, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 343
    .line 344
    .line 345
    const/16 v12, 0x8

    .line 346
    .line 347
    invoke-direct {v8, v1, v12}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 348
    .line 349
    .line 350
    move-result v3

    .line 351
    const/4 v5, 0x3

    .line 352
    invoke-direct {v8, v1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 353
    .line 354
    .line 355
    move-result v6

    .line 356
    invoke-direct {v8, v1, v12}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 357
    .line 358
    .line 359
    move-result v7

    .line 360
    invoke-direct {v8, v1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 361
    .line 362
    .line 363
    move-result v12

    .line 364
    invoke-virtual {v4, v3, v6, v7, v12}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 365
    .line 366
    .line 367
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 368
    .line 369
    const/4 v12, -0x2

    .line 370
    invoke-direct {v3, v12, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 371
    .line 372
    .line 373
    const/16 v6, 0x8

    .line 374
    .line 375
    invoke-direct {v8, v1, v6}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 376
    .line 377
    .line 378
    move-result v7

    .line 379
    const/4 v6, 0x0

    .line 380
    invoke-virtual {v3, v7, v6, v6, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v4, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 387
    .line 388
    .line 389
    :try_start_1
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 390
    .line 391
    .line 392
    move-result-object v3

    .line 393
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v4

    .line 397
    invoke-virtual {v3, v4, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 398
    .line 399
    .line 400
    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 401
    goto :goto_8

    .line 402
    :catch_1
    move-object/from16 v3, v21

    .line 403
    .line 404
    :goto_8
    if-eqz v3, :cond_8

    .line 405
    .line 406
    invoke-virtual {v3}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    .line 407
    .line 408
    .line 409
    move-result-wide v7

    .line 410
    goto :goto_9

    .line 411
    :cond_8
    const-wide/16 v7, 0x0

    .line 412
    .line 413
    :goto_9
    if-eqz v3, :cond_9

    .line 414
    .line 415
    iget-object v3, v3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 416
    .line 417
    if-nez v3, :cond_a

    .line 418
    .line 419
    :cond_9
    const-string v3, "unknown"

    .line 420
    .line 421
    :cond_a
    sget-object v4, Ltu0;->a:Ltu0;

    .line 422
    .line 423
    invoke-virtual {v4}, Ltu0;->c()Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v4

    .line 427
    new-instance v5, Ljava/lang/StringBuilder;

    .line 428
    .line 429
    const-string v6, "\u6a21\u5757\u7248\u672c: v3.0.1 (30121)\n\u5f53\u524d\u7248\u672c: "

    .line 430
    .line 431
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 435
    .line 436
    .line 437
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v5, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    const-string v6, ")\n\u5f53\u524d\u8d26\u53f7: "

    .line 444
    .line 445
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 449
    .line 450
    .line 451
    const-string v6, "\n\u63a8\u8350\u7248\u672c: "

    .line 452
    .line 453
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v5

    .line 463
    const/4 v6, 0x4

    .line 464
    invoke-direct {v0, v1, v6}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 465
    .line 466
    .line 467
    move-result v9

    .line 468
    invoke-direct {v0, v1, v14, v9}, Lvf0;->Z0(Landroid/content/Context;Landroid/widget/LinearLayout;I)V

    .line 469
    .line 470
    .line 471
    new-instance v1, Ljf0;

    .line 472
    .line 473
    move-object/from16 v22, v2

    .line 474
    .line 475
    move-object v6, v3

    .line 476
    move-object v9, v4

    .line 477
    move/from16 v20, v13

    .line 478
    .line 479
    move-object/from16 v23, v14

    .line 480
    .line 481
    move-object/from16 v18, v15

    .line 482
    .line 483
    move/from16 v3, v16

    .line 484
    .line 485
    move/from16 v4, v29

    .line 486
    .line 487
    move/from16 v12, v30

    .line 488
    .line 489
    move-object/from16 v15, v31

    .line 490
    .line 491
    const/4 v14, 0x0

    .line 492
    move-object/from16 v2, p1

    .line 493
    .line 494
    move-object v13, v5

    .line 495
    move/from16 v16, v10

    .line 496
    .line 497
    move/from16 v5, v27

    .line 498
    .line 499
    move/from16 v10, v28

    .line 500
    .line 501
    move-object/from16 v28, v11

    .line 502
    .line 503
    const/4 v11, 0x1

    .line 504
    invoke-direct/range {v1 .. v9}, Ljf0;-><init>(Landroid/content/Context;IIILjava/lang/String;JLjava/lang/String;)V

    .line 505
    .line 506
    .line 507
    move-object v6, v2

    .line 508
    move-object v2, v1

    .line 509
    move-object v1, v6

    .line 510
    move v6, v3

    .line 511
    move v3, v4

    .line 512
    move v4, v5

    .line 513
    invoke-direct {v0, v1, v12, v10, v2}, Lvf0;->r1(Landroid/content/Context;IILsw;)Landroid/view/View;

    .line 514
    .line 515
    .line 516
    move-result-object v2

    .line 517
    new-instance v5, Llf0;

    .line 518
    .line 519
    invoke-direct {v5, v1, v13}, Llf0;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {v2, v5}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 523
    .line 524
    .line 525
    new-instance v5, Lmf0;

    .line 526
    .line 527
    invoke-direct {v5, v1, v14}, Lmf0;-><init>(Landroid/content/Context;I)V

    .line 528
    .line 529
    .line 530
    invoke-direct {v0, v1, v12, v10, v5}, Lvf0;->r1(Landroid/content/Context;IILsw;)Landroid/view/View;

    .line 531
    .line 532
    .line 533
    move-result-object v13

    .line 534
    new-instance v5, Lgg;

    .line 535
    .line 536
    invoke-direct {v5, v1, v11}, Lgg;-><init>(Landroid/content/Context;I)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v13, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 540
    .line 541
    .line 542
    new-instance v5, Lh00;

    .line 543
    .line 544
    invoke-direct {v5, v4, v11, v1}, Lh00;-><init>(IILjava/lang/Object;)V

    .line 545
    .line 546
    .line 547
    invoke-direct {v0, v1, v12, v10, v5}, Lvf0;->r1(Landroid/content/Context;IILsw;)Landroid/view/View;

    .line 548
    .line 549
    .line 550
    move-result-object v5

    .line 551
    new-instance v7, Lgg;

    .line 552
    .line 553
    const/4 v8, 0x2

    .line 554
    invoke-direct {v7, v1, v8}, Lgg;-><init>(Landroid/content/Context;I)V

    .line 555
    .line 556
    .line 557
    invoke-virtual {v5, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 558
    .line 559
    .line 560
    sget-object v7, Ln90;->a:Ln90;

    .line 561
    .line 562
    invoke-virtual {v7, v1}, Ln90;->y(Landroid/content/Context;)Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    move-result-object v7

    .line 566
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 567
    .line 568
    .line 569
    move-result v9

    .line 570
    if-lez v9, :cond_11

    .line 571
    .line 572
    const-string v9, "X"

    .line 573
    .line 574
    invoke-virtual {v7, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    move-result v7

    .line 578
    const/16 v9, 0x78

    .line 579
    .line 580
    move/from16 v32, v14

    .line 581
    .line 582
    if-eqz v16, :cond_b

    .line 583
    .line 584
    const/16 v8, 0x32

    .line 585
    .line 586
    const/16 v11, 0xff

    .line 587
    .line 588
    const/16 v14, 0xc8

    .line 589
    .line 590
    invoke-static {v11, v11, v14, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 591
    .line 592
    .line 593
    move-result v17

    .line 594
    move/from16 v8, v17

    .line 595
    .line 596
    goto :goto_a

    .line 597
    :cond_b
    const/16 v11, 0xff

    .line 598
    .line 599
    const/16 v8, 0xa

    .line 600
    .line 601
    const/16 v14, 0xb4

    .line 602
    .line 603
    invoke-static {v11, v14, v9, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 604
    .line 605
    .line 606
    move-result v8

    .line 607
    :goto_a
    const/16 v14, 0xc

    .line 608
    .line 609
    if-eqz v7, :cond_c

    .line 610
    .line 611
    invoke-static/range {v32 .. v32}, Lt1;->h(I)Landroid/graphics/drawable/GradientDrawable;

    .line 612
    .line 613
    .line 614
    move-result-object v9

    .line 615
    sget-object v11, Lvf0;->a:Lvf0;

    .line 616
    .line 617
    move-object/from16 v33, v2

    .line 618
    .line 619
    invoke-direct {v11, v1, v14}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 620
    .line 621
    .line 622
    move-result v2

    .line 623
    int-to-float v2, v2

    .line 624
    invoke-virtual {v9, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 625
    .line 626
    .line 627
    const/4 v2, 0x1

    .line 628
    invoke-direct {v11, v1, v2}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 629
    .line 630
    .line 631
    move-result v11

    .line 632
    move-object/from16 v30, v5

    .line 633
    .line 634
    move/from16 v34, v6

    .line 635
    .line 636
    const/16 v2, 0x78

    .line 637
    .line 638
    const/16 v5, 0xc8

    .line 639
    .line 640
    const/16 v6, 0xff

    .line 641
    .line 642
    const/16 v14, 0x32

    .line 643
    .line 644
    invoke-static {v2, v6, v5, v14}, Landroid/graphics/Color;->argb(IIII)I

    .line 645
    .line 646
    .line 647
    move-result v2

    .line 648
    invoke-virtual {v9, v11, v2}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 649
    .line 650
    .line 651
    move/from16 v27, v7

    .line 652
    .line 653
    const/16 v2, 0x1e

    .line 654
    .line 655
    const/16 v11, 0x3c

    .line 656
    .line 657
    const/16 v14, 0xb4

    .line 658
    .line 659
    invoke-static {v11, v6, v14, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 660
    .line 661
    .line 662
    move-result v7

    .line 663
    move/from16 v35, v8

    .line 664
    .line 665
    const/16 v8, 0x64

    .line 666
    .line 667
    invoke-static {v11, v5, v8, v6}, Landroid/graphics/Color;->argb(IIII)I

    .line 668
    .line 669
    .line 670
    move-result v8

    .line 671
    invoke-static {v11, v6, v14, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 672
    .line 673
    .line 674
    move-result v2

    .line 675
    filled-new-array {v7, v8, v2}, [I

    .line 676
    .line 677
    .line 678
    move-result-object v2

    .line 679
    invoke-virtual {v9, v2}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    .line 680
    .line 681
    .line 682
    move/from16 v14, v32

    .line 683
    .line 684
    invoke-virtual {v9, v14}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V

    .line 685
    .line 686
    .line 687
    sget-object v2, Landroid/graphics/drawable/GradientDrawable$Orientation;->LEFT_RIGHT:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 688
    .line 689
    invoke-virtual {v9, v2}, Landroid/graphics/drawable/GradientDrawable;->setOrientation(Landroid/graphics/drawable/GradientDrawable$Orientation;)V

    .line 690
    .line 691
    .line 692
    move-object/from16 v17, v13

    .line 693
    .line 694
    goto :goto_b

    .line 695
    :cond_c
    move-object/from16 v33, v2

    .line 696
    .line 697
    move-object/from16 v30, v5

    .line 698
    .line 699
    move/from16 v34, v6

    .line 700
    .line 701
    move/from16 v27, v7

    .line 702
    .line 703
    move/from16 v35, v8

    .line 704
    .line 705
    move/from16 v14, v32

    .line 706
    .line 707
    invoke-static {v14}, Lt1;->h(I)Landroid/graphics/drawable/GradientDrawable;

    .line 708
    .line 709
    .line 710
    move-result-object v9

    .line 711
    sget-object v2, Lvf0;->a:Lvf0;

    .line 712
    .line 713
    const/16 v5, 0xc

    .line 714
    .line 715
    invoke-direct {v2, v1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 716
    .line 717
    .line 718
    move-result v6

    .line 719
    int-to-float v5, v6

    .line 720
    invoke-virtual {v9, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 721
    .line 722
    .line 723
    const/16 v5, 0xb4

    .line 724
    .line 725
    const/16 v6, 0xff

    .line 726
    .line 727
    const/16 v8, 0x64

    .line 728
    .line 729
    const/16 v11, 0x3c

    .line 730
    .line 731
    invoke-static {v11, v8, v5, v6}, Landroid/graphics/Color;->argb(IIII)I

    .line 732
    .line 733
    .line 734
    move-result v7

    .line 735
    move-object/from16 v17, v13

    .line 736
    .line 737
    const/16 v13, 0xa0

    .line 738
    .line 739
    const/16 v14, 0xd2

    .line 740
    .line 741
    invoke-static {v11, v13, v14, v6}, Landroid/graphics/Color;->argb(IIII)I

    .line 742
    .line 743
    .line 744
    move-result v13

    .line 745
    invoke-static {v11, v8, v5, v6}, Landroid/graphics/Color;->argb(IIII)I

    .line 746
    .line 747
    .line 748
    move-result v5

    .line 749
    filled-new-array {v7, v13, v5}, [I

    .line 750
    .line 751
    .line 752
    move-result-object v5

    .line 753
    invoke-virtual {v9, v5}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    .line 754
    .line 755
    .line 756
    const/4 v14, 0x0

    .line 757
    invoke-virtual {v9, v14}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V

    .line 758
    .line 759
    .line 760
    sget-object v5, Landroid/graphics/drawable/GradientDrawable$Orientation;->LEFT_RIGHT:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 761
    .line 762
    invoke-virtual {v9, v5}, Landroid/graphics/drawable/GradientDrawable;->setOrientation(Landroid/graphics/drawable/GradientDrawable$Orientation;)V

    .line 763
    .line 764
    .line 765
    const/4 v11, 0x1

    .line 766
    invoke-direct {v2, v1, v11}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 767
    .line 768
    .line 769
    move-result v2

    .line 770
    invoke-virtual {v9, v2, v10}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 771
    .line 772
    .line 773
    :goto_b
    new-instance v2, Landroid/widget/LinearLayout;

    .line 774
    .line 775
    invoke-direct {v2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 776
    .line 777
    .line 778
    invoke-virtual {v2, v14}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 779
    .line 780
    .line 781
    const/16 v5, 0x10

    .line 782
    .line 783
    invoke-virtual {v2, v5}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 784
    .line 785
    .line 786
    sget-object v5, Lvf0;->a:Lvf0;

    .line 787
    .line 788
    const/16 v6, 0xe

    .line 789
    .line 790
    invoke-direct {v5, v1, v6}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 791
    .line 792
    .line 793
    move-result v7

    .line 794
    const/16 v8, 0xc

    .line 795
    .line 796
    invoke-direct {v5, v1, v8}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 797
    .line 798
    .line 799
    move-result v11

    .line 800
    invoke-direct {v5, v1, v6}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 801
    .line 802
    .line 803
    move-result v13

    .line 804
    invoke-direct {v5, v1, v8}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 805
    .line 806
    .line 807
    move-result v6

    .line 808
    invoke-virtual {v2, v7, v11, v13, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 809
    .line 810
    .line 811
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 812
    .line 813
    const/4 v7, -0x2

    .line 814
    const/4 v8, -0x1

    .line 815
    invoke-direct {v6, v8, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 816
    .line 817
    .line 818
    const/16 v7, 0x8

    .line 819
    .line 820
    invoke-direct {v5, v1, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 821
    .line 822
    .line 823
    move-result v8

    .line 824
    invoke-virtual {v6, v14, v14, v14, v8}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 825
    .line 826
    .line 827
    invoke-virtual {v2, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 828
    .line 829
    .line 830
    invoke-virtual {v2, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 831
    .line 832
    .line 833
    new-instance v6, Llf0;

    .line 834
    .line 835
    invoke-direct {v6, v15, v1}, Llf0;-><init>(Lcf1$a;Landroid/content/Context;)V

    .line 836
    .line 837
    .line 838
    invoke-virtual {v2, v6}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 839
    .line 840
    .line 841
    new-instance v6, Landroid/widget/TextView;

    .line 842
    .line 843
    invoke-direct {v6, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 844
    .line 845
    .line 846
    if-eqz v27, :cond_d

    .line 847
    .line 848
    const-string v7, "\u2728"

    .line 849
    .line 850
    goto :goto_c

    .line 851
    :cond_d
    const-string v7, "\ud83d\udc64"

    .line 852
    .line 853
    :goto_c
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 854
    .line 855
    .line 856
    if-eqz v27, :cond_e

    .line 857
    .line 858
    const/high16 v7, 0x41c00000    # 24.0f

    .line 859
    .line 860
    goto :goto_d

    .line 861
    :cond_e
    const/high16 v7, 0x41a00000    # 20.0f

    .line 862
    .line 863
    :goto_d
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 864
    .line 865
    .line 866
    const/16 v7, 0x11

    .line 867
    .line 868
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setGravity(I)V

    .line 869
    .line 870
    .line 871
    const/16 v8, 0xc

    .line 872
    .line 873
    invoke-direct {v5, v1, v8}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 874
    .line 875
    .line 876
    move-result v7

    .line 877
    const/4 v14, 0x0

    .line 878
    invoke-virtual {v6, v14, v14, v7, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 879
    .line 880
    .line 881
    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 882
    .line 883
    .line 884
    new-instance v6, Landroid/widget/LinearLayout;

    .line 885
    .line 886
    invoke-direct {v6, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 887
    .line 888
    .line 889
    const/4 v11, 0x1

    .line 890
    invoke-virtual {v6, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 891
    .line 892
    .line 893
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 894
    .line 895
    const/high16 v8, 0x3f800000    # 1.0f

    .line 896
    .line 897
    const/4 v9, -0x2

    .line 898
    invoke-direct {v7, v14, v9, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 899
    .line 900
    .line 901
    invoke-virtual {v6, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 902
    .line 903
    .line 904
    new-instance v7, Landroid/widget/TextView;

    .line 905
    .line 906
    invoke-direct {v7, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 907
    .line 908
    .line 909
    if-eqz v27, :cond_f

    .line 910
    .line 911
    const-string v9, "\u5185\u6d4b\u7528\u6237 \u00b7 X"

    .line 912
    .line 913
    goto :goto_e

    .line 914
    :cond_f
    const-string v9, "\u666e\u901a\u7528\u6237 \u00b7 Y"

    .line 915
    .line 916
    :goto_e
    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 917
    .line 918
    .line 919
    const/high16 v9, 0x41700000    # 15.0f

    .line 920
    .line 921
    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 922
    .line 923
    .line 924
    if-eqz v27, :cond_10

    .line 925
    .line 926
    move/from16 v9, v35

    .line 927
    .line 928
    goto :goto_f

    .line 929
    :cond_10
    move v9, v3

    .line 930
    :goto_f
    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 931
    .line 932
    .line 933
    sget-object v9, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 934
    .line 935
    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 936
    .line 937
    .line 938
    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 939
    .line 940
    .line 941
    new-instance v7, Landroid/widget/TextView;

    .line 942
    .line 943
    invoke-direct {v7, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 944
    .line 945
    .line 946
    move-object/from16 v11, v28

    .line 947
    .line 948
    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 949
    .line 950
    .line 951
    const/high16 v9, 0x41400000    # 12.0f

    .line 952
    .line 953
    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 954
    .line 955
    .line 956
    invoke-virtual {v7, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 957
    .line 958
    .line 959
    const/4 v9, 0x2

    .line 960
    invoke-direct {v5, v1, v9}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 961
    .line 962
    .line 963
    move-result v5

    .line 964
    const/4 v14, 0x0

    .line 965
    invoke-virtual {v7, v14, v5, v14, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 966
    .line 967
    .line 968
    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 969
    .line 970
    .line 971
    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 972
    .line 973
    .line 974
    move-object v11, v2

    .line 975
    goto :goto_10

    .line 976
    :cond_11
    move-object/from16 v33, v2

    .line 977
    .line 978
    move-object/from16 v30, v5

    .line 979
    .line 980
    move/from16 v34, v6

    .line 981
    .line 982
    move-object/from16 v17, v13

    .line 983
    .line 984
    const/high16 v8, 0x3f800000    # 1.0f

    .line 985
    .line 986
    const/4 v9, 0x2

    .line 987
    move-object/from16 v11, v21

    .line 988
    .line 989
    :goto_10
    new-instance v2, Lcf0;

    .line 990
    .line 991
    invoke-direct {v2, v3, v1, v4, v9}, Lcf0;-><init>(ILandroid/content/Context;II)V

    .line 992
    .line 993
    .line 994
    invoke-direct {v0, v1, v12, v10, v2}, Lvf0;->r1(Landroid/content/Context;IILsw;)Landroid/view/View;

    .line 995
    .line 996
    .line 997
    move-result-object v13

    .line 998
    new-instance v2, Lgg;

    .line 999
    .line 1000
    const/4 v5, 0x3

    .line 1001
    invoke-direct {v2, v1, v5}, Lgg;-><init>(Landroid/content/Context;I)V

    .line 1002
    .line 1003
    .line 1004
    invoke-virtual {v13, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1005
    .line 1006
    .line 1007
    new-instance v14, Landroid/widget/TextView;

    .line 1008
    .line 1009
    invoke-direct {v14, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1010
    .line 1011
    .line 1012
    const-string v2, "\u53cd\u9988\u65e5\u5fd7\u65f6\u9700\u957f\u6309\u4e0a\u65b9\u201c\u6a21\u5757\u4fe1\u606f\u201c\u677f\u5757\u590d\u5236\u7248\u672c\u4fe1\u606f\uff0c\u7136\u540e\u6309\u7167\u7fa4\u7ec4\u5173\u4e8e\u53cd\u9988\u7684\u76f8\u5173\u516c\u544a\u683c\u5f0f\u586b\u5199\u5b8c\u6574\u53cd\u9988\u4fe1\u606f+lsposed\u65e5\u5fd7+\u95ee\u9898\u590d\u73b0\u5f55\u5c4f\u7b49\u4e00\u5e76\u53d1\u9001\u53cd\u9988\u3002\u82e5\u4e0d\u770b\u516c\u544a\u3001\u4e0d\u6309\u683c\u5f0f\u53cd\u9988\uff0c\u76f4\u63a5\u8e22\u51fa\u5c01\u7981\u4f7f\u7528\u5904\u7406"

    .line 1013
    .line 1014
    invoke-virtual {v14, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1015
    .line 1016
    .line 1017
    const/high16 v2, 0x41200000    # 10.0f

    .line 1018
    .line 1019
    invoke-virtual {v14, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1020
    .line 1021
    .line 1022
    const/16 v15, 0xfe

    .line 1023
    .line 1024
    const/16 v2, 0x2c

    .line 1025
    .line 1026
    const/16 v5, 0x55

    .line 1027
    .line 1028
    const/16 v6, 0xc8

    .line 1029
    .line 1030
    invoke-static {v6, v15, v2, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 1031
    .line 1032
    .line 1033
    move-result v6

    .line 1034
    invoke-virtual {v14, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1035
    .line 1036
    .line 1037
    const/16 v7, 0x11

    .line 1038
    .line 1039
    invoke-virtual {v14, v7}, Landroid/widget/TextView;->setGravity(I)V

    .line 1040
    .line 1041
    .line 1042
    sget-object v6, Lvf0;->a:Lvf0;

    .line 1043
    .line 1044
    const/4 v7, 0x4

    .line 1045
    invoke-direct {v6, v1, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 1046
    .line 1047
    .line 1048
    move-result v9

    .line 1049
    const/4 v7, 0x0

    .line 1050
    invoke-virtual {v14, v7, v9, v7, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1051
    .line 1052
    .line 1053
    const/4 v9, 0x2

    .line 1054
    invoke-direct {v0, v1, v9}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 1055
    .line 1056
    .line 1057
    move-result v7

    .line 1058
    move-object/from16 v9, v23

    .line 1059
    .line 1060
    invoke-direct {v0, v1, v9, v7}, Lvf0;->Z0(Landroid/content/Context;Landroid/widget/LinearLayout;I)V

    .line 1061
    .line 1062
    .line 1063
    new-instance v9, Landroid/widget/TextView;

    .line 1064
    .line 1065
    invoke-direct {v9, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1066
    .line 1067
    .line 1068
    sget-object v7, Lm00;->S:Lm00$a;

    .line 1069
    .line 1070
    invoke-virtual {v7, v1}, Lm00$a;->b0(Landroid/content/Context;)Ljava/lang/String;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v7

    .line 1074
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1075
    .line 1076
    const-string v5, "\u5f53\u524d\uff1a"

    .line 1077
    .line 1078
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1079
    .line 1080
    .line 1081
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1082
    .line 1083
    .line 1084
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v2

    .line 1088
    invoke-virtual {v9, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1089
    .line 1090
    .line 1091
    const/high16 v2, 0x41400000    # 12.0f

    .line 1092
    .line 1093
    invoke-virtual {v9, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual {v9, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1097
    .line 1098
    .line 1099
    const/4 v5, 0x2

    .line 1100
    invoke-direct {v6, v1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 1101
    .line 1102
    .line 1103
    move-result v5

    .line 1104
    const/4 v7, 0x0

    .line 1105
    invoke-virtual {v9, v7, v5, v7, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1106
    .line 1107
    .line 1108
    new-instance v25, Ljava/util/ArrayList;

    .line 1109
    .line 1110
    invoke-direct/range {v25 .. v25}, Ljava/util/ArrayList;-><init>()V

    .line 1111
    .line 1112
    .line 1113
    new-instance v1, Lkf0;

    .line 1114
    .line 1115
    move v7, v4

    .line 1116
    move-object v15, v6

    .line 1117
    move v5, v10

    .line 1118
    move v4, v12

    .line 1119
    move-object/from16 v21, v13

    .line 1120
    .line 1121
    move-object/from16 v2, v19

    .line 1122
    .line 1123
    move-object/from16 v10, v23

    .line 1124
    .line 1125
    move-object/from16 v36, v30

    .line 1126
    .line 1127
    move-object/from16 v12, v33

    .line 1128
    .line 1129
    move/from16 v8, v34

    .line 1130
    .line 1131
    const/16 v13, 0x2c

    .line 1132
    .line 1133
    move v6, v3

    .line 1134
    move-object/from16 v19, v14

    .line 1135
    .line 1136
    const/16 v14, 0x55

    .line 1137
    .line 1138
    move-object/from16 v3, p1

    .line 1139
    .line 1140
    invoke-direct/range {v1 .. v9}, Lkf0;-><init>(Landroid/content/SharedPreferences;Landroid/content/Context;IIIIILandroid/widget/TextView;)V

    .line 1141
    .line 1142
    .line 1143
    move-object/from16 v23, v2

    .line 1144
    .line 1145
    move/from16 v28, v5

    .line 1146
    .line 1147
    move v3, v6

    .line 1148
    move v6, v8

    .line 1149
    move v5, v4

    .line 1150
    move v4, v7

    .line 1151
    const-string v2, "\ud83d\udce5 \u4e0b\u8f7d\u4e0e\u4fdd\u5b58"

    .line 1152
    .line 1153
    const/4 v7, 0x0

    .line 1154
    move-object v9, v1

    .line 1155
    move-object/from16 v8, v25

    .line 1156
    .line 1157
    move-object/from16 v1, p1

    .line 1158
    .line 1159
    invoke-direct/range {v0 .. v9}, Lvf0;->o1(Landroid/content/Context;Ljava/lang/String;IIIIZLjava/util/List;Lsw;)Landroid/view/View;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v2

    .line 1163
    move-object v9, v0

    .line 1164
    move-object/from16 v24, v8

    .line 1165
    .line 1166
    invoke-virtual {v10, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1167
    .line 1168
    .line 1169
    const/4 v0, 0x6

    .line 1170
    invoke-direct {v9, v1, v0}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 1171
    .line 1172
    .line 1173
    move-result v2

    .line 1174
    invoke-direct {v9, v1, v10, v2}, Lvf0;->Z0(Landroid/content/Context;Landroid/widget/LinearLayout;I)V

    .line 1175
    .line 1176
    .line 1177
    move v2, v0

    .line 1178
    new-instance v0, Lkf0;

    .line 1179
    .line 1180
    move v7, v4

    .line 1181
    move v8, v6

    .line 1182
    move/from16 v4, v28

    .line 1183
    .line 1184
    move v6, v3

    .line 1185
    move v3, v5

    .line 1186
    move-object v5, v10

    .line 1187
    move v10, v2

    .line 1188
    move-object v2, v1

    .line 1189
    move-object/from16 v1, v23

    .line 1190
    .line 1191
    invoke-direct/range {v0 .. v8}, Lkf0;-><init>(Landroid/content/SharedPreferences;Landroid/content/Context;IILandroid/widget/LinearLayout;III)V

    .line 1192
    .line 1193
    .line 1194
    move-object v9, v0

    .line 1195
    move-object v0, v5

    .line 1196
    move v4, v7

    .line 1197
    move v5, v3

    .line 1198
    move v3, v6

    .line 1199
    move v6, v8

    .line 1200
    const-string v2, "\u26a1 \u589e\u5f3a\u529f\u80fd"

    .line 1201
    .line 1202
    const/4 v7, 0x0

    .line 1203
    move-object/from16 v1, p1

    .line 1204
    .line 1205
    move-object v13, v0

    .line 1206
    move-object/from16 v8, v24

    .line 1207
    .line 1208
    move-object/from16 v0, p0

    .line 1209
    .line 1210
    invoke-direct/range {v0 .. v9}, Lvf0;->o1(Landroid/content/Context;Ljava/lang/String;IIIIZLjava/util/List;Lsw;)Landroid/view/View;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v2

    .line 1214
    move-object v9, v0

    .line 1215
    move v8, v6

    .line 1216
    invoke-virtual {v13, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1217
    .line 1218
    .line 1219
    invoke-direct {v9, v1, v10}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 1220
    .line 1221
    .line 1222
    move-result v0

    .line 1223
    invoke-direct {v9, v1, v13, v0}, Lvf0;->Z0(Landroid/content/Context;Landroid/widget/LinearLayout;I)V

    .line 1224
    .line 1225
    .line 1226
    new-instance v0, Lff0;

    .line 1227
    .line 1228
    move v2, v5

    .line 1229
    move v5, v3

    .line 1230
    move v3, v2

    .line 1231
    move-object v2, v1

    .line 1232
    move v6, v4

    .line 1233
    move-object/from16 v1, v23

    .line 1234
    .line 1235
    move/from16 v4, v28

    .line 1236
    .line 1237
    invoke-direct/range {v0 .. v6}, Lff0;-><init>(Landroid/content/SharedPreferences;Landroid/content/Context;IIII)V

    .line 1238
    .line 1239
    .line 1240
    move/from16 v28, v5

    .line 1241
    .line 1242
    move v5, v3

    .line 1243
    move/from16 v3, v28

    .line 1244
    .line 1245
    move/from16 v28, v4

    .line 1246
    .line 1247
    move v4, v6

    .line 1248
    const-string v2, "\ud83c\udfa8 UI\u51c0\u5316\u4e0e\u5b9a\u5236"

    .line 1249
    .line 1250
    move-object v1, v9

    .line 1251
    move-object v9, v0

    .line 1252
    move-object v0, v1

    .line 1253
    move-object/from16 v1, p1

    .line 1254
    .line 1255
    move v6, v8

    .line 1256
    move-object/from16 v8, v24

    .line 1257
    .line 1258
    invoke-direct/range {v0 .. v9}, Lvf0;->o1(Landroid/content/Context;Ljava/lang/String;IIIIZLjava/util/List;Lsw;)Landroid/view/View;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v2

    .line 1262
    move-object v9, v0

    .line 1263
    move v8, v6

    .line 1264
    invoke-virtual {v13, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1265
    .line 1266
    .line 1267
    invoke-direct {v9, v1, v10}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 1268
    .line 1269
    .line 1270
    move-result v0

    .line 1271
    invoke-direct {v9, v1, v13, v0}, Lvf0;->Z0(Landroid/content/Context;Landroid/widget/LinearLayout;I)V

    .line 1272
    .line 1273
    .line 1274
    new-instance v0, Lff0;

    .line 1275
    .line 1276
    move v2, v3

    .line 1277
    move v3, v4

    .line 1278
    move v4, v5

    .line 1279
    move-object/from16 v6, v18

    .line 1280
    .line 1281
    move/from16 v5, v28

    .line 1282
    .line 1283
    invoke-direct/range {v0 .. v6}, Lff0;-><init>(Landroid/content/Context;IIIILandroid/app/Dialog;)V

    .line 1284
    .line 1285
    .line 1286
    move v5, v4

    .line 1287
    move v4, v3

    .line 1288
    move v3, v2

    .line 1289
    const-string v2, "\ud83d\udd27 \u6a21\u5757\u5de5\u5177"

    .line 1290
    .line 1291
    move-object v1, v9

    .line 1292
    move-object v9, v0

    .line 1293
    move-object v0, v1

    .line 1294
    move-object/from16 v1, p1

    .line 1295
    .line 1296
    move v6, v8

    .line 1297
    move-object/from16 v10, v18

    .line 1298
    .line 1299
    move-object/from16 v8, v24

    .line 1300
    .line 1301
    invoke-direct/range {v0 .. v9}, Lvf0;->o1(Landroid/content/Context;Ljava/lang/String;IIIIZLjava/util/List;Lsw;)Landroid/view/View;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v2

    .line 1305
    invoke-virtual {v13, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1306
    .line 1307
    .line 1308
    new-instance v2, Landroid/widget/TextView;

    .line 1309
    .line 1310
    invoke-direct {v2, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1311
    .line 1312
    .line 1313
    const-string v3, "\u5173\u95ed"

    .line 1314
    .line 1315
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1316
    .line 1317
    .line 1318
    const/high16 v3, 0x41800000    # 16.0f

    .line 1319
    .line 1320
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1321
    .line 1322
    .line 1323
    const/4 v8, -0x1

    .line 1324
    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1325
    .line 1326
    .line 1327
    sget-object v3, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 1328
    .line 1329
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 1330
    .line 1331
    .line 1332
    const/16 v7, 0x11

    .line 1333
    .line 1334
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setGravity(I)V

    .line 1335
    .line 1336
    .line 1337
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    .line 1338
    .line 1339
    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 1340
    .line 1341
    .line 1342
    const/4 v7, 0x0

    .line 1343
    invoke-virtual {v3, v7}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 1344
    .line 1345
    .line 1346
    const/16 v5, 0x1c

    .line 1347
    .line 1348
    invoke-direct {v15, v1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 1349
    .line 1350
    .line 1351
    move-result v6

    .line 1352
    int-to-float v5, v6

    .line 1353
    invoke-virtual {v3, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 1354
    .line 1355
    .line 1356
    const/16 v5, 0xdc

    .line 1357
    .line 1358
    const/16 v6, 0x2c

    .line 1359
    .line 1360
    const/16 v8, 0xfe

    .line 1361
    .line 1362
    invoke-static {v5, v8, v6, v14}, Landroid/graphics/Color;->argb(IIII)I

    .line 1363
    .line 1364
    .line 1365
    move-result v5

    .line 1366
    invoke-virtual {v3, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 1367
    .line 1368
    .line 1369
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1370
    .line 1371
    .line 1372
    const/16 v6, 0xe

    .line 1373
    .line 1374
    invoke-direct {v15, v1, v6}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 1375
    .line 1376
    .line 1377
    move-result v3

    .line 1378
    invoke-direct {v15, v1, v6}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 1379
    .line 1380
    .line 1381
    move-result v5

    .line 1382
    invoke-virtual {v2, v7, v3, v7, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1383
    .line 1384
    .line 1385
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 1386
    .line 1387
    const/4 v7, -0x2

    .line 1388
    const/4 v8, -0x1

    .line 1389
    invoke-direct {v3, v8, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1390
    .line 1391
    .line 1392
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1393
    .line 1394
    .line 1395
    new-instance v3, Luy;

    .line 1396
    .line 1397
    const/16 v5, 0xf

    .line 1398
    .line 1399
    invoke-direct {v3, v10, v5}, Luy;-><init>(Landroid/app/Dialog;I)V

    .line 1400
    .line 1401
    .line 1402
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1403
    .line 1404
    .line 1405
    new-instance v3, Landroid/widget/LinearLayout;

    .line 1406
    .line 1407
    invoke-direct {v3, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1408
    .line 1409
    .line 1410
    const/4 v5, 0x1

    .line 1411
    invoke-virtual {v3, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1412
    .line 1413
    .line 1414
    move-object/from16 v5, v22

    .line 1415
    .line 1416
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1417
    .line 1418
    .line 1419
    new-instance v5, Landroid/widget/TextView;

    .line 1420
    .line 1421
    invoke-direct {v5, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1422
    .line 1423
    .line 1424
    const-string v6, "\u6a21\u5757\u4fe1\u606f"

    .line 1425
    .line 1426
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1427
    .line 1428
    .line 1429
    const/high16 v9, 0x41400000    # 12.0f

    .line 1430
    .line 1431
    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1432
    .line 1433
    .line 1434
    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1435
    .line 1436
    .line 1437
    const/4 v6, 0x4

    .line 1438
    invoke-direct {v15, v1, v6}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 1439
    .line 1440
    .line 1441
    move-result v4

    .line 1442
    const/4 v6, 0x6

    .line 1443
    invoke-direct {v15, v1, v6}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 1444
    .line 1445
    .line 1446
    move-result v6

    .line 1447
    const/4 v14, 0x0

    .line 1448
    invoke-virtual {v5, v4, v14, v14, v6}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1449
    .line 1450
    .line 1451
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1452
    .line 1453
    .line 1454
    invoke-virtual {v3, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1455
    .line 1456
    .line 1457
    if-eqz v11, :cond_12

    .line 1458
    .line 1459
    invoke-virtual {v3, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1460
    .line 1461
    .line 1462
    :cond_12
    move-object/from16 v4, v17

    .line 1463
    .line 1464
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1465
    .line 1466
    .line 1467
    move-object/from16 v4, v36

    .line 1468
    .line 1469
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1470
    .line 1471
    .line 1472
    move-object/from16 v4, v21

    .line 1473
    .line 1474
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1475
    .line 1476
    .line 1477
    move-object/from16 v4, v19

    .line 1478
    .line 1479
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1480
    .line 1481
    .line 1482
    invoke-virtual {v3, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1483
    .line 1484
    .line 1485
    new-instance v4, Landroid/widget/ScrollView;

    .line 1486
    .line 1487
    invoke-direct {v4, v1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 1488
    .line 1489
    .line 1490
    invoke-virtual {v4, v3}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 1491
    .line 1492
    .line 1493
    new-instance v3, Landroid/widget/LinearLayout;

    .line 1494
    .line 1495
    invoke-direct {v3, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1496
    .line 1497
    .line 1498
    const/4 v11, 0x1

    .line 1499
    invoke-virtual {v3, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1500
    .line 1501
    .line 1502
    move/from16 v5, v20

    .line 1503
    .line 1504
    invoke-virtual {v3, v5}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1505
    .line 1506
    .line 1507
    const/16 v5, 0x14

    .line 1508
    .line 1509
    invoke-direct {v15, v1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 1510
    .line 1511
    .line 1512
    move-result v6

    .line 1513
    const/16 v7, 0x12

    .line 1514
    .line 1515
    invoke-direct {v15, v1, v7}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 1516
    .line 1517
    .line 1518
    move-result v7

    .line 1519
    invoke-direct {v15, v1, v5}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 1520
    .line 1521
    .line 1522
    move-result v5

    .line 1523
    const/4 v14, 0x0

    .line 1524
    invoke-virtual {v3, v6, v7, v5, v14}, Landroid/view/View;->setPadding(IIII)V

    .line 1525
    .line 1526
    .line 1527
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 1528
    .line 1529
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1530
    .line 1531
    const/4 v12, -0x1

    .line 1532
    invoke-direct {v5, v12, v14, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 1533
    .line 1534
    .line 1535
    invoke-virtual {v3, v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1536
    .line 1537
    .line 1538
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1539
    .line 1540
    .line 1541
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 1542
    .line 1543
    const/4 v7, -0x2

    .line 1544
    invoke-direct {v4, v12, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1545
    .line 1546
    .line 1547
    const/16 v6, 0x8

    .line 1548
    .line 1549
    invoke-direct {v15, v1, v6}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 1550
    .line 1551
    .line 1552
    move-result v5

    .line 1553
    const/16 v6, 0x10

    .line 1554
    .line 1555
    invoke-direct {v15, v1, v6}, Lvf0;->e1(Landroid/content/Context;I)I

    .line 1556
    .line 1557
    .line 1558
    move-result v6

    .line 1559
    invoke-virtual {v4, v14, v5, v14, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 1560
    .line 1561
    .line 1562
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1563
    .line 1564
    .line 1565
    invoke-virtual {v10, v3}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 1566
    .line 1567
    .line 1568
    invoke-virtual {v10}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 1569
    .line 1570
    .line 1571
    move-result-object v2

    .line 1572
    if-eqz v2, :cond_13

    .line 1573
    .line 1574
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v3

    .line 1578
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1579
    .line 1580
    .line 1581
    move-result-object v3

    .line 1582
    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 1583
    .line 1584
    int-to-double v3, v3

    .line 1585
    const-wide v5, 0x3feb333333333333L    # 0.85

    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    mul-double/2addr v3, v5

    .line 1591
    double-to-int v3, v3

    .line 1592
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1593
    .line 1594
    .line 1595
    move-result-object v4

    .line 1596
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1597
    .line 1598
    .line 1599
    move-result-object v4

    .line 1600
    iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 1601
    .line 1602
    int-to-double v4, v4

    .line 1603
    const-wide v6, 0x3fea3d70a3d70a3dL    # 0.82

    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    mul-double/2addr v4, v6

    .line 1609
    double-to-int v4, v4

    .line 1610
    invoke-virtual {v2, v3, v4}, Landroid/view/Window;->setLayout(II)V

    .line 1611
    .line 1612
    .line 1613
    :cond_13
    invoke-virtual {v10}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 1614
    .line 1615
    .line 1616
    move-result-object v2

    .line 1617
    if-eqz v2, :cond_14

    .line 1618
    .line 1619
    const/16 v7, 0x11

    .line 1620
    .line 1621
    invoke-virtual {v2, v7}, Landroid/view/Window;->setGravity(I)V

    .line 1622
    .line 1623
    .line 1624
    :cond_14
    invoke-virtual {v10}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v2

    .line 1628
    if-eqz v2, :cond_15

    .line 1629
    .line 1630
    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    .line 1631
    .line 1632
    const/4 v14, 0x0

    .line 1633
    invoke-direct {v3, v14}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 1634
    .line 1635
    .line 1636
    invoke-virtual {v2, v3}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1637
    .line 1638
    .line 1639
    :cond_15
    invoke-virtual {v10}, Landroid/app/Dialog;->show()V

    .line 1640
    .line 1641
    .line 1642
    const/16 v5, 0x1c

    .line 1643
    .line 1644
    invoke-direct {v0, v1, v10, v5}, Lvf0;->z1(Landroid/content/Context;Landroid/app/Dialog;I)V

    .line 1645
    .line 1646
    .line 1647
    return-void
.end method
