.class public Lxh;
.super Ljava/lang/Object;

# interfaces
.implements Lge;
.implements Lkv;


# static fields
.field public static final synthetic b:Lxh;

.field public static final synthetic c:Lxh;

.field public static d:F = -1.0f

.field public static e:F

.field public static f:F

.field public static g:F

.field public static final synthetic h:Lxh;

.field public static final i:Lxh;

.field public static final j:Lxh;

.field public static k:Landroid/hardware/SensorManager;

.field public static final l:Lr80;

.field public static final m:Lxh;

.field public static final n:Lxh;

.field public static final o:Lxh;

.field public static final p:Lxh;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lxh;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Lxh;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lxh;->b:Lxh;

    .line 8
    .line 9
    new-instance v0, Lxh;

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    invoke-direct {v0, v1}, Lxh;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lxh;->c:Lxh;

    .line 16
    .line 17
    new-instance v0, Lxh;

    .line 18
    .line 19
    const/4 v1, 0x5

    .line 20
    invoke-direct {v0, v1}, Lxh;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lxh;->h:Lxh;

    .line 24
    .line 25
    new-instance v0, Lxh;

    .line 26
    .line 27
    const/4 v1, 0x7

    .line 28
    invoke-direct {v0, v1}, Lxh;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lxh;->i:Lxh;

    .line 32
    .line 33
    new-instance v0, Lxh;

    .line 34
    .line 35
    const/16 v1, 0x9

    .line 36
    .line 37
    invoke-direct {v0, v1}, Lxh;-><init>(I)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lxh;->j:Lxh;

    .line 41
    .line 42
    new-instance v0, Lr80;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lxh;->l:Lr80;

    .line 48
    .line 49
    new-instance v0, Lxh;

    .line 50
    .line 51
    const/16 v1, 0xb

    .line 52
    .line 53
    invoke-direct {v0, v1}, Lxh;-><init>(I)V

    .line 54
    .line 55
    .line 56
    sput-object v0, Lxh;->m:Lxh;

    .line 57
    .line 58
    new-instance v0, Lxh;

    .line 59
    .line 60
    const/16 v1, 0xc

    .line 61
    .line 62
    invoke-direct {v0, v1}, Lxh;-><init>(I)V

    .line 63
    .line 64
    .line 65
    sput-object v0, Lxh;->n:Lxh;

    .line 66
    .line 67
    new-instance v0, Lxh;

    .line 68
    .line 69
    const/16 v1, 0xd

    .line 70
    .line 71
    invoke-direct {v0, v1}, Lxh;-><init>(I)V

    .line 72
    .line 73
    .line 74
    sput-object v0, Lxh;->o:Lxh;

    .line 75
    .line 76
    new-instance v0, Lxh;

    .line 77
    .line 78
    const/16 v1, 0xe

    .line 79
    .line 80
    invoke-direct {v0, v1}, Lxh;-><init>(I)V

    .line 81
    .line 82
    .line 83
    sput-object v0, Lxh;->p:Lxh;

    .line 84
    .line 85
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lxh;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lam;)V
    .locals 0

    const/16 p1, 0x19

    iput p1, p0, Lxh;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final b(Landroid/app/Activity;)V
    .locals 14

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "9PWWr06u4OL0747jDKih7/vzjuMaoqHi9e7XrRuh7azu+YqmTqzv6Ojvk6dAu+jp7a6sqgu6xv71\n9Yo=\n"

    .line 10
    .line 11
    const-string v2, "moD6w27NgYw=\n"

    .line 12
    .line 13
    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1, v0}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    move-object v3, v0

    .line 21
    check-cast v3, Landroid/view/ViewGroup;

    .line 22
    .line 23
    new-instance v4, Landroid/widget/FrameLayout;

    .line 24
    .line 25
    invoke-direct {v4, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    const-string v0, "+10X0TuK7A/o\n"

    .line 29
    .line 30
    const-string v1, "2GUn4Qu63D8=\n"

    .line 31
    .line 32
    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-virtual {v4, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    invoke-virtual {v4, v0}, Landroid/view/View;->setClickable(Z)V

    .line 45
    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-virtual {v4, v1}, Landroid/view/View;->setAlpha(F)V

    .line 49
    .line 50
    .line 51
    sget-object v2, Lu6;->a:Lu6;

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    sget-object v2, Lu6;->g:Ljava/lang/String;

    .line 57
    .line 58
    const-string v5, "Z/zk4Q5Apbtl6ubr\n"

    .line 59
    .line 60
    const-string v6, "MrKvr0EX6+Q=\n"

    .line 61
    .line 62
    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-static {v2, v5}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    xor-int/lit8 v5, v2, 0x1

    .line 71
    .line 72
    if-nez v2, :cond_0

    .line 73
    .line 74
    sget-object v2, Lu6;->g:Ljava/lang/String;

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    const-string v2, "IHeXWBahjZt5EZQYdovk12dOxTgR0PGELUS1WCeZjIBp\n"

    .line 78
    .line 79
    const-string v6, "yPkgvZk3aD8=\n"

    .line 80
    .line 81
    invoke-static {v2, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    :goto_0
    const-string v6, "GeekMod \u6388\u6743\n"

    .line 86
    .line 87
    invoke-static {v6, v2}, Lg40;->r(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    new-instance v7, Ld7;

    .line 92
    .line 93
    invoke-direct {v7, p0, v6}, Ld7;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    new-instance v6, Landroid/view/ViewGroup$LayoutParams;

    .line 97
    .line 98
    const/4 v8, -0x1

    .line 99
    invoke-direct {v6, v8, v8}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v4, v7, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 103
    .line 104
    .line 105
    move v6, v5

    .line 106
    new-instance v5, Landroid/widget/LinearLayout;

    .line 107
    .line 108
    invoke-direct {v5, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 115
    .line 116
    .line 117
    const/high16 v7, 0x41c00000    # 24.0f

    .line 118
    .line 119
    invoke-static {p0, v7}, Lxh;->j(Landroid/app/Activity;F)I

    .line 120
    .line 121
    .line 122
    move-result v9

    .line 123
    const/high16 v10, 0x42000000    # 32.0f

    .line 124
    .line 125
    invoke-static {p0, v10}, Lxh;->j(Landroid/app/Activity;F)I

    .line 126
    .line 127
    .line 128
    move-result v11

    .line 129
    invoke-static {p0, v7}, Lxh;->j(Landroid/app/Activity;F)I

    .line 130
    .line 131
    .line 132
    move-result v12

    .line 133
    invoke-static {p0, v10}, Lxh;->j(Landroid/app/Activity;F)I

    .line 134
    .line 135
    .line 136
    move-result v10

    .line 137
    invoke-virtual {v5, v9, v11, v12, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 138
    .line 139
    .line 140
    new-instance v9, Landroid/graphics/drawable/GradientDrawable;

    .line 141
    .line 142
    invoke-direct {v9}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v9, v8}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 146
    .line 147
    .line 148
    invoke-static {p0, v7}, Lxh;->j(Landroid/app/Activity;F)I

    .line 149
    .line 150
    .line 151
    move-result v7

    .line 152
    int-to-float v7, v7

    .line 153
    invoke-virtual {v9, v7}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v5, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 157
    .line 158
    .line 159
    const/high16 v7, 0x43c80000    # 400.0f

    .line 160
    .line 161
    invoke-static {p0, v7}, Lxh;->j(Landroid/app/Activity;F)I

    .line 162
    .line 163
    .line 164
    move-result v7

    .line 165
    int-to-float v7, v7

    .line 166
    invoke-virtual {v5, v7}, Landroid/view/View;->setTranslationY(F)V

    .line 167
    .line 168
    .line 169
    new-instance v9, Landroid/widget/TextView;

    .line 170
    .line 171
    invoke-direct {v9, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 172
    .line 173
    .line 174
    const-string v7, "97MfxFEyZyxVePNKmfXqpjw+1S4=\n"

    .line 175
    .line 176
    const-string v10, "sNZ6rxxdAww=\n"

    .line 177
    .line 178
    invoke-static {v7, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    invoke-virtual {v9, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 183
    .line 184
    .line 185
    const/high16 v7, 0x41b00000    # 22.0f

    .line 186
    .line 187
    invoke-virtual {v9, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 188
    .line 189
    .line 190
    const/high16 v7, -0x1000000

    .line 191
    .line 192
    invoke-virtual {v9, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v9}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 196
    .line 197
    .line 198
    move-result-object v10

    .line 199
    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 200
    .line 201
    .line 202
    move v10, v7

    .line 203
    new-instance v7, Landroid/widget/TextView;

    .line 204
    .line 205
    invoke-direct {v7, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 206
    .line 207
    .line 208
    new-instance v11, Ljava/lang/StringBuilder;

    .line 209
    .line 210
    const-string v12, "\u672a\u68c0\u6d4b\u5230\u6709\u6548\u6388\u6743\n\u5f53\u524d\u767b\u5f55\u5fae\u4fe1\u53f7:\n\n"

    .line 211
    .line 212
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    const-string v12, "\n\n\ud83d\udd39\u65b0\u7528\u6237: \u524d\u5f80 TG \u53d1\u9001\u6307\u4ee4 /bind \n"

    .line 219
    .line 220
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    const-string v2, "\n\ud83d\udd39\u8001\u7528\u6237: \u82e5\u5df2\u7ed1\u5b9a\uff0c\u8bf7\u76f4\u63a5\u70b9\u51fb\u4e0b\u65b9\u9a8c\u8bc1"

    .line 227
    .line 228
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 236
    .line 237
    .line 238
    const/high16 v2, 0x41600000    # 14.0f

    .line 239
    .line 240
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 241
    .line 242
    .line 243
    const-string v2, "P4/A3WJkIQ==\n"

    .line 244
    .line 245
    const-string v11, "HLr16FdRFGM=\n"

    .line 246
    .line 247
    invoke-static {v2, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 256
    .line 257
    .line 258
    const/16 v11, 0x11

    .line 259
    .line 260
    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setGravity(I)V

    .line 261
    .line 262
    .line 263
    const/high16 v2, 0x41a00000    # 20.0f

    .line 264
    .line 265
    invoke-static {p0, v2}, Lxh;->j(Landroid/app/Activity;F)I

    .line 266
    .line 267
    .line 268
    move-result v12

    .line 269
    invoke-static {p0, v2}, Lxh;->j(Landroid/app/Activity;F)I

    .line 270
    .line 271
    .line 272
    move-result v2

    .line 273
    const/4 v13, 0x0

    .line 274
    invoke-virtual {v7, v13, v12, v13, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    .line 278
    .line 279
    .line 280
    const-string v0, "dbiucm7+CxEX+JgzA/FbeBmRxilmaLna\n"

    .line 281
    .line 282
    const-string v2, "kBwjl+ZI7Z0=\n"

    .line 283
    .line 284
    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    const-string v2, "XDhs7II2nw==\n"

    .line 289
    .line 290
    const-string v12, "f35eqrBwrRA=\n"

    .line 291
    .line 292
    invoke-static {v2, v12}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    new-instance v12, Lv6;

    .line 297
    .line 298
    invoke-direct {v12, p0, v6}, Lv6;-><init>(Landroid/app/Activity;Z)V

    .line 299
    .line 300
    .line 301
    invoke-static {p0, v0, v2, v10, v12}, Lxh;->i(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ILum;)Landroid/widget/TextView;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    const-string v2, "+cq/5+7gSNeSh5mnh+k8oLXO0ozrtTDE\n"

    .line 306
    .line 307
    const-string v6, "HmE0AmNTrUc=\n"

    .line 308
    .line 309
    invoke-static {v2, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v10

    .line 313
    const-string v2, "7F8xk9ZmSA==\n"

    .line 314
    .line 315
    const-string v6, "z28G0OdQeIU=\n"

    .line 316
    .line 317
    invoke-static {v2, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v12

    .line 321
    new-instance v2, Lw6;

    .line 322
    .line 323
    move-object v6, p0

    .line 324
    invoke-direct/range {v2 .. v7}, Lw6;-><init>(Landroid/view/ViewGroup;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;Landroid/widget/TextView;)V

    .line 325
    .line 326
    .line 327
    invoke-static {v6, v10, v12, v8, v2}, Lxh;->i(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ILum;)Landroid/widget/TextView;

    .line 328
    .line 329
    .line 330
    move-result-object p0

    .line 331
    invoke-virtual {v5, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v5, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v5, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 341
    .line 342
    .line 343
    new-instance p0, Landroid/widget/FrameLayout$LayoutParams;

    .line 344
    .line 345
    const/high16 v0, 0x43a00000    # 320.0f

    .line 346
    .line 347
    invoke-static {v6, v0}, Lxh;->j(Landroid/app/Activity;F)I

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    const/4 v2, -0x2

    .line 352
    invoke-direct {p0, v0, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 353
    .line 354
    .line 355
    iput v11, p0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 356
    .line 357
    invoke-virtual {v4, v5, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 358
    .line 359
    .line 360
    new-instance p0, Landroid/view/ViewGroup$LayoutParams;

    .line 361
    .line 362
    invoke-direct {p0, v8, v8}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v3, v4, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 366
    .line 367
    .line 368
    new-instance p0, Lx6;

    .line 369
    .line 370
    const/4 v0, 0x0

    .line 371
    invoke-direct {p0, v3, v4, v5, v0}, Lx6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v4, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 375
    .line 376
    .line 377
    new-instance p0, Ly6;

    .line 378
    .line 379
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v5, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v4}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 386
    .line 387
    .line 388
    move-result-object p0

    .line 389
    const/high16 v0, 0x3f800000    # 1.0f

    .line 390
    .line 391
    invoke-virtual {p0, v0}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 392
    .line 393
    .line 394
    move-result-object p0

    .line 395
    const-wide/16 v2, 0xfa

    .line 396
    .line 397
    invoke-virtual {p0, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 398
    .line 399
    .line 400
    move-result-object p0

    .line 401
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 402
    .line 403
    .line 404
    new-instance p0, Lo40;

    .line 405
    .line 406
    sget-object v0, Lo40;->n:Lsh;

    .line 407
    .line 408
    invoke-direct {p0, v5, v0, v1}, Lo40;-><init>(Landroid/view/View;Lgf;F)V

    .line 409
    .line 410
    .line 411
    iget-object v0, p0, Lo40;->k:Lp40;

    .line 412
    .line 413
    const v1, 0x44bb8000    # 1500.0f

    .line 414
    .line 415
    .line 416
    invoke-virtual {v0, v1}, Lp40;->b(F)V

    .line 417
    .line 418
    .line 419
    iget-object v0, p0, Lo40;->k:Lp40;

    .line 420
    .line 421
    const/high16 v1, 0x3f000000    # 0.5f

    .line 422
    .line 423
    invoke-virtual {v0, v1}, Lp40;->a(F)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {p0}, Lo40;->h()V

    .line 427
    .line 428
    .line 429
    return-void
.end method

.method public static final c(Landroid/view/ViewGroup;Lp9;Lr9;Landroid/view/MotionEvent;Lq9;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Z)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v0, p4

    .line 1
    iget-object v3, v0, Lq9;->a:Ljava/lang/Object;

    const v4, 0x7e040005

    .line 2
    invoke-virtual {v1, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Landroid/view/VelocityTracker;

    const/4 v7, 0x0

    if-eqz v6, :cond_0

    check-cast v5, Landroid/view/VelocityTracker;

    goto :goto_0

    :cond_0
    move-object v5, v7

    :goto_0
    move-object/from16 v6, p3

    if-eqz v5, :cond_1

    .line 3
    invoke-virtual {v5, v6}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    :cond_1
    if-eqz v5, :cond_2

    const/16 v8, 0x3e8

    invoke-virtual {v5, v8}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    :cond_2
    if-eqz v5, :cond_3

    .line 4
    invoke-virtual {v5}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result v9

    goto :goto_1

    :cond_3
    const/4 v9, 0x0

    :goto_1
    const v10, 0x451c4000    # 2500.0f

    invoke-static {v10, v9}, Ljava/lang/Math;->min(FF)F

    move-result v9

    const v10, -0x3ae3c000    # -2500.0f

    invoke-static {v10, v9}, Ljava/lang/Math;->max(FF)F

    move-result v9

    if-eqz v5, :cond_4

    .line 5
    invoke-virtual {v5}, Landroid/view/VelocityTracker;->recycle()V

    :cond_4
    invoke-virtual {v1, v4, v7}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 6
    iget-boolean v4, v2, Lr9;->c:Z

    if-eqz v4, :cond_35

    .line 7
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getRawX()F

    move-result v4

    .line 8
    iget v6, v2, Lr9;->a:F

    sub-float/2addr v4, v6

    .line 9
    iget-boolean v6, v2, Lr9;->d:Z

    const/4 v13, 0x1

    if-nez v6, :cond_25

    if-nez p6, :cond_25

    .line 10
    sget v6, Lxh;->f:F

    neg-float v14, v6

    cmpg-float v14, v4, v14

    const-string v15, "06ke\n"

    const-string v5, "p8h5VTpLcuY=\n"

    const-string v8, "tw==\n"

    const/16 p3, 0x0

    const-string v12, "0vI8ySRxU5w=\n"

    if-gez v14, :cond_11

    .line 11
    iput-boolean v13, v2, Lr9;->d:Z

    .line 12
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v4

    .line 13
    const-string v6, "Ee1HIHyW4g==\n"

    const-string v14, "fJ4gaRLwjQ8=\n"

    invoke-static {v6, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v3}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    instance-of v6, v0, Landroid/app/Activity;

    if-eqz v6, :cond_5

    check-cast v0, Landroid/app/Activity;

    move-object v6, v0

    goto :goto_2

    :cond_5
    move-object v6, v7

    :goto_2
    if-nez v6, :cond_6

    goto/16 :goto_14

    :cond_6
    if-nez v4, :cond_7

    goto/16 :goto_14

    .line 15
    :cond_7
    sget-object v14, Lub0;->j0:Ljava/lang/String;

    .line 16
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_14

    .line 17
    :cond_8
    :try_start_0
    new-instance v0, Lp00;

    .line 18
    invoke-direct {v0}, Lp00;-><init>()V

    .line 19
    invoke-static {v0, v4}, Lju;->x(Lp00;Landroid/view/View;)V

    .line 20
    iget-object v4, v0, Lp00;->b:Ljava/lang/Object;

    if-nez v4, :cond_9

    sget-object v0, Lkn;->a:Lkn;

    const-string v3, "eMZqdtWMQKEup2oBiIQAzz/J\n"

    const-string v4, "nk/Ukm0BpSk=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v3}, Lkn;->k(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_14

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    .line 21
    :cond_9
    :try_start_1
    sget-object v4, Lub0;->o:Ljava/lang/String;

    .line 22
    sget-object v10, Lo9;->a:Ljava/lang/ClassLoader;

    .line 23
    invoke-static {v4, v10}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v4

    if-eqz v4, :cond_25

    .line 24
    iget-object v10, v0, Lp00;->b:Ljava/lang/Object;

    invoke-static {v10}, Lmp;->d(Ljava/lang/Object;)V

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v10

    const-string v7, "sMybe3xKWjCz2scYNxAb\n"

    const-string v11, "16nvNhk+Ml8=\n"

    invoke-static {v7, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v10}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    .line 25
    array-length v7, v10

    move/from16 v11, p3

    :goto_3
    if-ge v11, v7, :cond_d

    aget-object v17, v10, v11

    .line 26
    invoke-virtual/range {v17 .. v17}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v14}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_b

    invoke-virtual/range {v17 .. v17}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v13

    move/from16 p4, v7

    const-string v7, "OEmT1c/mJto6WIL3+u030iwEyauAvQ==\n"

    move-object/from16 p6, v10

    const-string v10, "Xyznha6UR7c=\n"

    invoke-static {v7, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v13}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    array-length v7, v13

    if-nez v7, :cond_a

    goto :goto_4

    :cond_a
    invoke-virtual/range {v17 .. v17}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v7

    aget-object v7, v7, p3

    invoke-static {v7, v4}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    move-object/from16 v4, v17

    goto :goto_5

    :catchall_1
    move-exception v0

    goto/16 :goto_6

    :cond_b
    move/from16 p4, v7

    move-object/from16 p6, v10

    :cond_c
    :goto_4
    add-int/lit8 v11, v11, 0x1

    move/from16 v7, p4

    move-object/from16 v10, p6

    const/4 v13, 0x1

    goto :goto_3

    :cond_d
    const/4 v4, 0x0

    :goto_5
    if-eqz v4, :cond_10

    const/4 v7, 0x1

    .line 27
    invoke-virtual {v4, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 28
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v10

    array-length v10, v10

    if-ne v10, v7, :cond_e

    .line 29
    iget-object v0, v0, Lp00;->b:Ljava/lang/Object;

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v4, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_14

    .line 30
    :cond_e
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v7

    array-length v7, v7

    const/4 v10, 0x2

    if-ne v7, v10, :cond_f

    .line 31
    iget-object v0, v0, Lp00;->b:Ljava/lang/Object;

    const/4 v7, 0x0

    filled-new-array {v3, v7}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v4, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_14

    .line 32
    :cond_f
    sget-object v0, Lkn;->a:Lkn;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u5f15\u7528\u5f02\u5e38: \u65b9\u6cd5 ["

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "] \u53c2\u6570\u6570\u91cf\u5f02\u5e38"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v3}, Lkn;->k(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_14

    .line 33
    :cond_10
    sget-object v0, Lkn;->a:Lkn;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u5f15\u7528\u6267\u884c\u5931\u8d25: \u627e\u4e0d\u5230\u540d\u4e3a ["

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "] \u4e14\u63a5\u6536\u6d88\u606f\u4f53\u7684\u65b9\u6cd5"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v3}, Lkn;->k(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto/16 :goto_14

    .line 34
    :goto_6
    :try_start_2
    sget-object v3, Lkn;->a:Lkn;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "\u5f15\u7528\u6267\u884c\u5d29\u6e83: "

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v0}, Lkn;->k(Landroid/content/Context;Ljava/lang/String;)V

    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "QuoteAction_Exec_Failed targetMethod: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 36
    invoke-static {v15, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v8, v12}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_14

    .line 37
    :goto_7
    sget-object v3, Lkn;->a:Lkn;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v7, "\u5bfb\u627e\u8f93\u5165\u6846\u5f02\u5e38: "

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v0}, Lkn;->k(Landroid/content/Context;Ljava/lang/String;)V

    .line 38
    const-string v0, "Jb7P/TeEcn4dpM7WFKx/biuNweA+oHU=\n"

    const-string v3, "dMugiVLFEQo=\n"

    invoke-static {v0, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 39
    :goto_8
    invoke-static {v15, v5, v0, v8, v12}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_14

    :cond_11
    cmpl-float v4, v4, v6

    if-lez v4, :cond_25

    const/4 v7, 0x1

    .line 40
    iput-boolean v7, v2, Lr9;->d:Z

    .line 41
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    .line 42
    iget v6, v0, Lq9;->b:I

    .line 43
    iget-object v7, v0, Lq9;->c:Ljava/lang/String;

    .line 44
    const-string v0, "\u6587\u672c\u590d\u8bfb\u4e2d\u65ad: "

    const-string v10, "\u8bed\u97f3\u590d\u8bfb\u4e2d\u65ad: "

    const-string v11, "\u5361\u7247\u590d\u8bfb\u4e2d\u65ad: "

    const-string v13, "2tBG6oMZ6g==\n"

    const-string v14, "t6Mho+1/hSo=\n"

    invoke-static {v13, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v3}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v13, "Yw4Gw3wN\n"

    const-string v14, "F29qqBl/mkI=\n"

    invoke-static {v13, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v7}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 45
    instance-of v13, v4, Landroid/app/Activity;

    if-eqz v13, :cond_12

    check-cast v4, Landroid/app/Activity;

    goto :goto_9

    :cond_12
    const/4 v4, 0x0

    :goto_9
    if-nez v4, :cond_13

    goto/16 :goto_14

    .line 46
    :cond_13
    const-string v13, ""

    const/4 v14, 0x1

    if-eq v6, v14, :cond_20

    const/4 v14, 0x3

    if-eq v6, v14, :cond_1f

    const/16 v0, 0x22

    if-eq v6, v0, :cond_1a

    const/16 v0, 0x2b

    if-eq v6, v0, :cond_1f

    const/16 v0, 0x2f

    if-eq v6, v0, :cond_19

    const/16 v0, 0x31

    if-eq v6, v0, :cond_14

    const v0, 0x31000031

    if-eq v6, v0, :cond_14

    .line 47
    :try_start_3
    sget-object v0, Lkn;->a:Lkn;

    const-string v3, "mVitY55sfKjQJKMGw0UX1NB5ySqCBiuHmlykYZBpfL3Q\n"

    const-string v10, "f8Ivhybhmjw=\n"

    invoke-static {v3, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v3}, Lkn;->k(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_14

    :catchall_2
    move-exception v0

    goto/16 :goto_13

    .line 48
    :cond_14
    sget-object v0, Lln;->h:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_15

    .line 49
    invoke-virtual {v0, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_a

    :cond_15
    const/4 v0, 0x0

    :goto_a
    instance-of v3, v0, Ljava/lang/String;

    if-eqz v3, :cond_16

    check-cast v0, Ljava/lang/String;

    goto :goto_b

    :cond_16
    const/4 v0, 0x0

    :goto_b
    if-nez v0, :cond_17

    goto :goto_c

    :cond_17
    move-object v13, v0

    .line 50
    :goto_c
    const-string v0, "kpViz/FYDlS/\n"

    const-string v3, "0vYKroUqYTs=\n"

    invoke-static {v0, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Li50;->A(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_18

    const-string v0, "c6QX/6hd0g==\n"

    const-string v3, "Sa4rkts67J8=\n"

    invoke-static {v0, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move/from16 v3, p3

    .line 51
    invoke-static {v13, v0, v3}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_18

    .line 52
    const-string v0, "AkU=\n"

    const-string v3, "OE8dPqKk4tY=\n"

    invoke-static {v0, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v13, v0}, Li50;->L(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Li50;->Q(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v13

    .line 53
    :cond_18
    sget-object v0, Lbw;->a:Landroid/os/Handler;

    .line 54
    sget-object v0, Lo9;->a:Ljava/lang/ClassLoader;

    .line 55
    invoke-static {v0, v7, v13}, Lbw;->c(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 56
    const-string v3, "RDZSLUH0KA==\n"

    const-string v10, "F2MRbgSne6M=\n"

    invoke-static {v3, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_25

    sget-object v3, Lkn;->a:Lkn;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v0}, Lkn;->k(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_14

    .line 57
    :cond_19
    invoke-static {v4, v3, v7}, Lju;->t(Landroid/app/Activity;Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_14

    .line 58
    :cond_1a
    sget-object v0, Lln;->g:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_1b

    .line 59
    invoke-virtual {v0, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_d

    :cond_1b
    const/4 v0, 0x0

    :goto_d
    instance-of v3, v0, Ljava/lang/String;

    if-eqz v3, :cond_1c

    check-cast v0, Ljava/lang/String;

    goto :goto_e

    :cond_1c
    const/4 v0, 0x0

    :goto_e
    if-nez v0, :cond_1d

    goto :goto_f

    :cond_1d
    move-object v13, v0

    .line 60
    :goto_f
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1e

    .line 61
    sget-object v0, Lbw;->a:Landroid/os/Handler;

    .line 62
    sget-object v0, Lo9;->a:Ljava/lang/ClassLoader;

    .line 63
    invoke-static {v0, v7, v13, v4}, Lbw;->e(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 64
    const-string v3, "FGUwnHVkFA==\n"

    const-string v11, "RzBz3zA3R2E=\n"

    invoke-static {v3, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_25

    sget-object v3, Lkn;->a:Lkn;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v0}, Lkn;->k(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_14

    .line 65
    :cond_1e
    sget-object v0, Lkn;->a:Lkn;

    const-string v3, "YFl3VM/G1ZI0FU4ZWl3WoSUbSSmI84fTCmsSE82Ur4VtSlVZ3vk=\n"

    const-string v10, "hf36vGB9MDY=\n"

    invoke-static {v3, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v3}, Lkn;->k(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_14

    .line 66
    :cond_1f
    sget-object v0, Lkn;->a:Lkn;

    const-string v3, "je+Jwj1pC4HP8t6HJQuA5IDbjMAOe8HY6pOGnlJ0po/03tGqJAur/w==\n"

    const-string v10, "aHQ3JbTuJGk=\n"

    invoke-static {v3, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v3}, Lkn;->k(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_14

    .line 67
    :cond_20
    sget-object v10, Lln;->h:Ljava/lang/reflect/Field;

    if-eqz v10, :cond_21

    .line 68
    invoke-virtual {v10, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_10

    :cond_21
    const/4 v3, 0x0

    :goto_10
    instance-of v10, v3, Ljava/lang/String;

    if-eqz v10, :cond_22

    check-cast v3, Ljava/lang/String;

    goto :goto_11

    :cond_22
    const/4 v3, 0x0

    :goto_11
    if-nez v3, :cond_23

    goto :goto_12

    :cond_23
    move-object v13, v3

    .line 69
    :goto_12
    const-string v3, "BPfqANz0eNsp\n"

    const-string v10, "RJSCYaiGF7Q=\n"

    invoke-static {v3, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v7, v3}, Li50;->A(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_24

    const-string v3, "AQc=\n"

    const-string v10, "Ow3b+05Me7Q=\n"

    invoke-static {v3, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v10, 0x0

    .line 70
    invoke-static {v13, v3, v10}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-eqz v3, :cond_24

    .line 71
    const-string v3, "q2U=\n"

    const-string v10, "kW8T89fT8j4=\n"

    invoke-static {v3, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v13, v3}, Li50;->L(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Li50;->Q(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v13

    .line 72
    :cond_24
    sget-object v3, Lbw;->a:Landroid/os/Handler;

    .line 73
    sget-object v3, Lo9;->a:Ljava/lang/ClassLoader;

    .line 74
    invoke-static {v3, v7, v13}, Lbw;->f(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 75
    const-string v10, "bNy8xat3Hg==\n"

    const-string v11, "P4n/hu4kTWQ=\n"

    invoke-static {v10, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v3, v10}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_25

    sget-object v10, Lkn;->a:Lkn;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v0}, Lkn;->k(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_14

    .line 76
    :goto_13
    sget-object v3, Lkn;->a:Lkn;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "\u590d\u8bfb\u903b\u8f91\u5f02\u5e38: "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v0}, Lkn;->k(Landroid/content/Context;Ljava/lang/String;)V

    .line 77
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "RepeatAction_Failed for type: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", talker: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_8

    .line 78
    :cond_25
    :goto_14
    sget v0, Ljc;->m:I

    .line 79
    const-string v3, "WCvISz0WrudFNsdaNg==\n"

    const-string v4, "DHmJBW5a77M=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const v3, 0x7e040001

    sget-object v4, Lo40;->m:Lsh;

    invoke-static {v1, v4, v3}, Lxh;->n(Landroid/view/ViewGroup;Lgf;I)Lo40;

    move-result-object v3

    .line 80
    const-string v4, "0fTOnrseqUE=\n"

    const-string v5, "g7ua3+9X5g8=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const v4, 0x7e040002

    sget-object v5, Lo40;->q:Lsh;

    invoke-static {v1, v5, v4}, Lxh;->n(Landroid/view/ViewGroup;Lgf;I)Lo40;

    move-result-object v4

    .line 81
    const-string v5, "dzFmsBoJQg==\n"

    const-string v6, "JHIn/F9WGnk=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const v5, 0x7e040003

    sget-object v6, Lo40;->o:Lsh;

    invoke-static {v1, v6, v5}, Lxh;->n(Landroid/view/ViewGroup;Lgf;I)Lo40;

    move-result-object v5

    .line 82
    const-string v6, "yp+2JTXPWg==\n"

    const-string v7, "mdz3aXCQA8g=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const v6, 0x7e040004

    sget-object v7, Lo40;->p:Lsh;

    invoke-static {v1, v7, v6}, Lxh;->n(Landroid/view/ViewGroup;Lgf;I)Lo40;

    move-result-object v6

    .line 83
    const-string v7, "c9D7nPU4cgVuzfSN/w==\n"

    const-string v8, "J4K60qZ0M1E=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const v7, 0x7e040006

    sget-object v8, Lo40;->n:Lsh;

    invoke-static {v1, v8, v7}, Lxh;->n(Landroid/view/ViewGroup;Lgf;I)Lo40;

    move-result-object v7

    const/4 v8, 0x4

    if-ne v0, v8, :cond_26

    .line 84
    iget-boolean v10, v2, Lr9;->d:Z

    if-eqz v10, :cond_26

    .line 85
    invoke-virtual {v3}, Lo40;->c()V

    invoke-virtual {v4}, Lo40;->c()V

    invoke-virtual {v5}, Lo40;->c()V

    invoke-virtual {v6}, Lo40;->c()V

    invoke-virtual {v7}, Lo40;->c()V

    .line 86
    new-instance v0, Leo;

    const/4 v10, 0x0

    invoke-direct {v0, v1, v5, v6, v10}, Leo;-><init>(Landroid/view/ViewGroup;Lo40;Lo40;I)V

    .line 87
    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    const/4 v7, 0x0

    invoke-virtual {v3, v7}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    invoke-virtual {v3, v7}, Landroid/view/ViewPropertyAnimator;->setUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    invoke-virtual {v3, v7}, Landroid/view/ViewPropertyAnimator;->withStartAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    invoke-virtual {v3, v7}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 88
    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const/high16 v3, 0x3fc00000    # 1.5f

    invoke-virtual {v1, v3}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const-wide/16 v3, 0x5a

    invoke-virtual {v1, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    new-instance v3, Landroid/view/animation/DecelerateInterpolator;

    const/high16 v4, 0x40000000    # 2.0f

    invoke-direct {v3, v4}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    invoke-virtual {v1, v3}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    :goto_15
    const/4 v10, 0x0

    goto/16 :goto_18

    :cond_26
    if-eqz v0, :cond_29

    const/4 v10, 0x2

    if-eq v0, v10, :cond_28

    if-eq v0, v8, :cond_27

    const v10, 0x44bb8000    # 1500.0f

    goto :goto_16

    :cond_27
    const/high16 v10, 0x42480000    # 50.0f

    goto :goto_16

    :cond_28
    const/high16 v10, 0x43480000    # 200.0f

    goto :goto_16

    :cond_29
    const v10, 0x461c4000    # 10000.0f

    :goto_16
    if-eqz v0, :cond_2d

    const/4 v14, 0x1

    if-eq v0, v14, :cond_2c

    const/4 v11, 0x2

    if-eq v0, v11, :cond_2b

    const v11, 0x3f19999a    # 0.6f

    const/4 v14, 0x3

    if-eq v0, v14, :cond_2e

    if-eq v0, v8, :cond_2a

    goto :goto_17

    :cond_2a
    const/high16 v11, 0x3f000000    # 0.5f

    goto :goto_17

    :cond_2b
    const v11, 0x3ee66666    # 0.45f

    goto :goto_17

    :cond_2c
    const v11, 0x3eb33333    # 0.35f

    goto :goto_17

    :cond_2d
    const v11, 0x3f4ccccd    # 0.8f

    .line 89
    :cond_2e
    :goto_17
    iput v9, v3, Lo40;->a:F

    const/high16 v0, 0x42340000    # 45.0f

    div-float/2addr v9, v0

    iput v9, v4, Lo40;->a:F

    .line 90
    iget-object v0, v3, Lo40;->k:Lp40;

    const/4 v8, 0x0

    if-eqz v0, :cond_2f

    float-to-double v12, v8

    .line 91
    iput-wide v12, v0, Lp40;->i:D

    .line 92
    invoke-virtual {v0, v10}, Lp40;->b(F)V

    invoke-virtual {v0, v11}, Lp40;->a(F)V

    .line 93
    :cond_2f
    iget-object v0, v4, Lo40;->k:Lp40;

    if-eqz v0, :cond_30

    float-to-double v12, v8

    .line 94
    iput-wide v12, v0, Lp40;->i:D

    .line 95
    invoke-virtual {v0, v10}, Lp40;->b(F)V

    invoke-virtual {v0, v11}, Lp40;->a(F)V

    .line 96
    :cond_30
    iget-object v0, v5, Lo40;->k:Lp40;

    const/high16 v8, 0x3f800000    # 1.0f

    if-eqz v0, :cond_31

    float-to-double v12, v8

    .line 97
    iput-wide v12, v0, Lp40;->i:D

    .line 98
    invoke-virtual {v0, v10}, Lp40;->b(F)V

    invoke-virtual {v0, v11}, Lp40;->a(F)V

    .line 99
    :cond_31
    iget-object v0, v6, Lo40;->k:Lp40;

    if-eqz v0, :cond_32

    float-to-double v12, v8

    .line 100
    iput-wide v12, v0, Lp40;->i:D

    .line 101
    invoke-virtual {v0, v10}, Lp40;->b(F)V

    invoke-virtual {v0, v11}, Lp40;->a(F)V

    .line 102
    :cond_32
    iget-object v0, v7, Lo40;->k:Lp40;

    if-eqz v0, :cond_33

    const/4 v8, 0x0

    float-to-double v12, v8

    .line 103
    iput-wide v12, v0, Lp40;->i:D

    .line 104
    invoke-virtual {v0, v10}, Lp40;->b(F)V

    invoke-virtual {v0, v11}, Lp40;->a(F)V

    .line 105
    :cond_33
    new-instance v0, Lfo;

    const/4 v10, 0x0

    invoke-direct {v0, v1, v3, v10}, Lfo;-><init>(Ljava/lang/Object;Lo40;I)V

    invoke-virtual {v3, v0}, Lo40;->a(Luh;)V

    .line 106
    invoke-virtual {v3}, Lo40;->h()V

    invoke-virtual {v4}, Lo40;->h()V

    invoke-virtual {v5}, Lo40;->h()V

    invoke-virtual {v6}, Lo40;->h()V

    invoke-virtual {v7}, Lo40;->h()V

    move-object/from16 v3, p1

    .line 107
    iget-object v0, v3, Lp9;->e:Landroid/view/View;

    const-wide/16 v3, 0x12c

    if-eqz v0, :cond_34

    .line 108
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    if-eqz v0, :cond_34

    const/4 v7, 0x0

    invoke-virtual {v0, v7}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    if-eqz v0, :cond_34

    invoke-virtual {v0, v7}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    if-eqz v0, :cond_34

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-virtual {v0, v8}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    if-eqz v0, :cond_34

    invoke-virtual {v0, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    if-eqz v0, :cond_34

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 109
    :cond_34
    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v7, 0x0

    invoke-virtual {v0, v7}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-virtual {v0, v8}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v8, 0x0

    invoke-virtual {v0, v8}, Landroid/view/ViewPropertyAnimator;->rotationX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/ViewPropertyAnimator;->rotationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-string v1, "SHgAfBv/JzBSchoQQKNobQ==\n"

    const-string v3, "Ox10OG6NRkQ=\n"

    invoke-static {v1, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    .line 110
    invoke-virtual {v0, v8}, Landroid/view/ViewPropertyAnimator;->translationZ(F)Landroid/view/ViewPropertyAnimator;

    .line 111
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    goto/16 :goto_15

    .line 112
    :goto_18
    iput-boolean v10, v2, Lr9;->c:Z

    .line 113
    iput-boolean v10, v2, Lr9;->e:Z

    .line 114
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    move-object/from16 v1, p5

    invoke-virtual {v1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    return-void

    :cond_35
    move-object/from16 v3, p1

    const/4 v8, 0x0

    .line 115
    invoke-virtual {v1}, Landroid/view/View;->getTranslationX()F

    move-result v0

    cmpg-float v0, v0, v8

    if-nez v0, :cond_36

    invoke-virtual {v1}, Landroid/view/View;->getScaleX()F

    move-result v0

    const/high16 v16, 0x3f800000    # 1.0f

    cmpg-float v0, v0, v16

    if-nez v0, :cond_36

    invoke-virtual {v1}, Landroid/view/View;->getRotation()F

    move-result v0

    cmpg-float v0, v0, v8

    if-nez v0, :cond_36

    return-void

    :cond_36
    invoke-static/range {p0 .. p1}, Lxh;->p(Landroid/view/View;Lp9;)V

    return-void
.end method

.method public static final d(Landroid/view/ViewGroup;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ILjm;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p2}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    invoke-virtual {v0, p0}, Landroid/view/View;->setVisibility(I)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v0, Landroid/widget/TextView;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    .line 22
    .line 23
    const/high16 p1, 0x41c00000    # 24.0f

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 26
    .line 27
    .line 28
    const/16 p1, 0x11

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 31
    .line 32
    .line 33
    new-instance p1, Landroid/graphics/drawable/GradientDrawable;

    .line 34
    .line 35
    invoke-direct {p1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string p2, "2zePALvp\n"

    .line 39
    .line 40
    const-string v1, "Oa0W7wNmw18=\n"

    .line 41
    .line 42
    invoke-static {p2, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-static {p3, p2}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    if-eqz p2, :cond_1

    .line 51
    .line 52
    const-string p2, "K0OvUP6vYDxO\n"

    .line 53
    .line 54
    const-string p3, "CAaZFrjpJno=\n"

    .line 55
    .line 56
    :goto_0
    invoke-static {p2, p3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    const-string p2, "HcBpc4Eku2UO\n"

    .line 66
    .line 67
    const-string p3, "PvlQQ7EUi1U=\n"

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :goto_1
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 71
    .line 72
    .line 73
    const/high16 p2, 0x42340000    # 45.0f

    .line 74
    .line 75
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 79
    .line 80
    .line 81
    const/16 p1, 0xf

    .line 82
    .line 83
    invoke-virtual {v0, p1, p1, p1, p1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 84
    .line 85
    .line 86
    const/high16 p1, 0x41200000    # 10.0f

    .line 87
    .line 88
    invoke-virtual {v0, p1}, Landroid/view/View;->setElevation(F)V

    .line 89
    .line 90
    .line 91
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 92
    .line 93
    const/16 p2, 0x78

    .line 94
    .line 95
    invoke-direct {p1, p2, p2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 96
    .line 97
    .line 98
    const p2, 0x800033

    .line 99
    .line 100
    .line 101
    iput p2, p1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 102
    .line 103
    const/16 p2, 0x32

    .line 104
    .line 105
    iput p2, p1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 106
    .line 107
    iput p4, p1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 108
    .line 109
    new-instance p2, Lm00;

    .line 110
    .line 111
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 112
    .line 113
    .line 114
    new-instance p3, Lm00;

    .line 115
    .line 116
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 117
    .line 118
    .line 119
    new-instance p4, Ll00;

    .line 120
    .line 121
    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    .line 122
    .line 123
    .line 124
    new-instance v1, Lo80;

    .line 125
    .line 126
    invoke-direct {v1, p2, p3, p4, p5}, Lo80;-><init>(Lm00;Lm00;Ll00;Ljm;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 130
    .line 131
    .line 132
    instance-of p2, p0, Landroid/widget/FrameLayout;

    .line 133
    .line 134
    if-eqz p2, :cond_2

    .line 135
    .line 136
    invoke-virtual {p0, v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 137
    .line 138
    .line 139
    :cond_2
    return-void
.end method

.method public static final e(Landroid/app/Activity;Landroid/view/ViewGroup;)V
    .locals 10

    .line 1
    new-instance v0, Ljava/util/LinkedList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget p1, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 28
    .line 29
    int-to-float p1, p1

    .line 30
    const v2, 0x3e19999a    # 0.15f

    .line 31
    .line 32
    .line 33
    mul-float/2addr p1, v2

    .line 34
    const/4 v2, 0x0

    .line 35
    move-object v3, v2

    .line 36
    :cond_0
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    const/4 v5, 0x1

    .line 41
    if-nez v4, :cond_3

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    check-cast v4, Landroid/view/View;

    .line 48
    .line 49
    instance-of v6, v4, Landroid/widget/TextView;

    .line 50
    .line 51
    if-eqz v6, :cond_2

    .line 52
    .line 53
    move-object v6, v4

    .line 54
    check-cast v6, Landroid/widget/TextView;

    .line 55
    .line 56
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-nez v7, :cond_2

    .line 61
    .line 62
    invoke-virtual {v6}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    const-string v8, "WFj7jFEqn4gRE6Hx\n"

    .line 67
    .line 68
    const-string v9, "Pz2P2DRS66A=\n"

    .line 69
    .line 70
    invoke-static {v8, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    invoke-static {v8, v7}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 78
    .line 79
    .line 80
    move-result v7

    .line 81
    if-lez v7, :cond_2

    .line 82
    .line 83
    const/4 v7, 0x2

    .line 84
    new-array v7, v7, [I

    .line 85
    .line 86
    invoke-virtual {v6, v7}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 87
    .line 88
    .line 89
    aget v5, v7, v5

    .line 90
    .line 91
    int-to-float v5, v5

    .line 92
    const/16 v7, 0xa

    .line 93
    .line 94
    int-to-float v7, v7

    .line 95
    mul-float/2addr v7, v1

    .line 96
    cmpl-float v7, v5, v7

    .line 97
    .line 98
    if-lez v7, :cond_2

    .line 99
    .line 100
    cmpg-float v5, v5, p1

    .line 101
    .line 102
    if-gez v5, :cond_2

    .line 103
    .line 104
    invoke-virtual {v6}, Landroid/widget/TextView;->getTextSize()F

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    const/high16 v7, 0x41600000    # 14.0f

    .line 109
    .line 110
    mul-float/2addr v7, v1

    .line 111
    cmpl-float v5, v5, v7

    .line 112
    .line 113
    if-lez v5, :cond_2

    .line 114
    .line 115
    if-eqz v3, :cond_1

    .line 116
    .line 117
    invoke-virtual {v6}, Landroid/widget/TextView;->getTextSize()F

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    invoke-virtual {v3}, Landroid/widget/TextView;->getTextSize()F

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    cmpl-float v5, v5, v7

    .line 126
    .line 127
    if-lez v5, :cond_2

    .line 128
    .line 129
    :cond_1
    move-object v3, v6

    .line 130
    :cond_2
    instance-of v5, v4, Landroid/view/ViewGroup;

    .line 131
    .line 132
    if-eqz v5, :cond_0

    .line 133
    .line 134
    check-cast v4, Landroid/view/ViewGroup;

    .line 135
    .line 136
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    const/4 v6, 0x0

    .line 141
    :goto_0
    if-ge v6, v5, :cond_0

    .line 142
    .line 143
    invoke-virtual {v4, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 144
    .line 145
    .line 146
    move-result-object v7

    .line 147
    invoke-virtual {v0, v7}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    add-int/lit8 v6, v6, 0x1

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_3
    if-nez v3, :cond_4

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_4
    const p1, 0x7e120015

    .line 157
    .line 158
    .line 159
    invoke-virtual {v3, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 164
    .line 165
    invoke-static {v0, v1}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eqz v0, :cond_5

    .line 170
    .line 171
    :goto_1
    return-void

    .line 172
    :cond_5
    invoke-virtual {v3, p1, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    const p1, 0x7e120007

    .line 176
    .line 177
    .line 178
    invoke-virtual {v3, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    instance-of v1, v0, Ljava/lang/Integer;

    .line 183
    .line 184
    if-eqz v1, :cond_6

    .line 185
    .line 186
    move-object v2, v0

    .line 187
    check-cast v2, Ljava/lang/Integer;

    .line 188
    .line 189
    :cond_6
    if-eqz v2, :cond_7

    .line 190
    .line 191
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    goto :goto_2

    .line 196
    :cond_7
    invoke-virtual {v3}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    :goto_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-virtual {v3, p1, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    new-instance p1, Lp00;

    .line 208
    .line 209
    invoke-direct {p1}, Lp00;-><init>()V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    iput-object v1, p1, Lp00;->b:Ljava/lang/Object;

    .line 221
    .line 222
    new-instance v1, Lq80;

    .line 223
    .line 224
    invoke-direct {v1, v3, p1, v0}, Lq80;-><init>(Landroid/widget/TextView;Lp00;I)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v3, v5}, Landroid/view/View;->setClickable(Z)V

    .line 231
    .line 232
    .line 233
    new-instance v0, Lx6;

    .line 234
    .line 235
    const/4 v1, 0x4

    .line 236
    invoke-direct {v0, p0, v3, p1, v1}, Lx6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    invoke-virtual {v3, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 247
    .line 248
    .line 249
    return-void
.end method

.method public static final f([BLjava/lang/ClassLoader;)[B
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    :try_start_0
    sget-object v0, Lub0;->f1:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0, p1}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sget-object v0, Lub0;->h1:Ljava/lang/String;

    .line 16
    .line 17
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {p1, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    sget-object v0, Lub0;->g1:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {p1, v0}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    instance-of v1, v0, Ljava/lang/String;

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    move-object v1, v0

    .line 35
    check-cast v1, Ljava/lang/String;

    .line 36
    .line 37
    sget-object v2, Lub0;->e1:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1, v2}, Li50;->K(Ljava/lang/String;Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_1

    .line 44
    .line 45
    sget-object v1, Lub0;->g1:Ljava/lang/String;

    .line 46
    .line 47
    sget-object v2, Lub0;->e1:Ljava/lang/String;

    .line 48
    .line 49
    new-instance v3, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {p1, v1, v0}, Lde/robv/android/xposed/XposedHelpers;->setObjectField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :cond_1
    sget-object v0, Lub0;->i1:Ljava/lang/String;

    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    new-array v1, v1, [Ljava/lang/Object;

    .line 71
    .line 72
    invoke-static {p1, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    const-string v0, "50r46p1q4NrnUOCm32yh1+hM4KbJZqHa5lG56Mhl7ZT9RuTjnWLuwOVW+qj/cPXRyE3m58Q=\n"

    .line 77
    .line 78
    const-string v1, "iT+Uhr0JgbQ=\n"

    .line 79
    .line 80
    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-static {v0, p1}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    check-cast p1, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    .line 89
    return-object p1

    .line 90
    :catchall_0
    const-string p1, "kWa3YNfxm1esfJRR1+iZeq1nrw==\n"

    .line 91
    .line 92
    const-string v0, "wgjEI7ic9jI=\n"

    .line 93
    .line 94
    invoke-static {p1, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    const-string v0, "tw==\n"

    .line 99
    .line 100
    const-string v1, "0vI8ySRxU5w=\n"

    .line 101
    .line 102
    const-string v2, "06ke\n"

    .line 103
    .line 104
    const-string v3, "p8h5VTpLcuY=\n"

    .line 105
    .line 106
    invoke-static {v2, v3, p1, v0, v1}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-object p0
.end method

.method public static final g(Landroid/app/Activity;)V
    .locals 7

    .line 1
    sget-object v0, Lu6;->a:Lu6;

    .line 2
    .line 3
    const-string v1, "LI6sRBoecB4olQ==\n"

    .line 4
    .line 5
    const-string v2, "TfvYLEVqH3U=\n"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, ""

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Lu6;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    new-instance v0, Lsu;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, v1}, Lsu;-><init>(Landroid/app/Activity;I)V

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-static {p0, v0}, Lxh;->t(Landroid/app/Activity;Ljm;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    invoke-static {v0}, Lju;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const-string v1, "jw==\n"

    .line 48
    .line 49
    const-string v3, "87+hVShC2IY=\n"

    .line 50
    .line 51
    invoke-static {v1, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    filled-new-array {v1}, [Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {v0, v1}, Li50;->J(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    const/4 v3, 0x3

    .line 68
    if-eq v1, v3, :cond_2

    .line 69
    .line 70
    :goto_1
    new-instance v0, Lsu;

    .line 71
    .line 72
    const/4 v1, 0x0

    .line 73
    invoke-direct {v0, p0, v1}, Lsu;-><init>(Landroid/app/Activity;I)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    :try_start_0
    const-string v1, "xg==\n"

    .line 78
    .line 79
    const-string v3, "uoKufJdXULc=\n"

    .line 80
    .line 81
    invoke-static {v1, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    filled-new-array {v1}, [Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-static {v0, v1}, Li50;->J(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    const/4 v1, 0x0

    .line 94
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    check-cast v1, Ljava/lang/String;

    .line 99
    .line 100
    const/4 v3, 0x1

    .line 101
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    check-cast v3, Ljava/lang/String;

    .line 106
    .line 107
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 108
    .line 109
    .line 110
    move-result-wide v3

    .line 111
    const/4 v5, 0x2

    .line 112
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    sget-object v5, Lu6;->g:Ljava/lang/String;

    .line 123
    .line 124
    invoke-static {v1, v5}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-nez v1, :cond_3

    .line 129
    .line 130
    new-instance v0, Lsu;

    .line 131
    .line 132
    const/4 v1, 0x0

    .line 133
    invoke-direct {v0, p0, v1}, Lsu;-><init>(Landroid/app/Activity;I)V

    .line 134
    .line 135
    .line 136
    :goto_2
    invoke-static {p0, v0}, Lxh;->t(Landroid/app/Activity;Ljm;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 141
    .line 142
    .line 143
    move-result-wide v5

    .line 144
    cmp-long v1, v5, v3

    .line 145
    .line 146
    if-lez v1, :cond_4

    .line 147
    .line 148
    new-instance v0, Lsu;

    .line 149
    .line 150
    const/4 v1, 0x0

    .line 151
    invoke-direct {v0, p0, v1}, Lsu;-><init>(Landroid/app/Activity;I)V

    .line 152
    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_4
    sget v1, Lu6;->c:I

    .line 156
    .line 157
    if-eq v0, v1, :cond_5

    .line 158
    .line 159
    const-string v0, "GfyvTzyJDcsd5w==\n"

    .line 160
    .line 161
    const-string v1, "eInbJ2P9YqA=\n"

    .line 162
    .line 163
    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-static {v0, v2}, Lu6;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    new-instance v0, Lsu;

    .line 171
    .line 172
    const/4 v1, 0x0

    .line 173
    invoke-direct {v0, p0, v1}, Lsu;-><init>(Landroid/app/Activity;I)V

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_5
    sget-object v0, Lz20;->a:Lz20;

    .line 178
    .line 179
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-static {p0}, Lz20;->a(Landroid/app/Activity;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 183
    .line 184
    .line 185
    return-void

    .line 186
    :catch_0
    new-instance v0, Lsu;

    .line 187
    .line 188
    const/4 v1, 0x0

    .line 189
    invoke-direct {v0, p0, v1}, Lsu;-><init>(Landroid/app/Activity;I)V

    .line 190
    .line 191
    .line 192
    goto/16 :goto_0
.end method

.method public static h(Landroid/content/Context;I)Lxh;
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    move v2, v0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move v2, v1

    .line 8
    :goto_0
    const-string v3, "Cannot create a CalendarItemStyle with a styleResId of 0"

    .line 9
    .line 10
    invoke-static {v3, v2}, Lmu;->b(Ljava/lang/String;Z)V

    .line 11
    .line 12
    .line 13
    sget-object v2, Ldz;->m:[I

    .line 14
    .line 15
    invoke-virtual {p0, p1, v2}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1, v1, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, 0x2

    .line 24
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v4, 0x3

    .line 33
    invoke-virtual {p1, v4, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    new-instance v5, Landroid/graphics/Rect;

    .line 38
    .line 39
    invoke-direct {v5, v2, v3, v0, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x4

    .line 43
    invoke-static {p0, p1, v0}, Lgu;->i(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 44
    .line 45
    .line 46
    const/16 v0, 0x9

    .line 47
    .line 48
    invoke-static {p0, p1, v0}, Lgu;->i(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 49
    .line 50
    .line 51
    const/4 v0, 0x7

    .line 52
    invoke-static {p0, p1, v0}, Lgu;->i(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 53
    .line 54
    .line 55
    const/16 v0, 0x8

    .line 56
    .line 57
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 58
    .line 59
    .line 60
    const/4 v0, 0x5

    .line 61
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    const/4 v2, 0x6

    .line 66
    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    new-instance v3, Le;

    .line 71
    .line 72
    int-to-float v1, v1

    .line 73
    invoke-direct {v3, v1}, Le;-><init>(F)V

    .line 74
    .line 75
    .line 76
    invoke-static {p0, v0, v2, v3}, Lm30;->a(Landroid/content/Context;IILe;)Ll30;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0}, Ll30;->a()Lm30;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 84
    .line 85
    .line 86
    new-instance p0, Lxh;

    .line 87
    .line 88
    const/16 p1, 0x11

    .line 89
    .line 90
    invoke-direct {p0, p1}, Lxh;-><init>(I)V

    .line 91
    .line 92
    .line 93
    iget p1, v5, Landroid/graphics/Rect;->left:I

    .line 94
    .line 95
    invoke-static {p1}, Lmu;->c(I)V

    .line 96
    .line 97
    .line 98
    iget p1, v5, Landroid/graphics/Rect;->top:I

    .line 99
    .line 100
    invoke-static {p1}, Lmu;->c(I)V

    .line 101
    .line 102
    .line 103
    iget p1, v5, Landroid/graphics/Rect;->right:I

    .line 104
    .line 105
    invoke-static {p1}, Lmu;->c(I)V

    .line 106
    .line 107
    .line 108
    iget p1, v5, Landroid/graphics/Rect;->bottom:I

    .line 109
    .line 110
    invoke-static {p1}, Lmu;->c(I)V

    .line 111
    .line 112
    .line 113
    return-object p0
.end method

.method public static i(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ILum;)Landroid/widget/TextView;
    .locals 2

    .line 1
    new-instance v0, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    const/high16 p1, 0x41800000    # 16.0f

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 15
    .line 16
    .line 17
    const/16 p1, 0x11

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const/4 p3, 0x1

    .line 27
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 28
    .line 29
    .line 30
    new-instance p1, Landroid/graphics/drawable/GradientDrawable;

    .line 31
    .line 32
    invoke-direct {p1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 40
    .line 41
    .line 42
    const/high16 p2, 0x41400000    # 12.0f

    .line 43
    .line 44
    invoke-static {p0, p2}, Lxh;->j(Landroid/app/Activity;F)I

    .line 45
    .line 46
    .line 47
    move-result p3

    .line 48
    int-to-float p3, p3

    .line 49
    invoke-virtual {p1, p3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 53
    .line 54
    .line 55
    const/high16 p1, 0x41600000    # 14.0f

    .line 56
    .line 57
    invoke-static {p0, p1}, Lxh;->j(Landroid/app/Activity;F)I

    .line 58
    .line 59
    .line 60
    move-result p3

    .line 61
    invoke-static {p0, p1}, Lxh;->j(Landroid/app/Activity;F)I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    const/4 v1, 0x0

    .line 66
    invoke-virtual {v0, v1, p3, v1, p1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 67
    .line 68
    .line 69
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 70
    .line 71
    const/4 p3, -0x1

    .line 72
    const/4 v1, -0x2

    .line 73
    invoke-direct {p1, p3, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 74
    .line 75
    .line 76
    invoke-static {p0, p2}, Lxh;->j(Landroid/app/Activity;F)I

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    iput p0, p1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 81
    .line 82
    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 83
    .line 84
    .line 85
    new-instance p0, Lo40;

    .line 86
    .line 87
    sget-object p1, Lo40;->o:Lsh;

    .line 88
    .line 89
    const/high16 p2, 0x3f800000    # 1.0f

    .line 90
    .line 91
    invoke-direct {p0, v0, p1, p2}, Lo40;-><init>(Landroid/view/View;Lgf;F)V

    .line 92
    .line 93
    .line 94
    new-instance p1, Lo40;

    .line 95
    .line 96
    sget-object p3, Lo40;->p:Lsh;

    .line 97
    .line 98
    invoke-direct {p1, v0, p3, p2}, Lo40;-><init>(Landroid/view/View;Lgf;F)V

    .line 99
    .line 100
    .line 101
    iget-object p2, p0, Lo40;->k:Lp40;

    .line 102
    .line 103
    const p3, 0x461c4000    # 10000.0f

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2, p3}, Lp40;->b(F)V

    .line 107
    .line 108
    .line 109
    iget-object p2, p1, Lo40;->k:Lp40;

    .line 110
    .line 111
    invoke-virtual {p2, p3}, Lp40;->b(F)V

    .line 112
    .line 113
    .line 114
    new-instance p2, Lz6;

    .line 115
    .line 116
    const/4 p3, 0x0

    .line 117
    invoke-direct {p2, p0, p1, p4, p3}, Lz6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, p2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 121
    .line 122
    .line 123
    return-object v0
.end method

.method public static j(Landroid/app/Activity;F)I
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

.method public static k(Landroid/view/View;)Landroid/widget/ImageView;
    .locals 5

    .line 1
    instance-of v0, p0, Landroid/widget/ImageView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Landroid/widget/ImageView;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    check-cast p0, Landroid/view/ViewGroup;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    :goto_0
    if-ge v1, v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const-string v3, "ps/EZhP8vzuA3pgLVbv6\n"

    .line 26
    .line 27
    const-string v4, "waqwJXuV018=\n"

    .line 28
    .line 29
    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-static {v3, v2}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v2}, Lxh;->k(Landroid/view/View;)Landroid/widget/ImageView;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    return-object v2

    .line 43
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/4 p0, 0x0

    .line 47
    return-object p0
.end method

.method public static l(Landroid/view/View;)Landroid/widget/TextView;
    .locals 5

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
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    check-cast p0, Landroid/view/ViewGroup;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    :goto_0
    if-ge v1, v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const-string v3, "9UI/D1EcdnjTU2NiF1sz\n"

    .line 26
    .line 27
    const-string v4, "kidLTDl1Ghw=\n"

    .line 28
    .line 29
    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-static {v3, v2}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v2}, Lxh;->l(Landroid/view/View;)Landroid/widget/TextView;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    return-object v2

    .line 43
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/4 p0, 0x0

    .line 47
    return-object p0
.end method

.method public static n(Landroid/view/ViewGroup;Lgf;I)Lo40;
    .locals 2

    .line 1
    invoke-virtual {p0, p2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lo40;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lo40;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-nez v0, :cond_5

    .line 14
    .line 15
    new-instance v0, Lo40;

    .line 16
    .line 17
    invoke-direct {v0, p0, p1}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lp40;

    .line 21
    .line 22
    invoke-direct {v1}, Lp40;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v1, v0, Lo40;->k:Lp40;

    .line 26
    .line 27
    sget-object v1, Lo40;->o:Lsh;

    .line 28
    .line 29
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_4

    .line 34
    .line 35
    sget-object v1, Lo40;->p:Lsh;

    .line 36
    .line 37
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_1
    sget-object v1, Lo40;->q:Lsh;

    .line 45
    .line 46
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_3

    .line 51
    .line 52
    sget-object v1, Lo40;->r:Lsh;

    .line 53
    .line 54
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-nez v1, :cond_3

    .line 59
    .line 60
    sget-object v1, Lo40;->s:Lsh;

    .line 61
    .line 62
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_2

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    const/high16 p1, 0x3f800000    # 1.0f

    .line 70
    .line 71
    invoke-virtual {v0, p1}, Lo40;->f(F)V

    .line 72
    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_3
    :goto_1
    const p1, 0x3dcccccd    # 0.1f

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p1}, Lo40;->f(F)V

    .line 79
    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_4
    :goto_2
    const p1, 0x3b03126f    # 0.002f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, p1}, Lo40;->f(F)V

    .line 86
    .line 87
    .line 88
    :goto_3
    invoke-virtual {p0, p2, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_5
    return-object v0
.end method

.method public static o(Lli;Landroid/text/Editable;IIZ)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_19

    .line 3
    .line 4
    if-ltz p2, :cond_19

    .line 5
    .line 6
    if-gez p3, :cond_0

    .line 7
    .line 8
    goto/16 :goto_9

    .line 9
    .line 10
    :cond_0
    invoke-static {p1}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {p1}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, -0x1

    .line 19
    if-eq v1, v3, :cond_19

    .line 20
    .line 21
    if-eq v2, v3, :cond_19

    .line 22
    .line 23
    if-eq v1, v2, :cond_1

    .line 24
    .line 25
    goto/16 :goto_9

    .line 26
    .line 27
    :cond_1
    const/4 v4, 0x1

    .line 28
    if-eqz p4, :cond_16

    .line 29
    .line 30
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 35
    .line 36
    .line 37
    move-result p4

    .line 38
    if-ltz v1, :cond_3

    .line 39
    .line 40
    if-ge p4, v1, :cond_2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    if-gez p2, :cond_4

    .line 44
    .line 45
    :cond_3
    :goto_0
    move v1, v3

    .line 46
    goto :goto_3

    .line 47
    :cond_4
    :goto_1
    move p4, v0

    .line 48
    :goto_2
    if-nez p2, :cond_5

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_5
    add-int/lit8 v1, v1, -0x1

    .line 52
    .line 53
    if-gez v1, :cond_7

    .line 54
    .line 55
    if-eqz p4, :cond_6

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_6
    move v1, v0

    .line 59
    goto :goto_3

    .line 60
    :cond_7
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz p4, :cond_9

    .line 65
    .line 66
    invoke-static {v5}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 67
    .line 68
    .line 69
    move-result p4

    .line 70
    if-nez p4, :cond_8

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_8
    add-int/lit8 p2, p2, -0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_9
    invoke-static {v5}, Ljava/lang/Character;->isSurrogate(C)Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    if-nez v6, :cond_a

    .line 81
    .line 82
    add-int/lit8 p2, p2, -0x1

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_a
    invoke-static {v5}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 86
    .line 87
    .line 88
    move-result p4

    .line 89
    if-eqz p4, :cond_b

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_b
    move p4, v4

    .line 93
    goto :goto_2

    .line 94
    :goto_3
    invoke-static {p3, v0}, Ljava/lang/Math;->max(II)I

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 99
    .line 100
    .line 101
    move-result p3

    .line 102
    if-ltz v2, :cond_d

    .line 103
    .line 104
    if-ge p3, v2, :cond_c

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_c
    if-gez p2, :cond_e

    .line 108
    .line 109
    :cond_d
    :goto_4
    move p3, v3

    .line 110
    goto :goto_7

    .line 111
    :cond_e
    :goto_5
    move p4, v0

    .line 112
    :goto_6
    if-nez p2, :cond_f

    .line 113
    .line 114
    move p3, v2

    .line 115
    goto :goto_7

    .line 116
    :cond_f
    if-lt v2, p3, :cond_10

    .line 117
    .line 118
    if-eqz p4, :cond_15

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_10
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    if-eqz p4, :cond_12

    .line 126
    .line 127
    invoke-static {v5}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 128
    .line 129
    .line 130
    move-result p4

    .line 131
    if-nez p4, :cond_11

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_11
    add-int/lit8 p2, p2, -0x1

    .line 135
    .line 136
    add-int/lit8 v2, v2, 0x1

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_12
    invoke-static {v5}, Ljava/lang/Character;->isSurrogate(C)Z

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    if-nez v6, :cond_13

    .line 144
    .line 145
    add-int/lit8 p2, p2, -0x1

    .line 146
    .line 147
    add-int/lit8 v2, v2, 0x1

    .line 148
    .line 149
    goto :goto_6

    .line 150
    :cond_13
    invoke-static {v5}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 151
    .line 152
    .line 153
    move-result p4

    .line 154
    if-eqz p4, :cond_14

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_14
    add-int/lit8 v2, v2, 0x1

    .line 158
    .line 159
    move p4, v4

    .line 160
    goto :goto_6

    .line 161
    :cond_15
    :goto_7
    if-eq v1, v3, :cond_19

    .line 162
    .line 163
    if-ne p3, v3, :cond_17

    .line 164
    .line 165
    goto :goto_9

    .line 166
    :cond_16
    sub-int/2addr v1, p2

    .line 167
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    add-int/2addr v2, p3

    .line 172
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 173
    .line 174
    .line 175
    move-result p2

    .line 176
    invoke-static {v2, p2}, Ljava/lang/Math;->min(II)I

    .line 177
    .line 178
    .line 179
    move-result p3

    .line 180
    :cond_17
    const-class p2, Lm80;

    .line 181
    .line 182
    invoke-interface {p1, v1, p3, p2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    check-cast p2, [Lm80;

    .line 187
    .line 188
    if-eqz p2, :cond_19

    .line 189
    .line 190
    array-length p4, p2

    .line 191
    if-lez p4, :cond_19

    .line 192
    .line 193
    array-length p4, p2

    .line 194
    move v2, v0

    .line 195
    :goto_8
    if-ge v2, p4, :cond_18

    .line 196
    .line 197
    aget-object v3, p2, v2

    .line 198
    .line 199
    invoke-interface {p1, v3}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    invoke-interface {p1, v3}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    invoke-static {v3, p3}, Ljava/lang/Math;->max(II)I

    .line 212
    .line 213
    .line 214
    move-result p3

    .line 215
    add-int/lit8 v2, v2, 0x1

    .line 216
    .line 217
    goto :goto_8

    .line 218
    :cond_18
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 219
    .line 220
    .line 221
    move-result p2

    .line 222
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 223
    .line 224
    .line 225
    move-result p4

    .line 226
    invoke-static {p3, p4}, Ljava/lang/Math;->min(II)I

    .line 227
    .line 228
    .line 229
    move-result p3

    .line 230
    invoke-virtual {p0}, Landroid/view/inputmethod/InputConnectionWrapper;->beginBatchEdit()Z

    .line 231
    .line 232
    .line 233
    invoke-interface {p1, p2, p3}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0}, Landroid/view/inputmethod/InputConnectionWrapper;->endBatchEdit()Z

    .line 237
    .line 238
    .line 239
    return v4

    .line 240
    :cond_19
    :goto_9
    return v0
.end method

.method public static p(Landroid/view/View;Lp9;)V
    .locals 4

    .line 1
    const-string v0, "IQ==\n"

    .line 2
    .line 3
    const-string v1, "V60HzyczK6k=\n"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0, p0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/view/ViewPropertyAnimator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withStartAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 30
    .line 31
    .line 32
    iget-object v0, p1, Lp9;->e:Landroid/view/View;

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/view/ViewPropertyAnimator;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withStartAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-eqz v0, :cond_0

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 61
    .line 62
    .line 63
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 68
    .line 69
    .line 70
    iget-object v0, p1, Lp9;->e:Landroid/view/View;

    .line 71
    .line 72
    if-eqz v0, :cond_1

    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-eqz v0, :cond_1

    .line 79
    .line 80
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 81
    .line 82
    .line 83
    :cond_1
    const v0, 0x7e040007

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    instance-of v3, v2, Ljava/lang/Runnable;

    .line 91
    .line 92
    if-eqz v3, :cond_2

    .line 93
    .line 94
    check-cast v2, Ljava/lang/Runnable;

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    move-object v2, v1

    .line 98
    :goto_0
    if-eqz v2, :cond_3

    .line 99
    .line 100
    invoke-virtual {p0, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :cond_3
    const v0, 0x7e040001

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    instance-of v2, v0, Lo40;

    .line 114
    .line 115
    if-eqz v2, :cond_4

    .line 116
    .line 117
    check-cast v0, Lo40;

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_4
    move-object v0, v1

    .line 121
    :goto_1
    if-eqz v0, :cond_5

    .line 122
    .line 123
    iget-boolean v2, v0, Lo40;->e:Z

    .line 124
    .line 125
    if-eqz v2, :cond_5

    .line 126
    .line 127
    invoke-virtual {v0}, Lo40;->c()V

    .line 128
    .line 129
    .line 130
    :cond_5
    const v0, 0x7e040002

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    instance-of v2, v0, Lo40;

    .line 138
    .line 139
    if-eqz v2, :cond_6

    .line 140
    .line 141
    check-cast v0, Lo40;

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_6
    move-object v0, v1

    .line 145
    :goto_2
    if-eqz v0, :cond_7

    .line 146
    .line 147
    iget-boolean v2, v0, Lo40;->e:Z

    .line 148
    .line 149
    if-eqz v2, :cond_7

    .line 150
    .line 151
    invoke-virtual {v0}, Lo40;->c()V

    .line 152
    .line 153
    .line 154
    :cond_7
    const v0, 0x7e040003

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    instance-of v2, v0, Lo40;

    .line 162
    .line 163
    if-eqz v2, :cond_8

    .line 164
    .line 165
    check-cast v0, Lo40;

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_8
    move-object v0, v1

    .line 169
    :goto_3
    if-eqz v0, :cond_9

    .line 170
    .line 171
    iget-boolean v2, v0, Lo40;->e:Z

    .line 172
    .line 173
    if-eqz v2, :cond_9

    .line 174
    .line 175
    invoke-virtual {v0}, Lo40;->c()V

    .line 176
    .line 177
    .line 178
    :cond_9
    const v0, 0x7e040004

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    instance-of v2, v0, Lo40;

    .line 186
    .line 187
    if-eqz v2, :cond_a

    .line 188
    .line 189
    check-cast v0, Lo40;

    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_a
    move-object v0, v1

    .line 193
    :goto_4
    if-eqz v0, :cond_b

    .line 194
    .line 195
    iget-boolean v2, v0, Lo40;->e:Z

    .line 196
    .line 197
    if-eqz v2, :cond_b

    .line 198
    .line 199
    invoke-virtual {v0}, Lo40;->c()V

    .line 200
    .line 201
    .line 202
    :cond_b
    const v0, 0x7e040006

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    instance-of v2, v0, Lo40;

    .line 210
    .line 211
    if-eqz v2, :cond_c

    .line 212
    .line 213
    check-cast v0, Lo40;

    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_c
    move-object v0, v1

    .line 217
    :goto_5
    if-eqz v0, :cond_d

    .line 218
    .line 219
    iget-boolean v2, v0, Lo40;->e:Z

    .line 220
    .line 221
    if-eqz v2, :cond_d

    .line 222
    .line 223
    invoke-virtual {v0}, Lo40;->c()V

    .line 224
    .line 225
    .line 226
    :cond_d
    const/4 v0, 0x0

    .line 227
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p0, v0}, Landroid/view/View;->setRotation(F)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0, v0}, Landroid/view/View;->setRotationX(F)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p0, v0}, Landroid/view/View;->setRotationY(F)V

    .line 240
    .line 241
    .line 242
    const/high16 v2, 0x3f800000    # 1.0f

    .line 243
    .line 244
    invoke-virtual {p0, v2}, Landroid/view/View;->setScaleX(F)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p0, v2}, Landroid/view/View;->setScaleY(F)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {p0, v2}, Landroid/view/View;->setAlpha(F)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationZ(F)V

    .line 254
    .line 255
    .line 256
    iget-object v0, p1, Lp9;->e:Landroid/view/View;

    .line 257
    .line 258
    if-eqz v0, :cond_e

    .line 259
    .line 260
    invoke-virtual {v0, v2}, Landroid/view/View;->setAlpha(F)V

    .line 261
    .line 262
    .line 263
    :cond_e
    iget-object v0, p1, Lp9;->e:Landroid/view/View;

    .line 264
    .line 265
    if-eqz v0, :cond_f

    .line 266
    .line 267
    invoke-virtual {v0, v2}, Landroid/view/View;->setScaleX(F)V

    .line 268
    .line 269
    .line 270
    :cond_f
    iget-object v0, p1, Lp9;->e:Landroid/view/View;

    .line 271
    .line 272
    if-eqz v0, :cond_10

    .line 273
    .line 274
    invoke-virtual {v0, v2}, Landroid/view/View;->setScaleY(F)V

    .line 275
    .line 276
    .line 277
    :cond_10
    const/4 v0, 0x0

    .line 278
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 279
    .line 280
    .line 281
    iget-object p0, p1, Lp9;->g:Lr9;

    .line 282
    .line 283
    if-eqz p0, :cond_11

    .line 284
    .line 285
    iput-boolean v0, p0, Lr9;->c:Z

    .line 286
    .line 287
    iput-boolean v0, p0, Lr9;->d:Z

    .line 288
    .line 289
    iput-boolean v0, p0, Lr9;->e:Z

    .line 290
    .line 291
    :cond_11
    return-void
.end method

.method public static r([BLjava/lang/ClassLoader;)[B
    .locals 4

    .line 1
    const-string v0, "QWlizeQh\n"

    .line 2
    .line 3
    const-string v1, "LQYDqYFTL/g=\n"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return-object p0

    .line 12
    :cond_0
    :try_start_0
    sget-object v0, Lub0;->a1:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v0, p1}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    sget-object v0, Lub0;->b1:Ljava/lang/String;

    .line 23
    .line 24
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {p1, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    sget-object v0, Lub0;->d1:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {p1, v0}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    instance-of v1, v0, Ljava/lang/String;

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    move-object v1, v0

    .line 42
    check-cast v1, Ljava/lang/String;

    .line 43
    .line 44
    sget-object v2, Lub0;->e1:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v1, v2}, Li50;->K(Ljava/lang/String;Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_1

    .line 51
    .line 52
    sget-object v1, Lub0;->d1:Ljava/lang/String;

    .line 53
    .line 54
    sget-object v2, Lub0;->e1:Ljava/lang/String;

    .line 55
    .line 56
    new-instance v3, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {p1, v1, v0}, Lde/robv/android/xposed/XposedHelpers;->setObjectField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :cond_1
    sget-object v0, Lub0;->c1:Ljava/lang/String;

    .line 75
    .line 76
    const/4 v1, 0x0

    .line 77
    new-array v1, v1, [Ljava/lang/Object;

    .line 78
    .line 79
    invoke-static {p1, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    const-string v0, "+03RoBEoazn7V8nsUy4qNPRLyexFJCo5+laQokQnZnfhQc2pESBlI/lR0+JzMn4y1ErPrUg=\n"

    .line 84
    .line 85
    const-string v1, "lTi9zDFLClc=\n"

    .line 86
    .line 87
    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {v0, p1}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    check-cast p1, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    .line 96
    return-object p1

    .line 97
    :catchall_0
    const-string p1, "QM+IbnN6ejBbzpRV\n"

    .line 98
    .line 99
    const-string v0, "E6H7PgEVDl8=\n"

    .line 100
    .line 101
    invoke-static {p1, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    const-string v0, "tw==\n"

    .line 106
    .line 107
    const-string v1, "0vI8ySRxU5w=\n"

    .line 108
    .line 109
    const-string v2, "06ke\n"

    .line 110
    .line 111
    const-string v3, "p8h5VTpLcuY=\n"

    .line 112
    .line 113
    invoke-static {v2, v3, p1, v0, v1}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-object p0
.end method

.method public static s(Landroid/app/Activity;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/TextView;
    .locals 8

    .line 1
    new-instance v0, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    const/high16 p3, 0x41700000    # 15.0f

    .line 10
    .line 11
    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 12
    .line 13
    .line 14
    const-string p3, "Enayj50Hcg==\n"

    .line 15
    .line 16
    const-string v1, "MUaFzKwxQnk=\n"

    .line 17
    .line 18
    invoke-static {p3, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 27
    .line 28
    .line 29
    const/4 p3, 0x0

    .line 30
    const/4 v1, 0x1

    .line 31
    invoke-virtual {v0, p3, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 32
    .line 33
    .line 34
    new-instance p3, Landroid/graphics/drawable/GradientDrawable;

    .line 35
    .line 36
    invoke-direct {p3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 37
    .line 38
    .line 39
    const/4 v1, -0x1

    .line 40
    invoke-virtual {p3, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 41
    .line 42
    .line 43
    const/high16 v1, 0x41c00000    # 24.0f

    .line 44
    .line 45
    invoke-virtual {p3, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, p3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 49
    .line 50
    .line 51
    const/4 p3, 0x0

    .line 52
    const/16 v1, 0x1e

    .line 53
    .line 54
    invoke-virtual {v0, p3, v1, p3, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 55
    .line 56
    .line 57
    const/16 v1, 0x11

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 60
    .line 61
    .line 62
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 63
    .line 64
    const/4 v2, -0x2

    .line 65
    const/high16 v3, 0x3f800000    # 1.0f

    .line 66
    .line 67
    invoke-direct {v1, p3, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 68
    .line 69
    .line 70
    const/16 p3, 0xa

    .line 71
    .line 72
    invoke-virtual {v1, p3, p3, p3, p3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 76
    .line 77
    .line 78
    new-instance v2, La6;

    .line 79
    .line 80
    move-object v3, p0

    .line 81
    move-object v6, p1

    .line 82
    move-object v7, p2

    .line 83
    move-object v4, p4

    .line 84
    move-object v5, p5

    .line 85
    invoke-direct/range {v2 .. v7}, La6;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 89
    .line 90
    .line 91
    return-object v0
.end method

.method public static t(Landroid/app/Activity;Ljm;)V
    .locals 7

    .line 1
    const-string v0, "Jgk+0hvQGI8=\n"

    .line 2
    .line 3
    const-string v1, "R2pKu225bPY=\n"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    const-string v0, "ih0TJKoN2hmAFw==\n"

    .line 9
    .line 10
    const-string v1, "5XNFQdhkvHA=\n"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    sget-object v0, Lu6;->a:Lu6;

    .line 16
    .line 17
    const-string v1, "0T3Nt4lkfqrVJg==\n"

    .line 18
    .line 19
    const-string v2, "sEi539YQEcE=\n"

    .line 20
    .line 21
    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, ""

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, Lu6;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_0

    .line 39
    .line 40
    invoke-static {p0}, Lxh;->b(Landroid/app/Activity;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    invoke-static {v0}, Lju;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    const-string v1, "Xw==\n"

    .line 56
    .line 57
    const-string v3, "I9Cj+g9tIY0=\n"

    .line 58
    .line 59
    invoke-static {v1, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    filled-new-array {v1}, [Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-static {v0, v1}, Li50;->J(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    const/4 v3, 0x3

    .line 76
    if-eq v1, v3, :cond_2

    .line 77
    .line 78
    :goto_0
    invoke-static {p0}, Lxh;->b(Landroid/app/Activity;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_2
    :try_start_0
    const-string v1, "lQ==\n"

    .line 83
    .line 84
    const-string v3, "6Xfym45BEac=\n"

    .line 85
    .line 86
    invoke-static {v1, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    filled-new-array {v1}, [Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-static {v0, v1}, Li50;->J(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    const/4 v1, 0x0

    .line 99
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, Ljava/lang/String;

    .line 104
    .line 105
    const/4 v3, 0x1

    .line 106
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    check-cast v3, Ljava/lang/String;

    .line 111
    .line 112
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 113
    .line 114
    .line 115
    move-result-wide v3

    .line 116
    const/4 v5, 0x2

    .line 117
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    check-cast v0, Ljava/lang/String;

    .line 122
    .line 123
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    sget-object v5, Lu6;->g:Ljava/lang/String;

    .line 128
    .line 129
    invoke-static {v1, v5}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-nez v1, :cond_3

    .line 134
    .line 135
    :goto_1
    invoke-static {p0}, Lxh;->b(Landroid/app/Activity;)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 140
    .line 141
    .line 142
    move-result-wide v5

    .line 143
    cmp-long v1, v5, v3

    .line 144
    .line 145
    if-lez v1, :cond_4

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_4
    sget v1, Lu6;->c:I

    .line 149
    .line 150
    if-eq v0, v1, :cond_5

    .line 151
    .line 152
    const-string p1, "hceuTvBQuQaB3A==\n"

    .line 153
    .line 154
    const-string v0, "5LLaJq8k1m0=\n"

    .line 155
    .line 156
    invoke-static {p1, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-static {p1, v2}, Lu6;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_5
    invoke-interface {p1}, Ljm;->a()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :catch_0
    invoke-static {p0}, Lxh;->b(Landroid/app/Activity;)V

    .line 169
    .line 170
    .line 171
    return-void
.end method


# virtual methods
.method public a(Lqu;Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public m(Landroid/content/pm/PackageManager;Ljava/lang/String;)[Landroid/content/pm/Signature;
    .locals 1

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p1, p1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 8
    .line 9
    return-object p1
.end method

.method public q(Lqu;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lxh;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    const-string v0, "kotlin.Unit"

    .line 12
    .line 13
    return-object v0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_0
    .end packed-switch
.end method
