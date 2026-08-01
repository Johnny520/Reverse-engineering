.class public abstract Lda;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static α:Landroid/app/Dialog;

.field public static final β:Landroid/os/Handler;

.field public static γ:Lca;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lda;->β:Landroid/os/Handler;

    .line 11
    .line 12
    return-void
.end method

.method public static α(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/app/Dialog;
    .locals 11

    .line 1
    new-instance v0, Landroid/app/Dialog;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 15
    .line 16
    const/16 v2, 0x14

    .line 17
    .line 18
    int-to-float v2, v2

    .line 19
    mul-float/2addr v2, v1

    .line 20
    float-to-int v2, v2

    .line 21
    const v3, 0x1010031

    .line 22
    .line 23
    .line 24
    const/4 v4, -0x1

    .line 25
    invoke-static {p0, v3, v4}, Lda;->γ(Landroid/content/Context;II)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const v4, 0x1010036

    .line 30
    .line 31
    .line 32
    const/high16 v5, -0x1000000

    .line 33
    .line 34
    invoke-static {p0, v4, v5}, Lda;->γ(Landroid/content/Context;II)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const v5, 0x1010038

    .line 39
    .line 40
    .line 41
    const v6, -0xbbbbbc

    .line 42
    .line 43
    .line 44
    invoke-static {p0, v5, v6}, Lda;->γ(Landroid/content/Context;II)I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    const v6, 0x1010435

    .line 49
    .line 50
    .line 51
    const/high16 v7, -0x10000

    .line 52
    .line 53
    invoke-static {p0, v6, v7}, Lda;->γ(Landroid/content/Context;II)I

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    new-instance v7, Landroid/widget/LinearLayout;

    .line 58
    .line 59
    invoke-direct {v7, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 60
    .line 61
    .line 62
    const/4 v8, 0x1

    .line 63
    invoke-virtual {v7, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v7, v2, v2, v2, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v7, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 70
    .line 71
    .line 72
    new-instance v3, Landroid/widget/TextView;

    .line 73
    .line 74
    invoke-direct {v3, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 75
    .line 76
    .line 77
    const-string v8, "DY Helper \u5c01\u7981"

    .line 78
    .line 79
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    .line 81
    .line 82
    const/high16 v8, 0x41a00000    # 20.0f

    .line 83
    .line 84
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 88
    .line 89
    .line 90
    const/16 v6, 0x11

    .line 91
    .line 92
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 93
    .line 94
    .line 95
    const/16 v8, 0xa

    .line 96
    .line 97
    int-to-float v8, v8

    .line 98
    mul-float/2addr v8, v1

    .line 99
    float-to-int v8, v8

    .line 100
    const/4 v9, 0x0

    .line 101
    invoke-virtual {v3, v9, v9, v9, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v7, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 105
    .line 106
    .line 107
    new-instance v3, Landroid/widget/TextView;

    .line 108
    .line 109
    invoke-direct {v3, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 110
    .line 111
    .line 112
    const-string v10, "UID: "

    .line 113
    .line 114
    invoke-virtual {v10, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 119
    .line 120
    .line 121
    const/high16 p1, 0x41800000    # 16.0f

    .line 122
    .line 123
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v3, v9, v9, v9, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v7, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 136
    .line 137
    .line 138
    new-instance v3, Landroid/widget/TextView;

    .line 139
    .line 140
    invoke-direct {v3, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 141
    .line 142
    .line 143
    invoke-static {p2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 144
    .line 145
    .line 146
    move-result v8

    .line 147
    if-eqz v8, :cond_0

    .line 148
    .line 149
    const-string p2, "\u672a\u77e5\u539f\u56e0"

    .line 150
    .line 151
    :cond_0
    new-instance v8, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    const-string v10, "\u5c01\u7981\u539f\u56e0: "

    .line 154
    .line 155
    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    invoke-virtual {v3, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v3, v9, v9, v9, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v7, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 181
    .line 182
    .line 183
    new-instance p1, Landroid/widget/TextView;

    .line 184
    .line 185
    invoke-direct {p1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 186
    .line 187
    .line 188
    const-string p2, "\u5e94\u7528\u5c06\u5728 5 \u79d2\u540e\u9000\u51fa"

    .line 189
    .line 190
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 191
    .line 192
    .line 193
    const/high16 p2, 0x41600000    # 14.0f

    .line 194
    .line 195
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 202
    .line 203
    .line 204
    const-string p2, "countdown_text"

    .line 205
    .line 206
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v7, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v7}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, v9}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0, v9}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    if-eqz p1, :cond_1

    .line 226
    .line 227
    new-instance p2, Landroid/graphics/drawable/ColorDrawable;

    .line 228
    .line 229
    invoke-direct {p2, v9}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {p1, p2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 233
    .line 234
    .line 235
    const/16 p2, 0x12c

    .line 236
    .line 237
    int-to-float p2, p2

    .line 238
    mul-float/2addr p2, v1

    .line 239
    float-to-int p2, p2

    .line 240
    const/4 v1, -0x2

    .line 241
    invoke-virtual {p1, p2, v1}, Landroid/view/Window;->setLayout(II)V

    .line 242
    .line 243
    .line 244
    instance-of p2, p0, Landroid/app/Activity;

    .line 245
    .line 246
    if-nez p2, :cond_1

    .line 247
    .line 248
    invoke-static {p0}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    .line 249
    .line 250
    .line 251
    move-result p0

    .line 252
    if-eqz p0, :cond_1

    .line 253
    .line 254
    const/16 p0, 0x7f6

    .line 255
    .line 256
    invoke-virtual {p1, p0}, Landroid/view/Window;->setType(I)V

    .line 257
    .line 258
    .line 259
    :cond_1
    return-object v0
.end method

.method public static β()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Lda;->γ:Lca;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    sget-object v2, Lda;->β:Landroid/os/Handler;

    .line 7
    .line 8
    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    :goto_0
    sput-object v0, Lda;->γ:Lca;

    .line 15
    .line 16
    sget-object v1, Lda;->α:Landroid/app/Dialog;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    .line 21
    .line 22
    .line 23
    :cond_1
    sput-object v0, Lda;->α:Landroid/app/Dialog;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    return-void

    .line 26
    :goto_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "dismiss failed: "

    .line 31
    .line 32
    invoke-static {v2, v1}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const/4 v2, 0x4

    .line 37
    const-string v3, "r323590de2ec75a5c"

    .line 38
    .line 39
    invoke-static {v3, v1, v0, v2, v0}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public static γ(Landroid/content/Context;II)I
    .locals 3

    .line 1
    new-instance v0, Landroid/util/TypedValue;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-virtual {v1, p1, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_2

    .line 16
    .line 17
    iget p1, v0, Landroid/util/TypedValue;->resourceId:I

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/content/Context;->getColor(I)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    new-instance p1, Leo1;

    .line 32
    .line 33
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object p0, p1

    .line 37
    :goto_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    instance-of p2, p0, Leo1;

    .line 42
    .line 43
    if-eqz p2, :cond_0

    .line 44
    .line 45
    move-object p0, p1

    .line 46
    :cond_0
    check-cast p0, Ljava/lang/Number;

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    return p0

    .line 53
    :cond_1
    iget p0, v0, Landroid/util/TypedValue;->data:I

    .line 54
    .line 55
    return p0

    .line 56
    :cond_2
    return p2
.end method
