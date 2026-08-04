.class public Lyyds/ᛱᛱᛴᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᛳᲇ:F

.field public ᛱᲈᲁ:Z

.field public ᛲᛲᲈᲈ:Z

.field public final ᛲᛳᛶᲁ:Landroid/view/animation/LinearInterpolator;

.field public ᛲᛴᛳᛲ:Z

.field public ᛲᲈᲁ:I

.field public ᛳᲁᲁᲇ:I

.field public ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

.field public final ᛶᛷᛲᲁ:Lyyds/ᛳᛶᲇᲁ;

.field public ᛷᛲᲈᛱ:Landroid/graphics/PointF;

.field public final ᛷᛵᲇᲀ:Landroid/util/DisplayMetrics;

.field public final ᛷᲈᲈᲁ:Landroid/view/animation/DecelerateInterpolator;

.field public ᲀᛲᛳᲀ:Lyyds/ᲇᲇᛵᛲ;

.field public ᲇᛱᛲ:I

.field public ᲇᲇᲇᛱ:Landroid/view/View;

.field public ᲇᲈᛵᛷ:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lyyds/ᛱᛱᛴᲁ;->ᛲᲈᲁ:I

    .line 6
    .line 7
    new-instance v1, Lyyds/ᛳᛶᲇᲁ;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput v0, v1, Lyyds/ᛳᛶᲇᲁ;->ᲇᲈᛵᛷ:I

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, v1, Lyyds/ᛳᛶᲇᲁ;->ᲇᲇᲇᛱ:Z

    .line 16
    .line 17
    iput v0, v1, Lyyds/ᛳᛶᲇᲁ;->ᛶᛷᛲᲁ:I

    .line 18
    .line 19
    iput v0, v1, Lyyds/ᛳᛶᲇᲁ;->ᛲᲈᲁ:I

    .line 20
    .line 21
    iput v0, v1, Lyyds/ᛳᛶᲇᲁ;->ᛵᛸᛸᛷ:I

    .line 22
    .line 23
    const/high16 v2, -0x80000000

    .line 24
    .line 25
    iput v2, v1, Lyyds/ᛳᛶᲇᲁ;->ᲀᛲᛳᲀ:I

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    iput-object v2, v1, Lyyds/ᛳᛶᲇᲁ;->ᛲᛴᛳᛲ:Landroid/view/animation/BaseInterpolator;

    .line 29
    .line 30
    iput-object v1, p0, Lyyds/ᛱᛱᛴᲁ;->ᛶᛷᛲᲁ:Lyyds/ᛳᛶᲇᲁ;

    .line 31
    .line 32
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    .line 33
    .line 34
    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Lyyds/ᛱᛱᛴᲁ;->ᛲᛳᛶᲁ:Landroid/view/animation/LinearInterpolator;

    .line 38
    .line 39
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    .line 40
    .line 41
    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lyyds/ᛱᛱᛴᲁ;->ᛷᲈᲈᲁ:Landroid/view/animation/DecelerateInterpolator;

    .line 45
    .line 46
    iput-boolean v0, p0, Lyyds/ᛱᛱᛴᲁ;->ᛲᛲᲈᲈ:Z

    .line 47
    .line 48
    iput v0, p0, Lyyds/ᛱᛱᛴᲁ;->ᛳᲁᲁᲇ:I

    .line 49
    .line 50
    iput v0, p0, Lyyds/ᛱᛱᛴᲁ;->ᲇᛱᛲ:I

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iput-object p1, p0, Lyyds/ᛱᛱᛴᲁ;->ᛷᛵᲇᲀ:Landroid/util/DisplayMetrics;

    .line 61
    .line 62
    return-void
.end method

.method public static ᛲᲈᲁ(IIIII)I
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eq p4, v0, :cond_4

    .line 3
    .line 4
    if-eqz p4, :cond_1

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    if-ne p4, p0, :cond_0

    .line 8
    .line 9
    sub-int/2addr p3, p1

    .line 10
    return p3

    .line 11
    :cond_0
    const-string p0, "snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_"

    .line 12
    .line 13
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_1
    sub-int/2addr p2, p0

    .line 19
    if-lez p2, :cond_2

    .line 20
    .line 21
    return p2

    .line 22
    :cond_2
    sub-int/2addr p3, p1

    .line 23
    if-gez p3, :cond_3

    .line 24
    .line 25
    return p3

    .line 26
    :cond_3
    const/4 p0, 0x0

    .line 27
    return p0

    .line 28
    :cond_4
    sub-int/2addr p2, p0

    .line 29
    return p2
