.class public final Ldz0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final μ:Ljava/util/concurrent/ExecutorService;

.field public static final ν:Lnq;


# instance fields
.field public final α:Landroid/app/Activity;

.field public final β:Ljava/util/ArrayList;

.field public final γ:Lyy0;

.field public final δ:Ljava/lang/String;

.field public final ε:Ljava/lang/String;

.field public final ζ:La80;

.field public final η:Ljava/util/LinkedHashSet;

.field public final θ:Ljava/util/ArrayList;

.field public ι:Lbz0;

.field public κ:Landroid/app/AlertDialog;

.field public λ:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sput-object v0, Ldz0;->μ:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v0, Lnq;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x2

    .line 12
    const/16 v3, 0x32

    .line 13
    .line 14
    const/high16 v4, 0x3f400000    # 0.75f

    .line 15
    .line 16
    invoke-direct {v0, v3, v4, v1, v2}, Lnq;-><init>(IFZI)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Ldz0;->ν:Lnq;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Ljava/util/ArrayList;Lyy0;Ljava/lang/String;Ljava/lang/String;La80;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Ldz0;->α:Landroid/app/Activity;

    .line 11
    .line 12
    iput-object p2, p0, Ldz0;->β:Ljava/util/ArrayList;

    .line 13
    .line 14
    iput-object p3, p0, Ldz0;->γ:Lyy0;

    .line 15
    .line 16
    iput-object p4, p0, Ldz0;->δ:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p5, p0, Ldz0;->ε:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p6, p0, Ldz0;->ζ:La80;

    .line 21
    .line 22
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Ldz0;->η:Ljava/util/LinkedHashSet;

    .line 28
    .line 29
    new-instance p1, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Ldz0;->θ:Ljava/util/ArrayList;

    .line 35
    .line 36
    return-void
.end method

