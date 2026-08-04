.class public final Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;
.super Landroid/view/View;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final synthetic ᛶᲈᛴᲈ:I


# instance fields
.field public ᛱᛳᲇ:Z

.field public final ᛱᲈᲁ:Landroid/graphics/Paint;

.field public ᛲᛲᲈᲈ:F

.field public final ᛲᛳᛶᲁ:F

.field public final ᛲᛴᛳᛲ:I

.field public ᛳᛸᛴᛶ:F

.field public ᛳᲁᲁᲇ:F

.field public ᛵᛶᛲᲀ:J

.field public ᛶᛳᛶᛵ:Landroid/animation/ValueAnimator;

.field public final ᛶᛷᛲᲁ:Landroid/graphics/Paint;

.field public final ᛷᛲᲈᛱ:Landroid/graphics/Matrix;

.field public final ᛷᛵᲇᲀ:[I

.field public final ᛷᲈᲈᲁ:Lyyds/ᛱᛲᛶᛱ;

.field public final ᲀᛲᛲᲇ:Lyyds/ᛱᲁᛳᛵ;

.field public final ᲀᛲᛳᲀ:F

.field public ᲇᛱᛲ:Z

.field public final ᲇᲇᲇᛱ:I

.field public final ᲇᲈᛵᛷ:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-wide v0, -0xb052e68a836eL

    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    const/4 v0, 0x0

    .line 171
    invoke-direct {p0, p1, v0}, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    .line 1
    const-wide v0, -0xb037e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    .line 21
    .line 22
    iput p2, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᲀᛲᛳᲀ:F

    .line 23
    .line 24
    const v0, 0x66060087

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroid/content/Context;->getColor(I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iput v1, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᲇᲈᛵᛷ:I

    .line 36
    .line 37
    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    iput v1, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛲᛴᛳᛲ:I

    .line 42
    .line 43
    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    iput v1, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᲇᲇᲇᛱ:I

    .line 48
    .line 49
    new-instance v1, Landroid/graphics/Paint;

    .line 50
    .line 51
    const/4 v2, 0x1

    .line 52
    invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(I)V

    .line 53
    .line 54
    .line 55
    sget-object v3, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 56
    .line 57
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 58
    .line 59
    .line 60
    iput-object v1, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛶᛷᛲᲁ:Landroid/graphics/Paint;

    .line 61
    .line 62
    new-instance v1, Landroid/graphics/Paint;

    .line 63
    .line 64
    invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(I)V

    .line 65
    .line 66
    .line 67
    iput-object v1, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛱᲈᲁ:Landroid/graphics/Paint;

    .line 68
    .line 69
    const/high16 v1, 0x40e00000    # 7.0f

    .line 70
    .line 71
    mul-float/2addr p2, v1

    .line 72
    iput p2, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛲᛳᛶᲁ:F

    .line 73
    .line 74
    new-instance p2, Lyyds/ᛵᲇᛵᲇ;

    .line 75
    .line 76
    const/16 v1, 0x11

    .line 77
    .line 78
    invoke-direct {p2, v1, p0}, Lyyds/ᛵᲇᛵᲇ;-><init>(ILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    new-instance v1, Lyyds/ᛱᛲᛶᛱ;

    .line 82
    .line 83
    invoke-direct {v1, p2}, Lyyds/ᛱᛲᛶᛱ;-><init>(Lyyds/ᲁᛶᲁᲀ;)V

    .line 84
    .line 85
    .line 86
    iput-object v1, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛷᲈᲈᲁ:Lyyds/ᛱᛲᛶᛱ;

    .line 87
    .line 88
    new-instance p2, Landroid/graphics/Matrix;

    .line 89
    .line 90
    invoke-direct {p2}, Landroid/graphics/Matrix;-><init>()V

    .line 91
    .line 92
    .line 93
    iput-object p2, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛷᛲᲈᛱ:Landroid/graphics/Matrix;

    .line 94
    .line 95
    const p2, 0x6606008c

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, p2}, Landroid/content/Context;->getColor(I)I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    int-to-float p2, p2

    .line 107
    const v1, 0x3ec28f5c    # 0.38f

    .line 108
    .line 109
    .line 110
    mul-float/2addr p2, v1

    .line 111
    const/4 v2, -0x1

    .line 112
    invoke-static {v2}, Landroid/graphics/Color;->red(I)I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    int-to-float v3, v3

    .line 117
    const v4, 0x3f1eb852    # 0.62f

    .line 118
    .line 119
    .line 120
    mul-float/2addr v3, v4

    .line 121
    add-float/2addr v3, p2

    .line 122
    float-to-int p2, v3

    .line 123
    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    int-to-float v3, v3

    .line 128
    mul-float/2addr v3, v1

    .line 129
    invoke-static {v2}, Landroid/graphics/Color;->green(I)I

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    int-to-float v5, v5

    .line 134
    mul-float/2addr v5, v4

    .line 135
    add-float/2addr v5, v3

    .line 136
    float-to-int v3, v5

    .line 137
    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    int-to-float v5, v5

    .line 142
    mul-float/2addr v5, v1

    .line 143
    invoke-static {v2}, Landroid/graphics/Color;->blue(I)I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    int-to-float v1, v1

    .line 148
    mul-float/2addr v1, v4

    .line 149
    add-float/2addr v1, v5

    .line 150
    float-to-int v1, v1

    .line 151
    invoke-static {p2, v3, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 152
    .line 153
    .line 154
    move-result p2

    .line 155
    filled-new-array {v0, v0, v0, p1, p2}, [I

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    iput-object p1, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛷᛵᲇᲀ:[I

    .line 160
    .line 161
    new-instance p1, Lyyds/ᛱᲁᛳᛵ;

    .line 162
    .line 163
    const/16 p2, 0x40

    .line 164
    .line 165
    invoke-direct {p1, p2}, Lyyds/ᛱᲁᛳᛵ;-><init>(I)V

    .line 166
    .line 167
    .line 168
    iput-object p1, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᲀᛲᛲᲇ:Lyyds/ᛱᲁᛳᛵ;

    .line 169
    .line 170
    return-void
.end method

.method private final getGlowShader()Landroid/graphics/RadialGradient;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛷᲈᲈᲁ:Lyyds/ᛱᛲᛶᛱ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛱᛲᛶᛱ;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/graphics/RadialGradient;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getHasVisibleTip()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛱᛳᲇ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean p0, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᲇᛱᛲ:Z

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    iget p0, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛲᛲᲈᲈ:F

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    cmpl-float p0, p0, v0

    .line 12
    .line 13
    if-lez p0, :cond_1

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_1
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method private final getTipX()F
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛱᛳᲇ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛳᲁᲁᲇ:F

    .line 6
    .line 7
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    int-to-float p0, p0

    .line 12
    mul-float/2addr v0, p0

    .line 13
    return v0

    .line 14
    :cond_0
    iget v0, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛲᛲᲈᲈ:F

    .line 15
    .line 16
    goto :goto_0
.end method

.method private final getTipY()F
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    int-to-float p0, p0

    .line 6
    const/high16 v0, 0x40000000    # 2.0f

    .line 7
    .line 8
    div-float/2addr p0, v0

    .line 9
    return p0
.end method

.method public static final ᛵᛸᛸᛷ(Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;)V
    .locals 11

    .line 1
    const-wide v0, -0xb05ae68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᲀᛲᛲᲇ:Lyyds/ᛱᲁᛳᛵ;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛲᲈᲁ()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛲᛴᛳᛲ()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    iget-wide v3, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛵᛶᛲᲀ:J

    .line 26
    .line 27
    sub-long v5, v1, v3

    .line 28
    .line 29
    const-wide/16 v7, 0x0

    .line 30
    .line 31
    const-wide/16 v9, 0x32

    .line 32
    .line 33
    invoke-static/range {v5 .. v10}, Lyyds/ᛳᛵᲀ;->ᲇᲈᛵᛷ(JJJ)J

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    iput-wide v1, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛵᛶᛲᲀ:J

    .line 38
    .line 39
    long-to-float v1, v3

    .line 40
    const/high16 v2, 0x447a0000    # 1000.0f

    .line 41
    .line 42
    div-float/2addr v1, v2

    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-gtz v2, :cond_1

    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    invoke-direct {p0}, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->getHasVisibleTip()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    const/high16 v3, 0x3f800000    # 1.0f

    .line 55
    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    invoke-direct {p0}, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->getTipX()F

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    invoke-direct {p0}, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->getTipY()F

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    iget v5, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛳᛸᛴᛶ:F

    .line 67
    .line 68
    const/high16 v6, 0x41d00000    # 26.0f

    .line 69
    .line 70
    mul-float/2addr v6, v1

    .line 71
    add-float/2addr v6, v5

    .line 72
    iput v6, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛳᛸᛴᛶ:F

    .line 73
    .line 74
    :goto_0
    iget v5, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛳᛸᛴᛶ:F

    .line 75
    .line 76
    cmpl-float v6, v5, v3

    .line 77
    .line 78
    if-ltz v6, :cond_2

    .line 79
    .line 80
    sub-float/2addr v5, v3

    .line 81
    iput v5, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛳᛸᛴᛶ:F

    .line 82
    .line 83
    invoke-virtual {p0, v2, v4}, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᲇᲈᛵᛷ(FF)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    invoke-virtual {v0}, Lyyds/ᛱᲁᛳᛵ;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-nez v2, :cond_5

    .line 92
    .line 93
    const v2, 0x404ccccd    # 3.2f

    .line 94
    .line 95
    .line 96
    mul-float/2addr v2, v1

    .line 97
    sub-float v2, v3, v2

    .line 98
    .line 99
    const/4 v4, 0x0

    .line 100
    cmpg-float v5, v2, v4

    .line 101
    .line 102
    if-gez v5, :cond_3

    .line 103
    .line 104
    move v2, v4

    .line 105
    :cond_3
    const/high16 v5, 0x435c0000    # 220.0f

    .line 106
    .line 107
    iget v6, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᲀᛲᛳᲀ:F

    .line 108
    .line 109
    mul-float/2addr v6, v5

    .line 110
    mul-float/2addr v6, v1

    .line 111
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    if-eqz v5, :cond_5

    .line 120
    .line 121
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    check-cast v5, Lyyds/ᛶᛱᛶᛷ;

    .line 126
    .line 127
    iget v7, v5, Lyyds/ᛶᛱᛶᛷ;->ᛲᛴᛳᛲ:F

    .line 128
    .line 129
    sub-float/2addr v7, v1

    .line 130
    iput v7, v5, Lyyds/ᛶᛱᛶᛷ;->ᛲᛴᛳᛲ:F

    .line 131
    .line 132
    cmpg-float v8, v7, v4

    .line 133
    .line 134
    if-gtz v8, :cond_4

    .line 135
    .line 136
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_4
    iget v8, v5, Lyyds/ᛶᛱᛶᛷ;->ᲀᛲᛳᲀ:F

    .line 141
    .line 142
    mul-float/2addr v8, v2

    .line 143
    iput v8, v5, Lyyds/ᛶᛱᛶᛷ;->ᲀᛲᛳᲀ:F

    .line 144
    .line 145
    iget v9, v5, Lyyds/ᛶᛱᛶᛷ;->ᲇᲈᛵᛷ:F

    .line 146
    .line 147
    mul-float/2addr v9, v2

    .line 148
    add-float/2addr v9, v6

    .line 149
    iput v9, v5, Lyyds/ᛶᛱᛶᛷ;->ᲇᲈᛵᛷ:F

    .line 150
    .line 151
    iget v10, v5, Lyyds/ᛶᛱᛶᛷ;->ᛲᲈᲁ:F

    .line 152
    .line 153
    mul-float/2addr v8, v1

    .line 154
    add-float/2addr v8, v10

    .line 155
    iput v8, v5, Lyyds/ᛶᛱᛶᛷ;->ᛲᲈᲁ:F

    .line 156
    .line 157
    iget v8, v5, Lyyds/ᛶᛱᛶᛷ;->ᛵᛸᛸᛷ:F

    .line 158
    .line 159
    mul-float/2addr v9, v1

    .line 160
    add-float/2addr v9, v8

    .line 161
    iput v9, v5, Lyyds/ᛶᛱᛶᛷ;->ᛵᛸᛸᛷ:F

    .line 162
    .line 163
    iget v8, v5, Lyyds/ᛶᛱᛶᛷ;->ᛶᛷᛲᲁ:F

    .line 164
    .line 165
    iget v9, v5, Lyyds/ᛶᛱᛶᛷ;->ᲇᲇᲇᛱ:F

    .line 166
    .line 167
    div-float/2addr v7, v9

    .line 168
    invoke-static {v7, v4, v3}, Lyyds/ᛳᛵᲀ;->ᛵᛸᛸᛷ(FFF)F

    .line 169
    .line 170
    .line 171
    move-result v7

    .line 172
    const v9, 0x3f266666    # 0.65f

    .line 173
    .line 174
    .line 175
    mul-float/2addr v7, v9

    .line 176
    const v9, 0x3eb33333    # 0.35f

    .line 177
    .line 178
    .line 179
    add-float/2addr v7, v9

    .line 180
    mul-float/2addr v7, v8

    .line 181
    iput v7, v5, Lyyds/ᛶᛱᛶᛷ;->ᛱᲈᲁ:F

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 185
    .line 186
    .line 187
    return-void
.end method


# virtual methods
.method public final onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᲇᲇᲇᛱ()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛲᛴᛳᛲ()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 11

    .line 1
    const-wide v0, -0xb03fe68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-lez v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-gtz v0, :cond_0

    .line 20
    .line 21
    goto/16 :goto_1

    .line 22
    .line 23
    :cond_0
    invoke-direct {p0}, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->getTipX()F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-direct {p0}, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->getTipY()F

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-direct {p0}, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->getHasVisibleTip()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    iget-object v2, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛷᛲᲈᛱ:Landroid/graphics/Matrix;

    .line 38
    .line 39
    invoke-virtual {v2, v0, v1}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0}, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->getGlowShader()Landroid/graphics/RadialGradient;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v3, v2}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 47
    .line 48
    .line 49
    invoke-direct {p0}, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->getGlowShader()Landroid/graphics/RadialGradient;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    iget-object v3, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛱᲈᲁ:Landroid/graphics/Paint;

    .line 54
    .line 55
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 56
    .line 57
    .line 58
    iget v2, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛲᛳᛶᲁ:F

    .line 59
    .line 60
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    iget-object v0, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᲀᛲᛲᲇ:Lyyds/ᛱᲁᛳᛵ;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_2

    .line 74
    .line 75
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, Lyyds/ᛶᛱᛶᛷ;

    .line 80
    .line 81
    iget v2, v1, Lyyds/ᛶᛱᛶᛷ;->ᛲᛴᛳᛲ:F

    .line 82
    .line 83
    iget v3, v1, Lyyds/ᛶᛱᛶᛷ;->ᲇᲇᲇᛱ:F

    .line 84
    .line 85
    div-float/2addr v2, v3

    .line 86
    const/4 v4, 0x0

    .line 87
    const/high16 v5, 0x3f800000    # 1.0f

    .line 88
    .line 89
    invoke-static {v2, v4, v5}, Lyyds/ᛳᛵᲀ;->ᛵᛸᛸᛷ(FFF)F

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    iget v4, v1, Lyyds/ᛶᛱᛶᛷ;->ᛲᛴᛳᛲ:F

    .line 94
    .line 95
    sub-float/2addr v3, v4

    .line 96
    iget v4, v1, Lyyds/ᛶᛱᛶᛷ;->ᛷᲈᲈᲁ:F

    .line 97
    .line 98
    const/high16 v5, 0x41d00000    # 26.0f

    .line 99
    .line 100
    mul-float/2addr v3, v5

    .line 101
    add-float/2addr v3, v4

    .line 102
    float-to-double v3, v3

    .line 103
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 104
    .line 105
    .line 106
    move-result-wide v3

    .line 107
    double-to-float v3, v3

    .line 108
    const v4, 0x3ee66666    # 0.45f

    .line 109
    .line 110
    .line 111
    mul-float/2addr v3, v4

    .line 112
    const v4, 0x3f0ccccd    # 0.55f

    .line 113
    .line 114
    .line 115
    add-float/2addr v3, v4

    .line 116
    iget v4, v1, Lyyds/ᛶᛱᛶᛷ;->ᛲᛳᛶᲁ:I

    .line 117
    .line 118
    iget-object v10, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛶᛷᛲᲁ:Landroid/graphics/Paint;

    .line 119
    .line 120
    invoke-virtual {v10, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 121
    .line 122
    .line 123
    mul-float/2addr v2, v3

    .line 124
    const/high16 v3, 0x436b0000    # 235.0f

    .line 125
    .line 126
    mul-float/2addr v2, v3

    .line 127
    float-to-int v2, v2

    .line 128
    const/4 v3, 0x0

    .line 129
    const/16 v4, 0xff

    .line 130
    .line 131
    invoke-static {v2, v3, v4}, Lyyds/ᛳᛵᲀ;->ᲀᛲᛳᲀ(III)I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    invoke-virtual {v10, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 136
    .line 137
    .line 138
    iget v2, v1, Lyyds/ᛶᛱᛶᛷ;->ᛱᲈᲁ:F

    .line 139
    .line 140
    invoke-virtual {v10, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 141
    .line 142
    .line 143
    iget v6, v1, Lyyds/ᛶᛱᛶᛷ;->ᛲᲈᲁ:F

    .line 144
    .line 145
    iget v7, v1, Lyyds/ᛶᛱᛶᛷ;->ᛵᛸᛸᛷ:F

    .line 146
    .line 147
    iget v2, v1, Lyyds/ᛶᛱᛶᛷ;->ᲀᛲᛳᲀ:F

    .line 148
    .line 149
    const v3, 0x3d3851ec    # 0.045f

    .line 150
    .line 151
    .line 152
    mul-float/2addr v2, v3

    .line 153
    sub-float v8, v6, v2

    .line 154
    .line 155
    iget v1, v1, Lyyds/ᛶᛱᛶᛷ;->ᲇᲈᛵᛷ:F

    .line 156
    .line 157
    mul-float/2addr v1, v3

    .line 158
    sub-float v9, v7, v1

    .line 159
    .line 160
    move-object v5, p1

    .line 161
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 162
    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_2
    :goto_1
    return-void
.end method

.method public final onVisibilityAggregated(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onVisibilityAggregated(Z)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᲇᲇᲇᛱ()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onVisibilityChanged(Landroid/view/View;I)V
    .locals 2

    .line 1
    const-wide v0, -0xb046e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1, p2}, Landroid/view/View;->onVisibilityChanged(Landroid/view/View;I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᲇᲇᲇᛱ()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final onWindowVisibilityChanged(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onWindowVisibilityChanged(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᲇᲇᲇᛱ()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final ᛲᛴᛳᛲ()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛶᛳᛶᛵ:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛶᛳᛶᛵ:Landroid/animation/ValueAnimator;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᲀᛲᛲᲇ:Lyyds/ᛱᲁᛳᛵ;

    .line 12
    .line 13
    invoke-virtual {v0}, Lyyds/ᛱᲁᛳᛵ;->clear()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput v0, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛳᛸᛴᛶ:F

    .line 18
    .line 19
    return-void
.end method

.method public final ᛲᲈᲁ()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->isShown()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getWindowVisibility()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public final ᲀᛲᛳᲀ(FZ)V
    .locals 2

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p1, v1, v0}, Lyyds/ᛳᛵᲀ;->ᛵᛸᛸᛷ(FFF)F

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    iget-boolean v0, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛱᛳᲇ:Z

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget v0, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛲᛲᲈᲈ:F

    .line 15
    .line 16
    sub-float v0, p1, v0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v0, v1

    .line 20
    :goto_0
    iput p1, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛲᛲᲈᲈ:F

    .line 21
    .line 22
    iput-boolean p2, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛱᛳᲇ:Z

    .line 23
    .line 24
    cmpl-float p1, v0, v1

    .line 25
    .line 26
    if-lez p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-lez p1, :cond_1

    .line 33
    .line 34
    const/high16 p1, 0x43820000    # 260.0f

    .line 35
    .line 36
    mul-float/2addr v0, p1

    .line 37
    float-to-int p1, v0

    .line 38
    const/4 p2, 0x0

    .line 39
    :goto_1
    if-ge p2, p1, :cond_1

    .line 40
    .line 41
    invoke-direct {p0}, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->getTipX()F

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-direct {p0}, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->getTipY()F

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-virtual {p0, v0, v1}, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᲇᲈᛵᛷ(FF)V

    .line 50
    .line 51
    .line 52
    add-int/lit8 p2, p2, 0x1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᲇᲇᲇᛱ()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final ᲇᲇᲇᛱ()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛲᲈᲁ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛶᛳᛶᛵ:Landroid/animation/ValueAnimator;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛲᲈᲁ()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    :goto_0
    return-void

    .line 26
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    iput-wide v0, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛵᛶᛲᲀ:J

    .line 31
    .line 32
    const/4 v0, 0x2

    .line 33
    new-array v0, v0, [F

    .line 34
    .line 35
    fill-array-data v0, :array_0

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-wide/16 v1, 0x10

    .line 43
    .line 44
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 45
    .line 46
    .line 47
    const/4 v1, -0x1

    .line 48
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 49
    .line 50
    .line 51
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    .line 52
    .line 53
    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 57
    .line 58
    .line 59
    new-instance v1, Lyyds/ᲇᛲᛷᲀ;

    .line 60
    .line 61
    const/4 v2, 0x5

    .line 62
    invoke-direct {v1, v2, p0}, Lyyds/ᲇᛲᛷᲀ;-><init>(ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 69
    .line 70
    .line 71
    iput-object v0, p0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛶᛳᛶᛵ:Landroid/animation/ValueAnimator;

    .line 72
    .line 73
    return-void

    .line 74
    :cond_2
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛲᛴᛳᛲ()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    nop

    .line 79
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final ᲇᲈᛵᛷ(FF)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lyyds/ᲇᛸᛴᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛳᛲᛷ;

    .line 4
    .line 5
    invoke-virtual {v1}, Lyyds/ᛷᛳᛲᛷ;->ᲇᲇᲇᛱ()F

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/high16 v3, 0x42500000    # 52.0f

    .line 10
    .line 11
    mul-float/2addr v2, v3

    .line 12
    const/high16 v3, 0x41d00000    # 26.0f

    .line 13
    .line 14
    sub-float/2addr v2, v3

    .line 15
    const/high16 v3, -0x3d4c0000    # -90.0f

    .line 16
    .line 17
    add-float/2addr v2, v3

    .line 18
    float-to-double v2, v2

    .line 19
    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    invoke-virtual {v1}, Lyyds/ᛷᛳᛲᛷ;->ᲇᲇᲇᛱ()F

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    const/high16 v5, 0x42960000    # 75.0f

    .line 28
    .line 29
    mul-float/2addr v4, v5

    .line 30
    const/high16 v5, 0x425c0000    # 55.0f

    .line 31
    .line 32
    add-float/2addr v4, v5

    .line 33
    iget v5, v0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᲀᛲᛳᲀ:F

    .line 34
    .line 35
    mul-float/2addr v4, v5

    .line 36
    invoke-virtual {v1}, Lyyds/ᛷᛳᛲᛷ;->ᲇᲇᲇᛱ()F

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    const v7, 0x3eb33332    # 0.34999996f

    .line 41
    .line 42
    .line 43
    mul-float/2addr v6, v7

    .line 44
    const v7, 0x3e99999a    # 0.3f

    .line 45
    .line 46
    .line 47
    add-float v13, v6, v7

    .line 48
    .line 49
    invoke-virtual {v1}, Lyyds/ᛷᛳᛲᛷ;->ᲇᲇᲇᛱ()F

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    invoke-virtual {v1}, Lyyds/ᛷᛳᛲᛷ;->ᲇᲇᲇᛱ()F

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    mul-float/2addr v7, v6

    .line 58
    const v6, 0x3fd99999    # 1.6999999f

    .line 59
    .line 60
    .line 61
    mul-float/2addr v7, v6

    .line 62
    const v6, 0x3f666666    # 0.9f

    .line 63
    .line 64
    .line 65
    add-float/2addr v7, v6

    .line 66
    mul-float v15, v7, v5

    .line 67
    .line 68
    new-instance v8, Lyyds/ᛶᛱᛶᛷ;

    .line 69
    .line 70
    invoke-virtual {v1}, Lyyds/ᛷᛳᛲᛷ;->ᲇᲇᲇᛱ()F

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    const/high16 v7, 0x40c00000    # 6.0f

    .line 75
    .line 76
    mul-float/2addr v6, v7

    .line 77
    mul-float/2addr v6, v5

    .line 78
    sub-float v9, p1, v6

    .line 79
    .line 80
    invoke-virtual {v1}, Lyyds/ᛷᛳᛲᛷ;->ᲇᲇᲇᛱ()F

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    const/high16 v7, 0x40000000    # 2.0f

    .line 85
    .line 86
    mul-float/2addr v6, v7

    .line 87
    const/high16 v7, 0x3f800000    # 1.0f

    .line 88
    .line 89
    sub-float/2addr v6, v7

    .line 90
    mul-float/2addr v6, v5

    .line 91
    add-float v10, v6, p2

    .line 92
    .line 93
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 94
    .line 95
    .line 96
    move-result-wide v5

    .line 97
    float-to-double v11, v4

    .line 98
    mul-double/2addr v5, v11

    .line 99
    double-to-float v4, v5

    .line 100
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 101
    .line 102
    .line 103
    move-result-wide v2

    .line 104
    mul-double/2addr v2, v11

    .line 105
    double-to-float v12, v2

    .line 106
    iget-object v2, v0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᛷᛵᲇᲀ:[I

    .line 107
    .line 108
    array-length v3, v2

    .line 109
    sget-object v5, Lyyds/ᲇᛸᛴᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛳᛷᛶᛲ;

    .line 110
    .line 111
    invoke-virtual {v5, v3}, Lyyds/ᛳᛷᛶᛲ;->ᛶᛷᛲᲁ(I)I

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    aget v17, v2, v3

    .line 116
    .line 117
    invoke-virtual {v1}, Lyyds/ᛷᛳᛲᛷ;->ᲇᲇᲇᛱ()F

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    const v2, 0x40c90fdb

    .line 122
    .line 123
    .line 124
    mul-float v18, v1, v2

    .line 125
    .line 126
    move v14, v13

    .line 127
    move/from16 v16, v15

    .line 128
    .line 129
    move v11, v4

    .line 130
    invoke-direct/range {v8 .. v18}, Lyyds/ᛶᛱᛶᛷ;-><init>(FFFFFFFFIF)V

    .line 131
    .line 132
    .line 133
    iget-object v0, v0, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᲀᛲᛲᲇ:Lyyds/ᛱᲁᛳᛵ;

    .line 134
    .line 135
    invoke-virtual {v0, v8}, Lyyds/ᛱᲁᛳᛵ;->addLast(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    iget v1, v0, Lyyds/ᛱᲁᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 139
    .line 140
    const/16 v2, 0x6e

    .line 141
    .line 142
    if-le v1, v2, :cond_0

    .line 143
    .line 144
    invoke-virtual {v0}, Lyyds/ᛱᲁᛳᛵ;->removeFirst()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    :cond_0
    return-void
.end method
