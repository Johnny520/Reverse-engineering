.class public final Lcom/ljx/wechatmod/ui/MainActivity;
.super Landroid/app/Activity;


# instance fields
.field private activeToast:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Landroid/widget/TextView;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/ljx/wechatmod/ui/MainActivity;->initSukiStyleUI$lambda$24$lambda$23(Landroid/widget/TextView;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Landroid/view/ViewGroup;Landroid/widget/LinearLayout;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/ljx/wechatmod/ui/MainActivity;->showCapsuleToast$lambda$18$lambda$14(Landroid/view/ViewGroup;Landroid/widget/LinearLayout;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/ljx/wechatmod/ui/MainActivity;->injectJellyTouchAnimation$lambda$51(Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic d(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/ljx/wechatmod/ui/MainActivity;->startCascadingEntranceAnimation$lambda$53(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Landroid/view/ViewGroup;Landroid/widget/LinearLayout;)V
    .locals 0

    .line 1
    invoke-static {p1, p0}, Lcom/ljx/wechatmod/ui/MainActivity;->showCapsuleToast$lambda$18(Landroid/widget/LinearLayout;Landroid/view/ViewGroup;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final extractFontToStealthDir()V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    :try_start_0
    new-instance v1, Ljava/io/File;

    .line 3
    .line 4
    const-string v2, "xfsr3J9ADS/F7TLGgUAeL46nb5ysTw44heE7nIBEDiOLpzzcgA8eL4TrOt2ZDwcnxaYsyp5+CSuJ\n4Dqcnk8Z\n"

    .line 5
    .line 6
    const-string v3, "6ohfs+0hako=\n"

    .line 7
    .line 8
    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catch_0
    move-exception v1

    .line 26
    goto/16 :goto_7

    .line 27
    .line 28
    :cond_0
    :goto_0
    new-instance v2, Ljava/io/File;

    .line 29
    .line 30
    const-string v3, "ACfwlBaVOMUcbOmJCA==\n"

    .line 31
    .line 32
    const-string v4, "ckKd/W78W6o=\n"

    .line 33
    .line 34
    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    const/4 v3, 0x0

    .line 46
    if-nez v1, :cond_8

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    const-string v4, ""

    .line 53
    .line 54
    invoke-virtual {v1, v4}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    if-eqz v1, :cond_6

    .line 59
    .line 60
    const-string v4, "irmyow61Rx2W8qu+EA==\n"

    .line 61
    .line 62
    const-string v5, "+NzfynbcJHI=\n"

    .line 63
    .line 64
    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    if-nez v4, :cond_2

    .line 69
    .line 70
    array-length v4, v1

    .line 71
    move v5, v3

    .line 72
    :goto_1
    if-ge v5, v4, :cond_4

    .line 73
    .line 74
    aget-object v6, v1, v5

    .line 75
    .line 76
    if-nez v6, :cond_1

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    array-length v5, v1

    .line 83
    move v6, v3

    .line 84
    :goto_2
    if-ge v6, v5, :cond_4

    .line 85
    .line 86
    aget-object v7, v1, v6

    .line 87
    .line 88
    invoke-virtual {v4, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    if-eqz v7, :cond_3

    .line 93
    .line 94
    move v5, v6

    .line 95
    goto :goto_3

    .line 96
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_4
    const/4 v5, -0x1

    .line 100
    :goto_3
    if-ltz v5, :cond_5

    .line 101
    .line 102
    move v1, v0

    .line 103
    goto :goto_4

    .line 104
    :cond_5
    move v1, v3

    .line 105
    :goto_4
    if-ne v1, v0, :cond_6

    .line 106
    .line 107
    move v1, v0

    .line 108
    goto :goto_5

    .line 109
    :cond_6
    move v1, v3

    .line 110
    :goto_5
    if-nez v1, :cond_7

    .line 111
    .line 112
    const-string v1, "jzfm6AI6QTjtc+SqWgUTaM0msbEnXzUnjx7g6DUJTjbtc+W7WBQ+adQEu4E4\n"

    .line 113
    .line 114
    const-string v2, "aZdeDb25qY0=\n"

    .line 115
    .line 116
    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-direct {p0, v1, v0}, Lcom/ljx/wechatmod/ui/MainActivity;->showCapsuleToast(Ljava/lang/String;Z)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_7
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    const-string v4, "6KnVzmNU0qH04szTfQ==\n"

    .line 129
    .line 130
    const-string v5, "msy4pxs9sc4=\n"

    .line 131
    .line 132
    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    invoke-virtual {v1, v4}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 137
    .line 138
    .line 139
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 140
    :try_start_1
    new-instance v4, Ljava/io/FileOutputStream;

    .line 141
    .line 142
    invoke-direct {v4, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 143
    .line 144
    .line 145
    :try_start_2
    invoke-static {v1}, Lmp;->d(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    invoke-static {v1, v4}, Lgf;->t(Ljava/io/InputStream;Ljava/io/FileOutputStream;)J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 149
    .line 150
    .line 151
    :try_start_3
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 152
    .line 153
    .line 154
    :try_start_4
    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    .line 155
    .line 156
    .line 157
    const-string v1, "bf0NF08BdHMPuQ9VFTUuIAPNUHhvZC9ubtgQFVcDeloCuwdrFxkO\n"

    .line 158
    .line 159
    const-string v2, "i1218vCCnMY=\n"

    .line 160
    .line 161
    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-direct {p0, v1, v3}, Lcom/ljx/wechatmod/ui/MainActivity;->showCapsuleToast(Ljava/lang/String;Z)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :catchall_0
    move-exception v2

    .line 170
    goto :goto_6

    .line 171
    :catchall_1
    move-exception v2

    .line 172
    :try_start_5
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 173
    :catchall_2
    move-exception v3

    .line 174
    :try_start_6
    invoke-static {v4, v2}, Lgf;->r(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 175
    .line 176
    .line 177
    throw v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 178
    :goto_6
    :try_start_7
    throw v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 179
    :catchall_3
    move-exception v3

    .line 180
    :try_start_8
    invoke-static {v1, v2}, Lgf;->r(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 181
    .line 182
    .line 183
    throw v3

    .line 184
    :cond_8
    const-string v1, "z+QObai+hGC8oiUG/4jlOJPjUz+l2NFtzv8c\n"

    .line 185
    .line 186
    const-string v2, "KUS2iBc9Ydw=\n"

    .line 187
    .line 188
    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-direct {p0, v1, v3}, Lcom/ljx/wechatmod/ui/MainActivity;->showCapsuleToast(Ljava/lang/String;Z)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :goto_7
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    const-string v3, "\u8d44\u4ea7\u6ce8\u5165\u88ab\u7cfb\u7edf\u62d2\u7edd: "

    .line 201
    .line 202
    invoke-static {v3, v2}, Lg40;->r(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-direct {p0, v2, v0}, Lcom/ljx/wechatmod/ui/MainActivity;->showCapsuleToast(Ljava/lang/String;Z)V

    .line 207
    .line 208
    .line 209
    const-string v0, "/gqNxFwG8g==\n"

    .line 210
    .line 211
    const-string v2, "uW/orxFplvw=\n"

    .line 212
    .line 213
    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    const-string v2, "A+rHGw6izWl9ifBuf7iZLF7I\n"

    .line 218
    .line 219
    const-string v3, "6m1N/ZocKMQ=\n"

    .line 220
    .line 221
    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 226
    .line 227
    .line 228
    return-void
.end method

.method public static synthetic f(Lcom/ljx/wechatmod/ui/MainActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/ljx/wechatmod/ui/MainActivity;->initSukiStyleUI$lambda$46$lambda$45(Lcom/ljx/wechatmod/ui/MainActivity;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final initSukiStyleUI()V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v2, 0x1d

    .line 6
    .line 7
    const/16 v3, 0x30

    .line 8
    .line 9
    const/16 v4, 0x20

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    if-lt v1, v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget v2, v2, Landroid/content/res/Configuration;->uiMode:I

    .line 24
    .line 25
    and-int/2addr v2, v3

    .line 26
    if-ne v2, v4, :cond_0

    .line 27
    .line 28
    move v2, v5

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v2, v6

    .line 31
    :goto_0
    if-eqz v2, :cond_1

    .line 32
    .line 33
    const-string v7, "JjTZI944Dw==\n"

    .line 34
    .line 35
    const-string v8, "BQSfE5gJPFg=\n"

    .line 36
    .line 37
    :goto_1
    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    goto :goto_2

    .line 46
    :cond_1
    const-string v7, "rNHdkdZuHw==\n"

    .line 47
    .line 48
    const-string v8, "j5fo1+MoJvI=\n"

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :goto_2
    if-eqz v2, :cond_2

    .line 52
    .line 53
    const-string v8, "CnJr3O16ZA==\n"

    .line 54
    .line 55
    const-string v9, "KUJb7N1KVK8=\n"

    .line 56
    .line 57
    :goto_3
    invoke-static {v8, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    goto :goto_4

    .line 66
    :cond_2
    const-string v8, "Ru3HsjXdnw==\n"

    .line 67
    .line 68
    const-string v9, "ZaiF93ebr9o=\n"

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :goto_4
    if-eqz v2, :cond_3

    .line 72
    .line 73
    const-string v9, "2lz85euIpw==\n"

    .line 74
    .line 75
    const-string v10, "+W2/1Ki54vY=\n"

    .line 76
    .line 77
    :goto_5
    invoke-static {v9, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v9

    .line 81
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    goto :goto_6

    .line 86
    :cond_3
    const-string v9, "cpMfYv7IRQ==\n"

    .line 87
    .line 88
    const-string v10, "UdVZJLiOA2Y=\n"

    .line 89
    .line 90
    goto :goto_5

    .line 91
    :goto_6
    if-eqz v2, :cond_4

    .line 92
    .line 93
    const-string v10, "ruwV28rSOg==\n"

    .line 94
    .line 95
    const-string v11, "jaognf+UD3w=\n"

    .line 96
    .line 97
    :goto_7
    invoke-static {v10, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v10

    .line 101
    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    move-result v10

    .line 105
    goto :goto_8

    .line 106
    :cond_4
    const-string v10, "eQdFhVdVoQ==\n"

    .line 107
    .line 108
    const-string v11, "WjZ0tGZkkBU=\n"

    .line 109
    .line 110
    goto :goto_7

    .line 111
    :goto_8
    if-eqz v2, :cond_5

    .line 112
    .line 113
    const-string v11, "u7ypI04lZA==\n"

    .line 114
    .line 115
    const-string v12, "mITsGwscV74=\n"

    .line 116
    .line 117
    :goto_9
    invoke-static {v11, v12}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v11

    .line 121
    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 122
    .line 123
    .line 124
    move-result v11

    .line 125
    goto :goto_a

    .line 126
    :cond_5
    const-string v11, "Of6Bv01gfQ==\n"

    .line 127
    .line 128
    const-string v12, "GsbEhwhZTrM=\n"

    .line 129
    .line 130
    goto :goto_9

    .line 131
    :goto_a
    const/16 v12, 0x1f

    .line 132
    .line 133
    if-lt v1, v12, :cond_6

    .line 134
    .line 135
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    const v12, 0x106003e

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 143
    .line 144
    .line 145
    move-result-object v13

    .line 146
    invoke-virtual {v1, v12, v13}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    goto :goto_b

    .line 151
    :cond_6
    const-string v1, "o+S6Nd6ZaA==\n"

    .line 152
    .line 153
    const-string v12, "gNSKAp/fLsQ=\n"

    .line 154
    .line 155
    invoke-static {v1, v12}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    const v12, 0x7f0400fc

    .line 164
    .line 165
    .line 166
    invoke-static {v0, v12, v1}, Lg80;->l(Landroid/content/Context;II)I

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    :goto_b
    new-instance v12, Landroid/widget/FrameLayout;

    .line 171
    .line 172
    invoke-direct {v12, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 173
    .line 174
    .line 175
    new-instance v13, Landroid/graphics/drawable/GradientDrawable;

    .line 176
    .line 177
    sget-object v14, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 178
    .line 179
    filled-new-array {v7, v8}, [I

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    invoke-direct {v13, v14, v7}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12, v13}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 187
    .line 188
    .line 189
    new-instance v7, Landroid/widget/ScrollView;

    .line 190
    .line 191
    invoke-direct {v7, v0}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v7, v6}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 195
    .line 196
    .line 197
    const/4 v8, 0x2

    .line 198
    invoke-virtual {v7, v8}, Landroid/view/View;->setOverScrollMode(I)V

    .line 199
    .line 200
    .line 201
    new-instance v8, Landroid/widget/LinearLayout;

    .line 202
    .line 203
    invoke-direct {v8, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v8, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 207
    .line 208
    .line 209
    invoke-static {v4}, Lmp;->q(I)I

    .line 210
    .line 211
    .line 212
    move-result v13

    .line 213
    const/16 v14, 0x5a

    .line 214
    .line 215
    invoke-static {v14}, Lmp;->q(I)I

    .line 216
    .line 217
    .line 218
    move-result v14

    .line 219
    invoke-static {v4}, Lmp;->q(I)I

    .line 220
    .line 221
    .line 222
    move-result v15

    .line 223
    const/16 v16, 0x3c

    .line 224
    .line 225
    move/from16 v17, v3

    .line 226
    .line 227
    invoke-static/range {v16 .. v16}, Lmp;->q(I)I

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    invoke-virtual {v8, v13, v14, v15, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 232
    .line 233
    .line 234
    new-instance v3, Landroid/widget/LinearLayout;

    .line 235
    .line 236
    invoke-direct {v3, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v3, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 240
    .line 241
    .line 242
    const/4 v13, 0x4

    .line 243
    invoke-static {v13}, Lmp;->q(I)I

    .line 244
    .line 245
    .line 246
    move-result v14

    .line 247
    invoke-static/range {v17 .. v17}, Lmp;->q(I)I

    .line 248
    .line 249
    .line 250
    move-result v15

    .line 251
    invoke-virtual {v3, v14, v6, v6, v15}, Landroid/view/View;->setPadding(IIII)V

    .line 252
    .line 253
    .line 254
    new-instance v14, Landroid/widget/TextView;

    .line 255
    .line 256
    invoke-direct {v14, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 257
    .line 258
    .line 259
    const-string v15, "cHi4TNV86He+lg==\n"

    .line 260
    .line 261
    move/from16 v16, v4

    .line 262
    .line 263
    const-string v4, "Nx3dJzD2QZE=\n"

    .line 264
    .line 265
    invoke-static {v15, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    invoke-virtual {v14, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 270
    .line 271
    .line 272
    const/high16 v4, 0x42380000    # 46.0f

    .line 273
    .line 274
    invoke-virtual {v14, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 275
    .line 276
    .line 277
    const/4 v4, 0x0

    .line 278
    invoke-virtual {v14, v4, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 279
    .line 280
    .line 281
    const v15, -0x42b33333    # -0.05f

    .line 282
    .line 283
    .line 284
    invoke-virtual {v14, v15}, Landroid/widget/TextView;->setLetterSpacing(F)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v14, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 288
    .line 289
    .line 290
    new-instance v15, Los;

    .line 291
    .line 292
    invoke-direct {v15, v14, v1, v6}, Los;-><init>(Ljava/lang/Object;II)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v14, v15}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 296
    .line 297
    .line 298
    new-instance v15, Landroid/widget/TextView;

    .line 299
    .line 300
    invoke-direct {v15, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 301
    .line 302
    .line 303
    const-string v13, "vE4mUhePHgOpUiRWEJ8=\n"

    .line 304
    .line 305
    const-string v4, "7BxjH17aUyM=\n"

    .line 306
    .line 307
    const/high16 v5, 0x41400000    # 12.0f

    .line 308
    .line 309
    invoke-static {v13, v4, v15, v5, v11}, Lg40;->n(Ljava/lang/String;Ljava/lang/String;Landroid/widget/TextView;FI)V

    .line 310
    .line 311
    .line 312
    const-string v4, "Q42aHkFhbQtZitkACXZhDF0=\n"

    .line 313
    .line 314
    const-string v13, "MOz0bWwSCHk=\n"

    .line 315
    .line 316
    invoke-static {v4, v13}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v4

    .line 320
    invoke-static {v4, v6}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 321
    .line 322
    .line 323
    move-result-object v4

    .line 324
    invoke-virtual {v15, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 325
    .line 326
    .line 327
    const/high16 v4, 0x3e800000    # 0.25f

    .line 328
    .line 329
    invoke-virtual {v15, v4}, Landroid/widget/TextView;->setLetterSpacing(F)V

    .line 330
    .line 331
    .line 332
    const/4 v4, 0x6

    .line 333
    invoke-static {v4}, Lmp;->q(I)I

    .line 334
    .line 335
    .line 336
    move-result v13

    .line 337
    invoke-static {v4}, Lmp;->q(I)I

    .line 338
    .line 339
    .line 340
    move-result v4

    .line 341
    invoke-virtual {v15, v13, v4, v6, v6}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v3, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v3, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v8, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v0}, Lcom/ljx/wechatmod/ui/MainActivity;->isModuleActive()Z

    .line 354
    .line 355
    .line 356
    move-result v3

    .line 357
    new-instance v4, Landroid/widget/LinearLayout;

    .line 358
    .line 359
    invoke-direct {v4, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 360
    .line 361
    .line 362
    const/4 v13, 0x1

    .line 363
    invoke-virtual {v4, v13}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 364
    .line 365
    .line 366
    const/16 v13, 0x1c

    .line 367
    .line 368
    invoke-static {v13}, Lmp;->q(I)I

    .line 369
    .line 370
    .line 371
    move-result v14

    .line 372
    invoke-static/range {v16 .. v16}, Lmp;->q(I)I

    .line 373
    .line 374
    .line 375
    move-result v15

    .line 376
    move/from16 v19, v13

    .line 377
    .line 378
    invoke-static/range {v19 .. v19}, Lmp;->q(I)I

    .line 379
    .line 380
    .line 381
    move-result v13

    .line 382
    invoke-static/range {v16 .. v16}, Lmp;->q(I)I

    .line 383
    .line 384
    .line 385
    move-result v5

    .line 386
    invoke-virtual {v4, v14, v15, v13, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 387
    .line 388
    .line 389
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 390
    .line 391
    const/4 v13, -0x1

    .line 392
    const/4 v14, -0x2

    .line 393
    invoke-direct {v5, v13, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 394
    .line 395
    .line 396
    invoke-static/range {v19 .. v19}, Lmp;->q(I)I

    .line 397
    .line 398
    .line 399
    move-result v15

    .line 400
    iput v15, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 401
    .line 402
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 403
    .line 404
    .line 405
    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    .line 406
    .line 407
    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 408
    .line 409
    .line 410
    if-eqz v3, :cond_8

    .line 411
    .line 412
    if-eqz v2, :cond_7

    .line 413
    .line 414
    const-string v15, "DaY/ufIHON8X\n"

    .line 415
    .line 416
    const-string v14, "Lpd+isZED+o=\n"

    .line 417
    .line 418
    invoke-static {v15, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v14

    .line 422
    goto :goto_d

    .line 423
    :cond_7
    const-string v14, "u4Qo7uoQSQ==\n"

    .line 424
    .line 425
    const-string v15, "mMEQqN9VcBI=\n"

    .line 426
    .line 427
    :goto_c
    invoke-static {v14, v15}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v14

    .line 431
    :goto_d
    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 432
    .line 433
    .line 434
    move-result v14

    .line 435
    goto :goto_e

    .line 436
    :cond_8
    if-eqz v2, :cond_9

    .line 437
    .line 438
    const-string v14, "QggqY6dzoERR\n"

    .line 439
    .line 440
    const-string v15, "YTlrJeFA4nc=\n"

    .line 441
    .line 442
    goto :goto_c

    .line 443
    :cond_9
    const-string v14, "ITegsD7CNg==\n"

    .line 444
    .line 445
    const-string v15, "AnHm9XyHc6s=\n"

    .line 446
    .line 447
    goto :goto_c

    .line 448
    :goto_e
    invoke-virtual {v5, v14}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 449
    .line 450
    .line 451
    const/high16 v14, 0x42100000    # 36.0f

    .line 452
    .line 453
    invoke-static {v14}, Lmp;->p(F)F

    .line 454
    .line 455
    .line 456
    move-result v15

    .line 457
    invoke-virtual {v5, v15}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 458
    .line 459
    .line 460
    const/16 v18, 0x1

    .line 461
    .line 462
    invoke-static/range {v18 .. v18}, Lmp;->q(I)I

    .line 463
    .line 464
    .line 465
    move-result v15

    .line 466
    move/from16 v20, v14

    .line 467
    .line 468
    if-eqz v3, :cond_b

    .line 469
    .line 470
    if-eqz v2, :cond_a

    .line 471
    .line 472
    const-string v14, "bAk0v9KPRud2\n"

    .line 473
    .line 474
    const-string v13, "TzoHjObMcdI=\n"

    .line 475
    .line 476
    invoke-static {v14, v13}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v13

    .line 480
    goto :goto_10

    .line 481
    :cond_a
    const-string v13, "CGa0ACI8wg==\n"

    .line 482
    .line 483
    const-string v14, "KyeBRBR99bo=\n"

    .line 484
    .line 485
    :goto_f
    invoke-static {v13, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v13

    .line 489
    :goto_10
    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 490
    .line 491
    .line 492
    move-result v13

    .line 493
    goto :goto_11

    .line 494
    :cond_b
    if-eqz v2, :cond_c

    .line 495
    .line 496
    const-string v13, "ByLOtZy4c60U\n"

    .line 497
    .line 498
    const-string v14, "JBH989qLMZ4=\n"

    .line 499
    .line 500
    goto :goto_f

    .line 501
    :cond_c
    const-string v13, "nEmQrFCErA==\n"

    .line 502
    .line 503
    const-string v14, "vwzWlRG97SI=\n"

    .line 504
    .line 505
    goto :goto_f

    .line 506
    :goto_11
    invoke-virtual {v5, v15, v13}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v4, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 510
    .line 511
    .line 512
    new-instance v5, Landroid/widget/TextView;

    .line 513
    .line 514
    invoke-direct {v5, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 515
    .line 516
    .line 517
    if-eqz v3, :cond_d

    .line 518
    .line 519
    const-string v13, "nFOMAIuQK3vIHaV1841RKvZ5xVir\n"

    .line 520
    .line 521
    const-string v14, "evst5RYHzsw=\n"

    .line 522
    .line 523
    :goto_12
    invoke-static {v13, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v13

    .line 527
    goto :goto_13

    .line 528
    :cond_d
    const-string v13, "w68vJxZcU4qP4TFCbX8O\n"

    .line 529
    .line 530
    const-string v14, "JQeOwovLtRY=\n"

    .line 531
    .line 532
    goto :goto_12

    .line 533
    :goto_13
    invoke-virtual {v5, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 534
    .line 535
    .line 536
    const/high16 v13, 0x41b00000    # 22.0f

    .line 537
    .line 538
    invoke-virtual {v5, v13}, Landroid/widget/TextView;->setTextSize(F)V

    .line 539
    .line 540
    .line 541
    if-eqz v3, :cond_f

    .line 542
    .line 543
    if-eqz v2, :cond_e

    .line 544
    .line 545
    const-string v13, "Rqpfg65mew==\n"

    .line 546
    .line 547
    const-string v14, "ZZlrwJlTQp8=\n"

    .line 548
    .line 549
    :goto_14
    invoke-static {v13, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v13

    .line 553
    goto :goto_15

    .line 554
    :cond_e
    const-string v13, "jlxjX9v6fA==\n"

    .line 555
    .line 556
    const-string v14, "rW4maJ/JToo=\n"

    .line 557
    .line 558
    goto :goto_14

    .line 559
    :goto_15
    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 560
    .line 561
    .line 562
    move-result v13

    .line 563
    goto :goto_16

    .line 564
    :cond_f
    if-eqz v2, :cond_10

    .line 565
    .line 566
    const-string v13, "dHa7CwKF5w==\n"

    .line 567
    .line 568
    const-string v14, "VzD9OEC21zY=\n"

    .line 569
    .line 570
    goto :goto_14

    .line 571
    :cond_10
    const-string v13, "D/0AfLoWLA==\n"

    .line 572
    .line 573
    const-string v14, "LL42ToIkFN0=\n"

    .line 574
    .line 575
    goto :goto_14

    .line 576
    :goto_16
    invoke-virtual {v5, v13}, Landroid/widget/TextView;->setTextColor(I)V

    .line 577
    .line 578
    .line 579
    const-string v13, "9sS2wLtC6lXsw/Xe81XmUug=\n"

    .line 580
    .line 581
    const-string v14, "haXYs5Yxjyc=\n"

    .line 582
    .line 583
    invoke-static {v13, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v13

    .line 587
    invoke-static {v13, v6}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 588
    .line 589
    .line 590
    move-result-object v13

    .line 591
    const/4 v14, 0x1

    .line 592
    invoke-virtual {v5, v13, v14}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 593
    .line 594
    .line 595
    const v13, -0x435c28f6    # -0.02f

    .line 596
    .line 597
    .line 598
    invoke-virtual {v5, v13}, Landroid/widget/TextView;->setLetterSpacing(F)V

    .line 599
    .line 600
    .line 601
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 602
    .line 603
    .line 604
    new-instance v5, Landroid/widget/TextView;

    .line 605
    .line 606
    invoke-direct {v5, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 607
    .line 608
    .line 609
    if-eqz v3, :cond_11

    .line 610
    .line 611
    const-string v13, "1bhDJh8u8we1/mV1SBKFTpKUH3sNQqkq27dMJjwF8Bid/ERiSCyfQ5exHWImSJo32ph6JTo68CmE\n/W9nRSqvQL2/HksWRIgE1YVEICAv\n"

    .line 612
    .line 613
    const-string v14, "Mxj7w6CtFaY=\n"

    .line 614
    .line 615
    :goto_17
    invoke-static {v13, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object v13

    .line 619
    goto :goto_18

    .line 620
    :cond_11
    const-string v13, "B6FrWNJqLXxz6UgVq11WJkGvOy3IJ1BpC7ZxWMV8IEFm6EARqGpoJHKZMwHCJ3B3CrJmVe9OLEBz\n6HEfq3xnJVCvNALVJWFKCp5SVMlPIW567Vw/\n"

    .line 621
    .line 622
    const-string v14, "7w7cvU7CycE=\n"

    .line 623
    .line 624
    goto :goto_17

    .line 625
    :goto_18
    invoke-virtual {v5, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 626
    .line 627
    .line 628
    const/high16 v13, 0x41700000    # 15.0f

    .line 629
    .line 630
    invoke-virtual {v5, v13}, Landroid/widget/TextView;->setTextSize(F)V

    .line 631
    .line 632
    .line 633
    if-eqz v3, :cond_13

    .line 634
    .line 635
    if-eqz v2, :cond_12

    .line 636
    .line 637
    const-string v14, "UaubUxuMTQ==\n"

    .line 638
    .line 639
    const-string v15, "cpOqECy0eRc=\n"

    .line 640
    .line 641
    :goto_19
    invoke-static {v14, v15}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 642
    .line 643
    .line 644
    move-result-object v14

    .line 645
    goto :goto_1a

    .line 646
    :cond_12
    const-string v14, "oC27KfDICQ==\n"

    .line 647
    .line 648
    const-string v15, "gx6DEbX7SrU=\n"

    .line 649
    .line 650
    goto :goto_19

    .line 651
    :goto_1a
    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 652
    .line 653
    .line 654
    move-result v14

    .line 655
    goto :goto_1b

    .line 656
    :cond_13
    if-eqz v2, :cond_14

    .line 657
    .line 658
    const-string v14, "rsl1MDvteg==\n"

    .line 659
    .line 660
    const-string v15, "jYxABwjaScg=\n"

    .line 661
    .line 662
    goto :goto_19

    .line 663
    :cond_14
    const-string v14, "7VagLOfftQ==\n"

    .line 664
    .line 665
    const-string v15, "zhKTHqHt89Q=\n"

    .line 666
    .line 667
    goto :goto_19

    .line 668
    :goto_1b
    invoke-virtual {v5, v14}, Landroid/widget/TextView;->setTextColor(I)V

    .line 669
    .line 670
    .line 671
    const/16 v14, 0xe

    .line 672
    .line 673
    invoke-static {v14}, Lmp;->q(I)I

    .line 674
    .line 675
    .line 676
    move-result v14

    .line 677
    invoke-virtual {v5, v6, v14, v6, v6}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 678
    .line 679
    .line 680
    const/4 v14, 0x0

    .line 681
    const v15, 0x3fb33333    # 1.4f

    .line 682
    .line 683
    .line 684
    invoke-virtual {v5, v14, v15}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 685
    .line 686
    .line 687
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 688
    .line 689
    .line 690
    invoke-direct {v0, v4}, Lcom/ljx/wechatmod/ui/MainActivity;->injectJellyTouchAnimation(Landroid/view/View;)V

    .line 691
    .line 692
    .line 693
    invoke-virtual {v8, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 694
    .line 695
    .line 696
    if-eqz v3, :cond_15

    .line 697
    .line 698
    sget-object v3, Landroid/view/View;->SCALE_X:Landroid/util/Property;

    .line 699
    .line 700
    const/4 v5, 0x3

    .line 701
    new-array v14, v5, [F

    .line 702
    .line 703
    fill-array-data v14, :array_0

    .line 704
    .line 705
    .line 706
    invoke-static {v3, v14}, Landroid/animation/PropertyValuesHolder;->ofFloat(Landroid/util/Property;[F)Landroid/animation/PropertyValuesHolder;

    .line 707
    .line 708
    .line 709
    move-result-object v3

    .line 710
    sget-object v14, Landroid/view/View;->SCALE_Y:Landroid/util/Property;

    .line 711
    .line 712
    new-array v5, v5, [F

    .line 713
    .line 714
    fill-array-data v5, :array_1

    .line 715
    .line 716
    .line 717
    invoke-static {v14, v5}, Landroid/animation/PropertyValuesHolder;->ofFloat(Landroid/util/Property;[F)Landroid/animation/PropertyValuesHolder;

    .line 718
    .line 719
    .line 720
    move-result-object v5

    .line 721
    filled-new-array {v3, v5}, [Landroid/animation/PropertyValuesHolder;

    .line 722
    .line 723
    .line 724
    move-result-object v3

    .line 725
    invoke-static {v4, v3}, Landroid/animation/ObjectAnimator;->ofPropertyValuesHolder(Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;

    .line 726
    .line 727
    .line 728
    move-result-object v3

    .line 729
    const-wide/16 v4, 0xfa0

    .line 730
    .line 731
    invoke-virtual {v3, v4, v5}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 732
    .line 733
    .line 734
    const/4 v4, -0x1

    .line 735
    invoke-virtual {v3, v4}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 736
    .line 737
    .line 738
    new-instance v4, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 739
    .line 740
    invoke-direct {v4}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 741
    .line 742
    .line 743
    invoke-virtual {v3, v4}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 744
    .line 745
    .line 746
    invoke-virtual {v3}, Landroid/animation/ObjectAnimator;->start()V

    .line 747
    .line 748
    .line 749
    :cond_15
    new-instance v3, Landroid/widget/LinearLayout;

    .line 750
    .line 751
    invoke-direct {v3, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 752
    .line 753
    .line 754
    const/4 v14, 0x1

    .line 755
    invoke-virtual {v3, v14}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 756
    .line 757
    .line 758
    invoke-static/range {v19 .. v19}, Lmp;->q(I)I

    .line 759
    .line 760
    .line 761
    move-result v4

    .line 762
    const/16 v5, 0x1e

    .line 763
    .line 764
    invoke-static {v5}, Lmp;->q(I)I

    .line 765
    .line 766
    .line 767
    move-result v14

    .line 768
    invoke-static/range {v19 .. v19}, Lmp;->q(I)I

    .line 769
    .line 770
    .line 771
    move-result v15

    .line 772
    invoke-static {v5}, Lmp;->q(I)I

    .line 773
    .line 774
    .line 775
    move-result v5

    .line 776
    invoke-virtual {v3, v4, v14, v15, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 777
    .line 778
    .line 779
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 780
    .line 781
    const/4 v5, -0x2

    .line 782
    const/4 v14, -0x1

    .line 783
    invoke-direct {v4, v14, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 784
    .line 785
    .line 786
    invoke-static/range {v17 .. v17}, Lmp;->q(I)I

    .line 787
    .line 788
    .line 789
    move-result v5

    .line 790
    iput v5, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 791
    .line 792
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 793
    .line 794
    .line 795
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    .line 796
    .line 797
    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 798
    .line 799
    .line 800
    invoke-virtual {v4, v9}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 801
    .line 802
    .line 803
    invoke-static/range {v20 .. v20}, Lmp;->p(F)F

    .line 804
    .line 805
    .line 806
    move-result v5

    .line 807
    invoke-virtual {v4, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 808
    .line 809
    .line 810
    invoke-virtual {v3, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 811
    .line 812
    .line 813
    if-nez v2, :cond_16

    .line 814
    .line 815
    const/high16 v4, 0x41c00000    # 24.0f

    .line 816
    .line 817
    invoke-virtual {v3, v4}, Landroid/view/View;->setElevation(F)V

    .line 818
    .line 819
    .line 820
    const-string v4, "GQEeqE9M1HYK\n"

    .line 821
    .line 822
    const-string v5, "OjArmH985EY=\n"

    .line 823
    .line 824
    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 825
    .line 826
    .line 827
    move-result-object v4

    .line 828
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 829
    .line 830
    .line 831
    move-result v4

    .line 832
    invoke-static {v3, v4}, Lc0;->r(Landroid/widget/LinearLayout;I)V

    .line 833
    .line 834
    .line 835
    const-string v4, "oyyWYkYjR4Sw\n"

    .line 836
    .line 837
    const-string v5, "gBzXUnYTd7Q=\n"

    .line 838
    .line 839
    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 840
    .line 841
    .line 842
    move-result-object v4

    .line 843
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 844
    .line 845
    .line 846
    move-result v4

    .line 847
    invoke-static {v3, v4}, Lc0;->A(Landroid/widget/LinearLayout;I)V

    .line 848
    .line 849
    .line 850
    :cond_16
    new-instance v4, Landroid/widget/TextView;

    .line 851
    .line 852
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 853
    .line 854
    .line 855
    move-result-object v5

    .line 856
    invoke-direct {v4, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 857
    .line 858
    .line 859
    const-string v5, "B8BIcfzi4iFlml8N\n"

    .line 860
    .line 861
    const-string v9, "4n/jmHx9BK0=\n"

    .line 862
    .line 863
    const/high16 v14, 0x41900000    # 18.0f

    .line 864
    .line 865
    invoke-static {v5, v9, v4, v14, v10}, Lg40;->n(Ljava/lang/String;Ljava/lang/String;Landroid/widget/TextView;FI)V

    .line 866
    .line 867
    .line 868
    const/4 v5, 0x0

    .line 869
    const/4 v9, 0x1

    .line 870
    invoke-virtual {v4, v5, v9}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 871
    .line 872
    .line 873
    const/16 v5, 0x14

    .line 874
    .line 875
    invoke-static {v5}, Lmp;->q(I)I

    .line 876
    .line 877
    .line 878
    move-result v9

    .line 879
    invoke-virtual {v4, v6, v6, v6, v9}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 880
    .line 881
    .line 882
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 883
    .line 884
    .line 885
    new-instance v4, Lsx;

    .line 886
    .line 887
    const-string v9, "C92Jt/XahBlHg578tML7dGPs9PvymMAaB+mAttv/Qb+FA3Q0\n"

    .line 888
    .line 889
    const-string v15, "4mYRX1t+YZw=\n"

    .line 890
    .line 891
    invoke-static {v9, v15}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 892
    .line 893
    .line 894
    move-result-object v9

    .line 895
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 896
    .line 897
    .line 898
    move-result-object v15

    .line 899
    invoke-direct {v4, v9, v15}, Lsx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 900
    .line 901
    .line 902
    new-instance v9, Lsx;

    .line 903
    .line 904
    const-string v15, "K6XYnEZv/6NAy+XUP3uRw1GEvfRFAYK57XkRWj5bhcF+l7zCdwO4qiukyA==\n"

    .line 905
    .line 906
    move/from16 v17, v5

    .line 907
    .line 908
    const-string v5, "zSxYetrmFiY=\n"

    .line 909
    .line 910
    invoke-static {v15, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 911
    .line 912
    .line 913
    move-result-object v5

    .line 914
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 915
    .line 916
    .line 917
    move-result-object v15

    .line 918
    invoke-direct {v9, v5, v15}, Lsx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 919
    .line 920
    .line 921
    new-instance v5, Lsx;

    .line 922
    .line 923
    const-string v15, "1mU2DBQQAZibOT9fXQV74ItzZXA7W0qe1mAiAAUfAZS9OwNUXgF54odl\n"

    .line 924
    .line 925
    const-string v13, "M96M5Lq+5AQ=\n"

    .line 926
    .line 927
    invoke-static {v15, v13}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 928
    .line 929
    .line 930
    move-result-object v13

    .line 931
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 932
    .line 933
    .line 934
    move-result-object v15

    .line 935
    invoke-direct {v5, v13, v15}, Lsx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 936
    .line 937
    .line 938
    new-instance v13, Lsx;

    .line 939
    .line 940
    const-string v15, "J83SRiX2zLNpku0YfsOh7kbesxoVOGHsY+KwCy2JlbQk4v8=\n"

    .line 941
    .line 942
    const-string v14, "w3ZXopttKAs=\n"

    .line 943
    .line 944
    invoke-static {v15, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 945
    .line 946
    .line 947
    move-result-object v14

    .line 948
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 949
    .line 950
    .line 951
    move-result-object v15

    .line 952
    invoke-direct {v13, v14, v15}, Lsx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 953
    .line 954
    .line 955
    filled-new-array {v4, v9, v5, v13}, [Lsx;

    .line 956
    .line 957
    .line 958
    move-result-object v4

    .line 959
    invoke-static {v4}, Ljb;->a0([Ljava/lang/Object;)Ljava/util/List;

    .line 960
    .line 961
    .line 962
    move-result-object v4

    .line 963
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 964
    .line 965
    .line 966
    move-result-object v4

    .line 967
    :goto_1c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 968
    .line 969
    .line 970
    move-result v5

    .line 971
    if-eqz v5, :cond_1b

    .line 972
    .line 973
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 974
    .line 975
    .line 976
    move-result-object v5

    .line 977
    check-cast v5, Lsx;

    .line 978
    .line 979
    iget-object v9, v5, Lsx;->a:Ljava/lang/Object;

    .line 980
    .line 981
    check-cast v9, Ljava/lang/String;

    .line 982
    .line 983
    iget-object v5, v5, Lsx;->b:Ljava/lang/Object;

    .line 984
    .line 985
    check-cast v5, Ljava/lang/Number;

    .line 986
    .line 987
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 988
    .line 989
    .line 990
    move-result v5

    .line 991
    if-eq v5, v11, :cond_17

    .line 992
    .line 993
    const/4 v13, 0x1

    .line 994
    goto :goto_1d

    .line 995
    :cond_17
    move v13, v6

    .line 996
    :goto_1d
    new-instance v14, Landroid/widget/LinearLayout;

    .line 997
    .line 998
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 999
    .line 1000
    .line 1001
    move-result-object v15

    .line 1002
    invoke-direct {v14, v15}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1003
    .line 1004
    .line 1005
    invoke-virtual {v14, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1006
    .line 1007
    .line 1008
    const/16 v21, 0xc

    .line 1009
    .line 1010
    invoke-static/range {v21 .. v21}, Lmp;->q(I)I

    .line 1011
    .line 1012
    .line 1013
    move-result v15

    .line 1014
    move/from16 v22, v2

    .line 1015
    .line 1016
    invoke-static/range {v21 .. v21}, Lmp;->q(I)I

    .line 1017
    .line 1018
    .line 1019
    move-result v2

    .line 1020
    invoke-virtual {v14, v6, v15, v6, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 1021
    .line 1022
    .line 1023
    const/16 v2, 0x10

    .line 1024
    .line 1025
    invoke-virtual {v14, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 1026
    .line 1027
    .line 1028
    new-instance v15, Landroid/view/View;

    .line 1029
    .line 1030
    move/from16 v21, v2

    .line 1031
    .line 1032
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v2

    .line 1036
    invoke-direct {v15, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 1037
    .line 1038
    .line 1039
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 1040
    .line 1041
    const/16 v23, 0x8

    .line 1042
    .line 1043
    invoke-static/range {v23 .. v23}, Lmp;->q(I)I

    .line 1044
    .line 1045
    .line 1046
    move-result v6

    .line 1047
    move-object/from16 v24, v4

    .line 1048
    .line 1049
    invoke-static/range {v23 .. v23}, Lmp;->q(I)I

    .line 1050
    .line 1051
    .line 1052
    move-result v4

    .line 1053
    invoke-direct {v2, v6, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1054
    .line 1055
    .line 1056
    invoke-static/range {v21 .. v21}, Lmp;->q(I)I

    .line 1057
    .line 1058
    .line 1059
    move-result v4

    .line 1060
    iput v4, v2, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 1061
    .line 1062
    invoke-virtual {v15, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1063
    .line 1064
    .line 1065
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    .line 1066
    .line 1067
    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 1068
    .line 1069
    .line 1070
    const/4 v4, 0x1

    .line 1071
    invoke-virtual {v2, v4}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 1072
    .line 1073
    .line 1074
    if-eqz v13, :cond_18

    .line 1075
    .line 1076
    move v4, v1

    .line 1077
    goto :goto_1e

    .line 1078
    :cond_18
    const-string v4, "TPsvndQ5Zw==\n"

    .line 1079
    .line 1080
    const-string v6, "b78e2eV9URs=\n"

    .line 1081
    .line 1082
    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v4

    .line 1086
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1087
    .line 1088
    .line 1089
    move-result v4

    .line 1090
    :goto_1e
    invoke-virtual {v2, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual {v15, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual {v14, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1097
    .line 1098
    .line 1099
    new-instance v2, Landroid/widget/TextView;

    .line 1100
    .line 1101
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v4

    .line 1105
    invoke-direct {v2, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1106
    .line 1107
    .line 1108
    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1109
    .line 1110
    .line 1111
    if-eqz v13, :cond_19

    .line 1112
    .line 1113
    const/high16 v4, 0x41800000    # 16.0f

    .line 1114
    .line 1115
    goto :goto_1f

    .line 1116
    :cond_19
    const/high16 v4, 0x41700000    # 15.0f

    .line 1117
    .line 1118
    :goto_1f
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1119
    .line 1120
    .line 1121
    if-eqz v13, :cond_1a

    .line 1122
    .line 1123
    move v5, v10

    .line 1124
    :cond_1a
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1125
    .line 1126
    .line 1127
    const/4 v5, 0x0

    .line 1128
    invoke-virtual {v2, v5, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 1129
    .line 1130
    .line 1131
    invoke-virtual {v14, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1132
    .line 1133
    .line 1134
    invoke-virtual {v3, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1135
    .line 1136
    .line 1137
    move/from16 v2, v22

    .line 1138
    .line 1139
    move-object/from16 v4, v24

    .line 1140
    .line 1141
    const/4 v6, 0x0

    .line 1142
    goto/16 :goto_1c

    .line 1143
    .line 1144
    :cond_1b
    move/from16 v22, v2

    .line 1145
    .line 1146
    invoke-direct {v0, v3}, Lcom/ljx/wechatmod/ui/MainActivity;->injectJellyTouchAnimation(Landroid/view/View;)V

    .line 1147
    .line 1148
    .line 1149
    invoke-virtual {v8, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1150
    .line 1151
    .line 1152
    new-instance v2, Landroid/widget/LinearLayout;

    .line 1153
    .line 1154
    invoke-direct {v2, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1155
    .line 1156
    .line 1157
    const/16 v3, 0x11

    .line 1158
    .line 1159
    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 1160
    .line 1161
    .line 1162
    invoke-static/range {v17 .. v17}, Lmp;->q(I)I

    .line 1163
    .line 1164
    .line 1165
    move-result v4

    .line 1166
    invoke-static/range {v17 .. v17}, Lmp;->q(I)I

    .line 1167
    .line 1168
    .line 1169
    move-result v5

    .line 1170
    const/4 v6, 0x0

    .line 1171
    invoke-virtual {v2, v6, v4, v6, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 1172
    .line 1173
    .line 1174
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 1175
    .line 1176
    const/4 v5, -0x2

    .line 1177
    const/4 v14, -0x1

    .line 1178
    invoke-direct {v4, v14, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1179
    .line 1180
    .line 1181
    const/16 v5, 0x28

    .line 1182
    .line 1183
    invoke-static {v5}, Lmp;->q(I)I

    .line 1184
    .line 1185
    .line 1186
    move-result v5

    .line 1187
    iput v5, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 1188
    .line 1189
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1190
    .line 1191
    .line 1192
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    .line 1193
    .line 1194
    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 1195
    .line 1196
    .line 1197
    invoke-virtual {v4, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 1198
    .line 1199
    .line 1200
    const/high16 v1, 0x42c80000    # 100.0f

    .line 1201
    .line 1202
    invoke-static {v1}, Lmp;->p(F)F

    .line 1203
    .line 1204
    .line 1205
    move-result v1

    .line 1206
    invoke-virtual {v4, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 1207
    .line 1208
    .line 1209
    invoke-virtual {v2, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1210
    .line 1211
    .line 1212
    invoke-direct {v0, v2}, Lcom/ljx/wechatmod/ui/MainActivity;->injectJellyTouchAnimation(Landroid/view/View;)V

    .line 1213
    .line 1214
    .line 1215
    new-instance v1, Lya;

    .line 1216
    .line 1217
    const/4 v4, 0x4

    .line 1218
    invoke-direct {v1, v4, v0}, Lya;-><init>(ILjava/lang/Object;)V

    .line 1219
    .line 1220
    .line 1221
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1222
    .line 1223
    .line 1224
    new-instance v1, Landroid/widget/TextView;

    .line 1225
    .line 1226
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1227
    .line 1228
    .line 1229
    const-string v4, "gzXvFdNwMfPFbstR\n"

    .line 1230
    .line 1231
    const-string v5, "a4p08FbV1E0=\n"

    .line 1232
    .line 1233
    const/high16 v6, 0x41900000    # 18.0f

    .line 1234
    .line 1235
    const/4 v14, -0x1

    .line 1236
    invoke-static {v4, v5, v1, v6, v14}, Lg40;->n(Ljava/lang/String;Ljava/lang/String;Landroid/widget/TextView;FI)V

    .line 1237
    .line 1238
    .line 1239
    const/4 v5, 0x0

    .line 1240
    const/4 v14, 0x1

    .line 1241
    invoke-virtual {v1, v5, v14}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 1242
    .line 1243
    .line 1244
    const v4, 0x3ca3d70a    # 0.02f

    .line 1245
    .line 1246
    .line 1247
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setLetterSpacing(F)V

    .line 1248
    .line 1249
    .line 1250
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1251
    .line 1252
    .line 1253
    invoke-virtual {v8, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1254
    .line 1255
    .line 1256
    new-instance v1, Landroid/widget/TextView;

    .line 1257
    .line 1258
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1259
    .line 1260
    .line 1261
    const-string v2, "EQbFOrwDFFh3\n"

    .line 1262
    .line 1263
    const-string v4, "+bF20guw/ME=\n"

    .line 1264
    .line 1265
    invoke-static {v2, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v2

    .line 1269
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1270
    .line 1271
    .line 1272
    const/high16 v2, 0x41400000    # 12.0f

    .line 1273
    .line 1274
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1275
    .line 1276
    .line 1277
    const v2, 0x3ecccccd    # 0.4f

    .line 1278
    .line 1279
    .line 1280
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setLetterSpacing(F)V

    .line 1281
    .line 1282
    .line 1283
    if-eqz v22, :cond_1c

    .line 1284
    .line 1285
    const-string v2, "Ge16whAnn9l8\n"

    .line 1286
    .line 1287
    const-string v4, "Ot5JhFZh2Z8=\n"

    .line 1288
    .line 1289
    :goto_20
    invoke-static {v2, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v2

    .line 1293
    goto :goto_21

    .line 1294
    :cond_1c
    const-string v2, "ujUN9vGAg6mp\n"

    .line 1295
    .line 1296
    const-string v4, "mQE9xsGws5k=\n"

    .line 1297
    .line 1298
    goto :goto_20

    .line 1299
    :goto_21
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1300
    .line 1301
    .line 1302
    move-result v2

    .line 1303
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1304
    .line 1305
    .line 1306
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 1307
    .line 1308
    .line 1309
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 1310
    .line 1311
    const/4 v5, -0x2

    .line 1312
    const/4 v14, -0x1

    .line 1313
    invoke-direct {v2, v14, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1314
    .line 1315
    .line 1316
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1317
    .line 1318
    .line 1319
    invoke-virtual {v8, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1320
    .line 1321
    .line 1322
    invoke-virtual {v7, v8}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 1323
    .line 1324
    .line 1325
    invoke-virtual {v12, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1326
    .line 1327
    .line 1328
    invoke-direct {v0, v8}, Lcom/ljx/wechatmod/ui/MainActivity;->startCascadingEntranceAnimation(Landroid/view/ViewGroup;)V

    .line 1329
    .line 1330
    .line 1331
    invoke-virtual {v0, v12}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    .line 1332
    .line 1333
    .line 1334
    return-void

    .line 1335
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f81eb85    # 1.015f
        0x3f800000    # 1.0f
    .end array-data

    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3f81eb85    # 1.015f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private static final initSukiStyleUI$lambda$24$lambda$23(Landroid/widget/TextView;I)V
    .locals 8

    .line 1
    new-instance v0, Landroid/graphics/LinearGradient;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextSize()F

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 24
    .line 25
    mul-float v4, v1, v2

    .line 26
    .line 27
    const-string v1, "lk21D2k+iQ==\n"

    .line 28
    .line 29
    const-string v2, "tQmAN1p4z04=\n"

    .line 30
    .line 31
    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    filled-new-array {p1, v1}, [I

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    const/4 v6, 0x0

    .line 44
    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method private static final initSukiStyleUI$lambda$46$lambda$45(Lcom/ljx/wechatmod/ui/MainActivity;Landroid/view/View;)V
    .locals 4

    .line 1
    :try_start_0
    new-instance p1, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/content/ComponentName;

    .line 7
    .line 8
    const-string v1, "sEjTqyhxUlC2ScqrMXk=\n"

    .line 9
    .line 10
    const-string v2, "0ye+hVwUPDM=\n"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "wTVBVaAPGSbHNFhVuQdZMMt0YBqhBBQtxyh5Mg==\n"

    .line 17
    .line 18
    const-string v3, "olose9Rqd0U=\n"

    .line 19
    .line 20
    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    const/high16 v0, 0x14000000

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catch_0
    const-string p1, "wE3m8sHhhOKtNMSkh9/Ms5lwpKvyicPbwV/j8cDi\n"

    .line 40
    .line 41
    const-string v0, "JtFMFGJhYlc=\n"

    .line 42
    .line 43
    invoke-static {p1, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const/4 v0, 0x1

    .line 48
    invoke-direct {p0, p1, v0}, Lcom/ljx/wechatmod/ui/MainActivity;->showCapsuleToast(Ljava/lang/String;Z)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method private final injectJellyTouchAnimation(Landroid/view/View;)V
    .locals 2

    .line 1
    new-instance v0, Lz9;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Lz9;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static final injectJellyTouchAnimation$lambda$51(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 7

    .line 1
    const v0, 0x7e090002

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    instance-of v2, v1, Lo40;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    check-cast v1, Lo40;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v1, v3

    .line 17
    :goto_0
    if-nez v1, :cond_1

    .line 18
    .line 19
    new-instance v1, Lo40;

    .line 20
    .line 21
    sget-object v2, Lo40;->o:Lsh;

    .line 22
    .line 23
    invoke-direct {v1, p0, v2}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    const v0, 0x7e090003

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    instance-of v4, v2, Lo40;

    .line 37
    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    move-object v3, v2

    .line 41
    check-cast v3, Lo40;

    .line 42
    .line 43
    :cond_2
    if-nez v3, :cond_3

    .line 44
    .line 45
    new-instance v3, Lo40;

    .line 46
    .line 47
    sget-object v2, Lo40;->p:Lsh;

    .line 48
    .line 49
    invoke-direct {v3, p0, v2}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v0, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    const/4 v2, 0x1

    .line 60
    if-eqz v0, :cond_6

    .line 61
    .line 62
    if-eq v0, v2, :cond_4

    .line 63
    .line 64
    const/4 v4, 0x3

    .line 65
    if-eq v0, v4, :cond_4

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 69
    .line 70
    const/high16 v4, 0x43480000    # 200.0f

    .line 71
    .line 72
    const v5, 0x3e99999a    # 0.3f

    .line 73
    .line 74
    .line 75
    invoke-static {v0, v4, v5}, Lg40;->f(FFF)Lp40;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    iput-object v6, v1, Lo40;->k:Lp40;

    .line 80
    .line 81
    invoke-static {v0, v4, v5}, Lg40;->f(FFF)Lp40;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, v3, Lo40;->k:Lp40;

    .line 86
    .line 87
    invoke-virtual {v1}, Lo40;->h()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3}, Lo40;->h()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-ne p1, v2, :cond_5

    .line 98
    .line 99
    invoke-virtual {p0}, Landroid/view/View;->performClick()Z

    .line 100
    .line 101
    .line 102
    :cond_5
    :goto_1
    return v2

    .line 103
    :cond_6
    const p0, 0x3f70a3d7    # 0.94f

    .line 104
    .line 105
    .line 106
    const p1, 0x44bb8000    # 1500.0f

    .line 107
    .line 108
    .line 109
    const v0, 0x3ecccccd    # 0.4f

    .line 110
    .line 111
    .line 112
    invoke-static {p0, p1, v0}, Lg40;->f(FFF)Lp40;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    iput-object v4, v1, Lo40;->k:Lp40;

    .line 117
    .line 118
    invoke-static {p0, p1, v0}, Lg40;->f(FFF)Lp40;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    iput-object p0, v3, Lo40;->k:Lp40;

    .line 123
    .line 124
    invoke-virtual {v1}, Lo40;->h()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v3}, Lo40;->h()V

    .line 128
    .line 129
    .line 130
    return v2
.end method

.method private final setupModernSystemUi()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/16 v2, 0x1d

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-lt v1, v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget v2, v2, Landroid/content/res/Configuration;->uiMode:I

    .line 24
    .line 25
    and-int/lit8 v2, v2, 0x30

    .line 26
    .line 27
    const/16 v4, 0x20

    .line 28
    .line 29
    if-ne v2, v4, :cond_1

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move v2, v3

    .line 34
    :goto_0
    invoke-static {v0}, Ld0;->p(Landroid/view/Window;)V

    .line 35
    .line 36
    .line 37
    const/16 v4, 0x1e

    .line 38
    .line 39
    if-lt v1, v4, :cond_3

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {v1}, Ld0;->k(Landroid/view/View;)Landroid/view/WindowInsetsController;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    move v2, v3

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    const/16 v2, 0x8

    .line 56
    .line 57
    :goto_1
    invoke-static {v1, v2}, Ld0;->s(Landroid/view/WindowInsetsController;I)V

    .line 58
    .line 59
    .line 60
    :cond_3
    invoke-virtual {v0, v3}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v3}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method private final showCapsuleToast(Ljava/lang/String;Z)V
    .locals 11

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
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    if-nez v0, :cond_1

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    iget-object v1, p0, Lcom/ljx/wechatmod/ui/MainActivity;->activeToast:Landroid/view/View;

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 25
    .line 26
    .line 27
    :cond_2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 28
    .line 29
    const/16 v2, 0x1d

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-lt v1, v2, :cond_3

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iget v2, v2, Landroid/content/res/Configuration;->uiMode:I

    .line 44
    .line 45
    and-int/lit8 v2, v2, 0x30

    .line 46
    .line 47
    const/16 v5, 0x20

    .line 48
    .line 49
    if-ne v2, v5, :cond_3

    .line 50
    .line 51
    move v2, v4

    .line 52
    goto :goto_1

    .line 53
    :cond_3
    move v2, v3

    .line 54
    :goto_1
    new-instance v5, Landroid/widget/LinearLayout;

    .line 55
    .line 56
    invoke-direct {v5, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v5, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 60
    .line 61
    .line 62
    const/16 v6, 0x10

    .line 63
    .line 64
    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 65
    .line 66
    .line 67
    const/16 v6, 0x12

    .line 68
    .line 69
    invoke-static {v6}, Lmp;->q(I)I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    const/16 v7, 0xc

    .line 74
    .line 75
    invoke-static {v7}, Lmp;->q(I)I

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    const/16 v9, 0x16

    .line 80
    .line 81
    invoke-static {v9}, Lmp;->q(I)I

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    invoke-static {v7}, Lmp;->q(I)I

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    invoke-virtual {v5, v6, v8, v9, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 90
    .line 91
    .line 92
    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    .line 93
    .line 94
    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 95
    .line 96
    .line 97
    if-eqz v2, :cond_4

    .line 98
    .line 99
    const-string v8, "dFTI31v8QWZm\n"

    .line 100
    .line 101
    const-string v9, "VxH+7mrNcFc=\n"

    .line 102
    .line 103
    :goto_2
    invoke-static {v8, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    goto :goto_3

    .line 108
    :cond_4
    const-string v8, "2+/Nh80op6q+\n"

    .line 109
    .line 110
    const-string v9, "+Kr7wYtu4ew=\n"

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :goto_3
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    invoke-virtual {v6, v8}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 118
    .line 119
    .line 120
    const/high16 v8, 0x42c80000    # 100.0f

    .line 121
    .line 122
    invoke-static {v8}, Lmp;->p(F)F

    .line 123
    .line 124
    .line 125
    move-result v8

    .line 126
    invoke-virtual {v6, v8}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 127
    .line 128
    .line 129
    invoke-static {v4}, Lmp;->q(I)I

    .line 130
    .line 131
    .line 132
    move-result v8

    .line 133
    if-eqz v2, :cond_5

    .line 134
    .line 135
    const-string v9, "RLQHMDZJ39ch\n"

    .line 136
    .line 137
    const-string v10, "Z4YxdnAPmZE=\n"

    .line 138
    .line 139
    :goto_4
    invoke-static {v9, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    goto :goto_5

    .line 144
    :cond_5
    const-string v9, "jBF9AWNnsm6f\n"

    .line 145
    .line 146
    const-string v10, "ryA8MVNXgl4=\n"

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :goto_5
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    move-result v9

    .line 153
    invoke-virtual {v6, v8, v9}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v5, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 157
    .line 158
    .line 159
    const/high16 v6, 0x41f00000    # 30.0f

    .line 160
    .line 161
    invoke-static {v6}, Lmp;->p(F)F

    .line 162
    .line 163
    .line 164
    move-result v6

    .line 165
    invoke-virtual {v5, v6}, Landroid/view/View;->setElevation(F)V

    .line 166
    .line 167
    .line 168
    const/16 v6, 0x1c

    .line 169
    .line 170
    if-lt v1, v6, :cond_7

    .line 171
    .line 172
    const-string v1, "+iMcmzRW1w==\n"

    .line 173
    .line 174
    const-string v6, "2RMsqwRm580=\n"

    .line 175
    .line 176
    invoke-static {v1, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    invoke-static {v5, v1}, Lc0;->r(Landroid/widget/LinearLayout;I)V

    .line 185
    .line 186
    .line 187
    if-eqz p2, :cond_6

    .line 188
    .line 189
    const-string v1, "/hXCwWPdU+Dt\n"

    .line 190
    .line 191
    const-string v6, "3SbxhyXuEdM=\n"

    .line 192
    .line 193
    :goto_6
    invoke-static {v1, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    goto :goto_7

    .line 198
    :cond_6
    const-string v1, "5nB5epG365f1\n"

    .line 199
    .line 200
    const-string v6, "xUJJSqGH26c=\n"

    .line 201
    .line 202
    goto :goto_6

    .line 203
    :goto_7
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    invoke-static {v5, v1}, Lc0;->A(Landroid/widget/LinearLayout;I)V

    .line 208
    .line 209
    .line 210
    :cond_7
    new-instance v1, Landroid/view/View;

    .line 211
    .line 212
    invoke-direct {v1, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 213
    .line 214
    .line 215
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 216
    .line 217
    const/16 v8, 0x8

    .line 218
    .line 219
    invoke-static {v8}, Lmp;->q(I)I

    .line 220
    .line 221
    .line 222
    move-result v9

    .line 223
    invoke-static {v8}, Lmp;->q(I)I

    .line 224
    .line 225
    .line 226
    move-result v8

    .line 227
    invoke-direct {v6, v9, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 228
    .line 229
    .line 230
    invoke-static {v7}, Lmp;->q(I)I

    .line 231
    .line 232
    .line 233
    move-result v7

    .line 234
    iput v7, v6, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 235
    .line 236
    invoke-virtual {v1, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 237
    .line 238
    .line 239
    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    .line 240
    .line 241
    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v6, v4}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 245
    .line 246
    .line 247
    if-eqz p2, :cond_8

    .line 248
    .line 249
    const-string p2, "A8zN0jrtpg==\n"

    .line 250
    .line 251
    const-string v7, "IIqL4Xjell8=\n"

    .line 252
    .line 253
    :goto_8
    invoke-static {p2, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object p2

    .line 257
    goto :goto_9

    .line 258
    :cond_8
    const-string p2, "gtVq8yHOWQ==\n"

    .line 259
    .line 260
    const-string v7, "oeZesBb7YCQ=\n"

    .line 261
    .line 262
    goto :goto_8

    .line 263
    :goto_9
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 264
    .line 265
    .line 266
    move-result p2

    .line 267
    invoke-virtual {v6, p2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v1, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 271
    .line 272
    .line 273
    new-instance p2, Landroid/widget/TextView;

    .line 274
    .line 275
    invoke-direct {p2, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 279
    .line 280
    .line 281
    const/high16 p1, 0x41580000    # 13.5f

    .line 282
    .line 283
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 284
    .line 285
    .line 286
    if-eqz v2, :cond_9

    .line 287
    .line 288
    const-string p1, "S9764ARsRQ==\n"

    .line 289
    .line 290
    const-string v2, "aJjPpjEqcPY=\n"

    .line 291
    .line 292
    :goto_a
    invoke-static {p1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    goto :goto_b

    .line 297
    :cond_9
    const-string p1, "vdK/nrJ+1g==\n"

    .line 298
    .line 299
    const-string v2, "nuOOr4NP55Q=\n"

    .line 300
    .line 301
    goto :goto_a

    .line 302
    :goto_b
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 303
    .line 304
    .line 305
    move-result p1

    .line 306
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 307
    .line 308
    .line 309
    const-string p1, "JQl2TKQhr2I/DjVS7DajZTs=\n"

    .line 310
    .line 311
    const-string v2, "VmgYP4lSyhA=\n"

    .line 312
    .line 313
    invoke-static {p1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    invoke-static {p1, v3}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    invoke-virtual {p2, p1, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 322
    .line 323
    .line 324
    const p1, 0x3ca3d70a    # 0.02f

    .line 325
    .line 326
    .line 327
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setLetterSpacing(F)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v5, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v5, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 334
    .line 335
    .line 336
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 337
    .line 338
    const/4 p2, -0x2

    .line 339
    invoke-direct {p1, p2, p2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 340
    .line 341
    .line 342
    const/16 p2, 0x31

    .line 343
    .line 344
    iput p2, p1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 345
    .line 346
    const/16 p2, 0x37

    .line 347
    .line 348
    invoke-static {p2}, Lmp;->q(I)I

    .line 349
    .line 350
    .line 351
    move-result p2

    .line 352
    iput p2, p1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 353
    .line 354
    invoke-virtual {v0, v5, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 355
    .line 356
    .line 357
    iput-object v5, p0, Lcom/ljx/wechatmod/ui/MainActivity;->activeToast:Landroid/view/View;

    .line 358
    .line 359
    const/high16 p1, 0x42700000    # 60.0f

    .line 360
    .line 361
    invoke-static {p1}, Lmp;->p(F)F

    .line 362
    .line 363
    .line 364
    move-result p1

    .line 365
    neg-float p1, p1

    .line 366
    invoke-virtual {v5, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 367
    .line 368
    .line 369
    const/4 p1, 0x0

    .line 370
    invoke-virtual {v5, p1}, Landroid/view/View;->setAlpha(F)V

    .line 371
    .line 372
    .line 373
    const p2, 0x3f59999a    # 0.85f

    .line 374
    .line 375
    .line 376
    invoke-virtual {v5, p2}, Landroid/view/View;->setScaleX(F)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v5, p2}, Landroid/view/View;->setScaleY(F)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v5}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 383
    .line 384
    .line 385
    move-result-object p2

    .line 386
    const/high16 v1, 0x3f800000    # 1.0f

    .line 387
    .line 388
    invoke-virtual {p2, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 389
    .line 390
    .line 391
    move-result-object p2

    .line 392
    const-wide/16 v2, 0xc8

    .line 393
    .line 394
    invoke-virtual {p2, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 395
    .line 396
    .line 397
    move-result-object p2

    .line 398
    invoke-virtual {p2}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 399
    .line 400
    .line 401
    new-instance p2, Lo40;

    .line 402
    .line 403
    sget-object v2, Lo40;->n:Lsh;

    .line 404
    .line 405
    invoke-direct {p2, v5, v2}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    .line 406
    .line 407
    .line 408
    const/high16 v2, 0x43480000    # 200.0f

    .line 409
    .line 410
    const v3, 0x3f19999a    # 0.6f

    .line 411
    .line 412
    .line 413
    invoke-static {p1, v2, v3}, Lg40;->f(FFF)Lp40;

    .line 414
    .line 415
    .line 416
    move-result-object p1

    .line 417
    iput-object p1, p2, Lo40;->k:Lp40;

    .line 418
    .line 419
    invoke-virtual {p2}, Lo40;->h()V

    .line 420
    .line 421
    .line 422
    new-instance p1, Lo40;

    .line 423
    .line 424
    sget-object p2, Lo40;->o:Lsh;

    .line 425
    .line 426
    invoke-direct {p1, v5, p2}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    .line 427
    .line 428
    .line 429
    invoke-static {v1, v2, v3}, Lg40;->f(FFF)Lp40;

    .line 430
    .line 431
    .line 432
    move-result-object p2

    .line 433
    iput-object p2, p1, Lo40;->k:Lp40;

    .line 434
    .line 435
    invoke-virtual {p1}, Lo40;->h()V

    .line 436
    .line 437
    .line 438
    new-instance p1, Lo40;

    .line 439
    .line 440
    sget-object p2, Lo40;->p:Lsh;

    .line 441
    .line 442
    invoke-direct {p1, v5, p2}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    .line 443
    .line 444
    .line 445
    invoke-static {v1, v2, v3}, Lg40;->f(FFF)Lp40;

    .line 446
    .line 447
    .line 448
    move-result-object p2

    .line 449
    iput-object p2, p1, Lo40;->k:Lp40;

    .line 450
    .line 451
    invoke-virtual {p1}, Lo40;->h()V

    .line 452
    .line 453
    .line 454
    new-instance p1, Lns;

    .line 455
    .line 456
    invoke-direct {p1, v5, v0}, Lns;-><init>(Landroid/widget/LinearLayout;Landroid/view/ViewGroup;)V

    .line 457
    .line 458
    .line 459
    const-wide/16 v0, 0x9c4

    .line 460
    .line 461
    invoke-virtual {v5, p1, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 462
    .line 463
    .line 464
    return-void
.end method

.method public static synthetic showCapsuleToast$default(Lcom/ljx/wechatmod/ui/MainActivity;Ljava/lang/String;ZILjava/lang/Object;)V
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
    invoke-direct {p0, p1, p2}, Lcom/ljx/wechatmod/ui/MainActivity;->showCapsuleToast(Ljava/lang/String;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static final showCapsuleToast$lambda$18(Landroid/widget/LinearLayout;Landroid/view/ViewGroup;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-wide/16 v1, 0xfa

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Lns;

    .line 23
    .line 24
    invoke-direct {v1, p1, p0}, Lns;-><init>(Landroid/view/ViewGroup;Landroid/widget/LinearLayout;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 32
    .line 33
    .line 34
    new-instance p1, Lo40;

    .line 35
    .line 36
    sget-object v0, Lo40;->n:Lsh;

    .line 37
    .line 38
    invoke-direct {p1, p0, v0}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    .line 39
    .line 40
    .line 41
    new-instance v0, Lp40;

    .line 42
    .line 43
    const/high16 v1, 0x42700000    # 60.0f

    .line 44
    .line 45
    invoke-static {v1}, Lmp;->p(F)F

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    neg-float v1, v1

    .line 50
    invoke-direct {v0, v1}, Lp40;-><init>(F)V

    .line 51
    .line 52
    .line 53
    const/high16 v1, 0x43480000    # 200.0f

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Lp40;->b(F)V

    .line 56
    .line 57
    .line 58
    const/high16 v2, 0x3f800000    # 1.0f

    .line 59
    .line 60
    invoke-virtual {v0, v2}, Lp40;->a(F)V

    .line 61
    .line 62
    .line 63
    iput-object v0, p1, Lo40;->k:Lp40;

    .line 64
    .line 65
    invoke-virtual {p1}, Lo40;->h()V

    .line 66
    .line 67
    .line 68
    new-instance p1, Lo40;

    .line 69
    .line 70
    sget-object v0, Lo40;->o:Lsh;

    .line 71
    .line 72
    invoke-direct {p1, p0, v0}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    .line 73
    .line 74
    .line 75
    const v0, 0x3f59999a    # 0.85f

    .line 76
    .line 77
    .line 78
    invoke-static {v0, v1, v2}, Lg40;->f(FFF)Lp40;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    iput-object v3, p1, Lo40;->k:Lp40;

    .line 83
    .line 84
    invoke-virtual {p1}, Lo40;->h()V

    .line 85
    .line 86
    .line 87
    new-instance p1, Lo40;

    .line 88
    .line 89
    sget-object v3, Lo40;->p:Lsh;

    .line 90
    .line 91
    invoke-direct {p1, p0, v3}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v0, v1, v2}, Lg40;->f(FFF)Lp40;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    iput-object p0, p1, Lo40;->k:Lp40;

    .line 99
    .line 100
    invoke-virtual {p1}, Lo40;->h()V

    .line 101
    .line 102
    .line 103
    :cond_0
    return-void
.end method

.method private static final showCapsuleToast$lambda$18$lambda$14(Landroid/view/ViewGroup;Landroid/widget/LinearLayout;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final startCascadingEntranceAnimation(Landroid/view/ViewGroup;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-virtual {v2, v3}, Landroid/view/View;->setAlpha(F)V

    .line 14
    .line 15
    .line 16
    const/high16 v3, 0x42c80000    # 100.0f

    .line 17
    .line 18
    invoke-static {v3}, Lmp;->p(F)F

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-virtual {v2, v3}, Landroid/view/View;->setTranslationY(F)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    const/high16 v4, 0x3f800000    # 1.0f

    .line 30
    .line 31
    invoke-virtual {v3, v4}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    const-wide/16 v4, 0x258

    .line 36
    .line 37
    invoke-virtual {v3, v4, v5}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    int-to-long v4, v1

    .line 42
    const-wide/16 v6, 0x5a

    .line 43
    .line 44
    mul-long/2addr v4, v6

    .line 45
    invoke-virtual {v3, v4, v5}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    new-instance v6, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 50
    .line 51
    invoke-direct {v6}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v6}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v3}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 59
    .line 60
    .line 61
    new-instance v3, Lks;

    .line 62
    .line 63
    const/4 v6, 0x2

    .line 64
    invoke-direct {v3, v2, v6}, Lks;-><init>(Landroid/view/View;I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v3, v4, v5}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 68
    .line 69
    .line 70
    add-int/lit8 v1, v1, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    return-void
.end method

.method private static final startCascadingEntranceAnimation$lambda$53(Landroid/view/View;)V
    .locals 3

    .line 1
    new-instance v0, Lo40;

    .line 2
    .line 3
    sget-object v1, Lo40;->n:Lsh;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    .line 6
    .line 7
    .line 8
    const/high16 p0, 0x43480000    # 200.0f

    .line 9
    .line 10
    const v1, 0x3f266666    # 0.65f

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {v2, p0, v1}, Lg40;->f(FFF)Lp40;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    iput-object p0, v0, Lo40;->k:Lp40;

    .line 19
    .line 20
    invoke-virtual {v0}, Lo40;->h()V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final isModuleActive()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    const-string v0, "package:"

    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-direct {p0}, Lcom/ljx/wechatmod/ui/MainActivity;->setupModernSystemUi()V

    .line 7
    .line 8
    .line 9
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v1, 0x1e

    .line 12
    .line 13
    if-lt p1, v1, :cond_0

    .line 14
    .line 15
    invoke-static {}, Ld0;->u()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    const-string p1, "UOp1cyRF/8M5kGkSZFKergLAHTU9LY7kX+t2chtU/fEcn3IRZFCnrwXjEwgMLKzOX8xl\n"

    .line 22
    .line 23
    const-string v1, "uXb1m4LEGUo=\n"

    .line 24
    .line 25
    invoke-static {p1, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const/4 v1, 0x1

    .line 30
    invoke-direct {p0, p1, v1}, Lcom/ljx/wechatmod/ui/MainActivity;->showCapsuleToast(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    new-instance p1, Landroid/content/Intent;

    .line 34
    .line 35
    const-string v1, "6NTZIhQ4Wf3638kkEj9aoKf3/B46FniMyOrtDzodcYzP8/EVKA58kMr/7gMkAXiBxPPuAzIecw==\n"

    .line 36
    .line 37
    const-string v2, "ibq9UHtRPdM=\n"

    .line 38
    .line 39
    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    new-instance v2, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catchall_0
    move-exception p1

    .line 74
    goto :goto_1

    .line 75
    :cond_0
    :goto_0
    invoke-direct {p0}, Lcom/ljx/wechatmod/ui/MainActivity;->initSukiStyleUI()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :goto_1
    new-instance v0, Landroid/widget/ScrollView;

    .line 80
    .line 81
    invoke-direct {v0, p0}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 82
    .line 83
    .line 84
    new-instance v1, Landroid/widget/TextView;

    .line 85
    .line 86
    invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 87
    .line 88
    .line 89
    invoke-static {p1}, Lgf;->X(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    const-string v2, "App \u542f\u52a8\u5f02\u5e38\uff1a\n\n"

    .line 94
    .line 95
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 100
    .line 101
    .line 102
    const-string p1, "2xJi/FXCbQ==\n"

    .line 103
    .line 104
    const-string v2, "+FQkyWf3X6Q=\n"

    .line 105
    .line 106
    invoke-static {p1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 115
    .line 116
    .line 117
    const/high16 p1, 0x41600000    # 14.0f

    .line 118
    .line 119
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 120
    .line 121
    .line 122
    const/16 p1, 0x64

    .line 123
    .line 124
    const/16 v2, 0x32

    .line 125
    .line 126
    invoke-virtual {v1, v2, p1, v2, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1e

    .line 7
    .line 8
    if-lt v0, v1, :cond_1

    .line 9
    .line 10
    invoke-static {}, Ld0;->u()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    return-void

    .line 18
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/ljx/wechatmod/ui/MainActivity;->extractFontToStealthDir()V

    .line 19
    .line 20
    .line 21
    return-void
.end method