.method public static α([BII)Landroid/graphics/Bitmap;
    .locals 8

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-object v1

    .line 6
    :cond_0
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    iput-boolean v2, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 13
    .line 14
    array-length v3, p0

    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-static {p0, v4, v3, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 17
    .line 18
    .line 19
    iget v3, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 20
    .line 21
    if-lez v3, :cond_5

    .line 22
    .line 23
    iget v3, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 24
    .line 25
    if-lez v3, :cond_5

    .line 26
    .line 27
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    .line 28
    .line 29
    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 30
    .line 31
    .line 32
    iget v5, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 33
    .line 34
    iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 35
    .line 36
    if-gt v0, p2, :cond_2

    .line 37
    .line 38
    if-le v5, p1, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move v6, v2

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    :goto_0
    div-int/lit8 v0, v0, 0x2

    .line 44
    .line 45
    div-int/lit8 v5, v5, 0x2

    .line 46
    .line 47
    move v6, v2

    .line 48
    :goto_1
    div-int v7, v0, v6

    .line 49
    .line 50
    if-lt v7, p2, :cond_3

    .line 51
    .line 52
    div-int v7, v5, v6

    .line 53
    .line 54
    if-lt v7, p1, :cond_3

    .line 55
    .line 56
    mul-int/lit8 v6, v6, 0x2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    :goto_2
    if-ge v6, v2, :cond_4

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_4
    move v2, v6

    .line 63
    :goto_3
    iput v2, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 64
    .line 65
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 66
    .line 67
    iput-object v0, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 68
    .line 69
    array-length v0, p0

    .line 70
    invoke-static {p0, v4, v0, v3}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    if-eqz v0, :cond_5

    .line 75
    .line 76
    return-object v0

    .line 77
    :cond_5
    :try_start_0
    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-static {p0}, Landroid/graphics/ImageDecoder;->createSource(Ljava/nio/ByteBuffer;)Landroid/graphics/ImageDecoder$Source;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    new-instance v0, Lxy0;

    .line 86
    .line 87
    invoke-direct {v0, p1, p2}, Lxy0;-><init>(II)V

    .line 88
    .line 89
    .line 90
    invoke-static {p0, v0}, Landroid/graphics/ImageDecoder;->decodeBitmap(Landroid/graphics/ImageDecoder$Source;Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;)Landroid/graphics/Bitmap;

    .line 91
    .line 92
    .line 93
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    goto :goto_4

    .line 95
    :catchall_0
    move-exception p0

    .line 96
    new-instance p1, Leo1;

    .line 97
    .line 98
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    move-object p0, p1

    .line 102
    :goto_4
    instance-of p1, p0, Leo1;

    .line 103
    .line 104
    if-eqz p1, :cond_6

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_6
    move-object v1, p0

    .line 108
    :goto_5
    check-cast v1, Landroid/graphics/Bitmap;

    .line 109
    .line 110
    return-object v1
.end method

.method public static δ(Ldz0;II)Landroid/graphics/drawable/GradientDrawable;
    .locals 0

    .line 1
    invoke-static {p1}, Llz1;->ζ(I)Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p2}, Ldz0;->β(I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    int-to-float p0, p0

    .line 10
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 11
    .line 12
    .line 13
    return-object p1
.end method

.method public static final ι(Ldz0;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ProgressBar;Landroid/widget/ImageView;Landroid/widget/ScrollView;Landroid/widget/GridLayout;Landroid/widget/HorizontalScrollView;Landroid/widget/LinearLayout;ILzy0;Landroid/view/ViewGroup;Z)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p15

    .line 4
    .line 5
    move-object/from16 v6, p16

    .line 6
    .line 7
    sget-object v2, Lx01;->α:Lx01;

    .line 8
    .line 9
    iget-object v3, v0, Ldz0;->α:Landroid/app/Activity;

    .line 10
    .line 11
    invoke-virtual {v2, v3}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const v3, 0x7f0c0053

    .line 16
    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-virtual {v2, v3, v6, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    const/16 v2, 0x8

    .line 24
    .line 25
    const/high16 v3, 0x3f800000    # 1.0f

    .line 26
    .line 27
    if-eqz p17, :cond_0

    .line 28
    .line 29
    new-instance v5, Landroid/widget/GridLayout$LayoutParams;

    .line 30
    .line 31
    const/high16 v8, -0x80000000

    .line 32
    .line 33
    invoke-static {v8, v3}, Landroid/widget/GridLayout;->spec(IF)Landroid/widget/GridLayout$Spec;

    .line 34
    .line 35
    .line 36
    move-result-object v9

    .line 37
    invoke-static {v8, v3}, Landroid/widget/GridLayout;->spec(IF)Landroid/widget/GridLayout$Spec;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    invoke-direct {v5, v9, v8}, Landroid/widget/GridLayout$LayoutParams;-><init>(Landroid/widget/GridLayout$Spec;Landroid/widget/GridLayout$Spec;)V

    .line 42
    .line 43
    .line 44
    iput v4, v5, Landroid/widget/GridLayout$LayoutParams;->width:I

    .line 45
    .line 46
    const/16 v8, 0x84

    .line 47
    .line 48
    invoke-virtual {v0, v8}, Ldz0;->β(I)I

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    iput v8, v5, Landroid/widget/GridLayout$LayoutParams;->height:I

    .line 53
    .line 54
    const/4 v8, 0x4

    .line 55
    invoke-virtual {v0, v8}, Ldz0;->β(I)I

    .line 56
    .line 57
    .line 58
    move-result v9

    .line 59
    invoke-virtual {v0, v8}, Ldz0;->β(I)I

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    invoke-virtual {v0, v2}, Ldz0;->β(I)I

    .line 64
    .line 65
    .line 66
    move-result v10

    .line 67
    invoke-virtual {v5, v9, v4, v8, v10}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 72
    .line 73
    const/16 v8, 0x4a

    .line 74
    .line 75
    invoke-virtual {v0, v8}, Ldz0;->β(I)I

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    const/16 v9, 0x52

    .line 80
    .line 81
    invoke-virtual {v0, v9}, Ldz0;->β(I)I

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    invoke-direct {v5, v8, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v2}, Ldz0;->β(I)I

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    invoke-virtual {v5, v8}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 93
    .line 94
    .line 95
    :goto_0
    invoke-virtual {v7, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 96
    .line 97
    .line 98
    iget-object v5, v0, Ldz0;->ι:Lbz0;

    .line 99
    .line 100
    const-string v8, "theme"

    .line 101
    .line 102
    if-eqz v5, :cond_d

    .line 103
    .line 104
    iget v5, v5, Lbz0;->γ:I

    .line 105
    .line 106
    const/16 v10, 0xc

    .line 107
    .line 108
    invoke-static {v0, v5, v10}, Ldz0;->δ(Ldz0;II)Landroid/graphics/drawable/GradientDrawable;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-virtual {v7, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 113
    .line 114
    .line 115
    const/4 v11, 0x1

    .line 116
    invoke-virtual {v7, v11}, Landroid/view/View;->setClipToOutline(Z)V

    .line 117
    .line 118
    .line 119
    const v5, 0x7f090204

    .line 120
    .line 121
    .line 122
    invoke-virtual {v7, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    check-cast v5, Landroid/widget/ImageView;

    .line 127
    .line 128
    const v12, 0x7f09030f

    .line 129
    .line 130
    .line 131
    invoke-virtual {v7, v12}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 132
    .line 133
    .line 134
    move-result-object v12

    .line 135
    check-cast v12, Landroid/widget/TextView;

    .line 136
    .line 137
    const v13, 0x7f090310

    .line 138
    .line 139
    .line 140
    invoke-virtual {v7, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 141
    .line 142
    .line 143
    move-result-object v13

    .line 144
    check-cast v13, Landroid/widget/TextView;

    .line 145
    .line 146
    const v14, 0x7f09030e

    .line 147
    .line 148
    .line 149
    invoke-virtual {v7, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 150
    .line 151
    .line 152
    move-result-object v14

    .line 153
    check-cast v14, Landroid/widget/TextView;

    .line 154
    .line 155
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    iget v15, v0, Ldz0;->λ:I

    .line 168
    .line 169
    move/from16 v3, p14

    .line 170
    .line 171
    if-ne v3, v15, :cond_1

    .line 172
    .line 173
    move v15, v11

    .line 174
    goto :goto_1

    .line 175
    :cond_1
    move v15, v4

    .line 176
    :goto_1
    iget-object v10, v0, Ldz0;->η:Ljava/util/LinkedHashSet;

    .line 177
    .line 178
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-virtual {v10, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    iget v10, v1, Lzy0;->γ:I

    .line 187
    .line 188
    iget-object v9, v1, Lzy0;->α:Laz0;

    .line 189
    .line 190
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v10

    .line 194
    invoke-virtual {v12, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 195
    .line 196
    .line 197
    iget-object v10, v1, Lzy0;->ε:Ljava/lang/String;

    .line 198
    .line 199
    invoke-virtual {v13, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 200
    .line 201
    .line 202
    const/16 v10, 0x11

    .line 203
    .line 204
    invoke-virtual {v12, v10}, Landroid/widget/TextView;->setGravity(I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v12, v4}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 208
    .line 209
    .line 210
    const/4 v4, -0x1

    .line 211
    invoke-virtual {v12, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 212
    .line 213
    .line 214
    const/4 v4, 0x0

    .line 215
    invoke-virtual {v12, v4, v11}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 216
    .line 217
    .line 218
    const-string v4, "#99000000"

    .line 219
    .line 220
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 221
    .line 222
    .line 223
    move-result v11

    .line 224
    const/16 v10, 0x8

    .line 225
    .line 226
    invoke-static {v0, v11, v10}, Ldz0;->δ(Ldz0;II)Landroid/graphics/drawable/GradientDrawable;

    .line 227
    .line 228
    .line 229
    move-result-object v11

    .line 230
    invoke-virtual {v12, v11}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 231
    .line 232
    .line 233
    const/16 v11, 0x11

    .line 234
    .line 235
    invoke-virtual {v13, v11}, Landroid/widget/TextView;->setGravity(I)V

    .line 236
    .line 237
    .line 238
    const/4 v11, 0x0

    .line 239
    invoke-virtual {v13, v11}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 240
    .line 241
    .line 242
    const/4 v12, -0x1

    .line 243
    invoke-virtual {v13, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 244
    .line 245
    .line 246
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 247
    .line 248
    .line 249
    move-result v4

    .line 250
    invoke-static {v0, v4, v10}, Ldz0;->δ(Ldz0;II)Landroid/graphics/drawable/GradientDrawable;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    invoke-virtual {v13, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0, v14, v2, v11}, Ldz0;->ζ(Landroid/widget/TextView;ZZ)V

    .line 258
    .line 259
    .line 260
    iget-object v4, v0, Ldz0;->ι:Lbz0;

    .line 261
    .line 262
    if-eqz v4, :cond_c

    .line 263
    .line 264
    iget v8, v4, Lbz0;->θ:I

    .line 265
    .line 266
    iget v10, v4, Lbz0;->γ:I

    .line 267
    .line 268
    if-nez v15, :cond_3

    .line 269
    .line 270
    if-eqz v2, :cond_2

    .line 271
    .line 272
    goto :goto_2

    .line 273
    :cond_2
    const/4 v11, 0x1

    .line 274
    goto :goto_3

    .line 275
    :cond_3
    :goto_2
    const/4 v11, 0x2

    .line 276
    :goto_3
    if-eqz v15, :cond_4

    .line 277
    .line 278
    goto :goto_4

    .line 279
    :cond_4
    if-eqz v2, :cond_5

    .line 280
    .line 281
    const/16 v4, 0xb4

    .line 282
    .line 283
    const/16 v12, 0xff

    .line 284
    .line 285
    const/4 v13, 0x0

    .line 286
    invoke-static {v4, v13, v12}, Lj81;->μ(III)I

    .line 287
    .line 288
    .line 289
    move-result v4

    .line 290
    invoke-static {v8}, Landroid/graphics/Color;->red(I)I

    .line 291
    .line 292
    .line 293
    move-result v12

    .line 294
    invoke-static {v8}, Landroid/graphics/Color;->green(I)I

    .line 295
    .line 296
    .line 297
    move-result v13

    .line 298
    invoke-static {v8}, Landroid/graphics/Color;->blue(I)I

    .line 299
    .line 300
    .line 301
    move-result v8

    .line 302
    invoke-static {v4, v12, v13, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 303
    .line 304
    .line 305
    move-result v8

    .line 306
    goto :goto_4

    .line 307
    :cond_5
    iget v8, v4, Lbz0;->η:I

    .line 308
    .line 309
    :goto_4
    invoke-static {v10}, Llz1;->ζ(I)Landroid/graphics/drawable/GradientDrawable;

    .line 310
    .line 311
    .line 312
    move-result-object v4

    .line 313
    const/16 v10, 0xc

    .line 314
    .line 315
    invoke-virtual {v0, v10}, Ldz0;->β(I)I

    .line 316
    .line 317
    .line 318
    move-result v10

    .line 319
    int-to-float v10, v10

    .line 320
    invoke-virtual {v4, v10}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v4, v11, v8}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v7, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 327
    .line 328
    .line 329
    if-nez v2, :cond_7

    .line 330
    .line 331
    if-eqz v15, :cond_6

    .line 332
    .line 333
    goto :goto_5

    .line 334
    :cond_6
    const v2, 0x3f3851ec    # 0.72f

    .line 335
    .line 336
    .line 337
    goto :goto_6

    .line 338
    :cond_7
    :goto_5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 339
    .line 340
    :goto_6
    invoke-virtual {v7, v2}, Landroid/view/View;->setAlpha(F)V

    .line 341
    .line 342
    .line 343
    iget-object v2, v1, Lzy0;->ζ:Ljava/lang/String;

    .line 344
    .line 345
    if-nez v2, :cond_9

    .line 346
    .line 347
    iget-object v2, v1, Lzy0;->η:Ljava/lang/String;

    .line 348
    .line 349
    if-nez v2, :cond_9

    .line 350
    .line 351
    sget-object v2, Laz0;->η:Laz0;

    .line 352
    .line 353
    if-ne v9, v2, :cond_8

    .line 354
    .line 355
    iget-object v1, v1, Lzy0;->θ:Ljava/lang/String;

    .line 356
    .line 357
    goto :goto_7

    .line 358
    :cond_8
    const/4 v1, 0x0

    .line 359
    goto :goto_7

    .line 360
    :cond_9
    move-object v1, v2

    .line 361
    :goto_7
    if-eqz v1, :cond_a

    .line 362
    .line 363
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 364
    .line 365
    .line 366
    move-result v2

    .line 367
    if-eqz v2, :cond_b

    .line 368
    .line 369
    :cond_a
    move-object v2, v5

    .line 370
    move-object v4, v9

    .line 371
    const/4 v11, 0x0

    .line 372
    goto :goto_9

    .line 373
    :cond_b
    const/4 v3, 0x0

    .line 374
    move-object v2, v5

    .line 375
    const/4 v5, 0x0

    .line 376
    move-object v4, v9

    .line 377
    invoke-virtual/range {v0 .. v5}, Ldz0;->γ(Ljava/lang/String;Landroid/widget/ImageView;Landroid/widget/ProgressBar;Laz0;Z)V

    .line 378
    .line 379
    .line 380
    :goto_8
    const/4 v1, 0x1

    .line 381
    goto :goto_a

    .line 382
    :goto_9
    invoke-virtual {v0, v2, v4, v11}, Ldz0;->η(Landroid/widget/ImageView;Laz0;Z)V

    .line 383
    .line 384
    .line 385
    goto :goto_8

    .line 386
    :goto_a
    invoke-virtual {v7, v1}, Landroid/view/View;->setClickable(Z)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v7, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 390
    .line 391
    .line 392
    new-instance v0, Lty0;

    .line 393
    .line 394
    move-object/from16 v3, p0

    .line 395
    .line 396
    move-object/from16 v4, p1

    .line 397
    .line 398
    move-object/from16 v5, p2

    .line 399
    .line 400
    move-object/from16 v6, p3

    .line 401
    .line 402
    move-object/from16 v8, p5

    .line 403
    .line 404
    move-object/from16 v9, p6

    .line 405
    .line 406
    move-object/from16 v10, p7

    .line 407
    .line 408
    move-object/from16 v11, p8

    .line 409
    .line 410
    move-object/from16 v12, p9

    .line 411
    .line 412
    move-object/from16 v13, p10

    .line 413
    .line 414
    move-object/from16 v15, p12

    .line 415
    .line 416
    move-object/from16 v16, p13

    .line 417
    .line 418
    move/from16 v2, p14

    .line 419
    .line 420
    move/from16 v1, p17

    .line 421
    .line 422
    move-object/from16 v18, v7

    .line 423
    .line 424
    move-object/from16 v19, v14

    .line 425
    .line 426
    move-object/from16 v7, p4

    .line 427
    .line 428
    move-object/from16 v14, p11

    .line 429
    .line 430
    invoke-direct/range {v0 .. v16}, Lty0;-><init>(ZILdz0;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ProgressBar;Landroid/widget/ImageView;Landroid/widget/ScrollView;Landroid/widget/GridLayout;Landroid/widget/HorizontalScrollView;Landroid/widget/LinearLayout;)V

    .line 431
    .line 432
    .line 433
    move-object v1, v0

    .line 434
    move-object/from16 v0, v18

    .line 435
    .line 436
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 437
    .line 438
    .line 439
    new-instance v0, Luy0;

    .line 440
    .line 441
    move-object/from16 v2, p0

    .line 442
    .line 443
    move-object/from16 v14, p1

    .line 444
    .line 445
    move-object/from16 v3, p2

    .line 446
    .line 447
    move-object/from16 v4, p3

    .line 448
    .line 449
    move-object/from16 v15, p4

    .line 450
    .line 451
    move-object/from16 v11, p5

    .line 452
    .line 453
    move-object/from16 v12, p6

    .line 454
    .line 455
    move-object/from16 v13, p7

    .line 456
    .line 457
    move-object/from16 v9, p8

    .line 458
    .line 459
    move-object/from16 v7, p9

    .line 460
    .line 461
    move-object/from16 v10, p10

    .line 462
    .line 463
    move-object/from16 v5, p11

    .line 464
    .line 465
    move-object/from16 v6, p12

    .line 466
    .line 467
    move-object/from16 v8, p13

    .line 468
    .line 469
    move/from16 v1, p14

    .line 470
    .line 471
    move-object/from16 v20, v18

    .line 472
    .line 473
    invoke-direct/range {v0 .. v15}, Luy0;-><init>(ILdz0;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/GridLayout;Landroid/widget/HorizontalScrollView;Landroid/widget/ImageView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ScrollView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 474
    .line 475
    .line 476
    move-object v1, v0

    .line 477
    move-object/from16 v0, v20

    .line 478
    .line 479
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 480
    .line 481
    .line 482
    move-object/from16 v14, v19

    .line 483
    .line 484
    const/4 v1, 0x1

    .line 485
    invoke-virtual {v14, v1}, Landroid/view/View;->setClickable(Z)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v14, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 489
    .line 490
    .line 491
    new-instance v1, Lvy0;

    .line 492
    .line 493
    move-object/from16 p7, p0

    .line 494
    .line 495
    move-object/from16 p10, p1

    .line 496
    .line 497
    move-object/from16 p8, p2

    .line 498
    .line 499
    move-object/from16 p9, p3

    .line 500
    .line 501
    move-object/from16 p11, p4

    .line 502
    .line 503
    move/from16 p6, p14

    .line 504
    .line 505
    move-object/from16 p5, v1

    .line 506
    .line 507
    invoke-direct/range {p5 .. p11}, Lvy0;-><init>(ILdz0;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 508
    .line 509
    .line 510
    move-object/from16 v2, p7

    .line 511
    .line 512
    invoke-virtual {v14, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 513
    .line 514
    .line 515
    iget-object v1, v2, Ldz0;->θ:Ljava/util/ArrayList;

    .line 516
    .line 517
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 518
    .line 519
    .line 520
    move-object/from16 v6, p16

    .line 521
    .line 522
    invoke-virtual {v6, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 523
    .line 524
    .line 525
    return-void

    .line 526
    :cond_c
    invoke-static {v8}, Lln0;->и(Ljava/lang/String;)V

    .line 527
    .line 528
    .line 529
    const/16 v17, 0x0

    .line 530
    .line 531
    throw v17

    .line 532
    :cond_d
    const/16 v17, 0x0

    .line 533
    .line 534
    invoke-static {v8}, Lln0;->и(Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    throw v17
.end method

.method public static final κ(ILdz0;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/GridLayout;Landroid/widget/HorizontalScrollView;Landroid/widget/ImageView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ScrollView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 9

    .line 1
    move-object/from16 v0, p12

    .line 2
    .line 3
    iget-object v1, p1, Ldz0;->β:Ljava/util/ArrayList;

    .line 4
    .line 5
    if-ltz p0, :cond_a

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    if-ge p0, v4, :cond_a

    .line 12
    .line 13
    iput p0, p1, Ldz0;->λ:I

    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lzy0;

    .line 20
    .line 21
    iget-object v4, v1, Lzy0;->δ:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v7, v1, Lzy0;->α:Laz0;

    .line 24
    .line 25
    move-object/from16 v5, p10

    .line 26
    .line 27
    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    .line 29
    .line 30
    iget-object v4, v1, Lzy0;->ε:Ljava/lang/String;

    .line 31
    .line 32
    move-object/from16 v5, p11

    .line 33
    .line 34
    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    const/4 v5, 0x1

    .line 42
    if-eqz v4, :cond_3

    .line 43
    .line 44
    if-eq v4, v5, :cond_2

    .line 45
    .line 46
    const/4 v6, 0x2

    .line 47
    if-eq v4, v6, :cond_1

    .line 48
    .line 49
    const/4 v6, 0x3

    .line 50
    if-ne v4, v6, :cond_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    invoke-static {}, Lγ;->κ()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_1
    :goto_0
    const-string v4, "\u52a8\u56fe\u8d44\u6e90"

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    const-string v4, "\u89c6\u9891\u8d44\u6e90"

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    const-string v4, ""

    .line 64
    .line 65
    :goto_1
    iget-object v6, v1, Lzy0;->ζ:Ljava/lang/String;

    .line 66
    .line 67
    if-nez v6, :cond_5

    .line 68
    .line 69
    iget-object v6, v1, Lzy0;->η:Ljava/lang/String;

    .line 70
    .line 71
    if-nez v6, :cond_5

    .line 72
    .line 73
    sget-object v6, Laz0;->η:Laz0;

    .line 74
    .line 75
    if-ne v7, v6, :cond_4

    .line 76
    .line 77
    iget-object v6, v1, Lzy0;->θ:Ljava/lang/String;

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_4
    const/4 v6, 0x0

    .line 81
    :cond_5
    :goto_2
    const/16 v1, 0x8

    .line 82
    .line 83
    if-eqz v6, :cond_7

    .line 84
    .line 85
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    if-eqz v8, :cond_6

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_6
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    const/4 v8, 0x1

    .line 99
    move-object v3, p1

    .line 100
    move-object v5, p6

    .line 101
    move-object v4, v6

    .line 102
    move-object/from16 v6, p8

    .line 103
    .line 104
    invoke-virtual/range {v3 .. v8}, Ldz0;->γ(Ljava/lang/String;Landroid/widget/ImageView;Landroid/widget/ProgressBar;Laz0;Z)V

    .line 105
    .line 106
    .line 107
    :goto_3
    move-object/from16 v4, p13

    .line 108
    .line 109
    move-object/from16 v5, p14

    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_7
    :goto_4
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    if-eqz v6, :cond_8

    .line 117
    .line 118
    const-string v4, "\u8d44\u6e90\u9884\u89c8"

    .line 119
    .line 120
    :cond_8
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 121
    .line 122
    .line 123
    const/4 v4, 0x0

    .line 124
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 125
    .line 126
    .line 127
    move-object/from16 v6, p8

    .line 128
    .line 129
    invoke-virtual {v6, v1}, Landroid/view/View;->setVisibility(I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, p6, v7, v5}, Ldz0;->η(Landroid/widget/ImageView;Laz0;Z)V

    .line 136
    .line 137
    .line 138
    goto :goto_3

    .line 139
    :goto_5
    invoke-static {p1, v4, p2, p3, v5}, Ldz0;->μ(Ldz0;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/TextView;)V

    .line 140
    .line 141
    .line 142
    iget-object v0, p1, Ldz0;->γ:Lyy0;

    .line 143
    .line 144
    sget-object v1, Lyy0;->ζ:Lyy0;

    .line 145
    .line 146
    if-ne v0, v1, :cond_9

    .line 147
    .line 148
    new-instance v0, Lvw;

    .line 149
    .line 150
    const/4 v5, 0x1

    .line 151
    move v2, p0

    .line 152
    move-object v4, p1

    .line 153
    move-object v1, p4

    .line 154
    move-object/from16 v3, p9

    .line 155
    .line 156
    invoke-direct/range {v0 .. v5}, Lvw;-><init>(Landroid/view/ViewGroup;ILandroid/widget/FrameLayout;Ldz0;I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v3, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :cond_9
    new-instance v0, Lvw;

    .line 164
    .line 165
    const/4 v1, 0x2

    .line 166
    move/from16 p10, p0

    .line 167
    .line 168
    move-object/from16 p12, p1

    .line 169
    .line 170
    move-object/from16 p11, p5

    .line 171
    .line 172
    move-object/from16 p9, p7

    .line 173
    .line 174
    move-object/from16 p8, v0

    .line 175
    .line 176
    move/from16 p13, v1

    .line 177
    .line 178
    invoke-direct/range {p8 .. p13}, Lvw;-><init>(Landroid/view/ViewGroup;ILandroid/widget/FrameLayout;Ldz0;I)V

    .line 179
    .line 180
    .line 181
    move-object/from16 v1, p8

    .line 182
    .line 183
    invoke-virtual {p5, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 184
    .line 185
    .line 186
    :cond_a
    return-void
.end method

.method public static final λ(ILdz0;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 2

    .line 1
    if-ltz p0, :cond_1

    .line 2
    .line 3
    iget-object v0, p1, Ldz0;->β:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v1, p1, Ldz0;->η:Ljava/util/LinkedHashSet;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-ge p0, v0, :cond_1

    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {v1, p0}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {v1, p0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-static {p1, p4, p2, p3, p5}, Ldz0;->μ(Ldz0;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/TextView;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public static final μ(Ldz0;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/TextView;)V
    .locals 11

    .line 1
    iget-object v0, p0, Ldz0;->η:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object v2, p0, Ldz0;->β:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const-string v3, " \u9879"

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    const-string v4, "\u672a\u9009\u62e9\u5185\u5bb9 \u00b7 \u5171 "

    .line 18
    .line 19
    invoke-static {v4, v2, v3}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string v4, "/"

    .line 25
    .line 26
    if-ne v1, v2, :cond_1

    .line 27
    .line 28
    const-string v5, "\u5df2\u5168\u9009 "

    .line 29
    .line 30
    invoke-static {v5, v1, v4, v2, v3}, Lnx;->η(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const-string v5, "\u5df2\u9009 "

    .line 36
    .line 37
    invoke-static {v5, v1, v4, v2, v3}, Lnx;->η(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    :goto_0
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 42
    .line 43
    .line 44
    if-ne v1, v2, :cond_2

    .line 45
    .line 46
    const-string p1, "\u53d6\u6d88\u5168\u9009"

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    const-string p1, "\u5168\u9009"

    .line 50
    .line 51
    :goto_1
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 52
    .line 53
    .line 54
    const/4 p1, 0x1

    .line 55
    if-lez v1, :cond_4

    .line 56
    .line 57
    if-ne v1, p1, :cond_3

    .line 58
    .line 59
    const-string p2, "\u4e0b\u8f7d 1 \u9879"

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    const-string p2, "\u4e0b\u8f7d\u5df2\u9009("

    .line 63
    .line 64
    const-string v2, ")"

    .line 65
    .line 66
    invoke-static {p2, v1, v2}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    goto :goto_2

    .line 71
    :cond_4
    const-string p2, "\u8bf7\u5148\u52fe\u9009"

    .line 72
    .line 73
    :goto_2
    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 74
    .line 75
    .line 76
    iget-object p2, p0, Ldz0;->ι:Lbz0;

    .line 77
    .line 78
    const-string v2, "theme"

    .line 79
    .line 80
    const/4 v3, 0x0

    .line 81
    if-eqz p2, :cond_15

    .line 82
    .line 83
    iget v6, p2, Lbz0;->θ:I

    .line 84
    .line 85
    const/4 p2, 0x0

    .line 86
    if-lez v1, :cond_5

    .line 87
    .line 88
    move v9, p1

    .line 89
    goto :goto_3

    .line 90
    :cond_5
    move v9, p2

    .line 91
    :goto_3
    const/4 v7, -0x1

    .line 92
    const/4 v8, 0x1

    .line 93
    move-object v4, p0

    .line 94
    move-object v5, p3

    .line 95
    invoke-virtual/range {v4 .. v9}, Ldz0;->ν(Landroid/widget/Button;IIZZ)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    iget p0, v4, Ldz0;->λ:I

    .line 102
    .line 103
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-virtual {v0, p0}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    invoke-virtual {v4, p4, p0, p1}, Ldz0;->ζ(Landroid/widget/TextView;ZZ)V

    .line 112
    .line 113
    .line 114
    iget-object p0, v4, Ldz0;->θ:Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    move p3, p2

    .line 121
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result p4

    .line 125
    if-eqz p4, :cond_14

    .line 126
    .line 127
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p4

    .line 131
    add-int/lit8 v1, p3, 0x1

    .line 132
    .line 133
    if-ltz p3, :cond_13

    .line 134
    .line 135
    check-cast p4, Landroid/view/View;

    .line 136
    .line 137
    iget v5, v4, Ldz0;->λ:I

    .line 138
    .line 139
    if-ne p3, v5, :cond_6

    .line 140
    .line 141
    move v5, p1

    .line 142
    goto :goto_5

    .line 143
    :cond_6
    move v5, p2

    .line 144
    :goto_5
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object p3

    .line 148
    invoke-virtual {v0, p3}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result p3

    .line 152
    invoke-virtual {p4}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    instance-of v7, v6, Landroid/graphics/drawable/GradientDrawable;

    .line 157
    .line 158
    if-eqz v7, :cond_7

    .line 159
    .line 160
    check-cast v6, Landroid/graphics/drawable/GradientDrawable;

    .line 161
    .line 162
    goto :goto_6

    .line 163
    :cond_7
    move-object v6, v3

    .line 164
    :goto_6
    if-eqz v6, :cond_f

    .line 165
    .line 166
    iget-object v7, v4, Ldz0;->ι:Lbz0;

    .line 167
    .line 168
    if-eqz v5, :cond_9

    .line 169
    .line 170
    if-eqz v7, :cond_8

    .line 171
    .line 172
    iget v7, v7, Lbz0;->θ:I

    .line 173
    .line 174
    goto :goto_7

    .line 175
    :cond_8
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw v3

    .line 179
    :cond_9
    if-eqz p3, :cond_b

    .line 180
    .line 181
    if-eqz v7, :cond_a

    .line 182
    .line 183
    iget v7, v7, Lbz0;->θ:I

    .line 184
    .line 185
    const/16 v8, 0xb4

    .line 186
    .line 187
    const/16 v9, 0xff

    .line 188
    .line 189
    invoke-static {v8, p2, v9}, Lj81;->μ(III)I

    .line 190
    .line 191
    .line 192
    move-result v8

    .line 193
    invoke-static {v7}, Landroid/graphics/Color;->red(I)I

    .line 194
    .line 195
    .line 196
    move-result v9

    .line 197
    invoke-static {v7}, Landroid/graphics/Color;->green(I)I

    .line 198
    .line 199
    .line 200
    move-result v10

    .line 201
    invoke-static {v7}, Landroid/graphics/Color;->blue(I)I

    .line 202
    .line 203
    .line 204
    move-result v7

    .line 205
    invoke-static {v8, v9, v10, v7}, Landroid/graphics/Color;->argb(IIII)I

    .line 206
    .line 207
    .line 208
    move-result v7

    .line 209
    goto :goto_7

    .line 210
    :cond_a
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw v3

    .line 214
    :cond_b
    if-eqz v7, :cond_e

    .line 215
    .line 216
    iget v7, v7, Lbz0;->η:I

    .line 217
    .line 218
    :goto_7
    if-nez v5, :cond_d

    .line 219
    .line 220
    if-eqz p3, :cond_c

    .line 221
    .line 222
    goto :goto_8

    .line 223
    :cond_c
    invoke-virtual {v4, p1}, Ldz0;->β(I)I

    .line 224
    .line 225
    .line 226
    move-result v8

    .line 227
    goto :goto_9

    .line 228
    :cond_d
    :goto_8
    const/4 v8, 0x2

    .line 229
    invoke-virtual {v4, v8}, Ldz0;->β(I)I

    .line 230
    .line 231
    .line 232
    move-result v8

    .line 233
    :goto_9
    invoke-virtual {v6, v8, v7}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 234
    .line 235
    .line 236
    goto :goto_a

    .line 237
    :cond_e
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    throw v3

    .line 241
    :cond_f
    :goto_a
    if-nez p3, :cond_11

    .line 242
    .line 243
    if-eqz v5, :cond_10

    .line 244
    .line 245
    goto :goto_b

    .line 246
    :cond_10
    const v5, 0x3f3851ec    # 0.72f

    .line 247
    .line 248
    .line 249
    goto :goto_c

    .line 250
    :cond_11
    :goto_b
    const/high16 v5, 0x3f800000    # 1.0f

    .line 251
    .line 252
    :goto_c
    invoke-virtual {p4, v5}, Landroid/view/View;->setAlpha(F)V

    .line 253
    .line 254
    .line 255
    const v5, 0x7f09030e

    .line 256
    .line 257
    .line 258
    invoke-virtual {p4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 259
    .line 260
    .line 261
    move-result-object p4

    .line 262
    check-cast p4, Landroid/widget/TextView;

    .line 263
    .line 264
    if-eqz p4, :cond_12

    .line 265
    .line 266
    invoke-virtual {v4, p4, p3, p2}, Ldz0;->ζ(Landroid/widget/TextView;ZZ)V

    .line 267
    .line 268
    .line 269
    :cond_12
    move p3, v1

    .line 270
    goto/16 :goto_4

    .line 271
    .line 272
    :cond_13
    invoke-static {}, Lyh;->х()V

    .line 273
    .line 274
    .line 275
    throw v3

    .line 276
    :cond_14
    return-void

    .line 277
    :cond_15
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    throw v3
.end method


# virtual methods
.method public final β(I)I
    .locals 1

    .line 1
    int-to-float p1, p1

    .line 2
    iget-object p0, p0, Ldz0;->α:Landroid/app/Activity;

    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-static {v0, p1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    float-to-int p0, p0

    .line 18
    return p0
.end method

.method public final γ(Ljava/lang/String;Landroid/widget/ImageView;Landroid/widget/ProgressBar;Laz0;Z)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-static {p1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p1, v0

    .line 14
    :goto_0
    if-nez p1, :cond_1

    .line 15
    .line 16
    const-string p1, ""

    .line 17
    .line 18
    :cond_1
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_2
    const-string v1, "//"

    .line 27
    .line 28
    invoke-static {p1, v1, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    const-string v1, "https:"

    .line 35
    .line 36
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    :cond_3
    const-string v1, "&amp;"

    .line 41
    .line 42
    const-string v4, "&"

    .line 43
    .line 44
    invoke-static {p1, v1, v4}, Lx02;->Ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const-string v1, "http"

    .line 49
    .line 50
    const/4 v4, 0x1

    .line 51
    invoke-static {p1, v1, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_4

    .line 56
    .line 57
    move-object v0, p1

    .line 58
    :cond_4
    :goto_1
    const/16 p1, 0x8

    .line 59
    .line 60
    if-eqz v0, :cond_9

    .line 61
    .line 62
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_5

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_5
    invoke-virtual {p4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    new-instance v4, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v1, "|"

    .line 82
    .line 83
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string v1, "|"

    .line 90
    .line 91
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, p5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {p2, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    sget-object v1, Ldz0;->ν:Lnq;

    .line 105
    .line 106
    monitor-enter v1

    .line 107
    :try_start_0
    invoke-virtual {v1, v4}, Lnq;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    check-cast v5, Landroid/graphics/Bitmap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    .line 113
    monitor-exit v1

    .line 114
    if-eqz v5, :cond_7

    .line 115
    .line 116
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-nez v1, :cond_7

    .line 121
    .line 122
    if-eqz p3, :cond_6

    .line 123
    .line 124
    invoke-virtual {p3, p1}, Landroid/view/View;->setVisibility(I)V

    .line 125
    .line 126
    .line 127
    :cond_6
    invoke-virtual {p0, p2, v5, p5}, Ldz0;->ε(Landroid/widget/ImageView;Landroid/graphics/Bitmap;Z)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :cond_7
    invoke-virtual {p0, p2, p4, p5}, Ldz0;->η(Landroid/widget/ImageView;Laz0;Z)V

    .line 132
    .line 133
    .line 134
    if-eqz p3, :cond_8

    .line 135
    .line 136
    invoke-virtual {p3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 137
    .line 138
    .line 139
    :cond_8
    sget-object p1, Ldz0;->μ:Ljava/util/concurrent/ExecutorService;

    .line 140
    .line 141
    move-object v2, v0

    .line 142
    new-instance v0, Lwy0;

    .line 143
    .line 144
    move-object v1, p0

    .line 145
    move-object v5, p2

    .line 146
    move-object v6, p3

    .line 147
    move-object v7, p4

    .line 148
    move v3, p5

    .line 149
    invoke-direct/range {v0 .. v7}, Lwy0;-><init>(Ldz0;Ljava/lang/String;ZLjava/lang/String;Landroid/widget/ImageView;Landroid/widget/ProgressBar;Laz0;)V

    .line 150
    .line 151
    .line 152
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :catchall_0
    move-exception v0

    .line 157
    move-object p0, v0

    .line 158
    monitor-exit v1

    .line 159
    throw p0

    .line 160
    :cond_9
    :goto_2
    if-eqz p3, :cond_a

    .line 161
    .line 162
    invoke-virtual {p3, p1}, Landroid/view/View;->setVisibility(I)V

    .line 163
    .line 164
    .line 165
    :cond_a
    invoke-virtual {p0, p2, p4, p5}, Ldz0;->η(Landroid/widget/ImageView;Laz0;Z)V

    .line 166
    .line 167
    .line 168
    return-void
.end method

.method public final ε(Landroid/widget/ImageView;Landroid/graphics/Bitmap;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0, v0, v0, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 10
    .line 11
    .line 12
    if-eqz p3, :cond_0

    .line 13
    .line 14
    sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 18
    .line 19
    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 20
    .line 21
    .line 22
    if-nez p3, :cond_1

    .line 23
    .line 24
    const/4 p3, 0x1

    .line 25
    invoke-virtual {p1, p3}, Landroid/view/View;->setClipToOutline(Z)V

    .line 26
    .line 27
    .line 28
    const/16 p3, 0xc

    .line 29
    .line 30
    invoke-virtual {p0, p3}, Ldz0;->β(I)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    int-to-float p0, p0

    .line 35
    new-instance p3, Lcz0;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    invoke-direct {p3, v0, p0}, Lcz0;-><init>(IF)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p3}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final ζ(Landroid/widget/TextView;ZZ)V
    .locals 4

    .line 1
    const/16 v0, 0x11

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {p1, v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 13
    .line 14
    .line 15
    if-eqz p3, :cond_0

    .line 16
    .line 17
    const/high16 v2, 0x41900000    # 18.0f

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/high16 v2, 0x41400000    # 12.0f

    .line 21
    .line 22
    :goto_0
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 23
    .line 24
    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    const-string v2, "\u2713"

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const-string v2, ""

    .line 31
    .line 32
    :goto_1
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    const/4 v2, -0x1

    .line 36
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 37
    .line 38
    .line 39
    if-eqz p2, :cond_2

    .line 40
    .line 41
    const-string v2, "\u5df2\u9009\u4e2d"

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    const-string v2, "\u672a\u9009\u4e2d"

    .line 45
    .line 46
    :goto_2
    invoke-virtual {p1, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 47
    .line 48
    .line 49
    const-string v2, "theme"

    .line 50
    .line 51
    if-eqz p2, :cond_4

    .line 52
    .line 53
    iget-object v3, p0, Ldz0;->ι:Lbz0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    iget v3, v3, Lbz0;->θ:I

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_3
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0

    .line 64
    :cond_4
    const-string v3, "#66000000"

    .line 65
    .line 66
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    :goto_3
    if-eqz p2, :cond_6

    .line 71
    .line 72
    iget-object p2, p0, Ldz0;->ι:Lbz0;

    .line 73
    .line 74
    if-eqz p2, :cond_5

    .line 75
    .line 76
    iget p2, p2, Lbz0;->θ:I

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_5
    invoke-static {v2}, Lln0;->и(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v0

    .line 83
    :cond_6
    const-string p2, "#E6FFFFFF"

    .line 84
    .line 85
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    :goto_4
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 90
    .line 91
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 98
    .line 99
    .line 100
    if-eqz p3, :cond_7

    .line 101
    .line 102
    const/4 v1, 0x2

    .line 103
    :cond_7
    invoke-virtual {p0, v1}, Ldz0;->β(I)I

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    invoke-virtual {v0, p0, p2}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public final η(Landroid/widget/ImageView;Laz0;Z)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p2, :cond_3

    .line 7
    .line 8
    if-eq p2, v0, :cond_2

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-eq p2, v1, :cond_1

    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    if-ne p2, v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-static {}, Lγ;->κ()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    :goto_0
    const p2, 0x1080053

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_2
    const p2, 0x1080024

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_3
    const p2, 0x108003f

    .line 30
    .line 31
    .line 32
    :goto_1
    const/4 v1, 0x0

    .line 33
    invoke-virtual {p1, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 37
    .line 38
    .line 39
    iget-object p2, p0, Ldz0;->ι:Lbz0;

    .line 40
    .line 41
    if-eqz p2, :cond_6

    .line 42
    .line 43
    iget p2, p2, Lbz0;->θ:I

    .line 44
    .line 45
    invoke-static {p2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 50
    .line 51
    .line 52
    sget-object p2, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    .line 53
    .line 54
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 55
    .line 56
    .line 57
    if-eqz p3, :cond_4

    .line 58
    .line 59
    const/16 p2, 0x70

    .line 60
    .line 61
    :goto_2
    invoke-virtual {p0, p2}, Ldz0;->β(I)I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    goto :goto_3

    .line 66
    :cond_4
    const/16 p2, 0x12

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :goto_3
    invoke-virtual {p1, p2, p2, p2, p2}, Landroid/view/View;->setPadding(IIII)V

    .line 70
    .line 71
    .line 72
    if-nez p3, :cond_5

    .line 73
    .line 74
    invoke-virtual {p1, v0}, Landroid/view/View;->setClipToOutline(Z)V

    .line 75
    .line 76
    .line 77
    const/16 p2, 0xc

    .line 78
    .line 79
    invoke-virtual {p0, p2}, Ldz0;->β(I)I

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    int-to-float p0, p0

    .line 84
    new-instance p2, Lcz0;

    .line 85
    .line 86
    const/4 p3, 0x1

    .line 87
    invoke-direct {p2, p3, p0}, Lcz0;-><init>(IF)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, p2}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 91
    .line 92
    .line 93
    :cond_5
    return-void

    .line 94
    :cond_6
    const-string p0, "theme"

    .line 95
    .line 96
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    const/4 p0, 0x0

    .line 100
    throw p0
.end method

.method public final θ()V
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v7, v0, Ldz0;->β:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v8, 0x0

    .line 10
    iget-object v9, v0, Ldz0;->α:Landroid/app/Activity;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    const-string v0, "\u6ca1\u6709\u53ef\u9009\u62e9\u4e0b\u8f7d\u7684\u8d44\u6e90"

    .line 15
    .line 16
    invoke-static {v9, v0, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iget v1, v1, Landroid/content/res/Configuration;->uiMode:I

    .line 36
    .line 37
    and-int/lit8 v1, v1, 0x30

    .line 38
    .line 39
    const/16 v2, 0x20

    .line 40
    .line 41
    if-ne v1, v2, :cond_1

    .line 42
    .line 43
    new-instance v10, Lbz0;

    .line 44
    .line 45
    const-string v1, "#101214"

    .line 46
    .line 47
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v11

    .line 51
    const-string v1, "#1B1E22"

    .line 52
    .line 53
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v12

    .line 57
    const-string v1, "#090B0E"

    .line 58
    .line 59
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v13

    .line 63
    const-string v1, "#F5F7FA"

    .line 64
    .line 65
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v14

    .line 69
    const-string v1, "#B8C0CC"

    .line 70
    .line 71
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v15

    .line 75
    const-string v1, "#7F8A99"

    .line 76
    .line 77
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v16

    .line 81
    const-string v1, "#2E343B"

    .line 82
    .line 83
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v17

    .line 87
    const-string v1, "#4DA3FF"

    .line 88
    .line 89
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v18

    .line 93
    const-string v1, "#19314A"

    .line 94
    .line 95
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v19

    .line 99
    const-string v1, "#252A30"

    .line 100
    .line 101
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    move-result v20

    .line 105
    const-string v1, "#22FFFFFF"

    .line 106
    .line 107
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    move-result v21

    .line 111
    invoke-direct/range {v10 .. v21}, Lbz0;-><init>(IIIIIIIIIII)V

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_1
    new-instance v11, Lbz0;

    .line 116
    .line 117
    const-string v1, "#F5F8FC"

    .line 118
    .line 119
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    move-result v12

    .line 123
    const-string v1, "#FFFFFF"

    .line 124
    .line 125
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    move-result v13

    .line 129
    const-string v1, "#0A0D10"

    .line 130
    .line 131
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    move-result v14

    .line 135
    const-string v1, "#16202A"

    .line 136
    .line 137
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 138
    .line 139
    .line 140
    move-result v15

    .line 141
    const-string v1, "#5E6B7A"

    .line 142
    .line 143
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 144
    .line 145
    .line 146
    move-result v16

    .line 147
    const-string v1, "#94A3B8"

    .line 148
    .line 149
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    move-result v17

    .line 153
    const-string v1, "#E4EAF2"

    .line 154
    .line 155
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 156
    .line 157
    .line 158
    move-result v18

    .line 159
    const-string v1, "#1989FA"

    .line 160
    .line 161
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 162
    .line 163
    .line 164
    move-result v19

    .line 165
    const-string v1, "#EAF4FF"

    .line 166
    .line 167
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 168
    .line 169
    .line 170
    move-result v20

    .line 171
    const-string v1, "#F1F5F9"

    .line 172
    .line 173
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 174
    .line 175
    .line 176
    move-result v21

    .line 177
    const-string v1, "#18000000"

    .line 178
    .line 179
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 180
    .line 181
    .line 182
    move-result v22

    .line 183
    invoke-direct/range {v11 .. v22}, Lbz0;-><init>(IIIIIIIIIII)V

    .line 184
    .line 185
    .line 186
    move-object v10, v11

    .line 187
    :goto_0
    iput-object v10, v0, Ldz0;->ι:Lbz0;

    .line 188
    .line 189
    iget-object v1, v0, Ldz0;->η:Ljava/util/LinkedHashSet;

    .line 190
    .line 191
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->clear()V

    .line 192
    .line 193
    .line 194
    invoke-static {v7}, Lyh;->Κ(Ljava/util/Collection;)Lxm0;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    invoke-static {v1, v2}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 199
    .line 200
    .line 201
    sget-object v1, Lx01;->α:Lx01;

    .line 202
    .line 203
    invoke-virtual {v1, v9}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    const v2, 0x7f0c002e

    .line 208
    .line 209
    .line 210
    const/4 v10, 0x0

    .line 211
    invoke-virtual {v1, v2, v10, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 212
    .line 213
    .line 214
    move-result-object v11

    .line 215
    const v1, 0x7f090215

    .line 216
    .line 217
    .line 218
    invoke-virtual {v11, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    const v2, 0x7f090214

    .line 223
    .line 224
    .line 225
    invoke-virtual {v11, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    const v3, 0x7f0902fa

    .line 230
    .line 231
    .line 232
    invoke-virtual {v11, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    move-object v6, v3

    .line 237
    check-cast v6, Landroid/widget/TextView;

    .line 238
    .line 239
    const v3, 0x7f09030d

    .line 240
    .line 241
    .line 242
    invoke-virtual {v11, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    move-object v13, v3

    .line 247
    check-cast v13, Landroid/widget/TextView;

    .line 248
    .line 249
    const v3, 0x7f09030c

    .line 250
    .line 251
    .line 252
    invoke-virtual {v11, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    move-object v12, v3

    .line 257
    check-cast v12, Landroid/widget/TextView;

    .line 258
    .line 259
    const v3, 0x7f090259

    .line 260
    .line 261
    .line 262
    invoke-virtual {v11, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    move-object v14, v3

    .line 267
    check-cast v14, Landroid/widget/FrameLayout;

    .line 268
    .line 269
    const v3, 0x7f090202

    .line 270
    .line 271
    .line 272
    invoke-virtual {v11, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    move-object v15, v3

    .line 277
    check-cast v15, Landroid/widget/ImageView;

    .line 278
    .line 279
    const v3, 0x7f09025a

    .line 280
    .line 281
    .line 282
    invoke-virtual {v11, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    check-cast v3, Landroid/widget/ProgressBar;

    .line 287
    .line 288
    const v4, 0x7f090302

    .line 289
    .line 290
    .line 291
    invoke-virtual {v11, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    check-cast v4, Landroid/widget/TextView;

    .line 296
    .line 297
    const v5, 0x7f090300

    .line 298
    .line 299
    .line 300
    invoke-virtual {v11, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 301
    .line 302
    .line 303
    move-result-object v5

    .line 304
    move-object/from16 v16, v5

    .line 305
    .line 306
    check-cast v16, Landroid/widget/TextView;

    .line 307
    .line 308
    const v5, 0x7f090301

    .line 309
    .line 310
    .line 311
    invoke-virtual {v11, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 312
    .line 313
    .line 314
    move-result-object v5

    .line 315
    move-object/from16 v17, v5

    .line 316
    .line 317
    check-cast v17, Landroid/widget/TextView;

    .line 318
    .line 319
    const v5, 0x7f0902ff

    .line 320
    .line 321
    .line 322
    invoke-virtual {v11, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 323
    .line 324
    .line 325
    move-result-object v5

    .line 326
    move-object/from16 v18, v5

    .line 327
    .line 328
    check-cast v18, Landroid/widget/TextView;

    .line 329
    .line 330
    const v5, 0x7f090187

    .line 331
    .line 332
    .line 333
    invoke-virtual {v11, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 334
    .line 335
    .line 336
    move-result-object v5

    .line 337
    check-cast v5, Landroid/widget/HorizontalScrollView;

    .line 338
    .line 339
    const v8, 0x7f090210

    .line 340
    .line 341
    .line 342
    invoke-virtual {v11, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 343
    .line 344
    .line 345
    move-result-object v8

    .line 346
    check-cast v8, Landroid/widget/LinearLayout;

    .line 347
    .line 348
    const v10, 0x7f0902cb

    .line 349
    .line 350
    .line 351
    invoke-virtual {v11, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 352
    .line 353
    .line 354
    move-result-object v10

    .line 355
    check-cast v10, Landroid/widget/ScrollView;

    .line 356
    .line 357
    move-object/from16 v21, v5

    .line 358
    .line 359
    const v5, 0x7f090157

    .line 360
    .line 361
    .line 362
    invoke-virtual {v11, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 363
    .line 364
    .line 365
    move-result-object v5

    .line 366
    check-cast v5, Landroid/widget/GridLayout;

    .line 367
    .line 368
    move-object/from16 v22, v5

    .line 369
    .line 370
    const v5, 0x7f09004f

    .line 371
    .line 372
    .line 373
    invoke-virtual {v11, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 374
    .line 375
    .line 376
    move-result-object v5

    .line 377
    check-cast v5, Landroid/widget/Button;

    .line 378
    .line 379
    move-object/from16 v23, v5

    .line 380
    .line 381
    const v5, 0x7f09004d

    .line 382
    .line 383
    .line 384
    invoke-virtual {v11, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 385
    .line 386
    .line 387
    move-result-object v5

    .line 388
    move-object/from16 v24, v5

    .line 389
    .line 390
    check-cast v24, Landroid/widget/Button;

    .line 391
    .line 392
    const v5, 0x7f090049

    .line 393
    .line 394
    .line 395
    invoke-virtual {v11, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 396
    .line 397
    .line 398
    move-result-object v5

    .line 399
    move-object/from16 v25, v5

    .line 400
    .line 401
    check-cast v25, Landroid/widget/Button;

    .line 402
    .line 403
    const v5, 0x7f09004c

    .line 404
    .line 405
    .line 406
    invoke-virtual {v11, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 407
    .line 408
    .line 409
    move-result-object v5

    .line 410
    move-object/from16 v26, v5

    .line 411
    .line 412
    check-cast v26, Landroid/widget/Button;

    .line 413
    .line 414
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    iget-object v5, v0, Ldz0;->ι:Lbz0;

    .line 451
    .line 452
    const-string v27, "theme"

    .line 453
    .line 454
    if-eqz v5, :cond_18

    .line 455
    .line 456
    iget v5, v5, Lbz0;->α:I

    .line 457
    .line 458
    move-object/from16 v28, v7

    .line 459
    .line 460
    const/16 v7, 0x16

    .line 461
    .line 462
    invoke-static {v0, v5, v7}, Ldz0;->δ(Ldz0;II)Landroid/graphics/drawable/GradientDrawable;

    .line 463
    .line 464
    .line 465
    move-result-object v5

    .line 466
    invoke-virtual {v1, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 467
    .line 468
    .line 469
    iget-object v1, v0, Ldz0;->ι:Lbz0;

    .line 470
    .line 471
    if-eqz v1, :cond_17

    .line 472
    .line 473
    iget v1, v1, Lbz0;->β:I

    .line 474
    .line 475
    const/16 v5, 0x12

    .line 476
    .line 477
    invoke-static {v0, v1, v5}, Ldz0;->δ(Ldz0;II)Landroid/graphics/drawable/GradientDrawable;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    invoke-virtual {v2, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 482
    .line 483
    .line 484
    iget-object v1, v0, Ldz0;->ι:Lbz0;

    .line 485
    .line 486
    if-eqz v1, :cond_16

    .line 487
    .line 488
    iget v1, v1, Lbz0;->δ:I

    .line 489
    .line 490
    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 491
    .line 492
    .line 493
    const/4 v7, 0x1

    .line 494
    const/4 v1, 0x0

    .line 495
    invoke-virtual {v6, v1, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 496
    .line 497
    .line 498
    iget-object v2, v0, Ldz0;->ι:Lbz0;

    .line 499
    .line 500
    if-eqz v2, :cond_15

    .line 501
    .line 502
    iget v2, v2, Lbz0;->ζ:I

    .line 503
    .line 504
    invoke-virtual {v13, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 505
    .line 506
    .line 507
    iget-object v2, v0, Ldz0;->ι:Lbz0;

    .line 508
    .line 509
    if-eqz v2, :cond_14

    .line 510
    .line 511
    iget v2, v2, Lbz0;->θ:I

    .line 512
    .line 513
    invoke-virtual {v12, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v12, v1, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 517
    .line 518
    .line 519
    const/16 v2, 0x11

    .line 520
    .line 521
    invoke-virtual {v12, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 522
    .line 523
    .line 524
    iget-object v5, v0, Ldz0;->ι:Lbz0;

    .line 525
    .line 526
    if-eqz v5, :cond_13

    .line 527
    .line 528
    iget v5, v5, Lbz0;->ι:I

    .line 529
    .line 530
    const/16 v1, 0x63

    .line 531
    .line 532
    invoke-static {v0, v5, v1}, Ldz0;->δ(Ldz0;II)Landroid/graphics/drawable/GradientDrawable;

    .line 533
    .line 534
    .line 535
    move-result-object v1

    .line 536
    invoke-virtual {v12, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 537
    .line 538
    .line 539
    iget-object v1, v0, Ldz0;->ι:Lbz0;

    .line 540
    .line 541
    if-eqz v1, :cond_12

    .line 542
    .line 543
    iget v1, v1, Lbz0;->γ:I

    .line 544
    .line 545
    const/16 v5, 0x10

    .line 546
    .line 547
    invoke-static {v0, v1, v5}, Ldz0;->δ(Ldz0;II)Landroid/graphics/drawable/GradientDrawable;

    .line 548
    .line 549
    .line 550
    move-result-object v1

    .line 551
    invoke-virtual {v14, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 552
    .line 553
    .line 554
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 555
    .line 556
    .line 557
    const/4 v1, -0x1

    .line 558
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 559
    .line 560
    .line 561
    const-string v1, "#99000000"

    .line 562
    .line 563
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 564
    .line 565
    .line 566
    move-result v1

    .line 567
    const/16 v2, 0xe

    .line 568
    .line 569
    invoke-static {v0, v1, v2}, Ldz0;->δ(Ldz0;II)Landroid/graphics/drawable/GradientDrawable;

    .line 570
    .line 571
    .line 572
    move-result-object v1

    .line 573
    invoke-virtual {v4, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 574
    .line 575
    .line 576
    iget-object v1, v0, Ldz0;->ι:Lbz0;

    .line 577
    .line 578
    if-eqz v1, :cond_11

    .line 579
    .line 580
    iget v1, v1, Lbz0;->θ:I

    .line 581
    .line 582
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 583
    .line 584
    .line 585
    move-result-object v1

    .line 586
    invoke-virtual {v3, v1}, Landroid/widget/ProgressBar;->setIndeterminateTintList(Landroid/content/res/ColorStateList;)V

    .line 587
    .line 588
    .line 589
    const/16 v1, 0x168

    .line 590
    .line 591
    invoke-virtual {v0, v1}, Ldz0;->β(I)I

    .line 592
    .line 593
    .line 594
    move-result v1

    .line 595
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 600
    .line 601
    .line 602
    move-result-object v2

    .line 603
    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 604
    .line 605
    int-to-float v2, v2

    .line 606
    const v5, 0x3ef5c28f    # 0.48f

    .line 607
    .line 608
    .line 609
    mul-float/2addr v2, v5

    .line 610
    float-to-int v2, v2

    .line 611
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 612
    .line 613
    .line 614
    move-result v1

    .line 615
    const/16 v2, 0xf0

    .line 616
    .line 617
    invoke-virtual {v0, v2}, Ldz0;->β(I)I

    .line 618
    .line 619
    .line 620
    move-result v2

    .line 621
    if-ge v1, v2, :cond_2

    .line 622
    .line 623
    move v1, v2

    .line 624
    :cond_2
    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 625
    .line 626
    .line 627
    move-result-object v2

    .line 628
    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 629
    .line 630
    invoke-virtual {v14, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 631
    .line 632
    .line 633
    iget-object v1, v0, Ldz0;->ι:Lbz0;

    .line 634
    .line 635
    if-eqz v1, :cond_10

    .line 636
    .line 637
    iget v2, v1, Lbz0;->ι:I

    .line 638
    .line 639
    iget v1, v1, Lbz0;->θ:I

    .line 640
    .line 641
    move-object v5, v4

    .line 642
    const/4 v4, 0x0

    .line 643
    move-object/from16 v29, v5

    .line 644
    .line 645
    const/4 v5, 0x1

    .line 646
    move-object/from16 v7, v22

    .line 647
    .line 648
    move-object/from16 v22, v11

    .line 649
    .line 650
    move-object v11, v7

    .line 651
    move-object/from16 v20, v3

    .line 652
    .line 653
    move-object/from16 v7, v21

    .line 654
    .line 655
    move v3, v1

    .line 656
    move-object/from16 v1, v23

    .line 657
    .line 658
    const/16 v23, 0x0

    .line 659
    .line 660
    invoke-virtual/range {v0 .. v5}, Ldz0;->ν(Landroid/widget/Button;IIZZ)V

    .line 661
    .line 662
    .line 663
    move-object/from16 v30, v1

    .line 664
    .line 665
    iget-object v1, v0, Ldz0;->ι:Lbz0;

    .line 666
    .line 667
    if-eqz v1, :cond_f

    .line 668
    .line 669
    iget v2, v1, Lbz0;->ι:I

    .line 670
    .line 671
    iget v3, v1, Lbz0;->θ:I

    .line 672
    .line 673
    const/4 v4, 0x0

    .line 674
    const/4 v5, 0x1

    .line 675
    move-object/from16 v1, v24

    .line 676
    .line 677
    invoke-virtual/range {v0 .. v5}, Ldz0;->ν(Landroid/widget/Button;IIZZ)V

    .line 678
    .line 679
    .line 680
    iget-object v2, v0, Ldz0;->ι:Lbz0;

    .line 681
    .line 682
    if-eqz v2, :cond_e

    .line 683
    .line 684
    iget v3, v2, Lbz0;->κ:I

    .line 685
    .line 686
    iget v2, v2, Lbz0;->ε:I

    .line 687
    .line 688
    const/4 v4, 0x0

    .line 689
    const/4 v5, 0x1

    .line 690
    move/from16 v31, v3

    .line 691
    .line 692
    move v3, v2

    .line 693
    move/from16 v2, v31

    .line 694
    .line 695
    move-object/from16 v31, v1

    .line 696
    .line 697
    move-object/from16 v1, v25

    .line 698
    .line 699
    invoke-virtual/range {v0 .. v5}, Ldz0;->ν(Landroid/widget/Button;IIZZ)V

    .line 700
    .line 701
    .line 702
    iget-object v2, v0, Ldz0;->ι:Lbz0;

    .line 703
    .line 704
    if-eqz v2, :cond_d

    .line 705
    .line 706
    iget v2, v2, Lbz0;->θ:I

    .line 707
    .line 708
    const/4 v4, 0x1

    .line 709
    const/4 v5, 0x1

    .line 710
    const/4 v3, -0x1

    .line 711
    move-object/from16 v32, v1

    .line 712
    .line 713
    move-object/from16 v1, v26

    .line 714
    .line 715
    invoke-virtual/range {v0 .. v5}, Ldz0;->ν(Landroid/widget/Button;IIZZ)V

    .line 716
    .line 717
    .line 718
    move-object v3, v1

    .line 719
    iget-object v1, v0, Ldz0;->δ:Ljava/lang/String;

    .line 720
    .line 721
    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 722
    .line 723
    .line 724
    iget-object v1, v0, Ldz0;->ε:Ljava/lang/String;

    .line 725
    .line 726
    invoke-virtual {v12, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 727
    .line 728
    .line 729
    new-instance v0, Lry0;

    .line 730
    .line 731
    const/4 v1, 0x1

    .line 732
    move-object/from16 v2, p0

    .line 733
    .line 734
    move-object v4, v3

    .line 735
    move-object v5, v13

    .line 736
    move-object/from16 v6, v18

    .line 737
    .line 738
    move-object/from16 v3, v30

    .line 739
    .line 740
    invoke-direct/range {v0 .. v6}, Lry0;-><init>(ILdz0;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 741
    .line 742
    .line 743
    move-object v1, v0

    .line 744
    move-object v0, v2

    .line 745
    move-object v2, v3

    .line 746
    move-object v3, v4

    .line 747
    invoke-virtual {v6, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 748
    .line 749
    .line 750
    invoke-virtual {v8}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 751
    .line 752
    .line 753
    invoke-virtual {v11}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 754
    .line 755
    .line 756
    iget-object v1, v0, Ldz0;->θ:Ljava/util/ArrayList;

    .line 757
    .line 758
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 759
    .line 760
    .line 761
    sget-object v1, Lyy0;->ζ:Lyy0;

    .line 762
    .line 763
    const/16 v4, 0x8

    .line 764
    .line 765
    iget-object v12, v0, Ldz0;->γ:Lyy0;

    .line 766
    .line 767
    if-ne v12, v1, :cond_6

    .line 768
    .line 769
    invoke-virtual {v14, v4}, Landroid/view/View;->setVisibility(I)V

    .line 770
    .line 771
    .line 772
    invoke-virtual {v7, v4}, Landroid/view/View;->setVisibility(I)V

    .line 773
    .line 774
    .line 775
    const/4 v4, 0x0

    .line 776
    invoke-virtual {v10, v4}, Landroid/view/View;->setVisibility(I)V

    .line 777
    .line 778
    .line 779
    const/4 v13, 0x3

    .line 780
    invoke-virtual {v11, v13}, Landroid/widget/GridLayout;->setColumnCount(I)V

    .line 781
    .line 782
    .line 783
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 784
    .line 785
    .line 786
    move-result-object v13

    .line 787
    const/16 v14, 0x208

    .line 788
    .line 789
    invoke-virtual {v0, v14}, Ldz0;->β(I)I

    .line 790
    .line 791
    .line 792
    move-result v14

    .line 793
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 794
    .line 795
    .line 796
    move-result-object v18

    .line 797
    invoke-virtual/range {v18 .. v18}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 798
    .line 799
    .line 800
    move-result-object v4

    .line 801
    iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 802
    .line 803
    int-to-float v4, v4

    .line 804
    const v18, 0x3f147ae1    # 0.58f

    .line 805
    .line 806
    .line 807
    mul-float v4, v4, v18

    .line 808
    .line 809
    float-to-int v4, v4

    .line 810
    invoke-static {v14, v4}, Ljava/lang/Math;->min(II)I

    .line 811
    .line 812
    .line 813
    move-result v4

    .line 814
    const/16 v14, 0x12c

    .line 815
    .line 816
    invoke-virtual {v0, v14}, Ldz0;->β(I)I

    .line 817
    .line 818
    .line 819
    move-result v14

    .line 820
    if-ge v4, v14, :cond_3

    .line 821
    .line 822
    move v4, v14

    .line 823
    :cond_3
    iput v4, v13, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 824
    .line 825
    invoke-virtual {v10, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 826
    .line 827
    .line 828
    invoke-virtual/range {v28 .. v28}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 829
    .line 830
    .line 831
    move-result-object v18

    .line 832
    const/4 v14, 0x0

    .line 833
    :goto_1
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    .line 834
    .line 835
    .line 836
    move-result v4

    .line 837
    if-eqz v4, :cond_5

    .line 838
    .line 839
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 840
    .line 841
    .line 842
    move-result-object v4

    .line 843
    add-int/lit8 v24, v14, 0x1

    .line 844
    .line 845
    if-ltz v14, :cond_4

    .line 846
    .line 847
    check-cast v4, Lzy0;

    .line 848
    .line 849
    move-object v13, v9

    .line 850
    move-object v9, v15

    .line 851
    move-object v15, v4

    .line 852
    move-object v4, v6

    .line 853
    move-object/from16 v6, v17

    .line 854
    .line 855
    const/16 v17, 0x1

    .line 856
    .line 857
    move-object/from16 v25, v1

    .line 858
    .line 859
    move-object v1, v5

    .line 860
    move-object/from16 v5, v16

    .line 861
    .line 862
    move-object/from16 v16, v11

    .line 863
    .line 864
    move-object/from16 v36, v12

    .line 865
    .line 866
    move-object/from16 v37, v13

    .line 867
    .line 868
    move-object/from16 v34, v22

    .line 869
    .line 870
    move-object/from16 v35, v25

    .line 871
    .line 872
    move-object v12, v7

    .line 873
    move-object v13, v8

    .line 874
    move-object/from16 v8, v20

    .line 875
    .line 876
    move-object/from16 v20, v23

    .line 877
    .line 878
    move-object/from16 v7, v29

    .line 879
    .line 880
    invoke-static/range {v0 .. v17}, Ldz0;->ι(Ldz0;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ProgressBar;Landroid/widget/ImageView;Landroid/widget/ScrollView;Landroid/widget/GridLayout;Landroid/widget/HorizontalScrollView;Landroid/widget/LinearLayout;ILzy0;Landroid/view/ViewGroup;Z)V

    .line 881
    .line 882
    .line 883
    move-object/from16 v40, v5

    .line 884
    .line 885
    move-object v5, v1

    .line 886
    move-object v1, v10

    .line 887
    move-object/from16 v10, v40

    .line 888
    .line 889
    move-object/from16 v0, p0

    .line 890
    .line 891
    move-object/from16 v17, v6

    .line 892
    .line 893
    move-object v15, v9

    .line 894
    move-object/from16 v16, v10

    .line 895
    .line 896
    move-object v7, v12

    .line 897
    move/from16 v14, v24

    .line 898
    .line 899
    move-object/from16 v12, v36

    .line 900
    .line 901
    move-object/from16 v9, v37

    .line 902
    .line 903
    move-object v10, v1

    .line 904
    move-object v6, v4

    .line 905
    move-object/from16 v20, v8

    .line 906
    .line 907
    move-object v8, v13

    .line 908
    move-object/from16 v1, v35

    .line 909
    .line 910
    goto :goto_1

    .line 911
    :cond_4
    move-object/from16 v20, v23

    .line 912
    .line 913
    invoke-static {}, Lyh;->х()V

    .line 914
    .line 915
    .line 916
    throw v20

    .line 917
    :cond_5
    move-object/from16 v35, v1

    .line 918
    .line 919
    move-object v0, v6

    .line 920
    move-object v13, v8

    .line 921
    move-object/from16 v37, v9

    .line 922
    .line 923
    move-object v1, v10

    .line 924
    move-object/from16 v36, v12

    .line 925
    .line 926
    move-object v9, v15

    .line 927
    move-object/from16 v10, v16

    .line 928
    .line 929
    move-object/from16 v6, v17

    .line 930
    .line 931
    move-object/from16 v8, v20

    .line 932
    .line 933
    move-object/from16 v34, v22

    .line 934
    .line 935
    move-object/from16 v20, v23

    .line 936
    .line 937
    move-object v12, v7

    .line 938
    move-object/from16 v7, v29

    .line 939
    .line 940
    const/4 v4, 0x0

    .line 941
    goto :goto_2

    .line 942
    :cond_6
    move-object/from16 v35, v1

    .line 943
    .line 944
    move-object v0, v6

    .line 945
    move-object v13, v8

    .line 946
    move-object/from16 v37, v9

    .line 947
    .line 948
    move-object v1, v10

    .line 949
    move-object/from16 v36, v12

    .line 950
    .line 951
    move-object v9, v15

    .line 952
    move-object/from16 v10, v16

    .line 953
    .line 954
    move-object/from16 v6, v17

    .line 955
    .line 956
    move-object/from16 v8, v20

    .line 957
    .line 958
    move-object/from16 v34, v22

    .line 959
    .line 960
    move-object/from16 v20, v23

    .line 961
    .line 962
    move-object v12, v7

    .line 963
    move-object/from16 v7, v29

    .line 964
    .line 965
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 966
    .line 967
    .line 968
    const/4 v4, 0x0

    .line 969
    invoke-virtual {v14, v4}, Landroid/view/View;->setVisibility(I)V

    .line 970
    .line 971
    .line 972
    invoke-virtual {v12, v4}, Landroid/view/View;->setVisibility(I)V

    .line 973
    .line 974
    .line 975
    :goto_2
    invoke-virtual/range {v28 .. v28}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 976
    .line 977
    .line 978
    move-result-object v18

    .line 979
    move v14, v4

    .line 980
    :goto_3
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    .line 981
    .line 982
    .line 983
    move-result v15

    .line 984
    if-eqz v15, :cond_9

    .line 985
    .line 986
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 987
    .line 988
    .line 989
    move-result-object v15

    .line 990
    add-int/lit8 v19, v14, 0x1

    .line 991
    .line 992
    if-ltz v14, :cond_8

    .line 993
    .line 994
    check-cast v15, Lzy0;

    .line 995
    .line 996
    move-object/from16 v16, v0

    .line 997
    .line 998
    move-object/from16 v17, v1

    .line 999
    .line 1000
    move-object/from16 v0, v35

    .line 1001
    .line 1002
    move-object/from16 v1, v36

    .line 1003
    .line 1004
    if-eq v1, v0, :cond_7

    .line 1005
    .line 1006
    move-object/from16 v36, v1

    .line 1007
    .line 1008
    move-object v1, v5

    .line 1009
    move-object v5, v10

    .line 1010
    move-object/from16 v10, v17

    .line 1011
    .line 1012
    const/16 v17, 0x0

    .line 1013
    .line 1014
    move/from16 v33, v4

    .line 1015
    .line 1016
    move-object/from16 v4, v16

    .line 1017
    .line 1018
    move-object/from16 v16, v13

    .line 1019
    .line 1020
    move-object/from16 v38, v0

    .line 1021
    .line 1022
    move-object/from16 v39, v36

    .line 1023
    .line 1024
    move-object/from16 v0, p0

    .line 1025
    .line 1026
    invoke-static/range {v0 .. v17}, Ldz0;->ι(Ldz0;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ProgressBar;Landroid/widget/ImageView;Landroid/widget/ScrollView;Landroid/widget/GridLayout;Landroid/widget/HorizontalScrollView;Landroid/widget/LinearLayout;ILzy0;Landroid/view/ViewGroup;Z)V

    .line 1027
    .line 1028
    .line 1029
    move-object/from16 v17, v10

    .line 1030
    .line 1031
    move-object v10, v5

    .line 1032
    move-object v5, v1

    .line 1033
    :goto_4
    move-object/from16 v22, v11

    .line 1034
    .line 1035
    move-object v11, v6

    .line 1036
    goto :goto_5

    .line 1037
    :cond_7
    move-object/from16 v38, v0

    .line 1038
    .line 1039
    move-object/from16 v39, v1

    .line 1040
    .line 1041
    move-object/from16 v4, v16

    .line 1042
    .line 1043
    goto :goto_4

    .line 1044
    :goto_5
    move-object v0, v4

    .line 1045
    move-object v6, v11

    .line 1046
    move-object/from16 v1, v17

    .line 1047
    .line 1048
    move/from16 v14, v19

    .line 1049
    .line 1050
    move-object/from16 v11, v22

    .line 1051
    .line 1052
    move-object/from16 v35, v38

    .line 1053
    .line 1054
    move-object/from16 v36, v39

    .line 1055
    .line 1056
    const/4 v4, 0x0

    .line 1057
    goto :goto_3

    .line 1058
    :cond_8
    invoke-static {}, Lyh;->х()V

    .line 1059
    .line 1060
    .line 1061
    throw v20

    .line 1062
    :cond_9
    move-object v4, v0

    .line 1063
    move-object/from16 v17, v1

    .line 1064
    .line 1065
    move-object/from16 v22, v11

    .line 1066
    .line 1067
    move-object/from16 v38, v35

    .line 1068
    .line 1069
    move-object/from16 v39, v36

    .line 1070
    .line 1071
    move-object v11, v6

    .line 1072
    new-instance v0, Lry0;

    .line 1073
    .line 1074
    const/4 v1, 0x2

    .line 1075
    move-object v6, v4

    .line 1076
    move-object v4, v3

    .line 1077
    move-object v3, v2

    .line 1078
    move-object/from16 v2, p0

    .line 1079
    .line 1080
    invoke-direct/range {v0 .. v6}, Lry0;-><init>(ILdz0;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 1081
    .line 1082
    .line 1083
    move-object v2, v3

    .line 1084
    move-object v3, v4

    .line 1085
    move-object v4, v6

    .line 1086
    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1087
    .line 1088
    .line 1089
    new-instance v0, Lry0;

    .line 1090
    .line 1091
    const/4 v1, 0x0

    .line 1092
    move-object v4, v3

    .line 1093
    move-object v3, v2

    .line 1094
    move-object/from16 v2, p0

    .line 1095
    .line 1096
    invoke-direct/range {v0 .. v6}, Lry0;-><init>(ILdz0;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 1097
    .line 1098
    .line 1099
    move-object v1, v6

    .line 1100
    move-object v6, v0

    .line 1101
    move-object v0, v2

    .line 1102
    move-object v2, v3

    .line 1103
    move-object v3, v4

    .line 1104
    move-object v4, v1

    .line 1105
    move-object/from16 v1, v31

    .line 1106
    .line 1107
    invoke-virtual {v1, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1108
    .line 1109
    .line 1110
    new-instance v1, Lsy0;

    .line 1111
    .line 1112
    const/4 v6, 0x0

    .line 1113
    invoke-direct {v1, v0, v6}, Lsy0;-><init>(Ldz0;I)V

    .line 1114
    .line 1115
    .line 1116
    move-object/from16 v6, v32

    .line 1117
    .line 1118
    invoke-virtual {v6, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1119
    .line 1120
    .line 1121
    new-instance v1, Lsy0;

    .line 1122
    .line 1123
    const/4 v15, 0x1

    .line 1124
    invoke-direct {v1, v0, v15}, Lsy0;-><init>(Ldz0;I)V

    .line 1125
    .line 1126
    .line 1127
    invoke-virtual {v3, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1128
    .line 1129
    .line 1130
    move-object/from16 v1, v38

    .line 1131
    .line 1132
    move-object/from16 v6, v39

    .line 1133
    .line 1134
    if-ne v6, v1, :cond_a

    .line 1135
    .line 1136
    invoke-static {v0, v5, v2, v3, v4}, Ldz0;->μ(Ldz0;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/TextView;)V

    .line 1137
    .line 1138
    .line 1139
    goto :goto_6

    .line 1140
    :cond_a
    const/4 v0, 0x0

    .line 1141
    move-object v1, v13

    .line 1142
    move-object v13, v5

    .line 1143
    move-object v5, v12

    .line 1144
    move-object v12, v7

    .line 1145
    move-object v7, v1

    .line 1146
    move-object/from16 v1, p0

    .line 1147
    .line 1148
    move-object v14, v4

    .line 1149
    move-object v6, v9

    .line 1150
    move-object/from16 v9, v17

    .line 1151
    .line 1152
    move-object/from16 v4, v22

    .line 1153
    .line 1154
    invoke-static/range {v0 .. v14}, Ldz0;->κ(ILdz0;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/GridLayout;Landroid/widget/HorizontalScrollView;Landroid/widget/ImageView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ScrollView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 1155
    .line 1156
    .line 1157
    move-object v0, v1

    .line 1158
    :goto_6
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 1159
    .line 1160
    move-object/from16 v13, v37

    .line 1161
    .line 1162
    invoke-direct {v1, v13}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1163
    .line 1164
    .line 1165
    move-object/from16 v2, v34

    .line 1166
    .line 1167
    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v1

    .line 1171
    invoke-virtual {v1, v15}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v1

    .line 1175
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v1

    .line 1179
    iput-object v1, v0, Ldz0;->κ:Landroid/app/AlertDialog;

    .line 1180
    .line 1181
    if-eqz v1, :cond_b

    .line 1182
    .line 1183
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    .line 1184
    .line 1185
    .line 1186
    :cond_b
    iget-object v0, v0, Ldz0;->κ:Landroid/app/AlertDialog;

    .line 1187
    .line 1188
    if-eqz v0, :cond_c

    .line 1189
    .line 1190
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v0

    .line 1194
    if-eqz v0, :cond_c

    .line 1195
    .line 1196
    const v1, 0x106000d

    .line 1197
    .line 1198
    .line 1199
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 1200
    .line 1201
    .line 1202
    const v1, 0x3ee66666    # 0.45f

    .line 1203
    .line 1204
    .line 1205
    invoke-virtual {v0, v1}, Landroid/view/Window;->setDimAmount(F)V

    .line 1206
    .line 1207
    .line 1208
    const/4 v1, 0x2

    .line 1209
    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 1210
    .line 1211
    .line 1212
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v1

    .line 1216
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v1

    .line 1220
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 1221
    .line 1222
    int-to-float v1, v1

    .line 1223
    const v2, 0x3f6b851f    # 0.92f

    .line 1224
    .line 1225
    .line 1226
    mul-float/2addr v1, v2

    .line 1227
    float-to-int v1, v1

    .line 1228
    const/4 v2, -0x2

    .line 1229
    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V

    .line 1230
    .line 1231
    .line 1232
    :cond_c
    return-void

    .line 1233
    :cond_d
    move-object/from16 v20, v23

    .line 1234
    .line 1235
    invoke-static/range {v27 .. v27}, Lln0;->и(Ljava/lang/String;)V

    .line 1236
    .line 1237
    .line 1238
    throw v20

    .line 1239
    :cond_e
    move-object/from16 v20, v23

    .line 1240
    .line 1241
    invoke-static/range {v27 .. v27}, Lln0;->и(Ljava/lang/String;)V

    .line 1242
    .line 1243
    .line 1244
    throw v20

    .line 1245
    :cond_f
    move-object/from16 v20, v23

    .line 1246
    .line 1247
    invoke-static/range {v27 .. v27}, Lln0;->и(Ljava/lang/String;)V

    .line 1248
    .line 1249
    .line 1250
    throw v20

    .line 1251
    :cond_10
    const/16 v20, 0x0

    .line 1252
    .line 1253
    invoke-static/range {v27 .. v27}, Lln0;->и(Ljava/lang/String;)V

    .line 1254
    .line 1255
    .line 1256
    throw v20

    .line 1257
    :cond_11
    const/16 v20, 0x0

    .line 1258
    .line 1259
    invoke-static/range {v27 .. v27}, Lln0;->и(Ljava/lang/String;)V

    .line 1260
    .line 1261
    .line 1262
    throw v20

    .line 1263
    :cond_12
    const/16 v20, 0x0

    .line 1264
    .line 1265
    invoke-static/range {v27 .. v27}, Lln0;->и(Ljava/lang/String;)V

    .line 1266
    .line 1267
    .line 1268
    throw v20

    .line 1269
    :cond_13
    move-object/from16 v20, v1

    .line 1270
    .line 1271
    invoke-static/range {v27 .. v27}, Lln0;->и(Ljava/lang/String;)V

    .line 1272
    .line 1273
    .line 1274
    throw v20

    .line 1275
    :cond_14
    move-object/from16 v20, v1

    .line 1276
    .line 1277
    invoke-static/range {v27 .. v27}, Lln0;->и(Ljava/lang/String;)V

    .line 1278
    .line 1279
    .line 1280
    throw v20

    .line 1281
    :cond_15
    move-object/from16 v20, v1

    .line 1282
    .line 1283
    invoke-static/range {v27 .. v27}, Lln0;->и(Ljava/lang/String;)V

    .line 1284
    .line 1285
    .line 1286
    throw v20

    .line 1287
    :cond_16
    const/16 v20, 0x0

    .line 1288
    .line 1289
    invoke-static/range {v27 .. v27}, Lln0;->и(Ljava/lang/String;)V

    .line 1290
    .line 1291
    .line 1292
    throw v20

    .line 1293
    :cond_17
    const/16 v20, 0x0

    .line 1294
    .line 1295
    invoke-static/range {v27 .. v27}, Lln0;->и(Ljava/lang/String;)V

    .line 1296
    .line 1297
    .line 1298
    throw v20

    .line 1299
    :cond_18
    const/16 v20, 0x0

    .line 1300
    .line 1301
    invoke-static/range {v27 .. v27}, Lln0;->и(Ljava/lang/String;)V

    .line 1302
    .line 1303
    .line 1304
    throw v20
.end method

.method public final ν(Landroid/widget/Button;IIZZ)V
    .locals 2

    .line 1
    invoke-virtual {p1, p5}, Landroid/view/View;->setEnabled(Z)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 6
    .line 7
    .line 8
    const/16 v1, 0x11

    .line 9
    .line 10
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x4

    .line 14
    invoke-virtual {p1, v1}, Landroid/view/View;->setTextAlignment(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0, v0, v0, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMinWidth(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroid/view/View;->setMinimumWidth(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroid/view/View;->setMinimumHeight(I)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-virtual {p1, v0}, Landroid/view/View;->setStateListAnimator(Landroid/animation/StateListAnimator;)V

    .line 37
    .line 38
    .line 39
    const-string v1, "theme"

    .line 40
    .line 41
    if-eqz p5, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    iget-object p2, p0, Ldz0;->ι:Lbz0;

    .line 45
    .line 46
    if-eqz p2, :cond_4

    .line 47
    .line 48
    iget p2, p2, Lbz0;->κ:I

    .line 49
    .line 50
    :goto_0
    if-eqz p5, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    iget-object p3, p0, Ldz0;->ι:Lbz0;

    .line 54
    .line 55
    if-eqz p3, :cond_3

    .line 56
    .line 57
    iget p3, p3, Lbz0;->ζ:I

    .line 58
    .line 59
    :goto_1
    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v0, p4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 63
    .line 64
    .line 65
    const/16 p3, 0xe

    .line 66
    .line 67
    invoke-static {p0, p2, p3}, Ldz0;->δ(Ldz0;II)Landroid/graphics/drawable/GradientDrawable;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    new-instance p3, Landroid/graphics/drawable/RippleDrawable;

    .line 72
    .line 73
    iget-object p0, p0, Ldz0;->ι:Lbz0;

    .line 74
    .line 75
    if-eqz p0, :cond_2

    .line 76
    .line 77
    iget p0, p0, Lbz0;->λ:I

    .line 78
    .line 79
    invoke-static {p0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-direct {p3, p0, p2, v0}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, p3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_2
    invoke-static {v1}, Lln0;->и(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v0

    .line 94
    :cond_3
    invoke-static {v1}, Lln0;->и(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw v0

    .line 98
    :cond_4
    invoke-static {v1}, Lln0;->и(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw v0
.end method
