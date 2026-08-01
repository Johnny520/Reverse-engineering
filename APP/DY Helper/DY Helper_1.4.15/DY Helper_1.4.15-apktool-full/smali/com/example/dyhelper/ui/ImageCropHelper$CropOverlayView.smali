.class final Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;
.super Landroid/view/View;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final synthetic χ:I


# instance fields
.field public final ε:Landroid/graphics/Rect;

.field public final ζ:I

.field public final η:I

.field public θ:Landroid/graphics/Bitmap;

.field public final ι:Landroid/graphics/Paint;

.field public final κ:Landroid/graphics/Paint;

.field public final λ:Landroid/graphics/Paint;

.field public final μ:Landroid/graphics/Paint;

.field public final ν:Landroid/graphics/Paint;

.field public final ξ:Landroid/graphics/Matrix;

.field public ο:F

.field public π:F

.field public final ρ:F

.field public final σ:Landroid/view/ScaleGestureDetector;

.field public τ:F

.field public υ:F

.field public φ:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/graphics/Bitmap;Landroid/graphics/Rect;II)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    iput-object p3, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->ε:Landroid/graphics/Rect;

    .line 8
    .line 9
    iput p4, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->ζ:I

    .line 10
    .line 11
    iput p5, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->η:I

    .line 12
    .line 13
    iput-object p2, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->θ:Landroid/graphics/Bitmap;

    .line 14
    .line 15
    new-instance p2, Landroid/graphics/Paint;

    .line 16
    .line 17
    const/4 p3, 0x2

    .line 18
    invoke-direct {p2, p3}, Landroid/graphics/Paint;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object p2, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->ι:Landroid/graphics/Paint;

    .line 22
    .line 23
    new-instance p2, Landroid/graphics/Paint;

    .line 24
    .line 25
    const/4 p3, 0x1

    .line 26
    invoke-direct {p2, p3}, Landroid/graphics/Paint;-><init>(I)V

    .line 27
    .line 28
    .line 29
    const/16 p4, 0xa0

    .line 30
    .line 31
    const/4 p5, 0x0

    .line 32
    invoke-static {p4, p5, p5, p5}, Landroid/graphics/Color;->argb(IIII)I

    .line 33
    .line 34
    .line 35
    move-result p4

    .line 36
    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 37
    .line 38
    .line 39
    sget-object p4, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 40
    .line 41
    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 42
    .line 43
    .line 44
    iput-object p2, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->κ:Landroid/graphics/Paint;

    .line 45
    .line 46
    new-instance p2, Landroid/graphics/Paint;

    .line 47
    .line 48
    invoke-direct {p2, p3}, Landroid/graphics/Paint;-><init>(I)V

    .line 49
    .line 50
    .line 51
    const/16 p4, 0xdc

    .line 52
    .line 53
    const/16 p5, 0xff

    .line 54
    .line 55
    invoke-static {p4, p5, p5, p5}, Landroid/graphics/Color;->argb(IIII)I

    .line 56
    .line 57
    .line 58
    move-result p4

    .line 59
    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 60
    .line 61
    .line 62
    sget-object p4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 63
    .line 64
    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 65
    .line 66
    .line 67
    const/high16 v0, 0x40000000    # 2.0f

    .line 68
    .line 69
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 70
    .line 71
    .line 72
    iput-object p2, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->λ:Landroid/graphics/Paint;

    .line 73
    .line 74
    new-instance p2, Landroid/graphics/Paint;

    .line 75
    .line 76
    invoke-direct {p2, p3}, Landroid/graphics/Paint;-><init>(I)V

    .line 77
    .line 78
    .line 79
    const/4 v0, -0x1

    .line 80
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 84
    .line 85
    .line 86
    const/high16 v0, 0x40800000    # 4.0f

    .line 87
    .line 88
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 89
    .line 90
    .line 91
    iput-object p2, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->μ:Landroid/graphics/Paint;

    .line 92
    .line 93
    new-instance p2, Landroid/graphics/Paint;

    .line 94
    .line 95
    invoke-direct {p2, p3}, Landroid/graphics/Paint;-><init>(I)V

    .line 96
    .line 97
    .line 98
    const/16 p3, 0x50

    .line 99
    .line 100
    invoke-static {p3, p5, p5, p5}, Landroid/graphics/Color;->argb(IIII)I

    .line 101
    .line 102
    .line 103
    move-result p3

    .line 104
    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 108
    .line 109
    .line 110
    const/high16 p3, 0x3f800000    # 1.0f

    .line 111
    .line 112
    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 113
    .line 114
    .line 115
    iput-object p2, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->ν:Landroid/graphics/Paint;

    .line 116
    .line 117
    new-instance p2, Landroid/graphics/Matrix;

    .line 118
    .line 119
    invoke-direct {p2}, Landroid/graphics/Matrix;-><init>()V

    .line 120
    .line 121
    .line 122
    iput-object p2, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->ξ:Landroid/graphics/Matrix;

    .line 123
    .line 124
    iput p3, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->ο:F

    .line 125
    .line 126
    iput p3, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->π:F

    .line 127
    .line 128
    const/high16 p2, 0x40a00000    # 5.0f

    .line 129
    .line 130
    iput p2, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->ρ:F

    .line 131
    .line 132
    invoke-virtual {p0}, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->β()V

    .line 133
    .line 134
    .line 135
    new-instance p2, Landroid/view/ScaleGestureDetector;

    .line 136
    .line 137
    new-instance p3, Lcom/example/dyhelper/ui/τ;

    .line 138
    .line 139
    invoke-direct {p3, p0}, Lcom/example/dyhelper/ui/τ;-><init>(Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;)V

    .line 140
    .line 141
    .line 142
    invoke-direct {p2, p1, p3}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    .line 143
    .line 144
    .line 145
    iput-object p2, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->σ:Landroid/view/ScaleGestureDetector;

    .line 146
    .line 147
    return-void
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->θ:Landroid/graphics/Bitmap;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->ξ:Landroid/graphics/Matrix;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->ι:Landroid/graphics/Paint;

    .line 9
    .line 10
    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->ε:Landroid/graphics/Rect;

    .line 14
    .line 15
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 16
    .line 17
    int-to-float v3, v1

    .line 18
    iget v1, v0, Landroid/graphics/Rect;->top:I

    .line 19
    .line 20
    int-to-float v6, v1

    .line 21
    iget v1, v0, Landroid/graphics/Rect;->right:I

    .line 22
    .line 23
    int-to-float v1, v1

    .line 24
    iget v2, v0, Landroid/graphics/Rect;->bottom:I

    .line 25
    .line 26
    int-to-float v2, v2

    .line 27
    iget v4, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->ζ:I

    .line 28
    .line 29
    int-to-float v7, v4

    .line 30
    iget v4, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->η:I

    .line 31
    .line 32
    int-to-float v11, v4

    .line 33
    const/4 v5, 0x0

    .line 34
    move v4, v6

    .line 35
    const/4 v6, 0x0

    .line 36
    iget-object v9, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->κ:Landroid/graphics/Paint;

    .line 37
    .line 38
    move v8, v4

    .line 39
    move-object v4, p1

    .line 40
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 41
    .line 42
    .line 43
    move v6, v8

    .line 44
    const/4 v8, 0x0

    .line 45
    move v10, v7

    .line 46
    move-object v12, v9

    .line 47
    move v9, v2

    .line 48
    move-object v7, v4

    .line 49
    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 50
    .line 51
    .line 52
    move v5, v3

    .line 53
    move-object v2, v7

    .line 54
    move-object v7, v12

    .line 55
    const/4 v3, 0x0

    .line 56
    move v4, v6

    .line 57
    move v6, v9

    .line 58
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 59
    .line 60
    .line 61
    move v3, v5

    .line 62
    move v8, v6

    .line 63
    move-object v9, v7

    .line 64
    move v7, v10

    .line 65
    move v5, v1

    .line 66
    move v6, v4

    .line 67
    move-object v4, v2

    .line 68
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 69
    .line 70
    .line 71
    move p1, v5

    .line 72
    move v9, v8

    .line 73
    iget-object v1, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->λ:Landroid/graphics/Paint;

    .line 74
    .line 75
    invoke-virtual {v2, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    int-to-float v1, v1

    .line 83
    const/high16 v4, 0x40400000    # 3.0f

    .line 84
    .line 85
    div-float/2addr v1, v4

    .line 86
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    int-to-float v0, v0

    .line 91
    div-float/2addr v0, v4

    .line 92
    const/4 v4, 0x1

    .line 93
    move v10, v4

    .line 94
    :goto_0
    const/4 v4, 0x3

    .line 95
    if-ge v10, v4, :cond_0

    .line 96
    .line 97
    int-to-float v11, v10

    .line 98
    mul-float v4, v1, v11

    .line 99
    .line 100
    add-float v5, v4, v3

    .line 101
    .line 102
    iget-object v7, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->ν:Landroid/graphics/Paint;

    .line 103
    .line 104
    move v4, v9

    .line 105
    move-object v9, v7

    .line 106
    move v7, v5

    .line 107
    move v8, v4

    .line 108
    move-object v4, v2

    .line 109
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 110
    .line 111
    .line 112
    move v12, v8

    .line 113
    move v8, v6

    .line 114
    mul-float/2addr v11, v0

    .line 115
    add-float v4, v11, v8

    .line 116
    .line 117
    move v6, v4

    .line 118
    move v5, p1

    .line 119
    move-object v7, v9

    .line 120
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 121
    .line 122
    .line 123
    add-int/lit8 v10, v10, 0x1

    .line 124
    .line 125
    move v6, v8

    .line 126
    move v9, v12

    .line 127
    goto :goto_0

    .line 128
    :cond_0
    move v8, v6

    .line 129
    move v12, v9

    .line 130
    const/high16 v0, 0x41c00000    # 24.0f

    .line 131
    .line 132
    add-float v5, v3, v0

    .line 133
    .line 134
    iget-object v7, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->μ:Landroid/graphics/Paint;

    .line 135
    .line 136
    move v4, v8

    .line 137
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 138
    .line 139
    .line 140
    move v6, v4

    .line 141
    move p0, v5

    .line 142
    add-float v8, v6, v0

    .line 143
    .line 144
    move v5, v3

    .line 145
    move v6, v8

    .line 146
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 147
    .line 148
    .line 149
    move v1, v6

    .line 150
    move v6, v4

    .line 151
    sub-float v10, p1, v0

    .line 152
    .line 153
    move v8, v6

    .line 154
    move v5, p1

    .line 155
    move-object v4, v2

    .line 156
    move-object v9, v7

    .line 157
    move v7, v10

    .line 158
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 159
    .line 160
    .line 161
    move-object v7, v9

    .line 162
    move v8, v1

    .line 163
    move v7, p1

    .line 164
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 165
    .line 166
    .line 167
    move-object v7, v9

    .line 168
    move v6, v12

    .line 169
    move v5, p0

    .line 170
    move v4, v12

    .line 171
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 172
    .line 173
    .line 174
    move v9, v4

    .line 175
    sub-float v6, v9, v0

    .line 176
    .line 177
    move v5, v3

    .line 178
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 179
    .line 180
    .line 181
    move v11, v9

    .line 182
    move v8, p1

    .line 183
    move-object v12, v7

    .line 184
    move-object v7, v2

    .line 185
    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 186
    .line 187
    .line 188
    move v5, v8

    .line 189
    move-object v7, v12

    .line 190
    move v10, v5

    .line 191
    move v11, v6

    .line 192
    move-object v7, v2

    .line 193
    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 194
    .line 195
    .line 196
    return-void
.end method

.method public final onMeasure(II)V
    .locals 0

    .line 1
    iget p1, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->ζ:I

    .line 2
    .line 3
    iget p2, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->η:I

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->σ:Landroid/view/ScaleGestureDetector;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    and-int/lit16 v0, v0, 0xff

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    if-eqz v0, :cond_4

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-eq v0, v1, :cond_3

    .line 20
    .line 21
    const/4 v3, 0x2

    .line 22
    if-eq v0, v3, :cond_1

    .line 23
    .line 24
    const/4 p1, 0x3

    .line 25
    if-eq v0, p1, :cond_3

    .line 26
    .line 27
    const/4 p1, 0x5

    .line 28
    if-eq v0, p1, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iput-boolean v2, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->φ:Z

    .line 32
    .line 33
    return v1

    .line 34
    :cond_1
    iget-boolean v0, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->φ:Z

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-ne v0, v1, :cond_2

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget v2, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->τ:F

    .line 49
    .line 50
    sub-float/2addr v0, v2

    .line 51
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    iget v3, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->υ:F

    .line 56
    .line 57
    sub-float/2addr v2, v3

    .line 58
    iget-object v3, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->ξ:Landroid/graphics/Matrix;

    .line 59
    .line 60
    invoke-virtual {v3, v0, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->α()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    iput v0, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->τ:F

    .line 74
    .line 75
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    iput p1, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->υ:F

    .line 80
    .line 81
    :cond_2
    :goto_0
    return v1

    .line 82
    :cond_3
    iput-boolean v2, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->φ:Z

    .line 83
    .line 84
    return v1

    .line 85
    :cond_4
    iput-boolean v1, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->φ:Z

    .line 86
    .line 87
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    iput v0, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->τ:F

    .line 92
    .line 93
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    iput p1, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->υ:F

    .line 98
    .line 99
    return v1
.end method

.method public final α()V
    .locals 7

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->θ:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    int-to-float v1, v1

    .line 10
    iget-object v2, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->θ:Landroid/graphics/Bitmap;

    .line 11
    .line 12
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    int-to-float v2, v2

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v0, v3, v3, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->ξ:Landroid/graphics/Matrix;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    iget-object p0, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->ε:Landroid/graphics/Rect;

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    int-to-float v4, v4

    .line 37
    cmpg-float v2, v2, v4

    .line 38
    .line 39
    if-gez v2, :cond_0

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/graphics/Rect;->centerX()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    int-to-float v2, v2

    .line 46
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    :goto_0
    sub-float/2addr v2, v4

    .line 51
    goto :goto_2

    .line 52
    :cond_0
    iget v2, v0, Landroid/graphics/RectF;->left:F

    .line 53
    .line 54
    iget v4, p0, Landroid/graphics/Rect;->left:I

    .line 55
    .line 56
    int-to-float v5, v4

    .line 57
    cmpl-float v5, v2, v5

    .line 58
    .line 59
    if-lez v5, :cond_1

    .line 60
    .line 61
    int-to-float v4, v4

    .line 62
    sub-float/2addr v4, v2

    .line 63
    move v2, v4

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    move v2, v3

    .line 66
    :goto_1
    iget v4, v0, Landroid/graphics/RectF;->right:F

    .line 67
    .line 68
    iget v5, p0, Landroid/graphics/Rect;->right:I

    .line 69
    .line 70
    int-to-float v6, v5

    .line 71
    cmpg-float v6, v4, v6

    .line 72
    .line 73
    if-gez v6, :cond_2

    .line 74
    .line 75
    int-to-float v2, v5

    .line 76
    goto :goto_0

    .line 77
    :cond_2
    :goto_2
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    int-to-float v5, v5

    .line 86
    cmpg-float v4, v4, v5

    .line 87
    .line 88
    if-gez v4, :cond_3

    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/graphics/Rect;->centerY()I

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    int-to-float p0, p0

    .line 95
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    :goto_3
    sub-float/2addr p0, v0

    .line 100
    goto :goto_5

    .line 101
    :cond_3
    iget v4, v0, Landroid/graphics/RectF;->top:F

    .line 102
    .line 103
    iget v5, p0, Landroid/graphics/Rect;->top:I

    .line 104
    .line 105
    int-to-float v6, v5

    .line 106
    cmpl-float v6, v4, v6

    .line 107
    .line 108
    if-lez v6, :cond_4

    .line 109
    .line 110
    int-to-float v5, v5

    .line 111
    sub-float/2addr v5, v4

    .line 112
    goto :goto_4

    .line 113
    :cond_4
    move v5, v3

    .line 114
    :goto_4
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 115
    .line 116
    iget p0, p0, Landroid/graphics/Rect;->bottom:I

    .line 117
    .line 118
    int-to-float v4, p0

    .line 119
    cmpg-float v4, v0, v4

    .line 120
    .line 121
    if-gez v4, :cond_5

    .line 122
    .line 123
    int-to-float p0, p0

    .line 124
    goto :goto_3

    .line 125
    :cond_5
    move p0, v5

    .line 126
    :goto_5
    cmpg-float v0, v2, v3

    .line 127
    .line 128
    if-nez v0, :cond_6

    .line 129
    .line 130
    cmpg-float v0, p0, v3

    .line 131
    .line 132
    if-nez v0, :cond_6

    .line 133
    .line 134
    return-void

    .line 135
    :cond_6
    invoke-virtual {v1, v2, p0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 136
    .line 137
    .line 138
    return-void
.end method

.method public final β()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->ξ:Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->ε:Landroid/graphics/Rect;

    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    int-to-float v2, v2

    .line 13
    iget-object v3, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->θ:Landroid/graphics/Bitmap;

    .line 14
    .line 15
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    int-to-float v3, v3

    .line 20
    div-float/2addr v2, v3

    .line 21
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    int-to-float v3, v3

    .line 26
    iget-object v4, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->θ:Landroid/graphics/Bitmap;

    .line 27
    .line 28
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    int-to-float v4, v4

    .line 33
    div-float/2addr v3, v4

    .line 34
    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    iput v2, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->ο:F

    .line 39
    .line 40
    iput v2, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->π:F

    .line 41
    .line 42
    invoke-virtual {v1}, Landroid/graphics/Rect;->centerX()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    int-to-float v2, v2

    .line 47
    iget-object v3, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->θ:Landroid/graphics/Bitmap;

    .line 48
    .line 49
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    int-to-float v3, v3

    .line 54
    iget v4, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->ο:F

    .line 55
    .line 56
    mul-float/2addr v3, v4

    .line 57
    const/high16 v4, 0x40000000    # 2.0f

    .line 58
    .line 59
    div-float/2addr v3, v4

    .line 60
    sub-float/2addr v2, v3

    .line 61
    invoke-virtual {v1}, Landroid/graphics/Rect;->centerY()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    int-to-float v1, v1

    .line 66
    iget-object v3, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->θ:Landroid/graphics/Bitmap;

    .line 67
    .line 68
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    int-to-float v3, v3

    .line 73
    iget p0, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->ο:F

    .line 74
    .line 75
    mul-float/2addr v3, p0

    .line 76
    div-float/2addr v3, v4

    .line 77
    sub-float/2addr v1, v3

    .line 78
    invoke-virtual {v0, p0, p0}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 82
    .line 83
    .line 84
    return-void
.end method
