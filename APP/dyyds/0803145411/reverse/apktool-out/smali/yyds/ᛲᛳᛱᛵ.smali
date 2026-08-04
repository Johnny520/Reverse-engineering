.class public final Lyyds/ᛲᛳᛱᛵ;
.super Landroid/widget/ImageView;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛱᛳᲇ:I

.field public static final ᛳᲁᲁᲇ:I


# instance fields
.field public final ᛱᲈᲁ:I

.field public final ᛲᛲᲈᲈ:Lyyds/ᛲᛳᛵᛱ;

.field public final ᛲᛳᛶᲁ:Landroid/graphics/Paint;

.field public final ᛲᛴᛳᛲ:Landroid/graphics/RectF;

.field public final ᛶᛷᛲᲁ:Landroid/graphics/Path;

.field public ᛷᛲᲈᛱ:Lyyds/ᛳᲀᛵᛷ;

.field public ᛷᛵᲇᲀ:J

.field public final ᛷᲈᲈᲁ:Landroid/graphics/Paint;

.field public final ᲀᛲᛳᲀ:F

.field public final ᲇᲇᲇᛱ:Landroid/graphics/RectF;

.field public final ᲇᲈᛵᛷ:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/16 v0, 0xc4

    .line 2
    .line 3
    const/16 v1, 0x6a

    .line 4
    .line 5
    const/16 v2, 0x3d

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sput v0, Lyyds/ᛲᛳᛱᛵ;->ᛱᛳᲇ:I

    .line 12
    .line 13
    const/16 v0, 0x4d

    .line 14
    .line 15
    const/16 v1, 0x4f

    .line 16
    .line 17
    const/16 v2, 0xff

    .line 18
    .line 19
    invoke-static {v2, v0, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    sput v0, Lyyds/ᛲᛳᛱᛵ;->ᛳᲁᲁᲇ:I

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    const-wide v0, -0x36fdbe68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {p0, p1, v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 23
    .line 24
    iput p1, p0, Lyyds/ᛲᛳᛱᛵ;->ᲀᛲᛳᲀ:F

    .line 25
    .line 26
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 27
    .line 28
    mul-float/2addr p1, v0

    .line 29
    iput p1, p0, Lyyds/ᛲᛳᛱᛵ;->ᲇᲈᛵᛷ:F

    .line 30
    .line 31
    new-instance v0, Landroid/graphics/RectF;

    .line 32
    .line 33
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lyyds/ᛲᛳᛱᛵ;->ᛲᛴᛳᛲ:Landroid/graphics/RectF;

    .line 37
    .line 38
    new-instance v0, Landroid/graphics/RectF;

    .line 39
    .line 40
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lyyds/ᛲᛳᛱᛵ;->ᲇᲇᲇᛱ:Landroid/graphics/RectF;

    .line 44
    .line 45
    new-instance v0, Landroid/graphics/Path;

    .line 46
    .line 47
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, Lyyds/ᛲᛳᛱᛵ;->ᛶᛷᛲᲁ:Landroid/graphics/Path;

    .line 51
    .line 52
    new-instance v0, Landroid/util/TypedValue;

    .line 53
    .line 54
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    const v2, 0x1010036

    .line 66
    .line 67
    .line 68
    const/4 v3, 0x1

    .line 69
    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_1

    .line 74
    .line 75
    iget v1, v0, Landroid/util/TypedValue;->resourceId:I

    .line 76
    .line 77
    if-eqz v1, :cond_0

    .line 78
    .line 79
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    .line 84
    .line 85
    invoke-virtual {v1, v0}, Landroid/content/Context;->getColor(I)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    goto :goto_0

    .line 90
    :cond_0
    iget v0, v0, Landroid/util/TypedValue;->data:I

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_1
    const/4 v0, -0x1

    .line 94
    :goto_0
    iput v0, p0, Lyyds/ᛲᛳᛱᛵ;->ᛱᲈᲁ:I

    .line 95
    .line 96
    new-instance v1, Landroid/graphics/Paint;

    .line 97
    .line 98
    invoke-direct {v1, v3}, Landroid/graphics/Paint;-><init>(I)V

    .line 99
    .line 100
    .line 101
    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 102
    .line 103
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 107
    .line 108
    .line 109
    sget-object p1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 110
    .line 111
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 115
    .line 116
    .line 117
    iput-object v1, p0, Lyyds/ᛲᛳᛱᛵ;->ᛲᛳᛶᲁ:Landroid/graphics/Paint;

    .line 118
    .line 119
    new-instance v1, Landroid/graphics/Paint;

    .line 120
    .line 121
    invoke-direct {v1, v3}, Landroid/graphics/Paint;-><init>(I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 128
    .line 129
    .line 130
    sget-object p1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 131
    .line 132
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 133
    .line 134
    .line 135
    iput-object v1, p0, Lyyds/ᛲᛳᛱᛵ;->ᛷᲈᲈᲁ:Landroid/graphics/Paint;

    .line 136
    .line 137
    sget-object p1, Lyyds/ᛳᲀᛵᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛵᛷ;

    .line 138
    .line 139
    iput-object p1, p0, Lyyds/ᛲᛳᛱᛵ;->ᛷᛲᲈᛱ:Lyyds/ᛳᲀᛵᛷ;

    .line 140
    .line 141
    new-instance v0, Lyyds/ᛲᛳᛵᛱ;

    .line 142
    .line 143
    const/16 v1, 0x10

    .line 144
    .line 145
    invoke-direct {v0, v1, p0}, Lyyds/ᛲᛳᛵᛱ;-><init>(ILjava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    iput-object v0, p0, Lyyds/ᛲᛳᛱᛵ;->ᛲᛲᲈᲈ:Lyyds/ᛲᛳᛵᛱ;

    .line 149
    .line 150
    invoke-static {p1}, Lyyds/ᛲᛳᛱᛵ;->ᛲᲈᲁ(Lyyds/ᛳᲀᛵᛷ;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 155
    .line 156
    .line 157
    return-void
.end method

.method public static ᛲᲈᲁ(Lyyds/ᛳᲀᛵᛷ;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eq p0, v0, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-eq p0, v0, :cond_2

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    if-eq p0, v0, :cond_1

    .line 15
    .line 16
    const/4 v0, 0x4

    .line 17
    if-ne p0, v0, :cond_0

    .line 18
    .line 19
    const-wide v0, -0x37005e68a836eL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_0
    invoke-static {}, Lyyds/ᛱᛸᛶᛲ;->ᛷᲈᲈᲁ()V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return-object p0

    .line 34
    :cond_1
    const-wide v0, -0x36ffee68a836eL

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :cond_2
    const-wide v0, -0x36ff9e68a836eL

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_3
    const-wide v0, -0x36ff0e68a836eL

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method

.method public static ᲀᛲᛳᲀ(Lyyds/ᛳᲀᛵᛷ;)Z
    .locals 1

    .line 1
    sget-object v0, Lyyds/ᛳᲀᛵᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲀᛵᛷ;

    .line 2
    .line 3
    if-eq p0, v0, :cond_1

    .line 4
    .line 5
    sget-object v0, Lyyds/ᛳᲀᛵᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛳᲀᛵᛷ;

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 13
    return p0
.end method


# virtual methods
.method public final onDetachedFromWindow()V
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛲᛳᛱᛵ;->ᛲᛲᲈᲈ:Lyyds/ᛲᛳᛵᛱ;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 4
    .line 5
    .line 6
    sget-object v0, Lyyds/ᛳᲀᛵᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛵᛷ;

    .line 7
    .line 8
    iput-object v0, p0, Lyyds/ᛲᛳᛱᛵ;->ᛷᛲᲈᛱ:Lyyds/ᛳᲀᛵᛷ;

    .line 9
    .line 10
    const-wide/16 v1, 0x0

    .line 11
    .line 12
    iput-wide v1, p0, Lyyds/ᛲᛳᛱᛵ;->ᛷᛵᲇᲀ:J

    .line 13
    .line 14
    invoke-static {v0}, Lyyds/ᛲᛳᛱᛵ;->ᛲᲈᲁ(Lyyds/ᛳᲀᛵᛷ;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 19
    .line 20
    .line 21
    invoke-super {p0}, Landroid/widget/ImageView;->onDetachedFromWindow()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 13

    .line 1
    const-wide v0, -0x36fe9e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    iget v0, p0, Lyyds/ᛲᛳᛱᛵ;->ᲇᲈᛵᛷ:F

    .line 10
    .line 11
    const/high16 v1, 0x40000000    # 2.0f

    .line 12
    .line 13
    div-float/2addr v0, v1

    .line 14
    iget v2, p0, Lyyds/ᛲᛳᛱᛵ;->ᲀᛲᛳᲀ:F

    .line 15
    .line 16
    add-float/2addr v0, v2

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    int-to-float v3, v3

    .line 22
    sub-float/2addr v3, v0

    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    int-to-float v4, v4

    .line 28
    sub-float/2addr v4, v0

    .line 29
    iget-object v6, p0, Lyyds/ᛲᛳᛱᛵ;->ᛲᛴᛳᛲ:Landroid/graphics/RectF;

    .line 30
    .line 31
    invoke-virtual {v6, v0, v0, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 32
    .line 33
    .line 34
    iget-object v10, p0, Lyyds/ᛲᛳᛱᛵ;->ᛲᛳᛶᲁ:Landroid/graphics/Paint;

    .line 35
    .line 36
    iget v0, p0, Lyyds/ᛲᛳᛱᛵ;->ᛱᲈᲁ:I

    .line 37
    .line 38
    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 39
    .line 40
    .line 41
    iget-object v3, p0, Lyyds/ᛲᛳᛱᛵ;->ᛷᛲᲈᛱ:Lyyds/ᛳᲀᛵᛷ;

    .line 42
    .line 43
    invoke-static {v3}, Lyyds/ᛲᛳᛱᛵ;->ᲀᛲᛳᲀ(Lyyds/ᛳᲀᛵᛷ;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_0

    .line 48
    .line 49
    const/16 v3, 0x26

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const/16 v3, 0x1a

    .line 53
    .line 54
    :goto_0
    invoke-virtual {v10, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v6, v10}, Landroid/graphics/Canvas;->drawOval(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 58
    .line 59
    .line 60
    iget-object v3, p0, Lyyds/ᛲᛳᛱᛵ;->ᛷᛲᲈᛱ:Lyyds/ᛳᲀᛵᛷ;

    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_5

    .line 67
    .line 68
    const/4 v4, 0x1

    .line 69
    const/high16 v5, 0x42b40000    # 90.0f

    .line 70
    .line 71
    const/16 v7, 0xe6

    .line 72
    .line 73
    const/high16 v8, 0x43b40000    # 360.0f

    .line 74
    .line 75
    if-eq v3, v4, :cond_4

    .line 76
    .line 77
    const/4 v4, 0x2

    .line 78
    if-eq v3, v4, :cond_3

    .line 79
    .line 80
    const/4 v0, 0x3

    .line 81
    const/high16 v4, 0x40a00000    # 5.0f

    .line 82
    .line 83
    const/16 v5, 0xeb

    .line 84
    .line 85
    iget-object v11, p0, Lyyds/ᛲᛳᛱᛵ;->ᛷᲈᲈᲁ:Landroid/graphics/Paint;

    .line 86
    .line 87
    if-eq v3, v0, :cond_2

    .line 88
    .line 89
    const/4 v0, 0x4

    .line 90
    if-ne v3, v0, :cond_1

    .line 91
    .line 92
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    int-to-float v0, v0

    .line 97
    div-float v7, v0, v1

    .line 98
    .line 99
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    int-to-float v0, v0

    .line 104
    div-float/2addr v0, v1

    .line 105
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 106
    .line 107
    invoke-virtual {v11, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 108
    .line 109
    .line 110
    mul-float/2addr v1, v2

    .line 111
    invoke-virtual {v11, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 112
    .line 113
    .line 114
    sget v1, Lyyds/ᛲᛳᛱᛵ;->ᛳᲁᲁᲇ:I

    .line 115
    .line 116
    invoke-virtual {v11, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v11, v5}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 120
    .line 121
    .line 122
    mul-float/2addr v4, v2

    .line 123
    sub-float v8, v0, v4

    .line 124
    .line 125
    const/high16 v1, 0x3fc00000    # 1.5f

    .line 126
    .line 127
    mul-float/2addr v1, v2

    .line 128
    add-float v10, v1, v0

    .line 129
    .line 130
    move v9, v7

    .line 131
    move-object v6, p1

    .line 132
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 133
    .line 134
    .line 135
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 136
    .line 137
    invoke-virtual {v11, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 138
    .line 139
    .line 140
    add-float/2addr v4, v0

    .line 141
    const v0, 0x3f933333    # 1.15f

    .line 142
    .line 143
    .line 144
    mul-float/2addr v2, v0

    .line 145
    invoke-virtual {p1, v7, v4, v2, v11}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 146
    .line 147
    .line 148
    goto/16 :goto_1

    .line 149
    .line 150
    :cond_1
    invoke-static {}, Lyyds/ᛱᛸᛶᛲ;->ᛷᲈᲈᲁ()V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    int-to-float v0, v0

    .line 159
    div-float/2addr v0, v1

    .line 160
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    int-to-float v3, v3

    .line 165
    div-float/2addr v3, v1

    .line 166
    iget-object v6, p0, Lyyds/ᛲᛳᛱᛵ;->ᛶᛷᛲᲁ:Landroid/graphics/Path;

    .line 167
    .line 168
    invoke-virtual {v6}, Landroid/graphics/Path;->reset()V

    .line 169
    .line 170
    .line 171
    mul-float/2addr v4, v2

    .line 172
    sub-float v4, v0, v4

    .line 173
    .line 174
    invoke-virtual {v6, v4, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 175
    .line 176
    .line 177
    const v4, 0x3fa66666    # 1.3f

    .line 178
    .line 179
    .line 180
    mul-float/2addr v4, v2

    .line 181
    sub-float v4, v0, v4

    .line 182
    .line 183
    const v7, 0x40666666    # 3.6f

    .line 184
    .line 185
    .line 186
    mul-float/2addr v7, v2

    .line 187
    add-float/2addr v7, v3

    .line 188
    invoke-virtual {v6, v4, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 189
    .line 190
    .line 191
    const/high16 v4, 0x40b00000    # 5.5f

    .line 192
    .line 193
    mul-float/2addr v4, v2

    .line 194
    add-float/2addr v4, v0

    .line 195
    const v0, 0x40866666    # 4.2f

    .line 196
    .line 197
    .line 198
    mul-float/2addr v0, v2

    .line 199
    sub-float/2addr v3, v0

    .line 200
    invoke-virtual {v6, v4, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 201
    .line 202
    .line 203
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 204
    .line 205
    invoke-virtual {v11, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 206
    .line 207
    .line 208
    mul-float/2addr v2, v1

    .line 209
    invoke-virtual {v11, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 210
    .line 211
    .line 212
    sget v0, Lyyds/ᛲᛳᛱᛵ;->ᛱᛳᲇ:I

    .line 213
    .line 214
    invoke-virtual {v11, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v11, v5}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p1, v6, v11}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 221
    .line 222
    .line 223
    goto/16 :goto_1

    .line 224
    .line 225
    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 226
    .line 227
    .line 228
    move-result-wide v1

    .line 229
    iget-wide v3, p0, Lyyds/ᛲᛳᛱᛵ;->ᛷᛵᲇᲀ:J

    .line 230
    .line 231
    sub-long/2addr v1, v3

    .line 232
    const-wide/16 v3, 0x41a

    .line 233
    .line 234
    rem-long v3, v1, v3

    .line 235
    .line 236
    long-to-float v3, v3

    .line 237
    mul-float/2addr v3, v8

    .line 238
    const v4, 0x44834000    # 1050.0f

    .line 239
    .line 240
    .line 241
    div-float/2addr v3, v4

    .line 242
    const-wide/16 v8, 0x44c

    .line 243
    .line 244
    rem-long/2addr v1, v8

    .line 245
    long-to-float v1, v1

    .line 246
    const v2, 0x44898000    # 1100.0f

    .line 247
    .line 248
    .line 249
    div-float/2addr v1, v2

    .line 250
    float-to-double v1, v1

    .line 251
    const-wide v8, 0x400921fb54442d18L    # Math.PI

    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    mul-double/2addr v1, v8

    .line 257
    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    .line 258
    .line 259
    mul-double/2addr v1, v8

    .line 260
    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    .line 261
    .line 262
    .line 263
    move-result-wide v1

    .line 264
    const-wide/high16 v11, 0x3ff0000000000000L    # 1.0

    .line 265
    .line 266
    add-double/2addr v1, v11

    .line 267
    div-double/2addr v1, v8

    .line 268
    double-to-float v1, v1

    .line 269
    const/high16 v2, 0x42d00000    # 104.0f

    .line 270
    .line 271
    mul-float/2addr v1, v2

    .line 272
    const/high16 v2, 0x42800000    # 64.0f

    .line 273
    .line 274
    add-float v8, v1, v2

    .line 275
    .line 276
    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v10, v7}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 280
    .line 281
    .line 282
    sub-float v7, v3, v5

    .line 283
    .line 284
    const/4 v9, 0x0

    .line 285
    move-object v5, p1

    .line 286
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {p0, p1}, Lyyds/ᛲᛳᛱᛵ;->ᛵᛸᛸᛷ(Landroid/graphics/Canvas;)V

    .line 290
    .line 291
    .line 292
    goto :goto_1

    .line 293
    :cond_4
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 294
    .line 295
    .line 296
    move-result-wide v1

    .line 297
    iget-wide v3, p0, Lyyds/ᛲᛳᛱᛵ;->ᛷᛵᲇᲀ:J

    .line 298
    .line 299
    sub-long/2addr v1, v3

    .line 300
    const-wide/16 v3, 0x2f8

    .line 301
    .line 302
    rem-long/2addr v1, v3

    .line 303
    long-to-float v1, v1

    .line 304
    mul-float/2addr v1, v8

    .line 305
    const/high16 v2, 0x443e0000    # 760.0f

    .line 306
    .line 307
    div-float/2addr v1, v2

    .line 308
    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v10, v7}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 312
    .line 313
    .line 314
    sub-float v7, v1, v5

    .line 315
    .line 316
    const/high16 v8, 0x42b80000    # 92.0f

    .line 317
    .line 318
    const/4 v9, 0x0

    .line 319
    move-object v5, p1

    .line 320
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {p0, p1}, Lyyds/ᛲᛳᛱᛵ;->ᛵᛸᛸᛷ(Landroid/graphics/Canvas;)V

    .line 324
    .line 325
    .line 326
    goto :goto_1

    .line 327
    :cond_5
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 328
    .line 329
    .line 330
    move-result v0

    .line 331
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    int-to-float v2, v2

    .line 336
    div-float/2addr v2, v1

    .line 337
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 338
    .line 339
    .line 340
    move-result v3

    .line 341
    int-to-float v3, v3

    .line 342
    div-float/2addr v3, v1

    .line 343
    const/high16 v1, 0x43340000    # 180.0f

    .line 344
    .line 345
    invoke-virtual {p1, v1, v2, v3}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 346
    .line 347
    .line 348
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 352
    .line 353
    .line 354
    :goto_1
    iget-object p1, p0, Lyyds/ᛲᛳᛱᛵ;->ᛷᛲᲈᛱ:Lyyds/ᛳᲀᛵᛷ;

    .line 355
    .line 356
    invoke-static {p1}, Lyyds/ᛲᛳᛱᛵ;->ᲀᛲᛳᲀ(Lyyds/ᛳᲀᛵᛷ;)Z

    .line 357
    .line 358
    .line 359
    move-result p1

    .line 360
    if-eqz p1, :cond_6

    .line 361
    .line 362
    invoke-virtual {p0}, Landroid/view/View;->isShown()Z

    .line 363
    .line 364
    .line 365
    move-result p1

    .line 366
    if-eqz p1, :cond_6

    .line 367
    .line 368
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 369
    .line 370
    .line 371
    :cond_6
    return-void
.end method

.method public final setRunning(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lyyds/ᛳᲀᛵᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲀᛵᛷ;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object p1, Lyyds/ᛳᲀᛵᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛵᛷ;

    .line 7
    .line 8
    :goto_0
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    invoke-virtual {p0, p1, v0, v1}, Lyyds/ᛲᛳᛱᛵ;->ᲇᲈᛵᛷ(Lyyds/ᛳᲀᛵᛷ;J)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setState(Lyyds/ᛳᲀᛵᛷ;)V
    .locals 2

    .line 1
    const-wide v0, -0x3701ae68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    invoke-virtual {p0, p1, v0, v1}, Lyyds/ᛲᛳᛱᛵ;->ᲇᲈᛵᛷ(Lyyds/ᛳᲀᛵᛷ;J)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final ᛵᛸᛸᛷ(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    iget v0, p0, Lyyds/ᛲᛳᛱᛵ;->ᲀᛲᛳᲀ:F

    .line 2
    .line 3
    const/high16 v1, 0x40b00000    # 5.5f

    .line 4
    .line 5
    mul-float/2addr v1, v0

    .line 6
    const/high16 v2, 0x40000000    # 2.0f

    .line 7
    .line 8
    div-float/2addr v1, v2

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    int-to-float v3, v3

    .line 14
    div-float/2addr v3, v2

    .line 15
    sub-float/2addr v3, v1

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    int-to-float v4, v4

    .line 21
    div-float/2addr v4, v2

    .line 22
    sub-float/2addr v4, v1

    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    int-to-float v5, v5

    .line 28
    div-float/2addr v5, v2

    .line 29
    add-float/2addr v5, v1

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    int-to-float v6, v6

    .line 35
    div-float/2addr v6, v2

    .line 36
    add-float/2addr v6, v1

    .line 37
    iget-object v1, p0, Lyyds/ᛲᛳᛱᛵ;->ᲇᲇᲇᛱ:Landroid/graphics/RectF;

    .line 38
    .line 39
    invoke-virtual {v1, v3, v4, v5, v6}, Landroid/graphics/RectF;->set(FFFF)V

    .line 40
    .line 41
    .line 42
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 43
    .line 44
    iget-object v3, p0, Lyyds/ᛲᛳᛱᛵ;->ᛷᲈᲈᲁ:Landroid/graphics/Paint;

    .line 45
    .line 46
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 47
    .line 48
    .line 49
    iget p0, p0, Lyyds/ᛲᛳᛱᛵ;->ᛱᲈᲁ:I

    .line 50
    .line 51
    invoke-virtual {v3, p0}, Landroid/graphics/Paint;->setColor(I)V

    .line 52
    .line 53
    .line 54
    const/16 p0, 0xeb

    .line 55
    .line 56
    invoke-virtual {v3, p0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 57
    .line 58
    .line 59
    const/high16 p0, 0x3f800000    # 1.0f

    .line 60
    .line 61
    mul-float/2addr v0, p0

    .line 62
    invoke-virtual {p1, v1, v0, v0, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final ᲇᲈᛵᛷ(Lyyds/ᛳᲀᛵᛷ;J)V
    .locals 6

    .line 1
    const-wide v0, -0x36fe3e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lyyds/ᛲᛳᛱᛵ;->ᛲᛲᲈᲈ:Lyyds/ᛲᛳᛵᛱ;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lyyds/ᛲᛳᛱᛵ;->ᛷᛲᲈᛱ:Lyyds/ᛳᲀᛵᛷ;

    .line 15
    .line 16
    if-eq v1, p1, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v1, 0x0

    .line 21
    :goto_0
    iput-object p1, p0, Lyyds/ᛲᛳᛱᛵ;->ᛷᛲᲈᛱ:Lyyds/ᛳᲀᛵᛷ;

    .line 22
    .line 23
    invoke-static {p1}, Lyyds/ᛲᛳᛱᛵ;->ᛲᲈᲁ(Lyyds/ᛳᲀᛵᛷ;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {p0, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 28
    .line 29
    .line 30
    const-wide/16 v2, 0x0

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-static {p1}, Lyyds/ᛲᛳᛱᛵ;->ᲀᛲᛳᲀ(Lyyds/ᛳᲀᛵᛷ;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 41
    .line 42
    .line 43
    move-result-wide v4

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    move-wide v4, v2

    .line 46
    :goto_1
    iput-wide v4, p0, Lyyds/ᛲᛳᛱᛵ;->ᛷᛵᲇᲀ:J

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    invoke-static {p1}, Lyyds/ᛲᛳᛱᛵ;->ᲀᛲᛳᲀ(Lyyds/ᛳᲀᛵᛷ;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_3

    .line 54
    .line 55
    iget-wide v4, p0, Lyyds/ᛲᛳᛱᛵ;->ᛷᛵᲇᲀ:J

    .line 56
    .line 57
    cmp-long v1, v4, v2

    .line 58
    .line 59
    if-nez v1, :cond_3

    .line 60
    .line 61
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 62
    .line 63
    .line 64
    move-result-wide v4

    .line 65
    iput-wide v4, p0, Lyyds/ᛲᛳᛱᛵ;->ᛷᛵᲇᲀ:J

    .line 66
    .line 67
    :cond_3
    :goto_2
    sget-object v1, Lyyds/ᛳᲀᛵᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛵᛷ;

    .line 68
    .line 69
    if-eq p1, v1, :cond_4

    .line 70
    .line 71
    cmp-long p1, p2, v2

    .line 72
    .line 73
    if-lez p1, :cond_4

    .line 74
    .line 75
    invoke-virtual {p0, v0, p2, p3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 76
    .line 77
    .line 78
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 79
    .line 80
    .line 81
    return-void
.end method
