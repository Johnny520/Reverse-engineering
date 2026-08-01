.class public L飘花落叶言苏世哲楪子兰/飘花落叶言子楪世兰哲苏;
.super L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪哲兰世苏:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/util/HashMap;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static 飘花落叶言子楪苏哲兰世(Landroid/app/Activity;Z)V
    .locals 12

    .line 1
    sget-object v0, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    new-instance v1, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;

    .line 12
    .line 13
    invoke-direct {v1}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {p0}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子苏楪世哲兰(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v0, v1, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    if-eqz p1, :cond_9

    .line 26
    .line 27
    iget-object p1, v1, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲:Landroid/app/Activity;

    .line 28
    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    iput-object p0, v1, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲:Landroid/app/Activity;

    .line 32
    .line 33
    :cond_1
    iget-object p1, v1, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Landroid/view/WindowManager;

    .line 34
    .line 35
    if-nez p1, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, v1, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Landroid/view/WindowManager;

    .line 42
    .line 43
    :cond_2
    iget-object p1, v1, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:Landroid/view/WindowManager$LayoutParams;

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    if-nez p1, :cond_3

    .line 47
    .line 48
    new-instance p1, Landroid/view/WindowManager$LayoutParams;

    .line 49
    .line 50
    invoke-direct {p1}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object p1, v1, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:Landroid/view/WindowManager$LayoutParams;

    .line 54
    .line 55
    const/16 v4, 0x3e8

    .line 56
    .line 57
    iput v4, p1, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 58
    .line 59
    const/16 v4, 0x18

    .line 60
    .line 61
    iput v4, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 62
    .line 63
    iput v3, p1, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 64
    .line 65
    const/16 v4, 0x31

    .line 66
    .line 67
    iput v4, p1, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 68
    .line 69
    const/4 v4, -0x1

    .line 70
    iput v4, p1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 71
    .line 72
    iget-object v4, v1, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲:Landroid/app/Activity;

    .line 73
    .line 74
    const/high16 v5, 0x42c80000    # 100.0f

    .line 75
    .line 76
    invoke-static {v4, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪哲苏世兰(Landroid/content/Context;F)I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    iput v4, p1, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 81
    .line 82
    iget-object p1, v1, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:Landroid/view/WindowManager$LayoutParams;

    .line 83
    .line 84
    iput-object p1, v1, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:Landroid/view/WindowManager$LayoutParams;

    .line 85
    .line 86
    :cond_3
    iget-object p1, v1, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Landroid/view/ViewGroup;

    .line 87
    .line 88
    if-nez p1, :cond_8

    .line 89
    .line 90
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    const p1, 0x240c00fc

    .line 95
    .line 96
    .line 97
    const/4 v4, 0x0

    .line 98
    invoke-virtual {p0, p1, v4, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    check-cast p0, Landroid/view/ViewGroup;

    .line 103
    .line 104
    iput-object p0, v1, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Landroid/view/ViewGroup;

    .line 105
    .line 106
    move p0, v2

    .line 107
    :goto_0
    iget-object p1, v1, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Landroid/view/ViewGroup;

    .line 108
    .line 109
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-ge p0, p1, :cond_8

    .line 114
    .line 115
    iget-object p1, v1, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Landroid/view/ViewGroup;

    .line 116
    .line 117
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    instance-of v5, p1, Landroid/widget/ImageView;

    .line 122
    .line 123
    if-eqz v5, :cond_7

    .line 124
    .line 125
    check-cast p1, Landroid/widget/ImageView;

    .line 126
    .line 127
    sget-object v5, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 128
    .line 129
    invoke-static {v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Landroid/content/Context;)Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    const v6, 0x2408009d

    .line 134
    .line 135
    .line 136
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    const-class v7, Landroid/graphics/drawable/Drawable;

    .line 141
    .line 142
    invoke-virtual {v5, v7}, Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;)Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    invoke-virtual {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏兰楪哲(Ljava/lang/Object;)Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    iget-object v5, v5, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏兰楪哲:Landroid/content/Context;

    .line 151
    .line 152
    invoke-virtual {v5}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 153
    .line 154
    .line 155
    move-result-object v7

    .line 156
    invoke-virtual {v6, v7}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲世苏(Landroid/content/res/Resources$Theme;)Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    check-cast v6, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 161
    .line 162
    sget-object v7, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 163
    .line 164
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    sget-object v8, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 169
    .line 170
    invoke-virtual {v8, v7}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v9

    .line 174
    check-cast v9, L飘花落叶言楪子兰哲苏世/飘花落叶言子楪世哲兰苏;

    .line 175
    .line 176
    if-nez v9, :cond_6

    .line 177
    .line 178
    :try_start_0
    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 179
    .line 180
    .line 181
    move-result-object v9

    .line 182
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v10

    .line 186
    invoke-virtual {v9, v10, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 187
    .line 188
    .line 189
    move-result-object v9
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 190
    goto :goto_1

    .line 191
    :catch_0
    move-exception v9

    .line 192
    new-instance v10, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    const-string v11, "Cannot resolve info for"

    .line 195
    .line 196
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v11

    .line 203
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v10

    .line 210
    const-string v11, "AppVersionSignature"

    .line 211
    .line 212
    invoke-static {v11, v10, v9}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 213
    .line 214
    .line 215
    move-object v9, v4

    .line 216
    :goto_1
    if-eqz v9, :cond_4

    .line 217
    .line 218
    iget v9, v9, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 219
    .line 220
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v9

    .line 224
    goto :goto_2

    .line 225
    :cond_4
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 226
    .line 227
    .line 228
    move-result-object v9

    .line 229
    invoke-virtual {v9}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v9

    .line 233
    :goto_2
    new-instance v10, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世哲兰苏;

    .line 234
    .line 235
    invoke-direct {v10, v9}, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v8, v7, v10}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    check-cast v7, L飘花落叶言楪子兰哲苏世/飘花落叶言子楪世哲兰苏;

    .line 243
    .line 244
    if-nez v7, :cond_5

    .line 245
    .line 246
    move-object v9, v10

    .line 247
    goto :goto_3

    .line 248
    :cond_5
    move-object v9, v7

    .line 249
    :cond_6
    :goto_3
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 254
    .line 255
    .line 256
    move-result-object v5

    .line 257
    iget v5, v5, Landroid/content/res/Configuration;->uiMode:I

    .line 258
    .line 259
    and-int/lit8 v5, v5, 0x30

    .line 260
    .line 261
    new-instance v7, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世苏哲兰;

    .line 262
    .line 263
    invoke-direct {v7, v5, v9}, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世苏哲兰;-><init>(IL飘花落叶言楪子兰哲苏世/飘花落叶言子楪世哲兰苏;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v6, v7}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏(L飘花落叶言楪子兰哲苏世/飘花落叶言子楪世哲兰苏;)Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 267
    .line 268
    .line 269
    move-result-object v5

    .line 270
    check-cast v5, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 271
    .line 272
    invoke-virtual {v5}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏()Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    check-cast v5, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 277
    .line 278
    invoke-virtual {v5, p1}, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪兰哲(Landroid/widget/ImageView;)V

    .line 279
    .line 280
    .line 281
    :cond_7
    add-int/lit8 p0, p0, 0x1

    .line 282
    .line 283
    goto/16 :goto_0

    .line 284
    .line 285
    :cond_8
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 286
    .line 287
    .line 288
    move-result p0

    .line 289
    if-nez p0, :cond_a

    .line 290
    .line 291
    iget-object p0, v1, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Landroid/view/WindowManager;

    .line 292
    .line 293
    iget-object p1, v1, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Landroid/view/ViewGroup;

    .line 294
    .line 295
    iget-object v1, v1, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:Landroid/view/WindowManager$LayoutParams;

    .line 296
    .line 297
    invoke-interface {p0, p1, v1}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 301
    .line 302
    .line 303
    goto :goto_4

    .line 304
    :cond_9
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 305
    .line 306
    .line 307
    move-result p0

    .line 308
    if-eqz p0, :cond_a

    .line 309
    .line 310
    iget-object p0, v1, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Landroid/view/WindowManager;

    .line 311
    .line 312
    iget-object p1, v1, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Landroid/view/ViewGroup;

    .line 313
    .line 314
    invoke-interface {p0, p1}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V

    .line 315
    .line 316
    .line 317
    :cond_a
    :goto_4
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 4

    .line 1
    const-wide v0, -0x36a57792051405a7L    # -2.3668162814351054E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 11
    .line 12
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-class v1, Landroid/app/Activity;

    .line 17
    .line 18
    invoke-virtual {v1, p1, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    new-instance v0, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪世兰苏哲;

    .line 23
    .line 24
    invoke-direct {v0, p0}, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1, v0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰苏哲;)V

    .line 28
    .line 29
    .line 30
    const-wide v2, -0x36a5778f051405a7L    # -2.3668203648235084E45

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const/4 v0, 0x0

    .line 40
    invoke-virtual {v1, p1, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    new-instance v2, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;

    .line 45
    .line 46
    const/16 v3, 0x1c

    .line 47
    .line 48
    invoke-direct {v2, p0, v3}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;-><init>(L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p1, v2}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰苏哲;)V

    .line 52
    .line 53
    .line 54
    const-wide v2, -0x36a521e4051405a7L    # -2.3966712951792808E45

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {v1, p1, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    new-instance v0, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;

    .line 68
    .line 69
    const/16 v1, 0x1d

    .line 70
    .line 71
    invoke-direct {v0, v1}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;-><init>(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, p1, v0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰苏哲;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/String;
    .locals 2

    .line 1
    const-wide v0, -0x36a57763051405a7L    # -2.3668802545200865E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