.end method


# virtual methods
.method public final ᛲᛴᛳᛲ(II)V
    .locals 8

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛱᛴᲁ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 2
    .line 3
    iget v1, p0, Lyyds/ᛱᛱᛴᲁ;->ᛲᲈᲁ:I

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    if-eq v1, v2, :cond_0

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lyyds/ᛱᛱᛴᲁ;->ᛶᛷᛲᲁ()V

    .line 11
    .line 12
    .line 13
    :cond_1
    iget-boolean v1, p0, Lyyds/ᛱᛱᛴᲁ;->ᲇᲈᛵᛷ:Z

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    if-eqz v1, :cond_3

    .line 18
    .line 19
    iget-object v1, p0, Lyyds/ᛱᛱᛴᲁ;->ᲇᲇᲇᛱ:Landroid/view/View;

    .line 20
    .line 21
    if-nez v1, :cond_3

    .line 22
    .line 23
    iget-object v1, p0, Lyyds/ᛱᛱᛴᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲇᲇᛵᛲ;

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    iget v1, p0, Lyyds/ᛱᛱᛴᲁ;->ᛲᲈᲁ:I

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lyyds/ᛱᛱᛴᲁ;->ᲇᲈᛵᛷ(I)Landroid/graphics/PointF;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    iget v5, v1, Landroid/graphics/PointF;->x:F

    .line 36
    .line 37
    cmpl-float v6, v5, v4

    .line 38
    .line 39
    if-nez v6, :cond_2

    .line 40
    .line 41
    iget v6, v1, Landroid/graphics/PointF;->y:F

    .line 42
    .line 43
    cmpl-float v6, v6, v4

    .line 44
    .line 45
    if-eqz v6, :cond_3

    .line 46
    .line 47
    :cond_2
    invoke-static {v5}, Ljava/lang/Math;->signum(F)F

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    float-to-int v5, v5

    .line 52
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 53
    .line 54
    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    float-to-int v1, v1

    .line 59
    invoke-virtual {v0, v5, v1, v3}, Lyyds/ᛵᲇᛲᛱ;->ᛸᲀᛷᛲ(II[I)V

    .line 60
    .line 61
    .line 62
    :cond_3
    const/4 v1, 0x0

    .line 63
    iput-boolean v1, p0, Lyyds/ᛱᛱᛴᲁ;->ᲇᲈᛵᛷ:Z

    .line 64
    .line 65
    iget-object v5, p0, Lyyds/ᛱᛱᛴᲁ;->ᲇᲇᲇᛱ:Landroid/view/View;

    .line 66
    .line 67
    iget-object v6, p0, Lyyds/ᛱᛱᛴᲁ;->ᛶᛷᛲᲁ:Lyyds/ᛳᛶᲇᲁ;

    .line 68
    .line 69
    if-eqz v5, :cond_6

    .line 70
    .line 71
    iget-object v7, p0, Lyyds/ᛱᛱᛴᲁ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 72
    .line 73
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-static {v5}, Lyyds/ᛵᲇᛲᛱ;->ᛸᛴᛵᛶ(Landroid/view/View;)Lyyds/ᛱᛸᛳᛵ;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    if-eqz v5, :cond_4

    .line 81
    .line 82
    invoke-virtual {v5}, Lyyds/ᛱᛸᛳᛵ;->ᲇᲈᛵᛷ()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    :cond_4
    iget v5, p0, Lyyds/ᛱᛱᛴᲁ;->ᛲᲈᲁ:I

    .line 87
    .line 88
    if-ne v2, v5, :cond_5

    .line 89
    .line 90
    iget-object v2, p0, Lyyds/ᛱᛱᛴᲁ;->ᲇᲇᲇᛱ:Landroid/view/View;

    .line 91
    .line 92
    iget-object v3, v0, Lyyds/ᛵᲇᛲᛱ;->ᛸᲀᛷᛲ:Lyyds/ᲈᛳᲇᛲ;

    .line 93
    .line 94
    invoke-virtual {p0, v2, v6}, Lyyds/ᛱᛱᛴᲁ;->ᲇᲇᲇᛱ(Landroid/view/View;Lyyds/ᛳᛶᲇᲁ;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v6, v0}, Lyyds/ᛳᛶᲇᲁ;->ᛲᲈᲁ(Lyyds/ᛵᲇᛲᛱ;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Lyyds/ᛱᛱᛴᲁ;->ᛶᛷᛲᲁ()V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_5
    const-string v2, "RecyclerView"

    .line 105
    .line 106
    const-string v5, "Passed over target position while smooth scrolling."

    .line 107
    .line 108
    invoke-static {v2, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    iput-object v3, p0, Lyyds/ᛱᛱᛴᲁ;->ᲇᲇᲇᛱ:Landroid/view/View;

    .line 112
    .line 113
    :cond_6
    :goto_0
    iget-boolean v2, p0, Lyyds/ᛱᛱᛴᲁ;->ᛲᛴᛳᛲ:Z

    .line 114
    .line 115
    if-eqz v2, :cond_e

    .line 116
    .line 117
    iget-object v2, v0, Lyyds/ᛵᲇᛲᛱ;->ᛸᲀᛷᛲ:Lyyds/ᲈᛳᲇᛲ;

    .line 118
    .line 119
    iget-object v2, p0, Lyyds/ᛱᛱᛴᲁ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 120
    .line 121
    iget-object v2, v2, Lyyds/ᛵᲇᛲᛱ;->ᲇᛱᛲ:Lyyds/ᲇᲇᛵᛲ;

    .line 122
    .line 123
    invoke-virtual {v2}, Lyyds/ᲇᲇᛵᛲ;->ᛶᛸᲀᲁ()I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    const/4 v3, 0x1

    .line 128
    if-nez v2, :cond_7

    .line 129
    .line 130
    invoke-virtual {p0}, Lyyds/ᛱᛱᛴᲁ;->ᛶᛷᛲᲁ()V

    .line 131
    .line 132
    .line 133
    goto/16 :goto_2

    .line 134
    .line 135
    :cond_7
    iget v2, p0, Lyyds/ᛱᛱᛴᲁ;->ᛳᲁᲁᲇ:I

    .line 136
    .line 137
    sub-int p1, v2, p1

    .line 138
    .line 139
    mul-int/2addr v2, p1

    .line 140
    if-gtz v2, :cond_8

    .line 141
    .line 142
    move p1, v1

    .line 143
    :cond_8
    iput p1, p0, Lyyds/ᛱᛱᛴᲁ;->ᛳᲁᲁᲇ:I

    .line 144
    .line 145
    iget v2, p0, Lyyds/ᛱᛱᛴᲁ;->ᲇᛱᛲ:I

    .line 146
    .line 147
    sub-int p2, v2, p2

    .line 148
    .line 149
    mul-int/2addr v2, p2

    .line 150
    if-gtz v2, :cond_9

    .line 151
    .line 152
    move p2, v1

    .line 153
    :cond_9
    iput p2, p0, Lyyds/ᛱᛱᛴᲁ;->ᲇᛱᛲ:I

    .line 154
    .line 155
    if-nez p1, :cond_c

    .line 156
    .line 157
    if-nez p2, :cond_c

    .line 158
    .line 159
    iget p1, p0, Lyyds/ᛱᛱᛴᲁ;->ᛲᲈᲁ:I

    .line 160
    .line 161
    invoke-virtual {p0, p1}, Lyyds/ᛱᛱᛴᲁ;->ᲇᲈᛵᛷ(I)Landroid/graphics/PointF;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    if-eqz p1, :cond_b

    .line 166
    .line 167
    iget p2, p1, Landroid/graphics/PointF;->x:F

    .line 168
    .line 169
    cmpl-float v2, p2, v4

    .line 170
    .line 171
    if-nez v2, :cond_a

    .line 172
    .line 173
    iget v2, p1, Landroid/graphics/PointF;->y:F

    .line 174
    .line 175
    cmpl-float v2, v2, v4

    .line 176
    .line 177
    if-nez v2, :cond_a

    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_a
    mul-float/2addr p2, p2

    .line 181
    iget v2, p1, Landroid/graphics/PointF;->y:F

    .line 182
    .line 183
    mul-float/2addr v2, v2

    .line 184
    add-float/2addr v2, p2

    .line 185
    float-to-double v4, v2

    .line 186
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    .line 187
    .line 188
    .line 189
    move-result-wide v4

    .line 190
    double-to-float p2, v4

    .line 191
    iget v2, p1, Landroid/graphics/PointF;->x:F

    .line 192
    .line 193
    div-float/2addr v2, p2

    .line 194
    iput v2, p1, Landroid/graphics/PointF;->x:F

    .line 195
    .line 196
    iget v4, p1, Landroid/graphics/PointF;->y:F

    .line 197
    .line 198
    div-float/2addr v4, p2

    .line 199
    iput v4, p1, Landroid/graphics/PointF;->y:F

    .line 200
    .line 201
    iput-object p1, p0, Lyyds/ᛱᛱᛴᲁ;->ᛷᛲᲈᛱ:Landroid/graphics/PointF;

    .line 202
    .line 203
    const p1, 0x461c4000    # 10000.0f

    .line 204
    .line 205
    .line 206
    mul-float/2addr v2, p1

    .line 207
    float-to-int p2, v2

    .line 208
    iput p2, p0, Lyyds/ᛱᛱᛴᲁ;->ᛳᲁᲁᲇ:I

    .line 209
    .line 210
    mul-float/2addr v4, p1

    .line 211
    float-to-int p1, v4

    .line 212
    iput p1, p0, Lyyds/ᛱᛱᛴᲁ;->ᲇᛱᛲ:I

    .line 213
    .line 214
    const/16 p1, 0x2710

    .line 215
    .line 216
    invoke-virtual {p0, p1}, Lyyds/ᛱᛱᛴᲁ;->ᲀᛲᛳᲀ(I)I

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    iget p2, p0, Lyyds/ᛱᛱᛴᲁ;->ᛳᲁᲁᲇ:I

    .line 221
    .line 222
    int-to-float p2, p2

    .line 223
    const v2, 0x3f99999a    # 1.2f

    .line 224
    .line 225
    .line 226
    mul-float/2addr p2, v2

    .line 227
    float-to-int p2, p2

    .line 228
    iget v4, p0, Lyyds/ᛱᛱᛴᲁ;->ᲇᛱᛲ:I

    .line 229
    .line 230
    int-to-float v4, v4

    .line 231
    mul-float/2addr v4, v2

    .line 232
    float-to-int v4, v4

    .line 233
    int-to-float p1, p1

    .line 234
    mul-float/2addr p1, v2

    .line 235
    float-to-int p1, p1

    .line 236
    iput p2, v6, Lyyds/ᛳᛶᲇᲁ;->ᛲᲈᲁ:I

    .line 237
    .line 238
    iput v4, v6, Lyyds/ᛳᛶᲇᲁ;->ᛵᛸᛸᛷ:I

    .line 239
    .line 240
    iput p1, v6, Lyyds/ᛳᛶᲇᲁ;->ᲀᛲᛳᲀ:I

    .line 241
    .line 242
    iget-object p1, p0, Lyyds/ᛱᛱᛴᲁ;->ᛲᛳᛶᲁ:Landroid/view/animation/LinearInterpolator;

    .line 243
    .line 244
    iput-object p1, v6, Lyyds/ᛳᛶᲇᲁ;->ᛲᛴᛳᛲ:Landroid/view/animation/BaseInterpolator;

    .line 245
    .line 246
    iput-boolean v3, v6, Lyyds/ᛳᛶᲇᲁ;->ᲇᲇᲇᛱ:Z

    .line 247
    .line 248
    goto :goto_2

    .line 249
    :cond_b
    :goto_1
    iget p1, p0, Lyyds/ᛱᛱᛴᲁ;->ᛲᲈᲁ:I

    .line 250
    .line 251
    iput p1, v6, Lyyds/ᛳᛶᲇᲁ;->ᲇᲈᛵᛷ:I

    .line 252
    .line 253
    invoke-virtual {p0}, Lyyds/ᛱᛱᛴᲁ;->ᛶᛷᛲᲁ()V

    .line 254
    .line 255
    .line 256
    :cond_c
    :goto_2
    iget p1, v6, Lyyds/ᛳᛶᲇᲁ;->ᲇᲈᛵᛷ:I

    .line 257
    .line 258
    if-ltz p1, :cond_d

    .line 259
    .line 260
    move v1, v3

    .line 261
    :cond_d
    invoke-virtual {v6, v0}, Lyyds/ᛳᛶᲇᲁ;->ᛲᲈᲁ(Lyyds/ᛵᲇᛲᛱ;)V

    .line 262
    .line 263
    .line 264
    if-eqz v1, :cond_e

    .line 265
    .line 266
    iget-boolean p1, p0, Lyyds/ᛱᛱᛴᲁ;->ᛲᛴᛳᛲ:Z

    .line 267
    .line 268
    if-eqz p1, :cond_e

    .line 269
    .line 270
    iput-boolean v3, p0, Lyyds/ᛱᛱᛴᲁ;->ᲇᲈᛵᛷ:Z

    .line 271
    .line 272
    iget-object p0, v0, Lyyds/ᛵᲇᛲᛱ;->ᛴᛸᲁᛵ:Lyyds/ᛵᲀᛲᛲ;

    .line 273
    .line 274
    invoke-virtual {p0}, Lyyds/ᛵᲀᛲᛲ;->ᛵᛸᛸᛷ()V

    .line 275
    .line 276
    .line 277
    :cond_e
    return-void
.end method

.method public ᛵᛸᛸᛷ(Landroid/util/DisplayMetrics;)F
    .locals 0

    .line 1
    iget p0, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 2
    .line 3
    int-to-float p0, p0

    .line 4
    const/high16 p1, 0x41c80000    # 25.0f

    .line 5
    .line 6
    div-float/2addr p1, p0

    .line 7
    return p1
.end method

.method public final ᛶᛷᛲᲁ()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lyyds/ᛱᛱᛴᲁ;->ᛲᛴᛳᛲ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lyyds/ᛱᛱᛴᲁ;->ᛲᛴᛳᛲ:Z

    .line 8
    .line 9
    iput v0, p0, Lyyds/ᛱᛱᛴᲁ;->ᲇᛱᛲ:I

    .line 10
    .line 11
    iput v0, p0, Lyyds/ᛱᛱᛴᲁ;->ᛳᲁᲁᲇ:I

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput-object v1, p0, Lyyds/ᛱᛱᛴᲁ;->ᛷᛲᲈᛱ:Landroid/graphics/PointF;

    .line 15
    .line 16
    iget-object v2, p0, Lyyds/ᛱᛱᛴᲁ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 17
    .line 18
    iget-object v2, v2, Lyyds/ᛵᲇᛲᛱ;->ᛸᲀᛷᛲ:Lyyds/ᲈᛳᲇᛲ;

    .line 19
    .line 20
    const/4 v3, -0x1

    .line 21
    iput v3, v2, Lyyds/ᲈᛳᲇᛲ;->ᛲᲈᲁ:I

    .line 22
    .line 23
    iput-object v1, p0, Lyyds/ᛱᛱᛴᲁ;->ᲇᲇᲇᛱ:Landroid/view/View;

    .line 24
    .line 25
    iput v3, p0, Lyyds/ᛱᛱᛴᲁ;->ᛲᲈᲁ:I

    .line 26
    .line 27
    iput-boolean v0, p0, Lyyds/ᛱᛱᛴᲁ;->ᲇᲈᛵᛷ:Z

    .line 28
    .line 29
    iget-object v0, p0, Lyyds/ᛱᛱᛴᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲇᲇᛵᛲ;

    .line 30
    .line 31
    iget-object v2, v0, Lyyds/ᲇᲇᛵᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛱᛴᲁ;

    .line 32
    .line 33
    if-ne v2, p0, :cond_1

    .line 34
    .line 35
    iput-object v1, v0, Lyyds/ᲇᲇᛵᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛱᛴᲁ;

    .line 36
    .line 37
    :cond_1
    iput-object v1, p0, Lyyds/ᛱᛱᛴᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲇᲇᛵᛲ;

    .line 38
    .line 39
    iput-object v1, p0, Lyyds/ᛱᛱᛴᲁ;->ᛵᛸᛸᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 40
    .line 41
    return-void
.end method

.method public ᲀᛲᛳᲀ(I)I
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    iget-boolean v0, p0, Lyyds/ᛱᛱᛴᲁ;->ᛲᛲᲈᲈ:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lyyds/ᛱᛱᛴᲁ;->ᛷᛵᲇᲀ:Landroid/util/DisplayMetrics;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lyyds/ᛱᛱᛴᲁ;->ᛵᛸᛸᛷ(Landroid/util/DisplayMetrics;)F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput v0, p0, Lyyds/ᛱᛱᛴᲁ;->ᛱᛳᲇ:F

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Lyyds/ᛱᛱᛴᲁ;->ᛲᛲᲈᲈ:Z

    .line 20
    .line 21
    :cond_0
    iget p0, p0, Lyyds/ᛱᛱᛴᲁ;->ᛱᛳᲇ:F

    .line 22
    .line 23
    mul-float/2addr p1, p0

    .line 24
    float-to-double p0, p1

    .line 25
    invoke-static {p0, p1}, Ljava/lang/Math;->ceil(D)D

    .line 26
    .line 27
    .line 28
    move-result-wide p0

    .line 29
    double-to-int p0, p0

    .line 30
    return p0
.end method

.method public ᲇᲇᲇᛱ(Landroid/view/View;Lyyds/ᛳᛶᲇᲁ;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛱᛴᲁ;->ᛷᛲᲈᛱ:Landroid/graphics/PointF;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iget v0, v0, Landroid/graphics/PointF;->x:F

    .line 10
    .line 11
    cmpl-float v0, v0, v4

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    if-lez v0, :cond_1

    .line 17
    .line 18
    move v0, v2

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move v0, v1

    .line 21
    goto :goto_1

    .line 22
    :cond_2
    :goto_0
    move v0, v3

    .line 23
    :goto_1
    iget-object v5, p0, Lyyds/ᛱᛱᛴᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲇᲇᛵᛲ;

    .line 24
    .line 25
    if-eqz v5, :cond_4

    .line 26
    .line 27
    invoke-virtual {v5}, Lyyds/ᲇᲇᛵᛲ;->ᲇᲈᛵᛷ()Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-nez v6, :cond_3

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    check-cast v6, Lyyds/ᲇᲁᛲᲀ;

    .line 39
    .line 40
    invoke-static {p1}, Lyyds/ᲇᲇᛵᛲ;->ᛵᲀᛵᛸ(Landroid/view/View;)I

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    iget v8, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 45
    .line 46
    sub-int/2addr v7, v8

    .line 47
    invoke-static {p1}, Lyyds/ᲇᲇᛵᛲ;->ᛷᛸᲇᛶ(Landroid/view/View;)I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    iget v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 52
    .line 53
    add-int/2addr v8, v6

    .line 54
    invoke-virtual {v5}, Lyyds/ᲇᲇᛵᛲ;->ᲀᛴᲁᲈ()I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    iget v9, v5, Lyyds/ᲇᲇᛵᛲ;->ᛱᛳᲇ:I

    .line 59
    .line 60
    invoke-virtual {v5}, Lyyds/ᲇᲇᛵᛲ;->ᛷᛶᛷᲀ()I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    sub-int/2addr v9, v5

    .line 65
    invoke-static {v7, v8, v6, v9, v0}, Lyyds/ᛱᛱᛴᲁ;->ᛲᲈᲁ(IIIII)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    goto :goto_3

    .line 70
    :cond_4
    :goto_2
    move v0, v3

    .line 71
    :goto_3
    iget-object v5, p0, Lyyds/ᛱᛱᛴᲁ;->ᛷᛲᲈᛱ:Landroid/graphics/PointF;

    .line 72
    .line 73
    if-eqz v5, :cond_6

    .line 74
    .line 75
    iget v5, v5, Landroid/graphics/PointF;->y:F

    .line 76
    .line 77
    cmpl-float v4, v5, v4

    .line 78
    .line 79
    if-nez v4, :cond_5

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_5
    if-lez v4, :cond_7

    .line 83
    .line 84
    move v1, v2

    .line 85
    goto :goto_5

    .line 86
    :cond_6
    :goto_4
    move v1, v3

    .line 87
    :cond_7
    :goto_5
    iget-object v4, p0, Lyyds/ᛱᛱᛴᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲇᲇᛵᛲ;

    .line 88
    .line 89
    if-eqz v4, :cond_9

    .line 90
    .line 91
    invoke-virtual {v4}, Lyyds/ᲇᲇᛵᛲ;->ᛲᛴᛳᛲ()Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-nez v5, :cond_8

    .line 96
    .line 97
    goto :goto_6

    .line 98
    :cond_8
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    check-cast v3, Lyyds/ᲇᲁᛲᲀ;

    .line 103
    .line 104
    invoke-static {p1}, Lyyds/ᲇᲇᛵᛲ;->ᛱᛳᛶᛳ(Landroid/view/View;)I

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    iget v6, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 109
    .line 110
    sub-int/2addr v5, v6

    .line 111
    invoke-static {p1}, Lyyds/ᲇᲇᛵᛲ;->ᲈᲀᛲᲀ(Landroid/view/View;)I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    iget v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 116
    .line 117
    add-int/2addr p1, v3

    .line 118
    invoke-virtual {v4}, Lyyds/ᲇᲇᛵᛲ;->ᛷᲇᛲᛱ()I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    iget v6, v4, Lyyds/ᲇᲇᛵᛲ;->ᛳᲁᲁᲇ:I

    .line 123
    .line 124
    invoke-virtual {v4}, Lyyds/ᲇᲇᛵᛲ;->ᲀᛲᛱᛱ()I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    sub-int/2addr v6, v4

    .line 129
    invoke-static {v5, p1, v3, v6, v1}, Lyyds/ᛱᛱᛴᲁ;->ᛲᲈᲁ(IIIII)I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    :cond_9
    :goto_6
    mul-int p1, v0, v0

    .line 134
    .line 135
    mul-int v1, v3, v3

    .line 136
    .line 137
    add-int/2addr v1, p1

    .line 138
    int-to-double v4, v1

    .line 139
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    .line 140
    .line 141
    .line 142
    move-result-wide v4

    .line 143
    double-to-int p1, v4

    .line 144
    invoke-virtual {p0, p1}, Lyyds/ᛱᛱᛴᲁ;->ᲀᛲᛳᲀ(I)I

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    int-to-double v4, p1

    .line 149
    const-wide v6, 0x3fd57a786c22680aL    # 0.3356

    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    div-double/2addr v4, v6

    .line 155
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 156
    .line 157
    .line 158
    move-result-wide v4

    .line 159
    double-to-int p1, v4

    .line 160
    if-lez p1, :cond_a

    .line 161
    .line 162
    neg-int v0, v0

    .line 163
    neg-int v1, v3

    .line 164
    iput v0, p2, Lyyds/ᛳᛶᲇᲁ;->ᛲᲈᲁ:I

    .line 165
    .line 166
    iput v1, p2, Lyyds/ᛳᛶᲇᲁ;->ᛵᛸᛸᛷ:I

    .line 167
    .line 168
    iput p1, p2, Lyyds/ᛳᛶᲇᲁ;->ᲀᛲᛳᲀ:I

    .line 169
    .line 170
    iget-object p0, p0, Lyyds/ᛱᛱᛴᲁ;->ᛷᲈᲈᲁ:Landroid/view/animation/DecelerateInterpolator;

    .line 171
    .line 172
    iput-object p0, p2, Lyyds/ᛳᛶᲇᲁ;->ᛲᛴᛳᛲ:Landroid/view/animation/BaseInterpolator;

    .line 173
    .line 174
    iput-boolean v2, p2, Lyyds/ᛳᛶᲇᲁ;->ᲇᲇᲇᛱ:Z

    .line 175
    .line 176
    :cond_a
    return-void
.end method

.method public final ᲇᲈᛵᛷ(I)Landroid/graphics/PointF;
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᛱᛱᛴᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲇᲇᛵᛲ;

    .line 2
    .line 3
    instance-of v0, p0, Lyyds/ᛵᲀᛴᛳ;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Lyyds/ᛵᲀᛴᛳ;

    .line 8
    .line 9
    invoke-interface {p0, p1}, Lyyds/ᛵᲀᛴᛳ;->ᛲᲈᲁ(I)Landroid/graphics/PointF;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string p1, "You should override computeScrollVectorForPosition when the LayoutManager does not implement "

    .line 17
    .line 18
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-class p1, Lyyds/ᛵᲀᛴᛳ;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const-string p1, "RecyclerView"

    .line 35
    .line 36
    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    return-object p0
.end method
