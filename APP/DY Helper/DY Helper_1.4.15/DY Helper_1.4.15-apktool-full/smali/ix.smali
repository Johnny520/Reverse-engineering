.class public final Lix;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:I

.field public static final β:I

.field public static final γ:I

.field public static final δ:I

.field public static final ε:I

.field public static final ζ:I

.field public static final η:I

.field public static final θ:I

.field public static final ι:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final κ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final λ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final μ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ν:Landroid/os/Handler;

.field public static volatile ξ:Ljava/lang/ClassLoader;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/16 v0, 0xfb

    .line 2
    .line 3
    const/16 v1, 0xfe

    .line 4
    .line 5
    const/16 v2, 0xff

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sput v0, Lix;->α:I

    .line 12
    .line 13
    const/16 v0, 0xd7

    .line 14
    .line 15
    const/16 v1, 0xe8

    .line 16
    .line 17
    invoke-static {v2, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    sput v0, Lix;->β:I

    .line 22
    .line 23
    const/16 v0, 0xf1

    .line 24
    .line 25
    const/16 v1, 0xf7

    .line 26
    .line 27
    invoke-static {v2, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    sput v0, Lix;->γ:I

    .line 32
    .line 33
    const/16 v0, 0xe2

    .line 34
    .line 35
    const/16 v3, 0xee

    .line 36
    .line 37
    invoke-static {v2, v0, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    sput v0, Lix;->δ:I

    .line 42
    .line 43
    const/16 v0, 0xfa

    .line 44
    .line 45
    invoke-static {v2, v1, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    sput v0, Lix;->ε:I

    .line 50
    .line 51
    const/16 v0, 0x6f

    .line 52
    .line 53
    const/16 v1, 0xa5

    .line 54
    .line 55
    invoke-static {v2, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    sput v0, Lix;->ζ:I

    .line 60
    .line 61
    const/16 v0, 0x2f

    .line 62
    .line 63
    const/16 v1, 0x3a

    .line 64
    .line 65
    const/16 v2, 0x3d

    .line 66
    .line 67
    invoke-static {v2, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    sput v0, Lix;->η:I

    .line 72
    .line 73
    const/16 v0, 0x6a

    .line 74
    .line 75
    const/16 v1, 0x76

    .line 76
    .line 77
    const/16 v2, 0x7b

    .line 78
    .line 79
    invoke-static {v2, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    sput v0, Lix;->θ:I

    .line 84
    .line 85
    const/16 v0, 0x8f

    .line 86
    .line 87
    const/16 v1, 0x99

    .line 88
    .line 89
    const/16 v2, 0x9b

    .line 90
    .line 91
    invoke-static {v2, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 92
    .line 93
    .line 94
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 95
    .line 96
    const/4 v1, 0x0

    .line 97
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 98
    .line 99
    .line 100
    sput-object v0, Lix;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 101
    .line 102
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 103
    .line 104
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 105
    .line 106
    .line 107
    sput-object v0, Lix;->κ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 108
    .line 109
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 110
    .line 111
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 112
    .line 113
    .line 114
    sput-object v0, Lix;->λ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 115
    .line 116
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 117
    .line 118
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 119
    .line 120
    .line 121
    sput-object v0, Lix;->μ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 122
    .line 123
    new-instance v0, Landroid/os/Handler;

    .line 124
    .line 125
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 130
    .line 131
    .line 132
    sput-object v0, Lix;->ν:Landroid/os/Handler;

    .line 133
    .line 134
    return-void
.end method

.method public static α(Landroid/content/Context;J)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "best_version_warn_ack_"

    .line 6
    .line 7
    const-string v1, "_"

    .line 8
    .line 9
    invoke-static {v0, p0, p1, p2, v1}, Lnx;->π(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-string p1, "_best_390601_m60"

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static β(Landroid/content/Context;Ljava/lang/String;JLfx;Lgx;)Landroid/widget/FrameLayout;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Landroid/widget/FrameLayout;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 13
    .line 14
    .line 15
    const/high16 v3, 0x41200000    # 10.0f

    .line 16
    .line 17
    invoke-static {v0, v3}, Lix;->ε(Landroid/content/Context;F)I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-static {v0, v3}, Lix;->ε(Landroid/content/Context;F)I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    invoke-static {v0, v3}, Lix;->ε(Landroid/content/Context;F)I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    invoke-static {v0, v3}, Lix;->ε(Landroid/content/Context;F)I

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    invoke-virtual {v1, v4, v5, v6, v7}, Landroid/view/View;->setPadding(IIII)V

    .line 34
    .line 35
    .line 36
    new-instance v4, Landroid/widget/LinearLayout;

    .line 37
    .line 38
    invoke-direct {v4, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 39
    .line 40
    .line 41
    const/4 v5, 0x1

    .line 42
    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 46
    .line 47
    .line 48
    const/high16 v5, 0x41e00000    # 28.0f

    .line 49
    .line 50
    invoke-static {v0, v5}, Lix;->δ(Landroid/content/Context;F)F

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    const/high16 v7, 0x3f800000    # 1.0f

    .line 55
    .line 56
    invoke-static {v0, v7}, Lix;->ε(Landroid/content/Context;F)I

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    sget v9, Lix;->α:I

    .line 61
    .line 62
    sget v10, Lix;->β:I

    .line 63
    .line 64
    invoke-static {v9, v6, v8, v10}, Lix;->ι(IFII)Landroid/graphics/drawable/GradientDrawable;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    invoke-virtual {v4, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 69
    .line 70
    .line 71
    const/high16 v6, 0x41c00000    # 24.0f

    .line 72
    .line 73
    invoke-static {v0, v6}, Lix;->ε(Landroid/content/Context;F)I

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    const/high16 v9, 0x41b00000    # 22.0f

    .line 78
    .line 79
    invoke-static {v0, v9}, Lix;->ε(Landroid/content/Context;F)I

    .line 80
    .line 81
    .line 82
    move-result v9

    .line 83
    invoke-static {v0, v6}, Lix;->ε(Landroid/content/Context;F)I

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    const/high16 v11, 0x41a00000    # 20.0f

    .line 88
    .line 89
    invoke-static {v0, v11}, Lix;->ε(Landroid/content/Context;F)I

    .line 90
    .line 91
    .line 92
    move-result v11

    .line 93
    invoke-virtual {v4, v8, v9, v6, v11}, Landroid/view/View;->setPadding(IIII)V

    .line 94
    .line 95
    .line 96
    const/high16 v6, 0x41400000    # 12.0f

    .line 97
    .line 98
    invoke-static {v0, v6}, Lix;->δ(Landroid/content/Context;F)F

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    invoke-virtual {v4, v8}, Landroid/view/View;->setElevation(F)V

    .line 103
    .line 104
    .line 105
    new-instance v8, Landroid/widget/FrameLayout$LayoutParams;

    .line 106
    .line 107
    const/4 v9, -0x1

    .line 108
    const/4 v11, -0x2

    .line 109
    invoke-direct {v8, v9, v11}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 110
    .line 111
    .line 112
    const/high16 v12, 0x40c00000    # 6.0f

    .line 113
    .line 114
    invoke-static {v0, v12}, Lix;->ε(Landroid/content/Context;F)I

    .line 115
    .line 116
    .line 117
    move-result v13

    .line 118
    invoke-static {v0, v12}, Lix;->ε(Landroid/content/Context;F)I

    .line 119
    .line 120
    .line 121
    move-result v14

    .line 122
    invoke-static {v0, v12}, Lix;->ε(Landroid/content/Context;F)I

    .line 123
    .line 124
    .line 125
    move-result v15

    .line 126
    invoke-static {v0, v12}, Lix;->ε(Landroid/content/Context;F)I

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    invoke-virtual {v8, v13, v14, v15, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v4, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 134
    .line 135
    .line 136
    new-instance v6, Landroid/widget/TextView;

    .line 137
    .line 138
    invoke-direct {v6, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 139
    .line 140
    .line 141
    const-string v8, "\u26a0"

    .line 142
    .line 143
    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 144
    .line 145
    .line 146
    const/16 v8, 0x11

    .line 147
    .line 148
    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 152
    .line 153
    .line 154
    sget v13, Lix;->ζ:I

    .line 155
    .line 156
    invoke-virtual {v6, v13}, Landroid/widget/TextView;->setTextColor(I)V

    .line 157
    .line 158
    .line 159
    const/4 v14, 0x2

    .line 160
    invoke-virtual {v6, v14, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 161
    .line 162
    .line 163
    sget-object v5, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 164
    .line 165
    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 166
    .line 167
    .line 168
    new-instance v15, Landroid/widget/LinearLayout$LayoutParams;

    .line 169
    .line 170
    invoke-direct {v15, v9, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v4, v6, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 174
    .line 175
    .line 176
    new-instance v6, Landroid/widget/TextView;

    .line 177
    .line 178
    invoke-direct {v6, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 179
    .line 180
    .line 181
    const-string v15, "\u5e76\u975e\u6700\u4f73\u9002\u914d\u7248\u672c"

    .line 182
    .line 183
    invoke-virtual {v6, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 187
    .line 188
    .line 189
    sget v15, Lix;->η:I

    .line 190
    .line 191
    invoke-virtual {v6, v15}, Landroid/widget/TextView;->setTextColor(I)V

    .line 192
    .line 193
    .line 194
    const/high16 v2, 0x41980000    # 19.0f

    .line 195
    .line 196
    invoke-virtual {v6, v14, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 200
    .line 201
    .line 202
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 203
    .line 204
    invoke-direct {v2, v9, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 205
    .line 206
    .line 207
    invoke-static {v0, v3}, Lix;->ε(Landroid/content/Context;F)I

    .line 208
    .line 209
    .line 210
    move-result v7

    .line 211
    iput v7, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 212
    .line 213
    invoke-virtual {v4, v6, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 214
    .line 215
    .line 216
    new-instance v2, Landroid/widget/TextView;

    .line 217
    .line 218
    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 219
    .line 220
    .line 221
    const-string v6, "\u7ee7\u7eed\u524d\u8bf7\u786e\u8ba4\u5f53\u524d\u5bbf\u4e3b\u7248\u672c\u98ce\u9669"

    .line 222
    .line 223
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 227
    .line 228
    .line 229
    sget v6, Lix;->θ:I

    .line 230
    .line 231
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 232
    .line 233
    .line 234
    const/high16 v7, 0x41500000    # 13.0f

    .line 235
    .line 236
    invoke-virtual {v2, v14, v7}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 237
    .line 238
    .line 239
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 240
    .line 241
    invoke-direct {v7, v9, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 242
    .line 243
    .line 244
    invoke-static {v0, v12}, Lix;->ε(Landroid/content/Context;F)I

    .line 245
    .line 246
    .line 247
    move-result v12

    .line 248
    iput v12, v7, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 249
    .line 250
    invoke-virtual {v4, v2, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 251
    .line 252
    .line 253
    new-instance v2, Landroid/widget/TextView;

    .line 254
    .line 255
    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 256
    .line 257
    .line 258
    const-string v7, "\u5f53\u524d\u5bbf\u4e3b\uff1a"

    .line 259
    .line 260
    const-string v12, " ("

    .line 261
    .line 262
    move-object/from16 v9, p1

    .line 263
    .line 264
    move-object/from16 v16, v4

    .line 265
    .line 266
    move-wide/from16 v3, p2

    .line 267
    .line 268
    invoke-static {v7, v9, v3, v4, v12}, Lnx;->π(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    const-string v4, ")\n\u6700\u4f73\u9002\u914d\uff1a390601"

    .line 273
    .line 274
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v2, v13}, Landroid/widget/TextView;->setTextColor(I)V

    .line 288
    .line 289
    .line 290
    const/high16 v3, 0x41600000    # 14.0f

    .line 291
    .line 292
    invoke-virtual {v2, v14, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 296
    .line 297
    .line 298
    const/high16 v4, 0x41900000    # 18.0f

    .line 299
    .line 300
    invoke-static {v0, v4}, Lix;->δ(Landroid/content/Context;F)F

    .line 301
    .line 302
    .line 303
    move-result v5

    .line 304
    const/high16 v7, 0x3f800000    # 1.0f

    .line 305
    .line 306
    invoke-static {v0, v7}, Lix;->ε(Landroid/content/Context;F)I

    .line 307
    .line 308
    .line 309
    move-result v9

    .line 310
    sget v12, Lix;->γ:I

    .line 311
    .line 312
    invoke-static {v12, v5, v9, v10}, Lix;->ι(IFII)Landroid/graphics/drawable/GradientDrawable;

    .line 313
    .line 314
    .line 315
    move-result-object v5

    .line 316
    invoke-virtual {v2, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 317
    .line 318
    .line 319
    const/high16 v5, 0x40400000    # 3.0f

    .line 320
    .line 321
    invoke-static {v0, v5}, Lix;->δ(Landroid/content/Context;F)F

    .line 322
    .line 323
    .line 324
    move-result v5

    .line 325
    invoke-virtual {v2, v5, v7}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 326
    .line 327
    .line 328
    invoke-static {v0, v3}, Lix;->ε(Landroid/content/Context;F)I

    .line 329
    .line 330
    .line 331
    move-result v5

    .line 332
    const/high16 v7, 0x41200000    # 10.0f

    .line 333
    .line 334
    invoke-static {v0, v7}, Lix;->ε(Landroid/content/Context;F)I

    .line 335
    .line 336
    .line 337
    move-result v9

    .line 338
    invoke-static {v0, v3}, Lix;->ε(Landroid/content/Context;F)I

    .line 339
    .line 340
    .line 341
    move-result v12

    .line 342
    invoke-static {v0, v7}, Lix;->ε(Landroid/content/Context;F)I

    .line 343
    .line 344
    .line 345
    move-result v7

    .line 346
    invoke-virtual {v2, v5, v9, v12, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 347
    .line 348
    .line 349
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 350
    .line 351
    const/4 v7, -0x1

    .line 352
    invoke-direct {v5, v7, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 353
    .line 354
    .line 355
    const/high16 v7, 0x41800000    # 16.0f

    .line 356
    .line 357
    invoke-static {v0, v7}, Lix;->ε(Landroid/content/Context;F)I

    .line 358
    .line 359
    .line 360
    move-result v9

    .line 361
    iput v9, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 362
    .line 363
    move-object/from16 v9, v16

    .line 364
    .line 365
    invoke-virtual {v9, v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 366
    .line 367
    .line 368
    new-instance v2, Landroid/widget/TextView;

    .line 369
    .line 370
    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 371
    .line 372
    .line 373
    const-string v5, "\u5f53\u524d\u5bbf\u4e3b\u7248\u672c\u5e76\u975e\u6a21\u5757\u6700\u4f73\u9002\u914d\u7248\u672c\uff0c\u53ef\u80fd\u51fa\u73b0\u90e8\u5206\u529f\u80fd\u4e0d\u53ef\u7528\u6216\u5f02\u5e38\u3002\n\n\u6a21\u5757\u4e0d\u63a5\u53d7\u975e\u6700\u4f73\u7248\u672c\u4ea7\u751f\u7684 BUG \u53cd\u9988\u3002\u82e5\u4f60\u575a\u6301\u4f7f\u7528\uff0c\u53ef\u4ee5\u70b9\u51fb\u201c\u5f00\u59cb\u9002\u914d\u201d\u7ee7\u7eed DexKit \u626b\u63cf\u3002"

    .line 374
    .line 375
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v2, v15}, Landroid/widget/TextView;->setTextColor(I)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v2, v14, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 385
    .line 386
    .line 387
    invoke-static {v0, v7}, Lix;->δ(Landroid/content/Context;F)F

    .line 388
    .line 389
    .line 390
    move-result v5

    .line 391
    const/high16 v12, 0x3f800000    # 1.0f

    .line 392
    .line 393
    invoke-static {v0, v12}, Lix;->ε(Landroid/content/Context;F)I

    .line 394
    .line 395
    .line 396
    move-result v14

    .line 397
    sget v15, Lix;->ε:I

    .line 398
    .line 399
    invoke-static {v15, v5, v14, v10}, Lix;->ι(IFII)Landroid/graphics/drawable/GradientDrawable;

    .line 400
    .line 401
    .line 402
    move-result-object v5

    .line 403
    invoke-virtual {v2, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 404
    .line 405
    .line 406
    const/high16 v5, 0x40800000    # 4.0f

    .line 407
    .line 408
    invoke-static {v0, v5}, Lix;->δ(Landroid/content/Context;F)F

    .line 409
    .line 410
    .line 411
    move-result v5

    .line 412
    invoke-virtual {v2, v5, v12}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 413
    .line 414
    .line 415
    invoke-static {v0, v3}, Lix;->ε(Landroid/content/Context;F)I

    .line 416
    .line 417
    .line 418
    move-result v5

    .line 419
    const/high16 v10, 0x41400000    # 12.0f

    .line 420
    .line 421
    invoke-static {v0, v10}, Lix;->ε(Landroid/content/Context;F)I

    .line 422
    .line 423
    .line 424
    move-result v12

    .line 425
    invoke-static {v0, v3}, Lix;->ε(Landroid/content/Context;F)I

    .line 426
    .line 427
    .line 428
    move-result v3

    .line 429
    invoke-static {v0, v10}, Lix;->ε(Landroid/content/Context;F)I

    .line 430
    .line 431
    .line 432
    move-result v10

    .line 433
    invoke-virtual {v2, v5, v12, v3, v10}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 434
    .line 435
    .line 436
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 437
    .line 438
    const/4 v5, -0x1

    .line 439
    invoke-direct {v3, v5, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 440
    .line 441
    .line 442
    invoke-static {v0, v7}, Lix;->ε(Landroid/content/Context;F)I

    .line 443
    .line 444
    .line 445
    move-result v5

    .line 446
    iput v5, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 447
    .line 448
    invoke-virtual {v9, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 449
    .line 450
    .line 451
    new-instance v2, Landroid/widget/LinearLayout;

    .line 452
    .line 453
    invoke-direct {v2, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 454
    .line 455
    .line 456
    const/4 v3, 0x0

    .line 457
    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v2, v8}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 461
    .line 462
    .line 463
    const-string v5, "\u6682\u4e0d\u9002\u914d"

    .line 464
    .line 465
    invoke-static {v6, v0, v5}, Lix;->γ(ILandroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 466
    .line 467
    .line 468
    move-result-object v5

    .line 469
    new-instance v6, Lhi;

    .line 470
    .line 471
    const/4 v7, 0x3

    .line 472
    move-object/from16 v8, p5

    .line 473
    .line 474
    invoke-direct {v6, v7, v8}, Lhi;-><init>(ILjava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 478
    .line 479
    .line 480
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 481
    .line 482
    const/high16 v7, 0x42300000    # 44.0f

    .line 483
    .line 484
    invoke-static {v0, v7}, Lix;->ε(Landroid/content/Context;F)I

    .line 485
    .line 486
    .line 487
    move-result v8

    .line 488
    const/high16 v12, 0x3f800000    # 1.0f

    .line 489
    .line 490
    invoke-direct {v6, v3, v8, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 491
    .line 492
    .line 493
    const/high16 v3, 0x41000000    # 8.0f

    .line 494
    .line 495
    invoke-static {v0, v3}, Lix;->ε(Landroid/content/Context;F)I

    .line 496
    .line 497
    .line 498
    move-result v8

    .line 499
    iput v8, v6, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 500
    .line 501
    invoke-virtual {v2, v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 502
    .line 503
    .line 504
    const-string v5, "\u5f00\u59cb\u9002\u914d"

    .line 505
    .line 506
    invoke-static {v13, v0, v5}, Lix;->γ(ILandroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 507
    .line 508
    .line 509
    move-result-object v5

    .line 510
    new-instance v6, Lhi;

    .line 511
    .line 512
    const/4 v8, 0x4

    .line 513
    move-object/from16 v10, p4

    .line 514
    .line 515
    invoke-direct {v6, v8, v10}, Lhi;-><init>(ILjava/lang/Object;)V

    .line 516
    .line 517
    .line 518
    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 519
    .line 520
    .line 521
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 522
    .line 523
    invoke-static {v0, v7}, Lix;->ε(Landroid/content/Context;F)I

    .line 524
    .line 525
    .line 526
    move-result v7

    .line 527
    const/4 v8, 0x0

    .line 528
    const/high16 v12, 0x3f800000    # 1.0f

    .line 529
    .line 530
    invoke-direct {v6, v8, v7, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 531
    .line 532
    .line 533
    invoke-static {v0, v3}, Lix;->ε(Landroid/content/Context;F)I

    .line 534
    .line 535
    .line 536
    move-result v3

    .line 537
    iput v3, v6, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 538
    .line 539
    invoke-virtual {v2, v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 540
    .line 541
    .line 542
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 543
    .line 544
    const/4 v5, -0x1

    .line 545
    invoke-direct {v3, v5, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 546
    .line 547
    .line 548
    invoke-static {v0, v4}, Lix;->ε(Landroid/content/Context;F)I

    .line 549
    .line 550
    .line 551
    move-result v0

    .line 552
    iput v0, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 553
    .line 554
    invoke-virtual {v9, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 555
    .line 556
    .line 557
    return-object v1
.end method

.method public static γ(ILandroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;
    .locals 8

    .line 1
    new-instance v0, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    const/16 p2, 0x11

    .line 10
    .line 11
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setGravity(I)V

    .line 12
    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x2

    .line 22
    const/high16 v1, 0x41600000    # 14.0f

    .line 23
    .line 24
    invoke-virtual {v0, p0, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x1

    .line 33
    invoke-virtual {v0, p0}, Landroid/view/View;->setClickable(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p0}, Landroid/view/View;->setFocusable(Z)V

    .line 37
    .line 38
    .line 39
    new-instance p0, Landroid/graphics/drawable/StateListDrawable;

    .line 40
    .line 41
    invoke-direct {p0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 42
    .line 43
    .line 44
    const v1, 0x10100a7

    .line 45
    .line 46
    .line 47
    filled-new-array {v1}, [I

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const/high16 v2, 0x41900000    # 18.0f

    .line 52
    .line 53
    invoke-static {p1, v2}, Lix;->δ(Landroid/content/Context;F)F

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    const/high16 v4, 0x3f800000    # 1.0f

    .line 58
    .line 59
    invoke-static {p1, v4}, Lix;->ε(Landroid/content/Context;F)I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    sget v6, Lix;->δ:I

    .line 64
    .line 65
    sget v7, Lix;->β:I

    .line 66
    .line 67
    invoke-static {v6, v3, v5, v7}, Lix;->ι(IFII)Landroid/graphics/drawable/GradientDrawable;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {p0, v1, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 72
    .line 73
    .line 74
    const v1, 0x101009c

    .line 75
    .line 76
    .line 77
    filled-new-array {v1}, [I

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-static {p1, v2}, Lix;->δ(Landroid/content/Context;F)F

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    invoke-static {p1, v4}, Lix;->ε(Landroid/content/Context;F)I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    invoke-static {v6, v3, v5, v7}, Lix;->ι(IFII)Landroid/graphics/drawable/GradientDrawable;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-virtual {p0, v1, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 94
    .line 95
    .line 96
    new-array p2, p2, [I

    .line 97
    .line 98
    invoke-static {p1, v2}, Lix;->δ(Landroid/content/Context;F)F

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    invoke-static {p1, v4}, Lix;->ε(Landroid/content/Context;F)I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    sget v2, Lix;->γ:I

    .line 107
    .line 108
    invoke-static {v2, v1, p1, v7}, Lix;->ι(IFII)Landroid/graphics/drawable/GradientDrawable;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {p0, p2, p1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 116
    .line 117
    .line 118
    return-object v0
.end method

.method public static δ(Landroid/content/Context;F)F
    .locals 0

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
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 10
    .line 11
    mul-float/2addr p1, p0

    .line 12
    return p1
.end method

.method public static ε(Landroid/content/Context;F)I
    .locals 0

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
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 10
    .line 11
    mul-float/2addr p1, p0

    .line 12
    const/high16 p0, 0x3f000000    # 0.5f

    .line 13
    .line 14
    add-float/2addr p1, p0

    .line 15
    float-to-int p0, p1

    .line 16
    return p0
.end method

.method public static ζ(Landroid/content/Context;)J
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 19
    .line 20
    .line 21
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    new-instance v0, Leo1;

    .line 25
    .line 26
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    move-object p0, v0

    .line 30
    :goto_0
    const-wide/16 v0, 0x0

    .line 31
    .line 32
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    instance-of v1, p0, Leo1;

    .line 37
    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    move-object p0, v0

    .line 41
    :cond_0
    check-cast p0, Ljava/lang/Number;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    return-wide v0
.end method

.method public static η(Lz81;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 5
    .line 6
    sput-object v0, Lix;->ξ:Ljava/lang/ClassLoader;

    .line 7
    .line 8
    sget-object v0, Lix;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    :try_start_0
    const-class v0, Landroid/app/Activity;

    .line 20
    .line 21
    const-string v1, "onResume"

    .line 22
    .line 23
    new-instance v3, Lhx;

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    invoke-direct {v3, p0, v4}, Lhx;-><init>(Lz81;I)V

    .line 27
    .line 28
    .line 29
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {v0, v1, p0}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 34
    .line 35
    .line 36
    const-string p0, "Activity.onResume \u9996\u626b\u542f\u52a8\u5668\u5df2\u90e8\u7f72"

    .line 37
    .line 38
    invoke-static {p0}, Lix;->θ(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    sget-object v0, Lix;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v1, "Activity.onResume \u9996\u626b\u542f\u52a8\u5668\u90e8\u7f72\u5931\u8d25: "

    .line 55
    .line 56
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p0}, Lix;->θ(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public static θ(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "rc82f6e9d7c0781dd"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static ι(IFII)Landroid/graphics/drawable/GradientDrawable;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 14
    .line 15
    .line 16
    if-lez p2, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0, p2, p3}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-object v0
.end method

.method public static κ(Landroid/app/Activity;Ljava/lang/ClassLoader;)V
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lix;->ξ:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    goto/16 :goto_2

    .line 28
    .line 29
    :cond_0
    :try_start_0
    sget-object v0, Los;->α:Landroid/os/Handler;

    .line 30
    .line 31
    invoke-static {p0}, Los;->Γ(Landroid/app/Activity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    :catchall_0
    invoke-static {}, Lui1;->Α()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Lui1;->π(Landroid/content/Context;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 48
    .line 49
    .line 50
    :catchall_1
    :cond_1
    invoke-static {p0}, Lix;->ζ(Landroid/content/Context;)J

    .line 51
    .line 52
    .line 53
    move-result-wide v0

    .line 54
    const-wide/16 v2, 0x0

    .line 55
    .line 56
    cmp-long v4, v0, v2

    .line 57
    .line 58
    const/4 v5, 0x1

    .line 59
    if-gtz v4, :cond_2

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    const-wide/32 v6, 0x5f5c9

    .line 63
    .line 64
    .line 65
    cmp-long v4, v0, v6

    .line 66
    .line 67
    if-nez v4, :cond_3

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    const/4 v4, 0x0

    .line 71
    :try_start_2
    const-string v6, "dyhelper_dexkit_progress"

    .line 72
    .line 73
    invoke-virtual {p0, v6, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-static {p0, v0, v1}, Lix;->α(Landroid/content/Context;J)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-interface {v6, v0, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 86
    .line 87
    .line 88
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 89
    goto :goto_0

    .line 90
    :catchall_2
    move-exception v0

    .line 91
    new-instance v1, Leo1;

    .line 92
    .line 93
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    move-object v0, v1

    .line 97
    :goto_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 98
    .line 99
    instance-of v6, v0, Leo1;

    .line 100
    .line 101
    if-eqz v6, :cond_4

    .line 102
    .line 103
    move-object v0, v1

    .line 104
    :cond_4
    check-cast v0, Ljava/lang/Boolean;

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_5

    .line 111
    .line 112
    :goto_1
    sget-object p0, Lix;->κ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 113
    .line 114
    invoke-virtual {p0, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 115
    .line 116
    .line 117
    sget-object p0, Lix;->ν:Landroid/os/Handler;

    .line 118
    .line 119
    new-instance v0, Loj;

    .line 120
    .line 121
    invoke-direct {v0, p1, v5}, Loj;-><init>(Ljava/lang/ClassLoader;I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :cond_5
    sget-object v0, Lix;->μ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 129
    .line 130
    invoke-virtual {v0, v4, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-nez v0, :cond_6

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_6
    sget-object v0, Lix;->ν:Landroid/os/Handler;

    .line 138
    .line 139
    new-instance v1, Lw1;

    .line 140
    .line 141
    const/16 v2, 0xd

    .line 142
    .line 143
    invoke-direct {v1, p0, v2, p1}, Lw1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 147
    .line 148
    .line 149
    :goto_2
    return-void
.end method

.method public static λ(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    sget-object v2, Lix;->κ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    :try_start_0
    invoke-static {p0}, Lrx;->κ(Ljava/lang/ClassLoader;)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    new-instance v0, Leo1;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    move-object p0, v0

    .line 25
    :goto_0
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v1, "\u542f\u52a8\u7edf\u4e00\u9996\u626b\u5931\u8d25: "

    .line 38
    .line 39
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p0}, Lix;->θ(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    :goto_1
    return-void
.end method
