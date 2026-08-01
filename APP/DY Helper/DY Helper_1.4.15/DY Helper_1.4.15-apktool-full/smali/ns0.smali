.class public final Lns0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Ldt0;

.field public final β:Landroid/os/Handler;

.field public final γ:Landroid/graphics/Paint;

.field public final δ:[Landroid/graphics/Bitmap;

.field public ε:Landroid/graphics/Bitmap;

.field public ζ:I

.field public η:I

.field public θ:J

.field public ι:Z

.field public κ:J


# direct methods
.method public constructor <init>(Ldt0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lns0;->α:Ldt0;

    .line 5
    .line 6
    new-instance p1, Landroid/os/Handler;

    .line 7
    .line 8
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lns0;->β:Landroid/os/Handler;

    .line 16
    .line 17
    new-instance p1, Landroid/graphics/Paint;

    .line 18
    .line 19
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 20
    .line 21
    .line 22
    sget-object v0, Landroid/graphics/BlendMode;->DST_OVER:Landroid/graphics/BlendMode;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setBlendMode(Landroid/graphics/BlendMode;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lns0;->γ:Landroid/graphics/Paint;

    .line 28
    .line 29
    const/4 p1, 0x2

    .line 30
    new-array p1, p1, [Landroid/graphics/Bitmap;

    .line 31
    .line 32
    iput-object p1, p0, Lns0;->δ:[Landroid/graphics/Bitmap;

    .line 33
    .line 34
    return-void
.end method

.method public static β(Landroid/view/View;Landroid/view/View;Landroid/graphics/Rect;FILms0;)Lms0;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    move/from16 v6, p4

    .line 6
    .line 7
    move-object/from16 v1, p1

    .line 8
    .line 9
    move-object/from16 v3, p5

    .line 10
    .line 11
    if-eq v0, v1, :cond_a

    .line 12
    .line 13
    const/16 v4, 0x18

    .line 14
    .line 15
    if-gt v6, v4, :cond_a

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-nez v4, :cond_a

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-nez v4, :cond_0

    .line 28
    .line 29
    goto/16 :goto_5

    .line 30
    .line 31
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getAlpha()F

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    mul-float v4, v4, p3

    .line 36
    .line 37
    const v5, 0x3ca3d70a    # 0.02f

    .line 38
    .line 39
    .line 40
    cmpg-float v5, v4, v5

    .line 41
    .line 42
    if-gtz v5, :cond_1

    .line 43
    .line 44
    goto/16 :goto_5

    .line 45
    .line 46
    :cond_1
    instance-of v5, v0, Landroid/view/SurfaceView;

    .line 47
    .line 48
    const/4 v8, 0x0

    .line 49
    const/4 v9, 0x1

    .line 50
    if-eqz v5, :cond_5

    .line 51
    .line 52
    move-object v5, v0

    .line 53
    check-cast v5, Landroid/view/SurfaceView;

    .line 54
    .line 55
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    if-lez v10, :cond_5

    .line 60
    .line 61
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 62
    .line 63
    .line 64
    move-result v10

    .line 65
    if-lez v10, :cond_5

    .line 66
    .line 67
    const/4 v10, 0x2

    .line 68
    new-array v10, v10, [I

    .line 69
    .line 70
    invoke-virtual {v5, v10}, Landroid/view/View;->getLocationInWindow([I)V

    .line 71
    .line 72
    .line 73
    new-instance v11, Landroid/graphics/Rect;

    .line 74
    .line 75
    aget v12, v10, v8

    .line 76
    .line 77
    aget v13, v10, v9

    .line 78
    .line 79
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 80
    .line 81
    .line 82
    move-result v14

    .line 83
    add-int/2addr v14, v12

    .line 84
    aget v10, v10, v9

    .line 85
    .line 86
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 87
    .line 88
    .line 89
    move-result v15

    .line 90
    add-int/2addr v15, v10

    .line 91
    invoke-direct {v11, v12, v13, v14, v15}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 92
    .line 93
    .line 94
    new-instance v10, Landroid/graphics/Rect;

    .line 95
    .line 96
    invoke-direct {v10, v2}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v10, v11}, Landroid/graphics/Rect;->intersect(Landroid/graphics/Rect;)Z

    .line 100
    .line 101
    .line 102
    move-result v12

    .line 103
    if-eqz v12, :cond_2

    .line 104
    .line 105
    invoke-virtual {v10}, Landroid/graphics/Rect;->isEmpty()Z

    .line 106
    .line 107
    .line 108
    move-result v12

    .line 109
    if-eqz v12, :cond_3

    .line 110
    .line 111
    :cond_2
    move/from16 v16, v9

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_3
    new-instance v12, Landroid/graphics/Rect;

    .line 115
    .line 116
    iget v13, v10, Landroid/graphics/Rect;->left:I

    .line 117
    .line 118
    iget v14, v11, Landroid/graphics/Rect;->left:I

    .line 119
    .line 120
    sub-int/2addr v13, v14

    .line 121
    iget v15, v10, Landroid/graphics/Rect;->top:I

    .line 122
    .line 123
    iget v11, v11, Landroid/graphics/Rect;->top:I

    .line 124
    .line 125
    sub-int/2addr v15, v11

    .line 126
    iget v7, v10, Landroid/graphics/Rect;->right:I

    .line 127
    .line 128
    sub-int/2addr v7, v14

    .line 129
    iget v14, v10, Landroid/graphics/Rect;->bottom:I

    .line 130
    .line 131
    sub-int/2addr v14, v11

    .line 132
    invoke-direct {v12, v13, v15, v7, v14}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 133
    .line 134
    .line 135
    new-instance v7, Landroid/graphics/Rect;

    .line 136
    .line 137
    iget v11, v10, Landroid/graphics/Rect;->left:I

    .line 138
    .line 139
    iget v13, v2, Landroid/graphics/Rect;->left:I

    .line 140
    .line 141
    sub-int/2addr v11, v13

    .line 142
    iget v14, v10, Landroid/graphics/Rect;->top:I

    .line 143
    .line 144
    iget v15, v2, Landroid/graphics/Rect;->top:I

    .line 145
    .line 146
    sub-int/2addr v14, v15

    .line 147
    move/from16 v16, v9

    .line 148
    .line 149
    iget v9, v10, Landroid/graphics/Rect;->right:I

    .line 150
    .line 151
    sub-int/2addr v9, v13

    .line 152
    iget v13, v10, Landroid/graphics/Rect;->bottom:I

    .line 153
    .line 154
    sub-int/2addr v13, v15

    .line 155
    invoke-direct {v7, v11, v14, v9, v13}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 156
    .line 157
    .line 158
    new-instance v9, Lms0;

    .line 159
    .line 160
    invoke-virtual {v10}, Landroid/graphics/Rect;->width()I

    .line 161
    .line 162
    .line 163
    move-result v11

    .line 164
    invoke-static {v8, v11}, Ljava/lang/Math;->max(II)I

    .line 165
    .line 166
    .line 167
    move-result v11

    .line 168
    invoke-virtual {v10}, Landroid/graphics/Rect;->height()I

    .line 169
    .line 170
    .line 171
    move-result v10

    .line 172
    invoke-static {v8, v10}, Ljava/lang/Math;->max(II)I

    .line 173
    .line 174
    .line 175
    move-result v10

    .line 176
    mul-int/2addr v10, v11

    .line 177
    invoke-direct {v9, v5, v12, v7, v10}, Lms0;-><init>(Landroid/view/SurfaceView;Landroid/graphics/Rect;Landroid/graphics/Rect;I)V

    .line 178
    .line 179
    .line 180
    goto :goto_1

    .line 181
    :goto_0
    const/4 v9, 0x0

    .line 182
    :goto_1
    if-eqz v9, :cond_6

    .line 183
    .line 184
    if-eqz v3, :cond_4

    .line 185
    .line 186
    iget v5, v9, Lms0;->δ:I

    .line 187
    .line 188
    iget v7, v3, Lms0;->δ:I

    .line 189
    .line 190
    if-le v5, v7, :cond_6

    .line 191
    .line 192
    :cond_4
    move-object v3, v9

    .line 193
    goto :goto_2

    .line 194
    :cond_5
    move/from16 v16, v9

    .line 195
    .line 196
    :cond_6
    :goto_2
    instance-of v5, v0, Landroid/view/ViewGroup;

    .line 197
    .line 198
    if-eqz v5, :cond_7

    .line 199
    .line 200
    move-object v7, v0

    .line 201
    check-cast v7, Landroid/view/ViewGroup;

    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_7
    const/4 v7, 0x0

    .line 205
    :goto_3
    if-nez v7, :cond_8

    .line 206
    .line 207
    return-object v3

    .line 208
    :cond_8
    invoke-virtual {v7}, Landroid/view/ViewGroup;->getChildCount()I

    .line 209
    .line 210
    .line 211
    move-result v9

    .line 212
    move-object v5, v3

    .line 213
    :goto_4
    if-ge v8, v9, :cond_9

    .line 214
    .line 215
    invoke-virtual {v7, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    move v3, v4

    .line 223
    add-int/lit8 v4, v6, 0x1

    .line 224
    .line 225
    invoke-static/range {v0 .. v5}, Lns0;->β(Landroid/view/View;Landroid/view/View;Landroid/graphics/Rect;FILms0;)Lms0;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    add-int/lit8 v8, v8, 0x1

    .line 230
    .line 231
    move-object/from16 v1, p1

    .line 232
    .line 233
    move-object/from16 v2, p2

    .line 234
    .line 235
    move v4, v3

    .line 236
    goto :goto_4

    .line 237
    :cond_9
    return-object v5

    .line 238
    :cond_a
    :goto_5
    return-object v3
.end method


# virtual methods
.method public final α(Landroid/view/View;Landroid/view/View;ZFLwa;)V
    .locals 16

    .line 1
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1f

    .line 7
    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_d

    .line 11
    .line 12
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    new-instance v0, Ljs0;

    .line 27
    .line 28
    move-object/from16 v1, p0

    .line 29
    .line 30
    move-object/from16 v2, p1

    .line 31
    .line 32
    move-object/from16 v3, p2

    .line 33
    .line 34
    move/from16 v4, p3

    .line 35
    .line 36
    move/from16 v5, p4

    .line 37
    .line 38
    move-object/from16 v6, p5

    .line 39
    .line 40
    invoke-direct/range {v0 .. v6}, Ljs0;-><init>(Lns0;Landroid/view/View;Landroid/view/View;ZFLwa;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    move-object/from16 v7, p0

    .line 48
    .line 49
    move-object/from16 v3, p2

    .line 50
    .line 51
    invoke-virtual {v3}, Landroid/view/View;->isAttachedToWindow()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_16

    .line 56
    .line 57
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-lez v0, :cond_16

    .line 62
    .line 63
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-gtz v0, :cond_2

    .line 68
    .line 69
    goto/16 :goto_d

    .line 70
    .line 71
    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 72
    .line 73
    .line 74
    move-result-wide v1

    .line 75
    iget-boolean v0, v7, Lns0;->ι:Z

    .line 76
    .line 77
    if-nez v0, :cond_16

    .line 78
    .line 79
    if-nez p3, :cond_3

    .line 80
    .line 81
    iget-wide v4, v7, Lns0;->θ:J

    .line 82
    .line 83
    sub-long v4, v1, v4

    .line 84
    .line 85
    const-wide/16 v8, 0x60

    .line 86
    .line 87
    cmp-long v0, v4, v8

    .line 88
    .line 89
    if-gez v0, :cond_3

    .line 90
    .line 91
    goto/16 :goto_d

    .line 92
    .line 93
    :cond_3
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 102
    .line 103
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    move/from16 v6, p4

    .line 112
    .line 113
    invoke-static {v0, v6, v4, v5}, Lxb;->Φ(FFII)Ltt0;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    if-nez v8, :cond_4

    .line 118
    .line 119
    goto/16 :goto_d

    .line 120
    .line 121
    :cond_4
    iget v4, v8, Ltt0;->β:I

    .line 122
    .line 123
    iget v5, v8, Ltt0;->δ:I

    .line 124
    .line 125
    iget v6, v8, Ltt0;->α:I

    .line 126
    .line 127
    iget v9, v8, Ltt0;->γ:I

    .line 128
    .line 129
    sub-int v0, v9, v6

    .line 130
    .line 131
    sub-int v10, v5, v4

    .line 132
    .line 133
    iget-object v11, v7, Lns0;->δ:[Landroid/graphics/Bitmap;

    .line 134
    .line 135
    iget-object v12, v7, Lns0;->α:Ldt0;

    .line 136
    .line 137
    if-lez v0, :cond_a

    .line 138
    .line 139
    if-gtz v10, :cond_5

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_5
    :try_start_0
    iget v14, v7, Lns0;->ζ:I

    .line 143
    .line 144
    aget-object v15, v11, v14

    .line 145
    .line 146
    if-eqz v15, :cond_6

    .line 147
    .line 148
    invoke-virtual {v15}, Landroid/graphics/Bitmap;->getWidth()I

    .line 149
    .line 150
    .line 151
    move-result v13

    .line 152
    if-ne v13, v0, :cond_6

    .line 153
    .line 154
    invoke-virtual {v15}, Landroid/graphics/Bitmap;->getHeight()I

    .line 155
    .line 156
    .line 157
    move-result v13

    .line 158
    if-eq v13, v10, :cond_7

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :catchall_0
    move-exception v0

    .line 162
    goto :goto_1

    .line 163
    :cond_6
    :goto_0
    sget-object v13, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 164
    .line 165
    invoke-static {v0, v10, v13}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 166
    .line 167
    .line 168
    move-result-object v15

    .line 169
    aput-object v15, v11, v14

    .line 170
    .line 171
    :cond_7
    new-instance v0, Lls0;

    .line 172
    .line 173
    invoke-direct {v0, v14, v15}, Lls0;-><init>(ILandroid/graphics/Bitmap;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :goto_1
    new-instance v10, Leo1;

    .line 178
    .line 179
    invoke-direct {v10, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 180
    .line 181
    .line 182
    move-object v0, v10

    .line 183
    :goto_2
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    if-eqz v10, :cond_8

    .line 188
    .line 189
    const-string v11, "allocate_backdrop"

    .line 190
    .line 191
    invoke-virtual {v12, v11, v10}, Ldt0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    :cond_8
    instance-of v10, v0, Leo1;

    .line 195
    .line 196
    if-eqz v10, :cond_9

    .line 197
    .line 198
    const/4 v0, 0x0

    .line 199
    :cond_9
    check-cast v0, Lls0;

    .line 200
    .line 201
    move-object v10, v0

    .line 202
    goto :goto_4

    .line 203
    :cond_a
    :goto_3
    const/4 v10, 0x0

    .line 204
    :goto_4
    if-nez v10, :cond_b

    .line 205
    .line 206
    goto/16 :goto_d

    .line 207
    .line 208
    :cond_b
    iput-wide v1, v7, Lns0;->θ:J

    .line 209
    .line 210
    const/4 v0, 0x2

    .line 211
    new-array v0, v0, [I

    .line 212
    .line 213
    invoke-virtual {v3, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 214
    .line 215
    .line 216
    new-instance v3, Landroid/graphics/Rect;

    .line 217
    .line 218
    const/4 v11, 0x0

    .line 219
    aget v1, v0, v11

    .line 220
    .line 221
    add-int/2addr v6, v1

    .line 222
    const/4 v13, 0x1

    .line 223
    aget v0, v0, v13

    .line 224
    .line 225
    add-int/2addr v4, v0

    .line 226
    add-int/2addr v1, v9

    .line 227
    add-int/2addr v0, v5

    .line 228
    invoke-direct {v3, v6, v4, v1, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 229
    .line 230
    .line 231
    const/4 v5, 0x0

    .line 232
    const/4 v6, 0x0

    .line 233
    const/high16 v4, 0x3f800000    # 1.0f

    .line 234
    .line 235
    move-object/from16 v1, p1

    .line 236
    .line 237
    move-object/from16 v2, p2

    .line 238
    .line 239
    invoke-static/range {v1 .. v6}, Lns0;->β(Landroid/view/View;Landroid/view/View;Landroid/graphics/Rect;FILms0;)Lms0;

    .line 240
    .line 241
    .line 242
    move-result-object v9

    .line 243
    if-eqz v9, :cond_c

    .line 244
    .line 245
    iget-object v0, v9, Lms0;->γ:Landroid/graphics/Rect;

    .line 246
    .line 247
    iget-object v14, v9, Lms0;->α:Landroid/view/SurfaceView;

    .line 248
    .line 249
    invoke-virtual {v14}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    invoke-interface {v1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    invoke-virtual {v1}, Landroid/view/Surface;->isValid()Z

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    if-nez v1, :cond_d

    .line 262
    .line 263
    :cond_c
    move-object v4, v8

    .line 264
    move-object v5, v10

    .line 265
    goto/16 :goto_c

    .line 266
    .line 267
    :cond_d
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    if-lez v1, :cond_14

    .line 276
    .line 277
    if-gtz v0, :cond_e

    .line 278
    .line 279
    goto :goto_8

    .line 280
    :cond_e
    :try_start_1
    iget-object v2, v7, Lns0;->ε:Landroid/graphics/Bitmap;

    .line 281
    .line 282
    if-eqz v2, :cond_10

    .line 283
    .line 284
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 285
    .line 286
    .line 287
    move-result v3

    .line 288
    if-ne v3, v1, :cond_f

    .line 289
    .line 290
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    if-ne v3, v0, :cond_f

    .line 295
    .line 296
    goto :goto_5

    .line 297
    :catchall_1
    move-exception v0

    .line 298
    goto :goto_6

    .line 299
    :cond_f
    const/4 v2, 0x0

    .line 300
    :goto_5
    if-nez v2, :cond_11

    .line 301
    .line 302
    :cond_10
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 303
    .line 304
    invoke-static {v1, v0, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    iput-object v2, v7, Lns0;->ε:Landroid/graphics/Bitmap;

    .line 309
    .line 310
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 311
    .line 312
    .line 313
    goto :goto_7

    .line 314
    :goto_6
    new-instance v2, Leo1;

    .line 315
    .line 316
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 317
    .line 318
    .line 319
    :cond_11
    :goto_7
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    if-eqz v0, :cond_12

    .line 324
    .line 325
    const-string v1, "allocate_surface"

    .line 326
    .line 327
    invoke-virtual {v12, v1, v0}, Ldt0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    :cond_12
    instance-of v0, v2, Leo1;

    .line 331
    .line 332
    if-eqz v0, :cond_13

    .line 333
    .line 334
    const/4 v2, 0x0

    .line 335
    :cond_13
    move-object v0, v2

    .line 336
    check-cast v0, Landroid/graphics/Bitmap;

    .line 337
    .line 338
    goto :goto_9

    .line 339
    :cond_14
    :goto_8
    const/4 v0, 0x0

    .line 340
    :goto_9
    if-nez v0, :cond_15

    .line 341
    .line 342
    const/4 v7, 0x0

    .line 343
    const/4 v6, 0x0

    .line 344
    move-object/from16 v1, p0

    .line 345
    .line 346
    move-object/from16 v2, p1

    .line 347
    .line 348
    move-object/from16 v3, p2

    .line 349
    .line 350
    move-object v4, v8

    .line 351
    move-object v5, v10

    .line 352
    move-object/from16 v8, p5

    .line 353
    .line 354
    invoke-virtual/range {v1 .. v8}, Lns0;->γ(Landroid/view/View;Landroid/view/View;Ltt0;Lls0;Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lwa;)V

    .line 355
    .line 356
    .line 357
    goto/16 :goto_d

    .line 358
    .line 359
    :cond_15
    move-object v1, v7

    .line 360
    move-object v4, v8

    .line 361
    move-object v5, v10

    .line 362
    iget-wide v2, v1, Lns0;->κ:J

    .line 363
    .line 364
    iput-boolean v13, v1, Lns0;->ι:Z

    .line 365
    .line 366
    :try_start_2
    iget-object v13, v9, Lms0;->β:Landroid/graphics/Rect;

    .line 367
    .line 368
    move-object v8, v0

    .line 369
    new-instance v0, Lks0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 370
    .line 371
    move-wide v6, v2

    .line 372
    move-object v3, v1

    .line 373
    move-wide v1, v6

    .line 374
    move-object/from16 v10, p5

    .line 375
    .line 376
    move-object v6, v4

    .line 377
    move-object v7, v5

    .line 378
    move-object/from16 v5, p1

    .line 379
    .line 380
    move-object/from16 v4, p2

    .line 381
    .line 382
    :try_start_3
    invoke-direct/range {v0 .. v10}, Lks0;-><init>(JLns0;Landroid/view/View;Landroid/view/View;Ltt0;Lls0;Landroid/graphics/Bitmap;Lms0;Lwa;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 383
    .line 384
    .line 385
    move-wide v4, v1

    .line 386
    move-object v1, v3

    .line 387
    move-wide v2, v4

    .line 388
    move-object v4, v6

    .line 389
    move-object v5, v7

    .line 390
    :try_start_4
    iget-object v6, v1, Lns0;->β:Landroid/os/Handler;

    .line 391
    .line 392
    invoke-static {v14, v13, v8, v0, v6}, Landroid/view/PixelCopy;->request(Landroid/view/SurfaceView;Landroid/graphics/Rect;Landroid/graphics/Bitmap;Landroid/view/PixelCopy$OnPixelCopyFinishedListener;Landroid/os/Handler;)V

    .line 393
    .line 394
    .line 395
    sget-object v0, Ls62;->α:Ls62;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 396
    .line 397
    goto :goto_b

    .line 398
    :catchall_2
    move-exception v0

    .line 399
    goto :goto_a

    .line 400
    :catchall_3
    move-exception v0

    .line 401
    move-wide v4, v1

    .line 402
    move-object v1, v3

    .line 403
    move-wide v2, v4

    .line 404
    move-object v4, v6

    .line 405
    move-object v5, v7

    .line 406
    :goto_a
    new-instance v6, Leo1;

    .line 407
    .line 408
    invoke-direct {v6, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 409
    .line 410
    .line 411
    move-object v0, v6

    .line 412
    :goto_b
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    if-eqz v0, :cond_16

    .line 417
    .line 418
    iget-wide v6, v1, Lns0;->κ:J

    .line 419
    .line 420
    cmp-long v2, v2, v6

    .line 421
    .line 422
    if-nez v2, :cond_16

    .line 423
    .line 424
    iput-boolean v11, v1, Lns0;->ι:Z

    .line 425
    .line 426
    const-string v2, "pixel_copy_request"

    .line 427
    .line 428
    invoke-virtual {v12, v2, v0}, Ldt0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    const/4 v7, 0x0

    .line 432
    const/4 v6, 0x0

    .line 433
    move-object/from16 v2, p1

    .line 434
    .line 435
    move-object/from16 v3, p2

    .line 436
    .line 437
    move-object/from16 v8, p5

    .line 438
    .line 439
    invoke-virtual/range {v1 .. v8}, Lns0;->γ(Landroid/view/View;Landroid/view/View;Ltt0;Lls0;Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lwa;)V

    .line 440
    .line 441
    .line 442
    goto :goto_d

    .line 443
    :goto_c
    const/4 v7, 0x0

    .line 444
    const/4 v6, 0x0

    .line 445
    move-object/from16 v1, p0

    .line 446
    .line 447
    move-object/from16 v2, p1

    .line 448
    .line 449
    move-object/from16 v3, p2

    .line 450
    .line 451
    move-object/from16 v8, p5

    .line 452
    .line 453
    invoke-virtual/range {v1 .. v8}, Lns0;->γ(Landroid/view/View;Landroid/view/View;Ltt0;Lls0;Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lwa;)V

    .line 454
    .line 455
    .line 456
    :cond_16
    :goto_d
    return-void
.end method

.method public final γ(Landroid/view/View;Landroid/view/View;Ltt0;Lls0;Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lwa;)V
    .locals 8

    .line 1
    :try_start_0
    iget-object v5, p4, Lls0;->β:Landroid/graphics/Bitmap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-object v2, p1

    .line 5
    move-object v3, p2

    .line 6
    move-object v4, p3

    .line 7
    move-object v6, p5

    .line 8
    move-object v7, p6

    .line 9
    :try_start_1
    invoke-virtual/range {v1 .. v7}, Lns0;->δ(Landroid/view/View;Landroid/view/View;Ltt0;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Rect;)V

    .line 10
    .line 11
    .line 12
    iget p0, p4, Lls0;->α:I

    .line 13
    .line 14
    add-int/lit8 p0, p0, 0x1

    .line 15
    .line 16
    iget-object p1, v1, Lns0;->δ:[Landroid/graphics/Bitmap;

    .line 17
    .line 18
    array-length p1, p1

    .line 19
    rem-int/2addr p0, p1

    .line 20
    iput p0, v1, Lns0;->ζ:I

    .line 21
    .line 22
    iget p0, v1, Lns0;->η:I

    .line 23
    .line 24
    add-int/lit8 p0, p0, 0x1

    .line 25
    .line 26
    iput p0, v1, Lns0;->η:I

    .line 27
    .line 28
    iget-object p3, p4, Lls0;->β:Landroid/graphics/Bitmap;

    .line 29
    .line 30
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object p1, p7, Lwa;->η:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Lgt0;

    .line 36
    .line 37
    iget-object p2, p7, Lwa;->ζ:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p2, Lcom/example/dyhelper/hook/bottombar/LiquidGlassTouchRoutingLayout;

    .line 40
    .line 41
    iget-boolean p4, p1, Lgt0;->ι:Z

    .line 42
    .line 43
    if-eqz p4, :cond_1

    .line 44
    .line 45
    iget-object p4, p1, Lgt0;->κ:Lcom/example/dyhelper/hook/bottombar/LiquidGlassTouchRoutingLayout;

    .line 46
    .line 47
    if-eq p4, p2, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    iget-object v0, p1, Lgt0;->ε:Lx91;

    .line 51
    .line 52
    invoke-virtual {v0}, Lx91;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, Lps0;

    .line 57
    .line 58
    const/4 p6, 0x0

    .line 59
    const/16 p7, 0x19

    .line 60
    .line 61
    const/4 p2, 0x0

    .line 62
    const/4 p5, 0x0

    .line 63
    move p4, p0

    .line 64
    invoke-static/range {p1 .. p7}, Lps0;->α(Lps0;Ljava/util/ArrayList;Landroid/graphics/Bitmap;IZFI)Lps0;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {v0, p0}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    :goto_0
    sget-object p0, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :catchall_0
    move-exception v0

    .line 75
    :goto_1
    move-object p0, v0

    .line 76
    goto :goto_2

    .line 77
    :catchall_1
    move-exception v0

    .line 78
    move-object v1, p0

    .line 79
    goto :goto_1

    .line 80
    :goto_2
    new-instance p1, Leo1;

    .line 81
    .line 82
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    move-object p0, p1

    .line 86
    :goto_3
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    if-eqz p0, :cond_2

    .line 91
    .line 92
    iget-object p1, v1, Lns0;->α:Ldt0;

    .line 93
    .line 94
    const-string p2, "canvas_capture"

    .line 95
    .line 96
    invoke-virtual {p1, p2, p0}, Ldt0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    :cond_2
    return-void
.end method

.method public final δ(Landroid/view/View;Landroid/view/View;Ltt0;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Rect;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p4, v0}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 3
    .line 4
    .line 5
    new-instance v1, Landroid/graphics/Canvas;

    .line 6
    .line 7
    invoke-direct {v1, p4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 8
    .line 9
    .line 10
    const/4 p4, 0x2

    .line 11
    new-array v2, p4, [I

    .line 12
    .line 13
    new-array p4, p4, [I

    .line 14
    .line 15
    invoke-virtual {p1, v2}, Landroid/view/View;->getLocationInWindow([I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2, p4}, Landroid/view/View;->getLocationInWindow([I)V

    .line 19
    .line 20
    .line 21
    aget v3, p4, v0

    .line 22
    .line 23
    iget v4, p3, Ltt0;->α:I

    .line 24
    .line 25
    add-int/2addr v3, v4

    .line 26
    const/4 v4, 0x1

    .line 27
    aget p4, p4, v4

    .line 28
    .line 29
    iget p3, p3, Ltt0;->β:I

    .line 30
    .line 31
    add-int/2addr p4, p3

    .line 32
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    const/4 v6, 0x4

    .line 41
    invoke-virtual {p2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 42
    .line 43
    .line 44
    :try_start_0
    aget v0, v2, v0

    .line 45
    .line 46
    sub-int/2addr v0, v3

    .line 47
    int-to-float v0, v0

    .line 48
    aget v2, v2, v4

    .line 49
    .line 50
    sub-int/2addr v2, p4

    .line 51
    int-to-float p4, v2

    .line 52
    invoke-virtual {v1, v0, p4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, p3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 62
    .line 63
    .line 64
    if-eqz p5, :cond_0

    .line 65
    .line 66
    if-eqz p6, :cond_0

    .line 67
    .line 68
    const/4 p1, 0x0

    .line 69
    iget-object p0, p0, Lns0;->γ:Landroid/graphics/Paint;

    .line 70
    .line 71
    invoke-virtual {v1, p5, p1, p6, p0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 72
    .line 73
    .line 74
    :cond_0
    return-void

    .line 75
    :catchall_0
    move-exception p0

    .line 76
    invoke-virtual {v1, p3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 80
    .line 81
    .line 82
    throw p0
.end method
