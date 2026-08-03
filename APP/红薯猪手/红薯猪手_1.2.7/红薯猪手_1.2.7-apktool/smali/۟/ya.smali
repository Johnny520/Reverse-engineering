.class public abstract L۟/ya;
.super Landroid/app/AlertDialog;
.source "SourceFile"


# static fields
.field public static final ۥ۟ۤ:I

.field public static final ۥ۟ۥ:I

.field public static final ۥ۟ۦ:F

.field public static final ۥ۟ۧ:F

.field public static final ۥ۟ۨ:I

.field public static final ۥ۠:I

.field public static final ۥ۠۟:I

.field public static final ۥ۠۠:I

.field public static final ۥ۠ۡ:I

.field public static final ۥ۠ۢ:I

.field public static final ۥۣ۠:I


# instance fields
.field public final ۥ:Landroid/content/Context;

.field public ۥ۟:Landroid/view/View;

.field public ۥ۟۟:Z

.field public ۥ۟۠:Z

.field public ۥ۟ۡ:Z

.field public ۥ۟ۢ:I

.field public ۥۣ۟:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/high16 v0, 0x41200000    # 10.0f

    invoke-static {v0}, L۟/tb;->ۥ۟۠(F)I

    move-result v1

    sput v1, L۟/ya;->ۥ۟ۤ:I

    const/high16 v1, 0x41700000    # 15.0f

    invoke-static {v1}, L۟/tb;->ۥ۟۠(F)I

    move-result v1

    sput v1, L۟/ya;->ۥ۟ۥ:I

    const/high16 v1, 0x41800000    # 16.0f

    sput v1, L۟/ya;->ۥ۟ۦ:F

    const/high16 v1, 0x41600000    # 14.0f

    sput v1, L۟/ya;->ۥ۟ۧ:F

    const/high16 v1, 0x42200000    # 40.0f

    invoke-static {v1}, L۟/tb;->ۥ۟۠(F)I

    move-result v1

    sput v1, L۟/ya;->ۥ۟ۨ:I

    const/high16 v1, 0x41f00000    # 30.0f

    invoke-static {v1}, L۟/tb;->ۥ۟۠(F)I

    move-result v1

    sput v1, L۟/ya;->ۥ۠:I

    const/4 v1, 0x7

    new-array v2, v1, [B

    fill-array-data v2, :array_0

    const/4 v3, 0x6

    new-array v4, v3, [B

    fill-array-data v4, :array_1

    invoke-static {v2, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    sput v2, L۟/ya;->ۥ۠۟:I

    new-array v1, v1, [B

    fill-array-data v1, :array_2

    new-array v2, v3, [B

    fill-array-data v2, :array_3

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    const/16 v1, 0xff

    const/16 v2, 0xf8

    const/16 v3, 0xc4

    invoke-static {v1, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    sput v2, L۟/ya;->ۥ۠۠:I

    const/16 v2, 0xf5

    const/16 v3, 0x7b

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    sput v1, L۟/ya;->ۥ۠ۡ:I

    invoke-static {v0}, L۟/tb;->ۥ۟۠(F)I

    move-result v0

    sput v0, L۟/ya;->ۥ۠ۢ:I

    const/high16 v0, 0x40a00000    # 5.0f

    invoke-static {v0}, L۟/tb;->ۥ۟۠(F)I

    move-result v0

    sput v0, L۟/ya;->ۥۣ۠:I

    return-void

    nop

    :array_0
    .array-data 1
        -0x27t
        -0x46t
        -0x46t
        -0x9t
        -0x28t
        -0x70t
        -0x41t
    .end array-data

    :array_1
    .array-data 1
        -0x6t
        -0x4t
        -0x7dt
        -0x4et
        -0x16t
        -0x59t
    .end array-data

    nop

    :array_2
    .array-data 1
        0x3t
        0x6at
        -0x39t
        -0x5ft
        -0x3bt
        -0x47t
        0x65t
    .end array-data

    :array_3
    .array-data 1
        0x20t
        0x2ft
        -0x7et
        -0x1ct
        -0x80t
        -0x4t
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 2

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0, p1, p2}, Landroid/app/AlertDialog;-><init>(Landroid/content/Context;I)V

    iput-object p1, p0, L۟/ya;->ۥ:Landroid/content/Context;

    const/4 p1, 0x1

    iput-boolean p1, p0, L۟/ya;->ۥ۟۟:Z

    return-void

    :array_0
    .array-data 1
        -0x5t
        0x7dt
        -0x69t
    .end array-data

    :array_1
    .array-data 1
        -0x68t
        0x5t
        -0x1dt
        -0x1at
        0x73t
        0x27t
    .end array-data
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/Window;->requestFeature(I)Z

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/16 v1, 0x400

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-super {p0, p1}, Landroid/app/AlertDialog;->onCreate(Landroid/os/Bundle;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, L۟/ya;->ۥۣ۟()Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, L۟/ya;->ۥ۟:Landroid/view/View;

    .line 30
    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    sget p1, L۟/o;->ۥ:I

    .line 38
    .line 39
    const/16 p1, 0x2d

    .line 40
    .line 41
    new-array p1, p1, [B

    .line 42
    .line 43
    fill-array-data p1, :array_0

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x6

    .line 47
    new-array v0, v0, [B

    .line 48
    .line 49
    fill-array-data v0, :array_1

    .line 50
    .line 51
    .line 52
    invoke-static {p1, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const/4 v0, 0x0

    .line 57
    invoke-static {v0, p1}, L۟/o;->ۥ۟ۨ(ILjava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 61
    .line 62
    .line 63
    :goto_0
    return-void

    .line 64
    nop

    .line 65
    :array_0
    .array-data 1
        -0x24t
        -0x75t
        -0x60t
        0x67t
        -0x75t
        0x6t
        -0x24t
        -0x56t
        -0x6et
        0x67t
        -0x56t
        0x11t
        -0x2et
        -0x54t
        -0x73t
        0x65t
        -0x76t
        0x28t
        -0x21t
        -0x5at
        -0x7et
        0x6at
        -0x7dt
        0x23t
        -0x2bt
        -0x42t
        -0x41t
        0x6at
        -0x68t
        0x31t
        -0x2et
        -0x7dt
        -0x59t
        0x65t
        -0x7ct
        0x3dt
        -0x21t
        -0x42t
        -0x4dt
        0x67t
        -0x48t
        0x17t
        -0x2et
        -0x7et
        -0x4at
    .end array-data

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    nop

    .line 93
    :array_1
    .array-data 1
        0x3at
        0x2t
        0x33t
        -0x7et
        0x37t
        -0x7at
    .end array-data
.end method

.method public show()V
    .locals 12

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->show()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, L۟/ya;->ۥ۟:Landroid/view/View;

    .line 5
    .line 6
    if-eqz v0, :cond_9

    .line 7
    .line 8
    new-instance v0, Landroid/util/DisplayMetrics;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, L۟/ya;->ۥ:Landroid/content/Context;

    .line 14
    .line 15
    const/4 v2, 0x6

    .line 16
    new-array v3, v2, [B

    .line 17
    .line 18
    fill-array-data v3, :array_0

    .line 19
    .line 20
    .line 21
    new-array v4, v2, [B

    .line 22
    .line 23
    fill-array-data v4, :array_1

    .line 24
    .line 25
    .line 26
    invoke-static {v3, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/16 v3, 0x3f

    .line 35
    .line 36
    new-array v4, v3, [B

    .line 37
    .line 38
    fill-array-data v4, :array_2

    .line 39
    .line 40
    .line 41
    new-array v5, v2, [B

    .line 42
    .line 43
    fill-array-data v5, :array_3

    .line 44
    .line 45
    .line 46
    invoke-static {v4, v5}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-static {v4, v1}, L۟/h4;->ۥ۟۟(Ljava/lang/String;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    check-cast v1, Landroid/view/WindowManager;

    .line 54
    .line 55
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 60
    .line 61
    .line 62
    iget-boolean v1, p0, L۟/ya;->ۥ۟ۡ:Z

    .line 63
    .line 64
    const/16 v4, 0x39

    .line 65
    .line 66
    const/16 v5, 0x9

    .line 67
    .line 68
    const/4 v6, -0x1

    .line 69
    const/4 v7, 0x1

    .line 70
    const/4 v8, 0x0

    .line 71
    if-eqz v1, :cond_1

    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    if-eqz v1, :cond_2

    .line 78
    .line 79
    new-instance v9, Landroid/graphics/drawable/ColorDrawable;

    .line 80
    .line 81
    new-array v5, v5, [B

    .line 82
    .line 83
    fill-array-data v5, :array_4

    .line 84
    .line 85
    .line 86
    new-array v10, v2, [B

    .line 87
    .line 88
    fill-array-data v10, :array_5

    .line 89
    .line 90
    .line 91
    invoke-static {v5, v10}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    invoke-direct {v9, v5}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, v9}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    iget-object v9, p0, L۟/ya;->ۥ:Landroid/content/Context;

    .line 110
    .line 111
    new-array v10, v4, [B

    .line 112
    .line 113
    fill-array-data v10, :array_6

    .line 114
    .line 115
    .line 116
    new-array v11, v2, [B

    .line 117
    .line 118
    fill-array-data v11, :array_7

    .line 119
    .line 120
    .line 121
    invoke-static {v10, v11}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v10

    .line 125
    invoke-static {v10, v9}, L۟/h4;->ۥ۟۟(Ljava/lang/String;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    check-cast v9, Landroid/app/Activity;

    .line 129
    .line 130
    invoke-virtual {v9}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 131
    .line 132
    .line 133
    move-result-object v9

    .line 134
    invoke-virtual {v9}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    invoke-virtual {v9}, Landroid/view/View;->getHeight()I

    .line 139
    .line 140
    .line 141
    move-result v9

    .line 142
    iput v9, v5, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 143
    .line 144
    iget v9, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 145
    .line 146
    iput v9, v5, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 147
    .line 148
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    const/16 v10, 0x500

    .line 153
    .line 154
    invoke-virtual {v9, v10}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 155
    .line 156
    .line 157
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 158
    .line 159
    const/16 v10, 0x1c

    .line 160
    .line 161
    if-lt v9, v10, :cond_0

    .line 162
    .line 163
    iput v7, v5, Landroid/view/WindowManager$LayoutParams;->layoutInDisplayCutoutMode:I

    .line 164
    .line 165
    :cond_0
    invoke-virtual {v1, v5}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 166
    .line 167
    .line 168
    new-instance v5, Landroid/view/View;

    .line 169
    .line 170
    iget-object v9, p0, L۟/ya;->ۥ:Landroid/content/Context;

    .line 171
    .line 172
    invoke-direct {v5, v9}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 173
    .line 174
    .line 175
    new-instance v9, Landroid/widget/FrameLayout$LayoutParams;

    .line 176
    .line 177
    invoke-direct {v9, v6, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v5, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v5, v8}, Landroid/view/View;->setBackgroundColor(I)V

    .line 184
    .line 185
    .line 186
    new-instance v9, L۟/wa;

    .line 187
    .line 188
    invoke-direct {v9, p0, v7}, L۟/wa;-><init>(L۟/ya;I)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v5, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    new-array v3, v3, [B

    .line 199
    .line 200
    fill-array-data v3, :array_8

    .line 201
    .line 202
    .line 203
    new-array v9, v2, [B

    .line 204
    .line 205
    fill-array-data v9, :array_9

    .line 206
    .line 207
    .line 208
    invoke-static {v3, v9}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-static {v3, v1}, L۟/h4;->ۥ۟۟(Ljava/lang/String;Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    check-cast v1, Landroid/widget/FrameLayout;

    .line 216
    .line 217
    invoke-virtual {v1, v5, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 218
    .line 219
    .line 220
    goto :goto_0

    .line 221
    :cond_1
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    if-eqz v1, :cond_2

    .line 226
    .line 227
    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    .line 228
    .line 229
    new-array v5, v5, [B

    .line 230
    .line 231
    fill-array-data v5, :array_a

    .line 232
    .line 233
    .line 234
    new-array v9, v2, [B

    .line 235
    .line 236
    fill-array-data v9, :array_b

    .line 237
    .line 238
    .line 239
    invoke-static {v5, v9}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 244
    .line 245
    .line 246
    move-result v5

    .line 247
    invoke-direct {v3, v5}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1, v3}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 251
    .line 252
    .line 253
    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    if-eqz v1, :cond_3

    .line 258
    .line 259
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    if-eqz v1, :cond_3

    .line 264
    .line 265
    invoke-virtual {v1, v8, v8, v8, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 266
    .line 267
    .line 268
    :cond_3
    iget-object v1, p0, L۟/ya;->ۥ۟:Landroid/view/View;

    .line 269
    .line 270
    invoke-static {v1}, L۟/h4;->ۥ۟(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    const/16 v3, 0x4c

    .line 278
    .line 279
    new-array v3, v3, [B

    .line 280
    .line 281
    fill-array-data v3, :array_c

    .line 282
    .line 283
    .line 284
    new-array v5, v2, [B

    .line 285
    .line 286
    fill-array-data v5, :array_d

    .line 287
    .line 288
    .line 289
    invoke-static {v3, v5}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    invoke-static {v3, v1}, L۟/h4;->ۥ۟۟(Ljava/lang/String;Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 297
    .line 298
    invoke-virtual {v1, v8, v8, v8, v8}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 299
    .line 300
    .line 301
    const/16 v3, 0x11

    .line 302
    .line 303
    iput v3, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 304
    .line 305
    iget v3, p0, L۟/ya;->ۥ۟ۢ:I

    .line 306
    .line 307
    if-eqz v3, :cond_4

    .line 308
    .line 309
    iget v5, p0, L۟/ya;->ۥۣ۟:I

    .line 310
    .line 311
    if-eqz v5, :cond_4

    .line 312
    .line 313
    iput v3, v1, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 314
    .line 315
    iput v5, v1, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 316
    .line 317
    goto/16 :goto_3

    .line 318
    .line 319
    :cond_4
    iget-boolean v3, p0, L۟/ya;->ۥ۟۠:Z

    .line 320
    .line 321
    if-eqz v3, :cond_5

    .line 322
    .line 323
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 324
    .line 325
    iput v0, v1, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 326
    .line 327
    iget-object v0, p0, L۟/ya;->ۥ:Landroid/content/Context;

    .line 328
    .line 329
    new-array v3, v4, [B

    .line 330
    .line 331
    fill-array-data v3, :array_e

    .line 332
    .line 333
    .line 334
    new-array v2, v2, [B

    .line 335
    .line 336
    fill-array-data v2, :array_f

    .line 337
    .line 338
    .line 339
    invoke-static {v3, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    invoke-static {v2, v0}, L۟/h4;->ۥ۟۟(Ljava/lang/String;Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    check-cast v0, Landroid/app/Activity;

    .line 347
    .line 348
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 357
    .line 358
    .line 359
    move-result v0

    .line 360
    iput v0, v1, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 361
    .line 362
    goto :goto_3

    .line 363
    :cond_5
    iget v2, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 364
    .line 365
    int-to-float v2, v2

    .line 366
    const/high16 v3, 0x3f800000    # 1.0f

    .line 367
    .line 368
    mul-float/2addr v2, v3

    .line 369
    iget v3, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 370
    .line 371
    int-to-float v3, v3

    .line 372
    div-float/2addr v2, v3

    .line 373
    const v3, 0x3fd9999a    # 1.7f

    .line 374
    .line 375
    .line 376
    cmpg-float v2, v2, v3

    .line 377
    .line 378
    if-gez v2, :cond_6

    .line 379
    .line 380
    const/high16 v2, 0x42480000    # 50.0f

    .line 381
    .line 382
    goto :goto_1

    .line 383
    :cond_6
    const/high16 v2, 0x41900000    # 18.0f

    .line 384
    .line 385
    :goto_1
    invoke-static {v7, v2}, L۟/c4;->ۥۣ۟(IF)F

    .line 386
    .line 387
    .line 388
    move-result v3

    .line 389
    float-to-int v3, v3

    .line 390
    invoke-static {v7, v2}, L۟/c4;->ۥۣ۟(IF)F

    .line 391
    .line 392
    .line 393
    move-result v2

    .line 394
    float-to-int v2, v2

    .line 395
    invoke-virtual {v1, v3, v8, v2, v8}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 396
    .line 397
    .line 398
    iget-boolean v2, p0, L۟/ya;->ۥ۟۟:Z

    .line 399
    .line 400
    if-eqz v2, :cond_7

    .line 401
    .line 402
    const/4 v0, -0x2

    .line 403
    goto :goto_2

    .line 404
    :cond_7
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 405
    .line 406
    int-to-float v0, v0

    .line 407
    const v2, 0x3f666666    # 0.9f

    .line 408
    .line 409
    .line 410
    mul-float/2addr v0, v2

    .line 411
    float-to-int v0, v0

    .line 412
    :goto_2
    iput v0, v1, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 413
    .line 414
    iget-boolean v0, p0, L۟/ya;->ۥ۟ۡ:Z

    .line 415
    .line 416
    if-eqz v0, :cond_8

    .line 417
    .line 418
    const/high16 v0, 0x420c0000    # 35.0f

    .line 419
    .line 420
    invoke-static {v7, v0}, L۟/c4;->ۥۣ۟(IF)F

    .line 421
    .line 422
    .line 423
    move-result v0

    .line 424
    float-to-int v0, v0

    .line 425
    invoke-virtual {v1, v8, v0, v8, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 426
    .line 427
    .line 428
    :cond_8
    iget-object v0, p0, L۟/ya;->ۥ۟:Landroid/view/View;

    .line 429
    .line 430
    invoke-static {v0}, L۟/h4;->ۥ۟(Ljava/lang/Object;)V

    .line 431
    .line 432
    .line 433
    const/high16 v2, 0x41200000    # 10.0f

    .line 434
    .line 435
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 436
    .line 437
    .line 438
    move-result-object v3

    .line 439
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 440
    .line 441
    .line 442
    move-result-object v3

    .line 443
    invoke-static {v7, v2, v3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 444
    .line 445
    .line 446
    move-result v2

    .line 447
    float-to-int v2, v2

    .line 448
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    .line 449
    .line 450
    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v3, v8}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v3, v8}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V

    .line 457
    .line 458
    .line 459
    int-to-float v2, v2

    .line 460
    invoke-virtual {v3, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v3, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v0, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 467
    .line 468
    .line 469
    :goto_3
    iget-object v0, p0, L۟/ya;->ۥ۟:Landroid/view/View;

    .line 470
    .line 471
    invoke-static {v0}, L۟/h4;->ۥ۟(Ljava/lang/Object;)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 475
    .line 476
    .line 477
    :cond_9
    return-void

    .line 478
    nop

    .line 479
    :array_0
    .array-data 1
        -0x18t
        -0xft
        0x11t
        -0x66t
        -0x21t
        0x2bt
    .end array-data

    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    nop

    .line 487
    :array_1
    .array-data 1
        -0x61t
        -0x68t
        0x7ft
        -0x2t
        -0x50t
        0x5ct
    .end array-data

    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    nop

    .line 495
    :array_2
    .array-data 1
        0x3et
        0x5t
        -0x5et
        0x69t
        0x59t
        -0x60t
        0x31t
        0x1et
        -0x60t
        0x6at
        0xdt
        -0x1dt
        0x32t
        0x15t
        -0x12t
        0x66t
        0x18t
        -0x50t
        0x24t
        0x50t
        -0x46t
        0x6at
        0x59t
        -0x53t
        0x3ft
        0x1et
        -0x1dt
        0x6bt
        0xct
        -0x51t
        0x3ct
        0x50t
        -0x46t
        0x7ct
        0x9t
        -0x5at
        0x70t
        0x11t
        -0x60t
        0x61t
        0xbt
        -0x54t
        0x39t
        0x14t
        -0x20t
        0x73t
        0x10t
        -0x5at
        0x27t
        0x5et
        -0x67t
        0x6ct
        0x17t
        -0x59t
        0x3ft
        0x7t
        -0x7dt
        0x64t
        0x17t
        -0x5et
        0x37t
        0x15t
        -0x44t
    .end array-data

    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    :array_3
    .array-data 1
        0x50t
        0x70t
        -0x32t
        0x5t
        0x79t
        -0x3dt
    .end array-data

    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    nop

    .line 539
    :array_4
    .array-data 1
        0x2t
        0x10t
        -0x41t
        -0x1bt
        0x31t
        0x76t
        0x11t
        0x16t
        -0x47t
    .end array-data

    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    nop

    .line 549
    :array_5
    .array-data 1
        0x21t
        0x26t
        -0x77t
        -0x2bt
        0x1t
        0x46t
    .end array-data

    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    nop

    .line 557
    :array_6
    .array-data 1
        -0x3t
        0x42t
        0x4et
        0x1ft
        -0x48t
        -0x8t
        -0xet
        0x59t
        0x4ct
        0x1ct
        -0x14t
        -0x45t
        -0xft
        0x52t
        0x2t
        0x10t
        -0x7t
        -0x18t
        -0x19t
        0x17t
        0x56t
        0x1ct
        -0x48t
        -0xbt
        -0x4t
        0x59t
        0xft
        0x1dt
        -0x13t
        -0x9t
        -0x1t
        0x17t
        0x56t
        0xat
        -0x18t
        -0x2t
        -0x4dt
        0x56t
        0x4ct
        0x17t
        -0x16t
        -0xct
        -0x6t
        0x53t
        0xct
        0x12t
        -0x18t
        -0x15t
        -0x43t
        0x76t
        0x41t
        0x7t
        -0xft
        -0x13t
        -0x6t
        0x43t
        0x5bt
    .end array-data

    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    nop

    .line 591
    :array_7
    .array-data 1
        -0x6dt
        0x37t
        0x22t
        0x73t
        -0x68t
        -0x65t
    .end array-data

    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    nop

    .line 599
    :array_8
    .array-data 1
        0x40t
        -0x1t
        -0x7at
        0x47t
        -0x39t
        -0x76t
        0x4ft
        -0x1ct
        -0x7ct
        0x44t
        -0x6dt
        -0x37t
        0x4ct
        -0x11t
        -0x36t
        0x48t
        -0x7at
        -0x66t
        0x5at
        -0x56t
        -0x62t
        0x44t
        -0x39t
        -0x79t
        0x41t
        -0x1ct
        -0x39t
        0x45t
        -0x6et
        -0x7bt
        0x42t
        -0x56t
        -0x62t
        0x52t
        -0x69t
        -0x74t
        0xet
        -0x15t
        -0x7ct
        0x4ft
        -0x6bt
        -0x7at
        0x47t
        -0x12t
        -0x3ct
        0x5ct
        -0x72t
        -0x73t
        0x49t
        -0x11t
        -0x62t
        0x5t
        -0x5ft
        -0x65t
        0x4ft
        -0x19t
        -0x71t
        0x67t
        -0x7at
        -0x70t
        0x41t
        -0x1t
        -0x62t
    .end array-data

    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    :array_9
    .array-data 1
        0x2et
        -0x76t
        -0x16t
        0x2bt
        -0x19t
        -0x17t
    .end array-data

    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    nop

    .line 643
    :array_a
    .array-data 1
        -0x45t
        -0x37t
        0xat
        0x1ft
        -0x2et
        0x4t
        -0x58t
        -0x37t
        0xat
    .end array-data

    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    nop

    .line 653
    :array_b
    .array-data 1
        -0x68t
        -0x7t
        0x3at
        0x2ft
        -0x1et
        0x34t
    .end array-data

    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    nop

    .line 661
    :array_c
    .array-data 1
        0x69t
        -0x10t
        -0x6ct
        -0x74t
        0x15t
        0x43t
        0x66t
        -0x15t
        -0x6at
        -0x71t
        0x41t
        0x0t
        0x65t
        -0x20t
        -0x28t
        -0x7dt
        0x54t
        0x53t
        0x73t
        -0x5bt
        -0x74t
        -0x71t
        0x15t
        0x4et
        0x68t
        -0x15t
        -0x2bt
        -0x72t
        0x40t
        0x4ct
        0x6bt
        -0x5bt
        -0x74t
        -0x67t
        0x45t
        0x45t
        0x27t
        -0x1ct
        -0x6at
        -0x7ct
        0x47t
        0x4ft
        0x6et
        -0x1ft
        -0x2at
        -0x69t
        0x5ct
        0x44t
        0x60t
        -0x20t
        -0x74t
        -0x32t
        0x73t
        0x52t
        0x66t
        -0x18t
        -0x63t
        -0x54t
        0x54t
        0x59t
        0x68t
        -0x10t
        -0x74t
        -0x32t
        0x79t
        0x41t
        0x7et
        -0x16t
        -0x73t
        -0x6ct
        0x65t
        0x41t
        0x75t
        -0x1ct
        -0x6bt
        -0x6dt
    .end array-data

    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    :array_d
    .array-data 1
        0x7t
        -0x7bt
        -0x8t
        -0x20t
        0x35t
        0x20t
    .end array-data

    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    nop

    .line 711
    :array_e
    .array-data 1
        -0x60t
        -0x3ft
        -0x7et
        -0x6bt
        -0x36t
        0x6ct
        -0x51t
        -0x26t
        -0x80t
        -0x6at
        -0x62t
        0x2ft
        -0x54t
        -0x2ft
        -0x32t
        -0x66t
        -0x75t
        0x7ct
        -0x46t
        -0x6ct
        -0x66t
        -0x6at
        -0x36t
        0x61t
        -0x5ft
        -0x26t
        -0x3dt
        -0x69t
        -0x61t
        0x63t
        -0x5et
        -0x6ct
        -0x66t
        -0x80t
        -0x66t
        0x6at
        -0x12t
        -0x2bt
        -0x80t
        -0x63t
        -0x68t
        0x60t
        -0x59t
        -0x30t
        -0x40t
        -0x68t
        -0x66t
        0x7ft
        -0x20t
        -0xbt
        -0x73t
        -0x73t
        -0x7dt
        0x79t
        -0x59t
        -0x40t
        -0x69t
    .end array-data

    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    nop

    .line 745
    :array_f
    .array-data 1
        -0x32t
        -0x4ct
        -0x12t
        -0x7t
        -0x16t
        0xft
    .end array-data
.end method

.method public final ۥ()Landroid/widget/TextView;
    .locals 4

    new-instance v0, Landroid/widget/TextView;

    iget-object v1, p0, L۟/ya;->ۥ:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    sget v2, L۟/ya;->ۥ۟ۧ:F

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextSize(F)V

    const v2, -0x777778

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    sget v2, L۟/ya;->ۥ۟ۥ:I

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, v2, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v3, -0x2

    invoke-direct {v2, v1, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public final ۥ۟()Landroid/widget/TextView;
    .locals 4

    new-instance v0, Landroid/widget/TextView;

    iget-object v1, p0, L۟/ya;->ۥ:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x6

    new-array v2, v1, [B

    fill-array-data v2, :array_0

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-static {v2, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    sget v2, L۟/ya;->ۥ۟ۨ:I

    mul-int/lit8 v2, v2, 0x3

    div-int/lit8 v2, v2, 0x2

    const/4 v3, -0x1

    invoke-direct {v1, v3, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget v1, L۟/ya;->ۥ۟ۥ:I

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v2, v1, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    const/16 v1, 0x15

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    sget v1, L۟/ya;->ۥ۟ۦ:F

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    const v1, -0x777778

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v1, L۟/wa;

    invoke-direct {v1, p0, v2}, L۟/wa;-><init>(L۟/ya;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object v0

    nop

    :array_0
    .array-data 1
        -0x40t
        -0x67t
        -0x2at
        0x4at
        -0xdt
        -0x71t
    .end array-data

    nop

    :array_1
    .array-data 1
        0x28t
        0x26t
        0x42t
        -0x51t
        0x68t
        0x11t
    .end array-data
.end method

.method public final ۥ۟۟()Landroid/widget/LinearLayout;
    .locals 3

    new-instance v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, L۟/ya;->ۥ:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundColor(I)V

    return-object v0
.end method

.method public final ۥ۟۠(Ljava/lang/String;)Landroid/widget/RelativeLayout;
    .locals 8

    .line 1
    const/4 v0, 0x5

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x6

    .line 8
    new-array v2, v1, [B

    .line 9
    .line 10
    fill-array-data v2, :array_1

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    new-instance v0, Landroid/widget/RelativeLayout;

    .line 17
    .line 18
    iget-object v2, p0, L۟/ya;->ۥ:Landroid/content/Context;

    .line 19
    .line 20
    invoke-direct {v0, v2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    const/high16 v2, 0x41200000    # 10.0f

    .line 24
    .line 25
    invoke-static {v2}, L۟/tb;->ۥ۟۠(F)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    sget v3, L۟/ya;->ۥ۠۟:I

    .line 30
    .line 31
    invoke-static {v2, v3}, L۟/tb;->ۥ۟(II)Landroid/graphics/drawable/GradientDrawable;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 36
    .line 37
    .line 38
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 39
    .line 40
    const/high16 v4, 0x425c0000    # 55.0f

    .line 41
    .line 42
    invoke-static {v4}, L۟/tb;->ۥ۟۠(F)I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    const/4 v6, -0x1

    .line 47
    invoke-direct {v2, v6, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v3}, L۟/ya;->ۥ۟ۡ(I)Landroid/widget/TextView;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 58
    .line 59
    .line 60
    new-instance p1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 61
    .line 62
    invoke-static {v4}, L۟/tb;->ۥ۟۠(F)I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    invoke-direct {p1, v6, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 67
    .line 68
    .line 69
    const/16 v5, 0x9

    .line 70
    .line 71
    invoke-virtual {p1, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v3}, L۟/ya;->ۥ۟ۡ(I)Landroid/widget/TextView;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    const/high16 v2, 0x40a00000    # 5.0f

    .line 82
    .line 83
    invoke-static {v2}, L۟/tb;->ۥ۟۠(F)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    invoke-static {v2, v6}, L۟/tb;->ۥ۟۟(II)Landroid/graphics/drawable/GradientDrawable;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {p1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 92
    .line 93
    .line 94
    new-array v2, v1, [B

    .line 95
    .line 96
    fill-array-data v2, :array_2

    .line 97
    .line 98
    .line 99
    new-array v5, v1, [B

    .line 100
    .line 101
    fill-array-data v5, :array_3

    .line 102
    .line 103
    .line 104
    invoke-static {v2, v5}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 109
    .line 110
    .line 111
    const/high16 v2, 0x41600000    # 14.0f

    .line 112
    .line 113
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 114
    .line 115
    .line 116
    const/16 v2, 0x8

    .line 117
    .line 118
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 119
    .line 120
    .line 121
    sget-object v2, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 122
    .line 123
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 124
    .line 125
    .line 126
    new-instance v2, L۟/xa;

    .line 127
    .line 128
    const/4 v5, 0x0

    .line 129
    invoke-direct {v2, v5}, L۟/xa;-><init>(I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 133
    .line 134
    .line 135
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 136
    .line 137
    const/4 v6, -0x2

    .line 138
    const/high16 v7, 0x41f00000    # 30.0f

    .line 139
    .line 140
    invoke-static {v7}, L۟/tb;->ۥ۟۠(F)I

    .line 141
    .line 142
    .line 143
    move-result v7

    .line 144
    invoke-direct {v2, v6, v7}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 145
    .line 146
    .line 147
    const/high16 v6, 0x42340000    # 45.0f

    .line 148
    .line 149
    invoke-static {v6}, L۟/tb;->ۥ۟۠(F)I

    .line 150
    .line 151
    .line 152
    move-result v7

    .line 153
    invoke-virtual {v2, v5, v5, v7, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 154
    .line 155
    .line 156
    const/16 v5, 0xb

    .line 157
    .line 158
    invoke-virtual {v2, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 159
    .line 160
    .line 161
    const/16 v7, 0xf

    .line 162
    .line 163
    invoke-virtual {v2, v7}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, p1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0, v3}, L۟/ya;->ۥ۟ۡ(I)Landroid/widget/TextView;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    const/4 v3, 0x3

    .line 174
    new-array v3, v3, [B

    .line 175
    .line 176
    fill-array-data v3, :array_4

    .line 177
    .line 178
    .line 179
    new-array v1, v1, [B

    .line 180
    .line 181
    fill-array-data v1, :array_5

    .line 182
    .line 183
    .line 184
    invoke-static {v3, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 189
    .line 190
    .line 191
    const/16 v1, 0x11

    .line 192
    .line 193
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 194
    .line 195
    .line 196
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 197
    .line 198
    invoke-static {v6}, L۟/tb;->ۥ۟۠(F)I

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    invoke-static {v4}, L۟/tb;->ۥ۟۠(F)I

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    invoke-direct {v1, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1, v7}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 216
    .line 217
    .line 218
    new-instance v1, L۟/q1;

    .line 219
    .line 220
    const/4 v3, 0x2

    .line 221
    invoke-direct {v1, v3, p1}, L۟/q1;-><init>(ILjava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 225
    .line 226
    .line 227
    return-object v0

    .line 228
    nop

    .line 229
    :array_0
    .array-data 1
        0x2t
        -0x1ft
        0x35t
        0x16t
        -0x40t
    .end array-data

    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    nop

    .line 237
    :array_1
    .array-data 1
        0x76t
        -0x78t
        0x41t
        0x7at
        -0x5bt
        0x4dt
    .end array-data

    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    nop

    .line 245
    :array_2
    .array-data 1
        0x29t
        0x25t
        -0x4ct
        -0x66t
        0x5et
        -0x69t
    .end array-data

    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    nop

    .line 253
    :array_3
    .array-data 1
        -0x40t
        -0x5et
        0x39t
        0x7ft
        -0x32t
        0x38t
    .end array-data

    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    nop

    .line 261
    :array_4
    .array-data 1
        -0x31t
        -0x6ft
        -0x59t
    .end array-data

    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    :array_5
    .array-data 1
        0x2dt
        0x1at
        0x9t
        0x79t
        0x6ft
        -0x73t
    .end array-data
.end method

.method public final ۥ۟ۡ(I)Landroid/widget/TextView;
    .locals 3

    new-instance v0, Landroid/widget/TextView;

    iget-object v1, p0, L۟/ya;->ۥ:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    sget v1, L۟/ya;->ۥ۟ۥ:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v1, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v1, 0x41200000    # 10.0f

    invoke-static {v1}, L۟/tb;->ۥ۟۠(F)I

    move-result v1

    invoke-static {v1, p1}, L۟/tb;->ۥ۟(II)Landroid/graphics/drawable/GradientDrawable;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    sget p1, L۟/ya;->ۥ۟ۦ:F

    const/4 v1, 0x5

    int-to-float v1, v1

    add-float/2addr p1, v1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    sget-object p1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const/16 p1, 0x10

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v1, 0x425c0000    # 55.0f

    invoke-static {v1}, L۟/tb;->ۥ۟۠(F)I

    move-result v1

    const/4 v2, -0x1

    invoke-direct {p1, v2, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public final ۥ۟ۢ()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, L۟/ya;->ۥ:Landroid/content/Context;

    return-object v0
.end method

.method public abstract ۥۣ۟()Landroid/view/View;
.end method

.method public final ۥ۟ۤ(Z)V
    .locals 0

    iput-boolean p1, p0, L۟/ya;->ۥ۟ۡ:Z

    invoke-virtual {p0}, L۟/ya;->show()V

    return-void
.end method
