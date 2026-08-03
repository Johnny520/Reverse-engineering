.class public final L۟/s7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L۟/s7$f;,
        L۟/s7$e;
    }
.end annotation


# instance fields
.field public ۥ:Landroid/view/animation/AccelerateDecelerateInterpolator;

.field public ۥ۟:I

.field public ۥ۟۟:F

.field public ۥ۟۠:F

.field public ۥ۟ۡ:F

.field public ۥ۟ۢ:Z

.field public ۥۣ۟:Z

.field public ۥ۟ۤ:Landroid/widget/ImageView;

.field public ۥ۟ۥ:Landroid/view/GestureDetector;

.field public ۥ۟ۦ:L۟/b1;

.field public final ۥ۟ۧ:Landroid/graphics/Matrix;

.field public final ۥ۟ۨ:Landroid/graphics/Matrix;

.field public final ۥ۠:Landroid/graphics/Matrix;

.field public final ۥ۠۟:Landroid/graphics/RectF;

.field public final ۥ۠۠:[F

.field public ۥ۠ۡ:L۟/f7;

.field public ۥ۠ۢ:Landroid/view/View$OnClickListener;

.field public ۥۣ۠:Landroid/view/View$OnLongClickListener;

.field public ۥ۠ۤ:L۟/s7$f;

.field public ۥ۠ۥ:I

.field public ۥ۠ۦ:I

.field public ۥ۠ۧ:Z

.field public ۥ۠ۨ:Landroid/widget/ImageView$ScaleType;

.field public ۥۡ:L۟/s7$a;


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    iput-object v0, p0, L۟/s7;->ۥ:Landroid/view/animation/AccelerateDecelerateInterpolator;

    const/16 v0, 0xc8

    iput v0, p0, L۟/s7;->ۥ۟:I

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, L۟/s7;->ۥ۟۟:F

    const/high16 v0, 0x3fe00000    # 1.75f

    iput v0, p0, L۟/s7;->ۥ۟۠:F

    const/high16 v0, 0x40400000    # 3.0f

    iput v0, p0, L۟/s7;->ۥ۟ۡ:F

    const/4 v0, 0x1

    iput-boolean v0, p0, L۟/s7;->ۥ۟ۢ:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, L۟/s7;->ۥۣ۟:Z

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, L۟/s7;->ۥ۟ۧ:Landroid/graphics/Matrix;

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, L۟/s7;->ۥ۟ۨ:Landroid/graphics/Matrix;

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, L۟/s7;->ۥ۠:Landroid/graphics/Matrix;

    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    iput-object v1, p0, L۟/s7;->ۥ۠۟:Landroid/graphics/RectF;

    const/16 v1, 0x9

    new-array v1, v1, [F

    iput-object v1, p0, L۟/s7;->ۥ۠۠:[F

    const/4 v1, 0x2

    iput v1, p0, L۟/s7;->ۥ۠ۥ:I

    iput v1, p0, L۟/s7;->ۥ۠ۦ:I

    iput-boolean v0, p0, L۟/s7;->ۥ۠ۧ:Z

    sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    iput-object v0, p0, L۟/s7;->ۥ۠ۨ:Landroid/widget/ImageView$ScaleType;

    new-instance v0, L۟/s7$a;

    invoke-direct {v0, p0}, L۟/s7$a;-><init>(L۟/s7;)V

    iput-object v0, p0, L۟/s7;->ۥۡ:L۟/s7$a;

    iput-object p1, p0, L۟/s7;->ۥ۟ۤ:Landroid/widget/ImageView;

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    invoke-virtual {p1, p0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    invoke-virtual {p1}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, L۟/b1;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, L۟/s7;->ۥۡ:L۟/s7$a;

    invoke-direct {v0, v1, v2}, L۟/b1;-><init>(Landroid/content/Context;L۟/y6;)V

    iput-object v0, p0, L۟/s7;->ۥ۟ۦ:L۟/b1;

    new-instance v0, Landroid/view/GestureDetector;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    new-instance v1, L۟/s7$b;

    invoke-direct {v1, p0}, L۟/s7$b;-><init>(L۟/s7;)V

    invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, L۟/s7;->ۥ۟ۥ:Landroid/view/GestureDetector;

    new-instance p1, L۟/s7$c;

    invoke-direct {p1, p0}, L۟/s7$c;-><init>(L۟/s7;)V

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V

    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    if-ne p2, p6, :cond_0

    if-ne p3, p7, :cond_0

    if-ne p4, p8, :cond_0

    if-eq p5, p9, :cond_1

    :cond_0
    iget-object p1, p0, L۟/s7;->ۥ۟ۤ:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, L۟/s7;->ۥ۟ۥ(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    return-void
.end method

.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 10

    .line 1
    iget-boolean v0, p0, L۟/s7;->ۥ۠ۧ:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_a

    .line 6
    .line 7
    move-object v0, p1

    .line 8
    check-cast v0, Landroid/widget/ImageView;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    move v0, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v1

    .line 19
    :goto_0
    if-eqz v0, :cond_a

    .line 20
    .line 21
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    if-eq v0, v2, :cond_1

    .line 28
    .line 29
    const/4 v3, 0x3

    .line 30
    if-eq v0, v3, :cond_1

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_1
    invoke-virtual {p0}, L۟/s7;->ۥ۟ۢ()F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget v3, p0, L۟/s7;->ۥ۟۟:F

    .line 38
    .line 39
    cmpg-float v0, v0, v3

    .line 40
    .line 41
    if-gez v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0}, L۟/s7;->ۥ۟۟()Landroid/graphics/RectF;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-eqz v0, :cond_5

    .line 48
    .line 49
    new-instance v9, L۟/s7$e;

    .line 50
    .line 51
    invoke-virtual {p0}, L۟/s7;->ۥ۟ۢ()F

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    iget v6, p0, L۟/s7;->ۥ۟۟:F

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    move-object v3, v9

    .line 66
    move-object v4, p0

    .line 67
    invoke-direct/range {v3 .. v8}, L۟/s7$e;-><init>(L۟/s7;FFFF)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    invoke-virtual {p0}, L۟/s7;->ۥ۟ۢ()F

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    iget v3, p0, L۟/s7;->ۥ۟ۡ:F

    .line 76
    .line 77
    cmpl-float v0, v0, v3

    .line 78
    .line 79
    if-lez v0, :cond_5

    .line 80
    .line 81
    invoke-virtual {p0}, L۟/s7;->ۥ۟۟()Landroid/graphics/RectF;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-eqz v0, :cond_5

    .line 86
    .line 87
    new-instance v9, L۟/s7$e;

    .line 88
    .line 89
    invoke-virtual {p0}, L۟/s7;->ۥ۟ۢ()F

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    iget v6, p0, L۟/s7;->ۥ۟ۡ:F

    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    move-object v3, v9

    .line 104
    move-object v4, p0

    .line 105
    invoke-direct/range {v3 .. v8}, L۟/s7$e;-><init>(L۟/s7;FFFF)V

    .line 106
    .line 107
    .line 108
    :goto_1
    invoke-virtual {p1, v9}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 109
    .line 110
    .line 111
    move p1, v2

    .line 112
    goto :goto_3

    .line 113
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    if-eqz p1, :cond_4

    .line 118
    .line 119
    invoke-interface {p1, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 120
    .line 121
    .line 122
    :cond_4
    iget-object p1, p0, L۟/s7;->ۥ۠ۤ:L۟/s7$f;

    .line 123
    .line 124
    if-eqz p1, :cond_5

    .line 125
    .line 126
    iget-object p1, p1, L۟/s7$f;->ۥ:Landroid/widget/OverScroller;

    .line 127
    .line 128
    invoke-virtual {p1, v2}, Landroid/widget/OverScroller;->forceFinished(Z)V

    .line 129
    .line 130
    .line 131
    const/4 p1, 0x0

    .line 132
    iput-object p1, p0, L۟/s7;->ۥ۠ۤ:L۟/s7$f;

    .line 133
    .line 134
    :cond_5
    :goto_2
    move p1, v1

    .line 135
    :goto_3
    iget-object v0, p0, L۟/s7;->ۥ۟ۦ:L۟/b1;

    .line 136
    .line 137
    if-eqz v0, :cond_9

    .line 138
    .line 139
    iget-object p1, v0, L۟/b1;->ۥ۟۟:Landroid/view/ScaleGestureDetector;

    .line 140
    .line 141
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    iget-object v0, p0, L۟/s7;->ۥ۟ۦ:L۟/b1;

    .line 146
    .line 147
    iget-boolean v3, v0, L۟/b1;->ۥ۟ۡ:Z

    .line 148
    .line 149
    :try_start_0
    iget-object v4, v0, L۟/b1;->ۥ۟۟:Landroid/view/ScaleGestureDetector;

    .line 150
    .line 151
    invoke-virtual {v4, p2}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, p2}, L۟/b1;->ۥ(Landroid/view/MotionEvent;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 155
    .line 156
    .line 157
    :catch_0
    if-nez p1, :cond_6

    .line 158
    .line 159
    iget-object p1, p0, L۟/s7;->ۥ۟ۦ:L۟/b1;

    .line 160
    .line 161
    iget-object p1, p1, L۟/b1;->ۥ۟۟:Landroid/view/ScaleGestureDetector;

    .line 162
    .line 163
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    if-nez p1, :cond_6

    .line 168
    .line 169
    move p1, v2

    .line 170
    goto :goto_4

    .line 171
    :cond_6
    move p1, v1

    .line 172
    :goto_4
    if-nez v3, :cond_7

    .line 173
    .line 174
    iget-object v0, p0, L۟/s7;->ۥ۟ۦ:L۟/b1;

    .line 175
    .line 176
    iget-boolean v0, v0, L۟/b1;->ۥ۟ۡ:Z

    .line 177
    .line 178
    if-nez v0, :cond_7

    .line 179
    .line 180
    move v0, v2

    .line 181
    goto :goto_5

    .line 182
    :cond_7
    move v0, v1

    .line 183
    :goto_5
    if-eqz p1, :cond_8

    .line 184
    .line 185
    if-eqz v0, :cond_8

    .line 186
    .line 187
    move v1, v2

    .line 188
    :cond_8
    iput-boolean v1, p0, L۟/s7;->ۥۣ۟:Z

    .line 189
    .line 190
    move v1, v2

    .line 191
    goto :goto_6

    .line 192
    :cond_9
    move v1, p1

    .line 193
    :goto_6
    iget-object p1, p0, L۟/s7;->ۥ۟ۥ:Landroid/view/GestureDetector;

    .line 194
    .line 195
    if-eqz p1, :cond_a

    .line 196
    .line 197
    invoke-virtual {p1, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 198
    .line 199
    .line 200
    move-result p1

    .line 201
    if-eqz p1, :cond_a

    .line 202
    .line 203
    move v1, v2

    .line 204
    :cond_a
    return v1
.end method

.method public final ۥ()V
    .locals 2

    invoke-virtual {p0}, L۟/s7;->ۥ۟()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, L۟/s7;->ۥ۟ۡ()Landroid/graphics/Matrix;

    move-result-object v0

    iget-object v1, p0, L۟/s7;->ۥ۟ۤ:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    :cond_0
    return-void
.end method

.method public final ۥ۟()Z
    .locals 13

    .line 1
    invoke-virtual {p0}, L۟/s7;->ۥ۟ۡ()Landroid/graphics/Matrix;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, L۟/s7;->ۥ۟۠(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    iget-object v4, p0, L۟/s7;->ۥ۟ۤ:Landroid/widget/ImageView;

    .line 22
    .line 23
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    invoke-virtual {v4}, Landroid/view/View;->getPaddingTop()I

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    sub-int/2addr v5, v6

    .line 32
    invoke-virtual {v4}, Landroid/view/View;->getPaddingBottom()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    sub-int/2addr v5, v4

    .line 37
    int-to-float v4, v5

    .line 38
    cmpg-float v5, v2, v4

    .line 39
    .line 40
    const/4 v6, -0x1

    .line 41
    const/high16 v7, 0x40000000    # 2.0f

    .line 42
    .line 43
    const/4 v8, 0x3

    .line 44
    const/4 v9, 0x1

    .line 45
    const/4 v10, 0x2

    .line 46
    const/4 v11, 0x0

    .line 47
    if-gtz v5, :cond_3

    .line 48
    .line 49
    sget-object v5, L۟/s7$d;->ۥ:[I

    .line 50
    .line 51
    iget-object v12, p0, L۟/s7;->ۥ۠ۨ:Landroid/widget/ImageView$ScaleType;

    .line 52
    .line 53
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 54
    .line 55
    .line 56
    move-result v12

    .line 57
    aget v5, v5, v12

    .line 58
    .line 59
    if-eq v5, v10, :cond_2

    .line 60
    .line 61
    sub-float/2addr v4, v2

    .line 62
    if-eq v5, v8, :cond_1

    .line 63
    .line 64
    div-float/2addr v4, v7

    .line 65
    :cond_1
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 66
    .line 67
    sub-float/2addr v4, v2

    .line 68
    goto :goto_0

    .line 69
    :cond_2
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 70
    .line 71
    neg-float v4, v2

    .line 72
    :goto_0
    iput v10, p0, L۟/s7;->ۥ۠ۦ:I

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 76
    .line 77
    cmpl-float v5, v2, v11

    .line 78
    .line 79
    if-lez v5, :cond_4

    .line 80
    .line 81
    iput v1, p0, L۟/s7;->ۥ۠ۦ:I

    .line 82
    .line 83
    neg-float v4, v2

    .line 84
    goto :goto_1

    .line 85
    :cond_4
    iget v2, v0, Landroid/graphics/RectF;->bottom:F

    .line 86
    .line 87
    cmpg-float v5, v2, v4

    .line 88
    .line 89
    if-gez v5, :cond_5

    .line 90
    .line 91
    iput v9, p0, L۟/s7;->ۥ۠ۦ:I

    .line 92
    .line 93
    sub-float/2addr v4, v2

    .line 94
    goto :goto_1

    .line 95
    :cond_5
    iput v6, p0, L۟/s7;->ۥ۠ۦ:I

    .line 96
    .line 97
    move v4, v11

    .line 98
    :goto_1
    iget-object v2, p0, L۟/s7;->ۥ۟ۤ:Landroid/widget/ImageView;

    .line 99
    .line 100
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    .line 105
    .line 106
    .line 107
    move-result v12

    .line 108
    sub-int/2addr v5, v12

    .line 109
    invoke-virtual {v2}, Landroid/view/View;->getPaddingRight()I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    sub-int/2addr v5, v2

    .line 114
    int-to-float v2, v5

    .line 115
    cmpg-float v5, v3, v2

    .line 116
    .line 117
    if-gtz v5, :cond_8

    .line 118
    .line 119
    sget-object v1, L۟/s7$d;->ۥ:[I

    .line 120
    .line 121
    iget-object v5, p0, L۟/s7;->ۥ۠ۨ:Landroid/widget/ImageView$ScaleType;

    .line 122
    .line 123
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    aget v1, v1, v5

    .line 128
    .line 129
    if-eq v1, v10, :cond_7

    .line 130
    .line 131
    sub-float/2addr v2, v3

    .line 132
    if-eq v1, v8, :cond_6

    .line 133
    .line 134
    div-float/2addr v2, v7

    .line 135
    :cond_6
    iget v0, v0, Landroid/graphics/RectF;->left:F

    .line 136
    .line 137
    sub-float/2addr v2, v0

    .line 138
    move v11, v2

    .line 139
    goto :goto_2

    .line 140
    :cond_7
    iget v0, v0, Landroid/graphics/RectF;->left:F

    .line 141
    .line 142
    neg-float v0, v0

    .line 143
    move v11, v0

    .line 144
    :goto_2
    iput v10, p0, L۟/s7;->ۥ۠ۥ:I

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_8
    iget v3, v0, Landroid/graphics/RectF;->left:F

    .line 148
    .line 149
    cmpl-float v5, v3, v11

    .line 150
    .line 151
    if-lez v5, :cond_9

    .line 152
    .line 153
    iput v1, p0, L۟/s7;->ۥ۠ۥ:I

    .line 154
    .line 155
    neg-float v11, v3

    .line 156
    goto :goto_3

    .line 157
    :cond_9
    iget v0, v0, Landroid/graphics/RectF;->right:F

    .line 158
    .line 159
    cmpg-float v1, v0, v2

    .line 160
    .line 161
    if-gez v1, :cond_a

    .line 162
    .line 163
    sub-float v11, v2, v0

    .line 164
    .line 165
    iput v9, p0, L۟/s7;->ۥ۠ۥ:I

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_a
    iput v6, p0, L۟/s7;->ۥ۠ۥ:I

    .line 169
    .line 170
    :goto_3
    iget-object v0, p0, L۟/s7;->ۥ۠:Landroid/graphics/Matrix;

    .line 171
    .line 172
    invoke-virtual {v0, v11, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 173
    .line 174
    .line 175
    return v9
.end method

.method public final ۥ۟۟()Landroid/graphics/RectF;
    .locals 1

    invoke-virtual {p0}, L۟/s7;->ۥ۟()Z

    invoke-virtual {p0}, L۟/s7;->ۥ۟ۡ()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p0, v0}, L۟/s7;->ۥ۟۠(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۠(Landroid/graphics/Matrix;)Landroid/graphics/RectF;
    .locals 4

    iget-object v0, p0, L۟/s7;->ۥ۟ۤ:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, L۟/s7;->ۥ۠۟:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    int-to-float v0, v0

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v3, v2, v0}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v0, p0, L۟/s7;->ۥ۠۟:Landroid/graphics/RectF;

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    iget-object p1, p0, L۟/s7;->ۥ۠۟:Landroid/graphics/RectF;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۥ۟ۡ()Landroid/graphics/Matrix;
    .locals 2

    iget-object v0, p0, L۟/s7;->ۥ۟ۨ:Landroid/graphics/Matrix;

    iget-object v1, p0, L۟/s7;->ۥ۟ۧ:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object v0, p0, L۟/s7;->ۥ۟ۨ:Landroid/graphics/Matrix;

    iget-object v1, p0, L۟/s7;->ۥ۠:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    iget-object v0, p0, L۟/s7;->ۥ۟ۨ:Landroid/graphics/Matrix;

    return-object v0
.end method

.method public final ۥ۟ۢ()F
    .locals 6

    .line 1
    iget-object v0, p0, L۟/s7;->ۥ۠:Landroid/graphics/Matrix;

    .line 2
    .line 3
    iget-object v1, p0, L۟/s7;->ۥ۠۠:[F

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, L۟/s7;->ۥ۠۠:[F

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    aget v0, v0, v1

    .line 12
    .line 13
    float-to-double v0, v0

    .line 14
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    .line 15
    .line 16
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    double-to-float v0, v0

    .line 21
    iget-object v1, p0, L۟/s7;->ۥ۠:Landroid/graphics/Matrix;

    .line 22
    .line 23
    const/4 v4, 0x3

    .line 24
    iget-object v5, p0, L۟/s7;->ۥ۠۠:[F

    .line 25
    .line 26
    invoke-virtual {v1, v5}, Landroid/graphics/Matrix;->getValues([F)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, L۟/s7;->ۥ۠۠:[F

    .line 30
    .line 31
    aget v1, v1, v4

    .line 32
    .line 33
    float-to-double v4, v1

    .line 34
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 35
    .line 36
    .line 37
    move-result-wide v1

    .line 38
    double-to-float v1, v1

    .line 39
    add-float/2addr v0, v1

    .line 40
    float-to-double v0, v0

    .line 41
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    double-to-float v0, v0

    .line 46
    return v0
.end method

.method public final ۥۣ۟(FFFZ)V
    .locals 7

    iget v0, p0, L۟/s7;->ۥ۟۟:F

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_1

    iget v0, p0, L۟/s7;->ۥ۟ۡ:F

    cmpl-float v0, p1, v0

    if-gtz v0, :cond_1

    if-eqz p4, :cond_0

    iget-object p4, p0, L۟/s7;->ۥ۟ۤ:Landroid/widget/ImageView;

    new-instance v6, L۟/s7$e;

    invoke-virtual {p0}, L۟/s7;->ۥ۟ۢ()F

    move-result v2

    move-object v0, v6

    move-object v1, p0

    move v3, p1

    move v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, L۟/s7$e;-><init>(L۟/s7;FFFF)V

    invoke-virtual {p4, v6}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    iget-object p4, p0, L۟/s7;->ۥ۠:Landroid/graphics/Matrix;

    invoke-virtual {p4, p1, p1, p2, p3}, Landroid/graphics/Matrix;->setScale(FFFF)V

    invoke-virtual {p0}, L۟/s7;->ۥ()V

    :goto_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Scale must be within the range of minScale and maxScale"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ۟ۤ()V
    .locals 2

    .line 1
    iget-boolean v0, p0, L۟/s7;->ۥ۠ۧ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, L۟/s7;->ۥ۟ۤ:Landroid/widget/ImageView;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, v0}, L۟/s7;->ۥ۟ۥ(Landroid/graphics/drawable/Drawable;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, L۟/s7;->ۥ۠:Landroid/graphics/Matrix;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, L۟/s7;->ۥ۠:Landroid/graphics/Matrix;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, L۟/s7;->ۥ()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, L۟/s7;->ۥ۟ۡ()Landroid/graphics/Matrix;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v1, p0, L۟/s7;->ۥ۟ۤ:Landroid/widget/ImageView;

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, L۟/s7;->ۥ۟()Z

    .line 39
    .line 40
    .line 41
    :goto_0
    return-void
.end method

.method public final ۥ۟ۥ(Landroid/graphics/drawable/Drawable;)V
    .locals 9

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, L۟/s7;->ۥ۟ۤ:Landroid/widget/ImageView;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    sub-int/2addr v1, v2

    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    sub-int/2addr v1, v0

    .line 20
    int-to-float v0, v1

    .line 21
    iget-object v1, p0, L۟/s7;->ۥ۟ۤ:Landroid/widget/ImageView;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    sub-int/2addr v2, v3

    .line 32
    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    sub-int/2addr v2, v1

    .line 37
    int-to-float v1, v2

    .line 38
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    iget-object v3, p0, L۟/s7;->ۥ۟ۧ:Landroid/graphics/Matrix;

    .line 47
    .line 48
    invoke-virtual {v3}, Landroid/graphics/Matrix;->reset()V

    .line 49
    .line 50
    .line 51
    int-to-float v2, v2

    .line 52
    div-float v3, v0, v2

    .line 53
    .line 54
    int-to-float p1, p1

    .line 55
    div-float v4, v1, p1

    .line 56
    .line 57
    iget-object v5, p0, L۟/s7;->ۥ۠ۨ:Landroid/widget/ImageView$ScaleType;

    .line 58
    .line 59
    sget-object v6, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    .line 60
    .line 61
    const/high16 v7, 0x40000000    # 2.0f

    .line 62
    .line 63
    const/4 v8, 0x0

    .line 64
    if-ne v5, v6, :cond_1

    .line 65
    .line 66
    iget-object v3, p0, L۟/s7;->ۥ۟ۧ:Landroid/graphics/Matrix;

    .line 67
    .line 68
    sub-float/2addr v0, v2

    .line 69
    div-float/2addr v0, v7

    .line 70
    sub-float/2addr v1, p1

    .line 71
    div-float/2addr v1, v7

    .line 72
    invoke-virtual {v3, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_1
    sget-object v6, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 77
    .line 78
    if-ne v5, v6, :cond_2

    .line 79
    .line 80
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    goto :goto_0

    .line 85
    :cond_2
    sget-object v6, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    .line 86
    .line 87
    if-ne v5, v6, :cond_3

    .line 88
    .line 89
    const/high16 v5, 0x3f800000    # 1.0f

    .line 90
    .line 91
    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    invoke-static {v5, v3}, Ljava/lang/Math;->min(FF)F

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    :goto_0
    iget-object v4, p0, L۟/s7;->ۥ۟ۧ:Landroid/graphics/Matrix;

    .line 100
    .line 101
    invoke-virtual {v4, v3, v3}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 102
    .line 103
    .line 104
    iget-object v4, p0, L۟/s7;->ۥ۟ۧ:Landroid/graphics/Matrix;

    .line 105
    .line 106
    mul-float/2addr v2, v3

    .line 107
    sub-float/2addr v0, v2

    .line 108
    div-float/2addr v0, v7

    .line 109
    mul-float/2addr p1, v3

    .line 110
    sub-float/2addr v1, p1

    .line 111
    div-float/2addr v1, v7

    .line 112
    invoke-virtual {v4, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_3
    new-instance v3, Landroid/graphics/RectF;

    .line 117
    .line 118
    invoke-direct {v3, v8, v8, v2, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 119
    .line 120
    .line 121
    new-instance v4, Landroid/graphics/RectF;

    .line 122
    .line 123
    invoke-direct {v4, v8, v8, v0, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 124
    .line 125
    .line 126
    float-to-int v0, v8

    .line 127
    rem-int/lit16 v0, v0, 0xb4

    .line 128
    .line 129
    if-eqz v0, :cond_4

    .line 130
    .line 131
    new-instance v3, Landroid/graphics/RectF;

    .line 132
    .line 133
    invoke-direct {v3, v8, v8, p1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 134
    .line 135
    .line 136
    :cond_4
    sget-object p1, L۟/s7$d;->ۥ:[I

    .line 137
    .line 138
    iget-object v0, p0, L۟/s7;->ۥ۠ۨ:Landroid/widget/ImageView$ScaleType;

    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    aget p1, p1, v0

    .line 145
    .line 146
    const/4 v0, 0x1

    .line 147
    if-eq p1, v0, :cond_8

    .line 148
    .line 149
    const/4 v0, 0x2

    .line 150
    if-eq p1, v0, :cond_7

    .line 151
    .line 152
    const/4 v0, 0x3

    .line 153
    if-eq p1, v0, :cond_6

    .line 154
    .line 155
    const/4 v0, 0x4

    .line 156
    if-eq p1, v0, :cond_5

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_5
    iget-object p1, p0, L۟/s7;->ۥ۟ۧ:Landroid/graphics/Matrix;

    .line 160
    .line 161
    sget-object v0, Landroid/graphics/Matrix$ScaleToFit;->FILL:Landroid/graphics/Matrix$ScaleToFit;

    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_6
    iget-object p1, p0, L۟/s7;->ۥ۟ۧ:Landroid/graphics/Matrix;

    .line 165
    .line 166
    sget-object v0, Landroid/graphics/Matrix$ScaleToFit;->END:Landroid/graphics/Matrix$ScaleToFit;

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_7
    iget-object p1, p0, L۟/s7;->ۥ۟ۧ:Landroid/graphics/Matrix;

    .line 170
    .line 171
    sget-object v0, Landroid/graphics/Matrix$ScaleToFit;->START:Landroid/graphics/Matrix$ScaleToFit;

    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_8
    iget-object p1, p0, L۟/s7;->ۥ۟ۧ:Landroid/graphics/Matrix;

    .line 175
    .line 176
    sget-object v0, Landroid/graphics/Matrix$ScaleToFit;->CENTER:Landroid/graphics/Matrix$ScaleToFit;

    .line 177
    .line 178
    :goto_1
    invoke-virtual {p1, v3, v4, v0}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 179
    .line 180
    .line 181
    :goto_2
    iget-object p1, p0, L۟/s7;->ۥ۠:Landroid/graphics/Matrix;

    .line 182
    .line 183
    invoke-virtual {p1}, Landroid/graphics/Matrix;->reset()V

    .line 184
    .line 185
    .line 186
    iget-object p1, p0, L۟/s7;->ۥ۠:Landroid/graphics/Matrix;

    .line 187
    .line 188
    invoke-virtual {p1, v8}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0}, L۟/s7;->ۥ()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0}, L۟/s7;->ۥ۟ۡ()Landroid/graphics/Matrix;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    iget-object v0, p0, L۟/s7;->ۥ۟ۤ:Landroid/widget/ImageView;

    .line 199
    .line 200
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0}, L۟/s7;->ۥ۟()Z

    .line 204
    .line 205
    .line 206
    return-void
.end method
