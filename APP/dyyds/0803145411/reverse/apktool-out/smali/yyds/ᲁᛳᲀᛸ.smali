.class public final Lyyds/ᲁᛳᲀᛸ;
.super Lyyds/ᛱᛷᲈᛲ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᛱᲈᲁ:Ljava/lang/Object;

.field public final synthetic ᛶᛷᛲᲁ:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᲁᛳᲀᛸ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᲁᛳᲀᛸ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᛳᛸᛴᛶ(Ljava/lang/Object;)V
    .locals 8

    .line 1
    iget v0, p0, Lyyds/ᲁᛳᲀᛸ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    const v1, 0x66010011

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, Lyyds/ᲁᛳᲀᛸ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x2

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p1, Lyyds/ᛷᲀᛳᛱ;

    .line 14
    .line 15
    check-cast v2, Lyyds/ᲇᛵᲈᲈ;

    .line 16
    .line 17
    iget-object p1, v2, Lyyds/ᲇᛵᲈᲈ;->ᛷᲈᲈᲁ:Lyyds/ᛷᲀᛳᛱ;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    iget-object p1, v2, Lyyds/ᲇᛵᲈᲈ;->ᛵᛸᛸᛷ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :cond_0
    if-nez p1, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-static {p1, v1}, Lyyds/ᛴᛲᛴᛲ;->ᛲᛲᲈᲈ(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {v2, p1}, Lyyds/ᲇᛵᲈᲈ;->ᛵᛸᛸᛷ(Landroid/view/animation/Animation;)J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 43
    .line 44
    .line 45
    new-instance v5, Landroid/view/animation/AccelerateInterpolator;

    .line 46
    .line 47
    invoke-direct {v5}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v5}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 51
    .line 52
    .line 53
    iget-object v5, v2, Lyyds/ᲇᛵᲈᲈ;->ᲀᛲᛳᲀ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 54
    .line 55
    invoke-virtual {v5, p1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, v2, Lyyds/ᲇᛵᲈᲈ;->ᛵᛸᛸᛷ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    const/4 v2, 0x0

    .line 65
    invoke-virtual {p1, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    new-instance v2, Landroid/view/animation/AccelerateInterpolator;

    .line 70
    .line 71
    invoke-direct {v2}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v2}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 79
    .line 80
    .line 81
    new-array p1, v4, [F

    .line 82
    .line 83
    fill-array-data p1, :array_0

    .line 84
    .line 85
    .line 86
    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 91
    .line 92
    .line 93
    new-instance v0, Lyyds/ᲁᛱᛶᛷ;

    .line 94
    .line 95
    invoke-direct {v0, p0, v3}, Lyyds/ᲁᛱᛶᛷ;-><init>(Lyyds/ᲁᛳᲀᛸ;I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 102
    .line 103
    .line 104
    :goto_0
    return-void

    .line 105
    :pswitch_0
    check-cast p1, Lyyds/ᛵᲀᲀᛱ;

    .line 106
    .line 107
    check-cast v2, Lyyds/ᲁᛷᲇᛸ;

    .line 108
    .line 109
    iget-object p1, v2, Lyyds/ᲁᛷᲇᛸ;->ᛵᛶᛲᲀ:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast p1, Lyyds/ᛵᲀᲀᛱ;

    .line 112
    .line 113
    iget-object v0, p1, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛲᲁᲈ;

    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    iget-object v0, p1, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛲᲁᲈ;

    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    iget v0, p1, Lyyds/ᛵᲀᲀᛱ;->ᛸᛸᛷᛱ:I

    .line 124
    .line 125
    if-eqz v0, :cond_2

    .line 126
    .line 127
    move v1, v0

    .line 128
    :cond_2
    iget-object v0, p1, Lyyds/ᛵᲀᲀᛱ;->ᛷᛸᲇᛶ:Lyyds/ᛵᲀᲀᛱ;

    .line 129
    .line 130
    iget-object v0, v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᲈᲈᲁ:Landroid/content/Context;

    .line 131
    .line 132
    if-nez v0, :cond_3

    .line 133
    .line 134
    invoke-virtual {p1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    :cond_3
    invoke-static {v0, v1}, Lyyds/ᛴᛲᛴᛲ;->ᛲᛲᲈᲈ(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {v2, p1}, Lyyds/ᲁᛷᲇᛸ;->ᛵᛸᛸᛷ(Landroid/view/animation/Animation;)J

    .line 143
    .line 144
    .line 145
    move-result-wide v0

    .line 146
    new-instance v5, Landroid/view/animation/AccelerateInterpolator;

    .line 147
    .line 148
    invoke-direct {v5}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, v5}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 155
    .line 156
    .line 157
    iget-object v2, v2, Lyyds/ᲁᛷᲇᛸ;->ᲇᲇᲇᛱ:Landroid/view/View;

    .line 158
    .line 159
    check-cast v2, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 160
    .line 161
    invoke-virtual {v2, p1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 162
    .line 163
    .line 164
    new-array p1, v4, [F

    .line 165
    .line 166
    fill-array-data p1, :array_1

    .line 167
    .line 168
    .line 169
    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 174
    .line 175
    .line 176
    new-instance v0, Lyyds/ᲁᲈᲀ;

    .line 177
    .line 178
    invoke-direct {v0, p0, v3}, Lyyds/ᲁᲈᲀ;-><init>(Lyyds/ᲁᛳᲀᛸ;I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :pswitch_1
    check-cast p1, Lyyds/ᛴᛱᛱᛸ;

    .line 189
    .line 190
    check-cast v2, Lyyds/ᲇᛵᲈᛵ;

    .line 191
    .line 192
    iget-object p1, v2, Lyyds/ᲇᛵᲈᛵ;->ᛶᲈᛴᲈ:Lyyds/ᛴᛱᛱᛸ;

    .line 193
    .line 194
    iget-wide v0, p1, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲇᛱᛲ:J

    .line 195
    .line 196
    const-wide/16 v5, -0x1

    .line 197
    .line 198
    cmp-long p1, v0, v5

    .line 199
    .line 200
    if-eqz p1, :cond_4

    .line 201
    .line 202
    goto :goto_1

    .line 203
    :cond_4
    const-wide/16 v0, 0x12c

    .line 204
    .line 205
    :goto_1
    iget-object p1, v2, Lyyds/ᲇᛵᲈᛵ;->ᲀᛲᛳᲀ:Landroid/widget/RelativeLayout;

    .line 206
    .line 207
    invoke-virtual {p1}, Landroid/view/View;->getY()F

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    int-to-float v5, v5

    .line 216
    new-array v6, v4, [F

    .line 217
    .line 218
    const/4 v7, 0x0

    .line 219
    aput v2, v6, v7

    .line 220
    .line 221
    aput v5, v6, v3

    .line 222
    .line 223
    const-string v2, "y"

    .line 224
    .line 225
    invoke-static {p1, v2, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    invoke-virtual {p1, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 230
    .line 231
    .line 232
    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    .line 233
    .line 234
    .line 235
    new-array p1, v4, [F

    .line 236
    .line 237
    fill-array-data p1, :array_2

    .line 238
    .line 239
    .line 240
    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 245
    .line 246
    .line 247
    new-instance v0, Lyyds/ᛸᛳᛴ;

    .line 248
    .line 249
    invoke-direct {v0, p0, v3}, Lyyds/ᛸᛳᛴ;-><init>(Lyyds/ᲁᛳᲀᛸ;I)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 256
    .line 257
    .line 258
    return-void

    .line 259
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    :array_2
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public final ᛶᲈᛴᲈ(Ljava/lang/Object;)V
    .locals 11

    .line 1
    iget v0, p0, Lyyds/ᲁᛳᲀᛸ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    const v1, 0x66010010

    .line 4
    .line 5
    .line 6
    const-wide/16 v2, 0x12c

    .line 7
    .line 8
    const-wide/16 v4, 0x0

    .line 9
    .line 10
    iget-object v6, p0, Lyyds/ᲁᛳᲀᛸ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v7, 0x2

    .line 13
    const/4 v8, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p1, Lyyds/ᛷᲀᛳᛱ;

    .line 18
    .line 19
    check-cast v6, Lyyds/ᲇᛵᲈᲈ;

    .line 20
    .line 21
    iget-object p1, v6, Lyyds/ᲇᛵᲈᲈ;->ᛷᲈᲈᲁ:Lyyds/ᛷᲀᛳᛱ;

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0, v1}, Lyyds/ᛴᛲᛴᛲ;->ᛲᛲᲈᲈ(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    iget-object v1, v6, Lyyds/ᲇᛵᲈᲈ;->ᲀᛲᛳᲀ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    iget-object v1, v6, Lyyds/ᲇᛵᲈᲈ;->ᲀᛲᛳᲀ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 42
    .line 43
    invoke-virtual {v1}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    move-object v1, v0

    .line 49
    :goto_0
    if-eqz v1, :cond_2

    .line 50
    .line 51
    invoke-virtual {v1}, Landroid/view/animation/Animation;->getDuration()J

    .line 52
    .line 53
    .line 54
    move-result-wide v9

    .line 55
    cmp-long v9, v9, v4

    .line 56
    .line 57
    if-nez v9, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-virtual {v1}, Landroid/view/animation/Animation;->getDuration()J

    .line 61
    .line 62
    .line 63
    move-result-wide v2

    .line 64
    :cond_2
    :goto_1
    iget-wide v9, p1, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᲁᲁᲇ:J

    .line 65
    .line 66
    cmp-long p1, v9, v4

    .line 67
    .line 68
    if-ltz p1, :cond_3

    .line 69
    .line 70
    move-wide v2, v9

    .line 71
    :cond_3
    new-instance p1, Landroid/view/animation/DecelerateInterpolator;

    .line 72
    .line 73
    invoke-direct {p1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, p1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 80
    .line 81
    .line 82
    iget-object p1, v6, Lyyds/ᲇᛵᲈᲈ;->ᲀᛲᛳᲀ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 83
    .line 84
    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 85
    .line 86
    .line 87
    new-array p1, v7, [F

    .line 88
    .line 89
    fill-array-data p1, :array_0

    .line 90
    .line 91
    .line 92
    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 97
    .line 98
    .line 99
    new-instance v0, Lyyds/ᲁᛱᛶᛷ;

    .line 100
    .line 101
    invoke-direct {v0, p0, v8}, Lyyds/ᲁᛱᛶᛷ;-><init>(Lyyds/ᲁᛳᲀᛸ;I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 108
    .line 109
    .line 110
    iget-object p0, v6, Lyyds/ᲇᛵᲈᲈ;->ᛵᛸᛸᛷ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 111
    .line 112
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-virtual {p0, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    const/high16 p1, 0x3f800000    # 1.0f

    .line 121
    .line 122
    invoke-virtual {p0, p1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    new-instance p1, Landroid/view/animation/DecelerateInterpolator;

    .line 127
    .line 128
    invoke-direct {p1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, p1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    const/4 p1, 0x0

    .line 136
    invoke-virtual {p0, p1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :pswitch_0
    check-cast p1, Lyyds/ᛵᲀᲀᛱ;

    .line 141
    .line 142
    check-cast v6, Lyyds/ᲁᛷᲇᛸ;

    .line 143
    .line 144
    iget-object p1, v6, Lyyds/ᲁᛷᲇᛸ;->ᛵᛶᛲᲀ:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast p1, Lyyds/ᛵᲀᲀᛱ;

    .line 147
    .line 148
    iget-object v0, v6, Lyyds/ᲁᛷᲇᛸ;->ᲇᲇᲇᛱ:Landroid/view/View;

    .line 149
    .line 150
    check-cast v0, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 151
    .line 152
    iget-object v6, p1, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛲᲁᲈ;

    .line 153
    .line 154
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    iget-object v6, p1, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛲᲁᲈ;

    .line 158
    .line 159
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    iget v6, p1, Lyyds/ᛵᲀᲀᛱ;->ᛱᛳᛶᛳ:I

    .line 163
    .line 164
    if-eqz v6, :cond_4

    .line 165
    .line 166
    move v1, v6

    .line 167
    :cond_4
    iget-object v6, p1, Lyyds/ᛵᲀᲀᛱ;->ᛷᛸᲇᛶ:Lyyds/ᛵᲀᲀᛱ;

    .line 168
    .line 169
    iget-object v6, v6, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᲈᲈᲁ:Landroid/content/Context;

    .line 170
    .line 171
    if-nez v6, :cond_5

    .line 172
    .line 173
    invoke-virtual {p1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    :cond_5
    invoke-static {v6, v1}, Lyyds/ᛴᛲᛴᛲ;->ᛲᛲᲈᲈ(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    if-nez v1, :cond_6

    .line 182
    .line 183
    invoke-virtual {v0}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    if-eqz v6, :cond_6

    .line 188
    .line 189
    invoke-virtual {v0}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    goto :goto_2

    .line 194
    :cond_6
    move-object v6, v1

    .line 195
    :goto_2
    if-eqz v6, :cond_8

    .line 196
    .line 197
    invoke-virtual {v6}, Landroid/view/animation/Animation;->getDuration()J

    .line 198
    .line 199
    .line 200
    move-result-wide v9

    .line 201
    cmp-long v9, v9, v4

    .line 202
    .line 203
    if-nez v9, :cond_7

    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_7
    invoke-virtual {v6}, Landroid/view/animation/Animation;->getDuration()J

    .line 207
    .line 208
    .line 209
    move-result-wide v2

    .line 210
    :cond_8
    :goto_3
    iget-wide v9, p1, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᲁᲁᲇ:J

    .line 211
    .line 212
    cmp-long p1, v9, v4

    .line 213
    .line 214
    if-ltz p1, :cond_9

    .line 215
    .line 216
    move-wide v2, v9

    .line 217
    :cond_9
    invoke-virtual {v1, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 218
    .line 219
    .line 220
    new-instance p1, Landroid/view/animation/DecelerateInterpolator;

    .line 221
    .line 222
    invoke-direct {p1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v1, p1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 229
    .line 230
    .line 231
    new-array p1, v7, [F

    .line 232
    .line 233
    fill-array-data p1, :array_1

    .line 234
    .line 235
    .line 236
    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    invoke-virtual {p1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 241
    .line 242
    .line 243
    new-instance v0, Lyyds/ᲁᲈᲀ;

    .line 244
    .line 245
    invoke-direct {v0, p0, v8}, Lyyds/ᲁᲈᲀ;-><init>(Lyyds/ᲁᛳᲀᛸ;I)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 252
    .line 253
    .line 254
    return-void

    .line 255
    :pswitch_1
    check-cast p1, Lyyds/ᛴᛱᛱᛸ;

    .line 256
    .line 257
    check-cast v6, Lyyds/ᲇᛵᲈᛵ;

    .line 258
    .line 259
    iget-object v0, v6, Lyyds/ᲇᛵᲈᛵ;->ᛶᲈᛴᲈ:Lyyds/ᛴᛱᛱᛸ;

    .line 260
    .line 261
    iget-wide v9, v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᲁᲁᲇ:J

    .line 262
    .line 263
    cmp-long v1, v9, v4

    .line 264
    .line 265
    if-ltz v1, :cond_a

    .line 266
    .line 267
    move-wide v2, v9

    .line 268
    :cond_a
    iget-object v1, v6, Lyyds/ᲇᛵᲈᛵ;->ᲀᛲᛳᲀ:Landroid/widget/RelativeLayout;

    .line 269
    .line 270
    invoke-virtual {p1}, Lyyds/ᛴᛱᛱᛸ;->ᛲᲀᛲᛲ()Z

    .line 271
    .line 272
    .line 273
    move-result p1

    .line 274
    if-eqz p1, :cond_b

    .line 275
    .line 276
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    goto :goto_4

    .line 280
    :cond_b
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v1, v8, v8, v8, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 284
    .line 285
    .line 286
    :goto_4
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᛸᛴᛶ()Landroid/widget/FrameLayout;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    if-nez p1, :cond_c

    .line 291
    .line 292
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 297
    .line 298
    .line 299
    move-result-object p1

    .line 300
    iget p1, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 301
    .line 302
    :goto_5
    int-to-float p1, p1

    .line 303
    goto :goto_6

    .line 304
    :cond_c
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᛸᛴᛶ()Landroid/widget/FrameLayout;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 309
    .line 310
    .line 311
    move-result p1

    .line 312
    goto :goto_5

    .line 313
    :goto_6
    iget-object v0, v6, Lyyds/ᲇᛵᲈᛵ;->ᛵᛸᛸᛷ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 314
    .line 315
    invoke-virtual {v0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->getUnsafePlace()Landroid/graphics/Rect;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 320
    .line 321
    int-to-float v0, v0

    .line 322
    const/4 v4, 0x0

    .line 323
    add-float/2addr v0, v4

    .line 324
    iput v0, v6, Lyyds/ᲇᛵᲈᛵ;->ᛳᛸᛴᛶ:F

    .line 325
    .line 326
    new-array v4, v7, [F

    .line 327
    .line 328
    aput p1, v4, v8

    .line 329
    .line 330
    const/4 p1, 0x1

    .line 331
    aput v0, v4, p1

    .line 332
    .line 333
    const-string v0, "y"

    .line 334
    .line 335
    invoke-static {v1, v0, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v0, p1}, Landroid/animation/ObjectAnimator;->setAutoCancel(Z)V

    .line 343
    .line 344
    .line 345
    new-instance p1, Landroid/view/animation/DecelerateInterpolator;

    .line 346
    .line 347
    const/high16 v1, 0x40000000    # 2.0f

    .line 348
    .line 349
    invoke-direct {p1, v1}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v0, p1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 356
    .line 357
    .line 358
    new-array p1, v7, [F

    .line 359
    .line 360
    fill-array-data p1, :array_2

    .line 361
    .line 362
    .line 363
    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 364
    .line 365
    .line 366
    move-result-object p1

    .line 367
    invoke-virtual {p1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 368
    .line 369
    .line 370
    new-instance v0, Lyyds/ᛸᛳᛴ;

    .line 371
    .line 372
    invoke-direct {v0, p0, v8}, Lyyds/ᛸᛳᛴ;-><init>(Lyyds/ᲁᛳᲀᛸ;I)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 379
    .line 380
    .line 381
    return-void

    .line 382
    nop

    .line 383
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    :array_2
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method
