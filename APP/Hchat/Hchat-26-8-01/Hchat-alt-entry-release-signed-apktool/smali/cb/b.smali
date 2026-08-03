.class public final Lcb/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lcb/b;

.field public static final b:Ljava/util/WeakHashMap;

.field public static final c:Ljava/util/WeakHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcb/b;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcb/b;->a:Lcb/b;

    .line 7
    .line 8
    new-instance v0, Ljava/util/WeakHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcb/b;->b:Ljava/util/WeakHashMap;

    .line 14
    .line 15
    new-instance v0, Ljava/util/WeakHashMap;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcb/b;->c:Ljava/util/WeakHashMap;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;
    .locals 16

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    const-string v2, "[Hchat:RoundAvatar] \u5904\u7406\u901a\u77e5\u5934\u50cf\u5931\u8d25: "

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_7

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-lez v0, :cond_7

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-gtz v0, :cond_0

    .line 23
    .line 24
    goto/16 :goto_5

    .line 25
    .line 26
    :cond_0
    sget-object v0, Lcb/b;->c:Ljava/util/WeakHashMap;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Landroid/graphics/Bitmap;

    .line 42
    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-nez v5, :cond_1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    move-object v3, v4

    .line 53
    :goto_0
    if-eqz v3, :cond_2

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    goto/16 :goto_6

    .line 58
    .line 59
    :cond_2
    move-object v3, v1

    .line 60
    :goto_1
    const v5, 0x3dcccccd    # 0.1f

    .line 61
    .line 62
    .line 63
    const/high16 v6, 0x3f000000    # 0.5f

    .line 64
    .line 65
    move/from16 v7, p2

    .line 66
    .line 67
    invoke-static {v7, v5, v6}, Lr9/e0;->q(FFF)F

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    const/high16 v6, 0x42c80000    # 100.0f

    .line 72
    .line 73
    mul-float/2addr v5, v6

    .line 74
    invoke-static {v5}, Lig/a;->X(F)I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    int-to-float v5, v5

    .line 79
    div-float/2addr v5, v6

    .line 80
    sget-object v6, Lcb/b;->b:Ljava/util/WeakHashMap;

    .line 81
    .line 82
    invoke-virtual {v6, v3}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    check-cast v7, Lcb/a;

    .line 87
    .line 88
    if-eqz v7, :cond_5

    .line 89
    .line 90
    iget v8, v7, Lcb/a;->a:F

    .line 91
    .line 92
    cmpg-float v8, v8, v5

    .line 93
    .line 94
    if-nez v8, :cond_3

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_3
    move-object v7, v4

    .line 98
    :goto_2
    if-eqz v7, :cond_5

    .line 99
    .line 100
    iget-object v7, v7, Lcb/a;->b:Ljava/lang/ref/WeakReference;

    .line 101
    .line 102
    invoke-virtual {v7}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    check-cast v7, Landroid/graphics/Bitmap;

    .line 107
    .line 108
    if-eqz v7, :cond_5

    .line 109
    .line 110
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 111
    .line 112
    .line 113
    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 114
    if-nez v8, :cond_4

    .line 115
    .line 116
    move-object v4, v7

    .line 117
    :cond_4
    if-eqz v4, :cond_5

    .line 118
    .line 119
    monitor-exit p0

    .line 120
    return-object v4

    .line 121
    :cond_5
    :try_start_1
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    sget-object v8, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 130
    .line 131
    invoke-static {v4, v7, v8}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getDensity()I

    .line 139
    .line 140
    .line 141
    move-result v7

    .line 142
    invoke-virtual {v4, v7}, Landroid/graphics/Bitmap;->setDensity(I)V

    .line 143
    .line 144
    .line 145
    new-instance v15, Landroid/graphics/Paint;

    .line 146
    .line 147
    const/4 v7, 0x3

    .line 148
    invoke-direct {v15, v7}, Landroid/graphics/Paint;-><init>(I)V

    .line 149
    .line 150
    .line 151
    new-instance v7, Landroid/graphics/BitmapShader;

    .line 152
    .line 153
    sget-object v8, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 154
    .line 155
    invoke-direct {v7, v3, v8, v8}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v15, v7}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    .line 162
    .line 163
    .line 164
    move-result v7

    .line 165
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    .line 166
    .line 167
    .line 168
    move-result v8

    .line 169
    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    .line 170
    .line 171
    .line 172
    move-result v7

    .line 173
    int-to-float v7, v7

    .line 174
    mul-float v13, v7, v5

    .line 175
    .line 176
    new-instance v8, Landroid/graphics/Canvas;

    .line 177
    .line 178
    invoke-direct {v8, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    int-to-float v11, v7

    .line 186
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    .line 187
    .line 188
    .line 189
    move-result v7

    .line 190
    int-to-float v12, v7

    .line 191
    const/4 v9, 0x0

    .line 192
    const/4 v10, 0x0

    .line 193
    move v14, v13

    .line 194
    invoke-virtual/range {v8 .. v15}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 195
    .line 196
    .line 197
    new-instance v7, Lcb/a;

    .line 198
    .line 199
    new-instance v8, Ljava/lang/ref/WeakReference;

    .line 200
    .line 201
    invoke-direct {v8, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    invoke-direct {v7, v5, v8}, Lcb/a;-><init>(FLjava/lang/ref/WeakReference;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v6, v3, v7}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    new-instance v5, Ljava/lang/ref/WeakReference;

    .line 211
    .line 212
    invoke-direct {v5, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, v4, v5}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 216
    .line 217
    .line 218
    goto :goto_3

    .line 219
    :catchall_1
    move-exception v0

    .line 220
    :try_start_2
    new-instance v4, Lsf/f;

    .line 221
    .line 222
    invoke-direct {v4, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 223
    .line 224
    .line 225
    :goto_3
    invoke-static {v4}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    if-nez v0, :cond_6

    .line 230
    .line 231
    move-object v1, v4

    .line 232
    goto :goto_4

    .line 233
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    new-instance v4, Ljava/lang/StringBuilder;

    .line 238
    .line 239
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    invoke-static {v2, v0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 250
    .line 251
    .line 252
    :goto_4
    check-cast v1, Landroid/graphics/Bitmap;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 253
    .line 254
    monitor-exit p0

    .line 255
    return-object v1

    .line 256
    :cond_7
    :goto_5
    monitor-exit p0

    .line 257
    return-object v1

    .line 258
    :goto_6
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 259
    throw v0
.end method
